CREATE OR REPLACE procedure      SQLSTDITEMCOSTACCOUNT(
/*------------------------------------------------------------------------------
'
'$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/DBProj/Procedure/SqlStdItemCostAccount.sql,v $
'$Author: feng-yi $
'$Revision: 1.4 $ $Date: 2011/12/23 03:19:58 $
'                        2005.10.24 unicode対応（varchar2を4倍）
'                        2006/08/08 品目別加工費の製品構成版数をVARCHAR2で定義
'
'
' 機能      : 品目別標準原価積上処理
'
' 戻り値    :
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
'             pnumYear             - (i)対象年度
'             pnumHalfTermTyp      - (i)半期区分
'             pnumCostTyp          - (i)原価種別
'             pnumActTyp           - (i)実行区分（1:通常実行、2:再実行）
'             pnumReturn           - (o)処理結果 (1:正常終了、2:警告終了、3:異常終了)
'
' 機能説明  : [品目別原価]、[品目別加工費]の標準原価積上計算を行う。
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
   ,pnumYear             IN  NUMBER          --対象年度
   ,pnumHalfTermTyp      IN  NUMBER          --半期区分
   ,pnumCostTyp          IN  NUMBER          --原価種別
   ,pnumActTyp           IN  NUMBER          --実行区分
   ,pnumReturn           OUT NUMBER          --処理結果
)
IS

    /* 定数の宣言 */

    METHOD_START            VARCHAR2(20) := 'START';          --ログ用メソッド開始宣言
    METHOD_END              VARCHAR2(12) := 'End';            --ログ用メソッド終了宣言
    MY_SQL_NAME             VARCHAR2(120) := 'SQLSTDITEMCOSTACCOUNT'; --ＰＬ／ＳＱＬ名

    APS_COM_BATCH_START     VARCHAR2(28) := 'DC01207';
    APS_COM_BATCH_END       VARCHAR2(28) := 'DC01208';
    APS_COM_BATCH_EXP       VARCHAR2(28) := 'DC01209';

    LOGMSG_START_PGNM       VARCHAR2(200) := '(SBM0532)品目別標準原価積上処理を開始しました';
    LOGMSG_END_PGNM         VARCHAR2(200) := '品目別標準原価積上処理を終了しました';
    LOGMSG_EXP_PGNM         VARCHAR2(200) := '品目別標準原価積上処理が異常終了しました';

    STATUS_NORMAL           NUMBER        := 1;          -- 正常終了
    STATUS_WARNING          NUMBER        := 2;          -- 警告終了
    STATUS_ERROR            NUMBER        := 3;          -- 異常終了

    /* 変数の定義 */
    UTL_FileHandle          UTL_FILE.FILE_TYPE;    --ファイルハンドル

    numCntTest              NUMBER(11)   := 0;     --DEBUG用

    numCntMain              NUMBER(11)  := 0;    --対象データ件数(品目別原価)
    numCountLoop            NUMBER(11)  := 0;     --LOOP件数
    numCntUp1               NUMBER(11)  := 0;    --対象データ件数(品目別原価)
    numCntUp2               NUMBER(11)  := 0;    --対象データ件数(品目別原価)
    numCountError           NUMBER(11)  := 0;     --異常データ件数
    numCountDummy           NUMBER(11)  := 0;     --件数チェック用

    blnRet                  BOOLEAN;               --共通関数の戻値
    vc2Comment              VARCHAR2(1024);         --メッセージ作成用

    vc2PhaseStartMonth      VARCHAR2(24);           --指定半期の期首月
    vc2PhaseEndMonth        VARCHAR2(24);           --指定半期の期末月

    vc2ParentItemCd         T_ITEM_COST.PARENT_ITEM_CD%TYPE;  
    numPsEdition            T_ITEM_COST.PS_EDITION%TYPE;  
    vc2CsProcCd             T_ITEM_COST.CS_PROC_CD%TYPE;  
    numPROC_TotalProcCostSum  T_ITEM_COST.TOTAL_PROC_COST_SUM_ALL%TYPE;
    numToatlMatrCost        T_ITEM_COST.UNDER_MATR_COST%TYPE;
    numToatlSbcntMatrCost   T_ITEM_COST.UNDER_SBCNT_MATR_COST%TYPE;
    numToatlProcCostSum     T_ITEM_COST.UNDER_PROC_COST_SUM_ALL%TYPE;
    numCostStatementNo      T_ITEM_COST.COST_STATEMENT_NO%TYPE;  
    numParentCostStatementNo  T_ITEM_COST.PARENT_COST_STATEMENT_NO%TYPE;  

    numTotalProcCost01      T_ITEM_PROC_COST.TOTAL_PROC_COST_01%TYPE;
    numTotalProcCost02      T_ITEM_PROC_COST.TOTAL_PROC_COST_02%TYPE;
    numTotalProcCost03      T_ITEM_PROC_COST.TOTAL_PROC_COST_03%TYPE;
    numTotalProcCost04      T_ITEM_PROC_COST.TOTAL_PROC_COST_04%TYPE;
    numTotalProcCost05      T_ITEM_PROC_COST.TOTAL_PROC_COST_05%TYPE;
    numTotalProcCost06      T_ITEM_PROC_COST.TOTAL_PROC_COST_06%TYPE;
    numTotalProcCost07      T_ITEM_PROC_COST.TOTAL_PROC_COST_07%TYPE;
    numTotalProcCost08      T_ITEM_PROC_COST.TOTAL_PROC_COST_08%TYPE;
    numTotalProcCost09      T_ITEM_PROC_COST.TOTAL_PROC_COST_09%TYPE;
    numTotalProcCost10      T_ITEM_PROC_COST.TOTAL_PROC_COST_10%TYPE;
    numTotalProcCost11      T_ITEM_PROC_COST.TOTAL_PROC_COST_11%TYPE;
    numTotalProcCost12      T_ITEM_PROC_COST.TOTAL_PROC_COST_12%TYPE;
    numTotalProcCostSum     T_ITEM_PROC_COST.TOTAL_PROC_COST_SUM%TYPE;

    /* ＤＢからの取得項目 */
    numStartMonth           SYS_COST_CTRL.START_MONTH%TYPE;       --年度開始月

    /* 例外処理用変数 */
    excERR_SKIP            EXCEPTION;      --実行不可
    excERR_CURSOR          EXCEPTION;      --カーソルOPEN中のEXCEPTION

    /* カーソルの宣言  品目別原価*/
    CURSOR curMAIN(
         cnumUpLevelNo    NUMBER
    )
    IS
--  SELECT *
SELECT
 YEAR
,HALF_TERM_TYP
,COST_TYP
,PLANT_CD
,ROOT_ITEM_CD
,PARENT_ITEM_CD
,ITEM_CD
,PS_EDITION
,COST_STATEMENT_NO
,LOWER_ITEM_FLG
,COST_EXCLUDE_FLG
,NECESSARY_QTY
,ITEM_INPUT_RATIO
,UPPER_ITEM_FLG
,UNDER_MATR_COST
,UNDER_SBCNT_MATR_COST
,UNDER_PROC_COST_SUM_ALL
,OWN_MATR_COST
,OWN_SBCNT_MATR_COST
,OWN_PROC_COST_SUM_ALL
,PARENT_COST_STATEMENT_NO
      FROM T_ITEM_COST
      WHERE YEAR=pnumYear
      AND   HALF_TERM_TYP=pnumHalfTermTyp
      AND   COST_TYP=pnumCostTyp
      AND   PLANT_CD=pvc2PlantCd
      AND   UP_LEVEL_NO=cnumUpLevelNo
--  共通部品を0クリアする為、除外品も検索対象とする
--    AND   COST_EXCLUDE_FLG=0  --原価計算除外フラグ
--    AND   ROOT_ITEM_CD = 'OPM-01005-BLK'  --DEGUG用 UMINO
      ORDER BY COST_STATEMENT_NO DESC,PARENT_ITEM_CD,ITEM_CD,ROOT_ITEM_CD
      ;
    recMAIN curMAIN%ROWTYPE;

    /* カーソルの宣言  品目別加工費*/
    CURSOR curITEM_PROC_COST(
         cvc2RootItemCd       VARCHAR2
        ,cvc2ParentItemCd     VARCHAR2
        ,cvc2ItemCd           VARCHAR2
        ,cnumPsEdition        VARCHAR2
        ,cnumCostStatementNo  NUMBER
    )
    IS
--  SELECT  T.*
    SELECT
 YEAR
,HALF_TERM_TYP
,COST_TYP
,PLANT_CD
,ROOT_ITEM_CD
,PARENT_ITEM_CD
,ITEM_CD
,PS_EDITION
,COST_STATEMENT_NO
,PROC_COST_CLS_CD
,OWN_PROC_COST_01
,OWN_PROC_COST_02
,OWN_PROC_COST_03
,OWN_PROC_COST_04
,OWN_PROC_COST_05
,OWN_PROC_COST_06
,OWN_PROC_COST_07
,OWN_PROC_COST_08
,OWN_PROC_COST_09
,OWN_PROC_COST_10
,OWN_PROC_COST_11
,OWN_PROC_COST_12
,UNDER_PROC_COST_01
,UNDER_PROC_COST_02
,UNDER_PROC_COST_03
,UNDER_PROC_COST_04
,UNDER_PROC_COST_05
,UNDER_PROC_COST_06
,UNDER_PROC_COST_07
,UNDER_PROC_COST_08
,UNDER_PROC_COST_09
,UNDER_PROC_COST_10
,UNDER_PROC_COST_11
,UNDER_PROC_COST_12
      FROM    T_ITEM_PROC_COST
      WHERE   YEAR             = pnumYear
        AND   HALF_TERM_TYP    = pnumHalfTermTyp
        AND   COST_TYP         = pnumCostTyp
        AND   PLANT_CD         = pvc2PlantCd
        AND   ROOT_ITEM_CD     = cvc2RootItemCd
        AND   PARENT_ITEM_CD   = cvc2ParentItemCd
        AND   ITEM_CD          = cvc2ItemCd
        AND   PS_EDITION       = cnumPsEdition
        AND   COST_STATEMENT_NO= cnumCostStatementNo
    ;
    recITEM_PROC_COST curITEM_PROC_COST%ROWTYPE;

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
    numCntMain          := 0;     /*対象データ件数(品目別原価)  */
    numCountError       := 0;     /*異常データ件数(原価エラー)  */

    /*  原価管理パラメータの読込 */ 
    BEGIN
        SELECT  START_MONTH  
          INTO  numStartMonth
          FROM  SYS_COST_CTRL
          WHERE  PLANT_CD  =  pvc2PlantCd;
    EXCEPTION
        WHEN OTHERS THEN
            vc2Comment := SUBSTR('(SBM0535)1:原価管理パラメータが存在しません。'  ||
                                 ' USER_CD=' || '[ ' || pvc2UserId || ' ]' ||
                                 ' PLANT_CD=' || '[ ' || pvc2PlantCd || ' ]',1,256);
            RAISE   excERR_SKIP;  
    END;

    /*  パラメータのチェック  対象年度*/
    IF  pnumYear  IS  NULL  THEN
        vc2Comment := SUBSTR('(SBM0536)2:パラメータ不正。'  ||
                             ' 対象年度=' || '[ ' || pnumYear || '	]',1,256);
        RAISE   excERR_SKIP;  
    END IF;
    /*  パラメータのチェック  半期区分*/
    IF  pnumHalfTermTyp  NOT IN (1,2)  THEN
        vc2Comment := SUBSTR('(SBM0218)3:パラメータ不正。'  ||
                             ' 半期区分=' || '[ ' || pnumHalfTermTyp || ' ]',1,256);
        RAISE   excERR_SKIP;  
    END IF;

    /*  対象年度/半期区分/年度開始月より、指定半期の期首月/期末月を取得 */
    vc2PhaseStartMonth :=  TO_CHAR(pnumYear + FLOOR((numStartMonth  -1+((pnumHalfTermTyp-1)*6))/12) ||
                                   LPAD( MOD((numStartMonth  -1+((pnumHalfTermTyp-1)*6)),12)+1 ,2,'0')
                                  ); 
    vc2PhaseEndMonth   :=  TO_CHAR(pnumYear + FLOOR((numStartMonth+5-1+((pnumHalfTermTyp-1)*6))/12) ||
                                   LPAD( MOD((numStartMonth+5-1+((pnumHalfTermTyp-1)*6)),12)+1 ,2,'0')
                                  ); 

/*●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
' 階層ごとのﾙｰﾌﾟ
●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●*/

    FOR i IN 1..999999 LOOP  /* 階層レベルごとのループ */

    BEGIN  /* カーソルOPEN(品目別原価) */
        OPEN  curMAIN(i);
    EXCEPTION
        WHEN OTHERS THEN
            vc2Comment  := SUBSTR('4:OPEN curMAIN'  ||
                                  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
            RAISE    excERR_CURSOR;
    END;  /* カーソルOPEN(品目別原価) */

    /* PUT_LINE */
        blnRet :=   FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                      pvc2PlantCd, MY_SQL_NAME, 'MAIN-LOOP UP_LEVEL_NO='||i);
    /* PUT_LINE */

/*○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
' 階層ごとのﾙｰﾌﾟ－１階層のﾙｰﾌﾟ
○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●*/

    numCountLoop := 0;  /*1レベル内対象データ件数*/

    /* PUT_LINE */
    numCntTest := 0;
    /* PUT_LINE */
    
    LOOP  /*  品目別原価の繰り返し(MAIN LOOP) */
        BEGIN  /* カーソルFETCH(品目別原価) */
            FETCH  curMAIN  INTO  recMAIN;
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment := SUBSTR('5:FETCH curMAIN'  ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE  excERR_CURSOR;
        END;  /* カーソルFETCH(品目別原価) */
        EXIT WHEN  curMAIN%NOTFOUND;

        numCntMain   := numCntMain   + 1;  /* 対象データ件数(品目別原価) */
        numCountLoop := numCountLoop + 1;  /*1レベル内対象データ件数*/
/* PUT_LINE */
        numCntTest   := numCntTest   + 1;
/*   PUT_LINE */

    /* PUT_LINE */
        IF  numCntTest >=  10000 THEN
            blnRet :=   FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                      pvc2PlantCd, MY_SQL_NAME, 'SUB-LOOP numCountLoop='||numCountLoop);
            numCntTest := 0;
        END IF;
    /*  PUT_LINE */

        numPROC_TotalProcCostSum := 0;  /*Σ品目別加工費*/

        BEGIN  /* カーソルOPEN(品目別加工費) */
            OPEN  curITEM_PROC_COST(recMAIN.ROOT_ITEM_CD
                                   ,recMAIN.PARENT_ITEM_CD
                                   ,recMAIN.ITEM_CD
                                   ,recMAIN.PS_EDITION
                                   ,recMAIN.COST_STATEMENT_NO
                                   );
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment  := SUBSTR('6:OPEN curITEM_PROC_COST'  ||
                                      ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                      ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE    excERR_CURSOR;
        END;  /* カーソルOPEN(品目別加工費) */

/*○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
' 階層ごとのﾙｰﾌﾟ－１階層のﾙｰﾌﾟ－品目別加工費のﾙｰﾌﾟ
○○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●*/

        LOOP  /*  品目別加工費の繰り返し */
            BEGIN  /* カーソルFETCH(品目別加工費) */
                FETCH  curITEM_PROC_COST  INTO  recITEM_PROC_COST;
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment  := SUBSTR('7:FETCH curITEM_PROC_COST'  ||
                                          ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                          ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE  excERR_CURSOR;
            END;  /* カーソルFETCH(品目別加工費) */
            EXIT WHEN  curITEM_PROC_COST%NOTFOUND;

/*○○○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
' 階層ごとのﾙｰﾌﾟ－１階層のﾙｰﾌﾟ－品目別加工費のﾙｰﾌﾟ－自分の処理（末端品）
' (UNDER費=0,TOTAL費=OWN費)
○○○○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●*/

            IF  recMAIN.LOWER_ITEM_FLG = 1 THEN  /*[末端品]判定*/

                /*積上げ費計算*/
                IF  recMAIN.COST_EXCLUDE_FLG = 0 THEN
                    numTotalProcCost01  :=  recITEM_PROC_COST.OWN_PROC_COST_01;
                    numTotalProcCost02  :=  recITEM_PROC_COST.OWN_PROC_COST_02;
                    numTotalProcCost03  :=  recITEM_PROC_COST.OWN_PROC_COST_03;
                    numTotalProcCost04  :=  recITEM_PROC_COST.OWN_PROC_COST_04;
                    numTotalProcCost05  :=  recITEM_PROC_COST.OWN_PROC_COST_05;
                    numTotalProcCost06  :=  recITEM_PROC_COST.OWN_PROC_COST_06;
                    numTotalProcCost07  :=  recITEM_PROC_COST.OWN_PROC_COST_07;
                    numTotalProcCost08  :=  recITEM_PROC_COST.OWN_PROC_COST_08;
                    numTotalProcCost09  :=  recITEM_PROC_COST.OWN_PROC_COST_09;
                    numTotalProcCost10  :=  recITEM_PROC_COST.OWN_PROC_COST_10;
                    numTotalProcCost11  :=  recITEM_PROC_COST.OWN_PROC_COST_11;
                    numTotalProcCost12  :=  recITEM_PROC_COST.OWN_PROC_COST_12;
                ELSE
                    numTotalProcCost01  :=  0;
                    numTotalProcCost02  :=  0;
                    numTotalProcCost03  :=  0;
                    numTotalProcCost04  :=  0;
                    numTotalProcCost05  :=  0;
                    numTotalProcCost06  :=  0;
                    numTotalProcCost07  :=  0;
                    numTotalProcCost08  :=  0;
                    numTotalProcCost09  :=  0;
                    numTotalProcCost10  :=  0;
                    numTotalProcCost11  :=  0;
                    numTotalProcCost12  :=  0;
                END IF;
                numTotalProcCostSum  :=  numTotalProcCost01 + 
                                         numTotalProcCost02 +
                                         numTotalProcCost03 +
                                         numTotalProcCost04 +
                                         numTotalProcCost05 +
                                         numTotalProcCost06 +
                                         numTotalProcCost07 +
                                         numTotalProcCost08 +
                                         numTotalProcCost09 +
                                         numTotalProcCost10 +
                                         numTotalProcCost11 +
                                         numTotalProcCost12;
                /*T_ITEM_COST末端品用*/
                numPROC_TotalProcCostSum := numPROC_TotalProcCostSum + numTotalProcCostSum;

                BEGIN  /*[品目別加工費]更新(クリア)*/
                    UPDATE  T_ITEM_PROC_COST  SET
                            UNDER_PROC_COST_01  = 0
                           ,UNDER_PROC_COST_02  = 0
                           ,UNDER_PROC_COST_03  = 0
                           ,UNDER_PROC_COST_04  = 0
                           ,UNDER_PROC_COST_05  = 0
                           ,UNDER_PROC_COST_06  = 0
                           ,UNDER_PROC_COST_07  = 0
                           ,UNDER_PROC_COST_08  = 0
                           ,UNDER_PROC_COST_09  = 0
                           ,UNDER_PROC_COST_10  = 0
                           ,UNDER_PROC_COST_11  = 0
                           ,UNDER_PROC_COST_12  = 0
                           ,UNDER_PROC_COST_SUM = 0
                           ,TOTAL_PROC_COST_01  = numTotalProcCost01
                           ,TOTAL_PROC_COST_02  = numTotalProcCost02
                           ,TOTAL_PROC_COST_03  = numTotalProcCost03
                           ,TOTAL_PROC_COST_04  = numTotalProcCost04
                           ,TOTAL_PROC_COST_05  = numTotalProcCost05
                           ,TOTAL_PROC_COST_06  = numTotalProcCost06
                           ,TOTAL_PROC_COST_07  = numTotalProcCost07
                           ,TOTAL_PROC_COST_08  = numTotalProcCost08
                           ,TOTAL_PROC_COST_09  = numTotalProcCost09
                           ,TOTAL_PROC_COST_10  = numTotalProcCost10
                           ,TOTAL_PROC_COST_11  = numTotalProcCost11
                           ,TOTAL_PROC_COST_12  = numTotalProcCost12
                           ,TOTAL_PROC_COST_SUM = numTotalProcCostSum
                           ,UPDATED_DATE=SYSDATE,UPDATED_BY= pvc2UserId,UPDATED_PRG_NM= MY_SQL_NAME
                           ,MODIFY_COUNT = MODIFY_COUNT+1
                    WHERE   YEAR             = recITEM_PROC_COST.YEAR
                      AND   HALF_TERM_TYP    = recITEM_PROC_COST.HALF_TERM_TYP
                      AND   COST_TYP         = recITEM_PROC_COST.COST_TYP
                      AND   PLANT_CD         = recITEM_PROC_COST.PLANT_CD
                      AND   ROOT_ITEM_CD     = recITEM_PROC_COST.ROOT_ITEM_CD
                      AND   PARENT_ITEM_CD   = recITEM_PROC_COST.PARENT_ITEM_CD
                      AND   ITEM_CD          = recITEM_PROC_COST.ITEM_CD
                      AND   PS_EDITION       = recITEM_PROC_COST.PS_EDITION
                      AND   COST_STATEMENT_NO= recITEM_PROC_COST.COST_STATEMENT_NO
                      AND   PROC_COST_CLS_CD = recITEM_PROC_COST.PROC_COST_CLS_CD
                    ;
                EXCEPTION
                    WHEN OTHERS THEN
                        vc2Comment := SUBSTR('8:(SBM0538)UPDATE  T_ITEM_PROC_COST(クリア)'  ||
                                             ' ROOT_ITEM_CD：'   || '[ ' || recITEM_PROC_COST.ROOT_ITEM_CD   || ' ]' ||
                                             ' PARENT_ITEM_CD：' || '[ ' || recITEM_PROC_COST.PARENT_ITEM_CD || ' ]' ||
                                             ' ITEM_CD：'        || '[ ' || recITEM_PROC_COST.ITEM_CD        || ' ]' ||
                                             ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                             ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                        RAISE  excERR_CURSOR;
                END;  /*[品目別加工費]更新(クリア)*/

/*○○○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
' 階層ごとのﾙｰﾌﾟ－１階層のﾙｰﾌﾟ－品目別加工費のﾙｰﾌﾟ－自分の処理（末端品以外）
' (OWN費＋前の階層が積上げしたUNDER費=TOTAL費)
○○○○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●*/

            ELSE  /*[末端品]判定*/

                /*積上げ費計算(自TOTAL 兼 親UNDER)*/
                IF  recMAIN.COST_EXCLUDE_FLG = 0 THEN
                    numTotalProcCost01   :=  recITEM_PROC_COST.OWN_PROC_COST_01 + 
                              CEIL(recITEM_PROC_COST.UNDER_PROC_COST_01 * 
                                     recMAIN.NECESSARY_QTY *
                                     recMAIN.ITEM_INPUT_RATIO * 10000) / 10000;
                    numTotalProcCost02   :=  recITEM_PROC_COST.OWN_PROC_COST_02 + 
                              CEIL(recITEM_PROC_COST.UNDER_PROC_COST_02 * 
                                     recMAIN.NECESSARY_QTY *
                                     recMAIN.ITEM_INPUT_RATIO * 10000) / 10000;
                    numTotalProcCost03   :=  recITEM_PROC_COST.OWN_PROC_COST_03 + 
                                CEIL(recITEM_PROC_COST.UNDER_PROC_COST_03 * 
                                     recMAIN.NECESSARY_QTY *
                                     recMAIN.ITEM_INPUT_RATIO * 10000) / 10000;
                    numTotalProcCost04   :=  recITEM_PROC_COST.OWN_PROC_COST_04 + 
                                CEIL(recITEM_PROC_COST.UNDER_PROC_COST_04 * 
                                     recMAIN.NECESSARY_QTY *
                                     recMAIN.ITEM_INPUT_RATIO * 10000) / 10000;
                    numTotalProcCost05   :=  recITEM_PROC_COST.OWN_PROC_COST_05 + 
                                 CEIL(recITEM_PROC_COST.UNDER_PROC_COST_05 * 
                                     recMAIN.NECESSARY_QTY *
                                     recMAIN.ITEM_INPUT_RATIO * 10000) / 10000;
                    numTotalProcCost06   :=  recITEM_PROC_COST.OWN_PROC_COST_06 + 
                                  CEIL(recITEM_PROC_COST.UNDER_PROC_COST_06 * 
                                         recMAIN.NECESSARY_QTY *
                                         recMAIN.ITEM_INPUT_RATIO * 10000) / 10000;
                    numTotalProcCost07   :=  recITEM_PROC_COST.OWN_PROC_COST_07 + 
                                  CEIL(recITEM_PROC_COST.UNDER_PROC_COST_07 * 
                                         recMAIN.NECESSARY_QTY *
                                         recMAIN.ITEM_INPUT_RATIO * 10000) / 10000;
                    numTotalProcCost08   :=  recITEM_PROC_COST.OWN_PROC_COST_08 + 
                                  CEIL(recITEM_PROC_COST.UNDER_PROC_COST_08 * 
                                         recMAIN.NECESSARY_QTY *
                                         recMAIN.ITEM_INPUT_RATIO * 10000) / 10000;
                    numTotalProcCost09   :=  recITEM_PROC_COST.OWN_PROC_COST_09 + 
                                  CEIL(recITEM_PROC_COST.UNDER_PROC_COST_09 * 
                                         recMAIN.NECESSARY_QTY *
                                         recMAIN.ITEM_INPUT_RATIO * 10000) / 10000;
                    numTotalProcCost10   :=  recITEM_PROC_COST.OWN_PROC_COST_10 + 
                                  CEIL(recITEM_PROC_COST.UNDER_PROC_COST_10 * 
                                         recMAIN.NECESSARY_QTY *
                                         recMAIN.ITEM_INPUT_RATIO * 10000) / 10000;
                    numTotalProcCost11   :=  recITEM_PROC_COST.OWN_PROC_COST_11 + 
                                  CEIL(recITEM_PROC_COST.UNDER_PROC_COST_11 * 
                                         recMAIN.NECESSARY_QTY *
                                         recMAIN.ITEM_INPUT_RATIO * 10000) / 10000;
                    numTotalProcCost12   :=  recITEM_PROC_COST.OWN_PROC_COST_12 + 
                                  CEIL(recITEM_PROC_COST.UNDER_PROC_COST_12 * 
                                         recMAIN.NECESSARY_QTY *
                                         recMAIN.ITEM_INPUT_RATIO * 10000) / 10000;
                ELSE
                    numTotalProcCost01  :=  0;
                    numTotalProcCost02  :=  0;
                    numTotalProcCost03  :=  0;
                    numTotalProcCost04  :=  0;
                    numTotalProcCost05  :=  0;
                    numTotalProcCost06  :=  0;
                    numTotalProcCost07  :=  0;
                    numTotalProcCost08  :=  0;
                    numTotalProcCost09  :=  0;
                    numTotalProcCost10  :=  0;
                    numTotalProcCost11  :=  0;
                    numTotalProcCost12  :=  0;
                END IF;
                numTotalProcCostSum  :=  numTotalProcCost01 + 
                                         numTotalProcCost02 +
                                         numTotalProcCost03 +
                                         numTotalProcCost04 +
                                         numTotalProcCost05 +
                                         numTotalProcCost06 +
                                         numTotalProcCost07 +
                                         numTotalProcCost08 +
                                         numTotalProcCost09 +
                                         numTotalProcCost10 +
                                         numTotalProcCost11 +
                                         numTotalProcCost12;

                /*T_ITEM_COST末端品用*/
                numPROC_TotalProcCostSum := numPROC_TotalProcCostSum + numTotalProcCostSum;

                BEGIN  /*[品目別加工費]自分を更新(TOTAL費)*/
                    UPDATE  T_ITEM_PROC_COST  SET
                                TOTAL_PROC_COST_01  = numTotalProcCost01
                               ,TOTAL_PROC_COST_02  = numTotalProcCost02
                               ,TOTAL_PROC_COST_03  = numTotalProcCost03
                               ,TOTAL_PROC_COST_04  = numTotalProcCost04
                               ,TOTAL_PROC_COST_05  = numTotalProcCost05
                               ,TOTAL_PROC_COST_06  = numTotalProcCost06
                               ,TOTAL_PROC_COST_07  = numTotalProcCost07
                               ,TOTAL_PROC_COST_08  = numTotalProcCost08
                               ,TOTAL_PROC_COST_09  = numTotalProcCost09
                               ,TOTAL_PROC_COST_10  = numTotalProcCost10
                               ,TOTAL_PROC_COST_11  = numTotalProcCost11
                               ,TOTAL_PROC_COST_12  = numTotalProcCost12
                               ,TOTAL_PROC_COST_SUM = numTotalProcCostSum
                               ,UPDATED_DATE=SYSDATE,UPDATED_BY= pvc2UserId,UPDATED_PRG_NM= MY_SQL_NAME
                               ,MODIFY_COUNT = MODIFY_COUNT+1
                        WHERE   YEAR             = recITEM_PROC_COST.YEAR
                          AND   HALF_TERM_TYP    = recITEM_PROC_COST.HALF_TERM_TYP
                          AND   COST_TYP         = recITEM_PROC_COST.COST_TYP
                          AND   PLANT_CD         = recITEM_PROC_COST.PLANT_CD
                          AND   ROOT_ITEM_CD     = recITEM_PROC_COST.ROOT_ITEM_CD
                          AND   PARENT_ITEM_CD   = recITEM_PROC_COST.PARENT_ITEM_CD
                          AND   ITEM_CD          = recITEM_PROC_COST.ITEM_CD
                          AND   PS_EDITION       = recITEM_PROC_COST.PS_EDITION
                          AND   COST_STATEMENT_NO= recITEM_PROC_COST.COST_STATEMENT_NO
                          AND   PROC_COST_CLS_CD = recITEM_PROC_COST.PROC_COST_CLS_CD
                    ;
                EXCEPTION
                        WHEN OTHERS THEN
                        vc2Comment := SUBSTR('(SBM0540)9:UPDATE T_ITEM_PROC_COST(TOTAL費)'  ||
                                             ' ROOT_ITEM_CD：'   || '[ ' || recITEM_PROC_COST.ROOT_ITEM_CD   || ' ]' ||
                                             ' PARENT_ITEM_CD：' || '[ ' || recITEM_PROC_COST.PARENT_ITEM_CD || ' ]' ||
                                             ' ITEM_CD：'        || '[ ' || recITEM_PROC_COST.ITEM_CD        || ' ]' ||
                                             ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                             ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                        RAISE  excERR_CURSOR;
                END;  /*[品目別加工費]自分を更新(TOTAL費)*/


            END IF;  /*[末端品]判定*/

/*○○○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
' 階層ごとのﾙｰﾌﾟ－１階層のﾙｰﾌﾟ－品目別加工費のﾙｰﾌﾟ－親の処理（積上処理）
' （自分のTOTAL費を、親のUNDER費に加算）
○○○○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●*/

            IF  recMAIN.UPPER_ITEM_FLG = 0 THEN  /*[先頭品]でない時、[品目別加工費]積上*/
                BEGIN  /*[品目別原価]親のPKEY情報を検索*/
                    SELECT PARENT_ITEM_CD,PS_EDITION,CS_PROC_CD,COST_STATEMENT_NO,PARENT_COST_STATEMENT_NO
                        INTO  vc2ParentItemCd,numPsEdition,vc2CsProcCd,numCostStatementNo,numParentCostStatementNo
                        FROM T_ITEM_COST
                        WHERE   YEAR             = recMAIN.YEAR
                          AND   HALF_TERM_TYP    = recMAIN.HALF_TERM_TYP
                          AND   COST_TYP         = recMAIN.COST_TYP
                          AND   PLANT_CD         = recMAIN.PLANT_CD
                          AND   ROOT_ITEM_CD     = recMAIN.ROOT_ITEM_CD
                          AND   ITEM_CD          = recMAIN.PARENT_ITEM_CD
                          AND   COST_STATEMENT_NO= recMAIN.PARENT_COST_STATEMENT_NO
                          AND   ROWNUM           = 1
                    ;
                EXCEPTION
                    WHEN OTHERS THEN
                        vc2Comment := SUBSTR('10:SELECT T_ITEM_COST'  ||
                                             ' ROOT_ITEM_CD：' || '[ ' || recMAIN.ROOT_ITEM_CD   || ' ]' ||
                                             ' ITEM_CD：'      || '[ ' || recMAIN.PARENT_ITEM_CD || ' ]' ||
                                             ' COST_STATEMENT_NO='|| '[ ' || recMAIN.PARENT_COST_STATEMENT_NO || ' ]' ||
                                             ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                             ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
--  除外品も計算対象とする為、親のない子はABORTしない
                        vc2ParentItemCd    := NULL;
                        numPsEdition       := 0;
                        numCostStatementNo := 0;
--                      RAISE  excERR_CURSOR;
                END;  /*[品目別原価]親のPKEY情報を検索*/

                IF  vc2ParentItemCd IS NOT NULL THEN  /* 親のPKEY情報があるとき */
                /*[品目別加工費]親を検索*/
                SELECT COUNT(*) INTO  numCountDummy 
                  FROM T_ITEM_PROC_COST
                      WHERE   YEAR             = recMAIN.YEAR
                        AND   HALF_TERM_TYP    = recMAIN.HALF_TERM_TYP
                        AND   COST_TYP         = recMAIN.COST_TYP
                        AND   PLANT_CD         = recMAIN.PLANT_CD
                        AND   ROOT_ITEM_CD     = recMAIN.ROOT_ITEM_CD
                        AND   PARENT_ITEM_CD   = vc2ParentItemCd
                        AND   ITEM_CD          = recMAIN.PARENT_ITEM_CD
                        AND   PS_EDITION       = numPsEdition
                        AND   COST_STATEMENT_NO= numCostStatementNo
                        AND   PROC_COST_CLS_CD = recITEM_PROC_COST.PROC_COST_CLS_CD
                ;
                IF  numCountDummy = 0 THEN  /* [品目別加工費]INSERT/UPFATE判定 */
                    BEGIN  /*[品目別加工費]親を作成(UNDER費)*/
                        INSERT  INTO  T_ITEM_PROC_COST(
                                         YEAR,HALF_TERM_TYP,COST_TYP,PLANT_CD,ROOT_ITEM_CD
                                        ,PARENT_ITEM_CD,ITEM_CD,PS_EDITION,COST_STATEMENT_NO
                                        ,CS_PROC_CD,PROC_COST_CLS_CD
                                        ,OWN_PROC_COST_01,OWN_PROC_COST_02,OWN_PROC_COST_03,OWN_PROC_COST_04
                                        ,OWN_PROC_COST_05,OWN_PROC_COST_06,OWN_PROC_COST_07,OWN_PROC_COST_08
                                        ,OWN_PROC_COST_09,OWN_PROC_COST_10,OWN_PROC_COST_11,OWN_PROC_COST_12
                                        ,OWN_PROC_COST_SUM
                                        ,UNDER_PROC_COST_01,UNDER_PROC_COST_02,UNDER_PROC_COST_03,UNDER_PROC_COST_04
                                        ,UNDER_PROC_COST_05,UNDER_PROC_COST_06,UNDER_PROC_COST_07,UNDER_PROC_COST_08
                                        ,UNDER_PROC_COST_09,UNDER_PROC_COST_10,UNDER_PROC_COST_11,UNDER_PROC_COST_12
                                        ,UNDER_PROC_COST_SUM
                                        ,TOTAL_PROC_COST_01,TOTAL_PROC_COST_02,TOTAL_PROC_COST_03,TOTAL_PROC_COST_04
                                        ,TOTAL_PROC_COST_05,TOTAL_PROC_COST_06,TOTAL_PROC_COST_07,TOTAL_PROC_COST_08
                                        ,TOTAL_PROC_COST_09,TOTAL_PROC_COST_10,TOTAL_PROC_COST_11,TOTAL_PROC_COST_12
                                        ,TOTAL_PROC_COST_SUM
                                        ,PARENT_COST_STATEMENT_NO
                                        ,CREATED_DATE,CREATED_BY,CREATED_PRG_NM
                                        ,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM
                                        ,MODIFY_COUNT
                              )  VALUES (
                                         recMAIN.YEAR
                                        ,recMAIN.HALF_TERM_TYP
                                        ,recMAIN.COST_TYP
                                        ,recMAIN.PLANT_CD
                                        ,recMAIN.ROOT_ITEM_CD
                                        ,vc2ParentItemCd
                                        ,recMAIN.PARENT_ITEM_CD
                                        ,numPsEdition,numCostStatementNo
                                        ,vc2CsProcCd
                                        ,recITEM_PROC_COST.PROC_COST_CLS_CD
                                        ,0,0,0,0,0,0,0,0,0,0,0,0,0
                                        ,numTotalProcCost01,numTotalProcCost02,numTotalProcCost03
                                        ,numTotalProcCost04,numTotalProcCost05,numTotalProcCost06
                                        ,numTotalProcCost07,numTotalProcCost08,numTotalProcCost09
                                        ,numTotalProcCost10,numTotalProcCost11,numTotalProcCost12
                                        ,numTotalProcCostSum
                                        ,0,0,0,0,0,0,0,0,0,0,0,0,0
                                        ,numParentCostStatementNo
                                        ,SYSDATE,pvc2UserId,MY_SQL_NAME,SYSDATE,pvc2UserId,MY_SQL_NAME
                                        ,0
                        );
                    EXCEPTION
                        WHEN OTHERS THEN
                            vc2Comment := SUBSTR('(SBM0541)11:INSERT T_ITEM_COST(UNDER費)'  ||
                                                 ' ROOT_ITEM_CD='   || '[ ' || recMAIN.ROOT_ITEM_CD   || ' ]' ||
                                                 ' PARENT_ITEM_CD=' || '[ ' || vc2ParentItemCd        || ' ]' ||
                                                 ' ITEM_CD='        || '[ ' || recMAIN.PARENT_ITEM_CD || ' ]' ||
                                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                            RAISE  excERR_CURSOR;
                    END;  /*[品目別加工費]親を作成(UNDER費)*/

                ELSE  /* [品目別加工費]INSERT/UPFATE判定 */

                    BEGIN  /*[品目別加工費]親を更新(UNDER費)*/
                       UPDATE  T_ITEM_PROC_COST  SET
                                UNDER_PROC_COST_01  = UNDER_PROC_COST_01  + numTotalProcCost01
                               ,UNDER_PROC_COST_02  = UNDER_PROC_COST_02  + numTotalProcCost02
                               ,UNDER_PROC_COST_03  = UNDER_PROC_COST_03  + numTotalProcCost03
                               ,UNDER_PROC_COST_04  = UNDER_PROC_COST_04  + numTotalProcCost04
                               ,UNDER_PROC_COST_05  = UNDER_PROC_COST_05  + numTotalProcCost05
                               ,UNDER_PROC_COST_06  = UNDER_PROC_COST_06  + numTotalProcCost06
                               ,UNDER_PROC_COST_07  = UNDER_PROC_COST_07  + numTotalProcCost07
                               ,UNDER_PROC_COST_08  = UNDER_PROC_COST_08  + numTotalProcCost08
                               ,UNDER_PROC_COST_09  = UNDER_PROC_COST_09  + numTotalProcCost09
                               ,UNDER_PROC_COST_10  = UNDER_PROC_COST_10  + numTotalProcCost10
                               ,UNDER_PROC_COST_11  = UNDER_PROC_COST_11  + numTotalProcCost11
                               ,UNDER_PROC_COST_12  = UNDER_PROC_COST_12  + numTotalProcCost12
                               ,UNDER_PROC_COST_SUM = UNDER_PROC_COST_SUM + numTotalProcCostSum
                               ,UPDATED_DATE=SYSDATE,UPDATED_BY= pvc2UserId,UPDATED_PRG_NM= MY_SQL_NAME
                               ,MODIFY_COUNT = MODIFY_COUNT+1
                         WHERE   YEAR             = recMAIN.YEAR
                              AND   HALF_TERM_TYP    = recMAIN.HALF_TERM_TYP
                              AND   COST_TYP         = recMAIN.COST_TYP
                              AND   PLANT_CD         = recMAIN.PLANT_CD
                              AND   ROOT_ITEM_CD     = recMAIN.ROOT_ITEM_CD
                              AND   PARENT_ITEM_CD   = vc2ParentItemCd
                              AND   ITEM_CD          = recMAIN.PARENT_ITEM_CD
                              AND   PS_EDITION       = numPsEdition
                              AND   COST_STATEMENT_NO= numCostStatementNo
                              AND   PROC_COST_CLS_CD = recITEM_PROC_COST.PROC_COST_CLS_CD
                         ;
                    EXCEPTION
                        WHEN OTHERS THEN
                            vc2Comment := SUBSTR('(SBM0542)12:UPDATE T_ITEM_PROC_COST(UNDER費)'  ||
                                                 ' ROOT_ITEM_CD：'   || '[ ' || recMAIN.ROOT_ITEM_CD   || ' ]' ||
                                                 ' PARENT_ITEM_CD：' || '[ ' || vc2ParentItemCd        || ' ]' ||
                                                 ' ITEM_CD：'        || '[ ' || recMAIN.PARENT_ITEM_CD || ' ]' ||
                                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                            RAISE  excERR_CURSOR;
                    END;  /*[品目別加工費]親を更新(UNDER費)*/

                END IF;  /* [品目別加工費]INSERT/UPFATE判定 */

                numCntUp1  :=  numCntUp1 +1;  /*  積上件数(T_ITEM_PROC_COST) */

                END IF;  /* 親のPKEY情報があるとき */

            END IF;  /*[先頭品]でない時、[品目別加工費]積上*/

        END LOOP;  /*  品目別加工費の繰り返し */

        CLOSE curITEM_PROC_COST;  /* カーソルCLOSE(品目別加工費) */

/*○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
' 階層ごとのﾙｰﾌﾟ－１階層のﾙｰﾌﾟ－自分の処理（末端品）
' (UNDER費=0,TOTAL費=OWN費)
○○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●*/

        IF  recMAIN.LOWER_ITEM_FLG = 1 THEN  /*[末端品]判定*/

            /*積上げ費計算*/
            IF  recMAIN.COST_EXCLUDE_FLG = 0 THEN
                numToatlMatrCost      :=  recMAIN.OWN_MATR_COST;
                numToatlSbcntMatrCost :=  recMAIN.OWN_SBCNT_MATR_COST;
                numToatlProcCostSum   :=  numPROC_TotalProcCostSum;
            ELSE
                numToatlMatrCost      :=  0;
                numToatlSbcntMatrCost :=  0;
                numToatlProcCostSum   :=  0;
            END IF; 

            BEGIN  /*[品目別原価]更新(クリア)*/
                UPDATE  T_ITEM_COST  SET
                        UNDER_MATR_COST         = 0
                       ,TOTAL_MATR_COST         = numToatlMatrCost
                       ,UNDER_SBCNT_MATR_COST   = 0
                       ,TOTAL_SBCNT_MATR_COST   = numToatlSbcntMatrCost
                       ,UNDER_PROC_COST_SUM_ALL = 0
                       ,TOTAL_PROC_COST_SUM_ALL = numToatlProcCostSum
                       ,UPDATED_DATE=SYSDATE,UPDATED_BY= pvc2UserId,UPDATED_PRG_NM= MY_SQL_NAME
                       ,MODIFY_COUNT = MODIFY_COUNT+1
                WHERE   YEAR             = recMAIN.YEAR
                  AND   HALF_TERM_TYP    = recMAIN.HALF_TERM_TYP
                  AND   COST_TYP         = recMAIN.COST_TYP
                  AND   PLANT_CD         = recMAIN.PLANT_CD
                  AND   ROOT_ITEM_CD     = recMAIN.ROOT_ITEM_CD
                  AND   PARENT_ITEM_CD   = recMAIN.PARENT_ITEM_CD
                  AND   ITEM_CD          = recMAIN.ITEM_CD
                  AND   PS_EDITION       = recMAIN.PS_EDITION
                  AND   COST_STATEMENT_NO= recMAIN.COST_STATEMENT_NO
                ;

            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment  := SUBSTR('(SBM0543)13:UPDATE T_ITEM_COST(クリア)'  ||
                                          ' ROOT_ITEM_CD：'   || '[ ' || recMAIN.ROOT_ITEM_CD   || ' ]' ||
                                          ' PARENT_ITEM_CD：' || '[ ' || recMAIN.PARENT_ITEM_CD        || ' ]' ||
                                          ' ITEM_CD：'        || '[ ' || recMAIN.ITEM_CD || ' ]' ||
                                          ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                          ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE  excERR_CURSOR;
            END;  /*[品目別原価]更新(クリア)*/

/*○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
' 階層ごとのﾙｰﾌﾟ－１階層のﾙｰﾌﾟ－自分の処理（末端品以外）
' (OWN費＋前の階層が積上げしたUNDER費=TOTAL費)
○○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●*/

         ELSE  /*[末端品]判定*/

            /*積上げ費計算*/
            IF  recMAIN.COST_EXCLUDE_FLG = 0 THEN
                numToatlMatrCost      :=  recMAIN.OWN_MATR_COST + 
                                     CEIL(recMAIN.UNDER_MATR_COST * 
                                      recMAIN.NECESSARY_QTY *
                                      recMAIN.ITEM_INPUT_RATIO * 10000) / 10000;
                numToatlSbcntMatrCost :=  recMAIN.OWN_SBCNT_MATR_COST + 
                                     CEIL(recMAIN.UNDER_SBCNT_MATR_COST * 
                                      recMAIN.NECESSARY_QTY *
                                      recMAIN.ITEM_INPUT_RATIO * 10000) / 10000;
/* T_ITEM_COST.TOTAL_PROC_COST_SUMはΣ(T_ITEM_PROC_COST.TOTAL_PROC_COST_SUM)にする */
--              numToatlProcCostSum   :=  recMAIN.OWN_PROC_COST_SUM  + 
--                                 CEIL(recMAIN.UNDER_PROC_COST_SUM * 
--                                        recMAIN.NECESSARY_QTY *
--                                        recMAIN.ITEM_INPUT_RATIO * 10000) / 10000;
                numToatlProcCostSum   :=  numPROC_TotalProcCostSum;
            ELSE
                numToatlMatrCost      :=  0;
                numToatlSbcntMatrCost :=  0;
                numToatlProcCostSum   :=  0;
            END IF; 

            BEGIN  /*[品目別原価]更新(TOTAL費更新)*/
                UPDATE  T_ITEM_COST  SET
                        TOTAL_MATR_COST         = numToatlMatrCost
                       ,TOTAL_SBCNT_MATR_COST   = numToatlSbcntMatrCost
                       ,TOTAL_PROC_COST_SUM_ALL = numToatlProcCostSum
                       ,UPDATED_DATE=SYSDATE,UPDATED_BY= pvc2UserId,UPDATED_PRG_NM= MY_SQL_NAME
                       ,MODIFY_COUNT = MODIFY_COUNT+1
                WHERE   YEAR             = recMAIN.YEAR
                  AND   HALF_TERM_TYP    = recMAIN.HALF_TERM_TYP
                  AND   COST_TYP         = recMAIN.COST_TYP
                  AND   PLANT_CD         = recMAIN.PLANT_CD
                  AND   ROOT_ITEM_CD     = recMAIN.ROOT_ITEM_CD
                  AND   PARENT_ITEM_CD   = recMAIN.PARENT_ITEM_CD
                  AND   ITEM_CD          = recMAIN.ITEM_CD
                  AND   PS_EDITION       = recMAIN.PS_EDITION
                  AND   COST_STATEMENT_NO= recMAIN.COST_STATEMENT_NO
                ;

            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment := SUBSTR('(SBM0544)14:UPDATE T_ITEM_COST(TOTAL費)'  ||
                                         ' ROOT_ITEM_CD：'   || '[ ' || recMAIN.ROOT_ITEM_CD   || ' ]' ||
                                         ' PARENT_ITEM_CD：' || '[ ' || recMAIN.PARENT_ITEM_CD        || ' ]' ||
                                         ' ITEM_CD：'        || '[ ' || recMAIN.ITEM_CD || ' ]' ||
                                         ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                         ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE  excERR_CURSOR;
            END;  /*[品目別原価]更新(TOTAL費更新)*/
        END IF;  /*[末端品]判定*/

/*○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
' 階層ごとのﾙｰﾌﾟ－１階層のﾙｰﾌﾟ－親の処理（積上処理）
' （自分のTOTAL費を、親のUNDER費に加算）
○○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●*/

        IF  recMAIN.UPPER_ITEM_FLG = 0 THEN  /*[先頭品]でない時、[品目別原価]積上*/

/* (高速化①)親のPKEY情報は使用せず、子のPARENT_COST_STATEMENT_NOで直接UPDATE (ここから)
            BEGIN  /*[品目別原価]親のPKEY情報を検索
                SELECT PARENT_ITEM_CD,PS_EDITION,CS_PROC_CD,COST_STATEMENT_NO
                 INTO  vc2ParentItemCd,numPsEdition,vc2CsProcCd,numCostStatementNo
                  FROM T_ITEM_COST
                  WHERE   YEAR             = recMAIN.YEAR
                    AND   HALF_TERM_TYP    = recMAIN.HALF_TERM_TYP
                    AND   COST_TYP         = recMAIN.COST_TYP
                    AND   PLANT_CD         = recMAIN.PLANT_CD
                    AND   ROOT_ITEM_CD     = recMAIN.ROOT_ITEM_CD
                    AND   ITEM_CD          = recMAIN.PARENT_ITEM_CD
                    AND   COST_STATEMENT_NO= recMAIN.PARENT_COST_STATEMENT_NO
                    AND   ROWNUM= 1
                ;
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment := SUBSTR('15:SELECT T_ITEM_COST'  ||
                                         ' ROOT_ITEM_CD：' || '[ ' || recMAIN.ROOT_ITEM_CD   || ' ]' ||
                                         ' ITEM_CD：'      || '[ ' || recMAIN.PARENT_ITEM_CD || ' ]' ||
                                         ' COST_STATEMENT_NO='|| '[ ' || recMAIN.PARENT_COST_STATEMENT_NO || ' ]' ||
                                         ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                         ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                   vc2ParentItemCd    := NULL;
                    numPsEdition       := 0;
                    numCostStatementNo := 0;
--                  RAISE  excERR_CURSOR;
            END;  /*[品目別原価]親のPKEY情報を検索

            IF  vc2ParentItemCd IS NOT NULL THEN  /* 親のPKEY情報があるとき 

　(高速化①)親のPKEY情報は使用せず、子のPARENT_COST_STATEMENT_NOで直接UPDATE (ここから) */

            IF  recMAIN.PARENT_COST_STATEMENT_NO <> 0 THEN  /* 子のPARENT_COST_STATEMENT_NOがあるとき */

            BEGIN  /*[品目別原価]親を更新(UNDER費)*/
                UPDATE  T_ITEM_COST  SET
                    UNDER_MATR_COST         = UNDER_MATR_COST         + numToatlMatrCost
                   ,UNDER_SBCNT_MATR_COST   = UNDER_SBCNT_MATR_COST   + numToatlSbcntMatrCost
                   ,UNDER_PROC_COST_SUM_ALL = UNDER_PROC_COST_SUM_ALL + numToatlProcCostSum
                WHERE   YEAR             = recMAIN.YEAR
                  AND   HALF_TERM_TYP    = recMAIN.HALF_TERM_TYP
                  AND   COST_TYP         = recMAIN.COST_TYP
                  AND   PLANT_CD         = recMAIN.PLANT_CD
                  AND   ROOT_ITEM_CD     = recMAIN.ROOT_ITEM_CD
--(高速化①)      AND   PARENT_ITEM_CD   = vc2ParentItemCd     /* 親のPKEY情報 */
--(高速化①)      AND   ITEM_CD          = recMAIN.PARENT_ITEM_CD
--(高速化①)      AND   PS_EDITION       = numPsEdition        /* 親のPKEY情報 */
--(高速化①)      AND   COST_STATEMENT_NO= numCostStatementNo  /* 親のPKEY情報 */
                  AND   COST_STATEMENT_NO= recMAIN.PARENT_COST_STATEMENT_NO  /* 子のPARENT_COST_STATEMENT_NO */
                ;
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment := SUBSTR('(SBM0545)16:UPDATE T_ITEM_COST(UNDER費)'  ||
                                         ' ROOT_ITEM_CD：'   || '[ ' || recMAIN.ROOT_ITEM_CD   || ' ]' ||
                                         ' PARENT_ITEM_CD：' || '[ ' || vc2ParentItemCd        || ' ]' ||
                                         ' ITEM_CD：'        || '[ ' || recMAIN.PARENT_ITEM_CD || ' ]' ||
                                         ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                         ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE  excERR_CURSOR;
            END;  /*[品目別原価]親を更新(UNDER費)*/

            numCntUp2  :=  numCntUp1 +2;  /*  積上件数(T_ITEM_COST) */

            END IF;  /* 親のPKEY情報があるとき */

        END IF;  /*[先頭品]でない時、[品目別原価]積上*/

    END LOOP;  /*  品目別原価の繰り返し (MAIN LOOP)*/

    COMMIT;

    CLOSE curMAIN;  /* カーソルCLOSE(品目別原価) */

    /*該当レベルで０件の場合、繰り返しを抜ける。*/
    IF  numCountLoop = 0 THEN
        EXIT;
    END IF;

    END LOOP;  /* 階層レベルごとのループ */

/* 処理の終了 */

    /* 終了メッセージの出力 */
    vc2Comment := SUBSTR('(SBM0533)入力件数(品目別原価)：'   || '[ ' || numCntMain || ' ]' ||
                         '積上件数(品目別加工費)：' || '[ ' || numCntUp1 || ' ]' ||
                         '積上件数(品目別原価)：'   || '[ ' || numCntUp2 || ' ]',1,256);
    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                        pvc2UserId, pvc2BusinessName,
                        pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_END,
                        vc2Comment);

    COMMIT;

    /* トレースログの出力(終了) */
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId,pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, METHOD_END);

    COMMIT;

    /* LogFile の CLOSE */
    blnRet := FNCLOGCLOSE(UTL_FileHandle);

    pnumReturn := STATUS_NORMAL; /* 正常終了 */

--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN excERR_SKIP THEN    /* 実行不可 */

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

    WHEN excERR_CURSOR THEN    /* カーソルOPEN中のＤＢエラー */

        IF curMAIN%ISOPEN = TRUE THEN
            CLOSE curMAIN;
        END IF;
        IF curITEM_PROC_COST%ISOPEN = TRUE THEN
            CLOSE curITEM_PROC_COST;
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

    WHEN OTHERS  THEN   /* その他のエラー */

        IF curMAIN%ISOPEN = TRUE THEN
            CLOSE curMAIN;
        END IF;
        IF curITEM_PROC_COST%ISOPEN = TRUE THEN
            CLOSE curITEM_PROC_COST;
        END IF;

        ROLLBACK;

        /* 終了メッセージの出力 */
        vc2Comment  := SUBSTR('(SBM0328) ＊＊その他のエラーが発生しました＊＊'  ||
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
