CREATE OR REPLACE FUNCTION FNCOPRTIMECALC(
/*----------------------------------------------------------------------------
'
' SQL_NAME �F FncOprTimeCalc
' Version  �F 1.00.00
'
' �C������
'   2014.04.01 ����
' 
' �@�\      : ��Ǝ��Ԍv�Z����
' 
' �߂�l    : Boolean
'               True :����I��
'               False:�G���[����
'
' ������    : pFileHandle          - (i)�t�@�C���n���h��
'             pvc2LogMode          - (i)�k�n�f���[�h
'             pvc2OutputMode       - (i)�o�̓��[�h
'             pvc2UserId           - (i)���[�U�h�c
'             pvc2BusinessName     - (i)�Ɩ���
'             pvc2PlantCd          - (i)�H��R�[�h
'             pvc2WorkShiftCode    - (i)�Ζ��V�t�g�R�[�h
'             pvc2StartTime        - (i)�J�n����
'             pvc2EndTime          - (i)�I������
'             pnumOprTime          - (o)��Ǝ��ԁi���j
'             pvc2Message          - (o)���b�Z�[�W
'             pnumStatus           - (o)���ʃX�e�[�^�X
'
' �@�\����  : ��Ǝ��Ԃ̌v�Z���s���B
'             �Ζ��V�t�g�P�ʂɋx�e���Ԃ��l������Ǝ��Ԃ��Z�o����B
'
' ���l      : 
'
------------------------------------------------------------------------------*/
    pFileHandle            IN  UTL_FILE.FILE_TYPE  --�t�@�C���n���h��
   ,pvc2LogMode            IN  VARCHAR2            --�k�n�f���[�h
   ,pvc2OutputMode         IN  VARCHAR2            --�o�̓��[�h
   ,pvc2UserId             IN  VARCHAR2            --���[�U�h�c
   ,pvc2BusinessName       IN  VARCHAR2            --�Ɩ���
   ,pvc2PlantCd            IN  VARCHAR2            --�H��R�[�h
   ,pvc2WorkShiftCode      IN  VARCHAR2            --�Ζ��V�t�g�R�[�h
   ,pvc2StartTime          IN  VARCHAR2            --�J�n����
   ,pvc2EndTime            IN  VARCHAR2            --�I������
   ,pnumOprTime            OUT NUMBER              --��Ǝ���
   ,pvc2Message            OUT VARCHAR2            --���b�Z�[�W
   ,pnumStatus             OUT NUMBER              --���ʃX�e�[�^�X�i1�F����I�� 9�F�G���[����j
    ) RETURN BOOLEAN
IS

/* �萔��` */
    LOGMSG_START                 VARCHAR2(20)           := 'Start';                           --���O�p���\�b�h�J�n�錾
    LOGMSG_END                   VARCHAR2(12)           := 'End';                             --���O�p���\�b�h�I���錾
    MY_SQL_NAME                  CONSTANT VARCHAR2(60)  := 'FNCOPRTIMECALC';                 -- �o�k�^�r�p�k��
    
    STATUS_NORMAL                NUMBER                 := 1;                                 -- ����I��
    STATUS_ERROR                 NUMBER                 := 9;                                 -- �G���[����
    LOGID_AD61015               CONSTANT VARCHAR2(28)   := 'AD61015';                         -- �Ζ��V�t�g����͂��ĉ������B
    LOGID_AD61019               CONSTANT VARCHAR2(28)   := 'AD61019';                         -- �J�n�������s���ł��B
    LOGID_AD61020               CONSTANT VARCHAR2(28)   := 'AD61020';                         -- �I�����Ԃ��s���ł��B
    LOGID_AD61021               CONSTANT VARCHAR2(28)   := 'AD61021';                         -- ��Ǝ��Ԃ��}�C�i�X�ɂȂ�܂����B�Ζ��V�t�g���ׂ̋x�e���Ԃ��s���ł��B
    LOGID_AD61003               CONSTANT VARCHAR2(28)   := 'AD61003';                         -- �Ζ��V�t�g���Ζ��V�t�g�w�b�_�ɑ��݂��܂���B
    
    LOGMSG_AD61015               CONSTANT VARCHAR2(176) := '�Ζ��V�t�g����͂��ĉ������B';
    LOGMSG_AD61019               CONSTANT VARCHAR2(80)  := '�J�n�������s���ł��B';
    LOGMSG_AD61020               CONSTANT VARCHAR2(80)  := '�I�����Ԃ��s���ł��B';
    LOGMSG_AD61021               CONSTANT VARCHAR2(264) := '��Ǝ��Ԃ��}�C�i�X�ɂȂ�܂����B�Ζ��V�t�g���ׂ̋x�e���Ԃ��s���ł��B';
    LOGMSG_AD61003               CONSTANT VARCHAR2(176) := '�Ζ��V�t�g���Ζ��V�t�g�w�b�_�ɑ��݂��܂���B';

/* �ϐ��錾 */
    blnRet                       BOOLEAN;                                                     -- BOOLEAN�^ �ԋp�l
    numRestTimeTotal             NUMBER                 := 0;                                 -- �x�e���ԏW�v�l
    vc2Message                   VARCHAR2(1000);

    numCalStaTime                NUMBER;                                                      -- �v�Z�p�J�n����
    numCalEndTime                NUMBER;                                                      -- �v�Z�p�I������
    numMstStaTime                NUMBER;                                                      -- �}�X�^�J�n����
    numMstEndTime                NUMBER;                                                      -- �}�X�^�I������
    numMstStaTime2               NUMBER;                                                      -- �}�X�^�J�n���ԁi�����p�j
    numMstEndTime2               NUMBER;                                                      -- �}�X�^�I�����ԁi�����p�j
    numHH                        NUMBER;
    numMM                        NUMBER;

/* ��O�̐錾 */
    excParamErr                  EXCEPTION;                                                   -- �u�����v�G���[
    excFncTraceLog               EXCEPTION;                                                   -- �g���[�X���O�o�̓G���[
    excResultErr                 EXCEPTION;                                                   -- ���ʃG���[
    excNotFound                  EXCEPTION;                                                   -- NOT FOUND

/* �J�[�\���̐錾 */
    CURSOR curM_WORK_SHIFT
    IS
    SELECT UWS.REST_TIME
         , UWS.START_TIME
         , UWS.END_TIME
      FROM M_WORK_SHIFT UWS
         , M_WORK_SHIFT_H UWSH
     WHERE UWS.WORK_SHIFT_CODE = UWSH.WORK_SHIFT_CODE
       AND UWSH.WORK_SHIFT_CODE = pvc2WorkShiftCode;

    CURSOR curM_WORK_SHIFT_H
    IS
    SELECT START_TIME
          ,END_TIME
      FROM M_WORK_SHIFT_H
     WHERE WORK_SHIFT_CODE = pvc2WorkShiftCode;
    recM_WORK_SHIFT_H   curM_WORK_SHIFT_H%ROWTYPE;



/*-----------------------------------------------------------------------------
' �T�u�t�@���N�V�����iSubFncTimeCal�j
'
' �@�\      : ���Ԍv�Z
' 
' �߂�l    : NUMBER               - ���P�ʂ̌v�Z����
'
' ������    : pnumStaTime          - �J�n����
'             pnumEndTime          - �I������
'
' �@�\����  : �J�n���ԁ`�I�����Ԃ̎��Ԍv�Z���s���B�iHHMM�`���j
'
-----------------------------------------------------------------------------*/
    FUNCTION SubFncTimeCal(pnumStaTime IN NUMBER
                          ,pnumEndTime IN NUMBER
                          )
    RETURN NUMBER
    IS
      numHH                    NUMBER;
      numMM                    NUMBER;
      numStaMin                NUMBER;
      numEndMin                NUMBER;
      numDiffMin               NUMBER;
    BEGIN

      --���P�ʊ��Z
      numHH := TRUNC(pnumStaTime / 100);      -- ���Ԕ����o��
      numMM := pnumStaTime - (numHH * 100);   --   �������o��
      numStaMin := (numHH * 60) + numMM;

      numHH := TRUNC(pnumEndTime / 100);      -- ���Ԕ����o��
      numMM := pnumEndTime - (numHH * 100);   --   �������o��
      numEndMin := (numHH * 60) + numMM;

      -- ���P�ʂł̍������߂�
      numDiffMin := numEndMin - numStaMin;

      RETURN numDiffMin;
    END;
BEGIN

    /* ���ʃX�e�[�^�X�̏����� */
    pnumStatus := STATUS_NORMAL;

    /* TraceLog �̏o�� */
    blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

   /* �Ζ��V�t�g�R�[�h */
   IF pvc2WorkShiftCode IS NULL THEN
      pvc2Message := LOGID_AD61015;
      vc2Message := LOGMSG_AD61015;
      RAISE excParamErr;
   END IF;
   
   -- ADD
   OPEN curM_WORK_SHIFT_H;
   FETCH curM_WORK_SHIFT_H INTO recM_WORK_SHIFT_H;
   IF curM_WORK_SHIFT_H%NOTFOUND THEN
      CLOSE curM_WORK_SHIFT_H;
      pvc2Message := LOGID_AD61003;
      vc2Message := LOGMSG_AD61003;
      RAISE excParamErr;
   END IF;
   CLOSE curM_WORK_SHIFT_H;
   -- ADD
   
   /* �J�n���� */
   IF pvc2StartTime IS NULL THEN
      pvc2Message := LOGID_AD61019;
      vc2Message := LOGMSG_AD61019;
      RAISE excParamErr;
   ELSE
      IF LENGTH(pvc2StartTime) = 3 OR LENGTH(pvc2StartTime) = 4  THEN
         IF TO_NUMBER(SUBSTR(LPAD(pvc2StartTime, 4, 0), 1, 2)) > 23 OR TO_NUMBER(SUBSTR(LPAD(pvc2StartTime, 4, 0), 3, 2)) > 59 THEN
            pvc2Message := LOGID_AD61019;
            vc2Message := LOGMSG_AD61019;
            RAISE excParamErr;
         END IF;
      ELSE
         pvc2Message := LOGID_AD61019;
         vc2Message := LOGMSG_AD61019;
         RAISE excParamErr;
      END IF;
   END IF;

   /* �I������ */
   IF pvc2EndTime IS NULL THEN
      pvc2Message := LOGID_AD61020;
      vc2Message := LOGMSG_AD61020;
      RAISE excParamErr;
   ELSE
      IF LENGTH(pvc2EndTime) = 3 OR LENGTH(pvc2EndTime) = 4  THEN
         IF TO_NUMBER(SUBSTR(LPAD(pvc2EndTime, 4, 0), 1, 2)) > 23 OR TO_NUMBER(SUBSTR(LPAD(pvc2EndTime, 4, 0), 3, 2)) > 59 THEN
              pvc2Message := LOGID_AD61020;
              vc2Message := LOGMSG_AD61020;
              RAISE excParamErr;
          END IF;
      ELSE
          pvc2Message := LOGID_AD61020;
          vc2Message := LOGMSG_AD61020;
          RAISE excParamErr;
      END IF;
   END IF;

   -- �v�Z�p�ϐ��̏����i�����j
   IF TO_NUMBER(pvc2StartTime) >  TO_NUMBER(pvc2EndTime) THEN
    numCalStaTime  := TO_NUMBER(pvc2StartTime);
    numCalEndTime  := TO_NUMBER(pvc2EndTime) + 2400;
   ELSE 
    numCalStaTime  := TO_NUMBER(pvc2StartTime);
    numCalEndTime  := TO_NUMBER(pvc2EndTime);
   END IF;

   numRestTimeTotal := 0;
   FOR recM_WORK_SHIFT IN curM_WORK_SHIFT LOOP
     -- �v�Z�p�ϐ��̏����i�Ζ��V�t�g���ׁj
     IF TO_NUMBER(recM_WORK_SHIFT.START_TIME) >  TO_NUMBER(recM_WORK_SHIFT.END_TIME) THEN
      numMstStaTime  := TO_NUMBER(recM_WORK_SHIFT.START_TIME);
      numMstEndTime  := TO_NUMBER(recM_WORK_SHIFT.END_TIME) + 2400;
     ELSE 
      numMstStaTime  := TO_NUMBER(recM_WORK_SHIFT.START_TIME);
      numMstEndTime  := TO_NUMBER(recM_WORK_SHIFT.END_TIME);
     END IF;

     -- �x�e���Ԃ̎擾
     --(1)�x�e���ԂɑS�Ă������Ă���ꍇ�̋x�e���Ԍv�Z
     IF numCalStaTime <= numMstStaTime AND numCalEndTime >= numMstEndTime THEN
       numRestTimeTotal := numRestTimeTotal + recM_WORK_SHIFT.REST_TIME;  --�}�X�^�ɓo�^����Ă���v�㎞��

     --(2)�x�e���ԂɈꕔ�������Ă���ꍇ�̋x�e���Ԍv�Z�i�J�n���ԁj
     ELSIF numCalStaTime >= numMstStaTime AND numCalStaTime <= numMstEndTime THEN
       numRestTimeTotal := numRestTimeTotal + SubFncTimeCal(numCalStaTime,numMstEndTime);

     --(3)�x�e���ԂɈꕔ�������Ă���ꍇ�̋x�e���Ԍv�Z�i�I�����ԁj
     ELSIF numCalEndTime >= numMstStaTime AND numCalEndTime <= numMstEndTime THEN
       numRestTimeTotal := numRestTimeTotal + SubFncTimeCal(numMstStaTime,numCalEndTime);

     --(4)�x�e���ԂɊJ�n�E�I�����܂܂�Ă���ꍇ�̋x�e���Ԍv�Z
     ELSIF numCalStaTime > numMstStaTime AND numCalEndTime < numMstEndTime THEN
       numRestTimeTotal := numRestTimeTotal + SubFncTimeCal(numCalStaTime,numCalEndTime);
     END IF;
     
      numMstStaTime2  := numMstStaTime + 2400;
      numMstEndTime2  := numMstEndTime + 2400;
     
     -- �x�e���Ԃ̎擾�i�����p�j
     --(1)�x�e���ԂɑS�Ă������Ă���ꍇ�̋x�e���Ԍv�Z
     IF numCalStaTime <= numMstStaTime2 AND numCalEndTime >= numMstEndTime2 THEN
       numRestTimeTotal := numRestTimeTotal + recM_WORK_SHIFT.REST_TIME;  --�}�X�^�ɓo�^����Ă���v�㎞��

     --(2)�x�e���ԂɈꕔ�������Ă���ꍇ�̋x�e���Ԍv�Z�i�J�n���ԁj
     ELSIF numCalStaTime >= numMstStaTime2 AND numCalStaTime <= numMstEndTime2 THEN
       numRestTimeTotal := numRestTimeTotal + SubFncTimeCal(numCalStaTime,numMstEndTime2);

     --(3)�x�e���ԂɈꕔ�������Ă���ꍇ�̋x�e���Ԍv�Z�i�I�����ԁj
     ELSIF numCalEndTime >= numMstStaTime2 AND numCalEndTime <= numMstEndTime2 THEN
       numRestTimeTotal := numRestTimeTotal + SubFncTimeCal(numMstStaTime2,numCalEndTime);

     --(4)�x�e���ԂɊJ�n�E�I�����܂܂�Ă���ꍇ�̋x�e���Ԍv�Z
     ELSIF numCalStaTime > numMstStaTime2 AND numCalEndTime < numMstEndTime2 THEN
       numRestTimeTotal := numRestTimeTotal + SubFncTimeCal(numCalStaTime,numCalEndTime);
     END IF;

   END LOOP;

   -- ��Ǝ���
   pnumOprTime := SubFncTimeCal(numCalStaTime,numCalEndTime) - numRestTimeTotal;
   

   IF pnumOprTime < 0 THEN
      pvc2Message := LOGID_AD61021;
      vc2Message := LOGMSG_AD61021;
      RAISE excResultErr;
   END IF;
   
    /* TraceLog �̏o�� */
    blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);
    RETURN TRUE;

--< ��O���� >---------------------------------------------------------------
EXCEPTION
    WHEN excFncTraceLog   THEN
        pnumStatus := STATUS_ERROR;
        RETURN FALSE;
    WHEN excNotFound THEN
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, vc2Message);
        pnumStatus := STATUS_ERROR;
        RETURN FALSE;
    WHEN excParamErr THEN
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, vc2Message);
        pnumStatus := STATUS_ERROR;
        RETURN FALSE;
    WHEN excResultErr THEN
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, vc2Message);
        pnumStatus := STATUS_ERROR;
        RETURN FALSE;
    WHEN OTHERS THEN
        /* ErrorLog �̏o�� */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, SQLCODE, SQLERRM);
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        pnumStatus := STATUS_ERROR;
        RETURN FALSE;
END;
/
