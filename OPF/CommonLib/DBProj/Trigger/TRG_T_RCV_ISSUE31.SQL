CREATE OR REPLACE TRIGGER TRG_T_RCV_ISSUE31
BEFORE INSERT OR UPDATE OF CONS_EXEC_DATE
ON T_RCV_ISSUE
REFERENCING OLD AS OLD NEW AS NEW
FOR EACH ROW 
BEGIN :NEW.CONS_EXEC_DATE :=TRUNC(:NEW.CONS_EXEC_DATE );END;
/
