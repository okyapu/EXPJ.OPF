CREATE OR REPLACE FUNCTION FncCreditInformationToAiJa(
/*------------------------------------------------------------------------------
'
' FncCreditInformationToAiJa.Sql
'
' version   : 1.00.00
'
' �C������
'
' �@�\      : Ja������捞����
'
' ������    : UTL_FileHandle       - (i)�t�@�C���n���h��
'             pvc2LogMode          - (i)�k�n�f���[�h'
'             pvc2OutputMode       - (i)�o�̓��[�h'
'             pvc2UserId           - (i)���[�U�h�c
'             pvc2BusinessName     - (i)�Ɩ���
'             pvc2PlantCd          - (i)�H��R�[�h
'             pnumTotalCount       - (o)�����f�[�^����
'             pnumNormalCount      - (o)���팏��
'             pnumWarnCount        - (o)���[�j���O����
'             pnumErrorCount       - (o)�ُ팏��
'             pvc2ErrorCd          - (o)�G���[�R�[�h
'             pnumStatus           - (o)���ʃX�e�[�^�X
'
' �@�\����  : EXPLANNER/�ia��[�������]���甄�|�����W�񂵂āAA���������|�C���^�t�F�[�X�Ƀf�[�^�o�^����B
'
' ���l      : �_�~�\�[�X
'
------------------------------------------------------------------------------*/
   UTL_FileHandle               IN  UTL_FILE.FILE_TYPE  --�t�@�C���n���h��
   ,pvc2LogMode                 IN  VARCHAR2            --�k�n�f���[�h
   ,pvc2OutputMode              IN  VARCHAR2            --�o�̓��[�h
   ,pvc2UserId                  IN  VARCHAR2            --���[�U�h�c
   ,pvc2BusinessName            IN  VARCHAR2            --�Ɩ���
   ,pvc2PlantCd                 IN  VARCHAR2            --�H��R�[�h
   ,pnumTotalCount              OUT NUMBER              --�����f�[�^����
   ,pnumNormalCount             OUT NUMBER              --���팏��
   ,pnumWarnCount               OUT NUMBER              --���[�j���O����
   ,pnumErrorCount              OUT NUMBER              --�ُ팏��
   ,pvc2ErrorCd                 OUT VARCHAR2            --�G���[�R�[�h
   ,pnumStatus                  OUT NUMBER              --���ʃX�e�[�^�X�i1:����I���A2:���[�j���O�I���A3:�ُ�I���j
) RETURN BOOLEAN 
IS

/* �萔�̐錾 */

    MY_SQL_NAME                           VARCHAR2(120):= 'FNCCREDITINFORMATIONTOAIJA'; --�o�k�^�r�p�k��
    LOGMSG_START                          VARCHAR2(20) := 'Start';                      --���O�p���\�b�h�J�n�錾
    LOGMSG_END                            VARCHAR2(12) := 'End';                        --���O�p���\�b�h�I���錾
    LOGMSG_ERR                            VARCHAR2(32) := '�ُ�I��';

    --//�Ɩ����O�p���b�Z�[�WID
    LOGMSG_ID_COMMON_CHK                  VARCHAR2(28) := 'BF00011';                    --�������s���̂��߁A���|�C���^�t�F�[�X���擾�������ł��܂���ł����B
    LOGMSG_ID_END_ERR                     VARCHAR2(28) := 'BF00018';                    --�`���A�g���|�C���^�t�F�[�X�����ŁA������捞�����s���܂����B

    --//�Ɩ����O�p���b�Z�[�W
    LOGMSG_NM_COMMON_CHK                  VARCHAR2(200) := '(SBM0017)�������s���̂��ߏ������ł��܂���ł����B';  --�������s���̂��߁A���|�C���^�t�F�[�X���擾�������ł��܂���ł����B
    LOGMSG_NM_END_ERR                     VARCHAR2(200) := '(SBM0019)������捞�Ɏ��s���܂����B';              --�`���A�g���|�C���^�t�F�[�X�����ŁA������捞�����s���܂����B

    --//���ʃX�e�[�^�X
    STATUS_NORMAL                         NUMBER        := 1;      -- ����I��
    STATUS_WARNING                        NUMBER        := 2;      -- ���[�j���O
    STATUS_ERROR                          NUMBER        := 3;      -- �ُ�I��

/* �ϐ��̐錾 WORK */
    --//����`�ُ�
    excFncTraceLog                         EXCEPTION;              --���O���������s
    excCommonChk                           EXCEPTION;              --���ʈ������s
    
    LOGMSG_NM_END                          VARCHAR2(200);          --�����I���錾

    blnRet                                 BOOLEAN;                --���ʊ֐��̖ߒl

    --//�ڍ׃��b�Z�[�W�i�[�p
    vc2Comment                             VARCHAR2(1024);

BEGIN
    /* TraceLog�̏o��(Start)�������s�� */
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, LOGMSG_START);

    IF (NOT blnRet) THEN
        --//���ʃX�e�[�^�X���ُ���Z�b�g����
        pnumStatus := STATUS_ERROR;
        RAISE excFncTraceLog;
    END IF;

    --//���ʈ����`�F�b�N
    --�k�n�f���[�h
    IF pvc2LogMode IS NULL THEN
        pnumStatus := STATUS_ERROR;
        RAISE excCommonChk;
    END IF;

    --�o�̓��[�h
    IF pvc2OutputMode IS NULL THEN
        pnumStatus := STATUS_ERROR;
        RAISE excCommonChk;
    END IF;

    --���[�U�h�c
    IF pvc2UserId IS NULL THEN
        pnumStatus := STATUS_ERROR;
        RAISE excCommonChk;
    END IF;

    --�Ɩ���
    IF pvc2BusinessName IS NULL THEN
        pnumStatus := STATUS_ERROR;
        RAISE excCommonChk;
    END IF;

    --�H��R�[�h
    IF pvc2PlantCd IS NULL THEN
        pnumStatus := STATUS_ERROR;
        RAISE excCommonChk;
    END IF;

    --//�J�E���^�A�ϐ��̏�����
    pnumTotalCount   := 0;
    pnumNormalCount  := 0;
    pnumWarnCount    := 0;
    pnumErrorCount   := 0;

    --����̏ꍇ
    --����̏ꍇ
    --���ʂ�ݒ肷��

    pvc2ErrorCd     := '';
    pnumStatus      := STATUS_NORMAL;

    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                          pvc2PlantCd, MY_SQL_NAME, LOGMSG_END);
    RETURN TRUE;

EXCEPTION
    WHEN excFncTraceLog THEN        
        pnumStatus := STATUS_ERROR;
        RETURN FALSE;

    WHEN excCommonChk THEN        
        pnumStatus := STATUS_ERROR;
        pvc2ErrorCd:= LOGMSG_ID_COMMON_CHK;
        /* LogFile �� CLOSE */
         /* TraceLog �̏o�� */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                              pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_COMMON_CHK);
        /* �Ɩ��I�����b�Z�[�W�̏o�� */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                            pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_COMMON_CHK,LOGMSG_NM_COMMON_CHK);
        RETURN FALSE;

    WHEN OTHERS THEN
        --�ُ폈��
        vc2Comment:= SUBSTR('(SBM0020)<< Jf������捞�����ُ�I��>>�@'|| SQLERRM, 1,256);
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                              pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_END_ERR);
        /* �Ɩ��I�����b�Z�[�W�̏o�� */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                            pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_END_ERR,vc2Comment);

END;
/
