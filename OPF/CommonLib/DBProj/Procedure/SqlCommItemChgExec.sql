CREATE OR REPLACE PROCEDURE SQLCOMMITEMCHGEXEC(
/*------------------------------------------------------------------------------
'
' version   : 1.00.00
'
' 修正履歴
' 2003.10.16 新規作成
' 2005.10.21 unicode対応（varchar2を4倍）
'
' 機能      : 販売情報取込
'
' 引き数    : pvc2LogMode          - (i)ＬＯＧモード
'             pvc2OutputMode       - (i)出力モード
'             pvc2OutputPath       - (i)出力ファイルパス
'             pvc2OutputName       - (i)出力ファイル名
'             pvc2UserId           - (i)ユーザＩＤ
'             pvc2BusinessName     - (i)業務名
'             pvc2PlantCd          - (i)工場コード
'             pvc2StepFlg          - (i)ステップフラグ
'
' 機能説明  : 販売管理から生産要求情報を取り込み、商品コードから
'             品目番号への変換処理が実行される。
'             （ステップフラグ（引き数）により、処理の振り分け）
'
' 備考      :
'
------------------------------------------------------------------------------*/
    pvc2LogMode            IN  VARCHAR2    --ＬＯＧモード
   ,pvc2OutputMode         IN  VARCHAR2    --出力モード
   ,pvc2OutputPath         IN  VARCHAR2    --出力ファイルパス
   ,pvc2OutputName         IN  VARCHAR2    --出力ファイル名
   ,pvc2UserId             IN  VARCHAR2    --ユーザＩＤ
   ,pvc2BusinessName       IN  VARCHAR2    --業務名
   ,pvc2PlantCd            IN  VARCHAR2       --// 工場コード
   ,pvc2StepFlg            IN  VARCHAR2    --ステップフラグ
)
IS


/* カーソルの宣言 */

/* ROWTYPE の宣言 */

/* 定数の宣言 */
    MY_SQL_NAME                         VARCHAR2(72)  := 'SqlCommitemChgExec';
    PrdReqCtrlPRDREQSTARTDATE           NUMBER(2)     := 1;         --生産要求処理開始日時
    PrdReqCtrlPRDREQENDDATE             NUMBER(2)     := 2;         --生産要求処理終了日時
    PrdReqCtrlITEMCONVSTARTDATE         NUMBER(2)     := 3;         --生産要求作成処理開始日時
    PrdReqCtrlITEMCONVENDDATE           NUMBER(2)     := 4;         --生産要求作成処理終了日時
    PrdReqCtrlMRPDEMANDSTARTDATE        NUMBER(2)     := 5;         --ＭＲＰ品デマンド生成処理開始日時
    PrdReqCtrlMRPDEMANDENDDATE          NUMBER(2)     := 6;         --ＭＲＰ品デマンド生成処理終了日時
    PrdReqCtrlSHIPCONVSTARTDATE         NUMBER(2)     := 7;         --出荷要求作成処理開始日時
    PrdReqCtrlSHIPCONVENDDATE           NUMBER(2)     := 8;         --出荷要求作成処理終了日時
    PrdReqCtrlSTOCKISSUESTARTDATE       NUMBER(2)     := 9;         --在庫出庫処理開始日時
    PrdReqCtrlSTOCKISSUEENDDATE         NUMBER(2)     := 10;        --在庫出庫処理終了日時
    PrdReqCtrlMRPDEMANDSTARTUPDATE      NUMBER(2)     := 11;        --ＭＲＰ品デマンド実績更新開始日時
    PrdReqCtrlMRPDEMANDENDUPDATE        NUMBER(2)     := 12;        --ＭＲＰ品デマンド実績更新終了日時

/* EXCEPTION の宣言 */
    excPARAMETER_ERR                    EXCEPTION;                  --「引数」エラー
    excPROC_RUN_ERR                     EXCEPTION;                  --「他処理起動」エラー
    excPrdReqCtrl_ERR                   EXCEPTION;                  --「生産要求制御」更新エラー

/* MESSAGE の宣言 */
    APS_COM_BATCH_START                 VARCHAR2(28)     := 'ZZ09001';     --バッチ処理を開始しました
    APS_COM_BATCH_END                   VARCHAR2(28)     := 'ZZ09002';     --バッチ処理を終了しました
    APS_COM_ORACLE_ERR                  VARCHAR2(28)     := 'AK53401';     --ＯＲＡＣＬＥ　ＥＲＲＯＲ
    APS_COM_OTHER_ERR                   VARCHAR2(28)     := 'AK53402';     --その他　ＥＲＲＯＲ

/* LOG の宣言 */
    LOGMSG_START_PGNM                   VARCHAR2(120)  := '<< 生産要求作成処理実行開始 >>';
    LOGMSG_END_PGNM                     VARCHAR2(120)  := '<< 生産要求作成処理実行終了 >>';
    LOGMSG_START                        VARCHAR2(20)   := 'Start';       --ログ用メソッド開始宣言
    LOGMSG_END                          VARCHAR2(12)   := 'End';         --ログ用メソッド終了宣言
    LOGMSG_ERR                          VARCHAR2(32)   := '異常終了';
    COMMENT_MSGLOG_COMMITEMSTART        VARCHAR2(104)  := '<< 生産要求作成処理開始 >>';
    COMMENT_MSGLOG_COMMITEMEND          VARCHAR2(104)  := '<< 生産要求作成処理終了 >>';
    COMMENT_MSGLOG_MAKEMRPDMNDST        VARCHAR2(124)  := '<< MRP品デマンド生成処理開始 >>';
    COMMENT_MSGLOG_MAKEMRPDMNDEN        VARCHAR2(124)  := '<< MRP品デマンド生成処理終了 >>';
    COMMENT_MSGLOG_SHIPCOMMSTART        VARCHAR2(120)  := '<< 出荷要求作成処理開始 >>';
    COMMENT_MSGLOG_SHIPCOMMEND          VARCHAR2(120)  := '<< 出荷要求作成処理終了 >>';
    COMMENT_MSGLOG_SHIPSTART            VARCHAR2(88)  := '<< 在庫出庫処理開始 >>';
    COMMENT_MSGLOG_SHIPEND              VARCHAR2(88)  := '<< 在庫出庫処理終了 >>';
    COMMENT_MSGLOG_MRPDMNDUPDSTART      VARCHAR2(140)  := '<< MRP品デマンド実績更新処理開始 >>';
    COMMENT_MSGLOG_MRPDMNDUPDEND        VARCHAR2(140)  := '<< MRP品デマンド実績更新処理終了 >>';

/* 変数の宣言 SQL */

/* 変数の宣言 WORK */
    blnRet                              BOOLEAN;            --BOOLEAN型 返却値
    blnRet_PrdReqCtrl                   BOOLEAN;            --BOOLEAN型 返却値
    vc2Comment                          VARCHAR2(1024);      --メッセージ用コメント作成作業領域
    lvc2Comment                         VARCHAR2(1024);      --A
    vc2RunChkComment                    VARCHAR2(1024);      --実行位置確認用コメント作成作業領域
    UTL_FileHandle                      UTL_FILE.FILE_TYPE; --ファイルハンドル

BEGIN

--DBMS_OUTPUT.ENABLE(1000000);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 開始 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
vc2RunChkComment := NULL;

    /* LogFile の OPEN */
         blnRet := FncLogOpen(pvc2OutputPath, pvc2OutputName, pvc2PlantCd, pvc2OutputMode, UTL_FileHandle); --A

    /* TraceLog の出力 */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,LOGMSG_START); --A

    /* 開始メッセージの出力 */

        lvc2Comment := '工場コード：[ '|| pvc2PlantCd ||' ]';--A
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_START,'(SBM0282)' || LOGMSG_START_PGNM || lvc2Comment); --A
    COMMIT;


--vc2RunChkComment := '●●●●通過 00010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);


    /* 生産要求処理開始日時の更新 */
    blnRet_PrdReqCtrl := FncPrdReqCtrl(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                       pvc2UserId, pvc2BusinessName,pvc2PlantCd,     --U
                                       PrdReqCtrlPRDREQSTARTDATE);
    IF blnRet_PrdReqCtrl = FALSE THEN
        RAISE excPrdReqCtrl_ERR;
    END IF;


--vc2RunChkComment := '●●●●通過 00020';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);


    /**********************************/
    /*          引数チェック          */
    /**********************************/
    IF (pvc2StepFlg < '0') or (pvc2StepFlg > '4') THEN
        /* 引数エラー */
        RAISE excPARAMETER_ERR;
    END IF;
    IF pvc2StepFlg IS NULL THEN
        /* 引数エラー */
        RAISE excPARAMETER_ERR;
    END IF;

    /**********************************/
    /*        生産要求生成処理        */
    /**********************************/
    IF pvc2StepFlg <= '0' THEN

--vc2RunChkComment := '●●●●通過 00030';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        /* 業務開始メッセージの出力 */
        lvc2Comment := '工場コード：[ '|| pvc2PlantCd ||' ]';--A
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,                          --U
                            MY_SQL_NAME, APS_COM_BATCH_START,'(SBM0291)' ||  COMMENT_MSGLOG_COMMITEMSTART || lvc2Comment);  --U

        /* 生産要求生成処理開始日時の更新 */
        blnRet_PrdReqCtrl := FncPrdReqCtrl(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                           pvc2UserId, pvc2BusinessName,pvc2PlantCd,         --U
                                           PrdReqCtrlITEMCONVSTARTDATE);
        IF blnRet_PrdReqCtrl = FALSE THEN
            RAISE excPrdReqCtrl_ERR;
        END IF;

        /* 生産要求生成処理 */
        blnRet := FncCommitemChg(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId, pvc2BusinessName,pvc2PlantCd);   --U
        IF blnRet = FALSE THEN
            RAISE excPROC_RUN_ERR;
        END IF;

        /* 生産要求生成処理終了日時の更新 */
        blnRet_PrdReqCtrl := FncPrdReqCtrl(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                           pvc2UserId, pvc2BusinessName,pvc2PlantCd,     --U
                                           PrdReqCtrlITEMCONVENDDATE);
        IF blnRet_PrdReqCtrl = FALSE THEN
            RAISE excPrdReqCtrl_ERR;
        END IF;

        /* 業務終了メッセージの出力 */
        lvc2Comment := '工場コード：[ '|| pvc2PlantCd ||' ]';--A
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,                     --U
                            MY_SQL_NAME, APS_COM_BATCH_END,'(SBM0292)' ||  COMMENT_MSGLOG_COMMITEMEND || lvc2Comment);   --U
        COMMIT;
    END IF;


    /**********************************/
    /*      MRP品デマンド生成処理     */
    /**********************************/
    IF pvc2StepFlg <= '1' THEN

--vc2RunChkComment := '●●●●通過 00040';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        /* 業務開始メッセージの出力 */
        lvc2Comment := '工場コード：[ '|| pvc2PlantCd ||' ]';--A
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,               --U
                            MY_SQL_NAME, APS_COM_BATCH_START, '(SBM0293)' || COMMENT_MSGLOG_MAKEMRPDMNDST || lvc2Comment);   --U

        /* ＭＲＰ品デマンド生成処理開始日時の更新 */
        blnRet_PrdReqCtrl := FncPrdReqCtrl(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                           pvc2UserId, pvc2BusinessName,pvc2PlantCd,        --U
                                           PrdReqCtrlMRPDEMANDSTARTDATE);
        IF blnRet_PrdReqCtrl = FALSE THEN
            RAISE excPrdReqCtrl_ERR;
        END IF;

        /* MRP品デマンド生成処理 */
        blnRet := FncMakeMrpDmnd(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId, pvc2BusinessName,pvc2PlantCd);         --U
        IF blnRet = FALSE THEN
            RAISE excPROC_RUN_ERR;
        END IF;

        /* ＭＲＰ品デマンド生成処理終了日時の更新 */
        blnRet_PrdReqCtrl := FncPrdReqCtrl(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                           pvc2UserId, pvc2BusinessName,pvc2PlantCd,        --U
                                           PrdReqCtrlMRPDEMANDENDDATE);
        IF blnRet_PrdReqCtrl = FALSE THEN
            RAISE excPrdReqCtrl_ERR;
        END IF;

        /* 業務終了メッセージの出力 */
        lvc2Comment := '工場コード：[ '|| pvc2PlantCd ||' ]';--A
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,               --U
                            MY_SQL_NAME, APS_COM_BATCH_END,'(SBM0294)' ||  COMMENT_MSGLOG_MAKEMRPDMNDEN || lvc2Comment);   --U
        COMMIT;
    END IF;


    /**********************************/
    /*      出荷要求作成処理      */
    /**********************************/
    IF pvc2StepFlg <= '2' THEN

--vc2RunChkComment := '●●●●通過 00050';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        /* 業務開始メッセージの出力 */
        lvc2Comment := '工場コード：[ '|| pvc2PlantCd ||' ]';--A
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,               --U
                            MY_SQL_NAME, APS_COM_BATCH_START, '(SBM0295)' || COMMENT_MSGLOG_SHIPCOMMSTART || lvc2Comment);   --U

        /* 出荷要求作成処理開始日時の更新 */
        blnRet_PrdReqCtrl := FncPrdReqCtrl(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,       --U
                                           PrdReqCtrlSHIPCONVSTARTDATE);
        IF blnRet_PrdReqCtrl = FALSE THEN
            RAISE excPrdReqCtrl_ERR;
        END IF;

        /* 出荷要求作成処理 */
        blnRet := FncShpCommItemChg(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId, pvc2BusinessName,pvc2PlantCd);     --U
        IF blnRet = FALSE THEN
            RAISE excPROC_RUN_ERR;
        END IF;

        /* 出荷要求作成処理終了日時の更新 */
        blnRet_PrdReqCtrl := FncPrdReqCtrl(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                           pvc2UserId, pvc2BusinessName,pvc2PlantCd,        --U
                                           PrdReqCtrlSHIPCONVENDDATE);
        IF blnRet_PrdReqCtrl = FALSE THEN
            RAISE excPrdReqCtrl_ERR;
        END IF;

        /* 業務終了メッセージの出力 */
        lvc2Comment := '工場コード：[ '|| pvc2PlantCd ||' ]';--A
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,               --U
                            MY_SQL_NAME, APS_COM_BATCH_END, '(SBM0296)' || COMMENT_MSGLOG_SHIPCOMMEND || lvc2Comment);   --U
        COMMIT;
    END IF;


    /**********************************/
    /*          在庫出庫処理          */
    /**********************************/
    IF pvc2StepFlg <= '3' THEN

--vc2RunChkComment := '●●●●通過 00060';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        /* 業務開始メッセージの出力 */
        lvc2Comment := '工場コード：[ '|| pvc2PlantCd ||' ]';--A
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,               --U
                            MY_SQL_NAME, APS_COM_BATCH_START, '(SBM0297)' || COMMENT_MSGLOG_SHIPSTART || lvc2Comment);   --U

        /* 在庫出庫処理開始日時の更新 */
        blnRet_PrdReqCtrl := FncPrdReqCtrl(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                           pvc2UserId, pvc2BusinessName,pvc2PlantCd,        --U
                                           PrdReqCtrlSTOCKISSUESTARTDATE);
        IF blnRet_PrdReqCtrl = FALSE THEN
            RAISE excPrdReqCtrl_ERR;
        END IF;

        /* 在庫出庫処理 */
        blnRet := FncShipReq(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId, pvc2BusinessName,pvc2PlantCd);         --U
        IF blnRet = FALSE THEN
            RAISE excPROC_RUN_ERR;
        END IF;

        /* 在庫出庫処理終了日時の更新 */
        blnRet_PrdReqCtrl := FncPrdReqCtrl(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                           pvc2UserId, pvc2BusinessName,pvc2PlantCd,        --U
                                           PrdReqCtrlSTOCKISSUEENDDATE);
        IF blnRet_PrdReqCtrl = FALSE THEN
            RAISE excPrdReqCtrl_ERR;
        END IF;

        /* 生産要求処理終了日時の更新 */
        blnRet_PrdReqCtrl := FncPrdReqCtrl(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                           pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                           PrdReqCtrlPRDREQENDDATE);
        IF blnRet_PrdReqCtrl = FALSE THEN
            RAISE excPrdReqCtrl_ERR;
        END IF;

        /* 業務終了メッセージの出力 */
        lvc2Comment := '工場コード：[ '|| pvc2PlantCd ||' ]';--A
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,               --U
                            MY_SQL_NAME, APS_COM_BATCH_END, '(SBM0298)' || COMMENT_MSGLOG_SHIPEND || lvc2Comment);   --U
        COMMIT;
    END IF;

    /* 終了メッセージの出力 */
    lvc2Comment := '工場コード：[ '|| pvc2PlantCd ||' ]';--A
    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                        pvc2UserId, pvc2BusinessName,pvc2PlantCd,           --U
                        MY_SQL_NAME, APS_COM_BATCH_END, '(SBM0299)' || LOGMSG_END_PGNM || lvc2Comment);   --U
    COMMIT;


    /* TraceLog の出力 */
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,         --U
                          MY_SQL_NAME, LOGMSG_END);

    /* LogFile の CLOSE */
    blnRet := FncLogClose(UTL_FileHandle);

--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 終了 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));



--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN excPARAMETER_ERR THEN        --「引数」エラー
--DBMS_OUTPUT.PUT_LINE('excPARAMETER_ERR');
        ROLLBACK;
        /* 終了メッセージの作成 */
        vc2Comment := SUBSTR('(SBM0300)' || LOGMSG_END_PGNM || LOGMSG_ERR || '：ステップフラグ' || ',' || pvc2StepFlg ,
                             1,256);
        /* 終了メッセージの出力 */
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,       --U
                            MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);
        /* TraceLog の出力（実行位置） */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,     --U
                              MY_SQL_NAME, LOGMSG_END || vc2RunChkComment);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,     --U
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        /* LogFile の CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excPrdReqCtrl_ERR THEN       --「生産要求制御」更新エラー
--DBMS_OUTPUT.PUT_LINE('excPrdReqCtrl_ERR');
        ROLLBACK;
        /* 終了メッセージの作成 */
        vc2Comment := SUBSTR('(SBM0301)' || LOGMSG_END_PGNM || LOGMSG_ERR || '：「生産要求制御」更新',
                             1,256);
        /* 終了メッセージの出力 */
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,       --U
                            MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);
        /* TraceLog の出力（実行位置） */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,     --U
                              MY_SQL_NAME, LOGMSG_END || vc2RunChkComment);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,     --U
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        /* LogFile の CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excPROC_RUN_ERR THEN         --「他処理起動」エラー
--DBMS_OUTPUT.PUT_LINE('excPROC_RUN_ERR');
        ROLLBACK;
        /* 終了メッセージの作成 */
        vc2Comment := SUBSTR('(SBM0302)' || LOGMSG_END_PGNM || LOGMSG_ERR,
                             1,256);
        /* 終了メッセージの出力 */
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,       --U
                            MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);
        /* TraceLog の出力（実行位置） */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,     --U
                              MY_SQL_NAME, LOGMSG_END || vc2RunChkComment);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,     --U
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        /* LogFile の CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN OTHERS THEN                  --その他のエラー
--DBMS_OUTPUT.PUT_LINE('excOTHERS');
        ROLLBACK;
        /* 終了メッセージの作成 */
        vc2Comment := SUBSTR('(SBM0302)' || LOGMSG_END_PGNM || LOGMSG_ERR || '：' ||
                             SQLCODE || ',' || SUBSTR(SQLERRM,1,256),
                             1,256);
        /* 終了メッセージの出力 */
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,       --U
                            MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);
        /* TraceLog の出力（実行位置） */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,     --U
                              MY_SQL_NAME, LOGMSG_END || vc2RunChkComment);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,     --U
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        /* LogFile の CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);
END;
/