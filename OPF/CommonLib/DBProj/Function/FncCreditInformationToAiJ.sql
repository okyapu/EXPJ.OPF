CREATE OR REPLACE FUNCTION FncCreditInformationToAiJ(
/*------------------------------------------------------------------------------
'
' FncCreditInformationToAiJ.Sql
'
' version   : 1.00.00
'
' �C������
'
' �@�\      : J������捞����
'
' ������    : UTL_FileHandle       - (i)�t�@�C���n���h��
'             pvc2LogMode          - (i)�k�n�f���[�h'
'             pvc2OutputMode       - (i)�o�̓��[�h'
'             pvc2UserId           - (i)���[�U�h�c
'             pvc2BusinessName     - (i)�Ɩ���
'             pvc2PlantCd          - (i)�H��R�[�h
'             pnumTotalCount       - (o)�����f�[�^����
'             pnumNormalCount      - (o)���팏��
'             pnumWarnCount        - (o)���[�j���O����
'             pnumErrorCount       - (o)�ُ팏��
'             pvc2ErrorCd          - (o)�G���[�R�[�h
'             pnumStatus           - (o)���ʃX�e�[�^�X
'
' �@�\����  : EXPLANNER/J�i�i���^�ia�j��[�������]�A[������уw�b�_]�A[�L���x������]���甄�|�����W�񂵂āAA���A�g���|�C���^�t�F�[�X�Ƀf�[�^�o�^����B
'
' ���l      : ���ɂȂ�
'
------------------------------------------------------------------------------*/
   UTL_FileHandle               IN  UTL_FILE.FILE_TYPE  --�t�@�C���n���h��
   ,pvc2LogMode                 IN  VARCHAR2            --�k�n�f���[�h
   ,pvc2OutputMode              IN  VARCHAR2            --�o�̓��[�h
   ,pvc2UserId                  IN  VARCHAR2            --���[�U�h�c
   ,pvc2BusinessName            IN  VARCHAR2            --�Ɩ���
   ,pvc2PlantCd                 IN  VARCHAR2            --�H��R�[�h
   ,pnumTotalCount              OUT NUMBER              --�����f�[�^����
   ,pnumNormalCount             OUT NUMBER              --���팏��
   ,pnumWarnCount               OUT NUMBER              --���[�j���O����
   ,pnumErrorCount              OUT NUMBER              --�ُ팏��
   ,pvc2ErrorCd                 OUT VARCHAR2            --�G���[�R�[�h
   ,pnumStatus                  OUT NUMBER              --���ʃX�e�[�^�X�i1:����I���A2:���[�j���O�I���A3:�ُ�I���j
) RETURN BOOLEAN 
IS

/* �萔�̐錾 */

    MY_SQL_NAME                           VARCHAR2(120):= 'FNCCREDITINFORMATIONTOAIJ';  --�o�k�^�r�p�k��
    LOGMSG_START                          VARCHAR2(20) := 'Start';                      --���O�p���\�b�h�J�n�錾
    LOGMSG_END                            VARCHAR2(12) := 'End';                        --���O�p���\�b�h�I���錾
    LOGMSG_ERR                            VARCHAR2(32) := '�ُ�I��';

    --//�Ɩ����O�p���b�Z�[�WID
    LOGMSG_ID_COMMON_CHK                  VARCHAR2(28) := 'BF00011';    --�������s���̂��ߏ������ł��܂���ł����B
    LOGMSG_ID_READ_FAIL                   VARCHAR2(28) := 'BF00012';    --�`���A�g���|�C���^�t�F�[�X���̓Ǎ��Ɏ��s���܂����B
    LOGMSG_ID_RATE_FAIL                   VARCHAR2(28) := 'BF00017';    --�בփ��[�g���擾�ł��܂���ł����B 
    LOGMSG_ID_RATE_ERROR                  VARCHAR2(28) := 'BF00022';    --�בփ��[�g�擾�����ŃG���[���������܂����B
    LOGMSG_ID_AI_AR_IF_INS                VARCHAR2(28) := 'BF00013';    --�`���A�g���|�C���^�t�F�[�X���̓o�^�Ɏ��s���܂����B
    LOGMSG_ID_AI_AR_IF_DEL                VARCHAR2(28) := 'BF00023';    --������я��ԍ��`�[���E���������s���܂����B
    LOGMSG_ID_T_SALES_UPD                 VARCHAR2(28) := 'BF00014';    --������эX�V���������s���܂����B
    LOGMSG_ID_END_ERR                     VARCHAR2(28) := 'BF00018';    --������捞�Ɏ��s���܂����B

    --//�Ɩ����O�p���b�Z�[�W
    LOGMSG_NM_COMMON_CHK                  VARCHAR2(200) := '(SBM0017)�������s���̂��ߏ������ł��܂���ł����B';  
    LOGMSG_NM_READ_FAIL                   VARCHAR2(200) := '�`���A�g���|�C���^�t�F�[�X���̓Ǎ��Ɏ��s���܂����B';
    LOGMSG_NM_RATE_FAIL                   VARCHAR2(200) := '(SBM0718)�בփ��[�g���擾�ł��܂���ł����B' ;
    LOGMSG_NM_RATE_ERROR                  VARCHAR2(200) := '(SBM0719)�בփ��[�g�擾�����ŃG���[���������܂����B';
    LOGMSG_NM_AI_AR_IF_INS                VARCHAR2(200) := '(SBM0721)�`���A�g���|�C���^�t�F�[�X���̓o�^�Ɏ��s���܂����B';
    LOGMSG_NM_AI_AR_IF_DEL                VARCHAR2(200) := '(SBM0720)������я��ԍ��`�[���E�����Ɏ��s���܂����B';
    LOGMSG_NM_T_SALES_UPD                 VARCHAR2(200) := '(SBM0018)������эX�V���������s���܂����B';
    LOGMSG_NM_END_ERR                     VARCHAR2(200) := '(SBM0019)������捞�Ɏ��s���܂����B';

    --//���ʃX�e�[�^�X
    STATUS_NORMAL                         NUMBER        := 1;      -- ����I��
    STATUS_WARNING                        NUMBER        := 2;      -- ���[�j���O
    STATUS_ERROR                          NUMBER        := 3;      -- �ُ�I��

/* �ϐ��̐錾 WORK */
   -- UTL_FileHandle             UTL_FILE.FILE_TYPE;               --�t�@�C���n���h��
    --//����`�ُ�
    excFncTraceLog                         EXCEPTION;              --���O���������s
    excCommonChk                           EXCEPTION;              --���ʈ������s

    LOGMSG_NM_END                          VARCHAR2(200);          --�����I���錾

    blnRet                                 BOOLEAN;                --���ʊ֐��̖ߒl

    --//�ڍ׃��b�Z�[�W�i�[�p
    vc2Comment                             VARCHAR2(1024);
    
    --//�����ϐ��̐錾
    wnumExitFlg                            NUMBER;                 --�f�[�^���݂̃t���O
    wnumExchRate                           NUMBER;                 --�בփ��[�g
    wnumInputSlipCd                        NUMBER;                 --�O�񏈗��f�[�^�̓��͓`�[�ԍ�
    wvc2SlipCd                             VARCHAR2(100);          --�O�񏈗��f�[�^�̓`�[�ԍ�
    wvc2CustItemCd                         VARCHAR2(140);          --���Ӑ�i�ڔԍ�
    wvc2CustItemName                       VARCHAR2(160);          --���Ӑ�i�ږ���
    wvc2HomeCurCd                          VARCHAR2(100);          --�M�݃R�[�h
    wblnWarnFlg                            BOOLEAN;                --���[�j���O�̃t���O
    wblnErrorFlg                           BOOLEAN;                --�G���[�̃t���O
    wnumAmount                             NUMBER;                 --������ы��z
    wnumAmountJP                           NUMBER;                 --������ы��z(�M��)
    wnumCount0                             NUMBER;                 --������ы��z���O�̃f�[�^����


/* �J�[�\���̐錾*/
    --//Ai���|���C���^�t�F�[�X
    CURSOR CUR_T_AI_AR_IF_LOCK
    IS
    SELECT
        INPUT_SLIP_CD
    FROM
        T_AI_AR_IF
    FOR UPDATE NOWAIT;

    --//[�������]/ [������уw�b�_]��������
    CURSOR CUR_T_SALES
    IS 
    SELECT
        A.SLIP_CD,                                                  --[�������]."�`�[�ԍ�"
        A.SALES_SEQ_NO,                                             --[�������]."������ъǗ��ԍ�"
        A.SALES_DATE,                                               --[�������]."����v���"
        A.CUST_CD,                                                  --[�������]."���Ӑ�R�[�h"
        A.CURRNCY_CD,                                               --[�������]."�ʉ݃R�[�h" 
        B.EXCH_TYP,                                                 --[���Ӑ�]."�ב֎��"
        A.ITEM_CD,                                                  --[�������]."�i�ڔԍ�"
        C.ITEM_NAME,                                                --[�i��]."�i�ږ���"
        E.CUST_ITEM_CD,                                             --[���i]."���Ӑ�i�ڔԍ�"
        E.CUST_ITEM_NAME,                                           --[���i]."���Ӑ�i�ږ���"
        A.SALES_QTY,                                                --[�������]."������ѐ���"
        A.UNIT_CD,                                                  --[�������]."�P��" 
        A.SALES_UNIT_PRICE,                                         --[�������]."�P��"
        A.SALES_AMOUNT,                                             --[�������]."������ы��z"
        A.SALES_AMOUNT_EXCH_RATES,                                  --[�������]."������ы��z(�M��)"
        A.TAX_CREDIT_SALES_AMOUNT,                                  --[�������]."�Ŕ�������z"
        A.OWN_CUR_TAXCREDIT_SALES_AMOUNT,                           --[�������]."�Ŕ�������z�i�M�݁j"
        --Mod Start 20140113 LILI
        --B.TAX_CD,                                                   --[���Ӑ�]."����ŃR�[�h"
        NVL(G.TAX_CD,(DECODE(B.TAX_APPLY_TYP,'1',E.TAX_CD,'2',B.TAX_CD,B.TAX_CD))) AS TAX_CD,
                                                                    --[�󒍖���].�h����ŃR�[�h�h �� NULL�ȊO�̏ꍇ�A[�󒍖���].�h����ŃR�[�h�h
                                                                    --��L�ȊO�A[���Ӑ�].�g����œK�p�敪�h = �P (���i�}�X�^�̏���ŃR�[�h) �̏ꍇ�A[���i].�h����ŃR�[�h�h
                                                                    --          [���Ӑ�].�g����œK�p�敪�h = �Q (���Ӑ�}�X�^�̏���ŃR�[�h) �̏ꍇ�A[���Ӑ�].�h����ŃR�[�h�h
                                                                    --          ��L�ȊO�̏ꍇ�A[���Ӑ�].�h����ŃR�[�h�h
        --Mod End   20140113 LILI
        A.EXTERNAL_TAX_SALES_AMOUNT,                                --[�������]."�O�őΏۋ��z"
        A.EXTERNAL_TAX_AMOUNT,                                      --[�������]."����Ŋz�i�O�Łj"
        A.INTERNAL_TAX_SALES_AMOUNT,                                --[�������]."���őΏۋ��z"
        A.INTERNAL_TAX_AMOUNT,                                      --[�������]."���ŏ����"
        A.TAXFREE_SALES_AMOUNT,                                     --[�������]."��ېőΏۋ��z",
        A.INSPC_ACPT_TYP,                                           --[�������]."�����敪"
        A.SALES_TYP,                                                --[�������]."����敪"
        A.SALES_DEPT_CD,                                            --[�������]."����v�㕔��"
        D.DECIMAL_FIG,                                              --[�ʉ�]."��������"
        B.DETAIL_ROUND_TYP                                          --[���Ӑ�]."���׌v�Z�܂�ߋ敪"
    FROM
        T_SALES        A,                                           --[�������]
        M_CUST         B,                                           --[���Ӑ�]
        M_ITEM         C,                                           --[�i��]
        M_CUR          D,                                           --[�ʉ�]
        --Add Start 20140113 LILI
        T_SHIP_ODR     F,                                           --[�o�׎w��]
        T_ODR          G,                                           --[�󒍖���]
        --Add End   20140113 LILI
        (SELECT * FROM M_ITEM_SPEC WHERE COMPANY_CD IN (SELECT COMPANY_CD FROM SYS_MY_COMPANY WHERE CTRL_CD='SYSTEM')) E --[���i]
    WHERE
        A.CUST_CD      = B.CUST_CD                                  --[�������]."���Ӑ�R�[�h"      = [���Ӑ�]."���Ӑ�R�[�h"
    AND A.ITEM_CD      = C.ITEM_CD                                  --[�������]."�i�ڔԍ�" �@�@     = [�i��]."�i�ڔԍ�"
    AND A.CURRNCY_CD   = D.CUR_CD                                   --[�������]."�ʉ݃R�[�h"�@      = [�ʉ�]. "�ʉ݃R�[�h"
    AND A.ITEM_CD      = E.ITEM_CD(+)                               --[�������]."�i�ڔԍ�"    �@�@  = [���i]."�i�ڔԍ�"
    AND A.CUST_CD      = E.CUST_CD(+)                               --[�������]."���Ӑ�R�[�h"�@�@  = [���i]."���Ӑ�R�[�h"
    AND A.AI_AR_IF_FLG = 0                                          --[�������]."Ai���|�C���^�t�F�[�X�t���O"        = 0�i�C���^�t�F�[�X���j
    AND A.APPR_FLG     = 3                                          --[�������]."���F��"          = 3�i���F�ς݁j
    AND A.STATUS       = 20                                         --[�������]."��ԋ敪�h         = 20:���|�v��\��
    AND A.SALES_AMOUNT <>0 
    --Add Start 20140113 LILI
    AND A.SHIP_ODR_NO  = F.SHIP_ODR_NO(+)                           --[�������].�h�o�׎w���ԍ��h    = [�o�׎w��].�h�o�׎w���ԍ��h(+)
    AND F.ODR_NO       = G.ODR_NO(+)                                --[�o�׎w��].�h�󒍔ԍ��h        = [�󒍖���].�h�󒍔ԍ��h (+)
    --Add End   20140113 LILI
    ORDER BY
        A.SLIP_CD,                                                  --[�������]."�`�[�ԍ�"
        A.SALES_SEQ_NO;                                             --[�������]."������ъǗ��ԍ�"

BEGIN
    /* TraceLog�̏o��(Start)�������s�� */
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, LOGMSG_START);

    IF (NOT blnRet) THEN        
        --//���ʃX�e�[�^�X���ُ���Z�b�g����
        pnumStatus := STATUS_ERROR;
        RAISE excFncTraceLog;
    END IF;

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
    pnumTotalCount   := 0;
    pnumNormalCount  := 0;
    pnumWarnCount    := 0;
    pnumErrorCount   := 0;
    
    --//�M�݃R�[�h���擾����
    BEGIN
        SELECT
            HOME_CUR_CD
        INTO
            wvc2HomeCurCd
        FROM
            SYS_HOME_CUR
        WHERE
            CTRL_CD = 'SYSTEM';
    EXCEPTION
        WHEN OTHERS THEN
            RAISE;
    END;
    
    --//�`�����|���C���^�t�F�[�X�����b�N����
    OPEN CUR_T_AI_AR_IF_LOCK;

    FOR Rec_T_SALES IN CUR_T_SALES LOOP

        --�Ώی��� = �Ώی��� + 1
        pnumTotalCount := pnumTotalCount + 1;
        --���[�j���O�̃t���O��ݒ肷��
        wblnWarnFlg    := FALSE;
        --�G���[�̃t���O��ݒ肷��
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
                         A.EXCH_RATE                                                     --[�בփ��[�g�}�X�^]
                     FROM
                         M_EXCH_RATE    A,                                               --[�בփ��[�g�}�X�^]
                         SYS_MY_COMPANY B                                                --[����]
                     WHERE
                         A.COMPANY_CD      =  B.COMPANY_CD                               --[�בփ��[�g�}�X�^]."��ЃR�[�h" = ���ЃR�[�h
                     AND A.CUR_CD          =  Rec_T_SALES.CURRNCY_CD                     --[�擾�f�[�^]�D"�ʉ݃R�[�h"
                     AND A.EXCH_TYP        =  Rec_T_SALES.EXCH_TYP                       --[�擾�f�[�^]�D"�ב֎��" 
                     AND A.EXCH_START_DATE <= Rec_T_SALES.SALES_DATE                     --[�擾�f�[�^]�D"����v���"
                     AND B.CTRL_CD         =  'SYSTEM'                                   --[����]."SYS�R���g���[���R�[�h"  = SYSTEM
                     ORDER BY
                         A.EXCH_START_DATE DESC) C
                     WHERE
                         ROWNUM <= 1;
            EXCEPTION
                --//�בփ��[�g���擾�ł��Ȃ��ꍇ�A�בփ��[�g���O�Ł@�����𑱍s����
                WHEN NO_DATA_FOUND THEN
                    --//���[�j���O�̃t���O��ݒ肷��
                    wblnWarnFlg   := TRUE;
                    --//�בփ��[�g���擾�ł��Ȃ��ꍇ�A�בփ��[�g���O�Ł@�����𑱍s����
                    wnumExchRate  := 0;
                    vc2Comment:= SUBSTR('(SBM0014)�בփ��[�g�擾���[�j���O�@�`�[�ԍ� ['|| Rec_T_SALES.SLIP_CD  ||']'||
                                                                  '���[���� ['|| Rec_T_SALES.SLIP_CD  ||']'||
                                                                  '������ъǗ��ԍ� ['|| Rec_T_SALES.SALES_SEQ_NO ||']', 1, 256);
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                                          pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_RATE_FAIL);
                    /* �Ɩ��I�����b�Z�[�W�̏o�� */
                    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                        pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_RATE_FAIL, vc2Comment);

                --//�ُ폈��
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

            --//���Ӑ�i�ڔԍ�/���Ӑ�i�ږ��擾����
            BEGIN
                SELECT
                    NVL(CUST_ITEM_CD, Rec_T_SALES.CUST_ITEM_CD),                                --[�o�׎���]."���Ӑ�i�ڔԍ�"
                    NVL(CUST_ITEM_NAME, Rec_T_SALES.CUST_ITEM_NAME)                             --[�o�׎���]."���Ӑ�i�ږ���"
                INTO
                    wvc2CustItemCd,                                                               --���Ӑ�i�ڔԍ�
                    wvc2CustItemName                                                              --���Ӑ�i�ږ���
                FROM
                    (SELECT
                        C.CUST_ITEM_CD AS "CUST_ITEM_CD",
                        C.CUST_ITEM_NAME AS "CUST_ITEM_NAME"
                     FROM
                         (SELECT
                         ODR_NO                                                                   --[�o�׎���]."�󒍔ԍ�"
                     FROM
                         T_SHIP
                     WHERE
                         SLIP_CD = Rec_T_SALES.SLIP_CD                                            --[�o�׎���]."�`�[�ԍ�" = [�擾�f�[�^]."�`�[�ԍ�"
                     ORDER BY 
                         SHIP_SEQ_NO DESC) A,
                      T_ODR B,
                      T_ODR_CTL C
                WHERE
                    ROWNUM <= 1
                 AND A.ODR_NO     = B.ODR_NO
                 AND B.ODR_CTL_NO   = C.ODR_CTL_NO);
            EXCEPTION
                --//��L�����œ��Ӑ�i�ڔԍ�/���Ӑ�i�ږ����擾�ł��Ȃ��ꍇ
                WHEN NO_DATA_FOUND THEN
                    --//���Ӑ�i�ڔԍ�/���Ӑ�i�ږ����擾�ł��Ȃ��ꍇ�A���Ӑ�i�ڔԍ�/���Ӑ�i�ږ���null�Ƃ���
                    wvc2CustItemCd   := Rec_T_SALES.CUST_ITEM_CD;                                  --���Ӑ�i�ڔԍ�       = [�擾�f�[�^]."���Ӑ�i�ڔԍ�"
                    wvc2CustItemName := Rec_T_SALES.CUST_ITEM_NAME;                                --���Ӑ�i�ڏ�         = [�擾�f�[�^]."���Ӑ�i�ږ���"

                --//�ُ폈��
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
        
            --������z�v�Z
            wnumAmount:=Rec_T_SALES.SALES_AMOUNT+Rec_T_SALES.EXTERNAL_TAX_AMOUNT;

            --������z�v�Z(�M��)
            blnRet := FNCGETROUND4FD(
                                     UTL_FileHandle                                 --�t�@�C���n���h��
                                    ,pvc2LogMode                                    --�k�n�f���[�h
                                    ,pvc2OutputMode                                 --�o�̓��[�h
                                    ,pvc2UserId                                     --���[�U�h�c
                                    ,pvc2BusinessName                               --�Ɩ���
                                    ,pvc2PlantCd                                    --�H��R�[�h
                                    ,TO_NUMBER(wnumAmount * wnumExchRate)           --������ы��z �~ �בփ��[�g
                                    ,Rec_T_SALES.DECIMAL_FIG                        --��������
                                    ,Rec_T_SALES.DETAIL_ROUND_TYP                   --���׌v�Z�܂�ߋ敪
                                    ,wnumAmountJP                                   --������ы��z(�M��)
                                    ,pvc2ErrorCd                                    --�G���[���b�Z�[�WID
                                    ,pnumStatus                                     --���ʃX�e�[�^�X�i1�F����I�� 2:�x���I�� 3�F�ُ�I���j
                );

            --�ُ�
           IF pnumStatus = 3 OR blnRet = FALSE THEN
                vc2Comment:= SUBSTR('(SBM0015)������z�i�M�݁j�v�Z�ُ�@�`�[�ԍ� ['|| Rec_T_SALES.SLIP_CD  ||']'||
                                                                  '������ъǗ��ԍ� ['|| Rec_T_SALES.SALES_SEQ_NO ||']', 1, 256);
                /* TraceLog �̏o�� */
                blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                                          pvc2PlantCd, MY_SQL_NAME, vc2Comment);
                /* �Ɩ��I�����b�Z�[�W�̏o�� */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                        pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_END_ERR, vc2Comment);
                wblnErrorFlg := TRUE;
                --//�W����
                GOTO MASK;
            END IF;

                --���[�j���O
            IF pnumStatus = 2 THEN
                vc2Comment:= SUBSTR('(SBM0016)������z�i�M�݁j�v�Z���[�j���O�@�`�[�ԍ� ['|| Rec_T_SALES.SLIP_CD  ||']'||
                                                                  '������ъǗ��ԍ� ['|| Rec_T_SALES.SALES_SEQ_NO ||']', 1, 256);
                /* TraceLog �̏o�� */
                blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                                          pvc2PlantCd, MY_SQL_NAME, vc2Comment);
                /* �Ɩ��I�����b�Z�[�W�̏o�� */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                        pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_END_ERR, vc2Comment);

                wblnWarnFlg := TRUE;

            END IF;

            
            --//Ai���|���C���^�t�F�[�X�̃f�[�^����������
            BEGIN
                SELECT
                    NVL2(INPUT_SLIP_CD, 1, 0)
                INTO
                    wnumExitFlg
                FROM
                    T_AI_AR_IF
                WHERE
                    INPUT_SLIP_CD = wnumInputSlipCd;
            EXCEPTION
                WHEN NO_DATA_FOUND THEN
                    wnumExitFlg := 0;
            END;

            --//�`�[�ԍ� = �O�񏈗��f�[�^�̓`�[�ԍ��AAi���|���C���^�t�F�[�X."���͓`�[�ԍ�" = �O�񏈗��f�[�^�̓��͓`�[�ԍ��A������ѐ��� < 0 (�ԃf�[�^�ł���)
            IF Rec_T_SALES.SLIP_CD = wvc2SlipCd AND wnumExitFlg = 1 AND Rec_T_SALES.SALES_QTY < 0 THEN

                --//[���|���C���^�t�F�[�X]���폜
                BEGIN
                    DELETE FROM
                        T_AI_AR_IF                                                   --Ai���|���C���^�t�F�[�X
                    WHERE
                        INPUT_SLIP_CD = wnumInputSlipCd;                             --�O�񏈗��f�[�^�̓��͓`�[�ԍ�
                EXCEPTION
                    --//�ُ폈��
                    WHEN OTHERS THEN
                        --//�G���[�̃t���O��ݒ肷��
                        wblnErrorFlg := TRUE;
                        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                                              pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_AI_AR_IF_DEL);
                        /* �Ɩ��I�����b�Z�[�W�̏o�� */
                        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                            pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_AI_AR_IF_DEL, SQLERRM);
                        --//�W����
                        GOTO MASK;
                END;

                --//[�������]�̍X�V����
                BEGIN
                    UPDATE T_SALES SET
                        AI_AR_IF_FLG     = 1,                                                --Ai���|�C���^�t�F�[�X�t���O       �P�i�C���^�t�F�[�X�ρj
                        UPDATED_DATE     = SYSDATE,                                          --�X�V��	        Sysdate
                        UPDATED_BY       = pvc2UserId,                                       --�X�V��	        �����D���[�U�h�c
                        UPDATED_PRG_NM   = pvc2BusinessName,                                 --�X�V�v���O����	�����D�Ɩ���
                        MODIFY_COUNT     = MODIFY_COUNT + 1                                  --�X�V��	        �X�V���{�P
                    WHERE
                        SALES_SEQ_NO     = Rec_T_SALES.SALES_SEQ_NO;                         --[�擾�f�[�^]�D"������ъǗ��ԍ�"
                EXCEPTION
                    --//�ُ폈��
                    WHEN OTHERS THEN
                        --//�G���[�̃t���O��ݒ肷��
                        wblnErrorFlg := TRUE;
                        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                                              pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_T_SALES_UPD);
                        /* �Ɩ��I�����b�Z�[�W�̏o�� */
                        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                            pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_T_SALES_UPD, SQLERRM);
                        --//�W����
                        GOTO MASK;
                END;

            ELSE

                --//[���|���C���^�t�F�[�X]�֓o�^����
                --//���͓`�[�ԍ��̔�
                SELECT
                    SEQ_INPUTDENNO_CREDIT.NEXTVAL
                INTO
                    wnumInputSlipCd
                FROM
                    DUAL;

                BEGIN
                    INSERT INTO T_AI_AR_IF (
                                            INPUT_SLIP_CD,                                   --���͓`�[�ԍ�
                                            SLIP_ROW_NO,                                     --�`�[�s�ԍ�
                                            SLIP_CD,                                         --�`�[�ԍ�
                                            PART_DLV_SEQ_NO,                                 --���[����
                                            PUCH_ODR_CD,                                     --�����ԍ�
                                            PROCESS_TYP,                                     --�����敪
                                            SLIP_TYP,                                        --�`�[�敪
                                            AR_DATA_TYP,                                     --���|�f�[�^�敪
                                            SALES_DATE,                                      --����v���
                                            CUST_CD,                                         --���Ӑ�R�[�h,
                                            PLANT_CD,                                        --�H��R�[�h
                                            SALES_DEPT_CD,                                   --����v�㕔��
                                            CURRNCY_CD,                                      --�ʉ݃R�[�h
                                            EXCH_TYP,                                        --�ב֎��
                                            EXCH_RATE,                                       --�בփ��[�g
                                            EXCH_RESERVE_CD,                                 --�ב֗\��R�[�h
                                            TAX_CMP_TYP,                                     --�ŎZ�o�敪
                                            CLOSING_TYP,                                     --�������敪
                                            SALES_TYP,                                       --����敪
                                            CUST_ITEM_CD,                                    --���Ӑ�i�ڔԍ�
                                            CUST_ITEM_NAME,                                  --���Ӑ�i�ږ���
                                            ITEM_CD,                                         --�i�ڔԍ�
                                            ITEM_NAME,                                       --�i�ږ���
                                            SALES_QTY,                                       --������ѐ���
                                            UNIT_CD,                                         --�P��
                                            SALES_UNIT_PRICE,                                --�P��
                                            SALES_AMOUNT,                                    --������ы��z
                                            SALES_AMOUNT_EXCH_RATES,                         --������ы��z(�M��)
                                            TAX_CREDIT_AMOUNT,                               --�Ŕ�������z
                                            TAX_CREDIT_AMOUNT_EXCH_RATES,                    --�Ŕ�������z(�M��)
                                            TAX_INT_EXT_TYP,                                 --����œ��O�敪
                                            TAX_CD,                                          --����ŃR�[�h
                                            EXTERNAL_TAX_SALES_AMOUNT,                       --�O�őΏۋ��z
                                            EXTERNAL_TAX_AMOUNT,                             --�O�ŏ����
                                            INTERNAL_TAX_SALES_AMOUNT,                       --���őΏۋ��z
                                            INTERNAL_TAX_AMOUNT,                             --���ŏ����
                                            TAXFREE_SALES_AMOUNT,                            --��ېőΏۋ��z
                                            RETRIEVE_FLG,                                    --�捞�t���O
                                            CREATED_DATE,                                    --�쐬��
                                            CREATED_BY,                                      --�쐬��
                                            CREATED_PRG_NM,                                  --�쐬�v���O������
                                            UPDATED_DATE,                                    --�X�V��
                                            UPDATED_BY,                                      --�X�V��
                                            UPDATED_PRG_NM,                                  --�X�V�v���O����
                                            MODIFY_COUNT                                     --�X�V��
                                           )
                                     VALUES 
                                           (
                                            wnumInputSlipCd,                                 --�̔Ԃ��ꂽ���͓`�[�ԍ�
                                            1,                                               --1
                                            Rec_T_SALES.SLIP_CD,                             --[�擾�f�[�^]�D"�`�[�ԍ�"
                                            1,                                               --1
                                            NULL,                                            --NULL
                                            0,                                               --0(�`�[�ǉ�)
                                            0,                                               --0�i����j
                                            CASE WHEN Rec_T_SALES.INSPC_ACPT_TYP = 2
                                                 THEN 3                                      --[�擾�f�[�^]."�����敪"= 2:��̊ �ꍇ 3:��̔���
                                                 WHEN Rec_T_SALES.INSPC_ACPT_TYP <> 2 AND Rec_T_SALES.SALES_TYP = 3
                                                 THEN 2                                      --[�擾�f�[�^]."�����敪"��2:��̊ ���� [�擾�f�[�^]."����敪" = 3:���̑����� �ꍇ 2:���̑�����
                                                 ELSE 1 END,                                 --�ȏ�ȊO�ꍇ 1�o��:����
                                            Rec_T_SALES.SALES_DATE,                          --[�擾�f�[�^]�D"����v���"
                                            Rec_T_SALES.CUST_CD,                             --[�擾�f�[�^]�D"���Ӑ�R�[�h"
                                            NULL,                                            --NULL
                                            Rec_T_SALES.SALES_DEPT_CD,                       --[�擾�f�[�^]."����v�㕔��"
                                            Rec_T_SALES.CURRNCY_CD,                          --[�擾�f�[�^]�D"�ʉ݃R�[�h"
                                            Rec_T_SALES.EXCH_TYP,                            --[�擾�f�[�^]�D"�ב֎��"
                                            wnumExchRate,                                    --�擾�����בփ��[�g
                                            NULL,                                            --NULL
                                            1,                                               --�P�i���ׁj
                                            0,                                               --0�i���ߏ���������`�[
                                            NULL,                                            --NULL
                                            wvc2CustItemCd,                                  --�擾�������Ӑ�i�ڔԍ�
                                            wvc2CustItemName,                                --�擾�������Ӑ�i�ږ�
                                            Rec_T_SALES.ITEM_CD,                             --[�擾�f�[�^]�D"�i�ڔԍ�"
                                            Rec_T_SALES.ITEM_NAME,                           --[�擾�f�[�^]�D"�i�ږ�"
                                            Rec_T_SALES.SALES_QTY,                           --[�擾�f�[�^]�D"������ѐ���"
                                            Rec_T_SALES.UNIT_CD,                             --[�擾�f�[�^]�D"�P��"
                                            Rec_T_SALES.SALES_UNIT_PRICE,                    --[�擾�f�[�^]�D"�P��"
                                            wnumAmount,                                      --[�擾�f�[�^]�D"������ы��z"
                                            wnumAmountJP,                                    --[�擾�f�[�^]�D"������ы��z(�M��)"
                                            Rec_T_SALES.TAX_CREDIT_SALES_AMOUNT,             --[�擾�f�[�^]�D"�Ŕ�������z"
                                            Rec_T_SALES.OWN_CUR_TAXCREDIT_SALES_AMOUNT,      --[�擾�f�[�^]�D"�Ŕ�������z(�M��)"
                                            CASE WHEN SUBSTR(Rec_T_SALES.TAX_CD, -1) = '1'   --[�擾�f�[�^]�D�h����ŃR�[�h�h�̉��P����1:�O�ł̏ꍇ�P�i�O�Łj
                                                 THEN 1
                                                 WHEN SUBSTR(Rec_T_SALES.TAX_CD, -1) = '5'   --[�擾�f�[�^]�D�h����ŃR�[�h�h�̉��P����5:���ł̏ꍇ 2�i���Łj
                                                 THEN 2
                                                 WHEN SUBSTR(Rec_T_SALES.TAX_CD, -1) <> '1'  --[�擾�f�[�^]�D�h����ŃR�[�h�h�̉��P����1:�O�Ł@,5:���ŁA�̏ꍇ 0�i��ېŁj
                                                 THEN 0 END,
                                            Rec_T_SALES.TAX_CD,                              --[�擾�f�[�^]�D"����ŃR�[�h"
                                            Rec_T_SALES.EXTERNAL_TAX_SALES_AMOUNT,           --[�擾�f�[�^]�D"�O�őΏۋ��z"
                                            Rec_T_SALES.EXTERNAL_TAX_AMOUNT,                 --[�擾�f�[�^]�D"�O�ŏ����"
                                            Rec_T_SALES.INTERNAL_TAX_SALES_AMOUNT,           --[�擾�f�[�^]�D"���őΏۋ��z"
                                            Rec_T_SALES.INTERNAL_TAX_AMOUNT,                 --[�擾�f�[�^]�D"���ŏ����"
                                            Rec_T_SALES.TAXFREE_SALES_AMOUNT,                --[�擾�f�[�^]�D"��ېőΏۋ��z"
                                            0,                                               --0�F���捞
                                            SYSDATE,                                         --SYSDATE
                                            pvc2UserId,                                      --�����D���[�U�h�c
                                            pvc2BusinessName,                                --�����D�Ɩ���
                                            SYSDATE,                                         --SYSDATE
                                            pvc2UserId,                                      --�����D���[�U�h�c
                                            pvc2BusinessName,                                --�����D�Ɩ���
                                            0                                                --0
                                           );
                EXCEPTION
                    --//�ُ폈��
                    WHEN OTHERS THEN
                        --//�G���[�̃t���O��ݒ肷��
                        wblnErrorFlg := TRUE;
                        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                                              pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_AI_AR_IF_INS);
                        /* �Ɩ��I�����b�Z�[�W�̏o�� */
                        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                            pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_AI_AR_IF_INS, SQLERRM);
                        --//�W����
                        GOTO MASK;
                END;

                --//[�������]�̍X�V����
                BEGIN
                    UPDATE T_SALES SET
                        AI_AR_IF_FLG     ='1',                                               --Ai���|�C���^�t�F�[�X�t���O       �P�i�C���^�t�F�[�X�ρj
                        UPDATED_DATE     = SYSDATE,                                          --�X�V��	        Sysdate
                        UPDATED_BY       = pvc2UserId,                                       --�X�V��	        �����D���[�U�h�c
                        UPDATED_PRG_NM   = pvc2BusinessName,                                 --�X�V�v���O����	�����D�Ɩ���
                        MODIFY_COUNT     = MODIFY_COUNT + 1                                  --�X�V��	        �X�V���{�P
                    WHERE
                        SALES_SEQ_NO     = Rec_T_SALES.SALES_SEQ_NO;                         --[�擾�f�[�^]."������ъǗ��ԍ�"
                EXCEPTION
                    --//�ُ폈��
                    WHEN OTHERS THEN
                        --//�G���[�̃t���O��ݒ肷��
                        wblnErrorFlg := TRUE;
                        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                                              pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_T_SALES_UPD);
                        /* �Ɩ��I�����b�Z�[�W�̏o�� */
                        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                            pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_T_SALES_UPD, SQLERRM);
                        --//�W����
                        GOTO MASK;
                END;

            END IF;

            --//�W��        
            <<MASK>>
            --//�G�������݂�����
            IF wblnErrorFlg = TRUE THEN
                --//�G���[���� = �G���[���� + 1
                pnumErrorCount := pnumErrorCount + 1;
            ELSE
                --//���[�j���O�����݂�����
                IF wblnWarnFlg = TRUE THEN
                    --//���[�j���O���� = ���[�j���O���� + 1
                    pnumWarnCount := pnumWarnCount + 1;
                ELSE
                    --//���팏�� = ���팏�� + 1
                    pnumNormalCount := pnumNormalCount + 1;
                END IF;
            END IF;

        EXCEPTION
            --//�ُ폈��
            WHEN OTHERS THEN
                blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                                      pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_END_ERR);
                /* �Ɩ��I�����b�Z�[�W�̏o�� */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                    pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_END_ERR, SQLERRM);
        END;

        --//����̃f�[�^��ۑ�����
        --//����̓`�[�ԍ�
        wvc2SlipCd := Rec_T_SALES.SLIP_CD;

    END LOOP;

--������ы��z���O�̔���f�[�^�̔��|�C���^�t�F�[�X�t���O���X�V����
    --//������ы��z���O�̔���f�[�^�������擾����
    SELECT COUNT(*) INTO wnumCount0
    FROM T_SALES
    WHERE     AI_AR_IF_FLG = 0                             --[�������]."Ai���|�C���^�t�F�[�X�t���O"  = 0�i�C���^�t�F�[�X���j
          AND APPR_FLG     = 3                             --[�������]."���F��"          = 3�i���F�ς݁j
          AND STATUS       = 20                            --[�������]."��ԋ敪�h         = 20:���|�v��\��
          AND SALES_AMOUNT = 0 ;

    UPDATE T_SALES SET
               AI_AR_IF_FLG     =1,                        --Ai���|�C���^�t�F�[�X�t���O       �P�i�C���^�t�F�[�X�ρj
               UPDATED_DATE     = SYSDATE,                 --�X�V��	        Sysdate
               UPDATED_BY       = pvc2UserId,              --�X�V��	        �����D���[�U�h�c
               UPDATED_PRG_NM   = pvc2BusinessName,        --�X�V�v���O����	�����D�Ɩ���
               MODIFY_COUNT     = MODIFY_COUNT + 1         --�X�V��	        �X�V���{�P
     WHERE
              AI_AR_IF_FLG = 0                             --[�������]."Ai���|�C���^�t�F�[�X�t���O"  = 0�i�C���^�t�F�[�X���j
          AND APPR_FLG     = 3                             --[�������]."���F��"          = 3�i���F�ς݁j
          AND STATUS       = 20                            --[�������]."��ԋ敪�h         = 20:���|�v��\��
          AND SALES_AMOUNT = 0 ;


    pnumTotalCount:=pnumTotalCount+wnumCount0;
    pnumNormalCount := pnumNormalCount+wnumCount0;

    --//UNLOCK�`�����|���C���^�t�F�[�X
    IF CUR_T_AI_AR_IF_LOCK%ISOPEN THEN
        CLOSE CUR_T_AI_AR_IF_LOCK;
    END IF;

    --����̏ꍇ
    --���ʂ�ݒ肷��
    pvc2ErrorCd     := '';
    pnumStatus      := STATUS_NORMAL;

     /* TraceLog �̏o�� */
     blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                           pvc2PlantCd, MY_SQL_NAME, LOGMSG_END);
     RETURN TRUE;

EXCEPTION
    WHEN excFncTraceLog THEN
        pnumStatus := STATUS_ERROR;

        --//UNLOCK�`�����|���C���^�t�F�[�X
        IF CUR_T_AI_AR_IF_LOCK%ISOPEN THEN
            CLOSE CUR_T_AI_AR_IF_LOCK;
        END IF;

        RETURN FALSE;

    WHEN excCommonChk THEN
        pnumStatus := STATUS_ERROR;
        pvc2ErrorCd:= LOGMSG_ID_COMMON_CHK;

        --//UNLOCK�`�����|���C���^�t�F�[�X
        IF CUR_T_AI_AR_IF_LOCK%ISOPEN THEN
            CLOSE CUR_T_AI_AR_IF_LOCK;
        END IF;

        /* LogFile �� CLOSE */
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                              pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_COMMON_CHK);
        /* �Ɩ��I�����b�Z�[�W�̏o�� */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                            pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_COMMON_CHK, LOGMSG_NM_COMMON_CHK);
        RETURN FALSE;

    WHEN OTHERS THEN
        --���ʂ�ݒ肷��
        pnumTotalCount  := pnumTotalCount;
        pnumNormalCount := 0;
        pnumWarnCount   := 0;
        pnumErrorCount  := 0;
        pnumStatus      := STATUS_ERROR;

        --//UNLOCK�`�����|���C���^�t�F�[�X
        IF CUR_T_AI_AR_IF_LOCK%ISOPEN THEN
            CLOSE CUR_T_AI_AR_IF_LOCK;
        END IF;

        --�ُ폈��
        vc2Comment:= SUBSTR('(SBM0020)<< Jf������捞�����ُ�I��>>�@'|| SQLERRM, 1, 256);
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                              pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_END_ERR);
        /* �Ɩ��I�����b�Z�[�W�̏o�� */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                            pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_END_ERR, vc2Comment);
        RETURN FALSE;
END;
/
