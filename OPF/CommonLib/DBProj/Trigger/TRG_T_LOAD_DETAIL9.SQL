CREATE OR REPLACE TRIGGER TRG_T_LOAD_DETAIL9
BEFORE INSERT OR UPDATE OF PRD_DUE_DATE
ON T_LOAD_DETAIL
REFERENCING OLD AS OLD NEW AS NEW
FOR EACH ROW 
BEGIN :NEW.PRD_DUE_DATE :=TRUNC(:NEW.PRD_DUE_DATE );END;
/
