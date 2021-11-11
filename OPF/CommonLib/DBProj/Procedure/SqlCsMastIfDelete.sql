CREATE OR REPLACE procedure      SQLCSMASTIFDELETE(
/*------------------------------------------------------------------------------
'
'$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/DBProj/Procedure/SqlCsMastIfDelete.sql,v $
'$Author: feng-yi $
'$Revision: 1.5 $ $Date: 2011/12/23 03:19:47 $
'                        2005.10.21 unicode�Ή��ivarchar2��4�{�j
'
'
' �@�\      : ��������IF�폜����
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
'             pnumCostTyp          - (i)�������
'             pnumDelFlgT_ITEM_CS_PROC_IF  - (i)�폜�Ώۃt���O(�i�ڕʍH��IF)
'             pnumDelFlgT_PROC_COST_IF     - (i)�폜�Ώۃt���O(���H��IF)
'             pnumDelFlgT_CS_PUCH_IF       - (i)�폜�Ώۃt���O(�w���iIF)
'             pnumReturn           - (o)�������� (1:����I���A2:�x���I���A3:�ُ�I��)
'
'
' �@�\����  : [�i��]�A[���i�\��]����ɁA�W�������v�Z�p��[�\���i���[�N]�̍쐬���s���B
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
   ,pnumCostTyp          IN  NUMBER          --�������
   ,pnumDelFlgT_ITEM_CS_PROC_IF  IN  NUMBER  --�폜�Ώۃt���O(�i�ڕʍH��IF)
   ,pnumDelFlgT_PROC_COST_IF     IN  NUMBER  --�폜�Ώۃt���O(���H��IF)
   ,pnumDelFlgT_CS_PUCH_IF       IN  NUMBER  --�폜�Ώۃt���O(�w���iIF)
   ,pnumReturn           OUT NUMBER          --��������
)
IS

    /* �萔�̐錾 */

    METHOD_START            VARCHAR2(20) := 'START';          --���O�p���\�b�h�J�n�錾
    METHOD_END              VARCHAR2(12) := 'End';            --���O�p���\�b�h�I���錾
    MY_SQL_NAME             VARCHAR2(120) := 'SQLCSMASTIFDELETE'; --�o�k�^�r�p�k��

    APS_COM_BATCH_START     VARCHAR2(28) := 'DE03201';
    APS_COM_BATCH_END       VARCHAR2(28) := 'DE03202';
    APS_COM_BATCH_EXP       VARCHAR2(28) := 'DE03203';

    LOGMSG_START_PGNM       VARCHAR2(200) := '(SBM0342)��������IF�폜�������J�n���܂���';
    LOGMSG_END_PGNM         VARCHAR2(200) := '��������IF�폜�������I�����܂���';
    LOGMSG_EXP_PGNM         VARCHAR2(200) := '��������IF�폜�������ُ�I�����܂���';

    STATUS_NORMAL           NUMBER        := 1;          -- ����I��
    STATUS_WARNING          NUMBER        := 2;          -- �x���I��
    STATUS_ERROR            NUMBER        := 3;          -- �ُ�I��

    /* �ϐ��̒�` */
    UTL_FileHandle          UTL_FILE.FILE_TYPE;     --�t�@�C���n���h��

    blnRet                  BOOLEAN;        --���ʊ֐��̖ߒl
    vc2Comment              VARCHAR2(1024);  --���b�Z�[�W�쐬�p

    numT_CS_PUCH_IF_DELETE       NUMBER(11)   := 0;
    numT_PROC_COST_IF_DELETE     NUMBER(11)   := 0;
    numT_ITEM_CS_PROC_IF_DELETE  NUMBER(11)   := 0;

    vc2CS_MAST_IF_PERIOD    VARCHAR2(32);

    /* �����Ǘ��p�����[�^����̎擾���� */
    numCS_MAST_IF_PERIOD     SYS_COST_CTRL.CS_MAST_IF_PERIOD  %TYPE;

    /* ��O�����p�ϐ� */
    excERR_SKIP       EXCEPTION;      --���s�s��
    excERR_MAST       EXCEPTION;      --�J�[�\��OPEN����EXCEPTION

    /* �J�[�\���̐錾  �i�ڕʍH��IF*/
    CURSOR curT_ITEM_CS_PROC_IF(
         cvc2UpdateDate VARCHAR2
    )
    IS
      SELECT *
        FROM  T_ITEM_CS_PROC_IF
        WHERE  PLANT_CD=pvc2PlantCd
          AND  UPD_FLG =1
          AND  TO_CHAR(UPDATED_DATE,'YYYYMMDD') < cvc2UpdateDate
      ;
    recT_ITEM_CS_PROC_IF curT_ITEM_CS_PROC_IF%ROWTYPE;

    /* �J�[�\���̐錾  ���H��IF*/
    CURSOR curT_PROC_COST_IF(
         cvc2UpdateDate VARCHAR2
    )
    IS
      SELECT *
        FROM  T_PROC_COST_IF
        WHERE  COST_TYP=pnumCostTyp
          AND  PLANT_CD=pvc2PlantCd
          AND  UPD_FLG =1
          AND  TO_CHAR(UPDATED_DATE,'YYYYMMDD') < cvc2UpdateDate
      ;
    recT_PROC_COST_IF  curT_PROC_COST_IF%ROWTYPE;

    /* �J�[�\���̐錾  �w���iIF*/
    CURSOR curT_CS_PUCH_IF(
         cvc2UpdateDate VARCHAR2
    )
    IS
      SELECT *
        FROM  T_CS_PUCH_IF
        WHERE  COST_TYP=pnumCostTyp
          AND  PLANT_CD=pvc2PlantCd
          AND  UPD_FLG =1
          AND  TO_CHAR(UPDATED_DATE,'YYYYMMDD') < cvc2UpdateDate
      ;
    recT_CS_PUCH_IF curT_CS_PUCH_IF%ROWTYPE;

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
    numT_CS_PUCH_IF_DELETE := 0;
    numT_PROC_COST_IF_DELETE := 0;
    numT_ITEM_CS_PROC_IF_DELETE := 0;

    /*  �����Ǘ��p�����[�^�̓Ǎ� */ 
    BEGIN
        SELECT  CS_MAST_IF_PERIOD
          INTO  numCS_MAST_IF_PERIOD
          FROM  SYS_COST_CTRL
          WHERE  PLANT_CD  =  pvc2PlantCd;
    EXCEPTION
        WHEN OTHERS THEN
            vc2Comment      := SUBSTR(' (SBM0535)�����Ǘ��p�����[�^�����݂��܂���B'  ||
                                      '�@USER_CD�F' || '[ ' || pvc2UserId || ' ]' ||
                                      '�@PLANT_CD�F' || '[ ' || pvc2PlantCd || ' ]',1,256);
            RAISE   excERR_SKIP;  
    END;

    vc2CS_MAST_IF_PERIOD  := TO_CHAR(ADD_MONTHS(SYSDATE,numCS_MAST_IF_PERIOD*-1),'YYYYMM')||'01';

    IF  pnumDelFlgT_ITEM_CS_PROC_IF = 1 THEN  /* �폜(�i�ڕʍH��IF) */

        BEGIN  /* �J�[�\��OPEN(�i�ڕʍH��IF) */ 
            OPEN  curT_ITEM_CS_PROC_IF(vc2CS_MAST_IF_PERIOD);
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment  :=  SUBSTR(' OPEN  curT_ITEM_CS_PROC_IF '  ||
                                       ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                       ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE  excERR_MAST;
        END;  /* �J�[�\��OPEN(�i�ڕʍH��IF) */ 

        LOOP  /* �폜(�i�ڕʍH��IF)�̌J��Ԃ�*/

            BEGIN  /* �J�[�\��FETCH�i�i�ڕʍH��IF�j */
                FETCH  curT_ITEM_CS_PROC_IF  INTO  recT_ITEM_CS_PROC_IF;
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment  :=  SUBSTR(' FETCH curT_ITEM_CS_PROC_IF '  ||
                                           ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                           ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE  excERR_MAST;
            END;  /* �J�[�\��FETCH�i�i�ڕʍH��IF�j */
    
            EXIT WHEN  curT_ITEM_CS_PROC_IF%NOTFOUND;

            BEGIN  /* �i�ڕʍH��IF�E�폜 */
                DELETE  FROM  T_ITEM_CS_PROC_IF
                   WHERE   PLANT_CD    = recT_ITEM_CS_PROC_IF.PLANT_CD
                     AND   ITEM_CD     = recT_ITEM_CS_PROC_IF.ITEM_CD
--                   AND   CS_PROC_CD  = recT_ITEM_CS_PROC_IF.CS_PROC_CD
                ;
                numT_ITEM_CS_PROC_IF_DELETE := numT_ITEM_CS_PROC_IF_DELETE + 1; 

            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment  :=  SUBSTR(' DELETE  T_ITEM_CS_PROC_IF '  ||
                                           ' PLANT_CD='  || '[ ' || recT_ITEM_CS_PROC_IF.PLANT_CD   || ' ]' ||
                                           ' ITEM_CD='   || '[ ' || recT_ITEM_CS_PROC_IF.ITEM_CD    || ' ]' ||
--                                         ' CS_PROC_CD='|| '[ ' || recT_ITEM_CS_PROC_IF.CS_PROC_CD || ' ]' ||
                                           ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                           ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE  excERR_MAST;
            END;  /* �i�ڕʍH��IF�E�폜 */

        END LOOP;  /* �폜(�i�ڕʍH��IF)�̌J��Ԃ�*/

        CLOSE curT_ITEM_CS_PROC_IF;

        COMMIT;  --COMMIT�͍Ō�ɂP��̂�

    END IF;  /* �폜(�i�ڕʍH��IF) */

    IF  pnumDelFlgT_PROC_COST_IF = 1 THEN  /* �폜(���H��IF) */

        BEGIN  /* �J�[�\��OPEN(���H��IF) */ 
            OPEN  curT_PROC_COST_IF(vc2CS_MAST_IF_PERIOD);
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment  :=  SUBSTR(' OPEN  curT_PROC_COST_IF '  ||
                                       ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                       ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE  excERR_MAST;
        END;  /* �J�[�\��OPEN(���H��IF) */ 

        LOOP  /* �폜(���H��IF)�̌J��Ԃ�*/

            BEGIN  /* �J�[�\��FETCH�i���H��IF�j */
                FETCH  curT_PROC_COST_IF  INTO  recT_PROC_COST_IF;
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment  :=  SUBSTR(' FETCH curT_PROC_COST_IF '  ||
                                           ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                           ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE  excERR_MAST;
            END;  /* �J�[�\��FETCH�i���H��IF�j */
    
            EXIT WHEN  curT_PROC_COST_IF%NOTFOUND;

            BEGIN  /* ���H��IF�E�폜 */
                DELETE  FROM  T_PROC_COST_IF
                   WHERE   YEAR             = recT_PROC_COST_IF.YEAR
                     AND   HALF_TERM_TYP    = recT_PROC_COST_IF.HALF_TERM_TYP
                     AND   COST_TYP         = recT_PROC_COST_IF.COST_TYP
                     AND   PLANT_CD         = recT_PROC_COST_IF.PLANT_CD
                     AND   CS_PROC_CD       = recT_PROC_COST_IF.CS_PROC_CD
                     AND   PROC_COST_CLS_CD = recT_PROC_COST_IF.PROC_COST_CLS_CD
                     AND   ITEM_CD          = recT_PROC_COST_IF.ITEM_CD
                ;
                numT_PROC_COST_IF_DELETE := numT_PROC_COST_IF_DELETE + 1; 

            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment  :=  SUBSTR(' DELETE  T_PROC_COST_IF '  ||
                                           ' YEAR='            || '[ ' || recT_PROC_COST_IF.YEAR            || ' ]' ||
                                           ' HALF_TERM_TYP='   || '[ ' || recT_PROC_COST_IF.HALF_TERM_TYP   || ' ]' ||
                                           ' COST_TYP='        || '[ ' || recT_PROC_COST_IF.COST_TYP        || ' ]' ||
                                           ' PLANT_CD='        || '[ ' || recT_PROC_COST_IF.PLANT_CD        || ' ]' ||
                                           ' ITEM_CD='         || '[ ' || recT_PROC_COST_IF.ITEM_CD         || ' ]' ||
                                           ' CS_PROC_CD='      || '[ ' || recT_PROC_COST_IF.CS_PROC_CD      || ' ]' ||
                                           ' PROC_COST_CLS_CD='|| '[ ' || recT_PROC_COST_IF.PROC_COST_CLS_CD|| ' ]' ||
                                           ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                           ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE  excERR_MAST;
            END;  /* ���H��IF�E�폜 */

        END LOOP;  /* �폜(���H��IF)�̌J��Ԃ�*/

        CLOSE curT_PROC_COST_IF;

        COMMIT;  --COMMIT�͍Ō�ɂP��̂�

    END IF;  /* �폜(���H��IF) */

    IF  pnumDelFlgT_CS_PUCH_IF = 1 THEN  /* �폜(�w���iIF) */

        BEGIN  /* �J�[�\��OPEN(�w���iIF) */ 
            OPEN  curT_CS_PUCH_IF(vc2CS_MAST_IF_PERIOD);
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment  :=  SUBSTR(' OPEN  curT_CS_PUCH_IF '  ||
                                       ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                       ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE  excERR_MAST;
        END;  /* �J�[�\��OPEN(�w���iIF) */ 

        LOOP  /* �폜(�w���iIF)�̌J��Ԃ�*/

            BEGIN  /* �J�[�\��FETCH�i�w���iIF�j */
                FETCH  curT_CS_PUCH_IF  INTO  recT_CS_PUCH_IF;
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment  :=  SUBSTR(' FETCH curT_CS_PUCH_IF '  ||
                                           ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                           ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE  excERR_MAST;
            END;  /* �J�[�\��FETCH�i�w���iIF�j */
    
            EXIT WHEN  curT_CS_PUCH_IF%NOTFOUND;

            BEGIN  /* �w���iIF�E�폜 */
                DELETE  FROM  T_CS_PUCH_IF
                   WHERE   YEAR               =  recT_CS_PUCH_IF.YEAR
                     AND   HALF_TERM_TYP      =  recT_CS_PUCH_IF.HALF_TERM_TYP
                     AND   COST_TYP           =  recT_CS_PUCH_IF.COST_TYP
                     AND   PLANT_CD           =  recT_CS_PUCH_IF.PLANT_CD
                     AND   ITEM_CD            =  recT_CS_PUCH_IF.ITEM_CD
                     AND   CS_PROC_CD         =  recT_CS_PUCH_IF.CS_PROC_CD
                     AND   VEND_CD            =  recT_CS_PUCH_IF.VEND_CD
                     AND   EFF_PHASE_IN_DATE  =  recT_CS_PUCH_IF.EFF_PHASE_IN_DATE
                ;
                numT_CS_PUCH_IF_DELETE := numT_CS_PUCH_IF_DELETE + 1; 

            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment  :=  SUBSTR(' DELETE  T_CS_PUCH_IF '  ||
                                           ' YEAR='             || '[ ' || recT_CS_PUCH_IF.YEAR             || ' ]' ||
                                           ' HALF_TERM_TYP='    || '[ ' || recT_CS_PUCH_IF.HALF_TERM_TYP    || ' ]' ||
                                           ' COST_TYP='         || '[ ' || recT_CS_PUCH_IF.COST_TYP         || ' ]' ||
                                           ' PLANT_CD='         || '[ ' || recT_CS_PUCH_IF.PLANT_CD         || ' ]' ||
                                           ' ITEM_CD='          || '[ ' || recT_CS_PUCH_IF.ITEM_CD          || ' ]' ||
                                           ' CS_PROC_CD='       || '[ ' || recT_CS_PUCH_IF.CS_PROC_CD       || ' ]' ||
                                           ' VEND_CD='          || '[ ' || recT_CS_PUCH_IF.VEND_CD          || ' ]' ||
                                           ' EFF_PHASE_IN_DATE='|| '[ ' || recT_CS_PUCH_IF.EFF_PHASE_IN_DATE|| ' ]' ||
                                           ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                           ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE  excERR_MAST;
            END;  /* �w���iIF�E�폜 */

        END LOOP;  /* �폜(�w���iIF)�̌J��Ԃ�*/

        CLOSE curT_CS_PUCH_IF;

        COMMIT;  --COMMIT�͍Ō�ɂP��̂�

    END IF;  /* �폜(�w���iIF) */

/* �����̏I�� */

    /* �I�����b�Z�[�W�̏o�� */
    vc2Comment  := SUBSTR(' T_CS_PUCH_IF DELETE='     || '[ ' || numT_CS_PUCH_IF_DELETE     || ' ]' ||
                          ' T_PROC_COST_IF DELETE='   || '[ ' || numT_PROC_COST_IF_DELETE   || ' ]' ||
                          ' T_ITEM_CS_PROC_IF DELETE='|| '[ ' || numT_ITEM_CS_PROC_IF_DELETE|| ' ]',1,256);
    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                        pvc2UserId, pvc2BusinessName,
                        pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_END,
                        vc2Comment
                        );

    COMMIT;

    /* �g���[�X���O�̏o��(�I��) */
    blnRet          := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                   pvc2UserId,pvc2BusinessName,
                                   pvc2PlantCd, MY_SQL_NAME, METHOD_END);

    COMMIT;

    /* LogFile �� CLOSE */
    blnRet          := FNCLOGCLOSE(UTL_FileHandle);

    pnumReturn := STATUS_NORMAL; --����I��

--< ��O���� >---------------------------------------------------------------
EXCEPTION
    WHEN excERR_SKIP THEN    --���s�s��

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

    WHEN excERR_MAST THEN    --�J�[�\��OPEN���̂c�a�G���[

        IF curT_CS_PUCH_IF%ISOPEN = TRUE THEN
            CLOSE curT_CS_PUCH_IF;
        END IF;
        IF curT_PROC_COST_IF%ISOPEN = TRUE THEN
            CLOSE curT_PROC_COST_IF;
        END IF;
        IF curT_ITEM_CS_PROC_IF%ISOPEN = TRUE THEN
            CLOSE curT_ITEM_CS_PROC_IF;
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

    WHEN OTHERS  THEN   --���̑��̃G���[

        IF curT_CS_PUCH_IF%ISOPEN = TRUE THEN
            CLOSE curT_CS_PUCH_IF;
        END IF;
        IF curT_PROC_COST_IF%ISOPEN = TRUE THEN
            CLOSE curT_PROC_COST_IF;
        END IF;
        IF curT_ITEM_CS_PROC_IF%ISOPEN = TRUE THEN
            CLOSE curT_ITEM_CS_PROC_IF;
        END IF;

        ROLLBACK;

        /* �I�����b�Z�[�W�̏o�� */
        vc2Comment      := SUBSTR('(SBM0328) �������̑��̃G���[���������܂�������'  ||
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
