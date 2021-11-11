CREATE OR REPLACE FUNCTION FNCCURRENCYCONVERT(
/*------------------------------------------------------------------------------
' $Id: FncCurrencyConvert.sql,v 1.2 2005/10/24 06:30:48 kamata Exp $
' $Revision: 1.2 $

' �C������  2005.10.21 unicode�Ή��ivarchar2��4�{�j
'
' �@�\      : ���̓p�����[�^�����Ɉȉ��̏������s���܂��B
'             (1)�O�݁i�����j�̋��z���A�M�݁i���Ёj�̒ʉ݋��z�ɕϊ�����
'                �܂��́A�M�݁i���Ёj�̋��z���A�O�݁i�����j�̒ʉ݋��z�ɕϊ�����
'             (2)�w�肵������您��сA���Ђ̒ʉݏ��A�ב֏����o�͂���B
'
' �߂�l    : Boolean
'               True :����I��
'               False:�ُ�I��
'
' ������    : pFileHandle          - (i)�t�@�C���n���h��
'             pvc2LogMode          - (i)�k�n�f���[�h
'             pvc2OutputMode       - (i)�o�̓��[�h
'             pvc2UserId           - (i)���[�U�h�c
'             pvc2BusinessName     - (i)�Ɩ���
'             pvc2PlantCd          - (i)�H��R�[�h
'             pvc2CompanyCd        - (i)��ЃR�[�h
'             pvc2VendCd           - (i)�����R�[�h
'             pdtmRateJudgeDate    - (i)���[�g�����
'             pvc2ExchReserveCd    - (i)�ב֗\��R�[�h
'             pnumBeforeAmount     - (i)�ϊ��O���z
'             pnumConvertTyp       - (i)�ϊ�����
'             pnumAfterAmount      - (o)�ϊ�����z
'             pnumRoundTyp         - (o)�[�������敪
'             pnumExchRate         - (o)�בփ��[�g
'             pnumExchTyp          - (o)�ב֎��
'             pvc2VendCurCd        - (o)�����ʉ݃R�[�h
'             pvc2VendCurName      - (o)�����ʉݖ�
'             pvc2VendCurSymbol    - (o)�����ʉ݋L��
'             pvc2VendCurUnit      - (o)�����ʉݒP��
'             pnumVendDecimalFig   - (o)����揬������
'             pvc2HomeCurCd        - (o)���Ёi�M�݁j�ʉ݃R�[�h
'             pvc2HomeCurName      - (o)���Ёi�M�݁j�ʉݖ�
'             pvc2HomeCurSymbol    - (o)���Ёi�M�݁j�ʉ݋L��
'             pvc2HomeCurUnit      - (o)���Ёi�M�݁j�ʉݒP��
'             pnumHomeDecimalFig   - (o)���Ёi�M�݁j��������
'             pvc2ErrorCd          - (o)�G���[�R�[�h
'
' ���l      :
'
------------------------------------------------------------------------------*/
    pFileHandle         IN  UTL_FILE.FILE_TYPE  --�t�@�C���n���h��
   ,pvc2LogMode         IN  VARCHAR2            --�k�n�f���[�h
   ,pvc2OutputMode      IN  VARCHAR2            --�o�̓��[�h
   ,pvc2UserId          IN  VARCHAR2            --���[�U�h�c
   ,pvc2BusinessName    IN  VARCHAR2            --�Ɩ���
   ,pvc2PlantCd         IN  VARCHAR2            --�H��R�[�h
   ,pvc2CompanyCd       IN  VARCHAR2            --��ЃR�[�h
   ,pvc2VendCd          IN  VARCHAR2            --�����R�[�h
   ,pdtmRateJudgeDate   IN  DATE                --���[�g�����
   ,pvc2ExchReserveCd   IN  VARCHAR2            --�ב֗\��R�[�h
   ,pnumBeforeAmount    IN  NUMBER              --�ϊ��O���z
   ,pnumConvertTyp      IN  NUMBER              --�ϊ�����
   ,pnumAfterAmount     OUT NUMBER              --�ϊ�����z
   ,pnumRoundTyp        OUT NUMBER              --�[�������敪
   ,pnumExchRate        OUT NUMBER              --�בփ��[�g
   ,pnumExchTyp         OUT NUMBER              --�ב֎��
   ,pvc2VendCurCd       OUT VARCHAR2            --�����ʉ݃R�[�h
   ,pvc2VendCurName     OUT VARCHAR2            --�����ʉݖ�
   ,pvc2VendCurSymbol   OUT VARCHAR2            --�����ʉ݋L��
   ,pvc2VendCurUnit     OUT VARCHAR2            --�����ʉݒP��
   ,pnumVendDecimalFig  OUT NUMBER              --����揬������
   ,pvc2HomeCurCd       OUT VARCHAR2            --���Ёi�M�݁j�ʉ݃R�[�h
   ,pvc2HomeCurName     OUT VARCHAR2            --���Ёi�M�݁j�ʉݖ�
   ,pvc2HomeCurSymbol   OUT VARCHAR2            --���Ёi�M�݁j�ʉ݋L��
   ,pvc2HomeCurUnit     OUT VARCHAR2            --���Ёi�M�݁j�ʉݒP��
   ,pnumHomeDecimalFig  OUT NUMBER              --���Ёi�M�݁j��������
   ,pvc2ErrorCd         OUT VARCHAR2            --�G���[�R�[�h
    ) RETURN BOOLEAN
IS

-----------------
-- CONST�l�錾 --
-----------------
    MY_SQL_NAME         VARCHAR2(72)    := 'FncCurrencyConvert';--�o�k�^�r�p�k��
    LOGMSG_START        VARCHAR2(20)     := 'Start';             --���O�p���\�b�h�J�n�錾
    LOGMSG_END          VARCHAR2(12)     := 'End';               --���O�p���\�b�h�I���錾

    

--------------
-- WORK�ϐ� --
--------------
    blnRet              BOOLEAN;        -- �`�F�b�N����

BEGIN

    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

    -- �f�t�H���g�l�ݒ�
    pnumAfterAmount := 0;
    pnumRoundTyp := 0;
    pnumExchRate := 0;
    pnumExchTyp := 0;
    pvc2VendCurCd := NULL;
    pvc2VendCurName := NULL;
    pvc2VendCurSymbol := NULL;
    pvc2VendCurUnit := NULL;
    pnumVendDecimalFig := 0;
    pvc2HomeCurCd := NULL;
    pvc2HomeCurName := NULL;
    pvc2HomeCurSymbol := NULL;
    pvc2HomeCurUnit := NULL;
    pnumHomeDecimalFig := 0;
    pvc2ErrorCd := NULL;

    --Null�`�F�b�N
    IF pvc2CompanyCd IS NULL THEN
        pvc2ErrorCd := 'ZZ02011';
        RETURN FALSE;
    END IF;
    IF pvc2VendCd IS NULL THEN
        pvc2ErrorCd := 'ZZ02012';
        RETURN FALSE;
    END IF;
    IF pdtmRateJudgeDate IS NULL THEN
        pvc2ErrorCd := 'ZZ02013';
        RETURN FALSE;
    END IF;
    IF pnumBeforeAmount IS NULL THEN
        pvc2ErrorCd := 'ZZ02014';
        RETURN FALSE;
    END IF;

    IF (pnumConvertTyp <= 0) OR (pnumConvertTyp > 2) THEN 
        pvc2ErrorCd := 'ZZ02015';
        RETURN FALSE;
    END IF;

    -- �M�݃}�X�^����
    BEGIN
        SELECT
          SYS_HOME_CUR.HOME_CUR_CD
        INTO
          pvc2HomeCurCd
        FROM
          SYS_HOME_CUR
        WHERE
          SYS_HOME_CUR.CTRL_CD = 'SYSTEM'
        ;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            pvc2ErrorCd := 'ZZ02022';
            RETURN FALSE;
    END;

    -- �ʉ݃}�X�^
    BEGIN
        SELECT
          M_CUR.CUR_CD,
          M_CUR.CUR_NAME,
          M_CUR.CUR_SYMBOL,
          M_CUR.CUR_UNIT,
          M_CUR.DECIMAL_FIG
        INTO
          pvc2HomeCurCd,
          pvc2HomeCurName,
          pvc2HomeCurSymbol,
          pvc2HomeCurUnit,
          pnumHomeDecimalFig
        FROM
          M_CUR
        WHERE
          M_CUR.CUR_CD = pvc2HomeCurCd
        ;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            pvc2ErrorCd := 'ZZ02023';
            RETURN FALSE;
    END;

    -- �����}�X�^
    BEGIN
        SELECT
          M_VEND_CTRL.CUR_CD, 
          M_VEND_CTRL.EXCH_TYP,
          M_VEND_CTRL.ROUND_TYP
        INTO 
          pvc2VendCurCd,
          pnumExchTyp,
          pnumRoundTyp
        FROM
          M_VEND_CTRL
        WHERE
          M_VEND_CTRL.COMPANY_CD = pvc2CompanyCd
          and M_VEND_CTRL.VEND_CD = pvc2VendCd
        ;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            pvc2ErrorCd := 'ZZ02021';
            RETURN FALSE;
    END;

    IF (pnumExchTyp = 2) AND (pvc2ExchReserveCd IS NULL) THEN
            pvc2ErrorCd := 'ZZ02031';
            RETURN FALSE;
    END IF;


    IF (pvc2VendCurCd IS NULL) OR (pvc2VendCurCd = pvc2HomeCurCd) THEN
        pvc2VendCurCd      := pvc2HomeCurCd;
        pvc2VendCurName    := pvc2HomeCurName;
        pvc2VendCurSymbol  := pvc2HomeCurSymbol;
        pvc2VendCurUnit    := pvc2HomeCurUnit;
        pnumVendDecimalFig := pnumHomeDecimalFig;
        pnumAfterAmount    := pnumBeforeAmount;
        pnumExchRate       := 1;
    ELSE
        -- �����̒ʉ݃}�X�^��������
        BEGIN
            SELECT
              M_CUR.CUR_CD,
              M_CUR.CUR_NAME,
              M_CUR.CUR_SYMBOL,
              M_CUR.CUR_UNIT,
              M_CUR.DECIMAL_FIG
            INTO
              pvc2VendCurCd,
              pvc2VendCurName,
              pvc2VendCurSymbol,
              pvc2VendCurUnit,
              pnumVendDecimalFig
            FROM
              M_CUR
            WHERE
              M_CUR.CUR_CD = pvc2VendCurCd;
        EXCEPTION
            WHEN NO_DATA_FOUND THEN
            pvc2ErrorCd := 'ZZ02023';
                RETURN FALSE;
        END;

        -- �בփ��[�g��������
        BEGIN
            SELECT
              M_EXCH_RATE.EXCH_RATE
            INTO
              pnumExchRate
            FROM
              M_EXCH_RATE,
              (
                SELECT
                  M_EXCH_RATE.COMPANY_CD as COMPANY_CD,
                  M_EXCH_RATE.CUR_CD as CUR_CD,
                  M_EXCH_RATE.EXCH_TYP as EXCH_TYP,
                  M_EXCH_RATE.EXCH_RESERVE_CD as EXCH_RESERVE_CD,
                  max(M_EXCH_RATE.EXCH_START_DATE) as MAX_EXCH_START_DATE
                FROM
                  M_EXCH_RATE
                WHERE
                  M_EXCH_RATE.COMPANY_CD = pvc2CompanyCd
                  and M_EXCH_RATE.CUR_CD = pvc2VendCurCd
                  and M_EXCH_RATE.EXCH_TYP = pnumExchTyp
                  and (M_EXCH_RATE.EXCH_TYP != 2 or M_EXCH_RATE.EXCH_RESERVE_CD = pvc2ExchReserveCd)
                  and M_EXCH_RATE.EXCH_START_DATE <= pdtmRateJudgeDate
                group by
                  M_EXCH_RATE.COMPANY_CD,
                  M_EXCH_RATE.CUR_CD,
                  M_EXCH_RATE.EXCH_TYP,
                  M_EXCH_RATE.EXCH_RESERVE_CD
              ) T1
            WHERE
              M_EXCH_RATE.COMPANY_CD = T1.COMPANY_CD
              and M_EXCH_RATE.CUR_CD = T1.CUR_CD
              and M_EXCH_RATE.EXCH_TYP = T1.EXCH_TYP
              and (M_EXCH_RATE.EXCH_TYP != 2 or M_EXCH_RATE.EXCH_RESERVE_CD = T1.EXCH_RESERVE_CD)
              and M_EXCH_RATE.EXCH_START_DATE = T1.MAX_EXCH_START_DATE
            ;
        EXCEPTION
            WHEN NO_DATA_FOUND THEN
            pvc2ErrorCd := 'ZZ02024';
                RETURN FALSE;
        END;
    END IF;

    -- �M�݊��Z
    IF (pnumConvertTyp IS NULL) OR (pnumConvertTyp = 1) THEN
        pnumAfterAmount := pnumBeforeAmount * pnumExchRate;
        FOR i IN 1..pnumHomeDecimalFig LOOP
            pnumAfterAmount := pnumAfterAmount * 10;
        END LOOP;
        IF pnumRoundTyp = 2 THEN
            pnumAfterAmount := CEIL(pnumAfterAmount);
        ELSIF pnumRoundTyp = 3 THEN
            pnumAfterAmount := FLOOR(pnumAfterAmount);
        ELSE
            pnumAfterAmount := ROUND(pnumAfterAmount);
        END IF;
        FOR i IN 1..pnumHomeDecimalFig LOOP
            pnumAfterAmount := pnumAfterAmount / 10;
        END LOOP;
    ELSE
        pnumAfterAmount := pnumBeforeAmount / pnumExchRate;
        FOR i IN 1..pnumVendDecimalFig LOOP
            pnumAfterAmount := pnumAfterAmount * 10;
        END LOOP;
        IF pnumRoundTyp = 2 THEN
            pnumAfterAmount := CEIL(pnumAfterAmount);
        ELSIF pnumRoundTyp = 3 THEN
            pnumAfterAmount := FLOOR(pnumAfterAmount);
        ELSE
            pnumAfterAmount := ROUND(pnumAfterAmount);
        END IF;
        FOR i IN 1..pnumVendDecimalFig LOOP
            pnumAfterAmount := pnumAfterAmount / 10;
        END LOOP;
    END IF;

    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    RETURN TRUE;    -- ����I��

--< ��O���� >---------------------------------------------------------------
EXCEPTION
    WHEN OTHERS THEN
        /* ErrorLog �̏o�� */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, SQLCODE, SQLERRM);
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        
        pvc2ErrorCd := 'ZZ02099';
        RETURN FALSE;
END;
/