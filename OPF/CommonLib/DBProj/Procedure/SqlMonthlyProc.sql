CREATE OR REPLACE procedure SQLMONTHLYPROC(
/*------------------------------------------------------------------------------
'
' version   : 1.00.00
'
' �C������
' 2003.10.18 �V�K�쐬
' 2005.10.24 unicode�Ή��ivarchar2��4�{�j
' 2014.03.02 ��Ł@���o�ɏ��x�[�X�����݌ɏ����Ή�
''
' �@�\      : ��������
'
' ������    : pvc2LogMode          - (i)�k�n�f���[�h
'             pvc2OutputMode       - (i)�o�̓��[�h
'             pvc2OutputPath       - (i)�o�̓t�@�C���p�X
'             pvc2OutputName       - (i)�o�̓t�@�C����
'             pvc2UserId           - (i)���[�U�h�c
'             pvc2BusinessName     - (i)�Ɩ���
'             pvc2PlantCd          - (i)�H��R�[�h
'             pvc2MonthlyDate      - (i)���������Ώۓ�
'
' �@�\����  : �����̍݌ɂ̒��ߏ������s���B
' ���l      :
'
------------------------------------------------------------------------------*/
--< �v���V�[�W������` >-----------------------------------------------------
    pVc2LogMode         IN  VARCHAR2,       --// �k�n�f���[�h
    pVc2OutputMode      IN  VARCHAR2,       --// �o�̓��[�h
    pVc2OutputPath      IN  VARCHAR2,       --// �o�̓t�@�C���p�X
    pVc2OutputName      IN  VARCHAR2,       --// �o�̓t�@�C����
    pvc2UserId          IN  VARCHAR2,       --// ���[�U��
    pvc2BusinessName    IN  VARCHAR2,       --// �Ɩ���
    pvc2PlantCd         IN  VARCHAR2,       --// �H��R�[�h
    pvc2MonthlyDate     IN  VARCHAR2        --// ���������Ώۓ�
    ) is
    --// ���R�[�h�̒�`
    /* �萔�̐錾 */
        METHOD_START                    VARCHAR2(20)  := 'Start';      --���O�p���\�b�h�J�n�錾
        METHOD_END                      VARCHAR2(12)  := 'End';        --���O�p���\�b�h�I���錾
        MY_SQL_NAME                     VARCHAR2(56) := 'SqlMonthlyProc'; --�o�k�^�r�p�k��
        LOGMSG_START_PGNM_MonthlyProc   VARCHAR2(72) := '<< ���������J�n >>';
        LOGMSG_END_PGNM_MonthlyProc     VARCHAR2(72) := '<< ���������I�� >>';
        LOGMSG_ERR                      VARCHAR2(32)  := '�ُ�I��';
        APS_COM_BATCH_START             VARCHAR2(28)    := 'ZZ09001';  --�o�b�`�������J�n���܂���  --A
        APS_COM_BATCH_END               VARCHAR2(28)    := 'ZZ09002';  --�o�b�`�������I�����܂���  --A
        APS_COM_NOTEXIST_DATA           VARCHAR2(28)    := 'AD00067'; --�Ώۃf�[�^�����݂��܂���     --A
        APS_COM_NOTPRIMARY              VARCHAR2(28)    := 'AD00068'; --�f�[�^���Q���ȏ㑶�݂��܂�   --A
        LCTRL_CD_DEFAULT                VARCHAR2(100) := 'SYSTEM';
        excSysFinalMonthlyProcCtrl      EXCEPTION;              --������������ð��ٓǍ����s
    --// �ϐ��̒�`
        UTL_FileHandle                  UTL_FILE.FILE_TYPE; --�t�@�C���n���h��
        lnumterm_curr                   NUMBER(5);          --������������ð��ٌ����J�E���g�p
        lBlnRet                         boolean;            --���ʊ֐��̖ߒl
        lvc2Comment                     VARCHAR2(1024);
        lvc2Comment2                    VARCHAR2(1024);
        vc2RunChkComment                VARCHAR2(1024);      --���s�ʒu�m�F�p�R�����g�쐬��Ɨ̈�
        monthendstockflg                NUMBER;             --�����݌ɍ쐬�����̊�����Ԕ���p�t���O
        vc2ErrCodeRt                    VARCHAR2(100);      -- �G���[�R�[�h�i�[�߂�p
        vc2ErrCode                      VARCHAR2(100);      -- �G���[�R�[�h�i�[�p
    --// ��O�����p�ϐ�
        excERR_CALLPROC                 EXCEPTION;          -- �����݌ɍ쐬�������s
--<���C������ >-----------------------------------------------------
begin
--DBMS_OUTPUT.ENABLE(1000000);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �J�n ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
vc2RunChkComment := NULL;
    /* LogFile �� OPEN */
        LblnRet := FncLogOpen(pvc2OutputPath, pvc2OutputName, pvc2PlantCd, pvc2OutputMode, UTL_FileHandle); --A
    --//TraceLog�̏o��(Start)�������s��
        LBlnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_START); --A
    --//�Ɩ��J�n�̃��b�Z�[�W�擾
    lvc2Comment := '�H��R�[�h�F[ '|| pvc2PlantCd ||' ]';--A
        LBlnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_START,'(SBM0445)'|| LOGMSG_START_PGNM_MonthlyProc || lvc2Comment); --A
        commit;
vc2RunChkComment := '���������ʉ� 00010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
        --//�ۊǋ�ʕi�ڍ݌�ð��ق̍X�V
        update t_item_stock set prvs_monthend_stock_qty = stock_on_hand_qty,
                                updated_date = sysdate,
                                updated_by = pvc2UserId,
                                updated_prg_nm = MY_SQL_NAME,
                                modify_count = (modify_count + 1)
                            where stock_on_hand_qty <> prvs_monthend_stock_qty and
                                  plant_cd = pvc2PlantCd; --A
vc2RunChkComment := '���������ʉ� 00020';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
        --//�ۊǋ�ʐ��ԍ݌�ð��ق̍X�V
        update t_job_odr_cd_stock set prvs_monthend_stock_qty = stock_on_hand_qty,
                                updated_date = sysdate,
                                updated_by = pvc2UserId,
                                updated_prg_nm = MY_SQL_NAME,
                                modify_count = (modify_count + 1)
                            where stock_on_hand_qty <> prvs_monthend_stock_qty and
                                  plant_cd = pvc2PlantCd; --A
vc2RunChkComment := '���������ʉ� 00021'; --A
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment); --A
        --//���ꌎ�ď������p�ɁA����������[�����i�ڍ݌�]�̍폜 --A
          delete T_MONTHLY_ITEM_STOCK
                      where plant_cd = pvc2PlantCd and 
                            monthly_proc_exec_date = pvc2MonthlyDate ; --A
vc2RunChkComment := '���������ʉ� 00022'; --A
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment); --A
        --//���ꌎ�ď������p�ɁA����������[�������ԍ݌�]�̍폜 --A
          delete T_MONTHLY_JOB_ODR_CD_STOCK
                      where plant_cd = pvc2PlantCd and 
                            monthly_proc_exec_date = pvc2MonthlyDate ; --A
vc2RunChkComment := '���������ʉ� 00023'; --A
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment); --A
        --//[�����i�ڍ݌�]�̃R�s�[�o�^ --A
          Insert Into T_MONTHLY_ITEM_STOCK (
                 MONTHLY_PROC_EXEC_DATE,
                 ITEM_CD,
                 WH_CD,
                 PLANT_CD,
                 STOCK_ON_HAND_QTY,
                 DEFECT_QTY,
                 PRVS_DAYEND_STOCK_QTY,
                 PRVS_MONTHEND_STOCK_QTY,
                 PRVS_TERMEND_STOCK_QTY,
                 CREATED_DATE,
                 CREATED_BY,
                 CREATED_PRG_NM,
                 UPDATED_DATE,
                 UPDATED_BY,
                 UPDATED_PRG_NM,
                 MODIFY_COUNT)
          Select
                 pvc2MonthlyDate,
                 ITEM_CD,
                 WH_CD,
                 PLANT_CD,
                 STOCK_ON_HAND_QTY,
                 DEFECT_QTY,
                 PRVS_DAYEND_STOCK_QTY,
                 PRVS_MONTHEND_STOCK_QTY,
                 PRVS_TERMEND_STOCK_QTY,
                 sysdate,
                 pvc2UserId,
                 MY_SQL_NAME,
                 sysdate,
                 pvc2UserId,
                 MY_SQL_NAME,
                 0
          From T_ITEM_STOCK
          where PLANT_CD = pvc2PlantCd ; --A
vc2RunChkComment := '���������ʉ� 00023'; --A
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment); --A
        --//[�������ԍ݌�]�̃R�s�[�o�^ --A
          Insert Into T_MONTHLY_JOB_ODR_CD_STOCK (
                 MONTHLY_PROC_EXEC_DATE,
                 JOB_ODR_CD,
                 JOB_ODR_DETAIL_NO,
                 ITEM_CD,
                 WH_CD,
                 PLANT_CD,
                 STOCK_ON_HAND_QTY,
                 PRVS_DAYEND_STOCK_QTY,
                 PRVS_MONTHEND_STOCK_QTY,
                 PRVS_TERMEND_STOCK_QTY,
                 CREATED_DATE,
                 CREATED_BY,
                 CREATED_PRG_NM,
                 UPDATED_DATE,
                 UPDATED_BY,
                 UPDATED_PRG_NM,
                 MODIFY_COUNT)
          Select
                 pvc2MonthlyDate,
                 JOB_ODR_CD,
                 JOB_ODR_DETAIL_NO,
                 ITEM_CD,
                 WH_CD,
                 PLANT_CD,
                 STOCK_ON_HAND_QTY,
                 PRVS_DAYEND_STOCK_QTY,
                 PRVS_MONTHEND_STOCK_QTY,
                 PRVS_TERMEND_STOCK_QTY,
                 sysdate,
                 pvc2UserId,
                 MY_SQL_NAME,
                 sysdate,
                 pvc2UserId,
                 MY_SQL_NAME,
                 0
          From T_JOB_ODR_CD_STOCK
          where PLANT_CD = pvc2PlantCd ; --A
vc2RunChkComment := '���������ʉ� 00030';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
        --//�����݌ɍ쐬����PL/SQL�Ăяo��
        SQLCREATEMONTHENDSTOCK(pVc2LogMode,        --// �k�n�f���[�h
                                   pVc2OutputMode,     --// �o�̓��[�h
                                   pVc2OutputPath,     --// �o�̓t�@�C���p�X
                                   null,               --// �o�̓t�@�C�����i�Ăѐ�Őݒ肷�邽��NULL�j
                                   pvc2UserId,         --// ���[�U��
                                   pvc2BusinessName,   --// �Ɩ���
                                   pvc2PlantCd,        --// �H��R�[�h
                                   pvc2MonthlyDate,    --// ���������Ώۓ�
                                   monthendstockflg,   --//�������� (1:����I���A2:�ُ�I��)
                                   vc2ErrCode);
        if monthendstockflg = 2 then
            raise excERR_CALLPROC;
        end if;
        --//������������ð��ق̍X�V
        select count(*) into lnumterm_curr from sys_monthly_proc_ctrl
            where plant_cd = pvc2PlantCd; --A
vc2RunChkComment := '���������ʉ� 00040';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            if lnumTerm_Curr <>  1 then
vc2RunChkComment := '���������ʉ� 00050';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                if lnumTerm_Curr = 0 then --�擾�f�[�^�Ȃ�
vc2RunChkComment := '���������ʉ� 00060';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    LBlnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                        pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                        MY_SQL_NAME,APS_COM_NOTEXIST_DATA,''); --A
                    RAISE excSysFinalMonthlyProcCtrl;
                else --�Q���ȏ�̎擾
vc2RunChkComment := '���������ʉ� 00070';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    LBlnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                        pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                        MY_SQL_NAME,APS_COM_NOTPRIMARY,''); --A
                    RAISE excSysFinalMonthlyProcCtrl;
                end if;
            else
vc2RunChkComment := '���������ʉ� 00080';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                --������������ð��ق̍X�V
                update sys_monthly_proc_ctrl set final_monthly_proc_exec_date = pvc2MonthlyDate,
                                updated_date = sysdate,
                                updated_by = pvc2UserId,
                                updated_prg_nm = MY_SQL_NAME,
                                modify_count = (modify_count + 1)
                            where plant_cd = pvc2PlantCd; --A
            end if;
    --//�Ɩ��I���̃��b�Z�[�W
    lvc2Comment := '���������Ώ۔N���F[ '|| pvc2MonthlyDate ||' ]';
    lvc2Comment2 := '�H��R�[�h�F[ '|| pvc2PlantCd ||' ]';--A
    LBlnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_END,'(SBM0446)' || LOGMSG_END_PGNM_MonthlyProc || lvc2Comment2 || lvc2Comment); --A
    commit;
    --//TraceLog�̏o�͏������s��
    LBlnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END); --A
    /* LogFile �� CLOSE */
    LblnRet := FncLogClose(UTL_FileHandle);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �I�� ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
--< ��O���� >---------------------------------------------------------------
exception
    when excSysFinalMonthlyProcCtrl then    --//������������ð��ٓǍ����s
--DBMS_OUTPUT.PUT_LINE('excSysFinalMonthlyProcCtrl');
            --���[���o�b�N
            rollback;
            --//�Ɩ��I���̃��b�Z�[�W
            --�ُ폈���I���������Ƃ�ʒm
            lvc2Comment := '���������Ώ۔N���F[ '|| pvc2MonthlyDate ||' ]';
            lvc2Comment2 := '������������ð��ٓǍ��Ɏ��s���܂����B';
            LBlnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId,
                                 pvc2BusinessName,
                                 pvc2PlantCd,
                                 MY_SQL_NAME,
                                 APS_COM_BATCH_END,
                                '(SBM0447)' || LOGMSG_END_PGNM_MonthlyProc  || LOGMSG_ERR ||'�F'|| lvc2Comment|| lvc2Comment2); --A
            --�g���[�X���O�iend�j
            LBlnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END); --A
            commit;
            /* LogFile �� CLOSE */
            LblnRet := FncLogClose(UTL_FileHandle);
    when excERR_CALLPROC then        --//�����݌ɍ쐬�������s
--DBMS_OUTPUT.PUT_LINE('excSysFinalMonthlyProcCtrl');
            --���[���o�b�N
            rollback;
            IF vc2ErrCode IS NOT NULL THEN 
            lvc2Comment := '���������Ώ۔N���F[ '|| pvc2MonthlyDate ||' ]';
	    LBlnRet := 	FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
						  pvc2PlantCd, MY_SQL_NAME, vc2ErrCode,
						  lvc2Comment);
            END IF;
            --//�Ɩ��I���̃��b�Z�[�W
            --�ُ폈���I���������Ƃ�ʒm
            lvc2Comment := '���������Ώ۔N���F[ '|| pvc2MonthlyDate ||' ]';
            lvc2Comment2 := '�����݌ɍ쐬�����Ɏ��s���܂����B';
            LBlnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId,
                                 pvc2BusinessName,
                                 pvc2PlantCd,
                                 MY_SQL_NAME,
                                 APS_COM_BATCH_END,
                                 '(SBM1298)' || LOGMSG_END_PGNM_MonthlyProc  || LOGMSG_ERR ||'�F'|| lvc2Comment|| lvc2Comment2); --A
            --�g���[�X���O�iend�j
            LBlnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END); --A
            commit;
            /* LogFile �� CLOSE */
            LblnRet := FncLogClose(UTL_FileHandle);
    WHEN OTHERS THEN   --���̑��̃G���[
--DBMS_OUTPUT.PUT_LINE('excOTHERS');
            --���[���o�b�N
            rollback;
            --//�Ɩ��I���̃��b�Z�[�W
            --�ُ폈���I���������Ƃ�ʒm
            lvc2Comment := '���������Ώ۔N���F[ '|| pvc2MonthlyDate ||' ]';
            lvc2Comment2 := SUBSTR(SQLCODE || ',' || SUBSTR(SQLERRM,1,256),1,256);
            LBlnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId,
                                 pvc2BusinessName,
                                 pvc2PlantCd,
                                 MY_SQL_NAME,
                                 APS_COM_BATCH_END,
                                '(SBM0448)' || LOGMSG_END_PGNM_MonthlyProc || LOGMSG_ERR ||'�F'|| lvc2Comment ||  lvc2Comment2); --A
            /* TraceLog �̏o�́i���s�ʒu�j */
            LblnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                  pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                  MY_SQL_NAME, METHOD_END || vc2RunChkComment); --A
            --�g���[�X���O�iend�j
            LBlnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END); --A
            commit;
            /* LogFile �� CLOSE */
            LblnRet := FncLogClose(UTL_FileHandle);
end;
/
