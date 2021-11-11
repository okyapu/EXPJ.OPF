CREATE OR REPLACE PROCEDURE SQLWORKINPROCBYITEMINTERFACE(
/*------------------------------------------------------------------------------
'
'$Author: zhangran $
'$Revision: 1.3 $
'
' �@�\      : �i�ڕʍ�ƌv��b�r�u�捞
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
' �@�\����  : �i�ڕʍ�ƌv��b�r�u�t�@�C����ǂݍ��݁A[��ƌv��捞]���쐬���܂��B
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
    RtpSYS_PARAMETER                curSYS_PARAMETER%ROWTYPE;                                  -- �y�p�����[�^�z

/* �萔�̐錾 */

    MY_SQL_NAME                         VARCHAR2(84)    := 'SQLWORKINPROCBYITEMINTERFACE';
    STATUS_NORMAL                       NUMBER(1)       := 1;                                  --����I��
    STATUS_WARNING                      NUMBER(1)       := 2;                                  --�x���I��
    STATUS_ERROR                        NUMBER(1)       := 3;                                  --�ُ�I��
    DATE_FORMAT                         VARCHAR2(72)    := 'YYYY/MM/DD HH24:MI';               -- ���t�ϊ����̃t�H�[�}�b�g
    DEFAULT_CHAR_SET                    VARCHAR2(32)    := 'JA16SJIS';                         -- S-JIS
    WK_IN_PROC_BY_ITEM_IF_CSV_PATH      VARCHAR2(88)    := 'WK_IN_PROC_BY_ITEM_IF_CSV_PATH';   -- [�p�����[�^].���O
    CSV_CHAR_SET                        VARCHAR2(64)    := 'CSV_CHARACTERSET';                 -- [�敪�R�[�h].���O
    CSV_TAKE_TYP_FIX                    NUMBER(1)       := 1;                                  -- 1�F�Œ�t�@�C���捞
    CSV_TAKE_TYP_DESINATED              NUMBER(1)       := 2;                                  -- 2�F�w��t�@�C���捞
    PATH_SLASH                          VARCHAR2(4)     := '/';                                --�t�@�C���p�X��؂蕶��
    PATH_DELIM                          VARCHAR2(4)     := '\';                                --�t�@�C���p�X��؂蕶��
    CSV_DELIM                           VARCHAR2(4)     := ',';                                --�b�r�u���ڂ̋�؂蕶��
    CSV_LINE_MAX                        INTEGER         := 2048;                               --�b�r�u�t�@�C���P�s����̍ő吔
    CSV_COLUMN_COUNT                    INTEGER         := 7;                                  --�b�r�u�t�@�C���P�s����̍��ڐ�
    LENGTH_25                           NUMBER(2)       := 25;                                 --������:=25
    LENGTH_80                           NUMBER(2)       := 80;                                 --������:=80
    LENGTH_5                            NUMBER(1)       :=5;                                   --������ :=5
    NUMBER_100000000000000              NUMBER(15)      :=100000000000000;                     --���l����:15��

/* ��O�̐錾 */

/* EXCEPTION �̐錾 */
    excERR_SKIP                         EXCEPTION;      --���s�s��
    excERR_MAST                         EXCEPTION;      --�J�[�\��OPEN����EXCEPTION
    excCSV_CHECK_ERR                    EXCEPTION;      --CSV�f�[�^�̃`�F�b�N�G���[

/* MESSAGE �̐錾 */
    APS_ERR_CSVFILEPATH                 VARCHAR2(28)    := 'AD60004';   --�i�ڕʍ�ƌv��CSV�p�X�̎擾�Ɏ��s���܂����B
    APS_ERR_CSVFILE                     VARCHAR2(28)    := 'AD60005';   --�t�@�C���̏������ɃG���[���������܂����B
    APS_ERR_CSV_DATA_FORMAT             VARCHAR2(28)    := 'AD60006';   --CSV�t�@�C�����s���ȃt�H�[�}�b�g�ł��B
    APS_ERR_CSV_NUMBER_FORMAT           VARCHAR2(28)    := 'AD60007';   --CSV�t�@�C���Ő��l���ڂ��s���ȃt�H�[�}�b�g�ł��B
    APS_ERR_CSV_DATE_FORMAT             VARCHAR2(28)    := 'AD60008';   --CSV�t�@�C���œ��t���ڂ��s���ȃt�H�[�}�b�g�ł��B
    APS_ERR_REQUIRED                    VARCHAR2(28)    := 'AD60009';   --CSV�t�@�C���̕K�{���ڂɒl���ݒ肳��Ă��܂���B
    APS_ERR_NUMBER_MINUS                VARCHAR2(28)    := 'AD60010';   --CSV�t�@�C���̐��l���ڂɃ}�C�i�X�l���ݒ肳��Ă��܂��B
    APS_BATCH_START                     VARCHAR2(28)    := 'AD60011';   --�i�ڕʍ�ƌv��CSV�捞�������J�n���܂����B
    APS_BATCH_END                       VARCHAR2(28)    := 'AD60012';   --�i�ڕʍ�ƌv��CSV�捞�������I�����܂����B
    APS_BATCH_EXC                       VARCHAR2(28)    := 'AD60013';   --�i�ڕʍ�ƌv��CSV�捞�������ُ�I�����܂����B
    APS_DATA_PROCESSING                 VARCHAR2(28)    := 'AD60014';   --��������
    APS_ERR_CSV_DATA_DIGIT              VARCHAR2(28)    := 'AA01501';   --�����ȓ��Őݒ肵�Ă��������B
    APS_ERR_CSV_DATA_ILLEGAL            VARCHAR2(28)    := 'AA01524';   --�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B
 


/* LOG �̐錾 */
    LOGMSG_NAME                         VARCHAR2(52)    := '���O=';
    LOGMSG_START                        VARCHAR2(20)    := 'Start';
    LOGMSG_END                          VARCHAR2(12)    := 'End';
    LOGMSG_BRAKETS                      VARCHAR2(4)     := '[';
    LOGMSG_BRAKETE                      VARCHAR2(4)     := ']';
    LOGMSG_CSVFILE                      VARCHAR2(76)    := '(SBM1329)�i�ڕʍ�ƌv��t�@�C����=';
    LOGMSG_LINECNT                      VARCHAR2(52)    := 'CSV�s�ԍ�=';
    LOGMSG_START_PGNM                   VARCHAR2(152)   := '(SBM1326)�i�ڕʍ�ƌv��CSV�捞�������J�n���܂����B';
    LOGMSG_END_PGNM                     VARCHAR2(152)   := '(SBM1327)�i�ڕʍ�ƌv��CSV�捞�������I�����܂����B';
    LOGMSG_TAKE_FILENAME                VARCHAR2(100)   := '(SBM1328)�捞�t�@�C�����F';
    LOGMSG_SPACER                       VARCHAR2(4)     := ' ';
    LOGMSG_CSV_ERR_COLUMN               VARCHAR2(88)    := '�G���[���ږ�=';
    LOGMSG_COLUMN_CNT                   VARCHAR2(36)    := 'CSV���ڐ�';
    COL_ITEM_CD                         VARCHAR2(32)    := '�i�ڔԍ�';
    COL_PRD_DUE_DATE                    VARCHAR2(32)    := '�����[��';
    COL_PRD_START_DATE                  VARCHAR2(40)    := '���������';
    COL_OPR_INST_QTY                    VARCHAR2(40)    := '��Ǝw����';
    COL_WS_CD                           VARCHAR2(48)    := '��Ƌ�R�[�h';
    COL_JOB_ODR_CD                      VARCHAR2(16)    := '����';
    COL_WK_IN_PROC_BY_ITEM_COMMENT      VARCHAR2(16)    := '���l';


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
    vc2WorkBuffer               VARCHAR2(1024);                 --��Ɨp�o�b�t�@
    vc2CsvFilePath              VARCHAR2(1024);                 --�i�ڕʍ�ƌv��t�@�C���̊i�[�f�B���N�g��
    vc2CsvFile                  VARCHAR2(1024);                 --�i�ڕʍ�ƌv��t�@�C����
    vc2NewFileName              VARCHAR2(1000) := '';           --�t�@�C�����l�[���p
    vc2ReadBuffer               VARCHAR2(2048);                 --�ǂݍ��ݗp�o�b�t�@
    numMsglogCount              NUMBER := 0;                    -- ���b�Z�[�W���O��
    numCsvReadCount             NUMBER(10) := 0;                --CSV �Ǎ�����
    numCsvInsertCount           NUMBER(10) := 0;                --CSV �o�^����
    numMstErrorCount            NUMBER(10) := 0;                --�}�X�^�G���[����

    vc2WorkOdrTempCtlNo         VARCHAR2(100);                  --��ƌv��捞�Ǘ��ԍ�
    intIdx                      INTEGER;                        --���ڐ؂�o���p�J�E���^
    UTL_FileHandle              UTL_FILE.FILE_TYPE;             --�t�@�C���n���h��
    UTL_FileCsvHandle           UTL_FILE.FILE_TYPE;             --�i�ڕʍ�ƌv��t�@�C���n���h��

    TypColumnAry                TYP_COLUMN_ARRY;                --���ڐ؂�o���p�o�b�t�@
    blnRet                      BOOLEAN;                        --BOOLEAN�^ �ԋp�l
    blnFile                     BOOLEAN;                        --BOOLEAN�^ �ԋp�l
    intColumnMax                INTEGER;                        --�J�������m�F�p
    intColumnOvr                INTEGER;                        --�J�������m�F�p

    vc2CheckLength              VARCHAR2(2048);                 --���������`�F�b�N�p
    blnCsvDataCommit            BOOLEAN;                        --��ƌv��捞�ɓo�^�����f�[�^�̃R�~�b�g�ۃt���O

    vc2ToChar                  VARCHAR2(100);                   --���l���ڂ̕�����ϊ��i���l�����`�F�b�N�p�j
    vc2CheckNum                VARCHAR2(100);                   --�����_�ȉ��̐��l�؎�i���l�����`�F�b�N�p�j

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
    ' �@�\      : �u��ƌv��捞�Ǘ��ԍ��v���̔Ԃ���
    '
    ' �߂�l    : ���������u��ƌv��捞�Ǘ��ԍ��v
    '
    ' ������    :
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
    /*��ƌv��捞�ɓo�^�����f�[�^�̃R�~�b�g�ۃt���O = TRUE */
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
            OPEN curSYS_PARAMETER(WK_IN_PROC_BY_ITEM_IF_CSV_PATH);
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

            -- �i�ڕʍ�ƌv��b�r�u�p�X�̎擾�Ɏ��s���܂���
            vc2Aps        := APS_ERR_CSVFILEPATH;
                vc2ApsComment := SUBSTR('(SBM1646)'||LOGMSG_NAME   || '�A' ||
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
' �i�ڕʍ�ƌv��t�@�C���̎捞����
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


    /* �b�r�u�t�@�C�����A[��ƌv��捞]�Ɏ捞�J�n */
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
            IF TypColumnAry( 1) IS NULL THEN        -- �i�ڔԍ�
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

            /* �K�{���ڃ`�F�b�N */
            IF TypColumnAry( 2) IS NULL THEN        -- �����[��
                -- CSV�t�@�C���̕K�{���ڂɒl���ݒ肳��Ă��܂���B
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

            /* �K�{���ڃ`�F�b�N */
            IF TypColumnAry( 4) IS NULL THEN        -- ��Ǝw����
                -- CSV�t�@�C���̕K�{���ڂɒl���ݒ肳��Ă��܂���B
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

            /*��Ǝw���� ���l�`�F�b�N*/
            IF SubFncCheckNumber(TypColumnAry(4)) THEN
                 NULL;
            ELSE
                    --�b�r�u�t�@�C���Ő��l���ڂ��s���ȃt�H�[�}�b�g�ł�
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
 
            /*��Ǝw���� �}�C�i�X�`�F�b�N*/
            IF TO_NUMBER(TypColumnAry(4)) < 0 THEN
                -- CSV�t�@�C���̐��l���ڂɃ}�C�i�X�l���ݒ肳��Ă��܂��B
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

            /* �����[���@���t�`�F�b�N */
            IF TypColumnAry(2) IS NOT NULL  THEN
                IF SubFncCheckDate(TypColumnAry(2)) THEN
                    NULL;
                ELSE
                    --�b�r�u�t�@�C���œ��t���ڂ��s���ȃt�H�[�}�b�g�ł�
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

            /* ����������@���t�`�F�b�N */
            IF TypColumnAry(3) IS NOT NULL  THEN
                IF SubFncCheckDate(TypColumnAry(3)) THEN
                    NULL;
                ELSE
                    --�b�r�u�t�@�C���œ��t���ڂ��s���ȃt�H�[�}�b�g�ł�
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

            /*��Ƌ�R�[�h�@���������`�F�b�N�@26�����ȏ�̓G���[*/
            vc2CheckLength := LENGTH(TypColumnAry(5)) ;
            IF TypColumnAry(5) IS NOT NULL  THEN
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

            /*���l�@���������`�F�b�N�@81�����ȏ�̓G���[*/
            vc2CheckLength := LENGTH(TypColumnAry(7)) ;
            IF TypColumnAry(7) IS NOT NULL  THEN
                IF vc2CheckLength > LENGTH_80 THEN
                    -- �����ȓ��Őݒ肵�Ă��������B
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

            /*��Ƌ� �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(5) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(5)) THEN
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

            /*���l �֑������`�F�b�N �u%�v�A�u_�v�A�u\�v���܂܂�Ă���ꍇ�̓G���[*/
            IF TypColumnAry(7) IS NOT NULL  THEN
                IF SubFncCheck_vc2(TypColumnAry(7)) THEN
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
                                                                 || COL_WK_IN_PROC_BY_ITEM_COMMENT
                                                                 || LOGMSG_BRAKETE,
                                1,256);
                    RAISE excCSV_CHECK_ERR;
                END IF;
            END IF;

            /*��Ǝw����  �����`�F�b�N ������ 15���ȏ�A�܂��͏����_�ȉ�5���ȏ�̏ꍇ�G���[ */
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




            ---------------��CSV���ڂ̃`�F�b�NEnd��------------------


            /*��ƌv��捞�Ǘ��ԍ��̍̔�*/
            vc2WorkOdrTempCtlNo :=  SubFncGetWORK_ODR_TEMP_CTL_NO;
                 /* [��ƌv��捞]�@�o�^���� */
            INSERT INTO T_WORK_ODR_TEMP(

                WORK_ODR_TEMP_CTL_NO             --��ƌv��捞�Ǘ��ԍ�
              , ITEM_CD                          --�i�ڔԍ�
              , PRD_DUE_DATE                     --�����[��
              , PRD_START_DATE                   --���������
              , OPR_INST_QTY                     --��Ǝw����
              , WS_CD                            --��Ƌ�R�[�h
              , JOB_ODR_CD                       --����
              , WK_IN_PROC_BY_ITEM_COMMENT       --���l
                )VALUES(
               vc2WorkOdrTempCtlNo               --��ƌv��捞�Ǘ��ԍ�
              , TypColumnAry(1)                  --�i�ڔԍ�
              , TypColumnAry(2)                  --�����[��
              , TypColumnAry(3)                  --���������
              , TypColumnAry(4)                  --��Ǝw����
              , TypColumnAry(5)                  --��Ƌ�R�[�h
              , TypColumnAry(6)                  --����
              , TypColumnAry(7)                  --���l
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
        /* �i�ڕʍ�ƌv��捞 CSV���������\�� */
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
