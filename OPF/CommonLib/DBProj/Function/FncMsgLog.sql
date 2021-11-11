CREATE OR REPLACE FUNCTION FNCMSGLOG(
/*------------------------------------------------------------------------------
'
' version   : 1.00.02
'
' �C������
' 2003.07.22 ����
' 2003.07.27 MessageTable�ւ�Insert���̍X�V�񐔂�1��0�ɁE�쐬/�X�V�v���O��������{FUNC������Ɩ����ɂɏC��
' 2003.08.16 ���b�Z�[�W�ϐ�����256��512�ɁE�쐬/�X�V�v���O��������{FUNC���߂�
'            SYS_MSG_LOG�֐ݒ肷��MSG����80�����Ő؂鐧���ǉ�
'            LOG_CD�̍̔Ԃ����ʊ֐��g�p�ɕύX
' 2004.09.24 SUBSTR��SUBSTRB�ɕύX
' 2005.10.21 unicode�Ή��ivarchar2��4�{�ASUBSTRB��4�{�j
'
' �@�\      : ���b�Z�[�W�k�n�f�o��
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
'             pvc2PlantCd          --(i)�H��R�[�h
'             pvc2PlSqlName        - (i)�o�k�^�r�p�k��
'             pvc2MsgId            - (i)���b�Z�[�W�h�c
'             pvc2DataString       - (i)�o�͕�����
'
' �@�\����  : ���b�Z�[�W�k�n�f�̏o�͂��s���B
'
' ���l      :
'
------------------------------------------------------------------------------*/
    pFileHandle      IN UTL_FILE.FILE_TYPE  --�t�@�C���n���h��
   ,pvc2LogMode      IN VARCHAR2     --�k�n�f���[�h
   ,pvc2OutputMode   IN VARCHAR2     --�o�̓��[�h
   ,pvc2UserId       IN VARCHAR2     --���[�U�h�c
   ,pvc2BusinessName IN VARCHAR2     --�Ɩ���
   ,pvc2PlantCd      IN VARCHAR2     --�H��R�[�h
   ,pvc2PlSqlName    IN VARCHAR2     --�o�k�^�r�p�k��
   ,pvc2MsgId        IN VARCHAR2     --���b�Z�[�W�h�c
   ,pvc2DataString   IN VARCHAR2     --�o�͕�����
) RETURN BOOLEAN
IS

-- �J�[�\���̐錾
    CURSOR curSYS_LOG_CD_CTRL IS
    SELECT  LOG_CD
    FROM    SYS_LOG_CD_CTRL
    WHERE   PLANT_CD=pvc2PlantCd
    FOR UPDATE;

-- ROWTYPE �̐錾
    RtpSYS_LOG_CD_CTRL      curSYS_LOG_CD_CTRL%ROWTYPE;

/* �ϐ��̐錾 */
vc2TmpMessage           VARCHAR2(2048);          --�k�n�f���b�Z�[�W
vc2TmpMessageFile       VARCHAR2(2048);          --�k�n�f���b�Z�[�W
strMsg                  VARCHAR2(2048);          --�k�n�f���b�Z�[�W
numSave                 NUMBER(23);
vc2LOG_CD               VARCHAR2(92);
vc2PlantLogCd           VARCHAR2(100);           --�H��R�[�h�{LOG���ʔԍ�
blnRet                  BOOLEAN;
vc2TmpDateTime          VARCHAR2(76);           --���t����
filHdlLogMsg            UTL_FILE.FILE_TYPE;     --�t�@�C���n���h��
vc2RunChkComment        VARCHAR2(2048);          --���s�ʒu�m�F�p�R�����g�쐬��Ɨ̈�

bFlag                   NUMBER(1)     := 0;
nCnt                    NUMBER(1);

/* �萔�̐錾 */
    MY_SQL_NAME             VARCHAR2(36)   := 'FncMsgLog';                  --�o�k�^�r�p�k��
    NUMBER_MAX              VARCHAR2(92)  := '99999999999999999999999';    --�擾�J�E���g�A�b�v�p
    NUMBER_MIN              VARCHAR2(92)  := '1';                          --�擾�J�E���g�A�b�v�p
    LOGKBN_ERR              VARCHAR2(24)   := 'ERROR ';   --�k�n�f���b�Z�[�W�敪�@�G���[
    LOGKBN_TRACE            VARCHAR2(24)   := 'TRACE ';   --�k�n�f���b�Z�[�W�敪�@�g���[�X
    LOGKBN_DATA             VARCHAR2(24)   := 'DATA  ';   --�k�n�f���b�Z�[�W�敪�@�f�[�^
    LOGKBN_MESSAGE          VARCHAR2(24)   := '�Ɩ�  ';   --�k�n�f���b�Z�[�W�敪�@�Ɩ����b�Z�[�W
    FILEOPENMODE_R          VARCHAR2(4)   := 'r';        --�t�@�C���n�o�d�m���[�h�@�q�d�`�c
    FILEOPENMODE_W          VARCHAR2(4)   := 'w';        --�t�@�C���n�o�d�m���[�h�@�v�q�h�s�d
    FILEOPENMODE_A          VARCHAR2(4)   := 'a';        --�t�@�C���n�o�d�m���[�h�@�`�o�o�d�m�c

BEGIN
--DBMS_OUTPUT.ENABLE(1000000);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �J�n ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

--vc2RunChkComment := '���������ʉ� 00010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

/* ���Ұ� �̏o�� */
blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode,
                      pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                      MY_SQL_NAME, 'Parameter�F' || pvc2MsgId || ',' || pvc2DataString);

/* ���b�Z�[�W�̎擾 */
/* ����table�����ɍs���悤�ɏC��. msg_cd ��PK�Ȃ̂Ō��ʂ�0����1���̂� */
SELECT COUNT(*) INTO nCnt FROM SYS_BUSINESS_MESSAGE WHERE msg_cd = pvc2MsgId;
IF nCnt = 0 THEN
    strMsg := '����`�̃G���[�ł��B (' || pvc2MsgId || ')';
ELSE
    SELECT msg INTO strMsg FROM SYS_BUSINESS_MESSAGE WHERE msg_cd = pvc2MsgId;
END IF;


    -- �̔ԃf�[�^���擾

    blnRet := FNCGETNEWLOGCD( pFileHandle
                             ,pvc2LogMode
                             ,pvc2OutputMode
                             ,pvc2UserId
                             ,pvc2BusinessName
                             ,pvc2PlantCd
                             ,vc2PlantLogCd);

    -- �Ɩ����b�Z�[�W��320�����ɐ���
    strMsg := SUBSTRB(strMsg, 1, 320);

--vc2RunChkComment := '���������ʉ� 00170';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    --MessageTable�ւ�Insert
    INSERT INTO SYS_MSG_LOG (
        LOG_CD,
        PLANT_CD,
        BUSINESS_NAME,
        MSG_CD,
        MSG,
        DATA_STRING,
        CONFIRM_DATE,
        CREATED_DATE,
        CREATED_BY,
        CREATED_PRG_NM,
        UPDATED_DATE,
        UPDATED_BY,
        UPDATED_PRG_NM,
        MODIFY_COUNT
     ) Values (
        vc2PlantLogCd,
        pvc2PlantCd,
        pvc2BusinessName,
        pvc2MsgId,
        strMsg,
        pvc2DataString,
        NULL,
        SYSDATE,
        pvc2UserId,
        MY_SQL_NAME,
        SYSDATE,
        pvc2UserId,
        MY_SQL_NAME,
        0
     );


--DBMS_OUTPUT.PUT_LINE('numSave=' || TO_CHAR(numSave) || ' CD=' || vc2PlantLogCd || ' strMsg=' || strMsg);

--vc2RunChkComment := '���������ʉ� 00180';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    --Message�̍쐬
    vc2TmpDateTime := TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS');
    vc2TmpMessage := LOGKBN_MESSAGE || vc2TmpDateTime || ':';
    vc2TmpMessageFile := SUBSTRB(vc2TmpMessage
                                || ',' || pvc2UserId 
                                || ',' || pvc2BusinessName
                                || ',' || pvc2PlantCd
                                || ',' || pvc2PlSqlName
                                || ',' || strMsg
                                || ',' || pvc2DataString,
                                1, 2048);

--vc2RunChkComment := '���������ʉ� 00190';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    /* �k�n�f�o�� */
    UTL_FILE.PUT(pFileHandle, vc2TmpMessageFile || CHR(10));

    /* �����o�� */
    UTL_FILE.FFLUSH(pFileHandle);

--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �I�� ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

    -- ����I��
    RETURN TRUE;



--< ��O���� >---------------------------------------------------------------
EXCEPTION

    WHEN OTHERS THEN
--DBMS_OUTPUT.PUT_LINE('OTHERS');

        /* ���Ұ� �̏o�́i�����o�́j */
        blnRet := FncTraceLog(pFileHandle, 9, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, 'Parameter�F' || pvc2MsgId || ',' || pvc2DataString);

        /* TraceLog �̏o�́i���s�ʒu�j */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, vc2RunChkComment);

        /* Oracle Error �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, pvc2MsgId || ',' || SQLCODE || SQLERRM);

        --Message�̍쐬
        vc2TmpMessage := SUBSTRB(SQLCODE || SUBSTRB(SQLERRM,1,2048) ||
                                '(' ||
                                vc2TmpMessage
                                || ',' || pvc2UserId
                                || ',' || pvc2BusinessName
                                || ',' || pvc2PlantCd
                                || ',' || pvc2PlSqlName
                                || ',' || pvc2MsgId
                                || ',' || pvc2DataString ||
                                ')'
                                ,1,2048);

        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, pvc2MsgId, vc2TmpMessage);

    RETURN FALSE;
END;
/
