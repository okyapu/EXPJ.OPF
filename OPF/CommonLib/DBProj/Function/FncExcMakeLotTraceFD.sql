CREATE OR REPLACE FUNCTION FNCEXCMAKELOTTRACEFD(
/*------------------------------------------------------------------------------
'
' FncExcMakeLotTraceFdFD.Sql
'
' �C������
' 2006.12.22 �V�K�쐬
'
' �@�\      : ���b�g�g���[�X�o�^
'
' �߂�l    : Boolean
'               True :����I���i���ʃX�e�[�^�X=1:����I���A2:�x���I���j
'               False:�ُ�I���i���ʃX�e�[�^�X=3:�ُ�I���j
'
' ������    : 
'         -- SYSTEM����
'             pFileHandle          - (i)�t�@�C���n���h��
'             pvc2LogMode          - (i)�k�n�f���[�h
'             pvc2OutputMode       - (i)�o�̓��[�h
'             pvc2UserId           - (i)���[�U�h�c
'             pvc2BusinessName     - (i)�Ɩ���
'             pvc2PlantCd          - (i)�H��R�[�h
'         -- �Ɩ��ŗL
'             pvc2FromItemCd       - (i)���i�ڃR�[�h
'             pvc2FromLotNo        - (i)�����b�g�ԍ�
'             pvc2ToItemCd         - (i)��i�ڃR�[�h
'             pvc2ToLotNo          - (i)�惍�b�g�ԍ�
'             pvc2LotTraceTyp      - (i)���b�g�g���[�X�敪
'             pvc2ErrCd            - (o)�G���[�R�[�h
'             pnumStatus           - (o)���ʃX�e�[�^�X(1:����I���A2:�x���I���A3:�ُ�I��)
' �@�\����  :���b�g�g���[�X����o�^����B
'
' ���l      :
'
-----------------------------------------------------------------------------*/
    pFileHandle             IN  UTL_FILE.FILE_TYPE  --�t�@�C���n���h��
   ,pvc2LogMode             IN  VARCHAR2            --�k�n�f���[�h
   ,pvc2OutputMode          IN  VARCHAR2            --�o�̓��[�h
   ,pvc2UserId              IN  VARCHAR2            --���[�U�h�c
   ,pvc2BusinessName        IN  VARCHAR2            --�Ɩ���
   ,pvc2PlantCd             IN  VARCHAR2            --�H��R�[�h
   ,pvc2FromItemCd          IN  VARCHAR2            --���i�ڃR�[�h
   ,pvc2FromLotNo           IN  VARCHAR2            --�����b�g�ԍ�
   ,pvc2ToItemCd            IN  VARCHAR2            --��i�ڃR�[�h
   ,pvc2ToLotNo             IN  VARCHAR2            --�惍�b�g�ԍ�
   ,pvc2LotTraceTyp         IN  NUMBER              --���b�g�g���[�X�敪
   ,pvc2ErrCd               OUT VARCHAR2            --�G���[�R�[�h
   ,pnumStatus              OUT NUMBER              --���ʃX�e�[�^�X
    ) RETURN BOOLEAN
IS

/* �萔�̐錾 */
    MY_SQL_NAME         VARCHAR2(64)    := 'FncExcMakeLotTraceFdFD';  --�o�k�^�r�p�k��

    LOGMSG_START        VARCHAR2(20)     := 'Start';            --���O�p���\�b�h�J�n�錾
    LOGMSG_END          VARCHAR2(12)     := 'End';              --���O�p���\�b�h�I���錾
    LOGMSG_NOT_FOUND    VARCHAR2(80)     := 'NotFound';         --���O�p���\�b�h�}�X�^NOTFOUND
    LOGMSG_CUROPENERR   VARCHAR2(40)     := 'CurOpenErr';       --���O�p�J�[�\��OPEN�G���[�錾
    
    STATUS_NORMAL     CONSTANT   NUMBER(01)     := 1;  -- ����I��
    STATUS_WARNING    CONSTANT   NUMBER(01)     := 2;  -- �x���I��
    STATUS_ERROR      CONSTANT   NUMBER(01)     := 3;  -- �ُ�I��

    -- ���b�Z�[�W�R�[�h

    JF_COM_ERR_WRONG_VALUE                 VARCHAR(28)  := 'ZZ05105';               --�l���s���ł�
    JF_COM_ERR_ORACLE_ERROR                VARCHAR(28)  := 'AC53401';               --ORACLE�G���[
    JF_COM_ERR_LOT_CTRL                    VARCHAR(28)  := 'ZZ22004';               --���b�g�Ǘ��Ƀf�[�^�����݂��܂���B
    JF_COM_ERR_LOT_TRACE_ERROR             VARCHAR(28)  := 'ZZ22016';               --���b�g�g���[�X�̓o�^�܂��͍X�V�Ɏ��s���܂����B
        

/* �ϐ��̐錾 WORK */
    blnRet              BOOLEAN;

    -- ��O�̐錾
    excParameterErr              EXCEPTION;          --�u�����v�G���[
    excNotFound                  EXCEPTION;          --�}�X�^NOT FOUND
    excCurLotCtrlErr             EXCEPTION;          --�J�[�\��OPEN����EXCEPTION
    excCurLotTraceErr            EXCEPTION;          --�J�[�\��OPEN����EXCEPTION
    excLotCtrlErr                EXCEPTION;          --[���b�g�Ǘ�]�ɑ��݂��Ȃ��G���[
    excLotTraceErr               EXCEPTION;         --[���b�g�g���[�X]�ɓo�^�E�X�V���s�G���[

    -- �J�[�\���̐錾
    
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
    
    --//���b�g�g���[�X�̌���
    CURSOR curT_LOT_TRACE (
    ctypFromItemCd T_LOT_TRACE.FROM_ITEM_CD%TYPE
    ,ctypFromLotNo T_LOT_TRACE.FROM_LOT_NO%TYPE
    ,ctypToItemCd T_LOT_TRACE.TO_ITEM_CD%TYPE
    ,ctypToLotNo T_LOT_TRACE.TO_LOT_NO%TYPE
    ,ctypLotTraceTyp T_LOT_TRACE.LOT_TRACE_TYP%TYPE
    ) IS
    SELECT 
        T_LOT_TRACE.FROM_ITEM_CD
    FROM T_LOT_TRACE
    WHERE FROM_ITEM_CD = ctypFromItemCd
    AND   FROM_LOT_NO  = ctypFromLotNo
    AND   TO_ITEM_CD  = ctypToItemCd
    AND   TO_LOT_NO  = ctypToLotNo
    AND   LOT_TRACE_TYP  = ctypLotTraceTyp;

    recT_LOT_TRACE  curT_LOT_CTRL%ROWTYPE;

BEGIN

    pnumStatus         :=  STATUS_NORMAL;  --���ʃX�e�[�^�X
    pvc2ErrCd          :=  NULL;           --�G���[�R�[�h

    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

    /* �����`�F�b�N */

    -- ���i�ڃR�[�h --
    IF (pvc2FromItemCd IS NULL) THEN    -- NULL
        RAISE excParameterErr;
    ELSIF pvc2FromItemCd = '' THEN      -- �󕶎�
        RAISE excParameterErr;
    END IF;

    -- �����b�g�ԍ� --
    IF (pvc2FromLotNo IS NULL) THEN    -- NULL
        RAISE excParameterErr;
    ELSIF pvc2FromLotNo = '' THEN      -- �󕶎�
        RAISE excParameterErr;
    END IF;
    
    -- ��i�ڃR�[�h --
    IF (pvc2ToItemCd IS NULL) THEN    -- NULL
        RAISE excParameterErr;
    ELSIF pvc2ToItemCd = '' THEN      -- �󕶎�
        RAISE excParameterErr;
    END IF;
    
    -- �惍�b�g�ԍ� --
    IF (pvc2ToLotNo IS NULL) THEN    -- NULL
        RAISE excParameterErr;
    ELSIF pvc2ToLotNo = '' THEN      -- �󕶎�
        RAISE excParameterErr;
    END IF;
    
    -- ���b�g�g���[�X�敪 --
    IF (pvc2LotTraceTyp IS NULL) THEN    -- NULL
        RAISE excParameterErr;
    ELSIF pvc2LotTraceTyp = '' THEN      -- �󕶎�
        RAISE excParameterErr;
    END IF;

---------------------------------------------------------
    --  ���i�ڃR�[�h����i�ڃR�[�h�������b�g�ԁ����惍�b�g�ԍ��̏ꍇ--
    IF pvc2FromItemCd = pvc2ToItemCd AND
        pvc2FromLotNo = pvc2ToLotNo THEN
        RAISE excLotTraceErr;
    END IF;
---------------------------------------------------------
    /* ���i�ڔԍ��E�����b�g�ԍ���[���b�g�Ǘ�]�̌���*/
    
    /* �J�[�\���n�o�d�m�i���b�g�Ǘ��j*/
    BEGIN
       OPEN curT_LOT_CTRL(
     pvc2FromItemCd
    ,pvc2FromLotNo
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
        RAISE excLotCtrlErr;
    END IF
    ;

    /* �J�[�\���b�k�n�r�d�i���b�g�Ǘ��j*/
    IF curT_LOT_CTRL%ISOPEN = TRUE THEN
       CLOSE curT_LOT_CTRL;
    END IF;
---------------------------------------------------------
 /* ��i�ڔԍ��E�惍�b�g�ԍ���[���b�g�Ǘ�]�̌���*/
    
    /* �J�[�\���n�o�d�m�i���b�g�Ǘ��j*/
    BEGIN
       OPEN curT_LOT_CTRL(
     pvc2ToItemCd
    ,pvc2ToLotNo
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
        RAISE excLotCtrlErr;
    END IF
    ;

    /* �J�[�\���b�k�n�r�d�i���b�g�Ǘ��j*/
    IF curT_LOT_CTRL%ISOPEN = TRUE THEN
       CLOSE curT_LOT_CTRL;
    END IF;

---------------------------------------------------------
/* [���b�g�g���[�X]�̌���*/

 /* �J�[�\���n�o�d�m�i���b�g�g���[�X�j*/
    BEGIN
       OPEN curT_LOT_TRACE(
     pvc2FromItemCd
    ,pvc2FromLotNo 
    ,pvc2ToItemCd
    ,pvc2ToLotNo
    ,pvc2LotTraceTyp
    );
    EXCEPTION
       WHEN OTHERS THEN
          RAISE excCurLotCtrlErr;
    END;

    /* �J�[�\���e�d�s�b�g�i���b�g�g���[�X�j*/
    BEGIN
        FETCH curT_LOT_TRACE INTO recT_LOT_TRACE;
    EXCEPTION
        WHEN OTHERS THEN
        RAISE excCurLotCtrlErr;
    END;

    /* ���b�g�g���[�X�ɑΏۃf�[�^�����݂��Ȃ��ꍇ */
    IF curT_LOT_TRACE%NOTFOUND THEN
        
        /*[���b�g�g���[�X]�̓o�^*/
        INSERT INTO T_LOT_TRACE(
            FROM_ITEM_CD                     --���i�ڃR�[�h
           ,FROM_LOT_NO                      --�����b�g�ԍ�
           ,TO_ITEM_CD                       --��i�ڃR�[�h
           ,TO_LOT_NO                        --�惍�b�g�ԍ�
           ,LOT_TRACE_TYP                    --���b�g�g���[�X�敪
           ,CREATED_DATE                     --�쐬��
           ,CREATED_BY                       --�쐬��
           ,CREATED_PRG_NM                   --�쐬�v���O������
           ,UPDATED_DATE                     --�X�V��
           ,UPDATED_BY                       --�X�V��
           ,UPDATED_PRG_NM                   --�X�V�v���O������
           ,MODIFY_COUNT                     --�X�V��
        ) VALUES (
            pvc2FromItemCd                   --���i�ڃR�[�h
           ,pvc2FromLotNo                    --�����b�g�ԍ�
           ,pvc2ToItemCd                     --��i�ڃR�[�h
           ,pvc2ToLotNo                      --�惍�b�g�ԍ�
           ,pvc2LotTraceTyp                  --���b�g�g���[�X�敪
           ,sysdate                          --�쐬��
           ,pvc2UserId                       --�쐬��
           ,MY_SQL_NAME                      --�쐬�v���O������
           ,sysdate                          --�X�V��
           ,pvc2UserId                       --�X�V��
           ,MY_SQL_NAME                      --�X�V�v���O������
           ,0                                --�X�V��
         );
        
    ELSE
        /*[���b�g�g���[�X]�̍X�V */ 
        UPDATE T_LOT_TRACE SET
	              UPDATED_DATE       = sysdate                   --�X�V��
	              ,UPDATED_BY         = pvc2UserId                --�X�V��
	              ,UPDATED_PRG_NM     = MY_SQL_NAME               --�X�V�v���O������
	              ,MODIFY_COUNT       = MODIFY_COUNT + 1          --�X�V��
	    WHERE FROM_ITEM_CD   = pvc2FromItemCd
        AND   FROM_LOT_NO    = pvc2FromLotNo
        AND   TO_ITEM_CD     = pvc2ToItemCd
        AND   TO_LOT_NO      = pvc2ToLotNo
        AND   LOT_TRACE_TYP  = pvc2LotTraceTyp;
    END IF
    ;

    /* �J�[�\���b�k�n�r�d�i���b�g�g���[�X�j*/
    IF curT_LOT_CTRL%ISOPEN = TRUE THEN
       CLOSE curT_LOT_CTRL;
    END IF;

---------------------------------------------------------

    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    RETURN TRUE;

--< ��O���� >---------------------------------------------------------------
EXCEPTION
    WHEN excParameterErr THEN
        pnumStatus         := STATUS_ERROR;               --���ʃX�e�[�^�X
        pvc2ErrCd          := JF_COM_ERR_WRONG_VALUE;     --�G���[�R�[�h
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        RETURN FALSE;
        
    WHEN excCurLotCtrlErr THEN
        --ROLLBACK;
        
        /* �J�[�\���b�k�n�r�d�i���b�g�Ǘ��j*/
        IF curT_LOT_CTRL%ISOPEN = TRUE THEN
            CLOSE curT_LOT_CTRL;
        END IF;
        
        pnumStatus := STATUS_ERROR;
        
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_CUROPENERR);
        RETURN FALSE;
        
    WHEN excCurLotTraceErr THEN
        --ROLLBACK;
        
        /* �J�[�\���b�k�n�r�d�i���b�g�g���[�X�j*/
        IF curT_LOT_TRACE%ISOPEN = TRUE THEN
            CLOSE curT_LOT_TRACE;
        END IF;
        
        pnumStatus := STATUS_ERROR;
        
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_CUROPENERR);
        RETURN FALSE;
        
    WHEN excLotTraceErr  THEN  --[���b�g�g���[�X]�ɓo�^�E�X�V���s�G���[
        ROLLBACK;

       /* ErrorLog �̏o�� */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, JF_COM_ERR_LOT_TRACE_ERROR, '');
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
                              
        pnumStatus := STATUS_ERROR;
        pvc2ErrCd  := JF_COM_ERR_LOT_TRACE_ERROR;
        
        RETURN FALSE;

    WHEN excLotCtrlErr  THEN  --[���b�g�Ǘ�]�ɑ��݂��Ȃ��G���[
        ROLLBACK;

       /* ErrorLog �̏o�� */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, JF_COM_ERR_LOT_CTRL, '');
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
                              
        pnumStatus := STATUS_ERROR;
        pvc2ErrCd  := JF_COM_ERR_LOT_CTRL;
        
        RETURN FALSE;
        
    WHEN OTHERS THEN
        pnumStatus         := STATUS_ERROR;               --���ʃX�e�[�^�X
        pvc2ErrCd          := JF_COM_ERR_ORACLE_ERROR;    --�G���[�R�[�h
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
