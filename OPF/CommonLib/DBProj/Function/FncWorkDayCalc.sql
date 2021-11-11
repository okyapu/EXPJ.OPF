CREATE OR REPLACE FUNCTION        FNCWORKDAYCALC(
/*------------------------------------------------------------------------------
'
' version   : 1.00.01
'
' �C������
' 2003.08.06 ����
' 2003.12.15 �I�[�v�������J�[�\����K���N���[�Y����悤�ɏC���B
' 2005.10.21 unicode�Ή��ivarchar2��4�{�j
' 2007.02.22 �����Ή�
' 2010.07.07 �����󒍐��\���P�ɔ����A�������t��̓��t�Z�o���W�b�N�̏C��
' 2011.01.24 ���t�Z�o���W�b�N��ROWNUM���ƕs�����t�ƂȂ�\��������AROW_NUMBER�ɏC��
'
' �@�\      : �ғ����v�Z
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
'             pvc2ItemCd           - (i)�i�ڔԍ�
'             pdtmDate             - (i)�Ώۓ��t
'             pnumDifference       - (i)����
'             pblnStartForwardFlg  - (i)����̑O�|���t���O
'             pdtmActiveDate       - (o)�Z�o�ғ���
'
' �@�\����  : �w��i�ڂ̃J�����_�A������΍H��̃J�����_���g���đΏۓ��t����ғ����x�[�X��
'             �������t��̓��t���Z�o����B
'             �������}�C�i�X�w�肵���ꍇ�͎w�荷�����O�����߂�B
'             �Ώۓ��t���x���̏ꍇ�A����O�|���t���O��TRUE�ł����
'             ���̓��ȍ~�̏��߂̉ғ���������Ƃ���B
'             FALSE�̏ꍇ�͂��̓��ȑO�̏��߂̉ғ���������Ƃ���B
'
' ���l      : �Ώۓ��t�Ɏ��Ԃ��܂܂�Ă��Ă��l�����Ȃ��B(���ԕ����؎̂�)
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
   ,pnumDifference      IN  NUMBER              --����
   ,pblnStartForwardFlg IN  BOOLEAN             --����̑O�|���t���O
   ,pdtmActiveDate      OUT DATE                --�Z�o�ғ���
    ) RETURN BOOLEAN
IS

------------------
-- �J�[�\���錾 --
------------------
    --�y�J�����_���ׁz
CURSOR curM_CAL(
    c_CAL_NO    NUMBER,
    c_CAL_DATE  DATE
    ) IS
    SELECT  HOLIDAY_FLG
    FROM    M_CAL
    WHERE   CAL_NO   = c_CAL_NO
    AND     CAL_DATE = TO_CHAR(c_CAL_DATE,'YYYY/MM/DD');

CURSOR curM_CAL_F1(
    c_CAL_NO    NUMBER,
    c_CAL_DATE  DATE
    ) IS
    SELECT  TO_DATE(MIN(CAL_DATE),'YYYY/MM/DD') AS CAL_DATE
    FROM    M_CAL
    WHERE   CAL_NO      = c_CAL_NO
    AND     HOLIDAY_FLG = 0
    AND     CAL_DATE    > TO_CHAR(c_CAL_DATE,'YYYY/MM/DD');

CURSOR curM_CAL_B1(
    c_CAL_NO    NUMBER,
    c_CAL_DATE  DATE
    ) IS
    SELECT  TO_DATE(MAX(CAL_DATE),'YYYY/MM/DD') AS CAL_DATE
    FROM    M_CAL
    WHERE   CAL_NO      = c_CAL_NO
    AND     HOLIDAY_FLG = 0
    AND     CAL_DATE    < TO_CHAR(c_CAL_DATE,'YYYY/MM/DD');

--���� >= 0
CURSOR curM_CAL_F2(
    c_CAL_NO      NUMBER,
    c_CAL_DATE   VARCHAR2,
    c_Difference   NUMBER
    ) IS
	SELECT CAL_DATE
	FROM(
	    SELECT  ROW_NUMBER() OVER(ORDER BY CAL_DATE ASC) AS ODRNUM,
	            CAL_DATE
	    FROM    M_CAL
	    WHERE   CAL_NO      = c_CAL_NO
	    AND     HOLIDAY_FLG = 0
	    AND     CAL_DATE    > c_CAL_DATE
		)
	WHERE ODRNUM = c_Difference;

--���� < 0
CURSOR curM_CAL_B2(
    c_CAL_NO    NUMBER,
    c_CAL_DATE  VARCHAR2,
    c_Difference  NUMBER
    ) IS
	SELECT CAL_DATE
	FROM
	   (SELECT  ROW_NUMBER() OVER(ORDER BY CAL_DATE DESC) AS ODRNUM,
                CAL_DATE
	    FROM
	    (SELECT  CAL_DATE
	     FROM    M_CAL
	     WHERE   CAL_NO      = c_CAL_NO
	     AND     HOLIDAY_FLG = 0
	     AND     CAL_DATE    < c_CAL_DATE
	    )
	   )
	WHERE ODRNUM = c_Difference;
-----------------
-- CONST�l�錾 --
-----------------
    MY_SQL_NAME             VARCHAR2(56)    := 'FncWorkDayCalc';    --�o�k�^�r�p�k��
    HOLIDAY_FLG_ACT         NUMBER(1)       := 0;                   --�J�����_����-�x���t���O(0:�ғ���)
    HOLIDAY_FLG_NOTACT      NUMBER(1)       := 1;                   --�J�����_����-�x���t���O(1:��ғ���)
    LOGMSG_START            VARCHAR2(20)     := 'Start';             --���O�p���\�b�h�J�n�錾
    LOGMSG_END              VARCHAR2(12)     := 'End';               --���O�p���\�b�h�I���錾

-----------------
-- MESSAGE�錾 --
-----------------
    APS_COM_NOTEXIST_M_CAL  VARCHAR2(28)   := 'ZZ06002';       -- �J�����_���׃f�[�^�����݂��܂���

-------------
-- LOG�錾 --
-------------

--------------
-- WORK�ϐ� --
--------------
    blnRet              BOOLEAN;        -- Function�ԋp�l
    numCalNo            NUMBER :=-1;        -- �J�����_�ԍ�(�H��j
    numCalNo1           NUMBER :=-1;        -- �J�����_�ԍ�(�i�ځj
    numHolidayFlg       NUMBER(1);      -- �x���t���O
    numCnt              NUMBER(4);      -- ����
    dtmStartCalDate     DATE;           -- wk���
    dtmActiveDate       DATE;           -- wk�ғ���
    dtmTruncDate        DATE;           -- wk�Ώۓ��t

    excNotExist_M_CAL   EXCEPTION;  --�y�J�����_�}�X�^�z�����݃G���[

BEGIN

    /*�w��i�ڂ̃J�����_���擾 */
    IF pvc2ItemCd IS NOT NULL THEN
        SELECT NVL(CAL_NO, -1) INTO numCalNo1 FROM M_ITEM
        WHERE ITEM_CD = pvc2ItemCd;
    END IF;
    IF numCalNo1 != -1 THEN
        numCalNo := numCalNo1;
    ELSE
        SELECT CAL_NO INTO numCalNo FROM M_PLANT
        WHERE PLANT_CD = pvc2PlantCd;
    END IF;

    /* ���t�����𖳎������Ώۓ��t���擾 */
    dtmTruncDate := TRUNC(pdtmDate);

    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

    OPEN curM_CAL(numCalNo,dtmTruncDate);
    FETCH curM_CAL INTO numHolidayFlg;
    IF curM_CAL%NOTFOUND THEN
        CLOSE curM_CAL;
        RAISE excNotExist_M_CAL;                -- �Y�����t�f�[�^�Ȃ��G���[
    END IF;
    CLOSE curM_CAL;

    IF numHolidayFlg = HOLIDAY_FLG_ACT THEN    -- ������ғ����̏ꍇ
        dtmStartCalDate := dtmTruncDate;
    ELSE                                        -- �������ғ����i�x���j�̏ꍇ
        IF pblnStartForwardFlg = TRUE THEN      -- �t�H���[�h�̏ꍇ
            OPEN curM_CAL_F1(numCalNo,dtmTruncDate);
            FETCH curM_CAL_F1 INTO dtmStartCalDate;
            IF curM_CAL_F1%NOTFOUND THEN
                CLOSE curM_CAL_F1;
                RAISE excNotExist_M_CAL;                -- �Y�����t�f�[�^�Ȃ��G���[
            END IF;
            CLOSE curM_CAL_F1;
        ELSE                                    -- �o�b�N�̏ꍇ
            OPEN curM_CAL_B1(numCalNo,dtmTruncDate);
            FETCH curM_CAL_B1 INTO dtmStartCalDate;
            IF curM_CAL_B1%NOTFOUND THEN
                CLOSE curM_CAL_B1;
                RAISE excNotExist_M_CAL;                -- �Y�����t�f�[�^�Ȃ��G���[
            END IF;
            CLOSE curM_CAL_B1;
        END IF;
    END IF;

    IF pnumDifference > 0 THEN      -- �������v���X(���̒l)�̏ꍇ
        OPEN curM_CAL_F2(numCalNo,TO_CHAR(dtmStartCalDate,'YYYY/MM/DD'),pnumDifference);
        FETCH curM_CAL_F2 INTO dtmActiveDate;
        IF curM_CAL_F2%NOTFOUND THEN
            CLOSE curM_CAL_F2;
            RAISE excNotExist_M_CAL;                -- �Y�����t�f�[�^�Ȃ��G���[
        END IF;
        CLOSE curM_CAL_F2;
    ELSIF pnumDifference < 0 THEN   -- �������}�C�i�X(���̒l)�̏ꍇ
        OPEN curM_CAL_B2(numCalNo,TO_CHAR(dtmStartCalDate,'YYYY/MM/DD'),ABS(pnumDifference));
        FETCH curM_CAL_B2 INTO dtmActiveDate;
        IF curM_CAL_B2%NOTFOUND THEN
            CLOSE curM_CAL_B2;
            RAISE excNotExist_M_CAL;                -- �Y�����t�f�[�^�Ȃ��G���[
        END IF;
        CLOSE curM_CAL_B2;
    ELSE                            -- �������[���̏ꍇ
        dtmActiveDate := dtmStartCalDate;
    END IF;

    pdtmActiveDate := TO_DATE(TO_CHAR(dtmActiveDate,'YYYYMMDD') || TO_CHAR(pdtmDate,'HH24MISS'),'YYYYMMDDHH24MISS');

    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    RETURN TRUE;    -- ����I��

--< ��O���� >---------------------------------------------------------------
EXCEPTION
    WHEN excNotExist_M_CAL      THEN    --�y�J�����_�}�X�^�z�����݃G���[
        /* ���b�Z�[�W�̏o�� */
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_NOTEXIST_M_CAL, '(SBM0065)�J�����_�}�X�^���ݒ�');
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        RETURN FALSE;
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
