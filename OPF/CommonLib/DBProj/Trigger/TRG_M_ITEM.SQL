CREATE OR REPLACE TRIGGER TRG_M_ITEM
AFTER INSERT OR DELETE OR UPDATE 
ON M_ITEM
REFERENCING OLD AS OLD NEW AS NEW
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
      vc2PlSqlName     VARCHAR2(100) := 'トリガー品目履歴登録';     -- ＰＬ／ＳＱＬ名
      vc2OutputName    VARCHAR2(100) := 'TrgMItemError.log';        -- 出力ファイル名

   BEGIN
      IF (INSERTING) THEN
         INSERT INTO HS_M_ITEM VALUES (gnr_typ_insert_
                                        ,:NEW.ITEM_CD
                                        ,:NEW.ITEM_NAME
                                        ,:NEW.DRAW_CD
                                        ,:NEW.SPEC
                                        ,:NEW.HIGH_LEVEL_NO
                                        ,:NEW.MRP_ODR_TYP
                                        ,:NEW.OUTSIDE_TYP
                                        ,:NEW.STOCK_UNIT_FLG
                                        ,:NEW.STOCK_UNIT
                                        ,:NEW.PKG_UNIT
                                        ,:NEW.PKG_UNIT_QTY
                                        ,:NEW.UNIT_QTY_TYP
                                        ,:NEW.ODR_LT
                                        ,:NEW.FIXED_LT
                                        ,:NEW.PROP_LT
                                        ,:NEW.SAFETY_LT
                                        ,:NEW.ISSUE_LT
                                        ,:NEW.PROP_LOT_SIZE
                                        ,:NEW.ITEM_SPOIL
                                        ,:NEW.SAFETY_STOCK
                                        ,:NEW.LOT_SIZING_TYP
                                        ,:NEW.MAX_PERIOD
                                        ,:NEW.MAX_ODR_QTY
                                        ,:NEW.ODR_POINT
                                        ,:NEW.FIXED_ODR_QTY
                                        ,:NEW.MIN_ODR_QTY
                                        ,:NEW.MUL_ODR_QTY
                                        ,:NEW.ISSUE_TYP
                                        ,:NEW.MPS_FLG
                                        ,:NEW.ACPT_INSPC_TYP
                                        ,:NEW.PRODUCT_TYP
                                        ,:NEW.CLASIFICATION_CD
                                        ,:NEW.UNIT_WEIGHT
                                        ,:NEW.ABC_TYP
                                        ,:NEW.OPR_RSLT_TYP
                                        ,:NEW.SPL_ITEM_TYP
                                        ,:NEW.TAX_CD
                                        ,:NEW.CAL_NO
                                        ,:NEW.BEST_BEFORE_YEAR
                                        ,:NEW.BEST_BEFORE_MONTH
                                        ,:NEW.BEST_BEFORE_DAY
                                        ,:NEW.SHIP_DEADLINE_YEAR
                                        ,:NEW.SHIP_DEADLINE_MONTH
                                        ,:NEW.SHIP_DEADLINE_DAY
                                        ,:NEW.LOT_CTRL_FLG
                                        ,:NEW.LOT_NUMBERING_TYP
                                        ,:NEW.ODR_UNIT
                                        ,:NEW.ODR_UNIT_QTY
                                        ,:NEW.MAX_STOCK_QTY
                                        ,:NEW.ITEM_CLASS_01_TYP
                                        ,:NEW.ITEM_CLASS_01_CD
                                        ,:NEW.ITEM_CLASS_01_NAME
                                        ,:NEW.ITEM_CLASS_02_TYP
                                        ,:NEW.ITEM_CLASS_02_CD
                                        ,:NEW.ITEM_CLASS_02_NAME
                                        ,:NEW.ITEM_CLASS_03_TYP
                                        ,:NEW.ITEM_CLASS_03_CD
                                        ,:NEW.ITEM_CLASS_03_NAME
                                        ,:NEW.ITEM_CLASS_04_TYP
                                        ,:NEW.ITEM_CLASS_04_CD
                                        ,:NEW.ITEM_CLASS_04_NAME
                                        ,:NEW.ITEM_CLASS_05_TYP
                                        ,:NEW.ITEM_CLASS_05_CD
                                        ,:NEW.ITEM_CLASS_05_NAME
                                        ,:NEW.ITEM_CLASS_06_TYP
                                        ,:NEW.ITEM_CLASS_06_CD
                                        ,:NEW.ITEM_CLASS_06_NAME
                                        ,:NEW.ITEM_CLASS_07_TYP
                                        ,:NEW.ITEM_CLASS_07_CD
                                        ,:NEW.ITEM_CLASS_07_NAME
                                        ,:NEW.ITEM_CLASS_08_TYP
                                        ,:NEW.ITEM_CLASS_08_CD
                                        ,:NEW.ITEM_CLASS_08_NAME
                                        ,:NEW.ITEM_CLASS_09_TYP
                                        ,:NEW.ITEM_CLASS_09_CD
                                        ,:NEW.ITEM_CLASS_09_NAME
                                        ,:NEW.ITEM_CLASS_10_TYP
                                        ,:NEW.ITEM_CLASS_10_CD
                                        ,:NEW.ITEM_CLASS_10_NAME
                                        ,:NEW.ITEM_CLASS_11_TYP
                                        ,:NEW.ITEM_CLASS_11_CD
                                        ,:NEW.ITEM_CLASS_11_NAME
                                        ,:NEW.ITEM_CLASS_12_TYP
                                        ,:NEW.ITEM_CLASS_12_CD
                                        ,:NEW.ITEM_CLASS_12_NAME
                                        ,:NEW.DEPO_TYP
                                        ,:NEW.JANCODE
                                        ,:NEW.PATTERN_CD
                                        ,:NEW.PRD_CD
                                        ,:NEW.SET_LT
                                        ,:NEW.BEST_BEFORE_DATE_LT
                                        ,:NEW.REMARK1
                                        ,:NEW.REMARK2
                                        ,:NEW.DEPT_CD
                                        ,:NEW.PJ_CD
                                        ,:NEW.SEG_CONTENTS1
                                        ,:NEW.SEG_CONTENTS2
                                        ,:NEW.SEG_CONTENTS3
                                        ,:NEW.SEG_CONTENTS4
                                        ,:NEW.CREATED_DATE
                                        ,:NEW.CREATED_BY
                                        ,:NEW.CREATED_PRG_NM
                                        ,:NEW.UPDATED_DATE
                                        ,:NEW.UPDATED_BY
                                        ,:NEW.UPDATED_PRG_NM
                                        ,:NEW.MODIFY_COUNT
                                        ,:NEW.MANHOUR_TYP);
      END IF;
      IF (UPDATING) THEN
         INSERT INTO HS_M_ITEM VALUES (gnr_typ_update_
                                        ,:NEW.ITEM_CD
                                        ,:NEW.ITEM_NAME
                                        ,:NEW.DRAW_CD
                                        ,:NEW.SPEC
                                        ,:NEW.HIGH_LEVEL_NO
                                        ,:NEW.MRP_ODR_TYP
                                        ,:NEW.OUTSIDE_TYP
                                        ,:NEW.STOCK_UNIT_FLG
                                        ,:NEW.STOCK_UNIT
                                        ,:NEW.PKG_UNIT
                                        ,:NEW.PKG_UNIT_QTY
                                        ,:NEW.UNIT_QTY_TYP
                                        ,:NEW.ODR_LT
                                        ,:NEW.FIXED_LT
                                        ,:NEW.PROP_LT
                                        ,:NEW.SAFETY_LT
                                        ,:NEW.ISSUE_LT
                                        ,:NEW.PROP_LOT_SIZE
                                        ,:NEW.ITEM_SPOIL
                                        ,:NEW.SAFETY_STOCK
                                        ,:NEW.LOT_SIZING_TYP
                                        ,:NEW.MAX_PERIOD
                                        ,:NEW.MAX_ODR_QTY
                                        ,:NEW.ODR_POINT
                                        ,:NEW.FIXED_ODR_QTY
                                        ,:NEW.MIN_ODR_QTY
                                        ,:NEW.MUL_ODR_QTY
                                        ,:NEW.ISSUE_TYP
                                        ,:NEW.MPS_FLG
                                        ,:NEW.ACPT_INSPC_TYP
                                        ,:NEW.PRODUCT_TYP
                                        ,:NEW.CLASIFICATION_CD
                                        ,:NEW.UNIT_WEIGHT
                                        ,:NEW.ABC_TYP
                                        ,:NEW.OPR_RSLT_TYP
                                        ,:NEW.SPL_ITEM_TYP
                                        ,:NEW.TAX_CD
                                        ,:NEW.CAL_NO
                                        ,:NEW.BEST_BEFORE_YEAR
                                        ,:NEW.BEST_BEFORE_MONTH
                                        ,:NEW.BEST_BEFORE_DAY
                                        ,:NEW.SHIP_DEADLINE_YEAR
                                        ,:NEW.SHIP_DEADLINE_MONTH
                                        ,:NEW.SHIP_DEADLINE_DAY
                                        ,:NEW.LOT_CTRL_FLG
                                        ,:NEW.LOT_NUMBERING_TYP
                                        ,:NEW.ODR_UNIT
                                        ,:NEW.ODR_UNIT_QTY
                                        ,:NEW.MAX_STOCK_QTY
                                        ,:NEW.ITEM_CLASS_01_TYP
                                        ,:NEW.ITEM_CLASS_01_CD
                                        ,:NEW.ITEM_CLASS_01_NAME
                                        ,:NEW.ITEM_CLASS_02_TYP
                                        ,:NEW.ITEM_CLASS_02_CD
                                        ,:NEW.ITEM_CLASS_02_NAME
                                        ,:NEW.ITEM_CLASS_03_TYP
                                        ,:NEW.ITEM_CLASS_03_CD
                                        ,:NEW.ITEM_CLASS_03_NAME
                                        ,:NEW.ITEM_CLASS_04_TYP
                                        ,:NEW.ITEM_CLASS_04_CD
                                        ,:NEW.ITEM_CLASS_04_NAME
                                        ,:NEW.ITEM_CLASS_05_TYP
                                        ,:NEW.ITEM_CLASS_05_CD
                                        ,:NEW.ITEM_CLASS_05_NAME
                                        ,:NEW.ITEM_CLASS_06_TYP
                                        ,:NEW.ITEM_CLASS_06_CD
                                        ,:NEW.ITEM_CLASS_06_NAME
                                        ,:NEW.ITEM_CLASS_07_TYP
                                        ,:NEW.ITEM_CLASS_07_CD
                                        ,:NEW.ITEM_CLASS_07_NAME
                                        ,:NEW.ITEM_CLASS_08_TYP
                                        ,:NEW.ITEM_CLASS_08_CD
                                        ,:NEW.ITEM_CLASS_08_NAME
                                        ,:NEW.ITEM_CLASS_09_TYP
                                        ,:NEW.ITEM_CLASS_09_CD
                                        ,:NEW.ITEM_CLASS_09_NAME
                                        ,:NEW.ITEM_CLASS_10_TYP
                                        ,:NEW.ITEM_CLASS_10_CD
                                        ,:NEW.ITEM_CLASS_10_NAME
                                        ,:NEW.ITEM_CLASS_11_TYP
                                        ,:NEW.ITEM_CLASS_11_CD
                                        ,:NEW.ITEM_CLASS_11_NAME
                                        ,:NEW.ITEM_CLASS_12_TYP
                                        ,:NEW.ITEM_CLASS_12_CD
                                        ,:NEW.ITEM_CLASS_12_NAME
                                        ,:NEW.DEPO_TYP
                                        ,:NEW.JANCODE
                                        ,:NEW.PATTERN_CD
                                        ,:NEW.PRD_CD
                                        ,:NEW.SET_LT
                                        ,:NEW.BEST_BEFORE_DATE_LT
                                        ,:NEW.REMARK1
                                        ,:NEW.REMARK2
                                        ,:NEW.DEPT_CD
                                        ,:NEW.PJ_CD
                                        ,:NEW.SEG_CONTENTS1
                                        ,:NEW.SEG_CONTENTS2
                                        ,:NEW.SEG_CONTENTS3
                                        ,:NEW.SEG_CONTENTS4
                                        ,:NEW.CREATED_DATE
                                        ,:NEW.CREATED_BY
                                        ,:NEW.CREATED_PRG_NM
                                        ,:NEW.UPDATED_DATE
                                        ,:NEW.UPDATED_BY
                                        ,:NEW.UPDATED_PRG_NM
                                        ,:NEW.MODIFY_COUNT
                                        ,:NEW.MANHOUR_TYP);
      END IF;
      IF (DELETING) THEN
         delete_time_ := SYSDATE;
         INSERT INTO HS_M_ITEM VALUES (gnr_typ_delete_
                                        ,:OLD.ITEM_CD
                                        ,:OLD.ITEM_NAME
                                        ,:OLD.DRAW_CD
                                        ,:OLD.SPEC
                                        ,:OLD.HIGH_LEVEL_NO
                                        ,:OLD.MRP_ODR_TYP
                                        ,:OLD.OUTSIDE_TYP
                                        ,:OLD.STOCK_UNIT_FLG
                                        ,:OLD.STOCK_UNIT
                                        ,:OLD.PKG_UNIT
                                        ,:OLD.PKG_UNIT_QTY
                                        ,:OLD.UNIT_QTY_TYP
                                        ,:OLD.ODR_LT
                                        ,:OLD.FIXED_LT
                                        ,:OLD.PROP_LT
                                        ,:OLD.SAFETY_LT
                                        ,:OLD.ISSUE_LT
                                        ,:OLD.PROP_LOT_SIZE
                                        ,:OLD.ITEM_SPOIL
                                        ,:OLD.SAFETY_STOCK
                                        ,:OLD.LOT_SIZING_TYP
                                        ,:OLD.MAX_PERIOD
                                        ,:OLD.MAX_ODR_QTY
                                        ,:OLD.ODR_POINT
                                        ,:OLD.FIXED_ODR_QTY
                                        ,:OLD.MIN_ODR_QTY
                                        ,:OLD.MUL_ODR_QTY
                                        ,:OLD.ISSUE_TYP
                                        ,:OLD.MPS_FLG
                                        ,:OLD.ACPT_INSPC_TYP
                                        ,:OLD.PRODUCT_TYP
                                        ,:OLD.CLASIFICATION_CD
                                        ,:OLD.UNIT_WEIGHT
                                        ,:OLD.ABC_TYP
                                        ,:OLD.OPR_RSLT_TYP
                                        ,:OLD.SPL_ITEM_TYP
                                        ,:OLD.TAX_CD
                                        ,:OLD.CAL_NO
                                        ,:OLD.BEST_BEFORE_YEAR
                                        ,:OLD.BEST_BEFORE_MONTH
                                        ,:OLD.BEST_BEFORE_DAY
                                        ,:OLD.SHIP_DEADLINE_YEAR
                                        ,:OLD.SHIP_DEADLINE_MONTH
                                        ,:OLD.SHIP_DEADLINE_DAY
                                        ,:OLD.LOT_CTRL_FLG
                                        ,:OLD.LOT_NUMBERING_TYP
                                        ,:OLD.ODR_UNIT
                                        ,:OLD.ODR_UNIT_QTY
                                        ,:OLD.MAX_STOCK_QTY
                                        ,:OLD.ITEM_CLASS_01_TYP
                                        ,:OLD.ITEM_CLASS_01_CD
                                        ,:OLD.ITEM_CLASS_01_NAME
                                        ,:OLD.ITEM_CLASS_02_TYP
                                        ,:OLD.ITEM_CLASS_02_CD
                                        ,:OLD.ITEM_CLASS_02_NAME
                                        ,:OLD.ITEM_CLASS_03_TYP
                                        ,:OLD.ITEM_CLASS_03_CD
                                        ,:OLD.ITEM_CLASS_03_NAME
                                        ,:OLD.ITEM_CLASS_04_TYP
                                        ,:OLD.ITEM_CLASS_04_CD
                                        ,:OLD.ITEM_CLASS_04_NAME
                                        ,:OLD.ITEM_CLASS_05_TYP
                                        ,:OLD.ITEM_CLASS_05_CD
                                        ,:OLD.ITEM_CLASS_05_NAME
                                        ,:OLD.ITEM_CLASS_06_TYP
                                        ,:OLD.ITEM_CLASS_06_CD
                                        ,:OLD.ITEM_CLASS_06_NAME
                                        ,:OLD.ITEM_CLASS_07_TYP
                                        ,:OLD.ITEM_CLASS_07_CD
                                        ,:OLD.ITEM_CLASS_07_NAME
                                        ,:OLD.ITEM_CLASS_08_TYP
                                        ,:OLD.ITEM_CLASS_08_CD
                                        ,:OLD.ITEM_CLASS_08_NAME
                                        ,:OLD.ITEM_CLASS_09_TYP
                                        ,:OLD.ITEM_CLASS_09_CD
                                        ,:OLD.ITEM_CLASS_09_NAME
                                        ,:OLD.ITEM_CLASS_10_TYP
                                        ,:OLD.ITEM_CLASS_10_CD
                                        ,:OLD.ITEM_CLASS_10_NAME
                                        ,:OLD.ITEM_CLASS_11_TYP
                                        ,:OLD.ITEM_CLASS_11_CD
                                        ,:OLD.ITEM_CLASS_11_NAME
                                        ,:OLD.ITEM_CLASS_12_TYP
                                        ,:OLD.ITEM_CLASS_12_CD
                                        ,:OLD.ITEM_CLASS_12_NAME
                                        ,:OLD.DEPO_TYP
                                        ,:OLD.JANCODE
                                        ,:OLD.PATTERN_CD
                                        ,:OLD.PRD_CD
                                        ,:OLD.SET_LT
                                        ,:OLD.BEST_BEFORE_DATE_LT
                                        ,:OLD.REMARK1
                                        ,:OLD.REMARK2
                                        ,:OLD.DEPT_CD
                                        ,:OLD.PJ_CD
                                        ,:OLD.SEG_CONTENTS1
                                        ,:OLD.SEG_CONTENTS2
                                        ,:OLD.SEG_CONTENTS3
                                        ,:OLD.SEG_CONTENTS4
                                        ,:OLD.CREATED_DATE
                                        ,:OLD.CREATED_BY
                                        ,:OLD.CREATED_PRG_NM
                                        ,delete_time_
                                        ,:OLD.UPDATED_BY
                                        ,:OLD.UPDATED_PRG_NM
                                        ,mod_count_delete_
                                        ,:OLD.MANHOUR_TYP);
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

   END TRG_M_ITEM;
/
