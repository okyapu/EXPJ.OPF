CREATE OR REPLACE PROCEDURE SqlDebtInformationToAi(
/*------------------------------------------------------------------------------
'
' SqlDebtInformationToAi.Sql
'
' version   : 1.00.00
'
' 修正履歴
'
' 機能      : Ａｉ連携買掛インタフェース処理
'
' 引き数    : pvc2LogMode          - (i)ＬＯＧモード'
'             pvc2OutputMode       - (i)出力モード'
'             pvc2OutputPath       - (i)出力ファイルパス
'             pvc2OutputName       - (i)出力ファイル名
'             pvc2UserId           - (i)ユーザＩＤ
'             pvc2BusinessName     - (i)業務名
'             pvc2PlantCd          - (i)工場コード
'             pvc2ErrorCd          - (0)エラーコード
'             pnumStatus           - (o)結果ステータス
'
' 機能説明  : EXPLANNER/J（Ｊｆ／Ｊa）の[検収実績情報インタフェース]から買掛情報を集約して、Aｉ向け買掛インタフェースにデータ登録する。
'
' 備考      : 特になし
'
------------------------------------------------------------------------------*/
    pvc2LogMode                 IN  VARCHAR2    --ＬＯＧモード
   ,pvc2OutputMode              IN  VARCHAR2    --出力モード
   ,pvc2OutputPath              IN  VARCHAR2    --出力ファイルパス
   ,pvc2OutputName              IN  VARCHAR2    --出力ファイル名
   ,pvc2UserId                  IN  VARCHAR2    --ユーザＩＤ
   ,pvc2BusinessName            IN  VARCHAR2    --業務名
   ,pvc2PlantCd                 IN  VARCHAR2    --工場コード
   ,pvc2ErrorCd                 OUT VARCHAR2    --エラーコード
   ,pnumStatus                  OUT NUMBER      --結果ステータス（1:正常終了、2:ワーニング終了、3:異常終了）
) IS

/* 定数の宣言 */

    MY_SQL_NAME                           VARCHAR2(120):= 'SQLDEBTINFORMATIONTOAi';     --ＰＬ／ＳＱＬ名

    --//業務ログ用メッセージID
    LOGMSG_ID_START                       VARCHAR2(28) := 'CF00021';                    --処理開始宣言
    LOGMSG_ID_COMMON_CHK                  VARCHAR2(28) := 'CF00020';                    --引数説明を基に必須項目
    LOGMSG_ID_READ_DATA                   VARCHAR2(28) := 'CF00024';                    --Aｉ向け買掛インタフェース情報の取得
    LOGMSG_ID_ITEM_CD_NULL                VARCHAR2(28) := 'CF00022';                    --品目番号NULL
    LOGMSG_ID_AI_AP_IF_INS                VARCHAR2(28) := 'CF00023';                    --買掛情報インタフェースのデータ登録処理
    LOGMSG_ID_INSPC_ACPT_UPD              VARCHAR2(28) := 'CF00025';                    --検収実績情報インタフェース更新処理
    LOGMSG_ID_SUCCESS                     VARCHAR2(28) := 'CF00026';                    --正常処理
    LOGMSG_ID_END_ERR                     VARCHAR2(28) := 'CF00027';                    --例外終了処理
    LOGMSG_ID_PARAM_ERR                   VARCHAR2(28) := 'CF00028';                    --システム設定より仮単価データを送信できません。
    LOGMSG_ID_PARAM_WAR                   VARCHAR2(28) := 'CF00029';                    --仮単価データを送信しました。
    
    --//業務ログ用メッセージ
    LOGMSG_NM_START                       VARCHAR2(200) := '(SBM0773)Ａｉ連携買掛インタフェース処理を開始しました。';            --処理開始宣言
    LOGMSG_NM_COMMON_CHK                  VARCHAR2(200) := '(SBM0017)引数が不正のため処理ができませんでした。';
    LOGMSG_NM_READ_DATA                   VARCHAR2(200) := '(SBM0774)Ａｉ連携買掛インタフェース情報の読込に失敗しました。';
    LOGMSG_NM_ITEM_CD_NULL                VARCHAR2(200) := '(SBM0775)品目番号が設定されていないため送信されませんでした。';      --品目番号NULL
    LOGMSG_NM_AI_AP_IF_INS                VARCHAR2(200) := '(SBM0776)Ａｉ連携買掛インタフェース情報の登録に失敗しました。';
    LOGMSG_NM_INSPC_ACPT_UPD              VARCHAR2(200) := '(SBM0777)検収実績情報インタフェース更新処理が失敗しました。';
    LOGMSG_NM_SUCCESS                     VARCHAR2(200) := '(SBM0778)Ａｉ連携買掛インタフェース処理が正常終了しました。';
    LOGMSG_NM_END_ERR                     VARCHAR2(200) := '(SBM0779)Ａｉ連携買掛インタフェース処理が異常終了しました。';
    LOGMSG_NM_PARAM_ERR                   VARCHAR2(200) := '(SBM0780)仮単価のため送信されませんでした。';
    LOGMSG_NM_PARAM_WAR                   VARCHAR2(200) := '(SBM0781)仮単価データを送信しました。';
    
    --//業務文字列
    LOGMSG_STR_MESSAGE                    VARCHAR2(200):= '(SBM0351)<< Ａｉ連携買掛インタフェース処理開始　>>';                  --業務文字列定義

    --//結果ステータス
    STATUS_NORMAL                         NUMBER        := 1;      -- 正常終了
    STATUS_WARNING                        NUMBER        := 2;      -- ワーニング
    STATUS_ERROR                          NUMBER        := 3;      -- 異常終了

/* 変数の宣言 WORK */
    --//自定義異常
    excFncTraceLog                         EXCEPTION;                               --ログを書き失敗
    excCommonChk                           EXCEPTION;                               --共通引数失敗
    LOGMSG_NM_END                          VARCHAR2(200);                           --処理終了宣言
    UTL_FileHandle                         UTL_FILE.FILE_TYPE;                      --ファイルハンドル
    blnRet                                 BOOLEAN;                                 --共通関数の戻値
    numSuccessCount                        NUMBER;                                  --正常件数
    numErrCount                            NUMBER;                                  --エラー件数
    numTotalCount                          NUMBER;                                  --処理データ件数
    numWarnCount                           NUMBER;                                  --ワーニング件数
    numZeroCount                           NUMBER;                                  --検収金額0データ件数
    numOffsetCount                         NUMBER;                                  --相殺データ件数

    --//詳細メッセージ格納用
    vc2Comment                             VARCHAR2(1024);
    --//内部変数の宣言
    wblnErrorFlg                            BOOLEAN;                                --エラーのフラグ
    wblnWarnFlg                             BOOLEAN;                                --ワーニングのフラグ
    wvc2Value                               VARCHAR2(1024);                         --設定値
    wnumUnitAmount                          NUMBER;                                 --本体金額計算
    wnumTaxAmount1                          NUMBER;                                 --税額1
    wnumTaxAmount2                          NUMBER;                                 --税額2
    wnumTaxAmount3                          NUMBER;                                 --税額3
    wnumTaxOutAmount                        NUMBER;                                 --税抜金額
    wnumTaxAmount                           NUMBER;                                 --消費税額
    wnumTaxInAmount                         NUMBER;                                 --税込金額
    wnumExternalTaxSalesAmount              NUMBER;                                 --外税対象金額
    wnumInternalTaxSalesAmount              NUMBER;                                 --内税対象金額
    wnumTaxFreeSalesAmount                  NUMBER;                                 --非課税対象金額
    wnumExternalTaxAmount                   NUMBER;                                 --消費税額（外税）
    wnumInternalTaxAmount                   NUMBER;                                 --消費税額（内税）
    wnumInspcAmount                         NUMBER;                                 --検収金額
    wnumInspcCurAmount                      NUMBER;                                 --検収金額(邦貨)
    wnumTaxCurAmount                        NUMBER;                                 --税抜金額(邦貨)
    wnumAmount                              NUMBER;                                 --金額    
    wnumAmountWK                            NUMBER;                                 --金額計算用ワーク  
    wnumINPUT_SLIP_CD                       NUMBER;                                 --入力伝票番号  
    wnumINPUT_SLIP_CDWK                     NUMBER;                                 --前回入力伝票番号  
    wvc2PUCH_ODR_CDWK                       VARCHAR2(100);                          --前回発注計画番号  
    wnumACPT_NOWK                           NUMBER;                                 --前回受入回数  
    wnumINSERT                              NUMBER;                                 --前回データ登録フラグ
    wnumINSERTCK                            NUMBER;                                 --登録しないフラグ
    wnumOFFSETFlg                           NUMBER;                                 --相殺のフラグ(0:相殺なし,1:黒消し相殺,2:赤登録しない,3:0データ)
    wnumSTSFlg                              NUMBER;                                 --前回登録状況(0:正常,1:ワーニング,2:エラー)

 /* カーソルの宣言*/
    --//買掛インタフェースをロックし
    CURSOR CUR_T_AI_AP_IF_LOCK
    IS
    SELECT 1
      FROM T_AI_AP_IF
    FOR UPDATE NOWAIT;
    

    --//検収実績情報インタフェースを検索し
    CURSOR CUR_T_INSPC_ACPT_IF
    IS 
    SELECT * FROM (
    SELECT
        T_INSPC_ACPT_IF.PUCH_ODR_CD                                                 --[検収実績情報インタフェース]．”発注番号“
       ,T_INSPC_ACPT_IF.ACPT_NO                                                     --[検収実績情報インタフェース]．“受入回数”
       ,T_INSPC_ACPT_IF.INSPC_ACPT_NO                                               --[検収実績情報インタフェース]．“検収番号”
       ,T_INSPC_ACPT_IF.ITEM_CD                                                     --[検収実績情報インタフェース]．”品目番号“
       ,T_INSPC_ACPT_IF.INSPC_ACPT_DATE                                             --[検収実績情報インタフェース]．”検収日”
       ,T_INSPC_ACPT_IF.VEND_CD                                                     --[検収実績情報インタフェース]．”取引先コード”
       ,NVL(T_INSPC_ACPT_IF.INSPC_ACPT_QTY,0) AS INSPC_ACPT_QTY                     --[検収実績情報インタフェース]．”検収数”
       ,NVL(T_INSPC_ACPT_IF.UNIT_COST,0) AS UNIT_COST                               --[検収実績情報インタフェース]．“単価”
       ,NVL(T_INSPC_ACPT_IF.INSPC_ACPT_AMOUNT,0) AS INSPC_ACPT_AMOUNT               --[検収実績情報インタフェース]．“検収金額”
       ,NVL(T_INSPC_ACPT_IF.DISC_AMOUNT,0) AS DISC_AMOUNT                           --[検収実績情報インタフェース]．“値引き金額”
       ,T_INSPC_ACPT_IF.PLANT_CD                                                    --[検収実績情報インタフェース]．“工場コード”
       ,M_VEND_CTRL.CUR_CD                                                          --[取引先].”取引通貨コード”
       ,M_VEND_CTRL.EXCH_TYP                                                        --[取引先].”為替種別”
       ,M_VEND_CTRL.ROUND_TYP                                                       --[取引先].“発注金額まるめ区分”
       ,T_ACPT_RSLT.TAX_CD                                                          --[受入実績].”消費税コード”
       ,T_ACPT_RSLT.RATE_JUDGE_DATE                                                 --[受入実績].”レート判定日”
       ,NVL(T_ACPT_RSLT.EXCH_RATE,0) AS EXCH_RATE                                   --[受入実績].”為替レート”
       ,NVL(T_ACPT_RSLT.TAX_RATE_1,0) AS TAX_RATE_1                                 --[受入実績].”税率1”
       ,NVL(T_ACPT_RSLT.TAX_RATE_2,0) AS TAX_RATE_2                                 --[受入実績].”税率２”
       ,NVL(T_ACPT_RSLT.TAX_RATE_3,0) AS TAX_RATE_3                                 --[受入実績].”税率３”
       ,M_CUR.DECIMAL_FIG                                                           --[通貨].”小数桁数”
       ,M_ITEM.ITEM_NAME                                                            --[品目].”品目名”
       ,M_ITEM.STOCK_UNIT                                                           --[品目].”計量単位“
       ,DECODE(T_RLSD_PUCH_ODR.NON_NO_ITEM_FLG,0,M_ITEM.ITEM_NAME,T_RLSD_PUCH_ODR.NON_NO_ITEM_NAME) AS NON_NO_ITEM_NAME   
                                                                                    --[発注残].”備品発注品目名”
       ,T_RLSD_PUCH_ODR.NON_NO_ITEM_FLG                                             --[発注残].”備品発注フラグ”
       ,NVL(T_INSPC_ACPT_IF.UNIT_COST,0) * NVL(T_INSPC_ACPT_IF.INSPC_ACPT_QTY,0) AS UNIT_AMOUNT    
                                                                                    --本体金額計算＝単価×検収数
       ,DECODE(SUBSTR(T_ACPT_RSLT.TAX_CD,-1,1),'1','1','5','2','0') AS TAX_CD_1     --消費税のチェック
       ,T_INSPC_ACPT_IF.UNIT_COST_TYP                                               --[検収実績情報インタフェース]．”単価区分“
       ,NVL2(T_RLSD_PUCH_ODR.WORK_IN_PROC_CD, M_SBCNT_UNIT_COST_H.VEND_ITEM_CD, M_PUCH_UNIT_COST_H.VEND_ITEM_CD) AS VEND_ITEM_CD
                                                                                    --取引先品目番号
       ,T_RLSD_PUCH_ODR.ODR_CANCEL_SLIP_ISS_FLG AS ODR_CANCEL_SLIP_ISS_FLG          --注文取消伝票発行フラグ
       ,T_INSPC_ACPT_IF.CRCT_TYP                                                    --訂正区分
       ,0    AS RTN_FLG                                                             --返品プラグ
    FROM T_INSPC_ACPT_IF                                                            
        ,M_VEND_CTRL 
        ,T_ACPT_RSLT
        ,M_ITEM 
        ,M_CUR
        ,T_RLSD_PUCH_ODR
        ,M_PUCH_UNIT_COST_H
        ,M_SBCNT_UNIT_COST_H
    WHERE 
        T_INSPC_ACPT_IF.PUCH_ODR_CD = T_RLSD_PUCH_ODR.PUCH_ODR_CD
    AND T_INSPC_ACPT_IF.VEND_CD = M_VEND_CTRL.VEND_CD
    AND T_INSPC_ACPT_IF.ACPT_NO = T_ACPT_RSLT.ACPT_NO
    AND T_INSPC_ACPT_IF.ITEM_CD = M_ITEM.ITEM_CD(+)
    AND M_VEND_CTRL.CUR_CD = M_CUR.CUR_CD
    AND T_INSPC_ACPT_IF.PUCH_ODR_CD = T_ACPT_RSLT.PUCH_ODR_CD
    AND T_INSPC_ACPT_IF.COMPANY_CD = M_VEND_CTRL.COMPANY_CD
    AND T_INSPC_ACPT_IF.APPR_FLG = 3
    AND T_INSPC_ACPT_IF.AI_AP_IF_FLG = 0
    AND T_INSPC_ACPT_IF.PUCH_RTN_FLG = 0
    AND T_RLSD_PUCH_ODR.VEND_CD = M_PUCH_UNIT_COST_H.VEND_CD(+)
    AND T_RLSD_PUCH_ODR.PLANT_CD = M_PUCH_UNIT_COST_H.PLANT_CD(+)
    AND T_RLSD_PUCH_ODR.COMPANY_CD = M_PUCH_UNIT_COST_H.COMPANY_CD(+)
    AND T_RLSD_PUCH_ODR.ITEM_CD = M_PUCH_UNIT_COST_H.ITEM_CD(+)
    AND T_RLSD_PUCH_ODR.VEND_CD = M_SBCNT_UNIT_COST_H.VEND_CD(+)
    AND T_RLSD_PUCH_ODR.PLANT_CD = M_SBCNT_UNIT_COST_H.PLANT_CD(+)
    AND T_RLSD_PUCH_ODR.COMPANY_CD = M_SBCNT_UNIT_COST_H.COMPANY_CD(+)
    AND T_RLSD_PUCH_ODR.ITEM_CD = M_SBCNT_UNIT_COST_H.ITEM_CD(+)
    AND T_RLSD_PUCH_ODR.WORK_IN_PROC_CD = M_SBCNT_UNIT_COST_H.PROC_CD(+)
UNION
    SELECT
        T_INSPC_ACPT_IF.PUCH_ODR_CD                                                 --[検収実績情報インタフェース]．”発注番号“
       ,T_INSPC_ACPT_IF.ACPT_NO                                                     --[検収実績情報インタフェース]．“受入回数”
       ,T_INSPC_ACPT_IF.INSPC_ACPT_NO                                               --[検収実績情報インタフェース]．“検収番号”
       ,T_INSPC_ACPT_IF.ITEM_CD                                                     --[検収実績情報インタフェース]．”品目番号“
       ,T_INSPC_ACPT_IF.INSPC_ACPT_DATE                                             --[検収実績情報インタフェース]．”検収日”
       ,T_INSPC_ACPT_IF.VEND_CD                                                     --[検収実績情報インタフェース]．”取引先コード”
       ,NVL(T_INSPC_ACPT_IF.INSPC_ACPT_QTY,0) AS INSPC_ACPT_QTY                     --[検収実績情報インタフェース]．”検収数”
       ,NVL(T_INSPC_ACPT_IF.UNIT_COST,0) AS UNIT_COST                               --[検収実績情報インタフェース]．“単価”
       ,NVL(T_INSPC_ACPT_IF.INSPC_ACPT_AMOUNT,0) AS INSPC_ACPT_AMOUNT               --[検収実績情報インタフェース]．“検収金額”
       ,NVL(T_INSPC_ACPT_IF.DISC_AMOUNT,0) AS DISC_AMOUNT                           --[検収実績情報インタフェース]．“値引き金額”
       ,T_INSPC_ACPT_IF.PLANT_CD                                                    --[検収実績情報インタフェース]．“工場コード”
       ,M_VEND_CTRL.CUR_CD                                                          --[取引先].”取引通貨コード”
       ,M_VEND_CTRL.EXCH_TYP                                                        --[取引先].”為替種別”
       ,M_VEND_CTRL.ROUND_TYP                                                       --[取引先].”発注金額まるめ区分”
       ,T_PUCH_ODR_RTN_RSLT.TAX_CD                                                  --[購入返品].”消費税コード”
       ,T_PUCH_ODR_RTN_RSLT.PUCH_RTN_DATE                                           --[購入返品].”レート判定日”
       ,NVL(T_PUCH_ODR_RTN_RSLT.EXCH_RATE,0)  AS EXCH_RATE                          --[購入返品].”為替レート”
       ,NVL(T_PUCH_ODR_RTN_RSLT.TAX_RATE_1,0) AS TAX_RATE_1                         --[購入返品].”税率1”
       ,NVL(T_PUCH_ODR_RTN_RSLT.TAX_RATE_2,0) AS TAX_RATE_2                         --[購入返品].”税率２”
       ,NVL(T_PUCH_ODR_RTN_RSLT.TAX_RATE_3,0) AS TAX_RATE_3                         --[購入返品].”税率３”
       ,M_CUR.DECIMAL_FIG                                                           --[通貨].”小数桁数”
       ,M_ITEM.ITEM_NAME                                                            --[品目].”品目名”
       ,M_ITEM.STOCK_UNIT                                                           --[品目].”計量単位“
       ,T_PUCH_ODR_RTN_RSLT.NON_NO_ITEM_NAME AS NON_NO_ITEM_NAME                    --[発注残].”備品発注品目名”
       ,T_PUCH_ODR_RTN_RSLT.NON_NO_ITEM_TYP                                         --[発注残].”備品発注フラグ”
       ,NVL(T_INSPC_ACPT_IF.UNIT_COST,0) * NVL(T_INSPC_ACPT_IF.INSPC_ACPT_QTY,0) AS UNIT_AMOUNT    
                                                                                    --本体金額計算＝単価×検収数
       ,DECODE(SUBSTR(T_PUCH_ODR_RTN_RSLT.TAX_CD,-1,1),'1','1','5','2','0') AS TAX_CD_1     
                                                                                    --消費税のチェック
       ,T_INSPC_ACPT_IF.UNIT_COST_TYP                                               --[検収実績情報インタフェース]．”単価区分“
       ,M_PUCH_UNIT_COST_H.VEND_ITEM_CD AS VEND_ITEM_CD                             --取引先品目番号
       ,T_PUCH_ODR_RTN_RSLT.RTN_DEL_FLG AS ODR_CANCEL_SLIP_ISS_FLG                  --取消フラグ              
       ,T_INSPC_ACPT_IF.CRCT_TYP                                                    --訂正区分
       ,1    AS RTN_FLG                                                             --返品プラグ
    FROM T_INSPC_ACPT_IF                                                            
        ,M_VEND_CTRL 
        ,T_PUCH_ODR_RTN_RSLT
        ,M_ITEM 
        ,M_CUR
        ,M_PUCH_UNIT_COST_H
    WHERE 
      T_INSPC_ACPT_IF.PUCH_ODR_CD = T_PUCH_ODR_RTN_RSLT.PUCH_ODR_CD
    AND T_INSPC_ACPT_IF.VEND_CD = M_VEND_CTRL.VEND_CD
    AND T_INSPC_ACPT_IF.ITEM_CD = M_ITEM.ITEM_CD(+)
    AND M_VEND_CTRL.CUR_CD = M_CUR.CUR_CD
    AND T_INSPC_ACPT_IF.COMPANY_CD = M_VEND_CTRL.COMPANY_CD
    AND T_INSPC_ACPT_IF.APPR_FLG = 3
    AND T_INSPC_ACPT_IF.AI_AP_IF_FLG = 0
    AND T_INSPC_ACPT_IF.PUCH_RTN_FLG = 1
    AND T_INSPC_ACPT_IF.VEND_CD = M_PUCH_UNIT_COST_H.VEND_CD(+)
    AND T_INSPC_ACPT_IF.PLANT_CD = M_PUCH_UNIT_COST_H.PLANT_CD(+)
    AND T_INSPC_ACPT_IF.COMPANY_CD = M_PUCH_UNIT_COST_H.COMPANY_CD(+)
    AND T_INSPC_ACPT_IF.ITEM_CD = M_PUCH_UNIT_COST_H.ITEM_CD(+)
    ) ORDER BY PUCH_ODR_CD,ACPT_NO,INSPC_ACPT_NO

    ;
BEGIN
     /* LogFile の OPEN */
    blnRet :=  FNCLOGOPEN(pvc2OutputPath, pvc2OutputName,pvc2PlantCd, pvc2OutputMode, UTL_FileHandle);

    /* TraceLogの出力(Start)処理を行う */
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_START);
                          
    IF (NOT blnRet) THEN        
        --//結果ステータスが異常をセットする
        pnumStatus := STATUS_ERROR;
        RAISE excFncTraceLog;
    END IF;

    /* 業務開始メッセージの出力 */
    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_START,LOGMSG_STR_MESSAGE);
    
    --//カウンタ、変数の初期化
    numSuccessCount:= 0;
    numErrCount    := 0;
    numTotalCount  := 0;
    numWarnCount   := 0;
    numOffsetCount := 0;
    numZeroCount   := 0;

    --//共通引数チェック
    --ＬＯＧモード
    IF pvc2LogMode IS NULL THEN
        pnumStatus := STATUS_ERROR;
        RAISE excCommonChk;
    END IF;
    
    --出力モード
    IF pvc2OutputMode IS NULL THEN
        pnumStatus := STATUS_ERROR;
        RAISE excCommonChk;
    END IF;
    
    --出力ファイルパス
    IF pvc2OutputPath IS NULL THEN
        pnumStatus := STATUS_ERROR;
        RAISE excCommonChk;
    END IF;
    
    --出力ファイル名
    IF pvc2OutputName IS NULL THEN
        pnumStatus := STATUS_ERROR;
        RAISE excCommonChk;
    END IF;
    
    --ユーザＩＤ
    IF pvc2UserId IS NULL THEN
        pnumStatus := STATUS_ERROR;
        RAISE excCommonChk;
    END IF;
    
    --業務名
    IF pvc2BusinessName IS NULL THEN
        pnumStatus := STATUS_ERROR;
        RAISE excCommonChk;
    END IF;
    
    --工場コード
    IF pvc2PlantCd IS NULL THEN
        pnumStatus := STATUS_ERROR;
        RAISE excCommonChk;
    END IF;
    
    --//仮単価データ送信判断フラグ取得
    BEGIN
        SELECT
            VALUE                                                --設定値
        INTO
            wvc2Value                                            --設定値
        FROM
            SYS_PARAMETER                                        --パラメータ
        WHERE
            NAME = 'UNIT_COST_TYP_FLG';                          --名前
    EXCEPTION
        WHEN OTHERS THEN
            wvc2Value := '';
    END;
    
    --//買掛をロックする
    OPEN CUR_T_AI_AP_IF_LOCK;

    FOR Rec_T_INSPC_ACPT_IF IN CUR_T_INSPC_ACPT_IF LOOP
        numTotalCount := numTotalCount+1;
        wblnErrorFlg   := FALSE;
        wblnWarnFlg    := FALSE;
        wnumOFFSETFlg:= 0;
        wnumINSERTCK:=0;
        BEGIN
           --①.”品目番号“　IS　NULL　場合
           IF Rec_T_INSPC_ACPT_IF.ITEM_CD IS NULL THEN
                vc2Comment:= SUBSTR('(SBM0352)品目番号が空白　発注番号['|| Rec_T_INSPC_ACPT_IF.PUCH_ODR_CD || ']' ||
                             ' 受入回数[' || Rec_T_INSPC_ACPT_IF.ACPT_NO || ']' ||
                             ' 検収番号[' || Rec_T_INSPC_ACPT_IF.INSPC_ACPT_NO  || ']'  ,
                             1,256);

                 /* TraceLog の出力 */
                 blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                                       pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_ITEM_CD_NULL);

                /* 業務終了メッセージの出力 */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                    pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_ITEM_CD_NULL, vc2Comment);
                wnumINSERT := 0;     --登録フラグ＝０　未登録
                wblnErrorFlg := TRUE;
                GOTO MASK;
           ELSE
               --//②[F99．4．3取得データ]．”単価区分“　＝　１仮単価　且つ　仮単価データ送信判断フラグ＝０（仮単価データを送信しない）　場合
               IF Rec_T_INSPC_ACPT_IF.UNIT_COST_TYP = 1 AND wvc2Value = '0' THEN
                   vc2Comment:= SUBSTR('(SBM0353)仮単価データエラー　発注番号['|| Rec_T_INSPC_ACPT_IF.PUCH_ODR_CD||']' ||
                                       ' 受入回数[' || Rec_T_INSPC_ACPT_IF.ACPT_NO || ']'  ||
                                       ' 検収番号[' || Rec_T_INSPC_ACPT_IF.INSPC_ACPT_NO   || ']'  ,
                                        1,256);

                   /* TraceLog の出力 */
                   blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                                         pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_PARAM_ERR);

                   /* 業務終了メッセージの出力 */
                   blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                       pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_PARAM_ERR, vc2Comment);

                   wblnErrorFlg := TRUE;
                   wnumINSERT:= 0;--登録フラグ＝０　未登録
                   GOTO MASK;
                   
               END IF;
               --//③	[F99．4．3取得データ]．”単価区分“　＝　１仮単価　且つ　仮単価データ送信判断フラグ＝１（仮単価データを送信する）　場合
               IF Rec_T_INSPC_ACPT_IF.UNIT_COST_TYP = 1 AND wvc2Value = '1' THEN
                   vc2Comment:= SUBSTR('(SBM0354)仮単価データワーニング　発注番号['|| Rec_T_INSPC_ACPT_IF.PUCH_ODR_CD||']' ||
                                       ' 受入回数[' || Rec_T_INSPC_ACPT_IF.ACPT_NO || ']'  ||
                                       ' 検収番号[' || Rec_T_INSPC_ACPT_IF.INSPC_ACPT_NO   || ']'  ,
                                        1,256);

                   /* TraceLog の出力 */
                   blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                                         pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_PARAM_WAR);

                   /* 業務終了メッセージの出力 */
                   blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                       pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_PARAM_WAR, vc2Comment);

                   wblnWarnFlg  := TRUE;

               END IF;
               --③	本体金額計算
               blnRet := FNCGETROUND4FD(
                                       UTL_FileHandle                                    --ファイルハンドル
                                       ,pvc2LogMode                                      --ＬＯＧモード
                                       ,pvc2OutputMode                                   --出力モード
                                       ,pvc2UserId                                       --ユーザＩＤ
                                       ,pvc2BusinessName                                 --業務名
                                       ,pvc2PlantCd                                      --工場コード
                                       ,Rec_T_INSPC_ACPT_IF.UNIT_AMOUNT                  --本体金額
                                       ,Rec_T_INSPC_ACPT_IF.DECIMAL_FIG                  --小数桁数
                                       ,Rec_T_INSPC_ACPT_IF.ROUND_TYP                    --発注金額まるめ区分
                                       ,wnumUnitAmount                                   --本体金額計算
                                       ,pvc2ErrorCd                                      --エラーメッセージID
                                       ,pnumStatus                                       --結果ステータス（1：正常終了 2:警告終了 3：異常終了）
               );
               --異常
               IF pnumStatus = 3 OR blnRet = FALSE THEN
                   vc2Comment:= SUBSTR('(SBM0355)本体金額計算異常　発注番号['|| Rec_T_INSPC_ACPT_IF.PUCH_ODR_CD || ']'  ||
                                ' 受入回数[' || Rec_T_INSPC_ACPT_IF.ACPT_NO || ']'  ||
                                ' 検収番号[' || Rec_T_INSPC_ACPT_IF.INSPC_ACPT_NO   || ']'  ,
                                1,256);
                    /* TraceLog の出力 */
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                                          pvc2PlantCd, MY_SQL_NAME, vc2Comment);
                                 
                   /* 業務終了メッセージの出力 */
                   blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                       pvc2PlantCd, MY_SQL_NAME, pvc2ErrorCd,vc2Comment);

                   wblnErrorFlg := TRUE;
                   GOTO MASK;
               END IF;
               
               --ワーニング
               IF pnumStatus = 2 THEN
                   vc2Comment:= SUBSTR('(SBM0356)本体金額計算ワーニング　発注番号['|| Rec_T_INSPC_ACPT_IF.PUCH_ODR_CD || ']'  ||
                                ' 受入回数[' || Rec_T_INSPC_ACPT_IF.ACPT_NO || ']'  ||
                                ' 検収番号[' || Rec_T_INSPC_ACPT_IF.INSPC_ACPT_NO   || ']'  ,
                                1,256);

                    /* TraceLog の出力 */
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                                          pvc2PlantCd, MY_SQL_NAME, vc2Comment);

                   /* 業務終了メッセージの出力 */
                   blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                          pvc2PlantCd, MY_SQL_NAME, pvc2ErrorCd,vc2Comment);

                   wblnWarnFlg := TRUE;

               END IF;
               
               --⑥	金額計算
               wnumAmount :=wnumUnitAmount - Rec_T_INSPC_ACPT_IF.DISC_AMOUNT;

               --④	検収金額、税抜検収金額、外税対象金額、外税消費税、内税対象金額、内税消費税、非課税対象金額の計算共通部品
               blnRet := FncCalcTaxCalcAmtFD(
                                       UTL_FileHandle                                    --ファイルハンドル
                                       ,pvc2LogMode                                      --ＬＯＧモード
                                       ,pvc2OutputMode                                   --出力モード
                                       ,pvc2UserId                                       --ユーザＩＤ
                                       ,pvc2BusinessName                                 --業務名
                                       ,pvc2PlantCd                                      --工場コード
                                       ,SUBSTR(Rec_T_INSPC_ACPT_IF.TAX_CD,-1,1)          --消費税コードの下１桁本体金額
                                       ,Rec_T_INSPC_ACPT_IF.TAX_RATE_1                   --税率1
                                       ,Rec_T_INSPC_ACPT_IF.TAX_RATE_2                   --税率2
                                       ,Rec_T_INSPC_ACPT_IF.TAX_RATE_3                   --税率3
                                       ,Rec_T_INSPC_ACPT_IF.ROUND_TYP                    --発注金額まるめ区分
                                       ,Rec_T_INSPC_ACPT_IF.DECIMAL_FIG                  --小数桁数
                                       ,wnumAmount                                       --計算された金額
                                       ,wnumTaxAmount1                                   --税額1
                                       ,wnumTaxAmount2                                   --税額2
                                       ,wnumTaxAmount3                                   --税額3
                                       ,wnumTaxOutAmount                                 --税抜金額
                                       ,wnumTaxAmount                                    --消費税額
                                       ,wnumTaxInAmount                                  --税込金額
                                       ,wnumExternalTaxSalesAmount                       --外税対象金額
                                       ,wnumInternalTaxSalesAmount                       --内税対象金額
                                       ,wnumTaxFreeSalesAmount                           --非課税対象金額
                                       ,wnumExternalTaxAmount                            --消費税額（外税）
                                       ,wnumInternalTaxAmount                            --消費税額（内税）             
                                       ,pvc2ErrorCd                                      --エラーメッセージID
                                       ,pnumStatus                                       --結果ステータス（1：正常終了 2:警告終了 3：異常終了）
               );

               --異常
               IF pnumStatus = 3 OR blnRet = FALSE THEN
                   vc2Comment:= SUBSTR('(SBM0357)税計算異常　発注番号['|| Rec_T_INSPC_ACPT_IF.PUCH_ODR_CD || ']'  ||
                                ' 受入回数[' || Rec_T_INSPC_ACPT_IF.ACPT_NO || ']'  ||
                                ' 検収番号[' || Rec_T_INSPC_ACPT_IF.INSPC_ACPT_NO   || ']'  ,
                                1,256);
                    /* TraceLog の出力 */
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                                          pvc2PlantCd, MY_SQL_NAME, vc2Comment);
                                 
                   /* 業務終了メッセージの出力 */
                   blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                          pvc2PlantCd, MY_SQL_NAME, pvc2ErrorCd,vc2Comment);


                   wblnErrorFlg := TRUE;
                   GOTO MASK;
               END IF;
               
               --ワーニング
               IF pnumStatus = 2 THEN
                   vc2Comment:= SUBSTR('(SBM0358)税計算計算ワーニング　発注番号['|| Rec_T_INSPC_ACPT_IF.PUCH_ODR_CD || ']'  ||
                                ' 受入回数[' || Rec_T_INSPC_ACPT_IF.ACPT_NO || ']'  ||
                                ' 検収番号[' || Rec_T_INSPC_ACPT_IF.INSPC_ACPT_NO   || ']'  ,
                                1,256);
                    /* TraceLog の出力 */
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                 MY_SQL_NAME, vc2Comment);
                                 
                   /* 業務終了メッセージの出力 */
                   blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                          pvc2PlantCd, MY_SQL_NAME, pvc2ErrorCd,vc2Comment);
                                          
                   wblnWarnFlg := TRUE;
                     
               END IF;
               
               --検収金額を取得する
               wnumInspcAmount :=  wnumTaxInAmount;

               
               --⑤	検収金額（邦貨）の計算
               --検収金額（邦貨）＝検収金額×為替レート               
                --端数処理共通部品
               blnRet := FNCGETROUND4FD(
                                       UTL_FileHandle                                    --ファイルハンドル
                                       ,pvc2LogMode                                      --ＬＯＧモード
                                       ,pvc2OutputMode                                   --出力モード
                                       ,pvc2UserId                                       --ユーザＩＤ
                                       ,pvc2BusinessName                                 --業務名
                                       ,pvc2PlantCd                                      --工場コード
                                       ,wnumInspcAmount * Rec_T_INSPC_ACPT_IF.EXCH_RATE  --検収金額×為替レート      
                                       ,Rec_T_INSPC_ACPT_IF.DECIMAL_FIG                  --小数桁数
                                       ,Rec_T_INSPC_ACPT_IF.ROUND_TYP                    --発注金額まるめ区分
                                       ,wnumInspcCurAmount                               --検収金額（邦貨）
                                       ,pvc2ErrorCd                                      --エラーメッセージID
                                       ,pnumStatus                                       --結果ステータス（1：正常終了 2:警告終了 3：異常終了）
               );
               --異常
               IF pnumStatus = 3 OR blnRet = FALSE THEN
                   vc2Comment:= SUBSTR('(SBM0359)検収金額（邦貨）計算異常　発注番号['        || Rec_T_INSPC_ACPT_IF.PUCH_ODR_CD              || ']'  ||
                                ' 受入回数[' || Rec_T_INSPC_ACPT_IF.ACPT_NO || ']'  ||
                                ' 検収番号['       || Rec_T_INSPC_ACPT_IF.INSPC_ACPT_NO     || ']'  ,
                                1,256);
                    /* TraceLog の出力 */
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                 MY_SQL_NAME, vc2Comment);
                                 
                   /* 業務終了メッセージの出力 */
                   blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                          pvc2PlantCd, MY_SQL_NAME, pvc2ErrorCd, vc2Comment);

                   wblnErrorFlg := TRUE;
                   GOTO MASK;
               END IF;
               
               --ワーニング
               IF pnumStatus = 2 THEN
                   vc2Comment:= SUBSTR('(SBM0360)検収金額（邦貨）計算ワーニング　　発注番号['|| Rec_T_INSPC_ACPT_IF.PUCH_ODR_CD || ']'  ||
                                ' 受入回数[' || Rec_T_INSPC_ACPT_IF.ACPT_NO || ']'  ||
                                ' 検収番号[' || Rec_T_INSPC_ACPT_IF.INSPC_ACPT_NO   || ']'  ,
                                1,256);
                    /* TraceLog の出力 */
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                 MY_SQL_NAME, vc2Comment);
                                 
                   /* 業務終了メッセージの出力 */
                   blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                          pvc2PlantCd, MY_SQL_NAME, pvc2ErrorCd,vc2Comment);

                    wblnWarnFlg := TRUE;

               END IF;
               
               --⑥	税抜検収金額（邦貨）の計算
               --税抜検収金額（邦貨）＝税抜検収金額×為替レート               
               --端数処理共通部品
               blnRet := FNCGETROUND4FD(
                                       UTL_FileHandle                                    --ファイルハンドル
                                       ,pvc2LogMode                                      --ＬＯＧモード
                                       ,pvc2OutputMode                                   --出力モード
                                       ,pvc2UserId                                       --ユーザＩＤ
                                       ,pvc2BusinessName                                 --業務名
                                       ,pvc2PlantCd                                      --工場コード
                                       ,wnumTaxOutAmount * Rec_T_INSPC_ACPT_IF.EXCH_RATE --税抜検収金額×為替レート      
                                       ,Rec_T_INSPC_ACPT_IF.DECIMAL_FIG                  --小数桁数
                                       ,Rec_T_INSPC_ACPT_IF.ROUND_TYP                    --発注金額まるめ区分
                                       ,wnumTaxCurAmount                                 --検収金額（邦貨）
                                       ,pvc2ErrorCd                                      --エラーメッセージID
                                       ,pnumStatus                                       --結果ステータス（1：正常終了 2:警告終了 3：異常終了）
               );
               --異常
               IF pnumStatus = 3 OR blnRet = FALSE THEN
                   vc2Comment:= SUBSTR('(SBM0361)税抜検収金額（邦貨）計算異常　発注番号['|| Rec_T_INSPC_ACPT_IF.PUCH_ODR_CD || ']'  ||
                                ' 受入回数[' || Rec_T_INSPC_ACPT_IF.ACPT_NO || ']'  ||
                                ' 検収番号[' || Rec_T_INSPC_ACPT_IF.INSPC_ACPT_NO   || ']'  ,
                                1,256);
                    /* TraceLog の出力 */
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                 MY_SQL_NAME, vc2Comment);
                                 
                   /* 業務終了メッセージの出力 */
                   blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                          pvc2PlantCd, MY_SQL_NAME, pvc2ErrorCd,vc2Comment);

                   wblnErrorFlg := TRUE;
                   GOTO MASK;
               END IF;
               
               --ワーニング
               IF pnumStatus = 2 THEN
                   vc2Comment:= SUBSTR('(SBM0362)税抜検収金額（邦貨）計算ワーニング　　発注番号['|| Rec_T_INSPC_ACPT_IF.PUCH_ODR_CD || ']'  ||
                                ' 受入回数[' || Rec_T_INSPC_ACPT_IF.ACPT_NO || ']'  ||
                                ' 検収番号[' || Rec_T_INSPC_ACPT_IF.INSPC_ACPT_NO   || ']'  ,
                                1,256);
                    /* TraceLog の出力 */
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                 MY_SQL_NAME, vc2Comment);
                                 
                   /* 業務終了メッセージの出力 */
                   blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                          pvc2PlantCd, MY_SQL_NAME, pvc2ErrorCd,vc2Comment);

                   wblnWarnFlg := TRUE;

               END IF;

               --前回入力伝票番号
               wnumINPUT_SLIP_CDWK:=wnumINPUT_SLIP_CD;

           --⑦[買掛情報インタフェース]へ登録する
               --赤黒データ相殺
               --前回処理データと同じ発注番号＆受入回数
               IF wvc2PUCH_ODR_CDWK =Rec_T_INSPC_ACPT_IF.PUCH_ODR_CD THEN
                   IF wnumACPT_NOWK=Rec_T_INSPC_ACPT_IF.ACPT_NO  THEN
                       IF  Rec_T_INSPC_ACPT_IF.RTN_FLG=0 THEN
                           --受入データ
                           --赤でデータ場合
                           IF Rec_T_INSPC_ACPT_IF.CRCT_TYP=1 THEN
                               IF wnumINSERT=1 THEN
                                   BEGIN
                                      DELETE T_AI_AP_IF WHERE INPUT_SLIP_CD= wnumINPUT_SLIP_CDWK;
                                   EXCEPTION                                                                                  
                                      WHEN OTHERS THEN
                                          vc2Comment:= SUBSTR('(SBM0363)買掛情報登録失敗　　発注番号['|| Rec_T_INSPC_ACPT_IF.PUCH_ODR_CD || ']'  ||
                                          ' 受入回数[' || Rec_T_INSPC_ACPT_IF.ACPT_NO      || ']'  ||
                                          ' 検収番号[' || Rec_T_INSPC_ACPT_IF.INSPC_ACPT_NO|| ']' || SQLERRM ,
                                          1,256);
                                          /* TraceLog の出力 */
                                          blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                                           pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                                           MY_SQL_NAME, LOGMSG_NM_AI_AP_IF_INS);
                                    
                                          /* 業務終了メッセージの出力 */
                                          blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                                 pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_AI_AP_IF_INS, vc2Comment);

                                          wblnErrorFlg := TRUE;
                                          GOTO MASK;
                                   END;
                                   wnumOFFSETFlg:=1;
                                   /*登録フラグセット*/
                                   wnumINSERT:=0;
                                   /*登録しないセット*/
                                   wnumINSERTCK:=1;
                               ELSE
                                   wnumOFFSETFlg :=2;
                                   /*登録フラグセット*/
                                   wnumINSERT:=0;
                                   /*登録しないセット*/
                                   wnumINSERTCK:=1;
                               END IF;
                           END IF;
                       ELSE
                           --返品データ
                           --赤でデータ場合
                           IF Rec_T_INSPC_ACPT_IF.CRCT_TYP=2 THEN
                               IF wnumINSERT=1 THEN
                                   BEGIN
                                      DELETE T_AI_AP_IF WHERE INPUT_SLIP_CD= wnumINPUT_SLIP_CDWK;
                                   EXCEPTION                                                                                  
                                      WHEN OTHERS THEN
                                          vc2Comment:= SUBSTR('(SBM0363)買掛情報登録失敗　　発注番号['|| Rec_T_INSPC_ACPT_IF.PUCH_ODR_CD || ']'  ||
                                          ' 受入回数[' || Rec_T_INSPC_ACPT_IF.ACPT_NO      || ']'  ||
                                          ' 検収番号[' || Rec_T_INSPC_ACPT_IF.INSPC_ACPT_NO|| ']' || SQLERRM ,
                                          1,256);
                                          /* TraceLog の出力 */
                                          blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                                           pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                                           MY_SQL_NAME, LOGMSG_NM_AI_AP_IF_INS);
                                    
                                          /* 業務終了メッセージの出力 */
                                          blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                                 pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_AI_AP_IF_INS, vc2Comment);

                                          wblnErrorFlg := TRUE;
                                          GOTO MASK;
                                   END;
                                   wnumOFFSETFlg:=1;
                                   /*登録フラグセット*/
                                   wnumINSERT:=0;
                                   /*登録しないセット*/
                                   wnumINSERTCK:=1;
                               ELSE
                                   wnumOFFSETFlg :=2;
                                   /*登録フラグセット*/
                                   wnumINSERT:=0;
                                   /*登録しないセット*/
                                   wnumINSERTCK:=1;
                               END IF;
                           END IF;
                       END IF;
                   END IF;
               END IF;

               --登録処理
               IF wnumINSERTCK=0 THEN
                   IF wnumInspcAmount<>0 THEN  
                       BEGIN
                       --入力伝票番号採番
                       SELECT SEQ_INPUTDENNO_DEBT.nextval 
                       INTO wnumINPUT_SLIP_CD
                       FROM DUAL;

                       INSERT INTO T_AI_AP_IF (
                                           INPUT_SLIP_CD                                                  --入力伝票番号
                                           ,SLIP_ROW_NO                                                   --伝票行番号
                                           ,PUCH_ODR_CD                                                   --発注番号
                                           ,ACPT_NO                                                       --受入回数
                                           ,PROCESS_TYP                                                   --処理区分
                                           ,SLIP_TYP                                                      --伝票区分
                                           ,INSPC_ACPT_DATE                                               --検収日
                                           ,VEND_CD                                                       --取引先コード
                                           ,PLANT_CD                                                      --工場コード
                                           ,CURRNCY_CD                                                    --通貨コード
                                           ,EXCH_TYP                                                      --為替種別
                                           ,EXCH_RATE                                                     --為替レート
                                           ,EXCH_RESERVE_CD                                               --為替予約コード
                                           ,TAX_CMP_TYP                                                   --税算出区分
                                           ,CLOSING_TYP                                                   --支払検収締区分
                                           ,SALES_TYP                                                     --取引区分
                                           ,ITEM_CD                                                       --品目番号
                                           ,ITEM_NAME                                                     --品目名称
                                           ,INSPC_ACPT_QTY                                                --検収数
                                           ,UNIT_CD                                                       --単位
                                           ,UNIT_COST                                                     --単価
                                           ,NET_AMOUNT                                                    --本体金額
                                           ,DISC_AMOUNT                                                   --値引き金額
                                           ,INSPC_ACPT_AMOUNT                                             --検収金額
                                           ,INSPC_ACPT_AMOUNT_EXCH_RATES                                  --検収金額（邦貨）
                                           ,TAX_CREDIT_AMOUNT                                             --税抜検収金額
                                           ,TAX_CREDIT_AMOUNT_EXCH_RATES                                  --税抜検収金額（邦貨）
                                           ,TAX_INT_EXT_TYP                                               --消費税内外区分
                                           ,TAX_CD                                                        --消費税コード
                                           ,EXTERNAL_TAX_INSPC_ACPT_AMOUNT                                --外税対象金額
                                           ,EXTERNAL_TAX_AMOUNT                                           --外税消費税
                                           ,INTERNAL_TAX_INSPC_ACPT_AMOUNT                                --内税対象金額
                                           ,INTERNAL_TAX_AMOUNT                                           --内税消費税
                                           ,TAXFREE_INSPC_ACPT_AMOUNT                                     --非課税対象金額
                                           ,PUCH_TYP                                                      --仕入計上区分
                                           ,ARRIVAL_ITEM_TYP                                              --入荷区分
                                           ,STOCK_CTRL_TYP                                                --在庫管理区分
                                           ,PAY_COND_TYP                                                  --支払条件指定区分
                                           ,TAX_CALC_TYP                                                  --消費税計算指示区分
                                           ,VEND_ITEM_CD                                                  --取引先品目番号
                                           ,RETRIEVE_FLG                                                  --AIシステム取込フラグ
                                           ,CREATED_DATE                                                  --作成日
                                           ,CREATED_BY                                                    --作成者
                                           ,CREATED_PRG_NM                                                --作成プログラム名
                                           ,UPDATED_DATE                                                  --更新日
                                           ,UPDATED_BY                                                    --更新者
                                           ,UPDATED_PRG_NM                                                --更新プログラム名
                                           ,MODIFY_COUNT                                                  --更新数
                                           )
                                      VALUES(
                                             wnumINPUT_SLIP_CD                                            --採番された伝票番号
                                            ,1                                                            --１
                                            ,Rec_T_INSPC_ACPT_IF.PUCH_ODR_CD                              --発注番号
                                            ,Rec_T_INSPC_ACPT_IF.ACPT_NO                                  --受入回数
                                            ,0                                                            --0(伝票追加)
                                            ,10                                                          --10(仕入)
                                            ,Rec_T_INSPC_ACPT_IF.INSPC_ACPT_DATE                          --検収日
                                            ,Rec_T_INSPC_ACPT_IF.VEND_CD                                  --取引先コード
                                            ,Rec_T_INSPC_ACPT_IF.PLANT_CD                                 --工場コード
                                            ,Rec_T_INSPC_ACPT_IF.CUR_CD                                   --通貨コード
                                            ,Rec_T_INSPC_ACPT_IF.EXCH_TYP                                 --為替種別
                                            ,Rec_T_INSPC_ACPT_IF.EXCH_RATE                                --為替レート
                                            ,NULL                                                         --NULL
                                            ,1                                                            --１（明細）
                                            ,2                                                            --「2：即時」に固定
                                            ,NULL                                                         --NULL
                                            ,Rec_T_INSPC_ACPT_IF.ITEM_CD                                  --品目番号
                                            ,Rec_T_INSPC_ACPT_IF.NON_NO_ITEM_NAME                         --備品発注フラグ＝0 通常発注場合 品目名,備品発注フラグ＝1 備品発注場合 備品発注品目名
                                            ,Rec_T_INSPC_ACPT_IF.INSPC_ACPT_QTY                           --検収数
                                            ,Rec_T_INSPC_ACPT_IF.STOCK_UNIT                               --計量単位
                                            ,Rec_T_INSPC_ACPT_IF.UNIT_COST                                --単価
                                            ,wnumUnitAmount                                               --③で計算された本体金額
                                            ,Rec_T_INSPC_ACPT_IF.DISC_AMOUNT                              --値引き金額
                                            ,wnumInspcAmount                                              --④で計算された検収金額
                                            ,wnumInspcCurAmount                                           --⑤で計算された検収金額（邦貨）
                                            ,wnumTaxOutAmount                                             --④で計算された税抜検収金額
                                            ,wnumTaxCurAmount                                             --⑥で計算された税抜検収金額（邦貨）
                                            ,Rec_T_INSPC_ACPT_IF.TAX_CD_1                                 --消費税コードの下１桁＝1:外税の場合 １（外税）,消費税コードの下１桁＝5:内税の場合 2（内税）,消費税コードの下１桁≠1:外税,5:内税、の場合 ,0（非課税）
                                            ,Rec_T_INSPC_ACPT_IF.TAX_CD                                   --消費税コード
                                            ,wnumExternalTaxSalesAmount                                   --④で計算された外税対象金額
                                            ,wnumExternalTaxAmount                                        --④で計算された外税消費税
                                            ,wnumInternalTaxSalesAmount                                   --④で計算された内税対象金額
                                            ,wnumInternalTaxAmount                                        --④で計算された内税消費税
                                            ,wnumTaxFreeSalesAmount                                       --④で計算された非課税対象金額
                                            ,0                                                            --0（入荷）
                                            ,0                                                            --0（通常）
                                            ,1                                                            --1（在庫管理しない）
                                            ,0                                                            --0（条件指定）
                                            ,0                                                            --0（消費税計算しない）
                                            ,Rec_T_INSPC_ACPT_IF.VEND_ITEM_CD                             --取引先品目番号
                                            ,0                                                            --0：未取込
                                            ,SYSDATE                                                      --sysdate
                                            ,pvc2UserId                                                   --引数．ユーザＩＤ
                                            ,pvc2BusinessName                                             --引数．業務名
                                            ,SYSDATE                                                      --sysdate
                                            ,pvc2UserId                                                   --引数．ユーザＩＤ
                                            ,pvc2BusinessName                                             --引数．業務名
                                            ,0                                                            --0
                                            )                                                              
                                            ;                                                              

                       EXCEPTION                                                                                  
                           WHEN OTHERS THEN
                               vc2Comment:= SUBSTR('(SBM0363)買掛情報登録失敗　　発注番号['|| Rec_T_INSPC_ACPT_IF.PUCH_ODR_CD || ']'  ||
                                    ' 受入回数[' || Rec_T_INSPC_ACPT_IF.ACPT_NO      || ']'  ||
                                    ' 検収番号[' || Rec_T_INSPC_ACPT_IF.INSPC_ACPT_NO|| ']' || SQLERRM ,
                                    1,256);
                                
                               /* TraceLog の出力 */
                               blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                    MY_SQL_NAME, LOGMSG_NM_AI_AP_IF_INS);
                                    
                               /* 業務終了メッセージの出力 */
                               blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                             pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_AI_AP_IF_INS, vc2Comment);

                               wblnErrorFlg := TRUE;
                       GOTO MASK;
                       END;

                       /*登録フラグセット*/
                       wnumINSERT:=1;
                       wnumOFFSETFlg:=0;
                   ELSE 
                       wnumOFFSETFlg:=3;
                   END IF;
               END IF;
               
               --[検収実績情報インタフェース]の更新処理
               BEGIN
                   UPDATE T_INSPC_ACPT_IF SET
                         AI_AP_IF_FLG  =1
                        ,UPDATED_DATE  = SYSDATE
                        ,UPDATED_BY    = pvc2UserId
                        ,UPDATED_PRG_NM= pvc2BusinessName
                        ,MODIFY_COUNT  = MODIFY_COUNT + 1
                   WHERE PUCH_ODR_CD  = Rec_T_INSPC_ACPT_IF.PUCH_ODR_CD
                    AND ACPT_NO       = Rec_T_INSPC_ACPT_IF.ACPT_NO
                    AND INSPC_ACPT_NO <= Rec_T_INSPC_ACPT_IF.INSPC_ACPT_NO
                    AND AI_AP_IF_FLG  = 0
                    AND APPR_FLG = 3
                   ;
               EXCEPTION
                   WHEN OTHERS THEN
                       vc2Comment:= SUBSTR('(SBM0366)検収実績情報更新失敗　　発注番号['|| Rec_T_INSPC_ACPT_IF.PUCH_ODR_CD || ']'  ||
                                ' 受入回数[' || Rec_T_INSPC_ACPT_IF.ACPT_NO      || ']'  ||
                                ' 検収番号[' || Rec_T_INSPC_ACPT_IF.INSPC_ACPT_NO|| ']' || SQLERRM ,
                                1, 256);
                                
                       /* TraceLog の出力 */
                       blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                    MY_SQL_NAME, LOGMSG_NM_INSPC_ACPT_UPD);
                                    
                       /* 業務終了メッセージの出力 */
                       blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                             pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_INSPC_ACPT_UPD, vc2Comment);

                       wblnErrorFlg := TRUE;
                       GOTO MASK;
               END;
           END IF;
           wvc2PUCH_ODR_CDWK:=Rec_T_INSPC_ACPT_IF.PUCH_ODR_CD;   --前回発注計画番号  
           wnumACPT_NOWK    :=Rec_T_INSPC_ACPT_IF.ACPT_NO;       --前回受入回数  
<<MASK>>
            IF wblnErrorFlg = TRUE THEN
                numErrCount := numErrCount + 1;
                wnumSTSFlg :=2;
            ELSE
                IF wblnWarnFlg = TRUE THEN
                    IF wnumOFFSETFlg=0 THEN
                        numWarnCount := numWarnCount + 1;
                    ELSE 
                        IF wnumOFFSETFlg=1 THEN
                            IF wnumSTSFlg=0 THEN 
                                numSuccessCount :=numSuccessCount-1;
                            ELSE
                                IF wnumSTSFlg=1 THEN 
                                    numWarnCount :=numWarnCount -1;
                                ELSE 
                                    numWarnCount :=numWarnCount;
                                END IF;
                            END IF;
                        ELSE
                            IF wnumOFFSETFlg = 3 THEN
                                numZeroCount :=numZeroCount+1;
                            ELSE
                                numWarnCount := numWarnCount;
                            END IF;
                        END IF;
                    END IF;
                    wnumSTSFlg :=1;
                ELSE
                    IF wnumOFFSETFlg=0 THEN
                        numSuccessCount := numSuccessCount + 1;
                    ELSE 
                        IF wnumOFFSETFlg=1 THEN
                            IF wnumSTSFlg=0 THEN 
                                numSuccessCount :=numSuccessCount-1;
                            ELSE 
                                IF wnumSTSFlg=1 THEN 
                                    numWarnCount :=numWarnCount -1;
                                ELSE 
                                    numSuccessCount := numSuccessCount;
                                END IF;
                            END IF;
                        ELSE 
                            IF wnumOFFSETFlg=3 THEN
                                numZeroCount :=numZeroCount+1;
                            ELSE
                                numSuccessCount := numSuccessCount;
                            END IF;
                        END IF;
                    END IF;
                    wnumSTSFlg :=0;
               END IF;
            END IF;

        EXCEPTION
            WHEN OTHERS THEN                
               /* TraceLog の出力 */
               blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                                     pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_READ_DATA);
                            
               /* 業務終了メッセージの出力 */
               blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                   pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_READ_DATA, SQLERRM);
        END;
    END LOOP;
    
    IF CUR_T_AI_AP_IF_LOCK%ISOPEN THEN
        CLOSE CUR_T_AI_AP_IF_LOCK;
    END IF;
    
    --正常の場合
    numOffsetCount:=numTotalCount-numSuccessCount-numWarnCount-numErrCount-numZeroCount;

    vc2Comment:= SUBSTR('(SBM0367)<< Ａｉ連携買掛インタフェース処理正常終了>>　対象件数：['|| numTotalCount || ']'  ||
                                ' 正常件数：[' || numSuccessCount || ']'  ||
                                ' ワーニング件数：[' || numWarnCount || ']' || 
                                ' 異常件数：[' || numErrCount ||  ']' ||
                                ' 検収金額=0データ件数：[' ||  numZeroCount ||  ']' ||
                                ' 相殺データ件数：[' ||  numOffsetCount ||  ']' ,
                                1,512);
     /* TraceLog の出力 */
     blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                           pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_SUCCESS);
                  
     /* 業務終了メッセージの出力 */
     blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                         pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_SUCCESS, vc2Comment);
     /* 正常終了 */
     pvc2ErrorCd := '';
     pnumStatus := STATUS_NORMAL;
     COMMIT;
EXCEPTION

    WHEN excFncTraceLog THEN
        ROLLBACK;        
        pnumStatus := STATUS_ERROR;
        /* LogFile の CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);
        
    WHEN excCommonChk THEN 
        ROLLBACK; 
        pnumStatus := STATUS_ERROR;
        pvc2ErrorCd:= LOGMSG_ID_COMMON_CHK;
        
        /* LogFile の CLOSE */
         /* TraceLog の出力 */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                              pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_COMMON_CHK);

        /* 業務終了メッセージの出力 */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                            pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_COMMON_CHK,LOGMSG_NM_COMMON_CHK);
                            
        /* LogFile の CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle); 
    WHEN OTHERS THEN
        ROLLBACK;  
        pnumStatus := STATUS_ERROR;
        IF CUR_T_AI_AP_IF_LOCK%ISOPEN THEN
            CLOSE CUR_T_AI_AP_IF_LOCK;
        END IF;
        --異常処理
        vc2Comment:= SUBSTR('(SBM0368)<<Ａｉ連携買掛インタフェース処理異常終了>>　',
                                1,256);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                              pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_END_ERR);
                     
        /* 業務終了メッセージの出力 */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                            pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_END_ERR, vc2Comment);
        /* LogFile の CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle); 
END;
/
