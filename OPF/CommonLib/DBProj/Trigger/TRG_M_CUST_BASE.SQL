CREATE OR REPLACE TRIGGER TRG_M_CUST_BASE
   AFTER INSERT OR UPDATE OR DELETE ON M_CUST_BASE
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
      vc2PlSqlName     VARCHAR2(100) := 'トリガー得意先納品場所履歴登録'; -- ＰＬ／ＳＱＬ名
      vc2OutputName    VARCHAR2(100) := 'TrgMCustBaseError.log';          -- 出力ファイル名
   BEGIN
      IF (INSERTING) THEN
         INSERT INTO HS_M_CUST_BASE VALUES (gnr_typ_insert_
                                       		,:NEW.COMPANY_CD
						,:NEW.CUST_CD
						,:NEW.DLV_LOC_CD
						,:NEW.DLV_LOC_NAME
						,:NEW.DLV_LOC_KNAME
						,:NEW.DLV_LOC_ENAME
						,:NEW.ZIP_CD
						,:NEW.ADDRESS_1
						,:NEW.ADDRESS_2
						,:NEW.ADDRESS_K_1
						,:NEW.ADDRESS_K_2
						,:NEW.TEL
						,:NEW.FAX
						,:NEW.SHIP_WH_CD
						,:NEW.DEPO_WH_CD
						,:NEW.TRANSPORT_CD
						,:NEW.TRANSPORT_NAME
						,:NEW.TRANSPORT_LT
						,:NEW.CAL_NO
						,:NEW.TRANSPORT_TYP
						,:NEW.DLV_START_TIME
						,:NEW.DLV_END_TIME
						,:NEW.AREA_CLASS_TYP1
						,:NEW.AREA_CLASS_1
						,:NEW.AREA_CLASS_TYP2
						,:NEW.AREA_CLASS_2
						,:NEW.AREA_CLASS_TYP3
						,:NEW.AREA_CLASS_3
						,:NEW.REMARKS_1
						,:NEW.REMARKS_2
						,:NEW.REMARKS_3
						,:NEW.CREATED_DATE
						,:NEW.CREATED_BY
						,:NEW.CREATED_PRG_NM
						,:NEW.UPDATED_DATE
						,:NEW.UPDATED_BY
						,:NEW.UPDATED_PRG_NM
						,:NEW.MODIFY_COUNT);
      END IF;
      IF (UPDATING) THEN
         INSERT INTO HS_M_CUST_BASE VALUES (gnr_typ_update_
                                       		,:NEW.COMPANY_CD
						,:NEW.CUST_CD
						,:NEW.DLV_LOC_CD
						,:NEW.DLV_LOC_NAME
						,:NEW.DLV_LOC_KNAME
						,:NEW.DLV_LOC_ENAME
						,:NEW.ZIP_CD
						,:NEW.ADDRESS_1
						,:NEW.ADDRESS_2
						,:NEW.ADDRESS_K_1
						,:NEW.ADDRESS_K_2
						,:NEW.TEL
						,:NEW.FAX
						,:NEW.SHIP_WH_CD
						,:NEW.DEPO_WH_CD
						,:NEW.TRANSPORT_CD
						,:NEW.TRANSPORT_NAME
						,:NEW.TRANSPORT_LT
						,:NEW.CAL_NO
						,:NEW.TRANSPORT_TYP
						,:NEW.DLV_START_TIME
						,:NEW.DLV_END_TIME
						,:NEW.AREA_CLASS_TYP1
						,:NEW.AREA_CLASS_1
						,:NEW.AREA_CLASS_TYP2
						,:NEW.AREA_CLASS_2
						,:NEW.AREA_CLASS_TYP3
						,:NEW.AREA_CLASS_3
						,:NEW.REMARKS_1
						,:NEW.REMARKS_2
						,:NEW.REMARKS_3
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
         INSERT INTO HS_M_CUST_BASE VALUES (gnr_typ_delete_
					        ,:OLD.COMPANY_CD
						,:OLD.CUST_CD
						,:OLD.DLV_LOC_CD
						,:OLD.DLV_LOC_NAME
						,:OLD.DLV_LOC_KNAME
						,:OLD.DLV_LOC_ENAME
						,:OLD.ZIP_CD
						,:OLD.ADDRESS_1
						,:OLD.ADDRESS_2
						,:OLD.ADDRESS_K_1
						,:OLD.ADDRESS_K_2
						,:OLD.TEL
						,:OLD.FAX
						,:OLD.SHIP_WH_CD
						,:OLD.DEPO_WH_CD
						,:OLD.TRANSPORT_CD
						,:OLD.TRANSPORT_NAME
						,:OLD.TRANSPORT_LT
						,:OLD.CAL_NO
						,:OLD.TRANSPORT_TYP
						,:OLD.DLV_START_TIME
						,:OLD.DLV_END_TIME
						,:OLD.AREA_CLASS_TYP1
						,:OLD.AREA_CLASS_1
						,:OLD.AREA_CLASS_TYP2
						,:OLD.AREA_CLASS_2
						,:OLD.AREA_CLASS_TYP3
						,:OLD.AREA_CLASS_3
						,:OLD.REMARKS_1
						,:OLD.REMARKS_2
						,:OLD.REMARKS_3
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

   END TRG_M_CUST_BASE;
/
