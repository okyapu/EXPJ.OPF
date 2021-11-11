CREATE OR REPLACE PROCEDURE      SQLCALCBESTBEFOREFD(
/*------------------------------------------------------------------------------
' author    : Zhaohaikun
' version   : 1.00.00
'
' 修正履歴
' 2006.11.13 初版
'
' 機能      : 賞味期限自動計算
'             (Java呼び出しIF)
'
' 戻り値    : Boolean
'               True :正常終了
'               False:異常終了
'
' 引き数    :
'         -- SYSTEM共通
'             pvc2LogMode                  - (i)ＬＯＧモード
'             pvc2OutputMode               - (i)出力モード
'             pvc2OutputPath               - (i)出力ファイルパス
'             pvc2OutputName               - (i)出力ファイル名
'             pvc2UserId                   - (i)ユーザＩＤ
'             pvc2BusinessName             - (i)業務名
'             pvc2PlantCd                  - (i)工場コード
'         -- 業務固有
'             pvc2ItemCd                   - (i)品目番号
,             pvc2ACPT_PROC_DATE           - (i)生産日期
              pvc2BESTBEFORE               - (o)生産日期
'             pvc2ErrCd                    - (o)エラーコード
'             pnumStatus                   - (o)結果ステータス(1:正常終了、2:警告終了、3:異常終了)
'
' 機能説明  : 自動採番処理。
'
' 備考      :
'
------------------------------------------------------------------------------*/
    pvc2LogMode                 IN  VARCHAR2            --(i)ＬＯＧモード
   ,pvc2OutputMode              IN  VARCHAR2            --(i)出力モード
   ,pvc2OutputPath              IN  VARCHAR2            --(i)出力ファイルパス
   ,pvc2OutputName              IN  VARCHAR2            --(i)出力ファイル名
   ,pvc2UserId                  IN  VARCHAR2            --(i)ユーザＩＤ
   ,pvc2BusinessName            IN  VARCHAR2            --(i)業務名
   ,pvc2PlantCd                 IN  VARCHAR2            --(i)工場コード
   ,pvc2ItemCd                  IN  VARCHAR2            --(i)品目番号
   ,pvc2ACPT_PROC_DATE          IN  VARCHAR2            --(i)生産日期
   ,pvc2BESTBEFORE              OUT VARCHAR2            --(o)生産日期
   ,pvc2ErrCd                   OUT VARCHAR2            --(o)エラーコード
   ,pnumStatus                  OUT NUMBER              --(o)結果ステータス
)
IS
    -- 定数の宣言
    MY_SQL_NAME                VARCHAR2(32) := 'SQLCALCBESTBEFOREFD';  --ＰＬ／ＳＱＬ名
    vc2MessageId               VARCHAR2(28);       --

    -- 変数の宣言
    UTL_FileHandle         UTL_FILE.FILE_TYPE;            --ファイルハンドル
    blnRet                 BOOLEAN;                       --BOOLEAN型 返却値
    pvc2ErrMsg             VARCHAR2(1023);                --エラーメッセージ作成作業領域
    pvc2ITEM_CD            M_ITEM.ITEM_CD%TYPE;           --変数.品目番号
    numStatus              NUMBER(1);                     --結果ステータス

    -- LOG の宣言
    LOGMSG_START        CONSTANT VARCHAR2(5)   := 'Start';      --ログ用メソッド開始宣言
    LOGMSG_END          CONSTANT VARCHAR2(3)   := 'End';        --ログ用メソッド終了宣言
    LOGMSG_ERR          CONSTANT VARCHAR2(12)  := '異常終了';

    -- 例外の宣言
    excMistakeCommonParam        EXCEPTION;          --パラメータ不正
    excFNCFaild                  EXCEPTION;
    excFncTraceLog               EXCEPTION;    --トレースログ出力エラー

    PROCEDURE ErrorLog IS
    BEGIN
        /* ErrorLog の出力 */
         blnRet := FncErrLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                             pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, pvc2ErrCd, pvc2ErrMsg);
    END;

    PROCEDURE TraceLog(vc2Trace VARCHAR2) IS
    BEGIN
        /* TraceLog の出力 */
         blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                               pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, vc2Trace);
    END;

BEGIN
/*-------------------------------------
  PLSQL初期化
-------------------------------------*/
    pnumStatus      := 3;          -- 異常終了

    /* LogFile の OPEN */
    blnRet := FNCLOGOPEN(pvc2OutputPath, pvc2OutputName, pvc2PlantCd, pvc2OutputMode, UTL_FileHandle);
    /* TraceLog の出力 */
    TraceLog(LOGMSG_START);

 -- 共通の入力パラメータのチェック
    IF pvc2LogMode IS NULL THEN             -- ＬＯＧモードがＮＵＬＬ
        pvc2ErrMsg := SUBSTRB('(SBM0733)パラメータＬＯＧモードが未入力または不正です。',1,1023);
        RAISE excMistakeCommonParam;
    END IF;

    IF pvc2OutputMode IS NULL THEN          -- 出力モードがＮＵＬＬ
        pvc2ErrMsg := SUBSTRB('(SBM0734)パラメータ出力モードが未入力または不正です。',1,1023);
        RAISE excMistakeCommonParam;
    END IF;

    IF pvc2OutputPath IS NULL THEN          -- 出力ファイルパスがＮＵＬＬ
        pvc2ErrMsg := SUBSTRB('(SBM0735)パラメータ出力ファイルパスが未入力または不正です。', 1, 1023);
        RAISE excMistakeCommonParam;
    END IF;

    IF pvc2OutputName IS NULL THEN          -- 出力ファイル名がＮＵＬＬ
        pvc2ErrMsg := SUBSTRB('(SBM0736)パラメータ出力ファイル名が未入力または不正です。', 1, 1023);
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

      /*賞味期限処理 */
    blnRet := FNCCALCBESTBEFOREFD(
                UTL_FileHandle              --ファイルハンドル
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

    IF blnRet=FALSE THEN
        pvc2ErrMsg := SUBSTR('(SBM0742)賞味期限取得にエラーが発生しました。',1,1023);
        pvc2ErrCd  := vc2MessageId;
        RAISE excFNCFaild;
    END IF
    ;

/*--------------------------------------
  PLSQL正常終了
--------------------------------------*/

    /* 結果ステータスのセット */
    pnumStatus := numStatus;       --正常終了
    pvc2ErrCd  := vc2MessageId;

    /* TraceLog の出力 */
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    /* LogFile の CLOSE */
    blnRet := FNCLOGCLOSE(UTL_FileHandle);
    IF blnRet=FALSE THEN
        RAISE excFncTraceLog;
    END IF;


--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN excMistakeCommonParam THEN
        pnumStatus := 3;  --異常終了
        pvc2ErrCd  := 'AE22060';

        /* ErrorLog の出力 */
        ErrorLog;

        /* TraceLog の出力 */
        TraceLog('(SBM0732)'|| LOGMSG_END || LOGMSG_ERR);

        /* LogFile の CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

    WHEN excFNCFaild THEN
        pnumStatus := 3;  --異常終了

        /* ErrorLog の出力 */
        ErrorLog;

        /* TraceLog の出力 */
        TraceLog('(SBM0732)'|| LOGMSG_END || LOGMSG_ERR);

        /* LogFile の CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

    WHEN excFncTraceLog THEN
        pnumStatus := 3;  --異常終了


    WHEN OTHERS THEN
        pnumStatus := 3;         --異常終了
        pvc2ErrCd  := 'ZZ99001';

        pvc2ErrMsg := SUBSTRB(pvc2ErrMsg || SQLERRM,1,1023);

        /* ErrorLog の出力 */
        ErrorLog;

        -- TraceLog の出力
        TraceLog('(SBM0732)'|| LOGMSG_END || LOGMSG_ERR);

        /* LogFile の CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);
END;
/
