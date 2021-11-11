CREATE OR REPLACE PROCEDURE SQLACPTRSLTINTERFACE(
/*------------------------------------------------------------------------------
'
'$Author: zhangran $
'$Revision: 1.3 $
'
' 機能      :受入実績CSV取込処理
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
' 機能説明  : 受入実績CSVファイルを読み込み、[受入実績取込]を作成します。
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

    --【業務運用日】
    CURSOR curBUSINESS_OPR_DATE(
        c_PLANT_CD      VARCHAR2
    ) IS
    SELECT  BUSINESS_OPR_DATE
    FROM    SYS_DATE_CTRL
    WHERE   PLANT_CD = c_PLANT_CD;


/* ROWTYPE の宣言 */
    RtpSYS_PARAMETER                curSYS_PARAMETER%ROWTYPE;       -- 【パラメータ】
    RtpBUSINESS_OPR_DATE            curBUSINESS_OPR_DATE%ROWTYPE;   -- 【業務運用日】

/* 定数の宣言 */

    MY_SQL_NAME                         VARCHAR2(84)    := 'SQLACPTRSLTINTERFACE';             
    STATUS_NORMAL                       NUMBER(1)       := 1;                                  --正常終了
    STATUS_WARNING                      NUMBER(1)       := 2;                                  --警告終了
    STATUS_ERROR                        NUMBER(1)       := 3;                                  --異常終了
    DATE_FORMAT                         VARCHAR2(72)    := 'YYYY/MM/DD HH24:MI';               -- 日付変換時のフォーマット
    PATH_SLASH                          VARCHAR2(4)     := '/';                                --ファイルパス区切り文字
    PATH_DELIM                          VARCHAR2(4)     := '\';                                --ファイルパス区切り文字

    DEFAULT_CHAR_SET                    VARCHAR2(32)    := 'JA16SJIS';                         -- S-JIS
    ACPT_RSLT_IF_CSV_PATH               VARCHAR2(88)    := 'ACPT_RSLT_IF_CSV_PATH';            -- [パラメータ].名前
    CSV_CHAR_SET                        VARCHAR2(64)    := 'CSV_CHARACTERSET';                 -- [パラメータ].名前
    CSV_TAKE_TYP_FIX                    NUMBER(1)       := 1;                                  -- 1：固定ファイル取込
    CSV_TAKE_TYP_DESINATED              NUMBER(1)       := 2;                                  -- 2：指定ファイル取込
    CSV_LINE_MAX                        INTEGER         := 2048;                               --ＣＳＶファイル１行当りの最大数
    CSV_COLUMN_COUNT                    INTEGER         := 17;                                 --ＣＳＶファイル１行当りの項目数
    CSV_DELIM                           VARCHAR2(4)     := ',';                                --ＣＳＶ項目の区切り文字
    LENGTH_25                           NUMBER(2)       := 25;                                 --文字数:=25
    LENGTH_80                           NUMBER(2)       := 80;                                 --文字数:=80
    LENGTH_5                            NUMBER(1)       :=5;                                   --文字数 :=5
    NUMBER_100000000000000              NUMBER(15)      :=100000000000000;                     --数値桁数:15桁
    NUMBER_0                            NUMBER(1)       :=0;                                   --数値:=0


/* EXCEPTION の宣言 */
    excERR_SKIP                         EXCEPTION;      --実行不可
    excERR_MAST                         EXCEPTION;      --カーソルOPEN中のEXCEPTION
    excCSV_CHECK_ERR                    EXCEPTION;      --CSVデータのチェックエラー

/* MESSAGE の宣言 */
    APS_ERR_CSVFILEPATH                 VARCHAR2(28)    := 'AE60003';   --受入実績ＣＳＶパスの取得に失敗しました。
    APS_ERR_CSVFILE                     VARCHAR2(28)    := 'AD60005';   --ファイルの処理中にエラーが発生しました。
    APS_BATCH_START                     VARCHAR2(28)    := 'AE60002';   --受入実績CSV取込処理を開始しました。
    APS_BATCH_END                       VARCHAR2(28)    := 'AE60004';   --受入実績CSV取込処理を終了しました。
    APS_ERR_BUSINESS_DATE               VARCHAR2(28)    := 'AD60044';   --業務日付の取得に失敗しました。
    APS_BATCH_EXC                       VARCHAR2(28)    := 'AE60005';   --受入実績CSV取込処理が異常終了しました。
    APS_ERR_CSV_DATA_FORMAT             VARCHAR2(28)    := 'AD60006';   --CSVファイルが不正なフォーマットです。
    APS_DATA_PROCESSING                 VARCHAR2(28)    := 'AD60014';   --処理件数
    APS_ERR_REQUIRED                    VARCHAR2(28)    := 'AD60009';   --CSVファイルの必須項目に値が設定されていません。
    APS_ERR_CSV_DATA_DIGIT              VARCHAR2(28)    := 'AA01501';   --桁数以内で設定してください。
    APS_ERR_CSV_DATA_ILLEGAL            VARCHAR2(28)    := 'AA01524';   --禁則文字（「%」、「_」、「\」）が含まれています。
    APS_ERR_CSV_NUMBER_FORMAT           VARCHAR2(28)    := 'AD60007';   --CSVファイルで数値項目が不正なフォーマットです。
    APS_ERR_CSV_DATE_FORMAT             VARCHAR2(28)    := 'AD60008';   --CSVファイルで日付項目が不正なフォーマットです。
    APS_ERR_UNIT_COST_TYP               VARCHAR2(28)    := 'CF00012';   --単価区分が不正です。
    APS_ERR_CSV_ZERO                    VARCHAR2(28)    := 'AE00059';   --為替レートには、0より大きい数値を入力してください。
    APS_ERR_LOT_NO                      VARCHAR2(28)    := 'AE20617';   --受入数が０のため、在庫ロット番号を入力できません。
    APS_ERR_ACPT_RSLT_COMP1             VARCHAR2(28)    := 'AE00191';   --受入完了フラグが不正です。
    APS_ERR_ACPT_RSLT_COMP2             VARCHAR2(28)    := 'AE05012';   --受入数が未入力です。
    APS_ERR_ACPT_RSLT_COMP3             VARCHAR2(28)    := 'AE00196';   --受入完了フラグが0完了ですが、受入数が登録されています。



/* LOG の宣言 */
    LOGMSG_NAME                         VARCHAR2(52)    := '名前=';
    LOGMSG_START                        VARCHAR2(20)    := 'Start';
    LOGMSG_END                          VARCHAR2(12)    := 'End';
    LOGMSG_BRAKETS                      VARCHAR2(4)     := '[';
    LOGMSG_BRAKETE                      VARCHAR2(4)     := ']';
    LOGMSG_SPACER                       VARCHAR2(4)     := ' ';
    LOGMSG_COLUMN_CNT                   VARCHAR2(36)    := 'CSV項目数';
    LOGMSG_CSV_ERR_COLUMN               VARCHAR2(88)    := 'エラー項目名=';
    LOGMSG_PLANT_CD                     VARCHAR2(44)    := '工場コード=';
    LOGMSG_TAKE_FILENAME                VARCHAR2(400)   := '(SBM1328)取込ファイル名：';
    LOGMSG_START_PGNM                   VARCHAR2(400)   := '(SBM1335)受入実績CSV取込処理を開始しました。';
    LOGMSG_END_PGNM                     VARCHAR2(152)   := '(SBM1336)受入実績CSV取込処理を終了しました。';
    LOGMSG_CSVFILE                      VARCHAR2(400)   := '(SBM1337)受入実績ファイル名=';
    LOGMSG_LINECNT                      VARCHAR2(400)   := 'CSV行番号=';
    COL_PUCH_ODR_CD                     VARCHAR2(200)   := '発注番号';
    COL_ITEM_CD                         VARCHAR2(200)   := '品目番号';
    COL_WH_CD                           VARCHAR2(200)   := '受入場所';
    COL_ACPT_DATE                       VARCHAR2(200)   := '受入日';
    COL_ACPT_QTY                        VARCHAR2(200)   := '受入数';
    COL_UNIT_COST_TYP                   VARCHAR2(200)   := '単価区分';
    COL_UNIT_COST                       VARCHAR2(200)   := '単価';
    COL_PROCESSING_COST                 VARCHAR2(200)   := '加工費';
    COL_MATERIAL_COST                   VARCHAR2(200)   := '材料費';
    COL_OTHER_OVERHEADS                 VARCHAR2(200)   := 'その他経費';
    COL_DISC_AMOUNT                     VARCHAR2(200)   := '値引金額';
    COL_EXCH_RATE                       VARCHAR2(200)   := '為替レート';
    COL_LOT_NO                          VARCHAR2(200)   := '在庫ロット番号';
    COL_VEND_LOT_NO                     VARCHAR2(200)   := 'メーカロット番号';
    COL_DLV_CD                          VARCHAR2(200)   := '納品書番号';
    COL_ACPT_RSLT_COMMENT               VARCHAR2(200)   := '受入実績備考';
    COL_ACPT_RSLT_COMP                  VARCHAR2(200)   := '受入完了フラグ';

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
    vc2CsvFilePath              VARCHAR2(1024);                 --受入実績CSVファイルの格納ディレクトリ
    vc2CsvFile                  VARCHAR2(1024);                 --受入実績CSVファイル名
    vc2NewFileName              VARCHAR2(1000) := '';           --ファイルリネーム用
    intIdx                      INTEGER;                        --項目切り出し用カウンタ
    vc2WorkBuffer               VARCHAR2(1024);                 --作業用バッファ
    intColumnMax                INTEGER;                        --カラム数確認用
    intColumnOvr                INTEGER;                        --カラム数確認用
    blnCsvDataCommit            BOOLEAN;                        --受入実績取込に登録したデータのコミット可否フラグ
    vc2ReadBuffer               VARCHAR2(2048);                 --読み込み用バッファ
    numMsglogCount              NUMBER := 0;                    -- メッセージログ数
    numCsvReadCount             NUMBER(10) := 0;                --CSV 読込件数
    numCsvInsertCount           NUMBER(10) := 0;                --CSV 登録件数
    numMstErrorCount            NUMBER(10) := 0;                --マスタエラー件数
    blnFile                     BOOLEAN;                        --BOOLEAN型 返却値
    blnRet                      BOOLEAN;                        --BOOLEAN型 返却値
    UTL_FileHandle              UTL_FILE.FILE_TYPE;             --ファイルハンドル
    UTL_FileCsvHandle           UTL_FILE.FILE_TYPE;             --受入実績CSVファイルハンドル
    vc2AcptRsltTempCtlNo        VARCHAR2(100);                  --受入実績取込管理番号
    dtmBusinessOprDate          DATE;                           --業務運用日付
    TypColumnAry                TYP_COLUMN_ARRY;                --項目切り出し用バッファ
    vc2CheckLength              VARCHAR2(2048);                 --文字桁数チェック用
    vc2ToChar                   VARCHAR2(100);                  --数値項目の文字列変換（数値桁数チェック用）
    vc2CheckNum                 VARCHAR2(100);                  --小数点以下の数値切取（数値桁数チェック用）


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
    ' 機能      : 「受入実績取込管理番号」を採番する
    '
    ' 戻り値    : 生成した「受入実績取込管理番号」
    '
    ' 引き数    :
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncGetACPT_RSLT_TEMP_CTL_NO RETURN VARCHAR2
    IS
        numNumber           NUMBER(10);
        TypSEQ_VAL          T_ACPT_RSLT_TEMP.ACPT_RSLT_TEMP_CTL_NO%TYPE;
    BEGIN
        SELECT SEQ_ART.NEXTVAL INTO numNumber FROM DUAL;

        TypSEQ_VAL := LPAD(TO_CHAR(numNumber), 10, '0');
        TypSEQ_VAL := 'ART' || TypSEQ_VAL;

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
    /*受入実績取込に登録したデータのコミット可否フラグ = TRUE */
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
            OPEN curSYS_PARAMETER(ACPT_RSLT_IF_CSV_PATH);
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

            -- 受入実績ＣＳＶパスの取得に失敗しました★★
            vc2Aps        := APS_ERR_CSVFILEPATH;
                vc2ApsComment := SUBSTR('(SBM1646)'||LOGMSG_NAME   || '、' ||
                                                     LOGMSG_BRAKETS        ||
                                                     ACPT_RSLT_IF_CSV_PATH ||
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
' 業務運用日の取得
'
-----------------------------------------------------------------------------*/

    BEGIN -- カーソルOPEN
        OPEN curBUSINESS_OPR_DATE(pvc2PlantCd);
    EXCEPTION
        WHEN OTHERS THEN
            vc2Comment  := SUBSTR(' 5:OPEN curBUSINESS_OPR_DATE'         ||
                                  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
            RAISE excERR_SKIP;
    END;  -- カーソルOPEN

    BEGIN -- カーソルFETCH
        FETCH curBUSINESS_OPR_DATE INTO RtpBUSINESS_OPR_DATE;
    EXCEPTION
        WHEN OTHERS THEN
            vc2Comment  := SUBSTR(' 6:FETCH curBUSINESS_OPR_DATE'        ||
                                  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
            RAISE excERR_SKIP;
    END;  -- カーソルFETCH

    IF curBUSINESS_OPR_DATE%NOTFOUND THEN

        CLOSE curBUSINESS_OPR_DATE;

        -- 業務日付の取得に失敗しました
        vc2Aps        := APS_ERR_BUSINESS_DATE;
        vc2ApsComment := SUBSTR('(SBM0399)'||LOGMSG_PLANT_CD  ||  LOGMSG_BRAKETS       ||
                                                                  pvc2PlantCd          ||
                                                                  LOGMSG_BRAKETE,
                            1,256);
        RAISE excERR_SKIP;
    END IF;

    CLOSE curBUSINESS_OPR_DATE;
    dtmBusinessOprDate := RtpBUSINESS_OPR_DATE.BUSINESS_OPR_DATE;

/*-----------------------------------------------------------------------------
' 受入実績ファイルの取込処理
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

    /* ＣＳＶファイルより、[受入実績取込]に取込開始 */
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
            IF TypColumnAry( 1) IS NULL THEN        -- 作業指示番号
                -- CSVファイルの必須項目に値が設定されていません。
                vc2Aps          := APS_ERR_REQUIRED;
               vc2ApsComment   := SUBSTR('(SBM1675)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                            || numCsvReadCount
                                                            || LOGMSG_BRAKETE
                                                            || LOGMSG_SPACER
                                                            || LOGMSG_CSV_ERR_COLUMN
                                                            || LOGMSG_BRAKETS
                                                            || COL_PUCH_ODR_CD
                                                            || LOGMSG_BRAKETE,
                                1,256);
                RAISE excCSV_CHECK_ERR;
            END IF;

            /*数値チェック*/
            IF TypColumnAry(5) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(5)) THEN  --受入数
                     NULL;
                ELSE
                        --ＣＳＶファイルで数値項目が不正なフォーマットです
                        vc2Aps          := APS_ERR_CSV_NUMBER_FORMAT;
                        vc2ApsComment   := SUBSTR('(SBM1676)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                     || numCsvReadCount
                                                                     || LOGMSG_BRAKETE
                                                                     || LOGMSG_SPACER
                                                                     || LOGMSG_CSV_ERR_COLUMN
                                                                     || LOGMSG_BRAKETS
                                                                     || COL_ACPT_QTY
                                                                     || LOGMSG_BRAKETE,
                                    1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*数値チェック*/
            IF TypColumnAry(7) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(7)) THEN  --単価
                     NULL;
                ELSE
                        --ＣＳＶファイルで数値項目が不正なフォーマットです
                        vc2Aps          := APS_ERR_CSV_NUMBER_FORMAT;
                        vc2ApsComment   := SUBSTR('(SBM1677)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                     || numCsvReadCount
                                                                     || LOGMSG_BRAKETE
                                                                     || LOGMSG_SPACER
                                                                     || LOGMSG_CSV_ERR_COLUMN
                                                                     || LOGMSG_BRAKETS
                                                                     || COL_UNIT_COST
                                                                     || LOGMSG_BRAKETE,
                                    1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*数値チェック*/
            IF TypColumnAry(8) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(8)) THEN  --加工費
                     NULL;
                ELSE
                        --ＣＳＶファイルで数値項目が不正なフォーマットです
                        vc2Aps          := APS_ERR_CSV_NUMBER_FORMAT;
                        vc2ApsComment   := SUBSTR('(SBM1678)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                     || numCsvReadCount
                                                                     || LOGMSG_BRAKETE
                                                                     || LOGMSG_SPACER
                                                                     || LOGMSG_CSV_ERR_COLUMN
                                                                     || LOGMSG_BRAKETS
                                                                     || COL_PROCESSING_COST
                                                                     || LOGMSG_BRAKETE,
                                    1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*数値チェック*/
            IF TypColumnAry(9) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(9)) THEN  --材料費
                     NULL;
                ELSE
                        --ＣＳＶファイルで数値項目が不正なフォーマットです
                        vc2Aps          := APS_ERR_CSV_NUMBER_FORMAT;
                        vc2ApsComment   := SUBSTR('(SBM1679)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                     || numCsvReadCount
                                                                     || LOGMSG_BRAKETE
                                                                     || LOGMSG_SPACER
                                                                     || LOGMSG_CSV_ERR_COLUMN
                                                                     || LOGMSG_BRAKETS
                                                                     || COL_MATERIAL_COST
                                                                     || LOGMSG_BRAKETE,
                                    1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*数値チェック*/
            IF TypColumnAry(10) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(10)) THEN  --その他経費
                     NULL;
                ELSE
                        --ＣＳＶファイルで数値項目が不正なフォーマットです
                        vc2Aps          := APS_ERR_CSV_NUMBER_FORMAT;
                        vc2ApsComment   := SUBSTR('(SBM1680)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                     || numCsvReadCount
                                                                     || LOGMSG_BRAKETE
                                                                     || LOGMSG_SPACER
                                                                     || LOGMSG_CSV_ERR_COLUMN
                                                                     || LOGMSG_BRAKETS
                                                                     || COL_OTHER_OVERHEADS
                                                                     || LOGMSG_BRAKETE,
                                    1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*数値チェック*/
            IF TypColumnAry(11) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(11)) THEN  --値引金額
                     NULL;
                ELSE
                        --ＣＳＶファイルで数値項目が不正なフォーマットです
                        vc2Aps          := APS_ERR_CSV_NUMBER_FORMAT;
                        vc2ApsComment   := SUBSTR('(SBM1681)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                     || numCsvReadCount
                                                                     || LOGMSG_BRAKETE
                                                                     || LOGMSG_SPACER
                                                                     || LOGMSG_CSV_ERR_COLUMN
                                                                     || LOGMSG_BRAKETS
                                                                     || COL_DISC_AMOUNT
                                                                     || LOGMSG_BRAKETE,
                                    1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*数値チェック*/
            IF TypColumnAry(12) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(12)) THEN  --為替レート
                     NULL;
                ELSE
                        --ＣＳＶファイルで数値項目が不正なフォーマットです
                        vc2Aps          := APS_ERR_CSV_NUMBER_FORMAT;
                        vc2ApsComment   := SUBSTR('(SBM1682)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                     || numCsvReadCount
                                                                     || LOGMSG_BRAKETE
                                                                     || LOGMSG_SPACER
                                                                     || LOGMSG_CSV_ERR_COLUMN
                                                                     || LOGMSG_BRAKETS
                                                                     || COL_EXCH_RATE
                                                                     || LOGMSG_BRAKETE,
                                    1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /* 日付チェック */
            IF TypColumnAry(4) IS NOT NULL  THEN
                IF SubFncCheckDate(TypColumnAry(4)) THEN   --受入日
                    NULL;
                ELSE
                    --ＣＳＶファイルで日付項目が不正なフォーマットです
                    vc2Aps          := APS_ERR_CSV_DATE_FORMAT;
                    vc2ApsComment   := SUBSTR('(SBM1683)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_ACPT_DATE
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*発注番号　文字桁数チェック　26文字以上はエラー*/
            vc2CheckLength := LENGTH(TypColumnAry(1)) ;
            IF TypColumnAry(1) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_25 THEN
                    -- 桁数以内で設定してください。
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1675)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_PUCH_ODR_CD
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
             END IF;

            /*品目番号　文字桁数チェック　26文字以上はエラー*/
            vc2CheckLength := LENGTH(TypColumnAry(2)) ;
            IF TypColumnAry(2) IS NOT NULL  THEN
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

            /*受入場所　文字桁数チェック　26文字以上はエラー*/
            vc2CheckLength := LENGTH(TypColumnAry(3)) ;
            IF TypColumnAry(3) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_25 THEN
                    -- 桁数以内で設定してください。
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1685)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_WH_CD
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
             END IF;

            /*在庫ロット番号　文字桁数チェック　26文字以上はエラー*/
            vc2CheckLength := LENGTH(TypColumnAry(13)) ;
            IF TypColumnAry(13) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_25 THEN
                    -- 桁数以内で設定してください。
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1686)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_LOT_NO
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
             END IF;

            /*メーカロット番号　文字桁数チェック　26文字以上はエラー*/
            vc2CheckLength := LENGTH(TypColumnAry(14)) ;
            IF TypColumnAry(14) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_25 THEN
                    -- 桁数以内で設定してください。
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1687)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_VEND_LOT_NO
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
             END IF;

            /*納品書番号　文字桁数チェック　26文字以上はエラー*/
            vc2CheckLength := LENGTH(TypColumnAry(15)) ;
            IF TypColumnAry(15) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_25 THEN
                    -- 桁数以内で設定してください。
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1688)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_DLV_CD
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
             END IF;

            /*受入実績備考　文字桁数チェック　81文字以上はエラー*/
            vc2CheckLength := LENGTH(TypColumnAry(16)) ;
            IF TypColumnAry(16) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_25 THEN
                    -- 桁数以内で設定してください。
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1689)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_ACPT_RSLT_COMMENT
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
             END IF;

            /*発注番号 禁則文字チェック 「%」、「_」、「\」が含まれている場合はエラー*/
            IF TypColumnAry(1) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(1)) THEN
                    NULL;
                ELSE
                    --禁則文字（「%」、「_」、「\」）が含まれています。
                    vc2Aps          := APS_ERR_CSV_DATA_ILLEGAL;
                    vc2ApsComment   := SUBSTR('(SBM1675)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_PUCH_ODR_CD
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*品目番号 禁則文字チェック 「%」、「_」、「\」が含まれている場合はエラー*/
            IF TypColumnAry(2) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(2)) THEN
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

            /*受入場所 禁則文字チェック 「%」、「_」、「\」が含まれている場合はエラー*/
            IF TypColumnAry(3) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(3)) THEN
                    NULL;
                ELSE
                    --禁則文字（「%」、「_」、「\」）が含まれています。
                    vc2Aps          := APS_ERR_CSV_DATA_ILLEGAL;
                    vc2ApsComment   := SUBSTR('(SBM1685)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_WH_CD
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*受入数  桁数チェック 整数が 15桁以上、または小数点以下5桁以上の場合エラー */
            vc2ToChar      :=0;
            vc2CheckNum    :=0;
            vc2CheckLength :=0;
            IF TypColumnAry(5) IS NOT NULL  THEN
                IF MOD(TypColumnAry(5),1) > 0 THEN
                   vc2ToChar :=TO_CHAR(TypColumnAry(5));
                   vc2CheckNum := SUBSTR(vc2ToChar,INSTR(vc2ToChar,'.')+1);
                   vc2CheckLength := LENGTH(vc2CheckNum) ;
                ELSE
                   vc2CheckLength :=0;
                END IF;

                IF TypColumnAry(5) < NUMBER_100000000000000 AND
                   vc2CheckLength  < LENGTH_5 THEN
                   NULL;

                ELSE
                    -- 桁数以内で設定してください。
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1676)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_ACPT_QTY
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*単価  桁数チェック 整数が 15桁以上、または小数点以下5桁以上の場合エラー */
            vc2ToChar      :=0;
            vc2CheckNum    :=0;
            vc2CheckLength :=0;
            IF TypColumnAry(7) IS NOT NULL  THEN
                IF MOD(TypColumnAry(7),1) > 0 THEN
                   vc2ToChar :=TO_CHAR(TypColumnAry(7));
                   vc2CheckNum := SUBSTR(vc2ToChar,INSTR(vc2ToChar,'.')+1);
                   vc2CheckLength := LENGTH(vc2CheckNum) ;
                ELSE
                   vc2CheckLength :=0;
                END IF;

                IF TypColumnAry(7) < NUMBER_100000000000000 AND
                   vc2CheckLength  < LENGTH_5 THEN
                   NULL;

                ELSE
                    -- 桁数以内で設定してください。
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1677)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_UNIT_COST
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*加工費  桁数チェック 整数が 15桁以上、または小数点以下5桁以上の場合エラー */
            vc2ToChar      :=0;
            vc2CheckNum    :=0;
            vc2CheckLength :=0;
            IF TypColumnAry(8) IS NOT NULL  THEN
                IF MOD(TypColumnAry(8),1) > 0 THEN
                   vc2ToChar :=TO_CHAR(TypColumnAry(8));
                   vc2CheckNum := SUBSTR(vc2ToChar,INSTR(vc2ToChar,'.')+1);
                   vc2CheckLength := LENGTH(vc2CheckNum) ;
                ELSE
                   vc2CheckLength :=0;
                END IF;

                IF TypColumnAry(8) < NUMBER_100000000000000 AND
                   vc2CheckLength  < LENGTH_5 THEN
                   NULL;

                ELSE
                    -- 桁数以内で設定してください。
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1678)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_PROCESSING_COST
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*材料費  桁数チェック 整数が 15桁以上、または小数点以下5桁以上の場合エラー */
            vc2ToChar      :=0;
            vc2CheckNum    :=0;
            vc2CheckLength :=0;
            IF TypColumnAry(9) IS NOT NULL  THEN
                IF MOD(TypColumnAry(9),1) > 0 THEN
                   vc2ToChar :=TO_CHAR(TypColumnAry(9));
                   vc2CheckNum := SUBSTR(vc2ToChar,INSTR(vc2ToChar,'.')+1);
                   vc2CheckLength := LENGTH(vc2CheckNum) ;
                ELSE
                   vc2CheckLength :=0;
                END IF;

                IF TypColumnAry(9) < NUMBER_100000000000000 AND
                   vc2CheckLength  < LENGTH_5 THEN
                   NULL;

                ELSE
                    -- 桁数以内で設定してください。
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1679)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_MATERIAL_COST
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*その他経費  桁数チェック 整数が 15桁以上、または小数点以下5桁以上の場合エラー */
            vc2ToChar      :=0;
            vc2CheckNum    :=0;
            vc2CheckLength :=0;
            IF TypColumnAry(10) IS NOT NULL  THEN
                IF MOD(TypColumnAry(10),1) > 0 THEN
                   vc2ToChar :=TO_CHAR(TypColumnAry(10));
                   vc2CheckNum := SUBSTR(vc2ToChar,INSTR(vc2ToChar,'.')+1);
                   vc2CheckLength := LENGTH(vc2CheckNum) ;
                ELSE
                   vc2CheckLength :=0;
                END IF;

                IF TypColumnAry(10) < NUMBER_100000000000000 AND
                   vc2CheckLength  < LENGTH_5 THEN
                   NULL;

                ELSE
                    -- 桁数以内で設定してください。
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1680)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_OTHER_OVERHEADS
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*値引金額  桁数チェック 整数が 15桁以上、または小数点以下5桁以上の場合エラー */
            vc2ToChar      :=0;
            vc2CheckNum    :=0;
            vc2CheckLength :=0;
            IF TypColumnAry(11) IS NOT NULL  THEN
                IF MOD(TypColumnAry(11),1) > 0 THEN
                   vc2ToChar :=TO_CHAR(TypColumnAry(11));
                   vc2CheckNum := SUBSTR(vc2ToChar,INSTR(vc2ToChar,'.')+1);
                   vc2CheckLength := LENGTH(vc2CheckNum) ;
                ELSE
                   vc2CheckLength :=0;
                END IF;

                IF TypColumnAry(11) < NUMBER_100000000000000 AND
                   vc2CheckLength  < LENGTH_5 THEN
                   NULL;

                ELSE
                    -- 桁数以内で設定してください。
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1681)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_DISC_AMOUNT
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*為替レート  桁数チェック 整数が 15桁以上、または小数点以下5桁以上の場合エラー */
            vc2ToChar      :=0;
            vc2CheckNum    :=0;
            vc2CheckLength :=0;
            IF TypColumnAry(12) IS NOT NULL  THEN
                IF MOD(TypColumnAry(12),1) > 0 THEN
                   vc2ToChar :=TO_CHAR(TypColumnAry(12));
                   vc2CheckNum := SUBSTR(vc2ToChar,INSTR(vc2ToChar,'.')+1);
                   vc2CheckLength := LENGTH(vc2CheckNum) ;
                ELSE
                   vc2CheckLength :=0;
                END IF;

                IF TypColumnAry(12) < NUMBER_100000000000000 AND
                   vc2CheckLength  < LENGTH_5 THEN
                   NULL;

                ELSE
                    -- 桁数以内で設定してください。
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1682)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_EXCH_RATE
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;



            /*単価区分が　Nullではない、かつ、（1，2）以外の場合はエラー*/
            IF TypColumnAry(6) IS NOT NULL  THEN
                IF TypColumnAry(6) = 1 OR 
                   TypColumnAry(6) = 2 THEN
                   NULL;
                ELSE
                    -- 単価区分が不正です。
                    vc2Aps          := APS_ERR_UNIT_COST_TYP;
                    vc2ApsComment   := SUBSTR('(SBM1690)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_UNIT_COST_TYP
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
             END IF;

            /*為替レート　０の場合はエラー*/
            IF TypColumnAry(12) IS NOT NULL  THEN
                IF TypColumnAry(12) = NUMBER_0 THEN
                    -- 為替レートには、0より大きい数値を入力してください。
                    vc2Aps          := APS_ERR_CSV_ZERO;
                    vc2ApsComment   := SUBSTR('(SBM1682)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_EXCH_RATE
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
             END IF;

            /*在庫ロット番号　「受入数」＝0またはNull 且つ「在庫ロット番号」≠ Null の場合はエラー*/
            IF TypColumnAry(5) IS NULL OR
               TypColumnAry(5) = NUMBER_0 THEN
               IF TypColumnAry(13) IS NOT NULL THEN
                    -- 受入数が0のため、在庫ロット番号を入力できません。
                    vc2Aps          := APS_ERR_LOT_NO;
                    vc2ApsComment   := SUBSTR('(SBM1686)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_LOT_NO
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;

               END IF;
            END IF;

            /*受入完了フラグが　Nullではない、かつ、（0,1,2）以外の場合はエラー*/
            IF TypColumnAry(17) IS NOT NULL  THEN
                IF TypColumnAry(17) = 0 OR 
                   TypColumnAry(17) = 1 OR
                   TypColumnAry(17) = 2 THEN
                   NULL;
                ELSE
                    -- 受入完了フラグが不正です。
                    vc2Aps          := APS_ERR_ACPT_RSLT_COMP1;
                    vc2ApsComment   := SUBSTR('(SBM1691)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_ACPT_RSLT_COMP
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
             END IF;

            /*受入完了フラグが0または1の場合、かつ、受入数が0またはNullの場合はエラー*/
            IF TypColumnAry(17) IS NOT NULL  THEN
                IF TypColumnAry(17) = 0 OR 
                   TypColumnAry(17) = 1 THEN
                   IF TypColumnAry(5) IS NULL OR
                      TypColumnAry(5) = 0     THEN
                        -- 受入数が未入力です。
                        vc2Aps          := APS_ERR_ACPT_RSLT_COMP2;
                        vc2ApsComment   := SUBSTR('(SBM1691)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                     || numCsvReadCount
                                                                     || LOGMSG_BRAKETE
                                                                     || LOGMSG_SPACER
                                                                     || LOGMSG_CSV_ERR_COLUMN
                                                                     || LOGMSG_BRAKETS
                                                                     || COL_ACPT_RSLT_COMP
                                                                     || LOGMSG_BRAKETE,
                                1,256);
                        RAISE excCSV_CHECK_ERR;
                   END IF;
                END IF;
            END IF;

            /*受入完了フラグが2の場合、且つ、受入数が0、Nullではない場合はエラー*/
            IF TypColumnAry(17) IS NOT NULL  THEN
                IF TypColumnAry(17) = 2 THEN
                   IF TypColumnAry(5) IS NOT NULL OR
                      TypColumnAry(5) <> 0        THEN
                        -- 受入完了フラグが0完了ですが、受入数が登録されています。
                        vc2Aps          := APS_ERR_ACPT_RSLT_COMP3;
                        vc2ApsComment   := SUBSTR('(SBM1691)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                     || numCsvReadCount
                                                                     || LOGMSG_BRAKETE
                                                                     || LOGMSG_SPACER
                                                                     || LOGMSG_CSV_ERR_COLUMN
                                                                     || LOGMSG_BRAKETS
                                                                     || COL_ACPT_RSLT_COMP
                                                                     || LOGMSG_BRAKETE,
                                1,256);
                        RAISE excCSV_CHECK_ERR;
                   END IF;
                END IF;
            END IF;

            ---------------■CSV項目のチェックEnd■------------------

            /*受入実績取込管理番号の採番*/
            vc2AcptRsltTempCtlNo := SubFncGetACPT_RSLT_TEMP_CTL_NO;
                 /* [受入実績取込]　登録処理 */

            INSERT INTO T_ACPT_RSLT_TEMP( 
                  ACPT_RSLT_TEMP_CTL_NO  --受入計画取込管理番号
                , PUCH_ODR_CD            --発注番号
                , ITEM_CD                --品目番号
                , WH_CD                  --受入場所
                , ACPT_DATE              --受入日
                , ACPT_QTY               --受入数
                , UNIT_COST_TYP          --単価区分
                , UNIT_COST              --単価
                , PROCESSING_COST        --加工費
                , MATERIAL_COST          --材料費
                , OTHER_OVERHEADS        --その他経費
                , DISC_AMOUNT            --値引金額
                , EXCH_RATE              --為替レート
                , LOT_NO                 --在庫ロット番号
                , VEND_LOT_NO            --メーカロット番号
                , DLV_CD                 --納品書番号
                , ACPT_RSLT_COMMENT      --受入実績備考
                , ACPT_RSLT_COMP         --受入完了フラグ
                , TAKE_DATE              --取込日付
                )VALUES(
                  vc2AcptRsltTempCtlNo   --採番した受入実績取込管理番号
                , TypColumnAry(1)        --発注番号
                , TypColumnAry(2)        --品目番号
                , TypColumnAry(3)        --受入場所
                , TypColumnAry(4)        --受入日
                , TypColumnAry(5)        --受入数
                , TypColumnAry(6)        --単価区分
                , TypColumnAry(7)        --単価
                , TypColumnAry(8)        --加工費
                , TypColumnAry(9)        --材料費
                , TypColumnAry(10)       --その他経費
                , TypColumnAry(11)       --値引金額
                , TypColumnAry(12)       --為替レート
                , TypColumnAry(13)       --在庫ロット番号
                , TypColumnAry(14)       --メーカロット番号
                , TypColumnAry(15)       --納品書番号
                , TypColumnAry(16)       --受入実績備考
                , TypColumnAry(17)       --受入完了フラグ
                , dtmBusinessOprDate     --業務運用日
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
        /* 受入実績取込 CSV処理件数表示 */
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
