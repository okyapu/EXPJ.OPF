CREATE OR REPLACE FUNCTION FNCGETSLIPCD4ARAP (
/*------------------------------------------------------------------------------
'
' FncGetSlipCd4ARAP.Sql(AUTONOMOUS_TRANSACTION��)
'
' �C������  2004.07.01 �V�K�쐬
'           2005.10.20 unicode�Ή�(varchar2��4�{)
'
' �@�\      : ���|���|�`�[�ԍ��擾����
'
' �߂�l    : Boolean
'               True :����I��
'               False:�ُ�I��
'
' ������    : pFileHandle          - (i) �t�@�C���n���h��
'             pvc2LogMode          - (i) �k�n�f���[�h
'             pvc2OutputMode       - (i) �o�̓��[�h
'             pvc2PlantCd          - (i) �H��R�[�h
'             pvc2UserId           - (i) ���[�U�h�c
'             pvc2BusinessName     - (i) �Ɩ���
'             pnumAction           - (i) �������
'             pnumSlipTyp          - (i) �`�[���
'             pvc2SlipDate         - (i) �`�[���t
'             pvc2CompanyCd        - (io)��ЃR�[�h
'             pvc2GDate            - (o) �N���x
'             pvc2NumberingCd      - (o) �̔ԃR�[�h
'             pvc2SlipCd           - (o) �ŏI�`�[�ԍ�
'             pnumTerms            - (o) ����
'
'
' �@�\����  : �@ �A�N�V�������P�ł������̔Ԃ̏ꍇ�A�h�m���������Ƃɂn�t�s���ڂ�ʒm
'                ����`�[�̔ԃR���g���[���}�X�^�̍ŏI�`�[�ԍ����X�V����
'             �� �`�[�̔ԃR���g���[���}�X�^�����݂���ꍇ�͍ŏI�`�[�ԍ����X�V���
'                ���݂��Ȃ��ꍇ�̓��R�[�h��ǉ�����
'�@�@�@�@�@   �A �A�N�V�������O�A�܂��̓A�N�V�������P�ł��蓮�̔Ԃ̏ꍇ�A�h�m������
'                ���Ƃɓ`�[�ԍ��ȊO��OUT���ڂ�ʒm����`�[�̔ԃR���g���[���}�X�^��
'                �ŏI�`�[�ԍ��̍X�V�͍s��Ȃ��
' ���l      :
'
------------------------------------------------------------------------------*/
    pFileHandle         IN      UTL_FILE.FILE_TYPE  --�t�@�C���n���h��
   ,pvc2LogMode         IN      VARCHAR2    --�k�n�f���[�h
   ,pvc2OutputMode      IN      VARCHAR2    --�o�̓��[�h
   ,pvc2PlantCd         IN      VARCHAR2    --�H��R�[�h
   ,pvc2UserId          IN      VARCHAR2    --���[�U�h�c
   ,pvc2BusinessName    IN      VARCHAR2    --�Ɩ���
   ,pnumAction          IN      NUMBER      --�������
   ,pnumSlipTyp         IN      NUMBER      --�`�[���
   ,pvc2SlipDate        IN      VARCHAR2    --�`�[���t
   ,pvc2CompanyCd       IN  OUT VARCHAR2    --��ЃR�[�h
   ,pvc2GDate           OUT     VARCHAR2    --�N���x
   ,pvc2NumberingCd     OUT     VARCHAR2    --�̔ԃR�[�h
   ,pvc2SlipCd          OUT     VARCHAR2    --�ŏI�`�[�ԍ�
   ,pnumTerms           OUT     NUMBER      --����
) RETURN BOOLEAN
IS
PRAGMA AUTONOMOUS_TRANSACTION;

/* �J�[�\���̐錾 */


/* ROWTYPE �̐錾 */

/* �萔�̐錾 */
    MY_SQL_NAME                 CONSTANT VARCHAR2(120)  := 'FncGetSlipCd4ARAP';

--  AUTO_NUMBERING_TYP_AUTO     CONSTANT NUMBER(2)     := 1;    --�����E�蓮�̔ԁi1:�����̔�)
    AUTO_NUMBERING_TYP_MANUAL   CONSTANT NUMBER(2)     := 2;    --�����E�蓮�̔ԁi2:�蓮�̔�)
    NUMBERING_TYP_MONTH         CONSTANT NUMBER(2)     := 1;    --���ԁE�N�ԁE�P���̔ԋ敪�i1:���ԍ̔�)
    NUMBERING_TYP_YEAR          CONSTANT NUMBER(2)     := 2;    --���ԁE�N�ԁE�P���̔ԋ敪�i2:�N�ԍ̔�)
    NUMBERING_TYP_SIMPLE        CONSTANT NUMBER(2)     := 3;    --���ԁE�N�ԁE�P���̔ԋ敪�i3:�P���̔�)
    SLIP_NUMBERING_TERM_DEFAULT CONSTANT VARCHAR2(24)   := '999999';   --�����̋K��l�i�P���̔ԗp�j

    ERRCD_DATE_INVALID         CONSTANT VARCHAR2(28)   := 'BZ00176';    --���t�̒l���s���ł��B
    ERRCD_NOTEXIST_DATA        CONSTANT VARCHAR2(28)   := 'BZ00174';    --�Ώۃf�[�^�����݂��܂���


/* EXCEPTION �̐錾 */
    excSQL_NORMAL_END                  EXCEPTION;                  --����I��
    excFNC_PARAMETER_ERR               EXCEPTION;                  --���̓p�����[�^�G���[
    excFNC_MST_NODATA                  EXCEPTION;                  --�}�X�^�Ȃ��G���[
    excFNC_GET_CTRLDATE_ERR            EXCEPTION;                  --���擾�G���[

/* MESSAGE �̐錾 */

/* LOG �̐錾 */
    LOGMSG_START                CONSTANT VARCHAR2(20)   := 'Start';   --���O�p���\�b�h�J�n�錾
    LOGMSG_END                  CONSTANT VARCHAR2(12)   := 'End';     --���O�p���\�b�h�I���錾

/* �ϐ��̐錾 SQL */
    /* �`�[�R���g���[�� */
    vc2SLT_CompanyCd                   VARCHAR2(100);
    numSLT_SlipTyp                     NUMBER(2);
    vc2SLT_SlipName                    VARCHAR2(160);
    vc2SLT_SlipAName                   VARCHAR2(80);
    vc2SLT_NumberingCd                 VARCHAR2(100);
    numSLT_AutoNumberingTyp            NUMBER(2);
    numSLT_NumberingTyp                NUMBER(2);
    vc2SLT_StartSlipCd                 VARCHAR2(100);
    vc2SLT_EndSlipCd                   VARCHAR2(100);
    numSLT_JnlSlipTyp                  NUMBER(2);
    numSLT_AutoJnlTyp                  NUMBER(2);
    dtmSLT_CreDate                     DATE;
    vc2SLT_CreCd                       VARCHAR2(100);
    dtmSLT_UpdDate                     DATE;
    vc2SLT_UpdCd                       VARCHAR2(100);

    /* �`�[�̔ԃR���g���[�� */
    vc2SCC_CompanyCd                   VARCHAR2(100);   --PKey01
    numSCC_Term                        NUMBER(6);      --PKey02
    vc2SCC_NumberingCd                 VARCHAR2(100);   --PKey03
    vc2SCC_CurrentSlipCdM1             VARCHAR2(100);
    vc2SCC_CurrentSlipCdM2             VARCHAR2(100);
    vc2SCC_CurrentSlipCdM3             VARCHAR2(100);
    vc2SCC_CurrentSlipCdM4             VARCHAR2(100);
    vc2SCC_CurrentSlipCdM5             VARCHAR2(100);
    vc2SCC_CurrentSlipCdM6             VARCHAR2(100);
    vc2SCC_CurrentSlipCdM7             VARCHAR2(100);
    vc2SCC_CurrentSlipCdM8             VARCHAR2(100);
    vc2SCC_CurrentSlipCdM9             VARCHAR2(100);
    vc2SCC_CurrentSlipCdM10            VARCHAR2(100);
    vc2SCC_CurrentSlipCdM11            VARCHAR2(100);
    vc2SCC_CurrentSlipCdM12            VARCHAR2(100);
    vc2SCC_CurrentSlipCdY              VARCHAR2(100);
    vc2SCC_CurrentSlipCd               VARCHAR2(100);
    dtmSCC_CreDate                     DATE;
    vc2SCC_CreCd                       VARCHAR2(100);
    dtmSCC_UpdDate                     DATE;
    vc2SCC_UpdCd                       VARCHAR2(100);

/* �ϐ��̐錾 WORK */
    blnRet                      BOOLEAN;        -- Function�ԋp�l
    numTermTemp                 NUMBER(6);      --��
    numEndSlipCd                NUMBER(25);     --�ŏI�`�[�ԍ�

    numTerm                     NUMBER(6);      --��
    numYear                     NUMBER(4);      --�N
    dtmTermStartDate            DATE;           --���̊J�n�N����
    dtmTermEndDate              DATE;           --���̏I���N����
    numYearMonth                NUMBER(6);      --�N���x
    dtmMonthStartDate           DATE;           --�N���x�̊J�n�N����
    dtmMonthEndDate             DATE;           --�N���x�̏I���N����
    numTableNo                  NUMBER;         --�e�[�u���m��

    numSlipCdFig                NUMBER(2);
    blnSlipCdCtrlFlg            BOOLEAN := FALSE;

BEGIN

    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

--  �����̏�����
    pvc2GDate       := '000000'; --�N���x
    pvc2NumberingCd := '0';      --�̔ԃR�[�h
    pvc2SlipCd      := '0';      --�ŏI�`�[�ԍ�
    pnumTerms       := 0;        --����

--  �����`�F�b�N  ���͔N�����̃`�F�b�N
    IF (pvc2SlipDate IS NULL) OR
       (LENGTHB(pvc2SlipDate) <> 10) OR
       (pvc2SlipDate = '0000/00/00') OR
       (pvc2SlipDate = '9999/99/99') THEN

        /* ErrorLog �̏o�� */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, ERRCD_DATE_INVALID, '���t�̒l���s���ł��B');

        RAISE excFNC_PARAMETER_ERR;
    END IF;

    IF (pvc2CompanyCd IS NULL)      OR
       (LENGTHB(pvc2CompanyCd) = 0) THEN
        blnRet := FNCGETUSERCOMPANY4ARAP(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                       pvc2PlantCd, pvc2UserId, pvc2BusinessName,
                                       pvc2CompanyCd);
        IF blnRet = FALSE THEN
            blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                MY_SQL_NAME, ERRCD_DATE_INVALID, '��ЃR�[�h�擾���s');

            RAISE excFNC_PARAMETER_ERR;
        END IF;
    END IF;

    /* �`�[�R���g���[�����擾���� */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, 'M_SLIP_TYP COMPANY_CD:' || pvc2CompanyCd || ' SLIP_TYP:' || TO_CHAR(pnumSlipTyp));

    BEGIN
        SELECT COMPANY_CD, SLIP_TYP,
               SLIP_NAME,  SLIP_ANAME,
               NUMBERING_CD,
               AUTO_NUMBERING_TYP, NUMBERING_TYP,
               START_SLIP_CD, END_SLIP_CD,
               JNL_SLIP_TYP,
               AUTO_JNL_TYP,
               CREATED_DATE, CREATED_PRG_NM,
               UPDATED_DATE, UPDATED_PRG_NM
          INTO vc2SLT_CompanyCd, numSLT_SlipTyp,
               vc2SLT_SlipName,  vc2SLT_SlipAName,
               vc2SLT_NumberingCd,
               numSLT_AutoNumberingTyp, numSLT_NumberingTyp,
               vc2SLT_StartSlipCd, vc2SLT_EndSlipCd,
               numSLT_JnlSlipTyp,
               numSLT_AutoJnlTyp,
               dtmSLT_CreDate, vc2SLT_CreCd,
               dtmSLT_UpdDate, vc2SLT_UpdCd
          FROM M_SLIP_TYP
         WHERE COMPANY_CD = pvc2CompanyCd    --��ЃR�[�h
           AND SLIP_TYP   = pnumSlipTyp;     --�`�[���

    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                MY_SQL_NAME, ERRCD_NOTEXIST_DATA,
                                'M_SLIP_TYP COMPANY_CD:' || pvc2CompanyCd || ' SLIP_TYP:' || TO_CHAR(pnumSlipTyp));

            RAISE excFNC_MST_NODATA;
    END;

    numEndSlipCd := TO_NUMBER(vc2SLT_EndSlipCd);

--  �A�N�V�������O �܂���
--  �A�N�V�������P�Ŏ蓮�̔Ԏ��͏������s�Ȃ�Ȃ�
    IF (pnumAction = 0) OR
       ((pnumAction = 1) AND
        (numSLT_AutoNumberingTyp = AUTO_NUMBERING_TYP_MANUAL)) THEN
        RAISE excSQL_NORMAL_END;
    END IF;

--  [�`�[�R���g���[���n�̍̔ԋ敪���u�P���̔ԁv�ȊO�̏ꍇ�ɂ͓��t�R���g���[���������擾����
    IF numSLT_NumberingTyp <> NUMBERING_TYP_SIMPLE THEN
        blnRet := FNCGETCTRLDATE4ARAP(
                                    pFileHandle,        --�t�@�C���n���h��
                                    pvc2LogMode,        --�k�n�f���[�h�@�k�n�f����
                                    pvc2OutputMode,     --�o�̓��[�h�@�@�t�@�C��
                                    pvc2UserId,         --���[�U�h�c
                                    pvc2BusinessName,   --�Ɩ���
                                    pvc2PlantCd,        --�H��R�[�h
                                    pvc2CompanyCd,      --��ЃR�[�h
                                    pvc2SlipDate,       --�`�[���t
                                    numTerm,            --�
                                    numYear,            --�N��
                                    dtmTermStartDate,   --���̊J�n�N����
                                    dtmTermEndDate,     --���̏I���N����
                                    numYearMonth,       --�N���x
                                    dtmMonthStartDate,  --�N���x�̊J�n�N����
                                    dtmMonthEndDate,    --�N���x�̏I���N����
                                    numTableNo          --�e�[�u���m��
                                    );
        /* �G���[�I�� */
        IF blnRet = FALSE THEN
            RAISE excFNC_GET_CTRLDATE_ERR;
        END IF;
        pnumTerms   := numTerm;
        numTermTemp := numTerm;
    END IF;

    /* �N���x�̎擾 */
    IF numSLT_NumberingTyp = NUMBERING_TYP_MONTH THEN     --1:���ԍ̔�
        pvc2GDate       := TO_CHAR(numYearMonth);
        pvc2NumberingCd := vc2SLT_NumberingCd;
    ELSIF numSLT_NumberingTyp = NUMBERING_TYP_YEAR THEN   --2:�N�ԍ̔�
        pvc2GDate       := TO_CHAR(numYear) || '00';
        pvc2NumberingCd := vc2SLT_NumberingCd;
    ELSIF numSLT_NumberingTyp = NUMBERING_TYP_SIMPLE THEN --3:�P���̔�
        pvc2GDate       := TO_CHAR(numYearMonth);
        pvc2NumberingCd := SLIP_NUMBERING_TERM_DEFAULT;
        pnumTerms       := TO_NUMBER(SLIP_NUMBERING_TERM_DEFAULT);
        numTermTemp     := TO_NUMBER(SLIP_NUMBERING_TERM_DEFAULT);
    END IF;

    /* �`�[�̔ԃR���g���[�����擾���� */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME,
                          'M_SLIP_CD_CTRL COMPANY_CD:' || pvc2CompanyCd || ' TERM:' || TO_CHAR(numTermTemp) || ' NUMBERING_CD:' || vc2SLT_NumberingCd);

    BEGIN
        SELECT COMPANY_CD,TERM,NUMBERING_CD,
               CURRENT_SLIP_CD_M1,CURRENT_SLIP_CD_M2,CURRENT_SLIP_CD_M3,
               CURRENT_SLIP_CD_M4,CURRENT_SLIP_CD_M5,CURRENT_SLIP_CD_M6,
               CURRENT_SLIP_CD_M7,CURRENT_SLIP_CD_M8,CURRENT_SLIP_CD_M9,
               CURRENT_SLIP_CD_M10,CURRENT_SLIP_CD_M11,CURRENT_SLIP_CD_M12,
               CURRENT_SLIP_CD_Y,CURRENT_SLIP_CD,
               CREATED_DATE, CREATED_PRG_NM,
               UPDATED_DATE, UPDATED_PRG_NM
          INTO vc2SCC_CompanyCd,numSCC_Term,vc2SCC_NumberingCd,
               vc2SCC_CurrentSlipCdM1,vc2SCC_CurrentSlipCdM2,vc2SCC_CurrentSlipCdM3,
               vc2SCC_CurrentSlipCdM4,vc2SCC_CurrentSlipCdM5,vc2SCC_CurrentSlipCdM6,
               vc2SCC_CurrentSlipCdM7,vc2SCC_CurrentSlipCdM8,vc2SCC_CurrentSlipCdM9,
               vc2SCC_CurrentSlipCdM10,vc2SCC_CurrentSlipCdM11,vc2SCC_CurrentSlipCdM12,
               vc2SCC_CurrentSlipCdY,vc2SCC_CurrentSlipCd,
               dtmSCC_CreDate,vc2SCC_CreCd,dtmSCC_UpdDate,vc2SCC_UpdCd
          FROM   M_SLIP_CD_CTRL
         WHERE  COMPANY_CD  = pvc2CompanyCd        --��ЃR�[�h
           AND TERM         = numTermTemp          --��
           AND NUMBERING_CD = vc2SLT_NumberingCd   --�̔ԃR�[�h
           FOR UPDATE;

        blnSlipCdCtrlFlg := TRUE;

    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            blnSlipCdCtrlFlg := FALSE;
    END;

--  �`�[�̔ԃR���g���[�������݂���ꍇ
    IF blnSlipCdCtrlFlg THEN
--      ���ԍ̔Ԃ̏ꍇ�A���ԍŏI�`�[�ԍ���ݒ肷��
        IF numSLT_NumberingTyp = NUMBERING_TYP_MONTH THEN
            IF numTableNo = 1 THEN
                IF vc2SCC_CurrentSlipCdM1 IS NULL THEN
                    vc2SCC_CurrentSlipCdM1 := vc2SLT_StartSlipCd;
                ELSE
                    vc2SCC_CurrentSlipCdM1 := TO_CHAR(TO_NUMBER(vc2SCC_CurrentSlipCdM1) + 1);
                    IF TO_NUMBER(vc2SCC_CurrentSlipCdM1) > numEndSlipCd THEN
                        vc2SCC_CurrentSlipCdM1 := vc2SLT_StartSlipCd;
                    END IF;
                END IF;
                pvc2SlipCd := vc2SCC_CurrentSlipCdM1;
            ELSIF numTableNo = 2 THEN
                IF vc2SCC_CurrentSlipCdM2 IS NULL THEN
                    vc2SCC_CurrentSlipCdM2 := vc2SLT_StartSlipCd;
                ELSE
                    vc2SCC_CurrentSlipCdM2 := TO_CHAR(TO_NUMBER(vc2SCC_CurrentSlipCdM2) + 1);
                    IF TO_NUMBER(vc2SCC_CurrentSlipCdM2) > numEndSlipCd THEN
                        vc2SCC_CurrentSlipCdM2 := vc2SLT_StartSlipCd;
                    END IF;
                END IF;
                pvc2SlipCd := vc2SCC_CurrentSlipCdM2;
            ELSIF numTableNo = 3 THEN
                IF vc2SCC_CurrentSlipCdM3 IS NULL THEN
                    vc2SCC_CurrentSlipCdM3 := vc2SLT_StartSlipCd;
                ELSE
                    vc2SCC_CurrentSlipCdM3 := TO_CHAR(TO_NUMBER(vc2SCC_CurrentSlipCdM3) + 1);
                    IF TO_NUMBER(vc2SCC_CurrentSlipCdM3) > numEndSlipCd THEN
                        vc2SCC_CurrentSlipCdM3 := vc2SLT_StartSlipCd;
                    END IF;
                END IF;
                pvc2SlipCd := vc2SCC_CurrentSlipCdM3;
            ELSIF numTableNo = 4 THEN
                IF vc2SCC_CurrentSlipCdM4 IS NULL THEN
                    vc2SCC_CurrentSlipCdM4 := vc2SLT_StartSlipCd;
                ELSE
                    vc2SCC_CurrentSlipCdM4 := TO_CHAR(TO_NUMBER(vc2SCC_CurrentSlipCdM4) + 1);
                    IF TO_NUMBER(vc2SCC_CurrentSlipCdM4) > numEndSlipCd THEN
                        vc2SCC_CurrentSlipCdM4 := vc2SLT_StartSlipCd;
                    END IF;
                END IF;
                pvc2SlipCd := vc2SCC_CurrentSlipCdM4;
            ELSIF numTableNo = 5 THEN
                IF vc2SCC_CurrentSlipCdM5 IS NULL THEN
                    vc2SCC_CurrentSlipCdM5 := vc2SLT_StartSlipCd;
                ELSE
                    vc2SCC_CurrentSlipCdM5 := TO_CHAR(TO_NUMBER(vc2SCC_CurrentSlipCdM5) + 1);
                    IF TO_NUMBER(vc2SCC_CurrentSlipCdM5) > numEndSlipCd THEN
                        vc2SCC_CurrentSlipCdM5 := vc2SLT_StartSlipCd;
                    END IF;
                END IF;
                pvc2SlipCd := vc2SCC_CurrentSlipCdM5;
            ELSIF numTableNo = 6 THEN
                IF vc2SCC_CurrentSlipCdM6 IS NULL THEN
                    vc2SCC_CurrentSlipCdM6 := vc2SLT_StartSlipCd;
                ELSE
                    vc2SCC_CurrentSlipCdM6 := TO_CHAR(TO_NUMBER(vc2SCC_CurrentSlipCdM6) + 1);
                    IF TO_NUMBER(vc2SCC_CurrentSlipCdM6) > numEndSlipCd THEN
                        vc2SCC_CurrentSlipCdM6 := vc2SLT_StartSlipCd;
                    END IF;
                END IF;
                pvc2SlipCd := vc2SCC_CurrentSlipCdM6;
            ELSIF numTableNo = 7 THEN
                IF vc2SCC_CurrentSlipCdM7 IS NULL THEN
                    vc2SCC_CurrentSlipCdM7 := vc2SLT_StartSlipCd;
                ELSE
                    vc2SCC_CurrentSlipCdM7 := TO_CHAR(TO_NUMBER(vc2SCC_CurrentSlipCdM7) + 1);
                    IF TO_NUMBER(vc2SCC_CurrentSlipCdM7) > numEndSlipCd THEN
                        vc2SCC_CurrentSlipCdM7 := vc2SLT_StartSlipCd;
                    END IF;
                END IF;
                pvc2SlipCd := vc2SCC_CurrentSlipCdM7;
            ELSIF numTableNo = 8 THEN
                IF vc2SCC_CurrentSlipCdM8 IS NULL THEN
                    vc2SCC_CurrentSlipCdM8 := vc2SLT_StartSlipCd;
                ELSE
                    vc2SCC_CurrentSlipCdM8 := TO_CHAR(TO_NUMBER(vc2SCC_CurrentSlipCdM8) + 1);
                    IF TO_NUMBER(vc2SCC_CurrentSlipCdM8) > numEndSlipCd THEN
                        vc2SCC_CurrentSlipCdM8 := vc2SLT_StartSlipCd;
                    END IF;
                END IF;
                pvc2SlipCd := vc2SCC_CurrentSlipCdM8;
            ELSIF numTableNo = 9 THEN
                IF vc2SCC_CurrentSlipCdM9 IS NULL THEN
                    vc2SCC_CurrentSlipCdM9 := vc2SLT_StartSlipCd;
                ELSE
                    vc2SCC_CurrentSlipCdM9 := TO_CHAR(TO_NUMBER(vc2SCC_CurrentSlipCdM9) + 1);
                    IF TO_NUMBER(vc2SCC_CurrentSlipCdM9) > numEndSlipCd THEN
                        vc2SCC_CurrentSlipCdM9 := vc2SLT_StartSlipCd;
                    END IF;
                END IF;
                pvc2SlipCd := vc2SCC_CurrentSlipCdM9;
            ELSIF numTableNo = 10 THEN
                IF vc2SCC_CurrentSlipCdM10 IS NULL THEN
                    vc2SCC_CurrentSlipCdM10 := vc2SLT_StartSlipCd;
                ELSE
                    vc2SCC_CurrentSlipCdM10 := TO_CHAR(TO_NUMBER(vc2SCC_CurrentSlipCdM10) + 1);
                    IF TO_NUMBER(vc2SCC_CurrentSlipCdM10) > numEndSlipCd THEN
                        vc2SCC_CurrentSlipCdM10 := vc2SLT_StartSlipCd;
                    END IF;
                END IF;
                pvc2SlipCd := vc2SCC_CurrentSlipCdM10;
            ELSIF numTableNo = 11 THEN
                IF vc2SCC_CurrentSlipCdM11 IS NULL THEN
                    vc2SCC_CurrentSlipCdM11 := vc2SLT_StartSlipCd;
                ELSE
                    vc2SCC_CurrentSlipCdM11 := TO_CHAR(TO_NUMBER(vc2SCC_CurrentSlipCdM11) + 1);
                    IF TO_NUMBER(vc2SCC_CurrentSlipCdM11) > numEndSlipCd THEN
                        vc2SCC_CurrentSlipCdM11 := vc2SLT_StartSlipCd;
                    END IF;
                END IF;
                pvc2SlipCd := vc2SCC_CurrentSlipCdM11;
            ELSIF numTableNo = 12 THEN
                IF vc2SCC_CurrentSlipCdM12 IS NULL THEN
                    vc2SCC_CurrentSlipCdM12 := vc2SLT_StartSlipCd;
                ELSE
                    vc2SCC_CurrentSlipCdM12 := TO_CHAR(TO_NUMBER(vc2SCC_CurrentSlipCdM12) + 1);
                    IF TO_NUMBER(vc2SCC_CurrentSlipCdM12) > numEndSlipCd THEN
                        vc2SCC_CurrentSlipCdM12 := vc2SLT_StartSlipCd;
                    END IF;
                END IF;
                pvc2SlipCd := vc2SCC_CurrentSlipCdM12;
            END IF;
--      �N�ԍ̔Ԃ̏ꍇ�A�N�ԍŏI�`�[No��ݒ肷��
        ELSIF numSLT_NumberingTyp = NUMBERING_TYP_YEAR THEN
            IF vc2SCC_CurrentSlipCdY IS NULL THEN
                vc2SCC_CurrentSlipCdY := vc2SLT_StartSlipCd;
            ELSE
                vc2SCC_CurrentSlipCdY := TO_CHAR(TO_NUMBER(vc2SCC_CurrentSlipCdY) + 1);
                IF TO_NUMBER(vc2SCC_CurrentSlipCdY) > numEndSlipCd THEN
                    vc2SCC_CurrentSlipCdY := vc2SLT_StartSlipCd;
                END IF;
            END IF;
            pvc2SlipCd := vc2SCC_CurrentSlipCdY;
--      �P���̔Ԃ̏ꍇ
        ELSIF numSLT_NumberingTyp = NUMBERING_TYP_SIMPLE THEN
            IF vc2SCC_CurrentSlipCd IS NULL THEN
                vc2SCC_CurrentSlipCd := '0';
            END IF;
            vc2SCC_CurrentSlipCd := TO_CHAR(TO_NUMBER(vc2SCC_CurrentSlipCd) + 1);
            IF TO_NUMBER(vc2SCC_CurrentSlipCd) > numEndSlipCd THEN
                vc2SCC_CurrentSlipCd := vc2SLT_StartSlipCd;
            END IF;
            pvc2SlipCd := vc2SCC_CurrentSlipCd;
        END IF;

--      �`�[�̔ԃR���g���[���X�V�f�[�^�̍쐬
        UPDATE    M_SLIP_CD_CTRL                   --�`�[�̔ԃR���g���[��
            SET   CURRENT_SLIP_CD_M1  = vc2SCC_CurrentSlipCdM1,
                  CURRENT_SLIP_CD_M2  = vc2SCC_CurrentSlipCdM2,
                  CURRENT_SLIP_CD_M3  = vc2SCC_CurrentSlipCdM3,
                  CURRENT_SLIP_CD_M4  = vc2SCC_CurrentSlipCdM4,
                  CURRENT_SLIP_CD_M5  = vc2SCC_CurrentSlipCdM5,
                  CURRENT_SLIP_CD_M6  = vc2SCC_CurrentSlipCdM6,
                  CURRENT_SLIP_CD_M7  = vc2SCC_CurrentSlipCdM7,
                  CURRENT_SLIP_CD_M8  = vc2SCC_CurrentSlipCdM8,
                  CURRENT_SLIP_CD_M9  = vc2SCC_CurrentSlipCdM9,
                  CURRENT_SLIP_CD_M10 = vc2SCC_CurrentSlipCdM10,
                  CURRENT_SLIP_CD_M11 = vc2SCC_CurrentSlipCdM11,
                  CURRENT_SLIP_CD_M12 = vc2SCC_CurrentSlipCdM12,
                  CURRENT_SLIP_CD_Y   = vc2SCC_CurrentSlipCdY,
                  CURRENT_SLIP_CD     = vc2SCC_CurrentSlipCd,
                  UPDATED_DATE        = SYSDATE,                  --�ŐV�X�V����
                  UPDATED_PRG_NM      = pvc2UserID                --�ŐV�X�V�҃R�[�h
            WHERE  COMPANY_CD   = pvc2CompanyCd        --��ЃR�[�h
               AND TERM         = numTermTemp          --��
               AND NUMBERING_CD = vc2SLT_NumberingCd;  --�̔ԃR�[�h

--  �`�[�̔ԃR���g���[�������݂��Ȃ��ꍇ
    ELSE
        pvc2SlipCd := vc2SLT_StartSlipCd;
        vc2SCC_CompanyCd := pvc2CompanyCd;
        /* �P���̔Ԃ̏ꍇ�A�����̋K��l��ݒ肷�� */
        IF numSLT_NumberingTyp = NUMBERING_TYP_SIMPLE THEN
            numSCC_Term := TO_NUMBER(SLIP_NUMBERING_TERM_DEFAULT);
        /* ���ԁ^�N�ԍ̔Ԃ̏ꍇ�A���݂̊���ݒ肷�� */
        ELSE
            numSCC_Term := numTerm;
        END IF;
        vc2SCC_NumberingCd := vc2SLT_NumberingCd;
        vc2SCC_CurrentSlipCdM1  := '0';
        vc2SCC_CurrentSlipCdM2  := '0';
        vc2SCC_CurrentSlipCdM3  := '0';
        vc2SCC_CurrentSlipCdM4  := '0';
        vc2SCC_CurrentSlipCdM5  := '0';
        vc2SCC_CurrentSlipCdM6  := '0';
        vc2SCC_CurrentSlipCdM7  := '0';
        vc2SCC_CurrentSlipCdM8  := '0';
        vc2SCC_CurrentSlipCdM9  := '0';
        vc2SCC_CurrentSlipCdM10 := '0';
        vc2SCC_CurrentSlipCdM11 := '0';
        vc2SCC_CurrentSlipCdM12 := '0';
        vc2SCC_CurrentSlipCdY   := '0';
        vc2SCC_CurrentSlipCd    := '0';

        IF numSLT_NumberingTyp = NUMBERING_TYP_MONTH THEN   --���ԍ̔Ԏ�
            IF numTableNo = 1 THEN
                vc2SCC_CurrentSlipCdM1  := pvc2SlipCd;
            ELSIF numTableNo = 2 THEN
                vc2SCC_CurrentSlipCdM2  := pvc2SlipCd;
            ELSIF numTableNo = 3 THEN
                vc2SCC_CurrentSlipCdM3  := pvc2SlipCd;
            ELSIF numTableNo = 4 THEN
                vc2SCC_CurrentSlipCdM4  := pvc2SlipCd;
            ELSIF numTableNo = 5 THEN
                vc2SCC_CurrentSlipCdM5  := pvc2SlipCd;
            ELSIF numTableNo = 6 THEN
                vc2SCC_CurrentSlipCdM6  := pvc2SlipCd;
            ELSIF numTableNo = 7 THEN
                vc2SCC_CurrentSlipCdM7  := pvc2SlipCd;
            ELSIF numTableNo = 8 THEN
                vc2SCC_CurrentSlipCdM8  := pvc2SlipCd;
            ELSIF numTableNo = 9 THEN
                vc2SCC_CurrentSlipCdM9  := pvc2SlipCd;
            ELSIF numTableNo = 10 THEN
                vc2SCC_CurrentSlipCdM10 := pvc2SlipCd;
            ELSIF numTableNo = 11 THEN
                vc2SCC_CurrentSlipCdM11 := pvc2SlipCd;
            ELSIF numTableNo = 12 THEN
                vc2SCC_CurrentSlipCdM12 := pvc2SlipCd;
            END IF;
        ELSIF numSLT_NumberingTyp = NUMBERING_TYP_YEAR THEN --�N�ԍ̔Ԏ�
            vc2SCC_CurrentSlipCdY   := pvc2SlipCd;
        ELSE                                                --�P���̔Ԏ�
            vc2SCC_CurrentSlipCd    := pvc2SlipCd;
        END IF;

        INSERT INTO M_SLIP_CD_CTRL (   --�`�[�̔ԃR���g���[��
            COMPANY_CD, TERM, NUMBERING_CD,
            CURRENT_SLIP_CD_M1,  CURRENT_SLIP_CD_M2,
            CURRENT_SLIP_CD_M3,  CURRENT_SLIP_CD_M4,
            CURRENT_SLIP_CD_M5,  CURRENT_SLIP_CD_M6,
            CURRENT_SLIP_CD_M7,  CURRENT_SLIP_CD_M8,
            CURRENT_SLIP_CD_M9,  CURRENT_SLIP_CD_M10,
            CURRENT_SLIP_CD_M11, CURRENT_SLIP_CD_M12,
            CURRENT_SLIP_CD_Y,
            CURRENT_SLIP_CD,
            CREATED_DATE, CREATED_PRG_NM,
            UPDATED_DATE, UPDATED_PRG_NM
        ) VALUES (
            vc2SCC_CompanyCd, numSCC_Term, vc2SCC_NumberingCd,
            vc2SCC_CurrentSlipCdM1,  vc2SCC_CurrentSlipCdM2,
            vc2SCC_CurrentSlipCdM3,  vc2SCC_CurrentSlipCdM4,
            vc2SCC_CurrentSlipCdM5,  vc2SCC_CurrentSlipCdM6,
            vc2SCC_CurrentSlipCdM7,  vc2SCC_CurrentSlipCdM8,
            vc2SCC_CurrentSlipCdM9,  vc2SCC_CurrentSlipCdM10,
            vc2SCC_CurrentSlipCdM11, vc2SCC_CurrentSlipCdM12,
            vc2SCC_CurrentSlipCdY,
            vc2SCC_CurrentSlipCd,
            SYSDATE, pvc2UserID,
            SYSDATE, pvc2UserID
        );
    END IF;


--  �J�n�`�[No.�̌����ƏI���`�[No.�̌����̑傫�����̌�����
--  �̔Ԃ����ŏI�`�[�ԍ��̌�����
--  �����������[���p�f�B���O�����ԍ����ăZ�b�g����
    IF LENGTHB(vc2SLT_StartSlipCd) >= LENGTHB(vc2SLT_EndSlipCd) THEN
        numSlipCdFig := LENGTHB(vc2SLT_StartSlipCd);
        pvc2SlipCd   := LPAD(pvc2SlipCd, numSlipCdFig, '0');
    ELSE
        numSlipCdFig := LENGTHB(vc2SLT_EndSlipCd);
        pvc2SlipCd   := LPAD(pvc2SlipCd, numSlipCdFig, '0');
    END IF;

    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    COMMIT;
    RETURN TRUE;

--< ��O���� >---------------------------------------------------------------
EXCEPTION
    WHEN excSQL_NORMAL_END        THEN    --����I��
        NULL;
        RETURN TRUE;

    WHEN excFNC_PARAMETER_ERR OR            --���̓p�����[�^�G���[
         excFNC_MST_NODATA    OR            --�}�X�^�Ȃ��G���[
         excFNC_GET_CTRLDATE_ERR    THEN    --�u���擾�v�G���[
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        RETURN FALSE;

    WHEN OTHERS THEN                             --���̑��̃G���[
        ROLLBACK;
        /* ErrorLog �̏o�� */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, SQLCODE, SQLERRM);
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        RETURN FALSE;
END FncGetSlipCd4ARAP;
/
