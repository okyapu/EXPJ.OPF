CREATE OR REPLACE procedure      SQLSTDMATRPROCCHECK(
/*------------------------------------------------------------------------------
'
'$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/DBProj/Procedure/SqlStdMatrProcCheck.sql,v $
'$Author: shan-xiuqin $
'$Revision: 1.8 $ $Date: 2017/01/09 08:30:13 $
'                        2005.10.24 unicode対応（varchar2を4倍）
'
'
' 機能      : 標準材料費・加工費マスタチェック処理(CHECKのみ)
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
'             pnumYear             - (i)対象年度
'             pnumHalfTermTyp      - (i)半期区分
'             pnumCostTyp          - (i)原価種別
'             pnumActTyp           - (i)実行区分（1:通常実行、2:再実行）
'             pnumReturn           - (o)処理結果 (1:正常終了、2:警告終了、3:異常終了)
'
'
' 機能説明  : 標準原価計算用の[構成品ワーク]、[購入品マスタ]、[加工費マスタ]、[品目別加工費マスタ]を元に
'             [品目別原価]の材料費と加工費のCHECKを行う。
'
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
   ,pnumYear             IN  NUMBER          --対象年度
   ,pnumHalfTermTyp      IN  NUMBER          --半期区分
   ,pnumCostTyp          IN  NUMBER          --原価種別
   ,pnumActTyp           IN  NUMBER          --実行区分
   ,pnumReturn           OUT NUMBER          --処理結果
)
IS

    /* 定数の宣言 */

    METHOD_START            VARCHAR2(20) := 'START';    --ログ用メソッド開始宣言
    METHOD_END              VARCHAR2(12) := 'End';      --ログ用メソッド終了宣言
    MY_SQL_NAME             VARCHAR2(120) := 'SQLSTDMATRPROCCHECK'; --ＰＬ／ＳＱＬ名

    APS_COM_BATCH_START     VARCHAR2(28) := 'DC02201';
    APS_COM_BATCH_END       VARCHAR2(28) := 'DC02202';
    APS_COM_BATCH_EXP       VARCHAR2(28) := 'DC02203';
    APS_COM_BATCH_EXP2      VARCHAR2(28) := 'DC00209';

    LOGMSG_START_PGNM       VARCHAR2(200) := '(SBM0549)標準材料費・加工費チェック処理を開始しました。';
    LOGMSG_END_PGNM         VARCHAR2(200) := '標準材料費・加工費チェック処理を終了しました。';
    LOGMSG_EXP_PGNM         VARCHAR2(200) := '標準材料費・加工費チェック処理が異常終了しました。';
    LOGMSG_EXP_PGNM2        VARCHAR2(200) := '製品構成有効終了日が業務運用日を過ぎています。';

    STATUS_NORMAL           NUMBER       := 1;  -- 正常終了
    STATUS_WARNING          NUMBER       := 2;  -- 警告終了
    STATUS_ERROR            NUMBER       := 3;  -- 異常終了

    OUTSIDE_PROC_CD         VARCHAR2(4)  := NULL;

    /* 変数の定義 */
    UTL_FileHandle          UTL_FILE.FILE_TYPE;    --ファイルハンドル

    numCntUpper             NUMBER(11)   := 0;     /* 対象データ件数(先頭品) */
    numCntLower             NUMBER(11)   := 0;     /* 対象データ件数(下位展開) */
    numCntItemProcCost      NUMBER(11)   := 0;     --正常データ件数(品目別加工費)
    numCountError           NUMBER(11)   := 0;     --原価計算エラー件数
    numCountDummy           NUMBER(11)   := 0;     --件数チェック用
    blnRet                  BOOLEAN;               --共通関数の戻値
    vc2Comment              VARCHAR2(1024);         --メッセージ作成用

    vc2PhaseStartMonth      VARCHAR2(24);           --指定半期の期首月
    vc2PhaseEndMonth        VARCHAR2(24);           --指定半期の期末月

    vc2YYYYMMDD1            VARCHAR2(32);
    vc2YYYYMMDD2            VARCHAR2(32);

    vc2CsCalcErrorCd        T_CS_CALC_ERROR.CS_CALC_ERROR_CD%TYPE;  --原価計算エラー番号
    datBusinessOprDate      SYS_DATE_CTRL.BUSINESS_OPR_DATE%TYPE;    --業務運用日
    vc2MsgCD                SYS_BUSINESS_MESSAGE.MSG_CD%TYPE; --メッセージコード

    blnFoundCsPuch          BOOLEAN;  --データ有無判定(M_CS_PUCH)
    blnLowerSkip            BOOLEAN;  --下位展開しない

    /* 原価管理パラメータからの取得項目 */
    numStartMonth           SYS_COST_CTRL.START_MONTH%TYPE;       --年度開始月

    /* 購入品マスタからの取得項目 */
    numUnitCostAcceptTyp    M_CS_PUCH.UNIT_COST_ACCEPT_TYP%TYPE;  --単価採用区分
    numUnitCost             M_CS_PUCH.UNIT_COST%TYPE;             --購入単価
    numUnitQty              M_CS_PUCH.PUCH_UNIT_QTY%TYPE;              --購入品単位数
    numExchRate             M_CS_PUCH.EXCH_RATE%TYPE;             --取引為替レート
    numSubUnitCost          M_CS_PUCH.SUB_UNIT_COST%TYPE;         --第二購入単価
    numSubUnitQty           M_CS_PUCH.SUB_PUCH_UNIT_QTY%TYPE;          --第二購入品単位数
    numSubExchRate          M_CS_PUCH.SUB_EXCH_RATE%TYPE;         --第二取引為替レート
    vc2ClasificationCd      M_CS_PUCH.CLASIFICATION_CD%TYPE;      --品目管理コード
    numOnerousConsFlg       M_CS_PUCH.ONEROUS_CONS_FLG%TYPE;      --有償支給品フラグ

    /* 例外処理用変数 */
    excERR_SKIP           EXCEPTION;      --実行不可
    excERR_CURSOR         EXCEPTION;      --カーソルOPEN中のEXCEPTION

    /* カーソルの宣言 先頭品*/
    CURSOR curUPPER
    IS
    SELECT T.*
          ,M1.STOCK_UNIT AS PARENT_ITEM_STOCK_UNIT
          ,M2.STOCK_UNIT AS STOCK_UNIT
      FROM T_CS_PS_T T
          ,M_ITEM M1,M_ITEM M2
      WHERE   PLANT_CD         = pvc2PlantCd
        AND   T.UPPER_ITEM_FLG = 1
        AND   T.PARENT_ITEM_CD = M1.ITEM_CD(+)
        AND   T.COMP_ITEM_CD   = M2.ITEM_CD(+)
--      AND   T.COMP_ITEM_CD   = 'P0-E5800-M180RA'  --DEGUG用 UMINO 
    ;
    recUPPER curUPPER%ROWTYPE;

    /* カーソルの宣言 下位展開(1先頭品の下位品目全件を階層レベルの降順に展開)*/
    CURSOR curLOWER(
         cvc2StartItem VARCHAR2
    )
    IS
    SELECT T.*
          ,M1.STOCK_UNIT AS PARENT_ITEM_STOCK_UNIT
          ,M2.STOCK_UNIT AS STOCK_UNIT
    FROM 
      (SELECT IN1.*
       FROM  (SELECT * FROM T_CS_PS_T WHERE PLANT_CD=pvc2PlantCd) IN1
       START WITH IN1.PARENT_ITEM_CD = cvc2StartItem
       CONNECT BY PRIOR  IN1.COMP_ITEM_CD  = IN1.PARENT_ITEM_CD
      ) T
     ,M_ITEM M1,M_ITEM M2
    WHERE   T.PARENT_ITEM_CD = M1.ITEM_CD(+)
      AND   T.COMP_ITEM_CD = M2.ITEM_CD(+)
    ORDER BY T.UP_LEVEL_NO DESC
    ;
    recLOWER curLOWER%ROWTYPE;

    /* カーソルの宣言  品目別加工費マスタ*/
    CURSOR curPROC_COST(
         cvc2CompItemCd VARCHAR2
    )
    IS
    SELECT T1.ITEM_CD,T1.PROC_COST_CLS_CD,T1.CS_PROC_CD,T1.CLASIFICATION_CD,T1.ONEROUS_CONS_FLG
          ,T2.PROC_COST_UNIT_QTY,T2.STOCK_UNIT
          ,T2.PROC_COST_01,T2.PROC_COST_02,T2.PROC_COST_03,T2.PROC_COST_04,T2.PROC_COST_05,T2.PROC_COST_06
          ,T2.PROC_COST_07,T2.PROC_COST_08,T2.PROC_COST_09,T2.PROC_COST_10,T2.PROC_COST_11,T2.PROC_COST_12
          ,T2.PROC_COST_SUM
          ,T2.DEL_FLG,T2.PLANT_CD
          ,M.OUTSIDE_TYP
    FROM   M_ITEM_PROC_COST T1
          ,M_PROC_COST      T2
          ,M_CS_PROC        M
    WHERE   T1.PLANT_CD = pvc2PlantCd
      AND   T1.ITEM_CD  = cvc2CompItemCd
      AND   pnumYear             = T2.YEAR(+)
      AND   pnumHalfTermTyp      = T2.HALF_TERM_TYP(+)
      AND   pnumCostTyp          = T2.COST_TYP(+)
      AND   T1.PLANT_CD          = T2.PLANT_CD(+)
      AND   T1.CS_PROC_CD        = T2.CS_PROC_CD(+)
      AND   T1.PROC_COST_CLS_CD  = T2.PROC_COST_CLS_CD(+)
      AND   T1.PLANT_CD   = M.PLANT_CD
      AND   T1.CS_PROC_CD = M.CS_PROC_CD
      AND   0             = M.DEL_FLG
    ;
    recPROC_COST curPROC_COST%ROWTYPE;

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
    numCntUpper         := 0;     /* 対象データ件数(先頭品)       */
    numCntLower         := 0;     /* 対象データ件数(下位展開)     */
    numCntItemProcCost  := 0;     /* 正常データ件数(品目別加工費) */
    numCountError       := 0;     /* 原価計算エラー件数   */

    /*  原価管理パラメータの読込 */ 
    BEGIN
        SELECT  START_MONTH  
          INTO  numStartMonth
          FROM  SYS_COST_CTRL
          WHERE  PLANT_CD  =  pvc2PlantCd;
    EXCEPTION
        WHEN OTHERS THEN
            vc2Comment := SUBSTR('(SBM0535)1:原価管理パラメータが存在しません。'  ||
                                 ' USER_CD='  || '[ ' || pvc2UserId  || ' ]' ||
                                 ' PLANT_CD=' || '[ ' || pvc2PlantCd || ' ]',1,256);
            vc2MsgCD   := 'DC02203';
            RAISE  excERR_SKIP;
    END;

    BEGIN  /* 業務運用日の読込 */ 
        SELECT BUSINESS_OPR_DATE INTO datBusinessOprDate
           FROM SYS_DATE_CTRL
           WHERE PLANT_CD  =  pvc2PlantCd
        ;
    EXCEPTION
        WHEN OTHERS THEN
            vc2Comment := SUBSTR('(SBM0552)1:業務運用日の取得に失敗しました。'  ||
                                 ' USER_CD='  || '[ ' || pvc2UserId  || ' ]' ||
                                 ' PLANT_CD=' || '[ ' || pvc2PlantCd || ' ]',1,256);
            vc2MsgCD   := 'DC00008';
            RAISE  excERR_SKIP;
    END;  /* 業務運用日の読込 */ 

    /*  パラメータのチェック (対象年度)*/
    IF  pnumYear  IS  NULL  THEN
        vc2Comment := SUBSTR('(SBM0536)2:パラメータ不正。'  ||
                             ' 対象年度=' || '[ ' || pnumYear || ' ]',1,256);
        vc2MsgCD   := 'DC02203';
        RAISE  excERR_SKIP;  
    END IF;
    /*  パラメータのチェック (半期区分)*/
    IF  pnumHalfTermTyp  NOT IN (1,2)  THEN
        vc2Comment := SUBSTR('(SBM0218)3:パラメータ不正。'  ||
                             ' 半期区分=' || '[ ' || pnumHalfTermTyp || ' ]',1,256);
        vc2MsgCD   := 'DC02203';
        RAISE  excERR_SKIP;  
    END IF;

    /*  対象年度/半期区分/年度開始月より、指定半期の期首月/期末月を取得 */
    vc2PhaseStartMonth :=  TO_CHAR(pnumYear + FLOOR((numStartMonth  -1+((pnumHalfTermTyp-1)*6))/12) ||
                                   LPAD(MOD((numStartMonth  -1+((pnumHalfTermTyp-1)*6)),12)+1 ,2,'0')
                                  ); 
    vc2PhaseEndMonth   :=  TO_CHAR(pnumYear + FLOOR((numStartMonth+5-1+((pnumHalfTermTyp-1)*6))/12) ||
                                   LPAD(MOD((numStartMonth+5-1+((pnumHalfTermTyp-1)*6)),12)+1 ,2,'0')
                                  ); 

    BEGIN  /* カーソルOPEN(先頭品) */
        OPEN  curUPPER;
    EXCEPTION
        WHEN OTHERS THEN
            vc2Comment := SUBSTR('4:OPEN curUPPER'  ||
                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
            RAISE  excERR_CURSOR;
    END;  /* カーソルOPEN(先頭品) */

    LOOP  /*  先頭品の繰り返し */

        BEGIN  /* カーソルFETCH(先頭品) */
            FETCH  curUPPER  INTO  recUPPER;
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment := SUBSTR('5:FETCH curUPPER'  ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE  excERR_CURSOR;
        END;  /* カーソルFETCH(先頭品) */

        EXIT WHEN  curUPPER%NOTFOUND;

        blnLowerSkip := FALSE;             /* 下位展開しない */
        numCntUpper  := numCntUpper+1;     /* 対象データ件数(先頭品) */

        IF  recUPPER.OUTSIDE_TYP  =  1  THEN  /* 内作の処理 */

            /* 品目別加工費マスタの存在有無判定 */
            SELECT  COUNT(*)  INTO  numCountDummy  FROM M_ITEM_PROC_COST
              WHERE  PLANT_CD  = pvc2PlantCd
                AND  ITEM_CD   = recUPPER.COMP_ITEM_CD
                AND  ROWNUM    = 1 
            ;

            IF  numCountDummy  >  0  THEN  /* 品目別加工費マスタの存在有り */

                BEGIN  /* カーソルOPEN(品目別加工費マスタ) */
                    OPEN  curPROC_COST(recUPPER.COMP_ITEM_CD);
                EXCEPTION
                    WHEN OTHERS THEN
                        vc2Comment := SUBSTR('6:OPEN curPROC_COST'  ||
                                             ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                             ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                        RAISE  excERR_CURSOR;
                END;  /* カーソルOPEN(品目別加工費マスタ) */

                LOOP  /* 品目別加工費マスタの繰り返し */

                    BEGIN  /* カーソルFETCH(品目別加工費マスタ) */
                        FETCH  curPROC_COST  INTO  recPROC_COST;
                    EXCEPTION
                        WHEN OTHERS THEN
                            vc2Comment  := SUBSTR('7:FETCH curPROC_COST'  ||
                                                  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                            RAISE  excERR_CURSOR;
                    END;  /* カーソルFETCH(品目別加工費マスタ) */

                    EXIT WHEN  curPROC_COST%NOTFOUND;

                    IF  recPROC_COST.PLANT_CD IS NOT NULL  THEN  /* 加工費マスタが存在する時（工程内作）*/

                        numCntItemProcCost := numCntItemProcCost+1; --正常データ件数(品目別加工費)

                    ELSE

                        /* 以下のエラーはSQLSTDMATRPROCCOSTではチェックしないエラー */
                        /* 原価計算エラー番号の取得 */
                        blnRet  :=  FNCGETSEQCSCALCERRORCD(pvc2PlantCd,vc2CsCalcErrorCd);
                        IF  blnRet  =  FALSE  THEN
                             vc2Comment := SUBSTR('12:FNCGETSEQCSCALCERRORCD'  ||
                                                     ' PLANT_CD=' || '[ ' || pvc2PlantCd || ' ]',1,256);
                                RAISE  excERR_CURSOR;
                        END IF;

                        BEGIN  /* 原価計算エラー書き込み(内作で加工費マスタなし) */
                            INSERT  INTO  T_CS_CALC_ERROR (
                                          CS_CALC_ERROR_CD,CS_CALC_PROC_NO,YEAR,HALF_TERM_TYP,COST_TYP,PLANT_CD
                                         ,ROOT_ITEM_CD,PARENT_ITEM_CD,ITEM_CD,PS_EDITION,CS_PROC_CD
                                         ,PROC_COST_CLS_CD,MESSAGE_CD,REMARKS,LIST_ISS_FLG
                                         ,CREATED_DATE,CREATED_BY,CREATED_PRG_NM
                                         ,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM
                                         ,MODIFY_COUNT
                             ) VALUES (
                                          vc2CsCalcErrorCd
                                         ,6,pnumYear,pnumHalfTermTyp,pnumCostTyp,pvc2PlantCd
                                         ,recUPPER.COMP_ITEM_CD
                                         ,recUPPER.PARENT_ITEM_CD
                                         ,recUPPER.COMP_ITEM_CD
                                         ,recUPPER.PS_EDITION
                                         ,recPROC_COST.CS_PROC_CD,NULL
                                         ,'DC00205','内作で加工費マスタなし',0
                                         ,SYSDATE,pvc2UserId,MY_SQL_NAME
                                         ,SYSDATE,pvc2UserId,MY_SQL_NAME
                                         ,0
                            );
                            numCountError := numCountError + 1;  --原価計算エラー件数

                        EXCEPTION
                            WHEN OTHERS THEN
                                vc2Comment := SUBSTR('13:INSERT T_CS_CALC_ERROR'  ||
                                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                                RAISE  excERR_CURSOR;
                        END;  /* 原価計算エラー書き込み(工程外注で購入品マスタなし) */

                    END IF;  /* 加工費マスタが存在する時（工程内作）*/

                END LOOP;  /* 品目別加工費マスタの繰り返し */

                IF  recPROC_COST.OUTSIDE_TYP = 2 THEN  /* 工程外注の時は、品目別原価を更新する。*/

                    BEGIN  /* 購入品マスタ読み込み */
                        SELECT  UNIT_COST  ,PUCH_UNIT_QTY  ,EXCH_RATE
                        INTO    numUnitCost,numUnitQty,numExchRate
                        FROM  M_CS_PUCH
                        WHERE YEAR          =  pnumYear
                        AND   HALF_TERM_TYP =  pnumHalfTermTyp
                        AND   COST_TYP      =  pnumCostTyp
                        AND   PLANT_CD      =  pvc2PlantCd
                        AND   ITEM_CD       =  recUPPER.COMP_ITEM_CD
--                      AND   CS_PROC_CD    =  recPROC_COST.CS_PROC_CD
                        AND   DEL_FLG       =  0
                        ;
                        blnFoundCsPuch  :=  TRUE;
                    EXCEPTION
                        WHEN OTHERS THEN
                            blnFoundCsPuch  :=  FALSE;
                    END;  /* 購入品マスタ読み込み */

                    IF  blnFoundCsPuch  =  TRUE  THEN  /* 購入品マスタが存在した場合 */

                        NULL;

                    ELSE  /* 購入品マスタが存在した場合 */

                        IF  recUPPER.VOLUNT_SPL_FLG   = 1  OR  /* 無償受給品フラグ */
                            recUPPER.COST_UP_TYP      = 0  OR  /* 原価積上区分 */
                            recPROC_COST.ONEROUS_CONS_FLG = 1  OR  /* 有償支給品フラグ */
                            vc2PhaseStartMonth > TO_CHAR(recUPPER.EFF_PHASE_OUT_DATE,'YYYYMM') OR
                            vc2PhaseEndMonth   < TO_CHAR(recUPPER.EFF_PHASE_IN_DATE,'YYYYMM') THEN  /* [原価計算除外]判定 */

                            NULL;

                        ELSE  /* [原価計算除外]判定 */
                            /* 原価計算エラー番号の取得 */
                            blnRet  :=  FNCGETSEQCSCALCERRORCD(pvc2PlantCd,vc2CsCalcErrorCd);
                            IF  blnRet  =  FALSE  THEN
                                vc2Comment := SUBSTR('12:FNCGETSEQCSCALCERRORCD'  ||
                                                     ' PLANT_CD=' || '[ ' || pvc2PlantCd || ' ]',1,256);
                                RAISE  excERR_CURSOR;
                            END IF;

                            BEGIN  /* 原価計算エラー書き込み(工程外注で購入品マスタなし) */
                                INSERT  INTO  T_CS_CALC_ERROR (
                                          CS_CALC_ERROR_CD,CS_CALC_PROC_NO,YEAR,HALF_TERM_TYP,COST_TYP,PLANT_CD
                                         ,ROOT_ITEM_CD,PARENT_ITEM_CD,ITEM_CD,PS_EDITION,CS_PROC_CD
                                         ,PROC_COST_CLS_CD,MESSAGE_CD,REMARKS,LIST_ISS_FLG
                                         ,CREATED_DATE,CREATED_BY,CREATED_PRG_NM
                                         ,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM
                                         ,MODIFY_COUNT
                                 ) VALUES (
                                          vc2CsCalcErrorCd
                                         ,6,pnumYear,pnumHalfTermTyp,pnumCostTyp,pvc2PlantCd
                                         ,recUPPER.COMP_ITEM_CD
                                         ,recUPPER.PARENT_ITEM_CD
                                         ,recUPPER.COMP_ITEM_CD
                                         ,recUPPER.PS_EDITION
                                         ,recPROC_COST.CS_PROC_CD,NULL
                                         ,'DC00207','工程外注で購入品マスタなし',0
                                         --,'DC00207','購入品マスタなし',0
                                         ,SYSDATE,pvc2UserId,MY_SQL_NAME
                                         ,SYSDATE,pvc2UserId,MY_SQL_NAME
                                         ,0
                                );
                                numCountError := numCountError + 1;  --原価計算エラー件数

                            EXCEPTION
                                WHEN OTHERS THEN
                                    vc2Comment := SUBSTR('13:INSERT T_CS_CALC_ERROR'  ||
                                                         ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                         ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                                    RAISE  excERR_CURSOR;
                            END;  /* 原価計算エラー書き込み(工程外注で購入品マスタなし) */

                        END IF;  /* [原価計算除外]判定 */

                    END IF;  /* 購入品マスタが存在した場合 */

                END IF;  /* 工程外注の時は、品目別原価を更新する。*/

                CLOSE curPROC_COST;

            ELSE  /* 品目別加工費マスタの存在有り */

                blnLowerSkip := TRUE;             /* 下位展開しない */

                IF  recUPPER.VOLUNT_SPL_FLG   = 1  OR  /* 無償受給品フラグ */
                    recUPPER.COST_UP_TYP      = 0  OR  /* 原価積上区分 */
                    recPROC_COST.ONEROUS_CONS_FLG = 1  OR  /* 有償支給品フラグ */
                    vc2PhaseStartMonth > TO_CHAR(recUPPER.EFF_PHASE_OUT_DATE,'YYYYMM') OR
                    vc2PhaseEndMonth   < TO_CHAR(recUPPER.EFF_PHASE_IN_DATE,'YYYYMM') THEN  /* [原価計算除外]判定 */

                    NULL;

                ELSE  /* [原価計算除外]判定 */

                    /* 原価計算エラー番号の取得 */
                    blnRet  :=  FNCGETSEQCSCALCERRORCD(pvc2PlantCd,vc2CsCalcErrorCd);
                    IF  blnRet  =  FALSE  THEN
                        vc2Comment := SUBSTR('14:FNCGETSEQCSCALCERRORCD'  ||
                                             ' PLANT_CD=' || '[ ' || pvc2PlantCd || ' ]',1,256);
                        RAISE  excERR_CURSOR;
                    END IF;

                    BEGIN  /* 原価計算エラー書き込み(内作で品目別加工費マスタなし) */
                        INSERT  INTO  T_CS_CALC_ERROR (
                                  CS_CALC_ERROR_CD,CS_CALC_PROC_NO,YEAR,HALF_TERM_TYP,COST_TYP,PLANT_CD
                                 ,ROOT_ITEM_CD,PARENT_ITEM_CD,ITEM_CD,PS_EDITION,CS_PROC_CD
                                 ,PROC_COST_CLS_CD,MESSAGE_CD,REMARKS,LIST_ISS_FLG
                                 ,CREATED_DATE,CREATED_BY,CREATED_PRG_NM
                                 ,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM
                                 ,MODIFY_COUNT
                         )  VALUES (
                                  vc2CsCalcErrorCd
                                 ,6,pnumYear,pnumHalfTermTyp,pnumCostTyp,pvc2PlantCd
                                 ,recUPPER.COMP_ITEM_CD
                                 ,recUPPER.PARENT_ITEM_CD
                                 ,recUPPER.COMP_ITEM_CD
                                 ,recUPPER.PS_EDITION
                                 ,NULL,NULL
                                 ,'DC00206','内作で品目別加工費マスタなし',0
                                 ,SYSDATE,pvc2UserId,MY_SQL_NAME
                                 ,SYSDATE,pvc2UserId,MY_SQL_NAME
                                 ,0
                        );
                        numCountError := numCountError + 1;  --原価計算エラー件数

                    EXCEPTION
                        WHEN OTHERS THEN
                            vc2Comment := SUBSTR('15:INSERT T_CS_CALC_ERROR'  ||
                                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                            RAISE  excERR_CURSOR;
                    END;  /* 原価計算エラー書き込み(内作で品目別加工費マスタなし) */

                END IF;  /* [原価計算除外]判定 */

            END IF; /* 品目別加工費マスタの存在有り */

        ELSE  /* 内作の処理 */

            BEGIN  /* 購入品マスタ読み込み */
                SELECT  
                    UNIT_COST_ACCEPT_TYP,UNIT_COST,PUCH_UNIT_QTY,EXCH_RATE
                   ,SUB_UNIT_COST,SUB_PUCH_UNIT_QTY,SUB_EXCH_RATE
                   ,CLASIFICATION_CD,ONEROUS_CONS_FLG
                INTO
                    numUnitCostAcceptTyp,numUnitCost,numUnitQty,numExchRate
                   ,numSubUnitCost,numSubUnitQty,numSubExchRate
                   ,vc2ClasificationCd,numOnerousConsFlg
                FROM
                   M_CS_PUCH
                WHERE
                      YEAR          =  pnumYear
                AND   HALF_TERM_TYP =  pnumHalfTermTyp
                AND   COST_TYP      =  pnumCostTyp
                AND   PLANT_CD      =  pvc2PlantCd
                AND   ITEM_CD       =  recUPPER.COMP_ITEM_CD
--              AND   CS_PROC_CD    =  OUTSIDE_PROC_CD
                AND   DEL_FLG       =  0
                ;
                blnFoundCsPuch  :=  TRUE;
            EXCEPTION
                WHEN OTHERS THEN
                    blnFoundCsPuch  :=  FALSE;
            END;  /* 購入品マスタ読み込み */

            IF  blnFoundCsPuch  =  TRUE  THEN  /* 購入品マスタが存在した場合 */

                NULL;

            ELSE  /* 購入品マスタが存在した場合 */

                blnLowerSkip := TRUE;             /* 下位展開しない */

                IF  recUPPER.VOLUNT_SPL_FLG   = 1  OR  /* 無償受給品フラグ */
                    recUPPER.COST_UP_TYP      = 0  OR  /* 原価積上区分 */
                    recPROC_COST.ONEROUS_CONS_FLG = 1  OR  /* 有償支給品フラグ */
                    vc2PhaseStartMonth > TO_CHAR(recUPPER.EFF_PHASE_OUT_DATE,'YYYYMM') OR
                    vc2PhaseEndMonth   < TO_CHAR(recUPPER.EFF_PHASE_IN_DATE,'YYYYMM') THEN  /* [原価計算除外]判定 */

                    NULL;

                ELSE  /* [原価計算除外]判定 */

                    /* 原価計算エラー番号の取得 */
                    blnRet  :=  FNCGETSEQCSCALCERRORCD(pvc2PlantCd,vc2CsCalcErrorCd);
                    IF  blnRet  =  FALSE  THEN
                        vc2Comment := SUBSTR('17:FNCGETSEQCSCALCERRORCD'  ||
                                             ' PLANT_CD=' || '[ ' || pvc2PlantCd || ' ]',1,256);
                        RAISE  excERR_CURSOR;
                    END IF;

                    BEGIN  /* 原価計算エラー書き込み(外作で購入品マスタなし) */
                        INSERT  INTO  T_CS_CALC_ERROR (
                                  CS_CALC_ERROR_CD,CS_CALC_PROC_NO,YEAR,HALF_TERM_TYP,COST_TYP,PLANT_CD
                                 ,ROOT_ITEM_CD,PARENT_ITEM_CD,ITEM_CD,PS_EDITION,CS_PROC_CD
                                 ,PROC_COST_CLS_CD,MESSAGE_CD,REMARKS,LIST_ISS_FLG
                                 ,CREATED_DATE,CREATED_BY,CREATED_PRG_NM
                                 ,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM
                                 ,MODIFY_COUNT
                         )  VALUES (
                                  vc2CsCalcErrorCd
                                 ,6,pnumYear,pnumHalfTermTyp,pnumCostTyp,pvc2PlantCd
                                 ,recUPPER.COMP_ITEM_CD
                                 ,recUPPER.PARENT_ITEM_CD
                                 ,recUPPER.COMP_ITEM_CD
                                 ,recUPPER.PS_EDITION
                                 ,OUTSIDE_PROC_CD,NULL
                                 ,'DC00208','外作で購入品マスタなし',0
                                 ,SYSDATE,pvc2UserId,MY_SQL_NAME
                                 ,SYSDATE,pvc2UserId,MY_SQL_NAME
                                 ,0
                        );
                        numCountError := numCountError + 1;  --原価計算エラー件数

                    EXCEPTION
                        WHEN OTHERS THEN
                            vc2Comment := SUBSTR('18:INSERT T_CS_CALC_ERROR'  ||
                                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                            RAISE  excERR_CURSOR;
                    END;  /* 原価計算エラー書き込み(外作で購入品マスタなし) */

                END IF;  /* [原価計算除外]判定 */

            END IF;  /* 購入品マスタが存在した場合 */

        END IF;  /* 内作の処理 */

        IF  blnLowerSkip = FALSE  THEN  /* 下位展開しない */

        BEGIN  /* カーソルOPEN(下位展開) */
            OPEN  curLOWER(recUPPER.COMP_ITEM_CD);
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment := SUBSTR('19:OPEN curLOWER'  ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE  excERR_CURSOR;
        END;  /* カーソルOPEN(下位展開) */

        LOOP  /* 下位展開の繰り返し */
            BEGIN  /* カーソルFETCH(下位展開) */
                FETCH  curLOWER  INTO  recLOWER;
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment := SUBSTR('20:FETCH curLOWER'  ||
                                         ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                         ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE  excERR_CURSOR;
            END;  /* カーソルFETCH(下位展開) */

            EXIT WHEN  curLOWER%NOTFOUND;

            numCntLower  :=  numCntLower+1; /* 対象データ件数(下位展開) */

            /* 製品構成有効終了日チェック(ワーニング：エラーでも処理続行) */

            IF  TO_CHAR(recLOWER.EFF_PHASE_OUT_DATE,'YYYYMMDD') < TO_CHAR(datBusinessOprDate,'YYYYMMDD') THEN

                /* 原価計算エラー番号の取得 */
                blnRet  :=  FNCGETSEQCSCALCERRORCD(pvc2PlantCd,vc2CsCalcErrorCd);
                IF  blnRet  =  FALSE  THEN
                    vc2Comment := SUBSTR('12-2:FNCGETSEQCSCALCERRORCD'  ||
                                         ' PLANT_CD=' || '[ ' || pvc2PlantCd || ' ]',1,256);
                    RAISE  excERR_CURSOR;
                END IF;

                BEGIN  /* 原価計算エラー書き込み(内作で加工費マスタなし) */
                    INSERT  INTO  T_CS_CALC_ERROR (
                                          CS_CALC_ERROR_CD,CS_CALC_PROC_NO,YEAR,HALF_TERM_TYP,COST_TYP,PLANT_CD
                                         ,ROOT_ITEM_CD,PARENT_ITEM_CD,ITEM_CD,PS_EDITION,CS_PROC_CD
                                         ,PROC_COST_CLS_CD,MESSAGE_CD,REMARKS,LIST_ISS_FLG
                                         ,CREATED_DATE,CREATED_BY,CREATED_PRG_NM
                                         ,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM
                                         ,MODIFY_COUNT
                    ) VALUES (
                                          vc2CsCalcErrorCd
                                         ,6,pnumYear,pnumHalfTermTyp,pnumCostTyp,pvc2PlantCd
                                         ,recUPPER.COMP_ITEM_CD
                                         ,recLOWER.PARENT_ITEM_CD
                                         ,recLOWER.COMP_ITEM_CD
                                         ,recLOWER.PS_EDITION
                                         ,NULL,NULL
                                         ,'DC00209',NULL,0
                                         ,SYSDATE,pvc2UserId,MY_SQL_NAME
                                         ,SYSDATE,pvc2UserId,MY_SQL_NAME
                                         ,0
                    );
                    numCountError := numCountError + 1;  --原価計算エラー件数

                EXCEPTION
                    WHEN OTHERS THEN
                        vc2Comment := SUBSTR('13-2:INSERT T_CS_CALC_ERROR'  ||
                                             ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                         ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                        RAISE  excERR_CURSOR;
                END;  /* 原価計算エラー書き込み(工程外注で購入品マスタなし) */

            END IF;

            IF  recLOWER.OUTSIDE_TYP  =  1  THEN  /* 内作の処理 */

                /* 品目別加工費マスタの存在有無判定 */
                SELECT  COUNT(*)  INTO  numCountDummy  FROM M_ITEM_PROC_COST
                  WHERE  PLANT_CD  = pvc2PlantCd
                    AND  ITEM_CD   = recLOWER.COMP_ITEM_CD
                    AND  ROWNUM    = 1 
                ;

                IF  numCountDummy  >  0  THEN  /* 品目別加工費マスタの存在有り */

                    BEGIN  /* カーソルOPEN(品目別加工費マスタ) */
                        OPEN  curPROC_COST(recLOWER.COMP_ITEM_CD);
                    EXCEPTION
                        WHEN OTHERS THEN
                            vc2Comment := SUBSTR('21:OPEN curPROC_COST'  ||
                                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                            RAISE  excERR_CURSOR;
                    END;  /* カーソルOPEN(品目別加工費マスタ) */

                    LOOP  /* 品目別加工費マスタの繰り返し */
                        BEGIN  /* カーソルFETCH(品目別加工費マスタ) */
                            FETCH  curPROC_COST  INTO  recPROC_COST;
                        EXCEPTION
                            WHEN OTHERS THEN
                                vc2Comment := SUBSTR('22:FETCH curPROC_COST'  ||
                                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                                RAISE  excERR_CURSOR;
                        END;  /* カーソルFETCH(品目別加工費マスタ) */

                        EXIT WHEN  curPROC_COST%NOTFOUND;

                        IF  recPROC_COST.PLANT_CD IS NOT NULL  THEN  /* 加工費マスタが存在する時（工程内作）*/

                            numCntItemProcCost := numCntItemProcCost+1; --正常データ件数(品目別加工費)

                        ELSE

                            /* 以下のエラーはSQLSTDMATRPROCCOSTではチェックしないエラー */
                            /* 原価計算エラー番号の取得 */
                            blnRet  :=  FNCGETSEQCSCALCERRORCD(pvc2PlantCd,vc2CsCalcErrorCd);
                            IF  blnRet  =  FALSE  THEN
                                    vc2Comment := SUBSTR('12:FNCGETSEQCSCALCERRORCD'  ||
                                                         ' PLANT_CD=' || '[ ' || pvc2PlantCd || ' ]',1,256);
                                    RAISE  excERR_CURSOR;
                            END IF;

                            BEGIN  /* 原価計算エラー書き込み(内作で加工費マスタなし) */
                                INSERT  INTO  T_CS_CALC_ERROR (
                                          CS_CALC_ERROR_CD,CS_CALC_PROC_NO,YEAR,HALF_TERM_TYP,COST_TYP,PLANT_CD
                                         ,ROOT_ITEM_CD,PARENT_ITEM_CD,ITEM_CD,PS_EDITION,CS_PROC_CD
                                         ,PROC_COST_CLS_CD,MESSAGE_CD,REMARKS,LIST_ISS_FLG
                                         ,CREATED_DATE,CREATED_BY,CREATED_PRG_NM
                                         ,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM
                                         ,MODIFY_COUNT
                                 ) VALUES (
                                          vc2CsCalcErrorCd
                                         ,6,pnumYear,pnumHalfTermTyp,pnumCostTyp,pvc2PlantCd
                                         ,recUPPER.COMP_ITEM_CD
                                         ,recLOWER.PARENT_ITEM_CD
                                         ,recLOWER.COMP_ITEM_CD
                                         ,recLOWER.PS_EDITION
                                         ,recPROC_COST.CS_PROC_CD,NULL
                                         ,'DC00205','内作で加工費マスタなし',0
                                         ,SYSDATE,pvc2UserId,MY_SQL_NAME
                                         ,SYSDATE,pvc2UserId,MY_SQL_NAME
                                         ,0
                                );
                                numCountError := numCountError + 1;  --原価計算エラー件数

                            EXCEPTION
                                WHEN OTHERS THEN
                                    vc2Comment := SUBSTR('13:INSERT T_CS_CALC_ERROR'  ||
                                                         ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                         ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                                    RAISE  excERR_CURSOR;
                            END;  /* 原価計算エラー書き込み(工程外注で購入品マスタなし) */

                        END IF;  /* 加工費マスタが存在する時（工程内作）*/

                    END LOOP;  /* 品目別加工費マスタの繰り返し */

                    IF  recPROC_COST.OUTSIDE_TYP = 2 THEN  /* 工程外注の時は、品目別原価を更新する。*/

                        BEGIN  /* 購入品マスタ読み込み */
                            SELECT  UNIT_COST  ,PUCH_UNIT_QTY  ,EXCH_RATE
                            INTO    numUnitCost,numUnitQty,numExchRate
                            FROM    M_CS_PUCH
                            WHERE   YEAR          =  pnumYear
                              AND   HALF_TERM_TYP =  pnumHalfTermTyp
                              AND   COST_TYP      =  pnumCostTyp
                              AND   PLANT_CD      =  pvc2PlantCd
                              AND   ITEM_CD       =  recLOWER.COMP_ITEM_CD
--                            AND   CS_PROC_CD    =  recPROC_COST.CS_PROC_CD
                              AND   DEL_FLG       =  0
                            ;
                            blnFoundCsPuch  :=  TRUE;
                        EXCEPTION
                            WHEN OTHERS THEN
                                blnFoundCsPuch  :=  FALSE;
                        END;  /* 購入品マスタ読み込み */

                        IF  blnFoundCsPuch  =  TRUE  THEN  /* 購入品マスタが存在した場合 */

                            NULL;

                        ELSE  /* 購入品マスタが存在した場合 */

                            IF  recLOWER.VOLUNT_SPL_FLG   = 1  OR  /* 無償受給品フラグ */
                                recLOWER.COST_UP_TYP      = 0  OR  /* 原価積上区分 */
--                              recPROC_COST.ONEROUS_CONS_FLG = 1  OR  /* 有償支給品フラグ */
                                vc2PhaseStartMonth > TO_CHAR(recLOWER.EFF_PHASE_OUT_DATE,'YYYYMM') OR
                                vc2PhaseEndMonth   < TO_CHAR(recLOWER.EFF_PHASE_IN_DATE,'YYYYMM') THEN  /* [原価計算除外]判定 */

                                NULL;

                            ELSE  /* [原価計算除外]判定 */

                                /* 原価計算エラー番号の取得 */
                                blnRet  :=  FNCGETSEQCSCALCERRORCD(pvc2PlantCd,vc2CsCalcErrorCd);
                                IF  blnRet  =  FALSE  THEN
                                    vc2Comment := SUBSTR('27:FNCGETSEQCSCALCERRORCD'  ||
                                                         ' PLANT_CD=' || '[ ' || pvc2PlantCd || ' ]',1,256);
                                    RAISE  excERR_CURSOR;
                                END IF;

                                BEGIN  /* 原価計算エラー書き込み(工程外注で購入品マスタなし) */
                                    INSERT  INTO  T_CS_CALC_ERROR (
                                          CS_CALC_ERROR_CD,CS_CALC_PROC_NO,YEAR,HALF_TERM_TYP,COST_TYP,PLANT_CD
                                         ,ROOT_ITEM_CD,PARENT_ITEM_CD,ITEM_CD,PS_EDITION,CS_PROC_CD
                                         ,PROC_COST_CLS_CD,MESSAGE_CD,REMARKS,LIST_ISS_FLG
                                         ,CREATED_DATE,CREATED_BY,CREATED_PRG_NM
                                         ,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM
                                         ,MODIFY_COUNT
                                     )  VALUES (
                                          vc2CsCalcErrorCd
                                         ,6,pnumYear,pnumHalfTermTyp,pnumCostTyp,pvc2PlantCd
                                         ,recUPPER.COMP_ITEM_CD
                                         ,recLOWER.PARENT_ITEM_CD
                                         ,recLOWER.COMP_ITEM_CD
                                         ,recLOWER.PS_EDITION
                                         ,recPROC_COST.CS_PROC_CD,NULL
                                         ,'DC00207','工程外注で購入品マスタなし',0
                                         --,'DC00207','購入品マスタなし',0
                                         ,SYSDATE,pvc2UserId,MY_SQL_NAME
                                         ,SYSDATE,pvc2UserId,MY_SQL_NAME
                                         ,0
                                    );
                                    numCountError := numCountError + 1;  --原価計算エラー件数

                                EXCEPTION
                                    WHEN OTHERS THEN
                                        vc2Comment := SUBSTR('28:INSERT T_CS_CALC_ERROR'  ||
                                                             ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                             ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                                        RAISE  excERR_CURSOR;
                                END;  /* 原価計算エラー書き込み(工程外注で購入品マスタなし) */

                            END IF;  /* [原価計算除外]判定 */

                        END IF;  /* 購入品マスタが存在した場合 */

                   END IF;  /* 工程外注の時は、品目別原価を更新する。*/

                   CLOSE curPROC_COST;

                ELSE  /* 品目別加工費マスタの存在有り */

                    IF  recLOWER.VOLUNT_SPL_FLG   = 1  OR  /* 無償受給品フラグ */
                        recLOWER.COST_UP_TYP      = 0  OR  /* 原価積上区分 */
--                      recPROC_COST.ONEROUS_CONS_FLG = 1  OR  /* 有償支給品フラグ */
                        vc2PhaseStartMonth > TO_CHAR(recLOWER.EFF_PHASE_OUT_DATE,'YYYYMM') OR
                        vc2PhaseEndMonth   < TO_CHAR(recLOWER.EFF_PHASE_IN_DATE,'YYYYMM') THEN  /* [原価計算除外]判定 */

                        NULL;

                    ELSE  /* [原価計算除外]判定 */

                        /* 原価計算エラー番号の取得 */
                        blnRet  :=  FNCGETSEQCSCALCERRORCD(pvc2PlantCd,vc2CsCalcErrorCd);
                        IF  blnRet  =  FALSE  THEN
                            vc2Comment := SUBSTR('29:FNCGETSEQCSCALCERRORCD'  ||
                                                 ' PLANT_CD=' || '[ ' || pvc2PlantCd || ' ]',1,256);
                            RAISE  excERR_CURSOR;
                        END IF;

                        BEGIN  /* 原価計算エラー書き込み(内作で品目別加工費マスタなし) */
                            INSERT  INTO  T_CS_CALC_ERROR (
                                  CS_CALC_ERROR_CD,CS_CALC_PROC_NO,YEAR,HALF_TERM_TYP,COST_TYP
                                 ,PLANT_CD,ROOT_ITEM_CD,PARENT_ITEM_CD,ITEM_CD
                                 ,PS_EDITION,CS_PROC_CD,PROC_COST_CLS_CD
                                 ,MESSAGE_CD,REMARKS,LIST_ISS_FLG
                                 ,CREATED_DATE,CREATED_BY,CREATED_PRG_NM
                                 ,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM
                                 ,MODIFY_COUNT
                             )  VALUES (
                                  vc2CsCalcErrorCd
                                 ,6,pnumYear,pnumHalfTermTyp,pnumCostTyp,pvc2PlantCd
                                 ,recUPPER.COMP_ITEM_CD
                                 ,recLOWER.PARENT_ITEM_CD
                                 ,recLOWER.COMP_ITEM_CD
                                 ,recLOWER.PS_EDITION
                                 ,NULL,NULL
                                 ,'DC00206','内作で品目別加工費マスタなし',0
                                 ,SYSDATE,pvc2UserId,MY_SQL_NAME
                                 ,SYSDATE,pvc2UserId,MY_SQL_NAME
                                 ,0
                            );
                            numCountError := numCountError + 1;  --原価計算エラー件数

                        EXCEPTION
                            WHEN OTHERS THEN
                                vc2Comment := SUBSTR('30:INSERT T_CS_CALC_ERROR'  ||
                                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                                RAISE  excERR_CURSOR;
                        END;  /* 原価計算エラー書き込み(内作で品目別加工費マスタなし) */

                    END IF;  /* [原価計算除外]判定 */

                END IF;  /* 品目別加工費マスタの存在有り */

            ELSE  /* 内作の処理 */

                BEGIN  /* 購入品マスタ読み込み */
                    SELECT  
                        UNIT_COST_ACCEPT_TYP,UNIT_COST,PUCH_UNIT_QTY,EXCH_RATE
                       ,SUB_UNIT_COST,SUB_PUCH_UNIT_QTY,SUB_EXCH_RATE
                       ,CLASIFICATION_CD,ONEROUS_CONS_FLG
                    INTO
                        numUnitCostAcceptTyp,numUnitCost,numUnitQty,numExchRate
                       ,numSubUnitCost,numSubUnitQty,numSubExchRate
                       ,vc2ClasificationCd,numOnerousConsFlg
                    FROM
                       M_CS_PUCH
                    WHERE    YEAR          =  pnumYear
                       AND   HALF_TERM_TYP =  pnumHalfTermTyp
                       AND   COST_TYP      =  pnumCostTyp
                       AND   PLANT_CD      =  pvc2PlantCd
                       AND   ITEM_CD       =  recLOWER.COMP_ITEM_CD
--                     AND   CS_PROC_CD    =  OUTSIDE_PROC_CD
                       AND   DEL_FLG       =  0
                     ;
                    blnFoundCsPuch  :=  TRUE;
                EXCEPTION
                    WHEN OTHERS THEN
                        blnFoundCsPuch  :=  FALSE;
                END;  /* 購入品マスタ読み込み */

                IF  blnFoundCsPuch  =  TRUE  THEN  /* 購入品マスタが存在した場合 */

                    NULL;

                ELSE    /* 購入品マスタが存在した場合 */

                    IF  recLOWER.VOLUNT_SPL_FLG   = 1  OR  /* 無償受給品フラグ */
                        recLOWER.COST_UP_TYP      = 0  OR  /* 原価積上区分 */
--                      recPROC_COST.ONEROUS_CONS_FLG = 1  OR  /* 有償支給品フラグ */
                        vc2PhaseStartMonth > TO_CHAR(recLOWER.EFF_PHASE_OUT_DATE,'YYYYMM') OR
                        vc2PhaseEndMonth   < TO_CHAR(recLOWER.EFF_PHASE_IN_DATE,'YYYYMM') THEN  /* [原価計算除外]判定 */

                        NULL;

                    ELSE  /* [原価計算除外]判定 */

                        /* 原価計算エラー番号の取得 */
                        blnRet  :=  FNCGETSEQCSCALCERRORCD(pvc2PlantCd,vc2CsCalcErrorCd);
                        IF  blnRet  =  FALSE  THEN
                            vc2Comment := SUBSTR('32:FNCGETSEQCSCALCERRORCD'  ||
                                                 ' PLANT_CD=' || '[ ' || pvc2PlantCd || ' ]',1,256);
                            RAISE  excERR_CURSOR;
                        END IF;

                        BEGIN  /* 原価計算エラー書き込み(外作で購入品マスタなし)  */
                            INSERT  INTO  T_CS_CALC_ERROR 
                                 (CS_CALC_ERROR_CD,CS_CALC_PROC_NO,YEAR,HALF_TERM_TYP,COST_TYP
                                 ,PLANT_CD,ROOT_ITEM_CD,PARENT_ITEM_CD,ITEM_CD
                                 ,PS_EDITION,CS_PROC_CD,PROC_COST_CLS_CD
                                 ,MESSAGE_CD,REMARKS,LIST_ISS_FLG
                                 ,CREATED_DATE,CREATED_BY,CREATED_PRG_NM
                                 ,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM
                                 ,MODIFY_COUNT
                             )  VALUES (
                                  vc2CsCalcErrorCd
                                 ,6,pnumYear,pnumHalfTermTyp,pnumCostTyp,pvc2PlantCd
                                 ,recUPPER.COMP_ITEM_CD
                                 ,recLOWER.PARENT_ITEM_CD
                                 ,recLOWER.COMP_ITEM_CD
                                 ,recLOWER.PS_EDITION
                                 ,OUTSIDE_PROC_CD,NULL
                                 ,'DC00208','外作で購入品マスタなし',0
                                 ,SYSDATE,pvc2UserId,MY_SQL_NAME
                                 ,SYSDATE,pvc2UserId,MY_SQL_NAME
                                 ,0
                            );
                            numCountError := numCountError + 1;  --原価計算エラー件数

                        EXCEPTION
                            WHEN OTHERS THEN
                                vc2Comment := SUBSTR('33:INSERT T_CS_CALC_ERROR'  ||
                                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                            RAISE  excERR_CURSOR;
                        END;  /* 原価計算エラー書き込み(外作で購入品マスタなし)  */

                    END IF;  /* [原価計算除外]判定 */

                END IF;  /* 購入品マスタが存在した場合 */

            END IF;  /* 内作の処理 */

        END LOOP;  /* 下位展開の繰り返し */

        CLOSE curLOWER;

        COMMIT;  --COMMITは先頭品ごと

    END IF;  /* 先頭品でエラー */

    END LOOP;  /*  先頭品の繰り返し */

    CLOSE curUPPER;

/* 処理の終了 */

    /* 終了メッセージの出力 */
    vc2Comment := SUBSTR('(SBM0550)　入力件数(先頭品)=' || '[ ' || numCntUpper || ' ]' ||
                         '　入力件数(下位展開)=' || '[ ' || numCntLower || ' ]' ||
                         '　エラー件数=' || '[ ' || numCountError || ' ]',1,256);
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

    pnumReturn := STATUS_NORMAL; --正常終了

--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN excERR_SKIP THEN    --実行不可

        ROLLBACK;

        /* 終了メッセージの出力 */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, vc2MsgCD,
                            vc2Comment);

        /* トレースログの出力(終了) */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId,pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, METHOD_END);

        COMMIT;

        /* LogFile の CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

        pnumReturn := STATUS_ERROR; --異常終了

    WHEN excERR_CURSOR THEN    --カーソル(curUPPER)OPEN中のＤＢエラー

        IF curUPPER%ISOPEN = TRUE THEN
            CLOSE curUPPER;
        END IF;
        IF curLOWER%ISOPEN = TRUE THEN
            CLOSE curLOWER;
        END IF;
        IF curPROC_COST%ISOPEN = TRUE THEN
            CLOSE curPROC_COST;
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

        pnumReturn := STATUS_ERROR; --異常終了

    WHEN OTHERS  THEN   --その他のエラー

        IF curUPPER%ISOPEN = TRUE THEN
            CLOSE curUPPER;
        END IF;
        IF curLOWER%ISOPEN = TRUE THEN
            CLOSE curLOWER;
        END IF;
        IF curPROC_COST%ISOPEN = TRUE THEN
            CLOSE curPROC_COST;
        END IF;

        ROLLBACK;

        /* 終了メッセージの出力 */
        vc2Comment := SUBSTR('(SBM0551) その他のエラーが発生しました'  ||
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

        pnumReturn := STATUS_ERROR; --異常終了

END;
/
