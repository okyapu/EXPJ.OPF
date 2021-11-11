CREATE OR REPLACE TRIGGER TRG_M_PROC_GRP
   AFTER INSERT OR UPDATE OR DELETE ON M_PROC_GRP
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
      vc2PlSqlName     VARCHAR2(100) := 'トリガー作業系列履歴登録';  -- ＰＬ／ＳＱＬ名
      vc2OutputName    VARCHAR2(100) := 'TrgMProcGrpError.log';      -- 出力ファイル名

   BEGIN
      IF (INSERTING) THEN
         INSERT INTO HS_M_PROC_GRP VALUES (gnr_typ_insert_
                                            ,:NEW.PLANT_CD
                                            ,:NEW.ITEM_CD
                                            ,:NEW.PROC_CD
                                            ,:NEW.PROC_NO
                                            ,:NEW.PROC_NAME
                                            ,:NEW.WS_CD
                                            ,:NEW.COMPANY_CD
                                            ,:NEW.VEND_CD
                                            ,:NEW.FIXED_LT
                                            ,:NEW.PROP_LT
                                            ,:NEW.SAFETY_LT
                                            ,:NEW.PROP_LOT_SIZE
                                            ,:NEW.SPOIL
                                            ,:NEW.OUTSIDE_TYP
                                            ,:NEW.ACPT_INSPC_TYP
                                            ,:NEW.STANDARD_COST
                                            ,:NEW.UNIT_QTY
                                            ,:NEW.WORK_TIME
                                            ,:NEW.CREATED_DATE
                                            ,:NEW.CREATED_BY
                                            ,:NEW.CREATED_PRG_NM
                                            ,:NEW.UPDATED_DATE
                                            ,:NEW.UPDATED_BY
                                            ,:NEW.UPDATED_PRG_NM
                                            ,:NEW.MODIFY_COUNT);
      END IF;
      IF (UPDATING) THEN
         INSERT INTO HS_M_PROC_GRP VALUES (gnr_typ_update_
                                            ,:NEW.PLANT_CD
                                            ,:NEW.ITEM_CD
                                            ,:NEW.PROC_CD
                                            ,:NEW.PROC_NO
                                            ,:NEW.PROC_NAME
                                            ,:NEW.WS_CD
                                            ,:NEW.COMPANY_CD
                                            ,:NEW.VEND_CD
                                            ,:NEW.FIXED_LT
                                            ,:NEW.PROP_LT
                                            ,:NEW.SAFETY_LT
                                            ,:NEW.PROP_LOT_SIZE
                                            ,:NEW.SPOIL
                                            ,:NEW.OUTSIDE_TYP
                                            ,:NEW.ACPT_INSPC_TYP
                                            ,:NEW.STANDARD_COST
                                            ,:NEW.UNIT_QTY
                                            ,:NEW.WORK_TIME
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
         INSERT INTO HS_M_PROC_GRP VALUES (gnr_typ_delete_
                                            ,:OLD.PLANT_CD
                                            ,:OLD.ITEM_CD
                                            ,:OLD.PROC_CD
                                            ,:OLD.PROC_NO
                                            ,:OLD.PROC_NAME
                                            ,:OLD.WS_CD
                                            ,:OLD.COMPANY_CD
                                            ,:OLD.VEND_CD
                                            ,:OLD.FIXED_LT
                                            ,:OLD.PROP_LT
                                            ,:OLD.SAFETY_LT
                                            ,:OLD.PROP_LOT_SIZE
                                            ,:OLD.SPOIL
                                            ,:OLD.OUTSIDE_TYP
                                            ,:OLD.ACPT_INSPC_TYP
                                            ,:OLD.STANDARD_COST
                                            ,:OLD.UNIT_QTY
                                            ,:OLD.WORK_TIME
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
            vc2PlantCd    := :NEW.PLANT_CD;
            vc2BusinessName := :NEW.UPDATED_PRG_NM||'データ挿入';
         END IF;
         IF (UPDATING) THEN
            vc2UserId     := :NEW.UPDATED_BY;
            vc2PlantCd    := :NEW.PLANT_CD;
            vc2BusinessName := :NEW.UPDATED_PRG_NM||'データ更新';
         END IF;
         IF (DELETING) THEN
            vc2UserId     := '*'||:OLD.UPDATED_BY;
            vc2PlantCd    := :OLD.PLANT_CD;
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

   END M_PAST_PROC_GRP;
/