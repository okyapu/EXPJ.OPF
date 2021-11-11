CREATE OR REPLACE FUNCTION FNCGETLOTNUMBERINGFD(
/*------------------------------------------------------------------------------
' author    : Zhaohaikun
' version   : 1.00.00
'
' �C������
' 2006.11.13 ����
'
' �@�\      : �݌Ƀ��b�g�ԍ��̔�
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
              pvc2LotNo            - (o)�݌Ƀ��b�g
'             pvc2ErrCd            - (o)�G���[�R�[�h
'             pnumStatus           - (o)���ʃX�e�[�^�X(1:����I���A2:�x���I���A3:�ُ�I��)
'
' �@�\����  : �݌Ƀ��b�g�ԍ��̍̔Ԃ��s���B
'           : �����A�ԍ̔ԏꍇ�V�[�P���X���̔ԁA���������̔ԏꍇ�Ɩ����t(YYYYMMDD)
'
' ���l      : ���b�g�g���[�X�Ǘ����Ȃ��i�ڔԍ��ꍇ�ُ�I��
'           : �݌Ƀ��b�g�ԍ���b�g�g���[�X�Ǘ����ȕi�ڔԍ��ꍇ�ُ�I��
'
------------------------------------------------------------------------------*/
    pFileHandle         IN  UTL_FILE.FILE_TYPE  --�t�@�C���n���h��
   ,pvc2LogMode         IN  VARCHAR2            --�k�n�f���[�h
   ,pvc2OutputMode      IN  VARCHAR2            --�o�̓��[�h
   ,pvc2UserId          IN  VARCHAR2            --���[�U�h�c
   ,pvc2BusinessName    IN  VARCHAR2            --�Ɩ���
   ,pvc2PlantCd         IN  VARCHAR2            --�H��R�[�h
   ,pvc2ItemCd          IN  VARCHAR2            --(i)�i�ڔԍ�
   ,pvc2LotNo           OUT VARCHAR2            --(o)�݌Ƀ��b�g
   ,pvc2ErrCd           OUT VARCHAR2            --(o)�G���[�R�[�h
   ,pnumStatus          OUT NUMBER              --(o)���ʃX�e�[�^�X
) RETURN BOOLEAN
IS

    -- �萔�̐錾
    MY_SQL_NAME            VARCHAR2(32) := 'FNCGETLOTNUMBERINGFD';  --�o�k�^�r�p�k��

    -- �ϐ��̐錾
    UTL_FileHandle         UTL_FILE.FILE_TYPE;            --�t�@�C���n���h��
    blnRet                 BOOLEAN;                       --BOOLEAN�^ �ԋp�l
    pvc2ErrMsg             VARCHAR2(1023);                --�G���[���b�Z�[�W�쐬��Ɨ̈�
    pvc2LOT_CTRL_FLG    M_ITEM.LOT_CTRL_FLG%TYPE;   --�ϐ�.���V�g�Ǘ��t���O
    pvc2LOT_NUMBERING_TYP  M_ITEM.LOT_NUMBERING_TYP%TYPE; --�ϐ�.���V�g�ԍ��̔ԋ敪
    pvc2ITEM_CD            M_ITEM.ITEM_CD%TYPE;           --�ϐ�.�i�ڔԍ�
    pvc2Sysdate            VARCHAR2(8);                   --�ϐ�.�V�X�e�����t

    -- LOG �̐錾
    LOGMSG_START           CONSTANT VARCHAR2(5)   := 'Start';      --���O�p���\�b�h�J�n�錾
    LOGMSG_END             CONSTANT VARCHAR2(3)   := 'End';        --���O�p���\�b�h�I���錾
    LOGMSG_ERR             CONSTANT VARCHAR2(12)  := '�ُ�I��';

    -- ��O�̐錾
    excMistakeCommonParam  EXCEPTION;          --�p�����[�^�s��
    excLotFaild            EXCEPTION;
    excFncTraceLog         EXCEPTION;    --�g���[�X���O�o�̓G���[

-- �J�[�\���̐錾
    CURSOR curSYS_RCV_ISSUE_CTRL_CD_CTRL IS
    SELECT  RCV_ISSUE_CTRL_CD
    FROM    SYS_RCV_ISSUE_CTRL_CD_CTRL
    WHERE   PLANT_CD = pvc2PlantCd
    FOR UPDATE;

-- ROWTYPE �̐錾
    RtpSYS_RCV_ISSUE_CTRL_CD_CTRL     curSYS_RCV_ISSUE_CTRL_CD_CTRL%ROWTYPE;

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
        pvc2ErrMsg := SUBSTR('(SBM0739)�H��R�[�h�������͂܂��͕s���ł��B',1,1023);

        RAISE excMistakeCommonParam;
    END IF;

    IF pvc2ItemCd IS NULL THEN    -- �����D�h�i�ڔԍ��h��NULL�̏ꍇ
  pvc2ErrMsg := SUBSTR('(SBM0740)�i�ڔԍ��������͂܂��͕s���ł��B',1,1023);
        RAISE excMistakeCommonParam;
    END IF;

/*------------------------------------------------------------------------
              �i�ڔԍ��@���b�g�Ǘ����f
---------------------------------------------------------------------------*/
    BEGIN
        SELECT ITEM_CD, LOT_CTRL_FLG, LOT_NUMBERING_TYP
          INTO pvc2ITEM_CD, pvc2LOT_CTRL_FLG, pvc2LOT_NUMBERING_TYP
          FROM M_ITEM
         WHERE ITEM_CD  = pvc2ItemCd;
    EXCEPTION
        WHEN NO_DATA_FOUND  THEN
            pvc2ErrMsg := SUBSTR('(SBM0820)�w�肵���i�ږ��o�^�ł��B',1,1023);
            pvc2ErrCd  := 'AE22052';
            RAISE excLotFaild;
    END;
    IF pvc2LOT_CTRL_FLG = 0 THEN
        pvc2ErrMsg := SUBSTR('(SBM0821)�w�肵���i�ڂ͔񃍃b�g�Ǘ��i�ڂł��B',1,1023);
        pvc2ErrCd  := 'AE22053';
        RAISE excLotFaild;
    END IF;
    IF  pvc2LOT_CTRL_FLG = 1 AND pvc2LOT_NUMBERING_TYP = 0 THEN
        pvc2ErrMsg := SUBSTR('(SBM0822)�w�肵���i�ڂ̍݌Ƀ��b�g�ԍ��͎蓮�ō̔Ԃ��Ă��������B',1,1023);
        pvc2ErrCd  := 'AE22054';
        RAISE excLotFaild;
    END IF;

    IF pvc2LOT_CTRL_FLG = 1 AND pvc2LOT_NUMBERING_TYP = 1 THEN
        BEGIN
            SELECT  LPAD(to_char(SEQ_JF_LOT_NO.nextval),12,0) INTO pvc2LotNo FROM DUAL;
        EXCEPTION
            WHEN OTHERS THEN
                RAISE;
        END;
    END IF;

    IF pvc2LOT_CTRL_FLG = 1 AND pvc2LOT_NUMBERING_TYP = 2 THEN
        BEGIN
            SELECT to_char(BUSINESS_OPR_DATE,'YYYYMMDD')
              INTO pvc2LotNo
              FROM SYS_DATE_CTRL
             WHERE PLANT_CD = pvc2PlantCd;
        EXCEPTION
            WHEN NO_DATA_FOUND THEN
                pvc2ErrMsg := SUBSTR('(SBM0823)�w�肵���H��̋Ɩ��^�p���͐ݒ肳��Ă��܂���B',1,1023);
                pvc2ErrCd  := 'AE22055';
                RAISE excLotFaild;
        END;
    END IF;

    IF pvc2LOT_CTRL_FLG = 1 AND pvc2LOT_NUMBERING_TYP = 3 THEN
        BEGIN
            SELECT to_char(BUSINESS_OPR_DATE,'YYYYMMDD')
              INTO pvc2Sysdate
              FROM SYS_DATE_CTRL
             WHERE PLANT_CD = pvc2PlantCd;
        EXCEPTION
            WHEN NO_DATA_FOUND THEN
                pvc2ErrMsg := SUBSTR('(SBM0823)�w�肵���H��̋Ɩ��^�p���͐ݒ肳��Ă��܂���B',1,1023);
                pvc2ErrCd  := 'AE22055';
                RAISE excLotFaild;
        END;
        BEGIN
            SELECT NVL(MAX(LOT_NO)+1,pvc2Sysdate || '0000001')
              INTO pvc2LotNo
              FROM T_LOT_CTRL
             where ITEM_CD = pvc2ItemCd
              and LOT_NO like  pvc2Sysdate||'%';
        END;

    END IF;

/*--------------------------------------
  PLSQL����I��
--------------------------------------*/

    pnumStatus := 1;             --����I��
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
        pvc2ErrCd       := 'AE22051';
        RETURN FALSE;

    WHEN excLotFaild THEN
        pnumStatus      := 3;  --�ُ�I��

        /* ErrorLog �̏o�� */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, pvc2ErrCd, pvc2ErrMsg);
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        RETURN FALSE;
    WHEN excFncTraceLog THEN
        pnumStatus      := 3;  --�ُ�I��

        RETURN FALSE;

    WHEN OTHERS THEN
        pnumStatus      := 3;         --�ُ�I��
        pvc2ErrCd       := 'ZZ99001';

        /* ErrorLog �̏o�� */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, pvc2ErrCd, pvc2ErrMsg);
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);

        RETURN FALSE;

END;
/
