CREATE OR REPLACE TRIGGER TRG_SYS_DAILY_PROC_CTRL2
BEFORE INSERT OR UPDATE OF FINAL_DAILY_PROC_EXEC_DATE
ON SYS_DAILY_PROC_CTRL
REFERENCING OLD AS OLD NEW AS NEW
FOR EACH ROW 
BEGIN :NEW.FINAL_DAILY_PROC_EXEC_DATE :=TRUNC(:NEW.FINAL_DAILY_PROC_EXEC_DATE );END;
/
