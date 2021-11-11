create or replace procedure SQLDELETEPROC(
/*------------------------------------------------------------------------------
' $Id: SqlDeleteProc.sql,v 1.14 2016/05/23 07:39:59 zhangran Exp $
'
' version   : 1.00.00
'
' �C������
' 2003.10.18 �V�K�쐬
' 2003.11.04 DBMS_OUTPUT�̃R�����g�A�E�g
' 2005.08.12 �w���ԕi���уe�[�u�����폜�Ώۂɒǉ�
' 2005.10.21 unicode�Ή��ivarchar2��4�{�j
' 2008.07.22 ���v�ʌv�Z����i���ԁj�̍폜`��ǉ�
' 2008.12.05 �Ɩ����b�Z�[�W�폜�����C���i�m�F�������X�V���j
' 2013.12.27 ��ƌn��ʎd�|�A�i�ڕʎd�|�폜�@�\�𐫔\���P
' 2015.08.07 EJaSCM�^EJa�@�\�����Ή�
'
' �@�\      : �폜����
'
' ������    : pvc2LogMode           - (i)�k�n�f���[�h
'             pvc2OutputMode        - (i)�o�̓��[�h
'             pvc2OutputPath        - (i)�o�̓t�@�C���p�X
'             pvc2OutputName        - (i)�o�̓t�@�C����
'             pvc2UserId            - (i)���[�U�h�c
'             pvc2BusinessName      - (i)�Ɩ���
'             pvc2PlantCd           - (i)�H��R�[�h
'             pvcDeleteProcExecDate - (i)�g�����U�N�V�����f�[�^�폜�����Ώ۔N��
'
' �@�\����  : �ݒ肵���ێ����ԊO����ݻ޸����ް��̍폜���s���B
' ���l      :
'
------------------------------------------------------------------------------*/

--< �v���V�[�W������` >-----------------------------------------------------
     pVc2LogMode            IN  VARCHAR2    --// �k�n�f���[�h
    ,pVc2OutputMode         IN  VARCHAR2    --// �o�̓��[�h
    ,pVc2OutputPath         IN  VARCHAR2    --// �o�̓t�@�C���p�X
    ,pVc2OutputName         IN  VARCHAR2    --// �o�̓t�@�C����
    ,pvc2UserId             IN  VARCHAR2    --// ���[�U��
    ,pvc2BusinessName       IN  VARCHAR2    --// �Ɩ���
    ,pvc2PlantCd            IN  VARCHAR2    --// �H��R�[�h
    ,pvcDeleteProcExecDate  IN  VARCHAR2    --// �g�����U�N�V�����f�[�^�폜�����Ώ۔N��
    ) IS

    --// ���R�[�h�̒�`


    /* �萔�̐錾 */
        METHOD_START                    VARCHAR2(20)  := 'Start';            --���O�p���\�b�h�J�n�錾
        METHOD_END                      VARCHAR2(12)  := 'End';              --���O�p���\�b�h�I���錾
        MY_SQL_NAME                     VARCHAR2(52) := 'sqlDeleteProc';    --�o�k�^�r�p�k��
        LOGMSG_START_PGNM_DeleteProc    VARCHAR2(160) := '<< �g�����U�N�V�����f�[�^�폜�����J�n >>';
        LOGMSG_END_PGNM_DeleteProc      VARCHAR2(160) := '<< �g�����U�N�V�����f�[�^�폜�����I�� >>';
        LOGMSG_ERR                      VARCHAR2(32) := '�ُ�I��';

        APS_COM_BATCH_START             VARCHAR2(28)    := 'ZZ09001';  --�o�b�`�������J�n���܂���  --A
        APS_COM_BATCH_END               VARCHAR2(28)    := 'ZZ09002';  --�o�b�`�������I�����܂���  --A
        APS_COM_ORACLE_ERR              VARCHAR2(28)    := 'AK53401';  --oracle�G���[ --A

        excMaxcount                     EXCEPTION;  --�ێ�����ð��ق̎擾�������W���ȉ�
        excSys_Mnt_Period_NULL          EXCEPTION;  --�擾�ێ�����ð��ق̒l��NULL


    --// �ϐ��̒�`
        UTL_FileHandle                  UTL_FILE.FILE_TYPE; --�t�@�C���n���h��
        llngMaxCount                    NUMBER(5);          --�ێ�����ð��ٌ����J�E���g�p
        blnRet                          BOOLEAN;                -- Function�ԋp�l
        lvc2Mrp_period                  VARCHAR2(40);   --MRP�i�ڏ��ێ�����
        lvc2JobOdr_period               VARCHAR2(40);   --���ԕi�ڕێ�����
        lvc2RcvIssue_period             VARCHAR2(40);   --�v��O���o�ɏ��ێ�����
        lvc2Stock_period                VARCHAR2(40);   --�݌ɏ��ێ�����
        lvc2OdAlm_period                VARCHAR2(40);   --���v�ʃA���[�����X�g�ێ�����
        lvc2BusinessMsg_period          VARCHAR2(40);   --�Ɩ����b�Z�[�W���ێ�����
        lvc2ForPsT_period               VARCHAR2(40);   --���i�\���g�����U�N�V�����ێ�����
        lvc2PchOdRtnRst_period          VARCHAR2(40);   --�w���ԕi���ѕێ�����  2005/08/12�ǉ�
        lnumDeleteCount                 NUMBER(10);     --�폜����

        ldtmBusinessdate                DATE;           --�Ɩ����t�擾�p
        lvc2WkDateTime                  VARCHAR2(76);   --���t�ҏW�p
        lBlnRet                         boolean;        --���ʊ֐��̖ߒl
        lvc2Comment                     VARCHAR2(1024);  --�R�����g�쐬�p
        lvc2Comment2                    VARCHAR2(1024);  --�R�����g�쐬�p
        vc2RunChkComment                VARCHAR2(1024);  --���s�ʒu�m�F�p�R�����g�쐬��Ɨ̈�
        vc2WorkCsvData                  VARCHAR(32767);         -- CSV�o�̓f�[�^�쐬�p�ϐ�
        vc2ErrCd                        VARCHAR2(28);           -- ��O���A���b�Z�[�W�R�[�h�i�[�p
        vc2ErrDetail                    VARCHAR2(4096);         -- ��O���A�ڍ׏��i�[�p
/* �p�����[�^�����p������ */
    vc2DELETE_CSV_PATH          CONSTANT VARCHAR2(96)  := 'M_SALES_DELETE_CSV_PATH';    -- CSV�o�͗p�p�X�����p������
    LOGMSG_BATCH_EXP                CONSTANT VARCHAR2(200)  := '<<�g�����U�N�V�����f�[�^�폜�������ُ�I�����܂����B>>';
/* ���b�Z�[�W�R�[�h�̐錾 */
    APS_COM_CSV_PATH_NOT_FOUND      CONSTANT VARCHAR2(28)   := 'KK10019';   -- �폜�Ώۃf�[�^�b�r�u�o�̓p�X���擾�ł��܂���ł����B
/********** CSV�t�@�C���o�͗p�ϐ� **********/
    CSV_FilePath                      SYS_PARAMETER.VALUE%TYPE;
    vc2CsvTIssueInstIssiDemandName             VARCHAR2(60) := 'T_ISSUE_INST_DMD';                 --[�o�Ɏw��] (�f�}���h���)
    vc2CsvTodExc4Name                          VARCHAR2(60) := 'T_OD_EXC4';                        --[���v��]�̃f�}���h���(�i�[���i�ڈȊO�j)
    vc2CsvTodInt4Name                          VARCHAR2(60) := 'T_OD_INT4' ;                       --[���v��]�̃f�}���h���(�i�[���i�ځj)
    vc2CsvTRlPuchOdrTodName                    VARCHAR2(60) := 'T_RLSD_PUCH_ODR_TOD' ;             --[�����c](�I�[�_���)
    vc2CsvTWorkInPcByPrcName                   VARCHAR2(60) := 'T_WORK_IN_PROC_BY_PROC';           --[��ƌn��ʎd�|](�I�[�_���)
    vc2CsvTWorkInPcByItemName                  VARCHAR2(60) := 'T_WORK_IN_PROC_BY_ITEM';           --[�i�ڕʎd�|](�I�[�_���)
    vc2CsvTOdTypExc34Name                      VARCHAR2(60) := 'T_OD_EXC34';                       --[���v��]�̃I�[�_���
    vc2CsvTRlsdPuchOdrName                     VARCHAR2(60) := 'T_RLSD_PUCH_ODR';                  --[�����c](���i�������)
    vc2CsvTDelJobOdrOdName                     VARCHAR2(60) := 'T_DEL_JOB_ODR_OD';                 --[���Ԍv��폜]
    vc2CsvTIssueInstJobName                    VARCHAR2(60) := 'T_ISSUE_INST_JOB_CD';              --[�o�Ɏw��] (���ԏ��)
    vc2CsvTRsPuchOdrJobName                    VARCHAR2(60) := 'T_RLSD_PUCH_ODR_JOB';              --[�����c](���ԏ��)
    vc2CsvTWkInPcByPrcJobName                  VARCHAR2(60) := 'T_WORK_IN_PROC_BY_PROC_JOB';       --[��ƌn��ʎd�|](���ԏ��)
    vc2CsvTWkInPcByItemJobName                 VARCHAR2(60) := 'T_WORK_IN_PROC_BY_ITEM_JOB';       --[�i�ڕʎd�|](���ԏ��)
    vc2CsvTOprInstSlipItemName                 VARCHAR2(60) := 'T_OPR_INST_SLIP_ITEM';             --[��Ǝw���`�[]�i�ڕ�
    vc2CsvTOprInstSlipPrcName                  VARCHAR2(60) := 'T_OPR_INST_SLIP_PRC';              --[��Ǝw���`�[]�n���
    vc2CsvTJobOdrAlcName                       VARCHAR2(60) := 'T_JOB_ODR_ALC';                    --[���Ԉ���]
    vc2CsvTOdJobName                           VARCHAR2(60) := 'T_OD_JOB';                         --[���v��]���ԏ��
    vc2CsvTRcvIssueSkName                      VARCHAR2(60) := 'T_RCV_ISSUE_STOCK';                --[�ۊǋ�ʓ��o��]�v��O�A�ړ�����
    vc2CsvTRcvIssueMrpName                     VARCHAR2(60) := 'T_RCV_ISSUE_MRP';                  --[�ۊǋ�ʓ��o��]MRP�i�ڐ��ԏ��
    vc2CsvTItemStockName                       VARCHAR2(60) := 'T_ITEM_STOCK';                     --[�ۊǋ�ʕi�ڍ݌�]
    vc2CsvTJobCdStockName                      VARCHAR2(60) := 'T_JOB_ODR_CD_STOCK';               --[�ۊǋ�ʐ��ԍ݌�]
    vc2CsvTJobOdrName                          VARCHAR2(60) := 'T_JOB_ODR';                        --[���Ԍv��]
    vc2CsvSJobCalcCtrlName                     VARCHAR2(60) := 'SYS_JOB_OD_CALC_CTRL';             --[���v�ʌv�Z����(����)]
    vc2CsvTOutputRsltName                      VARCHAR2(60) := 'T_OUTPUT_RSLT';                    --[�o��������]
    vc2CsvTPOdrRnRsltName                      VARCHAR2(60) := 'T_PUCH_ODR_RTN_RSLT';              --[�w���ԕi����]
    vc2CsvSysMsgLogName                        VARCHAR2(60) := 'SYS_MSG_LOG';                      --[�Ɩ����b�Z�[�W]
    vc2CsvSysPsTName                           VARCHAR2(60) := 'SYS_PS_T';                         --[���i�\���g�����U�N�V����]
    vc2CsvTExtPlanName                         VARCHAR2(60) := 'T_EXTERNAL_PLAN';                  --[�O���v��]
    vc2CsvTOdAlarmName                         VARCHAR2(60) := 'T_OD_ALARM';                       --[���v�ʃA���[�����X�g]
--20150807 ADD START BY SYSCOM
    vc2CsvTRcvIssAiIfDataName                  VARCHAR2(60) := 'T_RCV_ISSUE_AI_IF_DATA';        --[���o�ɕʉ�v�A�g���]
--20150807 ADD END BY SYSCOM

    vc2CsvTAcptRsltName                        VARCHAR2(60) := 'T_ACPT_RSLT_TOD';                  --[�������(�I�[�_)]
    vc2CsvTAcptRsltBhName                      VARCHAR2(60) := 'T_ACPT_RSLT';                      --[�������(���i�������)]
    vc2CsvTInspcRsltName                       VARCHAR2(60) := 'T_INSPC_RSL_TOD';                  --[��������(�I�[�_)]
    vc2CsvTInspcRsltBhName                     VARCHAR2(60) := 'T_INSPC_RSL';                      --[��������(���i�������)]
    vc2CsvTInspcDefectName                     VARCHAR2(60) := 'T_INSPC_DEFECT_TOD';               --[�����s��(�I�[��)]
    vc2CsvTInspcDefectBhName                   VARCHAR2(60) := 'T_INSPC_DEFECT';                   --[�����s��(���i�������)]
    vc2CsvTPastInspcAcptName                   VARCHAR2(60) := 'T_PAST_INSPC_ACPT_TOD';            --[��������(�I�[�_)]
    vc2CsvTPastInspcAcptBhName                 VARCHAR2(60) := 'T_PAST_INSPC_ACPT';                --[��������(���i�������)]
    vc2CsvTPastInspcAcptAmountName             VARCHAR2(60) := 'T_PAST_INSPC_ACPT_AMOUNT_TOD';     --[�������z����(�I�[�_)]
    vc2CsvTPastInspcName                       VARCHAR2(60) := 'T_PAST_INSPC_ACPT_AMOUNT';         --[�������z����(���i�������)]
    vc2CsvTOprRsltSkName                       VARCHAR2(60) := 'T_OPR_RSLT_ITEM';                  --[��Ǝ��сi�i�ڕʎd�|�j]
    vc2CsvTDefectSkName                        VARCHAR2(60) := 'T_DEFECT_ITEM';                    --[��ƕs�ǁi�i�ڕʎd�|�j]
    vc2CsvTOprRsltKeName                       VARCHAR2(60) := 'T_OPR_RSLT_PRC';                   --[��Ǝ��сi�n��ʎd�|�j]
    vc2CsvTDefectKeName                        VARCHAR2(60) := 'T_DEFECT_PRC';                     --[��ƕs�ǁi�n��ʎd�|�j]
    vc2CsvTOdAlarmRName                        VARCHAR2(60) := 'SYS_OD_ALARM_NO_CTRL_EXC34';       --[���v�ʃA���[�����X�g(�I�[��)]
    vc2CsvTMrpReexplosionName                  VARCHAR2(60) := 'T_MRP_REEXPLOSION_EXC34';          --[���v�ʍēW�J�˗�(�I�[��)]
    vc2CsvTRcvIssueItemSkName                  VARCHAR2(60) := 'T_RCV_ISSUE_ITEM_STOCK';        --[�i�ڕʓ��o��]�v��O�A�ړ�����
    vc2CsvTRcvIssueItemMrpName                 VARCHAR2(60) := 'T_RCV_ISSUE_ITEM_MRP';          --[�i�ڕʓ��o��]MRP�i�ڐ��ԏ��
    
    vc2CsvTAcptRsltJobName                     VARCHAR2(60) := 'T_ACPT_RSLT_JOB';                  --[�������(����)]
    vc2CsvTInspcRsltJobName                    VARCHAR2(60) := 'T_INSPC_RSL_JOB';                  --[��������(����)]
    vc2CsvTInspcDefectJobName                  VARCHAR2(60) := 'T_INSPC_DEFECT_JOB';               --[�����s��(����)]
    vc2CsvTPastInspcAcptJobName                VARCHAR2(60) := 'T_PAST_INSPC_ACPT_JOB';            --[��������(����)]
    vc2CsvTPastInspcAcptJobAmName              VARCHAR2(60) := 'T_PAST_INSPC_ACPT_AMOUN_JOB';      --[�������z����(����)]
    vc2CsvTOdAlarmRJobName                     VARCHAR2(60) := 'SYS_OD_ALARM_NO_CTRL_JOB';         --[���v�ʃA���[�����X�g(����)]
    vc2CsvTMrpReexplosionJobName               VARCHAR2(60) := 'T_MRP_REEXPLOSION_JOB';            --[���v�ʍēW�J�˗�(����)]

    uftWorkHandl                    UTL_FILE.FILE_TYPE;     -- CSV�o�͗p���[�N�ϐ�
    numWorkCnt                      NUMBER(6);              -- CSV�쐬�`�F�b�N�p���[�N�ϐ�
/* EXCEPTION �̐錾 */
    excPARAMETER_ERR                EXCEPTION;                   -- �p�����[�^�����G���[
    --// �J�[�\���̐錾

    --// �ێ�����ð��ق̓Ǎ�
    cursor cur_Sys_Mnt_Period (
        c_PLANT_CD      VARCHAR2
        )is
        select
            *
        from sys_mnt_period
        where plant_cd = c_PLANT_CD
        order by mnt_data_typ; --A

        ltypSys_Mnt_Period  cur_Sys_Mnt_Period%ROWTYPE;     --�ێ�����ð��ق̓Ǎ�
   /*-----------------------------------------------------------------
    'SubFncTIssueInstDdCsvWrite
    '
    ' �C������  2010.11.23 �V�K�쐬
    '
    ' �@�\      : [�o�Ɏw��] (�f�}���h���)�폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvcMrp_periodDate    MRP�i�ڏ��ێ�����('YYYYMM')
                  pvcPlant_Cd          �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : [�o�Ɏw��] (�f�}���h���)�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTIssueInstDdCsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTIssueInstIDemand(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  ISSUE_INST_CD,             --�o�Ɏw���ԍ�
        PLANT_CD,                 --�H��R�[�h
        OD_NO,                     --�I�[�_�f�}���h�ԍ�
        ITEM_CD,                 --�o�ɕi�ڔԍ�
        PS_EDITION,                 --�o�ɕi�ڍ\���Ő�
        PUCH_ODR_CD,             --�����ԍ�
        COMPANY_CD,                 --��ЃR�[�h
        VEND_CD,                 --�����R�[�h
        CONS_TYP,                 --�x���敪
        WORK_ODR_CD,               --��ƌv��ԍ�
        WORK_IN_PROC_CD,           --�d�|��ƃR�[�h
        WS_CD,                     --��Ƌ�R�[�h
        WH_CD,                     --�o�ɐ�ۊǋ�R�[�h
        ISSUE_INST_UNIT_QTY,         --�o�Ɏw���P�ʐ�
        ISSUE_INST_UNIT_DENOMINATOR,   --�o�Ɏw���P�ʐ�����
        ISSUE_INST_UNIT_NUMERATOR,     --�o�Ɏw���P�ʐ����q
        ISSUE_INST_QTY,              --�o�Ɏw����
        TOTAL_ISSUE_QTY,         --�o�ɗ݌v��
        SCDL_ISSUE_DATE,         --�o�ɗ\���
        ISSUE_CMPLT_DATE,         --�o�Ɋ�����
        ISSUE_TYP,                    --�o�Ɏw���o�ɋ敪
        ISSUE_CMPLT_FLG,         --�o�Ɋ����t���O
        ISSUE_INST_ISS_FLG,       --�o�Ɏw�������s�ς݃t���O
        ISSUE_INST_ISS_DATE,       --�o�Ɏw�������s��
        ISSUE_INST_COMMENT,       --�o�Ɏw�����l
        LOT_CTRL_FLG,             --���b�g�Ǘ��t���O
        CREATED_DATE,             --�쐬��
        CREATED_BY,             --�쐬��
        CREATED_PRG_NM,         --�쐬�v���O������
        UPDATED_DATE,             --�X�V��
        UPDATED_BY,             --�X�V��
        UPDATED_PRG_NM,         --�X�V�v���O������
        MODIFY_COUNT               --�X�V��
          FROM T_ISSUE_INST ISS_I
            where exists(select 'x' from t_od OD
                            where ISS_I.od_no = OD.od_no
                              and OD.plant_CD = vcPlant_Cd  --A �H��R�[�h
                              and OD.job_odr_cd is null                                       --����
                              and OD.dm_sts_typ = 9                                       --�f�}���h��ԋ敪
                              and OD.issue_cmplt_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd')); --�o�Ɋ����� <= MRP�i�ڏ��ێ�����
      recTIssueInstIDemand curTIssueInstIDemand%ROWTYPE;
    BEGIN
      OPEN curTIssueInstIDemand(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTIssueInstIDemand INTO recTIssueInstIDemand;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTIssueInstIDemand%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTIssueInstIssiDemandName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2)|| '.CSV','W');
        END IF;
        vc2WorkCsvData := recTIssueInstIDemand.ISSUE_INST_CD || ',';                                  --�o�Ɏw���ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.PLANT_CD || ',';                     --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.OD_NO || ',';                        --�I�[�_�f�}���h�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.ITEM_CD || ',';                      --�o�ɕi�ڔԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.PS_EDITION || ',';                   --�o�ɕi�ڍ\���Ő�
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.PUCH_ODR_CD || ',';                  --�����ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.COMPANY_CD || ',';                   --��ЃR�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.VEND_CD || ',';                      --�����R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.CONS_TYP || ',';                     --�x���敪
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.WORK_ODR_CD || ',';                  --��ƌv��ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.WORK_IN_PROC_CD || ',';              --�d�|��ƃR�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.WS_CD || ',';                        --��Ƌ�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.WH_CD || ',';                        --�o�ɐ�ۊǋ�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.ISSUE_INST_UNIT_QTY || ',';          --�o�Ɏw���P�ʐ�
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.ISSUE_INST_UNIT_DENOMINATOR || ',';  --�o�Ɏw���P�ʐ�����
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.ISSUE_INST_UNIT_NUMERATOR || ',';    --�o�Ɏw���P�ʐ����q
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.ISSUE_INST_QTY || ',';               --�o�Ɏw����
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.TOTAL_ISSUE_QTY || ',';              --�o�ɗ݌v��
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.SCDL_ISSUE_DATE || ',';              --�o�ɗ\���
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.ISSUE_CMPLT_DATE || ',';             --�o�Ɋ�����
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.ISSUE_TYP || ',';                    --�o�Ɏw���o�ɋ敪
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.ISSUE_CMPLT_FLG || ',';              --�o�Ɋ����t���O
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.ISSUE_INST_ISS_FLG || ',';           --�o�Ɏw�������s�ς�
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.ISSUE_INST_ISS_DATE || ',';          --�o�Ɏw�������s��
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.ISSUE_INST_COMMENT || ',';          --�o�Ɏw�����l
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.LOT_CTRL_FLG || ',';                 --���b�g�Ǘ��t���O
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.CREATED_DATE || ',';                 --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.CREATED_BY || ',';                   --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.CREATED_PRG_NM || ',';               --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.UPDATED_DATE || ',';                 --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.UPDATED_BY || ',';                   --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.UPDATED_PRG_NM || ',';               --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.MODIFY_COUNT || ',';                 --�X�V��
                 
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));

        numWorkCnt := numWorkCnt + 1;

        FETCH curTIssueInstIDemand   INTO recTIssueInstIDemand;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTIssueInstIDemand;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTIssueInstIDemand%ISOPEN = TRUE THEN
          CLOSE curTIssueInstIDemand;
        END IF;
        RETURN FALSE;

    END SubFncTIssueInstDdCsvWrite;
  /*-----------------------------------------------------------------
    'SubFncTOdTypExcCsvWrite
    '
    ' �C������  2010.11.23 �V�K�쐬
    '
    ' �@�\      : [���v��] (�[���i�ڈȊO�j�폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvcMrp_periodDate    MRP�i�ڏ��ێ�����('YYYYMM')
                  pvcPlant_Cd          �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : [���v��] (�[���i�ڈȊO�j�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTOdTypExcCsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTOdTypExc(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  OD_NO,            --�I�[�_�f�}���h�ԍ�
        ALC_GRP_CD,        --�����O���[�v�R�[�h
        PLANT_CD,        --�H��R�[�h
        ITEM_CD,        --�i�ڔԍ�
        PS_EDITION,        --���v�ʕi�ڍ\���Ő�
        PATTERN_CD,        --�p�^�[���R�[�h
        JOB_ODR_CD,        --����
        JOB_ODR_DETAIL_NO,    --���Ԏ}��
        JOB_ODR_CANCEL_NO,    --���Ԏ�������ԍ�
        ODR_STS_TYP,      --�I�[�_��ԋ敪
        DM_STS_TYP,        --�f�}���h��ԋ敪
        OD_TYP,            --�I�[�_�f�}���h�敪
        DUE_DATE,        --�v���[��
        ODR_START_DATE,      --��z�����
        PRD_DUE_DATE,      --�����[��
        PRD_START_DATE,      --���������
        DM_QTY,            --�f�}���h��
        ODR_QTY,        --�I�[�_��
        MRP_ODR_TYP,      --�i�ڎ�z�敪
        OUTSIDE_TYP,      --���v�ʓ��O��敪
        ISSUE_TYP,        --���v�ʏo�ɋ敪
        ODR_LT,            --��z���[�h�^�C��
        FIXED_LT,        --�Œ蕪���[�h�^�C��
        PROP_LT,        --��ᕪ���[�h�^�C��
        SAFETY_LT,        --���S����
        ISSUE_LT,        --���o���[�h�^�C��
        PROP_LOT_SIZE,      --��ᕪ���b�g�T�C�Y
        PS_LT_FLG,        --���i�\�����[�h�^�C���g�p�t���O
        PS_FIXED_LT,      --���i�\���Œ蕪���[�h�^�C��
        PS_PROP_LT,        --���i�\����ᕪ���[�h�^�C��
        PS_PROP_LOT_SIZE,    --���i�\����ᕪ���b�g�T�C�Y
        PS_UNIT_QTY,      --���i�\���P�ʐ�
        PS_UNIT_DENOMINATOR,  --���i�\���P�ʐ�����
        PS_UNIT_NUMERATOR,    --���i�\���P�ʐ����q
        TOTAL_RCV_QTY,      --���ɗ݌v��
        RCV_CMPLT_DATE,      --���Ɋ�����
        TOTAL_ISSUE_INST_QTY,  --�o�Ɏw���݌v��
        TOTAL_ISSUE_QTY,    --�o�ɗ݌v��
        ISSUE_CMPLT_DATE,    --�o�Ɋ�����
        OD_GNR_TYP,        --���v�ʔ��������敪
        OD_LEVEL_NO,      --���v�ʃ��x���ԍ�
        PARENT_OD_NO,      --�e�I�[�_�f�}���h�ԍ�
        ITEM_SPOIL,        --���v�ʕi�ڎd����
        PS_SPOIL,        --���v�ʍ\���d����
        CONS_TYP,        --�\���x���敪
        EFF_PHASE_IN_DATE,    --���v�ʗL���J�n��
        EFF_PHASE_OUT_DATE,    --���v�ʗL���I����
        MRP_TYP,        --���v�ʏ����敪
        EXTERNAL_DM_FLG,    --�O���f�}���h�t���O
        ODR_RELEASE_FLG,    --�I�[�_�����σt���O
        DUE_DATE_TIME,      --�v���[������
        PRD_DUE_DATE_TIME,    --�����[������
        CREATED_DATE,      --�쐬��
        CREATED_BY,        --�쐬��
        CREATED_PRG_NM,      --�쐬�v���O������
        UPDATED_DATE,      --�X�V��
        UPDATED_BY,        --�X�V��
        UPDATED_PRG_NM,      --�X�V�v���O������
        MODIFY_COUNT      --�X�V��
          FROM T_od
            where job_odr_cd is null                                        --����
              and plant_CD = vcPlant_Cd    --A �H��R�[�h
              and dm_sts_typ = 9                                            --�f�}���h��ԋ敪
              and issue_cmplt_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd')  --�o�Ɋ����� <= MRP�i�ڏ��ێ�����
              and not ( od_typ = 4 );                                       --�I�[�_�f�}���h�敪
      recTOdTypExc curTOdTypExc%ROWTYPE;
    BEGIN
      OPEN curTOdTypExc(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTOdTypExc INTO recTOdTypExc;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTOdTypExc%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTodExc4Name || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTOdTypExc.OD_NO || ',';                                  --�I�[�_�f�}���h�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.ALC_GRP_CD  || ',';           --�����O���[�v�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.PLANT_CD || ',';             --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.ITEM_CD || ',';              --�i�ڔԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.PS_EDITION  || ',';           --���v�ʕi�ڍ\���Ő�
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.PATTERN_CD  || ',';           --�p�^�[���R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.JOB_ODR_CD  || ',';           --����
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.JOB_ODR_DETAIL_NO  || ',';   --���Ԏ}��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.JOB_ODR_CANCEL_NO  || ',';   --���Ԏ�������ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.ODR_STS_TYP|| ',';           --�I�[�_��ԋ敪
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.DM_STS_TYP|| ',';            --�f�}���h��ԋ敪
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.OD_TYP  || ',';               --�I�[�_�f�}���h�敪
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.DUE_DATE|| ',';              --�v���[��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.ODR_START_DATE || ',';       --��z�����
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.PRD_DUE_DATE || ',';         --�����[��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.PRD_START_DATE  || ',';       --���������
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.DM_QTY || ',';               --�f�}���h��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.ODR_QTY || ',';              --�I�[�_��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.MRP_ODR_TYP || ',';          --�i�ڎ�z�敪
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.OUTSIDE_TYP || ',';          --���v�ʓ��O��敪
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.ISSUE_TYP || ',';            --���v�ʏo�ɋ敪
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.ODR_LT  || ',';               --��z���[�h�^�C��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.FIXED_LT || ',';             --�Œ蕪���[�h�^�C��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.PROP_LT || ',';              --��ᕪ���[�h�^�C��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.SAFETY_LT || ',';            --���S����
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.ISSUE_LT || ',';             --���o���[�h�^�C��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.PROP_LOT_SIZE || ',';        --��ᕪ���b�g�T�C�Y
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.PS_LT_FLG || ',';            --���i�\�����[�h�^�C���g�p�t���O
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.PS_FIXED_LT || ',';          --���i�\���Œ蕪���[�h�^�C��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.PS_PROP_LT  || ',';           --���i�\����ᕪ���[�h�^�C��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.PS_PROP_LOT_SIZE || ',';     --���i�\����ᕪ���b�g�T�C�Y
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.PS_UNIT_QTY || ',';          --���i�\���P�ʐ�
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.PS_UNIT_DENOMINATOR || ',';      --���i�\���P�ʐ�����
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.PS_UNIT_NUMERATOR  || ',';       --���i�\���P�ʐ����q
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.TOTAL_RCV_QTY || ',';        --���ɗ݌v��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.RCV_CMPLT_DATE  || ',';       --���Ɋ�����
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.TOTAL_ISSUE_INST_QTY  || ',';       --�o�Ɏw���݌v��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.TOTAL_ISSUE_QTY  || ',';       --�o�ɗ݌v��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.ISSUE_CMPLT_DATE  || ',';       --�o�Ɋ�����
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.OD_GNR_TYP || ',';           --���v�ʔ��������敪
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.OD_LEVEL_NO || ',';          --���v�ʃ��x���ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.PARENT_OD_NO || ',';         --�e�I�[�_�f�}���h�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.ITEM_SPOIL  || ',';           --���v�ʕi�ڎd����
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.PS_SPOIL || ',';             --���v�ʍ\���d����
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.CONS_TYP || ',';             --�\���x���敪
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.EFF_PHASE_IN_DATE || ',';    --���v�ʗL���J�n��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.EFF_PHASE_OUT_DATE  || ',';   --���v�ʗL���I����
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.MRP_TYP || ',';              --���v�ʏ����敪
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.EXTERNAL_DM_FLG || ',';      --�O���f�}���h�t���O
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.ODR_RELEASE_FLG || ',';      --�I�[�_�����σt���O
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.DUE_DATE_TIME || ',';        --�v���[������
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.PRD_DUE_DATE_TIME || ',';    --�����[������
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.CREATED_DATE || ',';         --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.CREATED_BY || ',';           --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.CREATED_PRG_NM  || ',';      --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.UPDATED_DATE  || ',';        --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.UPDATED_BY || ',';           --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.UPDATED_PRG_NM  || ',';      --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.MODIFY_COUNT || ',';         --�X�V��
                 
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));

        numWorkCnt := numWorkCnt + 1;

        FETCH curTOdTypExc   INTO recTOdTypExc;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTOdTypExc;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTOdTypExc%ISOPEN = TRUE THEN
          CLOSE curTOdTypExc;
        END IF;
        RETURN FALSE;

    END SubFncTOdTypExcCsvWrite;
 /*-----------------------------------------------------------------
    'SubFncTOdTypIntCsvWrite
    '
    ' �C������  2010.11.23 �V�K�쐬
    '
    ' �@�\      : [���v��] (�[���i�ځj�폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvcMrp_periodDate    MRP�i�ڏ��ێ�����('YYYYMM')
                  pvcPlant_Cd          �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : [���v��] (�[���i�ځj�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTOdTypIntCsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTOdTypInt(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  OD_NO,            --�I�[�_�f�}���h�ԍ�
        ALC_GRP_CD,        --�����O���[�v�R�[�h
        PLANT_CD,        --�H��R�[�h
        ITEM_CD,        --�i�ڔԍ�
        PS_EDITION,        --���v�ʕi�ڍ\���Ő�
        PATTERN_CD,        --�p�^�[���R�[�h
        JOB_ODR_CD,        --����
        JOB_ODR_DETAIL_NO,    --���Ԏ}��
        JOB_ODR_CANCEL_NO,    --���Ԏ�������ԍ�
        ODR_STS_TYP,      --�I�[�_��ԋ敪
        DM_STS_TYP,        --�f�}���h��ԋ敪
        OD_TYP,            --�I�[�_�f�}���h�敪
        DUE_DATE,        --�v���[��
        ODR_START_DATE,      --��z�����
        PRD_DUE_DATE,      --�����[��
        PRD_START_DATE,      --���������
        DM_QTY,            --�f�}���h��
        ODR_QTY,        --�I�[�_��
        MRP_ODR_TYP,      --�i�ڎ�z�敪
        OUTSIDE_TYP,      --���v�ʓ��O��敪
        ISSUE_TYP,        --���v�ʏo�ɋ敪
        ODR_LT,            --��z���[�h�^�C��
        FIXED_LT,        --�Œ蕪���[�h�^�C��
        PROP_LT,        --��ᕪ���[�h�^�C��
        SAFETY_LT,        --���S����
        ISSUE_LT,        --���o���[�h�^�C��
        PROP_LOT_SIZE,      --��ᕪ���b�g�T�C�Y
        PS_LT_FLG,        --���i�\�����[�h�^�C���g�p�t���O
        PS_FIXED_LT,      --���i�\���Œ蕪���[�h�^�C��
        PS_PROP_LT,        --���i�\����ᕪ���[�h�^�C��
        PS_PROP_LOT_SIZE,    --���i�\����ᕪ���b�g�T�C�Y
        PS_UNIT_QTY,      --���i�\���P�ʐ�
        PS_UNIT_DENOMINATOR,  --���i�\���P�ʐ�����
        PS_UNIT_NUMERATOR,    --���i�\���P�ʐ����q
        TOTAL_RCV_QTY,      --���ɗ݌v��
        RCV_CMPLT_DATE,      --���Ɋ�����
        TOTAL_ISSUE_INST_QTY,  --�o�Ɏw���݌v��
        TOTAL_ISSUE_QTY,    --�o�ɗ݌v��
        ISSUE_CMPLT_DATE,    --�o�Ɋ�����
        OD_GNR_TYP,        --���v�ʔ��������敪
        OD_LEVEL_NO,      --���v�ʃ��x���ԍ�
        PARENT_OD_NO,      --�e�I�[�_�f�}���h�ԍ�
        ITEM_SPOIL,        --���v�ʕi�ڎd����
        PS_SPOIL,        --���v�ʍ\���d����
        CONS_TYP,        --�\���x���敪
        EFF_PHASE_IN_DATE,    --���v�ʗL���J�n��
        EFF_PHASE_OUT_DATE,    --���v�ʗL���I����
        MRP_TYP,        --���v�ʏ����敪
        EXTERNAL_DM_FLG,    --�O���f�}���h�t���O
        ODR_RELEASE_FLG,    --�I�[�_�����σt���O
        DUE_DATE_TIME,      --�v���[������
        PRD_DUE_DATE_TIME,    --�����[������
        CREATED_DATE,      --�쐬��
        CREATED_BY,        --�쐬��
        CREATED_PRG_NM,      --�쐬�v���O������
        UPDATED_DATE,      --�X�V��
        UPDATED_BY,        --�X�V��
        UPDATED_PRG_NM,      --�X�V�v���O������
        MODIFY_COUNT      --�X�V��
          FROM  T_od OD1
            where not exists( select od_no from T_od OD2 WHERE OD1.od_no = OD2.parent_od_no )
              and OD1.plant_CD = vcPlant_Cd    --A �H��R�[�h
              and OD1.job_odr_cd is null                               --����
              and OD1.dm_sts_typ = 9                                   --�f�}���h��ԋ敪
              and OD1.updated_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd')  --�o�Ɋ����� <= MRP�i�ڏ��ێ�����
              and OD1.od_typ = 4;                                      --�I�[�_�f�}���h�敪
      recTOdTypInt curTOdTypInt%ROWTYPE;
    BEGIN
      OPEN curTOdTypInt(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTOdTypInt INTO recTOdTypInt;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTOdTypInt%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_'  || vc2CsvTodInt4Name || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTOdTypInt.OD_NO || ',';                                  --�I�[�_�f�}���h�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.ALC_GRP_CD  || ',';           --�����O���[�v�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.PLANT_CD || ',';             --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.ITEM_CD || ',';              --�i�ڔԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.PS_EDITION  || ',';           --���v�ʕi�ڍ\���Ő�
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.PATTERN_CD  || ',';           --�p�^�[���R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.JOB_ODR_CD  || ',';           --����
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.JOB_ODR_DETAIL_NO  || ',';   --���Ԏ}��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.JOB_ODR_CANCEL_NO  || ',';   --���Ԏ�������ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.ODR_STS_TYP|| ',';           --�I�[�_��ԋ敪
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.DM_STS_TYP|| ',';            --�f�}���h��ԋ敪
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.OD_TYP  || ',';               --�I�[�_�f�}���h�敪
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.DUE_DATE|| ',';              --�v���[��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.ODR_START_DATE || ',';       --��z�����
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.PRD_DUE_DATE || ',';         --�����[��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.PRD_START_DATE  || ',';       --���������
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.DM_QTY || ',';               --�f�}���h��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.ODR_QTY || ',';              --�I�[�_��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.MRP_ODR_TYP || ',';          --�i�ڎ�z�敪
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.OUTSIDE_TYP || ',';          --���v�ʓ��O��敪
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.ISSUE_TYP || ',';            --���v�ʏo�ɋ敪
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.ODR_LT  || ',';               --��z���[�h�^�C��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.FIXED_LT || ',';             --�Œ蕪���[�h�^�C��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.PROP_LT || ',';              --��ᕪ���[�h�^�C��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.SAFETY_LT || ',';            --���S����
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.ISSUE_LT || ',';             --���o���[�h�^�C��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.PROP_LOT_SIZE || ',';        --��ᕪ���b�g�T�C�Y
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.PS_LT_FLG || ',';            --���i�\�����[�h�^�C���g�p�t���O
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.PS_FIXED_LT || ',';          --���i�\���Œ蕪���[�h�^�C��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.PS_PROP_LT  || ',';           --���i�\����ᕪ���[�h�^�C��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.PS_PROP_LOT_SIZE || ',';     --���i�\����ᕪ���b�g�T�C�Y
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.PS_UNIT_QTY || ',';          --���i�\���P�ʐ�
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.PS_UNIT_DENOMINATOR || ',';      --���i�\���P�ʐ�����
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.PS_UNIT_NUMERATOR  || ',';       --���i�\���P�ʐ����q
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.TOTAL_RCV_QTY || ',';        --���ɗ݌v��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.RCV_CMPLT_DATE  || ',';       --���Ɋ�����
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.TOTAL_ISSUE_INST_QTY  || ',';       --�o�Ɏw���݌v��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.TOTAL_ISSUE_QTY  || ',';       --�o�ɗ݌v��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.ISSUE_CMPLT_DATE  || ',';       --�o�Ɋ�����
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.OD_GNR_TYP || ',';           --���v�ʔ��������敪
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.OD_LEVEL_NO || ',';          --���v�ʃ��x���ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.PARENT_OD_NO || ',';         --�e�I�[�_�f�}���h�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.ITEM_SPOIL  || ',';           --���v�ʕi�ڎd����
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.PS_SPOIL || ',';             --���v�ʍ\���d����
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.CONS_TYP || ',';             --�\���x���敪
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.EFF_PHASE_IN_DATE || ',';    --���v�ʗL���J�n��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.EFF_PHASE_OUT_DATE  || ',';   --���v�ʗL���I����
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.MRP_TYP || ',';              --���v�ʏ����敪
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.EXTERNAL_DM_FLG || ',';      --�O���f�}���h�t���O
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.ODR_RELEASE_FLG || ',';      --�I�[�_�����σt���O
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.DUE_DATE_TIME || ',';        --�v���[������
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.PRD_DUE_DATE_TIME || ',';    --�����[������
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.CREATED_DATE || ',';         --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.PARENT_OD_NO || ',';         --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.CREATED_BY  || ',';           --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.CREATED_PRG_NM  || ',';       --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.UPDATED_DATE || ',';         --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.UPDATED_PRG_NM  || ',';       --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.MODIFY_COUNT || ',';         --�X�V��
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTOdTypInt   INTO recTOdTypInt;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTOdTypInt;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTOdTypInt%ISOPEN = TRUE THEN
          CLOSE curTOdTypInt;
        END IF;
        RETURN FALSE;

    END SubFncTOdTypIntCsvWrite;
 /*-----------------------------------------------------------------
    'SubFncTRlPuchOdrTodCsvWrite
    '
    ' �C������  2010.11.23 �V�K�쐬
    '
    ' �@�\      : [�����c] (�I�[�_���j�폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvcMrp_periodDate  MRP�i�ڏ��ێ�����('YYYYMM')
                  pvcPlant_Cd        �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : [�����c] (�I�[�_���j�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTRlPuchOdrTodCsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTRlPuchOdrTod(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  PUCH_ODR_CD,            --�����ԍ�
        ITEM_CD,                --�i�ڔԍ�
        WH_CD,                    --����ꏊ
        NON_NO_ITEM_NAME,        --���i�����i�ږ�
        NON_NO_ITEM_TYP,        --���i�������i�敪
        COMPANY_CD,                --��ЃR�[�h
        VEND_CD,                --�����R�[�h
        PLANT_CD,                --�H��R�[�h
        PUCH_ODR_PERSON,        --�����S����
        PUCH_ODR_START_DATE,      --���������
        PUCH_ODR_DLV_DATE,        --�����[��
        PUCH_ODR_QTY,            --������
        NON_NO_ITEM_PUCH_ODR_UNIT,    --���i�����P��
        UNIT_COST_TYP,            --�P���敪
        UNIT_COST,                --�P��
        PROCESSING_COST,        --���H��
        MATERIAL_COST,            --�ޗ���
        OTHER_OVERHEADS,        --���̑��o��
        DISC_AMOUNT,            --�l�����z
        PUCH_ODR_AMOUNT,        --�������z
        PUCH_ODR_GNR_TYP,        --�������������敪
        PUCH_ODR_INST_DATE,        --�����w����
        PUCH_ODR_INST_SLIP_ISS_FLG,    --�����`�[���s�ς݃t���O
        PUCH_ODR_SLIP_ISS_DATE,      --�����`�[���s��
        ACPT_CMPLT_DATE,        --���������
        PUCH_ODR_STS_TYP,        --������ԋ敪
        INSPC_CMPLT_FLG,        --���������t���O
        INSPC_CMPLT_DATE,        --����������
        CONFIRM_DLV_DATE,        --�񓚔[��
        CONFIRM_DLV_DATE_COMMENT,    --�񓚔[�����l
        SPL_ITEM_TYP,            --�󋋕i�敪
        ACPT_INSPC_TYP,            --��������������敪
        INV_CTRL_FLG,            --�݌ɊǗ��t���O
        WORK_ODR_CD,            --��ƌv��ԍ�
        WORK_IN_PROC_CD,        --�d�|��ƃR�[�h
        OD_NO,                    --�I�[�_�f�}���h�ԍ�
        PUCH_ODR_COMMENT,        --�������l
        ODR_CD,                    --�����ԍ�
        DETAIL_NO,                --���הԍ�
        RATE_JUDGE_DATE,        --���[�g�����
        EXCH_RATE,                --�בփ��[�g
        TAX_RATE_1,                --�ŗ�1
        TAX_RATE_2,                --�ŗ�2
        TAX_RATE_3,                --�ŗ�3
        NET_AMOUNT,                --�{�̋��z
        TAX_AMOUNT_1,            --�Ŋz1
        TAX_AMOUNT_2,            --�Ŋz2
        TAX_AMOUNT_3,            --�Ŋz3
        AMOUNT_INCLUDE_TAX,        --�ō����z
        HOME_CUR_AMOUNT,        --�M�݋��z
        TAX_CD,                    --����ŃR�[�h
        TAX_ROUND_TYP,            --�Œ[���敪
        NON_NO_ITEM_FLG,        --���i�����t���O
        PUCH_ODR_EDI_ISS_FLG,      --�d�c�h�f�[�^�o�͍σt���O
        PUCH_ODR_EDI_ISS_DATE,      --�d�c�h�f�[�^�o�͓�
        ODR_CANCEL_EDI_ISS_DATE,    --�d�c�h�f�[�^����o�͓�
        PUCH_ODR_FAX_ISS_FLG,      --�e�`�w�f�[�^�o�͍σt���O
        PUCH_ODR_FAX_ISS_DATE,      --�e�`�w�f�[�^�o�͓�
        PUCH_ODR_MAIL_ISS_FLG,      --�l�`�h�k�f�[�^�o�͍σt���O
        PUCH_ODR_MAIL_ISS_DATE,      --�l�`�h�k�f�[�^�o�͓�
        ODR_CANCEL_SLIP_ISS_FLG,    --��������`�[���s�t���O
        ODR_CANCEL_SLIP_ISS_DATE,    --����`�[���s��
        ODR_CANCEL_CAUSE_CD,      --������R�R�[�h
        DIRECT_FLG,                --�����i�t���O
        CUST_CD,                --���Ӑ�R�[�h
        ODR_H_NO,                --�󒍓`�[�ԍ�
        ODR_D_SEQ_NO,            --�󒍖��ה����A��
        DELV_CD,                --�[�i�ꏊ�R�[�h
        CREATED_DATE,            --�쐬��
        CREATED_BY,                --�쐬��
        CREATED_PRG_NM,            --�쐬�v���O������
        UPDATED_DATE,            --�X�V��
        UPDATED_BY,                --�X�V��
        UPDATED_PRG_NM,            --�X�V�v���O������
        MODIFY_COUNT,            --�X�V��
        APPR_ID,                --�m����s��
        APPR_DATE              --�m���
          FROM  T_RLSD_PUCH_ODR RLSD
                where exists(select 'x' from  T_od OD1
                                where  RLSD.od_no = OD1.od_no
                                  and   OD1.plant_CD = vcPlant_Cd    --A �H��R�[�h
                                  and   OD1.job_odr_cd is null                                        --����
                                  and   OD1.odr_sts_typ = 9                                           --�I�[�_��ԋ敪
                                  and   OD1.rcv_cmplt_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd')    --���Ɋ����� <= MRP�i�ڏ��ێ�����
                                  and   OD1.od_no not in (select OD2.parent_od_no from T_od OD2
                                                              where OD2.parent_od_no = OD1.od_no
                                                                                    and OD2.od_typ in (3,4))); -- upd 2002.09.04
      recTRlPuchOdrTod curTRlPuchOdrTod%ROWTYPE;
    BEGIN
      OPEN curTRlPuchOdrTod(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTRlPuchOdrTod INTO recTRlPuchOdrTod;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTRlPuchOdrTod%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTRlPuchOdrTodName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTRlPuchOdrTod.PUCH_ODR_CD || ',';                                  --�����ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.ITEM_CD  || ',';                 --�i�ڔԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.WH_CD || ',';                      --����ꏊ
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.NON_NO_ITEM_NAME  || ',';         --���i�����i�ږ�
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.NON_NO_ITEM_TYP  || ',';         --���i�������i�敪
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.COMPANY_CD  || ',';                 --��ЃR�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.VEND_CD  || ',';                 --�����R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.PLANT_CD  || ',';                 --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.PUCH_ODR_PERSON|| ',';             --�����S����
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.PUCH_ODR_START_DATE|| ',';         --���������
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.PUCH_ODR_DLV_DATE  || ',';         --�����[��
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.PUCH_ODR_QTY|| ',';                --������
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.NON_NO_ITEM_PUCH_ODR_UNIT || ',';  --���i�����P��
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.UNIT_COST_TYP || ',';              --�P���敪
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.UNIT_COST  || ',';                 --�P��
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.PROCESSING_COST || ',';            --���H��
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.MATERIAL_COST || ',';              --�ޗ���
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.OTHER_OVERHEADS || ',';            --���̑��o��
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.DISC_AMOUNT || ',';                --�l�����z
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.PUCH_ODR_AMOUNT || ',';            --�������z
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.PUCH_ODR_GNR_TYP  || ',';         --�������������敪
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.PUCH_ODR_INST_DATE || ',';         --�����w����
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.PUCH_ODR_INST_SLIP_ISS_FLG || ','; --�����`�[���s�ς݃t���O
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.PUCH_ODR_SLIP_ISS_DATE || ',';     --�����`�[���s��
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.ACPT_CMPLT_DATE || ',';            --���������
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.PUCH_ODR_STS_TYP || ',';           --������ԋ敪
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.INSPC_CMPLT_FLG || ',';            --���������t���O
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.INSPC_CMPLT_DATE || ',';           --����������
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.CONFIRM_DLV_DATE  || ',';         --�񓚔[��
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.CONFIRM_DLV_DATE_COMMENT || ',';   --�񓚔[�����l
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.SPL_ITEM_TYP || ',';               --�󋋕i�敪
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.ACPT_INSPC_TYP || ',';             --��������������敪
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.INV_CTRL_FLG  || ',';             --�݌ɊǗ��t���O
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.WORK_ODR_CD || ',';                --��ƌv��ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.WORK_IN_PROC_CD  || ',';         --�d�|��ƃR�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.OD_NO  || ',';                     --�I�[�_�f�}���h�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.PUCH_ODR_COMMENT  || ',';         --�������l
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.ODR_CD  || ',';                     --�����ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.DETAIL_NO || ',';                  --���הԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.RATE_JUDGE_DATE || ',';            --���[�g�����
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.EXCH_RATE || ',';                  --�בփ��[�g
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.TAX_RATE_1  || ',';                 --�ŗ�1
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.TAX_RATE_2 || ',';                 --�ŗ�2
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.TAX_RATE_3 || ',';                 --�ŗ�3
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.NET_AMOUNT || ',';                 --�{�̋��z
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.TAX_AMOUNT_1  || ',';             --�Ŋz1
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.TAX_AMOUNT_2 || ',';               --�Ŋz2
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.TAX_AMOUNT_3 || ',';               --�Ŋz3
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.AMOUNT_INCLUDE_TAX || ',';         --�ō����z
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.HOME_CUR_AMOUNT || ',';            --�M�݋��z
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.TAX_CD || ',';                     --����ŃR�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.TAX_ROUND_TYP || ',';              --�Œ[���敪
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.NON_NO_ITEM_FLG || ',';            --���i�����t���O
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.PUCH_ODR_EDI_ISS_FLG  || ',';     --�d�c�h�f�[�^�o�͍σt���O
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.PUCH_ODR_EDI_ISS_DATE  || ',';     --�d�c�h�f�[�^�o�͓�
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.ODR_CANCEL_EDI_ISS_DATE || ',';    --�d�c�h�f�[�^����o�͓�
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.PUCH_ODR_FAX_ISS_FLG  || ',';     --�e�`�w�f�[�^�o�͍σt���O
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.PUCH_ODR_FAX_ISS_DATE || ',';      --�e�`�w�f�[�^�o�͓�
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.PUCH_ODR_MAIL_ISS_FLG  || ',';     --�l�`�h�k�f�[�^�o�͍σt��
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.PUCH_ODR_MAIL_ISS_DATE || ',';     --�l�`�h�k�f�[�^�o�͓�
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.ODR_CANCEL_SLIP_ISS_FLG || ',';    --��������`�[���s�t���O
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.ODR_CANCEL_SLIP_ISS_DATE || ',';   --����`�[���s��
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.ODR_CANCEL_CAUSE_CD  || ',';     --������R�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.DIRECT_FLG || ',';                 --�����i�t���O
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.CUST_CD || ',';                    --���Ӑ�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.ODR_H_NO || ',';                   --�󒍓`�[�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.ODR_D_SEQ_NO  || ',';             --�󒍖��ה����A��
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.DELV_CD || ',';                    --�[�i�ꏊ�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.CREATED_DATE || ',';               --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.CREATED_BY || ',';                 --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.CREATED_PRG_NM || ',';             --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.UPDATED_DATE || ',';               --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.UPDATED_BY || ',';                 --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.UPDATED_PRG_NM || ',';             --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.MODIFY_COUNT || ',';               --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.APPR_ID || ',';                    --�m����s��
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.APPR_DATE || ',';                  --�m���
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTRlPuchOdrTod   INTO recTRlPuchOdrTod;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTRlPuchOdrTod;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTRlPuchOdrTod%ISOPEN = TRUE THEN
          CLOSE curTRlPuchOdrTod;
        END IF;
        RETURN FALSE;

    END SubFncTRlPuchOdrTodCsvWrite;

     /*-----------------------------------------------------------------
    'SubFncTAcptRsltCsvWrite
    '
    ' �C������  2014.12.19 �V�K�쐬
    '
    ' �@�\      : [�������] (�I�[�_���j�폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvcMrp_periodDate  MRP�i�ڏ��ێ�����('YYYYMM')
                  pvcPlant_Cd       �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : [�������] (�I�[�_���j�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTAcptRsltCsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTAcptRslt(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  PUCH_ODR_CD,         --�����ԍ�
        ACPT_NO,                     --�����
        ACPT_QTY,                    --�����
        ACPT_DATE,                   --�����
        UNIT_COST,                   --�P��
        UNIT_COST_TYP,               --�P���敪
        PROCESSING_COST,             --���H��
        MATERIAL_COST,               --�ޗ���
        OTHER_OVERHEADS,             --���̑��o��
        DISC_AMOUNT,                 --�l�����z
        PUCH_ODR_AMOUNT,             --������z
        ACPT_STS_TYP,                --�����ԋ敪
        DLV_CD,                      --�[�i���ԍ�
        PLANT_CD,                    --�H��R�[�h
        WH_CD,                       --����ꏊ
        ACPT_RSLT_COMMENT,           --������є��l
        INVOICE_CD,                  --�����ԍ�
        RATE_JUDGE_DATE,             --���[�g�����
        EXCH_RATE,                   --�בփ��[�g
        TAX_RATE_1,                  --�ŗ�1
        TAX_RATE_2,                  --�ŗ�2
        TAX_RATE_3,                  --�ŗ�3
        NET_AMOUNT,                  --�{�̋��z
        TAX_AMOUNT_1,                --�Ŋz1
        TAX_AMOUNT_2,                --�Ŋz2
        TAX_AMOUNT_3,                --�Ŋz3
        AMOUNT_INCLUDE_TAX,          --�ō����z
        HOME_CUR_AMOUNT,             --�M�݋��z
        TAX_CD,                      --����ŃR�[�h
        TAX_ROUND_TYP,               --�Œ[���敪
        VEND_LOT_NO,                 --���[�J���b�g�ԍ�
        LOT_NO,                      --�݌Ƀ��b�g�ԍ�
        ACPT_CRCT_NO,                --���������
        CREATED_DATE,                --�쐬��
        CREATED_BY,                  --�쐬��
        CREATED_PRG_NM,              --�쐬�v���O������
        UPDATED_DATE,                --�X�V��
        UPDATED_BY,                  --�X�V��
        UPDATED_PRG_NM,              --�X�V�v���O������
        MODIFY_COUNT,                --�X�V��
        ITEM_CD,                     --�i�ڔԍ�
        NON_NO_ITEM_NAME,            --���i�����i�ږ�
        INSPC_WH_CD                  --�����҂��ۊǋ�
          FROM  T_ACPT_RSLT RSLT
                where exists(select PUCH_ODR_CD from  T_RLSD_PUCH_ODR RLSD
                                where exists(select 'x' from  T_od OD1
                                                where RLSD.od_no = OD1.od_no
                                                  and   OD1.plant_CD = vcPlant_Cd                                     --A �H��R�[�h
                                                  and   OD1.job_odr_cd is null                                        --����
                                                  and   OD1.odr_sts_typ = 9                                           --�I�[�_��ԋ敪
                                                  and   OD1.rcv_cmplt_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd')  --���Ɋ����� <= MRP�i�ڏ��ێ�����
                                                  and   OD1.od_no not in (select OD2.parent_od_no from T_od OD2
                                                                              where OD2.parent_od_no = OD1.od_no
                                                                                                    and OD2.od_typ in (3,4))
                                                  and RSLT.PUCH_ODR_CD = RLSD.PUCH_ODR_CD));
      recTAcptRslt curTAcptRslt%ROWTYPE;
    BEGIN
      OPEN curTAcptRslt(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTAcptRslt INTO recTAcptRslt;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTAcptRslt%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTAcptRsltName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTAcptRslt.PUCH_ODR_CD || ',';                                 --�����ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ACPT_NO  || ',';                  --�����
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ACPT_QTY  || ',';                 --�����
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ACPT_DATE  || ',';                --�����
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.UNIT_COST  || ',';                --�P��
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.UNIT_COST_TYP  || ',';            --�P���敪
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.PROCESSING_COST || ',';           --���H��
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.MATERIAL_COST || ',';             --�ޗ���
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.OTHER_OVERHEADS || ',';           --���̑��o��
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.DISC_AMOUNT  || ',';              --�l�����z
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.PUCH_ODR_AMOUNT || ',';           --������z
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ACPT_STS_TYP || ',';              --�����ԋ敪
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.DLV_CD  || ',';                   --�[�i���ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.PLANT_CD  || ',';                 --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.WH_CD  || ',';                    --����ꏊ
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ACPT_RSLT_COMMENT  || ',';        --������є��l
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.INVOICE_CD  || ',';               --�����ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.RATE_JUDGE_DATE || ',';           --���[�g�����
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.EXCH_RATE  || ',';                --�בփ��[�g
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_RATE_1  || ',';               --�ŗ�1
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_RATE_2  || ',';               --�ŗ�2
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_RATE_3  || ',';               --�ŗ�3
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.NET_AMOUNT  || ',';               --�{�̋��z
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_AMOUNT_1  || ',';             --�Ŋz1
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_AMOUNT_2  || ',';             --�Ŋz2
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_AMOUNT_3  || ',';             --�Ŋz3
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.AMOUNT_INCLUDE_TAX || ',';        --�ō����z
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.HOME_CUR_AMOUNT || ',';           --�M�݋��z
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_CD  || ',';                   --����ŃR�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_ROUND_TYP || ',';             --�Œ[���敪
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.VEND_LOT_NO || ',';               --���[�J���b�g�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.LOT_NO   || ',';                  --�݌Ƀ��b�g�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ACPT_CRCT_NO  || ',';             --���������
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.CREATED_DATE || ',';              --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.CREATED_BY || ',';                --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.CREATED_PRG_NM || ',';            --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.UPDATED_DATE || ',';              --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.UPDATED_BY || ',';                --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.UPDATED_PRG_NM || ',';            --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.MODIFY_COUNT || ',';              --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ITEM_CD  || ',';                  --�i�ڔԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.NON_NO_ITEM_NAME || ',';          --���i�����i�ږ�
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.INSPC_WH_CD  || ',';              --�����҂��ۊǋ�
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;
        

        FETCH curTAcptRslt   INTO recTAcptRslt;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTAcptRslt;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTAcptRslt%ISOPEN = TRUE THEN
          CLOSE curTAcptRslt;
        END IF;
        RETURN FALSE;

    END SubFncTAcptRsltCsvWrite;

 /*-----------------------------------------------------------------
    'SubFncTInspcRsltCsvWrite
    '
    ' �C������  2014.12.19 �V�K�쐬
    '
    ' �@�\      : [��������] (�I�[�_���j�폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvcMrp_periodDate  MRP�i�ڏ��ێ�����('YYYYMM')
                  pvcPlant_Cd       �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : [��������] (�I�[�_���j�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTInspcRsltCsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTInspcRslt(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  PUCH_ODR_CD,       --�����ԍ�
        ACPT_NO,                   --�����
        INSPECTED_QTY,             --�����ςݐ�
        ACCEPTED_QTY,              --���i��
        INSPEC_DATE,               --������
        PLANT_CD,                  --�H��R�[�h
        WH_CD,                     --����ꏊ
        INSPEC_RSLT_COMMENT,       --�������є��l
        VEND_LOT_NO,               --���[�J���b�g�ԍ�
        LOT_NO,                    --�݌Ƀ��b�g�ԍ�
        INSPC_CRCT_NO,             --����������
        CREATED_DATE,              --�쐬��
        CREATED_BY,                --�쐬��
        CREATED_PRG_NM,            --�쐬�v���O������
        UPDATED_DATE,              --�X�V��
        UPDATED_BY,                --�X�V��
        UPDATED_PRG_NM,            --�X�V�v���O������
        MODIFY_COUNT,              --�X�V��
        INSPC_WH_CD                --�����҂��ۊǋ�
          FROM  T_INSPC_RSLT RSLT
                where exists(select PUCH_ODR_CD from  T_RLSD_PUCH_ODR RLSD
                                where exists(select 'x' from  T_od OD1
                                                where RLSD.od_no = OD1.od_no
                                                  and   OD1.plant_CD = vcPlant_Cd                                     --A �H��R�[�h
                                                  and   OD1.job_odr_cd is null                                        --����
                                                  and   OD1.odr_sts_typ = 9                                           --�I�[�_��ԋ敪
                                                  and   OD1.rcv_cmplt_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd')  --���Ɋ����� <= MRP�i�ڏ��ێ�����
                                                  and   OD1.od_no not in (select OD2.parent_od_no from T_od OD2
                                                                              where OD2.parent_od_no = OD1.od_no
                                                                                                    and OD2.od_typ in (3,4))
                                                  and RSLT.PUCH_ODR_CD = RLSD.PUCH_ODR_CD));
      recTInspcRslt curTInspcRslt%ROWTYPE;
    BEGIN
      OPEN curTInspcRslt(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTInspcRslt INTO recTInspcRslt;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTInspcRslt%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTInspcRsltName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTInspcRslt.PUCH_ODR_CD || ',';                                  --�����ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.ACPT_NO  || ',';                   --�����
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.INSPECTED_QTY || ',';              --�����ςݐ�
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.ACCEPTED_QTY  || ',';              --���i��
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.INSPEC_DATE  || ',';               --������
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.PLANT_CD  || ',';                  --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.WH_CD  || ',';                     --����ꏊ
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.INSPEC_RSLT_COMMENT  || ',';       --�������є��l
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.VEND_LOT_NO  || ',';               --���[�J���b�g�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.LOT_NO  || ',';                    --�݌Ƀ��b�g�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.INSPC_CRCT_NO  || ',';             --����������
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.CREATED_DATE || ',';               --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.CREATED_BY || ',';                 --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.CREATED_PRG_NM || ',';             --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.UPDATED_DATE || ',';               --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.UPDATED_BY || ',';                 --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.UPDATED_PRG_NM || ',';             --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.MODIFY_COUNT || ',';               --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.INSPC_WH_CD  || ',';               --�����҂��ۊǋ�
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;
        FETCH curTInspcRslt   INTO recTInspcRslt;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTInspcRslt;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTInspcRslt%ISOPEN = TRUE THEN
          CLOSE curTInspcRslt;
        END IF;
        RETURN FALSE;

    END SubFncTInspcRsltCsvWrite;

     /*-----------------------------------------------------------------
    'SubFncTInspcDefectCsvWrite
    '
    ' �C������  2014.12.19 �V�K�쐬
    '
    ' �@�\      : [�����s��] (�I�[�_���j�폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvcMrp_periodDate  MRP�i�ڏ��ێ�����('YYYYMM')
                  pvcPlant_Cd       �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : [�����s��] (�I�[�_���j�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTInspcDefectCsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTInspcDefect(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  PUCH_ODR_CD,       --�����ԍ�
        ACPT_NO,                   --�����
        DEFECT_CAUSE_CD,           --�����s�Ǘ��R�R�[�h
        PLANT_CD,                  --�H��R�[�h
        DEFECT_INSPC_QTY,          --�����s�ǐ�
        DEFECT_COMMENT,            --�����s�ǔ��l
        CREATED_DATE,              --�쐬��
        CREATED_BY,                --�쐬��
        CREATED_PRG_NM,            --�쐬�v���O������
        UPDATED_DATE,              --�X�V��
        UPDATED_BY,                --�X�V��
        UPDATED_PRG_NM,            --�X�V�v���O������
        MODIFY_COUNT               --�X�V��
          FROM  T_INSPC_DEFECT INSPC
                where exists(select PUCH_ODR_CD from  T_RLSD_PUCH_ODR RLSD
                                where exists(select 'x' from  T_od OD1
                                                where RLSD.od_no = OD1.od_no
                                                  and   OD1.plant_CD = vcPlant_Cd                                     --A �H��R�[�h
                                                  and   OD1.job_odr_cd is null                                        --����
                                                  and   OD1.odr_sts_typ = 9                                           --�I�[�_��ԋ敪
                                                  and   OD1.rcv_cmplt_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd')  --���Ɋ����� <= MRP�i�ڏ��ێ�����
                                                  and   OD1.od_no not in (select OD2.parent_od_no from T_od OD2
                                                                              where OD2.parent_od_no = OD1.od_no
                                                                                                    and OD2.od_typ in (3,4))
                                                  and INSPC.PUCH_ODR_CD = RLSD.PUCH_ODR_CD));
      recTInspcDefect curTInspcDefect%ROWTYPE;
    BEGIN
      OPEN curTInspcDefect(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTInspcDefect INTO recTInspcDefect;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTInspcDefect%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTInspcDefectName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTInspcDefect.PUCH_ODR_CD || ',';                                  --�����ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.ACPT_NO  || ',';                   --�����
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.DEFECT_CAUSE_CD || ',';            --�����s�Ǘ��R�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.PLANT_CD  || ',';                  --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.DEFECT_INSPC_QTY  || ',';          --�����s�ǐ�
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.DEFECT_COMMENT  || ',';            --�����s�ǔ��l
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.CREATED_DATE || ',';               --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.CREATED_BY || ',';                 --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.CREATED_PRG_NM || ',';             --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.UPDATED_DATE || ',';               --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.UPDATED_BY || ',';                 --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.UPDATED_PRG_NM || ',';             --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.MODIFY_COUNT || ',';               --�X�V��
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTInspcDefect   INTO recTInspcDefect;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTInspcDefect;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTInspcDefect%ISOPEN = TRUE THEN
          CLOSE curTInspcDefect;
        END IF;
        RETURN FALSE;

    END SubFncTInspcDefectCsvWrite;

         /*-----------------------------------------------------------------
    'SubFncTPastInspcAcptCsvWrite
    '
    ' �C������  2014.12.19 �V�K�쐬
    '
    ' �@�\      : [��������] (�I�[�_���j�폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvcMrp_periodDate  MRP�i�ڏ��ێ�����('YYYYMM')
                  pvcPlant_Cd       �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : [��������] (�I�[�_���j�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTPastInspcAcptCsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTPastInspcAcpt(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  PUCH_ODR_CD,       --�����ԍ�
        ACPT_NO,                   --�����
        INSPC_ACPT_NO,             --�����ԍ�
        INSPC_ACPT_GNR_TYP,        --���������敪
        CRCT_NO,                   --������
        CRCT_TYP,                  --�����敪
        ITEM_CD,                   --�i�ڔԍ�
        ITEM_NAME,                 --�i�ږ�
        SLIP_TYP,                  --�`�[���
        WORK_IN_PROC_CD,           --�d�|��ƃR�[�h
        COMPANY_CD,                --��ЃR�[�h
        VEND_CD,                   --�����R�[�h
        PLANT_CD,                  --�H��R�[�h
        UNIT_COST,                 --�P��
        UNIT_COST_TYP,             --�P���敪
        PROCESSING_COST,           --���H��
        MATERIAL_COST,             --�ޗ���
        OTHER_OVERHEADS,           --���̑��o��
        ACPT_QTY,                  --�����
        INSPC_ACPT_QTY,            --������
        STOCK_UNIT,                --�v�ʒP��
        INSPC_ACPT_AMOUNT,         --�������z
        SAVING_AMOUNT,             --�l�����z
        ACPT_DATE,                 --�����
        INSPC_ACPT_DATE,           --������
        PRODUCT_TYP,               --���i�敪
        DLV_CD,                    --�[�i���ԍ�
        CREATED_DATE,              --�쐬��
        CREATED_BY,                --�쐬��
        CREATED_PRG_NM,            --�쐬�v���O������
        UPDATED_DATE,              --�X�V��
        UPDATED_BY,                --�X�V��
        UPDATED_PRG_NM,            --�X�V�v���O������
        MODIFY_COUNT               --�X�V��
          FROM  T_PAST_INSPC_ACPT ACPT
                where exists(select PUCH_ODR_CD from  T_RLSD_PUCH_ODR RLSD
                                where exists(select 'x' from  T_od OD1
                                                where RLSD.od_no = OD1.od_no
                                                  and   OD1.plant_CD = vcPlant_Cd                                     --A �H��R�[�h
                                                  and   OD1.job_odr_cd is null                                        --����
                                                  and   OD1.odr_sts_typ = 9                                           --�I�[�_��ԋ敪
                                                  and   OD1.rcv_cmplt_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd')  --���Ɋ����� <= MRP�i�ڏ��ێ�����
                                                  and   OD1.od_no not in (select OD2.parent_od_no from T_od OD2
                                                                              where OD2.parent_od_no = OD1.od_no
                                                                                                    and OD2.od_typ in (3,4))
                                                  and ACPT.PUCH_ODR_CD = RLSD.PUCH_ODR_CD));
      recTPastInspcAcpt curTPastInspcAcpt%ROWTYPE;
    BEGIN
      OPEN curTPastInspcAcpt(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTPastInspcAcpt INTO recTPastInspcAcpt;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTPastInspcAcpt%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTPastInspcAcptName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTPastInspcAcpt.PUCH_ODR_CD || ',';                                  --�����ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.ACPT_NO  || ',';                   --�����
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.INSPC_ACPT_NO || ',';              --�����ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.INSPC_ACPT_GNR_TYP  || ',';        --���������敪
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.CRCT_NO  || ',';                   --������
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.CRCT_TYP  || ',';                  --�����敪
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.ITEM_CD  || ',';                   --�i�ڔԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.ITEM_NAME   || ',';                --�i�ږ�
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.SLIP_TYP   || ',';                 --�`�[���
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.WORK_IN_PROC_CD   || ',';          --�d�|��ƃR�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.COMPANY_CD   || ',';               --��ЃR�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.VEND_CD   || ',';                  --�����R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.PLANT_CD   || ',';                 --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.UNIT_COST   || ',';                --�P��
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.UNIT_COST_TYP   || ',';            --�P���敪
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.PROCESSING_COST   || ',';          --���H��
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.MATERIAL_COST   || ',';            --�ޗ���
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.OTHER_OVERHEADS   || ',';          --���̑��o��
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.ACPT_QTY   || ',';                 --�����
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.INSPC_ACPT_QTY   || ',';           --������
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.STOCK_UNIT   || ',';               --�v�ʒP��
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.INSPC_ACPT_AMOUNT || ',';          --�������z
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.SAVING_AMOUNT   || ',';            --�l�����z
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.ACPT_DATE    || ',';               --�����
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.INSPC_ACPT_DATE   || ',';          --������
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.PRODUCT_TYP   || ',';              --���i�敪
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.DLV_CD   || ',';                   --�[�i���ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.CREATED_DATE || ',';               --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.CREATED_BY || ',';                 --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.CREATED_PRG_NM || ',';             --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.UPDATED_DATE || ',';               --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.UPDATED_BY || ',';                 --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.UPDATED_PRG_NM || ',';             --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.MODIFY_COUNT || ',';               --�X�V��
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTPastInspcAcpt   INTO recTPastInspcAcpt;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTPastInspcAcpt;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTPastInspcAcpt%ISOPEN = TRUE THEN
          CLOSE curTPastInspcAcpt;
        END IF;
        RETURN FALSE;

    END SubFncTPastInspcAcptCsvWrite;

    /*-----------------------------------------------------------------
    'SubFncTPastInspcCsvWrite
    '
    ' �C������  2014.12.19 �V�K�쐬
    '
    ' �@�\      : [�������z����] (�I�[�_���j�폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvcMrp_periodDate  MRP�i�ڏ��ێ�����('YYYYMM')
                  pvcPlant_Cd       �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : [�������z����] (�I�[�_���j�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTPastInspcCsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTPastInspcAcptAmount(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  PUCH_ODR_CD,       --�����ԍ�
        ACPT_NO,                   --�����
        INSPC_ACPT_NO,             --�����ԍ�
        CRCT_TYP,                  --�����敪
        CRCT_NO,                   --������
        ODR_CD,                    --�����ԍ�
        DETAIL_NO,                 --���הԍ�
        INVOICE_CD,                --�����ԍ�
        RATE_JUDGE_DATE,           --���[�g�����
        EXCH_RATE,                 --�בփ��[�g
        TAX_RATE_1,                --�ŗ�1
        TAX_RATE_2,                --�ŗ�2
        TAX_RATE_3,                --�ŗ�3
        NET_AMOUNT,                --�{�̋��z
        TAX_AMOUNT_1,              --�Ŋz1
        TAX_AMOUNT_2,              --�Ŋz2
        TAX_AMOUNT_3,              --�Ŋz3
        AMOUNT_INCLUDE_TAX,        --�ō����z
        HOME_CUR_AMOUNT,           --�M�݋��z
        CREATED_DATE,              --�쐬��
        CREATED_BY,                --�쐬��
        CREATED_PRG_NM,            --�쐬�v���O������
        UPDATED_DATE,              --�X�V��
        UPDATED_BY,                --�X�V��
        UPDATED_PRG_NM,            --�X�V�v���O������
        MODIFY_COUNT               --�X�V��
          FROM  T_PAST_INSPC_ACPT_AMOUNT AMOUNT
                where exists(select PUCH_ODR_CD from  T_RLSD_PUCH_ODR RLSD
                                where exists(select 'x' from  T_od OD1
                                                where RLSD.od_no = OD1.od_no
                                                  and   OD1.plant_CD = vcPlant_Cd                                     --A �H��R�[�h
                                                  and   OD1.job_odr_cd is null                                        --����
                                                  and   OD1.odr_sts_typ = 9                                           --�I�[�_��ԋ敪
                                                  and   OD1.rcv_cmplt_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd')  --���Ɋ����� <= MRP�i�ڏ��ێ�����
                                                  and   OD1.od_no not in (select OD2.parent_od_no from T_od OD2
                                                                              where OD2.parent_od_no = OD1.od_no
                                                                                                    and OD2.od_typ in (3,4))
                                                  and AMOUNT.PUCH_ODR_CD = RLSD.PUCH_ODR_CD));
      recTPastInspcAcptAmount curTPastInspcAcptAmount%ROWTYPE;
    BEGIN
      OPEN curTPastInspcAcptAmount(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTPastInspcAcptAmount INTO recTPastInspcAcptAmount;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTPastInspcAcptAmount%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTPastInspcAcptAmountName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTPastInspcAcptAmount.PUCH_ODR_CD || ',';                                  --�����ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.ACPT_NO  || ',';                   --�����
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.INSPC_ACPT_NO || ',';              --�����ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.CRCT_TYP  || ',';                  --�����敪
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.CRCT_NO  || ',';                   --������
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.ODR_CD   || ',';                   --�����ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.DETAIL_NO   || ',';                --���הԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.INVOICE_CD   || ',';               --�����ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.RATE_JUDGE_DATE   || ',';          --���[�g�����
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.EXCH_RATE   || ',';                --�בփ��[�g
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.TAX_RATE_1   || ',';               --�ŗ�1
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.TAX_RATE_2   || ',';               --�ŗ�2
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.TAX_RATE_3   || ',';               --�ŗ�3
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.NET_AMOUNT   || ',';               --�{�̋��z
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.TAX_AMOUNT_1   || ',';             --�Ŋz1
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.TAX_AMOUNT_2   || ',';             --�Ŋz2
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.TAX_AMOUNT_3   || ',';             --�Ŋz3
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.AMOUNT_INCLUDE_TAX   || ',';       --�ō����z
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.HOME_CUR_AMOUNT   || ',';          --�M�݋��z
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.CREATED_DATE || ',';               --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.CREATED_BY || ',';                 --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.CREATED_PRG_NM || ',';             --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.UPDATED_DATE || ',';               --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.UPDATED_BY || ',';                 --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.UPDATED_PRG_NM || ',';             --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.MODIFY_COUNT || ',';               --�X�V��
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTPastInspcAcptAmount   INTO recTPastInspcAcptAmount;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTPastInspcAcptAmount;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTPastInspcAcptAmount%ISOPEN = TRUE THEN
          CLOSE curTPastInspcAcptAmount;
        END IF;
        RETURN FALSE;

    END SubFncTPastInspcCsvWrite;

 /*-----------------------------------------------------------------
    'SubFncTWorkInPcByPrcCsvWrite
    '
    ' �C������  2010.11.23 �V�K�쐬
    '
    ' �@�\      : [��ƌn��ʎd�|] (�I�[�_���j�폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvcMrp_periodDate  MRP�i�ڏ��ێ�����('YYYYMM')
                  pvcPlant_Cd        �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : [��ƌn��ʎd�|] (�I�[�_���j�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTWorkInPcByPrcCsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTWorkInPcByPrc(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT   WORK_ODR_CD,            --��ƌv��ԍ�
        WORK_IN_PROC_CD,        --�d�|��ƃR�[�h
        OD_NO,                    --�I�[�_�f�}���h�ԍ�
        PROC_NAME,                --�d�|��Ɩ�
        PROC_NO,                --�d�|��ƌn��ԍ�
        ITEM_CD,                --�i�ڔԍ�
        OUTSIDE_TYP,            --�d�|���O��敪
        WS_CD,                    --��Ƌ�R�[�h
        COMPANY_CD,                --��ЃR�[�h
        VEND_CD,                --�����R�[�h
        PLANT_CD,                --�H��R�[�h
        WORK_ODR_DLV_DATE,        --��ƌn��ʐ����[��
        OPR_INST_START_DATE,      --��ƌn��ʒ����
        OPR_INST_QTY,            --��Ǝw����
        UNIT_COST_TYP,            --�P���敪
        UNIT_COST,                --�P��
        PROCESSING_COST,        --���H��
        MATERIAL_COST,            --�ޗ���
        OTHER_OVERHEADS,        --���̑��o��
        PUCH_ODR_AMOUNT,        --�������z
        DISC_AMOUNT,            --�l�����z
        ACPT_INSPC_TYP,            --��ƌn���������敪
        WORK_STS_TYP,            --��ƌn��ʍ�Ə�ԋ敪
        FINAL_PROC_FLG,            --�ŏI�n��t���O
        OPR_INST_DATE,            --��ƌn��ʍ�Ǝw����
        WORK_CMPLT_DATE,        --��ƌn��ʎd�|������
        OPR_INST_CD,            --��Ǝw���ԍ�
        WORK_IN_PROC_COMMENT,      --��ƌn��ʎd�|���l
        WORKER_QTY,                --�v����
        CREATED_DATE,            --�쐬��
        CREATED_BY,                --�쐬��
        CREATED_PRG_NM,            --�쐬�v���O������
        UPDATED_DATE,            --�X�V��
        UPDATED_BY,                --�X�V��
        UPDATED_PRG_NM,            --�X�V�v���O������
        MODIFY_COUNT              --�X�V��
          FROM  T_WORK_IN_PROC_BY_PROC PROC
                where exists(select 'x' from t_od OD1
                                    where OD1.job_odr_cd is null                                     --����
                                      and OD1.plant_CD = vcPlant_Cd                                  --A �H��R�[�h
                                      and OD1.odr_sts_typ = 9                                        --�I�[�_��ԋ敪
                                      and OD1.rcv_cmplt_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd') --���Ɋ����� <= MRP�i�ڏ��ێ�����
                                      and not exists (select OD2.parent_od_no from T_od OD2
                                                              where OD2.parent_od_no = OD1.od_no
                                                                and OD2.od_typ in (3,4))                 --�����܂ł��O����� upd 2002.09.04
                                      and PROC.od_no = OD1.od_no);                                  --  �ȉ�<��ƌn��ʎd�|>���o�̏���
      recTWorkInPcByPrc curTWorkInPcByPrc%ROWTYPE;
    BEGIN
      OPEN curTWorkInPcByPrc(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTWorkInPcByPrc INTO recTWorkInPcByPrc;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTWorkInPcByPrc%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTWorkInPcByPrcName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTWorkInPcByPrc.WORK_ODR_CD || ',';                                  --��ƌv��ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.WORK_IN_PROC_CD  || ',';          --�d�|��ƃR�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.OD_NO || ',';                      --�I�[�_�f�}���h�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.PROC_NAME  || ',';                  --�d�|��Ɩ�
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.PROC_NO  || ',';                  --�d�|��ƌn��ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.ITEM_CD  || ',';                  --�i�ڔԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.OUTSIDE_TYP  || ',';              --�d�|���O��敪
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.WS_CD  || ',';                      --��Ƌ�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.COMPANY_CD || ',';                 --��ЃR�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.VEND_CD || ',';                    --�����R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.PLANT_CD  || ',';                  --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.WORK_ODR_DLV_DATE|| ',';           --��ƌn��ʐ����[��
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.OPR_INST_START_DATE || ',';        --��ƌn��ʒ����
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.OPR_INST_QTY || ',';               --��Ǝw����
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.UNIT_COST_TYP  || ',';              --�P���敪
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.UNIT_COST || ',';                  --�P��
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.PROCESSING_COST || ',';            --���H��
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.MATERIAL_COST || ',';              --�ޗ���
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.OTHER_OVERHEADS || ',';            --���̑��o��
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.PUCH_ODR_AMOUNT || ',';            --�������z
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.DISC_AMOUNT  || ',';              --�l�����z
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.ACPT_INSPC_TYP || ',';             --��ƌn���������敪
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.WORK_STS_TYP || ',';               --��ƌn��ʍ�Ə�ԋ敪
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.FINAL_PROC_FLG || ',';             --�ŏI�n��t���O
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.OPR_INST_DATE || ',';              --��ƌn��ʍ�Ǝw����
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.WORK_CMPLT_DATE || ',';            --��ƌn��ʎd�|������
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.OPR_INST_CD || ',';                --��Ǝw���ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.WORK_IN_PROC_COMMENT || ',';       --��ƌn��ʎd�|���l
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.WORKER_QTY  || ',';              --�v����
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.CREATED_DATE || ',';               --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.CREATED_BY || ',';                 --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.CREATED_PRG_NM || ',';             --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.UPDATED_DATE || ',';               --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.UPDATED_BY || ',';                 --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.UPDATED_PRG_NM || ',';             --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.MODIFY_COUNT || ',';               --�X�V��
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTWorkInPcByPrc   INTO recTWorkInPcByPrc;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTWorkInPcByPrc;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTWorkInPcByPrc%ISOPEN = TRUE THEN
          CLOSE curTWorkInPcByPrc;
        END IF;
        RETURN FALSE;

    END SubFncTWorkInPcByPrcCsvWrite;
 /*-----------------------------------------------------------------
    'SubFncTWorkInPcByItemCsvWrite
    '
    ' �C������  2010.11.23 �V�K�쐬
    '
    ' �@�\      : [�i�ڕʎd�|�ް�]�폜 (�I�[�_���j�폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvcMrp_periodDate  MRP�i�ڏ��ێ�����('YYYYMM')
                  pvcPlant_Cd        �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : [�i�ڕʎd�|�ް�] (�I�[�_���j�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTWorkInPcByItemCsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTWorkInPcByItem(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT   WORK_ODR_CD,              --��ƌv��ԍ�
        PLANT_CD,                  --�H��R�[�h
        OD_NO,                      --�I�[�_�f�}���h�ԍ�
        ITEM_CD,                  --�i�ڔԍ�
        WS_CD,                      --��Ƌ�R�[�h
        OPR_INST_START_DATE,        --��Ɛ��������
        WORK_ODR_DLV_DATE,          --��Ɛ����[��
        OPR_INST_QTY,              --��Ǝw����
        OPR_RSLT_TYP,              --�i�ڕʍ�Ǝ��ы敪
        WORK_STS_TYP,              --�i�ڕʍ�Ə�ԋ敪
        PROC_EXPLOSION_FLG,          --��ƌn��W�J�ς݃t���O
        OPR_INST_DATE,              --��Ǝw����
        WORK_CMPLT_DATE,          --��Ɗ�����
        OPR_INST_CD,              --��Ǝw���ԍ�
        WORK_IN_PROC_COMMENT,        --�i�ڕʎd�|���l
        CREATED_DATE,              --�쐬��
        CREATED_BY,                  --�쐬��
        CREATED_PRG_NM,              --�쐬�v���O������
        UPDATED_DATE,              --�X�V��
        UPDATED_BY,                  --�X�V��
        UPDATED_PRG_NM,              --�X�V�v���O������
        MODIFY_COUNT              --�X�V��
          FROM  T_WORK_IN_PROC_BY_ITEM PITEM
                where exists(select 'x' from t_od OD1
                                where OD1.job_odr_cd is null                                     --����
                                  and OD1.plant_CD = vcPlant_Cd    --A �H��R�[�h
                                  and OD1.odr_sts_typ = 9                                        --�I�[�_��ԋ敪
                                  and OD1.rcv_cmplt_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd') --���Ɋ����� <= MRP�i�ڏ��ێ�����
                                  and not exists (select OD2.parent_od_no from T_od OD2
                                                             where OD2.parent_od_no = OD1.od_no
                                                             and OD2.od_typ in (3,4))         --�����܂ł��O�����  up 2002.09.04
                                  and PITEM.od_no = OD1.od_no);                             --�ȉ�<�i�ڕʎd�|>���o�̏���
      recTWorkInPcByItem curTWorkInPcByItem%ROWTYPE;
    BEGIN
      OPEN curTWorkInPcByItem(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTWorkInPcByItem INTO recTWorkInPcByItem;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTWorkInPcByItem%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTWorkInPcByItemName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTWorkInPcByItem.WORK_ODR_CD || ',';                                  --��ƌv��ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.PLANT_CD  || ',';                   --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.OD_NO || ',';                      --�I�[�_�f�}���h�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.ITEM_CD  || ',';                   --�i�ڔԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.WS_CD  || ',';                   --��Ƌ�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.OPR_INST_START_DATE  || ',';       --��Ɛ��������
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.WORK_ODR_DLV_DATE  || ',';       --��Ɛ����[��
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.OPR_INST_QTY  || ',';               --��Ǝw����
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.OPR_RSLT_TYP || ',';               --�i�ڕʍ�Ǝ��ы敪
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.WORK_STS_TYP || ',';               --�i�ڕʍ�Ə�ԋ敪
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.PROC_EXPLOSION_FLG  || ',';       --��ƌn��W�J�ς݃t���O
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.OPR_INST_DATE|| ',';               --��Ǝw����
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.WORK_CMPLT_DATE || ',';            --��Ɗ�����
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.OPR_INST_CD || ',';                --��Ǝw���ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.WORK_IN_PROC_COMMENT  || ',';       --�i�ڕʎd�|���l
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.CREATED_DATE || ',';               --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.CREATED_BY || ',';                 --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.CREATED_PRG_NM || ',';             --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.UPDATED_DATE || ',';               --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.UPDATED_BY || ',';                 --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.UPDATED_PRG_NM || ',';             --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.MODIFY_COUNT || ',';               --�X�V��
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTWorkInPcByItem   INTO recTWorkInPcByItem;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTWorkInPcByItem;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTWorkInPcByItem%ISOPEN = TRUE THEN
          CLOSE curTWorkInPcByItem;
        END IF;
        RETURN FALSE;

    END SubFncTWorkInPcByItemCsvWrite;

  /*-----------------------------------------------------------------
    'SubFncTOdExc34CsvWrite
    '
    ' �C������  2010.11.23 �V�K�쐬
    '
    ' �@�\      : ���v�ʁi�I�[�_���j�폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvcMrp_periodDate    MRP�i�ڏ��ێ�����('YYYYMM')
                  pvcPlant_Cd          �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : [���v��] (�I�[�_���j�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTOdExc34CsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTOdTypExc34(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  OD_NO,            --�I�[�_�f�}���h�ԍ�
        ALC_GRP_CD,        --�����O���[�v�R�[�h
        PLANT_CD,        --�H��R�[�h
        ITEM_CD,        --�i�ڔԍ�
        PS_EDITION,        --���v�ʕi�ڍ\���Ő�
        PATTERN_CD,        --�p�^�[���R�[�h
        JOB_ODR_CD,        --����
        JOB_ODR_DETAIL_NO,    --���Ԏ}��
        JOB_ODR_CANCEL_NO,    --���Ԏ�������ԍ�
        ODR_STS_TYP,      --�I�[�_��ԋ敪
        DM_STS_TYP,        --�f�}���h��ԋ敪
        OD_TYP,            --�I�[�_�f�}���h�敪
        DUE_DATE,        --�v���[��
        ODR_START_DATE,      --��z�����
        PRD_DUE_DATE,      --�����[��
        PRD_START_DATE,      --���������
        DM_QTY,            --�f�}���h��
        ODR_QTY,        --�I�[�_��
        MRP_ODR_TYP,      --�i�ڎ�z�敪
        OUTSIDE_TYP,      --���v�ʓ��O��敪
        ISSUE_TYP,        --���v�ʏo�ɋ敪
        ODR_LT,            --��z���[�h�^�C��
        FIXED_LT,        --�Œ蕪���[�h�^�C��
        PROP_LT,        --��ᕪ���[�h�^�C��
        SAFETY_LT,        --���S����
        ISSUE_LT,        --���o���[�h�^�C��
        PROP_LOT_SIZE,      --��ᕪ���b�g�T�C�Y
        PS_LT_FLG,        --���i�\�����[�h�^�C���g�p�t���O
        PS_FIXED_LT,      --���i�\���Œ蕪���[�h�^�C��
        PS_PROP_LT,        --���i�\����ᕪ���[�h�^�C��
        PS_PROP_LOT_SIZE,    --���i�\����ᕪ���b�g�T�C�Y
        PS_UNIT_QTY,      --���i�\���P�ʐ�
        PS_UNIT_DENOMINATOR,  --���i�\���P�ʐ�����
        PS_UNIT_NUMERATOR,    --���i�\���P�ʐ����q
        TOTAL_RCV_QTY,      --���ɗ݌v��
        RCV_CMPLT_DATE,      --���Ɋ�����
        TOTAL_ISSUE_INST_QTY,  --�o�Ɏw���݌v��
        TOTAL_ISSUE_QTY,    --�o�ɗ݌v��
        ISSUE_CMPLT_DATE,    --�o�Ɋ�����
        OD_GNR_TYP,        --���v�ʔ��������敪
        OD_LEVEL_NO,      --���v�ʃ��x���ԍ�
        PARENT_OD_NO,      --�e�I�[�_�f�}���h�ԍ�
        ITEM_SPOIL,        --���v�ʕi�ڎd����
        PS_SPOIL,        --���v�ʍ\���d����
        CONS_TYP,        --�\���x���敪
        EFF_PHASE_IN_DATE,    --���v�ʗL���J�n��
        EFF_PHASE_OUT_DATE,    --���v�ʗL���I����
        MRP_TYP,        --���v�ʏ����敪
        EXTERNAL_DM_FLG,    --�O���f�}���h�t���O
        ODR_RELEASE_FLG,    --�I�[�_�����σt���O
        DUE_DATE_TIME,      --�v���[������
        PRD_DUE_DATE_TIME,    --�����[������
        CREATED_DATE,      --�쐬��
        CREATED_BY,        --�쐬��
        CREATED_PRG_NM,      --�쐬�v���O������
        UPDATED_DATE,      --�X�V��
        UPDATED_BY,        --�X�V��
        UPDATED_PRG_NM,      --�X�V�v���O������
        MODIFY_COUNT      --�X�V��
        FROM T_od OD1
                where job_odr_cd is null                                     --����
                  and plant_CD = vcPlant_Cd    --A �H��R�[�h
                  and odr_sts_typ = 9                                        --�I�[�_��ԋ敪
                  and rcv_cmplt_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd') --���Ɋ����� <= MRP�i�ڏ��ێ�����
                  and od_no not in (select OD2.parent_od_no from T_od OD2
                                                              where OD2.parent_od_no = OD1.od_no
                                                                and OD2.od_typ in (3,4));   --�����܂ł��O�����
      recTOdTypExc34 curTOdTypExc34%ROWTYPE;
    BEGIN
      OPEN curTOdTypExc34(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTOdTypExc34 INTO recTOdTypExc34;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTOdTypExc34%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTOdTypExc34Name || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTOdTypExc34.OD_NO || ',';                                  --�I�[�_�f�}���h�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.ALC_GRP_CD  || ',';           --�����O���[�v�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.PLANT_CD || ',';             --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.ITEM_CD || ',';              --�i�ڔԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.PS_EDITION  || ',';           --���v�ʕi�ڍ\���Ő�
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.PATTERN_CD  || ',';           --�p�^�[���R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.JOB_ODR_CD  || ',';           --����
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.JOB_ODR_DETAIL_NO  || ',';   --���Ԏ}��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.JOB_ODR_CANCEL_NO  || ',';   --���Ԏ�������ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.ODR_STS_TYP|| ',';           --�I�[�_��ԋ敪
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.DM_STS_TYP|| ',';            --�f�}���h��ԋ敪
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.OD_TYP  || ',';               --�I�[�_�f�}���h�敪
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.DUE_DATE|| ',';              --�v���[��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.ODR_START_DATE || ',';       --��z�����
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.PRD_DUE_DATE || ',';         --�����[��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.PRD_START_DATE  || ',';       --���������
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.DM_QTY || ',';               --�f�}���h��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.ODR_QTY || ',';              --�I�[�_��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.MRP_ODR_TYP || ',';          --�i�ڎ�z�敪
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.OUTSIDE_TYP || ',';          --���v�ʓ��O��敪
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.ISSUE_TYP || ',';            --���v�ʏo�ɋ敪
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.ODR_LT  || ',';               --��z���[�h�^�C��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.FIXED_LT || ',';             --�Œ蕪���[�h�^�C��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.PROP_LT || ',';              --��ᕪ���[�h�^�C��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.SAFETY_LT || ',';            --���S����
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.ISSUE_LT || ',';             --���o���[�h�^�C��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.PROP_LOT_SIZE || ',';        --��ᕪ���b�g�T�C�Y
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.PS_LT_FLG || ',';            --���i�\�����[�h�^�C���g�p�t���O
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.PS_FIXED_LT || ',';          --���i�\���Œ蕪���[�h�^�C��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.PS_PROP_LT  || ',';           --���i�\����ᕪ���[�h�^�C��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.PS_PROP_LOT_SIZE || ',';     --���i�\����ᕪ���b�g�T�C�Y
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.PS_UNIT_QTY || ',';          --���i�\���P�ʐ�
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.PS_UNIT_DENOMINATOR || ',';      --���i�\���P�ʐ�����
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.PS_UNIT_NUMERATOR  || ',';       --���i�\���P�ʐ����q
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.TOTAL_RCV_QTY || ',';        --���ɗ݌v��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.RCV_CMPLT_DATE  || ',';       --���Ɋ�����
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.TOTAL_ISSUE_INST_QTY  || ',';       --�o�Ɏw���݌v��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.TOTAL_ISSUE_QTY  || ',';       --�o�ɗ݌v��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.ISSUE_CMPLT_DATE  || ',';       --�o�Ɋ�����
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.OD_GNR_TYP || ',';           --���v�ʔ��������敪
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.OD_LEVEL_NO || ',';          --���v�ʃ��x���ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.PARENT_OD_NO || ',';         --�e�I�[�_�f�}���h�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.ITEM_SPOIL  || ',';           --���v�ʕi�ڎd����
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.PS_SPOIL || ',';             --���v�ʍ\���d����
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.CONS_TYP || ',';             --�\���x���敪
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.EFF_PHASE_IN_DATE || ',';    --���v�ʗL���J�n��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.EFF_PHASE_OUT_DATE  || ',';   --���v�ʗL���I����
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.MRP_TYP || ',';              --���v�ʏ����敪
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.EXTERNAL_DM_FLG || ',';      --�O���f�}���h�t���O
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.ODR_RELEASE_FLG || ',';      --�I�[�_�����σt���O
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.DUE_DATE_TIME || ',';        --�v���[������
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.PRD_DUE_DATE_TIME || ',';    --�����[������
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.CREATED_DATE || ',';         --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.PARENT_OD_NO || ',';         --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.CREATED_BY  || ',';           --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.CREATED_PRG_NM  || ',';       --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.UPDATED_DATE || ',';         --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.UPDATED_PRG_NM  || ',';       --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.MODIFY_COUNT || ',';         --�X�V��
                 
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));

        numWorkCnt := numWorkCnt + 1;

        FETCH curTOdTypExc34   INTO recTOdTypExc34;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTOdTypExc34;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTOdTypExc34%ISOPEN = TRUE THEN
          CLOSE curTOdTypExc34;
        END IF;
        RETURN FALSE;

    END SubFncTOdExc34CsvWrite;

   /*-----------------------------------------------------------------
    'SubFncTOdAlarmCsvRWrite
    '
    ' �C������  2014.12.19 �V�K�쐬
    '
    ' �@�\      : [���v�ʃA���[�����X�g] (�I�[�_���j�폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvcMrp_periodDate  MRP�i�ڏ��ێ�����('YYYYMM')
                  pvcPlant_Cd       �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : [���v�ʃA���[�����X�g] (�I�[�_���j�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTOdAlarmCsvRWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTOdAlarm(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  OD_ALARM_NO,       --���v�ʃA���[�����X�g�ԍ�
        OD_NO,                     --�I�[�_�f�}���h�ԍ�
        PLANT_CD,                  --�H��R�[�h
        MRP_DATE,                  --������
        JOB_ODR_CD,                --����
        JOB_ODR_DETAIL_NO,         --���Ԏ}��
        MSG_NO,                    --���b�Z�[�W�ԍ�
        MSG,                       --���b�Z�[�W
        OD_ALARM_FLG,              --���v�ʃA���[�����X�g���s�ς݃t���O
        CREATED_DATE,              --�쐬��
        CREATED_BY,                --�쐬��
        CREATED_PRG_NM,            --�쐬�v���O������
        UPDATED_DATE,              --�X�V��
        UPDATED_BY,                --�X�V��
        UPDATED_PRG_NM,            --�X�V�v���O������
        MODIFY_COUNT               --�X�V��
          FROM  T_OD_ALARM ALARM
                where exists(select 'x' from  T_od OD1
                                where  ALARM.od_no = OD1.od_no
                                  and   OD1.plant_CD = vcPlant_Cd                                     --A �H��R�[�h
                                  and   OD1.job_odr_cd is null                                        --����
                                  and   OD1.odr_sts_typ = 9                                           --�I�[�_��ԋ敪
                                  and   OD1.rcv_cmplt_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd')  --���Ɋ����� <= MRP�i�ڏ��ێ�����
                                  and   OD1.od_no not in (select OD2.parent_od_no from T_od OD2
                                                              where OD2.parent_od_no = OD1.od_no
                                                                                    and OD2.od_typ in (3,4))); -- upd 2002.09.04
      recTOdAlarm curTOdAlarm%ROWTYPE;
    BEGIN
      OPEN curTOdAlarm(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTOdAlarm INTO recTOdAlarm;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTOdAlarm%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTOdAlarmRName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTOdAlarm.OD_ALARM_NO || ',';                                  --���v�ʃA���[�����X�g�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.OD_NO  || ',';                     --�I�[�_�f�}���h�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.PLANT_CD || ',';                   --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.MRP_DATE  || ',';                  --������
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.JOB_ODR_CD  || ',';                --����
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.JOB_ODR_DETAIL_NO  || ',';         --���Ԏ}��
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.MSG_NO  || ',';                    --���b�Z�[�W�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.MSG  || ',';                       --���b�Z�[�W
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.OD_ALARM_FLG  || ',';              --���v�ʃA���[�����X�g���s�ς݃t���O
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.CREATED_DATE || ',';               --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.CREATED_BY || ',';                 --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.CREATED_PRG_NM || ',';             --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.UPDATED_DATE || ',';               --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.UPDATED_BY || ',';                 --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.UPDATED_PRG_NM || ',';             --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.MODIFY_COUNT || ',';               --�X�V��
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTOdAlarm   INTO recTOdAlarm;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTOdAlarm;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTOdAlarm%ISOPEN = TRUE THEN
          CLOSE curTOdAlarm;
        END IF;
        RETURN FALSE;

    END SubFncTOdAlarmCsvRWrite;

     /*-----------------------------------------------------------------
    'SubFncTMrpReexplosioCsvWrite
    '
    ' �C������  2014.12.19 �V�K�쐬
    '
    ' �@�\      : [���v�ʍēW�J�˗�] (�I�[�_���j�폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvcMrp_periodDate  MRP�i�ڏ��ێ�����('YYYYMM')
                  pvcPlant_Cd       �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : [���v�ʍēW�J�˗�] (�I�[�_���j�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTMrpReexplosioCsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTMrpReexplosion(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  OD_NO,             --�I�[�_�f�}���h�ԍ�
        PLANT_CD,                  --�H��R�[�h
        JOB_ODR_CD,                --����
        JOB_ODR_DETAIL_NO,         --���Ԏ}��
        JOB_ODR_CANCEL_NO,         --���Ԏ�������ԍ�
        OD_LEVEL_NO,               --���v�ʃ��x���ԍ�
        CREATED_DATE,              --�쐬��
        CREATED_BY,                --�쐬��
        CREATED_PRG_NM,            --�쐬�v���O������
        UPDATED_DATE,              --�X�V��
        UPDATED_BY,                --�X�V��
        UPDATED_PRG_NM,            --�X�V�v���O������
        MODIFY_COUNT               --�X�V��
          FROM  T_MRP_REEXPLOSION REE
                where exists(select 'x' from  T_od OD1
                                where  REE.od_no = OD1.od_no
                                  and   OD1.plant_CD = vcPlant_Cd                                     --A �H��R�[�h
                                  and   OD1.job_odr_cd is null                                        --����
                                  and   OD1.odr_sts_typ = 9                                           --�I�[�_��ԋ敪
                                  and   OD1.rcv_cmplt_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd')  --���Ɋ����� <= MRP�i�ڏ��ێ�����
                                  and   OD1.od_no not in (select OD2.parent_od_no from T_od OD2
                                                              where OD2.parent_od_no = OD1.od_no
                                                                                    and OD2.od_typ in (3,4))); -- upd 2002.09.04
      recTMrpReexplosion curTMrpReexplosion%ROWTYPE;
    BEGIN
      OPEN curTMrpReexplosion(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTMrpReexplosion INTO recTMrpReexplosion;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTMrpReexplosion%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTMrpReexplosionName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTMrpReexplosion.OD_NO || ',';                                        --�I�[�_�f�}���h�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.PLANT_CD || ',';                   --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.JOB_ODR_CD  || ',';                --����
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.JOB_ODR_DETAIL_NO  || ',';         --���Ԏ}��
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.JOB_ODR_CANCEL_NO  || ',';         --���Ԏ�������ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.OD_LEVEL_NO  || ',';               --���v�ʃ��x���ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.CREATED_DATE || ',';               --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.CREATED_BY || ',';                 --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.CREATED_PRG_NM || ',';             --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.UPDATED_DATE || ',';               --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.UPDATED_BY || ',';                 --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.UPDATED_PRG_NM || ',';             --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.MODIFY_COUNT || ',';               --�X�V��
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTMrpReexplosion   INTO recTMrpReexplosion;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTMrpReexplosion;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTMrpReexplosion%ISOPEN = TRUE THEN
          CLOSE curTMrpReexplosion;
        END IF;
        RETURN FALSE;

    END SubFncTMrpReexplosioCsvWrite;

 /*-----------------------------------------------------------------
    'SubFncTRlsdPuchOdrCsvWrite
    '
    ' �C������  2010.11.23 �V�K�쐬
    '
    ' �@�\      : �����c(���i�������)�폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvcMrp_periodDate  MRP�i�ڏ��ێ�����('YYYYMM')
                  pvcPlant_Cd        �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : �����c(���i�������)�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTRlsdPuchOdrCsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTRlsdPuchOdr(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  PUCH_ODR_CD,            --�����ԍ�
        ITEM_CD,                --�i�ڔԍ�
        WH_CD,                    --����ꏊ
        NON_NO_ITEM_NAME,        --���i�����i�ږ�
        NON_NO_ITEM_TYP,        --���i�������i�敪
        COMPANY_CD,                --��ЃR�[�h
        VEND_CD,                --�����R�[�h
        PLANT_CD,                --�H��R�[�h
        PUCH_ODR_PERSON,        --�����S����
        PUCH_ODR_START_DATE,      --���������
        PUCH_ODR_DLV_DATE,        --�����[��
        PUCH_ODR_QTY,            --������
        NON_NO_ITEM_PUCH_ODR_UNIT,    --���i�����P��
        UNIT_COST_TYP,            --�P���敪
        UNIT_COST,                --�P��
        PROCESSING_COST,        --���H��
        MATERIAL_COST,            --�ޗ���
        OTHER_OVERHEADS,        --���̑��o��
        DISC_AMOUNT,            --�l�����z
        PUCH_ODR_AMOUNT,        --�������z
        PUCH_ODR_GNR_TYP,        --�������������敪
        PUCH_ODR_INST_DATE,        --�����w����
        PUCH_ODR_INST_SLIP_ISS_FLG,    --�����`�[���s�ς݃t���O
        PUCH_ODR_SLIP_ISS_DATE,      --�����`�[���s��
        ACPT_CMPLT_DATE,        --���������
        PUCH_ODR_STS_TYP,        --������ԋ敪
        INSPC_CMPLT_FLG,        --���������t���O
        INSPC_CMPLT_DATE,        --����������
        CONFIRM_DLV_DATE,        --�񓚔[��
        CONFIRM_DLV_DATE_COMMENT,    --�񓚔[�����l
        SPL_ITEM_TYP,            --�󋋕i�敪
        ACPT_INSPC_TYP,            --��������������敪
        INV_CTRL_FLG,            --�݌ɊǗ��t���O
        WORK_ODR_CD,            --��ƌv��ԍ�
        WORK_IN_PROC_CD,        --�d�|��ƃR�[�h
        OD_NO,                    --�I�[�_�f�}���h�ԍ�
        PUCH_ODR_COMMENT,        --�������l
        ODR_CD,                    --�����ԍ�
        DETAIL_NO,                --���הԍ�
        RATE_JUDGE_DATE,        --���[�g�����
        EXCH_RATE,                --�בփ��[�g
        TAX_RATE_1,                --�ŗ�1
        TAX_RATE_2,                --�ŗ�2
        TAX_RATE_3,                --�ŗ�3
        NET_AMOUNT,                --�{�̋��z
        TAX_AMOUNT_1,            --�Ŋz1
        TAX_AMOUNT_2,            --�Ŋz2
        TAX_AMOUNT_3,            --�Ŋz3
        AMOUNT_INCLUDE_TAX,        --�ō����z
        HOME_CUR_AMOUNT,        --�M�݋��z
        TAX_CD,                    --����ŃR�[�h
        TAX_ROUND_TYP,            --�Œ[���敪
        NON_NO_ITEM_FLG,        --���i�����t���O
        PUCH_ODR_EDI_ISS_FLG,      --�d�c�h�f�[�^�o�͍σt���O
        PUCH_ODR_EDI_ISS_DATE,      --�d�c�h�f�[�^�o�͓�
        ODR_CANCEL_EDI_ISS_DATE,    --�d�c�h�f�[�^����o�͓�
        PUCH_ODR_FAX_ISS_FLG,      --�e�`�w�f�[�^�o�͍σt���O
        PUCH_ODR_FAX_ISS_DATE,      --�e�`�w�f�[�^�o�͓�
        PUCH_ODR_MAIL_ISS_FLG,      --�l�`�h�k�f�[�^�o�͍σt���O
        PUCH_ODR_MAIL_ISS_DATE,      --�l�`�h�k�f�[�^�o�͓�
        ODR_CANCEL_SLIP_ISS_FLG,    --��������`�[���s�t���O
        ODR_CANCEL_SLIP_ISS_DATE,    --����`�[���s��
        ODR_CANCEL_CAUSE_CD,      --������R�R�[�h
        DIRECT_FLG,                --�����i�t���O
        CUST_CD,                --���Ӑ�R�[�h
        ODR_H_NO,                --�󒍓`�[�ԍ�
        ODR_D_SEQ_NO,            --�󒍖��ה����A��
        DELV_CD,                --�[�i�ꏊ�R�[�h
        CREATED_DATE,            --�쐬��
        CREATED_BY,                --�쐬��
        CREATED_PRG_NM,            --�쐬�v���O������
        UPDATED_DATE,            --�X�V��
        UPDATED_BY,                --�X�V��
        UPDATED_PRG_NM,            --�X�V�v���O������
        MODIFY_COUNT,            --�X�V��
        APPR_ID,                --�m����s��
        APPR_DATE              --�m���
          FROM  T_RLSD_PUCH_ODR
          where inv_ctrl_flg = 0                                         --�݌ɊǗ��׸�
              and plant_CD = vcPlant_Cd    --A �H��R�[�h
              and puch_odr_sts_typ = 9                                     --������ԋ敪
              and acpt_cmplt_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd'); --���������
      recTRlsdPuchOdr curTRlsdPuchOdr%ROWTYPE;
    BEGIN
      OPEN curTRlsdPuchOdr(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTRlsdPuchOdr INTO recTRlsdPuchOdr;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTRlsdPuchOdr%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTRlsdPuchOdrName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTRlsdPuchOdr.PUCH_ODR_CD || ',';                                  --�����ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.ITEM_CD  || ',';                 --�i�ڔԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.WH_CD || ',';                      --����ꏊ
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.NON_NO_ITEM_NAME  || ',';         --���i�����i�ږ�
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.NON_NO_ITEM_TYP  || ',';         --���i�������i�敪
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.COMPANY_CD  || ',';                 --��ЃR�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.VEND_CD  || ',';                 --�����R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.PLANT_CD  || ',';                 --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.PUCH_ODR_PERSON|| ',';             --�����S����
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.PUCH_ODR_START_DATE|| ',';         --���������
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.PUCH_ODR_DLV_DATE  || ',';         --�����[��
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.PUCH_ODR_QTY|| ',';                --������
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.NON_NO_ITEM_PUCH_ODR_UNIT || ',';  --���i�����P��
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.UNIT_COST_TYP || ',';              --�P���敪
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.UNIT_COST  || ',';                 --�P��
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.PROCESSING_COST || ',';            --���H��
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.MATERIAL_COST || ',';              --�ޗ���
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.OTHER_OVERHEADS || ',';            --���̑��o��
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.DISC_AMOUNT || ',';                --�l�����z
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.PUCH_ODR_AMOUNT || ',';            --�������z
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.PUCH_ODR_GNR_TYP  || ',';         --�������������敪
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.PUCH_ODR_INST_DATE || ',';         --�����w����
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.PUCH_ODR_INST_SLIP_ISS_FLG || ','; --�����`�[���s�ς݃t���O
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.PUCH_ODR_SLIP_ISS_DATE || ',';     --�����`�[���s��
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.ACPT_CMPLT_DATE || ',';            --���������
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.PUCH_ODR_STS_TYP || ',';           --������ԋ敪
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.INSPC_CMPLT_FLG || ',';            --���������t���O
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.INSPC_CMPLT_DATE || ',';           --����������
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.CONFIRM_DLV_DATE  || ',';         --�񓚔[��
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.CONFIRM_DLV_DATE_COMMENT || ',';   --�񓚔[�����l
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.SPL_ITEM_TYP || ',';               --�󋋕i�敪
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.ACPT_INSPC_TYP || ',';             --��������������敪
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.INV_CTRL_FLG  || ',';             --�݌ɊǗ��t���O
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.WORK_ODR_CD || ',';                --��ƌv��ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.WORK_IN_PROC_CD  || ',';         --�d�|��ƃR�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.OD_NO  || ',';                     --�I�[�_�f�}���h�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.PUCH_ODR_COMMENT  || ',';         --�������l
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.ODR_CD  || ',';                     --�����ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.DETAIL_NO || ',';                  --���הԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.RATE_JUDGE_DATE || ',';            --���[�g�����
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.EXCH_RATE || ',';                  --�בփ��[�g
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.TAX_RATE_1  || ',';                 --�ŗ�1
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.TAX_RATE_2 || ',';                 --�ŗ�2
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.TAX_RATE_3 || ',';                 --�ŗ�3
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.NET_AMOUNT || ',';                 --�{�̋��z
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.TAX_AMOUNT_1  || ',';             --�Ŋz1
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.TAX_AMOUNT_2 || ',';               --�Ŋz2
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.TAX_AMOUNT_3 || ',';               --�Ŋz3
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.AMOUNT_INCLUDE_TAX || ',';         --�ō����z
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.HOME_CUR_AMOUNT || ',';            --�M�݋��z
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.TAX_CD || ',';                     --����ŃR�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.TAX_ROUND_TYP || ',';              --�Œ[���敪
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.NON_NO_ITEM_FLG || ',';            --���i�����t���O
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.PUCH_ODR_EDI_ISS_FLG  || ',';     --�d�c�h�f�[�^�o�͍σt���O
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.PUCH_ODR_EDI_ISS_DATE  || ',';     --�d�c�h�f�[�^�o�͓�
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.ODR_CANCEL_EDI_ISS_DATE || ',';    --�d�c�h�f�[�^����o�͓�
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.PUCH_ODR_FAX_ISS_FLG  || ',';     --�e�`�w�f�[�^�o�͍σt���O
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.PUCH_ODR_FAX_ISS_DATE || ',';      --�e�`�w�f�[�^�o�͓�
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.PUCH_ODR_MAIL_ISS_FLG  || ',';     --�l�`�h�k�f�[�^�o�͍σt��
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.PUCH_ODR_MAIL_ISS_DATE || ',';     --�l�`�h�k�f�[�^�o�͓�
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.ODR_CANCEL_SLIP_ISS_FLG || ',';    --��������`�[���s�t���O
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.ODR_CANCEL_SLIP_ISS_DATE || ',';   --����`�[���s��
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.ODR_CANCEL_CAUSE_CD  || ',';     --������R�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.DIRECT_FLG || ',';                 --�����i�t���O
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.CUST_CD || ',';                    --���Ӑ�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.ODR_H_NO || ',';                   --�󒍓`�[�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.ODR_D_SEQ_NO  || ',';             --�󒍖��ה����A��
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.DELV_CD || ',';                    --�[�i�ꏊ�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.CREATED_DATE || ',';               --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.CREATED_BY || ',';                 --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.CREATED_PRG_NM || ',';             --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.UPDATED_DATE || ',';               --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.UPDATED_BY || ',';                 --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.UPDATED_PRG_NM || ',';             --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.MODIFY_COUNT || ',';               --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.APPR_ID || ',';                    --�m����s��
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.APPR_DATE || ',';                  --�m���
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTRlsdPuchOdr   INTO recTRlsdPuchOdr;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTRlsdPuchOdr;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTRlsdPuchOdr%ISOPEN = TRUE THEN
          CLOSE curTRlsdPuchOdr;
        END IF;
        RETURN FALSE;

    END SubFncTRlsdPuchOdrCsvWrite;

        /*-----------------------------------------------------------------
    'SubFncTAcptRsltBhCsvWrite
    '
    ' �C������  2014.12.19 �V�K�쐬
    '
    ' �@�\      : [�������] (���i�������j�폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvcMrp_periodDate  MRP�i�ڏ��ێ�����('YYYYMM')
                  pvcPlant_Cd       �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : [�������] (���i�������j�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTAcptRsltBhCsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTAcptRslt(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  PUCH_ODR_CD,         --�����ԍ�
        ACPT_NO,                     --�����
        ACPT_QTY,                    --�����
        ACPT_DATE,                   --�����
        UNIT_COST,                   --�P��
        UNIT_COST_TYP,               --�P���敪
        PROCESSING_COST,             --���H��
        MATERIAL_COST,               --�ޗ���
        OTHER_OVERHEADS,             --���̑��o��
        DISC_AMOUNT,                 --�l�����z
        PUCH_ODR_AMOUNT,             --������z
        ACPT_STS_TYP,                --�����ԋ敪
        DLV_CD,                      --�[�i���ԍ�
        PLANT_CD,                    --�H��R�[�h
        WH_CD,                       --����ꏊ
        ACPT_RSLT_COMMENT,           --������є��l
        INVOICE_CD,                  --�����ԍ�
        RATE_JUDGE_DATE,             --���[�g�����
        EXCH_RATE,                   --�בփ��[�g
        TAX_RATE_1,                  --�ŗ�1
        TAX_RATE_2,                  --�ŗ�2
        TAX_RATE_3,                  --�ŗ�3
        NET_AMOUNT,                  --�{�̋��z
        TAX_AMOUNT_1,                --�Ŋz1
        TAX_AMOUNT_2,                --�Ŋz2
        TAX_AMOUNT_3,                --�Ŋz3
        AMOUNT_INCLUDE_TAX,          --�ō����z
        HOME_CUR_AMOUNT,             --�M�݋��z
        TAX_CD,                      --����ŃR�[�h
        TAX_ROUND_TYP,               --�Œ[���敪
        VEND_LOT_NO,                 --���[�J���b�g�ԍ�
        LOT_NO,                      --�݌Ƀ��b�g�ԍ�
        ACPT_CRCT_NO,                --���������
        CREATED_DATE,                --�쐬��
        CREATED_BY,                  --�쐬��
        CREATED_PRG_NM,              --�쐬�v���O������
        UPDATED_DATE,                --�X�V��
        UPDATED_BY,                  --�X�V��
        UPDATED_PRG_NM,              --�X�V�v���O������
        MODIFY_COUNT,                --�X�V��
        ITEM_CD,                     --�i�ڔԍ�
        NON_NO_ITEM_NAME,            --���i�����i�ږ�
        INSPC_WH_CD                  --�����҂��ۊǋ�
          FROM  T_ACPT_RSLT RSLT
                where exists(select 'x' from  T_RLSD_PUCH_ODR ODR
                                where RSLT.PUCH_ODR_CD = ODR.PUCH_ODR_CD
                                  and ODR.inv_ctrl_flg = 0                                           --�݌ɊǗ��׸�
                                  and ODR.plant_CD = vcPlant_Cd                                      --A �H��R�[�h
                                  and ODR.puch_odr_sts_typ = 9                                       --������ԋ敪
                                  and ODR.acpt_cmplt_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd')); --���������
      recTAcptRslt curTAcptRslt%ROWTYPE;
    BEGIN
      OPEN curTAcptRslt(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTAcptRslt INTO recTAcptRslt;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTAcptRslt%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTAcptRsltBhName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTAcptRslt.PUCH_ODR_CD || ',';                                 --�����ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ACPT_NO  || ',';                  --�����
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ACPT_QTY  || ',';                 --�����
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ACPT_DATE  || ',';                --�����
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.UNIT_COST  || ',';                --�P��
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.UNIT_COST_TYP  || ',';            --�P���敪
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.PROCESSING_COST || ',';           --���H��
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.MATERIAL_COST || ',';             --�ޗ���
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.OTHER_OVERHEADS || ',';           --���̑��o��
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.DISC_AMOUNT  || ',';              --�l�����z
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.PUCH_ODR_AMOUNT || ',';           --������z
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ACPT_STS_TYP || ',';              --�����ԋ敪
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.DLV_CD  || ',';                   --�[�i���ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.PLANT_CD  || ',';                 --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.WH_CD  || ',';                    --����ꏊ
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ACPT_RSLT_COMMENT  || ',';        --������є��l
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.INVOICE_CD  || ',';               --�����ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.RATE_JUDGE_DATE || ',';           --���[�g�����
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.EXCH_RATE  || ',';                --�בփ��[�g
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_RATE_1  || ',';               --�ŗ�1
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_RATE_2  || ',';               --�ŗ�2
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_RATE_3  || ',';               --�ŗ�3
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.NET_AMOUNT  || ',';               --�{�̋��z
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_AMOUNT_1  || ',';             --�Ŋz1
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_AMOUNT_2  || ',';             --�Ŋz2
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_AMOUNT_3  || ',';             --�Ŋz3
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.AMOUNT_INCLUDE_TAX || ',';        --�ō����z
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.HOME_CUR_AMOUNT || ',';           --�M�݋��z
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_CD  || ',';                   --����ŃR�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_ROUND_TYP || ',';             --�Œ[���敪
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.VEND_LOT_NO || ',';               --���[�J���b�g�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.LOT_NO   || ',';                  --�݌Ƀ��b�g�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ACPT_CRCT_NO  || ',';             --���������
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.CREATED_DATE || ',';              --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.CREATED_BY || ',';                --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.CREATED_PRG_NM || ',';            --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.UPDATED_DATE || ',';              --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.UPDATED_BY || ',';                --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.UPDATED_PRG_NM || ',';            --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.MODIFY_COUNT || ',';              --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ITEM_CD  || ',';                  --�i�ڔԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.NON_NO_ITEM_NAME || ',';          --���i�����i�ږ�
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.INSPC_WH_CD  || ',';              --�����҂��ۊǋ�
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;
        

        FETCH curTAcptRslt   INTO recTAcptRslt;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTAcptRslt;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTAcptRslt%ISOPEN = TRUE THEN
          CLOSE curTAcptRslt;
        END IF;
        RETURN FALSE;

    END SubFncTAcptRsltBhCsvWrite;

     /*-----------------------------------------------------------------
    'SubFncTInspcRsltBhCsvWrite
    '
    ' �C������  2014.12.19 �V�K�쐬
    '
    ' �@�\      : [��������] (���i�������j�폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvcMrp_periodDate  MRP�i�ڏ��ێ�����('YYYYMM')
                  pvcPlant_Cd       �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : [��������] (���i�������j�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTInspcRsltBhCsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTInspcRslt(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  PUCH_ODR_CD,       --�����ԍ�
        ACPT_NO,                   --�����
        INSPECTED_QTY,             --�����ςݐ�
        ACCEPTED_QTY,              --���i��
        INSPEC_DATE,               --������
        PLANT_CD,                  --�H��R�[�h
        WH_CD,                     --����ꏊ
        INSPEC_RSLT_COMMENT,       --�������є��l
        VEND_LOT_NO,               --���[�J���b�g�ԍ�
        LOT_NO,                    --�݌Ƀ��b�g�ԍ�
        INSPC_CRCT_NO,             --����������
        CREATED_DATE,              --�쐬��
        CREATED_BY,                --�쐬��
        CREATED_PRG_NM,            --�쐬�v���O������
        UPDATED_DATE,              --�X�V��
        UPDATED_BY,                --�X�V��
        UPDATED_PRG_NM,            --�X�V�v���O������
        MODIFY_COUNT,              --�X�V��
        INSPC_WH_CD                --�����҂��ۊǋ�
          FROM  T_INSPC_RSLT RSLT
                where exists(select 'x' from  T_RLSD_PUCH_ODR ODR
                                where RSLT.PUCH_ODR_CD = ODR.PUCH_ODR_CD
                                  and ODR.inv_ctrl_flg = 0                                            --�݌ɊǗ��׸�
                                  and ODR.plant_CD = vcPlant_Cd                                       --A �H��R�[�h
                                  and ODR.puch_odr_sts_typ = 9                                        --������ԋ敪
                                  and ODR.acpt_cmplt_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd')); --���������
      recTInspcRslt curTInspcRslt%ROWTYPE;
    BEGIN
      OPEN curTInspcRslt(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTInspcRslt INTO recTInspcRslt;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTInspcRslt%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTInspcRsltBhName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTInspcRslt.PUCH_ODR_CD || ',';                                  --�����ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.ACPT_NO  || ',';                   --�����
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.INSPECTED_QTY || ',';              --�����ςݐ�
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.ACCEPTED_QTY  || ',';              --���i��
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.INSPEC_DATE  || ',';               --������
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.PLANT_CD  || ',';                  --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.WH_CD  || ',';                     --����ꏊ
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.INSPEC_RSLT_COMMENT  || ',';       --�������є��l
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.VEND_LOT_NO  || ',';               --���[�J���b�g�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.LOT_NO  || ',';                    --�݌Ƀ��b�g�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.INSPC_CRCT_NO  || ',';             --����������
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.CREATED_DATE || ',';               --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.CREATED_BY || ',';                 --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.CREATED_PRG_NM || ',';             --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.UPDATED_DATE || ',';               --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.UPDATED_BY || ',';                 --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.UPDATED_PRG_NM || ',';             --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.MODIFY_COUNT || ',';               --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.INSPC_WH_CD  || ',';               --�����҂��ۊǋ�
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;
        FETCH curTInspcRslt   INTO recTInspcRslt;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTInspcRslt;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTInspcRslt%ISOPEN = TRUE THEN
          CLOSE curTInspcRslt;
        END IF;

    END SubFncTInspcRsltBhCsvWrite;

     /*-----------------------------------------------------------------
    'SubFncTInspcDefectBhCsvWrite
    '
    ' �C������  2014.12.19 �V�K�쐬
    '
    ' �@�\      : [�����s��] (���i�������j�폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvcMrp_periodDate  MRP�i�ڏ��ێ�����('YYYYMM')
                  pvcPlant_Cd       �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : [�����s��] (���i�������j�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTInspcDefectBhCsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTInspcDefect(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  PUCH_ODR_CD,       --�����ԍ�
        ACPT_NO,                   --�����
        DEFECT_CAUSE_CD,           --�����s�Ǘ��R�R�[�h
        PLANT_CD,                  --�H��R�[�h
        DEFECT_INSPC_QTY,          --�����s�ǐ�
        DEFECT_COMMENT,            --�����s�ǔ��l
        CREATED_DATE,              --�쐬��
        CREATED_BY,                --�쐬��
        CREATED_PRG_NM,            --�쐬�v���O������
        UPDATED_DATE,              --�X�V��
        UPDATED_BY,                --�X�V��
        UPDATED_PRG_NM,            --�X�V�v���O������
        MODIFY_COUNT               --�X�V��
          FROM  T_INSPC_DEFECT INSPC
                where exists(select 'x' from  T_RLSD_PUCH_ODR ODR
                                where INSPC.PUCH_ODR_CD = ODR.PUCH_ODR_CD
                                  and ODR.inv_ctrl_flg = 0                                            --�݌ɊǗ��׸�
                                  and ODR.plant_CD = vcPlant_Cd                                       --A �H��R�[�h
                                  and ODR.puch_odr_sts_typ = 9                                        --������ԋ敪
                                  and ODR.acpt_cmplt_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd')); --���������
      recTInspcDefect curTInspcDefect%ROWTYPE;
    BEGIN
      OPEN curTInspcDefect(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTInspcDefect INTO recTInspcDefect;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTInspcDefect%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTInspcDefectBhName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTInspcDefect.PUCH_ODR_CD || ',';                                  --�����ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.ACPT_NO  || ',';                   --�����
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.DEFECT_CAUSE_CD || ',';            --�����s�Ǘ��R�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.PLANT_CD  || ',';                  --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.DEFECT_INSPC_QTY  || ',';          --�����s�ǐ�
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.DEFECT_COMMENT  || ',';            --�����s�ǔ��l
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.CREATED_DATE || ',';               --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.CREATED_BY || ',';                 --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.CREATED_PRG_NM || ',';             --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.UPDATED_DATE || ',';               --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.UPDATED_BY || ',';                 --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.UPDATED_PRG_NM || ',';             --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.MODIFY_COUNT || ',';               --�X�V��
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTInspcDefect   INTO recTInspcDefect;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTInspcDefect;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTInspcDefect%ISOPEN = TRUE THEN
          CLOSE curTInspcDefect;
        END IF;

    END SubFncTInspcDefectBhCsvWrite;

         /*-----------------------------------------------------------------
    'SubFncTPastInspcAcptBhCsvWrite
    '
    ' �C������  2014.12.19 �V�K�쐬
    '
    ' �@�\      : [��������] (���i�������j�폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvcMrp_periodDate  MRP�i�ڏ��ێ�����('YYYYMM')
                  pvcPlant_Cd       �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : [��������] (���i�������j�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTPastInspcAcptBhCsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTPastInspcAcpt(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  PUCH_ODR_CD,       --�����ԍ�
        ACPT_NO,                   --�����
        INSPC_ACPT_NO,             --�����ԍ�
        INSPC_ACPT_GNR_TYP,        --���������敪
        CRCT_NO,                   --������
        CRCT_TYP,                  --�����敪
        ITEM_CD,                   --�i�ڔԍ�
        ITEM_NAME,                 --�i�ږ�
        SLIP_TYP,                  --�`�[���
        WORK_IN_PROC_CD,           --�d�|��ƃR�[�h
        COMPANY_CD,                --��ЃR�[�h
        VEND_CD,                   --�����R�[�h
        PLANT_CD,                  --�H��R�[�h
        UNIT_COST,                 --�P��
        UNIT_COST_TYP,             --�P���敪
        PROCESSING_COST,           --���H��
        MATERIAL_COST,             --�ޗ���
        OTHER_OVERHEADS,           --���̑��o��
        ACPT_QTY,                  --�����
        INSPC_ACPT_QTY,            --������
        STOCK_UNIT,                --�v�ʒP��
        INSPC_ACPT_AMOUNT,         --�������z
        SAVING_AMOUNT,             --�l�����z
        ACPT_DATE,                 --�����
        INSPC_ACPT_DATE,           --������
        PRODUCT_TYP,               --���i�敪
        DLV_CD,                    --�[�i���ԍ�
        CREATED_DATE,              --�쐬��
        CREATED_BY,                --�쐬��
        CREATED_PRG_NM,            --�쐬�v���O������
        UPDATED_DATE,              --�X�V��
        UPDATED_BY,                --�X�V��
        UPDATED_PRG_NM,            --�X�V�v���O������
        MODIFY_COUNT               --�X�V��
          FROM  T_PAST_INSPC_ACPT ACPT
                where exists(select 'x' from  T_RLSD_PUCH_ODR ODR
                                where ACPT.PUCH_ODR_CD = ODR.PUCH_ODR_CD
                                  and ODR.inv_ctrl_flg = 0                                            --�݌ɊǗ��׸�
                                  and ODR.plant_CD = vcPlant_Cd                                       --A �H��R�[�h
                                  and ODR.puch_odr_sts_typ = 9                                        --������ԋ敪
                                  and ODR.acpt_cmplt_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd')); --���������
      recTPastInspcAcpt curTPastInspcAcpt%ROWTYPE;
    BEGIN
      OPEN curTPastInspcAcpt(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTPastInspcAcpt INTO recTPastInspcAcpt;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTPastInspcAcpt%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTPastInspcAcptBhName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTPastInspcAcpt.PUCH_ODR_CD || ',';                                  --�����ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.ACPT_NO  || ',';                   --�����
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.INSPC_ACPT_NO || ',';              --�����ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.INSPC_ACPT_GNR_TYP  || ',';        --���������敪
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.CRCT_NO  || ',';                   --������
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.CRCT_TYP  || ',';                  --�����敪
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.ITEM_CD  || ',';                   --�i�ڔԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.ITEM_NAME   || ',';                --�i�ږ�
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.SLIP_TYP   || ',';                 --�`�[���
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.WORK_IN_PROC_CD   || ',';          --�d�|��ƃR�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.COMPANY_CD   || ',';               --��ЃR�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.VEND_CD   || ',';                  --�����R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.PLANT_CD   || ',';                 --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.UNIT_COST   || ',';                --�P��
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.UNIT_COST_TYP   || ',';            --�P���敪
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.PROCESSING_COST   || ',';          --���H��
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.MATERIAL_COST   || ',';            --�ޗ���
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.OTHER_OVERHEADS   || ',';          --���̑��o��
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.ACPT_QTY   || ',';                 --�����
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.INSPC_ACPT_QTY   || ',';           --������
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.STOCK_UNIT   || ',';               --�v�ʒP��
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.INSPC_ACPT_AMOUNT || ',';          --�������z
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.SAVING_AMOUNT   || ',';            --�l�����z
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.ACPT_DATE    || ',';               --�����
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.INSPC_ACPT_DATE   || ',';          --������
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.PRODUCT_TYP   || ',';              --���i�敪
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.DLV_CD   || ',';                   --�[�i���ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.CREATED_DATE || ',';               --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.CREATED_BY || ',';                 --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.CREATED_PRG_NM || ',';             --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.UPDATED_DATE || ',';               --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.UPDATED_BY || ',';                 --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.UPDATED_PRG_NM || ',';             --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.MODIFY_COUNT || ',';               --�X�V��
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTPastInspcAcpt   INTO recTPastInspcAcpt;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTPastInspcAcpt;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTPastInspcAcpt%ISOPEN = TRUE THEN
          CLOSE curTPastInspcAcpt;
        END IF;

    END SubFncTPastInspcAcptBhCsvWrite;

         /*-----------------------------------------------------------------
    'SubFncTPastInspcBhcsvWrite
    '
    ' �C������  2014.12.19 �V�K�쐬
    '
    ' �@�\      : [�������z����] (���i�������j�폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvcMrp_periodDate  MRP�i�ڏ��ێ�����('YYYYMM')
                  pvcPlant_Cd       �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : [�������z����] (���i�������j�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTPastInspcBhcsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTPastInspcAcptAmount(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  PUCH_ODR_CD,       --�����ԍ�
        ACPT_NO,                   --�����
        INSPC_ACPT_NO,             --�����ԍ�
        CRCT_TYP,                  --�����敪
        CRCT_NO,                   --������
        ODR_CD,                    --�����ԍ�
        DETAIL_NO,                 --���הԍ�
        INVOICE_CD,                --�����ԍ�
        RATE_JUDGE_DATE,           --���[�g�����
        EXCH_RATE,                 --�בփ��[�g
        TAX_RATE_1,                --�ŗ�1
        TAX_RATE_2,                --�ŗ�2
        TAX_RATE_3,                --�ŗ�3
        NET_AMOUNT,                --�{�̋��z
        TAX_AMOUNT_1,              --�Ŋz1
        TAX_AMOUNT_2,              --�Ŋz2
        TAX_AMOUNT_3,              --�Ŋz3
        AMOUNT_INCLUDE_TAX,        --�ō����z
        HOME_CUR_AMOUNT,           --�M�݋��z
        CREATED_DATE,              --�쐬��
        CREATED_BY,                --�쐬��
        CREATED_PRG_NM,            --�쐬�v���O������
        UPDATED_DATE,              --�X�V��
        UPDATED_BY,                --�X�V��
        UPDATED_PRG_NM,            --�X�V�v���O������
        MODIFY_COUNT               --�X�V��
          FROM  T_PAST_INSPC_ACPT_AMOUNT AMOUNT
                where exists(select 'x' from  T_RLSD_PUCH_ODR ODR
                                where AMOUNT.PUCH_ODR_CD = ODR.PUCH_ODR_CD
                                  and ODR.inv_ctrl_flg = 0                                            --�݌ɊǗ��׸�
                                  and ODR.plant_CD = vcPlant_Cd                                       --A �H��R�[�h
                                  and ODR.puch_odr_sts_typ = 9                                        --������ԋ敪
                                  and ODR.acpt_cmplt_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd')); --���������
      recTPastInspcAcptAmount curTPastInspcAcptAmount%ROWTYPE;
    BEGIN
      OPEN curTPastInspcAcptAmount(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTPastInspcAcptAmount INTO recTPastInspcAcptAmount;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTPastInspcAcptAmount%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTPastInspcName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTPastInspcAcptAmount.PUCH_ODR_CD || ',';                                  --�����ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.ACPT_NO  || ',';                   --�����
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.INSPC_ACPT_NO || ',';              --�����ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.CRCT_TYP  || ',';                  --�����敪
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.CRCT_NO  || ',';                   --������
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.ODR_CD   || ',';                   --�����ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.DETAIL_NO   || ',';                --���הԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.INVOICE_CD   || ',';               --�����ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.RATE_JUDGE_DATE   || ',';          --���[�g�����
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.EXCH_RATE   || ',';                --�בփ��[�g
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.TAX_RATE_1   || ',';               --�ŗ�1
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.TAX_RATE_2   || ',';               --�ŗ�2
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.TAX_RATE_3   || ',';               --�ŗ�3
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.NET_AMOUNT   || ',';               --�{�̋��z
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.TAX_AMOUNT_1   || ',';             --�Ŋz1
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.TAX_AMOUNT_2   || ',';             --�Ŋz2
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.TAX_AMOUNT_3   || ',';             --�Ŋz3
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.AMOUNT_INCLUDE_TAX   || ',';       --�ō����z
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.HOME_CUR_AMOUNT   || ',';          --�M�݋��z
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.CREATED_DATE || ',';               --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.CREATED_BY || ',';                 --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.CREATED_PRG_NM || ',';             --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.UPDATED_DATE || ',';               --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.UPDATED_BY || ',';                 --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.UPDATED_PRG_NM || ',';             --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.MODIFY_COUNT || ',';               --�X�V��
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTPastInspcAcptAmount   INTO recTPastInspcAcptAmount;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTPastInspcAcptAmount;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTPastInspcAcptAmount%ISOPEN = TRUE THEN
          CLOSE curTPastInspcAcptAmount;
        END IF;

    END SubFncTPastInspcBhcsvWrite;

 /*-----------------------------------------------------------------
    'SubFncTDelJobOdrOdCsvWrite
    '
    ' �C������  2010.11.23 �V�K�쐬
    '
    ' �@�\      : ���Ԍv��폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvcMrp_periodDate  MRP�i�ڏ��ێ�����('YYYYMM')
                  pvcPlant_Cd      �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  :  [���Ԍv��폜] �폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTDelJobOdrOdCsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTDelJobOdrOd(
        vcMrp_periodDate       IN  VARCHAR2
        ,vcPlant_Cd             IN  VARCHAR2
      ) IS
        SELECT  OD_NO,            --�I�[�_�f�}���h�ԍ�
        JOB_ODR_CD,               --����
        JOB_ODR_DETAIL_NO,        --���Ԏ}��
        JOB_ODR_CANCEL_NO,        --���Ԏ�������ԍ�
        CREATED_DATE,             --�쐬��
        CREATED_BY,               --�쐬��
        CREATED_PRG_NM,           --�쐬�v���O������
        UPDATED_DATE,             --�X�V��
        UPDATED_BY,               --�X�V��
        UPDATED_PRG_NM,           --�X�V�v���O������
        MODIFY_COUNT              --�X�V��
          FROM T_DEL_JOB_ODR_OD DEL
             WHERE exists(select 'x' from T_JOB_ODR_CD_STOCK J_STOCK
                       where DEL.JOB_ODR_CD = J_STOCK.JOB_ODR_CD                       --����
                         and DEL.JOB_ODR_DETAIL_NO = J_STOCK.JOB_ODR_DETAIL_NO         --���Ԏ}��
                         and J_STOCK.plant_cd = pvc2PlantCd                            --�H��R�[�h
                         and J_STOCK.stock_on_hand_qty <> 0);                          --���ԕʎ莝�݌ɐ�
      recTDelJobOdrOd curTDelJobOdrOd%ROWTYPE;
    BEGIN
          insert into T_DEL_JOB_ODR_OD(
        OD_NO,              --// �I�[�_�f�}���h�ԍ�
        JOB_ODR_CD,         --// ����
        JOB_ODR_DETAIL_NO,  --// ���Ԏ}��
        JOB_ODR_CANCEL_NO   --// ���Ԏ��
        )
        select  OD1.OD_NO,          --// �I�[�_�f�}���h�ԍ�
            OD1.JOB_ODR_CD,         --// ����
            OD1.JOB_ODR_DETAIL_NO,  --// ���Ԏ}��
            OD1.JOB_ODR_CANCEL_NO   --// ���Ԏ��
        from    t_od OD1
        where   OD1.job_odr_cd      is not NULL
        and OD1.parent_od_no    is NULL
        and OD1.odr_sts_typ     = 9
        and OD1.RCV_CMPLT_DATE  <= to_date(pvcMrp_periodDate,'yyyy/mm/dd')
        and OD1.plant_cd = pvcPlant_Cd    --A �H��R�[�h
        and (
            OD1.JOB_ODR_CD,         --// ����
            OD1.JOB_ODR_DETAIL_NO,  --// ���Ԏ}��
            OD1.JOB_ODR_CANCEL_NO   --// ���Ԏ��
            ) not in (
            select  OD2.JOB_ODR_CD,
                OD2.JOB_ODR_DETAIL_NO,
                OD2.JOB_ODR_CANCEL_NO
            from    t_od OD2
            where   OD2.JOB_ODR_CD      = OD1.JOB_ODR_CD
            and OD2.JOB_ODR_DETAIL_NO   = OD1.JOB_ODR_DETAIL_NO
            and OD2.JOB_ODR_CANCEL_NO   = OD1.JOB_ODR_CANCEL_NO
            and ((OD2.od_typ    = 1     and OD2.odr_sts_typ <> 9) or
                 (OD2.od_typ    in(1,3,4)   and OD2.dm_sts_typ  <> 9))
            );
      OPEN curTDelJobOdrOd(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTDelJobOdrOd INTO recTDelJobOdrOd;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTDelJobOdrOd%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTDelJobOdrOdName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTDelJobOdrOd.OD_NO || ',';                                  --�I�[�_�f�}���h�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTDelJobOdrOd.JOB_ODR_CD  || ',';           --����
        vc2WorkCsvData := vc2WorkCsvData || recTDelJobOdrOd.JOB_ODR_DETAIL_NO  || ',';   --���Ԏ}��
        vc2WorkCsvData := vc2WorkCsvData || recTDelJobOdrOd.JOB_ODR_CANCEL_NO  || ',';   --���Ԏ�������ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTDelJobOdrOd.CREATED_DATE || ',';         --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTDelJobOdrOd.CREATED_BY || ',';         --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTDelJobOdrOd.CREATED_PRG_NM  || ',';           --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTDelJobOdrOd.UPDATED_DATE  || ',';       --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTDelJobOdrOd.UPDATED_BY || ',';         --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTDelJobOdrOd.UPDATED_PRG_NM  || ',';       --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTDelJobOdrOd.MODIFY_COUNT || ',';         --�X�V��
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTDelJobOdrOd   INTO recTDelJobOdrOd;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTDelJobOdrOd;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTDelJobOdrOd%ISOPEN = TRUE THEN
          CLOSE curTDelJobOdrOd;
        END IF;
        RETURN FALSE;

    END SubFncTDelJobOdrOdCsvWrite;
   /*-----------------------------------------------------------------
    'SubFncTIssueInstDdCsvWrite
    '
    ' �C������  2010.11.23 �V�K�쐬
    '
    ' �@�\      : �o�Ɏw��(���ԏ��)�̍폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : 
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : [�o�Ɏw��] (�f�}���h���)�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTIssueInstJobCsvWrite  RETURN BOOLEAN IS

      CURSOR curTIssueInstJob  IS
        SELECT  ISSUE_INST_CD,             --�o�Ɏw���ԍ�
        PLANT_CD,                 --�H��R�[�h
        OD_NO,                     --�I�[�_�f�}���h�ԍ�
        ITEM_CD,                 --�o�ɕi�ڔԍ�
        PS_EDITION,                 --�o�ɕi�ڍ\���Ő�
        PUCH_ODR_CD,             --�����ԍ�
        COMPANY_CD,                 --��ЃR�[�h
        VEND_CD,                 --�����R�[�h
        CONS_TYP,                 --�x���敪
        WORK_ODR_CD,               --��ƌv��ԍ�
        WORK_IN_PROC_CD,           --�d�|��ƃR�[�h
        WS_CD,                     --��Ƌ�R�[�h
        WH_CD,                     --�o�ɐ�ۊǋ�R�[�h
        ISSUE_INST_UNIT_QTY,         --�o�Ɏw���P�ʐ�
        ISSUE_INST_UNIT_DENOMINATOR,   --�o�Ɏw���P�ʐ�����
        ISSUE_INST_UNIT_NUMERATOR,     --�o�Ɏw���P�ʐ����q
        ISSUE_INST_QTY,               --�o�Ɏw����
        TOTAL_ISSUE_QTY,         --�o�ɗ݌v��
        SCDL_ISSUE_DATE,         --�o�ɗ\���
        ISSUE_CMPLT_DATE,         --�o�Ɋ�����
        ISSUE_TYP,                    --�o�Ɏw���o�ɋ敪
        ISSUE_CMPLT_FLG,         --�o�Ɋ����t���O
        ISSUE_INST_ISS_FLG,       --�o�Ɏw�������s�ς݃t���O
        ISSUE_INST_ISS_DATE,       --�o�Ɏw�������s��
        ISSUE_INST_COMMENT,       --�o�Ɏw�����l
        LOT_CTRL_FLG,             --���b�g�Ǘ��t���O
        CREATED_DATE,             --�쐬��
        CREATED_BY,             --�쐬��
        CREATED_PRG_NM,         --�쐬�v���O������
        UPDATED_DATE,             --�X�V��
        UPDATED_BY,             --�X�V��
        UPDATED_PRG_NM,         --�X�V�v���O������
        MODIFY_COUNT               --�X�V��
          FROM T_ISSUE_INST IS_INST
            where exists(select 'x' from T_DEL_JOB_ODR_OD DEL
                                   where IS_INST.OD_NO in (select od_no from t_od OD
                                                           where DEL.JOB_ODR_CD = OD.JOB_ODR_CD
                                                             and DEL.JOB_ODR_DETAIL_NO = OD.JOB_ODR_DETAIL_NO
                                                             and DEL.job_odr_cancel_no = OD.job_odr_cancel_no
                                                             and (OD.od_typ = 1 or OD.od_typ = 3)));    --�d�ώw��Ұ�2000/03/30
      recTIssueInstJob curTIssueInstJob%ROWTYPE;
    BEGIN
      OPEN curTIssueInstJob();
      FETCH curTIssueInstJob INTO recTIssueInstJob;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTIssueInstJob%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTIssueInstJobName || SUBSTR(lvc2Mrp_period,1,4) ||SUBSTR(lvc2Mrp_period,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTIssueInstJob.ISSUE_INST_CD || ',';                                  --�o�Ɏw���ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.PLANT_CD || ',';                     --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.OD_NO || ',';                        --�I�[�_�f�}���h�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.ITEM_CD || ',';                      --�o�ɕi�ڔԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.PS_EDITION || ',';                   --�o�ɕi�ڍ\���Ő�
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.PUCH_ODR_CD || ',';                  --�����ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.COMPANY_CD || ',';                   --��ЃR�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.VEND_CD || ',';                      --�����R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.CONS_TYP || ',';                     --�x���敪
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.WORK_ODR_CD || ',';                  --��ƌv��ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.WORK_IN_PROC_CD || ',';              --�d�|��ƃR�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.WS_CD || ',';                        --��Ƌ�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.WH_CD || ',';                        --�o�ɐ�ۊǋ�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.ISSUE_INST_UNIT_QTY || ',';          --�o�Ɏw���P�ʐ�
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.ISSUE_INST_UNIT_DENOMINATOR || ',';  --�o�Ɏw���P�ʐ�����
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.ISSUE_INST_UNIT_NUMERATOR || ',';    --�o�Ɏw���P�ʐ����q
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.ISSUE_INST_QTY || ',';               --�o�Ɏw����
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.TOTAL_ISSUE_QTY || ',';              --�o�ɗ݌v��
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.SCDL_ISSUE_DATE || ',';              --�o�ɗ\���
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.ISSUE_CMPLT_DATE || ',';             --�o�Ɋ�����
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.ISSUE_TYP || ',';                    --�o�Ɏw���o�ɋ敪
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.ISSUE_CMPLT_FLG || ',';              --�o�Ɋ����t���O
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.ISSUE_INST_ISS_FLG || ',';           --�o�Ɏw�������s�ς�
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.ISSUE_INST_ISS_DATE || ',';          --�o�Ɏw�������s��
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.ISSUE_INST_COMMENT || ',';          --�o�Ɏw�����l
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.LOT_CTRL_FLG || ',';                 --���b�g�Ǘ��t���O
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.CREATED_DATE || ',';                 --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.CREATED_BY || ',';                   --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.CREATED_PRG_NM || ',';               --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.UPDATED_DATE || ',';                 --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.UPDATED_BY || ',';                   --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.UPDATED_PRG_NM || ',';               --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.MODIFY_COUNT || ',';                 --�X�V��
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTIssueInstJob   INTO recTIssueInstJob;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTIssueInstJob;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTIssueInstJob%ISOPEN = TRUE THEN
          CLOSE curTIssueInstJob;
        END IF;
        RETURN FALSE;

    END SubFncTIssueInstJobCsvWrite;
 /*-----------------------------------------------------------------
    'SubFncTRsPuchOdrJobCsvWrite
    '
    ' �C������  2010.11.23 �V�K�쐬
    '
    ' �@�\      : �����c(���ԏ��)�폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : 
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : �����c(���ԏ��)�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTRsPuchOdrJobCsvWrite  RETURN BOOLEAN IS

      CURSOR curTRsPuchOdrJob IS
        SELECT  PUCH_ODR_CD,            --�����ԍ�
        ITEM_CD,                --�i�ڔԍ�
        WH_CD,                    --����ꏊ
        NON_NO_ITEM_NAME,        --���i�����i�ږ�
        NON_NO_ITEM_TYP,        --���i�������i�敪
        COMPANY_CD,                --��ЃR�[�h
        VEND_CD,                --�����R�[�h
        PLANT_CD,                --�H��R�[�h
        PUCH_ODR_PERSON,        --�����S����
        PUCH_ODR_START_DATE,      --���������
        PUCH_ODR_DLV_DATE,        --�����[��
        PUCH_ODR_QTY,            --������
        NON_NO_ITEM_PUCH_ODR_UNIT,    --���i�����P��
        UNIT_COST_TYP,            --�P���敪
        UNIT_COST,                --�P��
        PROCESSING_COST,        --���H��
        MATERIAL_COST,            --�ޗ���
        OTHER_OVERHEADS,        --���̑��o��
        DISC_AMOUNT,            --�l�����z
        PUCH_ODR_AMOUNT,        --�������z
        PUCH_ODR_GNR_TYP,        --�������������敪
        PUCH_ODR_INST_DATE,        --�����w����
        PUCH_ODR_INST_SLIP_ISS_FLG,    --�����`�[���s�ς݃t���O
        PUCH_ODR_SLIP_ISS_DATE,      --�����`�[���s��
        ACPT_CMPLT_DATE,        --���������
        PUCH_ODR_STS_TYP,        --������ԋ敪
        INSPC_CMPLT_FLG,        --���������t���O
        INSPC_CMPLT_DATE,        --����������
        CONFIRM_DLV_DATE,        --�񓚔[��
        CONFIRM_DLV_DATE_COMMENT,    --�񓚔[�����l
        SPL_ITEM_TYP,            --�󋋕i�敪
        ACPT_INSPC_TYP,            --��������������敪
        INV_CTRL_FLG,            --�݌ɊǗ��t���O
        WORK_ODR_CD,            --��ƌv��ԍ�
        WORK_IN_PROC_CD,        --�d�|��ƃR�[�h
        OD_NO,                    --�I�[�_�f�}���h�ԍ�
        PUCH_ODR_COMMENT,        --�������l
        ODR_CD,                    --�����ԍ�
        DETAIL_NO,                --���הԍ�
        RATE_JUDGE_DATE,        --���[�g�����
        EXCH_RATE,                --�בփ��[�g
        TAX_RATE_1,                --�ŗ�1
        TAX_RATE_2,                --�ŗ�2
        TAX_RATE_3,                --�ŗ�3
        NET_AMOUNT,                --�{�̋��z
        TAX_AMOUNT_1,            --�Ŋz1
        TAX_AMOUNT_2,            --�Ŋz2
        TAX_AMOUNT_3,            --�Ŋz3
        AMOUNT_INCLUDE_TAX,        --�ō����z
        HOME_CUR_AMOUNT,        --�M�݋��z
        TAX_CD,                    --����ŃR�[�h
        TAX_ROUND_TYP,            --�Œ[���敪
        NON_NO_ITEM_FLG,        --���i�����t���O
        PUCH_ODR_EDI_ISS_FLG,      --�d�c�h�f�[�^�o�͍σt���O
        PUCH_ODR_EDI_ISS_DATE,      --�d�c�h�f�[�^�o�͓�
        ODR_CANCEL_EDI_ISS_DATE,    --�d�c�h�f�[�^����o�͓�
        PUCH_ODR_FAX_ISS_FLG,      --�e�`�w�f�[�^�o�͍σt���O
        PUCH_ODR_FAX_ISS_DATE,      --�e�`�w�f�[�^�o�͓�
        PUCH_ODR_MAIL_ISS_FLG,      --�l�`�h�k�f�[�^�o�͍σt���O
        PUCH_ODR_MAIL_ISS_DATE,      --�l�`�h�k�f�[�^�o�͓�
        ODR_CANCEL_SLIP_ISS_FLG,    --��������`�[���s�t���O
        ODR_CANCEL_SLIP_ISS_DATE,    --����`�[���s��
        ODR_CANCEL_CAUSE_CD,      --������R�R�[�h
        DIRECT_FLG,                --�����i�t���O
        CUST_CD,                --���Ӑ�R�[�h
        ODR_H_NO,                --�󒍓`�[�ԍ�
        ODR_D_SEQ_NO,            --�󒍖��ה����A��
        DELV_CD,                --�[�i�ꏊ�R�[�h
        CREATED_DATE,            --�쐬��
        CREATED_BY,                --�쐬��
        CREATED_PRG_NM,            --�쐬�v���O������
        UPDATED_DATE,            --�X�V��
        UPDATED_BY,                --�X�V��
        UPDATED_PRG_NM,            --�X�V�v���O������
        MODIFY_COUNT,            --�X�V��
        APPR_ID,                --�m����s��
        APPR_DATE              --�m���
          FROM  T_RLSD_PUCH_ODR RLSD
            where exists(select 'x' from T_DEL_JOB_ODR_OD DEL,
                                         t_od OD
                            where OD.od_no              = RLSD.od_no
                              and DEL.job_odr_cd        = OD.job_odr_cd
                              and DEL.job_odr_detail_no = OD.job_odr_detail_no
                              and DEL.job_odr_cancel_no = OD.job_odr_cancel_no);
      recTRsPuchOdrJob curTRsPuchOdrJob%ROWTYPE;
    BEGIN
      OPEN curTRsPuchOdrJob();
      FETCH curTRsPuchOdrJob INTO recTRsPuchOdrJob;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTRsPuchOdrJob%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTRsPuchOdrJobName ||  SUBSTR(lvc2Mrp_period,1,4) ||SUBSTR(lvc2Mrp_period,6,2)  || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTRsPuchOdrJob.PUCH_ODR_CD || ',';                                  --�����ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.ITEM_CD  || ',';                 --�i�ڔԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.WH_CD || ',';                      --����ꏊ
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.NON_NO_ITEM_NAME  || ',';         --���i�����i�ږ�
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.NON_NO_ITEM_TYP  || ',';         --���i�������i�敪
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.COMPANY_CD  || ',';                 --��ЃR�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.VEND_CD  || ',';                 --�����R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.PLANT_CD  || ',';                 --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.PUCH_ODR_PERSON|| ',';             --�����S����
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.PUCH_ODR_START_DATE|| ',';         --���������
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.PUCH_ODR_DLV_DATE  || ',';         --�����[��
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.PUCH_ODR_QTY|| ',';                --������
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.NON_NO_ITEM_PUCH_ODR_UNIT || ',';  --���i�����P��
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.UNIT_COST_TYP || ',';              --�P���敪
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.UNIT_COST  || ',';                 --�P��
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.PROCESSING_COST || ',';            --���H��
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.MATERIAL_COST || ',';              --�ޗ���
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.OTHER_OVERHEADS || ',';            --���̑��o��
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.DISC_AMOUNT || ',';                --�l�����z
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.PUCH_ODR_AMOUNT || ',';            --�������z
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.PUCH_ODR_GNR_TYP  || ',';         --�������������敪
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.PUCH_ODR_INST_DATE || ',';         --�����w����
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.PUCH_ODR_INST_SLIP_ISS_FLG || ','; --�����`�[���s�ς݃t���O
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.PUCH_ODR_SLIP_ISS_DATE || ',';     --�����`�[���s��
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.ACPT_CMPLT_DATE || ',';            --���������
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.PUCH_ODR_STS_TYP || ',';           --������ԋ敪
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.INSPC_CMPLT_FLG || ',';            --���������t���O
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.INSPC_CMPLT_DATE || ',';           --����������
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.CONFIRM_DLV_DATE  || ',';         --�񓚔[��
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.CONFIRM_DLV_DATE_COMMENT || ',';   --�񓚔[�����l
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.SPL_ITEM_TYP || ',';               --�󋋕i�敪
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.ACPT_INSPC_TYP || ',';             --��������������敪
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.INV_CTRL_FLG  || ',';             --�݌ɊǗ��t���O
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.WORK_ODR_CD || ',';                --��ƌv��ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.WORK_IN_PROC_CD  || ',';         --�d�|��ƃR�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.OD_NO  || ',';                     --�I�[�_�f�}���h�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.PUCH_ODR_COMMENT  || ',';         --�������l
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.ODR_CD  || ',';                     --�����ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.DETAIL_NO || ',';                  --���הԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.RATE_JUDGE_DATE || ',';            --���[�g�����
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.EXCH_RATE || ',';                  --�בփ��[�g
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.TAX_RATE_1  || ',';                 --�ŗ�1
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.TAX_RATE_2 || ',';                 --�ŗ�2
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.TAX_RATE_3 || ',';                 --�ŗ�3
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.NET_AMOUNT || ',';                 --�{�̋��z
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.TAX_AMOUNT_1  || ',';             --�Ŋz1
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.TAX_AMOUNT_2 || ',';               --�Ŋz2
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.TAX_AMOUNT_3 || ',';               --�Ŋz3
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.AMOUNT_INCLUDE_TAX || ',';         --�ō����z
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.HOME_CUR_AMOUNT || ',';            --�M�݋��z
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.TAX_CD || ',';                     --����ŃR�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.TAX_ROUND_TYP || ',';              --�Œ[���敪
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.NON_NO_ITEM_FLG || ',';            --���i�����t���O
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.PUCH_ODR_EDI_ISS_FLG  || ',';     --�d�c�h�f�[�^�o�͍σt���O
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.PUCH_ODR_EDI_ISS_DATE  || ',';     --�d�c�h�f�[�^�o�͓�
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.ODR_CANCEL_EDI_ISS_DATE || ',';    --�d�c�h�f�[�^����o�͓�
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.PUCH_ODR_FAX_ISS_FLG  || ',';     --�e�`�w�f�[�^�o�͍σt���O
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.PUCH_ODR_FAX_ISS_DATE || ',';      --�e�`�w�f�[�^�o�͓�
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.PUCH_ODR_MAIL_ISS_FLG  || ',';     --�l�`�h�k�f�[�^�o�͍σt��
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.PUCH_ODR_MAIL_ISS_DATE || ',';     --�l�`�h�k�f�[�^�o�͓�
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.ODR_CANCEL_SLIP_ISS_FLG || ',';    --��������`�[���s�t���O
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.ODR_CANCEL_SLIP_ISS_DATE || ',';   --����`�[���s��
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.ODR_CANCEL_CAUSE_CD  || ',';     --������R�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.DIRECT_FLG || ',';                 --�����i�t���O
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.CUST_CD || ',';                    --���Ӑ�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.ODR_H_NO || ',';                   --�󒍓`�[�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.ODR_D_SEQ_NO  || ',';             --�󒍖��ה����A��
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.DELV_CD || ',';                    --�[�i�ꏊ�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.CREATED_DATE || ',';               --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.CREATED_BY || ',';                 --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.CREATED_PRG_NM || ',';             --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.UPDATED_DATE || ',';               --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.UPDATED_BY || ',';                 --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.UPDATED_PRG_NM || ',';             --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.MODIFY_COUNT || ',';               --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.APPR_ID || ',';                    --�m����s��
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.APPR_DATE || ',';                  --�m���
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTRsPuchOdrJob   INTO recTRsPuchOdrJob;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTRsPuchOdrJob;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTRsPuchOdrJob%ISOPEN = TRUE THEN
          CLOSE curTRsPuchOdrJob;
        END IF;
        RETURN FALSE;

    END SubFncTRsPuchOdrJobCsvWrite;

     /*-----------------------------------------------------------------
    'SubFncTAcptRsltJobCsvWrite
    '
    ' �C������  2014.12.30 �V�K�쐬
    '
    ' �@�\      : [�������](���ԏ��)�폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvcMrp_periodDate  MRP�i�ڏ��ێ�����('YYYYMM')
                  pvcPlant_Cd       �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : [�������] (���ԏ��)�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTAcptRsltJobCsvWrite  RETURN BOOLEAN IS

      CURSOR curTAcptRslt IS
        SELECT  PUCH_ODR_CD,         --�����ԍ�
        ACPT_NO,                     --�����
        ACPT_QTY,                    --�����
        ACPT_DATE,                   --�����
        UNIT_COST,                   --�P��
        UNIT_COST_TYP,               --�P���敪
        PROCESSING_COST,             --���H��
        MATERIAL_COST,               --�ޗ���
        OTHER_OVERHEADS,             --���̑��o��
        DISC_AMOUNT,                 --�l�����z
        PUCH_ODR_AMOUNT,             --������z
        ACPT_STS_TYP,                --�����ԋ敪
        DLV_CD,                      --�[�i���ԍ�
        PLANT_CD,                    --�H��R�[�h
        WH_CD,                       --����ꏊ
        ACPT_RSLT_COMMENT,           --������є��l
        INVOICE_CD,                  --�����ԍ�
        RATE_JUDGE_DATE,             --���[�g�����
        EXCH_RATE,                   --�בփ��[�g
        TAX_RATE_1,                  --�ŗ�1
        TAX_RATE_2,                  --�ŗ�2
        TAX_RATE_3,                  --�ŗ�3
        NET_AMOUNT,                  --�{�̋��z
        TAX_AMOUNT_1,                --�Ŋz1
        TAX_AMOUNT_2,                --�Ŋz2
        TAX_AMOUNT_3,                --�Ŋz3
        AMOUNT_INCLUDE_TAX,          --�ō����z
        HOME_CUR_AMOUNT,             --�M�݋��z
        TAX_CD,                      --����ŃR�[�h
        TAX_ROUND_TYP,               --�Œ[���敪
        VEND_LOT_NO,                 --���[�J���b�g�ԍ�
        LOT_NO,                      --�݌Ƀ��b�g�ԍ�
        ACPT_CRCT_NO,                --���������
        CREATED_DATE,                --�쐬��
        CREATED_BY,                  --�쐬��
        CREATED_PRG_NM,              --�쐬�v���O������
        UPDATED_DATE,                --�X�V��
        UPDATED_BY,                  --�X�V��
        UPDATED_PRG_NM,              --�X�V�v���O������
        MODIFY_COUNT,                --�X�V��
        ITEM_CD,                     --�i�ڔԍ�
        NON_NO_ITEM_NAME,            --���i�����i�ږ�
        INSPC_WH_CD                  --�����҂��ۊǋ�
          FROM  T_ACPT_RSLT RSLT
                where exists(select PUCH_ODR_CD from  T_RLSD_PUCH_ODR RLSD
                                where exists(select 'x' from T_DEL_JOB_ODR_OD DEL, t_od OD
                                                   where OD.od_no              = RLSD.od_no
                                                     and DEL.job_odr_cd        = OD.job_odr_cd
                                                     and DEL.job_odr_detail_no = OD.job_odr_detail_no));
      recTAcptRslt curTAcptRslt%ROWTYPE;
    BEGIN
      OPEN curTAcptRslt();
      FETCH curTAcptRslt INTO recTAcptRslt;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTAcptRslt%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTAcptRsltJobName || SUBSTR(lvc2Mrp_period,1,4) ||SUBSTR(lvc2Mrp_period,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTAcptRslt.PUCH_ODR_CD || ',';                                 --�����ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ACPT_NO  || ',';                  --�����
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ACPT_QTY  || ',';                 --�����
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ACPT_DATE  || ',';                --�����
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.UNIT_COST  || ',';                --�P��
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.UNIT_COST_TYP  || ',';            --�P���敪
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.PROCESSING_COST || ',';           --���H��
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.MATERIAL_COST || ',';             --�ޗ���
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.OTHER_OVERHEADS || ',';           --���̑��o��
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.DISC_AMOUNT  || ',';              --�l�����z
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.PUCH_ODR_AMOUNT || ',';           --������z
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ACPT_STS_TYP || ',';              --�����ԋ敪
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.DLV_CD  || ',';                   --�[�i���ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.PLANT_CD  || ',';                 --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.WH_CD  || ',';                    --����ꏊ
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ACPT_RSLT_COMMENT  || ',';        --������є��l
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.INVOICE_CD  || ',';               --�����ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.RATE_JUDGE_DATE || ',';           --���[�g�����
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.EXCH_RATE  || ',';                --�בփ��[�g
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_RATE_1  || ',';               --�ŗ�1
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_RATE_2  || ',';               --�ŗ�2
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_RATE_3  || ',';               --�ŗ�3
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.NET_AMOUNT  || ',';               --�{�̋��z
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_AMOUNT_1  || ',';             --�Ŋz1
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_AMOUNT_2  || ',';             --�Ŋz2
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_AMOUNT_3  || ',';             --�Ŋz3
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.AMOUNT_INCLUDE_TAX || ',';        --�ō����z
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.HOME_CUR_AMOUNT || ',';           --�M�݋��z
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_CD  || ',';                   --����ŃR�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_ROUND_TYP || ',';             --�Œ[���敪
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.VEND_LOT_NO || ',';               --���[�J���b�g�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.LOT_NO   || ',';                  --�݌Ƀ��b�g�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ACPT_CRCT_NO  || ',';             --���������
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.CREATED_DATE || ',';              --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.CREATED_BY || ',';                --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.CREATED_PRG_NM || ',';            --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.UPDATED_DATE || ',';              --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.UPDATED_BY || ',';                --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.UPDATED_PRG_NM || ',';            --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.MODIFY_COUNT || ',';              --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ITEM_CD  || ',';                  --�i�ڔԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.NON_NO_ITEM_NAME || ',';          --���i�����i�ږ�
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.INSPC_WH_CD  || ',';              --�����҂��ۊǋ�
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;
        

        FETCH curTAcptRslt   INTO recTAcptRslt;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTAcptRslt;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTAcptRslt%ISOPEN = TRUE THEN
          CLOSE curTAcptRslt;
        END IF;

    END SubFncTAcptRsltJobCsvWrite;

 /*-----------------------------------------------------------------
    'SubFncTInspcRsltJobCsvWrite
    '
    ' �C������  2014.12.30 �V�K�쐬
    '
    ' �@�\      : [��������] (���ԏ��)�폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvcMrp_periodDate  MRP�i�ڏ��ێ�����('YYYYMM')
                  pvcPlant_Cd       �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : [��������] (���ԏ��)�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTInspcRsltJobCsvWrite RETURN BOOLEAN IS

      CURSOR curTInspcRslt IS
        SELECT  PUCH_ODR_CD,       --�����ԍ�
        ACPT_NO,                   --�����
        INSPECTED_QTY,             --�����ςݐ�
        ACCEPTED_QTY,              --���i��
        INSPEC_DATE,               --������
        PLANT_CD,                  --�H��R�[�h
        WH_CD,                     --����ꏊ
        INSPEC_RSLT_COMMENT,       --�������є��l
        VEND_LOT_NO,               --���[�J���b�g�ԍ�
        LOT_NO,                    --�݌Ƀ��b�g�ԍ�
        INSPC_CRCT_NO,             --����������
        CREATED_DATE,              --�쐬��
        CREATED_BY,                --�쐬��
        CREATED_PRG_NM,            --�쐬�v���O������
        UPDATED_DATE,              --�X�V��
        UPDATED_BY,                --�X�V��
        UPDATED_PRG_NM,            --�X�V�v���O������
        MODIFY_COUNT,              --�X�V��
        INSPC_WH_CD                --�����҂��ۊǋ�
          FROM  T_INSPC_RSLT RSLT
                where exists(select PUCH_ODR_CD from  T_RLSD_PUCH_ODR RLSD
                                where exists(select 'x' from T_DEL_JOB_ODR_OD DEL, t_od OD
                                                   where OD.od_no              = RLSD.od_no
                                                     and DEL.job_odr_cd        = OD.job_odr_cd
                                                     and DEL.job_odr_detail_no = OD.job_odr_detail_no));
      recTInspcRslt curTInspcRslt%ROWTYPE;
    BEGIN
      OPEN curTInspcRslt();
      FETCH curTInspcRslt INTO recTInspcRslt;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTInspcRslt%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTInspcRsltJobName || SUBSTR(lvc2Mrp_period,1,4) ||SUBSTR(lvc2Mrp_period,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTInspcRslt.PUCH_ODR_CD || ',';                                  --�����ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.ACPT_NO  || ',';                   --�����
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.INSPECTED_QTY || ',';              --�����ςݐ�
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.ACCEPTED_QTY  || ',';              --���i��
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.INSPEC_DATE  || ',';               --������
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.PLANT_CD  || ',';                  --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.WH_CD  || ',';                     --����ꏊ
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.INSPEC_RSLT_COMMENT  || ',';       --�������є��l
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.VEND_LOT_NO  || ',';               --���[�J���b�g�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.LOT_NO  || ',';                    --�݌Ƀ��b�g�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.INSPC_CRCT_NO  || ',';             --����������
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.CREATED_DATE || ',';               --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.CREATED_BY || ',';                 --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.CREATED_PRG_NM || ',';             --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.UPDATED_DATE || ',';               --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.UPDATED_BY || ',';                 --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.UPDATED_PRG_NM || ',';             --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.MODIFY_COUNT || ',';               --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.INSPC_WH_CD  || ',';               --�����҂��ۊǋ�
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;
        FETCH curTInspcRslt   INTO recTInspcRslt;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTInspcRslt;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTInspcRslt%ISOPEN = TRUE THEN
          CLOSE curTInspcRslt;
        END IF;

    END SubFncTInspcRsltJobCsvWrite;

     /*-----------------------------------------------------------------
    'SubFncTInspcDefectJobCsvWrite
    '
    ' �C������  2014.12.30�V�K�쐬
    '
    ' �@�\      : [�����s��] (���ԏ��)�폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvcMrp_periodDate  MRP�i�ڏ��ێ�����('YYYYMM')
                  pvcPlant_Cd       �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : [�����s��] (���ԏ��)�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTInspcDefectJobCsvWrite RETURN BOOLEAN IS

      CURSOR curTInspcDefect IS
        SELECT  PUCH_ODR_CD,       --�����ԍ�
        ACPT_NO,                   --�����
        DEFECT_CAUSE_CD,           --�����s�Ǘ��R�R�[�h
        PLANT_CD,                  --�H��R�[�h
        DEFECT_INSPC_QTY,          --�����s�ǐ�
        DEFECT_COMMENT,            --�����s�ǔ��l
        CREATED_DATE,              --�쐬��
        CREATED_BY,                --�쐬��
        CREATED_PRG_NM,            --�쐬�v���O������
        UPDATED_DATE,              --�X�V��
        UPDATED_BY,                --�X�V��
        UPDATED_PRG_NM,            --�X�V�v���O������
        MODIFY_COUNT               --�X�V��
          FROM  T_INSPC_DEFECT INSPC
                where exists(select PUCH_ODR_CD from  T_RLSD_PUCH_ODR RLSD
                                where exists(select 'x' from T_DEL_JOB_ODR_OD DEL, t_od OD
                                                   where OD.od_no              = RLSD.od_no
                                                     and DEL.job_odr_cd        = OD.job_odr_cd
                                                     and DEL.job_odr_detail_no = OD.job_odr_detail_no));
      recTInspcDefect curTInspcDefect%ROWTYPE;
    BEGIN
      OPEN curTInspcDefect();
      FETCH curTInspcDefect INTO recTInspcDefect;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTInspcDefect%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTInspcDefectJobName || SUBSTR(lvc2Mrp_period,1,4) ||SUBSTR(lvc2Mrp_period,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTInspcDefect.PUCH_ODR_CD || ',';                                  --�����ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.ACPT_NO  || ',';                   --�����
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.DEFECT_CAUSE_CD || ',';            --�����s�Ǘ��R�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.PLANT_CD  || ',';                  --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.DEFECT_INSPC_QTY  || ',';          --�����s�ǐ�
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.DEFECT_COMMENT  || ',';            --�����s�ǔ��l
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.CREATED_DATE || ',';               --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.CREATED_BY || ',';                 --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.CREATED_PRG_NM || ',';             --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.UPDATED_DATE || ',';               --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.UPDATED_BY || ',';                 --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.UPDATED_PRG_NM || ',';             --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.MODIFY_COUNT || ',';               --�X�V��
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTInspcDefect   INTO recTInspcDefect;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTInspcDefect;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTInspcDefect%ISOPEN = TRUE THEN
          CLOSE curTInspcDefect;
        END IF;

    END SubFncTInspcDefectJobCsvWrite;

         /*-----------------------------------------------------------------
    'SubFncTPInsAcptJobCsvWrite
    '
    ' �C������  2014.12.30 �V�K�쐬
    '
    ' �@�\      : [��������] (���ԏ��)�폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvcMrp_periodDate  MRP�i�ڏ��ێ�����('YYYYMM')
                  pvcPlant_Cd       �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : [��������] (���ԏ��)�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTPInsAcptJobCsvWrite  RETURN BOOLEAN IS

      CURSOR curTPastInspcAcpt IS
        SELECT  PUCH_ODR_CD,       --�����ԍ�
        ACPT_NO,                   --�����
        INSPC_ACPT_NO,             --�����ԍ�
        INSPC_ACPT_GNR_TYP,        --���������敪
        CRCT_NO,                   --������
        CRCT_TYP,                  --�����敪
        ITEM_CD,                   --�i�ڔԍ�
        ITEM_NAME,                 --�i�ږ�
        SLIP_TYP,                  --�`�[���
        WORK_IN_PROC_CD,           --�d�|��ƃR�[�h
        COMPANY_CD,                --��ЃR�[�h
        VEND_CD,                   --�����R�[�h
        PLANT_CD,                  --�H��R�[�h
        UNIT_COST,                 --�P��
        UNIT_COST_TYP,             --�P���敪
        PROCESSING_COST,           --���H��
        MATERIAL_COST,             --�ޗ���
        OTHER_OVERHEADS,           --���̑��o��
        ACPT_QTY,                  --�����
        INSPC_ACPT_QTY,            --������
        STOCK_UNIT,                --�v�ʒP��
        INSPC_ACPT_AMOUNT,         --�������z
        SAVING_AMOUNT,             --�l�����z
        ACPT_DATE,                 --�����
        INSPC_ACPT_DATE,           --������
        PRODUCT_TYP,               --���i�敪
        DLV_CD,                    --�[�i���ԍ�
        CREATED_DATE,              --�쐬��
        CREATED_BY,                --�쐬��
        CREATED_PRG_NM,            --�쐬�v���O������
        UPDATED_DATE,              --�X�V��
        UPDATED_BY,                --�X�V��
        UPDATED_PRG_NM,            --�X�V�v���O������
        MODIFY_COUNT               --�X�V��
          FROM  T_PAST_INSPC_ACPT ACPT
                where exists(select PUCH_ODR_CD from  T_RLSD_PUCH_ODR RLSD
                                where exists(select 'x' from T_DEL_JOB_ODR_OD DEL, t_od OD
                                                   where OD.od_no              = RLSD.od_no
                                                     and DEL.job_odr_cd        = OD.job_odr_cd
                                                     and DEL.job_odr_detail_no = OD.job_odr_detail_no));
      recTPastInspcAcpt curTPastInspcAcpt%ROWTYPE;
    BEGIN
      OPEN curTPastInspcAcpt();
      FETCH curTPastInspcAcpt INTO recTPastInspcAcpt;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTPastInspcAcpt%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTPastInspcAcptJobName || SUBSTR(lvc2Mrp_period,1,4) ||SUBSTR(lvc2Mrp_period,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTPastInspcAcpt.PUCH_ODR_CD || ',';                                  --�����ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.ACPT_NO  || ',';                   --�����
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.INSPC_ACPT_NO || ',';              --�����ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.INSPC_ACPT_GNR_TYP  || ',';        --���������敪
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.CRCT_NO  || ',';                   --������
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.CRCT_TYP  || ',';                  --�����敪
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.ITEM_CD  || ',';                   --�i�ڔԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.ITEM_NAME   || ',';                --�i�ږ�
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.SLIP_TYP   || ',';                 --�`�[���
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.WORK_IN_PROC_CD   || ',';          --�d�|��ƃR�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.COMPANY_CD   || ',';               --��ЃR�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.VEND_CD   || ',';                  --�����R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.PLANT_CD   || ',';                 --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.UNIT_COST   || ',';                --�P��
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.UNIT_COST_TYP   || ',';            --�P���敪
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.PROCESSING_COST   || ',';          --���H��
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.MATERIAL_COST   || ',';            --�ޗ���
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.OTHER_OVERHEADS   || ',';          --���̑��o��
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.ACPT_QTY   || ',';                 --�����
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.INSPC_ACPT_QTY   || ',';           --������
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.STOCK_UNIT   || ',';               --�v�ʒP��
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.INSPC_ACPT_AMOUNT || ',';          --�������z
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.SAVING_AMOUNT   || ',';            --�l�����z
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.ACPT_DATE    || ',';               --�����
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.INSPC_ACPT_DATE   || ',';          --������
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.PRODUCT_TYP   || ',';              --���i�敪
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.DLV_CD   || ',';                   --�[�i���ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.CREATED_DATE || ',';               --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.CREATED_BY || ',';                 --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.CREATED_PRG_NM || ',';             --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.UPDATED_DATE || ',';               --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.UPDATED_BY || ',';                 --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.UPDATED_PRG_NM || ',';             --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.MODIFY_COUNT || ',';               --�X�V��
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTPastInspcAcpt   INTO recTPastInspcAcpt;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTPastInspcAcpt;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTPastInspcAcpt%ISOPEN = TRUE THEN
          CLOSE curTPastInspcAcpt;
        END IF;

    END SubFncTPInsAcptJobCsvWrite;

    /*-----------------------------------------------------------------
    'SubFncTPastInspcJobCsvWrite
    '
    ' �C������  2014.12.30 �V�K�쐬
    '
    ' �@�\      : [�������z����] (���ԏ��)�폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvcMrp_periodDate  MRP�i�ڏ��ێ�����('YYYYMM')
                  pvcPlant_Cd       �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : [�������z����] (���ԏ��)�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTPastInspcJobCsvWrite RETURN BOOLEAN IS

      CURSOR curTPastInspcAcptAmount IS
        SELECT  PUCH_ODR_CD,       --�����ԍ�
        ACPT_NO,                   --�����
        INSPC_ACPT_NO,             --�����ԍ�
        CRCT_TYP,                  --�����敪
        CRCT_NO,                   --������
        ODR_CD,                    --�����ԍ�
        DETAIL_NO,                 --���הԍ�
        INVOICE_CD,                --�����ԍ�
        RATE_JUDGE_DATE,           --���[�g�����
        EXCH_RATE,                 --�בփ��[�g
        TAX_RATE_1,                --�ŗ�1
        TAX_RATE_2,                --�ŗ�2
        TAX_RATE_3,                --�ŗ�3
        NET_AMOUNT,                --�{�̋��z
        TAX_AMOUNT_1,              --�Ŋz1
        TAX_AMOUNT_2,              --�Ŋz2
        TAX_AMOUNT_3,              --�Ŋz3
        AMOUNT_INCLUDE_TAX,        --�ō����z
        HOME_CUR_AMOUNT,           --�M�݋��z
        CREATED_DATE,              --�쐬��
        CREATED_BY,                --�쐬��
        CREATED_PRG_NM,            --�쐬�v���O������
        UPDATED_DATE,              --�X�V��
        UPDATED_BY,                --�X�V��
        UPDATED_PRG_NM,            --�X�V�v���O������
        MODIFY_COUNT               --�X�V��
          FROM  T_PAST_INSPC_ACPT_AMOUNT AMOUNT
                where exists(select PUCH_ODR_CD from  T_RLSD_PUCH_ODR RLSD
                                where exists(select 'x' from T_DEL_JOB_ODR_OD DEL, t_od OD
                                                   where OD.od_no              = RLSD.od_no
                                                     and DEL.job_odr_cd        = OD.job_odr_cd
                                                     and DEL.job_odr_detail_no = OD.job_odr_detail_no));
      recTPastInspcAcptAmount curTPastInspcAcptAmount%ROWTYPE;
    BEGIN
      OPEN curTPastInspcAcptAmount();
      FETCH curTPastInspcAcptAmount INTO recTPastInspcAcptAmount;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTPastInspcAcptAmount%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTPastInspcAcptJobAmName || SUBSTR(lvc2Mrp_period,1,4) ||SUBSTR(lvc2Mrp_period,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTPastInspcAcptAmount.PUCH_ODR_CD || ',';                                  --�����ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.ACPT_NO  || ',';                   --�����
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.INSPC_ACPT_NO || ',';              --�����ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.CRCT_TYP  || ',';                  --�����敪
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.CRCT_NO  || ',';                   --������
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.ODR_CD   || ',';                   --�����ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.DETAIL_NO   || ',';                --���הԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.INVOICE_CD   || ',';               --�����ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.RATE_JUDGE_DATE   || ',';          --���[�g�����
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.EXCH_RATE   || ',';                --�בփ��[�g
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.TAX_RATE_1   || ',';               --�ŗ�1
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.TAX_RATE_2   || ',';               --�ŗ�2
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.TAX_RATE_3   || ',';               --�ŗ�3
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.NET_AMOUNT   || ',';               --�{�̋��z
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.TAX_AMOUNT_1   || ',';             --�Ŋz1
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.TAX_AMOUNT_2   || ',';             --�Ŋz2
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.TAX_AMOUNT_3   || ',';             --�Ŋz3
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.AMOUNT_INCLUDE_TAX   || ',';       --�ō����z
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.HOME_CUR_AMOUNT   || ',';          --�M�݋��z
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.CREATED_DATE || ',';               --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.CREATED_BY || ',';                 --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.CREATED_PRG_NM || ',';             --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.UPDATED_DATE || ',';               --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.UPDATED_BY || ',';                 --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.UPDATED_PRG_NM || ',';             --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.MODIFY_COUNT || ',';               --�X�V��
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTPastInspcAcptAmount   INTO recTPastInspcAcptAmount;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTPastInspcAcptAmount;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTPastInspcAcptAmount%ISOPEN = TRUE THEN
          CLOSE curTPastInspcAcptAmount;
        END IF;

    END SubFncTPastInspcJobCsvWrite;

 /*-----------------------------------------------------------------
    'SubFncTWkInPcByPrcJobCsvWrite
    '
    ' �C������  2010.11.23 �V�K�쐬
    '
    ' �@�\      : ��ƌn��ʎd�|�ް��폜(���ԏ��)�폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvcMrp_periodDate  MRP�i�ڏ��ێ�����('YYYYMM')
                  pvcPlant_Cd        �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : [��ƌn��ʎd�|] (�I�[�_���j�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTWkInPcByPrcJobCsvWrite  RETURN BOOLEAN IS

      CURSOR curTWorkInPcByPrcJob IS
        SELECT   WORK_ODR_CD,            --��ƌv��ԍ�
        WORK_IN_PROC_CD,        --�d�|��ƃR�[�h
        OD_NO,                    --�I�[�_�f�}���h�ԍ�
        PROC_NAME,                --�d�|��Ɩ�
        PROC_NO,                --�d�|��ƌn��ԍ�
        ITEM_CD,                --�i�ڔԍ�
        OUTSIDE_TYP,            --�d�|���O��敪
        WS_CD,                    --��Ƌ�R�[�h
        COMPANY_CD,                --��ЃR�[�h
        VEND_CD,                --�����R�[�h
        PLANT_CD,                --�H��R�[�h
        WORK_ODR_DLV_DATE,        --��ƌn��ʐ����[��
        OPR_INST_START_DATE,      --��ƌn��ʒ����
        OPR_INST_QTY,            --��Ǝw����
        UNIT_COST_TYP,            --�P���敪
        UNIT_COST,                --�P��
        PROCESSING_COST,        --���H��
        MATERIAL_COST,            --�ޗ���
        OTHER_OVERHEADS,        --���̑��o��
        PUCH_ODR_AMOUNT,        --�������z
        DISC_AMOUNT,            --�l�����z
        ACPT_INSPC_TYP,            --��ƌn���������敪
        WORK_STS_TYP,            --��ƌn��ʍ�Ə�ԋ敪
        FINAL_PROC_FLG,            --�ŏI�n��t���O
        OPR_INST_DATE,            --��ƌn��ʍ�Ǝw����
        WORK_CMPLT_DATE,        --��ƌn��ʎd�|������
        OPR_INST_CD,            --��Ǝw���ԍ�
        WORK_IN_PROC_COMMENT,      --��ƌn��ʎd�|���l
        WORKER_QTY,                --�v����
        CREATED_DATE,            --�쐬��
        CREATED_BY,                --�쐬��
        CREATED_PRG_NM,            --�쐬�v���O������
        UPDATED_DATE,            --�X�V��
        UPDATED_BY,                --�X�V��
        UPDATED_PRG_NM,            --�X�V�v���O������
        MODIFY_COUNT              --�X�V��
          FROM  T_WORK_IN_PROC_BY_PROC PROC
            where exists(select 'x' from T_DEL_JOB_ODR_OD DEL,
                                    t_od od
                        where OD.od_no              = PROC.od_no
                          and DEL.job_odr_cd        = OD.job_odr_cd
                          and DEL.job_odr_detail_no = OD.job_odr_detail_no
                          and DEL.job_odr_cancel_no = OD.job_odr_cancel_no);
      recTWorkInPcByPrcJob curTWorkInPcByPrcJob%ROWTYPE;
    BEGIN
      OPEN curTWorkInPcByPrcJob();
      FETCH curTWorkInPcByPrcJob INTO recTWorkInPcByPrcJob;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTWorkInPcByPrcJob%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTWkInPcByPrcJobName ||  SUBSTR(lvc2Mrp_period,1,4) ||SUBSTR(lvc2Mrp_period,6,2)  || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTWorkInPcByPrcJob.WORK_ODR_CD || ',';                                  --��ƌv��ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.WORK_IN_PROC_CD  || ',';          --�d�|��ƃR�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.OD_NO || ',';                      --�I�[�_�f�}���h�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.PROC_NAME  || ',';                  --�d�|��Ɩ�
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.PROC_NO  || ',';                  --�d�|��ƌn��ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.ITEM_CD  || ',';                  --�i�ڔԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.OUTSIDE_TYP  || ',';              --�d�|���O��敪
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.WS_CD  || ',';                      --��Ƌ�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.COMPANY_CD || ',';                 --��ЃR�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.VEND_CD || ',';                    --�����R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.PLANT_CD  || ',';                  --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.WORK_ODR_DLV_DATE|| ',';           --��ƌn��ʐ����[��
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.OPR_INST_START_DATE || ',';        --��ƌn��ʒ����
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.OPR_INST_QTY || ',';               --��Ǝw����
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.UNIT_COST_TYP  || ',';              --�P���敪
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.UNIT_COST || ',';                  --�P��
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.PROCESSING_COST || ',';            --���H��
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.MATERIAL_COST || ',';              --�ޗ���
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.OTHER_OVERHEADS || ',';            --���̑��o��
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.PUCH_ODR_AMOUNT || ',';            --�������z
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.DISC_AMOUNT  || ',';              --�l�����z
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.ACPT_INSPC_TYP || ',';             --��ƌn���������敪
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.WORK_STS_TYP || ',';               --��ƌn��ʍ�Ə�ԋ敪
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.FINAL_PROC_FLG || ',';             --�ŏI�n��t���O
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.OPR_INST_DATE || ',';              --��ƌn��ʍ�Ǝw����
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.WORK_CMPLT_DATE || ',';            --��ƌn��ʎd�|������
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.OPR_INST_CD || ',';                --��Ǝw���ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.WORK_IN_PROC_COMMENT || ',';       --��ƌn��ʎd�|���l
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.WORKER_QTY  || ',';              --�v����
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.CREATED_DATE || ',';               --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.CREATED_BY || ',';                 --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.CREATED_PRG_NM || ',';             --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.UPDATED_DATE || ',';               --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.UPDATED_BY || ',';                 --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.UPDATED_PRG_NM || ',';             --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.MODIFY_COUNT || ',';               --�X�V��
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTWorkInPcByPrcJob   INTO recTWorkInPcByPrcJob;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTWorkInPcByPrcJob;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTWorkInPcByPrcJob%ISOPEN = TRUE THEN
          CLOSE curTWorkInPcByPrcJob;
        END IF;
        RETURN FALSE;

    END SubFncTWkInPcByPrcJobCsvWrite;
/*-----------------------------------------------------------------
    'SubFncTWkInPcByItemJobCsvWrite
    '
    ' �C������  2010.11.23 �V�K�쐬
    '
    ' �@�\      : [�i�ڕʎd�|�ް�]�폜 (���ԏ��j�폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : 
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : [�i�ڕʎd�|�ް�] (���ԏ��j�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTWkInPcByItemJobCsvWrite RETURN BOOLEAN IS

      CURSOR curTWkInPcByItemJob IS
        SELECT   WORK_ODR_CD,              --��ƌv��ԍ�
        PLANT_CD,                  --�H��R�[�h
        OD_NO,                      --�I�[�_�f�}���h�ԍ�
        ITEM_CD,                  --�i�ڔԍ�
        WS_CD,                      --��Ƌ�R�[�h
        OPR_INST_START_DATE,        --��Ɛ��������
        WORK_ODR_DLV_DATE,          --��Ɛ����[��
        OPR_INST_QTY,              --��Ǝw����
        OPR_RSLT_TYP,              --�i�ڕʍ�Ǝ��ы敪
        WORK_STS_TYP,              --�i�ڕʍ�Ə�ԋ敪
        PROC_EXPLOSION_FLG,          --��ƌn��W�J�ς݃t���O
        OPR_INST_DATE,              --��Ǝw����
        WORK_CMPLT_DATE,          --��Ɗ�����
        OPR_INST_CD,              --��Ǝw���ԍ�
        WORK_IN_PROC_COMMENT,        --�i�ڕʎd�|���l
        CREATED_DATE,              --�쐬��
        CREATED_BY,                  --�쐬��
        CREATED_PRG_NM,              --�쐬�v���O������
        UPDATED_DATE,              --�X�V��
        UPDATED_BY,                  --�X�V��
        UPDATED_PRG_NM,              --�X�V�v���O������
        MODIFY_COUNT              --�X�V��
          FROM  T_WORK_IN_PROC_BY_ITEM PITEM
            where exists(select 'x' from T_DEL_JOB_ODR_OD DEL,
                                    t_od od
                        where OD.od_no = PITEM.od_no
                          and DEL.job_odr_cd        = OD.job_odr_cd
                          and DEL.job_odr_detail_no = OD.job_odr_detail_no
                          and DEL.job_odr_cancel_no = OD.job_odr_cancel_no);
      recTWkInPcByItemJob curTWkInPcByItemJob%ROWTYPE;
    BEGIN
      OPEN curTWkInPcByItemJob();
      FETCH curTWkInPcByItemJob INTO recTWkInPcByItemJob;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTWkInPcByItemJob%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTWkInPcByItemJobName ||  SUBSTR(lvc2Mrp_period,1,4) ||SUBSTR(lvc2Mrp_period,6,2)  || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTWkInPcByItemJob.WORK_ODR_CD || ',';                                  --��ƌv��ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.PLANT_CD  || ',';                   --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.OD_NO || ',';                      --�I�[�_�f�}���h�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.ITEM_CD  || ',';                   --�i�ڔԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.WS_CD  || ',';                   --��Ƌ�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.OPR_INST_START_DATE  || ',';       --��Ɛ��������
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.WORK_ODR_DLV_DATE  || ',';       --��Ɛ����[��
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.OPR_INST_QTY  || ',';               --��Ǝw����
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.OPR_RSLT_TYP || ',';               --�i�ڕʍ�Ǝ��ы敪
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.WORK_STS_TYP || ',';               --�i�ڕʍ�Ə�ԋ敪
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.PROC_EXPLOSION_FLG  || ',';       --��ƌn��W�J�ς݃t���O
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.OPR_INST_DATE|| ',';               --��Ǝw����
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.WORK_CMPLT_DATE || ',';            --��Ɗ�����
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.OPR_INST_CD || ',';                --��Ǝw���ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.WORK_IN_PROC_COMMENT  || ',';       --�i�ڕʎd�|���l
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.CREATED_DATE || ',';               --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.CREATED_BY || ',';                 --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.CREATED_PRG_NM || ',';             --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.UPDATED_DATE || ',';               --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.UPDATED_BY || ',';                 --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.UPDATED_PRG_NM || ',';             --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.MODIFY_COUNT || ',';               --�X�V��
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTWkInPcByItemJob   INTO recTWkInPcByItemJob;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTWkInPcByItemJob;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTWkInPcByItemJob%ISOPEN = TRUE THEN
          CLOSE curTWkInPcByItemJob;
        END IF;
        RETURN FALSE;

    END SubFncTWkInPcByItemJobCsvWrite;

 /*-----------------------------------------------------------------
    'SubFncTOprInstSlipItemCsvWrite
    '
    ' �C������  2010.11.23 �V�K�쐬
    '
    ' �@�\      :��Ǝw���`�[(�i�ڕʎd�|)�폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvcPlant_Cd      �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : ��Ǝw���`�[(�i�ڕʎd�|)�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTOprInstSlipItemCsvWrite(
       pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTOprInstSlipItem(
       vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  OPR_INST_CD,      --��Ǝw���ԍ�
        OPR_INST_CD_GNR_TYP,  --��Ǝw���ԍ������敪
        OPR_INST_SLIP_ISS_DATE,  --��Ǝw���`�[���s��
        OPR_INST_SLIP_ISS_FLG,  --��Ǝw���`�[���s�ς݃t���O
        PLANT_CD,        --�H��R�[�h
        CREATED_DATE,      --�쐬��
        CREATED_BY,        --�쐬��
        CREATED_PRG_NM,      --�쐬�v���O������
        UPDATED_DATE,      --�X�V��
        UPDATED_BY,        --�X�V��
        UPDATED_PRG_NM,      --�X�V�v���O������
        MODIFY_COUNT      --�X�V��
          FROM T_OPR_INST_SLIP SLIP
              where not exists (select opr_inst_cd from T_WORK_IN_PROC_BY_ITEM WIBI
                                          where SLIP.opr_inst_cd  = WIBI.opr_inst_cd)
               and opr_inst_cd_gnr_typ = 1
               and plant_CD = vcPlant_Cd;
      recTOprInstSlipItem curTOprInstSlipItem%ROWTYPE;
    BEGIN
      OPEN curTOprInstSlipItem(pvcPlant_Cd);
      FETCH curTOprInstSlipItem INTO recTOprInstSlipItem;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTOprInstSlipItem%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTOprInstSlipItemName ||  SUBSTR(lvc2Mrp_period,1,4) ||SUBSTR(lvc2Mrp_period,6,2)  || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTOprInstSlipItem.OPR_INST_CD || ',';                               --��Ǝw���ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipItem.OPR_INST_CD_GNR_TYP || ',';     --��Ǝw���ԍ������敪
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipItem.OPR_INST_SLIP_ISS_DATE || ',';  --��Ǝw���`�[���s��
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipItem.OPR_INST_SLIP_ISS_FLG  || ',';  --��Ǝw���`�[���s�ς݃t���O
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipItem.PLANT_CD  || ',';              --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipItem.CREATED_DATE || ',';            --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipItem.CREATED_BY || ',';            --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipItem.CREATED_PRG_NM  || ',';              --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipItem.UPDATED_DATE  || ',';          --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipItem.UPDATED_BY || ',';            --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipItem.UPDATED_PRG_NM  || ',';          --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipItem.MODIFY_COUNT || ',';            --�X�V��
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTOprInstSlipItem   INTO recTOprInstSlipItem;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTOprInstSlipItem;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTOprInstSlipItem%ISOPEN = TRUE THEN
          CLOSE curTOprInstSlipItem;
        END IF;
        RETURN FALSE;

    END SubFncTOprInstSlipItemCsvWrite;

    /*-----------------------------------------------------------------
    'SubFncTOprRsltSkcsvWrite
    '
    ' �C������  2014.12.19 �V�K�쐬
    '
    ' �@�\      : [��Ǝ���] (�i�ڕʎd�|�j�폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvcMrp_periodDate  MRP�i�ڏ��ێ�����('YYYYMM')
                  pvcPlant_Cd       �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : [��Ǝ���] (�i�ڕʎd�|�j�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTOprRsltSkcsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTOprRslt(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  OPR_INST_CD,        --��Ǝw���ԍ�
        PARTIAL_PRD_NO,             --�����
        ITEM_CD,                    --�i�ڔԍ�
        ACPT_QTY,                   --��Ǝ��їǕi��
        DEFECT_QTY,                 --��Ǝ��ѕs�ǐ�
        OPR_DATE,                   --��Ǝ��э�Ɠ�
        PLANT_CD,                   --�H��R�[�h
        WH_CD,                      --�ۊǋ�R�[�h
        WS_CD,                      --��Ƌ�R�[�h
        OPR_RSLT_PERSON,            --��Ǝ��э�Ǝ�
        OPR_RSLT_COMMENT,           --��Ǝ��є��l
        OPR_TIME_UNIT_TYP,          --��Ǝ��э�Ǝ��ԒP�ʋ敪
        PRE_ARRANGEMENT_TIME,       --��Ǝ��ёO�i�掞��
        POST_ARRANGEMENT_TIME,      --��Ǝ��ь�i�掞��
        OPR_TIME,                   --��Ǝ��э�Ǝ���
        CESSATION_TIME,             --��Ǝ��ђ�~����
        CESSATION_CAUSE,            --��Ǝ��ђ�~���R
        OUTPUT_RSLT_CD,             --�o�������єԍ�
        LOT_NO,                     --�݌Ƀ��b�g�ԍ�
        VEND_LOT_NO,                --���[�J���b�g�ԍ�
        OPR_CRCT_NO,                --��ƒ�����
        CREATED_DATE,               --�쐬��
        CREATED_BY,                 --�쐬��
        CREATED_PRG_NM,             --�쐬�v���O������
        UPDATED_DATE,               --�X�V��
        UPDATED_BY,                 --�X�V��
        UPDATED_PRG_NM,             --�X�V�v���O������
        MODIFY_COUNT                --�X�V��
          FROM  T_OPR_RSLT RSLT
                where exists (select 'x' from T_OPR_INST_SLIP SLIP
                                 where not exists (select opr_inst_cd from T_WORK_IN_PROC_BY_ITEM WIBI
                                                           where SLIP.opr_inst_cd  = WIBI.opr_inst_cd)
                                                               and SLIP.opr_inst_cd_gnr_typ = 1
                                                               and SLIP.plant_CD = vcPlant_Cd
                                                               and RSLT.OPR_INST_CD = SLIP.OPR_INST_CD);
      recTOprRslt curTOprRslt%ROWTYPE;
    BEGIN
      OPEN curTOprRslt(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTOprRslt INTO recTOprRslt;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTOprRslt%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTOprRsltSkName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTOprRslt.OPR_INST_CD || ',';                                  --��Ǝw���ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.PARTIAL_PRD_NO || ',';             --�����
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.ITEM_CD  || ',';                   --�i�ڔԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.ACPT_QTY  || ',';                  --��Ǝ��їǕi��
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.DEFECT_QTY  || ',';                --��Ǝ��ѕs�ǐ�
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.OPR_DATE  || ',';                  --��Ǝ��э�Ɠ�
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.PLANT_CD  || ',';                  --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.WH_CD  || ',';                     --�ۊǋ�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.WS_CD  || ',';                     --��Ƌ�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.OPR_RSLT_PERSON  || ',';           --��Ǝ��э�Ǝ�
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.OPR_RSLT_COMMENT  || ',';          --��Ǝ��є��l
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.OPR_TIME_UNIT_TYP  || ',';         --��Ǝ��э�Ǝ��ԒP�ʋ敪
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.PRE_ARRANGEMENT_TIME  || ',';      --��Ǝ��ёO�i�掞��
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.POST_ARRANGEMENT_TIME  || ',';     --��Ǝ��ь�i�掞��
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.OPR_TIME  || ',';                  --��Ǝ��э�Ǝ���
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.CESSATION_TIME  || ',';            --��Ǝ��ђ�~����
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.CESSATION_CAUSE  || ',';           --��Ǝ��ђ�~���R
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.OUTPUT_RSLT_CD  || ',';            --�o�������єԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.LOT_NO  || ',';                    --�݌Ƀ��b�g�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.VEND_LOT_NO  || ',';               --���[�J���b�g�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.OPR_CRCT_NO  || ',';               --��ƒ�����
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.CREATED_DATE || ',';               --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.CREATED_BY || ',';                 --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.CREATED_PRG_NM || ',';             --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.UPDATED_DATE || ',';               --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.UPDATED_BY || ',';                 --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.UPDATED_PRG_NM || ',';             --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.MODIFY_COUNT || ',';               --�X�V��
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTOprRslt   INTO recTOprRslt;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTOprRslt;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTOprRslt%ISOPEN = TRUE THEN
          CLOSE curTOprRslt;
        END IF;

    END SubFncTOprRsltSkcsvWrite;

     /*-----------------------------------------------------------------
    'SubFncTDefectSkcsvWrite
    '
    ' �C������  2014.12.19 �V�K�쐬
    '
    ' �@�\      : [��ƕs��] (�i�ڕʎd�|�j�폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvcMrp_periodDate  MRP�i�ڏ��ێ�����('YYYYMM')
                  pvcPlant_Cd       �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : [��ƕs��] (�i�ڕʎd�|�j�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTDefectSkcsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTDefect(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  OPR_INST_CD,        --��Ǝw���ԍ�
        PARTIAL_PRD_NO,             --�����
        DEFECT_CAUSE_CD,            --��ƕs�Ǘ��R�R�[�h
        PLANT_CD,                   --�H��R�[�h
        DEFECT_QTY,                 --��ƕs�ǐ�
        DEFECT_COMMENT,             --��ƕs�ǔ��l
        CREATED_DATE,               --�쐬��
        CREATED_BY,                 --�쐬��
        CREATED_PRG_NM,             --�쐬�v���O������
        UPDATED_DATE,               --�X�V��
        UPDATED_BY,                 --�X�V��
        UPDATED_PRG_NM,             --�X�V�v���O������
        MODIFY_COUNT                --�X�V��
          FROM  T_DEFECT DEFECT
                where exists (select 'x' from T_OPR_INST_SLIP SLIP
                                 where not exists (select opr_inst_cd from T_WORK_IN_PROC_BY_ITEM WIBI
                                                           where SLIP.opr_inst_cd  = WIBI.opr_inst_cd)
                                                               and SLIP.opr_inst_cd_gnr_typ = 1
                                                               and SLIP.plant_CD = vcPlant_Cd
                                                               and DEFECT.OPR_INST_CD = SLIP.OPR_INST_CD);
      recTDefect curTDefect%ROWTYPE;
    BEGIN
      OPEN curTDefect(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTDefect INTO recTDefect;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTDefect%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTDefectSkName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTDefect.OPR_INST_CD || ',';                                  --��Ǝw���ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.PARTIAL_PRD_NO || ',';             --�����
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.DEFECT_CAUSE_CD || ',';            --��ƕs�Ǘ��R�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.PLANT_CD || ',';                   --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.DEFECT_QTY || ',';                 --��ƕs�ǐ�
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.DEFECT_COMMENT || ',';             --��ƕs�ǔ��l
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.CREATED_DATE || ',';               --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.CREATED_BY || ',';                 --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.CREATED_PRG_NM || ',';             --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.UPDATED_DATE || ',';               --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.UPDATED_BY || ',';                 --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.UPDATED_PRG_NM || ',';             --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.MODIFY_COUNT || ',';               --�X�V��
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTDefect   INTO recTDefect;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTDefect;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTDefect%ISOPEN = TRUE THEN
          CLOSE curTDefect;
        END IF;

    END SubFncTDefectSkcsvWrite;

 /*-----------------------------------------------------------------
    'SubFncTOprInstSlipPrcCsvWrite
    '
    ' �C������  2010.11.23 �V�K�쐬
    '
    ' �@�\      :��Ǝw���`�[(�n��ʎd�|)�폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvcPlant_Cd      �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : ��Ǝw���`�[(�n��ʎd�|)�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTOprInstSlipPrcCsvWrite(
       pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTOprInstSlipPrc(
       vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  OPR_INST_CD,      --��Ǝw���ԍ�
        OPR_INST_CD_GNR_TYP,  --��Ǝw���ԍ������敪
        OPR_INST_SLIP_ISS_DATE,  --��Ǝw���`�[���s��
        OPR_INST_SLIP_ISS_FLG,  --��Ǝw���`�[���s�ς݃t���O
        PLANT_CD,        --�H��R�[�h
        CREATED_DATE,      --�쐬��
        CREATED_BY,        --�쐬��
        CREATED_PRG_NM,      --�쐬�v���O������
        UPDATED_DATE,      --�X�V��
        UPDATED_BY,        --�X�V��
        UPDATED_PRG_NM,      --�X�V�v���O������
        MODIFY_COUNT      --�X�V��
          FROM T_OPR_INST_SLIP SLIP
              where not exists (select opr_inst_cd from T_WORK_IN_PROC_BY_PROC WIBP
                                          where SLIP.opr_inst_cd  = WIBP.opr_inst_cd)
               and opr_inst_cd_gnr_typ = 2
               and plant_CD = vcPlant_Cd ;
      recTOprInstSlipPrc curTOprInstSlipPrc%ROWTYPE;
    BEGIN
      OPEN curTOprInstSlipPrc(pvcPlant_Cd);
      FETCH curTOprInstSlipPrc INTO recTOprInstSlipPrc;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTOprInstSlipPrc%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTOprInstSlipPrcName ||  SUBSTR(lvc2Mrp_period,1,4) ||SUBSTR(lvc2Mrp_period,6,2)  || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTOprInstSlipPrc.OPR_INST_CD || ',';                               --��Ǝw���ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipPrc.OPR_INST_CD_GNR_TYP || ',';     --��Ǝw���ԍ������敪
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipPrc.OPR_INST_SLIP_ISS_DATE || ',';  --��Ǝw���`�[���s��
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipPrc.OPR_INST_SLIP_ISS_FLG  || ',';  --��Ǝw���`�[���s�ς݃t���O
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipPrc.PLANT_CD  || ',';              --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipPrc.CREATED_DATE || ',';            --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipPrc.CREATED_BY || ',';            --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipPrc.CREATED_PRG_NM  || ',';              --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipPrc.UPDATED_DATE  || ',';          --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipPrc.UPDATED_BY || ',';            --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipPrc.UPDATED_PRG_NM  || ',';          --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipPrc.MODIFY_COUNT || ',';            --�X�V��
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTOprInstSlipPrc   INTO recTOprInstSlipPrc;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTOprInstSlipPrc;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTOprInstSlipPrc%ISOPEN = TRUE THEN
          CLOSE curTOprInstSlipPrc;
        END IF;
        RETURN FALSE;

    END SubFncTOprInstSlipPrcCsvWrite;

     /*-----------------------------------------------------------------
    'SubFncTOprRsltKecsvWrite
    '
    ' �C������  2014.12.19 �V�K�쐬
    '
    ' �@�\      : [��Ǝ���] (�n��ʎd�|�j�폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvcMrp_periodDate  MRP�i�ڏ��ێ�����('YYYYMM')
                  pvcPlant_Cd       �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : [��Ǝ���] (�n��ʎd�|�j�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTOprRsltKecsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTOprRslt(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  OPR_INST_CD,        --��Ǝw���ԍ�
        PARTIAL_PRD_NO,             --�����
        ITEM_CD,                    --�i�ڔԍ�
        ACPT_QTY,                   --��Ǝ��їǕi��
        DEFECT_QTY,                 --��Ǝ��ѕs�ǐ�
        OPR_DATE,                   --��Ǝ��э�Ɠ�
        PLANT_CD,                   --�H��R�[�h
        WH_CD,                      --�ۊǋ�R�[�h
        WS_CD,                      --��Ƌ�R�[�h
        OPR_RSLT_PERSON,            --��Ǝ��э�Ǝ�
        OPR_RSLT_COMMENT,           --��Ǝ��є��l
        OPR_TIME_UNIT_TYP,          --��Ǝ��э�Ǝ��ԒP�ʋ敪
        PRE_ARRANGEMENT_TIME,       --��Ǝ��ёO�i�掞��
        POST_ARRANGEMENT_TIME,      --��Ǝ��ь�i�掞��
        OPR_TIME,                   --��Ǝ��э�Ǝ���
        CESSATION_TIME,             --��Ǝ��ђ�~����
        CESSATION_CAUSE,            --��Ǝ��ђ�~���R
        OUTPUT_RSLT_CD,             --�o�������єԍ�
        LOT_NO,                     --�݌Ƀ��b�g�ԍ�
        VEND_LOT_NO,                --���[�J���b�g�ԍ�
        OPR_CRCT_NO,                --��ƒ�����
        CREATED_DATE,               --�쐬��
        CREATED_BY,                 --�쐬��
        CREATED_PRG_NM,             --�쐬�v���O������
        UPDATED_DATE,               --�X�V��
        UPDATED_BY,                 --�X�V��
        UPDATED_PRG_NM,             --�X�V�v���O������
        MODIFY_COUNT                --�X�V��
          FROM  T_OPR_RSLT RSLT
                where exists (select 'x' from T_OPR_INST_SLIP SLIP
                                 where not exists (select opr_inst_cd from T_WORK_IN_PROC_BY_PROC WIBP
                                                           where SLIP.opr_inst_cd  = WIBP.opr_inst_cd)
                                                               and SLIP.opr_inst_cd_gnr_typ = 2
                                                               and SLIP.plant_CD = vcPlant_Cd
                                                               and RSLT.OPR_INST_CD = SLIP.OPR_INST_CD);
      recTOprRslt curTOprRslt%ROWTYPE;
    BEGIN
      OPEN curTOprRslt(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTOprRslt INTO recTOprRslt;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTOprRslt%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTOprRsltKeName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTOprRslt.OPR_INST_CD || ',';                                  --��Ǝw���ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.PARTIAL_PRD_NO || ',';             --�����
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.ITEM_CD  || ',';                   --�i�ڔԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.ACPT_QTY  || ',';                  --��Ǝ��їǕi��
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.DEFECT_QTY  || ',';                --��Ǝ��ѕs�ǐ�
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.OPR_DATE  || ',';                  --��Ǝ��э�Ɠ�
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.PLANT_CD  || ',';                  --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.WH_CD  || ',';                     --�ۊǋ�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.WS_CD  || ',';                     --��Ƌ�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.OPR_RSLT_PERSON  || ',';           --��Ǝ��э�Ǝ�
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.OPR_RSLT_COMMENT  || ',';          --��Ǝ��є��l
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.OPR_TIME_UNIT_TYP  || ',';         --��Ǝ��э�Ǝ��ԒP�ʋ敪
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.PRE_ARRANGEMENT_TIME  || ',';      --��Ǝ��ёO�i�掞��
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.POST_ARRANGEMENT_TIME  || ',';     --��Ǝ��ь�i�掞��
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.OPR_TIME  || ',';                  --��Ǝ��э�Ǝ���
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.CESSATION_TIME  || ',';            --��Ǝ��ђ�~����
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.CESSATION_CAUSE  || ',';           --��Ǝ��ђ�~���R
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.OUTPUT_RSLT_CD  || ',';            --�o�������єԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.LOT_NO  || ',';                    --�݌Ƀ��b�g�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.VEND_LOT_NO  || ',';               --���[�J���b�g�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.OPR_CRCT_NO  || ',';               --��ƒ�����
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.CREATED_DATE || ',';               --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.CREATED_BY || ',';                 --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.CREATED_PRG_NM || ',';             --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.UPDATED_DATE || ',';               --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.UPDATED_BY || ',';                 --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.UPDATED_PRG_NM || ',';             --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.MODIFY_COUNT || ',';               --�X�V��
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTOprRslt   INTO recTOprRslt;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTOprRslt;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTOprRslt%ISOPEN = TRUE THEN
          CLOSE curTOprRslt;
        END IF;
        RETURN FALSE;

    END SubFncTOprRsltKecsvWrite;

     /*-----------------------------------------------------------------
    'SubFncTDefectKecsvWrite
    '
    ' �C������  2014.12.19 �V�K�쐬
    '
    ' �@�\      : [��ƕs��] (�n��ʎd�|�j�폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvcMrp_periodDate  MRP�i�ڏ��ێ�����('YYYYMM')
                  pvcPlant_Cd       �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : [��ƕs��] (�n��ʎd�|�j�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTDefectKecsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTDefect(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  OPR_INST_CD,        --��Ǝw���ԍ�
        PARTIAL_PRD_NO,             --�����
        DEFECT_CAUSE_CD,            --��ƕs�Ǘ��R�R�[�h
        PLANT_CD,                   --�H��R�[�h
        DEFECT_QTY,                 --��ƕs�ǐ�
        DEFECT_COMMENT,             --��ƕs�ǔ��l
        CREATED_DATE,               --�쐬��
        CREATED_BY,                 --�쐬��
        CREATED_PRG_NM,             --�쐬�v���O������
        UPDATED_DATE,               --�X�V��
        UPDATED_BY,                 --�X�V��
        UPDATED_PRG_NM,             --�X�V�v���O������
        MODIFY_COUNT                --�X�V��
          FROM  T_DEFECT DEFECT
                where exists (select 'x' from T_OPR_INST_SLIP SLIP
                                 where not exists (select opr_inst_cd from T_WORK_IN_PROC_BY_PROC WIBP
                                                           where SLIP.opr_inst_cd  = WIBP.opr_inst_cd)
                                                               and SLIP.opr_inst_cd_gnr_typ = 2
                                                               and SLIP.plant_CD = vcPlant_Cd
                                                               and DEFECT.OPR_INST_CD = SLIP.OPR_INST_CD);
      recTDefect curTDefect%ROWTYPE;
    BEGIN
      OPEN curTDefect(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTDefect INTO recTDefect;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTDefect%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTDefectKeName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTDefect.OPR_INST_CD || ',';                                  --��Ǝw���ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.PARTIAL_PRD_NO || ',';             --�����
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.DEFECT_CAUSE_CD || ',';            --��ƕs�Ǘ��R�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.PLANT_CD || ',';                   --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.DEFECT_QTY || ',';                 --��ƕs�ǐ�
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.DEFECT_COMMENT || ',';             --��ƕs�ǔ��l
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.CREATED_DATE || ',';               --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.CREATED_BY || ',';                 --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.CREATED_PRG_NM || ',';             --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.UPDATED_DATE || ',';               --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.UPDATED_BY || ',';                 --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.UPDATED_PRG_NM || ',';             --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.MODIFY_COUNT || ',';               --�X�V��
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTDefect   INTO recTDefect;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTDefect;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTDefect%ISOPEN = TRUE THEN
          CLOSE curTDefect;
        END IF;
        RETURN FALSE;

    END SubFncTDefectKecsvWrite;

/*-----------------------------------------------------------------
    'SubFncTJobOdrAlcCsvWrite
    '
    ' �C������  2010.11.23 �V�K�쐬
    '
    ' �@�\      : ���Ԉ����ް��폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : 
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : [���Ԉ����ް�] �폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTJobOdrAlcCsvWrite RETURN BOOLEAN IS
      CURSOR curTJobOdrAlc IS
        SELECT   JOB_ODR_ALC_CD,              --���Ԉ����Ǘ��ԍ�
        OD_NO,                      --�I�[�_�f�}���h�ԍ�
        PLANT_CD,                  --�H��R�[�h
        ITEM_CD,                  --�i�ڔԍ�
        ALC_STOCK_TYP,              --�����݌ɋ敪
        JOB_ODR_CD,                    --����
        JOB_ODR_DETAIL_NO,          --���Ԏ}��
        ALCD_QTY,                  --�����ςݐ�
        ISSUEED_QTY,              --�o�ɍςݐ�
        ISSUE_CMPLT_FLG,          --�o�Ɋ����t���O
        CREATED_DATE,              --�쐬��
        CREATED_BY,                  --�쐬��
        CREATED_PRG_NM,              --�쐬�v���O������
        UPDATED_DATE,              --�X�V��
        UPDATED_BY,                  --�X�V��
        UPDATED_PRG_NM,              --�X�V�v���O������
        MODIFY_COUNT              --�X�V��
          FROM  T_JOB_ODR_ALC ALC
            where exists(select 'x' from T_DEL_JOB_ODR_OD DEL,
                                         T_OD OD
                            where OD.OD_NO = ALC.OD_NO
                              and DEL.job_odr_cd        = OD.job_odr_cd
                              and DEL.job_odr_detail_no = OD.job_odr_detail_no
                              and DEL.job_odr_cancel_no = OD.job_odr_cancel_no);
      recTJobOdrAlc curTJobOdrAlc%ROWTYPE;
    BEGIN
      OPEN curTJobOdrAlc();
      FETCH curTJobOdrAlc INTO recTJobOdrAlc;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTJobOdrAlc%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTJobOdrAlcName ||  SUBSTR(lvc2Mrp_period,1,4) ||SUBSTR(lvc2Mrp_period,6,2)  || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTJobOdrAlc.JOB_ODR_ALC_CD || ',';                               --��ƌv��ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdrAlc.OD_NO || ',';                      --�I�[�_�f�}���h�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdrAlc.PLANT_CD  || ',';                --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdrAlc.ITEM_CD  || ',';                    --�i�ڔԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdrAlc.ALC_STOCK_TYP  || ',';            --�����݌ɋ敪
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdrAlc.JOB_ODR_CD  || ',';                --����
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdrAlc.JOB_ODR_DETAIL_NO  || ',';        --���Ԏ}��
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdrAlc.ALCD_QTY  || ',';                --�����ςݐ�
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdrAlc.ISSUEED_QTY || ',';                --�o�ɍςݐ�
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdrAlc.ISSUE_CMPLT_FLG || ',';            --�o�Ɋ����t���O
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdrAlc.CREATED_DATE || ',';               --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdrAlc.CREATED_BY || ',';                 --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdrAlc.CREATED_PRG_NM || ',';             --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdrAlc.UPDATED_DATE || ',';               --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdrAlc.UPDATED_BY || ',';                 --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdrAlc.UPDATED_PRG_NM || ',';             --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdrAlc.MODIFY_COUNT || ',';               --�X�V��
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTJobOdrAlc   INTO recTJobOdrAlc;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTJobOdrAlc;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTJobOdrAlc%ISOPEN = TRUE THEN
          CLOSE curTJobOdrAlc;
        END IF;
        RETURN FALSE;

    END SubFncTJobOdrAlcCsvWrite;
 /*-----------------------------------------------------------------
    'SubFncTOdJobCsvWrite
    '
    ' �C������  2010.11.23 �V�K�쐬
    '
    ' �@�\      : ���v��̧�ق̍폜�i���ԏ��)�폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : 
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : [���v��] (���ԏ��j�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTOdJobCsvWrite  RETURN BOOLEAN IS

      CURSOR curTOdJob IS
        SELECT  OD_NO,            --�I�[�_�f�}���h�ԍ�
        ALC_GRP_CD,        --�����O���[�v�R�[�h
        PLANT_CD,        --�H��R�[�h
        ITEM_CD,        --�i�ڔԍ�
        PS_EDITION,        --���v�ʕi�ڍ\���Ő�
        PATTERN_CD,        --�p�^�[���R�[�h
        JOB_ODR_CD,        --����
        JOB_ODR_DETAIL_NO,    --���Ԏ}��
        JOB_ODR_CANCEL_NO,    --���Ԏ�������ԍ�
        ODR_STS_TYP,      --�I�[�_��ԋ敪
        DM_STS_TYP,        --�f�}���h��ԋ敪
        OD_TYP,            --�I�[�_�f�}���h�敪
        DUE_DATE,        --�v���[��
        ODR_START_DATE,      --��z�����
        PRD_DUE_DATE,      --�����[��
        PRD_START_DATE,      --���������
        DM_QTY,            --�f�}���h��
        ODR_QTY,        --�I�[�_��
        MRP_ODR_TYP,      --�i�ڎ�z�敪
        OUTSIDE_TYP,      --���v�ʓ��O��敪
        ISSUE_TYP,        --���v�ʏo�ɋ敪
        ODR_LT,            --��z���[�h�^�C��
        FIXED_LT,        --�Œ蕪���[�h�^�C��
        PROP_LT,        --��ᕪ���[�h�^�C��
        SAFETY_LT,        --���S����
        ISSUE_LT,        --���o���[�h�^�C��
        PROP_LOT_SIZE,      --��ᕪ���b�g�T�C�Y
        PS_LT_FLG,        --���i�\�����[�h�^�C���g�p�t���O
        PS_FIXED_LT,      --���i�\���Œ蕪���[�h�^�C��
        PS_PROP_LT,        --���i�\����ᕪ���[�h�^�C��
        PS_PROP_LOT_SIZE,    --���i�\����ᕪ���b�g�T�C�Y
        PS_UNIT_QTY,      --���i�\���P�ʐ�
        PS_UNIT_DENOMINATOR,  --���i�\���P�ʐ�����
        PS_UNIT_NUMERATOR,    --���i�\���P�ʐ����q
        TOTAL_RCV_QTY,      --���ɗ݌v��
        RCV_CMPLT_DATE,      --���Ɋ�����
        TOTAL_ISSUE_INST_QTY,  --�o�Ɏw���݌v��
        TOTAL_ISSUE_QTY,    --�o�ɗ݌v��
        ISSUE_CMPLT_DATE,    --�o�Ɋ�����
        OD_GNR_TYP,        --���v�ʔ��������敪
        OD_LEVEL_NO,      --���v�ʃ��x���ԍ�
        PARENT_OD_NO,      --�e�I�[�_�f�}���h�ԍ�
        ITEM_SPOIL,        --���v�ʕi�ڎd����
        PS_SPOIL,        --���v�ʍ\���d����
        CONS_TYP,        --�\���x���敪
        EFF_PHASE_IN_DATE,    --���v�ʗL���J�n��
        EFF_PHASE_OUT_DATE,    --���v�ʗL���I����
        MRP_TYP,        --���v�ʏ����敪
        EXTERNAL_DM_FLG,    --�O���f�}���h�t���O
        ODR_RELEASE_FLG,    --�I�[�_�����σt���O
        DUE_DATE_TIME,      --�v���[������
        PRD_DUE_DATE_TIME,    --�����[������
        CREATED_DATE,      --�쐬��
        CREATED_BY,        --�쐬��
        CREATED_PRG_NM,      --�쐬�v���O������
        UPDATED_DATE,      --�X�V��
        UPDATED_BY,        --�X�V��
        UPDATED_PRG_NM,      --�X�V�v���O������
        MODIFY_COUNT      --�X�V��
        FROM T_OD OD
            where exists(select 'x' from T_DEL_JOB_ODR_OD DEL,
                                         T_OD OD2
                            where OD2.OD_NO = OD.OD_NO
                              and DEL.job_odr_cd        = OD2.job_odr_cd
                              and DEL.job_odr_detail_no = OD2.job_odr_detail_no
                              and DEL.job_odr_cancel_no = OD2.job_odr_cancel_no);
      recTOdJob  curTOdJob%ROWTYPE;
    BEGIN
      OPEN curTOdJob();
      FETCH curTOdJob INTO recTOdJob;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTOdJob%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTOdJobName ||  SUBSTR(lvc2Mrp_period,1,4) ||SUBSTR(lvc2Mrp_period,6,2)  || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTOdJob.OD_NO || ',';                                  --�I�[�_�f�}���h�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.ALC_GRP_CD  || ',';           --�����O���[�v�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.PLANT_CD || ',';             --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.ITEM_CD || ',';              --�i�ڔԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.PS_EDITION  || ',';           --���v�ʕi�ڍ\���Ő�
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.PATTERN_CD  || ',';           --�p�^�[���R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.JOB_ODR_CD  || ',';           --����
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.JOB_ODR_DETAIL_NO  || ',';   --���Ԏ}��
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.JOB_ODR_CANCEL_NO  || ',';   --���Ԏ�������ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.ODR_STS_TYP|| ',';           --�I�[�_��ԋ敪
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.DM_STS_TYP|| ',';            --�f�}���h��ԋ敪
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.OD_TYP  || ',';               --�I�[�_�f�}���h�敪
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.DUE_DATE|| ',';              --�v���[��
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.ODR_START_DATE || ',';       --��z�����
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.PRD_DUE_DATE || ',';         --�����[��
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.PRD_START_DATE  || ',';       --���������
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.DM_QTY || ',';               --�f�}���h��
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.ODR_QTY || ',';              --�I�[�_��
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.MRP_ODR_TYP || ',';          --�i�ڎ�z�敪
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.OUTSIDE_TYP || ',';          --���v�ʓ��O��敪
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.ISSUE_TYP || ',';            --���v�ʏo�ɋ敪
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.ODR_LT  || ',';               --��z���[�h�^�C��
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.FIXED_LT || ',';             --�Œ蕪���[�h�^�C��
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.PROP_LT || ',';              --��ᕪ���[�h�^�C��
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.SAFETY_LT || ',';            --���S����
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.ISSUE_LT || ',';             --���o���[�h�^�C��
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.PROP_LOT_SIZE || ',';        --��ᕪ���b�g�T�C�Y
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.PS_LT_FLG || ',';            --���i�\�����[�h�^�C���g�p�t���O
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.PS_FIXED_LT || ',';          --���i�\���Œ蕪���[�h�^�C��
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.PS_PROP_LT  || ',';           --���i�\����ᕪ���[�h�^�C��
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.PS_PROP_LOT_SIZE || ',';     --���i�\����ᕪ���b�g�T�C�Y
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.PS_UNIT_QTY || ',';          --���i�\���P�ʐ�
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.PS_UNIT_DENOMINATOR || ',';      --���i�\���P�ʐ�����
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.PS_UNIT_NUMERATOR  || ',';       --���i�\���P�ʐ����q
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.TOTAL_RCV_QTY || ',';        --���ɗ݌v��
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.RCV_CMPLT_DATE  || ',';       --���Ɋ�����
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.TOTAL_ISSUE_INST_QTY  || ',';       --�o�Ɏw���݌v��
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.TOTAL_ISSUE_QTY  || ',';       --�o�ɗ݌v��
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.ISSUE_CMPLT_DATE  || ',';       --�o�Ɋ�����
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.OD_GNR_TYP || ',';           --���v�ʔ��������敪
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.OD_LEVEL_NO || ',';          --���v�ʃ��x���ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.PARENT_OD_NO || ',';         --�e�I�[�_�f�}���h�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.ITEM_SPOIL  || ',';           --���v�ʕi�ڎd����
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.PS_SPOIL || ',';             --���v�ʍ\���d����
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.CONS_TYP || ',';             --�\���x���敪
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.EFF_PHASE_IN_DATE || ',';    --���v�ʗL���J�n��
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.EFF_PHASE_OUT_DATE  || ',';   --���v�ʗL���I����
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.MRP_TYP || ',';              --���v�ʏ����敪
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.EXTERNAL_DM_FLG || ',';      --�O���f�}���h�t���O
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.ODR_RELEASE_FLG || ',';      --�I�[�_�����σt���O
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.DUE_DATE_TIME || ',';        --�v���[������
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.PRD_DUE_DATE_TIME || ',';    --�����[������
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.CREATED_DATE || ',';         --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.PARENT_OD_NO || ',';         --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.CREATED_BY  || ',';           --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.CREATED_PRG_NM  || ',';       --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.UPDATED_DATE || ',';         --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.UPDATED_PRG_NM  || ',';       --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.MODIFY_COUNT || ',';         --�X�V��
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));

        numWorkCnt := numWorkCnt + 1;

        FETCH curTOdJob   INTO recTOdJob;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTOdJob;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTOdJob%ISOPEN = TRUE THEN
          CLOSE curTOdJob;
        END IF;
        RETURN FALSE;

    END SubFncTOdJobCsvWrite;
    
   /*-----------------------------------------------------------------
    'SubFncTOdAlarmJobCsvWrite
    '
    ' �C������  2014.12.30 �V�K�쐬
    '
    ' �@�\      : [���v�ʃA���[�����X�g] (���ԏ��j�폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvcMrp_periodDate  MRP�i�ڏ��ێ�����('YYYYMM')
                  pvcPlant_Cd       �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : [���v�ʃA���[�����X�g] (���ԏ��j�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTOdAlarmJobCsvWrite RETURN BOOLEAN IS

      CURSOR curTOdAlarm IS
        SELECT  OD_ALARM_NO,       --���v�ʃA���[�����X�g�ԍ�
        OD_NO,                     --�I�[�_�f�}���h�ԍ�
        PLANT_CD,                  --�H��R�[�h
        MRP_DATE,                  --������
        JOB_ODR_CD,                --����
        JOB_ODR_DETAIL_NO,         --���Ԏ}��
        MSG_NO,                    --���b�Z�[�W�ԍ�
        MSG,                       --���b�Z�[�W
        OD_ALARM_FLG,              --���v�ʃA���[�����X�g���s�ς݃t���O
        CREATED_DATE,              --�쐬��
        CREATED_BY,                --�쐬��
        CREATED_PRG_NM,            --�쐬�v���O������
        UPDATED_DATE,              --�X�V��
        UPDATED_BY,                --�X�V��
        UPDATED_PRG_NM,            --�X�V�v���O������
        MODIFY_COUNT               --�X�V��
          FROM  T_OD_ALARM ALARM
                where exists(select 'x' from  T_od OD1
                                where exists(select 'x' from T_DEL_JOB_ODR_OD DEL, T_OD OD2
                                     where OD2.OD_NO = OD1.OD_NO
                                         and DEL.job_odr_cd        = OD2.job_odr_cd
                                         and DEL.job_odr_detail_no = OD2.job_odr_detail_no
                                         and DEL.job_odr_cancel_no = OD2.job_odr_cancel_no));
      recTOdAlarm curTOdAlarm%ROWTYPE;
    BEGIN
      OPEN curTOdAlarm();
      FETCH curTOdAlarm INTO recTOdAlarm;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTOdAlarm%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTOdAlarmRJobName || SUBSTR(lvc2Mrp_period,1,4) ||SUBSTR(lvc2Mrp_period,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTOdAlarm.OD_ALARM_NO || ',';                                  --���v�ʃA���[�����X�g�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.OD_NO  || ',';                     --�I�[�_�f�}���h�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.PLANT_CD || ',';                   --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.MRP_DATE  || ',';                  --������
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.JOB_ODR_CD  || ',';                --����
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.JOB_ODR_DETAIL_NO  || ',';         --���Ԏ}��
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.MSG_NO  || ',';                    --���b�Z�[�W�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.MSG  || ',';                       --���b�Z�[�W
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.OD_ALARM_FLG  || ',';              --���v�ʃA���[�����X�g���s�ς݃t���O
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.CREATED_DATE || ',';               --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.CREATED_BY || ',';                 --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.CREATED_PRG_NM || ',';             --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.UPDATED_DATE || ',';               --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.UPDATED_BY || ',';                 --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.UPDATED_PRG_NM || ',';             --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.MODIFY_COUNT || ',';               --�X�V��
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTOdAlarm   INTO recTOdAlarm;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTOdAlarm;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTOdAlarm%ISOPEN = TRUE THEN
          CLOSE curTOdAlarm;
        END IF;
        RETURN FALSE;

    END SubFncTOdAlarmJobCsvWrite;

     /*-----------------------------------------------------------------
    'SubFncTMrpReexJobCsvWrite
    '
    ' �C������  2014.12.30 �V�K�쐬
    '
    ' �@�\      : [���v�ʍēW�J�˗�] (���ԏ��j�폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvcMrp_periodDate  MRP�i�ڏ��ێ�����('YYYYMM')
                  pvcPlant_Cd       �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : [���v�ʍēW�J�˗�] (���ԏ��j�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTMrpReexJobCsvWrite RETURN BOOLEAN IS

      CURSOR curTMrpReexplosion IS
        SELECT  OD_NO,             --�I�[�_�f�}���h�ԍ�
        PLANT_CD,                  --�H��R�[�h
        JOB_ODR_CD,                --����
        JOB_ODR_DETAIL_NO,         --���Ԏ}��
        JOB_ODR_CANCEL_NO,         --���Ԏ�������ԍ�
        OD_LEVEL_NO,               --���v�ʃ��x���ԍ�
        CREATED_DATE,              --�쐬��
        CREATED_BY,                --�쐬��
        CREATED_PRG_NM,            --�쐬�v���O������
        UPDATED_DATE,              --�X�V��
        UPDATED_BY,                --�X�V��
        UPDATED_PRG_NM,            --�X�V�v���O������
        MODIFY_COUNT               --�X�V��
          FROM  T_MRP_REEXPLOSION REE
                where exists(select 'x' from  T_od OD1
                                where exists(select 'x' from T_DEL_JOB_ODR_OD DEL, T_OD OD2
                                     where OD2.OD_NO = OD1.OD_NO
                                         and DEL.job_odr_cd        = OD2.job_odr_cd
                                         and DEL.job_odr_detail_no = OD2.job_odr_detail_no
                                         and DEL.job_odr_cancel_no = OD2.job_odr_cancel_no));
      recTMrpReexplosion curTMrpReexplosion%ROWTYPE;
    BEGIN
      OPEN curTMrpReexplosion();
      FETCH curTMrpReexplosion INTO recTMrpReexplosion;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTMrpReexplosion%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTMrpReexplosionJobName || SUBSTR(lvc2Mrp_period,1,4) ||SUBSTR(lvc2Mrp_period,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTMrpReexplosion.OD_NO || ',';                                        --�I�[�_�f�}���h�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.PLANT_CD || ',';                   --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.JOB_ODR_CD  || ',';                --����
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.JOB_ODR_DETAIL_NO  || ',';         --���Ԏ}��
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.JOB_ODR_CANCEL_NO  || ',';         --���Ԏ�������ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.OD_LEVEL_NO  || ',';               --���v�ʃ��x���ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.CREATED_DATE || ',';               --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.CREATED_BY || ',';                 --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.CREATED_PRG_NM || ',';             --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.UPDATED_DATE || ',';               --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.UPDATED_BY || ',';                 --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.UPDATED_PRG_NM || ',';             --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.MODIFY_COUNT || ',';               --�X�V��
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTMrpReexplosion   INTO recTMrpReexplosion;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTMrpReexplosion;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTMrpReexplosion%ISOPEN = TRUE THEN
          CLOSE curTMrpReexplosion;
        END IF;
        RETURN FALSE;

    END SubFncTMrpReexJobCsvWrite;
    
 /*-----------------------------------------------------------------
    'SubFncTRcvIssueSkCsvWrite
    '
    ' �C������  2010.11.23 �V�K�쐬
    '
    ' �@�\      : �ۊǋ�ʓ��o���ް��폜�i�v��O�A�ړ��ɂ����o�Ƀf�[�^�jCSV�t�@�C���o��
    '
    ' ������    : pvc2RcvIssue_period  �v��O���o�ɏ��ێ�����
                  pvcPlant_Cd      �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : �ۊǋ�ʓ��o���ް��폜�i�v��O�A�ړ��ɂ����o�Ƀf�[�^�j�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTRcvIssueSkCsvWrite(
       pvc2RcvIssue_period       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTRcvIssueSk(
         vc2RcvIssue_period       IN  VARCHAR2
        ,vcPlant_Cd             IN  VARCHAR2
      ) IS
        SELECT  RCV_ISSUE_CTRL_CD,        --���o�ɊǗ��ԍ�
        RCV_ISSUE_TYP,            --���o�ɋ敪
        ITEM_CD,                --�i�ڔԍ�
        PLANT_CD,                --�H��R�[�h
        WH_CD,                    --�ۊǋ�R�[�h
        JOB_ODR_CD,                --����
        JOB_ODR_DETAIL_NO,        --���Ԏ}��
        PUCH_ODR_CD,            --�����ԍ�
        ACPT_NO,                --�����
        ACPT_RSLT_CRCT_NO,        --������ђ�����
        INSPEC_RSLT_CRCT_NO,      --�������ђ�����
        WORK_ODR_CD,            --��ƌv��ԍ�
        WORK_IN_PROC_CD,        --�d�|��ƃR�[�h
        PARTIAL_PRD_NO,            --�����
        OPR_RSLT_CRCT_NO,        --��Ǝ��ђ�����
        ISSUE_INST_CD,            --�o�Ɏw���ԍ�
        RCV_ISSUE_BEFORE_QTY,      --���o�ɑO�݌ɐ�
        RCV_ISSUE_QTY,            --���o�ɐ�
        RCV_ISSUE_AFTER_QTY,      --���o�Ɍ�݌ɐ�
        RCV_ISSUE_AMOUNT,        --���o�ɋ��z
        RCV_ISSUE_DATE,            --���o�ɔN����
        RCV_ISSUE_GNR_TYP,        --���o�ɔ����敪
        RCV_ISSUE_ODD_QTY,        --���o�ɒ[��
        DEFECT_CAUSE_CD,        --���o�ɕs�Ǘ��R�R�[�h
        STOCK_UPD_TYP,            --�݌ɍX�V�敪
        RCV_ISSUE_CMPLT_FLG,      --���o�Ɋ����t���O
        OD_NO,                    --�I�[�_�f�}���h�ԍ�
        LOT_NO,                    --�݌Ƀ��b�g�ԍ�
        VEND_LOT_NO,            --���[�J���b�g�ԍ�
        RCV_ISSUE_COMMENT,        --���o�ɔ��l
        COMPANY_CD,                --��ЃR�[�h
        VEND_CD,                --�����R�[�h
        CONS_TYP,                --�x���敪
        CONS_EXEC_DATE,            --�L���x�����ђ��o��
        CREATED_DATE,            --�쐬��
        CREATED_BY,                --�쐬��
        CREATED_PRG_NM,            --�쐬�v���O������
        UPDATED_DATE,            --�X�V��
        UPDATED_BY,                --�X�V��
        UPDATED_PRG_NM,            --�X�V�v���O������
        MODIFY_COUNT            --�X�V��
      FROM  T_RCV_ISSUE RCV
            where RCV.od_no is NULL
              and RCV.plant_CD = vcPlant_Cd     --A
              and RCV.rcv_issue_date <= to_date(vc2RcvIssue_period,'yyyy/mm/dd')
              and (RCV.stock_upd_typ = 2 or RCV.stock_upd_typ = 3);
      recTRcvIssueSk curTRcvIssueSk%ROWTYPE;
    BEGIN
      OPEN curTRcvIssueSk(pvc2RcvIssue_period,pvcPlant_Cd);
      FETCH curTRcvIssueSk INTO recTRcvIssueSk;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTRcvIssueSk%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTRcvIssueSkName || SUBSTR(pvc2RcvIssue_period,1,4) || SUBSTR(pvc2RcvIssue_period,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTRcvIssueSk.RCV_ISSUE_CTRL_CD || ',';                     --���o�ɊǗ��ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.RCV_ISSUE_TYP  || ',';    --���o�ɋ敪
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.ITEM_CD || ',';             --�i�ڔԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.PLANT_CD || ',';            --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.WH_CD  || ',';            --�ۊǋ�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.JOB_ODR_CD  || ',';        --����
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.JOB_ODR_DETAIL_NO  || ',';--���Ԏ}��
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.PUCH_ODR_CD  || ',';        --�����ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.ACPT_NO  || ',';            --�����
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.ACPT_RSLT_CRCT_NO|| ',';    --������ђ�����
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.INSPEC_RSLT_CRCT_NO|| ',';  --�������ђ�����
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.WORK_ODR_CD  || ',';        --��ƌv��ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.WORK_IN_PROC_CD|| ',';      --�d�|��ƃR�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.PARTIAL_PRD_NO || ',';      --�����
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.OPR_RSLT_CRCT_NO || ',';    --��Ǝ��ђ�����
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.ISSUE_INST_CD  || ',';    --�o�Ɏw���ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.RCV_ISSUE_BEFORE_QTY || ',';--���o�ɑO�݌ɐ�
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.RCV_ISSUE_QTY || ',';       --���o�ɐ�
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.RCV_ISSUE_AFTER_QTY || ','; --���o�Ɍ�݌ɐ�
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.RCV_ISSUE_AMOUNT || ',';    --���o�ɋ��z
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.RCV_ISSUE_DATE || ',';      --���o�ɔN����
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.RCV_ISSUE_GNR_TYP  || ',';--���o�ɔ����敪
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.RCV_ISSUE_ODD_QTY || ',';   --���o�ɒ[��
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.DEFECT_CAUSE_CD || ',';     --���o�ɕs�Ǘ��R�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.STOCK_UPD_TYP || ',';       --�݌ɍX�V�敪
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.RCV_ISSUE_CMPLT_FLG || ','; --���o�Ɋ����t���O
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.OD_NO || ',';               --�I�[�_�f�}���h�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.LOT_NO || ',';              --�݌Ƀ��b�g�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.VEND_LOT_NO || ',';         --���[�J���b�g�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.RCV_ISSUE_COMMENT  || ',';--���o�ɔ��l
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.COMPANY_CD || ',';          --��ЃR�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.VEND_CD || ',';             --�����R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.CONS_TYP || ',';            --�x���敪
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.CONS_EXEC_DATE  || ',';    --�L���x�����ђ��o��
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.CREATED_DATE || ',';        --�쐬�� 
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.CREATED_BY || ',';          --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.CREATED_PRG_NM  || ',';    --�쐬�v���O������ 
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.UPDATED_DATE  || ',';        --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.UPDATED_BY || ',';          --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.UPDATED_PRG_NM  || ',';    --�X�V�v���O������   
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.MODIFY_COUNT || ',';        --�X�V��
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTRcvIssueSk   INTO recTRcvIssueSk;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTRcvIssueSk;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTRcvIssueSk%ISOPEN = TRUE THEN
          CLOSE curTRcvIssueSk;
        END IF;
        RETURN FALSE;

    END SubFncTRcvIssueSkCsvWrite;
--20150807 ADD START BY SYSCOM
 /*-----------------------------------------------------------------
    'SubFucTRcvIssAiIfDataCsvWriter
    '
    ' �C������  2015.08.07 �V�K�쐬
    '
    ' �@�\      : ���o�ɕʉ�v�A�g���f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvc2RcvIssue_period  �v��O���o�ɏ��ێ�����
                  pvcPlant_Cd    �@�H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : (�v��O�A�ړ��ɂ����o�Ƀf�[�^�j�������s���A�擾�����f�[�^��CSV�o�͂��s�Ȃ��B
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFucTRcvIssAiIfDataCsvWriter(
       pvc2RcvIssue_period       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTRcvIssAiIfData(
        vc2RcvIssue_period       IN  VARCHAR2
        ,vcPlant_Cd             IN  VARCHAR2
      ) IS
        SELECT 
        ISSAID.RCV_ISSUE_CTRL_CD,         --���o�ɊǗ��ԍ�
        ISSAID.ACCT_CD,                   --�ȖڃR�[�h
        ISSAID.DEPT_CD,                   --���S����R�[�h
        ISSAID.PJ_CD,                     --�v���W�F�N�g�R�[�h
        ISSAID.SEG_CONTENTS1,             --�Z�O�����g1
        ISSAID.SEG_CONTENTS2,             --�Z�O�����g2
        ISSAID.SEG_CONTENTS3,             --�Z�O�����g3
        ISSAID.SEG_CONTENTS4,             --�Z�O�����g4
        ISSAID.IF_FLG,                    --�A�g�ς݃t���O
        ISSAID.IF_DATE,                   --�A�g����
        ISSAID.CREATED_DATE,              --�쐬��
        ISSAID.CREATED_BY,                --�쐬��
        ISSAID.CREATED_PRG_NM,            --�쐬�v���O������
        ISSAID.UPDATED_DATE,              --�X�V��
        ISSAID.UPDATED_BY,                --�X�V��
        ISSAID.UPDATED_PRG_NM,            --�X�V�v���O������
        ISSAID.MODIFY_COUNT               --�X�V��
          FROM T_RCV_ISSUE_AI_IF_DATA ISSAID,T_RCV_ISSUE RCV
           where
            ISSAID.rcv_issue_ctrl_cd = RCV.rcv_issue_ctrl_cd                    --[���o�ɕʉ�v�A�g���]."���o�ɊǗ��ԍ�"�� [�ۊǋ�ʓ��o��]."���o�ɊǗ��ԍ�"
            and RCV.od_no is null                                               --[�ۊǋ�ʓ��o��]."�I�[�_�f�}���h�ԍ�" �� NULL 
            and RCV.plant_cd = vcPlant_Cd                                       --[�ۊǋ�ʓ��o��]."�H��R�[�h" �� �w�肳�ꂽ�H��R�[�h
            and RCV.rcv_issue_date <= to_date(vc2RcvIssue_period,'yyyy/mm/dd')  --[�ۊǋ�ʓ��o��]."���o�ɔN����"  <��  �ϐ��u�v��O���o�ɏ��ێ����ԁv"
            and (RCV.stock_upd_typ = 2 OR RCV.stock_upd_typ = 3);               --[�ۊǋ�ʓ��o��]."�݌ɍX�V�敪" �� 2:�X�V�ς� OR 3: �X�V���s
      recTRcvIssAiIfData curTRcvIssAiIfData%ROWTYPE;
    BEGIN
      OPEN curTRcvIssAiIfData(pvc2RcvIssue_period,pvcPlant_Cd);
      FETCH curTRcvIssAiIfData INTO recTRcvIssAiIfData;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTRcvIssAiIfData%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTRcvIssAiIfDataName || SUBSTR(pvc2RcvIssue_period,1,4) ||SUBSTR(pvc2RcvIssue_period,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTRcvIssAiIfData.RCV_ISSUE_CTRL_CD || ',';                    --���o�ɊǗ��ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssAiIfData.ACCT_CD  || ',';           --�ȖڃR�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssAiIfData.DEPT_CD  || ',';           --���S����R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssAiIfData.PJ_CD  || ',';             --�v���W�F�N�g�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssAiIfData.SEG_CONTENTS1 || ',';      --�Z�O�����g1
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssAiIfData.SEG_CONTENTS2 || ',';      --�Z�O�����g2
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssAiIfData.SEG_CONTENTS3  || ',';     --�Z�O�����g3
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssAiIfData.SEG_CONTENTS4  || ',';     --�Z�O�����g4
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssAiIfData.IF_FLG || ',';             --�A�g�ς݃t���O
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssAiIfData.IF_DATE  || ',';           --�A�g����
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssAiIfData.CREATED_DATE  || ',';      --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssAiIfData.CREATED_BY  || ',';        --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssAiIfData.CREATED_PRG_NM  || ',';    --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssAiIfData.UPDATED_DATE  || ',';      --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssAiIfData.UPDATED_BY  || ',';        --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssAiIfData.UPDATED_PRG_NM  || ',';    --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssAiIfData.MODIFY_COUNT || ',';       --�X�V��
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTRcvIssAiIfData   INTO recTRcvIssAiIfData;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTRcvIssAiIfData;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTRcvIssAiIfData%ISOPEN = TRUE THEN
          CLOSE curTRcvIssAiIfData;
        END IF;
        RETURN FALSE;
        
    END SubFucTRcvIssAiIfDataCsvWriter;
--20150807 ADD END BY SYSCOM
 /*-----------------------------------------------------------------
    'SubFncTRcvIssueItemSkCsvWrite
    '
    ' �C������  2015.06.16  �V�K�쐬
    '
    ' �@�\      : �i�ڕʓ��o���ް��폜�i�v��O�A�ړ��ɂ����o�Ƀf�[�^�jCSV�t�@�C���o��
    '
    ' ������    : pvc2RcvIssue_period  �v��O���o��TX���ێ�����
                  pvcPlant_Cd      �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : �i�ڕʓ��o���ް��폜�i�v��O�A�ړ��ɂ����o�Ƀf�[�^�j�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTRcvIssueItemSkCsvWrite(
       pvc2RcvIssue_period       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTRcvIssueItemSk(
         vc2RcvIssue_period       IN  VARCHAR2
        ,vcPlant_Cd             IN  VARCHAR2
      ) IS
        SELECT  ISSUE_ITEM.RCV_ISSUE_CTRL_CD,        --���o�ɊǗ��ԍ�
        ISSUE_ITEM.PLANT_CD,                         --�H��R�[�h
        ISSUE_ITEM.PRODUCT_TYP,                      --���i�敪
        ISSUE_ITEM.SBCNT_PUCH_TYP,                   --�O���w���i�敪
        ISSUE_ITEM.MRP_ODR_TYP,                      --�i�ڎ�z�敪
        ISSUE_ITEM.OUTSIDE_TYP,                      --���O��敪
        ISSUE_ITEM.PARENT_ITEM_CD,                   --�e�i�ڔԍ�
        ISSUE_ITEM.PARENT_JOB_ODR_CD,                --�e����
        ISSUE_ITEM.PARENT_JOB_ODR_DETAIL_NO,         --�e���Ԏ}��
        ISSUE_ITEM.CONS_TYP,                         --�x���敪
        ISSUE_ITEM.NON_PLANNED_CAUSE_CD,             --�v��O���R�R�[�h
        ISSUE_ITEM.CREATED_DATE,                     --�쐬��
        ISSUE_ITEM.CREATED_BY,                       --�쐬��
        ISSUE_ITEM.CREATED_PRG_NM,                   --�쐬�v���O������
        ISSUE_ITEM.UPDATED_DATE,                     --�X�V��
        ISSUE_ITEM.UPDATED_BY,                       --�X�V��
        ISSUE_ITEM.UPDATED_PRG_NM,                   --�X�V�v���O������
        ISSUE_ITEM.MODIFY_COUNT                      --�X�V��
      FROM  T_RCV_ISSUE_ITEM ISSUE_ITEM
                where exists(select RCV_ISSUE_CTRL_CD from T_RCV_ISSUE RCV , M_WH M
                             where RCV.od_no is NULL
                             and RCV.WH_CD = M.WH_CD      --�ۊǋ�R�[�h
                             and M.PLANT_CD = vcPlant_Cd   --�H��R�[�h
                             and RCV.rcv_issue_date <= to_date(vc2RcvIssue_period,'yyyy/mm/dd')
                             and (RCV.stock_upd_typ = 2 or RCV.stock_upd_typ = 3)
                             and ISSUE_ITEM.RCV_ISSUE_CTRL_CD = RCV.RCV_ISSUE_CTRL_CD);
                             
      recTRcvIssueItemSk curTRcvIssueItemSk%ROWTYPE;
    BEGIN
      OPEN curTRcvIssueItemSk(pvc2RcvIssue_period,pvcPlant_Cd);
      FETCH curTRcvIssueItemSk INTO recTRcvIssueItemSk;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTRcvIssueItemSk%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTRcvIssueItemSkName || SUBSTR(pvc2RcvIssue_period,1,4) || SUBSTR(pvc2RcvIssue_period,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTRcvIssueItemSk.RCV_ISSUE_CTRL_CD || ',';                           --���o�ɊǗ��ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemSk.PLANT_CD  || ',';                 --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemSk.PRODUCT_TYP || ',';               --���i�敪
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemSk.SBCNT_PUCH_TYP || ',';            --�O���w���i�敪
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemSk.MRP_ODR_TYP  || ',';              --�i�ڎ�z�敪
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemSk.OUTSIDE_TYP  || ',';              --���O��敪
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemSk.PARENT_ITEM_CD  || ',';           --�e�i�ڔԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemSk.PARENT_JOB_ODR_CD  || ',';        --�e����
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemSk.PARENT_JOB_ODR_DETAIL_NO  || ','; --�e���Ԏ}��
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemSk.CONS_TYP|| ',';                   --�x���敪
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemSk.NON_PLANNED_CAUSE_CD|| ',';       --�v��O���R�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemSk.CREATED_DATE || ',';              --�쐬�� 
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemSk.CREATED_BY || ',';                --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemSk.CREATED_PRG_NM  || ',';           --�쐬�v���O������ 
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemSk.UPDATED_DATE  || ',';             --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemSk.UPDATED_BY || ',';                --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemSk.UPDATED_PRG_NM  || ',';           --�X�V�v���O������   
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemSk.MODIFY_COUNT || ',';              --�X�V��
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTRcvIssueItemSk   INTO recTRcvIssueItemSk;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTRcvIssueItemSk;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTRcvIssueItemSk%ISOPEN = TRUE THEN
          CLOSE curTRcvIssueItemSk;
        END IF;
        RETURN FALSE;

    END SubFncTRcvIssueItemSkCsvWrite;
 /*-----------------------------------------------------------------
    'SubFncTRcvIssueMrpCsvWrite
    '
    ' �C������  2010.11.23 �V�K�쐬
    '
    ' �@�\      : �ۊǋ�ʓ��o���ް��폜�iMRP�i��,���ԏ��j CSV�t�@�C���o��
    '
    ' ������    : pvc2RcvIssue_period  �v��O���o�ɏ��ێ�����
                  pvcPlant_Cd      �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : �ۊǋ�ʓ��o���ް��폜�iMRP�i��,���ԏ��j�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTRcvIssueMrpCsvWrite(
       pvc2RcvIssue_period       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTRcvIssueMrp(
         vc2RcvIssue_period       IN  VARCHAR2
        ,vcPlant_Cd             IN  VARCHAR2
      ) IS
        SELECT  RCV_ISSUE_CTRL_CD,        --���o�ɊǗ��ԍ�
        RCV_ISSUE_TYP,            --���o�ɋ敪
        ITEM_CD,                --�i�ڔԍ�
        PLANT_CD,                --�H��R�[�h
        WH_CD,                    --�ۊǋ�R�[�h
        JOB_ODR_CD,                --����
        JOB_ODR_DETAIL_NO,        --���Ԏ}��
        PUCH_ODR_CD,            --�����ԍ�
        ACPT_NO,                --�����
        ACPT_RSLT_CRCT_NO,        --������ђ�����
        INSPEC_RSLT_CRCT_NO,      --�������ђ�����
        WORK_ODR_CD,            --��ƌv��ԍ�
        WORK_IN_PROC_CD,        --�d�|��ƃR�[�h
        PARTIAL_PRD_NO,            --�����
        OPR_RSLT_CRCT_NO,        --��Ǝ��ђ�����
        ISSUE_INST_CD,            --�o�Ɏw���ԍ�
        RCV_ISSUE_BEFORE_QTY,      --���o�ɑO�݌ɐ�
        RCV_ISSUE_QTY,            --���o�ɐ�
        RCV_ISSUE_AFTER_QTY,      --���o�Ɍ�݌ɐ�
        RCV_ISSUE_AMOUNT,        --���o�ɋ��z
        RCV_ISSUE_DATE,            --���o�ɔN����
        RCV_ISSUE_GNR_TYP,        --���o�ɔ����敪
        RCV_ISSUE_ODD_QTY,        --���o�ɒ[��
        DEFECT_CAUSE_CD,        --���o�ɕs�Ǘ��R�R�[�h
        STOCK_UPD_TYP,            --�݌ɍX�V�敪
        RCV_ISSUE_CMPLT_FLG,      --���o�Ɋ����t���O
        OD_NO,                    --�I�[�_�f�}���h�ԍ�
        LOT_NO,                    --�݌Ƀ��b�g�ԍ�
        VEND_LOT_NO,            --���[�J���b�g�ԍ�
        RCV_ISSUE_COMMENT,        --���o�ɔ��l
        COMPANY_CD,                --��ЃR�[�h
        VEND_CD,                --�����R�[�h
        CONS_TYP,                --�x���敪
        CONS_EXEC_DATE,            --�L���x�����ђ��o��
        CREATED_DATE,            --�쐬��
        CREATED_BY,                --�쐬��
        CREATED_PRG_NM,            --�쐬�v���O������
        UPDATED_DATE,            --�X�V��
        UPDATED_BY,                --�X�V��
        UPDATED_PRG_NM,            --�X�V�v���O������
        MODIFY_COUNT            --�X�V��
      FROM  T_RCV_ISSUE RCV
            where not exists( select od_no from T_OD where RCV.od_no = T_OD.od_no )
              and RCV.rcv_issue_date <= to_date(vc2RcvIssue_period,'yyyy/mm/dd')
              and RCV.plant_CD = vcPlant_Cd     --A
              and (RCV.stock_upd_typ = 2 or RCV.stock_upd_typ = 3);
      recTRcvIssueMrp curTRcvIssueMrp%ROWTYPE;
    BEGIN
      OPEN curTRcvIssueMrp(pvc2RcvIssue_period,pvcPlant_Cd);
      FETCH curTRcvIssueMrp INTO recTRcvIssueMrp;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTRcvIssueMrp%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTRcvIssueMrpName || SUBSTR(pvc2RcvIssue_period,1,4) || SUBSTR(pvc2RcvIssue_period,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTRcvIssueMrp.RCV_ISSUE_CTRL_CD || ',';                     --���o�ɊǗ��ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.RCV_ISSUE_TYP  || ',';    --���o�ɋ敪
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.ITEM_CD || ',';             --�i�ڔԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.PLANT_CD || ',';            --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.WH_CD  || ',';            --�ۊǋ�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.JOB_ODR_CD  || ',';        --����
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.JOB_ODR_DETAIL_NO  || ',';--���Ԏ}��
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.PUCH_ODR_CD  || ',';        --�����ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.ACPT_NO  || ',';            --�����
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.ACPT_RSLT_CRCT_NO|| ',';    --������ђ�����
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.INSPEC_RSLT_CRCT_NO|| ',';  --�������ђ�����
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.WORK_ODR_CD  || ',';        --��ƌv��ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.WORK_IN_PROC_CD|| ',';      --�d�|��ƃR�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.PARTIAL_PRD_NO || ',';      --�����
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.OPR_RSLT_CRCT_NO || ',';    --��Ǝ��ђ�����
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.ISSUE_INST_CD  || ',';    --�o�Ɏw���ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.RCV_ISSUE_BEFORE_QTY || ',';--���o�ɑO�݌ɐ�
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.RCV_ISSUE_QTY || ',';       --���o�ɐ�
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.RCV_ISSUE_AFTER_QTY || ','; --���o�Ɍ�݌ɐ�
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.RCV_ISSUE_AMOUNT || ',';    --���o�ɋ��z
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.RCV_ISSUE_DATE || ',';      --���o�ɔN����
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.RCV_ISSUE_GNR_TYP  || ',';--���o�ɔ����敪
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.RCV_ISSUE_ODD_QTY || ',';   --���o�ɒ[��
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.DEFECT_CAUSE_CD || ',';     --���o�ɕs�Ǘ��R�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.STOCK_UPD_TYP || ',';       --�݌ɍX�V�敪
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.RCV_ISSUE_CMPLT_FLG || ','; --���o�Ɋ����t���O
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.OD_NO || ',';               --�I�[�_�f�}���h�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.LOT_NO || ',';              --�݌Ƀ��b�g�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.VEND_LOT_NO || ',';         --���[�J���b�g�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.RCV_ISSUE_COMMENT  || ',';--���o�ɔ��l
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.COMPANY_CD || ',';          --��ЃR�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.VEND_CD || ',';             --�����R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.CONS_TYP || ',';            --�x���敪
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.CONS_EXEC_DATE  || ',';    --�L���x�����ђ��o��
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.CREATED_DATE || ',';        --�쐬�� 
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.CREATED_BY || ',';          --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.CREATED_PRG_NM  || ',';    --�쐬�v���O������ 
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.UPDATED_DATE  || ',';        --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.UPDATED_BY || ',';          --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.UPDATED_PRG_NM  || ',';    --�X�V�v���O������   
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.MODIFY_COUNT || ',';        --�X�V��
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTRcvIssueMrp   INTO recTRcvIssueMrp;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTRcvIssueMrp;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTRcvIssueMrp%ISOPEN = TRUE THEN
          CLOSE curTRcvIssueMrp;
        END IF;
        RETURN FALSE;

    END SubFncTRcvIssueMrpCsvWrite;
/*-----------------------------------------------------------------
    'SubFncTRcvIssueItemMrpCsvWrite
    '
    ' �C������  2015.06.16 �V�K�쐬
    '
    ' �@�\      : �i�ڕʓ��o���ް��폜�iMRP�i��,���ԏ��j CSV�t�@�C���o��
    '
    ' ������    : pvc2RcvIssue_period  �v��O���o��TX���ێ�����
                  pvcPlant_Cd      �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : �i�ڕʓ��o���ް��폜�iMRP�i��,���ԏ��j�폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTRcvIssueItemMrpCsvWrite(
       pvc2RcvIssue_period       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTRcvIssueItemMrp(
         vc2RcvIssue_period       IN  VARCHAR2
        ,vcPlant_Cd             IN  VARCHAR2
      ) IS
        SELECT  ISSUE_ITEM.RCV_ISSUE_CTRL_CD,        --���o�ɊǗ��ԍ�
        ISSUE_ITEM.PLANT_CD,                         --�H��R�[�h
        ISSUE_ITEM.PRODUCT_TYP,                      --���i�敪
        ISSUE_ITEM.SBCNT_PUCH_TYP,                   --�O���w���i�敪
        ISSUE_ITEM.MRP_ODR_TYP,                      --�i�ڎ�z�敪
        ISSUE_ITEM.OUTSIDE_TYP,                      --���O��敪
        ISSUE_ITEM.PARENT_ITEM_CD,                   --�e�i�ڔԍ�
        ISSUE_ITEM.PARENT_JOB_ODR_CD,                --�e����
        ISSUE_ITEM.PARENT_JOB_ODR_DETAIL_NO,         --�e���Ԏ}��
        ISSUE_ITEM.CONS_TYP,                         --�x���敪
        ISSUE_ITEM.NON_PLANNED_CAUSE_CD,             --�v��O���R�R�[�h
        ISSUE_ITEM.CREATED_DATE,                     --�쐬��
        ISSUE_ITEM.CREATED_BY,                       --�쐬��
        ISSUE_ITEM.CREATED_PRG_NM,                   --�쐬�v���O������
        ISSUE_ITEM.UPDATED_DATE,                     --�X�V��
        ISSUE_ITEM.UPDATED_BY,                       --�X�V��
        ISSUE_ITEM.UPDATED_PRG_NM,                   --�X�V�v���O������
        ISSUE_ITEM.MODIFY_COUNT                      --�X�V��
        FROM  T_RCV_ISSUE_ITEM ISSUE_ITEM
                where exists(select RCV_ISSUE_CTRL_CD from T_RCV_ISSUE RCV , M_WH M
                             where not exists( select od_no from T_OD where RCV.od_no = T_OD.od_no )
                             and RCV.rcv_issue_date <= to_date(vc2RcvIssue_period,'yyyy/mm/dd')
                             and RCV.WH_CD = M.WH_CD
                             and M.PLANT_CD = vcPlant_Cd
                             and (RCV.stock_upd_typ = 2 or RCV.stock_upd_typ = 3)
                             and ISSUE_ITEM.RCV_ISSUE_CTRL_CD = RCV.RCV_ISSUE_CTRL_CD);
              
      recTRcvIssueItemMrp curTRcvIssueItemMrp%ROWTYPE;
    BEGIN
      OPEN curTRcvIssueItemMrp(pvc2RcvIssue_period,pvcPlant_Cd);
      FETCH curTRcvIssueItemMrp INTO recTRcvIssueItemMrp;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTRcvIssueItemMrp%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTRcvIssueItemMrpName || SUBSTR(pvc2RcvIssue_period,1,4) || SUBSTR(pvc2RcvIssue_period,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTRcvIssueItemMrp.RCV_ISSUE_CTRL_CD || ',';                           --���o�ɊǗ��ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemMrp.PLANT_CD  || ',';                 --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemMrp.PRODUCT_TYP || ',';               --���i�敪
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemMrp.SBCNT_PUCH_TYP || ',';            --�O���w���i�敪
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemMrp.MRP_ODR_TYP  || ',';              --�i�ڎ�z�敪
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemMrp.OUTSIDE_TYP  || ',';              --���O��敪
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemMrp.PARENT_ITEM_CD  || ',';           --�e�i�ڔԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemMrp.PARENT_JOB_ODR_CD  || ',';        --�e����
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemMrp.PARENT_JOB_ODR_DETAIL_NO  || ','; --�e���Ԏ}��
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemMrp.CONS_TYP|| ',';                   --�x���敪
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemMrp.NON_PLANNED_CAUSE_CD|| ',';       --�v��O���R�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemMrp.CREATED_DATE || ',';              --�쐬�� 
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemMrp.CREATED_BY || ',';                --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemMrp.CREATED_PRG_NM  || ',';           --�쐬�v���O������ 
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemMrp.UPDATED_DATE  || ',';             --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemMrp.UPDATED_BY || ',';                --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemMrp.UPDATED_PRG_NM  || ',';           --�X�V�v���O������   
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemMrp.MODIFY_COUNT || ',';              --�X�V��
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTRcvIssueItemMrp   INTO recTRcvIssueItemMrp;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTRcvIssueItemMrp;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTRcvIssueItemMrp%ISOPEN = TRUE THEN
          CLOSE curTRcvIssueItemMrp;
        END IF;
        RETURN FALSE;

    END SubFncTRcvIssueItemMrpCsvWrite;
 /*-----------------------------------------------------------------
    'SubFncTItemStockCsvWrite
    '
    ' �C������  2010.11.23 �V�K�쐬
    '
    ' �@�\      :�ۊǋ�ʕi�ڍ݌��ް��폜 CSV�t�@�C���o��
    '
    ' ������    : pvc2WkDateTime  �݌ɏ��ێ�����
                  pvcPlant_Cd      �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : �ۊǋ�ʕi�ڍ݌ɍ폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTItemStockCsvWrite(
       pvc2WkDateTime       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTItemStock(
         vc2WkDateTime       IN  VARCHAR2
        ,vcPlant_Cd             IN  VARCHAR2
      ) IS
        SELECT  ITEM_CD,                --�i�ڔԍ�
        WH_CD,                    --�ۊǋ�R�[�h
        PLANT_CD,                --�H��R�[�h
        STOCK_ON_HAND_QTY,        --�i�ڕʎ莝�݌ɐ�
        DEFECT_QTY,                --�i�ڕʕs�ǐ�
        PRVS_DAYEND_STOCK_QTY,      --�i�ڕʑO�����݌ɐ�
        PRVS_MONTHEND_STOCK_QTY,    --�i�ڕʑO�����݌ɐ�
        PRVS_TERMEND_STOCK_QTY,      --�i�ڕʑO�����݌ɐ�
        ALCD_QTY,                --�i�ڕʈ����ϐ���
          CREATED_DATE,            --�쐬��
        CREATED_BY,                --�쐬��
        CREATED_PRG_NM,            --�쐬�v���O������
        UPDATED_DATE,            --�X�V��
        UPDATED_BY,                --�X�V��
        UPDATED_PRG_NM,            --�X�V�v���O������
        MODIFY_COUNT            --�X�V��
      FROM  T_ITEM_STOCK
            where stock_on_hand_qty = 0
              and UPDATED_DATE <= to_date(vc2WkDateTime,'yyyy/mm/dd HH24:MI:SS') --A
              and plant_CD = vcPlant_Cd     --A
              and defect_qty = 0;
      recTItemStock curTItemStock%ROWTYPE;
    BEGIN
      OPEN curTItemStock(pvc2WkDateTime,pvcPlant_Cd);
      FETCH curTItemStock INTO recTItemStock;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTItemStock%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTItemStockName || SUBSTR(pvc2WkDateTime,1,4) ||SUBSTR(pvc2WkDateTime,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTItemStock.ITEM_CD || ',';                                  --�i�ڔԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTItemStock.WH_CD  || ',';                --�ۊǋ�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTItemStock.PLANT_CD || ',';               --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTItemStock.STOCK_ON_HAND_QTY  || ',';    --�i�ڕʎ莝�݌ɐ�
        vc2WorkCsvData := vc2WorkCsvData || recTItemStock.DEFECT_QTY || ',';             --�i�ڕʕs�ǐ�
        vc2WorkCsvData := vc2WorkCsvData || recTItemStock.PRVS_DAYEND_STOCK_QTY  || ',';--�i�ڕʑO�����݌ɐ� 
        vc2WorkCsvData := vc2WorkCsvData || recTItemStock.PRVS_MONTHEND_STOCK_QTY  || ',';--�i�ڕʑO�����݌ɐ�
        vc2WorkCsvData := vc2WorkCsvData || recTItemStock.PRVS_TERMEND_STOCK_QTY  || ',';--�i�ڕʑO�����݌ɐ�
        vc2WorkCsvData := vc2WorkCsvData || recTItemStock.ALCD_QTY  || ',';            --�i�ڕʈ����ϐ���
        vc2WorkCsvData := vc2WorkCsvData || recTItemStock.CREATED_DATE || ',';           --�쐬�� 
        vc2WorkCsvData := vc2WorkCsvData || recTItemStock.CREATED_BY || ',';             --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTItemStock.CREATED_PRG_NM  || ',';        --�쐬�v���O������ 
        vc2WorkCsvData := vc2WorkCsvData || recTItemStock.UPDATED_DATE  || ',';        --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTItemStock.UPDATED_BY || ',';             --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTItemStock.UPDATED_PRG_NM  || ',';        --�X�V�v���O������   
        vc2WorkCsvData := vc2WorkCsvData || recTItemStock.MODIFY_COUNT || ',';           --�X�V��
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTItemStock  INTO recTItemStock;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTItemStock;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTItemStock%ISOPEN = TRUE THEN
          CLOSE curTItemStock;
        END IF;
        RETURN FALSE;

    END SubFncTItemStockCsvWrite;
 /*-----------------------------------------------------------------
    'SubFncTJobCdStockCsvWrite
    '
    ' �C������  2010.11.23 �V�K�쐬
    '
    ' �@�\      :�ۊǋ�ʐ��ԍ݌� CSV�t�@�C���o��
    '
    ' ������    : pvc2WkDateTime  �݌ɏ��ێ�����
                  pvcPlant_Cd      �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : �ۊǋ�ʐ��ԍ݌Ƀf�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTJobCdStockCsvWrite(
       pvc2WkDateTime       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTJobCdStock(
         vc2WkDateTime       IN  VARCHAR2
        ,vcPlant_Cd             IN  VARCHAR2
      ) IS
        SELECT  JOB_ODR_CD,                --����
        JOB_ODR_DETAIL_NO,        --���Ԏ}��
        ITEM_CD,                --�i�ڔԍ�
        WH_CD,                    --�ۊǋ�R�[�h
        PLANT_CD,                --�H��R�[�h
        STOCK_ON_HAND_QTY,          --���ԕʎ莝�݌ɐ�
        PRVS_DAYEND_STOCK_QTY,        --���ԕʑO�����݌ɐ�
        PRVS_MONTHEND_STOCK_QTY,    --���ԕʑO�����݌ɐ�
        PRVS_TERMEND_STOCK_QTY,      --���ԕʑO�����݌ɐ�
          CREATED_DATE,            --�쐬��
        CREATED_BY,                --�쐬��
        CREATED_PRG_NM,            --�쐬�v���O������
        UPDATED_DATE,            --�X�V��
        UPDATED_BY,                --�X�V��
        UPDATED_PRG_NM,            --�X�V�v���O������
        MODIFY_COUNT            --�X�V��
      FROM  T_JOB_ODR_CD_STOCK
            where stock_on_hand_qty = 0
              and plant_CD = vcPlant_Cd     --A
              and UPDATED_DATE <= to_date(vc2WkDateTime,'yyyy/mm/dd HH24:MI:SS'); --A
      recTJobCdStock curTJobCdStock%ROWTYPE;
    BEGIN
      OPEN curTJobCdStock(pvc2WkDateTime,pvcPlant_Cd);
      FETCH curTJobCdStock INTO recTJobCdStock;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTJobCdStock%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTJobCdStockName ||SUBSTR(pvc2WkDateTime,1,4) ||SUBSTR(pvc2WkDateTime,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTJobCdStock.JOB_ODR_CD || ',';                                  --����
        vc2WorkCsvData := vc2WorkCsvData || recTJobCdStock.JOB_ODR_DETAIL_NO  || ',';         --���Ԏ}��
        vc2WorkCsvData := vc2WorkCsvData || recTJobCdStock.ITEM_CD || ',';                   --�i�ڔԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTJobCdStock.WH_CD  || ',';                     --�ۊǋ�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTJobCdStock.PLANT_CD || ',';                  --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTJobCdStock.STOCK_ON_HAND_QTY  || ',';         --���ԕʎ莝�݌ɐ�
        vc2WorkCsvData := vc2WorkCsvData || recTJobCdStock.PRVS_DAYEND_STOCK_QTY  || ',';     --���ԕʑO�����݌ɐ�
        vc2WorkCsvData := vc2WorkCsvData || recTJobCdStock.PRVS_MONTHEND_STOCK_QTY  || ','; --���ԕʑO�����݌ɐ�
        vc2WorkCsvData := vc2WorkCsvData || recTJobCdStock.PRVS_TERMEND_STOCK_QTY  || ','; --���ԕʑO�����݌ɐ�
        vc2WorkCsvData := vc2WorkCsvData || recTJobCdStock.CREATED_DATE || ',';              --�쐬�� 
        vc2WorkCsvData := vc2WorkCsvData || recTJobCdStock.CREATED_BY || ',';                --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTJobCdStock.CREATED_PRG_NM  || ',';         --�쐬�v���O������ 
        vc2WorkCsvData := vc2WorkCsvData || recTJobCdStock.UPDATED_DATE  || ',';             --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTJobCdStock.UPDATED_BY || ',';                --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTJobCdStock.UPDATED_PRG_NM  || ',';         --�X�V�v���O������   
        vc2WorkCsvData := vc2WorkCsvData || recTJobCdStock.MODIFY_COUNT || ',';              --�X�V��
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTJobCdStock  INTO recTJobCdStock;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTJobCdStock;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTJobCdStock%ISOPEN = TRUE THEN
          CLOSE curTJobCdStock;
        END IF;
        RETURN FALSE;

    END SubFncTJobCdStockCsvWrite;
 /*-----------------------------------------------------------------
    'SubFncTJobOdrCsvWrite
    '
    ' �C������  2010.11.23 �V�K�쐬
    '
    ' �@�\      :���Ԍv�� CSV�t�@�C���o��
    '
    ' ������    : pvc2WkDateTime  �݌ɏ��ێ�����
                  pvcPlant_Cd      �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : �ۊǋ�ʐ��ԍ݌Ƀf�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTJobOdrCsvWrite(
         pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTJobOdr(
        vcPlant_Cd             IN  VARCHAR2
      ) IS
        SELECT  JOB_ODR_CD,                --����
        JOB_ODR_DETAIL_NO,        --���Ԏ}��
                JOB_ODR_CANCEL_NO,              --���Ԏ�������ԍ�
        PLANT_CD,                --�H��R�[�h
        ITEM_CD,                --�i�ڔԍ�
        JOB_ODR_TYP,            --���Ԏ��
        PLAN_TYP,                  --�v��^�C�v
        JOB_ODR_DLV_DATE,            --���Ԕ[��
        JOB_ODR_QTY,                --���Ԑ�
        ALC_GRP_CD,                  --�����O���[�v�R�[�h
        JOB_ODR_STS_TYP,          --���ԏ�ԋ敪
        JOB_ODR_EXP_TYP,           --���ԏ����敪
        JOB_ODR_DEL_FLG,          --���ԍ폜�t���O
          CREATED_DATE,            --�쐬��
        CREATED_BY,                --�쐬��
        CREATED_PRG_NM,            --�쐬�v���O������
        UPDATED_DATE,            --�X�V��
        UPDATED_BY,                --�X�V��
        UPDATED_PRG_NM,            --�X�V�v���O������
        MODIFY_COUNT,            --�X�V��
                JOB_ODR_INPUT_TYP               --���ԓ��͋敪
      FROM  T_JOB_ODR JOB
            where JOB.job_odr_sts_typ = 9                   --�ȉ�<���Ԍv��̒��o����>
            and plant_CD = pvc2PlantCd     --A
            and (   JOB.job_odr_cd,
                JOB.job_odr_detail_no,
                JOB.job_odr_cancel_no,
                JOB.item_cd) not in (   select  OD.job_odr_cd,
                                                OD.job_odr_detail_no,
                                                OD.job_odr_cancel_no,
                                                OD.item_cd
                                        from    t_od OD
                                        where   OD.job_odr_cd           = JOB.job_odr_cd
                                        and     OD.job_odr_detail_no    = JOB.job_odr_detail_no
                                        and     OD.job_odr_cancel_no    = JOB.job_odr_cancel_no
                                        and     OD.item_cd              = JOB.item_cd)
             and (   JOB.job_odr_cd,                         --�ȉ�<�ۊǋ�ʐ��ԍ݌ɂ̒��o����>
                JOB.job_odr_detail_no,
                JOB.item_cd) not in (   select  STOCK.job_odr_cd,
                                                STOCK.job_odr_detail_no,
                                                STOCK.item_cd
                                        from    T_JOB_ODR_CD_STOCK STOCK
                                        where   STOCK.job_odr_cd        = JOB.job_odr_cd
                                        and     STOCK.job_odr_detail_no = JOB.job_odr_detail_no
                                        and     STOCK.item_cd           = JOB.item_cd);
      recTJobOdr curTJobOdr%ROWTYPE;
    BEGIN
      OPEN curTJobOdr(pvcPlant_Cd);
      FETCH curTJobOdr INTO recTJobOdr;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTJobOdr%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTJobOdrName ||  SUBSTR(lvc2Mrp_period,1,4) ||SUBSTR(lvc2Mrp_period,6,2)  || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTJobOdr.JOB_ODR_CD || ',';                                 --����
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdr.JOB_ODR_DETAIL_NO  || ',';     --���Ԏ}��
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdr.JOB_ODR_CANCEL_NO || ',';        --���Ԏ�������ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdr.PLANT_CD || ',';                 --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdr.ITEM_CD || ',';                  --�i�ڔԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdr.JOB_ODR_TYP  || ',';             --���Ԏ��
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdr.PLAN_TYP  || ',';                 --�v��^�C�v
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdr.JOB_ODR_DLV_DATE  || ',';         --���Ԕ[��
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdr.JOB_ODR_QTY  || ',';             --���Ԑ�
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdr.ALC_GRP_CD  || ',';             --�����O���[�v�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdr.JOB_ODR_STS_TYP  || ',';         --���ԏ�ԋ敪
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdr.JOB_ODR_EXP_TYP  || ',';         --���ԏ����敪
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdr.JOB_ODR_DEL_FLG  || ',';         --���ԍ폜�t���O
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdr.CREATED_DATE || ',';             --�쐬�� 
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdr.CREATED_BY || ',';               --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdr.CREATED_PRG_NM  || ',';         --�쐬�v���O������ 
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdr.UPDATED_DATE  || ',';             --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdr.UPDATED_BY || ',';               --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdr.UPDATED_PRG_NM  || ',';         --�X�V�v���O������   
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdr.MODIFY_COUNT || ',';             --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdr.JOB_ODR_INPUT_TYP || ',';        --���ԓ��͋敪
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTJobOdr  INTO recTJobOdr;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTJobOdr;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTJobOdr%ISOPEN = TRUE THEN
          CLOSE curTJobOdr;
        END IF;
        RETURN FALSE;

    END SubFncTJobOdrCsvWrite;
 /*-----------------------------------------------------------------
    'SubFncTJobOdrCsvWrite
    '
    ' �C������  2010.11.23 �V�K�쐬
    '
    ' �@�\      :���v�ʌv�Z����(����) CSV�t�@�C���o��
    '
    ' ������    : pvcPlant_Cd      �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : ���v�ʌv�Z����(����)�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncSJobCalcCtrlCsvWrite(
         pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curSJobCalcCtrl(
        vcPlant_Cd             IN  VARCHAR2
      ) IS
        SELECT  PLANT_CD,                       --�H��R�[�h
                JOB_ODR_CD,                --����
        OD_CALC_FLG,            --���v�ʌv�Z���t���O
                OD_MNT_FLG,                     --���v�ʃ����e�i���X���t���O
          CREATED_DATE,            --�쐬��
        CREATED_BY,                --�쐬��
        CREATED_PRG_NM,            --�쐬�v���O������
        UPDATED_DATE,            --�X�V��
        UPDATED_BY,                --�X�V��
        UPDATED_PRG_NM,            --�X�V�v���O������
        MODIFY_COUNT            --�X�V��
      FROM  SYS_JOB_OD_CALC_CTRL JOB_CTRL
        where JOB_CTRL.PLANT_CD = vcPlant_Cd
        and (JOB_CTRL.JOB_ODR_CD) not in ( select JOB_OD.JOB_ODR_CD
                                                              from T_JOB_ODR JOB_OD
                                                              where JOB_OD.PLANT_CD = JOB_CTRL.PLANT_CD
                                                              AND JOB_OD.JOB_ODR_CD =JOB_CTRL.JOB_ODR_CD );
      recSJobCalcCtrl curSJobCalcCtrl%ROWTYPE;
    BEGIN
      OPEN curSJobCalcCtrl(pvcPlant_Cd);
      FETCH curSJobCalcCtrl INTO recSJobCalcCtrl;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curSJobCalcCtrl%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvSJobCalcCtrlName ||  SUBSTR(lvc2Mrp_period,1,4) ||SUBSTR(lvc2Mrp_period,6,2)  || '.CSV','W');
        END IF;
        vc2WorkCsvData := recSJobCalcCtrl.PLANT_CD || ',';                                   --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recSJobCalcCtrl.JOB_ODR_CD  || ',';             --����
        vc2WorkCsvData := vc2WorkCsvData || recSJobCalcCtrl.OD_CALC_FLG || ',';              --���v�ʌv�Z���t���O
        vc2WorkCsvData := vc2WorkCsvData || recSJobCalcCtrl.OD_MNT_FLG || ',';               --���v�ʃ����e�i���X���t���O
        vc2WorkCsvData := vc2WorkCsvData || recSJobCalcCtrl.CREATED_DATE || ',';             --�쐬�� 
        vc2WorkCsvData := vc2WorkCsvData || recSJobCalcCtrl.CREATED_BY || ',';               --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recSJobCalcCtrl.CREATED_PRG_NM  || ',';         --�쐬�v���O������ 
        vc2WorkCsvData := vc2WorkCsvData || recSJobCalcCtrl.UPDATED_DATE  || ',';             --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recSJobCalcCtrl.UPDATED_BY || ',';               --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recSJobCalcCtrl.UPDATED_PRG_NM  || ',';         --�X�V�v���O������   
        vc2WorkCsvData := vc2WorkCsvData || recSJobCalcCtrl.MODIFY_COUNT || ',';             --�X�V��
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curSJobCalcCtrl  INTO recSJobCalcCtrl;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curSJobCalcCtrl;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curSJobCalcCtrl%ISOPEN = TRUE THEN
          CLOSE curSJobCalcCtrl;
        END IF;
        RETURN FALSE;

    END SubFncSJobCalcCtrlCsvWrite;
 /*-----------------------------------------------------------------
    'SubFncTOutputRsltCsvWrite
    '
    ' �C������  2010.11.23 �V�K�쐬
    '
    ' �@�\      : �o�������э폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvcMrp_periodDate  MRP�i�ڏ��ێ�����('YYYYMM')
                  pvcPlant_Cd        �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : �o�������э폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTOutputRsltCsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTOutputRslt(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  OUTPUT_RSLT_CD,        --�o�������єԍ�
        ITEM_CD,            --�i�ڔԍ�
        ACPT_QTY,            --�o�������їǕi��
        DEFECT_QTY,            --�o�������ѕs�ǐ�
        DEFECT_CAUSE_CD,      --�o�������ѕs�Ǘ��R�R�[�h
        OPR_DATE,            --�o�������э�Ɠ�
        PLANT_CD,            --�H��R�[�h
        WH_CD,                --�ۊǋ�R�[�h
        WS_CD,                --��Ƌ�R�[�h
        OUTPUT_RSLT_PERSON,      --�o�������э�Ǝ�
        OUTPUT_RSLT_COMMENT,    --�o�������є��l
        OPR_TIME_UNIT_TYP,      --�o�������э�Ǝ��ԒP�ʋ敪
        PRE_ARRANGEMENT_TIME,    --�o�������ёO�i�掞��
        POST_ARRANGEMENT_TIME,    --�o�������ь�i�掞��
        OPR_TIME,            --�o�������э�Ǝ���
        CESSATION_TIME,        --�o�������ђ�~����
        CESSATION_CAUSE,      --�o�������ђ�~���R
        LOT_NO,                --�݌Ƀ��b�g�ԍ�
        VEND_LOT_NO,        --���[�J���b�g�ԍ�
        PATTERN_CD,             --�p�^�[���R�[�h
        CREATED_DATE,        --�쐬��
        CREATED_BY,            --�쐬��
        CREATED_PRG_NM,        --�쐬�v���O������
        UPDATED_DATE,        --�X�V��
        UPDATED_BY,            --�X�V��
        UPDATED_PRG_NM,        --�X�V�v���O������
        MODIFY_COUNT,        --�X�V��
        DEFECT_COMMENT        --�o�������ѕs�ǔ��l
          FROM  T_OUTPUT_RSLT
                where opr_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd')
                  and plant_CD = pvc2PlantCd;     --A
      recTOutputRslt curTOutputRslt%ROWTYPE;
    BEGIN
      OPEN curTOutputRslt(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTOutputRslt INTO recTOutputRslt;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTOutputRslt%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTOutputRsltName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTOutputRslt.OUTPUT_RSLT_CD || ',';                           --�o�������єԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.ITEM_CD  || ',';                --�i�ڔԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.ACPT_QTY || ',';               --�o�������їǕi��
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.DEFECT_QTY  || ',';            --�o�������ѕs�ǐ�
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.DEFECT_CAUSE_CD  || ',';        --�o�������ѕs�Ǘ��R�R�[
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.OPR_DATE  || ',';            --�o�������э�Ɠ�
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.PLANT_CD  || ',';            --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.WH_CD  || ',';                --�ۊǋ�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.WS_CD|| ',';                   --��Ƌ�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.OUTPUT_RSLT_PERSON|| ',';      --�o�������э�Ǝ�
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.OUTPUT_RSLT_COMMENT  || ',';    --�o�������є��l
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.OPR_TIME_UNIT_TYP|| ',';       --�o�������э�Ǝ��ԒP��
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.PRE_ARRANGEMENT_TIME || ',';   --�o�������ёO�i�掞��
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.POST_ARRANGEMENT_TIME || ',';  --�o�������ь�i�掞��
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.OPR_TIME  || ',';            --�o�������э�Ǝ���
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.CESSATION_TIME || ',';         --�o�������ђ�~����
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.CESSATION_CAUSE || ',';        --�o�������ђ�~���R
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.LOT_NO || ',';                 --�݌Ƀ��b�g�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.VEND_LOT_NO || ',';            --���[�J���b�g�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.PATTERN_CD || ',';             --�p�^�[���R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.CREATED_DATE || ',';           --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.CREATED_BY || ',';             --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.CREATED_PRG_NM || ',';         --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.UPDATED_DATE || ',';           --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.UPDATED_BY || ',';             --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.UPDATED_PRG_NM || ',';         --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.MODIFY_COUNT || ',';           --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.DEFECT_COMMENT || ',';         --�o�������ѕs�ǔ��l
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTOutputRslt   INTO recTOutputRslt;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTOutputRslt;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTOutputRslt%ISOPEN = TRUE THEN
          CLOSE curTOutputRslt;
        END IF;
        RETURN FALSE;

    END SubFncTOutputRsltCsvWrite;
 /*-----------------------------------------------------------------
    'SubFncTPOdrRnRsltCsvWrite
    '
    ' �C������  2010.11.23 �V�K�쐬
    '
    ' �@�\      : �w���i�ԕi�����ް��폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvc2PchOdRtnRst_period  �w���ԕi���ѕێ����� 
                  pvcPlant_Cd        �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : �o�������э폜�f�[�^CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTPOdrRnRsltCsvWrite(
       pvc2PchOdRtnRst_period       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTPOdrRnRslt(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  PUCH_ODR_CD,        --�w���ԕi�ԍ�
        COMPANY_CD,            --��ЃR�[�h
        VEND_CD,            --�����R�[�h
        PLANT_CD,              --�H��R�[�h
        ITEM_CD,            --�i�ڔԍ�
        JOB_ODR_CD,            --����
        JOB_ODR_DETAIL_NO,      --���Ԏ}��
        INV_CTRL_FLG,        --�݌ɊǗ��t���O
        PUCH_ODR_PERSON,      --�S���҃R�[�h
        PUCH_RTN_DATE,        --�ԕi��
        PUCH_RTN_QTY,        --�ԕi��
        WH_CD,                --�ԕi���ۊǋ�R�[�h
        LOT_NO,                --�݌Ƀ��b�g�ԍ�
        VEND_LOT_NO,        --���[�J���b�g�ԍ�
        UNIT_COST_TYP,        --�ԕi�P���敪
        UNIT_COST,            --�ԕi�P��
        PROCESSING_COST,      --���H��
        MATERIAL_COST,        --�ޗ���
        OTHER_OVERHEADS,      --���̑��o��
        PUCH_ODR_AMOUNT,      --�ԕi���z
        DISC_AMOUNT,        --�l�����z
        NET_AMOUNT,            --�{�̋��z
        PUCH_RTN_COMMENT,      --�ԕi���R�R�[�h
        RATE_JUDGE_DATE,      --���[�g�����
        EXCH_RATE,            --�בփ��[�g
        TAX_RATE_1,            --�ŗ�1
        TAX_RATE_2,            --�ŗ�2
        TAX_RATE_3,            --�ŗ�3
        TAX_AMOUNT_1,        --�Ŋz1
        TAX_AMOUNT_2,        --�Ŋz2
        TAX_AMOUNT_3,        --�Ŋz3
        AMOUNT_INCLUDE_TAX,      --�ō����z
        HOME_CUR_AMOUNT,      --�M�݋��z
        TAX_CD,                --����ŃR�[�h
        TAX_ROUND_TYP,        --�Œ[���敪
        RTN_DEL_FLG,        --�ԕi����t���O
        RTN_DEL_DATE,        --�ԕi�����
        NON_NO_ITEM_NAME,      --���i�i�ږ�
        NON_NO_ITEM_TYP,      --���i���i�敪
        NON_NO_ITEM_PUCH_ODR_UNIT,  --���i�P��
        CREATED_DATE,        --�쐬��
        CREATED_BY,            --�쐬��
        CREATED_PRG_NM,        --�쐬�v���O������
        UPDATED_DATE,        --�X�V��
        UPDATED_BY,            --�X�V��
        UPDATED_PRG_NM,        --�X�V�v���O������
        MODIFY_COUNT        --�X�V��
          FROM T_PUCH_ODR_RTN_RSLT
                where puch_rtn_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd')
                  and plant_CD = vcPlant_Cd;     --A
      recTPOdrRnRslt curTPOdrRnRslt%ROWTYPE;
    BEGIN
      OPEN curTPOdrRnRslt(pvc2PchOdRtnRst_period,pvcPlant_Cd);
      FETCH curTPOdrRnRslt INTO recTPOdrRnRslt;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTPOdrRnRslt%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTPOdrRnRsltName || SUBSTR(pvc2PchOdRtnRst_period,1,4) ||SUBSTR(pvc2PchOdRtnRst_period,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTPOdrRnRslt.PUCH_ODR_CD || ',';                          --�w���ԕi�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.COMPANY_CD  || ',';       --��ЃR�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.VEND_CD || ',';            --�����R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.PLANT_CD  || ',';           --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.ITEM_CD  || ',';           --�i�ڔԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.JOB_ODR_CD  || ',';       --����
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.JOB_ODR_DETAIL_NO  || ',';--���Ԏ}��
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.INV_CTRL_FLG  || ',';       --�݌ɊǗ��t���O
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.PUCH_ODR_PERSON|| ',';     --�S���҃R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.PUCH_RTN_DATE|| ',';       --�ԕi��
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.PUCH_RTN_QTY  || ',';       --�ԕi��
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.WH_CD|| ',';               --�ԕi���ۊǋ�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.LOT_NO || ',';             --�݌Ƀ��b�g�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.VEND_LOT_NO || ',';        --���[�J���b�g�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.UNIT_COST_TYP  || ',';   --�ԕi�P���敪
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.UNIT_COST || ',';          --�ԕi�P��
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.PROCESSING_COST || ',';    --���H��
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.MATERIAL_COST || ',';      --�ޗ���
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.OTHER_OVERHEADS  || ',';   --���̑��o��
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.PUCH_ODR_AMOUNT  || ',';   --�ԕi���z
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.DISC_AMOUNT|| ',';         --�l�����z
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.NET_AMOUNT|| ',';          --�{�̋��z
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.PUCH_RTN_COMMENT  || ',';   --�ԕi���R�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.RATE_JUDGE_DATE|| ',';     --���[�g�����
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.EXCH_RATE || ',';          --�בփ��[�g
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.TAX_RATE_1 || ',';         --�ŗ�1
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.TAX_RATE_2  || ',';       --�ŗ�2
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.TAX_RATE_3 || ',';         --�ŗ�3
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.TAX_AMOUNT_1 || ',';       --�Ŋz1
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.TAX_AMOUNT_2 || ',';       --�Ŋz2
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.TAX_AMOUNT_3 || ',';       --�Ŋz3
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.AMOUNT_INCLUDE_TAX || ','; --�ō����z
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.HOME_CUR_AMOUNT || ',';    --�M�݋��z
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.TAX_CD || ',';             --����ŃR�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.TAX_ROUND_TYP || ',';      --�Œ[���敪
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.RTN_DEL_FLG || ',';        --�ԕi����t���O
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.RTN_DEL_DATE || ',';       --�ԕi�����
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.NON_NO_ITEM_NAME || ',';   --���i�i�ږ�
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.NON_NO_ITEM_TYP || ',';    --���i���i�敪
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.NON_NO_ITEM_PUCH_ODR_UNIT || ',';  --���i�P��
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.CREATED_DATE || ',';           --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.CREATED_BY || ',';             --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.CREATED_PRG_NM || ',';         --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.UPDATED_DATE || ',';           --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.UPDATED_BY || ',';             --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.UPDATED_PRG_NM || ',';         --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.MODIFY_COUNT || ',';           --�X�V��

        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTPOdrRnRslt   INTO recTPOdrRnRslt;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTPOdrRnRslt;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTPOdrRnRslt%ISOPEN = TRUE THEN
          CLOSE curTPOdrRnRslt;
        END IF;
        RETURN FALSE;

    END SubFncTPOdrRnRsltCsvWrite;
 /*-----------------------------------------------------------------
    'SubFncTOdAlarmCsvWrite
    '
    ' �C������  2010.11.23 �V�K�쐬
    '
    ' �@�\      : ���v�ʱװ�ؽ��ް��폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvc2OdAlm_period  ���v�ʃA���[�����X�g�ێ����� 
                  pvcPlant_Cd        �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : ���v�ʱװ�ؽ��ް�CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTOdAlarmCsvWrite(
       pvc2OdAlm_period       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTOdAlarm(
        vc2OdAlm_period        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  OD_ALARM_NO,        --���v�ʃA���[�����X�g�ԍ�
        OD_NO,                --�I�[�_�f�}���h�ԍ�
        PLANT_CD,              --�H��R�[�h
        MRP_DATE,            --������
        JOB_ODR_CD,            --����
        JOB_ODR_DETAIL_NO,      --���Ԏ}��
        MSG_NO,                --���b�Z�[�W�ԍ�
        MSG,                  --���b�Z�[�W
        OD_ALARM_FLG,        --���v�ʃA���[�����X�g���s�ς݃t���O
        CREATED_DATE,        --�쐬��
        CREATED_BY,            --�쐬��
        CREATED_PRG_NM,        --�쐬�v���O������
        UPDATED_DATE,        --�X�V��
        UPDATED_BY,            --�X�V��
        UPDATED_PRG_NM,        --�X�V�v���O������
        MODIFY_COUNT        --�X�V��
          FROM T_OD_ALARM AL
            where AL.od_alarm_flg = 1
              and AL.plant_CD = vcPlant_Cd --A
              and AL.mrp_date <= to_date(vc2OdAlm_period,'yyyy/mm/dd');
      recTOdAlarm curTOdAlarm%ROWTYPE;
    BEGIN
      OPEN curTOdAlarm(pvc2OdAlm_period,pvcPlant_Cd);
      FETCH curTOdAlarm INTO recTOdAlarm;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTOdAlarm%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTOdAlarmName || SUBSTR(pvc2OdAlm_period,1,4) ||SUBSTR(pvc2OdAlm_period,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTOdAlarm.OD_ALARM_NO || ',';                              --���v�ʃA���[�����X�g�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.OD_NO  || ',';               --�I�[�_�f�}���h�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.PLANT_CD  || ',';               --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.MRP_DATE  || ',';               --������
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.JOB_ODR_CD  || ',';           --����
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.JOB_ODR_DETAIL_NO  || ',';   --���Ԏ}��
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.MSG_NO  || ',';               --���b�Z�[�W�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.MSG|| ',';                     --���b�Z�[�W
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.OD_ALARM_FLG|| ',';            --���v�ʃA���[�����X�g���s�ς݃t���O
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.CREATED_DATE || ',';           --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.CREATED_BY || ',';             --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.CREATED_PRG_NM || ',';         --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.UPDATED_DATE || ',';           --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.UPDATED_BY || ',';             --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.UPDATED_PRG_NM || ',';         --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.MODIFY_COUNT || ',';           --�X�V��

        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTOdAlarm   INTO recTOdAlarm;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTOdAlarm;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTOdAlarm%ISOPEN = TRUE THEN
          CLOSE curTOdAlarm;
        END IF;
        RETURN FALSE;

    END SubFncTOdAlarmCsvWrite;
 /*-----------------------------------------------------------------
    'SubFncSysMsgLogCsvWrite
    '
    ' �C������  2010.11.23 �V�K�쐬
    '
    ' �@�\      :�Ɩ�ү�����ް��폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvc2BusinessMsg_period  �Ɩ����b�Z�[�W���ێ����� 
                  pvcPlant_Cd        �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : �Ɩ�ү�����ް�CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncSysMsgLogCsvWrite(
       pvc2BusinessMsg_period       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curSysMsgLog(
        vc2BusinessMsg_period        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  LOG_CD,                --LOG���ʔԍ�
        PLANT_CD,              --�H��R�[�h
        BUSINESS_NAME,        --�Ɩ���
        MSG_CD,                --���b�Z�[�W�R�[�h
        MSG,                --���b�Z�[�W
        DATA_STRING,          --�f�[�^�X�g�����O
        CONFIRM_DATE,        --�m�F����
        CREATED_DATE,        --�쐬��
        CREATED_BY,            --�쐬��
        CREATED_PRG_NM,        --�쐬�v���O������
        UPDATED_DATE,        --�X�V��
        UPDATED_BY,            --�X�V��
        UPDATED_PRG_NM,        --�X�V�v���O������
        MODIFY_COUNT        --�X�V��
          FROM SYS_MSG_LOG
            where updated_date is not null
              and plant_CD = vcPlant_Cd --A
              and updated_date <= to_date(vc2BusinessMsg_period,'yyyy/mm/dd');
      recSysMsgLog curSysMsgLog%ROWTYPE;
    BEGIN
      OPEN curSysMsgLog(pvc2BusinessMsg_period,pvcPlant_Cd);
      FETCH curSysMsgLog INTO recSysMsgLog;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curSysMsgLog%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvSysMsgLogName || SUBSTR(pvc2BusinessMsg_period,1,4) || SUBSTR(pvc2BusinessMsg_period,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recSysMsgLog.LOG_CD || ',';                                   --LOG���ʔԍ�
        vc2WorkCsvData := vc2WorkCsvData || recSysMsgLog.PLANT_CD  || ',';            --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recSysMsgLog.BUSINESS_NAME  || ',';        --�Ɩ���
        vc2WorkCsvData := vc2WorkCsvData || recSysMsgLog.MSG_CD  || ',';                --���b�Z�[�W�R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recSysMsgLog.MSG  || ',';                    --���b�Z�[�W
        vc2WorkCsvData := vc2WorkCsvData || recSysMsgLog.DATA_STRING  || ',';            --�f�[�^�X�g�����O
        vc2WorkCsvData := vc2WorkCsvData || recSysMsgLog.CONFIRM_DATE  || ',';        --�m�F����
        vc2WorkCsvData := vc2WorkCsvData || recSysMsgLog.CREATED_DATE || ',';           --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recSysMsgLog.CREATED_BY || ',';             --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recSysMsgLog.CREATED_PRG_NM || ',';         --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recSysMsgLog.UPDATED_DATE || ',';           --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recSysMsgLog.UPDATED_BY || ',';             --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recSysMsgLog.UPDATED_PRG_NM || ',';         --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recSysMsgLog.MODIFY_COUNT || ',';           --�X�V��

        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curSysMsgLog   INTO recSysMsgLog;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curSysMsgLog;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curSysMsgLog%ISOPEN = TRUE THEN
          CLOSE curSysMsgLog;
        END IF;
        RETURN FALSE;

    END SubFncSysMsgLogCsvWrite;
/*-----------------------------------------------------------------
    'SubFncSysPsTCsvWrite
    '
    ' �C������  2010.11.23 �V�K�쐬
    '
    ' �@�\      :-���i�\���g�����U�N�V�����f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvc2ForPsT_period  ���i�\���g�����U�N�V�����ێ����� 
      ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : ���i�\���g�����U�N�V�����ް�CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncSysPsTCsvWrite(
       pvc2ForPsT_period       IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curSysPsT(
        vc2ForPsT_period        IN  VARCHAR2
      ) IS
        SELECT  SEQ_NO,                --SYS�V�[�P���V�����ԍ�
        PARENT_ITEM_CD,          --�e�i�ڔԍ�
        COMP_ITEM_CD,        --�q�i�ڔԍ�
        PS_EDITION,            --���i�\���Ő�
        ACCESS_TYP,            --�������@
        CMPLT_FLG,              --�����t���O
        CREATED_DATE,        --�쐬��
        CREATED_BY,            --�쐬��
        CREATED_PRG_NM,        --�쐬�v���O������
        UPDATED_DATE,        --�X�V��
        UPDATED_BY,            --�X�V��
        UPDATED_PRG_NM,        --�X�V�v���O������
        MODIFY_COUNT        --�X�V��
          FROM SYS_PS_T
            where UPDATED_DATE <= to_date(vc2ForPsT_period,'yyyy/mm/dd') --A
              and cmplt_flg = 1;
      recSysPsT curSysPsT%ROWTYPE;
    BEGIN
      OPEN curSysPsT(pvc2ForPsT_period);
      FETCH curSysPsT INTO recSysPsT;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curSysPsT%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvSysPsTName || SUBSTR(pvc2ForPsT_period,1,4) || SUBSTR(pvc2ForPsT_period,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recSysPsT.SEQ_NO || ',';                                   ---SYS�V�[�P���V�����ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recSysPsT.PARENT_ITEM_CD  || ',';         --�e�i�ڔԍ�
        vc2WorkCsvData := vc2WorkCsvData || recSysPsT.COMP_ITEM_CD  || ',';         --�q�i�ڔԍ�
        vc2WorkCsvData := vc2WorkCsvData || recSysPsT.PS_EDITION  || ',';             --���i�\���Ő�
        vc2WorkCsvData := vc2WorkCsvData || recSysPsT.ACCESS_TYP  || ',';             --�������@
        vc2WorkCsvData := vc2WorkCsvData || recSysPsT.CMPLT_FLG  || ',';             --�����t���O
        vc2WorkCsvData := vc2WorkCsvData || recSysPsT.CREATED_DATE || ',';           --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recSysPsT.CREATED_BY || ',';             --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recSysPsT.CREATED_PRG_NM || ',';         --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recSysPsT.UPDATED_DATE || ',';           --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recSysPsT.UPDATED_BY || ',';             --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recSysPsT.UPDATED_PRG_NM || ',';         --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recSysPsT.MODIFY_COUNT || ',';           --�X�V��

        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curSysPsT   INTO recSysPsT;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curSysPsT;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curSysPsT%ISOPEN = TRUE THEN
          CLOSE curSysPsT;
        END IF;
        RETURN FALSE;

    END SubFncSysPsTCsvWrite;
/*-----------------------------------------------------------------
    'SubFncTExtPlanCsvWrite
    '
    ' �C������  2010.11.23 �V�K�쐬
    '
    ' �@�\      :�O���v��폜�f�[�^CSV�t�@�C���o��
    '
    ' ������    : pvc2Mrp_period  MRP���ێ����� 
                  pvcPlant_Cd        �H��R�[�h
    ' �߂�l    : BOOLEAN           TRUE  = ����
    '                               FALSE = �ُ�
    ' �@�\����  : �Ɩ�ү�����ް�CSV�t�@�C���o�͂������Ȃ�
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTExtPlanCsvWrite(
       pvc2Mrp_period          IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTExtPlan(
        vc2Mrp_period           IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  EXTERNAL_PLAN_CD,      --�O���v��ԍ�
                OD_NO,                      --�I�[�_�f�}���h�ԍ�
        PLANT_CD,              --�H��R�[�h
        EXTERNAL_PLAN_REG_TYP,    --�O���v��o�^�敪
        EXTERNAL_PLAN_EXP_TYP,    --�O���v�揈���敪
        EXTERNAL_PLAN_DEL_FLG,    --�O���v��폜�t���O
        EXTERNAL_EXP_INDEX,      --�O���v��W�J�C���f�b�N�X
        EXTERNAL_LEVEL_NO,      --���΃��x���ԍ�
        CREATED_DATE,        --�쐬��
        CREATED_BY,            --�쐬��
        CREATED_PRG_NM,        --�쐬�v���O������
        UPDATED_DATE,        --�X�V��
        UPDATED_BY,            --�X�V��
        UPDATED_PRG_NM,        --�X�V�v���O������
        MODIFY_COUNT        --�X�V��
          FROM T_EXTERNAL_PLAN EP
                where not exists( select od_no from T_OD where EP.od_no = T_OD.od_no )
                  and UPDATED_DATE <= to_date(vc2Mrp_period,'yyyy/mm/dd')
                  and EXTERNAL_PLAN_EXP_TYP = 9
                  and plant_CD = vcPlant_Cd;
      recTExtPlan curTExtPlan%ROWTYPE;
    BEGIN
      OPEN curTExtPlan(pvc2Mrp_period,pvcPlant_Cd);
      FETCH curTExtPlan INTO recTExtPlan;
      /* CSV�쐬�p�J�E���g�ϐ��̏����� */
      numWorkCnt := 0;
      WHILE curTExtPlan%FOUND LOOP
        /* CSV�쐬����(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTExtPlanName || SUBSTR(pvc2Mrp_period,1,4) ||SUBSTR(pvc2Mrp_period,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTExtPlan.EXTERNAL_PLAN_CD || ',';                         --�O���v��ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTExtPlan.OD_NO  || ',';                 --�I�[�_�f�}���h�ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTExtPlan.PLANT_CD  || ',';             --�H��R�[�h
        vc2WorkCsvData := vc2WorkCsvData || recTExtPlan.EXTERNAL_PLAN_REG_TYP  || ','; --�O���v��o�^�敪
        vc2WorkCsvData := vc2WorkCsvData || recTExtPlan.EXTERNAL_PLAN_EXP_TYP  || ','; --�O���v�揈���敪
        vc2WorkCsvData := vc2WorkCsvData || recTExtPlan.EXTERNAL_PLAN_DEL_FLG  || ','; --�O���v��폜�t���O
        vc2WorkCsvData := vc2WorkCsvData || recTExtPlan.EXTERNAL_EXP_INDEX  || ',';     --�O���v��W�J�C���f�b�N�X
        vc2WorkCsvData := vc2WorkCsvData || recTExtPlan.EXTERNAL_LEVEL_NO  || ',';     --���΃��x���ԍ�
        vc2WorkCsvData := vc2WorkCsvData || recTExtPlan.CREATED_DATE || ',';           --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTExtPlan.CREATED_BY || ',';             --�쐬��
        vc2WorkCsvData := vc2WorkCsvData || recTExtPlan.CREATED_PRG_NM || ',';         --�쐬�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTExtPlan.UPDATED_DATE || ',';           --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTExtPlan.UPDATED_BY || ',';             --�X�V��
        vc2WorkCsvData := vc2WorkCsvData || recTExtPlan.UPDATED_PRG_NM || ',';         --�X�V�v���O������
        vc2WorkCsvData := vc2WorkCsvData || recTExtPlan.MODIFY_COUNT || ',';           --�X�V��

        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTExtPlan   INTO recTExtPlan;
      END LOOP;
      /* CSV�쐬����(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTExtPlan;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTExtPlan%ISOPEN = TRUE THEN
          CLOSE curTExtPlan;
        END IF;
        RETURN FALSE;

    END SubFncTExtPlanCsvWrite;
 /*-----------------------------------------------------------------
--<���C������ >-----------------------------------------------------*/
begin

--DBMS_OUTPUT.ENABLE(1000000);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �J�n ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
vc2RunChkComment := NULL;

    /* LogFile �� OPEN */

        LblnRet := FncLogOpen(pvc2OutputPath, pvc2OutputName, pvc2PlantCd, pvc2OutputMode, UTL_FileHandle); --A

    --//TraceLog�̏o��(Start)�������s��

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_START); --A

    --//�Ɩ��J�n�̃��b�Z�[�W�擾

    lvc2Comment := '�H��R�[�h�F[ '|| pvc2PlantCd ||' ]';--A
        LBlnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_START,'(SBM0374)' || LOGMSG_START_PGNM_DeleteProc || lvc2Comment); --A
        commit;

        --�s�d�l�o�t�@�C���̃f�[�^�폜
        delete from T_DEL_JOB_ODR_OD;

        commit;
    /*====================================================================================================*/
    /*                                                                                                    */
    /*  CSV�t�@�C���̏o�̓p�X���擾                                                                       */
    /*                                                                                                    */
    /*====================================================================================================*/
    BEGIN
       SELECT VALUE
         INTO CSV_FilePath
         FROM SYS_PARAMETER
       WHERE NAME = vc2DELETE_CSV_PATH;
    EXCEPTION
      WHEN NO_DATA_FOUND THEN
            vc2ErrCd     := APS_COM_CSV_PATH_NOT_FOUND;
            vc2ErrDetail := SUBSTR('SELECT [SYS_PARAMETER]:NAME = ' || vc2DELETE_CSV_PATH,1,256);
            RAISE excPARAMETER_ERR;
    END;
    IF(CSV_FilePath IS NULL OR CSV_FilePath='') THEN
            vc2ErrCd     := APS_COM_CSV_PATH_NOT_FOUND;
            vc2ErrDetail := SUBSTR('SELECT [SYS_PARAMETER]:NAME = ' || vc2DELETE_CSV_PATH,1,256);
            RAISE excPARAMETER_ERR;
    END IF;

/***********************
*    �ێ����Ԃ̎Z�o    *
************************/

--vc2RunChkComment := '���������ʉ� 00010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        select count(*) into llngMaxCount from sys_mnt_period where plant_CD = pvc2PlantCd; --A
        if llngMaxCount < 7 then
            /***********************************
            *�擾�������W���ȉ��Ȃ�G���[����  *
            *�װү���ނ��o�͂���               *
            ***********************************/
            RAISE excMaxcount;
        else
--vc2RunChkComment := '���������ʉ� 00020';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
        open cur_Sys_Mnt_Period(pvc2PlantCd);
        loop
            fetch   cur_Sys_Mnt_Period into ltypSys_Mnt_Period;
            exit when cur_Sys_Mnt_Period%notfound;

            if ltypSys_Mnt_Period.mnt_data_typ is null then
            /**************************************************
            *�擾�����ێ����敪null�ł���װү���ނ��o�͂���*
            **************************************************/
                RAISE excSys_Mnt_Period_NULL;
            else
            --���ێ����Ԃ̌v�Z
--vc2RunChkComment := '���������ʉ� 00030';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);



                if ltypSys_Mnt_Period.mnt_data_typ = 1 then
                    --MRP�i�ڏ��ێ�����
                    lvc2Mrp_period :=
                            to_char(add_months(to_date(pvcDeleteProcExecDate||'/01','yyyy/mm/dd'),-ltypSys_Mnt_Period.mnt_period)-1,'yyyy/mm/dd');
--vc2RunChkComment := '���������ʉ� 00040';
--DBMS_OUTPUT.PUT_LINE('MRP�i�ڏ��ێ�����'||lvc2Mrp_period);
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                elsif ltypSys_Mnt_Period.mnt_data_typ = 2 then
                    --���ԕi�ڕێ�����
                    lvc2JobOdr_period :=
                            to_char(add_months(to_date(pvcDeleteProcExecDate||'/01','yyyy/mm/dd'),-ltypSys_Mnt_Period.mnt_period)-1,'yyyy/mm/dd');
--vc2RunChkComment := '���������ʉ� 00050';
--DBMS_OUTPUT.PUT_LINE('���ԕi�ڕێ�����'||lvc2JobOdr_period);
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                elsif ltypSys_Mnt_Period.mnt_data_typ = 3 then
                    --���o�Ƀg�����U�N�V�������ێ����� --A
                    lvc2RcvIssue_period :=
                            to_char(add_months(to_date(pvcDeleteProcExecDate||'/01','yyyy/mm/dd'),-ltypSys_Mnt_Period.mnt_period)-1,'yyyy/mm/dd');
--vc2RunChkComment := '���������ʉ� 00060';
--DBMS_OUTPUT.PUT_LINE('���o�Ƀg�����U�N�V�������ێ�����'||lvc2RcvIssue_period); --A
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                elsif ltypSys_Mnt_Period.mnt_data_typ = 4 then
                    --�݌ɏ��ێ�����
                    lvc2Stock_period :=
                            to_char(add_months(to_date(pvcDeleteProcExecDate||'/01','yyyy/mm/dd'),-ltypSys_Mnt_Period.mnt_period)-1,'yyyy/mm/dd');
--vc2RunChkComment := '���������ʉ� 00070';
--DBMS_OUTPUT.PUT_LINE('�݌ɏ��ێ�����'||lvc2Stock_period);
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                elsif ltypSys_Mnt_Period.mnt_data_typ = 5 then
                    --���v�ʃA���[�����X�g�ێ�����
                    lvc2OdAlm_period :=
                            to_char(add_months(to_date(pvcDeleteProcExecDate||'/01','yyyy/mm/dd'),-ltypSys_Mnt_Period.mnt_period)-1,'yyyy/mm/dd');
--vc2RunChkComment := '���������ʉ� 00080';
--DBMS_OUTPUT.PUT_LINE('���v�ʃA���[�����X�g�ێ�����'||lvc2OdAlm_period);
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                elsif ltypSys_Mnt_Period.mnt_data_typ = 6 then
                    --�Ɩ����b�Z�[�W���ێ�����
                    lvc2BusinessMsg_period :=
                             to_char(add_months(to_date(pvcDeleteProcExecDate||'/01','yyyy/mm/dd'),-ltypSys_Mnt_Period.mnt_period)-1,'yyyy/mm/dd');
--vc2RunChkComment := '���������ʉ� 00090';
--DBMS_OUTPUT.PUT_LINE('�Ɩ����b�Z�[�W���ێ�����'||lvc2BusinessMsg_period);
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
--vc2RunChkComment := '���������ʉ� 00100';
--DBMS_OUTPUT.PUT_LINE('�J�����_���ێ�����'||lvc2Cal_period);
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
--vc2RunChkComment := '���������ʉ� 00110';
--DBMS_OUTPUT.PUT_LINE('�������ێ�����'||lvc2InspcAcpt_period);
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
--vc2RunChkComment := '���������ʉ� 00120';
--DBMS_OUTPUT.PUT_LINE('�o�וۗ����ێ�����'||lvc2ShipRsv_period);
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
--vc2RunChkComment := '���������ʉ� 00130';
--DBMS_OUTPUT.PUT_LINE('�������z���ێ�����'||lvc2InspcAcptAmount_period);
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
--vc2RunChkComment := '���������ʉ� 00140';
--DBMS_OUTPUT.PUT_LINE('���㑗��󗚗����ێ�����'||lvc2PastSalesInvoice_period);
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
--vc2RunChkComment := '���������ʉ� 00150';
--DBMS_OUTPUT.PUT_LINE('���㑗�����ێ�����'||lvc2SalesInvoice_period);
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

                elsif ltypSys_Mnt_Period.mnt_data_typ = 7 then --A
                    --���i�\���g�����U�N�V�����ێ�����
                    lvc2ForPsT_period :=
                            to_char(add_months(to_date(pvcDeleteProcExecDate||'/01','yyyy/mm/dd'),-ltypSys_Mnt_Period.mnt_period)-1,'yyyy/mm/dd');
--vc2RunChkComment := '���������ʉ� 00160';
--DBMS_OUTPUT.PUT_LINE('���i�\���g�����U�N�V�����ێ�����'||lvc2ForPsT_period);
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);


                --�w���ԕi���ѕێ�����  205/08/12�ǉ�
                elsif ltypSys_Mnt_Period.mnt_data_typ = 11 then
                    lvc2PchOdRtnRst_period :=
                            to_char(add_months(to_date(pvcDeleteProcExecDate||'/01','yyyy/mm/dd'),-ltypSys_Mnt_Period.mnt_period)-1,'yyyy/mm/dd');


--DBMS_OUTPUT.PUT_LINE('ltypSys_Mnt_Period.mnt_data_typ:' || ltypSys_Mnt_Period.mnt_data_typ);
--vc2RunChkComment := '���������ʉ� 00170';
--DBMS_OUTPUT.PUT_LINE('�����o�ɗv���ێ�����'||lvc2ForAutoIssReq_period);
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -------------------------------------------------------------------

                end if;
            end if;
        end loop;
        close cur_Sys_Mnt_Period;
        end if;
      --���t�̕ҏW
      lvc2WkDateTime :=  lvc2Stock_period || ' 23:59:59';
  /****************************************************************
  *                         csv�o�͏���                              *
  *****************************************************************/  
     --�o�Ɏw��(�f�}���h���)�̍폜
     blnRet :=  SubFncTIssueInstDdCsvWrite(lvc2Mrp_period,pvc2PlantCd);
     --���v��̧�ق̍폜�i�[���i�ڈȊO�j
     --csv�o�͏������f�[�^�폜���O�Ɉړ�
     --blnRet :=  SubFncTOdTypExcCsvWrite(lvc2Mrp_period,pvc2PlantCd);
     --���v��̧�ق̍폜�i�[���i�ځj
     --csv�o�͏������f�[�^�폜���O�Ɉړ�
     --blnRet :=  SubFncTOdTypIntCsvWrite(lvc2Mrp_period,pvc2PlantCd);
     --[�����c](�I�[�_���)�̍폜 
     --csv�o�͏������f�[�^�폜���O�Ɉړ�
     --blnRet := SubFncTRlPuchOdrTodCsvWrite(lvc2Mrp_period,pvc2PlantCd);
     --��ƌn��ʎd�|�ް��폜
     --csv�o�͏������f�[�^�폜���O�Ɉړ�
     --blnRet := SubFncTWorkInPcByPrcCsvWrite(lvc2Mrp_period,pvc2PlantCd);
     --�i�ڕʎd�|�ް��폜 
     --csv�o�͏������f�[�^�폜���O�Ɉړ�
     --blnRet := SubFncTWorkInPcByItemCsvWrite(lvc2Mrp_period,pvc2PlantCd);
     --���v��̧�ق̍폜�i�I�[�_���j
     --csv�o�͏������f�[�^�폜���O�Ɉړ�
     --blnRet := SubFncTOdExc34CsvWrite(lvc2Mrp_period,pvc2PlantCd);
     --�����c�ް��폜(���i�������)
     --csv�o�͏������f�[�^�폜���O�Ɉړ�
     --blnRet := SubFncTRlsdPuchOdrCsvWrite(lvc2Mrp_period,pvc2PlantCd);
     --���Ԍv��폜
     blnRet := SubFncTDelJobOdrOdCsvWrite(lvc2Mrp_period,pvc2PlantCd);
     --�o�Ɏw��(���ԏ��)�̍폜
     blnRet :=SubFncTIssueInstJobCsvWrite();
     --�����c�ް��폜(���ԏ��)
     blnRet :=SubFncTRsPuchOdrJobCsvWrite();
     --������э폜(���ԏ��)
     blnRet :=SubFncTAcptRsltJobCsvWrite();
     --�������э폜(���ԏ��)
     blnRet :=SubFncTInspcRsltJobCsvWrite();
     --�����s�Ǎ폜(���ԏ��)
     blnRet :=SubFncTInspcDefectJobCsvWrite();
     --���������폜(���ԏ��)
     blnRet :=SubFncTPInsAcptJobCsvWrite();
     --�������z�����폜(���ԏ��)
     blnRet :=SubFncTPastInspcJobCsvWrite();
     --��ƌn��ʎd�|�ް��폜(���ԏ��)
     blnRet :=SubFncTWkInPcByPrcJobCsvWrite();
     --�i�ڕʎd�|(���ԏ��)
     blnRet :=SubFncTWkInPcByItemJobCsvWrite();
     --��Ǝw���`�[(�i�ڕʎd�|)
     --csv�o�͏������f�[�^�폜���O�Ɉړ�
     --blnRet :=SubFncTOprInstSlipItemCsvWrite(pvc2PlantCd);
     --��Ǝw���`�[(�n��ʎd�|)
     --csv�o�͏������f�[�^�폜���O�Ɉړ�
     --blnRet :=SubFncTOprInstSlipPrcCsvWrite(pvc2PlantCd);
     --���Ԉ����ް��폜
     blnRet :=SubFncTJobOdrAlcCsvWrite();
     --���v��̧�ق̍폜�i���ԏ��)
     blnRet :=SubFncTOdJobCsvWrite();
--20150807 ADD START BY SYSCOM
     --���o�ɕʉ�v�A�g���폜�i�v��O�A�ړ��ɂ����o�Ƀf�[�^
     blnRet := SubFucTRcvIssAiIfDataCsvWriter(lvc2RcvIssue_period,pvc2PlantCd);
--20150807 ADD END BY SYSCOM
     --���v�ʃA���[�����X�g�̍폜�i���ԏ��)
     blnRet :=SubFncTOdAlarmJobCsvWrite();
     --���v�ʍēW�J�˗��̍폜�i���ԏ��)
     blnRet :=SubFncTMrpReexJobCsvWrite();
     --�ۊǋ�ʓ��o���ް��폜�i�v��O�A�ړ��ɂ����o�Ƀf�[�^�j
     --csv�o�͏������f�[�^�폜���O�Ɉړ�
     --blnRet :=SubFncTRcvIssueSkCsvWrite(lvc2RcvIssue_period,pvc2PlantCd);
     --�ۊǋ�ʓ��o���ް��폜�iMRP�i��,���ԏ��j
     --csv�o�͏������f�[�^�폜���O�Ɉړ�
     --blnRet :=SubFncTRcvIssueMrpCsvWrite(lvc2RcvIssue_period,pvc2PlantCd);
     --�ۊǋ�ʕi�ڍ݌��ް��폜
     blnRet :=SubFncTItemStockCsvWrite(lvc2WkDateTime,pvc2PlantCd);
     --�ۊǋ�ʐ��ԍ݌�
     blnRet :=SubFncTJobCdStockCsvWrite(lvc2WkDateTime,pvc2PlantCd);
     --���Ԍv��
     blnRet :=SubFncTJobOdrCsvWrite(pvc2PlantCd);
     --���v�ʌv�Z����(����)
     blnRet :=SubFncSJobCalcCtrlCsvWrite(pvc2PlantCd);
     --�o��������
     blnRet :=SubFncTOutputRsltCsvWrite(lvc2Mrp_period,pvc2PlantCd);
     --�w���i�ԕi�����ް��폜
     blnRet :=SubFncTPOdrRnRsltCsvWrite(lvc2PchOdRtnRst_period,pvc2PlantCd);
     --���v�ʱװ�ؽ��ް��폜
     blnRet :=SubFncTOdAlarmCsvWrite(lvc2OdAlm_period,pvc2PlantCd);
     --�Ɩ�ү�����ް��폜
     blnRet :=SubFncSysMsgLogCsvWrite(lvc2BusinessMsg_period,pvc2PlantCd);
     --���i�\���g�����U�N�V����
     blnRet :=SubFncSysPsTCsvWrite(lvc2ForPsT_period);
     --�O���v��폜T_EXTERNAL_PLANSubFncTExtPlanCsvWritelvc2Mrp_period
     blnRet :=SubFncTExtPlanCsvWrite(lvc2Mrp_period,pvc2PlantCd);
  /****************************************************************
  *                         �폜����                              *
  *****************************************************************/


--vc2RunChkComment := '���������ʉ� 00180';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    /**********************************************************
    *  MRP�i�ڂ̃g�����U�N�V�����f�[�^�폜����(�f�}���h���)  *
    **********************************************************/

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0743)���� MRP�i�ڂ̃g�����U�N�V�����f�[�^�폜����(�f�}���h���) ����'); --A

--vc2RunChkComment := '���������ʉ� 00190';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--vc2RunChkComment := '���������ʉ� 00210';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        --�o�Ɏw��̧�ق̍폜
        delete from T_ISSUE_INST ISS_I
            where exists(select 'x' from t_od OD
                            where ISS_I.od_no = OD.od_no
                              and OD.plant_CD = pvc2PlantCd  --A �H��R�[�h
                              and OD.job_odr_cd is null                                       --����
                              and OD.dm_sts_typ = 9                                       --�f�}���h��ԋ敪
                              and OD.issue_cmplt_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd')); --�o�Ɋ����� <= MRP�i�ڏ��ێ�����

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0744)�o�Ɏw���폜�����F'||SQL%ROWCOUNT); --A

--vc2RunChkComment := '���������ʉ� 00220';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

     --���v��̧�ق̍폜�i�[���i�ڈȊO�j��csv�o��
     blnRet :=  SubFncTOdTypExcCsvWrite(lvc2Mrp_period,pvc2PlantCd);

        --���v��̧�ق̍폜�i�[���i�ڈȊO�j
        delete from T_od
            where job_odr_cd is null                                        --����
              and plant_CD = pvc2PlantCd    --A �H��R�[�h
              and dm_sts_typ = 9                                            --�f�}���h��ԋ敪
              and issue_cmplt_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd')  --�o�Ɋ����� <= MRP�i�ڏ��ێ�����
              and not ( od_typ = 4 );                                       --�I�[�_�f�}���h�敪

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0745)���v�ʁi�[���i�ڈȊO�j�폜�����F'||SQL%ROWCOUNT); --A

--vc2RunChkComment := '���������ʉ� 00225';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

     --���v��̧�ق̍폜�i�[���i�ځj��csv�o��
     blnRet :=  SubFncTOdTypIntCsvWrite(lvc2Mrp_period,pvc2PlantCd);

        --���v��̧�ق̍폜�i�[���i�ځj
        delete from T_od OD1
            where not exists( select od_no from T_od OD2 WHERE OD1.od_no = OD2.parent_od_no )
              and OD1.plant_CD = pvc2PlantCd    --A �H��R�[�h
              and OD1.job_odr_cd is null                               --����
              and OD1.dm_sts_typ = 9                                   --�f�}���h��ԋ敪
              and OD1.updated_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd') --�X�V�� <= MRP�i�ڏ��ێ�����
              and OD1.od_typ = 4;                                      --�I�[�_�f�}���h�敪

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0746)���v�ʁi�[���i�ځj�폜�����F'||SQL%ROWCOUNT); --A


    /*******************************************************
    *  MRP�i��/�g�����U�N�V�����f�[�^�폜����(�I�[�_���)  *
    ********************************************************/

    LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                            pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0747)���� MRP�i��/�g�����U�N�V�����f�[�^�폜����(�I�[�_���) ����'); --A
--20150807 ADD START BY SYSCOM
vc2RunChkComment := '���������ʉ� 00425';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        --���o�ɕʉ�v�A�g����ް��폜�i�v��O�A�ړ��ɂ����o�Ƀf�[�^�j
        DELETE FROM
          T_RCV_ISSUE_AI_IF_DATA ISSAID
        WHERE
                   ISSAID.RCV_ISSUE_CTRL_CD IN ( SELECT RCV.RCV_ISSUE_CTRL_CD
                                               FROM
                                                 T_RCV_ISSUE RCV
                                               WHERE
                                                 RCV.plant_CD = pvc2PlantCd
                                                 AND RCV.od_no is NULL
                                                 AND RCV.rcv_issue_date <= to_date(lvc2RcvIssue_period,'yyyy/mm/dd')
                                                 AND (RCV.stock_upd_typ = 2 OR RCV.stock_upd_typ = 3));  
          
        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                               pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1614)���o�ɕʉ�v�A�g���(�v��O�A�ړ�)�폜�����F'||SQL%ROWCOUNT); --A
--20150807 ADD END BY SYSCOM


--vc2RunChkComment := '���������ʉ� 00230';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

     --[��������](�I�[�_���)��csv�o��
     blnRet := SubFncTPastInspcAcptCsvWrite(lvc2Mrp_period,pvc2PlantCd);
     
     --[�������z����](�I�[�_���)��csv�o��
     blnRet := SubFncTPastInspcCsvWrite(lvc2Mrp_period,pvc2PlantCd);
     
     --[�����s��](�I�[�_���)��csv�o��
     blnRet := SubFncTInspcDefectCsvWrite(lvc2Mrp_period,pvc2PlantCd);
     
     --[��������](�I�[�_���)��csv�o��
     blnRet := SubFncTInspcRsltCsvWrite(lvc2Mrp_period,pvc2PlantCd);
     
     --[�������](�I�[�_���)��csv�o�� 
     blnRet := SubFncTAcptRsltCsvWrite(lvc2Mrp_period,pvc2PlantCd);
     
     --[�����c](�I�[�_���)��csv�o��
     blnRet := SubFncTRlPuchOdrTodCsvWrite(lvc2Mrp_period,pvc2PlantCd);

            --���������ް��폜
            delete from T_PAST_INSPC_ACPT ACPT
                where exists(select PUCH_ODR_CD from  T_RLSD_PUCH_ODR RLSD
                                where exists(select 'x' from  T_od OD1
                                                where RLSD.od_no = OD1.od_no
                                                  and   OD1.plant_CD = pvc2PlantCd                                    --A �H��R�[�h
                                                  and   OD1.job_odr_cd is null                                        --����
                                                  and   OD1.odr_sts_typ = 9                                           --�I�[�_��ԋ敪
                                                  and   OD1.rcv_cmplt_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd')    --���Ɋ����� <= MRP�i�ڏ��ێ�����
                                                  and   OD1.od_no not in (select OD2.parent_od_no from T_od OD2
                                                                              where OD2.parent_od_no = OD1.od_no
                                                                                                    and OD2.od_typ in (3,4))
                                                  and ACPT.PUCH_ODR_CD = RLSD.PUCH_ODR_CD));

            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1604)���������폜�����F'||SQL%ROWCOUNT);

            --�������z�����ް��폜
            delete from T_PAST_INSPC_ACPT_AMOUNT AMOUNT
                where exists(select PUCH_ODR_CD from  T_RLSD_PUCH_ODR RLSD
                                where exists(select 'x' from  T_od OD1
                                                where RLSD.od_no = OD1.od_no
                                                  and   OD1.plant_CD = pvc2PlantCd                                    --A �H��R�[�h
                                                  and   OD1.job_odr_cd is null                                        --����
                                                  and   OD1.odr_sts_typ = 9                                           --�I�[�_��ԋ敪
                                                  and   OD1.rcv_cmplt_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd')    --���Ɋ����� <= MRP�i�ڏ��ێ�����
                                                  and   OD1.od_no not in (select OD2.parent_od_no from T_od OD2
                                                                              where OD2.parent_od_no = OD1.od_no
                                                                                                    and OD2.od_typ in (3,4))
                                                  and AMOUNT.PUCH_ODR_CD = RLSD.PUCH_ODR_CD));

            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1605)�������z�����폜�����F'||SQL%ROWCOUNT);
                                    
            --�����s���ް��폜
            delete from T_INSPC_DEFECT INSPC
                where exists(select PUCH_ODR_CD from  T_RLSD_PUCH_ODR RLSD
                                where exists(select 'x' from  T_od OD1
                                                where RLSD.od_no = OD1.od_no
                                                  and   OD1.plant_CD = pvc2PlantCd                                     --A �H��R�[�h
                                                  and   OD1.job_odr_cd is null                                        --����
                                                  and   OD1.odr_sts_typ = 9                                           --�I�[�_��ԋ敪
                                                  and   OD1.rcv_cmplt_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd')  --���Ɋ����� <= MRP�i�ڏ��ێ�����
                                                  and   OD1.od_no not in (select OD2.parent_od_no from T_od OD2
                                                                              where OD2.parent_od_no = OD1.od_no
                                                                                                    and OD2.od_typ in (3,4))
                                                  and INSPC.PUCH_ODR_CD = RLSD.PUCH_ODR_CD));
            
            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1606)�����s�Ǎ폜�����F'||SQL%ROWCOUNT);
            
            --���������ް��폜
            delete from T_INSPC_RSLT RSLT
                where exists(select PUCH_ODR_CD from  T_RLSD_PUCH_ODR RLSD
                                where exists(select 'x' from  T_od OD1
                                                where RLSD.od_no = OD1.od_no
                                                  and   OD1.plant_CD = pvc2PlantCd                                     --A �H��R�[�h
                                                  and   OD1.job_odr_cd is null                                        --����
                                                  and   OD1.odr_sts_typ = 9                                           --�I�[�_��ԋ敪
                                                  and   OD1.rcv_cmplt_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd')  --���Ɋ����� <= MRP�i�ڏ��ێ�����
                                                  and   OD1.od_no not in (select OD2.parent_od_no from T_od OD2
                                                                              where OD2.parent_od_no = OD1.od_no
                                                                                                    and OD2.od_typ in (3,4))
                                                  and RSLT.PUCH_ODR_CD = RLSD.PUCH_ODR_CD));
            
            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1607)�������э폜�����F'||SQL%ROWCOUNT);
            
            --��������ް��폜
            delete from T_ACPT_RSLT RSLT
                where exists(select PUCH_ODR_CD from  T_RLSD_PUCH_ODR RLSD
                                where exists(select 'x' from  T_od OD1
                                                where RLSD.od_no = OD1.od_no
                                                  and   OD1.plant_CD = pvc2PlantCd                                     --A �H��R�[�h
                                                  and   OD1.job_odr_cd is null                                        --����
                                                  and   OD1.odr_sts_typ = 9                                           --�I�[�_��ԋ敪
                                                  and   OD1.rcv_cmplt_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd')  --���Ɋ����� <= MRP�i�ڏ��ێ�����
                                                  and   OD1.od_no not in (select OD2.parent_od_no from T_od OD2
                                                                              where OD2.parent_od_no = OD1.od_no
                                                                                                    and OD2.od_typ in (3,4))
                                                  and RSLT.PUCH_ODR_CD = RLSD.PUCH_ODR_CD));
            
            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1608)������э폜�����F'||SQL%ROWCOUNT);
            
            --�����c�ް��폜
            delete from T_RLSD_PUCH_ODR RLSD
                where exists(select 'x' from  T_od OD1
                                where   RLSD.od_no = OD1.od_no
                                  and   OD1.plant_CD = pvc2PlantCd    --A �H��R�[�h
                                  and   OD1.job_odr_cd is null                                        --����
                                  and   OD1.odr_sts_typ = 9                                           --�I�[�_��ԋ敪
                                  and   OD1.rcv_cmplt_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd')    --���Ɋ����� <= MRP�i�ڏ��ێ�����
                                  and   OD1.od_no not in (select OD2.parent_od_no from T_od OD2
                                                              where OD2.parent_od_no = OD1.od_no
                                                                                    and OD2.od_typ in (3,4))); -- upd 2002.09.04

            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0748)�����c�폜�����F'||SQL%ROWCOUNT); --A

--vc2RunChkComment := '���������ʉ� 00240';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--vc2RunChkComment := '���������ʉ� 00250';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

     --��ƌn��ʎd�|�ް���csv�o��
     blnRet := SubFncTWorkInPcByPrcCsvWrite(lvc2Mrp_period,pvc2PlantCd);

            --��ƌn��ʎd�|�ް��폜
            delete from T_WORK_IN_PROC_BY_PROC PROC
                where exists(select 'x' from t_od OD1
                                    where OD1.job_odr_cd is null                                     --����
                                      and OD1.plant_CD = pvc2PlantCd    --A �H��R�[�h
                                      and OD1.odr_sts_typ = 9                                        --�I�[�_��ԋ敪
                                      and OD1.rcv_cmplt_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd') --���Ɋ����� <= MRP�i�ڏ��ێ�����
                                      and not exists (select OD2.parent_od_no from T_od OD2
                                                              where OD2.parent_od_no = OD1.od_no
                                                                and OD2.od_typ in (3,4))                 --�����܂ł��O����� upd 2002.09.04
                                      and PROC.od_no = OD1.od_no);                                  --  �ȉ�<��ƌn��ʎd�|>���o�̏���

            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0749)��ƌn��ʎd�|�폜�����F'||SQL%ROWCOUNT); --A


--vc2RunChkComment := '���������ʉ� 00260';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

     --�i�ڕʎd�|�ް���csv�o��
     blnRet := SubFncTWorkInPcByItemCsvWrite(lvc2Mrp_period,pvc2PlantCd);

            --�i�ڕʎd�|�ް��폜
            delete from T_WORK_IN_PROC_BY_ITEM PITEM
                where exists(select 'x' from t_od OD1
                                where OD1.job_odr_cd is null                                     --����
                                  and OD1.plant_CD = pvc2PlantCd    --A �H��R�[�h
                                  and OD1.odr_sts_typ = 9                                        --�I�[�_��ԋ敪
                                  and OD1.rcv_cmplt_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd') --���Ɋ����� <= MRP�i�ڏ��ێ�����
                                  and not exists (select OD2.parent_od_no from T_od OD2
                                                             where OD2.parent_od_no = OD1.od_no
                                                             and OD2.od_typ in (3,4))         --�����܂ł��O�����  up 2002.09.04
                                  and PITEM.od_no = OD1.od_no);                             --�ȉ�<�i�ڕʎd�|>���o�̏���

            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0750)�i�ڕʎd�|�폜�����F'||SQL%ROWCOUNT); --A

--vc2RunChkComment := '���������ʉ� 00270';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--vc2RunChkComment := '���������ʉ� 00290';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

     --���v�ʃA���[�����X�g��csv�o�́i�I�[�_���j
     blnRet := SubFncTOdAlarmCsvRWrite(lvc2Mrp_period,pvc2PlantCd);

     --���v�ʍēW�J�˗���csv�o�́i�I�[�_���j
     blnRet := SubFncTMrpReexplosioCsvWrite(lvc2Mrp_period,pvc2PlantCd);

     --���v��̧�ق�csv�o�́i�I�[�_���j
     blnRet := SubFncTOdExc34CsvWrite(lvc2Mrp_period,pvc2PlantCd);

            --���v�ʃA���[�����X�g�ް��폜
            delete from T_OD_ALARM ALARM
                where exists(select 'x' from  T_od OD1
                                where  ALARM.od_no = OD1.od_no
                                  and   OD1.plant_CD = pvc2PlantCd                                     --A �H��R�[�h
                                  and   OD1.job_odr_cd is null                                        --����
                                  and   OD1.odr_sts_typ = 9                                           --�I�[�_��ԋ敪
                                  and   OD1.rcv_cmplt_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd')  --���Ɋ����� <= MRP�i�ڏ��ێ�����
                                  and   OD1.od_no not in (select OD2.parent_od_no from T_od OD2
                                                              where OD2.parent_od_no = OD1.od_no
                                                                                    and OD2.od_typ in (3,4))); -- upd 2002.09.04
            
            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0767)���v�ʃA���[�����X�g�폜�����F'||SQL%ROWCOUNT); --A
            
            --���v�ʍēW�J�˗��ް��폜
            delete from T_MRP_REEXPLOSION REE
                where exists(select 'x' from  T_od OD1
                                where  REE.od_no = OD1.od_no
                                  and   OD1.plant_CD = pvc2PlantCd                                     --A �H��R�[�h
                                  and   OD1.job_odr_cd is null                                        --����
                                  and   OD1.odr_sts_typ = 9                                           --�I�[�_��ԋ敪
                                  and   OD1.rcv_cmplt_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd')  --���Ɋ����� <= MRP�i�ڏ��ێ�����
                                  and   OD1.od_no not in (select OD2.parent_od_no from T_od OD2
                                                              where OD2.parent_od_no = OD1.od_no
                                                                                    and OD2.od_typ in (3,4))); -- upd 2002.09.04
            
            BlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1609)���v�ʍēW�J�˗��폜�����F'||SQL%ROWCOUNT); --A
            
            --���v��̧�ق̍폜
            delete from T_od OD1
                where job_odr_cd is null                                     --����
                  and plant_CD = pvc2PlantCd    --A �H��R�[�h
                  and odr_sts_typ = 9                                        --�I�[�_��ԋ敪
                  and rcv_cmplt_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd') --���Ɋ����� <= MRP�i�ڏ��ێ�����
                  and OD1.od_no not in (select OD2.parent_od_no from T_od OD2
                                                              where OD2.parent_od_no = OD1.od_no
                                                                and OD2.od_typ in (3,4));   --�����܂ł��O�����

            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0751)���v�ʍ폜�����F'||SQL%ROWCOUNT); --A


    /**********************************************************
    *   MRP�i��/�g�����U�N�V�����f�[�^�폜����(���i�������)  *
    ***********************************************************/

    LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                            pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0752)���� MRP�i��/�g�����U�N�V�����f�[�^�폜����(���i�������) ����'); --A

--vc2RunChkComment := '���������ʉ� 00300';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

     --[��������](���i�������)��csv�o��
     blnRet := SubFncTPastInspcAcptBhCsvWrite(lvc2Mrp_period,pvc2PlantCd);
     
     --[�������z����](���i�������)��csv�o��
     blnRet := SubFncTPastInspcBhcsvWrite(lvc2Mrp_period,pvc2PlantCd);

     --[�����s��](���i�������)��csv�o��
     blnRet := SubFncTInspcDefectBhCsvWrite(lvc2Mrp_period,pvc2PlantCd);

     --[��������](���i�������)��csv�o��
     blnRet := SubFncTInspcRsltBhCsvWrite(lvc2Mrp_period,pvc2PlantCd);

     --[�������](���i�������)��csv�o��
     blnRet := SubFncTAcptRsltBhCsvWrite(lvc2Mrp_period,pvc2PlantCd);

     --�����c�ް���csv�o��(���i�������)
     blnRet := SubFncTRlsdPuchOdrCsvWrite(lvc2Mrp_period,pvc2PlantCd);

            --���������ް��폜
            delete from T_PAST_INSPC_ACPT ACPT
                where exists(select 'x' from  T_RLSD_PUCH_ODR ODR
                                where ACPT.PUCH_ODR_CD = ODR.PUCH_ODR_CD
                                  and ODR.inv_ctrl_flg = 0                                            --�݌ɊǗ��׸�
                                  and ODR.plant_CD = pvc2PlantCd                                      --A �H��R�[�h
                                  and ODR.puch_odr_sts_typ = 9                                        --������ԋ敪
                                  and ODR.acpt_cmplt_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd'));   --���������

            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1604)���������폜�����F'||SQL%ROWCOUNT);

            --�������z�����ް��폜
            delete from T_PAST_INSPC_ACPT_AMOUNT AMOUNT
                where exists(select 'x' from  T_RLSD_PUCH_ODR ODR
                                where AMOUNT.PUCH_ODR_CD = ODR.PUCH_ODR_CD
                                  and ODR.inv_ctrl_flg = 0                                            --�݌ɊǗ��׸�
                                  and ODR.plant_CD = pvc2PlantCd                                      --A �H��R�[�h
                                  and ODR.puch_odr_sts_typ = 9                                        --������ԋ敪
                                  and ODR.acpt_cmplt_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd'));   --���������

            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1605)�������z�����폜�����F'||SQL%ROWCOUNT);

            --�����s���ް��폜
            delete from T_INSPC_DEFECT INSPC
                where exists(select 'x' from  T_RLSD_PUCH_ODR ODR
                                where INSPC.PUCH_ODR_CD = ODR.PUCH_ODR_CD
                                  and ODR.inv_ctrl_flg = 0                                            --�݌ɊǗ��׸�
                                  and ODR.plant_CD = pvc2PlantCd                                       --A �H��R�[�h
                                  and ODR.puch_odr_sts_typ = 9                                        --������ԋ敪
                                  and ODR.acpt_cmplt_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd')); --���������
            
            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1606)�����s�Ǎ폜�����F'||SQL%ROWCOUNT);
            
            --���������ް��폜
            delete from T_INSPC_RSLT RSLT
                where exists(select 'x' from  T_RLSD_PUCH_ODR ODR
                                where RSLT.PUCH_ODR_CD = ODR.PUCH_ODR_CD
                                  and ODR.inv_ctrl_flg = 0                                            --�݌ɊǗ��׸�
                                  and ODR.plant_CD = pvc2PlantCd                                       --A �H��R�[�h
                                  and ODR.puch_odr_sts_typ = 9                                        --������ԋ敪
                                  and ODR.acpt_cmplt_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd')); --���������
            
            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1607)�������э폜�����F'||SQL%ROWCOUNT);
            
            --��������ް��폜
            delete from T_ACPT_RSLT RSLT
                where exists(select 'x' from  T_RLSD_PUCH_ODR ODR
                                where RSLT.PUCH_ODR_CD = ODR.PUCH_ODR_CD
                                  and ODR.inv_ctrl_flg = 0                                           --�݌ɊǗ��׸�
                                  and ODR.plant_CD = pvc2PlantCd                                      --A �H��R�[�h
                                  and ODR.puch_odr_sts_typ = 9                                       --������ԋ敪
                                  and ODR.acpt_cmplt_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd')); --���������
            
            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1608)������э폜�����F'||SQL%ROWCOUNT);

        --�����c�ް��폜
        delete from T_RLSD_PUCH_ODR
            where inv_ctrl_flg = 0                                         --�݌ɊǗ��׸�
              and plant_CD = pvc2PlantCd    --A �H��R�[�h
              and puch_odr_sts_typ = 9                                     --������ԋ敪
              and acpt_cmplt_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd'); --���������

            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0748)�����c�폜�����F'||SQL%ROWCOUNT); --A


    /**********************************************************
    *      �g�����U�N�V�����n�f�[�^�폜����(���ԕi��)         *
    ***********************************************************/

    LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                            pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0753)���� �g�����U�N�V�����n�f�[�^�폜����(���ԕi��) ����'); --A

--vc2RunChkComment := '���������ʉ� 00330';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        --�o�Ɏw���ް��폜
        --                      �擾���� ���ԁ|�}�ԁ|��������ԍ� �����Ƃ� �ۊǋ�ʐ��ԍ݌ɂ�������
        --                      ���ʂ��O�łȂ���΁i���ʁ����O�j�폜�Ώ�
        delete from T_ISSUE_INST IS_INST
            where exists(select 'x' from T_DEL_JOB_ODR_OD DEL
                                   where IS_INST.OD_NO in (select od_no from t_od OD
                                                           where DEL.JOB_ODR_CD = OD.JOB_ODR_CD
                                                             and DEL.JOB_ODR_DETAIL_NO = OD.JOB_ODR_DETAIL_NO
                                                             and DEL.job_odr_cancel_no = OD.job_odr_cancel_no
                                                             and (OD.od_typ = 1 or OD.od_typ = 3)));    --�d�ώw��Ұ�2000/03/30

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                               pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0744)�o�Ɏw���폜�����F'|| SQL%ROWCOUNT); --A

--vc2RunChkComment := '���������ʉ� 00340';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

            --���������ް��폜
            delete from T_PAST_INSPC_ACPT ACPT
                where exists(select PUCH_ODR_CD from  T_RLSD_PUCH_ODR RLSD
                                where exists(select 'x' from T_DEL_JOB_ODR_OD DEL, t_od OD
                                                   where OD.od_no              = RLSD.od_no
                                                     and DEL.job_odr_cd        = OD.job_odr_cd
                                                     and DEL.job_odr_detail_no = OD.job_odr_detail_no));

            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1604)���������폜�����F'||SQL%ROWCOUNT);

            --�������z�����ް��폜
            delete from T_PAST_INSPC_ACPT_AMOUNT AMOUNT
                where exists(select PUCH_ODR_CD from  T_RLSD_PUCH_ODR RLSD
                                where exists(select 'x' from T_DEL_JOB_ODR_OD DEL, t_od OD
                                                   where OD.od_no              = RLSD.od_no
                                                     and DEL.job_odr_cd        = OD.job_odr_cd
                                                     and DEL.job_odr_detail_no = OD.job_odr_detail_no));

            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1605)�������z�����폜�����F'||SQL%ROWCOUNT);

            --�����s���ް��폜
            delete from T_INSPC_DEFECT INSPC
                where exists(select PUCH_ODR_CD from  T_RLSD_PUCH_ODR RLSD
                                where exists(select 'x' from T_DEL_JOB_ODR_OD DEL, t_od OD
                                                   where OD.od_no              = RLSD.od_no
                                                     and DEL.job_odr_cd        = OD.job_odr_cd
                                                     and DEL.job_odr_detail_no = OD.job_odr_detail_no));
            
            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1606)�����s�Ǎ폜�����F'||SQL%ROWCOUNT);
            
            --���������ް��폜
            delete from T_INSPC_RSLT RSLT
                where exists(select PUCH_ODR_CD from  T_RLSD_PUCH_ODR RLSD
                                where exists(select 'x' from T_DEL_JOB_ODR_OD DEL, t_od OD
                                                   where OD.od_no              = RLSD.od_no
                                                     and DEL.job_odr_cd        = OD.job_odr_cd
                                                     and DEL.job_odr_detail_no = OD.job_odr_detail_no));
            
            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1607)�������э폜�����F'||SQL%ROWCOUNT);
            
            --��������ް��폜
            delete from T_ACPT_RSLT RSLT
                where exists(select PUCH_ODR_CD from  T_RLSD_PUCH_ODR RLSD
                                where exists(select 'x' from T_DEL_JOB_ODR_OD DEL, t_od OD
                                                   where OD.od_no              = RLSD.od_no
                                                     and DEL.job_odr_cd        = OD.job_odr_cd
                                                     and DEL.job_odr_detail_no = OD.job_odr_detail_no));
            
            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1608)������э폜�����F'||SQL%ROWCOUNT);

        --�����c�ް��폜
        --                      �擾���� ���ԁ|�}�ԁ|��������ԍ� �����Ƃ� �ۊǋ�ʐ��ԍ݌ɂ�������
        --                      ���ʂ��O�łȂ���΁i���ʁ����O�j�폜�Ώ�
        delete from T_RLSD_PUCH_ODR RLSD
            where exists(select 'x' from T_DEL_JOB_ODR_OD DEL,
                                         t_od OD
                            where OD.od_no              = RLSD.od_no
                              and DEL.job_odr_cd        = OD.job_odr_cd
                              and DEL.job_odr_detail_no = OD.job_odr_detail_no
                              and DEL.job_odr_cancel_no = OD.job_odr_cancel_no);

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                               pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0748)�����c�폜�����F'|| SQL%ROWCOUNT); --A


--vc2RunChkComment := '���������ʉ� 00350';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);


--vc2RunChkComment := '���������ʉ� 00360';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        --��ƌn��ʎd�|�ް��폜
        --                      �擾���� ���ԁ|�}�ԁ|��������ԍ� �����Ƃ� �ۊǋ�ʐ��ԍ݌ɂ�������
        --                      ���ʂ��O�łȂ���΁i���ʁ����O�j�폜�Ώ�
        delete from T_WORK_IN_PROC_BY_PROC PROC
            where exists(select 'x' from T_DEL_JOB_ODR_OD DEL,
                                    t_od od
                        where OD.od_no              = PROC.od_no
                          and DEL.job_odr_cd        = OD.job_odr_cd
                          and DEL.job_odr_detail_no = OD.job_odr_detail_no
                          and DEL.job_odr_cancel_no = OD.job_odr_cancel_no);

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                               pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0749)��ƌn��ʎd�|�폜�����F'|| SQL%ROWCOUNT); --A


--vc2RunChkComment := '���������ʉ� 00370';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        --�i�ڕʎd�|�ް��폜
        --                      �擾���� ���ԁ|�}�ԁ|��������ԍ� �����Ƃ� �ۊǋ�ʐ��ԍ݌ɂ�������
        --                      ���ʂ��O�łȂ���΁i���ʁ����O�j�폜�Ώ�
        delete from T_WORK_IN_PROC_BY_ITEM PITEM
            where exists(select 'x' from T_DEL_JOB_ODR_OD DEL,
                                    t_od od
                        where OD.od_no = PITEM.od_no
                          and DEL.job_odr_cd        = OD.job_odr_cd
                          and DEL.job_odr_detail_no = OD.job_odr_detail_no
                          and DEL.job_odr_cancel_no = OD.job_odr_cancel_no);

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                               pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0750)�i�ڕʎd�|�폜�����F'|| SQL%ROWCOUNT); --A

--vc2RunChkComment := '���������ʉ� 00380';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

     --��Ǝ���(�i�ڕʎd�|)��csv�o��
     blnRet :=SubFncTOprRsltSkcsvWrite(lvc2Mrp_period,pvc2PlantCd);
     
     --��ƕs��(�i�ڕʎd�|)��csv�o��
     blnRet :=SubFncTDefectSkcsvWrite(lvc2Mrp_period,pvc2PlantCd);
     
      --��Ǝw���`�[(�i�ڕʎd�|)��csv�o��
     blnRet :=SubFncTOprInstSlipItemCsvWrite(pvc2PlantCd);
     
     --��Ǝ���(�n��ʎd�|)��csv�o��
     blnRet :=SubFncTOprRsltKecsvWrite(lvc2Mrp_period,pvc2PlantCd);
     
     --��ƕs��(�n��ʎd�|)��csv�o��
     blnRet :=SubFncTDefectKecsvWrite(lvc2Mrp_period,pvc2PlantCd);
     
     --��Ǝw���`�[(�n��ʎd�|)��csv�o��
     blnRet :=SubFncTOprInstSlipPrcCsvWrite(pvc2PlantCd);

        --��Ǝw���`�[�폜

--        delete from T_OPR_INST_SLIP SLIP
--            where opr_inst_cd not in(select opr_inst_cd from t_work_in_proc_by_proc
--                                        where opr_inst_cd is not null)
--              and opr_inst_cd not in(select opr_inst_cd from t_work_in_proc_by_item
--                                        where opr_inst_cd is not null)
--              and plant_CD = pvc2PlantCd ;    --A

          -- ��Ǝ��сi�i�ڕʎd�|�j
          delete from T_OPR_RSLT RSLT
                where exists (select 'x' from T_OPR_INST_SLIP SLIP
                                 where not exists (select opr_inst_cd from T_WORK_IN_PROC_BY_ITEM WIBI
                                                           where SLIP.opr_inst_cd  = WIBI.opr_inst_cd)
                                                               and SLIP.opr_inst_cd_gnr_typ = 1
                                                               and SLIP.plant_CD = pvc2PlantCd
                                                               and RSLT.OPR_INST_CD = SLIP.OPR_INST_CD);
          
          LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                               pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1610)��Ǝ��сi�i�ڕʎd�|�j�폜�����F'|| SQL%ROWCOUNT); --A
                               
          -- ��ƕs�ǁi�i�ڕʎd�|�j
          delete from T_DEFECT DEFECT
                where exists (select 'x' from T_OPR_INST_SLIP SLIP
                                 where not exists (select opr_inst_cd from T_WORK_IN_PROC_BY_ITEM WIBI
                                                           where SLIP.opr_inst_cd  = WIBI.opr_inst_cd)
                                                               and SLIP.opr_inst_cd_gnr_typ = 1
                                                               and SLIP.plant_CD = pvc2PlantCd
                                                               and DEFECT.OPR_INST_CD = SLIP.OPR_INST_CD);
          
          LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                               pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1611)��ƕs�ǁi�i�ڕʎd�|�j�폜�����F'|| SQL%ROWCOUNT); --A
                               
          -- ��Ǝ��сi�n��ʎd�|���j
          delete from T_OPR_RSLT RSLT
                where exists (select 'x' from T_OPR_INST_SLIP SLIP
                                 where not exists (select opr_inst_cd from T_WORK_IN_PROC_BY_PROC WIBP
                                                           where SLIP.opr_inst_cd  = WIBP.opr_inst_cd)
                                                               and SLIP.opr_inst_cd_gnr_typ = 2
                                                               and SLIP.plant_CD = pvc2PlantCd
                                                               and RSLT.OPR_INST_CD = SLIP.OPR_INST_CD);
          
          LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                               pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1612)��Ǝ��сi�n��ʎd�|���j�폜�����F'|| SQL%ROWCOUNT); --A
                               
          -- ��ƕs�ǁi�n��ʎd�|���j
          delete from T_DEFECT DEFECT
                where exists (select 'x' from T_OPR_INST_SLIP SLIP
                                 where not exists (select opr_inst_cd from T_WORK_IN_PROC_BY_PROC WIBP
                                                           where SLIP.opr_inst_cd  = WIBP.opr_inst_cd)
                                                               and SLIP.opr_inst_cd_gnr_typ = 2
                                                               and SLIP.plant_CD = pvc2PlantCd
                                                               and DEFECT.OPR_INST_CD = SLIP.OPR_INST_CD);
          
          LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                               pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1613)��ƕs�ǁi�n��ʎd�|���j�폜�����F'|| SQL%ROWCOUNT); --A

          -- ��Ǝw���`�[ �i�i�ڕʎd�|���j
          delete from T_OPR_INST_SLIP SLIP
              where not exists (select opr_inst_cd from T_WORK_IN_PROC_BY_ITEM WIBI
                                          where SLIP.opr_inst_cd  = WIBI.opr_inst_cd)
               and opr_inst_cd_gnr_typ = 1
               and plant_CD = pvc2PlantCd ;

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                               pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0755)��Ǝw���`�[�폜�����P�F'|| SQL%ROWCOUNT); --A

          -- ��Ǝw���`�[ �i�n��ʎd�|���j
          delete from T_OPR_INST_SLIP SLIP
              where not exists (select opr_inst_cd from T_WORK_IN_PROC_BY_PROC WIBP
                                          where SLIP.opr_inst_cd  = WIBP.opr_inst_cd)
               and opr_inst_cd_gnr_typ = 2
               and plant_CD = pvc2PlantCd ;

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                               pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0756)��Ǝw���`�[�폜�����Q�F'|| SQL%ROWCOUNT); --A


--vc2RunChkComment := '���������ʉ� 00390';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--vc2RunChkComment := '���������ʉ� 00410';
--20031104 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        --���Ԉ����ް��폜
        --                      �擾���� ���ԁ|�}�ԁ|��������ԍ� �����Ƃ� �ۊǋ�ʐ��ԍ݌ɂ�������
        --                      ���ʂ��O�łȂ���΁i���ʁ����O�j�폜�Ώ�
        delete from T_JOB_ODR_ALC ALC
            where exists(select 'x' from T_DEL_JOB_ODR_OD DEL,
                                         T_OD OD
                            where OD.OD_NO = ALC.OD_NO
                              and DEL.job_odr_cd        = OD.job_odr_cd
                              and DEL.job_odr_detail_no = OD.job_odr_detail_no
                              and DEL.job_odr_cancel_no = OD.job_odr_cancel_no);

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                               pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0757)���Ԉ����폜�����F'|| SQL%ROWCOUNT); --A

--vc2RunChkComment := '���������ʉ� 00420';
--20031104 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        --���v�ʃA���[�����X�g�ް��폜�i���ԏ��)
        delete from T_OD_ALARM ALARM
                where exists(select 'x' from  T_od OD1
                                where exists(select 'x' from T_DEL_JOB_ODR_OD DEL, T_OD OD2
                                     where OD2.OD_NO = OD1.OD_NO
                                         and DEL.job_odr_cd        = OD2.job_odr_cd
                                         and DEL.job_odr_detail_no = OD2.job_odr_detail_no
                                         and DEL.job_odr_cancel_no = OD2.job_odr_cancel_no));
        
        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                               pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0767)���v�ʃA���[�����X�g�폜�����F'|| SQL%ROWCOUNT); --A
        
        --���v�ʍēW�J�˗��ް��폜�i���ԏ��)
        delete from T_MRP_REEXPLOSION REE
                where exists(select 'x' from  T_od OD1
                                where exists(select 'x' from T_DEL_JOB_ODR_OD DEL, T_OD OD2
                                     where OD2.OD_NO = OD1.OD_NO
                                         and DEL.job_odr_cd        = OD2.job_odr_cd
                                         and DEL.job_odr_detail_no = OD2.job_odr_detail_no
                                         and DEL.job_odr_cancel_no = OD2.job_odr_cancel_no));
        
        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                               pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1609)���v�ʍēW�J�˗��폜�����F'|| SQL%ROWCOUNT); --A

        --���v���ް��폜
        --                      �擾���� ���ԁ|�}�ԁ|��������ԍ� �����Ƃ� �ۊǋ�ʐ��ԍ݌ɂ�������
        --                      ���ʂ��O�łȂ���΁i���ʁ����O�j�폜�Ώ�
        delete from T_OD OD
            where exists(select 'x' from T_DEL_JOB_ODR_OD DEL,
                                         T_OD OD2
                            where OD2.OD_NO = OD.OD_NO
                              and DEL.job_odr_cd        = OD2.job_odr_cd
                              and DEL.job_odr_detail_no = OD2.job_odr_detail_no
                              and DEL.job_odr_cancel_no = OD2.job_odr_cancel_no);

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                               pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0751)���v�ʍ폜�����F'|| SQL%ROWCOUNT); --A

--vc2RunChkComment := '���������ʉ� 00320';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        --�d�ώw��Ұ�2000/03/26
        DELETE FROM T_DEL_JOB_ODR_OD DEL
             WHERE exists(select 'x' from T_JOB_ODR_CD_STOCK J_STOCK
                       where DEL.JOB_ODR_CD = J_STOCK.JOB_ODR_CD
                         and DEL.JOB_ODR_DETAIL_NO = J_STOCK.JOB_ODR_DETAIL_NO
                         and J_STOCK.plant_cd = pvc2PlantCd    --A �H��R�[�h
                         and J_STOCK.stock_on_hand_qty <> 0); --A

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                               pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0754)���ԍ݌ɗL��̈׍폜�ΏۊO�����F'|| SQL%ROWCOUNT); --A

     /***************************************************************************************
     *  �g�����U�N�V�����n�f�[�^�폜                                                        *
     *      (�ۊǋ�ʓ��o�ɤ�ۊǋ�ʕi�ڍ݌ɤ�ۊǋ�ʐ��ԍ݌ɤ���Ԍv�椏o�������Ѥ�����     *
     *       �������z����㑗��󗚗𤔄�㑗���)                                            *
     ***************************************************************************************/

    LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                            pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0758)���� �g�����U�N�V�����n�f�[�^�폜 ����');

--vc2RunChkComment := '���������ʉ� 00430';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        --�i�ڕʓ��o���ް��i�v��O�A�ړ��ɂ����o�Ƀf�[�^�j��csv�o��
        blnRet :=SubFncTRcvIssueItemSkCsvWrite(lvc2RcvIssue_period,pvc2PlantCd);
        
        --�ۊǋ�ʓ��o���ް��i�v��O�A�ړ��ɂ����o�Ƀf�[�^�j��csv�o��
        blnRet :=SubFncTRcvIssueSkCsvWrite(lvc2RcvIssue_period,pvc2PlantCd);
        
        --�i�ڕʓ��o���ް��폜�i�v��O�A�ړ��ɂ����o�Ƀf�[�^�j
        delete from T_RCV_ISSUE_ITEM ISSUE_ITEM
                where exists(select RCV_ISSUE_CTRL_CD from T_RCV_ISSUE RCV , M_WH M
                             where RCV.od_no is NULL
                             and RCV.WH_CD = M.WH_CD      --�ۊǋ�R�[�h
                             and M.PLANT_CD = pvc2PlantCd   --�H��R�[�h
                             and RCV.rcv_issue_date <= to_date(lvc2RcvIssue_period,'yyyy/mm/dd')
                             and (RCV.stock_upd_typ = 2 or RCV.stock_upd_typ = 3)
                             and ISSUE_ITEM.RCV_ISSUE_CTRL_CD = RCV.RCV_ISSUE_CTRL_CD);
        
        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1615)�i�ڕʓ��o��(�v��O�A�ړ�)�폜�����F'||SQL%ROWCOUNT); --A
        
        --�ۊǋ�ʓ��o���ް��폜�i�v��O�A�ړ��ɂ����o�Ƀf�[�^�j
        delete from T_RCV_ISSUE RCV
            where RCV.od_no is NULL
              and RCV.plant_CD = pvc2PlantCd     --A
              and RCV.rcv_issue_date <= to_date(lvc2RcvIssue_period,'yyyy/mm/dd')
              and (RCV.stock_upd_typ = 2 or RCV.stock_upd_typ = 3);

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0759)�ۊǋ�ʓ��o��(�v��O�A�ړ�)�폜�����F'||SQL%ROWCOUNT); --A

--vc2RunChkComment := '���������ʉ� 00435';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        --�i�ڕʓ��o���ް��i�l�q�o�i�ځA���ԕi�ڂ̓��o�Ƀf�[�^�j��csv�o��
        blnRet :=SubFncTRcvIssueItemMrpCsvWrite(lvc2RcvIssue_period,pvc2PlantCd);
        
        --�ۊǋ�ʓ��o���ް��i�l�q�o�i�ځA���ԕi�ڂ̓��o�Ƀf�[�^�j��csv�o��
        blnRet :=SubFncTRcvIssueMrpCsvWrite(lvc2RcvIssue_period,pvc2PlantCd);
        
        --�i�ڕʓ��o���ް��폜�i�l�q�o�i�ځA���ԕi�ڂ̓��o�Ƀf�[�^�j
        delete from T_RCV_ISSUE_ITEM ISSUE_ITEM
                where exists(select RCV_ISSUE_CTRL_CD from T_RCV_ISSUE RCV , M_WH M
                             where not exists( select od_no from T_OD where RCV.od_no = T_OD.od_no )
                             and RCV.rcv_issue_date <= to_date(lvc2RcvIssue_period,'yyyy/mm/dd')
                             and RCV.WH_CD = M.WH_CD
                             and M.PLANT_CD = pvc2PlantCd
                             and (RCV.stock_upd_typ = 2 or RCV.stock_upd_typ = 3)
                             and ISSUE_ITEM.RCV_ISSUE_CTRL_CD = RCV.RCV_ISSUE_CTRL_CD);
        
        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1616)�i�ڕʓ��o�Ɂi�l�q�o�i�ځA���ԕi�ځj�폜�����F'||SQL%ROWCOUNT); --A

        --�ۊǋ�ʓ��o���ް��폜�i�l�q�o�i�ځA���ԕi�ڂ̓��o�Ƀf�[�^�j
        delete from T_RCV_ISSUE RCV
            where not exists( select od_no from T_OD where RCV.od_no = T_OD.od_no )
              and RCV.rcv_issue_date <= to_date(lvc2RcvIssue_period,'yyyy/mm/dd')
              and RCV.plant_CD = pvc2PlantCd     --A
              and (RCV.stock_upd_typ = 2 or RCV.stock_upd_typ = 3);

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0760)�ۊǋ�ʓ��o�Ɂi�l�q�o�i�ځA���ԕi�ځj�폜�����F'||SQL%ROWCOUNT); --A

--vc2RunChkComment := '���������ʉ� 00440';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        --�ۊǋ�ʕi�ڍ݌��ް��폜

        delete from T_ITEM_STOCK
            where stock_on_hand_qty = 0
              and UPDATED_DATE <= to_date(lvc2WkDateTime,'yyyy/mm/dd HH24:MI:SS') --A
              and plant_CD = pvc2PlantCd     --A
              and defect_qty = 0;


        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0761)�ۊǋ�ʕi�ڍ݌ɍ폜�����F'||SQL%ROWCOUNT); --A

--vc2RunChkComment := '���������ʉ� 00450';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        --�ۊǋ�ʐ��ԍ݌��ް��폜
        --���t�̕ҏW
        lvc2WkDateTime :=  lvc2Stock_period || ' 23:59:59';

        delete from T_JOB_ODR_CD_STOCK
            where stock_on_hand_qty = 0
              and plant_CD = pvc2PlantCd     --A
              and UPDATED_DATE <= to_date(lvc2WkDateTime,'yyyy/mm/dd HH24:MI:SS'); --A

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0762)�ۊǋ�ʐ��ԍ݌ɍ폜�����F'||SQL%ROWCOUNT); --A

--vc2RunChkComment := '���������ʉ� 00460';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        --���Ԍv���ް��폜
        delete from T_JOB_ODR JOB
        where JOB.job_odr_sts_typ = 9                   --�ȉ�<���Ԍv��̒��o����>
        and plant_CD = pvc2PlantCd     --A
        and (   JOB.job_odr_cd,
                JOB.job_odr_detail_no,
                JOB.job_odr_cancel_no,
                JOB.item_cd) not in (   select  OD.job_odr_cd,
                                                OD.job_odr_detail_no,
                                                OD.job_odr_cancel_no,
                                                OD.item_cd
                                        from    t_od OD
                                        where   OD.job_odr_cd           = JOB.job_odr_cd
                                        and     OD.job_odr_detail_no    = JOB.job_odr_detail_no
                                        and     OD.job_odr_cancel_no    = JOB.job_odr_cancel_no
                                        and     OD.item_cd              = JOB.item_cd)
        and (   JOB.job_odr_cd,                         --�ȉ�<�ۊǋ�ʐ��ԍ݌ɂ̒��o����>
                JOB.job_odr_detail_no,
                JOB.item_cd) not in (   select  STOCK.job_odr_cd,
                                                STOCK.job_odr_detail_no,
                                                STOCK.item_cd
                                        from    T_JOB_ODR_CD_STOCK STOCK
                                        where   STOCK.job_odr_cd        = JOB.job_odr_cd
                                        and     STOCK.job_odr_detail_no = JOB.job_odr_detail_no
                                        and     STOCK.item_cd           = JOB.item_cd);

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0763)���Ԍv��폜�����F'||SQL%ROWCOUNT); --A


        --���v�ʌv�Z����(����)�ް��폜
        delete from SYS_JOB_OD_CALC_CTRL JOB_CTRL
        where JOB_CTRL.PLANT_CD = pvc2PlantCd
        and (JOB_CTRL.JOB_ODR_CD) not in ( select JOB_OD.JOB_ODR_CD
                                                              from T_JOB_ODR JOB_OD
                                                              where JOB_OD.PLANT_CD = JOB_CTRL.PLANT_CD
                                                              AND JOB_OD.JOB_ODR_CD =JOB_CTRL.JOB_ODR_CD );
         LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0824)���v�ʌv�Z����(����)�폜�����F'||SQL%ROWCOUNT); --A
        /**********************
        * �o���������ް��폜  *
        **********************/

--vc2RunChkComment := '���������ʉ� 00470';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

            --�o���������ް��폜����O�ɁA�o�������т̍폜�Ώ��ް��ɑ΂����Ǝ��т̏o�������єԍ��̏��������s��
            update T_OPR_RSLT set output_rslt_cd = ''
                where opr_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd') --A
                  and plant_CD = pvc2PlantCd;     --A

            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0764)��Ǝ��т̏o�������єԍ��̏�����'); --A

--vc2RunChkComment := '���������ʉ� 00480';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

            --�o���������ް��폜
            delete from T_OUTPUT_RSLT
                where opr_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd')
                  and plant_CD = pvc2PlantCd;     --A

            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0765)�o�������э폜�����F'||SQL%ROWCOUNT); --A

       /***************************
        * �w���i�ԕi�����ް��폜  *
        ***************************/

--vc2RunChkComment := '���������ʉ� 00490';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

            --�w���i�ԕi�����ް��폜
            delete from T_PUCH_ODR_RTN_RSLT
                where puch_rtn_date <= to_date(lvc2PchOdRtnRst_period,'yyyy/mm/dd')
                  and plant_CD = pvc2PlantCd;     --A

            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0825)�w���i�ԕi���э폜�����F'||SQL%ROWCOUNT); --A



--vc2RunChkComment := '���������ʉ� 00500';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--vc2RunChkComment := '���������ʉ� 00510';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--vc2RunChkComment := '���������ʉ� 00520';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

     /***************************************************************
     *  ���̑����ް��폜 (���v�ʱװ�ؽĤ�Ɩ�ү���ޤ����ޤ�o�וۗ�)  *
     ***************************************************************/

    LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                            pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0766)���� ���̑��̃f�[�^ ����'); --A


--vc2RunChkComment := '���������ʉ� 00530';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        --���v�ʱװ�ؽ��ް��폜
        delete from T_OD_ALARM AL
            where AL.od_alarm_flg = 1
              and AL.plant_CD = pvc2PlantCd --A
              and AL.mrp_date <= to_date(lvc2OdAlm_period,'yyyy/mm/dd');

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0767)���v�ʱװ�ؽč폜�����F'||SQL%ROWCOUNT); --A

--vc2RunChkComment := '���������ʉ� 00540';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        --�Ɩ�ү�����ް��폜
        delete from SYS_MSG_LOG
            where updated_date is not null
              and plant_CD = pvc2PlantCd --A
              and updated_date <= to_date(lvc2BusinessMsg_period,'yyyy/mm/dd');

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0768)�Ɩ�ү���ލ폜�����F'||SQL%ROWCOUNT); --A

--vc2RunChkComment := '���������ʉ� 00550';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--vc2RunChkComment := '���������ʉ� 00560';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        --���i�\���g�����U�N�V����lvc2ForPsT_period
        --�H��w��Ȃ��ō폜 --A
        delete from SYS_PS_T
            where UPDATED_DATE <= to_date(lvc2ForPsT_period,'yyyy/mm/dd') --A
              and cmplt_flg = 1;

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0769)���i�\���g�����U�N�V�����F'||SQL%ROWCOUNT);--A

--vc2RunChkComment := '���������ʉ� 00570';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        --�O���v��폜
            delete from T_EXTERNAL_PLAN EP
                where not exists( select od_no from T_OD where EP.od_no = T_OD.od_no )
                  and UPDATED_DATE <= to_date(lvc2Mrp_period,'yyyy/mm/dd')
                  and EXTERNAL_PLAN_EXP_TYP = 9
                  and plant_CD = pvc2PlantCd;

--vc2RunChkComment := '���������ʉ� 00580';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
--//�Ɩ��I���̃��b�Z�[�W

    lvc2Comment := '�g�����U�N�V�����f�[�^�폜�����Ώ۔N���F[ '|| pvcDeleteProcExecDate || ' ]';

    LBlnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_END,'(SBM0387)' || LOGMSG_END_PGNM_DeleteProc || lvc2Comment); --A


    commit;

--//TraceLog�̏o�͏������s��

    LBlnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                           pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END); --A

    /* LogFile �� CLOSE */
    LblnRet := FncLogClose(UTL_FileHandle);

--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �I�� ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));


--< ��O���� >---------------------------------------------------------------
exception

WHEN excMaxcount THEN   --�ێ�����ð��ق̎擾�������W���ȉ�
--DBMS_OUTPUT.PUT_LINE('excMaxcount')3;
            rollback;
            --//�Ɩ��I���̃��b�Z�[�W
            lvc2Comment := '�g�����U�N�V�����f�[�^�폜�����Ώ۔N���F[ '|| pvcDeleteProcExecDate || ' ]';
            lvc2Comment2 := '�ێ�����ð��ق̎擾�������V���ȉ��ł��B';
            LBlnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId,
                                 pvc2BusinessName,
                                 pvc2PlantCd, --A
                                 MY_SQL_NAME,
                                 APS_COM_BATCH_END,
                                '(SBM0388)' || LOGMSG_END_PGNM_DeleteProc || lvc2Comment ||  LOGMSG_ERR || '�F' || lvc2Comment2);

            --�g���[�X���O�iend�j

            LBlnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END);

            commit;
            /* LogFile �� CLOSE */
            LblnRet := FncLogClose(UTL_FileHandle);

WHEN excSys_Mnt_Period_NULL THEN   --�擾ð��ق�NULL
--DBMS_OUTPUT.PUT_LINE('excSys_Mnt_Period_NULL');
            rollback;
            IF cur_Sys_Mnt_Period%ISOPEN = TRUE THEN
              CLOSE cur_Sys_Mnt_Period;
            END IF;
            --//�Ɩ��I���̃��b�Z�[�W
            lvc2Comment := '�g�����U�N�V�����f�[�^�폜�����Ώ۔N���F[ '|| pvcDeleteProcExecDate || ' ]';
            lvc2Comment2 := '�ێ�����ð��ق̕ێ����敪��NULL�ł��B';
            LBlnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId,
                                 pvc2BusinessName,
                                 pvc2PlantCd, --A
                                 MY_SQL_NAME,
                                 APS_COM_BATCH_END,
                                 '(SBM0389)' || LOGMSG_END_PGNM_DeleteProc || lvc2Comment ||  LOGMSG_ERR || '�F' || lvc2Comment2);
            --�g���[�X���O�iend�j

            LBlnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END); --A

            commit;
            /* LogFile �� CLOSE */
            LblnRet := FncLogClose(UTL_FileHandle);
WHEN excPARAMETER_ERR THEN

        /* ���[���o�b�N */
        ROLLBACK;

        /* �J�[�\���b�k�n�r�d*/
        IF cur_Sys_Mnt_Period%ISOPEN = TRUE THEN
            CLOSE cur_Sys_Mnt_Period;
        END IF
        ;
        lvc2Comment := '�g�����U�N�V�����f�[�^�폜�����Ώ۔N���F[ '|| pvcDeleteProcExecDate || ' ]';
        LBlnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId,
                                 pvc2BusinessName,
                                 pvc2PlantCd, --A
                                 MY_SQL_NAME,
                                 vc2ErrCd,
                                 vc2ErrDetail);

        LBlnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_END,
                            '(SBM0390)' || LOGMSG_BATCH_EXP || lvc2Comment);


        /* �g���[�X���O�̏o��(�I��) */
        LBlnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId,pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, METHOD_END);

        COMMIT;

       LblnRet := FncLogClose(UTL_FileHandle);
WHEN OTHERS THEN   --���̑��̃G���[
--DBMS_OUTPUT.PUT_LINE('excOTHERS');
            rollback;
            IF cur_Sys_Mnt_Period%ISOPEN = TRUE THEN
              CLOSE cur_Sys_Mnt_Period;
            END IF;
            lvc2Comment := '�g�����U�N�V�����f�[�^�폜�����Ώ۔N���F[ '|| pvcDeleteProcExecDate || ' ]';
            lvc2Comment2 := SUBSTR(SQLCODE || ',' || SUBSTR(SQLERRM,1,256),1,256);
            LBlnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId,
                                 pvc2BusinessName,
                                 pvc2PlantCd, --A
                                 MY_SQL_NAME,
                                 APS_COM_ORACLE_ERR,
                                 lvc2Comment2);
            LBlnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId,
                                 pvc2BusinessName,
                                 pvc2PlantCd, --A
                                 MY_SQL_NAME,
                                 APS_COM_BATCH_END,
                                '(SBM0391)' || LOGMSG_END_PGNM_DeleteProc || lvc2Comment || LOGMSG_ERR);
            /* TraceLog �̏o�́i���s�ʒu�j */

            LblnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                  pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                  MY_SQL_NAME, METHOD_END || vc2RunChkComment); --A

            --�g���[�X���O�iend�j

            LBlnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END);

            commit;
            /* LogFile �� CLOSE */
            LblnRet := FncLogClose(UTL_FileHandle);
end;
/
