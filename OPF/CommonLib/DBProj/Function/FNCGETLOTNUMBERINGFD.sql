CREATE OR REPLACE FUNCTION FNCGETLOTNUMBERINGFD(
/*------------------------------------------------------------------------------
' author    : Zhaohaikun
' version   : 1.00.00
'
' 修正履歴
' 2006.11.13 初版
'
' 機能      : 在庫ロット番号採番
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
              pvc2LotNo            - (o)在庫ロット
'             pvc2ErrCd            - (o)エラーコード
'             pnumStatus           - (o)結果ステータス(1:正常終了、2:警告終了、3:異常終了)
'
' 機能説明  : 在庫ロット番号の採番を行う。
'           : 自動連番採番場合シーケンスより採番、日毎自動採番場合業務日付(YYYYMMDD)
'
' 備考      : ロットトレース管理しない品目番号場合異常終了
'           : 在庫ロット番号費ロットトレース管理しな品目番号場合異常終了
'
------------------------------------------------------------------------------*/
    pFileHandle         IN  UTL_FILE.FILE_TYPE  --ファイルハンドル
   ,pvc2LogMode         IN  VARCHAR2            --ＬＯＧモード
   ,pvc2OutputMode      IN  VARCHAR2            --出力モード
   ,pvc2UserId          IN  VARCHAR2            --ユーザＩＤ
   ,pvc2BusinessName    IN  VARCHAR2            --業務名
   ,pvc2PlantCd         IN  VARCHAR2            --工場コード
   ,pvc2ItemCd          IN  VARCHAR2            --(i)品目番号
   ,pvc2LotNo           OUT VARCHAR2            --(o)在庫ロット
   ,pvc2ErrCd           OUT VARCHAR2            --(o)エラーコード
   ,pnumStatus          OUT NUMBER              --(o)結果ステータス
) RETURN BOOLEAN
IS

    -- 定数の宣言
    MY_SQL_NAME            VARCHAR2(32) := 'FNCGETLOTNUMBERINGFD';  --ＰＬ／ＳＱＬ名

    -- 変数の宣言
    UTL_FileHandle         UTL_FILE.FILE_TYPE;            --ファイルハンドル
    blnRet                 BOOLEAN;                       --BOOLEAN型 返却値
    pvc2ErrMsg             VARCHAR2(1023);                --エラーメッセージ作成作業領域
    pvc2LOT_CTRL_FLG    M_ITEM.LOT_CTRL_FLG%TYPE;   --変数.ロシト管理フラグ
    pvc2LOT_NUMBERING_TYP  M_ITEM.LOT_NUMBERING_TYP%TYPE; --変数.ロシト番号採番区分
    pvc2ITEM_CD            M_ITEM.ITEM_CD%TYPE;           --変数.品目番号
    pvc2Sysdate            VARCHAR2(8);                   --変数.システム日付

    -- LOG の宣言
    LOGMSG_START           CONSTANT VARCHAR2(5)   := 'Start';      --ログ用メソッド開始宣言
    LOGMSG_END             CONSTANT VARCHAR2(3)   := 'End';        --ログ用メソッド終了宣言
    LOGMSG_ERR             CONSTANT VARCHAR2(12)  := '異常終了';

    -- 例外の宣言
    excMistakeCommonParam  EXCEPTION;          --パラメータ不正
    excLotFaild            EXCEPTION;
    excFncTraceLog         EXCEPTION;    --トレースログ出力エラー

-- カーソルの宣言
    CURSOR curSYS_RCV_ISSUE_CTRL_CD_CTRL IS
    SELECT  RCV_ISSUE_CTRL_CD
    FROM    SYS_RCV_ISSUE_CTRL_CD_CTRL
    WHERE   PLANT_CD = pvc2PlantCd
    FOR UPDATE;

-- ROWTYPE の宣言
    RtpSYS_RCV_ISSUE_CTRL_CD_CTRL     curSYS_RCV_ISSUE_CTRL_CD_CTRL%ROWTYPE;

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
        pvc2ErrMsg := SUBSTR('(SBM0739)工場コードが未入力または不正です。',1,1023);

        RAISE excMistakeCommonParam;
    END IF;

    IF pvc2ItemCd IS NULL THEN    -- 引数．”品目番号”＝NULLの場合
  pvc2ErrMsg := SUBSTR('(SBM0740)品目番号が未入力または不正です。',1,1023);
        RAISE excMistakeCommonParam;
    END IF;

/*------------------------------------------------------------------------
              品目番号　ロット管理判断
---------------------------------------------------------------------------*/
    BEGIN
        SELECT ITEM_CD, LOT_CTRL_FLG, LOT_NUMBERING_TYP
          INTO pvc2ITEM_CD, pvc2LOT_CTRL_FLG, pvc2LOT_NUMBERING_TYP
          FROM M_ITEM
         WHERE ITEM_CD  = pvc2ItemCd;
    EXCEPTION
        WHEN NO_DATA_FOUND  THEN
            pvc2ErrMsg := SUBSTR('(SBM0820)指定した品目未登録です。',1,1023);
            pvc2ErrCd  := 'AE22052';
            RAISE excLotFaild;
    END;
    IF pvc2LOT_CTRL_FLG = 0 THEN
        pvc2ErrMsg := SUBSTR('(SBM0821)指定した品目は非ロット管理品目です。',1,1023);
        pvc2ErrCd  := 'AE22053';
        RAISE excLotFaild;
    END IF;
    IF  pvc2LOT_CTRL_FLG = 1 AND pvc2LOT_NUMBERING_TYP = 0 THEN
        pvc2ErrMsg := SUBSTR('(SBM0822)指定した品目の在庫ロット番号は手動で採番してください。',1,1023);
        pvc2ErrCd  := 'AE22054';
        RAISE excLotFaild;
    END IF;

    IF pvc2LOT_CTRL_FLG = 1 AND pvc2LOT_NUMBERING_TYP = 1 THEN
        BEGIN
            SELECT  LPAD(to_char(SEQ_JF_LOT_NO.nextval),12,0) INTO pvc2LotNo FROM DUAL;
        EXCEPTION
            WHEN OTHERS THEN
                RAISE;
        END;
    END IF;

    IF pvc2LOT_CTRL_FLG = 1 AND pvc2LOT_NUMBERING_TYP = 2 THEN
        BEGIN
            SELECT to_char(BUSINESS_OPR_DATE,'YYYYMMDD')
              INTO pvc2LotNo
              FROM SYS_DATE_CTRL
             WHERE PLANT_CD = pvc2PlantCd;
        EXCEPTION
            WHEN NO_DATA_FOUND THEN
                pvc2ErrMsg := SUBSTR('(SBM0823)指定した工場の業務運用日は設定されていません。',1,1023);
                pvc2ErrCd  := 'AE22055';
                RAISE excLotFaild;
        END;
    END IF;

    IF pvc2LOT_CTRL_FLG = 1 AND pvc2LOT_NUMBERING_TYP = 3 THEN
        BEGIN
            SELECT to_char(BUSINESS_OPR_DATE,'YYYYMMDD')
              INTO pvc2Sysdate
              FROM SYS_DATE_CTRL
             WHERE PLANT_CD = pvc2PlantCd;
        EXCEPTION
            WHEN NO_DATA_FOUND THEN
                pvc2ErrMsg := SUBSTR('(SBM0823)指定した工場の業務運用日は設定されていません。',1,1023);
                pvc2ErrCd  := 'AE22055';
                RAISE excLotFaild;
        END;
        BEGIN
            SELECT NVL(MAX(LOT_NO)+1,pvc2Sysdate || '0000001')
              INTO pvc2LotNo
              FROM T_LOT_CTRL
             where ITEM_CD = pvc2ItemCd
              and LOT_NO like  pvc2Sysdate||'%';
        END;

    END IF;

/*--------------------------------------
  PLSQL正常終了
--------------------------------------*/

    pnumStatus := 1;             --正常終了
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
        pvc2ErrCd       := 'AE22051';
        RETURN FALSE;

    WHEN excLotFaild THEN
        pnumStatus      := 3;  --異常終了

        /* ErrorLog の出力 */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, pvc2ErrCd, pvc2ErrMsg);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        RETURN FALSE;
    WHEN excFncTraceLog THEN
        pnumStatus      := 3;  --異常終了

        RETURN FALSE;

    WHEN OTHERS THEN
        pnumStatus      := 3;         --異常終了
        pvc2ErrCd       := 'ZZ99001';

        /* ErrorLog の出力 */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, pvc2ErrCd, pvc2ErrMsg);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);

        RETURN FALSE;

END;
/
