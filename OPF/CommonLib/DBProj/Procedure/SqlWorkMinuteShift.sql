CREATE OR REPLACE PROCEDURE SQLWORKMINUTESHIFT (
/*------------------------------------------------------------------------------
'
' version   : 1.30.00
'
' 修正履歴
' 2008.07.10 初版	※時間端処理の追加
' 2008.07.10 	Ver1.20.00	※納期系用に限定したAtsumi様用版（IFそのまま）
' 2008.10.08 	Ver1.30.00	納期系以外に、開始日系の吸着指定に対応した。
'
' 機能      : 稼働日計算：指定日時のから指定分間の稼動時間上のシフトした日時を求める
'             (Java呼び出しIF)
'
' 戻り値    : Boolean
'               True :正常終了
'               False:異常終了
'
' 引き数    : pvc2LogMode          - (i)ＬＯＧモード
'             pvc2OutputMode       - (i)出力モード
'             pvc2OutputPath       - (i)出力ファイルパス
'             pvc2OutputName       - (i)出力ファイル名
'             pvc2BusinessName     - (i)業務名
'             pvc2PlantCd          - (i)工場コード
'             pvc2ItemCd           - (i)品目番号
'             pdtmDateFrom         - (i)対象日時From（Min）基準日時
'             pnumDifference       - (i)差分（分単位）※「－」の場合、過去へ
'             pdtmDateTo           - (i)対象日時To（Max）比較日時
'			pnumEndFlg		   - (i)稼働時間帯の端の処理指定（開始日系：０、納期系：１）	ADD 20081008 TEST
'             pdtmShiftDate        - (o)算出結果日時
'             pnumStatus           - (o)結果ステータス
'
' 機能説明  : 指定日時のから指定分間の稼動時間上のシフトした日時を求める
'
' 備考      : エラー発生時は結果ステータス(pnumStatus)にエラー内容を設定して
'              ※「比較日時＋分」のイメージ
''
------------------------------------------------------------------------------*/
    pvc2LogMode            IN  VARCHAR2    --ＬＯＧモード
   ,pvc2OutputMode         IN  VARCHAR2    --出力モード
   ,pvc2OutputPath         IN  VARCHAR2    --出力ファイルパス
   ,pvc2OutputName         IN  VARCHAR2    --出力ファイル名
   ,pvc2UserId             IN  VARCHAR2    --ユーザＩＤ
   ,pvc2BusinessName       IN  VARCHAR2    --業務名
   ,pvc2PlantCd            IN  VARCHAR2    --工場コード
   ,pvc2ItemCd             IN  VARCHAR2    --品目番号
   ,pdtmDateFrom         IN DATE	-- (i)対象日時From（Min）基準日時
   ,pnumDifference         IN  NUMBER      --差分（分単位）※「－」の場合、過去へ
   ,pnumEndFlg         IN  NUMBER      --稼働時間帯の端の処理指定（開始日系：０、納期系：１）	ADD 20081008 TEST
   ,pdtmShiftDate           OUT DATE	-- (o)算出結果日時
   ,pnumStatus             OUT NUMBER      --結果ステータス
)
IS
/* 変数の宣言 */
    UTL_FileHandle         UTL_FILE.FILE_TYPE; --ファイルハンドル
    blnRet                 BOOLEAN;            --BOOLEAN型 返却値
    dtmResultDtTm          DATE;
    blnStartForwardFlg     BOOLEAN;

	nRetDiff		NUMBER(18);
	nRetDate		DATE;

/* 定数の宣言 */
    MY_SQL_NAME            VARCHAR2(60)  := 'SqlWorkMinuteShift'; --ＰＬ／ＳＱＬ名
    LOGMODE_NOLOG          VARCHAR2(4)   := '0';              --ＬＯＧモード　ＬＯＧ無し
    OUTPUTMODE_FILE        VARCHAR2(4)   := '1';              --出力モード　　ファイル
    LOGMSG_START           VARCHAR2(20)   := 'Start';          --ログ用メソッド開始宣言
    LOGMSG_END             VARCHAR2(12)   := 'End';            --ログ用メソッド終了宣言
    LOGMSG_ERR             VARCHAR2(12)   := 'Err';            --ログ用メソッドエラー宣言
    LOGMSG_GETERR          VARCHAR2(32)   := 'GetNoErr';       --ログ用メソッド採番エラー宣言

    FORWARD_FLG_FALSE      NUMBER        := 0;                -- 基準日前倒しフラグ FALSE
    FORWARD_FLG_TRUE       NUMBER        := 1;                -- 基準日前倒しフラグ TRUE

    STATUS_NORMAL                NUMBER        := 0;          -- 正常終了
    STATUS_INVALID_PATH          NUMBER        := 1;          -- ファイルの場所またはファイル名が無効です。
    STATUS_INVALID_MODE          NUMBER        := 2;          -- FOPEN のopen_mode パラメータが無効です。
    STATUS_INVALID_FILEHANDLE    NUMBER        := 3;          -- ファイル・ハンドルが無効です。
    STATUS_INVALID_OPERATION     NUMBER        := 4;          -- 要求どおりにファイルをオープンできないか、または操作できません。
    STATUS_READ_ERROR            NUMBER        := 5;          -- 読込み操作中にオペレーティング・システムのエラーが発生しました。
    STATUS_WRITE_ERROR           NUMBER        := 6;          -- 書込み操作中にオペレーティング・システムのエラーが発生しました。
    STATUS_INTERNAL_ERROR        NUMBER        := 7;          -- PL/SQL 内の未指定エラー。
    STATUS_TRACE_LOG_ERROR       NUMBER        := 8;          -- FNCTRACELOGエラー
    STATUS_WORK_DAY_CALC_ERROR   NUMBER        := 9;          -- 稼働日計算エラー
    STATUS_OTHERS_ERROR          NUMBER        := 10;         -- その他のエラー

    -- 例外の宣言
    excFncTraceLog               EXCEPTION;          --トレースログ出力エラー
    excFncWorkDayCalc            EXCEPTION;          --稼働日計算エラー

BEGIN

    pnumStatus := STATUS_NORMAL;
    /* LogFile の OPEN */
    blnRet := FNCLOGOPEN(pvc2OutputPath, MY_SQL_NAME||'_'||pvc2OutputName, pvc2PlantCd, pvc2OutputMode, UTL_FileHandle);

    /* TraceLog の出力 */
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);
    IF blnRet=FALSE THEN
        RAISE excFncTraceLog;
    END IF
    ;

	-------------------------------
	blnStartForwardFlg := true;
	--算出稼働日時のシフト	------FncWorkMinuteCalc-------
	blnRet := FNCWORKMINUTESHIFT(
					UTL_FileHandle, 	-- pFileHandle          - (i)ファイルハンドル
					pvc2LogMode, 		-- pvc2LogMode          - (i)ＬＯＧモード
					pvc2OutputMode,		-- pvc2OutputMode       - (i)出力モード
					pvc2UserId, 		-- pvc2UserId           - (i)ユーザＩＤ
					pvc2BusinessName, 	-- pvc2BusinessName     - (i)業務名
					pvc2PlantCd,		-- pvc2PlantCd          - (i)工場コード
					pvc2ItemCd,			-- pvc2ItemCd           - (i)品目番号
					pdtmDateFrom,	--	IN  DATE	--差分（分単位）※「－」の場合、過去へ
					pnumDifference,		--	IN  NUMBER	--差分（分単位）※「－」の場合、過去へ
   					pnumEndFlg,			--稼働時間帯の端の処理指定（開始日系：０、納期系：１）	ADD 20081008 TEST
					nRetDate		--	OUT  DATE	--(o)算出結果日時
				);
	IF blnRet = FALSE THEN
		RAISE excFncWorkDayCalc;
	END IF;

	-------------------------------
    pdtmShiftDate := nRetDate;


        -- TraceLog For DEBUG -----------------------
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME,
                              'RSLT:EndFlg=1:'
                              	||TO_CHAR(pdtmDateFrom,'YYYY/MM/DD HH24:MI:SS')|| '＋'
                              	||pnumDifference||'Min.'|| '≒'
                              	||TO_CHAR(pdtmShiftDate,'YYYY/MM/DD HH24:MI:SS')
                              );
--    DBMS_OUTPUT.PUT_LINE('採番結果：' || TO_CHAR(dtmResultDtTm,'YYYY/MM/DD') );

    /* TraceLog の出力 */
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    /* LogFile の CLOSE */
    blnRet := FNCLOGCLOSE(UTL_FileHandle);
    IF blnRet=FALSE THEN
        RAISE excFncTraceLog;
    END IF
    ;

--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN excFncTraceLog THEN           --
        pdtmShiftDate := NULL;
        pnumStatus := STATUS_TRACE_LOG_ERROR;
        /* LogFile の CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);
    WHEN excFncWorkDayCalc THEN           --
        pdtmShiftDate := NULL;
        pnumStatus := STATUS_WORK_DAY_CALC_ERROR;
        /* TraceLog の出力 */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_GETERR);
        /* LogFile の CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);
    WHEN UTL_FILE.INVALID_PATH THEN           --
        pdtmShiftDate := NULL;
        pnumStatus := STATUS_INVALID_PATH;
    WHEN UTL_FILE.INVALID_MODE THEN           --
        pdtmShiftDate := NULL;
        pnumStatus := STATUS_INVALID_MODE;
    WHEN UTL_FILE.INVALID_OPERATION THEN      --
        pdtmShiftDate := NULL;
        pnumStatus := STATUS_INVALID_OPERATION;
    WHEN UTL_FILE.INTERNAL_ERROR THEN         --
        pdtmShiftDate := NULL;
        pnumStatus := STATUS_INTERNAL_ERROR;
    WHEN UTL_FILE.INVALID_FILEHANDLE THEN     --
        pdtmShiftDate := NULL;
        pnumStatus := STATUS_INVALID_FILEHANDLE;
    WHEN OTHERS THEN
        pdtmShiftDate := NULL;
        pnumStatus := STATUS_OTHERS_ERROR;
        /* ErrorLog の出力 */
        blnRet := FncErrLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, SQLCODE, SQLERRM);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_ERR);
        /* LogFile の CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

        pnumStatus := STATUS_OTHERS_ERROR;

END;
/
