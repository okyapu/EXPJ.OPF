CREATE OR REPLACE PROCEDURE SQLCOMMITEMCHGEXEC(
/*------------------------------------------------------------------------------
'
' version   : 1.00.00
'
' �C������
' 2003.10.16 �V�K�쐬
' 2005.10.21 unicode�Ή��ivarchar2��4�{�j
'
' �@�\      : �̔����捞
'
' ������    : pvc2LogMode          - (i)�k�n�f���[�h
'             pvc2OutputMode       - (i)�o�̓��[�h
'             pvc2OutputPath       - (i)�o�̓t�@�C���p�X
'             pvc2OutputName       - (i)�o�̓t�@�C����
'             pvc2UserId           - (i)���[�U�h�c
'             pvc2BusinessName     - (i)�Ɩ���
'             pvc2PlantCd          - (i)�H��R�[�h
'             pvc2StepFlg          - (i)�X�e�b�v�t���O
'
' �@�\����  : �̔��Ǘ����琶�Y�v��������荞�݁A���i�R�[�h����
'             �i�ڔԍ��ւ̕ϊ����������s�����B
'             �i�X�e�b�v�t���O�i�������j�ɂ��A�����̐U�蕪���j
'
' ���l      :
'
------------------------------------------------------------------------------*/
    pvc2LogMode            IN  VARCHAR2    --�k�n�f���[�h
   ,pvc2OutputMode         IN  VARCHAR2    --�o�̓��[�h
   ,pvc2OutputPath         IN  VARCHAR2    --�o�̓t�@�C���p�X
   ,pvc2OutputName         IN  VARCHAR2    --�o�̓t�@�C����
   ,pvc2UserId             IN  VARCHAR2    --���[�U�h�c
   ,pvc2BusinessName       IN  VARCHAR2    --�Ɩ���
   ,pvc2PlantCd            IN  VARCHAR2       --// �H��R�[�h
   ,pvc2StepFlg            IN  VARCHAR2    --�X�e�b�v�t���O
)
IS


/* �J�[�\���̐錾 */

/* ROWTYPE �̐錾 */

/* �萔�̐錾 */
    MY_SQL_NAME                         VARCHAR2(72)  := 'SqlCommitemChgExec';
    PrdReqCtrlPRDREQSTARTDATE           NUMBER(2)     := 1;         --���Y�v�������J�n����
    PrdReqCtrlPRDREQENDDATE             NUMBER(2)     := 2;         --���Y�v�������I������
    PrdReqCtrlITEMCONVSTARTDATE         NUMBER(2)     := 3;         --���Y�v���쐬�����J�n����
    PrdReqCtrlITEMCONVENDDATE           NUMBER(2)     := 4;         --���Y�v���쐬�����I������
    PrdReqCtrlMRPDEMANDSTARTDATE        NUMBER(2)     := 5;         --�l�q�o�i�f�}���h���������J�n����
    PrdReqCtrlMRPDEMANDENDDATE          NUMBER(2)     := 6;         --�l�q�o�i�f�}���h���������I������
    PrdReqCtrlSHIPCONVSTARTDATE         NUMBER(2)     := 7;         --�o�חv���쐬�����J�n����
    PrdReqCtrlSHIPCONVENDDATE           NUMBER(2)     := 8;         --�o�חv���쐬�����I������
    PrdReqCtrlSTOCKISSUESTARTDATE       NUMBER(2)     := 9;         --�݌ɏo�ɏ����J�n����
    PrdReqCtrlSTOCKISSUEENDDATE         NUMBER(2)     := 10;        --�݌ɏo�ɏ����I������
    PrdReqCtrlMRPDEMANDSTARTUPDATE      NUMBER(2)     := 11;        --�l�q�o�i�f�}���h���эX�V�J�n����
    PrdReqCtrlMRPDEMANDENDUPDATE        NUMBER(2)     := 12;        --�l�q�o�i�f�}���h���эX�V�I������

/* EXCEPTION �̐錾 */
    excPARAMETER_ERR                    EXCEPTION;                  --�u�����v�G���[
    excPROC_RUN_ERR                     EXCEPTION;                  --�u�������N���v�G���[
    excPrdReqCtrl_ERR                   EXCEPTION;                  --�u���Y�v������v�X�V�G���[

/* MESSAGE �̐錾 */
    APS_COM_BATCH_START                 VARCHAR2(28)     := 'ZZ09001';     --�o�b�`�������J�n���܂���
    APS_COM_BATCH_END                   VARCHAR2(28)     := 'ZZ09002';     --�o�b�`�������I�����܂���
    APS_COM_ORACLE_ERR                  VARCHAR2(28)     := 'AK53401';     --�n�q�`�b�k�d�@�d�q�q�n�q
    APS_COM_OTHER_ERR                   VARCHAR2(28)     := 'AK53402';     --���̑��@�d�q�q�n�q

/* LOG �̐錾 */
    LOGMSG_START_PGNM                   VARCHAR2(120)  := '<< ���Y�v���쐬�������s�J�n >>';
    LOGMSG_END_PGNM                     VARCHAR2(120)  := '<< ���Y�v���쐬�������s�I�� >>';
    LOGMSG_START                        VARCHAR2(20)   := 'Start';       --���O�p���\�b�h�J�n�錾
    LOGMSG_END                          VARCHAR2(12)   := 'End';         --���O�p���\�b�h�I���錾
    LOGMSG_ERR                          VARCHAR2(32)   := '�ُ�I��';
    COMMENT_MSGLOG_COMMITEMSTART        VARCHAR2(104)  := '<< ���Y�v���쐬�����J�n >>';
    COMMENT_MSGLOG_COMMITEMEND          VARCHAR2(104)  := '<< ���Y�v���쐬�����I�� >>';
    COMMENT_MSGLOG_MAKEMRPDMNDST        VARCHAR2(124)  := '<< MRP�i�f�}���h���������J�n >>';
    COMMENT_MSGLOG_MAKEMRPDMNDEN        VARCHAR2(124)  := '<< MRP�i�f�}���h���������I�� >>';
    COMMENT_MSGLOG_SHIPCOMMSTART        VARCHAR2(120)  := '<< �o�חv���쐬�����J�n >>';
    COMMENT_MSGLOG_SHIPCOMMEND          VARCHAR2(120)  := '<< �o�חv���쐬�����I�� >>';
    COMMENT_MSGLOG_SHIPSTART            VARCHAR2(88)  := '<< �݌ɏo�ɏ����J�n >>';
    COMMENT_MSGLOG_SHIPEND              VARCHAR2(88)  := '<< �݌ɏo�ɏ����I�� >>';
    COMMENT_MSGLOG_MRPDMNDUPDSTART      VARCHAR2(140)  := '<< MRP�i�f�}���h���эX�V�����J�n >>';
    COMMENT_MSGLOG_MRPDMNDUPDEND        VARCHAR2(140)  := '<< MRP�i�f�}���h���эX�V�����I�� >>';

/* �ϐ��̐錾 SQL */

/* �ϐ��̐錾 WORK */
    blnRet                              BOOLEAN;            --BOOLEAN�^ �ԋp�l
    blnRet_PrdReqCtrl                   BOOLEAN;            --BOOLEAN�^ �ԋp�l
    vc2Comment                          VARCHAR2(1024);      --���b�Z�[�W�p�R�����g�쐬��Ɨ̈�
    lvc2Comment                         VARCHAR2(1024);      --A
    vc2RunChkComment                    VARCHAR2(1024);      --���s�ʒu�m�F�p�R�����g�쐬��Ɨ̈�
    UTL_FileHandle                      UTL_FILE.FILE_TYPE; --�t�@�C���n���h��

BEGIN

--DBMS_OUTPUT.ENABLE(1000000);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �J�n ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
vc2RunChkComment := NULL;

    /* LogFile �� OPEN */
         blnRet := FncLogOpen(pvc2OutputPath, pvc2OutputName, pvc2PlantCd, pvc2OutputMode, UTL_FileHandle); --A

    /* TraceLog �̏o�� */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,LOGMSG_START); --A

    /* �J�n���b�Z�[�W�̏o�� */

        lvc2Comment := '�H��R�[�h�F[ '|| pvc2PlantCd ||' ]';--A
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_START,'(SBM0282)' || LOGMSG_START_PGNM || lvc2Comment); --A
    COMMIT;


--vc2RunChkComment := '���������ʉ� 00010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);


    /* ���Y�v�������J�n�����̍X�V */
    blnRet_PrdReqCtrl := FncPrdReqCtrl(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                       pvc2UserId, pvc2BusinessName,pvc2PlantCd,     --U
                                       PrdReqCtrlPRDREQSTARTDATE);
    IF blnRet_PrdReqCtrl = FALSE THEN
        RAISE excPrdReqCtrl_ERR;
    END IF;


--vc2RunChkComment := '���������ʉ� 00020';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);


    /**********************************/
    /*          �����`�F�b�N          */
    /**********************************/
    IF (pvc2StepFlg < '0') or (pvc2StepFlg > '4') THEN
        /* �����G���[ */
        RAISE excPARAMETER_ERR;
    END IF;
    IF pvc2StepFlg IS NULL THEN
        /* �����G���[ */
        RAISE excPARAMETER_ERR;
    END IF;

    /**********************************/
    /*        ���Y�v����������        */
    /**********************************/
    IF pvc2StepFlg <= '0' THEN

--vc2RunChkComment := '���������ʉ� 00030';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        /* �Ɩ��J�n���b�Z�[�W�̏o�� */
        lvc2Comment := '�H��R�[�h�F[ '|| pvc2PlantCd ||' ]';--A
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,                          --U
                            MY_SQL_NAME, APS_COM_BATCH_START,'(SBM0291)' ||  COMMENT_MSGLOG_COMMITEMSTART || lvc2Comment);  --U

        /* ���Y�v�����������J�n�����̍X�V */
        blnRet_PrdReqCtrl := FncPrdReqCtrl(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                           pvc2UserId, pvc2BusinessName,pvc2PlantCd,         --U
                                           PrdReqCtrlITEMCONVSTARTDATE);
        IF blnRet_PrdReqCtrl = FALSE THEN
            RAISE excPrdReqCtrl_ERR;
        END IF;

        /* ���Y�v���������� */
        blnRet := FncCommitemChg(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId, pvc2BusinessName,pvc2PlantCd);   --U
        IF blnRet = FALSE THEN
            RAISE excPROC_RUN_ERR;
        END IF;

        /* ���Y�v�����������I�������̍X�V */
        blnRet_PrdReqCtrl := FncPrdReqCtrl(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                           pvc2UserId, pvc2BusinessName,pvc2PlantCd,     --U
                                           PrdReqCtrlITEMCONVENDDATE);
        IF blnRet_PrdReqCtrl = FALSE THEN
            RAISE excPrdReqCtrl_ERR;
        END IF;

        /* �Ɩ��I�����b�Z�[�W�̏o�� */
        lvc2Comment := '�H��R�[�h�F[ '|| pvc2PlantCd ||' ]';--A
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,                     --U
                            MY_SQL_NAME, APS_COM_BATCH_END,'(SBM0292)' ||  COMMENT_MSGLOG_COMMITEMEND || lvc2Comment);   --U
        COMMIT;
    END IF;


    /**********************************/
    /*      MRP�i�f�}���h��������     */
    /**********************************/
    IF pvc2StepFlg <= '1' THEN

--vc2RunChkComment := '���������ʉ� 00040';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        /* �Ɩ��J�n���b�Z�[�W�̏o�� */
        lvc2Comment := '�H��R�[�h�F[ '|| pvc2PlantCd ||' ]';--A
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,               --U
                            MY_SQL_NAME, APS_COM_BATCH_START, '(SBM0293)' || COMMENT_MSGLOG_MAKEMRPDMNDST || lvc2Comment);   --U

        /* �l�q�o�i�f�}���h���������J�n�����̍X�V */
        blnRet_PrdReqCtrl := FncPrdReqCtrl(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                           pvc2UserId, pvc2BusinessName,pvc2PlantCd,        --U
                                           PrdReqCtrlMRPDEMANDSTARTDATE);
        IF blnRet_PrdReqCtrl = FALSE THEN
            RAISE excPrdReqCtrl_ERR;
        END IF;

        /* MRP�i�f�}���h�������� */
        blnRet := FncMakeMrpDmnd(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId, pvc2BusinessName,pvc2PlantCd);         --U
        IF blnRet = FALSE THEN
            RAISE excPROC_RUN_ERR;
        END IF;

        /* �l�q�o�i�f�}���h���������I�������̍X�V */
        blnRet_PrdReqCtrl := FncPrdReqCtrl(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                           pvc2UserId, pvc2BusinessName,pvc2PlantCd,        --U
                                           PrdReqCtrlMRPDEMANDENDDATE);
        IF blnRet_PrdReqCtrl = FALSE THEN
            RAISE excPrdReqCtrl_ERR;
        END IF;

        /* �Ɩ��I�����b�Z�[�W�̏o�� */
        lvc2Comment := '�H��R�[�h�F[ '|| pvc2PlantCd ||' ]';--A
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,               --U
                            MY_SQL_NAME, APS_COM_BATCH_END,'(SBM0294)' ||  COMMENT_MSGLOG_MAKEMRPDMNDEN || lvc2Comment);   --U
        COMMIT;
    END IF;


    /**********************************/
    /*      �o�חv���쐬����      */
    /**********************************/
    IF pvc2StepFlg <= '2' THEN

--vc2RunChkComment := '���������ʉ� 00050';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        /* �Ɩ��J�n���b�Z�[�W�̏o�� */
        lvc2Comment := '�H��R�[�h�F[ '|| pvc2PlantCd ||' ]';--A
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,               --U
                            MY_SQL_NAME, APS_COM_BATCH_START, '(SBM0295)' || COMMENT_MSGLOG_SHIPCOMMSTART || lvc2Comment);   --U

        /* �o�חv���쐬�����J�n�����̍X�V */
        blnRet_PrdReqCtrl := FncPrdReqCtrl(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,       --U
                                           PrdReqCtrlSHIPCONVSTARTDATE);
        IF blnRet_PrdReqCtrl = FALSE THEN
            RAISE excPrdReqCtrl_ERR;
        END IF;

        /* �o�חv���쐬���� */
        blnRet := FncShpCommItemChg(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId, pvc2BusinessName,pvc2PlantCd);     --U
        IF blnRet = FALSE THEN
            RAISE excPROC_RUN_ERR;
        END IF;

        /* �o�חv���쐬�����I�������̍X�V */
        blnRet_PrdReqCtrl := FncPrdReqCtrl(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                           pvc2UserId, pvc2BusinessName,pvc2PlantCd,        --U
                                           PrdReqCtrlSHIPCONVENDDATE);
        IF blnRet_PrdReqCtrl = FALSE THEN
            RAISE excPrdReqCtrl_ERR;
        END IF;

        /* �Ɩ��I�����b�Z�[�W�̏o�� */
        lvc2Comment := '�H��R�[�h�F[ '|| pvc2PlantCd ||' ]';--A
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,               --U
                            MY_SQL_NAME, APS_COM_BATCH_END, '(SBM0296)' || COMMENT_MSGLOG_SHIPCOMMEND || lvc2Comment);   --U
        COMMIT;
    END IF;


    /**********************************/
    /*          �݌ɏo�ɏ���          */
    /**********************************/
    IF pvc2StepFlg <= '3' THEN

--vc2RunChkComment := '���������ʉ� 00060';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        /* �Ɩ��J�n���b�Z�[�W�̏o�� */
        lvc2Comment := '�H��R�[�h�F[ '|| pvc2PlantCd ||' ]';--A
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,               --U
                            MY_SQL_NAME, APS_COM_BATCH_START, '(SBM0297)' || COMMENT_MSGLOG_SHIPSTART || lvc2Comment);   --U

        /* �݌ɏo�ɏ����J�n�����̍X�V */
        blnRet_PrdReqCtrl := FncPrdReqCtrl(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                           pvc2UserId, pvc2BusinessName,pvc2PlantCd,        --U
                                           PrdReqCtrlSTOCKISSUESTARTDATE);
        IF blnRet_PrdReqCtrl = FALSE THEN
            RAISE excPrdReqCtrl_ERR;
        END IF;

        /* �݌ɏo�ɏ��� */
        blnRet := FncShipReq(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId, pvc2BusinessName,pvc2PlantCd);         --U
        IF blnRet = FALSE THEN
            RAISE excPROC_RUN_ERR;
        END IF;

        /* �݌ɏo�ɏ����I�������̍X�V */
        blnRet_PrdReqCtrl := FncPrdReqCtrl(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                           pvc2UserId, pvc2BusinessName,pvc2PlantCd,        --U
                                           PrdReqCtrlSTOCKISSUEENDDATE);
        IF blnRet_PrdReqCtrl = FALSE THEN
            RAISE excPrdReqCtrl_ERR;
        END IF;

        /* ���Y�v�������I�������̍X�V */
        blnRet_PrdReqCtrl := FncPrdReqCtrl(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                           pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                           PrdReqCtrlPRDREQENDDATE);
        IF blnRet_PrdReqCtrl = FALSE THEN
            RAISE excPrdReqCtrl_ERR;
        END IF;

        /* �Ɩ��I�����b�Z�[�W�̏o�� */
        lvc2Comment := '�H��R�[�h�F[ '|| pvc2PlantCd ||' ]';--A
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,               --U
                            MY_SQL_NAME, APS_COM_BATCH_END, '(SBM0298)' || COMMENT_MSGLOG_SHIPEND || lvc2Comment);   --U
        COMMIT;
    END IF;

    /* �I�����b�Z�[�W�̏o�� */
    lvc2Comment := '�H��R�[�h�F[ '|| pvc2PlantCd ||' ]';--A
    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                        pvc2UserId, pvc2BusinessName,pvc2PlantCd,           --U
                        MY_SQL_NAME, APS_COM_BATCH_END, '(SBM0299)' || LOGMSG_END_PGNM || lvc2Comment);   --U
    COMMIT;


    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,         --U
                          MY_SQL_NAME, LOGMSG_END);

    /* LogFile �� CLOSE */
    blnRet := FncLogClose(UTL_FileHandle);

--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �I�� ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));



--< ��O���� >---------------------------------------------------------------
EXCEPTION
    WHEN excPARAMETER_ERR THEN        --�u�����v�G���[
--DBMS_OUTPUT.PUT_LINE('excPARAMETER_ERR');
        ROLLBACK;
        /* �I�����b�Z�[�W�̍쐬 */
        vc2Comment := SUBSTR('(SBM0300)' || LOGMSG_END_PGNM || LOGMSG_ERR || '�F�X�e�b�v�t���O' || ',' || pvc2StepFlg ,
                             1,256);
        /* �I�����b�Z�[�W�̏o�� */
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,       --U
                            MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);
        /* TraceLog �̏o�́i���s�ʒu�j */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,     --U
                              MY_SQL_NAME, LOGMSG_END || vc2RunChkComment);
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,     --U
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        /* LogFile �� CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excPrdReqCtrl_ERR THEN       --�u���Y�v������v�X�V�G���[
--DBMS_OUTPUT.PUT_LINE('excPrdReqCtrl_ERR');
        ROLLBACK;
        /* �I�����b�Z�[�W�̍쐬 */
        vc2Comment := SUBSTR('(SBM0301)' || LOGMSG_END_PGNM || LOGMSG_ERR || '�F�u���Y�v������v�X�V',
                             1,256);
        /* �I�����b�Z�[�W�̏o�� */
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,       --U
                            MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);
        /* TraceLog �̏o�́i���s�ʒu�j */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,     --U
                              MY_SQL_NAME, LOGMSG_END || vc2RunChkComment);
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,     --U
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        /* LogFile �� CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excPROC_RUN_ERR THEN         --�u�������N���v�G���[
--DBMS_OUTPUT.PUT_LINE('excPROC_RUN_ERR');
        ROLLBACK;
        /* �I�����b�Z�[�W�̍쐬 */
        vc2Comment := SUBSTR('(SBM0302)' || LOGMSG_END_PGNM || LOGMSG_ERR,
                             1,256);
        /* �I�����b�Z�[�W�̏o�� */
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,       --U
                            MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);
        /* TraceLog �̏o�́i���s�ʒu�j */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,     --U
                              MY_SQL_NAME, LOGMSG_END || vc2RunChkComment);
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,     --U
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        /* LogFile �� CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN OTHERS THEN                  --���̑��̃G���[
--DBMS_OUTPUT.PUT_LINE('excOTHERS');
        ROLLBACK;
        /* �I�����b�Z�[�W�̍쐬 */
        vc2Comment := SUBSTR('(SBM0302)' || LOGMSG_END_PGNM || LOGMSG_ERR || '�F' ||
                             SQLCODE || ',' || SUBSTR(SQLERRM,1,256),
                             1,256);
        /* �I�����b�Z�[�W�̏o�� */
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,       --U
                            MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);
        /* TraceLog �̏o�́i���s�ʒu�j */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,     --U
                              MY_SQL_NAME, LOGMSG_END || vc2RunChkComment);
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,     --U
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        /* LogFile �� CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);
END;
/