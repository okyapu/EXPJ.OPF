CREATE OR REPLACE FUNCTION FNCISWORKDAY(
/*------------------------------------------------------------------------------
'
' version   : 1.00.01
'
' 修正履歴
' 2003.08.07 初版
' 2003.12.15 ソース整形(改行挿入)。
' 2005.10.21 unicode対応（varchar2を4倍）
'
' 機能      : 稼働日判定
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
'             pdtmDate             - (i)対象日付
'             pblnResult           - (o)判定結果 true: 稼働日 false: 非稼動日
'
' 機能説明  : 指定工場のカレンダを使って対象日付が稼働日であるかどうか
'             を判定する。
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
   ,pvc2ItemCd          IN  VARCHAR2            --品目番号  
   ,pdtmDate            IN  DATE                --対象日付
   ,pblnResult          OUT BOOLEAN             --判定結果 true: 稼働日 false: 非稼動日
    ) RETURN BOOLEAN
IS

-----------------
-- CONST値宣言 --
-----------------
    MY_SQL_NAME             VARCHAR2(56)    := 'FncIsWorkDay';      --ＰＬ／ＳＱＬ名
    HOLIDAY_FLG_ACT         NUMBER(1)       := 0;                   --カレンダ明細-休日フラグ(0:稼働日)
    HOLIDAY_FLG_NOTACT      NUMBER(1)       := 1;                   --カレンダ明細-休日フラグ(1:非稼働日)
    LOGMSG_START            VARCHAR2(20)     := 'Start';             --ログ用メソッド開始宣言
    LOGMSG_END              VARCHAR2(12)     := 'End';               --ログ用メソッド終了宣言

--------------
-- WORK変数 --
--------------
    numFlg              NUMBER;         -- 休日フラグ
    blnRet              BOOLEAN;        -- チェック結果
    numCalNo            NUMBER :=-1;    -- カレンダ番号(工場）
    numCalNo1            NUMBER :=-1;    -- カレンダ番号(品目）
    dtmTruncDate        DATE;           -- wk対象日付

BEGIN

    /* 指定工場のカレンダを取得 */
    SELECT CAL_NO INTO numCalNo FROM M_PLANT
    WHERE PLANT_CD = pvc2PlantCd
    ;

    /*指定品目のカレンダを取得 */
    IF pvc2ItemCd IS NOT NULL THEN
    SELECT CAL_NO INTO numCalNo1 FROM M_ITEM
    WHERE ITEM_CD = pvc2ItemCd
    ;
    END IF;
    
    /* 日付部分を無視した対象日付を取得 */
    dtmTruncDate := TRUNC(pdtmDate);

    /* TraceLog の出力 */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);
    IF numCalNo1 != -1 THEN                     --カレンダが品目からの取得の場合
    SELECT HOLIDAY_FLG INTO numFlg FROM M_CAL
    WHERE CAL_NO = numCalNo1
    AND CAL_DATE = dtmTruncDate
    ;
    ELSE                                        --カレンダが工場からの取得の場合
    SELECT HOLIDAY_FLG INTO numFlg FROM M_CAL 
    WHERE CAL_NO = numCalNo
    AND CAL_DATE = dtmTruncDate
    ;
    END IF;

    IF numFlg = HOLIDAY_FLG_ACT THEN
        pblnResult := true;
    ELSE
        pblnResult := false;
    END IF
    ;

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
        RETURN FALSE;
END;
/
