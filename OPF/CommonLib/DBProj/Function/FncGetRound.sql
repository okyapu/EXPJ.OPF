CREATE OR REPLACE FUNCTION FNCGETROUND(
/*------------------------------------------------------------------------------
'
' version   : 1.00.01
'
' �C������
' 2003.07.26 ����
' 2003.08.16 �[�������敪���K��l�łȂ��ꍇ�A�l�̌ܓ��Ƃ���
'
' �@�\      : �[������
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
'             pvc2PlantCd          --(i)�H��R�[�h
'             pnumData             - (i)�[�������O�̒l
'             pnumDecimalFig       - (i)��������
'             pnumRoundTyp         - (i)�[�������敪
'             pnumResult           - (o)�[��������̒l
'
' �@�\����  : ���������ƒ[�������敪�Œ[���������s���B
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
   ,pnumData            IN  NUMBER              --�[�������O�̒l
   ,pnumDecimalFig      IN  NUMBER              --��������
   ,pnumRoundTyp        IN  NUMBER              --�[�������敪
   ,pnumResult          OUT NUMBER              --�[��������̒l
    ) RETURN BOOLEAN
IS

-----------------
-- CONST�l�錾 --
-----------------
    MY_SQL_NAME         VARCHAR2(44)    := 'FncGetRound';       --�o�k�^�r�p�k��
    ROUND_TYP_NORMAL    NUMBER(1)       := 1;                   --�����̔������z�ۂߋ敪(1:�l�̌ܓ�)
    ROUND_TYP_CUTUP     NUMBER(1)       := 2;                   --�����̔������z�ۂߋ敪(2:�؂�グ)
    ROUND_TYP_CUTDOWN   NUMBER(1)       := 3;                   --�����̔������z�ۂߋ敪(3:�؂�̂�)
    ROUND_COEFFICIENT   NUMBER(2,1)     := 0.5;                 --�l�̌ܓ��p
    CUTUP_COEFFICIENT   NUMBER(2,1)     := 1;                   --�؂�グ�p
    CUTDOWN_COEFFICIENT NUMBER(2,1)     := 0;                   --�؂�̂ėp
    LOGMSG_START        VARCHAR2(20)     := 'Start';             --���O�p���\�b�h�J�n�錾
    LOGMSG_END          VARCHAR2(12)     := 'End';               --���O�p���\�b�h�I���錾

--------------
-- �ϐ��錾 --
--------------
    NumWkRound      NUMBER(2,1);
    NumWkDecimal    NUMBER(28);
    BlnRet          BOOLEAN;

BEGIN

    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

    -- �[�������W���̐ݒ�
    IF    pnumRoundTyp = ROUND_TYP_NORMAL   THEN        -- �l�̌ܓ�
        NumWkRound := ROUND_COEFFICIENT;
    ELSIF pnumRoundTyp = ROUND_TYP_CUTUP    THEN        -- �؂�グ
        NumWkRound := CUTUP_COEFFICIENT;
    ELSIF pnumRoundTyp = ROUND_TYP_CUTDOWN  THEN        -- �؂�̂�
        NumWkRound := CUTDOWN_COEFFICIENT;
    ELSE
        NumWkRound := ROUND_COEFFICIENT;
    END IF;

    IF pnumDecimalFig > 0 THEN
        NumWkDecimal := POWER(10, pnumDecimalFig);
    ELSE
        NumWkDecimal := 1;
    END IF;
    
    IF pnumRoundTyp = ROUND_TYP_CUTUP    THEN          --�؂�グ��
        IF MOD(pnumData * NumWkDecimal , 1) >0   THEN
            pnumResult := TRUNC(pnumData * NumWkDecimal + NumWkRound) / NumWkDecimal;
        ELSE
            pnumResult := TRUNC(pnumData * NumWkDecimal) / NumWkDecimal;  
        END IF;
    ELSE                                               --�l�̌ܓ�,�؂�̂Ď�
        pnumResult := TRUNC(pnumData * NumWkDecimal + NumWkRound) / NumWkDecimal;
    END IF;

    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    RETURN TRUE;

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
        RETURN FALSE;
END;
/