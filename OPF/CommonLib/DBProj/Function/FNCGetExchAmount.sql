CREATE OR REPLACE FUNCTION FNCGETEXCHAMOUNT(
/*----------------------------------------------------------------------------
'
' version   : 1.00.00
'
' �C������
' 2014.03.05 ����
' 2015.09.07 ���������擾�p�ʉ݃R�[�h���C��
' 
' �@�\      :�M�݊��Z
'
' �߂�l    : Boolean 
'               True :����I��
'               False:�ُ�I��
'
' ������    : pFileHandle                      - (i)�t�@�C���n���h��
'             pvc2LogMode                      - (i)�k�n�f���[�h
'             pvc2OutputMode                   - (i)�o�̓��[�h
'             pvc2UserId                       - (i)���[�U�h�c
'             pvc2BusinessName                 - (i)�Ɩ���
'             pvc2PlantCd                      - (i)�H��R�[�h
'             pvc2CurAmount                    - (i)�ϊ��O���z
'             pvc2CompanyCd                    - (i)��ЃR�[�h
'             pvc2CurCd                        - (i)�ʉ݃R�[�h
'             pvc2ExchTyp                      - (i)�ב֎��
'             pvc2RoundTyp                     - (i)���z�܂�ߋ敪
'             pvc2ExchRateDate                 - (i)�בփ��[�g����p���t
'             pvc2HomeCurAmount                - (o)�ϊ�����z
'             pnumStatus                       - (o)���ʃX�e�[�^�X

'
' �@�\����  : �O�݂��~�݂ɕϊ�����B
'
' ���l      : �G���[�������͌��ʃX�e�[�^�X(pnumStatus)�Ɉُ�I����ݒ肵�ĕԂ��B
'
------------------------------------------------------------------------------*/
    pFileHandle                 IN  UTL_FILE.FILE_TYPE  --�t�@�C���n���h��
   ,pvc2LogMode                 IN  VARCHAR2            --�k�n�f���[�h
   ,pvc2OutputMode              IN  VARCHAR2            --�o�̓��[�h
   ,pvc2UserId                  IN  VARCHAR2            --���[�U�h�c
   ,pvc2BusinessName            IN  VARCHAR2            --�Ɩ���
   ,pvc2PlantCd                 IN  VARCHAR2            --�H��R�[�h
   ,pvc2CurAmount               IN  NUMBER              --�ϊ��O���z
   ,pvc2CompanyCd               IN  VARCHAR2            --��ЃR�[�h
   ,pvc2CurCd                   IN  VARCHAR2            --�ʉ݃R�[�h
   ,pvc2ExchTyp                 IN  NUMBER              --�ב֎��
   ,pvc2RoundTyp                IN  NUMBER              --���z�܂�ߋ敪
   ,pvc2ExchRateDate            IN  DATE                --�בփ��[�g����p���t
   ,pvc2HomeCurAmount           OUT NUMBER              --�ϊ�����z
   ,pnumStatus                  OUT NUMBER              --���ʃX�e�[�^�X�i1�F����I�� 3�F�ُ�I���j
    ) RETURN BOOLEAN
IS
/* �J�[�\���̐錾*/
        --//�M�݂��擾����
    CURSOR curSYS_HOME_CUR IS
    SELECT SYS_HOME_CUR.HOME_CUR_CD
    FROM SYS_HOME_CUR
    WHERE SYS_HOME_CUR.CTRL_CD = 'SYSTEM';
    recSYS_HOME_CUR  curSYS_HOME_CUR%ROWTYPE;
    
    --//�בփ��[�g���擾����
    CURSOR curM_EXCH_RATE(
                          ctypCompanyCd        M_EXCH_RATE.COMPANY_CD%TYPE
                         ,ctypCurCd            M_EXCH_RATE.CUR_CD%TYPE
                         ,ctypExchTyp          M_EXCH_RATE.EXCH_TYP%TYPE
                         ,ctypExchStartDate    M_EXCH_RATE.EXCH_START_DATE%TYPE
                         ) IS
    SELECT M_EXCH_RATE.EXCH_RATE
    FROM M_EXCH_RATE
    WHERE M_EXCH_RATE.COMPANY_CD = ctypCompanyCd
      AND M_EXCH_RATE.CUR_CD = ctypCurCd
      AND M_EXCH_RATE.EXCH_TYP = ctypExchTyp
      AND M_EXCH_RATE.EXCH_START_DATE <= ctypExchStartDate
    ORDER BY M_EXCH_RATE.EXCH_START_DATE DESC;--�ב֊J�n���t

      recM_EXCH_RATE  curM_EXCH_RATE%ROWTYPE;
    

    --//�ʉ݂̏����������擾����
    CURSOR curM_CUR(
                    ctypCurCd                   M_CUR.CUR_CD%TYPE
                   ) IS
    SELECT M_CUR.DECIMAL_FIG
    FROM M_CUR
    WHERE M_CUR.CUR_CD = ctypCurCd;
      
      recM_CUR  curM_CUR%ROWTYPE;
      
/* �ϐ��̐錾 */
    blnRet                               BOOLEAN;                                          --BOOLEAN�^ �ԋp�l
    roundErrCd                           VARCHAR2(40);                                     --�[�������̃G���[�R�[�h
    roundStatus                          NUMBER;                                           --�[�������̏�������

/* �萔�̐錾 */
    MY_SQL_NAME                          VARCHAR2(120)  := 'FNCGetExchAmount';            --�o�k�^�r�p�k��
    LOGMSG_START                         VARCHAR2(20)   := 'Start';                       --���O�p���\�b�h�J�n�錾
    LOGMSG_END                           VARCHAR2(12)   := 'End';                         --���O�p���\�b�h�I���錾
    LOGMSG_ERR                           VARCHAR2(12)   := 'Err';                         --���O�p���\�b�h�G���[�錾
    LOGMSG_CUROPENERR                    VARCHAR2(40)   := 'CurOpenErr';                  --���O�p�J�[�\��OPEN�G���[�錾
    
    STATUS_NORMAL                        NUMBER         := 1;                             -- ����I��
    STATUS_ERROR                         NUMBER         := 3;                             -- �ُ�I��
    
    
    /*/�Ɩ����O�p MESSAGE ID */
    COM_NOTFOUND_EXCH_RATE               VARCHAR2(28)   := 'KM00034';                     --�בփ��[�g�̎擾�Ɏ��s���܂����B
    COM_ROUND_ERR                        VARCHAR2(28)   := 'KM00035';                     --�[�������Ɏ��s���܂����B
 
    /*/�Ɩ����O�p MESSAGE */
    SYSLOG_COM_NOTFOUND_EXCH_RATE        VARCHAR2(200)  := '(SBM1293)�בփ��[�g�̎擾�Ɏ��s���܂����B';   --�בփ��[�g�̎擾�Ɏ��s���܂����B
    SYSLOG_COM_ROUND_ERR                 VARCHAR2(200)  := '(SBM1294)�[�������Ɏ��s���܂����B';   --�[�������Ɏ��s���܂����B

    
    -- ��O�̐錾
    excExchRateNoFoundErr                EXCEPTION;                                         --�בփ��[�g���擾�ł��Ȃ�
    excroundErr                          EXCEPTION;                                         --�[�������Ɏ��s
    excCursorErr                         EXCEPTION;                                         --�J�[�\��OPEN����EXCEPTION
    excFncTraceLog                       EXCEPTION;                                          --�g���[�X���O�o�̓G���[
    --
    
BEGIN

    pnumStatus := STATUS_NORMAL;
    pvc2HomeCurAmount := 0;
    /* TraceLog �̏o�� */
    blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode,
                           pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                           MY_SQL_NAME, LOGMSG_START);
                          
    IF blnRet=FALSE THEN
        RAISE excFncTraceLog;
    END IF
    ;
    
    OPEN curSYS_HOME_CUR;
    FETCH curSYS_HOME_CUR INTO recSYS_HOME_CUR;
        IF recSYS_HOME_CUR.HOME_CUR_CD = pvc2CurCd THEN
            pvc2HomeCurAmount := pvc2CurAmount;
       ELSE
           /* �בփ��[�g���擾����*/
           BEGIN
               OPEN curM_EXCH_RATE(pvc2CompanyCd,pvc2CurCd,pvc2ExchTyp,pvc2ExchRateDate);
                  FETCH curM_EXCH_RATE INTO recM_EXCH_RATE;
           EXCEPTION
               WHEN OTHERS THEN
               RAISE excCursorErr;
           END;
           IF curM_EXCH_RATE%NOTFOUND THEN
                RAISE excExchRateNoFoundErr;
           ELSE
               OPEN curM_CUR(recSYS_HOME_CUR.HOME_CUR_CD);
               FETCH curM_CUR INTO recM_CUR;
               pvc2HomeCurAmount := pvc2CurAmount * recM_EXCH_RATE.EXCH_RATE;
               blnRet := FNCGETROUND4FD(
                                             pFileHandle                 --�t�@�C���n���h�� 
                                            ,pvc2LogMode                 --�k�n�f���[�h
                                            ,pvc2OutputMode              --�o�̓��[�h
                                            ,pvc2UserId                  --���[�U�h�c
                                            ,pvc2BusinessName            --�Ɩ���
                                            ,pvc2PlantCd                 --�H��R�[�h
                                            ,pvc2HomeCurAmount           --�[�������O�̒l
                                            ,recM_CUR.DECIMAL_FIG        --��������
                                            ,pvc2RoundTyp                --�[�������敪
                                            ,pvc2HomeCurAmount           --�[��������̒l
                                            ,roundErrCd                  --�G���[�R�[�h
                                            ,roundStatus                 --���ʃX�e�[�^�X�i1�F����I�� 3�F�ُ�I���j
                                           );
               IF blnRet=FALSE OR roundStatus = 3 THEN
                   RAISE excroundErr;
               END IF;
               CLOSE curM_CUR;
           END IF;
           CLOSE curM_EXCH_RATE;
       END IF;
    CLOSE curSYS_HOME_CUR;
    
    
    
    /* TraceLog �̏o�� */
    blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);
    IF blnRet=FALSE THEN
        RAISE excFncTraceLog;
    END IF
    ;
    
    
    RETURN TRUE;    -- ����I��
    
--< ��O���� >---------------------------------------------------------------
EXCEPTION
       
    WHEN excExchRateNoFoundErr THEN
        IF curM_EXCH_RATE%ISOPEN = TRUE THEN
            CLOSE curM_EXCH_RATE;
        END IF;
        IF curSYS_HOME_CUR%ISOPEN = TRUE THEN
            CLOSE curSYS_HOME_CUR;
        END IF;
        /* ErrorLog �̏o�� */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, COM_NOTFOUND_EXCH_RATE, SYSLOG_COM_NOTFOUND_EXCH_RATE);
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        pnumStatus := STATUS_ERROR;
        pvc2HomeCurAmount := 0;
        RETURN FALSE;
    WHEN excroundErr THEN
        IF curM_CUR%ISOPEN = TRUE THEN
            CLOSE curM_CUR;
        END IF;
        IF curM_EXCH_RATE%ISOPEN = TRUE THEN
            CLOSE curM_EXCH_RATE;
        END IF;
        IF curSYS_HOME_CUR%ISOPEN = TRUE THEN
            CLOSE curSYS_HOME_CUR;
        END IF;
        /* ErrorLog �̏o�� */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, COM_ROUND_ERR, SYSLOG_COM_ROUND_ERR);
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        pnumStatus := STATUS_ERROR;
        pvc2HomeCurAmount := 0;
        RETURN FALSE;        

    WHEN excFncTraceLog THEN           
        pnumStatus := STATUS_ERROR;
        RETURN FALSE;
    WHEN excCursorErr THEN
        /* �J�[�\���b�k�n�r�d*/
        IF curM_EXCH_RATE%ISOPEN = TRUE THEN
            CLOSE curM_EXCH_RATE;
        END IF;
        IF curSYS_HOME_CUR%ISOPEN = TRUE THEN
            CLOSE curSYS_HOME_CUR;
        END IF;
                
        pnumStatus := STATUS_ERROR;
        pvc2HomeCurAmount := 0;
        
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_CUROPENERR);
        RETURN FALSE;
    WHEN UTL_FILE.INVALID_PATH THEN           
        pnumStatus := STATUS_ERROR;
        pvc2HomeCurAmount := 0;
        RETURN FALSE;
    WHEN UTL_FILE.INVALID_MODE THEN           
        pnumStatus := STATUS_ERROR;
        pvc2HomeCurAmount := 0;
        RETURN FALSE;
    WHEN UTL_FILE.INVALID_OPERATION THEN      
        pnumStatus := STATUS_ERROR;
        pvc2HomeCurAmount := 0;
        RETURN FALSE;
    WHEN UTL_FILE.INTERNAL_ERROR THEN         
        pnumStatus := STATUS_ERROR;
        pvc2HomeCurAmount := 0;
        RETURN FALSE;
    WHEN UTL_FILE.INVALID_FILEHANDLE THEN     
        pnumStatus := STATUS_ERROR;
        pvc2HomeCurAmount := 0;
        RETURN FALSE;
    WHEN OTHERS THEN
        /* �J�[�\���b�k�n�r�d*/
        IF curM_CUR%ISOPEN = TRUE THEN
            CLOSE curM_CUR;
        END IF;
        IF curM_EXCH_RATE%ISOPEN = TRUE THEN
            CLOSE curM_EXCH_RATE;
        END IF;
        IF curSYS_HOME_CUR%ISOPEN = TRUE THEN
            CLOSE curSYS_HOME_CUR;
        END IF;
        pnumStatus := STATUS_ERROR;
        pvc2HomeCurAmount := 0;
        /* ErrorLog �̏o�� */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, SQLCODE, SQLERRM);
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_ERR);
        RETURN FALSE;
END;
/