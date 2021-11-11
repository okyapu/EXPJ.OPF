CREATE OR REPLACE PROCEDURE SQLWORKINPROCBYITEMINTERFACE(
/*------------------------------------------------------------------------------
'
'$Author: zhangran $
'$Revision: 1.3 $
'
' 機能      : 品目別作業計画ＣＳＶ取込
'
' 戻り値    :
'
' 引き数    : ■共通（必須）
'             pvc2LogMode          - (i)ＬＯＧモード
'             pvc2OutputMode       - (i)出力モード
'             pvc2OutputPath       - (i)出力ファイルパス
'             pvc2OutputName       - (i)出力ファイル名
'             pvc2UserId           - (i)ユーザＩＤ
'             pvc2BusinessName     - (i)業務名
'             pvc2PlantCd          - (i)工場コード
'             pnumCsvTakeTyp       - (i)CSV取込方式
'             pvc2CsvTakePath      - (i)取込ファイルパス
'             pvc2CsvBackupPath    - (i)バックアップフォルダパス
'
'             ■プログラム固有
'             pnumReturn           - (o)処理結果  （1:正常終了、2:警告終了、3:異常終了）
'
' 機能説明  : 品目別作業計画ＣＳＶファイルを読み込み、[作業計画取込]を作成します。
'
' 備考      :
'
------------------------------------------------------------------------------*/
    pvc2LogMode            IN  VARCHAR2    --ＬＯＧモード
   ,pvc2OutputMode         IN  VARCHAR2    --出力モード
   ,pvc2OutputPath         IN  VARCHAR2    --出力ファイルパス
   ,pvc2OutputName         IN  VARCHAR2    --出力ファイル名
   ,pvc2UserId             IN  VARCHAR2    --ユーザＩＤ
   ,pvc2BusinessName       IN  VARCHAR2    --業務名
   ,pvc2PlantCd            IN  VARCHAR2    --工場コード
   ,pnumCsvTakeTyp         IN  NUMBER      --CSV取込方式
   ,pvc2CsvTakePath        IN  VARCHAR2    --取込ファイルパス
   ,pvc2CsvBackupPath      IN  VARCHAR2    --バックアップフォルダパス
   ,pnumReturn             OUT NUMBER      --処理結果
)
IS

/* カーソルの宣言 */

    --【パラメータ】
    CURSOR curSYS_PARAMETER(
        c_NAME         VARCHAR2
    ) IS
    SELECT  VALUE
    FROM    SYS_PARAMETER
    WHERE   NAME = c_NAME;

/* ROWTYPE の宣言 */
    RtpSYS_PARAMETER                curSYS_PARAMETER%ROWTYPE;                                  -- 【パラメータ】

/* 定数の宣言 */

    MY_SQL_NAME                         VARCHAR2(84)    := 'SQLWORKINPROCBYITEMINTERFACE';
    STATUS_NORMAL                       NUMBER(1)       := 1;                                  --正常終了
    STATUS_WARNING                      NUMBER(1)       := 2;                                  --警告終了
    STATUS_ERROR                        NUMBER(1)       := 3;                                  --異常終了
    DATE_FORMAT                         VARCHAR2(72)    := 'YYYY/MM/DD HH24:MI';               -- 日付変換時のフォーマット
    DEFAULT_CHAR_SET                    VARCHAR2(32)    := 'JA16SJIS';                         -- S-JIS
    WK_IN_PROC_BY_ITEM_IF_CSV_PATH      VARCHAR2(88)    := 'WK_IN_PROC_BY_ITEM_IF_CSV_PATH';   -- [パラメータ].名前
    CSV_CHAR_SET                        VARCHAR2(64)    := 'CSV_CHARACTERSET';                 -- [区分コード].名前
    CSV_TAKE_TYP_FIX                    NUMBER(1)       := 1;                                  -- 1：固定ファイル取込
    CSV_TAKE_TYP_DESINATED              NUMBER(1)       := 2;                                  -- 2：指定ファイル取込
    PATH_SLASH                          VARCHAR2(4)     := '/';                                --ファイルパス区切り文字
    PATH_DELIM                          VARCHAR2(4)     := '\';                                --ファイルパス区切り文字
    CSV_DELIM                           VARCHAR2(4)     := ',';                                --ＣＳＶ項目の区切り文字
    CSV_LINE_MAX                        INTEGER         := 2048;                               --ＣＳＶファイル１行当りの最大数
    CSV_COLUMN_COUNT                    INTEGER         := 7;                                  --ＣＳＶファイル１行当りの項目数
    LENGTH_25                           NUMBER(2)       := 25;                                 --文字数:=25
    LENGTH_80                           NUMBER(2)       := 80;                                 --文字数:=80
    LENGTH_5                            NUMBER(1)       :=5;                                   --文字数 :=5
    NUMBER_100000000000000              NUMBER(15)      :=100000000000000;                     --数値桁数:15桁

/* 例外の宣言 */

/* EXCEPTION の宣言 */
    excERR_SKIP                         EXCEPTION;      --実行不可
    excERR_MAST                         EXCEPTION;      --カーソルOPEN中のEXCEPTION
    excCSV_CHECK_ERR                    EXCEPTION;      --CSVデータのチェックエラー

/* MESSAGE の宣言 */
    APS_ERR_CSVFILEPATH                 VARCHAR2(28)    := 'AD60004';   --品目別作業計画CSVパスの取得に失敗しました。
    APS_ERR_CSVFILE                     VARCHAR2(28)    := 'AD60005';   --ファイルの処理中にエラーが発生しました。
    APS_ERR_CSV_DATA_FORMAT             VARCHAR2(28)    := 'AD60006';   --CSVファイルが不正なフォーマットです。
    APS_ERR_CSV_NUMBER_FORMAT           VARCHAR2(28)    := 'AD60007';   --CSVファイルで数値項目が不正なフォーマットです。
    APS_ERR_CSV_DATE_FORMAT             VARCHAR2(28)    := 'AD60008';   --CSVファイルで日付項目が不正なフォーマットです。
    APS_ERR_REQUIRED                    VARCHAR2(28)    := 'AD60009';   --CSVファイルの必須項目に値が設定されていません。
    APS_ERR_NUMBER_MINUS                VARCHAR2(28)    := 'AD60010';   --CSVファイルの数値項目にマイナス値が設定されています。
    APS_BATCH_START                     VARCHAR2(28)    := 'AD60011';   --品目別作業計画CSV取込処理を開始しました。
    APS_BATCH_END                       VARCHAR2(28)    := 'AD60012';   --品目別作業計画CSV取込処理を終了しました。
    APS_BATCH_EXC                       VARCHAR2(28)    := 'AD60013';   --品目別作業計画CSV取込処理が異常終了しました。
    APS_DATA_PROCESSING                 VARCHAR2(28)    := 'AD60014';   --処理件数
    APS_ERR_CSV_DATA_DIGIT              VARCHAR2(28)    := 'AA01501';   --桁数以内で設定してください。
    APS_ERR_CSV_DATA_ILLEGAL            VARCHAR2(28)    := 'AA01524';   --禁則文字（「%」、「_」、「\」）が含まれています。
 


/* LOG の宣言 */
    LOGMSG_NAME                         VARCHAR2(52)    := '名前=';
    LOGMSG_START                        VARCHAR2(20)    := 'Start';
    LOGMSG_END                          VARCHAR2(12)    := 'End';
    LOGMSG_BRAKETS                      VARCHAR2(4)     := '[';
    LOGMSG_BRAKETE                      VARCHAR2(4)     := ']';
    LOGMSG_CSVFILE                      VARCHAR2(76)    := '(SBM1329)品目別作業計画ファイル名=';
    LOGMSG_LINECNT                      VARCHAR2(52)    := 'CSV行番号=';
    LOGMSG_START_PGNM                   VARCHAR2(152)   := '(SBM1326)品目別作業計画CSV取込処理を開始しました。';
    LOGMSG_END_PGNM                     VARCHAR2(152)   := '(SBM1327)品目別作業計画CSV取込処理を終了しました。';
    LOGMSG_TAKE_FILENAME                VARCHAR2(100)   := '(SBM1328)取込ファイル名：';
    LOGMSG_SPACER                       VARCHAR2(4)     := ' ';
    LOGMSG_CSV_ERR_COLUMN               VARCHAR2(88)    := 'エラー項目名=';
    LOGMSG_COLUMN_CNT                   VARCHAR2(36)    := 'CSV項目数';
    COL_ITEM_CD                         VARCHAR2(32)    := '品目番号';
    COL_PRD_DUE_DATE                    VARCHAR2(32)    := '製造納期';
    COL_PRD_START_DATE                  VARCHAR2(40)    := '製造着手日';
    COL_OPR_INST_QTY                    VARCHAR2(40)    := '作業指示数';
    COL_WS_CD                           VARCHAR2(48)    := '作業区コード';
    COL_JOB_ODR_CD                      VARCHAR2(16)    := '製番';
    COL_WK_IN_PROC_BY_ITEM_COMMENT      VARCHAR2(16)    := '備考';


/* レコード型の宣言 */

    TYPE TYP_COLUMN_ARRY IS TABLE OF VARCHAR2(2048) INDEX BY BINARY_INTEGER;

    -- 業務メッセージ
    TYPE TYP_MSG_LOG_TYPE IS RECORD(
        fncName       VARCHAR2(100)         -- 業務名
       ,errCd         VARCHAR2(28)          -- オーダコード
       ,errMsg        VARCHAR2(4096)        -- エラーメッセージ
    );
    TYPE MSGLOG_TYPE IS TABLE OF TYP_MSG_LOG_TYPE INDEX BY BINARY_INTEGER;
    msgLogData       MSGLOG_TYPE;

/* 変数の宣言 */

    vc2DBCharSet                VARCHAR2(100);                  --DBの文字コード
    vc2CSVCharSet               VARCHAR2(100);                  --CSVファイルの文字コード
    vc2Comment                  VARCHAR2(1024);                 --メッセージ用コメント作成作業領域
    vc2Aps                      VARCHAR2(28);                   --メッセージ用
    vc2ApsComment               VARCHAR2(1024);                 --メッセージ用コメント作成作業領域
    vc2WorkBuffer               VARCHAR2(1024);                 --作業用バッファ
    vc2CsvFilePath              VARCHAR2(1024);                 --品目別作業計画ファイルの格納ディレクトリ
    vc2CsvFile                  VARCHAR2(1024);                 --品目別作業計画ファイル名
    vc2NewFileName              VARCHAR2(1000) := '';           --ファイルリネーム用
    vc2ReadBuffer               VARCHAR2(2048);                 --読み込み用バッファ
    numMsglogCount              NUMBER := 0;                    -- メッセージログ数
    numCsvReadCount             NUMBER(10) := 0;                --CSV 読込件数
    numCsvInsertCount           NUMBER(10) := 0;                --CSV 登録件数
    numMstErrorCount            NUMBER(10) := 0;                --マスタエラー件数

    vc2WorkOdrTempCtlNo         VARCHAR2(100);                  --作業計画取込管理番号
    intIdx                      INTEGER;                        --項目切り出し用カウンタ
    UTL_FileHandle              UTL_FILE.FILE_TYPE;             --ファイルハンドル
    UTL_FileCsvHandle           UTL_FILE.FILE_TYPE;             --品目別作業計画ファイルハンドル

    TypColumnAry                TYP_COLUMN_ARRY;                --項目切り出し用バッファ
    blnRet                      BOOLEAN;                        --BOOLEAN型 返却値
    blnFile                     BOOLEAN;                        --BOOLEAN型 返却値
    intColumnMax                INTEGER;                        --カラム数確認用
    intColumnOvr                INTEGER;                        --カラム数確認用

    vc2CheckLength              VARCHAR2(2048);                 --文字桁数チェック用
    blnCsvDataCommit            BOOLEAN;                        --作業計画取込に登録したデータのコミット可否フラグ

    vc2ToChar                  VARCHAR2(100);                   --数値項目の文字列変換（数値桁数チェック用）
    vc2CheckNum                VARCHAR2(100);                   --小数点以下の数値切取（数値桁数チェック用）

    /*------------------------------------------------------------------------------
    ' 機能      : DBの文字コードの取得
    '
    ' 戻り値    : DBの文字コード
    '
    ' 引き数    :
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncGetDBCharSet RETURN VARCHAR2
    IS
        vc2Buffer           VARCHAR2(100);
    BEGIN
        SELECT VALUE  INTO  vc2Buffer
            FROM NLS_DATABASE_PARAMETERS
            WHERE PARAMETER = 'NLS_CHARACTERSET';

        RETURN vc2Buffer;
    END;

    /*------------------------------------------------------------------------------
    ' 機能      : ＣＳＶデータ（１行）から、指定の項目を切り出す
    '
    ' 戻り値    :切り出した、項目
    '
    ' 引き数    : ■共通（必須）
    '             pvc2Buffer        - (i)ＣＳＶデータ（１行）
    '             pintColumnNo      - (i)取得する項目（１）
    '             pvc2Delim         - (i)区切り文字
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncSplit(pvc2Buffer    VARCHAR2,
                         pintColumnNo  INTEGER,
                         pvc2Delim     VARCHAR2) RETURN VARCHAR2
    IS
        vc2SubFncBuffer VARCHAR2(32767);

    BEGIN

        IF pvc2Buffer    IS NULL  OR
           pintColumnNo  IS NULL  OR
           pvc2Delim     IS NULL  THEN
            RETURN NULL;
        END IF;

        IF pintColumnNo = 1 THEN
            vc2SubFncBuffer := SUBSTR(pvc2Buffer, 1, INSTR( pvc2Buffer || pvc2Delim, pvc2Delim, 1, 1 ) - 1);
        ELSE
            vc2SubFncBuffer := SUBSTR(pvc2Buffer, INSTR(pvc2Buffer, pvc2Delim, 1, pintColumnNo-1) + 1,
                                        INSTR(pvc2Buffer || pvc2Delim, pvc2Delim, 1, pintColumnNo) -
                                        INSTR(pvc2Buffer, pvc2Delim, 1, pintColumnNo-1) - 1);
        END IF;

        RETURN vc2SubFncBuffer;

    END;


    /*------------------------------------------------------------------------------
    ' 機能      : 「作業計画取込管理番号」を採番する
    '
    ' 戻り値    : 生成した「作業計画取込管理番号」
    '
    ' 引き数    :
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncGetWORK_ODR_TEMP_CTL_NO RETURN VARCHAR2
    IS
        numNumber           NUMBER(10);
        TypSEQ_VAL          T_WORK_ODR_TEMP.WORK_ODR_TEMP_CTL_NO%TYPE;
    BEGIN
        SELECT SEQ_WORK_ODR.NEXTVAL INTO numNumber FROM DUAL;

        TypSEQ_VAL := LPAD(TO_CHAR(numNumber), 10, '0');
        TypSEQ_VAL := 'WOR' || TypSEQ_VAL;

        RETURN TypSEQ_VAL;
    END;

    /*------------------------------------------------------------------------------
    ' 機能      : 数値項目のチェック
    '
    ' 戻り値    : TRUE:正常、FALSE:異常
    '
    ' 引き数    : ■共通（必須）
    '             pvc2Number            - (i)チェックする項目
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncCheckNumber(pvc2Number VARCHAR2) RETURN BOOLEAN
    IS
        numNumber           NUMBER;

    BEGIN
        IF pvc2Number IS NULL THEN
            RETURN FALSE;
        END IF;

        BEGIN
            numNumber := TO_NUMBER(pvc2Number);
        EXCEPTION
            WHEN OTHERS THEN
                RETURN FALSE;
        END;

        RETURN TRUE;
    END;

    /*------------------------------------------------------------------------------
    ' 機能      : 日付項目のチェック
    '
    ' 戻り値    : TRUE:正常、FALSE:異常
    '
    ' 引き数    : ■共通（必須）
    '             pvc2Date          - (i)チェックする項目
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncCheckDate(pvc2Date VARCHAR2) RETURN BOOLEAN
    IS
        dtmDate     DATE;
    BEGIN
        IF pvc2Date IS NULL THEN
            RETURN FALSE;
        END IF;

        BEGIN
            dtmDate := TO_DATE(pvc2Date, DATE_FORMAT);
        EXCEPTION
            WHEN OTHERS THEN
                RETURN FALSE;
        END;

        RETURN TRUE;
    END;

    /*------------------------------------------------------------------------------
    ' 機能      : 禁則文字のチェック
    '
    ' 戻り値    : TRUE:禁則文字なし、FALSE:禁則文字あり
    '
    ' 引き数    : ■共通（必須）
    '             pvc2Varchar2          - (i)チェックする項目
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncCheck_vc2(pvc2Varchar2 VARCHAR2) RETURN BOOLEAN
    IS
        numLength     NUMBER;               --チェック対象文字列数
        numCnt        NUMBER;               --チェック対象文字位置
        vc2Char       VARCHAR2(10);           --チェック対象１文字
        blnCheck      Boolean    :=TRUE;    --TRUE:禁則文字なし、FALSE:禁則文字あり

    BEGIN
        IF pvc2Varchar2 IS NULL THEN
            blnCheck :=FALSE; 
            RETURN blnCheck;
        END IF;
        
        BEGIN
            numCnt := 1;
            numLength := LENGTH(pvc2Varchar2);
            LOOP
              vc2Char := SUBSTR(pvc2Varchar2, numCnt, 1);
              IF vc2Char = '%' OR vc2Char = '_' OR vc2Char = '\' THEN
                   blnCheck :=FALSE;
                   EXIT;
              END IF;
              EXIT WHEN numCnt = numLength;
              numCnt := numCnt + 1;
            END LOOP;
        END;
        RETURN blnCheck;
    END;


/*━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
　━━━　　メイン処理　　━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
　━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━*/
BEGIN
    /*作業計画取込に登録したデータのコミット可否フラグ = TRUE */
    blnCsvDataCommit := TRUE;

    /* LogFile の OPEN */
    blnRet := FncLogOpen(pvc2OutputPath, pvc2OutputName, pvc2PlantCd, pvc2OutputMode, UTL_FileHandle);
    /* TraceLog の出力 */
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);
    /* 開始メッセージの出力 */
    msgLogData.DELETE;
    msgLogData(1).fncName:= MY_SQL_NAME;
    msgLogData(1).errCd  := APS_BATCH_START;

   IF pnumCsvTakeTyp = CSV_TAKE_TYP_DESINATED THEN
        msgLogData(1).errMsg := SUBSTR(LOGMSG_TAKE_FILENAME || SUBSTR(
                                                            REPLACE(pvc2CsvTakePath, PATH_SLASH, PATH_DELIM)
                                                          , INSTR(
                                                                REPLACE(pvc2CsvTakePath, PATH_SLASH, PATH_DELIM)
                                                              , PATH_DELIM , -1
                                                            ) + 1
                                                        )
                                , 1, 256);
    ELSE
        msgLogData(1).errMsg := LOGMSG_START_PGNM;
    END IF;



    /* 各カウンタをクリアする */
    numCsvReadCount     := 0;       --CSV 読込件数
    numCsvInsertCount   := 0;       --CSV 登録件数
    numMstErrorCount    := 0;       --マスタエラー件数

    vc2Aps          := NULL;
    vc2ApsComment   := NULL;
    vc2Comment      := NULL;
    blnFile         := true;

/*-----------------------------------------------------------------------------
' ＤＢの文字コードの取得
'
-----------------------------------------------------------------------------*/

    /* ＤＢの文字コード取得 */
    vc2DBCharSet := SubFncGetDBCharSet;


/*-----------------------------------------------------------------------------
' ＣＳＶパスの取得
'
-----------------------------------------------------------------------------*/

    IF pnumCsvTakeTyp = CSV_TAKE_TYP_FIX THEN

        BEGIN -- カーソルOPEN
            OPEN curSYS_PARAMETER(WK_IN_PROC_BY_ITEM_IF_CSV_PATH);
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment  := SUBSTR(' 1:OPEN curSYS_PARAMETER'    ||
                                      ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                      ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE excERR_SKIP;
        END;  -- カーソルOPEN

        BEGIN -- カーソルFETCH
            FETCH curSYS_PARAMETER INTO RtpSYS_PARAMETER;
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment  := SUBSTR(' 2:FETCH curSYS_PARAMETER'   ||
                                      ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                      ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE excERR_SKIP;
        END;  -- カーソルFETCH

        IF curSYS_PARAMETER%NOTFOUND THEN

            CLOSE curSYS_PARAMETER;

            -- 品目別作業計画ＣＳＶパスの取得に失敗しました
            vc2Aps        := APS_ERR_CSVFILEPATH;
                vc2ApsComment := SUBSTR('(SBM1646)'||LOGMSG_NAME   || '、' ||
                                                     LOGMSG_BRAKETS           ||
                                                               WK_IN_PROC_BY_ITEM_IF_CSV_PATH   ||
                                                               LOGMSG_BRAKETE,
                               1,256);
            RAISE excERR_SKIP;
        END IF;

        CLOSE curSYS_PARAMETER;

        vc2CsvFilePath := RtpSYS_PARAMETER.VALUE;

    ELSE
        vc2CsvFilePath := pvc2CsvTakePath;

    END IF;

    -- フルパスからファイル名の切り出し
    intIdx := 1;
    LOOP
        vc2WorkBuffer := SubFncSplit(vc2CsvFilePath, intIdx, PATH_DELIM);
        IF vc2WorkBuffer IS NULL THEN
            EXIT;
        END IF;

        vc2CsvFile := vc2WorkBuffer;
        intIdx := intIdx + 1;
    END LOOP;

    -- ファイル名部分の削除
    IF intIdx = 1 THEN
        vc2CsvFilePath := '';
    ELSE
        vc2CsvFilePath := SUBSTR(vc2CsvFilePath, 1, LENGTH(vc2CsvFilePath)
                                                  - LENGTH(vc2CsvFile)
                                                  - LENGTH(PATH_DELIM));
    END IF;

    /* CSVリネーム名作成 */
    vc2NewFileName := SUBSTR(vc2CsvFile,1,INSTR(vc2CsvFile,'.')-1) || TO_CHAR(SYSDATE,'YYYYMMDDHH24MISS') || '.csv';


/*-----------------------------------------------------------------------------
' ＣＳＶファイルの文字コードの取得
'
-----------------------------------------------------------------------------*/

    BEGIN -- カーソルOPEN
        OPEN curSYS_PARAMETER(CSV_CHAR_SET);
    EXCEPTION
        WHEN OTHERS THEN
            vc2Comment  := SUBSTR(' 3:OPEN curSYS_PARAMETER'    ||
                                  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
            RAISE excERR_SKIP;
    END;  -- カーソルOPEN

    BEGIN -- カーソルFETCH
        FETCH curSYS_PARAMETER INTO RtpSYS_PARAMETER;
    EXCEPTION
        WHEN OTHERS THEN
            vc2Comment  := SUBSTR(' 4:FETCH curSYS_PARAMETER'   ||
                                  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
            RAISE excERR_SKIP;
    END;  -- カーソルFETCH

    IF curSYS_PARAMETER%NOTFOUND THEN
        -- S-JIS
        vc2CsvCharSet := DEFAULT_CHAR_SET;
    ELSE
        -- 指定文字コード
        vc2CsvCharSet := RtpSYS_PARAMETER.VALUE;
    END IF;

    CLOSE curSYS_PARAMETER;


/*-----------------------------------------------------------------------------
' 品目別作業計画ファイルの取込処理
'

-----------------------------------------------------------------------------*/

    /* ファイルオープン */
    BEGIN
    UTL_FileCsvHandle := UTL_FILE.FOPEN(vc2CsvFilePath, vc2CsvFile, 'R', CSV_LINE_MAX);
    EXCEPTION
    WHEN OTHERS THEN
        -- ファイルの処理中にエラーが発生しました
        vc2Aps          := APS_ERR_CSVFILE;
        vc2ApsComment   := SUBSTR(LOGMSG_CSVFILE     || LOGMSG_BRAKETS
                                                     || vc2CsvFilePath || PATH_DELIM || vc2CsvFile
                                                     || LOGMSG_BRAKETE,
                        1,256);
        blnFile         := False;
        RAISE excERR_MAST;
    END;

    numMsglogCount := NVL(msgLogData.LAST, 0);


    /* ＣＳＶファイルより、[作業計画取込]に取込開始 */
    LOOP
        exit When  blnFile = False ;

        vc2Aps          := NULL;
        vc2ApsComment   := NULL;

        /* ＣＳＶファイルより、１行読み込み */
        BEGIN
            UTL_FILE.GET_LINE(UTL_FileCsvHandle, vc2ReadBuffer);
            vc2ReadBuffer := CONVERT(vc2ReadBuffer, vc2DBCharSet, vc2CsvCharSet);
        EXCEPTION
            -- CSVデータ終了
            WHEN NO_DATA_FOUND THEN
                EXIT;
            -- その他の例外
            WHEN OTHERS THEN
                -- ファイルの処理中にエラーが発生しました
                vc2Aps          := APS_ERR_CSVFILE;
                vc2ApsComment   := SUBSTR('(SBM0381)'||LOGMSG_LINECNT    || LOGMSG_BRAKETS
                                                            || TO_CHAR(numCsvReadCount + 1)
                                                            || LOGMSG_BRAKETE,
                                1,256);
                RAISE excERR_MAST;
        END;

        /* CSV 読込件数　カウントアップ */
        numCsvReadCount := numCsvReadCount + 1;


        BEGIN
            /* １行当りの項目数のチェック */
            intColumnMax := NVL(INSTR(vc2ReadBuffer, CSV_DELIM, 1, CSV_COLUMN_COUNT - 1), 0);
            intColumnOvr := NVL(INSTR(vc2ReadBuffer, CSV_DELIM, 1, CSV_COLUMN_COUNT),     0);
            IF intColumnMax <> 0 AND intColumnOvr = 0 THEN
                NULL;
            ELSE
                -- ＣＳＶファイルが不正なフォーマットです
                vc2Aps          := APS_ERR_CSV_DATA_FORMAT;
                vc2ApsComment   := SUBSTR('(SBM1674)' || LOGMSG_LINECNT    || LOGMSG_BRAKETS 
                                                            || TO_CHAR(numCsvReadCount)
                                                            || LOGMSG_BRAKETE
                                                            || LOGMSG_SPACER
                                                            || LOGMSG_CSV_ERR_COLUMN
                                                            || LOGMSG_BRAKETS
                                                            || LOGMSG_COLUMN_CNT
                                                            || LOGMSG_BRAKETE,
                                1,256);
                RAISE excCSV_CHECK_ERR;
            END IF;

            /* 項目の切り出し */
            FOR intIdx IN 1..CSV_COLUMN_COUNT LOOP
                TypColumnAry(intIdx) := SubFncSplit(vc2ReadBuffer, intIdx, CSV_DELIM);
            END LOOP;
          
            ---------------■CSV項目のチェックStart■------------------

            /* 必須項目チェック */
            IF TypColumnAry( 1) IS NULL THEN        -- 品目番号
                -- CSVファイルの必須項目に値が設定されていません。
                vc2Aps          := APS_ERR_REQUIRED;
               vc2ApsComment   := SUBSTR('(SBM1684)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                            || numCsvReadCount
                                                            || LOGMSG_BRAKETE
                                                            || LOGMSG_SPACER
                                                            || LOGMSG_CSV_ERR_COLUMN
                                                            || LOGMSG_BRAKETS
                                                            || COL_ITEM_CD
                                                            || LOGMSG_BRAKETE,
                                1,256);
                RAISE excCSV_CHECK_ERR;
            END IF;

            /* 必須項目チェック */
            IF TypColumnAry( 2) IS NULL THEN        -- 製造納期
                -- CSVファイルの必須項目に値が設定されていません。
                vc2Aps          := APS_ERR_REQUIRED;
               vc2ApsComment   := SUBSTR('(SBM1756)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                            || numCsvReadCount
                                                            || LOGMSG_BRAKETE
                                                            || LOGMSG_SPACER
                                                            || LOGMSG_CSV_ERR_COLUMN
                                                            || LOGMSG_BRAKETS
                                                            || COL_PRD_DUE_DATE
                                                            || LOGMSG_BRAKETE,
                                1,256);
                RAISE excCSV_CHECK_ERR;
            END IF;

            /* 必須項目チェック */
            IF TypColumnAry( 4) IS NULL THEN        -- 作業指示数
                -- CSVファイルの必須項目に値が設定されていません。
                vc2Aps          := APS_ERR_REQUIRED;
               vc2ApsComment   := SUBSTR('(SBM1757)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                            || numCsvReadCount
                                                            || LOGMSG_BRAKETE
                                                            || LOGMSG_SPACER
                                                            || LOGMSG_CSV_ERR_COLUMN
                                                            || LOGMSG_BRAKETS
                                                            || COL_OPR_INST_QTY
                                                            || LOGMSG_BRAKETE,
                                1,256);
                RAISE excCSV_CHECK_ERR;
            END IF;

            /*作業指示数 数値チェック*/
            IF SubFncCheckNumber(TypColumnAry(4)) THEN
                 NULL;
            ELSE
                    --ＣＳＶファイルで数値項目が不正なフォーマットです
                    vc2Aps          := APS_ERR_CSV_NUMBER_FORMAT;
                    vc2ApsComment   := SUBSTR('(SBM1757)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_OPR_INST_QTY
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                RAISE excCSV_CHECK_ERR;
            END IF;
 
            /*作業指示数 マイナスチェック*/
            IF TO_NUMBER(TypColumnAry(4)) < 0 THEN
                -- CSVファイルの数値項目にマイナス値が設定されています。
                vc2Aps          := APS_ERR_NUMBER_MINUS;
                vc2ApsComment   := SUBSTR('(SBM1757)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                             || numCsvReadCount
                                                             || LOGMSG_BRAKETE
                                                             || LOGMSG_SPACER
                                                             || LOGMSG_CSV_ERR_COLUMN
                                                             || LOGMSG_BRAKETS
                                                             || COL_OPR_INST_QTY
                                                             || LOGMSG_BRAKETE,
                                1,256);
                RAISE excCSV_CHECK_ERR;
            END IF;

            /* 製造納期　日付チェック */
            IF TypColumnAry(2) IS NOT NULL  THEN
                IF SubFncCheckDate(TypColumnAry(2)) THEN
                    NULL;
                ELSE
                    --ＣＳＶファイルで日付項目が不正なフォーマットです
                    vc2Aps          := APS_ERR_CSV_DATE_FORMAT;
                    vc2ApsComment   := SUBSTR('(SBM1756)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_PRD_DUE_DATE
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /* 製造着手日　日付チェック */
            IF TypColumnAry(3) IS NOT NULL  THEN
                IF SubFncCheckDate(TypColumnAry(3)) THEN
                    NULL;
                ELSE
                    --ＣＳＶファイルで日付項目が不正なフォーマットです
                    vc2Aps          := APS_ERR_CSV_DATE_FORMAT;
                    vc2ApsComment   := SUBSTR('(SBM1758)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_PRD_START_DATE
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*品目番号　文字桁数チェック　26文字以上はエラー*/
            vc2CheckLength := LENGTH(TypColumnAry(1)) ;
            IF TypColumnAry(1) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_25 THEN
                    -- 桁数以内で設定してください。
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1684)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_ITEM_CD
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                RAISE excCSV_CHECK_ERR;
                END IF;
             END IF;

            /*作業区コード　文字桁数チェック　26文字以上はエラー*/
            vc2CheckLength := LENGTH(TypColumnAry(5)) ;
            IF TypColumnAry(5) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_25 THEN
                    -- 桁数以内で設定してください。
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1719)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_WS_CD
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
             END IF;

            /*製番　文字桁数チェック　26文字以上はエラー*/
            vc2CheckLength := LENGTH(TypColumnAry(6)) ;
            IF TypColumnAry(6) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_25 THEN
                    -- 桁数以内で設定してください。
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1697)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_JOB_ODR_CD
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
             END IF;

            /*備考　文字桁数チェック　81文字以上はエラー*/
            vc2CheckLength := LENGTH(TypColumnAry(7)) ;
            IF TypColumnAry(7) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_80 THEN
                    -- 桁数以内で設定してください。
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1721)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_WK_IN_PROC_BY_ITEM_COMMENT
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
             END IF;

            /*品目番号 禁則文字チェック 「%」、「_」、「\」が含まれている場合はエラー*/
            IF TypColumnAry(1) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(1)) THEN
                    NULL;
                ELSE
                    --禁則文字（「%」、「_」、「\」）が含まれています。
                    vc2Aps          := APS_ERR_CSV_DATA_ILLEGAL;
                    vc2ApsComment   := SUBSTR('(SBM1684)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_ITEM_CD
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*作業区 禁則文字チェック 「%」、「_」、「\」が含まれている場合はエラー*/
            IF TypColumnAry(5) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(5)) THEN
                    NULL;
                ELSE
                    --禁則文字（「%」、「_」、「\」）が含まれています。
                    vc2Aps          := APS_ERR_CSV_DATA_ILLEGAL;
                    vc2ApsComment   := SUBSTR('(SBM1719)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_WS_CD
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*製番 禁則文字チェック 「%」、「_」、「\」が含まれている場合はエラー*/
            IF TypColumnAry(6) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(6)) THEN
                    NULL;
                ELSE
                    --禁則文字（「%」、「_」、「\」）が含まれています。
                    vc2Aps          := APS_ERR_CSV_DATA_ILLEGAL;
                    vc2ApsComment   := SUBSTR('(SBM1697)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_JOB_ODR_CD
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*備考 禁則文字チェック 「%」、「_」、「\」が含まれている場合はエラー*/
            IF TypColumnAry(7) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(7)) THEN
                    NULL;
                ELSE
                    --禁則文字（「%」、「_」、「\」）が含まれています。
                    vc2Aps          := APS_ERR_CSV_DATA_ILLEGAL;
                    vc2ApsComment   := SUBSTR('(SBM1721)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_WK_IN_PROC_BY_ITEM_COMMENT
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*作業指示数  桁数チェック 整数が 15桁以上、または小数点以下5桁以上の場合エラー */
            vc2ToChar      :=0;
            vc2CheckNum    :=0;
            vc2CheckLength :=0;
            IF TypColumnAry(4) IS NOT NULL  THEN
                IF MOD(TypColumnAry(4),1) > 0 THEN
                   vc2ToChar :=TO_CHAR(TypColumnAry(4));
                   vc2CheckNum := SUBSTR(vc2ToChar,INSTR(vc2ToChar,'.')+1);
                   vc2CheckLength := LENGTH(vc2CheckNum) ;
                ELSE
                   vc2CheckLength :=0;
                END IF;

                IF TypColumnAry(4) < NUMBER_100000000000000 AND
                   vc2CheckLength  < LENGTH_5 THEN
                   NULL;

                ELSE
                    -- 桁数以内で設定してください。
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1757)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_OPR_INST_QTY
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;




            ---------------■CSV項目のチェックEnd■------------------


            /*作業計画取込管理番号の採番*/
            vc2WorkOdrTempCtlNo :=  SubFncGetWORK_ODR_TEMP_CTL_NO;
                 /* [作業計画取込]　登録処理 */
            INSERT INTO T_WORK_ODR_TEMP(

                WORK_ODR_TEMP_CTL_NO             --作業計画取込管理番号
              , ITEM_CD                          --品目番号
              , PRD_DUE_DATE                     --製造納期
              , PRD_START_DATE                   --製造着手日
              , OPR_INST_QTY                     --作業指示数
              , WS_CD                            --作業区コード
              , JOB_ODR_CD                       --製番
              , WK_IN_PROC_BY_ITEM_COMMENT       --備考
                )VALUES(
               vc2WorkOdrTempCtlNo               --作業計画取込管理番号
              , TypColumnAry(1)                  --品目番号
              , TypColumnAry(2)                  --製造納期
              , TypColumnAry(3)                  --製造着手日
              , TypColumnAry(4)                  --作業指示数
              , TypColumnAry(5)                  --作業区コード
              , TypColumnAry(6)                  --製番
              , TypColumnAry(7)                  --備考
                );

                numCsvInsertCount := numCsvInsertCount + 1 ;

        EXCEPTION
            -- CSVデータのチェックエラー
            WHEN excCSV_CHECK_ERR THEN
                -- メッセージを出力して、次の行へ
                numMsglogCount := numMsglogCount + 1;
				msgLogData(numMsglogCount).fncName:= MY_SQL_NAME;
				msgLogData(numMsglogCount).errCd  := vc2Aps;
				msgLogData(numMsglogCount).errMsg := vc2ApsComment;

                blnCsvDataCommit :=false;
                
        END;
    END LOOP;

/*-----------------------------------------------------------------------------
' 正常終了処理
'
-----------------------------------------------------------------------------*/
    /*１件でもエラーデータが存在する場合はROLLBACK*/
    IF blnCsvDataCommit = FALSE THEN
        ROLLBACK;
    END IF;

    IF UTL_FILE.IS_OPEN(UTL_FileCsvHandle) = TRUE THEN
      /* ＣＳＶファイルクローズ */
      UTL_FILE.FCLOSE(UTL_FileCsvHandle);
    END IF;
    vc2Aps          := NULL;
    vc2ApsComment   := NULL;

    -- CSVファイル処理を行った場合CSV処理情報を業務ログに出力する
    IF blnCsvDataCommit = TRUE AND numCsvReadCount > 0 THEN
        /* 品目別作業計画取込 CSV処理件数表示 */
        -- 詳細メッセージの編集
        vc2Comment  := SUBSTR('(SBM1650)'||
                       '入力件数='               ||  LOGMSG_BRAKETS  ||  TO_CHAR(numCsvReadCount)    || LOGMSG_BRAKETE   || '、' ||
                       '登録件数='               ||  LOGMSG_BRAKETS  ||  TO_CHAR(numCsvInsertCount)  || LOGMSG_BRAKETE,
                       1,256);

        
        numMsglogCount := numMsglogCount + 1;
        msgLogData(numMsglogCount).fncName:= MY_SQL_NAME;
        msgLogData(numMsglogCount).errCd  := APS_DATA_PROCESSING;
        msgLogData(numMsglogCount).errMsg := vc2Comment;
        vc2Comment := NULL;
    END IF;

    /* 終了メッセージの出力 */
    numMsglogCount := NVL(msgLogData.LAST, 0);
    numMsglogCount := numMsglogCount + 1;
    msgLogData(numMsglogCount).fncName:= MY_SQL_NAME;
    msgLogData(numMsglogCount).errCd  := APS_BATCH_END;
    IF pnumCsvTakeTyp = CSV_TAKE_TYP_DESINATED THEN
        msgLogData(numMsglogCount).errMsg := SUBSTR(LOGMSG_TAKE_FILENAME || vc2CsvFile, 1, 256);
    ELSE
        msgLogData(numMsglogCount).errMsg := LOGMSG_END_PGNM;
    END IF;

    FOR i in 1 .. msgLogData.COUNT LOOP
	    IF msgLogData.EXISTS(i) THEN
	        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
	                  pvc2PlantCd, msgLogData(i).fncName, msgLogData(i).errCd, msgLogData(i).errMsg);
	    END IF;
    END LOOP;
    msgLogData.DELETE;

    /* トレースログの出力(終了) */
    blnRet      := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                               pvc2UserId,pvc2BusinessName,
                               pvc2PlantCd, MY_SQL_NAME, LOGMSG_END);

    COMMIT;

    /* LogFile の CLOSE */
    blnRet          := FNCLOGCLOSE(UTL_FileHandle);

    /* 取込CSVファイルのリネーム */
    /* CSV取込方式により、正常終了時のファイルの取り扱いを分岐 */
    IF pnumCsvTakeTyp = CSV_TAKE_TYP_FIX THEN
       /* CSV取込方式=1：固定ファイル取込の場合、取込CSVファイルのリネームのみ */
       UTL_FILE.FRENAME(vc2CsvFilePath,vc2CsvFile,vc2CsvFilePath,vc2NewFileName);
    ELSIF pnumCsvTakeTyp = CSV_TAKE_TYP_DESINATED THEN
       /* CSV取込方式=2：指定ファイル取込の場合、取込CSVファイルのリネーム+バックアップフォルダへ移動 */
       UTL_FILE.FRENAME(vc2CsvFilePath,vc2CsvFile,pvc2CsvBackupPath,vc2NewFileName);
    END IF;

    pnumReturn := STATUS_NORMAL; --正常終了


/*-----------------------------------------------------------------------------
' 例外終了処理
'
-----------------------------------------------------------------------------*/
EXCEPTION
    -- 実行不可
    WHEN excERR_SKIP THEN

        /* CSV File の CLOSE */
        IF UTL_FILE.IS_OPEN(UTL_FileCsvHandle) = TRUE THEN
            UTL_FILE.FCLOSE(UTL_FileCsvHandle);
        END IF;

        /* 取込CSVファイルのリネーム */
        /* CSV取込方式により、例外終了時のファイルの取り扱いを分岐 */
        IF pnumCsvTakeTyp = CSV_TAKE_TYP_FIX THEN
            /* CSV取込方式=1：固定ファイル取込の場合、取込CSVファイルのリネームのみ */
            UTL_FILE.FRENAME(vc2CsvFilePath,vc2CsvFile,vc2CsvFilePath,vc2NewFileName);
        ELSIF pnumCsvTakeTyp = CSV_TAKE_TYP_DESINATED THEN
            /* CSV取込方式=2：指定ファイル取込の場合、取込CSVファイルのリネーム+バックアップフォルダへ移動 */
            UTL_FILE.FRENAME(vc2CsvFilePath,vc2CsvFile,pvc2CsvBackupPath,vc2NewFileName);
        END IF;

        /* 終了メッセージの出力 */
        IF vc2Aps IS NOT NULL THEN
            numMsglogCount := NVL(msgLogData.LAST, 0);
            numMsglogCount := numMsglogCount + 1;
            msgLogData(numMsglogCount).fncName:= MY_SQL_NAME;
            msgLogData(numMsglogCount).errCd  := vc2Aps;
            msgLogData(numMsglogCount).errMsg := vc2ApsComment;
        END IF;

        /* 終了メッセージの出力 */
        IF vc2Comment IS NULL THEN
            vc2Comment  := SUBSTR('PGNAME='         || LOGMSG_BRAKETS || MY_SQL_NAME    || LOGMSG_BRAKETE ||
                                  ' SQLCODE='       || LOGMSG_BRAKETS || SQLCODE        || LOGMSG_BRAKETE ||
                                  ' SQLERRM='       || LOGMSG_BRAKETS || SQLERRM        || LOGMSG_BRAKETE,
                            1,256);
        END IF;

        numMsglogCount := NVL(msgLogData.LAST, 0);
        numMsglogCount := numMsglogCount + 1;
        msgLogData(numMsglogCount).fncName:= MY_SQL_NAME;
        msgLogData(numMsglogCount).errCd  := APS_BATCH_EXC;
        IF pnumCsvTakeTyp = CSV_TAKE_TYP_DESINATED THEN
            msgLogData(numMsglogCount).errMsg := SUBSTR(LOGMSG_TAKE_FILENAME || vc2CsvFile || vc2Comment, 1, 256);
        ELSE
            msgLogData(numMsglogCount).errMsg := vc2Comment;
        END IF;

        FOR i in 1 .. msgLogData.COUNT LOOP
            IF msgLogData.EXISTS(i) THEN
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, msgLogData(i).fncName, msgLogData(i).errCd, msgLogData(i).errMsg);
            END IF;
        END LOOP;

        /* トレースログの出力(終了) */
        blnRet      := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                   pvc2UserId,pvc2BusinessName,
                                   pvc2PlantCd, MY_SQL_NAME, LOGMSG_END);

        COMMIT;

        /* LogFile の CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

        pnumReturn := STATUS_ERROR; /* 異常終了 */


    -- カーソルOPEN中のEXCEPTION
    WHEN excERR_MAST THEN

        IF blnFile = TRUE THEN
            /* CSV File の CLOSE */
            IF UTL_FILE.IS_OPEN(UTL_FileCsvHandle) = TRUE THEN
              UTL_FILE.FCLOSE(UTL_FileCsvHandle);
            END IF;

            /* 取込CSVファイルのリネーム */
            /* CSV取込方式により、例外終了時のファイルの取り扱いを分岐 */
            IF pnumCsvTakeTyp = CSV_TAKE_TYP_FIX THEN
                /* CSV取込方式=1：固定ファイル取込の場合、取込CSVファイルのリネームのみ */
                UTL_FILE.FRENAME(vc2CsvFilePath,vc2CsvFile,vc2CsvFilePath,vc2NewFileName);
            ELSIF pnumCsvTakeTyp = CSV_TAKE_TYP_DESINATED THEN
                /* CSV取込方式=2：指定ファイル取込の場合、取込CSVファイルのリネーム+バックアップフォルダへ移動 */
                UTL_FILE.FRENAME(vc2CsvFilePath,vc2CsvFile,pvc2CsvBackupPath,vc2NewFileName);
            END IF;
        END IF;

        -- カーソルのクローズ処理
        IF curSYS_PARAMETER%ISOPEN = TRUE THEN
            CLOSE curSYS_PARAMETER;           --【パラメータ】
        END IF;

        ROLLBACK;

        /* 終了メッセージの出力 */
        IF vc2Aps IS NOT NULL THEN
            numMsglogCount := NVL(msgLogData.LAST, 0);
            numMsglogCount := numMsglogCount + 1;
            msgLogData(numMsglogCount).fncName:= MY_SQL_NAME;
            msgLogData(numMsglogCount).errCd  := vc2Aps;
            msgLogData(numMsglogCount).errMsg := vc2ApsComment;
        END IF;

        /* 終了メッセージの出力 */
        IF vc2Comment IS NULL THEN
            vc2Comment  := LOGMSG_END_PGNM;
        END IF;
        numMsglogCount := NVL(msgLogData.LAST, 0);
        numMsglogCount := numMsglogCount + 1;
        msgLogData(numMsglogCount).fncName:= MY_SQL_NAME;
        msgLogData(numMsglogCount).errCd  := APS_BATCH_EXC;
        IF pnumCsvTakeTyp = CSV_TAKE_TYP_DESINATED THEN
            msgLogData(numMsglogCount).errMsg := SUBSTR(LOGMSG_TAKE_FILENAME || vc2CsvFile || vc2Comment, 1, 256);
        ELSE
            msgLogData(numMsglogCount).errMsg := vc2Comment;
        END IF;

        FOR i in 1 .. msgLogData.COUNT LOOP
            IF msgLogData.EXISTS(i) THEN
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, msgLogData(i).fncName, msgLogData(i).errCd, msgLogData(i).errMsg);
            END IF;
        END LOOP;

        /* トレースログの出力(終了) */
        blnRet      := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                   pvc2UserId,pvc2BusinessName,
                                   pvc2PlantCd, MY_SQL_NAME, LOGMSG_END);

        COMMIT;

        /* LogFile の CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

        /* CSV File の CLOSE */
        IF UTL_FILE.IS_OPEN(UTL_FileCsvHandle) = TRUE THEN
            UTL_FILE.FCLOSE(UTL_FileCsvHandle);
        END IF;

        pnumReturn := STATUS_ERROR; /* 異常終了 */

    -- その他の例外
    WHEN OTHERS THEN
        /* CSV File の CLOSE */
        IF UTL_FILE.IS_OPEN(UTL_FileCsvHandle) = TRUE THEN
          UTL_FILE.FCLOSE(UTL_FileCsvHandle);
        END IF;

        /* 取込CSVファイルのリネーム */
        /* CSV取込方式により、例外終了時のファイルの取り扱いを分岐 */
        IF pnumCsvTakeTyp = CSV_TAKE_TYP_FIX THEN
            /* CSV取込方式=1：固定ファイル取込の場合、取込CSVファイルのリネームのみ */
            UTL_FILE.FRENAME(vc2CsvFilePath,vc2CsvFile,vc2CsvFilePath,vc2NewFileName);
        ELSIF pnumCsvTakeTyp = CSV_TAKE_TYP_DESINATED THEN
            /* CSV取込方式=2：指定ファイル取込の場合、取込CSVファイルのリネーム+バックアップフォルダへ移動 */
            UTL_FILE.FRENAME(vc2CsvFilePath,vc2CsvFile,pvc2CsvBackupPath,vc2NewFileName);
        END IF;

        -- カーソルのクローズ処理
        IF curSYS_PARAMETER%ISOPEN = TRUE THEN
            CLOSE curSYS_PARAMETER;           --【パラメータ】
        END IF;

        ROLLBACK;

        /* 終了メッセージの出力 */
        vc2Comment  := SUBSTR('PGNAME='     || LOGMSG_BRAKETS || MY_SQL_NAME    || LOGMSG_BRAKETE ||
                              ' SQLCODE='   || LOGMSG_BRAKETS || SQLCODE        || LOGMSG_BRAKETE ||
                              ' SQLERRM='   || LOGMSG_BRAKETS || SQLERRM        || LOGMSG_BRAKETE,
                        1,256);
        numMsglogCount := NVL(msgLogData.LAST, 0);
        numMsglogCount := numMsglogCount + 1;
        msgLogData(numMsglogCount).fncName:= MY_SQL_NAME;
        msgLogData(numMsglogCount).errCd  := APS_BATCH_EXC;
        IF pnumCsvTakeTyp = CSV_TAKE_TYP_DESINATED THEN
            msgLogData(numMsglogCount).errMsg := SUBSTR(LOGMSG_TAKE_FILENAME || vc2CsvFile || vc2Comment, 1, 256);
        ELSE
            msgLogData(numMsglogCount).errMsg := vc2Comment;
        END IF;

        FOR i in 1 .. msgLogData.COUNT LOOP
            IF msgLogData.EXISTS(i) THEN
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, msgLogData(i).fncName, msgLogData(i).errCd, msgLogData(i).errMsg);
            END IF;
        END LOOP;

        COMMIT;

        /* LogFile の CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

        /* CSV File の CLOSE */
        IF UTL_FILE.IS_OPEN(UTL_FileCsvHandle) = TRUE THEN
            UTL_FILE.FCLOSE(UTL_FileCsvHandle);
        END IF;

        pnumReturn := STATUS_ERROR; /* 異常終了 */


END;
/
