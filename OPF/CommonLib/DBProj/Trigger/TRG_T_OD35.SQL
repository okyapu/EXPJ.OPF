CREATE OR REPLACE TRIGGER TRG_T_OD35
BEFORE INSERT OR UPDATE OF RCV_CMPLT_DATE
ON T_OD
REFERENCING OLD AS OLD NEW AS NEW
FOR EACH ROW 
BEGIN :NEW.RCV_CMPLT_DATE :=TRUNC(:NEW.RCV_CMPLT_DATE );END;
/
