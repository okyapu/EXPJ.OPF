CREATE OR REPLACE TRIGGER TRG_T_ACPT_RSLT19
AFTER INSERT
ON T_ACPT_RSLT
REFERENCING OLD AS OLD NEW AS NEW
FOR EACH ROW 

DECLARE

   -- �G���[�o�͗p
   blnRet           BOOLEAN;
   UTL_FileHandle   UTL_FILE.FILE_TYPE;
   vc2LogMode       VARCHAR2(10);        -- �k�n�f���[�h
   vc2OutputMode    VARCHAR2(10);        -- �o�̓��[�h
   vc2UserId        VARCHAR2(100);       -- ���[�U�h�c
   vc2BusinessName  VARCHAR2(100);       -- �X�V�v���W�F�N�g��
   vc2PlantCd       VARCHAR2(100);       -- �H��R�[�h
   vc2OutputPath    VARCHAR2(100);       -- �o�̓t�@�C���p�X
   vc2NumErrNo      VARCHAR2(100);       -- �G���[�ԍ�
   vc2ErrMessage    VARCHAR2(1000);      -- �G���[���b�Z�[�W
   vc2PlSqlName     VARCHAR2(100) := '������ѓ���';     -- �o�kS�p�k��
   vc2OutputName    VARCHAR2(100) := 'TrgTAcptRslt19.log';        -- �o�̓t�@�C����

   CURSOR curSelectTRlsdPuchOdr IS
  SELECT
     COUNT(*) count
     FROM
     T_RLSD_PUCH_ODR 
     WHERE
     PUCH_ODR_CD =:NEW.PUCH_ODR_CD;
   
   recSelectTRlsdPuchOdr curSelectTRlsdPuchOdr%ROWTYPE;

BEGIN

   -- �����c���烌�R�[�h���擾��
   OPEN curSelectTRlsdPuchOdr;
   FETCH curSelectTRlsdPuchOdr INTO recSelectTRlsdPuchOdr;

   IF curSelectTRlsdPuchOdr%FOUND THEN
      -- �擾���������c�̕��[�[���s�ς�FLG���X�V����
      UPDATE T_RLSD_PUCH_ODR 
      SET
         PARTIAL_DELIV_SLIP_ISS_FLG = '0'
      WHERE PUCH_ODR_CD = :NEW.PUCH_ODR_CD
      AND PARTIAL_DELIV_SLIP_ISS_FLG = '1';
       
   END IF;

   IF curSelectTRlsdPuchOdr%ISOPEN THEN
      CLOSE curSelectTRlsdPuchOdr;
   END IF;

EXCEPTION
   WHEN OTHERS  THEN
   
      IF curSelectTRlsdPuchOdr%ISOPEN THEN
         CLOSE curSelectTRlsdPuchOdr;
      END IF;
      
      /* SYS_BAT_PRAM����������擾 */
      blnRet := FncGetSysBatParmForTrigger(vc2OutputPath,vc2LogMode, vc2OutputMode);
      IF blnRet = FALSE THEN
         vc2OutputPath := 'D:\EXPJStudio\log';
         vc2LogMode    := '1';
         vc2OutputMode := '0';
      END IF;
      
      IF (INSERTING) THEN
         vc2UserId     := :NEW.UPDATED_BY;
         vc2PlantCd    := 'Nasi';
         vc2BusinessName := :NEW.UPDATED_PRG_NM||'�f�[�^�}��';
      END IF;
      IF (UPDATING) THEN
         vc2UserId     := :NEW.UPDATED_BY;
         vc2PlantCd    := 'Nasi';
         vc2BusinessName := :NEW.UPDATED_PRG_NM||'�f�[�^�X�V';
      END IF;
      IF (DELETING) THEN
         vc2UserId     := '*'||:OLD.UPDATED_BY;
         vc2PlantCd    := 'Nasi';
         vc2BusinessName := '*'||:OLD.UPDATED_PRG_NM||'�f�[�^�폜';
      END IF;
      vc2NumErrNo   := SQLCODE;
      vc2ErrMessage := SQLERRM;

      /* LogFile �� OPEN */
      blnRet := FncLogOpen(vc2OutputPath, vc2OutputName, vc2PlantCd, vc2OutputMode, UTL_FileHandle);
      /* �G���[���b�Z�[�W�̏o�� */
      blnRet := FNCERRLOG(UTL_FileHandle
                         ,vc2LogMode
                         ,vc2OutputMode
                         ,vc2UserId
                         ,vc2BusinessName
                         ,vc2PlantCd
                         ,vc2PlSqlName
                         ,vc2NumErrNo
                         ,vc2ErrMessage);
      /* LogFile �� CLOSE */
      blnRet := FncLogClose(UTL_FileHandle);
      
END TRG_T_ACPT_RSLT19;
/