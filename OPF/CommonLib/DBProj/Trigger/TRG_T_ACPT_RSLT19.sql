CREATE OR REPLACE TRIGGER TRG_T_ACPT_RSLT19
AFTER INSERT
ON T_ACPT_RSLT
REFERENCING OLD AS OLD NEW AS NEW
FOR EACH ROW 

DECLARE

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
   vc2PlSqlName     VARCHAR2(100) := '受入実績入力';     -- ＰＬSＱＬ名
   vc2OutputName    VARCHAR2(100) := 'TrgTAcptRslt19.log';        -- 出力ファイル名

   CURSOR curSelectTRlsdPuchOdr IS
  SELECT
     COUNT(*) count
     FROM
     T_RLSD_PUCH_ODR 
     WHERE
     PUCH_ODR_CD =:NEW.PUCH_ODR_CD;
   
   recSelectTRlsdPuchOdr curSelectTRlsdPuchOdr%ROWTYPE;

BEGIN

   -- 発注残からレコードを取得し
   OPEN curSelectTRlsdPuchOdr;
   FETCH curSelectTRlsdPuchOdr INTO recSelectTRlsdPuchOdr;

   IF curSelectTRlsdPuchOdr%FOUND THEN
      -- 取得した発注残の分納票発行済みFLGを更新する
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
      
END TRG_T_ACPT_RSLT19;
/