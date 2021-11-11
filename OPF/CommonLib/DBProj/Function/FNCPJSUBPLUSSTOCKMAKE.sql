CREATE OR REPLACE FUNCTION FNCPJSUBPLUSSTOCKMAKE(
/*------------------------------------------------------------------------------
'
' version   : 1.00.01
'
' 修正履歴
' 2014.04.15 初版
'
' 機能      : 案件予算余剰在庫品作成処理
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
'             cv2PjBudgetDetailNo  - (i)案件予算積上明細番号
'             pvc2Seqno            - (i)SEQNO
'             pvc2AlcdQty          - (i)引当数
'             pvc2ErrorCd          - (o)エラーコード
'
' 機能説明  : 案件予算余剰在庫品作成処理。
'           : 案件予算積上げ処理で積上げを行う為に[案件予算積上明細]に
'           : 案指定手配の品目番号配下の構成展開を行い登録する。
'
' 備考      : 各品目手配の予算金額を把握する為に、製番最上位品目からの
'           : 手配数に対する必要数を求める
'
'
------------------------------------------------------------------------------*/
    pFileHandle            IN  UTL_FILE.FILE_TYPE  --ファイルハンドル
   ,pvc2LogMode            IN  VARCHAR2            --ＬＯＧモード
   ,pvc2OutputMode         IN  VARCHAR2            --出力モード
   ,pvc2UserId             IN  VARCHAR2            --ユーザＩＤ
   ,pvc2BusinessName       IN  VARCHAR2            --業務名
   ,pvc2PlantCd            IN  VARCHAR2            --工場コード
   ,pcv2PjBudgetDetailNo   IN  VARCHAR2            --案件予算積上明細番号
   ,pvc2Seqno              IN  NUMBER              --SEQNO
   ,pvc2AlcdQty            IN  NUMBER              --引当数
   ,pvc2ErrorCd            OUT VARCHAR2            --エラーコード
) RETURN BOOLEAN
IS
PRAGMA AUTONOMOUS_TRANSACTION;

-- カーソルの宣言
    -- 案件予算明細(展開元)
    CURSOR curFST_PJ_BUDGET_DETAIL(
                  cv2PjBudgetDetailNo  VARCHAR
                 ,numSeqno             NUMBER
    )
    IS
        SELECT /*+ RULE */
               PJ.PJ_BUDGET_DETAIL_NO           -- 案件予算積上明細番号
              ,PJ.SEQNO                         -- SEQNO
              ,PJ.OD_NO                         -- オーダデマンド番号
              ,PJ.PROJECT_CD                    -- 案件番号
              ,PJ.ESTIMATE_NO                   -- 見積番号
              ,PJ.DETAL_NO                      -- 明細番号
              ,PJ.ODR_NO                        -- 受注番号
              ,PJ.ESTIMATE_TYPE                 -- 手配品目種
              ,PJ.ODR_ACPT_DATE                 -- 受注日
              ,PJ.PLANT_CD                      -- 工場コード
              ,PJ.JOB_ODR_CD                    -- 製番
              ,PJ.JOB_ODR_DETAIL_NO             -- 製番枝番
              ,PJ.JOB_ODR_CANCEL_NO             -- 製番取消発生番号
              ,PJ.ROOT_ITEM_CD                  -- 最上位品目番号
              ,PJ.PARENT_ITEM_CD                -- 親品目番号
              ,PJ.ITEM_CD                       -- 品目番号
              ,PJ.DUE_DATE                      -- 要求納期
              ,PJ.ODR_START_DATE                -- 手配着手日
              ,PJ.PRD_DUE_DATE                  -- 製造納期
              ,PJ.PRD_START_DATE                -- 製造着手日
              ,IT.MRP_ODR_TYP                   -- 品目手配区分
              ,PJ.OUTSIDE_TYP                   -- 所要量内外作区分
              ,IT.PRODUCT_TYP                   -- 製品区分
              ,IT.UNIT_QTY_TYP                  -- 在庫数単位区分
              ,PJ.PS_UNIT_QTY                   -- 製品構成単位数
              ,PJ.PS_UNIT_DENOMINATOR           -- 製品構成単位数分母
              ,PJ.PS_UNIT_NUMERATOR             -- 製品構成単位数分子
              ,PJ.OD_LEVEL_NO                   -- 所要量レベル番号
              ,PJ.PARENT_SEQNO                  -- 親SEQNO
              ,PJ.ITEM_SPOIL                    -- 所要量品目仕損率
              ,PJ.PS_SPOIL                      -- 所要量構成仕損率
              ,PJ.CONS_TYP                      -- 構成支給区分
              ,PJ.PS_INPUT_RATIO                -- 構成仕損増分係数
              ,PJ.ITEM_INPUT_RATIO              -- 品目仕損増分係数
              ,PJ.DMY_ITEM_FLG                  -- 擬似品目フラグ
              ,PJ.VOLUNT_SPL_FLG                -- 無償受給品フラグ
              ,PJ.COST_UP_TYP                   -- 原価積上区分
              ,PJ.ONEROUS_CONS_FLG              -- 有償支給品フラグ
              ,PJ.BUDGET_STACK_TYP              -- 予算積上げ区分
        FROM   T_PJ_BUDGET_DETAIL PJ,
               M_ITEM             IT
        WHERE  PJ.PJ_BUDGET_DETAIL_NO     = cv2PjBudgetDetailNo
        AND    PJ.SEQNO                   = numSeqno
        AND    PJ.ITEM_CD                 = IT.ITEM_CD;

    -- ROWTYPE の宣言
    recFST_PJ_BUDGET_DETAIL  curFST_PJ_BUDGET_DETAIL%ROWTYPE;
    
    -- 案件予算明細(階層レベル)
    CURSOR curLVL_PJ_BUDGET_DETAIL(
               cvc2PJ_BUDGET_DETAIL_NO  IN VARCHAR2     -- 案件予算積上明細番号
             , cvc2ORG_OD_NO            IN VARCHAR2     -- 元オーダデマンド番号 
             , cvc2OD_LEVEL_NO          IN NUMBER       -- 所要量レベル番号
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
        WHERE  PJ_BUDGET_DETAIL_NO     =  cvc2PJ_BUDGET_DETAIL_NO   -- 展開元の[案件予算積上明細].“案件予算積上明細番号”
        AND    ORG_OD_NO               =  cvc2ORG_OD_NO             -- 引数.“オーダデマンド番号”
        AND    OD_TYP                  <> 3                         -- オーダデマンド区分
        AND    ALC_STOCK_TYP           =  1                         -- 在庫引当区分 (1:品目在庫)
        AND    OD_LEVEL_NO             =  cvc2OD_LEVEL_NO           -- 所要量レベル番号
        ;
    -- ROWTYPE の宣言
    recLVL_PJ_BUDGET_DETAIL  curLVL_PJ_BUDGET_DETAIL%ROWTYPE;
    
    -- 構成(親品目からのシングル正展開用)
    CURSOR curM_PS(
               cvc2ParentItemCd      IN VARCHAR2      -- 親品目番号 
             , cvc2Eff_Phase_Date    IN DATE          -- 基準日 
    )
    IS
        SELECT /*+ RULE */
               PS.PARENT_ITEM_CD                -- 親品目番号
              ,PS.COMP_ITEM_CD                  -- 子品目番号
              ,PS.PS_EDITION                    -- 製品構成版数
              ,PS.PS_UNIT_DENOMINATOR           -- 製品構成単位数分母
              ,PS.PS_UNIT_NUMERATOR             -- 製品構成単位数分子
              ,PS.EFF_PHASE_IN_DATE             -- 製品構成有効開始日
              ,PS.EFF_PHASE_OUT_DATE            -- 製品構成有効終了日
              ,PS.PS_SPOIL                      -- 構成仕損率
              ,PS.CONS_TYP                      -- 支給区分
              ,PS.PS_REF_NO                     -- 製品構成照会キー
              ,PS.COST_UP_TYP                   -- 原価積上区分
              ,PS.MRP_EXP_TYP                   -- 所要量展開区分
              ,IT.OUTSIDE_TYP                   -- 所要量内外作区分
              ,IT.MRP_ODR_TYP                   -- 品目手配区分
              ,IT.PRODUCT_TYP                   -- 製品区分
              ,IT.UNIT_QTY_TYP                  -- 在庫数単位区分
              ,IT.SPL_ITEM_TYP                  -- 受給品区分
              ,IT.ITEM_SPOIL                    -- 品目仕損率
        FROM   M_PS    PS
              ,M_ITEM  IT
        WHERE  PS.PARENT_ITEM_CD      =  cvc2ParentItemCd   -- 親品目番号
        AND    PS.MRP_EXP_TYP         =  1                  -- 所要量展開区分
        AND    PS.EFF_PHASE_IN_DATE   <= cvc2Eff_Phase_Date -- 製品構成有効開始日
        AND    PS.EFF_PHASE_OUT_DATE  >= cvc2Eff_Phase_Date -- 製品構成有効開始日
        AND    IT.ITEM_CD             =  PS.COMP_ITEM_CD
        ORDER  BY PS.COMP_ITEM_CD ASC,PS_EDITION ASC
            ;
    -- ROWTYPE の宣言
    recM_PS     curM_PS%ROWTYPE;

/* 定数の宣言 */
    MY_SQL_NAME             VARCHAR2(120)  := 'FncPjSubplusStockMake';      --ＰＬ／ＳＱＬ名
    
    
/* 変数の宣言 */
    UTL_FileHandle          UTL_FILE.FILE_TYPE; -- ファイルハンドル
    blnRet                  BOOLEAN;            -- 関数戻り値
    intRet                  INTEGER;            -- 関数戻り値
    vc2Comment              VARCHAR2(1024);     -- メッセージ用コメント作成作業領域
    vc2RunChkComment        VARCHAR2(1024);     -- 実行位置確認用コメント作成作業領域
    vc2TraceComment         VARCHAR2(1024);     -- トレーース出力用コメント作成作業領域（入力パラメータ記録用）
    numMaxSeqNO             NUMBER(6);          -- SEQNO
    numPsUnitQty            NUMBER(22,8);       -- 数量ワーク
    numTgtCnt               NUMBER := 0;        -- 対象件数
    numOd_Level_No          NUMBER(6);          -- 階層レベル
    datDue_Date             DATE;               -- 基準日
    vc2NewOd_No             VARCHAR2(100);      -- 予算積上げ用オーダデマンド番号
    
    numOD_TYP               T_PJ_BUDGET_DETAIL.OD_TYP%TYPE;            -- オーダデマンド区分
    numDM_QTY               T_PJ_BUDGET_DETAIL.DM_QTY%TYPE;            -- デマンド数
    numODR_QTY              T_PJ_BUDGET_DETAIL.ODR_QTY%TYPE;            -- オーダ数
    numPS_UNIT_QTY          T_PJ_BUDGET_DETAIL.PS_UNIT_QTY%TYPE;       -- 製品構成単位数
    numDMY_ITEM_FLG         T_PJ_BUDGET_DETAIL.DMY_ITEM_FLG%TYPE;      -- 擬似品目フラグ
    numVOLUNT_SPL_FLG       T_PJ_BUDGET_DETAIL.VOLUNT_SPL_FLG%TYPE;    -- 無償受給品フラグ
    numPS_INPUT_RATIO       T_PJ_BUDGET_DETAIL.PS_INPUT_RATIO%TYPE;    -- 構成仕損増分係数
    numITEM_INPUT_RATIO     T_PJ_BUDGET_DETAIL.ITEM_INPUT_RATIO%TYPE;  -- 品目仕損増分係数
    
/*計算用ワーク*/
    numSave                 NUMBER(25);
    intCount                INTEGER(11);
    intCount2               INTEGER(11);

/*エラー用ワーク*/
    vc2TmpMessage           VARCHAR2(1024);       --ＬＯＧメッセージ

-- MESSAGE の宣言
    APS_COM_ParameterErr                VARCHAR2(28)   := 'ZZ09022';    -- 引数エラー
    APS_COM_NOTEXIST_PJ_BUDGET_DTL      VARCHAR2(28)   := 'KM00043';     --製番引当する案件予算積上明細が存在しません
    APS_COM_MISTAKE_NATIVE_PARAM        VARCHAR2(28)   := 'KM00042';    -- 案件予算積上処理にて致命的エラーが発生しました。
    
    -- 例外の宣言
    excFncTraceLog                      EXCEPTION;    --トレースログ出力エラー
    excParameterErr                     EXCEPTION;    --「引数」エラー
    excGetNewPjOdNo                     EXCEPTION;    --予算積上げ用オーダデマンド番号エラー
    excOTHER_ERR                        EXCEPTION;    --予算積上げ用オーダデマンドt登録エラー

    -- LOG の宣言
    LOGMSG_START                        VARCHAR2(20)   := 'Start';      -- ログ用メソッド開始宣言
    LOGMSG_END                          VARCHAR2(12)   := 'End';        -- ログ用メソッド終了宣言
    LOGMSG_ERR                          VARCHAR2(32)   := '異常終了';
    LOGMSG_PARAM                        VARCHAR2(64)   := '入力パラメータ：';
    LOGMSG_NEWODRNO                     VARCHAR2(152)  := '予算積上げ用オーダデマンド番号取得失敗';
    LOGMSG_FATALCNT                     VARCHAR2(40)   := '異常件数：';
    LOGMSG_BRACKETS                     VARCHAR2(4)    := '[';
    LOGMSG_BRACKETE                     VARCHAR2(4)    := ']';
    LOGMSG_COMMA                        VARCHAR2(4)    := ',';

--<メイン処理 >-----------------------------------------------------
BEGIN
DBMS_OUTPUT.ENABLE(1000000);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 開始 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
    vc2RunChkComment := NULL;
    
    /* TraceLog の出力 */
    blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode,
                           pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                           MY_SQL_NAME, LOGMSG_START);

    IF blnRet=FALSE THEN
        RAISE excFncTraceLog;
    END IF
    ;
/*------------------------------------------------------------
'　展開元情報取得
-------------------------------------------------------------*/
vc2RunChkComment := '●●●●通過 00010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- 案件予算積上明細カーソルOPEN
    BEGIN
        OPEN curFST_PJ_BUDGET_DETAIL(pcv2PjBudgetDetailNo,pvc2Seqno);
    EXCEPTION
        WHEN OTHERS THEN
            vc2Comment := SUBSTR(' 10:OPEN curFST_PJ_BUDGET_DETAIL'      ||
                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                 1,256);
            RAISE excParameterErr;
    END;

    -- 案件予算積上明細カーソルFETCH
    BEGIN
        FETCH curFST_PJ_BUDGET_DETAIL INTO recFST_PJ_BUDGET_DETAIL;
    EXCEPTION
        WHEN OTHERS THEN
            -- カーソルFETCH失敗
            vc2Comment  := SUBSTR(' 02:FETCH curFST_PJ_BUDGET_DETAIL'    ||
                                  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                  1,256);
            RAISE excParameterErr;
    END;
    
    IF curFST_PJ_BUDGET_DETAIL%NOTFOUND THEN
       RAISE excParameterErr;
    END IF;
    
    -- 最大SEQNO取得
    BEGIN
        SELECT MAX(SEQNO)    INTO numMaxSeqNO
        FROM   T_PJ_BUDGET_DETAIL
        WHERE  PJ_BUDGET_DETAIL_NO         =  recFST_PJ_BUDGET_DETAIL.PJ_BUDGET_DETAIL_NO;
    EXCEPTION
        WHEN OTHERS THEN
            RAISE;
    END;

    -- 展開元の情報のセット
    numOd_Level_No          :=  recFST_PJ_BUDGET_DETAIL.OD_LEVEL_NO;    -- 階層レベル
    datDue_Date             :=  recFST_PJ_BUDGET_DETAIL.DUE_DATE;       -- 要求納期
    

    vc2TmpMessage :=  '階層レベル:' || numOd_Level_No ||
                      '要求納期  :' || to_char(datDue_Date, 'YYYYMMDD');

/*------------------------------------------------------------
'　余剰在庫在上位品登録
-------------------------------------------------------------*/
vc2RunChkComment := '●●●●通過 00020';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- 予算積上げ用オーダデマンド番号取得
    blnRet := FncGetNewPjOdNo(pFileHandle
                              ,pvc2LogMode
                              ,pvc2OutputMode
                              ,pvc2UserId
                              ,pvc2BusinessName
                              ,pvc2PlantCd
                              ,vc2NewOd_No
                              );
    IF blnRet = FALSE THEN
        RAISE excGetNewPjOdNo;
    END IF;

    -- SEQNO カウントアップ
    numMaxSeqNO    :=  numMaxSeqNO +   1;
    

    BEGIN
        -- 案件予算積上明細の登録
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
               ,ODR_COST_MATERIAL           -- 44 手配残　材料費
               ,ODR_COST_PROCESS            -- 45 手配残　加工費
               ,ODR_COST_OUTSOUCE           -- 46 手配残　外注費
               ,ODR_COST_SERVICE            -- 47 手配残　役務費
               ,CMP_COST_MATERIAL           -- 48 消化実績　材料費
               ,CMP_COST_PROCESS            -- 49 消化実績　加工費
               ,CMP_COST_OUTSOUCE           -- 50 消化実績　外注費
               ,CMP_COST_SERVICE            -- 51 消化実績　役務費
               ,EXP_COST_MATERIAL           -- 52 落着見込　材料費
               ,EXP_COST_PROCESS            -- 53 落着見込　加工費
               ,EXP_COST_OUTSOUCE           -- 54 落着見込　外注費
               ,EXP_COST_SERVICE            -- 55 落着見込　役務費
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
                recFST_PJ_BUDGET_DETAIL.PJ_BUDGET_DETAIL_NO    --  1 案件予算積上明細番号
               ,numMaxSeqNO                                    --  2 SEQNO
               ,vc2NewOd_No                                    --  3 オーダデマンド番号
               ,recFST_PJ_BUDGET_DETAIL.PROJECT_CD             --  4 案件番号
               ,recFST_PJ_BUDGET_DETAIL.ESTIMATE_NO            --  5 見積番号
               ,recFST_PJ_BUDGET_DETAIL.DETAL_NO               --  6 明細番号
               ,recFST_PJ_BUDGET_DETAIL.ODR_NO                 --  7 受注番号
               ,recFST_PJ_BUDGET_DETAIL.ESTIMATE_TYPE          --  8 手配品目種
               ,recFST_PJ_BUDGET_DETAIL.ODR_ACPT_DATE          --  9 受注日
               ,recFST_PJ_BUDGET_DETAIL.PLANT_CD               -- 10 工場コード
               ,recFST_PJ_BUDGET_DETAIL.JOB_ODR_CD             -- 11 製番
               ,recFST_PJ_BUDGET_DETAIL.JOB_ODR_DETAIL_NO      -- 12 製番枝番
               ,recFST_PJ_BUDGET_DETAIL.JOB_ODR_CANCEL_NO      -- 13 製番取消発生番号
               ,recFST_PJ_BUDGET_DETAIL.ROOT_ITEM_CD           -- 14 最上位品目番号
               ,recFST_PJ_BUDGET_DETAIL.PARENT_ITEM_CD         -- 15 親品目番号
               ,recFST_PJ_BUDGET_DETAIL.ITEM_CD                -- 16 品目番号
               ,9                                              -- 17 オーダ状態区分
               ,0                                              -- 18 デマンド状態区分
               ,2                                              -- 19 オーダデマンド区分
               ,recFST_PJ_BUDGET_DETAIL.DUE_DATE               -- 20 要求納期
               ,recFST_PJ_BUDGET_DETAIL.ODR_START_DATE         -- 21 手配着手日
               ,recFST_PJ_BUDGET_DETAIL.PRD_DUE_DATE           -- 22 製造納期
               ,recFST_PJ_BUDGET_DETAIL.PRD_START_DATE         -- 23 製造着手日
               ,0                                              -- 24 デマンド数
               ,pvc2AlcdQty                                    -- 25 オーダ数
               ,recFST_PJ_BUDGET_DETAIL.MRP_ODR_TYP            -- 26 品目手配区分
               ,recFST_PJ_BUDGET_DETAIL.OUTSIDE_TYP            -- 27 所要量内外作区分
               ,recFST_PJ_BUDGET_DETAIL.PRODUCT_TYP            -- 28 製品区分
               ,recFST_PJ_BUDGET_DETAIL.UNIT_QTY_TYP           -- 29 在庫数単位区分
               ,recFST_PJ_BUDGET_DETAIL.PS_UNIT_QTY            -- 30 製品構成単位数
               ,recFST_PJ_BUDGET_DETAIL.PS_UNIT_DENOMINATOR    -- 31 製品構成単位数分母
               ,recFST_PJ_BUDGET_DETAIL.PS_UNIT_NUMERATOR      -- 32 製品構成単位数分子
               ,0                                              -- 33 入庫累計数
               ,0                                              -- 34 出庫累計数
               ,numOd_Level_No                                 -- 35 所要量レベル番号
               ,recFST_PJ_BUDGET_DETAIL.PARENT_SEQNO           -- 36 親SEQNO
               ,recFST_PJ_BUDGET_DETAIL.ITEM_SPOIL             -- 37 所要量品目仕損率
               ,recFST_PJ_BUDGET_DETAIL.PS_SPOIL               -- 38 所要量構成仕損率
               ,recFST_PJ_BUDGET_DETAIL.CONS_TYP               -- 39 構成支給区分
               ,pvc2AlcdQty                                    -- 40 必要所要量
               ,recFST_PJ_BUDGET_DETAIL.PS_INPUT_RATIO         -- 41 構成仕損増分係数
               ,recFST_PJ_BUDGET_DETAIL.ITEM_INPUT_RATIO       -- 42 品目仕損増分係数
               ,null                                           -- 43 取引先コード
               ,0                                              -- 44 手配残　材料費
               ,0                                              -- 45 手配残　加工費
               ,0                                              -- 46 手配残　外注費
               ,0                                              -- 47 手配残　役務費
               ,0                                              -- 48 消化実績　材料費
               ,0                                              -- 49 消化実績　加工費
               ,0                                              -- 50 消化実績　外注費
               ,0                                              -- 51 消化実績　役務費
               ,0                                              -- 52 落着見込　材料費
               ,0                                              -- 53 落着見込　加工費
               ,0                                              -- 54 落着見込　外注費
               ,0                                              -- 55 落着見込　役務費
               ,recFST_PJ_BUDGET_DETAIL.DMY_ITEM_FLG           -- 56 擬似品目フラグ
               ,recFST_PJ_BUDGET_DETAIL.VOLUNT_SPL_FLG         -- 57 無償受給品フラグ
               ,recFST_PJ_BUDGET_DETAIL.COST_UP_TYP            -- 58 原価積上区分
               ,recFST_PJ_BUDGET_DETAIL.ONEROUS_CONS_FLG       -- 59 有償支給品フラグ
               ,recFST_PJ_BUDGET_DETAIL.BUDGET_STACK_TYP       -- 60 予算積上げ区分
               ,1                                              -- 61 オーダ発効済フラグ
               ,recFST_PJ_BUDGET_DETAIL.OD_NO                  -- 62 元オーダデマンド番号
               ,null                                           -- 63 元製番
               ,0                                              -- 64 元製番枝番
               ,0                                              -- 65 元オーダ数
               ,null                                           -- 66 入出庫発生区分
               ,0                                              -- 67 引当在庫有無フラグ
               ,0                                              -- 68 在庫引当所要量展開区分
               ,1                                              -- 69 引当在庫区分
               ,1                                              -- 70 引当在庫区率
               ,SYSDATE                                        -- 71 作成日
               ,pvc2UserId                                     -- 72 作成者
               ,'FNCPJSUBPLUSSTOCKMAKE'                        -- 73 作成プログラム名
               ,SYSDATE                                        -- 74 更新日
               ,pvc2UserId                                     -- 75 更新者
               ,'FNCPJSUBPLUSSTOCKMAKE'                        -- 76 更新プログラム名
               ,0);                                            -- 77 更新数
        
        
    EXCEPTION
        WHEN OTHERS THEN
            -- 案件予算積上明細失敗
            vc2Comment := SUBSTR('05:INSERT UT_PURCH_OPER_BUDGET'       ||
                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                 1, 256);
            RAISE excOTHER_ERR;
    END;
    
/*------------------------------------------------------------
'　余剰在庫在構成展開情報作成
-------------------------------------------------------------*/
vc2RunChkComment := '●●●●通過 00030';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    LOOP
        -- 案件予算積上明細カーソルOPEN

        BEGIN
            OPEN curLVL_PJ_BUDGET_DETAIL(recFST_PJ_BUDGET_DETAIL.PJ_BUDGET_DETAIL_NO,recFST_PJ_BUDGET_DETAIL.OD_NO,numOd_Level_No);
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment := SUBSTR(' 30:OPEN recLVL_PJ_BUDGET_DETAIL'      ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                     1,256);
                RAISE;
        END;
        
        -- 案件予算積上明細カーソルFETCH
        BEGIN
            FETCH curLVL_PJ_BUDGET_DETAIL INTO recLVL_PJ_BUDGET_DETAIL;
        EXCEPTION
            WHEN OTHERS THEN
                -- カーソルFETCH失敗
                vc2Comment  := SUBSTR(' 30:recLVL_PJ_BUDGET_DETAIL'    ||
                                      ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                      ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                      1,256);
                RAISE;
        END;
        
        -- 案件予算積上明細カーソル
        EXIT WHEN  curLVL_PJ_BUDGET_DETAIL%NOTFOUND;
        
        
        -- レベル番号のアップ
        numOd_Level_No          :=  numOd_Level_No + 1;    -- 階層レベル
        
        
        LOOP        
        -- 製品構成カーソルOPEN

            BEGIN
                OPEN curM_PS(recLVL_PJ_BUDGET_DETAIL.ITEM_CD,datDue_Date);
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment := SUBSTR('01:OPEN recLVL_PJ_BUDGET_DETAIL'      ||
                                         ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                         ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                         1,256);
                    RAISE;
            END;
            

        	LOOP
                -- 製品構成カーソルFETCH
                BEGIN
                    FETCH curM_PS  INTO recM_PS;
                EXCEPTION
                    WHEN OTHERS THEN
                        -- カーソルFETCH失敗
                        vc2Comment  := SUBSTR(' 02:curM_PS'       ||
                                              ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                              ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                              1,256);
                        RAISE;
                END;
            
                -- 製品構成カーソルEND
                EXIT WHEN  curM_PS%NOTFOUND;
                
                /* 予算積上げ用オーダデマンド番号取得 */
                blnRet := FncGetNewPjOdNo(pFileHandle
                                          ,pvc2LogMode
                                          ,pvc2OutputMode
                                          ,pvc2UserId
                                          ,pvc2BusinessName
                                          ,pvc2PlantCd
                                          ,vc2NewOd_No
                                          );
                IF blnRet = FALSE THEN
                    RAISE excGetNewPjOdNo;
                END IF;
                
                -- SEQNO カウントアップ
                numMaxSeqNO    :=  numMaxSeqNO +   1;
    
                /*  オーダデマンド区分 */
                CASE
                WHEN recM_PS.MRP_ODR_TYP in (1 , 2) THEN 
                     numOD_TYP        :=  1;
                WHEN recM_PS.MRP_ODR_TYP in (4 , 5 , 6 , 7) THEN
                     numOD_TYP        :=  3;
                WHEN recM_PS.MRP_ODR_TYP = 8 THEN
                     numOD_TYP        :=  4;
                END CASE;
    
                /*  製品構成単位数,デマンド数,オーダ数 */
                IF recM_PS.UNIT_QTY_TYP = 1 THEN                 --在庫数量単位区分=1(整数)
                   
                   /*  製品構成単位数 */
                   numPS_UNIT_QTY := CEIL(recM_PS.PS_UNIT_NUMERATOR / recM_PS.PS_UNIT_DENOMINATOR);
                   
                   /*  デマンド数 */
                   numDM_QTY := CEIL(recLVL_PJ_BUDGET_DETAIL.NECESSARY_QTY *
                                    (1+ recM_PS.PS_SPOIL /100) *
                                    (recM_PS.PS_UNIT_NUMERATOR / recM_PS.PS_UNIT_DENOMINATOR));
                                    
                   /*  オーダ */
                   numODR_QTY := CEIL(numDM_QTY * 
                                     (1 + recM_PS.ITEM_SPOIL / 100));
                ELSE
                   /*  製品構成単位数 */
                   numPS_UNIT_QTY := CEIL((recM_PS.PS_UNIT_NUMERATOR / recM_PS.PS_UNIT_DENOMINATOR) * 10000) / 10000 ;
                   
                   /*  デマンド数 */
                   numDM_QTY := CEIL((recLVL_PJ_BUDGET_DETAIL.NECESSARY_QTY *
                                     (1+ recM_PS.PS_SPOIL /100) *
                                     (recM_PS.PS_UNIT_NUMERATOR / recM_PS.PS_UNIT_DENOMINATOR)) * 10000) / 10000 ;
                   
                   /*  オーダ */
                   numODR_QTY := CEIL((numDM_QTY * 
                                      (1+ recM_PS.ITEM_SPOIL /100)) * 10000) / 10000 ;
                END IF;
                
                
                /*  擬似品目フラグ  */
                IF recM_PS.MRP_ODR_TYP = 8 THEN
                    numDMY_ITEM_FLG      := 1;
                ELSE
                    numDMY_ITEM_FLG      := 0;
                END IF;
                
                /*  無償受給品フラグ  */
                IF recM_PS.SPL_ITEM_TYP = 2 THEN
                    numVOLUNT_SPL_FLG      := 1;
                ELSE
                    numVOLUNT_SPL_FLG      := 0;
                END IF;
                
                /*  構成仕損増分係数  */
                numPS_INPUT_RATIO           := CEIL((1+ recM_PS.PS_SPOIL /100) * 10000) / 10000 ;
                
                /*  品目仕損増分係数  */
                IF recM_PS.MRP_ODR_TYP = 8 THEN
                   numITEM_INPUT_RATIO         := CEIL(((1+ recM_PS.ITEM_SPOIL /100)) * 10000) / 10000 ;
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
                           ,ODR_COST_MATERIAL           -- 44 手配残　材料費
                           ,ODR_COST_PROCESS            -- 45 手配残　加工費
                           ,ODR_COST_OUTSOUCE           -- 46 手配残　外注費
                           ,ODR_COST_SERVICE            -- 47 手配残　役務費
                           ,CMP_COST_MATERIAL           -- 48 消化実績　材料費
                           ,CMP_COST_PROCESS            -- 49 消化実績　加工費
                           ,CMP_COST_OUTSOUCE           -- 50 消化実績　外注費
                           ,CMP_COST_SERVICE            -- 51 消化実績　役務費
                           ,EXP_COST_MATERIAL           -- 52 落着見込　材料費
                           ,EXP_COST_PROCESS            -- 53 落着見込　加工費
                           ,EXP_COST_OUTSOUCE           -- 54 落着見込　外注費
                           ,EXP_COST_SERVICE            -- 55 落着見込　役務費
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
                            recFST_PJ_BUDGET_DETAIL.PJ_BUDGET_DETAIL_NO    --  1 案件予算積上明細番号
                           ,numMaxSeqNO                                    --  2 SEQNO
                           ,vc2NewOd_No                                    --  3 オーダデマンド番号
                           ,recFST_PJ_BUDGET_DETAIL.PROJECT_CD             --  4 案件番号
                           ,recFST_PJ_BUDGET_DETAIL.ESTIMATE_NO            --  5 見積番号
                           ,recFST_PJ_BUDGET_DETAIL.DETAL_NO               --  6 明細番号
                           ,recFST_PJ_BUDGET_DETAIL.ODR_NO                 --  7 受注番号
                           ,recFST_PJ_BUDGET_DETAIL.ESTIMATE_TYPE          --  8 手配品目種
                           ,recFST_PJ_BUDGET_DETAIL.ODR_ACPT_DATE          --  9 受注日
                           ,recFST_PJ_BUDGET_DETAIL.PLANT_CD               -- 10 工場コード
                           ,recFST_PJ_BUDGET_DETAIL.JOB_ODR_CD             -- 11 製番
                           ,recFST_PJ_BUDGET_DETAIL.JOB_ODR_DETAIL_NO      -- 12 製番枝番
                           ,recFST_PJ_BUDGET_DETAIL.JOB_ODR_CANCEL_NO      -- 13 製番取消発生番号
                           ,recFST_PJ_BUDGET_DETAIL.ROOT_ITEM_CD           -- 14 最上位品目番号
                           ,recM_PS.PARENT_ITEM_CD                         -- 15 親品目番号
                           ,recM_PS.COMP_ITEM_CD                           -- 16 品目番号
                           ,9                                              -- 17 オーダ状態区分
                           ,9                                              -- 18 デマンド状態区分
                           ,numOD_TYP                                      -- 19 オーダデマンド区分
                           ,datDue_Date                                    -- 20 要求納期
                           ,datDue_Date                                    -- 21 手配着手日
                           ,datDue_Date                                    -- 22 製造納期
                           ,datDue_Date                                    -- 23 製造着手日
                           ,numDM_QTY                                      -- 24 デマンド数
                           ,numODR_QTY                                     -- 25 オーダ数
                           ,recM_PS.MRP_ODR_TYP                            -- 26 品目手配区分
                           ,recM_PS.OUTSIDE_TYP                            -- 27 所要量内外作区分
                           ,recM_PS.PRODUCT_TYP                            -- 28 製品区分
                           ,recM_PS.UNIT_QTY_TYP                           -- 29 在庫数単位区分
                           ,numPS_UNIT_QTY                                 -- 30 製品構成単位数
                           ,recM_PS.PS_UNIT_DENOMINATOR                    -- 31 製品構成単位数分母
                           ,recM_PS.PS_UNIT_NUMERATOR                      -- 32 製品構成単位数分子
                           ,0                                              -- 33 入庫累計数
                           ,0                                              -- 34 出庫累計数
                           ,numOd_Level_No                                 -- 35 所要量レベル番号
                           ,recLVL_PJ_BUDGET_DETAIL.SEQNO                  -- 36 親オーダデマンド番号
                           ,recM_PS.ITEM_SPOIL                             -- 37 所要量品目仕損率
                           ,recM_PS.PS_SPOIL                               -- 38 所要量構成仕損率
                           ,recM_PS.CONS_TYP                               -- 39 構成支給区分
                           ,numODR_QTY                                     -- 40 必要所要量
                           ,numPS_INPUT_RATIO                              -- 41 構成仕損増分係数
                           ,numITEM_INPUT_RATIO                            -- 42 品目仕損増分係数
                           ,null                                           -- 43 取引先コード
                           ,0                                              -- 44 手配残　材料費
                           ,0                                              -- 45 手配残　加工費
                           ,0                                              -- 46 手配残　外注費
                           ,0                                              -- 47 手配残　役務費
                           ,0                                              -- 48 消化実績　材料費
                           ,0                                              -- 49 消化実績　加工費
                           ,0                                              -- 50 消化実績　外注費
                           ,0                                              -- 51 消化実績　役務費
                           ,0                                              -- 52 落着見込　材料費
                           ,0                                              -- 53 落着見込　加工費
                           ,0                                              -- 54 落着見込　外注費
                           ,0                                              -- 55 落着見込　役務費
                           ,numDMY_ITEM_FLG                                -- 56 擬似品目フラグ
                           ,numVOLUNT_SPL_FLG                              -- 57 無償受給品フラグ
                           ,recM_PS.COST_UP_TYP                            -- 58 原価積上区分
                           ,0                                              -- 59 有償支給品フラグ
                           ,1                                              -- 60 予算積上げ区分
                           ,1                                              -- 61 オーダ発効済フラグ
                           ,recFST_PJ_BUDGET_DETAIL.OD_NO                  -- 62 元オーダデマンド番号
                           ,null                                           -- 63 元製番
                           ,0                                              -- 64 元製番枝番
                           ,0                                              -- 65 元オーダ数
                           ,null                                           -- 66 入出庫発生区分
                           ,0                                              -- 67 引当在庫有無フラグ
                           ,0                                              -- 68 在庫引当所要量展開区分
                           ,1                                              -- 69 引当在庫区分
                           ,1                                              -- 70 引当在庫区率
                           ,SYSDATE                                        -- 71 作成日
                           ,pvc2UserId                                     -- 72 作成者
                           ,'FNCPJSUBPLUSSTOCKMAKE'                        -- 73 作成プログラム名
                           ,SYSDATE                                        -- 74 更新日
                           ,pvc2UserId                                     -- 75 更新者
                           ,'FNCPJSUBPLUSSTOCKMAKE'                        -- 76 更新プログラム名
                           ,0);                                            -- 77 更新数
                    
                    
                EXCEPTION
                    WHEN OTHERS THEN
                        -- 案件予算積上明細失敗
                        vc2Comment := SUBSTR('05:INSERT UT_PURCH_OPER_BUDGET'       ||
                                             ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                             ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                             1, 256);
                        RAISE excOTHER_ERR;
                END;
                
            END LOOP;

            -- 案件予算積上明細カーソルCLOSE
            CLOSE curM_PS;


            -- 案件予算積上明細カーソルFETCH
            BEGIN
                FETCH curLVL_PJ_BUDGET_DETAIL INTO recLVL_PJ_BUDGET_DETAIL;
            EXCEPTION
                WHEN OTHERS THEN
                    -- カーソルFETCH失敗
                    vc2Comment  := SUBSTR(' 02:recLVL_PJ_BUDGET_DETAIL'    ||
                                          ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                          ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                          1,256);
                    RAISE;
             END;
             -- 製品構成カーソルEND
             EXIT WHEN  curLVL_PJ_BUDGET_DETAIL%NOTFOUND;

        END LOOP;
        
        -- 案件予算積上明細カーソルCLOSE
        CLOSE curLVL_PJ_BUDGET_DETAIL;
    
    END LOOP;

/*------------------------------------------------------------
'　修了処理
-------------------------------------------------------------*/
vc2RunChkComment := '●●●●通過 00090';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- 案件予算積上明細カーソルCLOSE
    CLOSE curFST_PJ_BUDGET_DETAIL;

    /* TraceLog の出力 */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 修了 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
    COMMIT;
    RETURN TRUE;

--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN excParameterErr THEN         --カーソルエラー
        -- ロールバック
        --ROLLBACK;

        pvc2ErrorCd := APS_COM_NOTEXIST_PJ_BUDGET_DTL;
        -- カーソルのクローズ処理
        -- 案件予算明細(展開元)カーソル
        IF curFST_PJ_BUDGET_DETAIL%ISOPEN = TRUE THEN
            CLOSE curFST_PJ_BUDGET_DETAIL;
        END IF;
        -- 案件予算明細(階層レベル)
        IF curLVL_PJ_BUDGET_DETAIL%ISOPEN = TRUE THEN
            CLOSE curLVL_PJ_BUDGET_DETAIL;
        END IF;
        -- 構成(親品目からのシングル正展開用)
        IF curM_PS%ISOPEN = TRUE THEN
            CLOSE curM_PS;
        END IF;
        
        /* 業務メッセージの出力 */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                            pvc2PlantCd, MY_SQL_NAME, LOGMSG_PARAM, vc2Comment);
        
        /* トレースの出力 */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                              pvc2PlantCd, MY_SQL_NAME, LOGMSG_PARAM);

        /* LogFile の CLOSE */
        --blnRet := FNCLOGCLOSE(UTL_FileHandle);

        /* コミット */
        --COMMIT;

        /* 異常終了 */
        RETURN FALSE;

    WHEN excGetNewPjOdNo THEN         --予算積上げ用オーダデマンド番号エラー
        -- ロールバック
        ROLLBACK;

        pvc2ErrorCd := APS_COM_MISTAKE_NATIVE_PARAM;
        -- カーソルのクローズ処理
        --案件予算明細(展開元)カーソル
        IF curFST_PJ_BUDGET_DETAIL%ISOPEN = TRUE THEN
            CLOSE curFST_PJ_BUDGET_DETAIL;
        END IF;
        
        /* 業務メッセージの出力 */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                            pvc2PlantCd, MY_SQL_NAME, LOGMSG_NEWODRNO, vc2Comment);
        
        /* トレースの出力 */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                              pvc2PlantCd, MY_SQL_NAME, LOGMSG_NEWODRNO);

        /* LogFile の CLOSE */
        --blnRet := FNCLOGCLOSE(UTL_FileHandle);

        /* コミット */
        --COMMIT;

        /* 異常終了 */
        RETURN FALSE;

    WHEN excFncTraceLog THEN
        --ROLLBACK;
        RETURN FALSE;
     
    WHEN OTHERS THEN   --その他のエラー
        /* カーソルのクローズ */
        -- 案件予算明細(展開元)カーソル
        IF curFST_PJ_BUDGET_DETAIL%ISOPEN = TRUE THEN
            CLOSE curFST_PJ_BUDGET_DETAIL;
        END IF;
        -- 案件予算明細(階層レベル)
        IF curLVL_PJ_BUDGET_DETAIL%ISOPEN = TRUE THEN
            CLOSE curLVL_PJ_BUDGET_DETAIL;
        END IF;
        -- 構成(親品目からのシングル正展開用)
        IF curM_PS%ISOPEN = TRUE THEN
            CLOSE curM_PS;
        END IF;

        /* ErrorLog の出力 */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, SQLCODE, SQLERRM);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        /* ロールバック */
        ROLLBACK;
        
        /* 異常終了 */
        RETURN FALSE;
END;
/
