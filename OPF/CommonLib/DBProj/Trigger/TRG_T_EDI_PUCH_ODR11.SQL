CREATE OR REPLACE TRIGGER TRG_T_EDI_PUCH_ODR11
BEFORE INSERT OR UPDATE OF PUCH_ODR_DATE
ON T_EDI_PUCH_ODR
REFERENCING OLD AS OLD NEW AS NEW
FOR EACH ROW 
BEGIN :NEW.PUCH_ODR_DATE :=TRUNC(:NEW.PUCH_ODR_DATE );END;
/
