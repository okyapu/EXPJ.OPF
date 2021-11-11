CREATE OR REPLACE PROCEDURE      SQLCALCBESTBEFOREFD(
/*------------------------------------------------------------------------------
' author    : Zhaohaikun
' version   : 1.00.00
'
' �C������
' 2006.11.13 ����
'
' �@�\      : �ܖ����������v�Z
'             (Java�Ăяo��IF)
'
' �߂�l    : Boolean
'               True :����I��
'               False:�ُ�I��
'
' ������    :
'         -- SYSTEM����
'             pvc2LogMode                  - (i)�k�n�f���[�h
'             pvc2OutputMode               - (i)�o�̓��[�h
'             pvc2OutputPath               - (i)�o�̓t�@�C���p�X
'             pvc2OutputName               - (i)�o�̓t�@�C����
'             pvc2UserId                   - (i)���[�U�h�c
'             pvc2BusinessName             - (i)�Ɩ���
'             pvc2PlantCd                  - (i)�H��R�[�h
'         -- �Ɩ��ŗL
'             pvc2ItemCd                   - (i)�i�ڔԍ�
,             pvc2ACPT_PROC_DATE           - (i)���Y����
              pvc2BESTBEFORE               - (o)���Y����
'             pvc2ErrCd                    - (o)�G���[�R�[�h
'             pnumStatus                   - (o)���ʃX�e�[�^�X(1:����I���A2:�x���I���A3:�ُ�I��)
'
' �@�\����  : �����̔ԏ����B
'
' ���l      :
'
------------------------------------------------------------------------------*/
    pvc2LogMode                 IN  VARCHAR2            --(i)�k�n�f���[�h
   ,pvc2OutputMode              IN  VARCHAR2            --(i)�o�̓��[�h
   ,pvc2OutputPath              IN  VARCHAR2            --(i)�o�̓t�@�C���p�X
   ,pvc2OutputName              IN  VARCHAR2            --(i)�o�̓t�@�C����
   ,pvc2UserId                  IN  VARCHAR2            --(i)���[�U�h�c
   ,pvc2BusinessName            IN  VARCHAR2            --(i)�Ɩ���
   ,pvc2PlantCd                 IN  VARCHAR2            --(i)�H��R�[�h
   ,pvc2ItemCd                  IN  VARCHAR2            --(i)�i�ڔԍ�
   ,pvc2ACPT_PROC_DATE          IN  VARCHAR2            --(i)���Y����
   ,pvc2BESTBEFORE              OUT VARCHAR2            --(o)���Y����
   ,pvc2ErrCd                   OUT VARCHAR2            --(o)�G���[�R�[�h
   ,pnumStatus                  OUT NUMBER              --(o)���ʃX�e�[�^�X
)
IS
    -- �萔�̐錾
    MY_SQL_NAME                VARCHAR2(32) := 'SQLCALCBESTBEFOREFD';  --�o�k�^�r�p�k��
    vc2MessageId               VARCHAR2(28);       --

    -- �ϐ��̐錾
    UTL_FileHandle         UTL_FILE.FILE_TYPE;            --�t�@�C���n���h��
    blnRet                 BOOLEAN;                       --BOOLEAN�^ �ԋp�l
    pvc2ErrMsg             VARCHAR2(1023);                --�G���[���b�Z�[�W�쐬��Ɨ̈�
    pvc2ITEM_CD            M_ITEM.ITEM_CD%TYPE;           --�ϐ�.�i�ڔԍ�
    numStatus              NUMBER(1);                     --���ʃX�e�[�^�X

    -- LOG �̐錾
    LOGMSG_START        CONSTANT VARCHAR2(5)   := 'Start';      --���O�p���\�b�h�J�n�錾
    LOGMSG_END          CONSTANT VARCHAR2(3)   := 'End';        --���O�p���\�b�h�I���錾
    LOGMSG_ERR          CONSTANT VARCHAR2(12)  := '�ُ�I��';

    -- ��O�̐錾
    excMistakeCommonParam        EXCEPTION;          --�p�����[�^�s��
    excFNCFaild                  EXCEPTION;
    excFncTraceLog               EXCEPTION;    --�g���[�X���O�o�̓G���[

    PROCEDURE ErrorLog IS
    BEGIN
        /* ErrorLog �̏o�� */
         blnRet := FncErrLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                             pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, pvc2ErrCd, pvc2ErrMsg);
    END;

    PROCEDURE TraceLog(vc2Trace VARCHAR2) IS
    BEGIN
        /* TraceLog �̏o�� */
         blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                               pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, vc2Trace);
    END;

BEGIN
/*-------------------------------------
  PLSQL������
-------------------------------------*/
    pnumStatus      := 3;          -- �ُ�I��

    /* LogFile �� OPEN */
    blnRet := FNCLOGOPEN(pvc2OutputPath, pvc2OutputName, pvc2PlantCd, pvc2OutputMode, UTL_FileHandle);
    /* TraceLog �̏o�� */
    TraceLog(LOGMSG_START);

 -- ���ʂ̓��̓p�����[�^�̃`�F�b�N
    IF pvc2LogMode IS NULL THEN             -- �k�n�f���[�h���m�t�k�k
        pvc2ErrMsg := SUBSTRB('(SBM0733)�p�����[�^�k�n�f���[�h�������͂܂��͕s���ł��B',1,1023);
        RAISE excMistakeCommonParam;
    END IF;

    IF pvc2OutputMode IS NULL THEN          -- �o�̓��[�h���m�t�k�k
        pvc2ErrMsg := SUBSTRB('(SBM0734)�p�����[�^�o�̓��[�h�������͂܂��͕s���ł��B',1,1023);
        RAISE excMistakeCommonParam;
    END IF;

    IF pvc2OutputPath IS NULL THEN          -- �o�̓t�@�C���p�X���m�t�k�k
        pvc2ErrMsg := SUBSTRB('(SBM0735)�p�����[�^�o�̓t�@�C���p�X�������͂܂��͕s���ł��B', 1, 1023);
        RAISE excMistakeCommonParam;
    END IF;

    IF pvc2OutputName IS NULL THEN          -- �o�̓t�@�C�������m�t�k�k
        pvc2ErrMsg := SUBSTRB('(SBM0736)�p�����[�^�o�̓t�@�C�����������͂܂��͕s���ł��B', 1, 1023);
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

      /*�ܖ��������� */
    blnRet := FNCCALCBESTBEFOREFD(
                UTL_FileHandle              --�t�@�C���n���h��
               ,pvc2LogMode                 --�k�n�f���[�h
               ,pvc2OutputMode              --�o�̓��[�h
               ,pvc2UserId                  --���[�U�h�c
               ,pvc2BusinessName            --�Ɩ���
               ,pvc2PlantCd                 --�H��R�[�h
               ,pvc2ItemCd                  --�i�ڔԍ�
               ,pvc2ACPT_PROC_DATE          --���Y���t/������t
               ,pvc2BESTBEFORE              --�ܖ�����
               ,vc2MessageId                --�G���[���b�Z�[�WID
               ,numStatus                   --���ʃX�e�[�^�X�i1�F����I�� 2:�x���I�� 3�F�ُ�I���j
              );

    IF blnRet=FALSE THEN
        pvc2ErrMsg := SUBSTR('(SBM0742)�ܖ������擾�ɃG���[���������܂����B',1,1023);
        pvc2ErrCd  := vc2MessageId;
        RAISE excFNCFaild;
    END IF
    ;

/*--------------------------------------
  PLSQL����I��
--------------------------------------*/

    /* ���ʃX�e�[�^�X�̃Z�b�g */
    pnumStatus := numStatus;       --����I��
    pvc2ErrCd  := vc2MessageId;

    /* TraceLog �̏o�� */
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    /* LogFile �� CLOSE */
    blnRet := FNCLOGCLOSE(UTL_FileHandle);
    IF blnRet=FALSE THEN
        RAISE excFncTraceLog;
    END IF;


--< ��O���� >---------------------------------------------------------------
EXCEPTION
    WHEN excMistakeCommonParam THEN
        pnumStatus := 3;  --�ُ�I��
        pvc2ErrCd  := 'AE22060';

        /* ErrorLog �̏o�� */
        ErrorLog;

        /* TraceLog �̏o�� */
        TraceLog('(SBM0732)'|| LOGMSG_END || LOGMSG_ERR);

        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

    WHEN excFNCFaild THEN
        pnumStatus := 3;  --�ُ�I��

        /* ErrorLog �̏o�� */
        ErrorLog;

        /* TraceLog �̏o�� */
        TraceLog('(SBM0732)'|| LOGMSG_END || LOGMSG_ERR);

        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

    WHEN excFncTraceLog THEN
        pnumStatus := 3;  --�ُ�I��


    WHEN OTHERS THEN
        pnumStatus := 3;         --�ُ�I��
        pvc2ErrCd  := 'ZZ99001';

        pvc2ErrMsg := SUBSTRB(pvc2ErrMsg || SQLERRM,1,1023);

        /* ErrorLog �̏o�� */
        ErrorLog;

        -- TraceLog �̏o��
        TraceLog('(SBM0732)'|| LOGMSG_END || LOGMSG_ERR);

        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);
END;
/
