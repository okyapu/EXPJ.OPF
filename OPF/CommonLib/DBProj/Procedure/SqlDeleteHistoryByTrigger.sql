create or replace procedure SQLDELETEHISTORYBYTRIGGER(
/*------------------------------------------------------------------------------
' $Id: SqlDeleteHistoryByTrigger.sql,v 1.4 2011/12/23 03:19:48 feng-yi Exp $
'
' version   : 1.00.00
'
' �C������
' 2008/08/12�V�K�쐬
'
' �@�\      : �폜����
'
' ������    : pvc2LogMode           - (i)�k�n�f���[�h
'             pvc2OutputMode        - (i)�o�̓��[�h
'             pvc2OutputPath        - (i)�o�̓t�@�C���p�X
'             pvc2OutputName        - (i)�o�̓t�@�C����
'             pvc2UserId            - (i)���[�U�h�c
'             pvc2BusinessName      - (i)�Ɩ���
'             pvc2PlantCd          - (i)�H��R�[�h
'             pvcDeleteProcExecDate - (i)�폜������N��
'
' �@�\����  : �ݒ肵���ێ����ԊO�̗����ް��̍폜���s���B
' ���l      :
'
------------------------------------------------------------------------------*/

--< �v���V�[�W������` >-----------------------------------------------------
     pvc2LogMode            IN  VARCHAR2    --// �k�n�f���[�h
    ,pvc2OutputMode         IN  VARCHAR2    --// �o�̓��[�h
    ,pvc2OutputPath         IN  VARCHAR2    --// �o�̓t�@�C���p�X
    ,pvc2OutputName         IN  VARCHAR2    --// �o�̓t�@�C����
    ,pvc2UserId               IN   VARCHAR2    --// ���[�U��
    ,pvc2BusinessName       IN  VARCHAR2    --// �Ɩ���
    ,pvc2PlantCd              IN  VARCHAR2    --�H��R�[�h
    ,pvcDeleteProcExecDate  IN  VARCHAR2    --// �폜������N��
    ) IS

    --// ���R�[�h�̒�`

    /* �萔�̐錾 */
        METHOD_START                    VARCHAR2(20)  := 'Start';            --���O�p���\�b�h�J�n�錾
        METHOD_END                      VARCHAR2(12)  := 'End';              --���O�p���\�b�h�I���錾
        MY_SQL_NAME                     VARCHAR2(52) := 'SqlDeleteHistoryByTrigger';    --�o�k�^�r�p�k��
        LOGMSG_START_PGNM_DeleteProc    VARCHAR2(160) := '<< ���������폜�����J�n >>';
        LOGMSG_END_PGNM_DeleteProc      VARCHAR2(160) := '<< ���������폜�����I�� >>';
        LOGMSG_ERR                      VARCHAR2(32) := '�ُ�I��';

        APS_COM_BATCH_START             VARCHAR2(28)    := 'ZZ09001';  --�o�b�`�������J�n���܂���  --A
        APS_COM_BATCH_END               VARCHAR2(28)    := 'ZZ09002';  --�o�b�`�������I�����܂���  --A
        APS_COM_ORACLE_ERR              VARCHAR2(28)    := 'AK53401';  --oracle�G���[ --A
        EXCHISTORY_PERIOD_NULL          EXCEPTION;  --�擾�ێ����Ԃ̒l��NULL
        EXCHISTORY_PERIOD_EXC          EXCEPTION;  --�擾�ێ����Ԃ�0-100�̐����ł͂Ȃ�


    --// �ϐ��̒�`
        UTL_FileHandle                  UTL_FILE.FILE_TYPE; --�t�@�C���n���h��
        vc2Sql                      VARCHAR2(4096); --���I�r�p�k�p
        lintdeleteHsCur              INTEGER;        --�J�[�\���h�c
        lintRet      INTEGER;              --�֐��߂�l
        lvc2HsTable                 VARCHAR2(40);   --����
        lvc2APPRID                  VARCHAR2(100);   --���FID
        lvc2DeletePeriod                 VARCHAR2(1024);   --�ێ�����
        lnumDeleteDate         NUMBER(6);   ---�폜������N���̌���
        lvc2HistoryPeriod                 VARCHAR2(40);   --����ێ�����
        lvc2LastLineDate                  VARCHAR2(40);   --�ŏI�X�V��
        ldtmBusinessdate                DATE;           --�Ɩ����t�擾�p
        lvc2WkDateTime                  VARCHAR2(76);   --���t�ҏW�p
        lblnRet                         boolean;        --���ʊ֐��̖ߒl
        lvc2Comment                     VARCHAR2(1024);  --�R�����g�쐬�p
        lvc2Comment2                    VARCHAR2(1024);  --�R�����g�쐬�p
        vc2RunChkComment                VARCHAR2(1024);  --���s�ʒu�m�F�p�R�����g�쐬��Ɨ̈�

    --// �J�[�\���̐錾

    --// ����ð��ق̓Ǎ�
    cursor cur_Hs_List (
        c_TALBE_NAME      VARCHAR2
        )is
        select   *
        from   user_tables
        where table_name  like c_TALBE_NAME ESCAPE '\' ;

        ltyp_Hs_List  cur_Hs_List%ROWTYPE;     --����ð��ق̓Ǎ�
        
     --// �}�X�^���F�˗��e�[�u���̓Ǎ�
     CURSOR curMST_APPR(
      ctypYearMonth      VARCHAR2
     )IS
     SELECT * FROM MST_APPR
     WHERE APPR_DATE < TO_DATE(ctypYearMonth,'YYYY/MM/DD');
     
     recMST_APPR curMST_APPR%ROWTYPE;         --�}�X�^���F�˗��e�[�u���̓Ǎ�

     --/* �����֐� */
     /*------------------------------------------------------------------------------
     ' numChk
     ' SubFncDateFormatChk
'
     ' �@�\      : num�`�F�b�N
     ' ������    : pvc2ChkNum     - (i)�`�F�b�N�Ώ�')
     ' �߂�l    : BOOLEAN           TRUE  = ����
     '                               FALSE = �ُ�
     ' �@�\����  : �`�F�b�N�Ώۂ̃t�H�[�}�b�g�Ɠ��e�̐��ۃ`�F�b�N���s���B
     ' ���l      : ���ɂȂ�
     ------------------------------------------------------------------------------*/


     FUNCTION  numChk(
         pvc2ChkNum         IN  VARCHAR2  --���͑Ώ�
           ) RETURN BOOLEAN IS
               BEGIN
                  select  to_number(pvc2ChkNum) into lvc2DeletePeriod from dual;
                       IF lvc2DeletePeriod < 0 OR  lvc2DeletePeriod > 100 THEN
                        RETURN FALSE;
                        END IF;
                       RETURN TRUE;
                 EXCEPTION
                    WHEN OTHERS THEN
                        RETURN FALSE;
                END numChk;



--<���C������ >-----------------------------------------------------
begin

vc2RunChkComment := NULL;

    /* LogFile �� OPEN */

       lblnRet := FncLogOpen(pvc2OutputPath, pvc2OutputName , pvc2PlantCd,pvc2OutputMode, UTL_FileHandle); --A

    --//TraceLog�̏o��(Start)�������s��

        lblnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                            pvc2UserId,pvc2BusinessName, pvc2PlantCd,MY_SQL_NAME,METHOD_START); --A

    --//�Ɩ��J�n�̃��b�Z�[�W�擾

    lvc2Comment := '�폜������N���F[ '|| pvcDeleteProcExecDate ||' ]';--A
        LBlnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_START,'(SBM0369)' || LOGMSG_START_PGNM_DeleteProc || lvc2Comment); --A

        commit;

/***********************
*    �ŏI�X�V�� �̎Z�o    *
************************/
     --deleteperiod  varchar2(30);
     -- lvc2DeletePeriod    sys_parameter.value%type;
       begin
        select    sys_parameter.value   into  lvc2DeletePeriod  from     sys_parameter
         where    sys_parameter.name = 'HISTORY_BY_TRIGGER_PERIOD';

            /**************************************************
            *�擾�����ێ�����null�ł���װү���ނ��o�͂���*
            **************************************************/
               if  lvc2DeletePeriod is null  then
                RAISE EXCHISTORY_PERIOD_NULL;
               end if;
               if (numChk(lvc2DeletePeriod) = false) then
                RAISE EXCHISTORY_PERIOD_EXC;
               end if;
            --�ŏI�X�V�� �̌v�Z
           lvc2LastLineDate :=
                  to_char(add_months(to_date(pvcDeleteProcExecDate||'/01','yyyy/mm/dd'),-lvc2DeletePeriod),'yyyy/mm/dd') ;

               EXCEPTION
                  WHEN NO_DATA_FOUND THEN
                       RAISE EXCHISTORY_PERIOD_NULL;
                  WHEN OTHERS THEN
                       RAISE;
         end ;
  /****************************************************************
  *                         �폜����                              *
  *****************************************************************/

        open cur_Hs_List ('HS\_%');
        loop
              fetch  cur_Hs_List  into ltyp_Hs_List;
              exit  when  cur_Hs_List%notfound;

             --����ð��كf�[�^�̍폜
              lvc2HsTable := ltyp_Hs_List.table_name;

              lintdeleteHsCur := DBMS_SQL.OPEN_CURSOR;
              vc2Sql := 'delete from ';
              vc2Sql := vc2Sql || lvc2HsTable;
              vc2Sql := vc2Sql || '  where ';
              vc2Sql := vc2Sql || lvc2HsTable|| '.UPDATED_DATE < to_date(''' || lvc2LastLineDate || ''',''yyyy/mm/dd'')';

             -- DBMS_OUTPUT.PUT_LINE(vc2Sql);
               -- �r�p�k�����
               DBMS_SQL.PARSE(lintdeleteHsCur,vc2Sql,DBMS_SQL.NATIVE);
               lintRet := DBMS_SQL.EXECUTE(lintdeleteHsCur);

        end loop;
        close  cur_Hs_List;
        
        
        OPEN curMST_APPR(lvc2LastLineDate);
        LOOP
            FETCH curMST_APPR INTO recMST_APPR;
            EXIT WHEN curMST_APPR%NOTFOUND;
            
            lvc2APPRID := recMST_APPR.Appr_Id;
            
            -- ���F�����׃f�[�^�폜
            DELETE FROM MST_APPR_DETAIL_LIST 
            WHERE MST_APPR_DETAIL_LIST.APPR_ID = lvc2APPRID;
            
            -- ���F���׃f�[�^�폜
            DELETE FROM MST_APPR_DETAIL
            WHERE MST_APPR_DETAIL.APPR_ID = lvc2APPRID;
            
            -- ���F�L�[�Ή��\�f�[�^�폜
            DELETE FROM MST_APPR_KEY
            WHERE MST_APPR_KEY.APPR_ID = lvc2APPRID;
            
            -- �}�X�^���F�f�[�^�폜
            DELETE FROM MST_APPR
            WHERE MST_APPR.APPR_ID = lvc2APPRID;
        
        END LOOP;
        
        CLOSE curMST_APPR;
        
       
--//�Ɩ��I���̃��b�Z�[�W

    lvc2Comment := '�폜�����Ώ۔N���F[ '|| pvcDeleteProcExecDate || ' ]';

    lblnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_END,'(SBM0370)' || LOGMSG_END_PGNM_DeleteProc || lvc2Comment); --A


    commit;


--//TraceLog�̏o�͏������s��

    lblnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                           pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END);

    /* LogFile �� CLOSE */
    lblnRet := FncLogClose(UTL_FileHandle);

--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �I�� ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));


--< ��O���� >---------------------------------------------------------------
exception

WHEN EXCHISTORY_PERIOD_NULL THEN   --�擾�ێ����Ԃ�NULL
            rollback;
            --//�Ɩ��I���̃��b�Z�[�W
            lvc2Comment := '�폜�����Ώ۔N���F[ '|| pvcDeleteProcExecDate || ' ]';
            lvc2Comment2 := 'DB�g���K�[��������ێ����Ԃ��擾�ł��܂���ł����B';
            lblnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId,
                                 pvc2BusinessName,pvc2PlantCd,
                                 MY_SQL_NAME,
                                 APS_COM_BATCH_END,
                                '(SBM0371)' || LOGMSG_END_PGNM_DeleteProc || lvc2Comment ||  LOGMSG_ERR || '�F' || lvc2Comment2);
            --�g���[�X���O�iend�j

            lblnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END); --A

            commit;
            /* LogFile �� CLOSE */
            lblnRet := FncLogClose(UTL_FileHandle);

WHEN EXCHISTORY_PERIOD_EXC THEN   --�擾�ێ����Ԃ�0-100�̐����ł͂Ȃ�
            rollback;
            --//�Ɩ��I���̃��b�Z�[�W
            lvc2Comment := '�폜�����Ώ۔N���F[ '|| pvcDeleteProcExecDate || ' ]';
            lvc2Comment2 := 'DB�g���K�[��������ێ����Ԃ�0����100�܂ł̐������łȂ���܂���B';
            lblnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId,
                                 pvc2BusinessName,pvc2PlantCd,
                                 MY_SQL_NAME,
                                 APS_COM_BATCH_END,
                                '(SBM0372)' ||  LOGMSG_END_PGNM_DeleteProc || lvc2Comment ||  LOGMSG_ERR || '�F' || lvc2Comment2);
            --�g���[�X���O�iend�j

            lblnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END); --A

            commit;
            /* LogFile �� CLOSE */
            lblnRet := FncLogClose(UTL_FileHandle);

WHEN OTHERS THEN   --���̑��̃G���[
            rollback;
            lvc2Comment := '�폜������N���F[ '|| pvcDeleteProcExecDate || ' ]';
            lvc2Comment2 := SUBSTR(SQLCODE || ',' || SUBSTR(SQLERRM,1,256),1,256);
            lblnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId,
                                 pvc2BusinessName,pvc2PlantCd,
                                 MY_SQL_NAME,
                                 APS_COM_ORACLE_ERR,
                                 lvc2Comment2);
            lblnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId,
                                 pvc2BusinessName,pvc2PlantCd,
                                 MY_SQL_NAME,
                                 APS_COM_BATCH_END,
                                '(SBM0373)' || LOGMSG_END_PGNM_DeleteProc || lvc2Comment || LOGMSG_ERR);
            /* TraceLog �̏o�́i���s�ʒu�j */

            lblnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                  pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                  MY_SQL_NAME, METHOD_END || vc2RunChkComment);
            --�g���[�X���O�iend�j

            lblnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END);

            commit;
            /* LogFile �� CLOSE */
            lblnRet := FncLogClose(UTL_FileHandle);
end;
/
