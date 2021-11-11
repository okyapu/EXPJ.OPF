CREATE OR REPLACE TRIGGER TRG_T_ODR_UNSTOCK
  AFTER INSERT OR UPDATE OR DELETE ON T_ODR_UNSTOCK
  FOR EACH ROW
DECLARE

  -- �G���[�o�͗p
  BLNRET          BOOLEAN;
  UTL_FILEHANDLE  UTL_FILE.FILE_TYPE;
  VC2LOGMODE      VARCHAR2(10); -- �k�n�f���[�h
  VC2OUTPUTMODE   VARCHAR2(10); -- �o�̓��[�h
  VC2USERID       VARCHAR2(100); -- ���[�U�h�c
  VC2BUSINESSNAME VARCHAR2(100); -- �X�V�v���W�F�N�g��
  VC2PLANTCD      VARCHAR2(100); -- �H��R�[�h
  VC2OUTPUTPATH   VARCHAR2(100); -- �o�̓t�@�C���p�X
  VC2NUMERRNO     VARCHAR2(100); -- �G���[�ԍ�
  VC2ERRMESSAGE   VARCHAR2(1000); -- �G���[���b�Z�[�W
  VC2PLSQLNAME    VARCHAR2(100) := '�g���K�[��݌Ɏ󒍗���o�^'; -- �o�k�^�r�p�k��
  VC2OUTPUTNAME   VARCHAR2(100) := 'TrgTOdrUnstockError.log';    -- �o�̓t�@�C����
  DTSYSDATE       DATE          := SYSDATE;                      -- �o�^/�X�V����
BEGIN
  IF (INSERTING) THEN
    INSERT INTO HS_T_ODR_UNSTOCK
    VALUES
      (SEQ_T_ODR_UNSTOCK.NEXTVAL,
       :NEW.ODR_NO,
       1,
       1,
       :NEW.COMPANY_CD,
       :NEW.SLIP_CD,
       :NEW.CUST_ODR_NO,
       :NEW.CUST_CD,
       :NEW.ITEM_CD,
       :NEW.ITEM_NAME,
       :NEW.CUST_CHRG_PSN_CD,
       :NEW.ODR_ACPT_PSN_CD,
       :NEW.CURRNCY_CD,
       :NEW.EXCH_TYP,
       :NEW.DESINATED_DLV_DATE,
       :NEW.ODR_UNIT_PRICE,
       :NEW.ODR_QTY,
       :NEW.ODR_AMOUNT,
       :NEW.ODR_AMOUNT_EXCH_RATES,
       :NEW.TAX_APPLY_TYP,
       :NEW.TAX_CD,
       :NEW.TAX_CALC_TYP,
       :NEW.REMARKS,
       :NEW.ODR_ACPT_DATE,
       :NEW.ORGN_ODR_NO,
       :NEW.ADD_ODR_FLG,
       :NEW.ODR_CMPLT_FLG,
       :NEW.ODR_CMPLT_DATE,
       :NEW.DEL_FLG,
       DTSYSDATE,
       :NEW.CREATED_BY,
       :NEW.CREATED_PRG_NM,
       DTSYSDATE,
       :NEW.CREATED_BY,
       :NEW.CREATED_PRG_NM,
       0,
       :NEW.CUST_CHRG_ORG_CD,
       :NEW.ODR_ACPT_ORG_CD);
  END IF;
  IF (UPDATING) THEN
    IF :NEW.DEL_FLG <> 1 THEN
      INSERT INTO HS_T_ODR_UNSTOCK
      VALUES
        (SEQ_T_ODR_UNSTOCK.NEXTVAL,
         :OLD.ODR_NO,
         0,
         2,
         :OLD.COMPANY_CD,
         :OLD.SLIP_CD,
         :OLD.CUST_ODR_NO,
         :OLD.CUST_CD,
         :OLD.ITEM_CD,
         :OLD.ITEM_NAME,
         :OLD.CUST_CHRG_PSN_CD,
         :OLD.ODR_ACPT_PSN_CD,
         :OLD.CURRNCY_CD,
         :OLD.EXCH_TYP,
         :OLD.DESINATED_DLV_DATE,
         :OLD.ODR_UNIT_PRICE,
         :OLD.ODR_QTY,
         :OLD.ODR_AMOUNT,
         :OLD.ODR_AMOUNT_EXCH_RATES,
         :OLD.TAX_APPLY_TYP,
         :OLD.TAX_CD,
         :OLD.TAX_CALC_TYP,
         :OLD.REMARKS,
         :OLD.ODR_ACPT_DATE,
         :OLD.ORGN_ODR_NO,
         :OLD.ADD_ODR_FLG,
         :OLD.ODR_CMPLT_FLG,
         :OLD.ODR_CMPLT_DATE,
         :OLD.DEL_FLG,
         DTSYSDATE,
         :NEW.UPDATED_BY,
         :NEW.UPDATED_PRG_NM,
         DTSYSDATE,
         :NEW.UPDATED_BY,
         :NEW.UPDATED_PRG_NM,
         0,
         :NEW.CUST_CHRG_ORG_CD,
         :NEW.ODR_ACPT_ORG_CD);

      INSERT INTO HS_T_ODR_UNSTOCK
      VALUES
        (SEQ_T_ODR_UNSTOCK.NEXTVAL,
         :NEW.ODR_NO,
         1,
         2,
         :NEW.COMPANY_CD,
         :NEW.SLIP_CD,
         :NEW.CUST_ODR_NO,
         :NEW.CUST_CD,
         :NEW.ITEM_CD,
         :NEW.ITEM_NAME,
         :NEW.CUST_CHRG_PSN_CD,
         :NEW.ODR_ACPT_PSN_CD,
         :NEW.CURRNCY_CD,
         :NEW.EXCH_TYP,
         :NEW.DESINATED_DLV_DATE,
         :NEW.ODR_UNIT_PRICE,
         :NEW.ODR_QTY,
         :NEW.ODR_AMOUNT,
         :NEW.ODR_AMOUNT_EXCH_RATES,
         :NEW.TAX_APPLY_TYP,
         :NEW.TAX_CD,
         :NEW.TAX_CALC_TYP,
         :NEW.REMARKS,
         :NEW.ODR_ACPT_DATE,
         :NEW.ORGN_ODR_NO,
         :NEW.ADD_ODR_FLG,
         :NEW.ODR_CMPLT_FLG,
         :NEW.ODR_CMPLT_DATE,
         :NEW.DEL_FLG,
         DTSYSDATE,
         :NEW.UPDATED_BY,
         :NEW.UPDATED_PRG_NM,
         DTSYSDATE,
         :NEW.UPDATED_BY,
         :NEW.UPDATED_PRG_NM,
         0,
         :NEW.CUST_CHRG_ORG_CD,
         :NEW.ODR_ACPT_ORG_CD);
    ELSE
      INSERT INTO HS_T_ODR_UNSTOCK
      VALUES
        (SEQ_T_ODR_UNSTOCK.NEXTVAL,
         :OLD.ODR_NO,
         0,
         3,
         :OLD.COMPANY_CD,
         :OLD.SLIP_CD,
         :OLD.CUST_ODR_NO,
         :OLD.CUST_CD,
         :OLD.ITEM_CD,
         :OLD.ITEM_NAME,
         :OLD.CUST_CHRG_PSN_CD,
         :OLD.ODR_ACPT_PSN_CD,
         :OLD.CURRNCY_CD,
         :OLD.EXCH_TYP,
         :OLD.DESINATED_DLV_DATE,
         :OLD.ODR_UNIT_PRICE,
         :OLD.ODR_QTY,
         :OLD.ODR_AMOUNT,
         :OLD.ODR_AMOUNT_EXCH_RATES,
         :OLD.TAX_APPLY_TYP,
         :OLD.TAX_CD,
         :OLD.TAX_CALC_TYP,
         :OLD.REMARKS,
         :OLD.ODR_ACPT_DATE,
         :OLD.ORGN_ODR_NO,
         :OLD.ADD_ODR_FLG,
         :OLD.ODR_CMPLT_FLG,
         :OLD.ODR_CMPLT_DATE,
         :OLD.DEL_FLG,
         DTSYSDATE,
         :NEW.UPDATED_BY,
         :NEW.UPDATED_PRG_NM,
         DTSYSDATE,
         :NEW.UPDATED_BY,
         :NEW.UPDATED_PRG_NM,
         0,
         :NEW.CUST_CHRG_ORG_CD,
         :NEW.ODR_ACPT_ORG_CD);

      INSERT INTO HS_T_ODR_UNSTOCK
      VALUES
        (SEQ_T_ODR_UNSTOCK.NEXTVAL,
         :NEW.ODR_NO,
         1,
         3,
         :NEW.COMPANY_CD,
         :NEW.SLIP_CD,
         :NEW.CUST_ODR_NO,
         :NEW.CUST_CD,
         :NEW.ITEM_CD,
         :NEW.ITEM_NAME,
         :NEW.CUST_CHRG_PSN_CD,
         :NEW.ODR_ACPT_PSN_CD,
         :NEW.CURRNCY_CD,
         :NEW.EXCH_TYP,
         :NEW.DESINATED_DLV_DATE,
         :NEW.ODR_UNIT_PRICE,
         :NEW.ODR_QTY,
         :NEW.ODR_AMOUNT,
         :NEW.ODR_AMOUNT_EXCH_RATES,
         :NEW.TAX_APPLY_TYP,
         :NEW.TAX_CD,
         :NEW.TAX_CALC_TYP,
         :NEW.REMARKS,
         :NEW.ODR_ACPT_DATE,
         :NEW.ORGN_ODR_NO,
         :NEW.ADD_ODR_FLG,
         :NEW.ODR_CMPLT_FLG,
         :NEW.ODR_CMPLT_DATE,
         :NEW.DEL_FLG,
         DTSYSDATE,
         :NEW.UPDATED_BY,
         :NEW.UPDATED_PRG_NM,
         DTSYSDATE,
         :NEW.UPDATED_BY,
         :NEW.UPDATED_PRG_NM,
         0,
         :NEW.CUST_CHRG_ORG_CD,
         :NEW.ODR_ACPT_ORG_CD);
    END IF;
  END IF;
EXCEPTION
  WHEN OTHERS THEN
    /* SYS_BAT_PRAM����������擾 */
    BLNRET := FNCGETSYSBATPARMFORTRIGGER(VC2OUTPUTPATH,
                                         VC2LOGMODE,
                                         VC2OUTPUTMODE);
    IF BLNRET = FALSE THEN
      VC2OUTPUTPATH := 'D:\EXPJStudio\log';
      VC2LOGMODE    := '1';
      VC2OUTPUTMODE := '0';
    END IF;
    IF (INSERTING) THEN
      VC2USERID       := :NEW.UPDATED_BY;
      VC2PLANTCD      := 'Nasi';
      VC2BUSINESSNAME := :NEW.UPDATED_PRG_NM || '�f�[�^�}��';
    END IF;
    IF (UPDATING) THEN
      VC2USERID       := :NEW.UPDATED_BY;
      VC2PLANTCD      := 'Nasi';
      VC2BUSINESSNAME := :NEW.UPDATED_PRG_NM || '�f�[�^�X�V';
    END IF;
    VC2NUMERRNO   := SQLCODE;
    VC2ERRMESSAGE := SQLERRM;

    /* LogFile �� OPEN */
    BLNRET := FNCLOGOPEN(VC2OUTPUTPATH,
                         VC2OUTPUTNAME,
                         VC2PLANTCD,
                         VC2OUTPUTMODE,
                         UTL_FILEHANDLE);
    /* �G���[���b�Z�[�W�̏o�� */
    BLNRET := FNCERRLOG(UTL_FILEHANDLE,
                        VC2LOGMODE,
                        VC2OUTPUTMODE,
                        VC2USERID,
                        VC2BUSINESSNAME,
                        VC2PLANTCD,
                        VC2PLSQLNAME,
                        VC2NUMERRNO,
                        VC2ERRMESSAGE);
    /* LogFile �� CLOSE */
    BLNRET := FNCLOGCLOSE(UTL_FILEHANDLE);

END TRG_T_ODR_UNSTOCK;
/
