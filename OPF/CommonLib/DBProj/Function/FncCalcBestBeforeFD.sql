CREATE OR REPLACE FUNCTION FNCCALCBESTBEFOREFD(
/*------------------------------------------------------------------------------
' author    : Zhaohaikun
' version   : 1.00.00
'
' �C������
' 2006.11.13 ����
'
' �@�\      : �ܖ����������v�Z
'
' �߂�l    : Boolean
'               True :����I��
'               False:�ُ�I��
'
' ������    : pFileHandle          - (i)�t�@�C���n���h��
'             pvc2LogMode          - (i)�k�n�f���[�h
'             pvc2OutputMode       - (i)�o�̓��[�h
'             pvc2UserId           - (i)���[�U�h�c
'             pvc2BusinessName     - (i)�Ɩ���
'             pvc2PlantCd          - (i)�H��R�[�h
'         -- �Ɩ��ŗL
'             pvc2ItemCd           - (i)�i�ڔԍ�
,             pvc2ACPT_PROC_DATE   - (i)���Y����
              pvc2BESTBEFORE       - (o)�ܖ�����
'             pvc2ErrCd            - (o)�G���[�R�[�h
'             pnumStatus           - (o)���ʃX�e�[�^�X(1:����I���A2:�x���I���A3:�ُ�I��)
'
' �@�\����  : �ܖ����������v�Z
'
'
' ���l      :
'           :
'
------------------------------------------------------------------------------*/
    pFileHandle         IN  UTL_FILE.FILE_TYPE  --�t�@�C���n���h��
   ,pvc2LogMode         IN  VARCHAR2            --�k�n�f���[�h
   ,pvc2OutputMode      IN  VARCHAR2            --�o�̓��[�h
   ,pvc2UserId          IN  VARCHAR2            --���[�U�h�c
   ,pvc2BusinessName    IN  VARCHAR2            --�Ɩ���
   ,pvc2PlantCd         IN  VARCHAR2            --�H��R�[�h
   ,pvc2ItemCd          IN  VARCHAR2            --(i)�i�ڔԍ�
   ,pvc2ACPT_PROC_DATE  IN  VARCHAR2            --(i)���Y����
   ,pvc2BESTBEFORE      OUT VARCHAR2            --(o)���Y����
   ,pvc2ErrCd           OUT VARCHAR2            --(o)�G���[�R�[�h
   ,pnumStatus          OUT NUMBER              --(o)���ʃX�e�[�^�X
) RETURN BOOLEAN
IS

    -- �萔�̐錾
    MY_SQL_NAME            VARCHAR2(32) := 'FNCCALCBESTBEFOREFD';  --�o�k�^�r�p�k��

    -- �ϐ��̐錾
    UTL_FileHandle         UTL_FILE.FILE_TYPE;            --�t�@�C���n���h��
    blnRet                 BOOLEAN;                       --BOOLEAN�^ �ԋp�l
    pvc2ErrMsg             VARCHAR2(1023);                --�G���[���b�Z�[�W�쐬��Ɨ̈�
    pvc2ITEM_CD            M_ITEM.ITEM_CD%TYPE;           --�ϐ�.�i�ڔԍ�
    pnumBEST_BEFORE_YEAR   M_ITEM.BEST_BEFORE_YEAR%TYPE;  --�ϐ�.�ܖ������N��
    pnumBEST_BEFORE_MONTH  M_ITEM.BEST_BEFORE_MONTH%TYPE; --�ϐ�.�ܖ���������
    pnumBEST_BEFORE_DAY    M_ITEM.BEST_BEFORE_DAY%TYPE;   --�ϐ�.�ܖ���������
    wnumDataExist1         NUMBER;                        --�f�[�^�����݃t���O

    -- LOG �̐錾
    LOGMSG_START           CONSTANT VARCHAR2(5)   := 'Start';      --���O�p���\�b�h�J�n�錾
    LOGMSG_END             CONSTANT VARCHAR2(3)   := 'End';        --���O�p���\�b�h�I���錾
    LOGMSG_ERR             CONSTANT VARCHAR2(12)  := '�ُ�I��';

    -- ��O�̐錾
    excMistakeCommonParam  EXCEPTION;          --�p�����[�^�s��
    excNotFoundItem        EXCEPTION;
    excFncTraceLog         EXCEPTION;    --�g���[�X���O�o�̓G���[

-- �J�[�\���̐錾
    CURSOR curSYS_RCV_ISSUE_CTRL_CD_CTRL IS
    SELECT  RCV_ISSUE_CTRL_CD
    FROM    SYS_RCV_ISSUE_CTRL_CD_CTRL
    WHERE   PLANT_CD = pvc2PlantCd
    FOR UPDATE;



/*�G���[�p���[�N*/
    vc2TmpMessage           VARCHAR2(1024);       --�k�n�f���b�Z�[�W

BEGIN

    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

    IF blnRet=FALSE THEN
        RAISE excFncTraceLog;
    END IF;

-- ���ʂ̓��̓p�����[�^�̃`�F�b�N
    IF pvc2LogMode IS NULL THEN             -- �k�n�f���[�h���m�t�k�k
        pvc2ErrMsg := SUBSTRB('(SBM0733)�p�����[�^�k�n�f���[�h�������͂܂��͕s���ł��B',1,1023);
        RAISE excMistakeCommonParam;
    END IF;

    IF pvc2OutputMode IS NULL THEN          -- �o�̓��[�h���m�t�k�k
        pvc2ErrMsg := SUBSTRB('(SBM0734)�p�����[�^�o�̓��[�h�������͂܂��͕s���ł��B',1,1023);
        RAISE excMistakeCommonParam;
    END IF;

    IF pvc2UserId IS NULL THEN              -- ���[�U�h�c���m�t�k�k
        pvc2ErrMsg := SUBSTRB('(SBM0737)�p�����[�^���[�U�h�c�������͂܂��͕s���ł��B',1,1023);
        RAISE excMistakeCommonParam;
    END IF;

    IF pvc2BusinessName IS NULL THEN        -- �n�o�e�h�c���m�t�k�k
        pvc2ErrMsg := SUBSTRB('(SBM0738)�p�����[�^�Ɩ����������͂܂��͕s���ł��B',1,1023);
        RAISE excMistakeCommonParam;
    END IF;

    IF pvc2PlantCd IS NULL THEN      -- �����D�h�H��R�[�h�h��NULL�̏ꍇ
        pvc2ErrMsg  := SUBSTR('(SBM0739)�H��R�[�h�������͂܂��͕s���ł��B',1,1023);

        RAISE excMistakeCommonParam;
    END IF;

    IF pvc2ItemCd IS NULL THEN    -- �����D�h�i�ڔԍ��h��NULL�̏ꍇ
	pvc2ErrMsg  := SUBSTR('(SBM0740)�i�ڔԍ��������͂܂��͕s���ł��B',1,1023);
        RAISE excMistakeCommonParam;
    END IF;
    IF pvc2ACPT_PROC_DATE IS NULL THEN    -- �����D�h���Y�����h��NULL�̏ꍇ
	pvc2ErrMsg  := SUBSTR('(SBM0741)���Y�����������͂܂��͕s���ł��B',1,1023);
        RAISE excMistakeCommonParam;
    END IF;

    BEGIN
        SELECT ITEM_CD, BEST_BEFORE_YEAR, BEST_BEFORE_MONTH, BEST_BEFORE_DAY
          INTO pvc2ITEM_CD, pnumBEST_BEFORE_YEAR, pnumBEST_BEFORE_MONTH, pnumBEST_BEFORE_DAY
          FROM M_ITEM
         WHERE ITEM_CD = pvc2ItemCd;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            pvc2ErrMsg := SUBSTR('(SBM0820)�w�肵���i�ږ��o�^�ł��B',1,1023);
            pvc2ErrCd  := 'AE22057';
            RAISE excNotFoundItem;
    END;


    --//�C���X�g�[�����f
    BEGIN
        SELECT
            COUNT(OPTION_ID)        --�V�X�e���I�v�V�������ʎq
        INTO
            wnumDataExist1
        FROM
            SYS_INSTALL_OPTIONS     --�C���X�g�[���I�v�V����
        WHERE
            OPTION_ID = 'JF*'
            AND INSTALL_FLG =1;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            wnumDataExist1:= 0;
    END;


    IF pnumBEST_BEFORE_YEAR = 0 AND pnumBEST_BEFORE_MONTH = 0 AND pnumBEST_BEFORE_DAY = 0 THEN
        IF wnumDataExist1 = 0 THEN
            pvc2BESTBEFORE := '0';
        ELSE
            pvc2BESTBEFORE := '9999/12/31';
        END IF;        
    ELSE
        BEGIN
            SELECT TO_CHAR(ADD_MONTHS(pvc2ACPT_PROC_DATE,pnumBEST_BEFORE_YEAR*12+pnumBEST_BEFORE_MONTH)+pnumBEST_BEFORE_DAY,'YYYY/MM/DD')
              INTO pvc2BESTBEFORE
              FROM DUAL;
        EXCEPTION
              WHEN OTHERS THEN
                  RAISE;
        END;
    END IF;

/*--------------------------------------
  PLSQL����I��
--------------------------------------*/
    pnumStatus := 1;  -- ����I��
    blnRet     := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
    RETURN TRUE;

--< ��O���� >---------------------------------------------------------------
EXCEPTION
    WHEN excMistakeCommonParam THEN

        /* ErrorLog �̏o�� */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, pvc2ErrCd, pvc2ErrMsg);
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);


        pnumStatus      := 3;  --�ُ�I��
        pvc2ErrCd       := 'AE22056';
        RETURN FALSE;

    WHEN excNotFoundItem THEN
        /* ErrorLog �̏o�� */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, pvc2ErrCd, pvc2ErrMsg);
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        pnumStatus      := 3;  --�ُ�I��
        RETURN FALSE;

    WHEN excFncTraceLog THEN
        pnumStatus      := 3;  --�ُ�I��
        RETURN FALSE;

    WHEN OTHERS THEN
        /* ErrorLog �̏o�� */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, pvc2ErrCd, pvc2ErrMsg);
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        pnumStatus      := 3;         --�ُ�I��
        pvc2ErrCd       := 'ZZ99001';

        RETURN FALSE;

END;
/
