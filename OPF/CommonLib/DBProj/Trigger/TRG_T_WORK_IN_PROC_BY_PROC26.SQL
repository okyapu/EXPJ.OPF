CREATE OR REPLACE TRIGGER TRG_T_WORK_IN_PROC_BY_PROC26
BEFORE INSERT OR UPDATE OF WORK_CMPLT_DATE
ON T_WORK_IN_PROC_BY_PROC
REFERENCING OLD AS OLD NEW AS NEW
FOR EACH ROW 
BEGIN :NEW.WORK_CMPLT_DATE :=TRUNC(:NEW.WORK_CMPLT_DATE );END;
/
