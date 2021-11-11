CREATE OR REPLACE FUNCTION      FNCGETSEQCSCALCERRORCD (
/*------------------------------------------------------------------------------
'
'$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/DBProj/Function/FncGetSeqCsCalcErrorCd.sql,v $
'$Author: iwata $
'$Revision: 1.4 $ $Date: 2008/07/24 08:53:16 $
'
' �C������
' 2004.10.20 ����
' 2005.10.21 unicode�Ή��ivarchar2��4�{�j
'
' �@�\      : �����v�Z�G���[�ԍ��̔�
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
'             pvc2ResultData       - (o)��������
'
' �@�\����  : �����v�Z�G���[�ԍ��̍̔Ԃ��s���B
'           : �̔Ԃ͏���SEQ_CS_CALC_ERROR_CD�ōs���A�Q�O���̘A�Ԃ̌`���Ō�������(pvc2ResultData)�ɕԂ��B
'
'
------------------------------------------------------------------------------*/
    pvc2PlantCd         IN  VARCHAR2            --�H��R�[�h
   ,pvc2ResultData      OUT VARCHAR2            --��������
) RETURN BOOLEAN
IS

    numSequenceNo           NUMBER(20);          --�̔ԍςݎ��ʔԍ�
    vc2SequenceNo           VARCHAR2(80);        --�����v�Z�G���[�ԍ�

BEGIN

    SELECT SEQ_CS_CALC_ERROR_CD.NEXTVAL INTO numSequenceNo FROM DUAL;
    vc2SequenceNo  := TO_CHAR(numSequenceNo,'FM00000000000000000000');
    pvc2ResultData := vc2SequenceNo;

    RETURN TRUE;

--< ��O���� >---------------------------------------------------------------
EXCEPTION
    WHEN OTHERS THEN   --���̑��̃G���[
        RETURN FALSE;
END;
/
