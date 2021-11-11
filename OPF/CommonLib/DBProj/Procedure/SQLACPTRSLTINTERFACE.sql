CREATE OR REPLACE PROCEDURE SQLACPTRSLTINTERFACE(
/*------------------------------------------------------------------------------
'
'$Author: zhangran $
'$Revision: 1.3 $
'
' �@�\      :�������CSV�捞����
'
' �߂�l    :
'
' ������    : �����ʁi�K�{�j
'             pvc2LogMode          - (i)�k�n�f���[�h
'             pvc2OutputMode       - (i)�o�̓��[�h
'             pvc2OutputPath       - (i)�o�̓t�@�C���p�X
'             pvc2OutputName       - (i)�o�̓t�@�C����
'             pvc2UserId           - (i)���[�U�h�c
'             pvc2BusinessName     - (i)�Ɩ���
'             pvc2PlantCd          - (i)�H��R�[�h
'             pnumCsvTakeTyp       - (i)CSV�捞����
'             pvc2CsvTakePath      - (i)�捞�t�@�C���p�X
'             pvc2CsvBackupPath    - (i)�o�b�N�A�b�v�t�H���_�p�X
'
'             ���v���O�����ŗL
'             pnumReturn           - (o)��������  �i1:����I���A2:�x���I���A3:�ُ�I���j
'
' �@�\����  : �������CSV�t�@�C����ǂݍ��݁A[������ю捞]���쐬���܂��B
'
' ���l      :
'
------------------------------------------------------------------------------*/
    pvc2LogMode            IN  VARCHAR2    --�k�n�f���[�h
   ,pvc2OutputMode         IN  VARCHAR2    --�o�̓��[�h
   ,pvc2OutputPath         IN  VARCHAR2    --�o�̓t�@�C���p�X
   ,pvc2OutputName         IN  VARCHAR2    --�o�̓t�@�C����
   ,pvc2UserId             IN  VARCHAR2    --���[�U�h�c
   ,pvc2BusinessName       IN  VARCHAR2    --�Ɩ���
   ,pvc2PlantCd            IN  VARCHAR2    --�H��R�[�h
   ,pnumCsvTakeTyp         IN  NUMBER      --CSV�捞����
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


/* ROWTYPE �̐錾 */
    RtpSYS_PARAMETER                curSYS_PARAMETER%ROWTYPE;       -- �y�p�����[�^�z
    RtpBUSINESS_OPR_DATE            curBUSINESS_OPR_DATE%ROWTYPE;   -- �y�Ɩ��^�p���z

/* �萔�̐錾 */

    MY_SQL_NAME                         VARCHAR2(84)    := 'SQLACPTRSLTINTERFACE';             
    STATUS_NORMAL                       NUMBER(1)       := 1;                                  --����I��
    STATUS_WARNING                      NUMBER(1)       := 2;                                  --�x���I��
    STATUS_ERROR                        NUMBER(1)       := 3;                                  --�ُ�I��
    DATE_FORMAT                         VARCHAR2(72)    := 'YYYY/MM/DD HH24:MI';               -- ���t�ϊ����̃t�H�[�}�b�g
    PATH_SLASH                          VARCHAR2(4)     := '/';                                --�t�@�C���p�X��؂蕶��
    PATH_DELIM                          VARCHAR2(4)     := '\';                                --�t�@�C���p�X��؂蕶��

    DEFAULT_CHAR_SET                    VARCHAR2(32)    := 'JA16SJIS';                         -- S-JIS
    ACPT_RSLT_IF_CSV_PATH               VARCHAR2(88)    := 'ACPT_RSLT_IF_CSV_PATH';            -- [�p�����[�^].���O
    CSV_CHAR_SET                        VARCHAR2(64)    := 'CSV_CHARACTERSET';                 -- [�p�����[�^].���O
    CSV_TAKE_TYP_FIX                    NUMBER(1)       := 1;                                  -- 1�F�Œ�t�@�C���捞
    CSV_TAKE_TYP_DESINATED              NUMBER(1)       := 2;                                  -- 2�F�w��t�@�C���捞
    CSV_LINE_MAX                        INTEGER         := 2048;                               --�b�r�u�t�@�C���P�s����̍ő吔
    CSV_COLUMN_COUNT                    INTEGER         := 17;                                 --�b�r�u�t�@�C���P�s����̍��ڐ�
    CSV_DELIM                           VARCHAR2(4)     := ',';                                --�b�r�u���ڂ̋�؂蕶��
    LENGTH_25                           NUMBER(2)       := 25;                                 --������:=25
    LENGTH_80                           NUMBER(2)       := 80;                                 --������:=80
    LENGTH_5                            NUMBER(1)       :=5;                                   --������ :=5
    NUMBER_100000000000000              NUMBER(15)      :=100000000000000;                     --���l����:15��
    NUMBER_0                            NUMBER(1)       :=0;                                   --���l:=0


/* EXCEPTION �̐錾 */
    excERR_SKIP                         EXCEPTION;      --���s�s��
    excERR_MAST                         EXCEPTION;      --�J�[�\��OPEN����EXCEPTION
    excCSV_CHECK_ERR                    EXCEPTION;      --CSV�f�[�^�̃`�F�b�N�G���[

/* MESSAGE �̐錾 */
    APS_ERR_CSVFILEPATH                 VARCHAR2(28)    := 'AE60003';   --������тb�r�u�p�X�̎擾�Ɏ��s���܂����B
    APS_ERR_CSVFILE                     VARCHAR2(28)    := 'AD60005';   --�t�@�C���̏������ɃG���[���������܂����B
    APS_BATCH_START                     VARCHAR2(28)    := 'AE60002';   --�������CSV�捞�������J�n���܂����B
    APS_BATCH_END                       VARCHAR2(28)    := 'AE60004';   --�������CSV�捞�������I�����܂����B
    APS_ERR_BUSINESS_DATE               VARCHAR2(28)    := 'AD60044';   --�Ɩ����t�̎擾�Ɏ��s���܂����B
    APS_BATCH_EXC                       VARCHAR2(28)    := 'AE60005';   --�������CSV�捞�������ُ�I�����܂����B
    APS_ERR_CSV_DATA_FORMAT             VARCHAR2(28)    := 'AD60006';   --CSV�t�@�C�����s���ȃt�H�[�}�b�g�ł��B
    APS_DATA_PROCESSING                 VARCHAR2(28)    := 'AD60014';   --��������
    APS_ERR_REQUIRED                    VARCHAR2(28)    := 'AD60009';   --CSV�t�@�C���̕K�{���ڂɒl���ݒ肳��Ă��܂���B
    APS_ERR_CSV_DATA_DIGIT              VARCHAR2(28)    := 'AA01501';   --�����ȓ��Őݒ肵�Ă��������B
    APS_ERR_CSV_DATA_ILLEGAL            VARCHAR2(28)    := 'AA01524';   --�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B
    APS_ERR_CSV_NUMBER_FORMAT           VARCHAR2(28)    := 'AD60007';   --CSV�t�@�C���Ő��l���ڂ��s���ȃt�H�[�}�b�g�ł��B
    APS_ERR_CSV_DATE_FORMAT             VARCHAR2(28)    := 'AD60008';   --CSV�t�@�C���œ��t���ڂ��s���ȃt�H�[�}�b�g�ł��B
    APS_ERR_UNIT_COST_TYP               VARCHAR2(28)    := 'CF00012';   --�P���敪���s���ł��B
    APS_ERR_CSV_ZERO                    VARCHAR2(28)    := 'AE00059';   --�בփ��[�g�ɂ́A0���傫�����l����͂��Ă��������B
    APS_ERR_LOT_NO                      VARCHAR2(28)    := 'AE20617';   --��������O�̂��߁A�݌Ƀ��b�g�ԍ�����͂ł��܂���B
    APS_ERR_ACPT_RSLT_COMP1             VARCHAR2(28)    := 'AE00191';   --��������t���O���s���ł��B
    APS_ERR_ACPT_RSLT_COMP2             VARCHAR2(28)    := 'AE05012';   --������������͂ł��B
    APS_ERR_ACPT_RSLT_COMP3             VARCHAR2(28)    := 'AE00196';   --��������t���O��0�����ł����A��������o�^����Ă��܂��B



/* LOG �̐錾 */
    LOGMSG_NAME                         VARCHAR2(52)    := '���O=';
    LOGMSG_START                        VARCHAR2(20)    := 'Start';
    LOGMSG_END                          VARCHAR2(12)    := 'End';
    LOGMSG_BRAKETS                      VARCHAR2(4)     := '[';
    LOGMSG_BRAKETE                      VARCHAR2(4)     := ']';
    LOGMSG_SPACER                       VARCHAR2(4)     := ' ';
    LOGMSG_COLUMN_CNT                   VARCHAR2(36)    := 'CSV���ڐ�';
    LOGMSG_CSV_ERR_COLUMN               VARCHAR2(88)    := '�G���[���ږ�=';
    LOGMSG_PLANT_CD                     VARCHAR2(44)    := '�H��R�[�h=';
    LOGMSG_TAKE_FILENAME                VARCHAR2(400)   := '(SBM1328)�捞�t�@�C�����F';
    LOGMSG_START_PGNM                   VARCHAR2(400)   := '(SBM1335)�������CSV�捞�������J�n���܂����B';
    LOGMSG_END_PGNM                     VARCHAR2(152)   := '(SBM1336)�������CSV�捞�������I�����܂����B';
    LOGMSG_CSVFILE                      VARCHAR2(400)   := '(SBM1337)������уt�@�C����=';
    LOGMSG_LINECNT                      VARCHAR2(400)   := 'CSV�s�ԍ�=';
    COL_PUCH_ODR_CD                     VARCHAR2(200)   := '�����ԍ�';
    COL_ITEM_CD                         VARCHAR2(200)   := '�i�ڔԍ�';
    COL_WH_CD                           VARCHAR2(200)   := '����ꏊ';
    COL_ACPT_DATE                       VARCHAR2(200)   := '�����';
    COL_ACPT_QTY                        VARCHAR2(200)   := '�����';
    COL_UNIT_COST_TYP                   VARCHAR2(200)   := '�P���敪';
    COL_UNIT_COST                       VARCHAR2(200)   := '�P��';
    COL_PROCESSING_COST                 VARCHAR2(200)   := '���H��';
    COL_MATERIAL_COST                   VARCHAR2(200)   := '�ޗ���';
    COL_OTHER_OVERHEADS                 VARCHAR2(200)   := '���̑��o��';
    COL_DISC_AMOUNT                     VARCHAR2(200)   := '�l�����z';
    COL_EXCH_RATE                       VARCHAR2(200)   := '�בփ��[�g';
    COL_LOT_NO                          VARCHAR2(200)   := '�݌Ƀ��b�g�ԍ�';
    COL_VEND_LOT_NO                     VARCHAR2(200)   := '���[�J���b�g�ԍ�';
    COL_DLV_CD                          VARCHAR2(200)   := '�[�i���ԍ�';
    COL_ACPT_RSLT_COMMENT               VARCHAR2(200)   := '������є��l';
    COL_ACPT_RSLT_COMP                  VARCHAR2(200)   := '��������t���O';

/* ���R�[�h�^�̐錾 */

    TYPE TYP_COLUMN_ARRY IS TABLE OF VARCHAR2(2048) INDEX BY BINARY_INTEGER;

    -- �Ɩ����b�Z�[�W
    TYPE TYP_MSG_LOG_TYPE IS RECORD(
        fncName       VARCHAR2(100)         -- �Ɩ���
       ,errCd         VARCHAR2(28)          -- �I�[�_�R�[�h
       ,errMsg        VARCHAR2(4096)        -- �G���[���b�Z�[�W
    );
    TYPE MSGLOG_TYPE IS TABLE OF TYP_MSG_LOG_TYPE INDEX BY BINARY_INTEGER;
    msgLogData       MSGLOG_TYPE;


/* �ϐ��̐錾 */

    vc2DBCharSet                VARCHAR2(100);                  --DB�̕����R�[�h
    vc2CSVCharSet               VARCHAR2(100);                  --CSV�t�@�C���̕����R�[�h
    vc2Comment                  VARCHAR2(1024);                 --���b�Z�[�W�p�R�����g�쐬��Ɨ̈�
    vc2Aps                      VARCHAR2(28);                   --���b�Z�[�W�p
    vc2ApsComment               VARCHAR2(1024);                 --���b�Z�[�W�p�R�����g�쐬��Ɨ̈�
    vc2CsvFilePath              VARCHAR2(1024);                 --�������CSV�t�@�C���̊i�[�f�B���N�g��
    vc2CsvFile                  VARCHAR2(1024);                 --�������CSV�t�@�C����
    vc2NewFileName              VARCHAR2(1000) := '';           --�t�@�C�����l�[���p
    intIdx                      INTEGER;                        --���ڐ؂�o���p�J�E���^
    vc2WorkBuffer               VARCHAR2(1024);                 --��Ɨp�o�b�t�@
    intColumnMax                INTEGER;                        --�J�������m�F�p
    intColumnOvr                INTEGER;                        --�J�������m�F�p
    blnCsvDataCommit            BOOLEAN;                        --������ю捞�ɓo�^�����f�[�^�̃R�~�b�g�ۃt���O
    vc2ReadBuffer               VARCHAR2(2048);                 --�ǂݍ��ݗp�o�b�t�@
    numMsglogCount              NUMBER := 0;                    -- ���b�Z�[�W���O��
    numCsvReadCount             NUMBER(10) := 0;                --CSV �Ǎ�����
    numCsvInsertCount           NUMBER(10) := 0;                --CSV �o�^����
    numMstErrorCount            NUMBER(10) := 0;                --�}�X�^�G���[����
    blnFile                     BOOLEAN;                        --BOOLEAN�^ �ԋp�l
    blnRet                      BOOLEAN;                        --BOOLEAN�^ �ԋp�l
    UTL_FileHandle              UTL_FILE.FILE_TYPE;             --�t�@�C���n���h��
    UTL_FileCsvHandle           UTL_FILE.FILE_TYPE;             --�������CSV�t�@�C���n���h��
    vc2AcptRsltTempCtlNo        VARCHAR2(100);                  --������ю捞�Ǘ��ԍ�
    dtmBusinessOprDate          DATE;                           --�Ɩ��^�p���t
    TypColumnAry                TYP_COLUMN_ARRY;                --���ڐ؂�o���p�o�b�t�@
    vc2CheckLength              VARCHAR2(2048);                 --���������`�F�b�N�p
    vc2ToChar                   VARCHAR2(100);                  --���l���ڂ̕�����ϊ��i���l�����`�F�b�N�p�j
    vc2CheckNum                 VARCHAR2(100);                  --�����_�ȉ��̐��l�؎�i���l�����`�F�b�N�p�j


    /*------------------------------------------------------------------------------
    ' �@�\      : DB�̕����R�[�h�̎擾
    '
    ' �߂�l    : DB�̕����R�[�h
    '
    ' ������    :
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
    ' �@�\      : �u������ю捞�Ǘ��ԍ��v���̔Ԃ���
    '
    ' �߂�l    : ���������u������ю捞�Ǘ��ԍ��v
    '
    ' ������    :
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


/*����������������������������������������������������������������������������������������
�@�������@�@���C�������@�@����������������������������������������������������������������
�@����������������������������������������������������������������������������������������*/
BEGIN
    /*������ю捞�ɓo�^�����f�[�^�̃R�~�b�g�ۃt���O = TRUE */
    blnCsvDataCommit := TRUE;

    /* LogFile �� OPEN */
    blnRet := FncLogOpen(pvc2OutputPath, pvc2OutputName, pvc2PlantCd, pvc2OutputMode, UTL_FileHandle);
    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);
    /* �J�n���b�Z�[�W�̏o�� */
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

    /* �e�J�E���^���N���A���� */
    numCsvReadCount     := 0;       --CSV �Ǎ�����
    numCsvInsertCount   := 0;       --CSV �o�^����
    numMstErrorCount    := 0;       --�}�X�^�G���[����

    vc2Aps          := NULL;
    vc2ApsComment   := NULL;
    vc2Comment      := NULL;
    blnFile         := true;

/*-----------------------------------------------------------------------------
' �c�a�̕����R�[�h�̎擾
'
-----------------------------------------------------------------------------*/

    /* �c�a�̕����R�[�h�擾 */
    vc2DBCharSet := SubFncGetDBCharSet;


/*-----------------------------------------------------------------------------
' �b�r�u�p�X�̎擾
'
-----------------------------------------------------------------------------*/

    IF pnumCsvTakeTyp = CSV_TAKE_TYP_FIX THEN

        BEGIN -- �J�[�\��OPEN
            OPEN curSYS_PARAMETER(ACPT_RSLT_IF_CSV_PATH);
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

            -- ������тb�r�u�p�X�̎擾�Ɏ��s���܂�������
            vc2Aps        := APS_ERR_CSVFILEPATH;
                vc2ApsComment := SUBSTR('(SBM1646)'||LOGMSG_NAME   || '�A' ||
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


/*-----------------------------------------------------------------------------
' �b�r�u�t�@�C���̕����R�[�h�̎擾
'
-----------------------------------------------------------------------------*/

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

/*-----------------------------------------------------------------------------
' �Ɩ��^�p���̎擾
'
-----------------------------------------------------------------------------*/

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
        vc2ApsComment := SUBSTR('(SBM0399)'||LOGMSG_PLANT_CD  ||  LOGMSG_BRAKETS       ||
                                                                  pvc2PlantCd          ||
                                                                  LOGMSG_BRAKETE,
                            1,256);
        RAISE excERR_SKIP;
    END IF;

    CLOSE curBUSINESS_OPR_DATE;
    dtmBusinessOprDate := RtpBUSINESS_OPR_DATE.BUSINESS_OPR_DATE;

/*-----------------------------------------------------------------------------
' ������уt�@�C���̎捞����
'
-----------------------------------------------------------------------------*/

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
        blnFile         := False;
        RAISE excERR_MAST;
    END;

    numMsglogCount := NVL(msgLogData.LAST, 0);

    /* �b�r�u�t�@�C�����A[������ю捞]�Ɏ捞�J�n */
    LOOP
        exit When  blnFile = False ;

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

        /* CSV �Ǎ������@�J�E���g�A�b�v */
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

            /* �K�{���ڃ`�F�b�N */
            IF TypColumnAry( 1) IS NULL THEN        -- ��Ǝw���ԍ�
                -- CSV�t�@�C���̕K�{���ڂɒl���ݒ肳��Ă��܂���B
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

            /*���l�`�F�b�N*/
            IF TypColumnAry(5) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(5)) THEN  --�����
                     NULL;
                ELSE
                        --�b�r�u�t�@�C���Ő��l���ڂ��s���ȃt�H�[�}�b�g�ł�
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

            /*���l�`�F�b�N*/
            IF TypColumnAry(7) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(7)) THEN  --�P��
                     NULL;
                ELSE
                        --�b�r�u�t�@�C���Ő��l���ڂ��s���ȃt�H�[�}�b�g�ł�
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

            /*���l�`�F�b�N*/
            IF TypColumnAry(8) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(8)) THEN  --���H��
                     NULL;
                ELSE
                        --�b�r�u�t�@�C���Ő��l���ڂ��s���ȃt�H�[�}�b�g�ł�
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

            /*���l�`�F�b�N*/
            IF TypColumnAry(9) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(9)) THEN  --�ޗ���
                     NULL;
                ELSE
                        --�b�r�u�t�@�C���Ő��l���ڂ��s���ȃt�H�[�}�b�g�ł�
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

            /*���l�`�F�b�N*/
            IF TypColumnAry(10) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(10)) THEN  --���̑��o��
                     NULL;
                ELSE
                        --�b�r�u�t�@�C���Ő��l���ڂ��s���ȃt�H�[�}�b�g�ł�
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

            /*���l�`�F�b�N*/
            IF TypColumnAry(11) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(11)) THEN  --�l�����z
                     NULL;
                ELSE
                        --�b�r�u�t�@�C���Ő��l���ڂ��s���ȃt�H�[�}�b�g�ł�
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

            /*���l�`�F�b�N*/
            IF TypColumnAry(12) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(12)) THEN  --�בփ��[�g
                     NULL;
                ELSE
                        --�b�r�u�t�@�C���Ő��l���ڂ��s���ȃt�H�[�}�b�g�ł�
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

            /* ���t�`�F�b�N */
            IF TypColumnAry(4) IS NOT NULL  THEN
                IF SubFncCheckDate(TypColumnAry(4)) THEN   --�����
                    NULL;
                ELSE
                    --�b�r�u�t�@�C���œ��t���ڂ��s���ȃt�H�[�}�b�g�ł�
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

            /*�����ԍ��@���������`�F�b�N�@26�����ȏ�̓G���[*/
            vc2CheckLength := LENGTH(TypColumnAry(1)) ;
            IF TypColumnAry(1) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_25 THEN
                    -- �����ȓ��Őݒ肵�Ă��������B
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

            /*�i�ڔԍ��@���������`�F�b�N�@26�����ȏ�̓G���[*/
            vc2CheckLength := LENGTH(TypColumnAry(2)) ;
            IF TypColumnAry(2) IS NOT NULL  THEN
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
             END IF;

            /*����ꏊ�@���������`�F�b�N�@26�����ȏ�̓G���[*/
            vc2CheckLength := LENGTH(TypColumnAry(3)) ;
            IF TypColumnAry(3) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_25 THEN
                    -- �����ȓ��Őݒ肵�Ă��������B
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

            /*�݌Ƀ��b�g�ԍ��@���������`�F�b�N�@26�����ȏ�̓G���[*/
            vc2CheckLength := LENGTH(TypColumnAry(13)) ;
            IF TypColumnAry(13) IS NOT NULL  THEN
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

            /*���[�J���b�g�ԍ��@���������`�F�b�N�@26�����ȏ�̓G���[*/
            vc2CheckLength := LENGTH(TypColumnAry(14)) ;
            IF TypColumnAry(14) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_25 THEN
                    -- �����ȓ��Őݒ肵�Ă��������B
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

            /*�[�i���ԍ��@���������`�F�b�N�@26�����ȏ�̓G���[*/
            vc2CheckLength := LENGTH(TypColumnAry(15)) ;
            IF TypColumnAry(15) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_25 THEN
                    -- �����ȓ��Őݒ肵�Ă��������B
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

            /*������є��l�@���������`�F�b�N�@81�����ȏ�̓G���[*/
            vc2CheckLength := LENGTH(TypColumnAry(16)) ;
            IF TypColumnAry(16) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_25 THEN
                    -- �����ȓ��Őݒ肵�Ă��������B
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

            /*�����ԍ� �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(1) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(1)) THEN
                    NULL;
                ELSE
                    --�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B
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

            /*�i�ڔԍ� �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(2) IS NOT NULL  THEN
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
            END IF;

            /*����ꏊ �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(3) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(3)) THEN
                    NULL;
                ELSE
                    --�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B
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

            /*�����  �����`�F�b�N ������ 15���ȏ�A�܂��͏����_�ȉ�5���ȏ�̏ꍇ�G���[ */
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
                    -- �����ȓ��Őݒ肵�Ă��������B
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

            /*�P��  �����`�F�b�N ������ 15���ȏ�A�܂��͏����_�ȉ�5���ȏ�̏ꍇ�G���[ */
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
                    -- �����ȓ��Őݒ肵�Ă��������B
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

            /*���H��  �����`�F�b�N ������ 15���ȏ�A�܂��͏����_�ȉ�5���ȏ�̏ꍇ�G���[ */
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
                    -- �����ȓ��Őݒ肵�Ă��������B
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

            /*�ޗ���  �����`�F�b�N ������ 15���ȏ�A�܂��͏����_�ȉ�5���ȏ�̏ꍇ�G���[ */
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
                    -- �����ȓ��Őݒ肵�Ă��������B
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

            /*���̑��o��  �����`�F�b�N ������ 15���ȏ�A�܂��͏����_�ȉ�5���ȏ�̏ꍇ�G���[ */
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
                    -- �����ȓ��Őݒ肵�Ă��������B
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

            /*�l�����z  �����`�F�b�N ������ 15���ȏ�A�܂��͏����_�ȉ�5���ȏ�̏ꍇ�G���[ */
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
                    -- �����ȓ��Őݒ肵�Ă��������B
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

            /*�בփ��[�g  �����`�F�b�N ������ 15���ȏ�A�܂��͏����_�ȉ�5���ȏ�̏ꍇ�G���[ */
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
                    -- �����ȓ��Őݒ肵�Ă��������B
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



            /*�P���敪���@Null�ł͂Ȃ��A���A�i1�C2�j�ȊO�̏ꍇ�̓G���[*/
            IF TypColumnAry(6) IS NOT NULL  THEN
                IF TypColumnAry(6) = 1 OR 
                   TypColumnAry(6) = 2 THEN
                   NULL;
                ELSE
                    -- �P���敪���s���ł��B
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

            /*�בփ��[�g�@�O�̏ꍇ�̓G���[*/
            IF TypColumnAry(12) IS NOT NULL  THEN
                IF TypColumnAry(12) = NUMBER_0 THEN
                    -- �בփ��[�g�ɂ́A0���傫�����l����͂��Ă��������B
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

            /*�݌Ƀ��b�g�ԍ��@�u������v��0�܂���Null ���u�݌Ƀ��b�g�ԍ��v�� Null �̏ꍇ�̓G���[*/
            IF TypColumnAry(5) IS NULL OR
               TypColumnAry(5) = NUMBER_0 THEN
               IF TypColumnAry(13) IS NOT NULL THEN
                    -- �������0�̂��߁A�݌Ƀ��b�g�ԍ�����͂ł��܂���B
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

            /*��������t���O���@Null�ł͂Ȃ��A���A�i0,1,2�j�ȊO�̏ꍇ�̓G���[*/
            IF TypColumnAry(17) IS NOT NULL  THEN
                IF TypColumnAry(17) = 0 OR 
                   TypColumnAry(17) = 1 OR
                   TypColumnAry(17) = 2 THEN
                   NULL;
                ELSE
                    -- ��������t���O���s���ł��B
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

            /*��������t���O��0�܂���1�̏ꍇ�A���A�������0�܂���Null�̏ꍇ�̓G���[*/
            IF TypColumnAry(17) IS NOT NULL  THEN
                IF TypColumnAry(17) = 0 OR 
                   TypColumnAry(17) = 1 THEN
                   IF TypColumnAry(5) IS NULL OR
                      TypColumnAry(5) = 0     THEN
                        -- ������������͂ł��B
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

            /*��������t���O��2�̏ꍇ�A���A�������0�ANull�ł͂Ȃ��ꍇ�̓G���[*/
            IF TypColumnAry(17) IS NOT NULL  THEN
                IF TypColumnAry(17) = 2 THEN
                   IF TypColumnAry(5) IS NOT NULL OR
                      TypColumnAry(5) <> 0        THEN
                        -- ��������t���O��0�����ł����A��������o�^����Ă��܂��B
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

            ---------------��CSV���ڂ̃`�F�b�NEnd��------------------

            /*������ю捞�Ǘ��ԍ��̍̔�*/
            vc2AcptRsltTempCtlNo := SubFncGetACPT_RSLT_TEMP_CTL_NO;
                 /* [������ю捞]�@�o�^���� */

            INSERT INTO T_ACPT_RSLT_TEMP( 
                  ACPT_RSLT_TEMP_CTL_NO  --����v��捞�Ǘ��ԍ�
                , PUCH_ODR_CD            --�����ԍ�
                , ITEM_CD                --�i�ڔԍ�
                , WH_CD                  --����ꏊ
                , ACPT_DATE              --�����
                , ACPT_QTY               --�����
                , UNIT_COST_TYP          --�P���敪
                , UNIT_COST              --�P��
                , PROCESSING_COST        --���H��
                , MATERIAL_COST          --�ޗ���
                , OTHER_OVERHEADS        --���̑��o��
                , DISC_AMOUNT            --�l�����z
                , EXCH_RATE              --�בփ��[�g
                , LOT_NO                 --�݌Ƀ��b�g�ԍ�
                , VEND_LOT_NO            --���[�J���b�g�ԍ�
                , DLV_CD                 --�[�i���ԍ�
                , ACPT_RSLT_COMMENT      --������є��l
                , ACPT_RSLT_COMP         --��������t���O
                , TAKE_DATE              --�捞���t
                )VALUES(
                  vc2AcptRsltTempCtlNo   --�̔Ԃ���������ю捞�Ǘ��ԍ�
                , TypColumnAry(1)        --�����ԍ�
                , TypColumnAry(2)        --�i�ڔԍ�
                , TypColumnAry(3)        --����ꏊ
                , TypColumnAry(4)        --�����
                , TypColumnAry(5)        --�����
                , TypColumnAry(6)        --�P���敪
                , TypColumnAry(7)        --�P��
                , TypColumnAry(8)        --���H��
                , TypColumnAry(9)        --�ޗ���
                , TypColumnAry(10)       --���̑��o��
                , TypColumnAry(11)       --�l�����z
                , TypColumnAry(12)       --�בփ��[�g
                , TypColumnAry(13)       --�݌Ƀ��b�g�ԍ�
                , TypColumnAry(14)       --���[�J���b�g�ԍ�
                , TypColumnAry(15)       --�[�i���ԍ�
                , TypColumnAry(16)       --������є��l
                , TypColumnAry(17)       --��������t���O
                , dtmBusinessOprDate     --�Ɩ��^�p��
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
    IF blnCsvDataCommit = TRUE AND numCsvReadCount > 0 THEN
        /* ������ю捞 CSV���������\�� */
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


/*-----------------------------------------------------------------------------
' ��O�I������
'
-----------------------------------------------------------------------------*/
EXCEPTION
    -- ���s�s��
    WHEN excERR_SKIP THEN

        /* CSV File �� CLOSE */
        IF UTL_FILE.IS_OPEN(UTL_FileCsvHandle) = TRUE THEN
            UTL_FILE.FCLOSE(UTL_FileCsvHandle);
        END IF;

        /* �捞CSV�t�@�C���̃��l�[�� */
        /* CSV�捞�����ɂ��A��O�I�����̃t�@�C���̎�舵���𕪊� */
        IF pnumCsvTakeTyp = CSV_TAKE_TYP_FIX THEN
            /* CSV�捞����=1�F�Œ�t�@�C���捞�̏ꍇ�A�捞CSV�t�@�C���̃��l�[���̂� */
            UTL_FILE.FRENAME(vc2CsvFilePath,vc2CsvFile,vc2CsvFilePath,vc2NewFileName);
        ELSIF pnumCsvTakeTyp = CSV_TAKE_TYP_DESINATED THEN
            /* CSV�捞����=2�F�w��t�@�C���捞�̏ꍇ�A�捞CSV�t�@�C���̃��l�[��+�o�b�N�A�b�v�t�H���_�ֈړ� */
            UTL_FILE.FRENAME(vc2CsvFilePath,vc2CsvFile,pvc2CsvBackupPath,vc2NewFileName);
        END IF;

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

        /* �g���[�X���O�̏o��(�I��) */
        blnRet      := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                   pvc2UserId,pvc2BusinessName,
                                   pvc2PlantCd, MY_SQL_NAME, LOGMSG_END);

        COMMIT;

        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

        pnumReturn := STATUS_ERROR; /* �ُ�I�� */


    -- �J�[�\��OPEN����EXCEPTION
    WHEN excERR_MAST THEN

        IF blnFile = TRUE THEN
            /* CSV File �� CLOSE */
            IF UTL_FILE.IS_OPEN(UTL_FileCsvHandle) = TRUE THEN
              UTL_FILE.FCLOSE(UTL_FileCsvHandle);
            END IF;

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

        -- �J�[�\���̃N���[�Y����
        IF curSYS_PARAMETER%ISOPEN = TRUE THEN
            CLOSE curSYS_PARAMETER;           --�y�p�����[�^�z
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

        /* �g���[�X���O�̏o��(�I��) */
        blnRet      := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                   pvc2UserId,pvc2BusinessName,
                                   pvc2PlantCd, MY_SQL_NAME, LOGMSG_END);

        COMMIT;

        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

        /* CSV File �� CLOSE */
        IF UTL_FILE.IS_OPEN(UTL_FileCsvHandle) = TRUE THEN
            UTL_FILE.FCLOSE(UTL_FileCsvHandle);
        END IF;

        pnumReturn := STATUS_ERROR; /* �ُ�I�� */

    -- ���̑��̗�O
    WHEN OTHERS THEN
        /* CSV File �� CLOSE */
        IF UTL_FILE.IS_OPEN(UTL_FileCsvHandle) = TRUE THEN
          UTL_FILE.FCLOSE(UTL_FileCsvHandle);
        END IF;

        /* �捞CSV�t�@�C���̃��l�[�� */
        /* CSV�捞�����ɂ��A��O�I�����̃t�@�C���̎�舵���𕪊� */
        IF pnumCsvTakeTyp = CSV_TAKE_TYP_FIX THEN
            /* CSV�捞����=1�F�Œ�t�@�C���捞�̏ꍇ�A�捞CSV�t�@�C���̃��l�[���̂� */
            UTL_FILE.FRENAME(vc2CsvFilePath,vc2CsvFile,vc2CsvFilePath,vc2NewFileName);
        ELSIF pnumCsvTakeTyp = CSV_TAKE_TYP_DESINATED THEN
            /* CSV�捞����=2�F�w��t�@�C���捞�̏ꍇ�A�捞CSV�t�@�C���̃��l�[��+�o�b�N�A�b�v�t�H���_�ֈړ� */
            UTL_FILE.FRENAME(vc2CsvFilePath,vc2CsvFile,pvc2CsvBackupPath,vc2NewFileName);
        END IF;

        -- �J�[�\���̃N���[�Y����
        IF curSYS_PARAMETER%ISOPEN = TRUE THEN
            CLOSE curSYS_PARAMETER;           --�y�p�����[�^�z
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

        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

        /* CSV File �� CLOSE */
        IF UTL_FILE.IS_OPEN(UTL_FileCsvHandle) = TRUE THEN
            UTL_FILE.FCLOSE(UTL_FileCsvHandle);
        END IF;

        pnumReturn := STATUS_ERROR; /* �ُ�I�� */

END;
/
