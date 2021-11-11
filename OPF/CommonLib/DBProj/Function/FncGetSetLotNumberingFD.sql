CREATE OR REPLACE FUNCTION      FNCGETSETLOTNUMBERINGFD(
/*------------------------------------------------------------------------------
' author    : Zhaohaikun
' version   : 1.00.00
'
' �C������
' 2006.11.13 ����
'
' �@�\      : �����̔ԏ���
'
' �߂�l    : Boolean
'               True :����I��
'               False:�ُ�I��
'
' ������    : pFileHandle                  - (i)�t�@�C���n���h��
'             pvc2LogMode                  - (i)�k�n�f���[�h
'             pvc2OutputMode               - (i)�o�̓��[�h
'             pvc2UserId                   - (i)���[�U�h�c
'             pvc2BusinessName             - (i)�Ɩ���
'             pvc2PlantCd                  - (i)�H��R�[�h
'         -- �Ɩ��ŗL
'             pvc2ItemCd                   - (i)�i�ڔԍ�
,             pvc2ACPT_PROC_DATE           - (i)���Y���� 
'             pnumStatus                   - (o)���ʃX�e�[�^�X(1:����I���A2:�x���I���A3:�ُ�I��)
'             pvc2ErrCd                    - (o)�G���[�R�[�h
'
' �@�\����  : �����̔ԏ���
'         
' ���l      : 
------------------------------------------------------------------------------*/
    pFileHandle                  IN  UTL_FILE.FILE_TYPE  --�t�@�C���n���h��
   ,pvc2LogMode                  IN  VARCHAR2            --�k�n�f���[�h
   ,pvc2OutputMode               IN  VARCHAR2            --�o�̓��[�h
   ,pvc2UserId                   IN  VARCHAR2            --���[�U�h�c
   ,pvc2BusinessName             IN  VARCHAR2            --�Ɩ���
   ,pvc2PlantCd                  IN  VARCHAR2            --�H��R�[�h
   ,pvc2ItemCd                   IN  VARCHAR2            --(i)�i�ڔԍ�
   ,pvc2ACPT_PROC_DATE           IN  VARCHAR2            --(i)���Y����
   ,pvc2LotNo                    OUT VARCHAR2            --(o)�݌Ƀ��b�g�ԍ�
   ,pvc2ErrCd                    OUT VARCHAR2            --(o)�G���[�R�[�h
   ,pnumStatus                   OUT NUMBER              --(o)���ʃX�e�[�^�X


)RETURN BOOLEAN-- �߂�l�̃f�[�^�^
IS
    -- �萔�̐錾
    MY_SQL_NAME                VARCHAR2(32) := 'FNCGETSETLOTNUMBERINGFD';  --�o�k�^�r�p�k��

    -- �ϐ��̐錾
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
        pvc2ErrMsg := SUBSTRB('�p�����[�^�k�n�f���[�h�������͂܂��͕s���ł��B',1,1023);
        RAISE excMistakeCommonParam;
    END IF;

    IF pvc2OutputMode IS NULL THEN          -- �o�̓��[�h���m�t�k�k
        pvc2ErrMsg := SUBSTRB('�p�����[�^�o�̓��[�h�������͂܂��͕s���ł��B',1,1023);
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

    /* ���b�g�̔� */
    blnRet := FNCGETLOTNUMBERINGFD(
                pFileHandle                 --�t�@�C���n���h�� 
               ,pvc2LogMode                 --�k�n�f���[�h
               ,pvc2OutputMode              --�o�̓��[�h
               ,pvc2UserId                  --���[�U�h�c
               ,pvc2BusinessName            --�Ɩ���
               ,pvc2PlantCd                 --�H��R�[�h
               ,pvc2ItemCd
               ,pvc2LotNo                   --���o�ɊǗ��ԍ�
               ,vc2MessageId                --�G���[���b�Z�[�WID
               ,numStatus                   --���ʃX�e�[�^�X�i1�F����I�� 2:�x���I�� 3�F�ُ�I���j
              );
    IF blnRet=FALSE THEN
        pvc2ErrMsg := SUBSTR('���b�g�����̔ԂɃG���[���������܂����B',1,1023);
        pvc2ErrCd  := vc2MessageId;
        RAISE excFaild;
    END IF;
     /*�ܖ��������� */
    blnRet := FNCCALCBESTBEFOREFD(
                pFileHandle                 --�t�@�C���n���h�� 
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
    IF pvc2BESTBEFORE = '0' THEN
        pvc2BESTBEFORE := NULL;
    END IF;
    IF blnRet=FALSE THEN
        pvc2ErrMsg := SUBSTR('�ܖ������擾�ɃG���[���������܂����B',1,1023);
        pvc2ErrCd  := vc2MessageId;
        RAISE excFaild;
    END IF;
/*--------------------------------------
  ���b�g�Ǘ��o�^����
--------------------------------------*/
    BEGIN
        SELECT LOT_NO INTO pvc2LotNo_1
          FROM T_LOT_CTRL
         WHERE LOT_NO = pvc2LotNo
           AND ITEM_CD= pvc2ItemCd;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
        BEGIN
            INSERT INTO T_LOT_CTRL(LOT_NO,
                                   ITEM_CD,
                                   PRD_CMPLT_DATE,
                                   BEST_BEFORE_DATE,
                                   DEL_FLG, 
                                   CREATED_DATE,
                                   CREATED_BY,
                                   CREATED_PRG_NM,
                               	   UPDATED_DATE,
                                   UPDATED_BY,
                                   UPDATED_PRG_NM,
                                   MODIFY_COUNT)
            VALUES(pvc2LotNo,
                   pvc2ItemCd,
                   TO_DATE(pvc2ACPT_PROC_DATE,'YYYY/MM/DD'),
                   TO_DATE(pvc2BESTBEFORE,'YYYY/MM/DD'),
                   1,
                   SYSDATE,
                   pvc2UserId,
                   pvc2BusinessName,
                   SYSDATE,
                   pvc2UserId,
                   pvc2BusinessName,
                   0);
            EXCEPTION
        WHEN OTHERS THEN
            pvc2ErrMsg := SUBSTR('���b�g�Ǘ�' || ' ���[�U�R�[ ' || pvc2UserId || ' �o�^�G���[',1,1023);
            pvc2ErrCd  := 'AE22059';
            RAISE;
        END;
    END;    
/*--------------------------------------
  PLSQL����I��
--------------------------------------*/
    pvc2ErrCd  := vc2MessageId;
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
        pvc2ErrCd       := 'AE22058';
        RETURN FALSE;
    
    WHEN excFaild THEN
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
