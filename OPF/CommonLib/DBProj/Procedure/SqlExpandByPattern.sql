CREATE OR REPLACE PROCEDURE SQLEXPANDBYPATTERN(
/*------------------------------------------------------------------------------
' Copyright (c) 2003-2004 NEC Corporation
' Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
'$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/DBProj/Procedure/SqlExpandByPattern.sql,v $
'$Author: tai-yanhong $
'$Revision: 1.5 $ $Date: 2013/06/03 08:00:48 $
'
' 機能      : パターン別作業系列展開
'
' 戻り値    :
'
'
' 引き数    : ■共通（必須）
'             pvc2LogMode          - (i)ＬＯＧモード
'             pvc2OutputMode       - (i)出力モード
'             pvc2OutputPath       - (i)出力ファイルパス
'             pvc2OutputName       - (i)出力ファイル名
'             pvc2UserId           - (i)ユーザＩＤ
'             pvc2BusinessName     - (i)業務名
'             pvc2PlantCd          - (i)工場コード
'             ■プログラム固有（作業製造着手日または、作業製造納期は必須）
'             pvc2OprInstStartDate - (i)作業製造着手日
'             pvc2WorkOdrDlvDate   - (i)作業製造納期
'             pvc2JobOdrCd         - (i)製番
'
' 機能説明  : オーダ発効された内作オーダに対して、パターン別に作業系列展開を行い、
'             作業系列別作業計画データを作成する。
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
   ,pvc2PlantCd            IN  VARCHAR2    --工場コード
   ,pvc2OprInstStartDate   IN  VARCHAR2    --作業製造着手日
   ,pvc2WorkOdrDlvDate     IN  VARCHAR2    --作業製造納期
   ,pvc2JobOdrCd           IN  VARCHAR2    --製番
)
IS

/* カーソルの宣言 */

    --【工場】
    CURSOR curM_PLANT(
        c_PLANT_CD       VARCHAR2
    ) IS
    SELECT  CAL_NO                   --カレンダ番号
    FROM    M_PLANT                  --品目
    WHERE   PLANT_CD = c_PLANT_CD;

    --【品目】
    CURSOR curM_ITEM(
        c_ITEM_CD       VARCHAR2
    ) IS
    SELECT  UNIT_QTY_TYP             --在庫数単位区分
    FROM    M_ITEM                   --品目
    WHERE   ITEM_CD = c_ITEM_CD;

    --【パターン別作業系列】
    CURSOR curM_PATTERN_PROC_GRP(
        c_PLANT_CD      VARCHAR2,
        c_ITEM_CD       VARCHAR2,
        c_PATTERN_CD    VARCHAR2
    ) IS
    SELECT  PROC_CD,                  --品目別作業コード
            PATTERN_CD,               --パターンコード
            PROC_NO,                  --作業系列番号
            PROC_NAME,                --作業名
            WS_CD,                    --作業区コード
            COMPANY_CD,               --会社コード
            VEND_CD,                  --代表取引先コード
            FIXED_LT,                 --作業系列固定分リードタイム
            PROP_LT,                  --作業系列比例分リードタイム
            SAFETY_LT,                --作業系列安全日数
            PROP_LOT_SIZE,            --作業系列比例分ロットサイズ
            SPOIL,                    --作業系列仕掛率
            OUTSIDE_TYP,              --作業系列内外作区分
            ACPT_INSPC_TYP            --作業系列受入検査区分
    FROM    M_PATTERN_PROC_GRP        --パターン別作業系列
    WHERE   PLANT_CD = c_PLANT_CD AND --工場コード
            ITEM_CD = c_ITEM_CD AND   --品目番号
            PATTERN_CD = c_PATTERN_CD --パターンコード
    ORDER BY PROC_NO;

    --【パターン別作業系列-作業コードチェック】
    CURSOR curM_PATTERN_PROC_GRP_WS_CD(
        c_PLANT_CD      VARCHAR2,
        c_ITEM_CD       VARCHAR2,
        c_PATTERN_CD    VARCHAR2
    ) IS
    SELECT  WS_CD
    FROM    M_PATTERN_PROC_GRP
    WHERE   OUTSIDE_TYP = 1  AND
            PLANT_CD = c_PLANT_CD AND
            ITEM_CD = c_ITEM_CD AND
            PATTERN_CD = c_PATTERN_CD AND
            PROC_NO IN (SELECT  MIN(PROC_NO)
                        FROM    M_PATTERN_PROC_GRP
                        WHERE   OUTSIDE_TYP = 1  AND
                                PLANT_CD = c_PLANT_CD AND
                                ITEM_CD = c_ITEM_CD AND
                                PATTERN_CD = c_PATTERN_CD
                        GROUP BY PLANT_CD, ITEM_CD, OUTSIDE_TYP, PATTERN_CD
                       );

    --【外注単価】（【取引先】，【通貨】）
    CURSOR curM_SBCNT_UNIT_COST(
        c_PLANT_CD          VARCHAR2,
        c_COMPANY_CD        VARCHAR2,
        c_VEND_CD           VARCHAR2,
        c_ITEM_CD           VARCHAR2,
        c_PROC_CD           VARCHAR2,
        c_EFF_PHASE_IN_DATE DATE,
        c_SBCNT_SIZE        NUMBER
    ) IS
    SELECT  M_SBCNT_UNIT_COST.UNIT_COST,                --外注単価 外注単価
            M_SBCNT_UNIT_COST.UNIT_COST_TYP,            --外注単価 外注単価区分
            M_SBCNT_UNIT_COST.PROCESSING_COST,          --外注単価 外注加工費
            M_SBCNT_UNIT_COST.MATERIAL_COST,            --外注単価 外注材料費
            M_SBCNT_UNIT_COST.OTHER_OVERHEADS,          --外注単価 外注その他経費
            M_VEND_CTRL.ROUND_TYP,                      --取引先マスタ 発注金額まるめ区分
            M_VEND_CTRL.CUR_CD,                         --取引先マスタ 取引先通貨コード
            M_CUR.DECIMAL_FIG                           --通貨 少数桁数
    FROM    M_SBCNT_UNIT_COST, M_VEND_CTRL, M_CUR       --外注単価,取引先マスタ,通貨
    WHERE
            M_SBCNT_UNIT_COST.PLANT_CD = c_PLANT_CD AND --外注単価 工場コード
            M_SBCNT_UNIT_COST.COMPANY_CD = c_COMPANY_CD AND
            M_SBCNT_UNIT_COST.VEND_CD = c_VEND_CD AND
            M_SBCNT_UNIT_COST.ITEM_CD = c_ITEM_CD AND
            M_SBCNT_UNIT_COST.PROC_CD = c_PROC_CD AND
            TO_CHAR(M_SBCNT_UNIT_COST.EFF_PHASE_IN_DATE, 'YYYYMMDD') <= TO_CHAR(c_EFF_PHASE_IN_DATE, 'YYYYMMDD') AND
            M_SBCNT_UNIT_COST.SBCNT_SIZE <= c_SBCNT_SIZE AND
            M_SBCNT_UNIT_COST.COMPANY_CD = M_VEND_CTRL.COMPANY_CD(+) AND
            M_SBCNT_UNIT_COST.VEND_CD = M_VEND_CTRL.VEND_CD(+) AND
            M_VEND_CTRL.CUR_CD = M_CUR.CUR_CD(+)
    ORDER BY M_SBCNT_UNIT_COST.EFF_PHASE_IN_DATE DESC, M_SBCNT_UNIT_COST.SBCNT_SIZE DESC;

/* ROWTYPE の宣言 */

    RtpM_PLANT                    curM_PLANT%ROWTYPE;                    --【工場】
    RtpM_ITEM                     curM_ITEM%ROWTYPE;                     --【品目】
    RtpM_PATTERN_PROC_GRP         curM_PATTERN_PROC_GRP%ROWTYPE;         --【パターン別作業系列】
    RtpM_PATTERN_PROC_GRP_WS_CD   curM_PATTERN_PROC_GRP_WS_CD%ROWTYPE;   --【パターン別作業系列-作業コードチェック】
    RtpM_SBCNT_UNIT_COST          curM_SBCNT_UNIT_COST%ROWTYPE;          --【外注単価】（【取引先】，【通貨】）

/* 定数の宣言 */

    MY_SQL_NAME                         VARCHAR2(60)  := 'SQLEXPANDBYPATTERN';
    PROCESS_NOEXPAND                    NUMBER(1)     := 0;   --作業系列展開済フラグ　未展開
    WORK_STS_TYP_NOINSTRACT             NUMBER(1)     := 1;   --品目別作業状態区分 未指示
    OPR_RSLT_TYP_PROCESS_PROCEDURE      NUMBER(1)     := 2;   --品目別作業実績区分 作業指示実績
    UNIT_QTY_TYP_DECIMAL                NUMBER(1)     := 1;   --品目 在庫数量単位区分(1:整数管理)
    UNIT_QTY_TYP_FRACTION               NUMBER(1)     := 2;   --品目 在庫数量単位区分(2:小数管理)
    UNIT_COST_TEMP                      NUMBER(1)     := 1;   --支給単価 単価区分(1:仮単価)
    UNIT_COST_REGULAR                   NUMBER(1)     := 2;   --支給単価 単価区分(2:正単価)
    OUTSIDE_TYP_INNER_MAKE              NUMBER(1)     := 1;   --内外作区分 内作
    OUTSIDE_TYP_BUY                     NUMBER(1)     := 2;   --内外作区分 外作
    INST_CD_RISE_PROCESS                NUMBER(1)     := 2;   --作業指示伝票 作業指示番号発生区分(2:作業系列別)
    INST_NOISSUE                        NUMBER(1)     := 0;   --作業指示伝票 作業指示伝票発行済みフラグ(0:未)
    FINAL_PROCESS_OFF                   NUMBER(1)     := 0;   --作業系列別仕掛 最終系列フラグ(0:非)
    FINAL_PROCESS_ON                    NUMBER(1)     := 1;   --作業系列別仕掛 最終系列フラグ(1:最終経路)
    PROCESS_EXPAND                      NUMBER(1)     := 1;   --品目別仕掛 作業系列展開済みフラグ(1:展開済み)

/* EXCEPTION の宣言 */

    excPLANT_CDE_GET_ERR                EXCEPTION;  --「工場コード」取得エラー
    excBUSINESSDATE_GET_ERR             EXCEPTION;  --「業務運用日」取得エラー
    excNEW_INST_CD_GET_ERR              EXCEPTION;  --「作業指示番号」取得エラー
    excWORK_DAY_CALC_ERR                EXCEPTION;  --「稼働日数算出」エラー
    excGETROUND_ERR                     EXCEPTION;  --「端数処理」エラー
    exc_ERR                             EXCEPTION;  --「工程仕掛在庫管理」エラー
    excITM_UNIT_QTY_TYP_GET_ERR         EXCEPTION;  --「品目データ」取得エラー
    excM_PTN_PROC_GRP_Count_ERR         EXCEPTION;  --「パターン別作業系列データ件数」取得エラー
    excM_PTN_PROC_GRP_GET_ERR           EXCEPTION;  --「パターン別作業系列データ」取得エラー
    excM_PTN_PROC_GRP_WS_CD_ERR         EXCEPTION;  --「最初の内作工程に作業区コードが設定されていない場合」エラー
    excM_WS_PLAN_WS_WH_ERR              EXCEPTION;  --「作業区コードが一致する[作業区]."工場コード"が、[品目別仕掛]."工場コード"と一致しない」エラー
    excM_WS_WH_CD_ERR                   EXCEPTION;  --「作業区コードが一致する[作業区]."保管区コード"が、設定されていない」エラー
    excM_WH_WH_CD_ERR                   EXCEPTION;  --「作業区コードが一致する[作業区]."保管区コード"が一致する、[保管区]."保管区コード"が、設定されていない」エラー
    excM_WH_PLANT_ERR                   EXCEPTION;  --「保管区コードが一致する[保管区]."工場コード"が、[品目別仕掛]."工場コード"と一致しない」エラー

/* MESSAGE の宣言 */

    APS_BATCH_START                     VARCHAR2(28)     := 'ZZ09001';    --バッチ処理を開始しました
    APS_BATCH_END                       VARCHAR2(28)     := 'ZZ09002';    --バッチ処理を終了しました
    APS_NOTEXIST_M_ITEM                 VARCHAR2(28)     := 'AD50509';    --品目データが存在しません
    APS_NOTEXIST_M_PTN_PROC_GRP         VARCHAR2(28)     := 'AD50512';    --作業系列情報が存在しません
    APS_PROC_STARTDATE_INV              VARCHAR2(28)     := 'AD52741';    --着手日が業務運用日より過去です
    APS_PROC_LT_INV                     VARCHAR2(28)     := 'AD52742';    --系列リードタイムが品目リードタイムを超えています
    APS_PROC_OPRINSTQTY_INV             VARCHAR2(28)     := 'AD52743';    --仕損率により作業指示数がゼロです
    APS_NOTEXIST_M_PLANT                VARCHAR2(28)     := 'AD00009';    --指定された工場は存在しません
    APS_NOTEXIST_M_WS                   VARCHAR2(28)     := 'AD00011';    --初系列に作業区コードが設定されていません
    APS_NOTEXIST_M_WH                   VARCHAR2(28)     := 'AD00013';    --初系列に指定されている作業区情報に、保管区コードが設定されていません
    APS_FAIL_BUSINESSDATE               VARCHAR2(28)     := 'AD00010';    --業務運用日の取得に失敗しました。
    APS_DIFF_PLANT_OF_WS                VARCHAR2(28)     := 'AD00012';    --初系列に指定されている作業区情報の工場コードが一致しません
    APS_DIFF_PLANT_OF_WH                VARCHAR2(28)     := 'AD00014';    --初系列に指定されている作業区情報に設定された保管区の工場コードが一致しません
    APS_DIFF_WS_CD_OF_WH                VARCHAR2(28)     := 'AD00018';    --最初の内作工程の作業区コードに対応する保管区が存在しません
    APS_COM_OTHER_ERR                   VARCHAR2(28)     := 'AD00027';    --その他　Ｅｒｒｏｒ

/* LOG の宣言 */

    LOGMSG_START_PGNM_EXPANDBYPTN       VARCHAR2(104)  := '(SBM0553)<< パターン別作業系列展開処理開始 >>';
    LOGMSG_END_PGNM_EXPANDBYPTN         VARCHAR2(104)  := '<< パターン別作業系列展開処理終了 >>';
    LOGMSG_START                        VARCHAR2(20)   := 'Start';         --ログ用メソッド開始宣言
    LOGMSG_END                          VARCHAR2(12)   := 'End';           --ログ用メソッド終了宣言
    LOGMSG_ERR                          VARCHAR2(32)   := '異常終了';
    LOGMSG_OPRINST_START_DATE           VARCHAR2(32)   := '着手日：';
    LOGMSG_WORKODR_DLV_DATE             VARCHAR2(24)   := '納期：';
    LOGMSG_JOB_ODR_CODE                 VARCHAR2(24)   := '製番：';
    LOGMSG_PROCCOUNT                    VARCHAR2(40)  := '処理件数：';
    LOGMSG_ITEMCD                       VARCHAR2(32)   := '品目番号';
    LOGMSG_BRAKETS                      VARCHAR2(4)   := '[';
    LOGMSG_BRAKETE                      VARCHAR2(4)   := ']';
    LOGMSG_WORKODRCD                    VARCHAR2(48)  := '作業計画番号';
    LOGMSG_WORKINPROCCD                 VARCHAR2(56)  := '仕掛作業コード';
    LOGMSG_PLANTCD                      VARCHAR2(40)  := '工場コード';

/* 変数の宣言 SQL */

    intItemCursorName           INTEGER;        --「品目別仕掛」＆「所要量」Ｖｉｅｗ用カーソルＩＤ
    vc2Sql                      VARCHAR2(4096); --動的ＳＱＬ用
    vc2PBI_WORK_ODR_CD          VARCHAR2(100);   --品目別仕掛 作業計画番号
    vc2PBI_OD_NO                VARCHAR2(100);   --品目別仕掛 オーダデマント番号
    vc2PBI_ITEM_CD              VARCHAR2(100);   --品目別仕掛 品目番号
    dtmPBI_OPR_INST_START_DATE  DATE;           --品目別仕掛 作業製造着手日
    dtmPBI_WORK_ODR_DLV_DATE    DATE;           --品目別仕掛 作業製造納期
    numPBI_OPR_INST_QTY         NUMBER(18,4);   --品目別仕掛 作業指示数
    numPBI_MODIFY_COUNT         NUMBER(6);      --品目別仕掛 更新数
    numOD_ITEM_SPOIL            NUMBER(9,4);    --所要量 所要量品目仕損率
    numPlantCalNo               NUMBER;         --工場 カレンダ番号
    numITM_UNIT_QTY_TYP         NUMBER(2);      --品目 在庫数単位区分
    vc2PG_PROC_CD               VARCHAR2(100);   --パターン別作業系列 品目別作業コード
    numPG_PROC_NO               NUMBER(6);      --パターン別作業系列 作業系列番号
    vc2PG_PROC_NAME             VARCHAR2(160);   --パターン別作業系列 作業名
    vc2PG_WS_CD                 VARCHAR2(100);   --パターン別作業系列 作業区コード
    vc2PG_COMPANY_CD            VARCHAR2(100);   --パターン別作業系列 会社コード
    vc2PG_VEND_CD               VARCHAR2(100);   --パターン別作業系列 代表取引先コード
    numPG_FIXED_LT              NUMBER(6);      --パターン別作業系列 作業系列固定分リードタイム
    numPG_PROP_LT               NUMBER(6);      --パターン別作業系列 作業系列比例分リードタイム
    numPG_SAFETY_LT             NUMBER(6);      --パターン別作業系列 作業系列安全日数
    numPG_PROP_LOT_SIZE         NUMBER(18,4);   --パターン別作業系列 作業系列比例分ロットサイズ
    numPG_SPOIL                 NUMBER(9,4);    --パターン別作業系列 作業系列仕掛率
    numPG_OUTSIDE_TYP           NUMBER(2);      --パターン別作業系列 作業系列内外作区分
    numPG_ACPT_INSPC_TYP        NUMBER(2);      --パターン別作業系列 作業系列受入検査区分
    numPBP_OPR_INST_QTY         NUMBER(18,4);   --作業系列別仕掛 作業指示数
    dtmPBP_WORK_ODR_DLV_DATE    DATE;           --作業系列別仕掛 作業系列別製造納期
    dtmPBP_OPR_INST_START_DATE  DATE;           --作業系列別仕掛 作業系列別着手日
    numPBP_UNIT_COST_TYP        NUMBER(2);      --作業系列別仕掛 単価区分
    numPBP_UNIT_COST            NUMBER(18,4);   --作業系列別仕掛 単価
    numPBP_PROCESSING_COST      NUMBER(18,4);   --作業系列別仕掛 加工費
    numPBP_MATERIAL_COST        NUMBER(18,4);   --作業系列別仕掛 材料費
    numPBP_OTHER_OVERHEADS      NUMBER(18,4);   --作業系列別仕掛 その他経費
    numPBP_PUCH_ODR_AMOUNT      NUMBER(18,4);   --作業系列別仕掛 発注金額
    numPBP_FINAL_PROC_FLG       NUMBER(1);      --作業系列別仕掛 最終系列フラグ
    vc2PBP_OPR_INST_CD          VARCHAR2(100);   --作業系列別仕掛 作業指示番号
    vc2OD_PATTERN_CD            VARCHAR2(100);   --所要量 パターンコード

/* 変数の宣言 WORK */

    UTL_FileHandle              UTL_FILE.FILE_TYPE; --ファイルハンドル
    vc2Comment                  VARCHAR2(1024);      --メッセージ用コメント作成作業領域
    vc2RunChkComment            VARCHAR2(1024);      --実行位置確認用コメント作成作業領域
    blnRet                      BOOLEAN;            --BOOLEAN型 返却値
    intRet                      INTEGER;            --INTEGER型 返却値
    dtmBusinessOprDate          DATE;               --業務運用日付
    blnStartForward             BOOLEAN;            --基準日の前倒しフラグ
    dtmActiveDate               DATE;               --算出稼働日
    numTransactionCount         NUMBER(10);         --処理件数
    dtmWkStartDate              DATE;               --計算用作業指示着手日ワーク
    numGrpMinAllowance          NUMBER(18,4);       --作業系列毎最小許容量
    numMinAllowance             NUMBER(18,4);       --品目最小許容量
    numGrpWKSpoil               NUMBER(18);         --作業系列仕損率
    numWkOdrInstQty             NUMBER(18,4);       --作業指示数
    numWkQty                    NUMBER(18,4);       --ＷＫ量（計算用）
    numWkResultQty              NUMBER(14);         --ＷＫ量（返却用）
    numWkGrpLT                  NUMBER(22);         --系列のリードタイム
    numWkUnitCost               NUMBER(18,4);       --ＷＫ単価
    numData                     NUMBER(18,4);       --数量×単価
    numResultAmount             NUMBER(18,4);       --ＷＫ発注金額
    numM_PATTERN_PROC_GRP_Count NUMBER(10);         --「パターン別作業系列」データ数
    numM_PATTERN_PROC_GRP_Index NUMBER(10);         --「パターン別作業系列」データ処理位置
    vc2WkM_WS_PLANT_CD          VARCHAR2(8);        --作業区 工場コード
    vc2WkM_WS_WH_CD             VARCHAR2(100);       --作業区 保管区コード
    vc2WkM_WH_WH_CD             VARCHAR2(100);       --保管区 保管区コード
    vc2WkM_WH_PLANT_CD          VARCHAR2(8);        --保管区 工場コード
    vc2PG_WS_CD_OutsideTipe     VARCHAR2(100);       --パターン別作業系列 作業区コード
    numM_PLANT_CD_Count         NUMBER(10);         --工場データ件数
    numM_PROC_WS_Count          NUMBER(10);         --パターン別作業系列-作業コードチェック件数
    numM_WS_PLAN_WS_WH_Count    NUMBER(10);         --作業区コードが一致する[作業区]."工場コード"が、[品目別仕掛]."工場コード"と一致しない件数
    numM_M_WH_WH_CD_Count       NUMBER(10);         --作業区コードが一致する[作業区]."保管区コード"が一致する、[保管区]."保管区コード"が、設定されていない件数
    numM_WH_PLANT_Count         NUMBER(10);         --保管区コードが一致する[保管区]."工場コード"が、[品目別仕掛]."工場コード"と一致しない件数
    numOUTSIDE_TYP_Count        NUMBER(10);         --パターン別作業系列が存在する場合の内作の数（系列が全てが外作の場合かの判断用）


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
    /* 開始メッセージの出力 */
    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                        pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                        MY_SQL_NAME, APS_BATCH_START, LOGMSG_START_PGNM_EXPANDBYPTN);
    COMMIT;

/*-----------------------------------------------------------------------------
' 工場コードチェック
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    /* 「処理件数」の初期化 */
    numM_PLANT_CD_Count := 0;
    BEGIN
        SELECT COUNT(*) INTO numM_PLANT_CD_Count
            FROM M_PLANT
            WHERE PLANT_CD = pvc2PlantCd;
        IF numM_PLANT_CD_Count <= 0 THEN
            RAISE excPLANT_CDE_GET_ERR;
        END IF;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            RAISE excPLANT_CDE_GET_ERR;
        WHEN OTHERS THEN
            RAISE;
    END;
/*-----------------------------------------------------------------------------
' カレンダ番号の取得
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00020';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    OPEN curM_PLANT(pvc2PlantCd);
    FETCH curM_PLANT INTO numPlantCalNo;             --カレンダ番号
    IF curM_PLANT%NOTFOUND THEN
        RAISE excPLANT_CDE_GET_ERR;
    END IF;
    CLOSE curM_PLANT;
/*-----------------------------------------------------------------------------
' 業務運用日取得
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00030';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    blnRet := FncGetBusinessDate(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                 dtmBusinessOprDate);
    IF blnRet = FALSE THEN
        RAISE excBUSINESSDATE_GET_ERR;
    END IF;
/*-----------------------------------------------------------------------------
' 入力パラメータの条件を動的にＳＱＬ化
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00040';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    /* 「処理件数」の初期化 */
    numTransactionCount := 0;
    /* 抽出条件により動的ＳＱＬ生成 */
    intItemCursorName := DBMS_SQL.OPEN_CURSOR;
    vc2Sql := 'SELECT';
    vc2Sql := vc2Sql || ' T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD';            --1 作業計画番号
    vc2Sql := vc2Sql || ',T_WORK_IN_PROC_BY_ITEM.OD_NO';                  --2 オーダデマント番号
    vc2Sql := vc2Sql || ',T_WORK_IN_PROC_BY_ITEM.ITEM_CD';                --3 品目番号
    vc2Sql := vc2Sql || ',T_WORK_IN_PROC_BY_ITEM.OPR_INST_START_DATE';    --4 作業製造着手日
    vc2Sql := vc2Sql || ',T_WORK_IN_PROC_BY_ITEM.WORK_ODR_DLV_DATE';      --5 作業製造納期
    vc2Sql := vc2Sql || ',T_WORK_IN_PROC_BY_ITEM.OPR_INST_QTY';           --6 作業指示数
    vc2Sql := vc2Sql || ',T_OD.ITEM_SPOIL';                               --7 所要量品目仕損率
    vc2Sql := vc2Sql || ',T_WORK_IN_PROC_BY_ITEM.MODIFY_COUNT';           --8 更新数
    vc2Sql := vc2Sql || ',T_OD.PATTERN_CD';                               --9 パターンコード
    vc2Sql := vc2Sql || ' FROM T_WORK_IN_PROC_BY_ITEM, T_OD';
    vc2Sql := vc2Sql || ' WHERE';
    vc2Sql := vc2Sql || ' T_OD.OD_NO = T_WORK_IN_PROC_BY_ITEM.OD_NO(+)';
    vc2Sql := vc2Sql || ' AND T_WORK_IN_PROC_BY_ITEM.PLANT_CD = ''' || pvc2PlantCd || '''';
    /* 「作業製造納期」が指定されている場合 */
    IF pvc2WorkOdrDlvDate IS NOT NULL THEN
        vc2Sql := vc2Sql || ' AND T_WORK_IN_PROC_BY_ITEM.WORK_ODR_DLV_DATE <= TO_DATE(''' || pvc2WorkOdrDlvDate || ' 23:59:59' || ''',''yyyy/mm/dd hh24:mi:ss'')';
    END IF;
    /* 「作業製造着手日」が指定されている場合 */
    IF pvc2OprInstStartDate IS NOT NULL THEN
        vc2Sql := vc2Sql || ' AND T_WORK_IN_PROC_BY_ITEM.OPR_INST_START_DATE <= TO_DATE(''' || pvc2OprInstStartDate || ' 23:59:59' || ''',''yyyy/mm/dd hh24:mi:ss'')';
    END IF;
    /* 「製番」が指定されている場合 */
    IF pvc2JobOdrCd IS NOT NULL THEN
        IF INSTR(pvc2JobOdrCd, '%', 1) <= 0 THEN
            vc2Sql := vc2Sql || ' AND T_OD.JOB_ODR_CD = ''' || pvc2JobOdrCd || '''';
        ELSE
            vc2Sql := vc2Sql || ' AND T_OD.JOB_ODR_CD LIKE ''' || pvc2JobOdrCd || '''';
        END IF;
    END IF;
    /* 「品目別作業状態区分」 = 未指示(1) */
    vc2Sql := vc2Sql || ' AND T_WORK_IN_PROC_BY_ITEM.WORK_STS_TYP = ' || WORK_STS_TYP_NOINSTRACT;
    /* 「作業系列展開済フラグ」 = 未展開(0) */
    vc2Sql := vc2Sql || ' AND T_WORK_IN_PROC_BY_ITEM.PROC_EXPLOSION_FLG = ' || PROCESS_NOEXPAND;
    /* 「品目別作業実績区分」 = 作業指示実績(2) */
    vc2Sql := vc2Sql || ' AND T_WORK_IN_PROC_BY_ITEM.OPR_RSLT_TYP = ' || OPR_RSLT_TYP_PROCESS_PROCEDURE;
    /* 「パターンコード」 != Null */
    vc2Sql := vc2Sql || ' AND T_OD.PATTERN_CD is not Null ';
/*-----------------------------------------------------------------------------
' 動的ＳＱＬの内容をトレースに出力
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00050';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
     --TraceLog の出力（実行位置）
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END || 'SQL:' || SUBSTR(vc2Sql,1,200));
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END || 'SQL:' || SUBSTR(vc2Sql,201,200));
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END || 'SQL:' || SUBSTR(vc2Sql,401,200));
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END || 'SQL:' || SUBSTR(vc2Sql,601,200));
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END || 'SQL:' || SUBSTR(vc2Sql,801,200));
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END || 'SQL:' || SUBSTR(vc2Sql,1001,200));
/*-----------------------------------------------------------------------------
' 動的ＳＱＬの解析
' 列の定義
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00060';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    /* ＳＱＬ文解析 */
    DBMS_SQL.PARSE(intItemCursorName, vc2Sql, DBMS_SQL.NATIVE);
    /* 列定義 */
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,1,vc2PBI_WORK_ODR_CD,100);      --品目別仕掛 作業計画番号
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,2,vc2PBI_OD_NO,100);            --品目別仕掛 オーダデマント番号
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,3,vc2PBI_ITEM_CD,100);          --品目別仕掛 品目番号
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,4,dtmPBI_OPR_INST_START_DATE); --品目別仕掛 作業製造着手日
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,5,dtmPBI_WORK_ODR_DLV_DATE);   --品目別仕掛 作業製造納期
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,6,numPBI_OPR_INST_QTY);        --品目別仕掛 作業指示数
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,7,numOD_ITEM_SPOIL);           --所要量     所要量品目仕損率
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,8,numPBI_MODIFY_COUNT);        --品目別仕掛 更新数
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,9,vc2OD_PATTERN_CD,100);        --所要量 パターンコード
/*-----------------------------------------------------------------------------
' カーソル実行
' 行フェッチ（抽出件数分のMain/Loop処理）
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00070';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    /* カーソル実行 */
    intRet := DBMS_SQL.EXECUTE(intItemCursorName);
    /* 行フェッチ */
    LOOP
        IF DBMS_SQL.FETCH_ROWS(intItemCursorName) > 0 THEN
        BEGIN
--vc2RunChkComment := '●●●●通過 00080';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            /* フェッチした値の取得 */
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,1,vc2PBI_WORK_ODR_CD);          --品目別仕掛 作業計画番号
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,2,vc2PBI_OD_NO);                --品目別仕掛 オーダデマント番号
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,3,vc2PBI_ITEM_CD);              --品目別仕掛 品目番号
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,4,dtmPBI_OPR_INST_START_DATE);  --品目別仕掛 作業製造着手日
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,5,dtmPBI_WORK_ODR_DLV_DATE);    --品目別仕掛 作業製造納期
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,6,numPBI_OPR_INST_QTY);         --品目別仕掛 作業指示数
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,7,numOD_ITEM_SPOIL);            --所要量     所要量品目仕損率
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,8,numPBI_MODIFY_COUNT);         --品目別仕掛 更新数
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,9,vc2OD_PATTERN_CD);            --所要量 パターンコード
/*-----------------------------------------------------------------------------
' 計算に使用する値をそれぞれメモリ変数に転記する
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00090';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            /* 作業製造着手日ワークに品目別仕掛の作業製造着手日を転記 */
            dtmWkStartDate := dtmPBI_OPR_INST_START_DATE;
            /* 品目最小許容量＝品目別仕掛.作業指示数／（１＋（所要量.所要量品目仕損率／100））*/
            numMinAllowance := TRUNC(numPBI_OPR_INST_QTY / (1 + (numOD_ITEM_SPOIL / 100)), 4);
            /* 作業系列仕損率の初期化（ゼロ）*/
            numGrpWKSpoil := 0;
            /* 作業指示数ワークに品目別仕掛の作業指示数を転記 */
            numWkOdrInstQty := numPBI_OPR_INST_QTY;
/*-----------------------------------------------------------------------------
' 品目データ検索
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00100';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            OPEN curM_ITEM(vc2PBI_ITEM_CD);
            FETCH curM_ITEM INTO numITM_UNIT_QTY_TYP;  --在庫数単位区分
            IF curM_ITEM%NOTFOUND THEN
                RAISE excITM_UNIT_QTY_TYP_GET_ERR;
            END IF;
            CLOSE curM_ITEM;
/*-----------------------------------------------------------------------------
' パターン別作業系列データ件数検索
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00110';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            SELECT COUNT(*) INTO numM_PATTERN_PROC_GRP_Count
                FROM M_PATTERN_PROC_GRP
                WHERE ITEM_CD = vc2PBI_ITEM_CD
                    and PLANT_CD = pvc2PlantCd
                    and PATTERN_CD = vc2OD_PATTERN_CD;
            IF numM_PATTERN_PROC_GRP_Count <= 0 THEN
                RAISE excM_PTN_PROC_GRP_Count_ERR;
            END IF;
/*-----------------------------------------------------------------------------
' パターン別作業系列データ検索
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00120';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            /* 「パターン別作業系列」データ処理位置初期化 */
            numM_PATTERN_PROC_GRP_Index := 0;
            OPEN curM_PATTERN_PROC_GRP(pvc2PlantCd,
                               vc2PBI_ITEM_CD,
                               vc2OD_PATTERN_CD);
            FETCH curM_PATTERN_PROC_GRP INTO RtpM_PATTERN_PROC_GRP;
            /* パターン別作業系列データが存在しない場合 */
            IF curM_PATTERN_PROC_GRP%NOTFOUND THEN
                RAISE excM_PTN_PROC_GRP_GET_ERR;
            ELSE
/*-----------------------------------------------------------------------------
' 全て外作の場合は、作業区コード等のチェックは行わない。
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00130';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                /* 内作工程が存在するか否か */
                numOUTSIDE_TYP_Count := 0;
                SELECT count(*) INTO numOUTSIDE_TYP_Count
                    FROM  M_PATTERN_PROC_GRP
                    WHERE OUTSIDE_TYP = 1
                    AND PLANT_CD = pvc2PlantCd
                    AND ITEM_CD = vc2PBI_ITEM_CD
                    AND PATTERN_CD = vc2OD_PATTERN_CD;
                IF numOUTSIDE_TYP_Count > 0 THEN
/*-----------------------------------------------------------------------------
' 最初の内作工程に作業区コードが設定されていない場合エラー
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00140';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    OPEN curM_PATTERN_PROC_GRP_WS_CD(pvc2PlantCd,
                                             vc2PBI_ITEM_CD,
                                             vc2OD_PATTERN_CD);
                    FETCH curM_PATTERN_PROC_GRP_WS_CD INTO RtpM_PATTERN_PROC_GRP_WS_CD;
                    /* 作業区コードが設定されていない場合 */
                    IF RtpM_PATTERN_PROC_GRP_WS_CD.WS_CD IS null THEN
                        RAISE excM_PTN_PROC_GRP_WS_CD_ERR;
                    ELSE
                        vc2PG_WS_CD_OutsideTipe  :=  RtpM_PATTERN_PROC_GRP_WS_CD.WS_CD;
                    END IF;
                    CLOSE curM_PATTERN_PROC_GRP_WS_CD;
/*-----------------------------------------------------------------------------
' 作業区コードが一致する[作業区]."工場コード"が、[品目別仕掛]."工場コード"と
' 一致しない場合エラー
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00150';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    numM_WS_PLAN_WS_WH_Count := 0;
                    SELECT COUNT(*) INTO numM_WS_PLAN_WS_WH_Count
                        FROM M_WS
                        WHERE WS_CD = vc2PG_WS_CD_OutsideTipe;
                    IF numM_WS_PLAN_WS_WH_Count <= 0 THEN
                        RAISE excM_WS_PLAN_WS_WH_ERR;
                    END IF;
--vc2RunChkComment := '●●●●通過 00160';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    SELECT PLANT_CD, WH_CD
                        INTO vc2WkM_WS_PLANT_CD, vc2WkM_WS_WH_CD
                        FROM M_WS
                        WHERE WS_CD = vc2PG_WS_CD_OutsideTipe;
                    IF pvc2PlantCd != vc2WkM_WS_PLANT_CD THEN
                        RAISE excM_WS_PLAN_WS_WH_ERR;
                    END IF;
/*-----------------------------------------------------------------------------
' 作業区コードが一致する[作業区]."保管区コード"が、設定されていない場合エラー
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00170';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    SELECT PLANT_CD, WH_CD
                        INTO vc2WkM_WS_PLANT_CD, vc2WkM_WS_WH_CD
                        FROM M_WS
                        WHERE WS_CD = vc2PG_WS_CD_OutsideTipe;
                    IF vc2WkM_WS_WH_CD IS NULL THEN
                        RAISE excM_WS_WH_CD_ERR;
                    END IF;
/*-----------------------------------------------------------------------------
' 作業区コードが一致する[作業区]."保管区コード"が一致する、
' [保管区]."保管区コード"が、設定されていない場合エラー
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00180';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    numM_M_WH_WH_CD_Count := 0;
                    SELECT COUNT(*) INTO numM_M_WH_WH_CD_Count
                        FROM M_WH
                        WHERE WH_CD = vc2WkM_WS_WH_CD;
                    IF numM_M_WH_WH_CD_Count <= 0 THEN
                        RAISE excM_WH_WH_CD_ERR;
                    END IF;
--vc2RunChkComment := '●●●●通過 00190';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    SELECT WH_CD
                        INTO vc2WkM_WH_WH_CD
                        FROM M_WH
                        WHERE WH_CD = vc2WkM_WS_WH_CD;
                    IF vc2WkM_WH_WH_CD = NULL THEN
                        RAISE excM_WH_WH_CD_ERR;
                    END IF;
/*-----------------------------------------------------------------------------
' 保管区コードが一致する[保管区]."工場コード"が、[品目別仕掛]."工場コード"と
' 一致しない場合エラー
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00200';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    numM_WH_PLANT_Count := 0;
                    SELECT COUNT(*) INTO numM_WH_PLANT_Count
                        FROM M_WH
                        WHERE WH_CD = vc2WkM_WS_WH_CD;
                    IF numM_WH_PLANT_Count <= 0 THEN
                        RAISE excM_WH_PLANT_ERR;
                    END IF;
--vc2RunChkComment := '●●●●通過 00210';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    SELECT PLANT_CD
                        INTO vc2WkM_WH_PLANT_CD
                        FROM M_WH
                        WHERE WH_CD = vc2WkM_WS_WH_CD;
                    IF pvc2PlantCd != vc2WkM_WH_PLANT_CD THEN
                        RAISE excM_WH_PLANT_ERR;
                    END IF;
                END IF;
/*-----------------------------------------------------------------------------
' 「業務運用日付」＞「作業製造着手日」の時ワーニング
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00220';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                IF TO_CHAR(dtmBusinessOprDate, 'YYYYMMDD') > TO_CHAR(dtmPBI_OPR_INST_START_DATE, 'YYYYMMDD') THEN
                    /* ワーニングメッセージの作成 */
                    vc2Comment := SUBSTR('(SBM0496)'|| LOGMSG_WORKODRCD || LOGMSG_BRAKETS || vc2PBI_WORK_ODR_CD || LOGMSG_BRAKETE,
                                         1,256);
                    /* ワーニングメッセージの出力 */
                    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                        pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                        MY_SQL_NAME, APS_PROC_STARTDATE_INV, vc2Comment);
                END IF;
/*-----------------------------------------------------------------------------
' パターン別作業系列データLOOP
'
-----------------------------------------------------------------------------*/
                LOOP
--vc2RunChkComment := '●●●●通過 00230';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    /* パターン別作業系列データのＥＯＦ */
                    EXIT WHEN curM_PATTERN_PROC_GRP%NOTFOUND;
                    /* 「パターン別作業系列」データ処理位置 */
                    numM_PATTERN_PROC_GRP_Index := numM_PATTERN_PROC_GRP_Index + 1;
                    /* 取得データの待避 */
                    vc2PG_PROC_CD := RtpM_PATTERN_PROC_GRP.PROC_CD;                 --品目別作業コード
                    numPG_PROC_NO := RtpM_PATTERN_PROC_GRP.PROC_NO;                 --作業系列番号
                    vc2PG_PROC_NAME := RtpM_PATTERN_PROC_GRP.PROC_NAME;             --作業名
                    vc2PG_WS_CD := RtpM_PATTERN_PROC_GRP.WS_CD;                     --作業区コード
                    vc2PG_COMPANY_CD := RtpM_PATTERN_PROC_GRP.COMPANY_CD;           --会社コード
                    vc2PG_VEND_CD := RtpM_PATTERN_PROC_GRP.VEND_CD;                 --代表取引先コード
                    numPG_FIXED_LT := RtpM_PATTERN_PROC_GRP.FIXED_LT;               --作業系列固定分リードタイム
                    numPG_PROP_LT := RtpM_PATTERN_PROC_GRP.PROP_LT;                 --作業系列比例分リードタイム
                    numPG_SAFETY_LT := RtpM_PATTERN_PROC_GRP.SAFETY_LT;             --作業系列安全日数
                    numPG_PROP_LOT_SIZE := RtpM_PATTERN_PROC_GRP.PROP_LOT_SIZE;     --作業系列比例分ロットサイズ
                    numPG_SPOIL := RtpM_PATTERN_PROC_GRP.SPOIL;                     --作業系列仕掛率
                    numPG_OUTSIDE_TYP := RtpM_PATTERN_PROC_GRP.OUTSIDE_TYP;         --作業系列内外作区分
                    numPG_ACPT_INSPC_TYP := RtpM_PATTERN_PROC_GRP.ACPT_INSPC_TYP;   --作業系列受入検査区分
/*-----------------------------------------------------------------------------
' 作業系列毎最小許容量の計算
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00240';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    numGrpMinAllowance := TRUNC(numWkOdrInstQty / (1 + (numGrpWKSpoil / 100)), 4);
                    /* 品目最小許容量 ＞ 作業系列毎最小許容量 */
                    IF numMinAllowance > numGrpMinAllowance THEN
--vc2RunChkComment := '●●●●通過 00250';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                        /* 品目.在庫数単位区分 ＝ 整数管理(1) */
                        IF numITM_UNIT_QTY_TYP = UNIT_QTY_TYP_DECIMAL THEN
                            numMinAllowance := TRUNC(numMinAllowance);
                        END IF;
                        /* 作業指示数のメモリ変数に品目最小許容量を転記する */
                        numWkOdrInstQty := numMinAllowance;
                        /* 作業系列別仕掛の作業指示数は品目最小許容量とする */
                        numPBP_OPR_INST_QTY := numMinAllowance;
                    /* 品目最小許容量 ≦ 作業系列毎最小許容量 */
                    ELSE
--vc2RunChkComment := '●●●●通過 00260';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                        /* 品目.在庫数単位区分 ＝ 整数管理(1) */
                        IF numITM_UNIT_QTY_TYP = UNIT_QTY_TYP_DECIMAL THEN
                            numGrpMinAllowance := TRUNC(numGrpMinAllowance);
                        END IF;
                        /* 作業指示数のメモリ変数に作業系列毎最小許容量を転記する */
                        numWkOdrInstQty := numGrpMinAllowance;
                        /* 作業系列別仕掛の作業指示数は作業系列毎最小許容量とする */
                        numPBP_OPR_INST_QTY := numGrpMinAllowance;
                    END IF;
/*-----------------------------------------------------------------------------
' 作業系列別仕掛の作業指示数がゼロの場合、ワーニング
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00270';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    IF numPBP_OPR_INST_QTY = 0 THEN
--vc2RunChkComment := '●●●●通過 00280';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                        /* ワーニングメッセージの作成 */
                        vc2Comment := SUBSTR('(SBM0557)'|| LOGMSG_WORKODRCD || LOGMSG_BRAKETS || vc2PBI_WORK_ODR_CD || LOGMSG_BRAKETE ||
                                             LOGMSG_WORKINPROCCD || LOGMSG_BRAKETS || vc2PG_PROC_CD || LOGMSG_BRAKETE,
                                             1,256);
                        /* ワーニングメッセージの出力 */
                        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                            MY_SQL_NAME, APS_PROC_OPRINSTQTY_INV, vc2Comment);
                    END IF;
/*-----------------------------------------------------------------------------
' 系列のリードタイム計算
' 系列ＬＴ＝ パターン別作業系列.作業系列固定分ＬＴ
'            ＋（作業指示数／パターン別作業系列.作業系列比例分ＬＳ)
'            × パターン別作業系列.作業系列比例分ＬＴ
'            ＋ パターン別作業系列.作業系列安全日数
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00290';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    /* 作業指示数のメモリ変数　／　パターン別作業系列.作業系列比例分ロットサイズ */
                    numWkQty := TRUNC(numWkOdrInstQty / numPG_PROP_LOT_SIZE, 4);
                    /* 切り上げ */
                    IF numWkQty = TRUNC(numWkQty) THEN
--vc2RunChkComment := '●●●●通過 00300';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                        /* 整数値の場合はそのまま */
                        numWkResultQty := numWkQty;
                    ELSE
--vc2RunChkComment := '●●●●通過 00310';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                        /* 小数値の場合は切上げを行い整数に変換する */
                        numWkResultQty := TRUNC(numWkQty) + 1;
                    END IF;
--vc2RunChkComment := '●●●●通過 00320';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    numWkGrpLT := numPG_FIXED_LT +
                                 (numWkResultQty) * numPG_PROP_LT +
                                 numPG_SAFETY_LT;
/*-----------------------------------------------------------------------------
' 系列別納期の計算
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00330';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    blnStartForward := true;
                    --算出稼働日 dtmActiveDate の取得   ------FncWorkDayCalc-------
                    blnRet := FNCWORKDAYCALC(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId, pvc2BusinessName, pvc2PlantCd,vc2PBI_ITEM_CD,
                                 dtmWkStartDate, numWkGrpLT, blnStartForward, dtmActiveDate);
                    IF blnRet = FALSE THEN
                        RAISE excWORK_DAY_CALC_ERR;
                    END IF;
--vc2RunChkComment := '●●●●通過 00340';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    /* 作業系列別仕掛.作業系列別着手日の決定 */
                    dtmPBP_OPR_INST_START_DATE := dtmWkStartDate;
/*-----------------------------------------------------------------------------
' 品目別仕掛の製造納期よりも遅くなる場合ワーニング
'
-----------------------------------------------------------------------------*/
                    IF TO_CHAR(dtmActiveDate, 'YYYYMMDD') > TO_CHAR(dtmPBI_WORK_ODR_DLV_DATE, 'YYYYMMDD') THEN
--vc2RunChkComment := '●●●●通過 00350';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                        /* 系列別製造納期は品目別仕掛の製造納期とする */
                        dtmPBP_WORK_ODR_DLV_DATE := dtmPBI_WORK_ODR_DLV_DATE;
                        /* 作業指示納期のセーブ */
                        dtmWkStartDate := dtmPBI_WORK_ODR_DLV_DATE;
                        /* ワーニングメッセージの作成 */
                        vc2Comment := SUBSTR('(SBM0558)'||LOGMSG_ITEMCD || LOGMSG_BRAKETS || vc2PBI_ITEM_CD || LOGMSG_BRAKETE ||
                                             LOGMSG_WORKODRCD || LOGMSG_BRAKETS || vc2PBI_WORK_ODR_CD || LOGMSG_BRAKETE ||
                                             LOGMSG_WORKINPROCCD || LOGMSG_BRAKETS || vc2PG_PROC_CD || LOGMSG_BRAKETE,
                                             1,256);
                        /* ワーニングメッセージの出力 */
                        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                            MY_SQL_NAME, APS_PROC_LT_INV, vc2Comment);
/*-----------------------------------------------------------------------------
' 品目別仕掛の製造納期よりも早くなる場合
'
-----------------------------------------------------------------------------*/
                    ELSE
--vc2RunChkComment := '●●●●通過 00360';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                        /* 最終系列（作業系列データの最終レコードの時） */
                        IF numM_PATTERN_PROC_GRP_Count = numM_PATTERN_PROC_GRP_Index THEN
--vc2RunChkComment := '●●●●通過 00370';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                            /* 系列別製造納期は品目別仕掛の製造納期とする */
                            dtmPBP_WORK_ODR_DLV_DATE := dtmPBI_WORK_ODR_DLV_DATE;
                        ELSE
--vc2RunChkComment := '●●●●通過 00380';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                            /* 系列別製造納期は算出した製造納期とする */
                            dtmPBP_WORK_ODR_DLV_DATE := dtmActiveDate;
                            /* 作業指示納期のセーブ */
                            dtmWkStartDate := dtmActiveDate;
                        END IF;
                    END IF;
/*-----------------------------------------------------------------------------
' 内作の場合の処理
'
-----------------------------------------------------------------------------*/
                     IF vc2PG_VEND_CD IS NULL THEN   --パターン別作業系列.代表取引先コード
--vc2RunChkComment := '●●●●通過 00390';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                        numPBP_UNIT_COST_TYP := UNIT_COST_TEMP;     --作業系列別仕掛 単価区分 ← 仮単価(1)
                        numPBP_UNIT_COST := 0;                      --作業系列別仕掛 単価
                        numPBP_PROCESSING_COST := 0;                --作業系列別仕掛 加工費
                        numPBP_MATERIAL_COST := 0;                  --作業系列別仕掛 材料費
                        numPBP_OTHER_OVERHEADS := 0;                --作業系列別仕掛 その他経費
                    numPBP_PUCH_ODR_AMOUNT := 0;                --作業系列別仕掛 発注金額
/*-----------------------------------------------------------------------------
' 外作の場合の処理
' 外注単価データ，取引先データ，通貨データ検索
'
-----------------------------------------------------------------------------*/
                    ELSE
--vc2RunChkComment := '●●●●通過 00400';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                        OPEN curM_SBCNT_UNIT_COST(
                                                  pvc2PlantCd,
                                                  vc2PG_COMPANY_CD,
                                                  vc2PG_VEND_CD,
                                                  vc2PBI_ITEM_CD,
                                                  vc2PG_PROC_CD,
                                                  dtmPBP_OPR_INST_START_DATE,
                                                  numWkOdrInstQty);
                        FETCH curM_SBCNT_UNIT_COST INTO RtpM_SBCNT_UNIT_COST;
                        /* 該当する外注単価データが存在しない場合 */
                         IF curM_SBCNT_UNIT_COST%NOTFOUND THEN
--vc2RunChkComment := '●●●●通過 00410';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                            numPBP_UNIT_COST_TYP := UNIT_COST_TEMP; --作業系列別仕掛 単価区分 ← 仮単価(1)
                            numPBP_UNIT_COST := 0;                  --作業系列別仕掛 単価
                            numPBP_PROCESSING_COST := 0;            --作業系列別仕掛 加工費
                            numPBP_MATERIAL_COST := 0;              --作業系列別仕掛 材料費
                            numPBP_OTHER_OVERHEADS := 0;            --作業系列別仕掛 その他経費
                            numPBP_PUCH_ODR_AMOUNT := 0;            --作業系列別仕掛 発注金額
                        /* 外注単価データが存在する場合 */
                        ELSE
--vc2RunChkComment := '●●●●通過 00420';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                            /* 取得データの待避 */
                            numPBP_UNIT_COST_TYP   := RtpM_SBCNT_UNIT_COST.UNIT_COST_TYP;       --作業系列別仕掛 単価区分   ← 外注単価 外注単価区分
                            numPBP_UNIT_COST       := RtpM_SBCNT_UNIT_COST.UNIT_COST;           --作業系列別仕掛 単価       ← 外注単価 外注単価
                            numWkUnitCost          := RtpM_SBCNT_UNIT_COST.UNIT_COST;           --ＷＫ単価                  ← 外注単価 外注単価
                            numPBP_PROCESSING_COST := RtpM_SBCNT_UNIT_COST.PROCESSING_COST;     --作業系列別仕掛 加工費     ← 外注単価 外注加工費
                            numPBP_MATERIAL_COST   := RtpM_SBCNT_UNIT_COST.MATERIAL_COST;       --作業系列別仕掛 材料費     ← 外注単価 外注材料費
                            numPBP_OTHER_OVERHEADS := RtpM_SBCNT_UNIT_COST.OTHER_OVERHEADS;     --作業系列別仕掛 その他経費 ← 外注単価 外注その他経費
                            numPBP_PUCH_ODR_AMOUNT := 0;                                        --作業系列別仕掛 発注金額   ← 0
                            /* 取引先データが存在する場合は丸め処理を行う */
                            IF RtpM_SBCNT_UNIT_COST.ROUND_TYP IS NOT NULL THEN
--vc2RunChkComment := '●●●●通過 00430';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                                --numData := TRUNC(numWkOdrInstQty * numWkUnitCost, 4);
                                blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                                      pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                                      numWkOdrInstQty * numWkUnitCost,  --(i)端数処理前の値
                                                      RtpM_SBCNT_UNIT_COST.DECIMAL_FIG, --(i)少数桁数
                                                      RtpM_SBCNT_UNIT_COST.ROUND_TYP,   --(i)端数処理区分
                                                      numResultAmount);                 --(o)端数処理後の値
                                IF blnRet = FALSE THEN
                                    RAISE excGETROUND_ERR;
                                END IF;
                                /* 丸めの結果を発注金額に反映する */
                                numPBP_PUCH_ODR_AMOUNT := numResultAmount;
                            END IF;
                        END IF;
                        CLOSE curM_SBCNT_UNIT_COST;
                    END IF;
/*-----------------------------------------------------------------------------
' パターン別作業系列.作業系列別実績区分＝作業系列毎に実績を上げる(1) 且つ
' パターン別作業系列.作業系列内外作区分＝内作(1)
' 作業指示伝票を作成する
'
-----------------------------------------------------------------------------*/
                    IF numPG_OUTSIDE_TYP = OUTSIDE_TYP_INNER_MAKE THEN
--vc2RunChkComment := '●●●●通過 00440';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                        /* 作業指示番号を取得する */
                        blnRet := FncGetNewInstCd(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                      pvc2UserId, pvc2BusinessName, pvc2PlantCd, vc2PBP_OPR_INST_CD);
                        IF blnRet = FALSE THEN
                            RAISE excNEW_INST_CD_GET_ERR;
                        END IF;
--vc2RunChkComment := '◆作業指示伝票を作成する';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                        /* 作業指示伝票を作成する */
                        INSERT INTO T_OPR_INST_SLIP(
                             OPR_INST_CD                --作業指示番号
                            ,OPR_INST_CD_GNR_TYP        --作業指示番号発生区分
                            ,OPR_INST_SLIP_ISS_DATE     --作業指示伝票発行日
                            ,OPR_INST_SLIP_ISS_FLG      --作業指示伝票発行済みフラグ
                            ,PLANT_CD                   --工場コード
                            ,CREATED_DATE               --作成日
                            ,CREATED_BY                 --作成者
                            ,CREATED_PRG_NM             --作成プログラム名
                            ,UPDATED_DATE               --更新日
                            ,UPDATED_BY                 --更新者
                            ,UPDATED_PRG_NM             --更新プログラム名
                            ,MODIFY_COUNT               --更新数
                        ) VALUES (
                             vc2PBP_OPR_INST_CD         --作業指示番号
                            ,INST_CD_RISE_PROCESS       --作業指示番号発生区分（2：作業系列）
                            ,NULL                       --作業指示伝票発行日
                            ,INST_NOISSUE               --作業指示伝票発行済みフラグ（0：Ｏｆｆ）
                            ,pvc2PlantCd                --工場コード
                            ,SYSDATE                    --作成日
                            ,pvc2UserId                 --作成者
                            ,MY_SQL_NAME                --作成プログラム名
                            ,SYSDATE                    --更新日
                            ,pvc2UserId                 --更新者
                            ,MY_SQL_NAME                --更新プログラム名
                            ,0                          --更新数
                            );
                    /* 上記以外 */
                    ELSE
                        vc2PBP_OPR_INST_CD := NULL;
                    END IF;
/*-----------------------------------------------------------------------------
' 作業系列別仕掛データの設定値設定
'
-----------------------------------------------------------------------------*/
                    /* 取引先コード が NULL であれば、会社コード も NULL にする */
                    IF vc2PG_VEND_CD IS NULL THEN
                    vc2PG_COMPANY_CD := NULL;
                    END IF;
                    /* 最終系列（作業系列データの最終レコードの時） */
                    IF numM_PATTERN_PROC_GRP_Count = numM_PATTERN_PROC_GRP_Index THEN
--vc2RunChkComment := '●●●●通過 00450';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                        numPBP_FINAL_PROC_FLG := FINAL_PROCESS_ON;    --最終系列フラグ(1:最終経路)
                    ELSE
--vc2RunChkComment := '●●●●通過 00460';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                        numPBP_FINAL_PROC_FLG := FINAL_PROCESS_OFF;   --最終系列フラグ(0:非)
                    END IF;
/*-----------------------------------------------------------------------------
' 作業系列別仕掛データを作成する
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '◆作業系列別仕掛データを作成する';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    /* 作業系列別仕掛データを作成する */
                    INSERT INTO T_WORK_IN_PROC_BY_PROC(
                         WORK_ODR_CD                             --作業計画番号
                        ,WORK_IN_PROC_CD                         --仕掛作業コード
                        ,OD_NO                                   --オーダデマンド番号
                        ,PROC_NAME                               --仕掛作業名
                        ,PROC_NO                                 --仕掛作業系列番号
                        ,ITEM_CD                                 --品目番号
                        ,OUTSIDE_TYP                             --仕掛内外作区分
                        ,WS_CD                                   --作業区コード
                        ,COMPANY_CD                              --会社コード
                        ,VEND_CD                                 --取引先コード
                        ,PLANT_CD                                --工場コード
                        ,WORK_ODR_DLV_DATE                       --作業系列別製造納期
                        ,OPR_INST_START_DATE                     --作業系列別着手日
                        ,OPR_INST_QTY                            --作業指示数
                        ,UNIT_COST_TYP                           --単価区分
                        ,UNIT_COST                               --単価
                        ,PROCESSING_COST                         --加工費
                        ,MATERIAL_COST                           --材料費
                        ,OTHER_OVERHEADS                         --その他経費
                        ,PUCH_ODR_AMOUNT                         --発注金額
                        ,DISC_AMOUNT                             --値引金額
                        ,ACPT_INSPC_TYP                          --作業系列受入検査区分
                        ,WORK_STS_TYP                            --作業系列別作業状態区分
                        ,FINAL_PROC_FLG                          --最終系列フラグ
                        ,OPR_INST_DATE                           --作業系列別作業指示日
                        ,WORK_CMPLT_DATE                         --作業系列別仕掛完了日
                        ,OPR_INST_CD                             --作業指示番号
                        ,WORK_IN_PROC_COMMENT                    --作業系列別仕掛備考
                        ,WORKER_QTY                              --要員数
                        ,CREATED_DATE                            --作成日
                        ,CREATED_BY                              --作成者
                        ,CREATED_PRG_NM                          --作成プログラム名
                        ,UPDATED_DATE                            --更新日
                        ,UPDATED_BY                              --更新者
                        ,UPDATED_PRG_NM                          --更新プログラム名
                        ,MODIFY_COUNT                            --更新数
                    ) VALUES (
                         vc2PBI_WORK_ODR_CD                      --作業計画番号
                        ,vc2PG_PROC_CD                           --仕掛作業コード
                        ,vc2PBI_OD_NO                            --オーダデマント番号
                        ,vc2PG_PROC_NAME                         --仕掛作業名
                        ,numPG_PROC_NO                           --仕掛作業系列番号
                        ,vc2PBI_ITEM_CD                          --品目番号
                        ,numPG_OUTSIDE_TYP                       --仕掛内外作区分
                        ,vc2PG_WS_CD                             --作業区コード
                        ,vc2PG_COMPANY_CD                        --会社コード
                        ,vc2PG_VEND_CD                           --取引先コード
                        ,pvc2PlantCd                             --工場コード
                        ,dtmPBP_WORK_ODR_DLV_DATE                --作業系列別製造納期
                        ,dtmPBP_OPR_INST_START_DATE              --作業系列別着手日
                        ,numPBP_OPR_INST_QTY                     --作業指示数
                        ,numPBP_UNIT_COST_TYP                    --単価区分
                        ,numPBP_UNIT_COST                        --単価
                        ,numPBP_PROCESSING_COST                  --加工費
                        ,numPBP_MATERIAL_COST                    --材料費
                        ,numPBP_OTHER_OVERHEADS                  --その他経費
                        ,numPBP_PUCH_ODR_AMOUNT                  --発注金額
                        ,0                                       --値引金額
                        ,numPG_ACPT_INSPC_TYP                    --作業系列受入検査区分
                        ,WORK_STS_TYP_NOINSTRACT                 --作業系列別作業状態区分（1:未指示）
                        ,numPBP_FINAL_PROC_FLG                   --最終系列フラグ
                        ,NULL                                    --作業系列別作業指示日
                        ,NULL                                    --作業系列別仕掛完了日
                        ,vc2PBP_OPR_INST_CD                      --作業指示番号
                        ,NULL                                    --作業系列別仕掛備考
                        ,0                                       --要員数
                        ,SYSDATE                                 --作成日
                        ,pvc2UserId                              --作成者
                        ,MY_SQL_NAME                             --作成プログラム名
                        ,SYSDATE                                 --更新日
                        ,pvc2UserId                              --更新者
                        ,MY_SQL_NAME                             --更新プログラム名
                        ,0                                       --更新数
                        );
                    /* 作業系列仕損率save */
                    numGrpWKSpoil := numPG_SPOIL;
                    /* 次データ読み込み */
                    FETCH curM_PATTERN_PROC_GRP INTO RtpM_PATTERN_PROC_GRP;
                END LOOP;


            END IF;
            CLOSE curM_PATTERN_PROC_GRP;
/*-----------------------------------------------------------------------------
' 品目別仕掛データにエラーがなかった場合、品目別仕掛データを更新する
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '◆品目別仕掛データを更新する';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            UPDATE T_WORK_IN_PROC_BY_ITEM SET
                PROC_EXPLOSION_FLG = PROCESS_EXPAND           --作業系列展開済みフラグ(1:展開済み)
                ,UPDATED_DATE = SYSDATE                        --更新日
                ,UPDATED_BY = pvc2UserId                       --更新者
                ,UPDATED_PRG_NM = MY_SQL_NAME                  --更新プログラム名
                ,MODIFY_COUNT = MODIFY_COUNT + 1               --更新数
                WHERE WORK_ODR_CD = vc2PBI_WORK_ODR_CD;
--vc2RunChkComment := '◆UPDATE終了';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
/*-----------------------------------------------------------------------------
' 「処理件数」のインクリメント
'
-----------------------------------------------------------------------------*/
            numTransactionCount := numTransactionCount + 1;
/*-----------------------------------------------------------------------------
' 品目別仕掛データ１件分に対する処理に対してのＥＸＣＰＴＩＯＮ
'
-----------------------------------------------------------------------------*/
        EXCEPTION
            --品目データ検索
            WHEN excITM_UNIT_QTY_TYP_GET_ERR THEN
--DBMS_OUTPUT.PUT_LINE('excITM_UNIT_QTY_TYP_GET_ERR');
                CLOSE curM_ITEM;
                /* エラーメッセージの作成 */
                vc2Comment := SUBSTR('(SBM0534)'|| LOGMSG_ITEMCD || LOGMSG_BRAKETS || vc2PBI_ITEM_CD || LOGMSG_BRAKETE,
                                     1,256);
                /* エラーメッセージの出力 */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                    MY_SQL_NAME, APS_NOTEXIST_M_ITEM, vc2Comment);
            --パターン別作業系列データ件数検索
            WHEN excM_PTN_PROC_GRP_Count_ERR THEN
--DBMS_OUTPUT.PUT_LINE('excM_PTN_PROC_GRP_Count_ERR');
                /* エラーメッセージの作成 */
                vc2Comment := SUBSTR('(SBM0560)'|| LOGMSG_PLANTCD || LOGMSG_BRAKETS || pvc2PlantCd || LOGMSG_BRAKETE || LOGMSG_ITEMCD || LOGMSG_BRAKETS || vc2PBI_ITEM_CD || LOGMSG_BRAKETE,
                                     1,256);
                /* エラーメッセージの出力 */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                    MY_SQL_NAME, APS_NOTEXIST_M_PTN_PROC_GRP, vc2Comment);
            --パターン別作業系列データ検索
            WHEN excM_PTN_PROC_GRP_GET_ERR THEN
--DBMS_OUTPUT.PUT_LINE('excM_PTN_PROC_GRP_GET_ERR');
                CLOSE curM_PATTERN_PROC_GRP;
                /* エラーメッセージの作成 */
                vc2Comment := SUBSTR('(SBM0534)'|| LOGMSG_ITEMCD || LOGMSG_BRAKETS || vc2PBI_ITEM_CD || LOGMSG_BRAKETE,
                                     1,256);
                /* エラーメッセージの出力 */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                    MY_SQL_NAME, APS_NOTEXIST_M_PTN_PROC_GRP, vc2Comment);
            --最初の内作工程に作業区コードが設定されていない場合エラー
            WHEN excM_PTN_PROC_GRP_WS_CD_ERR THEN
--DBMS_OUTPUT.PUT_LINE('excM_PTN_PROC_GRP_WS_CD_ERR');
                CLOSE curM_PATTERN_PROC_GRP;
                CLOSE curM_PATTERN_PROC_GRP_WS_CD;
                /* エラーメッセージの作成 */
                vc2Comment := SUBSTR('(SBM0496)'|| LOGMSG_WORKODRCD || LOGMSG_BRAKETS || vc2PBI_WORK_ODR_CD || LOGMSG_BRAKETE,
                                     1,256);
                /* エラーメッセージの出力(AD00011) */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                    MY_SQL_NAME, APS_NOTEXIST_M_WS, vc2Comment);
            --作業区コードが一致する[作業区]."工場コード"が、[品目別仕掛]."工場コード"と一致しない場合エラー
            WHEN excM_WS_PLAN_WS_WH_ERR THEN
--DBMS_OUTPUT.PUT_LINE('excM_WS_PLAN_WS_WH_ERR');
                CLOSE curM_PATTERN_PROC_GRP;
                /* エラーメッセージの作成 */
                vc2Comment := SUBSTR('(SBM0496)'||LOGMSG_WORKODRCD || LOGMSG_BRAKETS || vc2PBI_WORK_ODR_CD || LOGMSG_BRAKETE,
                                     1,256);
                /* エラーメッセージの出力(AD00012) */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                    MY_SQL_NAME, APS_DIFF_PLANT_OF_WS, vc2Comment);
            --作業区コードが一致する[作業区]."保管区コード"が、設定されていない場合エラー
            WHEN excM_WS_WH_CD_ERR THEN
--DBMS_OUTPUT.PUT_LINE('excM_WS_WH_CD_ERR');
                CLOSE curM_PATTERN_PROC_GRP;
                /* エラーメッセージの作成 */
                vc2Comment := SUBSTR('(SBM0496)'||LOGMSG_WORKODRCD || LOGMSG_BRAKETS || vc2PBI_WORK_ODR_CD || LOGMSG_BRAKETE,
                                     1,256);
                /* エラーメッセージの出力(AD00013) */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                MY_SQL_NAME, APS_NOTEXIST_M_WH, vc2Comment);
            --作業区コードが一致する[作業区]."保管区コード"が一致する、[保管区]."保管区コード"が、設定されていない場合エラー
            WHEN excM_WH_WH_CD_ERR THEN
--DBMS_OUTPUT.PUT_LINE('excM_WH_WH_CD_ERR');
                CLOSE curM_PATTERN_PROC_GRP;
                /* エラーメッセージの作成 */
                vc2Comment := SUBSTR('(SBM0496)'||LOGMSG_WORKODRCD || LOGMSG_BRAKETS || vc2PBI_WORK_ODR_CD || LOGMSG_BRAKETE,
                                     1,256);
                /* エラーメッセージの出力(AD00018) */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                    MY_SQL_NAME, APS_DIFF_WS_CD_OF_WH, vc2Comment);
            --保管区コードが一致する[保管区]."工場コード"が、[品目別仕掛]."工場コード"と一致しない場合エラー
            WHEN excM_WH_PLANT_ERR THEN
--DBMS_OUTPUT.PUT_LINE('excM_WH_PLANT_ERR');
                CLOSE curM_PATTERN_PROC_GRP;
                /* エラーメッセージの作成 */
                vc2Comment := SUBSTR('(SBM0496)'||LOGMSG_WORKODRCD || LOGMSG_BRAKETS || vc2PBI_WORK_ODR_CD || LOGMSG_BRAKETE,
                                     1,256);
                /* エラーメッセージの出力(AD00014) */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                    MY_SQL_NAME, APS_DIFF_PLANT_OF_WH, vc2Comment);
            --その他のエラー
            WHEN OTHERS THEN
--DBMS_OUTPUT.PUT_LINE('excOTHERS');
                ROLLBACK;
                numTransactionCount := 0;
                /* エラーメッセージの作成 */
                vc2Comment := SUBSTR('(SBM0021)'|| LOGMSG_ERR || '：' || SQLCODE || ',' || SUBSTR(SQLERRM,1,256),
                                     1,256);
                /* エラーメッセージの出力 */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                    MY_SQL_NAME, APS_COM_OTHER_ERR, vc2Comment);
                EXIT;

        END;
        ELSE
            /* 全行処理により処理終了 */
--DBMS_OUTPUT.PUT_LINE('◆全行処理により処理終了');
            EXIT;
        END IF;
/*-----------------------------------------------------------------------------
' 抽出件数分のMain/Loopの終了処理
'
-----------------------------------------------------------------------------*/
    END LOOP;
    COMMIT;
    /* カーソルクローズ */
    DBMS_SQL.CLOSE_CURSOR(intItemCursorName);
    /* 終了メッセージの作成 */
    vc2Comment := SUBSTR('(SBM0561)'|| LOGMSG_END_PGNM_EXPANDBYPTN ||
                         LOGMSG_OPRINST_START_DATE || '[ ' || pvc2OprInstStartDate || ' ]' ||
                         LOGMSG_WORKODR_DLV_DATE || '[ ' || pvc2WorkOdrDlvDate || ' ]' ||
                         LOGMSG_JOB_ODR_CODE || '[ ' || pvc2JobOdrCd || ' ]' ||
                         LOGMSG_PROCCOUNT || '[ ' || numTransactionCount || ' ]',
                         1,256);
    /* 終了メッセージの出力 */
    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                        pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                        MY_SQL_NAME, APS_BATCH_END, vc2Comment);
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
    --工場コード取得エラー
    WHEN excPLANT_CDE_GET_ERR THEN
--DBMS_OUTPUT.PUT_LINE('excPLANT_CDE_GET_ERR');
        ROLLBACK;
        /* 終了メッセージの作成 */
        vc2Comment := SUBSTR('(SBM0562)'|| LOGMSG_END_PGNM_EXPANDBYPTN || LOGMSG_ERR ||
                             LOGMSG_PLANTCD || LOGMSG_BRAKETS || pvc2PlantCd ||
                             LOGMSG_BRAKETE,
                             1,256);
        /* 終了メッセージの出力(AD00009) */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, APS_NOTEXIST_M_PLANT, vc2Comment);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        /* LogFile の CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);
    --「業務運用日」取得エラー
    WHEN excBUSINESSDATE_GET_ERR   THEN
--DBMS_OUTPUT.PUT_LINE('excBUSINESSDATE_GET_ERR');
        ROLLBACK;
        /* 終了メッセージの作成 */
        vc2Comment := SUBSTR('(SBM0555)'||LOGMSG_END_PGNM_EXPANDBYPTN || LOGMSG_ERR || '：業務運用日取得',
                             1,256);
        /* 終了メッセージの出力 */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, APS_BATCH_END, vc2Comment);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        /* LogFile の CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);
    --「稼働日数算出」エラー
    WHEN excWORK_DAY_CALC_ERR      THEN
--DBMS_OUTPUT.PUT_LINE('excWORK_DAY_CALC_ERR');
        ROLLBACK;
        /* 終了メッセージの作成 */
        vc2Comment := SUBSTR('(SBM0563)'|| LOGMSG_END_PGNM_EXPANDBYPTN || LOGMSG_ERR || '：稼働日数算出',
                             1,256);
        /* 終了メッセージの出力 */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, APS_BATCH_END, vc2Comment);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        /* LogFile の CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);
    --「作業指示番号」取得エラー
    WHEN excNEW_INST_CD_GET_ERR    THEN
--DBMS_OUTPUT.PUT_LINE('excNEW_INST_CD_GET_ERR');
        ROLLBACK;
        vc2Comment := SUBSTR('(SBM0566)'||LOGMSG_END_PGNM_EXPANDBYPTN || LOGMSG_ERR || '：作業指示番号取得',
                             1,256);
        /* 終了メッセージの出力 */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, APS_BATCH_END, vc2Comment);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        /* LogFile の CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);
    --「端数処理」エラー
    WHEN excGETROUND_ERR           THEN
--DBMS_OUTPUT.PUT_LINE('excGETROUND_ERR');
        ROLLBACK;
        vc2Comment := SUBSTR('(SBM0567)'||LOGMSG_END_PGNM_EXPANDBYPTN || LOGMSG_ERR || '：端数処理',
                             1,256);
        /* 終了メッセージの出力 */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, APS_BATCH_END, vc2Comment);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        /* LogFile の CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);
    --その他のエラー
    WHEN OTHERS THEN
--DBMS_OUTPUT.PUT_LINE('excOTHERS');
        ROLLBACK;
        /* 終了メッセージの作成 */
        vc2Comment := SUBSTR('(SBM0568)'||LOGMSG_END_PGNM_EXPANDBYPTN || LOGMSG_ERR || '：' ||
                             SQLCODE || ',' || SUBSTR(SQLERRM,1,256),
                             1,256);
        /* 終了メッセージの出力 */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, APS_BATCH_END, vc2Comment);
        /* TraceLog の出力（実行位置） */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END || vc2RunChkComment);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        /* LogFile の CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);
END;
/
