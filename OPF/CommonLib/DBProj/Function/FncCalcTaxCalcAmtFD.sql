CREATE OR REPLACE FUNCTION FNCCALCTAXCALCAMTFD(
/*------------------------------------------------------------------------------
'
' FncCalcTaxCalcAmtFD.Sql
'
' 修正履歴
' 2006.11.07 新規作成
'
' 機能      : 税計算
'
' 戻り値    : Boolean
'               True :正常終了（結果ステータス=1:正常終了、2:警告終了）
'               False:異常終了（結果ステータス=3:異常終了）
'
' 引き数    :
'         -- SYSTEM共通
'             pFileHandle                  - (i)ファイルハンドル
'             pvc2LogMode                  - (i)ＬＯＧモード
'             pvc2OutputMode               - (i)出力モード
'             pvc2UserId                   - (i)ユーザＩＤ
'             pvc2BusinessName             - (i)業務名
'             pvc2PlantCd                  - (i)工場コード
'         -- 業務固有
'             pvc2TaxId                    - (i)課税方式
'             pnumTaxRate1                 - (i)税率1
'             pnumTaxRate2                 - (i)税率2
'             pnumTaxRate3                 - (i)税率3
'             pnumRoundTyp                 - (i)端数区分
'             pnumDecimalFlg               - (i)小数桁数
'             pnumAmountIn                 - (i)金額
'             pnumTaxAmount1               - (o)税額1
'             pnumTaxAmount2               - (o)税額2
'             pnumTaxAmount3               - (o)税額3
'             pnumTaxOutAmount             - (o)税抜金額
'             pnumTaxAmount                - (o)消費税額
'             pnumTaxInAmount              - (o)税込金額
'             pnumExternalTaxSalesAmount   - (o)外税対象金額
'             pnumInternalTaxSalesAmount   - (o)内税対象金額
'             pnumTaxFreeSalesAmount       - (o)非課税対象金額
'             pnumExternalTaxAmount        - (o)消費税額（外税）
'             pnumInternalTaxAmount        - (o)消費税額（内税）
'             pvc2ErrCd                    - (o)エラーコード
'             pnumStatus                   - (o)結果ステータス(1:正常終了、2:警告終了、3:異常終了)
' 機能説明  :課税方式、税率を元に消費税計算を行う。
'
' 備考      :
'
-----------------------------------------------------------------------------*/
    pFileHandle                 IN  UTL_FILE.FILE_TYPE  --ファイルハンドル
   ,pvc2LogMode                 IN  VARCHAR2            --ＬＯＧモード
   ,pvc2OutputMode              IN  VARCHAR2            --出力モード
   ,pvc2UserId                  IN  VARCHAR2            --ユーザＩＤ
   ,pvc2BusinessName            IN  VARCHAR2            --業務名
   ,pvc2PlantCd                 IN  VARCHAR2            --工場コード
   ,pvc2TaxId                   IN  VARCHAR2            --課税方式
   ,pnumTaxRate1                IN  NUMBER              --税率1
   ,pnumTaxRate2                IN  NUMBER              --税率2
   ,pnumTaxRate3                IN  NUMBER              --税率3
   ,pnumRoundTyp                IN  NUMBER              --端数区分
   ,pnumDecimalFlg              IN  NUMBER              --小数桁数
   ,pnumAmountIn                IN  NUMBER              --金額
   ,pnumTaxAmount1              OUT NUMBER              --税額1
   ,pnumTaxAmount2              OUT NUMBER              --税額2
   ,pnumTaxAmount3              OUT NUMBER              --税額3
   ,pnumTaxOutAmount            OUT NUMBER              --税抜金額
   ,pnumTaxAmount               OUT NUMBER              --消費税金額
   ,pnumTaxInAmount             OUT NUMBER              --税込金額
   ,pnumExternalTaxSalesAmount  OUT NUMBER              --外税対象金額
   ,pnumInternalTaxSalesAmount  OUT NUMBER              --内税対象金額
   ,pnumTaxFreeSalesAmount      OUT NUMBER              --非課税対象金額
   ,pnumExternalTaxAmount       OUT NUMBER              --消費税額（外税）
   ,pnumInternalTaxAmount       OUT NUMBER              --消費税額（内税）
   ,pvc2ErrCd                   OUT VARCHAR2            --エラーコード
   ,pnumStatus                  OUT NUMBER              --結果ステータス
    ) RETURN BOOLEAN
IS

/* 定数の宣言 */
    MY_SQL_NAME         VARCHAR2(64)     := 'FncCalcTaxCalcAmtFD';  --ＰＬ／ＳＱＬ名

    ROUND_TYP_ROUND     NUMBER(1)        := 1;                   --端数処理区分(1:四捨五入)
    ROUND_TYP_RAISE     NUMBER(1)        := 2;                   --端数処理区分(2:切り上げ)
    ROUND_TYP_OMIT      NUMBER(1)        := 3;                   --端数処理区分(3:切り捨て)

    TAX_ID_TAXFREE      VARCHAR2(1)      := '0';                 --課税方式(0:非課税)
    TAX_ID_TAXEXTERNAL  VARCHAR2(1)      := '1';                 --課税方式(1:外税)
    TAX_ID_TAXINTERNAL  VARCHAR2(1)      := '5';                 --課税方式(5:内税)
    TAX_ID_TAXUSERDEF   VARCHAR2(1)      := '9';                 --課税方式(9:ユーザ定義)

    LOGMSG_START        VARCHAR2(20)     := 'Start';             --ログ用メソッド開始宣言
    LOGMSG_END          VARCHAR2(12)     := 'End';               --ログ用メソッド終了宣言
--  LOGMSG_FUNC_ERR     VARCHAR2(32)     := 'FuncErr';           --ログ用メソッド関数エラー宣言
--  LOGMSG_PARM_ERR     VARCHAR2(32)     := 'ParamErr';          --ログ用メソッドパラメータエラー宣言

    STATUS_NORMAL     CONSTANT   NUMBER(01)     := 1;  -- 正常終了
    STATUS_WARNING    CONSTANT   NUMBER(01)     := 2;  -- 警告終了
    STATUS_ERROR      CONSTANT   NUMBER(01)     := 3;  -- 異常終了

    -- メッセージコード
    JF_COM_ERR_WRONG_VALUE                 VARCHAR(28)  := 'ZZ05105';               --値が不正です
    JF_COM_ERR_NOT_FOUND_M_TAX             VARCHAR(28)  := 'ZZ11004';               --消費税区分マスタが存在しません
    JF_COM_ERR_ORACLE_ERROR                VARCHAR(28)  := 'AC53401';               --ORACLEエラー

    TAX_CD_SIZE                   NUMBER(03)    := 3;        --消費税コード桁数

/* 変数の宣言 WORK */
    blnRet                          BOOLEAN;
    numWkTaxAmount1                 NUMBER(18,4)     := 0;               --税額1
    numWkTaxAmount2                 NUMBER(18,4)     := 0;               --税額2
    numWkTaxAmount3                 NUMBER(18,4)     := 0;               --税額3
    numWkTaxOutAmount               NUMBER(18,4)     := 0;               --税抜金額
    numWkTaxAmount                  NUMBER(18,4)     := 0;               --消費税金額
    numWkTaxInAmount                NUMBER(18,4)     := 0;               --税込金額
    numWkExternalTaxSalesAmount     NUMBER(18,4)     := 0;               --外税対象金額
    numWkInternalTaxSalesAmount     NUMBER(18,4)     := 0;               --内税対象金額
    numWkTaxFreeSalesAmount         NUMBER(18,4)     := 0;               --非課税対象金額
    numWkExternalTaxAmount          NUMBER(18,4)     := 0;               --消費税額（外税）
    numWkInternalTaxAmount          NUMBER(18,4)     := 0;               --消費税額（内税）
    vc2WkErrCd                      VARCHAR2(28)     := NULL;            --エラーコード
    numWKStatus                     NUMBER(1)        := STATUS_NORMAL;   --結果ステータス

    intWKRecCnt                     INTEGER(11)      := 0;               --レコード件数

    -- 例外の宣言
    excFnctionErr                EXCEPTION;          --「関数」エラー
    excParameterErr              EXCEPTION;          --「引数」エラー
--  excFncTraceLog               EXCEPTION;          --トレースログ出力エラー
--  excResultErr                 EXCEPTION;          --計算結果エラー
--  excNotFound                  EXCEPTION;          --マスタNOT FOUND

BEGIN
    pnumTaxAmount1                 :=  0;              --税額1
    pnumTaxAmount2                 :=  0;              --税額2
    pnumTaxAmount3                 :=  0;              --税額3
    pnumTaxOutAmount               :=  0;              --税抜金額
    pnumTaxAmount                  :=  0;              --消費税金額
    pnumTaxInAmount                :=  0;              --税込金額
    pnumExternalTaxSalesAmount     :=  0;              --外税対象金額
    pnumInternalTaxSalesAmount     :=  0;              --内税対象金額
    pnumTaxFreeSalesAmount         :=  0;              --非課税対象金額
    pnumExternalTaxAmount          :=  0;              --消費税額（外税）
    pnumInternalTaxAmount          :=  0;              --消費税額（内税）
    pnumStatus                     :=  STATUS_NORMAL;  --結果ステータス
    pvc2ErrCd                      :=  NULL;           --エラーコード

    /* TraceLog の出力 */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

    /* 引数チェック */

   -- 税率1 --
    IF (pnumTaxRate1 IS NULL) THEN  -- NULL
        RAISE excParameterErr;
    ELSIF pnumTaxRate1 = '' THEN    -- 空文字
       RAISE excParameterErr;
    END IF;

   -- 税率2 --
    IF (pnumTaxRate2 IS NULL) THEN  -- NULL
        RAISE excParameterErr;
    ELSIF pnumTaxRate2 = '' THEN    -- 空文字
       RAISE excParameterErr;
    END IF;

   -- 税率3 --
    IF (pnumTaxRate3 IS NULL) THEN  -- NULL
        RAISE excParameterErr;
    ELSIF pnumTaxRate3 = '' THEN    -- 空文字
       RAISE excParameterErr;
    END IF;

   -- 端数区分 --
    IF (pnumRoundTyp IS NULL) THEN  -- NULL
        RAISE excParameterErr;
    ELSIF pnumRoundTyp = '' THEN    -- 空文字
        RAISE excParameterErr;
    ELSIF pnumRoundTyp <> ROUND_TYP_ROUND        --四捨五入
        AND pnumRoundTyp <> ROUND_TYP_RAISE      --切り上げ
        AND pnumRoundTyp <> ROUND_TYP_OMIT THEN  --切捨て
        RAISE excParameterErr;
    END IF;

   -- 小数桁数 --
    IF (pnumDecimalFlg IS NULL) THEN  -- NULL
        RAISE excParameterErr;
    ELSIF pnumDecimalFlg = '' THEN    -- 空文字
        RAISE excParameterErr;
    END IF;

   -- 金額 --
    IF (pnumAmountIn IS NULL) THEN  -- NULL
        RAISE excParameterErr;
    ELSIF pnumAmountIn = '' THEN    -- 空文字
        RAISE excParameterErr;
    END IF;

    -- 課税方式 --
    IF (pvc2TaxId IS NULL) THEN  -- NULL
        RAISE excParameterErr;
    ELSIF pvc2TaxId = '' THEN    -- 空文字
        RAISE excParameterErr;
    /* 税計算 */
    ELSIF pvc2TaxId = TAX_ID_TAXFREE OR pvc2TaxId = TAX_ID_TAXUSERDEF THEN  /* 非課税・ユーザ定義 */
        numWkTaxOutAmount             := pnumAmountIn;                                  --税抜金額
        numWkTaxAmount1               := 0;                                             --税額1
        numWkTaxAmount2               := 0;                                             --税額2
        numWkTaxAmount3               := 0;                                             --税額3
        numWkExternalTaxSalesAmount   := 0;                                             --外税対象金額
        numWkInternalTaxSalesAmount   := 0;                                             --内税対象金額
        numWkTaxFreeSalesAmount       := numWkTaxOutAmount;                             --非課税対象金額
        numWkExternalTaxAmount        := 0;                                             --消費税額（外税）
        numWkInternalTaxAmount        := 0;                                             --消費税額（内税）
        numWkTaxAmount                := 0;                                             --消費税金額
        numWkTaxInAmount              := numWkTaxOutAmount + numWkTaxAmount;            --税込金額
    ELSIF pvc2TaxId = TAX_ID_TAXEXTERNAL THEN                               /* 外税 */
        numWkTaxOutAmount := pnumAmountIn;                                  --税抜金額
        /* 税額1 */
        blnRet := FncGetRound4FD(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              (pnumAmountIn * pnumTaxRate1) / 100, pnumDecimalFlg, pnumRoundTyp,
                              numWkTaxAmount1,
                              vc2WkErrCd, numWKStatus);                     --税額1(端数処理)
        IF Not blnRet THEN  --異常終了
            RAISE excFnctionErr;
        END IF;
        /* 税額2 */
        blnRet := FncGetRound4FD(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              (pnumAmountIn * pnumTaxRate2) / 100, pnumDecimalFlg, pnumRoundTyp,
                              numWkTaxAmount2,
                              vc2WkErrCd, numWKStatus);                     --税額2(端数処理)
        IF Not blnRet THEN  --異常終了
            RAISE excFnctionErr;
        END IF;
        /* 税額3 */
        blnRet := FncGetRound4FD(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              (pnumAmountIn * pnumTaxRate3) / 100, pnumDecimalFlg, pnumRoundTyp,
                              numWkTaxAmount3,
                              vc2WkErrCd, numWKStatus);                     --税額3(端数処理)
        IF Not blnRet THEN  --異常終了
            RAISE excFnctionErr;
        END IF;
        numWkExternalTaxSalesAmount   := numWkTaxOutAmount;                                     --外税対象金額
        numWkInternalTaxSalesAmount   := 0;                                                     --内税対象金額
        numWkTaxFreeSalesAmount       := 0;                                                     --非課税対象金額
        numWkExternalTaxAmount        := numWkTaxAmount1 + numWkTaxAmount2 + numWkTaxAmount3;   --消費税額（外税）
        numWkInternalTaxAmount        := 0;                                                     --消費税額（内税）
        numWkTaxAmount                := numWkExternalTaxAmount + numWkInternalTaxAmount;       --消費税金額
        numWkTaxInAmount              := numWkTaxOutAmount + numWkTaxAmount;                    --税込金額
    ELSIF pvc2TaxId = TAX_ID_TAXINTERNAL THEN                               /* 内税 */
        numWkTaxInAmount  := pnumAmountIn;                                  --税込金額
        /* 税額1 */
        blnRet := FncGetRound4FD(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              (pnumAmountIn * pnumTaxRate1) / (100 + pnumTaxRate1), pnumDecimalFlg, pnumRoundTyp,
                              numWkTaxAmount1,
                              vc2WkErrCd, numWKStatus);                     --税額1(端数処理)
        IF Not blnRet THEN  --異常終了
            RAISE excFnctionErr;
        END IF;
        /* 税額2 */
        blnRet := FncGetRound4FD(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              (pnumAmountIn * pnumTaxRate2) / (100 + pnumTaxRate2), pnumDecimalFlg, pnumRoundTyp,
                              numWkTaxAmount2,
                              vc2WkErrCd, numWKStatus);                     --税額2(端数処理)
        IF Not blnRet THEN  --異常終了
            RAISE excFnctionErr;
        END IF;
        /* 税額3 */
        blnRet := FncGetRound4FD(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              (pnumAmountIn * pnumTaxRate3) / (100 + pnumTaxRate3), pnumDecimalFlg, pnumRoundTyp,
                              numWkTaxAmount3,
                              vc2WkErrCd, numWKStatus);                     --税額3(端数処理)
        IF Not blnRet THEN  --異常終了
            RAISE excFnctionErr;
        END IF;
        numWkExternalTaxSalesAmount   := 0;                                                     --外税対象金額
        numWkInternalTaxSalesAmount   := numWkTaxInAmount;                                      --内税対象金額
        numWkTaxFreeSalesAmount       := 0;                                                     --非課税対象金額
        numWkExternalTaxAmount        := 0;                                                     --消費税額（外税）
        numWkInternalTaxAmount        := numWkTaxAmount1 + numWkTaxAmount2 + numWkTaxAmount3;   --消費税額（内税）
        numWkTaxAmount                := numWkExternalTaxAmount + numWkInternalTaxAmount;       --消費税金額
        numWkTaxOutAmount             := numWkTaxInAmount - numWkTaxAmount;                     --税抜金額
    ELSE
        RAISE excParameterErr;
    END IF;

    /* 返却値のセット */
    pnumTaxAmount1                    :=  numWkTaxAmount1;                --税額1
    pnumTaxAmount2                    :=  numWkTaxAmount2;                --税額2
    pnumTaxAmount3                    :=  numWkTaxAmount3;                --税額3
    pnumTaxOutAmount                  :=  numWkTaxOutAmount;              --税抜金額
    pnumTaxAmount                     :=  numWkTaxAmount;                 --消費税金額
    pnumTaxInAmount                   :=  numWkTaxInAmount;               --税込金額
    pnumExternalTaxSalesAmount        :=  numWkExternalTaxSalesAmount;    --外税対象金額
    pnumInternalTaxSalesAmount        :=  numWkInternalTaxSalesAmount;    --内税対象金額
    pnumTaxFreeSalesAmount            :=  numWkTaxFreeSalesAmount;        --非課税対象金額
    pnumExternalTaxAmount             :=  numWkExternalTaxAmount;         --消費税額（外税）
    pnumInternalTaxAmount             :=  numWkInternalTaxAmount;         --消費税額（内税）

    /* TraceLog の出力 */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    RETURN TRUE;

--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN excParameterErr THEN
        pnumTaxAmount1                 :=  0;                         --税額1
        pnumTaxAmount2                 :=  0;                         --税額2
        pnumTaxAmount3                 :=  0;                         --税額3
        pnumTaxOutAmount               :=  0;                         --税抜金額
        pnumTaxAmount                  :=  0;                         --消費税金額
        pnumTaxInAmount                :=  0;                         --税込金額
        pnumExternalTaxSalesAmount     :=  0;                         --外税対象金額
        pnumInternalTaxSalesAmount     :=  0;                         --内税対象金額
        pnumTaxFreeSalesAmount         :=  0;                         --非課税対象金額
        pnumExternalTaxAmount          :=  0;                         --消費税額（外税）
        pnumInternalTaxAmount          :=  0;                         --消費税額（内税）
        pnumStatus                     := STATUS_ERROR;               --結果ステータス
        pvc2ErrCd                      := JF_COM_ERR_WRONG_VALUE;     --エラーコード
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        RETURN FALSE;
/*    WHEN NO_DATA_FOUND THEN
        pnumTaxAmount1                 :=  0;                         --税額1
        pnumTaxAmount2                 :=  0;                         --税額2
        pnumTaxAmount3                 :=  0;                         --税額3
        pnumTaxOutAmount               :=  0;                         --税抜金額
        pnumTaxAmount                  :=  0;                         --消費税金額
        pnumTaxInAmount                :=  0;                         --税込金額
        pnumExternalTaxSalesAmount     :=  0;                         --外税対象金額
        pnumInternalTaxSalesAmount     :=  0;                         --内税対象金額
        pnumTaxFreeSalesAmount         :=  0;                         --非課税対象金額
        pnumExternalTaxAmount          :=  0;                         --消費税額（外税）
        pnumInternalTaxAmount          :=  0;                         --消費税額（内税）
        pnumStatus                     := STATUS_ERROR;               --結果ステータス
        pvc2ErrCd                      := JF_COM_ERR_NOT_FOUND_M_TAX; --エラーコード
        -- TraceLog の出力 --
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        RETURN FALSE; */
    WHEN excFnctionErr THEN
        pnumTaxAmount1                 :=  0;                         --税額1
        pnumTaxAmount2                 :=  0;                         --税額2
        pnumTaxAmount3                 :=  0;                         --税額3
        pnumTaxOutAmount               :=  0;                         --税抜金額
        pnumTaxAmount                  :=  0;                         --消費税金額
        pnumTaxInAmount                :=  0;                         --税込金額
        pnumExternalTaxSalesAmount     :=  0;                         --外税対象金額
        pnumInternalTaxSalesAmount     :=  0;                         --内税対象金額
        pnumTaxFreeSalesAmount         :=  0;                         --非課税対象金額
        pnumExternalTaxAmount          :=  0;                         --消費税額（外税）
        pnumInternalTaxAmount          :=  0;                         --消費税額（内税）
        pnumStatus                     := STATUS_ERROR;               --結果ステータス
        pvc2ErrCd                      := vc2WkErrCd;                 --エラーコード
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        RETURN FALSE;
    WHEN OTHERS THEN
        pnumTaxAmount1                 :=  0;                         --税額1
        pnumTaxAmount2                 :=  0;                         --税額2
        pnumTaxAmount3                 :=  0;                         --税額3
        pnumTaxOutAmount               :=  0;                         --税抜金額
        pnumTaxAmount                  :=  0;                         --消費税金額
        pnumTaxInAmount                :=  0;                         --税込金額
        pnumExternalTaxSalesAmount     :=  0;                         --外税対象金額
        pnumInternalTaxSalesAmount     :=  0;                         --内税対象金額
        pnumTaxFreeSalesAmount         :=  0;                         --非課税対象金額
        pnumExternalTaxAmount          :=  0;                         --消費税額（外税）
        pnumInternalTaxAmount          :=  0;                         --消費税額（内税）
        pnumStatus                     := STATUS_ERROR;               --結果ステータス
        pvc2ErrCd                      := JF_COM_ERR_ORACLE_ERROR;    --エラーコード
        /* ErrorLog の出力 */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, SQLCODE, SQLERRM);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        RETURN FALSE;
END;
/
