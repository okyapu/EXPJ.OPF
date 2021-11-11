CREATE OR REPLACE procedure      SQLSTDMATRPROCCHECK(
/*------------------------------------------------------------------------------
'
'$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/DBProj/Procedure/SqlStdMatrProcCheck.sql,v $
'$Author: shan-xiuqin $
'$Revision: 1.8 $ $Date: 2017/01/09 08:30:13 $
'                        2005.10.24 unicode�Ή��ivarchar2��4�{�j
'
'
' �@�\      : �W���ޗ���E���H��}�X�^�`�F�b�N����(CHECK�̂�)
'
' �߂�l    :
'
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
'
' �@�\����  : �W�������v�Z�p��[�\���i���[�N]�A[�w���i�}�X�^]�A[���H��}�X�^]�A[�i�ڕʉ��H��}�X�^]������
'             [�i�ڕʌ���]�̍ޗ���Ɖ��H���CHECK���s���B
'
'
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

    METHOD_START            VARCHAR2(20) := 'START';    --���O�p���\�b�h�J�n�錾
    METHOD_END              VARCHAR2(12) := 'End';      --���O�p���\�b�h�I���錾
    MY_SQL_NAME             VARCHAR2(120) := 'SQLSTDMATRPROCCHECK'; --�o�k�^�r�p�k��

    APS_COM_BATCH_START     VARCHAR2(28) := 'DC02201';
    APS_COM_BATCH_END       VARCHAR2(28) := 'DC02202';
    APS_COM_BATCH_EXP       VARCHAR2(28) := 'DC02203';
    APS_COM_BATCH_EXP2      VARCHAR2(28) := 'DC00209';

    LOGMSG_START_PGNM       VARCHAR2(200) := '(SBM0549)�W���ޗ���E���H��`�F�b�N�������J�n���܂����B';
    LOGMSG_END_PGNM         VARCHAR2(200) := '�W���ޗ���E���H��`�F�b�N�������I�����܂����B';
    LOGMSG_EXP_PGNM         VARCHAR2(200) := '�W���ޗ���E���H��`�F�b�N�������ُ�I�����܂����B';
    LOGMSG_EXP_PGNM2        VARCHAR2(200) := '���i�\���L���I�������Ɩ��^�p�����߂��Ă��܂��B';

    STATUS_NORMAL           NUMBER       := 1;  -- ����I��
    STATUS_WARNING          NUMBER       := 2;  -- �x���I��
    STATUS_ERROR            NUMBER       := 3;  -- �ُ�I��

    OUTSIDE_PROC_CD         VARCHAR2(4)  := NULL;

    /* �ϐ��̒�` */
    UTL_FileHandle          UTL_FILE.FILE_TYPE;    --�t�@�C���n���h��

    numCntUpper             NUMBER(11)   := 0;     /* �Ώۃf�[�^����(�擪�i) */
    numCntLower             NUMBER(11)   := 0;     /* �Ώۃf�[�^����(���ʓW�J) */
    numCntItemProcCost      NUMBER(11)   := 0;     --����f�[�^����(�i�ڕʉ��H��)
    numCountError           NUMBER(11)   := 0;     --�����v�Z�G���[����
    numCountDummy           NUMBER(11)   := 0;     --�����`�F�b�N�p
    blnRet                  BOOLEAN;               --���ʊ֐��̖ߒl
    vc2Comment              VARCHAR2(1024);         --���b�Z�[�W�쐬�p

    vc2PhaseStartMonth      VARCHAR2(24);           --�w�蔼���̊���
    vc2PhaseEndMonth        VARCHAR2(24);           --�w�蔼���̊�����

    vc2YYYYMMDD1            VARCHAR2(32);
    vc2YYYYMMDD2            VARCHAR2(32);

    vc2CsCalcErrorCd        T_CS_CALC_ERROR.CS_CALC_ERROR_CD%TYPE;  --�����v�Z�G���[�ԍ�
    datBusinessOprDate      SYS_DATE_CTRL.BUSINESS_OPR_DATE%TYPE;    --�Ɩ��^�p��
    vc2MsgCD                SYS_BUSINESS_MESSAGE.MSG_CD%TYPE; --���b�Z�[�W�R�[�h

    blnFoundCsPuch          BOOLEAN;  --�f�[�^�L������(M_CS_PUCH)
    blnLowerSkip            BOOLEAN;  --���ʓW�J���Ȃ�

    /* �����Ǘ��p�����[�^����̎擾���� */
    numStartMonth           SYS_COST_CTRL.START_MONTH%TYPE;       --�N�x�J�n��

    /* �w���i�}�X�^����̎擾���� */
    numUnitCostAcceptTyp    M_CS_PUCH.UNIT_COST_ACCEPT_TYP%TYPE;  --�P���̗p�敪
    numUnitCost             M_CS_PUCH.UNIT_COST%TYPE;             --�w���P��
    numUnitQty              M_CS_PUCH.PUCH_UNIT_QTY%TYPE;              --�w���i�P�ʐ�
    numExchRate             M_CS_PUCH.EXCH_RATE%TYPE;             --����בփ��[�g
    numSubUnitCost          M_CS_PUCH.SUB_UNIT_COST%TYPE;         --���w���P��
    numSubUnitQty           M_CS_PUCH.SUB_PUCH_UNIT_QTY%TYPE;          --���w���i�P�ʐ�
    numSubExchRate          M_CS_PUCH.SUB_EXCH_RATE%TYPE;         --������בփ��[�g
    vc2ClasificationCd      M_CS_PUCH.CLASIFICATION_CD%TYPE;      --�i�ڊǗ��R�[�h
    numOnerousConsFlg       M_CS_PUCH.ONEROUS_CONS_FLG%TYPE;      --�L���x���i�t���O

    /* ��O�����p�ϐ� */
    excERR_SKIP           EXCEPTION;      --���s�s��
    excERR_CURSOR         EXCEPTION;      --�J�[�\��OPEN����EXCEPTION

    /* �J�[�\���̐錾 �擪�i*/
    CURSOR curUPPER
    IS
    SELECT T.*
          ,M1.STOCK_UNIT AS PARENT_ITEM_STOCK_UNIT
          ,M2.STOCK_UNIT AS STOCK_UNIT
      FROM T_CS_PS_T T
          ,M_ITEM M1,M_ITEM M2
      WHERE   PLANT_CD         = pvc2PlantCd
        AND   T.UPPER_ITEM_FLG = 1
        AND   T.PARENT_ITEM_CD = M1.ITEM_CD(+)
        AND   T.COMP_ITEM_CD   = M2.ITEM_CD(+)
--      AND   T.COMP_ITEM_CD   = 'P0-E5800-M180RA'  --DEGUG�p UMINO 
    ;
    recUPPER curUPPER%ROWTYPE;

    /* �J�[�\���̐錾 ���ʓW�J(1�擪�i�̉��ʕi�ڑS�����K�w���x���̍~���ɓW�J)*/
    CURSOR curLOWER(
         cvc2StartItem VARCHAR2
    )
    IS
    SELECT T.*
          ,M1.STOCK_UNIT AS PARENT_ITEM_STOCK_UNIT
          ,M2.STOCK_UNIT AS STOCK_UNIT
    FROM 
      (SELECT IN1.*
       FROM  (SELECT * FROM T_CS_PS_T WHERE PLANT_CD=pvc2PlantCd) IN1
       START WITH IN1.PARENT_ITEM_CD = cvc2StartItem
       CONNECT BY PRIOR  IN1.COMP_ITEM_CD  = IN1.PARENT_ITEM_CD
      ) T
     ,M_ITEM M1,M_ITEM M2
    WHERE   T.PARENT_ITEM_CD = M1.ITEM_CD(+)
      AND   T.COMP_ITEM_CD = M2.ITEM_CD(+)
    ORDER BY T.UP_LEVEL_NO DESC
    ;
    recLOWER curLOWER%ROWTYPE;

    /* �J�[�\���̐錾  �i�ڕʉ��H��}�X�^*/
    CURSOR curPROC_COST(
         cvc2CompItemCd VARCHAR2
    )
    IS
    SELECT T1.ITEM_CD,T1.PROC_COST_CLS_CD,T1.CS_PROC_CD,T1.CLASIFICATION_CD,T1.ONEROUS_CONS_FLG
          ,T2.PROC_COST_UNIT_QTY,T2.STOCK_UNIT
          ,T2.PROC_COST_01,T2.PROC_COST_02,T2.PROC_COST_03,T2.PROC_COST_04,T2.PROC_COST_05,T2.PROC_COST_06
          ,T2.PROC_COST_07,T2.PROC_COST_08,T2.PROC_COST_09,T2.PROC_COST_10,T2.PROC_COST_11,T2.PROC_COST_12
          ,T2.PROC_COST_SUM
          ,T2.DEL_FLG,T2.PLANT_CD
          ,M.OUTSIDE_TYP
    FROM   M_ITEM_PROC_COST T1
          ,M_PROC_COST      T2
          ,M_CS_PROC        M
    WHERE   T1.PLANT_CD = pvc2PlantCd
      AND   T1.ITEM_CD  = cvc2CompItemCd
      AND   pnumYear             = T2.YEAR(+)
      AND   pnumHalfTermTyp      = T2.HALF_TERM_TYP(+)
      AND   pnumCostTyp          = T2.COST_TYP(+)
      AND   T1.PLANT_CD          = T2.PLANT_CD(+)
      AND   T1.CS_PROC_CD        = T2.CS_PROC_CD(+)
      AND   T1.PROC_COST_CLS_CD  = T2.PROC_COST_CLS_CD(+)
      AND   T1.PLANT_CD   = M.PLANT_CD
      AND   T1.CS_PROC_CD = M.CS_PROC_CD
      AND   0             = M.DEL_FLG
    ;
    recPROC_COST curPROC_COST%ROWTYPE;

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
    numCntUpper         := 0;     /* �Ώۃf�[�^����(�擪�i)       */
    numCntLower         := 0;     /* �Ώۃf�[�^����(���ʓW�J)     */
    numCntItemProcCost  := 0;     /* ����f�[�^����(�i�ڕʉ��H��) */
    numCountError       := 0;     /* �����v�Z�G���[����   */

    /*  �����Ǘ��p�����[�^�̓Ǎ� */ 
    BEGIN
        SELECT  START_MONTH  
          INTO  numStartMonth
          FROM  SYS_COST_CTRL
          WHERE  PLANT_CD  =  pvc2PlantCd;
    EXCEPTION
        WHEN OTHERS THEN
            vc2Comment := SUBSTR('(SBM0535)1:�����Ǘ��p�����[�^�����݂��܂���B'  ||
                                 ' USER_CD='  || '[ ' || pvc2UserId  || ' ]' ||
                                 ' PLANT_CD=' || '[ ' || pvc2PlantCd || ' ]',1,256);
            vc2MsgCD   := 'DC02203';
            RAISE  excERR_SKIP;
    END;

    BEGIN  /* �Ɩ��^�p���̓Ǎ� */ 
        SELECT BUSINESS_OPR_DATE INTO datBusinessOprDate
           FROM SYS_DATE_CTRL
           WHERE PLANT_CD  =  pvc2PlantCd
        ;
    EXCEPTION
        WHEN OTHERS THEN
            vc2Comment := SUBSTR('(SBM0552)1:�Ɩ��^�p���̎擾�Ɏ��s���܂����B'  ||
                                 ' USER_CD='  || '[ ' || pvc2UserId  || ' ]' ||
                                 ' PLANT_CD=' || '[ ' || pvc2PlantCd || ' ]',1,256);
            vc2MsgCD   := 'DC00008';
            RAISE  excERR_SKIP;
    END;  /* �Ɩ��^�p���̓Ǎ� */ 

    /*  �p�����[�^�̃`�F�b�N (�Ώ۔N�x)*/
    IF  pnumYear  IS  NULL  THEN
        vc2Comment := SUBSTR('(SBM0536)2:�p�����[�^�s���B'  ||
                             ' �Ώ۔N�x=' || '[ ' || pnumYear || ' ]',1,256);
        vc2MsgCD   := 'DC02203';
        RAISE  excERR_SKIP;  
    END IF;
    /*  �p�����[�^�̃`�F�b�N (�����敪)*/
    IF  pnumHalfTermTyp  NOT IN (1,2)  THEN
        vc2Comment := SUBSTR('(SBM0218)3:�p�����[�^�s���B'  ||
                             ' �����敪=' || '[ ' || pnumHalfTermTyp || ' ]',1,256);
        vc2MsgCD   := 'DC02203';
        RAISE  excERR_SKIP;  
    END IF;

    /*  �Ώ۔N�x/�����敪/�N�x�J�n�����A�w�蔼���̊���/���������擾 */
    vc2PhaseStartMonth :=  TO_CHAR(pnumYear + FLOOR((numStartMonth  -1+((pnumHalfTermTyp-1)*6))/12) ||
                                   LPAD(MOD((numStartMonth  -1+((pnumHalfTermTyp-1)*6)),12)+1 ,2,'0')
                                  ); 
    vc2PhaseEndMonth   :=  TO_CHAR(pnumYear + FLOOR((numStartMonth+5-1+((pnumHalfTermTyp-1)*6))/12) ||
                                   LPAD(MOD((numStartMonth+5-1+((pnumHalfTermTyp-1)*6)),12)+1 ,2,'0')
                                  ); 

    BEGIN  /* �J�[�\��OPEN(�擪�i) */
        OPEN  curUPPER;
    EXCEPTION
        WHEN OTHERS THEN
            vc2Comment := SUBSTR('4:OPEN curUPPER'  ||
                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
            RAISE  excERR_CURSOR;
    END;  /* �J�[�\��OPEN(�擪�i) */

    LOOP  /*  �擪�i�̌J��Ԃ� */

        BEGIN  /* �J�[�\��FETCH(�擪�i) */
            FETCH  curUPPER  INTO  recUPPER;
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment := SUBSTR('5:FETCH curUPPER'  ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE  excERR_CURSOR;
        END;  /* �J�[�\��FETCH(�擪�i) */

        EXIT WHEN  curUPPER%NOTFOUND;

        blnLowerSkip := FALSE;             /* ���ʓW�J���Ȃ� */
        numCntUpper  := numCntUpper+1;     /* �Ώۃf�[�^����(�擪�i) */

        IF  recUPPER.OUTSIDE_TYP  =  1  THEN  /* ����̏��� */

            /* �i�ڕʉ��H��}�X�^�̑��ݗL������ */
            SELECT  COUNT(*)  INTO  numCountDummy  FROM M_ITEM_PROC_COST
              WHERE  PLANT_CD  = pvc2PlantCd
                AND  ITEM_CD   = recUPPER.COMP_ITEM_CD
                AND  ROWNUM    = 1 
            ;

            IF  numCountDummy  >  0  THEN  /* �i�ڕʉ��H��}�X�^�̑��ݗL�� */

                BEGIN  /* �J�[�\��OPEN(�i�ڕʉ��H��}�X�^) */
                    OPEN  curPROC_COST(recUPPER.COMP_ITEM_CD);
                EXCEPTION
                    WHEN OTHERS THEN
                        vc2Comment := SUBSTR('6:OPEN curPROC_COST'  ||
                                             ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                             ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                        RAISE  excERR_CURSOR;
                END;  /* �J�[�\��OPEN(�i�ڕʉ��H��}�X�^) */

                LOOP  /* �i�ڕʉ��H��}�X�^�̌J��Ԃ� */

                    BEGIN  /* �J�[�\��FETCH(�i�ڕʉ��H��}�X�^) */
                        FETCH  curPROC_COST  INTO  recPROC_COST;
                    EXCEPTION
                        WHEN OTHERS THEN
                            vc2Comment  := SUBSTR('7:FETCH curPROC_COST'  ||
                                                  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                            RAISE  excERR_CURSOR;
                    END;  /* �J�[�\��FETCH(�i�ڕʉ��H��}�X�^) */

                    EXIT WHEN  curPROC_COST%NOTFOUND;

                    IF  recPROC_COST.PLANT_CD IS NOT NULL  THEN  /* ���H��}�X�^�����݂��鎞�i�H������j*/

                        numCntItemProcCost := numCntItemProcCost+1; --����f�[�^����(�i�ڕʉ��H��)

                    ELSE

                        /* �ȉ��̃G���[��SQLSTDMATRPROCCOST�ł̓`�F�b�N���Ȃ��G���[ */
                        /* �����v�Z�G���[�ԍ��̎擾 */
                        blnRet  :=  FNCGETSEQCSCALCERRORCD(pvc2PlantCd,vc2CsCalcErrorCd);
                        IF  blnRet  =  FALSE  THEN
                             vc2Comment := SUBSTR('12:FNCGETSEQCSCALCERRORCD'  ||
                                                     ' PLANT_CD=' || '[ ' || pvc2PlantCd || ' ]',1,256);
                                RAISE  excERR_CURSOR;
                        END IF;

                        BEGIN  /* �����v�Z�G���[��������(����ŉ��H��}�X�^�Ȃ�) */
                            INSERT  INTO  T_CS_CALC_ERROR (
                                          CS_CALC_ERROR_CD,CS_CALC_PROC_NO,YEAR,HALF_TERM_TYP,COST_TYP,PLANT_CD
                                         ,ROOT_ITEM_CD,PARENT_ITEM_CD,ITEM_CD,PS_EDITION,CS_PROC_CD
                                         ,PROC_COST_CLS_CD,MESSAGE_CD,REMARKS,LIST_ISS_FLG
                                         ,CREATED_DATE,CREATED_BY,CREATED_PRG_NM
                                         ,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM
                                         ,MODIFY_COUNT
                             ) VALUES (
                                          vc2CsCalcErrorCd
                                         ,6,pnumYear,pnumHalfTermTyp,pnumCostTyp,pvc2PlantCd
                                         ,recUPPER.COMP_ITEM_CD
                                         ,recUPPER.PARENT_ITEM_CD
                                         ,recUPPER.COMP_ITEM_CD
                                         ,recUPPER.PS_EDITION
                                         ,recPROC_COST.CS_PROC_CD,NULL
                                         ,'DC00205','����ŉ��H��}�X�^�Ȃ�',0
                                         ,SYSDATE,pvc2UserId,MY_SQL_NAME
                                         ,SYSDATE,pvc2UserId,MY_SQL_NAME
                                         ,0
                            );
                            numCountError := numCountError + 1;  --�����v�Z�G���[����

                        EXCEPTION
                            WHEN OTHERS THEN
                                vc2Comment := SUBSTR('13:INSERT T_CS_CALC_ERROR'  ||
                                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                                RAISE  excERR_CURSOR;
                        END;  /* �����v�Z�G���[��������(�H���O���ōw���i�}�X�^�Ȃ�) */

                    END IF;  /* ���H��}�X�^�����݂��鎞�i�H������j*/

                END LOOP;  /* �i�ڕʉ��H��}�X�^�̌J��Ԃ� */

                IF  recPROC_COST.OUTSIDE_TYP = 2 THEN  /* �H���O���̎��́A�i�ڕʌ������X�V����B*/

                    BEGIN  /* �w���i�}�X�^�ǂݍ��� */
                        SELECT  UNIT_COST  ,PUCH_UNIT_QTY  ,EXCH_RATE
                        INTO    numUnitCost,numUnitQty,numExchRate
                        FROM  M_CS_PUCH
                        WHERE YEAR          =  pnumYear
                        AND   HALF_TERM_TYP =  pnumHalfTermTyp
                        AND   COST_TYP      =  pnumCostTyp
                        AND   PLANT_CD      =  pvc2PlantCd
                        AND   ITEM_CD       =  recUPPER.COMP_ITEM_CD
--                      AND   CS_PROC_CD    =  recPROC_COST.CS_PROC_CD
                        AND   DEL_FLG       =  0
                        ;
                        blnFoundCsPuch  :=  TRUE;
                    EXCEPTION
                        WHEN OTHERS THEN
                            blnFoundCsPuch  :=  FALSE;
                    END;  /* �w���i�}�X�^�ǂݍ��� */

                    IF  blnFoundCsPuch  =  TRUE  THEN  /* �w���i�}�X�^�����݂����ꍇ */

                        NULL;

                    ELSE  /* �w���i�}�X�^�����݂����ꍇ */

                        IF  recUPPER.VOLUNT_SPL_FLG   = 1  OR  /* �����󋋕i�t���O */
                            recUPPER.COST_UP_TYP      = 0  OR  /* �����Ϗ�敪 */
                            recPROC_COST.ONEROUS_CONS_FLG = 1  OR  /* �L���x���i�t���O */
                            vc2PhaseStartMonth > TO_CHAR(recUPPER.EFF_PHASE_OUT_DATE,'YYYYMM') OR
                            vc2PhaseEndMonth   < TO_CHAR(recUPPER.EFF_PHASE_IN_DATE,'YYYYMM') THEN  /* [�����v�Z���O]���� */

                            NULL;

                        ELSE  /* [�����v�Z���O]���� */
                            /* �����v�Z�G���[�ԍ��̎擾 */
                            blnRet  :=  FNCGETSEQCSCALCERRORCD(pvc2PlantCd,vc2CsCalcErrorCd);
                            IF  blnRet  =  FALSE  THEN
                                vc2Comment := SUBSTR('12:FNCGETSEQCSCALCERRORCD'  ||
                                                     ' PLANT_CD=' || '[ ' || pvc2PlantCd || ' ]',1,256);
                                RAISE  excERR_CURSOR;
                            END IF;

                            BEGIN  /* �����v�Z�G���[��������(�H���O���ōw���i�}�X�^�Ȃ�) */
                                INSERT  INTO  T_CS_CALC_ERROR (
                                          CS_CALC_ERROR_CD,CS_CALC_PROC_NO,YEAR,HALF_TERM_TYP,COST_TYP,PLANT_CD
                                         ,ROOT_ITEM_CD,PARENT_ITEM_CD,ITEM_CD,PS_EDITION,CS_PROC_CD
                                         ,PROC_COST_CLS_CD,MESSAGE_CD,REMARKS,LIST_ISS_FLG
                                         ,CREATED_DATE,CREATED_BY,CREATED_PRG_NM
                                         ,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM
                                         ,MODIFY_COUNT
                                 ) VALUES (
                                          vc2CsCalcErrorCd
                                         ,6,pnumYear,pnumHalfTermTyp,pnumCostTyp,pvc2PlantCd
                                         ,recUPPER.COMP_ITEM_CD
                                         ,recUPPER.PARENT_ITEM_CD
                                         ,recUPPER.COMP_ITEM_CD
                                         ,recUPPER.PS_EDITION
                                         ,recPROC_COST.CS_PROC_CD,NULL
                                         ,'DC00207','�H���O���ōw���i�}�X�^�Ȃ�',0
                                         --,'DC00207','�w���i�}�X�^�Ȃ�',0
                                         ,SYSDATE,pvc2UserId,MY_SQL_NAME
                                         ,SYSDATE,pvc2UserId,MY_SQL_NAME
                                         ,0
                                );
                                numCountError := numCountError + 1;  --�����v�Z�G���[����

                            EXCEPTION
                                WHEN OTHERS THEN
                                    vc2Comment := SUBSTR('13:INSERT T_CS_CALC_ERROR'  ||
                                                         ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                         ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                                    RAISE  excERR_CURSOR;
                            END;  /* �����v�Z�G���[��������(�H���O���ōw���i�}�X�^�Ȃ�) */

                        END IF;  /* [�����v�Z���O]���� */

                    END IF;  /* �w���i�}�X�^�����݂����ꍇ */

                END IF;  /* �H���O���̎��́A�i�ڕʌ������X�V����B*/

                CLOSE curPROC_COST;

            ELSE  /* �i�ڕʉ��H��}�X�^�̑��ݗL�� */

                blnLowerSkip := TRUE;             /* ���ʓW�J���Ȃ� */

                IF  recUPPER.VOLUNT_SPL_FLG   = 1  OR  /* �����󋋕i�t���O */
                    recUPPER.COST_UP_TYP      = 0  OR  /* �����Ϗ�敪 */
                    recPROC_COST.ONEROUS_CONS_FLG = 1  OR  /* �L���x���i�t���O */
                    vc2PhaseStartMonth > TO_CHAR(recUPPER.EFF_PHASE_OUT_DATE,'YYYYMM') OR
                    vc2PhaseEndMonth   < TO_CHAR(recUPPER.EFF_PHASE_IN_DATE,'YYYYMM') THEN  /* [�����v�Z���O]���� */

                    NULL;

                ELSE  /* [�����v�Z���O]���� */

                    /* �����v�Z�G���[�ԍ��̎擾 */
                    blnRet  :=  FNCGETSEQCSCALCERRORCD(pvc2PlantCd,vc2CsCalcErrorCd);
                    IF  blnRet  =  FALSE  THEN
                        vc2Comment := SUBSTR('14:FNCGETSEQCSCALCERRORCD'  ||
                                             ' PLANT_CD=' || '[ ' || pvc2PlantCd || ' ]',1,256);
                        RAISE  excERR_CURSOR;
                    END IF;

                    BEGIN  /* �����v�Z�G���[��������(����ŕi�ڕʉ��H��}�X�^�Ȃ�) */
                        INSERT  INTO  T_CS_CALC_ERROR (
                                  CS_CALC_ERROR_CD,CS_CALC_PROC_NO,YEAR,HALF_TERM_TYP,COST_TYP,PLANT_CD
                                 ,ROOT_ITEM_CD,PARENT_ITEM_CD,ITEM_CD,PS_EDITION,CS_PROC_CD
                                 ,PROC_COST_CLS_CD,MESSAGE_CD,REMARKS,LIST_ISS_FLG
                                 ,CREATED_DATE,CREATED_BY,CREATED_PRG_NM
                                 ,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM
                                 ,MODIFY_COUNT
                         )  VALUES (
                                  vc2CsCalcErrorCd
                                 ,6,pnumYear,pnumHalfTermTyp,pnumCostTyp,pvc2PlantCd
                                 ,recUPPER.COMP_ITEM_CD
                                 ,recUPPER.PARENT_ITEM_CD
                                 ,recUPPER.COMP_ITEM_CD
                                 ,recUPPER.PS_EDITION
                                 ,NULL,NULL
                                 ,'DC00206','����ŕi�ڕʉ��H��}�X�^�Ȃ�',0
                                 ,SYSDATE,pvc2UserId,MY_SQL_NAME
                                 ,SYSDATE,pvc2UserId,MY_SQL_NAME
                                 ,0
                        );
                        numCountError := numCountError + 1;  --�����v�Z�G���[����

                    EXCEPTION
                        WHEN OTHERS THEN
                            vc2Comment := SUBSTR('15:INSERT T_CS_CALC_ERROR'  ||
                                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                            RAISE  excERR_CURSOR;
                    END;  /* �����v�Z�G���[��������(����ŕi�ڕʉ��H��}�X�^�Ȃ�) */

                END IF;  /* [�����v�Z���O]���� */

            END IF; /* �i�ڕʉ��H��}�X�^�̑��ݗL�� */

        ELSE  /* ����̏��� */

            BEGIN  /* �w���i�}�X�^�ǂݍ��� */
                SELECT  
                    UNIT_COST_ACCEPT_TYP,UNIT_COST,PUCH_UNIT_QTY,EXCH_RATE
                   ,SUB_UNIT_COST,SUB_PUCH_UNIT_QTY,SUB_EXCH_RATE
                   ,CLASIFICATION_CD,ONEROUS_CONS_FLG
                INTO
                    numUnitCostAcceptTyp,numUnitCost,numUnitQty,numExchRate
                   ,numSubUnitCost,numSubUnitQty,numSubExchRate
                   ,vc2ClasificationCd,numOnerousConsFlg
                FROM
                   M_CS_PUCH
                WHERE
                      YEAR          =  pnumYear
                AND   HALF_TERM_TYP =  pnumHalfTermTyp
                AND   COST_TYP      =  pnumCostTyp
                AND   PLANT_CD      =  pvc2PlantCd
                AND   ITEM_CD       =  recUPPER.COMP_ITEM_CD
--              AND   CS_PROC_CD    =  OUTSIDE_PROC_CD
                AND   DEL_FLG       =  0
                ;
                blnFoundCsPuch  :=  TRUE;
            EXCEPTION
                WHEN OTHERS THEN
                    blnFoundCsPuch  :=  FALSE;
            END;  /* �w���i�}�X�^�ǂݍ��� */

            IF  blnFoundCsPuch  =  TRUE  THEN  /* �w���i�}�X�^�����݂����ꍇ */

                NULL;

            ELSE  /* �w���i�}�X�^�����݂����ꍇ */

                blnLowerSkip := TRUE;             /* ���ʓW�J���Ȃ� */

                IF  recUPPER.VOLUNT_SPL_FLG   = 1  OR  /* �����󋋕i�t���O */
                    recUPPER.COST_UP_TYP      = 0  OR  /* �����Ϗ�敪 */
                    recPROC_COST.ONEROUS_CONS_FLG = 1  OR  /* �L���x���i�t���O */
                    vc2PhaseStartMonth > TO_CHAR(recUPPER.EFF_PHASE_OUT_DATE,'YYYYMM') OR
                    vc2PhaseEndMonth   < TO_CHAR(recUPPER.EFF_PHASE_IN_DATE,'YYYYMM') THEN  /* [�����v�Z���O]���� */

                    NULL;

                ELSE  /* [�����v�Z���O]���� */

                    /* �����v�Z�G���[�ԍ��̎擾 */
                    blnRet  :=  FNCGETSEQCSCALCERRORCD(pvc2PlantCd,vc2CsCalcErrorCd);
                    IF  blnRet  =  FALSE  THEN
                        vc2Comment := SUBSTR('17:FNCGETSEQCSCALCERRORCD'  ||
                                             ' PLANT_CD=' || '[ ' || pvc2PlantCd || ' ]',1,256);
                        RAISE  excERR_CURSOR;
                    END IF;

                    BEGIN  /* �����v�Z�G���[��������(�O��ōw���i�}�X�^�Ȃ�) */
                        INSERT  INTO  T_CS_CALC_ERROR (
                                  CS_CALC_ERROR_CD,CS_CALC_PROC_NO,YEAR,HALF_TERM_TYP,COST_TYP,PLANT_CD
                                 ,ROOT_ITEM_CD,PARENT_ITEM_CD,ITEM_CD,PS_EDITION,CS_PROC_CD
                                 ,PROC_COST_CLS_CD,MESSAGE_CD,REMARKS,LIST_ISS_FLG
                                 ,CREATED_DATE,CREATED_BY,CREATED_PRG_NM
                                 ,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM
                                 ,MODIFY_COUNT
                         )  VALUES (
                                  vc2CsCalcErrorCd
                                 ,6,pnumYear,pnumHalfTermTyp,pnumCostTyp,pvc2PlantCd
                                 ,recUPPER.COMP_ITEM_CD
                                 ,recUPPER.PARENT_ITEM_CD
                                 ,recUPPER.COMP_ITEM_CD
                                 ,recUPPER.PS_EDITION
                                 ,OUTSIDE_PROC_CD,NULL
                                 ,'DC00208','�O��ōw���i�}�X�^�Ȃ�',0
                                 ,SYSDATE,pvc2UserId,MY_SQL_NAME
                                 ,SYSDATE,pvc2UserId,MY_SQL_NAME
                                 ,0
                        );
                        numCountError := numCountError + 1;  --�����v�Z�G���[����

                    EXCEPTION
                        WHEN OTHERS THEN
                            vc2Comment := SUBSTR('18:INSERT T_CS_CALC_ERROR'  ||
                                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                            RAISE  excERR_CURSOR;
                    END;  /* �����v�Z�G���[��������(�O��ōw���i�}�X�^�Ȃ�) */

                END IF;  /* [�����v�Z���O]���� */

            END IF;  /* �w���i�}�X�^�����݂����ꍇ */

        END IF;  /* ����̏��� */

        IF  blnLowerSkip = FALSE  THEN  /* ���ʓW�J���Ȃ� */

        BEGIN  /* �J�[�\��OPEN(���ʓW�J) */
            OPEN  curLOWER(recUPPER.COMP_ITEM_CD);
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment := SUBSTR('19:OPEN curLOWER'  ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE  excERR_CURSOR;
        END;  /* �J�[�\��OPEN(���ʓW�J) */

        LOOP  /* ���ʓW�J�̌J��Ԃ� */
            BEGIN  /* �J�[�\��FETCH(���ʓW�J) */
                FETCH  curLOWER  INTO  recLOWER;
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment := SUBSTR('20:FETCH curLOWER'  ||
                                         ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                         ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE  excERR_CURSOR;
            END;  /* �J�[�\��FETCH(���ʓW�J) */

            EXIT WHEN  curLOWER%NOTFOUND;

            numCntLower  :=  numCntLower+1; /* �Ώۃf�[�^����(���ʓW�J) */

            /* ���i�\���L���I�����`�F�b�N(���[�j���O�F�G���[�ł��������s) */

            IF  TO_CHAR(recLOWER.EFF_PHASE_OUT_DATE,'YYYYMMDD') < TO_CHAR(datBusinessOprDate,'YYYYMMDD') THEN

                /* �����v�Z�G���[�ԍ��̎擾 */
                blnRet  :=  FNCGETSEQCSCALCERRORCD(pvc2PlantCd,vc2CsCalcErrorCd);
                IF  blnRet  =  FALSE  THEN
                    vc2Comment := SUBSTR('12-2:FNCGETSEQCSCALCERRORCD'  ||
                                         ' PLANT_CD=' || '[ ' || pvc2PlantCd || ' ]',1,256);
                    RAISE  excERR_CURSOR;
                END IF;

                BEGIN  /* �����v�Z�G���[��������(����ŉ��H��}�X�^�Ȃ�) */
                    INSERT  INTO  T_CS_CALC_ERROR (
                                          CS_CALC_ERROR_CD,CS_CALC_PROC_NO,YEAR,HALF_TERM_TYP,COST_TYP,PLANT_CD
                                         ,ROOT_ITEM_CD,PARENT_ITEM_CD,ITEM_CD,PS_EDITION,CS_PROC_CD
                                         ,PROC_COST_CLS_CD,MESSAGE_CD,REMARKS,LIST_ISS_FLG
                                         ,CREATED_DATE,CREATED_BY,CREATED_PRG_NM
                                         ,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM
                                         ,MODIFY_COUNT
                    ) VALUES (
                                          vc2CsCalcErrorCd
                                         ,6,pnumYear,pnumHalfTermTyp,pnumCostTyp,pvc2PlantCd
                                         ,recUPPER.COMP_ITEM_CD
                                         ,recLOWER.PARENT_ITEM_CD
                                         ,recLOWER.COMP_ITEM_CD
                                         ,recLOWER.PS_EDITION
                                         ,NULL,NULL
                                         ,'DC00209',NULL,0
                                         ,SYSDATE,pvc2UserId,MY_SQL_NAME
                                         ,SYSDATE,pvc2UserId,MY_SQL_NAME
                                         ,0
                    );
                    numCountError := numCountError + 1;  --�����v�Z�G���[����

                EXCEPTION
                    WHEN OTHERS THEN
                        vc2Comment := SUBSTR('13-2:INSERT T_CS_CALC_ERROR'  ||
                                             ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                         ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                        RAISE  excERR_CURSOR;
                END;  /* �����v�Z�G���[��������(�H���O���ōw���i�}�X�^�Ȃ�) */

            END IF;

            IF  recLOWER.OUTSIDE_TYP  =  1  THEN  /* ����̏��� */

                /* �i�ڕʉ��H��}�X�^�̑��ݗL������ */
                SELECT  COUNT(*)  INTO  numCountDummy  FROM M_ITEM_PROC_COST
                  WHERE  PLANT_CD  = pvc2PlantCd
                    AND  ITEM_CD   = recLOWER.COMP_ITEM_CD
                    AND  ROWNUM    = 1 
                ;

                IF  numCountDummy  >  0  THEN  /* �i�ڕʉ��H��}�X�^�̑��ݗL�� */

                    BEGIN  /* �J�[�\��OPEN(�i�ڕʉ��H��}�X�^) */
                        OPEN  curPROC_COST(recLOWER.COMP_ITEM_CD);
                    EXCEPTION
                        WHEN OTHERS THEN
                            vc2Comment := SUBSTR('21:OPEN curPROC_COST'  ||
                                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                            RAISE  excERR_CURSOR;
                    END;  /* �J�[�\��OPEN(�i�ڕʉ��H��}�X�^) */

                    LOOP  /* �i�ڕʉ��H��}�X�^�̌J��Ԃ� */
                        BEGIN  /* �J�[�\��FETCH(�i�ڕʉ��H��}�X�^) */
                            FETCH  curPROC_COST  INTO  recPROC_COST;
                        EXCEPTION
                            WHEN OTHERS THEN
                                vc2Comment := SUBSTR('22:FETCH curPROC_COST'  ||
                                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                                RAISE  excERR_CURSOR;
                        END;  /* �J�[�\��FETCH(�i�ڕʉ��H��}�X�^) */

                        EXIT WHEN  curPROC_COST%NOTFOUND;

                        IF  recPROC_COST.PLANT_CD IS NOT NULL  THEN  /* ���H��}�X�^�����݂��鎞�i�H������j*/

                            numCntItemProcCost := numCntItemProcCost+1; --����f�[�^����(�i�ڕʉ��H��)

                        ELSE

                            /* �ȉ��̃G���[��SQLSTDMATRPROCCOST�ł̓`�F�b�N���Ȃ��G���[ */
                            /* �����v�Z�G���[�ԍ��̎擾 */
                            blnRet  :=  FNCGETSEQCSCALCERRORCD(pvc2PlantCd,vc2CsCalcErrorCd);
                            IF  blnRet  =  FALSE  THEN
                                    vc2Comment := SUBSTR('12:FNCGETSEQCSCALCERRORCD'  ||
                                                         ' PLANT_CD=' || '[ ' || pvc2PlantCd || ' ]',1,256);
                                    RAISE  excERR_CURSOR;
                            END IF;

                            BEGIN  /* �����v�Z�G���[��������(����ŉ��H��}�X�^�Ȃ�) */
                                INSERT  INTO  T_CS_CALC_ERROR (
                                          CS_CALC_ERROR_CD,CS_CALC_PROC_NO,YEAR,HALF_TERM_TYP,COST_TYP,PLANT_CD
                                         ,ROOT_ITEM_CD,PARENT_ITEM_CD,ITEM_CD,PS_EDITION,CS_PROC_CD
                                         ,PROC_COST_CLS_CD,MESSAGE_CD,REMARKS,LIST_ISS_FLG
                                         ,CREATED_DATE,CREATED_BY,CREATED_PRG_NM
                                         ,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM
                                         ,MODIFY_COUNT
                                 ) VALUES (
                                          vc2CsCalcErrorCd
                                         ,6,pnumYear,pnumHalfTermTyp,pnumCostTyp,pvc2PlantCd
                                         ,recUPPER.COMP_ITEM_CD
                                         ,recLOWER.PARENT_ITEM_CD
                                         ,recLOWER.COMP_ITEM_CD
                                         ,recLOWER.PS_EDITION
                                         ,recPROC_COST.CS_PROC_CD,NULL
                                         ,'DC00205','����ŉ��H��}�X�^�Ȃ�',0
                                         ,SYSDATE,pvc2UserId,MY_SQL_NAME
                                         ,SYSDATE,pvc2UserId,MY_SQL_NAME
                                         ,0
                                );
                                numCountError := numCountError + 1;  --�����v�Z�G���[����

                            EXCEPTION
                                WHEN OTHERS THEN
                                    vc2Comment := SUBSTR('13:INSERT T_CS_CALC_ERROR'  ||
                                                         ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                         ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                                    RAISE  excERR_CURSOR;
                            END;  /* �����v�Z�G���[��������(�H���O���ōw���i�}�X�^�Ȃ�) */

                        END IF;  /* ���H��}�X�^�����݂��鎞�i�H������j*/

                    END LOOP;  /* �i�ڕʉ��H��}�X�^�̌J��Ԃ� */

                    IF  recPROC_COST.OUTSIDE_TYP = 2 THEN  /* �H���O���̎��́A�i�ڕʌ������X�V����B*/

                        BEGIN  /* �w���i�}�X�^�ǂݍ��� */
                            SELECT  UNIT_COST  ,PUCH_UNIT_QTY  ,EXCH_RATE
                            INTO    numUnitCost,numUnitQty,numExchRate
                            FROM    M_CS_PUCH
                            WHERE   YEAR          =  pnumYear
                              AND   HALF_TERM_TYP =  pnumHalfTermTyp
                              AND   COST_TYP      =  pnumCostTyp
                              AND   PLANT_CD      =  pvc2PlantCd
                              AND   ITEM_CD       =  recLOWER.COMP_ITEM_CD
--                            AND   CS_PROC_CD    =  recPROC_COST.CS_PROC_CD
                              AND   DEL_FLG       =  0
                            ;
                            blnFoundCsPuch  :=  TRUE;
                        EXCEPTION
                            WHEN OTHERS THEN
                                blnFoundCsPuch  :=  FALSE;
                        END;  /* �w���i�}�X�^�ǂݍ��� */

                        IF  blnFoundCsPuch  =  TRUE  THEN  /* �w���i�}�X�^�����݂����ꍇ */

                            NULL;

                        ELSE  /* �w���i�}�X�^�����݂����ꍇ */

                            IF  recLOWER.VOLUNT_SPL_FLG   = 1  OR  /* �����󋋕i�t���O */
                                recLOWER.COST_UP_TYP      = 0  OR  /* �����Ϗ�敪 */
--                              recPROC_COST.ONEROUS_CONS_FLG = 1  OR  /* �L���x���i�t���O */
                                vc2PhaseStartMonth > TO_CHAR(recLOWER.EFF_PHASE_OUT_DATE,'YYYYMM') OR
                                vc2PhaseEndMonth   < TO_CHAR(recLOWER.EFF_PHASE_IN_DATE,'YYYYMM') THEN  /* [�����v�Z���O]���� */

                                NULL;

                            ELSE  /* [�����v�Z���O]���� */

                                /* �����v�Z�G���[�ԍ��̎擾 */
                                blnRet  :=  FNCGETSEQCSCALCERRORCD(pvc2PlantCd,vc2CsCalcErrorCd);
                                IF  blnRet  =  FALSE  THEN
                                    vc2Comment := SUBSTR('27:FNCGETSEQCSCALCERRORCD'  ||
                                                         ' PLANT_CD=' || '[ ' || pvc2PlantCd || ' ]',1,256);
                                    RAISE  excERR_CURSOR;
                                END IF;

                                BEGIN  /* �����v�Z�G���[��������(�H���O���ōw���i�}�X�^�Ȃ�) */
                                    INSERT  INTO  T_CS_CALC_ERROR (
                                          CS_CALC_ERROR_CD,CS_CALC_PROC_NO,YEAR,HALF_TERM_TYP,COST_TYP,PLANT_CD
                                         ,ROOT_ITEM_CD,PARENT_ITEM_CD,ITEM_CD,PS_EDITION,CS_PROC_CD
                                         ,PROC_COST_CLS_CD,MESSAGE_CD,REMARKS,LIST_ISS_FLG
                                         ,CREATED_DATE,CREATED_BY,CREATED_PRG_NM
                                         ,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM
                                         ,MODIFY_COUNT
                                     )  VALUES (
                                          vc2CsCalcErrorCd
                                         ,6,pnumYear,pnumHalfTermTyp,pnumCostTyp,pvc2PlantCd
                                         ,recUPPER.COMP_ITEM_CD
                                         ,recLOWER.PARENT_ITEM_CD
                                         ,recLOWER.COMP_ITEM_CD
                                         ,recLOWER.PS_EDITION
                                         ,recPROC_COST.CS_PROC_CD,NULL
                                         ,'DC00207','�H���O���ōw���i�}�X�^�Ȃ�',0
                                         --,'DC00207','�w���i�}�X�^�Ȃ�',0
                                         ,SYSDATE,pvc2UserId,MY_SQL_NAME
                                         ,SYSDATE,pvc2UserId,MY_SQL_NAME
                                         ,0
                                    );
                                    numCountError := numCountError + 1;  --�����v�Z�G���[����

                                EXCEPTION
                                    WHEN OTHERS THEN
                                        vc2Comment := SUBSTR('28:INSERT T_CS_CALC_ERROR'  ||
                                                             ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                             ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                                        RAISE  excERR_CURSOR;
                                END;  /* �����v�Z�G���[��������(�H���O���ōw���i�}�X�^�Ȃ�) */

                            END IF;  /* [�����v�Z���O]���� */

                        END IF;  /* �w���i�}�X�^�����݂����ꍇ */

                   END IF;  /* �H���O���̎��́A�i�ڕʌ������X�V����B*/

                   CLOSE curPROC_COST;

                ELSE  /* �i�ڕʉ��H��}�X�^�̑��ݗL�� */

                    IF  recLOWER.VOLUNT_SPL_FLG   = 1  OR  /* �����󋋕i�t���O */
                        recLOWER.COST_UP_TYP      = 0  OR  /* �����Ϗ�敪 */
--                      recPROC_COST.ONEROUS_CONS_FLG = 1  OR  /* �L���x���i�t���O */
                        vc2PhaseStartMonth > TO_CHAR(recLOWER.EFF_PHASE_OUT_DATE,'YYYYMM') OR
                        vc2PhaseEndMonth   < TO_CHAR(recLOWER.EFF_PHASE_IN_DATE,'YYYYMM') THEN  /* [�����v�Z���O]���� */

                        NULL;

                    ELSE  /* [�����v�Z���O]���� */

                        /* �����v�Z�G���[�ԍ��̎擾 */
                        blnRet  :=  FNCGETSEQCSCALCERRORCD(pvc2PlantCd,vc2CsCalcErrorCd);
                        IF  blnRet  =  FALSE  THEN
                            vc2Comment := SUBSTR('29:FNCGETSEQCSCALCERRORCD'  ||
                                                 ' PLANT_CD=' || '[ ' || pvc2PlantCd || ' ]',1,256);
                            RAISE  excERR_CURSOR;
                        END IF;

                        BEGIN  /* �����v�Z�G���[��������(����ŕi�ڕʉ��H��}�X�^�Ȃ�) */
                            INSERT  INTO  T_CS_CALC_ERROR (
                                  CS_CALC_ERROR_CD,CS_CALC_PROC_NO,YEAR,HALF_TERM_TYP,COST_TYP
                                 ,PLANT_CD,ROOT_ITEM_CD,PARENT_ITEM_CD,ITEM_CD
                                 ,PS_EDITION,CS_PROC_CD,PROC_COST_CLS_CD
                                 ,MESSAGE_CD,REMARKS,LIST_ISS_FLG
                                 ,CREATED_DATE,CREATED_BY,CREATED_PRG_NM
                                 ,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM
                                 ,MODIFY_COUNT
                             )  VALUES (
                                  vc2CsCalcErrorCd
                                 ,6,pnumYear,pnumHalfTermTyp,pnumCostTyp,pvc2PlantCd
                                 ,recUPPER.COMP_ITEM_CD
                                 ,recLOWER.PARENT_ITEM_CD
                                 ,recLOWER.COMP_ITEM_CD
                                 ,recLOWER.PS_EDITION
                                 ,NULL,NULL
                                 ,'DC00206','����ŕi�ڕʉ��H��}�X�^�Ȃ�',0
                                 ,SYSDATE,pvc2UserId,MY_SQL_NAME
                                 ,SYSDATE,pvc2UserId,MY_SQL_NAME
                                 ,0
                            );
                            numCountError := numCountError + 1;  --�����v�Z�G���[����

                        EXCEPTION
                            WHEN OTHERS THEN
                                vc2Comment := SUBSTR('30:INSERT T_CS_CALC_ERROR'  ||
                                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                                RAISE  excERR_CURSOR;
                        END;  /* �����v�Z�G���[��������(����ŕi�ڕʉ��H��}�X�^�Ȃ�) */

                    END IF;  /* [�����v�Z���O]���� */

                END IF;  /* �i�ڕʉ��H��}�X�^�̑��ݗL�� */

            ELSE  /* ����̏��� */

                BEGIN  /* �w���i�}�X�^�ǂݍ��� */
                    SELECT  
                        UNIT_COST_ACCEPT_TYP,UNIT_COST,PUCH_UNIT_QTY,EXCH_RATE
                       ,SUB_UNIT_COST,SUB_PUCH_UNIT_QTY,SUB_EXCH_RATE
                       ,CLASIFICATION_CD,ONEROUS_CONS_FLG
                    INTO
                        numUnitCostAcceptTyp,numUnitCost,numUnitQty,numExchRate
                       ,numSubUnitCost,numSubUnitQty,numSubExchRate
                       ,vc2ClasificationCd,numOnerousConsFlg
                    FROM
                       M_CS_PUCH
                    WHERE    YEAR          =  pnumYear
                       AND   HALF_TERM_TYP =  pnumHalfTermTyp
                       AND   COST_TYP      =  pnumCostTyp
                       AND   PLANT_CD      =  pvc2PlantCd
                       AND   ITEM_CD       =  recLOWER.COMP_ITEM_CD
--                     AND   CS_PROC_CD    =  OUTSIDE_PROC_CD
                       AND   DEL_FLG       =  0
                     ;
                    blnFoundCsPuch  :=  TRUE;
                EXCEPTION
                    WHEN OTHERS THEN
                        blnFoundCsPuch  :=  FALSE;
                END;  /* �w���i�}�X�^�ǂݍ��� */

                IF  blnFoundCsPuch  =  TRUE  THEN  /* �w���i�}�X�^�����݂����ꍇ */

                    NULL;

                ELSE    /* �w���i�}�X�^�����݂����ꍇ */

                    IF  recLOWER.VOLUNT_SPL_FLG   = 1  OR  /* �����󋋕i�t���O */
                        recLOWER.COST_UP_TYP      = 0  OR  /* �����Ϗ�敪 */
--                      recPROC_COST.ONEROUS_CONS_FLG = 1  OR  /* �L���x���i�t���O */
                        vc2PhaseStartMonth > TO_CHAR(recLOWER.EFF_PHASE_OUT_DATE,'YYYYMM') OR
                        vc2PhaseEndMonth   < TO_CHAR(recLOWER.EFF_PHASE_IN_DATE,'YYYYMM') THEN  /* [�����v�Z���O]���� */

                        NULL;

                    ELSE  /* [�����v�Z���O]���� */

                        /* �����v�Z�G���[�ԍ��̎擾 */
                        blnRet  :=  FNCGETSEQCSCALCERRORCD(pvc2PlantCd,vc2CsCalcErrorCd);
                        IF  blnRet  =  FALSE  THEN
                            vc2Comment := SUBSTR('32:FNCGETSEQCSCALCERRORCD'  ||
                                                 ' PLANT_CD=' || '[ ' || pvc2PlantCd || ' ]',1,256);
                            RAISE  excERR_CURSOR;
                        END IF;

                        BEGIN  /* �����v�Z�G���[��������(�O��ōw���i�}�X�^�Ȃ�)  */
                            INSERT  INTO  T_CS_CALC_ERROR 
                                 (CS_CALC_ERROR_CD,CS_CALC_PROC_NO,YEAR,HALF_TERM_TYP,COST_TYP
                                 ,PLANT_CD,ROOT_ITEM_CD,PARENT_ITEM_CD,ITEM_CD
                                 ,PS_EDITION,CS_PROC_CD,PROC_COST_CLS_CD
                                 ,MESSAGE_CD,REMARKS,LIST_ISS_FLG
                                 ,CREATED_DATE,CREATED_BY,CREATED_PRG_NM
                                 ,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM
                                 ,MODIFY_COUNT
                             )  VALUES (
                                  vc2CsCalcErrorCd
                                 ,6,pnumYear,pnumHalfTermTyp,pnumCostTyp,pvc2PlantCd
                                 ,recUPPER.COMP_ITEM_CD
                                 ,recLOWER.PARENT_ITEM_CD
                                 ,recLOWER.COMP_ITEM_CD
                                 ,recLOWER.PS_EDITION
                                 ,OUTSIDE_PROC_CD,NULL
                                 ,'DC00208','�O��ōw���i�}�X�^�Ȃ�',0
                                 ,SYSDATE,pvc2UserId,MY_SQL_NAME
                                 ,SYSDATE,pvc2UserId,MY_SQL_NAME
                                 ,0
                            );
                            numCountError := numCountError + 1;  --�����v�Z�G���[����

                        EXCEPTION
                            WHEN OTHERS THEN
                                vc2Comment := SUBSTR('33:INSERT T_CS_CALC_ERROR'  ||
                                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                            RAISE  excERR_CURSOR;
                        END;  /* �����v�Z�G���[��������(�O��ōw���i�}�X�^�Ȃ�)  */

                    END IF;  /* [�����v�Z���O]���� */

                END IF;  /* �w���i�}�X�^�����݂����ꍇ */

            END IF;  /* ����̏��� */

        END LOOP;  /* ���ʓW�J�̌J��Ԃ� */

        CLOSE curLOWER;

        COMMIT;  --COMMIT�͐擪�i����

    END IF;  /* �擪�i�ŃG���[ */

    END LOOP;  /*  �擪�i�̌J��Ԃ� */

    CLOSE curUPPER;

/* �����̏I�� */

    /* �I�����b�Z�[�W�̏o�� */
    vc2Comment := SUBSTR('(SBM0550)�@���͌���(�擪�i)=' || '[ ' || numCntUpper || ' ]' ||
                         '�@���͌���(���ʓW�J)=' || '[ ' || numCntLower || ' ]' ||
                         '�@�G���[����=' || '[ ' || numCountError || ' ]',1,256);
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

    pnumReturn := STATUS_NORMAL; --����I��

--< ��O���� >---------------------------------------------------------------
EXCEPTION
    WHEN excERR_SKIP THEN    --���s�s��

        ROLLBACK;

        /* �I�����b�Z�[�W�̏o�� */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, vc2MsgCD,
                            vc2Comment);

        /* �g���[�X���O�̏o��(�I��) */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId,pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, METHOD_END);

        COMMIT;

        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

        pnumReturn := STATUS_ERROR; --�ُ�I��

    WHEN excERR_CURSOR THEN    --�J�[�\��(curUPPER)OPEN���̂c�a�G���[

        IF curUPPER%ISOPEN = TRUE THEN
            CLOSE curUPPER;
        END IF;
        IF curLOWER%ISOPEN = TRUE THEN
            CLOSE curLOWER;
        END IF;
        IF curPROC_COST%ISOPEN = TRUE THEN
            CLOSE curPROC_COST;
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

        pnumReturn := STATUS_ERROR; --�ُ�I��

    WHEN OTHERS  THEN   --���̑��̃G���[

        IF curUPPER%ISOPEN = TRUE THEN
            CLOSE curUPPER;
        END IF;
        IF curLOWER%ISOPEN = TRUE THEN
            CLOSE curLOWER;
        END IF;
        IF curPROC_COST%ISOPEN = TRUE THEN
            CLOSE curPROC_COST;
        END IF;

        ROLLBACK;

        /* �I�����b�Z�[�W�̏o�� */
        vc2Comment := SUBSTR('(SBM0551) ���̑��̃G���[���������܂���'  ||
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

        pnumReturn := STATUS_ERROR; --�ُ�I��

END;
/
