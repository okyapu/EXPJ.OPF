CREATE OR REPLACE FUNCTION  FNCCOMMITEMCHG(
----------------------------------------------------------------------------------------------------
-- version   : 1.00.00
--
-- 修正履歴
-- 2003.10.16 新規作成
-- 2004.09.24 SUBSTR→SUBSTRBに変更
-- 2005.10.21 unicode対応（varchar2を4倍）
--
--  機　能      生産要求生成処理            (Function)
--  返り値      Boolean                 True :正常終了
--                                      False:異常終了
--  引き数      pFileHandle             (i)ファイルハンドル
--              pVc2LogMode             (i)ＬＯＧモード
--              pVc2OutputMode          (i)出力モード
--              pVc2UserID              (i)ユーザ情報.ユーザID
--              pVc2BusinessName        (i)ユーザ情報.業務名
--              pvc2PlantCd             (i)工場コード
--  処理内容
--  備考
----------------------------------------------------------------------------------------------------
    pFileHandle         IN  UTL_FILE.FILE_TYPE, --ファイルハンドル
    pVc2LogMode         IN  VARCHAR2,           -- ＬＯＧモード
    pVc2OutputMode      IN  VARCHAR2,           -- 出力モード
    pVc2UserID          IN  VARCHAR2,           -- ユーザ情報.ユーザID
    pVc2BusinessName    IN  VARCHAR2,            -- ユーザ情報.業務名
    pvc2PlantCd         IN  VARCHAR2              --// 工場コード
) RETURN BOOLEAN
IS

------------------
-- カーソル宣言 --
------------------

    --【生産要求制御】 --U
    CURSOR  CurPRD_REQ_CTRL(
        cVc2PLANT_CD     VARCHAR2        --   1.工場コード
    )IS
    SELECT  PLANT_CD,                    --U   1.工場コード                  NOT NULL VARCHAR2(100)
            ALARM_PERIOD                --   2.アラーム対象期間                    NOT NULL NUMBER(2)
    FROM    SYS_PRD_REQ_CTRL            --  [生産要求制御]
    WHERE   PLANT_CD = cVc2PLANT_CD;


    --【生産要求】①    --U
    CURSOR  CurPRD_REQ_1(
        cVc2PLANT_CD     VARCHAR2        --   26.工場コード    
        )IS
    SELECT  COMPANY_CD,             --   1.会社コード              NOT NULL VARCHAR2(100)
            SLIP_TYP,               --   2.伝票種類                NOT NULL NUMBER(2)
            SLIP_CTRL_GRP,          --   3.伝票管理グループ        NOT NULL VARCHAR2(100)
            SLIP_CD,                --   4.伝票番号                NOT NULL VARCHAR2(100)
            SLIP_DATE,              --   5.伝票日付                NOT NULL DATE
            LINE_NO,                --   6.行                      NOT NULL NUMBER(6)
            UNCONFIRM_ODR_TYP,      --   7.内示受注区分            NOT NULL NUMBER(2)
            JOB_ODR_FLG,            --   8.個別受注フラグ          NOT NULL NUMBER(1)
            CUST_CD,                --   9.得意先コード                     VARCHAR2(100)
            CUST_NAME,              --  10.得意先名                         VARCHAR2(160)
            BRANCH_CD,              --  11.支店コード                       VARCHAR2(100)
            BRANCH_NAME,            --  12.支店名                           VARCHAR2(160)
            DIRECT_DLV_TYP,         --  13.直納区分                NOT NULL NUMBER(2)
            DLV_LOC_CD,             --  14.納品場所コード                   VARCHAR2(100)
            DLV_LOC_NAME,           --  15.納品場所名                       VARCHAR2(160)
            COMM_CD,                --  16.商品コード                       VARCHAR2(100)
            COMM_NAME,              --  17.商品名                           VARCHAR2(160)
            SPEC,                   --  18.規格                             VARCHAR2(160)
            COMM_SIZE,              --  19.サイズ                           VARCHAR2(100)
            COLOR,                  --  20.色                               VARCHAR2(160)
            PRD_COMM_CODE_CHG_TYP,  --  21.製品／商品変換区分      NOT NULL NUMBER(2)
            SCDL_SHIP_DATE,         --  22.出荷予定日              NOT NULL DATE
            SCDL_DLV_DATE,          --  23.納品予定日              NOT NULL DATE
            REQ_PRD_ISSUE_DATE,     --  24.出庫要求日              NOT NULL DATE
            SHIP_WH_CD,             --  25.出荷倉庫コード          NOT NULL VARCHAR2(100)
--
                    PLANT_CD,           --  26.工場コード              NOT NULL VARCHAR2(8) 
            WH_CD,                  --  27.保管区コード                     VARCHAR2(100)
            REQ_PRD_QTY,            --  28.要求数量                NOT NULL NUMBER(18,4)
            TOTAL_SHIP_QTY,         --  29.出荷実績累計数          NOT NULL NUMBER(18,4)
            ODR_CHG_FLG,            --  30.受注変動許可フラグ      NOT NULL NUMBER(1)
            ODR_DEL_FLG,            --  31.受注削除フラグ          NOT NULL NUMBER(1)
            ODR_ACPT_JOB_ODR_NO,    --  32.受注製番                         VARCHAR2(100)
            ITEM_CD,                --  33.品目番号                         VARCHAR2(100)
            MRP_ODR_TYP,            --  34.品目手配区分            NOT NULL NUMBER(2)
            OD_TYP,      --  35.オーダデマンド区分      NOT NULL NUMBER(2)
            OD_NO,        --  36.オーダデマンド番号      NOT NULL NUMBER(14)
            JOB_ODR_CD,             --  37.製番                             VARCHAR2(100)
            JOB_ODR_DETAIL_NO,      --  38.製番枝番                NOT NULL NUMBER(6)
            PRD_PLAN_TYP,           --  39.生産計画対象区分        NOT NULL NUMBER(2)
            PRD_ERROR_TYP,          --  40.生産情報エラー区分      NOT NULL NUMBER(2)
            PRD_ALARM_FLG,          --  41.生産アラームフラグ      NOT NULL NUMBER(1)
            PRVS_COMM_CD,           --  42.前回商品コード                   VARCHAR2(100)
            PRVS_COMM_NAME,         --  43.前回商品名                       VARCHAR2(160)
            PRVS_SPEC,              --  44.前回規格                         VARCHAR2(160)
            PRVS_ITEM_CD,           --  45.前回品目番号                     VARCHAR2(100)
            PRVS_MRP_ODR_TYP,       --  46.前回品目手配区分        NOT NULL NUMBER(2)
            PRVS_SCDL_SHIP_DATE,    --  47.前回出荷予定日                   DATE
            PRVS_DLV_DATE,          --  48.前回納品予定日                   DATE
            PRVS_ODR_SHIP_DATE,     --  49.前回出庫要求日                   DATE
            PRVS_REQ_QTY,           --  50.前回要求数量            NOT NULL NUMBER(18,4)
            PRVS_OD_NO,             --  51.前回オーダデマンド番号  NOT NULL NUMBER(14)
            PRVS_JOB_ODR_CD,        --  52.前回製番                         VARCHAR2(100)
            PRVS_JOB_ODR_DETAIL_NO, --  53.前回製番枝番            NOT NULL NUMBER(6)
--            
                    SEQ_NO,                             --  54.発生連番                NOT NULL NUMBER(6)           
                    CREATED_DATE,           --  55.作成日                  NOT NULL DATE
            CREATED_BY,             --  56.作成者              NOT NULL VARCHAR2(100)
            CREATED_PRG_NM,         --  57.作成プログラム名        NOT NULL VARCHAR2(120)
            UPDATED_DATE,           --  58.更新日              NOT NULL DATE
            UPDATED_BY,             --  59.更新者              NOT NULL VARCHAR2(100)
            UPDATED_PRG_NM,         --  60.更新プログラム名  　    NOT NULL VARCHAR2(120)
            MODIFY_COUNT            --  61.更新数                  NOT NULL NUMBER
    FROM    T_PRD_REQ               --[生産要求]
    WHERE PLANT_CD = cVc2PLANT_CD    --U
    ORDER BY COMPANY_CD
            ,SLIP_TYP
            ,SLIP_CTRL_GRP
            ,SLIP_CD
            ,SLIP_DATE
            ,SEQ_NO
    FOR UPDATE;

    --【生産要求】②  --U
    CURSOR  CurPRD_REQ_2(
        cVc2COMPANY_CD      VARCHAR2,   --   1.会社コード
        cNumSLIP_TYP        NUMBER,     --   2.伝票種類
        cVc2SLIP_CTRL_GRP   VARCHAR2,   --   3.伝票管理グループ
        cVc2SLIP_CD         VARCHAR2,   --   4.伝票番号
        cDtmSLIP_DATE       DATE,       --   5.伝票日付
        cNumSEQ_NO          NUMBER,      --   59.発生連番
        cVc2PLANT_CD        VARCHAR2   --   26.工場コード
    )IS
    SELECT  COMPANY_CD,             --   1.会社コード              NOT NULL VARCHAR2(100)
            SLIP_TYP,               --   2.伝票種類                NOT NULL NUMBER(2)
            SLIP_CTRL_GRP,          --   3.伝票管理グループ        NOT NULL VARCHAR2(100)
            SLIP_CD,                --   4.伝票番号                NOT NULL VARCHAR2(100)
            SLIP_DATE,              --   5.伝票日付                NOT NULL DATE
            LINE_NO,                --   6.行                      NOT NULL NUMBER(6)
            UNCONFIRM_ODR_TYP,      --   7.内示受注区分            NOT NULL NUMBER(2)
            JOB_ODR_FLG,            --   8.個別受注フラグ          NOT NULL NUMBER(1)
            CUST_CD,                --   9.得意先コード                     VARCHAR2(100)
            CUST_NAME,              --  10.得意先名                         VARCHAR2(160)
            BRANCH_CD,              --  11.支店コード                       VARCHAR2(100)
            BRANCH_NAME,            --  12.支店名                           VARCHAR2(160)
            DIRECT_DLV_TYP,         --  13.直納区分                NOT NULL NUMBER(2)
            DLV_LOC_CD,             --  14.納品場所コード                   VARCHAR2(100)
            DLV_LOC_NAME,           --  15.納品場所名                       VARCHAR2(160)
            COMM_CD,                --  16.商品コード                       VARCHAR2(100)
            COMM_NAME,              --  17.商品名                           VARCHAR2(160)
            SPEC,                   --  18.規格                             VARCHAR2(160)
            COMM_SIZE,              --  19.サイズ                           VARCHAR2(100)
            COLOR,                  --  20.色                               VARCHAR2(160)
            PRD_COMM_CODE_CHG_TYP,  --  21.製品／商品変換区分      NOT NULL NUMBER(2)
            SCDL_SHIP_DATE,         --  22.出荷予定日              NOT NULL DATE
            SCDL_DLV_DATE,          --  23.納品予定日              NOT NULL DATE
            REQ_PRD_ISSUE_DATE,     --  24.出庫要求日              NOT NULL DATE
            SHIP_WH_CD,             --  25.出荷倉庫コード          NOT NULL VARCHAR2(100)
--
                    PLANT_CD,                           --  26.工場コード              NOT NULL VARCHAR2(8) 
            WH_CD,                  --  27.保管区コード                     VARCHAR2(100)
            REQ_PRD_QTY,            --  28.要求数量                NOT NULL NUMBER(18,4)
            TOTAL_SHIP_QTY,         --  29.出荷実績累計数          NOT NULL NUMBER(18,4)
            ODR_CHG_FLG,            --  30.受注変動許可フラグ      NOT NULL NUMBER(1)
            ODR_DEL_FLG,            --  31.受注削除フラグ          NOT NULL NUMBER(1)
            ODR_ACPT_JOB_ODR_NO,    --  32.受注製番                         VARCHAR2(100)
            ITEM_CD,                --  33.品目番号                         VARCHAR2(100)
            MRP_ODR_TYP,            --  34.品目手配区分            NOT NULL NUMBER(2)
            OD_TYP,      --  35.オーダデマンド区分      NOT NULL NUMBER(2)
            OD_NO,        --  36.オーダデマンド番号      NOT NULL NUMBER(14)
            JOB_ODR_CD,             --  37.製番                             VARCHAR2(100)
            JOB_ODR_DETAIL_NO,      --  38.製番枝番                NOT NULL NUMBER(6)
            PRD_PLAN_TYP,           --  39.生産計画対象区分        NOT NULL NUMBER(2)
            PRD_ERROR_TYP,          --  40.生産情報エラー区分      NOT NULL NUMBER(2)
            PRD_ALARM_FLG,          --  41.生産アラームフラグ      NOT NULL NUMBER(1)
            PRVS_COMM_CD,           --  42.前回商品コード                   VARCHAR2(100)
            PRVS_COMM_NAME,         --  43.前回商品名                       VARCHAR2(160)
            PRVS_SPEC,              --  44.前回規格                         VARCHAR2(160)
            PRVS_ITEM_CD,           --  45.前回品目番号                     VARCHAR2(100)
            PRVS_MRP_ODR_TYP,       --  46.前回品目手配区分        NOT NULL NUMBER(2)
            PRVS_SCDL_SHIP_DATE,    --  47.前回出荷予定日                   DATE
            PRVS_DLV_DATE,          --  48.前回納品予定日                   DATE
            PRVS_ODR_SHIP_DATE,     --  49.前回出庫要求日                   DATE
            PRVS_REQ_QTY,           --  50.前回要求数量            NOT NULL NUMBER(18,4)
            PRVS_OD_NO,             --  51.前回オーダデマンド番号  NOT NULL NUMBER(14)
            PRVS_JOB_ODR_CD,        --  52.前回製番                         VARCHAR2(100)
            PRVS_JOB_ODR_DETAIL_NO, --  53.前回製番枝番            NOT NULL NUMBER(6)
--            
        SEQ_NO,         --  54.発生連番                NOT NULL NUMBER(6)           
        CREATED_DATE,           --  55.作成日                  NOT NULL DATE
            CREATED_BY,             --  56.作成者              NOT NULL VARCHAR2(100)
            CREATED_PRG_NM,         --  57.作成プログラム名        NOT NULL VARCHAR2(120)
            UPDATED_DATE,           --  58.更新日              NOT NULL DATE
            UPDATED_BY,             --  59.更新者              NOT NULL VARCHAR2(100)
            UPDATED_PRG_NM,         --  60.更新プログラム名  　    NOT NULL VARCHAR2(120)
            MODIFY_COUNT            --  61.更新数                  NOT NULL NUMBER
    FROM    T_PRD_REQ           --[生産要求]
    WHERE   COMPANY_CD      = cVc2COMPANY_CD            --   1.会社コード
    AND     SLIP_TYP        = cNumSLIP_TYP              --   2.伝票種類
    AND     SLIP_CTRL_GRP   = cVc2SLIP_CTRL_GRP         --   3.伝票管理グループ
    AND     SLIP_CD         = cVc2SLIP_CD               --   4.伝票番号
    AND     SLIP_DATE       = cDtmSLIP_DATE             --   5.伝票日付
    AND     SEQ_NO          = cNumSEQ_NO                --   59.発生連番
    AND     PLANT_CD = cVc2PLANT_CD             --   工場コード　　　　　U
    FOR UPDATE;

    --【生産要求インタフェース】
    CURSOR  CurREQ_PRD_ODR_IF(
        cVc2PLANT_CD     VARCHAR2        --   25.工場コード    
        )IS
    SELECT  COMPANY_CD,                 --   1.会社コード              NOT NULL VARCHAR2(100)
            SLIP_TYP,                   --   2.伝票種類                NOT NULL NUMBER(2)
            SLIP_CTRL_GRP,              --   3.伝票管理グループ        NOT NULL VARCHAR2(100)
            SLIP_CD,                    --   4.伝票番号                NOT NULL VARCHAR2(100)
            SLIP_DATE,                  --   5.伝票日付                NOT NULL DATE
            LINE_NO,                    --   6.行                      NOT NULL NUMBER(6)
            UNCONFIRM_ODR_TYP,          --   7.内示受注区分            NOT NULL NUMBER(2)
            JOB_ODR_FLG,                --   8.個別受注フラグ          NOT NULL NUMBER(1)
            CUST_CD,                    --   9.得意先コード                     VARCHAR2(100)
            CUST_NAME,                  --  10.得意先名                         VARCHAR2(160)
            BRANCH_CD,                  --  11.支店コード                       VARCHAR2(100)
            BRANCH_NAME,                --  12.支店名                           VARCHAR2(160)
            DIRECT_DLV_TYP,             --  13.直納区分                NOT NULL NUMBER(2)
            DLV_LOC_CD,                 --  14.納品場所コード                   VARCHAR2(100)
            DLV_LOC_NAME,               --  15.納品場所名                       VARCHAR2(160)
            COMM_CD,                    --  16.商品コード                       VARCHAR2(100)
            COMM_NAME,                  --  17.商品名                           VARCHAR2(160)
            SPEC,                       --  18.規格                             VARCHAR2(160)
            COMM_SIZE,                  --  19.サイズ                           VARCHAR2(100)
            COLOR,                      --  20.色                               VARCHAR2(160)
            PRD_COMM_CODE_CHG_TYP,      --  21.製品／商品変換区分      NOT NULL NUMBER(2)
            SCDL_SHIP_DATE,             --  22.出荷予定日              NOT NULL DATE
            SCDL_DLV_DATE,              --  23.納品予定日              NOT NULL DATE
            REQ_PRD_ISSUE_DATE,         --  24.出庫要求日              NOT NULL DATE
            PLANT_CD,                   --  25.工場コード          NOT NULL VARCHAR2(8) 
            SHIP_WH_CD,                 --  26.出荷倉庫コード          NOT NULL VARCHAR2(100)
            WH_CD,                      --  27.保管区コード                     VARCHAR2(100)
            REQ_PRD_QTY,                --  28.要求数量                NOT NULL NUMBER(18,4)
            TOTAL_SHIP_QTY,             --  29.出荷実績累計数          NOT NULL NUMBER(18,4)
            ODR_CHG_FLG,                --  30.受注変動許可フラグ      NOT NULL NUMBER(1)
            ODR_DEL_FLG,                --  31.受注削除フラグ          NOT NULL NUMBER(1)
            ODR_ACPT_JOB_ODR_NO,        --  32.受注製番                         VARCHAR2(100)
            ITEM_CD,                    --  33.品目番号                         VARCHAR2(100)
            MRP_ODR_TYP,                --  34.品目手配区分            NOT NULL NUMBER(2)
            OD_TYP,          --  35.オーダデマンド区分      NOT NULL NUMBER(2)
            OD_NO,            --  36.オーダデマンド番号      NOT NULL NUMBER(14)
            JOB_ODR_CD,                 --  37.製番                             VARCHAR2(100)
            JOB_ODR_DETAIL_NO,          --  38.製番枝番                NOT NULL NUMBER(6)
            PRD_ERROR_TYP,              --  39.生産情報エラー区分      NOT NULL NUMBER(2)
            SEQ_NO,                      --  42.発生連番               NUMBER(6,0) DEFAULT 0 NOT NULL
            CREATED_DATE,                --  43.作成日             DATE DEFAULT sysdate NOT NULL
            CREATED_BY,                  --  44.作成者                  VARCHAR2(100) DEFAULT 'SYSTEM' NOT NULL
            CREATED_PRG_NM,              --  45.作成プログラム          VARCHAR2(120) DEFAULT 'SYSTEM' NOT NULL
            UPDATED_DATE,                --  46.更新日                  DATE DEFAULT sysdate NOT NULL
            UPDATED_BY,                  --  47.更新者                  VARCHAR2(100) DEFAULT 'SYSTEM' NOT NULL
            UPDATED_PRG_NM,              --  48.更新プログラム          VARCHAR2(120) DEFAULT 'SYSTEM' NOT NULL
            MODIFY_COUNT                --  49.更新数                  NUMBER DEFAULT 0 NOT NULL
    FROM    T_REQ_PRD_ODR_IF            --[生産要求インタフェース]
    WHERE   PLANT_CD = cVc2PLANT_CD             --   工場コード　　　　　U
    ORDER BY
             SLIP_CD
            ,SEQ_NO
            ,SLIP_DATE
            ,SLIP_CTRL_GRP
            ,COMPANY_CD
            ,SLIP_TYP
    FOR UPDATE;

    --【品目】
    CURSOR  CurITEM(
        cVc2ITEM_CD     VARCHAR2        --品目番号
    )IS
    SELECT  MRP_ODR_TYP                --品目手配区分
    FROM    M_ITEM                      --[品目]
    WHERE   ITEM_CD = cVc2ITEM_CD;      --品目番号

-----------------
-- ROWTYPE宣言 --
-----------------
    RtpPRD_REQ_CTRL     CurPRD_REQ_CTRL%ROWTYPE;        --【生産要求制御】
    RtpPRD_REQ          CurPRD_REQ_1%ROWTYPE;           --【生産要求】
    RtpREQ_PRD_ODR_IF   CurREQ_PRD_ODR_IF%ROWTYPE;      --【生産要求インタフェース】
    RtpITEM             CurITEM%ROWTYPE;                --【品目】

-----------------
-- CONST値宣言 --
-----------------
    MY_SQL_NAME         VARCHAR2(120) := 'FncCommitemChg';
    CTRL_CD_DEFAULT     VARCHAR2(24)  := 'SYSTEM';               --コントロール系テーブルのPrimaryKeyの値

-----------------
-- MESSAGE宣言 --
-----------------
    APS_COM_ORACLE_ERR  VARCHAR2(28)   := 'AK53401';       --ORACLE Error
    APS_COM_OTHER_ERR   VARCHAR2(28)   := 'AK53402';       --その他 Error
    APS_PROC_CNT        VARCHAR2(28)   := 'AK53412';       --処理件数

-------------
-- LOG宣言 --
-------------
    LOGMSG_START        VARCHAR2(20) := 'Start';     -- ログ用メソッド開始宣言
    LOGMSG_END          VARCHAR2(12) := 'End';       -- ログ用メソッド終了宣言
    LOGMSG_ERR          VARCHAR2(32) := '異常終了';
--------------
-- WORK変数 --
--------------
    BlnRet                      BOOLEAN;        -- Function返却値
    vc2Comment                  VARCHAR2(1024);  -- メッセージ用コメント作成作業領域
    NumErrNumber                NUMBER(5);
    DtmBusinessOprDate          DATE;
    DtmActiveDate1              DATE;
    DtmActiveDate2              DATE;
    vc2RunChkComment            VARCHAR2(1024);  --実行位置確認用コメント作成作業領域
    NumCnt_REQ_PRD_ODR_IF       NUMBER(10);     --【生産要求インタフェース】処理件数
    num_REQ_PRD_ODR_IF_Count    NUMBER(10);     --【生産要求インタフェース】抽出件数
    num_PRD_REQ_Count           NUMBER(10);     --【生産要求ファイル】抽出件数
    BlnPRD_REQ_FOUND            BOOLEAN;

----------------
-- エラー処理 --
----------------
    Err_FncGetBusinessDate      EXCEPTION;      --[業務運用日付取得]実行エラー
    Err_NOT_PRD_REQ_CTRL        EXCEPTION;      --[生産要求制御]NOT FOUND
    Err_FncWorkDayCalc          EXCEPTION;      --[稼働日自動算出]実行エラー

BEGIN

    -- TraceLog の出力
    blnRet := FncTraceLog(pFileHandle, pVc2LogMode, pVc2OutputMode, 
                          pvc2UserId,  pvc2BusinessName, pvc2PlantCd,MY_SQL_NAME,LOGMSG_START);

--vc2RunChkComment := 'COMMITEMCHG_001';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    --業務運用日付を取得
    blnRet := FncGetBusinessDate(pFileHandle,   pVc2LogMode,        pVc2OutputMode,  
                                 pvc2UserId,    pvc2BusinessName, pvc2PlantCd,  DtmBusinessOprDate); --U
    IF BlnRet = FALSE THEN
        RAISE Err_FncGetBusinessDate;       --[業務運用日付取得]実行エラー
    END IF;

--vc2RunChkComment := 'COMMITEMCHG_002';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    --アラーム対象期間取得
    OPEN CurPRD_REQ_CTRL(pvc2PlantCd);
    FETCH CurPRD_REQ_CTRL INTO RtpPRD_REQ_CTRL;
    IF CurPRD_REQ_CTRL%NOTFOUND THEN
        CLOSE CurPRD_REQ_CTRL;
        RAISE Err_NOT_PRD_REQ_CTRL;         --[生産要求制御]NOT FOUND
    END IF;
    CLOSE CurPRD_REQ_CTRL;

--vc2RunChkComment := 'COMMITEMCHG_003';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    --稼働日自動算出
    blnRet := FncWorkDayCalc(pFileHandle,       pVc2LogMode,    pVc2OutputMode,      pvc2UserId,
                             pvc2BusinessName,  pvc2PlantCd,    null,                DtmBusinessOprDate, RtpPRD_REQ_CTRL.ALARM_PERIOD,
                             FALSE,             DtmActiveDate1);
    IF BlnRet = FALSE THEN
        RAISE Err_FncWorkDayCalc;           --[稼働日自動算出]実行エラー
    END IF;

--vc2RunChkComment := 'COMMITEMCHG_004';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    --【生産要求インタフェース】処理件数の初期化
    NumCnt_REQ_PRD_ODR_IF := 0;

    --【生産要求ファイル】のデータ件数取得
    SELECT COUNT(*) INTO num_PRD_REQ_Count
      FROM T_PRD_REQ WHERE COMM_CD IS NOT NULL
      AND PLANT_CD =    pvc2PlantCd;  --U

    --【生産要求インタフェース】のデータ件数取得
    SELECT COUNT(*) INTO num_REQ_PRD_ODR_IF_Count
      FROM T_REQ_PRD_ODR_IF WHERE PLANT_CD =    pvc2PlantCd; --U

--vc2RunChkComment := 'COMMITEMCHG_005';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    --【生産要求ファイル】のデータ件数 > 0
    IF num_PRD_REQ_Count > 0 THEN

--vc2RunChkComment := 'COMMITEMCHG_006';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        OPEN CurPRD_REQ_1(pvc2PlantCd);  --[生産要求ファイル]
        LOOP
            FETCH CurPRD_REQ_1 INTO RtpPRD_REQ;
            IF CurPRD_REQ_1%NOTFOUND THEN
                EXIT;
            END IF;

--vc2RunChkComment := 'COMMITEMCHG_007';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

            --生産要求ファイル.商品コード = NULLの場合、生産要求ファイル削除
            --NULL以外の場合、生産要求の新情報の項目を旧情報の項目へ移送し、新情報の項目を初期化した後で更新を行う。
            DELETE  T_PRD_REQ       --[生産要求]
                WHERE   COMPANY_CD      = RtpPRD_REQ.COMPANY_CD         --   1.会社コード
                AND     SLIP_TYP        = RtpPRD_REQ.SLIP_TYP           --   2.伝票種類
                AND     SLIP_CTRL_GRP   = RtpPRD_REQ.SLIP_CTRL_GRP      --   3.伝票管理グループ
                AND     SLIP_CD         = RtpPRD_REQ.SLIP_CD            --   4.伝票番号
                AND     SLIP_DATE       = RtpPRD_REQ.SLIP_DATE          --   5.伝票日付
                AND     LINE_NO         = RtpPRD_REQ.LINE_NO            --   6.行
        AND       PLANT_CD  = pvc2PlantCd;                --U



            IF RtpPRD_REQ.COMM_CD IS NULL THEN
                NULL;
            ELSE

                RtpPRD_REQ.PRVS_COMM_CD             := RtpPRD_REQ.COMM_CD;              --  42.前回商品コード                   VARCHAR2(100)
                RtpPRD_REQ.PRVS_COMM_NAME           := RtpPRD_REQ.COMM_NAME;            --  43.前回商品名                       VARCHAR2(160)
                RtpPRD_REQ.PRVS_SPEC                := RtpPRD_REQ.SPEC;                 --  44.前回規格                         VARCHAR2(160)
                RtpPRD_REQ.PRVS_ITEM_CD             := RtpPRD_REQ.ITEM_CD;              --  45.前回品目番号                     VARCHAR2(100)
                RtpPRD_REQ.PRVS_MRP_ODR_TYP         := RtpPRD_REQ.MRP_ODR_TYP;          --  46.前回品目手配区分        NOT NULL NUMBER(2)
                RtpPRD_REQ.PRVS_SCDL_SHIP_DATE      := RtpPRD_REQ.SCDL_SHIP_DATE;       --  47.前回出荷予定日                   DATE
                RtpPRD_REQ.PRVS_DLV_DATE            := RtpPRD_REQ.SCDL_DLV_DATE;        --  48.前回納品予定日                   DATE
                RtpPRD_REQ.PRVS_ODR_SHIP_DATE       := RtpPRD_REQ.REQ_PRD_ISSUE_DATE;   --  49.前回出庫要求日                   DATE
                RtpPRD_REQ.PRVS_REQ_QTY             := RtpPRD_REQ.REQ_PRD_QTY;          --  50.前回要求数量            NOT NULL NUMBER(18,4)
                RtpPRD_REQ.PRVS_OD_NO               := RtpPRD_REQ.OD_NO;      --  51.前回オーダデマンド番号  NOT NULL NUMBER(14)
                RtpPRD_REQ.PRVS_JOB_ODR_CD          := RtpPRD_REQ.JOB_ODR_CD;           --  52.前回製番                         VARCHAR2(100)
                RtpPRD_REQ.PRVS_JOB_ODR_DETAIL_NO   := RtpPRD_REQ.JOB_ODR_DETAIL_NO;    --  53.前回製番枝番            NOT NULL NUMBER(6)

                RtpPRD_REQ.UNCONFIRM_ODR_TYP        := 0;                               --   7.内示受注区分            NOT NULL NUMBER(2)
                RtpPRD_REQ.JOB_ODR_FLG              := 0;                               --   8.個別受注フラグ          NOT NULL NUMBER(1)
                RtpPRD_REQ.CUST_CD                  := NULL;                            --   9.得意先コード                     VARCHAR2(100)
                RtpPRD_REQ.CUST_NAME                := NULL;                            --  10.得意先名                         VARCHAR2(160)
                RtpPRD_REQ.BRANCH_CD                := NULL;                            --  11.支店コード                       VARCHAR2(100)
                RtpPRD_REQ.BRANCH_NAME              := NULL;                            --  12.支店名                           VARCHAR2(160)
                RtpPRD_REQ.DIRECT_DLV_TYP           := 0;                               --  13.直納区分                NOT NULL NUMBER(2)
                RtpPRD_REQ.DLV_LOC_CD               := NULL;                            --  14.納品場所コード                   VARCHAR2(100)
                RtpPRD_REQ.DLV_LOC_NAME             := NULL;                            --  15.納品場所名                       VARCHAR2(160)
                RtpPRD_REQ.COMM_CD                  := NULL;                            --  16.商品コード                       VARCHAR2(100)
                RtpPRD_REQ.COMM_NAME                := NULL;                            --  17.商品名                           VARCHAR2(160)
                RtpPRD_REQ.SPEC                     := NULL;                            --  18.規格                             VARCHAR2(160)
                RtpPRD_REQ.COMM_SIZE                := NULL;                            --  19.サイズ                           VARCHAR2(100)
                RtpPRD_REQ.COLOR                    := NULL;                            --  20.色                               VARCHAR2(160)
                RtpPRD_REQ.PRD_COMM_CODE_CHG_TYP    := 0;                               --  21.製品／商品変換区分      NOT NULL NUMBER(2)
        RtpPRD_REQ.WH_CD                    := NULL;                            --  27.保管区コード                     VARCHAR2(100)
                RtpPRD_REQ.REQ_PRD_QTY              := 0;                               --  28.要求数量                NOT NULL NUMBER(18,4)
                RtpPRD_REQ.TOTAL_SHIP_QTY           := 0;                               --  29.出荷実績累計数          NOT NULL NUMBER(18,4)
                RtpPRD_REQ.ODR_CHG_FLG              := 0;                               --  30.受注変動許可フラグ      NOT NULL NUMBER(1)
                RtpPRD_REQ.ODR_DEL_FLG              := 0;                               --  31.受注削除フラグ          NOT NULL NUMBER(1)
                RtpPRD_REQ.ODR_ACPT_JOB_ODR_NO      := NULL;                            --  32.受注製番                         VARCHAR2(100)
                RtpPRD_REQ.ITEM_CD                  := NULL;                            --  33.品目番号                         VARCHAR2(100)
                RtpPRD_REQ.OD_TYP        := 0;                               --  35.オーダデマンド区分      NOT NULL NUMBER(2)
                RtpPRD_REQ.OD_NO          := 0;                               --  36.オーダデマンド番号      NOT NULL NUMBER(14)
                RtpPRD_REQ.JOB_ODR_CD               := '0';                             --  37.製番                             VARCHAR2(100)
                RtpPRD_REQ.JOB_ODR_DETAIL_NO        := 0;                               --  38.製番枝番                NOT NULL NUMBER(6)
                RtpPRD_REQ.PRD_PLAN_TYP             := 2;                               --  39.生産計画対象区分        NOT NULL NUMBER(2)
                RtpPRD_REQ.PRD_ALARM_FLG            := 0;                               --  41.生産アラームフラグ      NOT NULL NUMBER(1)

                INSERT INTO T_PRD_REQ(
                    COMPANY_CD,             SLIP_TYP,               --   1.会社コード            2.伝票種類
                    SLIP_CTRL_GRP,          SLIP_CD,                --   3.伝票管理グループ      4.伝票番号
                    SLIP_DATE,              LINE_NO,                --   5.伝票日付              6.行
                    UNCONFIRM_ODR_TYP,      JOB_ODR_FLG,            --   7.内示受注区分          8.個別受注フラグ
                    CUST_CD,                CUST_NAME,              --   9.得意先コード         10.得意先名
                    BRANCH_CD,              BRANCH_NAME,            --  11.支店コード           12.支店名
                    DIRECT_DLV_TYP,         DLV_LOC_CD,             --  13.直納区分             14.納品場所コード
                    DLV_LOC_NAME,           COMM_CD,                --  15.納品場所名           16.商品コード
                    COMM_NAME,              SPEC,                   --  17.商品名               18.規格
                    COMM_SIZE,              COLOR,                  --  19.サイズ               20.色
                    PRD_COMM_CODE_CHG_TYP,  SCDL_SHIP_DATE,         --  21.製品／商品変換区分   22.出荷予定日
                    SCDL_DLV_DATE,          REQ_PRD_ISSUE_DATE,     --  23.納品予定日           24.出庫要求日
                SHIP_WH_CD,                             --  25.出荷倉庫コード
--
            PLANT_CD,                               --  26.工場コード
--
                    WH_CD,                      --  27.保管区コード 
                    REQ_PRD_QTY,            TOTAL_SHIP_QTY,         --  28.要求数量             29.出荷実績累計数
                    ODR_CHG_FLG,            ODR_DEL_FLG,            --  30.受注変動許可フラグ   31.受注削除フラグ
                    ODR_ACPT_JOB_ODR_NO,    ITEM_CD,                --  32.受注製番             33.品目番号
                    MRP_ODR_TYP,            OD_TYP,      --  34.品目手配区分         35.オーダデマンド区分
                    OD_NO,        JOB_ODR_CD,             --  36.オーダデマンド番号   37.製番
                    JOB_ODR_DETAIL_NO,      PRD_PLAN_TYP,           --  38.製番枝番             39.生産計画対象区分
                    PRD_ERROR_TYP,          PRD_ALARM_FLG,          --  40.生産情報エラー区分   41.生産アラームフラグ
                    PRVS_COMM_CD,           PRVS_COMM_NAME,         --  42.前回商品コード       43.前回商品名
                    PRVS_SPEC,              PRVS_ITEM_CD,           --  44.前回規格             45.前回品目番号
                    PRVS_MRP_ODR_TYP,       PRVS_SCDL_SHIP_DATE,    --  46.前回品目手配区分     47.前回出荷予定日
                    PRVS_DLV_DATE,          PRVS_ODR_SHIP_DATE,     --  48.前回納品予定日       49.前回出庫要求日
                    PRVS_REQ_QTY,           PRVS_OD_NO,             --  50.前回要求数量         51.前回オーダデマンド番号
                    PRVS_JOB_ODR_CD,        PRVS_JOB_ODR_DETAIL_NO, --  52.前回製番             53.前回製番枝番
--
            SEQ_NO,                     --  54.発生連番 
            CREATED_DATE,       CREATED_BY        , --  55.作成日       56.作成者                      
            CREATED_PRG_NM,     UPDATED_DATE      , --  57.作成プログラム名 58.更新日
            UPDATED_BY,         UPDATED_PRG_NM        , --  59.更新者               60.更新プログラム名         
            MODIFY_COUNT                        --  61.更新数 
--
                )VALUES(
                    RtpPRD_REQ.COMPANY_CD,              RtpPRD_REQ.SLIP_TYP,                --  1,  2,
                    RtpPRD_REQ.SLIP_CTRL_GRP,           RtpPRD_REQ.SLIP_CD,                 --  3,  4,
                    RtpPRD_REQ.SLIP_DATE,               RtpPRD_REQ.LINE_NO,                 --  5,  6,
                    RtpPRD_REQ.UNCONFIRM_ODR_TYP,       RtpPRD_REQ.JOB_ODR_FLG,             --  7,  8,
                    RtpPRD_REQ.CUST_CD,                 RtpPRD_REQ.CUST_NAME,               --  9, 10,
                    RtpPRD_REQ.BRANCH_CD,               RtpPRD_REQ.BRANCH_NAME,             -- 11, 12,
                    RtpPRD_REQ.DIRECT_DLV_TYP,          RtpPRD_REQ.DLV_LOC_CD,              -- 13, 14,
                    RtpPRD_REQ.DLV_LOC_NAME,            RtpPRD_REQ.COMM_CD,                 -- 15, 16,
                    RtpPRD_REQ.COMM_NAME,               RtpPRD_REQ.SPEC,                    -- 17, 18,
                    RtpPRD_REQ.COMM_SIZE,               RtpPRD_REQ.COLOR,                   -- 19, 20,
                    RtpPRD_REQ.PRD_COMM_CODE_CHG_TYP,   RtpPRD_REQ.SCDL_SHIP_DATE,          -- 21, 22,
                    RtpPRD_REQ.SCDL_DLV_DATE,           RtpPRD_REQ.REQ_PRD_ISSUE_DATE,      -- 23, 24,
                    RtpPRD_REQ.SHIP_WH_CD,                                      --25,
            
--
            RtpPRD_REQ.PLANT_CD,                            --26 工場コード
--
            RtpPRD_REQ.WH_CD,                   -- 27, 
                    RtpPRD_REQ.REQ_PRD_QTY,             RtpPRD_REQ.TOTAL_SHIP_QTY,          -- 28, 29,
                    RtpPRD_REQ.ODR_CHG_FLG,             RtpPRD_REQ.ODR_DEL_FLG,             -- 30, 31,
                    RtpPRD_REQ.ODR_ACPT_JOB_ODR_NO,     RtpPRD_REQ.ITEM_CD,                 -- 32, 33,
                    RtpPRD_REQ.MRP_ODR_TYP,             RtpPRD_REQ.OD_TYP,       -- 34, 35,
                    RtpPRD_REQ.OD_NO,               RtpPRD_REQ.JOB_ODR_CD,              -- 36, 37,
                    RtpPRD_REQ.JOB_ODR_DETAIL_NO,       RtpPRD_REQ.PRD_PLAN_TYP,            -- 38, 39,
                    RtpPRD_REQ.PRD_ERROR_TYP,           RtpPRD_REQ.PRD_ALARM_FLG,           -- 40, 41,
                    RtpPRD_REQ.PRVS_COMM_CD,            RtpPRD_REQ.PRVS_COMM_NAME,          -- 42, 43,
                    RtpPRD_REQ.PRVS_SPEC,               RtpPRD_REQ.PRVS_ITEM_CD,            -- 44, 45,
                    RtpPRD_REQ.PRVS_MRP_ODR_TYP,        RtpPRD_REQ.PRVS_SCDL_SHIP_DATE,     -- 46, 47,
                    RtpPRD_REQ.PRVS_DLV_DATE,           RtpPRD_REQ.PRVS_ODR_SHIP_DATE,      -- 48, 49,
                    RtpPRD_REQ.PRVS_REQ_QTY,            RtpPRD_REQ.PRVS_OD_NO,              -- 50, 51,
                    RtpPRD_REQ.PRVS_JOB_ODR_CD,         RtpPRD_REQ.PRVS_JOB_ODR_DETAIL_NO,  -- 52, 53,
--
            RtpPRD_REQ.SEQ_NO,                              -- 54 SEQ_NO,
            RtpPRD_REQ.CREATED_DATE,        RtpPRD_REQ.CREATED_BY,          -- 55,56,                    
            RtpPRD_REQ.CREATED_PRG_NM,          SYSDATE,                            -- 57,58,
                    pVc2UserID,                 MY_SQL_NAME,                -- 59,60,
            RtpPRD_REQ.MODIFY_COUNT + 1                                          -- 61
                );
            END IF;
        END LOOP;
        CLOSE CurPRD_REQ_1;

        --【生産要求インタフェース】のデータ件数 <= 0
        IF num_REQ_PRD_ODR_IF_Count <= 0 THEN
            DELETE  T_REQ_PRD_ODR_IF         --[生産要求インタフェース]
              WHERE   PLANT_CD = pvc2PlantCd;
        END IF;

    END IF;

--vc2RunChkComment := 'COMMITEMCHG_008';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    --【生産要求インタフェース】のデータ件数 > 0
    IF num_REQ_PRD_ODR_IF_Count > 0 THEN

--vc2RunChkComment := 'COMMITEMCHG_009';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        OPEN CurREQ_PRD_ODR_IF(pvc2PlantCd);     --[生産要求インタフェース]
        LOOP
            FETCH CurREQ_PRD_ODR_IF INTO RtpREQ_PRD_ODR_IF;
            IF CurREQ_PRD_ODR_IF%NOTFOUND THEN
                EXIT;
            END IF;

--vc2RunChkComment := 'COMMITEMCHG_010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

            --[生産要求]
            OPEN CurPRD_REQ_2(RtpREQ_PRD_ODR_IF.COMPANY_CD,     --   1.会社コード,
                              RtpREQ_PRD_ODR_IF.SLIP_TYP,       --   2.伝票種類,
                              RtpREQ_PRD_ODR_IF.SLIP_CTRL_GRP,  --   3.伝票管理グループ,
                              RtpREQ_PRD_ODR_IF.SLIP_CD,        --   4.伝票番号,
                              RtpREQ_PRD_ODR_IF.SLIP_DATE,      --   5.伝票日付,
                              RtpREQ_PRD_ODR_IF.SEQ_NO,                 --   59.発生連番
                  RtpREQ_PRD_ODR_IF.PLANT_CD);      --   26.工場コード
            FETCH CurPRD_REQ_2 INTO RtpPRD_REQ;
            IF CurPRD_REQ_2%FOUND THEN
                BlnPRD_REQ_FOUND := TRUE;
            ELSE
                BlnPRD_REQ_FOUND := FALSE;
            END IF;

            --品目存在チェック  商品コードにて検索
            OPEN CurITEM(RtpREQ_PRD_ODR_IF.COMM_CD);   --[品目]
            FETCH CurITEM INTO RtpITEM;
            IF CurITEM%NOTFOUND THEN        -- 検索結果が０件であれば生産情報エラー区分に9を設定する
                RtpPRD_REQ.MRP_ODR_TYP   := 0;                      --33.品目手配区分
                RtpPRD_REQ.PRD_ERROR_TYP := 9;                      --39.生産情報エラー区分
                DtmActiveDate2 := NULL;
            ELSE                            --存在した場合
                --稼働日自動算出
                blnRet := FncWorkDayCalc(pFileHandle, pVc2LogMode, pVc2OutputMode,pvc2UserId, pvc2BusinessName,
                    pvc2PlantCd,null,RtpREQ_PRD_ODR_IF.REQ_PRD_ISSUE_DATE, 0, FALSE, DtmActiveDate2);
                IF BlnRet = FALSE THEN
                    RAISE Err_FncWorkDayCalc;           --[稼働日自動算出]実行エラー
                END IF;

                RtpPRD_REQ.MRP_ODR_TYP   := RtpITEM.MRP_ODR_TYP;    --33.品目手配区分
                RtpPRD_REQ.PRD_ERROR_TYP := 1;                      --39.生産情報エラー区分
            END IF;
            CLOSE CurITEM;
            --インターフェイスファイルのデータを転記
            RtpPRD_REQ.COMPANY_CD            := RtpREQ_PRD_ODR_IF.COMPANY_CD;           --   1.会社コード
            RtpPRD_REQ.SLIP_TYP              := RtpREQ_PRD_ODR_IF.SLIP_TYP;             --   2.伝票種類
            RtpPRD_REQ.SLIP_CTRL_GRP         := RtpREQ_PRD_ODR_IF.SLIP_CTRL_GRP;        --   3.伝票管理グループ
            RtpPRD_REQ.SLIP_CD               := RtpREQ_PRD_ODR_IF.SLIP_CD;              --   4.伝票番号
            RtpPRD_REQ.SLIP_DATE             := RtpREQ_PRD_ODR_IF.SLIP_DATE;            --   5.伝票日付
            RtpPRD_REQ.LINE_NO               := RtpREQ_PRD_ODR_IF.SEQ_NO;               --   59.発生連番
            RtpPRD_REQ.UNCONFIRM_ODR_TYP     := RtpREQ_PRD_ODR_IF.UNCONFIRM_ODR_TYP;    --   7.内示受注区分
            RtpPRD_REQ.JOB_ODR_FLG           := RtpREQ_PRD_ODR_IF.JOB_ODR_FLG;          --   8.個別受注フラグ
            RtpPRD_REQ.CUST_CD               := RtpREQ_PRD_ODR_IF.CUST_CD;              --   9.得意先コード
            RtpPRD_REQ.CUST_NAME             := RtpREQ_PRD_ODR_IF.CUST_NAME;            --  10.得意先名
            RtpPRD_REQ.BRANCH_CD             := RtpREQ_PRD_ODR_IF.BRANCH_CD;            --  11.支店コード
            RtpPRD_REQ.BRANCH_NAME           := RtpREQ_PRD_ODR_IF.BRANCH_NAME;          --  12.支店名
            RtpPRD_REQ.DIRECT_DLV_TYP        := RtpREQ_PRD_ODR_IF.DIRECT_DLV_TYP;       --  13.直納区分
            RtpPRD_REQ.DLV_LOC_CD            := RtpREQ_PRD_ODR_IF.DLV_LOC_CD;           --  14.納品場所コード
            RtpPRD_REQ.DLV_LOC_NAME          := RtpREQ_PRD_ODR_IF.DLV_LOC_NAME;         --  15.納品場所名
            RtpPRD_REQ.COMM_CD               := RtpREQ_PRD_ODR_IF.COMM_CD;              --  16.商品コード
            RtpPRD_REQ.COMM_NAME             := RtpREQ_PRD_ODR_IF.COMM_NAME;            --  17.商品名
            RtpPRD_REQ.SPEC                  := RtpREQ_PRD_ODR_IF.SPEC;                 --  18.規格
            RtpPRD_REQ.COMM_SIZE             := RtpREQ_PRD_ODR_IF.COMM_SIZE;            --  19.サイズ
            RtpPRD_REQ.COLOR                 := RtpREQ_PRD_ODR_IF.COLOR;                --  20.色
            RtpPRD_REQ.PRD_COMM_CODE_CHG_TYP := RtpREQ_PRD_ODR_IF.PRD_COMM_CODE_CHG_TYP;--  21.製品／商品変換区分
            RtpPRD_REQ.SCDL_SHIP_DATE        := RtpREQ_PRD_ODR_IF.SCDL_SHIP_DATE;       --  22.出荷予定日
            RtpPRD_REQ.SCDL_DLV_DATE         := RtpREQ_PRD_ODR_IF.SCDL_DLV_DATE;        --  23.納品予定日
            IF DtmActiveDate2 IS NULL THEN
                RtpPRD_REQ.REQ_PRD_ISSUE_DATE    := RtpREQ_PRD_ODR_IF.REQ_PRD_ISSUE_DATE;   --  24.出庫要求日
            ELSE
                RtpPRD_REQ.REQ_PRD_ISSUE_DATE    := DtmActiveDate2;                         --  24.出庫要求日
            END IF;
            RtpPRD_REQ.SHIP_WH_CD            := RtpREQ_PRD_ODR_IF.SHIP_WH_CD;           --  25.出荷倉庫コード
--            
        RtpPRD_REQ.PLANT_CD     := RtpREQ_PRD_ODR_IF.PLANT_CD;                          --  26.工場コード


            RtpPRD_REQ.WH_CD                 := RtpREQ_PRD_ODR_IF.WH_CD;                --  27.保管区コード
                    RtpPRD_REQ.REQ_PRD_QTY           := RtpREQ_PRD_ODR_IF.REQ_PRD_QTY;          --  28.要求数量
            RtpPRD_REQ.TOTAL_SHIP_QTY        := RtpREQ_PRD_ODR_IF.TOTAL_SHIP_QTY;       --  29.出荷実績累計数
            RtpPRD_REQ.ODR_CHG_FLG           := RtpREQ_PRD_ODR_IF.ODR_CHG_FLG;          --  30.受注変動許可フラグ
            RtpPRD_REQ.ODR_DEL_FLG           := RtpREQ_PRD_ODR_IF.ODR_DEL_FLG;          --  30.受注削除フラグ
            RtpPRD_REQ.ODR_ACPT_JOB_ODR_NO   := RtpREQ_PRD_ODR_IF.ODR_ACPT_JOB_ODR_NO;  --  31.受注製番
            RtpPRD_REQ.OD_TYP     := 0;      --  34.オーダデマンド区分
            RtpPRD_REQ.OD_NO       := 0;      --  35.オーダデマンド番号
            RtpPRD_REQ.JOB_ODR_CD            := '0';    --  36.製番
            RtpPRD_REQ.JOB_ODR_DETAIL_NO     := 0;      --  37.製番枝番
            RtpPRD_REQ.PRD_PLAN_TYP          := 1;      --  38.生産計画対象区分

            IF DtmActiveDate1 >= RtpREQ_PRD_ODR_IF.SCDL_SHIP_DATE THEN
                RtpPRD_REQ.PRD_ALARM_FLG     := 9;          --  40.生産アラームフラグ
            ELSE
                RtpPRD_REQ.PRD_ALARM_FLG     := 1;          --  40.生産アラームフラグ
            END IF;

            IF BlnPRD_REQ_FOUND = FALSE THEN
                RtpPRD_REQ.PRVS_COMM_CD              := NULL;   --  41.前回商品コード
                RtpPRD_REQ.PRVS_COMM_NAME            := NULL;   --  42.前回商品名
                RtpPRD_REQ.PRVS_SPEC                 := NULL;   --  43.前回規格
                RtpPRD_REQ.PRVS_ITEM_CD              := NULL;   --  44.前回品目番号
                RtpPRD_REQ.PRVS_MRP_ODR_TYP          := 0;      --  45.前回品目手配区分
                RtpPRD_REQ.PRVS_SCDL_SHIP_DATE       := NULL;   --  46.前回出荷予定日
                RtpPRD_REQ.PRVS_DLV_DATE             := NULL;   --  47.前回納品予定日
                RtpPRD_REQ.PRVS_ODR_SHIP_DATE        := NULL;   --  48.前回出庫要求日
                RtpPRD_REQ.PRVS_REQ_QTY              := 0;      --  49.前回要求数量
                RtpPRD_REQ.PRVS_OD_NO                := 0;      --  50.前回オーダデマンド番号
                RtpPRD_REQ.PRVS_JOB_ODR_CD           := NULL;   --  51.前回製番
                RtpPRD_REQ.PRVS_JOB_ODR_DETAIL_NO    := 0;      --  52.前回製番枝番
            END IF;
--
                        
            IF BlnPRD_REQ_FOUND = FALSE THEN
                RtpPRD_REQ.CREATED_DATE := SYSDATE;     -- 55.sys作成日時
                RtpPRD_REQ.CREATED_BY   := pVc2UserID;  -- 56.sys作成者コード
        RtpPRD_REQ.CREATED_PRG_NM  := MY_SQL_NAME;   --  作成プログラム　
        RtpPRD_REQ.MODIFY_COUNT := 0;
        ELSE
                RtpPRD_REQ.CREATED_DATE := RtpPRD_REQ.CREATED_DATE;        -- 55.sys作成日時
                RtpPRD_REQ.CREATED_BY   := RtpPRD_REQ.CREATED_BY;          -- 56.sys作成者コード
        RtpPRD_REQ.CREATED_PRG_NM := RtpPRD_REQ.CREATED_PRG_NM;    --  作成プログラム　
        RtpPRD_REQ.MODIFY_COUNT := RtpPRD_REQ.MODIFY_COUNT + 1;
            END IF;
        
            RtpPRD_REQ.SEQ_NO               := RtpREQ_PRD_ODR_IF.SEQ_NO;               --   54.発生連番            

            --[生産要求]  
            --生産要求存在時、削除 もともとこうである。
            IF BlnPRD_REQ_FOUND = TRUE THEN
                DELETE  FROM T_PRD_REQ
                WHERE   COMPANY_CD      = RtpPRD_REQ.COMPANY_CD     --  1.会社コード
                AND     SLIP_TYP        = RtpPRD_REQ.SLIP_TYP       --  2.伝票種類
                AND     SLIP_CTRL_GRP   = RtpPRD_REQ.SLIP_CTRL_GRP  --  3.伝票管理グループ
                AND     SLIP_CD         = RtpPRD_REQ.SLIP_CD        --  4.伝票番号
                AND     SLIP_DATE       = RtpPRD_REQ.SLIP_DATE      --  5.伝票日付
                AND     LINE_NO         = RtpPRD_REQ.LINE_NO       --  6.行
        AND     PLANT_CD        = RtpPRD_REQ.PLANT_CD;
            END IF;

            --[生産要求]
            INSERT INTO T_PRD_REQ(
                COMPANY_CD,             SLIP_TYP,               --   1.会社コード            2.伝票種類
                SLIP_CTRL_GRP,          SLIP_CD,                --   3.伝票管理グループ      4.伝票番号
                SLIP_DATE,              LINE_NO,                --   5.伝票日付              6.行
                UNCONFIRM_ODR_TYP,      JOB_ODR_FLG,            --   7.内示受注区分          8.個別受注フラグ
                CUST_CD,                CUST_NAME,              --   9.得意先コード         10.得意先名
                BRANCH_CD,              BRANCH_NAME,            --  11.支店コード           12.支店名
                DIRECT_DLV_TYP,         DLV_LOC_CD,             --  13.直納区分             14.納品場所コード
                DLV_LOC_NAME,           COMM_CD,                --  15.納品場所名           16.商品コード
                COMM_NAME,              SPEC,                   --  17.商品名               18.規格
                COMM_SIZE,              COLOR,                  --  19.サイズ               20.色
                PRD_COMM_CODE_CHG_TYP,  SCDL_SHIP_DATE,         --  21.製品／商品変換区分   22.出荷予定日
                SCDL_DLV_DATE,          REQ_PRD_ISSUE_DATE,     --  23.納品予定日           24.出庫要求日
                SHIP_WH_CD,                                                             --  25.出荷倉庫コード
        PLANT_CD,                                                                               --  26.工場コード
        WH_CD,                                                          --  27.保管区コード
                REQ_PRD_QTY,            TOTAL_SHIP_QTY,         --  28.要求数量             28.出荷実績累計数
                ODR_CHG_FLG,            ODR_DEL_FLG,            --  30.受注変動許可フラグ   31.受注削除フラグ
                ODR_ACPT_JOB_ODR_NO,    ITEM_CD,                --  32.受注製番             33.品目番号
                MRP_ODR_TYP,            OD_TYP,      --  34.品目手配区分         35.オーダデマンド区分
                OD_NO,        JOB_ODR_CD,             --  36.オーダデマンド番号   37.製番
                JOB_ODR_DETAIL_NO,      PRD_PLAN_TYP,           --  38.製番枝番             39.生産計画対象区分
                PRD_ERROR_TYP,          PRD_ALARM_FLG,          --  40.生産情報エラー区分   41.生産アラームフラグ
                PRVS_COMM_CD,           PRVS_COMM_NAME,         --  42.前回商品コード       43.前回商品名
                PRVS_SPEC,              PRVS_ITEM_CD,           --  44.前回規格             45.前回品目番号
                PRVS_MRP_ODR_TYP,       PRVS_SCDL_SHIP_DATE,    --  46.前回品目手配区分     47.前回出荷予定日
                PRVS_DLV_DATE,          PRVS_ODR_SHIP_DATE,     --  48.前回納品予定日       49.前回出庫要求日
                PRVS_REQ_QTY,           PRVS_OD_NO,             --  50.前回要求数量         51.前回オーダデマンド番号
                PRVS_JOB_ODR_CD,        PRVS_JOB_ODR_DETAIL_NO, --  52.前回製番             53.前回製番枝番
        SEQ_NO,                                                                                 --  54
        CREATED_DATE,                                                                       --  55
        CREATED_BY,                                                         --  56
        CREATED_PRG_NM,                                                     --  57
        UPDATED_DATE,                                                       --  58
        UPDATED_BY,                                                     --  59
        UPDATED_PRG_NM,                                                 --  60
            MODIFY_COUNT                                                            --  61
            )VALUES(
                RtpPRD_REQ.COMPANY_CD,              RtpPRD_REQ.SLIP_TYP,                --  1,  2,
                RtpPRD_REQ.SLIP_CTRL_GRP,           RtpPRD_REQ.SLIP_CD,                 --  3,  4,
                RtpPRD_REQ.SLIP_DATE,               RtpPRD_REQ.LINE_NO,                 --  5,  6,
                RtpPRD_REQ.UNCONFIRM_ODR_TYP,       RtpPRD_REQ.JOB_ODR_FLG,             --  7,  8,
                RtpPRD_REQ.CUST_CD,                 RtpPRD_REQ.CUST_NAME,               --  9, 10,
                RtpPRD_REQ.BRANCH_CD,               RtpPRD_REQ.BRANCH_NAME,             -- 11, 12,
                RtpPRD_REQ.DIRECT_DLV_TYP,          RtpPRD_REQ.DLV_LOC_CD,              -- 13, 14,
                RtpPRD_REQ.DLV_LOC_NAME,            RtpPRD_REQ.COMM_CD,                 -- 15, 16,
                RtpPRD_REQ.COMM_NAME,               RtpPRD_REQ.SPEC,                    -- 17, 18,
                RtpPRD_REQ.COMM_SIZE,               RtpPRD_REQ.COLOR,                   -- 19, 20,
                RtpPRD_REQ.PRD_COMM_CODE_CHG_TYP,   RtpPRD_REQ.SCDL_SHIP_DATE,          -- 21, 22,
                RtpPRD_REQ.SCDL_DLV_DATE,           RtpPRD_REQ.REQ_PRD_ISSUE_DATE,      -- 23, 24,
                RtpPRD_REQ.SHIP_WH_CD,                                                                                   -- 25,
        RtpPRD_REQ.PLANT_CD,                                                                                                        -- 26
        RtpPRD_REQ.WH_CD,                   -- 27,
                RtpPRD_REQ.REQ_PRD_QTY,             RtpPRD_REQ.TOTAL_SHIP_QTY,          -- 28, 28,
                RtpPRD_REQ.ODR_CHG_FLG,             RtpPRD_REQ.ODR_DEL_FLG,             -- 30, 31,
                RtpPRD_REQ.ODR_ACPT_JOB_ODR_NO,     RtpPRD_REQ.COMM_CD,                 -- 32, 33,
                RtpPRD_REQ.MRP_ODR_TYP,             RtpPRD_REQ.OD_TYP,       -- 34, 35,
                RtpPRD_REQ.OD_NO,         RtpPRD_REQ.JOB_ODR_CD,              -- 36, 37,
                RtpPRD_REQ.JOB_ODR_DETAIL_NO,       RtpPRD_REQ.PRD_PLAN_TYP,            -- 38, 39,
                RtpPRD_REQ.PRD_ERROR_TYP,           RtpPRD_REQ.PRD_ALARM_FLG,           -- 40, 41,
                RtpPRD_REQ.PRVS_COMM_CD,            RtpPRD_REQ.PRVS_COMM_NAME,          -- 42, 43,
                RtpPRD_REQ.PRVS_SPEC,               RtpPRD_REQ.PRVS_ITEM_CD,            -- 44, 45,
                RtpPRD_REQ.PRVS_MRP_ODR_TYP,        RtpPRD_REQ.PRVS_SCDL_SHIP_DATE,     -- 46, 47,
                RtpPRD_REQ.PRVS_DLV_DATE,           RtpPRD_REQ.PRVS_ODR_SHIP_DATE,      -- 48, 49,
                RtpPRD_REQ.PRVS_REQ_QTY,            RtpPRD_REQ.PRVS_OD_NO,              -- 50, 51,
                RtpPRD_REQ.PRVS_JOB_ODR_CD,         RtpPRD_REQ.PRVS_JOB_ODR_DETAIL_NO,  -- 52, 53,
                RtpPRD_REQ.SEQ_NO,                                                                                                          --53,
        RtpPRD_REQ.CREATED_DATE,                                                                        --  55
        RtpPRD_REQ.CREATED_BY,                                                          --  56
        RtpPRD_REQ.CREATED_PRG_NM,                                                      --  57
        SYSDATE,                                                        --  58
        pVc2UserID,                                                     --  59
        MY_SQL_NAME,                                                    --  60
            RtpPRD_REQ.MODIFY_COUNT                                                         --  61                                                                              
            );
            CLOSE CurPRD_REQ_2;

            --[生産要求インタフェース]
            DELETE  T_REQ_PRD_ODR_IF
            WHERE   COMPANY_CD      = RtpREQ_PRD_ODR_IF.COMPANY_CD      -- 1.会社コード
            AND     SLIP_TYP        = RtpREQ_PRD_ODR_IF.SLIP_TYP        -- 2.伝票種類
            AND     SLIP_CTRL_GRP   = RtpREQ_PRD_ODR_IF.SLIP_CTRL_GRP   -- 3.伝票管理グループ
            AND     SLIP_CD         = RtpREQ_PRD_ODR_IF.SLIP_CD         -- 4.伝票番号
            AND     SLIP_DATE       = RtpREQ_PRD_ODR_IF.SLIP_DATE       -- 5.伝票日付
            AND     LINE_NO         = RtpREQ_PRD_ODR_IF.LINE_NO        -- 6.行
        AND     PLANT_CD        = RtpREQ_PRD_ODR_IF.PLANT_CD;

            --【生産要求インタフェース】処理件数のインクリメント
            NumCnt_REQ_PRD_ODR_IF := NumCnt_REQ_PRD_ODR_IF + 1;

        END LOOP;
        CLOSE CurREQ_PRD_ODR_IF;

    END IF;

--vc2RunChkComment := 'COMMITEMCHG_011';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);


    --[生産要求インタフェース]抽出件数の出力
    blnRet := FncMsgLog(pFileHandle, pVc2LogMode, pVc2OutputMode, pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                        MY_SQL_NAME, APS_PROC_CNT, '(SBM0009)【生産要求インタフェース】抽出件数： ' || NumCnt_REQ_PRD_ODR_IF || ' 件');


    -- TraceLog の出力
    blnRet := FncTraceLog(pFileHandle,  pVc2LogMode,        pVc2OutputMode,
                          pvc2UserId,   pvc2BusinessName, pvc2PlantCd,  MY_SQL_NAME,    LOGMSG_END);

--vc2RunChkComment := 'COMMITEMCHG_END';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);


    RETURN TRUE;

--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    --[業務運用日付取得]実行エラー
    WHEN Err_FncGetBusinessDate THEN
        ROLLBACK;                           -- ロールバック
        NumErrNumber := APS_COM_OTHER_ERR;
        vc2Comment   := SUBSTRB('(SBM0010)' || LOGMSG_ERR || '：' || '[業務運用日付取得]の実行に失敗しました。', 1,1024);
        GOTO ERR_OUT;   -- ⇒ エラーを出力し、FALSEを返して終了する。

    --[生産要求制御]NOT FOUND
    WHEN Err_NOT_PRD_REQ_CTRL THEN
        ROLLBACK;                           -- ロールバック
        NumErrNumber := APS_COM_OTHER_ERR;
        vc2Comment   := SUBSTRB('(SBM0011)' || LOGMSG_ERR || '：' || '生産要求制御データが存在しません。', 1,1024);
        GOTO ERR_OUT;   -- ⇒ エラーを出力し、FALSEを返して終了する。

    --[稼働日自動算出]実行エラー
    WHEN Err_FncWorkDayCalc THEN
        ROLLBACK;                           -- ロールバック
        NumErrNumber := APS_COM_OTHER_ERR;
        vc2Comment   := SUBSTRB('(SBM0012)' || LOGMSG_ERR || '：' || '[稼働日自動算出]の実行に失敗しました。', 1,1024);
        GOTO ERR_OUT;   -- ⇒ エラーを出力し、FALSEを返して終了する。

    -- その他のエラー
    WHEN OTHERS THEN
        ROLLBACK;                           -- ロールバック
        NumErrNumber := APS_COM_ORACLE_ERR;
        vc2Comment   := SUBSTRB('(SBM0021)' || LOGMSG_ERR || '：' || SQLCODE || ',' || SUBSTRB(SQLERRM,1,1024), 1,1024);

--vc2RunChkComment := NumErrNumber;
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
--vc2RunChkComment := vc2Comment;
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        GOTO ERR_OUT;   -- ⇒ エラーを出力し、FALSEを返して終了する。

-- エラーを出力し、FALSEを返して終了する。
<<ERR_OUT>>
        -- 終了メッセージの出力
        blnRet := FncMsgLog(  pFileHandle,  pVc2LogMode,        pVc2OutputMode,pvc2PlantCd, 
                              pvc2UserId,   pvc2BusinessName,   MY_SQL_NAME,    NumErrNumber,       vc2Comment);

        /* TraceLog の出力（実行位置） */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END || vc2RunChkComment);

        -- TraceLog の出力
        blnRet := FncTraceLog(pFileHandle,  pVc2LogMode,        pVc2OutputMode, 
                              pvc2UserId,   pvc2BusinessName,   pvc2PlantCd,MY_SQL_NAME,    LOGMSG_END);
        COMMIT;
        RETURN FALSE;

END FncCommitemChg;
/
