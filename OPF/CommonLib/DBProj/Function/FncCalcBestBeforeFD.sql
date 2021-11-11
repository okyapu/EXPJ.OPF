CREATE OR REPLACE FUNCTION FNCCALCBESTBEFOREFD(
/*------------------------------------------------------------------------------
' author    : Zhaohaikun
' version   : 1.00.00
'
' 修正履歴
' 2006.11.13 初版
'
' 機能      : 賞味期限自動計算
'
' 戻り値    : Boolean
'               True :正常終了
'               False:異常終了
'
' 引き数    : pFileHandle          - (i)ファイルハンドル
'             pvc2LogMode          - (i)ＬＯＧモード
'             pvc2OutputMode       - (i)出力モード
'             pvc2UserId           - (i)ユーザＩＤ
'             pvc2BusinessName     - (i)業務名
'             pvc2PlantCd          - (i)工場コード
'         -- 業務固有
'             pvc2ItemCd           - (i)品目番号
,             pvc2ACPT_PROC_DATE   - (i)生産日期
              pvc2BESTBEFORE       - (o)賞味期限
'             pvc2ErrCd            - (o)エラーコード
'             pnumStatus           - (o)結果ステータス(1:正常終了、2:警告終了、3:異常終了)
'
' 機能説明  : 賞味期限自動計算
'
'
' 備考      :
'           :
'
------------------------------------------------------------------------------*/
    pFileHandle         IN  UTL_FILE.FILE_TYPE  --ファイルハンドル
   ,pvc2LogMode         IN  VARCHAR2            --ＬＯＧモード
   ,pvc2OutputMode      IN  VARCHAR2            --出力モード
   ,pvc2UserId          IN  VARCHAR2            --ユーザＩＤ
   ,pvc2BusinessName    IN  VARCHAR2            --業務名
   ,pvc2PlantCd         IN  VARCHAR2            --工場コード
   ,pvc2ItemCd          IN  VARCHAR2            --(i)品目番号
   ,pvc2ACPT_PROC_DATE  IN  VARCHAR2            --(i)生産日期
   ,pvc2BESTBEFORE      OUT VARCHAR2            --(o)生産日期
   ,pvc2ErrCd           OUT VARCHAR2            --(o)エラーコード
   ,pnumStatus          OUT NUMBER              --(o)結果ステータス
) RETURN BOOLEAN
IS

    -- 定数の宣言
    MY_SQL_NAME            VARCHAR2(32) := 'FNCCALCBESTBEFOREFD';  --ＰＬ／ＳＱＬ名

    -- 変数の宣言
    UTL_FileHandle         UTL_FILE.FILE_TYPE;            --ファイルハンドル
    blnRet                 BOOLEAN;                       --BOOLEAN型 返却値
    pvc2ErrMsg             VARCHAR2(1023);                --エラーメッセージ作成作業領域
    pvc2ITEM_CD            M_ITEM.ITEM_CD%TYPE;           --変数.品目番号
    pnumBEST_BEFORE_YEAR   M_ITEM.BEST_BEFORE_YEAR%TYPE;  --変数.賞味期限年数
    pnumBEST_BEFORE_MONTH  M_ITEM.BEST_BEFORE_MONTH%TYPE; --変数.賞味期限月数
    pnumBEST_BEFORE_DAY    M_ITEM.BEST_BEFORE_DAY%TYPE;   --変数.賞味期限日数
    wnumDataExist1         NUMBER;                        --データが存在フラグ

    -- LOG の宣言
    LOGMSG_START           CONSTANT VARCHAR2(5)   := 'Start';      --ログ用メソッド開始宣言
    LOGMSG_END             CONSTANT VARCHAR2(3)   := 'End';        --ログ用メソッド終了宣言
    LOGMSG_ERR             CONSTANT VARCHAR2(12)  := '異常終了';

    -- 例外の宣言
    excMistakeCommonParam  EXCEPTION;          --パラメータ不正
    excNotFoundItem        EXCEPTION;
    excFncTraceLog         EXCEPTION;    --トレースログ出力エラー

-- カーソルの宣言
    CURSOR curSYS_RCV_ISSUE_CTRL_CD_CTRL IS
    SELECT  RCV_ISSUE_CTRL_CD
    FROM    SYS_RCV_ISSUE_CTRL_CD_CTRL
    WHERE   PLANT_CD = pvc2PlantCd
    FOR UPDATE;



/*エラー用ワーク*/
    vc2TmpMessage           VARCHAR2(1024);       --ＬＯＧメッセージ

BEGIN

    /* TraceLog の出力 */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

    IF blnRet=FALSE THEN
        RAISE excFncTraceLog;
    END IF;

-- 共通の入力パラメータのチェック
    IF pvc2LogMode IS NULL THEN             -- ＬＯＧモードがＮＵＬＬ
        pvc2ErrMsg := SUBSTRB('(SBM0733)パラメータＬＯＧモードが未入力または不正です。',1,1023);
        RAISE excMistakeCommonParam;
    END IF;

    IF pvc2OutputMode IS NULL THEN          -- 出力モードがＮＵＬＬ
        pvc2ErrMsg := SUBSTRB('(SBM0734)パラメータ出力モードが未入力または不正です。',1,1023);
        RAISE excMistakeCommonParam;
    END IF;

    IF pvc2UserId IS NULL THEN              -- ユーザＩＤがＮＵＬＬ
        pvc2ErrMsg := SUBSTRB('(SBM0737)パラメータユーザＩＤが未入力または不正です。',1,1023);
        RAISE excMistakeCommonParam;
    END IF;

    IF pvc2BusinessName IS NULL THEN        -- ＯＰＦＩＤがＮＵＬＬ
        pvc2ErrMsg := SUBSTRB('(SBM0738)パラメータ業務名が未入力または不正です。',1,1023);
        RAISE excMistakeCommonParam;
    END IF;

    IF pvc2PlantCd IS NULL THEN      -- 引数．”工場コード”＝NULLの場合
        pvc2ErrMsg  := SUBSTR('(SBM0739)工場コードが未入力または不正です。',1,1023);

        RAISE excMistakeCommonParam;
    END IF;

    IF pvc2ItemCd IS NULL THEN    -- 引数．”品目番号”＝NULLの場合
	pvc2ErrMsg  := SUBSTR('(SBM0740)品目番号が未入力または不正です。',1,1023);
        RAISE excMistakeCommonParam;
    END IF;
    IF pvc2ACPT_PROC_DATE IS NULL THEN    -- 引数．”生産日期”＝NULLの場合
	pvc2ErrMsg  := SUBSTR('(SBM0741)生産日期が未入力または不正です。',1,1023);
        RAISE excMistakeCommonParam;
    END IF;

    BEGIN
        SELECT ITEM_CD, BEST_BEFORE_YEAR, BEST_BEFORE_MONTH, BEST_BEFORE_DAY
          INTO pvc2ITEM_CD, pnumBEST_BEFORE_YEAR, pnumBEST_BEFORE_MONTH, pnumBEST_BEFORE_DAY
          FROM M_ITEM
         WHERE ITEM_CD = pvc2ItemCd;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            pvc2ErrMsg := SUBSTR('(SBM0820)指定した品目未登録です。',1,1023);
            pvc2ErrCd  := 'AE22057';
            RAISE excNotFoundItem;
    END;


    --//インストール判断
    BEGIN
        SELECT
            COUNT(OPTION_ID)        --システムオプション識別子
        INTO
            wnumDataExist1
        FROM
            SYS_INSTALL_OPTIONS     --インストールオプション
        WHERE
            OPTION_ID = 'JF*'
            AND INSTALL_FLG =1;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            wnumDataExist1:= 0;
    END;


    IF pnumBEST_BEFORE_YEAR = 0 AND pnumBEST_BEFORE_MONTH = 0 AND pnumBEST_BEFORE_DAY = 0 THEN
        IF wnumDataExist1 = 0 THEN
            pvc2BESTBEFORE := '0';
        ELSE
            pvc2BESTBEFORE := '9999/12/31';
        END IF;        
    ELSE
        BEGIN
            SELECT TO_CHAR(ADD_MONTHS(pvc2ACPT_PROC_DATE,pnumBEST_BEFORE_YEAR*12+pnumBEST_BEFORE_MONTH)+pnumBEST_BEFORE_DAY,'YYYY/MM/DD')
              INTO pvc2BESTBEFORE
              FROM DUAL;
        EXCEPTION
              WHEN OTHERS THEN
                  RAISE;
        END;
    END IF;

/*--------------------------------------
  PLSQL正常終了
--------------------------------------*/
    pnumStatus := 1;  -- 正常終了
    blnRet     := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
    RETURN TRUE;

--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN excMistakeCommonParam THEN

        /* ErrorLog の出力 */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, pvc2ErrCd, pvc2ErrMsg);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);


        pnumStatus      := 3;  --異常終了
        pvc2ErrCd       := 'AE22056';
        RETURN FALSE;

    WHEN excNotFoundItem THEN
        /* ErrorLog の出力 */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, pvc2ErrCd, pvc2ErrMsg);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        pnumStatus      := 3;  --異常終了
        RETURN FALSE;

    WHEN excFncTraceLog THEN
        pnumStatus      := 3;  --異常終了
        RETURN FALSE;

    WHEN OTHERS THEN
        /* ErrorLog の出力 */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, pvc2ErrCd, pvc2ErrMsg);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        pnumStatus      := 3;         --異常終了
        pvc2ErrCd       := 'ZZ99001';

        RETURN FALSE;

END;
/
