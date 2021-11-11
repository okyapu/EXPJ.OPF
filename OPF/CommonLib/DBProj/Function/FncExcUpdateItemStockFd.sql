CREATE OR REPLACE FUNCTION      FncExcUpdateItemStockFd (
/*------------------------------------------------------------------------------
'
' version   : 1.00.00
'
' �C������
' 2006.11.07 ����
' 2006.12.21 ���ɂ̏ꍇ�͈����ϐ��ʂ𑫂����݁A�o�ɂ̏ꍇ�͈����ϐ��ʂ��������ނ悤�ɏC���B
'
' �@�\      : �݌ɁA���o�ɍX�V
'             (Java�Ăяo��)
'
' �߂�l    : Boolean
'               True :����I��
'               False:�ُ�I��
'
' ������    : pFileHandle                -- (i)�t�@�C���n���h��
'              pvc2LogMode                -- (i)�k�n�f���[�h
'             pvc2OutputMode             -- (i)�o�̓��[�h
'             pvc2UserId                 -- (i)���[�U�h�c
'             pvc2BusinessName           -- (i)�Ɩ���
'             pvc2PlantCd                -- (i)�H��R�[�h
'             pvc2RcvIssueCtrlCd         -- (i)���o�ɊǗ��ԍ�
'             pvc2ShipQty                -- (i)�o�׍ϐ���
'             pvc2MessegeCd              -- (o)�G���[�R�[�h
'             pnumStatus                 -- (o)���ʃX�e�[�^�X
'
' �@�\����  : ���o�ɊǗ��ԍ������ɁA�ۊǋ�ʕi�ڍ݌ɁE���b�g�ʕi�ڍ݌ɁE�ۊǋ�ʓ��o�ɂ̓o�^��X�V���s���B
'             �����ϐ��ʂ�NULL�ȊO�̏ꍇ�A�����l�Łm�ۊǋ�ʕi�ڍ݌�].�i�ڕʈ����ϐ��ʋy�сA
'             [���b�g�ʕi�ڍ݌�].���b�g�ʈ����ϐ��ʂ̏������s���B
'
'
' ���l      : 
'
------------------------------------------------------------------------------*/
              pFileHandle           IN	UTL_FILE.FILE_TYPE	--�t�@�C���n���h��
              ,pvc2LogMode          IN  VARCHAR2      -- (i)�k�n�f���[�h
              ,pvc2OutputMode       IN  VARCHAR2      -- (i)�o�̓��[�h
              ,pvc2UserId           IN  VARCHAR2      -- (i)���[�U�h�c
              ,pvc2BusinessName     IN  VARCHAR2      -- (i)�Ɩ���
              ,pvc2PlantCd          IN  VARCHAR2      -- (i)�H��R�[�h
              ,pvc2RcvIssueCtrlCd   IN  VARCHAR2      -- (i)���o�ɊǗ��ԍ�
              ,pvc2RsvQty           IN  NUMBER        -- (i)�o�׍ϐ���
              ,pvc2MessageId        OUT VARCHAR2      -- (o)�G���[�R�[�h
              ,pnumStatus           OUT NUMBER        -- (o)���ʃX�e�[�^�X
)RETURN BOOLEAN
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
        T_RCV_ISSUE.RCV_ISSUE_QTY,
        T_RCV_ISSUE.RCV_ISSUE_AFTER_QTY
    FROM T_RCV_ISSUE
    WHERE RCV_ISSUE_CTRL_CD = pvc2RcvIssueCtrlCd;
    
    recT_RCV_ISSUE  curT_RCV_ISSUE%ROWTYPE;

    --//�ۊǋ�ʕi�ڍ݌ɂ̌���
    CURSOR curT_ITEM_STOCK (
    ctypItemCd T_ITEM_STOCK.ITEM_CD%TYPE
    ,ctypWhCd  T_ITEM_STOCK.WH_CD%TYPE
    ) IS
    SELECT *
    FROM T_ITEM_STOCK
    WHERE ITEM_CD = ctypItemCd
    AND   WH_CD   = ctypWhCd;

    recT_ITEM_STOCK  curT_ITEM_STOCK%ROWTYPE;

/* �ϐ��̐錾 */

    blnRet                      BOOLEAN;                                      --BOOLEAN�^ �ԋp�l

    typRsltRcvIssueTyp          T_RCV_ISSUE.RCV_ISSUE_TYP%TYPE;               --�擾���ʁi���o�ɋ敪�j
    typRsltItemCd               T_RCV_ISSUE.ITEM_CD%TYPE;                     --�擾���ʁi�i�ڔԍ��j
    typRsltWhCd                 T_RCV_ISSUE.WH_CD%TYPE;                       --�擾���ʁi�ۊǋ�R�[�h�j
    typRsltLotNo                T_RCV_ISSUE.LOT_NO%TYPE;                      --�擾���ʁi�݌Ƀ��b�g�ԍ��j
    typRsltPlantCd              T_RCV_ISSUE.PLANT_CD%TYPE;                    --�擾���ʁi�H��R�[�h�j
    typRsltRcvIssueQty          T_RCV_ISSUE.RCV_ISSUE_QTY%TYPE;               --�擾���ʁi���o�ɐ��j
    typRsltStockOnHandQty       T_ITEM_STOCK.STOCK_ON_HAND_QTY%TYPE;          --�擾���ʁi�i�ڕʎ莝�݌ɐ��j
    typRsltAlcdQty              T_ITEM_STOCK.ALCD_QTY%TYPE;                   --�擾���ʁi�i�ڕʈ����ϐ��ʁj

    typRcvIssueBeforeQty        T_RCV_ISSUE.RCV_ISSUE_BEFORE_QTY%TYPE;        --�擾���ʁi���o�ɑO�݌ɐ��j
    typRcvIssueAfterQty         T_RCV_ISSUE.RCV_ISSUE_AFTER_QTY%TYPE;         --�擾���ʁi���o�Ɍ�݌ɐ��j
    typBeforStockOnHandQty      T_ITEM_STOCK.STOCK_ON_HAND_QTY%TYPE;          --�X�V�O�i�ڕʎ莝�݌ɐ�
    typProcFlg                  NUMBER(1)   := 0;



/* �萔�̐錾 */
    MY_SQL_NAME            VARCHAR2(120)  := 'FncExcUpdateItemStockFd';  --�o�k�^�r�p�k��
    LOGMODE_NOLOG          VARCHAR2(4)    := '0';                       --�k�n�f���[�h�@�k�n�f����
    OUTPUTMODE_FILE        VARCHAR2(4)    := '1';                       --�o�̓��[�h�@�@�t�@�C��
    LOGMSG_START           VARCHAR2(20)   := 'Start';                   --���O�p���\�b�h�J�n�錾
    LOGMSG_END             VARCHAR2(12)   := 'End';                     --���O�p���\�b�h�I���錾
    LOGMSG_ERR             VARCHAR2(12)   := 'Err';                     --���O�p���\�b�h�G���[�錾
    LOGMSG_GETERR          VARCHAR2(32)   := 'GetNoErr';                --���O�p���\�b�h�̔ԃG���[�錾
    LOGMSG_CUROPENERR      VARCHAR2(40)   := 'CurOpenErr';            --���O�p�J�[�\��OPEN�G���[�錾
    LOGMSG_NOTFOUND        VARCHAR2(32)   := 'NotFound';              --���O�p�����ݐ錾
    STATUS_NORMAL          NUMBER        := 1;          -- ����I��
    STATUS_WORNING         NUMBER        := 2;          -- �x���I��
    STATUS_ERROR           NUMBER        := 3;          -- �ُ�I��
    PROC_TYP_ENTRY         NUMBER        := 1;                       --���b�g�ʕi�ڍ݌ɓo�^
    PROC_TYP_UPDATE        NUMBER        := 2;                       --���b�g�ʕi�ڍ݌ɍX�V

    /* �ϐ��̐錾 WORK */       
    vc2WkMessageId           VARCHAR2(28)     := NULL;            --�G���[�R�[�h
    numWKStatus              NUMBER(1)        := STATUS_NORMAL;   --���ʃX�e�[�^�X

/* MESSAGE �̐錾 */

    COM_UPDATE_LOT_STOCK_FD      VARCHAR2(28)   := 'ZZ22001';        --���b�g�ʕi�ڍ݌ɂ̓o�^�܂��͍X�V�Ɏ��s���܂����B
    COM_ERR_WRONG_VALUE          VARCHAR2(28)   := 'ZZ05105';        --�l���s���ł��B
    COM_NOTEXIST_RCVISSUECTRLCD  VARCHAR2(28)   := 'AF00068';        --���o�ɊǗ��ԍ��f�[�^�����݂��܂���B
    

    -- ��O�̐錾
    excFncTraceLog         EXCEPTION;          --�g���[�X���O�o�̓G���[
    excCurRcvIssueErr      EXCEPTION;          --�J�[�\��OPEN����EXCEPTION
    excCurItemStockErr     EXCEPTION;          --�J�[�\��OPEN����EXCEPTION
    excParameterErr        EXCEPTION;          --�u�����v�G���[
    excRcvIssueCtrl        EXCEPTION;          --���o�ɊǗ��ԍ��f�[�^�Ȃ��G���[
    excUpdateLotStockFd    EXCEPTION;          --���b�g�g���[�X�o�^�E�X�V�����G���[
    


BEGIN

    pnumStatus := STATUS_NORMAL;
    pvc2MessageId := '';

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
        RAISE excRcvIssueCtrl;

    /* �Ώۃf�[�^�����݂���ꍇ */
    ELSE

        /*�Ώۃf�[�^�̎擾*/
        typRsltRcvIssueTyp          := recT_RCV_ISSUE.RCV_ISSUE_TYP;       -- ���o�ɋ敪�̎擾 
        typRsltItemCd               := recT_RCV_ISSUE.ITEM_CD;                   -- �i�ڔԍ��̎擾 
        typRsltWhCd                 := recT_RCV_ISSUE.WH_CD;                     -- �ۊǋ�R�[�h�̎擾 
        typRsltLotNo                := recT_RCV_ISSUE.LOT_NO;                    -- �݌Ƀ��b�g�ԍ��̎擾 
        typRsltPlantCd              := recT_RCV_ISSUE.PLANT_CD;                  -- �H��R�[�h�̎擾 
        typRsltRcvIssueQty          := recT_RCV_ISSUE.RCV_ISSUE_QTY;             -- ���o�ɐ�

    END IF;
    
    /* �J�[�\���b�k�n�r�d�i�ۊǋ�ʓ��o�Ɂj*/
    IF curT_RCV_ISSUE%ISOPEN = TRUE THEN
         CLOSE curT_RCV_ISSUE;
    END IF;

    /* �J�[�\���n�o�d�m�i�ۊǋ�ʕi�ڍ݌Ɂj*/
    BEGIN
        OPEN curT_ITEM_STOCK(
        typRsltItemCd
        ,typRsltWhCd
        );
    EXCEPTION
        WHEN OTHERS THEN
            RAISE excCurItemStockErr;
    END;

    /* �J�[�\���e�d�s�b�g�i�ۊǋ�ʕi�ڍ݌ɏ��j*/
    BEGIN
        FETCH curT_ITEM_STOCK INTO recT_ITEM_STOCK;
    EXCEPTION
        WHEN OTHERS THEN
            RAISE excCurItemStockErr;
    END;

    /* �Ώۃf�[�^�����݂��Ȃ��ꍇ */
    IF curT_ITEM_STOCK%NOTFOUND THEN

        /* �ۊǋ�ʕi�ڍ݌ɓo�^*/
        typProcFlg := PROC_TYP_ENTRY;

        /* �i�ڕʎ莝�݌ɐ��̎擾 */
        typRsltStockOnHandQty    := 0;

        /* �i�ڕʈ����ϐ��ʂ̃Z�b�g */

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

        /* �X�V�O�莝�݌ɐ��̕ێ�*/
        typBeforStockOnHandQty   := 0;

        /* �ۊǋ�ʕi�ڍ݌ɂ̓o�^ */
        INSERT INTO T_ITEM_STOCK(
        ITEM_CD                          --�i�ڔԍ�
       ,WH_CD                            --�ۊǋ�R�[�h
       ,PLANT_CD                         --�H��R�[�h
       ,STOCK_ON_HAND_QTY                --�i�ڕʎ莝�݌ɐ�
       ,DEFECT_QTY                       --�i�ڕʕs�ǐ�
       ,PRVS_DAYEND_STOCK_QTY            --�i�ڕʑO�����݌ɐ�
       ,PRVS_MONTHEND_STOCK_QTY          --�i�ڕʑO�����݌ɐ�
       ,PRVS_TERMEND_STOCK_QTY           --�i�ڕʑO�����݌ɐ�
       ,ALCD_QTY                         --�i�ڕʈ����ϐ���
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
       ,typRsltPlantCd                   --�H��R�[�h
       ,typRsltRcvIssueQty               --�i�ڕʎ莝�݌ɐ�
       ,0                                --�i�ڕʕs�ǐ�
       ,0                                --�i�ڕʑO�����݌ɐ�
       ,0                                --�i�ڕʑO�����݌ɐ�
       ,0                                --�i�ڕʑO�����݌ɐ�
       ,typRsltAlcdQty                   --�i�ڕʈ����ϐ���
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
        
        /* �ۊǋ�ʕi�ڍ݌ɍX�V*/
        typProcFlg := PROC_TYP_UPDATE;

        /* �i�ڕʎ莝�݌ɐ��̎擾 */
        typRsltStockOnHandQty    := recT_ITEM_STOCK.STOCK_ON_HAND_QTY;

        /* �i�ڕʈ����ϐ��ʂ̎擾 */
        typRsltAlcdQty           := recT_ITEM_STOCK.ALCD_QTY;

        /* �X�V�O�莝�݌ɐ��̕ێ�*/
        typBeforStockOnHandQty   := recT_ITEM_STOCK.STOCK_ON_HAND_QTY;

    END IF
    ;

    /* �J�[�\���b�k�n�r�d�i�ۊǋ�ʕi�ڍ݌ɏ��j*/
    IF curT_ITEM_STOCK%ISOPEN = TRUE THEN
         CLOSE curT_ITEM_STOCK;
    END IF;

    /* �i�ڕʎ莝�݌ɐ��̐ݒ� */

        /* �i�ڕʎ莝�݌ɐ� */
        typRsltStockOnHandQty    := typRsltStockOnHandQty + typRsltRcvIssueQty;

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

    /* �ۊǋ�ʕi�ڍ݌Ƀf�[�^������Ƃ��̂ݍX�V*/
    IF typProcFlg = PROC_TYP_UPDATE THEN

        /* �ۊǋ�ʕi�ڍ݌ɂ̍X�V */
        UPDATE T_ITEM_STOCK SET
             STOCK_ON_HAND_QTY  = typRsltStockOnHandQty      --�i�ڕʎ莝�݌ɐ�
             ,ALCD_QTY           = typRsltAlcdQty            --�i�ڕʈ����ϐ���
             ,UPDATED_DATE       = sysdate                   --�X�V��
             ,UPDATED_BY         = pvc2UserId                --�X�V��
             ,UPDATED_PRG_NM     = MY_SQL_NAME               --�X�V�v���O������
             ,MODIFY_COUNT       = MODIFY_COUNT + 1          --�X�V��
        WHERE ITEM_CD   = typRsltItemCd
        AND   WH_CD     = typRsltWhCd
        ;
     END IF
     ;

    /* ���o�ɑO�݌ɐ��̐ݒ�*/
    typRcvIssueBeforeQty  := typBeforStockOnHandQty;

    /* ���o�Ɍ�݌ɐ��̐ݒ�*/
    typRcvIssueAfterQty   := typBeforStockOnHandQty + typRsltRcvIssueQty ;

    /* �ۊǋ�ʓ��o�ɂ̍X�V*/
    UPDATE T_RCV_ISSUE SET
             RCV_ISSUE_BEFORE_QTY  = typRcvIssueBeforeQty
             ,RCV_ISSUE_AFTER_QTY   = typRcvIssueAfterQty
             ,STOCK_UPD_TYP         = 2
    WHERE RCV_ISSUE_CTRL_CD = pvc2RcvIssueCtrlCd
    ;

    /* �ۊǋ�ʓ��o�ɂ̍݌Ƀ��b�g�ԍ���NULL�ȊO�̏ꍇ*/ 
    IF typRsltLotNo IS NOT NULL THEN
        /* ���b�g�ʕi�ڍ݌ɓo�^�E�X�V�����̌Ăяo��*/
        blnRet := FNCEXCUPDATELOTSTOCKFD(pFileHandle
                                     ,pvc2LogMode
                                     ,pvc2OutputMode
                                     ,pvc2UserId
                                     ,pvc2BusinessName
                                     ,pvc2PlantCd 
                                     ,pvc2RcvIssueCtrlCd
                                     ,pvc2RsvQty
                                     ,vc2WkMessageId
                                     ,numWKStatus);
    
    END IF
    ;

    IF blnRet=FALSE THEN
        RAISE excUpdateLotStockFd;
    END IF
    ;
    

RETURN TRUE;
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

    WHEN excRcvIssueCtrl THEN

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

    WHEN excUpdateLotStockFd THEN

       /* ErrorLog �̏o�� */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, COM_UPDATE_LOT_STOCK_FD, '');
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);

        pnumStatus := STATUS_ERROR;
        pvc2MessageId := vc2WkMessageId;

        RETURN FALSE;


    WHEN excCurRcvIssueErr THEN
        --ROLLBACK;
        
        /* �J�[�\���b�k�n�r�d�i�ۊǋ�ʓ��o�Ɂj*/
        IF curT_RCV_ISSUE%ISOPEN = TRUE THEN
            CLOSE curT_RCV_ISSUE;
        END IF;
        
        pnumStatus := STATUS_ERROR;
        
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_CUROPENERR);
        RETURN FALSE;
        
     WHEN excCurItemStockErr THEN
        --ROLLBACK;
        
        /* �J�[�\���b�k�n�r�d�i���b�g�ʕi�ڍ݌ɏ��j*/
        IF curT_ITEM_STOCK%ISOPEN = TRUE THEN
            CLOSE curT_ITEM_STOCK;
        END IF;
        
        pnumStatus := STATUS_ERROR;
        
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_CUROPENERR);
        RETURN FALSE;

    WHEN excFncTraceLog THEN
        pnumStatus := STATUS_ERROR;
        RETURN FALSE;
    WHEN UTL_FILE.INVALID_PATH THEN
        pnumStatus := STATUS_ERROR;
        RETURN FALSE;
    WHEN UTL_FILE.INVALID_MODE THEN
        pnumStatus := STATUS_ERROR;
        RETURN FALSE;
    WHEN UTL_FILE.INVALID_OPERATION THEN
        pnumStatus := STATUS_ERROR;
        RETURN FALSE;
    WHEN UTL_FILE.INTERNAL_ERROR THEN
        pnumStatus := STATUS_ERROR;
        RETURN FALSE;
    WHEN UTL_FILE.INVALID_FILEHANDLE THEN
        pnumStatus := STATUS_ERROR;
        RETURN FALSE;
    WHEN OTHERS THEN
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
