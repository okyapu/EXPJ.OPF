CREATE OR REPLACE FUNCTION FNCSHIPQTYPSSIBLECALCFORMRP(
/*------------------------------------------------------------------------------
'
' version   : 1.00.00
'
' �C������
' 2003.10.16 �V�K�쐬
' 2004.09.24 SUBSTR��SUBSTRB�ɕύX
' 2005.10.21 unicode�Ή��ivarchar2��4�{�ASUBSTRB�̈�����4�{�j
'
' �@�\      : �l�q�o�o�׉\�����f
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
'             pvc2PlantCd               - (i)�H��R�[�h
'             pnumRcvIssueQty      - (i)�o�׎��ѐ�
'             pvc2ItemCd           - (i)�i�ڔԍ�
'             pblnRetQty           - (o)�o�׉\������
'
' �@�\����  : FncAutoShip�i�����o�׏����j����g�p����
'
' ���l      :
'
------------------------------------------------------------------------------*/
    pFileHandle         IN  UTL_FILE.FILE_TYPE  --�t�@�C���n���h��
   ,pvc2LogMode         IN  VARCHAR2            --�k�n�f���[�h
   ,pvc2OutputMode      IN  VARCHAR2            --�o�̓��[�h
   ,pvc2UserId          IN  VARCHAR2            --���[�U�h�c
   ,pvc2BusinessName    IN  VARCHAR2            --�Ɩ���
   ,pvc2PlantCd                 IN      VARCHAR2       --// �H��R�[�h
   ,pnumRcvIssueQty     IN  NUMBER              --�o�א�
   ,pvc2ItemCd          IN  VARCHAR2            --�i�ڔԍ�
   ,pblnRetQty          OUT BOOLEAN         --�o�׉\������

)RETURN BOOLEAN
IS
    -- ��O�̐錾 

    -- �萔�̐錾
    MY_SQL_NAME             VARCHAR2(108)    := 'FncShipQtyPssibleCalcForMrp';
    MRPFLAG_TARGET          NUMBER          := 1;   --�ۊǋ�-MRP�Ώۃt���O(1:MRP�Ώ�)

    -- �ϐ��̐錾 
    blnRet                  BOOLEAN;        --�֐��߂�l
    intRet                  INTEGER;        --�֐��߂�l
    vc2Comment              VARCHAR2(1024);  --���b�Z�[�W�p�R�����g�쐬��Ɨ̈�
    vc2RunChkComment        VARCHAR2(1024);  --���s�ʒu�m�F�p�R�����g�쐬��Ɨ̈�
    numSumOfStockAll        NUMBER;         --�o�׉\��

-- MESSAGE �̐錾 
    APS_COM_ORACLE_ERR                  VARCHAR2(28)     := 'AK53401';    --�n�q�`�b�k�d�G���[
    APS_COM_OTHER_ERR                   VARCHAR2(28)     := 'AK53402';    --���̑��G���[

-- LOG �̐錾 
    LOGMSG_START                        VARCHAR2(20)   := 'Start';         --���O�p���\�b�h�J�n�錾
    LOGMSG_END                          VARCHAR2(12)   := 'End';           --���O�p���\�b�h�I���錾
    LOGMSG_ERR                          VARCHAR2(32)   := '�ُ�I��';
    COMMENT_MSGLOG_END                  VARCHAR2(104)  := '<< �l�q�o�o�׉\�����f >>';


BEGIN
--DBMS_OUTPUT.ENABLE(1000000);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �J�n ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
vc2RunChkComment := NULL;

    -- TraceLog �̏o�� 
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);
--vc2RunChkComment := '���������ʉ� 00010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- �o�׉\���Z�o
    SELECT SUM(STOCK_ON_HAND_QTY) INTO numSumOfStockAll
      FROM T_ITEM_STOCK A, M_WH B
      WHERE A.WH_CD = B.WH_CD
        AND A.ITEM_CD = pvc2ItemCd
    AND A.PLANT_CD = pvc2PlantCd
        AND B.MRP_FLG = MRPFLAG_TARGET;
    IF numSumOfStockAll IS NULL THEN
        numSumOfStockAll := 0;
    END IF;
    IF numSumOfStockAll < 0 THEN
        numSumOfStockAll := 0;
    END IF;

--vc2RunChkComment := '���������ʉ� 00020';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- �o�׉\�����f
    IF pnumRcvIssueQty <= numSumOfStockAll THEN
        pblnRetQty := TRUE;
    ELSE
        pblnRetQty := FALSE;
    END IF;



--vc2RunChkComment := '���������ʉ� 00030';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- TraceLog �̏o�� 
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �I�� ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

    RETURN TRUE;

EXCEPTION

    WHEN OTHERS THEN
--DBMS_OUTPUT.PUT_LINE('���̑��̃G���[');
        ROLLBACK;
        vc2Comment := SUBSTRB('(SBM0057)' || COMMENT_MSGLOG_END || LOGMSG_ERR || '�F' ||
                             SQLCODE || ',' || SUBSTRB(SQLERRM,1,1024),
                             1,1024);
        -- �G���[���b�Z�[�W�̏o��
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_ORACLE_ERR, vc2Comment);
        /* TraceLog �̏o�́i���s�ʒu�j */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END || vc2RunChkComment);
        -- TraceLog �̏o�� 
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;
END;
/
