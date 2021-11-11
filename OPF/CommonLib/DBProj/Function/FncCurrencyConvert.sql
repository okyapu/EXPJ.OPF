CREATE OR REPLACE FUNCTION FNCCURRENCYCONVERT(
/*------------------------------------------------------------------------------
' $Id: FncCurrencyConvert.sql,v 1.2 2005/10/24 06:30:48 kamata Exp $
' $Revision: 1.2 $

' 修正履歴  2005.10.21 unicode対応（varchar2を4倍）
'
' 機能      : 入力パラメータを元に以下の処理を行います。
'             (1)外貨（取引先）の金額を、邦貨（自社）の通貨金額に変換する
'                または、邦貨（自社）の金額を、外貨（取引先）の通貨金額に変換する
'             (2)指定した取引先および、自社の通貨情報、為替情報を出力する。
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
'             pvc2CompanyCd        - (i)会社コード
'             pvc2VendCd           - (i)取引先コード
'             pdtmRateJudgeDate    - (i)レート判定日
'             pvc2ExchReserveCd    - (i)為替予約コード
'             pnumBeforeAmount     - (i)変換前金額
'             pnumConvertTyp       - (i)変換方向
'             pnumAfterAmount      - (o)変換後金額
'             pnumRoundTyp         - (o)端数処理区分
'             pnumExchRate         - (o)為替レート
'             pnumExchTyp          - (o)為替種別
'             pvc2VendCurCd        - (o)取引先通貨コード
'             pvc2VendCurName      - (o)取引先通貨名
'             pvc2VendCurSymbol    - (o)取引先通貨記号
'             pvc2VendCurUnit      - (o)取引先通貨単位
'             pnumVendDecimalFig   - (o)取引先小数桁数
'             pvc2HomeCurCd        - (o)自社（邦貨）通貨コード
'             pvc2HomeCurName      - (o)自社（邦貨）通貨名
'             pvc2HomeCurSymbol    - (o)自社（邦貨）通貨記号
'             pvc2HomeCurUnit      - (o)自社（邦貨）通貨単位
'             pnumHomeDecimalFig   - (o)自社（邦貨）小数桁数
'             pvc2ErrorCd          - (o)エラーコード
'
' 備考      :
'
------------------------------------------------------------------------------*/
    pFileHandle         IN  UTL_FILE.FILE_TYPE  --ファイルハンドル
   ,pvc2LogMode         IN  VARCHAR2            --ＬＯＧモード
   ,pvc2OutputMode      IN  VARCHAR2            --出力モード
   ,pvc2UserId          IN  VARCHAR2            --ユーザＩＤ
   ,pvc2BusinessName    IN  VARCHAR2            --業務名
   ,pvc2PlantCd         IN  VARCHAR2            --工場コード
   ,pvc2CompanyCd       IN  VARCHAR2            --会社コード
   ,pvc2VendCd          IN  VARCHAR2            --取引先コード
   ,pdtmRateJudgeDate   IN  DATE                --レート判定日
   ,pvc2ExchReserveCd   IN  VARCHAR2            --為替予約コード
   ,pnumBeforeAmount    IN  NUMBER              --変換前金額
   ,pnumConvertTyp      IN  NUMBER              --変換方向
   ,pnumAfterAmount     OUT NUMBER              --変換後金額
   ,pnumRoundTyp        OUT NUMBER              --端数処理区分
   ,pnumExchRate        OUT NUMBER              --為替レート
   ,pnumExchTyp         OUT NUMBER              --為替種別
   ,pvc2VendCurCd       OUT VARCHAR2            --取引先通貨コード
   ,pvc2VendCurName     OUT VARCHAR2            --取引先通貨名
   ,pvc2VendCurSymbol   OUT VARCHAR2            --取引先通貨記号
   ,pvc2VendCurUnit     OUT VARCHAR2            --取引先通貨単位
   ,pnumVendDecimalFig  OUT NUMBER              --取引先小数桁数
   ,pvc2HomeCurCd       OUT VARCHAR2            --自社（邦貨）通貨コード
   ,pvc2HomeCurName     OUT VARCHAR2            --自社（邦貨）通貨名
   ,pvc2HomeCurSymbol   OUT VARCHAR2            --自社（邦貨）通貨記号
   ,pvc2HomeCurUnit     OUT VARCHAR2            --自社（邦貨）通貨単位
   ,pnumHomeDecimalFig  OUT NUMBER              --自社（邦貨）小数桁数
   ,pvc2ErrorCd         OUT VARCHAR2            --エラーコード
    ) RETURN BOOLEAN
IS

-----------------
-- CONST値宣言 --
-----------------
    MY_SQL_NAME         VARCHAR2(72)    := 'FncCurrencyConvert';--ＰＬ／ＳＱＬ名
    LOGMSG_START        VARCHAR2(20)     := 'Start';             --ログ用メソッド開始宣言
    LOGMSG_END          VARCHAR2(12)     := 'End';               --ログ用メソッド終了宣言

    

--------------
-- WORK変数 --
--------------
    blnRet              BOOLEAN;        -- チェック結果

BEGIN

    /* TraceLog の出力 */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

    -- デフォルト値設定
    pnumAfterAmount := 0;
    pnumRoundTyp := 0;
    pnumExchRate := 0;
    pnumExchTyp := 0;
    pvc2VendCurCd := NULL;
    pvc2VendCurName := NULL;
    pvc2VendCurSymbol := NULL;
    pvc2VendCurUnit := NULL;
    pnumVendDecimalFig := 0;
    pvc2HomeCurCd := NULL;
    pvc2HomeCurName := NULL;
    pvc2HomeCurSymbol := NULL;
    pvc2HomeCurUnit := NULL;
    pnumHomeDecimalFig := 0;
    pvc2ErrorCd := NULL;

    --Nullチェック
    IF pvc2CompanyCd IS NULL THEN
        pvc2ErrorCd := 'ZZ02011';
        RETURN FALSE;
    END IF;
    IF pvc2VendCd IS NULL THEN
        pvc2ErrorCd := 'ZZ02012';
        RETURN FALSE;
    END IF;
    IF pdtmRateJudgeDate IS NULL THEN
        pvc2ErrorCd := 'ZZ02013';
        RETURN FALSE;
    END IF;
    IF pnumBeforeAmount IS NULL THEN
        pvc2ErrorCd := 'ZZ02014';
        RETURN FALSE;
    END IF;

    IF (pnumConvertTyp <= 0) OR (pnumConvertTyp > 2) THEN 
        pvc2ErrorCd := 'ZZ02015';
        RETURN FALSE;
    END IF;

    -- 邦貨マスタ検索
    BEGIN
        SELECT
          SYS_HOME_CUR.HOME_CUR_CD
        INTO
          pvc2HomeCurCd
        FROM
          SYS_HOME_CUR
        WHERE
          SYS_HOME_CUR.CTRL_CD = 'SYSTEM'
        ;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            pvc2ErrorCd := 'ZZ02022';
            RETURN FALSE;
    END;

    -- 通貨マスタ
    BEGIN
        SELECT
          M_CUR.CUR_CD,
          M_CUR.CUR_NAME,
          M_CUR.CUR_SYMBOL,
          M_CUR.CUR_UNIT,
          M_CUR.DECIMAL_FIG
        INTO
          pvc2HomeCurCd,
          pvc2HomeCurName,
          pvc2HomeCurSymbol,
          pvc2HomeCurUnit,
          pnumHomeDecimalFig
        FROM
          M_CUR
        WHERE
          M_CUR.CUR_CD = pvc2HomeCurCd
        ;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            pvc2ErrorCd := 'ZZ02023';
            RETURN FALSE;
    END;

    -- 取引先マスタ
    BEGIN
        SELECT
          M_VEND_CTRL.CUR_CD, 
          M_VEND_CTRL.EXCH_TYP,
          M_VEND_CTRL.ROUND_TYP
        INTO 
          pvc2VendCurCd,
          pnumExchTyp,
          pnumRoundTyp
        FROM
          M_VEND_CTRL
        WHERE
          M_VEND_CTRL.COMPANY_CD = pvc2CompanyCd
          and M_VEND_CTRL.VEND_CD = pvc2VendCd
        ;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            pvc2ErrorCd := 'ZZ02021';
            RETURN FALSE;
    END;

    IF (pnumExchTyp = 2) AND (pvc2ExchReserveCd IS NULL) THEN
            pvc2ErrorCd := 'ZZ02031';
            RETURN FALSE;
    END IF;


    IF (pvc2VendCurCd IS NULL) OR (pvc2VendCurCd = pvc2HomeCurCd) THEN
        pvc2VendCurCd      := pvc2HomeCurCd;
        pvc2VendCurName    := pvc2HomeCurName;
        pvc2VendCurSymbol  := pvc2HomeCurSymbol;
        pvc2VendCurUnit    := pvc2HomeCurUnit;
        pnumVendDecimalFig := pnumHomeDecimalFig;
        pnumAfterAmount    := pnumBeforeAmount;
        pnumExchRate       := 1;
    ELSE
        -- 取引先の通貨マスタ情報を検索
        BEGIN
            SELECT
              M_CUR.CUR_CD,
              M_CUR.CUR_NAME,
              M_CUR.CUR_SYMBOL,
              M_CUR.CUR_UNIT,
              M_CUR.DECIMAL_FIG
            INTO
              pvc2VendCurCd,
              pvc2VendCurName,
              pvc2VendCurSymbol,
              pvc2VendCurUnit,
              pnumVendDecimalFig
            FROM
              M_CUR
            WHERE
              M_CUR.CUR_CD = pvc2VendCurCd;
        EXCEPTION
            WHEN NO_DATA_FOUND THEN
            pvc2ErrorCd := 'ZZ02023';
                RETURN FALSE;
        END;

        -- 為替レート情報を検索
        BEGIN
            SELECT
              M_EXCH_RATE.EXCH_RATE
            INTO
              pnumExchRate
            FROM
              M_EXCH_RATE,
              (
                SELECT
                  M_EXCH_RATE.COMPANY_CD as COMPANY_CD,
                  M_EXCH_RATE.CUR_CD as CUR_CD,
                  M_EXCH_RATE.EXCH_TYP as EXCH_TYP,
                  M_EXCH_RATE.EXCH_RESERVE_CD as EXCH_RESERVE_CD,
                  max(M_EXCH_RATE.EXCH_START_DATE) as MAX_EXCH_START_DATE
                FROM
                  M_EXCH_RATE
                WHERE
                  M_EXCH_RATE.COMPANY_CD = pvc2CompanyCd
                  and M_EXCH_RATE.CUR_CD = pvc2VendCurCd
                  and M_EXCH_RATE.EXCH_TYP = pnumExchTyp
                  and (M_EXCH_RATE.EXCH_TYP != 2 or M_EXCH_RATE.EXCH_RESERVE_CD = pvc2ExchReserveCd)
                  and M_EXCH_RATE.EXCH_START_DATE <= pdtmRateJudgeDate
                group by
                  M_EXCH_RATE.COMPANY_CD,
                  M_EXCH_RATE.CUR_CD,
                  M_EXCH_RATE.EXCH_TYP,
                  M_EXCH_RATE.EXCH_RESERVE_CD
              ) T1
            WHERE
              M_EXCH_RATE.COMPANY_CD = T1.COMPANY_CD
              and M_EXCH_RATE.CUR_CD = T1.CUR_CD
              and M_EXCH_RATE.EXCH_TYP = T1.EXCH_TYP
              and (M_EXCH_RATE.EXCH_TYP != 2 or M_EXCH_RATE.EXCH_RESERVE_CD = T1.EXCH_RESERVE_CD)
              and M_EXCH_RATE.EXCH_START_DATE = T1.MAX_EXCH_START_DATE
            ;
        EXCEPTION
            WHEN NO_DATA_FOUND THEN
            pvc2ErrorCd := 'ZZ02024';
                RETURN FALSE;
        END;
    END IF;

    -- 邦貨換算
    IF (pnumConvertTyp IS NULL) OR (pnumConvertTyp = 1) THEN
        pnumAfterAmount := pnumBeforeAmount * pnumExchRate;
        FOR i IN 1..pnumHomeDecimalFig LOOP
            pnumAfterAmount := pnumAfterAmount * 10;
        END LOOP;
        IF pnumRoundTyp = 2 THEN
            pnumAfterAmount := CEIL(pnumAfterAmount);
        ELSIF pnumRoundTyp = 3 THEN
            pnumAfterAmount := FLOOR(pnumAfterAmount);
        ELSE
            pnumAfterAmount := ROUND(pnumAfterAmount);
        END IF;
        FOR i IN 1..pnumHomeDecimalFig LOOP
            pnumAfterAmount := pnumAfterAmount / 10;
        END LOOP;
    ELSE
        pnumAfterAmount := pnumBeforeAmount / pnumExchRate;
        FOR i IN 1..pnumVendDecimalFig LOOP
            pnumAfterAmount := pnumAfterAmount * 10;
        END LOOP;
        IF pnumRoundTyp = 2 THEN
            pnumAfterAmount := CEIL(pnumAfterAmount);
        ELSIF pnumRoundTyp = 3 THEN
            pnumAfterAmount := FLOOR(pnumAfterAmount);
        ELSE
            pnumAfterAmount := ROUND(pnumAfterAmount);
        END IF;
        FOR i IN 1..pnumVendDecimalFig LOOP
            pnumAfterAmount := pnumAfterAmount / 10;
        END LOOP;
    END IF;

    /* TraceLog の出力 */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    RETURN TRUE;    -- 正常終了

--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN OTHERS THEN
        /* ErrorLog の出力 */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, SQLCODE, SQLERRM);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        
        pvc2ErrorCd := 'ZZ02099';
        RETURN FALSE;
END;
/