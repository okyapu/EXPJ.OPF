CREATE OR REPLACE procedure      SQLCSCALCTRNDELETE(
/*------------------------------------------------------------------------------
'
'$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/DBProj/Procedure/SqlCsCalcTrnDelete.sql,v $
'$Author: tai-yanhong $
'$Revision: 1.7 $ $Date: 2013/08/07 05:19:11 $
'                        2005.10.21 unicode�Ή��ivarchar2��4�{�j
'
'
' �@�\      : �����v�ZTRN�폜����
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
'             pnumCsCalcTrnPeriod  - (i)�����v�Z�g�����ێ�����
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
   ,pnumCsCalcTrnPeriod  IN  NUMBER          --�����v�Z�g�����ێ�����
   ,pnumReturn           OUT NUMBER          --��������
)
IS

    /* �萔�̐錾 */

    METHOD_START            VARCHAR2(20) := 'START';          --���O�p���\�b�h�J�n�錾
    METHOD_END              VARCHAR2(12) := 'End';            --���O�p���\�b�h�I���錾
    MY_SQL_NAME             VARCHAR2(120) := 'SQLCSCALCTRNDELETE'; --�o�k�^�r�p�k��

    APS_COM_BATCH_START     VARCHAR2(28) := 'DE04201';        --�o�b�`�������J�n���܂����B
    APS_COM_BATCH_END       VARCHAR2(28) := 'DE04202';        --�o�b�`�������I�����܂����B
    APS_COM_BATCH_EXP       VARCHAR2(28) := 'DE04203';        --�o�b�`�������I�����܂����B

    LOGMSG_START_PGNM       VARCHAR2(200) := '(SBM0329)�����v�ZTRN�폜�������J�n���܂���';
    LOGMSG_END_PGNM         VARCHAR2(200) := '�����v�ZTRN�폜�������I�����܂���';
    LOGMSG_EXP_PGNM         VARCHAR2(200) := '�����v�ZTRN�폜�������ُ�I�����܂���';

    STATUS_NORMAL           NUMBER        := 1;          -- ����I��
    STATUS_WARNING          NUMBER        := 2;          -- �x���I��
    STATUS_ERROR            NUMBER        := 3;          -- �ُ�I��

    /* �ϐ��̒�` */
    UTL_FileHandle          UTL_FILE.FILE_TYPE;     --�t�@�C���n���h��

    blnRet                  BOOLEAN;        --���ʊ֐��̖ߒl
    vc2Comment              VARCHAR2(1024);  --���b�Z�[�W�쐬�p
    numYear                 NUMBER(4) := 0;  -- �N�x
    numHalfTermTyp          NUMBER(2) := 0;  -- �����敪
    numCostTyp              NUMBER(2) := 0;  -- �������
    vc2PlantCd              VARCHAR2(8);     -- �H��R�[�h
    vc2RootItemCd           VARCHAR2(100);   -- �ŏ�ʕi�ڔԍ�

    numT_ITEM_COST_DELETE   NUMBER(11)   := 0;

    vc2CS_CALC_TRN_PERIOD   VARCHAR2(32);

    /* ��O�����p�ϐ� */
    excERR_SKIP       EXCEPTION;      --���s�s��
    excERR_MAST       EXCEPTION;      --�J�[�\��OPEN����EXCEPTION

    /* �J�[�\���̐錾  �i�ڕʌ���*/
    CURSOR curT_ITEM_COST(
         cvc2UpdateDate VARCHAR2
    )
    IS
      SELECT *
        FROM  T_ITEM_COST
        WHERE  COST_TYP=pnumCostTyp
          AND  PLANT_CD=pvc2PlantCd
          AND  UPPER_ITEM_FLG =1
          AND  TO_CHAR(UPDATED_DATE,'YYYYMMDD') < cvc2UpdateDate
      ;
    recT_ITEM_COST curT_ITEM_COST%ROWTYPE;
    
    CURSOR curT_ITEM_COST01(
         cvc2UpdateDate VARCHAR2,
         vc2RootItemCd    VARCHAR2
    )
    IS
      SELECT YEAR,
             HALF_TERM_TYP,
             COST_TYP,
             PLANT_CD,
             ITEM_CD
        FROM  T_ITEM_COST
        WHERE  COST_TYP=pnumCostTyp
          AND  PLANT_CD=pvc2PlantCd
          AND  ROOT_ITEM_CD = vc2RootItemCd
          AND  TO_CHAR(UPDATED_DATE,'YYYYMMDD') < cvc2UpdateDate
      ;
    recT_ITEM_COST01 curT_ITEM_COST01%ROWTYPE;
    
    /* �J�[�\���̐錾  �i�ڕʉ��H��*/
    CURSOR curT_ITEM_PROC_COST(
         numYear          NUMBER,
         numHalfTermTyp   NUMBER,
         numCostTyp       NUMBER,
         vc2PlantCd       VARCHAR2,
         vc2RootItemCd    VARCHAR2
    )
    IS
      SELECT YEAR,
             HALF_TERM_TYP,
             COST_TYP,
             PLANT_CD,
             ITEM_CD,
             PROC_COST_CLS_CD
        FROM  T_ITEM_PROC_COST
        WHERE  YEAR           = numYear
         AND   HALF_TERM_TYP  = numHalfTermTyp
         AND   COST_TYP       = numCostTyp
         AND   PLANT_CD       = vc2PlantCd
         AND   ROOT_ITEM_CD   = vc2RootItemCd
      ;
    recT_ITEM_PROC_COST curT_ITEM_PROC_COST%ROWTYPE;

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
    numT_ITEM_COST_DELETE := 0;

    vc2CS_CALC_TRN_PERIOD  := TO_CHAR(TO_NUMBER(TO_CHAR(SYSDATE,'YYYY')) - pnumCsCalcTrnPeriod,'FM0000')||'0101';

    BEGIN  /* �J�[�\��OPEN(�i�ڕʌ���) */ 
        OPEN  curT_ITEM_COST(vc2CS_CALC_TRN_PERIOD);
    EXCEPTION
        WHEN OTHERS THEN
            vc2Comment  :=  SUBSTR('OPEN curT_ITEM_COST '  ||
                                   ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                   ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
            RAISE  excERR_MAST;
    END;  /* �J�[�\��OPEN(�i�ڕʌ���) */ 

    LOOP  /* �폜(�i�ڕʌ���)�̌J��Ԃ�*/

        BEGIN  /* �J�[�\��FETCH�i�i�ڕʌ����j */
            FETCH  curT_ITEM_COST  INTO  recT_ITEM_COST;
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment  :=  SUBSTR('FETCH curT_ITEM_COST '  ||
                                       ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                       ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE  excERR_MAST;
        END;  /* �J�[�\��FETCH�i�i�ڕʌ����j */
    
        EXIT WHEN  curT_ITEM_COST%NOTFOUND;
        
        
        BEGIN  /* �J�[�\��OPEN(�i�ڕʉ��H��) */ 
            OPEN  curT_ITEM_PROC_COST(recT_ITEM_COST.YEAR,
                                      recT_ITEM_COST.HALF_TERM_TYP,
                                      recT_ITEM_COST.COST_TYP,
                                      recT_ITEM_COST.PLANT_CD,
                                      recT_ITEM_COST.ROOT_ITEM_CD);
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment  :=  SUBSTR('OPEN curT_ITEM_PROC_COST '  ||
                                       ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                       ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE  excERR_MAST;
        END;  /* �J�[�\��OPEN(�i�ڕʉ��H��) */ 
        
        BEGIN  /* �J�[�\��OPEN(�i�ڕʌ���) */ 
            OPEN  curT_ITEM_COST01(vc2CS_CALC_TRN_PERIOD,recT_ITEM_COST.ROOT_ITEM_CD);
        EXCEPTION
        WHEN OTHERS THEN
            vc2Comment  :=  SUBSTR('OPEN curT_ITEM_COST01 '  ||
                                   ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                   ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
            RAISE  excERR_MAST;
        END;  /* �J�[�\��OPEN(�i�ڕʌ���) */ 
        
        BEGIN  /* �i�ڕʌ����E�폜 */
            DELETE  FROM  T_ITEM_COST
               WHERE   YEAR           = recT_ITEM_COST.YEAR
                 AND   HALF_TERM_TYP  = recT_ITEM_COST.HALF_TERM_TYP
                 AND   COST_TYP       = recT_ITEM_COST.COST_TYP
                 AND   PLANT_CD       = recT_ITEM_COST.PLANT_CD
                 AND   ROOT_ITEM_CD   = recT_ITEM_COST.ROOT_ITEM_CD
            ;
            /* �i�ڕʉ��H��E�폜 */
            DELETE  FROM  T_ITEM_PROC_COST
                WHERE  YEAR           = recT_ITEM_COST.YEAR
                 AND   HALF_TERM_TYP  = recT_ITEM_COST.HALF_TERM_TYP
                 AND   COST_TYP       = recT_ITEM_COST.COST_TYP
                 AND   PLANT_CD       = recT_ITEM_COST.PLANT_CD
                 AND   ROOT_ITEM_CD   = recT_ITEM_COST.ROOT_ITEM_CD
            ;
            numT_ITEM_COST_DELETE := numT_ITEM_COST_DELETE + 1; 

        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment  :=  SUBSTR('DELETE  T_ITEM_COST '  ||
                                       ' YEAR='         || '[ ' || recT_ITEM_COST.YEAR          || ' ]' ||
                                       ' HALF_TERM_TYP='|| '[ ' || recT_ITEM_COST.HALF_TERM_TYP || ' ]' ||
                                       ' COST_TYP='     || '[ ' || recT_ITEM_COST.COST_TYP      || ' ]' ||
                                       ' PLANT_CD='     || '[ ' || recT_ITEM_COST.PLANT_CD      || ' ]' ||
                                       ' ROOT_ITEM_CD=' || '[ ' || recT_ITEM_COST.ITEM_CD       || ' ]' ||
                                       ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                       ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE  excERR_MAST;
        END;  /* �i�ڕʌ����E�폜 */
        
        LOOP
            BEGIN
                FETCH curT_ITEM_COST01 INTO recT_ITEM_COST01;
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment  :=  SUBSTR('FETCH curT_ITEM_COST01 '  ||
                                           ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                           ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE  excERR_MAST;
            END;  /* �J�[�\��FETCH�i�i�ڕʌ����j */
            EXIT WHEN  curT_ITEM_COST01%NOTFOUND;
            BEGIN
                /* �݌ɕ]�����z�E�폜 */
                DELETE  FROM  T_STOCK_VAL_H
                WHERE  YEAR           = recT_ITEM_COST01.YEAR
                 AND   HALF_TERM_TYP  = recT_ITEM_COST01.HALF_TERM_TYP
                 AND   COST_TYP       = recT_ITEM_COST01.COST_TYP
                 AND   PLANT_CD       = recT_ITEM_COST01.PLANT_CD
                 AND   ITEM_CD        = recT_ITEM_COST01.ITEM_CD
            ;
            EXCEPTION
                WHEN OTHERS THEN
                vc2Comment  :=  SUBSTR('DELETE  T_STOCK_VAL_H '  ||
                                       ' YEAR='            || '[ ' || recT_ITEM_COST01.YEAR          || ' ]' ||
                                       ' HALF_TERM_TYP='   || '[ ' || recT_ITEM_COST01.HALF_TERM_TYP || ' ]' ||
                                       ' COST_TYP='        || '[ ' || recT_ITEM_COST01.COST_TYP      || ' ]' ||
                                       ' PLANT_CD='        || '[ ' || recT_ITEM_COST01.PLANT_CD      || ' ]' ||
                                       ' ITEM_CD='         || '[ ' || recT_ITEM_COST01.ITEM_CD       || ' ]' ||
                                       ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                       ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE  excERR_MAST;
            END;  /* �݌ɕ]�����z�E�폜 */
            
        END LOOP;  /* �폜(�i�ڕʌ���)�̌J��Ԃ�*/
        
        CLOSE curT_ITEM_COST01;
                
        LOOP  /* �폜(�i�ڕʉ��H��)�̌J��Ԃ�*/

            BEGIN  /* �J�[�\��FETCH�i�i�ڕʉ��H��j */
                FETCH  curT_ITEM_PROC_COST  INTO  recT_ITEM_PROC_COST;
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment  :=  SUBSTR('FETCH curT_ITEM_PROC_COST '  ||
                                           ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                           ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE  excERR_MAST;
            END;  /* �J�[�\��FETCH�i�i�ڕʉ��H��j */
    
            EXIT WHEN  curT_ITEM_PROC_COST%NOTFOUND;
            
            BEGIN  /* �݌ɕ]�����z���ׁE�폜 */
                DELETE  FROM  T_STOCK_VAL
                WHERE  YEAR             = recT_ITEM_PROC_COST.YEAR
                 AND   HALF_TERM_TYP    = recT_ITEM_PROC_COST.HALF_TERM_TYP
                 AND   COST_TYP         = recT_ITEM_PROC_COST.COST_TYP
                 AND   PLANT_CD         = recT_ITEM_PROC_COST.PLANT_CD
                 AND   ITEM_CD          = recT_ITEM_PROC_COST.ITEM_CD
                 AND   PROC_COST_CLS_CD = recT_ITEM_PROC_COST.PROC_COST_CLS_CD
            ;
            EXCEPTION
            WHEN OTHERS THEN
                vc2Comment  :=  SUBSTR('DELETE  T_STOCK_VAL '  ||
                                       ' YEAR='            || '[ ' || recT_ITEM_PROC_COST.YEAR          || ' ]' ||
                                       ' HALF_TERM_TYP='   || '[ ' || recT_ITEM_PROC_COST.HALF_TERM_TYP || ' ]' ||
                                       ' COST_TYP='        || '[ ' || recT_ITEM_PROC_COST.COST_TYP      || ' ]' ||
                                       ' PLANT_CD='        || '[ ' || recT_ITEM_PROC_COST.PLANT_CD      || ' ]' ||
                                       ' ITEM_CD='         || '[ ' || recT_ITEM_PROC_COST.ITEM_CD       || ' ]' ||
                                       ' PROC_COST_CLS_CD='|| '[ ' || recT_ITEM_PROC_COST.PROC_COST_CLS_CD   || ' ]' ||
                                       ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                       ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE  excERR_MAST;
            END;  /* �݌ɕ]�����z���ׁE�폜 */
            
        END LOOP;  /* �폜(�i�ڕʉ��H��)�̌J��Ԃ�*/
        
        CLOSE curT_ITEM_PROC_COST;
        
    END LOOP;  /* �폜(�i�ڕʌ���)�̌J��Ԃ�*/

    CLOSE curT_ITEM_COST;

    COMMIT;  --COMMIT�͍Ō�ɂP��̂�

/* �����̏I�� */

    /* �I�����b�Z�[�W�̏o�� */
    vc2Comment  := SUBSTR(' T_ITEM_COST DELETE=' || '[ ' || numT_ITEM_COST_DELETE || ' ]',1,256);
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

        IF curT_ITEM_COST%ISOPEN = TRUE THEN
            CLOSE curT_ITEM_COST;
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

        IF curT_ITEM_COST%ISOPEN = TRUE THEN
            CLOSE curT_ITEM_COST;
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
