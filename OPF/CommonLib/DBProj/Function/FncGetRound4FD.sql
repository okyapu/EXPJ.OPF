CREATE OR REPLACE FUNCTION FNCGETROUND4FD(
/*------------------------------------------------------------------------------
'
' FncGetRound4FD.Sql
'
' �C������
' 2006.08.17 �V�K�쐬
' 2006.10.31 �ԋp�l�ɃG���[�R�[�h�A�G���[�p�����[�^��ǉ��iJf�p�j
'            �����`�F�b�N��ǉ�
'
' �@�\      : �[������
'
' �߂�l    : Boolean
'               True :����I���i���ʃX�e�[�^�X=1:����I���A2:�x���I���j
'               False:�ُ�I���i���ʃX�e�[�^�X=3:�ُ�I���j
'
' ������    :
'         -- SYSTEM����
'             pFileHandle          - (i)�t�@�C���n���h��
'             pvc2LogMode          - (i)�k�n�f���[�h
'             pvc2OutputMode       - (i)�o�̓��[�h
'             pvc2UserId           - (i)���[�U�h�c
'             pvc2BusinessName     - (i)�Ɩ���
'             pvc2PlantCd          - (i)�H��R�[�h
'         -- �Ɩ��ŗL
'             pnumAmountIn         - (i)�[�������O�̒l
'             pnumDecimalFlg       - (i)��������
'             pnumRoundTyp         - (i)�[�������敪
'             pnumAmountOut        - (o)�[��������̒l
'             pvc2ErrCd            - (o)�G���[�R�[�h
'             pnumStatus           - (o)���ʃX�e�[�^�X(1:����I���A2:�x���I���A3:�ُ�I��)
' �@�\����  :���������ƒ[�������敪�Œ[���������s���B
'
' ���l      :
'
-----------------------------------------------------------------------------*/
    pFileHandle         IN  UTL_FILE.FILE_TYPE  --�t�@�C���n���h��
   ,pvc2LogMode         IN  VARCHAR2            --�k�n�f���[�h
   ,pvc2OutputMode      IN  VARCHAR2            --�o�̓��[�h
   ,pvc2UserId          IN  VARCHAR2            --���[�U�h�c
   ,pvc2BusinessName    IN  VARCHAR2            --�Ɩ���
   ,pvc2PlantCd         IN  VARCHAR2            --�H��R�[�h
   ,pnumAmountIn        IN  NUMBER              --�[�������O�̒l
   ,pnumDecimalFlg      IN  NUMBER              --��������
   ,pnumRoundTyp        IN  NUMBER              --�[�������敪
   ,pnumAmountOut       OUT NUMBER              --�[��������̒l
   ,pvc2ErrCd           OUT VARCHAR2            --�G���[�R�[�h
   ,pnumStatus          OUT NUMBER              --���ʃX�e�[�^�X
    ) RETURN BOOLEAN
IS

/* �萔�̐錾 */
    MY_SQL_NAME         VARCHAR2(64)    := 'FncGetRound4FD';    --�o�k�^�r�p�k��

    ROUND_TYP_ROUND     NUMBER(1)       := 1;                   --�[�������敪(1:�l�̌ܓ�)
    ROUND_TYP_RAISE     NUMBER(1)       := 2;                   --�[�������敪(2:�؂�グ)
    ROUND_TYP_OMIT      NUMBER(1)       := 3;                   --�[�������敪(3:�؂�̂�)

    ROUND_COEFFICIENT   NUMBER(2,1)     := 0.5;                 --�l�̌ܓ��p
    RAISE_COEFFICIENT   NUMBER(2,1)     := 1;                   --�؂�グ�p
    OMIT_COEFFICIENT    NUMBER(2,1)     := 0;                   --�؂�̂ėp

    LOGMSG_START        VARCHAR2(20)     := 'Start';            --���O�p���\�b�h�J�n�錾
    LOGMSG_END          VARCHAR2(12)     := 'End';              --���O�p���\�b�h�I���錾
--  LOGMSG_PARM_ERR     VARCHAR2(32)     := 'ParamErr';         --���O�p���\�b�h�p�����[�^�G���[�錾

    STATUS_NORMAL     CONSTANT   NUMBER(01)     := 1;  -- ����I��
    STATUS_WARNING    CONSTANT   NUMBER(01)     := 2;  -- �x���I��
    STATUS_ERROR      CONSTANT   NUMBER(01)     := 3;  -- �ُ�I��

    -- ���b�Z�[�W�R�[�h
    JF_COM_ERR_WRONG_VALUE                 VARCHAR(28)  := 'ZZ05105';               --�l���s���ł�
    JF_COM_ERR_ORACLE_ERROR                VARCHAR(28)  := 'AC53401';               --ORACLE�G���[

/* �ϐ��̐錾 WORK */
    blnRet              BOOLEAN;
    numWkRound          NUMBER(2,1);
    numWkDecimal        NUMBER(28);

    -- ��O�̐錾
    excParameterErr              EXCEPTION;          --�u�����v�G���[
--  excFncTraceLog               EXCEPTION;          --�g���[�X���O�o�̓G���[
--  excResultErr                 EXCEPTION;          --�v�Z���ʃG���[
--  excNotFound                  EXCEPTION;          --�}�X�^NOT FOUND

BEGIN
    pnumAmountOut  :=  0;              --�[��������̒l
    pnumStatus     :=  STATUS_NORMAL;  --���ʃX�e�[�^�X
    pvc2ErrCd      :=  NULL;           --�G���[�R�[�h

    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

    /* �����`�F�b�N */

    -- �[�������O�̒l --
    IF (pnumAmountIn IS NULL) THEN  -- NULL
        RAISE excParameterErr;
    ELSIF pnumAmountIn = '' THEN   -- �󕶎�
        RAISE excParameterErr;
    END IF;

   -- �������� --
    IF (pnumDecimalFlg IS NULL) THEN  -- NULL
        RAISE excParameterErr;
    ELSIF pnumDecimalFlg = '' THEN   -- �󕶎�
        RAISE excParameterErr;
    ELSE
        /* �����_�ȉ��P���ȏ�̏ꍇ */
        IF pnumDecimalFlg > 0 THEN
            numWkDecimal := POWER(10, pnumDecimalFlg);
        /* �����_�ȉ��O���̏ꍇ */
        ELSE
            numWkDecimal := 1;
        END IF;
    END IF;

    -- �[�������W�� --
    IF (pnumRoundTyp IS NULL) THEN  -- NULL
        RAISE excParameterErr;
    ELSIF pnumRoundTyp = '' THEN   -- �󕶎�
        RAISE excParameterErr;
    ELSE
        IF pnumRoundTyp = ROUND_TYP_ROUND THEN       -- �l�̌ܓ�
            numWkRound := ROUND_COEFFICIENT;
        ELSIF pnumRoundTyp = ROUND_TYP_RAISE THEN    -- �؂�グ
            numWkRound := RAISE_COEFFICIENT;
        ELSIF pnumRoundTyp = ROUND_TYP_OMIT THEN     -- �؂�̂�
            numWkRound := OMIT_COEFFICIENT;
        ELSE                                         -- ���̑�
            RAISE excParameterErr;
        END IF;
    END IF;

    /* ���̒l�̏ꍇ */
    IF pnumAmountIn < 0 THEN
        numWkRound := numWkRound * (-1);
    END IF;

    /* �[���������s�� */

    IF pnumRoundTyp = ROUND_TYP_RAISE THEN          --�؂�グ��
        IF MOD(pnumAmountIn * numWkDecimal , 1) != 0   THEN
            pnumAmountOut := TRUNC(pnumAmountIn * numWkDecimal + numWkRound) / numWkDecimal;
        ELSE
            pnumAmountOut := TRUNC(pnumAmountIn * numWkDecimal) / numWkDecimal;
        END IF;
    ELSE                                               --�l�̌ܓ�,�؂�̂Ď�
    	pnumAmountOut := TRUNC(pnumAmountIn * numWkDecimal + numWkRound) / numWkDecimal;
    END IF;

    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    RETURN TRUE;

--< ��O���� >---------------------------------------------------------------
EXCEPTION
    WHEN excParameterErr THEN
        pnumAmountOut  := 0;
        pnumStatus     := STATUS_ERROR;              --���ʃX�e�[�^�X
        pvc2ErrCd      := JF_COM_ERR_WRONG_VALUE;    --�G���[�R�[�h
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        RETURN FALSE;
    WHEN OTHERS THEN
        pnumAmountOut  := 0;
        pnumStatus     := STATUS_ERROR;              --���ʃX�e�[�^�X
        pvc2ErrCd      := JF_COM_ERR_ORACLE_ERROR;   --�G���[�R�[�h
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
