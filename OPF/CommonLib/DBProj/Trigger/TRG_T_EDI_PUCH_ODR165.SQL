CREATE OR REPLACE TRIGGER TRG_T_EDI_PUCH_ODR165
BEFORE INSERT OR UPDATE OF EDI_ODR_ISS_DATE
ON T_EDI_PUCH_ODR
REFERENCING OLD AS OLD NEW AS NEW
FOR EACH ROW 
BEGIN :NEW.EDI_ODR_ISS_DATE :=TRUNC(:NEW.EDI_ODR_ISS_DATE );END;
/
