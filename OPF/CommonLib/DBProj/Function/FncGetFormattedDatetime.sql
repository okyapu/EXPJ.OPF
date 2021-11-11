CREATE OR REPLACE FUNCTION FNCGETFORMATTEDDATETIME(
/*------------------------------------------------------------------------------
'
' version   : 1.00.01
'
' �C������
' 2007.04.18 ����
'
' �@�\      : �����t�œ��t��Ԃ�
'
' �߂�l    : Varchar2 �����t���t
'
' ������    : pdtmDate             - (i)���t
'
' �@�\����  : �����Ǘ�����ꍇ�Ƃ��Ȃ��ꍇ�œ��t�̕\���������قȂ�̂ŁA
'           : �����ŗ^����ꂽ���t�ɏ�����ݒ肵�ĕԋp����
'
' ���l      : �߂�l�Ƃ��ď����t�̓��t��Ԃ��̂ŁA�G���[��������NULL��Ԃ��B
'
'
------------------------------------------------------------------------------*/
    pdtmDate            IN  DATE                --�ϊ����̓��t
) RETURN VARCHAR2
IS

-- �J�[�\���̐錾
    CURSOR curTIME_CTL IS
    SELECT  VALUE
    FROM    SYS_PARAMETER
    WHERE   NAME = 'TIME_CTRL';

/* �萔�̐錾 */
    MY_SQL_NAME             VARCHAR2(120)  := 'FncGetFormattedDatetime';    --�o�k�^�r�p�k��
    LOGMSG_START            VARCHAR2(20)   := 'Start';                      --���O�p���\�b�h�J�n�錾
    LOGMSG_END              VARCHAR2(12)   := 'End';                        --���O�p���\�b�h�I���錾

/* �ϐ��̐錾 */
    blnRet                  BOOLEAN;
    vc2Date                 VARCHAR2(80);                --�ԋp�l
    vc2TimeCtl              SYS_PARAMETER.VALUE%TYPE;    --�p�����[�^�l

BEGIN

    /* TraceLog �̏o��
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);
    */
 
    /* �p�����[�^�l�̎擾 */
    OPEN curTIME_CTL;
    FETCH curTIME_CTL INTO vc2TimeCtl;
    CLOSE curTIME_CTL;

    /* �̔ԃ��R�[�h�������ꍇ�A���� */
    IF UPPER(vc2TimeCtl) = 'TRUE' THEN
        vc2Date := TO_CHAR(pdtmDate,'YYYY/MM/DD HH24:MI');
    ELSE
        vc2Date := TO_CHAR(pdtmDate,'YYYY/MM/DD');
    END IF;

    /* TraceLog �̏o��
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);
    */

    RETURN vc2Date;

--< ��O���� >---------------------------------------------------------------
EXCEPTION
    WHEN OTHERS THEN   --���̑��̃G���[
        /* ErrorLog �̏o��
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, SQLCODE, SQLERRM);
        */
        /* TraceLog �̏o��
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        */
        RETURN NULL;
END;
/