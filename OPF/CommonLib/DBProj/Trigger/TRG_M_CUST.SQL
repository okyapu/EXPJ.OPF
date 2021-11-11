CREATE OR REPLACE TRIGGER TRG_M_CUST
   AFTER INSERT OR UPDATE OR DELETE ON M_CUST
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
      vc2PlSqlName     VARCHAR2(100) := 'トリガー得意先履歴登録';   -- ＰＬ／ＳＱＬ名
      vc2OutputName    VARCHAR2(100) := 'TrgMCustError.log';        -- 出力ファイル名

   BEGIN
      IF (INSERTING) THEN
         INSERT INTO HS_M_CUST VALUES (gnr_typ_insert_
                                        ,:NEW.COMPANY_CD
                                        ,:NEW.CUST_CD
                                        ,:NEW.CUST_FNAME
                                        ,:NEW.CUST_NAME
                                        ,:NEW.CUST_KNAME
                                        ,:NEW.CUST_ENAME
                                        ,:NEW.CUST_ANAME
                                        ,:NEW.OWNER_EXECUTIVE
                                        ,:NEW.OWNER_NAME
                                        ,:NEW.CUST_CLASS_TYP1
                                        ,:NEW.CUST_CLASS_1
                                        ,:NEW.CUST_CLASS_TYP2
                                        ,:NEW.CUST_CLASS_2
                                        ,:NEW.CUST_CLASS_TYP3
                                        ,:NEW.CUST_CLASS_3
                                        ,:NEW.CUST_GRP_CD
                                        ,:NEW.CUST_SEQ_CD
                                        ,:NEW.CUR_CD
                                        ,:NEW.EXCH_TYP
                                        ,:NEW.CLAIM_CYCLE_TYP
                                        ,:NEW.INSPC_ACPT_TYP
                                        ,:NEW.EXPORT_TRN_TYP
                                        ,:NEW.EXPORT_INSPC_ACPT_TYP
                                        ,:NEW.TEMP_UNIT_PRICE_SALES_FLG
                                        ,:NEW.RM_INP_TYP
                                        ,:NEW.TAX_APPLY_TYP
                                        ,:NEW.TAX_CD
                                        ,:NEW.TAX_CALC_TYP
                                        ,:NEW.PRICE_RANK_CD
                                        ,:NEW.PRICE_ROUND_TYP
                                        ,:NEW.DETAIL_ROUND_TYP
                                        ,:NEW.DISCOUNT_RATE_TYP
                                        ,:NEW.STD_DISCOUNT_RATE
                                        ,:NEW.STD_PRICE_APPLY_TYP
                                        ,:NEW.PARTIAL_SHIP_INST_FLG
                                        ,:NEW.OWN_SLIP_ISS_FLG
                                        ,:NEW.SALES_SLIP_ID
                                        ,:NEW.SLIP_PRINTING_TYP_1
                                        ,:NEW.SLIP_PRINTING_TYP_2
                                        ,:NEW.SLIP_PRINTING_TYP_3
                                        ,:NEW.SLIP_PRINTING_TYP_4
                                        ,:NEW.SLIP_PRINTING_TYP_5
                                        ,:NEW.VEND_CD
                                        ,:NEW.TRN_START_DATE
                                        ,:NEW.TRN_END_DATE
                                        ,:NEW.EDI_REQ_PLAN_TRN_TYP
                                        ,:NEW.EDI_ODR_TRN_TYP
                                        ,:NEW.EDI_DLV_INST_TRN_TYP
                                        ,:NEW.EDI_RCV_TRN_TYP
                                        ,:NEW.EDI_CUST_VEND_CD
                                        ,:NEW.EDI_OWN_VEND_CD
                                        ,:NEW.CREDIT_LIMIT_AR
                                        ,:NEW.CREDIT_LIMIT_CR
                                        ,:NEW.CUST_RANK_CD
                                        ,:NEW.CUST_VARIOUS_TYP
                                        ,:NEW.PRIORITY_CUST_TYP
                                        ,:NEW.REBATE_FLG
                                        ,:NEW.REBATE_CALC_TYP
                                        ,:NEW.REBATE_CALC_START_MONTH
                                        ,:NEW.REBATE_COND_TYP
                                        ,:NEW.REBATE_COND_AMOUNT
                                        ,:NEW.REBATE_COND_QTY
                                        ,:NEW.REBATE_TARGET_TYP
                                        ,:NEW.REBATE_RATE
                                        ,:NEW.REBATE_AMOUNT
                                        ,:NEW.OWN_ORG_CD
                                        ,:NEW.OWN_PERSON_CD
                                        ,:NEW.UNCONFIRM_ODR_EFF_PRIOD
                                        ,:NEW.UNCONFIRM_ODR_EFF_TERM_FLG
                                        ,:NEW.DEPO_TYP
                                        ,:NEW.INSPC_SALES_APP_TYP
                                        ,:NEW.UNIT_COST_RETROACTION_FLG
                                        ,:NEW.CREATED_DATE
                                        ,:NEW.CREATED_BY
                                        ,:NEW.CREATED_PRG_NM
                                        ,:NEW.UPDATED_DATE
                                        ,:NEW.UPDATED_BY
                                        ,:NEW.UPDATED_PRG_NM
                                        ,:NEW.MODIFY_COUNT
                                        ,:NEW.CUST_CLASS_01_TYP
                                        ,:NEW.CUST_CLASS_01_CD
                                        ,:NEW.CUST_CLASS_01_NM
                                        ,:NEW.CUST_CLASS_02_TYP
                                        ,:NEW.CUST_CLASS_02_CD 
                                        ,:NEW.CUST_CLASS_02_NM
                                        ,:NEW.CUST_CLASS_03_TYP
                                        ,:NEW.CUST_CLASS_03_CD
                                        ,:NEW.CUST_CLASS_03_NM
                                        ,:NEW.CUST_CLASS_04_TYP
                                        ,:NEW.CUST_CLASS_04_CD
                                        ,:NEW.CUST_CLASS_04_NM
                                        ,:NEW.CUST_CLASS_05_TYP
                                        ,:NEW.CUST_CLASS_05_CD
                                        ,:NEW.CUST_CLASS_05_NM
                                        ,:NEW.CUST_CLASS_06_TYP
                                        ,:NEW.CUST_CLASS_06_CD
                                        ,:NEW.CUST_CLASS_06_NM
                                        ,:NEW.CUST_CLASS_07_TYP
                                        ,:NEW.CUST_CLASS_07_CD
                                        ,:NEW.CUST_CLASS_07_NM
                                        ,:NEW.CUST_CLASS_08_TYP
                                        ,:NEW.CUST_CLASS_08_CD
                                        ,:NEW.CUST_CLASS_08_NM
                                        ,:NEW.CUST_CLASS_09_TYP
                                        ,:NEW.CUST_CLASS_09_CD
                                        ,:NEW.CUST_CLASS_09_NM
                                        ,:NEW.CUST_CLASS_10_TYP
                                        ,:NEW.CUST_CLASS_10_CD
                                        ,:NEW.CUST_CLASS_10_NM);
      END IF;
      IF (UPDATING) THEN
         INSERT INTO HS_M_CUST VALUES (gnr_typ_update_
                                        ,:NEW.COMPANY_CD
                                        ,:NEW.CUST_CD
                                        ,:NEW.CUST_FNAME
                                        ,:NEW.CUST_NAME
                                        ,:NEW.CUST_KNAME
                                        ,:NEW.CUST_ENAME
                                        ,:NEW.CUST_ANAME
                                        ,:NEW.OWNER_EXECUTIVE
                                        ,:NEW.OWNER_NAME
                                        ,:NEW.CUST_CLASS_TYP1
                                        ,:NEW.CUST_CLASS_1
                                        ,:NEW.CUST_CLASS_TYP2
                                        ,:NEW.CUST_CLASS_2
                                        ,:NEW.CUST_CLASS_TYP3
                                        ,:NEW.CUST_CLASS_3
                                        ,:NEW.CUST_GRP_CD
                                        ,:NEW.CUST_SEQ_CD
                                        ,:NEW.CUR_CD
                                        ,:NEW.EXCH_TYP
                                        ,:NEW.CLAIM_CYCLE_TYP
                                        ,:NEW.INSPC_ACPT_TYP
                                        ,:NEW.EXPORT_TRN_TYP
                                        ,:NEW.EXPORT_INSPC_ACPT_TYP
                                        ,:NEW.TEMP_UNIT_PRICE_SALES_FLG
                                        ,:NEW.RM_INP_TYP
                                        ,:NEW.TAX_APPLY_TYP
                                        ,:NEW.TAX_CD
                                        ,:NEW.TAX_CALC_TYP
                                        ,:NEW.PRICE_RANK_CD
                                        ,:NEW.PRICE_ROUND_TYP
                                        ,:NEW.DETAIL_ROUND_TYP
                                        ,:NEW.DISCOUNT_RATE_TYP
                                        ,:NEW.STD_DISCOUNT_RATE
                                        ,:NEW.STD_PRICE_APPLY_TYP
                                        ,:NEW.PARTIAL_SHIP_INST_FLG
                                        ,:NEW.OWN_SLIP_ISS_FLG
                                        ,:NEW.SALES_SLIP_ID
                                        ,:NEW.SLIP_PRINTING_TYP_1
                                        ,:NEW.SLIP_PRINTING_TYP_2
                                        ,:NEW.SLIP_PRINTING_TYP_3
                                        ,:NEW.SLIP_PRINTING_TYP_4
                                        ,:NEW.SLIP_PRINTING_TYP_5
                                        ,:NEW.VEND_CD
                                        ,:NEW.TRN_START_DATE
                                        ,:NEW.TRN_END_DATE
                                        ,:NEW.EDI_REQ_PLAN_TRN_TYP
                                        ,:NEW.EDI_ODR_TRN_TYP
                                        ,:NEW.EDI_DLV_INST_TRN_TYP
                                        ,:NEW.EDI_RCV_TRN_TYP
                                        ,:NEW.EDI_CUST_VEND_CD
                                        ,:NEW.EDI_OWN_VEND_CD
                                        ,:NEW.CREDIT_LIMIT_AR
                                        ,:NEW.CREDIT_LIMIT_CR
                                        ,:NEW.CUST_RANK_CD
                                        ,:NEW.CUST_VARIOUS_TYP
                                        ,:NEW.PRIORITY_CUST_TYP
                                        ,:NEW.REBATE_FLG
                                        ,:NEW.REBATE_CALC_TYP
                                        ,:NEW.REBATE_CALC_START_MONTH
                                        ,:NEW.REBATE_COND_TYP
                                        ,:NEW.REBATE_COND_AMOUNT
                                        ,:NEW.REBATE_COND_QTY
                                        ,:NEW.REBATE_TARGET_TYP
                                        ,:NEW.REBATE_RATE
                                        ,:NEW.REBATE_AMOUNT
                                        ,:NEW.OWN_ORG_CD
                                        ,:NEW.OWN_PERSON_CD
                                        ,:NEW.UNCONFIRM_ODR_EFF_PRIOD
                                        ,:NEW.UNCONFIRM_ODR_EFF_TERM_FLG
                                        ,:NEW.DEPO_TYP
                                        ,:NEW.INSPC_SALES_APP_TYP
                                        ,:NEW.UNIT_COST_RETROACTION_FLG
                                        ,:NEW.CREATED_DATE
                                        ,:NEW.CREATED_BY
                                        ,:NEW.CREATED_PRG_NM
                                        ,:NEW.UPDATED_DATE
                                        ,:NEW.UPDATED_BY
                                        ,:NEW.UPDATED_PRG_NM
                                        ,:NEW.MODIFY_COUNT
                                        ,:NEW.CUST_CLASS_01_TYP
                                        ,:NEW.CUST_CLASS_01_CD
                                        ,:NEW.CUST_CLASS_01_NM
                                        ,:NEW.CUST_CLASS_02_TYP
                                        ,:NEW.CUST_CLASS_02_CD 
                                        ,:NEW.CUST_CLASS_02_NM
                                        ,:NEW.CUST_CLASS_03_TYP
                                        ,:NEW.CUST_CLASS_03_CD
                                        ,:NEW.CUST_CLASS_03_NM
                                        ,:NEW.CUST_CLASS_04_TYP
                                        ,:NEW.CUST_CLASS_04_CD
                                        ,:NEW.CUST_CLASS_04_NM
                                        ,:NEW.CUST_CLASS_05_TYP
                                        ,:NEW.CUST_CLASS_05_CD
                                        ,:NEW.CUST_CLASS_05_NM
                                        ,:NEW.CUST_CLASS_06_TYP
                                        ,:NEW.CUST_CLASS_06_CD
                                        ,:NEW.CUST_CLASS_06_NM
                                        ,:NEW.CUST_CLASS_07_TYP
                                        ,:NEW.CUST_CLASS_07_CD
                                        ,:NEW.CUST_CLASS_07_NM
                                        ,:NEW.CUST_CLASS_08_TYP
                                        ,:NEW.CUST_CLASS_08_CD
                                        ,:NEW.CUST_CLASS_08_NM
                                        ,:NEW.CUST_CLASS_09_TYP
                                        ,:NEW.CUST_CLASS_09_CD
                                        ,:NEW.CUST_CLASS_09_NM
                                        ,:NEW.CUST_CLASS_10_TYP
                                        ,:NEW.CUST_CLASS_10_CD
                                        ,:NEW.CUST_CLASS_10_NM);
      END IF;
      IF (DELETING) THEN
         delete_time_ := SYSDATE;
         INSERT INTO HS_M_CUST VALUES (gnr_typ_delete_
                                        ,:OLD.COMPANY_CD
                                        ,:OLD.CUST_CD
                                        ,:OLD.CUST_FNAME
                                        ,:OLD.CUST_NAME
                                        ,:OLD.CUST_KNAME
                                        ,:OLD.CUST_ENAME
                                        ,:OLD.CUST_ANAME
                                        ,:OLD.OWNER_EXECUTIVE
                                        ,:OLD.OWNER_NAME
                                        ,:OLD.CUST_CLASS_TYP1
                                        ,:OLD.CUST_CLASS_1
                                        ,:OLD.CUST_CLASS_TYP2
                                        ,:OLD.CUST_CLASS_2
                                        ,:OLD.CUST_CLASS_TYP3
                                        ,:OLD.CUST_CLASS_3
                                        ,:OLD.CUST_GRP_CD
                                        ,:OLD.CUST_SEQ_CD
                                        ,:OLD.CUR_CD
                                        ,:OLD.EXCH_TYP
                                        ,:OLD.CLAIM_CYCLE_TYP
                                        ,:OLD.INSPC_ACPT_TYP
                                        ,:OLD.EXPORT_TRN_TYP
                                        ,:OLD.EXPORT_INSPC_ACPT_TYP
                                        ,:OLD.TEMP_UNIT_PRICE_SALES_FLG
                                        ,:OLD.RM_INP_TYP
                                        ,:OLD.TAX_APPLY_TYP
                                        ,:OLD.TAX_CD
                                        ,:OLD.TAX_CALC_TYP
                                        ,:OLD.PRICE_RANK_CD
                                        ,:OLD.PRICE_ROUND_TYP
                                        ,:OLD.DETAIL_ROUND_TYP
                                        ,:OLD.DISCOUNT_RATE_TYP
                                        ,:OLD.STD_DISCOUNT_RATE
                                        ,:OLD.STD_PRICE_APPLY_TYP
                                        ,:OLD.PARTIAL_SHIP_INST_FLG
                                        ,:OLD.OWN_SLIP_ISS_FLG
                                        ,:OLD.SALES_SLIP_ID
                                        ,:OLD.SLIP_PRINTING_TYP_1
                                        ,:OLD.SLIP_PRINTING_TYP_2
                                        ,:OLD.SLIP_PRINTING_TYP_3
                                        ,:OLD.SLIP_PRINTING_TYP_4
                                        ,:OLD.SLIP_PRINTING_TYP_5
                                        ,:OLD.VEND_CD
                                        ,:OLD.TRN_START_DATE
                                        ,:OLD.TRN_END_DATE
                                        ,:OLD.EDI_REQ_PLAN_TRN_TYP
                                        ,:OLD.EDI_ODR_TRN_TYP
                                        ,:OLD.EDI_DLV_INST_TRN_TYP
                                        ,:OLD.EDI_RCV_TRN_TYP
                                        ,:OLD.EDI_CUST_VEND_CD
                                        ,:OLD.EDI_OWN_VEND_CD
                                        ,:OLD.CREDIT_LIMIT_AR
                                        ,:OLD.CREDIT_LIMIT_CR
                                        ,:OLD.CUST_RANK_CD
                                        ,:OLD.CUST_VARIOUS_TYP
                                        ,:OLD.PRIORITY_CUST_TYP
                                        ,:OLD.REBATE_FLG
                                        ,:OLD.REBATE_CALC_TYP
                                        ,:OLD.REBATE_CALC_START_MONTH
                                        ,:OLD.REBATE_COND_TYP
                                        ,:OLD.REBATE_COND_AMOUNT
                                        ,:OLD.REBATE_COND_QTY
                                        ,:OLD.REBATE_TARGET_TYP
                                        ,:OLD.REBATE_RATE
                                        ,:OLD.REBATE_AMOUNT
                                        ,:OLD.OWN_ORG_CD
                                        ,:OLD.OWN_PERSON_CD
                                        ,:OLD.UNCONFIRM_ODR_EFF_PRIOD
                                        ,:OLD.UNCONFIRM_ODR_EFF_TERM_FLG
                                        ,:OLD.DEPO_TYP
                                        ,:OLD.INSPC_SALES_APP_TYP
                                        ,:OLD.UNIT_COST_RETROACTION_FLG
                                        ,:OLD.CREATED_DATE
                                        ,:OLD.CREATED_BY
                                        ,:OLD.CREATED_PRG_NM
                                        ,delete_time_
                                        ,:OLD.UPDATED_BY
                                        ,:OLD.UPDATED_PRG_NM
                                        ,mod_count_delete_
                                        ,:OLD.CUST_CLASS_01_TYP
                                        ,:OLD.CUST_CLASS_01_CD
                                        ,:OLD.CUST_CLASS_01_NM
                                        ,:OLD.CUST_CLASS_02_TYP
                                        ,:OLD.CUST_CLASS_02_CD 
                                        ,:OLD.CUST_CLASS_02_NM
                                        ,:OLD.CUST_CLASS_03_TYP
                                        ,:OLD.CUST_CLASS_03_CD
                                        ,:OLD.CUST_CLASS_03_NM
                                        ,:OLD.CUST_CLASS_04_TYP
                                        ,:OLD.CUST_CLASS_04_CD
                                        ,:OLD.CUST_CLASS_04_NM
                                        ,:OLD.CUST_CLASS_05_TYP
                                        ,:OLD.CUST_CLASS_05_CD
                                        ,:OLD.CUST_CLASS_05_NM
                                        ,:OLD.CUST_CLASS_06_TYP
                                        ,:OLD.CUST_CLASS_06_CD
                                        ,:OLD.CUST_CLASS_06_NM
                                        ,:OLD.CUST_CLASS_07_TYP
                                        ,:OLD.CUST_CLASS_07_CD
                                        ,:OLD.CUST_CLASS_07_NM
                                        ,:OLD.CUST_CLASS_08_TYP
                                        ,:OLD.CUST_CLASS_08_CD
                                        ,:OLD.CUST_CLASS_08_NM
                                        ,:OLD.CUST_CLASS_09_TYP
                                        ,:OLD.CUST_CLASS_09_CD
                                        ,:OLD.CUST_CLASS_09_NM
                                        ,:OLD.CUST_CLASS_10_TYP
                                        ,:OLD.CUST_CLASS_10_CD
                                        ,:OLD.CUST_CLASS_10_NM);
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

   END TRG_M_CUST;
/
