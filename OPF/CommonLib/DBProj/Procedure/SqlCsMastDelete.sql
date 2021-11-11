CREATE OR REPLACE procedure      SQLCSMASTDELETE(
/*------------------------------------------------------------------------------
'
'$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/DBProj/Procedure/SqlCsMastDelete.sql,v $
'$Author: feng-yi $
'$Revision: 1.5 $ $Date: 2011/12/23 03:19:47 $
'                        2005.10.21 unicode�Ή��ivarchar2��4�{�j
'
'
' �@�\      : ��������폜����
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
'             pnumDelFlgM_CS_PROC    - (i)�폜�Ώۃt���O(�H���l)
'             pnumDelFlgM_PROC_COST  - (i)�폜�Ώۃt���O(���H��l)
'             pnumDelFlgM_CS_PUCH    - (i)�폜�Ώۃt���O(�w���i�l)
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
   ,pnumDelFlgM_CS_PROC    IN  NUMBER          --�폜�Ώۃt���O(�H���l)
   ,pnumDelFlgM_PROC_COST  IN  NUMBER          --�폜�Ώۃt���O(���H��l)
   ,pnumDelFlgM_CS_PUCH    IN  NUMBER          --�폜�Ώۃt���O(�w���i�l)
   ,pnumReturn           OUT NUMBER          --��������
)
IS

    /* �萔�̐錾 */

    METHOD_START            VARCHAR2(20) := 'START';          --���O�p���\�b�h�J�n�錾
    METHOD_END              VARCHAR2(12) := 'End';            --���O�p���\�b�h�I���錾
    MY_SQL_NAME             VARCHAR2(120) := 'SQLCSMASTDELETE'; --�o�k�^�r�p�k��

    APS_COM_BATCH_START     VARCHAR2(28) := 'DE02202';
    APS_COM_BATCH_END       VARCHAR2(28) := 'DE02203';
    APS_COM_BATCH_EXP       VARCHAR2(28) := 'DE02204';

    LOGMSG_START_PGNM       VARCHAR2(200) := '(SBM0330)��������폜�������J�n���܂���';
    LOGMSG_END_PGNM         VARCHAR2(200) := '��������폜�������I�����܂���';
    LOGMSG_EXP_PGNM         VARCHAR2(200) := '��������폜�������ُ�I�����܂���';

    STATUS_NORMAL           NUMBER        := 1;          -- ����I��
    STATUS_WARNING          NUMBER        := 2;          -- �x���I��
    STATUS_ERROR            NUMBER        := 3;          -- �ُ�I��

    /* �ϐ��̒�` */
    UTL_FileHandle          UTL_FILE.FILE_TYPE;     --�t�@�C���n���h��

    numM_CS_PUCH_DELETE     NUMBER(11)   := 0;           --����f�[�^����
    numM_PROC_COST_DELETE   NUMBER(11)   := 0;           --����f�[�^����
    numM_CS_PROC_DELETE     NUMBER(11)   := 0;           --����f�[�^����
    blnRet                  BOOLEAN;        --���ʊ֐��̖ߒl
    vc2Comment              VARCHAR2(1024);  --���b�Z�[�W�쐬�p

    vc2M_CS_PROC_PERIOD     VARCHAR2(32);
    vc2M_PROC_COST_PERIOD   VARCHAR2(32);
    vc2M_CS_PUCH_PERIOD     VARCHAR2(32);

    /* �����Ǘ��p�����[�^����̎擾���� */
    numM_CS_PROC_PERIOD     SYS_COST_CTRL.M_CS_PROC_PERIOD  %TYPE;
    numM_PROC_COST_PERIOD   SYS_COST_CTRL.M_PROC_COST_PERIOD%TYPE;
    numM_CS_PUCH_PERIOD     SYS_COST_CTRL.M_CS_PUCH_PERIOD  %TYPE;

    /* ��O�����p�ϐ� */
    excERR_SKIP       EXCEPTION;      --���s�s��
    excERR_MAST       EXCEPTION;      --�J�[�\��OPEN����EXCEPTION

    /* �J�[�\���̐錾  �w���iM*/
    CURSOR curM_CS_PUCH(
         cvc2UpdateDate VARCHAR2
    )
    IS
      SELECT *
        FROM  M_CS_PUCH
        WHERE  PLANT_CD=pvc2PlantCd
          AND  DEL_FLG =1
          AND  TO_CHAR(UPDATED_DATE,'YYYYMMDD') < cvc2UpdateDate
      ;
    recM_CS_PUCH curM_CS_PUCH%ROWTYPE;

    /* �J�[�\���̐錾  ���H��M*/
    CURSOR curM_PROC_COST(
         cvc2UpdateDate VARCHAR2
    )
    IS
      SELECT *
        FROM  M_PROC_COST
        WHERE  PLANT_CD=pvc2PlantCd
          AND  DEL_FLG =1
          AND  TO_CHAR(UPDATED_DATE,'YYYYMMDD') < cvc2UpdateDate
      ;
    recM_PROC_COST  curM_PROC_COST%ROWTYPE;

    /* �J�[�\���̐錾  �H��M*/
    CURSOR curM_CS_PROC(
         cvc2UpdateDate VARCHAR2
    )
    IS
      SELECT *
        FROM  M_CS_PROC
        WHERE  PLANT_CD=pvc2PlantCd
          AND  DEL_FLG =1
          AND  TO_CHAR(UPDATED_DATE,'YYYYMMDD') < cvc2UpdateDate
      ;
    recM_CS_PROC curM_CS_PROC%ROWTYPE;

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
    numM_CS_PUCH_DELETE   := 0;
    numM_PROC_COST_DELETE := 0;
    numM_CS_PROC_DELETE   := 0;

    /*  �����Ǘ��p�����[�^�̓Ǎ� */ 
    BEGIN
        SELECT  M_CS_PROC_PERIOD,M_PROC_COST_PERIOD,M_CS_PUCH_PERIOD  
          INTO  numM_CS_PROC_PERIOD,numM_PROC_COST_PERIOD,numM_CS_PUCH_PERIOD
          FROM  SYS_COST_CTRL
          WHERE  PLANT_CD  =  pvc2PlantCd;
    EXCEPTION
        WHEN OTHERS THEN
            vc2Comment      := SUBSTR('(SBM0535)�����Ǘ��p�����[�^�����݂��܂���B'  ||
                                      '�@USER_CD�F' || '[ ' || pvc2UserId || ' ]' ||
                                      '�@PLANT_CD�F' || '[ ' || pvc2PlantCd || ' ]',1,256);
            RAISE   excERR_SKIP;  
    END;

    vc2M_CS_PROC_PERIOD   := TO_CHAR(ADD_MONTHS(SYSDATE,numM_CS_PROC_PERIOD  *-1),'YYYYMM')||'01';
    vc2M_PROC_COST_PERIOD := TO_CHAR(ADD_MONTHS(SYSDATE,numM_PROC_COST_PERIOD*-1),'YYYYMM')||'01';
    vc2M_CS_PUCH_PERIOD   := TO_CHAR(ADD_MONTHS(SYSDATE,numM_CS_PUCH_PERIOD  *-1),'YYYYMM')||'01';

    IF  pnumDelFlgM_CS_PUCH = 1 THEN  /* �폜(�w���i�l) */

        BEGIN  /* �J�[�\��OPEN(�w���i�l) */ 
            OPEN  curM_CS_PUCH(vc2M_CS_PUCH_PERIOD);
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment  :=  SUBSTR(' OPEN curM_CS_PUCH'  ||
                                       ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                       ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE  excERR_MAST;
        END;  /* �J�[�\��OPEN(�w���i�l) */ 

        LOOP  /* �폜(�w���i�l)�̌J��Ԃ�*/

            BEGIN  /* �J�[�\��FETCH�i�w���i�l�j */
                FETCH  curM_CS_PUCH  INTO  recM_CS_PUCH;
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment  :=  SUBSTR(' FETCH curM_CS_PUCH'  ||
                                           ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                           ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE  excERR_MAST;
            END;  /* �J�[�\��FETCH�i�w���i�l�j */
    
            EXIT WHEN  curM_CS_PUCH%NOTFOUND;

            BEGIN  /* �w���i�l�E�폜 */
                DELETE  FROM  M_CS_PUCH
                   WHERE   YEAR          =  recM_CS_PUCH.YEAR
                     AND   HALF_TERM_TYP =  recM_CS_PUCH.HALF_TERM_TYP
                     AND   COST_TYP      =  recM_CS_PUCH.COST_TYP
                     AND   PLANT_CD      =  recM_CS_PUCH.PLANT_CD
                     AND   ITEM_CD       =  recM_CS_PUCH.ITEM_CD
--                   AND   CS_PROC_CD    =  recM_CS_PUCH.CS_PROC_CD
                ;
                numM_CS_PUCH_DELETE := numM_CS_PUCH_DELETE + 1; 

            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment  :=  SUBSTR(' DELETE  M_CS_PUCH'  ||
                                           ' YEAR='         || '[ ' || recM_CS_PUCH.YEAR          || ' ]' ||
                                           ' HALF_TERM_TYP='|| '[ ' || recM_CS_PUCH.HALF_TERM_TYP || ' ]' ||
                                           ' COST_TYP='     || '[ ' || recM_CS_PUCH.COST_TYP      || ' ]' ||
                                           ' PLANT_CD='     || '[ ' || recM_CS_PUCH.PLANT_CD      || ' ]' ||
                                           ' ITEM_CD='      || '[ ' || recM_CS_PUCH.ITEM_CD       || ' ]' ||
--                                         ' CS_PROC_CD='   || '[ ' || recM_CS_PUCH.CS_PROC_CD    || ' ]' ||
                                           ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                           ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE  excERR_MAST;
            END;  /* �w���i�l�E�폜 */

        END LOOP;  /* �폜(�w���i�l)�̌J��Ԃ�*/

        CLOSE curM_CS_PUCH;

        COMMIT;  --COMMIT�͍Ō�ɂP��̂�

    END IF;  /* �폜(�w���i�l) */

    IF  pnumDelFlgM_PROC_COST = 1 THEN  /* �폜(���H��l) */

        BEGIN  /* �J�[�\��OPEN(���H��l) */ 
            OPEN  curM_PROC_COST(vc2M_PROC_COST_PERIOD);
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment  :=  SUBSTR(' OPEN curM_PROC_COST'  ||
                                       ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                       ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE  excERR_MAST;
        END;  /* �J�[�\��OPEN(���H��l) */ 

        LOOP  /* �폜(���H��l)�̌J��Ԃ�*/

            BEGIN  /* �J�[�\��FETCH�i���H��l�j */
                FETCH  curM_PROC_COST  INTO  recM_PROC_COST;
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment  :=  SUBSTR(' FETCH curM_PROC_COST '  ||
                                           ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                           ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE  excERR_MAST;
            END;  /* �J�[�\��FETCH�i���H��l�j */
    
            EXIT WHEN  curM_PROC_COST%NOTFOUND;

            BEGIN  /* ���H��l�E�폜 */
                DELETE  FROM  M_PROC_COST
                   WHERE   YEAR             = recM_PROC_COST.YEAR
                     AND   HALF_TERM_TYP    = recM_PROC_COST.HALF_TERM_TYP
                     AND   COST_TYP         = recM_PROC_COST.COST_TYP
                     AND   PLANT_CD         = recM_PROC_COST.PLANT_CD
                     AND   CS_PROC_CD       = recM_PROC_COST.CS_PROC_CD
                     AND   PROC_COST_CLS_CD = recM_PROC_COST.PROC_COST_CLS_CD
                ;
                DELETE  FROM  M_ITEM_PROC_COST
                   WHERE   PLANT_CD         = recM_PROC_COST.PLANT_CD
                     AND   CS_PROC_CD       = recM_PROC_COST.CS_PROC_CD
                     AND   PROC_COST_CLS_CD = recM_PROC_COST.PROC_COST_CLS_CD
                ;
                numM_PROC_COST_DELETE := numM_PROC_COST_DELETE + 1; 

            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment  :=  SUBSTR(' DELETE  M_PROC_COST '  ||
                                           ' YEAR='            || '[ ' || recM_PROC_COST.YEAR            || ' ]' ||
                                           ' HALF_TERM_TYP='   || '[ ' || recM_PROC_COST.HALF_TERM_TYP   || ' ]' ||
                                           ' COST_TYP='        || '[ ' || recM_PROC_COST.COST_TYP        || ' ]' ||
                                           ' PLANT_CD='        || '[ ' || recM_PROC_COST.PLANT_CD        || ' ]' ||
                                           ' CS_PROC_CD='      || '[ ' || recM_PROC_COST.CS_PROC_CD      || ' ]' ||
                                           ' PROC_COST_CLS_CD='|| '[ ' || recM_PROC_COST.PROC_COST_CLS_CD|| ' ]' ||
                                           ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                           ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE  excERR_MAST;
            END;  /* ���H��l�E�폜 */

        END LOOP;  /* �폜(���H��l)�̌J��Ԃ�*/

        CLOSE curM_PROC_COST;

        COMMIT;  --COMMIT�͍Ō�ɂP��̂�

    END IF;  /* �폜(���H��l) */

    IF  pnumDelFlgM_CS_PROC = 1 THEN  /* �폜(�H���l) */

        BEGIN  /* �J�[�\��OPEN(�H���l) */ 
            OPEN  curM_CS_PROC(vc2M_CS_PROC_PERIOD);
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment  :=  SUBSTR(' OPEN curM_CS_PROC '  ||
                                       ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                       ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE  excERR_MAST;
        END;  /* �J�[�\��OPEN(�H���l) */ 

        LOOP  /* �폜(�H���l)�̌J��Ԃ�*/

            BEGIN  /* �J�[�\��FETCH�i�H���l�j */
                FETCH  curM_CS_PROC  INTO  recM_CS_PROC;
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment  :=  SUBSTR(' FETCH curM_CS_PROC '  ||
                                           ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                           ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE  excERR_MAST;
            END;  /* �J�[�\��FETCH�i�H���l�j */
    
            EXIT WHEN  curM_CS_PROC%NOTFOUND;

            BEGIN  /* �H���l�E�폜 */
                DELETE  FROM  M_CS_PROC
                   WHERE   PLANT_CD         = recM_CS_PROC.PLANT_CD
                     AND   CS_PROC_CD       = recM_CS_PROC.CS_PROC_CD
                ;
                numM_CS_PROC_DELETE := numM_CS_PROC_DELETE + 1; 

            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment  :=  SUBSTR(' DELETE  M_CS_PROC '  ||
                                           ' PLANT_CD='   || '[ ' || recM_CS_PROC.PLANT_CD || ' ]' ||
                                           ' CS_PROC_CD=' || '[ ' || recM_CS_PROC.CS_PROC_CD || ' ]' ||
                                           ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                           ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE  excERR_MAST;
            END;  /* �H���l�E�폜 */

        END LOOP;  /* �폜(�H���l)�̌J��Ԃ�*/

        CLOSE curM_CS_PROC;

        COMMIT;  --COMMIT�͍Ō�ɂP��̂�

    END IF;  /* �폜(�H���l) */

/* �����̏I�� */

    /* �I�����b�Z�[�W�̏o�� */
    vc2Comment  := SUBSTR(' M_CS_PUCH DELETE='   || '[ ' || numM_CS_PUCH_DELETE   || ' ]' ||
                          ' M_PROC_COST DELETE=' || '[ ' || numM_PROC_COST_DELETE || ' ]' ||
                          ' M_CS_PROC DELETE='   || '[ ' || numM_CS_PROC_DELETE   || ' ]',1,256);
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

        IF curM_CS_PUCH%ISOPEN = TRUE THEN
            CLOSE curM_CS_PUCH;
        END IF;
        IF curM_PROC_COST%ISOPEN = TRUE THEN
            CLOSE curM_PROC_COST;
        END IF;
        IF curM_CS_PROC%ISOPEN = TRUE THEN
            CLOSE curM_CS_PROC;
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

        IF curM_CS_PUCH%ISOPEN = TRUE THEN
            CLOSE curM_CS_PUCH;
        END IF;
        IF curM_PROC_COST%ISOPEN = TRUE THEN
            CLOSE curM_PROC_COST;
        END IF;
        IF curM_CS_PROC%ISOPEN = TRUE THEN
            CLOSE curM_CS_PROC;
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