CREATE OR REPLACE PROCEDURE SqlDebtInformationToAi(
/*------------------------------------------------------------------------------
'
' SqlDebtInformationToAi.Sql
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
'             pvc2ErrorCd          - (0)�G���[�R�[�h
'             pnumStatus           - (o)���ʃX�e�[�^�X
'
' �@�\����  : EXPLANNER/J�i�i���^�ia�j��[�������я��C���^�t�F�[�X]���甃�|�����W�񂵂āAA���������|�C���^�t�F�[�X�Ƀf�[�^�o�^����B
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

    MY_SQL_NAME                           VARCHAR2(120):= 'SQLDEBTINFORMATIONTOAi';     --�o�k�^�r�p�k��

    --//�Ɩ����O�p���b�Z�[�WID
    LOGMSG_ID_START                       VARCHAR2(28) := 'CF00021';                    --�����J�n�錾
    LOGMSG_ID_COMMON_CHK                  VARCHAR2(28) := 'CF00020';                    --������������ɕK�{����
    LOGMSG_ID_READ_DATA                   VARCHAR2(28) := 'CF00024';                    --A���������|�C���^�t�F�[�X���̎擾
    LOGMSG_ID_ITEM_CD_NULL                VARCHAR2(28) := 'CF00022';                    --�i�ڔԍ�NULL
    LOGMSG_ID_AI_AP_IF_INS                VARCHAR2(28) := 'CF00023';                    --���|���C���^�t�F�[�X�̃f�[�^�o�^����
    LOGMSG_ID_INSPC_ACPT_UPD              VARCHAR2(28) := 'CF00025';                    --�������я��C���^�t�F�[�X�X�V����
    LOGMSG_ID_SUCCESS                     VARCHAR2(28) := 'CF00026';                    --���폈��
    LOGMSG_ID_END_ERR                     VARCHAR2(28) := 'CF00027';                    --��O�I������
    LOGMSG_ID_PARAM_ERR                   VARCHAR2(28) := 'CF00028';                    --�V�X�e���ݒ��艼�P���f�[�^�𑗐M�ł��܂���B
    LOGMSG_ID_PARAM_WAR                   VARCHAR2(28) := 'CF00029';                    --���P���f�[�^�𑗐M���܂����B
    
    --//�Ɩ����O�p���b�Z�[�W
    LOGMSG_NM_START                       VARCHAR2(200) := '(SBM0773)�`���A�g���|�C���^�t�F�[�X�������J�n���܂����B';            --�����J�n�錾
    LOGMSG_NM_COMMON_CHK                  VARCHAR2(200) := '(SBM0017)�������s���̂��ߏ������ł��܂���ł����B';
    LOGMSG_NM_READ_DATA                   VARCHAR2(200) := '(SBM0774)�`���A�g���|�C���^�t�F�[�X���̓Ǎ��Ɏ��s���܂����B';
    LOGMSG_NM_ITEM_CD_NULL                VARCHAR2(200) := '(SBM0775)�i�ڔԍ����ݒ肳��Ă��Ȃ����ߑ��M����܂���ł����B';      --�i�ڔԍ�NULL
    LOGMSG_NM_AI_AP_IF_INS                VARCHAR2(200) := '(SBM0776)�`���A�g���|�C���^�t�F�[�X���̓o�^�Ɏ��s���܂����B';
    LOGMSG_NM_INSPC_ACPT_UPD              VARCHAR2(200) := '(SBM0777)�������я��C���^�t�F�[�X�X�V���������s���܂����B';
    LOGMSG_NM_SUCCESS                     VARCHAR2(200) := '(SBM0778)�`���A�g���|�C���^�t�F�[�X����������I�����܂����B';
    LOGMSG_NM_END_ERR                     VARCHAR2(200) := '(SBM0779)�`���A�g���|�C���^�t�F�[�X�������ُ�I�����܂����B';
    LOGMSG_NM_PARAM_ERR                   VARCHAR2(200) := '(SBM0780)���P���̂��ߑ��M����܂���ł����B';
    LOGMSG_NM_PARAM_WAR                   VARCHAR2(200) := '(SBM0781)���P���f�[�^�𑗐M���܂����B';
    
    --//�Ɩ�������
    LOGMSG_STR_MESSAGE                    VARCHAR2(200):= '(SBM0351)<< �`���A�g���|�C���^�t�F�[�X�����J�n�@>>';                  --�Ɩ��������`

    --//���ʃX�e�[�^�X
    STATUS_NORMAL                         NUMBER        := 1;      -- ����I��
    STATUS_WARNING                        NUMBER        := 2;      -- ���[�j���O
    STATUS_ERROR                          NUMBER        := 3;      -- �ُ�I��

/* �ϐ��̐錾 WORK */
    --//����`�ُ�
    excFncTraceLog                         EXCEPTION;                               --���O���������s
    excCommonChk                           EXCEPTION;                               --���ʈ������s
    LOGMSG_NM_END                          VARCHAR2(200);                           --�����I���錾
    UTL_FileHandle                         UTL_FILE.FILE_TYPE;                      --�t�@�C���n���h��
    blnRet                                 BOOLEAN;                                 --���ʊ֐��̖ߒl
    numSuccessCount                        NUMBER;                                  --���팏��
    numErrCount                            NUMBER;                                  --�G���[����
    numTotalCount                          NUMBER;                                  --�����f�[�^����
    numWarnCount                           NUMBER;                                  --���[�j���O����
    numZeroCount                           NUMBER;                                  --�������z0�f�[�^����
    numOffsetCount                         NUMBER;                                  --���E�f�[�^����

    --//�ڍ׃��b�Z�[�W�i�[�p
    vc2Comment                             VARCHAR2(1024);
    --//�����ϐ��̐錾
    wblnErrorFlg                            BOOLEAN;                                --�G���[�̃t���O
    wblnWarnFlg                             BOOLEAN;                                --���[�j���O�̃t���O
    wvc2Value                               VARCHAR2(1024);                         --�ݒ�l
    wnumUnitAmount                          NUMBER;                                 --�{�̋��z�v�Z
    wnumTaxAmount1                          NUMBER;                                 --�Ŋz1
    wnumTaxAmount2                          NUMBER;                                 --�Ŋz2
    wnumTaxAmount3                          NUMBER;                                 --�Ŋz3
    wnumTaxOutAmount                        NUMBER;                                 --�Ŕ����z
    wnumTaxAmount                           NUMBER;                                 --����Ŋz
    wnumTaxInAmount                         NUMBER;                                 --�ō����z
    wnumExternalTaxSalesAmount              NUMBER;                                 --�O�őΏۋ��z
    wnumInternalTaxSalesAmount              NUMBER;                                 --���őΏۋ��z
    wnumTaxFreeSalesAmount                  NUMBER;                                 --��ېőΏۋ��z
    wnumExternalTaxAmount                   NUMBER;                                 --����Ŋz�i�O�Łj
    wnumInternalTaxAmount                   NUMBER;                                 --����Ŋz�i���Łj
    wnumInspcAmount                         NUMBER;                                 --�������z
    wnumInspcCurAmount                      NUMBER;                                 --�������z(�M��)
    wnumTaxCurAmount                        NUMBER;                                 --�Ŕ����z(�M��)
    wnumAmount                              NUMBER;                                 --���z    
    wnumAmountWK                            NUMBER;                                 --���z�v�Z�p���[�N  
    wnumINPUT_SLIP_CD                       NUMBER;                                 --���͓`�[�ԍ�  
    wnumINPUT_SLIP_CDWK                     NUMBER;                                 --�O����͓`�[�ԍ�  
    wvc2PUCH_ODR_CDWK                       VARCHAR2(100);                          --�O�񔭒��v��ԍ�  
    wnumACPT_NOWK                           NUMBER;                                 --�O������  
    wnumINSERT                              NUMBER;                                 --�O��f�[�^�o�^�t���O
    wnumINSERTCK                            NUMBER;                                 --�o�^���Ȃ��t���O
    wnumOFFSETFlg                           NUMBER;                                 --���E�̃t���O(0:���E�Ȃ�,1:���������E,2:�ԓo�^���Ȃ�,3:0�f�[�^)
    wnumSTSFlg                              NUMBER;                                 --�O��o�^��(0:����,1:���[�j���O,2:�G���[)

 /* �J�[�\���̐錾*/
    --//���|�C���^�t�F�[�X�����b�N��
    CURSOR CUR_T_AI_AP_IF_LOCK
    IS
    SELECT 1
      FROM T_AI_AP_IF
    FOR UPDATE NOWAIT;
    

    --//�������я��C���^�t�F�[�X��������
    CURSOR CUR_T_INSPC_ACPT_IF
    IS 
    SELECT * FROM (
    SELECT
        T_INSPC_ACPT_IF.PUCH_ODR_CD                                                 --[�������я��C���^�t�F�[�X]�D�h�����ԍ��g
       ,T_INSPC_ACPT_IF.ACPT_NO                                                     --[�������я��C���^�t�F�[�X]�D�g����񐔁h
       ,T_INSPC_ACPT_IF.INSPC_ACPT_NO                                               --[�������я��C���^�t�F�[�X]�D�g�����ԍ��h
       ,T_INSPC_ACPT_IF.ITEM_CD                                                     --[�������я��C���^�t�F�[�X]�D�h�i�ڔԍ��g
       ,T_INSPC_ACPT_IF.INSPC_ACPT_DATE                                             --[�������я��C���^�t�F�[�X]�D�h�������h
       ,T_INSPC_ACPT_IF.VEND_CD                                                     --[�������я��C���^�t�F�[�X]�D�h�����R�[�h�h
       ,NVL(T_INSPC_ACPT_IF.INSPC_ACPT_QTY,0) AS INSPC_ACPT_QTY                     --[�������я��C���^�t�F�[�X]�D�h�������h
       ,NVL(T_INSPC_ACPT_IF.UNIT_COST,0) AS UNIT_COST                               --[�������я��C���^�t�F�[�X]�D�g�P���h
       ,NVL(T_INSPC_ACPT_IF.INSPC_ACPT_AMOUNT,0) AS INSPC_ACPT_AMOUNT               --[�������я��C���^�t�F�[�X]�D�g�������z�h
       ,NVL(T_INSPC_ACPT_IF.DISC_AMOUNT,0) AS DISC_AMOUNT                           --[�������я��C���^�t�F�[�X]�D�g�l�������z�h
       ,T_INSPC_ACPT_IF.PLANT_CD                                                    --[�������я��C���^�t�F�[�X]�D�g�H��R�[�h�h
       ,M_VEND_CTRL.CUR_CD                                                          --[�����].�h����ʉ݃R�[�h�h
       ,M_VEND_CTRL.EXCH_TYP                                                        --[�����].�h�ב֎�ʁh
       ,M_VEND_CTRL.ROUND_TYP                                                       --[�����].�g�������z�܂�ߋ敪�h
       ,T_ACPT_RSLT.TAX_CD                                                          --[�������].�h����ŃR�[�h�h
       ,T_ACPT_RSLT.RATE_JUDGE_DATE                                                 --[�������].�h���[�g������h
       ,NVL(T_ACPT_RSLT.EXCH_RATE,0) AS EXCH_RATE                                   --[�������].�h�בփ��[�g�h
       ,NVL(T_ACPT_RSLT.TAX_RATE_1,0) AS TAX_RATE_1                                 --[�������].�h�ŗ�1�h
       ,NVL(T_ACPT_RSLT.TAX_RATE_2,0) AS TAX_RATE_2                                 --[�������].�h�ŗ��Q�h
       ,NVL(T_ACPT_RSLT.TAX_RATE_3,0) AS TAX_RATE_3                                 --[�������].�h�ŗ��R�h
       ,M_CUR.DECIMAL_FIG                                                           --[�ʉ�].�h���������h
       ,M_ITEM.ITEM_NAME                                                            --[�i��].�h�i�ږ��h
       ,M_ITEM.STOCK_UNIT                                                           --[�i��].�h�v�ʒP�ʁg
       ,DECODE(T_RLSD_PUCH_ODR.NON_NO_ITEM_FLG,0,M_ITEM.ITEM_NAME,T_RLSD_PUCH_ODR.NON_NO_ITEM_NAME) AS NON_NO_ITEM_NAME   
                                                                                    --[�����c].�h���i�����i�ږ��h
       ,T_RLSD_PUCH_ODR.NON_NO_ITEM_FLG                                             --[�����c].�h���i�����t���O�h
       ,NVL(T_INSPC_ACPT_IF.UNIT_COST,0) * NVL(T_INSPC_ACPT_IF.INSPC_ACPT_QTY,0) AS UNIT_AMOUNT    
                                                                                    --�{�̋��z�v�Z���P���~������
       ,DECODE(SUBSTR(T_ACPT_RSLT.TAX_CD,-1,1),'1','1','5','2','0') AS TAX_CD_1     --����ł̃`�F�b�N
       ,T_INSPC_ACPT_IF.UNIT_COST_TYP                                               --[�������я��C���^�t�F�[�X]�D�h�P���敪�g
       ,NVL2(T_RLSD_PUCH_ODR.WORK_IN_PROC_CD, M_SBCNT_UNIT_COST_H.VEND_ITEM_CD, M_PUCH_UNIT_COST_H.VEND_ITEM_CD) AS VEND_ITEM_CD
                                                                                    --�����i�ڔԍ�
       ,T_RLSD_PUCH_ODR.ODR_CANCEL_SLIP_ISS_FLG AS ODR_CANCEL_SLIP_ISS_FLG          --��������`�[���s�t���O
       ,T_INSPC_ACPT_IF.CRCT_TYP                                                    --�����敪
       ,0    AS RTN_FLG                                                             --�ԕi�v���O
    FROM T_INSPC_ACPT_IF                                                            
        ,M_VEND_CTRL 
        ,T_ACPT_RSLT
        ,M_ITEM 
        ,M_CUR
        ,T_RLSD_PUCH_ODR
        ,M_PUCH_UNIT_COST_H
        ,M_SBCNT_UNIT_COST_H
    WHERE 
        T_INSPC_ACPT_IF.PUCH_ODR_CD = T_RLSD_PUCH_ODR.PUCH_ODR_CD
    AND T_INSPC_ACPT_IF.VEND_CD = M_VEND_CTRL.VEND_CD
    AND T_INSPC_ACPT_IF.ACPT_NO = T_ACPT_RSLT.ACPT_NO
    AND T_INSPC_ACPT_IF.ITEM_CD = M_ITEM.ITEM_CD(+)
    AND M_VEND_CTRL.CUR_CD = M_CUR.CUR_CD
    AND T_INSPC_ACPT_IF.PUCH_ODR_CD = T_ACPT_RSLT.PUCH_ODR_CD
    AND T_INSPC_ACPT_IF.COMPANY_CD = M_VEND_CTRL.COMPANY_CD
    AND T_INSPC_ACPT_IF.APPR_FLG = 3
    AND T_INSPC_ACPT_IF.AI_AP_IF_FLG = 0
    AND T_INSPC_ACPT_IF.PUCH_RTN_FLG = 0
    AND T_RLSD_PUCH_ODR.VEND_CD = M_PUCH_UNIT_COST_H.VEND_CD(+)
    AND T_RLSD_PUCH_ODR.PLANT_CD = M_PUCH_UNIT_COST_H.PLANT_CD(+)
    AND T_RLSD_PUCH_ODR.COMPANY_CD = M_PUCH_UNIT_COST_H.COMPANY_CD(+)
    AND T_RLSD_PUCH_ODR.ITEM_CD = M_PUCH_UNIT_COST_H.ITEM_CD(+)
    AND T_RLSD_PUCH_ODR.VEND_CD = M_SBCNT_UNIT_COST_H.VEND_CD(+)
    AND T_RLSD_PUCH_ODR.PLANT_CD = M_SBCNT_UNIT_COST_H.PLANT_CD(+)
    AND T_RLSD_PUCH_ODR.COMPANY_CD = M_SBCNT_UNIT_COST_H.COMPANY_CD(+)
    AND T_RLSD_PUCH_ODR.ITEM_CD = M_SBCNT_UNIT_COST_H.ITEM_CD(+)
    AND T_RLSD_PUCH_ODR.WORK_IN_PROC_CD = M_SBCNT_UNIT_COST_H.PROC_CD(+)
UNION
    SELECT
        T_INSPC_ACPT_IF.PUCH_ODR_CD                                                 --[�������я��C���^�t�F�[�X]�D�h�����ԍ��g
       ,T_INSPC_ACPT_IF.ACPT_NO                                                     --[�������я��C���^�t�F�[�X]�D�g����񐔁h
       ,T_INSPC_ACPT_IF.INSPC_ACPT_NO                                               --[�������я��C���^�t�F�[�X]�D�g�����ԍ��h
       ,T_INSPC_ACPT_IF.ITEM_CD                                                     --[�������я��C���^�t�F�[�X]�D�h�i�ڔԍ��g
       ,T_INSPC_ACPT_IF.INSPC_ACPT_DATE                                             --[�������я��C���^�t�F�[�X]�D�h�������h
       ,T_INSPC_ACPT_IF.VEND_CD                                                     --[�������я��C���^�t�F�[�X]�D�h�����R�[�h�h
       ,NVL(T_INSPC_ACPT_IF.INSPC_ACPT_QTY,0) AS INSPC_ACPT_QTY                     --[�������я��C���^�t�F�[�X]�D�h�������h
       ,NVL(T_INSPC_ACPT_IF.UNIT_COST,0) AS UNIT_COST                               --[�������я��C���^�t�F�[�X]�D�g�P���h
       ,NVL(T_INSPC_ACPT_IF.INSPC_ACPT_AMOUNT,0) AS INSPC_ACPT_AMOUNT               --[�������я��C���^�t�F�[�X]�D�g�������z�h
       ,NVL(T_INSPC_ACPT_IF.DISC_AMOUNT,0) AS DISC_AMOUNT                           --[�������я��C���^�t�F�[�X]�D�g�l�������z�h
       ,T_INSPC_ACPT_IF.PLANT_CD                                                    --[�������я��C���^�t�F�[�X]�D�g�H��R�[�h�h
       ,M_VEND_CTRL.CUR_CD                                                          --[�����].�h����ʉ݃R�[�h�h
       ,M_VEND_CTRL.EXCH_TYP                                                        --[�����].�h�ב֎�ʁh
       ,M_VEND_CTRL.ROUND_TYP                                                       --[�����].�h�������z�܂�ߋ敪�h
       ,T_PUCH_ODR_RTN_RSLT.TAX_CD                                                  --[�w���ԕi].�h����ŃR�[�h�h
       ,T_PUCH_ODR_RTN_RSLT.PUCH_RTN_DATE                                           --[�w���ԕi].�h���[�g������h
       ,NVL(T_PUCH_ODR_RTN_RSLT.EXCH_RATE,0)  AS EXCH_RATE                          --[�w���ԕi].�h�בփ��[�g�h
       ,NVL(T_PUCH_ODR_RTN_RSLT.TAX_RATE_1,0) AS TAX_RATE_1                         --[�w���ԕi].�h�ŗ�1�h
       ,NVL(T_PUCH_ODR_RTN_RSLT.TAX_RATE_2,0) AS TAX_RATE_2                         --[�w���ԕi].�h�ŗ��Q�h
       ,NVL(T_PUCH_ODR_RTN_RSLT.TAX_RATE_3,0) AS TAX_RATE_3                         --[�w���ԕi].�h�ŗ��R�h
       ,M_CUR.DECIMAL_FIG                                                           --[�ʉ�].�h���������h
       ,M_ITEM.ITEM_NAME                                                            --[�i��].�h�i�ږ��h
       ,M_ITEM.STOCK_UNIT                                                           --[�i��].�h�v�ʒP�ʁg
       ,T_PUCH_ODR_RTN_RSLT.NON_NO_ITEM_NAME AS NON_NO_ITEM_NAME                    --[�����c].�h���i�����i�ږ��h
       ,T_PUCH_ODR_RTN_RSLT.NON_NO_ITEM_TYP                                         --[�����c].�h���i�����t���O�h
       ,NVL(T_INSPC_ACPT_IF.UNIT_COST,0) * NVL(T_INSPC_ACPT_IF.INSPC_ACPT_QTY,0) AS UNIT_AMOUNT    
                                                                                    --�{�̋��z�v�Z���P���~������
       ,DECODE(SUBSTR(T_PUCH_ODR_RTN_RSLT.TAX_CD,-1,1),'1','1','5','2','0') AS TAX_CD_1     
                                                                                    --����ł̃`�F�b�N
       ,T_INSPC_ACPT_IF.UNIT_COST_TYP                                               --[�������я��C���^�t�F�[�X]�D�h�P���敪�g
       ,M_PUCH_UNIT_COST_H.VEND_ITEM_CD AS VEND_ITEM_CD                             --�����i�ڔԍ�
       ,T_PUCH_ODR_RTN_RSLT.RTN_DEL_FLG AS ODR_CANCEL_SLIP_ISS_FLG                  --����t���O              
       ,T_INSPC_ACPT_IF.CRCT_TYP                                                    --�����敪
       ,1    AS RTN_FLG                                                             --�ԕi�v���O
    FROM T_INSPC_ACPT_IF                                                            
        ,M_VEND_CTRL 
        ,T_PUCH_ODR_RTN_RSLT
        ,M_ITEM 
        ,M_CUR
        ,M_PUCH_UNIT_COST_H
    WHERE 
      T_INSPC_ACPT_IF.PUCH_ODR_CD = T_PUCH_ODR_RTN_RSLT.PUCH_ODR_CD
    AND T_INSPC_ACPT_IF.VEND_CD = M_VEND_CTRL.VEND_CD
    AND T_INSPC_ACPT_IF.ITEM_CD = M_ITEM.ITEM_CD(+)
    AND M_VEND_CTRL.CUR_CD = M_CUR.CUR_CD
    AND T_INSPC_ACPT_IF.COMPANY_CD = M_VEND_CTRL.COMPANY_CD
    AND T_INSPC_ACPT_IF.APPR_FLG = 3
    AND T_INSPC_ACPT_IF.AI_AP_IF_FLG = 0
    AND T_INSPC_ACPT_IF.PUCH_RTN_FLG = 1
    AND T_INSPC_ACPT_IF.VEND_CD = M_PUCH_UNIT_COST_H.VEND_CD(+)
    AND T_INSPC_ACPT_IF.PLANT_CD = M_PUCH_UNIT_COST_H.PLANT_CD(+)
    AND T_INSPC_ACPT_IF.COMPANY_CD = M_PUCH_UNIT_COST_H.COMPANY_CD(+)
    AND T_INSPC_ACPT_IF.ITEM_CD = M_PUCH_UNIT_COST_H.ITEM_CD(+)
    ) ORDER BY PUCH_ODR_CD,ACPT_NO,INSPC_ACPT_NO

    ;
BEGIN
     /* LogFile �� OPEN */
    blnRet :=  FNCLOGOPEN(pvc2OutputPath, pvc2OutputName,pvc2PlantCd, pvc2OutputMode, UTL_FileHandle);

    /* TraceLog�̏o��(Start)�������s�� */
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_START);
                          
    IF (NOT blnRet) THEN        
        --//���ʃX�e�[�^�X���ُ���Z�b�g����
        pnumStatus := STATUS_ERROR;
        RAISE excFncTraceLog;
    END IF;

    /* �Ɩ��J�n���b�Z�[�W�̏o�� */
    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_START,LOGMSG_STR_MESSAGE);
    
    --//�J�E���^�A�ϐ��̏�����
    numSuccessCount:= 0;
    numErrCount    := 0;
    numTotalCount  := 0;
    numWarnCount   := 0;
    numOffsetCount := 0;
    numZeroCount   := 0;

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
    
    --//���P���f�[�^���M���f�t���O�擾
    BEGIN
        SELECT
            VALUE                                                --�ݒ�l
        INTO
            wvc2Value                                            --�ݒ�l
        FROM
            SYS_PARAMETER                                        --�p�����[�^
        WHERE
            NAME = 'UNIT_COST_TYP_FLG';                          --���O
    EXCEPTION
        WHEN OTHERS THEN
            wvc2Value := '';
    END;
    
    --//���|�����b�N����
    OPEN CUR_T_AI_AP_IF_LOCK;

    FOR Rec_T_INSPC_ACPT_IF IN CUR_T_INSPC_ACPT_IF LOOP
        numTotalCount := numTotalCount+1;
        wblnErrorFlg   := FALSE;
        wblnWarnFlg    := FALSE;
        wnumOFFSETFlg:= 0;
        wnumINSERTCK:=0;
        BEGIN
           --�@.�h�i�ڔԍ��g�@IS�@NULL�@�ꍇ
           IF Rec_T_INSPC_ACPT_IF.ITEM_CD IS NULL THEN
                vc2Comment:= SUBSTR('(SBM0352)�i�ڔԍ����󔒁@�����ԍ�['|| Rec_T_INSPC_ACPT_IF.PUCH_ODR_CD || ']' ||
                             ' �����[' || Rec_T_INSPC_ACPT_IF.ACPT_NO || ']' ||
                             ' �����ԍ�[' || Rec_T_INSPC_ACPT_IF.INSPC_ACPT_NO  || ']'  ,
                             1,256);

                 /* TraceLog �̏o�� */
                 blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                                       pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_ITEM_CD_NULL);

                /* �Ɩ��I�����b�Z�[�W�̏o�� */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                    pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_ITEM_CD_NULL, vc2Comment);
                wnumINSERT := 0;     --�o�^�t���O���O�@���o�^
                wblnErrorFlg := TRUE;
                GOTO MASK;
           ELSE
               --//�A[F99�D4�D3�擾�f�[�^]�D�h�P���敪�g�@���@�P���P���@���@���P���f�[�^���M���f�t���O���O�i���P���f�[�^�𑗐M���Ȃ��j�@�ꍇ
               IF Rec_T_INSPC_ACPT_IF.UNIT_COST_TYP = 1 AND wvc2Value = '0' THEN
                   vc2Comment:= SUBSTR('(SBM0353)���P���f�[�^�G���[�@�����ԍ�['|| Rec_T_INSPC_ACPT_IF.PUCH_ODR_CD||']' ||
                                       ' �����[' || Rec_T_INSPC_ACPT_IF.ACPT_NO || ']'  ||
                                       ' �����ԍ�[' || Rec_T_INSPC_ACPT_IF.INSPC_ACPT_NO   || ']'  ,
                                        1,256);

                   /* TraceLog �̏o�� */
                   blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                                         pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_PARAM_ERR);

                   /* �Ɩ��I�����b�Z�[�W�̏o�� */
                   blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                       pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_PARAM_ERR, vc2Comment);

                   wblnErrorFlg := TRUE;
                   wnumINSERT:= 0;--�o�^�t���O���O�@���o�^
                   GOTO MASK;
                   
               END IF;
               --//�B	[F99�D4�D3�擾�f�[�^]�D�h�P���敪�g�@���@�P���P���@���@���P���f�[�^���M���f�t���O���P�i���P���f�[�^�𑗐M����j�@�ꍇ
               IF Rec_T_INSPC_ACPT_IF.UNIT_COST_TYP = 1 AND wvc2Value = '1' THEN
                   vc2Comment:= SUBSTR('(SBM0354)���P���f�[�^���[�j���O�@�����ԍ�['|| Rec_T_INSPC_ACPT_IF.PUCH_ODR_CD||']' ||
                                       ' �����[' || Rec_T_INSPC_ACPT_IF.ACPT_NO || ']'  ||
                                       ' �����ԍ�[' || Rec_T_INSPC_ACPT_IF.INSPC_ACPT_NO   || ']'  ,
                                        1,256);

                   /* TraceLog �̏o�� */
                   blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                                         pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_PARAM_WAR);

                   /* �Ɩ��I�����b�Z�[�W�̏o�� */
                   blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                       pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_PARAM_WAR, vc2Comment);

                   wblnWarnFlg  := TRUE;

               END IF;
               --�B	�{�̋��z�v�Z
               blnRet := FNCGETROUND4FD(
                                       UTL_FileHandle                                    --�t�@�C���n���h��
                                       ,pvc2LogMode                                      --�k�n�f���[�h
                                       ,pvc2OutputMode                                   --�o�̓��[�h
                                       ,pvc2UserId                                       --���[�U�h�c
                                       ,pvc2BusinessName                                 --�Ɩ���
                                       ,pvc2PlantCd                                      --�H��R�[�h
                                       ,Rec_T_INSPC_ACPT_IF.UNIT_AMOUNT                  --�{�̋��z
                                       ,Rec_T_INSPC_ACPT_IF.DECIMAL_FIG                  --��������
                                       ,Rec_T_INSPC_ACPT_IF.ROUND_TYP                    --�������z�܂�ߋ敪
                                       ,wnumUnitAmount                                   --�{�̋��z�v�Z
                                       ,pvc2ErrorCd                                      --�G���[���b�Z�[�WID
                                       ,pnumStatus                                       --���ʃX�e�[�^�X�i1�F����I�� 2:�x���I�� 3�F�ُ�I���j
               );
               --�ُ�
               IF pnumStatus = 3 OR blnRet = FALSE THEN
                   vc2Comment:= SUBSTR('(SBM0355)�{�̋��z�v�Z�ُ�@�����ԍ�['|| Rec_T_INSPC_ACPT_IF.PUCH_ODR_CD || ']'  ||
                                ' �����[' || Rec_T_INSPC_ACPT_IF.ACPT_NO || ']'  ||
                                ' �����ԍ�[' || Rec_T_INSPC_ACPT_IF.INSPC_ACPT_NO   || ']'  ,
                                1,256);
                    /* TraceLog �̏o�� */
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                                          pvc2PlantCd, MY_SQL_NAME, vc2Comment);
                                 
                   /* �Ɩ��I�����b�Z�[�W�̏o�� */
                   blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                       pvc2PlantCd, MY_SQL_NAME, pvc2ErrorCd,vc2Comment);

                   wblnErrorFlg := TRUE;
                   GOTO MASK;
               END IF;
               
               --���[�j���O
               IF pnumStatus = 2 THEN
                   vc2Comment:= SUBSTR('(SBM0356)�{�̋��z�v�Z���[�j���O�@�����ԍ�['|| Rec_T_INSPC_ACPT_IF.PUCH_ODR_CD || ']'  ||
                                ' �����[' || Rec_T_INSPC_ACPT_IF.ACPT_NO || ']'  ||
                                ' �����ԍ�[' || Rec_T_INSPC_ACPT_IF.INSPC_ACPT_NO   || ']'  ,
                                1,256);

                    /* TraceLog �̏o�� */
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                                          pvc2PlantCd, MY_SQL_NAME, vc2Comment);

                   /* �Ɩ��I�����b�Z�[�W�̏o�� */
                   blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                          pvc2PlantCd, MY_SQL_NAME, pvc2ErrorCd,vc2Comment);

                   wblnWarnFlg := TRUE;

               END IF;
               
               --�E	���z�v�Z
               wnumAmount :=wnumUnitAmount - Rec_T_INSPC_ACPT_IF.DISC_AMOUNT;

               --�C	�������z�A�Ŕ��������z�A�O�őΏۋ��z�A�O�ŏ���ŁA���őΏۋ��z�A���ŏ���ŁA��ېőΏۋ��z�̌v�Z���ʕ��i
               blnRet := FncCalcTaxCalcAmtFD(
                                       UTL_FileHandle                                    --�t�@�C���n���h��
                                       ,pvc2LogMode                                      --�k�n�f���[�h
                                       ,pvc2OutputMode                                   --�o�̓��[�h
                                       ,pvc2UserId                                       --���[�U�h�c
                                       ,pvc2BusinessName                                 --�Ɩ���
                                       ,pvc2PlantCd                                      --�H��R�[�h
                                       ,SUBSTR(Rec_T_INSPC_ACPT_IF.TAX_CD,-1,1)          --����ŃR�[�h�̉��P���{�̋��z
                                       ,Rec_T_INSPC_ACPT_IF.TAX_RATE_1                   --�ŗ�1
                                       ,Rec_T_INSPC_ACPT_IF.TAX_RATE_2                   --�ŗ�2
                                       ,Rec_T_INSPC_ACPT_IF.TAX_RATE_3                   --�ŗ�3
                                       ,Rec_T_INSPC_ACPT_IF.ROUND_TYP                    --�������z�܂�ߋ敪
                                       ,Rec_T_INSPC_ACPT_IF.DECIMAL_FIG                  --��������
                                       ,wnumAmount                                       --�v�Z���ꂽ���z
                                       ,wnumTaxAmount1                                   --�Ŋz1
                                       ,wnumTaxAmount2                                   --�Ŋz2
                                       ,wnumTaxAmount3                                   --�Ŋz3
                                       ,wnumTaxOutAmount                                 --�Ŕ����z
                                       ,wnumTaxAmount                                    --����Ŋz
                                       ,wnumTaxInAmount                                  --�ō����z
                                       ,wnumExternalTaxSalesAmount                       --�O�őΏۋ��z
                                       ,wnumInternalTaxSalesAmount                       --���őΏۋ��z
                                       ,wnumTaxFreeSalesAmount                           --��ېőΏۋ��z
                                       ,wnumExternalTaxAmount                            --����Ŋz�i�O�Łj
                                       ,wnumInternalTaxAmount                            --����Ŋz�i���Łj             
                                       ,pvc2ErrorCd                                      --�G���[���b�Z�[�WID
                                       ,pnumStatus                                       --���ʃX�e�[�^�X�i1�F����I�� 2:�x���I�� 3�F�ُ�I���j
               );

               --�ُ�
               IF pnumStatus = 3 OR blnRet = FALSE THEN
                   vc2Comment:= SUBSTR('(SBM0357)�Ōv�Z�ُ�@�����ԍ�['|| Rec_T_INSPC_ACPT_IF.PUCH_ODR_CD || ']'  ||
                                ' �����[' || Rec_T_INSPC_ACPT_IF.ACPT_NO || ']'  ||
                                ' �����ԍ�[' || Rec_T_INSPC_ACPT_IF.INSPC_ACPT_NO   || ']'  ,
                                1,256);
                    /* TraceLog �̏o�� */
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                                          pvc2PlantCd, MY_SQL_NAME, vc2Comment);
                                 
                   /* �Ɩ��I�����b�Z�[�W�̏o�� */
                   blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                          pvc2PlantCd, MY_SQL_NAME, pvc2ErrorCd,vc2Comment);


                   wblnErrorFlg := TRUE;
                   GOTO MASK;
               END IF;
               
               --���[�j���O
               IF pnumStatus = 2 THEN
                   vc2Comment:= SUBSTR('(SBM0358)�Ōv�Z�v�Z���[�j���O�@�����ԍ�['|| Rec_T_INSPC_ACPT_IF.PUCH_ODR_CD || ']'  ||
                                ' �����[' || Rec_T_INSPC_ACPT_IF.ACPT_NO || ']'  ||
                                ' �����ԍ�[' || Rec_T_INSPC_ACPT_IF.INSPC_ACPT_NO   || ']'  ,
                                1,256);
                    /* TraceLog �̏o�� */
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                 MY_SQL_NAME, vc2Comment);
                                 
                   /* �Ɩ��I�����b�Z�[�W�̏o�� */
                   blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                          pvc2PlantCd, MY_SQL_NAME, pvc2ErrorCd,vc2Comment);
                                          
                   wblnWarnFlg := TRUE;
                     
               END IF;
               
               --�������z���擾����
               wnumInspcAmount :=  wnumTaxInAmount;

               
               --�D	�������z�i�M�݁j�̌v�Z
               --�������z�i�M�݁j���������z�~�בփ��[�g               
                --�[���������ʕ��i
               blnRet := FNCGETROUND4FD(
                                       UTL_FileHandle                                    --�t�@�C���n���h��
                                       ,pvc2LogMode                                      --�k�n�f���[�h
                                       ,pvc2OutputMode                                   --�o�̓��[�h
                                       ,pvc2UserId                                       --���[�U�h�c
                                       ,pvc2BusinessName                                 --�Ɩ���
                                       ,pvc2PlantCd                                      --�H��R�[�h
                                       ,wnumInspcAmount * Rec_T_INSPC_ACPT_IF.EXCH_RATE  --�������z�~�בփ��[�g      
                                       ,Rec_T_INSPC_ACPT_IF.DECIMAL_FIG                  --��������
                                       ,Rec_T_INSPC_ACPT_IF.ROUND_TYP                    --�������z�܂�ߋ敪
                                       ,wnumInspcCurAmount                               --�������z�i�M�݁j
                                       ,pvc2ErrorCd                                      --�G���[���b�Z�[�WID
                                       ,pnumStatus                                       --���ʃX�e�[�^�X�i1�F����I�� 2:�x���I�� 3�F�ُ�I���j
               );
               --�ُ�
               IF pnumStatus = 3 OR blnRet = FALSE THEN
                   vc2Comment:= SUBSTR('(SBM0359)�������z�i�M�݁j�v�Z�ُ�@�����ԍ�['        || Rec_T_INSPC_ACPT_IF.PUCH_ODR_CD              || ']'  ||
                                ' �����[' || Rec_T_INSPC_ACPT_IF.ACPT_NO || ']'  ||
                                ' �����ԍ�['       || Rec_T_INSPC_ACPT_IF.INSPC_ACPT_NO     || ']'  ,
                                1,256);
                    /* TraceLog �̏o�� */
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                 MY_SQL_NAME, vc2Comment);
                                 
                   /* �Ɩ��I�����b�Z�[�W�̏o�� */
                   blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                          pvc2PlantCd, MY_SQL_NAME, pvc2ErrorCd, vc2Comment);

                   wblnErrorFlg := TRUE;
                   GOTO MASK;
               END IF;
               
               --���[�j���O
               IF pnumStatus = 2 THEN
                   vc2Comment:= SUBSTR('(SBM0360)�������z�i�M�݁j�v�Z���[�j���O�@�@�����ԍ�['|| Rec_T_INSPC_ACPT_IF.PUCH_ODR_CD || ']'  ||
                                ' �����[' || Rec_T_INSPC_ACPT_IF.ACPT_NO || ']'  ||
                                ' �����ԍ�[' || Rec_T_INSPC_ACPT_IF.INSPC_ACPT_NO   || ']'  ,
                                1,256);
                    /* TraceLog �̏o�� */
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                 MY_SQL_NAME, vc2Comment);
                                 
                   /* �Ɩ��I�����b�Z�[�W�̏o�� */
                   blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                          pvc2PlantCd, MY_SQL_NAME, pvc2ErrorCd,vc2Comment);

                    wblnWarnFlg := TRUE;

               END IF;
               
               --�E	�Ŕ��������z�i�M�݁j�̌v�Z
               --�Ŕ��������z�i�M�݁j���Ŕ��������z�~�בփ��[�g               
               --�[���������ʕ��i
               blnRet := FNCGETROUND4FD(
                                       UTL_FileHandle                                    --�t�@�C���n���h��
                                       ,pvc2LogMode                                      --�k�n�f���[�h
                                       ,pvc2OutputMode                                   --�o�̓��[�h
                                       ,pvc2UserId                                       --���[�U�h�c
                                       ,pvc2BusinessName                                 --�Ɩ���
                                       ,pvc2PlantCd                                      --�H��R�[�h
                                       ,wnumTaxOutAmount * Rec_T_INSPC_ACPT_IF.EXCH_RATE --�Ŕ��������z�~�בփ��[�g      
                                       ,Rec_T_INSPC_ACPT_IF.DECIMAL_FIG                  --��������
                                       ,Rec_T_INSPC_ACPT_IF.ROUND_TYP                    --�������z�܂�ߋ敪
                                       ,wnumTaxCurAmount                                 --�������z�i�M�݁j
                                       ,pvc2ErrorCd                                      --�G���[���b�Z�[�WID
                                       ,pnumStatus                                       --���ʃX�e�[�^�X�i1�F����I�� 2:�x���I�� 3�F�ُ�I���j
               );
               --�ُ�
               IF pnumStatus = 3 OR blnRet = FALSE THEN
                   vc2Comment:= SUBSTR('(SBM0361)�Ŕ��������z�i�M�݁j�v�Z�ُ�@�����ԍ�['|| Rec_T_INSPC_ACPT_IF.PUCH_ODR_CD || ']'  ||
                                ' �����[' || Rec_T_INSPC_ACPT_IF.ACPT_NO || ']'  ||
                                ' �����ԍ�[' || Rec_T_INSPC_ACPT_IF.INSPC_ACPT_NO   || ']'  ,
                                1,256);
                    /* TraceLog �̏o�� */
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                 MY_SQL_NAME, vc2Comment);
                                 
                   /* �Ɩ��I�����b�Z�[�W�̏o�� */
                   blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                          pvc2PlantCd, MY_SQL_NAME, pvc2ErrorCd,vc2Comment);

                   wblnErrorFlg := TRUE;
                   GOTO MASK;
               END IF;
               
               --���[�j���O
               IF pnumStatus = 2 THEN
                   vc2Comment:= SUBSTR('(SBM0362)�Ŕ��������z�i�M�݁j�v�Z���[�j���O�@�@�����ԍ�['|| Rec_T_INSPC_ACPT_IF.PUCH_ODR_CD || ']'  ||
                                ' �����[' || Rec_T_INSPC_ACPT_IF.ACPT_NO || ']'  ||
                                ' �����ԍ�[' || Rec_T_INSPC_ACPT_IF.INSPC_ACPT_NO   || ']'  ,
                                1,256);
                    /* TraceLog �̏o�� */
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                 MY_SQL_NAME, vc2Comment);
                                 
                   /* �Ɩ��I�����b�Z�[�W�̏o�� */
                   blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                          pvc2PlantCd, MY_SQL_NAME, pvc2ErrorCd,vc2Comment);

                   wblnWarnFlg := TRUE;

               END IF;

               --�O����͓`�[�ԍ�
               wnumINPUT_SLIP_CDWK:=wnumINPUT_SLIP_CD;

           --�F[���|���C���^�t�F�[�X]�֓o�^����
               --�ԍ��f�[�^���E
               --�O�񏈗��f�[�^�Ɠ��������ԍ��������
               IF wvc2PUCH_ODR_CDWK =Rec_T_INSPC_ACPT_IF.PUCH_ODR_CD THEN
                   IF wnumACPT_NOWK=Rec_T_INSPC_ACPT_IF.ACPT_NO  THEN
                       IF  Rec_T_INSPC_ACPT_IF.RTN_FLG=0 THEN
                           --����f�[�^
                           --�ԂŃf�[�^�ꍇ
                           IF Rec_T_INSPC_ACPT_IF.CRCT_TYP=1 THEN
                               IF wnumINSERT=1 THEN
                                   BEGIN
                                      DELETE T_AI_AP_IF WHERE INPUT_SLIP_CD= wnumINPUT_SLIP_CDWK;
                                   EXCEPTION                                                                                  
                                      WHEN OTHERS THEN
                                          vc2Comment:= SUBSTR('(SBM0363)���|���o�^���s�@�@�����ԍ�['|| Rec_T_INSPC_ACPT_IF.PUCH_ODR_CD || ']'  ||
                                          ' �����[' || Rec_T_INSPC_ACPT_IF.ACPT_NO      || ']'  ||
                                          ' �����ԍ�[' || Rec_T_INSPC_ACPT_IF.INSPC_ACPT_NO|| ']' || SQLERRM ,
                                          1,256);
                                          /* TraceLog �̏o�� */
                                          blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                                           pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                                           MY_SQL_NAME, LOGMSG_NM_AI_AP_IF_INS);
                                    
                                          /* �Ɩ��I�����b�Z�[�W�̏o�� */
                                          blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                                 pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_AI_AP_IF_INS, vc2Comment);

                                          wblnErrorFlg := TRUE;
                                          GOTO MASK;
                                   END;
                                   wnumOFFSETFlg:=1;
                                   /*�o�^�t���O�Z�b�g*/
                                   wnumINSERT:=0;
                                   /*�o�^���Ȃ��Z�b�g*/
                                   wnumINSERTCK:=1;
                               ELSE
                                   wnumOFFSETFlg :=2;
                                   /*�o�^�t���O�Z�b�g*/
                                   wnumINSERT:=0;
                                   /*�o�^���Ȃ��Z�b�g*/
                                   wnumINSERTCK:=1;
                               END IF;
                           END IF;
                       ELSE
                           --�ԕi�f�[�^
                           --�ԂŃf�[�^�ꍇ
                           IF Rec_T_INSPC_ACPT_IF.CRCT_TYP=2 THEN
                               IF wnumINSERT=1 THEN
                                   BEGIN
                                      DELETE T_AI_AP_IF WHERE INPUT_SLIP_CD= wnumINPUT_SLIP_CDWK;
                                   EXCEPTION                                                                                  
                                      WHEN OTHERS THEN
                                          vc2Comment:= SUBSTR('(SBM0363)���|���o�^���s�@�@�����ԍ�['|| Rec_T_INSPC_ACPT_IF.PUCH_ODR_CD || ']'  ||
                                          ' �����[' || Rec_T_INSPC_ACPT_IF.ACPT_NO      || ']'  ||
                                          ' �����ԍ�[' || Rec_T_INSPC_ACPT_IF.INSPC_ACPT_NO|| ']' || SQLERRM ,
                                          1,256);
                                          /* TraceLog �̏o�� */
                                          blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                                           pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                                           MY_SQL_NAME, LOGMSG_NM_AI_AP_IF_INS);
                                    
                                          /* �Ɩ��I�����b�Z�[�W�̏o�� */
                                          blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                                 pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_AI_AP_IF_INS, vc2Comment);

                                          wblnErrorFlg := TRUE;
                                          GOTO MASK;
                                   END;
                                   wnumOFFSETFlg:=1;
                                   /*�o�^�t���O�Z�b�g*/
                                   wnumINSERT:=0;
                                   /*�o�^���Ȃ��Z�b�g*/
                                   wnumINSERTCK:=1;
                               ELSE
                                   wnumOFFSETFlg :=2;
                                   /*�o�^�t���O�Z�b�g*/
                                   wnumINSERT:=0;
                                   /*�o�^���Ȃ��Z�b�g*/
                                   wnumINSERTCK:=1;
                               END IF;
                           END IF;
                       END IF;
                   END IF;
               END IF;

               --�o�^����
               IF wnumINSERTCK=0 THEN
                   IF wnumInspcAmount<>0 THEN  
                       BEGIN
                       --���͓`�[�ԍ��̔�
                       SELECT SEQ_INPUTDENNO_DEBT.nextval 
                       INTO wnumINPUT_SLIP_CD
                       FROM DUAL;

                       INSERT INTO T_AI_AP_IF (
                                           INPUT_SLIP_CD                                                  --���͓`�[�ԍ�
                                           ,SLIP_ROW_NO                                                   --�`�[�s�ԍ�
                                           ,PUCH_ODR_CD                                                   --�����ԍ�
                                           ,ACPT_NO                                                       --�����
                                           ,PROCESS_TYP                                                   --�����敪
                                           ,SLIP_TYP                                                      --�`�[�敪
                                           ,INSPC_ACPT_DATE                                               --������
                                           ,VEND_CD                                                       --�����R�[�h
                                           ,PLANT_CD                                                      --�H��R�[�h
                                           ,CURRNCY_CD                                                    --�ʉ݃R�[�h
                                           ,EXCH_TYP                                                      --�ב֎��
                                           ,EXCH_RATE                                                     --�בփ��[�g
                                           ,EXCH_RESERVE_CD                                               --�ב֗\��R�[�h
                                           ,TAX_CMP_TYP                                                   --�ŎZ�o�敪
                                           ,CLOSING_TYP                                                   --�x���������敪
                                           ,SALES_TYP                                                     --����敪
                                           ,ITEM_CD                                                       --�i�ڔԍ�
                                           ,ITEM_NAME                                                     --�i�ږ���
                                           ,INSPC_ACPT_QTY                                                --������
                                           ,UNIT_CD                                                       --�P��
                                           ,UNIT_COST                                                     --�P��
                                           ,NET_AMOUNT                                                    --�{�̋��z
                                           ,DISC_AMOUNT                                                   --�l�������z
                                           ,INSPC_ACPT_AMOUNT                                             --�������z
                                           ,INSPC_ACPT_AMOUNT_EXCH_RATES                                  --�������z�i�M�݁j
                                           ,TAX_CREDIT_AMOUNT                                             --�Ŕ��������z
                                           ,TAX_CREDIT_AMOUNT_EXCH_RATES                                  --�Ŕ��������z�i�M�݁j
                                           ,TAX_INT_EXT_TYP                                               --����œ��O�敪
                                           ,TAX_CD                                                        --����ŃR�[�h
                                           ,EXTERNAL_TAX_INSPC_ACPT_AMOUNT                                --�O�őΏۋ��z
                                           ,EXTERNAL_TAX_AMOUNT                                           --�O�ŏ����
                                           ,INTERNAL_TAX_INSPC_ACPT_AMOUNT                                --���őΏۋ��z
                                           ,INTERNAL_TAX_AMOUNT                                           --���ŏ����
                                           ,TAXFREE_INSPC_ACPT_AMOUNT                                     --��ېőΏۋ��z
                                           ,PUCH_TYP                                                      --�d���v��敪
                                           ,ARRIVAL_ITEM_TYP                                              --���׋敪
                                           ,STOCK_CTRL_TYP                                                --�݌ɊǗ��敪
                                           ,PAY_COND_TYP                                                  --�x�������w��敪
                                           ,TAX_CALC_TYP                                                  --����Ōv�Z�w���敪
                                           ,VEND_ITEM_CD                                                  --�����i�ڔԍ�
                                           ,RETRIEVE_FLG                                                  --AI�V�X�e���捞�t���O
                                           ,CREATED_DATE                                                  --�쐬��
                                           ,CREATED_BY                                                    --�쐬��
                                           ,CREATED_PRG_NM                                                --�쐬�v���O������
                                           ,UPDATED_DATE                                                  --�X�V��
                                           ,UPDATED_BY                                                    --�X�V��
                                           ,UPDATED_PRG_NM                                                --�X�V�v���O������
                                           ,MODIFY_COUNT                                                  --�X�V��
                                           )
                                      VALUES(
                                             wnumINPUT_SLIP_CD                                            --�̔Ԃ��ꂽ�`�[�ԍ�
                                            ,1                                                            --�P
                                            ,Rec_T_INSPC_ACPT_IF.PUCH_ODR_CD                              --�����ԍ�
                                            ,Rec_T_INSPC_ACPT_IF.ACPT_NO                                  --�����
                                            ,0                                                            --0(�`�[�ǉ�)
                                            ,10                                                          --10(�d��)
                                            ,Rec_T_INSPC_ACPT_IF.INSPC_ACPT_DATE                          --������
                                            ,Rec_T_INSPC_ACPT_IF.VEND_CD                                  --�����R�[�h
                                            ,Rec_T_INSPC_ACPT_IF.PLANT_CD                                 --�H��R�[�h
                                            ,Rec_T_INSPC_ACPT_IF.CUR_CD                                   --�ʉ݃R�[�h
                                            ,Rec_T_INSPC_ACPT_IF.EXCH_TYP                                 --�ב֎��
                                            ,Rec_T_INSPC_ACPT_IF.EXCH_RATE                                --�בփ��[�g
                                            ,NULL                                                         --NULL
                                            ,1                                                            --�P�i���ׁj
                                            ,2                                                            --�u2�F�����v�ɌŒ�
                                            ,NULL                                                         --NULL
                                            ,Rec_T_INSPC_ACPT_IF.ITEM_CD                                  --�i�ڔԍ�
                                            ,Rec_T_INSPC_ACPT_IF.NON_NO_ITEM_NAME                         --���i�����t���O��0 �ʏ픭���ꍇ �i�ږ�,���i�����t���O��1 ���i�����ꍇ ���i�����i�ږ�
                                            ,Rec_T_INSPC_ACPT_IF.INSPC_ACPT_QTY                           --������
                                            ,Rec_T_INSPC_ACPT_IF.STOCK_UNIT                               --�v�ʒP��
                                            ,Rec_T_INSPC_ACPT_IF.UNIT_COST                                --�P��
                                            ,wnumUnitAmount                                               --�B�Ōv�Z���ꂽ�{�̋��z
                                            ,Rec_T_INSPC_ACPT_IF.DISC_AMOUNT                              --�l�������z
                                            ,wnumInspcAmount                                              --�C�Ōv�Z���ꂽ�������z
                                            ,wnumInspcCurAmount                                           --�D�Ōv�Z���ꂽ�������z�i�M�݁j
                                            ,wnumTaxOutAmount                                             --�C�Ōv�Z���ꂽ�Ŕ��������z
                                            ,wnumTaxCurAmount                                             --�E�Ōv�Z���ꂽ�Ŕ��������z�i�M�݁j
                                            ,Rec_T_INSPC_ACPT_IF.TAX_CD_1                                 --����ŃR�[�h�̉��P����1:�O�ł̏ꍇ �P�i�O�Łj,����ŃR�[�h�̉��P����5:���ł̏ꍇ 2�i���Łj,����ŃR�[�h�̉��P����1:�O��,5:���ŁA�̏ꍇ ,0�i��ېŁj
                                            ,Rec_T_INSPC_ACPT_IF.TAX_CD                                   --����ŃR�[�h
                                            ,wnumExternalTaxSalesAmount                                   --�C�Ōv�Z���ꂽ�O�őΏۋ��z
                                            ,wnumExternalTaxAmount                                        --�C�Ōv�Z���ꂽ�O�ŏ����
                                            ,wnumInternalTaxSalesAmount                                   --�C�Ōv�Z���ꂽ���őΏۋ��z
                                            ,wnumInternalTaxAmount                                        --�C�Ōv�Z���ꂽ���ŏ����
                                            ,wnumTaxFreeSalesAmount                                       --�C�Ōv�Z���ꂽ��ېőΏۋ��z
                                            ,0                                                            --0�i���ׁj
                                            ,0                                                            --0�i�ʏ�j
                                            ,1                                                            --1�i�݌ɊǗ����Ȃ��j
                                            ,0                                                            --0�i�����w��j
                                            ,0                                                            --0�i����Ōv�Z���Ȃ��j
                                            ,Rec_T_INSPC_ACPT_IF.VEND_ITEM_CD                             --�����i�ڔԍ�
                                            ,0                                                            --0�F���捞
                                            ,SYSDATE                                                      --sysdate
                                            ,pvc2UserId                                                   --�����D���[�U�h�c
                                            ,pvc2BusinessName                                             --�����D�Ɩ���
                                            ,SYSDATE                                                      --sysdate
                                            ,pvc2UserId                                                   --�����D���[�U�h�c
                                            ,pvc2BusinessName                                             --�����D�Ɩ���
                                            ,0                                                            --0
                                            )                                                              
                                            ;                                                              

                       EXCEPTION                                                                                  
                           WHEN OTHERS THEN
                               vc2Comment:= SUBSTR('(SBM0363)���|���o�^���s�@�@�����ԍ�['|| Rec_T_INSPC_ACPT_IF.PUCH_ODR_CD || ']'  ||
                                    ' �����[' || Rec_T_INSPC_ACPT_IF.ACPT_NO      || ']'  ||
                                    ' �����ԍ�[' || Rec_T_INSPC_ACPT_IF.INSPC_ACPT_NO|| ']' || SQLERRM ,
                                    1,256);
                                
                               /* TraceLog �̏o�� */
                               blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                    MY_SQL_NAME, LOGMSG_NM_AI_AP_IF_INS);
                                    
                               /* �Ɩ��I�����b�Z�[�W�̏o�� */
                               blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                             pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_AI_AP_IF_INS, vc2Comment);

                               wblnErrorFlg := TRUE;
                       GOTO MASK;
                       END;

                       /*�o�^�t���O�Z�b�g*/
                       wnumINSERT:=1;
                       wnumOFFSETFlg:=0;
                   ELSE 
                       wnumOFFSETFlg:=3;
                   END IF;
               END IF;
               
               --[�������я��C���^�t�F�[�X]�̍X�V����
               BEGIN
                   UPDATE T_INSPC_ACPT_IF SET
                         AI_AP_IF_FLG  =1
                        ,UPDATED_DATE  = SYSDATE
                        ,UPDATED_BY    = pvc2UserId
                        ,UPDATED_PRG_NM= pvc2BusinessName
                        ,MODIFY_COUNT  = MODIFY_COUNT + 1
                   WHERE PUCH_ODR_CD  = Rec_T_INSPC_ACPT_IF.PUCH_ODR_CD
                    AND ACPT_NO       = Rec_T_INSPC_ACPT_IF.ACPT_NO
                    AND INSPC_ACPT_NO <= Rec_T_INSPC_ACPT_IF.INSPC_ACPT_NO
                    AND AI_AP_IF_FLG  = 0
                    AND APPR_FLG = 3
                   ;
               EXCEPTION
                   WHEN OTHERS THEN
                       vc2Comment:= SUBSTR('(SBM0366)�������я��X�V���s�@�@�����ԍ�['|| Rec_T_INSPC_ACPT_IF.PUCH_ODR_CD || ']'  ||
                                ' �����[' || Rec_T_INSPC_ACPT_IF.ACPT_NO      || ']'  ||
                                ' �����ԍ�[' || Rec_T_INSPC_ACPT_IF.INSPC_ACPT_NO|| ']' || SQLERRM ,
                                1, 256);
                                
                       /* TraceLog �̏o�� */
                       blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                    MY_SQL_NAME, LOGMSG_NM_INSPC_ACPT_UPD);
                                    
                       /* �Ɩ��I�����b�Z�[�W�̏o�� */
                       blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                             pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_INSPC_ACPT_UPD, vc2Comment);

                       wblnErrorFlg := TRUE;
                       GOTO MASK;
               END;
           END IF;
           wvc2PUCH_ODR_CDWK:=Rec_T_INSPC_ACPT_IF.PUCH_ODR_CD;   --�O�񔭒��v��ԍ�  
           wnumACPT_NOWK    :=Rec_T_INSPC_ACPT_IF.ACPT_NO;       --�O������  
<<MASK>>
            IF wblnErrorFlg = TRUE THEN
                numErrCount := numErrCount + 1;
                wnumSTSFlg :=2;
            ELSE
                IF wblnWarnFlg = TRUE THEN
                    IF wnumOFFSETFlg=0 THEN
                        numWarnCount := numWarnCount + 1;
                    ELSE 
                        IF wnumOFFSETFlg=1 THEN
                            IF wnumSTSFlg=0 THEN 
                                numSuccessCount :=numSuccessCount-1;
                            ELSE
                                IF wnumSTSFlg=1 THEN 
                                    numWarnCount :=numWarnCount -1;
                                ELSE 
                                    numWarnCount :=numWarnCount;
                                END IF;
                            END IF;
                        ELSE
                            IF wnumOFFSETFlg = 3 THEN
                                numZeroCount :=numZeroCount+1;
                            ELSE
                                numWarnCount := numWarnCount;
                            END IF;
                        END IF;
                    END IF;
                    wnumSTSFlg :=1;
                ELSE
                    IF wnumOFFSETFlg=0 THEN
                        numSuccessCount := numSuccessCount + 1;
                    ELSE 
                        IF wnumOFFSETFlg=1 THEN
                            IF wnumSTSFlg=0 THEN 
                                numSuccessCount :=numSuccessCount-1;
                            ELSE 
                                IF wnumSTSFlg=1 THEN 
                                    numWarnCount :=numWarnCount -1;
                                ELSE 
                                    numSuccessCount := numSuccessCount;
                                END IF;
                            END IF;
                        ELSE 
                            IF wnumOFFSETFlg=3 THEN
                                numZeroCount :=numZeroCount+1;
                            ELSE
                                numSuccessCount := numSuccessCount;
                            END IF;
                        END IF;
                    END IF;
                    wnumSTSFlg :=0;
               END IF;
            END IF;

        EXCEPTION
            WHEN OTHERS THEN                
               /* TraceLog �̏o�� */
               blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                                     pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_READ_DATA);
                            
               /* �Ɩ��I�����b�Z�[�W�̏o�� */
               blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                                   pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_READ_DATA, SQLERRM);
        END;
    END LOOP;
    
    IF CUR_T_AI_AP_IF_LOCK%ISOPEN THEN
        CLOSE CUR_T_AI_AP_IF_LOCK;
    END IF;
    
    --����̏ꍇ
    numOffsetCount:=numTotalCount-numSuccessCount-numWarnCount-numErrCount-numZeroCount;

    vc2Comment:= SUBSTR('(SBM0367)<< �`���A�g���|�C���^�t�F�[�X��������I��>>�@�Ώی����F['|| numTotalCount || ']'  ||
                                ' ���팏���F[' || numSuccessCount || ']'  ||
                                ' ���[�j���O�����F[' || numWarnCount || ']' || 
                                ' �ُ팏���F[' || numErrCount ||  ']' ||
                                ' �������z=0�f�[�^�����F[' ||  numZeroCount ||  ']' ||
                                ' ���E�f�[�^�����F[' ||  numOffsetCount ||  ']' ,
                                1,512);
     /* TraceLog �̏o�� */
     blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                           pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_SUCCESS);
                  
     /* �Ɩ��I�����b�Z�[�W�̏o�� */
     blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                         pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_SUCCESS, vc2Comment);
     /* ����I�� */
     pvc2ErrorCd := '';
     pnumStatus := STATUS_NORMAL;
     COMMIT;
EXCEPTION

    WHEN excFncTraceLog THEN
        ROLLBACK;        
        pnumStatus := STATUS_ERROR;
        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);
        
    WHEN excCommonChk THEN 
        ROLLBACK; 
        pnumStatus := STATUS_ERROR;
        pvc2ErrorCd:= LOGMSG_ID_COMMON_CHK;
        
        /* LogFile �� CLOSE */
         /* TraceLog �̏o�� */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                              pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_COMMON_CHK);

        /* �Ɩ��I�����b�Z�[�W�̏o�� */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                            pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_COMMON_CHK,LOGMSG_NM_COMMON_CHK);
                            
        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle); 
    WHEN OTHERS THEN
        ROLLBACK;  
        pnumStatus := STATUS_ERROR;
        IF CUR_T_AI_AP_IF_LOCK%ISOPEN THEN
            CLOSE CUR_T_AI_AP_IF_LOCK;
        END IF;
        --�ُ폈��
        vc2Comment:= SUBSTR('(SBM0368)<<�`���A�g���|�C���^�t�F�[�X�����ُ�I��>>�@',
                                1,256);
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName, 
                              pvc2PlantCd, MY_SQL_NAME, LOGMSG_NM_END_ERR);
                     
        /* �Ɩ��I�����b�Z�[�W�̏o�� */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                            pvc2PlantCd, MY_SQL_NAME, LOGMSG_ID_END_ERR, vc2Comment);
        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle); 
END;
/
