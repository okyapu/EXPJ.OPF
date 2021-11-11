CREATE OR REPLACE FUNCTION FNCGETSLIPCD4ARAP (
/*------------------------------------------------------------------------------
'
' FncGetSlipCd4ARAP.Sql(AUTONOMOUS_TRANSACTION版)
'
' 修正履歴  2004.07.01 新規作成
'           2005.10.20 unicode対応(varchar2を4倍)
'
' 機能      : 買掛売掛伝票番号取得処理
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
'             pnumAction           - (i) 処理種類
'             pnumSlipTyp          - (i) 伝票種類
'             pvc2SlipDate         - (i) 伝票日付
'             pvc2CompanyCd        - (io)会社コード
'             pvc2GDate            - (o) 年月度
'             pvc2NumberingCd      - (o) 採番コード
'             pvc2SlipCd           - (o) 最終伝票番号
'             pnumTerms            - (o) 期数
'
'
' 機能説明  : ① アクション＝１でかつ自動採番の場合、ＩＮ条件をもとにＯＵＴ項目を通知
'                し､伝票採番コントロールマスタの最終伝票番号を更新する｡
'             → 伝票採番コントロールマスタが存在する場合は最終伝票番号を更新し､
'                存在しない場合はレコードを追加する｡
'　　　　　   ② アクション＝０、またはアクション＝１でかつ手動採番の場合、ＩＮ条件を
'                もとに伝票番号以外のOUT項目を通知し､伝票採番コントロールマスタの
'                最終伝票番号の更新は行わない｡
' 備考      :
'
------------------------------------------------------------------------------*/
    pFileHandle         IN      UTL_FILE.FILE_TYPE  --ファイルハンドル
   ,pvc2LogMode         IN      VARCHAR2    --ＬＯＧモード
   ,pvc2OutputMode      IN      VARCHAR2    --出力モード
   ,pvc2PlantCd         IN      VARCHAR2    --工場コード
   ,pvc2UserId          IN      VARCHAR2    --ユーザＩＤ
   ,pvc2BusinessName    IN      VARCHAR2    --業務名
   ,pnumAction          IN      NUMBER      --処理種類
   ,pnumSlipTyp         IN      NUMBER      --伝票種類
   ,pvc2SlipDate        IN      VARCHAR2    --伝票日付
   ,pvc2CompanyCd       IN  OUT VARCHAR2    --会社コード
   ,pvc2GDate           OUT     VARCHAR2    --年月度
   ,pvc2NumberingCd     OUT     VARCHAR2    --採番コード
   ,pvc2SlipCd          OUT     VARCHAR2    --最終伝票番号
   ,pnumTerms           OUT     NUMBER      --期数
) RETURN BOOLEAN
IS
PRAGMA AUTONOMOUS_TRANSACTION;

/* カーソルの宣言 */


/* ROWTYPE の宣言 */

/* 定数の宣言 */
    MY_SQL_NAME                 CONSTANT VARCHAR2(120)  := 'FncGetSlipCd4ARAP';

--  AUTO_NUMBERING_TYP_AUTO     CONSTANT NUMBER(2)     := 1;    --自動・手動採番（1:自動採番)
    AUTO_NUMBERING_TYP_MANUAL   CONSTANT NUMBER(2)     := 2;    --自動・手動採番（2:手動採番)
    NUMBERING_TYP_MONTH         CONSTANT NUMBER(2)     := 1;    --月間・年間・単純採番区分（1:月間採番)
    NUMBERING_TYP_YEAR          CONSTANT NUMBER(2)     := 2;    --月間・年間・単純採番区分（2:年間採番)
    NUMBERING_TYP_SIMPLE        CONSTANT NUMBER(2)     := 3;    --月間・年間・単純採番区分（3:単純採番)
    SLIP_NUMBERING_TERM_DEFAULT CONSTANT VARCHAR2(24)   := '999999';   --期数の規定値（単純採番用）

    ERRCD_DATE_INVALID         CONSTANT VARCHAR2(28)   := 'BZ00176';    --日付の値が不正です。
    ERRCD_NOTEXIST_DATA        CONSTANT VARCHAR2(28)   := 'BZ00174';    --対象データが存在しません


/* EXCEPTION の宣言 */
    excSQL_NORMAL_END                  EXCEPTION;                  --正常終了
    excFNC_PARAMETER_ERR               EXCEPTION;                  --入力パラメータエラー
    excFNC_MST_NODATA                  EXCEPTION;                  --マスタなしエラー
    excFNC_GET_CTRLDATE_ERR            EXCEPTION;                  --期取得エラー

/* MESSAGE の宣言 */

/* LOG の宣言 */
    LOGMSG_START                CONSTANT VARCHAR2(20)   := 'Start';   --ログ用メソッド開始宣言
    LOGMSG_END                  CONSTANT VARCHAR2(12)   := 'End';     --ログ用メソッド終了宣言

/* 変数の宣言 SQL */
    /* 伝票コントロール */
    vc2SLT_CompanyCd                   VARCHAR2(100);
    numSLT_SlipTyp                     NUMBER(2);
    vc2SLT_SlipName                    VARCHAR2(160);
    vc2SLT_SlipAName                   VARCHAR2(80);
    vc2SLT_NumberingCd                 VARCHAR2(100);
    numSLT_AutoNumberingTyp            NUMBER(2);
    numSLT_NumberingTyp                NUMBER(2);
    vc2SLT_StartSlipCd                 VARCHAR2(100);
    vc2SLT_EndSlipCd                   VARCHAR2(100);
    numSLT_JnlSlipTyp                  NUMBER(2);
    numSLT_AutoJnlTyp                  NUMBER(2);
    dtmSLT_CreDate                     DATE;
    vc2SLT_CreCd                       VARCHAR2(100);
    dtmSLT_UpdDate                     DATE;
    vc2SLT_UpdCd                       VARCHAR2(100);

    /* 伝票採番コントロール */
    vc2SCC_CompanyCd                   VARCHAR2(100);   --PKey01
    numSCC_Term                        NUMBER(6);      --PKey02
    vc2SCC_NumberingCd                 VARCHAR2(100);   --PKey03
    vc2SCC_CurrentSlipCdM1             VARCHAR2(100);
    vc2SCC_CurrentSlipCdM2             VARCHAR2(100);
    vc2SCC_CurrentSlipCdM3             VARCHAR2(100);
    vc2SCC_CurrentSlipCdM4             VARCHAR2(100);
    vc2SCC_CurrentSlipCdM5             VARCHAR2(100);
    vc2SCC_CurrentSlipCdM6             VARCHAR2(100);
    vc2SCC_CurrentSlipCdM7             VARCHAR2(100);
    vc2SCC_CurrentSlipCdM8             VARCHAR2(100);
    vc2SCC_CurrentSlipCdM9             VARCHAR2(100);
    vc2SCC_CurrentSlipCdM10            VARCHAR2(100);
    vc2SCC_CurrentSlipCdM11            VARCHAR2(100);
    vc2SCC_CurrentSlipCdM12            VARCHAR2(100);
    vc2SCC_CurrentSlipCdY              VARCHAR2(100);
    vc2SCC_CurrentSlipCd               VARCHAR2(100);
    dtmSCC_CreDate                     DATE;
    vc2SCC_CreCd                       VARCHAR2(100);
    dtmSCC_UpdDate                     DATE;
    vc2SCC_UpdCd                       VARCHAR2(100);

/* 変数の宣言 WORK */
    blnRet                      BOOLEAN;        -- Function返却値
    numTermTemp                 NUMBER(6);      --期
    numEndSlipCd                NUMBER(25);     --最終伝票番号

    numTerm                     NUMBER(6);      --期
    numYear                     NUMBER(4);      --年
    dtmTermStartDate            DATE;           --期の開始年月日
    dtmTermEndDate              DATE;           --期の終了年月日
    numYearMonth                NUMBER(6);      --年月度
    dtmMonthStartDate           DATE;           --年月度の開始年月日
    dtmMonthEndDate             DATE;           --年月度の終了年月日
    numTableNo                  NUMBER;         --テーブルＮｏ

    numSlipCdFig                NUMBER(2);
    blnSlipCdCtrlFlg            BOOLEAN := FALSE;

BEGIN

    /* TraceLog の出力 */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

--  引数の初期化
    pvc2GDate       := '000000'; --年月度
    pvc2NumberingCd := '0';      --採番コード
    pvc2SlipCd      := '0';      --最終伝票番号
    pnumTerms       := 0;        --期数

--  引数チェック  入力年月日のチェック
    IF (pvc2SlipDate IS NULL) OR
       (LENGTHB(pvc2SlipDate) <> 10) OR
       (pvc2SlipDate = '0000/00/00') OR
       (pvc2SlipDate = '9999/99/99') THEN

        /* ErrorLog の出力 */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, ERRCD_DATE_INVALID, '日付の値が不正です。');

        RAISE excFNC_PARAMETER_ERR;
    END IF;

    IF (pvc2CompanyCd IS NULL)      OR
       (LENGTHB(pvc2CompanyCd) = 0) THEN
        blnRet := FNCGETUSERCOMPANY4ARAP(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                       pvc2PlantCd, pvc2UserId, pvc2BusinessName,
                                       pvc2CompanyCd);
        IF blnRet = FALSE THEN
            blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                MY_SQL_NAME, ERRCD_DATE_INVALID, '会社コード取得失敗');

            RAISE excFNC_PARAMETER_ERR;
        END IF;
    END IF;

    /* 伝票コントロールを取得する */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, 'M_SLIP_TYP COMPANY_CD:' || pvc2CompanyCd || ' SLIP_TYP:' || TO_CHAR(pnumSlipTyp));

    BEGIN
        SELECT COMPANY_CD, SLIP_TYP,
               SLIP_NAME,  SLIP_ANAME,
               NUMBERING_CD,
               AUTO_NUMBERING_TYP, NUMBERING_TYP,
               START_SLIP_CD, END_SLIP_CD,
               JNL_SLIP_TYP,
               AUTO_JNL_TYP,
               CREATED_DATE, CREATED_PRG_NM,
               UPDATED_DATE, UPDATED_PRG_NM
          INTO vc2SLT_CompanyCd, numSLT_SlipTyp,
               vc2SLT_SlipName,  vc2SLT_SlipAName,
               vc2SLT_NumberingCd,
               numSLT_AutoNumberingTyp, numSLT_NumberingTyp,
               vc2SLT_StartSlipCd, vc2SLT_EndSlipCd,
               numSLT_JnlSlipTyp,
               numSLT_AutoJnlTyp,
               dtmSLT_CreDate, vc2SLT_CreCd,
               dtmSLT_UpdDate, vc2SLT_UpdCd
          FROM M_SLIP_TYP
         WHERE COMPANY_CD = pvc2CompanyCd    --会社コード
           AND SLIP_TYP   = pnumSlipTyp;     --伝票種類

    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                MY_SQL_NAME, ERRCD_NOTEXIST_DATA,
                                'M_SLIP_TYP COMPANY_CD:' || pvc2CompanyCd || ' SLIP_TYP:' || TO_CHAR(pnumSlipTyp));

            RAISE excFNC_MST_NODATA;
    END;

    numEndSlipCd := TO_NUMBER(vc2SLT_EndSlipCd);

--  アクション＝０ または
--  アクション＝１で手動採番時は処理を行なわない
    IF (pnumAction = 0) OR
       ((pnumAction = 1) AND
        (numSLT_AutoNumberingTyp = AUTO_NUMBERING_TYP_MANUAL)) THEN
        RAISE excSQL_NORMAL_END;
    END IF;

--  [伝票コントロール］の採番区分が「単純採番」以外の場合には日付コントロールより期を取得する
    IF numSLT_NumberingTyp <> NUMBERING_TYP_SIMPLE THEN
        blnRet := FNCGETCTRLDATE4ARAP(
                                    pFileHandle,        --ファイルハンドル
                                    pvc2LogMode,        --ＬＯＧモード　ＬＯＧ無し
                                    pvc2OutputMode,     --出力モード　　ファイル
                                    pvc2UserId,         --ユーザＩＤ
                                    pvc2BusinessName,   --業務名
                                    pvc2PlantCd,        --工場コード
                                    pvc2CompanyCd,      --会社コード
                                    pvc2SlipDate,       --伝票日付
                                    numTerm,            --基数
                                    numYear,            --年数
                                    dtmTermStartDate,   --期の開始年月日
                                    dtmTermEndDate,     --期の終了年月日
                                    numYearMonth,       --年月度
                                    dtmMonthStartDate,  --年月度の開始年月日
                                    dtmMonthEndDate,    --年月度の終了年月日
                                    numTableNo          --テーブルＮｏ
                                    );
        /* エラー終了 */
        IF blnRet = FALSE THEN
            RAISE excFNC_GET_CTRLDATE_ERR;
        END IF;
        pnumTerms   := numTerm;
        numTermTemp := numTerm;
    END IF;

    /* 年月度の取得 */
    IF numSLT_NumberingTyp = NUMBERING_TYP_MONTH THEN     --1:月間採番
        pvc2GDate       := TO_CHAR(numYearMonth);
        pvc2NumberingCd := vc2SLT_NumberingCd;
    ELSIF numSLT_NumberingTyp = NUMBERING_TYP_YEAR THEN   --2:年間採番
        pvc2GDate       := TO_CHAR(numYear) || '00';
        pvc2NumberingCd := vc2SLT_NumberingCd;
    ELSIF numSLT_NumberingTyp = NUMBERING_TYP_SIMPLE THEN --3:単純採番
        pvc2GDate       := TO_CHAR(numYearMonth);
        pvc2NumberingCd := SLIP_NUMBERING_TERM_DEFAULT;
        pnumTerms       := TO_NUMBER(SLIP_NUMBERING_TERM_DEFAULT);
        numTermTemp     := TO_NUMBER(SLIP_NUMBERING_TERM_DEFAULT);
    END IF;

    /* 伝票採番コントロールを取得する */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME,
                          'M_SLIP_CD_CTRL COMPANY_CD:' || pvc2CompanyCd || ' TERM:' || TO_CHAR(numTermTemp) || ' NUMBERING_CD:' || vc2SLT_NumberingCd);

    BEGIN
        SELECT COMPANY_CD,TERM,NUMBERING_CD,
               CURRENT_SLIP_CD_M1,CURRENT_SLIP_CD_M2,CURRENT_SLIP_CD_M3,
               CURRENT_SLIP_CD_M4,CURRENT_SLIP_CD_M5,CURRENT_SLIP_CD_M6,
               CURRENT_SLIP_CD_M7,CURRENT_SLIP_CD_M8,CURRENT_SLIP_CD_M9,
               CURRENT_SLIP_CD_M10,CURRENT_SLIP_CD_M11,CURRENT_SLIP_CD_M12,
               CURRENT_SLIP_CD_Y,CURRENT_SLIP_CD,
               CREATED_DATE, CREATED_PRG_NM,
               UPDATED_DATE, UPDATED_PRG_NM
          INTO vc2SCC_CompanyCd,numSCC_Term,vc2SCC_NumberingCd,
               vc2SCC_CurrentSlipCdM1,vc2SCC_CurrentSlipCdM2,vc2SCC_CurrentSlipCdM3,
               vc2SCC_CurrentSlipCdM4,vc2SCC_CurrentSlipCdM5,vc2SCC_CurrentSlipCdM6,
               vc2SCC_CurrentSlipCdM7,vc2SCC_CurrentSlipCdM8,vc2SCC_CurrentSlipCdM9,
               vc2SCC_CurrentSlipCdM10,vc2SCC_CurrentSlipCdM11,vc2SCC_CurrentSlipCdM12,
               vc2SCC_CurrentSlipCdY,vc2SCC_CurrentSlipCd,
               dtmSCC_CreDate,vc2SCC_CreCd,dtmSCC_UpdDate,vc2SCC_UpdCd
          FROM   M_SLIP_CD_CTRL
         WHERE  COMPANY_CD  = pvc2CompanyCd        --会社コード
           AND TERM         = numTermTemp          --期
           AND NUMBERING_CD = vc2SLT_NumberingCd   --採番コード
           FOR UPDATE;

        blnSlipCdCtrlFlg := TRUE;

    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            blnSlipCdCtrlFlg := FALSE;
    END;

--  伝票採番コントロールが存在する場合
    IF blnSlipCdCtrlFlg THEN
--      月間採番の場合、月間最終伝票番号を設定する
        IF numSLT_NumberingTyp = NUMBERING_TYP_MONTH THEN
            IF numTableNo = 1 THEN
                IF vc2SCC_CurrentSlipCdM1 IS NULL THEN
                    vc2SCC_CurrentSlipCdM1 := vc2SLT_StartSlipCd;
                ELSE
                    vc2SCC_CurrentSlipCdM1 := TO_CHAR(TO_NUMBER(vc2SCC_CurrentSlipCdM1) + 1);
                    IF TO_NUMBER(vc2SCC_CurrentSlipCdM1) > numEndSlipCd THEN
                        vc2SCC_CurrentSlipCdM1 := vc2SLT_StartSlipCd;
                    END IF;
                END IF;
                pvc2SlipCd := vc2SCC_CurrentSlipCdM1;
            ELSIF numTableNo = 2 THEN
                IF vc2SCC_CurrentSlipCdM2 IS NULL THEN
                    vc2SCC_CurrentSlipCdM2 := vc2SLT_StartSlipCd;
                ELSE
                    vc2SCC_CurrentSlipCdM2 := TO_CHAR(TO_NUMBER(vc2SCC_CurrentSlipCdM2) + 1);
                    IF TO_NUMBER(vc2SCC_CurrentSlipCdM2) > numEndSlipCd THEN
                        vc2SCC_CurrentSlipCdM2 := vc2SLT_StartSlipCd;
                    END IF;
                END IF;
                pvc2SlipCd := vc2SCC_CurrentSlipCdM2;
            ELSIF numTableNo = 3 THEN
                IF vc2SCC_CurrentSlipCdM3 IS NULL THEN
                    vc2SCC_CurrentSlipCdM3 := vc2SLT_StartSlipCd;
                ELSE
                    vc2SCC_CurrentSlipCdM3 := TO_CHAR(TO_NUMBER(vc2SCC_CurrentSlipCdM3) + 1);
                    IF TO_NUMBER(vc2SCC_CurrentSlipCdM3) > numEndSlipCd THEN
                        vc2SCC_CurrentSlipCdM3 := vc2SLT_StartSlipCd;
                    END IF;
                END IF;
                pvc2SlipCd := vc2SCC_CurrentSlipCdM3;
            ELSIF numTableNo = 4 THEN
                IF vc2SCC_CurrentSlipCdM4 IS NULL THEN
                    vc2SCC_CurrentSlipCdM4 := vc2SLT_StartSlipCd;
                ELSE
                    vc2SCC_CurrentSlipCdM4 := TO_CHAR(TO_NUMBER(vc2SCC_CurrentSlipCdM4) + 1);
                    IF TO_NUMBER(vc2SCC_CurrentSlipCdM4) > numEndSlipCd THEN
                        vc2SCC_CurrentSlipCdM4 := vc2SLT_StartSlipCd;
                    END IF;
                END IF;
                pvc2SlipCd := vc2SCC_CurrentSlipCdM4;
            ELSIF numTableNo = 5 THEN
                IF vc2SCC_CurrentSlipCdM5 IS NULL THEN
                    vc2SCC_CurrentSlipCdM5 := vc2SLT_StartSlipCd;
                ELSE
                    vc2SCC_CurrentSlipCdM5 := TO_CHAR(TO_NUMBER(vc2SCC_CurrentSlipCdM5) + 1);
                    IF TO_NUMBER(vc2SCC_CurrentSlipCdM5) > numEndSlipCd THEN
                        vc2SCC_CurrentSlipCdM5 := vc2SLT_StartSlipCd;
                    END IF;
                END IF;
                pvc2SlipCd := vc2SCC_CurrentSlipCdM5;
            ELSIF numTableNo = 6 THEN
                IF vc2SCC_CurrentSlipCdM6 IS NULL THEN
                    vc2SCC_CurrentSlipCdM6 := vc2SLT_StartSlipCd;
                ELSE
                    vc2SCC_CurrentSlipCdM6 := TO_CHAR(TO_NUMBER(vc2SCC_CurrentSlipCdM6) + 1);
                    IF TO_NUMBER(vc2SCC_CurrentSlipCdM6) > numEndSlipCd THEN
                        vc2SCC_CurrentSlipCdM6 := vc2SLT_StartSlipCd;
                    END IF;
                END IF;
                pvc2SlipCd := vc2SCC_CurrentSlipCdM6;
            ELSIF numTableNo = 7 THEN
                IF vc2SCC_CurrentSlipCdM7 IS NULL THEN
                    vc2SCC_CurrentSlipCdM7 := vc2SLT_StartSlipCd;
                ELSE
                    vc2SCC_CurrentSlipCdM7 := TO_CHAR(TO_NUMBER(vc2SCC_CurrentSlipCdM7) + 1);
                    IF TO_NUMBER(vc2SCC_CurrentSlipCdM7) > numEndSlipCd THEN
                        vc2SCC_CurrentSlipCdM7 := vc2SLT_StartSlipCd;
                    END IF;
                END IF;
                pvc2SlipCd := vc2SCC_CurrentSlipCdM7;
            ELSIF numTableNo = 8 THEN
                IF vc2SCC_CurrentSlipCdM8 IS NULL THEN
                    vc2SCC_CurrentSlipCdM8 := vc2SLT_StartSlipCd;
                ELSE
                    vc2SCC_CurrentSlipCdM8 := TO_CHAR(TO_NUMBER(vc2SCC_CurrentSlipCdM8) + 1);
                    IF TO_NUMBER(vc2SCC_CurrentSlipCdM8) > numEndSlipCd THEN
                        vc2SCC_CurrentSlipCdM8 := vc2SLT_StartSlipCd;
                    END IF;
                END IF;
                pvc2SlipCd := vc2SCC_CurrentSlipCdM8;
            ELSIF numTableNo = 9 THEN
                IF vc2SCC_CurrentSlipCdM9 IS NULL THEN
                    vc2SCC_CurrentSlipCdM9 := vc2SLT_StartSlipCd;
                ELSE
                    vc2SCC_CurrentSlipCdM9 := TO_CHAR(TO_NUMBER(vc2SCC_CurrentSlipCdM9) + 1);
                    IF TO_NUMBER(vc2SCC_CurrentSlipCdM9) > numEndSlipCd THEN
                        vc2SCC_CurrentSlipCdM9 := vc2SLT_StartSlipCd;
                    END IF;
                END IF;
                pvc2SlipCd := vc2SCC_CurrentSlipCdM9;
            ELSIF numTableNo = 10 THEN
                IF vc2SCC_CurrentSlipCdM10 IS NULL THEN
                    vc2SCC_CurrentSlipCdM10 := vc2SLT_StartSlipCd;
                ELSE
                    vc2SCC_CurrentSlipCdM10 := TO_CHAR(TO_NUMBER(vc2SCC_CurrentSlipCdM10) + 1);
                    IF TO_NUMBER(vc2SCC_CurrentSlipCdM10) > numEndSlipCd THEN
                        vc2SCC_CurrentSlipCdM10 := vc2SLT_StartSlipCd;
                    END IF;
                END IF;
                pvc2SlipCd := vc2SCC_CurrentSlipCdM10;
            ELSIF numTableNo = 11 THEN
                IF vc2SCC_CurrentSlipCdM11 IS NULL THEN
                    vc2SCC_CurrentSlipCdM11 := vc2SLT_StartSlipCd;
                ELSE
                    vc2SCC_CurrentSlipCdM11 := TO_CHAR(TO_NUMBER(vc2SCC_CurrentSlipCdM11) + 1);
                    IF TO_NUMBER(vc2SCC_CurrentSlipCdM11) > numEndSlipCd THEN
                        vc2SCC_CurrentSlipCdM11 := vc2SLT_StartSlipCd;
                    END IF;
                END IF;
                pvc2SlipCd := vc2SCC_CurrentSlipCdM11;
            ELSIF numTableNo = 12 THEN
                IF vc2SCC_CurrentSlipCdM12 IS NULL THEN
                    vc2SCC_CurrentSlipCdM12 := vc2SLT_StartSlipCd;
                ELSE
                    vc2SCC_CurrentSlipCdM12 := TO_CHAR(TO_NUMBER(vc2SCC_CurrentSlipCdM12) + 1);
                    IF TO_NUMBER(vc2SCC_CurrentSlipCdM12) > numEndSlipCd THEN
                        vc2SCC_CurrentSlipCdM12 := vc2SLT_StartSlipCd;
                    END IF;
                END IF;
                pvc2SlipCd := vc2SCC_CurrentSlipCdM12;
            END IF;
--      年間採番の場合、年間最終伝票Noを設定する
        ELSIF numSLT_NumberingTyp = NUMBERING_TYP_YEAR THEN
            IF vc2SCC_CurrentSlipCdY IS NULL THEN
                vc2SCC_CurrentSlipCdY := vc2SLT_StartSlipCd;
            ELSE
                vc2SCC_CurrentSlipCdY := TO_CHAR(TO_NUMBER(vc2SCC_CurrentSlipCdY) + 1);
                IF TO_NUMBER(vc2SCC_CurrentSlipCdY) > numEndSlipCd THEN
                    vc2SCC_CurrentSlipCdY := vc2SLT_StartSlipCd;
                END IF;
            END IF;
            pvc2SlipCd := vc2SCC_CurrentSlipCdY;
--      単純採番の場合
        ELSIF numSLT_NumberingTyp = NUMBERING_TYP_SIMPLE THEN
            IF vc2SCC_CurrentSlipCd IS NULL THEN
                vc2SCC_CurrentSlipCd := '0';
            END IF;
            vc2SCC_CurrentSlipCd := TO_CHAR(TO_NUMBER(vc2SCC_CurrentSlipCd) + 1);
            IF TO_NUMBER(vc2SCC_CurrentSlipCd) > numEndSlipCd THEN
                vc2SCC_CurrentSlipCd := vc2SLT_StartSlipCd;
            END IF;
            pvc2SlipCd := vc2SCC_CurrentSlipCd;
        END IF;

--      伝票採番コントロール更新データの作成
        UPDATE    M_SLIP_CD_CTRL                   --伝票採番コントロール
            SET   CURRENT_SLIP_CD_M1  = vc2SCC_CurrentSlipCdM1,
                  CURRENT_SLIP_CD_M2  = vc2SCC_CurrentSlipCdM2,
                  CURRENT_SLIP_CD_M3  = vc2SCC_CurrentSlipCdM3,
                  CURRENT_SLIP_CD_M4  = vc2SCC_CurrentSlipCdM4,
                  CURRENT_SLIP_CD_M5  = vc2SCC_CurrentSlipCdM5,
                  CURRENT_SLIP_CD_M6  = vc2SCC_CurrentSlipCdM6,
                  CURRENT_SLIP_CD_M7  = vc2SCC_CurrentSlipCdM7,
                  CURRENT_SLIP_CD_M8  = vc2SCC_CurrentSlipCdM8,
                  CURRENT_SLIP_CD_M9  = vc2SCC_CurrentSlipCdM9,
                  CURRENT_SLIP_CD_M10 = vc2SCC_CurrentSlipCdM10,
                  CURRENT_SLIP_CD_M11 = vc2SCC_CurrentSlipCdM11,
                  CURRENT_SLIP_CD_M12 = vc2SCC_CurrentSlipCdM12,
                  CURRENT_SLIP_CD_Y   = vc2SCC_CurrentSlipCdY,
                  CURRENT_SLIP_CD     = vc2SCC_CurrentSlipCd,
                  UPDATED_DATE        = SYSDATE,                  --最新更新日時
                  UPDATED_PRG_NM      = pvc2UserID                --最新更新者コード
            WHERE  COMPANY_CD   = pvc2CompanyCd        --会社コード
               AND TERM         = numTermTemp          --期
               AND NUMBERING_CD = vc2SLT_NumberingCd;  --採番コード

--  伝票採番コントロールが存在しない場合
    ELSE
        pvc2SlipCd := vc2SLT_StartSlipCd;
        vc2SCC_CompanyCd := pvc2CompanyCd;
        /* 単純採番の場合、期数の規定値を設定する */
        IF numSLT_NumberingTyp = NUMBERING_TYP_SIMPLE THEN
            numSCC_Term := TO_NUMBER(SLIP_NUMBERING_TERM_DEFAULT);
        /* 月間／年間採番の場合、現在の期を設定する */
        ELSE
            numSCC_Term := numTerm;
        END IF;
        vc2SCC_NumberingCd := vc2SLT_NumberingCd;
        vc2SCC_CurrentSlipCdM1  := '0';
        vc2SCC_CurrentSlipCdM2  := '0';
        vc2SCC_CurrentSlipCdM3  := '0';
        vc2SCC_CurrentSlipCdM4  := '0';
        vc2SCC_CurrentSlipCdM5  := '0';
        vc2SCC_CurrentSlipCdM6  := '0';
        vc2SCC_CurrentSlipCdM7  := '0';
        vc2SCC_CurrentSlipCdM8  := '0';
        vc2SCC_CurrentSlipCdM9  := '0';
        vc2SCC_CurrentSlipCdM10 := '0';
        vc2SCC_CurrentSlipCdM11 := '0';
        vc2SCC_CurrentSlipCdM12 := '0';
        vc2SCC_CurrentSlipCdY   := '0';
        vc2SCC_CurrentSlipCd    := '0';

        IF numSLT_NumberingTyp = NUMBERING_TYP_MONTH THEN   --月間採番時
            IF numTableNo = 1 THEN
                vc2SCC_CurrentSlipCdM1  := pvc2SlipCd;
            ELSIF numTableNo = 2 THEN
                vc2SCC_CurrentSlipCdM2  := pvc2SlipCd;
            ELSIF numTableNo = 3 THEN
                vc2SCC_CurrentSlipCdM3  := pvc2SlipCd;
            ELSIF numTableNo = 4 THEN
                vc2SCC_CurrentSlipCdM4  := pvc2SlipCd;
            ELSIF numTableNo = 5 THEN
                vc2SCC_CurrentSlipCdM5  := pvc2SlipCd;
            ELSIF numTableNo = 6 THEN
                vc2SCC_CurrentSlipCdM6  := pvc2SlipCd;
            ELSIF numTableNo = 7 THEN
                vc2SCC_CurrentSlipCdM7  := pvc2SlipCd;
            ELSIF numTableNo = 8 THEN
                vc2SCC_CurrentSlipCdM8  := pvc2SlipCd;
            ELSIF numTableNo = 9 THEN
                vc2SCC_CurrentSlipCdM9  := pvc2SlipCd;
            ELSIF numTableNo = 10 THEN
                vc2SCC_CurrentSlipCdM10 := pvc2SlipCd;
            ELSIF numTableNo = 11 THEN
                vc2SCC_CurrentSlipCdM11 := pvc2SlipCd;
            ELSIF numTableNo = 12 THEN
                vc2SCC_CurrentSlipCdM12 := pvc2SlipCd;
            END IF;
        ELSIF numSLT_NumberingTyp = NUMBERING_TYP_YEAR THEN --年間採番時
            vc2SCC_CurrentSlipCdY   := pvc2SlipCd;
        ELSE                                                --単純採番時
            vc2SCC_CurrentSlipCd    := pvc2SlipCd;
        END IF;

        INSERT INTO M_SLIP_CD_CTRL (   --伝票採番コントロール
            COMPANY_CD, TERM, NUMBERING_CD,
            CURRENT_SLIP_CD_M1,  CURRENT_SLIP_CD_M2,
            CURRENT_SLIP_CD_M3,  CURRENT_SLIP_CD_M4,
            CURRENT_SLIP_CD_M5,  CURRENT_SLIP_CD_M6,
            CURRENT_SLIP_CD_M7,  CURRENT_SLIP_CD_M8,
            CURRENT_SLIP_CD_M9,  CURRENT_SLIP_CD_M10,
            CURRENT_SLIP_CD_M11, CURRENT_SLIP_CD_M12,
            CURRENT_SLIP_CD_Y,
            CURRENT_SLIP_CD,
            CREATED_DATE, CREATED_PRG_NM,
            UPDATED_DATE, UPDATED_PRG_NM
        ) VALUES (
            vc2SCC_CompanyCd, numSCC_Term, vc2SCC_NumberingCd,
            vc2SCC_CurrentSlipCdM1,  vc2SCC_CurrentSlipCdM2,
            vc2SCC_CurrentSlipCdM3,  vc2SCC_CurrentSlipCdM4,
            vc2SCC_CurrentSlipCdM5,  vc2SCC_CurrentSlipCdM6,
            vc2SCC_CurrentSlipCdM7,  vc2SCC_CurrentSlipCdM8,
            vc2SCC_CurrentSlipCdM9,  vc2SCC_CurrentSlipCdM10,
            vc2SCC_CurrentSlipCdM11, vc2SCC_CurrentSlipCdM12,
            vc2SCC_CurrentSlipCdY,
            vc2SCC_CurrentSlipCd,
            SYSDATE, pvc2UserID,
            SYSDATE, pvc2UserID
        );
    END IF;


--  開始伝票No.の桁数と終了伝票No.の桁数の大きい方の桁数と
--  採番した最終伝票番号の桁数の
--  差数分だけゼロパディングした番号を再セットする
    IF LENGTHB(vc2SLT_StartSlipCd) >= LENGTHB(vc2SLT_EndSlipCd) THEN
        numSlipCdFig := LENGTHB(vc2SLT_StartSlipCd);
        pvc2SlipCd   := LPAD(pvc2SlipCd, numSlipCdFig, '0');
    ELSE
        numSlipCdFig := LENGTHB(vc2SLT_EndSlipCd);
        pvc2SlipCd   := LPAD(pvc2SlipCd, numSlipCdFig, '0');
    END IF;

    /* TraceLog の出力 */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    COMMIT;
    RETURN TRUE;

--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN excSQL_NORMAL_END        THEN    --正常終了
        NULL;
        RETURN TRUE;

    WHEN excFNC_PARAMETER_ERR OR            --入力パラメータエラー
         excFNC_MST_NODATA    OR            --マスタなしエラー
         excFNC_GET_CTRLDATE_ERR    THEN    --「期取得」エラー
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        RETURN FALSE;

    WHEN OTHERS THEN                             --その他のエラー
        ROLLBACK;
        /* ErrorLog の出力 */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, SQLCODE, SQLERRM);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        RETURN FALSE;
END FncGetSlipCd4ARAP;
/
