CREATE OR REPLACE TRIGGER TRG_T_RLSD_PUCH_ODR56
BEFORE INSERT OR UPDATE OF PUCH_ODR_FAX_ISS_DATE
ON T_RLSD_PUCH_ODR
REFERENCING OLD AS OLD NEW AS NEW
FOR EACH ROW 
BEGIN :NEW.PUCH_ODR_FAX_ISS_DATE :=TRUNC(:NEW.PUCH_ODR_FAX_ISS_DATE );END;
/
