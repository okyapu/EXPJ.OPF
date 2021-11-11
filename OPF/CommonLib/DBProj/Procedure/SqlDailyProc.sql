CREATE OR REPLACE PROCEDURE SQLDAILYPROC(
/*------------------------------------------------------------------------------
'
' version   : 1.00.00
'
' 修正履歴
' 2003.08.06 初版
' 2003.09.21 DBMS_OUTPUTのコメント化
' 2003.10.01 全工場対応用、開始終了メッセージに工場コード出力
' 2003.12.09 発注点漏れ品目一覧 存在チェック(V_ODR_POINT_OUT_ITEM2)の条件修正
' 2005.10.21 unicode対応（varchar2を4倍）
'
' 機能      : 日次処理
'
' 引き数    : 
'             pvc2LogMode                - (i)ＬＯＧモード
'             pvc2OutputMode             - (i)出力モード
'             pvc2OutputPath             - (i)出力ファイルパス
'             pvc2OutputName             - (i)出力ファイル名
'             pvc2UserId                 - (i)ユーザＩＤ
'             pvc2BusinessName           - (i)業務名
'             pvc2PlantCd                - (i)工場コード
'             pvc2FinalDailyProcExecDate - (i)日次処理対象日
'             pvc2BusinessOprDate        - (i)翌業務運用日
'
' 機能説明  : 当日の入出庫の締処理を行い、業務運用日付を翌稼働日に更新する。
'             又、引当不足・発注点漏れチェックを行いアラームを出力する。
'
' 備考      :
'
------------------------------------------------------------------------------*/
    pvc2LogMode                 IN  VARCHAR2    --ＬＯＧモード
   ,pvc2OutputMode              IN  VARCHAR2    --出力モード
   ,pvc2OutputPath              IN  VARCHAR2    --出力ファイルパス
   ,pvc2OutputName              IN  VARCHAR2    --出力ファイル名
   ,pvc2UserId                  IN  VARCHAR2    --ユーザＩＤ
   ,pvc2BusinessName            IN  VARCHAR2    --業務名
   ,pvc2PlantCd                 IN  VARCHAR2    --工場コード
   ,pvc2FinalDailyProcExecDate  IN  VARCHAR2    --日次処理対象日
   ,pvc2BusinessOprDate         IN  VARCHAR2    --翌業務運用日
)
IS


/* カーソルの宣言 */

/* ROWTYPE の宣言 */

/* 定数の宣言 */
    MY_SQL_NAME                         VARCHAR2(48)  := 'SQLDAILYPROC';
    ISSUERSV_NOTRELEASED                NUMBER(1)     := 1;         --出庫保留テーブル 出庫保留解除区分(1:未解除 保留中)
    INV_FLG_NOEXECUTE                   NUMBER(1)     := 0;         --棚卸制御 棚卸フラグ(0:非)
    INV_FLG_EXECUTE                     NUMBER(1)     := 1;         --棚卸制御 棚卸フラグ(1:棚卸中)
    CTRL_CD_DEFAULT                     VARCHAR2(24)   := 'SYSTEM';  --コントロール系テーブルのPrimaryKeyの値

/* EXCEPTION の宣言 */
    excFNC_INSPEC_ACPT_IF_ERR           EXCEPTION;                  --「検収情報I/F」エラー

/* MESSAGE の宣言 */
    APS_COM_BATCH_START                 VARCHAR2(28)     := 'ZZ09001';     --バッチ処理を開始しました
    APS_COM_BATCH_END                   VARCHAR2(28)     := 'ZZ09002';     --バッチ処理を終了しました
    APS_CEDAILYPROCALARM_EXT_ALM        VARCHAR2(28)     := 'AK51921';     --日次処理でアラームが出力されました

/* LOG の宣言 */
    LOGMSG_START_PGNM_DAILYPROC         VARCHAR2(72)  := '<< 日次処理開始 >>';
    LOGMSG_END_PGNM_DAILYPROC           VARCHAR2(72)  := '<< 日次処理終了 >>';
    LOGMSG_START                        VARCHAR2(20)   := 'Start';   --ログ用メソッド開始宣言
    LOGMSG_END                          VARCHAR2(12)   := 'End';     --ログ用メソッド終了宣言
    LOGMSG_FINALDAILYPROCEXECDATE       VARCHAR2(64)  := '日次処理対象日：';
    LOGMSG_BUSINESSOPRDATE              VARCHAR2(56)  := '翌業務運用日：';
    LOGMSG_BRAKETS                      VARCHAR2(4)   := '[';
    LOGMSG_BRAKETE                      VARCHAR2(4)   := ']';
    LOGMSG_UNALCDODLST                  VARCHAR2(272)  := '(SBM0346)『引当不足データが存在します。必要に応じて引当処理を行って下さい。』';
    LOGMSG_ODRPTOUTITEMLST              VARCHAR2(384)  := '(SBM0347)『発注点割れ品目が存在します。発注点割れ品目一覧で確認し、必要に応じて発注処理を行って下さい。』';
    LOGMSG_ERR                          VARCHAR2(32)   := '異常終了';
    LOGMSG_PLANT_CD                     VARCHAR2(48)  := '工場コード：';

/* 変数の宣言 SQL */
    lngCount                NUMBER;         --件数カウント用
    numInvFlg               NUMBER(1);      --制御フラグ
    vc2CTRL_CD              VARCHAR2(100);   --ＳＹＳコントロールコード

/* 変数の宣言 WORK */
    UTL_FileHandle          UTL_FILE.FILE_TYPE; --ファイルハンドル
    vc2Comment              VARCHAR2(1024);      --メッセージ用コメント作成作業領域
    vc2RunChkComment        VARCHAR2(1024);      --実行位置確認用コメント作成作業領域
    NumTransactionCount     NUMBER(10);         --処理件数
    blnRet                  BOOLEAN;            --返却値

BEGIN

--DBMS_OUTPUT.ENABLE(1000000);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 開始 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
vc2RunChkComment := NULL;

    /* LogFile の OPEN */
    blnRet := FncLogOpen(pvc2OutputPath, pvc2OutputName, pvc2PlantCd, pvc2OutputMode, UTL_FileHandle);

    /* TraceLog の出力 */
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

    /* 開始メッセージの作成 */
    vc2Comment := SUBSTR('(SBM0345)' || LOGMSG_START_PGNM_DAILYPROC ||
                         LOGMSG_PLANT_CD || '[ ' || pvc2PlantCd || ' ]',
                         1,256);

    /* 開始メッセージの出力 */
    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                        pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                        MY_SQL_NAME, APS_COM_BATCH_START, vc2Comment);
    COMMIT;

--vc2RunChkComment := '●●●●通過 00010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    /* 保管区別品目在庫.品目別前日末在庫数 の更新 */
    UPDATE T_ITEM_STOCK SET
            PRVS_DAYEND_STOCK_QTY = STOCK_ON_HAND_QTY   --品目別手持在庫数 を設定
           ,UPDATED_DATE = SYSDATE                        --更新日
           ,UPDATED_BY = pvc2UserId                       --更新者
           ,UPDATED_PRG_NM = MY_SQL_NAME                  --更新プログラム名
           ,MODIFY_COUNT = (MODIFY_COUNT + 1)             --更新数
        WHERE PRVS_DAYEND_STOCK_QTY <> STOCK_ON_HAND_QTY
          AND PLANT_CD = pvc2PlantCd;

--vc2RunChkComment := '●●●●通過 00020';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    /* 保管区別製番在庫.製番別前日末在庫数 の更新 */
    UPDATE T_JOB_ODR_CD_STOCK SET
            PRVS_DAYEND_STOCK_QTY = STOCK_ON_HAND_QTY   --製番別手持在庫数 を設定
           ,UPDATED_DATE = SYSDATE                        --更新日
           ,UPDATED_BY = pvc2UserId                       --更新者
           ,UPDATED_PRG_NM = MY_SQL_NAME                  --更新プログラム名
           ,MODIFY_COUNT = (MODIFY_COUNT + 1)             --更新数
        WHERE PRVS_DAYEND_STOCK_QTY <> STOCK_ON_HAND_QTY
          AND PLANT_CD = pvc2PlantCd;

--vc2RunChkComment := '●●●●通過 00030';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--vc2RunChkComment := '●●●●通過 00040';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--vc2RunChkComment := '●●●●通過 00050';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    /* 引当不足一覧 存在チェック */

    SELECT COUNT(*) INTO lngCount FROM V_UNALCD_OD_LST
        WHERE PLANT_CD = pvc2PlantCd;
    /* データ有り */
    IF lngCount > 0 THEN
--vc2RunChkComment := '●●●●通過 00060';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
        /* アラームメッセージの出力 */
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, APS_CEDAILYPROCALARM_EXT_ALM, LOGMSG_UNALCDODLST);

    END IF;

--vc2RunChkComment := '●●●●通過 00070';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    /* 発注点漏れ品目一覧 存在チェック 2001.07.03チェックするビューを変更 */
/* 20031209 PLANT_CD の条件変更 */
--  SELECT COUNT(*) INTO lngCount FROM V_ODR_POINT_OUT_ITEM2
--      WHERE OD_PLANT_CD = pvc2PlantCd;
    SELECT COUNT(*) INTO lngCount FROM V_ODR_POINT_OUT_ITEM2
        WHERE ( ITEM_PLANT_CD = pvc2PlantCd and OD_PLANT_CD = pvc2PlantCd )
           OR ( ITEM_PLANT_CD = pvc2PlantCd and OD_PLANT_CD is null )
           OR ( ITEM_PLANT_CD is null and OD_PLANT_CD = pvc2PlantCd )
           OR ( ITEM_PLANT_CD is null and OD_PLANT_CD is null);
    /* データ有り */
    IF lngCount > 0 THEN
--vc2RunChkComment := '●●●●通過 00080';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
        /* アラームメッセージの出力 */
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, APS_CEDAILYPROCALARM_EXT_ALM, LOGMSG_ODRPTOUTITEMLST);
    END IF;

--vc2RunChkComment := '●●●●通過 00090';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--vc2RunChkComment := '●●●●通過 00100';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    /* 日付制御.業務運用日・日付制御.計上日に翌業務運用日を設定 */
    UPDATE SYS_DATE_CTRL SET
            BUSINESS_OPR_DATE = TO_DATE(pvc2BusinessOprDate || ' 00:00:00', 'yyyy/mm/dd hh24:mi:ss')
           ,STOCK_CRITERION_DATE = TO_DATE(pvc2BusinessOprDate || ' 00:00:00', 'yyyy/mm/dd hh24:mi:ss')
           ,UPDATED_DATE = SYSDATE                        --更新日
           ,UPDATED_BY = pvc2UserId                       --更新者
           ,UPDATED_PRG_NM = MY_SQL_NAME                  --更新プログラム名
           ,MODIFY_COUNT = (MODIFY_COUNT + 1)             --更新数
        WHERE PLANT_CD = pvc2PlantCd;

--vc2RunChkComment := '●●●●通過 00110';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--vc2RunChkComment := '●●●●通過 00140';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    /* 日次処理制御 の存在チェック */
    SELECT PLANT_CD INTO vc2CTRL_CD FROM SYS_DAILY_PROC_CTRL WHERE PLANT_CD = pvc2PlantCd;

--vc2RunChkComment := '●●●●通過 00150';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    /* 日次処理制御.最終日次処理実行日に日次処理対象日を設定 */
    UPDATE SYS_DAILY_PROC_CTRL SET
            FINAL_DAILY_PROC_EXEC_DATE = TO_DATE(pvc2FinalDailyProcExecDate || ' 00:00:00', 'yyyy/mm/dd hh24:mi:ss')
           ,UPDATED_DATE = SYSDATE                        --更新日
           ,UPDATED_BY = pvc2UserId                       --更新者
           ,UPDATED_PRG_NM = MY_SQL_NAME                  --更新プログラム名
           ,MODIFY_COUNT = (MODIFY_COUNT + 1)             --更新数
        WHERE PLANT_CD = pvc2PlantCd;

    COMMIT;

    /* 終了メッセージの作成 */
    vc2Comment := SUBSTR('(SBM0348)' || LOGMSG_END_PGNM_DAILYPROC ||
                         LOGMSG_BUSINESSOPRDATE || '[ ' || pvc2BusinessOprDate || ' ]' ||
                         LOGMSG_FINALDAILYPROCEXECDATE || '[ ' || pvc2FinalDailyProcExecDate || ' ]',
                         1,256);

    /* 終了メッセージの出力 */
    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                        pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                        MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);
    COMMIT;

    /* TraceLog の出力 */
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    /* LogFile の CLOSE */
    blnRet := FncLogClose(UTL_FileHandle);

--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 終了 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));



--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN excFNC_INSPEC_ACPT_IF_ERR  THEN         --「検収情報I/F」エラー
--DBMS_OUTPUT.PUT_LINE('excFNC_INSPEC_ACPT_IF_ERR');
        ROLLBACK;
        /* 終了メッセージの作成 */
        vc2Comment := SUBSTR('(SBM0349)' || LOGMSG_END_PGNM_DAILYPROC || LOGMSG_ERR || '：検収情報I/F',
                             1,256);
        /* 終了メッセージの出力 */
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;

    WHEN OTHERS THEN                             --その他のエラー
--DBMS_OUTPUT.PUT_LINE('excOTHERS');
        ROLLBACK;
        /* 終了メッセージの作成 */
        vc2Comment := SUBSTR('(SBM0350)' || LOGMSG_END_PGNM_DAILYPROC || LOGMSG_ERR || '：' ||
                             SQLCODE || ',' || SUBSTR(SQLERRM,1,256),
                             1,256);
        /* 終了メッセージの出力 */
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);
        /* TraceLog の出力（実行位置） */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END || vc2RunChkComment);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
END;
/