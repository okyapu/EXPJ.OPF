CREATE OR REPLACE procedure      SQLCSMASTDELETE(
/*------------------------------------------------------------------------------
'
'$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/DBProj/Procedure/SqlCsMastDelete.sql,v $
'$Author: feng-yi $
'$Revision: 1.5 $ $Date: 2011/12/23 03:19:47 $
'                        2005.10.21 unicode対応（varchar2を4倍）
'
'
' 機能      : 原価基準情報削除処理
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
'             pnumDelFlgM_CS_PROC    - (i)削除対象フラグ(工程Ｍ)
'             pnumDelFlgM_PROC_COST  - (i)削除対象フラグ(加工費Ｍ)
'             pnumDelFlgM_CS_PUCH    - (i)削除対象フラグ(購入品Ｍ)
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
   ,pnumDelFlgM_CS_PROC    IN  NUMBER          --削除対象フラグ(工程Ｍ)
   ,pnumDelFlgM_PROC_COST  IN  NUMBER          --削除対象フラグ(加工費Ｍ)
   ,pnumDelFlgM_CS_PUCH    IN  NUMBER          --削除対象フラグ(購入品Ｍ)
   ,pnumReturn           OUT NUMBER          --処理結果
)
IS

    /* 定数の宣言 */

    METHOD_START            VARCHAR2(20) := 'START';          --ログ用メソッド開始宣言
    METHOD_END              VARCHAR2(12) := 'End';            --ログ用メソッド終了宣言
    MY_SQL_NAME             VARCHAR2(120) := 'SQLCSMASTDELETE'; --ＰＬ／ＳＱＬ名

    APS_COM_BATCH_START     VARCHAR2(28) := 'DE02202';
    APS_COM_BATCH_END       VARCHAR2(28) := 'DE02203';
    APS_COM_BATCH_EXP       VARCHAR2(28) := 'DE02204';

    LOGMSG_START_PGNM       VARCHAR2(200) := '(SBM0330)原価基準情報削除処理を開始しました';
    LOGMSG_END_PGNM         VARCHAR2(200) := '原価基準情報削除処理を終了しました';
    LOGMSG_EXP_PGNM         VARCHAR2(200) := '原価基準情報削除処理が異常終了しました';

    STATUS_NORMAL           NUMBER        := 1;          -- 正常終了
    STATUS_WARNING          NUMBER        := 2;          -- 警告終了
    STATUS_ERROR            NUMBER        := 3;          -- 異常終了

    /* 変数の定義 */
    UTL_FileHandle          UTL_FILE.FILE_TYPE;     --ファイルハンドル

    numM_CS_PUCH_DELETE     NUMBER(11)   := 0;           --正常データ件数
    numM_PROC_COST_DELETE   NUMBER(11)   := 0;           --正常データ件数
    numM_CS_PROC_DELETE     NUMBER(11)   := 0;           --正常データ件数
    blnRet                  BOOLEAN;        --共通関数の戻値
    vc2Comment              VARCHAR2(1024);  --メッセージ作成用

    vc2M_CS_PROC_PERIOD     VARCHAR2(32);
    vc2M_PROC_COST_PERIOD   VARCHAR2(32);
    vc2M_CS_PUCH_PERIOD     VARCHAR2(32);

    /* 原価管理パラメータからの取得項目 */
    numM_CS_PROC_PERIOD     SYS_COST_CTRL.M_CS_PROC_PERIOD  %TYPE;
    numM_PROC_COST_PERIOD   SYS_COST_CTRL.M_PROC_COST_PERIOD%TYPE;
    numM_CS_PUCH_PERIOD     SYS_COST_CTRL.M_CS_PUCH_PERIOD  %TYPE;

    /* 例外処理用変数 */
    excERR_SKIP       EXCEPTION;      --実行不可
    excERR_MAST       EXCEPTION;      --カーソルOPEN中のEXCEPTION

    /* カーソルの宣言  購入品M*/
    CURSOR curM_CS_PUCH(
         cvc2UpdateDate VARCHAR2
    )
    IS
      SELECT *
        FROM  M_CS_PUCH
        WHERE  PLANT_CD=pvc2PlantCd
          AND  DEL_FLG =1
          AND  TO_CHAR(UPDATED_DATE,'YYYYMMDD') < cvc2UpdateDate
      ;
    recM_CS_PUCH curM_CS_PUCH%ROWTYPE;

    /* カーソルの宣言  加工費M*/
    CURSOR curM_PROC_COST(
         cvc2UpdateDate VARCHAR2
    )
    IS
      SELECT *
        FROM  M_PROC_COST
        WHERE  PLANT_CD=pvc2PlantCd
          AND  DEL_FLG =1
          AND  TO_CHAR(UPDATED_DATE,'YYYYMMDD') < cvc2UpdateDate
      ;
    recM_PROC_COST  curM_PROC_COST%ROWTYPE;

    /* カーソルの宣言  工程M*/
    CURSOR curM_CS_PROC(
         cvc2UpdateDate VARCHAR2
    )
    IS
      SELECT *
        FROM  M_CS_PROC
        WHERE  PLANT_CD=pvc2PlantCd
          AND  DEL_FLG =1
          AND  TO_CHAR(UPDATED_DATE,'YYYYMMDD') < cvc2UpdateDate
      ;
    recM_CS_PROC curM_CS_PROC%ROWTYPE;

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
    numM_CS_PUCH_DELETE   := 0;
    numM_PROC_COST_DELETE := 0;
    numM_CS_PROC_DELETE   := 0;

    /*  原価管理パラメータの読込 */ 
    BEGIN
        SELECT  M_CS_PROC_PERIOD,M_PROC_COST_PERIOD,M_CS_PUCH_PERIOD  
          INTO  numM_CS_PROC_PERIOD,numM_PROC_COST_PERIOD,numM_CS_PUCH_PERIOD
          FROM  SYS_COST_CTRL
          WHERE  PLANT_CD  =  pvc2PlantCd;
    EXCEPTION
        WHEN OTHERS THEN
            vc2Comment      := SUBSTR('(SBM0535)原価管理パラメータが存在しません。'  ||
                                      '　USER_CD：' || '[ ' || pvc2UserId || ' ]' ||
                                      '　PLANT_CD：' || '[ ' || pvc2PlantCd || ' ]',1,256);
            RAISE   excERR_SKIP;  
    END;

    vc2M_CS_PROC_PERIOD   := TO_CHAR(ADD_MONTHS(SYSDATE,numM_CS_PROC_PERIOD  *-1),'YYYYMM')||'01';
    vc2M_PROC_COST_PERIOD := TO_CHAR(ADD_MONTHS(SYSDATE,numM_PROC_COST_PERIOD*-1),'YYYYMM')||'01';
    vc2M_CS_PUCH_PERIOD   := TO_CHAR(ADD_MONTHS(SYSDATE,numM_CS_PUCH_PERIOD  *-1),'YYYYMM')||'01';

    IF  pnumDelFlgM_CS_PUCH = 1 THEN  /* 削除(購入品Ｍ) */

        BEGIN  /* カーソルOPEN(購入品Ｍ) */ 
            OPEN  curM_CS_PUCH(vc2M_CS_PUCH_PERIOD);
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment  :=  SUBSTR(' OPEN curM_CS_PUCH'  ||
                                       ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                       ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE  excERR_MAST;
        END;  /* カーソルOPEN(購入品Ｍ) */ 

        LOOP  /* 削除(購入品Ｍ)の繰り返し*/

            BEGIN  /* カーソルFETCH（購入品Ｍ） */
                FETCH  curM_CS_PUCH  INTO  recM_CS_PUCH;
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment  :=  SUBSTR(' FETCH curM_CS_PUCH'  ||
                                           ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                           ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE  excERR_MAST;
            END;  /* カーソルFETCH（購入品Ｍ） */
    
            EXIT WHEN  curM_CS_PUCH%NOTFOUND;

            BEGIN  /* 購入品Ｍ・削除 */
                DELETE  FROM  M_CS_PUCH
                   WHERE   YEAR          =  recM_CS_PUCH.YEAR
                     AND   HALF_TERM_TYP =  recM_CS_PUCH.HALF_TERM_TYP
                     AND   COST_TYP      =  recM_CS_PUCH.COST_TYP
                     AND   PLANT_CD      =  recM_CS_PUCH.PLANT_CD
                     AND   ITEM_CD       =  recM_CS_PUCH.ITEM_CD
--                   AND   CS_PROC_CD    =  recM_CS_PUCH.CS_PROC_CD
                ;
                numM_CS_PUCH_DELETE := numM_CS_PUCH_DELETE + 1; 

            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment  :=  SUBSTR(' DELETE  M_CS_PUCH'  ||
                                           ' YEAR='         || '[ ' || recM_CS_PUCH.YEAR          || ' ]' ||
                                           ' HALF_TERM_TYP='|| '[ ' || recM_CS_PUCH.HALF_TERM_TYP || ' ]' ||
                                           ' COST_TYP='     || '[ ' || recM_CS_PUCH.COST_TYP      || ' ]' ||
                                           ' PLANT_CD='     || '[ ' || recM_CS_PUCH.PLANT_CD      || ' ]' ||
                                           ' ITEM_CD='      || '[ ' || recM_CS_PUCH.ITEM_CD       || ' ]' ||
--                                         ' CS_PROC_CD='   || '[ ' || recM_CS_PUCH.CS_PROC_CD    || ' ]' ||
                                           ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                           ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE  excERR_MAST;
            END;  /* 購入品Ｍ・削除 */

        END LOOP;  /* 削除(購入品Ｍ)の繰り返し*/

        CLOSE curM_CS_PUCH;

        COMMIT;  --COMMITは最後に１回のみ

    END IF;  /* 削除(購入品Ｍ) */

    IF  pnumDelFlgM_PROC_COST = 1 THEN  /* 削除(加工費Ｍ) */

        BEGIN  /* カーソルOPEN(加工費Ｍ) */ 
            OPEN  curM_PROC_COST(vc2M_PROC_COST_PERIOD);
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment  :=  SUBSTR(' OPEN curM_PROC_COST'  ||
                                       ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                       ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE  excERR_MAST;
        END;  /* カーソルOPEN(加工費Ｍ) */ 

        LOOP  /* 削除(加工費Ｍ)の繰り返し*/

            BEGIN  /* カーソルFETCH（加工費Ｍ） */
                FETCH  curM_PROC_COST  INTO  recM_PROC_COST;
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment  :=  SUBSTR(' FETCH curM_PROC_COST '  ||
                                           ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                           ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE  excERR_MAST;
            END;  /* カーソルFETCH（加工費Ｍ） */
    
            EXIT WHEN  curM_PROC_COST%NOTFOUND;

            BEGIN  /* 加工費Ｍ・削除 */
                DELETE  FROM  M_PROC_COST
                   WHERE   YEAR             = recM_PROC_COST.YEAR
                     AND   HALF_TERM_TYP    = recM_PROC_COST.HALF_TERM_TYP
                     AND   COST_TYP         = recM_PROC_COST.COST_TYP
                     AND   PLANT_CD         = recM_PROC_COST.PLANT_CD
                     AND   CS_PROC_CD       = recM_PROC_COST.CS_PROC_CD
                     AND   PROC_COST_CLS_CD = recM_PROC_COST.PROC_COST_CLS_CD
                ;
                DELETE  FROM  M_ITEM_PROC_COST
                   WHERE   PLANT_CD         = recM_PROC_COST.PLANT_CD
                     AND   CS_PROC_CD       = recM_PROC_COST.CS_PROC_CD
                     AND   PROC_COST_CLS_CD = recM_PROC_COST.PROC_COST_CLS_CD
                ;
                numM_PROC_COST_DELETE := numM_PROC_COST_DELETE + 1; 

            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment  :=  SUBSTR(' DELETE  M_PROC_COST '  ||
                                           ' YEAR='            || '[ ' || recM_PROC_COST.YEAR            || ' ]' ||
                                           ' HALF_TERM_TYP='   || '[ ' || recM_PROC_COST.HALF_TERM_TYP   || ' ]' ||
                                           ' COST_TYP='        || '[ ' || recM_PROC_COST.COST_TYP        || ' ]' ||
                                           ' PLANT_CD='        || '[ ' || recM_PROC_COST.PLANT_CD        || ' ]' ||
                                           ' CS_PROC_CD='      || '[ ' || recM_PROC_COST.CS_PROC_CD      || ' ]' ||
                                           ' PROC_COST_CLS_CD='|| '[ ' || recM_PROC_COST.PROC_COST_CLS_CD|| ' ]' ||
                                           ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                           ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE  excERR_MAST;
            END;  /* 加工費Ｍ・削除 */

        END LOOP;  /* 削除(加工費Ｍ)の繰り返し*/

        CLOSE curM_PROC_COST;

        COMMIT;  --COMMITは最後に１回のみ

    END IF;  /* 削除(加工費Ｍ) */

    IF  pnumDelFlgM_CS_PROC = 1 THEN  /* 削除(工程Ｍ) */

        BEGIN  /* カーソルOPEN(工程Ｍ) */ 
            OPEN  curM_CS_PROC(vc2M_CS_PROC_PERIOD);
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment  :=  SUBSTR(' OPEN curM_CS_PROC '  ||
                                       ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                       ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE  excERR_MAST;
        END;  /* カーソルOPEN(工程Ｍ) */ 

        LOOP  /* 削除(工程Ｍ)の繰り返し*/

            BEGIN  /* カーソルFETCH（工程Ｍ） */
                FETCH  curM_CS_PROC  INTO  recM_CS_PROC;
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment  :=  SUBSTR(' FETCH curM_CS_PROC '  ||
                                           ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                           ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE  excERR_MAST;
            END;  /* カーソルFETCH（工程Ｍ） */
    
            EXIT WHEN  curM_CS_PROC%NOTFOUND;

            BEGIN  /* 工程Ｍ・削除 */
                DELETE  FROM  M_CS_PROC
                   WHERE   PLANT_CD         = recM_CS_PROC.PLANT_CD
                     AND   CS_PROC_CD       = recM_CS_PROC.CS_PROC_CD
                ;
                numM_CS_PROC_DELETE := numM_CS_PROC_DELETE + 1; 

            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment  :=  SUBSTR(' DELETE  M_CS_PROC '  ||
                                           ' PLANT_CD='   || '[ ' || recM_CS_PROC.PLANT_CD || ' ]' ||
                                           ' CS_PROC_CD=' || '[ ' || recM_CS_PROC.CS_PROC_CD || ' ]' ||
                                           ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                           ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE  excERR_MAST;
            END;  /* 工程Ｍ・削除 */

        END LOOP;  /* 削除(工程Ｍ)の繰り返し*/

        CLOSE curM_CS_PROC;

        COMMIT;  --COMMITは最後に１回のみ

    END IF;  /* 削除(工程Ｍ) */

/* 処理の終了 */

    /* 終了メッセージの出力 */
    vc2Comment  := SUBSTR(' M_CS_PUCH DELETE='   || '[ ' || numM_CS_PUCH_DELETE   || ' ]' ||
                          ' M_PROC_COST DELETE=' || '[ ' || numM_PROC_COST_DELETE || ' ]' ||
                          ' M_CS_PROC DELETE='   || '[ ' || numM_CS_PROC_DELETE   || ' ]',1,256);
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

        IF curM_CS_PUCH%ISOPEN = TRUE THEN
            CLOSE curM_CS_PUCH;
        END IF;
        IF curM_PROC_COST%ISOPEN = TRUE THEN
            CLOSE curM_PROC_COST;
        END IF;
        IF curM_CS_PROC%ISOPEN = TRUE THEN
            CLOSE curM_CS_PROC;
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

        IF curM_CS_PUCH%ISOPEN = TRUE THEN
            CLOSE curM_CS_PUCH;
        END IF;
        IF curM_PROC_COST%ISOPEN = TRUE THEN
            CLOSE curM_PROC_COST;
        END IF;
        IF curM_CS_PROC%ISOPEN = TRUE THEN
            CLOSE curM_CS_PROC;
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