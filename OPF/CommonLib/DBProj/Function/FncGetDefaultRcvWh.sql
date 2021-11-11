CREATE OR REPLACE FUNCTION FNCGETDEFAULTRCVWH(
/*------------------------------------------------------------------------------
' Copyright (c) 2003-2004 NEC Corporation.
' Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
'
'$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/DBProj/Function/FncGetDefaultRcvWh.sql,v $
'$Author: tai-yanhong $
'$Revision: 1.5 $
'
' 修正履歴
' 2005.01.19 新規作成
' 2005.03.14 外作代表保管区コード取得の検索条件から、
'            所要量計算対象フラグ＝１を削除。
' 2005.10.21 unicode対応（varchar2を4倍）
'
' 機能      : デフォルト受け入れ保管区取得
'
' 戻り値    : BOOLEAN
'               データが存在した場合   ⇒ TRUE
'               データが存在しない場合 ⇒ FALSE
'
' 引き数    : pFileHandle          - (i)ファイルハンドル
'             pvc2LogMode          - (i)ＬＯＧモード
'             pvc2OutputMode       - (i)出力モード
'             pvc2UserId           - (i)ユーザＩＤ
'             pvc2BusinessName     - (i)業務名
'             pvc2PlantCd          - (i)工場コード
'             pvc2ItemCd           - (i)品目番号
'             pvc2WhCd             - (o)検索結果の保管区コード
'
' 機能説明  : 受入保管区の規定値として使用する保管区コードを取得する。
'
' 備考      : 以下の順番で取得し、データが存在したところで処理終了。
'             ①[品目別入庫先保管区]から引数｢工場コード｣、｢品目番号｣を元に
'               所要量計算対象の保管区コードを取得する。
'             ②[保管区]から引数｢工場コード｣を元に所要量計算対象及び外作代表
'               の最小保管区コードを取得する。
'             ③[保管区]から引数｢工場コード｣を元に所要量計算対象の保管区コード
'               を取得する。
'
------------------------------------------------------------------------------*/
    pFileHandle         IN  UTL_FILE.FILE_TYPE  --ファイルハンドル
   ,pvc2LogMode         IN  VARCHAR2            --ＬＯＧモード
   ,pvc2OutputMode      IN  VARCHAR2            --出力モード
   ,pvc2UserId          IN  VARCHAR2            --ユーザＩＤ
   ,pvc2BusinessName    IN  VARCHAR2            --業務名
   ,pvc2PlantCd         IN  VARCHAR2            --工場コード
   ,pvc2ItemCd          IN  VARCHAR2            --品目番号
   ,pvc2WhCd            OUT VARCHAR2            --検索結果の保管区コード
) RETURN BOOLEAN IS

/* 例外の宣言 */
    excParamErr         EXCEPTION;              -- パラメータエラー

/* 変数の宣言 */
    vc2Comment          VARCHAR2(4000) := '';   -- メッセージ用コメント作成作業領域
    bPrmErrFlg          BOOLEAN := TRUE;        -- FALSE：引数エラー
    bPrmFoundFlg        BOOLEAN := FALSE;       -- TRUE：対象データ有り
    blnRet              BOOLEAN;                -- BOOLEAN型 返却値
    vc2WhCd             VARCHAR2(100);           -- 検索用保管区コード

/* 定数の宣言 */
    MY_SQL_NAME         CONSTANT VARCHAR2(72)  := 'FncGetDefaultRcvWh'; --ＰＬ／ＳＱＬ名
    LOGMSG_START        CONSTANT VARCHAR2(20)   := 'Start';              --ログ用メソッド開始宣言
    LOGMSG_END          CONSTANT VARCHAR2(12)   := 'End';                --ログ用メソッド終了宣言
    PrmPlantCd          CONSTANT VARCHAR2(84)  := '(SBM0826)[工場コード]';
    PrmItemCd           CONSTANT VARCHAR2(76)  := '(SBM0827)[品目番号]';
    ArgumentError       CONSTANT VARCHAR2(172)  := '(SBM0828)パラメータが未入力または不正です。';
    DataNotFound        CONSTANT VARCHAR2(128)  := '対象データが存在しませんでした。';
    numMrpTarget        CONSTANT NUMBER := 1;                           -- 所要量対象フラグ 1:所要量計算対象
    numOutsideTypical   CONSTANT NUMBER := 1;                           -- 外作代表フラグ 1:代表

/* カーソルの宣言 */
    -- [品目別入庫先保管区]から保管区を読込む
    CURSOR crsMItemRcvWh (
            vc2PlantCd   VARCHAR2,    -- 工場コード
            vc2ItemCd    VARCHAR2     -- 品目番号
            ) IS
        SELECT
         M_ITEM_RCV_WH.WH_CD AS WH_CD
        FROM
         M_ITEM_RCV_WH,
         M_WH
        WHERE
         M_ITEM_RCV_WH.WH_CD = M_WH.WH_CD
         AND M_ITEM_RCV_WH.PLANT_CD = pvc2PlantCd
         AND M_ITEM_RCV_WH.ITEM_CD = pvc2ItemCd
         AND M_WH.MRP_FLG = numMrpTarget;

    -- [保管区]から所要量対象の外作保管区を読込む
    CURSOR crsOutTypWh (
            vc2PlantCd   VARCHAR2    -- 工場コード
            ) IS
        SELECT
         MIN(M_WH.WH_CD) AS WH_CD
        FROM
         M_WH
        WHERE
         M_WH.PLANT_CD = pvc2PlantCd
         AND M_WH.WH_OUTSIDE_FLG = numOutsideTypical;

    -- [保管区]から所要量対象の最小保管区を読込む
    CURSOR crsMinimumWh (
            vc2PlantCd   VARCHAR2    -- 工場コード
            ) IS
        SELECT
         MIN(M_WH.WH_CD) AS WH_CD
        FROM
         M_WH
        WHERE
         M_WH.PLANT_CD = pvc2PlantCd
         AND M_WH.MRP_FLG = numMrpTarget;

/* ROWTYPE の宣言 */
    recMItemRcvWh   crsMItemRcvWh%ROWTYPE;      -- [品目別入庫先保管区]レコード格納
    recOutTypWh     crsOutTypWh%ROWTYPE;        -- [保管区]の所要量計算対象＆外作レコード格納
    recMinimumWh    crsMinimumWh%ROWTYPE;       -- [保管区]の所要量計算対象レコード格納

/* 内部関数 */
    /*------------------------------------------------------------------------------
    '
    ' SubFncGetRcvByItem
    '
    ' 修正履歴  2005.01.19 新規作成
    '
    ' 機能      : 工場・品目毎の既定保管区取得処理
    '
    ' 引き数    : vc2PlantCd     - (i)工場コード
    '           : vc2ItemCd      - (i)品目番号
    '           : vc2RcvWhCd     - (o)検索結果の保管区コード
    '
    ' 戻り値    : BOOLEAN
    '             データが存在した場合   ⇒ TRUE
    '             データが存在しない場合 ⇒ FALSE
    '
    ' 機能説明  : [品目別入庫先保管区]から引数｢工場コード｣、｢品目番号｣を元に
    '             所要量計算対象の保管区コードを取得する。
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION  SubFncGetRcvByItem(
        vc2PlantCd       IN  VARCHAR2,   --工場コード
        vc2ItemCd        IN  VARCHAR2,   --品目番号
        vc2RcvWhCd       OUT VARCHAR2    --検索結果の保管区コード
    ) RETURN BOOLEAN IS

    BEGIN

        -- [品目別入庫先保管区]の読込実行
        OPEN crsMItemRcvWh(vc2PlantCd, vc2ItemCd);
        FETCH crsMItemRcvWh INTO recMItemRcvWh;

        -- 存在チェック
        IF crsMItemRcvWh%NOTFOUND THEN
            RETURN FALSE;
        END IF;

        -- 保管区コードのセット
        vc2RcvWhCd := recMItemRcvWh.WH_CD;

        CLOSE crsMItemRcvWh;
        RETURN TRUE;

    END;

    /*------------------------------------------------------------------------------
    '
    ' SubFncgetOutsideTypical
    '
    ' 修正履歴  2005.01.19 新規作成
    '
    ' 機能      : 工場毎の規定値保管区取得
    '
    ' 引き数    : vc2PlantCd     - (i)工場コード
    '           : vc2RcvWhCd     - (o)検索結果の保管区コード
    '
    ' 戻り値    : BOOLEAN
    '             データが存在した場合   ⇒ TRUE
    '             データが存在しない場合 ⇒ FALSE
    '
    ' 機能説明  : [保管区]から引数｢工場コード｣を元に外作代表
    '             の最小保管区コードを取得する。
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION  SubFncgetOutsideTypical(
        vc2PlantCd       IN  VARCHAR2,   --工場コード
        vc2RcvWhCd       OUT VARCHAR2    --検索結果の保管区コード
    ) RETURN BOOLEAN IS

    BEGIN

        -- [保管区]の読込実行
        OPEN crsOutTypWh(vc2PlantCd);
        FETCH crsOutTypWh INTO recOutTypWh;

        -- 存在チェック
        IF recOutTypWh.WH_CD IS NULL THEN
            RETURN FALSE;
        END IF;

        -- 保管区コードのセット
        vc2RcvWhCd := recOutTypWh.WH_CD;

        CLOSE crsOutTypWh;
        RETURN TRUE;

    END;

    /*------------------------------------------------------------------------------
    '
    ' SubFncgetMinimum
    '
    ' 修正履歴  2005.01.19 新規作成
    '
    ' 機能      : 工場毎の保管区コード最小の保管区取得処理
    '
    ' 引き数    : vc2PlantCd     - (i)工場コード
    '           : vc2RcvWhCd     - (o)検索結果の保管区コード
    '
    ' 戻り値    : BOOLEAN
    '             データが存在した場合   ⇒ TRUE
    '             データが存在しない場合 ⇒ FALSE
    '
    ' 機能説明  : [保管区]から引数｢工場コード｣を元に所要量計算対象の保管区コード
    '             を取得する。
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION  SubFncgetMinimum(
        vc2PlantCd       IN  VARCHAR2,   --工場コード
        vc2RcvWhCd          OUT VARCHAR2    --検索結果の保管区コード
    ) RETURN BOOLEAN IS

    BEGIN

        -- [保管区]の読込実行
        OPEN crsMinimumWh(vc2PlantCd);
        FETCH crsMinimumWh INTO recMinimumWh;

        -- 存在チェック
        IF recMinimumWh.WH_CD IS NULL THEN
            RETURN FALSE;
        END IF;

        -- 保管区コードのセット
        vc2RcvWhCd := recMinimumWh.WH_CD;

        CLOSE crsMinimumWh;
        RETURN TRUE;

    END;

BEGIN

    /* TraceLog の出力 */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

    /* 引数｢工場コード｣のチェック */
    IF pvc2PlantCd IS NULL OR pvc2PlantCd='' THEN
        vc2Comment := vc2Comment || PrmPlantCd;
        bPrmErrFlg := FALSE;
    END IF;

    /* 引数｢品目番号｣のチェック */
    IF pvc2ItemCd IS NULL OR pvc2ItemCd='' THEN
        vc2Comment := vc2Comment || PrmItemCd;
        bPrmErrFlg := FALSE;
    END IF;

    IF bPrmErrFlg=FALSE THEN
        RAISE excParamErr;
    END IF;

    /* 工場・品目毎の既定保管区取得 */
    blnRet := SubFncGetRcvByItem(pvc2PlantCd, pvc2ItemCd, vc2WhCd);
    IF blnRet=TRUE THEN
        pvc2WhCd := vc2WhCd;
        bPrmFoundFlg := TRUE;
    END IF;

    /* 工場毎の既定値保管区取得 */
    IF bPrmFoundFlg=FALSE THEN
        blnRet := SubFncgetOutsideTypical(pvc2PlantCd, vc2WhCd);
        IF blnRet=TRUE THEN
            pvc2WhCd := vc2WhCd;
            bPrmFoundFlg := TRUE;
        END IF;
    END IF;

    /* 工場毎の保管区コード最小の保管区取得 */
    IF bPrmFoundFlg=FALSE THEN
        blnRet := SubFncgetMinimum(pvc2PlantCd, vc2WhCd);
        IF blnRet=TRUE THEN
            pvc2WhCd := vc2WhCd;
            bPrmFoundFlg := TRUE;
        END IF;
    END IF;

    /* TraceLog の出力 */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    IF bPrmFoundFlg=TRUE THEN
        RETURN TRUE;
    ELSE
        RETURN FALSE;
    END IF;

--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN excParamErr THEN    -- パラメータエラー

        /* ErrLog の出力 */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2PlantCd, pvc2UserId, pvc2BusinessName,
                              MY_SQL_NAME, ArgumentError, vc2Comment);

        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2PlantCd, pvc2UserId, pvc2BusinessName,
                              MY_SQL_NAME, LOGMSG_END);

        RETURN FALSE;

    WHEN OTHERS THEN   --その他のエラー
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
