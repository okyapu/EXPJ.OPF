CREATE OR REPLACE TRIGGER TRG_T_PRD_INV_IF32
BEFORE INSERT OR UPDATE OF SCDL_SHIP_DATE
ON T_PRD_INV_IF
REFERENCING OLD AS OLD NEW AS NEW
FOR EACH ROW 
BEGIN :NEW.SCDL_SHIP_DATE :=TRUNC(:NEW.SCDL_SHIP_DATE );END;
/
