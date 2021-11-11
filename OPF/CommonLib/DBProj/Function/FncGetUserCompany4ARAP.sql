CREATE OR REPLACE FUNCTION FNCGETUSERCOMPANY4ARAP (
/*------------------------------------------------------------------------------
'
' FncGetUserCompany4ARAP.Sql
'
' 修正履歴  2004.07.01 新規作成
            2005.10.20 unicode対応(varchar2を4倍)
'
' 機能      : 会社コード取得処理
'
' 戻り値    : Boolean
'               True :正常終了
'               False:異常終了
'
' 引き数    : pFileHandle          - (i) ファイルハンドル
'             pvc2LogMode          - (i) ＬＯＧモード
'             pvc2OutputMode       - (i) 出力モード
'             pvc2PlantCd          - (i) 工場コード
'             pvc2UserId           - (i) ユーザＩＤ
'             pvc2BusinessName     - (i) 業務名
'             pvc2CompanyCd        - (io)会社コード
'
' 機能説明  : 利用者コードをキーに利用者所属会社より会社コードを取得する。
'
' 備考      :
'
------------------------------------------------------------------------------*/
    pFileHandle         IN  UTL_FILE.FILE_TYPE  --ファイルハンドル
   ,pvc2LogMode         IN  VARCHAR2    --ＬＯＧモード
   ,pvc2OutputMode      IN  VARCHAR2    --出力モード
   ,pvc2PlantCd         IN  VARCHAR2    --工場コード
   ,pvc2UserId          IN  VARCHAR2    --ユーザＩＤ
   ,pvc2BusinessName    IN  VARCHAR2    --業務名
   ,pvc2CompanyCd       OUT VARCHAR2    --会社コード
) RETURN BOOLEAN
IS

/* カーソルの宣言 */


/* ROWTYPE の宣言 */


/* 定数の宣言 */
    MY_SQL_NAME                         VARCHAR2(120)  := 'FncGetUserCompany4ARAP';

    DATA_FLG_NOTFOUND              CONSTANT NUMBER(1)   := 0;     --データなし
    DATA_FLG_GET                   CONSTANT NUMBER(1)   := 1;     --データあり

    DEFAULT_COMPANY_CD             CONSTANT VARCHAR2(8) := '';


/* EXCEPTION の宣言 */


/* MESSAGE の宣言 */


/* LOG の宣言 */
    LOGMSG_START                        VARCHAR2(20)   := 'Start';   --ログ用メソッド開始宣言
    LOGMSG_END                          VARCHAR2(12)   := 'End';     --ログ用メソッド終了宣言


/* 変数の宣言 SQL */
    /* 利用者所属会社  (M_USER_COMPANY) */
    vc2MUC_UserCd               VARCHAR2(100); -- PKey01
    vc2MUC_CompanyCd            VARCHAR2(100);
    numMUC_UserTyp              NUMBER(2);
    dtmMUC_CreDate              DATE;
    vc2MUC_CreCd                VARCHAR2(100);
    dtmMUC_UpdDate              DATE;
    vc2MUC_UpdCd                VARCHAR2(100);


/* 変数の宣言 WORK */
    blnRet                      BOOLEAN;        -- Function返却値
    numUserCdBeFlg              NUMBER(1);
    blnFncRet                   BOOLEAN;        -- RETURN時の値


BEGIN

    /* TraceLog の出力 */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

--  利用者所属会社を取得する
    BEGIN

        SELECT USER_CD,
               COMPANY_CD, USER_TYP,
               CREATED_DATE, CREATED_PRG_NM,
               UPDATED_DATE, UPDATED_PRG_NM
          INTO vc2MUC_UserCd,
               vc2MUC_CompanyCd, numMUC_UserTyp,
               dtmMUC_CreDate, vc2MUC_CreCd,
               dtmMUC_UpdDate, vc2MUC_UpdCd
          FROM M_USER_COMPANY
         WHERE  USER_CD = pvc2UserId;

        numUserCdBeFlg := DATA_FLG_GET;

    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            numUserCdBeFlg := DATA_FLG_NOTFOUND;

    END;

    IF numUserCdBeFlg = DATA_FLG_GET THEN
        pvc2CompanyCd := vc2MUC_CompanyCd;
		blnFncRet := TRUE;
    ELSE
        pvc2CompanyCd := DEFAULT_COMPANY_CD;
		blnFncRet := FALSE;
    END IF;

    /* TraceLog の出力 */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

	RETURN blnFncRet;

--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN OTHERS THEN                             --その他のエラー
        /* ErrorLog の出力 */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, SQLCODE, SQLERRM);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        RETURN FALSE;
END FncGetUserCompany4ARAP;
/
