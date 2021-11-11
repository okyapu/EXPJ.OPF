CREATE OR REPLACE PROCEDURE SQLGETEXCHAMOUNT (
/*------------------------------------------------------------------------------
'
' version   : 1.00.00
'
' �C������
' 2014.03.05 ����
' 
' �@�\      : �M�݊��Z
'           
'
'
' ������    : pvc2LogMode                      - (i)�k�n�f���[�h
'             pvc2OutputMode                   - (i)�o�̓��[�h
'             pvc2OutputPath                   - (i)�o�̓t�@�C���p�X
'             pvc2OutputName                   - (i)�o�̓t�@�C����
'             pvc2UserId                       - (i)���[�U�h�c
'             pvc2BusinessName                 - (i)�Ɩ���
'             pvc2PlantCd                      - (i)�H��R�[�h
'             pvc2CurAmount                    - (i)�ϊ��O���z
'             pvc2CompanyCd                    - (i)��ЃR�[�h
'             pvc2CurCd                        - (i)�ʉ݃R�[�h
'             pvc2ExchTyp                      - (i)�ב֎��
'             pvc2RoundTyp                     - (i)���z�܂�ߋ敪(1:�l�̌ܓ�,2:�؂�グ,3:�؂�̂�)
'             pvc2ExchRateDate                 - (i)�בփ��[�g����p���t
'             pvc2HomeCurAmount                - (o)�ϊ�����z
'             pnumStatus                       - (o)���ʃX�e�[�^�X
'
' �@�\����  : �O�݂��~�݂ɕϊ�����B

' ���l      : �G���[�������͌��ʃX�e�[�^�X(pnumStatus)�Ɉُ�I����ݒ肵�ĕԂ��B
'
------------------------------------------------------------------------------*/
    pvc2LogMode                 IN  VARCHAR2    --�k�n�f���[�h
   ,pvc2OutputMode              IN  VARCHAR2    --�o�̓��[�h
   ,pvc2OutputPath              IN  VARCHAR2    --�o�̓t�@�C���p�X
   ,pvc2OutputName              IN  VARCHAR2    --�o�̓t�@�C����
   ,pvc2UserId                  IN  VARCHAR2    --���[�U�h�c
   ,pvc2BusinessName            IN  VARCHAR2    --�Ɩ���
   ,pvc2PlantCd                 IN  VARCHAR2    --�H��R�[�h
   ,pvc2CurAmount               IN  NUMBER      --�ϊ��O���z
   ,pvc2CompanyCd               IN  VARCHAR2    --��ЃR�[�h
   ,pvc2CurCd                   IN  VARCHAR2    --�ʉ݃R�[�h
   ,pvc2ExchTyp                 IN  NUMBER      --�ב֎��
   ,pvc2RoundTyp                IN  NUMBER      --���z�܂�ߋ敪
   ,pvc2ExchRateDate            IN  DATE        --�בփ��[�g����p���t
   ,pvc2HomeCurAmount           OUT NUMBER      --�ϊ�����z
   ,pnumStatus                  OUT NUMBER      --���ʃX�e�[�^�X�i1�F����I�� 3�F�ُ�I���j
)
IS
    
/* �ϐ��̐錾 */
    UTL_FileHandle            UTL_FILE.FILE_TYPE; --�t�@�C���n���h��
    blnRet                    BOOLEAN;            --BOOLEAN�^ �ԋp�l
    numStatus                 NUMBER(1);          --���ʃX�e�[�^�X
    
/* �萔�̐錾 */
    MY_SQL_NAME            VARCHAR2(120)  := 'SQLGetExchAmount';      --�o�k�^�r�p�k��
    LOGMODE_NOLOG          VARCHAR2(4)   := '0';                   --�k�n�f���[�h�@�k�n�f����
    OUTPUTMODE_FILE        VARCHAR2(4)   := '1';                   --�o�̓��[�h�@�@�t�@�C��
    LOGMSG_START           VARCHAR2(20)   := 'Start';               --���O�p���\�b�h�J�n�錾
    LOGMSG_END             VARCHAR2(12)   := 'End';                 --���O�p���\�b�h�I���錾
    LOGMSG_ERR             VARCHAR2(12)   := 'Err';                 --���O�p���\�b�h�G���[�錾
    
    STATUS_NORMAL                NUMBER        := 1;          -- ����I��
    STATUS_WARNING               NUMBER        := 2;          -- �x���I��
    STATUS_ERROR                 NUMBER        := 3;          -- �ُ�I��

    -- ��O�̐錾
    excFncTraceLog                 EXCEPTION;          --�g���[�X���O�o�̓G���[
    excExcMakeRerurn               EXCEPTION;          --�����G���[
    
BEGIN

    pnumStatus := STATUS_NORMAL;

    /* LogFile �� OPEN */
    blnRet := FNCLOGOPEN(pvc2OutputPath, pvc2OutputName, pvc2PlantCd, pvc2OutputMode, UTL_FileHandle);

    /* TraceLog �̏o�� */
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                           pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                           MY_SQL_NAME, LOGMSG_START);
                          
    IF blnRet=FALSE THEN
        RAISE excFncTraceLog;
    END IF
    ;
    

    blnRet := FNCGETEXCHAMOUNT(
                UTL_FileHandle              --�t�@�C���n���h�� 
               ,pvc2LogMode                 --�k�n�f���[�h
               ,pvc2OutputMode              --�o�̓��[�h
               ,pvc2UserId                  --���[�U�h�c
               ,pvc2BusinessName            --�Ɩ���
               ,pvc2PlantCd                 --�H��R�[�h
               ,pvc2CurAmount               --�ϊ��O���z
               ,pvc2CompanyCd               --��ЃR�[�h
               ,pvc2CurCd                   --�ʉ݃R�[�h
               ,pvc2ExchTyp                 --�ב֎��
               ,pvc2RoundTyp                --���z�܂�ߋ敪
               ,pvc2ExchRateDate            --�בփ��[�g����p���t
               ,pvc2HomeCurAmount           --�ϊ�����z
               ,numStatus                  --���ʃX�e�[�^�X�i1�F����I�� 3�F�ُ�I���j
              );
    IF blnRet=FALSE THEN
        RAISE excExcMakeRerurn;
    END IF
    ;
    
    /* ���ʃX�e�[�^�X�̃Z�b�g */
    pnumStatus := numStatus;
    
    /* TraceLog �̏o�� */
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    /* LogFile �� CLOSE */
    blnRet := FNCLOGCLOSE(UTL_FileHandle);
    IF blnRet=FALSE THEN
        RAISE excFncTraceLog;
    END IF
    ;
    
    
--< ��O���� >---------------------------------------------------------------
EXCEPTION
    WHEN excExcMakeRerurn THEN     
        pnumStatus := STATUS_ERROR;
        
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_ERR);
        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);
    WHEN excFncTraceLog THEN 
        pnumStatus := STATUS_ERROR;
        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);
    WHEN UTL_FILE.INVALID_PATH THEN
        pnumStatus := STATUS_ERROR;
    WHEN UTL_FILE.INVALID_MODE THEN        
        pnumStatus := STATUS_ERROR;
    WHEN UTL_FILE.INVALID_OPERATION THEN     
        pnumStatus := STATUS_ERROR;
    WHEN UTL_FILE.INTERNAL_ERROR THEN 
        pnumStatus := STATUS_ERROR;
    WHEN UTL_FILE.INVALID_FILEHANDLE THEN 
        pnumStatus := STATUS_ERROR;
    WHEN OTHERS THEN 
        pnumStatus := STATUS_ERROR;
        /* ErrorLog �̏o�� */
        blnRet := FncErrLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, SQLCODE, SQLERRM);
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_ERR);
        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

END;
/