CREATE OR REPLACE procedure      SQLSTDITEMCOSTACCOUNT(
/*------------------------------------------------------------------------------
'
'$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/DBProj/Procedure/SqlStdItemCostAccount.sql,v $
'$Author: feng-yi $
'$Revision: 1.4 $ $Date: 2011/12/23 03:19:58 $
'                        2005.10.24 unicode�Ή��ivarchar2��4�{�j
'                        2006/08/08 �i�ڕʉ��H��̐��i�\���Ő���VARCHAR2�Œ�`
'
'
' �@�\      : �i�ڕʕW�������Ϗ㏈��
'
' �߂�l    :
'
' ������    : ��MetamorBase���ʁi�K�{�j
'             pvc2LogMode          - (i)�k�n�f���[�h
'             pvc2OutputMode       - (i)�o�̓��[�h
'             pvc2OutputPath       - (i)�o�̓t�@�C���p�X
'             pvc2OutputName       - (i)�o�̓t�@�C����
'             pvc2UserId           - (i)���[�U�h�c
'             pvc2BusinessName     - (i)�Ɩ���
'             pvc2PlantCd          - (i)�H��R�[�h
'             ���v���O�����ŗL
'             pnumYear             - (i)�Ώ۔N�x
'             pnumHalfTermTyp      - (i)�����敪
'             pnumCostTyp          - (i)�������
'             pnumActTyp           - (i)���s�敪�i1:�ʏ���s�A2:�Ď��s�j
'             pnumReturn           - (o)�������� (1:����I���A2:�x���I���A3:�ُ�I��)
'
' �@�\����  : [�i�ڕʌ���]�A[�i�ڕʉ��H��]�̕W�������Ϗ�v�Z���s���B
' ���l      :
'
------------------------------------------------------------------------------*/

--< �v���V�[�W������` >-----------------------------------------------------
    pvc2LogMode          IN  VARCHAR2        --�k�n�f���[�h
   ,pvc2OutputMode       IN  VARCHAR2        --�o�̓��[�h
   ,pvc2OutputPath       IN  VARCHAR2        --�o�̓p�X
   ,pvc2OutputName       IN  VARCHAR2        --�o�̓t�@�C����
   ,pvc2UserId           IN  VARCHAR2        --���[�U�h�c
   ,pvc2BusinessName     IN  VARCHAR2        --�Ɩ���
   ,pvc2PlantCd          IN  VARCHAR2        --�H��R�[�h
   ,pnumYear             IN  NUMBER          --�Ώ۔N�x
   ,pnumHalfTermTyp      IN  NUMBER          --�����敪
   ,pnumCostTyp          IN  NUMBER          --�������
   ,pnumActTyp           IN  NUMBER          --���s�敪
   ,pnumReturn           OUT NUMBER          --��������
)
IS

    /* �萔�̐錾 */

    METHOD_START            VARCHAR2(20) := 'START';          --���O�p���\�b�h�J�n�錾
    METHOD_END              VARCHAR2(12) := 'End';            --���O�p���\�b�h�I���錾
    MY_SQL_NAME             VARCHAR2(120) := 'SQLSTDITEMCOSTACCOUNT'; --�o�k�^�r�p�k��

    APS_COM_BATCH_START     VARCHAR2(28) := 'DC01207';
    APS_COM_BATCH_END       VARCHAR2(28) := 'DC01208';
    APS_COM_BATCH_EXP       VARCHAR2(28) := 'DC01209';

    LOGMSG_START_PGNM       VARCHAR2(200) := '(SBM0532)�i�ڕʕW�������Ϗ㏈�����J�n���܂���';
    LOGMSG_END_PGNM         VARCHAR2(200) := '�i�ڕʕW�������Ϗ㏈�����I�����܂���';
    LOGMSG_EXP_PGNM         VARCHAR2(200) := '�i�ڕʕW�������Ϗ㏈�����ُ�I�����܂���';

    STATUS_NORMAL           NUMBER        := 1;          -- ����I��
    STATUS_WARNING          NUMBER        := 2;          -- �x���I��
    STATUS_ERROR            NUMBER        := 3;          -- �ُ�I��

    /* �ϐ��̒�` */
    UTL_FileHandle          UTL_FILE.FILE_TYPE;    --�t�@�C���n���h��

    numCntTest              NUMBER(11)   := 0;     --DEBUG�p

    numCntMain              NUMBER(11)  := 0;    --�Ώۃf�[�^����(�i�ڕʌ���)
    numCountLoop            NUMBER(11)  := 0;     --LOOP����
    numCntUp1               NUMBER(11)  := 0;    --�Ώۃf�[�^����(�i�ڕʌ���)
    numCntUp2               NUMBER(11)  := 0;    --�Ώۃf�[�^����(�i�ڕʌ���)
    numCountError           NUMBER(11)  := 0;     --�ُ�f�[�^����
    numCountDummy           NUMBER(11)  := 0;     --�����`�F�b�N�p

    blnRet                  BOOLEAN;               --���ʊ֐��̖ߒl
    vc2Comment              VARCHAR2(1024);         --���b�Z�[�W�쐬�p

    vc2PhaseStartMonth      VARCHAR2(24);           --�w�蔼���̊���
    vc2PhaseEndMonth        VARCHAR2(24);           --�w�蔼���̊�����

    vc2ParentItemCd         T_ITEM_COST.PARENT_ITEM_CD%TYPE;  
    numPsEdition            T_ITEM_COST.PS_EDITION%TYPE;  
    vc2CsProcCd             T_ITEM_COST.CS_PROC_CD%TYPE;  
    numPROC_TotalProcCostSum  T_ITEM_COST.TOTAL_PROC_COST_SUM_ALL%TYPE;
    numToatlMatrCost        T_ITEM_COST.UNDER_MATR_COST%TYPE;
    numToatlSbcntMatrCost   T_ITEM_COST.UNDER_SBCNT_MATR_COST%TYPE;
    numToatlProcCostSum     T_ITEM_COST.UNDER_PROC_COST_SUM_ALL%TYPE;
    numCostStatementNo      T_ITEM_COST.COST_STATEMENT_NO%TYPE;  
    numParentCostStatementNo  T_ITEM_COST.PARENT_COST_STATEMENT_NO%TYPE;  

    numTotalProcCost01      T_ITEM_PROC_COST.TOTAL_PROC_COST_01%TYPE;
    numTotalProcCost02      T_ITEM_PROC_COST.TOTAL_PROC_COST_02%TYPE;
    numTotalProcCost03      T_ITEM_PROC_COST.TOTAL_PROC_COST_03%TYPE;
    numTotalProcCost04      T_ITEM_PROC_COST.TOTAL_PROC_COST_04%TYPE;
    numTotalProcCost05      T_ITEM_PROC_COST.TOTAL_PROC_COST_05%TYPE;
    numTotalProcCost06      T_ITEM_PROC_COST.TOTAL_PROC_COST_06%TYPE;
    numTotalProcCost07      T_ITEM_PROC_COST.TOTAL_PROC_COST_07%TYPE;
    numTotalProcCost08      T_ITEM_PROC_COST.TOTAL_PROC_COST_08%TYPE;
    numTotalProcCost09      T_ITEM_PROC_COST.TOTAL_PROC_COST_09%TYPE;
    numTotalProcCost10      T_ITEM_PROC_COST.TOTAL_PROC_COST_10%TYPE;
    numTotalProcCost11      T_ITEM_PROC_COST.TOTAL_PROC_COST_11%TYPE;
    numTotalProcCost12      T_ITEM_PROC_COST.TOTAL_PROC_COST_12%TYPE;
    numTotalProcCostSum     T_ITEM_PROC_COST.TOTAL_PROC_COST_SUM%TYPE;

    /* �c�a����̎擾���� */
    numStartMonth           SYS_COST_CTRL.START_MONTH%TYPE;       --�N�x�J�n��

    /* ��O�����p�ϐ� */
    excERR_SKIP            EXCEPTION;      --���s�s��
    excERR_CURSOR          EXCEPTION;      --�J�[�\��OPEN����EXCEPTION

    /* �J�[�\���̐錾  �i�ڕʌ���*/
    CURSOR curMAIN(
         cnumUpLevelNo    NUMBER
    )
    IS
--  SELECT *
SELECT
 YEAR
,HALF_TERM_TYP
,COST_TYP
,PLANT_CD
,ROOT_ITEM_CD
,PARENT_ITEM_CD
,ITEM_CD
,PS_EDITION
,COST_STATEMENT_NO
,LOWER_ITEM_FLG
,COST_EXCLUDE_FLG
,NECESSARY_QTY
,ITEM_INPUT_RATIO
,UPPER_ITEM_FLG
,UNDER_MATR_COST
,UNDER_SBCNT_MATR_COST
,UNDER_PROC_COST_SUM_ALL
,OWN_MATR_COST
,OWN_SBCNT_MATR_COST
,OWN_PROC_COST_SUM_ALL
,PARENT_COST_STATEMENT_NO
      FROM T_ITEM_COST
      WHERE YEAR=pnumYear
      AND   HALF_TERM_TYP=pnumHalfTermTyp
      AND   COST_TYP=pnumCostTyp
      AND   PLANT_CD=pvc2PlantCd
      AND   UP_LEVEL_NO=cnumUpLevelNo
--  ���ʕ��i��0�N���A����ׁA���O�i�������ΏۂƂ���
--    AND   COST_EXCLUDE_FLG=0  --�����v�Z���O�t���O
--    AND   ROOT_ITEM_CD = 'OPM-01005-BLK'  --DEGUG�p UMINO
      ORDER BY COST_STATEMENT_NO DESC,PARENT_ITEM_CD,ITEM_CD,ROOT_ITEM_CD
      ;
    recMAIN curMAIN%ROWTYPE;

    /* �J�[�\���̐錾  �i�ڕʉ��H��*/
    CURSOR curITEM_PROC_COST(
         cvc2RootItemCd       VARCHAR2
        ,cvc2ParentItemCd     VARCHAR2
        ,cvc2ItemCd           VARCHAR2
        ,cnumPsEdition        VARCHAR2
        ,cnumCostStatementNo  NUMBER
    )
    IS
--  SELECT  T.*
    SELECT
 YEAR
,HALF_TERM_TYP
,COST_TYP
,PLANT_CD
,ROOT_ITEM_CD
,PARENT_ITEM_CD
,ITEM_CD
,PS_EDITION
,COST_STATEMENT_NO
,PROC_COST_CLS_CD
,OWN_PROC_COST_01
,OWN_PROC_COST_02
,OWN_PROC_COST_03
,OWN_PROC_COST_04
,OWN_PROC_COST_05
,OWN_PROC_COST_06
,OWN_PROC_COST_07
,OWN_PROC_COST_08
,OWN_PROC_COST_09
,OWN_PROC_COST_10
,OWN_PROC_COST_11
,OWN_PROC_COST_12
,UNDER_PROC_COST_01
,UNDER_PROC_COST_02
,UNDER_PROC_COST_03
,UNDER_PROC_COST_04
,UNDER_PROC_COST_05
,UNDER_PROC_COST_06
,UNDER_PROC_COST_07
,UNDER_PROC_COST_08
,UNDER_PROC_COST_09
,UNDER_PROC_COST_10
,UNDER_PROC_COST_11
,UNDER_PROC_COST_12
      FROM    T_ITEM_PROC_COST
      WHERE   YEAR             = pnumYear
        AND   HALF_TERM_TYP    = pnumHalfTermTyp
        AND   COST_TYP         = pnumCostTyp
        AND   PLANT_CD         = pvc2PlantCd
        AND   ROOT_ITEM_CD     = cvc2RootItemCd
        AND   PARENT_ITEM_CD   = cvc2ParentItemCd
        AND   ITEM_CD          = cvc2ItemCd
        AND   PS_EDITION       = cnumPsEdition
        AND   COST_STATEMENT_NO= cnumCostStatementNo
    ;
    recITEM_PROC_COST curITEM_PROC_COST%ROWTYPE;

BEGIN
    /* LogFile �� OPEN */
    blnRet :=  FNCLOGOPEN(pvc2OutputPath, pvc2OutputName,pvc2PlantCd, pvc2OutputMode, UTL_FileHandle);

    /* TraceLog�̏o��(Start)�������s�� */
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, METHOD_START);

    /* �Ɩ��J�n���b�Z�[�W�̏o�� */
    blnRet :=   FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_START,
                          LOGMSG_START_PGNM);
    COMMIT;

    /* �J�E���^�̏����� */
    numCntMain          := 0;     /*�Ώۃf�[�^����(�i�ڕʌ���)  */
    numCountError       := 0;     /*�ُ�f�[�^����(�����G���[)  */

    /*  �����Ǘ��p�����[�^�̓Ǎ� */ 
    BEGIN
        SELECT  START_MONTH  
          INTO  numStartMonth
          FROM  SYS_COST_CTRL
          WHERE  PLANT_CD  =  pvc2PlantCd;
    EXCEPTION
        WHEN OTHERS THEN
            vc2Comment := SUBSTR('(SBM0535)1:�����Ǘ��p�����[�^�����݂��܂���B'  ||
                                 ' USER_CD=' || '[ ' || pvc2UserId || ' ]' ||
                                 ' PLANT_CD=' || '[ ' || pvc2PlantCd || ' ]',1,256);
            RAISE   excERR_SKIP;  
    END;

    /*  �p�����[�^�̃`�F�b�N  �Ώ۔N�x*/
    IF  pnumYear  IS  NULL  THEN
        vc2Comment := SUBSTR('(SBM0536)2:�p�����[�^�s���B'  ||
                             ' �Ώ۔N�x=' || '[ ' || pnumYear || '	]',1,256);
        RAISE   excERR_SKIP;  
    END IF;
    /*  �p�����[�^�̃`�F�b�N  �����敪*/
    IF  pnumHalfTermTyp  NOT IN (1,2)  THEN
        vc2Comment := SUBSTR('(SBM0218)3:�p�����[�^�s���B'  ||
                             ' �����敪=' || '[ ' || pnumHalfTermTyp || ' ]',1,256);
        RAISE   excERR_SKIP;  
    END IF;

    /*  �Ώ۔N�x/�����敪/�N�x�J�n�����A�w�蔼���̊���/���������擾 */
    vc2PhaseStartMonth :=  TO_CHAR(pnumYear + FLOOR((numStartMonth  -1+((pnumHalfTermTyp-1)*6))/12) ||
                                   LPAD( MOD((numStartMonth  -1+((pnumHalfTermTyp-1)*6)),12)+1 ,2,'0')
                                  ); 
    vc2PhaseEndMonth   :=  TO_CHAR(pnumYear + FLOOR((numStartMonth+5-1+((pnumHalfTermTyp-1)*6))/12) ||
                                   LPAD( MOD((numStartMonth+5-1+((pnumHalfTermTyp-1)*6)),12)+1 ,2,'0')
                                  ); 

/*��������������������������������������������������������������������������������������������������������
' �K�w���Ƃ�ٰ��
����������������������������������������������������������������������������������������������������������*/

    FOR i IN 1..999999 LOOP  /* �K�w���x�����Ƃ̃��[�v */

    BEGIN  /* �J�[�\��OPEN(�i�ڕʌ���) */
        OPEN  curMAIN(i);
    EXCEPTION
        WHEN OTHERS THEN
            vc2Comment  := SUBSTR('4:OPEN curMAIN'  ||
                                  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
            RAISE    excERR_CURSOR;
    END;  /* �J�[�\��OPEN(�i�ڕʌ���) */

    /* PUT_LINE */
        blnRet :=   FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                      pvc2PlantCd, MY_SQL_NAME, 'MAIN-LOOP UP_LEVEL_NO='||i);
    /* PUT_LINE */

/*��������������������������������������������������������������������������������������������������������
' �K�w���Ƃ�ٰ�߁|�P�K�w��ٰ��
����������������������������������������������������������������������������������������������������������*/

    numCountLoop := 0;  /*1���x�����Ώۃf�[�^����*/

    /* PUT_LINE */
    numCntTest := 0;
    /* PUT_LINE */
    
    LOOP  /*  �i�ڕʌ����̌J��Ԃ�(MAIN LOOP) */
        BEGIN  /* �J�[�\��FETCH(�i�ڕʌ���) */
            FETCH  curMAIN  INTO  recMAIN;
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment := SUBSTR('5:FETCH curMAIN'  ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE  excERR_CURSOR;
        END;  /* �J�[�\��FETCH(�i�ڕʌ���) */
        EXIT WHEN  curMAIN%NOTFOUND;

        numCntMain   := numCntMain   + 1;  /* �Ώۃf�[�^����(�i�ڕʌ���) */
        numCountLoop := numCountLoop + 1;  /*1���x�����Ώۃf�[�^����*/
/* PUT_LINE */
        numCntTest   := numCntTest   + 1;
/*   PUT_LINE */

    /* PUT_LINE */
        IF  numCntTest >=  10000 THEN
            blnRet :=   FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                      pvc2PlantCd, MY_SQL_NAME, 'SUB-LOOP numCountLoop='||numCountLoop);
            numCntTest := 0;
        END IF;
    /*  PUT_LINE */

        numPROC_TotalProcCostSum := 0;  /*���i�ڕʉ��H��*/

        BEGIN  /* �J�[�\��OPEN(�i�ڕʉ��H��) */
            OPEN  curITEM_PROC_COST(recMAIN.ROOT_ITEM_CD
                                   ,recMAIN.PARENT_ITEM_CD
                                   ,recMAIN.ITEM_CD
                                   ,recMAIN.PS_EDITION
                                   ,recMAIN.COST_STATEMENT_NO
                                   );
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment  := SUBSTR('6:OPEN curITEM_PROC_COST'  ||
                                      ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                      ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE    excERR_CURSOR;
        END;  /* �J�[�\��OPEN(�i�ڕʉ��H��) */

/*��������������������������������������������������������������������������������������������������������
' �K�w���Ƃ�ٰ�߁|�P�K�w��ٰ�߁|�i�ڕʉ��H���ٰ��
����������������������������������������������������������������������������������������������������������*/

        LOOP  /*  �i�ڕʉ��H��̌J��Ԃ� */
            BEGIN  /* �J�[�\��FETCH(�i�ڕʉ��H��) */
                FETCH  curITEM_PROC_COST  INTO  recITEM_PROC_COST;
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment  := SUBSTR('7:FETCH curITEM_PROC_COST'  ||
                                          ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                          ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE  excERR_CURSOR;
            END;  /* �J�[�\��FETCH(�i�ڕʉ��H��) */
            EXIT WHEN  curITEM_PROC_COST%NOTFOUND;

/*��������������������������������������������������������������������������������������������������������
' �K�w���Ƃ�ٰ�߁|�P�K�w��ٰ�߁|�i�ڕʉ��H���ٰ�߁|�����̏����i���[�i�j
' (UNDER��=0,TOTAL��=OWN��)
����������������������������������������������������������������������������������������������������������*/

            IF  recMAIN.LOWER_ITEM_FLG = 1 THEN  /*[���[�i]����*/

                /*�Ϗグ��v�Z*/
                IF  recMAIN.COST_EXCLUDE_FLG = 0 THEN
                    numTotalProcCost01  :=  recITEM_PROC_COST.OWN_PROC_COST_01;
                    numTotalProcCost02  :=  recITEM_PROC_COST.OWN_PROC_COST_02;
                    numTotalProcCost03  :=  recITEM_PROC_COST.OWN_PROC_COST_03;
                    numTotalProcCost04  :=  recITEM_PROC_COST.OWN_PROC_COST_04;
                    numTotalProcCost05  :=  recITEM_PROC_COST.OWN_PROC_COST_05;
                    numTotalProcCost06  :=  recITEM_PROC_COST.OWN_PROC_COST_06;
                    numTotalProcCost07  :=  recITEM_PROC_COST.OWN_PROC_COST_07;
                    numTotalProcCost08  :=  recITEM_PROC_COST.OWN_PROC_COST_08;
                    numTotalProcCost09  :=  recITEM_PROC_COST.OWN_PROC_COST_09;
                    numTotalProcCost10  :=  recITEM_PROC_COST.OWN_PROC_COST_10;
                    numTotalProcCost11  :=  recITEM_PROC_COST.OWN_PROC_COST_11;
                    numTotalProcCost12  :=  recITEM_PROC_COST.OWN_PROC_COST_12;
                ELSE
                    numTotalProcCost01  :=  0;
                    numTotalProcCost02  :=  0;
                    numTotalProcCost03  :=  0;
                    numTotalProcCost04  :=  0;
                    numTotalProcCost05  :=  0;
                    numTotalProcCost06  :=  0;
                    numTotalProcCost07  :=  0;
                    numTotalProcCost08  :=  0;
                    numTotalProcCost09  :=  0;
                    numTotalProcCost10  :=  0;
                    numTotalProcCost11  :=  0;
                    numTotalProcCost12  :=  0;
                END IF;
                numTotalProcCostSum  :=  numTotalProcCost01 + 
                                         numTotalProcCost02 +
                                         numTotalProcCost03 +
                                         numTotalProcCost04 +
                                         numTotalProcCost05 +
                                         numTotalProcCost06 +
                                         numTotalProcCost07 +
                                         numTotalProcCost08 +
                                         numTotalProcCost09 +
                                         numTotalProcCost10 +
                                         numTotalProcCost11 +
                                         numTotalProcCost12;
                /*T_ITEM_COST���[�i�p*/
                numPROC_TotalProcCostSum := numPROC_TotalProcCostSum + numTotalProcCostSum;

                BEGIN  /*[�i�ڕʉ��H��]�X�V(�N���A)*/
                    UPDATE  T_ITEM_PROC_COST  SET
                            UNDER_PROC_COST_01  = 0
                           ,UNDER_PROC_COST_02  = 0
                           ,UNDER_PROC_COST_03  = 0
                           ,UNDER_PROC_COST_04  = 0
                           ,UNDER_PROC_COST_05  = 0
                           ,UNDER_PROC_COST_06  = 0
                           ,UNDER_PROC_COST_07  = 0
                           ,UNDER_PROC_COST_08  = 0
                           ,UNDER_PROC_COST_09  = 0
                           ,UNDER_PROC_COST_10  = 0
                           ,UNDER_PROC_COST_11  = 0
                           ,UNDER_PROC_COST_12  = 0
                           ,UNDER_PROC_COST_SUM = 0
                           ,TOTAL_PROC_COST_01  = numTotalProcCost01
                           ,TOTAL_PROC_COST_02  = numTotalProcCost02
                           ,TOTAL_PROC_COST_03  = numTotalProcCost03
                           ,TOTAL_PROC_COST_04  = numTotalProcCost04
                           ,TOTAL_PROC_COST_05  = numTotalProcCost05
                           ,TOTAL_PROC_COST_06  = numTotalProcCost06
                           ,TOTAL_PROC_COST_07  = numTotalProcCost07
                           ,TOTAL_PROC_COST_08  = numTotalProcCost08
                           ,TOTAL_PROC_COST_09  = numTotalProcCost09
                           ,TOTAL_PROC_COST_10  = numTotalProcCost10
                           ,TOTAL_PROC_COST_11  = numTotalProcCost11
                           ,TOTAL_PROC_COST_12  = numTotalProcCost12
                           ,TOTAL_PROC_COST_SUM = numTotalProcCostSum
                           ,UPDATED_DATE=SYSDATE,UPDATED_BY= pvc2UserId,UPDATED_PRG_NM= MY_SQL_NAME
                           ,MODIFY_COUNT = MODIFY_COUNT+1
                    WHERE   YEAR             = recITEM_PROC_COST.YEAR
                      AND   HALF_TERM_TYP    = recITEM_PROC_COST.HALF_TERM_TYP
                      AND   COST_TYP         = recITEM_PROC_COST.COST_TYP
                      AND   PLANT_CD         = recITEM_PROC_COST.PLANT_CD
                      AND   ROOT_ITEM_CD     = recITEM_PROC_COST.ROOT_ITEM_CD
                      AND   PARENT_ITEM_CD   = recITEM_PROC_COST.PARENT_ITEM_CD
                      AND   ITEM_CD          = recITEM_PROC_COST.ITEM_CD
                      AND   PS_EDITION       = recITEM_PROC_COST.PS_EDITION
                      AND   COST_STATEMENT_NO= recITEM_PROC_COST.COST_STATEMENT_NO
                      AND   PROC_COST_CLS_CD = recITEM_PROC_COST.PROC_COST_CLS_CD
                    ;
                EXCEPTION
                    WHEN OTHERS THEN
                        vc2Comment := SUBSTR('8:(SBM0538)UPDATE  T_ITEM_PROC_COST(�N���A)'  ||
                                             ' ROOT_ITEM_CD�F'   || '[ ' || recITEM_PROC_COST.ROOT_ITEM_CD   || ' ]' ||
                                             ' PARENT_ITEM_CD�F' || '[ ' || recITEM_PROC_COST.PARENT_ITEM_CD || ' ]' ||
                                             ' ITEM_CD�F'        || '[ ' || recITEM_PROC_COST.ITEM_CD        || ' ]' ||
                                             ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                             ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                        RAISE  excERR_CURSOR;
                END;  /*[�i�ڕʉ��H��]�X�V(�N���A)*/

/*��������������������������������������������������������������������������������������������������������
' �K�w���Ƃ�ٰ�߁|�P�K�w��ٰ�߁|�i�ڕʉ��H���ٰ�߁|�����̏����i���[�i�ȊO�j
' (OWN��{�O�̊K�w���Ϗグ����UNDER��=TOTAL��)
����������������������������������������������������������������������������������������������������������*/

            ELSE  /*[���[�i]����*/

                /*�Ϗグ��v�Z(��TOTAL �� �eUNDER)*/
                IF  recMAIN.COST_EXCLUDE_FLG = 0 THEN
                    numTotalProcCost01   :=  recITEM_PROC_COST.OWN_PROC_COST_01 + 
                              CEIL(recITEM_PROC_COST.UNDER_PROC_COST_01 * 
                                     recMAIN.NECESSARY_QTY *
                                     recMAIN.ITEM_INPUT_RATIO * 10000) / 10000;
                    numTotalProcCost02   :=  recITEM_PROC_COST.OWN_PROC_COST_02 + 
                              CEIL(recITEM_PROC_COST.UNDER_PROC_COST_02 * 
                                     recMAIN.NECESSARY_QTY *
                                     recMAIN.ITEM_INPUT_RATIO * 10000) / 10000;
                    numTotalProcCost03   :=  recITEM_PROC_COST.OWN_PROC_COST_03 + 
                                CEIL(recITEM_PROC_COST.UNDER_PROC_COST_03 * 
                                     recMAIN.NECESSARY_QTY *
                                     recMAIN.ITEM_INPUT_RATIO * 10000) / 10000;
                    numTotalProcCost04   :=  recITEM_PROC_COST.OWN_PROC_COST_04 + 
                                CEIL(recITEM_PROC_COST.UNDER_PROC_COST_04 * 
                                     recMAIN.NECESSARY_QTY *
                                     recMAIN.ITEM_INPUT_RATIO * 10000) / 10000;
                    numTotalProcCost05   :=  recITEM_PROC_COST.OWN_PROC_COST_05 + 
                                 CEIL(recITEM_PROC_COST.UNDER_PROC_COST_05 * 
                                     recMAIN.NECESSARY_QTY *
                                     recMAIN.ITEM_INPUT_RATIO * 10000) / 10000;
                    numTotalProcCost06   :=  recITEM_PROC_COST.OWN_PROC_COST_06 + 
                                  CEIL(recITEM_PROC_COST.UNDER_PROC_COST_06 * 
                                         recMAIN.NECESSARY_QTY *
                                         recMAIN.ITEM_INPUT_RATIO * 10000) / 10000;
                    numTotalProcCost07   :=  recITEM_PROC_COST.OWN_PROC_COST_07 + 
                                  CEIL(recITEM_PROC_COST.UNDER_PROC_COST_07 * 
                                         recMAIN.NECESSARY_QTY *
                                         recMAIN.ITEM_INPUT_RATIO * 10000) / 10000;
                    numTotalProcCost08   :=  recITEM_PROC_COST.OWN_PROC_COST_08 + 
                                  CEIL(recITEM_PROC_COST.UNDER_PROC_COST_08 * 
                                         recMAIN.NECESSARY_QTY *
                                         recMAIN.ITEM_INPUT_RATIO * 10000) / 10000;
                    numTotalProcCost09   :=  recITEM_PROC_COST.OWN_PROC_COST_09 + 
                                  CEIL(recITEM_PROC_COST.UNDER_PROC_COST_09 * 
                                         recMAIN.NECESSARY_QTY *
                                         recMAIN.ITEM_INPUT_RATIO * 10000) / 10000;
                    numTotalProcCost10   :=  recITEM_PROC_COST.OWN_PROC_COST_10 + 
                                  CEIL(recITEM_PROC_COST.UNDER_PROC_COST_10 * 
                                         recMAIN.NECESSARY_QTY *
                                         recMAIN.ITEM_INPUT_RATIO * 10000) / 10000;
                    numTotalProcCost11   :=  recITEM_PROC_COST.OWN_PROC_COST_11 + 
                                  CEIL(recITEM_PROC_COST.UNDER_PROC_COST_11 * 
                                         recMAIN.NECESSARY_QTY *
                                         recMAIN.ITEM_INPUT_RATIO * 10000) / 10000;
                    numTotalProcCost12   :=  recITEM_PROC_COST.OWN_PROC_COST_12 + 
                                  CEIL(recITEM_PROC_COST.UNDER_PROC_COST_12 * 
                                         recMAIN.NECESSARY_QTY *
                                         recMAIN.ITEM_INPUT_RATIO * 10000) / 10000;
                ELSE
                    numTotalProcCost01  :=  0;
                    numTotalProcCost02  :=  0;
                    numTotalProcCost03  :=  0;
                    numTotalProcCost04  :=  0;
                    numTotalProcCost05  :=  0;
                    numTotalProcCost06  :=  0;
                    numTotalProcCost07  :=  0;
                    numTotalProcCost08  :=  0;
                    numTotalProcCost09  :=  0;
                    numTotalProcCost10  :=  0;
                    numTotalProcCost11  :=  0;
                    numTotalProcCost12  :=  0;
                END IF;
                numTotalProcCostSum  :=  numTotalProcCost01 + 
                                         numTotalProcCost02 +
                                         numTotalProcCost03 +
                                         numTotalProcCost04 +
                                         numTotalProcCost05 +
                                         numTotalProcCost06 +
                                         numTotalProcCost07 +
                                         numTotalProcCost08 +
                                         numTotalProcCost09 +
                                         numTotalProcCost10 +
                                         numTotalProcCost11 +
                                         numTotalProcCost12;

                /*T_ITEM_COST���[�i�p*/
                numPROC_TotalProcCostSum := numPROC_TotalProcCostSum + numTotalProcCostSum;

                BEGIN  /*[�i�ڕʉ��H��]�������X�V(TOTAL��)*/
                    UPDATE  T_ITEM_PROC_COST  SET
                                TOTAL_PROC_COST_01  = numTotalProcCost01
                               ,TOTAL_PROC_COST_02  = numTotalProcCost02
                               ,TOTAL_PROC_COST_03  = numTotalProcCost03
                               ,TOTAL_PROC_COST_04  = numTotalProcCost04
                               ,TOTAL_PROC_COST_05  = numTotalProcCost05
                               ,TOTAL_PROC_COST_06  = numTotalProcCost06
                               ,TOTAL_PROC_COST_07  = numTotalProcCost07
                               ,TOTAL_PROC_COST_08  = numTotalProcCost08
                               ,TOTAL_PROC_COST_09  = numTotalProcCost09
                               ,TOTAL_PROC_COST_10  = numTotalProcCost10
                               ,TOTAL_PROC_COST_11  = numTotalProcCost11
                               ,TOTAL_PROC_COST_12  = numTotalProcCost12
                               ,TOTAL_PROC_COST_SUM = numTotalProcCostSum
                               ,UPDATED_DATE=SYSDATE,UPDATED_BY= pvc2UserId,UPDATED_PRG_NM= MY_SQL_NAME
                               ,MODIFY_COUNT = MODIFY_COUNT+1
                        WHERE   YEAR             = recITEM_PROC_COST.YEAR
                          AND   HALF_TERM_TYP    = recITEM_PROC_COST.HALF_TERM_TYP
                          AND   COST_TYP         = recITEM_PROC_COST.COST_TYP
                          AND   PLANT_CD         = recITEM_PROC_COST.PLANT_CD
                          AND   ROOT_ITEM_CD     = recITEM_PROC_COST.ROOT_ITEM_CD
                          AND   PARENT_ITEM_CD   = recITEM_PROC_COST.PARENT_ITEM_CD
                          AND   ITEM_CD          = recITEM_PROC_COST.ITEM_CD
                          AND   PS_EDITION       = recITEM_PROC_COST.PS_EDITION
                          AND   COST_STATEMENT_NO= recITEM_PROC_COST.COST_STATEMENT_NO
                          AND   PROC_COST_CLS_CD = recITEM_PROC_COST.PROC_COST_CLS_CD
                    ;
                EXCEPTION
                        WHEN OTHERS THEN
                        vc2Comment := SUBSTR('(SBM0540)9:UPDATE T_ITEM_PROC_COST(TOTAL��)'  ||
                                             ' ROOT_ITEM_CD�F'   || '[ ' || recITEM_PROC_COST.ROOT_ITEM_CD   || ' ]' ||
                                             ' PARENT_ITEM_CD�F' || '[ ' || recITEM_PROC_COST.PARENT_ITEM_CD || ' ]' ||
                                             ' ITEM_CD�F'        || '[ ' || recITEM_PROC_COST.ITEM_CD        || ' ]' ||
                                             ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                             ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                        RAISE  excERR_CURSOR;
                END;  /*[�i�ڕʉ��H��]�������X�V(TOTAL��)*/


            END IF;  /*[���[�i]����*/

/*��������������������������������������������������������������������������������������������������������
' �K�w���Ƃ�ٰ�߁|�P�K�w��ٰ�߁|�i�ڕʉ��H���ٰ�߁|�e�̏����i�Ϗ㏈���j
' �i������TOTAL����A�e��UNDER��ɉ��Z�j
����������������������������������������������������������������������������������������������������������*/

            IF  recMAIN.UPPER_ITEM_FLG = 0 THEN  /*[�擪�i]�łȂ����A[�i�ڕʉ��H��]�Ϗ�*/
                BEGIN  /*[�i�ڕʌ���]�e��PKEY��������*/
                    SELECT PARENT_ITEM_CD,PS_EDITION,CS_PROC_CD,COST_STATEMENT_NO,PARENT_COST_STATEMENT_NO
                        INTO  vc2ParentItemCd,numPsEdition,vc2CsProcCd,numCostStatementNo,numParentCostStatementNo
                        FROM T_ITEM_COST
                        WHERE   YEAR             = recMAIN.YEAR
                          AND   HALF_TERM_TYP    = recMAIN.HALF_TERM_TYP
                          AND   COST_TYP         = recMAIN.COST_TYP
                          AND   PLANT_CD         = recMAIN.PLANT_CD
                          AND   ROOT_ITEM_CD     = recMAIN.ROOT_ITEM_CD
                          AND   ITEM_CD          = recMAIN.PARENT_ITEM_CD
                          AND   COST_STATEMENT_NO= recMAIN.PARENT_COST_STATEMENT_NO
                          AND   ROWNUM           = 1
                    ;
                EXCEPTION
                    WHEN OTHERS THEN
                        vc2Comment := SUBSTR('10:SELECT T_ITEM_COST'  ||
                                             ' ROOT_ITEM_CD�F' || '[ ' || recMAIN.ROOT_ITEM_CD   || ' ]' ||
                                             ' ITEM_CD�F'      || '[ ' || recMAIN.PARENT_ITEM_CD || ' ]' ||
                                             ' COST_STATEMENT_NO='|| '[ ' || recMAIN.PARENT_COST_STATEMENT_NO || ' ]' ||
                                             ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                             ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
--  ���O�i���v�Z�ΏۂƂ���ׁA�e�̂Ȃ��q��ABORT���Ȃ�
                        vc2ParentItemCd    := NULL;
                        numPsEdition       := 0;
                        numCostStatementNo := 0;
--                      RAISE  excERR_CURSOR;
                END;  /*[�i�ڕʌ���]�e��PKEY��������*/

                IF  vc2ParentItemCd IS NOT NULL THEN  /* �e��PKEY��񂪂���Ƃ� */
                /*[�i�ڕʉ��H��]�e������*/
                SELECT COUNT(*) INTO  numCountDummy 
                  FROM T_ITEM_PROC_COST
                      WHERE   YEAR             = recMAIN.YEAR
                        AND   HALF_TERM_TYP    = recMAIN.HALF_TERM_TYP
                        AND   COST_TYP         = recMAIN.COST_TYP
                        AND   PLANT_CD         = recMAIN.PLANT_CD
                        AND   ROOT_ITEM_CD     = recMAIN.ROOT_ITEM_CD
                        AND   PARENT_ITEM_CD   = vc2ParentItemCd
                        AND   ITEM_CD          = recMAIN.PARENT_ITEM_CD
                        AND   PS_EDITION       = numPsEdition
                        AND   COST_STATEMENT_NO= numCostStatementNo
                        AND   PROC_COST_CLS_CD = recITEM_PROC_COST.PROC_COST_CLS_CD
                ;
                IF  numCountDummy = 0 THEN  /* [�i�ڕʉ��H��]INSERT/UPFATE���� */
                    BEGIN  /*[�i�ڕʉ��H��]�e���쐬(UNDER��)*/
                        INSERT  INTO  T_ITEM_PROC_COST(
                                         YEAR,HALF_TERM_TYP,COST_TYP,PLANT_CD,ROOT_ITEM_CD
                                        ,PARENT_ITEM_CD,ITEM_CD,PS_EDITION,COST_STATEMENT_NO
                                        ,CS_PROC_CD,PROC_COST_CLS_CD
                                        ,OWN_PROC_COST_01,OWN_PROC_COST_02,OWN_PROC_COST_03,OWN_PROC_COST_04
                                        ,OWN_PROC_COST_05,OWN_PROC_COST_06,OWN_PROC_COST_07,OWN_PROC_COST_08
                                        ,OWN_PROC_COST_09,OWN_PROC_COST_10,OWN_PROC_COST_11,OWN_PROC_COST_12
                                        ,OWN_PROC_COST_SUM
                                        ,UNDER_PROC_COST_01,UNDER_PROC_COST_02,UNDER_PROC_COST_03,UNDER_PROC_COST_04
                                        ,UNDER_PROC_COST_05,UNDER_PROC_COST_06,UNDER_PROC_COST_07,UNDER_PROC_COST_08
                                        ,UNDER_PROC_COST_09,UNDER_PROC_COST_10,UNDER_PROC_COST_11,UNDER_PROC_COST_12
                                        ,UNDER_PROC_COST_SUM
                                        ,TOTAL_PROC_COST_01,TOTAL_PROC_COST_02,TOTAL_PROC_COST_03,TOTAL_PROC_COST_04
                                        ,TOTAL_PROC_COST_05,TOTAL_PROC_COST_06,TOTAL_PROC_COST_07,TOTAL_PROC_COST_08
                                        ,TOTAL_PROC_COST_09,TOTAL_PROC_COST_10,TOTAL_PROC_COST_11,TOTAL_PROC_COST_12
                                        ,TOTAL_PROC_COST_SUM
                                        ,PARENT_COST_STATEMENT_NO
                                        ,CREATED_DATE,CREATED_BY,CREATED_PRG_NM
                                        ,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM
                                        ,MODIFY_COUNT
                              )  VALUES (
                                         recMAIN.YEAR
                                        ,recMAIN.HALF_TERM_TYP
                                        ,recMAIN.COST_TYP
                                        ,recMAIN.PLANT_CD
                                        ,recMAIN.ROOT_ITEM_CD
                                        ,vc2ParentItemCd
                                        ,recMAIN.PARENT_ITEM_CD
                                        ,numPsEdition,numCostStatementNo
                                        ,vc2CsProcCd
                                        ,recITEM_PROC_COST.PROC_COST_CLS_CD
                                        ,0,0,0,0,0,0,0,0,0,0,0,0,0
                                        ,numTotalProcCost01,numTotalProcCost02,numTotalProcCost03
                                        ,numTotalProcCost04,numTotalProcCost05,numTotalProcCost06
                                        ,numTotalProcCost07,numTotalProcCost08,numTotalProcCost09
                                        ,numTotalProcCost10,numTotalProcCost11,numTotalProcCost12
                                        ,numTotalProcCostSum
                                        ,0,0,0,0,0,0,0,0,0,0,0,0,0
                                        ,numParentCostStatementNo
                                        ,SYSDATE,pvc2UserId,MY_SQL_NAME,SYSDATE,pvc2UserId,MY_SQL_NAME
                                        ,0
                        );
                    EXCEPTION
                        WHEN OTHERS THEN
                            vc2Comment := SUBSTR('(SBM0541)11:INSERT T_ITEM_COST(UNDER��)'  ||
                                                 ' ROOT_ITEM_CD='   || '[ ' || recMAIN.ROOT_ITEM_CD   || ' ]' ||
                                                 ' PARENT_ITEM_CD=' || '[ ' || vc2ParentItemCd        || ' ]' ||
                                                 ' ITEM_CD='        || '[ ' || recMAIN.PARENT_ITEM_CD || ' ]' ||
                                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                            RAISE  excERR_CURSOR;
                    END;  /*[�i�ڕʉ��H��]�e���쐬(UNDER��)*/

                ELSE  /* [�i�ڕʉ��H��]INSERT/UPFATE���� */

                    BEGIN  /*[�i�ڕʉ��H��]�e���X�V(UNDER��)*/
                       UPDATE  T_ITEM_PROC_COST  SET
                                UNDER_PROC_COST_01  = UNDER_PROC_COST_01  + numTotalProcCost01
                               ,UNDER_PROC_COST_02  = UNDER_PROC_COST_02  + numTotalProcCost02
                               ,UNDER_PROC_COST_03  = UNDER_PROC_COST_03  + numTotalProcCost03
                               ,UNDER_PROC_COST_04  = UNDER_PROC_COST_04  + numTotalProcCost04
                               ,UNDER_PROC_COST_05  = UNDER_PROC_COST_05  + numTotalProcCost05
                               ,UNDER_PROC_COST_06  = UNDER_PROC_COST_06  + numTotalProcCost06
                               ,UNDER_PROC_COST_07  = UNDER_PROC_COST_07  + numTotalProcCost07
                               ,UNDER_PROC_COST_08  = UNDER_PROC_COST_08  + numTotalProcCost08
                               ,UNDER_PROC_COST_09  = UNDER_PROC_COST_09  + numTotalProcCost09
                               ,UNDER_PROC_COST_10  = UNDER_PROC_COST_10  + numTotalProcCost10
                               ,UNDER_PROC_COST_11  = UNDER_PROC_COST_11  + numTotalProcCost11
                               ,UNDER_PROC_COST_12  = UNDER_PROC_COST_12  + numTotalProcCost12
                               ,UNDER_PROC_COST_SUM = UNDER_PROC_COST_SUM + numTotalProcCostSum
                               ,UPDATED_DATE=SYSDATE,UPDATED_BY= pvc2UserId,UPDATED_PRG_NM= MY_SQL_NAME
                               ,MODIFY_COUNT = MODIFY_COUNT+1
                         WHERE   YEAR             = recMAIN.YEAR
                              AND   HALF_TERM_TYP    = recMAIN.HALF_TERM_TYP
                              AND   COST_TYP         = recMAIN.COST_TYP
                              AND   PLANT_CD         = recMAIN.PLANT_CD
                              AND   ROOT_ITEM_CD     = recMAIN.ROOT_ITEM_CD
                              AND   PARENT_ITEM_CD   = vc2ParentItemCd
                              AND   ITEM_CD          = recMAIN.PARENT_ITEM_CD
                              AND   PS_EDITION       = numPsEdition
                              AND   COST_STATEMENT_NO= numCostStatementNo
                              AND   PROC_COST_CLS_CD = recITEM_PROC_COST.PROC_COST_CLS_CD
                         ;
                    EXCEPTION
                        WHEN OTHERS THEN
                            vc2Comment := SUBSTR('(SBM0542)12:UPDATE T_ITEM_PROC_COST(UNDER��)'  ||
                                                 ' ROOT_ITEM_CD�F'   || '[ ' || recMAIN.ROOT_ITEM_CD   || ' ]' ||
                                                 ' PARENT_ITEM_CD�F' || '[ ' || vc2ParentItemCd        || ' ]' ||
                                                 ' ITEM_CD�F'        || '[ ' || recMAIN.PARENT_ITEM_CD || ' ]' ||
                                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                            RAISE  excERR_CURSOR;
                    END;  /*[�i�ڕʉ��H��]�e���X�V(UNDER��)*/

                END IF;  /* [�i�ڕʉ��H��]INSERT/UPFATE���� */

                numCntUp1  :=  numCntUp1 +1;  /*  �Ϗ㌏��(T_ITEM_PROC_COST) */

                END IF;  /* �e��PKEY��񂪂���Ƃ� */

            END IF;  /*[�擪�i]�łȂ����A[�i�ڕʉ��H��]�Ϗ�*/

        END LOOP;  /*  �i�ڕʉ��H��̌J��Ԃ� */

        CLOSE curITEM_PROC_COST;  /* �J�[�\��CLOSE(�i�ڕʉ��H��) */

/*��������������������������������������������������������������������������������������������������������
' �K�w���Ƃ�ٰ�߁|�P�K�w��ٰ�߁|�����̏����i���[�i�j
' (UNDER��=0,TOTAL��=OWN��)
����������������������������������������������������������������������������������������������������������*/

        IF  recMAIN.LOWER_ITEM_FLG = 1 THEN  /*[���[�i]����*/

            /*�Ϗグ��v�Z*/
            IF  recMAIN.COST_EXCLUDE_FLG = 0 THEN
                numToatlMatrCost      :=  recMAIN.OWN_MATR_COST;
                numToatlSbcntMatrCost :=  recMAIN.OWN_SBCNT_MATR_COST;
                numToatlProcCostSum   :=  numPROC_TotalProcCostSum;
            ELSE
                numToatlMatrCost      :=  0;
                numToatlSbcntMatrCost :=  0;
                numToatlProcCostSum   :=  0;
            END IF; 

            BEGIN  /*[�i�ڕʌ���]�X�V(�N���A)*/
                UPDATE  T_ITEM_COST  SET
                        UNDER_MATR_COST         = 0
                       ,TOTAL_MATR_COST         = numToatlMatrCost
                       ,UNDER_SBCNT_MATR_COST   = 0
                       ,TOTAL_SBCNT_MATR_COST   = numToatlSbcntMatrCost
                       ,UNDER_PROC_COST_SUM_ALL = 0
                       ,TOTAL_PROC_COST_SUM_ALL = numToatlProcCostSum
                       ,UPDATED_DATE=SYSDATE,UPDATED_BY= pvc2UserId,UPDATED_PRG_NM= MY_SQL_NAME
                       ,MODIFY_COUNT = MODIFY_COUNT+1
                WHERE   YEAR             = recMAIN.YEAR
                  AND   HALF_TERM_TYP    = recMAIN.HALF_TERM_TYP
                  AND   COST_TYP         = recMAIN.COST_TYP
                  AND   PLANT_CD         = recMAIN.PLANT_CD
                  AND   ROOT_ITEM_CD     = recMAIN.ROOT_ITEM_CD
                  AND   PARENT_ITEM_CD   = recMAIN.PARENT_ITEM_CD
                  AND   ITEM_CD          = recMAIN.ITEM_CD
                  AND   PS_EDITION       = recMAIN.PS_EDITION
                  AND   COST_STATEMENT_NO= recMAIN.COST_STATEMENT_NO
                ;

            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment  := SUBSTR('(SBM0543)13:UPDATE T_ITEM_COST(�N���A)'  ||
                                          ' ROOT_ITEM_CD�F'   || '[ ' || recMAIN.ROOT_ITEM_CD   || ' ]' ||
                                          ' PARENT_ITEM_CD�F' || '[ ' || recMAIN.PARENT_ITEM_CD        || ' ]' ||
                                          ' ITEM_CD�F'        || '[ ' || recMAIN.ITEM_CD || ' ]' ||
                                          ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                          ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE  excERR_CURSOR;
            END;  /*[�i�ڕʌ���]�X�V(�N���A)*/

/*��������������������������������������������������������������������������������������������������������
' �K�w���Ƃ�ٰ�߁|�P�K�w��ٰ�߁|�����̏����i���[�i�ȊO�j
' (OWN��{�O�̊K�w���Ϗグ����UNDER��=TOTAL��)
����������������������������������������������������������������������������������������������������������*/

         ELSE  /*[���[�i]����*/

            /*�Ϗグ��v�Z*/
            IF  recMAIN.COST_EXCLUDE_FLG = 0 THEN
                numToatlMatrCost      :=  recMAIN.OWN_MATR_COST + 
                                     CEIL(recMAIN.UNDER_MATR_COST * 
                                      recMAIN.NECESSARY_QTY *
                                      recMAIN.ITEM_INPUT_RATIO * 10000) / 10000;
                numToatlSbcntMatrCost :=  recMAIN.OWN_SBCNT_MATR_COST + 
                                     CEIL(recMAIN.UNDER_SBCNT_MATR_COST * 
                                      recMAIN.NECESSARY_QTY *
                                      recMAIN.ITEM_INPUT_RATIO * 10000) / 10000;
/* T_ITEM_COST.TOTAL_PROC_COST_SUM�̓�(T_ITEM_PROC_COST.TOTAL_PROC_COST_SUM)�ɂ��� */
--              numToatlProcCostSum   :=  recMAIN.OWN_PROC_COST_SUM  + 
--                                 CEIL(recMAIN.UNDER_PROC_COST_SUM * 
--                                        recMAIN.NECESSARY_QTY *
--                                        recMAIN.ITEM_INPUT_RATIO * 10000) / 10000;
                numToatlProcCostSum   :=  numPROC_TotalProcCostSum;
            ELSE
                numToatlMatrCost      :=  0;
                numToatlSbcntMatrCost :=  0;
                numToatlProcCostSum   :=  0;
            END IF; 

            BEGIN  /*[�i�ڕʌ���]�X�V(TOTAL��X�V)*/
                UPDATE  T_ITEM_COST  SET
                        TOTAL_MATR_COST         = numToatlMatrCost
                       ,TOTAL_SBCNT_MATR_COST   = numToatlSbcntMatrCost
                       ,TOTAL_PROC_COST_SUM_ALL = numToatlProcCostSum
                       ,UPDATED_DATE=SYSDATE,UPDATED_BY= pvc2UserId,UPDATED_PRG_NM= MY_SQL_NAME
                       ,MODIFY_COUNT = MODIFY_COUNT+1
                WHERE   YEAR             = recMAIN.YEAR
                  AND   HALF_TERM_TYP    = recMAIN.HALF_TERM_TYP
                  AND   COST_TYP         = recMAIN.COST_TYP
                  AND   PLANT_CD         = recMAIN.PLANT_CD
                  AND   ROOT_ITEM_CD     = recMAIN.ROOT_ITEM_CD
                  AND   PARENT_ITEM_CD   = recMAIN.PARENT_ITEM_CD
                  AND   ITEM_CD          = recMAIN.ITEM_CD
                  AND   PS_EDITION       = recMAIN.PS_EDITION
                  AND   COST_STATEMENT_NO= recMAIN.COST_STATEMENT_NO
                ;

            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment := SUBSTR('(SBM0544)14:UPDATE T_ITEM_COST(TOTAL��)'  ||
                                         ' ROOT_ITEM_CD�F'   || '[ ' || recMAIN.ROOT_ITEM_CD   || ' ]' ||
                                         ' PARENT_ITEM_CD�F' || '[ ' || recMAIN.PARENT_ITEM_CD        || ' ]' ||
                                         ' ITEM_CD�F'        || '[ ' || recMAIN.ITEM_CD || ' ]' ||
                                         ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                         ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE  excERR_CURSOR;
            END;  /*[�i�ڕʌ���]�X�V(TOTAL��X�V)*/
        END IF;  /*[���[�i]����*/

/*��������������������������������������������������������������������������������������������������������
' �K�w���Ƃ�ٰ�߁|�P�K�w��ٰ�߁|�e�̏����i�Ϗ㏈���j
' �i������TOTAL����A�e��UNDER��ɉ��Z�j
����������������������������������������������������������������������������������������������������������*/

        IF  recMAIN.UPPER_ITEM_FLG = 0 THEN  /*[�擪�i]�łȂ����A[�i�ڕʌ���]�Ϗ�*/

/* (�������@)�e��PKEY���͎g�p�����A�q��PARENT_COST_STATEMENT_NO�Œ���UPDATE (��������)
            BEGIN  /*[�i�ڕʌ���]�e��PKEY��������
                SELECT PARENT_ITEM_CD,PS_EDITION,CS_PROC_CD,COST_STATEMENT_NO
                 INTO  vc2ParentItemCd,numPsEdition,vc2CsProcCd,numCostStatementNo
                  FROM T_ITEM_COST
                  WHERE   YEAR             = recMAIN.YEAR
                    AND   HALF_TERM_TYP    = recMAIN.HALF_TERM_TYP
                    AND   COST_TYP         = recMAIN.COST_TYP
                    AND   PLANT_CD         = recMAIN.PLANT_CD
                    AND   ROOT_ITEM_CD     = recMAIN.ROOT_ITEM_CD
                    AND   ITEM_CD          = recMAIN.PARENT_ITEM_CD
                    AND   COST_STATEMENT_NO= recMAIN.PARENT_COST_STATEMENT_NO
                    AND   ROWNUM= 1
                ;
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment := SUBSTR('15:SELECT T_ITEM_COST'  ||
                                         ' ROOT_ITEM_CD�F' || '[ ' || recMAIN.ROOT_ITEM_CD   || ' ]' ||
                                         ' ITEM_CD�F'      || '[ ' || recMAIN.PARENT_ITEM_CD || ' ]' ||
                                         ' COST_STATEMENT_NO='|| '[ ' || recMAIN.PARENT_COST_STATEMENT_NO || ' ]' ||
                                         ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                         ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                   vc2ParentItemCd    := NULL;
                    numPsEdition       := 0;
                    numCostStatementNo := 0;
--                  RAISE  excERR_CURSOR;
            END;  /*[�i�ڕʌ���]�e��PKEY��������

            IF  vc2ParentItemCd IS NOT NULL THEN  /* �e��PKEY��񂪂���Ƃ� 

�@(�������@)�e��PKEY���͎g�p�����A�q��PARENT_COST_STATEMENT_NO�Œ���UPDATE (��������) */

            IF  recMAIN.PARENT_COST_STATEMENT_NO <> 0 THEN  /* �q��PARENT_COST_STATEMENT_NO������Ƃ� */

            BEGIN  /*[�i�ڕʌ���]�e���X�V(UNDER��)*/
                UPDATE  T_ITEM_COST  SET
                    UNDER_MATR_COST         = UNDER_MATR_COST         + numToatlMatrCost
                   ,UNDER_SBCNT_MATR_COST   = UNDER_SBCNT_MATR_COST   + numToatlSbcntMatrCost
                   ,UNDER_PROC_COST_SUM_ALL = UNDER_PROC_COST_SUM_ALL + numToatlProcCostSum
                WHERE   YEAR             = recMAIN.YEAR
                  AND   HALF_TERM_TYP    = recMAIN.HALF_TERM_TYP
                  AND   COST_TYP         = recMAIN.COST_TYP
                  AND   PLANT_CD         = recMAIN.PLANT_CD
                  AND   ROOT_ITEM_CD     = recMAIN.ROOT_ITEM_CD
--(�������@)      AND   PARENT_ITEM_CD   = vc2ParentItemCd     /* �e��PKEY��� */
--(�������@)      AND   ITEM_CD          = recMAIN.PARENT_ITEM_CD
--(�������@)      AND   PS_EDITION       = numPsEdition        /* �e��PKEY��� */
--(�������@)      AND   COST_STATEMENT_NO= numCostStatementNo  /* �e��PKEY��� */
                  AND   COST_STATEMENT_NO= recMAIN.PARENT_COST_STATEMENT_NO  /* �q��PARENT_COST_STATEMENT_NO */
                ;
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment := SUBSTR('(SBM0545)16:UPDATE T_ITEM_COST(UNDER��)'  ||
                                         ' ROOT_ITEM_CD�F'   || '[ ' || recMAIN.ROOT_ITEM_CD   || ' ]' ||
                                         ' PARENT_ITEM_CD�F' || '[ ' || vc2ParentItemCd        || ' ]' ||
                                         ' ITEM_CD�F'        || '[ ' || recMAIN.PARENT_ITEM_CD || ' ]' ||
                                         ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                         ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE  excERR_CURSOR;
            END;  /*[�i�ڕʌ���]�e���X�V(UNDER��)*/

            numCntUp2  :=  numCntUp1 +2;  /*  �Ϗ㌏��(T_ITEM_COST) */

            END IF;  /* �e��PKEY��񂪂���Ƃ� */

        END IF;  /*[�擪�i]�łȂ����A[�i�ڕʌ���]�Ϗ�*/

    END LOOP;  /*  �i�ڕʌ����̌J��Ԃ� (MAIN LOOP)*/

    COMMIT;

    CLOSE curMAIN;  /* �J�[�\��CLOSE(�i�ڕʌ���) */

    /*�Y�����x���łO���̏ꍇ�A�J��Ԃ��𔲂���B*/
    IF  numCountLoop = 0 THEN
        EXIT;
    END IF;

    END LOOP;  /* �K�w���x�����Ƃ̃��[�v */

/* �����̏I�� */

    /* �I�����b�Z�[�W�̏o�� */
    vc2Comment := SUBSTR('(SBM0533)���͌���(�i�ڕʌ���)�F'   || '[ ' || numCntMain || ' ]' ||
                         '�Ϗ㌏��(�i�ڕʉ��H��)�F' || '[ ' || numCntUp1 || ' ]' ||
                         '�Ϗ㌏��(�i�ڕʌ���)�F'   || '[ ' || numCntUp2 || ' ]',1,256);
    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                        pvc2UserId, pvc2BusinessName,
                        pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_END,
                        vc2Comment);

    COMMIT;

    /* �g���[�X���O�̏o��(�I��) */
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId,pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, METHOD_END);

    COMMIT;

    /* LogFile �� CLOSE */
    blnRet := FNCLOGCLOSE(UTL_FileHandle);

    pnumReturn := STATUS_NORMAL; /* ����I�� */

--< ��O���� >---------------------------------------------------------------
EXCEPTION
    WHEN excERR_SKIP THEN    /* ���s�s�� */

        ROLLBACK;

     /* �I�����b�Z�[�W�̏o�� */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_EXP,
                            vc2Comment);

        /* �g���[�X���O�̏o��(�I��) */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId,pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, METHOD_END);

        COMMIT;

        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

        pnumReturn := STATUS_ERROR; /* �ُ�I�� */

    WHEN excERR_CURSOR THEN    /* �J�[�\��OPEN���̂c�a�G���[ */

        IF curMAIN%ISOPEN = TRUE THEN
            CLOSE curMAIN;
        END IF;
        IF curITEM_PROC_COST%ISOPEN = TRUE THEN
            CLOSE curITEM_PROC_COST;
        END IF;

        ROLLBACK;

     /* �I�����b�Z�[�W�̏o�� */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_EXP,
                            vc2Comment);

        /* �g���[�X���O�̏o��(�I��) */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId,pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, METHOD_END);

        COMMIT;

        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

        pnumReturn := STATUS_ERROR; /* �ُ�I�� */

    WHEN OTHERS  THEN   /* ���̑��̃G���[ */

        IF curMAIN%ISOPEN = TRUE THEN
            CLOSE curMAIN;
        END IF;
        IF curITEM_PROC_COST%ISOPEN = TRUE THEN
            CLOSE curITEM_PROC_COST;
        END IF;

        ROLLBACK;

        /* �I�����b�Z�[�W�̏o�� */
        vc2Comment  := SUBSTR('(SBM0328) �������̑��̃G���[���������܂�������'  ||
                              ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                              ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_EXP,
                            vc2Comment);

        /* �g���[�X���O�̏o��(�I��) */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId,pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, METHOD_END);

        COMMIT;

        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

        pnumReturn := STATUS_ERROR; /* �ُ�I�� */
END;
/
