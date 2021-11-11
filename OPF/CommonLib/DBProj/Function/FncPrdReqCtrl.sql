CREATE OR REPLACE FUNCTION FNCPRDREQCTRL(
/*------------------------------------------------------------------------------
'
' version   : 1.00.00
'
' 修正履歴
' 2003.10.16 新規作成
' 2004.09.24 SUBSTR→SUBSTRBに変更
' 2005.10.21 unicode対応（varchar2を4倍、SUBSTRBの引数を4倍）
'
' 機能      : 生産要求制御の更新
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
'             pnumDataIndex        - (i)データインデックス
'
' 機能説明  : 指定された生産要求制御の日付項目の更新を行う。
'
' 備考      :
'
------------------------------------------------------------------------------*/
    pFileHandle            IN  UTL_FILE.FILE_TYPE   --ファイルハンドル
   ,pvc2LogMode            IN  VARCHAR2            --ＬＯＧモード
   ,pvc2OutputMode         IN  VARCHAR2            --出力モード
   ,pvc2UserId             IN  VARCHAR2            --ユーザＩＤ
   ,pvc2BusinessName       IN  VARCHAR2            --業務名
   ,pvc2PlantCd            IN  VARCHAR2       --// 工場コード
   ,pnumDataIndex          IN  NUMBER              --データインデックス
) RETURN BOOLEAN
IS


/* カーソルの宣言 */

/* ROWTYPE の宣言 */

/* 定数の宣言 */
    MY_SQL_NAME                         VARCHAR2(52)  := 'FncPrdReqCtrl';
    CTRL_CD_DEFAULT                     VARCHAR2(24)   := 'SYSTEM';  --ｺﾝﾄﾛｰﾙ系ﾃｰﾌﾞﾙのPrimaryKeyの値
    PrdReqCtrlPRDREQSTARTDATE           NUMBER(2)     := 1;         --生産要求処理開始日時
    PrdReqCtrlPRDREQENDDATE             NUMBER(2)     := 2;         --生産要求処理終了日時
    PrdReqCtrlITEMCONVSTARTDATE         NUMBER(2)     := 3;         --商品品目変換処理開始日時
    PrdReqCtrlITEMCONVENDDATE           NUMBER(2)     := 4;         --商品品目変換処理終了日時
    PrdReqCtrlMRPDEMANDSTARTDATE        NUMBER(2)     := 5;         --ＭＲＰ品デマンド生成処理開始日時
    PrdReqCtrlMRPDEMANDENDDATE          NUMBER(2)     := 6;         --ＭＲＰ品デマンド生成処理終了日時
    PrdReqCtrlSHIPCONVSTARTDATE         NUMBER(2)     := 7;         --出荷商品品目変換処理開始日時
    PrdReqCtrlSHIPCONVENDDATE           NUMBER(2)     := 8;         --出荷商品品目変換処理終了日時
    PrdReqCtrlSTOCKISSUESTARTDATE       NUMBER(2)     := 9;         --在庫出庫処理開始日時
    PrdReqCtrlSTOCKISSUEENDDATE         NUMBER(2)     := 10;        --在庫出庫処理終了日時
    PrdReqCtrlMRPDEMANDSTARTUPDATE      NUMBER(2)     := 11;        --ＭＲＰ品デマンド実績更新開始日時
    PrdReqCtrlMRPDEMANDENDUPDATE        NUMBER(2)     := 12;        --ＭＲＰ品デマンド実績更新終了日時

/* EXCEPTION の宣言 */
    excPARAMETER_ERR                    EXCEPTION;                  --「引数」エラー

/* MESSAGE の宣言 */
    APS_COM_ORACLE_ERR                  VARCHAR2(28)     := 'AK53401';     --ＯＲＡＣＬＥ　ＥＲＲＯＲ
    APS_COM_OTHER_ERR                   VARCHAR2(28)     := 'AK53402';     --その他　ＥＲＲＯＲ

/* LOG の宣言 */
    LOGMSG_START                        VARCHAR2(20)   := 'Start';   --ログ用メソッド開始宣言
    LOGMSG_END                          VARCHAR2(12)   := 'End';     --ログ用メソッド終了宣言
    LOGMSG_ERR                          VARCHAR2(32)   := '異常終了';

/* 変数の宣言 SQL */

/* 変数の宣言 WORK */
    blnRet                              BOOLEAN;        --BOOLEAN型 返却値
    vc2Comment                          VARCHAR2(1024);  --メッセージ用コメント作成作業領域
    vc2CtrlCd                           VARCHAR2(100);   --SYSコントロールコード
    vc2RunChkComment                    VARCHAR2(1024);  --実行位置確認用コメント作成作業領域
    
BEGIN
--DBMS_OUTPUT.ENABLE(1000000);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 開始 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
vc2RunChkComment := NULL;

    /* TraceLog の出力 */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

--vc2RunChkComment := '★★★★通過 00010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    /* 生産要求制御の有無チェック */
--DEL     SELECT CTRL_CD INTO vc2CtrlCd FROM SYS_PRD_REQ_CTRL WHERE CTRL_CD = CTRL_CD_DEFAULT;
    SELECT PLANT_CD INTO vc2CtrlCd FROM SYS_PRD_REQ_CTRL WHERE plant_cd = pvc2PlantCd; --A

    /* 生産要求制御の更新 */
    IF pnumDataIndex = PrdReqCtrlPRDREQSTARTDATE THEN
--vc2RunChkComment := '★★★★通過 00020';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        /* 生産要求処理開始日時 */
        UPDATE SYS_PRD_REQ_CTRL SET
                PRD_REQ_START_DATE      = SYSDATE
               ,PRD_REQ_END_DATE        = NULL
               ,updated_date = sysdate
        ,updated_by = pvc2UserId
        ,updated_prg_nm = MY_SQL_NAME
        ,modify_count = (modify_count + 1)
--DEL        WHERE CTRL_CD = CTRL_CD_DEFAULT;
    WHERE plant_cd = pvc2PlantCd; --A

    ELSIF pnumDataIndex = PrdReqCtrlPRDREQENDDATE THEN
--vc2RunChkComment := '★★★★通過 00030';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        /* 生産要求処理終了日時 */
        UPDATE SYS_PRD_REQ_CTRL SET
                PRD_REQ_END_DATE        = SYSDATE
               ,ITEM_CONV_START_DATE    = NULL
               ,ITEM_CONV_END_DATE      = NULL
               ,MRP_DM_START_DATE   = NULL
               ,MRP_DM_END_DATE     = NULL
               ,SHIP_CONV_START_DATE    = NULL
               ,SHIP_CONV_END_DATE      = NULL
               ,STOCK_ISSUE_START_DATE  = NULL
               ,STOCK_ISSUE_END_DATE    = NULL
               ,MRP_DM_START_UPDATE = NULL
               ,MRP_DM_END_UPDATE   = NULL
               ,updated_date = sysdate
        ,updated_by = pvc2UserId
        ,updated_prg_nm = MY_SQL_NAME
        ,modify_count = (modify_count + 1)
--DEL        WHERE CTRL_CD = CTRL_CD_DEFAULT;
    WHERE plant_cd = pvc2PlantCd; --A

    ELSIF pnumDataIndex = PrdReqCtrlITEMCONVSTARTDATE THEN
--vc2RunChkComment := '★★★★通過 00040';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        /* 商品品目変換処理開始日時 */
        UPDATE SYS_PRD_REQ_CTRL SET
                ITEM_CONV_START_DATE    = SYSDATE
               ,ITEM_CONV_END_DATE      = NULL
               ,updated_date = sysdate
        ,updated_by = pvc2UserId
        ,updated_prg_nm = MY_SQL_NAME
        ,modify_count = (modify_count + 1)
--DEL        WHERE CTRL_CD = CTRL_CD_DEFAULT;
    WHERE plant_cd = pvc2PlantCd; --A

    ELSIF pnumDataIndex = PrdReqCtrlITEMCONVENDDATE THEN
--vc2RunChkComment := '★★★★通過 00050';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        /* 商品品目変換処理終了日時 */
        UPDATE SYS_PRD_REQ_CTRL SET
                ITEM_CONV_END_DATE      = SYSDATE
               ,updated_date = sysdate
        ,updated_by = pvc2UserId
        ,updated_prg_nm = MY_SQL_NAME
        ,modify_count = (modify_count + 1)
--DEL        WHERE CTRL_CD = CTRL_CD_DEFAULT;
    WHERE plant_cd = pvc2PlantCd; --A


    ELSIF pnumDataIndex = PrdReqCtrlMRPDEMANDSTARTDATE THEN
--vc2RunChkComment := '★★★★通過 00060';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        /* ＭＲＰ品デマンド生成処理開始日時 */
        UPDATE SYS_PRD_REQ_CTRL SET
                MRP_DM_START_DATE   = SYSDATE
               ,MRP_DM_END_DATE     = NULL
               ,updated_date = sysdate
        ,updated_by = pvc2UserId
        ,updated_prg_nm = MY_SQL_NAME
        ,modify_count = (modify_count + 1)
--DEL        WHERE CTRL_CD = CTRL_CD_DEFAULT;
    WHERE plant_cd = pvc2PlantCd; --A

    ELSIF pnumDataIndex = PrdReqCtrlMRPDEMANDENDDATE THEN
--vc2RunChkComment := '★★★★通過 00070';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        /* ＭＲＰ品デマンド生成処理終了日時 */
        UPDATE SYS_PRD_REQ_CTRL SET
                MRP_DM_END_DATE     = SYSDATE
               ,updated_date = sysdate
        ,updated_by = pvc2UserId
        ,updated_prg_nm = MY_SQL_NAME
        ,modify_count = (modify_count + 1)
--DEL        WHERE CTRL_CD = CTRL_CD_DEFAULT;
    WHERE plant_cd = pvc2PlantCd; --A

    ELSIF pnumDataIndex = PrdReqCtrlSHIPCONVSTARTDATE THEN
--vc2RunChkComment := '★★★★通過 00080';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        /* 出荷商品品目変換処理開始日時 */
        UPDATE SYS_PRD_REQ_CTRL SET
                SHIP_CONV_START_DATE    = SYSDATE
               ,SHIP_CONV_END_DATE      = NULL
               ,updated_date = sysdate
        ,updated_by = pvc2UserId
        ,updated_prg_nm = MY_SQL_NAME
        ,modify_count = (modify_count + 1)
--DEL        WHERE CTRL_CD = CTRL_CD_DEFAULT;
    WHERE plant_cd = pvc2PlantCd; --A

    ELSIF pnumDataIndex = PrdReqCtrlSHIPCONVENDDATE THEN
--vc2RunChkComment := '★★★★通過 00090';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        /* 出荷商品品目変換処理終了日時 */
        UPDATE SYS_PRD_REQ_CTRL SET
                SHIP_CONV_END_DATE      = SYSDATE
               ,updated_date = sysdate
        ,updated_by = pvc2UserId
        ,updated_prg_nm = MY_SQL_NAME
        ,modify_count = (modify_count + 1)
--DEL        WHERE CTRL_CD = CTRL_CD_DEFAULT;
    WHERE plant_cd = pvc2PlantCd; --A

    ELSIF pnumDataIndex = PrdReqCtrlSTOCKISSUESTARTDATE THEN
--vc2RunChkComment := '★★★★通過 00100';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        /* 在庫出庫処理開始日時 */
        UPDATE SYS_PRD_REQ_CTRL SET
                STOCK_ISSUE_START_DATE  = SYSDATE
               ,STOCK_ISSUE_END_DATE    = NULL
               ,updated_date = sysdate
        ,updated_by = pvc2UserId
        ,updated_prg_nm = MY_SQL_NAME
        ,modify_count = (modify_count + 1)
--DEL        WHERE CTRL_CD = CTRL_CD_DEFAULT;
    WHERE plant_cd = pvc2PlantCd; --A


    ELSIF pnumDataIndex = PrdReqCtrlSTOCKISSUEENDDATE THEN
--vc2RunChkComment := '★★★★通過 00110';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        /* 在庫出庫処理終了日時 */
        UPDATE SYS_PRD_REQ_CTRL SET
                STOCK_ISSUE_END_DATE    = SYSDATE
               ,updated_date = sysdate
        ,updated_by = pvc2UserId
        ,updated_prg_nm = MY_SQL_NAME
        ,modify_count = (modify_count + 1)
--DEL        WHERE CTRL_CD = CTRL_CD_DEFAULT;
    WHERE plant_cd = pvc2PlantCd; --A

    ELSIF pnumDataIndex = PrdReqCtrlMRPDEMANDSTARTUPDATE THEN
--vc2RunChkComment := '★★★★通過 00120';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        /* ＭＲＰ品デマンド実績更新開始日時 */
        UPDATE SYS_PRD_REQ_CTRL SET
                MRP_DM_START_UPDATE = SYSDATE
               ,MRP_DM_END_UPDATE   = NULL
               ,updated_date = sysdate
        ,updated_by = pvc2UserId
        ,updated_prg_nm = MY_SQL_NAME
        ,modify_count = (modify_count + 1)
--DEL        WHERE CTRL_CD = CTRL_CD_DEFAULT;
    WHERE plant_cd = pvc2PlantCd; --A

    ELSIF pnumDataIndex = PrdReqCtrlMRPDEMANDENDUPDATE THEN
--vc2RunChkComment := '★★★★通過 00130';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        /* ＭＲＰ品デマンド実績更新終了日時 */
        UPDATE SYS_PRD_REQ_CTRL SET
                MRP_DM_END_UPDATE   = SYSDATE
               ,updated_date = sysdate
        ,updated_by = pvc2UserId
        ,updated_prg_nm = MY_SQL_NAME
        ,modify_count = (modify_count + 1)
--DEL        WHERE CTRL_CD = CTRL_CD_DEFAULT;
    WHERE plant_cd = pvc2PlantCd; --A


    ELSE
--vc2RunChkComment := '★★★★通過 00140';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        /* 引数エラー */
        RAISE excPARAMETER_ERR;

    END IF;

    /* TraceLog の出力 */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 終了 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

    RETURN TRUE;


--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN excPARAMETER_ERR THEN        --「引数」エラー
--DBMS_OUTPUT.PUT_LINE('「引数」エラー');
        ROLLBACK;
        /* 終了メッセージの作成 */
        vc2Comment := SUBSTRB('(SBM0049)' || LOGMSG_ERR || '：データインデックス' || ',' || pnumDataIndex ,
                             1,1024);
        /* 終了メッセージの出力 */
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_OTHER_ERR, vc2Comment);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;

    WHEN OTHERS THEN                  --その他のエラー
--DBMS_OUTPUT.PUT_LINE('その他エラー');
        ROLLBACK;
        /* 終了メッセージの作成 */
        vc2Comment := SUBSTRB('(SBM0021)' || LOGMSG_ERR || '：' ||
                             SQLCODE || ',' || SUBSTRB(SQLERRM,1,1024),
                             1,1024);
        /* 終了メッセージの出力 */
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_ORACLE_ERR, vc2Comment);
        /* TraceLog の出力（実行位置） */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END || vc2RunChkComment);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;
END;
/