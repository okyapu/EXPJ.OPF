CREATE OR REPLACE TRIGGER TRG_T_EDI_PLAN_ODR52
BEFORE INSERT OR UPDATE OF EDI_ODR_ISS_DATE
ON T_EDI_PLAN_ODR
REFERENCING OLD AS OLD NEW AS NEW
FOR EACH ROW 
BEGIN :NEW.EDI_ODR_ISS_DATE :=TRUNC(:NEW.EDI_ODR_ISS_DATE );END;
/
