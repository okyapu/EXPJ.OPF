CREATE OR REPLACE FUNCTION FNCEXCUPDATELOTSTOCKFD(
/*----------------------------------------------------------------------------
'
' version   : 1.00.00
'
' �C������
' 2006.12.21 ���ɂ̏ꍇ�͈����ϐ��ʂ𑫂����݁A�o�ɂ̏ꍇ�͈����ϐ��ʂ��������ނ悤�ɏC���B
'
' �@�\      :���o�ɊǗ��ԍ�����ɕۊǋ�ʓ��o�ɂ��������A
'            �擾�����l����Ƀ��b�g�ʕi�ڍ݌ɂ̓o�^�܂��͍X�V���s���B
'            �����ϐ��ʂ�NULL�ȊO�̏ꍇ�A�����l��[���b�g�ʕi�ڍ݌�].���b�g�ʈ����ϐ��ʂ̏������s���B
'
' �߂�l    : Boolean
'               True :����I��
'               False:�ُ�I��
'
' ������    : pFileHandle                      - (i)�t�@�C���n���h��
'             pvc2LogMode                      - (i)�k�n�f���[�h
'             pvc2OutputMode                   - (i)�o�̓��[�h
'             pvc2UserId                       - (i)���[�U�h�c
'             pvc2BusinessName                 - (i)�Ɩ���
'             pvc2PlantCd                      - (i)�H��R�[�h
'             pvc2RcvIssueCtrlCd               - (i)���o�ɊǗ��ԍ�
'             pvc2AlcdQty                      - (i)�����ςݐ���
'             pnumStatus                       - (o)���ʃX�e�[�^�X
'             pvc2MessageId                    - (o)�G���[���b�Z�[�WID
'
'
'
' ���l      :
'
------------------------------------------------------------------------------*/
   pFileHandle                  IN  UTL_FILE.FILE_TYPE  --�t�@�C���n���h��
   ,pvc2LogMode                 IN  VARCHAR2            --�k�n�f���[�h
   ,pvc2OutputMode              IN  VARCHAR2            --�o�̓��[�h
   ,pvc2UserId                  IN  VARCHAR2            --���[�U�h�c
   ,pvc2BusinessName            IN  VARCHAR2            --�Ɩ���
   ,pvc2PlantCd                 IN  VARCHAR2            --�H��R�[�h
   ,pvc2RcvIssueCtrlCd          IN  VARCHAR2            --���o�ɊǗ��ԍ�
   ,pvc2RsvQty                  IN  NUMBER              --�����ςݐ���
   ,pvc2MessageId               OUT VARCHAR2            --�G���[���b�Z�[�WID
   ,pnumStatus                  OUT NUMBER              --���ʃX�e�[�^�X�i1�F����I�� 2:�x���I�� 3�F�ُ�I���j
    ) RETURN BOOLEAN
IS

/* �J�[�\���̐錾*/

    --//�ۊǋ�ʓ��o�ɂ̌���
    CURSOR curT_RCV_ISSUE IS
    SELECT
        T_RCV_ISSUE.RCV_ISSUE_TYP,
        T_RCV_ISSUE.ITEM_CD,
        T_RCV_ISSUE.WH_CD,
        T_RCV_ISSUE.LOT_NO,
        T_RCV_ISSUE.PLANT_CD,
        T_RCV_ISSUE.RCV_ISSUE_QTY
    FROM T_RCV_ISSUE
    WHERE RCV_ISSUE_CTRL_CD = pvc2RcvIssueCtrlCd
    FOR UPDATE NOWAIT;

    recT_RCV_ISSUE  curT_RCV_ISSUE%ROWTYPE;

    --//���b�g�Ǘ��̌���
    CURSOR curT_LOT_CTRL (
    ctypItemCd T_LOT_CTRL.ITEM_CD%TYPE
    ,ctypLotNo T_LOT_CTRL.LOT_NO%TYPE
    ) IS
    SELECT
        T_LOT_CTRL.ITEM_CD
    FROM T_LOT_CTRL
    WHERE ITEM_CD = ctypItemCd
    AND   LOT_NO  = ctypLotNo;

    recT_LOT_CTRL  curT_LOT_CTRL%ROWTYPE;

    --//���b�g�ʕi�ڍ݌ɂ̌���
    CURSOR curT_LOT_STOCK(
    ctypItemCd T_LOT_STOCK.ITEM_CD%TYPE
    ,ctypWhCd  T_LOT_STOCK.WH_CD%TYPE
    ,ctypLotNo T_LOT_STOCK.LOT_NO%TYPE
    ) IS
    SELECT
        STOCK_ON_HAND_QTY
        ,DEFECT_QTY
        ,ALCD_QTY
    FROM T_LOT_STOCK
    WHERE ITEM_CD = ctypItemCd
    AND   WH_CD   = ctypWhCd
    AND   LOT_NO  = ctypLotNo
    FOR UPDATE NOWAIT;

    recT_LOT_STOCK  curT_LOT_STOCK%ROWTYPE;

/* �ϐ��̐錾 */
    blnRet                    BOOLEAN;                                --BOOLEAN�^ �ԋp�l
    vc2Comment                VARCHAR2(1024);                         -- ���b�Z�[�W�쐬�p

    typRsltRcvIssueTyp        T_RCV_ISSUE.RCV_ISSUE_TYP%TYPE;         --�擾���ʁi���o�ɋ敪�j
    typRsltItemCd             T_RCV_ISSUE.ITEM_CD%TYPE;               --�擾���ʁi�i�ڔԍ��j
    typRsltWhCd               T_RCV_ISSUE.WH_CD%TYPE;                 --�擾���ʁi�ۊǋ�R�[�h�j
    typRsltLotNo              T_RCV_ISSUE.LOT_NO%TYPE;                --�擾���ʁi�݌Ƀ��b�g�ԍ��j
    typRsltPlantCd            T_RCV_ISSUE.PLANT_CD%TYPE;              --�擾���ʁi�H��R�[�h�j
    typRsltRcvIssueQty        T_RCV_ISSUE.RCV_ISSUE_QTY%TYPE;         --�擾���ʁi���o�ɐ��j
    typRsltStockOnHandQty     T_LOT_STOCK.STOCK_ON_HAND_QTY%TYPE;     --�擾���ʁi���b�g�ʎ莝�݌ɐ��j
    typRsltDefectQty          T_LOT_STOCK.DEFECT_QTY%TYPE;            --�擾���ʁi���b�g�ʕs�ǐ��j
    typRsltAlcdQty            T_LOT_STOCK.ALCD_QTY%TYPE;            --�擾���ʁi���b�g�ʕs�ǐ��j
    typProcFlg                NUMBER(1)   := 0;

/* �萔�̐錾 */
    MY_SQL_NAME              VARCHAR2(120)  := 'FncExcUpdateLotStockFd';     --�o�k�^�r�p�k��
    LOGMODE_NOLOG            VARCHAR2(4)    := '0';                     --�k�n�f���[�h�@�k�n�f����
    OUTPUTMODE_FILE          VARCHAR2(4)    := '1';                     --�o�̓��[�h�@�@�t�@�C��
    LOGMSG_START             VARCHAR2(20)   := 'Start';                 --���O�p���\�b�h�J�n�錾
    LOGMSG_END               VARCHAR2(12)   := 'End';                   --���O�p���\�b�h�I���錾
    LOGMSG_ERR               VARCHAR2(12)   := 'Err';                   --���O�p���\�b�h�G���[�錾
    LOGMSG_CUROPENERR        VARCHAR2(40)   := 'CurOpenErr';            --���O�p�J�[�\��OPEN�G���[�錾
    LOGMSG_NOTFOUND          VARCHAR2(32)   := 'NotFound';              --���O�p�����ݐ錾
    STATUS_NORMAL            NUMBER         := 1;                       --����I��
    STATUS_WARNING           NUMBER         := 2;                       --�x���I��
    STATUS_ERROR             NUMBER         := 3;                       --�ُ�I��
    PROC_TYP_ENTRY           NUMBER         := 1;                       --���b�g�ʕi�ڍ݌ɓo�^
    PROC_TYP_UPDATE          NUMBER         := 2;                       --���b�g�ʕi�ڍ݌ɍX�V

/* MESSAGE �̐錾 */
    COM_BATCH_EXP                  VARCHAR2(28)   := 'ZZ22001';        --���b�g�ʕi�ڍ݌ɂ̓o�^�܂��͍X�V�Ɏ��s���܂����B
    COM_ERR_WRONG_VALUE            VARCHAR2(28)   := 'ZZ05105';        --�l���s���ł��B
    COM_NOTEXIST_RCVISSUECTRLCD    VARCHAR2(28)   := 'AF00068';        --�Y��������o�ɊǗ��ԍ������݂��܂���B
    COM__ERR_LOT_STOCK_ON_HAND_QTY VARCHAR2(28)   := 'AE20606';        --���b�g�݌ɐ����s�����Ă��܂��B
    COM_CUR_ORA_54                 VARCHAR2(28)   := 'ZZ01105';        --���̏����ɂ��f�[�^�������������Ă��܂��B���j���[�ɖ߂��Ă�蒼���ĉ������B

    -- ��O�̐錾
    excFncTraceLog           EXCEPTION;    --�g���[�X���O�o�̓G���[
    excCurRcvIssueErr        EXCEPTION;    --�J�[�\��OPEN����EXCEPTION
    excCurLotCtrlErr         EXCEPTION;    --�J�[�\��OPEN����EXCEPTION
    excCurLotStockErr        EXCEPTION;    --�J�[�\��OPEN����EXCEPTION
    excParameterErr          EXCEPTION;    --�u�����v�G���[
    excGetNewIssueCd         EXCEPTION;    --���o�ɊǗ��ԍ��擾�G���[
    excLotStockErr           EXCEPTION;    --���b�g�擾�G���[
    excOnHandQtyErr          EXCEPTION;    --�݌ɐ����s���G���[


BEGIN

    pnumStatus := STATUS_NORMAL;

    /* TraceLog �̏o�� */
    blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode,
                           pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                           MY_SQL_NAME, LOGMSG_START);

    IF blnRet=FALSE THEN
        RAISE excFncTraceLog;
    END IF
    ;

    /* �����`�F�b�N */

    -- ���o�ɊǗ��ԍ� --
    IF (pvc2RcvIssueCtrlCd IS NULL) THEN    -- NULL
        RAISE excParameterErr;
    ELSIF pvc2RcvIssueCtrlCd = '' THEN      -- �󕶎�
        RAISE excParameterErr;
    END IF;

    /* �J�[�\���n�o�d�m�i�ۊǋ�ʓ��o�Ɂj*/
    BEGIN
        OPEN curT_RCV_ISSUE;
    EXCEPTION
        WHEN OTHERS THEN
            RAISE excCurRcvIssueErr;
    END;

    /* �J�[�\���e�d�s�b�g�i�ۊǋ�ʓ��o�Ɂj*/
    BEGIN
        FETCH curT_RCV_ISSUE INTO recT_RCV_ISSUE;
    EXCEPTION
        WHEN OTHERS THEN
            RAISE excCurRcvIssueErr;
    END;

    /* �Ώۃf�[�^�����݂��Ȃ��ꍇ */
    IF curT_RCV_ISSUE%NOTFOUND THEN
        RAISE excGetNewIssueCd;

    /* �Ώۃf�[�^�����݂���ꍇ */
    ELSE

        /*�Ώۃf�[�^�̎擾*/
        typRsltRcvIssueTyp     := recT_RCV_ISSUE.RCV_ISSUE_TYP;       -- ���o�ɋ敪�̎擾
        typRsltItemCd          := recT_RCV_ISSUE.ITEM_CD;             -- �i�ڔԍ��̎擾
        typRsltWhCd            := recT_RCV_ISSUE.WH_CD;               -- �ۊǋ�R�[�h�̎擾
        typRsltLotNo           := recT_RCV_ISSUE.LOT_NO;              -- �݌Ƀ��b�g�ԍ��̎擾
        typRsltPlantCd         := recT_RCV_ISSUE.PLANT_CD;            -- �H��R�[�h�̎擾
        typRsltRcvIssueQty     := recT_RCV_ISSUE.RCV_ISSUE_QTY;       -- ���o�ɐ�

        /* �݌Ƀ��b�g�ԍ���NULL�̏ꍇ*/
        IF typRsltLotNo IS NULL THEN
             RAISE excLotStockErr;
        END IF
        ;

        /* �J�[�\���n�o�d�m�i���b�g�Ǘ��j*/
        BEGIN
           OPEN curT_LOT_CTRL(
         typRsltItemCd
        ,typRsltLotNo
        );
        EXCEPTION
           WHEN OTHERS THEN
              RAISE excCurLotCtrlErr;
        END;

        /* �J�[�\���e�d�s�b�g�i���b�g�Ǘ��j*/
        BEGIN
            FETCH curT_LOT_CTRL INTO recT_LOT_CTRL;
        EXCEPTION
            WHEN OTHERS THEN
            RAISE excCurLotCtrlErr;
        END;

        /* ���b�g�Ǘ��ɑΏۃf�[�^�����݂��Ȃ��ꍇ */
        IF curT_LOT_CTRL%NOTFOUND THEN
            RAISE excLotStockErr;
        END IF
        ;

        /* �J�[�\���b�k�n�r�d�i���b�g�Ǘ��j*/
        IF curT_LOT_CTRL%ISOPEN = TRUE THEN
           CLOSE curT_LOT_CTRL;
        END IF;


        /* �J�[�\���b�k�n�r�d�i�ۊǋ�ʓ��o�Ɂj*/
        IF curT_RCV_ISSUE%ISOPEN = TRUE THEN
             CLOSE curT_RCV_ISSUE;
        END IF;

        /* �J�[�\���n�o�d�m(���b�g�ʕi�ڍ݌Ɂj*/
        BEGIN
            OPEN curT_LOT_STOCK(
            typRsltItemCd
            ,typRsltWhCd
            ,typRsltLotNo
            );
        EXCEPTION
            WHEN OTHERS THEN
                RAISE excCurLotStockErr;
        END;

    END IF;

    /* �J�[�\���e�d�s�b�g�i���b�g�ʕi�ڍ݌ɏ��j*/
    BEGIN
        FETCH curT_LOT_STOCK INTO recT_LOT_STOCK;
    EXCEPTION
        WHEN OTHERS THEN
            RAISE excCurLotStockErr;
    END;

    /* �Ώۃf�[�^�����݂��Ȃ��ꍇ */
    IF curT_LOT_STOCK%NOTFOUND THEN

        /* ���b�g�ʕi�ڍ݌ɓo�^*/
        typProcFlg := PROC_TYP_ENTRY;

        /* �i�ڕʎ莝�݌ɐ��̎擾 */
        typRsltStockOnHandQty    := 0;

        /* ���o�ɋ敪��1:����  2:�o�ɂ̏ꍇ�A���b�g�ʎ莝�݌ɐ��͎擾�������o�ɐ��@���b�g�ʕs�ǐ���0
        ����ȊO�̓��b�g�ʎ莝�݌ɐ���0�A���b�g�ʕs�ǐ��͓��o�ɐ� */
        IF typRsltRcvIssueTyp IN (1,2) THEN
            typRsltRcvIssueQty := typRsltRcvIssueQty;
            typRsltDefectQty := 0;
        ELSE
             typRsltDefectQty := typRsltRcvIssueQty;
             typRsltRcvIssueQty := 0;
        END IF
        ;

        /* �����ϐ��ʂ̐ݒ�*/
        IF pvc2RsvQty IS NOT NULL THEN
           /* ���o�ɋ敪��1or3�̏ꍇ�͈����ϐ��𑝂₷�i�o�׎���j*/
           IF typRsltRcvIssueTyp IN (1,3) THEN
                  typRsltAlcdQty := pvc2RsvQty;
           /* ���o�ɋ敪��1or3�ȊO�̏ꍇ�͈����ϐ����������ށi�o�׎��сj*/
           ELSE
                  typRsltAlcdQty := -pvc2RsvQty;
           END IF
           ;
        ELSE
        typRsltAlcdQty :=0;
        END IF
        ;

        /* 	�o�ɉ\���̃`�F�b�N */
       IF typRsltRcvIssueQty - typRsltAlcdQty < 0 THEN
           RAISE excOnHandQtyErr;
       ELSIF typRsltDefectQty < 0 THEN
          RAISE excOnHandQtyErr;
       END IF
       ;

        /* �ۊǋ�ʕi�ڍ݌ɂ̓o�^ */
        INSERT INTO T_LOT_STOCK(
            ITEM_CD                          --�i�ڔԍ�
           ,WH_CD                            --�ۊǋ�R�[�h
           ,LOT_NO                           --�݌Ƀ��b�g�ԍ�
           ,PLANT_CD                         --�H��R�[�h
           ,STOCK_ON_HAND_QTY                --���b�g�ʎ莝�݌ɐ�
           ,DEFECT_QTY                       --���b�g�ʕs�ǐ�
           ,ALCD_QTY                         --���b�g�ʈ����ϐ���
           ,CREATED_DATE                     --�쐬��
           ,CREATED_BY                       --�쐬��
           ,CREATED_PRG_NM                   --�쐬�v���O������
           ,UPDATED_DATE                     --�X�V��
           ,UPDATED_BY                       --�X�V��
           ,UPDATED_PRG_NM                   --�X�V�v���O������
           ,MODIFY_COUNT                     --�X�V��
        ) VALUES (
            typRsltItemCd                    --�i�ڔԍ�
           ,typRsltWhCd                      --�ۊǋ�R�[�h
           ,typRsltLotNo                     --�݌Ƀ��b�g�ԍ�
           ,typRsltPlantCd                   --�H��R�[�h
           ,typRsltRcvIssueQty               --���b�g�ʕʎ莝�݌ɐ�
           ,typRsltDefectQty                 --���b�g�ʕs�ǐ�
           ,typRsltAlcdQty                    --���b�g�ʈ����ϐ���
           ,sysdate                          --�쐬��
           ,pvc2UserId                       --�쐬��
           ,MY_SQL_NAME                      --�쐬�v���O������
           ,sysdate                          --�X�V��
           ,pvc2UserId                       --�X�V��
           ,MY_SQL_NAME                      --�X�V�v���O������
           ,0                                --�X�V��
         );

    /* �Ώۃf�[�^�����݂���ꍇ */
    ELSE

        /* ���b�g�ʕi�ڍ݌ɍX�V*/
        typProcFlg := PROC_TYP_UPDATE;

        /* ���b�g�ʎ莝�݌ɐ��̎擾 */
        typRsltStockOnHandQty    := recT_LOT_STOCK.STOCK_ON_HAND_QTY;

        /* ���b�g�ʕs�ǐ��̎擾 */
        typRsltDefectQty := recT_LOT_STOCK.DEFECT_QTY;

        /* �����ϐ��ʂ̎擾*/
        typRsltAlcdQty := recT_LOT_STOCK.ALCD_QTY;

    END IF
    ;

      /* �J�[�\���b�k�n�r�d�i�ۊǋ�ʕi�ڍ݌ɏ��j*/
      IF curT_LOT_STOCK%ISOPEN = TRUE THEN
           CLOSE curT_LOT_STOCK;
      END IF;

      /* ���o�ɋ敪��1:����  2:�o�ɂ̏ꍇ�A���b�g�ʎ莝�݌ɐ��̐ݒ� */
      IF typRsltRcvIssueTyp IN (1,2) THEN
          /* �i�ڕʎ莝�݌ɐ� */
          typRsltStockOnHandQty   := typRsltStockOnHandQty + typRsltRcvIssueQty;
      ELSE /*���o�ɋ敪��1:����  2:�o�ɈȊO�̏ꍇ�A���b�g�ʕs�ǐ��̐ݒ� */
          /* �i�ڕʎ莝�݌ɐ� */
          typRsltDefectQty   := typRsltDefectQty + typRsltRcvIssueQty;

      END IF;

      /* �����ϐ��ʂ̐ݒ�*/
      IF pvc2RsvQty IS NOT NULL THEN
          /* ���o�ɋ敪��1or3�̏ꍇ�͈����ϐ��𑝂₷�i�o�׎���j*/
          IF typRsltRcvIssueTyp IN (1,3) THEN
              typRsltAlcdQty := typRsltAlcdQty + pvc2RsvQty;
          ELSE
          /* ���o�ɋ敪��1or3�ȊO�̏ꍇ�͈����ϐ����������ށi�o�׎��сj*/
              typRsltAlcdQty := typRsltAlcdQty - pvc2RsvQty;
          END IF
          ;
      ELSE
          typRsltAlcdQty := typRsltAlcdQty;
      END IF
      ;

      /* 	�o�ɉ\���̃`�F�b�N */
      IF typRsltStockOnHandQty - typRsltAlcdQty < 0 THEN
          RAISE excOnHandQtyErr;
      ELSIF typRsltDefectQty < 0 THEN
          RAISE excOnHandQtyErr;
      END IF
       ;

      /* ���b�g�ʕi�ڍ݌Ƀf�[�^������Ƃ��̂ݍX�V*/
      IF typProcFlg = PROC_TYP_UPDATE THEN


	      /* ���b�g�ʕi�ڍ݌ɂ̍X�V */
	     UPDATE T_LOT_STOCK SET
	               STOCK_ON_HAND_QTY  = typRsltStockOnHandQty     --���b�g�ʎ莝�݌�
	              ,DEFECT_QTY         = typRsltDefectQty          --���b�g�ʕs�ǐ�
                      ,ALCD_QTY           = typRsltAlcdQty            --�����ϐ���
	              ,UPDATED_DATE       = sysdate                   --�X�V��
	              ,UPDATED_BY         = pvc2UserId                --�X�V��
	              ,UPDATED_PRG_NM     = MY_SQL_NAME               --�X�V�v���O������
	              ,MODIFY_COUNT       = MODIFY_COUNT + 1          --�X�V��
	      WHERE ITEM_CD   = typRsltItemCd
	      AND   WH_CD     = typRsltWhCd
	      AND   LOT_NO    = typRsltLotNo;

      END IF;

    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    RETURN TRUE;    -- ����I��

--< ��O���� >---------------------------------------------------------------
EXCEPTION
    WHEN excParameterErr THEN

       /* ErrorLog �̏o�� */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, COM_ERR_WRONG_VALUE, '');
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);

        pnumStatus := STATUS_ERROR;
        pvc2MessageId := COM_ERR_WRONG_VALUE;
        RETURN FALSE;

     WHEN excGetNewIssueCd  THEN  --���o�ɊǗ��ԍ��擾�G���[
        ROLLBACK;

       /* ErrorLog �̏o�� */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, COM_NOTEXIST_RCVISSUECTRLCD, '');
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);

        pnumStatus := STATUS_ERROR;
        pvc2MessageId := COM_NOTEXIST_RCVISSUECTRLCD;

        RETURN FALSE;

      WHEN excLotStockErr  THEN  --���b�g�ԍ��擾�G���[
        ROLLBACK;

       /* ErrorLog �̏o�� */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, COM_NOTEXIST_RCVISSUECTRLCD, '');
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);

        pnumStatus := STATUS_ERROR;
        pvc2MessageId := COM_BATCH_EXP;

        RETURN FALSE;

    WHEN excCurRcvIssueErr THEN
        --ROLLBACK;

        /* �J�[�\���b�k�n�r�d�i�ۊǋ�ʓ��o�Ɂj*/
        IF curT_RCV_ISSUE%ISOPEN = TRUE THEN
            CLOSE curT_RCV_ISSUE;
        END IF;

        pnumStatus := STATUS_ERROR;
	pvc2MessageId := COM_CUR_ORA_54;

        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_CUROPENERR);
        RETURN FALSE;

     WHEN excCurLotCtrlErr THEN
        --ROLLBACK;

        /* �J�[�\���b�k�n�r�d�i�ۊǋ�ʓ��o�Ɂj*/
        IF curT_LOT_CTRL%ISOPEN = TRUE THEN
            CLOSE curT_LOT_CTRL;
        END IF;

        pnumStatus := STATUS_ERROR;

        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_CUROPENERR);
        RETURN FALSE;


    WHEN excCurLotStockErr THEN
        --ROLLBACK;

        /* �J�[�\���b�k�n�r�d�i���b�g�ʕi�ڍ݌ɏ��j*/
        IF curT_LOT_STOCK%ISOPEN = TRUE THEN
            CLOSE curT_LOT_STOCK;
        END IF;

        pnumStatus := STATUS_ERROR;
	pvc2MessageId := COM_CUR_ORA_54;

        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_CUROPENERR);
        RETURN FALSE;

    WHEN excOnHandQtyErr THEN
        ROLLBACK;

        /* �J�[�\���b�k�n�r�d�i���b�g�ʕi�ڍ݌ɏ��j*/
        IF curT_LOT_STOCK%ISOPEN = TRUE THEN
            CLOSE curT_LOT_STOCK;
        END IF;

        /* ErrorLog �̏o�� */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, COM__ERR_LOT_STOCK_ON_HAND_QTY, '');
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);

        pnumStatus := STATUS_ERROR;
        pvc2MessageId := COM__ERR_LOT_STOCK_ON_HAND_QTY;
        
        RETURN FALSE;

    WHEN excFncTraceLog THEN
        --ROLLBACK;
        pnumStatus := STATUS_ERROR;
        RETURN FALSE;
    WHEN UTL_FILE.INVALID_PATH THEN
        --ROLLBACK;
        pnumStatus := STATUS_ERROR;
        RETURN FALSE;
    WHEN UTL_FILE.INVALID_MODE THEN
        --ROLLBACK;
        pnumStatus := STATUS_ERROR;
        RETURN FALSE;
    WHEN UTL_FILE.INVALID_OPERATION THEN
        --ROLLBACK;
        pnumStatus := STATUS_ERROR;
        RETURN FALSE;
    WHEN UTL_FILE.INTERNAL_ERROR THEN
        --ROLLBACK;
        pnumStatus := STATUS_ERROR;
        RETURN FALSE;
    WHEN UTL_FILE.INVALID_FILEHANDLE THEN
        --ROLLBACK;
        pnumStatus := STATUS_ERROR;
        RETURN FALSE;
    WHEN OTHERS THEN
        --ROLLBACK;
        pnumStatus := STATUS_ERROR;
        /* ErrorLog �̏o�� */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, SQLCODE, SQLERRM);
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_ERR);
        RETURN FALSE;
END;
/
