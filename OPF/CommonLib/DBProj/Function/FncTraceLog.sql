CREATE OR REPLACE FUNCTION FNCTRACELOG(
/*------------------------------------------------------------------------------
'
' version   : 1.00.00
'
' C³π
' 2003.07.22 Ε
' 2004.09.24 SUBSTR¨SUBSTRBΙΟX
' 2005.10.21 unicodeΞivarchar2π4{ASUBSTRBΜψπ4{j
'
' @\      : g[XknfoΝ
'
' ίθl    : Boolean
'               True :³νIΉ
'               False:ΩνIΉ
'
' ψ«    : pFileHandle          - (i)t@Cnh
'             pvc2LogMode          - (i)knf[h
'             pvc2OutputMode       - (i)oΝ[h
'             pvc2UserId           - (i)[Uhc
'             pvc2BusinessName     - (i)Ζ±Ό
'             pvc2PlantCd          --(i)HκR[h
'             pvc2PlSqlName        - (i)ok^rpkΌ
'             pvc2ErrMessage       - (i)g[XbZ[W
'
' @\ΰΎ  : g[XknfΜoΝπs€B
'
' υl      :
'
------------------------------------------------------------------------------*/
    pFileHandle      IN UTL_FILE.FILE_TYPE  --t@Cnh
   ,pvc2LogMode      IN VARCHAR2            --knf[h
   ,pvc2OutputMode   IN VARCHAR2            --oΝ[h
   ,pvc2UserId       IN VARCHAR2            --[Uhc
   ,pvc2BusinessName IN VARCHAR2            --Ζ±Ό
   ,pvc2PlantCd      IN VARCHAR2            --HκR[h
   ,pvc2PlSqlName    IN VARCHAR2            --ok^rpkΌ
   ,pvc2ErrMessage   IN VARCHAR2            --g[XbZ[W
) RETURN BOOLEAN
IS

/* θΜιΎ */
LOGMODE_NOLOG           VARCHAR2(4) := '0';        --knf[h@knf³΅
LOGMODE_ERRMODE         VARCHAR2(4) := '1';        --knf[h@G[knf
LOGMODE_TRACEMODE       VARCHAR2(4) := '2';        --knf[h@g[Xknf
LOGMODE_DATAMODE        VARCHAR2(4) := '3';        --knf[h@f[^knf
OUTPUTMODE_EVENTVIEW    VARCHAR2(4) := '0';        --oΝ[h@@Cxgr[A
OUTPUTMODE_FILE         VARCHAR2(4) := '1';        --oΝ[h@@t@C
LOGKBN_ERR              VARCHAR2(24) := 'ERROR ';   --knfbZ[Wζͺ@G[
LOGKBN_TRACE            VARCHAR2(24) := 'TRACE ';   --knfbZ[Wζͺ@g[X
LOGKBN_DATA             VARCHAR2(24) := 'DATA  ';   --knfbZ[Wζͺ@f[^
LOGKBN_MESSAGE          VARCHAR2(24) := 'Ζ±  ';   --knfbZ[Wζͺ@Ζ±bZ[W
excNORMAL_END           EXCEPTION;

/* ΟΜιΎ */
vc2TmpDateTime          VARCHAR2(76);        --ϊtΤ
vc2TmpMessage           VARCHAR2(1024);       --knfbZ[W

BEGIN

    /* knf[hΜ`FbN */
    IF pvc2LogMode < LOGMODE_TRACEMODE THEN
        RAISE excNORMAL_END;
    END IF;

    /* t@CoΝΜΖ«Νϊπ]L */
    IF pvc2OutputMode = OUTPUTMODE_FILE THEN
        vc2TmpDateTime := TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS');
        vc2TmpMessage := LOGKBN_TRACE || vc2TmpDateTime || ':';
    ELSE
--        vc2TmpMessage := LOGKBN_TRACE;
        vc2TmpDateTime := TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS');
        vc2TmpMessage := LOGKBN_TRACE || vc2TmpDateTime || ':';
    END IF;

    /* MessageΜμ¬ */
    vc2TmpMessage := SUBSTRB(vc2TmpMessage
                             || ',' || pvc2UserId
                             || ',' || pvc2BusinessName
                             || ',' || pvc2PlantCd
                             || ',' || pvc2PlSqlName
                             || ',' || pvc2ErrMessage,
                            1,2048);

    /* knfoΝ */
    UTL_FILE.PUT(pFileHandle, vc2TmpMessage || CHR(10));

    /* ¨oΝ */
    UTL_FILE.FFLUSH(pFileHandle);

RETURN TRUE;



--< αO >---------------------------------------------------------------
EXCEPTION
    WHEN excNORMAL_END         THEN            --knfoΝΞΫO
--DBMS_OUTPUT.PUT_LINE('excNORMAL_END');
        RETURN TRUE;
    WHEN UTL_FILE.INVALID_PATH THEN           --
--DBMS_OUTPUT.PUT_LINE('UTL_FILE.INVALID_PATH');
        RETURN FALSE;
    WHEN UTL_FILE.INVALID_MODE THEN           --
--DBMS_OUTPUT.PUT_LINE('UTL_FILE.INVALID_MODE');
        RETURN FALSE;
    WHEN UTL_FILE.INVALID_OPERATION THEN      --
--DBMS_OUTPUT.PUT_LINE('UTL_FILE.INVALID_OPERATION');
        RETURN FALSE;
    WHEN UTL_FILE.INTERNAL_ERROR THEN         --
--DBMS_OUTPUT.PUT_LINE('UTL_FILE.INTERNAL_ERROR');
        RETURN FALSE;
    WHEN UTL_FILE.WRITE_ERROR THEN            --
--DBMS_OUTPUT.PUT_LINE('UTL_FILE.WRITE_ERROR');
        RETURN FALSE;
    WHEN UTL_FILE.INVALID_FILEHANDLE THEN     --
--DBMS_OUTPUT.PUT_LINE('UTL_FILE.INVALID_FILEHANDLE');
        RETURN FALSE;
    WHEN OTHERS THEN                         --»ΜΌΜG[
--DBMS_OUTPUT.PUT_LINE('OTHERS');
        RETURN FALSE;
END;
/