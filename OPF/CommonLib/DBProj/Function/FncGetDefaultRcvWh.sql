CREATE OR REPLACE FUNCTION FNCGETDEFAULTRCVWH(
/*------------------------------------------------------------------------------
' Copyright (c) 2003-2004 NEC Corporation.
' Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
'
'$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/DBProj/Function/FncGetDefaultRcvWh.sql,v $
'$Author: tai-yanhong $
'$Revision: 1.5 $
'
' �C������
' 2005.01.19 �V�K�쐬
' 2005.03.14 �O���\�ۊǋ�R�[�h�擾�̌�����������A
'            ���v�ʌv�Z�Ώۃt���O���P���폜�B
' 2005.10.21 unicode�Ή��ivarchar2��4�{�j
'
' �@�\      : �f�t�H���g�󂯓���ۊǋ�擾
'
' �߂�l    : BOOLEAN
'               �f�[�^�����݂����ꍇ   �� TRUE
'               �f�[�^�����݂��Ȃ��ꍇ �� FALSE
'
' ������    : pFileHandle          - (i)�t�@�C���n���h��
'             pvc2LogMode          - (i)�k�n�f���[�h
'             pvc2OutputMode       - (i)�o�̓��[�h
'             pvc2UserId           - (i)���[�U�h�c
'             pvc2BusinessName     - (i)�Ɩ���
'             pvc2PlantCd          - (i)�H��R�[�h
'             pvc2ItemCd           - (i)�i�ڔԍ�
'             pvc2WhCd             - (o)�������ʂ̕ۊǋ�R�[�h
'
' �@�\����  : ����ۊǋ�̋K��l�Ƃ��Ďg�p����ۊǋ�R�[�h���擾����B
'
' ���l      : �ȉ��̏��ԂŎ擾���A�f�[�^�����݂����Ƃ���ŏ����I���B
'             �@[�i�ڕʓ��ɐ�ۊǋ�]���������H��R�[�h��A��i�ڔԍ��������
'               ���v�ʌv�Z�Ώۂ̕ۊǋ�R�[�h���擾����B
'             �A[�ۊǋ�]���������H��R�[�h������ɏ��v�ʌv�Z�Ώۋy�ъO���\
'               �̍ŏ��ۊǋ�R�[�h���擾����B
'             �B[�ۊǋ�]���������H��R�[�h������ɏ��v�ʌv�Z�Ώۂ̕ۊǋ�R�[�h
'               ���擾����B
'
------------------------------------------------------------------------------*/
    pFileHandle         IN  UTL_FILE.FILE_TYPE  --�t�@�C���n���h��
   ,pvc2LogMode         IN  VARCHAR2            --�k�n�f���[�h
   ,pvc2OutputMode      IN  VARCHAR2            --�o�̓��[�h
   ,pvc2UserId          IN  VARCHAR2            --���[�U�h�c
   ,pvc2BusinessName    IN  VARCHAR2            --�Ɩ���
   ,pvc2PlantCd         IN  VARCHAR2            --�H��R�[�h
   ,pvc2ItemCd          IN  VARCHAR2            --�i�ڔԍ�
   ,pvc2WhCd            OUT VARCHAR2            --�������ʂ̕ۊǋ�R�[�h
) RETURN BOOLEAN IS

/* ��O�̐錾 */
    excParamErr         EXCEPTION;              -- �p�����[�^�G���[

/* �ϐ��̐錾 */
    vc2Comment          VARCHAR2(4000) := '';   -- ���b�Z�[�W�p�R�����g�쐬��Ɨ̈�
    bPrmErrFlg          BOOLEAN := TRUE;        -- FALSE�F�����G���[
    bPrmFoundFlg        BOOLEAN := FALSE;       -- TRUE�F�Ώۃf�[�^�L��
    blnRet              BOOLEAN;                -- BOOLEAN�^ �ԋp�l
    vc2WhCd             VARCHAR2(100);           -- �����p�ۊǋ�R�[�h

/* �萔�̐錾 */
    MY_SQL_NAME         CONSTANT VARCHAR2(72)  := 'FncGetDefaultRcvWh'; --�o�k�^�r�p�k��
    LOGMSG_START        CONSTANT VARCHAR2(20)   := 'Start';              --���O�p���\�b�h�J�n�錾
    LOGMSG_END          CONSTANT VARCHAR2(12)   := 'End';                --���O�p���\�b�h�I���錾
    PrmPlantCd          CONSTANT VARCHAR2(84)  := '(SBM0826)[�H��R�[�h]';
    PrmItemCd           CONSTANT VARCHAR2(76)  := '(SBM0827)[�i�ڔԍ�]';
    ArgumentError       CONSTANT VARCHAR2(172)  := '(SBM0828)�p�����[�^�������͂܂��͕s���ł��B';
    DataNotFound        CONSTANT VARCHAR2(128)  := '�Ώۃf�[�^�����݂��܂���ł����B';
    numMrpTarget        CONSTANT NUMBER := 1;                           -- ���v�ʑΏۃt���O 1:���v�ʌv�Z�Ώ�
    numOutsideTypical   CONSTANT NUMBER := 1;                           -- �O���\�t���O 1:��\

/* �J�[�\���̐錾 */
    -- [�i�ڕʓ��ɐ�ۊǋ�]����ۊǋ��Ǎ���
    CURSOR crsMItemRcvWh (
            vc2PlantCd   VARCHAR2,    -- �H��R�[�h
            vc2ItemCd    VARCHAR2     -- �i�ڔԍ�
            ) IS
        SELECT
         M_ITEM_RCV_WH.WH_CD AS WH_CD
        FROM
         M_ITEM_RCV_WH,
         M_WH
        WHERE
         M_ITEM_RCV_WH.WH_CD = M_WH.WH_CD
         AND M_ITEM_RCV_WH.PLANT_CD = pvc2PlantCd
         AND M_ITEM_RCV_WH.ITEM_CD = pvc2ItemCd
         AND M_WH.MRP_FLG = numMrpTarget;

    -- [�ۊǋ�]���珊�v�ʑΏۂ̊O��ۊǋ��Ǎ���
    CURSOR crsOutTypWh (
            vc2PlantCd   VARCHAR2    -- �H��R�[�h
            ) IS
        SELECT
         MIN(M_WH.WH_CD) AS WH_CD
        FROM
         M_WH
        WHERE
         M_WH.PLANT_CD = pvc2PlantCd
         AND M_WH.WH_OUTSIDE_FLG = numOutsideTypical;

    -- [�ۊǋ�]���珊�v�ʑΏۂ̍ŏ��ۊǋ��Ǎ���
    CURSOR crsMinimumWh (
            vc2PlantCd   VARCHAR2    -- �H��R�[�h
            ) IS
        SELECT
         MIN(M_WH.WH_CD) AS WH_CD
        FROM
         M_WH
        WHERE
         M_WH.PLANT_CD = pvc2PlantCd
         AND M_WH.MRP_FLG = numMrpTarget;

/* ROWTYPE �̐錾 */
    recMItemRcvWh   crsMItemRcvWh%ROWTYPE;      -- [�i�ڕʓ��ɐ�ۊǋ�]���R�[�h�i�[
    recOutTypWh     crsOutTypWh%ROWTYPE;        -- [�ۊǋ�]�̏��v�ʌv�Z�Ώہ��O�샌�R�[�h�i�[
    recMinimumWh    crsMinimumWh%ROWTYPE;       -- [�ۊǋ�]�̏��v�ʌv�Z�Ώۃ��R�[�h�i�[

/* �����֐� */
    /*------------------------------------------------------------------------------
    '
    ' SubFncGetRcvByItem
    '
    ' �C������  2005.01.19 �V�K�쐬
    '
    ' �@�\      : �H��E�i�ږ��̊���ۊǋ�擾����
    '
    ' ������    : vc2PlantCd     - (i)�H��R�[�h
    '           : vc2ItemCd      - (i)�i�ڔԍ�
    '           : vc2RcvWhCd     - (o)�������ʂ̕ۊǋ�R�[�h
    '
    ' �߂�l    : BOOLEAN
    '             �f�[�^�����݂����ꍇ   �� TRUE
    '             �f�[�^�����݂��Ȃ��ꍇ �� FALSE
    '
    ' �@�\����  : [�i�ڕʓ��ɐ�ۊǋ�]���������H��R�[�h��A��i�ڔԍ��������
    '             ���v�ʌv�Z�Ώۂ̕ۊǋ�R�[�h���擾����B
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION  SubFncGetRcvByItem(
        vc2PlantCd       IN  VARCHAR2,   --�H��R�[�h
        vc2ItemCd        IN  VARCHAR2,   --�i�ڔԍ�
        vc2RcvWhCd       OUT VARCHAR2    --�������ʂ̕ۊǋ�R�[�h
    ) RETURN BOOLEAN IS

    BEGIN

        -- [�i�ڕʓ��ɐ�ۊǋ�]�̓Ǎ����s
        OPEN crsMItemRcvWh(vc2PlantCd, vc2ItemCd);
        FETCH crsMItemRcvWh INTO recMItemRcvWh;

        -- ���݃`�F�b�N
        IF crsMItemRcvWh%NOTFOUND THEN
            RETURN FALSE;
        END IF;

        -- �ۊǋ�R�[�h�̃Z�b�g
        vc2RcvWhCd := recMItemRcvWh.WH_CD;

        CLOSE crsMItemRcvWh;
        RETURN TRUE;

    END;

    /*------------------------------------------------------------------------------
    '
    ' SubFncgetOutsideTypical
    '
    ' �C������  2005.01.19 �V�K�쐬
    '
    ' �@�\      : �H�ꖈ�̋K��l�ۊǋ�擾
    '
    ' ������    : vc2PlantCd     - (i)�H��R�[�h
    '           : vc2RcvWhCd     - (o)�������ʂ̕ۊǋ�R�[�h
    '
    ' �߂�l    : BOOLEAN
    '             �f�[�^�����݂����ꍇ   �� TRUE
    '             �f�[�^�����݂��Ȃ��ꍇ �� FALSE
    '
    ' �@�\����  : [�ۊǋ�]���������H��R�[�h������ɊO���\
    '             �̍ŏ��ۊǋ�R�[�h���擾����B
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION  SubFncgetOutsideTypical(
        vc2PlantCd       IN  VARCHAR2,   --�H��R�[�h
        vc2RcvWhCd       OUT VARCHAR2    --�������ʂ̕ۊǋ�R�[�h
    ) RETURN BOOLEAN IS

    BEGIN

        -- [�ۊǋ�]�̓Ǎ����s
        OPEN crsOutTypWh(vc2PlantCd);
        FETCH crsOutTypWh INTO recOutTypWh;

        -- ���݃`�F�b�N
        IF recOutTypWh.WH_CD IS NULL THEN
            RETURN FALSE;
        END IF;

        -- �ۊǋ�R�[�h�̃Z�b�g
        vc2RcvWhCd := recOutTypWh.WH_CD;

        CLOSE crsOutTypWh;
        RETURN TRUE;

    END;

    /*------------------------------------------------------------------------------
    '
    ' SubFncgetMinimum
    '
    ' �C������  2005.01.19 �V�K�쐬
    '
    ' �@�\      : �H�ꖈ�̕ۊǋ�R�[�h�ŏ��̕ۊǋ�擾����
    '
    ' ������    : vc2PlantCd     - (i)�H��R�[�h
    '           : vc2RcvWhCd     - (o)�������ʂ̕ۊǋ�R�[�h
    '
    ' �߂�l    : BOOLEAN
    '             �f�[�^�����݂����ꍇ   �� TRUE
    '             �f�[�^�����݂��Ȃ��ꍇ �� FALSE
    '
    ' �@�\����  : [�ۊǋ�]���������H��R�[�h������ɏ��v�ʌv�Z�Ώۂ̕ۊǋ�R�[�h
    '             ���擾����B
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION  SubFncgetMinimum(
        vc2PlantCd       IN  VARCHAR2,   --�H��R�[�h
        vc2RcvWhCd          OUT VARCHAR2    --�������ʂ̕ۊǋ�R�[�h
    ) RETURN BOOLEAN IS

    BEGIN

        -- [�ۊǋ�]�̓Ǎ����s
        OPEN crsMinimumWh(vc2PlantCd);
        FETCH crsMinimumWh INTO recMinimumWh;

        -- ���݃`�F�b�N
        IF recMinimumWh.WH_CD IS NULL THEN
            RETURN FALSE;
        END IF;

        -- �ۊǋ�R�[�h�̃Z�b�g
        vc2RcvWhCd := recMinimumWh.WH_CD;

        CLOSE crsMinimumWh;
        RETURN TRUE;

    END;

BEGIN

    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

    /* ������H��R�[�h��̃`�F�b�N */
    IF pvc2PlantCd IS NULL OR pvc2PlantCd='' THEN
        vc2Comment := vc2Comment || PrmPlantCd;
        bPrmErrFlg := FALSE;
    END IF;

    /* ������i�ڔԍ���̃`�F�b�N */
    IF pvc2ItemCd IS NULL OR pvc2ItemCd='' THEN
        vc2Comment := vc2Comment || PrmItemCd;
        bPrmErrFlg := FALSE;
    END IF;

    IF bPrmErrFlg=FALSE THEN
        RAISE excParamErr;
    END IF;

    /* �H��E�i�ږ��̊���ۊǋ�擾 */
    blnRet := SubFncGetRcvByItem(pvc2PlantCd, pvc2ItemCd, vc2WhCd);
    IF blnRet=TRUE THEN
        pvc2WhCd := vc2WhCd;
        bPrmFoundFlg := TRUE;
    END IF;

    /* �H�ꖈ�̊���l�ۊǋ�擾 */
    IF bPrmFoundFlg=FALSE THEN
        blnRet := SubFncgetOutsideTypical(pvc2PlantCd, vc2WhCd);
        IF blnRet=TRUE THEN
            pvc2WhCd := vc2WhCd;
            bPrmFoundFlg := TRUE;
        END IF;
    END IF;

    /* �H�ꖈ�̕ۊǋ�R�[�h�ŏ��̕ۊǋ�擾 */
    IF bPrmFoundFlg=FALSE THEN
        blnRet := SubFncgetMinimum(pvc2PlantCd, vc2WhCd);
        IF blnRet=TRUE THEN
            pvc2WhCd := vc2WhCd;
            bPrmFoundFlg := TRUE;
        END IF;
    END IF;

    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    IF bPrmFoundFlg=TRUE THEN
        RETURN TRUE;
    ELSE
        RETURN FALSE;
    END IF;

--< ��O���� >---------------------------------------------------------------
EXCEPTION
    WHEN excParamErr THEN    -- �p�����[�^�G���[

        /* ErrLog �̏o�� */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2PlantCd, pvc2UserId, pvc2BusinessName,
                              MY_SQL_NAME, ArgumentError, vc2Comment);

        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2PlantCd, pvc2UserId, pvc2BusinessName,
                              MY_SQL_NAME, LOGMSG_END);

        RETURN FALSE;

    WHEN OTHERS THEN   --���̑��̃G���[
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
