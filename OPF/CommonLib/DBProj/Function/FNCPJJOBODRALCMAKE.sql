CREATE OR REPLACE FUNCTION FNCPJJOBODRALCMAKE(
/*------------------------------------------------------------------------------
'
' version   : 1.00.01
'
' 修正履歴
' 2014.04.15 初版
'
' 機能      : 案件予算製番引当品作成処理
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
' 機能説明  : 案件予算製番引当品作成処理。
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
   ,pvc2JobOdrCD           IN  VARCHAR2            --製番
   ,pvc2JobOdrDetailNo     IN  NUMBER              --製番枝番
   ,pvc2AlcdQty            IN  NUMBER              --引当数
   ,pvc2ErrorCd            OUT VARCHAR2            --エラーコード
) RETURN BOOLEAN
IS
PRAGMA AUTONOMOUS_TRANSACTION;

-- カーソルの宣言
    -- 案件予算明細(展開元)
    CURSOR curJOB_PJ_BUDGET_DETAIL(
                  cv2PjBudgetDetailNo  VARCHAR
                 ,numSeqno             NUMBER
    )
    IS
        SELECT /*+ RULE */
               PJ.PJ_BUDGET_DETAIL_NO           -- 案件予算積上明細番号
              ,PJ.SEQNO                         -- SEQNO
              ,OD_NO                            -- オーダデマンド番号
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
              ,PJ.MRP_ODR_TYP                   -- 品目手配区分
              ,PJ.OUTSIDE_TYP                   -- 所要量内外作区分
              ,PJ.OD_LEVEL_NO                   -- 所要量レベル番号
              ,PJ.ODR_QTY                       -- オーダ数
              ,PJ.ALC_STOCK_RATE                -- 引当在庫率
              ,IT.PRODUCT_TYP                   -- 製品区分
              ,IT.UNIT_QTY_TYP                  -- 在庫数単位区分
        FROM   T_PJ_BUDGET_DETAIL PJ,
               M_ITEM             IT
        WHERE  PJ.PJ_BUDGET_DETAIL_NO     = cv2PjBudgetDetailNo
        AND    PJ.SEQNO                   = numSeqno
        AND    IT.ITEM_CD                 = PJ.ITEM_CD
        ;
    -- ROWTYPE の宣言
    recJOB_PJ_BUDGET_DETAIL  curJOB_PJ_BUDGET_DETAIL%ROWTYPE;
    
    -- 所要量(製番指定)
    CURSOR curJOB_OD(
               cvc2PLANT_CD             IN VARCHAR2     -- 工場コード
             , cvc2JOB_ODR_CD           IN VARCHAR2     -- 製番 
             , cvc2JOB_ODR_DETAIL_NO    IN NUMBER       -- 製番枝番
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
              ,OD.PARENT_OD_NO                  -- 親SEQNO
              ,OD.ITEM_SPOIL                    -- 所要量品目仕損率
              ,OD.PS_SPOIL                      -- 所要量構成仕損率
              ,OD.CONS_TYP                      -- 構成支給区分
              ,OD.MRP_TYP                       -- 所要量処理区分
              ,OD.ODR_RELEASE_FLG               -- オーダ発効済フラグ
--              ,IT.OUTSIDE_TYP                   -- 所要量内外作区分
--              ,IT.MRP_ODR_TYP                   -- 品目手配区分
              ,IT.PRODUCT_TYP                   -- 製品区分
              ,IT.UNIT_QTY_TYP                  -- 在庫数単位区分
              ,IT.SPL_ITEM_TYP                  -- 受給品区分
--              ,IT.ITEM_SPOIL                    -- 品目仕損率
        FROM   T_OD    OD
              ,M_ITEM  IT
        WHERE  OD.PLANT_CD             =  cvc2PLANT_CD            -- 展開元の[案件予算積上明細].“案件予算積上明細番号”
        AND    OD.JOB_ODR_CD           =  cvc2JOB_ODR_CD          -- 製番
        AND    OD.JOB_ODR_DETAIL_NO    =  cvc2JOB_ODR_DETAIL_NO   -- 製番枝番
        AND    OD.JOB_ODR_CANCEL_NO    =  0                       -- 製番取消発生番号
        AND    IT.ITEM_CD              =  OD.ITEM_CD
        ORDER  BY OD.OD_LEVEL_NO ASC ,OD.ITEM_CD ASC
        ;

/* 定数の宣言 */
    MY_SQL_NAME             VARCHAR2(120)  := 'FncPjJobOdrAlcMAKE';      --ＰＬ／ＳＱＬ名
    
    
/* 変数の宣言 */
    UTL_FileHandle          UTL_FILE.FILE_TYPE; -- ファイルハンドル
    blnRet                  BOOLEAN;            -- 関数戻り値
    intRet                  INTEGER;            -- 関数戻り値
    vc2Comment              VARCHAR2(1024);     -- メッセージ用コメント作成作業領域
    vc2RunChkComment        VARCHAR2(1024);     -- 実行位置確認用コメント作成作業領域
    vc2TraceComment         VARCHAR2(1024);     -- トレーース出力用コメント作成作業領域（入力パラメータ記録用）
    numCount1               NUMBER(6);          -- 件数チェック用１
    numCountRec             NUMBER(6);          -- 件数チェック用
    numMaxSeqNO             NUMBER(6);          -- SEQNO
    numPsUnitQty            NUMBER(22,8);       -- 数量ワーク
    numOd_Level_No          NUMBER(6);          -- 階層レベル
    datDue_Date             DATE;               -- 基準日
    numAlcStockRate         NUMBER(9,4);        -- 引当在庫率
    vc2NewOd_No             VARCHAR2(100);      -- 予算積上げ用オーダデマンド番号
    
    vc2PARENT_ITEM_CD       T_OD.ITEM_CD%TYPE;                         -- 親品目番号
    numCOST_UP_TYP          M_PS.COST_UP_TYP%TYPE;                     -- 原価積上区分
    numALC_STOCK_FLG        T_PJ_BUDGET_DETAIL.ALC_STOCK_FLG%TYPE;     -- 引当在庫有無フラグ
    numDMY_ITEM_FLG         T_PJ_BUDGET_DETAIL.DMY_ITEM_FLG%TYPE;      -- 擬似品目フラグ
    numDM_QTY               T_OD.DM_QTY%TYPE;                          -- デマンド数
    numVOLUNT_SPL_FLG       T_PJ_BUDGET_DETAIL.VOLUNT_SPL_FLG%TYPE;    -- 受給品フラグ
    numPS_INPUT_RATIO       T_PJ_BUDGET_DETAIL.PS_INPUT_RATIO%TYPE;    -- 構成仕損増分係数
    numITEM_INPUT_RATIO     T_PJ_BUDGET_DETAIL.ITEM_INPUT_RATIO%TYPE;  -- 品目仕損増分係数
    numPARENT_SEQNO         T_PJ_BUDGET_DETAIL.PARENT_SEQNO%TYPE;      -- 親SEQNO
    
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
    excMasterErr                        EXCEPTION;    --参照マスタ未存在エラー

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
'　製番引当元情報取得
-------------------------------------------------------------*/
vc2RunChkComment := '●●●●通過 00010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- 案件予算積上明細カーソルOPEN
    BEGIN
        OPEN curJOB_PJ_BUDGET_DETAIL(pcv2PjBudgetDetailNo,pvc2Seqno);
    EXCEPTION
        WHEN OTHERS THEN
            vc2Comment := SUBSTR('01:OPEN curJOB_PJ_BUDGET_DETAIL'      ||
                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                 1,256);
            RAISE excParameterErr;
    END;

    -- 案件予算積上明細カーソルFETCH
    BEGIN
        FETCH curJOB_PJ_BUDGET_DETAIL INTO recJOB_PJ_BUDGET_DETAIL;
    EXCEPTION
        WHEN OTHERS THEN
            -- カーソルFETCH失敗
            vc2Comment  := SUBSTR(' 02:FETCH curJOB_PJ_BUDGET_DETAIL'    ||
                                  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                  1,256);
            RAISE excParameterErr;
    END;
    
    IF curJOB_PJ_BUDGET_DETAIL%NOTFOUND THEN
       
       RAISE excParameterErr;
    END IF;
    
    -- 最大SEQNO取得
    BEGIN
        SELECT MAX(SEQNO)                  INTO numMaxSeqNO
        FROM   T_PJ_BUDGET_DETAIL
        WHERE  PJ_BUDGET_DETAIL_NO         =  recJOB_PJ_BUDGET_DETAIL.PJ_BUDGET_DETAIL_NO;
    EXCEPTION
        WHEN OTHERS THEN
            -- カーソルFETCH失敗
            vc2Comment  := SUBSTR(' SELECT T_PJ_BUDGET_DETAIL'    ||
                                  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                  1,256);
            RAISE;
    END;

    -- 展開元の情報のセット
    numOd_Level_No        :=  recJOB_PJ_BUDGET_DETAIL.OD_LEVEL_NO;    -- 階層レベル
    datDue_Date           :=  recJOB_PJ_BUDGET_DETAIL.DUE_DATE;       -- 要求納期
    
    
    numCount1             :=  0;                                      -- 件数カウント
    vc2TmpMessage :=  '階層レベル:' || numOd_Level_No ||
                      '要求納期  :' || to_char(datDue_Date, 'YYYYMMDD');
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment || vc2TmpMessage);

/*------------------------------------------------------------
'　製番引当手配情報作成
-------------------------------------------------------------*/
vc2RunChkComment := '●●●●通過 00020';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- 処理順はレベル番号,品目番号の昇順
    FOR recJOB_OD IN curJOB_OD(pvc2PlantCd,pvc2JobOdrCD,pvc2JobOdrDetailNo) LOOP
    
        /* 最上位品１件目の時 */
        numCount1   :=  numCount1  +  1;


        IF numCount1 = 1       THEN
           numAlcStockRate     :=  CEIL((pvc2AlcdQty / recJOB_OD.ODR_QTY) * recJOB_PJ_BUDGET_DETAIL.ALC_STOCK_RATE * 10000) / 10000 ; -- 引当在庫区分
        END IF;
    
        -- SEQNO カウントアップ
        numMaxSeqNO    :=  numMaxSeqNO +   1;
    
        -- 上位手配情報取得
        IF  recJOB_OD.PARENT_OD_NO   is Null  THEN
            vc2PARENT_ITEM_CD  :=  Null;
            numCOST_UP_TYP     :=  1; 
        ELSE
        -- 上位手配品の所要量を検索う
            BEGIN
                SELECT  ITEM_CD INTO vc2PARENT_ITEM_CD
                    FROM   T_OD
                    WHERE  OD_NO               =  recJOB_OD.PARENT_OD_NO;   -- 親SEQNO
            EXCEPTION
                WHEN NO_DATA_FOUND THEN
                    RAISE excMasterErr;
                WHEN OTHERS THEN
                    RAISE;
            END;
        
        -- 製品構成情報取得
            BEGIN
                SELECT /*+ RULE */
                       COST_UP_TYP INTO numCOST_UP_TYP
                FROM   M_PS
                WHERE  PARENT_ITEM_CD      =  vc2PARENT_ITEM_CD         -- 親品目番号
                AND    COMP_ITEM_CD        =  recJOB_OD.ITEM_CD         -- 品目番号
                AND    EFF_PHASE_IN_DATE   <= datDue_Date               -- 製品構成有効開始日
                AND    EFF_PHASE_OUT_DATE  >= datDue_Date;              -- 製品構成有効開始日
            EXCEPTION
                WHEN NO_DATA_FOUND THEN
                    RAISE excMasterErr;
                WHEN OTHERS THEN
                    RAISE;
            END;
        END IF;
        
        -- 製番手配
        BEGIN
            SELECT COUNT(*)            INTO numCountRec
            FROM   T_JOB_ODR_ALC
            WHERE  OD_NO               =  recJOB_OD.OD_NO;
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
        IF recJOB_OD.MRP_ODR_TYP = 8 THEN
            numDMY_ITEM_FLG      := 1;
        ELSE
            numDMY_ITEM_FLG      := 0;
        END IF;

        /*  無償受給品フラグ  */
        IF recJOB_OD.SPL_ITEM_TYP = 2 THEN
            numVOLUNT_SPL_FLG      := 1;
        ELSE
            numVOLUNT_SPL_FLG      := 0;
        END IF;
        
        /*  構成仕損増分係数  */
        numPS_INPUT_RATIO           := CEIL((1+ recJOB_OD.PS_SPOIL /100) * 10000) / 10000 ;

        /*  品目仕損増分係数  */
        IF recJOB_OD.MRP_ODR_TYP = 8 THEN
           numITEM_INPUT_RATIO         := CEIL(((1+ recJOB_OD.ITEM_SPOIL /100)) * 10000) / 10000 ;
        ELSE
           numITEM_INPUT_RATIO         := 1.0;
        END IF;

        /*  親SEQNO  */
        IF  recJOB_OD.PARENT_OD_NO     IS Null   THEN
            numPARENT_SEQNO         :=  recJOB_PJ_BUDGET_DETAIL.SEQNO;  
        ELSE
            BEGIN
                SELECT /*+ RULE */
                       SEQNO  INTO numPARENT_SEQNO
                FROM   T_PJ_BUDGET_DETAIL
                WHERE  PJ_BUDGET_DETAIL_NO      =  recJOB_PJ_BUDGET_DETAIL.PJ_BUDGET_DETAIL_NO         -- 案件予算積上明細番号
                AND    OD_NO                    =  recJOB_OD.PARENT_OD_NO                              -- 親オーダデマンド番号
                AND    ORG_JOB_ODR_CD           =  pvc2JobOdrCD                                        -- 元製番
                AND    ORG_JOB_ODR_DETAIL_NO    =  pvc2JobOdrDetailNo                                  -- 元製番枝番
                ;
            EXCEPTION
                WHEN NO_DATA_FOUND THEN
                    RAISE excMasterErr;
                WHEN OTHERS THEN
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
                    recJOB_PJ_BUDGET_DETAIL.PJ_BUDGET_DETAIL_NO    --  1 案件予算積上明細番号
                   ,numMaxSeqNO                                    --  2 SEQNO
                   ,recJOB_OD.OD_NO                                --  3 オーダデマンド番号
                   ,recJOB_PJ_BUDGET_DETAIL.PROJECT_CD             --  4 案件番号
                   ,recJOB_PJ_BUDGET_DETAIL.ESTIMATE_NO            --  5 見積番号
                   ,recJOB_PJ_BUDGET_DETAIL.DETAL_NO               --  6 明細番号
                   ,recJOB_PJ_BUDGET_DETAIL.ODR_NO                 --  7 受注番号
                   ,recJOB_PJ_BUDGET_DETAIL.ESTIMATE_TYPE          --  8 手配品目種
                   ,recJOB_PJ_BUDGET_DETAIL.ODR_ACPT_DATE          --  9 受注日
                   ,recJOB_PJ_BUDGET_DETAIL.PLANT_CD               -- 10 工場コード
                   ,recJOB_OD.JOB_ODR_CD                           -- 11 製番
                   ,recJOB_OD.JOB_ODR_DETAIL_NO                    -- 12 製番枝番
                   ,recJOB_OD.JOB_ODR_CANCEL_NO                    -- 13 製番取消発生番号
                   ,recJOB_PJ_BUDGET_DETAIL.ROOT_ITEM_CD           -- 14 最上位品目番号
                   ,vc2PARENT_ITEM_CD                              -- 15 親品目番号
                   ,recJOB_OD.ITEM_CD                              -- 16 品目番号
                   ,recJOB_OD.ODR_STS_TYP                          -- 17 オーダ状態区分
                   ,recJOB_OD.DM_STS_TYP                           -- 18 デマンド状態区分
                   ,recJOB_OD.OD_TYP                               -- 19 オーダデマンド区分
                   ,datDue_Date                                    -- 20 要求納期
                   ,datDue_Date                                    -- 21 手配着手日
                   ,datDue_Date                                    -- 22 製造納期
                   ,datDue_Date                                    -- 23 製造着手日
                   ,recJOB_OD.DM_QTY                               -- 24 デマンド数
                   ,recJOB_OD.ODR_QTY                              -- 25 オーダ数
                   ,recJOB_OD.MRP_ODR_TYP                          -- 26 品目手配区分
                   ,recJOB_OD.OUTSIDE_TYP                          -- 27 所要量内外作区分
                   ,recJOB_OD.PRODUCT_TYP                          -- 28 製品区分
                   ,recJOB_OD.UNIT_QTY_TYP                         -- 29 在庫数単位区分
                   ,recJOB_OD.PS_UNIT_QTY                          -- 30 製品構成単位数
                   ,recJOB_OD.PS_UNIT_DENOMINATOR                  -- 31 製品構成単位数分母
                   ,recJOB_OD.PS_UNIT_NUMERATOR                    -- 32 製品構成単位数分子
                   ,0                                              -- 33 入庫累計数
                   ,0                                              -- 34 出庫累計数
                   ,numOd_Level_No + recJOB_OD.OD_LEVEL_NO         -- 35 所要量レベル番号
                   ,numPARENT_SEQNO                                -- 36 親SEQNO
                   ,recJOB_OD.ITEM_SPOIL                           -- 37 所要量品目仕損率
                   ,recJOB_OD.PS_SPOIL                             -- 38 所要量構成仕損率
                   ,recJOB_OD.CONS_TYP                             -- 39 構成支給区分
                   ,recJOB_OD.ODR_QTY                              -- 40 必要所要量
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
                   ,numCOST_UP_TYP                                 -- 58 原価積上区分
                   ,0                                              -- 59 有償支給品フラグ
                   ,1                                              -- 60 予算積上げ区分
                   ,recJOB_OD.ODR_RELEASE_FLG                      -- 61 オーダ発効済フラグ
                   ,recJOB_PJ_BUDGET_DETAIL.OD_NO                  -- 62 元オーダデマンド番号
                   ,pvc2JobOdrCD                                   -- 63 元製番
                   ,pvc2JobOdrDetailNo                             -- 64 元製番枝番
                   ,pvc2AlcdQty                                    -- 65 元オーダ数
                   ,null                                           -- 66 入出庫発生区分
                   ,numALC_STOCK_FLG                               -- 67 引当在庫有無フラグ
                   ,0                                              -- 68 在庫引当所要量展開区分
                   ,2                                              -- 69 引当在庫区分
                   ,numAlcStockRate                                -- 70 引当在庫区率
                   ,SYSDATE                                        -- 71 作成日
                   ,pvc2UserId                                     -- 72 作成者
                   ,'FNCPJJOBODRALCMAKE'                           -- 73 作成プログラム名
                   ,SYSDATE                                        -- 74 更新日
                   ,pvc2UserId                                     -- 75 更新者
                   ,'FNCPJJOBODRALCMAKE'                           -- 76 更新プログラム名
                   ,0);                                            -- 77 更新数
        EXCEPTION
            WHEN OTHERS THEN
                -- 案件予算積上明細失敗
                vc2Comment := SUBSTR(' 20:INSERT T_PJ_BUDGET_DETAIL'       ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                     1, 256);
                DBMS_OUTPUT.PUT_LINE('ERROR ->'||vc2Comment);
                RAISE excOTHER_ERR;
        END;
    
    END LOOP;

/*------------------------------------------------------------
'　修了処理
-------------------------------------------------------------*/
vc2RunChkComment := '●●●●通過 00090';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- 案件予算積上明細カーソルCLOSE
--    CLOSE curJOB_OD;

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

        pvc2ErrorCd := APS_COM_ParameterErr;
        -- カーソルのクローズ処理
        --販売予実基本予算カーソル
        IF curJOB_PJ_BUDGET_DETAIL%ISOPEN = TRUE THEN
            CLOSE curJOB_PJ_BUDGET_DETAIL;
        END IF;
        
        /* 業務メッセージの出力 */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                            pvc2PlantCd, MY_SQL_NAME, pvc2ErrorCd, vc2Comment);
        
        /* トレースの出力 */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                              pvc2PlantCd, MY_SQL_NAME, LOGMSG_PARAM);

        /* LogFile の CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

        /* コミット */
        --COMMIT;

        /* 異常終了 */
        RETURN FALSE;

    WHEN excMasterErr THEN         --カーソルエラー
        -- ロールバック
        --ROLLBACK;

        pvc2ErrorCd := APS_COM_NOTEXIST_PJ_BUDGET_DTL;     --エラーコード
        -- カーソルのクローズ処理
        --販売予実基本予算カーソル
        IF curJOB_PJ_BUDGET_DETAIL%ISOPEN = TRUE THEN
            CLOSE curJOB_PJ_BUDGET_DETAIL;
        END IF;
        
        /* 業務メッセージの出力 */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                            pvc2PlantCd, MY_SQL_NAME, pvc2ErrorCd, vc2Comment);
        
        /* トレースの出力 */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                              pvc2PlantCd, MY_SQL_NAME, LOGMSG_PARAM);

        /* コミット */
        --COMMIT;

        /* 異常終了 */
        RETURN FALSE;

    WHEN excGetNewPjOdNo THEN         --予算積上げ用オーダデマンド番号エラー
        -- ロールバック
        --ROLLBACK;

        pvc2ErrorCd := APS_COM_MISTAKE_NATIVE_PARAM;
        -- カーソルのクローズ処理
        --販売予実基本予算カーソル
        IF curJOB_PJ_BUDGET_DETAIL%ISOPEN = TRUE THEN
            CLOSE curJOB_PJ_BUDGET_DETAIL;
        END IF;
        
        /* 業務メッセージの出力 */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                            pvc2PlantCd, MY_SQL_NAME, pvc2ErrorCd, vc2Comment);
        
        /* トレースの出力 */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                              pvc2PlantCd, MY_SQL_NAME, LOGMSG_NEWODRNO);

        /* コミット */
        --COMMIT;

        /* 異常終了 */
        RETURN FALSE;

    WHEN excFncTraceLog THEN
        --ROLLBACK;
        RETURN FALSE;
     
    WHEN OTHERS THEN   --その他のエラー
        /* ErrorLog の出力 */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, SQLCODE, SQLERRM);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        /* ロールバック */
        --ROLLBACK;
        
        /* 異常終了 */
        RETURN FALSE;
END;
/