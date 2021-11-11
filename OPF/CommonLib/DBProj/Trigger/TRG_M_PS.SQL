CREATE OR REPLACE TRIGGER TRG_M_PS
   AFTER INSERT OR UPDATE OR DELETE ON M_PS
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
      vc2PlSqlName     VARCHAR2(100) := 'トリガー製品構成履歴登録'; -- ＰＬ／ＳＱＬ名
      vc2OutputName    VARCHAR2(100) := 'TrgMPsError.log';          -- 出力ファイル名

   BEGIN
      IF (INSERTING) THEN
         INSERT INTO HS_M_PS   VALUES (gnr_typ_insert_
                                        ,:NEW.PARENT_ITEM_CD
                                        ,:NEW.COMP_ITEM_CD
                                        ,:NEW.PS_EDITION
                                        ,:NEW.PS_UNIT_DENOMINATOR
                                        ,:NEW.PS_UNIT_NUMERATOR
                                        ,:NEW.EFF_PHASE_IN_DATE
                                        ,:NEW.EFF_PHASE_OUT_DATE
                                        ,:NEW.PS_SPOIL
                                        ,:NEW.CONS_TYP
                                        ,:NEW.PS_LT_FLG
                                        ,:NEW.PS_FIXED_LT
                                        ,:NEW.PS_PROP_LT
                                        ,:NEW.PS_PROP_LOT_SIZE
                                        ,:NEW.PS_REF_NO
                                        ,:NEW.COST_UP_TYP
                                        ,:NEW.MRP_EXP_TYP
                                        ,:NEW.CREATED_DATE
                                        ,:NEW.CREATED_BY
                                        ,:NEW.CREATED_PRG_NM
                                        ,:NEW.UPDATED_DATE
                                        ,:NEW.UPDATED_BY
                                        ,:NEW.UPDATED_PRG_NM
                                        ,:NEW.MODIFY_COUNT);
      END IF;
      IF (UPDATING) THEN
         INSERT INTO HS_M_PS   VALUES (gnr_typ_update_
                                        ,:NEW.PARENT_ITEM_CD
                                        ,:NEW.COMP_ITEM_CD
                                        ,:NEW.PS_EDITION
                                        ,:NEW.PS_UNIT_DENOMINATOR
                                        ,:NEW.PS_UNIT_NUMERATOR
                                        ,:NEW.EFF_PHASE_IN_DATE
                                        ,:NEW.EFF_PHASE_OUT_DATE
                                        ,:NEW.PS_SPOIL
                                        ,:NEW.CONS_TYP
                                        ,:NEW.PS_LT_FLG
                                        ,:NEW.PS_FIXED_LT
                                        ,:NEW.PS_PROP_LT
                                        ,:NEW.PS_PROP_LOT_SIZE
                                        ,:NEW.PS_REF_NO
                                        ,:NEW.COST_UP_TYP
                                        ,:NEW.MRP_EXP_TYP
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
         INSERT INTO HS_M_PS   VALUES (gnr_typ_delete_
                                        ,:OLD.PARENT_ITEM_CD
                                        ,:OLD.COMP_ITEM_CD
                                        ,:OLD.PS_EDITION
                                        ,:OLD.PS_UNIT_DENOMINATOR
                                        ,:OLD.PS_UNIT_NUMERATOR
                                        ,:OLD.EFF_PHASE_IN_DATE
                                        ,:OLD.EFF_PHASE_OUT_DATE
                                        ,:OLD.PS_SPOIL
                                        ,:OLD.CONS_TYP
                                        ,:OLD.PS_LT_FLG
                                        ,:OLD.PS_FIXED_LT
                                        ,:OLD.PS_PROP_LT
                                        ,:OLD.PS_PROP_LOT_SIZE
                                        ,:OLD.PS_REF_NO
                                        ,:OLD.COST_UP_TYP
                                        ,:OLD.MRP_EXP_TYP
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

   END TRG_M_PS;
/
