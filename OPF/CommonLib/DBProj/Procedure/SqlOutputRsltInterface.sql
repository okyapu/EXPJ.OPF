CREATE OR REPLACE PROCEDURE SQLOUTPUTRSLTINTERFACE(
/*------------------------------------------------------------------------------
'
' SQL_NAME      : SQLOUTPUTRSLTINTERFACE
' Version       : 1.00.00
'
' �C������
' 2015.08.27 ����
'
' �@�\          : �o�������тb�r�u�捞����
'
'
' ������        : ��MetamorBase���ʁi�K�{�j
'                   pvc2LogMode                - (i)�k�n�f���[�h
'                   pvc2OutputMode             - (i)�o�̓��[�h
'                   pvc2OutputPath             - (i)�o�̓t�@�C���p�X
'                   pvc2OutputName             - (i)�o�̓t�@�C����
'                   pvc2UserId                 - (i)���[�U�h�c
'                   pvc2BusinessName           - (i)�Ɩ���
'                   pvc2PlantCd                - (i)�H��R�[�h
'                 ���v���O�����ŗL
'                   pnumCsvTakeTyp             - (i)�b�r�u�捞����
'                   pvc2CsvTakePath            - (i)�捞�t�@�C���p�X
'                   pvc2CsvBackupPath          - (i)�o�b�N�A�b�v�t�H���_�p�X
'                   pnumReturn                 - (o)���s���� (1:����I���A2:�x���I���A3:�ُ�I��)
'
'
' �@�\����      : CSV�t�@�C������o�������уf�[�^��ǂݍ���ŁA[�o�������ю捞]�ɓo�^����B
'
' ���l          :
'
------------------------------------------------------------------------------*/
    pvc2LogMode            IN  VARCHAR2    --�k�n�f���[�h
   ,pvc2OutputMode         IN  VARCHAR2    --�o�̓��[�h
   ,pvc2OutputPath         IN  VARCHAR2    --�o�̓t�@�C���p�X
   ,pvc2OutputName         IN  VARCHAR2    --�o�̓t�@�C����
   ,pvc2UserId             IN  VARCHAR2    --���[�U�h�c
   ,pvc2BusinessName       IN  VARCHAR2    --�Ɩ���
   ,pvc2PlantCd            IN  VARCHAR2    --�H��R�[�h
   ,pnumCsvTakeTyp         IN  NUMBER      --�b�r�u�捞����
   ,pvc2CsvTakePath        IN  VARCHAR2    --�捞�t�@�C���p�X
   ,pvc2CsvBackupPath      IN  VARCHAR2    --�o�b�N�A�b�v�t�H���_�p�X
   ,pnumReturn             OUT NUMBER      --��������
)
IS
    /* �J�[�\���̐錾 */
    --�y�p�����[�^�z
    CURSOR curSYS_PARAMETER(
        c_NAME         VARCHAR2
    ) IS
    SELECT  VALUE
    FROM    SYS_PARAMETER
    WHERE   NAME = c_NAME;

    --�y�Ɩ��^�p���z
    CURSOR curBUSINESS_OPR_DATE(
        c_PLANT_CD      VARCHAR2
    ) IS
    SELECT  BUSINESS_OPR_DATE
    FROM    SYS_DATE_CTRL
    WHERE   PLANT_CD = c_PLANT_CD;

    --�y�R���{�{�b�N�X�f�[�^�z
    CURSOR curSYS_TYPE_VALUE(
        c_VALUE     VARCHAR2
    ) IS
    SELECT  VALUE
    FROM    SYS_TYPE_VALUE
    WHERE   NAME = 'DEFECT_CAUSE_CD_INNER'
        AND VALUE = c_VALUE;

    /* ROWTYPE �̐錾 */
    RtpSYS_PARAMETER                curSYS_PARAMETER%ROWTYPE;       -- �y�p�����[�^�z
    RtpBUSINESS_OPR_DATE            curBUSINESS_OPR_DATE%ROWTYPE;   -- �y�Ɩ��^�p���z
    
    /* ���R�[�h�^�̐錾 */
    TYPE TYP_COLUMN_ARRY IS TABLE OF VARCHAR2(2048) INDEX BY BINARY_INTEGER;

    /* �萔�̐錾 */
    MY_SQL_NAME                         VARCHAR2(88)    := 'SQLOUTPUTRSLTINTERFACE';           --�o�k�^�r�p�k��
    STATUS_NORMAL                       NUMBER(1)       := 1;                                  --����I��
    STATUS_WARNING                      NUMBER(1)       := 2;                                  --�x���I��
    STATUS_ERROR                        NUMBER(1)       := 3;                                  --�ُ�I��
    CSV_TAKE_TYP_FIX                    NUMBER(1)       := 1;                                  --1�F�Œ�t�@�C���捞
    CSV_TAKE_TYP_DESINATED              NUMBER(1)       := 2;                                  --2�F�w��t�@�C���捞
    DATE_FORMAT                         VARCHAR2(72)    := 'YYYY/MM/DD HH24:MI';               -- ���t�ϊ����̃t�H�[�}�b�g
    PATH_DELIM                          VARCHAR2(4)     := '\';                                --�t�@�C���p�X��؂蕶��
    OUTPUT_RSLT_IF_CSV_PATH             VARCHAR2(184)   := 'OUTPUT_RSLT_IF_CSV_PATH';          --[�p�����[�^].���O �b�r�u�p�X
    CSV_CHAR_SET                        VARCHAR2(64)    := 'CSV_CHARACTERSET';                 --[�p�����[�^].���O �b�r�u�����R�[�h
    DEFAULT_CHAR_SET                    VARCHAR2(32)    := 'JA16SJIS';                         --S-JIS
    CSV_LINE_MAX                        INTEGER         := 2048;                               --�b�r�u�t�@�C���P�s����̍ő吔
    PATH_SLASH                          VARCHAR2(4)     := '/';                                --�t�@�C���p�X��؂蕶��
    CSV_DELIM                           VARCHAR2(4)     := ',';                                --�b�r�u���ڂ̋�؂蕶��
    LENGTH_2                            NUMBER(2)       := 2;                                  --������:=2
    LENGTH_25                           NUMBER(2)       := 25;                                 --������:=25
    LENGTH_40                           NUMBER(2)       := 40;                                 --������:=40
    LENGTH_80                           NUMBER(2)       := 80;                                 --������:=80
    LENGTH_5                            NUMBER(1)       := 5;                                  --������ :=5
    NUMBER_100000000000000              NUMBER(15)      := 100000000000000;                    --���l����:15��

    /* EXCEPTION �̐錾 */
    excERR_SKIP                         EXCEPTION;      --���s�s��
    excERR_MAST                         EXCEPTION;      --�J�[�\��OPEN����EXCEPTION
    excCSV_CHECK_ERR                    EXCEPTION;      --CSV�f�[�^�̃`�F�b�N�G���[

    /* MESSAGE �̐錾 */
    APS_BATCH_START                    VARCHAR2(28) := 'AD00242';                -- �o��������CSV�捞�������J�n���܂����B
    APS_BATCH_END                      VARCHAR2(28) := 'AD00247';                -- �o��������CSV�捞�������I�����܂����B
    APS_BATCH_EXP                      VARCHAR2(28) := 'AD00248';                -- �o��������CSV�捞�������ُ�I�����܂����B
    APS_ERR_CSVFILEPATH                VARCHAR2(28) := 'AD00243';                --�o��������CSV�p�X�̎擾�Ɏ��s���܂����B
    APS_ERR_BUSINESS_DATE              VARCHAR2(28) := 'AD60044';                --�Ɩ����t�̎擾�Ɏ��s���܂����B
    APS_ERR_CSVFILE                    VARCHAR2(28) := 'AD60005';                --�t�@�C���̏������ɃG���[���������܂����B
    APS_ERR_CSV_DATA_FORMAT            VARCHAR2(28) := 'AD60006';                --CSV�t�@�C�����s���ȃt�H�[�}�b�g�ł��B
    APS_DATA_PROCESSING                VARCHAR2(28) := 'AD60014';                --��������
    APS_ERR_CSV_NUMBER_FORMAT          VARCHAR2(28) := 'AD60007';                --CSV�t�@�C���Ő��l���ڂ��s���ȃt�H�[�}�b�g�ł��B
    APS_ERR_CSV_DATE_FORMAT            VARCHAR2(28) := 'AD60008';                --CSV�t�@�C���œ��t���ڂ��s���ȃt�H�[�}�b�g�ł��B
    APS_ERR_REQUIRED                   VARCHAR2(28) := 'AD60009';                --CSV�t�@�C���̕K�{���ڂɒl���ݒ肳��Ă��܂���B
    APS_ERR_NUMBER_MINUS               VARCHAR2(28) := 'AD60010';                --CSV�t�@�C���̐��l���ڂɃ}�C�i�X�l���ݒ肳��Ă��܂��B
    APS_ERR_CSV_DATA_DIGIT             VARCHAR2(28) := 'AA01501';                --�����ȓ��Őݒ肵�Ă��������B
    APS_ERR_CSV_DATA_ILLEGAL           VARCHAR2(28) := 'AA01524';                --�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B
    APS_ERR_CSV_COMBO_VALUE            VARCHAR2(28) := 'AA01504';                --�R���{�{�b�N�X�f�[�^�ɑ��݂��鐔�l���w�肵�Ă��������B
    APS_ERR_OPR_TIME_UNIT_TYP          VARCHAR2(28) := 'AD00226';                --��Ǝ��ԒP�ʋ敪���s���ł��B

    /* �ϐ��̐錾 WORK */
    vc2DBCharSet                VARCHAR2(100);                  --DB�̕����R�[�h
    vc2CSVCharSet               VARCHAR2(100);                  --CSV�t�@�C���̕����R�[�h
    UTL_FileHandle              UTL_FILE.FILE_TYPE;             --�t�@�C���n���h��
    UTL_FileCsvHandle           UTL_FILE.FILE_TYPE;             --��Ǝ���CSV�t�@�C���n���h��
    blnRet                      BOOLEAN;                        --BOOLEAN�^ �ԋp�l
    blnFileExists               BOOLEAN;                        --�t�@�C�����݃t���O
    numFileLength               NUMBER := 0;                    --�t�@�C������
    intFileSize                 BINARY_INTEGER;                 --�t�@�C���T�C�Y
    intIdx                      INTEGER;                        --���ڐ؂�o���p�J�E���^
    vc2CsvFile                  VARCHAR2(1024);                 --�o�����b�r�u�捞�t�@�C����
    vc2WorkBuffer               VARCHAR2(1024);                 --��Ɨp�o�b�t�@
    vc2CsvFilePath              VARCHAR2(1024);                 --�o�����b�r�u�捞�t�@�C���̊i�[�f�B���N�g��
    blnCsvDataCommit            BOOLEAN;                        --�o�������тb�r�u�捞�ɓo�^�����f�[�^�̃R�~�b�g�ۃt���O
    dtmBusinessOprDate          DATE;                           --�Ɩ��^�p���t
    numCsvReadCount             NUMBER(10) := 0;                --CSV �Ǎ�����
    numCsvInsertCount           NUMBER(10) := 0;                --CSV �o�^����
    vc2Comment                  VARCHAR2(1024);                 --���b�Z�[�W�p�R�����g�쐬��Ɨ̈�
    vc2Aps                      VARCHAR2(28);                   --���b�Z�[�W�p
    vc2ApsComment               VARCHAR2(1024);                 --���b�Z�[�W�p�R�����g�쐬��Ɨ̈�
    numMsglogCount              NUMBER := 0;                    -- ���b�Z�[�W���O��
    vc2NewFileName              VARCHAR2(1000) := '';           --�t�@�C�����l�[���p
    vc2ReadBuffer               VARCHAR2(2048);                 --�ǂݍ��ݗp�o�b�t�@
    CSV_COLUMN_COUNT            INTEGER := 19;                  --�b�r�u�t�@�C���P�s����̍��ڐ�
    intColumnMax                INTEGER;                        --�J�������m�F�p
    intColumnOvr                INTEGER;                        --�J�������m�F�p
    TypColumnAry                TYP_COLUMN_ARRY;                --���ڐ؂�o���p�o�b�t�@
    vc2CheckLength              VARCHAR2(2048);                 --���������`�F�b�N�p
    vc2ToChar                   VARCHAR2(100);                  --���l���ڂ̕�����ϊ��i���l�����`�F�b�N�p�j
    vc2CheckNum                 VARCHAR2(100);                  --�����_�ȉ��̐��l�؎�i���l�����`�F�b�N�p�j
    vc2Value                    VARCHAR2(100);                  --�s�Ǘ��R�R�[�h
    vc2OutputRsltTempCtlNo      VARCHAR2(100);                  --�o�������ю��ю捞�Ǘ��ԍ�

    /* LOG �̐錾 */
    LOGMSG_NAME                         VARCHAR2(20)    := '���O=';
    LOGMSG_START                        VARCHAR2(20)    := 'START';                  -- ���O�p���\�b�h�J�n�錾
    LOGMSG_END                          VARCHAR2(12)    := 'End';                    -- ���O�p���\�b�h�I���錾
    LOGMSG_BRAKETS                      VARCHAR2(4)     := '[';
    LOGMSG_BRAKETE                      VARCHAR2(4)     := ']';
    LOGMSG_SPACER                       VARCHAR2(4)     := ' ';
    LOGMSG_COLUMN_CNT                   VARCHAR2(36)    := 'CSV���ڐ�';
    LOGMSG_CSV_ERR_COLUMN               VARCHAR2(88)    := '�G���[���ږ�=';
    LOGMSG_PLANT_CD                     VARCHAR2(44)    := '�H��R�[�h=';
    LOGMSG_TAKE_FILENAME                VARCHAR2(100)   := '(SBM1328)�捞�t�@�C�����F';
    LOGMSG_START_PGNM                   VARCHAR2(184)   := '(SBM1657)�o��������CSV�捞�������J�n���܂����B';
    LOGMSG_END_PGNM                     VARCHAR2(184)   := '(SBM1658)�o��������CSV�捞�������I�����܂����B';
    LOGMSG_EXP_PGNM                     VARCHAR2(184)   := '(SBM1659)�o��������CSV�捞�������ُ�I�����܂����B';
    LOGMSG_CSVFILE                      VARCHAR2(120)   := '(SBM1660)�o�������уt�@�C����=';
    LOGMSG_LINECNT                      VARCHAR2(64)    := 'CSV�s�ԍ�=';
    COL_PLANT_CD                        VARCHAR2(40)    := '�H��R�[�h';
    COL_ITEM_CD                         VARCHAR2(32)    := '�i�ڔԍ�';
    COL_WS_CD                           VARCHAR2(48)    := '��Ƌ�R�[�h';
    COL_OPR_DATE                        VARCHAR2(24)    := '��Ɠ�';
    COL_WH_CD                           VARCHAR2(48)    := '�ۊǋ�R�[�h';
    COL_ACPT_QTY                        VARCHAR2(24)    := '�Ǖi��';
    COL_DEFECT_QTY                      VARCHAR2(24)    := '�s�ǐ�';
    COL_DEFECT_CAUSE_CD                 VARCHAR2(56)    := '�s�Ǘ��R�R�[�h';
    COL_DEFECT_COMMENT                  VARCHAR2(32)    := '�s�ǔ��l';
    COL_OUTPUT_RSLT_PERSON              VARCHAR2(64)    := '��ƒS���҃R�[�h';
    COL_OPR_TIME_UNIT_TYP               VARCHAR2(64)    := '��Ǝ��ԒP�ʋ敪';
    COL_OPR_TIME                        VARCHAR2(32)    := '��Ǝ���';
    COL_VEND_LOT_NO                     VARCHAR2(56)    := '�������b�g�ԍ�';
    COL_LOT_NO                          VARCHAR2(56)    := '�݌Ƀ��b�g�ԍ�';
    COL_PRE_ARRANGEMENT_TIME            VARCHAR2(40)    := '�O�i�掞��';
    COL_POST_ARRANGEMENT_TIME           VARCHAR2(40)    := '��i�掞��';
    COL_CESSATION_TIME                  VARCHAR2(32)    := '��~����';
    COL_CESSATION_CAUSE                 VARCHAR2(32)    := '��~���R';
    COL_OUTPUT_RSLT_COMMENT             VARCHAR2(16)    := '���l';

    -- �Ɩ����b�Z�[�W
    TYPE TYP_MSG_LOG_TYPE IS RECORD (
        fncName       VARCHAR2(88)          -- �Ɩ���
       ,errCd         VARCHAR2(28)          -- �I�[�_�R�[�h
       ,errMsg        VARCHAR2(4096)        -- �G���[���b�Z�[�W
    );
    TYPE MSGLOG_TYPE IS TABLE OF TYP_MSG_LOG_TYPE INDEX BY BINARY_INTEGER;
    msgLogData       MSGLOG_TYPE;

    /*------------------------------------------------------------------------------
    ' �@�\      : DB�̕����R�[�h�̎擾
    '
    ' �߂�l    : DB�̕����R�[�h
    '
    ' ������    :
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncGetDBCharSet RETURN VARCHAR2
    IS
        vc2Buffer           VARCHAR2(100);
    BEGIN
        SELECT VALUE INTO vc2Buffer
            FROM NLS_DATABASE_PARAMETERS
            WHERE PARAMETER = 'NLS_CHARACTERSET';

        RETURN vc2Buffer;
    END;

    /*------------------------------------------------------------------------------
    ' �@�\      : �b�r�u�f�[�^�i�P�s�j����A�w��̍��ڂ�؂�o��
    '
    ' �߂�l    :�؂�o�����A����
    '
    ' ������    : �����ʁi�K�{�j
    '             pvc2Buffer        - (i)�b�r�u�f�[�^�i�P�s�j
    '             pintColumnNo      - (i)�擾���鍀�ځi�P�j
    '             pvc2Delim         - (i)��؂蕶��
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
    ' �@�\      : ���l���ڂ̃`�F�b�N
    '
    ' �߂�l    : TRUE:����AFALSE:�ُ�
    '
    ' ������    : �����ʁi�K�{�j
    '             pvc2Number            - (i)�`�F�b�N���鍀��
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
    ' �@�\      : ���t���ڂ̃`�F�b�N
    '
    ' �߂�l    : TRUE:����AFALSE:�ُ�
    '
    ' ������    : �����ʁi�K�{�j
    '             pvc2Date          - (i)�`�F�b�N���鍀��
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
    ' �@�\      : �֑������̃`�F�b�N
    '
    ' �߂�l    : TRUE:�֑������Ȃ��AFALSE:�֑���������
    '
    ' ������    : �����ʁi�K�{�j
    '             pvc2Varchar2          - (i)�`�F�b�N���鍀��
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncCheck_vc2(pvc2Varchar2 VARCHAR2) RETURN BOOLEAN
    IS
        numLength     NUMBER;               --�`�F�b�N�Ώە�����
        numCnt        NUMBER;               --�`�F�b�N�Ώە����ʒu
        vc2Char       VARCHAR2(10);           --�`�F�b�N�ΏۂP����
        blnCheck      Boolean    :=TRUE;    --TRUE:�֑������Ȃ��AFALSE:�֑���������
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

    /*------------------------------------------------------------------------------
    ' �@�\      : �u�o�������ю捞�Ǘ��ԍ��v���̔Ԃ���
    '
    ' �߂�l    : ���������u�o�������ю捞�Ǘ��ԍ��v
    '
    ' ������    :
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncGetOUTPUT_TEMP_CTL_NO RETURN VARCHAR2
    IS
        numNumber           NUMBER(10);
        TypSEQ_VAL          T_OUTPUT_RSLT_TEMP.OUTPUT_RSLT_TEMP_CTL_NO%TYPE;
    BEGIN
        SELECT SEQ_OUTPUT.NEXTVAL INTO numNumber FROM DUAL;

        TypSEQ_VAL := LPAD(TO_CHAR(numNumber), 10, '0');
        TypSEQ_VAL := 'OUTPUT' || TypSEQ_VAL;

        RETURN TypSEQ_VAL;
    END;

--<���C������ >-----------------------------------------------------
BEGIN
    /*�o�������тb�r�u�捞�ɓo�^�����f�[�^�̃R�~�b�g�ۃt���O = TRUE */
    blnCsvDataCommit := TRUE;

    /* LogFile �� OPEN */
    blnRet :=  FNCLOGOPEN(pvc2OutputPath, pvc2OutputName,pvc2PlantCd, pvc2OutputMode, UTL_FileHandle);

    /* TraceLog�̏o��(Start)�������s�� */
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, LOGMSG_START);

    /* �Ɩ��J�n���b�Z�[�W�̏o�� */
    msgLogData.DELETE;
    msgLogData(1).fncName:= MY_SQL_NAME;
    msgLogData(1).errCd  := APS_BATCH_START;

    -- �����́uCSV�捞�����v��2�F�w��t�@�C���捞�̏ꍇ
    IF pnumCsvTakeTyp = CSV_TAKE_TYP_DESINATED THEN
        -- �ȉ��̏ڍ׏����o�͂��鎖
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

    /* �e�J�E���^���N���A���� */
    numCsvReadCount     := 0;       --CSV �Ǎ�����
    numCsvInsertCount   := 0;       --CSV �o�^����

    vc2Aps          := NULL;
    vc2ApsComment   := NULL;
    vc2Comment      := NULL;
    blnFileExists   := FALSE;

    /* �c�a�̕����R�[�h�擾 */
    vc2DBCharSet := SubFncGetDBCharSet;
    
    /* �b�r�u�p�X�̎擾 */
    -- �����́uCSV�捞�����v��1�F�Œ�t�@�C���捞�̏ꍇ
    IF pnumCsvTakeTyp = CSV_TAKE_TYP_FIX THEN
        BEGIN  -- �J�[�\��OPEN
            OPEN curSYS_PARAMETER(OUTPUT_RSLT_IF_CSV_PATH);
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment  := SUBSTR(' 1:OPEN curSYS_PARAMETER'    ||
                                      ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                      ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE excERR_SKIP;
        END;  -- �J�[�\��OPEN

        BEGIN -- �J�[�\��FETCH
            FETCH curSYS_PARAMETER INTO RtpSYS_PARAMETER;
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment  := SUBSTR(' 2:FETCH curSYS_PARAMETER'   ||
                                      ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                      ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE excERR_SKIP;
        END;  -- �J�[�\��FETCH

        IF curSYS_PARAMETER%NOTFOUND THEN

            CLOSE curSYS_PARAMETER;

            -- �o�������тb�r�u�p�X�̎擾�Ɏ��s���܂���
            vc2Aps        := APS_ERR_CSVFILEPATH;
            vc2ApsComment := SUBSTR('(SBM1646)'|| LOGMSG_NAME   ||
                                                     LOGMSG_BRAKETS           ||
                                                               OUTPUT_RSLT_IF_CSV_PATH   ||
                                                               LOGMSG_BRAKETE,
                               1,256);
            RAISE excERR_SKIP;
        END IF;

        CLOSE curSYS_PARAMETER;

        vc2CsvFilePath := RtpSYS_PARAMETER.VALUE;
    ELSE
        vc2CsvFilePath := pvc2CsvTakePath;
    END IF;

    -- �t���p�X����t�@�C�����̐؂�o��
    intIdx := 1;
    LOOP
        vc2WorkBuffer := SubFncSplit(vc2CsvFilePath, intIdx, PATH_DELIM);
        IF vc2WorkBuffer IS NULL THEN
            EXIT;
        END IF;

        vc2CsvFile := vc2WorkBuffer;
        intIdx := intIdx + 1;
    END LOOP;

    -- �t�@�C���������̍폜
    IF intIdx = 1 THEN
        vc2CsvFilePath := '';
    ELSE
        vc2CsvFilePath := SUBSTR(vc2CsvFilePath, 1, LENGTH(vc2CsvFilePath)
                                                  - LENGTH(vc2CsvFile)
                                                  - LENGTH(PATH_DELIM));
    END IF;

    /* CSV���l�[�����쐬 */
    vc2NewFileName := SUBSTR(vc2CsvFile,1,INSTR(vc2CsvFile,'.')-1) || TO_CHAR(SYSDATE,'YYYYMMDDHH24MISS') || '.csv';

    /* �b�r�u�t�@�C���̕����R�[�h�̎擾 */
    BEGIN -- �J�[�\��OPEN
        OPEN curSYS_PARAMETER(CSV_CHAR_SET);
    EXCEPTION
        WHEN OTHERS THEN
            vc2Comment  := SUBSTR(' 3:OPEN curSYS_PARAMETER'    ||
                                  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
            RAISE excERR_SKIP;
    END;  -- �J�[�\��OPEN

    BEGIN -- �J�[�\��FETCH
        FETCH curSYS_PARAMETER INTO RtpSYS_PARAMETER;
    EXCEPTION
        WHEN OTHERS THEN
            vc2Comment  := SUBSTR(' 4:FETCH curSYS_PARAMETER'   ||
                                  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
            RAISE excERR_SKIP;
    END;  -- �J�[�\��FETCH

    IF curSYS_PARAMETER%NOTFOUND THEN
        -- S-JIS
        vc2CsvCharSet := DEFAULT_CHAR_SET;
    ELSE
        -- �w�蕶���R�[�h
        vc2CsvCharSet := RtpSYS_PARAMETER.VALUE;
    END IF;

    CLOSE curSYS_PARAMETER;

    /* �Ɩ��^�p���̎擾 */
    BEGIN -- �J�[�\��OPEN
        OPEN curBUSINESS_OPR_DATE(pvc2PlantCd);
    EXCEPTION
        WHEN OTHERS THEN
            vc2Comment  := SUBSTR(' 5:OPEN curBUSINESS_OPR_DATE'         ||
                                  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
            RAISE excERR_SKIP;
    END;  -- �J�[�\��OPEN

    BEGIN -- �J�[�\��FETCH
        FETCH curBUSINESS_OPR_DATE INTO RtpBUSINESS_OPR_DATE;
    EXCEPTION
        WHEN OTHERS THEN
            vc2Comment  := SUBSTR(' 6:FETCH curBUSINESS_OPR_DATE'        ||
                                  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
            RAISE excERR_SKIP;
    END;  -- �J�[�\��FETCH

    IF curBUSINESS_OPR_DATE%NOTFOUND THEN

        CLOSE curBUSINESS_OPR_DATE;

        -- �Ɩ����t�̎擾�Ɏ��s���܂���
        vc2Aps        := APS_ERR_BUSINESS_DATE;
        vc2ApsComment := SUBSTR('(SBM0399)'|| LOGMSG_PLANT_CD  ||  LOGMSG_BRAKETS       ||
                                                                  pvc2PlantCd          ||
                                                                  LOGMSG_BRAKETE,
                            1,256);
        RAISE excERR_SKIP;
    END IF;

    CLOSE curBUSINESS_OPR_DATE;
    dtmBusinessOprDate := RtpBUSINESS_OPR_DATE.BUSINESS_OPR_DATE;

    /* �o�������тb�r�u�t�@�C���̎捞���� */
    /* �t�@�C���I�[�v�� */
    BEGIN
    UTL_FileCsvHandle := UTL_FILE.FOPEN(vc2CsvFilePath, vc2CsvFile, 'R', CSV_LINE_MAX);
    EXCEPTION
    WHEN OTHERS THEN
        -- �t�@�C���̏������ɃG���[���������܂���
        vc2Aps          := APS_ERR_CSVFILE;
        vc2ApsComment   := SUBSTR(LOGMSG_CSVFILE     || LOGMSG_BRAKETS
                                                     || vc2CsvFilePath || PATH_DELIM || vc2CsvFile
                                                     || LOGMSG_BRAKETE,
                        1,256);
        RAISE excERR_MAST;
    END;

    numMsglogCount := NVL(msgLogData.LAST, 0);

    /* �b�r�u�t�@�C�����A[�o�������ю捞]�Ɏ捞�J�n */
    LOOP
        vc2Aps          := NULL;
        vc2ApsComment   := NULL;
        /* �b�r�u�t�@�C�����A�P�s�ǂݍ��� */
        BEGIN
            UTL_FILE.GET_LINE(UTL_FileCsvHandle, vc2ReadBuffer);
            vc2ReadBuffer := CONVERT(vc2ReadBuffer, vc2DBCharSet, vc2CsvCharSet);
        EXCEPTION
            -- CSV�f�[�^�I��
            WHEN NO_DATA_FOUND THEN
                EXIT;
            -- ���̑��̗�O
            WHEN OTHERS THEN
                -- �t�@�C���̏������ɃG���[���������܂���
                vc2Aps          := APS_ERR_CSVFILE;
                vc2ApsComment   := SUBSTR('(SBM0381)'||LOGMSG_LINECNT    || LOGMSG_BRAKETS
                                                            || TO_CHAR(numCsvReadCount + 1)
                                                            || LOGMSG_BRAKETE,
                                1,256);
                RAISE excERR_MAST;
        END;

        /* CSV �Ǎ����� �J�E���g�A�b�v */
        numCsvReadCount := numCsvReadCount + 1;
        
        BEGIN
            /* �P�s����̍��ڐ��̃`�F�b�N */
            intColumnMax := NVL(INSTR(vc2ReadBuffer, CSV_DELIM, 1, CSV_COLUMN_COUNT - 1), 0);
            intColumnOvr := NVL(INSTR(vc2ReadBuffer, CSV_DELIM, 1, CSV_COLUMN_COUNT),     0);
            IF intColumnMax <> 0 AND intColumnOvr = 0 THEN
                NULL;
            ELSE
                -- �b�r�u�t�@�C�����s���ȃt�H�[�}�b�g�ł�
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

            /* ���ڂ̐؂�o�� */
            FOR intIdx IN 1..CSV_COLUMN_COUNT LOOP
                TypColumnAry(intIdx) := SubFncSplit(vc2ReadBuffer, intIdx, CSV_DELIM);
            END LOOP;

            ---------------��CSV���ڂ̃`�F�b�NStart��------------------
            /* �H��R�[�h �K�{���ڃ`�F�b�N */
            IF TypColumnAry(1) IS NULL THEN
                -- CSV�t�@�C���̕K�{���ڂɒl���ݒ肳��Ă��܂���B
                vc2Aps          := APS_ERR_REQUIRED;
               vc2ApsComment   := SUBSTR('(SBM1734)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                            || numCsvReadCount
                                                            || LOGMSG_BRAKETE
                                                            || LOGMSG_SPACER
                                                            || LOGMSG_CSV_ERR_COLUMN
                                                            || LOGMSG_BRAKETS
                                                            || COL_PLANT_CD
                                                            || LOGMSG_BRAKETE,
                                1,256);
                RAISE excCSV_CHECK_ERR;
            END IF;

            /* �i�ڔԍ� �K�{���ڃ`�F�b�N */
            IF TypColumnAry(2) IS NULL THEN
                -- CSV�t�@�C���̕K�{���ڂɒl���ݒ肳��Ă��܂���B
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

            /* ��Ƌ�R�[�h �K�{���ڃ`�F�b�N */
            IF TypColumnAry(3) IS NULL THEN
                -- CSV�t�@�C���̕K�{���ڂɒl���ݒ肳��Ă��܂���B
                vc2Aps          := APS_ERR_REQUIRED;
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

            /* ��Ɠ� �K�{���ڃ`�F�b�N */
            IF TypColumnAry(4) IS NULL THEN
                -- CSV�t�@�C���̕K�{���ڂɒl���ݒ肳��Ă��܂���B
                vc2Aps          := APS_ERR_REQUIRED;
               vc2ApsComment   := SUBSTR('(SBM1717)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                            || numCsvReadCount
                                                            || LOGMSG_BRAKETE
                                                            || LOGMSG_SPACER
                                                            || LOGMSG_CSV_ERR_COLUMN
                                                            || LOGMSG_BRAKETS
                                                            || COL_OPR_DATE
                                                            || LOGMSG_BRAKETE,
                                1,256);
                RAISE excCSV_CHECK_ERR;
            END IF;

            /* �Ǖi�� �K�{���ڃ`�F�b�N */
            IF TypColumnAry(6) IS NULL THEN
                -- CSV�t�@�C���̕K�{���ڂɒl���ݒ肳��Ă��܂���B
                vc2Aps          := APS_ERR_REQUIRED;
               vc2ApsComment   := SUBSTR('(SBM1704)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
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

            /* �Ǖi�� ���l�`�F�b�N */
            IF SubFncCheckNumber(TypColumnAry(6)) THEN
                 NULL;
            ELSE
                    --�b�r�u�t�@�C���Ő��l���ڂ��s���ȃt�H�[�}�b�g�ł�
                    vc2Aps          := APS_ERR_CSV_NUMBER_FORMAT;
                    vc2ApsComment   := SUBSTR('(SBM1704)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
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

            /* �s�ǐ� ���l�`�F�b�N */
            IF TypColumnAry(7) IS NOT NULL THEN
                IF SubFncCheckNumber(TypColumnAry(7)) THEN
                     NULL;
                ELSE
                        --�b�r�u�t�@�C���Ő��l���ڂ��s���ȃt�H�[�}�b�g�ł�
                        vc2Aps          := APS_ERR_CSV_NUMBER_FORMAT;
                        vc2ApsComment   := SUBSTR('(SBM1705)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                     || numCsvReadCount
                                                                     || LOGMSG_BRAKETE
                                                                     || LOGMSG_SPACER
                                                                     || LOGMSG_CSV_ERR_COLUMN
                                                                     || LOGMSG_BRAKETS
                                                                     || COL_DEFECT_QTY
                                                                     || LOGMSG_BRAKETE,
                                    1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /* �s�Ǘ��R�R�[�h ���l�`�F�b�N*/
            IF TypColumnAry(8) IS NOT NULL THEN
                IF SubFncCheckNumber(TypColumnAry(8)) THEN
                     NULL;
                ELSE
                        --�b�r�u�t�@�C���Ő��l���ڂ��s���ȃt�H�[�}�b�g�ł�
                        vc2Aps          := APS_ERR_CSV_NUMBER_FORMAT;
                        vc2ApsComment   := SUBSTR('(SBM1735)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                     || numCsvReadCount
                                                                     || LOGMSG_BRAKETE
                                                                     || LOGMSG_SPACER
                                                                     || LOGMSG_CSV_ERR_COLUMN
                                                                     || LOGMSG_BRAKETS
                                                                     || COL_DEFECT_CAUSE_CD
                                                                     || LOGMSG_BRAKETE,
                                    1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /* ��Ǝ��ԒP�ʋ敪 ���l�`�F�b�N*/
            IF TypColumnAry(11) IS NOT NULL THEN
                IF SubFncCheckNumber(TypColumnAry(11)) THEN
                     NULL;
                ELSE
                        --�b�r�u�t�@�C���Ő��l���ڂ��s���ȃt�H�[�}�b�g�ł�
                        vc2Aps          := APS_ERR_CSV_NUMBER_FORMAT;
                        vc2ApsComment   := SUBSTR('(SBM1706)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                     || numCsvReadCount
                                                                     || LOGMSG_BRAKETE
                                                                     || LOGMSG_SPACER
                                                                     || LOGMSG_CSV_ERR_COLUMN
                                                                     || LOGMSG_BRAKETS
                                                                     || COL_OPR_TIME_UNIT_TYP
                                                                     || LOGMSG_BRAKETE,
                                    1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /* ��Ǝ��� ���l�`�F�b�N*/
            IF TypColumnAry(12) IS NOT NULL THEN
                IF SubFncCheckNumber(TypColumnAry(12)) THEN
                     NULL;
                ELSE
                        --�b�r�u�t�@�C���Ő��l���ڂ��s���ȃt�H�[�}�b�g�ł�
                        vc2Aps          := APS_ERR_CSV_NUMBER_FORMAT;
                        vc2ApsComment   := SUBSTR('(SBM1709)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                     || numCsvReadCount
                                                                     || LOGMSG_BRAKETE
                                                                     || LOGMSG_SPACER
                                                                     || LOGMSG_CSV_ERR_COLUMN
                                                                     || LOGMSG_BRAKETS
                                                                     || COL_OPR_TIME
                                                                     || LOGMSG_BRAKETE,
                                    1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /* �O�i�掞�� ���l�`�F�b�N*/
            IF TypColumnAry(15) IS NOT NULL THEN
                IF SubFncCheckNumber(TypColumnAry(15)) THEN
                     NULL;
                ELSE
                        --�b�r�u�t�@�C���Ő��l���ڂ��s���ȃt�H�[�}�b�g�ł�
                        vc2Aps          := APS_ERR_CSV_NUMBER_FORMAT;
                        vc2ApsComment   := SUBSTR('(SBM1707)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                     || numCsvReadCount
                                                                     || LOGMSG_BRAKETE
                                                                     || LOGMSG_SPACER
                                                                     || LOGMSG_CSV_ERR_COLUMN
                                                                     || LOGMSG_BRAKETS
                                                                     || COL_PRE_ARRANGEMENT_TIME
                                                                     || LOGMSG_BRAKETE,
                                    1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /* ��i�掞�� ���l�`�F�b�N*/
            IF TypColumnAry(16) IS NOT NULL THEN
               IF SubFncCheckNumber(TypColumnAry(16)) THEN
                     NULL;
                ELSE
                        --�b�r�u�t�@�C���Ő��l���ڂ��s���ȃt�H�[�}�b�g�ł�
                        vc2Aps          := APS_ERR_CSV_NUMBER_FORMAT;
                        vc2ApsComment   := SUBSTR('(SBM1708)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                     || numCsvReadCount
                                                                     || LOGMSG_BRAKETE
                                                                     || LOGMSG_SPACER
                                                                     || LOGMSG_CSV_ERR_COLUMN
                                                                     || LOGMSG_BRAKETS
                                                                     || COL_POST_ARRANGEMENT_TIME
                                                                     || LOGMSG_BRAKETE,
                                    1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /* ��~���� ���l�`�F�b�N*/
            IF TypColumnAry(17) IS NOT NULL THEN
                IF SubFncCheckNumber(TypColumnAry(17)) THEN
                     NULL;
                ELSE
                        --�b�r�u�t�@�C���Ő��l���ڂ��s���ȃt�H�[�}�b�g�ł�
                        vc2Aps          := APS_ERR_CSV_NUMBER_FORMAT;
                        vc2ApsComment   := SUBSTR('(SBM1710)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                     || numCsvReadCount
                                                                     || LOGMSG_BRAKETE
                                                                     || LOGMSG_SPACER
                                                                     || LOGMSG_CSV_ERR_COLUMN
                                                                     || LOGMSG_BRAKETS
                                                                     || COL_CESSATION_TIME
                                                                     || LOGMSG_BRAKETE,
                                    1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /* �Ǖi�� �}�C�i�X�`�F�b�N*/
            IF TO_NUMBER(TypColumnAry(6)) < 0 THEN
                -- CSV�t�@�C���̐��l���ڂɃ}�C�i�X�l���ݒ肳��Ă��܂��B
                vc2Aps          := APS_ERR_NUMBER_MINUS;
                vc2ApsComment   := SUBSTR('(SBM1704)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
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

            /* �s�ǐ� �}�C�i�X�`�F�b�N*/
            IF TypColumnAry(7) IS NOT NULL THEN
                IF TO_NUMBER(TypColumnAry(7)) < 0 THEN
                    -- CSV�t�@�C���̐��l���ڂɃ}�C�i�X�l���ݒ肳��Ă��܂��B
                    vc2Aps          := APS_ERR_NUMBER_MINUS;
                    vc2ApsComment   := SUBSTR('(SBM1705)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_DEFECT_QTY
                                                                 || LOGMSG_BRAKETE,
                                    1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /* ��Ǝ��� �}�C�i�X�`�F�b�N*/
            IF TypColumnAry(12) IS NOT NULL THEN
                IF TO_NUMBER(TypColumnAry(12)) < 0 THEN
                    -- CSV�t�@�C���̐��l���ڂɃ}�C�i�X�l���ݒ肳��Ă��܂��B
                    vc2Aps          := APS_ERR_NUMBER_MINUS;
                    vc2ApsComment   := SUBSTR('(SBM1709)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_OPR_TIME
                                                                 || LOGMSG_BRAKETE,
                                    1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /* �O�i�掞�� �}�C�i�X�`�F�b�N*/
            IF TypColumnAry(15) IS NOT NULL THEN
                IF TO_NUMBER(TypColumnAry(15)) < 0 THEN
                    -- CSV�t�@�C���̐��l���ڂɃ}�C�i�X�l���ݒ肳��Ă��܂��B
                    vc2Aps          := APS_ERR_NUMBER_MINUS;
                    vc2ApsComment   := SUBSTR('(SBM1707)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_PRE_ARRANGEMENT_TIME
                                                                 || LOGMSG_BRAKETE,
                                    1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /* ��i�掞�� �}�C�i�X�`�F�b�N*/
            IF TypColumnAry(16) IS NOT NULL THEN
                IF TO_NUMBER(TypColumnAry(16)) < 0 THEN
                    -- CSV�t�@�C���̐��l���ڂɃ}�C�i�X�l���ݒ肳��Ă��܂��B
                    vc2Aps          := APS_ERR_NUMBER_MINUS;
                    vc2ApsComment   := SUBSTR('(SBM1708)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_POST_ARRANGEMENT_TIME
                                                                 || LOGMSG_BRAKETE,
                                    1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /* ��Ɠ� ���t�`�F�b�N */
            IF SubFncCheckDate(TypColumnAry(4)) THEN
                NULL;
            ELSE
                --�b�r�u�t�@�C���œ��t���ڂ��s���ȃt�H�[�}�b�g�ł�
                vc2Aps          := APS_ERR_CSV_DATE_FORMAT;
                vc2ApsComment   := SUBSTR('(SBM1717)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                             || numCsvReadCount
                                                             || LOGMSG_BRAKETE
                                                             || LOGMSG_SPACER
                                                             || LOGMSG_CSV_ERR_COLUMN
                                                             || LOGMSG_BRAKETS
                                                             || COL_OPR_DATE
                                                             || LOGMSG_BRAKETE,
                            1,256);
                RAISE excCSV_CHECK_ERR;
            END IF;

            /* �H��R�[�h ���������`�F�b�N 3�����ȏ�̓G���[*/
            vc2CheckLength := LENGTH(TypColumnAry(1)) ;
            IF vc2CheckLength > LENGTH_2 THEN
                -- �����ȓ��Őݒ肵�Ă��������B
                vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                vc2ApsComment   := SUBSTR('(SBM1734)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                             || numCsvReadCount
                                                             || LOGMSG_BRAKETE
                                                             || LOGMSG_SPACER
                                                             || LOGMSG_CSV_ERR_COLUMN
                                                             || LOGMSG_BRAKETS
                                                             || COL_PLANT_CD
                                                             || LOGMSG_BRAKETE,
                            1,256);
                RAISE excCSV_CHECK_ERR;
            END IF;

            /* �i�ڔԍ� ���������`�F�b�N 26�����ȏ�̓G���[ */
            vc2CheckLength := LENGTH(TypColumnAry(2)) ;
            IF vc2CheckLength > LENGTH_25 THEN
                -- �����ȓ��Őݒ肵�Ă��������B
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

            /* ��Ƌ�R�[�h ���������`�F�b�N 26�����ȏ�̓G���[*/
            vc2CheckLength := LENGTH(TypColumnAry(3)) ;
            IF vc2CheckLength > LENGTH_25 THEN
                -- �����ȓ��Őݒ肵�Ă��������B
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

            /* �ۊǋ�R�[�h ���������`�F�b�N 26�����ȏ�̓G���[*/
            IF TypColumnAry(5) IS NOT NULL THEN
                vc2CheckLength := LENGTH(TypColumnAry(5)) ;
                IF vc2CheckLength > LENGTH_25 THEN
                    -- �����ȓ��Őݒ肵�Ă��������B
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1718)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
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

            /* �s�ǔ��l ���������`�F�b�N 81�����ȏ�̓G���[*/
            IF TypColumnAry(9) IS NOT NULL THEN
                vc2CheckLength := LENGTH(TypColumnAry(9)) ;
                IF vc2CheckLength > LENGTH_80 THEN
                    -- �����ȓ��Őݒ肵�Ă��������B
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1736)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_DEFECT_COMMENT
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /* ��ƒS���҃R�[�h ���������`�F�b�N 41�����ȏ�̓G���[*/
            IF TypColumnAry(10) IS NOT NULL THEN
                vc2CheckLength := LENGTH(TypColumnAry(10)) ;
                IF vc2CheckLength > LENGTH_40 THEN
                    -- �����ȓ��Őݒ肵�Ă��������B
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1737)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_OUTPUT_RSLT_PERSON
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /* �������b�g�ԍ� ���������`�F�b�N 26�����ȏ�̓G���[*/
            IF TypColumnAry(13) IS NOT NULL THEN
                vc2CheckLength := LENGTH(TypColumnAry(13)) ;
                IF vc2CheckLength > LENGTH_25 THEN
                    -- �����ȓ��Őݒ肵�Ă��������B
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1738)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
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

            /* �݌Ƀ��b�g�ԍ� ���������`�F�b�N 26�����ȏ�̓G���[*/
            IF TypColumnAry(14) IS NOT NULL THEN
                vc2CheckLength := LENGTH(TypColumnAry(14)) ;
                IF vc2CheckLength > LENGTH_25 THEN
                    -- �����ȓ��Őݒ肵�Ă��������B
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

            /* ��~���R ���������`�F�b�N 81�����ȏ�̓G���[*/
            IF TypColumnAry(18) IS NOT NULL THEN
                vc2CheckLength := LENGTH(TypColumnAry(18)) ;
                IF vc2CheckLength > LENGTH_80 THEN
                    -- �����ȓ��Őݒ肵�Ă��������B
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1722)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_CESSATION_CAUSE
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /* ���l ���������`�F�b�N 81�����ȏ�̓G���[*/
            IF TypColumnAry(19) IS NOT NULL THEN
                vc2CheckLength := LENGTH(TypColumnAry(19)) ;
                IF vc2CheckLength > LENGTH_80 THEN
                    -- �����ȓ��Őݒ肵�Ă��������B
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1721)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_OUTPUT_RSLT_COMMENT
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /* �H��R�[�h �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF SubFncCheck_vc2(TypColumnAry(1)) THEN
                NULL;
            ELSE
                --�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B
                vc2Aps          := APS_ERR_CSV_DATA_ILLEGAL;
                vc2ApsComment   := SUBSTR('(SBM1734)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                             || numCsvReadCount
                                                             || LOGMSG_BRAKETE
                                                             || LOGMSG_SPACER
                                                             || LOGMSG_CSV_ERR_COLUMN
                                                             || LOGMSG_BRAKETS
                                                             || COL_PLANT_CD
                                                             || LOGMSG_BRAKETE,
                            1,256);
                RAISE excCSV_CHECK_ERR;
            END IF;

            /* �i�ڔԍ� �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF SubFncCheck_vc2(TypColumnAry(2)) THEN
                NULL;
            ELSE
                --�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B
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

            /* ��Ƌ�R�[�h �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF SubFncCheck_vc2(TypColumnAry(3)) THEN
                NULL;
            ELSE
                --�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B
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

            /* �ۊǋ�R�[�h �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(5) IS NOT NULL THEN
                IF SubFncCheck_vc2(TypColumnAry(5)) THEN
                    NULL;
                ELSE
                    --�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B
                    vc2Aps          := APS_ERR_CSV_DATA_ILLEGAL;
                    vc2ApsComment   := SUBSTR('(SBM1718)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
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

            /* �s�ǔ��l �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(9) IS NOT NULL THEN
                IF SubFncCheck_vc2(TypColumnAry(9)) THEN
                    NULL;
                ELSE
                    --�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B
                    vc2Aps          := APS_ERR_CSV_DATA_ILLEGAL;
                    vc2ApsComment   := SUBSTR('(SBM1736)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_DEFECT_COMMENT
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /* ��ƒS���҃R�[�h �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(10) IS NOT NULL THEN
                IF SubFncCheck_vc2(TypColumnAry(10)) THEN
                    NULL;
                ELSE
                    --�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B
                    vc2Aps          := APS_ERR_CSV_DATA_ILLEGAL;
                    vc2ApsComment   := SUBSTR('(SBM1737)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_OUTPUT_RSLT_PERSON
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /* �������b�g�ԍ� �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(13) IS NOT NULL THEN
                IF SubFncCheck_vc2(TypColumnAry(13)) THEN
                    NULL;
                ELSE
                    --�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B
                    vc2Aps          := APS_ERR_CSV_DATA_ILLEGAL;
                    vc2ApsComment   := SUBSTR('(SBM1738)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
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

            /* �݌Ƀ��b�g�ԍ� �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(14) IS NOT NULL THEN
                IF SubFncCheck_vc2(TypColumnAry(14)) THEN
                    NULL;
                ELSE
                    --�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B
                    vc2Aps          := APS_ERR_CSV_DATA_ILLEGAL;
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

            /* ��~���R �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(18) IS NOT NULL THEN
                IF SubFncCheck_vc2(TypColumnAry(18)) THEN
                    NULL;
                ELSE
                    --�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B
                    vc2Aps          := APS_ERR_CSV_DATA_ILLEGAL;
                    vc2ApsComment   := SUBSTR('(SBM1722)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_CESSATION_CAUSE
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /* ���l �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(19) IS NOT NULL THEN
                IF SubFncCheck_vc2(TypColumnAry(19)) THEN
                    NULL;
                ELSE
                    --�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B
                    vc2Aps          := APS_ERR_CSV_DATA_ILLEGAL;
                    vc2ApsComment   := SUBSTR('(SBM1721)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_OUTPUT_RSLT_COMMENT
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /* �Ǖi�� �����`�F�b�N ������ 15���ȏ�A�܂��͏����_�ȉ�5���ȏ�̏ꍇ�G���[ */
            vc2ToChar             := 0;
            vc2CheckNum           := 0;
            vc2CheckLength        := 0;
            IF MOD(TypColumnAry(6),1) > 0 THEN
               vc2ToChar :=TO_CHAR(TypColumnAry(6));
               vc2CheckNum := SUBSTR(vc2ToChar,INSTR(vc2ToChar,'.')+1);
               vc2CheckLength := LENGTH(vc2CheckNum) ;
            ELSE
               vc2CheckLength :=0;
            END IF;

            IF TypColumnAry(6) < NUMBER_100000000000000 AND
               vc2CheckLength < LENGTH_5 THEN
               NULL;

            ELSE
                -- �����ȓ��Őݒ肵�Ă��������B
                vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                vc2ApsComment   := SUBSTR('(SBM1704)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
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

            /* �s�ǐ� �����`�F�b�N ������ 15���ȏ�A�܂��͏����_�ȉ�5���ȏ�̏ꍇ�G���[ */
            IF TypColumnAry(7) IS NOT NULL THEN
                vc2ToChar             := 0;
                vc2CheckNum           := 0;
                vc2CheckLength        := 0;
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
                    -- �����ȓ��Őݒ肵�Ă��������B
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1705)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_DEFECT_QTY
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /* ��Ǝ��� �����`�F�b�N ������ 15���ȏ�A�܂��͏����_�ȉ�5���ȏ�̏ꍇ�G���[ */
            IF TypColumnAry(12) IS NOT NULL THEN
                vc2ToChar             := 0;
                vc2CheckNum           := 0;
                vc2CheckLength        := 0;
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
                    -- �����ȓ��Őݒ肵�Ă��������B
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1709)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_OPR_TIME
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /* �O�i�掞�� �����`�F�b�N ������ 15���ȏ�A�܂��͏����_�ȉ�5���ȏ�̏ꍇ�G���[ */
            IF TypColumnAry(15) IS NOT NULL THEN
                vc2ToChar             := 0;
                vc2CheckNum           := 0;
                vc2CheckLength        := 0;
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
                    -- �����ȓ��Őݒ肵�Ă��������B
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1707)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_PRE_ARRANGEMENT_TIME
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /* ��i�掞�� �����`�F�b�N ������ 15���ȏ�A�܂��͏����_�ȉ�5���ȏ�̏ꍇ�G���[ */
            IF TypColumnAry(16) IS NOT NULL THEN
                vc2ToChar             := 0;
                vc2CheckNum           := 0;
                vc2CheckLength        := 0;
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
                    -- �����ȓ��Őݒ肵�Ă��������B
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1708)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_POST_ARRANGEMENT_TIME
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /* ��~���� �����`�F�b�N ������ 15���ȏ�A�܂��͏����_�ȉ�5���ȏ�̏ꍇ�G���[ */
            IF TypColumnAry(17) IS NOT NULL THEN
                vc2ToChar             := 0;
                vc2CheckNum           := 0;
                vc2CheckLength        := 0;
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
                    -- �����ȓ��Őݒ肵�Ă��������B
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1710)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_CESSATION_TIME
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /* �s�Ǘ��R�R�[�h[�R���{�{�b�N�X�f�[�^].�g���́h ��DEFECT_CAUSE_CD_INNER �@
            *  ����[�R���{�{�b�N�X�f�[�^]. �g�l�h �� CSV�̑Ή����ڂ̒l�̏����ŁA
            *  �R���{�{�b�N�X�f�[�^�����݂��Ȃ��ꍇ 
            */
            IF TypColumnAry(8) IS NOT NULL THEN
                vc2Value := NULL;
                OPEN curSYS_TYPE_VALUE(TypColumnAry(8));
                FETCH curSYS_TYPE_VALUE INTO vc2Value;
                IF vc2Value IS NULL THEN
                    CLOSE curSYS_TYPE_VALUE;
                    -- �����ȓ��Őݒ肵�Ă��������B
                    vc2Aps          := APS_ERR_CSV_COMBO_VALUE;
                    vc2ApsComment   := SUBSTR('(SBM1735)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_DEFECT_CAUSE_CD
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
                CLOSE curSYS_TYPE_VALUE;
            END IF;

            /* ��Ǝ��ԒP�ʋ敪�� Null�ł͂Ȃ��A���A�i1�C2�j�ȊO�̏ꍇ�̓G���[*/
            IF TypColumnAry(11) IS NOT NULL THEN
                IF TypColumnAry(11) = 1 OR 
                   TypColumnAry(11) = 2 THEN
                   NULL;
                ELSE
                    -- ��Ǝ��ԒP�ʋ敪���s���ł��B
                    vc2Aps          := APS_ERR_OPR_TIME_UNIT_TYP;
                    vc2ApsComment   := SUBSTR('(SBM1706)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_OPR_TIME_UNIT_TYP
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
             END IF;

             /* �u�o�������ю捞�Ǘ��ԍ��v��ݒ肷��B */
             vc2OutputRsltTempCtlNo := SubFncGetOUTPUT_TEMP_CTL_NO;
             /* �o�������ю捞 �o�^���� */
             INSERT INTO T_OUTPUT_RSLT_TEMP(
                 OUTPUT_RSLT_TEMP_CTL_NO   -- �o�������ю捞�Ǘ��ԍ�
                 , PLANT_CD                -- �H��R�[�h
                 , ITEM_CD                 -- �i�ڔԍ�
                 , WS_CD                   -- ��Ƌ�R�[�h
                 , OPR_DATE                -- ��Ɠ�
                 , WH_CD                   -- �ۊǋ�R�[�h
                 , ACPT_QTY                -- �Ǖi��
                 , DEFECT_QTY              -- �s�ǐ�
                 , DEFECT_CAUSE_CD         -- �s�Ǘ��R�R�[�h
                 , DEFECT_COMMENT          -- �s�ǔ��l
                 , OUTPUT_RSLT_PERSON      -- ��ƒS���҃R�[�h
                 , OPR_TIME_UNIT_TYP       -- ��Ǝ��ԒP�ʋ敪
                 , OPR_TIME                -- ��Ǝ���
                 , VEND_LOT_NO             -- �������b�g�ԍ�
                 , LOT_NO                  -- �݌Ƀ��b�g�ԍ�
                 , PRE_ARRANGEMENT_TIME    -- �O�i�掞��
                 , POST_ARRANGEMENT_TIME   -- ��i�掞��
                 , CESSATION_TIME          -- ��~����
                 , CESSATION_CAUSE         -- ��~���R
                 , OUTPUT_RSLT_COMMENT     -- ���l
                 , TAKE_DATE               -- �捞���t
             ) VALUES (
                   vc2OutputRsltTempCtlNo  -- �o�������ю捞�Ǘ��ԍ�
                 , TypColumnAry(1)         -- �H��R�[�h
                 , TypColumnAry(2)         -- �i�ڔԍ�
                 , TypColumnAry(3)         -- ��Ƌ�R�[�h
                 , TypColumnAry(4)         -- ��Ɠ�
                 , TypColumnAry(5)         -- �ۊǋ�R�[�h
                 , TypColumnAry(6)         -- �Ǖi��
                 , TypColumnAry(7)         -- �s�ǐ�
                 , TypColumnAry(8)         -- �s�Ǘ��R�R�[�h
                 , TypColumnAry(9)         -- �s�ǔ��l
                 , TypColumnAry(10)        -- ��ƒS���҃R�[�h
                 , TypColumnAry(11)        -- ��Ǝ��ԒP�ʋ敪
                 , TypColumnAry(12)        -- ��Ǝ���
                 , TypColumnAry(13)        -- �������b�g�ԍ�
                 , TypColumnAry(14)        -- �݌Ƀ��b�g�ԍ�
                 , TypColumnAry(15)        -- �O�i�掞��
                 , TypColumnAry(16)        -- ��i�掞��
                 , TypColumnAry(17)        -- ��~����
                 , TypColumnAry(18)        -- ��~���R
                 , TypColumnAry(19)        -- ���l
                 , dtmBusinessOprDate      -- �捞���t
             );

             numCsvInsertCount := numCsvInsertCount + 1 ;
        EXCEPTION
            -- CSV�f�[�^�̃`�F�b�N�G���[
            WHEN excCSV_CHECK_ERR THEN
                -- ���b�Z�[�W���o�͂��āA���̍s��
                numMsglogCount := numMsglogCount + 1;
				msgLogData(numMsglogCount).fncName:= MY_SQL_NAME;
				msgLogData(numMsglogCount).errCd  := vc2Aps;
				msgLogData(numMsglogCount).errMsg := vc2ApsComment;

                blnCsvDataCommit :=false;

        END;
    END LOOP;

/*-----------------------------------------------------------------------------
' ����I������
'
-----------------------------------------------------------------------------*/
    /*�P���ł��G���[�f�[�^�����݂���ꍇ��ROLLBACK*/
    IF blnCsvDataCommit = FALSE THEN
        ROLLBACK;
    END IF;

    IF UTL_FILE.IS_OPEN(UTL_FileCsvHandle) = TRUE THEN
      /* �b�r�u�t�@�C���N���[�Y */
      UTL_FILE.FCLOSE(UTL_FileCsvHandle);
    END IF;
    vc2Aps          := NULL;
    vc2ApsComment   := NULL;

    -- CSV�t�@�C���������s�����ꍇCSV���������Ɩ����O�ɏo�͂���
    IF numCsvReadCount > 0 THEN
        /* ��Ǝ��ю捞 CSV���������\�� */
        IF blnCsvDataCommit = FALSE THEN
             numCsvInsertCount := 0;
        END IF;
        -- �ڍ׃��b�Z�[�W�̕ҏW
        vc2Comment  := SUBSTR('(SBM1650)'||
                       '���͌���='               ||  LOGMSG_BRAKETS  ||  TO_CHAR(numCsvReadCount)    || LOGMSG_BRAKETE   || '�A' ||
                       '�o�^����='               ||  LOGMSG_BRAKETS  ||  TO_CHAR(numCsvInsertCount)  || LOGMSG_BRAKETE,
                       1,256);

        numMsglogCount := numMsglogCount + 1;
        msgLogData(numMsglogCount).fncName:= MY_SQL_NAME;
        msgLogData(numMsglogCount).errCd  := APS_DATA_PROCESSING;
        msgLogData(numMsglogCount).errMsg := vc2Comment;
        vc2Comment := NULL;
    END IF;

    /* �I�����b�Z�[�W�̏o�� */
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

    /* �g���[�X���O�̏o��(�I��) */
    blnRet      := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                               pvc2UserId,pvc2BusinessName,
                               pvc2PlantCd, MY_SQL_NAME, LOGMSG_END);

    COMMIT;

    /* LogFile �� CLOSE */
    blnRet          := FNCLOGCLOSE(UTL_FileHandle);

    /* �捞CSV�t�@�C���̃��l�[�� */
    /* CSV�捞�����ɂ��A����I�����̃t�@�C���̎�舵���𕪊� */
    IF pnumCsvTakeTyp = CSV_TAKE_TYP_FIX THEN
       /* CSV�捞����=1�F�Œ�t�@�C���捞�̏ꍇ�A�捞CSV�t�@�C���̃��l�[���̂� */
       UTL_FILE.FRENAME(vc2CsvFilePath,vc2CsvFile,vc2CsvFilePath,vc2NewFileName);
    ELSIF pnumCsvTakeTyp = CSV_TAKE_TYP_DESINATED THEN
       /* CSV�捞����=2�F�w��t�@�C���捞�̏ꍇ�A�捞CSV�t�@�C���̃��l�[��+�o�b�N�A�b�v�t�H���_�ֈړ� */
       UTL_FILE.FRENAME(vc2CsvFilePath,vc2CsvFile,pvc2CsvBackupPath,vc2NewFileName);
    END IF;

    pnumReturn := STATUS_NORMAL; --����I��

/* ��O�I������ */
EXCEPTION
    -- ���s�s��
    WHEN excERR_SKIP THEN
        /* �I�����b�Z�[�W�̏o�� */
        IF vc2Aps IS NOT NULL THEN
            numMsglogCount := NVL(msgLogData.LAST, 0);
            numMsglogCount := numMsglogCount + 1;
            msgLogData(numMsglogCount).fncName:= MY_SQL_NAME;
            msgLogData(numMsglogCount).errCd  := vc2Aps;
            msgLogData(numMsglogCount).errMsg := vc2ApsComment;
        END IF;

        /* �I�����b�Z�[�W�̏o�� */
        IF vc2Comment IS NULL THEN
            vc2Comment  := SUBSTR('PGNAME='         || LOGMSG_BRAKETS || MY_SQL_NAME    || LOGMSG_BRAKETE ||
                                  ' SQLCODE='       || LOGMSG_BRAKETS || SQLCODE        || LOGMSG_BRAKETE ||
                                  ' SQLERRM='       || LOGMSG_BRAKETS || SQLERRM        || LOGMSG_BRAKETE,
                            1,256);
        END IF;

        numMsglogCount := NVL(msgLogData.LAST, 0);
        numMsglogCount := numMsglogCount + 1;
        msgLogData(numMsglogCount).fncName:= MY_SQL_NAME;
        msgLogData(numMsglogCount).errCd  := APS_BATCH_EXP;
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

        /* �g���[�X���O�̏o��(�I��) */
        blnRet      := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                   pvc2UserId,pvc2BusinessName,
                                   pvc2PlantCd, MY_SQL_NAME, LOGMSG_END);

        COMMIT;

        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

        -- �t�@�C���p�XNULL�łȂ��ꍇ
        IF vc2CsvFilePath IS NOT NULL AND vc2CsvFile IS NOT NULL THEN
            /* CSV File �� CLOSE */
            IF UTL_FILE.IS_OPEN(UTL_FileCsvHandle) = TRUE THEN
                UTL_FILE.FCLOSE(UTL_FileCsvHandle);
            END IF;

            -- �t�@�C�����݃`�F�b�N
            UTL_FILE.FGETATTR(vc2CsvFilePath, vc2CsvFile, blnFileExists, numFileLength, intFileSize);

            IF blnFileExists = TRUE THEN
                /* �捞CSV�t�@�C���̃��l�[�� */
                /* CSV�捞�����ɂ��A��O�I�����̃t�@�C���̎�舵���𕪊� */
                IF pnumCsvTakeTyp = CSV_TAKE_TYP_FIX THEN
                    /* CSV�捞����=1�F�Œ�t�@�C���捞�̏ꍇ�A�捞CSV�t�@�C���̃��l�[���̂� */
                    UTL_FILE.FRENAME(vc2CsvFilePath,vc2CsvFile,vc2CsvFilePath,vc2NewFileName);
                ELSIF pnumCsvTakeTyp = CSV_TAKE_TYP_DESINATED THEN
                    /* CSV�捞����=2�F�w��t�@�C���捞�̏ꍇ�A�捞CSV�t�@�C���̃��l�[��+�o�b�N�A�b�v�t�H���_�ֈړ� */
                    UTL_FILE.FRENAME(vc2CsvFilePath,vc2CsvFile,pvc2CsvBackupPath,vc2NewFileName);
                END IF;
            END IF;
        END IF;

        pnumReturn := STATUS_ERROR; /* �ُ�I�� */
    -- �J�[�\��OPEN����EXCEPTION
    WHEN excERR_MAST THEN
        -- �J�[�\���̃N���[�Y����
        IF curSYS_PARAMETER%ISOPEN = TRUE THEN
            CLOSE curSYS_PARAMETER;           --�y�p�����[�^�z
        END IF;
        IF curBUSINESS_OPR_DATE%ISOPEN = TRUE THEN
            CLOSE curBUSINESS_OPR_DATE;       --�y�Ɩ��^�p���z
        END IF;
        IF curSYS_TYPE_VALUE%ISOPEN = TRUE THEN
            CLOSE curSYS_TYPE_VALUE;          --�y�R���{�{�b�N�X�f�[�^�z
        END IF;

        ROLLBACK;

        /* �I�����b�Z�[�W�̏o�� */
        IF vc2Aps IS NOT NULL THEN
            numMsglogCount := NVL(msgLogData.LAST, 0);
            numMsglogCount := numMsglogCount + 1;
            msgLogData(numMsglogCount).fncName:= MY_SQL_NAME;
            msgLogData(numMsglogCount).errCd  := vc2Aps;
            msgLogData(numMsglogCount).errMsg := vc2ApsComment;
        END IF;

        /* �I�����b�Z�[�W�̏o�� */
        IF vc2Comment IS NULL THEN
            vc2Comment  := LOGMSG_EXP_PGNM;
        END IF;
        numMsglogCount := NVL(msgLogData.LAST, 0);
        numMsglogCount := numMsglogCount + 1;
        msgLogData(numMsglogCount).fncName:= MY_SQL_NAME;
        msgLogData(numMsglogCount).errCd  := APS_BATCH_EXP;
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

        /* �g���[�X���O�̏o��(�I��) */
        blnRet      := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                   pvc2UserId,pvc2BusinessName,
                                   pvc2PlantCd, MY_SQL_NAME, LOGMSG_END);

        COMMIT;

        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

        -- �t�@�C���p�XNULL�łȂ��ꍇ
        IF vc2CsvFilePath IS NOT NULL AND vc2CsvFile IS NOT NULL THEN
            /* CSV File �� CLOSE */
            IF UTL_FILE.IS_OPEN(UTL_FileCsvHandle) = TRUE THEN
                UTL_FILE.FCLOSE(UTL_FileCsvHandle);
            END IF;

            -- �t�@�C�����݃`�F�b�N
            UTL_FILE.FGETATTR(vc2CsvFilePath, vc2CsvFile, blnFileExists, numFileLength, intFileSize);

            IF blnFileExists = TRUE THEN
                /* �捞CSV�t�@�C���̃��l�[�� */
                /* CSV�捞�����ɂ��A��O�I�����̃t�@�C���̎�舵���𕪊� */
                IF pnumCsvTakeTyp = CSV_TAKE_TYP_FIX THEN
                    /* CSV�捞����=1�F�Œ�t�@�C���捞�̏ꍇ�A�捞CSV�t�@�C���̃��l�[���̂� */
                    UTL_FILE.FRENAME(vc2CsvFilePath,vc2CsvFile,vc2CsvFilePath,vc2NewFileName);
                ELSIF pnumCsvTakeTyp = CSV_TAKE_TYP_DESINATED THEN
                    /* CSV�捞����=2�F�w��t�@�C���捞�̏ꍇ�A�捞CSV�t�@�C���̃��l�[��+�o�b�N�A�b�v�t�H���_�ֈړ� */
                    UTL_FILE.FRENAME(vc2CsvFilePath,vc2CsvFile,pvc2CsvBackupPath,vc2NewFileName);
                END IF;
            END IF;
        END IF;

        pnumReturn := STATUS_ERROR; /* �ُ�I�� */

    -- ���̑��̗�O
    WHEN OTHERS THEN
        -- �J�[�\���̃N���[�Y����
        IF curSYS_PARAMETER%ISOPEN = TRUE THEN
            CLOSE curSYS_PARAMETER;           --�y�p�����[�^�z
        END IF;
        IF curBUSINESS_OPR_DATE%ISOPEN = TRUE THEN
            CLOSE curBUSINESS_OPR_DATE;       --�y�Ɩ��^�p���z
        END IF;
        IF curSYS_TYPE_VALUE%ISOPEN = TRUE THEN
            CLOSE curSYS_TYPE_VALUE;          --�y�R���{�{�b�N�X�f�[�^�z
        END IF;

        ROLLBACK;

        /* �I�����b�Z�[�W�̏o�� */
        vc2Comment  := SUBSTR('PGNAME='     || LOGMSG_BRAKETS || MY_SQL_NAME    || LOGMSG_BRAKETE ||
                              ' SQLCODE='   || LOGMSG_BRAKETS || SQLCODE        || LOGMSG_BRAKETE ||
                              ' SQLERRM='   || LOGMSG_BRAKETS || SQLERRM        || LOGMSG_BRAKETE,
                        1,256);
        numMsglogCount := NVL(msgLogData.LAST, 0);
        numMsglogCount := numMsglogCount + 1;
        msgLogData(numMsglogCount).fncName:= MY_SQL_NAME;
        msgLogData(numMsglogCount).errCd  := APS_BATCH_EXP;
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

        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

        -- �t�@�C���p�XNULL�łȂ��ꍇ
        IF vc2CsvFilePath IS NOT NULL AND vc2CsvFile IS NOT NULL THEN
            /* CSV File �� CLOSE */
            IF UTL_FILE.IS_OPEN(UTL_FileCsvHandle) = TRUE THEN
                UTL_FILE.FCLOSE(UTL_FileCsvHandle);
            END IF;

            -- �t�@�C�����݃`�F�b�N
            UTL_FILE.FGETATTR(vc2CsvFilePath, vc2CsvFile, blnFileExists, numFileLength, intFileSize);

            IF blnFileExists = TRUE THEN
                /* �捞CSV�t�@�C���̃��l�[�� */
                /* CSV�捞�����ɂ��A��O�I�����̃t�@�C���̎�舵���𕪊� */
                IF pnumCsvTakeTyp = CSV_TAKE_TYP_FIX THEN
                    /* CSV�捞����=1�F�Œ�t�@�C���捞�̏ꍇ�A�捞CSV�t�@�C���̃��l�[���̂� */
                    UTL_FILE.FRENAME(vc2CsvFilePath,vc2CsvFile,vc2CsvFilePath,vc2NewFileName);
                ELSIF pnumCsvTakeTyp = CSV_TAKE_TYP_DESINATED THEN
                    /* CSV�捞����=2�F�w��t�@�C���捞�̏ꍇ�A�捞CSV�t�@�C���̃��l�[��+�o�b�N�A�b�v�t�H���_�ֈړ� */
                    UTL_FILE.FRENAME(vc2CsvFilePath,vc2CsvFile,pvc2CsvBackupPath,vc2NewFileName);
                END IF;
            END IF;
        END IF;

        pnumReturn := STATUS_ERROR; /* �ُ�I�� */
END;
/
