CREATE OR REPLACE FUNCTION FNCSHIPREQ(
/*------------------------------------------------------------------------------
'
' version   : 1.00.00
'
' 修正履歴
' 2003.10.16 新規作成
' 2004.09.24 SUBSTR→SUBSTRBに変更
' 2005.10.21 unicode対応（varchar2を4倍、SUBSTRBの引数を4倍）
'
' 機能      : 在庫出庫処理
'
' 引き数    : pFileHandle          - (i)ファイルハンドル
'             pvc2LogMode          - (i)ＬＯＧモード
'             pvc2OutputMode       - (i)出力モード
'             pvc2UserId           - (i)ユーザＩＤ
'             pvc2BusinessName     - (i)業務名
'             pvc2PlantCd          - (i)工場コード
'
' 機能説明  : 在庫出庫処理
'
' 備考      :
'
------------------------------------------------------------------------------*/
    pFileHandle         IN  UTL_FILE.FILE_TYPE  --ファイルハンドル
   ,pvc2LogMode         IN  VARCHAR2            --ＬＯＧモード
   ,pvc2OutputMode      IN  VARCHAR2            --出力モード
   ,pvc2UserId          IN  VARCHAR2            --ユーザＩＤ
   ,pvc2BusinessName    IN  VARCHAR2            --業務名
   ,pvc2PlantCd         IN  VARCHAR2            --工場コード
) RETURN BOOLEAN
IS
    -- 例外の宣言
    excGetOd                EXCEPTION;          --所要量取得エラー
    excInvalidMrpOdrTyp     EXCEPTION;          --品目手配区分不正
    excAutoShip             EXCEPTION;          --自動出荷処理エラー
    excNotexistRcvIssue     EXCEPTION;          --保管区別入出庫データが存在しません
    excGetNewIssueCd        EXCEPTION;          --入出庫管理番号取得エラー
    excGetNewShipRsvCd      EXCEPTION;          --出荷保留番号取得エラー
    excShip                 EXCEPTION;          --出荷処理エラー
    excCurCompanyCdErr       EXCEPTION;         --カーソルOPEN中のEXCEPTION
    
    -- 定数の宣言
    MY_SQL_NAME                     VARCHAR2(40)    := 'FncShipReq';
    PRD_ERROR_TYP_ERROR             NUMBER          := 9;   --生産要求Ｉ／Ｆ－生産情報エラー区分（９：エラー）
    ODR_TYP_CASE_ODR                NUMBER          := 1;   --品目-品目手配区分(1:個別手配品目)
    ODR_TYP_STOCK_ALOC_CASE_ODR     NUMBER          := 2;   --品目-品目手配区分(2:在庫引当型個別手配品目)
    ODR_TYP_STOCK_ALOC_MANUAL_ODR   NUMBER          := 3;   --品目-品目手配区分(3:在庫引当型マニュアル手配品目)
    ODR_TYP_MANUAL_ODR              NUMBER          := 4;   --品目-品目手配区分(4:マニュアル手配品目)
    ODR_TYP_LOT_ODR                 NUMBER          := 5;   --品目-品目手配区分(5:ロット手配品目)
    ODR_TYP_RATION_ODR              NUMBER          := 6;   --品目-品目手配区分(6:定量手配品目)
    ODR_TYP_ODR_POINT_ODR           NUMBER          := 7;   --品目-品目手配区分(7:発注点手配品目)
    ODR_TYP_ASSIMILATE              NUMBER          := 8;   --品目-品目手配区分(8:擬似品目)
    ISSUERSV_CANCELED               NUMBER          := 2;   --出庫保留テーブル-出庫保留解除区分(2:保留無効)
    RCV_ISSUE_TYP_OUT               NUMBER          := 2;   --保管区別入出庫-入出庫区分(2:出庫)
    RCV_ISSUE_GNR_TYP_CANSHIP       NUMBER          := 39;  --保管区別入出庫-入出庫発生区分(39:出荷取消)
    RCV_ISSUE_STOCK_UPD_COMPLTED    NUMBER          := 2;   --保管区別入出庫-在庫更新区分(2:更新済み)
    SHIP_RSV_CANCEL_TYP_CANCELED    NUMBER          := 2;   --出庫保留-出庫保留解除区分(2:保留無効)
    SHIP_RSV_CANCEL_TYP_ERRORDATA   NUMBER          := 9;   --出荷保留-出荷保留解除区分(9:保留解除(不正データ))
    ISSUERSV_NOTRELEASED            NUMBER          := 1;   --出荷保留-出荷保留解除区分(1:保留中)
    ISSUERSV_RELEASED               NUMBER          := 3;   --出荷保留-出荷保留解除区分(3:保留解除)

    -- 変数の宣言
    blnRet                  BOOLEAN;        --関数戻り値
    intRet                  INTEGER;        --関数戻り値
    vc2Comment              VARCHAR2(1024);  --メッセージ用コメント作成作業領域
    vc2JobOdrCd             VARCHAR2(100);   --製番
    numJobOdrDetailNo       NUMBER(6);      --製番枝番
    vc2ItemCd               VARCHAR2(100);   --品目番号
    blnJobOdrFlg            BOOLEAN;        --製番計画取得判断
    numOdNo                 NUMBER(14);     --オーダデマンド番号
    vc2NewRcvIssueCtrlCd    VARCHAR2(100);   --入出庫管理番号
    vc2NewShipRsvCdCtrl     VARCHAR2(100);   --出荷保留番号
    vc2RunChkComment        VARCHAR2(1024);  --実行位置確認用コメント作成作業領域
    numCnt_SHIP_REQ         NUMBER(10);     --［出荷要求］抽出件数
    numCnt_SHIP_RSV         NUMBER(10);     --［出荷保留］追加件数
    numCnt_ITEM_STOCK       NUMBER(10);     --［保管区別品目在庫］更新件数
    numCnt_JOB_ODR_CD_STOCK NUMBER(10);     --［保管区別製番在庫］更新件数
    dtmSHIP_DATE            DATE;           --ＷＫ出荷実績日
    numSHIP_DATE_Flg        NUMBER(1);      --ＷＫ出荷実績日の取得有無
    numCount1               NUMBER(10);     --件数チェック用１
    numCount2               NUMBER(10);     --件数チェック用２
    vc2CompanyCd            VARCHAR2(100);-- 会社コード
    
-- MESSAGE の宣言
    APS_COM_BATCH_START                 VARCHAR2(28)     := 'ZZ09001';     --バッチ処理を開始しました
    APS_COM_BATCH_END                   VARCHAR2(28)     := 'ZZ09002';     --バッチ処理を終了しました
    APS_COM_NOTEXIST_T_OD               VARCHAR2(28)     := 'AK50585';     --所要量データが存在しません
    APS_COM_INVALID_ITEM_ODR_TYP        VARCHAR2(28)     := 'AK50718';     --品目手配区分が不正です
    APS_COM_NOTEXIST_T_RCV_ISSUE        VARCHAR2(28)     := 'AK50594';     --保管区別入出庫データが存在しません
    APS_COM_NOTEXIST_ISSUE_CTRL_CD      VARCHAR2(28)     := 'AK50558';     --入出庫番号採番データが存在しません
    APS_COM_NOTEXIST_RSV_CD_CTRL        VARCHAR2(28)     := 'AK50542';     --出庫保留番号採番データが存在しません
    APS_PROC_CNT                        VARCHAR2(28)     := 'AK53412';     --処理件数
    APS_CANCEL_ERRNO                    VARCHAR2(28)     := 'AK53355';     --返品が発生しています
    APS_PASTDATA_ERRNO                  VARCHAR2(28)     := 'AK53356';     --前回出荷データが存在しません
    APS_COMPANY_CD                      VARCHAR2(28)     := 'BZ00179';     --会社コードの取得に失敗しました。

-- LOG の宣言
    LOGMSG_START                        VARCHAR2(20)   := 'Start';         --ログ用メソッド開始宣言
    LOGMSG_END                          VARCHAR2(12)   := 'End';           --ログ用メソッド終了宣言
    LOGMSG_ERR                          VARCHAR2(32)   := '異常終了';
    COMMENT_MSGLOG_SHIPSTART            VARCHAR2(88)  := '<< 在庫出庫処理開始 >>';
    COMMENT_MSGLOG_SHIPEND              VARCHAR2(88)  := '<< 在庫出庫処理終了 >>';

    -- カーソルの宣言
    /* 自社コード取得 */
    CURSOR curSYS_MY_COMPANY IS
        SELECT
            SYS_MY_COMPANY."COMPANY_CD" AS "COMPANY_CD"
        FROM
            SYS_MY_COMPANY
        WHERE
            SYS_MY_COMPANY."CTRL_CD" = 'SYSTEM';
    recSYS_MY_COMPANY curSYS_MY_COMPANY%ROWTYPE;
    
    -- 出荷要求
    CURSOR curT_SHIP_REQ(
        cVc2PLANT_CD     VARCHAR2        --   1.工場コード
    )IS
        SELECT
                COMPANY_CD              --会社コード
               ,SLIP_TYP                --伝票種類
               ,SLIP_CTRL_GRP           --伝票管理グループ
               ,SLIP_CD                 --伝票番号
               ,SLIP_DATE               --伝票日付
               ,LINE_NO                 --行
               ,UPD_ODR_NO              --更新順序
               ,CRCT_TYP            --訂正区分
               ,ORGN_SLIP_CTRL_GRP      --元伝票管理グループ
               ,ORGN_SLIP_CD            --元伝票番号
               ,ORGN_SLIP_DATE          --元伝票日付
               ,ORGN_LINE_NO            --元伝票行
               ,ODR_SLIP_TYP            --受注伝票種類
               ,ODR_SLIP_CTRL_GRP       --受注伝票管理グループ
               ,ODR_SLIP_CD             --受注伝票番号
               ,ODR_SLIP_DATE           --受注伝票日付
               ,ODR_LINE_NO             --受注伝票行
               ,JOB_ODR_FLG             --個別受注フラグ
               ,CUST_CD                 --得意先コード
               ,CUST_NAME               --得意先名
               ,BRANCH_CD               --支店コード
               ,BRANCH_NAME             --支店名
               ,DIRECT_DLV_TYP          --直納区分
               ,DLV_LOC_CD              --納入場所コード
               ,DLV_LOC_NAME            --納入場所名
               ,COMM_CD                 --商品コード
               ,COMM_NAME               --商品名
               ,SPEC                    --規格
               ,COMM_SIZE               --サイズ
               ,COLOR                   --色
               ,PRD_COMM_CODE_CHG_TYP   --製品／商品変数区分
               ,SCDL_SHIP_DATE          --出荷予定日
               ,SCDL_DLV_DATE           --納品予定日
           ,PLANT_CD        --工場コード    
               ,SHIP_WH_CD              --出荷倉庫コード
               ,WH_CD                   --保管区コード
               ,RCV_ISSUE_QTY           --出荷実績数
               ,TOTAL_RCV_ISSUE_QTY     --出荷実績累計数
               ,REMAIN_RCV_ISSUE_QTY    --出荷残数
               ,ODR_ACPT_JOB_ODR_NO     --受注製番
               ,ITEM_CD                 --品目番号
               ,MRP_ODR_TYP             --品目手配区分
               ,OD_TYP          --オーダデマンド区分
               ,OD_NO           --オーダデマンド番号
               ,JOB_ODR_CD              --製番
               ,JOB_ODR_DETAIL_NO       --製番枝番
               ,PRD_ERROR_TYP           --生産情報エラー区分
               ,SHIP_DATE               --出荷実績日
            FROM   T_SHIP_REQ
        WHERE  PLANT_CD = cVc2PLANT_CD
            ORDER BY UPD_ODR_NO     --更新順序
                    ,COMPANY_CD     --会社コード
                    ,SLIP_TYP       --伝票種類
                    ,SLIP_CTRL_GRP  --伝票管理グループ
                    ,SLIP_CD        --伝票番号
                    ,SLIP_DATE      --伝票日付
                    ,LINE_NO;       --行

    -- 出荷管理制御＆保管区別入出庫
    CURSOR curT_RCV_ISSUE(
        cvc2CompanyCd       VARCHAR2
       ,cnumSlipTyp         NUMBER
       ,cvc2SlipCtrlGrp     VARCHAR2
       ,cvc2SlipCd          VARCHAR2
       ,cdtmSlipDate        DATE
       ,cnumLineNo          NUMBER
       ,cVc2PLANT_CD       VARCHAR2        --   工場コード
        )
    IS
        SELECT  B.RCV_ISSUE_CTRL_CD     --入出庫管理番号
               ,B.ITEM_CD               --品目番号
           ,B.PLANT_CD          --工場コード    
               ,B.WH_CD                 --保管区コード
               ,B.JOB_ODR_CD            --製番
               ,B.JOB_ODR_DETAIL_NO     --製番枝番
               ,B.PUCH_ODR_CD           --発注番号
               ,B.ACPT_NO               --受入回数
               ,B.ACPT_RSLT_CRCT_NO     --受入実績訂正回数
               ,B.INSPEC_RSLT_CRCT_NO   --検査実績訂正回数
               ,B.WORK_ODR_CD           --作業計画番号
               ,B.WORK_IN_PROC_CD       --仕掛作業コード
               ,B.PARTIAL_PRD_NO        --分作回数
               ,B.OPR_RSLT_CRCT_NO      --作業実績訂正回数
               ,B.ISSUE_INST_CD         --出庫指示番号
               ,B.RCV_ISSUE_QTY         --入出庫数
               ,B.RCV_ISSUE_AMOUNT      --入出庫金額
               ,B.RCV_ISSUE_DATE        --入出庫年月日
               ,B.RCV_ISSUE_ODD_QTY     --入出庫端数
               ,B.DEFECT_CAUSE_CD       --入出庫不良理由コード
               ,B.RCV_ISSUE_CMPLT_FLG   --入出庫完了フラグ
               ,B.OD_NO                 --オーダデマンド番号
            FROM   SYS_SHIP_CTRL A, T_RCV_ISSUE B
            WHERE  A.RCV_ISSUE_CTRL_CD = B.RCV_ISSUE_CTRL_CD(+)
              AND  A.COMPANY_CD = cvc2CompanyCd
              AND  SLIP_TYP = cnumSlipTyp
              AND  SLIP_CTRL_GRP = cvc2SlipCtrlGrp
              AND  SLIP_CD = cvc2SlipCd
              AND  SLIP_DATE = cdtmSlipDate
              AND  LINE_NO = cnumLineNo
          AND  PLANT_CD = cVc2PLANT_CD;

BEGIN
--DBMS_OUTPUT.ENABLE(1000000);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 開始 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
vc2RunChkComment := NULL;

    -- TraceLog の出力
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

    -- 出荷要求を抽出し処理開始
--vc2RunChkComment := '★★★★通過 00010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);


    --［出荷要求］抽出件数の初期化
    numCnt_SHIP_REQ := 0;
    --［保管区別品目在庫］更新件数の初期化
    numCnt_ITEM_STOCK := 0;

    --ＷＫ出荷実績日の取得有無の初期化
    numSHIP_DATE_Flg := 0;
    /* カーソルＯＰＥＮ（会社コード)*/
    BEGIN
        OPEN curSYS_MY_COMPANY;
    EXCEPTION
        WHEN OTHERS THEN
        RAISE  excCurCompanyCdErr;
    END;
    BEGIN
        FETCH  curSYS_MY_COMPANY  INTO recSYS_MY_COMPANY;
    EXCEPTION
        WHEN OTHERS THEN
        RAISE  excCurCompanyCdErr;
    END;  -- カーソルFETCH(自社)

    IF curSYS_MY_COMPANY%FOUND THEN
        vc2CompanyCd := recSYS_MY_COMPANY.COMPANY_CD;
    ELSE
        RAISE  excCurCompanyCdErr;
    END IF;
    IF curSYS_MY_COMPANY%ISOPEN = TRUE THEN
        CLOSE curSYS_MY_COMPANY;
    END IF;

    FOR curT_SHIP_REQ_REC IN curT_SHIP_REQ(pvc2PlantCd) LOOP

        --１件目の出荷実績日を取得する
        IF numSHIP_DATE_Flg = 0 THEN
            numSHIP_DATE_Flg := 1;
            dtmSHIP_DATE := curT_SHIP_REQ_REC.SHIP_DATE;
        END IF;

        --生産情報エラー区分（９：エラー）の場合処理しない
        IF curT_SHIP_REQ_REC.PRD_ERROR_TYP <> PRD_ERROR_TYP_ERROR THEN
    
--vc2RunChkComment := '★★★★通過 00020';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                      pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                      MY_SQL_NAME, vc2RunChkComment);
    
            --通常出荷の場合
            IF curT_SHIP_REQ_REC.ORGN_SLIP_CTRL_GRP IS NULL THEN
    
---*******************************************************************************************
                    IF curT_SHIP_REQ_REC.MRP_ODR_TYP >= ODR_TYP_MANUAL_ODR
                      AND curT_SHIP_REQ_REC.MRP_ODR_TYP <= ODR_TYP_ODR_POINT_ODR THEN
    
--vc2RunChkComment := '★★★★通過 00100';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                      pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                      MY_SQL_NAME, '(SBM0699)FncAutoShip起動' || vc2RunChkComment || ' numOdNo=NULL');
    
----********************************************************************************************************
--      自動出荷
----********************************************************************************************************                        -- Mrp品目の場合
                        -- 自動出荷処理起動
                        blnRet := FncAutoShip(pFileHandle
                                             ,pvc2LogMode
                                             ,pvc2OutputMode
                                             ,pvc2UserId
                                             ,pvc2BusinessName
                                             ,pvc2PlantCd   
                                             ,vc2CompanyCd                         --会社コード
                                             ,curT_SHIP_REQ_REC.SLIP_TYP           --伝票種類
                                             ,curT_SHIP_REQ_REC.SLIP_CTRL_GRP      --伝票ｸﾞﾙｰﾌﾟ
                                             ,curT_SHIP_REQ_REC.SLIP_CD            --伝票番号
                                             ,curT_SHIP_REQ_REC.SLIP_DATE          --伝票日付
                                             ,curT_SHIP_REQ_REC.LINE_NO            --行
                                             ,curT_SHIP_REQ_REC.UPD_ODR_NO         --更新順序
                                             ,curT_SHIP_REQ_REC.RCV_ISSUE_QTY      --出荷要求数
                                             ,curT_SHIP_REQ_REC.ITEM_CD            --品目番号
                                            ,curT_SHIP_REQ_REC.MRP_ODR_TYP         --手配区分
                                             ,NULL                                 --オーダーデマンド番号
                                             ,NULL                                 --出荷保留番号
                                             ,curT_SHIP_REQ_REC.SHIP_DATE
                                             ,numCnt_SHIP_RSV
                                             ,numCnt_ITEM_STOCK
                                             ,numCnt_JOB_ODR_CD_STOCK
                                             );
    
----********************************************************************************************************
                        IF blnRet = FALSE THEN
                            RAISE excAutoShip;
                        END IF;
                    ELSE
                        --  品目手配区分が不正です
                        RAISE excInvalidMrpOdrTyp;
                    END IF;
            --出荷取消の場合
            ELSE
    
--vc2RunChkComment := '★★★★通過 00110';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    
    
    
                -- 出荷済品目の出荷取消処理の為のデータ件数チェック
                SELECT COUNT(*) INTO numCount2
                    FROM   SYS_SHIP_CTRL, T_RCV_ISSUE
                    WHERE  SYS_SHIP_CTRL.RCV_ISSUE_CTRL_CD = T_RCV_ISSUE.RCV_ISSUE_CTRL_CD(+)
                      AND  SYS_SHIP_CTRL.COMPANY_CD = curT_SHIP_REQ_REC.COMPANY_CD
                      AND  SYS_SHIP_CTRL.SLIP_TYP = curT_SHIP_REQ_REC.SLIP_TYP
                      AND  SYS_SHIP_CTRL.SLIP_CTRL_GRP = curT_SHIP_REQ_REC.ORGN_SLIP_CTRL_GRP
                      AND  SYS_SHIP_CTRL.SLIP_CD = curT_SHIP_REQ_REC.ORGN_SLIP_CD
                      AND  SYS_SHIP_CTRL.SLIP_DATE = curT_SHIP_REQ_REC.ORGN_SLIP_DATE
                      AND  SYS_SHIP_CTRL.LINE_NO = curT_SHIP_REQ_REC.ORGN_LINE_NO
              AND  T_RCV_ISSUE.PLANT_CD = pvc2PlantCd;  
        
                --[出荷管理]の件数 >= 1
                IF (numCount2 >= 1) THEN
                    --[保管区別入出庫]作成、出荷処理起動
    
--vc2RunChkComment := '★★★★通過 00190';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    
                    -- 出荷済品目の出荷取消処理
                    FOR curT_RCV_ISSUE_REC IN curT_RCV_ISSUE(curT_SHIP_REQ_REC.COMPANY_CD
                                                            ,curT_SHIP_REQ_REC.SLIP_TYP
                                                            ,curT_SHIP_REQ_REC.ORGN_SLIP_CTRL_GRP
                                                            ,curT_SHIP_REQ_REC.ORGN_SLIP_CD
                                                            ,curT_SHIP_REQ_REC.ORGN_SLIP_DATE
                                                            ,curT_SHIP_REQ_REC.ORGN_LINE_NO
                                ,curT_SHIP_REQ_REC.PLANT_CD
                                                            ) LOOP
                        IF curT_RCV_ISSUE_REC.RCV_ISSUE_CTRL_CD IS NULL THEN
                            -- 保管区別入出庫データが存在しません
                            RAISE excNotexistRcvIssue;
                        END IF;
    
--vc2RunChkComment := '★★★★通過 00200';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    
                        -- 入出庫管理番号取得
                        blnRet := FncGetNewIssueCd(pFileHandle
                                                  ,pvc2LogMode
                                                  ,pvc2OutputMode
                                                  ,pvc2UserId
                                                  ,pvc2BusinessName
                          ,pvc2PlantCd  
                                                  ,vc2NewRcvIssueCtrlCd
                                                  );
                        IF blnRet = FALSE THEN
                            RAISE excGetNewIssueCd;
                        END IF;
    
--vc2RunChkComment := '★★★★通過 00210';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    
                        -- 保管区別入出庫追加
                        INSERT INTO T_RCV_ISSUE(
                            RCV_ISSUE_CTRL_CD
                           ,RCV_ISSUE_TYP
                           ,ITEM_CD
                           ,PLANT_CD    
                           ,WH_CD
                           ,JOB_ODR_CD
                           ,JOB_ODR_DETAIL_NO
                           ,PUCH_ODR_CD
                           ,ACPT_NO
                           ,ACPT_RSLT_CRCT_NO
                           ,INSPEC_RSLT_CRCT_NO
                           ,WORK_ODR_CD
                           ,WORK_IN_PROC_CD
                           ,PARTIAL_PRD_NO
                           ,OPR_RSLT_CRCT_NO
                           ,ISSUE_INST_CD
                           ,RCV_ISSUE_QTY
                           ,RCV_ISSUE_AMOUNT
                           ,RCV_ISSUE_DATE
                           ,RCV_ISSUE_GNR_TYP
                           ,RCV_ISSUE_ODD_QTY
                           ,DEFECT_CAUSE_CD
                           ,STOCK_UPD_TYP
                           ,RCV_ISSUE_CMPLT_FLG
                           ,OD_NO
                           ,COMPANY_CD
                           ,CREATED_DATE
                           ,CREATED_BY
                           ,CREATED_PRG_NM
                           ,UPDATED_DATE
                           ,UPDATED_BY
                           ,UPDATED_PRG_NM
                           ,MODIFY_COUNT
                           ) VALUES (
                            vc2NewRcvIssueCtrlCd                     --入出庫管理番号
                           ,RCV_ISSUE_TYP_OUT                        --入出庫区分
                           ,curT_RCV_ISSUE_REC.ITEM_CD               --品目番号
                           ,curT_RCV_ISSUE_REC.PLANT_CD              --工場コード
                           ,curT_RCV_ISSUE_REC.WH_CD                 --保管区コード
                           ,curT_RCV_ISSUE_REC.JOB_ODR_CD            --製番
                           ,curT_RCV_ISSUE_REC.JOB_ODR_DETAIL_NO     --製番枝番
                           ,curT_RCV_ISSUE_REC.PUCH_ODR_CD           --発注番号
                           ,curT_RCV_ISSUE_REC.ACPT_NO               --受入回数
                           ,curT_RCV_ISSUE_REC.ACPT_RSLT_CRCT_NO     --受入実績訂正回数
                           ,curT_RCV_ISSUE_REC.INSPEC_RSLT_CRCT_NO   --検査実績訂正回数
                           ,curT_RCV_ISSUE_REC.WORK_ODR_CD           --作業計画番号
                           ,curT_RCV_ISSUE_REC.WORK_IN_PROC_CD       --仕掛作業コード
                           ,curT_RCV_ISSUE_REC.PARTIAL_PRD_NO        --分作回数
                           ,curT_RCV_ISSUE_REC.OPR_RSLT_CRCT_NO      --作業実績訂正回数
                           ,curT_RCV_ISSUE_REC.ISSUE_INST_CD         --出庫指示番号
                           ,curT_RCV_ISSUE_REC.RCV_ISSUE_QTY * -1    --入出庫数
                           ,curT_RCV_ISSUE_REC.RCV_ISSUE_AMOUNT      --入出庫金額
                           ,curT_RCV_ISSUE_REC.RCV_ISSUE_DATE        --入出庫年月
                           ,RCV_ISSUE_GNR_TYP_CANSHIP                --入出庫発生区分
                           ,curT_RCV_ISSUE_REC.RCV_ISSUE_ODD_QTY     --入出庫端数
                           ,curT_RCV_ISSUE_REC.DEFECT_CAUSE_CD       --入出庫不良理由コード
                           ,RCV_ISSUE_STOCK_UPD_COMPLTED             --在庫更新区分(2:更新済み)
                           ,curT_RCV_ISSUE_REC.RCV_ISSUE_CMPLT_FLG   --入出庫完了フラグ
                           ,curT_RCV_ISSUE_REC.OD_NO                 --オーダデマンド番号
                           ,vc2CompanyCd                             --会社コード
                           ,SYSDATE                                  --ｓｙｓ作成日時
                           ,pvc2UserId                               --ｓｙｓ作成者コード
                           ,MY_SQL_NAME
                           ,SYSDATE                                  --ｓｙｓ最新更新日時
                           ,pvc2UserId                               --ｓｙｓ最新更新者コード
                           ,MY_SQL_NAME
                           ,0
                           );
    
blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                      pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                      MY_SQL_NAME, '(SBM0700)入出庫管理番号:'|| vc2NewRcvIssueCtrlCd);
    
--vc2RunChkComment := '★★★★通過 00220';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    
----********************************************************************************************************
--      出荷処理（出荷取消）
----********************************************************************************************************          
                        -- 出荷処理起動（出荷取消）
                        blnRet := FncShip(pFileHandle
                                         ,pvc2LogMode
                                         ,pvc2OutputMode
                                         ,pvc2UserId
                                         ,pvc2BusinessName
                     ,pvc2PlantCd
                                         ,vc2NewRcvIssueCtrlCd     --新たに採番された入出庫管理番号
                                         ,numCnt_ITEM_STOCK
                                         ,numCnt_JOB_ODR_CD_STOCK
                                         );
                        IF blnRet = FALSE THEN
                            RAISE excShip;
                        END IF;
    
                    END LOOP;
    
                END IF;
            END IF;
    
        END IF;
    
        --[出荷要求]抽出件数のインクリメント
        numCnt_SHIP_REQ := numCnt_SHIP_REQ + 1;
    
    END LOOP;


    --[出荷要求]抽出件数の出力
    blnRet := FncMsgLog(pFileHandle, pVc2LogMode, pVc2OutputMode, pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                        MY_SQL_NAME, APS_PROC_CNT, '(SBM0058)【出荷要求】抽出件数： ' || numCnt_SHIP_REQ || ' 件');

    --[保管区別品目在庫]更新件数の出力
    blnRet := FncMsgLog(pFileHandle, pVc2LogMode, pVc2OutputMode, pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                        MY_SQL_NAME, APS_PROC_CNT, '(SBM0059)【保管区別品目在庫】更新件数： ' || numCnt_ITEM_STOCK || ' 件');


    -- TraceLog の出力
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 終了 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
    RETURN TRUE;
EXCEPTION
    WHEN excGetOd  THEN  --所要量取得エラー
--dbms_output.put_line('所要量取得エラー');
        ROLLBACK;
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_NOTEXIST_T_OD, '');
        -- 終了メッセージの出力
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_END, '(SBM0060)' || COMMENT_MSGLOG_SHIPEND || LOGMSG_ERR);
        -- TraceLog の出力
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;

    WHEN excInvalidMrpOdrTyp  THEN  --品目手配区分不正
--dbms_output.put_line('品目手配区分不正');
        ROLLBACK;
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_INVALID_ITEM_ODR_TYP, '');
        -- 終了メッセージの出力
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                             pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_END,'(SBM0060)' || COMMENT_MSGLOG_SHIPEND || LOGMSG_ERR);
        -- TraceLog の出力
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;

    WHEN excAutoShip  THEN  --自動出荷処理エラー
--dbms_output.put_line('自動出荷処理エラー');
        ROLLBACK;
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, 99999, '(SBM0061)自動出荷処理エラー');
        -- 終了メッセージの出力
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_END,'(SBM0060)' || COMMENT_MSGLOG_SHIPEND || LOGMSG_ERR);
        -- TraceLog の出力
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;

    WHEN excNotexistRcvIssue  THEN  --保管区別入出庫データが存在しません
--dbms_output.put_line('保管区別入出庫データが存在しません');
        ROLLBACK;
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_NOTEXIST_T_RCV_ISSUE, '');
        -- 終了メッセージの出力
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_END,'(SBM0060)' || COMMENT_MSGLOG_SHIPEND || LOGMSG_ERR);
        -- TraceLog の出力
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;

    WHEN excGetNewIssueCd  THEN  --入出庫管理番号取得エラー
--dbms_output.put_line('入出庫管理番号取得エラー');
        ROLLBACK;
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_NOTEXIST_ISSUE_CTRL_CD, '');
        -- 終了メッセージの出力
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_END,'(SBM0060)' || COMMENT_MSGLOG_SHIPEND || LOGMSG_ERR);
        -- TraceLog の出力
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;

    WHEN excGetNewShipRsvCd  THEN  --出荷保留番号取得エラー
--dbms_output.put_line('出荷保留番号取得エラー');
        ROLLBACK;
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_NOTEXIST_RSV_CD_CTRL, '');
        -- 終了メッセージの出力
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_END, '(SBM0060)' || COMMENT_MSGLOG_SHIPEND || LOGMSG_ERR);
        -- TraceLog の出力
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;

    WHEN excShip  THEN  --出荷処理エラー
--dbms_output.put_line('出荷処理エラー');
        ROLLBACK;
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, 99999, '(SBM0062)出荷処理エラー');
        -- 終了メッセージの出力
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_END,'(SBM0060)' || COMMENT_MSGLOG_SHIPEND || LOGMSG_ERR);
        -- TraceLog の出力
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;
        
    WHEN excCurCompanyCdErr THEN
        
        /* カーソルＣＬＯＳＥ（会社情報）*/
        IF curSYS_MY_COMPANY%ISOPEN = TRUE THEN
            CLOSE curSYS_MY_COMPANY;
        END IF;        
                            
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COMPANY_CD, '');
        -- 終了メッセージの出力
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_END, '(SBM0060)' || COMMENT_MSGLOG_SHIPEND || LOGMSG_ERR);
        -- TraceLog の出力
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;
        
    WHEN OTHERS THEN
        ROLLBACK;
        vc2Comment := SUBSTRB('(SBM0060)' || COMMENT_MSGLOG_SHIPEND || LOGMSG_ERR || '：' ||
                             SQLCODE || ',' || SUBSTRB(SQLERRM,1,1024),
                             1,1024);
        -- 終了メッセージの出力
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);
        -- TraceLog の出力
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        /* TraceLog の出力（実行位置） */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END || vc2RunChkComment);
        COMMIT;
        RETURN FALSE;
END;
/
