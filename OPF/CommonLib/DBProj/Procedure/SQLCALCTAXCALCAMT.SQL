CREATE OR REPLACE PROCEDURE          SQLCalcTaxCalcAmt(
/*------------------------------------------------------------------------------
'
' SQL_NAME  : SQLCalcTaxCalcAmt.sql
' Version   : 1.00.00
'
' 修正履歴
' 2009.04.17 初版
'
' 機能      : 税計算
'
'
' 戻り値    : なし
'
'         -- SYSTEM共通
'             pvc2LogMode                  - (i)ＬＯＧモード
'             pvc2OutputMode               - (i)出力モード
'             pvc2OutputPath               - (i)出力パス
'             pvc2OutputName               - (i)出力ファイル名
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
    pvc2LogMode                 IN VARCHAR2             -- **)ＬＯＧモード
,   pvc2OutputMode              IN VARCHAR2             -- **)出力モード
,   pvc2OutputPath              IN VARCHAR2             -- **)出力パス
,   pvc2OutputName              IN VARCHAR2             -- **)出力ファイル名
,   pvc2UserId                  IN VARCHAR2             -- **)ユーザＩＤ
,   pvc2BusinessName            IN VARCHAR2             -- **)業務名
,   pvc2PlantCd                 IN VARCHAR2             -- **)工場コード
,   pvc2TaxId                   IN  VARCHAR2            --課税方式
,   pnumTaxRate1                IN  NUMBER              --税率1
,   pnumTaxRate2                IN  NUMBER              --税率2
,   pnumTaxRate3                IN  NUMBER              --税率3
,   pnumRoundTyp                IN  NUMBER              --端数区分
,   pnumDecimalFlg              IN  NUMBER              --小数桁数
,   pnumAmountIn                IN  NUMBER              --金額
,   pnumTaxAmount1              OUT NUMBER              --税額1
,   pnumTaxAmount2              OUT NUMBER              --税額2
,   pnumTaxAmount3              OUT NUMBER              --税額3
,   pnumTaxOutAmount            OUT NUMBER              --税抜金額
,   pnumTaxAmount               OUT NUMBER              --消費税金額
,   pnumTaxInAmount             OUT NUMBER              --税込金額
,   pnumExternalTaxSalesAmount  OUT NUMBER              --外税対象金額
,   pnumInternalTaxSalesAmount  OUT NUMBER              --内税対象金額
,   pnumTaxFreeSalesAmount      OUT NUMBER              --非課税対象金額
,   pnumExternalTaxAmount       OUT NUMBER              --消費税額（外税）
,   pnumInternalTaxAmount       OUT NUMBER              --消費税額（内税）
,   pvc2ErrCd                   OUT VARCHAR2            -- **)エラーコード
,   pnumStatus                  OUT NUMBER              -- **)結果ステータス（1：正常終了 2:警告終了 3：異常終了）
)IS
    /* 定数の宣言 */
    METHOD_START                    VARCHAR2(20)  := 'START';                    -- ログ用メソッド開始宣言
    METHOD_END                      VARCHAR2(12)  := 'END';                      -- ログ用メソッド終了宣言
    MY_SQL_NAME                     VARCHAR2(120) := 'SQLCalcTaxCalcAmt';        -- ＰＬ／ＳＱＬ名
	APS_COM_BATCH_EXP				VARCHAR2(28)  := 'KQ20171';                  --消費税計算部品でエラーが発生しました。
    STATUS_NORMAL                   NUMBER := 1;                                 -- 正常終了
    STATUS_WARNING                  NUMBER := 2;                                 -- 警告終了
    STATUS_ERROR                    NUMBER := 3;                                 -- 異常終了
    /* 変数の定義 */
    UTL_FileHandle                  UTL_FILE.FILE_TYPE; -- ファイルハンドル
    blnRet                          BOOLEAN;            -- 共通関数の戻値
    vc2Comment                      VARCHAR2(1024);     -- メッセージ作成用
    dteBusinessOprDate              DATE;
    /* 例外処理用変数 */
    excERR_SUB                      EXCEPTION;          -- 部品エラー発生時
/*■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
  処理開始
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■*/
BEGIN
    /* LogFile の OPEN */
    blnRet := FNCLOGOPEN(pvc2OutputPath, pvc2OutputName,pvc2PlantCd, pvc2OutputMode, UTL_FileHandle);
    /* 税計算処理 */
    blnRet := FNCCALCTAXCALCAMTFD(
            UTL_FileHandle                                  -- **)ファイルハンドル
        ,   pvc2LogMode                                     -- **)ＬＯＧモード
        ,   pvc2OutputMode                                  -- **)出力モード
        ,   pvc2UserId                                      -- **)ユーザＩＤ
        ,   pvc2BusinessName                                -- **)業務名
        ,   pvc2PlantCd                                     -- **)工場コード
        ,   pvc2TaxId                                       --  1)課税方式
        ,   pnumTaxRate1                                    --  2)税率1
        ,   pnumTaxRate2                                    --  3)税率2
        ,   pnumTaxRate3                                    --  4)税率3
        ,   pnumRoundTyp                                    --  5)端数区分
        ,   pnumDecimalFlg                                  --  6)小数桁数
        ,   pnumAmountIn                                    --  7)金額
        ,   pnumTaxAmount1                                  --  8)税額1
        ,   pnumTaxAmount2                                  --  9)税額2
        ,   pnumTaxAmount3                                  -- 10)税額3
        ,   pnumTaxOutAmount                                -- 11)税抜金額
        ,   pnumTaxAmount                                   -- 12)消費税金額
        ,   pnumTaxInAmount                                 -- 13)税込金額
        ,   pnumExternalTaxSalesAmount                      -- 14)外税対象金額
        ,   pnumInternalTaxSalesAmount                      -- 15)内税対象金額
        ,   pnumTaxFreeSalesAmount                          -- 16)非課税対象金額
        ,   pnumExternalTaxAmount                           -- 17)消費税額（外税)
        ,   pnumInternalTaxAmount                           -- 18)消費税額（内税(
        ,   pvc2ErrCd                                       -- **)エラーコード
        ,   pnumStatus                                      -- **)結果ステータス
    );
    IF NOT blnRet THEN
        /* 失敗した場合、エラー */
        RAISE excERR_SUB;
    END IF;
/*■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
  処理終了
■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■*/
    /* LogFile の CLOSE */
    blnRet := FNCLOGCLOSE(UTL_FileHandle);
--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN excERR_SUB THEN    /* 部品エラー発生時 */
        /* LogFile の CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);
    WHEN OTHERS THEN    /* その他の例外エラー */
        /* エラーコード・エラーメッセージ作成 */
        pvc2ErrCd   := APS_COM_BATCH_EXP;
        vc2Comment  := SUBSTR(MY_SQL_NAME ||
                              ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                              ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
        /* エラーログの出力 */
        blnRet := FNCERRLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId,pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, pvc2ErrCd, vc2Comment);
        /* LogFile の CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);
        pnumStatus := STATUS_ERROR; --異常終了
END;
/
