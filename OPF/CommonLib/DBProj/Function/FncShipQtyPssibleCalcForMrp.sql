CREATE OR REPLACE FUNCTION FNCSHIPQTYPSSIBLECALCFORMRP(
/*------------------------------------------------------------------------------
'
' version   : 1.00.00
'
' C³ð
' 2003.10.16 VKì¬
' 2004.09.24 SUBSTR¨SUBSTRBÉÏX
' 2005.10.21 unicodeÎivarchar2ð4{ASUBSTRBÌøð4{j
'
' @\      : lqoo×Â\»f
'
' ßèl    : Boolean
'               True :³íI¹
'               False:ÙíI¹
'
' ø«    : pFileHandle          - (i)t@Cnh
'             pvc2LogMode          - (i)knf[h
'             pvc2OutputMode       - (i)oÍ[h
'             pvc2UserId           - (i)[Uhc
'             pvc2BusinessName     - (i)Æ±¼
'             pvc2PlantCd               - (i)HêR[h
'             pnumRcvIssueQty      - (i)o×ÀÑ
'             pvc2ItemCd           - (i)iÚÔ
'             pblnRetQty           - (o)o×Â\»è
'
' @\à¾  : FncAutoShipi©®o×j©çgp·é
'
' õl      :
'
------------------------------------------------------------------------------*/
    pFileHandle         IN  UTL_FILE.FILE_TYPE  --t@Cnh
   ,pvc2LogMode         IN  VARCHAR2            --knf[h
   ,pvc2OutputMode      IN  VARCHAR2            --oÍ[h
   ,pvc2UserId          IN  VARCHAR2            --[Uhc
   ,pvc2BusinessName    IN  VARCHAR2            --Æ±¼
   ,pvc2PlantCd                 IN      VARCHAR2       --// HêR[h
   ,pnumRcvIssueQty     IN  NUMBER              --o×
   ,pvc2ItemCd          IN  VARCHAR2            --iÚÔ
   ,pblnRetQty          OUT BOOLEAN         --o×Â\»è

)RETURN BOOLEAN
IS
    -- áOÌé¾ 

    -- èÌé¾
    MY_SQL_NAME             VARCHAR2(108)    := 'FncShipQtyPssibleCalcForMrp';
    MRPFLAG_TARGET          NUMBER          := 1;   --ÛÇæ-MRPÎÛtO(1:MRPÎÛ)

    -- ÏÌé¾ 
    blnRet                  BOOLEAN;        --Ößèl
    intRet                  INTEGER;        --Ößèl
    vc2Comment              VARCHAR2(1024);  --bZ[WpRgì¬ìÆÌæ
    vc2RunChkComment        VARCHAR2(1024);  --ÀsÊumFpRgì¬ìÆÌæ
    numSumOfStockAll        NUMBER;         --o×Â\

-- MESSAGE Ìé¾ 
    APS_COM_ORACLE_ERR                  VARCHAR2(28)     := 'AK53401';    --nq`bkdG[
    APS_COM_OTHER_ERR                   VARCHAR2(28)     := 'AK53402';    --»Ì¼G[

-- LOG Ìé¾ 
    LOGMSG_START                        VARCHAR2(20)   := 'Start';         --Op\bhJné¾
    LOGMSG_END                          VARCHAR2(12)   := 'End';           --Op\bhI¹é¾
    LOGMSG_ERR                          VARCHAR2(32)   := 'ÙíI¹';
    COMMENT_MSGLOG_END                  VARCHAR2(104)  := '<< lqoo×Â\»f >>';


BEGIN
--DBMS_OUTPUT.ENABLE(1000000);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || ' Jn  ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
vc2RunChkComment := NULL;

    -- TraceLog ÌoÍ 
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);
--vc2RunChkComment := 'Êß 00010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- o×Â\Zo
    SELECT SUM(STOCK_ON_HAND_QTY) INTO numSumOfStockAll
      FROM T_ITEM_STOCK A, M_WH B
      WHERE A.WH_CD = B.WH_CD
        AND A.ITEM_CD = pvc2ItemCd
    AND A.PLANT_CD = pvc2PlantCd
        AND B.MRP_FLG = MRPFLAG_TARGET;
    IF numSumOfStockAll IS NULL THEN
        numSumOfStockAll := 0;
    END IF;
    IF numSumOfStockAll < 0 THEN
        numSumOfStockAll := 0;
    END IF;

--vc2RunChkComment := 'Êß 00020';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- o×Â\»f
    IF pnumRcvIssueQty <= numSumOfStockAll THEN
        pblnRetQty := TRUE;
    ELSE
        pblnRetQty := FALSE;
    END IF;



--vc2RunChkComment := 'Êß 00030';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- TraceLog ÌoÍ 
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || ' I¹  ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

    RETURN TRUE;

EXCEPTION

    WHEN OTHERS THEN
--DBMS_OUTPUT.PUT_LINE('»Ì¼ÌG[');
        ROLLBACK;
        vc2Comment := SUBSTRB('(SBM0057)' || COMMENT_MSGLOG_END || LOGMSG_ERR || 'F' ||
                             SQLCODE || ',' || SUBSTRB(SQLERRM,1,1024),
                             1,1024);
        -- G[bZ[WÌoÍ
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_ORACLE_ERR, vc2Comment);
        /* TraceLog ÌoÍiÀsÊuj */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END || vc2RunChkComment);
        -- TraceLog ÌoÍ 
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;
END;
/
