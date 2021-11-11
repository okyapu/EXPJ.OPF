CREATE OR REPLACE PROCEDURE SqlCreditInformationToAi(
/*------------------------------------------------------------------------------
'
' SqlCreditInformationToAi.Sql
'
' version   : 1.00.00
'
' �C������
'
' �@�\      : �`���A�g���|�C���^�t�F�[�X����
'
' ������    : pvc2LogMode          - (i)�k�n�f���[�h'
'             pvc2OutputMode       - (i)�o�̓��[�h'
'             pvc2OutputPath       - (i)�o�̓t�@�C���p�X
'             pvc2OutputName       - (i)�o�̓t�@�C����
'             pvc2UserId           - (i)���[�U�h�c
'             pvc2BusinessName     - (i)�Ɩ���
'             pvc2PlantCd          - (i)�H��R�[�h
'             pvc2ErrorCd          - (o)�G���[�R�[�h
'             pnumStatus           - (o)���ʃX�e�[�^�X
'
' �@�\����  : EXPLANNER/J�i�i���^�ia�j��[�������]�A[������уw�b�_]�A[�L���x������]���甄�|�����W�񂵂āAA���A�g���|�C���^�t�F�[�X�Ƀf�[�^�o�^����B
'
' ���l      : ���ɂȂ�
'
------------------------------------------------------------------------------*/
    pvc2LogMode                 IN  VARCHAR2    --�k�n�f���[�h
   ,pvc2OutputMode              IN  VARCHAR2    --�o�̓��[�h
   ,pvc2OutputPath              IN  VARCHAR2    --�o�̓t�@�C���p�X
   ,pvc2OutputName              IN  VARCHAR2    --�o�̓t�@�C����
   ,pvc2UserId                  IN  VARCHAR2    --���[�U�h�c
   ,pvc2BusinessName            IN  VARCHAR2    --�Ɩ���
   ,pvc2PlantCd                 IN  VARCHAR2    --�H��R�[�h
   ,pvc2ErrorCd                 OUT VARCHAR2    --�G���[�R�[�h
   ,pnumStatus                  OUT NUMBER      --���ʃX�e�[�^�X�i1:����I���A2:���[�j���O�I���A3:�ُ�I���j
) IS

/* �萔�̐錾 */

    MY_SQL_NAME                           VARCHAR2(120):= 'SQLCREDITINFORMATIONTOAI';	--�o�k�^�r�p�k��

    --//�Ɩ����O�p���b�Z�[�WID
    LOGMSG_ID_COMMON_CHK                  VARCHAR2(28) := 'BF00011';    --�������s���̂��ߏ������ł��܂���ł����B
    LOGMSG_ID_START                       VARCHAR2(28) := 'BF00021';    --�`���A�g���|�C���^�t�F�[�X�������J�n���܂����B
    LOGMSG_ID_AI_AR_FAIL                  VARCHAR2(28) := 'BF00019';    --�`���A�g���|�C���^�t�F�[�X���̓o�^�Ɏ��s���܂����B
    LOGMSG_ID_READ_FAIL                   VARCHAR2(28) := 'BF00015';    --�`���A�g���|�C���^�t�F�[�X����������I�����܂����B
    LOGMSG_ID_EXCH_RATE                   VARCHAR2(28) := 'BF00017';    --�בփ��[�g���擾�ł��܂���ł����B
    LOGMSG_ID_AI_AR_IF_INS                VARCHAR2(28) := 'BF00020';    --�L���x���C���^�t�F�[�X���̓o�^�Ɏ��s���܂����B
    LOGMSG_ID_PAST_UPD                    VARCHAR2(28) := 'BF00014';    --������эX�V���������s���܂����B
    LOGMSG_ID_END                         VARCHAR2(28) := 'BF00025';    --�`���A�g���|�C���^�t�F�[�X����������I�����܂����B
    LOGMSG_ID_ERR                         VARCHAR2(28) := 'BF00016';    --�`���A�g���|�C���^�t�F�[�X�������ُ�I�����܂����B
    LOGMSG_ID_RATE_ERROR                  VARCHAR2(28) := 'BF00022';    --�בփ��[�g�擾�����ŃG���[���������܂����B


    --//�Ɩ����O�p���b�Z�[�Wf
    LOGMSG_NM_COMMON_CHK                  VARCHAR2(200) := '(SBM0017)�������s���̂��ߏ������ł��܂���ł����B';  
    LOGMSG_NM_START                       VARCHAR2(200) := '(SBM0770)�`���A�g���|�C���^�t�F�[�X�������J�n���܂����B';
    LOGMSG_NM_AI_AR_FAIL                  VARCHAR2(200) := '�`���A�g���|�C���^�t�F�[�X���̓o�^�Ɏ��s���܂����B';
    LOGMSG_NM_READ_FAIL                   VARCHAR2(200) := '�`���A�g���|�C���^�t�F�[�X����������I�����܂����B'; 
    LOGMSG_NM_EXCH_RATE                   VARCHAR2(200) := '(SBM0718)�בփ��[�g���擾�ł��܂���ł����B';
    LOGMSG_NM_AI_AR_IF_INS                VARCHAR2(200) := '�L���x���C���^�t�F�[�X���̓o�^�Ɏ��s���܂����B';
    LOGMSG_NM_PAST_UPD                    VARCHAR2(200) := '������эX�V���������s���܂����B';
    LOGMSG_NM_END                         VARCHAR2(200) := '�`���A�g���|�C���^�t�F�[�X����������I�����܂����B';
    LOGMSG_NM_ERR                         VARCHAR2(200) := '�`���A�g���|�C���^�t�F�[�X�������ُ�I�����܂����B';
    LOGMSG_NM_RATE_ERROR                  VARCHAR2(200) := '(SBM0719)�בփ��[�g�擾�����ŃG���[���������܂����B';
    --//�Ɩ�������
    LOGMSG_STR_MESSAGE                    VARCHAR2(200):= '(SBM0303)<< �`���A�g���|�C���^�t�F�[�X�����J�n�@>>'; --�Ɩ��������`
                                                                                     
    --//���ʃX�e�[�^�X
    STATUS_NORMAL                         NUMBER        := 1;   -- ����I��
    STATUS_WARNING                        NUMBER        := 2;   -- ���[�j���O
    STATUS_ERROR                          NUMBER        := 3;   -- �ُ�I��

/* �ϐ��̐錾 WORK */

    --//����`�ُ�
    excFncTraceLog                         EXCEPTION;           --���O���������s
    excCommonChk                           EXCEPTION;           --���ʈ������s
    excFnc                                 EXCEPTION;           --������捞�������s
    LOGMSG_NM_END                          VARCHAR2(200);       --�����I���錾
    UTL_FileHandle                         UTL_FILE.FILE_TYPE;  --�t�@�C���n���h��
    blnRet                                 BOOLEAN;             --���ʊ֐��̖ߒl

    --//�ڍ׃��b�Z�[�W�i�[�p
    vc2Comment                             VARCHAR2(1024);

    --//�����ϐ��̐錾
     wnumTaxAmount1                        NUMBER;              --�Ŋz1
     wnumTaxAmount2                        NUMBER;              --�Ŋz2
     wnumTaxAmount3                        NUMBER;              --�Ŋz3
     wnumTaxOutAmount                      NUMBER;              --�Ŕ����z
     wnumTaxAmount                         NUMBER;              --����ŋ��z
     wnumTaxInAmount                       NUMBER;              --�ō����z
     wnumExternalTaxSalesAmount            NUMBER;              --�O�őΏۋ��z
     wnumInternalTaxSalesAmount            NUMBER;              --���őΏۋ��z
     wnumTaxFreeSalesAmount                NUMBER;              --��ېőΏۋ��z
     wnumExternalTaxAmount                 NUMBER;              --����Ŋz�i�O�Łj
     wnumInternalTaxAmount                 NUMBER;              --����Ŋz�i���Łj
     wnumSalesAmount                       NUMBER;              --������ы��z
     wnumSalesAmounExchRates               NUMBER;              --������ы��z(�M��)
     wnumTaxCreditAmount                   NUMBER;              --�Ŕ�������z
     wnumTaxCreditAmountExchRates          NUMBER;              --�Ŕ�������z(�M��)
     wnumExchRate                          NUMBER;              --�בփ��[�g
     wnumDataExist                         NUMBER;              --�f�[�^�����݃t���O
     wnumDataExist1                        NUMBER;              --�f�[�^�����݃t���O
     wnumTotalCount                        NUMBER;              --�����f�[�^����
     wnumNormalCount                       NUMBER;              --���팏��
     wnumWarnCount                         NUMBER;              --���[�j���O����
     wnumErrorCount                        NUMBER;              --�G���[����
     wblnErrorFlg                          BOOLEAN;             --�G���[�̃t���O
     wblnWarnFlg                           BOOLEAN;             --���[�j���O�̃t���O
     wnumCount0                            NUMBER;              --�L���x�����z���O�f�[�^��
    
/* �J�[�\���̐錾*/
    --//[�L���x������]���甄�|�����擾����
    CURSOR CUR_T_PAST_ONEROUS_CONS
    IS 
    SELECT
        A.ONEROUS_CONS_NO,                                      --[�L���x������]�D�g�L���x���ԍ��h
        A.ISSUE_DATE,                                           --[�L���x������]�D�g�o�ɓ��h
        A.VEND_CD,                                              --[�L���x������]�D�g�����R�[�h�h
        A.PLANT_CD,                                             --[�L���x������]�D�g�H��R�[�h�h
        B.CUR_CD,                                               --[�����]�D�g�ʉ݃R�[�h�h
        B.EXCH_TYP,                                             --[�����]�D�g�ב֎�ʁh
        B.ROUND_TYP,                                            --[�����]�D�g�������z�܂�ߋ敪�h
        A.ITEM_CD,                                              --[�L���x������]�D�g�i�ڔԍ��h
        C.ITEM_NAME,                                            --[�i��]�D�g�i�ږ��h
        A.ISSUE_QTY,                                            --[�L���x������]�D�g�o�ɐ��h
        C.STOCK_UNIT,                                           --[�i��]�D�g�v�ʒP�ʁh
        A.UNIT_COST,                                            --[�L���x������]�D�g�P���h
        B.TAX_CD,                                               --[�����]�D�g����ŃR�[�h�h
        D.DECIMAL_FIG,                                          --[�ʉ�]�D�g���������h
        E.NEW_TAX_RATE_1,                                       --[����ŋ敪�}�X�^]�D�g�V�ŗ�1�h
        E.NEW_TAX_RATE_2,                                       --[����ŋ敪�}�X�^]�D�g�V�ŗ�2�h
        E.NEW_TAX_RATE_3,                                       --[����ŋ敪�}�X�^]�D�g�V�ŗ�3�h
        A.PUCH_ODR_CD                                           --[�L���x������]�D"�����ԍ�"
    FROM
        T_PAST_ONEROUS_CONS A,                                  --[�L���x������]
        M_VEND_CTRL B,                                          --[�����]
        M_ITEM C,                                               --[�i��]
        M_CUR D,                                                --[�ʉ�]
        M_TAX E,                                                --[����ŋ敪�}�X�^]
        (SELECT
            COMPANY_CD AS "COMPANY_CD"                          --[����]�D"��ЃR�[�h"
         FROM
            SYS_MY_COMPANY                                      --[����]
        WHERE
            CTRL_CD = 'SYSTEM') G
    WHERE
        A.VEND_CD      = B.VEND_CD
    AND A.ITEM_CD      = C.ITEM_CD
    AND A.COMPANY_CD   = G.COMPANY_CD
    AND B.CUR_CD       = D.CUR_CD 
    AND B.TAX_CD       = E.TAX_CD
    AND A.ISSUE_QTY    <>0  
    AND A.UNIT_COST   <>0
    AND A.AI_AR_IF_FLG = 0;

BEGIN
     /* LogFile �� OPEN */
    blnRet :=  FNCLOGOPEN(pvc2OutputPath, pvc2OutputName, pvc2PlantCd, pvc2OutputMode, UTL_FileHandle);

    /* TraceLog�̏o��(Start)�������s�� */
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_START);

    IF (NOT blnRet) THEN        
        --//���ʃX�e�[�^�X���ُ���Z�b�g����
        pnumStatus := STATUS_ERROR;
        RAISE excFncTraceLog;
    END IF;

    /* �Ɩ��J�n���b�Z�[�W�̏o�� */
    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                        pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_START, LOGMSG_STR_MESSAGE);

    --//���ʈ����`�F�b�N
    --�k�n�f���[�h
    IF pvc2LogMode IS NULL THEN
        pnumStatus := STATUS_ERROR;
        RAISE excCommonChk;
    END IF;

    --�o�̓��[�h
    IF pvc2OutputMode IS NULL THEN
        pnumStatus := STATUS_ERROR;
        RAISE excCommonChk;
    END IF;

    --�o�̓t�@�C���p�X
    IF pvc2OutputPath IS NULL THEN
        pnumStatus := STATUS_ERROR;
        RAISE excCommonChk;
    END IF;

    --�o�̓t�@�C����
    IF pvc2OutputName IS NULL THEN
        pnumStatus := STATUS_ERROR;
        RAISE excCommonChk;
    END IF;

    --���[�U�h�c
    IF pvc2UserId IS NULL THEN
        pnumStatus := STATUS_ERROR;
        RAISE excCommonChk;
    END IF;

    --�Ɩ���
    IF pvc2BusinessName IS NULL THEN
        pnumStatus := STATUS_ERROR;
        RAISE excCommonChk;
    END IF;

    --�H��R�[�h
    IF pvc2PlantCd IS NULL THEN
        pnumStatus := STATUS_ERROR;
        RAISE excCommonChk;
    END IF;
    --//�J�E���^�A�ϐ��̏�����
    wnumTotalCount  := 0;
    wnumNormalCount := 0;
    wnumWarnCount   := 0;
    wnumErrorCount  := 0;

    --//�`���A�g���|�C���^�t�F�[�X�����iJf������捞�����j
    BEGIN
        SELECT
            COUNT(OPTION_ID)        --�V�X�e���I�v�V�������ʎq
        INTO
            wnumDataExist
        FROM
            SYS_INSTALL_OPTIONS     --�C���X�g�[���I�v�V���� 
        WHERE
            OPTION_ID = 'JF*'
            AND INSTALL_FLG =1;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            wnumDataExist := 0;
    END;

    --//�`���A�g���|�C���^�t�F�[�X�����iJa������捞�����j
    BEGIN
        SELECT
            COUNT(OPTION_ID)        --�V�X�e���I�v�V�������ʎq
        INTO
            wnumDataExist1
        FROM
            SYS_INSTALL_OPTIONS     --�C���X�g�[���I�v�V���� 
        WHERE
            OPTION_ID = 'JA*'
            AND INSTALL_FLG =1;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            wnumDataExist := 0;
    END;

    --//�C���X�g�[���V�X�e�����@EXPLANNER/Jf�ꍇ�A���L�悤�A�u�`���A�g���|�C���^�t�F�[�X�����iJf������捞�����j�v���������s����
    IF wnumDataExist <> 0 THEN 
        IF wnumDataExist1<>0 THEN
            vc2Comment:= SUBSTR('(SBM0304)�C���X�g�[���I�v�V�����ɂ́A�i���Ƃi���̂����ꂩ����ɂ̂ݓ����t���O��ݒ肵�Ă��������B', 1, 256);
            /* TraceLog �̏o�� */
            blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                                      pvc2PlantCd, MY_SQL_NAME, vc2Comment);
            /* �Ɩ��I�����b�Z�[�W�̏o�� */
            blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                        pvc2PlantCd, MY_SQL_NAME,LOGMSG_ID_ERR,vc2Comment);
            --//�������f����
            RAISE excFnc;
        END IF;
    END IF;

    IF wnumDataExist <> 0 THEN
        BEGIN
            blnRet := FNCCREDITINFORMATIONTOAiJf(
                                                 UTL_FileHandle     --�t�@�C���n���h��
                                                ,pvc2LogMode        --�k�n�f���[�h
                                                ,pvc2OutputMode     --�o�̓��[�h
                                                ,pvc2UserId         --���[�U�h�c
                                                ,pvc2BusinessName   --�Ɩ���
                                                ,pvc2PlantCd        --�H��R�[�h
                                                ,wnumTotalCount     --�����f�[�^����
                                                ,wnumNormalCount    --���팏��
                                                ,wnumWarnCount      --���[�j���O����
                                                ,wnumErrorCount     --�ُ팏��
                                                ,pvc2ErrorCd        --�G���[���b�Z�[�WID
                                                ,pnumStatus         --���ʃX�e�[�^�X�i1�F����I�� 2:�x���I�� 3�F�ُ�I���j
            );
            --����
            IF pnumStatus = 1 OR blnRet = TRUE THEN
                vc2Comment:= SUBSTR('(SBM0771)Jf������捞�����@'||
                                    '�����f�[�^�����F['|| wnumTotalCount  ||']�@'||
                                    '���팏���F['      || wnumNormalCount ||']�@'||
                                    '���[�j���O�����F['|| wnumWarnCount   ||']�@'||
                                    '�ُ팏���F['      || wnumErrorCount  ||']  ', 1, 256);

                /* TraceLog �̏o�� */
                blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                                      pvc2PlantCd, MY_SQL_NAME, vc2Comment);

            END IF;
            --�ُ�
            IF blnRet = FALSE THEN
                /* TraceLog �̏o�� */
                blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                                      pvc2PlantCd, MY_SQL_NAME, SQLERRM);

                /* �Ɩ��I�����b�Z�[�W�̏o�� */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                        pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_AI_AR_FAIL, SQLERRM);

                --//�������f����
                RAISE excFnc;
            END IF;
        END;
    --//�C���X�g�[���V�X�e�����@EXPLANNER/Jf�łȂ��ꍇ�A���L�悤�A�u�`���A�g���|�C���^�t�F�[�X�����iJ������捞�����j�v���������s����
    ELSE
        IF wnumDataExist1 <> 0 THEN
            BEGIN
                blnRet := FNCCREDITINFORMATIONTOAiJa(
                                                UTL_FileHandle      --�t�@�C���n���h��
                                               ,pvc2LogMode         --�k�n�f���[�h
                                               ,pvc2OutputMode      --�o�̓��[�h
                                               ,pvc2UserId          --���[�U�h�c
                                               ,pvc2BusinessName    --�Ɩ���
                                               ,pvc2PlantCd         --�H��R�[�h
                                               ,wnumTotalCount      --�����f�[�^����
                                               ,wnumNormalCount     --���팏��
                                               ,wnumWarnCount       --���[�j���O����
                                               ,wnumErrorCount      --�ُ팏��
                                               ,pvc2ErrorCd         --�G���[���b�Z�[�WID
                                               ,pnumStatus          --���ʃX�e�[�^�X�i1�F����I�� 2:�x���I�� 3�F�ُ�I���j
                                             );
                --����
                IF pnumStatus = 1 OR blnRet = TRUE THEN
                    vc2Comment:= SUBSTR('(SBM0772)J������捞�����@'||
                                    '�����f�[�^�����F['|| wnumTotalCount  ||']�@'||
                                    '���팏���F['      || wnumNormalCount ||']�@'||
                                    '���[�j���O�����F['|| wnumWarnCount   ||']�@'||
                                    '�ُ팏���F['|| wnumErrorCount  ||']  ', 1, 256);

                    /* TraceLog �̏o�� */
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                                      pvc2PlantCd, MY_SQL_NAME, vc2Comment);

                END IF;
                --�ُ�
                IF blnRet = FALSE THEN
                    /* TraceLog �̏o�� */
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                                          pvc2PlantCd, MY_SQL_NAME, SQLERRM);

                    /* �Ɩ��I�����b�Z�[�W�̏o�� */
                    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                        pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_AI_AR_FAIL, SQLERRM);

                    --//�������f����
                    RAISE excFnc;
               END IF;
           END;

        ELSE
            BEGIN
                blnRet := FNCCREDITINFORMATIONTOAiJ(
                                                UTL_FileHandle      --�t�@�C���n���h��
                                               ,pvc2LogMode         --�k�n�f���[�h
                                               ,pvc2OutputMode      --�o�̓��[�h
                                               ,pvc2UserId          --���[�U�h�c
                                               ,pvc2BusinessName    --�Ɩ���
                                               ,pvc2PlantCd         --�H��R�[�h
                                               ,wnumTotalCount      --�����f�[�^����
                                               ,wnumNormalCount     --���팏��
                                               ,wnumWarnCount       --���[�j���O����
                                               ,wnumErrorCount      --�ُ팏��
                                               ,pvc2ErrorCd         --�G���[���b�Z�[�WID
                                               ,pnumStatus          --���ʃX�e�[�^�X�i1�F����I�� 2:�x���I�� 3�F�ُ�I���j
                                             );
                --����
                IF pnumStatus = 1 OR blnRet = TRUE THEN
                    vc2Comment:= SUBSTR('(SBM0772)J������捞�����@'||
                                    '�����f�[�^�����F['|| wnumTotalCount  ||']�@'||
                                    '���팏���F['      || wnumNormalCount ||']�@'||
                                    '���[�j���O�����F['|| wnumWarnCount   ||']�@'||
                                    '�ُ팏���F['|| wnumErrorCount  ||']  ', 1, 256);

                    /* TraceLog �̏o�� */
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                                      pvc2PlantCd, MY_SQL_NAME, vc2Comment);

                END IF;
                --�ُ�
                IF blnRet = FALSE THEN
                    /* TraceLog �̏o�� */
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                                          pvc2PlantCd, MY_SQL_NAME, SQLERRM);

                    /* �Ɩ��I�����b�Z�[�W�̏o�� */
                    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                        pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_AI_AR_FAIL, SQLERRM);

                    --//�������f����
                    RAISE excFnc;
                END IF;
            END;
        END IF;
    END IF; 

    FOR Rec_T_PAST_ONEROUS_CONS IN CUR_T_PAST_ONEROUS_CONS LOOP
        wnumTotalCount := wnumTotalCount + 1;
        wblnWarnFlg    := FALSE;
        wblnErrorFlg   := FALSE;
 
        BEGIN
            --//�בփ��[�g�擾����
            BEGIN
                SELECT
                    C.EXCH_RATE
                INTO 
                    wnumExchRate
                FROM
                    (SELECT
                         A.EXCH_RATE                                                --[�בփ��[�g�}�X�^]
                     FROM
                         M_EXCH_RATE    A,                                          --[�בփ��[�g�}�X�^]
                         SYS_MY_COMPANY B                                           --[����]
                     WHERE
                         A.COMPANY_CD      =  B.COMPANY_CD                          --[�בփ��[�g�}�X�^]."��ЃR�[�h" = ���ЃR�[�h
                     AND A.CUR_CD          =  Rec_T_PAST_ONEROUS_CONS.CUR_CD        --[�擾�f�[�^]�D"�ʉ݃R�[�h"
                     AND A.EXCH_TYP        =  Rec_T_PAST_ONEROUS_CONS.EXCH_TYP      --[�擾�f�[�^]�D"�ב֎��" 
                     AND A.EXCH_START_DATE <= Rec_T_PAST_ONEROUS_CONS.ISSUE_DATE    --[�擾�f�[�^]�D"����v���"
                     AND B.CTRL_CD         =  'SYSTEM'                              --[����]."SYS�R���g���[���R�[�h"  = SYSTEM
                     ORDER BY
                         A.EXCH_START_DATE DESC) C
                 WHERE
                     ROWNUM = 1; 
            EXCEPTION
                WHEN NO_DATA_FOUND THEN
                    wnumExchRate := 0;
                    vc2Comment:= SUBSTR('(SBM0305)�בփ��[�g�擾���[�j���O�@'||
                                        '�`�[�ԍ�['|| Rec_T_PAST_ONEROUS_CONS.ONEROUS_CONS_NO ||']�@'|| 
                                        '���[����['|| 1 ||']', 1, 256);

                    /* TraceLog �̏o�� */
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                                          pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_EXCH_RATE);

                    /* �Ɩ��I�����b�Z�[�W�̏o�� */
                    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                        pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_EXCH_RATE, vc2Comment);

                    wblnWarnFlg := TRUE;
                 WHEN OTHERS THEN
                    --//�G���[�̃t���O��ݒ肷��
                    wblnErrorFlg   := TRUE;
                    --//���L�悤�����G���[���O����[�Ɩ����b�Z�[�W]�ɓo�^���āA�����𒆒f����
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                                          pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_RATE_ERROR);
                    /* �Ɩ��I�����b�Z�[�W�̏o�� */
                    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                        pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_RATE_ERROR, SQLERRM);
                    --//�W����
                    GOTO MASK;
            END;
            
            --//������ы��z�A�Ŕ�������z�A�O�őΏۋ��z�A���őΏۋ��z�A���ŏ���ŁA��ېőΏۋ��z�@�̌v�Z
            blnRet := FNCCALCTAXCALCAMTFD(
                                          UTL_FileHandle                                                                   --�t�@�C���n���h��
                                         ,pvc2LogMode                                                                      --�k�n�f���[�h
                                         ,pvc2OutputMode                                                                   --�o�̓��[�h
                                         ,pvc2UserId                                                                       --���[�U�h�c
                                         ,pvc2BusinessName                                                                 --�Ɩ���
                                         ,pvc2PlantCd                                                                      --�H��R�[�h
                                         ,SUBSTR(Rec_T_PAST_ONEROUS_CONS.TAX_CD, -1)                                       --����ŃR�[�h�h�̉��P��
                                         ,Rec_T_PAST_ONEROUS_CONS.NEW_TAX_RATE_1                                           --�ŗ�1
                                         ,Rec_T_PAST_ONEROUS_CONS.NEW_TAX_RATE_2                                           --�ŗ�2
                                         ,Rec_T_PAST_ONEROUS_CONS.NEW_TAX_RATE_3                                           --�ŗ�3
                                         ,Rec_T_PAST_ONEROUS_CONS.ROUND_TYP                                                --�������z�܂�ߋ敪
                                         ,Rec_T_PAST_ONEROUS_CONS.DECIMAL_FIG                                              --��������
                                         ,TO_NUMBER(Rec_T_PAST_ONEROUS_CONS.UNIT_COST * Rec_T_PAST_ONEROUS_CONS.ISSUE_QTY) --�P���~�o�ɐ�
                                         ,wnumTaxAmount1                                                                   --�Ŋz1
                                         ,wnumTaxAmount2                                                                   --�Ŋz2
                                         ,wnumTaxAmount3                                                                   --�Ŋz3
                                         ,wnumTaxOutAmount                                                                 --�Ŕ����z
                                         ,wnumTaxAmount                                                                    --����Ŋz
                                         ,wnumTaxInAmount                                                                  --�ō����z
                                         ,wnumExternalTaxSalesAmount                                                       --�O�őΏۋ��z
                                         ,wnumInternalTaxSalesAmount                                                       --���őΏۋ��z
                                         ,wnumTaxFreeSalesAmount                                                           --��ېőΏۋ��z
                                         ,wnumExternalTaxAmount                                                            --����Ŋz�i�O�Łj
                                         ,wnumInternalTaxAmount                                                            --����Ŋz�i���Łj
                                         ,pvc2ErrorCd                                                                      --�G���[���b�Z�[�WID
                                         ,pnumStatus                                                                       --���ʃX�e�[�^�X�i1�F����I�� 2:�x���I�� 3�F�ُ�I���j
            );

            --�ُ�
            IF pnumStatus = 3 OR blnRet = FALSE THEN
                vc2Comment:= SUBSTR('(SBM0306)�Ōv�Z�ُ�@�L���x���ԍ�['|| Rec_T_PAST_ONEROUS_CONS.ONEROUS_CONS_NO || ']', 1, 256);

                /* TraceLog �̏o�� */
                blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                                      pvc2PlantCd, MY_SQL_NAME, vc2Comment);

                /* �Ɩ��I�����b�Z�[�W�̏o�� */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                    pvc2PlantCd, MY_SQL_NAME, pvc2ErrorCd, vc2Comment);

                wblnErrorFlg := TRUE;
                --//�W����
                GOTO MASK;
                
            END IF;


            --���[�j���O
            IF pnumStatus = 2 THEN
                vc2Comment:= SUBSTR('(SBM0307)�Ōv�Z�v�Z���[�j���O�@�L���x���ԍ�['|| Rec_T_PAST_ONEROUS_CONS.ONEROUS_CONS_NO || ']', 1, 256);

                /* TraceLog �̏o�� */
                blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                                      pvc2PlantCd, MY_SQL_NAME, vc2Comment);
                /* �Ɩ��I�����b�Z�[�W�̏o�� */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                    pvc2PlantCd, MY_SQL_NAME, pvc2ErrorCd, vc2Comment);

                wblnWarnFlg := TRUE;
            END IF;               

            --������ы��z���擾����
            wnumSalesAmount := wnumTaxInAmount;

            --//������ы��z(�M��)�̌v�Z
            blnRet := FNCGETROUND4FD(
                                     UTL_FileHandle                             --�t�@�C���n���h��
                                    ,pvc2LogMode                                --�k�n�f���[�h
                                    ,pvc2OutputMode                             --�o�̓��[�h
                                    ,pvc2UserId                                 --���[�U�h�c
                                    ,pvc2BusinessName                           --�Ɩ���
                                    ,pvc2PlantCd                                --�H��R�[�h
                                    ,TO_NUMBER(wnumSalesAmount * wnumExchRate)  --������ы��z �~ �בփ��[�g
                                    ,Rec_T_PAST_ONEROUS_CONS.DECIMAL_FIG        --��������
                                    ,Rec_T_PAST_ONEROUS_CONS.ROUND_TYP          --�������z�܂�ߋ敪
                                    ,wnumSalesAmounExchRates                    --������ы��z(�M��)
                                    ,pvc2ErrorCd                                --�G���[���b�Z�[�WID
                                    ,pnumStatus                                 --���ʃX�e�[�^�X�i1�F����I�� 2:�x���I�� 3�F�ُ�I���j
            );

            --�ُ�
            IF pnumStatus = 3 OR blnRet = FALSE THEN
                vc2Comment:= SUBSTR('(SBM0315)�������z�i�M�݁j�v�Z�ُ�@�L���x���ԍ�['|| Rec_T_PAST_ONEROUS_CONS.ONEROUS_CONS_NO || ']', 1, 256);

                /* TraceLog �̏o�� */
                blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                                      pvc2PlantCd, MY_SQL_NAME, vc2Comment);

                /* �Ɩ��I�����b�Z�[�W�̏o�� */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                    pvc2PlantCd, MY_SQL_NAME, pvc2ErrorCd, vc2Comment);

                wblnErrorFlg := TRUE;
                --//�W����
                GOTO MASK;
            END IF;

            --���[�j���O
            IF pnumStatus = 2 THEN
                vc2Comment:= SUBSTR('(SBM0315)�������z�i�M�݁j�v�Z�ُ�@�L���x���ԍ�['|| Rec_T_PAST_ONEROUS_CONS.ONEROUS_CONS_NO || ']', 1, 256);

                /* TraceLog �̏o�� */
                blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                                      pvc2PlantCd, MY_SQL_NAME, vc2Comment);

                /* �Ɩ��I�����b�Z�[�W�̏o�� */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                    pvc2PlantCd, MY_SQL_NAME, pvc2ErrorCd, vc2Comment);

                wblnWarnFlg := TRUE;
            END IF;

            --//�Ŕ�������z�i�M�݁j�̌v�Z
            blnRet := FNCGETROUND4FD(
                                     UTL_FileHandle                                 --�t�@�C���n���h��
                                    ,pvc2LogMode                                    --�k�n�f���[�h
                                    ,pvc2OutputMode                                 --�o�̓��[�h
                                    ,pvc2UserId                                     --���[�U�h�c
                                    ,pvc2BusinessName                               --�Ɩ���
                                    ,pvc2PlantCd                                    --�H��R�[�h
                                    ,TO_NUMBER(wnumTaxOutAmount * wnumExchRate)     --�Ŕ�������z �~ �בփ��[�g
                                    ,Rec_T_PAST_ONEROUS_CONS.DECIMAL_FIG            --��������
                                    ,Rec_T_PAST_ONEROUS_CONS.ROUND_TYP              --�������z�܂�ߋ敪
                                    ,wnumTaxCreditAmountExchRates                   --�Ŕ�������z(�M��)
                                    ,pvc2ErrorCd                                    --�G���[���b�Z�[�WID
                                    ,pnumStatus                                     --���ʃX�e�[�^�X�i1�F����I�� 2:�x���I�� 3�F�ُ�I���j
            );

            --�ُ�
            IF pnumStatus = 3 OR blnRet = FALSE THEN
                vc2Comment:= SUBSTR('(SBM0315)�������z�i�M�݁j�v�Z�ُ�@�L���x���ԍ�['|| Rec_T_PAST_ONEROUS_CONS.ONEROUS_CONS_NO || ']', 1, 256);

                /* TraceLog �̏o�� */
                blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                                      pvc2PlantCd, MY_SQL_NAME, vc2Comment);

                /* �Ɩ��I�����b�Z�[�W�̏o�� */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                    pvc2PlantCd, MY_SQL_NAME, pvc2ErrorCd, vc2Comment);

                wblnErrorFlg := TRUE;
                --//�W����
                GOTO MASK;
            END IF;

            --���[�j���O
            IF pnumStatus = 2 THEN
                vc2Comment:= SUBSTR('(SBM0315)�������z�i�M�݁j�v�Z�ُ�@�L���x���ԍ�['|| Rec_T_PAST_ONEROUS_CONS.ONEROUS_CONS_NO || ']', 1, 256);

                /* TraceLog �̏o�� */
                blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                                      pvc2PlantCd, MY_SQL_NAME, vc2Comment);

                /* �Ɩ��I�����b�Z�[�W�̏o�� */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                    pvc2PlantCd, MY_SQL_NAME, pvc2ErrorCd, vc2Comment);

                wblnWarnFlg := TRUE;
            END IF;

            --//[���|���C���^�t�F�[�X]�֓o�^����
            BEGIN
                INSERT INTO T_AI_AR_IF(
                                       INPUT_SLIP_CD                                    --���͓`�[�ԍ�
                                      ,SLIP_ROW_NO                                      --�`�[�s�ԍ�
                                      ,SLIP_CD                                          --�`�[�ԍ�
                                      ,PART_DLV_SEQ_NO                                  --���[����
                                      ,PUCH_ODR_CD                                      --�����ԍ�
                                      ,PROCESS_TYP                                      --�����敪
                                      ,SLIP_TYP                                         --�`�[�敪
                                      ,AR_DATA_TYP                                      --���|�f�[�^�敪
                                      ,SALES_DATE                                       --����v���
                                      ,CUST_CD                                          --���Ӑ�R�[�h
                                      ,PLANT_CD                                         --�H��R�[�h
                                      ,SALES_DEPT_CD                                    --����v�㕔��
                                      ,CURRNCY_CD                                       --�ʉ݃R�[�h
                                      ,EXCH_TYP                                         --�ב֎��
                                      ,EXCH_RATE                                        --�בփ��[�g
                                      ,EXCH_RESERVE_CD                                  --�ב֗\��R�[�h
                                      ,TAX_CMP_TYP                                      --�ŎZ�o�敪
                                      ,CLOSING_TYP                                      --�������敪
                                      ,SALES_TYP                                        --����敪
                                      ,CUST_ITEM_CD                                     --���Ӑ�i�ڔԍ�
                                      ,CUST_ITEM_NAME                                   --���Ӑ�i�ږ���
                                      ,ITEM_CD                                          --�i�ڔԍ�
                                      ,ITEM_NAME                                        --�i�ږ���
                                      ,SALES_QTY                                        --������ѐ���
                                      ,UNIT_CD                                          --�P��
                                      ,SALES_UNIT_PRICE                                 --�P��
                                      ,SALES_AMOUNT                                     --������ы��z
                                      ,SALES_AMOUNT_EXCH_RATES                          --������ы��z(�M��)
                                      ,TAX_CREDIT_AMOUNT                                --�Ŕ�������z
                                      ,TAX_CREDIT_AMOUNT_EXCH_RATES                     --�Ŕ�������z(�M��)
                                      ,TAX_INT_EXT_TYP                                  --����œ��O�敪
                                      ,TAX_CD                                           --����ŃR�[�h
                                      ,EXTERNAL_TAX_SALES_AMOUNT                        --�O�őΏۋ��z
                                      ,EXTERNAL_TAX_AMOUNT                              --�O�ŏ����
                                      ,INTERNAL_TAX_SALES_AMOUNT                        --���őΏۋ��z
                                      ,INTERNAL_TAX_AMOUNT                              --���ŏ����
                                      ,TAXFREE_SALES_AMOUNT                             --��ېőΏۋ��z
                                      ,RETRIEVE_FLG                                     --�捞�t���O
                                      ,CREATED_DATE                                     --�쐬��
                                      ,CREATED_BY                                       --�쐬��
                                      ,CREATED_PRG_NM                                   --�쐬�v���O������
                                      ,UPDATED_DATE                                     --�X�V��
                                      ,UPDATED_BY                                       --�X�V��
                                      ,UPDATED_PRG_NM                                   --�X�V�v���O����
                                      ,MODIFY_COUNT                                     --�X�V��
                                      )
                               VALUES (
                                       SEQ_INPUTDENNO_CREDIT.NEXTVAL                    --�̔Ԃ��ꂽ���͓`�[�ԍ�
                                      ,1                                                --�`�[�s�ԍ�
                                      ,Rec_T_PAST_ONEROUS_CONS.ONEROUS_CONS_NO          --�`�[�ԍ�
                                      ,1                                                --���[����
                                      ,Rec_T_PAST_ONEROUS_CONS.PUCH_ODR_CD              --�����ԍ�
                                      ,0                                                --�����敪
                                      ,0                                                --�`�[�敪
                                      ,4                                                --���|�f�[�^�敪
                                      ,Rec_T_PAST_ONEROUS_CONS.ISSUE_DATE               --����v���
                                      ,Rec_T_PAST_ONEROUS_CONS.VEND_CD                  --���Ӑ�R�[�h
                                      ,Rec_T_PAST_ONEROUS_CONS.PLANT_CD                 --�H��R�[�h
                                      ,NULL                                             --����v�㕔��
                                      ,Rec_T_PAST_ONEROUS_CONS.CUR_CD                   --�ʉ݃R�[�h
                                      ,Rec_T_PAST_ONEROUS_CONS.EXCH_TYP                 --�ב֎��
                                      ,wnumExchRate                                     --�בփ��[�g
                                      ,NULL                                             --�ב֗\��R�[�h
                                      ,1                                                --�ŎZ�o�敪
                                      ,0                                                --�������敪
                                      ,NULL                                             --����敪
                                      ,NULL                                             --���Ӑ�i�ڔԍ�
                                      ,NULL                                             --���Ӑ�i�ږ���
                                      ,Rec_T_PAST_ONEROUS_CONS.ITEM_CD                  --�i�ڔԍ�
                                      ,Rec_T_PAST_ONEROUS_CONS.ITEM_NAME                --�i�ږ���
                                      ,Rec_T_PAST_ONEROUS_CONS.ISSUE_QTY                --������ѐ���
                                      ,Rec_T_PAST_ONEROUS_CONS.STOCK_UNIT               --�P��
                                      ,Rec_T_PAST_ONEROUS_CONS.UNIT_COST                --�P��
                                      ,wnumSalesAmount                                  --������ы��z
                                      ,wnumSalesAmounExchRates                          --������ы��z(�M��)
                                      ,wnumTaxOutAmount                                 --�Ŕ�������z
                                      ,wnumTaxCreditAmountExchRates                     --�Ŕ�������z(�M��)
                                      ,CASE
                                           WHEN SUBSTR(Rec_T_PAST_ONEROUS_CONS.TAX_CD, -1) = '1' THEN
                                               1                                         --�P�i�O�Łj
                                           WHEN SUBSTR(Rec_T_PAST_ONEROUS_CONS.TAX_CD, -1) = '5' THEN
                                               2                                         --2�i���Łj
                                           WHEN SUBSTR(Rec_T_PAST_ONEROUS_CONS.TAX_CD, -1) <> '1' AND SUBSTR(Rec_T_PAST_ONEROUS_CONS.TAX_CD, -1) <> '5' THEN
                                               0                                        --0�i��ېŁj
                                       END                                              --����œ��O�敪
                                      ,Rec_T_PAST_ONEROUS_CONS.TAX_CD                   --����ŃR�[�h
                                      ,wnumExternalTaxSalesAmount                       --�O�őΏۋ��z
                                      ,wnumExternalTaxAmount                            --�O�ŏ����
                                      ,wnumInternalTaxSalesAmount                       --���őΏۋ��z
                                      ,wnumInternalTaxAmount                            --���ŏ����
                                      ,wnumTaxFreeSalesAmount                           --��ېőΏۋ��z
                                      ,0                                                --�捞�t���O
                                      ,SYSDATE                                          --�쐬��
                                      ,pvc2UserId                                       --�쐬��
                                      ,pvc2BusinessName                                 --�쐬�v���O������
                                      ,SYSDATE                                          --�X�V��
                                      ,pvc2UserId                                       --�X�V��
                                      ,pvc2BusinessName                                 --�X�V�v���O����
                                      ,0                                                --�X�V��
                                      );        
            EXCEPTION
                WHEN OTHERS THEN
                    /* TraceLog �̏o�� */
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                                          pvc2PlantCd, MY_SQL_NAME, SQLERRM);

                    /* �Ɩ��I�����b�Z�[�W�̏o�� */
                    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                        pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_AI_AR_IF_INS, SQLERRM);

                     wblnErrorFlg := TRUE;
                     --//�W����
                     GOTO MASK;
            END;

            --//[�L���x������]�̍X�V����
            BEGIN
                UPDATE T_PAST_ONEROUS_CONS SET
                    AI_AR_IF_FLG    =1                                                  --Ai���|�C���^�t�F�[�X�t���O
                   ,UPDATED_DATE    = SYSDATE                                           --�X�V��
                   ,UPDATED_BY      = pvc2UserId                                        --�X�V��
                   ,UPDATED_PRG_NM  = pvc2BusinessName                                  --�X�V�v���O����
                   ,MODIFY_COUNT    = MODIFY_COUNT + 1                                  --�X�V��
                WHERE
                    ONEROUS_CONS_NO = Rec_T_PAST_ONEROUS_CONS.ONEROUS_CONS_NO;          --�L���x���ԍ�
            EXCEPTION
                WHEN OTHERS THEN
                    /* TraceLog �̏o�� */
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                                          pvc2PlantCd, MY_SQL_NAME, SQLERRM);

                    /* �Ɩ��I�����b�Z�[�W�̏o�� */
                    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                        pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_PAST_UPD, SQLERRM);

                     wblnErrorFlg := TRUE;
                     --//�W����
                     GOTO MASK;
            END;

            --//�W��        
            <<MASK>>
            --//�G�������݂�����
            IF wblnErrorFlg = TRUE THEN
                --//�G���[���� = �G���[���� + 1
                wnumErrorCount := wnumErrorCount + 1;
            ELSE
                --//���[�j���O�����݂�����
                IF wblnWarnFlg = TRUE THEN
                    --//���[�j���O���� = ���[�j���O���� + 1
                    wnumWarnCount := wnumWarnCount + 1;
                ELSE
                    --//���팏�� = ���팏�� + 1
                    wnumNormalCount := wnumNormalCount + 1;
                END IF;
            END IF;

        EXCEPTION
            WHEN OTHERS THEN
                /* TraceLog �̏o�� */
                blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                                          pvc2PlantCd, MY_SQL_NAME, SQLERRM);

                /* �Ɩ��I�����b�Z�[�W�̏o�� */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                        pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_READ_FAIL, SQLERRM);
        END;
           
    END LOOP;
   
--�L���x�����z���O�̃f�[�^�̏ꍇ�A��Ai���|�C���^�t�F�[�X�t���O���X�V����
    --//������ы��z���O�̔���f�[�^�������擾����
    SELECT COUNT(*) INTO wnumCount0
    FROM T_PAST_ONEROUS_CONS
    WHERE     AI_AR_IF_FLG = 0
          AND (ISSUE_QTY    =0 OR UNIT_COST    =0);

    UPDATE T_PAST_ONEROUS_CONS SET
               AI_AR_IF_FLG     =1,                     --Ai���|�C���^�t�F�[�X�t���O       �P�i�C���^�t�F�[�X�ρj
               UPDATED_DATE     = SYSDATE,              --�X�V��	        Sysdate
               UPDATED_BY       = pvc2UserId,           --�X�V��	        �����D���[�U�h�c
               UPDATED_PRG_NM   = pvc2BusinessName,     --�X�V�v���O����	�����D�Ɩ���
               MODIFY_COUNT     = MODIFY_COUNT + 1      --�X�V��	        �X�V���{�P
    WHERE     AI_AR_IF_FLG = 0
          AND (ISSUE_QTY    =0 OR UNIT_COST    =0);

    wnumTotalCount:=wnumTotalCount+wnumCount0;
    wnumNormalCount:=wnumNormalCount+wnumCount0;

    --����̏ꍇ
    vc2Comment:= SUBSTR('(SBM0316)<< �`���A�g���|�C���^�t�F�[�X��������I��>>�@'||
                        '�Ώی����F['       || wnumTotalCount  || ']�@'||
                        '���팏���F['       || wnumNormalCount || ']�@'||
                        '���[�j���O�����F[' || wnumWarnCount   || ']�@'|| 
                        '�ُ팏���F[ '      || wnumErrorCount  || ']�@' , 1, 256);

    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, vc2Comment);

    /* �Ɩ��I�����b�Z�[�W�̏o�� */
    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                        pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_END, vc2Comment);

    COMMIT;

EXCEPTION
    WHEN excFncTraceLog THEN        
        pnumStatus := STATUS_ERROR;
        
        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);
        
    WHEN excCommonChk THEN        
        pnumStatus := STATUS_ERROR;
        pvc2ErrorCd:= LOGMSG_ID_COMMON_CHK;
        
        /* LogFile �� CLOSE */
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_COMMON_CHK);
                          
        /* �Ɩ��I�����b�Z�[�W�̏o�� */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                            pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_COMMON_CHK, LOGMSG_NM_COMMON_CHK);

        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

    WHEN excFnc THEN
        pnumStatus := STATUS_ERROR;
        pvc2ErrorCd:= LOGMSG_ID_AI_AR_FAIL;
        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);
        ROLLBACK;

    WHEN OTHERS THEN
        --�ُ폈��
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                              pvc2PlantCd, MY_SQL_NAME, '');

        /* �Ɩ��I�����b�Z�[�W�̏o�� */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                            pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_ERR, '');
        ROLLBACK;

END;
/
