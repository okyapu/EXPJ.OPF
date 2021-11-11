CREATE OR REPLACE PROCEDURE SQLOPRRSLTINTERFACE(
/*------------------------------------------------------------------------------
'
'$Author: zhangran $
'$Revision: 1.4 $
'
' �@�\      :��Ǝ���CSV�捞����
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
' �@�\����  : ��Ǝ���CSV�t�@�C����ǂݍ��݁A[��Ǝ��ю捞]���쐬���܂��B
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

    MY_SQL_NAME                         VARCHAR2(84)    := 'SQLOPRRSLTINTERFACE';              
    STATUS_NORMAL                       NUMBER(1)       := 1;                                  --����I��
    STATUS_WARNING                      NUMBER(1)       := 2;                                  --�x���I��
    STATUS_ERROR                        NUMBER(1)       := 3;                                  --�ُ�I��
    DATE_FORMAT                         VARCHAR2(72)    := 'YYYY/MM/DD HH24:MI';               -- ���t�ϊ����̃t�H�[�}�b�g
    PATH_SLASH                          VARCHAR2(4)     := '/';                                --�t�@�C���p�X��؂蕶��
    PATH_DELIM                          VARCHAR2(4)     := '\';                                --�t�@�C���p�X��؂蕶��

    DEFAULT_CHAR_SET                    VARCHAR2(32)    := 'JA16SJIS';                         -- S-JIS
    OPR_RSLT_IF_CSV_PATH                VARCHAR2(88)    := 'OPR_RSLT_IF_CSV_PATH';             -- [�p�����[�^].���O
    CSV_CHAR_SET                        VARCHAR2(64)    := 'CSV_CHARACTERSET';                 -- [�p�����[�^].���O
    CSV_TAKE_TYP_FIX                    NUMBER(1)       := 1;                                  -- 1�F�Œ�t�@�C���捞
    CSV_TAKE_TYP_DESINATED              NUMBER(1)       := 2;                                  -- 2�F�w��t�@�C���捞
    CSV_LINE_MAX                        INTEGER         := 2048;                               --�b�r�u�t�@�C���P�s����̍ő吔
    CSV_COLUMN_COUNT                    INTEGER         := 34;                                 --�b�r�u�t�@�C���P�s����̍��ڐ�
    CSV_DELIM                           VARCHAR2(4)     := ',';                                --�b�r�u���ڂ̋�؂蕶��

    LENGTH_25                           NUMBER(2)       := 25;                                 --������:=25
    LENGTH_40                           NUMBER(2)       := 40;                                 --������:=40
    LENGTH_80                           NUMBER(2)       := 80;                                 --������:=80
    LENGTH_5                            NUMBER(1)       :=5;                                   --������ :=5
    NUMBER_100000000000000              NUMBER(15)      :=100000000000000;                     --���l����:15��
    NUMBER_0                            NUMBER(1)       :=0;                                   --���l:=0


/* EXCEPTION �̐錾 */
    excERR_SKIP                         EXCEPTION;      --���s�s��
    excERR_MAST                         EXCEPTION;      --�J�[�\��OPEN����EXCEPTION
    excCSV_CHECK_ERR                    EXCEPTION;      --CSV�f�[�^�̃`�F�b�N�G���[

/* MESSAGE �̐錾 */
    APS_ERR_CSVFILEPATH                 VARCHAR2(28)    := 'AD60053';   --��Ǝ��тb�r�u�p�X�̎擾�Ɏ��s���܂����B
    APS_ERR_CSVFILE                     VARCHAR2(28)    := 'AD60005';   --�t�@�C���̏������ɃG���[���������܂����B
    APS_BATCH_START                     VARCHAR2(28)    := 'AD60052';   --��Ǝ���CSV�捞�������J�n���܂����B
    APS_BATCH_END                       VARCHAR2(28)    := 'AD60049';   --��Ǝ���CSV�捞�������I�����܂����B
    APS_ERR_BUSINESS_DATE               VARCHAR2(28)    := 'AD60044';   --�Ɩ����t�̎擾�Ɏ��s���܂����B
    APS_BATCH_EXC                       VARCHAR2(28)    := 'AD60050';   --��Ǝ���CSV�捞�������ُ�I�����܂����B
    APS_ERR_CSV_DATA_FORMAT             VARCHAR2(28)    := 'AD60006';   --CSV�t�@�C�����s���ȃt�H�[�}�b�g�ł��B
    APS_DATA_PROCESSING                 VARCHAR2(28)    := 'AD60014';   --��������
    APS_ERR_REQUIRED                    VARCHAR2(28)    := 'AD60009';   --CSV�t�@�C���̕K�{���ڂɒl���ݒ肳��Ă��܂���B
    APS_ERR_CSV_DATA_DIGIT              VARCHAR2(28)    := 'AA01501';   --�����ȓ��Őݒ肵�Ă��������B
    APS_ERR_CSV_DATA_ILLEGAL            VARCHAR2(28)    := 'AA01524';   --�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B
    APS_ERR_CSV_NUMBER_FORMAT           VARCHAR2(28)    := 'AD60007';   --CSV�t�@�C���Ő��l���ڂ��s���ȃt�H�[�}�b�g�ł��B
    APS_ERR_CSV_DATE_FORMAT             VARCHAR2(28)    := 'AD60008';   --CSV�t�@�C���œ��t���ڂ��s���ȃt�H�[�}�b�g�ł��B
    APS_ERR_CSV_ZERO                    VARCHAR2(28)    := 'AD00221';   --�s�Ǘ��R�R�[�h���s���ł��B
    APS_ERR_OPR_TIME_UNIT_TYP           VARCHAR2(28)    := 'AD00226';   --��Ǝ��ԒP�ʋ敪���s���ł��B
    APS_ERR_LOT_NO                      VARCHAR2(28)    := 'AD20139';   --�Ǖi����0�Ȃ̂ō݌Ƀ��b�g�ԍ��̓��͂͂ł��܂���B
    APS_ERR_OPR_CMPLT_FLG1              VARCHAR2(28)    := 'AD00119';   --��Ɗ����t���O���s���ł��B
    APS_ERR_OPR_CMPLT_FLG2              VARCHAR2(28)    := 'AE00201';   --��Ɗ����t���O��0�����ł����A�Ǖi���A�s�ǐ��܂��͍�Ǝ��Ԃ��o�^����Ă��܂��B
    APS_ERR_CHILD_RSLTUPDATE_FLG        VARCHAR2(28)    := 'AD00122';   --�q�i�ڈꊇ�X�V�t���O���s���ł��B



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
    LOGMSG_START_PGNM                   VARCHAR2(400)   := '(SBM1332)��Ǝ���CSV�捞�������J�n���܂����B';
    LOGMSG_END_PGNM                     VARCHAR2(152)   := '(SBM1333)��Ǝ���CSV�捞�������I�����܂����B';
    LOGMSG_CSVFILE                      VARCHAR2(400)   := '(SBM1334)��Ǝ��уt�@�C����=';
    LOGMSG_LINECNT                      VARCHAR2(400)   := 'CSV�s�ԍ�=';
    COL_OPR_INST_CD                     VARCHAR2(200):= '��Ǝw���ԍ�';
    COL_ITEM_CD                         VARCHAR2(200):= '�i�ڔԍ�';
    COL_ACPT_QTY                        VARCHAR2(200):= '�Ǖi��';
    COL_DEFECT_QTY                      VARCHAR2(200):= '�s�ǐ�';
    COL_OPR_DATE                        VARCHAR2(200):= '��Ɠ�';
    COL_WH_CD                           VARCHAR2(200):= '�ۊǋ�R�[�h';
    COL_WS_CD                           VARCHAR2(200):= '��Ƌ�R�[�h';
    COL_OPR_RSLT_PERSON                 VARCHAR2(200):= '��ƒS����';
    COL_OPR_RSLT_COMMENT                VARCHAR2(200):= '���l';
    COL_OPR_TIME_UNIT_TYP               VARCHAR2(200):= '��Ǝ��ԒP�ʋ敪';
    COL_PRE_ARRANGEMENT_TIME            VARCHAR2(200):= '�O�i�掞��';
    COL_POST_ARRANGEMENT_TIME           VARCHAR2(200):= '��i�掞��';
    COL_OPR_TIME                        VARCHAR2(200):= '��Ǝ���';
    COL_CESSATION_TIME                  VARCHAR2(200):= '��~����';
    COL_CESSATION_CAUSE                 VARCHAR2(200):= '��~���R';
    COL_LOT_NO                          VARCHAR2(200):= '�݌Ƀ��b�g�ԍ�';
    COL_VEND_LOT_NO                     VARCHAR2(200):= '���[�J���b�g�ԍ�';
    COL_DEFECT_CAUSE_CD1                VARCHAR2(200):= '�s�Ǘ��R�R�[�h1';
    COL_DEFECT_QTY1                     VARCHAR2(200):= '�s�ǐ�1';
    COL_DEFECT_COMMENT1                 VARCHAR2(200):= '�s�ǔ��l1';
    COL_DEFECT_CAUSE_CD2                VARCHAR2(200):= '�s�Ǘ��R�R�[�h2';
    COL_DEFECT_QTY2                     VARCHAR2(200):= '�s�ǐ�2';
    COL_DEFECT_COMMENT2                 VARCHAR2(200):= '�s�ǔ��l2';
    COL_DEFECT_CAUSE_CD3                VARCHAR2(200):= '�s�Ǘ��R�R�[�h3';
    COL_DEFECT_QTY3                     VARCHAR2(200):= '�s�ǐ�3';
    COL_DEFECT_COMMENT3                 VARCHAR2(200):= '�s�ǔ��l3';
    COL_DEFECT_CAUSE_CD4                VARCHAR2(200):= '�s�Ǘ��R�R�[�h4';
    COL_DEFECT_QTY4                     VARCHAR2(200):= '�s�ǐ�4';
    COL_DEFECT_COMMENT4                 VARCHAR2(200):= '�s�ǔ��l4';
    COL_DEFECT_CAUSE_CD5                VARCHAR2(200):= '�s�Ǘ��R�R�[�h5';
    COL_DEFECT_QTY5                     VARCHAR2(200):= '�s�ǐ�5';
    COL_DEFECT_COMMENT5                 VARCHAR2(200):= '�s�ǔ��l5';
    COL_OPR_CMPLT_FLG                   VARCHAR2(200):= '��Ɗ����t���O';
    COL_CHILD_RSLTUPDATE_FLG            VARCHAR2(200):= '�q�i�ڈꊇ�X�V�t���O';

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
    vc2CsvFilePath              VARCHAR2(1024);                 --��Ǝ���CSV�t�@�C���̊i�[�f�B���N�g��
    vc2CsvFile                  VARCHAR2(1024);                 --��Ǝ���CSV�t�@�C����
    vc2NewFileName              VARCHAR2(1000) := '';           --�t�@�C�����l�[���p
    intIdx                      INTEGER;                        --���ڐ؂�o���p�J�E���^
    vc2WorkBuffer               VARCHAR2(1024);                 --��Ɨp�o�b�t�@
    intColumnMax                INTEGER;                        --�J�������m�F�p
    intColumnOvr                INTEGER;                        --�J�������m�F�p
    blnCsvDataCommit            BOOLEAN;                        --��Ǝ��ю捞�ɓo�^�����f�[�^�̃R�~�b�g�ۃt���O
    vc2ReadBuffer               VARCHAR2(2048);                 --�ǂݍ��ݗp�o�b�t�@
    numMsglogCount              NUMBER := 0;                    -- ���b�Z�[�W���O��
    numCsvReadCount             NUMBER(10) := 0;                --CSV �Ǎ�����
    numCsvInsertCount           NUMBER(10) := 0;                --CSV �o�^����
    numMstErrorCount            NUMBER(10) := 0;                --�}�X�^�G���[����
    blnFile                     BOOLEAN;                        --BOOLEAN�^ �ԋp�l
    blnRet                      BOOLEAN;                        --BOOLEAN�^ �ԋp�l
    UTL_FileHandle              UTL_FILE.FILE_TYPE;             --�t�@�C���n���h��
    UTL_FileCsvHandle           UTL_FILE.FILE_TYPE;             --��Ǝ���CSV�t�@�C���n���h��
    vc2OprRsltTempCtlNo         VARCHAR2(100);                  --��Ǝ��ю捞�Ǘ��ԍ�
    dtmBusinessOprDate          DATE;                           --�Ɩ��^�p���t
    TypColumnAry                TYP_COLUMN_ARRY;                --���ڐ؂�o���p�o�b�t�@
    vc2CheckLength              VARCHAR2(2048);                 --���������`�F�b�N�p
    vc2ToChar                   VARCHAR2(100);                  --���l���ڂ̕�����ϊ��i���l�����`�F�b�N�p�j
    vc2CheckNum                 VARCHAR2(100);                  --�����_�ȉ��̐��l�؎�i���l�����`�F�b�N�p�j
    blnOcfErrorFlg              BOOLEAN;                        --��Ɗ����t���O�G���[�`�F�b�N�p�t���O


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
    ' �@�\      : �u��Ǝ��ю捞�Ǘ��ԍ��v���̔Ԃ���
    '
    ' �߂�l    : ���������u��Ǝ��ю捞�Ǘ��ԍ��v
    '
    ' ������    :
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncGetOPR_RSLT_TEMP_CTL_NO RETURN VARCHAR2
    IS
        numNumber           NUMBER(10);
        TypSEQ_VAL          T_OPR_RSLT_TEMP.OPR_RSLT_TEMP_CTL_NO%TYPE;
    BEGIN
        SELECT SEQ_OPR.NEXTVAL INTO numNumber FROM DUAL;

        TypSEQ_VAL := LPAD(TO_CHAR(numNumber), 10, '0');
        TypSEQ_VAL := 'ORT' || TypSEQ_VAL;

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
    /*��Ǝ��ю捞�ɓo�^�����f�[�^�̃R�~�b�g�ۃt���O = TRUE */
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
            OPEN curSYS_PARAMETER(OPR_RSLT_IF_CSV_PATH);
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

            -- ��Ǝ��тb�r�u�p�X�̎擾�Ɏ��s���܂���
            vc2Aps        := APS_ERR_CSVFILEPATH;
                vc2ApsComment := SUBSTR('(SBM1646)'||LOGMSG_NAME   || '�A' ||
                                                     LOGMSG_BRAKETS        ||
                                                     OPR_RSLT_IF_CSV_PATH  ||
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
' ��Ǝ��уt�@�C���̎捞����
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
               vc2ApsComment   := SUBSTR('(SBM1703)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                            || numCsvReadCount
                                                            || LOGMSG_BRAKETE
                                                            || LOGMSG_SPACER
                                                            || LOGMSG_CSV_ERR_COLUMN
                                                            || LOGMSG_BRAKETS
                                                            || COL_OPR_INST_CD
                                                            || LOGMSG_BRAKETE,
                                1,256);
                RAISE excCSV_CHECK_ERR;
            END IF;

            /*���l�`�F�b�N*/
            IF TypColumnAry(3) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(3)) THEN  --�Ǖi��
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
            END IF;

            /*���l�`�F�b�N*/
            IF TypColumnAry(4) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(4)) THEN  --�s�ǐ�
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

            /*���l�`�F�b�N*/
            IF TypColumnAry(10) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(10)) THEN  --��Ǝ��ԒP�ʋ敪
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

            /*���l�`�F�b�N*/
            IF TypColumnAry(11) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(11)) THEN  --�O�i�掞��
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

            /*���l�`�F�b�N*/
            IF TypColumnAry(12) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(12)) THEN  --��i�掞��
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

            /*���l�`�F�b�N*/
            IF TypColumnAry(13) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(13)) THEN  --��Ǝ���
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

            /*���l�`�F�b�N*/
            IF TypColumnAry(14) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(14)) THEN  --��~����
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

            /*���l�`�F�b�N*/
            IF TypColumnAry(19) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(19)) THEN  --�s�ǐ�1
                     NULL;
                ELSE
                        --�b�r�u�t�@�C���Ő��l���ڂ��s���ȃt�H�[�}�b�g�ł�
                        vc2Aps          := APS_ERR_CSV_NUMBER_FORMAT;
                        vc2ApsComment   := SUBSTR('(SBM1711)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                     || numCsvReadCount
                                                                     || LOGMSG_BRAKETE
                                                                     || LOGMSG_SPACER
                                                                     || LOGMSG_CSV_ERR_COLUMN
                                                                     || LOGMSG_BRAKETS
                                                                     || COL_DEFECT_QTY1
                                                                     || LOGMSG_BRAKETE,
                                    1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*���l�`�F�b�N*/
            IF TypColumnAry(22) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(22)) THEN  --�s�ǐ�2
                     NULL;
                ELSE
                        --�b�r�u�t�@�C���Ő��l���ڂ��s���ȃt�H�[�}�b�g�ł�
                        vc2Aps          := APS_ERR_CSV_NUMBER_FORMAT;
                        vc2ApsComment   := SUBSTR('(SBM1712)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                     || numCsvReadCount
                                                                     || LOGMSG_BRAKETE
                                                                     || LOGMSG_SPACER
                                                                     || LOGMSG_CSV_ERR_COLUMN
                                                                     || LOGMSG_BRAKETS
                                                                     || COL_DEFECT_QTY2
                                                                     || LOGMSG_BRAKETE,
                                    1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*���l�`�F�b�N*/
            IF TypColumnAry(25) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(25)) THEN  --�s�ǐ�3
                     NULL;
                ELSE
                        --�b�r�u�t�@�C���Ő��l���ڂ��s���ȃt�H�[�}�b�g�ł�
                        vc2Aps          := APS_ERR_CSV_NUMBER_FORMAT;
                        vc2ApsComment   := SUBSTR('(SBM1713)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                     || numCsvReadCount
                                                                     || LOGMSG_BRAKETE
                                                                     || LOGMSG_SPACER
                                                                     || LOGMSG_CSV_ERR_COLUMN
                                                                     || LOGMSG_BRAKETS
                                                                     || COL_DEFECT_QTY3
                                                                     || LOGMSG_BRAKETE,
                                    1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*���l�`�F�b�N*/
            IF TypColumnAry(28) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(28)) THEN  --�s�ǐ�4
                     NULL;
                ELSE
                        --�b�r�u�t�@�C���Ő��l���ڂ��s���ȃt�H�[�}�b�g�ł�
                        vc2Aps          := APS_ERR_CSV_NUMBER_FORMAT;
                        vc2ApsComment   := SUBSTR('(SBM1714)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                     || numCsvReadCount
                                                                     || LOGMSG_BRAKETE
                                                                     || LOGMSG_SPACER
                                                                     || LOGMSG_CSV_ERR_COLUMN
                                                                     || LOGMSG_BRAKETS
                                                                     || COL_DEFECT_QTY4
                                                                     || LOGMSG_BRAKETE,
                                    1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*���l�`�F�b�N*/
            IF TypColumnAry(31) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(31)) THEN  --�s�ǐ�5
                     NULL;
                ELSE
                        --�b�r�u�t�@�C���Ő��l���ڂ��s���ȃt�H�[�}�b�g�ł�
                        vc2Aps          := APS_ERR_CSV_NUMBER_FORMAT;
                        vc2ApsComment   := SUBSTR('(SBM1715)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                     || numCsvReadCount
                                                                     || LOGMSG_BRAKETE
                                                                     || LOGMSG_SPACER
                                                                     || LOGMSG_CSV_ERR_COLUMN
                                                                     || LOGMSG_BRAKETS
                                                                     || COL_DEFECT_QTY5
                                                                     || LOGMSG_BRAKETE,
                                    1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*���l�`�F�b�N*/
            IF TypColumnAry(33) IS NOT NULL  THEN
                IF SubFncCheckNumber(TypColumnAry(33)) THEN  --��Ɗ����t���O
                     NULL;
                ELSE
                        --�b�r�u�t�@�C���Ő��l���ڂ��s���ȃt�H�[�}�b�g�ł�
                        vc2Aps          := APS_ERR_CSV_NUMBER_FORMAT;
                        vc2ApsComment   := SUBSTR('(SBM1716)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                     || numCsvReadCount
                                                                     || LOGMSG_BRAKETE
                                                                     || LOGMSG_SPACER
                                                                     || LOGMSG_CSV_ERR_COLUMN
                                                                     || LOGMSG_BRAKETS
                                                                     || COL_OPR_CMPLT_FLG
                                                                     || LOGMSG_BRAKETE,
                                    1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /* ���t�`�F�b�N */
            IF TypColumnAry(5) IS NOT NULL  THEN
                IF SubFncCheckDate(TypColumnAry(5)) THEN   --��Ɠ�
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
            END IF;

            /*��Ǝw���ԍ��@���������`�F�b�N�@26�����ȏ�̓G���[*/
            vc2CheckLength := LENGTH(TypColumnAry(1)) ;
            IF TypColumnAry(1) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_25 THEN
                    -- �����ȓ��Őݒ肵�Ă��������B
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1703)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_OPR_INST_CD
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

            /*�ۊǋ�R�[�h�@���������`�F�b�N�@26�����ȏ�̓G���[*/
            vc2CheckLength := LENGTH(TypColumnAry(6)) ;
            IF TypColumnAry(6) IS NOT NULL  THEN
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

            /*��Ƌ�R�[�h�@���������`�F�b�N�@26�����ȏ�̓G���[*/
            vc2CheckLength := LENGTH(TypColumnAry(7)) ;
            IF TypColumnAry(7) IS NOT NULL  THEN
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
             END IF;

            /*��ƒS���ҁ@���������`�F�b�N�@41�����ȏ�̓G���[*/
            vc2CheckLength := LENGTH(TypColumnAry(8)) ;
            IF TypColumnAry(8) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_40 THEN
                    -- �����ȓ��Őݒ肵�Ă��������B
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1720)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_OPR_RSLT_PERSON
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
                                                                 || COL_OPR_RSLT_COMMENT
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                RAISE excCSV_CHECK_ERR;
                END IF;
             END IF;

            /*��~���R�@���������`�F�b�N�@81�����ȏ�̓G���[*/
            vc2CheckLength := LENGTH(TypColumnAry(15)) ;
            IF TypColumnAry(15) IS NOT NULL  THEN
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

            /*�݌Ƀ��b�g�ԍ��@���������`�F�b�N�@26�����ȏ�̓G���[*/
            vc2CheckLength := LENGTH(TypColumnAry(16)) ;
            IF TypColumnAry(16) IS NOT NULL  THEN
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
            vc2CheckLength := LENGTH(TypColumnAry(17)) ;
            IF TypColumnAry(17) IS NOT NULL  THEN
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

            /*�s�Ǘ��R�R�[�h1�@���������`�F�b�N�@26�����ȏ�̓G���[*/
            vc2CheckLength := LENGTH(TypColumnAry(18)) ;
            IF TypColumnAry(18) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_25 THEN
                    -- �����ȓ��Őݒ肵�Ă��������B
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1723)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_DEFECT_CAUSE_CD1
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                RAISE excCSV_CHECK_ERR;
                END IF;
             END IF;

            /*�s�Ǘ��R�R�[�h2�@���������`�F�b�N�@26�����ȏ�̓G���[*/
            vc2CheckLength := LENGTH(TypColumnAry(21)) ;
            IF TypColumnAry(21) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_25 THEN
                    -- �����ȓ��Őݒ肵�Ă��������B
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1724)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_DEFECT_CAUSE_CD2
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                RAISE excCSV_CHECK_ERR;
                END IF;
             END IF;

            /*�s�Ǘ��R�R�[�h3�@���������`�F�b�N�@26�����ȏ�̓G���[*/
            vc2CheckLength := LENGTH(TypColumnAry(24)) ;
            IF TypColumnAry(24) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_25 THEN
                    -- �����ȓ��Őݒ肵�Ă��������B
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1725)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_DEFECT_CAUSE_CD3
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                RAISE excCSV_CHECK_ERR;
                END IF;
             END IF;

            /*�s�Ǘ��R�R�[�h4�@���������`�F�b�N�@26�����ȏ�̓G���[*/
            vc2CheckLength := LENGTH(TypColumnAry(27)) ;
            IF TypColumnAry(27) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_25 THEN
                    -- �����ȓ��Őݒ肵�Ă��������B
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1726)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_DEFECT_CAUSE_CD4
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                RAISE excCSV_CHECK_ERR;
                END IF;
             END IF;

            /*�s�Ǘ��R�R�[�h5�@���������`�F�b�N�@26�����ȏ�̓G���[*/
            vc2CheckLength := LENGTH(TypColumnAry(30)) ;
            IF TypColumnAry(30) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_25 THEN
                    -- �����ȓ��Őݒ肵�Ă��������B
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1727)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_DEFECT_CAUSE_CD5
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                RAISE excCSV_CHECK_ERR;
                END IF;
             END IF;

            /*�s�ǔ��l1�@���������`�F�b�N�@81�����ȏ�̓G���[*/
            vc2CheckLength := LENGTH(TypColumnAry(20)) ;
            IF TypColumnAry(20) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_80 THEN
                    -- �����ȓ��Őݒ肵�Ă��������B
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1728)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_DEFECT_COMMENT1
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                RAISE excCSV_CHECK_ERR;
                END IF;
             END IF;

            /*�s�ǔ��l2�@���������`�F�b�N�@81�����ȏ�̓G���[*/
            vc2CheckLength := LENGTH(TypColumnAry(23)) ;
            IF TypColumnAry(23) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_80 THEN
                    -- �����ȓ��Őݒ肵�Ă��������B
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1729)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_DEFECT_COMMENT2
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                RAISE excCSV_CHECK_ERR;
                END IF;
             END IF;

            /*�s�ǔ��l3�@���������`�F�b�N�@81�����ȏ�̓G���[*/
            vc2CheckLength := LENGTH(TypColumnAry(26)) ;
            IF TypColumnAry(26) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_80 THEN
                    -- �����ȓ��Őݒ肵�Ă��������B
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1730)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_DEFECT_COMMENT3
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                RAISE excCSV_CHECK_ERR;
                END IF;
             END IF;

            /*�s�ǔ��l4�@���������`�F�b�N�@81�����ȏ�̓G���[*/
            vc2CheckLength := LENGTH(TypColumnAry(29)) ;
            IF TypColumnAry(29) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_80 THEN
                    -- �����ȓ��Őݒ肵�Ă��������B
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1731)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_DEFECT_COMMENT4
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                RAISE excCSV_CHECK_ERR;
                END IF;
             END IF;

            /*�s�ǔ��l5�@���������`�F�b�N�@81�����ȏ�̓G���[*/
            vc2CheckLength := LENGTH(TypColumnAry(32)) ;
            IF TypColumnAry(32) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_80 THEN
                    -- �����ȓ��Őݒ肵�Ă��������B
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1732)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_DEFECT_COMMENT5
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                RAISE excCSV_CHECK_ERR;
                END IF;
             END IF;

            /*��Ǝw���ԍ� �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(1) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(1)) THEN
                    NULL;
                ELSE
                    --�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B
                    vc2Aps          := APS_ERR_CSV_DATA_ILLEGAL;
                    vc2ApsComment   := SUBSTR('(SBM1703)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_OPR_INST_CD
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

            /*�ۊǋ�R�[�h �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(6) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(6)) THEN
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

            /*��Ƌ�R�[�h �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(7) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(7)) THEN
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
            END IF;

            /*��ƒS���� �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(8) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(8)) THEN
                    NULL;
                ELSE
                    --�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B
                    vc2Aps          := APS_ERR_CSV_DATA_ILLEGAL;
                    vc2ApsComment   := SUBSTR('(SBM1720)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_OPR_RSLT_PERSON
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
                                                                 || COL_OPR_RSLT_COMMENT
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*��~���R �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(15) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(15)) THEN
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

            /*�݌Ƀ��b�g�ԍ� �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(16) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(16)) THEN
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

            /*���[�J���b�g�ԍ� �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(17) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(17)) THEN
                    NULL;
                ELSE
                    --�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B
                    vc2Aps          := APS_ERR_CSV_DATA_ILLEGAL;
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

            /*�s�Ǘ��R�R�[�h1 �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(18) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(18)) THEN
                    NULL;
                ELSE
                    --�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B
                    vc2Aps          := APS_ERR_CSV_DATA_ILLEGAL;
                    vc2ApsComment   := SUBSTR('(SBM1723)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_DEFECT_CAUSE_CD1
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*�s�Ǘ��R�R�[�h2 �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(21) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(21)) THEN
                    NULL;
                ELSE
                    --�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B
                    vc2Aps          := APS_ERR_CSV_DATA_ILLEGAL;
                    vc2ApsComment   := SUBSTR('(SBM1724)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_DEFECT_CAUSE_CD2
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*�s�Ǘ��R�R�[�h3 �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(24) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(24)) THEN
                    NULL;
                ELSE
                    --�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B
                    vc2Aps          := APS_ERR_CSV_DATA_ILLEGAL;
                    vc2ApsComment   := SUBSTR('(SBM1725)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_DEFECT_CAUSE_CD3
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*�s�Ǘ��R�R�[�h4 �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(27) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(27)) THEN
                    NULL;
                ELSE
                    --�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B
                    vc2Aps          := APS_ERR_CSV_DATA_ILLEGAL;
                    vc2ApsComment   := SUBSTR('(SBM1726)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_DEFECT_CAUSE_CD4
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*�s�Ǘ��R�R�[�h5 �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(30) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(30)) THEN
                    NULL;
                ELSE
                    --�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B
                    vc2Aps          := APS_ERR_CSV_DATA_ILLEGAL;
                    vc2ApsComment   := SUBSTR('(SBM1727)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_DEFECT_CAUSE_CD5
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*�s�ǔ��l1 �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(20) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(20)) THEN
                    NULL;
                ELSE
                    --�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B
                    vc2Aps          := APS_ERR_CSV_DATA_ILLEGAL;
                    vc2ApsComment   := SUBSTR('(SBM1728)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_DEFECT_COMMENT1
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*�s�ǔ��l2 �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(23) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(23)) THEN
                    NULL;
                ELSE
                    --�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B
                    vc2Aps          := APS_ERR_CSV_DATA_ILLEGAL;
                    vc2ApsComment   := SUBSTR('(SBM1729)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_DEFECT_COMMENT2
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;
            /*�s�ǔ��l3 �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(26) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(26)) THEN
                    NULL;
                ELSE
                    --�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B
                    vc2Aps          := APS_ERR_CSV_DATA_ILLEGAL;
                    vc2ApsComment   := SUBSTR('(SBM1730)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_DEFECT_COMMENT3
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;
            /*�s�ǔ��l4 �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(29) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(29)) THEN
                    NULL;
                ELSE
                    --�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B
                    vc2Aps          := APS_ERR_CSV_DATA_ILLEGAL;
                    vc2ApsComment   := SUBSTR('(SBM1731)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_DEFECT_COMMENT4
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;
            /*�s�ǔ��l5 �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(32) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(32)) THEN
                    NULL;
                ELSE
                    --�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B
                    vc2Aps          := APS_ERR_CSV_DATA_ILLEGAL;
                    vc2ApsComment   := SUBSTR('(SBM1732)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_DEFECT_COMMENT5
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*�Ǖi��  �����`�F�b�N ������ 15���ȏ�A�܂��͏����_�ȉ�5���ȏ�̏ꍇ�G���[ */
            vc2ToChar      :=0;
            vc2CheckNum    :=0;
            vc2CheckLength :=0;
            IF TypColumnAry(3) IS NOT NULL  THEN
                IF MOD(TypColumnAry(3),1) > 0 THEN
                   vc2ToChar :=TO_CHAR(TypColumnAry(3));
                   vc2CheckNum := SUBSTR(vc2ToChar,INSTR(vc2ToChar,'.')+1);
                   vc2CheckLength := LENGTH(vc2CheckNum) ;
                ELSE
                   vc2CheckLength :=0;
                END IF;

                IF TypColumnAry(3) < NUMBER_100000000000000 AND
                   vc2CheckLength  < LENGTH_5 THEN
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
            END IF;

            /*�s�ǐ�  �����`�F�b�N ������ 15���ȏ�A�܂��͏����_�ȉ�5���ȏ�̏ꍇ�G���[ */
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

            /*�O�i�掞��  �����`�F�b�N ������ 15���ȏ�A�܂��͏����_�ȉ�5���ȏ�̏ꍇ�G���[ */
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

            /*��i�掞��  �����`�F�b�N ������ 15���ȏ�A�܂��͏����_�ȉ�5���ȏ�̏ꍇ�G���[ */
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

            /*��Ǝ���  �����`�F�b�N ������ 15���ȏ�A�܂��͏����_�ȉ�5���ȏ�̏ꍇ�G���[ */
            vc2ToChar      :=0;
            vc2CheckNum    :=0;
            vc2CheckLength :=0;
            IF TypColumnAry(13) IS NOT NULL  THEN
                IF MOD(TypColumnAry(13),1) > 0 THEN
                   vc2ToChar :=TO_CHAR(TypColumnAry(13));
                   vc2CheckNum := SUBSTR(vc2ToChar,INSTR(vc2ToChar,'.')+1);
                   vc2CheckLength := LENGTH(vc2CheckNum) ;
                ELSE
                   vc2CheckLength :=0;
                END IF;

                IF TypColumnAry(13) < NUMBER_100000000000000 AND
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

            /*��~����  �����`�F�b�N ������ 15���ȏ�A�܂��͏����_�ȉ�5���ȏ�̏ꍇ�G���[ */
            vc2ToChar      :=0;
            vc2CheckNum    :=0;
            vc2CheckLength :=0;
            IF TypColumnAry(14) IS NOT NULL  THEN
                IF MOD(TypColumnAry(14),1) > 0 THEN
                   vc2ToChar :=TO_CHAR(TypColumnAry(14));
                   vc2CheckNum := SUBSTR(vc2ToChar,INSTR(vc2ToChar,'.')+1);
                   vc2CheckLength := LENGTH(vc2CheckNum) ;
                ELSE
                   vc2CheckLength :=0;
                END IF;

                IF TypColumnAry(14) < NUMBER_100000000000000 AND
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

            /*�s�ǐ�1  �����`�F�b�N ������ 15���ȏ�A�܂��͏����_�ȉ�5���ȏ�̏ꍇ�G���[ */
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
                    vc2ApsComment   := SUBSTR('(SBM1711)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_DEFECT_QTY1
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*�s�ǐ�2  �����`�F�b�N ������ 15���ȏ�A�܂��͏����_�ȉ�5���ȏ�̏ꍇ�G���[ */
            vc2ToChar      :=0;
            vc2CheckNum    :=0;
            vc2CheckLength :=0;
            IF TypColumnAry(22) IS NOT NULL  THEN
                IF MOD(TypColumnAry(22),1) > 0 THEN
                   vc2ToChar :=TO_CHAR(TypColumnAry(22));
                   vc2CheckNum := SUBSTR(vc2ToChar,INSTR(vc2ToChar,'.')+1);
                   vc2CheckLength := LENGTH(vc2CheckNum) ;
                ELSE
                   vc2CheckLength :=0;
                END IF;

                IF TypColumnAry(22) < NUMBER_100000000000000 AND
                   vc2CheckLength  < LENGTH_5 THEN
                   NULL;

                ELSE
                    -- �����ȓ��Őݒ肵�Ă��������B
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1712)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_DEFECT_QTY2
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*�s�ǐ�3  �����`�F�b�N ������ 15���ȏ�A�܂��͏����_�ȉ�5���ȏ�̏ꍇ�G���[ */
            vc2ToChar      :=0;
            vc2CheckNum    :=0;
            vc2CheckLength :=0;
            IF TypColumnAry(25) IS NOT NULL  THEN
                IF MOD(TypColumnAry(25),1) > 0 THEN
                   vc2ToChar :=TO_CHAR(TypColumnAry(25));
                   vc2CheckNum := SUBSTR(vc2ToChar,INSTR(vc2ToChar,'.')+1);
                   vc2CheckLength := LENGTH(vc2CheckNum) ;
                ELSE
                   vc2CheckLength :=0;
                END IF;

                IF TypColumnAry(25) < NUMBER_100000000000000 AND
                   vc2CheckLength  < LENGTH_5 THEN
                   NULL;

                ELSE
                    -- �����ȓ��Őݒ肵�Ă��������B
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1713)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_DEFECT_QTY3
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*�s�ǐ�4  �����`�F�b�N ������ 15���ȏ�A�܂��͏����_�ȉ�5���ȏ�̏ꍇ�G���[ */
            vc2ToChar      :=0;
            vc2CheckNum    :=0;
            vc2CheckLength :=0;
            IF TypColumnAry(28) IS NOT NULL  THEN
                IF MOD(TypColumnAry(28),1) > 0 THEN
                   vc2ToChar :=TO_CHAR(TypColumnAry(28));
                   vc2CheckNum := SUBSTR(vc2ToChar,INSTR(vc2ToChar,'.')+1);
                   vc2CheckLength := LENGTH(vc2CheckNum) ;
                ELSE
                   vc2CheckLength :=0;
                END IF;

                IF TypColumnAry(28) < NUMBER_100000000000000 AND
                   vc2CheckLength  < LENGTH_5 THEN
                   NULL;

                ELSE
                    -- �����ȓ��Őݒ肵�Ă��������B
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1714)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_DEFECT_QTY4
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*�s�ǐ�5  �����`�F�b�N ������ 15���ȏ�A�܂��͏����_�ȉ�5���ȏ�̏ꍇ�G���[ */
            vc2ToChar      :=0;
            vc2CheckNum    :=0;
            vc2CheckLength :=0;
            IF TypColumnAry(31) IS NOT NULL  THEN
                IF MOD(TypColumnAry(31),1) > 0 THEN
                   vc2ToChar :=TO_CHAR(TypColumnAry(31));
                   vc2CheckNum := SUBSTR(vc2ToChar,INSTR(vc2ToChar,'.')+1);
                   vc2CheckLength := LENGTH(vc2CheckNum) ;
                ELSE
                   vc2CheckLength :=0;
                END IF;

                IF TypColumnAry(31) < NUMBER_100000000000000 AND
                   vc2CheckLength  < LENGTH_5 THEN
                   NULL;

                ELSE
                    -- �����ȓ��Őݒ肵�Ă��������B
                    vc2Aps          := APS_ERR_CSV_DATA_DIGIT;
                    vc2ApsComment   := SUBSTR('(SBM1715)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_DEFECT_QTY5
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;


            /*�s�Ǘ��R�R�[�h1�@�O�̏ꍇ�̓G���[*/
            IF TypColumnAry(18) IS NOT NULL  THEN
                IF TypColumnAry(18) = NUMBER_0 THEN
                    -- �s�Ǘ��R�R�[�h���s���ł��B
                    vc2Aps          := APS_ERR_CSV_ZERO;
                    vc2ApsComment   := SUBSTR('(SBM1723)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_DEFECT_CAUSE_CD1
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
             END IF;

            /*�s�Ǘ��R�R�[�h2�@�O�̏ꍇ�̓G���[*/
            IF TypColumnAry(21) IS NOT NULL  THEN
                IF TypColumnAry(21) = NUMBER_0 THEN
                    -- �s�Ǘ��R�R�[�h���s���ł��B
                    vc2Aps          := APS_ERR_CSV_ZERO;
                    vc2ApsComment   := SUBSTR('(SBM1724)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_DEFECT_CAUSE_CD2
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
             END IF;

            /*�s�Ǘ��R�R�[�h3�@�O�̏ꍇ�̓G���[*/
            IF TypColumnAry(24) IS NOT NULL  THEN
                IF TypColumnAry(24) = NUMBER_0 THEN
                    -- �s�Ǘ��R�R�[�h���s���ł��B
                    vc2Aps          := APS_ERR_CSV_ZERO;
                    vc2ApsComment   := SUBSTR('(SBM1725)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_DEFECT_CAUSE_CD3
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
             END IF;

            /*�s�Ǘ��R�R�[�h4�@�O�̏ꍇ�̓G���[*/
            IF TypColumnAry(27) IS NOT NULL  THEN
                IF TypColumnAry(27) = NUMBER_0 THEN
                    -- �s�Ǘ��R�R�[�h���s���ł��B
                    vc2Aps          := APS_ERR_CSV_ZERO;
                    vc2ApsComment   := SUBSTR('(SBM1726)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_DEFECT_CAUSE_CD4
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
             END IF;

            /*�s�Ǘ��R�R�[�h5�@�O�̏ꍇ�̓G���[*/
            IF TypColumnAry(30) IS NOT NULL  THEN
                IF TypColumnAry(30) = NUMBER_0 THEN
                    -- �s�Ǘ��R�R�[�h���s���ł��B
                    vc2Aps          := APS_ERR_CSV_ZERO;
                    vc2ApsComment   := SUBSTR('(SBM1727)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_DEFECT_CAUSE_CD5
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
             END IF;

            /*��Ǝ��ԒP�ʋ敪���@Null�ł͂Ȃ��A���A�i1�C2�j�ȊO�̏ꍇ�̓G���[*/
            IF TypColumnAry(10) IS NOT NULL  THEN
                IF TypColumnAry(10) = 1 OR 
                   TypColumnAry(10) = 2 THEN
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

            /*�݌Ƀ��b�g�ԍ��@�u�Ǖi���v��0�܂���Null ���u�݌Ƀ��b�g�ԍ��v�� Null �̏ꍇ�̓G���[*/
            IF TypColumnAry(3) IS NULL OR
               TypColumnAry(3) = NUMBER_0 THEN
               IF TypColumnAry(16) IS NOT NULL THEN
                    -- �Ǖi����0�Ȃ̂ō݌Ƀ��b�g�ԍ��̓��͂͂ł��܂���B
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

 
            /*��Ɗ����t���O���@Null�ł͂Ȃ��A���A�i0,1,2�j�ȊO�̏ꍇ�̓G���[*/
            IF TypColumnAry(33) IS NOT NULL  THEN
                IF TypColumnAry(33) = 0 OR 
                   TypColumnAry(33) = 1 OR
                   TypColumnAry(33) = 2 THEN
                   NULL;
                ELSE
                    -- ��Ɗ����t���O���s���ł��B
                    vc2Aps          := APS_ERR_OPR_CMPLT_FLG1;
                    vc2ApsComment   := SUBSTR('(SBM1716)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                 || numCsvReadCount
                                                                 || LOGMSG_BRAKETE
                                                                 || LOGMSG_SPACER
                                                                 || LOGMSG_CSV_ERR_COLUMN
                                                                 || LOGMSG_BRAKETS
                                                                 || COL_OPR_CMPLT_FLG
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
             END IF;

           blnOcfErrorFlg := FALSE;
            /*��Ɗ����t���O��2�̏ꍇ�A�i�u�Ǖi���v +�u�s�ǐ��v+�e��Ǝ��ԁj<>0�j�̏ꍇ�̓G���[*/
           IF TypColumnAry(33) IS NOT NULL  THEN
                IF TypColumnAry(33) = 2 THEN
                    --�Ǖi��
                    IF TypColumnAry(3) IS NULL OR
                       TypColumnAry(3) = NUMBER_0 THEN
                       NULL;
                    ELSE
                       blnOcfErrorFlg :=TRUE;
                    END IF;

                    --�s�Ǖi��
                    IF TypColumnAry(4) IS NULL OR
                       TypColumnAry(4) = NUMBER_0 THEN
                       NULL;
                    ELSE
                       blnOcfErrorFlg :=TRUE;
                    END IF;

                    --�O�i�掞��
                    IF TypColumnAry(11) IS NULL OR
                       TypColumnAry(11) = NUMBER_0 THEN
                       NULL;
                    ELSE
                       blnOcfErrorFlg :=TRUE;
                    END IF;

                    --��i�掞��
                    IF TypColumnAry(12) IS NULL OR
                       TypColumnAry(12) = NUMBER_0 THEN
                       NULL;
                    ELSE
                       blnOcfErrorFlg :=TRUE;
                    END IF;

                    --��Ǝ���
                    IF TypColumnAry(13) IS NULL OR
                       TypColumnAry(13) = NUMBER_0 THEN
                       NULL;
                    ELSE
                       blnOcfErrorFlg :=TRUE;
                    END IF;

                    --��~����
                    IF TypColumnAry(14) IS NULL OR
                       TypColumnAry(14) = NUMBER_0 THEN
                       NULL;
                    ELSE
                       blnOcfErrorFlg :=TRUE;
                    END IF;
                END IF;
             END IF;

             IF  blnOcfErrorFlg = TRUE THEN
                -- ��Ɗ����t���O��0�����ł����A�Ǖi���A�s�ǐ��܂��͍�Ǝ��Ԃ��o�^����Ă��܂��B
                vc2Aps          := APS_ERR_OPR_CMPLT_FLG2;
                vc2ApsComment   := SUBSTR('(SBM1716)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                             || numCsvReadCount
                                                             || LOGMSG_BRAKETE
                                                             || LOGMSG_SPACER
                                                             || LOGMSG_CSV_ERR_COLUMN
                                                             || LOGMSG_BRAKETS
                                                             || COL_OPR_CMPLT_FLG
                                                             || LOGMSG_BRAKETE,
                            1,256);
                RAISE excCSV_CHECK_ERR;
             END IF;
             
             IF TypColumnAry(34) IS NOT NULL THEN
                IF TypColumnAry(34) <> 1 AND TypColumnAry(34) <> 0 THEN 
                   vc2Aps          := APS_ERR_CHILD_RSLTUPDATE_FLG;
                   vc2ApsComment   := SUBSTR('(SBM1733)' || LOGMSG_LINECNT     || LOGMSG_BRAKETS
                                                                || numCsvReadCount
                                                                || LOGMSG_BRAKETE
                                                                || LOGMSG_SPACER
                                                                || LOGMSG_CSV_ERR_COLUMN
                                                                || LOGMSG_BRAKETS
                                                                || COL_CHILD_RSLTUPDATE_FLG
                                                                || LOGMSG_BRAKETE,
                            1,256);
                   RAISE excCSV_CHECK_ERR;
                END IF;
             END IF;

            --�����܂�


            ---------------��CSV���ڂ̃`�F�b�NEnd��------------------

            /*��Ǝ��ю捞�Ǘ��ԍ��̍̔�*/
            vc2OprRsltTempCtlNo := SubFncGetOPR_RSLT_TEMP_CTL_NO;
                 /* [��Ǝ��ю捞]�@�o�^���� */
            INSERT INTO T_OPR_RSLT_TEMP(
                  OPR_RSLT_TEMP_CTL_NO   --��Ǝ��ю捞�Ǘ��ԍ�
                , OPR_INST_CD            --��Ǝw���ԍ�
                , ITEM_CD                --�i�ڔԍ�
                , ACPT_QTY               --�Ǖi��
                , DEFECT_QTY             --�s�ǐ�
                , OPR_DATE               --��Ɠ�
                , WH_CD                  --�ۊǋ�R�[�h
                , WS_CD                  --��Ƌ�R�[�h
                , OPR_RSLT_PERSON        --��ƒS����
                , OPR_RSLT_COMMENT       --���l
                , OPR_TIME_UNIT_TYP      --��Ǝ��ԒP�ʋ敪
                , PRE_ARRANGEMENT_TIME   --�O�i�掞��
                , POST_ARRANGEMENT_TIME  --��i�掞��
                , OPR_TIME               --��Ǝ���
                , CESSATION_TIME         --��~����
                , CESSATION_CAUSE        --��~���R
                , LOT_NO                 --�݌Ƀ��b�g�ԍ�
                , VEND_LOT_NO            --���[�J���b�g�ԍ�
                , DEFECT_CAUSE_CD1       --�s�Ǘ��R�R�[�h1
                , DEFECT_QTY1            --�s�ǐ�1
                , DEFECT_COMMENT1        --�s�ǔ��l1
                , DEFECT_CAUSE_CD2       --�s�Ǘ��R�R�[�h2
                , DEFECT_QTY2            --�s�ǐ�2
                , DEFECT_COMMENT2        --�s�ǔ��l2
                , DEFECT_CAUSE_CD3       --�s�Ǘ��R�R�[�h3
                , DEFECT_QTY3            --�s�ǐ�3
                , DEFECT_COMMENT3        --�s�ǔ��l3
                , DEFECT_CAUSE_CD4       --�s�Ǘ��R�R�[�h4
                , DEFECT_QTY4            --�s�ǐ�4
                , DEFECT_COMMENT4        --�s�ǔ��l4
                , DEFECT_CAUSE_CD5       --�s�Ǘ��R�R�[�h5
                , DEFECT_QTY5            --�s�ǐ�5
                , DEFECT_COMMENT5        --�s�ǔ��l5
                , OPR_CMPLT_FLG          --��Ɗ����t���O
                , TAKE_DATE              --�捞���t
                , CHILD_RSLTUPDATE_FLG   --�q�i�ڈꊇ�X�V�t���O
                  )VALUES(
                  vc2OprRsltTempCtlNo    --�̔Ԃ�����Ǝ��ю捞�Ǘ��ԍ�
                , TypColumnAry(1)        --��Ǝw���ԍ�
                , TypColumnAry(2)        --�i�ڔԍ�
                , TypColumnAry(3)        --�Ǖi��
                , TypColumnAry(4)        --�s�ǐ�
                , TypColumnAry(5)        --��Ɠ�
                , TypColumnAry(6)        --�ۊǋ�R�[�h
                , TypColumnAry(7)        --��Ƌ�R�[�h
                , TypColumnAry(8)        --��ƒS����
                , TypColumnAry(9)        --���l
                , TypColumnAry(10)       --��Ǝ��ԒP�ʋ敪
                , TypColumnAry(11)       --�O�i�掞��
                , TypColumnAry(12)       --��i�掞��
                , TypColumnAry(13)       --��Ǝ���
                , TypColumnAry(14)       --��~����
                , TypColumnAry(15)       --��~���R
                , TypColumnAry(16)       --�݌Ƀ��b�g�ԍ�
                , TypColumnAry(17)       --���[�J���b�g�ԍ�
                , TypColumnAry(18)       --�s�Ǘ��R�R�[�h1
                , TypColumnAry(19)       --�s�ǐ�1
                , TypColumnAry(20)       --�s�ǔ��l1
                , TypColumnAry(21)       --�s�Ǘ��R�R�[�h2
                , TypColumnAry(22)       --�s�ǐ�2
                , TypColumnAry(23)       --�s�ǔ��l2
                , TypColumnAry(24)       --�s�Ǘ��R�R�[�h3
                , TypColumnAry(25)       --�s�ǐ�3
                , TypColumnAry(26)       --�s�ǔ��l3
                , TypColumnAry(27)       --�s�Ǘ��R�R�[�h4
                , TypColumnAry(28)       --�s�ǐ�4
                , TypColumnAry(29)       --�s�ǔ��l4
                , TypColumnAry(30)       --�s�Ǘ��R�R�[�h5
                , TypColumnAry(31)       --�s�ǐ�5
                , TypColumnAry(32)       --�s�ǔ��l5
                , TypColumnAry(33)       --��Ɗ����t���O
                , dtmBusinessOprDate     --�Ɩ��^�p��
                , TypColumnAry(34)       --�q�i�ڈꊇ�X�V�t���O
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
        /* ��Ǝ��ю捞 CSV���������\�� */
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
