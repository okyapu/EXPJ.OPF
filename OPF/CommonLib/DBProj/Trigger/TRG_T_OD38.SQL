CREATE OR REPLACE TRIGGER TRG_T_OD38
BEFORE INSERT OR UPDATE OF ISSUE_CMPLT_DATE
ON T_OD
REFERENCING OLD AS OLD NEW AS NEW
FOR EACH ROW 
BEGIN :NEW.ISSUE_CMPLT_DATE :=TRUNC(:NEW.ISSUE_CMPLT_DATE );END;
/
