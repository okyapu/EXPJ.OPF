CREATE OR REPLACE FUNCTION      FNCGETSETLOTNUMBERINGFD(
/*------------------------------------------------------------------------------
' author    : Zhaohaikun
' version   : 1.00.00
'
' 修正履歴
' 2006.11.13 初版
'
' 機能      : 自動採番処理
'
' 戻り値    : Boolean
'               True :正常終了
'               False:異常終了
'
' 引き数    : pFileHandle                  - (i)ファイルハンドル
'             pvc2LogMode                  - (i)ＬＯＧモード
'             pvc2OutputMode               - (i)出力モード
'             pvc2UserId                   - (i)ユーザＩＤ
'             pvc2BusinessName             - (i)業務名
'             pvc2PlantCd                  - (i)工場コード
'         -- 業務固有
'             pvc2ItemCd                   - (i)品目番号
,             pvc2ACPT_PROC_DATE           - (i)生産日期 
'             pnumStatus                   - (o)結果ステータス(1:正常終了、2:警告終了、3:異常終了)
'             pvc2ErrCd                    - (o)エラーコード
'
' 機能説明  : 自動採番処理
'         
' 備考      : 
------------------------------------------------------------------------------*/
    pFileHandle                  IN  UTL_FILE.FILE_TYPE  --ファイルハンドル
   ,pvc2LogMode                  IN  VARCHAR2            --ＬＯＧモード
   ,pvc2OutputMode               IN  VARCHAR2            --出力モード
   ,pvc2UserId                   IN  VARCHAR2            --ユーザＩＤ
   ,pvc2BusinessName             IN  VARCHAR2            --業務名
   ,pvc2PlantCd                  IN  VARCHAR2            --工場コード
   ,pvc2ItemCd                   IN  VARCHAR2            --(i)品目番号
   ,pvc2ACPT_PROC_DATE           IN  VARCHAR2            --(i)生産日期
   ,pvc2LotNo                    OUT VARCHAR2            --(o)在庫ロット番号
   ,pvc2ErrCd                    OUT VARCHAR2            --(o)エラーコード
   ,pnumStatus                   OUT NUMBER              --(o)結果ステータス


)RETURN BOOLEAN-- 戻り値のデータ型
IS
    -- 定数の宣言
    MY_SQL_NAME                VARCHAR2(32) := 'FNCGETSETLOTNUMBERINGFD';  --ＰＬ／ＳＱＬ名

    -- 変数の宣言
    blnRet                 BOOLEAN;                           --BOOLEAN型 返却値
    numStatus              NUMBER(1);                         --結果ステータス
    pvc2ErrMsg             VARCHAR2(1023);                    --エラーメッセージ作成作業領域
    pvc2LOT_CTRL_FLG    M_ITEM.LOT_CTRL_FLG%TYPE;       --変数.ロシト管理フラグ
    pvc2LOT_NUMBERING_TYP  M_ITEM.LOT_NUMBERING_TYP%TYPE;     --変数.ロシト番号採番区分
    pvc2ITEM_CD            M_ITEM.ITEM_CD%TYPE;               --変数.品目番号
    pvc2LotNo_1            T_LOT_CTRL.LOT_NO%TYPE;            --変数.在庫ロット番号
    pvc2BESTBEFORE         VARCHAR2(20);                      --賞味期限    
    vc2MessageId           VARCHAR2(4000);

    -- LOG の宣言
    LOGMSG_START        CONSTANT VARCHAR2(5)   := 'Start';      --ログ用メソッド開始宣言
    LOGMSG_END          CONSTANT VARCHAR2(3)   := 'End';        --ログ用メソッド終了宣言
    LOGMSG_ERR          CONSTANT VARCHAR2(12)  := '異常終了';

    -- 例外の宣言
    excMistakeCommonParam        EXCEPTION;          --パラメータ不正
    excFaild                     EXCEPTION;
    excFncTraceLog               EXCEPTION;          --トレースログ出力エラー

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
        pvc2ErrMsg := SUBSTRB('パラメータＬＯＧモードが未入力または不正です。',1,1023);
        RAISE excMistakeCommonParam;
    END IF;

    IF pvc2OutputMode IS NULL THEN          -- 出力モードがＮＵＬＬ
        pvc2ErrMsg := SUBSTRB('パラメータ出力モードが未入力または不正です。',1,1023);
        RAISE excMistakeCommonParam;
    END IF;
     
    IF pvc2UserId IS NULL THEN              -- ユーザＩＤがＮＵＬＬ
        pvc2ErrMsg := SUBSTRB('パラメータユーザＩＤが未入力または不正です。',1,1023);
        RAISE excMistakeCommonParam;
    END IF;   

    IF pvc2BusinessName IS NULL THEN        -- ＯＰＦＩＤがＮＵＬＬ
        pvc2ErrMsg := SUBSTRB('パラメータ業務名が未入力または不正です。',1,1023);
        RAISE excMistakeCommonParam;
    END IF;

    IF pvc2PlantCd IS NULL THEN      -- 引数．”工場コード”＝NULLの場合
        pvc2ErrMsg  := SUBSTR('工場コードが未入力または不正です。',1,1023);
        
        RAISE excMistakeCommonParam;
    END IF;

    IF pvc2ItemCd IS NULL THEN    -- 引数．”品目番号”＝NULLの場合
	pvc2ErrMsg  := SUBSTR('品目番号が未入力または不正です。',1,1023);
        RAISE excMistakeCommonParam;
    END IF;
    IF pvc2ACPT_PROC_DATE IS NULL THEN    -- 引数．”生産日期”＝NULLの場合
	pvc2ErrMsg  := SUBSTR('生産日期が未入力または不正です。',1,1023);
        RAISE excMistakeCommonParam;
    END IF;

    /* ロット採番 */
    blnRet := FNCGETLOTNUMBERINGFD(
                pFileHandle                 --ファイルハンドル 
               ,pvc2LogMode                 --ＬＯＧモード
               ,pvc2OutputMode              --出力モード
               ,pvc2UserId                  --ユーザＩＤ
               ,pvc2BusinessName            --業務名
               ,pvc2PlantCd                 --工場コード
               ,pvc2ItemCd
               ,pvc2LotNo                   --入出庫管理番号
               ,vc2MessageId                --エラーメッセージID
               ,numStatus                   --結果ステータス（1：正常終了 2:警告終了 3：異常終了）
              );
    IF blnRet=FALSE THEN
        pvc2ErrMsg := SUBSTR('ロット自動採番にエラーが発生しました。',1,1023);
        pvc2ErrCd  := vc2MessageId;
        RAISE excFaild;
    END IF;
     /*賞味期限処理 */
    blnRet := FNCCALCBESTBEFOREFD(
                pFileHandle                 --ファイルハンドル 
               ,pvc2LogMode                 --ＬＯＧモード
               ,pvc2OutputMode              --出力モード
               ,pvc2UserId                  --ユーザＩＤ
               ,pvc2BusinessName            --業務名
               ,pvc2PlantCd                 --工場コード
               ,pvc2ItemCd                  --品目番号
               ,pvc2ACPT_PROC_DATE          --生産日付/受入日付
               ,pvc2BESTBEFORE              --賞味期限
               ,vc2MessageId                --エラーメッセージID
               ,numStatus                   --結果ステータス（1：正常終了 2:警告終了 3：異常終了）
              );
    IF pvc2BESTBEFORE = '0' THEN
        pvc2BESTBEFORE := NULL;
    END IF;
    IF blnRet=FALSE THEN
        pvc2ErrMsg := SUBSTR('賞味期限取得にエラーが発生しました。',1,1023);
        pvc2ErrCd  := vc2MessageId;
        RAISE excFaild;
    END IF;
/*--------------------------------------
  ロット管理登録処理
--------------------------------------*/
    BEGIN
        SELECT LOT_NO INTO pvc2LotNo_1
          FROM T_LOT_CTRL
         WHERE LOT_NO = pvc2LotNo
           AND ITEM_CD= pvc2ItemCd;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
        BEGIN
            INSERT INTO T_LOT_CTRL(LOT_NO,
                                   ITEM_CD,
                                   PRD_CMPLT_DATE,
                                   BEST_BEFORE_DATE,
                                   DEL_FLG, 
                                   CREATED_DATE,
                                   CREATED_BY,
                                   CREATED_PRG_NM,
                               	   UPDATED_DATE,
                                   UPDATED_BY,
                                   UPDATED_PRG_NM,
                                   MODIFY_COUNT)
            VALUES(pvc2LotNo,
                   pvc2ItemCd,
                   TO_DATE(pvc2ACPT_PROC_DATE,'YYYY/MM/DD'),
                   TO_DATE(pvc2BESTBEFORE,'YYYY/MM/DD'),
                   1,
                   SYSDATE,
                   pvc2UserId,
                   pvc2BusinessName,
                   SYSDATE,
                   pvc2UserId,
                   pvc2BusinessName,
                   0);
            EXCEPTION
        WHEN OTHERS THEN
            pvc2ErrMsg := SUBSTR('ロット管理' || ' ユーザコー ' || pvc2UserId || ' 登録エラー',1,1023);
            pvc2ErrCd  := 'AE22059';
            RAISE;
        END;
    END;    
/*--------------------------------------
  PLSQL正常終了
--------------------------------------*/
    pvc2ErrCd  := vc2MessageId;
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
        pvc2ErrCd       := 'AE22058';
        RETURN FALSE;
    
    WHEN excFaild THEN
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
