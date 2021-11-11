CREATE OR REPLACE FUNCTION FncCreditInformationToAiJa(
/*------------------------------------------------------------------------------
'
' FncCreditInformationToAiJa.Sql
'
' version   : 1.00.00
'
' 修正履歴
'
' 機能      : Ja売上情報取込処理
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
' 機能説明  : EXPLANNER/Ｊaの[売上実績]から売掛情報を集約して、Aｉ向け売掛インタフェースにデータ登録する。
'
' 備考      : ダミソース
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

    MY_SQL_NAME                           VARCHAR2(120):= 'FNCCREDITINFORMATIONTOAIJA'; --ＰＬ／ＳＱＬ名
    LOGMSG_START                          VARCHAR2(20) := 'Start';                      --ログ用メソッド開始宣言
    LOGMSG_END                            VARCHAR2(12) := 'End';                        --ログ用メソッド終了宣言
    LOGMSG_ERR                            VARCHAR2(32) := '異常終了';

    --//業務ログ用メッセージID
    LOGMSG_ID_COMMON_CHK                  VARCHAR2(28) := 'BF00011';                    --引数が不正のため、売掛インタフェース情報取得処理ができませんでした。
    LOGMSG_ID_END_ERR                     VARCHAR2(28) := 'BF00018';                    --Ａｉ連携売掛インタフェース処理で、売上情報取込が失敗しました。

    --//業務ログ用メッセージ
    LOGMSG_NM_COMMON_CHK                  VARCHAR2(200) := '(SBM0017)引数が不正のため処理ができませんでした。';  --引数が不正のため、売掛インタフェース情報取得処理ができませんでした。
    LOGMSG_NM_END_ERR                     VARCHAR2(200) := '(SBM0019)売上情報取込に失敗しました。';              --Ａｉ連携売掛インタフェース処理で、売上情報取込が失敗しました。

    --//結果ステータス
    STATUS_NORMAL                         NUMBER        := 1;      -- 正常終了
    STATUS_WARNING                        NUMBER        := 2;      -- ワーニング
    STATUS_ERROR                          NUMBER        := 3;      -- 異常終了

/* 変数の宣言 WORK */
    --//自定義異常
    excFncTraceLog                         EXCEPTION;              --ログを書き失敗
    excCommonChk                           EXCEPTION;              --共通引数失敗
    
    LOGMSG_NM_END                          VARCHAR2(200);          --処理終了宣言

    blnRet                                 BOOLEAN;                --共通関数の戻値

    --//詳細メッセージ格納用
    vc2Comment                             VARCHAR2(1024);

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

    --正常の場合
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
        RETURN FALSE;

    WHEN excCommonChk THEN        
        pnumStatus := STATUS_ERROR;
        pvc2ErrorCd:= LOGMSG_ID_COMMON_CHK;
        /* LogFile の CLOSE */
         /* TraceLog の出力 */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                              pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_COMMON_CHK);
        /* 業務終了メッセージの出力 */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                            pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_COMMON_CHK,LOGMSG_NM_COMMON_CHK);
        RETURN FALSE;

    WHEN OTHERS THEN
        --異常処理
        vc2Comment:= SUBSTR('(SBM0020)<< Jf売上情報取込処理異常終了>>　'|| SQLERRM, 1,256);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                              pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_END_ERR);
        /* 業務終了メッセージの出力 */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                            pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_END_ERR,vc2Comment);

END;
/
