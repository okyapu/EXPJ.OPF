CREATE OR REPLACE FUNCTION FncGetCtrlDate4ARAP(
/*------------------------------------------------------------------------------
'
' FncGetCtrlDate4ARAP.Sql
'
' �C������  2004.07.01 �V�K�쐬
'           2005.10.20 unicode�Ή�(varchar2��4�{)
'
' �@�\      : �����Ȃǂ̏����擾����
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
'             pvc2InDate           - (i)�N��
'             pnumTerm             - (o)����
'             pnumYear             - (o)�N�x
'             pdtmTermStartDate    - (o)���̊J�n�N����
'             pdtmTermEndDate      - (o)���̏I���N����
'             pnumYearMonth        - (o)�N���x
'             pdtmMonthStartDate   - (o)�N���x�̊J�n�N����
'             pdtmMonthEndDate     - (o)�N���x�̏I���N����
'             pnumTableNo          - (o)���x�e�[�u��No.
'
' �@�\����  : �u�N���v���Y������u�����ԃ}�X�^�v�̏����擾����B
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
   ,pvc2InDate          IN  VARCHAR2            --�N��
   ,pnumTerm            OUT NUMBER              --����
   ,pnumYear            OUT NUMBER              --�N�x
   ,pdtmTermStartDate   OUT DATE                --���̊J�n�N����
   ,pdtmTermEndDate     OUT DATE                --���̏I���N����
   ,pnumYearMonth       OUT NUMBER              --�N���x
   ,pdtmMonthStartDate  OUT DATE                --�N���x�̊J�n�N����
   ,pdtmMonthEndDate    OUT DATE                --�N���x�̏I���N����
   ,pnumTableNo         OUT NUMBER              --���x�e�[�u��No.
) RETURN BOOLEAN
IS

/* �萔�̐錾 */
    MY_SQL_NAME             CONSTANT VARCHAR2(120)  := 'FncGetCtrlDate4ARAP';     --�o�k�^�r�p�k��

    LOGMSG_START            CONSTANT VARCHAR2(20)   := 'Start';                 --���O�p���\�b�h�J�n�錾
    LOGMSG_END              CONSTANT VARCHAR2(12)   := 'End';                   --���O�p���\�b�h�I���錾

    ACTION_TYP_DATE         CONSTANT NUMBER(2)     := 0;                       --�N��������
    ACTION_TYP_YAERMONTH    CONSTANT NUMBER(2)     := 1;                       --�N������

    ERRCD_NOTEXIST_DATA     CONSTANT VARCHAR2(28)   := 'BZ00174';    --�Ώۃf�[�^�����݂��܂���
    ERRCD_CECD_ERRNO        CONSTANT VARCHAR2(28)   := 'BZ00175';    --�A�N�V�����G���[
    ERRCD_DATE_FORMAT_ERR   CONSTANT VARCHAR2(28)   := 'BZ00176';    --���t�̒l���s���ł�

/* EXCEPTION �̐錾 */
    excFNC_PARAMETER_ERR         EXCEPTION;      --���̓p�����[�^�G���[
    excFNC_MST_NODATA            EXCEPTION;      --�}�X�^�Ȃ��G���[
    excFNC_M_ACC_TERM_PERIOD_ERR EXCEPTION;      --�����ԃ}�X�^�G���[

/* �ϐ��̐錾 SQL  */
--  ���R���g���[�� (M_ACC_TERM)
    vc2STM_CompnayCd        VARCHAR2(100);   --��ЃR�[�h
    numSTM_Year             NUMBER(4);      --�N
    numSTM_Term             NUMBER(6);      --��
    dtmSTM_TurnDate1        DATE;           --�ύX�J�n�N�����P
    numSTM_TurnYearMonth1   NUMBER(6);      --�ύX�J�n���x�P
    numSTM_TurnTerm1        NUMBER(6);      --�ύX���P
    dtmSTM_TurnDate2        DATE;           --�ύX�J�n�N�����Q
    numSTM_TurnYearMonth2   NUMBER(6);      --�ύX�J�n���x�Q
    numSTM_TurnTerm2        NUMBER(6);      --�ύX���Q

--  �����ԃ}�X�^ (M_ACC_TERM_PERIOD)
    vc2SDT_CompanyCd        VARCHAR2(100);   --��ЃR�[�h
    numSDT_TERM             NUMBER(4);      --��
    numSDT_YearMonth1       NUMBER(6);      --�N���x�P
    dtmSDT_StartDate1       DATE;           --�J�n�N�����P
    dtmSDT_EndDate1         DATE;           --�I���N�����P
    numSDT_YearMonth2       NUMBER(6);      --�N���x�Q
    dtmSDT_StartDate2       DATE;           --�J�n�N�����Q
    dtmSDT_EndDate2         DATE;           --�I���N�����Q
    numSDT_YearMonth3       NUMBER(6);      --�N���x�R
    dtmSDT_StartDate3       DATE;           --�J�n�N�����R
    dtmSDT_EndDate3         DATE;           --�I���N�����R
    numSDT_YearMonth4       NUMBER(6);      --�N���x�S
    dtmSDT_StartDate4       DATE;           --�J�n�N�����S
    dtmSDT_EndDate4         DATE;           --�I���N�����S
    numSDT_YearMonth5       NUMBER(6);      --�N���x�T
    dtmSDT_StartDate5       DATE;           --�J�n�N�����T
    dtmSDT_EndDate5         DATE;           --�I���N�����T
    numSDT_YearMonth6       NUMBER(6);      --�N���x�U
    dtmSDT_StartDate6       DATE;           --�J�n�N�����U
    dtmSDT_EndDate6         DATE;           --�I���N�����U
    numSDT_YearMonth7       NUMBER(6);      --�N���x�V
    dtmSDT_StartDate7       DATE;           --�J�n�N�����V
    dtmSDT_EndDate7         DATE;           --�I���N�����V
    numSDT_YearMonth8       NUMBER(6);      --�N���x�W
    dtmSDT_StartDate8       DATE;           --�J�n�N�����W
    dtmSDT_EndDate8         DATE;           --�I���N�����W
    numSDT_YearMonth9       NUMBER(6);      --�N���x�X
    dtmSDT_StartDate9       DATE;           --�J�n�N�����X
    dtmSDT_EndDate9         DATE;           --�I���N�����X
    numSDT_YearMonth10      NUMBER(6);      --�N���x�P�O
    dtmSDT_StartDate10      DATE;           --�J�n�N�����P�O
    dtmSDT_EndDate10        DATE;           --�I���N�����P�O
    numSDT_YearMonth11      NUMBER(6);      --�N���x�P�P
    dtmSDT_StartDate11      DATE;           --�J�n�N�����P�P
    dtmSDT_EndDate11        DATE;           --�I���N�����P�P
    numSDT_YearMonth12      NUMBER(6);      --�N���x�P�Q
    dtmSDT_StartDate12      DATE;           --�J�n�N�����P�Q
    dtmSDT_EndDate12        DATE;           --�I���N�����P�Q
    numSDT_Year             NUMBER(4);      --�N�x

/* �ϐ��̐錾 WORK */
    numAction               NUMBER(2);
    numInDateLen            NUMBER;          --���͓��t��
    dtmInDate               DATE;
    numTerm                 NUMBER(6);       --��
    numYear                 NUMBER(4);       --�N
    numYearMonth            NUMBER(6);       --�N���x
    vc2YearMonth            VARCHAR2(24);     --�N���x
    blnRet                  BOOLEAN;         --�ԋp�l
    blnContents             BOOLEAN;         --���t�t�H�[�}�b�g�`�F�b�N�t���O

/*�v�Z�p���[�N*/

/*�G���[�p���[�N*/

BEGIN

    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, 'Input CompanyCd:' || pvc2CompanyCd || ' InDate:' || pvc2InDate);

    pnumTerm           := 0;       --����
    pnumYear           := 0;       --�N�x
    pdtmTermStartDate  := NULL;    --���̊J�n�N����
    pdtmTermEndDate    := NULL;    --���̏I���N����
    pnumYearMonth      := 0;       --�N���x
    pdtmMonthStartDate := NULL;    --�N���x�̊J�n�N����
    pdtmMonthEndDate   := NULL;    --�N���x�̏I���N����
    pnumTableNo        := 0;       --���x�e�[�u��No.

    numInDateLen := LENGTHB(pvc2InDate);
    IF numInDateLen = 10 THEN
        numAction := ACTION_TYP_DATE;
    ELSIF numInDateLen = 6 THEN
        numAction := ACTION_TYP_YAERMONTH;
    ELSE
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, ERRCD_CECD_ERRNO, 'Input Date Format Error' || pvc2InDate);

        RAISE excFNC_PARAMETER_ERR;
    END IF;

    IF numAction = ACTION_TYP_DATE THEN
        DECLARE --�N��������t�^�ɕϊ�����
        BEGIN
            dtmInDate := TO_DATE(pvc2InDate || '00:00:00', 'yyyy/mm/dd HH24:MI:SS');
            blnContents := FALSE;

        EXCEPTION
            WHEN OTHERS THEN
                blnContents := TRUE;
        END;
    ELSE
        DECLARE --�N���𐔒l�^�ɕϊ�����
        BEGIN
            numYearMonth := TO_NUMBER(pvc2InDate);
            blnContents := FALSE;

        EXCEPTION
            WHEN OTHERS THEN
                blnContents := TRUE;
        END;
    END IF;

    IF blnContents THEN
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, ERRCD_DATE_FORMAT_ERR, 'Input Date Contents Error' || pvc2InDate);

        RAISE excFNC_PARAMETER_ERR;
    END IF;

    -- ��ЃR�[�h�̃`�F�b�N
    IF (pvc2CompanyCd IS NULL)      OR
       (LENGTHB(pvc2CompanyCd) = 0) THEN

        RAISE excFNC_PARAMETER_ERR;
    END IF;

    /* �N�𐔒l�ɕϊ����� */
    numYear := TO_NUMBER(SUBSTR(pvc2InDate,1,4));

    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, 'COMPANY_CD:' || pvc2CompanyCd || ' YEAR:' || TO_CHAR(numYear));

    /* ���R���g���[���擾 */
    BEGIN
        SELECT  COMPANY_CD,YEAR,TERM,
                TURN_DATE_1,TURN_YEAR_MONTH_1,TURN_TERM_1,
                TURN_DATE_2,TURN_YEAR_MONTH_2,TURN_TERM_2
          INTO  vc2STM_CompnayCd,numSTM_Year,numSTM_Term,
                dtmSTM_TurnDate1,numSTM_TurnYearMonth1,numSTM_TurnTerm1,
                dtmSTM_TurnDate2,numSTM_TurnYearMonth2,numSTM_TurnTerm2
          FROM  M_ACC_TERM
         WHERE  COMPANY_CD = pvc2CompanyCd AND
                YEAR       = numYear;

    EXCEPTION
--      ���R���g���[���Ȃ�
        WHEN NO_DATA_FOUND THEN
            /* ErrorLog �̏o�� */
            blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                MY_SQL_NAME, ERRCD_NOTEXIST_DATA, 'M_ACC_TERM COMPANY_CD:' || pvc2CompanyCd || ' YEAR:' || TO_CHAR(numYear));

            RAISE excFNC_MST_NODATA;
    END;

    /* ���������߂� */
    /* �N�������̏��� */
    IF numAction = ACTION_TYP_DATE THEN
        IF (dtmSTM_TurnDate1 IS NULL)     OR
           (dtmInDate < dtmSTM_TurnDate1) THEN
            numTerm := numSTM_Term;
        ELSE
            IF dtmSTM_TurnDate2 IS NULL THEN
                numTerm := numSTM_TurnTerm1;
            ELSE
                IF (dtmSTM_TurnDate1 <= dtmInDate)   AND
                   (dtmInDate < dtmSTM_TurnDate2)    THEN
                    numTerm := numSTM_TurnTerm1;
                ELSE
                    numTerm := numSTM_TurnTerm2;
                END IF;
            END IF;
        END IF;
    /* �N�����̏��� */
    ELSE
        IF (numYearMonth < numSTM_TurnYearMonth1) OR
           (numSTM_TurnYearMonth1 = 0)                   THEN
            numTerm := numSTM_Term;
        ELSE
            IF numSTM_TurnYearMonth2 = 0    THEN
                numTerm := numSTM_TurnTerm1;
            ELSE
                IF (numSTM_TurnYearMonth1 <= pvc2InDate) AND
                   (numYearMonth < numSTM_TurnYearMonth2)  THEN
                    numTerm := numSTM_TurnTerm1;
                ELSE
                    numTerm := numSTM_TurnTerm2;
                END IF;
            END IF;
        END IF;
    END IF;

    pnumTerm := numTerm;

    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, 'COMPANY_CD:' || pvc2CompanyCd || ' TERM:' || TO_CHAR(numTerm));

    /* ���t�R���g���[���擾 */
    BEGIN
        SELECT COMPANY_CD,TERM,
               YEAR_MONTH_1 ,START_DATE_1 ,END_DATE_1,
               YEAR_MONTH_2 ,START_DATE_2 ,END_DATE_2,
               YEAR_MONTH_3 ,START_DATE_3 ,END_DATE_3,
               YEAR_MONTH_4 ,START_DATE_4 ,END_DATE_4,
               YEAR_MONTH_5 ,START_DATE_5 ,END_DATE_5,
               YEAR_MONTH_6 ,START_DATE_6 ,END_DATE_6,
               YEAR_MONTH_7 ,START_DATE_7 ,END_DATE_7,
               YEAR_MONTH_8 ,START_DATE_8 ,END_DATE_8,
               YEAR_MONTH_9 ,START_DATE_9 ,END_DATE_9,
               YEAR_MONTH_10,START_DATE_10,END_DATE_10,
               YEAR_MONTH_11,START_DATE_11,END_DATE_11,
               YEAR_MONTH_12,START_DATE_12,END_DATE_12, YEAR
          INTO vc2SDT_CompanyCd,numSDT_TERM,
               numSDT_YearMonth1 ,dtmSDT_StartDate1 ,dtmSDT_EndDate1,
               numSDT_YearMonth2 ,dtmSDT_StartDate2 ,dtmSDT_EndDate2,
               numSDT_YearMonth3 ,dtmSDT_StartDate3 ,dtmSDT_EndDate3,
               numSDT_YearMonth4 ,dtmSDT_StartDate4 ,dtmSDT_EndDate4,
               numSDT_YearMonth5 ,dtmSDT_StartDate5 ,dtmSDT_EndDate5,
               numSDT_YearMonth6 ,dtmSDT_StartDate6 ,dtmSDT_EndDate6,
               numSDT_YearMonth7 ,dtmSDT_StartDate7 ,dtmSDT_EndDate7,
               numSDT_YearMonth8 ,dtmSDT_StartDate8 ,dtmSDT_EndDate8,
               numSDT_YearMonth9 ,dtmSDT_StartDate9 ,dtmSDT_EndDate9,
               numSDT_YearMonth10,dtmSDT_StartDate10,dtmSDT_EndDate10,
               numSDT_YearMonth11,dtmSDT_StartDate11,dtmSDT_EndDate11,
               numSDT_YearMonth12,dtmSDT_StartDate12,dtmSDT_EndDate12, numSDT_Year
            FROM M_ACC_TERM_PERIOD
            WHERE COMPANY_CD = pvc2CompanyCd AND
                  TERM       = numTerm;

    EXCEPTION
--      �����ԃ}�X�^�Ȃ�
        WHEN NO_DATA_FOUND THEN
            /* ErrorLog �̏o�� */
            blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                MY_SQL_NAME, ERRCD_NOTEXIST_DATA, 'M_ACC_TERM_PERIOD COMPANY_CD:' || pvc2CompanyCd || ' TERM:' || numTerm);

            RAISE excFNC_MST_NODATA;
    END;

    /* �N�������̏����̏ꍇ�A�N���x�𐔒l�ɕϊ����� */
    IF numAction = ACTION_TYP_DATE THEN
        vc2YearMonth := SUBSTR(pvc2InDate,1,4);
        vc2YearMonth := vc2YearMonth || SUBSTR(pvc2InDate,6,2);
        numYearMonth := TO_NUMBER(vc2YearMonth);
    END IF;

    /* ���̊J�n�N���� */
    pdtmTermStartDate := dtmSDT_StartDate1;

    /* ���̏I���N���� */
    IF dtmSDT_EndDate12 IS NOT NULL THEN
        pdtmTermEndDate := dtmSDT_EndDate12;
    ELSIF dtmSDT_EndDate11 IS NOT NULL THEN
        pdtmTermEndDate := dtmSDT_EndDate11;
    ELSIF dtmSDT_EndDate10 IS NOT NULL THEN
        pdtmTermEndDate := dtmSDT_EndDate10;
    ELSIF dtmSDT_EndDate9  IS NOT NULL THEN
        pdtmTermEndDate := dtmSDT_EndDate9 ;
    ELSIF dtmSDT_EndDate8  IS NOT NULL THEN
        pdtmTermEndDate := dtmSDT_EndDate8 ;
    ELSIF dtmSDT_EndDate7  IS NOT NULL THEN
        pdtmTermEndDate := dtmSDT_EndDate7 ;
    ELSIF dtmSDT_EndDate6  IS NOT NULL THEN
        pdtmTermEndDate := dtmSDT_EndDate6 ;
    ELSIF dtmSDT_EndDate5  IS NOT NULL THEN
        pdtmTermEndDate := dtmSDT_EndDate5 ;
    ELSIF dtmSDT_EndDate4  IS NOT NULL THEN
        pdtmTermEndDate := dtmSDT_EndDate4 ;
    ELSIF dtmSDT_EndDate3  IS NOT NULL THEN
        pdtmTermEndDate := dtmSDT_EndDate3 ;
    ELSIF dtmSDT_EndDate2  IS NOT NULL THEN
        pdtmTermEndDate := dtmSDT_EndDate2 ;
    ELSIF dtmSDT_EndDate1 IS NOT NULL THEN
        pdtmTermEndDate := dtmSDT_EndDate1 ;
    END IF;

    /* �N�������̏��� */
    IF numAction = ACTION_TYP_DATE THEN
        IF (dtmSDT_StartDate1 <= dtmInDate) AND
           (dtmInDate <= dtmSDT_EndDate1)   THEN
            pdtmMonthStartDate := dtmSDT_StartDate1;
            pdtmMonthEndDate   := dtmSDT_EndDate1;
            pnumYearMonth      := numSDT_YearMonth1;
            pnumTableNo        := 1;
        ELSIF (dtmSDT_StartDate2 <= dtmInDate) AND
              (dtmInDate <= dtmSDT_EndDate2)   THEN
            pdtmMonthStartDate := dtmSDT_StartDate2;
            pdtmMonthEndDate   := dtmSDT_EndDate2;
            pnumYearMonth      := numSDT_YearMonth2;
            pnumTableNo        := 2;
        ELSIF (dtmSDT_StartDate3 <= dtmInDate) AND
              (dtmInDate <= dtmSDT_EndDate3)   THEN
            pdtmMonthStartDate := dtmSDT_StartDate3;
            pdtmMonthEndDate   := dtmSDT_EndDate3;
            pnumYearMonth      := numSDT_YearMonth3;
            pnumTableNo        := 3;
        ELSIF (dtmSDT_StartDate4 <= dtmInDate) AND
              (dtmInDate <= dtmSDT_EndDate4)   THEN
            pdtmMonthStartDate := dtmSDT_StartDate4;
            pdtmMonthEndDate   := dtmSDT_EndDate4;
            pnumYearMonth      := numSDT_YearMonth4;
            pnumTableNo        := 4;
        ELSIF (dtmSDT_StartDate5 <= dtmInDate) AND
              (dtmInDate <= dtmSDT_EndDate5)   THEN
            pdtmMonthStartDate := dtmSDT_StartDate5;
            pdtmMonthEndDate   := dtmSDT_EndDate5;
            pnumYearMonth      := numSDT_YearMonth5;
            pnumTableNo        := 5;
        ELSIF (dtmSDT_StartDate6 <= dtmInDate) AND
              (dtmInDate <= dtmSDT_EndDate6) THEN
            pdtmMonthStartDate := dtmSDT_StartDate6;
            pdtmMonthEndDate   := dtmSDT_EndDate6;
            pnumYearMonth      := numSDT_YearMonth6;
            pnumTableNo        := 6;
        ELSIF (dtmSDT_StartDate7 <= dtmInDate) AND
              (dtmInDate <= dtmSDT_EndDate7)   THEN
            pdtmMonthStartDate := dtmSDT_StartDate7;
            pdtmMonthEndDate   := dtmSDT_EndDate7;
            pnumYearMonth      := numSDT_YearMonth7;
            pnumTableNo        := 7;
        ELSIF (dtmSDT_StartDate8 <= dtmInDate) AND
              (dtmInDate <= dtmSDT_EndDate8)   THEN
            pdtmMonthStartDate := dtmSDT_StartDate8;
            pdtmMonthEndDate   := dtmSDT_EndDate8;
            pnumYearMonth      := numSDT_YearMonth8;
            pnumTableNo        := 8;
        ELSIF (dtmSDT_StartDate9 <= dtmInDate) AND
              (dtmInDate <= dtmSDT_EndDate9)   THEN
            pdtmMonthStartDate := dtmSDT_StartDate9;
            pdtmMonthEndDate   := dtmSDT_EndDate9;
            pnumYearMonth      := numSDT_YearMonth9;
            pnumTableNo        := 9;
        ELSIF (dtmSDT_StartDate10 <= dtmInDate) AND
              (dtmInDate <= dtmSDT_EndDate10)   THEN
            pdtmMonthStartDate := dtmSDT_StartDate10;
            pdtmMonthEndDate   := dtmSDT_EndDate10;
            pnumYearMonth      := numSDT_YearMonth10;
            pnumTableNo        := 10;
        ELSIF (dtmSDT_StartDate11 <= dtmInDate) AND
              (dtmInDate <= dtmSDT_EndDate11)   THEN
            pdtmMonthStartDate := dtmSDT_StartDate11;
            pdtmMonthEndDate   := dtmSDT_EndDate11;
            pnumYearMonth      := numSDT_YearMonth11;
            pnumTableNo        := 11;
        ELSIF (dtmSDT_StartDate12 <= dtmInDate) AND
              (dtmInDate <= dtmSDT_EndDate12)   THEN
            pdtmMonthStartDate := dtmSDT_StartDate12;
            pdtmMonthEndDate   := dtmSDT_EndDate12;
            pnumYearMonth      := numSDT_YearMonth12;
            pnumTableNo        := 12;
        ELSE
            RAISE excFNC_M_ACC_TERM_PERIOD_ERR;
        END IF;
    /* �N�����̏��� */
    ELSE
        IF numSDT_YearMonth1 = numYearMonth THEN
            pdtmMonthStartDate := dtmSDT_StartDate1;
            pdtmMonthEndDate   := dtmSDT_EndDate1;
            pnumYearMonth      := numSDT_YearMonth1;
            pnumTableNo        := 1;
        ELSIF numSDT_YearMonth2 = numYearMonth THEN
            pdtmMonthStartDate := dtmSDT_StartDate2;
            pdtmMonthEndDate   := dtmSDT_EndDate2;
            pnumYearMonth      := numSDT_YearMonth2;
            pnumTableNo        := 2;
        ELSIF numSDT_YearMonth3 = numYearMonth THEN
            pdtmMonthStartDate := dtmSDT_StartDate3;
            pdtmMonthEndDate   := dtmSDT_EndDate3;
            pnumYearMonth      := numSDT_YearMonth3;
            pnumTableNo        := 3;
        ELSIF numSDT_YearMonth4 = numYearMonth THEN
            pdtmMonthStartDate := dtmSDT_StartDate4;
            pdtmMonthEndDate   := dtmSDT_EndDate4;
            pnumYearMonth      := numSDT_YearMonth4;
            pnumTableNo        := 4;
        ELSIF numSDT_YearMonth5 = numYearMonth THEN
            pdtmMonthStartDate := dtmSDT_StartDate5;
            pdtmMonthEndDate   := dtmSDT_EndDate5;
            pnumYearMonth      := numSDT_YearMonth5;
            pnumTableNo        := 5;
        ELSIF numSDT_YearMonth6 = numYearMonth THEN
            pdtmMonthStartDate := dtmSDT_StartDate6;
            pdtmMonthEndDate   := dtmSDT_EndDate6;
            pnumYearMonth      := numSDT_YearMonth6;
            pnumTableNo        := 6;
        ELSIF numSDT_YearMonth7 = numYearMonth THEN
            pdtmMonthStartDate := dtmSDT_StartDate7;
            pdtmMonthEndDate   := dtmSDT_EndDate7;
            pnumYearMonth      := numSDT_YearMonth7;
            pnumTableNo        := 7;
        ELSIF numSDT_YearMonth8 = numYearMonth THEN
            pdtmMonthStartDate := dtmSDT_StartDate8;
            pdtmMonthEndDate   := dtmSDT_EndDate8;
            pnumYearMonth      := numSDT_YearMonth8;
            pnumTableNo        := 8;
        ELSIF numSDT_YearMonth9 = numYearMonth THEN
            pdtmMonthStartDate := dtmSDT_StartDate9;
            pdtmMonthEndDate   := dtmSDT_EndDate9;
            pnumYearMonth      := numSDT_YearMonth9;
            pnumTableNo        := 9;
        ELSIF numSDT_YearMonth10 = numYearMonth THEN
            pdtmMonthStartDate := dtmSDT_StartDate10;
            pdtmMonthEndDate   := dtmSDT_EndDate10;
            pnumYearMonth      := numSDT_YearMonth10;
            pnumTableNo        := 10;
        ELSIF numSDT_YearMonth11 = numYearMonth THEN
            pdtmMonthStartDate := dtmSDT_StartDate11;
            pdtmMonthEndDate   := dtmSDT_EndDate11;
            pnumYearMonth      := numSDT_YearMonth11;
            pnumTableNo        := 11;
        ELSIF numSDT_YearMonth12 = numYearMonth THEN
            pdtmMonthStartDate := dtmSDT_StartDate12;
            pdtmMonthEndDate   := dtmSDT_EndDate12;
            pnumYearMonth      := numSDT_YearMonth12;
            pnumTableNo        := 12;
        ELSE
            RAISE excFNC_M_ACC_TERM_PERIOD_ERR;
        END IF;
    END IF;

    /* �N�x��ݒ肷�� */
    pnumYear := numSDT_Year;

    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    RETURN TRUE;

--< ��O���� >---------------------------------------------------------------
EXCEPTION
    WHEN excFNC_PARAMETER_ERR OR            --���̓p�����[�^�G���[
         excFNC_MST_NODATA    THEN          --�}�X�^�Ȃ��G���[
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        RETURN FALSE;

    WHEN excFNC_M_ACC_TERM_PERIOD_ERR  THEN          --�����ԃ}�X�^�G���[
         /* ErrorLog �̏o�� */
         blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, ERRCD_CECD_ERRNO, 'M_ACC_TERM_PERIOD Date Error InDate:' || pvc2InDate);
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        RETURN FALSE;

    WHEN OTHERS THEN                        --���̑��̃G���[
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
