CREATE OR REPLACE TRIGGER TRG_T_ODR_UNSTOCK
  AFTER INSERT OR UPDATE OR DELETE ON T_ODR_UNSTOCK
  FOR EACH ROW
DECLARE

  -- エラー出力用
  BLNRET          BOOLEAN;
  UTL_FILEHANDLE  UTL_FILE.FILE_TYPE;
  VC2LOGMODE      VARCHAR2(10); -- ＬＯＧモード
  VC2OUTPUTMODE   VARCHAR2(10); -- 出力モード
  VC2USERID       VARCHAR2(100); -- ユーザＩＤ
  VC2BUSINESSNAME VARCHAR2(100); -- 更新プロジェクト名
  VC2PLANTCD      VARCHAR2(100); -- 工場コード
  VC2OUTPUTPATH   VARCHAR2(100); -- 出力ファイルパス
  VC2NUMERRNO     VARCHAR2(100); -- エラー番号
  VC2ERRMESSAGE   VARCHAR2(1000); -- エラーメッセージ
  VC2PLSQLNAME    VARCHAR2(100) := 'トリガー非在庫受注履歴登録'; -- ＰＬ／ＳＱＬ名
  VC2OUTPUTNAME   VARCHAR2(100) := 'TrgTOdrUnstockError.log';    -- 出力ファイル名
  DTSYSDATE       DATE          := SYSDATE;                      -- 登録/更新日時
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
    /* SYS_BAT_PRAMから引数を取得 */
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
      VC2BUSINESSNAME := :NEW.UPDATED_PRG_NM || 'データ挿入';
    END IF;
    IF (UPDATING) THEN
      VC2USERID       := :NEW.UPDATED_BY;
      VC2PLANTCD      := 'Nasi';
      VC2BUSINESSNAME := :NEW.UPDATED_PRG_NM || 'データ更新';
    END IF;
    VC2NUMERRNO   := SQLCODE;
    VC2ERRMESSAGE := SQLERRM;

    /* LogFile の OPEN */
    BLNRET := FNCLOGOPEN(VC2OUTPUTPATH,
                         VC2OUTPUTNAME,
                         VC2PLANTCD,
                         VC2OUTPUTMODE,
                         UTL_FILEHANDLE);
    /* エラーメッセージの出力 */
    BLNRET := FNCERRLOG(UTL_FILEHANDLE,
                        VC2LOGMODE,
                        VC2OUTPUTMODE,
                        VC2USERID,
                        VC2BUSINESSNAME,
                        VC2PLANTCD,
                        VC2PLSQLNAME,
                        VC2NUMERRNO,
                        VC2ERRMESSAGE);
    /* LogFile の CLOSE */
    BLNRET := FNCLOGCLOSE(UTL_FILEHANDLE);

END TRG_T_ODR_UNSTOCK;
/
