CREATE OR REPLACE TRIGGER TRG_T_EDI_PUCH_ODR154
BEFORE INSERT OR UPDATE OF BEFORE_DLV_DATE_2
ON T_EDI_PUCH_ODR
REFERENCING OLD AS OLD NEW AS NEW
FOR EACH ROW 
BEGIN :NEW.BEFORE_DLV_DATE_2 :=TRUNC(:NEW.BEFORE_DLV_DATE_2 );END;
/
