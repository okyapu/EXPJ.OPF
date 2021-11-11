CREATE OR REPLACE PROCEDURE SqlProcCostEntry(
/*------------------------------------------------------------------------------
' Copyright (c) 2003-2004 NEC Corporation
' Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
' $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/DBProj/Procedure/SqlProcCostEntry.sql,v $
' $Author: tai-yanhong $
' $Revision: 1.8 $　$Date: 2012/08/06 08:54:12 $
'
' 修正履歴
' 2005.12.12 新規作成
'
' 機能      : 加工費情報一括登録
'
' 引き数    : pvc2LogMode           - (i)ＬＯＧモード
'             pvc2OutputMode        - (i)出力モード
'             pvc2OutputPath        - (i)出力ファイルパス
'             pvc2OutputName        - (i)出力ファイル名
'             pvc2UserId            - (i)ユーザＩＤ
'             pvc2BusinessName      - (i)業務名
'             pvc2PlantCd           - (i)工場コード
'             pvc2Year              - (i)対象年度
'             pvc2HalfTermTyp       - (i)半期区分
'             pvc2CostTyp           - (i)原価種別
'             pvc2BatchTyp          - (i)バッチ処理区分
'
'
' 機能説明  :加工費インタフェースを基に、品目別加工費マスタと、加工費マスタを
'            作成する。
'
' 備考      :
'
------------------------------------------------------------------------------*/
    pvc2LogMode           VARCHAR2    --ＬＯＧモード
   ,pvc2OutputMode        VARCHAR2    --出力モード
   ,pvc2OutputPath        VARCHAR2    --出力パス
   ,pvc2OutputName        VARCHAR2    --出力ファイル名
   ,pvc2UserId            VARCHAR2    --ユーザＩＤ
   ,pvc2BusinessName      VARCHAR2    --業務名
   ,pvc2PlantCd           VARCHAR2    --工場コード
   ,pvc2TargetPlantCd     VARCHAR2    --処理対象工場コード
   ,pvc2Year              VARCHAR2    --対象年度(YYYY形式)
   ,pvc2HalfTermTyp       VARCHAR2    --半期区分(1:上期, 2下期)
   ,pvc2CostTyp           VARCHAR2    --原価種別(1:標準原価, 2：実際原価)
   ,pvc2BatchTyp          VARCHAR2    --バッチ処理区分(1:夜間バッチ, 2:マニュアル)
)
IS
    
    --例外の宣言
    excERR_PROC_COST_IF             EXCEPTION;    --加工費インタフェースエラー
    
    --定数
    MY_SQL_NAME                     VARCHAR2(64) := 'SqlProcCostEntry';
    FIRST_MODIFY_COUNT              NUMBER       := 0;   --新規作成テーブルの初回の更新数
    METHOD_START                    VARCHAR2(20) := 'Start';          --ログ用メソッド開始宣言
    METHOD_END                      VARCHAR2(12) := 'End';            --ログ用メソッド終了宣言
    LOGMSG_START_PGNM               VARCHAR2(128) := '<< 加工費情報一括登録処理開始 >>';
    LOGMSG_END_PGNM                 VARCHAR2(128) := '<< 加工費情報一括登録処理終了 >>';
    
    APS_COM_BATCH_START             VARCHAR2(28) := 'ZZ09001';        --バッチ処理を開始しました。
    APS_COM_BATCH_END               VARCHAR2(28) := 'ZZ09002';        --バッチ処理を終了しました。
    
    --変数宣言
    UTL_FileHandle                  UTL_FILE.FILE_TYPE;     --ファイルハンドル
    vc2Comment                      VARCHAR2(1024);  --メッセージ作成用
    
    --加工費インタフェース読込用
    numYear                         NUMBER(4);
    numHalfTermTyp                  NUMBER(2);
    numCostTyp                      NUMBER(2);
    vc2PlantCd                      VARCHAR2(8);
    vc2CsProcCd                     VARCHAR2(100);
    vc2ProcCostClsCd                VARCHAR2(100);
    vc2ItemCd                       VARCHAR2(100);
    numProcCostUnitQty              NUMBER(18, 4);
    vc2StockUnit                    VARCHAR2(48);
    numProcCost01                   NUMBER(18, 4);
    numProcCost02                   NUMBER(18, 4);
    numProcCost03                   NUMBER(18, 4);
    numProcCost04                   NUMBER(18, 4);
    numProcCost05                   NUMBER(18, 4);
    numProcCost06                   NUMBER(18, 4);
    numProcCost07                   NUMBER(18, 4);
    numProcCost08                   NUMBER(18, 4);
    numProcCost09                   NUMBER(18, 4);
    numProcCost10                   NUMBER(18, 4);
    numProcCost11                   NUMBER(18, 4);
    numProcCost12                   NUMBER(18, 4);
    vc2ClasificationCd              VARCHAR2(100);
    vc2CompanyCd                    VARCHAR2(100);
    vc2OrgCd                        VARCHAR2(100);
    dtmSaveUpdatedDate              DATE;
    numTransactionTyp               NUMBER(2);
    numUpdFlg                       NUMBER(1);
    
    --品目読込用
    vc2ItemCd_Item                  VARCHAR2(100);
    
    --工程マスタ読込用
    vc2OrgCd_CsProc                 VARCHAR2(100);
    
    --加工費マスタ読込用
    numUpdateTyp                    NUMBER(2);
    
    --品目別加工費マスタ
    vc2ProcCostClsCd_ItemProcCost   VARCHAR2(100);
    vc2CsProcCd_ItemProcCost        VARCHAR2(100);
    
    --原価管理パラメータ
    numMProcCostPriorityTyp         NUMBER(2);
    
    --原価一括登録エラー番号
    vc2CsErrorCd                    VARCHAR2(80);
    
    --一時変数
    vc2Tmp                          VARCHAR2(100);
    
    intProcCostIFName               INTEGER;        --加工費IFカーソルＩＤ
    intRet                          INTEGER;        --関数戻り値
    vc2Sql                          VARCHAR2(4096); --動的ＳＱＬ用
    
    --加工費合計
    numProcCostSum                  NUMBER;
    
    numReadCount                    NUMBER := 0;    --読込件数
    numNormalCount                  NUMBER := 0;    --正常データ件数
    numErrCnt                       NUMBER := 0;    --ワーニング件数
    vc2MesssageCode                 VARCHAR2(32);    --メッセージコード
    blnRet                          BOOLEAN;
    
    
    --カーソル宣言
    --加工費インタフェース
    CURSOR curT_PROC_COST_IF(
         cvc2Year         VARCHAR2
        ,cvc2HalfTermTyp  VARCHAR2
        ,cvc2CostTyp      VARCHAR2
        ,cvc2PlantCd      VARCHAR2
    )
    IS
        SELECT 
            YEAR
        FROM 
            T_PROC_COST_IF
        WHERE 
            YEAR = TO_NUMBER(cvc2Year)
            AND HALF_TERM_TYP = cvc2Year
            AND COST_TYP = cvc2CostTyp
            AND PLANT_CD = cvc2PlantCd
            AND UPD_FLG = 0
        ORDER BY 
            PLANT_CD ASC,
            CS_PROC_CD ASC,
            PROC_COST_CLS_CD ASC;
    
    --品目
    CURSOR curM_ITEM(
        cvc2ItemCd  VARCHAR2
    )
    IS
        SELECT
            1
        FROM
            M_ITEM
        WHERE
            ITEM_CD = cvc2ItemCd
            AND ITEM_CD <> '*';
    
    --工程マスタ
    CURSOR curM_CS_PROC(
         cvc2PlantCd   VARCHAR2
        ,cvc2CsProcCd  VARCHAR2
    )
    IS
        SELECT
            ORG_CD
        FROM
            M_CS_PROC
        WHERE
            PLANT_CD = cvc2PlantCd
            AND CS_PROC_CD = cvc2CsProcCd;
    
    --加工費分類マスタ
    CURSOR curM_PROC_COST_CLS(
        cvc2ProcCostClsCd  VARCHAR2
    ) 
    IS
        SELECT
            1
        FROM
            M_PROC_COST_CLS
        WHERE
            PROC_COST_CLS_CD = cvc2ProcCostClsCd;
    
    --加工費マスタ
    CURSOR curM_PROC_COST(
         cnumYear               NUMBER
        ,cnumHalfTermTyp        NUMBER
        ,cnumCostTyp            NUMBER
        ,cvc2PlantCd            VARCHAR2
        ,cvc2CsProcCd           VARCHAR2
        ,cvc2ProcCostClsCd      VARCHAR2
    )
    IS
        SELECT
            UPDATE_TYP
        FROM
            M_PROC_COST
        WHERE
            YEAR = cnumYear
            AND HALF_TERM_TYP = cnumHalfTermTyp
            AND COST_TYP = cnumCostTyp
            AND PLANT_CD = cvc2PlantCd
            AND CS_PROC_CD = cvc2CsProcCd
            AND PROC_COST_CLS_CD = cvc2ProcCostClsCd;
    /*
    --品目別加工費マスタ
    CURSOR curM_ITEM_PROC_COST(
         cvc2PlantCd            VARCHAR2
        ,cvc2ItemCd             VARCHAR2
    ) 
    IS 
        SELECT
            PROC_COST_CLS_CD,
            CS_PROC_CD
        FROM
            M_ITEM_PROC_COST
        WHERE
            PLANT_CD = cvc2PlantCd
            AND ITEM_CD = cvc2ItemCd;
    */
    
    --品目別加工費マスタ2
    CURSOR curM_ITEM_PROC_COST2(
         cvc2PlantCd            VARCHAR2
        ,cvc2ItemCd             VARCHAR2
        ,cvc2ProcCostClsCd      VARCHAR2
    ) 
    IS 
        SELECT
            PROC_COST_CLS_CD,
            CS_PROC_CD
        FROM
            M_ITEM_PROC_COST
        WHERE
            PLANT_CD = cvc2PlantCd
            AND ITEM_CD = cvc2ItemCd
            AND PROC_COST_CLS_CD = cvc2ProcCostClsCd;
    
    --品目別加工費マスタ3
    CURSOR curM_ITEM_PROC_COST3(
         cvc2PlantCd            VARCHAR2
        ,cvc2ItemCd             VARCHAR2
        ,cvc2CsProcCd           VARCHAR2
    ) 
    IS 
        SELECT
            PROC_COST_CLS_CD,
            CS_PROC_CD
        FROM
            M_ITEM_PROC_COST
        WHERE
            PLANT_CD = cvc2PlantCd
            AND ITEM_CD = cvc2ItemCd
            AND CS_PROC_CD <> cvc2CsProcCd
            AND ITEM_CD <> '*';
    
    --品目別加工費マスタ4
    CURSOR curM_ITEM_PROC_COST4(
         cvc2PlantCd            VARCHAR2
        ,cvc2CsProcCd           VARCHAR2
        ,cvc2ProcCostClsCd      VARCHAR2
    ) 
    IS 
        SELECT
            PROC_COST_CLS_CD,
            CS_PROC_CD
        FROM
            M_ITEM_PROC_COST
        WHERE
            PLANT_CD = cvc2PlantCd
            AND CS_PROC_CD = cvc2CsProcCd
            AND PROC_COST_CLS_CD = cvc2ProcCostClsCd
            AND ITEM_CD <> '*';

    --[原価管理パラメータ]
    CURSOR curSYS_COST_CTRL(
        cvc2PlantCd  VARCHAR2
    )
    IS 
        SELECT
            M_PROC_COST_PRIORITY_TYP
        FROM
            SYS_COST_CTRL
        WHERE 
            PLANT_CD = cvc2PlantCd;
    
    --原価一括エラー登録サブファンクション
    FUNCTION SubFncInsertCsError(
         pvc2PlantCd           VARCHAR2
        ,pvc2ItemCd            VARCHAR2
        ,pvc2CsProcCd          VARCHAR2
        ,pvc2ProcCostClsCd     VARCHAR2
        ,pnumTransactionTyp    NUMBER
        ,pvc2MesssageCode      VARCHAR2
        ,pnumReadCount         NUMBER
    ) RETURN BOOLEAN
    IS
        numTmp varchar2(25);
        vc2CsErrorCd  VARCHAR2(20);
        vc2Remarks    VARCHAR2(100);
        
        --原価一括登録エラー番号採番
        CURSOR curCS_ERROR_CD
        IS 
            SELECT
                TO_CHAR(SEQ_CS_ERROR_CD.NEXTVAL, 'FM00000000000000000000') AS CS_ERROR_CD
            FROM
              DUAL;
        
    BEGIN
        numTmp := null;
        
        --備考
        vc2Remarks := 'YEAR=' || pvc2Year || ' HALF_TERM_TYP=' || pvc2HalfTermTyp;
        
        --一括登録エラー番号採番
        OPEN curCS_ERROR_CD;
        FETCH curCS_ERROR_CD INTO vc2CsErrorCd;
        CLOSE curCS_ERROR_CD;
        
        INSERT INTO T_CS_ERROR(
            CS_ERROR_CD, 
            BATCH_TYP, 
            BUSINESS_ID, 
            COST_TYP, 
            PLANT_CD, 
            ITEM_CD, 
            CS_PROC_CD, 
            VEND_CD, 
            PROC_COST_CLS_CD, 
            EFFECTIVE_START_DATE, 
            TRANSACTION_TYP, 
            MESSAGE_CD, 
            READ_COUNT, 
            REMARKS, 
            LIST_ISS_FLG,
            CREATED_DATE,
            CREATED_BY,
            CREATED_PRG_NM,
            UPDATED_DATE,
            UPDATED_BY,
            UPDATED_PRG_NM,
            MODIFY_COUNT
        ) VALUES (
            vc2CsErrorCd,
            TO_NUMBER(pvc2BatchTyp),
            pvc2BusinessName,
            TO_NUMBER(pvc2CostTyp),
            pvc2PlantCd,
            pvc2ItemCd,
            pvc2CsProcCd,
            NULL,
            pvc2ProcCostClsCd,
            NULL,
            pnumTransactionTyp,
            pvc2MesssageCode,
            pnumReadCount,
            vc2Remarks,
            0,
            SYSDATE,
            pvc2UserId,
            pvc2BusinessName,
            SYSDATE,
            pvc2UserId,
            pvc2BusinessName,
            FIRST_MODIFY_COUNT
        );
        
        RETURN TRUE;
    END;
    
BEGIN
    
    /* LogFile の OPEN */
    blnRet := FNCLOGOPEN(pvc2OutputPath, pvc2OutputName,pvc2TargetPlantCd, pvc2OutputMode, UTL_FileHandle);
    
    /* TraceLogの出力(Start)処理を行う */
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2TargetPlantCd, MY_SQL_NAME, METHOD_START);
    
    /* 業務開始メッセージの作成 */
    vc2Comment      := SUBSTR('　工場コード：' || '[ ' || pvc2TargetPlantCd || ' ]' ||
                              '　対象年度：' || '[ ' || pvc2Year || ' ]' ||
                              '　半期区分：' || '[ ' || pvc2HalfTermTyp || ' ]' ||
                              '　原価種別：' || '[ ' || pvc2CostTyp        || ' ]',1,256);
    
    /* 業務開始メッセージの出力 */
    blnRet :=   FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                          pvc2TargetPlantCd, MY_SQL_NAME, APS_COM_BATCH_START,
                          '(SBM0514)' || LOGMSG_START_PGNM || vc2Comment);
    COMMIT;
    
    vc2Comment      := SUBSTR('READ COUNT:' || numReadCount || ' ' ||
                              'ERROR COUNT:' || numErrCnt, 1, 256);
    
    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                        pvc2TargetPlantCd, MY_SQL_NAME, 'DB04001', null);
    
    COMMIT;
    
    intProcCostIFName := DBMS_SQL.OPEN_CURSOR;
    vc2Sql := 'SELECT ';
    vc2Sql := vc2Sql || '  YEAR, ';                --年度
    vc2Sql := vc2Sql || '  HALF_TERM_TYP, ';       --半期区分
    vc2Sql := vc2Sql || '  COST_TYP, ';            --原価種別
    vc2Sql := vc2Sql || '  PLANT_CD, ';            --工場コード
    vc2Sql := vc2Sql || '  CS_PROC_CD, ';          --工程コード
    vc2Sql := vc2Sql || '  PROC_COST_CLS_CD, ';    --加工費分類コード
    vc2Sql := vc2Sql || '  ITEM_CD, ';             --品目番号
    vc2Sql := vc2Sql || '  PROC_COST_UNIT_QTY, ';  --加工費単位数
    vc2Sql := vc2Sql || '  STOCK_UNIT, ';          --計量単位
    vc2Sql := vc2Sql || '  PROC_COST_01, ';        --加工費01
    vc2Sql := vc2Sql || '  PROC_COST_02, ';        --加工費02
    vc2Sql := vc2Sql || '  PROC_COST_03, ';        --加工費03
    vc2Sql := vc2Sql || '  PROC_COST_04, ';        --加工費04
    vc2Sql := vc2Sql || '  PROC_COST_05, ';        --加工費05
    vc2Sql := vc2Sql || '  PROC_COST_06, ';        --加工費06
    vc2Sql := vc2Sql || '  PROC_COST_07, ';        --加工費07
    vc2Sql := vc2Sql || '  PROC_COST_08, ';        --加工費08
    vc2Sql := vc2Sql || '  PROC_COST_09, ';        --加工費09
    vc2Sql := vc2Sql || '  PROC_COST_10, ';        --加工費10
    vc2Sql := vc2Sql || '  PROC_COST_11, ';        --加工費11
    vc2Sql := vc2Sql || '  PROC_COST_12, ';        --加工費12
    vc2Sql := vc2Sql || '  CLASIFICATION_CD, ';    --品目管理コード
    vc2Sql := vc2Sql || '  COMPANY_CD, ';          --会社コード
    vc2Sql := vc2Sql || '  ORG_CD, ';              --部門コード
    vc2Sql := vc2Sql || '  SAVE_UPDATED_DATE, ';   --退避更新日
    vc2Sql := vc2Sql || '  TRANSACTION_TYP, ';     --処理区分
    vc2Sql := vc2Sql || '  UPD_FLG ';              --更新済フラグ
    vc2Sql := vc2Sql || 'FROM ';
    vc2Sql := vc2Sql || '  T_PROC_COST_IF ';       --加工費I/F
    vc2Sql := vc2Sql || 'WHERE ';
    vc2Sql := vc2Sql || '  YEAR = TO_NUMBER(''' || pvc2Year || ''') ';
    vc2Sql := vc2Sql || '  AND HALF_TERM_TYP = TO_NUMBER(''' || pvc2HalfTermTyp || ''') ';
    vc2Sql := vc2Sql || '  AND COST_TYP = TO_NUMBER(''' || pvc2CostTyp || ''') ';
    vc2Sql := vc2Sql || '  AND PLANT_CD = ''' || pvc2TargetPlantCd || ''' ';
    vc2Sql := vc2Sql || '  AND UPD_FLG = 0 ';
    vc2Sql := vc2Sql || 'ORDER BY ';
    vc2Sql := vc2Sql || '  DECODE(ITEM_CD,''*'','''',ITEM_CD) NULLS LAST, ';
    vc2Sql := vc2Sql || '  CS_PROC_CD ASC, ';
    vc2Sql := vc2Sql || '  PROC_COST_CLS_CD ASC';
    
    -- ＳＱＬ文解析
    DBMS_SQL.PARSE(intProcCostIFName, vc2Sql, DBMS_SQL.NATIVE);
    
    -- 列定義
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 1, numYear);                  --年度
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 2, numHalfTermTyp);           --半期区分
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 3, numCostTyp);               --原価種別
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 4, vc2PlantCd, 8);            --工場コード
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 5, vc2CsProcCd, 100);          --工程コード
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 6, vc2ProcCostClsCd, 100);     --加工費分類コード
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 7, vc2ItemCd, 100);            --品目番号
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 8, numProcCostUnitQty);       --加工費単位数
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 9, vc2StockUnit, 48);         --計量単位
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 10, numProcCost01);           --加工費01
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 11, numProcCost02);           --加工費02
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 12, numProcCost03);           --加工費03
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 13, numProcCost04);           --加工費04
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 14, numProcCost05);           --加工費05
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 15, numProcCost06);           --加工費06
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 16, numProcCost07);           --加工費07
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 17, numProcCost08);           --加工費08
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 18, numProcCost09);           --加工費09
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 19, numProcCost10);           --加工費10
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 20, numProcCost11);           --加工費11
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 21, numProcCost12);           --加工費12
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 22, vc2ClasificationCd, 100);  --品目管理コード
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 23, vc2CompanyCd, 100);        --会社コード
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 24, vc2OrgCd, 100);            --部門コード
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 25, dtmSaveUpdatedDate);      --退避更新日
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 26, numTransactionTyp);       --処理区分
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 27, numUpdFlg);               --更新済フラグ
    
    -- カーソル実行
    intRet := DBMS_SQL.EXECUTE(intProcCostIFName);
    
    -- 行フェッチ
    LOOP
        
        IF DBMS_SQL.FETCH_ROWS(intProcCostIFName) > 0 THEN
        
          BEGIN
              -- フェッチした値の取得
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 1, numYear);              --年度
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 2, numHalfTermTyp);       --半期区分
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 3, numCostTyp);           --原価種別
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 4, vc2PlantCd);           --工場コード
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 5, vc2CsProcCd);          --工程コード
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 6, vc2ProcCostClsCd);     --加工費分類コード
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 7, vc2ItemCd);            --品目番号
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 8, numProcCostUnitQty);   --加工費単位数
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 9, vc2StockUnit);         --計量単位
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 10, numProcCost01);       --加工費01
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 11, numProcCost02);       --加工費02
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 12, numProcCost03);       --加工費03
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 13, numProcCost04);       --加工費04
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 14, numProcCost05);       --加工費05
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 15, numProcCost06);       --加工費06
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 16, numProcCost07);       --加工費07
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 17, numProcCost08);       --加工費08
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 18, numProcCost09);       --加工費09
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 19, numProcCost10);       --加工費10
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 20, numProcCost11);       --加工費11
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 21, numProcCost12);       --加工費12
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 22, vc2ClasificationCd);  --品目管理コード
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 23, vc2CompanyCd);        --会社コード
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 24, vc2OrgCd);            --部門コード
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 25, dtmSaveUpdatedDate);  --退避更新日
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 26, numTransactionTyp);   --処理区分
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 27, numUpdFlg);           --更新済フラグ
              
              numReadCount := numReadCount + 1;
              
              --加工費インタフェース入力チェック
              --品目番号≠'*' かつ [品目]に存在しない場合エラー
              --[ZZ11002]品目番号が存在しません。
              IF vc2ItemCd != '*' THEN
                  --品目読込
                  OPEN curM_ITEM(vc2ItemCd);
                  FETCH curM_ITEM INTO vc2Tmp;
                  IF curM_ITEM%NOTFOUND THEN
                      CLOSE curM_ITEM;
                      vc2MesssageCode := 'ZZ11002';
                      RAISE excERR_PROC_COST_IF;
                  END IF;
                  CLOSE curM_ITEM;
              END IF;
              
              --工場コード、工程コードが[工程マスタ]に存在しない場合エラー
              --[DB00012]工程が存在しません。
              vc2OrgCd_CsProc := NULL;
              OPEN curM_CS_PROC(vc2PlantCd, vc2CsProcCd);
              FETCH curM_CS_PROC INTO vc2OrgCd_CsProc;
              IF curM_CS_PROC%NOTFOUND THEN
                  CLOSE curM_CS_PROC;
                  vc2MesssageCode := 'DB00012';
                  RAISE excERR_PROC_COST_IF;
              END IF;
              CLOSE curM_CS_PROC;
              
              --部門コード≠Null、かつ、工場コード、工程コードで[工程マスタ]が存在し、
              --[工程マスタ]."部門コード"≠部門コードの場合エラー
              --[DB04003]工程マスタと加工費インタフェースの部門コードがことなっています。
              IF vc2OrgCd IS NOT NULL THEN
                  IF vc2OrgCd_CsProc IS NOT NULL THEN
                      IF vc2OrgCd != vc2OrgCd_CsProc THEN
                          vc2MesssageCode := 'DB04003';
                          RAISE excERR_PROC_COST_IF;
                      END IF;
                  END IF;
              END IF;
              
              --加工費分類コードが、[加工費分類マスタ]に存在しない場合エラー
              --[DB04004]加工費分類マスタが存在しません。
              OPEN curM_PROC_COST_CLS(vc2ProcCostClsCd);
              FETCH curM_PROC_COST_CLS INTO vc2Tmp;
              IF curM_PROC_COST_CLS%NOTFOUND THEN
                  CLOSE curM_PROC_COST_CLS;
                  vc2MesssageCode := 'DB04004';
                  RAISE excERR_PROC_COST_IF;
              END IF;
              CLOSE curM_PROC_COST_CLS;
              
              --処理区分＝1(新規)かつ、品目番号＝'*'で、年度＋半期区分＋原価種別＋工場コード
              --＋工程コード＋加工費分類コードが[加工費分類マスタ]に既に存在する場合エラー
              --[DB00013]加工費マスタが既に存在しています。
              IF numTransactionTyp = 1 THEN
                  IF vc2ItemCd = '*' THEN
                      OPEN curM_PROC_COST(
                        numYear
                       ,numHalfTermTyp
                       ,numCostTyp
                       ,vc2PlantCd
                       ,vc2CsProcCd
                       ,vc2ProcCostClsCd
                      );
                      FETCH curM_PROC_COST INTO numUpdateTyp;
                      IF curM_PROC_COST%FOUND THEN
                          CLOSE curM_PROC_COST;
                          vc2MesssageCode := 'DB00013';
                          RAISE excERR_PROC_COST_IF;
                      END IF;
                      CLOSE curM_PROC_COST;
                  END IF;
              END IF;
              
              --処理区分＝2(更新)または3(削除)かつ、品目番号＝'*'で、
              --年度＋半期区分＋原価種別＋工場コード＋工程コード＋加工費分類コードが
              --[加工費分類マスタ]に存在しない場合エラー
              --[DB00014]加工費マスタが存在しません。
              IF numTransactionTyp = 2 OR numTransactionTyp = 3 THEN
                  IF vc2ItemCd = '*' THEN
                      OPEN curM_PROC_COST(
                        numYear
                       ,numHalfTermTyp
                       ,numCostTyp
                       ,vc2PlantCd
                       ,vc2CsProcCd
                       ,vc2ProcCostClsCd
                      );
                      FETCH curM_PROC_COST INTO numUpdateTyp;
                      IF curM_PROC_COST%NOTFOUND THEN
                          CLOSE curM_PROC_COST;
                          vc2MesssageCode := 'DB00014';
                          RAISE excERR_PROC_COST_IF;
                      END IF;
                      CLOSE curM_PROC_COST;
                  END IF;
              END IF;
              
              IF numTransactionTyp = 1 THEN
                  --処理区分が1(新規)の場合
                  IF vc2ItemCd = '*' THEN
                      --加工費合計計算
                      numProcCostSum := 
                          numProcCost01 + 
                          numProcCost02 + 
                          numProcCost03 + 
                          numProcCost04 + 
                          numProcCost05 + 
                          numProcCost06 + 
                          numProcCost07 + 
                          numProcCost08 + 
                          numProcCost09 + 
                          numProcCost10 + 
                          numProcCost11 + 
                          numProcCost12;
                      
                      --加工費マスタ追加
                      vc2ItemCd_Item := null;
                      INSERT INTO M_PROC_COST(
                          YEAR,
                          HALF_TERM_TYP,
                          COST_TYP,
                          PLANT_CD,
                          CS_PROC_CD,
                          PROC_COST_CLS_CD,
                          PROC_COST_UNIT_QTY,
                          STOCK_UNIT,
                          PROC_COST_01,
                          PROC_COST_02,
                          PROC_COST_03,
                          PROC_COST_04,
                          PROC_COST_05,
                          PROC_COST_06,
                          PROC_COST_07,
                          PROC_COST_08,
                          PROC_COST_09,
                          PROC_COST_10,
                          PROC_COST_11,
                          PROC_COST_12,
                          PROC_COST_SUM,
                          UPDATE_TYP,
                          DEL_FLG,
                          CREATED_DATE,
                          CREATED_BY,
                          CREATED_PRG_NM,
                          UPDATED_DATE,
                          UPDATED_BY,
                          UPDATED_PRG_NM,
                          MODIFY_COUNT
                      ) VALUES (
                          numYear,
                          numHalfTermTyp,
                          numCostTyp,
                          vc2PlantCd,
                          vc2CsProcCd,
                          vc2ProcCostClsCd,
                          numProcCostUnitQty,
                          vc2StockUnit,
                          numProcCost01,
                          numProcCost02,
                          numProcCost03,
                          numProcCost04,
                          numProcCost05,
                          numProcCost06,
                          numProcCost07,
                          numProcCost08,
                          numProcCost09,
                          numProcCost10,
                          numProcCost11,
                          numProcCost12,
                          numProcCostSum,
                          1,
                          0,
                          SYSDATE,
                          pvc2UserId,
                          pvc2BusinessName,
                          SYSDATE,
                          pvc2UserId,
                          pvc2BusinessName,
                          FIRST_MODIFY_COUNT
                      );
                      
                  ELSE
                      
                      --工場コード＋品目番号＋加工費分類コードで[品目別加工費マスタ]を検索
                      --レコードが存在し、"加工費分類コード"が'*'以外の場合エラー
                      --[DB00015]品目別加工費マスタが既に存在しています。
                      OPEN curM_ITEM_PROC_COST2(
                          vc2PlantCd,
                          vc2ItemCd,
                          vc2ProcCostClsCd
                      );
                      FETCH curM_ITEM_PROC_COST2 
                          INTO vc2ProcCostClsCd_ItemProcCost, vc2CsProcCd_ItemProcCost;
                      IF curM_ITEM_PROC_COST2%FOUND 
                          AND vc2ProcCostClsCd_ItemProcCost != '*' THEN
                          CLOSE curM_ITEM_PROC_COST2;
                          vc2MesssageCode := 'DB00015';
                          RAISE excERR_PROC_COST_IF;
                      END IF;
                      CLOSE curM_ITEM_PROC_COST2;
                      
                      --品目別加工費マスタの削除
                      DELETE 
                          M_ITEM_PROC_COST
                      WHERE
                          PLANT_CD = vc2PlantCd
                          AND ITEM_CD = vc2ItemCd
                          AND PROC_COST_CLS_CD = '*';
                      
                      --品目別加工費マスタの追加
                      INSERT INTO M_ITEM_PROC_COST(
                          PLANT_CD,
                          ITEM_CD,
                          PROC_COST_CLS_CD,
                          CS_PROC_CD,
                          CLASIFICATION_CD,
                          ONEROUS_CONS_FLG,
                          CREATED_DATE,
                          CREATED_BY,
                          CREATED_PRG_NM,
                          UPDATED_DATE,
                          UPDATED_BY,
                          UPDATED_PRG_NM,
                          MODIFY_COUNT
                      ) VALUES (
                          vc2PlantCd,
                          vc2ItemCd,
                          vc2ProcCostClsCd,
                          vc2CsProcCd,
                          vc2ClasificationCd,
                          0,
                          SYSDATE,
                          pvc2UserId,
                          pvc2BusinessName,
                          SYSDATE,
                          pvc2UserId,
                          pvc2BusinessName,
                          FIRST_MODIFY_COUNT
                      );
                      
                  END IF;
                  
              ELSIF numTransactionTyp = 2 THEN
                
                  --処理区分が2(更新)の場合
                  
                  IF vc2ItemCd = '*' THEN
                      
                      --[原価パラメータ]読込
                      OPEN curSYS_COST_CTRL(vc2PlantCd);
                      FETCH curSYS_COST_CTRL INTO numMProcCostPriorityTyp;
                      CLOSE curSYS_COST_CTRL;
                      
                      --[原価パラメータ]."加工費マスタ優先区分" = 1(マスタメンテナンス)の場合で、
                      --[加工費マスタ]."更新区分"=2(マスタメンテナンスで更新)の場合エラー
                      --[DB00009]マスタメンテナンスで更新済のため、更新しませんでした。
                      IF numMProcCostPriorityTyp = 1 THEN
                          IF numUpdateTyp = 2 THEN 
                              vc2MesssageCode := 'DB00009';
                              RAISE excERR_PROC_COST_IF;
                          END IF;
                      END IF;
                      
                      --加工費合計計算
                      numProcCostSum := 
                          numProcCost01 + 
                          numProcCost02 + 
                          numProcCost03 + 
                          numProcCost04 + 
                          numProcCost05 + 
                          numProcCost06 + 
                          numProcCost07 + 
                          numProcCost08 + 
                          numProcCost09 + 
                          numProcCost10 + 
                          numProcCost11 + 
                          numProcCost12;
                          
                      --加工費マスタ更新
                      UPDATE
                          M_PROC_COST
                      SET
                          PROC_COST_UNIT_QTY = numProcCostUnitQty,
                          STOCK_UNIT = vc2StockUnit,
                          PROC_COST_01 = numProcCost01,
                          PROC_COST_02 = numProcCost02,
                          PROC_COST_03 = numProcCost03,
                          PROC_COST_04 = numProcCost04,
                          PROC_COST_05 = numProcCost05,
                          PROC_COST_06 = numProcCost06,
                          PROC_COST_07 = numProcCost07,
                          PROC_COST_08 = numProcCost08,
                          PROC_COST_09 = numProcCost09,
                          PROC_COST_10 = numProcCost10,
                          PROC_COST_11 = numProcCost11,
                          PROC_COST_12 = numProcCost12,
                          PROC_COST_SUM = numProcCostSum,
                          UPDATE_TYP = 1,
                          DEL_FLG = 0,
                          UPDATED_DATE = SYSDATE,
                          UPDATED_BY = pvc2UserId,
                          UPDATED_PRG_NM = pvc2BusinessName,
                          MODIFY_COUNT = MODIFY_COUNT + 1
                      WHERE
                          YEAR = numYear
                          AND HALF_TERM_TYP = numHalfTermTyp
                          AND COST_TYP = numCostTyp
                          AND PLANT_CD = vc2PlantCd
                          AND CS_PROC_CD = vc2CsProcCd
                          AND PROC_COST_CLS_CD = vc2ProcCostClsCd;
                      
                  ELSE
                      
                      --工場コード＋品目番号＋加工費分類コードで[品目別加工費マスタ]を検索
                      --レコードが存在しない場合エラー
                      --[DB00016]品目別加工費マスタが存在しません。
                      OPEN curM_ITEM_PROC_COST2(
                          vc2PlantCd,
                          vc2ItemCd,
                          vc2ProcCostClsCd
                      );
                      FETCH curM_ITEM_PROC_COST2 
                          INTO vc2ProcCostClsCd_ItemProcCost, vc2CsProcCd_ItemProcCost;
                      IF curM_ITEM_PROC_COST2%NOTFOUND THEN
                          CLOSE curM_ITEM_PROC_COST2;
                          vc2MesssageCode := 'DB00016';
                          RAISE excERR_PROC_COST_IF;
                      END IF;
                      CLOSE curM_ITEM_PROC_COST2;
                      
                      --工場コード＋品目番号＋加工費分類コードで[品目別加工費マスタ]を検索
                      --レコードが存在し、
                      --[加工費インタフェース]."工程コード"≠[品目別加工費マスタ]."工程コード"
                      --の場合エラー
                      --[DB00010]指定した品目番号は他の工程コードで登録済みです。
                      OPEN curM_ITEM_PROC_COST3(
                          vc2PlantCd,
                          vc2ItemCd,
                          vc2CsProcCd
                      );
                      FETCH curM_ITEM_PROC_COST3 
                          INTO vc2ProcCostClsCd_ItemProcCost, vc2CsProcCd_ItemProcCost;
                      IF curM_ITEM_PROC_COST3%FOUND THEN
                          CLOSE curM_ITEM_PROC_COST3;
                          vc2MesssageCode := 'DB00010';
                          RAISE excERR_PROC_COST_IF;
                      END IF;
                      CLOSE curM_ITEM_PROC_COST3;
                      
                      --品目別加工費マスタの更新を行う。
                      UPDATE 
                          M_ITEM_PROC_COST
                      SET
                          CLASIFICATION_CD = vc2ClasificationCd,
                          UPDATED_DATE = SYSDATE,
                          UPDATED_BY = pvc2UserId,
                          UPDATED_PRG_NM = pvc2BusinessName,
                          MODIFY_COUNT = MODIFY_COUNT + 1
                      WHERE
                          PLANT_CD = vc2PlantCd
                          AND ITEM_CD = vc2ItemCd
                          AND CS_PROC_CD = vc2CsProcCd
                          AND PROC_COST_CLS_CD = vc2ProcCostClsCd;
                          
                  END IF;
                  
              ELSIF numTransactionTyp = 3 THEN
              
                  --処理区分が3(削除)の場合                                    
                  IF vc2ItemCd = '*' THEN
                      --[原価パラメータ]読込
                      OPEN curSYS_COST_CTRL(vc2PlantCd);
                      FETCH curSYS_COST_CTRL INTO numMProcCostPriorityTyp;
                      CLOSE curSYS_COST_CTRL;
                      
                      --[原価パラメータ]."加工費マスタ優先区分" = 1(マスタメンテナンス)の場合で、
                      --[加工費マスタ]."更新区分"=2(マスタメンテナンスで更新)の場合エラー
                      --[DB00009]マスタメンテナンスで更新済のため、更新しませんでした。
                      IF numMProcCostPriorityTyp = 1 THEN
                           IF numUpdateTyp = 2 THEN 
                              vc2MesssageCode := 'DB00009';
                              RAISE excERR_PROC_COST_IF;
                           END IF;
                      END IF;
                      OPEN curM_ITEM_PROC_COST4(
                          vc2PlantCd,
                          vc2CsProcCd,
                          vc2ProcCostClsCd
                      );
                      FETCH curM_ITEM_PROC_COST4 
                          INTO vc2ProcCostClsCd_ItemProcCost, vc2CsProcCd_ItemProcCost;
                      IF curM_ITEM_PROC_COST4%FOUND THEN
                          CLOSE curM_ITEM_PROC_COST4;
                          vc2MesssageCode := 'DA03001';
                          RAISE excERR_PROC_COST_IF;
                      END IF;
                      CLOSE curM_ITEM_PROC_COST4;
                      --加工費マスタの更新を行う。（論理削除）
                      UPDATE
                          M_PROC_COST
                      SET
                          UPDATE_TYP = 1,
                          DEL_FLG = 1,
                          UPDATED_DATE = SYSDATE,
                          UPDATED_BY = pvc2UserId,
                          UPDATED_PRG_NM = pvc2BusinessName,
                          MODIFY_COUNT = MODIFY_COUNT + 1
                      WHERE
                          YEAR = numYear
                          AND HALF_TERM_TYP = numHalfTermTyp
                          AND COST_TYP = numCostTyp
                          AND PLANT_CD = vc2PlantCd
                          AND CS_PROC_CD = vc2CsProcCd
                          AND PROC_COST_CLS_CD = vc2ProcCostClsCd;
                  END IF;

                  IF vc2ItemCd != '*' THEN
                     --物理削除品目別加工費マスタ
                     DELETE 
                         M_ITEM_PROC_COST
                     WHERE
                         PLANT_CD = vc2PlantCd
                         AND ITEM_CD = vc2ItemCd
                         AND CS_PROC_CD = vc2CsProcCd
                         AND PROC_COST_CLS_CD = vc2ProcCostClsCd;
                  END IF;
                  
              END IF;
              
              --エラーがなかった場合、年度、半期区分、原価種別、工場コード、加工費分類コードが
              --等しい、すべての[加工費インタフェース]の更新を行う。
              UPDATE
                  T_PROC_COST_IF
              SET
                  UPD_FLG = 1,
                  UPDATED_DATE = SYSDATE,
                  UPDATED_BY = pvc2UserId,
                  UPDATED_PRG_NM = pvc2BusinessName,
                  MODIFY_COUNT = MODIFY_COUNT + 1
              WHERE
                  YEAR = numYear
                  AND HALF_TERM_TYP = numHalfTermTyp
                  AND COST_TYP = numCostTyp
                  AND PLANT_CD = vc2PlantCd
                  AND PROC_COST_CLS_CD = vc2ProcCostClsCd
                  AND ITEM_CD = vc2ItemCd
                  AND CS_PROC_CD = vc2CsProcCd;
              
              --コミット
              COMMIT;
              
              numNormalCount := numNormalCount + 1;
              
          EXCEPTION
              
              WHEN excERR_PROC_COST_IF THEN
                  ROLLBACK;
                  numErrCnt := numErrCnt + 1;
                  blnRet := SubFncInsertCsError(
                      vc2PlantCd,
                      vc2ItemCd,
                      vc2CsProcCd,
                      vc2ProcCostClsCd,
                      numTransactionTyp,
                      vc2MesssageCode,
                      numReadCount
                  );
                  COMMIT;
                  
              WHEN OTHERS THEN
                  ROLLBACK;
                  numErrCnt := numErrCnt + 1;
                  
                  -- カーソルクローズ
                  DBMS_SQL.CLOSE_CURSOR(intProcCostIFName);
                  RAISE;
                
          END;
          
        ELSE
            
            EXIT;
            
        END IF;
        
    END LOOP;
    
    -- カーソルクローズ
    DBMS_SQL.CLOSE_CURSOR(intProcCostIFName);
    
    /*  */
    vc2Comment      := SUBSTR('READ COUNT:' || numReadCount || ' ' ||
                              'ERROR COUNT:' || numErrCnt, 1, 256);
    
    /* 終了メッセージの出力 */
    blnRet          := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId, pvc2BusinessName,
                                 pvc2TargetPlantCd, MY_SQL_NAME, 'DB04002',
                                 vc2Comment);
    
    COMMIT;
    
    /* 業務終了メッセージの作成 */
    
    vc2Comment      := SUBSTR('　対象件数：' || '[ ' || numReadCount || ' ]' ||
                              '　正常件数：' || '[ ' || numNormalCount || ' ]' ||
                              '　異常件数：' || '[ ' || numErrCnt || ' ]',1,256);
    
    /* 終了メッセージの出力 */
    blnRet          := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId, pvc2BusinessName,
                                 pvc2TargetPlantCd, MY_SQL_NAME, APS_COM_BATCH_END,
                                 '(SBM0515)' || LOGMSG_END_PGNM || vc2Comment);
    
    COMMIT;
    
    /* トレースログの出力(終了) */
    blnRet          := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                   pvc2UserId,pvc2BusinessName,
                                   pvc2TargetPlantCd, MY_SQL_NAME, METHOD_END);
    
    COMMIT;
    
    /* LogFile の CLOSE */
    blnRet          := FNCLOGCLOSE(UTL_FileHandle);
    
--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    
    WHEN OTHERS THEN   --その他のエラー
        
        ROLLBACK;
        
        vc2Comment := SUBSTR('＊＊＊その他のエラーが発生しました＊＊＊',1,256);
        
        /* 終了メッセージの出力 */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
                            pvc2BusinessName, pvc2TargetPlantCd, MY_SQL_NAME, APS_COM_BATCH_END,
                            '(SBM0516)' ||  LOGMSG_END_PGNM || vc2Comment);
        
        /* トレースログの出力(終了) */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId,pvc2BusinessName, pvc2TargetPlantCd, MY_SQL_NAME, METHOD_END);
        
        COMMIT;
        
        /* LogFile の CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);
    
END;
/