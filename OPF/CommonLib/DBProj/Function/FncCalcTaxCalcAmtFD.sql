CREATE OR REPLACE FUNCTION FNCCALCTAXCALCAMTFD(
/*------------------------------------------------------------------------------
'
' FncCalcTaxCalcAmtFD.Sql
'
' C³ð
' 2006.11.07 VKì¬
'
' @\      : ÅvZ
'
' ßèl    : Boolean
'               True :³íI¹iÊXe[^X=1:³íI¹A2:xI¹j
'               False:ÙíI¹iÊXe[^X=3:ÙíI¹j
'
' ø«    :
'         -- SYSTEM¤Ê
'             pFileHandle                  - (i)t@Cnh
'             pvc2LogMode                  - (i)knf[h
'             pvc2OutputMode               - (i)oÍ[h
'             pvc2UserId                   - (i)[Uhc
'             pvc2BusinessName             - (i)Æ±¼
'             pvc2PlantCd                  - (i)HêR[h
'         -- Æ±ÅL
'             pvc2TaxId                    - (i)ÛÅû®
'             pnumTaxRate1                 - (i)Å¦1
'             pnumTaxRate2                 - (i)Å¦2
'             pnumTaxRate3                 - (i)Å¦3
'             pnumRoundTyp                 - (i)[æª
'             pnumDecimalFlg               - (i)¬
'             pnumAmountIn                 - (i)àz
'             pnumTaxAmount1               - (o)Åz1
'             pnumTaxAmount2               - (o)Åz2
'             pnumTaxAmount3               - (o)Åz3
'             pnumTaxOutAmount             - (o)Å²àz
'             pnumTaxAmount                - (o)ÁïÅz
'             pnumTaxInAmount              - (o)Åàz
'             pnumExternalTaxSalesAmount   - (o)OÅÎÛàz
'             pnumInternalTaxSalesAmount   - (o)àÅÎÛàz
'             pnumTaxFreeSalesAmount       - (o)ñÛÅÎÛàz
'             pnumExternalTaxAmount        - (o)ÁïÅziOÅj
'             pnumInternalTaxAmount        - (o)ÁïÅziàÅj
'             pvc2ErrCd                    - (o)G[R[h
'             pnumStatus                   - (o)ÊXe[^X(1:³íI¹A2:xI¹A3:ÙíI¹)
' @\à¾  :ÛÅû®AÅ¦ð³ÉÁïÅvZðs¤B
'
' õl      :
'
-----------------------------------------------------------------------------*/
    pFileHandle                 IN  UTL_FILE.FILE_TYPE  --t@Cnh
   ,pvc2LogMode                 IN  VARCHAR2            --knf[h
   ,pvc2OutputMode              IN  VARCHAR2            --oÍ[h
   ,pvc2UserId                  IN  VARCHAR2            --[Uhc
   ,pvc2BusinessName            IN  VARCHAR2            --Æ±¼
   ,pvc2PlantCd                 IN  VARCHAR2            --HêR[h
   ,pvc2TaxId                   IN  VARCHAR2            --ÛÅû®
   ,pnumTaxRate1                IN  NUMBER              --Å¦1
   ,pnumTaxRate2                IN  NUMBER              --Å¦2
   ,pnumTaxRate3                IN  NUMBER              --Å¦3
   ,pnumRoundTyp                IN  NUMBER              --[æª
   ,pnumDecimalFlg              IN  NUMBER              --¬
   ,pnumAmountIn                IN  NUMBER              --àz
   ,pnumTaxAmount1              OUT NUMBER              --Åz1
   ,pnumTaxAmount2              OUT NUMBER              --Åz2
   ,pnumTaxAmount3              OUT NUMBER              --Åz3
   ,pnumTaxOutAmount            OUT NUMBER              --Å²àz
   ,pnumTaxAmount               OUT NUMBER              --ÁïÅàz
   ,pnumTaxInAmount             OUT NUMBER              --Åàz
   ,pnumExternalTaxSalesAmount  OUT NUMBER              --OÅÎÛàz
   ,pnumInternalTaxSalesAmount  OUT NUMBER              --àÅÎÛàz
   ,pnumTaxFreeSalesAmount      OUT NUMBER              --ñÛÅÎÛàz
   ,pnumExternalTaxAmount       OUT NUMBER              --ÁïÅziOÅj
   ,pnumInternalTaxAmount       OUT NUMBER              --ÁïÅziàÅj
   ,pvc2ErrCd                   OUT VARCHAR2            --G[R[h
   ,pnumStatus                  OUT NUMBER              --ÊXe[^X
    ) RETURN BOOLEAN
IS

/* èÌé¾ */
    MY_SQL_NAME         VARCHAR2(64)     := 'FncCalcTaxCalcAmtFD';  --ok^rpk¼

    ROUND_TYP_ROUND     NUMBER(1)        := 1;                   --[æª(1:lÌÜü)
    ROUND_TYP_RAISE     NUMBER(1)        := 2;                   --[æª(2:Øèã°)
    ROUND_TYP_OMIT      NUMBER(1)        := 3;                   --[æª(3:ØèÌÄ)

    TAX_ID_TAXFREE      VARCHAR2(1)      := '0';                 --ÛÅû®(0:ñÛÅ)
    TAX_ID_TAXEXTERNAL  VARCHAR2(1)      := '1';                 --ÛÅû®(1:OÅ)
    TAX_ID_TAXINTERNAL  VARCHAR2(1)      := '5';                 --ÛÅû®(5:àÅ)
    TAX_ID_TAXUSERDEF   VARCHAR2(1)      := '9';                 --ÛÅû®(9:[Uè`)

    LOGMSG_START        VARCHAR2(20)     := 'Start';             --Op\bhJné¾
    LOGMSG_END          VARCHAR2(12)     := 'End';               --Op\bhI¹é¾
--  LOGMSG_FUNC_ERR     VARCHAR2(32)     := 'FuncErr';           --Op\bhÖG[é¾
--  LOGMSG_PARM_ERR     VARCHAR2(32)     := 'ParamErr';          --Op\bhp[^G[é¾

    STATUS_NORMAL     CONSTANT   NUMBER(01)     := 1;  -- ³íI¹
    STATUS_WARNING    CONSTANT   NUMBER(01)     := 2;  -- xI¹
    STATUS_ERROR      CONSTANT   NUMBER(01)     := 3;  -- ÙíI¹

    -- bZ[WR[h
    JF_COM_ERR_WRONG_VALUE                 VARCHAR(28)  := 'ZZ05105';               --lªs³Å·
    JF_COM_ERR_NOT_FOUND_M_TAX             VARCHAR(28)  := 'ZZ11004';               --ÁïÅæª}X^ª¶ÝµÜ¹ñ
    JF_COM_ERR_ORACLE_ERROR                VARCHAR(28)  := 'AC53401';               --ORACLEG[

    TAX_CD_SIZE                   NUMBER(03)    := 3;        --ÁïÅR[h

/* ÏÌé¾ WORK */
    blnRet                          BOOLEAN;
    numWkTaxAmount1                 NUMBER(18,4)     := 0;               --Åz1
    numWkTaxAmount2                 NUMBER(18,4)     := 0;               --Åz2
    numWkTaxAmount3                 NUMBER(18,4)     := 0;               --Åz3
    numWkTaxOutAmount               NUMBER(18,4)     := 0;               --Å²àz
    numWkTaxAmount                  NUMBER(18,4)     := 0;               --ÁïÅàz
    numWkTaxInAmount                NUMBER(18,4)     := 0;               --Åàz
    numWkExternalTaxSalesAmount     NUMBER(18,4)     := 0;               --OÅÎÛàz
    numWkInternalTaxSalesAmount     NUMBER(18,4)     := 0;               --àÅÎÛàz
    numWkTaxFreeSalesAmount         NUMBER(18,4)     := 0;               --ñÛÅÎÛàz
    numWkExternalTaxAmount          NUMBER(18,4)     := 0;               --ÁïÅziOÅj
    numWkInternalTaxAmount          NUMBER(18,4)     := 0;               --ÁïÅziàÅj
    vc2WkErrCd                      VARCHAR2(28)     := NULL;            --G[R[h
    numWKStatus                     NUMBER(1)        := STATUS_NORMAL;   --ÊXe[^X

    intWKRecCnt                     INTEGER(11)      := 0;               --R[h

    -- áOÌé¾
    excFnctionErr                EXCEPTION;          --uÖvG[
    excParameterErr              EXCEPTION;          --uøvG[
--  excFncTraceLog               EXCEPTION;          --g[XOoÍG[
--  excResultErr                 EXCEPTION;          --vZÊG[
--  excNotFound                  EXCEPTION;          --}X^NOT FOUND

BEGIN
    pnumTaxAmount1                 :=  0;              --Åz1
    pnumTaxAmount2                 :=  0;              --Åz2
    pnumTaxAmount3                 :=  0;              --Åz3
    pnumTaxOutAmount               :=  0;              --Å²àz
    pnumTaxAmount                  :=  0;              --ÁïÅàz
    pnumTaxInAmount                :=  0;              --Åàz
    pnumExternalTaxSalesAmount     :=  0;              --OÅÎÛàz
    pnumInternalTaxSalesAmount     :=  0;              --àÅÎÛàz
    pnumTaxFreeSalesAmount         :=  0;              --ñÛÅÎÛàz
    pnumExternalTaxAmount          :=  0;              --ÁïÅziOÅj
    pnumInternalTaxAmount          :=  0;              --ÁïÅziàÅj
    pnumStatus                     :=  STATUS_NORMAL;  --ÊXe[^X
    pvc2ErrCd                      :=  NULL;           --G[R[h

    /* TraceLog ÌoÍ */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

    /* ø`FbN */

   -- Å¦1 --
    IF (pnumTaxRate1 IS NULL) THEN  -- NULL
        RAISE excParameterErr;
    ELSIF pnumTaxRate1 = '' THEN    -- ó¶
       RAISE excParameterErr;
    END IF;

   -- Å¦2 --
    IF (pnumTaxRate2 IS NULL) THEN  -- NULL
        RAISE excParameterErr;
    ELSIF pnumTaxRate2 = '' THEN    -- ó¶
       RAISE excParameterErr;
    END IF;

   -- Å¦3 --
    IF (pnumTaxRate3 IS NULL) THEN  -- NULL
        RAISE excParameterErr;
    ELSIF pnumTaxRate3 = '' THEN    -- ó¶
       RAISE excParameterErr;
    END IF;

   -- [æª --
    IF (pnumRoundTyp IS NULL) THEN  -- NULL
        RAISE excParameterErr;
    ELSIF pnumRoundTyp = '' THEN    -- ó¶
        RAISE excParameterErr;
    ELSIF pnumRoundTyp <> ROUND_TYP_ROUND        --lÌÜü
        AND pnumRoundTyp <> ROUND_TYP_RAISE      --Øèã°
        AND pnumRoundTyp <> ROUND_TYP_OMIT THEN  --ØÌÄ
        RAISE excParameterErr;
    END IF;

   -- ¬ --
    IF (pnumDecimalFlg IS NULL) THEN  -- NULL
        RAISE excParameterErr;
    ELSIF pnumDecimalFlg = '' THEN    -- ó¶
        RAISE excParameterErr;
    END IF;

   -- àz --
    IF (pnumAmountIn IS NULL) THEN  -- NULL
        RAISE excParameterErr;
    ELSIF pnumAmountIn = '' THEN    -- ó¶
        RAISE excParameterErr;
    END IF;

    -- ÛÅû® --
    IF (pvc2TaxId IS NULL) THEN  -- NULL
        RAISE excParameterErr;
    ELSIF pvc2TaxId = '' THEN    -- ó¶
        RAISE excParameterErr;
    /* ÅvZ */
    ELSIF pvc2TaxId = TAX_ID_TAXFREE OR pvc2TaxId = TAX_ID_TAXUSERDEF THEN  /* ñÛÅE[Uè` */
        numWkTaxOutAmount             := pnumAmountIn;                                  --Å²àz
        numWkTaxAmount1               := 0;                                             --Åz1
        numWkTaxAmount2               := 0;                                             --Åz2
        numWkTaxAmount3               := 0;                                             --Åz3
        numWkExternalTaxSalesAmount   := 0;                                             --OÅÎÛàz
        numWkInternalTaxSalesAmount   := 0;                                             --àÅÎÛàz
        numWkTaxFreeSalesAmount       := numWkTaxOutAmount;                             --ñÛÅÎÛàz
        numWkExternalTaxAmount        := 0;                                             --ÁïÅziOÅj
        numWkInternalTaxAmount        := 0;                                             --ÁïÅziàÅj
        numWkTaxAmount                := 0;                                             --ÁïÅàz
        numWkTaxInAmount              := numWkTaxOutAmount + numWkTaxAmount;            --Åàz
    ELSIF pvc2TaxId = TAX_ID_TAXEXTERNAL THEN                               /* OÅ */
        numWkTaxOutAmount := pnumAmountIn;                                  --Å²àz
        /* Åz1 */
        blnRet := FncGetRound4FD(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              (pnumAmountIn * pnumTaxRate1) / 100, pnumDecimalFlg, pnumRoundTyp,
                              numWkTaxAmount1,
                              vc2WkErrCd, numWKStatus);                     --Åz1([)
        IF Not blnRet THEN  --ÙíI¹
            RAISE excFnctionErr;
        END IF;
        /* Åz2 */
        blnRet := FncGetRound4FD(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              (pnumAmountIn * pnumTaxRate2) / 100, pnumDecimalFlg, pnumRoundTyp,
                              numWkTaxAmount2,
                              vc2WkErrCd, numWKStatus);                     --Åz2([)
        IF Not blnRet THEN  --ÙíI¹
            RAISE excFnctionErr;
        END IF;
        /* Åz3 */
        blnRet := FncGetRound4FD(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              (pnumAmountIn * pnumTaxRate3) / 100, pnumDecimalFlg, pnumRoundTyp,
                              numWkTaxAmount3,
                              vc2WkErrCd, numWKStatus);                     --Åz3([)
        IF Not blnRet THEN  --ÙíI¹
            RAISE excFnctionErr;
        END IF;
        numWkExternalTaxSalesAmount   := numWkTaxOutAmount;                                     --OÅÎÛàz
        numWkInternalTaxSalesAmount   := 0;                                                     --àÅÎÛàz
        numWkTaxFreeSalesAmount       := 0;                                                     --ñÛÅÎÛàz
        numWkExternalTaxAmount        := numWkTaxAmount1 + numWkTaxAmount2 + numWkTaxAmount3;   --ÁïÅziOÅj
        numWkInternalTaxAmount        := 0;                                                     --ÁïÅziàÅj
        numWkTaxAmount                := numWkExternalTaxAmount + numWkInternalTaxAmount;       --ÁïÅàz
        numWkTaxInAmount              := numWkTaxOutAmount + numWkTaxAmount;                    --Åàz
    ELSIF pvc2TaxId = TAX_ID_TAXINTERNAL THEN                               /* àÅ */
        numWkTaxInAmount  := pnumAmountIn;                                  --Åàz
        /* Åz1 */
        blnRet := FncGetRound4FD(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              (pnumAmountIn * pnumTaxRate1) / (100 + pnumTaxRate1), pnumDecimalFlg, pnumRoundTyp,
                              numWkTaxAmount1,
                              vc2WkErrCd, numWKStatus);                     --Åz1([)
        IF Not blnRet THEN  --ÙíI¹
            RAISE excFnctionErr;
        END IF;
        /* Åz2 */
        blnRet := FncGetRound4FD(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              (pnumAmountIn * pnumTaxRate2) / (100 + pnumTaxRate2), pnumDecimalFlg, pnumRoundTyp,
                              numWkTaxAmount2,
                              vc2WkErrCd, numWKStatus);                     --Åz2([)
        IF Not blnRet THEN  --ÙíI¹
            RAISE excFnctionErr;
        END IF;
        /* Åz3 */
        blnRet := FncGetRound4FD(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              (pnumAmountIn * pnumTaxRate3) / (100 + pnumTaxRate3), pnumDecimalFlg, pnumRoundTyp,
                              numWkTaxAmount3,
                              vc2WkErrCd, numWKStatus);                     --Åz3([)
        IF Not blnRet THEN  --ÙíI¹
            RAISE excFnctionErr;
        END IF;
        numWkExternalTaxSalesAmount   := 0;                                                     --OÅÎÛàz
        numWkInternalTaxSalesAmount   := numWkTaxInAmount;                                      --àÅÎÛàz
        numWkTaxFreeSalesAmount       := 0;                                                     --ñÛÅÎÛàz
        numWkExternalTaxAmount        := 0;                                                     --ÁïÅziOÅj
        numWkInternalTaxAmount        := numWkTaxAmount1 + numWkTaxAmount2 + numWkTaxAmount3;   --ÁïÅziàÅj
        numWkTaxAmount                := numWkExternalTaxAmount + numWkInternalTaxAmount;       --ÁïÅàz
        numWkTaxOutAmount             := numWkTaxInAmount - numWkTaxAmount;                     --Å²àz
    ELSE
        RAISE excParameterErr;
    END IF;

    /* ÔplÌZbg */
    pnumTaxAmount1                    :=  numWkTaxAmount1;                --Åz1
    pnumTaxAmount2                    :=  numWkTaxAmount2;                --Åz2
    pnumTaxAmount3                    :=  numWkTaxAmount3;                --Åz3
    pnumTaxOutAmount                  :=  numWkTaxOutAmount;              --Å²àz
    pnumTaxAmount                     :=  numWkTaxAmount;                 --ÁïÅàz
    pnumTaxInAmount                   :=  numWkTaxInAmount;               --Åàz
    pnumExternalTaxSalesAmount        :=  numWkExternalTaxSalesAmount;    --OÅÎÛàz
    pnumInternalTaxSalesAmount        :=  numWkInternalTaxSalesAmount;    --àÅÎÛàz
    pnumTaxFreeSalesAmount            :=  numWkTaxFreeSalesAmount;        --ñÛÅÎÛàz
    pnumExternalTaxAmount             :=  numWkExternalTaxAmount;         --ÁïÅziOÅj
    pnumInternalTaxAmount             :=  numWkInternalTaxAmount;         --ÁïÅziàÅj

    /* TraceLog ÌoÍ */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    RETURN TRUE;

--< áO >---------------------------------------------------------------
EXCEPTION
    WHEN excParameterErr THEN
        pnumTaxAmount1                 :=  0;                         --Åz1
        pnumTaxAmount2                 :=  0;                         --Åz2
        pnumTaxAmount3                 :=  0;                         --Åz3
        pnumTaxOutAmount               :=  0;                         --Å²àz
        pnumTaxAmount                  :=  0;                         --ÁïÅàz
        pnumTaxInAmount                :=  0;                         --Åàz
        pnumExternalTaxSalesAmount     :=  0;                         --OÅÎÛàz
        pnumInternalTaxSalesAmount     :=  0;                         --àÅÎÛàz
        pnumTaxFreeSalesAmount         :=  0;                         --ñÛÅÎÛàz
        pnumExternalTaxAmount          :=  0;                         --ÁïÅziOÅj
        pnumInternalTaxAmount          :=  0;                         --ÁïÅziàÅj
        pnumStatus                     := STATUS_ERROR;               --ÊXe[^X
        pvc2ErrCd                      := JF_COM_ERR_WRONG_VALUE;     --G[R[h
        /* TraceLog ÌoÍ */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        RETURN FALSE;
/*    WHEN NO_DATA_FOUND THEN
        pnumTaxAmount1                 :=  0;                         --Åz1
        pnumTaxAmount2                 :=  0;                         --Åz2
        pnumTaxAmount3                 :=  0;                         --Åz3
        pnumTaxOutAmount               :=  0;                         --Å²àz
        pnumTaxAmount                  :=  0;                         --ÁïÅàz
        pnumTaxInAmount                :=  0;                         --Åàz
        pnumExternalTaxSalesAmount     :=  0;                         --OÅÎÛàz
        pnumInternalTaxSalesAmount     :=  0;                         --àÅÎÛàz
        pnumTaxFreeSalesAmount         :=  0;                         --ñÛÅÎÛàz
        pnumExternalTaxAmount          :=  0;                         --ÁïÅziOÅj
        pnumInternalTaxAmount          :=  0;                         --ÁïÅziàÅj
        pnumStatus                     := STATUS_ERROR;               --ÊXe[^X
        pvc2ErrCd                      := JF_COM_ERR_NOT_FOUND_M_TAX; --G[R[h
        -- TraceLog ÌoÍ --
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        RETURN FALSE; */
    WHEN excFnctionErr THEN
        pnumTaxAmount1                 :=  0;                         --Åz1
        pnumTaxAmount2                 :=  0;                         --Åz2
        pnumTaxAmount3                 :=  0;                         --Åz3
        pnumTaxOutAmount               :=  0;                         --Å²àz
        pnumTaxAmount                  :=  0;                         --ÁïÅàz
        pnumTaxInAmount                :=  0;                         --Åàz
        pnumExternalTaxSalesAmount     :=  0;                         --OÅÎÛàz
        pnumInternalTaxSalesAmount     :=  0;                         --àÅÎÛàz
        pnumTaxFreeSalesAmount         :=  0;                         --ñÛÅÎÛàz
        pnumExternalTaxAmount          :=  0;                         --ÁïÅziOÅj
        pnumInternalTaxAmount          :=  0;                         --ÁïÅziàÅj
        pnumStatus                     := STATUS_ERROR;               --ÊXe[^X
        pvc2ErrCd                      := vc2WkErrCd;                 --G[R[h
        /* TraceLog ÌoÍ */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        RETURN FALSE;
    WHEN OTHERS THEN
        pnumTaxAmount1                 :=  0;                         --Åz1
        pnumTaxAmount2                 :=  0;                         --Åz2
        pnumTaxAmount3                 :=  0;                         --Åz3
        pnumTaxOutAmount               :=  0;                         --Å²àz
        pnumTaxAmount                  :=  0;                         --ÁïÅàz
        pnumTaxInAmount                :=  0;                         --Åàz
        pnumExternalTaxSalesAmount     :=  0;                         --OÅÎÛàz
        pnumInternalTaxSalesAmount     :=  0;                         --àÅÎÛàz
        pnumTaxFreeSalesAmount         :=  0;                         --ñÛÅÎÛàz
        pnumExternalTaxAmount          :=  0;                         --ÁïÅziOÅj
        pnumInternalTaxAmount          :=  0;                         --ÁïÅziàÅj
        pnumStatus                     := STATUS_ERROR;               --ÊXe[^X
        pvc2ErrCd                      := JF_COM_ERR_ORACLE_ERROR;    --G[R[h
        /* ErrorLog ÌoÍ */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, SQLCODE, SQLERRM);
        /* TraceLog ÌoÍ */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        RETURN FALSE;
END;
/
