CREATE OR REPLACE TRIGGER TRG_M_VEND_CTRL
   AFTER INSERT OR UPDATE OR DELETE ON M_VEND_CTRL
   FOR EACH ROW
   DECLARE
      gnr_typ_insert_      NUMBER :=1;
      gnr_typ_update_      NUMBER :=2;
      gnr_typ_delete_      NUMBER :=3;
      mod_count_delete_    NUMBER :=9;
      delete_time_         DATE;

      -- エラー出力用
      blnRet           BOOLEAN;
      UTL_FileHandle   UTL_FILE.FILE_TYPE;
      vc2LogMode       VARCHAR2(10);        -- ＬＯＧモード
      vc2OutputMode    VARCHAR2(10);        -- 出力モード
      vc2UserId        VARCHAR2(100);       -- ユーザＩＤ
      vc2BusinessName  VARCHAR2(100);       -- 更新プロジェクト名
      vc2PlantCd       VARCHAR2(100);       -- 工場コード
      vc2OutputPath    VARCHAR2(100);       -- 出力ファイルパス
      vc2NumErrNo      VARCHAR2(100);       -- エラー番号
      vc2ErrMessage    VARCHAR2(1000);      -- エラーメッセージ
      vc2PlSqlName     VARCHAR2(100) := 'トリガー取引先履歴登録';   -- ＰＬ／ＳＱＬ名
      vc2OutputName    VARCHAR2(100) := 'TrgMVendCtrlError.log';    -- 出力ファイル名

   BEGIN
      IF (INSERTING) THEN
         INSERT INTO HS_M_VEND_CTRL VALUES (gnr_typ_insert_
                                            ,:NEW.COMPANY_CD
                                            ,:NEW.VEND_CD
                                            ,:NEW.VEND_NAME
                                            ,:NEW.VEND_ANAME
                                            ,:NEW.VEND_KNAME
                                            ,:NEW.ZIP_CD
                                            ,:NEW.ADDRESS_1
                                            ,:NEW.ADDRESS_2
                                            ,:NEW.ADDRESS_K_1
                                            ,:NEW.ADDRESS_K_2
                                            ,:NEW.TEL
                                            ,:NEW.FAX
                                            ,:NEW.EMAIL
                                            ,:NEW.VEND_ORG
                                            ,:NEW.VEND_PERSON
                                            ,:NEW.OWN_ORG_CD
                                            ,:NEW.OWN_ORG_NAME
                                            ,:NEW.OWN_PERSON_CD
                                            ,:NEW.OWN_PERSON_NAME
                                            ,:NEW.CUR_CD
                                            ,:NEW.EXCH_TYP
                                            ,:NEW.ROUND_TYP
                                            ,:NEW.INSPC_ACPT_APP_TYP
                                            ,:NEW.VEND_REM
                                            ,:NEW.PAYEE_CD
                                            ,:NEW.PAYEE_FIX_FLG
                                            ,:NEW.DEADLINE
                                            ,:NEW.SCH_MONTH
                                            ,:NEW.SCH_DAY
                                            ,:NEW.OLD_TAX_CD
                                            ,:NEW.NEW_TAX_CD
                                            ,:NEW.TAX_CHANGE_DATE
                                            ,:NEW.BALANCE_CTRL_FLG
                                            ,:NEW.DEAL_STS_FLG
                                            ,:NEW.DEAL_START_DATE
                                            ,:NEW.DEAL_END_DATE
                                            ,:NEW.VEND_FLG_1
                                            ,:NEW.VEND_FLG_2
                                            ,:NEW.VEND_FLG_3
                                            ,:NEW.ODR_FORM_FLG
                                            ,:NEW.ODR_FAX_FLG
                                            ,:NEW.ODR_EDI_FLG
                                            ,:NEW.ODR_MAIL_FLG
                                            ,:NEW.LIMIT_AMOUNT
                                            ,:NEW.PAY_NOTICE_FLG
                                            ,:NEW.SPOT_VEND_FLG
                                            ,:NEW.BILL_FLG
                                            ,:NEW.REBATE_FLG
                                            ,:NEW.REBATE_START_DATE
                                            ,:NEW.REBATE_END_DATE
                                            ,:NEW.REBATE_COND_TYP
                                            ,:NEW.REBATE_COND_AMOUNT
                                            ,:NEW.REBATE_COND_QTY
                                            ,:NEW.REBATE_TARGET_TYP
                                            ,:NEW.REBATE_RATE
                                            ,:NEW.REBATE_AMOUNT
                                            ,:NEW.TAX_APPLY_TYP
                                            ,:NEW.TAX_CD
                                            ,:NEW.TAX_CALC_TYP
                                            ,:NEW.IMPORT_TRN_TYP
                                            ,:NEW.VEND_CLASS_01_TYP
                                            ,:NEW.VEND_CLASS_01_CD
                                            ,:NEW.VEND_CLASS_01_NM
                                            ,:NEW.VEND_CLASS_02_TYP
                                            ,:NEW.VEND_CLASS_02_CD
                                            ,:NEW.VEND_CLASS_02_NM
                                            ,:NEW.VEND_CLASS_03_TYP
                                            ,:NEW.VEND_CLASS_03_CD
                                            ,:NEW.VEND_CLASS_03_NM
                                            ,:NEW.VEND_CLASS_04_TYP
                                            ,:NEW.VEND_CLASS_04_CD
                                            ,:NEW.VEND_CLASS_04_NM
                                            ,:NEW.VEND_CLASS_05_TYP
                                            ,:NEW.VEND_CLASS_05_CD
                                            ,:NEW.VEND_CLASS_05_NM
                                            ,:NEW.VEND_CLASS_06_TYP
                                            ,:NEW.VEND_CLASS_06_CD
                                            ,:NEW.VEND_CLASS_06_NM
                                            ,:NEW.VEND_CLASS_07_TYP
                                            ,:NEW.VEND_CLASS_07_CD
                                            ,:NEW.VEND_CLASS_07_NM
                                            ,:NEW.VEND_CLASS_08_TYP
                                            ,:NEW.VEND_CLASS_08_CD
                                            ,:NEW.VEND_CLASS_08_NM
                                            ,:NEW.VEND_CLASS_09_TYP
                                            ,:NEW.VEND_CLASS_09_CD
                                            ,:NEW.VEND_CLASS_09_NM
                                            ,:NEW.VEND_CLASS_10_TYP
                                            ,:NEW.VEND_CLASS_10_CD
                                            ,:NEW.VEND_CLASS_10_NM
                                            ,:NEW.CREATED_DATE
                                            ,:NEW.CREATED_BY
                                            ,:NEW.CREATED_PRG_NM
                                            ,:NEW.UPDATED_DATE
                                            ,:NEW.UPDATED_BY
                                            ,:NEW.UPDATED_PRG_NM
                                            ,:NEW.MODIFY_COUNT);
      END IF;
      IF (UPDATING) THEN
         INSERT INTO HS_M_VEND_CTRL VALUES (gnr_typ_update_
                                            ,:NEW.COMPANY_CD
                                            ,:NEW.VEND_CD
                                            ,:NEW.VEND_NAME
                                            ,:NEW.VEND_ANAME
                                            ,:NEW.VEND_KNAME
                                            ,:NEW.ZIP_CD
                                            ,:NEW.ADDRESS_1
                                            ,:NEW.ADDRESS_2
                                            ,:NEW.ADDRESS_K_1
                                            ,:NEW.ADDRESS_K_2
                                            ,:NEW.TEL
                                            ,:NEW.FAX
                                            ,:NEW.EMAIL
                                            ,:NEW.VEND_ORG
                                            ,:NEW.VEND_PERSON
                                            ,:NEW.OWN_ORG_CD
                                            ,:NEW.OWN_ORG_NAME
                                            ,:NEW.OWN_PERSON_CD
                                            ,:NEW.OWN_PERSON_NAME
                                            ,:NEW.CUR_CD
                                            ,:NEW.EXCH_TYP
                                            ,:NEW.ROUND_TYP
                                            ,:NEW.INSPC_ACPT_APP_TYP
                                            ,:NEW.VEND_REM
                                            ,:NEW.PAYEE_CD
                                            ,:NEW.PAYEE_FIX_FLG
                                            ,:NEW.DEADLINE
                                            ,:NEW.SCH_MONTH
                                            ,:NEW.SCH_DAY
                                            ,:NEW.OLD_TAX_CD
                                            ,:NEW.NEW_TAX_CD
                                            ,:NEW.TAX_CHANGE_DATE
                                            ,:NEW.BALANCE_CTRL_FLG
                                            ,:NEW.DEAL_STS_FLG
                                            ,:NEW.DEAL_START_DATE
                                            ,:NEW.DEAL_END_DATE
                                            ,:NEW.VEND_FLG_1
                                            ,:NEW.VEND_FLG_2
                                            ,:NEW.VEND_FLG_3
                                            ,:NEW.ODR_FORM_FLG
                                            ,:NEW.ODR_FAX_FLG
                                            ,:NEW.ODR_EDI_FLG
                                            ,:NEW.ODR_MAIL_FLG
                                            ,:NEW.LIMIT_AMOUNT
                                            ,:NEW.PAY_NOTICE_FLG
                                            ,:NEW.SPOT_VEND_FLG
                                            ,:NEW.BILL_FLG
                                            ,:NEW.REBATE_FLG
                                            ,:NEW.REBATE_START_DATE
                                            ,:NEW.REBATE_END_DATE
                                            ,:NEW.REBATE_COND_TYP
                                            ,:NEW.REBATE_COND_AMOUNT
                                            ,:NEW.REBATE_COND_QTY
                                            ,:NEW.REBATE_TARGET_TYP
                                            ,:NEW.REBATE_RATE
                                            ,:NEW.REBATE_AMOUNT
                                            ,:NEW.TAX_APPLY_TYP
                                            ,:NEW.TAX_CD
                                            ,:NEW.TAX_CALC_TYP
                                            ,:NEW.IMPORT_TRN_TYP
                                            ,:NEW.VEND_CLASS_01_TYP
                                            ,:NEW.VEND_CLASS_01_CD
                                            ,:NEW.VEND_CLASS_01_NM
                                            ,:NEW.VEND_CLASS_02_TYP
                                            ,:NEW.VEND_CLASS_02_CD
                                            ,:NEW.VEND_CLASS_02_NM
                                            ,:NEW.VEND_CLASS_03_TYP
                                            ,:NEW.VEND_CLASS_03_CD
                                            ,:NEW.VEND_CLASS_03_NM
                                            ,:NEW.VEND_CLASS_04_TYP
                                            ,:NEW.VEND_CLASS_04_CD
                                            ,:NEW.VEND_CLASS_04_NM
                                            ,:NEW.VEND_CLASS_05_TYP
                                            ,:NEW.VEND_CLASS_05_CD
                                            ,:NEW.VEND_CLASS_05_NM
                                            ,:NEW.VEND_CLASS_06_TYP
                                            ,:NEW.VEND_CLASS_06_CD
                                            ,:NEW.VEND_CLASS_06_NM
                                            ,:NEW.VEND_CLASS_07_TYP
                                            ,:NEW.VEND_CLASS_07_CD
                                            ,:NEW.VEND_CLASS_07_NM
                                            ,:NEW.VEND_CLASS_08_TYP
                                            ,:NEW.VEND_CLASS_08_CD
                                            ,:NEW.VEND_CLASS_08_NM
                                            ,:NEW.VEND_CLASS_09_TYP
                                            ,:NEW.VEND_CLASS_09_CD
                                            ,:NEW.VEND_CLASS_09_NM
                                            ,:NEW.VEND_CLASS_10_TYP
                                            ,:NEW.VEND_CLASS_10_CD
                                            ,:NEW.VEND_CLASS_10_NM
                                            ,:NEW.CREATED_DATE
                                            ,:NEW.CREATED_BY
                                            ,:NEW.CREATED_PRG_NM
                                            ,:NEW.UPDATED_DATE
                                            ,:NEW.UPDATED_BY
                                            ,:NEW.UPDATED_PRG_NM
                                            ,:NEW.MODIFY_COUNT);
      END IF;
      IF (DELETING) THEN
         delete_time_ := SYSDATE;
         INSERT INTO HS_M_VEND_CTRL VALUES (gnr_typ_delete_
                                            ,:OLD.COMPANY_CD
                                            ,:OLD.VEND_CD
                                            ,:OLD.VEND_NAME
                                            ,:OLD.VEND_ANAME
                                            ,:OLD.VEND_KNAME
                                            ,:OLD.ZIP_CD
                                            ,:OLD.ADDRESS_1
                                            ,:OLD.ADDRESS_2
                                            ,:OLD.ADDRESS_K_1
                                            ,:OLD.ADDRESS_K_2
                                            ,:OLD.TEL
                                            ,:OLD.FAX
                                            ,:OLD.EMAIL
                                            ,:OLD.VEND_ORG
                                            ,:OLD.VEND_PERSON
                                            ,:OLD.OWN_ORG_CD
                                            ,:OLD.OWN_ORG_NAME
                                            ,:OLD.OWN_PERSON_CD
                                            ,:OLD.OWN_PERSON_NAME
                                            ,:OLD.CUR_CD
                                            ,:OLD.EXCH_TYP
                                            ,:OLD.ROUND_TYP
                                            ,:OLD.INSPC_ACPT_APP_TYP
                                            ,:OLD.VEND_REM
                                            ,:OLD.PAYEE_CD
                                            ,:OLD.PAYEE_FIX_FLG
                                            ,:OLD.DEADLINE
                                            ,:OLD.SCH_MONTH
                                            ,:OLD.SCH_DAY
                                            ,:OLD.OLD_TAX_CD
                                            ,:OLD.NEW_TAX_CD
                                            ,:OLD.TAX_CHANGE_DATE
                                            ,:OLD.BALANCE_CTRL_FLG
                                            ,:OLD.DEAL_STS_FLG
                                            ,:OLD.DEAL_START_DATE
                                            ,:OLD.DEAL_END_DATE
                                            ,:OLD.VEND_FLG_1
                                            ,:OLD.VEND_FLG_2
                                            ,:OLD.VEND_FLG_3
                                            ,:OLD.ODR_FORM_FLG
                                            ,:OLD.ODR_FAX_FLG
                                            ,:OLD.ODR_EDI_FLG
                                            ,:OLD.ODR_MAIL_FLG
                                            ,:OLD.LIMIT_AMOUNT
                                            ,:OLD.PAY_NOTICE_FLG
                                            ,:OLD.SPOT_VEND_FLG
                                            ,:OLD.BILL_FLG
                                            ,:OLD.REBATE_FLG
                                            ,:OLD.REBATE_START_DATE
                                            ,:OLD.REBATE_END_DATE
                                            ,:OLD.REBATE_COND_TYP
                                            ,:OLD.REBATE_COND_AMOUNT
                                            ,:OLD.REBATE_COND_QTY
                                            ,:OLD.REBATE_TARGET_TYP
                                            ,:OLD.REBATE_RATE
                                            ,:OLD.REBATE_AMOUNT
                                            ,:OLD.TAX_APPLY_TYP
                                            ,:OLD.TAX_CD
                                            ,:OLD.TAX_CALC_TYP
                                            ,:OLD.IMPORT_TRN_TYP
                                            ,:OLD.VEND_CLASS_01_TYP
                                            ,:OLD.VEND_CLASS_01_CD
                                            ,:OLD.VEND_CLASS_01_NM
                                            ,:OLD.VEND_CLASS_02_TYP
                                            ,:OLD.VEND_CLASS_02_CD
                                            ,:OLD.VEND_CLASS_02_NM
                                            ,:OLD.VEND_CLASS_03_TYP
                                            ,:OLD.VEND_CLASS_03_CD
                                            ,:OLD.VEND_CLASS_03_NM
                                            ,:OLD.VEND_CLASS_04_TYP
                                            ,:OLD.VEND_CLASS_04_CD
                                            ,:OLD.VEND_CLASS_04_NM
                                            ,:OLD.VEND_CLASS_05_TYP
                                            ,:OLD.VEND_CLASS_05_CD
                                            ,:OLD.VEND_CLASS_05_NM
                                            ,:OLD.VEND_CLASS_06_TYP
                                            ,:OLD.VEND_CLASS_06_CD
                                            ,:OLD.VEND_CLASS_06_NM
                                            ,:OLD.VEND_CLASS_07_TYP
                                            ,:OLD.VEND_CLASS_07_CD
                                            ,:OLD.VEND_CLASS_07_NM
                                            ,:OLD.VEND_CLASS_08_TYP
                                            ,:OLD.VEND_CLASS_08_CD
                                            ,:OLD.VEND_CLASS_08_NM
                                            ,:OLD.VEND_CLASS_09_TYP
                                            ,:OLD.VEND_CLASS_09_CD
                                            ,:OLD.VEND_CLASS_09_NM
                                            ,:OLD.VEND_CLASS_10_TYP
                                            ,:OLD.VEND_CLASS_10_CD
                                            ,:OLD.VEND_CLASS_10_NM
                                            ,:OLD.CREATED_DATE
                                            ,:OLD.CREATED_BY
                                            ,:OLD.CREATED_PRG_NM
                                            ,delete_time_
                                            ,:OLD.UPDATED_BY
                                            ,:OLD.UPDATED_PRG_NM
                                            ,mod_count_delete_);
      END IF;
   EXCEPTION
      WHEN OTHERS  THEN
         /* SYS_BAT_PRAMから引数を取得 */
         blnRet := FncGetSysBatParmForTrigger(vc2OutputPath,vc2LogMode, vc2OutputMode);
         IF blnRet = FALSE THEN
            vc2OutputPath := 'D:\EXPJStudio\log';
            vc2LogMode    := '1';
            vc2OutputMode := '0';
         END IF;
         IF (INSERTING) THEN
            vc2UserId     := :NEW.UPDATED_BY;
            vc2PlantCd    := 'Nasi';
            vc2BusinessName := :NEW.UPDATED_PRG_NM||'データ挿入';
         END IF;
         IF (UPDATING) THEN
            vc2UserId     := :NEW.UPDATED_BY;
            vc2PlantCd    := 'Nasi';
            vc2BusinessName := :NEW.UPDATED_PRG_NM||'データ更新';
         END IF;
         IF (DELETING) THEN
            vc2UserId     := '*'||:OLD.UPDATED_BY;
            vc2PlantCd    := 'Nasi';
            vc2BusinessName := '*'||:OLD.UPDATED_PRG_NM||'データ削除';
         END IF;
         vc2NumErrNo   := SQLCODE;
         vc2ErrMessage := SQLERRM;

         /* LogFile の OPEN */
         blnRet := FncLogOpen(vc2OutputPath, vc2OutputName, vc2PlantCd, vc2OutputMode, UTL_FileHandle);
         /* エラーメッセージの出力 */
         blnRet := FNCERRLOG(UTL_FileHandle
                            ,vc2LogMode
                            ,vc2OutputMode
                            ,vc2UserId
                            ,vc2BusinessName
                            ,vc2PlantCd
                            ,vc2PlSqlName
                            ,vc2NumErrNo
                            ,vc2ErrMessage);
         /* LogFile の CLOSE */
         blnRet := FncLogClose(UTL_FileHandle);

   END TRG_M_VEND_CTRL;
/
