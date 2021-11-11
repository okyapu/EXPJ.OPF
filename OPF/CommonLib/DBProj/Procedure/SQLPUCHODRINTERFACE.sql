CREATE OR REPLACE PROCEDURE SQLPUCHODRINTERFACE(
/*------------------------------------------------------------------------------
'
'$Author: zhangran $
'$Revision: 1.3 $
'
' �@�\      :�����v��CSV�捞����
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
' �@�\����  : �����v��CSV�t�@�C����ǂݍ��݁A[�����v��捞]���쐬���܂��B
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

/* ROWTYPE �̐錾 */
    RtpSYS_PARAMETER                curSYS_PARAMETER%ROWTYPE;       -- �y�p�����[�^�z

/* �萔�̐錾 */

    MY_SQL_NAME                         VARCHAR2(84)    := 'SQLPUCHODRINTERFACE';              
    STATUS_NORMAL                       NUMBER(1)       := 1;                                  --����I��
    STATUS_WARNING                      NUMBER(1)       := 2;                                  --�x���I��
    STATUS_ERROR                        NUMBER(1)       := 3;                                  --�ُ�I��
    DATE_FORMAT                         VARCHAR2(72)    := 'YYYY/MM/DD HH24:MI';               -- ���t�ϊ����̃t�H�[�}�b�g
    PATH_SLASH                          VARCHAR2(4)     := '/';                                --�t�@�C���p�X��؂蕶��
    PATH_DELIM                          VARCHAR2(4)     := '\';                                --�t�@�C���p�X��؂蕶��

    DEFAULT_CHAR_SET                    VARCHAR2(32)    := 'JA16SJIS';                         -- S-JIS
    PUCH_ODR_IF_CSV_PATH                VARCHAR2(88)    := 'PUCH_ODR_IF_CSV_PATH';             -- [�p�����[�^].���O
    CSV_CHAR_SET                        VARCHAR2(64)    := 'CSV_CHARACTERSET';                 -- [�p�����[�^].���O
    CSV_TAKE_TYP_FIX                    NUMBER(1)       := 1;                                  -- 1�F�Œ�t�@�C���捞
    CSV_TAKE_TYP_DESINATED              NUMBER(1)       := 2;                                  -- 2�F�w��t�@�C���捞
    CSV_LINE_MAX                        INTEGER         := 2048;                               --�b�r�u�t�@�C���P�s����̍ő吔
    CSV_COLUMN_COUNT                    INTEGER         := 27;                                 --�b�r�u�t�@�C���P�s����̍��ڐ�
    CSV_DELIM                           VARCHAR2(4)     := ',';                                --�b�r�u���ڂ̋�؂蕶��
    LENGTH_25                           NUMBER(2)       := 25;                                 --������:=25
    LENGTH_80                           NUMBER(2)       := 80;                                 --������:=80
    LENGTH_40                           NUMBER(2)       := 40;                                 --������ :=40
    LENGTH_12                           NUMBER(2)       := 12;                                 --������ :=12
    LENGTH_5                            NUMBER(1)       := 5;                                  --������ :=5
    LENGTH_7                            NUMBER(1)       := 7;                                  --������ :=7
    LENGTH_10                           NUMBER(2)       := 10;                                 --������ :=10
    LENGTH_15                           NUMBER(2)       := 15;                                 --������ :=15
    LENGTH_50                           NUMBER(2)       := 50;                                 --������ :=50
    NUMBER_100000000000000              NUMBER(15)      := 100000000000000;                    --���l����:15��
    NUMBER_0                            NUMBER(1)       := 0;                                  --���l:=0

    NON_NO_ITEM_FLG_0                   NUMBER(1)       := 0;                                  --���i�����t���O = 0:���i�ȊO�i�ʏ�d���i�j
    NON_NO_ITEM_FLG_1                   NUMBER(1)       := 1;                                  --���i�����t���O = 1:���i����
    NON_NO_ITEM_TYP_0                   NUMBER(2)       := 0;                                  --���i�������i�敪 = 0�F�݌ɊǗ�������
    NON_NO_ITEM_TYP_1                   NUMBER(2)       := 1;                                  --���i�������i�敪 = 1�F���i
    NON_NO_ITEM_TYP_2                   NUMBER(2)       := 2;                                  --���i�������i�敪 = 2�F�����i
    NON_NO_ITEM_TYP_3                   NUMBER(2)       := 3;                                  --���i�������i�敪 = 3�F���i
    NON_NO_ITEM_TYP_4                   NUMBER(2)       := 4;                                  --���i�������i�敪 = 4�F���ޗ�
    NON_NO_ITEM_TYP_5                   NUMBER(2)       := 5;                                  --���i�������i�敪 = 5�F���̑�
    UNIT_COST_TYP_1                     NUMBER(2)       := 1;                                  --�P���敪 = 1�F���P��
    UNIT_COST_TYP_2                     NUMBER(2)       := 2;                                  --�P���敪 = 2�F���P��

/* EXCEPTION �̐錾 */
    excERR_SKIP                         EXCEPTION;      --���s�s��
    excERR_MAST                         EXCEPTION;      --�J�[�\��OPEN����EXCEPTION
    excCSV_CHECK_ERR                    EXCEPTION;      --CSV�f�[�^�̃`�F�b�N�G���[

/* MESSAGE �̐錾 */
    APS_ERR_CSVFILEPATH                 VARCHAR2(28)    := 'AE60011';   --�����v��b�r�u�p�X�̎擾�Ɏ��s���܂����B
    APS_ERR_CSVFILE                     VARCHAR2(28)    := 'AD60005';   --�t�@�C���̏������ɃG���[���������܂����B
    APS_BATCH_START                     VARCHAR2(28)    := 'AE60010';   --�����v��CSV�捞�������J�n���܂����B
    APS_BATCH_END                       VARCHAR2(28)    := 'AE60012';   --�����v��CSV�捞�������I�����܂����B
    APS_BATCH_EXC                       VARCHAR2(28)    := 'AE60013';   --�����v��CSV�捞�������ُ�I�����܂����B
    APS_ERR_CSV_DATA_FORMAT             VARCHAR2(28)    := 'AD60006';   --CSV�t�@�C�����s���ȃt�H�[�}�b�g�ł��B
    APS_DATA_PROCESSING                 VARCHAR2(28)    := 'AD60014';   --��������
    APS_ERR_REQUIRED                    VARCHAR2(28)    := 'AD60009';   --CSV�t�@�C���̕K�{���ڂɒl���ݒ肳��Ă��܂���B
    APS_ERR_CSV_DATA_DIGIT              VARCHAR2(28)    := 'AA01501';   --�����ȓ��Őݒ肵�Ă��������B
    APS_ERR_CSV_DATA_ILLEGAL            VARCHAR2(28)    := 'AA01524';   --�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B
    APS_ERR_CSV_NUMBER_FORMAT           VARCHAR2(28)    := 'AD60007';   --CSV�t�@�C���Ő��l���ڂ��s���ȃt�H�[�}�b�g�ł��B
    APS_ERR_CSV_DATE_FORMAT             VARCHAR2(28)    := 'AD60008';   --CSV�t�@�C���œ��t���ڂ��s���ȃt�H�[�}�b�g�ł��B
    APS_ERR_NUMBER_MINUS                VARCHAR2(28)    := 'AD60010';   --CSV�t�@�C���̐��l���ڂɃ}�C�i�X�l���ݒ肳��Ă��܂��B

    APS_ERR_ITEM_CD1                    VARCHAR2(28)    := 'AB00002';   --�i�ڔԍ��������͂ł��B
    APS_ERR_NON_NO_ITEM_FLG1            VARCHAR2(28)    := 'AE05070';   --�s���Ȓl���ݒ肳��Ă��܂��B
    APS_ERR_NON_NO_ITEM_TYP1            VARCHAR2(28)    := 'AE05070';   --�s���Ȓl���ݒ肳��Ă��܂��B
    APS_ERR_NON_NO_ITEM_NAME1           VARCHAR2(28)    := 'AE05071';   --���i�����i�ږ��������͂ł��B
    APS_ERR_NON_NO_ITEM_TYP2            VARCHAR2(28)    := 'AE05072';   --���i�������i�敪�������͂ł��B
    APS_ERR_UNIT_COST_TYP1              VARCHAR2(28)    := 'AD20033';   --�P���敪�������͂ł��B
    APS_ERR_UNIT_COST_TYP2              VARCHAR2(28)    := 'AE05070';   --�s���Ȓl���ݒ肳��Ă��܂��B
    APS_ERR_PROCESSING_COST1            VARCHAR2(28)    := 'AE00040';   --���H������͂ł��B
    APS_ERR_MATERIAL_COST1              VARCHAR2(28)    := 'AE00041';   --�ޗ�������͂ł��B
    APS_ERR_OTHER_OVERHEADS1            VARCHAR2(28)    := 'AE00042';   --���̑��o������͂ł��B
    APS_ERR_NON_NO_ITEM_TYP3            VARCHAR2(28)    := 'AE25028';   --���i�w�����̂ݓ��͉\�ł��B

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
    LOGMSG_START_PGNM                   VARCHAR2(400)   := '(SBM1338)�����v��CSV�捞�������J�n���܂����B';
    LOGMSG_END_PGNM                     VARCHAR2(152)   := '(SBM1339)�����v��CSV�捞�������I�����܂����B';
    LOGMSG_CSVFILE                      VARCHAR2(400)   := '(SBM1340)�����v��t�@�C����=';
    LOGMSG_LINECNT                      VARCHAR2(400)   := 'CSV�s�ԍ�=';
    COL_ITEM_CD                         VARCHAR2(200)   := '�i�ڔԍ�';
    COL_PUCH_ODR_DLV_DATE               VARCHAR2(200)   := '�����[��';
    COL_PUCH_ODR_START_DATE             VARCHAR2(200)   := '�����\���';
    COL_PUCH_ODR_QTY                    VARCHAR2(200)   := '������';
    COL_VEND_CD                         VARCHAR2(200)   := '�����R�[�h';
    COL_JOB_ODR_CD                      VARCHAR2(200)   := '����';
    COL_CONFIRM_DLV_DATE                VARCHAR2(200)   := '�����񓚔[��';
    COL_WH_CD                           VARCHAR2(200)   := '����ꏊ';
    COL_PUCH_ODR_COMMENT                VARCHAR2(200)   := '���l';
    COL_NON_NO_ITEM_FLG                 VARCHAR2(200)   := '���i�����t���O';
    COL_NON_NO_ITEM_NAME                VARCHAR2(200)   := '���i�����i�ږ�';
    COL_NON_NO_ITEM_TYP                 VARCHAR2(200)   := '���i�������i�敪';
    COL_NON_NO_ITEM_PUCH_ODR_UNIT       VARCHAR2(200)   := '���i�����P��';
    COL_UNIT_COST_TYP                   VARCHAR2(200)   := '�P���敪';
    COL_UNIT_COST                       VARCHAR2(200)   := '�P��';
    COL_PROCESSING_COST                 VARCHAR2(200)   := '���H��';
    COL_MATERIAL_COST                   VARCHAR2(200)   := '�ޗ���';
    COL_OTHER_OVERHEADS                 VARCHAR2(200)   := '���̑��o��';
    COL_NET_AMOUNT                      VARCHAR2(200)   := '�{�̋��z';
    COL_EXCH_RATE                       VARCHAR2(200)   := '�בփ��[�g';
    COL_ACCT_CD                         VARCHAR2(200)   := '�ȖڃR�[�h';
    COL_DEPT_CD                         VARCHAR2(200)   := '���S����R�[�h';
    COL_PJ_CD                           VARCHAR2(200)   := '�v���W�F�N�g�R�[�h';
    COL_SEG_CONTENTS1                   VARCHAR2(200)   := '�Z�O�����g1';
    COL_SEG_CONTENTS2                   VARCHAR2(200)   := '�Z�O�����g2';
    COL_SEG_CONTENTS3                   VARCHAR2(200)   := '�Z�O�����g3';
    COL_SEG_CONTENTS4                   VARCHAR2(200)   := '�Z�O�����g4';


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
    vc2CsvFilePath              VARCHAR2(1024);                 --�����v��CSV�t�@�C���̊i�[�f�B���N�g��
    vc2CsvFile                  VARCHAR2(1024);                 --�����v��CSV�t�@�C����
    vc2NewFileName              VARCHAR2(1000) := '';           --�t�@�C�����l�[���p
    intIdx                      INTEGER;                        --���ڐ؂�o���p�J�E���^
    vc2WorkBuffer               VARCHAR2(1024);                 --��Ɨp�o�b�t�@
    intColumnMax                INTEGER;                        --�J�������m�F�p
    intColumnOvr                INTEGER;                        --�J�������m�F�p
    blnCsvDataCommit            BOOLEAN;                        --�����v��捞�ɓo�^�����f�[�^�̃R�~�b�g�ۃt���O
    vc2ReadBuffer               VARCHAR2(2048);                 --�ǂݍ��ݗp�o�b�t�@
    numMsglogCount              NUMBER := 0;                    -- ���b�Z�[�W���O��
    numCsvReadCount             NUMBER(10) := 0;                --CSV �Ǎ�����
    numCsvInsertCount           NUMBER(10) := 0;                --CSV �o�^����
    numMstErrorCount            NUMBER(10) := 0;                --�}�X�^�G���[����
    blnFile                     BOOLEAN;                        --BOOLEAN�^ �ԋp�l
    blnRet                      BOOLEAN;                        --BOOLEAN�^ �ԋp�l
    UTL_FileHandle              UTL_FILE.FILE_TYPE;             --�t�@�C���n���h��
    UTL_FileCsvHandle           UTL_FILE.FILE_TYPE;             --�����v��CSV�t�@�C���n���h��
    vc2PuchOdrTempCtlNo         VARCHAR2(100);                  --�����v��捞�Ǘ��ԍ�
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
    ' �@�\      : �u�����v��捞�Ǘ��ԍ��v���̔Ԃ���
    '
    ' �߂�l    : ���������u�����v��捞�Ǘ��ԍ��v
    '
    ' ������    :
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
    /*�����v��捞�ɓo�^�����f�[�^�̃R�~�b�g�ۃt���O = TRUE */
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
            OPEN curSYS_PARAMETER(PUCH_ODR_IF_CSV_PATH);
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

            -- �����v��b�r�u�p�X�̎擾�Ɏ��s���܂���
            vc2Aps        := APS_ERR_CSVFILEPATH;
                vc2ApsComment := SUBSTR('(SBM1646)'||LOGMSG_NAME   || '�A' ||
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
' �����v��t�@�C���̎捞����
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

    /* �b�r�u�t�@�C�����A[�����v��捞]�Ɏ捞�J�n */
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
            IF TypColumnAry( 2) IS NULL THEN        -- �����[��
                -- CSV�t�@�C���̕K�{���ڂɒl���ݒ肳��Ă��܂���B
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

            /* �K�{���ڃ`�F�b�N */
            IF TypColumnAry( 4) IS NULL THEN        -- ������
                -- CSV�t�@�C���̕K�{���ڂɒl���ݒ肳��Ă��܂���B
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

            /* �K�{���ڃ`�F�b�N */
            IF TypColumnAry( 5) IS NULL THEN        -- �����R�[�h
                -- CSV�t�@�C���̕K�{���ڂɒl���ݒ肳��Ă��܂���B
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

            /* �K�{���ڃ`�F�b�N */
            IF TypColumnAry( 8) IS NULL THEN        -- ����ꏊ
                -- CSV�t�@�C���̕K�{���ڂɒl���ݒ肳��Ă��܂���B
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

            /* �K�{���ڃ`�F�b�N */
            IF TypColumnAry( 10) IS NULL THEN        -- ���i�����t���O
                -- CSV�t�@�C���̕K�{���ڂɒl���ݒ肳��Ă��܂���B
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


            /*���l�`�F�b�N*/
            IF TypColumnAry(4) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(4)) THEN  --������
                     NULL;
                ELSE
                        --�b�r�u�t�@�C���Ő��l���ڂ��s���ȃt�H�[�}�b�g�ł�
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

            /*���l�`�F�b�N*/
            IF TypColumnAry(10) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(10)) THEN  --���i�����t���O
                     NULL;
                ELSE
                        --�b�r�u�t�@�C���Ő��l���ڂ��s���ȃt�H�[�}�b�g�ł�
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

            /*���l�`�F�b�N*/
            IF TypColumnAry(12) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(12)) THEN  --���i�������i�敪
                     NULL;
                ELSE
                        --�b�r�u�t�@�C���Ő��l���ڂ��s���ȃt�H�[�}�b�g�ł�
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

            /*���l�`�F�b�N*/
            IF TypColumnAry(14) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(14)) THEN  --�P���敪
                     NULL;
                ELSE
                        --�b�r�u�t�@�C���Ő��l���ڂ��s���ȃt�H�[�}�b�g�ł�
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

            /*���l�`�F�b�N*/
            IF TypColumnAry(15) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(15)) THEN  --�P��
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
            IF TypColumnAry(16) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(16)) THEN  --���H��
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
            IF TypColumnAry(17) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(17)) THEN  --�ޗ���
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
            IF TypColumnAry(18) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(18)) THEN  --���̑��o��
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
            IF TypColumnAry(19) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(19)) THEN  --�{�̋��z
                     NULL;
                ELSE
                        --�b�r�u�t�@�C���Ő��l���ڂ��s���ȃt�H�[�}�b�g�ł�
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

            /*���l�`�F�b�N*/
            IF TypColumnAry(20) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(20)) THEN  --�בփ��[�g
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

            /*�}�C�i�X�`�F�b�N*/
            IF TO_NUMBER(TypColumnAry(4)) < 0 THEN          --������
                -- CSV�t�@�C���̐��l���ڂɃ}�C�i�X�l���ݒ肳��Ă��܂��B
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

            /*�}�C�i�X�`�F�b�N*/
            IF TO_NUMBER(TypColumnAry(15)) < 0 THEN          --�P��
                -- CSV�t�@�C���̐��l���ڂɃ}�C�i�X�l���ݒ肳��Ă��܂��B
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

            /*�}�C�i�X�`�F�b�N*/
            IF TO_NUMBER(TypColumnAry(16)) < 0 THEN          --���H��
                -- CSV�t�@�C���̐��l���ڂɃ}�C�i�X�l���ݒ肳��Ă��܂��B
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

            /*�}�C�i�X�`�F�b�N*/
            IF TO_NUMBER(TypColumnAry(17)) < 0 THEN          --�ޗ���
                -- CSV�t�@�C���̐��l���ڂɃ}�C�i�X�l���ݒ肳��Ă��܂��B
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

            /*�}�C�i�X�`�F�b�N*/
            IF TO_NUMBER(TypColumnAry(18)) < 0 THEN          --���̑��o��
                -- CSV�t�@�C���̐��l���ڂɃ}�C�i�X�l���ݒ肳��Ă��܂��B
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

            /*�}�C�i�X�`�F�b�N*/
            IF TO_NUMBER(TypColumnAry(19)) < 0 THEN          --�{�̋��z
                -- CSV�t�@�C���̐��l���ڂɃ}�C�i�X�l���ݒ肳��Ă��܂��B
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

            /*�}�C�i�X�`�F�b�N*/
            IF TO_NUMBER(TypColumnAry(20)) < 0 THEN          --�בփ��[�g
                -- CSV�t�@�C���̐��l���ڂɃ}�C�i�X�l���ݒ肳��Ă��܂��B
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

            /* ���t�`�F�b�N */
            IF TypColumnAry(2) IS NOT NULL  THEN
                IF SubFncCheckDate(TypColumnAry(2)) THEN   --�����[��
                    NULL;
                ELSE
                    --�b�r�u�t�@�C���œ��t���ڂ��s���ȃt�H�[�}�b�g�ł�
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

            /* ���t�`�F�b�N */
            IF TypColumnAry(3) IS NOT NULL  THEN
                IF SubFncCheckDate(TypColumnAry(3)) THEN   --�����\���
                    NULL;
                ELSE
                    --�b�r�u�t�@�C���œ��t���ڂ��s���ȃt�H�[�}�b�g�ł�
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

            /* ���t�`�F�b�N */
            IF TypColumnAry(7) IS NOT NULL  THEN
                IF SubFncCheckDate(TypColumnAry(7)) THEN   --�����񓚔[��
                    NULL;
                ELSE
                    --�b�r�u�t�@�C���œ��t���ڂ��s���ȃt�H�[�}�b�g�ł�
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

            /*�i�ڔԍ��@���������`�F�b�N�@26�����ȏ�̓G���[*/
            vc2CheckLength := LENGTH(TypColumnAry(1)) ;
            IF TypColumnAry(1) IS NOT NULL  THEN
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

            /*�����R�[�h�@���������`�F�b�N�@26�����ȏ�̓G���[*/
            vc2CheckLength := LENGTH(TypColumnAry(5)) ;
            IF TypColumnAry(5) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_25 THEN
                    -- �����ȓ��Őݒ肵�Ă��������B
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

            /*���ԁ@���������`�F�b�N�@26�����ȏ�̓G���[*/
            vc2CheckLength := LENGTH(TypColumnAry(6)) ;
            IF TypColumnAry(6) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_25 THEN
                    -- �����ȓ��Őݒ肵�Ă��������B
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

            /*����ꏊ�@���������`�F�b�N�@26�����ȏ�̓G���[*/
            vc2CheckLength := LENGTH(TypColumnAry(8)) ;
            IF TypColumnAry(8) IS NOT NULL  THEN
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

            /*���l�@���������`�F�b�N�@81�����ȏ�̓G���[*/
            vc2CheckLength := LENGTH(TypColumnAry(9)) ;
            IF TypColumnAry(9) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_80 THEN
                    -- �����ȓ��Őݒ肵�Ă��������B
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

            /*���i�����i�ږ��@���������`�F�b�N�@41�����ȏ�̓G���[*/
            vc2CheckLength := LENGTH(TypColumnAry(11)) ;
            IF TypColumnAry(11) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_40 THEN
                    -- �����ȓ��Őݒ肵�Ă��������B
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

            /*���i�����P�ʁ@���������`�F�b�N�@13�����ȏ�̓G���[*/
            vc2CheckLength := LENGTH(TypColumnAry(13)) ;
            IF TypColumnAry(13) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_12 THEN
                    -- �����ȓ��Őݒ肵�Ă��������B
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

            /*�ȖڃR�[�h�@���������`�F�b�N�@11�����ȏ�̓G���[*/
            vc2CheckLength := LENGTH(TypColumnAry(21)) ;
            IF TypColumnAry(21) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_10 THEN
                    -- �����ȓ��Őݒ肵�Ă��������B
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

            /*���S����R�[�h�@���������`�F�b�N�@26�����ȏ�̓G���[*/
            vc2CheckLength := LENGTH(TypColumnAry(22)) ;
            IF TypColumnAry(22) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_25 THEN
                    -- �����ȓ��Őݒ肵�Ă��������B
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

            /*�v���W�F�N�g�R�[�h�@���������`�F�b�N�@16�����ȏ�̓G���[*/
            vc2CheckLength := LENGTH(TypColumnAry(23)) ;
            IF TypColumnAry(23) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_15 THEN
                    -- �����ȓ��Őݒ肵�Ă��������B
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

            /*�Z�O�����g1�@���������`�F�b�N�@51�����ȏ�̓G���[*/
            vc2CheckLength := LENGTH(TypColumnAry(24)) ;
            IF TypColumnAry(24) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_50 THEN
                    -- �����ȓ��Őݒ肵�Ă��������B
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

            /*�Z�O�����g2�@���������`�F�b�N�@51�����ȏ�̓G���[*/
            vc2CheckLength := LENGTH(TypColumnAry(25)) ;
            IF TypColumnAry(25) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_50 THEN
                    -- �����ȓ��Őݒ肵�Ă��������B
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

            /*�Z�O�����g3�@���������`�F�b�N�@51�����ȏ�̓G���[*/
            vc2CheckLength := LENGTH(TypColumnAry(26)) ;
            IF TypColumnAry(26) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_50 THEN
                    -- �����ȓ��Őݒ肵�Ă��������B
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

            /*�Z�O�����g4�@���������`�F�b�N�@51�����ȏ�̓G���[*/
            vc2CheckLength := LENGTH(TypColumnAry(27)) ;
            IF TypColumnAry(27) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_50 THEN
                    -- �����ȓ��Őݒ肵�Ă��������B
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

            /*�i�ڔԍ� �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(1) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(1)) THEN
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

            /*�����R�[�h �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(5) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(5)) THEN
                    NULL;
                ELSE
                    --�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B
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

            /*���� �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(6) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(6)) THEN
                    NULL;
                ELSE
                    --�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B
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

            /*����ꏊ �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(8) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(8)) THEN
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

            /*���l �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(9) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(9)) THEN
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
                                                                 || COL_PUCH_ODR_COMMENT
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*���i�����i�ږ� �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(11) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(11)) THEN
                    NULL;
                ELSE
                    --�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B
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

            /*���i�����P�� �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(13) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(13)) THEN
                    NULL;
                ELSE
                    --�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B
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

            /*�ȖڃR�[�h �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(21) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(21)) THEN
                    NULL;
                ELSE
                    --�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B
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

            /*���S����R�[�h �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(22) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(22)) THEN
                    NULL;
                ELSE
                    --�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B
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

            /*�v���W�F�N�g�R�[�h �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(23) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(23)) THEN
                    NULL;
                ELSE
                    --�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B
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

            /*�Z�O�����g1 �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(24) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(24)) THEN
                    NULL;
                ELSE
                    --�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B
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

            /*�Z�O�����g2 �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(25) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(25)) THEN
                    NULL;
                ELSE
                    --�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B
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

            /*�Z�O�����g3 �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(26) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(26)) THEN
                    NULL;
                ELSE
                    --�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B
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

            /*�Z�O�����g4 �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(27) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(27)) THEN
                    NULL;
                ELSE
                    --�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B
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

            /*������  �����`�F�b�N ������ 15���ȏ�A�܂��͏����_�ȉ�5���ȏ�̏ꍇ�G���[ */
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
                    -- �����ȓ��Őݒ肵�Ă��������B
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


            /*�P��  �����`�F�b�N ������ 15���ȏ�A�܂��͏����_�ȉ�5���ȏ�̏ꍇ�G���[ */
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

            /*�{�̋��z  �����`�F�b�N ������ 15���ȏ�A�܂��͏����_�ȉ�5���ȏ�̏ꍇ�G���[ */
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
                    -- �����ȓ��Őݒ肵�Ă��������B
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

            /*�בփ��[�g  �����`�F�b�N ������ 15���ȏ�A�܂��͏����_�ȉ�7���ȏ�̏ꍇ�G���[ */
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


            /* �i�ڔԍ� ���i�����t���O�����i�ȊO�A���i�ڔԍ���NULL�̏ꍇ*/
            IF TypColumnAry(10) = TO_CHAR(NON_NO_ITEM_FLG_0)  THEN      -- ���i�����t���O�����i�ȊO
                IF TypColumnAry(1) IS NULL THEN
                    -- �i�ڔԍ��������͂ł��B
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

            /* �i�ڔԍ� ���i�����t���O�����i�A���i�ڔԍ��Ɣ��i�����i�ږ���NULL�̏ꍇ*/
            IF TypColumnAry(10) = TO_CHAR(NON_NO_ITEM_FLG_1)  THEN      -- ���i�����t���O�����i
                IF TypColumnAry(1) IS NULL AND
                   TypColumnAry(11) IS NULL THEN

                    -- �i�ڔԍ��������͂ł��B
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


            /* ���i�����t���O ���i�����t���O�̒l���R���{�{�b�N�X�f�[�^�ɑ��݂��Ȃ��ꍇ*/
            IF TypColumnAry(10) = TO_CHAR(NON_NO_ITEM_FLG_0) OR      -- 0:���i�ȊO�i�ʏ�d���i�j
               TypColumnAry(10) = TO_CHAR(NON_NO_ITEM_FLG_1) THEN    -- 1:���i����
                NULL;
            ELSE
                -- �s���Ȓl���ݒ肳��Ă��܂��B
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

            /* ���i�����i�ږ� ���i�����t���O�����i�A���i�ڔԍ��Ɣ��i�����i�ږ���NULL�̏ꍇ*/
            IF TypColumnAry(10) = TO_CHAR(NON_NO_ITEM_FLG_1)  THEN      -- ���i�����t���O�����i
                IF TypColumnAry(1) IS NULL AND
                   TypColumnAry(11) IS NULL THEN

                    -- ���i�����i�ږ��������͂ł��B
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

            /* ���i�������i�敪  ���i�������i�敪�̒l���R���{�{�b�N�X�f�[�^�ɑ��݂��Ȃ��ꍇ*/
            IF TypColumnAry(12) IS NOT NULL  THEN
                IF TypColumnAry(12) = TO_CHAR(NON_NO_ITEM_TYP_0) OR      -- 0�F�݌ɊǗ�������
                   TypColumnAry(12) = TO_CHAR(NON_NO_ITEM_TYP_1) OR      -- 1�F���i
                   TypColumnAry(12) = TO_CHAR(NON_NO_ITEM_TYP_2) OR      -- 2�F�����i
                   TypColumnAry(12) = TO_CHAR(NON_NO_ITEM_TYP_3) OR      -- 3�F���i
                   TypColumnAry(12) = TO_CHAR(NON_NO_ITEM_TYP_4) OR      -- 4�F���ޗ�
                   TypColumnAry(12) = TO_CHAR(NON_NO_ITEM_TYP_5) THEN    -- 5�F���̑�
                    NULL;
                ELSE
                    -- �s���Ȓl���ݒ肳��Ă��܂��B
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

            /* ���i�������i�敪 ���i�����t���O�����i�A�����i�������i�敪��NULL�̏ꍇ*/
            IF TypColumnAry(10) = TO_CHAR(NON_NO_ITEM_FLG_1)  THEN      -- ���i�����t���O�����i
                IF TypColumnAry(12) IS NULL THEN

                    -- ���i�������i�敪�������͂ł��B
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

            /* �P���敪  �P����NULL�ȊO���ɒP���敪��NULL�̏ꍇ*/
            IF TypColumnAry(15) IS NOT NULL  THEN      -- �P����null�ȊO
                IF TypColumnAry(14) IS NULL THEN       -- �P���敪��null

                    -- �P���敪�������͂ł��B
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

            /* �P���敪  �P���敪�̒l���R���{�{�b�N�X�f�[�^�ɑ��݂��Ȃ��ꍇ*/
            IF TypColumnAry(14) IS NOT NULL  THEN
                IF TypColumnAry(14) = TO_CHAR(UNIT_COST_TYP_1) OR      -- 1�F���P��
                   TypColumnAry(14) = TO_CHAR(UNIT_COST_TYP_2) THEN    -- 2�F���P��
                    NULL;
                ELSE
                    -- �s���Ȓl���ݒ肳��Ă��܂��B
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

            /* ���H��  �P����NULL�ȊO���ɉ��H�NULL�̏ꍇ*/
            IF TypColumnAry(15) IS NOT NULL  THEN      -- �P����null�ȊO
                IF TypColumnAry(16) IS NULL THEN       -- ���H�null

                    --���H������͂ł��B
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

            /* �ޗ���  �P����NULL�ȊO���ɍޗ��NULL�̏ꍇ*/
            IF TypColumnAry(15) IS NOT NULL  THEN      -- �P����null�ȊO
                IF TypColumnAry(17) IS NULL THEN       -- �ޗ��null

                    --�ޗ�������͂ł��B
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

            /* ���̑��o��  �P����NULL�ȊO���ɂ��̑��o�NULL�̏ꍇ*/
            IF TypColumnAry(15) IS NOT NULL  THEN      -- �P����null�ȊO
                IF TypColumnAry(18) IS NULL THEN       -- ���̑��o�null

                    --���̑��o������͂ł��B
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

            /* �ȖڃR�[�h  ���i�����t���O���u0:���i�ȊO�i�ʏ�d���i�j�v���ɉȖڃR�[�h�����͂���Ă���ꍇ*/
            IF TypColumnAry(10) = TO_CHAR(NON_NO_ITEM_FLG_0)  THEN   -- ���i�����t���O��0:���i�ȊO�i�ʏ�d���i�j
                IF TypColumnAry(21) IS NOT NULL THEN                 -- �ȖڃR�[�h��null�ȊO

                    -- ���i�w�����̂ݓ��͉\�ł��B
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

            /* ���S����R�[�h  ���i�����t���O���u0:���i�ȊO�i�ʏ�d���i�j�v���ɕ��S����R�[�h�����͂���Ă���ꍇ*/
            IF TypColumnAry(10) = TO_CHAR(NON_NO_ITEM_FLG_0)  THEN   -- ���i�����t���O��0:���i�ȊO�i�ʏ�d���i�j
                IF TypColumnAry(22) IS NOT NULL THEN                 -- ���S����R�[�h��null�ȊO

                    -- ���i�w�����̂ݓ��͉\�ł��B
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

            /* �v���W�F�N�g�R�[�h  ���i�����t���O���u0:���i�ȊO�i�ʏ�d���i�j�v���Ƀv���W�F�N�g�R�[�h�����͂���Ă���ꍇ*/
            IF TypColumnAry(10) = TO_CHAR(NON_NO_ITEM_FLG_0)  THEN   -- ���i�����t���O��0:���i�ȊO�i�ʏ�d���i�j
                IF TypColumnAry(23) IS NOT NULL THEN                 -- �v���W�F�N�g�R�[�h��null�ȊO

                    -- ���i�w�����̂ݓ��͉\�ł��B
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

            /* �Z�O�����g1  ���i�����t���O���u0:���i�ȊO�i�ʏ�d���i�j�v���ɃZ�O�����g1�����͂���Ă���ꍇ*/
            IF TypColumnAry(10) = TO_CHAR(NON_NO_ITEM_FLG_0)  THEN   -- ���i�����t���O��0:���i�ȊO�i�ʏ�d���i�j
                IF TypColumnAry(24) IS NOT NULL THEN                 -- �Z�O�����g1��null�ȊO

                    -- ���i�w�����̂ݓ��͉\�ł��B
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

            /* �Z�O�����g2  ���i�����t���O���u0:���i�ȊO�i�ʏ�d���i�j�v���ɃZ�O�����g2�����͂���Ă���ꍇ*/
            IF TypColumnAry(10) = TO_CHAR(NON_NO_ITEM_FLG_0)  THEN   -- ���i�����t���O��0:���i�ȊO�i�ʏ�d���i�j
                IF TypColumnAry(25) IS NOT NULL THEN                 -- �Z�O�����g2��null�ȊO

                    -- ���i�w�����̂ݓ��͉\�ł��B
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

            /* �Z�O�����g3  ���i�����t���O���u0:���i�ȊO�i�ʏ�d���i�j�v���ɃZ�O�����g3�����͂���Ă���ꍇ*/
            IF TypColumnAry(10) = TO_CHAR(NON_NO_ITEM_FLG_0)  THEN   -- ���i�����t���O��0:���i�ȊO�i�ʏ�d���i�j
                IF TypColumnAry(26) IS NOT NULL THEN                 -- �Z�O�����g3��null�ȊO

                    -- ���i�w�����̂ݓ��͉\�ł��B
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

            /* �Z�O�����g4  ���i�����t���O���u0:���i�ȊO�i�ʏ�d���i�j�v���ɃZ�O�����g4�����͂���Ă���ꍇ*/
            IF TypColumnAry(10) = TO_CHAR(NON_NO_ITEM_FLG_0)  THEN   -- ���i�����t���O��0:���i�ȊO�i�ʏ�d���i�j
                IF TypColumnAry(27) IS NOT NULL THEN                 -- �Z�O�����g4��null�ȊO

                    -- ���i�w�����̂ݓ��͉\�ł��B
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

            ---------------��CSV���ڂ̃`�F�b�NEnd��------------------

            /*�����v��捞�Ǘ��ԍ��̍̔�*/
            vc2PuchOdrTempCtlNo := SubFncGetPUCH_ODR_TEMP_CTL_NO;
                 /* [�����v��捞]�@�o�^���� */
            INSERT INTO T_PUCH_ODR_TEMP(
                  PUCH_ODR_TEMP_CTL_NO        --�����v��捞�Ǘ��ԍ�
                , ITEM_CD                     --�i�ڔԍ�
                , PUCH_ODR_DLV_DATE           --�����[��
                , PUCH_ODR_START_DATE         --�����\���
                , PUCH_ODR_QTY                --������
                , VEND_CD                     --�����R�[�h
                , JOB_ODR_CD                  --����
                , CONFIRM_DLV_DATE            --�����񓚔[��
                , WH_CD                       --����ꏊ
                , PUCH_ODR_COMMENT            --���l
                , NON_NO_ITEM_FLG             --���i�����t���O
                , NON_NO_ITEM_NAME            --���i�����i�ږ�
                , NON_NO_ITEM_TYP             --���i�������i�敪
                , NON_NO_ITEM_PUCH_ODR_UNIT   --���i�����P��
                , UNIT_COST_TYP               --�P���敪
                , UNIT_COST                   --�P��
                , PROCESSING_COST             --���H��
                , MATERIAL_COST               --�ޗ���
                , OTHER_OVERHEADS             --���̑��o��
                , NET_AMOUNT                  --�{�̋��z
                , EXCH_RATE                   --�בփ��[�g
                , ACCT_CD                     --�ȖڃR�[�h
                , DEPT_CD                     --���S����R�[�h
                , PJ_CD                       --�v���W�F�N�g�R�[�h
                , SEG_CONTENTS1               --�Z�O�����g1
                , SEG_CONTENTS2               --�Z�O�����g2
                , SEG_CONTENTS3               --�Z�O�����g3
                , SEG_CONTENTS4               --�Z�O�����g4
                  )VALUES(
                  vc2PuchOdrTempCtlNo         --�̔Ԃ��������v��捞�Ǘ��ԍ�
                , TypColumnAry(1)             --�i�ڔԍ�
                , TypColumnAry(2)             --�����[��
                , TypColumnAry(3)             --�����\���
                , TypColumnAry(4)             --������
                , TypColumnAry(5)             --�����R�[�h
                , TypColumnAry(6)             --����
                , TypColumnAry(7)             --�����񓚔[��
                , TypColumnAry(8)             --����ꏊ
                , TypColumnAry(9)             --���l
                , TypColumnAry(10)            --���i�����t���O
                , TypColumnAry(11)            --���i�����i�ږ�
                , TypColumnAry(12)            --���i�������i�敪
                , TypColumnAry(13)            --���i�����P��
                , TypColumnAry(14)            --�P���敪
                , TypColumnAry(15)            --�P��
                , TypColumnAry(16)            --���H��
                , TypColumnAry(17)            --�ޗ���
                , TypColumnAry(18)            --���̑��o��
                , TypColumnAry(19)            --�{�̋��z
                , TypColumnAry(20)            --�בփ��[�g
                , TypColumnAry(21)            --�ȖڃR�[�h
                , TypColumnAry(22)            --���S����R�[�h
                , TypColumnAry(23)            --�v���W�F�N�g�R�[�h
                , TypColumnAry(24)            --�Z�O�����g1
                , TypColumnAry(25)            --�Z�O�����g2
                , TypColumnAry(26)            --�Z�O�����g3
                , TypColumnAry(27)            --�Z�O�����g4
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
        /* �����v��捞 CSV���������\�� */
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
