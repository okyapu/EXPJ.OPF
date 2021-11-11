CREATE OR REPLACE PROCEDURE SQLPJBUDGETCOSTMAKE(
/*------------------------------------------------------------------------------
'
' version   : 1.00.01
'
' 修正履歴
' 2014.04.21 初版
'
' 機能      : 案件予算積上処理
'
' 戻り値    : Boolean
'               True :正常終了
'               False:異常終了
'
' 引き数    : pvc2LogMode           - (i)LOGモード
'                                      0:LOG無し, 1:エラーLOG, 2:トレースLOG, 3:データLOG
'             pvc2OutputMode        - (i)出力モード
'                                      0:イベントビューア, 1:ファイル
'             pvc2OutputPath        - (i)出力ファイルパス
'             pvc2OutputName        - (i)出力ファイル名
'             pvc2UserId            - (i)ユーザＩＤ
'             pvc2BusinessName      - (i)業務名
'             pvc2PlantCd           - (i)工場コード
'             ■プログラム固有
'             pnumFlag              - (i)処理区分
'             pvc2OdrNO             - (i)受注番号
'             pvc2ProjectCd         - (i)案件番号
'             pvc2EstimateNo        - (i)見積番号
'             pvc2DetalNo           - (i)明細番号
'             pnumReturn            - (o)結果ステータス
'
' 機能説明  : 案件積上げバッチ起動画面より起動される。
'             消化実績、落着見込を計算し、結果を、案件予算進捗テーブルに登録する。
'             結果ステータス   1:正常終了 正常に積上げ処理完了
'                              2:警告、   マスター等に不備あり
'                              3:異常終了 致命的エラーあり
'
' 備考      : 
' 
' 修正履歴
' 2014.04.15 初版
'
------------------------------------------------------------------------------*/
    pvc2LogMode                 IN  VARCHAR2    -- ＬＯＧモード
   ,pvc2OutputMode              IN  VARCHAR2    -- 出力モード
   ,pvc2OutputPath              IN  VARCHAR2    -- 出力ファイルパス
   ,pvc2OutputName              IN  VARCHAR2    -- 出力ファイル名
   ,pvc2UserId                  IN  VARCHAR2    -- ユーザＩＤ
   ,pvc2BusinessName            IN  VARCHAR2    -- 業務名
   ,pvc2PlantCd                 IN  VARCHAR2    -- 工場コード
   ,pnumFlag                    IN  NUMBER      -- 処理区分
   ,pvc2OdrNO                   IN  VARCHAR2    -- 受注番号
   ,pvc2ProjectCd               IN  VARCHAR2    -- 案件番号
   ,pvc2EstimateNo              IN  NUMBER      -- 見積番号
   ,pvc2DetalNo                 IN  NUMBER      -- 明細番号
   ,pnumReturn                  OUT NUMBER      -- 結果ステータス（1:正常終了、2:警告、3:異常終了）
) IS

-- カーソルの宣言
    -- 案件受注紐付
    CURSOR curT_PJ_ODR_ALC(
                  cvc2ProjectCd      VARCHAR2   -- 案件番号
                 ,cvc2EstimateNo     NUMBER     -- 見積番号
                 ,cvc2DetalNo        NUMBER     -- 明細番号
    )
    IS
        SELECT /*+ RULE */
               PROJECT_CD                    -- 案件番号
              ,ESTIMATE_NO                   -- 見積番号
              ,DETAL_NO                      -- 明細番号
              ,ODR_NO                        -- 受注番号
              ,ESTIMATE_TYPE                 -- 手配品目種
        FROM   T_PJ_ODR_ALC
        WHERE  PROJECT_CD     = cvc2ProjectCd
        AND    ESTIMATE_NO    = cvc2EstimateNo
        AND    DETAL_NO       = cvc2DetalNo;

    -- ROWTYPE の宣言
    recT_PJ_ODR_ALC          curT_PJ_ODR_ALC%ROWTYPE;
    
    -- 見積明細
    CURSOR curT_ESTIMATE_DETAL(
                  cvc2ProjectCd      VARCHAR2   -- 案件番号
                 ,cvc2EstimateNo     NUMBER     -- 見積番号
                 ,cvc2DetalNo        NUMBER     -- 明細番号
    )
    IS
        SELECT /*+ RULE */
               ES_COST_MATERIAL     -- 見積予算  材料費
              ,ES_COST_PROCESS      -- 見積予算  加工費
              ,ES_COST_OUTSOUCE     -- 見積予算  外注費
              ,ES_COST_ETC          -- 見積予算  その他経費
              ,ES_COST_SERVICE      -- 見積予算  役務費
        FROM   T_ESTIMATE_DETAL
        WHERE  PROJECT_CD     = cvc2ProjectCd
        AND    ESTIMATE_NO    = cvc2EstimateNo
        AND    DETAL_NO       = cvc2DetalNo;

    -- ROWTYPE の宣言
    recT_ESTIMATE_DETAL          curT_ESTIMATE_DETAL%ROWTYPE;
    
    -- 受注明細
    CURSOR curT_ODR(
                  cvc2OdrNo          VARCHAR2    -- 受注番号
    )
    IS
        SELECT /*+ RULE */
               ODR_CTL_NO                    -- 受注管理番号
              ,ODR_ACPT_DATE                 -- 受注日
              ,ODR_QTY                       -- 受注数
              ,JOB_ODR_SET_FLG               -- 製番設定フラグ
        FROM   T_ODR
        WHERE  ODR_NO       = cvc2OdrNo;     -- 受注番号

    -- ROWTYPE の宣言
    recT_ODR          curT_ODR%ROWTYPE;

    -- 受注管理+品目
    CURSOR curT_ODR_CTL(
                  cvc2ODR_CTL_NO     VARCHAR2      -- 受注管理番号
    )
    IS
        SELECT /*+ RULE */
               OC.ITEM_CD                         -- 品目番号
              ,IT.MRP_ODR_TYP                     -- 品目手配区分
              ,IT.OUTSIDE_TYP                     -- 品目内外作区分
              ,IT.PRODUCT_TYP                     -- 製品区分
              ,IT.UNIT_QTY_TYP                    -- 在庫数単位区分
              ,IT.ITEM_SPOIL                      -- 品目仕損率
        FROM   T_ODR_CTL  OC,
               M_ITEM     IT
        WHERE  OC.ODR_CTL_NO   = cvc2ODR_CTL_NO   -- 受注管理番号
        AND    IT.ITEM_CD      = OC.ITEM_CD;      -- 品目番号

    -- ROWTYPE の宣言
    recT_ODR_CTL       curT_ODR_CTL%ROWTYPE;
    
    -- 製番受注紐付
    CURSOR curT_JOB_ODR_ODR_ALC(
                  cvc2ODR_NO         VARCHAR2     -- 受注番号
                 ,cvc2COMPANY_CD     VARCHAR2     -- 会社コード 
    )
    IS
        SELECT /*+ RULE */
               JOB_ODR_CD                      -- 製番
              ,JOB_ODR_DETAIL_NO               -- 製番枝番
              ,JOB_ODR_CANCEL_NO               -- 製番取消発生番号
              ,ODR_NO                          -- 受注番号
        FROM   T_JOB_ODR_ODR_ALC
        WHERE  ODR_NO     = cvc2ODR_NO         -- 受注番号
        AND    COMPANY_CD = cvc2COMPANY_CD;    -- 会社コード

    -- ROWTYPE の宣言
    recT_JOB_ODR_ODR_ALC       curT_JOB_ODR_ODR_ALC%ROWTYPE;

    -- 製番計画
    CURSOR curT_JOB_ODR(
                  cvc2JOB_ODR_CD         VARCHAR2            -- 製番
                 ,cnumJOB_ODR_DETAIL_NO  NUMBER              -- 製番枝番
                 ,cnumJOB_ODR_CANCEL_NO  NUMBER              -- 製番取消発生番号
    )
    IS
        SELECT /*+ RULE */
               JOB_ODR_CD                                     -- 製番
              ,JOB_ODR_DETAIL_NO                              -- 製番枝番
              ,JOB_ODR_CANCEL_NO                              -- 製番取消発生番号
              ,JOB_ODR_STS_TYP                                -- 製番状態区分
              ,PLANT_CD                                       -- 工場コード
              ,ITEM_CD                                        -- 品目番号
              ,JOB_ODR_QTY                                    -- 製番数
        FROM   T_JOB_ODR
        WHERE  JOB_ODR_CD         = cvc2JOB_ODR_CD            -- 製番
        AND    JOB_ODR_DETAIL_NO  = cnumJOB_ODR_DETAIL_NO     -- 製番枝番
        AND    JOB_ODR_CANCEL_NO  = cnumJOB_ODR_CANCEL_NO;    -- 製番取消発生番号

    -- ROWTYPE の宣言
    recT_JOB_ODR       curT_JOB_ODR%ROWTYPE;

    -- 非在庫受注
    CURSOR curT_ODR_UNSTOCK(
                      cvc2ODR_NO     VARCHAR2    -- 受注番号
    )
    IS
        SELECT /*+ RULE */
               US.ITEM_CD                       -- 品目番号
              ,US.ODR_ACPT_DATE                 -- 受注日
              ,US.ODR_QTY                       -- 受注数
              ,US.ODR_CMPLT_FLG                 -- 受注完了フラグ
              ,IT.MRP_ODR_TYP                   -- 品目手配区分
              ,IT.OUTSIDE_TYP                   -- 品目内外作区分
              ,IT.PRODUCT_TYP                   -- 製品区分
              ,IT.UNIT_QTY_TYP                  -- 在庫数単位区分
              ,IT.ITEM_SPOIL                    -- 品目仕損率
        FROM   T_ODR_UNSTOCK US,
               M_ITEM        IT
        WHERE  US.ODR_NO       = cvc2ODR_NO      -- 受注番号
        AND    IT.ITEM_CD(+)   = US.ITEM_CD;     -- 品目番号

    -- ROWTYPE の宣言
    recT_ODR_UNSTOCK        curT_ODR_UNSTOCK%ROWTYPE;


    /* 見積に紐付く品目が製番品 */
    -- 所要量(製番指定) 
    CURSOR curT_OD(
               cvc2JOB_ODR_CD           IN VARCHAR2     -- 製番 
             , cvc2JOB_ODR_DETAIL_NO    IN NUMBER       -- 製番枝番
             , cvc2JOB_ODR_CANCEL_NO    IN NUMBER       -- 製番取消発生番号
    )
    IS
        SELECT /*+ RULE */
               OD.OD_NO                         -- オーダデマンド番号
              ,OD.PLANT_CD                      -- 工場コード
              ,OD.ITEM_CD                       -- 品目番号
              ,OD.PS_EDITION                    -- 所要量品目構成版数
              ,OD.PATTERN_CD                    -- パターンコード
              ,OD.JOB_ODR_CD                    -- 製番
              ,OD.JOB_ODR_DETAIL_NO             -- 製番枝番
              ,OD.JOB_ODR_CANCEL_NO             -- 製番取消発生番号
              ,OD.ODR_STS_TYP                   -- オーダ状態区分
              ,OD.DM_STS_TYP                    -- デマンド状態区分
              ,OD.OD_TYP                        -- オーダデマンド区分
              ,OD.DUE_DATE                      -- 要求納期
              ,OD.ODR_START_DATE                -- 手配着手日
              ,OD.PRD_DUE_DATE                  -- 製造納期
              ,OD.PRD_START_DATE                -- 製造着手日
              ,OD.DM_QTY                        -- デマンド数
              ,OD.ODR_QTY                       -- オーダ数
              ,OD.MRP_ODR_TYP                   -- 品目手配区分
              ,OD.OUTSIDE_TYP                   -- 所要量内外作区分
              ,OD.ISSUE_TYP                     -- 所要量出庫区分
              ,OD.PS_UNIT_QTY                   -- 製品構成単位数
              ,OD.PS_UNIT_DENOMINATOR           -- 製品構成単位数分母
              ,OD.PS_UNIT_NUMERATOR             -- 製品構成単位数分子
              ,OD.TOTAL_RCV_QTY                 -- 入庫累計数
              ,OD.RCV_CMPLT_DATE                -- 入庫完了日
              ,OD.TOTAL_ISSUE_INST_QTY          -- 出庫指示累計数
              ,OD.TOTAL_ISSUE_QTY               -- 出庫累計数
              ,OD.ISSUE_CMPLT_DATE              -- 出庫完了日
              ,OD.OD_GNR_TYP                    -- 所要量発生処理区分
              ,OD.OD_LEVEL_NO                   -- 所要量レベル番号
              ,OD.PARENT_OD_NO                  -- 親オーダデマンド番号
              ,OD.ITEM_SPOIL                    -- 所要量品目仕損率
              ,OD.PS_SPOIL                      -- 所要量構成仕損率
              ,OD.CONS_TYP                      -- 構成支給区分
              ,OD.MRP_TYP                       -- 所要量処理区分
              ,OD.ODR_RELEASE_FLG               -- オーダ発効済フラグ
              ,IT.PRODUCT_TYP                   -- 製品区分
              ,IT.UNIT_QTY_TYP                  -- 在庫数単位区分
              ,IT.SPL_ITEM_TYP                  -- 受給品区分
              ,IT.ITEM_SPOIL  AS ITEM_SPOIL2    -- 品目仕損率
        FROM   T_OD    OD
              ,M_ITEM  IT
        WHERE  OD.JOB_ODR_CD           =  cvc2JOB_ODR_CD          -- 製番
        AND    OD.JOB_ODR_DETAIL_NO    =  cvc2JOB_ODR_DETAIL_NO   -- 製番枝番
        AND    OD.JOB_ODR_CANCEL_NO    =  cvc2JOB_ODR_CANCEL_NO   -- 製番取消発生番号
        AND    IT.ITEM_CD              =  OD.ITEM_CD
        ORDER  BY OD.OD_LEVEL_NO ASC ,OD.ITEM_CD ASC
        ;
    -- ROWTYPE の宣言
    recT_OD        curT_OD%ROWTYPE;

    -- 保管区入出庫
    CURSOR curT_RCV_ISSUE(
                  cvc2PLANT_CD            VARCHAR2     -- 工場コード
                 ,cvc2JOB_ODR_CD          VARCHAR2     -- 製番 
                 ,cnumJOB_ODR_DETAIL_NO   NUMBER       -- 製番枝番
    )
    IS
        SELECT /*+ RULE */
              RI.ITEM_CD                      -- 品目番号
             ,RI.RCV_ISSUE_DATE               -- 入出庫日
             ,RI.RCV_ISSUE_QTY                -- 入出庫数
             ,RI.RCV_ISSUE_GNR_TYP            -- 入出庫発生区分
             ,IT.MRP_ODR_TYP                  -- 品目手配区分
             ,IT.OUTSIDE_TYP                  -- 品目内外作区分
             ,IT.PRODUCT_TYP                  -- 製品区分
             ,IT.UNIT_QTY_TYP                 -- 在庫数単位区分
             ,IT.ITEM_SPOIL                   -- 品目仕損率
             ,IT.SPL_ITEM_TYP                 -- 無償受給品フラグ
        FROM  T_RCV_ISSUE  RI
             ,M_ITEM       IT
        WHERE RI.PLANT_CD              = cvc2PLANT_CD            -- 工場コード
        AND   RI.JOB_ODR_CD            = cvc2JOB_ODR_CD          -- 製番
        AND   RI.JOB_ODR_DETAIL_NO     = cnumJOB_ODR_DETAIL_NO   -- 製番枝番
        AND   RI.RCV_ISSUE_GNR_TYP     = 24                      -- 入出庫発生区分  ２４:振替出庫
        AND   IT.ITEM_CD               = RI.ITEM_CD;             -- 品目番号
    -- ROWTYPE の宣言
    recT_RCV_ISSUE          curT_RCV_ISSUE%ROWTYPE;

    /* l・在庫引当がされている所要量の展開情報を登録する */
    -- 案件予算明細
    CURSOR curT_PJ_BUDGET_DETAIL(
               cvc2PJ_BUDGET_DETAIL_NO  IN VARCHAR2     -- 案件予算積上明細番号
    )
    IS
        SELECT /*+ RULE */
               PJ_BUDGET_DETAIL_NO           -- 案件予算積上明細番号
              ,SEQNO                         -- SEQNO
              ,OD_NO                         -- オーダデマンド番号
              ,PROJECT_CD                    -- 案件番号
              ,ESTIMATE_NO                   -- 見積番号
              ,DETAL_NO                      -- 明細番号
              ,ODR_NO                        -- 受注番号
              ,ESTIMATE_TYPE                 -- 手配品目種
              ,ODR_ACPT_DATE                 -- 受注日
              ,PLANT_CD                      -- 工場コード
              ,JOB_ODR_CD                    -- 製番
              ,JOB_ODR_DETAIL_NO             -- 製番枝番
              ,JOB_ODR_CANCEL_NO             -- 製番取消発生番号
              ,ROOT_ITEM_CD                  -- 最上位品目番号
              ,PARENT_ITEM_CD                -- 親品目番号
              ,ITEM_CD                       -- 品目番号
              ,OD_TYP                        -- オーダデマンド区分
              ,DUE_DATE                      -- 要求納期
              ,ODR_START_DATE                -- 手配着手日
              ,PRD_DUE_DATE                  -- 製造納期
              ,PRD_START_DATE                -- 製造着手日
              ,MRP_ODR_TYP                   -- 品目手配区分
              ,OUTSIDE_TYP                   -- 所要量内外作区分
              ,PRODUCT_TYP                   -- 製品区分
              ,UNIT_QTY_TYP                  -- 在庫数単位区分
              ,PS_UNIT_QTY                   -- 製品構成単位数
              ,PS_UNIT_DENOMINATOR           -- 製品構成単位数分母
              ,PS_UNIT_NUMERATOR             -- 製品構成単位数分子
              ,OD_LEVEL_NO                   -- 所要量レベル番号
              ,PARENT_SEQNO                  -- 親SEQNO
              ,ITEM_SPOIL                    -- 所要量品目仕損率
              ,PS_SPOIL                      -- 所要量構成仕損率
              ,CONS_TYP                      -- 構成支給区分
              ,NECESSARY_QTY                 -- 必要所要量
              ,PS_INPUT_RATIO                -- 構成仕損増分係数
              ,ITEM_INPUT_RATIO              -- 品目仕損増分係数
              ,DMY_ITEM_FLG                  -- 擬似品目フラグ
              ,VOLUNT_SPL_FLG                -- 無償受給品フラグ
              ,COST_UP_TYP                   -- 原価積上区分
              ,ONEROUS_CONS_FLG              -- 有償支給品フラグ
              ,BUDGET_STACK_TYP              -- 予算積上げ区分
        FROM   T_PJ_BUDGET_DETAIL
        WHERE  PJ_BUDGET_DETAIL_NO     =  cvc2PJ_BUDGET_DETAIL_NO   -- 新規の“案件予算積上明細番号”
        AND    ALC_STOCK_FLG           =  1                         -- 引当在庫有無フラグ      1：引当あり
        AND    ALC_STOCK_ODR_FLG       =  0                         -- 在庫引当所要量展開区分  0：未展開
        ;
    -- ROWTYPE の宣言
    recT_PJ_BUDGET_DETAIL              curT_PJ_BUDGET_DETAIL%ROWTYPE;
    
    /* 2・案件予算積上の実績情報を取得す */
    -- 案件予算明細
    CURSOR curT_PJ_BUDGET_RESULT(
               cvc2PJ_BUDGET_DETAIL_NO  IN VARCHAR2     -- 案件予算積上明細番号
    )
    IS
        SELECT /*+ RULE */
               PJ_BUDGET_DETAIL_NO           -- 案件予算積上明細番号
              ,SEQNO                         -- SEQNO
              ,OD_NO                         -- オーダデマンド番号
              ,PROJECT_CD                    -- 案件番号
              ,ESTIMATE_NO                   -- 見積番号
              ,DETAL_NO                      -- 明細番号
              ,ODR_NO                        -- 受注番号
              ,ESTIMATE_TYPE                 -- 手配品目種
              ,ODR_ACPT_DATE                 -- 受注日
              ,PLANT_CD                      -- 工場コード
              ,JOB_ODR_CD                    -- 製番
              ,JOB_ODR_DETAIL_NO             -- 製番枝番
              ,JOB_ODR_CANCEL_NO             -- 製番取消発生番号
              ,ROOT_ITEM_CD                  -- 最上位品目番号
              ,PARENT_ITEM_CD                -- 親品目番号
              ,ITEM_CD                       -- 品目番号
              ,OD_TYP                        -- オーダデマンド区分
              ,DUE_DATE                      -- 要求納期
              ,ODR_START_DATE                -- 手配着手日
              ,PRD_DUE_DATE                  -- 製造納期
              ,PRD_START_DATE                -- 製造着手日
              ,MRP_ODR_TYP                   -- 品目手配区分
              ,OUTSIDE_TYP                   -- 所要量内外作区分
              ,PRODUCT_TYP                   -- 製品区分
              ,UNIT_QTY_TYP                  -- 在庫数単位区分
              ,PS_UNIT_QTY                   -- 製品構成単位数
              ,PS_UNIT_DENOMINATOR           -- 製品構成単位数分母
              ,PS_UNIT_NUMERATOR             -- 製品構成単位数分子
              ,OD_LEVEL_NO                   -- 所要量レベル番号
              ,PARENT_SEQNO                  -- 親SEQNO
              ,ITEM_SPOIL                    -- 所要量品目仕損率
              ,PS_SPOIL                      -- 所要量構成仕損率
              ,CONS_TYP                      -- 構成支給区分
              ,NECESSARY_QTY                 -- 必要所要量
              ,PS_INPUT_RATIO                -- 構成仕損増分係数
              ,ITEM_INPUT_RATIO              -- 品目仕損増分係数
              ,DMY_ITEM_FLG                  -- 擬似品目フラグ
              ,VOLUNT_SPL_FLG                -- 無償受給品フラグ
              ,COST_UP_TYP                   -- 原価積上区分
              ,ONEROUS_CONS_FLG              -- 有償支給品フラグ
              ,BUDGET_STACK_TYP              -- 予算積上げ区分
              ,ODR_RELEASE_FLG               -- オーダ発効済フラグ
              ,ALC_STOCK_FLG                 -- 引当在庫有無フラグ
              ,ORG_OD_NO                     -- 元オーダデマンド番号
              ,RCV_ISSUE_GNR_TYP             -- 入出庫発生区分
              ,ALC_STOCK_TYP                 -- 引当在庫区分
        FROM   T_PJ_BUDGET_DETAIL
        WHERE  PJ_BUDGET_DETAIL_NO     =  cvc2PJ_BUDGET_DETAIL_NO   -- 案件予算積上明細番号
        ORDER  BY OD_LEVEL_NO,OD_NO
        ;
    -- ROWTYPE の宣言
    recT_PJ_BUDGET_RESULT              curT_PJ_BUDGET_RESULT%ROWTYPE;
    
    -- 製番手配
    CURSOR curT_JOB_ODR_ALC(
                  cvc2OD_NO     VARCHAR2          -- オーダデマンド番号
    )
    IS
        SELECT /*+ RULE */
               OD_NO                              -- オーダデマンド番号
              ,ALC_STOCK_TYP                      -- 引当在庫在庫区分
              ,JOB_ODR_CD                         -- 製番
              ,JOB_ODR_DETAIL_NO                  -- 製番枝番
              ,ALCD_QTY                           -- 引当済数
              ,ITEM_CD                            -- 品目番号
        FROM   T_JOB_ODR_ALC  OC
        WHERE  OC.OD_NO        = cvc2OD_NO        -- オーダデマンド番号
        ORDER  BY  JOB_ODR_ALC_CD  
        ;
    -- ROWTYPE の宣言
    recT_JOB_ODR_ALC       curT_JOB_ODR_ALC%ROWTYPE;
    
    --【品目別在庫】
    CURSOR curT_ITEM_COST(
                  cvc2YEAR                VARCHAR2     -- 年度
                 ,cvc2PLANT_CD            VARCHAR2     -- 工場コード
                 ,cvc2ITEM_CD             VARCHAR2     -- 品目番号 
    ) IS
    SELECT /*+ RULE */
            TOTAL_MATR_COST               -- 積上材料費
           ,TOTAL_SBCNT_MATR_COST         -- 積上材料費(外注)
           ,TOTAL_PROC_COST_SUM_ALL       -- 積上加工費
    FROM   T_ITEM_COST  TI
    WHERE  YEAR             <=  cvc2YEAR
    AND    COST_TYP          =  1       
    AND    PLANT_CD          =  cvc2PLANT_CD
    AND    ITEM_CD           =  cvc2ITEM_CD
    ORDER BY YEAR DESC,HALF_TERM_TYP DESC;
    -- ROWTYPE の宣言
    recT_ITEM_COST       curT_ITEM_COST%ROWTYPE;

    --【作業系列】
    CURSOR curM_PROC_GRP(
                  cvc2PLANT_CD            VARCHAR2     -- 工場コード
                 ,cvc2ITEM_CD             VARCHAR2     -- 品目番号 
    ) IS
    SELECT /*+ RULE */
            PLANT_CD                     --工場コード
           ,ITEM_CD                      --品目番号
           ,PROC_CD                      --品目別作業コード
           ,PROC_NO                      --作業系列番号
           ,WS_CD                        --作業区コード
           ,COMPANY_CD                   --会社コード
           ,VEND_CD                      --代表取引先コード
           ,STANDARD_COST                --標準工数
           ,OUTSIDE_TYP                  --内外作区分
    FROM    M_PROC_GRP                    --作業系列
    WHERE   PLANT_CD    = cvc2PLANT_CD    --工場コード
    AND     ITEM_CD     = cvc2ITEM_CD     --品目番号
    ORDER BY PROC_NO;
    -- ROWTYPE の宣言
    recM_PROC_GRP       curM_PROC_GRP%ROWTYPE;

    --【品目別仕掛】
    CURSOR curT_WORK_IN_PROC_BY_ITEM(
                  cvcOD_NO                VARCHAR2     -- オーダデマンド番号
    ) IS
    SELECT /*+ RULE */
            WORK_ODR_CD               --作業計画番号
           ,PLANT_CD                  --工場コード
           ,WORK_ODR_DLV_DATE         --作業製造納期
           ,ITEM_CD                   --品目番号
           ,OPR_INST_QTY              --作業指示数
           ,WORK_STS_TYP              --作業系列別作業状態区分
           ,PROC_EXPLOSION_FLG        --作業系列展開済みフラグ
    FROM    T_WORK_IN_PROC_BY_ITEM    --品目別
    WHERE   OD_NO     =   cvcOD_NO    -- オーダデマンド番号
    ;
    -- ROWTYPE の宣言
    recT_WORK_IN_PROC_BY_ITEM         curT_WORK_IN_PROC_BY_ITEM%ROWTYPE;
    
        --【作業系列別仕掛】
    CURSOR curT_WORK_IN_PROC_BY_PROC(
                  cvcWORK_ODR_CD      VARCHAR2     -- 作業計画番号
    ) IS
    SELECT /*+ RULE */
            WP.WORK_ODR_CD                            --作業指示番号
           ,WP.WORK_IN_PROC_CD                        --仕掛作業コード
           ,WP.ITEM_CD                                --品目番号
           ,WP.OUTSIDE_TYP                            --仕掛内外作区分
           ,WP.OPR_INST_QTY                           --作業指示数
           ,WP.WS_CD                                  --作業区コード
           ,WP.PLANT_CD                               --工場コード
           ,WP.VEND_CD                                --取引先コード
           ,WP.WORK_STS_TYP                           --作業系列別作業状態区分
           ,WP.OPR_INST_START_DATE                    --作業系列別着手日
           ,WP.OPR_INST_CD                            --作業指示番号
           ,MP.STANDARD_COST                          --標準工数
    FROM    T_WORK_IN_PROC_BY_PROC  WP                --作業系列別仕掛
           ,M_PROC_GRP              MP                --作業系列
    WHERE   WP.WORK_ODR_CD     =   cvcWORK_ODR_CD     -- 作業計画番号
    AND     MP.PLANT_CD        =   WP.PLANT_CD
    AND     MP.ITEM_CD         =   WP.ITEM_CD
    AND     MP.PROC_CD         =   WP.WORK_IN_PROC_CD
    ;
    -- ROWTYPE の宣言
    recT_WORK_IN_PROC_BY_PROC         curT_WORK_IN_PROC_BY_PROC%ROWTYPE;
    
    --【発注残】
    CURSOR curT_RLSD_PUCH_ODR(
                  cvcOD_NO                VARCHAR2     -- オーダデマンド番号
    ) IS
    SELECT /*+ RULE */
            PU.PUCH_ODR_CD            --発注番号
           ,PU.VEND_CD                --取引先CD
           ,PU.ITEM_CD                --品目番号
           ,PU.PLANT_CD               --工場コード
           ,PU.PUCH_ODR_DLV_DATE      --発注納期
           ,PU.PUCH_ODR_QTY           --発注数
           ,PU.PUCH_ODR_STS_TYP       --発注状態区分
           ,PU.UNIT_COST              --単価
           ,VC.CUR_CD                 --通貨コード
           ,VC.EXCH_TYP               --為替種別
           ,VC.ROUND_TYP              --発注金額丸め区分
    FROM    T_RLSD_PUCH_ODR PU        --品目別
           ,M_VEND_CTRL     VC
    WHERE   PU.OD_NO         =   cvcOD_NO    -- オーダデマンド番号
    AND     PU.WORK_ODR_CD   IS  Null
    AND     VC.VEND_CD(+)    =   PU.VEND_CD  -- 取引先コード
    ;
    -- ROWTYPE の宣言
    recT_RLSD_PUCH_ODR                 curT_RLSD_PUCH_ODR%ROWTYPE;
    
    --【[製番受注紐付][受注明細][所要量]】
    CURSOR curT_JOB_ODR_PJ(
               cvc2JOB_ODR_CD           IN VARCHAR2     -- 製番 
             , cvc2JOB_ODR_DETAIL_NO    IN NUMBER       -- 製番枝番
             , cvc2JOB_ODR_CANCEL_NO    IN NUMBER       -- 製番取消発生番号
             , cvc2ITEM_CD              IN VARCHAR2     -- 品目番号
    ) IS
    SELECT /*+ RULE */
           JOO.JOB_ODR_CD
          ,JOO.JOB_ODR_DETAIL_NO
          ,JOO.JOB_ODR_CANCEL_NO
          ,JOO.ODR_NO
          ,POA.PROJECT_CD
          ,POA.ESTIMATE_NO
          ,POA.DETAL_NO
          ,ODR.ODR_QTY   AS ODR_ODR_QTY
          ,OD.ODR_QTY    AS OD_ODR_QTY
          ,OD.TOTAL_RCV_QTY
          ,IT.UNIT_QTY_TYP
    FROM   T_JOB_ODR_ODR_ALC  JOO
          ,T_PJ_ODR_ALC       POA
          ,T_ODR              ODR
          ,T_OD               OD
          ,M_ITEM             IT
    WHERE  JOO.JOB_ODR_CD         = cvc2JOB_ODR_CD
    AND    JOO.JOB_ODR_DETAIL_NO  = cvc2JOB_ODR_DETAIL_NO
    AND    JOO.JOB_ODR_CANCEL_NO  = cvc2JOB_ODR_CANCEL_NO
    AND    POA.ODR_NO             = JOO.ODR_NO
    AND    ODR.ODR_NO             = JOO.ODR_NO
    AND    OD.JOB_ODR_CD          = JOO.JOB_ODR_CD
    AND    OD.JOB_ODR_DETAIL_NO   = JOO.JOB_ODR_DETAIL_NO
    AND    OD.JOB_ODR_DETAIL_NO   = JOO.JOB_ODR_CANCEL_NO
    AND    OD.ITEM_CD             = cvc2ITEM_CD
    AND    IT.ITEM_CD             = cvc2ITEM_CD
    ;
    -- ROWTYPE の宣言
    recT_JOB_ODR_PJ                 curT_JOB_ODR_PJ%ROWTYPE;
    
    --【[見積明細]】
    CURSOR curT_ESTIMATE_DETAL_U(
               cvc2JOB_ODR_CD           IN VARCHAR2     -- 製番 
             , cvc2JOB_ODR_DETAIL_NO    IN NUMBER       -- 製番枝番
             , cvc2JOB_ODR_CANCEL_NO    IN NUMBER       -- 製番取消発生番号
             , cdatTOTAL_DATE           IN DATE         -- 集計日時
    ) IS
    SELECT /*+ RULE */
           PCS.PROJECT_CD
          ,PCS.ESTIMATE_NO
          ,PCS.DETAL_NO
          ,PCS.CMP_COST_MATERIAL
          ,PCS.CMP_COST_PROCESS
          ,PCS.CMP_COST_OUTSOUCE
          ,PCS.EXP_COST_MATERIAL
          ,PCS.EXP_COST_PROCESS
          ,PCS.EXP_COST_OUTSOUCE
    FROM   T_JOB_ODR_ODR_ALC  JOO             -- 製番受注
          ,T_PJ_ODR_ALC       POA             -- 案件受注
          ,T_PJ_COST          PCS             -- 案件進捗
    WHERE  JOO.JOB_ODR_CD          = cvc2JOB_ODR_CD
    AND    JOO.JOB_ODR_DETAIL_NO   = cvc2JOB_ODR_DETAIL_NO
    AND    JOO.JOB_ODR_CANCEL_NO   = cvc2JOB_ODR_CANCEL_NO
    AND    POA.ODR_NO              = JOO.ODR_NO
    AND    PCS.PROJECT_CD          = POA.PROJECT_CD
    AND    PCS.ESTIMATE_NO         = POA.ESTIMATE_NO
    AND    PCS.DETAL_NO            = POA.DETAL_NO
    AND    PCS.TOTAL_DATE          = cdatTOTAL_DATE
    ;
    -- ROWTYPE の宣言
    recT_ESTIMATE_DETAL_U          curT_ESTIMATE_DETAL_U%ROWTYPE;
    
    --【[作業実績]】
    CURSOR curT_OPR_RSLT(
               cvc2OPR_INST_CD          IN VARCHAR2     -- 作業指示番号 
    ) IS
    SELECT /*+ RULE */
           DECODE(OPR_TIME_UNIT_TYP,1,(PRE_ARRANGEMENT_TIME + POST_ARRANGEMENT_TIME + OPR_TIME) / 60
                                   ,2,PRE_ARRANGEMENT_TIME    ) AS  PRE_ARRANGEMENT_TIME
          ,DECODE(OPR_TIME_UNIT_TYP,1,0
                                   ,2,POST_ARRANGEMENT_TIME   ) AS  OPR_TIME_UNIT_TYP
          ,DECODE(OPR_TIME_UNIT_TYP,1,0
                                   ,2,OPR_TIME                ) AS  OPR_TIME
          ,WS_CD
    FROM   T_OPR_RSLT                         -- 作業実績
    WHERE  OPR_INST_CD             = cvc2OPR_INST_CD
    ;
    -- ROWTYPE の宣言
    recT_OPR_RSLT                  curT_OPR_RSLT%ROWTYPE;

/* 定数の宣言 */
    MY_SQL_NAME             VARCHAR2(120)  := 'FncPjSubplusStockMake';      --ＰＬ／ＳＱＬ名
    
    
/* 変数の宣言 */
    UTL_FileHandle          UTL_FILE.FILE_TYPE; -- ファイルハンドル
    blnRet                  BOOLEAN;            -- 関数戻り値
    intRet                  INTEGER;            -- 関数戻り値
    vc2ErrorCD              VARCHAR2(28);       -- エラーコード
    numErrorSEQNO           NUMBER(6);          -- エラーSEQNO
    numErrorCnt             NUMBER(6);          -- エラー件数
    vc2Comment              VARCHAR2(1024);     -- メッセージ用コメント作成作業領域
    vc2RunChkComment        VARCHAR2(1024);     -- 実行位置確認用コメント作成作業領域
    vc2TraceComment         VARCHAR2(1024);     -- トレーース出力用コメント作成作業領域（入力パラメータ記録用）
    vc2Remarks              VARCHAR2(400);      -- エラーファイルの備考
    vc2ProcCD               VARCHAR2(100);      -- 作業区コード
    numCountRec             NUMBER(6);          -- 件数チェック用
    numMaxSeqNO             NUMBER(6);          -- SEQNO
    numPsUnitQty            NUMBER(22,8);       -- 数量ワーク
    numTgtCnt               NUMBER := 0;        -- 対象件数
    vc2CompyCd              VARCHAR2(100);      -- 予算積上げ用オーダデマンド番号
    numOd_Level_No          NUMBER(6);          -- 階層レベル
    datDue_Date             DATE;               -- 基準日
    vc2PJBuDgetDetailNo     VARCHAR2(100);      -- 案件予算積上明細番号
    vc2PjOdNo               VARCHAR2(100);      -- オーダデマンド番号
    numPjPayRate            NUMBER(9,4);        -- 予算管理賃率
    numPjRoundTyp           NUMBER(2);          -- 丸め区分
    numResultAmount         NUMBER(18,4);       -- 丸め結果
    vc2PlantCd              VARCHAR2(8);        -- 工場コード
    datTOTAL_DATE           DATE;               -- 集計日時
--  予算実績取得変数
    vc2VEND_CD              VARCHAR2(100);      -- 代表取引先CD
    -- 予算 --
    numPl_COST_MATERIAL     NUMBER(18,4);       -- 材料費
    numPl_COST_PROCESS      NUMBER(18,4);       -- 加工費
    numPl_COST_OUTSOUCE     NUMBER(18,4);       -- 外注費
    numPl_COST_SERVICE      NUMBER(18,4);       -- 役務費
    -- 実績 --
    numRs_COST_MATERIAL     NUMBER(18,4);       -- 材料費
    numRs_COST_PROCESS      NUMBER(18,4);       -- 加工費
    numRs_COST_OUTSOUCE     NUMBER(18,4);       -- 外注費
    numRs_COST_SERVICE      NUMBER(18,4);       -- 役務費

    vc2MSG                      SYS_BUSINESS_MESSAGE.MSG%TYPE;                -- メッセージ
    vc2PARENT_ITEM_CD           T_OD.ITEM_CD%TYPE;                            -- 親品目番号
    numCOST_UP_TYP              M_PS.COST_UP_TYP%TYPE;                        -- 原価積上区分
    numALC_STOCK_FLG            T_PJ_BUDGET_DETAIL.ALC_STOCK_FLG%TYPE;        -- 引当在庫有無フラグ
    vc2NEW_OD_NO                T_PJ_BUDGET_DETAIL.OD_NO%TYPE;                -- 採番オーダデマンド番号
    numODR_STS_TYP              T_PJ_BUDGET_DETAIL.ODR_STS_TYP%TYPE;          -- オーダ状態区分
    numDM_STS_TYP               T_PJ_BUDGET_DETAIL.DM_STS_TYP%TYPE;           -- デマンド状態区分
    numOD_TYP                   T_PJ_BUDGET_DETAIL.OD_TYP%TYPE;               -- オーダデマンド区分
    numDM_QTY                   T_PJ_BUDGET_DETAIL.DM_QTY%TYPE;               -- デマンド数
    vc2WS_CD                    M_WS.WS_CD%TYPE;                              -- 作業区コード
    numWORK_TIME                T_SERVICE.WORK_TIME%TYPE;                     -- 作業時間
    numRATE_PAY                 T_SERVICE.RATE_PAY%TYPE;                      -- 賃率
    numRATE_PAY2                T_SERVICE.RATE_PAY%TYPE;                      -- 賃率（作業実績）
    vc2CLASS_01_NAME            M_WS_CLASS.WS_CLASS_01_NAME%TYPE;             -- 作業分類コード０１名称
    vc2VEND_CD_H                M_SBCNT_UNIT_COST_H.VEND_CD%TYPE;             -- ヘッダ取引先
    numTOTAL_MATR_COST          T_ITEM_COST.TOTAL_MATR_COST%TYPE;             -- 積上材料費
    numTOTAL_SBCNT_MATR_COST    T_ITEM_COST.TOTAL_SBCNT_MATR_COST%TYPE;       -- 積上材料費（外注）
    numTOTAL_PROC_COST_SUM_ALL  T_ITEM_COST.TOTAL_PROC_COST_SUM_ALL%TYPE;     -- 積上加工費合計
    numUNIT_COST                M_PUCH_UNIT_COST.UNIT_COST%TYPE;              -- 購入単価
    numCUR_CD                   M_VEND_CTRL.CUR_CD%TYPE;                      -- 通貨コード
    numEXCH_TYP                 M_VEND_CTRL.EXCH_TYP%TYPE;                    -- 為替種別
    numDECIMAL_FIG              M_CUR.DECIMAL_FIG%TYPE;                       -- 小数桁数
    numROUND_TYP                M_VEND_CTRL.ROUND_TYP%TYPE;                   -- 発注金額丸め区分
    numEXCH_RATE                M_EXCH_RATE.EXCH_RATE%TYPE;                   -- 為替レート
    numACPT_QTY                 T_ACPT_RSLT.ACPT_QTY%TYPE;                    -- 受入数
    numPUCH_ODR_AMOUNT          T_ACPT_RSLT.PUCH_ODR_AMOUNT%TYPE;             -- 受入金額
    numPRE_ARRANGEMENT_TIME     T_OPR_RSLT.PRE_ARRANGEMENT_TIME%TYPE;         -- 作業実績段取時間
    numOPR_TIME_UNIT_TYP        T_OPR_RSLT.OPR_TIME_UNIT_TYP%TYPE;            -- 作業実績後段取時間
    numOPR_TIME                 T_OPR_RSLT.OPR_TIME%TYPE;                     -- 作業実績作業時間
    numPUCH_ODR_CD              T_RLSD_PUCH_ODR.PUCH_ODR_CD%TYPE;             -- 発注番号
    numPUCH_ODR_STS_TYP         T_RLSD_PUCH_ODR.PUCH_ODR_STS_TYP%TYPE;        -- 発注状態区分
    numPUCH_ODR_QTY             T_RLSD_PUCH_ODR.PUCH_ODR_QTY%TYPE;            -- 発注数
    numBUDGET_STACK_TYP         T_PJ_BUDGET_DETAIL.BUDGET_STACK_TYP%TYPE;     -- 予算積上げ区分
    numCOMP_QTY                 T_PJ_COST.COMP_QTY%TYPE;                      -- 完成数
    numCOST_PROGRESS            T_PJ_COST.COST_PROGRESS%TYPE;                 -- 費用進捗
    numCMP_COST_MATERIAL        T_PJ_COST.CMP_COST_MATERIAL%TYPE;             -- 消化実績  材料費
    numCMP_COST_PROCESS         T_PJ_COST.CMP_COST_PROCESS%TYPE;              -- 消化実績  加工費
    numCMP_COST_OUTSOUCE        T_PJ_COST.CMP_COST_OUTSOUCE%TYPE;             -- 消化実績  外注費
    numCMP_COST_SERVICE         T_PJ_COST.CMP_COST_SERVICE%TYPE;              -- 消化実績  役務費
    numEXP_COST_MATERIAL        T_PJ_COST.EXP_COST_MATERIAL%TYPE;             -- 落着見込  材料費
    numEXP_COST_PROCESS         T_PJ_COST.EXP_COST_PROCESS%TYPE;              -- 落着見込  加工費
    numEXP_COST_OUTSOUCE        T_PJ_COST.EXP_COST_OUTSOUCE%TYPE;             -- 落着見込  外注費
    numEXP_COST_SERVICE         T_PJ_COST.EXP_COST_SERVICE%TYPE;              -- 落着見込  役務費
    numPUCH_PRIORITY_REF_NO     M_PUCH_UNIT_COST_H.PUCH_PRIORITY_REF_NO%TYPE; -- 購入優先順位
    
    numPS_UNIT_QTY              T_PJ_BUDGET_DETAIL.PS_UNIT_QTY%TYPE;          -- 製品構成単位数
    numDMY_ITEM_FLG             T_PJ_BUDGET_DETAIL.DMY_ITEM_FLG%TYPE;         -- 擬似品目フラグ
    numVOLUNT_SPL_FLG           T_PJ_BUDGET_DETAIL.VOLUNT_SPL_FLG%TYPE;       -- 無償受給品フラグ
    numPS_INPUT_RATIO           T_PJ_BUDGET_DETAIL.PS_INPUT_RATIO%TYPE;       -- 構成仕損増分係数
    numITEM_INPUT_RATIO         T_PJ_BUDGET_DETAIL.ITEM_INPUT_RATIO%TYPE;     -- 品目仕損増分係数
    numP_OUTSIDE_TYP            T_PJ_BUDGET_DETAIL.OUTSIDE_TYP%TYPE;          -- 上位手配の内外作区分
    numP_BUDGET_STACK_TYP       T_PJ_BUDGET_DETAIL.BUDGET_STACK_TYP%TYPE;     -- 上位手配の予算積上げ区分
    numP_SEQNO                  T_PJ_BUDGET_DETAIL.PARENT_SEQNO%TYPE;         -- 上位手配の親SEQNO
    numP_MRP_ODR_TYP            T_PJ_BUDGET_DETAIL.MRP_ODR_TYP%TYPE;          -- 上位手配の品目手配区分
    numP_VEND_CD                T_PJ_BUDGET_DETAIL.VEND_CD%TYPE;              -- 取引先CD
    numONEROUS_CONS_FLG         T_PJ_BUDGET_DETAIL.ONEROUS_CONS_FLG%TYPE;     -- 有償支給品フラグ
    numPARENT_SEQNO             T_PJ_BUDGET_DETAIL.PARENT_SEQNO%TYPE;         -- 親SEQNO
    numNECESSARY_QTY            T_PJ_BUDGET_DETAIL.NECESSARY_QTY%TYPE;        -- 必要数
    
/*計算用ワーク*/
    numSave                 NUMBER(25);
    intCount                INTEGER(11);
    intCount2               INTEGER(11);

/*エラー用ワーク*/
    vc2TmpMessage           VARCHAR2(1024);       --ＬＯＧメッセージ

-- MESSAGE の宣言
    APS_COM_BATCH_START                 VARCHAR2(28)   := 'KM00040';    -- 案件予算積上処理を開始しました。
    APS_COM_BATCH_END                   VARCHAR2(28)   := 'KM00041';    -- バッチ処理を終了しました
    APS_COM_MY_COMPANY                  VARCHAR2(28)   := 'DA00007';    -- 会社コードの取得に失敗しました。
    APS_COM_SYSTEMPAR_ERR               VARCHAR2(28)   := 'KV03005';    -- システムパラメータの取得に失敗しました。
    APS_COM_ParameterErr                VARCHAR2(28)   := 'ZZ09022';    -- 引数エラー

    APS_COM_MISTAKE_NATIVE_PARAM        VARCHAR2(28)   := 'KM00042';    -- 案件予算積上処理にて致命的エラーが発生しました。
    APS_COM_NOTEXIST_PJ_ODR_ALC         VARCHAR2(28)   := 'KM00052';    -- 案件受注紐付が未存在です。
    APS_COM_T_ESTIMATE_DETAL            VARCHAR2(28)   := 'KM00044';    -- 見積明細が存在しません。
    APS_COM_NOTEXIST_ODR                VARCHAR2(28)   := 'KM00053';    -- 受注明細が未存在です。
    APS_COM_ODR_CTL_NTFD                VARCHAR2(28)   := 'KQ20189';    -- 受注管理に該当データが存在しません。
    APS_COM_JOB_ODR_ALC                 VARCHAR2(28)   := 'KM00054';    -- 受注と製番の紐付処理がされていません。
    APS_COM_JOB_ODR                     VARCHAR2(28)   := 'KM00055';    -- 製番が登録されていません。
    APS_COM_JOB_ODR_PLAN                VARCHAR2(28)   := 'KM00056';    -- 指定された製番が所要量計算がされていません。
    APS_COM_JOB_ODR_SET                 VARCHAR2(28)   := 'KM00057';    -- 指定された製番が所要量計算がされていません。
    APS_COM_JOB_ODR_CALC                VARCHAR2(28)   := 'KM00056';    -- 指定された製番が所要量計算されていません。
    APS_COM_M_PROC_GRP                  VARCHAR2(28)   := 'AD50512';    -- 作業系列情報が存在しません。
    
    -- 例外の宣言
    excFncTraceLog                      EXCEPTION;    -- トレースログ出力エラー
    excParameterErr                     EXCEPTION;    --「引数」エラー
    excParamWarning                     EXCEPTION;    -- 指示元情報積上げ不可チェックエラー
    excMasterErr                        EXCEPTION;    -- 参照マスタ未存在エラー
    excGetNewPjOdNo                     EXCEPTION;    -- 予算積上げ用オーダデマンド番号エラー
    excOTHER_ERR                        EXCEPTION;    -- 予算積上げ用オーダデマンドt登録エラー

    
    -- 処理結果
    STATUS_NORMAL                       NUMBER        := 1;                       -- 正常終了
    STATUS_WARNING                      NUMBER        := 2;                       -- 警告終了
    STATUS_ERROR                        NUMBER        := 3;                       -- 異常終了

    -- LOG の宣言
    LOGMSG_START                        VARCHAR2(20)   := 'Start';      -- ログ用メソッド開始宣言
    LOGMSG_END                          VARCHAR2(12)   := 'End';        -- ログ用メソッド終了宣言
    LOGMSG_ERR                          VARCHAR2(32)   := '異常終了';
    LOGMSG_SYSPARAM                     VARCHAR2(80)   := 'システムパラメータ：';
    LOGMSG_PARAM                        VARCHAR2(64)   := '入力パラメータ：';
    LOGMSG_NEWODRNO                     VARCHAR2(152)  := '予算積上げ用オーダデマンド番号取得失敗';
    LOGMSG_FATALCNT                     VARCHAR2(40)   := '異常件数：';
    LOGMSG_BRACKETS                     VARCHAR2(4)    := '[';
    LOGMSG_BRACKETE                     VARCHAR2(4)    := ']';
    LOGMSG_COMMA                        VARCHAR2(4)    := ',';

/* サブ関数 */
FUNCTION SubFncInsBudgetError(
/*------------------------------------------------------------------------------
'
' 機能      : 案件予算積上げエラー登録
'
' 戻り値    : NUMBER    結果
'
' 引き数    : pvcProcCd           - (i)作業系列コード
'
'
' 機能説明  : 案件予算積上げで発生した内容を[案件予算積上げエラー]に
'             登録する。
'
' 備考      : 
'
------------------------------------------------------------------------------*/
     pvcProcCd                IN  VARCHAR2            -- 作業系列コード
    ) RETURN BOOLEAN
IS

    -- 変数の宣言
    vc2PjBudgetErrNo           T_PJ_BUDGET_ERROR.PJ_BUDGET_ERR_NO%TYPE;      -- 案件予算積上げエラー
    vc2ErrJOB_ODR_CD           T_PJ_BUDGET_DETAIL.JOB_ODR_CD%TYPE;           -- 製番
    vc2ErrJROOT_ITEM_CD        T_PJ_BUDGET_DETAIL.ROOT_ITEM_CD%TYPE;         -- 最上位品目番号
    vc2ErrJPARENT_ITEM_CD      T_PJ_BUDGET_DETAIL.PARENT_ITEM_CD%TYPE;       -- 親品目番号
    vc2ErrJITEM_CD             T_PJ_BUDGET_DETAIL.ITEM_CD%TYPE;              -- 品目番号
    
BEGIN

    -- 結果を返却
    numErrorCnt    :=  numErrorCnt +   1;
    
    -- 案件予算積上用オーダデマンド番号を採番
    blnRet := FNCGETNEWPJBUDGETERRORCD(UTL_FileHandle
                                      ,pvc2LogMode
                                      ,pvc2OutputMode
                                      ,pvc2UserId
                                      ,pvc2BusinessName
                                      ,pvc2PlantCd
                                      ,vc2PjBudgetErrNo);
   
    -- 案件予算積上明細情報を取得する
    IF  numErrorSEQNO    =   0   THEN
        vc2ErrJOB_ODR_CD         :=  Null;              -- 製番
        vc2ErrJROOT_ITEM_CD      :=  Null;              -- 最上位品目番号
        vc2ErrJPARENT_ITEM_CD    :=  Null;              -- 親品目番号
        vc2ErrJITEM_CD           :=  Null;              -- 品目番号
    ELSE
        BEGIN
            SELECT  /*+ RULE */
                    JOB_ODR_CD,ROOT_ITEM_CD,PARENT_ITEM_CD,ITEM_CD
            INTO    vc2ErrJOB_ODR_CD,vc2ErrJROOT_ITEM_CD,vc2ErrJPARENT_ITEM_CD,vc2ErrJITEM_CD
            FROM    T_PJ_BUDGET_DETAIL 
            WHERE   PJ_BUDGET_DETAIL_NO  =  vc2PJBuDgetDetailNo
            AND     SEQNO                =  numErrorSEQNO
            ;
        EXCEPTION
            WHEN NO_DATA_FOUND THEN
                vc2ErrJOB_ODR_CD         :=  Null;              -- 製番
                vc2ErrJROOT_ITEM_CD      :=  Null;              -- 最上位品目番号
                vc2ErrJPARENT_ITEM_CD    :=  Null;              -- 親品目番号
                vc2ErrJITEM_CD           :=  Null;              -- 品目番号
            WHEN OTHERS THEN
                vc2Comment := SUBSTR(' 01:SELECT PJ_BUDGET_DETAIL_NO'       ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE;
        END;     
    END IF;

    -- 備考内容編集
    BEGIN
        SELECT  MSG
        INTO    vc2MSG
        FROM    SYS_BUSINESS_MESSAGE 
        WHERE   MSG_CD  =  vc2ErrorCD
        ;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            vc2Remarks         :=  Null;              -- 備考
        WHEN OTHERS THEN
            vc2Comment := SUBSTR(' SELECT SYS_BUSINESS_MESSAGE'         ||
                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
            RAISE;
    END;   
    vc2Remarks  := vc2MSG||' '||vc2Remarks;

    BEGIN
        INSERT INTO T_PJ_BUDGET_ERROR(
                PJ_BUDGET_ERR_NO     -- 1  案件予算積上げエラー番号
               ,PROJECT_CD           -- 2  案件番号
               ,ESTIMATE_NO          -- 3  見積番号
               ,DETAL_NO             -- 4  明細番号
               ,ODR_NO               -- 5  受注番号
               ,PLANT_CD             -- 6  工場コード
               ,JOB_ODR_CD           -- 7  製番
               ,ROOT_ITEM_CD         -- 8  最上位品目番号
               ,PARENT_ITEM_CD       -- 9  親品目番号
               ,ITEM_CD              -- 10 品目番号
               ,PROC_CD              -- 11 作業系列コード
               ,MESSAGE_CD           -- 12 メッセージコード
               ,REMARKS              -- 13 備考
               ,LIST_ISS_FLG         -- 14 リスト出力済フラグ
               ,CREATED_DATE         -- 15 作成日
               ,CREATED_BY           -- 16 作成者
               ,CREATED_PRG_NM       -- 17 作成プログラム名
               ,UPDATED_DATE         -- 18 更新日
               ,UPDATED_BY           -- 19 更新者
               ,UPDATED_PRG_NM       -- 20 更新プログラム名
               ,MODIFY_COUNT         -- 21 更新数
        ) VALUES (
                vc2PjBudgetErrNo      -- 1  案件予算積上げエラー番号
               ,pvc2ProjectCd         -- 2  案件番号
               ,pvc2EstimateNo        -- 3  見積番号
               ,pvc2DetalNo           -- 4  明細番号
               ,pvc2OdrNO             -- 5  受注番号
               ,pvc2PlantCd           -- 6  工場コード
               ,vc2ErrJOB_ODR_CD      -- 7  製番
               ,vc2ErrJROOT_ITEM_CD   -- 8  最上位品目番号
               ,vc2ErrJPARENT_ITEM_CD -- 9  親品目番号
               ,vc2ErrJITEM_CD        -- 10 品目番号
               ,pvcProcCd             -- 11 作業系列コード
               ,vc2ErrorCD            -- 12 メッセージコード
               ,vc2Remarks            -- 13 備考
               ,0                     -- 14 リスト出力済フラグ
               ,SYSDATE               -- 15 作成日
               ,pvc2UserId            -- 16 作成者
               ,pvc2BusinessName      -- 17 作成プログラム名
               ,SYSDATE               -- 18 更新日
               ,pvc2UserId            -- 19 更新者
               ,pvc2BusinessName      -- 20 更新プログラム名
               ,0);                   -- 21 更新数
    EXCEPTION
        WHEN OTHERS THEN
            vc2Comment := SUBSTR(' INSERT T_PJ_BUDGET_ERROR'          ||
                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                 1,256);
            RAISE excOTHER_ERR;
    END;

    -- 終了メッセージの出力
    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,pvc2PlantCd, 
                        MY_SQL_NAME, vc2ErrorCD, vc2Comment);

    vc2Remarks  :=  NULL;            -- エラーファイル備考
    -- 結果を返却
    RETURN TRUE;
END;

--<メイン処理 >-----------------------------------------------------
BEGIN
  DBMS_OUTPUT.ENABLE(1000000);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 開始 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
    vc2RunChkComment := NULL;
    pnumReturn       := STATUS_NORMAL;

    /* LogFile の OPEN */
    blnRet :=  FNCLOGOPEN(pvc2OutputPath, pvc2OutputName,pvc2PlantCd, pvc2OutputMode, UTL_FileHandle);

    IF NOT blnRet THEN
        pnumReturn := STATUS_ERROR;
        RETURN;
    END IF;

    vc2RunChkComment  :=  'PROJECT_CD='||pvc2ProjectCd|| ', ESTIMATE_NO='||pvc2EstimateNo||', DETAL_NO='||pvc2DetalNo;
    /* 業務開始メッセージの出力 */
    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                        pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_START, vc2RunChkComment);

    /* TraceLogの出力(Start)処理を行う */
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, LOGMSG_START);

    /* コミット */
    COMMIT;

    -- カウンタ、変数の初期化
    vc2Comment             :=  NULL;            -- メッセージクリア
    numErrorCnt            :=  0;               -- エラー件数
    numMaxSeqNO            :=  0;               -- SEQNO
    numErrorSEQNO          :=  0;
    vc2Remarks             :=  NULL;            -- エラーファイル備考
    
/*------------------------------------------------------------
'  初期処理
-------------------------------------------------------------*/
vc2RunChkComment := '●●●●通過 00010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment||'----------'||TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

    -- 会社コード
    BEGIN
        SELECT  /*+ RULE */
          COMPANY_CD
        INTO
          vc2CompyCd
        FROM
          SYS_MY_COMPANY
        WHERE
          SYS_MY_COMPANY.CTRL_CD = 'SYSTEM'
        ;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            vc2Comment  := '';
            vc2ErrorCd  := APS_COM_MY_COMPANY;
            RAISE excParameterErr;
        WHEN OTHERS THEN
            vc2Comment := SUBSTR('01:SELECT SYS_MY_COMPANY'       ||
                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
            RAISE;
    END;
    
    -- システムパラメータ「予算管理賃率」を取得する
    BEGIN
        SELECT  /*+ RULE */
            VALUE
        INTO
            numPjPayRate
        FROM 
            SYS_PARAMETER
        WHERE NAME  = 'PJ_PAY_RATE';
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            vc2Comment  := LOGMSG_SYSPARAM || ' 予算管理賃率(PJ_PAY_RATE)';
            vc2ErrorCd  := APS_COM_SYSTEMPAR_ERR;
            RAISE excParameterErr;
        WHEN OTHERS THEN
            vc2Comment := SUBSTR('01:SELECT SYS_PARAMETER'       ||
                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
            RAISE;
    END;

    -- システムパラメータ「まるめ区分」を取得する
    BEGIN
        SELECT  /*+ RULE */
            VALUE
        INTO
            numPjRoundTyp
        FROM 
            SYS_PARAMETER
        WHERE NAME  = 'PJ_ROUND_TYP';
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            vc2Comment  := LOGMSG_SYSPARAM||'予算管理まるめ区分(PJ_ROUND_TYP)';
            vc2ErrorCd := APS_COM_SYSTEMPAR_ERR;
            RAISE excParameterErr;
        WHEN OTHERS THEN
            vc2Comment := SUBSTR('01:SELECT SYS_PARAMETER'       ||
                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
            RAISE;
    END;

    -- 共通の入力パラメータのチェック
    IF  pvc2LogMode IS NULL THEN       --ＬＯＧモードがＮＵＬＬ
        RAISE excParameterErr;
    END IF;
    IF  pvc2OutputMode IS NULL THEN    --出力モードがＮＵＬＬ
        RAISE excParameterErr;
    END IF;
    IF  pvc2OutputPath IS NULL THEN    --出力パスがＮＵＬＬ
        RAISE excParameterErr;
    END IF;
    IF  pvc2OutputName IS NULL THEN    --出力ファイル名がＮＵＬＬ
        RAISE excParameterErr;
    END IF;
    IF  pvc2UserId IS NULL THEN        --ユーザＩＤがＮＵＬＬ
        RAISE excParameterErr;
    END IF;
    IF  pvc2BusinessName IS NULL THEN  --業務名がＮＵＬＬ
        RAISE excParameterErr;
    END IF;
    IF  pnumFlag IN (0,1) THEN      --処理区分がＮＵＬＬ
        vc2RunChkComment := NULL;
    ELSE
        RAISE excParameterErr;
    END IF;
    IF  pvc2ProjectCd IS NULL THEN    --案件番号がＮＵＬＬ
        RAISE excParameterErr;
    END IF;
    IF  pvc2EstimateNo IS NULL THEN    --見積番号がＮＵＬＬ
        RAISE excParameterErr;
    END IF;
    IF  pvc2DetalNo IS NULL THEN       --明細番号がＮＵＬＬ
        RAISE excParameterErr;
    END IF;
    IF  pvc2OdrNO IS NULL THEN       --受注番号がＮＵＬＬ
        RAISE excParameterErr;
    END IF;

/*------------------------------------------------------------
' 案件製番情報取得処理
-------------------------------------------------------------*/
vc2RunChkComment := '●●●●通過 00020';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment||'----------'||TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

    -- 案件予算積上明細番号を採番
    blnRet := FNCGETNEWPJBUDGETDETAILNO(UTL_FileHandle
                                       ,pvc2LogMode
                                       ,pvc2OutputMode
                                       ,pvc2UserId
                                       ,pvc2BusinessName
                                       ,pvc2PlantCd
                                       ,vc2PJBuDgetDetailNo);
    IF blnRet = FALSE THEN
       RAISE excGetNewPjOdNo;
    END IF;

    -- 案件受注紐付を検索
    BEGIN
        OPEN curT_PJ_ODR_ALC(pvc2ProjectCd,pvc2EstimateNo,pvc2DetalNo);
    EXCEPTION
       WHEN OTHERS THEN
            vc2Comment := SUBSTR('02:SELECT T_PJ_ODR_ALC'       ||
                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
            RAISE;
    END;

    BEGIN
        FETCH curT_PJ_ODR_ALC INTO recT_PJ_ODR_ALC;
    EXCEPTION
        WHEN OTHERS THEN
            vc2Comment := SUBSTR('02:SELECT T_PJ_ODR_ALC'       ||
                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
            RAISE;
    END;

    /* 案件受注紐付に対象データが存在しない場合 */
    IF curT_PJ_ODR_ALC%NOTFOUND THEN
        vc2ErrorCd      :=  APS_COM_NOTEXIST_PJ_ODR_ALC;
        vc2Comment      :=  '';
        vc2TraceComment := '案件受注紐付が存在しません。';
        RAISE excParamWarning;
    END IF;
    -- CLOSE
    CLOSE curT_PJ_ODR_ALC;

    -- 見積明細を検索
    BEGIN
        OPEN curT_ESTIMATE_DETAL(pvc2ProjectCd,pvc2EstimateNo,pvc2DetalNo);
    EXCEPTION
       WHEN OTHERS THEN
            vc2Comment := SUBSTR('02:SELECT T_ESTIMATE_DETAL'           ||
                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
            RAISE;
    END;

    BEGIN
        FETCH curT_ESTIMATE_DETAL INTO recT_ESTIMATE_DETAL;
    EXCEPTION
        WHEN OTHERS THEN
            vc2Comment := SUBSTR('02:SELECT T_ESTIMATE_DETAL'       ||
                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
            RAISE;
    END;

    /* 見積明細に対象データが存在しない場合 */
    IF curT_ESTIMATE_DETAL%NOTFOUND THEN
        vc2ErrorCd      :=  APS_COM_T_ESTIMATE_DETAL;
        vc2Comment      :=  '';
        vc2TraceComment := '見積り明細が存在しません。';
        RAISE excParameterErr;
    END IF;
    -- CLOSE
    CLOSE curT_ESTIMATE_DETAL;
    
    -- 受注情報を取得する
    IF recT_PJ_ODR_ALC.ESTIMATE_TYPE = 1     then 
        -- 1:製品の場合
        
        -- 受注明細を取得する
        BEGIN
            OPEN curT_ODR(pvc2OdrNO);
        EXCEPTION
           WHEN OTHERS THEN
                vc2Comment := SUBSTR('02:SELECT T_ODR'   ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE;
        END;
        
        BEGIN
            FETCH curT_ODR INTO recT_ODR;
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment := SUBSTR('02:SELECT T_ODR'   ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE;
        END;
        
        /* 受注明細に対象データが存在しない場合 */
        IF curT_ODR%NOTFOUND THEN
            vc2ErrorCd      :=  APS_COM_NOTEXIST_ODR;
            vc2Comment      :=  '';
            vc2TraceComment := '受注明細が存在しません。';
            RAISE excParameterErr;
        END IF;
        -- CLOSE
        CLOSE curT_ODR;    

        -- 受注管理,品目を取得する
        BEGIN
            OPEN curT_ODR_CTL(recT_ODR.ODR_CTL_NO);
        EXCEPTION
           WHEN OTHERS THEN
                vc2Comment := SUBSTR('02:SELECT T_ODR_CTL'          ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE;
        END;
        
        BEGIN
            FETCH curT_ODR_CTL INTO recT_ODR_CTL;
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment := SUBSTR('02:SELECT T_ODR_CTL'          ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE;
        END;
        
        /* 受注管理に対象データが存在しない場合 */
        IF curT_ODR_CTL%NOTFOUND THEN
            vc2ErrorCd      :=  APS_COM_ODR_CTL_NTFD;
            vc2Comment      :=  '';
            vc2TraceComment := '受注管理に該当データが存在しません。';
            RAISE excParameterErr;
        END IF;
        -- CLOSE
        CLOSE curT_ODR_CTL;    

        -- 受注に対する品目が製番
        IF  recT_ODR_CTL.MRP_ODR_TYP  IN (1 , 2)  THEN  
            -- 1:製品の場合
            
            -- 受注と製番が紐付されているかのチェック
            IF recT_ODR.JOB_ODR_SET_FLG = 0 THEN 
                vc2ErrorCd      :=  APS_COM_JOB_ODR_ALC;
                vc2Comment      :=  '';
                vc2TraceComment := '受注と製番の紐付処理がされていません。';
                RAISE excParamWarning;
            END IF;
                
            -- 製番受注紐付を取得する
            BEGIN
                OPEN curT_JOB_ODR_ODR_ALC(pvc2OdrNO,vc2CompyCd);
            EXCEPTION
               WHEN OTHERS THEN
                    vc2Comment := SUBSTR('02:T_JOB_ODR_ODR_ALC'         ||
                                         ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                         ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE;
            END;
            
            BEGIN
                FETCH curT_JOB_ODR_ODR_ALC INTO recT_JOB_ODR_ODR_ALC;
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment := SUBSTR('02:T_JOB_ODR_ODR_ALC'         ||
                                         ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                         ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE;
            END;
            
            /* 製番受注紐付に対象データが存在しない場合 */
            IF curT_JOB_ODR_ODR_ALC%NOTFOUND THEN
                vc2ErrorCd      :=  APS_COM_JOB_ODR_ALC;
                vc2Comment      :=  '';
                vc2TraceComment := '受注と製番の紐付処理がされていません。';
                RAISE excParamWarning;
            END IF;
            -- CLOSE
            CLOSE curT_JOB_ODR_ODR_ALC;    

                
            -- 製番計画を取得する
            BEGIN
                OPEN curT_JOB_ODR(recT_JOB_ODR_ODR_ALC.JOB_ODR_CD
                                 ,recT_JOB_ODR_ODR_ALC.JOB_ODR_DETAIL_NO
                                 ,recT_JOB_ODR_ODR_ALC.JOB_ODR_CANCEL_NO);
            EXCEPTION
               WHEN OTHERS THEN
                    vc2Comment := SUBSTR('02:T_T_JOB_ODR'    ||
                                         ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                         ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE;
            END;
            
            BEGIN
                FETCH curT_JOB_ODR INTO recT_JOB_ODR;
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment := SUBSTR('02:T_T_JOB_ODR'    ||
                                         ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                         ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE;
            END;
            
            /* 製番受注紐付に対象データが存在しない場合 */
            IF curT_JOB_ODR%NOTFOUND THEN
                vc2ErrorCd      :=  APS_COM_JOB_ODR;
                vc2Comment      :=  '';
                vc2TraceComment := '製番受注紐が存在しません。';
                RAISE excParamWarning;
            END IF;
            -- CLOSE
            CLOSE curT_JOB_ODR;  

             --所要量計算が行われているかチェック
             IF recT_JOB_ODR.JOB_ODR_STS_TYP IN (1 , 2)    THEN
                vc2ErrorCd      :=  APS_COM_JOB_ODR_PLAN;
                vc2Comment      :=  '';
                vc2TraceComment := '指定された製番が所要量計算がされていません';
                RAISE excParamWarning;
             END IF;
        END IF;
    ELSE
        -- 2:役務の場合
        
        -- 非在庫受注の検索を行う
        BEGIN
            OPEN curT_ODR_UNSTOCK(pvc2OdrNO);
        EXCEPTION
           WHEN OTHERS THEN
                vc2Comment := SUBSTR('02:SELECT T_ODR_UNSTOCK'      ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE;
        END;
        
        BEGIN
            FETCH curT_ODR_UNSTOCK INTO recT_ODR_UNSTOCK;
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment := SUBSTR('02:SELECT T_ODR_UNSTOCK'      ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE;
        END;
        
        /* 非在庫受注が存在しない場合 */
        IF curT_ODR_UNSTOCK%NOTFOUND THEN
            vc2ErrorCd      :=  APS_COM_NOTEXIST_ODR;
            vc2Comment      :=  '';
            vc2TraceComment := '非在庫受注が存在しません。';
            RAISE excParameterErr;
        END IF;
        CLOSE curT_ODR_UNSTOCK;
    END if;

/*------------------------------------------------------------
'  案件予算積上明細番削除
-------------------------------------------------------------*/
vc2RunChkComment := '●●●●通過 00030';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment||'----------'||TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

    -- 処理フラグ＝1:バッチの時、下記条件で[案件予算積上明細] を全件削除する。
    IF pnumFlag = 1  THEN
       -- 案件予算積上明データ削除
       DELETE FROM T_PJ_BUDGET_DETAIL
       WHERE PROJECT_CD = pvc2ProjectCd;
    END IF;
/*------------------------------------------------------------
'  案件予算積上明細作成処理
-------------------------------------------------------------*/
vc2RunChkComment := '●●●●通過 00040';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment||'----------'||TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

    /* --- ①所要量を取得する --- */
    CASE
    /* 見積に紐付く品目がMRP品の時 */
    WHEN (recT_PJ_ODR_ALC.ESTIMATE_TYPE  =   1)  AND (recT_ODR_CTL.MRP_ODR_TYP IN  (4 ,5 ,6 ,7))  THEN
        
        -- SEQNO カウントアップ
        numMaxSeqNO    :=  numMaxSeqNO +   1;
        numErrorSEQNO  :=  numMaxSeqNO;
               
        -- 案件予算積上用オーダデマンド番号を採番
        blnRet := FNCGETNEWPJODNO(UTL_FileHandle
                                 ,pvc2LogMode
                                 ,pvc2OutputMode
                                 ,pvc2UserId
                                 ,pvc2BusinessName
                                 ,pvc2PlantCd
                                 ,vc2PjOdNo);

        -- 出荷計画
        BEGIN
            SELECT /*+ RULE */
                   OD.PLANT_CD
            INTO   vc2PlantCd
            FROM   T_OD  OD
                 ,(SELECT OD_NO FROM T_ANS_DLV_DATE
                   WHERE  ODR_NO = pvc2OdrNO
                          and rownum <= 1   
                   ORDER BY  PART_DLV_SEQ_NO) AN
            WHERE  OD.OD_NO     =  AN.OD_NO;
        EXCEPTION
            WHEN NO_DATA_FOUND THEN
                vc2PlantCd   :=  pvc2PlantCd;
            WHEN OTHERS THEN
                RAISE;
        END;
        
        -- 案件予算積上明細の登録
        BEGIN
            INSERT INTO T_PJ_BUDGET_DETAIL(
                    PJ_BUDGET_DETAIL_NO         --  1 案件予算積上明細番号
                   ,SEQNO                       --  2 SEQNO
                   ,OD_NO                       --  3 オーダデマンド番号
                   ,PROJECT_CD                  --  4 案件番号
                   ,ESTIMATE_NO                 --  5 見積番号
                   ,DETAL_NO                    --  6 明細番号
                   ,ODR_NO                      --  7 受注番号
                   ,ESTIMATE_TYPE               --  8 手配品目種
                   ,ODR_ACPT_DATE               --  9 受注日
                   ,PLANT_CD                    -- 10 工場コード
                   ,JOB_ODR_CD                  -- 11 製番
                   ,JOB_ODR_DETAIL_NO           -- 12 製番枝番
                   ,JOB_ODR_CANCEL_NO           -- 13 製番取消発生番号
                   ,ROOT_ITEM_CD                -- 14 最上位品目番号
                   ,PARENT_ITEM_CD              -- 15 親品目番号
                   ,ITEM_CD                     -- 16 品目番号
                   ,ODR_STS_TYP                 -- 17 オーダ状態区分
                   ,DM_STS_TYP                  -- 18 デマンド状態区分
                   ,OD_TYP                      -- 19 オーダデマンド区分
                   ,DUE_DATE                    -- 20 要求納期
                   ,ODR_START_DATE              -- 21 手配着手日
                   ,PRD_DUE_DATE                -- 22 製造納期
                   ,PRD_START_DATE              -- 23 製造着手日
                   ,DM_QTY                      -- 24 デマンド数
                   ,ODR_QTY                     -- 25 オーダ数
                   ,MRP_ODR_TYP                 -- 26 品目手配区分
                   ,OUTSIDE_TYP                 -- 27 所要量内外作区分
                   ,PRODUCT_TYP                 -- 28 製品区分
                   ,UNIT_QTY_TYP                -- 29 在庫数単位区分
                   ,PS_UNIT_QTY                 -- 30 製品構成単位数
                   ,PS_UNIT_DENOMINATOR         -- 31 製品構成単位数分母
                   ,PS_UNIT_NUMERATOR           -- 32 製品構成単位数分子
                   ,TOTAL_RCV_QTY               -- 33 入庫累計数
                   ,TOTAL_ISSUE_QTY             -- 34 出庫累計数
                   ,OD_LEVEL_NO                 -- 35 所要量レベル番号
                   ,PARENT_SEQNO                -- 36 親SEQNO
                   ,ITEM_SPOIL                  -- 37 所要量品目仕損率
                   ,PS_SPOIL                    -- 38 所要量構成仕損率
                   ,CONS_TYP                    -- 39 構成支給区分
                   ,NECESSARY_QTY               -- 40 必要所要量
                   ,PS_INPUT_RATIO              -- 41 構成仕損増分係数
                   ,ITEM_INPUT_RATIO            -- 42 品目仕損増分係数
                   ,VEND_CD                     -- 43 取引先コード
                   ,ODR_COST_MATERIAL           -- 44 手配残  材料費
                   ,ODR_COST_PROCESS            -- 45 手配残  加工費
                   ,ODR_COST_OUTSOUCE           -- 46 手配残  外注費
                   ,ODR_COST_SERVICE            -- 47 手配残  役務費
                   ,CMP_COST_MATERIAL           -- 48 消化実績  材料費
                   ,CMP_COST_PROCESS            -- 49 消化実績  加工費
                   ,CMP_COST_OUTSOUCE           -- 50 消化実績  外注費
                   ,CMP_COST_SERVICE            -- 51 消化実績  役務費
                   ,EXP_COST_MATERIAL           -- 52 落着見込  材料費
                   ,EXP_COST_PROCESS            -- 53 落着見込  加工費
                   ,EXP_COST_OUTSOUCE           -- 54 落着見込  外注費
                   ,EXP_COST_SERVICE            -- 55 落着見込  役務費
                   ,DMY_ITEM_FLG                -- 56 擬似品目フラグ
                   ,VOLUNT_SPL_FLG              -- 57 無償受給品フラグ
                   ,COST_UP_TYP                 -- 58 原価積上区分
                   ,ONEROUS_CONS_FLG            -- 59 有償支給品フラグ
                   ,BUDGET_STACK_TYP            -- 60 予算積上げ区分
                   ,ODR_RELEASE_FLG             -- 61 オーダ発効済フラグ
                   ,ORG_OD_NO                   -- 62 元オーダデマンド番号
                   ,ORG_JOB_ODR_CD              -- 63 元製番
                   ,ORG_JOB_ODR_DETAIL_NO       -- 64 元製番枝番
                   ,ORG_ODR_QTY                 -- 65 元オーダ数
                   ,RCV_ISSUE_GNR_TYP           -- 66 入出庫発生区分
                   ,ALC_STOCK_FLG               -- 67 引当在庫有無フラグ
                   ,ALC_STOCK_ODR_FLG           -- 68 在庫引当所要量展開区分
                   ,ALC_STOCK_TYP               -- 69 引当在庫区分
                   ,ALC_STOCK_RATE              -- 70 引当在庫区率
                   ,CREATED_DATE                -- 71 作成日
                   ,CREATED_BY                  -- 72 作成者
                   ,CREATED_PRG_NM              -- 73 作成プログラム名
                   ,UPDATED_DATE                -- 74 更新日
                   ,UPDATED_BY                  -- 75 更新者
                   ,UPDATED_PRG_NM              -- 76 更新プログラム名
                   ,MODIFY_COUNT                -- 77 更新数
            ) VALUES (
                    vc2PJBuDgetDetailNo             --  1 案件予算積上明細番号
                   ,numMaxSeqNO                     --  2 SEQNO
                   ,vc2PjOdNo                       --  3 オーダデマンド番号
                   ,pvc2ProjectCd                   --  4 案件番号
                   ,pvc2EstimateNo                  --  5 見積番号
                   ,pvc2DetalNo                     --  6 明細番号
                   ,pvc2OdrNO                       --  7 受注番号
                   ,recT_PJ_ODR_ALC.ESTIMATE_TYPE   --  8 手配品目種
                   ,recT_ODR.ODR_ACPT_DATE          --  9 受注日
                   ,vc2PlantCd                      -- 10 工場コード
                   ,null                            -- 11 製番
                   ,null                            -- 12 製番枝番
                   ,null                            -- 13 製番取消発生番号
                   ,recT_ODR_CTL.ITEM_CD            -- 14 最上位品目番号
                   ,null                            -- 15 親品目番号
                   ,recT_ODR_CTL.ITEM_CD            -- 16 品目番号
                   ,0                               -- 17 オーダ状態区分
                   ,9                               -- 18 デマンド状態区分
                   ,3                               -- 19 オーダデマンド区分
                   ,recT_ODR.ODR_ACPT_DATE          -- 20 要求納期
                   ,null                            -- 21 手配着手日
                   ,recT_ODR.ODR_ACPT_DATE          -- 22 製造納期
                   ,null                            -- 23 製造着手日
                   ,recT_ODR.ODR_QTY                -- 24 デマンド数
                   ,recT_ODR.ODR_QTY                -- 25 オーダ数
                   ,recT_ODR_CTL.MRP_ODR_TYP        -- 26 品目手配区分
                   ,recT_ODR_CTL.OUTSIDE_TYP        -- 27 所要量内外作区分
                   ,recT_ODR_CTL.PRODUCT_TYP        -- 28 製品区分
                   ,recT_ODR_CTL.UNIT_QTY_TYP       -- 29 在庫数単位区分
                   ,0                               -- 30 製品構成単位数
                   ,0                               -- 31 製品構成単位数分母
                   ,0                               -- 32 製品構成単位数分子
                   ,0                               -- 33 入庫累計数
                   ,0                               -- 34 出庫累計数
                   ,0                               -- 35 所要量レベル番号
                   ,null                            -- 36 親SEQNO
                   ,recT_ODR_CTL.ITEM_SPOIL         -- 37 所要量品目仕損率
                   ,0                               -- 38 所要量構成仕損率
                   ,0                               -- 39 構成支給区分
                   ,recT_ODR.ODR_QTY                -- 40 必要所要量
                   ,0                               -- 41 構成仕損増分係数
                   ,0                               -- 42 品目仕損増分係数
                   ,null                            -- 43 取引先コード
                   ,0                               -- 44 手配残  材料費
                   ,0                               -- 45 手配残  加工費
                   ,0                               -- 46 手配残  外注費
                   ,0                               -- 47 手配残  役務費
                   ,0                               -- 48 消化実績  材料費
                   ,0                               -- 49 消化実績  加工費
                   ,0                               -- 50 消化実績  外注費
                   ,0                               -- 51 消化実績  役務費
                   ,0                               -- 52 落着見込  材料費
                   ,0                               -- 53 落着見込  加工費
                   ,0                               -- 54 落着見込  外注費
                   ,0                               -- 55 落着見込  役務費
                   ,0                               -- 56 擬似品目フラグ
                   ,0                               -- 57 無償受給品フラグ
                   ,1                               -- 58 原価積上区分
                   ,0                               -- 59 有償支給品フラグ
                   ,1                               -- 60 予算積上げ区分
                   ,1                               -- 61 オーダ発効済フラグ
                   ,null                            -- 62 元オーダデマンド番号
                   ,null                            -- 63 元製番
                   ,0                               -- 64 元製番枝番
                   ,0                               -- 65 元オーダ数
                   ,null                            -- 66 入出庫発生区分
                   ,0                               -- 67 引当在庫有無フラグ
                   ,0                               -- 68 在庫引当所要量展開区分
                   ,1                               -- 69 引当在庫区分
                   ,1                               -- 70 引当在庫区率
                   ,SYSDATE                         -- 71 作成日
                   ,pvc2UserId                      -- 72 作成者
                   ,pvc2BusinessName                -- 73 作成プログラム名
                   ,SYSDATE                         -- 74 更新日
                   ,pvc2UserId                      -- 75 更新者
                   ,pvc2BusinessName                -- 76 更新プログラム名
                   ,0);                             -- 77 更新数
        EXCEPTION
            WHEN OTHERS THEN
                -- 案件予算積上明細失敗
                    -- 案件予算積上明細失敗
                    vc2Comment := SUBSTR('05:INSERT UT_PURCH_OPER_BUDGET'       ||
                                         ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                         ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                         1, 256);
                    RAISE excOTHER_ERR;
        END;
    
    /* 見積に紐付く品目が製番品の時 */
    WHEN (recT_PJ_ODR_ALC.ESTIMATE_TYPE  =   1)  AND (recT_ODR_CTL.MRP_ODR_TYP IN  (1 ,2))  THEN

        -- 所要量のカーソルOPEN
        BEGIN
           OPEN curT_OD(recT_JOB_ODR.JOB_ODR_CD,recT_JOB_ODR.JOB_ODR_DETAIL_NO,recT_JOB_ODR.JOB_ODR_CANCEL_NO);
        EXCEPTION
           WHEN OTHERS THEN
                vc2Comment := SUBSTR(' 02:OPEN curT_OD'   ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                     1,256);
                RAISE;
         END;
            

    	LOOP
            -- 所要量のカーソルFETCH
            BEGIN
                FETCH curT_OD  INTO recT_OD;
            EXCEPTION
                WHEN OTHERS THEN
                    -- カーソルFETCH失敗
                    vc2Comment  := SUBSTR(' 02:FETCH curT_OD'            ||
                                          ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                          ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                          1,256);
                    RAISE;
            END;
            
            -- 所要量カーソルEND
            EXIT WHEN  curT_OD%NOTFOUND;
            
            -- SEQNO カウントアップ
            numMaxSeqNO    :=  numMaxSeqNO +   1;
            numErrorSEQNO  :=  numMaxSeqNO;

            -- 上位手配情報取得
            IF  recT_OD.PARENT_OD_NO   is Null  THEN
                vc2PARENT_ITEM_CD  :=  Null;
                numCOST_UP_TYP     :=  1;
            ELSE
                -- 上位手配品の所要量を検索
                BEGIN
                    SELECT /*+ RULE */
                           ITEM_CD 
                    INTO   vc2PARENT_ITEM_CD
                    FROM   T_OD
                    WHERE  OD_NO            =  recT_OD.PARENT_OD_NO;   -- 親オーダデマンド番号
                EXCEPTION
                    WHEN NO_DATA_FOUND THEN
                        RAISE excMasterErr;
                    WHEN OTHERS THEN
                        RAISE;
                END;
                
                -- 要求納期の設定
                datDue_Date     :=  recT_OD.PRD_DUE_DATE;
                
                -- 製品構成情報(原価積上げフラグ)取得
                BEGIN
                    SELECT /*+ RULE */
                           COST_UP_TYP 
                    INTO   numCOST_UP_TYP
                    FROM   M_PS
                    WHERE  PARENT_ITEM_CD      =  vc2PARENT_ITEM_CD         -- 親品目番号
                    AND    COMP_ITEM_CD        =  recT_OD.ITEM_CD           -- 品目番号
                    AND    EFF_PHASE_IN_DATE   <= datDue_Date               -- 製品構成有効開始日
                    AND    EFF_PHASE_OUT_DATE  >= datDue_Date;              -- 製品構成有効開始日
                EXCEPTION
                    WHEN NO_DATA_FOUND THEN
                        -- 製品構成がない＝所要量メンテで追加  原価積上げとする。
                        numCOST_UP_TYP   :=   1;
                    WHEN OTHERS THEN
                        RAISE;
                END;
            END IF;
            
            -- 製番手配があるかの検索
            BEGIN
                SELECT /*+ RULE */ 
                       COUNT(*)            INTO numCountRec
                FROM   T_JOB_ODR_ALC
                WHERE  OD_NO               =  recT_OD.OD_NO;
            EXCEPTION
                WHEN OTHERS THEN
                    RAISE;
            END;
            IF  numCountRec  >  0    THEN
                numALC_STOCK_FLG   :=  1;
            ELSE
                numALC_STOCK_FLG   :=  0;
            END IF;

            /*  擬似品目フラグ  */
            IF recT_OD.MRP_ODR_TYP = 8 THEN
                numDMY_ITEM_FLG      := 1;
            ELSE
                numDMY_ITEM_FLG      := 0;
            END IF;
            
            /*  無償受給品フラグ  */
            IF recT_OD.SPL_ITEM_TYP = 2 THEN
                numVOLUNT_SPL_FLG      := 1;
            ELSE
                numVOLUNT_SPL_FLG      := 0;
            END IF;
            
            /*  構成仕損増分係数  */
            numPS_INPUT_RATIO           := CEIL((1+ recT_OD.PS_SPOIL /100) * 10000) / 10000 ;

            /*  品目仕損増分係数  */
            IF recT_OD.MRP_ODR_TYP <> 8 THEN
               numITEM_INPUT_RATIO         := CEIL(((1+ recT_OD.ITEM_SPOIL2 /100)) * 10000) / 10000 ;
            ELSE
               numITEM_INPUT_RATIO         := 1.0;
            END IF;
            
            /*  上位手配品を検索  */
            IF recT_OD.PARENT_OD_NO IS Null THEN
               numPARENT_SEQNO             :=  Null;
            ELSE
                BEGIN
                    SELECT  /*+ RULE */
                            SEQNO
                    INTO    numPARENT_SEQNO
                    FROM    T_PJ_BUDGET_DETAIL 
                    WHERE   PJ_BUDGET_DETAIL_NO  = vc2PJBuDgetDetailNo
                    AND     OD_NO                = recT_OD.PARENT_OD_NO
                    ;
                EXCEPTION
                    WHEN NO_DATA_FOUND THEN
                        numP_BUDGET_STACK_TYP    :=  1;
                    WHEN OTHERS THEN
                        vc2Comment := SUBSTR(' 40:SELECT PJ_BUDGET_DETAIL_NO'       ||
                                             ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                             ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                        RAISE;
                END;
            END IF;
            
            -- 案件予算積上明細の登録
            BEGIN
                INSERT INTO T_PJ_BUDGET_DETAIL(
                        PJ_BUDGET_DETAIL_NO         --  1 案件予算積上明細番号
                       ,SEQNO                       --  2 SEQNO
                       ,OD_NO                       --  3 オーダデマンド番号
                       ,PROJECT_CD                  --  4 案件番号
                       ,ESTIMATE_NO                 --  5 見積番号
                       ,DETAL_NO                    --  6 明細番号
                       ,ODR_NO                      --  7 受注番号
                       ,ESTIMATE_TYPE               --  8 手配品目種
                       ,ODR_ACPT_DATE               --  9 受注日
                       ,PLANT_CD                    -- 10 工場コード
                       ,JOB_ODR_CD                  -- 11 製番
                       ,JOB_ODR_DETAIL_NO           -- 12 製番枝番
                       ,JOB_ODR_CANCEL_NO           -- 13 製番取消発生番号
                       ,ROOT_ITEM_CD                -- 14 最上位品目番号
                       ,PARENT_ITEM_CD              -- 15 親品目番号
                       ,ITEM_CD                     -- 16 品目番号
                       ,ODR_STS_TYP                 -- 17 オーダ状態区分
                       ,DM_STS_TYP                  -- 18 デマンド状態区分
                       ,OD_TYP                      -- 19 オーダデマンド区分
                       ,DUE_DATE                    -- 20 要求納期
                       ,ODR_START_DATE              -- 21 手配着手日
                       ,PRD_DUE_DATE                -- 22 製造納期
                       ,PRD_START_DATE              -- 23 製造着手日
                       ,DM_QTY                      -- 24 デマンド数
                       ,ODR_QTY                     -- 25 オーダ数
                       ,MRP_ODR_TYP                 -- 26 品目手配区分
                       ,OUTSIDE_TYP                 -- 27 所要量内外作区分
                       ,PRODUCT_TYP                 -- 28 製品区分
                       ,UNIT_QTY_TYP                -- 29 在庫数単位区分
                       ,PS_UNIT_QTY                 -- 30 製品構成単位数
                       ,PS_UNIT_DENOMINATOR         -- 31 製品構成単位数分母
                       ,PS_UNIT_NUMERATOR           -- 32 製品構成単位数分子
                       ,TOTAL_RCV_QTY               -- 33 入庫累計数
                       ,TOTAL_ISSUE_QTY             -- 34 出庫累計数
                       ,OD_LEVEL_NO                 -- 35 所要量レベル番号
                       ,PARENT_SEQNO                -- 36 親SEQNO
                       ,ITEM_SPOIL                  -- 37 所要量品目仕損率
                       ,PS_SPOIL                    -- 38 所要量構成仕損率
                       ,CONS_TYP                    -- 39 構成支給区分
                       ,NECESSARY_QTY               -- 40 必要所要量
                       ,PS_INPUT_RATIO              -- 41 構成仕損増分係数
                       ,ITEM_INPUT_RATIO            -- 42 品目仕損増分係数
                       ,VEND_CD                     -- 43 取引先コード
                       ,ODR_COST_MATERIAL           -- 44 手配残  材料費
                       ,ODR_COST_PROCESS            -- 45 手配残  加工費
                       ,ODR_COST_OUTSOUCE           -- 46 手配残  外注費
                       ,ODR_COST_SERVICE            -- 47 手配残  役務費
                       ,CMP_COST_MATERIAL           -- 48 消化実績  材料費
                       ,CMP_COST_PROCESS            -- 49 消化実績  加工費
                       ,CMP_COST_OUTSOUCE           -- 50 消化実績  外注費
                       ,CMP_COST_SERVICE            -- 51 消化実績  役務費
                       ,EXP_COST_MATERIAL           -- 52 落着見込  材料費
                       ,EXP_COST_PROCESS            -- 53 落着見込  加工費
                       ,EXP_COST_OUTSOUCE           -- 54 落着見込  外注費
                       ,EXP_COST_SERVICE            -- 55 落着見込  役務費
                       ,DMY_ITEM_FLG                -- 56 擬似品目フラグ
                       ,VOLUNT_SPL_FLG              -- 57 無償受給品フラグ
                       ,COST_UP_TYP                 -- 58 原価積上区分
                       ,ONEROUS_CONS_FLG            -- 59 有償支給品フラグ
                       ,BUDGET_STACK_TYP            -- 60 予算積上げ区分
                       ,ODR_RELEASE_FLG             -- 61 オーダ発効済フラグ
                       ,ORG_OD_NO                   -- 62 元オーダデマンド番号
                       ,ORG_JOB_ODR_CD              -- 63 元製番
                       ,ORG_JOB_ODR_DETAIL_NO       -- 64 元製番枝番
                       ,ORG_ODR_QTY                 -- 65 元オーダ数
                       ,RCV_ISSUE_GNR_TYP           -- 66 入出庫発生区分
                       ,ALC_STOCK_FLG               -- 67 引当在庫有無フラグ
                       ,ALC_STOCK_ODR_FLG           -- 68 在庫引当所要量展開区分
                       ,ALC_STOCK_TYP               -- 69 引当在庫区分
                       ,ALC_STOCK_RATE              -- 70 引当在庫区率
                       ,CREATED_DATE                -- 71 作成日
                       ,CREATED_BY                  -- 72 作成者
                       ,CREATED_PRG_NM              -- 73 作成プログラム名
                       ,UPDATED_DATE                -- 74 更新日
                       ,UPDATED_BY                  -- 75 更新者
                       ,UPDATED_PRG_NM              -- 76 更新プログラム名
                       ,MODIFY_COUNT                -- 77 更新数
                ) VALUES (
                        vc2PJBuDgetDetailNo                  --  1 案件予算積上明細番号
                       ,numMaxSeqNO                          --  2 SEQNO
                       ,recT_OD.OD_NO                        --  3 オーダデマンド番号
                       ,pvc2ProjectCd                        --  4 案件番号
                       ,pvc2EstimateNo                       --  5 見積番号
                       ,pvc2DetalNo                          --  6 明細番号
                       ,pvc2OdrNO                            --  7 受注番号
                       ,recT_PJ_ODR_ALC.ESTIMATE_TYPE        --  8 手配品目種
                       ,recT_ODR.ODR_ACPT_DATE               --  9 受注日
                       ,recT_JOB_ODR.PLANT_CD                -- 10 工場コード
                       ,recT_JOB_ODR.JOB_ODR_CD              -- 11 製番
                       ,recT_JOB_ODR.JOB_ODR_DETAIL_NO       -- 12 製番枝番
                       ,recT_JOB_ODR.JOB_ODR_CANCEL_NO       -- 13 製番取消発生番号
                       ,recT_JOB_ODR.ITEM_CD                 -- 14 最上位品目番号
                       ,vc2PARENT_ITEM_CD                    -- 15 親品目番号
                       ,recT_OD.ITEM_CD                      -- 16 品目番号
                       ,recT_OD.ODR_STS_TYP                  -- 17 オーダ状態区分
                       ,recT_OD.DM_STS_TYP                   -- 18 デマンド状態区分
                       ,recT_OD.OD_TYP                       -- 19 オーダデマンド区分
                       ,recT_OD.DUE_DATE                     -- 20 要求納期
                       ,recT_OD.ODR_START_DATE               -- 21 手配着手日
                       ,recT_OD.PRD_DUE_DATE                 -- 22 製造納期
                       ,recT_OD.PRD_START_DATE               -- 23 製造着手日
                       ,recT_OD.DM_QTY                       -- 24 デマンド数
                       ,recT_OD.ODR_QTY                      -- 25 オーダ数
                       ,recT_OD.MRP_ODR_TYP                  -- 26 品目手配区分
                       ,recT_OD.OUTSIDE_TYP                  -- 27 所要量内外作区分
                       ,recT_OD.PRODUCT_TYP                  -- 28 製品区分
                       ,recT_OD.UNIT_QTY_TYP                 -- 29 在庫数単位区分
                       ,recT_OD.PS_UNIT_QTY                  -- 30 製品構成単位数
                       ,recT_OD.PS_UNIT_DENOMINATOR          -- 31 製品構成単位数分母
                       ,recT_OD.PS_UNIT_NUMERATOR            -- 32 製品構成単位数分子
                       ,recT_OD.TOTAL_RCV_QTY                -- 33 入庫累計数
                       ,recT_OD.TOTAL_ISSUE_QTY              -- 34 出庫累計数
                       ,recT_OD.OD_LEVEL_NO                  -- 35 所要量レベル番号
                       ,numPARENT_SEQNO                      -- 36 親SEQNO
                       ,recT_OD.ITEM_SPOIL                   -- 37 所要量品目仕損率
                       ,recT_OD.PS_SPOIL                     -- 38 所要量構成仕損率
                       ,recT_OD.CONS_TYP                     -- 39 構成支給区分
                       ,DECODE(recT_OD.OD_TYP,1,recT_OD.ODR_QTY,2,recT_OD.ODR_QTY,3,recT_OD.DM_QTY,4,recT_OD.ODR_QTY)    -- 40 必要所要量
                       ,numPS_INPUT_RATIO                    -- 41 構成仕損増分係数
                       ,numITEM_INPUT_RATIO                  -- 42 品目仕損増分係数
                       ,null                                 -- 43 取引先コード
                       ,0                                    -- 44 手配残  材料費
                       ,0                                    -- 45 手配残  加工費
                       ,0                                    -- 46 手配残  外注費
                       ,0                                    -- 47 手配残  役務費
                       ,0                                    -- 48 消化実績  材料費
                       ,0                                    -- 49 消化実績  加工費
                       ,0                                    -- 50 消化実績  外注費
                       ,0                                    -- 51 消化実績  役務費
                       ,0                                    -- 52 落着見込  材料費
                       ,0                                    -- 53 落着見込  加工費
                       ,0                                    -- 54 落着見込  外注費
                       ,0                                    -- 55 落着見込  役務費
                       ,numDMY_ITEM_FLG                      -- 56 擬似品目フラグ
                       ,numVOLUNT_SPL_FLG                    -- 57 無償受給品フラグ
                       ,numCOST_UP_TYP                       -- 58 原価積上区分
                       ,0                                    -- 59 有償支給品フラグ
                       ,1                                    -- 60 予算積上げ区分
                       ,recT_OD.ODR_RELEASE_FLG              -- 61 オーダ発効済フラグ
                       ,null                                 -- 62 元オーダデマンド番号
                       ,null                                 -- 63 元製番
                       ,0                                    -- 64 元製番枝番
                       ,0                                    -- 65 元オーダ数
                       ,null                                 -- 66 入出庫発生区分
                       ,numALC_STOCK_FLG                     -- 67 引当在庫有無フラグ
                       ,0                                    -- 68 在庫引当所要量展開区分
                       ,0                                    -- 69 引当在庫区分
                       ,1                                    -- 70 引当在庫区率
                       ,SYSDATE                              -- 71 作成日
                       ,pvc2UserId                           -- 72 作成者
                       ,pvc2BusinessName                     -- 73 作成プログラム名
                       ,SYSDATE                              -- 74 更新日
                       ,pvc2UserId                           -- 75 更新者
                       ,pvc2BusinessName                     -- 76 更新プログラム名
                       ,0);                                  -- 77 更新数
            EXCEPTION
                WHEN OTHERS THEN
                    -- 案件予算積上明細失敗
                    vc2Comment := SUBSTR(' 40:INSERT UT_PURCH_OPER_BUDGET'      ||
                                         ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                         ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                         1, 256);
                    RAISE excOTHER_ERR;
            END;
            
        END LOOP;
                
    /* 見積が役務の時 */
    WHEN recT_PJ_ODR_ALC.ESTIMATE_TYPE  =   2     THEN

        -- SEQNO カウントアップ
        numMaxSeqNO    :=  numMaxSeqNO +   1;
        numErrorSEQNO  :=  numMaxSeqNO;
        
        -- 案件予算積上用オーダデマンド番号を採番
        blnRet := FNCGETNEWPJODNO(UTL_FileHandle
                                 ,pvc2LogMode
                                 ,pvc2OutputMode
                                 ,pvc2UserId
                                 ,pvc2BusinessName
                                 ,pvc2PlantCd
                                 ,vc2PjOdNo);
                                 
        -- 案件予算積上明細の登録
        BEGIN
            INSERT INTO T_PJ_BUDGET_DETAIL(
                    PJ_BUDGET_DETAIL_NO         --  1 案件予算積上明細番号
                   ,SEQNO                       --  2 SEQNO
                   ,OD_NO                       --  3 オーダデマンド番号
                   ,PROJECT_CD                  --  4 案件番号
                   ,ESTIMATE_NO                 --  5 見積番号
                   ,DETAL_NO                    --  6 明細番号
                   ,ODR_NO                      --  7 受注番号
                   ,ESTIMATE_TYPE               --  8 手配品目種
                   ,ODR_ACPT_DATE               --  9 受注日
                   ,PLANT_CD                    -- 10 工場コード
                   ,JOB_ODR_CD                  -- 11 製番
                   ,JOB_ODR_DETAIL_NO           -- 12 製番枝番
                   ,JOB_ODR_CANCEL_NO           -- 13 製番取消発生番号
                   ,ROOT_ITEM_CD                -- 14 最上位品目番号
                   ,PARENT_ITEM_CD              -- 15 親品目番号
                   ,ITEM_CD                     -- 16 品目番号
                   ,ODR_STS_TYP                 -- 17 オーダ状態区分
                   ,DM_STS_TYP                  -- 18 デマンド状態区分
                   ,OD_TYP                      -- 19 オーダデマンド区分
                   ,DUE_DATE                    -- 20 要求納期
                   ,ODR_START_DATE              -- 21 手配着手日
                   ,PRD_DUE_DATE                -- 22 製造納期
                   ,PRD_START_DATE              -- 23 製造着手日
                   ,DM_QTY                      -- 24 デマンド数
                   ,ODR_QTY                     -- 25 オーダ数
                   ,MRP_ODR_TYP                 -- 26 品目手配区分
                   ,OUTSIDE_TYP                 -- 27 所要量内外作区分
                   ,PRODUCT_TYP                 -- 28 製品区分
                   ,UNIT_QTY_TYP                -- 29 在庫数単位区分
                   ,PS_UNIT_QTY                 -- 30 製品構成単位数
                   ,PS_UNIT_DENOMINATOR         -- 31 製品構成単位数分母
                   ,PS_UNIT_NUMERATOR           -- 32 製品構成単位数分子
                   ,TOTAL_RCV_QTY               -- 33 入庫累計数
                   ,TOTAL_ISSUE_QTY             -- 34 出庫累計数
                   ,OD_LEVEL_NO                 -- 35 所要量レベル番号
                   ,PARENT_SEQNO                -- 36 親SEQNO
                   ,ITEM_SPOIL                  -- 37 所要量品目仕損率
                   ,PS_SPOIL                    -- 38 所要量構成仕損率
                   ,CONS_TYP                    -- 39 構成支給区分
                   ,NECESSARY_QTY               -- 40 必要所要量
                   ,PS_INPUT_RATIO              -- 41 構成仕損増分係数
                   ,ITEM_INPUT_RATIO            -- 42 品目仕損増分係数
                   ,VEND_CD                     -- 43 取引先コード
                   ,ODR_COST_MATERIAL           -- 44 手配残  材料費
                   ,ODR_COST_PROCESS            -- 45 手配残  加工費
                   ,ODR_COST_OUTSOUCE           -- 46 手配残  外注費
                   ,ODR_COST_SERVICE            -- 47 手配残  役務費
                   ,CMP_COST_MATERIAL           -- 48 消化実績  材料費
                   ,CMP_COST_PROCESS            -- 49 消化実績  加工費
                   ,CMP_COST_OUTSOUCE           -- 50 消化実績  外注費
                   ,CMP_COST_SERVICE            -- 51 消化実績  役務費
                   ,EXP_COST_MATERIAL           -- 52 落着見込  材料費
                   ,EXP_COST_PROCESS            -- 53 落着見込  加工費
                   ,EXP_COST_OUTSOUCE           -- 54 落着見込  外注費
                   ,EXP_COST_SERVICE            -- 55 落着見込  役務費
                   ,DMY_ITEM_FLG                -- 56 擬似品目フラグ
                   ,VOLUNT_SPL_FLG              -- 57 無償受給品フラグ
                   ,COST_UP_TYP                 -- 58 原価積上区分
                   ,ONEROUS_CONS_FLG            -- 59 有償支給品フラグ
                   ,BUDGET_STACK_TYP            -- 60 予算積上げ区分
                   ,ODR_RELEASE_FLG             -- 61 オーダ発効済フラグ
                   ,ORG_OD_NO                   -- 62 元オーダデマンド番号
                   ,ORG_JOB_ODR_CD              -- 63 元製番
                   ,ORG_JOB_ODR_DETAIL_NO       -- 64 元製番枝番
                   ,ORG_ODR_QTY                 -- 65 元オーダ数
                   ,RCV_ISSUE_GNR_TYP           -- 66 入出庫発生区分
                   ,ALC_STOCK_FLG               -- 67 引当在庫有無フラグ
                   ,ALC_STOCK_ODR_FLG           -- 68 在庫引当所要量展開区分
                   ,ALC_STOCK_TYP               -- 69 引当在庫区分
                   ,ALC_STOCK_RATE              -- 70 引当在庫区率
                   ,CREATED_DATE                -- 71 作成日
                   ,CREATED_BY                  -- 72 作成者
                   ,CREATED_PRG_NM              -- 73 作成プログラム名
                   ,UPDATED_DATE                -- 74 更新日
                   ,UPDATED_BY                  -- 75 更新者
                   ,UPDATED_PRG_NM              -- 76 更新プログラム名
                   ,MODIFY_COUNT                -- 77 更新数
            ) VALUES (
                    vc2PJBuDgetDetailNo                   --  1 案件予算積上明細番号
                   ,numMaxSeqNO                           --  2 SEQNO
                   ,vc2PjOdNo                             --  3 オーダデマンド番号
                   ,pvc2ProjectCd                         --  4 案件番号
                   ,pvc2EstimateNo                        --  5 見積番号
                   ,pvc2DetalNo                           --  6 明細番号
                   ,pvc2OdrNO                             --  7 受注番号
                   ,recT_PJ_ODR_ALC.ESTIMATE_TYPE         --  8 手配品目種
                   ,recT_ODR_UNSTOCK.ODR_ACPT_DATE        --  9 受注日
                   ,pvc2PlantCd                           -- 10 工場コード
                   ,null                                  -- 11 製番
                   ,null                                  -- 12 製番枝番
                   ,null                                  -- 13 製番取消発生番号
                   ,null                                  -- 14 最上位品目番号
                   ,null                                  -- 15 親品目番号
                   ,recT_ODR_UNSTOCK.ITEM_CD              -- 16 品目番号
                   ,0                                     -- 17 オーダ状態区分
                   ,0                                     -- 18 デマンド状態区分
                   ,6                                     -- 19 オーダデマンド区分
                   ,recT_ODR_UNSTOCK.ODR_ACPT_DATE        -- 20 要求納期
                   ,recT_ODR_UNSTOCK.ODR_ACPT_DATE        -- 21 手配着手日
                   ,recT_ODR_UNSTOCK.ODR_ACPT_DATE        -- 22 製造納期
                   ,recT_ODR_UNSTOCK.ODR_ACPT_DATE        -- 23 製造着手日
                   ,0                                     -- 24 デマンド数
                   ,0                                     -- 25 オーダ数
                   ,NVL(recT_ODR_UNSTOCK.MRP_ODR_TYP,4)   -- 26 品目手配区分
                   ,NVL(recT_ODR_UNSTOCK.OUTSIDE_TYP,1)   -- 27 所要量内外作区分
                   ,NVL(recT_ODR_UNSTOCK.PRODUCT_TYP,1)   -- 28 製品区分
                   ,NVL(recT_ODR_UNSTOCK.UNIT_QTY_TYP,1)  -- 29 在庫数単位区分
                   ,0                                     -- 30 製品構成単位数
                   ,0                                     -- 31 製品構成単位数分母
                   ,0                                     -- 32 製品構成単位数分子
                   ,0                                     -- 33 入庫累計数
                   ,0                                     -- 34 出庫累計数
                   ,0                                     -- 35 所要量レベル番号
                   ,null                                  -- 36 親SEQNO
                   ,NVL(recT_ODR_UNSTOCK.ITEM_SPOIL,0)    -- 37 所要量品目仕損率
                   ,0                                     -- 38 所要量構成仕損率
                   ,0                                     -- 39 構成支給区分
                   ,recT_ODR_UNSTOCK.ODR_QTY              -- 40 必要所要量
                   ,0                                     -- 41 構成仕損増分係数
                   ,0                                     -- 42 品目仕損増分係数
                   ,null                                  -- 43 取引先コード
                   ,0                                     -- 44 手配残  材料費
                   ,0                                     -- 45 手配残  加工費
                   ,0                                     -- 46 手配残  外注費
                   ,0                                     -- 47 手配残  役務費
                   ,0                                     -- 48 消化実績  材料費
                   ,0                                     -- 49 消化実績  加工費
                   ,0                                     -- 50 消化実績  外注費
                   ,0                                     -- 51 消化実績  役務費
                   ,0                                     -- 52 落着見込  材料費
                   ,0                                     -- 53 落着見込  加工費
                   ,0                                     -- 54 落着見込  外注費
                   ,0                                     -- 55 落着見込  役務費
                   ,0                                     -- 56 擬似品目フラグ
                   ,0                                     -- 57 無償受給品フラグ
                   ,1                                     -- 58 原価積上区分
                   ,0                                     -- 59 有償支給品フラグ
                   ,1                                     -- 60 予算積上げ区分
                   ,1                                     -- 61 オーダ発効済フラグ
                   ,null                                  -- 62 元オーダデマンド番号
                   ,null                                  -- 63 元製番
                   ,0                                     -- 64 元製番枝番
                   ,0                                     -- 65 元オーダ数
                   ,null                                  -- 66 入出庫発生区分
                   ,0                                     -- 67 引当在庫有無フラグ
                   ,0                                     -- 68 在庫引当所要量展開区分
                   ,0                                     -- 69 引当在庫区分
                   ,1                                     -- 70 引当在庫区率
                   ,SYSDATE                               -- 71 作成日
                   ,pvc2UserId                            -- 72 作成者
                   ,pvc2BusinessName                      -- 73 作成プログラム名
                   ,SYSDATE                               -- 74 更新日
                   ,pvc2UserId                            -- 75 更新者
                   ,pvc2BusinessName                      -- 76 更新プログラム名
                   ,0);                                   -- 77 更新数
        EXCEPTION
            WHEN OTHERS THEN
                DBMS_OUTPUT.PUT_LINE('役務 案件予算積上明細作成-ERROR---'||vc2PjOdNo);
                -- 案件予算積上明細失敗
                vc2Comment := SUBSTR(' 40:INSERT T_PJ_BUDGET_DETAIL'       ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                     1, 256);
                RAISE excOTHER_ERR;
        END;
    END CASE;

    /* --- ②製番に対する余剰在庫振替の情報を取得 --- */
    
    /* 見積に紐付く品目が製番品の時 */
    IF  (recT_PJ_ODR_ALC.ESTIMATE_TYPE  =   1)  AND (recT_ODR_CTL.MRP_ODR_TYP IN  (1 ,2))  THEN

        -- 保管区別入出庫のカーソルOPEN
        BEGIN
           OPEN curT_RCV_ISSUE(recT_JOB_ODR.PLANT_CD,recT_JOB_ODR.JOB_ODR_CD,recT_JOB_ODR.JOB_ODR_DETAIL_NO);
        EXCEPTION
           WHEN OTHERS THEN
                vc2Comment := SUBSTR(' 40:OPEN curT_RCV_ISSUE'   ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                     1,256);
                RAISE;
        END;

    	LOOP
            -- 保管区別入出庫のカーソルFETCH
            BEGIN
                FETCH curT_RCV_ISSUE  INTO recT_RCV_ISSUE;
            EXCEPTION
                WHEN OTHERS THEN
                    -- カーソルFETCH失敗
                    vc2Comment  := SUBSTR(' 02:FETCH curT_RCV_ISSUE'     ||
                                          ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                          ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                          1,256);
                    RAISE;
            END;
            -- 保管区別入出庫カーソルEND
            EXIT WHEN  curT_RCV_ISSUE%NOTFOUND;

            -- 案件予算積上用オーダデマンド番号を採番
            blnRet := FNCGETNEWPJODNO(UTL_FileHandle
                                     ,pvc2LogMode
                                     ,pvc2OutputMode
                                     ,pvc2UserId
                                     ,pvc2BusinessName
                                     ,pvc2PlantCd
                                     ,vc2PjOdNo);
            -- SEQNO カウントアップ
            numMaxSeqNO    :=  numMaxSeqNO +   1;
            numErrorSEQNO  :=  numMaxSeqNO;

            /*  擬似品目フラグ  */
            IF recT_RCV_ISSUE.MRP_ODR_TYP = 8 THEN
                numDMY_ITEM_FLG      := 1;
            ELSE
                numDMY_ITEM_FLG      := 0;
            END IF;

            /*  無償受給品フラグ  */
            IF recT_RCV_ISSUE.SPL_ITEM_TYP = 2 THEN
                numVOLUNT_SPL_FLG      := 1;
            ELSE
                numVOLUNT_SPL_FLG      := 0;
            END IF;

            /*  品目仕損増分係数  */
            IF recT_RCV_ISSUE.MRP_ODR_TYP = 8 THEN
               numITEM_INPUT_RATIO         := CEIL(((1+ recT_RCV_ISSUE.ITEM_CD /100)) * 10000) / 10000 ;
            ELSE
               numITEM_INPUT_RATIO         := 1.0;
            END IF;
        
            -- 案件予算積上明細の登録
            BEGIN
                INSERT INTO T_PJ_BUDGET_DETAIL(
                        PJ_BUDGET_DETAIL_NO         --  1 案件予算積上明細番号
                       ,SEQNO                       --  2 SEQNO
                       ,OD_NO                       --  3 オーダデマンド番号
                       ,PROJECT_CD                  --  4 案件番号
                       ,ESTIMATE_NO                 --  5 見積番号
                       ,DETAL_NO                    --  6 明細番号
                       ,ODR_NO                      --  7 受注番号
                       ,ESTIMATE_TYPE               --  8 手配品目種
                       ,ODR_ACPT_DATE               --  9 受注日
                       ,PLANT_CD                    -- 10 工場コード
                       ,JOB_ODR_CD                  -- 11 製番
                       ,JOB_ODR_DETAIL_NO           -- 12 製番枝番
                       ,JOB_ODR_CANCEL_NO           -- 13 製番取消発生番号
                       ,ROOT_ITEM_CD                -- 14 最上位品目番号
                       ,PARENT_ITEM_CD              -- 15 親品目番号
                       ,ITEM_CD                     -- 16 品目番号
                       ,ODR_STS_TYP                 -- 17 オーダ状態区分
                       ,DM_STS_TYP                  -- 18 デマンド状態区分
                       ,OD_TYP                      -- 19 オーダデマンド区分
                       ,DUE_DATE                    -- 20 要求納期
                       ,ODR_START_DATE              -- 21 手配着手日
                       ,PRD_DUE_DATE                -- 22 製造納期
                       ,PRD_START_DATE              -- 23 製造着手日
                       ,DM_QTY                      -- 24 デマンド数
                       ,ODR_QTY                     -- 25 オーダ数
                       ,MRP_ODR_TYP                 -- 26 品目手配区分
                       ,OUTSIDE_TYP                 -- 27 所要量内外作区分
                       ,PRODUCT_TYP                 -- 28 製品区分
                       ,UNIT_QTY_TYP                -- 29 在庫数単位区分
                       ,PS_UNIT_QTY                 -- 30 製品構成単位数
                       ,PS_UNIT_DENOMINATOR         -- 31 製品構成単位数分母
                       ,PS_UNIT_NUMERATOR           -- 32 製品構成単位数分子
                       ,TOTAL_RCV_QTY               -- 33 入庫累計数
                       ,TOTAL_ISSUE_QTY             -- 34 出庫累計数
                       ,OD_LEVEL_NO                 -- 35 所要量レベル番号
                       ,PARENT_SEQNO                -- 36 親SEQNO
                       ,ITEM_SPOIL                  -- 37 所要量品目仕損率
                       ,PS_SPOIL                    -- 38 所要量構成仕損率
                       ,CONS_TYP                    -- 39 構成支給区分
                       ,NECESSARY_QTY               -- 40 必要所要量
                       ,PS_INPUT_RATIO              -- 41 構成仕損増分係数
                       ,ITEM_INPUT_RATIO            -- 42 品目仕損増分係数
                       ,VEND_CD                     -- 43 取引先コード
                       ,ODR_COST_MATERIAL           -- 44 手配残  材料費
                       ,ODR_COST_PROCESS            -- 45 手配残  加工費
                       ,ODR_COST_OUTSOUCE           -- 46 手配残  外注費
                       ,ODR_COST_SERVICE            -- 47 手配残  役務費
                       ,CMP_COST_MATERIAL           -- 48 消化実績  材料費
                       ,CMP_COST_PROCESS            -- 49 消化実績  加工費
                       ,CMP_COST_OUTSOUCE           -- 50 消化実績  外注費
                       ,CMP_COST_SERVICE            -- 51 消化実績  役務費
                       ,EXP_COST_MATERIAL           -- 52 落着見込  材料費
                       ,EXP_COST_PROCESS            -- 53 落着見込  加工費
                       ,EXP_COST_OUTSOUCE           -- 54 落着見込  外注費
                       ,EXP_COST_SERVICE            -- 55 落着見込  役務費
                       ,DMY_ITEM_FLG                -- 56 擬似品目フラグ
                       ,VOLUNT_SPL_FLG              -- 57 無償受給品フラグ
                       ,COST_UP_TYP                 -- 58 原価積上区分
                       ,ONEROUS_CONS_FLG            -- 59 有償支給品フラグ
                       ,BUDGET_STACK_TYP            -- 60 予算積上げ区分
                       ,ODR_RELEASE_FLG             -- 61 オーダ発効済フラグ
                       ,ORG_OD_NO                   -- 62 元オーダデマンド番号
                       ,ORG_JOB_ODR_CD              -- 63 元製番
                       ,ORG_JOB_ODR_DETAIL_NO       -- 64 元製番枝番
                       ,ORG_ODR_QTY                 -- 65 元オーダ数
                       ,RCV_ISSUE_GNR_TYP           -- 66 入出庫発生区分
                       ,ALC_STOCK_FLG               -- 67 引当在庫有無フラグ
                       ,ALC_STOCK_ODR_FLG           -- 68 在庫引当所要量展開区分
                       ,ALC_STOCK_TYP               -- 69 引当在庫区分
                       ,ALC_STOCK_RATE              -- 70 引当在庫区率
                       ,CREATED_DATE                -- 71 作成日
                       ,CREATED_BY                  -- 72 作成者
                       ,CREATED_PRG_NM              -- 73 作成プログラム名
                       ,UPDATED_DATE                -- 74 更新日
                       ,UPDATED_BY                  -- 75 更新者
                       ,UPDATED_PRG_NM              -- 76 更新プログラム名
                       ,MODIFY_COUNT                -- 77 更新数
                ) VALUES (
                        vc2PJBuDgetDetailNo                  --  1 案件予算積上明細番号
                       ,numMaxSeqNO                          --  2 SEQNO
                       ,vc2PjOdNo                            --  3 オーダデマンド番号
                       ,pvc2ProjectCd                        --  4 案件番号
                       ,pvc2EstimateNo                       --  5 見積番号
                       ,pvc2DetalNo                          --  6 明細番号
                       ,pvc2OdrNO                            --  7 受注番号
                       ,recT_PJ_ODR_ALC.ESTIMATE_TYPE        --  8 手配品目種
                       ,recT_ODR.ODR_ACPT_DATE               --  9 受注日
                       ,recT_JOB_ODR.PLANT_CD                -- 10 工場コード
                       ,recT_JOB_ODR.JOB_ODR_CD              -- 11 製番
                       ,recT_JOB_ODR.JOB_ODR_DETAIL_NO       -- 12 製番枝番
                       ,recT_JOB_ODR.JOB_ODR_CANCEL_NO       -- 13 製番取消発生番号
                       ,recT_JOB_ODR.ITEM_CD                 -- 14 最上位品目番号
                       ,null                                 -- 15 親品目番号
                       ,recT_RCV_ISSUE.ITEM_CD               -- 16 品目番号
                       ,0                                    -- 17 オーダ状態区分
                       ,0                                    -- 18 デマンド状態区分
                       ,7                                    -- 19 オーダデマンド区分
                       ,recT_RCV_ISSUE.RCV_ISSUE_DATE        -- 20 要求納期
                       ,recT_RCV_ISSUE.RCV_ISSUE_DATE        -- 21 手配着手日
                       ,recT_RCV_ISSUE.RCV_ISSUE_DATE        -- 22 製造納期
                       ,recT_RCV_ISSUE.RCV_ISSUE_DATE        -- 23 製造着手日
                       ,recT_RCV_ISSUE.RCV_ISSUE_QTY         -- 24 デマンド数
                       ,0                                    -- 25 オーダ数
                       ,recT_RCV_ISSUE.MRP_ODR_TYP           -- 26 品目手配区分
                       ,recT_RCV_ISSUE.OUTSIDE_TYP           -- 27 所要量内外作区分
                       ,recT_RCV_ISSUE.PRODUCT_TYP           -- 28 製品区分
                       ,recT_RCV_ISSUE.UNIT_QTY_TYP          -- 29 在庫数単位区分
                       ,0                                    -- 30 製品構成単位数
                       ,0                                    -- 31 製品構成単位数分母
                       ,0                                    -- 32 製品構成単位数分子
                       ,0                                    -- 33 入庫累計数
                       ,0                                    -- 34 出庫累計数
                       ,0                                    -- 35 所要量レベル番号
                       ,null                                 -- 36 親SEQNO
                       ,recT_RCV_ISSUE.ITEM_SPOIL            -- 37 所要量品目仕損率
                       ,0                                    -- 38 所要量構成仕損率
                       ,0                                    -- 39 構成支給区分
                       ,recT_RCV_ISSUE.RCV_ISSUE_QTY         -- 40 必要所要量
                       ,0                                    -- 41 構成仕損増分係数
                       ,numITEM_INPUT_RATIO                  -- 42 品目仕損増分係数
                       ,null                                 -- 43 取引先コード
                       ,0                                    -- 44 手配残  材料費
                       ,0                                    -- 45 手配残  加工費
                       ,0                                    -- 46 手配残  外注費
                       ,0                                    -- 47 手配残  役務費
                       ,0                                    -- 48 消化実績  材料費
                       ,0                                    -- 49 消化実績  加工費
                       ,0                                    -- 50 消化実績  外注費
                       ,0                                    -- 51 消化実績  役務費
                       ,0                                    -- 52 落着見込  材料費
                       ,0                                    -- 53 落着見込  加工費
                       ,0                                    -- 54 落着見込  外注費
                       ,0                                    -- 55 落着見込  役務費
                       ,numDMY_ITEM_FLG                      -- 56 擬似品目フラグ
                       ,numVOLUNT_SPL_FLG                    -- 57 無償受給品フラグ
                       ,1                                    -- 58 原価積上区分
                       ,0                                    -- 59 有償支給品フラグ
                       ,1                                    -- 60 予算積上げ区分
                       ,recT_OD.ODR_RELEASE_FLG              -- 61 オーダ発効済フラグ
                       ,null                                 -- 62 元オーダデマンド番号
                       ,null                                 -- 63 元製番
                       ,0                                    -- 64 元製番枝番
                       ,0                                    -- 65 元オーダ数
                       ,recT_RCV_ISSUE.RCV_ISSUE_GNR_TYP     -- 66 入出庫発生区分
                       ,1                                    -- 67 引当在庫有無フラグ
                       ,0                                    -- 68 在庫引当所要量展開区分
                       ,0                                    -- 69 引当在庫区分
                       ,1                                    -- 70 引当在庫区率
                       ,SYSDATE                              -- 71 作成日
                       ,pvc2UserId                           -- 72 作成者
                       ,pvc2BusinessName                     -- 73 作成プログラム名
                       ,SYSDATE                              -- 74 更新日
                       ,pvc2UserId                           -- 75 更新者
                       ,pvc2BusinessName                     -- 76 更新プログラム名
                       ,0);                                  -- 77 更新数
            EXCEPTION
                WHEN OTHERS THEN
                    -- 案件予算積上明細失敗
                    vc2Comment := SUBSTR(' 40:INSERT UT_PURCH_OPER_BUDGET'       ||
                                         ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                         ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                         1, 256);
                    RAISE excOTHER_ERR;
            END;
            
        END LOOP;
        -- 保管区別入出庫のカーソルCLOSE
        CLOSE curT_RCV_ISSUE;
    END IF;

    COMMIT;
/*------------------------------------------------------------
'  在庫引当展開処理
-------------------------------------------------------------*/
vc2RunChkComment := '●●●●通過 00050';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment||'----------'||TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

    LOOP
    
        -- 案件予算積上明細カーソルOPEN
        BEGIN
            OPEN curT_PJ_BUDGET_DETAIL(vc2PJBuDgetDetailNo);
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment := SUBSTR(' 05:OPEN curT_PJ_BUDGET_DETAIL'        ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                     1,256);
                RAISE;
        END;

        -- 案件予算積上明細カーソルFETCH
        BEGIN
            FETCH curT_PJ_BUDGET_DETAIL INTO recT_PJ_BUDGET_DETAIL;
        EXCEPTION
            WHEN OTHERS THEN
                -- カーソルFETCH失敗
                vc2Comment  := SUBSTR(' 05:FETCH curT_PJ_BUDGET_DETAIL'      ||
                                      ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                      ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                      1,256);
                RAISE;
        END;
        -- 案件予算積上明細カーソル
        EXIT WHEN  curT_PJ_BUDGET_DETAIL%NOTFOUND;
        
        
        LOOP
            numErrorSEQNO  :=  recT_PJ_BUDGET_DETAIL.SEQNO;
            /* --- l・通常品か計画外のデータか判断する。 --- */
            IF  recT_PJ_BUDGET_DETAIL.OD_TYP    =   7   THEN -- オーダデマンド区分7：入出庫

                /* 案件予算余剰在庫品作成処理 */
                blnRet := FNCPJSUBPLUSSTOCKMAKE(UTL_FileHandle
                                               ,pvc2LogMode
                                               ,pvc2OutputMode
                                               ,pvc2UserId
                                               ,pvc2BusinessName
                                               ,pvc2PlantCd
                                               ,recT_PJ_BUDGET_DETAIL.PJ_BUDGET_DETAIL_NO
                                               ,recT_PJ_BUDGET_DETAIL.SEQNO
                                               ,recT_PJ_BUDGET_DETAIL.NECESSARY_QTY
                                               ,vc2ErrorCD
                                               );
                IF blnRet = FALSE THEN
                   RAISE excGetNewPjOdNo;
                END IF;
            ELSE
                -- [製番引当]カーソルOPEN
                BEGIN
                    OPEN curT_JOB_ODR_ALC(recT_PJ_BUDGET_DETAIL.OD_NO);
                EXCEPTION
                    WHEN OTHERS THEN
                        vc2Comment := SUBSTR(' 05:OPEN curT_JOB_ODR_ALC'    ||
                                             ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                             ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                             1,256);
                        RAISE;
                END;
                
                LOOP
                    -- 製品引当カーソルFETCH
                    BEGIN
                        FETCH curT_JOB_ODR_ALC  INTO recT_JOB_ODR_ALC;
                    EXCEPTION
                        WHEN OTHERS THEN
                            -- カーソルFETCH失敗
                            vc2Comment  := SUBSTR(' 05:FETCH curcT_JOB_ODR_ALC'  ||
                                                  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                                  1,256);
                            RAISE;
                    END;
                   
                    -- 製番引当カーソルEND
                    EXIT WHEN  curT_JOB_ODR_ALC%NOTFOUND;
    
                    IF  recT_JOB_ODR_ALC.ALC_STOCK_TYP     =   1    THEN

                        -- 引当在庫区分”＝1:品目在庫）の時
                        
                        /* 案件予算余剰在庫品作成処理 */
                        blnRet := FncPjSubplusStockMake(UTL_FileHandle
                                                       ,pvc2LogMode
                                                       ,pvc2OutputMode
                                                       ,pvc2UserId
                                                       ,pvc2BusinessName
                                                       ,pvc2PlantCd
                                                       ,recT_PJ_BUDGET_DETAIL.PJ_BUDGET_DETAIL_NO
                                                       ,recT_PJ_BUDGET_DETAIL.SEQNO
                                                       ,recT_JOB_ODR_ALC.ALCD_QTY
                                                       ,vc2ErrorCD
                                                       );
                        IF blnRet = FALSE THEN
                           RAISE excGetNewPjOdNo;
                        END IF;
                    ELSE
                        -- 引当在庫区分”＝2:製番）の時
                        /* 案件予算製番引当品作成処理 */
                        blnRet :=FncPjJobOdrAlcMake(UTL_FileHandle
                                                    ,pvc2LogMode
                                                    ,pvc2OutputMode
                                                    ,pvc2UserId
                                                    ,pvc2BusinessName
                                                    ,pvc2PlantCd
                                                    ,recT_PJ_BUDGET_DETAIL.PJ_BUDGET_DETAIL_NO
                                                    ,recT_PJ_BUDGET_DETAIL.SEQNO
                                                    ,recT_JOB_ODR_ALC.JOB_ODR_CD
                                                    ,recT_JOB_ODR_ALC.JOB_ODR_DETAIL_NO
                                                    ,recT_JOB_ODR_ALC.ALCD_QTY
                                                    ,vc2ErrorCD
                                                    );
                        IF blnRet = FALSE THEN
                           RAISE excGetNewPjOdNo;
                        END IF;
                    END IF;
                END LOOP;
                -- [製番引当]カーソルCLOSE
                CLOSE curT_JOB_ODR_ALC;
                
            END IF;
            
            -- 仕入先年間内示情報(在庫引当所要量展開区分)の更新
            BEGIN
                UPDATE T_PJ_BUDGET_DETAIL
                SET ALC_STOCK_ODR_FLG  = 1                    -- 1：展開済
                  , UPDATED_DATE       = SYSDATE
                  , UPDATED_BY         = pvc2UserId
                  , UPDATED_PRG_NM     = pvc2BusinessName
                  , MODIFY_COUNT       = MODIFY_COUNT + 1
                WHERE 
                    T_PJ_BUDGET_DETAIL.PJ_BUDGET_DETAIL_NO   = recT_PJ_BUDGET_DETAIL.PJ_BUDGET_DETAIL_NO
                AND T_PJ_BUDGET_DETAIL.SEQNO                 = recT_PJ_BUDGET_DETAIL.SEQNO
                ;
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment := SUBSTR(' 05:UPDATE T_PJ_BUDGET_DETAIL'         ||
                                         ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                         ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                         1,256);
                    RAISE excOTHER_ERR;
            END;
            
            -- 案件予算積上明細カーソルFETCH
            BEGIN
                FETCH curT_PJ_BUDGET_DETAIL INTO recT_PJ_BUDGET_DETAIL;
            EXCEPTION
                WHEN OTHERS THEN
                    -- カーソルFETCH失敗
                    vc2Comment  := SUBSTR(' 05:FETCH curT_PJ_BUDGET_DETAIL'      ||
                                          ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                          ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                          1,256);
                    RAISE;
            END;
            -- 案件予算積上明細カーソル
            EXIT WHEN  curT_PJ_BUDGET_DETAIL%NOTFOUND;
            
        END LOOP;
        
        CLOSE curT_PJ_BUDGET_DETAIL;
    END LOOP;

    -- FNCを使う為、ここでCOMMIT
    COMMIT;
/*------------------------------------------------------------
'  予算実績取得処理
-------------------------------------------------------------*/
vc2RunChkComment := '●●●●通過 00060';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment||'----------'||TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

    IF  recT_PJ_ODR_ALC.ESTIMATE_TYPE     =   1    THEN
        -- 引当在庫区分”＝1:品目在庫）の時
        
        -- 案件予算積上明細カーソルOPEN
        BEGIN
            OPEN curT_PJ_BUDGET_RESULT(vc2PJBuDgetDetailNo);
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment := SUBSTR(' 60:OPEN curT_PJ_BUDGET_RESULT'       ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                     1,256);
                RAISE;
        END;
        
        LOOP
            -- 案件予算積上明細のカーソルFETCH
            BEGIN
                FETCH curT_PJ_BUDGET_RESULT  INTO recT_PJ_BUDGET_RESULT;
            EXCEPTION
                WHEN OTHERS THEN
                    -- カーソルFETCH失敗
                    vc2Comment  := SUBSTR(' 60:FETCH curT_PJ_BUDGET_RESULT'      ||
                                          ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                          ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                          1,256);
                    RAISE;
            END;
            
            -- 製品構成カーソルEND
            EXIT WHEN  curT_PJ_BUDGET_RESULT%NOTFOUND;
        
            numErrorSEQNO  :=  recT_PJ_BUDGET_RESULT.SEQNO;
            -- 変数クリア
            vc2ErrorCD             :=  null;   -- エラーCD
            vc2VEND_CD             :=  null;   -- 取引先CD
            vc2ProcCD              :=  null;   -- 作業区コード   
            numUNIT_COST           :=  0;
            numCUR_CD              :=  0;
            numEXCH_TYP            :=  0;
            numROUND_TYP           :=  0;
            -- 予算 --
            numPl_COST_MATERIAL    :=  0;      -- 材料費
            numPl_COST_PROCESS     :=  0;      -- 加工費
            numPl_COST_OUTSOUCE    :=  0;      -- 外注費
            numPl_COST_SERVICE     :=  0;      -- 役務費
            -- 実績 --
            numRs_COST_MATERIAL    :=  0;      -- 材料費
            numRs_COST_PROCESS     :=  0;      -- 加工費
            numRs_COST_OUTSOUCE    :=  0;      -- 外注費
            numRs_COST_SERVICE     :=  0;      -- 役務費


            -- 予算積上げ区分の値の編集
            IF  recT_PJ_BUDGET_RESULT.PARENT_SEQNO  Is Null   THEN
                numBUDGET_STACK_TYP    :=  1;
            ELSE
                numBUDGET_STACK_TYP    :=  1;
                /*  上位手配品の検索 */
                BEGIN
                    SELECT  /*+ RULE */
                            OUTSIDE_TYP
                           ,BUDGET_STACK_TYP
                           ,PARENT_SEQNO
                           ,MRP_ODR_TYP
                           ,VEND_CD
                    INTO    numP_OUTSIDE_TYP
                           ,numP_BUDGET_STACK_TYP
                           ,numP_SEQNO
                           ,numP_MRP_ODR_TYP
                           ,numP_VEND_CD
                    FROM    T_PJ_BUDGET_DETAIL 
                    WHERE   PJ_BUDGET_DETAIL_NO  = vc2PJBuDgetDetailNo
                    AND     SEQNO                = recT_PJ_BUDGET_RESULT.PARENT_SEQNO
                    ;
                EXCEPTION
                    WHEN OTHERS THEN
                        vc2Comment := SUBSTR('06:SELECT PJ_BUDGET_DETAIL_NO'       ||
                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                        RAISE;
                END;

                /*  「原価積上区分」＝0:積上しない */
                IF  recT_PJ_BUDGET_RESULT.COST_UP_TYP      =   0    THEN
                    numBUDGET_STACK_TYP    :=  0;
                END IF;

                /*  「無償受給品フラグ」＝１：無償受給品 */
                IF  recT_PJ_BUDGET_RESULT.VOLUNT_SPL_FLG      =   1    THEN
                    numBUDGET_STACK_TYP    :=  0;
                END IF;

                /*  上位手配品目の予算積上げしない */
                IF  numP_BUDGET_STACK_TYP    =   0    THEN
                    numBUDGET_STACK_TYP      :=  0;
                END IF;

                /*  有償支給品フラグの編集 */
                IF  numP_MRP_ODR_TYP  =  8   THEN 
                    -- 検索の上位品目が疑似品の場合、さらに上位品を検索
                    BEGIN
                        SELECT  /*+ RULE */
                                OUTSIDE_TYP
                               ,BUDGET_STACK_TYP
                               ,MRP_ODR_TYP
                               ,VEND_CD
                        INTO    numP_OUTSIDE_TYP
                               ,numP_BUDGET_STACK_TYP
                               ,numP_MRP_ODR_TYP
                               ,numP_VEND_CD
                        FROM    T_PJ_BUDGET_DETAIL 
                        WHERE   PJ_BUDGET_DETAIL_NO  = vc2PJBuDgetDetailNo
                        AND     SEQNO                = numP_SEQNO
                        ;
                    EXCEPTION
                        WHEN OTHERS THEN
                            vc2Comment := SUBSTR('06:SELECT PJ_BUDGET_DETAIL_NO'       ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                            RAISE;
                    END;
                END IF;
            END IF;

            IF numP_OUTSIDE_TYP   =   1   THEN
                -- 上位手配品が内作の時
                numONEROUS_CONS_FLG   :=  0;         
            ELSE
                -- 上位手配品が内作の時
                -- [支給単価]を検索
                IF  numP_VEND_CD    IS Null    THEN
                    numONEROUS_CONS_FLG   :=  0;
                ELSE
                    BEGIN
                        SELECT /*+ RULE */
                               ONEROUS_FLG
                        INTO   numONEROUS_CONS_FLG
                        FROM   M_CONS_UNIT_COST   CC
                              ,(SELECT MAX(EFF_PHASE_IN_DATE) as  EFF_PHASE_IN_DATE
                                FROM   M_CONS_UNIT_COST
                                WHERE  COMPANY_CD            =  vc2CompyCd                          
                                AND    VEND_CD               =  numP_VEND_CD
                                AND    PLANT_CD              =  recT_PJ_BUDGET_RESULT.PLANT_CD
                                AND    ITEM_CD               =  recT_PJ_BUDGET_RESULT.ITEM_CD
                                AND    EFF_PHASE_IN_DATE    <=  recT_PJ_BUDGET_RESULT.DUE_DATE
                               )       CU 
                        WHERE  CC.COMPANY_CD            =  vc2CompyCd                          
                        AND    CC.VEND_CD               =  numP_VEND_CD
                        AND    CC.PLANT_CD              =  recT_PJ_BUDGET_RESULT.PLANT_CD
                        AND    CC.ITEM_CD               =  recT_PJ_BUDGET_RESULT.ITEM_CD
                        AND    CC.EFF_PHASE_IN_DATE     =  CU.EFF_PHASE_IN_DATE
                        ;
                    EXCEPTION
                        WHEN NO_DATA_FOUND THEN
                            numONEROUS_CONS_FLG   :=  0;
                        WHEN OTHERS THEN
                            RAISE;
                    END;
                END IF;
                IF numONEROUS_CONS_FLG  =   1   THEN
                   -- 有償支給区分=1:有償
                   numBUDGET_STACK_TYP   :=  0;
                END IF;
            END IF;

            /*  余剰品の入出庫（オーダデマンド区分＝7:入出庫） */
            IF  recT_PJ_BUDGET_RESULT.OD_TYP      =   7    THEN
                numBUDGET_STACK_TYP      :=  0;
            END IF;

            -- データの状態によって実績情報を取得  
            CASE
            WHEN numBUDGET_STACK_TYP   =   0       THEN
                -- 「予算積上げ区分」＝0:積上げしないの時
                NULL; 
                 
            WHEN (recT_PJ_BUDGET_RESULT.OD_TYP   =   3)  AND  (recT_PJ_BUDGET_RESULT.ALC_STOCK_FLG  =  1)        THEN
                -- 「オーダデマンド区分」＝3:デマンド 且つ 「引当在庫有無フラグ」＝ 1:引当あり
                NULL; 

            WHEN recT_PJ_BUDGET_RESULT.MRP_ODR_TYP IN  (4 ,5 ,6 ,7)  THEN  
                -- 品目手配区分＝4:マニュアル手配品目,5:ロット手配品目,6:定量手配品目,7:発注点手配品目時
                
                -- [品目別原価]のカーソルOPEN
                BEGIN
                    OPEN curT_ITEM_COST(TO_CHAR(recT_PJ_BUDGET_RESULT.ODR_ACPT_DATE,'YYYY'),recT_PJ_BUDGET_RESULT.PLANT_CD,recT_PJ_BUDGET_RESULT.ITEM_CD);
                EXCEPTION
                    WHEN OTHERS THEN
                        vc2Comment := SUBSTR(' 60:OPEN curT_PJ_BUDGET_RESULT'       ||
                                             ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                             ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                             1,256);
                         RAISE;
                END;

                --[品目別原価]のカーソルFETCH
                BEGIN
                    FETCH curT_ITEM_COST  INTO recT_ITEM_COST;
                EXCEPTION
                    WHEN OTHERS THEN
                        -- カーソルFETCH失敗
                        vc2Comment  := SUBSTR(' 60:FETCH curT_PJ_BUDGET_RESULT'      ||
                                              ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                              ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                              1,256);
                        RAISE;
                END;

                IF  curT_ITEM_COST%NOTFOUND THEN
                        vc2ErrorCD :=  'GB00407';
                        vc2Comment :=  '品目番号='||recT_PJ_BUDGET_RESULT.ITEM_CD;
                        -- エラー処理
                        blnRet :=  SubFncInsBudgetError(recM_PROC_GRP.PROC_CD); 
                ELSE    
                    -- 費用算出(丸め処理)
                    blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                          recT_PJ_BUDGET_RESULT.NECESSARY_QTY * 
                                          recT_ITEM_COST.TOTAL_MATR_COST,     --(i)端数処理前の値
                                          4,                                  --(i)少数桁数
                                          numPjRoundTyp,                      --(i)端数処理区分
                                          numResultAmount);                   --(o)端数処理後の値
                    IF blnRet = FALSE THEN
                        numResultAmount   :=  0;
                    END IF;   
                    numRs_COST_MATERIAL      :=  numResultAmount;
                    --DBMS_OUTPUT.PUT_LINE('---------->実績_材料費計算    numPl_COST_PROCESS='||numResultAmount);

                    -- 費用算出
                    blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                          recT_PJ_BUDGET_RESULT.NECESSARY_QTY * 
                                          recT_ITEM_COST.TOTAL_PROC_COST_SUM_ALL,  --(i)端数処理前の値
                                          4,                                       --(i)少数桁数
                                          numPjRoundTyp,                           --(i)端数処理区分
                                          numResultAmount);                        --(o)端数処理後の値
                    IF blnRet = FALSE THEN
                        numResultAmount   :=  0;
                    END IF;   
                    numRs_COST_PROCESS       :=  numResultAmount;
                    --DBMS_OUTPUT.PUT_LINE('---------->実績_加工費計算    numPl_COST_PROCESS='||numResultAmount);
                
                    -- 費用算出
                    blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                          recT_PJ_BUDGET_RESULT.NECESSARY_QTY * 
                                          recT_ITEM_COST.TOTAL_SBCNT_MATR_COST,    --(i)端数処理前の値
                                          4,                                       --(i)少数桁数
                                          numPjRoundTyp,                           --(i)端数処理区分
                                          numResultAmount);                        --(o)端数処理後の値
                    IF blnRet = FALSE THEN
                        numResultAmount   :=  0;
                    END IF;   
                    numRs_COST_OUTSOUCE      :=  numResultAmount;
 
                END IF;
                -- [品目別原価]のカーソルCLOSE
                CLOSE curT_ITEM_COST;

            WHEN recT_PJ_BUDGET_RESULT.MRP_ODR_TYP IN  (8)     THEN
                -- 品目手配区分＝擬似品
                Null;
                
            WHEN recT_PJ_BUDGET_RESULT.ODR_RELEASE_FLG  =  0  or recT_PJ_BUDGET_RESULT.ALC_STOCK_TYP  =  1  THEN
                -- 製番且つオーダ発効済フラグ＝0:オーダ未発効の時の時
                IF  recT_PJ_BUDGET_RESULT.OUTSIDE_TYP  =   1   THEN
                    -- 内作の時
                    
                    numCountRec :=  0;
                    -- [作業系列]カーソルOPEN
                    BEGIN
                        OPEN curM_PROC_GRP(recT_PJ_BUDGET_RESULT.PLANT_CD,recT_PJ_BUDGET_RESULT.ITEM_CD);
                    EXCEPTION
                        WHEN OTHERS THEN
                            vc2Comment := SUBSTR(' 60:OPEN curM_PROC_GRP'       ||
                                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                                 1,256);
                            RAISE;
                    END;
                    
                    
                    LOOP
                        -- 作業系列のカーソルFETCH
                        BEGIN
                            FETCH curM_PROC_GRP  INTO recM_PROC_GRP;
                        EXCEPTION
                            WHEN OTHERS THEN
                                -- カーソルFETCH失敗
                                vc2Comment  := SUBSTR(' 60:FETCH curM_PROC_GRP'      ||
                                                      ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                      ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                                      1,256);
                                RAISE;
                        END;
                        
                        -- 作業系列カーソルEND
                        EXIT WHEN  curM_PROC_GRP%NOTFOUND;
                        
                        numCountRec :=  numCountRec   +   1;
                        vc2ProcCD   :=  recM_PROC_GRP.PROC_CD;   -- 品目別作業コード

                        IF  recM_PROC_GRP.OUTSIDE_TYP  =   1   THEN
                            ---作業系列内外作区分＝1:内作の時
                            -- 標準工数=0
                            IF  recM_PROC_GRP.STANDARD_COST   =   0  THEN
                                vc2ErrorCD :=  'KM00062';
                                vc2Comment :=  'PROC_CD ='||vc2ProcCD;
                                -- エラー処理
                                blnRet :=  SubFncInsBudgetError(recM_PROC_GRP.PROC_CD);   
                                GOTO EXT00060A1;
                            END IF;
                            -- 作業区が空白
                            IF  recM_PROC_GRP.WS_CD    Is  Null  THEN
                                vc2ErrorCD :=  'AA02005';
                                vc2Comment :=  'PROC_CD ='||vc2ProcCD;
                                -- エラー処理
                                blnRet :=  SubFncInsBudgetError(recM_PROC_GRP.PROC_CD);    
                                GOTO EXT00060A1;
                            END IF;
                            -- [作業区]を下記の条件で検索
                            BEGIN
                                SELECT /*+ RULE */
                                       WS_CD
                                INTO   vc2WS_CD
                                FROM   M_WS       WS
                                WHERE  WS.WS_CD     =  recM_PROC_GRP.WS_CD 
                                ;
                            EXCEPTION
                                WHEN NO_DATA_FOUND THEN
                                    vc2ErrorCD :=  'AA01003';
                                    vc2Comment :=  null;
                                    -- エラー処理
                                    blnRet :=  SubFncInsBudgetError(recM_PROC_GRP.PROC_CD);    
                                    GOTO EXT00060A1;
                                WHEN OTHERS THEN
                                    RAISE;
                            END;
                            BEGIN
                                SELECT /*+ RULE */
                                       NVL(WS_CLASS_01_NAME,'*')
                                INTO   vc2CLASS_01_NAME
                                FROM   M_WS_CLASS WC
                                      ,M_CLASS    CL
                                WHERE  WC.WS_CD     =  vc2WS_CD
                                AND    CL.CLASS_CD1 =  '40' 
                                AND    CL.CLASS_CD2 =  '01'  
                                AND    CL.CLASS_CD3 =  WC.WS_CLASS_01_CD       
                                ;
                            EXCEPTION
                                WHEN NO_DATA_FOUND THEN
                                    vc2CLASS_01_NAME  :=  '*';
                                WHEN OTHERS THEN
                                    RAISE;
                            END;

                            -- 値が数値以外の対応
                            BEGIN
                                 numRATE_PAY    :=  TO_NUMBER(vc2CLASS_01_NAME);
                            EXCEPTION
                                 WHEN OTHERS THEN 
                                     numRATE_PAY    :=  TO_NUMBER(numPjPayRate);
                            END;

                            blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                                  pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                                  recT_PJ_BUDGET_RESULT.NECESSARY_QTY *
                                                  recM_PROC_GRP.STANDARD_COST * 
                                                  numRATE_PAY,                        --(i)端数処理前の値
                                                  4,                                  --(i)少数桁数
                                                  numPjRoundTyp,                      --(i)端数処理区分
                                                  numResultAmount);                   --(o)端数処理後の値
                            IF  blnRet = FALSE THEN
                                numResultAmount  :=  0;
                            END IF; 
                            
                            -- 予定_加工費
                            IF recT_PJ_BUDGET_RESULT.ALC_STOCK_TYP  =  1 THEN
                                -- 余剰在庫品
                                numRs_COST_PROCESS      :=  numRs_COST_PROCESS     +   numResultAmount;
                            ELSE
                                numPl_COST_PROCESS      :=  numPl_COST_PROCESS     +   numResultAmount;
                            END IF;
                        ELSE
                            ---作業系列内外作区分＝2:外作の時
                            
                            IF  recM_PROC_GRP.VEND_CD      IS  Null   THEN
                                vc2ErrorCD :=  'AA02004';
                                vc2Comment :=  null;
                                -- エラー処理
                                blnRet     :=  SubFncInsBudgetError(recM_PROC_GRP.PROC_CD);
                                GOTO EXT00060A1;
                            END IF;

                            -- [外注単価][取引先][通貨]を下記の条件で検索
                            -- 余剰在庫品は必要数がマイナスになるのでエラーとする。
                            IF recT_PJ_BUDGET_RESULT.NECESSARY_QTY  > 0   THEN 
                                numNECESSARY_QTY   :=  recT_PJ_BUDGET_RESULT.NECESSARY_QTY;
                            ELSE
                                numNECESSARY_QTY   :=  recT_PJ_BUDGET_RESULT.NECESSARY_QTY *  -1;
                            END IF;

                            BEGIN
                                SELECT /*+ RULE */
                                       SC.UNIT_COST,MV.CUR_CD,MV.EXCH_TYP,MV.ROUND_TYP,MC.DECIMAL_FIG
                                INTO   numUNIT_COST,numCUR_CD,numEXCH_TYP,numROUND_TYP,numDECIMAL_FIG
                                FROM   M_SBCNT_UNIT_COST  SC
                                      ,(SELECT MAX(EFF_PHASE_IN_DATE)  as  EFF_PHASE_IN_DATE
                                        FROM   M_SBCNT_UNIT_COST
                                        WHERE  COMPANY_CD         =  vc2CompyCd                          
                                        AND    VEND_CD            =  recM_PROC_GRP.VEND_CD
                                        AND    PLANT_CD           =  recM_PROC_GRP.PLANT_CD
                                        AND    ITEM_CD            =  recM_PROC_GRP.ITEM_CD
                                        AND    PROC_CD            =  recM_PROC_GRP.PROC_CD
                                        AND    EFF_PHASE_IN_DATE <=  nvl(recT_PJ_BUDGET_RESULT.DUE_DATE,recT_PJ_BUDGET_RESULT.PRD_DUE_DATE)
                                        AND    SBCNT_SIZE        <=  numNECESSARY_QTY
                                       )       SU 
                                      ,M_VEND_CTRL        MV
                                      ,M_CUR              MC
                                WHERE  SC.COMPANY_CD         =  vc2CompyCd                          
                                AND    SC.VEND_CD            =  recM_PROC_GRP.VEND_CD
                                AND    SC.PLANT_CD           =  recM_PROC_GRP.PLANT_CD
                                AND    SC.ITEM_CD            =  recM_PROC_GRP.ITEM_CD
                                AND    SC.PROC_CD            =  recM_PROC_GRP.PROC_CD
                                AND    SC.EFF_PHASE_IN_DATE  =  SU.EFF_PHASE_IN_DATE
                                AND    SC.SBCNT_SIZE        <=  numNECESSARY_QTY
                                AND    MV.COMPANY_CD         =  vc2CompyCd
                                AND    MV.VEND_CD            =  SC.VEND_CD 
                                AND    MC.CUR_CD             =  MV.CUR_CD
                                ;
                            EXCEPTION
                                WHEN NO_DATA_FOUND THEN
                                    DBMS_OUTPUT.PUT_LINE('-- M_SBCNT_UNIT_COST NOT FOUND 1 --------');
                                    vc2ErrorCD :=  'ZZ12004';
                                    vc2Comment :=  null;
                                    -- エラー処理
                                    blnRet     :=  SubFncInsBudgetError(recM_PROC_GRP.PROC_CD);
                                    GOTO EXT00060A1;
                                WHEN OTHERS THEN
                                    RAISE;
                            END; 
                         
                            --//為替レート取得する
                            BEGIN
                                SELECT /*+ RULE */
                                       EXCH_RATE
                                INTO   numEXCH_RATE
                                FROM   M_EXCH_RATE MER,
                                      (SELECT MAX(EXCH_START_DATE) as EXCH_START_DATE
                                       FROM   M_EXCH_RATE
                                       WHERE  COMPANY_CD            =  vc2CompyCd              --自社コード
                                       AND    CUR_CD                =  numCUR_CD               --通貨コー
                                       AND    EXCH_TYP              =  numEXCH_TYP             --為替種別
                                       AND    EXCH_START_DATE      <=  nvl(recT_PJ_BUDGET_RESULT.DUE_DATE,recT_PJ_BUDGET_RESULT.PRD_DUE_DATE)    --要求手配日
                                       )           ER
                                WHERE  MER.COMPANY_CD            =  vc2CompyCd              --自社コード
                                AND    MER.CUR_CD                =  numCUR_CD               --通貨コー
                                AND    MER.EXCH_TYP              =  numEXCH_TYP             --為替種別
                                AND    MER.EXCH_START_DATE       =  ER.EXCH_START_DATE      --要求手配日
                                ;
                            EXCEPTION
                                WHEN NO_DATA_FOUND THEN
                                    vc2ErrorCD     :=  'KQ00038';
                                    vc2Comment     :=  null;
                                    -- エラー処理
                                    blnRet     :=  SubFncInsBudgetError(recM_PROC_GRP.PROC_CD);
                                    numEXCH_RATE   :=  0;        
                                WHEN OTHERS THEN
                                    RAISE;
                            END;
                            
                            -- 費用計算（丸め）
                            blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                                  pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                                  recT_PJ_BUDGET_RESULT.NECESSARY_QTY * 
                                                  numUNIT_COST         *
                                                  numEXCH_RATE,                       --(i)端数処理前の値
                                                  numDECIMAL_FIG,                     --(i)少数桁数
                                                  numROUND_TYP,                       --(i)端数処理区分
                                                  numResultAmount);                   --(o)端数処理後の値
                            IF  blnRet = FALSE THEN
                                numResultAmount  :=  0;
                            END IF; 
                            
                            -- 予定_外注費
                            IF recT_PJ_BUDGET_RESULT.ALC_STOCK_TYP  =  1 THEN
                               numRs_COST_OUTSOUCE     :=  numRs_COST_OUTSOUCE    +   numResultAmount;
                            ELSE
                               numPl_COST_OUTSOUCE     :=  numPl_COST_OUTSOUCE    +   numResultAmount;
                            END IF;
                        END IF;

                        <<EXT00060A1>>
                        NULL;

                    END LOOP;
                    
                    -- [作業系列]カーソルCLOSE
                    IF  numCountRec    =   0   THEN
                        vc2ErrorCD :=  APS_COM_M_PROC_GRP; -- 作業系列情報が存在しません。
                        vc2Comment :=  'ITEM_CD='||recT_PJ_BUDGET_RESULT.ITEM_CD;
                        -- 案件予算積上げエラー登録
                        blnRet :=  SubFncInsBudgetError(recM_PROC_GRP.PROC_CD);
                    END IF;
                    CLOSE curM_PROC_GRP;

                ELSE
                    -- 外作の時
                    
                    -- [購入単価ヘッダ]を下記の条件で検索
                    BEGIN
                        SELECT /*+ RULE */
                               min(PCH.PUCH_PRIORITY_REF_NO) as PUCH_PRIORITY_REF_NO
                        INTO   numPUCH_PRIORITY_REF_NO
                        FROM   M_PUCH_UNIT_COST_H PCH
                        WHERE  PCH.COMPANY_CD            =  vc2CompyCd                          
                        AND    PCH.PLANT_CD              =  recT_PJ_BUDGET_RESULT.PLANT_CD
                        AND    PCH.ITEM_CD               =  recT_PJ_BUDGET_RESULT.ITEM_CD
                        ;
                    EXCEPTION
                        WHEN NO_DATA_FOUND THEN
                            vc2ErrorCD :=  'AC00104';
                            vc2Comment :=  null;
                            blnRet :=  SubFncInsBudgetError('');
                            GOTO EXT00060A;
                        WHEN OTHERS THEN
                            RAISE;
                    END;

                    -- [購入単価ヘッダ][取引先][通貨]を下記の条件で検索
                    BEGIN
                        SELECT /*+ RULE */
                               PCH.VEND_CD,MV.CUR_CD,MV.EXCH_TYP,MV.ROUND_TYP,MC.DECIMAL_FIG
                        INTO   vc2VEND_CD ,numCUR_CD,numEXCH_TYP,numROUND_TYP,numDECIMAL_FIG
                        FROM   M_PUCH_UNIT_COST_H   PCH
                              ,(SELECT min(PUCH_PRIORITY_REF_NO) as PUCH_PRIORITY_REF_NO
                                      ,max(UPDATED_DATE)         as UPDATED_DATE
                                FROM   M_PUCH_UNIT_COST_H
                                WHERE  COMPANY_CD           =  vc2CompyCd                          
                                AND    PLANT_CD             =  recT_PJ_BUDGET_RESULT.PLANT_CD
                                AND    ITEM_CD              =  recT_PJ_BUDGET_RESULT.ITEM_CD
                                AND    PUCH_PRIORITY_REF_NO =  numPUCH_PRIORITY_REF_NO
                               )       PUH
                              ,M_VEND_CTRL        MV
                              ,M_CUR              MC
                        WHERE  PCH.COMPANY_CD            =  vc2CompyCd                          
                        AND    PCH.PLANT_CD              =  recT_PJ_BUDGET_RESULT.PLANT_CD
                        AND    PCH.ITEM_CD               =  recT_PJ_BUDGET_RESULT.ITEM_CD
                        AND    PCH.PUCH_PRIORITY_REF_NO  =  PUH.PUCH_PRIORITY_REF_NO
                        AND    PCH.UPDATED_DATE          =  PUH.UPDATED_DATE
                        AND    MV.COMPANY_CD             =  vc2CompyCd
                        AND    MV.VEND_CD                =  PCH.VEND_CD 
                        AND    MC.CUR_CD                 =  MV.CUR_CD
                        ;
                    EXCEPTION
                        WHEN NO_DATA_FOUND THEN
                            vc2ErrorCD :=  'AC00104';
                            vc2Comment :=  null;
                            blnRet :=  SubFncInsBudgetError('');
                            GOTO EXT00060A;
                        WHEN OTHERS THEN
                            RAISE;
                    END;

                    -- [購入単価]を下記の条件で検索
                    -- 余剰在庫品は必要数がマイナスになるのでエラーとする。
                    IF recT_PJ_BUDGET_RESULT.NECESSARY_QTY  > 0   THEN 
                        numNECESSARY_QTY   :=  recT_PJ_BUDGET_RESULT.NECESSARY_QTY;
                    ELSE
                        numNECESSARY_QTY   :=  recT_PJ_BUDGET_RESULT.NECESSARY_QTY *  -1;
                    END IF;

                    BEGIN
                        SELECT /*+ RULE */
                               PC.UNIT_COST
                        INTO   numUNIT_COST
                        FROM   M_PUCH_UNIT_COST   PC
                              ,(SELECT MAX(EFF_PHASE_IN_DATE) as EFF_PHASE_IN_DATE
                                FROM   M_PUCH_UNIT_COST
                                WHERE  COMPANY_CD         =  vc2CompyCd                          
                                AND    VEND_CD            =  vc2VEND_CD
                                AND    PLANT_CD           =  recT_PJ_BUDGET_RESULT.PLANT_CD
                                AND    ITEM_CD            =  recT_PJ_BUDGET_RESULT.ITEM_CD
                                AND    EFF_PHASE_IN_DATE <=  nvl(recT_PJ_BUDGET_RESULT.DUE_DATE,recT_PJ_BUDGET_RESULT.PRD_DUE_DATE)
                                AND    PUCH_SIZE         <=  numNECESSARY_QTY               ----recT_PJ_BUDGET_RESULT.NECESSARY_QTY
                                )      PU
                        WHERE  PC.COMPANY_CD         =  vc2CompyCd                          
                        AND    PC.VEND_CD            =  vc2VEND_CD
                        AND    PC.PLANT_CD           =  recT_PJ_BUDGET_RESULT.PLANT_CD
                        AND    PC.ITEM_CD            =  recT_PJ_BUDGET_RESULT.ITEM_CD
                        AND    PC.EFF_PHASE_IN_DATE  =  PU.EFF_PHASE_IN_DATE
                        AND    PC.PUCH_SIZE         <=  numNECESSARY_QTY                    --recT_PJ_BUDGET_RESULT.NECESSARY_QTY
                        ;
                    EXCEPTION
                        WHEN NO_DATA_FOUND THEN
                            vc2ErrorCD :=  'AC50515';
                            vc2Comment :=  null;
                            blnRet :=  SubFncInsBudgetError('');
                            GOTO EXT00060A;
                        WHEN OTHERS THEN
                            RAISE;
                    END;

                    --//為替レート取得する
                    BEGIN
                        SELECT /*+ RULE */
                               EXCH_RATE
                        INTO   numEXCH_RATE
                        FROM   M_EXCH_RATE MER,
                              (SELECT MAX(EXCH_START_DATE) as EXCH_START_DATE
                               FROM   M_EXCH_RATE
                               WHERE  COMPANY_CD            =  vc2CompyCd              --自社コード
                               AND    CUR_CD                =  numCUR_CD               --通貨コー
                               AND    EXCH_TYP              =  numEXCH_TYP             --為替種別
                               AND    EXCH_START_DATE      <=  nvl(recT_PJ_BUDGET_RESULT.DUE_DATE,recT_PJ_BUDGET_RESULT.PRD_DUE_DATE)    --要求手配日
                               )           ER
                        WHERE  MER.COMPANY_CD            =  vc2CompyCd              --自社コード
                        AND    MER.CUR_CD                =  numCUR_CD               --通貨コー
                        AND    MER.EXCH_TYP              =  numEXCH_TYP             --為替種別
                        AND    MER.EXCH_START_DATE       =  ER.EXCH_START_DATE      --要求手配日
                        ;

                    EXCEPTION
                        WHEN NO_DATA_FOUND THEN
                            vc2ErrorCD     :=  'KQ00038';
                            vc2Comment     :=  null;
                            numEXCH_RATE   :=  0;        
                        WHEN OTHERS THEN
                            RAISE;
                    END;

                    -- 費用計算（丸め）
                    blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                          recT_PJ_BUDGET_RESULT.NECESSARY_QTY * numUNIT_COST  *  numEXCH_RATE,                       --(i)端数処理前の値
                                          numDECIMAL_FIG,                     --(i)少数桁数
                                          numROUND_TYP,                       --(i)端数処理区分
                                          numResultAmount);                   --(o)端数処理後の値
                    IF  blnRet = FALSE THEN
                        numResultAmount   :=  0;
                    END IF; 
                    
                    -- 予定_材料費
                    IF recT_PJ_BUDGET_RESULT.ALC_STOCK_TYP  =  1 THEN
                        numRs_COST_MATERIAL     :=  numRs_COST_MATERIAL    +   numResultAmount;
                    ELSE
                        numPl_COST_MATERIAL     :=  numPl_COST_MATERIAL    +   numResultAmount;
                    END IF;
                END IF;

                <<EXT00060A>>
                NULL;

            WHEN recT_PJ_BUDGET_RESULT.ODR_RELEASE_FLG =   1   THEN
                -- 製番且かつ-- オーダ発効済フラグ＝1:オーダ発行済の時

                /*  内作の作業実績を集計 */
                -- 品目別仕掛のカーソルOPEN
                BEGIN
                    OPEN curT_WORK_IN_PROC_BY_ITEM(recT_PJ_BUDGET_RESULT.OD_NO);
                EXCEPTION
                    WHEN OTHERS THEN
                        vc2Comment := SUBSTR(' 60:OPEN recT_PJ_BUDGET_RESULT'       ||
                                             ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                             ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                             1,256);
                        RAISE;
                END;
                
                LOOP
                    -- 品目別仕掛のカーソルFETCH
                    BEGIN
                        FETCH curT_WORK_IN_PROC_BY_ITEM  INTO recT_WORK_IN_PROC_BY_ITEM;
                    EXCEPTION
                        WHEN OTHERS THEN
                            -- カーソルFETCH失敗
                            vc2Comment  := SUBSTR(' 60:FETCH curT_WORK_IN_PROC_BY_ITEM'  ||
                                                  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                                  1,256);
                            RAISE;
                    END;
                    -- 製品構成カーソルEND
                    EXIT WHEN  curT_WORK_IN_PROC_BY_ITEM%NOTFOUND;
                    
                    IF  recT_WORK_IN_PROC_BY_ITEM.PROC_EXPLOSION_FLG =   0   THEN
                        -- 作業系列展開済みフラグ ＝ 0:未展開
                        numCountRec :=  0;
                        -- [作業系列]カーソルOPEN
                        BEGIN
                            OPEN curM_PROC_GRP(recT_WORK_IN_PROC_BY_ITEM.PLANT_CD,recT_WORK_IN_PROC_BY_ITEM.ITEM_CD);
                        EXCEPTION
                            WHEN OTHERS THEN
                                vc2Comment := SUBSTR(' 60:OPEN curM_PROC_GRP'       ||
                                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                                     1,256);
                                RAISE;
                        END;
                        
                        LOOP
                            -- 所要量のカーソルFETCH
                            BEGIN
                                FETCH curM_PROC_GRP  INTO recM_PROC_GRP;
                            EXCEPTION
                                WHEN OTHERS THEN
                                    -- カーソルFETCH失敗
                                    vc2Comment  := SUBSTR(' 60:FETCH curM_PROC_GRP'      ||
                                                          ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                          ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                                          1,256);
                                    RAISE;
                            END;
                            
                            -- 製品構成カーソルEND
                            EXIT WHEN  curM_PROC_GRP%NOTFOUND;
                            
                            numCountRec :=  numCountRec   +   1;
                            vc2ProcCD   :=  recM_PROC_GRP.PROC_CD;   -- 品目別作業コード
                            
                            IF  recM_PROC_GRP.OUTSIDE_TYP  =   1   THEN
                                ---作業系列内外作区分＝1:内作の時

                                -- 標準工数=0
                                IF  recM_PROC_GRP.STANDARD_COST   =   0  THEN
                                    vc2ErrorCD :=  'KM00062';
                                    vc2Comment :=  'PROC_CD ='||vc2ProcCD;
                                    -- エラー処理
                                    blnRet :=  SubFncInsBudgetError(recM_PROC_GRP.PROC_CD);   
                                    GOTO EXT00060B1;
                                END IF;
                                -- 作業区が空白
                                IF  recM_PROC_GRP.WS_CD    Is  Null  THEN
                                    vc2ErrorCD :=  'AA02005';
                                    vc2Comment :=  'PROC_CD ='||vc2ProcCD;
                                    -- エラー処理
                                    blnRet :=  SubFncInsBudgetError(recM_PROC_GRP.PROC_CD);    
                                    GOTO EXT00060B1;
                                END IF;

                                -- [作業区]を下記の条件で検索
                                BEGIN
                                    SELECT /*+ RULE */
                                           WS_CD
                                    INTO   vc2WS_CD
                                    FROM   M_WS       WS
                                    WHERE  WS.WS_CD     =  recM_PROC_GRP.WS_CD 
                                    ;
                                EXCEPTION
                                    WHEN NO_DATA_FOUND THEN
                                        vc2ErrorCD :=  'AA01003';
                                        vc2Comment :=  null;
                                        -- エラー処理
                                        blnRet :=  SubFncInsBudgetError(recM_PROC_GRP.PROC_CD);    
                                        GOTO EXT00060B1;
                                    WHEN OTHERS THEN
                                        RAISE;
                                END;
                                BEGIN
                                    SELECT /*+ RULE */
                                           NVL(WS_CLASS_01_NAME,'*')
                                    INTO   vc2CLASS_01_NAME
                                    FROM   M_WS_CLASS WC
                                          ,M_CLASS    CL
                                    WHERE  WC.WS_CD     =  vc2WS_CD
                                    AND    CL.CLASS_CD1 =  '40' 
                                    AND    CL.CLASS_CD2 =  '01'  
                                    AND    CL.CLASS_CD3 =  WC.WS_CLASS_01_CD       
                                    ;
                                EXCEPTION
                                    WHEN NO_DATA_FOUND THEN
                                        vc2CLASS_01_NAME  :=  '*';
                                    WHEN OTHERS THEN
                                        RAISE;
                                END;

                                -- 値が数値以外の対応
                                BEGIN
                                    numRATE_PAY    :=  TO_NUMBER(vc2CLASS_01_NAME);
                                EXCEPTION
                                    WHEN OTHERS THEN
                                       numRATE_PAY    :=  TO_NUMBER(numPjPayRate);
                                END;
                                
                                blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                                      pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                                      recT_WORK_IN_PROC_BY_ITEM.OPR_INST_QTY *
                                                      recM_PROC_GRP.STANDARD_COST * 
                                                      numRATE_PAY,                        --(i)端数処理前の値
                                                      4,                                  --(i)少数桁数
                                                      numROUND_TYP,                       --(i)端数処理区分
                                                      numResultAmount);                   --(o)端数処理後の値
                                IF  blnRet = FALSE THEN
                                    numResultAmount  :=  recT_PJ_BUDGET_RESULT.NECESSARY_QTY * recM_PROC_GRP.STANDARD_COST * numRATE_PAY;
                                END IF; 
                                
                                 -- 予定_加工費
                                 numPl_COST_PROCESS      :=  numPl_COST_PROCESS     +   numResultAmount;
                            ELSE
                                ---作業系列内外作区分＝2:外作の時
                                
                                IF  recM_PROC_GRP.VEND_CD      IS  Null   THEN
                                    vc2ErrorCD :=  'AA02004';
                                    vc2Comment :=  null;
                                    -- エラー処理
                                    blnRet     :=  SubFncInsBudgetError(recM_PROC_GRP.PROC_CD);
                                    GOTO EXT00060B1;
                                END IF;

                                -- [外注単価][取引先][通貨]を下記の条件で検索
                                BEGIN
                                    SELECT /*+ RULE */
                                           SC.UNIT_COST,MV.CUR_CD,MV.EXCH_TYP,MV.ROUND_TYP,MC.DECIMAL_FIG
                                    INTO   numUNIT_COST,numCUR_CD,numEXCH_TYP,numROUND_TYP,numDECIMAL_FIG
                                    FROM   M_SBCNT_UNIT_COST  SC
                                         ,(SELECT MAX(EFF_PHASE_IN_DATE) as EFF_PHASE_IN_DATE
                                           FROM   M_SBCNT_UNIT_COST
                                           WHERE  COMPANY_CD         =  vc2CompyCd                          
                                           AND    VEND_CD            =  recM_PROC_GRP.VEND_CD
                                           AND    PLANT_CD           =  recM_PROC_GRP.PLANT_CD
                                           AND    ITEM_CD            =  recM_PROC_GRP.ITEM_CD
                                           AND    PROC_CD            =  recM_PROC_GRP.PROC_CD
                                           AND    EFF_PHASE_IN_DATE <=  recT_PJ_BUDGET_RESULT.DUE_DATE
                                           AND    SBCNT_SIZE        <=  recT_PJ_BUDGET_RESULT.NECESSARY_QTY
                                           )       SU
                                          ,M_VEND_CTRL        MV
                                          ,M_CUR              MC
                                    WHERE  SC.COMPANY_CD         =  vc2CompyCd                          
                                    AND    SC.VEND_CD            =  recM_PROC_GRP.VEND_CD
                                    AND    SC.PLANT_CD           =  recM_PROC_GRP.PLANT_CD
                                    AND    SC.ITEM_CD            =  recM_PROC_GRP.ITEM_CD
                                    AND    SC.PROC_CD            =  recM_PROC_GRP.PROC_CD
                                    AND    SC.EFF_PHASE_IN_DATE  =  SU.EFF_PHASE_IN_DATE
                                    AND    SC.SBCNT_SIZE        <=  recT_PJ_BUDGET_RESULT.NECESSARY_QTY
                                    AND    MV.COMPANY_CD         =  vc2CompyCd
                                    AND    MV.VEND_CD            =  SC.VEND_CD 
                                    AND    MC.CUR_CD             =  MV.CUR_CD
                                    ;
                                EXCEPTION
                                    WHEN NO_DATA_FOUND THEN
                                        DBMS_OUTPUT.PUT_LINE('-- M_SBCNT_UNIT_COST NOT FOUND 2 --------');
                                        vc2ErrorCD :=  'ZZ12004';
                                        vc2Comment :=  null;
                                        -- エラー処理
                                        blnRet     :=  SubFncInsBudgetError(recM_PROC_GRP.PROC_CD);
                                        GOTO EXT00060B1;
                                    WHEN OTHERS THEN
                                        RAISE;
                                END;
                                
                                --//為替レート取得する
                                BEGIN
                                    SELECT /*+ RULE */
                                           EXCH_RATE
                                    INTO   numEXCH_RATE
                                    FROM   M_EXCH_RATE MER,
                                          (SELECT MAX(EXCH_START_DATE) as EXCH_START_DATE
                                           FROM   M_EXCH_RATE
                                           WHERE  COMPANY_CD            =  vc2CompyCd              --自社コード
                                           AND    CUR_CD                =  numCUR_CD               --通貨コー
                                           AND    EXCH_TYP              =  numEXCH_TYP             --為替種別
                                           AND    EXCH_START_DATE      <=  nvl(recT_PJ_BUDGET_RESULT.DUE_DATE,recT_PJ_BUDGET_RESULT.PRD_DUE_DATE)    --要求手配日
                                           )           ER
                                    WHERE  MER.COMPANY_CD            =  vc2CompyCd              --自社コード
                                    AND    MER.CUR_CD                =  numCUR_CD               --通貨コー
                                    AND    MER.EXCH_TYP              =  numEXCH_TYP             --為替種別
                                    AND    MER.EXCH_START_DATE       =  ER.EXCH_START_DATE      --要求手配日
                                    ;
                                EXCEPTION
                                    WHEN NO_DATA_FOUND THEN
                                        vc2ErrorCD     :=  'KQ00038';
                                        vc2Comment     :=  null;
                                        -- エラー処理
                                        blnRet     :=  SubFncInsBudgetError(recM_PROC_GRP.PROC_CD);
                                        numEXCH_RATE   :=  0;        
                                    WHEN OTHERS THEN
                                        RAISE;
                                END;
                                
                                -- 費用計算（丸め）
                                blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                                      pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                                      recT_PJ_BUDGET_RESULT.NECESSARY_QTY * 
                                                      numUNIT_COST         *
                                                      numEXCH_RATE,                       --(i)端数処理前の値
                                                      4,                                  --(i)少数桁数
                                                      numROUND_TYP,                       --(i)端数処理区分
                                                      numResultAmount);                   --(o)端数処理後の値
                                IF  blnRet = FALSE THEN
                                    numResultAmount    :=  recT_PJ_BUDGET_RESULT.NECESSARY_QTY * numUNIT_COST *  numEXCH_RATE;
                                END IF; 
                                
                                -- 予定_外注費
                                numPl_COST_OUTSOUCE     :=  numPl_COST_OUTSOUCE    +   numResultAmount;
                            END IF;

                            <<EXT00060B1>>
                            NULL;

                        END LOOP;
                        
                        -- [作業系列]カーソルCLOSE
                        IF  numCountRec    =   0   THEN
                            vc2ErrorCD :=  APS_COM_M_PROC_GRP; -- 作業系列情報が存在しません。
                            vc2Comment :=  null;
                            -- 案件予算積上げエラー登録
                            blnRet :=  SubFncInsBudgetError(recM_PROC_GRP.PROC_CD);
                        END IF;
                        CLOSE curM_PROC_GRP;

                    ELSE
                        -- -- 作業系列別作業状態区分 ＝ 1:展開済み
                        
                        numCountRec :=  0;
                        -- [作業系列別仕掛]カーソルOPEN
                        BEGIN
                            OPEN curT_WORK_IN_PROC_BY_PROC(recT_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD);
                        EXCEPTION
                            WHEN OTHERS THEN
                                vc2Comment := SUBSTR(' 60:OPEN curM_PROC_GRP'       ||
                                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                                     1,256);
                                RAISE;
                        END;
                        
                        LOOP
                            -- [作業系列別仕掛]のカーソルFETCH
                            BEGIN
                                FETCH curT_WORK_IN_PROC_BY_PROC  INTO recT_WORK_IN_PROC_BY_PROC;
                            EXCEPTION
                                WHEN OTHERS THEN
                                    -- カーソルFETCH失敗
                                    vc2Comment  := SUBSTR(' 60:FETCH curT_PJ_BUDGET_RESULT'      ||
                                                          ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                          ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                                          1,256);
                                    RAISE;
                            END;
                            
                            -- 製品構成カーソルEND
                            EXIT WHEN  curT_WORK_IN_PROC_BY_PROC%NOTFOUND;
                        
                            IF  recT_WORK_IN_PROC_BY_PROC.OUTSIDE_TYP  =   1   THEN
                                ---作業系列内外作区分＝1:内作の時
                                
                                -- 標準工数=0
                                IF  recT_WORK_IN_PROC_BY_PROC.STANDARD_COST   =   0  THEN
                                    vc2ErrorCD :=  'KM00062';
                                    vc2Comment :=  'PROC_CD ='||recT_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD;
                                    -- エラー処理
                                    blnRet :=  SubFncInsBudgetError(recT_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD);   
                                    GOTO EXT00060B2;
                                END IF;
                                -- 作業区が空白
                                IF  recT_WORK_IN_PROC_BY_PROC.WS_CD    Is  Null  THEN
                                    vc2ErrorCD :=  'AA02005';
                                    vc2Comment :=  'PROC_CD ='||recT_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD;
                                    -- エラー処理
                                    blnRet :=  SubFncInsBudgetError(recT_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD);    
                                    GOTO EXT00060B2;
                                END IF;
                                -- [作業区]を下記の条件で検索
                                BEGIN                                    SELECT /*+ RULE */
                                           WS_CLASS_01_NAME
                                    INTO   vc2CLASS_01_NAME
                                    FROM   M_WS       WS
                                          ,M_WS_CLASS WC
                                          ,M_CLASS    CL
                                    WHERE  WS.WS_CD     =  recT_WORK_IN_PROC_BY_PROC.WS_CD
                                    AND    WC.WS_CD     =  WS.WS_CD
                                    AND    CL.CLASS_CD1 =  '40' 
                                    AND    CL.CLASS_CD2 =  '01'  
                                    AND    CL.CLASS_CD3 =  WC.WS_CLASS_01_CD       
                                    ;
                                EXCEPTION
                                    WHEN NO_DATA_FOUND THEN
                                        vc2CLASS_01_NAME  :=  '*';
                                    WHEN OTHERS THEN
                                        RAISE;
                                END;
                                -- 値が数値以外の対応
                                BEGIN
                                    numRATE_PAY    :=  TO_NUMBER(vc2CLASS_01_NAME);
                                EXCEPTION
                                    WHEN OTHERS THEN
                                       numRATE_PAY    :=  TO_NUMBER(numPjPayRate);
                                END;

                                
                                IF  recT_WORK_IN_PROC_BY_PROC.WORK_STS_TYP    IN  (1 ,2)  THEN
                                    -- 作業系列別作業状態区分＝ 1:未指示or 2:指示済み
                                    
                                    blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                                          recT_WORK_IN_PROC_BY_PROC.OPR_INST_QTY  *
                                                          recT_WORK_IN_PROC_BY_PROC.STANDARD_COST * 
                                                          numRATE_PAY,                        --(i)端数処理前の値
                                                          4,                                  --(i)少数桁数
                                                          numROUND_TYP,                       --(i)端数処理区分
                                                          numResultAmount);                   --(o)端数処理後の値
                                    IF  blnRet = FALSE THEN
                                        numResultAmount   :=  recM_PROC_GRP.STANDARD_COST * numRATE_PAY;
                                    END IF; 
                                    
                                    -- 予定_加工費
                                    numPl_COST_PROCESS      :=  numPl_COST_PROCESS     +   numResultAmount;
                                     
                                ELSE
                                    -- 作業系列別作業状態区分＝ 9:作業完了

                                    -- [作業実績]カーソルOPEN
                                    BEGIN
                                        OPEN curT_OPR_RSLT(recT_WORK_IN_PROC_BY_PROC.OPR_INST_CD);
                                    EXCEPTION
                                        WHEN OTHERS THEN
                                            vc2Comment := SUBSTR(' 60:OPEN curT_OPR_RSLT'       ||
                                                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                                                 1,256);
                                            RAISE;
                                    END;
                        
                                    LOOP
                                        -- [作業実績]のカーソルFETCH
                                        BEGIN
                                            FETCH curT_OPR_RSLT  INTO recT_OPR_RSLT;
                                        EXCEPTION
                                            WHEN OTHERS THEN
                                                -- カーソルFETCH失敗
                                                vc2Comment  := SUBSTR(' 60:FETCH curT_OPR_RSLT'      ||
                                                                      ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                                      ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                                                      1,256);
                                                RAISE;
                                        END;
                            
                                        -- 作業実績カーソルEND
                                        EXIT WHEN  curT_OPR_RSLT%NOTFOUND;
                            
                                        -- [作業区]を下記の条件で検索
                                        BEGIN
                                            SELECT /*+ RULE */
                                                   WS_CLASS_01_NAME
                                            INTO   vc2CLASS_01_NAME
                                            FROM   M_WS       WS
                                                  ,M_WS_CLASS WC
                                                  ,M_CLASS    CL
                                            WHERE  WS.WS_CD     =  recT_OPR_RSLT.WS_CD
                                            AND    WC.WS_CD     =  WS.WS_CD
                                            AND    CL.CLASS_CD1 =  '40' 
                                            AND    CL.CLASS_CD2 =  '01'  
                                            AND    CL.CLASS_CD3 =  WC.WS_CLASS_01_CD       
                                            ;
                                        EXCEPTION
                                            WHEN NO_DATA_FOUND THEN
                                                vc2CLASS_01_NAME  :=  '*';
                                            WHEN OTHERS THEN
                                                RAISE;
                                        END;
                                        -- 値が数値以外の対応
                                        BEGIN
                                            numRATE_PAY2    :=  TO_NUMBER(vc2CLASS_01_NAME);
                                        EXCEPTION
                                            WHEN OTHERS THEN
                                                numRATE_PAY2    :=  numRATE_PAY;
                                        END;
                            
                                        numPRE_ARRANGEMENT_TIME := recT_OPR_RSLT.PRE_ARRANGEMENT_TIME;
                                        numOPR_TIME_UNIT_TYP    := recT_OPR_RSLT.OPR_TIME_UNIT_TYP;
                                        numOPR_TIME             := recT_OPR_RSLT.OPR_TIME;
                            
                                        -- 作業実績の実績作業時間=0
                                        IF  (numPRE_ARRANGEMENT_TIME + numOPR_TIME_UNIT_TYP + numOPR_TIME) = 0 THEN
                                            vc2ErrorCD :=  'KM00063';
                                            vc2Comment :=  'OPR_INST_CD ='||recT_WORK_IN_PROC_BY_PROC.OPR_INST_CD;
                                            -- エラー処理
                                            blnRet :=  SubFncInsBudgetError(recT_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD);   
                                            GOTO EXT00060B4;
                                        END IF;

                                        blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                                              (numPRE_ARRANGEMENT_TIME + numOPR_TIME_UNIT_TYP + numOPR_TIME) *
                                                              numRATE_PAY2,                       --(i)端数処理前の値
                                                              4,                                  --(i)少数桁数
                                                              numROUND_TYP,                       --(i)端数処理区分
                                                              numResultAmount);                   --(o)端数処理後の値
                                        IF  blnRet = FALSE THEN
                                            numResultAmount   :=  0;
                                        END IF; 
                                    
                                        -- 実績_加工費
                                        numRs_COST_PROCESS      :=  numRs_COST_PROCESS     +   numResultAmount;                            

                                       <<EXT00060B4>>
                                       NULL;
                            
                                    END LOOP;
                                    
                                    -- 作業実績のカーソルCLOSE
                                    CLOSE curT_OPR_RSLT;

                                END IF;                                
                            ELSE
                                ---作業系列内外作区分＝2:外作の時      
                                /*  作業系列別作業状態区分を判断する */                         
                                IF  recT_WORK_IN_PROC_BY_PROC.WORK_STS_TYP    =   1    THEN
                                    /*  指示確定していない場合 */

                                    -- [外注単価][取引先][通貨]を下記の条件で検索
                                    BEGIN
                                        SELECT /*+ RULE */
                                               SC.UNIT_COST,MV.CUR_CD,MV.EXCH_TYP,MV.ROUND_TYP,MC.DECIMAL_FIG
                                        INTO   numUNIT_COST,numCUR_CD,numEXCH_TYP,numROUND_TYP,numDECIMAL_FIG
                                        FROM   M_SBCNT_UNIT_COST  SC
                                             ,(SELECT MAX(EFF_PHASE_IN_DATE) as EFF_PHASE_IN_DATE
                                               FROM   M_SBCNT_UNIT_COST
                                               WHERE  COMPANY_CD         =  vc2CompyCd                          
                                               AND    VEND_CD            =  recT_WORK_IN_PROC_BY_PROC.VEND_CD
                                               AND    PLANT_CD           =  recT_WORK_IN_PROC_BY_PROC.PLANT_CD
                                               AND    ITEM_CD            =  recT_WORK_IN_PROC_BY_PROC.ITEM_CD
                                               AND    PROC_CD            =  recT_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD
                                               AND    EFF_PHASE_IN_DATE <=  recT_WORK_IN_PROC_BY_PROC.OPR_INST_START_DATE
                                               AND    SBCNT_SIZE        <=  recT_WORK_IN_PROC_BY_PROC.OPR_INST_QTY
                                              )       SU
                                             ,M_VEND_CTRL        MV
                                             ,M_CUR              MC
                                        WHERE  SC.COMPANY_CD         =  vc2CompyCd                          
                                        AND    SC.VEND_CD            =  recT_WORK_IN_PROC_BY_PROC.VEND_CD
                                        AND    SC.PLANT_CD           =  recT_WORK_IN_PROC_BY_PROC.PLANT_CD
                                        AND    SC.ITEM_CD            =  recT_WORK_IN_PROC_BY_PROC.ITEM_CD
                                        AND    SC.PROC_CD            =  recT_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD
                                        AND    SC.EFF_PHASE_IN_DATE  =  SU.EFF_PHASE_IN_DATE
                                        AND    SC.SBCNT_SIZE        <=  recT_WORK_IN_PROC_BY_PROC.OPR_INST_QTY
                                        AND    MV.COMPANY_CD         =  vc2CompyCd
                                        AND    MV.VEND_CD            =  SC.VEND_CD 
                                        AND    MC.CUR_CD             =  MV.CUR_CD
                                        ;
                                    EXCEPTION
                                        WHEN NO_DATA_FOUND THEN
                                            DBMS_OUTPUT.PUT_LINE('-- M_SBCNT_UNIT_COST NOT FOUND 3 --------');
                                            vc2ErrorCD :=  'ZZ12004';
                                            vc2Comment :=  null;
                                            -- エラー処理
                                            blnRet :=  SubFncInsBudgetError(recT_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD);
                                            GOTO  EXT00060B2;
                                        WHEN OTHERS THEN
                                            RAISE;
                                    END;
                                    
                                    --//為替レート取得する
                                    BEGIN
                                        SELECT /*+ RULE */
                                               EXCH_RATE
                                        INTO   numEXCH_RATE
                                        FROM   M_EXCH_RATE MER,
                                              (SELECT MAX(EXCH_START_DATE) as EXCH_START_DATE
                                               FROM   M_EXCH_RATE
                                               WHERE  COMPANY_CD            =  vc2CompyCd              --自社コード
                                               AND    CUR_CD                =  numCUR_CD               --通貨コー
                                               AND    EXCH_TYP              =  numEXCH_TYP             --為替種別
                                               AND    EXCH_START_DATE      <=  recT_WORK_IN_PROC_BY_ITEM.WORK_ODR_DLV_DATE    --要求手配日
                                               )           ER
                                        WHERE  MER.COMPANY_CD            =  vc2CompyCd              --自社コード
                                        AND    MER.CUR_CD                =  numCUR_CD               --通貨コー
                                        AND    MER.EXCH_TYP              =  numEXCH_TYP             --為替種別
                                        AND    MER.EXCH_START_DATE       =  ER.EXCH_START_DATE      --要求手配日
                                        ;
                                    EXCEPTION
                                        WHEN NO_DATA_FOUND THEN
                                            vc2ErrorCD     :=  'KQ00038';
                                            vc2Comment     :=  null;
                                            numEXCH_RATE   :=  0;        
                                        WHEN OTHERS THEN
                                            RAISE;
                                    END;
                                    
                                    -- 費用計算（丸め）
                                    blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                                          recT_WORK_IN_PROC_BY_PROC.OPR_INST_QTY * 
                                                          numUNIT_COST         *
                                                          numEXCH_RATE,                       --(i)端数処理前の値        --(i)端数処理前の値
                                                          numDECIMAL_FIG,                     --(i)少数桁数
                                                          numROUND_TYP,                       --(i)端数処理区分
                                                          numResultAmount);                   --(o)端数処理後の値
                                    IF  blnRet = FALSE THEN
                                        numResultAmount   := recT_PJ_BUDGET_RESULT.NECESSARY_QTY * numUNIT_COST * numEXCH_RATE;
                                    END IF; 
                                    
                                    -- 予定_外注費
                                    numPl_COST_OUTSOUCE     :=  numPl_COST_OUTSOUCE    +   numResultAmount;
                                ELSE
                                    -- [発注残]［取引先］を下記の条件で検索
                                    BEGIN
                                        SELECT /*+ RULE */
                                               PU.PUCH_ODR_CD,PU.PUCH_ODR_STS_TYP,PU.PUCH_ODR_QTY,PU.UNIT_COST,MV.CUR_CD,MV.EXCH_TYP,MV.ROUND_TYP,MC.DECIMAL_FIG
                                        INTO   numPUCH_ODR_CD,numPUCH_ODR_STS_TYP,numPUCH_ODR_QTY,numUNIT_COST,numCUR_CD,numEXCH_TYP,numROUND_TYP,numDECIMAL_FIG
                                        FROM   T_RLSD_PUCH_ODR PU
                                              ,M_VEND_CTRL     MV
                                              ,M_CUR           MC
                                        WHERE  PU.WORK_ODR_CD      =  recT_WORK_IN_PROC_BY_PROC.WORK_ODR_CD
                                        AND    PU.WORK_IN_PROC_CD  =  recT_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD
                                        AND    MV.COMPANY_CD       =  vc2CompyCd       
                                        AND    MV.VEND_CD          =  PU.VEND_CD
                                        AND    MC.CUR_CD           =  MV.CUR_CD
                                        ;
                                    EXCEPTION
                                        WHEN NO_DATA_FOUND THEN
                                            vc2ErrorCD :=  'KQ20187';
                                            vc2Comment :=  null;
                                            -- エラー処理
                                            blnRet :=  SubFncInsBudgetError(recT_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD);
                                            GOTO  EXT00060B2;
                                        WHEN OTHERS THEN
                                            RAISE;
                                    END;

                                    -- [受入実績]の検索
                                    BEGIN
                                        SELECT /*+ RULE */
                                               SUM(ACPT_QTY),SUM(PUCH_ODR_AMOUNT)
                                        INTO   numACPT_QTY,numPUCH_ODR_AMOUNT
                                        FROM T_ACPT_RSLT
                                        WHERE PUCH_ODR_CD    =   numPUCH_ODR_CD
                                        Group BY PUCH_ODR_CD
                                        ;
                                    EXCEPTION
                                        WHEN NO_DATA_FOUND THEN
                                            numACPT_QTY           :=  0;
                                            numPUCH_ODR_AMOUNT    :=  0;
                                        WHEN OTHERS THEN
                                            RAISE;
                                    END;
                                    
                                    --//為替レート取得する
                                    BEGIN
                                        SELECT /*+ RULE */
                                               EXCH_RATE
                                        INTO   numEXCH_RATE
                                        FROM   M_EXCH_RATE MER,
                                              (SELECT MAX(EXCH_START_DATE) as EXCH_START_DATE
                                               FROM   M_EXCH_RATE
                                               WHERE  COMPANY_CD            =  vc2CompyCd              --自社コード
                                               AND    CUR_CD                =  numCUR_CD               --通貨コー
                                               AND    EXCH_TYP              =  numEXCH_TYP             --為替種別
                                               AND    EXCH_START_DATE      <=  recT_WORK_IN_PROC_BY_ITEM.WORK_ODR_DLV_DATE    --要求手配日
                                               )           ER
                                        WHERE  MER.COMPANY_CD            =  vc2CompyCd              --自社コード
                                        AND    MER.CUR_CD                =  numCUR_CD               --通貨コー
                                        AND    MER.EXCH_TYP              =  numEXCH_TYP             --為替種別
                                        AND    MER.EXCH_START_DATE       =  ER.EXCH_START_DATE      --要求手配日
                                        ;
                                    EXCEPTION
                                        WHEN NO_DATA_FOUND THEN
                                            vc2ErrorCD     :=  'KQ00038';
                                            vc2Comment     :=  null;
                                            numEXCH_RATE   :=  0;        
                                        WHEN OTHERS THEN
                                            RAISE;
                                    END;

                                    --各費用計算
                                    -- 実績_外注費
                                    blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                                          numPUCH_ODR_AMOUNT   *
                                                          numEXCH_RATE,                       --(i)端数処理前の値
                                                          numDECIMAL_FIG,                     --(i)少数桁数
                                                          numROUND_TYP,                       --(i)端数処理区分
                                                          numResultAmount);                   --(o)端数処理後の値
                                    numRs_COST_OUTSOUCE    :=   numRs_COST_OUTSOUCE    +   numResultAmount;

                                    -- 予定_外注費
                                    IF  numPUCH_ODR_QTY   <  numACPT_QTY THEN
                                        numPl_COST_OUTSOUCE     :=  numPl_COST_OUTSOUCE  +   0;
                                    ELSIF numPUCH_ODR_STS_TYP  =  9 THEN
                                        --受入完了時は０とする。
                                        numPl_COST_OUTSOUCE     :=  numPl_COST_OUTSOUCE  +   0;

                                    ELSE
                                        
                                        blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                                              (numPUCH_ODR_QTY -  numACPT_QTY) * 
                                                              numUNIT_COST * 
                                                              numEXCH_RATE,                       --(i)端数処理前の値
                                                              numDECIMAL_FIG,                     --(i)少数桁数
                                                              numROUND_TYP,                       --(i)端数処理区分
                                                              numResultAmount);                   --(o)端数処理後の値
                                        IF  blnRet = FALSE THEN
                                            numResultAmount   :=  0;
                                        END IF; 
                                        
                                        numPl_COST_OUTSOUCE     :=  numPl_COST_OUTSOUCE    +   numResultAmount;
                                    END IF;

                                END IF;
                            END IF;
                            
                           <<EXT00060B2>>
                           NULL;

                        END LOOP;
                        
                        -- 作業系列別仕掛のカーソルCLOSE
                        CLOSE curT_WORK_IN_PROC_BY_PROC;
                        
                    END IF;
                    
                END LOOP;
                
                -- 品目別仕掛のカーソルCLOSE
                CLOSE curT_WORK_IN_PROC_BY_ITEM;
                
                
                /*  外作の受入実績を集計 */
                -- 発注残のカーソルOPEN
                BEGIN
                    OPEN curT_RLSD_PUCH_ODR(recT_PJ_BUDGET_RESULT.OD_NO);
                EXCEPTION
                    WHEN OTHERS THEN
                        vc2Comment := SUBSTR(' 60:OPEN curT_RLSD_PUCH_ODR'          ||
                                             ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                             ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                             1,256);
                        RAISE;
                END;
                
                LOOP
                    -- 発注残のカーソルFETCH
                    BEGIN
                        FETCH curT_RLSD_PUCH_ODR  INTO recT_RLSD_PUCH_ODR;
                    EXCEPTION
                        WHEN OTHERS THEN
                            -- カーソルFETCH失敗
                            vc2Comment  := SUBSTR(' 60:FETCH curT_WORK_IN_PROC_BY_ITEM'  ||
                                                  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                                  1,256);
                            RAISE;
                    END;
                    -- 発注残カーソルEND
                    EXIT WHEN  curT_RLSD_PUCH_ODR%NOTFOUND;

                    -- [発注残].“取引先”がNULLの時エラー
                    IF  recT_RLSD_PUCH_ODR.VEND_CD     IS Null THEN
                        vc2ErrorCD :=  'AC50520';
                        vc2Comment :=  null;
                        -- エラー処理
                        blnRet     :=  SubFncInsBudgetError('');
                        GOTO EXT00060B3;
                    END IF;
                    vc2VEND_CD     :=  recT_RLSD_PUCH_ODR.VEND_CD;

                    --金額の為に為替レートを先に取得する
                    --//[通貨]を取得する
                    BEGIN
                        SELECT /*+ RULE */
                               DECIMAL_FIG
                        INTO   numDECIMAL_FIG
                        FROM   M_CUR
                        WHERE  CUR_CD                =  recT_RLSD_PUCH_ODR.CUR_CD               --通貨コー
                        ;
                    EXCEPTION
                        WHEN NO_DATA_FOUND THEN
                            vc2ErrorCD     :=  'ZZ02023';
                            vc2Comment     :=  null;
                            numEXCH_RATE   :=  0;      
                            -- エラー処理
                            blnRet     :=  SubFncInsBudgetError(''); 
                            GOTO EXT00060B3;
                        WHEN OTHERS THEN
                            RAISE;
                    END;

                    --//為替レート取得する
                    BEGIN
                        SELECT /*+ RULE */
                               EXCH_RATE
                        INTO   numEXCH_RATE
                        FROM   M_EXCH_RATE MER,
                              (SELECT MAX(EXCH_START_DATE) as EXCH_START_DATE
                               FROM   M_EXCH_RATE
                               WHERE  COMPANY_CD            =  vc2CompyCd                              --自社コード
                               AND    CUR_CD                =  recT_RLSD_PUCH_ODR.CUR_CD               --通貨コー
                               AND    EXCH_TYP              =  recT_RLSD_PUCH_ODR.EXCH_TYP             --為替種別
                               AND    EXCH_START_DATE      <=  recT_RLSD_PUCH_ODR.PUCH_ODR_DLV_DATE    --要求手配日
                               )           ER
                        WHERE  MER.COMPANY_CD            =  vc2CompyCd                              --自社コード
                        AND    MER.CUR_CD                =  recT_RLSD_PUCH_ODR.CUR_CD               --通貨コー
                        AND    MER.EXCH_TYP              =  recT_RLSD_PUCH_ODR.EXCH_TYP             --為替種別
                        AND    MER.EXCH_START_DATE       =  ER.EXCH_START_DATE                      --要求手配日
                        ;
                    EXCEPTION
                        WHEN NO_DATA_FOUND THEN
                            vc2ErrorCD     :=  'KQ00038';
                            vc2Comment     :=  null;
                            numEXCH_RATE   :=  0;      
                            -- エラー処理
                            blnRet     :=  SubFncInsBudgetError('');  
                        WHEN OTHERS THEN
                            RAISE;
                    END;
                    
                    
                    IF  recT_RLSD_PUCH_ODR.PUCH_ODR_STS_TYP =   1   THEN
                        -- 発注状態区分” ＝ 1:未指示
                        
                        -- [購入単価]を下記の条件で検索
                        BEGIN
                            SELECT /*+ RULE */
                                   PC.UNIT_COST
                            INTO   numUNIT_COST
                            FROM   M_PUCH_UNIT_COST   PC
                                  ,(SELECT MAX(EFF_PHASE_IN_DATE) as EFF_PHASE_IN_DATE
                                    FROM   M_PUCH_UNIT_COST
                                    WHERE  COMPANY_CD         =  vc2CompyCd                          
                                    AND    VEND_CD            =  recT_RLSD_PUCH_ODR.VEND_CD
                                    AND    PLANT_CD           =  recT_RLSD_PUCH_ODR.PLANT_CD
                                    AND    ITEM_CD            =  recT_RLSD_PUCH_ODR.ITEM_CD
                                    AND    EFF_PHASE_IN_DATE <=  recT_RLSD_PUCH_ODR.PUCH_ODR_DLV_DATE
                                    AND    PUCH_SIZE         <=  recT_RLSD_PUCH_ODR.PUCH_ODR_QTY
                                    )      PU
                                  ,M_VEND_CTRL        VC
                            WHERE  PC.COMPANY_CD         =  vc2CompyCd                          
                            AND    PC.VEND_CD            =  recT_RLSD_PUCH_ODR.VEND_CD
                            AND    PC.PLANT_CD           =  recT_RLSD_PUCH_ODR.PLANT_CD
                            AND    PC.ITEM_CD            =  recT_RLSD_PUCH_ODR.ITEM_CD
                            AND    PC.EFF_PHASE_IN_DATE  =  PU.EFF_PHASE_IN_DATE
                            AND    PC.PUCH_SIZE         <=  recT_RLSD_PUCH_ODR.PUCH_ODR_QTY
                            AND    VC.COMPANY_CD         =  vc2CompyCd
                            AND    VC.VEND_CD            =  PC.VEND_CD 
                            AND    rownum               <=  1
                            ORDER BY PC.EFF_PHASE_IN_DATE DESC,PC.PUCH_SIZE DESC
                            ;
                        EXCEPTION
                            WHEN NO_DATA_FOUND THEN
                                vc2ErrorCD :=  'AC50515';
                                vc2Comment :=  null;
                                -- エラー処理
                                blnRet     :=  SubFncInsBudgetError('');
                                GOTO EXT00060B3;
                            WHEN OTHERS THEN
                                RAISE;
                        END;

                        -- 費用計算（丸め）
                        blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                              recT_RLSD_PUCH_ODR.PUCH_ODR_QTY  *  
                                              numUNIT_COST  *  
                                              numEXCH_RATE,                       --(i)端数処理前の値
                                              numDECIMAL_FIG,                     --(i)少数桁数
                                              numROUND_TYP,                       --(i)端数処理区分
                                              numResultAmount);                   --(o)端数処理後の値
                        IF  blnRet = FALSE THEN
                            numResultAmount   :=  recT_RLSD_PUCH_ODR.PUCH_ODR_QTY  *  numUNIT_COST  *  numEXCH_RATE;
                        END IF; 
                        
                        -- 予定_材料費
                        numPl_COST_MATERIAL   :=  numPl_COST_MATERIAL    +   numResultAmount;

                    ELSE
                        -- 発注状態区分” ＝ 2:指示済み  9:受入完了

                        -- 受入実績のを検索う
                        BEGIN
                            SELECT /*+ RULE */
                                   SUM(ACPT_QTY),SUM(PUCH_ODR_AMOUNT)
                            INTO   numACPT_QTY,numPUCH_ODR_AMOUNT
                            FROM T_ACPT_RSLT
                            WHERE PUCH_ODR_CD    =   recT_RLSD_PUCH_ODR.PUCH_ODR_CD
                            Group BY PUCH_ODR_CD
                            ;
                        EXCEPTION
                            WHEN NO_DATA_FOUND THEN
                                numACPT_QTY           :=  0;
                                numPUCH_ODR_AMOUNT    :=  0;
                            WHEN OTHERS THEN
                                RAISE;
                        END;
                        
                        --各費用計算
                        -- 実績_材料費
                        blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                              numPUCH_ODR_AMOUNT   *  
                                              numEXCH_RATE,                       --(i)端数処理前の値
                                              numDECIMAL_FIG,                     --(i)少数桁数
                                              recT_RLSD_PUCH_ODR.ROUND_TYP,       --(i)端数処理区分
                                              numResultAmount);                   --(o)端数処理後の値
                        numRs_COST_MATERIAL    :=   numRs_COST_MATERIAL    +   numResultAmount;

                        -- 予定_材料費
                        IF  recT_RLSD_PUCH_ODR.PUCH_ODR_QTY <=  numACPT_QTY THEN
                            numPl_COST_MATERIAL     :=  numPl_COST_MATERIAL  +   0;
                        ELSIF numPUCH_ODR_STS_TYP  =  9 THEN
                              --受入完了時は０とする。
                            numPl_COST_MATERIAL     :=  numPl_COST_MATERIAL  +   0;
                        ELSE
                            
                            blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                                  pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                                  (recT_RLSD_PUCH_ODR.PUCH_ODR_QTY -  numACPT_QTY) * 
                                                  recT_RLSD_PUCH_ODR.UNIT_COST *  
                                                  numEXCH_RATE,                       --(i)端数処理前の値
                                                  numDECIMAL_FIG,                     --(i)少数桁数
                                                  recT_RLSD_PUCH_ODR.ROUND_TYP,       --(i)端数処理区分
                                                  numResultAmount);                   --(o)端数処理後の値
                            IF  blnRet = FALSE THEN
                                numResultAmount   :=  0;
                            END IF; 
                            

                            -- 予定_材料費
                            numPl_COST_MATERIAL   :=  numPl_COST_MATERIAL    +   numResultAmount;
                        END IF;

                    END IF;

                    <<EXT00060B3>>
                    NULL;

                END LOOP;
                -- 発注残のカーソルCLOSE
                CLOSE curT_RLSD_PUCH_ODR;

                <<EXT00060B>>
                NULL;
            END CASE;


            /* 案件予算積上明細の手配残、消化実績の更新 */
            -- 案件予算積上明細の更新
            BEGIN
                UPDATE T_PJ_BUDGET_DETAIL
                SET VEND_CD            = vc2VEND_CD
                  , ODR_COST_MATERIAL  = numPl_COST_MATERIAL
                  , ODR_COST_PROCESS   = numPl_COST_PROCESS 
                  , ODR_COST_OUTSOUCE  = numPl_COST_OUTSOUCE
                  , CMP_COST_MATERIAL  = numRs_COST_MATERIAL
                  , CMP_COST_PROCESS   = numRs_COST_PROCESS 
                  , CMP_COST_OUTSOUCE  = numRs_COST_OUTSOUCE
                  , EXP_COST_MATERIAL  = numPl_COST_MATERIAL   +   numRs_COST_MATERIAL
                  , EXP_COST_PROCESS   = numPl_COST_PROCESS    +   numRs_COST_PROCESS 
                  , EXP_COST_OUTSOUCE  = numPl_COST_OUTSOUCE   +   numRs_COST_OUTSOUCE
                  , ONEROUS_CONS_FLG   = numONEROUS_CONS_FLG
                  , BUDGET_STACK_TYP   = numBUDGET_STACK_TYP
                  , UPDATED_DATE       = SYSDATE
                  , MODIFY_COUNT       = MODIFY_COUNT + 1
                WHERE 
                    T_PJ_BUDGET_DETAIL.PJ_BUDGET_DETAIL_NO   = vc2PJBuDgetDetailNo
                AND T_PJ_BUDGET_DETAIL.SEQNO                 = recT_PJ_BUDGET_RESULT.SEQNO
                ;
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment := SUBSTR(' UPDATE T_PJ_BUDGET_DETAIL'   ||
                                         ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                         ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                         1,256);
                    RAISE excOTHER_ERR;
            END;

        END LOOP;
        -- 案件予算積上げ明細のカーソルCLOSE
        CLOSE curT_PJ_BUDGET_RESULT;
    ELSE
        -- 引当在庫区分”＝2:製番）の時
       
        -- 予算 --
        numPl_COST_SERVICE     :=  0;      -- 役務費
        -- 実績 --
        numRs_COST_SERVICE     :=  0;      -- 役務費

        blnRet    :=  TRUE;
        -- 役務実績を検索う
        BEGIN
            SELECT /*+ RULE */
                   WORK_TIME
            INTO   numWORK_TIME
            FROM   T_SERVICE
            WHERE  ODR_NO        =   pvc2OdrNO;   -- 受注番号
        EXCEPTION
            WHEN NO_DATA_FOUND THEN
                blnRet    :=  FALSE;
            WHEN OTHERS THEN
                RAISE;
        END;
        
        IF  blnRet    THEN
            /* 丸め処理を行う */
            blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                  pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                  numWORK_TIME * numPjPayRate,  --(i)端数処理前の値
                                  4,                            --(i)少数桁数
                                  numPjRoundTyp,                --(i)端数処理区分
                                  numResultAmount);             --(o)端数処理後の値
            IF blnRet = FALSE THEN
                numResultAmount   :=  numWORK_TIME * numRATE_PAY;
            END IF;
            /* 丸めの結果を発注金額に反映する */
            numRs_COST_SERVICE    :=  numResultAmount;
        ELSE
            numPl_COST_SERVICE    :=  recT_ESTIMATE_DETAL.ES_COST_SERVICE;      -- 見積予算  役務費
        END IF;
        
        /* 案件予算積上明細の手配残、消化実績の更新 */
        -- 仕入先年間内示情報の更新
        BEGIN
            UPDATE T_PJ_BUDGET_DETAIL
            SET ODR_COST_SERVICE   = numPl_COST_SERVICE               
              , CMP_COST_SERVICE   = numRs_COST_SERVICE 
              , EXP_COST_SERVICE   = numPl_COST_SERVICE    +   numRs_COST_SERVICE 
              , BUDGET_STACK_TYP   = 1
              , UPDATED_DATE       = SYSDATE
              , MODIFY_COUNT       = MODIFY_COUNT + 1
            WHERE 
                T_PJ_BUDGET_DETAIL.PJ_BUDGET_DETAIL_NO   = vc2PJBuDgetDetailNo
            AND T_PJ_BUDGET_DETAIL.SEQNO                 = numMaxSeqNO
            ;
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment := SUBSTR(' 60:UPDATE T_PJ_BUDGET_DETAIL'     ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                     1,256);
                RAISE excOTHER_ERR;
        END;
    END IF;
/*------------------------------------------------------------
'  予算積上げ処理
-------------------------------------------------------------*/
vc2RunChkComment := '●●●●通過 00070';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment||'----------'||TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
    
    datTOTAL_DATE   :=   sysdate;

    -- [案件予算積上明細]を集計検索
    BEGIN
        SELECT /*+ RULE */
               SUM(ODR_COST_MATERIAL *  ALC_STOCK_RATE) AS  ODR_COST_MATERIAL
              ,SUM(ODR_COST_PROCESS  *  ALC_STOCK_RATE) AS  ODR_COST_PROCESS
              ,SUM(ODR_COST_OUTSOUCE *  ALC_STOCK_RATE) AS  ODR_COST_OUTSOUCE
              ,SUM(ODR_COST_SERVICE  *  ALC_STOCK_RATE) AS  ODR_COST_SERVICE
              ,SUM(CMP_COST_MATERIAL *  ALC_STOCK_RATE) AS  CMP_COST_MATERIAL
              ,SUM(CMP_COST_PROCESS  *  ALC_STOCK_RATE) AS  CMP_COST_PROCESS
              ,SUM(CMP_COST_OUTSOUCE *  ALC_STOCK_RATE) AS  CMP_COST_OUTSOUCE
              ,SUM(CMP_COST_SERVICE  *  ALC_STOCK_RATE) AS  CMP_COST_SERVICE
        INTO   numPl_COST_MATERIAL
              ,numPl_COST_PROCESS 
              ,numPl_COST_OUTSOUCE
              ,numPl_COST_SERVICE 
              ,numRs_COST_MATERIAL
              ,numRs_COST_PROCESS 
              ,numRs_COST_OUTSOUCE
              ,numRs_COST_SERVICE  
        FROM   T_PJ_BUDGET_DETAIL
        WHERE  PJ_BUDGET_DETAIL_NO        =  vc2PJBuDgetDetailNo  --案件予算積上明細番号
        AND    BUDGET_STACK_TYP           =  1                    --予算積上区分
        GROUP BY PJ_BUDGET_DETAIL_NO
        ;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            numPRE_ARRANGEMENT_TIME :=  0;
            numOPR_TIME_UNIT_TYP    :=  0;
            numOPR_TIME             :=  0;
        WHEN OTHERS THEN
            RAISE;
    END;
    
    CASE
    /* 見積に紐付く品目がMRP品の時 */
    WHEN (recT_PJ_ODR_ALC.ESTIMATE_TYPE  =   1)  AND (recT_ODR_CTL.MRP_ODR_TYP IN  (4 ,5 ,6 ,7))  THEN
    
        BEGIN
            INSERT INTO T_PJ_COST(
                    PROJECT_CD                --  1 案件番号
                   ,ESTIMATE_NO               --  2 見積番号
                   ,DETAL_NO                  --  3 明細番号
                   ,TOTAL_DATE                --  4 集計日時
                   ,ODR_NO                    --  5 受注番号
                   ,ITEM_CD                   --  6 品目番号
                   ,ODR_QTY                   --  7 受注数量
                   ,COMP_QTY                  --  8 完成数
                   ,COST_PROGRESS             --  9 費用進捗
                   ,CMP_COST_MATERIAL         -- 10 消化実績  材料費
                   ,CMP_COST_PROCESS          -- 11 消化実績  加工費
                   ,CMP_COST_OUTSOUCE         -- 12 消化実績  外注費
                   ,CMP_COST_SERVICE          -- 13 消化実績  役務費
                   ,EXP_COST_MATERIAL         -- 14 落着見込  材料費
                   ,EXP_COST_PROCESS          -- 15 落着見込  加工費
                   ,EXP_COST_OUTSOUCE         -- 16 落着見込  外注費
                   ,EXP_COST_SERVICE          -- 17 落着見込  役務費
                   ,CREATED_DATE              -- 22 作成日
                   ,CREATED_BY                -- 23 作成者
                   ,CREATED_PRG_NM            -- 24 作成プログラム名
                   ,UPDATED_DATE              -- 25 更新日
                   ,UPDATED_BY                -- 26 更新者
                   ,UPDATED_PRG_NM            -- 27 更新プログラム名
                   ,MODIFY_COUNT              -- 28 更新数
            ) VALUES (
                    pvc2ProjectCd                              --  1 案件番号
                   ,pvc2EstimateNo                             --  2 見積番号
                   ,pvc2DetalNo                                --  3 明細番号
                   ,datTOTAL_DATE                              --  4 集計日時
                   ,pvc2OdrNO                                  --  5 受注番号
                   ,recT_ODR_CTL.ITEM_CD                       --  6 品目番号
                   ,recT_ODR.ODR_QTY                           --  7 受注数量
                   ,recT_ODR.ODR_QTY                           --  8 完成数
                   ,2                                          --  9 費用進捗
                   ,numRs_COST_MATERIAL                        -- 10 消化実績  材料費
                   ,numRs_COST_PROCESS                         -- 11 消化実績  加工費
                   ,numRs_COST_OUTSOUCE                        -- 12 消化実績  外注費
                   ,0                                          -- 13 消化実績  役務費
                   ,numPl_COST_MATERIAL + numRs_COST_MATERIAL  -- 14 落着見込  材料費
                   ,numPl_COST_PROCESS  + numRs_COST_PROCESS   -- 15 落着見込  加工費
                   ,numPl_COST_OUTSOUCE + numRs_COST_OUTSOUCE  -- 16 落着見込  外注費
                   ,0                                          -- 17 落着見込  役務費
                   ,SYSDATE                                    -- 22 作成日
                   ,pvc2UserId                                 -- 23 作成者
                   ,pvc2BusinessName                           -- 24 作成プログラム名
                   ,SYSDATE                                    -- 25 更新日
                   ,pvc2UserId                                 -- 26 更新者
                   ,pvc2BusinessName                           -- 27 更新プログラム名
                   ,0);                                        -- 28 更新数
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment := SUBSTR('12:INSERT T_PJ_COST'     ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                     1,256);
                RAISE excOTHER_ERR;
        END;



    /* 見積に紐付く品目が製番品の時 */
    WHEN (recT_PJ_ODR_ALC.ESTIMATE_TYPE  =   1)  AND (recT_ODR_CTL.MRP_ODR_TYP IN  (1 ,2))  THEN
    
        -- [製番受注紐付][受注明細][所要量]カーソルOPEN
        BEGIN
           OPEN curT_JOB_ODR_PJ(recT_JOB_ODR.JOB_ODR_CD
                               ,recT_JOB_ODR.JOB_ODR_DETAIL_NO
                               ,recT_JOB_ODR.JOB_ODR_CANCEL_NO
                               ,recT_JOB_ODR.ITEM_CD);
        EXCEPTION
           WHEN OTHERS THEN
                vc2Comment := SUBSTR('02:OPEN curT_JOB_ODR_PJ'      ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                     1,256);
                RAISE;
         END;
            

    	LOOP
            -- [製番受注紐付][受注明細][所要量]FETCH
            BEGIN
                FETCH curT_JOB_ODR_PJ  INTO recT_JOB_ODR_PJ;
            EXCEPTION
                WHEN OTHERS THEN
                    -- カーソルFETCH失敗
                    vc2Comment  := SUBSTR(' 02:FETCH curT_JOB_ODR_PJ'            ||
                                          ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                          ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                          1,256);
                    RAISE;
            END;
            
            -- 製品構成カーソルEND
            EXIT WHEN  curT_JOB_ODR_PJ%NOTFOUND;
   
            -- 完成数
            IF  recT_JOB_ODR_PJ.UNIT_QTY_TYP = 1 THEN                 --在庫数量単位区分=1(整数)
                numCOMP_QTY     :=  CEIL(recT_JOB_ODR_PJ.ODR_ODR_QTY    *  (recT_JOB_ODR_PJ.TOTAL_RCV_QTY / recT_JOB_ODR_PJ.OD_ODR_QTY));
            ELSE
                numCOMP_QTY     :=  CEIL((recT_JOB_ODR_PJ.ODR_ODR_QTY   *  (recT_JOB_ODR_PJ.TOTAL_RCV_QTY / recT_JOB_ODR_PJ.OD_ODR_QTY)) * 10000) / 10000;
            END IF;
      
            -- 進捗率
            CASE
            WHEN recT_JOB_ODR.JOB_ODR_STS_TYP   =    9   THEN
                 --[製番計画].“製番状態区分”＝ 9:完了の時
                numCOST_PROGRESS        :=  2;
            WHEN (numRs_COST_MATERIAL   <>  0) or (numRs_COST_PROCESS  <>  0) or (numRs_COST_OUTSOUCE   <>  0)   THEN
                --「消化実績  材料費」or「消化実績  加工費」or「消化実績  外注費」≠0時
                numCOST_PROGRESS        :=  1;
            ELSE
                numCOST_PROGRESS        :=  0;
            END CASE;
            
            -- 完成数
            blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                      pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                      numRs_COST_MATERIAL        /  
                      recT_JOB_ODR.JOB_ODR_QTY   *  
                      recT_JOB_ODR_PJ.ODR_ODR_QTY,         --(i)端数処理前の値
--                    4,                                  --(i)少数桁数
                      0,                                  --(i)少数桁数
                      numPjRoundTyp,                      --(i)端数処理区分
                      numCMP_COST_MATERIAL);              --(o)端数処理後の値
            IF  blnRet = FALSE THEN
                numCMP_COST_MATERIAL   :=  0;
            END IF; 
            
            blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                      pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                      numRs_COST_PROCESS         /  
                      recT_JOB_ODR.JOB_ODR_QTY   *  
                      recT_JOB_ODR_PJ.ODR_ODR_QTY,         --(i)端数処理前の値
--                    4,                                  --(i)少数桁数
                      0,                                  --(i)少数桁数
                      numPjRoundTyp,                      --(i)端数処理区分
                      numCMP_COST_PROCESS);              --(o)端数処理後の値
            IF  blnRet = FALSE THEN
                numCMP_COST_PROCESS    :=  0;
            END IF; 
            
            blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                      pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                      numRs_COST_OUTSOUCE        /  
                      recT_JOB_ODR.JOB_ODR_QTY   *  
                      recT_JOB_ODR_PJ.ODR_ODR_QTY,         --(i)端数処理前の値
--                    4,                                  --(i)少数桁数
                      0,                                  --(i)少数桁数
                      numPjRoundTyp,                      --(i)端数処理区分
                      numCMP_COST_OUTSOUCE);             --(o)端数処理後の値
            IF  blnRet = FALSE THEN
                numCMP_COST_OUTSOUCE   :=  0;
            END IF; 
            
            blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                      pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                     (numPl_COST_MATERIAL + numRs_COST_MATERIAL)       /  
                      recT_JOB_ODR.JOB_ODR_QTY   *  
                      recT_JOB_ODR_PJ.ODR_ODR_QTY,         --(i)端数処理前の値
--                    4,                                  --(i)少数桁数
                      0,                                  --(i)少数桁数
                      numPjRoundTyp,                      --(i)端数処理区分
                      numEXP_COST_MATERIAL);              --(o)端数処理後の値
            IF  blnRet = FALSE THEN
                numCMP_COST_MATERIAL   :=  0;
            END IF; 
            
            blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                      pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                     (numPl_COST_PROCESS + numRs_COST_PROCESS)        /  
                      recT_JOB_ODR.JOB_ODR_QTY   *  
                      recT_JOB_ODR_PJ.ODR_ODR_QTY,         --(i)端数処理前の値
--                    4,                                  --(i)少数桁数
                      0,                                  --(i)少数桁数
                      numPjRoundTyp,                      --(i)端数処理区分
                      numEXP_COST_PROCESS);              --(o)端数処理後の値
            IF  blnRet = FALSE THEN
                numCMP_COST_PROCESS    :=  0;
            END IF; 
            
            blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                      pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                     (numPl_COST_OUTSOUCE  + numRs_COST_OUTSOUCE)        /  
                      recT_JOB_ODR.JOB_ODR_QTY   *  
                      recT_JOB_ODR_PJ.ODR_ODR_QTY,         --(i)端数処理前の値
--                    4,                                  --(i)少数桁数
                      0,                                  --(i)少数桁数
                      numPjRoundTyp,                      --(i)端数処理区分
                      numEXP_COST_OUTSOUCE);             --(o)端数処理後の値
            IF  blnRet = FALSE THEN
                numCMP_COST_OUTSOUCE   :=  0;
            END IF; 
            
            BEGIN
                INSERT INTO T_PJ_COST(
                        PROJECT_CD                --  1 案件番号
                       ,ESTIMATE_NO               --  2 見積番号
                       ,DETAL_NO                  --  3 明細番号
                       ,TOTAL_DATE                --  4 集計日時
                       ,ODR_NO                    --  5 受注番号
                       ,ITEM_CD                   --  6 品目番号
                       ,ODR_QTY                   --  7 受注数量
                       ,COMP_QTY                  --  8 完成数
                       ,COST_PROGRESS             --  9 費用進捗
                       ,CMP_COST_MATERIAL         -- 10 消化実績  材料費
                       ,CMP_COST_PROCESS          -- 11 消化実績  加工費
                       ,CMP_COST_OUTSOUCE         -- 12 消化実績  外注費
                       ,CMP_COST_SERVICE          -- 13 消化実績  役務費
                       ,EXP_COST_MATERIAL         -- 14 落着見込  材料費
                       ,EXP_COST_PROCESS          -- 15 落着見込  加工費
                       ,EXP_COST_OUTSOUCE         -- 16 落着見込  外注費
                       ,EXP_COST_SERVICE          -- 17 落着見込  役務費
                       ,CREATED_DATE              -- 22 作成日
                       ,CREATED_BY                -- 23 作成者
                       ,CREATED_PRG_NM            -- 24 作成プログラム名
                       ,UPDATED_DATE              -- 25 更新日
                       ,UPDATED_BY                -- 26 更新者
                       ,UPDATED_PRG_NM            -- 27 更新プログラム名
                       ,MODIFY_COUNT              -- 28 更新数
                ) VALUES (
                        recT_JOB_ODR_PJ.PROJECT_CD     --  1 案件番号
                       ,recT_JOB_ODR_PJ.ESTIMATE_NO    --  2 見積番号
                       ,recT_JOB_ODR_PJ.DETAL_NO       --  3 明細番号
                       ,datTOTAL_DATE                  --  4 集計日時
                       ,recT_JOB_ODR_PJ.ODR_NO         --  5 受注番号
                       ,recT_JOB_ODR.ITEM_CD           --  6 品目番号
                       ,recT_JOB_ODR_PJ.ODR_ODR_QTY    --  7 受注数量
                       ,numCOMP_QTY                    --  8 完成数
                       ,numCOST_PROGRESS               --  9 費用進捗
                       ,numCMP_COST_MATERIAL           -- 10 消化実績  材料費
                       ,numCMP_COST_PROCESS            -- 11 消化実績  加工費
                       ,numCMP_COST_OUTSOUCE           -- 12 消化実績  外注費
                       ,0                              -- 13 消化実績  役務費
                       ,numEXP_COST_MATERIAL           -- 14 落着見込  材料費
                       ,numEXP_COST_PROCESS            -- 15 落着見込  加工費
                       ,numEXP_COST_OUTSOUCE           -- 16 落着見込  外注費
                       ,0                              -- 17 落着見込  役務費
                       ,SYSDATE                        -- 22 作成日
                       ,pvc2UserId                     -- 23 作成者
                       ,pvc2BusinessName               -- 24 作成プログラム名
                       ,SYSDATE                        -- 25 更新日
                       ,pvc2UserId                     -- 26 更新者
                       ,pvc2BusinessName               -- 27 更新プログラム名
                       ,0);                            -- 28 更新数
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment := SUBSTR('12:INSERT T_PJ_COST'     ||
                                         ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                         ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                         1,256);
                    RAISE excOTHER_ERR;
            END;
            
        END LOOP;
        
        -- [製番受注紐付][受注明細][所要量]カーソルCLOSE
        CLOSE curT_JOB_ODR_PJ;
        
    /* 見積が役務の時 */
    WHEN recT_PJ_ODR_ALC.ESTIMATE_TYPE  =   2     THEN

        -- 進捗率
        CASE
        WHEN recT_ODR_UNSTOCK.ODR_CMPLT_FLG   =    1   THEN
              --[製番計画].“製番状態区分”＝ 9:完了の時
            numCOST_PROGRESS        :=  2;
        WHEN (numRs_COST_SERVICE   <>  0) THEN
            --「消化実績  役務費」
            numCOST_PROGRESS        :=  1;
        ELSE
            numCOST_PROGRESS        :=  0;
        END CASE;

        BEGIN
            INSERT INTO T_PJ_COST(
                    PROJECT_CD                --  1 案件番号
                   ,ESTIMATE_NO               --  2 見積番号
                   ,DETAL_NO                  --  3 明細番号
                   ,TOTAL_DATE                --  4 集計日時
                   ,ODR_NO                    --  5 受注番号
                   ,ITEM_CD                   --  6 品目番号
                   ,ODR_QTY                   --  7 受注数量
                   ,COMP_QTY                  --  8 完成数
                   ,COST_PROGRESS             --  9 費用進捗
                   ,CMP_COST_MATERIAL         -- 10 消化実績  材料費
                   ,CMP_COST_PROCESS          -- 11 消化実績  加工費
                   ,CMP_COST_OUTSOUCE         -- 12 消化実績  外注費
                   ,CMP_COST_SERVICE          -- 13 消化実績  役務費
                   ,EXP_COST_MATERIAL         -- 14 落着見込  材料費
                   ,EXP_COST_PROCESS          -- 15 落着見込  加工費
                   ,EXP_COST_OUTSOUCE         -- 16 落着見込  外注費
                   ,EXP_COST_SERVICE          -- 17 落着見込  役務費
                   ,CREATED_DATE              -- 22 作成日
                   ,CREATED_BY                -- 23 作成者
                   ,CREATED_PRG_NM            -- 24 作成プログラム名
                   ,UPDATED_DATE              -- 25 更新日
                   ,UPDATED_BY                -- 26 更新者
                   ,UPDATED_PRG_NM            -- 27 更新プログラム名
                   ,MODIFY_COUNT              -- 28 更新数
            ) VALUES (
                    pvc2ProjectCd                              --  1 案件番号
                   ,pvc2EstimateNo                             --  2 見積番号
                   ,pvc2DetalNo                                --  3 明細番号
                   ,datTOTAL_DATE                              --  4 集計日時
                   ,pvc2OdrNO                                  --  5 受注番号
                   ,recT_ODR_UNSTOCK.ITEM_CD                   --  6 品目番号
                   ,recT_ODR_UNSTOCK.ODR_QTY                   --  7 受注数量
                   ,recT_ODR_UNSTOCK.ODR_QTY                   --  8 完成数
                   ,numCOST_PROGRESS                           --  9 費用進捗
                   ,0                                          -- 10 消化実績  材料費
                   ,0                                          -- 11 消化実績  加工費
                   ,0                                          -- 12 消化実績  外注費
                   ,numRs_COST_SERVICE                         -- 13 消化実績  役務費
                   ,0                                          -- 14 落着見込  材料費
                   ,0                                          -- 15 落着見込  加工費
                   ,0                                          -- 16 落着見込  外注費
                   ,numPl_COST_SERVICE  + numRs_COST_SERVICE   -- 17 落着見込  役務費
                   ,SYSDATE                                    -- 22 作成日
                   ,pvc2UserId                                 -- 23 作成者
                   ,pvc2BusinessName                           -- 24 作成プログラム名
                   ,SYSDATE                                    -- 25 更新日
                   ,pvc2UserId                                 -- 26 更新者
                   ,pvc2BusinessName                           -- 27 更新プログラム名
                   ,0);                                        -- 28 更新数
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment := SUBSTR('12:INSERT T_PJ_COST'          ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                     1,256);
                RAISE excOTHER_ERR;
        END;
    END CASE;

/*------------------------------------------------------------
'  案件進捗更新処理
-------------------------------------------------------------*/
vc2RunChkComment := '●●●●通過 00080';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment||'----------'||TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
    
    -- 登録した[案件予算積上明細]の最上位品を検索する
    BEGIN
        SELECT  /*+ RULE */
                ODR_STS_TYP
               ,DM_STS_TYP
        INTO    numODR_STS_TYP
               ,numDM_STS_TYP 
        FROM    T_PJ_BUDGET_DETAIL 
        WHERE   PJ_BUDGET_DETAIL_NO  = vc2PJBuDgetDetailNo
        AND     SEQNO                = 1
                ;
    EXCEPTION
        WHEN OTHERS THEN
            vc2Comment := SUBSTR(' 80:SELECT PJ_BUDGET_DETAIL'       ||
                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
             RAISE;
    END;


    CASE
    /* 見積に紐付く品目がMRP品の時 */
    WHEN (recT_PJ_ODR_ALC.ESTIMATE_TYPE  =   1)  AND (recT_ODR_CTL.MRP_ODR_TYP IN  (4 ,5 ,6 ,7))  THEN

        BEGIN
            SELECT  /*+ RULE */
                    CMP_COST_MATERIAL, CMP_COST_PROCESS,CMP_COST_OUTSOUCE, CMP_COST_SERVICE
                   ,EXP_COST_MATERIAL, EXP_COST_PROCESS,EXP_COST_OUTSOUCE, EXP_COST_SERVICE
            INTO    numCMP_COST_MATERIAL, numCMP_COST_PROCESS,numCMP_COST_OUTSOUCE, numCMP_COST_SERVICE
                   ,numEXP_COST_MATERIAL, numEXP_COST_PROCESS,numEXP_COST_OUTSOUCE, numEXP_COST_SERVICE
            FROM    T_PJ_COST 
            WHERE   PROJECT_CD        = pvc2ProjectCd
            AND     ESTIMATE_NO       = pvc2EstimateNo
            AND     DETAL_NO          = pvc2DetalNo
            AND     TOTAL_DATE        = datTOTAL_DATE
            ;
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment := SUBSTR(' 80:SELECT PJ_BUDGET_DETAIL'       ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                DBMS_OUTPUT.PUT_LINE('---------->'|| vc2Comment);
                RAISE;
        END;

        IF  numDM_STS_TYP          =   9                       AND
            numCMP_COST_MATERIAL   =   numEXP_COST_MATERIAL    AND
            numEXP_COST_PROCESS    =   numEXP_COST_PROCESS     AND
            numCMP_COST_OUTSOUCE   =   numEXP_COST_OUTSOUCE    THEN

            -- 仕入先年間内示情報の更新
            BEGIN
                UPDATE T_ESTIMATE_DETAL
                SET OD_COMP_FLG        = 1               
                  , UPDATED_DATE       = SYSDATE
                  , MODIFY_COUNT       = MODIFY_COUNT + 1
                WHERE PROJECT_CD       = pvc2ProjectCd 
                AND   ESTIMATE_NO      = pvc2EstimateNo
                AND   DETAL_NO         = pvc2DetalNo   
                ;
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment := SUBSTR(' 80:UPDATE T_ESTIMATE_DETAL'          ||
                                         ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                         ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                         1,256);
                    RAISE excOTHER_ERR;
            END;

        END IF;
    /* 見積に紐付く品目が製番品の時 */
    WHEN (recT_PJ_ODR_ALC.ESTIMATE_TYPE  =   1)  AND (recT_ODR_CTL.MRP_ODR_TYP IN  (1 ,2))  THEN
        -- [案件受注紐付]カーソルOPEN
        BEGIN
           OPEN curT_ESTIMATE_DETAL_U(recT_JOB_ODR.JOB_ODR_CD
                               ,recT_JOB_ODR.JOB_ODR_DETAIL_NO
                               ,recT_JOB_ODR.JOB_ODR_CANCEL_NO
                               ,datTOTAL_DATE);
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment := SUBSTR(' 80:OPEN curT_ESTIMATE_DETAL_U'       ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                     1,256);
                RAISE;
        END;
        
        LOOP
            -- [案件受注紐付]のカーソルFETCH
            BEGIN
                FETCH curT_ESTIMATE_DETAL_U  INTO recT_ESTIMATE_DETAL_U;
            EXCEPTION
                WHEN OTHERS THEN
                    -- カーソルFETCH失敗
                    vc2Comment  := SUBSTR(' 70:FETCH curT_ESTIMATE_DETAL_U'      ||
                                          ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                          ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                          1,256);
                    RAISE;
            END;
        
            -- [案件受注紐付]カーソルEND
            EXIT WHEN  curT_ESTIMATE_DETAL_U%NOTFOUND;
        
            IF  numODR_STS_TYP         =   9                       AND
                recT_ESTIMATE_DETAL_U.CMP_COST_MATERIAL   =   recT_ESTIMATE_DETAL_U.EXP_COST_MATERIAL    AND
                recT_ESTIMATE_DETAL_U.CMP_COST_PROCESS    =   recT_ESTIMATE_DETAL_U.EXP_COST_PROCESS     AND
                recT_ESTIMATE_DETAL_U.CMP_COST_OUTSOUCE   =   recT_ESTIMATE_DETAL_U.EXP_COST_OUTSOUCE    THEN
        
                -- 仕入先年間内示情報の更新
                BEGIN
                    UPDATE T_ESTIMATE_DETAL
                    SET OD_COMP_FLG        = 1               
                      , UPDATED_DATE       = SYSDATE
                      , MODIFY_COUNT       = MODIFY_COUNT + 1
                    WHERE PROJECT_CD       = recT_ESTIMATE_DETAL_U.PROJECT_CD 
                    AND   ESTIMATE_NO      = recT_ESTIMATE_DETAL_U.ESTIMATE_NO
                    AND   DETAL_NO         = recT_ESTIMATE_DETAL_U.DETAL_NO   
                    ;
                EXCEPTION
                    WHEN OTHERS THEN
                        vc2Comment := SUBSTR(' 80:UPDATE T_ESTIMATE_DETAL'          ||
                                             ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                             ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                             1,256);
                        RAISE excOTHER_ERR;
                END;
            END IF;
        END LOOP;
    
        -- [案件受注紐付]]カーソルCLOSE
        CLOSE curT_ESTIMATE_DETAL_U;


    /* 見積が役務の時 */
    WHEN recT_PJ_ODR_ALC.ESTIMATE_TYPE  =   2     THEN
        
        BEGIN
            SELECT  /*+ RULE */
                    PC.CMP_COST_MATERIAL, PC.CMP_COST_PROCESS,PC.CMP_COST_OUTSOUCE, PC.CMP_COST_SERVICE
                   ,PC.EXP_COST_MATERIAL, PC.EXP_COST_PROCESS,PC.EXP_COST_OUTSOUCE, PC.EXP_COST_SERVICE
            INTO    numCMP_COST_MATERIAL, numCMP_COST_PROCESS,numCMP_COST_OUTSOUCE, numCMP_COST_SERVICE
                   ,numEXP_COST_MATERIAL, numEXP_COST_PROCESS,numEXP_COST_OUTSOUCE, numEXP_COST_SERVICE
            FROM    T_PJ_COST PC
            WHERE   PC.PROJECT_CD        = pvc2ProjectCd
            AND     PC.ESTIMATE_NO       = pvc2EstimateNo
            AND     PC.DETAL_NO          = pvc2DetalNo
            AND     PC.TOTAL_DATE        = datTOTAL_DATE
            ;
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment := SUBSTR(' 80:SELECT PJ_BUDGET_DETAIL'       ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE;
        END;

        IF  numCMP_COST_SERVICE   =   numEXP_COST_SERVICE    THEN

            -- 仕入先年間内示情報の更新
            BEGIN
                UPDATE T_ESTIMATE_DETAL
                SET OD_COMP_FLG        = 1               
                  , UPDATED_DATE       = SYSDATE
                  , MODIFY_COUNT       = MODIFY_COUNT + 1
                WHERE PROJECT_CD       = pvc2ProjectCd 
                AND   ESTIMATE_NO      = pvc2EstimateNo
                AND   DETAL_NO         = pvc2DetalNo   
                ;
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment := SUBSTR(' 80:UPDATE T_ESTIMATE_DETAL'          ||
                                         ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                         ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                         1,256);
                    RAISE excOTHER_ERR;
            END;

        END IF;
    END CASE;

    <<EXT00080A>>
    --NULL;
/*------------------------------------------------------------
'  修了処理
-------------------------------------------------------------*/
vc2RunChkComment := '●●●●通過 00090';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment||'----------'||TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

    CASE  
    WHEN  numErrorCnt = 0 THEN 
          vc2Comment   :=  '正常終了'   ;  
          pnumReturn   :=  STATUS_NORMAL;     -- 1:正常終了
    WHEN  numErrorCnt > 0 THEN 
          vc2Comment   :=  '警告あり'        ;  
          pnumReturn   :=  STATUS_WARNING;     -- 2:警告
    ELSE
          vc2Comment   :=  '異常終了'        ;  
          pnumReturn   :=  STATUS_ERROR;       -- 3:異常終了
    END CASE;

    /* 業務開始メッセージの出力 */
    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                        pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);

    /* TraceLog の出力 */
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    COMMIT;

--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 修了 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
    
--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN excParameterErr  THEN    --固有の入力パラメータが不備
--DBMS_OUTPUT.PUT_LINE('excParameterErr');
        --ROLLBACK;
        
        IF  vc2ErrorCD   IS NULL   THEN
            vc2ErrorCD   :=  APS_COM_ParameterErr;
            -- 終了メッセージの作成
            vc2Comment := SUBSTR(LOGMSG_PARAM || ' PROJECT_CD=' || pvc2ProjectCd 
                                              || ' ESTIMATE_NO=' || pvc2EstimateNo 
                                              || ' DETAL_NO=' || pvc2DetalNo
                                              || ' 受注番号=' || pvc2OdrNO
                                              || ' 処理区分=' || pnumFlag,
                                 1,256);
        END IF;
        
        -- 案件予算積上げエラー登録
        blnRet :=  SubFncInsBudgetError('');

        -- TraceLog の出力
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_PARAM || vc2TraceComment);

        -- LogFile の CLOSE
        blnRet := FncLogClose(UTL_FileHandle);
        
        /* コミット */
        COMMIT;

        /* 異常終了 */
        pnumReturn := STATUS_ERROR;

        RETURN;

    WHEN excParamWarning THEN         --予算積上げ処理が出来ない状態ー
        -- ロールバック
        --ROLLBACK;
        
        -- 案件予算積上げエラー登録
        blnRet :=  SubFncInsBudgetError('');
        
        /* トレースの出力 */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                              pvc2PlantCd, MY_SQL_NAME, vc2TraceComment);

        /* LogFile の CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

        /* コミット */
        COMMIT;

        /* 異常終了 */
        pnumReturn := STATUS_WARNING;
        RETURN;

    WHEN excOTHER_ERR THEN         --予算積上げ用オーダデマンド番号エラー
        -- ロールバック
        --ROLLBACK;
        
        -- 案件予算積上げエラー登録
        blnRet :=  SubFncInsBudgetError('');
        
        /* トレースの出力 */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                              pvc2PlantCd, MY_SQL_NAME, vc2TraceComment);

        /* LogFile の CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

        /* コミット */
        COMMIT;

        /* 異常終了 */
        pnumReturn := STATUS_ERROR;

        RETURN;

    WHEN excMasterErr THEN         --カーソルエラー
        -- ロールバック
        --ROLLBACK;

        -- カーソルのクローズ処理
        --販売予実基本予算カーソル
        IF curT_PJ_BUDGET_DETAIL%ISOPEN = TRUE THEN
            CLOSE curT_PJ_BUDGET_DETAIL;
        END IF;
        
        /* 業務メッセージの出力 */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                            pvc2PlantCd, MY_SQL_NAME, LOGMSG_PARAM, vc2Comment);
        
        /* トレースの出力 */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                              pvc2PlantCd, MY_SQL_NAME, LOGMSG_PARAM);

        /* LogFile の CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

        /* コミット */
        COMMIT;

        /* 異常終了 */
        pnumReturn := STATUS_ERROR;

    WHEN excGetNewPjOdNo THEN         --予算積上げ用オーダデマンド番号エラー
        -- ロールバック
        --ROLLBACK;

        -- カーソルのクローズ処理
        --販売予実基本予算カーソル
        IF curT_PJ_BUDGET_DETAIL%ISOPEN = TRUE THEN
            CLOSE curT_PJ_BUDGET_DETAIL;
        END IF;
        
        /* 業務メッセージの出力 */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                            pvc2PlantCd, MY_SQL_NAME, LOGMSG_NEWODRNO, vc2Comment);
        
        /* トレースの出力 */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                              pvc2PlantCd, MY_SQL_NAME, LOGMSG_NEWODRNO);

        /* LogFile の CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

        /* コミット */
        COMMIT;

        /* 異常終了 */
        pnumReturn := STATUS_ERROR;

    WHEN excFncTraceLog THEN
        --ROLLBACK;
        pnumReturn := STATUS_ERROR;
     
    WHEN OTHERS THEN   --その他のエラー
        /* ErrorLog の出力 */
        blnRet := FncErrLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, SQLCODE, SQLERRM);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        /* ロールバック */
        ROLLBACK;
        
        /* 異常終了 */
        pnumReturn := STATUS_ERROR;
END;
/
