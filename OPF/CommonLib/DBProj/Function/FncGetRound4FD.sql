CREATE OR REPLACE FUNCTION FNCGETROUND4FD(
/*------------------------------------------------------------------------------
'
' FncGetRound4FD.Sql
'
' 修正履歴
' 2006.08.17 新規作成
' 2006.10.31 返却値にエラーコード、エラーパラメータを追加（Jf用）
'            引数チェックを追加
'
' 機能      : 端数処理
'
' 戻り値    : Boolean
'               True :正常終了（結果ステータス=1:正常終了、2:警告終了）
'               False:異常終了（結果ステータス=3:異常終了）
'
' 引き数    :
'         -- SYSTEM共通
'             pFileHandle          - (i)ファイルハンドル
'             pvc2LogMode          - (i)ＬＯＧモード
'             pvc2OutputMode       - (i)出力モード
'             pvc2UserId           - (i)ユーザＩＤ
'             pvc2BusinessName     - (i)業務名
'             pvc2PlantCd          - (i)工場コード
'         -- 業務固有
'             pnumAmountIn         - (i)端数処理前の値
'             pnumDecimalFlg       - (i)小数桁数
'             pnumRoundTyp         - (i)端数処理区分
'             pnumAmountOut        - (o)端数処理後の値
'             pvc2ErrCd            - (o)エラーコード
'             pnumStatus           - (o)結果ステータス(1:正常終了、2:警告終了、3:異常終了)
' 機能説明  :小数桁数と端数処理区分で端数処理を行う。
'
' 備考      :
'
-----------------------------------------------------------------------------*/
    pFileHandle         IN  UTL_FILE.FILE_TYPE  --ファイルハンドル
   ,pvc2LogMode         IN  VARCHAR2            --ＬＯＧモード
   ,pvc2OutputMode      IN  VARCHAR2            --出力モード
   ,pvc2UserId          IN  VARCHAR2            --ユーザＩＤ
   ,pvc2BusinessName    IN  VARCHAR2            --業務名
   ,pvc2PlantCd         IN  VARCHAR2            --工場コード
   ,pnumAmountIn        IN  NUMBER              --端数処理前の値
   ,pnumDecimalFlg      IN  NUMBER              --小数桁数
   ,pnumRoundTyp        IN  NUMBER              --端数処理区分
   ,pnumAmountOut       OUT NUMBER              --端数処理後の値
   ,pvc2ErrCd           OUT VARCHAR2            --エラーコード
   ,pnumStatus          OUT NUMBER              --結果ステータス
    ) RETURN BOOLEAN
IS

/* 定数の宣言 */
    MY_SQL_NAME         VARCHAR2(64)    := 'FncGetRound4FD';    --ＰＬ／ＳＱＬ名

    ROUND_TYP_ROUND     NUMBER(1)       := 1;                   --端数処理区分(1:四捨五入)
    ROUND_TYP_RAISE     NUMBER(1)       := 2;                   --端数処理区分(2:切り上げ)
    ROUND_TYP_OMIT      NUMBER(1)       := 3;                   --端数処理区分(3:切り捨て)

    ROUND_COEFFICIENT   NUMBER(2,1)     := 0.5;                 --四捨五入用
    RAISE_COEFFICIENT   NUMBER(2,1)     := 1;                   --切り上げ用
    OMIT_COEFFICIENT    NUMBER(2,1)     := 0;                   --切り捨て用

    LOGMSG_START        VARCHAR2(20)     := 'Start';            --ログ用メソッド開始宣言
    LOGMSG_END          VARCHAR2(12)     := 'End';              --ログ用メソッド終了宣言
--  LOGMSG_PARM_ERR     VARCHAR2(32)     := 'ParamErr';         --ログ用メソッドパラメータエラー宣言

    STATUS_NORMAL     CONSTANT   NUMBER(01)     := 1;  -- 正常終了
    STATUS_WARNING    CONSTANT   NUMBER(01)     := 2;  -- 警告終了
    STATUS_ERROR      CONSTANT   NUMBER(01)     := 3;  -- 異常終了

    -- メッセージコード
    JF_COM_ERR_WRONG_VALUE                 VARCHAR(28)  := 'ZZ05105';               --値が不正です
    JF_COM_ERR_ORACLE_ERROR                VARCHAR(28)  := 'AC53401';               --ORACLEエラー

/* 変数の宣言 WORK */
    blnRet              BOOLEAN;
    numWkRound          NUMBER(2,1);
    numWkDecimal        NUMBER(28);

    -- 例外の宣言
    excParameterErr              EXCEPTION;          --「引数」エラー
--  excFncTraceLog               EXCEPTION;          --トレースログ出力エラー
--  excResultErr                 EXCEPTION;          --計算結果エラー
--  excNotFound                  EXCEPTION;          --マスタNOT FOUND

BEGIN
    pnumAmountOut  :=  0;              --端数処理後の値
    pnumStatus     :=  STATUS_NORMAL;  --結果ステータス
    pvc2ErrCd      :=  NULL;           --エラーコード

    /* TraceLog の出力 */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

    /* 引数チェック */

    -- 端数処理前の値 --
    IF (pnumAmountIn IS NULL) THEN  -- NULL
        RAISE excParameterErr;
    ELSIF pnumAmountIn = '' THEN   -- 空文字
        RAISE excParameterErr;
    END IF;

   -- 小数桁数 --
    IF (pnumDecimalFlg IS NULL) THEN  -- NULL
        RAISE excParameterErr;
    ELSIF pnumDecimalFlg = '' THEN   -- 空文字
        RAISE excParameterErr;
    ELSE
        /* 小数点以下１桁以上の場合 */
        IF pnumDecimalFlg > 0 THEN
            numWkDecimal := POWER(10, pnumDecimalFlg);
        /* 小数点以下０桁の場合 */
        ELSE
            numWkDecimal := 1;
        END IF;
    END IF;

    -- 端数処理係数 --
    IF (pnumRoundTyp IS NULL) THEN  -- NULL
        RAISE excParameterErr;
    ELSIF pnumRoundTyp = '' THEN   -- 空文字
        RAISE excParameterErr;
    ELSE
        IF pnumRoundTyp = ROUND_TYP_ROUND THEN       -- 四捨五入
            numWkRound := ROUND_COEFFICIENT;
        ELSIF pnumRoundTyp = ROUND_TYP_RAISE THEN    -- 切り上げ
            numWkRound := RAISE_COEFFICIENT;
        ELSIF pnumRoundTyp = ROUND_TYP_OMIT THEN     -- 切り捨て
            numWkRound := OMIT_COEFFICIENT;
        ELSE                                         -- その他
            RAISE excParameterErr;
        END IF;
    END IF;

    /* 負の値の場合 */
    IF pnumAmountIn < 0 THEN
        numWkRound := numWkRound * (-1);
    END IF;

    /* 端数処理を行う */

    IF pnumRoundTyp = ROUND_TYP_RAISE THEN          --切り上げ時
        IF MOD(pnumAmountIn * numWkDecimal , 1) != 0   THEN
            pnumAmountOut := TRUNC(pnumAmountIn * numWkDecimal + numWkRound) / numWkDecimal;
        ELSE
            pnumAmountOut := TRUNC(pnumAmountIn * numWkDecimal) / numWkDecimal;
        END IF;
    ELSE                                               --四捨五入,切り捨て時
    	pnumAmountOut := TRUNC(pnumAmountIn * numWkDecimal + numWkRound) / numWkDecimal;
    END IF;

    /* TraceLog の出力 */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    RETURN TRUE;

--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN excParameterErr THEN
        pnumAmountOut  := 0;
        pnumStatus     := STATUS_ERROR;              --結果ステータス
        pvc2ErrCd      := JF_COM_ERR_WRONG_VALUE;    --エラーコード
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        RETURN FALSE;
    WHEN OTHERS THEN
        pnumAmountOut  := 0;
        pnumStatus     := STATUS_ERROR;              --結果ステータス
        pvc2ErrCd      := JF_COM_ERR_ORACLE_ERROR;   --エラーコード
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
