CREATE OR REPLACE FUNCTION FncCreditInformationToAiJ(
/*------------------------------------------------------------------------------
'
' FncCreditInformationToAiJ.Sql
'
' version   : 1.00.00
'
' 修正履歴
'
' 機能      : J売上情報取込処理
'
' 引き数    : UTL_FileHandle       - (i)ファイルハンドル
'             pvc2LogMode          - (i)ＬＯＧモード'
'             pvc2OutputMode       - (i)出力モード'
'             pvc2UserId           - (i)ユーザＩＤ
'             pvc2BusinessName     - (i)業務名
'             pvc2PlantCd          - (i)工場コード
'             pnumTotalCount       - (o)処理データ件数
'             pnumNormalCount      - (o)正常件数
'             pnumWarnCount        - (o)ワーニング件数
'             pnumErrorCount       - (o)異常件数
'             pvc2ErrorCd          - (o)エラーコード
'             pnumStatus           - (o)結果ステータス
'
' 機能説明  : EXPLANNER/J（Ｊｆ／Ｊa）の[売上実績]、[売上実績ヘッダ]、[有償支給履歴]から売掛情報を集約して、Aｉ連携売掛インタフェースにデータ登録する。
'
' 備考      : 特になし
'
------------------------------------------------------------------------------*/
   UTL_FileHandle               IN  UTL_FILE.FILE_TYPE  --ファイルハンドル
   ,pvc2LogMode                 IN  VARCHAR2            --ＬＯＧモード
   ,pvc2OutputMode              IN  VARCHAR2            --出力モード
   ,pvc2UserId                  IN  VARCHAR2            --ユーザＩＤ
   ,pvc2BusinessName            IN  VARCHAR2            --業務名
   ,pvc2PlantCd                 IN  VARCHAR2            --工場コード
   ,pnumTotalCount              OUT NUMBER              --処理データ件数
   ,pnumNormalCount             OUT NUMBER              --正常件数
   ,pnumWarnCount               OUT NUMBER              --ワーニング件数
   ,pnumErrorCount              OUT NUMBER              --異常件数
   ,pvc2ErrorCd                 OUT VARCHAR2            --エラーコード
   ,pnumStatus                  OUT NUMBER              --結果ステータス（1:正常終了、2:ワーニング終了、3:異常終了）
) RETURN BOOLEAN 
IS

/* 定数の宣言 */

    MY_SQL_NAME                           VARCHAR2(120):= 'FNCCREDITINFORMATIONTOAIJ';  --ＰＬ／ＳＱＬ名
    LOGMSG_START                          VARCHAR2(20) := 'Start';                      --ログ用メソッド開始宣言
    LOGMSG_END                            VARCHAR2(12) := 'End';                        --ログ用メソッド終了宣言
    LOGMSG_ERR                            VARCHAR2(32) := '異常終了';

    --//業務ログ用メッセージID
    LOGMSG_ID_COMMON_CHK                  VARCHAR2(28) := 'BF00011';    --引数が不正のため処理ができませんでした。
    LOGMSG_ID_READ_FAIL                   VARCHAR2(28) := 'BF00012';    --Ａｉ連携売掛インタフェース情報の読込に失敗しました。
    LOGMSG_ID_RATE_FAIL                   VARCHAR2(28) := 'BF00017';    --為替レートが取得できませんでした。 
    LOGMSG_ID_RATE_ERROR                  VARCHAR2(28) := 'BF00022';    --為替レート取得処理でエラーが発生しました。
    LOGMSG_ID_AI_AR_IF_INS                VARCHAR2(28) := 'BF00013';    --Ａｉ連携売掛インタフェース情報の登録に失敗しました。
    LOGMSG_ID_AI_AR_IF_DEL                VARCHAR2(28) := 'BF00023';    --売上実績情報赤黒伝票相殺処理が失敗しました。
    LOGMSG_ID_T_SALES_UPD                 VARCHAR2(28) := 'BF00014';    --売上実績更新処理が失敗しました。
    LOGMSG_ID_END_ERR                     VARCHAR2(28) := 'BF00018';    --売上情報取込に失敗しました。

    --//業務ログ用メッセージ
    LOGMSG_NM_COMMON_CHK                  VARCHAR2(200) := '(SBM0017)引数が不正のため処理ができませんでした。';  
    LOGMSG_NM_READ_FAIL                   VARCHAR2(200) := 'Ａｉ連携売掛インタフェース情報の読込に失敗しました。';
    LOGMSG_NM_RATE_FAIL                   VARCHAR2(200) := '(SBM0718)為替レートが取得できませんでした。' ;
    LOGMSG_NM_RATE_ERROR                  VARCHAR2(200) := '(SBM0719)為替レート取得処理でエラーが発生しました。';
    LOGMSG_NM_AI_AR_IF_INS                VARCHAR2(200) := '(SBM0721)Ａｉ連携売掛インタフェース情報の登録に失敗しました。';
    LOGMSG_NM_AI_AR_IF_DEL                VARCHAR2(200) := '(SBM0720)売上実績情報赤黒伝票相殺処理に失敗しました。';
    LOGMSG_NM_T_SALES_UPD                 VARCHAR2(200) := '(SBM0018)売上実績更新処理が失敗しました。';
    LOGMSG_NM_END_ERR                     VARCHAR2(200) := '(SBM0019)売上情報取込に失敗しました。';

    --//結果ステータス
    STATUS_NORMAL                         NUMBER        := 1;      -- 正常終了
    STATUS_WARNING                        NUMBER        := 2;      -- ワーニング
    STATUS_ERROR                          NUMBER        := 3;      -- 異常終了

/* 変数の宣言 WORK */
   -- UTL_FileHandle             UTL_FILE.FILE_TYPE;               --ファイルハンドル
    --//自定義異常
    excFncTraceLog                         EXCEPTION;              --ログを書き失敗
    excCommonChk                           EXCEPTION;              --共通引数失敗

    LOGMSG_NM_END                          VARCHAR2(200);          --処理終了宣言

    blnRet                                 BOOLEAN;                --共通関数の戻値

    --//詳細メッセージ格納用
    vc2Comment                             VARCHAR2(1024);
    
    --//内部変数の宣言
    wnumExitFlg                            NUMBER;                 --データ存在のフラグ
    wnumExchRate                           NUMBER;                 --為替レート
    wnumInputSlipCd                        NUMBER;                 --前回処理データの入力伝票番号
    wvc2SlipCd                             VARCHAR2(100);          --前回処理データの伝票番号
    wvc2CustItemCd                         VARCHAR2(140);          --得意先品目番号
    wvc2CustItemName                       VARCHAR2(160);          --得意先品目名称
    wvc2HomeCurCd                          VARCHAR2(100);          --邦貨コード
    wblnWarnFlg                            BOOLEAN;                --ワーニングのフラグ
    wblnErrorFlg                           BOOLEAN;                --エラーのフラグ
    wnumAmount                             NUMBER;                 --売上実績金額
    wnumAmountJP                           NUMBER;                 --売上実績金額(邦貨)
    wnumCount0                             NUMBER;                 --売上実績金額＝０のデータ件数


/* カーソルの宣言*/
    --//Ai売掛情報インタフェース
    CURSOR CUR_T_AI_AR_IF_LOCK
    IS
    SELECT
        INPUT_SLIP_CD
    FROM
        T_AI_AR_IF
    FOR UPDATE NOWAIT;

    --//[売上実績]/ [売上実績ヘッダ]を検索し
    CURSOR CUR_T_SALES
    IS 
    SELECT
        A.SLIP_CD,                                                  --[売上実績]."伝票番号"
        A.SALES_SEQ_NO,                                             --[売上実績]."売上実績管理番号"
        A.SALES_DATE,                                               --[売上実績]."売上計上日"
        A.CUST_CD,                                                  --[売上実績]."得意先コード"
        A.CURRNCY_CD,                                               --[売上実績]."通貨コード" 
        B.EXCH_TYP,                                                 --[得意先]."為替種別"
        A.ITEM_CD,                                                  --[売上実績]."品目番号"
        C.ITEM_NAME,                                                --[品目]."品目名称"
        E.CUST_ITEM_CD,                                             --[製品]."得意先品目番号"
        E.CUST_ITEM_NAME,                                           --[製品]."得意先品目名称"
        A.SALES_QTY,                                                --[売上実績]."売上実績数量"
        A.UNIT_CD,                                                  --[売上実績]."単位" 
        A.SALES_UNIT_PRICE,                                         --[売上実績]."単価"
        A.SALES_AMOUNT,                                             --[売上実績]."売上実績金額"
        A.SALES_AMOUNT_EXCH_RATES,                                  --[売上実績]."売上実績金額(邦貨)"
        A.TAX_CREDIT_SALES_AMOUNT,                                  --[売上実績]."税抜売上金額"
        A.OWN_CUR_TAXCREDIT_SALES_AMOUNT,                           --[売上実績]."税抜売上金額（邦貨）"
        --Mod Start 20140113 LILI
        --B.TAX_CD,                                                   --[得意先]."消費税コード"
        NVL(G.TAX_CD,(DECODE(B.TAX_APPLY_TYP,'1',E.TAX_CD,'2',B.TAX_CD,B.TAX_CD))) AS TAX_CD,
                                                                    --[受注明細].”消費税コード” が NULL以外の場合、[受注明細].”消費税コード”
                                                                    --上記以外、[得意先].“消費税適用区分” = １ (製品マスタの消費税コード) の場合、[製品].”消費税コード”
                                                                    --          [得意先].“消費税適用区分” = ２ (得意先マスタの消費税コード) の場合、[得意先].”消費税コード”
                                                                    --          上記以外の場合、[得意先].”消費税コード”
        --Mod End   20140113 LILI
        A.EXTERNAL_TAX_SALES_AMOUNT,                                --[売上実績]."外税対象金額"
        A.EXTERNAL_TAX_AMOUNT,                                      --[売上実績]."消費税額（外税）"
        A.INTERNAL_TAX_SALES_AMOUNT,                                --[売上実績]."内税対象金額"
        A.INTERNAL_TAX_AMOUNT,                                      --[売上実績]."内税消費税"
        A.TAXFREE_SALES_AMOUNT,                                     --[売上実績]."非課税対象金額",
        A.INSPC_ACPT_TYP,                                           --[売上実績]."検収区分"
        A.SALES_TYP,                                                --[売上実績]."売上区分"
        A.SALES_DEPT_CD,                                            --[売上実績]."売上計上部門"
        D.DECIMAL_FIG,                                              --[通貨]."小数桁数"
        B.DETAIL_ROUND_TYP                                          --[得意先]."明細計算まるめ区分"
    FROM
        T_SALES        A,                                           --[売上実績]
        M_CUST         B,                                           --[得意先]
        M_ITEM         C,                                           --[品目]
        M_CUR          D,                                           --[通貨]
        --Add Start 20140113 LILI
        T_SHIP_ODR     F,                                           --[出荷指示]
        T_ODR          G,                                           --[受注明細]
        --Add End   20140113 LILI
        (SELECT * FROM M_ITEM_SPEC WHERE COMPANY_CD IN (SELECT COMPANY_CD FROM SYS_MY_COMPANY WHERE CTRL_CD='SYSTEM')) E --[製品]
    WHERE
        A.CUST_CD      = B.CUST_CD                                  --[売上実績]."得意先コード"      = [得意先]."得意先コード"
    AND A.ITEM_CD      = C.ITEM_CD                                  --[売上実績]."品目番号" 　　     = [品目]."品目番号"
    AND A.CURRNCY_CD   = D.CUR_CD                                   --[売上実績]."通貨コード"　      = [通貨]. "通貨コード"
    AND A.ITEM_CD      = E.ITEM_CD(+)                               --[売上実績]."品目番号"    　　  = [製品]."品目番号"
    AND A.CUST_CD      = E.CUST_CD(+)                               --[売上実績]."得意先コード"　　  = [製品]."得意先コード"
    AND A.AI_AR_IF_FLG = 0                                          --[売上実績]."Ai売掛インタフェースフラグ"        = 0（インタフェース未）
    AND A.APPR_FLG     = 3                                          --[売上実績]."承認状況"          = 3（承認済み）
    AND A.STATUS       = 20                                         --[売上実績]."状態区分”         = 20:売掛計上予定
    AND A.SALES_AMOUNT <>0 
    --Add Start 20140113 LILI
    AND A.SHIP_ODR_NO  = F.SHIP_ODR_NO(+)                           --[売上実績].”出荷指示番号”    = [出荷指示].”出荷指示番号”(+)
    AND F.ODR_NO       = G.ODR_NO(+)                                --[出荷指示].”受注番号”        = [受注明細].”受注番号” (+)
    --Add End   20140113 LILI
    ORDER BY
        A.SLIP_CD,                                                  --[売上実績]."伝票番号"
        A.SALES_SEQ_NO;                                             --[売上実績]."売上実績管理番号"

BEGIN
    /* TraceLogの出力(Start)処理を行う */
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, LOGMSG_START);

    IF (NOT blnRet) THEN        
        --//結果ステータスが異常をセットする
        pnumStatus := STATUS_ERROR;
        RAISE excFncTraceLog;
    END IF;

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
    pnumTotalCount   := 0;
    pnumNormalCount  := 0;
    pnumWarnCount    := 0;
    pnumErrorCount   := 0;
    
    --//邦貨コードを取得する
    BEGIN
        SELECT
            HOME_CUR_CD
        INTO
            wvc2HomeCurCd
        FROM
            SYS_HOME_CUR
        WHERE
            CTRL_CD = 'SYSTEM';
    EXCEPTION
        WHEN OTHERS THEN
            RAISE;
    END;
    
    --//Ａｉ売掛情報インタフェースをロックする
    OPEN CUR_T_AI_AR_IF_LOCK;

    FOR Rec_T_SALES IN CUR_T_SALES LOOP

        --対象件数 = 対象件数 + 1
        pnumTotalCount := pnumTotalCount + 1;
        --ワーニングのフラグを設定する
        wblnWarnFlg    := FALSE;
        --エラーのフラグを設定する
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
                         A.EXCH_RATE                                                     --[為替レートマスタ]
                     FROM
                         M_EXCH_RATE    A,                                               --[為替レートマスタ]
                         SYS_MY_COMPANY B                                                --[自社]
                     WHERE
                         A.COMPANY_CD      =  B.COMPANY_CD                               --[為替レートマスタ]."会社コード" = 自社コード
                     AND A.CUR_CD          =  Rec_T_SALES.CURRNCY_CD                     --[取得データ]．"通貨コード"
                     AND A.EXCH_TYP        =  Rec_T_SALES.EXCH_TYP                       --[取得データ]．"為替種別" 
                     AND A.EXCH_START_DATE <= Rec_T_SALES.SALES_DATE                     --[取得データ]．"売上計上日"
                     AND B.CTRL_CD         =  'SYSTEM'                                   --[自社]."SYSコントロールコード"  = SYSTEM
                     ORDER BY
                         A.EXCH_START_DATE DESC) C
                     WHERE
                         ROWNUM <= 1;
            EXCEPTION
                --//為替レートを取得できない場合、為替レート＝０で　処理を続行する
                WHEN NO_DATA_FOUND THEN
                    --//ワーニングのフラグを設定する
                    wblnWarnFlg   := TRUE;
                    --//為替レートを取得できない場合、為替レート＝０で　処理を続行する
                    wnumExchRate  := 0;
                    vc2Comment:= SUBSTR('(SBM0014)為替レート取得ワーニング　伝票番号 ['|| Rec_T_SALES.SLIP_CD  ||']'||
                                                                  '分納項番 ['|| Rec_T_SALES.SLIP_CD  ||']'||
                                                                  '売上実績管理番号 ['|| Rec_T_SALES.SALES_SEQ_NO ||']', 1, 256);
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                                          pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_RATE_FAIL);
                    /* 業務終了メッセージの出力 */
                    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                        pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_RATE_FAIL, vc2Comment);

                --//異常処理
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

            --//得意先品目番号/得意先品目名取得する
            BEGIN
                SELECT
                    NVL(CUST_ITEM_CD, Rec_T_SALES.CUST_ITEM_CD),                                --[出荷実績]."得意先品目番号"
                    NVL(CUST_ITEM_NAME, Rec_T_SALES.CUST_ITEM_NAME)                             --[出荷実績]."得意先品目名称"
                INTO
                    wvc2CustItemCd,                                                               --得意先品目番号
                    wvc2CustItemName                                                              --得意先品目名称
                FROM
                    (SELECT
                        C.CUST_ITEM_CD AS "CUST_ITEM_CD",
                        C.CUST_ITEM_NAME AS "CUST_ITEM_NAME"
                     FROM
                         (SELECT
                         ODR_NO                                                                   --[出荷実績]."受注番号"
                     FROM
                         T_SHIP
                     WHERE
                         SLIP_CD = Rec_T_SALES.SLIP_CD                                            --[出荷実績]."伝票番号" = [取得データ]."伝票番号"
                     ORDER BY 
                         SHIP_SEQ_NO DESC) A,
                      T_ODR B,
                      T_ODR_CTL C
                WHERE
                    ROWNUM <= 1
                 AND A.ODR_NO     = B.ODR_NO
                 AND B.ODR_CTL_NO   = C.ODR_CTL_NO);
            EXCEPTION
                --//上記処理で得意先品目番号/得意先品目名を取得できない場合
                WHEN NO_DATA_FOUND THEN
                    --//得意先品目番号/得意先品目名を取得できない場合、得意先品目番号/得意先品目名をnullとする
                    wvc2CustItemCd   := Rec_T_SALES.CUST_ITEM_CD;                                  --得意先品目番号       = [取得データ]."得意先品目番号"
                    wvc2CustItemName := Rec_T_SALES.CUST_ITEM_NAME;                                --得意先品目称         = [取得データ]."得意先品目名称"

                --//異常処理
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
        
            --売上金額計算
            wnumAmount:=Rec_T_SALES.SALES_AMOUNT+Rec_T_SALES.EXTERNAL_TAX_AMOUNT;

            --売上金額計算(邦貨)
            blnRet := FNCGETROUND4FD(
                                     UTL_FileHandle                                 --ファイルハンドル
                                    ,pvc2LogMode                                    --ＬＯＧモード
                                    ,pvc2OutputMode                                 --出力モード
                                    ,pvc2UserId                                     --ユーザＩＤ
                                    ,pvc2BusinessName                               --業務名
                                    ,pvc2PlantCd                                    --工場コード
                                    ,TO_NUMBER(wnumAmount * wnumExchRate)           --売上実績金額 × 為替レート
                                    ,Rec_T_SALES.DECIMAL_FIG                        --小数桁数
                                    ,Rec_T_SALES.DETAIL_ROUND_TYP                   --明細計算まるめ区分
                                    ,wnumAmountJP                                   --売上実績金額(邦貨)
                                    ,pvc2ErrorCd                                    --エラーメッセージID
                                    ,pnumStatus                                     --結果ステータス（1：正常終了 2:警告終了 3：異常終了）
                );

            --異常
           IF pnumStatus = 3 OR blnRet = FALSE THEN
                vc2Comment:= SUBSTR('(SBM0015)売上金額（邦貨）計算異常　伝票番号 ['|| Rec_T_SALES.SLIP_CD  ||']'||
                                                                  '売上実績管理番号 ['|| Rec_T_SALES.SALES_SEQ_NO ||']', 1, 256);
                /* TraceLog の出力 */
                blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                                          pvc2PlantCd, MY_SQL_NAME, vc2Comment);
                /* 業務終了メッセージの出力 */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                        pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_END_ERR, vc2Comment);
                wblnErrorFlg := TRUE;
                --//標識へ
                GOTO MASK;
            END IF;

                --ワーニング
            IF pnumStatus = 2 THEN
                vc2Comment:= SUBSTR('(SBM0016)売上金額（邦貨）計算ワーニング　伝票番号 ['|| Rec_T_SALES.SLIP_CD  ||']'||
                                                                  '売上実績管理番号 ['|| Rec_T_SALES.SALES_SEQ_NO ||']', 1, 256);
                /* TraceLog の出力 */
                blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                                          pvc2PlantCd, MY_SQL_NAME, vc2Comment);
                /* 業務終了メッセージの出力 */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                        pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_END_ERR, vc2Comment);

                wblnWarnFlg := TRUE;

            END IF;

            
            --//Ai売掛情報インタフェースのデータを検索する
            BEGIN
                SELECT
                    NVL2(INPUT_SLIP_CD, 1, 0)
                INTO
                    wnumExitFlg
                FROM
                    T_AI_AR_IF
                WHERE
                    INPUT_SLIP_CD = wnumInputSlipCd;
            EXCEPTION
                WHEN NO_DATA_FOUND THEN
                    wnumExitFlg := 0;
            END;

            --//伝票番号 = 前回処理データの伝票番号、Ai売掛情報インタフェース."入力伝票番号" = 前回処理データの入力伝票番号、売上実績数量 < 0 (赤データである)
            IF Rec_T_SALES.SLIP_CD = wvc2SlipCd AND wnumExitFlg = 1 AND Rec_T_SALES.SALES_QTY < 0 THEN

                --//[売掛情報インタフェース]情報削除
                BEGIN
                    DELETE FROM
                        T_AI_AR_IF                                                   --Ai売掛情報インタフェース
                    WHERE
                        INPUT_SLIP_CD = wnumInputSlipCd;                             --前回処理データの入力伝票番号
                EXCEPTION
                    --//異常処理
                    WHEN OTHERS THEN
                        --//エラーのフラグを設定する
                        wblnErrorFlg := TRUE;
                        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                                              pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_AI_AR_IF_DEL);
                        /* 業務終了メッセージの出力 */
                        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                            pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_AI_AR_IF_DEL, SQLERRM);
                        --//標識へ
                        GOTO MASK;
                END;

                --//[売上実績]の更新処理
                BEGIN
                    UPDATE T_SALES SET
                        AI_AR_IF_FLG     = 1,                                                --Ai売掛インタフェースフラグ       １（インタフェース済）
                        UPDATED_DATE     = SYSDATE,                                          --更新日	        Sysdate
                        UPDATED_BY       = pvc2UserId,                                       --更新者	        引数．ユーザＩＤ
                        UPDATED_PRG_NM   = pvc2BusinessName,                                 --更新プログラム	引数．業務名
                        MODIFY_COUNT     = MODIFY_COUNT + 1                                  --更新数	        更新数＋１
                    WHERE
                        SALES_SEQ_NO     = Rec_T_SALES.SALES_SEQ_NO;                         --[取得データ]．"売上実績管理番号"
                EXCEPTION
                    --//異常処理
                    WHEN OTHERS THEN
                        --//エラーのフラグを設定する
                        wblnErrorFlg := TRUE;
                        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                                              pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_T_SALES_UPD);
                        /* 業務終了メッセージの出力 */
                        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                            pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_T_SALES_UPD, SQLERRM);
                        --//標識へ
                        GOTO MASK;
                END;

            ELSE

                --//[売掛情報インタフェース]へ登録する
                --//入力伝票番号採番
                SELECT
                    SEQ_INPUTDENNO_CREDIT.NEXTVAL
                INTO
                    wnumInputSlipCd
                FROM
                    DUAL;

                BEGIN
                    INSERT INTO T_AI_AR_IF (
                                            INPUT_SLIP_CD,                                   --入力伝票番号
                                            SLIP_ROW_NO,                                     --伝票行番号
                                            SLIP_CD,                                         --伝票番号
                                            PART_DLV_SEQ_NO,                                 --分納項番
                                            PUCH_ODR_CD,                                     --発注番号
                                            PROCESS_TYP,                                     --処理区分
                                            SLIP_TYP,                                        --伝票区分
                                            AR_DATA_TYP,                                     --売掛データ区分
                                            SALES_DATE,                                      --売上計上日
                                            CUST_CD,                                         --得意先コード,
                                            PLANT_CD,                                        --工場コード
                                            SALES_DEPT_CD,                                   --売上計上部門
                                            CURRNCY_CD,                                      --通貨コード
                                            EXCH_TYP,                                        --為替種別
                                            EXCH_RATE,                                       --為替レート
                                            EXCH_RESERVE_CD,                                 --為替予約コード
                                            TAX_CMP_TYP,                                     --税算出区分
                                            CLOSING_TYP,                                     --請求締区分
                                            SALES_TYP,                                       --取引区分
                                            CUST_ITEM_CD,                                    --得意先品目番号
                                            CUST_ITEM_NAME,                                  --得意先品目名称
                                            ITEM_CD,                                         --品目番号
                                            ITEM_NAME,                                       --品目名称
                                            SALES_QTY,                                       --売上実績数量
                                            UNIT_CD,                                         --単位
                                            SALES_UNIT_PRICE,                                --単価
                                            SALES_AMOUNT,                                    --売上実績金額
                                            SALES_AMOUNT_EXCH_RATES,                         --売上実績金額(邦貨)
                                            TAX_CREDIT_AMOUNT,                               --税抜売上金額
                                            TAX_CREDIT_AMOUNT_EXCH_RATES,                    --税抜売上金額(邦貨)
                                            TAX_INT_EXT_TYP,                                 --消費税内外区分
                                            TAX_CD,                                          --消費税コード
                                            EXTERNAL_TAX_SALES_AMOUNT,                       --外税対象金額
                                            EXTERNAL_TAX_AMOUNT,                             --外税消費税
                                            INTERNAL_TAX_SALES_AMOUNT,                       --内税対象金額
                                            INTERNAL_TAX_AMOUNT,                             --内税消費税
                                            TAXFREE_SALES_AMOUNT,                            --非課税対象金額
                                            RETRIEVE_FLG,                                    --取込フラグ
                                            CREATED_DATE,                                    --作成日
                                            CREATED_BY,                                      --作成者
                                            CREATED_PRG_NM,                                  --作成プログラム名
                                            UPDATED_DATE,                                    --更新日
                                            UPDATED_BY,                                      --更新者
                                            UPDATED_PRG_NM,                                  --更新プログラム
                                            MODIFY_COUNT                                     --更新数
                                           )
                                     VALUES 
                                           (
                                            wnumInputSlipCd,                                 --採番された入力伝票番号
                                            1,                                               --1
                                            Rec_T_SALES.SLIP_CD,                             --[取得データ]．"伝票番号"
                                            1,                                               --1
                                            NULL,                                            --NULL
                                            0,                                               --0(伝票追加)
                                            0,                                               --0（売上）
                                            CASE WHEN Rec_T_SALES.INSPC_ACPT_TYP = 2
                                                 THEN 3                                      --[取得データ]."検収区分"= 2:受領基準 場合 3:受領売上
                                                 WHEN Rec_T_SALES.INSPC_ACPT_TYP <> 2 AND Rec_T_SALES.SALES_TYP = 3
                                                 THEN 2                                      --[取得データ]."検収区分"≠2:受領基準 且つ [取得データ]."売上区分" = 3:その他売上 場合 2:その他売上
                                                 ELSE 1 END,                                 --以上以外場合 1出荷:売上
                                            Rec_T_SALES.SALES_DATE,                          --[取得データ]．"売上計上日"
                                            Rec_T_SALES.CUST_CD,                             --[取得データ]．"得意先コード"
                                            NULL,                                            --NULL
                                            Rec_T_SALES.SALES_DEPT_CD,                       --[取得データ]."売上計上部門"
                                            Rec_T_SALES.CURRNCY_CD,                          --[取得データ]．"通貨コード"
                                            Rec_T_SALES.EXCH_TYP,                            --[取得データ]．"為替種別"
                                            wnumExchRate,                                    --取得した為替レート
                                            NULL,                                            --NULL
                                            1,                                               --１（明細）
                                            0,                                               --0（締め処理をする伝票
                                            NULL,                                            --NULL
                                            wvc2CustItemCd,                                  --取得した得意先品目番号
                                            wvc2CustItemName,                                --取得した得意先品目名
                                            Rec_T_SALES.ITEM_CD,                             --[取得データ]．"品目番号"
                                            Rec_T_SALES.ITEM_NAME,                           --[取得データ]．"品目名"
                                            Rec_T_SALES.SALES_QTY,                           --[取得データ]．"売上実績数量"
                                            Rec_T_SALES.UNIT_CD,                             --[取得データ]．"単位"
                                            Rec_T_SALES.SALES_UNIT_PRICE,                    --[取得データ]．"単価"
                                            wnumAmount,                                      --[取得データ]．"売上実績金額"
                                            wnumAmountJP,                                    --[取得データ]．"売上実績金額(邦貨)"
                                            Rec_T_SALES.TAX_CREDIT_SALES_AMOUNT,             --[取得データ]．"税抜売上金額"
                                            Rec_T_SALES.OWN_CUR_TAXCREDIT_SALES_AMOUNT,      --[取得データ]．"税抜売上金額(邦貨)"
                                            CASE WHEN SUBSTR(Rec_T_SALES.TAX_CD, -1) = '1'   --[取得データ]．”消費税コード”の下１桁＝1:外税の場合１（外税）
                                                 THEN 1
                                                 WHEN SUBSTR(Rec_T_SALES.TAX_CD, -1) = '5'   --[取得データ]．”消費税コード”の下１桁＝5:内税の場合 2（内税）
                                                 THEN 2
                                                 WHEN SUBSTR(Rec_T_SALES.TAX_CD, -1) <> '1'  --[取得データ]．”消費税コード”の下１桁≠1:外税　,5:内税、の場合 0（非課税）
                                                 THEN 0 END,
                                            Rec_T_SALES.TAX_CD,                              --[取得データ]．"消費税コード"
                                            Rec_T_SALES.EXTERNAL_TAX_SALES_AMOUNT,           --[取得データ]．"外税対象金額"
                                            Rec_T_SALES.EXTERNAL_TAX_AMOUNT,                 --[取得データ]．"外税消費税"
                                            Rec_T_SALES.INTERNAL_TAX_SALES_AMOUNT,           --[取得データ]．"内税対象金額"
                                            Rec_T_SALES.INTERNAL_TAX_AMOUNT,                 --[取得データ]．"内税消費税"
                                            Rec_T_SALES.TAXFREE_SALES_AMOUNT,                --[取得データ]．"非課税対象金額"
                                            0,                                               --0：未取込
                                            SYSDATE,                                         --SYSDATE
                                            pvc2UserId,                                      --引数．ユーザＩＤ
                                            pvc2BusinessName,                                --引数．業務名
                                            SYSDATE,                                         --SYSDATE
                                            pvc2UserId,                                      --引数．ユーザＩＤ
                                            pvc2BusinessName,                                --引数．業務名
                                            0                                                --0
                                           );
                EXCEPTION
                    --//異常処理
                    WHEN OTHERS THEN
                        --//エラーのフラグを設定する
                        wblnErrorFlg := TRUE;
                        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                                              pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_AI_AR_IF_INS);
                        /* 業務終了メッセージの出力 */
                        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                            pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_AI_AR_IF_INS, SQLERRM);
                        --//標識へ
                        GOTO MASK;
                END;

                --//[売上実績]の更新処理
                BEGIN
                    UPDATE T_SALES SET
                        AI_AR_IF_FLG     ='1',                                               --Ai売掛インタフェースフラグ       １（インタフェース済）
                        UPDATED_DATE     = SYSDATE,                                          --更新日	        Sysdate
                        UPDATED_BY       = pvc2UserId,                                       --更新者	        引数．ユーザＩＤ
                        UPDATED_PRG_NM   = pvc2BusinessName,                                 --更新プログラム	引数．業務名
                        MODIFY_COUNT     = MODIFY_COUNT + 1                                  --更新数	        更新数＋１
                    WHERE
                        SALES_SEQ_NO     = Rec_T_SALES.SALES_SEQ_NO;                         --[取得データ]."売上実績管理番号"
                EXCEPTION
                    --//異常処理
                    WHEN OTHERS THEN
                        --//エラーのフラグを設定する
                        wblnErrorFlg := TRUE;
                        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                                              pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_T_SALES_UPD);
                        /* 業務終了メッセージの出力 */
                        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                            pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_T_SALES_UPD, SQLERRM);
                        --//標識へ
                        GOTO MASK;
                END;

            END IF;

            --//標識        
            <<MASK>>
            --//エラが存在した時
            IF wblnErrorFlg = TRUE THEN
                --//エラー件数 = エラー件数 + 1
                pnumErrorCount := pnumErrorCount + 1;
            ELSE
                --//ワーニングが存在した時
                IF wblnWarnFlg = TRUE THEN
                    --//ワーニング件数 = ワーニング件数 + 1
                    pnumWarnCount := pnumWarnCount + 1;
                ELSE
                    --//正常件数 = 正常件数 + 1
                    pnumNormalCount := pnumNormalCount + 1;
                END IF;
            END IF;

        EXCEPTION
            --//異常処理
            WHEN OTHERS THEN
                blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                                      pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_END_ERR);
                /* 業務終了メッセージの出力 */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                    pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_END_ERR, SQLERRM);
        END;

        --//今回のデータを保存する
        --//今回の伝票番号
        wvc2SlipCd := Rec_T_SALES.SLIP_CD;

    END LOOP;

--売上実績金額＝０の売上データの売掛インタフェースフラグを更新処理
    --//売上実績金額＝０の売上データ件数を取得する
    SELECT COUNT(*) INTO wnumCount0
    FROM T_SALES
    WHERE     AI_AR_IF_FLG = 0                             --[売上実績]."Ai売掛インタフェースフラグ"  = 0（インタフェース未）
          AND APPR_FLG     = 3                             --[売上実績]."承認状況"          = 3（承認済み）
          AND STATUS       = 20                            --[売上実績]."状態区分”         = 20:売掛計上予定
          AND SALES_AMOUNT = 0 ;

    UPDATE T_SALES SET
               AI_AR_IF_FLG     =1,                        --Ai売掛インタフェースフラグ       １（インタフェース済）
               UPDATED_DATE     = SYSDATE,                 --更新日	        Sysdate
               UPDATED_BY       = pvc2UserId,              --更新者	        引数．ユーザＩＤ
               UPDATED_PRG_NM   = pvc2BusinessName,        --更新プログラム	引数．業務名
               MODIFY_COUNT     = MODIFY_COUNT + 1         --更新数	        更新数＋１
     WHERE
              AI_AR_IF_FLG = 0                             --[売上実績]."Ai売掛インタフェースフラグ"  = 0（インタフェース未）
          AND APPR_FLG     = 3                             --[売上実績]."承認状況"          = 3（承認済み）
          AND STATUS       = 20                            --[売上実績]."状態区分”         = 20:売掛計上予定
          AND SALES_AMOUNT = 0 ;


    pnumTotalCount:=pnumTotalCount+wnumCount0;
    pnumNormalCount := pnumNormalCount+wnumCount0;

    --//UNLOCKＡｉ売掛情報インタフェース
    IF CUR_T_AI_AR_IF_LOCK%ISOPEN THEN
        CLOSE CUR_T_AI_AR_IF_LOCK;
    END IF;

    --正常の場合
    --結果を設定する
    pvc2ErrorCd     := '';
    pnumStatus      := STATUS_NORMAL;

     /* TraceLog の出力 */
     blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                           pvc2PlantCd, MY_SQL_NAME, LOGMSG_END);
     RETURN TRUE;

EXCEPTION
    WHEN excFncTraceLog THEN
        pnumStatus := STATUS_ERROR;

        --//UNLOCKＡｉ売掛情報インタフェース
        IF CUR_T_AI_AR_IF_LOCK%ISOPEN THEN
            CLOSE CUR_T_AI_AR_IF_LOCK;
        END IF;

        RETURN FALSE;

    WHEN excCommonChk THEN
        pnumStatus := STATUS_ERROR;
        pvc2ErrorCd:= LOGMSG_ID_COMMON_CHK;

        --//UNLOCKＡｉ売掛情報インタフェース
        IF CUR_T_AI_AR_IF_LOCK%ISOPEN THEN
            CLOSE CUR_T_AI_AR_IF_LOCK;
        END IF;

        /* LogFile の CLOSE */
        /* TraceLog の出力 */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                              pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_COMMON_CHK);
        /* 業務終了メッセージの出力 */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                            pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_COMMON_CHK, LOGMSG_NM_COMMON_CHK);
        RETURN FALSE;

    WHEN OTHERS THEN
        --結果を設定する
        pnumTotalCount  := pnumTotalCount;
        pnumNormalCount := 0;
        pnumWarnCount   := 0;
        pnumErrorCount  := 0;
        pnumStatus      := STATUS_ERROR;

        --//UNLOCKＡｉ売掛情報インタフェース
        IF CUR_T_AI_AR_IF_LOCK%ISOPEN THEN
            CLOSE CUR_T_AI_AR_IF_LOCK;
        END IF;

        --異常処理
        vc2Comment:= SUBSTR('(SBM0020)<< Jf売上情報取込処理異常終了>>　'|| SQLERRM, 1, 256);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                              pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_END_ERR);
        /* 業務終了メッセージの出力 */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                            pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_END_ERR, vc2Comment);
        RETURN FALSE;
END;
/
