CREATE OR REPLACE FUNCTION FNCLOGCLOSE(
/*------------------------------------------------------------------------------
'
' version   : 1.00.00
'
' C³π
' 2003.07.22 Ε
' 2005.10.21 unicodeΞivarchar2π4{j
'
' @\      : knft@CΜbknrd
'
' ίθl    : Boolean
'               True :³νIΉ
'               False:ΩνIΉ
'
' ψ«    : pFileHandle          - (io)t@Cnh
'
' @\ΰΎ  : knft@CΜbknrdπs€B
'
' υl      :
'
------------------------------------------------------------------------------*/
    pFileHandle      IN OUT UTL_FILE.FILE_TYPE  --t@Cnh
) RETURN BOOLEAN
IS

/* θΜιΎ */
FILEOPENMODE_R          VARCHAR2(4) := 'r';        --t@Cnodm[h@qd`c
FILEOPENMODE_W          VARCHAR2(4) := 'w';        --t@Cnodm[h@vqhsd
FILEOPENMODE_A          VARCHAR2(4) := 'a';        --t@Cnodm[h@`oodmc
FILEOPENPATH            VARCHAR2(28) := 'C:\TEMP';  --knft@CpXi­§j

/* ΟΜιΎ */

BEGIN

    /*t@Cbknrd */
    UTL_FILE.FCLOSE(pFileHandle);

RETURN TRUE;



--< αO >---------------------------------------------------------------
EXCEPTION
    WHEN OTHERS THEN                         --»ΜΌΜG[
--DBMS_OUTPUT.PUT_LINE('OTHERS');
        /*St@Cbknrd */
        UTL_FILE.FCLOSE_ALL;
        RETURN TRUE;
END;
/