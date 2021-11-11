CREATE OR REPLACE PROCEDURE      SQLGETSETLOTNUMBERINGFD (
/*------------------------------------------------------------------------------
' author    : Zhaohaikun
' version   : 1.00.00
'
' �C������
' 2006.11.13 ����
'
' �@�\      : �����̔ԏ���
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
'             pnumStatus                   - (o)���ʃX�e�[�^�X(1:����I���A2:�x���I���A3:�ُ�I��)
'             pvc2ErrCd                    - (o)�G���[�R�[�h
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
   ,pvc2LotNo                   OUT VARCHAR2            --(o)�݌Ƀ��b�g�ԍ�
   ,pvc2ErrCd                   OUT VARCHAR2            --(o)�G���[�R�[�h
   ,pnumStatus                  OUT NUMBER              --(o)���ʃX�e�[�^�X
)
IS
    -- �萔�̐錾
    MY_SQL_NAME                VARCHAR2(32) := 'SQLGETSETLOTNUMBERINGFD';  --�o�k�^�r�p�k��

    -- �ϐ��̐錾 
    UTL_FileHandle         UTL_FILE.FILE_TYPE;                --�t�@�C���n���h��
    blnRet                 BOOLEAN;                           --BOOLEAN�^ �ԋp�l
    numStatus              NUMBER(1);                         --���ʃX�e�[�^�X
    pvc2ErrMsg             VARCHAR2(1023);                    --�G���[���b�Z�[�W�쐬��Ɨ̈�
    pvc2LOT_CTRL_FLG    M_ITEM.LOT_CTRL_FLG%TYPE;       --�ϐ�.���V�g�Ǘ��t���O
    pvc2LOT_NUMBERING_TYP  M_ITEM.LOT_NUMBERING_TYP%TYPE;     --�ϐ�.���V�g�ԍ��̔ԋ敪
    pvc2ITEM_CD            M_ITEM.ITEM_CD%TYPE;               --�ϐ�.�i�ڔԍ�
    pvc2LotNo_1            T_LOT_CTRL.LOT_NO%TYPE;            --�ϐ�.�݌Ƀ��b�g�ԍ�
    pvc2BESTBEFORE         VARCHAR2(20);                      --�ܖ�����    
    vc2MessageId           VARCHAR2(4000);

    -- LOG �̐錾
    LOGMSG_START        CONSTANT VARCHAR2(5)   := 'Start';      --���O�p���\�b�h�J�n�錾
    LOGMSG_END          CONSTANT VARCHAR2(3)   := 'End';        --���O�p���\�b�h�I���錾
    LOGMSG_ERR          CONSTANT VARCHAR2(12)  := '�ُ�I��';

    -- ��O�̐錾
    excMistakeCommonParam        EXCEPTION;          --�p�����[�^�s��
    excFaild                     EXCEPTION;
    excFncTraceLog               EXCEPTION;          --�g���[�X���O�o�̓G���[

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
    
  --���ʂ̓��̓p�����[�^�̃`�F�b�N
    IF pvc2LogMode IS NULL THEN             -- �k�n�f���[�h���m�t�k�k
        pvc2ErrMsg := SUBSTRB('�p�����[�^�k�n�f���[�h�������͂܂��͕s���ł��B',1,1023);
        RAISE excMistakeCommonParam;
    END IF;

    IF pvc2OutputMode IS NULL THEN          -- �o�̓��[�h���m�t�k�k
        pvc2ErrMsg := SUBSTRB('�p�����[�^�o�̓��[�h�������͂܂��͕s���ł��B',1,1023);
        RAISE excMistakeCommonParam;
    END IF;

    IF pvc2OutputPath IS NULL THEN          -- �o�̓t�@�C���p�X���m�t�k�k
        pvc2ErrMsg := SUBSTRB('�p�����[�^�o�̓t�@�C���p�X�������͂܂��͕s���ł��B', 1, 1023);
        RAISE excMistakeCommonParam;
    END IF;
    
    IF pvc2OutputName IS NULL THEN          -- �o�̓t�@�C�������m�t�k�k
        pvc2ErrMsg := SUBSTRB('�p�����[�^�o�̓t�@�C�����������͂܂��͕s���ł��B', 1, 1023);
        RAISE excMistakeCommonParam;
    END IF;
     
    IF pvc2UserId IS NULL THEN              -- ���[�U�h�c���m�t�k�k
        pvc2ErrMsg := SUBSTRB('�p�����[�^���[�U�h�c�������͂܂��͕s���ł��B',1,1023);
        RAISE excMistakeCommonParam;
    END IF;   

    IF pvc2BusinessName IS NULL THEN        -- �n�o�e�h�c���m�t�k�k
        pvc2ErrMsg := SUBSTRB('�p�����[�^�Ɩ����������͂܂��͕s���ł��B',1,1023);
        RAISE excMistakeCommonParam;
    END IF;

    IF pvc2PlantCd IS NULL THEN      -- �����D�h�H��R�[�h�h��NULL�̏ꍇ
        pvc2ErrMsg  := SUBSTR('�H��R�[�h�������͂܂��͕s���ł��B',1,1023);
        
        RAISE excMistakeCommonParam;
    END IF;

    IF pvc2ItemCd IS NULL THEN    -- �����D�h�i�ڔԍ��h��NULL�̏ꍇ
	pvc2ErrMsg  := SUBSTR('�i�ڔԍ��������͂܂��͕s���ł��B',1,1023);
        RAISE excMistakeCommonParam;
    END IF;

    IF pvc2ACPT_PROC_DATE IS NULL THEN    -- �����D�h���Y�����h��NULL�̏ꍇ
	pvc2ErrMsg  := SUBSTR('���Y�����������͂܂��͕s���ł��B',1,1023);
        RAISE excMistakeCommonParam;
    END IF;    

    blnRet := FNCGETSETLOTNUMBERINGFD(
                UTL_FileHandle              --�t�@�C���n���h�� 
               ,pvc2LogMode                 --�k�n�f���[�h
               ,pvc2OutputMode              --�o�̓��[�h
               ,pvc2UserId                  --���[�U�h�c
               ,pvc2BusinessName            --�Ɩ���
               ,pvc2PlantCd                 --�H��R�[�h
               ,pvc2ItemCd                  --�i�ڔԍ�
               ,pvc2ACPT_PROC_DATE          --���Y���t/������t
               ,pvc2LotNo
               ,vc2MessageId                --�G���[���b�Z�[�WID
               ,numStatus                   --���ʃX�e�[�^�X�i1�F����I�� 2:�x���I�� 3�F�ُ�I���j
              );
    IF blnRet = FALSE THEN
        pvc2ErrMsg := SUBSTR('�����̔Ԏ擾�ɃG���[���������܂����B',1,1023);
        pvc2ErrCd  := vc2MessageId;
        RAISE excFaild;
    END IF;
/*--------------------------------------
  PLSQL����I��
--------------------------------------*/
    
    /* ���ʃX�e�[�^�X�̃Z�b�g */
    pnumStatus := 1;             --����I��
    pvc2ErrCd  := vc2MessageId;
    
    /* TraceLog �̏o�� */
    TraceLog(LOGMSG_END);

    /* LogFile �� CLOSE */
    blnRet := FNCLOGCLOSE(UTL_FileHandle);
    IF blnRet=FALSE THEN
        RAISE excFncTraceLog;
    END IF;

--< ��O���� >---------------------------------------------------------------
EXCEPTION
    WHEN excMistakeCommonParam THEN
        pnumStatus      := 3;  --�ُ�I��
        pvc2ErrCd       := 'AE22061';
       
        /* ErrorLog �̏o�� */
        ErrorLog;
          
        /* TraceLog �̏o�� */
        TraceLog(LOGMSG_END || LOGMSG_ERR);

        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);
    
    WHEN excFaild THEN
        pnumStatus      := 3;  --�ُ�I��
       
        /* ErrorLog �̏o�� */
        ErrorLog;
          
        /* TraceLog �̏o�� */
        TraceLog(LOGMSG_END || LOGMSG_ERR);

        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);
    WHEN excFncTraceLog THEN
        pnumStatus      := 3;  --�ُ�I��
       
    WHEN OTHERS THEN
        pnumStatus      := 3;         --�ُ�I��
        pvc2ErrCd       := 'ZZ99001';
        
        pvc2ErrMsg := SUBSTRB(pvc2ErrMsg || SQLERRM,1,1023);

        /* ErrorLog �̏o�� */
        ErrorLog;

        -- TraceLog �̏o��
        TraceLog(LOGMSG_END || LOGMSG_ERR);

        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);
        
END;
/
