CREATE OR REPLACE
FUNCTION FNCLOGOPEN(
/*------------------------------------------------------------------------------
'
' version   : 1.00.00
'
' C³π
' 2003.07.22 Ε
' 2005.10.21 unicodeΞivarchar2π4{j
'
' @\      : knft@CΜnodm
'
' ίθl    : Boolean
'               True :³νIΉ
'               False:ΩνIΉ
'
' ψ«    : pvc2OutputPath       - (i) oΝt@CpX
'             pvc2OutputName       - (i) oΝt@CΌ
'             pvc2PlantCd          - (i) HκR[h
'             pvc2OutputMode       - (i) oΝ[h
'             pFileHandle          - (io)t@Cnh
'
' @\ΰΎ  : knft@CΜnodmπs€B
'             oΝt@CΝHκR[h{uQv{oΝt@CΌΖΘιB
'
' υl      :
'
------------------------------------------------------------------------------*/
    pvc2OutputPath   IN     VARCHAR2            --oΝt@CpX
   ,pvc2OutputName   IN     VARCHAR2            --oΝt@CΌ
   ,pvc2PlantCd      IN     VARCHAR2            --HκR[h
   ,pvc2OutputMode   IN     VARCHAR2            --oΝ[h
   ,pFileHandle      IN OUT UTL_FILE.FILE_TYPE  --t@Cnh
) RETURN BOOLEAN
IS

/* θΜιΎ */
FILEOPENMODE_R  CONSTANT    VARCHAR2(4) := 'r';        --t@Cnodm[h@qd`c
FILEOPENMODE_W  CONSTANT    VARCHAR2(4) := 'w';        --t@Cnodm[h@vqhsd
FILEOPENMODE_A  CONSTANT    VARCHAR2(4) := 'a';        --t@Cnodm[h@`oodmc

FILEOPENMODE    VARCHAR(4); -- t@CI[v[h

FILEOPENPATH    CONSTANT    VARCHAR2(28) := 'C:\TEMP';  --knft@CpXi­§j


BEGIN

  IF pvc2OutputMode = '0' THEN
    FILEOPENMODE := FILEOPENMODE_A;
  ELSE
    FILEOPENMODE := FILEOPENMODE_W;
  END IF;

    /*t@Cnodm */
    pFileHandle := UTL_FILE.FOPEN(pvc2OutputPath, pvc2PlantCd || '_' || pvc2OutputName, FILEOPENMODE);

RETURN TRUE;



--< αO >---------------------------------------------------------------
EXCEPTION
    WHEN OTHERS THEN                         --»ΜΌΜG[
--DBMS_OUTPUT.PUT_LINE('OTHERS');
        /*t@Cnodm */
        pFileHandle := UTL_FILE.FOPEN(FILEOPENPATH, pvc2PlantCd || '_' || pvc2OutputName, FILEOPENMODE);
        RETURN TRUE;
END;
/