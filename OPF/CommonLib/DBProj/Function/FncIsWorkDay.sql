CREATE OR REPLACE FUNCTION FNCISWORKDAY(
/*------------------------------------------------------------------------------
'
' version   : 1.00.01
'
' �C������
' 2003.08.07 ����
' 2003.12.15 �\�[�X���`(���s�}��)�B
' 2005.10.21 unicode�Ή��ivarchar2��4�{�j
'
' �@�\      : �ғ�������
'
' �߂�l    : Boolean
'               True :����I��
'               False:�ُ�I��
'
' ������    : pFileHandle          - (i)�t�@�C���n���h��
'             pvc2LogMode          - (i)�k�n�f���[�h
'             pvc2OutputMode       - (i)�o�̓��[�h
'             pvc2UserId           - (i)���[�U�h�c
'             pvc2BusinessName     - (i)�Ɩ���
'             pvc2PlantCd          - (i)�H��R�[�h
'             pdtmDate             - (i)�Ώۓ��t
'             pblnResult           - (o)���茋�� true: �ғ��� false: ��ғ���
'
' �@�\����  : �w��H��̃J�����_���g���đΏۓ��t���ғ����ł��邩�ǂ���
'             �𔻒肷��B
'
' ���l      : 
'
------------------------------------------------------------------------------*/
    pFileHandle         IN  UTL_FILE.FILE_TYPE  --�t�@�C���n���h��
   ,pvc2LogMode         IN  VARCHAR2            --�k�n�f���[�h
   ,pvc2OutputMode      IN  VARCHAR2            --�o�̓��[�h
   ,pvc2UserId          IN  VARCHAR2            --���[�U�h�c
   ,pvc2BusinessName    IN  VARCHAR2            --�Ɩ���
   ,pvc2PlantCd         IN  VARCHAR2            --�H��R�[�h
   ,pvc2ItemCd          IN  VARCHAR2            --�i�ڔԍ�  
   ,pdtmDate            IN  DATE                --�Ώۓ��t
   ,pblnResult          OUT BOOLEAN             --���茋�� true: �ғ��� false: ��ғ���
    ) RETURN BOOLEAN
IS

-----------------
-- CONST�l�錾 --
-----------------
    MY_SQL_NAME             VARCHAR2(56)    := 'FncIsWorkDay';      --�o�k�^�r�p�k��
    HOLIDAY_FLG_ACT         NUMBER(1)       := 0;                   --�J�����_����-�x���t���O(0:�ғ���)
    HOLIDAY_FLG_NOTACT      NUMBER(1)       := 1;                   --�J�����_����-�x���t���O(1:��ғ���)
    LOGMSG_START            VARCHAR2(20)     := 'Start';             --���O�p���\�b�h�J�n�錾
    LOGMSG_END              VARCHAR2(12)     := 'End';               --���O�p���\�b�h�I���錾

--------------
-- WORK�ϐ� --
--------------
    numFlg              NUMBER;         -- �x���t���O
    blnRet              BOOLEAN;        -- �`�F�b�N����
    numCalNo            NUMBER :=-1;    -- �J�����_�ԍ�(�H��j
    numCalNo1            NUMBER :=-1;    -- �J�����_�ԍ�(�i�ځj
    dtmTruncDate        DATE;           -- wk�Ώۓ��t

BEGIN

    /* �w��H��̃J�����_���擾 */
    SELECT CAL_NO INTO numCalNo FROM M_PLANT
    WHERE PLANT_CD = pvc2PlantCd
    ;

    /*�w��i�ڂ̃J�����_���擾 */
    IF pvc2ItemCd IS NOT NULL THEN
    SELECT CAL_NO INTO numCalNo1 FROM M_ITEM
    WHERE ITEM_CD = pvc2ItemCd
    ;
    END IF;
    
    /* ���t�����𖳎������Ώۓ��t���擾 */
    dtmTruncDate := TRUNC(pdtmDate);

    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);
    IF numCalNo1 != -1 THEN                     --�J�����_���i�ڂ���̎擾�̏ꍇ
    SELECT HOLIDAY_FLG INTO numFlg FROM M_CAL
    WHERE CAL_NO = numCalNo1
    AND CAL_DATE = dtmTruncDate
    ;
    ELSE                                        --�J�����_���H�ꂩ��̎擾�̏ꍇ
    SELECT HOLIDAY_FLG INTO numFlg FROM M_CAL 
    WHERE CAL_NO = numCalNo
    AND CAL_DATE = dtmTruncDate
    ;
    END IF;

    IF numFlg = HOLIDAY_FLG_ACT THEN
        pblnResult := true;
    ELSE
        pblnResult := false;
    END IF
    ;

    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    RETURN TRUE;    -- ����I��

--< ��O���� >---------------------------------------------------------------
EXCEPTION
    WHEN OTHERS THEN
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
