CREATE OR REPLACE TRIGGER TRG_SYS_FILE_INFORMATION7
BEFORE INSERT OR UPDATE OF FILE_CREATED_DATE
ON SYS_FILE_INFORMATION
REFERENCING OLD AS OLD NEW AS NEW
FOR EACH ROW 
BEGIN :NEW.FILE_CREATED_DATE :=TRUNC(:NEW.FILE_CREATED_DATE );END;
/
