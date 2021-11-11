CREATE OR REPLACE PROCEDURE SQLPUCHODRINTERFACE(
/*------------------------------------------------------------------------------
'
'$Author: zhangran $
'$Revision: 1.3 $
'
' 機能      :発注計画CSV取込処理
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
' 機能説明  : 発注計画CSVファイルを読み込み、[発注計画取込]を作成します。
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
    RtpSYS_PARAMETER                curSYS_PARAMETER%ROWTYPE;       -- 【パラメータ】

/* 定数の宣言 */

    MY_SQL_NAME                         VARCHAR2(84)    := 'SQLPUCHODRINTERFACE';              
    STATUS_NORMAL                       NUMBER(1)       := 1;                                  --正常終了
    STATUS_WARNING                      NUMBER(1)       := 2;                                  --警告終了
    STATUS_ERROR                        NUMBER(1)       := 3;                                  --異常終了
    DATE_FORMAT                         VARCHAR2(72)    := 'YYYY/MM/DD HH24:MI';               -- 日付変換時のフォーマット
    PATH_SLASH                          VARCHAR2(4)     := '/';                                --ファイルパス区切り文字
    PATH_DELIM                          VARCHAR2(4)     := '\';                                --ファイルパス区切り文字

    DEFAULT_CHAR_SET                    VARCHAR2(32)    := 'JA16SJIS';                         -- S-JIS
    PUCH_ODR_IF_CSV_PATH                VARCHAR2(88)    := 'PUCH_ODR_IF_CSV_PATH';             -- [パラメータ].名前
    CSV_CHAR_SET                        VARCHAR2(64)    := 'CSV_CHARACTERSET';                 -- [パラメータ].名前
    CSV_TAKE_TYP_FIX                    NUMBER(1)       := 1;                                  -- 1：固定ファイル取込
    CSV_TAKE_TYP_DESINATED              NUMBER(1)       := 2;                                  -- 2：指定ファイル取込
    CSV_LINE_MAX                        INTEGER         := 2048;                               --ＣＳＶファイル１行当りの最大数
    CSV_COLUMN_COUNT                    INTEGER         := 27;                                 --ＣＳＶファイル１行当りの項目数
    CSV_DELIM                           VARCHAR2(4)     := ',';                                --ＣＳＶ項目の区切り文字
    LENGTH_25                           NUMBER(2)       := 25;                                 --文字数:=25
    LENGTH_80                           NUMBER(2)       := 80;                                 --文字数:=80
    LENGTH_40                           NUMBER(2)       := 40;                                 --文字数 :=40
    LENGTH_12                           NUMBER(2)       := 12;                                 --文字数 :=12
    LENGTH_5                            NUMBER(1)       := 5;                                  --文字数 :=5
    LENGTH_7                            NUMBER(1)       := 7;                                  --文字数 :=7
    LENGTH_10                           NUMBER(2)       := 10;                                 --文字数 :=10
    LENGTH_15                           NUMBER(2)       := 15;                                 --文字数 :=15
    LENGTH_50                           NUMBER(2)       := 50;                                 --文字数 :=50
    NUMBER_100000000000000              NUMBER(15)      := 100000000000000;                    --数値桁数:15桁
    NUMBER_0                            NUMBER(1)       := 0;                                  --数値:=0

    NON_NO_ITEM_FLG_0                   NUMBER(1)       := 0;                                  --備品発注フラグ = 0:備品以外（通常仕入品）
    NON_NO_ITEM_FLG_1                   NUMBER(1)       := 1;                                  --備品発注フラグ = 1:備品発注
    NON_NO_ITEM_TYP_0                   NUMBER(2)       := 0;                                  --備品発注製品区分 = 0：在庫管理をする
    NON_NO_ITEM_TYP_1                   NUMBER(2)       := 1;                                  --備品発注製品区分 = 1：製品
    NON_NO_ITEM_TYP_2                   NUMBER(2)       := 2;                                  --備品発注製品区分 = 2：半製品
    NON_NO_ITEM_TYP_3                   NUMBER(2)       := 3;                                  --備品発注製品区分 = 3：部品
    NON_NO_ITEM_TYP_4                   NUMBER(2)       := 4;                                  --備品発注製品区分 = 4：原材料
    NON_NO_ITEM_TYP_5                   NUMBER(2)       := 5;                                  --備品発注製品区分 = 5：その他
    UNIT_COST_TYP_1                     NUMBER(2)       := 1;                                  --単価区分 = 1：仮単価
    UNIT_COST_TYP_2                     NUMBER(2)       := 2;                                  --単価区分 = 2：正単価

/* EXCEPTION の宣言 */
    excERR_SKIP                         EXCEPTION;      --実行不可
    excERR_MAST                         EXCEPTION;      --カーソルOPEN中のEXCEPTION
    excCSV_CHECK_ERR                    EXCEPTION;      --CSVデータのチェックエラー

/* MESSAGE の宣言 */
    APS_ERR_CSVFILEPATH                 VARCHAR2(28)    := 'AE60011';   --発注計画ＣＳＶパスの取得に失敗しました。
    APS_ERR_CSVFILE                     VARCHAR2(28)    := 'AD60005';   --ファイルの処理中にエラーが発生しました。
    APS_BATCH_START                     VARCHAR2(28)    := 'AE60010';   --発注計画CSV取込処理を開始しました。
    APS_BATCH_END                       VARCHAR2(28)    := 'AE60012';   --発注計画CSV取込処理を終了しました。
    APS_BATCH_EXC                       VARCHAR2(28)    := 'AE60013';   --発注計画CSV取込処理が異常終了しました。
    APS_ERR_CSV_DATA_FORMAT             VARCHAR2(28)    := 'AD60006';   --CSVファイルが不正なフォーマットです。
    APS_DATA_PROCESSING                 VARCHAR2(28)    := 'AD60014';   --処理件数
    APS_ERR_REQUIRED                    VARCHAR2(28)    := 'AD60009';   --CSVファイルの必須項目に値が設定されていません。
    APS_ERR_CSV_DATA_DIGIT              VARCHAR2(28)    := 'AA01501';   --桁数以内で設定してください。
    APS_ERR_CSV_DATA_ILLEGAL            VARCHAR2(28)    := 'AA01524';   --禁則文字（「%」、「_」、「\」）が含まれています。
    APS_ERR_CSV_NUMBER_FORMAT           VARCHAR2(28)    := 'AD60007';   --CSVファイルで数値項目が不正なフォーマットです。
    APS_ERR_CSV_DATE_FORMAT             VARCHAR2(28)    := 'AD60008';   --CSVファイルで日付項目が不正なフォーマットです。
    APS_ERR_NUMBER_MINUS                VARCHAR2(28)    := 'AD60010';   --CSVファイルの数値項目にマイナス値が設定されています。

    APS_ERR_ITEM_CD1                    VARCHAR2(28)    := 'AB00002';   --品目番号が未入力です。
    APS_ERR_NON_NO_ITEM_FLG1            VARCHAR2(28)    := 'AE05070';   --不正な値が設定されています。
    APS_ERR_NON_NO_ITEM_TYP1            VARCHAR2(28)    := 'AE05070';   --不正な値が設定されています。
    APS_ERR_NON_NO_ITEM_NAME1           VARCHAR2(28)    := 'AE05071';   --備品発注品目名が未入力です。
    APS_ERR_NON_NO_ITEM_TYP2            VARCHAR2(28)    := 'AE05072';   --備品発注製品区分が未入力です。
    APS_ERR_UNIT_COST_TYP1              VARCHAR2(28)    := 'AD20033';   --単価区分が未入力です。
    APS_ERR_UNIT_COST_TYP2              VARCHAR2(28)    := 'AE05070';   --不正な値が設定されています。
    APS_ERR_PROCESSING_COST1            VARCHAR2(28)    := 'AE00040';   --加工費が未入力です。
    APS_ERR_MATERIAL_COST1              VARCHAR2(28)    := 'AE00041';   --材料費が未入力です。
    APS_ERR_OTHER_OVERHEADS1            VARCHAR2(28)    := 'AE00042';   --その他経費が未入力です。
    APS_ERR_NON_NO_ITEM_TYP3            VARCHAR2(28)    := 'AE25028';   --備品購入時のみ入力可能です。

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
    LOGMSG_START_PGNM                   VARCHAR2(400)   := '(SBM1338)発注計画CSV取込処理を開始しました。';
    LOGMSG_END_PGNM                     VARCHAR2(152)   := '(SBM1339)発注計画CSV取込処理を終了しました。';
    LOGMSG_CSVFILE                      VARCHAR2(400)   := '(SBM1340)発注計画ファイル名=';
    LOGMSG_LINECNT                      VARCHAR2(400)   := 'CSV行番号=';
    COL_ITEM_CD                         VARCHAR2(200)   := '品目番号';
    COL_PUCH_ODR_DLV_DATE               VARCHAR2(200)   := '発注納期';
    COL_PUCH_ODR_START_DATE             VARCHAR2(200)   := '発注予定日';
    COL_PUCH_ODR_QTY                    VARCHAR2(200)   := '発注数';
    COL_VEND_CD                         VARCHAR2(200)   := '取引先コード';
    COL_JOB_ODR_CD                      VARCHAR2(200)   := '製番';
    COL_CONFIRM_DLV_DATE                VARCHAR2(200)   := '取引先回答納期';
    COL_WH_CD                           VARCHAR2(200)   := '受入場所';
    COL_PUCH_ODR_COMMENT                VARCHAR2(200)   := '備考';
    COL_NON_NO_ITEM_FLG                 VARCHAR2(200)   := '備品発注フラグ';
    COL_NON_NO_ITEM_NAME                VARCHAR2(200)   := '備品発注品目名';
    COL_NON_NO_ITEM_TYP                 VARCHAR2(200)   := '備品発注製品区分';
    COL_NON_NO_ITEM_PUCH_ODR_UNIT       VARCHAR2(200)   := '備品発注単位';
    COL_UNIT_COST_TYP                   VARCHAR2(200)   := '単価区分';
    COL_UNIT_COST                       VARCHAR2(200)   := '単価';
    COL_PROCESSING_COST                 VARCHAR2(200)   := '加工費';
    COL_MATERIAL_COST                   VARCHAR2(200)   := '材料費';
    COL_OTHER_OVERHEADS                 VARCHAR2(200)   := 'その他経費';
    COL_NET_AMOUNT                      VARCHAR2(200)   := '本体金額';
    COL_EXCH_RATE                       VARCHAR2(200)   := '為替レート';
    COL_ACCT_CD                         VARCHAR2(200)   := '科目コード';
    COL_DEPT_CD                         VARCHAR2(200)   := '負担部門コード';
    COL_PJ_CD                           VARCHAR2(200)   := 'プロジェクトコード';
    COL_SEG_CONTENTS1                   VARCHAR2(200)   := 'セグメント1';
    COL_SEG_CONTENTS2                   VARCHAR2(200)   := 'セグメント2';
    COL_SEG_CONTENTS3                   VARCHAR2(200)   := 'セグメント3';
    COL_SEG_CONTENTS4                   VARCHAR2(200)   := 'セグメント4';


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
    vc2CsvFilePath              VARCHAR2(1024);                 --発注計画CSVファイルの格納ディレクトリ
    vc2CsvFile                  VARCHAR2(1024);                 --発注計画CSVファイル名
    vc2NewFileName              VARCHAR2(1000) := '';           --ファイルリネーム用
    intIdx                      INTEGER;                        --項目切り出し用カウンタ
    vc2WorkBuffer               VARCHAR2(1024);                 --作業用バッファ
    intColumnMax                INTEGER;                        --カラム数確認用
    intColumnOvr                INTEGER;                        --カラム数確認用
    blnCsvDataCommit            BOOLEAN;                        --発注計画取込に登録したデータのコミット可否フラグ
    vc2ReadBuffer               VARCHAR2(2048);                 --読み込み用バッファ
    numMsglogCount              NUMBER := 0;                    -- メッセージログ数
    numCsvReadCount             NUMBER(10) := 0;                --CSV 読込件数
    numCsvInsertCount           NUMBER(10) := 0;                --CSV 登録件数
    numMstErrorCount            NUMBER(10) := 0;                --マスタエラー件数
    blnFile                     BOOLEAN;                        --BOOLEAN型 返却値
    blnRet                      BOOLEAN;                        --BOOLEAN型 返却値
    UTL_FileHandle              UTL_FILE.FILE_TYPE;             --ファイルハンドル
    UTL_FileCsvHandle           UTL_FILE.FILE_TYPE;             --発注計画CSVファイルハンドル
    vc2PuchOdrTempCtlNo         VARCHAR2(100);                  --発注計画取込管理番号
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
    ' 機能      : 「発注計画取込管理番号」を採番する
    '
    ' 戻り値    : 生成した「発注計画取込管理番号」
    '
    ' 引き数    :
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncGetPUCH_ODR_TEMP_CTL_NO RETURN VARCHAR2
    IS
        numNumber           NUMBER(10);
        TypSEQ_VAL          T_PUCH_ODR_TEMP.PUCH_ODR_TEMP_CTL_NO%TYPE;
    BEGIN
        SELECT SEQ_PUC_ODR.NEXTVAL INTO numNumber FROM DUAL;

        TypSEQ_VAL := LPAD(TO_CHAR(numNumber), 10, '0');
        TypSEQ_VAL := 'PUC' || TypSEQ_VAL;

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
    /*発注計画取込に登録したデータのコミット可否フラグ = TRUE */
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
            OPEN curSYS_PARAMETER(PUCH_ODR_IF_CSV_PATH);
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

            -- 発注計画ＣＳＶパスの取得に失敗しました
            vc2Aps        := APS_ERR_CSVFILEPATH;
                vc2ApsComment := SUBSTR('(SBM1646)'||LOGMSG_NAME   || '、' ||
                                                     LOGMSG_BRAKETS        ||
                                                     PUCH_ODR_IF_CSV_PATH  ||
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
' 発注計画ファイルの取込処理
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

    /* ＣＳＶファイルより、[発注計画取込]に取込開始 */
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
            IF TypColumnAry( 2) IS NULL THEN        -- 発注納期
                -- CSVファイルの必須項目に値が設定されていません。
                vc2Aps          := APS_ERR_REQUIRED;
               vc2ApsComment   := SUBSTR('(SBM1739)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                            || numCsvReadCount
                                                            || LOGMSG_BRAKETE
                                                            || LOGMSG_SPACER
                                                            || LOGMSG_CSV_ERR_COLUMN
                                                            || LOGMSG_BRAKETS
                                                            || COL_PUCH_ODR_DLV_DATE
                                                            || LOGMSG_BRAKETE,
                                1,256);
                RAISE excCSV_CHECK_ERR;
            END IF;

            /* 必須項目チェック */
            IF TypColumnAry( 4) IS NULL THEN        -- 発注数
                -- CSVファイルの必須項目に値が設定されていません。
                vc2Aps          := APS_ERR_REQUIRED;
               vc2ApsComment   := SUBSTR('(SBM1740)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                            || numCsvReadCount
                                                            || LOGMSG_BRAKETE
                                                            || LOGMSG_SPACER
                                                            || LOGMSG_CSV_ERR_COLUMN
                                                            || LOGMSG_BRAKETS
                                                            || COL_PUCH_ODR_QTY
                                                            || LOGMSG_BRAKETE,
                                1,256);
                RAISE excCSV_CHECK_ERR;
            END IF;

            /* 必須項目チェック */
            IF TypColumnAry( 5) IS NULL THEN        -- 取引先コード
                -- CSVファイルの必須項目に値が設定されていません。
                vc2Aps          := APS_ERR_REQUIRED;
               vc2ApsComment   := SUBSTR('(SBM1741)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                            || numCsvReadCount
                                                            || LOGMSG_BRAKETE
                                                            || LOGMSG_SPACER
                                                            || LOGMSG_CSV_ERR_COLUMN
                                                            || LOGMSG_BRAKETS
                                                            || COL_VEND_CD
                                                            || LOGMSG_BRAKETE,
                                1,256);
                RAISE excCSV_CHECK_ERR;
            END IF;

            /* 必須項目チェック */
            IF TypColumnAry( 8) IS NULL THEN        -- 受入場所
                -- CSVファイルの必須項目に値が設定されていません。
                vc2Aps          := APS_ERR_REQUIRED;
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

            /* 必須項目チェック */
            IF TypColumnAry( 10) IS NULL THEN        -- 備品発注フラグ
                -- CSVファイルの必須項目に値が設定されていません。
                vc2Aps          := APS_ERR_REQUIRED;
               vc2ApsComment   := SUBSTR('(SBM1742)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                            || numCsvReadCount
                                                            || LOGMSG_BRAKETE
                                                            || LOGMSG_SPACER
                                                            || LOGMSG_CSV_ERR_COLUMN
                                                            || LOGMSG_BRAKETS
                                                            || COL_NON_NO_ITEM_FLG
                                                            || LOGMSG_BRAKETE,
                                1,256);
                RAISE excCSV_CHECK_ERR;
            END IF;


            /*数値チェック*/
            IF TypColumnAry(4) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(4)) THEN  --発注数
                     NULL;
                ELSE
                        --ＣＳＶファイルで数値項目が不正なフォーマットです
                        vc2Aps          := APS_ERR_CSV_NUMBER_FORMAT;
                        vc2ApsComment   := SUBSTR('(SBM1740)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                     || numCsvReadCount
                                                                     || LOGMSG_BRAKETE
                                                                     || LOGMSG_SPACER
                                                                     || LOGMSG_CSV_ERR_COLUMN
                                                                     || LOGMSG_BRAKETS
                                                                     || COL_PUCH_ODR_QTY
                                                                     || LOGMSG_BRAKETE,
                                    1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*数値チェック*/
            IF TypColumnAry(10) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(10)) THEN  --備品発注フラグ
                     NULL;
                ELSE
                        --ＣＳＶファイルで数値項目が不正なフォーマットです
                        vc2Aps          := APS_ERR_CSV_NUMBER_FORMAT;
                        vc2ApsComment   := SUBSTR('(SBM1742)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                     || numCsvReadCount
                                                                     || LOGMSG_BRAKETE
                                                                     || LOGMSG_SPACER
                                                                     || LOGMSG_CSV_ERR_COLUMN
                                                                     || LOGMSG_BRAKETS
                                                                     || COL_NON_NO_ITEM_FLG
                                                                     || LOGMSG_BRAKETE,
                                    1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*数値チェック*/
            IF TypColumnAry(12) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(12)) THEN  --備品発注製品区分
                     NULL;
                ELSE
                        --ＣＳＶファイルで数値項目が不正なフォーマットです
                        vc2Aps          := APS_ERR_CSV_NUMBER_FORMAT;
                        vc2ApsComment   := SUBSTR('(SBM1743)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                     || numCsvReadCount
                                                                     || LOGMSG_BRAKETE
                                                                     || LOGMSG_SPACER
                                                                     || LOGMSG_CSV_ERR_COLUMN
                                                                     || LOGMSG_BRAKETS
                                                                     || COL_NON_NO_ITEM_TYP
                                                                     || LOGMSG_BRAKETE,
                                    1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*数値チェック*/
            IF TypColumnAry(14) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(14)) THEN  --単価区分
                     NULL;
                ELSE
                        --ＣＳＶファイルで数値項目が不正なフォーマットです
                        vc2Aps          := APS_ERR_CSV_NUMBER_FORMAT;
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

            /*数値チェック*/
            IF TypColumnAry(15) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(15)) THEN  --単価
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
            IF TypColumnAry(16) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(16)) THEN  --加工費
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
            IF TypColumnAry(17) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(17)) THEN  --材料費
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
            IF TypColumnAry(18) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(18)) THEN  --その他経費
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
            IF TypColumnAry(19) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(19)) THEN  --本体金額
                     NULL;
                ELSE
                        --ＣＳＶファイルで数値項目が不正なフォーマットです
                        vc2Aps          := APS_ERR_CSV_NUMBER_FORMAT;
                        vc2ApsComment   := SUBSTR('(SBM1744)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                     || numCsvReadCount
                                                                     || LOGMSG_BRAKETE
                                                                     || LOGMSG_SPACER
                                                                     || LOGMSG_CSV_ERR_COLUMN
                                                                     || LOGMSG_BRAKETS
                                                                     || COL_NET_AMOUNT
                                                                     || LOGMSG_BRAKETE,
                                    1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*数値チェック*/
            IF TypColumnAry(20) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(20)) THEN  --為替レート
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

            /*マイナスチェック*/
            IF TO_NUMBER(TypColumnAry(4)) < 0 THEN          --発注数
                -- CSVファイルの数値項目にマイナス値が設定されています。
                vc2Aps          := APS_ERR_NUMBER_MINUS;
                vc2ApsComment   := SUBSTR('(SBM1740)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                             || numCsvReadCount
                                                             || LOGMSG_BRAKETE
                                                             || LOGMSG_SPACER
                                                             || LOGMSG_CSV_ERR_COLUMN
                                                             || LOGMSG_BRAKETS
                                                             || COL_PUCH_ODR_QTY
                                                             || LOGMSG_BRAKETE,
                                1,256);
                RAISE excCSV_CHECK_ERR;
            END IF;

            /*マイナスチェック*/
            IF TO_NUMBER(TypColumnAry(15)) < 0 THEN          --単価
                -- CSVファイルの数値項目にマイナス値が設定されています。
                vc2Aps          := APS_ERR_NUMBER_MINUS;
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

            /*マイナスチェック*/
            IF TO_NUMBER(TypColumnAry(16)) < 0 THEN          --加工費
                -- CSVファイルの数値項目にマイナス値が設定されています。
                vc2Aps          := APS_ERR_NUMBER_MINUS;
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

            /*マイナスチェック*/
            IF TO_NUMBER(TypColumnAry(17)) < 0 THEN          --材料費
                -- CSVファイルの数値項目にマイナス値が設定されています。
                vc2Aps          := APS_ERR_NUMBER_MINUS;
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

            /*マイナスチェック*/
            IF TO_NUMBER(TypColumnAry(18)) < 0 THEN          --その他経費
                -- CSVファイルの数値項目にマイナス値が設定されています。
                vc2Aps          := APS_ERR_NUMBER_MINUS;
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

            /*マイナスチェック*/
            IF TO_NUMBER(TypColumnAry(19)) < 0 THEN          --本体金額
                -- CSVファイルの数値項目にマイナス値が設定されています。
                vc2Aps          := APS_ERR_NUMBER_MINUS;
                vc2ApsComment   := SUBSTR('(SBM1744)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                             || numCsvReadCount
                                                             || LOGMSG_BRAKETE
                                                             || LOGMSG_SPACER
                                                             || LOGMSG_CSV_ERR_COLUMN
                                                             || LOGMSG_BRAKETS
                                                             || COL_NET_AMOUNT
                                                             || LOGMSG_BRAKETE,
                                1,256);
                RAISE excCSV_CHECK_ERR;
            END IF;

            /*マイナスチェック*/
            IF TO_NUMBER(TypColumnAry(20)) < 0 THEN          --為替レート
                -- CSVファイルの数値項目にマイナス値が設定されています。
                vc2Aps          := APS_ERR_NUMBER_MINUS;
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

            /* 日付チェック */
            IF TypColumnAry(2) IS NOT NULL  THEN
                IF SubFncCheckDate(TypColumnAry(2)) THEN   --発注納期
                    NULL;
                ELSE
                    --ＣＳＶファイルで日付項目が不正なフォーマットです
                    vc2Aps          := APS_ERR_CSV_DATE_FORMAT;
                    vc2ApsComment   := SUBSTR('(SBM1739)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_PUCH_ODR_DLV_DATE
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /* 日付チェック */
            IF TypColumnAry(3) IS NOT NULL  THEN
                IF SubFncCheckDate(TypColumnAry(3)) THEN   --発注予定日
                    NULL;
                ELSE
                    --ＣＳＶファイルで日付項目が不正なフォーマットです
                    vc2Aps          := APS_ERR_CSV_DATE_FORMAT;
                    vc2ApsComment   := SUBSTR('(SBM1745)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_PUCH_ODR_START_DATE
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /* 日付チェック */
            IF TypColumnAry(7) IS NOT NULL  THEN
                IF SubFncCheckDate(TypColumnAry(7)) THEN   --取引先回答納期
                    NULL;
                ELSE
                    --ＣＳＶファイルで日付項目が不正なフォーマットです
                    vc2Aps          := APS_ERR_CSV_DATE_FORMAT;
                    vc2ApsComment   := SUBSTR('(SBM1746)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_CONFIRM_DLV_DATE
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

            /*取引先コード　文字桁数チェック　26文字以上はエラー*/
            vc2CheckLength := LENGTH(TypColumnAry(5)) ;
            IF TypColumnAry(5) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_25 THEN
                    -- 桁数以内で設定してください。
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1741)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_VEND_CD
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

            /*受入場所　文字桁数チェック　26文字以上はエラー*/
            vc2CheckLength := LENGTH(TypColumnAry(8)) ;
            IF TypColumnAry(8) IS NOT NULL  THEN
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

            /*備考　文字桁数チェック　81文字以上はエラー*/
            vc2CheckLength := LENGTH(TypColumnAry(9)) ;
            IF TypColumnAry(9) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_80 THEN
                    -- 桁数以内で設定してください。
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1721)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_PUCH_ODR_COMMENT
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
             END IF;

            /*備品発注品目名　文字桁数チェック　41文字以上はエラー*/
            vc2CheckLength := LENGTH(TypColumnAry(11)) ;
            IF TypColumnAry(11) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_40 THEN
                    -- 桁数以内で設定してください。
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1747)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_NON_NO_ITEM_NAME
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
             END IF;

            /*備品発注単位　文字桁数チェック　13文字以上はエラー*/
            vc2CheckLength := LENGTH(TypColumnAry(13)) ;
            IF TypColumnAry(13) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_12 THEN
                    -- 桁数以内で設定してください。
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1748)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_NON_NO_ITEM_PUCH_ODR_UNIT
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
             END IF;

            /*科目コード　文字桁数チェック　11文字以上はエラー*/
            vc2CheckLength := LENGTH(TypColumnAry(21)) ;
            IF TypColumnAry(21) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_10 THEN
                    -- 桁数以内で設定してください。
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1749)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_ACCT_CD
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
             END IF;

            /*負担部門コード　文字桁数チェック　26文字以上はエラー*/
            vc2CheckLength := LENGTH(TypColumnAry(22)) ;
            IF TypColumnAry(22) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_25 THEN
                    -- 桁数以内で設定してください。
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1750)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_DEPT_CD
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
             END IF;

            /*プロジェクトコード　文字桁数チェック　16文字以上はエラー*/
            vc2CheckLength := LENGTH(TypColumnAry(23)) ;
            IF TypColumnAry(23) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_15 THEN
                    -- 桁数以内で設定してください。
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1751)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_PJ_CD
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
             END IF;

            /*セグメント1　文字桁数チェック　51文字以上はエラー*/
            vc2CheckLength := LENGTH(TypColumnAry(24)) ;
            IF TypColumnAry(24) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_50 THEN
                    -- 桁数以内で設定してください。
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1752)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_SEG_CONTENTS1
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
             END IF;

            /*セグメント2　文字桁数チェック　51文字以上はエラー*/
            vc2CheckLength := LENGTH(TypColumnAry(25)) ;
            IF TypColumnAry(25) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_50 THEN
                    -- 桁数以内で設定してください。
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1753)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_SEG_CONTENTS2
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
             END IF;

            /*セグメント3　文字桁数チェック　51文字以上はエラー*/
            vc2CheckLength := LENGTH(TypColumnAry(26)) ;
            IF TypColumnAry(26) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_50 THEN
                    -- 桁数以内で設定してください。
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1754)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_SEG_CONTENTS3
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
             END IF;

            /*セグメント4　文字桁数チェック　51文字以上はエラー*/
            vc2CheckLength := LENGTH(TypColumnAry(27)) ;
            IF TypColumnAry(27) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_50 THEN
                    -- 桁数以内で設定してください。
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1755)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_SEG_CONTENTS4
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

            /*取引先コード 禁則文字チェック 「%」、「_」、「\」が含まれている場合はエラー*/
            IF TypColumnAry(5) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(5)) THEN
                    NULL;
                ELSE
                    --禁則文字（「%」、「_」、「\」）が含まれています。
                    vc2Aps          := APS_ERR_CSV_DATA_ILLEGAL;
                    vc2ApsComment   := SUBSTR('(SBM1741)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_VEND_CD
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

            /*受入場所 禁則文字チェック 「%」、「_」、「\」が含まれている場合はエラー*/
            IF TypColumnAry(8) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(8)) THEN
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

            /*備考 禁則文字チェック 「%」、「_」、「\」が含まれている場合はエラー*/
            IF TypColumnAry(9) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(9)) THEN
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
                                                                 || COL_PUCH_ODR_COMMENT
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*備品発注品目名 禁則文字チェック 「%」、「_」、「\」が含まれている場合はエラー*/
            IF TypColumnAry(11) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(11)) THEN
                    NULL;
                ELSE
                    --禁則文字（「%」、「_」、「\」）が含まれています。
                    vc2Aps          := APS_ERR_CSV_DATA_ILLEGAL;
                    vc2ApsComment   := SUBSTR('(SBM1747)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_NON_NO_ITEM_NAME
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*備品発注単位 禁則文字チェック 「%」、「_」、「\」が含まれている場合はエラー*/
            IF TypColumnAry(13) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(13)) THEN
                    NULL;
                ELSE
                    --禁則文字（「%」、「_」、「\」）が含まれています。
                    vc2Aps          := APS_ERR_CSV_DATA_ILLEGAL;
                    vc2ApsComment   := SUBSTR('(SBM1748)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_NON_NO_ITEM_PUCH_ODR_UNIT
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*科目コード 禁則文字チェック 「%」、「_」、「\」が含まれている場合はエラー*/
            IF TypColumnAry(21) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(21)) THEN
                    NULL;
                ELSE
                    --禁則文字（「%」、「_」、「\」）が含まれています。
                    vc2Aps          := APS_ERR_CSV_DATA_ILLEGAL;
                    vc2ApsComment   := SUBSTR('(SBM1749)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_ACCT_CD
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*負担部門コード 禁則文字チェック 「%」、「_」、「\」が含まれている場合はエラー*/
            IF TypColumnAry(22) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(22)) THEN
                    NULL;
                ELSE
                    --禁則文字（「%」、「_」、「\」）が含まれています。
                    vc2Aps          := APS_ERR_CSV_DATA_ILLEGAL;
                    vc2ApsComment   := SUBSTR('(SBM1750)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_DEPT_CD
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*プロジェクトコード 禁則文字チェック 「%」、「_」、「\」が含まれている場合はエラー*/
            IF TypColumnAry(23) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(23)) THEN
                    NULL;
                ELSE
                    --禁則文字（「%」、「_」、「\」）が含まれています。
                    vc2Aps          := APS_ERR_CSV_DATA_ILLEGAL;
                    vc2ApsComment   := SUBSTR('(SBM1751)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_PJ_CD
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*セグメント1 禁則文字チェック 「%」、「_」、「\」が含まれている場合はエラー*/
            IF TypColumnAry(24) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(24)) THEN
                    NULL;
                ELSE
                    --禁則文字（「%」、「_」、「\」）が含まれています。
                    vc2Aps          := APS_ERR_CSV_DATA_ILLEGAL;
                    vc2ApsComment   := SUBSTR('(SBM1752)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_SEG_CONTENTS1
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*セグメント2 禁則文字チェック 「%」、「_」、「\」が含まれている場合はエラー*/
            IF TypColumnAry(25) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(25)) THEN
                    NULL;
                ELSE
                    --禁則文字（「%」、「_」、「\」）が含まれています。
                    vc2Aps          := APS_ERR_CSV_DATA_ILLEGAL;
                    vc2ApsComment   := SUBSTR('(SBM1753)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_SEG_CONTENTS2
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*セグメント3 禁則文字チェック 「%」、「_」、「\」が含まれている場合はエラー*/
            IF TypColumnAry(26) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(26)) THEN
                    NULL;
                ELSE
                    --禁則文字（「%」、「_」、「\」）が含まれています。
                    vc2Aps          := APS_ERR_CSV_DATA_ILLEGAL;
                    vc2ApsComment   := SUBSTR('(SBM1754)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_SEG_CONTENTS3
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*セグメント4 禁則文字チェック 「%」、「_」、「\」が含まれている場合はエラー*/
            IF TypColumnAry(27) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(27)) THEN
                    NULL;
                ELSE
                    --禁則文字（「%」、「_」、「\」）が含まれています。
                    vc2Aps          := APS_ERR_CSV_DATA_ILLEGAL;
                    vc2ApsComment   := SUBSTR('(SBM1755)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_SEG_CONTENTS4
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*発注数  桁数チェック 整数が 15桁以上、または小数点以下5桁以上の場合エラー */
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
                    vc2ApsComment   := SUBSTR('(SBM1740)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_PUCH_ODR_QTY
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;


            /*単価  桁数チェック 整数が 15桁以上、または小数点以下5桁以上の場合エラー */
            vc2ToChar      :=0;
            vc2CheckNum    :=0;
            vc2CheckLength :=0;
            IF TypColumnAry(15) IS NOT NULL  THEN
                IF MOD(TypColumnAry(15),1) > 0 THEN
                   vc2ToChar :=TO_CHAR(TypColumnAry(15));
                   vc2CheckNum := SUBSTR(vc2ToChar,INSTR(vc2ToChar,'.')+1);
                   vc2CheckLength := LENGTH(vc2CheckNum) ;
                ELSE
                   vc2CheckLength :=0;
                END IF;

                IF TypColumnAry(15) < NUMBER_100000000000000 AND
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
            IF TypColumnAry(16) IS NOT NULL  THEN
                IF MOD(TypColumnAry(16),1) > 0 THEN
                   vc2ToChar :=TO_CHAR(TypColumnAry(16));
                   vc2CheckNum := SUBSTR(vc2ToChar,INSTR(vc2ToChar,'.')+1);
                   vc2CheckLength := LENGTH(vc2CheckNum) ;
                ELSE
                   vc2CheckLength :=0;
                END IF;

                IF TypColumnAry(16) < NUMBER_100000000000000 AND
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
            IF TypColumnAry(17) IS NOT NULL  THEN
                IF MOD(TypColumnAry(17),1) > 0 THEN
                   vc2ToChar :=TO_CHAR(TypColumnAry(17));
                   vc2CheckNum := SUBSTR(vc2ToChar,INSTR(vc2ToChar,'.')+1);
                   vc2CheckLength := LENGTH(vc2CheckNum) ;
                ELSE
                   vc2CheckLength :=0;
                END IF;

                IF TypColumnAry(17) < NUMBER_100000000000000 AND
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
            IF TypColumnAry(18) IS NOT NULL  THEN
                IF MOD(TypColumnAry(18),1) > 0 THEN
                   vc2ToChar :=TO_CHAR(TypColumnAry(18));
                   vc2CheckNum := SUBSTR(vc2ToChar,INSTR(vc2ToChar,'.')+1);
                   vc2CheckLength := LENGTH(vc2CheckNum) ;
                ELSE
                   vc2CheckLength :=0;
                END IF;

                IF TypColumnAry(18) < NUMBER_100000000000000 AND
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

            /*本体金額  桁数チェック 整数が 15桁以上、または小数点以下5桁以上の場合エラー */
            vc2ToChar      :=0;
            vc2CheckNum    :=0;
            vc2CheckLength :=0;
            IF TypColumnAry(19) IS NOT NULL  THEN
                IF MOD(TypColumnAry(19),1) > 0 THEN
                   vc2ToChar :=TO_CHAR(TypColumnAry(19));
                   vc2CheckNum := SUBSTR(vc2ToChar,INSTR(vc2ToChar,'.')+1);
                   vc2CheckLength := LENGTH(vc2CheckNum) ;
                ELSE
                   vc2CheckLength :=0;
                END IF;

                IF TypColumnAry(19) < NUMBER_100000000000000 AND
                   vc2CheckLength  < LENGTH_5 THEN
                   NULL;

                ELSE
                    -- 桁数以内で設定してください。
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1744)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_NET_AMOUNT
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*為替レート  桁数チェック 整数が 15桁以上、または小数点以下7桁以上の場合エラー */
            vc2ToChar      :=0;
            vc2CheckNum    :=0;
            vc2CheckLength :=0;
            IF TypColumnAry(20) IS NOT NULL  THEN
                IF MOD(TypColumnAry(20),1) > 0 THEN
                   vc2ToChar :=TO_CHAR(TypColumnAry(20));
                   vc2CheckNum := SUBSTR(vc2ToChar,INSTR(vc2ToChar,'.')+1);
                   vc2CheckLength := LENGTH(vc2CheckNum) ;
                ELSE
                   vc2CheckLength :=0;
                END IF;

                IF TypColumnAry(20) < NUMBER_100000000000000 AND
                   vc2CheckLength  < LENGTH_7 THEN
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


            /* 品目番号 備品発注フラグが備品以外、かつ品目番号がNULLの場合*/
            IF TypColumnAry(10) = TO_CHAR(NON_NO_ITEM_FLG_0)  THEN      -- 備品発注フラグが備品以外
                IF TypColumnAry(1) IS NULL THEN
                    -- 品目番号が未入力です。
                    vc2Aps          := APS_ERR_ITEM_CD1;
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

            /* 品目番号 備品発注フラグが備品、かつ品目番号と備品発注品目名がNULLの場合*/
            IF TypColumnAry(10) = TO_CHAR(NON_NO_ITEM_FLG_1)  THEN      -- 備品発注フラグが備品
                IF TypColumnAry(1) IS NULL AND
                   TypColumnAry(11) IS NULL THEN

                    -- 品目番号が未入力です。
                    vc2Aps          := APS_ERR_ITEM_CD1;
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


            /* 備品発注フラグ 備品発注フラグの値がコンボボックスデータに存在しない場合*/
            IF TypColumnAry(10) = TO_CHAR(NON_NO_ITEM_FLG_0) OR      -- 0:備品以外（通常仕入品）
               TypColumnAry(10) = TO_CHAR(NON_NO_ITEM_FLG_1) THEN    -- 1:備品発注
                NULL;
            ELSE
                -- 不正な値が設定されています。
                vc2Aps          := APS_ERR_NON_NO_ITEM_FLG1;
                vc2ApsComment   := SUBSTR('(SBM1742)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                             || numCsvReadCount
                                                             || LOGMSG_BRAKETE
                                                             || LOGMSG_SPACER
                                                             || LOGMSG_CSV_ERR_COLUMN
                                                             || LOGMSG_BRAKETS
                                                             || COL_NON_NO_ITEM_FLG
                                                             || LOGMSG_BRAKETE,
                                    1,256);
                RAISE excCSV_CHECK_ERR;
            END IF;

            /* 備品発注品目名 備品発注フラグが備品、かつ品目番号と備品発注品目名がNULLの場合*/
            IF TypColumnAry(10) = TO_CHAR(NON_NO_ITEM_FLG_1)  THEN      -- 備品発注フラグが備品
                IF TypColumnAry(1) IS NULL AND
                   TypColumnAry(11) IS NULL THEN

                    -- 備品発注品目名が未入力です。
                    vc2Aps          := APS_ERR_NON_NO_ITEM_NAME1;
                    vc2ApsComment   := SUBSTR('(SBM1747)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_NON_NO_ITEM_NAME
                                                                 || LOGMSG_BRAKETE,
                                    1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /* 備品発注製品区分  備品発注製品区分の値がコンボボックスデータに存在しない場合*/
            IF TypColumnAry(12) IS NOT NULL  THEN
                IF TypColumnAry(12) = TO_CHAR(NON_NO_ITEM_TYP_0) OR      -- 0：在庫管理をする
                   TypColumnAry(12) = TO_CHAR(NON_NO_ITEM_TYP_1) OR      -- 1：製品
                   TypColumnAry(12) = TO_CHAR(NON_NO_ITEM_TYP_2) OR      -- 2：半製品
                   TypColumnAry(12) = TO_CHAR(NON_NO_ITEM_TYP_3) OR      -- 3：部品
                   TypColumnAry(12) = TO_CHAR(NON_NO_ITEM_TYP_4) OR      -- 4：原材料
                   TypColumnAry(12) = TO_CHAR(NON_NO_ITEM_TYP_5) THEN    -- 5：その他
                    NULL;
                ELSE
                    -- 不正な値が設定されています。
                    vc2Aps          := APS_ERR_NON_NO_ITEM_TYP1;
                    vc2ApsComment   := SUBSTR('(SBM1743)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_NON_NO_ITEM_TYP
                                                                 || LOGMSG_BRAKETE,
                                        1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /* 備品発注製品区分 備品発注フラグが備品、かつ備品発注製品区分がNULLの場合*/
            IF TypColumnAry(10) = TO_CHAR(NON_NO_ITEM_FLG_1)  THEN      -- 備品発注フラグが備品
                IF TypColumnAry(12) IS NULL THEN

                    -- 備品発注製品区分が未入力です。
                    vc2Aps          := APS_ERR_NON_NO_ITEM_TYP2;
                    vc2ApsComment   := SUBSTR('(SBM1743)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_NON_NO_ITEM_TYP
                                                                 || LOGMSG_BRAKETE,
                                    1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /* 単価区分  単価がNULL以外時に単価区分がNULLの場合*/
            IF TypColumnAry(15) IS NOT NULL  THEN      -- 単価がnull以外
                IF TypColumnAry(14) IS NULL THEN       -- 単価区分がnull

                    -- 単価区分が未入力です。
                    vc2Aps          := APS_ERR_UNIT_COST_TYP1;
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

            /* 単価区分  単価区分の値がコンボボックスデータに存在しない場合*/
            IF TypColumnAry(14) IS NOT NULL  THEN
                IF TypColumnAry(14) = TO_CHAR(UNIT_COST_TYP_1) OR      -- 1：仮単価
                   TypColumnAry(14) = TO_CHAR(UNIT_COST_TYP_2) THEN    -- 2：正単価
                    NULL;
                ELSE
                    -- 不正な値が設定されています。
                    vc2Aps          := APS_ERR_UNIT_COST_TYP2;
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

            /* 加工費  単価がNULL以外時に加工費がNULLの場合*/
            IF TypColumnAry(15) IS NOT NULL  THEN      -- 単価がnull以外
                IF TypColumnAry(16) IS NULL THEN       -- 加工費がnull

                    --加工費が未入力です。
                    vc2Aps          := APS_ERR_PROCESSING_COST1;
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

            /* 材料費  単価がNULL以外時に材料費がNULLの場合*/
            IF TypColumnAry(15) IS NOT NULL  THEN      -- 単価がnull以外
                IF TypColumnAry(17) IS NULL THEN       -- 材料費がnull

                    --材料費が未入力です。
                    vc2Aps          := APS_ERR_MATERIAL_COST1;
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

            /* その他経費  単価がNULL以外時にその他経費がNULLの場合*/
            IF TypColumnAry(15) IS NOT NULL  THEN      -- 単価がnull以外
                IF TypColumnAry(18) IS NULL THEN       -- その他経費がnull

                    --その他経費が未入力です。
                    vc2Aps          := APS_ERR_OTHER_OVERHEADS1;
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

            /* 科目コード  備品発注フラグが「0:備品以外（通常仕入品）」時に科目コードが入力されている場合*/
            IF TypColumnAry(10) = TO_CHAR(NON_NO_ITEM_FLG_0)  THEN   -- 備品発注フラグが0:備品以外（通常仕入品）
                IF TypColumnAry(21) IS NOT NULL THEN                 -- 科目コードがnull以外

                    -- 備品購入時のみ入力可能です。
                    vc2Aps          := APS_ERR_NON_NO_ITEM_TYP3;
                    vc2ApsComment   := SUBSTR('(SBM1749)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_ACCT_CD
                                                                 || LOGMSG_BRAKETE,
                                    1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /* 負担部門コード  備品発注フラグが「0:備品以外（通常仕入品）」時に負担部門コードが入力されている場合*/
            IF TypColumnAry(10) = TO_CHAR(NON_NO_ITEM_FLG_0)  THEN   -- 備品発注フラグが0:備品以外（通常仕入品）
                IF TypColumnAry(22) IS NOT NULL THEN                 -- 負担部門コードがnull以外

                    -- 備品購入時のみ入力可能です。
                    vc2Aps          := APS_ERR_NON_NO_ITEM_TYP3;
                    vc2ApsComment   := SUBSTR('(SBM1750)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_DEPT_CD
                                                                 || LOGMSG_BRAKETE,
                                    1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /* プロジェクトコード  備品発注フラグが「0:備品以外（通常仕入品）」時にプロジェクトコードが入力されている場合*/
            IF TypColumnAry(10) = TO_CHAR(NON_NO_ITEM_FLG_0)  THEN   -- 備品発注フラグが0:備品以外（通常仕入品）
                IF TypColumnAry(23) IS NOT NULL THEN                 -- プロジェクトコードがnull以外

                    -- 備品購入時のみ入力可能です。
                    vc2Aps          := APS_ERR_NON_NO_ITEM_TYP3;
                    vc2ApsComment   := SUBSTR('(SBM1751)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_PJ_CD
                                                                 || LOGMSG_BRAKETE,
                                    1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /* セグメント1  備品発注フラグが「0:備品以外（通常仕入品）」時にセグメント1が入力されている場合*/
            IF TypColumnAry(10) = TO_CHAR(NON_NO_ITEM_FLG_0)  THEN   -- 備品発注フラグが0:備品以外（通常仕入品）
                IF TypColumnAry(24) IS NOT NULL THEN                 -- セグメント1がnull以外

                    -- 備品購入時のみ入力可能です。
                    vc2Aps          := APS_ERR_NON_NO_ITEM_TYP3;
                    vc2ApsComment   := SUBSTR('(SBM1752)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_SEG_CONTENTS1
                                                                 || LOGMSG_BRAKETE,
                                    1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /* セグメント2  備品発注フラグが「0:備品以外（通常仕入品）」時にセグメント2が入力されている場合*/
            IF TypColumnAry(10) = TO_CHAR(NON_NO_ITEM_FLG_0)  THEN   -- 備品発注フラグが0:備品以外（通常仕入品）
                IF TypColumnAry(25) IS NOT NULL THEN                 -- セグメント2がnull以外

                    -- 備品購入時のみ入力可能です。
                    vc2Aps          := APS_ERR_NON_NO_ITEM_TYP3;
                    vc2ApsComment   := SUBSTR('(SBM1753)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_SEG_CONTENTS2
                                                                 || LOGMSG_BRAKETE,
                                    1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /* セグメント3  備品発注フラグが「0:備品以外（通常仕入品）」時にセグメント3が入力されている場合*/
            IF TypColumnAry(10) = TO_CHAR(NON_NO_ITEM_FLG_0)  THEN   -- 備品発注フラグが0:備品以外（通常仕入品）
                IF TypColumnAry(26) IS NOT NULL THEN                 -- セグメント3がnull以外

                    -- 備品購入時のみ入力可能です。
                    vc2Aps          := APS_ERR_NON_NO_ITEM_TYP3;
                    vc2ApsComment   := SUBSTR('(SBM1754)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_SEG_CONTENTS3
                                                                 || LOGMSG_BRAKETE,
                                    1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /* セグメント4  備品発注フラグが「0:備品以外（通常仕入品）」時にセグメント4が入力されている場合*/
            IF TypColumnAry(10) = TO_CHAR(NON_NO_ITEM_FLG_0)  THEN   -- 備品発注フラグが0:備品以外（通常仕入品）
                IF TypColumnAry(27) IS NOT NULL THEN                 -- セグメント4がnull以外

                    -- 備品購入時のみ入力可能です。
                    vc2Aps          := APS_ERR_NON_NO_ITEM_TYP3;
                    vc2ApsComment   := SUBSTR('(SBM1755)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_SEG_CONTENTS4
                                                                 || LOGMSG_BRAKETE,
                                    1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            ---------------■CSV項目のチェックEnd■------------------

            /*発注計画取込管理番号の採番*/
            vc2PuchOdrTempCtlNo := SubFncGetPUCH_ODR_TEMP_CTL_NO;
                 /* [発注計画取込]　登録処理 */
            INSERT INTO T_PUCH_ODR_TEMP(
                  PUCH_ODR_TEMP_CTL_NO        --発注計画取込管理番号
                , ITEM_CD                     --品目番号
                , PUCH_ODR_DLV_DATE           --発注納期
                , PUCH_ODR_START_DATE         --発注予定日
                , PUCH_ODR_QTY                --発注数
                , VEND_CD                     --取引先コード
                , JOB_ODR_CD                  --製番
                , CONFIRM_DLV_DATE            --取引先回答納期
                , WH_CD                       --受入場所
                , PUCH_ODR_COMMENT            --備考
                , NON_NO_ITEM_FLG             --備品発注フラグ
                , NON_NO_ITEM_NAME            --備品発注品目名
                , NON_NO_ITEM_TYP             --備品発注製品区分
                , NON_NO_ITEM_PUCH_ODR_UNIT   --備品発注単位
                , UNIT_COST_TYP               --単価区分
                , UNIT_COST                   --単価
                , PROCESSING_COST             --加工費
                , MATERIAL_COST               --材料費
                , OTHER_OVERHEADS             --その他経費
                , NET_AMOUNT                  --本体金額
                , EXCH_RATE                   --為替レート
                , ACCT_CD                     --科目コード
                , DEPT_CD                     --負担部門コード
                , PJ_CD                       --プロジェクトコード
                , SEG_CONTENTS1               --セグメント1
                , SEG_CONTENTS2               --セグメント2
                , SEG_CONTENTS3               --セグメント3
                , SEG_CONTENTS4               --セグメント4
                  )VALUES(
                  vc2PuchOdrTempCtlNo         --採番した発注計画取込管理番号
                , TypColumnAry(1)             --品目番号
                , TypColumnAry(2)             --発注納期
                , TypColumnAry(3)             --発注予定日
                , TypColumnAry(4)             --発注数
                , TypColumnAry(5)             --取引先コード
                , TypColumnAry(6)             --製番
                , TypColumnAry(7)             --取引先回答納期
                , TypColumnAry(8)             --受入場所
                , TypColumnAry(9)             --備考
                , TypColumnAry(10)            --備品発注フラグ
                , TypColumnAry(11)            --備品発注品目名
                , TypColumnAry(12)            --備品発注製品区分
                , TypColumnAry(13)            --備品発注単位
                , TypColumnAry(14)            --単価区分
                , TypColumnAry(15)            --単価
                , TypColumnAry(16)            --加工費
                , TypColumnAry(17)            --材料費
                , TypColumnAry(18)            --その他経費
                , TypColumnAry(19)            --本体金額
                , TypColumnAry(20)            --為替レート
                , TypColumnAry(21)            --科目コード
                , TypColumnAry(22)            --負担部門コード
                , TypColumnAry(23)            --プロジェクトコード
                , TypColumnAry(24)            --セグメント1
                , TypColumnAry(25)            --セグメント2
                , TypColumnAry(26)            --セグメント3
                , TypColumnAry(27)            --セグメント4
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
        /* 発注計画取込 CSV処理件数表示 */
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
