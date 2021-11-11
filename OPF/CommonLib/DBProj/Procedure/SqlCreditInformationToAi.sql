CREATE OR REPLACE PROCEDURE SqlCreditInformationToAi(
/*------------------------------------------------------------------------------
'
' SqlCreditInformationToAi.Sql
'
' version   : 1.00.00
'
' 修正履歴
'
' 機能      : Ａｉ連携売掛インタフェース処理
'
' 引き数    : pvc2LogMode          - (i)ＬＯＧモード'
'             pvc2OutputMode       - (i)出力モード'
'             pvc2OutputPath       - (i)出力ファイルパス
'             pvc2OutputName       - (i)出力ファイル名
'             pvc2UserId           - (i)ユーザＩＤ
'             pvc2BusinessName     - (i)業務名
'             pvc2PlantCd          - (i)工場コード
'             pvc2ErrorCd          - (o)エラーコード
'             pnumStatus           - (o)結果ステータス
'
' 機能説明  : EXPLANNER/J（Ｊｆ／Ｊa）の[売上実績]、[売上実績ヘッダ]、[有償支給履歴]から売掛情報を集約して、Aｉ連携売掛インタフェースにデータ登録する。
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

    MY_SQL_NAME                           VARCHAR2(120):= 'SQLCREDITINFORMATIONTOAI';	--ＰＬ／ＳＱＬ名

    --//業務ログ用メッセージID
    LOGMSG_ID_COMMON_CHK                  VARCHAR2(28) := 'BF00011';    --引数が不正のため処理ができませんでした。
    LOGMSG_ID_START                       VARCHAR2(28) := 'BF00021';    --Ａｉ連携売掛インタフェース処理を開始しました。
    LOGMSG_ID_AI_AR_FAIL                  VARCHAR2(28) := 'BF00019';    --Ａｉ連携売掛インタフェース情報の登録に失敗しました。
    LOGMSG_ID_READ_FAIL                   VARCHAR2(28) := 'BF00015';    --Ａｉ連携売掛インタフェース処理が正常終了しました。
    LOGMSG_ID_EXCH_RATE                   VARCHAR2(28) := 'BF00017';    --為替レートが取得できませんでした。
    LOGMSG_ID_AI_AR_IF_INS                VARCHAR2(28) := 'BF00020';    --有償支給インタフェース情報の登録に失敗しました。
    LOGMSG_ID_PAST_UPD                    VARCHAR2(28) := 'BF00014';    --売上実績更新処理が失敗しました。
    LOGMSG_ID_END                         VARCHAR2(28) := 'BF00025';    --Ａｉ連携売掛インタフェース処理が正常終了しました。
    LOGMSG_ID_ERR                         VARCHAR2(28) := 'BF00016';    --Ａｉ連携売掛インタフェース処理が異常終了しました。
    LOGMSG_ID_RATE_ERROR                  VARCHAR2(28) := 'BF00022';    --為替レート取得処理でエラーが発生しました。


    --//業務ログ用メッセージf
    LOGMSG_NM_COMMON_CHK                  VARCHAR2(200) := '(SBM0017)引数が不正のため処理ができませんでした。';  
    LOGMSG_NM_START                       VARCHAR2(200) := '(SBM0770)Ａｉ連携売掛インタフェース処理を開始しました。';
    LOGMSG_NM_AI_AR_FAIL                  VARCHAR2(200) := 'Ａｉ連携売掛インタフェース情報の登録に失敗しました。';
    LOGMSG_NM_READ_FAIL                   VARCHAR2(200) := 'Ａｉ連携売掛インタフェース処理が正常終了しました。'; 
    LOGMSG_NM_EXCH_RATE                   VARCHAR2(200) := '(SBM0718)為替レートが取得できませんでした。';
    LOGMSG_NM_AI_AR_IF_INS                VARCHAR2(200) := '有償支給インタフェース情報の登録に失敗しました。';
    LOGMSG_NM_PAST_UPD                    VARCHAR2(200) := '売上実績更新処理が失敗しました。';
    LOGMSG_NM_END                         VARCHAR2(200) := 'Ａｉ連携売掛インタフェース処理が正常終了しました。';
    LOGMSG_NM_ERR                         VARCHAR2(200) := 'Ａｉ連携売掛インタフェース処理が異常終了しました。';
    LOGMSG_NM_RATE_ERROR                  VARCHAR2(200) := '(SBM0719)為替レート取得処理でエラーが発生しました。';
    --//業務文字列
    LOGMSG_STR_MESSAGE                    VARCHAR2(200):= '(SBM0303)<< Ａｉ連携売掛インタフェース処理開始　>>'; --業務文字列定義
                                                                                     
    --//結果ステータス
    STATUS_NORMAL                         NUMBER        := 1;   -- 正常終了
    STATUS_WARNING                        NUMBER        := 2;   -- ワーニング
    STATUS_ERROR                          NUMBER        := 3;   -- 異常終了

/* 変数の宣言 WORK */

    --//自定義異常
    excFncTraceLog                         EXCEPTION;           --ログを書き失敗
    excCommonChk                           EXCEPTION;           --共通引数失敗
    excFnc                                 EXCEPTION;           --売上情報取込処理失敗
    LOGMSG_NM_END                          VARCHAR2(200);       --処理終了宣言
    UTL_FileHandle                         UTL_FILE.FILE_TYPE;  --ファイルハンドル
    blnRet                                 BOOLEAN;             --共通関数の戻値

    --//詳細メッセージ格納用
    vc2Comment                             VARCHAR2(1024);

    --//内部変数の宣言
     wnumTaxAmount1                        NUMBER;              --税額1
     wnumTaxAmount2                        NUMBER;              --税額2
     wnumTaxAmount3                        NUMBER;              --税額3
     wnumTaxOutAmount                      NUMBER;              --税抜金額
     wnumTaxAmount                         NUMBER;              --消費税金額
     wnumTaxInAmount                       NUMBER;              --税込金額
     wnumExternalTaxSalesAmount            NUMBER;              --外税対象金額
     wnumInternalTaxSalesAmount            NUMBER;              --内税対象金額
     wnumTaxFreeSalesAmount                NUMBER;              --非課税対象金額
     wnumExternalTaxAmount                 NUMBER;              --消費税額（外税）
     wnumInternalTaxAmount                 NUMBER;              --消費税額（内税）
     wnumSalesAmount                       NUMBER;              --売上実績金額
     wnumSalesAmounExchRates               NUMBER;              --売上実績金額(邦貨)
     wnumTaxCreditAmount                   NUMBER;              --税抜売上金額
     wnumTaxCreditAmountExchRates          NUMBER;              --税抜売上金額(邦貨)
     wnumExchRate                          NUMBER;              --為替レート
     wnumDataExist                         NUMBER;              --データが存在フラグ
     wnumDataExist1                        NUMBER;              --データが存在フラグ
     wnumTotalCount                        NUMBER;              --処理データ件数
     wnumNormalCount                       NUMBER;              --正常件数
     wnumWarnCount                         NUMBER;              --ワーニング件数
     wnumErrorCount                        NUMBER;              --エラー件数
     wblnErrorFlg                          BOOLEAN;             --エラーのフラグ
     wblnWarnFlg                           BOOLEAN;             --ワーニングのフラグ
     wnumCount0                            NUMBER;              --有償支給金額＝０データ数
    
/* カーソルの宣言*/
    --//[有償支給履歴]から売掛情報を取得する
    CURSOR CUR_T_PAST_ONEROUS_CONS
    IS 
    SELECT
        A.ONEROUS_CONS_NO,                                      --[有償支給履歴]．“有償支給番号”
        A.ISSUE_DATE,                                           --[有償支給履歴]．“出庫日”
        A.VEND_CD,                                              --[有償支給履歴]．“取引先コード”
        A.PLANT_CD,                                             --[有償支給履歴]．“工場コード”
        B.CUR_CD,                                               --[取引先]．“通貨コード”
        B.EXCH_TYP,                                             --[取引先]．“為替種別”
        B.ROUND_TYP,                                            --[取引先]．“発注金額まるめ区分”
        A.ITEM_CD,                                              --[有償支給履歴]．“品目番号”
        C.ITEM_NAME,                                            --[品目]．“品目名”
        A.ISSUE_QTY,                                            --[有償支給履歴]．“出庫数”
        C.STOCK_UNIT,                                           --[品目]．“計量単位”
        A.UNIT_COST,                                            --[有償支給履歴]．“単価”
        B.TAX_CD,                                               --[取引先]．“消費税コード”
        D.DECIMAL_FIG,                                          --[通貨]．“小数桁数”
        E.NEW_TAX_RATE_1,                                       --[消費税区分マスタ]．“新税率1”
        E.NEW_TAX_RATE_2,                                       --[消費税区分マスタ]．“新税率2”
        E.NEW_TAX_RATE_3,                                       --[消費税区分マスタ]．“新税率3”
        A.PUCH_ODR_CD                                           --[有償支給履歴]．"発注番号"
    FROM
        T_PAST_ONEROUS_CONS A,                                  --[有償支給履歴]
        M_VEND_CTRL B,                                          --[取引先]
        M_ITEM C,                                               --[品目]
        M_CUR D,                                                --[通貨]
        M_TAX E,                                                --[消費税区分マスタ]
        (SELECT
            COMPANY_CD AS "COMPANY_CD"                          --[自社]．"会社コード"
         FROM
            SYS_MY_COMPANY                                      --[自社]
        WHERE
            CTRL_CD = 'SYSTEM') G
    WHERE
        A.VEND_CD      = B.VEND_CD
    AND A.ITEM_CD      = C.ITEM_CD
    AND A.COMPANY_CD   = G.COMPANY_CD
    AND B.CUR_CD       = D.CUR_CD 
    AND B.TAX_CD       = E.TAX_CD
    AND A.ISSUE_QTY    <>0  
    AND A.UNIT_COST   <>0
    AND A.AI_AR_IF_FLG = 0;

BEGIN
     /* LogFile の OPEN */
    blnRet :=  FNCLOGOPEN(pvc2OutputPath, pvc2OutputName, pvc2PlantCd, pvc2OutputMode, UTL_FileHandle);

    /* TraceLogの出力(Start)処理を行う */
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_START);

    IF (NOT blnRet) THEN        
        --//結果ステータスが異常をセットする
        pnumStatus := STATUS_ERROR;
        RAISE excFncTraceLog;
    END IF;

    /* 業務開始メッセージの出力 */
    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                        pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_START, LOGMSG_STR_MESSAGE);

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
    --//カウンタ、変数の初期化
    wnumTotalCount  := 0;
    wnumNormalCount := 0;
    wnumWarnCount   := 0;
    wnumErrorCount  := 0;

    --//Ａｉ連携売掛インタフェース処理（Jf売上情報取込処理）
    BEGIN
        SELECT
            COUNT(OPTION_ID)        --システムオプション識別子
        INTO
            wnumDataExist
        FROM
            SYS_INSTALL_OPTIONS     --インストールオプション 
        WHERE
            OPTION_ID = 'JF*'
            AND INSTALL_FLG =1;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            wnumDataExist := 0;
    END;

    --//Ａｉ連携売掛インタフェース処理（Ja売上情報取込処理）
    BEGIN
        SELECT
            COUNT(OPTION_ID)        --システムオプション識別子
        INTO
            wnumDataExist1
        FROM
            SYS_INSTALL_OPTIONS     --インストールオプション 
        WHERE
            OPTION_ID = 'JA*'
            AND INSTALL_FLG =1;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            wnumDataExist := 0;
    END;

    --//インストールシステムが　EXPLANNER/Jf場合、下記よう、「Ａｉ連携売掛インタフェース処理（Jf売上情報取込処理）」処理を実行する
    IF wnumDataExist <> 0 THEN 
        IF wnumDataExist1<>0 THEN
            vc2Comment:= SUBSTR('(SBM0304)インストールオプションには、ＪａとＪｆのいずれか一方にのみ導入フラグを設定してください。', 1, 256);
            /* TraceLog の出力 */
            blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                                      pvc2PlantCd, MY_SQL_NAME, vc2Comment);
            /* 業務終了メッセージの出力 */
            blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                        pvc2PlantCd, MY_SQL_NAME,LOGMSG_ID_ERR,vc2Comment);
            --//処理中断する
            RAISE excFnc;
        END IF;
    END IF;

    IF wnumDataExist <> 0 THEN
        BEGIN
            blnRet := FNCCREDITINFORMATIONTOAiJf(
                                                 UTL_FileHandle     --ファイルハンドル
                                                ,pvc2LogMode        --ＬＯＧモード
                                                ,pvc2OutputMode     --出力モード
                                                ,pvc2UserId         --ユーザＩＤ
                                                ,pvc2BusinessName   --業務名
                                                ,pvc2PlantCd        --工場コード
                                                ,wnumTotalCount     --処理データ件数
                                                ,wnumNormalCount    --正常件数
                                                ,wnumWarnCount      --ワーニング件数
                                                ,wnumErrorCount     --異常件数
                                                ,pvc2ErrorCd        --エラーメッセージID
                                                ,pnumStatus         --結果ステータス（1：正常終了 2:警告終了 3：異常終了）
            );
            --正常
            IF pnumStatus = 1 OR blnRet = TRUE THEN
                vc2Comment:= SUBSTR('(SBM0771)Jf売上情報取込処理　'||
                                    '処理データ件数：['|| wnumTotalCount  ||']　'||
                                    '正常件数：['      || wnumNormalCount ||']　'||
                                    'ワーニング件数：['|| wnumWarnCount   ||']　'||
                                    '異常件数：['      || wnumErrorCount  ||']  ', 1, 256);

                /* TraceLog の出力 */
                blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                                      pvc2PlantCd, MY_SQL_NAME, vc2Comment);

            END IF;
            --異常
            IF blnRet = FALSE THEN
                /* TraceLog の出力 */
                blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                                      pvc2PlantCd, MY_SQL_NAME, SQLERRM);

                /* 業務終了メッセージの出力 */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                        pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_AI_AR_FAIL, SQLERRM);

                --//処理中断する
                RAISE excFnc;
            END IF;
        END;
    --//インストールシステムが　EXPLANNER/Jfでない場合、下記よう、「Ａｉ連携売掛インタフェース処理（J売上情報取込処理）」処理を実行する
    ELSE
        IF wnumDataExist1 <> 0 THEN
            BEGIN
                blnRet := FNCCREDITINFORMATIONTOAiJa(
                                                UTL_FileHandle      --ファイルハンドル
                                               ,pvc2LogMode         --ＬＯＧモード
                                               ,pvc2OutputMode      --出力モード
                                               ,pvc2UserId          --ユーザＩＤ
                                               ,pvc2BusinessName    --業務名
                                               ,pvc2PlantCd         --工場コード
                                               ,wnumTotalCount      --処理データ件数
                                               ,wnumNormalCount     --正常件数
                                               ,wnumWarnCount       --ワーニング件数
                                               ,wnumErrorCount      --異常件数
                                               ,pvc2ErrorCd         --エラーメッセージID
                                               ,pnumStatus          --結果ステータス（1：正常終了 2:警告終了 3：異常終了）
                                             );
                --正常
                IF pnumStatus = 1 OR blnRet = TRUE THEN
                    vc2Comment:= SUBSTR('(SBM0772)J売上情報取込処理　'||
                                    '処理データ件数：['|| wnumTotalCount  ||']　'||
                                    '正常件数：['      || wnumNormalCount ||']　'||
                                    'ワーニング件数：['|| wnumWarnCount   ||']　'||
                                    '異常件数：['|| wnumErrorCount  ||']  ', 1, 256);

                    /* TraceLog の出力 */
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                                      pvc2PlantCd, MY_SQL_NAME, vc2Comment);

                END IF;
                --異常
                IF blnRet = FALSE THEN
                    /* TraceLog の出力 */
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                                          pvc2PlantCd, MY_SQL_NAME, SQLERRM);

                    /* 業務終了メッセージの出力 */
                    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                        pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_AI_AR_FAIL, SQLERRM);

                    --//処理中断する
                    RAISE excFnc;
               END IF;
           END;

        ELSE
            BEGIN
                blnRet := FNCCREDITINFORMATIONTOAiJ(
                                                UTL_FileHandle      --ファイルハンドル
                                               ,pvc2LogMode         --ＬＯＧモード
                                               ,pvc2OutputMode      --出力モード
                                               ,pvc2UserId          --ユーザＩＤ
                                               ,pvc2BusinessName    --業務名
                                               ,pvc2PlantCd         --工場コード
                                               ,wnumTotalCount      --処理データ件数
                                               ,wnumNormalCount     --正常件数
                                               ,wnumWarnCount       --ワーニング件数
                                               ,wnumErrorCount      --異常件数
                                               ,pvc2ErrorCd         --エラーメッセージID
                                               ,pnumStatus          --結果ステータス（1：正常終了 2:警告終了 3：異常終了）
                                             );
                --正常
                IF pnumStatus = 1 OR blnRet = TRUE THEN
                    vc2Comment:= SUBSTR('(SBM0772)J売上情報取込処理　'||
                                    '処理データ件数：['|| wnumTotalCount  ||']　'||
                                    '正常件数：['      || wnumNormalCount ||']　'||
                                    'ワーニング件数：['|| wnumWarnCount   ||']　'||
                                    '異常件数：['|| wnumErrorCount  ||']  ', 1, 256);

                    /* TraceLog の出力 */
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                                      pvc2PlantCd, MY_SQL_NAME, vc2Comment);

                END IF;
                --異常
                IF blnRet = FALSE THEN
                    /* TraceLog の出力 */
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                                          pvc2PlantCd, MY_SQL_NAME, SQLERRM);

                    /* 業務終了メッセージの出力 */
                    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                        pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_AI_AR_FAIL, SQLERRM);

                    --//処理中断する
                    RAISE excFnc;
                END IF;
            END;
        END IF;
    END IF; 

    FOR Rec_T_PAST_ONEROUS_CONS IN CUR_T_PAST_ONEROUS_CONS LOOP
        wnumTotalCount := wnumTotalCount + 1;
        wblnWarnFlg    := FALSE;
        wblnErrorFlg   := FALSE;
 
        BEGIN
            --//為替レート取得する
            BEGIN
                SELECT
                    C.EXCH_RATE
                INTO 
                    wnumExchRate
                FROM
                    (SELECT
                         A.EXCH_RATE                                                --[為替レートマスタ]
                     FROM
                         M_EXCH_RATE    A,                                          --[為替レートマスタ]
                         SYS_MY_COMPANY B                                           --[自社]
                     WHERE
                         A.COMPANY_CD      =  B.COMPANY_CD                          --[為替レートマスタ]."会社コード" = 自社コード
                     AND A.CUR_CD          =  Rec_T_PAST_ONEROUS_CONS.CUR_CD        --[取得データ]．"通貨コード"
                     AND A.EXCH_TYP        =  Rec_T_PAST_ONEROUS_CONS.EXCH_TYP      --[取得データ]．"為替種別" 
                     AND A.EXCH_START_DATE <= Rec_T_PAST_ONEROUS_CONS.ISSUE_DATE    --[取得データ]．"売上計上日"
                     AND B.CTRL_CD         =  'SYSTEM'                              --[自社]."SYSコントロールコード"  = SYSTEM
                     ORDER BY
                         A.EXCH_START_DATE DESC) C
                 WHERE
                     ROWNUM = 1; 
            EXCEPTION
                WHEN NO_DATA_FOUND THEN
                    wnumExchRate := 0;
                    vc2Comment:= SUBSTR('(SBM0305)為替レート取得ワーニング　'||
                                        '伝票番号['|| Rec_T_PAST_ONEROUS_CONS.ONEROUS_CONS_NO ||']　'|| 
                                        '分納項番['|| 1 ||']', 1, 256);

                    /* TraceLog の出力 */
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                                          pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_EXCH_RATE);

                    /* 業務終了メッセージの出力 */
                    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                        pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_EXCH_RATE, vc2Comment);

                    wblnWarnFlg := TRUE;
                 WHEN OTHERS THEN
                    --//エラーのフラグを設定する
                    wblnErrorFlg   := TRUE;
                    --//下記よう処理エラーログ情報を[業務メッセージ]に登録して、処理を中断する
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                                          pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_RATE_ERROR);
                    /* 業務終了メッセージの出力 */
                    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                        pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_RATE_ERROR, SQLERRM);
                    --//標識へ
                    GOTO MASK;
            END;
            
            --//売上実績金額、税抜売上金額、外税対象金額、内税対象金額、内税消費税、非課税対象金額　の計算
            blnRet := FNCCALCTAXCALCAMTFD(
                                          UTL_FileHandle                                                                   --ファイルハンドル
                                         ,pvc2LogMode                                                                      --ＬＯＧモード
                                         ,pvc2OutputMode                                                                   --出力モード
                                         ,pvc2UserId                                                                       --ユーザＩＤ
                                         ,pvc2BusinessName                                                                 --業務名
                                         ,pvc2PlantCd                                                                      --工場コード
                                         ,SUBSTR(Rec_T_PAST_ONEROUS_CONS.TAX_CD, -1)                                       --消費税コード”の下１桁
                                         ,Rec_T_PAST_ONEROUS_CONS.NEW_TAX_RATE_1                                           --税率1
                                         ,Rec_T_PAST_ONEROUS_CONS.NEW_TAX_RATE_2                                           --税率2
                                         ,Rec_T_PAST_ONEROUS_CONS.NEW_TAX_RATE_3                                           --税率3
                                         ,Rec_T_PAST_ONEROUS_CONS.ROUND_TYP                                                --発注金額まるめ区分
                                         ,Rec_T_PAST_ONEROUS_CONS.DECIMAL_FIG                                              --小数桁数
                                         ,TO_NUMBER(Rec_T_PAST_ONEROUS_CONS.UNIT_COST * Rec_T_PAST_ONEROUS_CONS.ISSUE_QTY) --単価×出庫数
                                         ,wnumTaxAmount1                                                                   --税額1
                                         ,wnumTaxAmount2                                                                   --税額2
                                         ,wnumTaxAmount3                                                                   --税額3
                                         ,wnumTaxOutAmount                                                                 --税抜金額
                                         ,wnumTaxAmount                                                                    --消費税額
                                         ,wnumTaxInAmount                                                                  --税込金額
                                         ,wnumExternalTaxSalesAmount                                                       --外税対象金額
                                         ,wnumInternalTaxSalesAmount                                                       --内税対象金額
                                         ,wnumTaxFreeSalesAmount                                                           --非課税対象金額
                                         ,wnumExternalTaxAmount                                                            --消費税額（外税）
                                         ,wnumInternalTaxAmount                                                            --消費税額（内税）
                                         ,pvc2ErrorCd                                                                      --エラーメッセージID
                                         ,pnumStatus                                                                       --結果ステータス（1：正常終了 2:警告終了 3：異常終了）
            );

            --異常
            IF pnumStatus = 3 OR blnRet = FALSE THEN
                vc2Comment:= SUBSTR('(SBM0306)税計算異常　有償支給番号['|| Rec_T_PAST_ONEROUS_CONS.ONEROUS_CONS_NO || ']', 1, 256);

                /* TraceLog の出力 */
                blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                                      pvc2PlantCd, MY_SQL_NAME, vc2Comment);

                /* 業務終了メッセージの出力 */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                    pvc2PlantCd, MY_SQL_NAME, pvc2ErrorCd, vc2Comment);

                wblnErrorFlg := TRUE;
                --//標識へ
                GOTO MASK;
                
            END IF;


            --ワーニング
            IF pnumStatus = 2 THEN
                vc2Comment:= SUBSTR('(SBM0307)税計算計算ワーニング　有償支給番号['|| Rec_T_PAST_ONEROUS_CONS.ONEROUS_CONS_NO || ']', 1, 256);

                /* TraceLog の出力 */
                blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                                      pvc2PlantCd, MY_SQL_NAME, vc2Comment);
                /* 業務終了メッセージの出力 */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                    pvc2PlantCd, MY_SQL_NAME, pvc2ErrorCd, vc2Comment);

                wblnWarnFlg := TRUE;
            END IF;               

            --売上実績金額を取得する
            wnumSalesAmount := wnumTaxInAmount;

            --//売上実績金額(邦貨)の計算
            blnRet := FNCGETROUND4FD(
                                     UTL_FileHandle                             --ファイルハンドル
                                    ,pvc2LogMode                                --ＬＯＧモード
                                    ,pvc2OutputMode                             --出力モード
                                    ,pvc2UserId                                 --ユーザＩＤ
                                    ,pvc2BusinessName                           --業務名
                                    ,pvc2PlantCd                                --工場コード
                                    ,TO_NUMBER(wnumSalesAmount * wnumExchRate)  --売上実績金額 × 為替レート
                                    ,Rec_T_PAST_ONEROUS_CONS.DECIMAL_FIG        --小数桁数
                                    ,Rec_T_PAST_ONEROUS_CONS.ROUND_TYP          --発注金額まるめ区分
                                    ,wnumSalesAmounExchRates                    --売上実績金額(邦貨)
                                    ,pvc2ErrorCd                                --エラーメッセージID
                                    ,pnumStatus                                 --結果ステータス（1：正常終了 2:警告終了 3：異常終了）
            );

            --異常
            IF pnumStatus = 3 OR blnRet = FALSE THEN
                vc2Comment:= SUBSTR('(SBM0315)検収金額（邦貨）計算異常　有償支給番号['|| Rec_T_PAST_ONEROUS_CONS.ONEROUS_CONS_NO || ']', 1, 256);

                /* TraceLog の出力 */
                blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                                      pvc2PlantCd, MY_SQL_NAME, vc2Comment);

                /* 業務終了メッセージの出力 */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                    pvc2PlantCd, MY_SQL_NAME, pvc2ErrorCd, vc2Comment);

                wblnErrorFlg := TRUE;
                --//標識へ
                GOTO MASK;
            END IF;

            --ワーニング
            IF pnumStatus = 2 THEN
                vc2Comment:= SUBSTR('(SBM0315)検収金額（邦貨）計算異常　有償支給番号['|| Rec_T_PAST_ONEROUS_CONS.ONEROUS_CONS_NO || ']', 1, 256);

                /* TraceLog の出力 */
                blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                                      pvc2PlantCd, MY_SQL_NAME, vc2Comment);

                /* 業務終了メッセージの出力 */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                    pvc2PlantCd, MY_SQL_NAME, pvc2ErrorCd, vc2Comment);

                wblnWarnFlg := TRUE;
            END IF;

            --//税抜売上金額（邦貨）の計算
            blnRet := FNCGETROUND4FD(
                                     UTL_FileHandle                                 --ファイルハンドル
                                    ,pvc2LogMode                                    --ＬＯＧモード
                                    ,pvc2OutputMode                                 --出力モード
                                    ,pvc2UserId                                     --ユーザＩＤ
                                    ,pvc2BusinessName                               --業務名
                                    ,pvc2PlantCd                                    --工場コード
                                    ,TO_NUMBER(wnumTaxOutAmount * wnumExchRate)     --税抜売上金額 × 為替レート
                                    ,Rec_T_PAST_ONEROUS_CONS.DECIMAL_FIG            --小数桁数
                                    ,Rec_T_PAST_ONEROUS_CONS.ROUND_TYP              --発注金額まるめ区分
                                    ,wnumTaxCreditAmountExchRates                   --税抜売上金額(邦貨)
                                    ,pvc2ErrorCd                                    --エラーメッセージID
                                    ,pnumStatus                                     --結果ステータス（1：正常終了 2:警告終了 3：異常終了）
            );

            --異常
            IF pnumStatus = 3 OR blnRet = FALSE THEN
                vc2Comment:= SUBSTR('(SBM0315)検収金額（邦貨）計算異常　有償支給番号['|| Rec_T_PAST_ONEROUS_CONS.ONEROUS_CONS_NO || ']', 1, 256);

                /* TraceLog の出力 */
                blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                                      pvc2PlantCd, MY_SQL_NAME, vc2Comment);

                /* 業務終了メッセージの出力 */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                    pvc2PlantCd, MY_SQL_NAME, pvc2ErrorCd, vc2Comment);

                wblnErrorFlg := TRUE;
                --//標識へ
                GOTO MASK;
            END IF;

            --ワーニング
            IF pnumStatus = 2 THEN
                vc2Comment:= SUBSTR('(SBM0315)検収金額（邦貨）計算異常　有償支給番号['|| Rec_T_PAST_ONEROUS_CONS.ONEROUS_CONS_NO || ']', 1, 256);

                /* TraceLog の出力 */
                blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                                      pvc2PlantCd, MY_SQL_NAME, vc2Comment);

                /* 業務終了メッセージの出力 */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                    pvc2PlantCd, MY_SQL_NAME, pvc2ErrorCd, vc2Comment);

                wblnWarnFlg := TRUE;
            END IF;

            --//[売掛情報インタフェース]へ登録する
            BEGIN
                INSERT INTO T_AI_AR_IF(
                                       INPUT_SLIP_CD                                    --入力伝票番号
                                      ,SLIP_ROW_NO                                      --伝票行番号
                                      ,SLIP_CD                                          --伝票番号
                                      ,PART_DLV_SEQ_NO                                  --分納項番
                                      ,PUCH_ODR_CD                                      --発注番号
                                      ,PROCESS_TYP                                      --処理区分
                                      ,SLIP_TYP                                         --伝票区分
                                      ,AR_DATA_TYP                                      --売掛データ区分
                                      ,SALES_DATE                                       --売上計上日
                                      ,CUST_CD                                          --得意先コード
                                      ,PLANT_CD                                         --工場コード
                                      ,SALES_DEPT_CD                                    --売上計上部門
                                      ,CURRNCY_CD                                       --通貨コード
                                      ,EXCH_TYP                                         --為替種別
                                      ,EXCH_RATE                                        --為替レート
                                      ,EXCH_RESERVE_CD                                  --為替予約コード
                                      ,TAX_CMP_TYP                                      --税算出区分
                                      ,CLOSING_TYP                                      --請求締区分
                                      ,SALES_TYP                                        --取引区分
                                      ,CUST_ITEM_CD                                     --得意先品目番号
                                      ,CUST_ITEM_NAME                                   --得意先品目名称
                                      ,ITEM_CD                                          --品目番号
                                      ,ITEM_NAME                                        --品目名称
                                      ,SALES_QTY                                        --売上実績数量
                                      ,UNIT_CD                                          --単位
                                      ,SALES_UNIT_PRICE                                 --単価
                                      ,SALES_AMOUNT                                     --売上実績金額
                                      ,SALES_AMOUNT_EXCH_RATES                          --売上実績金額(邦貨)
                                      ,TAX_CREDIT_AMOUNT                                --税抜売上金額
                                      ,TAX_CREDIT_AMOUNT_EXCH_RATES                     --税抜売上金額(邦貨)
                                      ,TAX_INT_EXT_TYP                                  --消費税内外区分
                                      ,TAX_CD                                           --消費税コード
                                      ,EXTERNAL_TAX_SALES_AMOUNT                        --外税対象金額
                                      ,EXTERNAL_TAX_AMOUNT                              --外税消費税
                                      ,INTERNAL_TAX_SALES_AMOUNT                        --内税対象金額
                                      ,INTERNAL_TAX_AMOUNT                              --内税消費税
                                      ,TAXFREE_SALES_AMOUNT                             --非課税対象金額
                                      ,RETRIEVE_FLG                                     --取込フラグ
                                      ,CREATED_DATE                                     --作成日
                                      ,CREATED_BY                                       --作成者
                                      ,CREATED_PRG_NM                                   --作成プログラム名
                                      ,UPDATED_DATE                                     --更新日
                                      ,UPDATED_BY                                       --更新者
                                      ,UPDATED_PRG_NM                                   --更新プログラム
                                      ,MODIFY_COUNT                                     --更新数
                                      )
                               VALUES (
                                       SEQ_INPUTDENNO_CREDIT.NEXTVAL                    --採番された入力伝票番号
                                      ,1                                                --伝票行番号
                                      ,Rec_T_PAST_ONEROUS_CONS.ONEROUS_CONS_NO          --伝票番号
                                      ,1                                                --分納項番
                                      ,Rec_T_PAST_ONEROUS_CONS.PUCH_ODR_CD              --発注番号
                                      ,0                                                --処理区分
                                      ,0                                                --伝票区分
                                      ,4                                                --売掛データ区分
                                      ,Rec_T_PAST_ONEROUS_CONS.ISSUE_DATE               --売上計上日
                                      ,Rec_T_PAST_ONEROUS_CONS.VEND_CD                  --得意先コード
                                      ,Rec_T_PAST_ONEROUS_CONS.PLANT_CD                 --工場コード
                                      ,NULL                                             --売上計上部門
                                      ,Rec_T_PAST_ONEROUS_CONS.CUR_CD                   --通貨コード
                                      ,Rec_T_PAST_ONEROUS_CONS.EXCH_TYP                 --為替種別
                                      ,wnumExchRate                                     --為替レート
                                      ,NULL                                             --為替予約コード
                                      ,1                                                --税算出区分
                                      ,0                                                --請求締区分
                                      ,NULL                                             --取引区分
                                      ,NULL                                             --得意先品目番号
                                      ,NULL                                             --得意先品目名称
                                      ,Rec_T_PAST_ONEROUS_CONS.ITEM_CD                  --品目番号
                                      ,Rec_T_PAST_ONEROUS_CONS.ITEM_NAME                --品目名称
                                      ,Rec_T_PAST_ONEROUS_CONS.ISSUE_QTY                --売上実績数量
                                      ,Rec_T_PAST_ONEROUS_CONS.STOCK_UNIT               --単位
                                      ,Rec_T_PAST_ONEROUS_CONS.UNIT_COST                --単価
                                      ,wnumSalesAmount                                  --売上実績金額
                                      ,wnumSalesAmounExchRates                          --売上実績金額(邦貨)
                                      ,wnumTaxOutAmount                                 --税抜売上金額
                                      ,wnumTaxCreditAmountExchRates                     --税抜売上金額(邦貨)
                                      ,CASE
                                           WHEN SUBSTR(Rec_T_PAST_ONEROUS_CONS.TAX_CD, -1) = '1' THEN
                                               1                                         --１（外税）
                                           WHEN SUBSTR(Rec_T_PAST_ONEROUS_CONS.TAX_CD, -1) = '5' THEN
                                               2                                         --2（内税）
                                           WHEN SUBSTR(Rec_T_PAST_ONEROUS_CONS.TAX_CD, -1) <> '1' AND SUBSTR(Rec_T_PAST_ONEROUS_CONS.TAX_CD, -1) <> '5' THEN
                                               0                                        --0（非課税）
                                       END                                              --消費税内外区分
                                      ,Rec_T_PAST_ONEROUS_CONS.TAX_CD                   --消費税コード
                                      ,wnumExternalTaxSalesAmount                       --外税対象金額
                                      ,wnumExternalTaxAmount                            --外税消費税
                                      ,wnumInternalTaxSalesAmount                       --内税対象金額
                                      ,wnumInternalTaxAmount                            --内税消費税
                                      ,wnumTaxFreeSalesAmount                           --非課税対象金額
                                      ,0                                                --取込フラグ
                                      ,SYSDATE                                          --作成日
                                      ,pvc2UserId                                       --作成者
                                      ,pvc2BusinessName                                 --作成プログラム名
                                      ,SYSDATE                                          --更新日
                                      ,pvc2UserId                                       --更新者
                                      ,pvc2BusinessName                                 --更新プログラム
                                      ,0                                                --更新数
                                      );        
            EXCEPTION
                WHEN OTHERS THEN
                    /* TraceLog の出力 */
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                                          pvc2PlantCd, MY_SQL_NAME, SQLERRM);

                    /* 業務終了メッセージの出力 */
                    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                        pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_AI_AR_IF_INS, SQLERRM);

                     wblnErrorFlg := TRUE;
                     --//標識へ
                     GOTO MASK;
            END;

            --//[有償支給履歴]の更新処理
            BEGIN
                UPDATE T_PAST_ONEROUS_CONS SET
                    AI_AR_IF_FLG    =1                                                  --Ai売掛インタフェースフラグ
                   ,UPDATED_DATE    = SYSDATE                                           --更新日
                   ,UPDATED_BY      = pvc2UserId                                        --更新者
                   ,UPDATED_PRG_NM  = pvc2BusinessName                                  --更新プログラム
                   ,MODIFY_COUNT    = MODIFY_COUNT + 1                                  --更新数
                WHERE
                    ONEROUS_CONS_NO = Rec_T_PAST_ONEROUS_CONS.ONEROUS_CONS_NO;          --有償支給番号
            EXCEPTION
                WHEN OTHERS THEN
                    /* TraceLog の出力 */
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                                          pvc2PlantCd, MY_SQL_NAME, SQLERRM);

                    /* 業務終了メッセージの出力 */
                    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                        pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_PAST_UPD, SQLERRM);

                     wblnErrorFlg := TRUE;
                     --//標識へ
                     GOTO MASK;
            END;

            --//標識        
            <<MASK>>
            --//エラが存在した時
            IF wblnErrorFlg = TRUE THEN
                --//エラー件数 = エラー件数 + 1
                wnumErrorCount := wnumErrorCount + 1;
            ELSE
                --//ワーニングが存在した時
                IF wblnWarnFlg = TRUE THEN
                    --//ワーニング件数 = ワーニング件数 + 1
                    wnumWarnCount := wnumWarnCount + 1;
                ELSE
                    --//正常件数 = 正常件数 + 1
                    wnumNormalCount := wnumNormalCount + 1;
                END IF;
            END IF;

        EXCEPTION
            WHEN OTHERS THEN
                /* TraceLog の出力 */
                blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                                          pvc2PlantCd, MY_SQL_NAME, SQLERRM);

                /* 業務終了メッセージの出力 */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                        pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_READ_FAIL, SQLERRM);
        END;
           
    END LOOP;
   
--有償支給金額＝０のデータの場合、のAi売掛インタフェースフラグを更新処理
    --//売上実績金額＝０の売上データ件数を取得する
    SELECT COUNT(*) INTO wnumCount0
    FROM T_PAST_ONEROUS_CONS
    WHERE     AI_AR_IF_FLG = 0
          AND (ISSUE_QTY    =0 OR UNIT_COST    =0);

    UPDATE T_PAST_ONEROUS_CONS SET
               AI_AR_IF_FLG     =1,                     --Ai売掛インタフェースフラグ       １（インタフェース済）
               UPDATED_DATE     = SYSDATE,              --更新日	        Sysdate
               UPDATED_BY       = pvc2UserId,           --更新者	        引数．ユーザＩＤ
               UPDATED_PRG_NM   = pvc2BusinessName,     --更新プログラム	引数．業務名
               MODIFY_COUNT     = MODIFY_COUNT + 1      --更新数	        更新数＋１
    WHERE     AI_AR_IF_FLG = 0
          AND (ISSUE_QTY    =0 OR UNIT_COST    =0);

    wnumTotalCount:=wnumTotalCount+wnumCount0;
    wnumNormalCount:=wnumNormalCount+wnumCount0;

    --正常の場合
    vc2Comment:= SUBSTR('(SBM0316)<< Ａｉ連携売掛インタフェース処理正常終了>>　'||
                        '対象件数：['       || wnumTotalCount  || ']　'||
                        '正常件数：['       || wnumNormalCount || ']　'||
                        'ワーニング件数：[' || wnumWarnCount   || ']　'|| 
                        '異常件数：[ '      || wnumErrorCount  || ']　' , 1, 256);

    /* TraceLog の出力 */
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, vc2Comment);

    /* 業務終了メッセージの出力 */
    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                        pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_END, vc2Comment);

    COMMIT;

EXCEPTION
    WHEN excFncTraceLog THEN        
        pnumStatus := STATUS_ERROR;
        
        /* LogFile の CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);
        
    WHEN excCommonChk THEN        
        pnumStatus := STATUS_ERROR;
        pvc2ErrorCd:= LOGMSG_ID_COMMON_CHK;
        
        /* LogFile の CLOSE */
        /* TraceLog の出力 */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_COMMON_CHK);
                          
        /* 業務終了メッセージの出力 */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                            pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_COMMON_CHK, LOGMSG_NM_COMMON_CHK);

        /* LogFile の CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

    WHEN excFnc THEN
        pnumStatus := STATUS_ERROR;
        pvc2ErrorCd:= LOGMSG_ID_AI_AR_FAIL;
        /* LogFile の CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);
        ROLLBACK;

    WHEN OTHERS THEN
        --異常処理
        /* TraceLog の出力 */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                              pvc2PlantCd, MY_SQL_NAME, '');

        /* 業務終了メッセージの出力 */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                            pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_ERR, '');
        ROLLBACK;

END;
/
