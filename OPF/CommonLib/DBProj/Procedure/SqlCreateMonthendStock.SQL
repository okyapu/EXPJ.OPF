CREATE OR REPLACE procedure SqlCreateMonthendStock(
/*------------------------------------------------------------------------------
'
' version   : 1.00.00
'
' 修正履歴
' 2014.03.02 新規作成（Ja版対応）
''
' 機能      : 月末在庫作成処理
'
' 引き数    : pvc2LogMode          - (i)ＬＯＧモード
'             pvc2OutputMode       - (i)出力モード
'             pvc2OutputPath       - (i)出力ファイルパス
'             pvc2OutputName       - (i)出力ファイル名
'             pvc2UserId           - (i)ユーザＩＤ
'             pvc2BusinessName     - (i)業務名
'             pvc2PlantCd          - (i)工場コード
'             pvc2MonthlyDate      - (i)月次処理年月
'             pnumReturn           - (o)処理結果 (1:正常終了、2:異常終了)
'             pvc2ErrCode          - (o)メッセージ（エラーメッセージ）
'
' 機能説明  : 月次処理年月の月末在庫を作成する。
' 備考      :
'
------------------------------------------------------------------------------*/
--< プロシージャ名定義 >-----------------------------------------------------
    pvc2LogMode         IN  VARCHAR2,       --// ＬＯＧモード
    pvc2OutputMode      IN  VARCHAR2,       --// 出力モード
    pvc2OutputPath      IN  VARCHAR2,       --// 出力ファイルパス
    pvc2OutputName      IN  VARCHAR2,       --// 出力ファイル名
    pvc2UserId          IN  VARCHAR2,       --// ユーザ名
    pvc2BusinessName    IN  VARCHAR2,       --// 業務名
    pvc2PlantCd         IN  VARCHAR2,       --// 工場コード
    pvc2MonthlyDate     IN  VARCHAR2,       --// 月次処理対象日
    pnumReturn          OUT NUMBER,          --// 処理結果
    pvc2ErrCode         OUT VARCHAR2        --// メッセージ
) IS
    /* 定数の宣言 */
        METHOD_START                    VARCHAR2(20)  := 'Start';      --ログ用メソッド開始宣言
        METHOD_END                      VARCHAR2(12)  := 'End';        --ログ用メソッド終了宣言
        MY_SQL_NAME                     VARCHAR2(56)  := 'SqlCreateMonthendStock'; --ＰＬ／ＳＱＬ名
        LOGMSG_START_PGNM_MonthlyProc   VARCHAR2(72)  := '<< 月末在庫作成処理開始 >>';
        LOGMSG_END_PGNM_MonthlyProc     VARCHAR2(72)  := '<< 月末在庫作成処理終了 >>';
        LOGMSG_ERR                      VARCHAR2(32)  := '異常終了';
        PRVS_MONTHLY_PROC_RSLT_NODATE   VARCHAR2(28)  := 'AK00028'; --前月の月次処理履歴が存在しません。 
        STATUS_NORMAL                   NUMBER       := 1;    -- 正常終了
        STATUS_ERROR                    NUMBER       := 2;    -- 異常終了
    /* 変数の定義 */
        UTL_FileHandle                  UTL_FILE.FILE_TYPE;   -- ファイルハンドル
        lnumterm_curr                   NUMBER(5);            -- 月次処理制御ﾃｰﾌﾞﾙ件数カウント用
        lBlnRet                         BOOLEAN;              -- 共通関数の戻値
        lvc2Comment                     VARCHAR2(1024);
        lvc2Comment2                    VARCHAR2(1024);
        vc2RunChkComment                VARCHAR2(1024);       -- 実行位置確認用コメント作成作業領域
        vc2Comment                      VARCHAR2(1024);       -- メッセージ作成用
        vc2OutputFileName               VARCHAR2(160);
        vc2PrvsMonthlyProcExecDate      DATE;   --月次処理実行日
    /* 例外処理用変数 */
        excERR_SKIP                     EXCEPTION;            -- 実行不可
        excERR_CURSOR                   EXCEPTION;            -- カーソルOPEN中のEXCEPTION
    /* カーソルの宣言 */
    /* 月次処理履歴の取得（前月実行履歴取得用） */
    CURSOR curT_MONTHLY_PROC_RSLT(
          cvc2PlantCd  VARCHAR2,
          cnumYearMonth VARCHAR2
    )
    IS
    SELECT T1.MONTHLY_PROC_EXEC_DATE -- "月次処理実行日"
    FROM   T_MONTHLY_PROC_RSLT T1   -- [月次処理履歴]
    WHERE  T1.PLANT_CD   = cvc2PlantCd
    AND    T1.MONTHLY_PROC_TARGET_DATE = cnumYearMonth
    ;
    /* 保管区別月末品目在庫（存在チェック用） */
    CURSOR curT_MONTHEND_ITEM_STOCK(
          cnumYearMonth  VARCHAR2,
          cvc2PlantCd    VARCHAR2,
          cvc2WhCd       VARCHAR2,
          cvc2ItemCd     VARCHAR2
    )
    IS
    SELECT T1.MODIFY_COUNT AS MODIFY_COUNT -- "更新数"
    FROM   T_MONTHEND_ITEM_STOCK T1   -- [保管区別月末品目在庫]
    WHERE  T1.MONTHLY_PROC_TARGET_DATE = cnumYearMonth
    AND    T1.PLANT_CD   = cvc2PlantCd
    AND    T1.WH_CD      = cvc2WhCd
    AND    T1.ITEM_CD    = cvc2ItemCd
    ;
    recT_MONTHEND_ITEM_STOCK curT_MONTHEND_ITEM_STOCK%ROWTYPE;
    /* 保管区別月末ロット在庫（存在チェック用） */
    CURSOR curT_MONTHEND_LOT_STOCK(
          cnumYearMonth  VARCHAR2,
          cvc2PlantCd   VARCHAR2,
          cvc2WhCd      VARCHAR2,
          cvc2ItemCd    VARCHAR2,
          cvc2LotNo     VARCHAR2
    )
    IS
    SELECT T1.MODIFY_COUNT AS MODIFY_COUNT -- "更新数"
    FROM   T_MONTHEND_LOT_STOCK T1   -- [保管区別月末品目在庫]
    WHERE  T1.MONTHLY_PROC_TARGET_DATE = cnumYearMonth
    AND    T1.PLANT_CD                 = cvc2PlantCd
    AND    T1.WH_CD                    = cvc2WhCd
    AND    T1.ITEM_CD                  = cvc2ItemCd
    AND    T1.LOT_NO                   = cvc2LotNo;
    recT_MONTHEND_LOT_STOCK curT_MONTHEND_LOT_STOCK%ROWTYPE;
    /* [入出庫](保管区別月末品目在庫作成用) */
--＜当月伝票検索条件＞
-- 	（ [保管区別入出庫]."入出庫年月日" の年月　＝ 「月次処理対象年月」
-- 	AND　[保管区別入出庫]."登録日" ≦ 『当月システム処理実行日』（※sysdate））or
--＜遅れ伝票検索条件＞
-- 	（[保管区別入出庫]."入出庫年月日" の年月　≦ 「月次処理対象年月」
-- 	AND　『前月システム処理実行日』 ＜ [保管区別入出庫]."登録日"
-- 	AND　[保管区別入出庫]."登録日" ≦ 『当月システム処理実行日』（※sysdate））
    CURSOR curT_RCV_ISSUE_ITEM(
          cnumyearMonth   VARCHAR2,
          cvc2PlantCd     VARCHAR2,
          cvc2PrvsMonthlyProcExecDate DATE
    )
    IS    
    SELECT M1.PLANT_CD AS PLANT_CD,
           T1.WH_CD,
           T1.ITEM_CD ,
           SUM(
               CASE
                   WHEN T1.RCV_ISSUE_GNR_TYP IN('11','19','61','69','81','89','31','33','39') AND T1.RCV_ISSUE_TYP = '1' THEN T1.RCV_ISSUE_QTY
               ELSE 0
               END 
               ) AS RCV_QTY,                                 -- "入庫数(通常)"
           SUM(
               CASE
                   WHEN T1.RCV_ISSUE_GNR_TYP IN('12','14','28') AND T1.RCV_ISSUE_TYP = '1' THEN T1.RCV_ISSUE_QTY
               ELSE 0
               END
               ) AS RCV_OUTSIDE_PLAN_QTY,                    -- "入庫数(計画外)"
           SUM(
               CASE
                    WHEN T1.RCV_ISSUE_GNR_TYP IN('13') AND T1.RCV_ISSUE_TYP = '1' THEN T1.RCV_ISSUE_QTY
               ELSE 0
               END
               ) AS RCV_MOVE_QTY,                            -- "入庫数(移動)"
           SUM(
               CASE
                   
                   WHEN T1.RCV_ISSUE_GNR_TYP IN('21','29','31','33','39','41','49','51','59','71','79') AND T1.RCV_ISSUE_TYP = '2' THEN T1.RCV_ISSUE_QTY
               ELSE 0
               END
               ) AS ISSUE_QTY,                               -- "出庫数(通常)"
           SUM(
               CASE
                  WHEN T1.RCV_ISSUE_GNR_TYP IN('22','24','28') AND T1.RCV_ISSUE_TYP = '2' THEN T1.RCV_ISSUE_QTY
               ELSE 0
               END
               ) AS ISSUE_OUTSIDE_PLAN_QTY,                  -- "出庫数(計画外)"
           SUM(
               CASE
                   WHEN T1.RCV_ISSUE_GNR_TYP IN('23') AND T1.RCV_ISSUE_TYP = '2' THEN T1.RCV_ISSUE_QTY
               ELSE 0
               END
               ) AS ISSUE_MOVE_QTY                           -- "出庫数(移動)"
    FROM   T_RCV_ISSUE T1,M_WH M1                                    -- [入出庫]
    WHERE  T1.WH_CD      =  M1.WH_CD  
    AND    M1.PLANT_CD   =  cvc2PlantCd
    AND	   (    (     (T1.RCV_ISSUE_DATE    >= TO_DATE(cnumYearMonth || '01','YYYY/MM/DD')
                        AND T1.RCV_ISSUE_DATE    <= LAST_DAY(TO_DATE(cnumYearMonth || '01','YYYY/MM/DD')))
                  AND  T1.CREATED_DATE      <= SYSDATE
                 )      
             OR
                (      T1.RCV_ISSUE_DATE    <= LAST_DAY(TO_DATE(cnumYearMonth || '01','YYYY/MM/DD'))
                  AND (T1.CREATED_DATE      > cvc2PrvsMonthlyProcExecDate    AND T1.CREATED_DATE      <= SYSDATE )
                 )   
            )
    
   
    GROUP BY M1.PLANT_CD,
             T1.WH_CD,
             T1.ITEM_CD
    ORDER BY T1.WH_CD,
             T1.ITEM_CD;
    recT_RCV_ISSUE_ITEM curT_RCV_ISSUE_ITEM%ROWTYPE;
    /* [入出庫](保管区別月末ロット在庫作成用) */
    CURSOR curT_RCV_ISSUE_LOT(
          cnumyearMonth   VARCHAR2,
          cvc2PlantCd    VARCHAR2,
          cvc2PrvsMonthlyProcExecDate DATE
    )
    IS    
    SELECT M1.PLANT_CD AS PLANT_CD,
           T1.WH_CD,
           T1.ITEM_CD,
           T1.LOT_NO,
           SUM(
               CASE
                   WHEN T1.RCV_ISSUE_GNR_TYP IN('11','19','61','69','81','89','31','33','39') AND T1.RCV_ISSUE_TYP = '1' THEN T1.RCV_ISSUE_QTY
               ELSE 0
               END 
               ) AS RCV_QTY,                                 -- "入庫数(通常)"
           SUM(
               CASE
                   WHEN T1.RCV_ISSUE_GNR_TYP IN('12','14','28') AND T1.RCV_ISSUE_TYP = '1' THEN T1.RCV_ISSUE_QTY
               ELSE 0
               END
               ) AS RCV_OUTSIDE_PLAN_QTY,                    -- "入庫数(計画外)"
           SUM(
               CASE
                    WHEN T1.RCV_ISSUE_GNR_TYP IN('13') AND T1.RCV_ISSUE_TYP = '1' THEN T1.RCV_ISSUE_QTY
               ELSE 0
               END
               ) AS RCV_MOVE_QTY,                            -- "入庫数(移動)"
           SUM(
               CASE
                   
                   WHEN T1.RCV_ISSUE_GNR_TYP IN('21','29','31','33','39','41','49','51','59','71','79') AND T1.RCV_ISSUE_TYP = '2' THEN T1.RCV_ISSUE_QTY
               ELSE 0
               END
               ) AS ISSUE_QTY,                               -- "出庫数(通常)"
           SUM(
               CASE
                  WHEN T1.RCV_ISSUE_GNR_TYP IN('22','24','28') AND T1.RCV_ISSUE_TYP = '2' THEN T1.RCV_ISSUE_QTY
               ELSE 0
               END
               ) AS ISSUE_OUTSIDE_PLAN_QTY,                  -- "出庫数(計画外)"
           SUM(
               CASE
                   WHEN T1.RCV_ISSUE_GNR_TYP IN('23') AND T1.RCV_ISSUE_TYP = '2' THEN T1.RCV_ISSUE_QTY
               ELSE 0
               END
               ) AS ISSUE_MOVE_QTY                           -- "出庫数(移動)"
    FROM   T_RCV_ISSUE T1,M_WH M1                            -- [入出庫]
    WHERE  T1.WH_CD      =  M1.WH_CD  
    AND    M1.PLANT_CD   =  cvc2PlantCd
    AND	   (    (     (T1.RCV_ISSUE_DATE    >= TO_DATE(cnumYearMonth || '01','YYYY/MM/DD')
                        AND T1.RCV_ISSUE_DATE    <= LAST_DAY(TO_DATE(cnumYearMonth || '01','YYYY/MM/DD')))
                  AND  T1.CREATED_DATE      <= SYSDATE
                 )      
             OR
                (      T1.RCV_ISSUE_DATE    <= LAST_DAY(TO_DATE(cnumYearMonth || '01','YYYY/MM/DD'))
                  AND (T1.CREATED_DATE      > cvc2PrvsMonthlyProcExecDate    AND T1.CREATED_DATE      <= SYSDATE )
                 )   
            )
    AND    T1.LOT_NO IS NOT NULL
    GROUP BY M1.PLANT_CD,
             T1.WH_CD,
             T1.ITEM_CD,
             T1.LOT_NO
    ORDER BY T1.WH_CD,
             T1.ITEM_CD,
             T1.LOT_NO;
    recT_RCV_ISSUE_LOT curT_RCV_ISSUE_LOT%ROWTYPE;
    BEGIN
--<メイン処理 >-----------------------------------------------------
    --DBMS_OUTPUT.ENABLE(1000000); --TEST
    --DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 開始 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS')); --TEST
    --vc2RunChkComment := NULL;
    IF vc2OutputFileName IS NULL THEN
        vc2OutputFileName := 'sqlCreateMonthendStock.log';
    END IF;
    /* LogFile の OPEN */
        LblnRet := FncLogOpen(pvc2OutputPath, vc2OutputFileName, pvc2PlantCd, pvc2OutputMode, UTL_FileHandle);
    /* TraceLogの出力(Start)処理を行う */
        LBlnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_START);
        /*  パラメータのチェック  対象年月 */
    IF  pvc2MonthlyDate IS NULL THEN
        vc2Comment := SUBSTR('1:パラメータ不正。'  ||
                             ' 対象年月=' || '[ '  || pvc2MonthlyDate || ' ]',1,256);
        RAISE   excERR_SKIP;
    END IF;
    --vc2RunChkComment := '●●●●通過 00010'; --TEST
    --DBMS_OUTPUT.PUT_LINE(vc2RunChkComment); --TEST
-- [保管区別月末品目在庫]から月次処理の対象となっている「月次処理対象年月」、「工場コード」のレコードを削除する 
    DELETE FROM T_MONTHEND_ITEM_STOCK
    WHERE T_MONTHEND_ITEM_STOCK.MONTHLY_PROC_TARGET_DATE = pvc2MonthlyDate
    AND T_MONTHEND_ITEM_STOCK.PLANT_CD = pvc2PlantCd;
    --vc2RunChkComment := '●●●●通過 00020'; --TEST
    --DBMS_OUTPUT.PUT_LINE(vc2RunChkComment); --TEST
-- [保管区別月末ロット在庫]から月次処理の対象となっている「月次処理対象年月」、「工場コード」のレコードを削除する 
    DELETE FROM T_MONTHEND_LOT_STOCK
    WHERE T_MONTHEND_LOT_STOCK.MONTHLY_PROC_TARGET_DATE = pvc2MonthlyDate
    AND T_MONTHEND_LOT_STOCK.PLANT_CD = pvc2PlantCd;
    --vc2RunChkComment := '●●●●通過 00030'; --TEST
    --DBMS_OUTPUT.PUT_LINE(vc2RunChkComment); --TEST
-- [保管区別月末品目在庫]に前月末に在庫のある品目のレコードを追加
    INSERT INTO T_MONTHEND_ITEM_STOCK (
          MONTHLY_PROC_TARGET_DATE,
          PLANT_CD,
          WH_CD,
          ITEM_CD,
          PRVS_MONTHEND_STOCK_QTY,
          RCV_QTY,
          RCV_OUTSIDE_PLAN_QTY,
          RCV_MOVE_QTY,
          ISSUE_QTY,
          ISSUE_OUTSIDE_PLAN_QTY,
          ISSUE_MOVE_QTY,
          MONTHEND_STOCK_QTY,
          CREATED_DATE,
          CREATED_BY,
          CREATED_PRG_NM,
          UPDATED_DATE,
          UPDATED_BY,
          UPDATED_PRG_NM,
          MODIFY_COUNT)
    SELECT
          pvc2MonthlyDate,
          PLANT_CD,
          WH_CD,
          ITEM_CD,
          MONTHEND_STOCK_QTY,
          0,
          0,
          0,
          0,
          0,
          0,
          MONTHEND_STOCK_QTY,
          sysdate,
          pvc2UserId,
          MY_SQL_NAME,
          sysdate,
          pvc2UserId,
          MY_SQL_NAME,
          0
    FROM T_MONTHEND_ITEM_STOCK
    WHERE PLANT_CD = pvc2PlantCd
    AND   MONTHEND_STOCK_QTY <> 0
    AND   MONTHLY_PROC_TARGET_DATE = TO_CHAR(ADD_MONTHS(TO_DATE(pvc2MonthlyDate,'YYYY/MM'),-1),'YYYY/MM');
    --vc2RunChkComment := '●●●●通過 00040'; --TEST
    --DBMS_OUTPUT.PUT_LINE(vc2RunChkComment); --TEST
-- [保管区別月末ロット在庫]に前月末に在庫のある品目のレコードを追加
    INSERT INTO T_MONTHEND_LOT_STOCK (
          MONTHLY_PROC_TARGET_DATE,
          PLANT_CD,
          WH_CD,
          ITEM_CD,
          LOT_NO,
          PRVS_MONTHEND_STOCK_QTY,
          RCV_QTY,
          RCV_OUTSIDE_PLAN_QTY,
          RCV_MOVE_QTY,
          ISSUE_QTY,
          ISSUE_OUTSIDE_PLAN_QTY,
          ISSUE_MOVE_QTY,
          MONTHEND_STOCK_QTY,
          CREATED_DATE,
          CREATED_BY,
          CREATED_PRG_NM,
          UPDATED_DATE,
          UPDATED_BY,
          UPDATED_PRG_NM,
          MODIFY_COUNT)
    SELECT
          pvc2MonthlyDate,
          PLANT_CD,
          WH_CD,
          ITEM_CD,
          LOT_NO,
          MONTHEND_STOCK_QTY,
          0,
          0,
          0,
          0,
          0,
          0,
          MONTHEND_STOCK_QTY,
          sysdate,
          pvc2UserId,
          MY_SQL_NAME,
          sysdate,
          pvc2UserId,
          MY_SQL_NAME,
          0
    FROM T_MONTHEND_LOT_STOCK
    WHERE PLANT_CD                 = pvc2PlantCd
    AND   MONTHEND_STOCK_QTY <> 0
    AND   MONTHLY_PROC_TARGET_DATE = TO_CHAR(ADD_MONTHS(TO_DATE(pvc2MonthlyDate,'YYYY/MM'),-1),'YYYY/MM');
    --vc2RunChkComment := '●●●●通過 00050'; --TEST
    --DBMS_OUTPUT.PUT_LINE(vc2RunChkComment); --TEST
-- [月次処理履歴]から月次処理実行日を選択し、変数"前月システム処理実行日”設定する
        /* カーソルＯＰＥＮ（月次処理履歴）*/
        OPEN curT_MONTHLY_PROC_RSLT(pvc2PlantCd,TO_CHAR(ADD_MONTHS(TO_DATE(pvc2MonthlyDate,'YYYY/MM'),-1),'YYYY/MM'));
        /* カーソルＦＥＴＣＨ（月次処理履歴）*/
        FETCH curT_MONTHLY_PROC_RSLT INTO vc2PrvsMonthlyProcExecDate;
        IF curT_MONTHLY_PROC_RSLT%NOTFOUND THEN
                                pvc2ErrCode  := PRVS_MONTHLY_PROC_RSLT_NODATE;
                                RAISE excERR_CURSOR;
        END IF;
        CLOSE curT_MONTHLY_PROC_RSLT;
-- [保管区別入出庫]から入出庫数を選択し、[保管区別月末品目在庫]を更新する
        /* カーソルＯＰＥＮ（入出庫情報）*/
        BEGIN
            OPEN  curT_RCV_ISSUE_ITEM(pvc2MonthlyDate, pvc2PlantCd,vc2PrvsMonthlyProcExecDate);
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment  := SUBSTR('1:OPEN curT_RCV_ISSUE_ITEM'     ||
                                      ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                      ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE excERR_CURSOR;
        END;
        /* 入出庫情報のループ */
        LOOP
            /* カーソルＦＥＴＣＨ（入出庫情報）*/
            BEGIN
                FETCH curT_RCV_ISSUE_ITEM INTO recT_RCV_ISSUE_ITEM;
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment  := SUBSTR('2:FETCH curT_RCV_ISSUE_ITEM'    ||
                                          ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                          ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE excERR_CURSOR;
            END;
            /* 対象データ全件終了またはデータが存在しない場合にループを抜ける */
            EXIT WHEN curT_RCV_ISSUE_ITEM%NOTFOUND;
            /* カーソルＯＰＥＮ（保管区別月末品目在庫（存在チェック用））*/
            BEGIN
                OPEN  curT_MONTHEND_ITEM_STOCK(pvc2MonthlyDate,
                                                     recT_RCV_ISSUE_ITEM.PLANT_CD,
                                                     recT_RCV_ISSUE_ITEM.WH_CD,
                                                     recT_RCV_ISSUE_ITEM.ITEM_CD);
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment  := SUBSTR('3:OPEN curT_MONTHEND_ITEM_STOCK'  ||
                                          ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                          ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE excERR_CURSOR;
            END;
            /* カーソルＦＥＴＣＨ（保管区別月末品目在庫（存在チェック用））*/
            BEGIN
                FETCH curT_MONTHEND_ITEM_STOCK INTO recT_MONTHEND_ITEM_STOCK;
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment  := SUBSTR('4:FETCH curT_MONTHEND_ITEM_STOCK'  ||
                                          ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                          ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE excERR_CURSOR;
            END;
            /* 保管区別月末品目在庫に存在しなかったら追加、存在したら更新 */
            IF curT_MONTHEND_ITEM_STOCK%NOTFOUND THEN
                /* 保管区別月末品目在庫・追加処理 */
                BEGIN
                    INSERT INTO T_MONTHEND_ITEM_STOCK (
                          MONTHLY_PROC_TARGET_DATE,                             -- 月次処理対象年月
                          PLANT_CD,                                             -- 工場コード
                          WH_CD,                                                -- 保管区コード
                          ITEM_CD,                                              -- 品目番号
                          PRVS_MONTHEND_STOCK_QTY,                              -- 前月末在庫数
                          RCV_QTY,                                              -- 入庫数(通常)
                          RCV_OUTSIDE_PLAN_QTY,                                 -- 入庫数(計画外)
                          RCV_MOVE_QTY,                                         -- 入庫数(移動)
                          ISSUE_QTY,                                            -- 出庫数(通常)
                          ISSUE_OUTSIDE_PLAN_QTY,                               -- 出庫数(計画外)
                          ISSUE_MOVE_QTY,                                       -- 出庫数(移動)
                          MONTHEND_STOCK_QTY,                                   -- 月末在庫数
                          CREATED_DATE,                                         -- 作成日
                          CREATED_BY,                                           -- 作成者
                          CREATED_PRG_NM,                                       -- 作成プログラム名
                          UPDATED_DATE,                                         -- 更新日
                          UPDATED_BY,                                           -- 更新者
                          UPDATED_PRG_NM,                                       -- 更新プログラム名
                          MODIFY_COUNT                                          -- 更新数
                    ) VALUES (
                          pvc2MonthlyDate,                                      -- 月次処理対象年月
                          recT_RCV_ISSUE_ITEM.PLANT_CD,                         -- 工場コード
                          recT_RCV_ISSUE_ITEM.WH_CD,                            -- 保管区コード
                          recT_RCV_ISSUE_ITEM.ITEM_CD,                          -- 品目番号
                          0,                                                    -- 前月末在庫数
                          recT_RCV_ISSUE_ITEM.RCV_QTY,                          -- 入庫数(通常)
                          recT_RCV_ISSUE_ITEM.RCV_OUTSIDE_PLAN_QTY,             -- 入庫数(計画外)
                          recT_RCV_ISSUE_ITEM.RCV_MOVE_QTY,                     -- 入庫数(移動)
                          recT_RCV_ISSUE_ITEM.ISSUE_QTY,                        -- 出庫数(通常)
                          recT_RCV_ISSUE_ITEM.ISSUE_OUTSIDE_PLAN_QTY,           -- 出庫数(計画外)
                          recT_RCV_ISSUE_ITEM.ISSUE_MOVE_QTY,                   -- 出庫数(移動)
                          (recT_RCV_ISSUE_ITEM.RCV_QTY
                        + recT_RCV_ISSUE_ITEM.RCV_OUTSIDE_PLAN_QTY
                        + recT_RCV_ISSUE_ITEM.RCV_MOVE_QTY
                        + recT_RCV_ISSUE_ITEM.ISSUE_QTY
                        + recT_RCV_ISSUE_ITEM.ISSUE_OUTSIDE_PLAN_QTY
                        + recT_RCV_ISSUE_ITEM.ISSUE_MOVE_QTY),                  -- 月末在庫数
                          SYSDATE,                                              -- 作成日
                          pvc2UserId,                                           -- 作成者
                          MY_SQL_NAME,                                          -- 作成プログラム名
                          SYSDATE,                                              -- 更新日
                          pvc2UserId,                                           -- 更新者
                          MY_SQL_NAME,                                          -- 更新プログラム名
                          0                                                     -- 更新数
                    );
                EXCEPTION
                    WHEN OTHERS THEN
                        vc2Comment := SUBSTR('12:INSERT T_MONTHEND_ITEM_STOCK'         ||
                                             ' ITEM_CD='    || '[ ' || recT_RCV_ISSUE_ITEM.ITEM_CD    || ' ]' ||
                                             ' SQLCODE='    || '[ ' || SQLCODE || ' ]' ||
                                             ' SQLERRM='    || '[ ' || SQLERRM || ' ]',1,256);
                        RAISE excERR_CURSOR;
                END;
            ELSE
                /* 保管区別月末品目在庫・更新処理 */
                BEGIN
                    UPDATE T_MONTHEND_ITEM_STOCK T1 SET
                             RCV_QTY                = recT_RCV_ISSUE_ITEM.RCV_QTY,
                             RCV_OUTSIDE_PLAN_QTY   = recT_RCV_ISSUE_ITEM.RCV_OUTSIDE_PLAN_QTY,
                             RCV_MOVE_QTY           = recT_RCV_ISSUE_ITEM.RCV_MOVE_QTY,
                             ISSUE_QTY              = recT_RCV_ISSUE_ITEM.ISSUE_QTY,
                             ISSUE_OUTSIDE_PLAN_QTY = recT_RCV_ISSUE_ITEM.ISSUE_OUTSIDE_PLAN_QTY,
                             ISSUE_MOVE_QTY         = recT_RCV_ISSUE_ITEM.ISSUE_MOVE_QTY,
                             MONTHEND_STOCK_QTY     = T1.PRVS_MONTHEND_STOCK_QTY
                                                      + recT_RCV_ISSUE_ITEM.RCV_QTY
                                                      + recT_RCV_ISSUE_ITEM.RCV_OUTSIDE_PLAN_QTY
                                                      + recT_RCV_ISSUE_ITEM.RCV_MOVE_QTY
                                                      + recT_RCV_ISSUE_ITEM.ISSUE_QTY
                                                      + recT_RCV_ISSUE_ITEM.ISSUE_OUTSIDE_PLAN_QTY
                                                      + recT_RCV_ISSUE_ITEM.ISSUE_MOVE_QTY,
                             UPDATED_DATE           = SYSDATE,
                             UPDATED_BY             = pvc2UserId,
                             UPDATED_PRG_NM         = MY_SQL_NAME,
                             MODIFY_COUNT           = T1.MODIFY_COUNT + 1
                    WHERE  T1.MONTHLY_PROC_TARGET_DATE = pvc2MonthlyDate
                    AND    T1.PLANT_CD                 = recT_RCV_ISSUE_ITEM.PLANT_CD
                    AND    T1.WH_CD                    = recT_RCV_ISSUE_ITEM.WH_CD
                    AND    T1.ITEM_CD                  = recT_RCV_ISSUE_ITEM.ITEM_CD;
                EXCEPTION
                    WHEN OTHERS THEN
                        vc2Comment := SUBSTR('13:UPDATE  T_MONTHEND_ITEM_STOCK'    ||
                                             ' WH_CD：'      || '[ ' || recT_RCV_ISSUE_ITEM.WH_CD    || ' ]' ||
                                             ' ITEM_CD：'    || '[ ' || recT_RCV_ISSUE_ITEM.ITEM_CD    || ' ]' ||
                                             ' SQLCODE='     || '[ ' || SQLCODE || ' ]' ||
                                             ' SQLERRM='     || '[ ' || SQLERRM || ' ]',1,256);
                        RAISE excERR_CURSOR;
                END;
            END IF;
            /* カーソルＣＬＯＳＥ（保管区別月末品目在庫（存在チェック用））*/
            CLOSE curT_MONTHEND_ITEM_STOCK;
        END LOOP;
        /* カーソルＣＬＯＳＥ（入出庫情報）*/
        CLOSE curT_RCV_ISSUE_ITEM;
    --vc2RunChkComment := '●●●●通過 00060'; --TEST
    --DBMS_OUTPUT.PUT_LINE(vc2RunChkComment); --TEST
-- [保管区別入出庫]から入出庫数を選択し、[保管区別月末ロット在庫]を更新する
        /* カーソルＯＰＥＮ（入出庫情報）*/
        BEGIN
            OPEN  curT_RCV_ISSUE_LOT(pvc2MonthlyDate, pvc2PlantCd,vc2PrvsMonthlyProcExecDate);
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment  := SUBSTR('5:OPEN curT_RCV_ISSUE_LOT'     ||
                                      ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                      ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE excERR_CURSOR;
        END;
        /* 入出庫情報のループ */
        LOOP
            /* カーソルＦＥＴＣＨ（入出庫情報）*/
            BEGIN
                FETCH curT_RCV_ISSUE_LOT INTO recT_RCV_ISSUE_LOT;
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment  := SUBSTR('6:FETCH curT_RCV_ISSUE_LOT'    ||
                                          ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                          ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE excERR_CURSOR;
            END;
            /* 対象データ全件終了またはデータが存在しない場合にループを抜ける */
            EXIT WHEN curT_RCV_ISSUE_LOT%NOTFOUND;
            /* カーソルＯＰＥＮ（保管区別月末ロット（存在チェック用））*/
            BEGIN
                OPEN  curT_MONTHEND_LOT_STOCK( pvc2MonthlyDate,
                                                     recT_RCV_ISSUE_LOT.PLANT_CD,
                                                     recT_RCV_ISSUE_LOT.WH_CD,
                                                     recT_RCV_ISSUE_LOT.ITEM_CD,
                                                     recT_RCV_ISSUE_LOT.LOT_NO);
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment  := SUBSTR('7:OPEN curT_MONTHEND_LOT_STOCK'  ||
                                          ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                          ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE excERR_CURSOR;
            END;
            /* カーソルＦＥＴＣＨ（保管区別月末ロット在庫（存在チェック用））*/
            BEGIN
                FETCH curT_MONTHEND_LOT_STOCK INTO recT_MONTHEND_LOT_STOCK;
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment  := SUBSTR('8:FETCH curT_MONTHEND_LOT_STOCK'  ||
                                          ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                          ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE excERR_CURSOR;
            END;
            /* 保管区別月末ロット在庫に存在しなかったら追加、存在したら更新 */
            IF curT_MONTHEND_LOT_STOCK%NOTFOUND THEN
                /* 保管区別月末ロット在庫・追加処理 */
                BEGIN
                    INSERT INTO T_MONTHEND_LOT_STOCK (
                          MONTHLY_PROC_TARGET_DATE,                             -- 月次処理対象年月
                          PLANT_CD,                                             -- 工場コード
                          WH_CD,                                                -- 保管区コード
                          ITEM_CD,                                              -- 品目番号
                          LOT_NO,                                               -- ロット番号
                          PRVS_MONTHEND_STOCK_QTY,                              -- 前月末在庫数
                          RCV_QTY,                                              -- 入庫数(通常)
                          RCV_OUTSIDE_PLAN_QTY,                                 -- 入庫数(計画外)
                          RCV_MOVE_QTY,                                         -- 入庫数(移動)
                          ISSUE_QTY,                                            -- 出庫数(通常)
                          ISSUE_OUTSIDE_PLAN_QTY,                               -- 出庫数(計画外)
                          ISSUE_MOVE_QTY,                                       -- 出庫数(移動)
                          MONTHEND_STOCK_QTY,                                            -- 月末在庫数
                          CREATED_DATE,                                         -- 作成日
                          CREATED_BY,                                           -- 作成者
                          CREATED_PRG_NM,                                       -- 作成プログラム名
                          UPDATED_DATE,                                         -- 更新日
                          UPDATED_BY,                                           -- 更新者
                          UPDATED_PRG_NM,                                       -- 更新プログラム名
                          MODIFY_COUNT                                          -- 更新数
                    ) VALUES (
                          pvc2MonthlyDate,                                      -- 月次処理対象年月
                          recT_RCV_ISSUE_LOT.PLANT_CD,                          -- 工場コード
                          recT_RCV_ISSUE_LOT.WH_CD,                             -- 保管区コード
                          recT_RCV_ISSUE_LOT.ITEM_CD,                           -- 品目番号
                          recT_RCV_ISSUE_LOT.LOT_NO,                            -- ロット番号
                          0,                                                    -- 前月末在庫数
                          recT_RCV_ISSUE_LOT.RCV_QTY,                           -- 入庫数(通常)
                          recT_RCV_ISSUE_LOT.RCV_OUTSIDE_PLAN_QTY,              -- 入庫数(計画外)
                          recT_RCV_ISSUE_LOT.RCV_MOVE_QTY,                      -- 入庫数(移動)
                          recT_RCV_ISSUE_LOT.ISSUE_QTY,                         -- 出庫数(通常)
                          recT_RCV_ISSUE_LOT.ISSUE_OUTSIDE_PLAN_QTY,            -- 出庫数(計画外)
                          recT_RCV_ISSUE_LOT.ISSUE_MOVE_QTY,                    -- 出庫数(移動)
                          recT_RCV_ISSUE_LOT.RCV_QTY
                          + recT_RCV_ISSUE_LOT.RCV_OUTSIDE_PLAN_QTY
                          + recT_RCV_ISSUE_LOT.RCV_MOVE_QTY
                          + recT_RCV_ISSUE_LOT.ISSUE_QTY
                          + recT_RCV_ISSUE_LOT.ISSUE_OUTSIDE_PLAN_QTY
                          + recT_RCV_ISSUE_LOT.ISSUE_MOVE_QTY,                   -- 月末在庫数
                          SYSDATE,                                               -- 作成日
                          pvc2UserId,                                            -- 作成者
                          MY_SQL_NAME,                                           -- 作成プログラム名
                          SYSDATE,                                               -- 更新日
                          pvc2UserId,                                            -- 更新者
                          MY_SQL_NAME,                                           -- 更新プログラム名
                          0                                                      -- 更新数
                    );
                EXCEPTION
                    WHEN OTHERS THEN
                        vc2Comment := SUBSTR('12:INSERT T_MONTHEND_LOT_STOCK'         ||
                                             ' ITEM_CD='    || '[ ' || recT_RCV_ISSUE_LOT.ITEM_CD    || ' ]' ||
                                             ' LOT_NO='    || '[ ' || recT_RCV_ISSUE_LOT.LOT_NO    || ' ]' ||
                                             ' SQLCODE='    || '[ ' || SQLCODE || ' ]' ||
                                             ' SQLERRM='    || '[ ' || SQLERRM || ' ]',1,256);
                        RAISE excERR_CURSOR;
                END;
            ELSE
                /* 保管区別月末ロット在庫・更新処理 */
                BEGIN
                    UPDATE T_MONTHEND_LOT_STOCK T1 SET
                            RCV_QTY                = recT_RCV_ISSUE_LOT.RCV_QTY,
                            RCV_OUTSIDE_PLAN_QTY   = recT_RCV_ISSUE_LOT.RCV_OUTSIDE_PLAN_QTY,
                            RCV_MOVE_QTY           = recT_RCV_ISSUE_LOT.RCV_MOVE_QTY,
                            ISSUE_QTY              = recT_RCV_ISSUE_LOT.ISSUE_QTY,
                            ISSUE_OUTSIDE_PLAN_QTY = recT_RCV_ISSUE_LOT.ISSUE_OUTSIDE_PLAN_QTY,
                            ISSUE_MOVE_QTY         = recT_RCV_ISSUE_LOT.ISSUE_MOVE_QTY,
                            MONTHEND_STOCK_QTY              = T1.PRVS_MONTHEND_STOCK_QTY
                                                      + recT_RCV_ISSUE_LOT.RCV_QTY
                                                      + recT_RCV_ISSUE_LOT.RCV_OUTSIDE_PLAN_QTY
                                                      + recT_RCV_ISSUE_LOT.RCV_MOVE_QTY
                                                      + recT_RCV_ISSUE_LOT.ISSUE_QTY
                                                      + recT_RCV_ISSUE_LOT.ISSUE_OUTSIDE_PLAN_QTY
                                                      + recT_RCV_ISSUE_LOT.ISSUE_MOVE_QTY,
                            UPDATED_DATE           = SYSDATE,
                            UPDATED_BY             = pvc2UserId,
                            UPDATED_PRG_NM         = MY_SQL_NAME,
                            MODIFY_COUNT           = 0
                    WHERE  T1.MONTHLY_PROC_TARGET_DATE = pvc2MonthlyDate
                    AND    T1.PLANT_CD                 = recT_RCV_ISSUE_LOT.PLANT_CD
                    AND    T1.WH_CD                    = recT_RCV_ISSUE_LOT.WH_CD
                    AND    T1.ITEM_CD                  = recT_RCV_ISSUE_LOT.ITEM_CD
                    AND    T1.LOT_NO                   = recT_RCV_ISSUE_LOT.LOT_NO;
                EXCEPTION
                    WHEN OTHERS THEN
                        vc2Comment := SUBSTR('13:UPDATE  T_MONTHEND_LOT_STOCK'    ||
                                             ' WH_CD：'      || '[ ' || recT_RCV_ISSUE_LOT.WH_CD    || ' ]' ||
                                             ' ITEM_CD：'    || '[ ' || recT_RCV_ISSUE_LOT.ITEM_CD    || ' ]' ||
                                             ' SQLCODE='     || '[ ' || SQLCODE || ' ]' ||
                                             ' SQLERRM='     || '[ ' || SQLERRM || ' ]',1,256);
                        RAISE excERR_CURSOR;
                END;
            END IF;
            /* カーソルＣＬＯＳＥ（保管区別月末ロット在庫（存在チェック用））*/
            CLOSE curT_MONTHEND_LOT_STOCK;
        END LOOP;
        /* カーソルＣＬＯＳＥ（入出庫情報）*/
        CLOSE curT_RCV_ISSUE_LOT;
    --vc2RunChkComment := '●●●●通過 00070'; --TEST
    --DBMS_OUTPUT.PUT_LINE(vc2RunChkComment); --TEST
-- [月次処理履歴]の更新
   SELECT COUNT(*) INTO lnumterm_curr
   FROM T_MONTHLY_PROC_RSLT T1
   WHERE T1.PLANT_CD = pvc2PlantCd
   AND   T1.MONTHLY_PROC_TARGET_DATE = pvc2MonthlyDate;
    --vc2RunChkComment := '●●●●通過 00080'; --TEST
    --DBMS_OUTPUT.PUT_LINE(vc2RunChkComment); --TEST
    IF lnumTerm_Curr = 1 THEN -- 月末在庫を更新する場合
        UPDATE T_MONTHLY_PROC_RSLT T1 SET MONTHLY_PROC_EXEC_DATE = SYSDATE,
                                          T1.UPDATED_DATE        = SYSDATE,
                                          T1.UPDATED_BY          = pvc2UserId,
                                          T1.UPDATED_PRG_NM      = MY_SQL_NAME,
                                          T1.MODIFY_COUNT        = T1.MODIFY_COUNT + 1
        WHERE T1.PLANT_CD                 = pvc2PlantCd
        AND   T1.MONTHLY_PROC_TARGET_DATE = pvc2MonthlyDate;
        --vc2RunChkComment := '●●●●通過 00100'; --TEST
        --DBMS_OUTPUT.PUT_LINE(vc2RunChkComment); --TEST
    ELSE                      --月末在庫を新規に作成する場合
        INSERT INTO T_MONTHLY_PROC_RSLT(PLANT_CD,
                                        MONTHLY_PROC_TARGET_DATE,
                                        MONTHLY_PROC_EXEC_DATE,
                                        CREATED_DATE,
                                        CREATED_BY,
                                        CREATED_PRG_NM,
                                        UPDATED_DATE,
                                        UPDATED_BY,
                                        UPDATED_PRG_NM,
                                        MODIFY_COUNT)
        VALUES(pvc2PlantCd,
               pvc2MonthlyDate,
               SYSDATE,
               SYSDATE,
               pvc2UserId,
               MY_SQL_NAME,
               SYSDATE,
               pvc2UserId,
               MY_SQL_NAME,
               0);
        --vc2RunChkComment := '●●●●通過 00110'; --TEST
        --DBMS_OUTPUT.PUT_LINE(vc2RunChkComment); --TEST
    END IF;
        /* トレースログの出力(終了) */
    LBlnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END);
    /* LogFile の CLOSE */
    LblnRet := FncLogClose(UTL_FileHandle);
--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN excERR_CURSOR THEN    --カーソルOPEN中のＤＢエラー
        IF curT_MONTHEND_ITEM_STOCK%ISOPEN = TRUE THEN
            CLOSE curT_MONTHEND_ITEM_STOCK;
        END IF;
        IF curT_MONTHEND_LOT_STOCK%ISOPEN = TRUE THEN
            CLOSE curT_MONTHEND_LOT_STOCK;
        END IF;
        IF curT_RCV_ISSUE_ITEM%ISOPEN = TRUE THEN
            CLOSE curT_RCV_ISSUE_ITEM;
        END IF;
        IF curT_RCV_ISSUE_LOT%ISOPEN = TRUE THEN
            CLOSE curT_RCV_ISSUE_LOT;
        END IF;
        IF curT_MONTHLY_PROC_RSLT%ISOPEN = TRUE THEN
            CLOSE curT_MONTHLY_PROC_RSLT;
        END IF;
        /* トレースログの出力(終了) */
        lBlnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId,pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, METHOD_END);
        /* LogFile の CLOSE */
        lBlnRet := FNCLOGCLOSE(UTL_FileHandle);
        pnumReturn := STATUS_ERROR; --異常終了
    WHEN OTHERS  THEN   --その他のエラー
        IF curT_MONTHEND_ITEM_STOCK%ISOPEN = TRUE THEN
            CLOSE curT_MONTHEND_ITEM_STOCK;
        END IF;
        IF curT_MONTHEND_LOT_STOCK%ISOPEN = TRUE THEN
            CLOSE curT_MONTHEND_LOT_STOCK;
        END IF;
        IF curT_RCV_ISSUE_ITEM%ISOPEN = TRUE THEN
            CLOSE curT_RCV_ISSUE_ITEM;
        END IF;
        IF curT_RCV_ISSUE_LOT%ISOPEN = TRUE THEN
            CLOSE curT_RCV_ISSUE_LOT;
        END IF;
        IF curT_MONTHLY_PROC_RSLT%ISOPEN = TRUE THEN
            CLOSE curT_MONTHLY_PROC_RSLT;
        END IF;
        /* 終了メッセージの出力 */
        vc2Comment := SUBSTR('PGNAME='   || '[ ' || MY_SQL_NAME || ' ]' ||
                             ' SQLCODE=' || '[ ' || SQLCODE     || ' ]' ||
                             ' SQLERRM=' || '[ ' || SQLERRM     || ' ]',1,256);
        lBlnRet := FNCERRLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, NULL, vc2Comment);
        /* トレースログの出力(終了) */
        lBlnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId,pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, METHOD_END);
        /* LogFile の CLOSE */
        lBlnRet := FNCLOGCLOSE(UTL_FileHandle);
        pnumReturn := STATUS_ERROR; --異常終了
END;
/
