CREATE OR REPLACE FUNCTION FNCMSGLOG(
/*------------------------------------------------------------------------------
'
' version   : 1.00.02
'
' 修正履歴
' 2003.07.22 初版
' 2003.07.27 MessageTableへのInsert時の更新回数を1→0に・作成/更新プログラム名を本FUNC名から業務名にに修正
' 2003.08.16 メッセージ変数長を256→512に・作成/更新プログラム名を本FUNC名戻す
'            SYS_MSG_LOGへ設定するMSG長を80文字で切る制御を追加
'            LOG_CDの採番を共通関数使用に変更
' 2004.09.24 SUBSTR→SUBSTRBに変更
' 2005.10.21 unicode対応（varchar2を4倍、SUBSTRBを4倍）
'
' 機能      : メッセージＬＯＧ出力
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
'             pvc2PlantCd          --(i)工場コード
'             pvc2PlSqlName        - (i)ＰＬ／ＳＱＬ名
'             pvc2MsgId            - (i)メッセージＩＤ
'             pvc2DataString       - (i)出力文字列
'
' 機能説明  : メッセージＬＯＧの出力を行う。
'
' 備考      :
'
------------------------------------------------------------------------------*/
    pFileHandle      IN UTL_FILE.FILE_TYPE  --ファイルハンドル
   ,pvc2LogMode      IN VARCHAR2     --ＬＯＧモード
   ,pvc2OutputMode   IN VARCHAR2     --出力モード
   ,pvc2UserId       IN VARCHAR2     --ユーザＩＤ
   ,pvc2BusinessName IN VARCHAR2     --業務名
   ,pvc2PlantCd      IN VARCHAR2     --工場コード
   ,pvc2PlSqlName    IN VARCHAR2     --ＰＬ／ＳＱＬ名
   ,pvc2MsgId        IN VARCHAR2     --メッセージＩＤ
   ,pvc2DataString   IN VARCHAR2     --出力文字列
) RETURN BOOLEAN
IS

-- カーソルの宣言
    CURSOR curSYS_LOG_CD_CTRL IS
    SELECT  LOG_CD
    FROM    SYS_LOG_CD_CTRL
    WHERE   PLANT_CD=pvc2PlantCd
    FOR UPDATE;

-- ROWTYPE の宣言
    RtpSYS_LOG_CD_CTRL      curSYS_LOG_CD_CTRL%ROWTYPE;

/* 変数の宣言 */
vc2TmpMessage           VARCHAR2(2048);          --ＬＯＧメッセージ
vc2TmpMessageFile       VARCHAR2(2048);          --ＬＯＧメッセージ
strMsg                  VARCHAR2(2048);          --ＬＯＧメッセージ
numSave                 NUMBER(23);
vc2LOG_CD               VARCHAR2(92);
vc2PlantLogCd           VARCHAR2(100);           --工場コード＋LOG識別番号
blnRet                  BOOLEAN;
vc2TmpDateTime          VARCHAR2(76);           --日付時間
filHdlLogMsg            UTL_FILE.FILE_TYPE;     --ファイルハンドル
vc2RunChkComment        VARCHAR2(2048);          --実行位置確認用コメント作成作業領域

bFlag                   NUMBER(1)     := 0;
nCnt                    NUMBER(1);

/* 定数の宣言 */
    MY_SQL_NAME             VARCHAR2(36)   := 'FncMsgLog';                  --ＰＬ／ＳＱＬ名
    NUMBER_MAX              VARCHAR2(92)  := '99999999999999999999999';    --取得カウントアップ用
    NUMBER_MIN              VARCHAR2(92)  := '1';                          --取得カウントアップ用
    LOGKBN_ERR              VARCHAR2(24)   := 'ERROR ';   --ＬＯＧメッセージ区分　エラー
    LOGKBN_TRACE            VARCHAR2(24)   := 'TRACE ';   --ＬＯＧメッセージ区分　トレース
    LOGKBN_DATA             VARCHAR2(24)   := 'DATA  ';   --ＬＯＧメッセージ区分　データ
    LOGKBN_MESSAGE          VARCHAR2(24)   := '業務  ';   --ＬＯＧメッセージ区分　業務メッセージ
    FILEOPENMODE_R          VARCHAR2(4)   := 'r';        --ファイルＯＰＥＮモード　ＲＥＡＤ
    FILEOPENMODE_W          VARCHAR2(4)   := 'w';        --ファイルＯＰＥＮモード　ＷＲＩＴＥ
    FILEOPENMODE_A          VARCHAR2(4)   := 'a';        --ファイルＯＰＥＮモード　ＡＰＰＥＮＤ

BEGIN
--DBMS_OUTPUT.ENABLE(1000000);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 開始 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

--vc2RunChkComment := '★★★★通過 00010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

/* ﾊﾟﾗﾒｰﾀ の出力 */
blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode,
                      pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                      MY_SQL_NAME, 'Parameter：' || pvc2MsgId || ',' || pvc2DataString);

/* メッセージの取得 */
/* 直接tableを見に行くように修正. msg_cd はPKなので結果は0件か1件のみ */
SELECT COUNT(*) INTO nCnt FROM SYS_BUSINESS_MESSAGE WHERE msg_cd = pvc2MsgId;
IF nCnt = 0 THEN
    strMsg := '未定義のエラーです。 (' || pvc2MsgId || ')';
ELSE
    SELECT msg INTO strMsg FROM SYS_BUSINESS_MESSAGE WHERE msg_cd = pvc2MsgId;
END IF;


    -- 採番データを取得

    blnRet := FNCGETNEWLOGCD( pFileHandle
                             ,pvc2LogMode
                             ,pvc2OutputMode
                             ,pvc2UserId
                             ,pvc2BusinessName
                             ,pvc2PlantCd
                             ,vc2PlantLogCd);

    -- 業務メッセージを320文字に制限
    strMsg := SUBSTRB(strMsg, 1, 320);

--vc2RunChkComment := '★★★★通過 00170';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    --MessageTableへのInsert
    INSERT INTO SYS_MSG_LOG (
        LOG_CD,
        PLANT_CD,
        BUSINESS_NAME,
        MSG_CD,
        MSG,
        DATA_STRING,
        CONFIRM_DATE,
        CREATED_DATE,
        CREATED_BY,
        CREATED_PRG_NM,
        UPDATED_DATE,
        UPDATED_BY,
        UPDATED_PRG_NM,
        MODIFY_COUNT
     ) Values (
        vc2PlantLogCd,
        pvc2PlantCd,
        pvc2BusinessName,
        pvc2MsgId,
        strMsg,
        pvc2DataString,
        NULL,
        SYSDATE,
        pvc2UserId,
        MY_SQL_NAME,
        SYSDATE,
        pvc2UserId,
        MY_SQL_NAME,
        0
     );


--DBMS_OUTPUT.PUT_LINE('numSave=' || TO_CHAR(numSave) || ' CD=' || vc2PlantLogCd || ' strMsg=' || strMsg);

--vc2RunChkComment := '★★★★通過 00180';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    --Messageの作成
    vc2TmpDateTime := TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS');
    vc2TmpMessage := LOGKBN_MESSAGE || vc2TmpDateTime || ':';
    vc2TmpMessageFile := SUBSTRB(vc2TmpMessage
                                || ',' || pvc2UserId 
                                || ',' || pvc2BusinessName
                                || ',' || pvc2PlantCd
                                || ',' || pvc2PlSqlName
                                || ',' || strMsg
                                || ',' || pvc2DataString,
                                1, 2048);

--vc2RunChkComment := '★★★★通過 00190';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    /* ＬＯＧ出力 */
    UTL_FILE.PUT(pFileHandle, vc2TmpMessageFile || CHR(10));

    /* 物理出力 */
    UTL_FILE.FFLUSH(pFileHandle);

--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 終了 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

    -- 正常終了
    RETURN TRUE;



--< 例外処理 >---------------------------------------------------------------
EXCEPTION

    WHEN OTHERS THEN
--DBMS_OUTPUT.PUT_LINE('OTHERS');

        /* ﾊﾟﾗﾒｰﾀ の出力（強制出力） */
        blnRet := FncTraceLog(pFileHandle, 9, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, 'Parameter：' || pvc2MsgId || ',' || pvc2DataString);

        /* TraceLog の出力（実行位置） */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, vc2RunChkComment);

        /* Oracle Error の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, pvc2MsgId || ',' || SQLCODE || SQLERRM);

        --Messageの作成
        vc2TmpMessage := SUBSTRB(SQLCODE || SUBSTRB(SQLERRM,1,2048) ||
                                '(' ||
                                vc2TmpMessage
                                || ',' || pvc2UserId
                                || ',' || pvc2BusinessName
                                || ',' || pvc2PlantCd
                                || ',' || pvc2PlSqlName
                                || ',' || pvc2MsgId
                                || ',' || pvc2DataString ||
                                ')'
                                ,1,2048);

        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, pvc2MsgId, vc2TmpMessage);

    RETURN FALSE;
END;
/
