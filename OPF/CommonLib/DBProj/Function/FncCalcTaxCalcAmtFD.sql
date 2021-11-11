CREATE OR REPLACE FUNCTION FNCCALCTAXCALCAMTFD(
/*------------------------------------------------------------------------------
'
' FncCalcTaxCalcAmtFD.Sql
'
' �C������
' 2006.11.07 �V�K�쐬
'
' �@�\      : �Ōv�Z
'
' �߂�l    : Boolean
'               True :����I���i���ʃX�e�[�^�X=1:����I���A2:�x���I���j
'               False:�ُ�I���i���ʃX�e�[�^�X=3:�ُ�I���j
'
' ������    :
'         -- SYSTEM����
'             pFileHandle                  - (i)�t�@�C���n���h��
'             pvc2LogMode                  - (i)�k�n�f���[�h
'             pvc2OutputMode               - (i)�o�̓��[�h
'             pvc2UserId                   - (i)���[�U�h�c
'             pvc2BusinessName             - (i)�Ɩ���
'             pvc2PlantCd                  - (i)�H��R�[�h
'         -- �Ɩ��ŗL
'             pvc2TaxId                    - (i)�ېŕ���
'             pnumTaxRate1                 - (i)�ŗ�1
'             pnumTaxRate2                 - (i)�ŗ�2
'             pnumTaxRate3                 - (i)�ŗ�3
'             pnumRoundTyp                 - (i)�[���敪
'             pnumDecimalFlg               - (i)��������
'             pnumAmountIn                 - (i)���z
'             pnumTaxAmount1               - (o)�Ŋz1
'             pnumTaxAmount2               - (o)�Ŋz2
'             pnumTaxAmount3               - (o)�Ŋz3
'             pnumTaxOutAmount             - (o)�Ŕ����z
'             pnumTaxAmount                - (o)����Ŋz
'             pnumTaxInAmount              - (o)�ō����z
'             pnumExternalTaxSalesAmount   - (o)�O�őΏۋ��z
'             pnumInternalTaxSalesAmount   - (o)���őΏۋ��z
'             pnumTaxFreeSalesAmount       - (o)��ېőΏۋ��z
'             pnumExternalTaxAmount        - (o)����Ŋz�i�O�Łj
'             pnumInternalTaxAmount        - (o)����Ŋz�i���Łj
'             pvc2ErrCd                    - (o)�G���[�R�[�h
'             pnumStatus                   - (o)���ʃX�e�[�^�X(1:����I���A2:�x���I���A3:�ُ�I��)
' �@�\����  :�ېŕ����A�ŗ������ɏ���Ōv�Z���s���B
'
' ���l      :
'
-----------------------------------------------------------------------------*/
    pFileHandle                 IN  UTL_FILE.FILE_TYPE  --�t�@�C���n���h��
   ,pvc2LogMode                 IN  VARCHAR2            --�k�n�f���[�h
   ,pvc2OutputMode              IN  VARCHAR2            --�o�̓��[�h
   ,pvc2UserId                  IN  VARCHAR2            --���[�U�h�c
   ,pvc2BusinessName            IN  VARCHAR2            --�Ɩ���
   ,pvc2PlantCd                 IN  VARCHAR2            --�H��R�[�h
   ,pvc2TaxId                   IN  VARCHAR2            --�ېŕ���
   ,pnumTaxRate1                IN  NUMBER              --�ŗ�1
   ,pnumTaxRate2                IN  NUMBER              --�ŗ�2
   ,pnumTaxRate3                IN  NUMBER              --�ŗ�3
   ,pnumRoundTyp                IN  NUMBER              --�[���敪
   ,pnumDecimalFlg              IN  NUMBER              --��������
   ,pnumAmountIn                IN  NUMBER              --���z
   ,pnumTaxAmount1              OUT NUMBER              --�Ŋz1
   ,pnumTaxAmount2              OUT NUMBER              --�Ŋz2
   ,pnumTaxAmount3              OUT NUMBER              --�Ŋz3
   ,pnumTaxOutAmount            OUT NUMBER              --�Ŕ����z
   ,pnumTaxAmount               OUT NUMBER              --����ŋ��z
   ,pnumTaxInAmount             OUT NUMBER              --�ō����z
   ,pnumExternalTaxSalesAmount  OUT NUMBER              --�O�őΏۋ��z
   ,pnumInternalTaxSalesAmount  OUT NUMBER              --���őΏۋ��z
   ,pnumTaxFreeSalesAmount      OUT NUMBER              --��ېőΏۋ��z
   ,pnumExternalTaxAmount       OUT NUMBER              --����Ŋz�i�O�Łj
   ,pnumInternalTaxAmount       OUT NUMBER              --����Ŋz�i���Łj
   ,pvc2ErrCd                   OUT VARCHAR2            --�G���[�R�[�h
   ,pnumStatus                  OUT NUMBER              --���ʃX�e�[�^�X
    ) RETURN BOOLEAN
IS

/* �萔�̐錾 */
    MY_SQL_NAME         VARCHAR2(64)     := 'FncCalcTaxCalcAmtFD';  --�o�k�^�r�p�k��

    ROUND_TYP_ROUND     NUMBER(1)        := 1;                   --�[�������敪(1:�l�̌ܓ�)
    ROUND_TYP_RAISE     NUMBER(1)        := 2;                   --�[�������敪(2:�؂�グ)
    ROUND_TYP_OMIT      NUMBER(1)        := 3;                   --�[�������敪(3:�؂�̂�)

    TAX_ID_TAXFREE      VARCHAR2(1)      := '0';                 --�ېŕ���(0:��ې�)
    TAX_ID_TAXEXTERNAL  VARCHAR2(1)      := '1';                 --�ېŕ���(1:�O��)
    TAX_ID_TAXINTERNAL  VARCHAR2(1)      := '5';                 --�ېŕ���(5:����)
    TAX_ID_TAXUSERDEF   VARCHAR2(1)      := '9';                 --�ېŕ���(9:���[�U��`)

    LOGMSG_START        VARCHAR2(20)     := 'Start';             --���O�p���\�b�h�J�n�錾
    LOGMSG_END          VARCHAR2(12)     := 'End';               --���O�p���\�b�h�I���錾
--  LOGMSG_FUNC_ERR     VARCHAR2(32)     := 'FuncErr';           --���O�p���\�b�h�֐��G���[�錾
--  LOGMSG_PARM_ERR     VARCHAR2(32)     := 'ParamErr';          --���O�p���\�b�h�p�����[�^�G���[�錾

    STATUS_NORMAL     CONSTANT   NUMBER(01)     := 1;  -- ����I��
    STATUS_WARNING    CONSTANT   NUMBER(01)     := 2;  -- �x���I��
    STATUS_ERROR      CONSTANT   NUMBER(01)     := 3;  -- �ُ�I��

    -- ���b�Z�[�W�R�[�h
    JF_COM_ERR_WRONG_VALUE                 VARCHAR(28)  := 'ZZ05105';               --�l���s���ł�
    JF_COM_ERR_NOT_FOUND_M_TAX             VARCHAR(28)  := 'ZZ11004';               --����ŋ敪�}�X�^�����݂��܂���
    JF_COM_ERR_ORACLE_ERROR                VARCHAR(28)  := 'AC53401';               --ORACLE�G���[

    TAX_CD_SIZE                   NUMBER(03)    := 3;        --����ŃR�[�h����

/* �ϐ��̐錾 WORK */
    blnRet                          BOOLEAN;
    numWkTaxAmount1                 NUMBER(18,4)     := 0;               --�Ŋz1
    numWkTaxAmount2                 NUMBER(18,4)     := 0;               --�Ŋz2
    numWkTaxAmount3                 NUMBER(18,4)     := 0;               --�Ŋz3
    numWkTaxOutAmount               NUMBER(18,4)     := 0;               --�Ŕ����z
    numWkTaxAmount                  NUMBER(18,4)     := 0;               --����ŋ��z
    numWkTaxInAmount                NUMBER(18,4)     := 0;               --�ō����z
    numWkExternalTaxSalesAmount     NUMBER(18,4)     := 0;               --�O�őΏۋ��z
    numWkInternalTaxSalesAmount     NUMBER(18,4)     := 0;               --���őΏۋ��z
    numWkTaxFreeSalesAmount         NUMBER(18,4)     := 0;               --��ېőΏۋ��z
    numWkExternalTaxAmount          NUMBER(18,4)     := 0;               --����Ŋz�i�O�Łj
    numWkInternalTaxAmount          NUMBER(18,4)     := 0;               --����Ŋz�i���Łj
    vc2WkErrCd                      VARCHAR2(28)     := NULL;            --�G���[�R�[�h
    numWKStatus                     NUMBER(1)        := STATUS_NORMAL;   --���ʃX�e�[�^�X

    intWKRecCnt                     INTEGER(11)      := 0;               --���R�[�h����

    -- ��O�̐錾
    excFnctionErr                EXCEPTION;          --�u�֐��v�G���[
    excParameterErr              EXCEPTION;          --�u�����v�G���[
--  excFncTraceLog               EXCEPTION;          --�g���[�X���O�o�̓G���[
--  excResultErr                 EXCEPTION;          --�v�Z���ʃG���[
--  excNotFound                  EXCEPTION;          --�}�X�^NOT FOUND

BEGIN
    pnumTaxAmount1                 :=  0;              --�Ŋz1
    pnumTaxAmount2                 :=  0;              --�Ŋz2
    pnumTaxAmount3                 :=  0;              --�Ŋz3
    pnumTaxOutAmount               :=  0;              --�Ŕ����z
    pnumTaxAmount                  :=  0;              --����ŋ��z
    pnumTaxInAmount                :=  0;              --�ō����z
    pnumExternalTaxSalesAmount     :=  0;              --�O�őΏۋ��z
    pnumInternalTaxSalesAmount     :=  0;              --���őΏۋ��z
    pnumTaxFreeSalesAmount         :=  0;              --��ېőΏۋ��z
    pnumExternalTaxAmount          :=  0;              --����Ŋz�i�O�Łj
    pnumInternalTaxAmount          :=  0;              --����Ŋz�i���Łj
    pnumStatus                     :=  STATUS_NORMAL;  --���ʃX�e�[�^�X
    pvc2ErrCd                      :=  NULL;           --�G���[�R�[�h

    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

    /* �����`�F�b�N */

   -- �ŗ�1 --
    IF (pnumTaxRate1 IS NULL) THEN  -- NULL
        RAISE excParameterErr;
    ELSIF pnumTaxRate1 = '' THEN    -- �󕶎�
       RAISE excParameterErr;
    END IF;

   -- �ŗ�2 --
    IF (pnumTaxRate2 IS NULL) THEN  -- NULL
        RAISE excParameterErr;
    ELSIF pnumTaxRate2 = '' THEN    -- �󕶎�
       RAISE excParameterErr;
    END IF;

   -- �ŗ�3 --
    IF (pnumTaxRate3 IS NULL) THEN  -- NULL
        RAISE excParameterErr;
    ELSIF pnumTaxRate3 = '' THEN    -- �󕶎�
       RAISE excParameterErr;
    END IF;

   -- �[���敪 --
    IF (pnumRoundTyp IS NULL) THEN  -- NULL
        RAISE excParameterErr;
    ELSIF pnumRoundTyp = '' THEN    -- �󕶎�
        RAISE excParameterErr;
    ELSIF pnumRoundTyp <> ROUND_TYP_ROUND        --�l�̌ܓ�
        AND pnumRoundTyp <> ROUND_TYP_RAISE      --�؂�グ
        AND pnumRoundTyp <> ROUND_TYP_OMIT THEN  --�؎̂�
        RAISE excParameterErr;
    END IF;

   -- �������� --
    IF (pnumDecimalFlg IS NULL) THEN  -- NULL
        RAISE excParameterErr;
    ELSIF pnumDecimalFlg = '' THEN    -- �󕶎�
        RAISE excParameterErr;
    END IF;

   -- ���z --
    IF (pnumAmountIn IS NULL) THEN  -- NULL
        RAISE excParameterErr;
    ELSIF pnumAmountIn = '' THEN    -- �󕶎�
        RAISE excParameterErr;
    END IF;

    -- �ېŕ��� --
    IF (pvc2TaxId IS NULL) THEN  -- NULL
        RAISE excParameterErr;
    ELSIF pvc2TaxId = '' THEN    -- �󕶎�
        RAISE excParameterErr;
    /* �Ōv�Z */
    ELSIF pvc2TaxId = TAX_ID_TAXFREE OR pvc2TaxId = TAX_ID_TAXUSERDEF THEN  /* ��ېŁE���[�U��` */
        numWkTaxOutAmount             := pnumAmountIn;                                  --�Ŕ����z
        numWkTaxAmount1               := 0;                                             --�Ŋz1
        numWkTaxAmount2               := 0;                                             --�Ŋz2
        numWkTaxAmount3               := 0;                                             --�Ŋz3
        numWkExternalTaxSalesAmount   := 0;                                             --�O�őΏۋ��z
        numWkInternalTaxSalesAmount   := 0;                                             --���őΏۋ��z
        numWkTaxFreeSalesAmount       := numWkTaxOutAmount;                             --��ېőΏۋ��z
        numWkExternalTaxAmount        := 0;                                             --����Ŋz�i�O�Łj
        numWkInternalTaxAmount        := 0;                                             --����Ŋz�i���Łj
        numWkTaxAmount                := 0;                                             --����ŋ��z
        numWkTaxInAmount              := numWkTaxOutAmount + numWkTaxAmount;            --�ō����z
    ELSIF pvc2TaxId = TAX_ID_TAXEXTERNAL THEN                               /* �O�� */
        numWkTaxOutAmount := pnumAmountIn;                                  --�Ŕ����z
        /* �Ŋz1 */
        blnRet := FncGetRound4FD(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              (pnumAmountIn * pnumTaxRate1) / 100, pnumDecimalFlg, pnumRoundTyp,
                              numWkTaxAmount1,
                              vc2WkErrCd, numWKStatus);                     --�Ŋz1(�[������)
        IF Not blnRet THEN  --�ُ�I��
            RAISE excFnctionErr;
        END IF;
        /* �Ŋz2 */
        blnRet := FncGetRound4FD(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              (pnumAmountIn * pnumTaxRate2) / 100, pnumDecimalFlg, pnumRoundTyp,
                              numWkTaxAmount2,
                              vc2WkErrCd, numWKStatus);                     --�Ŋz2(�[������)
        IF Not blnRet THEN  --�ُ�I��
            RAISE excFnctionErr;
        END IF;
        /* �Ŋz3 */
        blnRet := FncGetRound4FD(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              (pnumAmountIn * pnumTaxRate3) / 100, pnumDecimalFlg, pnumRoundTyp,
                              numWkTaxAmount3,
                              vc2WkErrCd, numWKStatus);                     --�Ŋz3(�[������)
        IF Not blnRet THEN  --�ُ�I��
            RAISE excFnctionErr;
        END IF;
        numWkExternalTaxSalesAmount   := numWkTaxOutAmount;                                     --�O�őΏۋ��z
        numWkInternalTaxSalesAmount   := 0;                                                     --���őΏۋ��z
        numWkTaxFreeSalesAmount       := 0;                                                     --��ېőΏۋ��z
        numWkExternalTaxAmount        := numWkTaxAmount1 + numWkTaxAmount2 + numWkTaxAmount3;   --����Ŋz�i�O�Łj
        numWkInternalTaxAmount        := 0;                                                     --����Ŋz�i���Łj
        numWkTaxAmount                := numWkExternalTaxAmount + numWkInternalTaxAmount;       --����ŋ��z
        numWkTaxInAmount              := numWkTaxOutAmount + numWkTaxAmount;                    --�ō����z
    ELSIF pvc2TaxId = TAX_ID_TAXINTERNAL THEN                               /* ���� */
        numWkTaxInAmount  := pnumAmountIn;                                  --�ō����z
        /* �Ŋz1 */
        blnRet := FncGetRound4FD(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              (pnumAmountIn * pnumTaxRate1) / (100 + pnumTaxRate1), pnumDecimalFlg, pnumRoundTyp,
                              numWkTaxAmount1,
                              vc2WkErrCd, numWKStatus);                     --�Ŋz1(�[������)
        IF Not blnRet THEN  --�ُ�I��
            RAISE excFnctionErr;
        END IF;
        /* �Ŋz2 */
        blnRet := FncGetRound4FD(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              (pnumAmountIn * pnumTaxRate2) / (100 + pnumTaxRate2), pnumDecimalFlg, pnumRoundTyp,
                              numWkTaxAmount2,
                              vc2WkErrCd, numWKStatus);                     --�Ŋz2(�[������)
        IF Not blnRet THEN  --�ُ�I��
            RAISE excFnctionErr;
        END IF;
        /* �Ŋz3 */
        blnRet := FncGetRound4FD(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              (pnumAmountIn * pnumTaxRate3) / (100 + pnumTaxRate3), pnumDecimalFlg, pnumRoundTyp,
                              numWkTaxAmount3,
                              vc2WkErrCd, numWKStatus);                     --�Ŋz3(�[������)
        IF Not blnRet THEN  --�ُ�I��
            RAISE excFnctionErr;
        END IF;
        numWkExternalTaxSalesAmount   := 0;                                                     --�O�őΏۋ��z
        numWkInternalTaxSalesAmount   := numWkTaxInAmount;                                      --���őΏۋ��z
        numWkTaxFreeSalesAmount       := 0;                                                     --��ېőΏۋ��z
        numWkExternalTaxAmount        := 0;                                                     --����Ŋz�i�O�Łj
        numWkInternalTaxAmount        := numWkTaxAmount1 + numWkTaxAmount2 + numWkTaxAmount3;   --����Ŋz�i���Łj
        numWkTaxAmount                := numWkExternalTaxAmount + numWkInternalTaxAmount;       --����ŋ��z
        numWkTaxOutAmount             := numWkTaxInAmount - numWkTaxAmount;                     --�Ŕ����z
    ELSE
        RAISE excParameterErr;
    END IF;

    /* �ԋp�l�̃Z�b�g */
    pnumTaxAmount1                    :=  numWkTaxAmount1;                --�Ŋz1
    pnumTaxAmount2                    :=  numWkTaxAmount2;                --�Ŋz2
    pnumTaxAmount3                    :=  numWkTaxAmount3;                --�Ŋz3
    pnumTaxOutAmount                  :=  numWkTaxOutAmount;              --�Ŕ����z
    pnumTaxAmount                     :=  numWkTaxAmount;                 --����ŋ��z
    pnumTaxInAmount                   :=  numWkTaxInAmount;               --�ō����z
    pnumExternalTaxSalesAmount        :=  numWkExternalTaxSalesAmount;    --�O�őΏۋ��z
    pnumInternalTaxSalesAmount        :=  numWkInternalTaxSalesAmount;    --���őΏۋ��z
    pnumTaxFreeSalesAmount            :=  numWkTaxFreeSalesAmount;        --��ېőΏۋ��z
    pnumExternalTaxAmount             :=  numWkExternalTaxAmount;         --����Ŋz�i�O�Łj
    pnumInternalTaxAmount             :=  numWkInternalTaxAmount;         --����Ŋz�i���Łj

    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    RETURN TRUE;

--< ��O���� >---------------------------------------------------------------
EXCEPTION
    WHEN excParameterErr THEN
        pnumTaxAmount1                 :=  0;                         --�Ŋz1
        pnumTaxAmount2                 :=  0;                         --�Ŋz2
        pnumTaxAmount3                 :=  0;                         --�Ŋz3
        pnumTaxOutAmount               :=  0;                         --�Ŕ����z
        pnumTaxAmount                  :=  0;                         --����ŋ��z
        pnumTaxInAmount                :=  0;                         --�ō����z
        pnumExternalTaxSalesAmount     :=  0;                         --�O�őΏۋ��z
        pnumInternalTaxSalesAmount     :=  0;                         --���őΏۋ��z
        pnumTaxFreeSalesAmount         :=  0;                         --��ېőΏۋ��z
        pnumExternalTaxAmount          :=  0;                         --����Ŋz�i�O�Łj
        pnumInternalTaxAmount          :=  0;                         --����Ŋz�i���Łj
        pnumStatus                     := STATUS_ERROR;               --���ʃX�e�[�^�X
        pvc2ErrCd                      := JF_COM_ERR_WRONG_VALUE;     --�G���[�R�[�h
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        RETURN FALSE;
/*    WHEN NO_DATA_FOUND THEN
        pnumTaxAmount1                 :=  0;                         --�Ŋz1
        pnumTaxAmount2                 :=  0;                         --�Ŋz2
        pnumTaxAmount3                 :=  0;                         --�Ŋz3
        pnumTaxOutAmount               :=  0;                         --�Ŕ����z
        pnumTaxAmount                  :=  0;                         --����ŋ��z
        pnumTaxInAmount                :=  0;                         --�ō����z
        pnumExternalTaxSalesAmount     :=  0;                         --�O�őΏۋ��z
        pnumInternalTaxSalesAmount     :=  0;                         --���őΏۋ��z
        pnumTaxFreeSalesAmount         :=  0;                         --��ېőΏۋ��z
        pnumExternalTaxAmount          :=  0;                         --����Ŋz�i�O�Łj
        pnumInternalTaxAmount          :=  0;                         --����Ŋz�i���Łj
        pnumStatus                     := STATUS_ERROR;               --���ʃX�e�[�^�X
        pvc2ErrCd                      := JF_COM_ERR_NOT_FOUND_M_TAX; --�G���[�R�[�h
        -- TraceLog �̏o�� --
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        RETURN FALSE; */
    WHEN excFnctionErr THEN
        pnumTaxAmount1                 :=  0;                         --�Ŋz1
        pnumTaxAmount2                 :=  0;                         --�Ŋz2
        pnumTaxAmount3                 :=  0;                         --�Ŋz3
        pnumTaxOutAmount               :=  0;                         --�Ŕ����z
        pnumTaxAmount                  :=  0;                         --����ŋ��z
        pnumTaxInAmount                :=  0;                         --�ō����z
        pnumExternalTaxSalesAmount     :=  0;                         --�O�őΏۋ��z
        pnumInternalTaxSalesAmount     :=  0;                         --���őΏۋ��z
        pnumTaxFreeSalesAmount         :=  0;                         --��ېőΏۋ��z
        pnumExternalTaxAmount          :=  0;                         --����Ŋz�i�O�Łj
        pnumInternalTaxAmount          :=  0;                         --����Ŋz�i���Łj
        pnumStatus                     := STATUS_ERROR;               --���ʃX�e�[�^�X
        pvc2ErrCd                      := vc2WkErrCd;                 --�G���[�R�[�h
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        RETURN FALSE;
    WHEN OTHERS THEN
        pnumTaxAmount1                 :=  0;                         --�Ŋz1
        pnumTaxAmount2                 :=  0;                         --�Ŋz2
        pnumTaxAmount3                 :=  0;                         --�Ŋz3
        pnumTaxOutAmount               :=  0;                         --�Ŕ����z
        pnumTaxAmount                  :=  0;                         --����ŋ��z
        pnumTaxInAmount                :=  0;                         --�ō����z
        pnumExternalTaxSalesAmount     :=  0;                         --�O�őΏۋ��z
        pnumInternalTaxSalesAmount     :=  0;                         --���őΏۋ��z
        pnumTaxFreeSalesAmount         :=  0;                         --��ېőΏۋ��z
        pnumExternalTaxAmount          :=  0;                         --����Ŋz�i�O�Łj
        pnumInternalTaxAmount          :=  0;                         --����Ŋz�i���Łj
        pnumStatus                     := STATUS_ERROR;               --���ʃX�e�[�^�X
        pvc2ErrCd                      := JF_COM_ERR_ORACLE_ERROR;    --�G���[�R�[�h
        /* ErrorLog �̏o�� */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, SQLCODE, SQLERRM);
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        RETURN FALSE;
END;
/
