CREATE OR REPLACE FUNCTION FNCGETUSERCOMPANY4ARAP (
/*------------------------------------------------------------------------------
'
' FncGetUserCompany4ARAP.Sql
'
' �C������  2004.07.01 �V�K�쐬
            2005.10.20 unicode�Ή�(varchar2��4�{)
'
' �@�\      : ��ЃR�[�h�擾����
'
' �߂�l    : Boolean
'               True :����I��
'               False:�ُ�I��
'
' ������    : pFileHandle          - (i) �t�@�C���n���h��
'             pvc2LogMode          - (i) �k�n�f���[�h
'             pvc2OutputMode       - (i) �o�̓��[�h
'             pvc2PlantCd          - (i) �H��R�[�h
'             pvc2UserId           - (i) ���[�U�h�c
'             pvc2BusinessName     - (i) �Ɩ���
'             pvc2CompanyCd        - (io)��ЃR�[�h
'
' �@�\����  : ���p�҃R�[�h���L�[�ɗ��p�ҏ�����Ђ���ЃR�[�h���擾����B
'
' ���l      :
'
------------------------------------------------------------------------------*/
    pFileHandle         IN  UTL_FILE.FILE_TYPE  --�t�@�C���n���h��
   ,pvc2LogMode         IN  VARCHAR2    --�k�n�f���[�h
   ,pvc2OutputMode      IN  VARCHAR2    --�o�̓��[�h
   ,pvc2PlantCd         IN  VARCHAR2    --�H��R�[�h
   ,pvc2UserId          IN  VARCHAR2    --���[�U�h�c
   ,pvc2BusinessName    IN  VARCHAR2    --�Ɩ���
   ,pvc2CompanyCd       OUT VARCHAR2    --��ЃR�[�h
) RETURN BOOLEAN
IS

/* �J�[�\���̐錾 */


/* ROWTYPE �̐錾 */


/* �萔�̐錾 */
    MY_SQL_NAME                         VARCHAR2(120)  := 'FncGetUserCompany4ARAP';

    DATA_FLG_NOTFOUND              CONSTANT NUMBER(1)   := 0;     --�f�[�^�Ȃ�
    DATA_FLG_GET                   CONSTANT NUMBER(1)   := 1;     --�f�[�^����

    DEFAULT_COMPANY_CD             CONSTANT VARCHAR2(8) := '';


/* EXCEPTION �̐錾 */


/* MESSAGE �̐錾 */


/* LOG �̐錾 */
    LOGMSG_START                        VARCHAR2(20)   := 'Start';   --���O�p���\�b�h�J�n�錾
    LOGMSG_END                          VARCHAR2(12)   := 'End';     --���O�p���\�b�h�I���錾


/* �ϐ��̐錾 SQL */
    /* ���p�ҏ������  (M_USER_COMPANY) */
    vc2MUC_UserCd               VARCHAR2(100); -- PKey01
    vc2MUC_CompanyCd            VARCHAR2(100);
    numMUC_UserTyp              NUMBER(2);
    dtmMUC_CreDate              DATE;
    vc2MUC_CreCd                VARCHAR2(100);
    dtmMUC_UpdDate              DATE;
    vc2MUC_UpdCd                VARCHAR2(100);


/* �ϐ��̐錾 WORK */
    blnRet                      BOOLEAN;        -- Function�ԋp�l
    numUserCdBeFlg              NUMBER(1);
    blnFncRet                   BOOLEAN;        -- RETURN���̒l


BEGIN

    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

--  ���p�ҏ�����Ђ��擾����
    BEGIN

        SELECT USER_CD,
               COMPANY_CD, USER_TYP,
               CREATED_DATE, CREATED_PRG_NM,
               UPDATED_DATE, UPDATED_PRG_NM
          INTO vc2MUC_UserCd,
               vc2MUC_CompanyCd, numMUC_UserTyp,
               dtmMUC_CreDate, vc2MUC_CreCd,
               dtmMUC_UpdDate, vc2MUC_UpdCd
          FROM M_USER_COMPANY
         WHERE  USER_CD = pvc2UserId;

        numUserCdBeFlg := DATA_FLG_GET;

    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            numUserCdBeFlg := DATA_FLG_NOTFOUND;

    END;

    IF numUserCdBeFlg = DATA_FLG_GET THEN
        pvc2CompanyCd := vc2MUC_CompanyCd;
		blnFncRet := TRUE;
    ELSE
        pvc2CompanyCd := DEFAULT_COMPANY_CD;
		blnFncRet := FALSE;
    END IF;

    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

	RETURN blnFncRet;

--< ��O���� >---------------------------------------------------------------
EXCEPTION
    WHEN OTHERS THEN                             --���̑��̃G���[
        /* ErrorLog �̏o�� */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, SQLCODE, SQLERRM);
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        RETURN FALSE;
END FncGetUserCompany4ARAP;
/
