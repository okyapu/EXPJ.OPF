CREATE OR REPLACE TRIGGER TRG_T_OD13
BEFORE INSERT OR UPDATE OF ODR_START_DATE
ON T_OD
REFERENCING OLD AS OLD NEW AS NEW
FOR EACH ROW 
BEGIN :NEW.ODR_START_DATE :=TRUNC(:NEW.ODR_START_DATE );END;
/
