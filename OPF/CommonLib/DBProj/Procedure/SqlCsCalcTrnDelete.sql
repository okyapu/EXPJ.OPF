CREATE OR REPLACE procedure      SQLCSCALCTRNDELETE(
/*------------------------------------------------------------------------------
'
'$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/DBProj/Procedure/SqlCsCalcTrnDelete.sql,v $
'$Author: tai-yanhong $
'$Revision: 1.7 $ $Date: 2013/08/07 05:19:11 $
'                        2005.10.21 unicode対応（varchar2を4倍）
'
'
' 機能      : 原価計算TRN削除処理
'
' 戻り値    :
'
'
' 引き数    : ■MetamorBase共通（必須）
'             pvc2LogMode          - (i)ＬＯＧモード
'             pvc2OutputMode       - (i)出力モード
'             pvc2OutputPath       - (i)出力ファイルパス
'             pvc2OutputName       - (i)出力ファイル名
'             pvc2UserId           - (i)ユーザＩＤ
'             pvc2BusinessName     - (i)業務名
'             pvc2PlantCd          - (i)工場コード
'             ■プログラム固有
'             pnumCostTyp          - (i)原価種別
'             pnumCsCalcTrnPeriod  - (i)原価計算トラン保持期間
'             pnumReturn           - (o)処理結果 (1:正常終了、2:警告終了、3:異常終了)
'
'
' 機能説明  : [品目]、[製品構成]を基に、標準原価計算用の[構成品ワーク]の作成を行う。
'
' 備考      :
'
------------------------------------------------------------------------------*/

--< プロシージャ名定義 >-----------------------------------------------------
    pvc2LogMode          IN  VARCHAR2        --ＬＯＧモード
   ,pvc2OutputMode       IN  VARCHAR2        --出力モード
   ,pvc2OutputPath       IN  VARCHAR2        --出力パス
   ,pvc2OutputName       IN  VARCHAR2        --出力ファイル名
   ,pvc2UserId           IN  VARCHAR2        --ユーザＩＤ
   ,pvc2BusinessName     IN  VARCHAR2        --業務名
   ,pvc2PlantCd          IN  VARCHAR2        --工場コード
   ,pnumCostTyp          IN  NUMBER          --原価種別
   ,pnumCsCalcTrnPeriod  IN  NUMBER          --原価計算トラン保持期間
   ,pnumReturn           OUT NUMBER          --処理結果
)
IS

    /* 定数の宣言 */

    METHOD_START            VARCHAR2(20) := 'START';          --ログ用メソッド開始宣言
    METHOD_END              VARCHAR2(12) := 'End';            --ログ用メソッド終了宣言
    MY_SQL_NAME             VARCHAR2(120) := 'SQLCSCALCTRNDELETE'; --ＰＬ／ＳＱＬ名

    APS_COM_BATCH_START     VARCHAR2(28) := 'DE04201';        --バッチ処理を開始しました。
    APS_COM_BATCH_END       VARCHAR2(28) := 'DE04202';        --バッチ処理を終了しました。
    APS_COM_BATCH_EXP       VARCHAR2(28) := 'DE04203';        --バッチ処理を終了しました。

    LOGMSG_START_PGNM       VARCHAR2(200) := '(SBM0329)原価計算TRN削除処理を開始しました';
    LOGMSG_END_PGNM         VARCHAR2(200) := '原価計算TRN削除処理を終了しました';
    LOGMSG_EXP_PGNM         VARCHAR2(200) := '原価計算TRN削除処理が異常終了しました';

    STATUS_NORMAL           NUMBER        := 1;          -- 正常終了
    STATUS_WARNING          NUMBER        := 2;          -- 警告終了
    STATUS_ERROR            NUMBER        := 3;          -- 異常終了

    /* 変数の定義 */
    UTL_FileHandle          UTL_FILE.FILE_TYPE;     --ファイルハンドル

    blnRet                  BOOLEAN;        --共通関数の戻値
    vc2Comment              VARCHAR2(1024);  --メッセージ作成用
    numYear                 NUMBER(4) := 0;  -- 年度
    numHalfTermTyp          NUMBER(2) := 0;  -- 半期区分
    numCostTyp              NUMBER(2) := 0;  -- 原価種別
    vc2PlantCd              VARCHAR2(8);     -- 工場コード
    vc2RootItemCd           VARCHAR2(100);   -- 最上位品目番号

    numT_ITEM_COST_DELETE   NUMBER(11)   := 0;

    vc2CS_CALC_TRN_PERIOD   VARCHAR2(32);

    /* 例外処理用変数 */
    excERR_SKIP       EXCEPTION;      --実行不可
    excERR_MAST       EXCEPTION;      --カーソルOPEN中のEXCEPTION

    /* カーソルの宣言  品目別原価*/
    CURSOR curT_ITEM_COST(
         cvc2UpdateDate VARCHAR2
    )
    IS
      SELECT *
        FROM  T_ITEM_COST
        WHERE  COST_TYP=pnumCostTyp
          AND  PLANT_CD=pvc2PlantCd
          AND  UPPER_ITEM_FLG =1
          AND  TO_CHAR(UPDATED_DATE,'YYYYMMDD') < cvc2UpdateDate
      ;
    recT_ITEM_COST curT_ITEM_COST%ROWTYPE;
    
    CURSOR curT_ITEM_COST01(
         cvc2UpdateDate VARCHAR2,
         vc2RootItemCd    VARCHAR2
    )
    IS
      SELECT YEAR,
             HALF_TERM_TYP,
             COST_TYP,
             PLANT_CD,
             ITEM_CD
        FROM  T_ITEM_COST
        WHERE  COST_TYP=pnumCostTyp
          AND  PLANT_CD=pvc2PlantCd
          AND  ROOT_ITEM_CD = vc2RootItemCd
          AND  TO_CHAR(UPDATED_DATE,'YYYYMMDD') < cvc2UpdateDate
      ;
    recT_ITEM_COST01 curT_ITEM_COST01%ROWTYPE;
    
    /* カーソルの宣言  品目別加工費*/
    CURSOR curT_ITEM_PROC_COST(
         numYear          NUMBER,
         numHalfTermTyp   NUMBER,
         numCostTyp       NUMBER,
         vc2PlantCd       VARCHAR2,
         vc2RootItemCd    VARCHAR2
    )
    IS
      SELECT YEAR,
             HALF_TERM_TYP,
             COST_TYP,
             PLANT_CD,
             ITEM_CD,
             PROC_COST_CLS_CD
        FROM  T_ITEM_PROC_COST
        WHERE  YEAR           = numYear
         AND   HALF_TERM_TYP  = numHalfTermTyp
         AND   COST_TYP       = numCostTyp
         AND   PLANT_CD       = vc2PlantCd
         AND   ROOT_ITEM_CD   = vc2RootItemCd
      ;
    recT_ITEM_PROC_COST curT_ITEM_PROC_COST%ROWTYPE;

BEGIN
    /* LogFile の OPEN */
    blnRet :=  FNCLOGOPEN(pvc2OutputPath, pvc2OutputName,pvc2PlantCd, pvc2OutputMode, UTL_FileHandle);

    /* TraceLogの出力(Start)処理を行う */
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, METHOD_START);

    /* 業務開始メッセージの出力 */
    blnRet :=   FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_START,
                          LOGMSG_START_PGNM);
    COMMIT;

    /* カウンタの初期化 */
    numT_ITEM_COST_DELETE := 0;

    vc2CS_CALC_TRN_PERIOD  := TO_CHAR(TO_NUMBER(TO_CHAR(SYSDATE,'YYYY')) - pnumCsCalcTrnPeriod,'FM0000')||'0101';

    BEGIN  /* カーソルOPEN(品目別原価) */ 
        OPEN  curT_ITEM_COST(vc2CS_CALC_TRN_PERIOD);
    EXCEPTION
        WHEN OTHERS THEN
            vc2Comment  :=  SUBSTR('OPEN curT_ITEM_COST '  ||
                                   ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                   ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
            RAISE  excERR_MAST;
    END;  /* カーソルOPEN(品目別原価) */ 

    LOOP  /* 削除(品目別原価)の繰り返し*/

        BEGIN  /* カーソルFETCH（品目別原価） */
            FETCH  curT_ITEM_COST  INTO  recT_ITEM_COST;
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment  :=  SUBSTR('FETCH curT_ITEM_COST '  ||
                                       ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                       ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE  excERR_MAST;
        END;  /* カーソルFETCH（品目別原価） */
    
        EXIT WHEN  curT_ITEM_COST%NOTFOUND;
        
        
        BEGIN  /* カーソルOPEN(品目別加工費) */ 
            OPEN  curT_ITEM_PROC_COST(recT_ITEM_COST.YEAR,
                                      recT_ITEM_COST.HALF_TERM_TYP,
                                      recT_ITEM_COST.COST_TYP,
                                      recT_ITEM_COST.PLANT_CD,
                                      recT_ITEM_COST.ROOT_ITEM_CD);
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment  :=  SUBSTR('OPEN curT_ITEM_PROC_COST '  ||
                                       ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                       ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE  excERR_MAST;
        END;  /* カーソルOPEN(品目別加工費) */ 
        
        BEGIN  /* カーソルOPEN(品目別原価) */ 
            OPEN  curT_ITEM_COST01(vc2CS_CALC_TRN_PERIOD,recT_ITEM_COST.ROOT_ITEM_CD);
        EXCEPTION
        WHEN OTHERS THEN
            vc2Comment  :=  SUBSTR('OPEN curT_ITEM_COST01 '  ||
                                   ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                   ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
            RAISE  excERR_MAST;
        END;  /* カーソルOPEN(品目別原価) */ 
        
        BEGIN  /* 品目別原価・削除 */
            DELETE  FROM  T_ITEM_COST
               WHERE   YEAR           = recT_ITEM_COST.YEAR
                 AND   HALF_TERM_TYP  = recT_ITEM_COST.HALF_TERM_TYP
                 AND   COST_TYP       = recT_ITEM_COST.COST_TYP
                 AND   PLANT_CD       = recT_ITEM_COST.PLANT_CD
                 AND   ROOT_ITEM_CD   = recT_ITEM_COST.ROOT_ITEM_CD
            ;
            /* 品目別加工費・削除 */
            DELETE  FROM  T_ITEM_PROC_COST
                WHERE  YEAR           = recT_ITEM_COST.YEAR
                 AND   HALF_TERM_TYP  = recT_ITEM_COST.HALF_TERM_TYP
                 AND   COST_TYP       = recT_ITEM_COST.COST_TYP
                 AND   PLANT_CD       = recT_ITEM_COST.PLANT_CD
                 AND   ROOT_ITEM_CD   = recT_ITEM_COST.ROOT_ITEM_CD
            ;
            numT_ITEM_COST_DELETE := numT_ITEM_COST_DELETE + 1; 

        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment  :=  SUBSTR('DELETE  T_ITEM_COST '  ||
                                       ' YEAR='         || '[ ' || recT_ITEM_COST.YEAR          || ' ]' ||
                                       ' HALF_TERM_TYP='|| '[ ' || recT_ITEM_COST.HALF_TERM_TYP || ' ]' ||
                                       ' COST_TYP='     || '[ ' || recT_ITEM_COST.COST_TYP      || ' ]' ||
                                       ' PLANT_CD='     || '[ ' || recT_ITEM_COST.PLANT_CD      || ' ]' ||
                                       ' ROOT_ITEM_CD=' || '[ ' || recT_ITEM_COST.ITEM_CD       || ' ]' ||
                                       ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                       ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE  excERR_MAST;
        END;  /* 品目別原価・削除 */
        
        LOOP
            BEGIN
                FETCH curT_ITEM_COST01 INTO recT_ITEM_COST01;
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment  :=  SUBSTR('FETCH curT_ITEM_COST01 '  ||
                                           ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                           ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE  excERR_MAST;
            END;  /* カーソルFETCH（品目別原価） */
            EXIT WHEN  curT_ITEM_COST01%NOTFOUND;
            BEGIN
                /* 在庫評価金額・削除 */
                DELETE  FROM  T_STOCK_VAL_H
                WHERE  YEAR           = recT_ITEM_COST01.YEAR
                 AND   HALF_TERM_TYP  = recT_ITEM_COST01.HALF_TERM_TYP
                 AND   COST_TYP       = recT_ITEM_COST01.COST_TYP
                 AND   PLANT_CD       = recT_ITEM_COST01.PLANT_CD
                 AND   ITEM_CD        = recT_ITEM_COST01.ITEM_CD
            ;
            EXCEPTION
                WHEN OTHERS THEN
                vc2Comment  :=  SUBSTR('DELETE  T_STOCK_VAL_H '  ||
                                       ' YEAR='            || '[ ' || recT_ITEM_COST01.YEAR          || ' ]' ||
                                       ' HALF_TERM_TYP='   || '[ ' || recT_ITEM_COST01.HALF_TERM_TYP || ' ]' ||
                                       ' COST_TYP='        || '[ ' || recT_ITEM_COST01.COST_TYP      || ' ]' ||
                                       ' PLANT_CD='        || '[ ' || recT_ITEM_COST01.PLANT_CD      || ' ]' ||
                                       ' ITEM_CD='         || '[ ' || recT_ITEM_COST01.ITEM_CD       || ' ]' ||
                                       ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                       ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE  excERR_MAST;
            END;  /* 在庫評価金額・削除 */
            
        END LOOP;  /* 削除(品目別原価)の繰り返し*/
        
        CLOSE curT_ITEM_COST01;
                
        LOOP  /* 削除(品目別加工費)の繰り返し*/

            BEGIN  /* カーソルFETCH（品目別加工費） */
                FETCH  curT_ITEM_PROC_COST  INTO  recT_ITEM_PROC_COST;
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment  :=  SUBSTR('FETCH curT_ITEM_PROC_COST '  ||
                                           ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                           ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE  excERR_MAST;
            END;  /* カーソルFETCH（品目別加工費） */
    
            EXIT WHEN  curT_ITEM_PROC_COST%NOTFOUND;
            
            BEGIN  /* 在庫評価金額明細・削除 */
                DELETE  FROM  T_STOCK_VAL
                WHERE  YEAR             = recT_ITEM_PROC_COST.YEAR
                 AND   HALF_TERM_TYP    = recT_ITEM_PROC_COST.HALF_TERM_TYP
                 AND   COST_TYP         = recT_ITEM_PROC_COST.COST_TYP
                 AND   PLANT_CD         = recT_ITEM_PROC_COST.PLANT_CD
                 AND   ITEM_CD          = recT_ITEM_PROC_COST.ITEM_CD
                 AND   PROC_COST_CLS_CD = recT_ITEM_PROC_COST.PROC_COST_CLS_CD
            ;
            EXCEPTION
            WHEN OTHERS THEN
                vc2Comment  :=  SUBSTR('DELETE  T_STOCK_VAL '  ||
                                       ' YEAR='            || '[ ' || recT_ITEM_PROC_COST.YEAR          || ' ]' ||
                                       ' HALF_TERM_TYP='   || '[ ' || recT_ITEM_PROC_COST.HALF_TERM_TYP || ' ]' ||
                                       ' COST_TYP='        || '[ ' || recT_ITEM_PROC_COST.COST_TYP      || ' ]' ||
                                       ' PLANT_CD='        || '[ ' || recT_ITEM_PROC_COST.PLANT_CD      || ' ]' ||
                                       ' ITEM_CD='         || '[ ' || recT_ITEM_PROC_COST.ITEM_CD       || ' ]' ||
                                       ' PROC_COST_CLS_CD='|| '[ ' || recT_ITEM_PROC_COST.PROC_COST_CLS_CD   || ' ]' ||
                                       ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                       ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE  excERR_MAST;
            END;  /* 在庫評価金額明細・削除 */
            
        END LOOP;  /* 削除(品目別加工費)の繰り返し*/
        
        CLOSE curT_ITEM_PROC_COST;
        
    END LOOP;  /* 削除(品目別原価)の繰り返し*/

    CLOSE curT_ITEM_COST;

    COMMIT;  --COMMITは最後に１回のみ

/* 処理の終了 */

    /* 終了メッセージの出力 */
    vc2Comment  := SUBSTR(' T_ITEM_COST DELETE=' || '[ ' || numT_ITEM_COST_DELETE || ' ]',1,256);
    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                        pvc2UserId, pvc2BusinessName,
                        pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_END,
                        vc2Comment
                        );

    COMMIT;

    /* トレースログの出力(終了) */
    blnRet          := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                   pvc2UserId,pvc2BusinessName,
                                   pvc2PlantCd, MY_SQL_NAME, METHOD_END);

    COMMIT;

    /* LogFile の CLOSE */
    blnRet          := FNCLOGCLOSE(UTL_FileHandle);

    pnumReturn := STATUS_NORMAL; --正常終了

--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN excERR_SKIP THEN    --実行不可

        ROLLBACK;

        /* 終了メッセージの出力 */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_EXP,
                            vc2Comment);

        /* トレースログの出力(終了) */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId,pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, METHOD_END);

        COMMIT;

        /* LogFile の CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

        pnumReturn := STATUS_ERROR; /* 異常終了 */

    WHEN excERR_MAST THEN    --カーソルOPEN中のＤＢエラー

        IF curT_ITEM_COST%ISOPEN = TRUE THEN
            CLOSE curT_ITEM_COST;
        END IF;

        ROLLBACK;

        /* 終了メッセージの出力 */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_EXP,
                            vc2Comment);

        /* トレースログの出力(終了) */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId,pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, METHOD_END);

        COMMIT;

        /* LogFile の CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

        pnumReturn := STATUS_ERROR; /* 異常終了 */

    WHEN OTHERS  THEN   --その他のエラー

        IF curT_ITEM_COST%ISOPEN = TRUE THEN
            CLOSE curT_ITEM_COST;
        END IF;

        ROLLBACK;

        /* 終了メッセージの出力 */
        vc2Comment      := SUBSTR('(SBM0328) ＊＊その他のエラーが発生しました＊＊'  ||
                                  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_EXP,
                            vc2Comment);

        /* トレースログの出力(終了) */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId,pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, METHOD_END);

        COMMIT;

        /* LogFile の CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

        pnumReturn := STATUS_ERROR; /* 異常終了 */

END;
/
