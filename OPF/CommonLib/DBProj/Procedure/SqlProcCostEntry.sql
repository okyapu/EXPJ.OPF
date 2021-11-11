CREATE OR REPLACE PROCEDURE SqlProcCostEntry(
/*------------------------------------------------------------------------------
' Copyright (c) 2003-2004 NEC Corporation
' Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
' $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/DBProj/Procedure/SqlProcCostEntry.sql,v $
' $Author: tai-yanhong $
' $Revision: 1.8 $�@$Date: 2012/08/06 08:54:12 $
'
' �C������
' 2005.12.12 �V�K�쐬
'
' �@�\      : ���H����ꊇ�o�^
'
' ������    : pvc2LogMode           - (i)�k�n�f���[�h
'             pvc2OutputMode        - (i)�o�̓��[�h
'             pvc2OutputPath        - (i)�o�̓t�@�C���p�X
'             pvc2OutputName        - (i)�o�̓t�@�C����
'             pvc2UserId            - (i)���[�U�h�c
'             pvc2BusinessName      - (i)�Ɩ���
'             pvc2PlantCd           - (i)�H��R�[�h
'             pvc2Year              - (i)�Ώ۔N�x
'             pvc2HalfTermTyp       - (i)�����敪
'             pvc2CostTyp           - (i)�������
'             pvc2BatchTyp          - (i)�o�b�`�����敪
'
'
' �@�\����  :���H��C���^�t�F�[�X����ɁA�i�ڕʉ��H��}�X�^�ƁA���H��}�X�^��
'            �쐬����B
'
' ���l      :
'
------------------------------------------------------------------------------*/
    pvc2LogMode           VARCHAR2    --�k�n�f���[�h
   ,pvc2OutputMode        VARCHAR2    --�o�̓��[�h
   ,pvc2OutputPath        VARCHAR2    --�o�̓p�X
   ,pvc2OutputName        VARCHAR2    --�o�̓t�@�C����
   ,pvc2UserId            VARCHAR2    --���[�U�h�c
   ,pvc2BusinessName      VARCHAR2    --�Ɩ���
   ,pvc2PlantCd           VARCHAR2    --�H��R�[�h
   ,pvc2TargetPlantCd     VARCHAR2    --�����ΏۍH��R�[�h
   ,pvc2Year              VARCHAR2    --�Ώ۔N�x(YYYY�`��)
   ,pvc2HalfTermTyp       VARCHAR2    --�����敪(1:���, 2����)
   ,pvc2CostTyp           VARCHAR2    --�������(1:�W������, 2�F���ی���)
   ,pvc2BatchTyp          VARCHAR2    --�o�b�`�����敪(1:��ԃo�b�`, 2:�}�j���A��)
)
IS
    
    --��O�̐錾
    excERR_PROC_COST_IF             EXCEPTION;    --���H��C���^�t�F�[�X�G���[
    
    --�萔
    MY_SQL_NAME                     VARCHAR2(64) := 'SqlProcCostEntry';
    FIRST_MODIFY_COUNT              NUMBER       := 0;   --�V�K�쐬�e�[�u���̏���̍X�V��
    METHOD_START                    VARCHAR2(20) := 'Start';          --���O�p���\�b�h�J�n�錾
    METHOD_END                      VARCHAR2(12) := 'End';            --���O�p���\�b�h�I���錾
    LOGMSG_START_PGNM               VARCHAR2(128) := '<< ���H����ꊇ�o�^�����J�n >>';
    LOGMSG_END_PGNM                 VARCHAR2(128) := '<< ���H����ꊇ�o�^�����I�� >>';
    
    APS_COM_BATCH_START             VARCHAR2(28) := 'ZZ09001';        --�o�b�`�������J�n���܂����B
    APS_COM_BATCH_END               VARCHAR2(28) := 'ZZ09002';        --�o�b�`�������I�����܂����B
    
    --�ϐ��錾
    UTL_FileHandle                  UTL_FILE.FILE_TYPE;     --�t�@�C���n���h��
    vc2Comment                      VARCHAR2(1024);  --���b�Z�[�W�쐬�p
    
    --���H��C���^�t�F�[�X�Ǎ��p
    numYear                         NUMBER(4);
    numHalfTermTyp                  NUMBER(2);
    numCostTyp                      NUMBER(2);
    vc2PlantCd                      VARCHAR2(8);
    vc2CsProcCd                     VARCHAR2(100);
    vc2ProcCostClsCd                VARCHAR2(100);
    vc2ItemCd                       VARCHAR2(100);
    numProcCostUnitQty              NUMBER(18, 4);
    vc2StockUnit                    VARCHAR2(48);
    numProcCost01                   NUMBER(18, 4);
    numProcCost02                   NUMBER(18, 4);
    numProcCost03                   NUMBER(18, 4);
    numProcCost04                   NUMBER(18, 4);
    numProcCost05                   NUMBER(18, 4);
    numProcCost06                   NUMBER(18, 4);
    numProcCost07                   NUMBER(18, 4);
    numProcCost08                   NUMBER(18, 4);
    numProcCost09                   NUMBER(18, 4);
    numProcCost10                   NUMBER(18, 4);
    numProcCost11                   NUMBER(18, 4);
    numProcCost12                   NUMBER(18, 4);
    vc2ClasificationCd              VARCHAR2(100);
    vc2CompanyCd                    VARCHAR2(100);
    vc2OrgCd                        VARCHAR2(100);
    dtmSaveUpdatedDate              DATE;
    numTransactionTyp               NUMBER(2);
    numUpdFlg                       NUMBER(1);
    
    --�i�ړǍ��p
    vc2ItemCd_Item                  VARCHAR2(100);
    
    --�H���}�X�^�Ǎ��p
    vc2OrgCd_CsProc                 VARCHAR2(100);
    
    --���H��}�X�^�Ǎ��p
    numUpdateTyp                    NUMBER(2);
    
    --�i�ڕʉ��H��}�X�^
    vc2ProcCostClsCd_ItemProcCost   VARCHAR2(100);
    vc2CsProcCd_ItemProcCost        VARCHAR2(100);
    
    --�����Ǘ��p�����[�^
    numMProcCostPriorityTyp         NUMBER(2);
    
    --�����ꊇ�o�^�G���[�ԍ�
    vc2CsErrorCd                    VARCHAR2(80);
    
    --�ꎞ�ϐ�
    vc2Tmp                          VARCHAR2(100);
    
    intProcCostIFName               INTEGER;        --���H��IF�J�[�\���h�c
    intRet                          INTEGER;        --�֐��߂�l
    vc2Sql                          VARCHAR2(4096); --���I�r�p�k�p
    
    --���H��v
    numProcCostSum                  NUMBER;
    
    numReadCount                    NUMBER := 0;    --�Ǎ�����
    numNormalCount                  NUMBER := 0;    --����f�[�^����
    numErrCnt                       NUMBER := 0;    --���[�j���O����
    vc2MesssageCode                 VARCHAR2(32);    --���b�Z�[�W�R�[�h
    blnRet                          BOOLEAN;
    
    
    --�J�[�\���錾
    --���H��C���^�t�F�[�X
    CURSOR curT_PROC_COST_IF(
         cvc2Year         VARCHAR2
        ,cvc2HalfTermTyp  VARCHAR2
        ,cvc2CostTyp      VARCHAR2
        ,cvc2PlantCd      VARCHAR2
    )
    IS
        SELECT 
            YEAR
        FROM 
            T_PROC_COST_IF
        WHERE 
            YEAR = TO_NUMBER(cvc2Year)
            AND HALF_TERM_TYP = cvc2Year
            AND COST_TYP = cvc2CostTyp
            AND PLANT_CD = cvc2PlantCd
            AND UPD_FLG = 0
        ORDER BY 
            PLANT_CD ASC,
            CS_PROC_CD ASC,
            PROC_COST_CLS_CD ASC;
    
    --�i��
    CURSOR curM_ITEM(
        cvc2ItemCd  VARCHAR2
    )
    IS
        SELECT
            1
        FROM
            M_ITEM
        WHERE
            ITEM_CD = cvc2ItemCd
            AND ITEM_CD <> '*';
    
    --�H���}�X�^
    CURSOR curM_CS_PROC(
         cvc2PlantCd   VARCHAR2
        ,cvc2CsProcCd  VARCHAR2
    )
    IS
        SELECT
            ORG_CD
        FROM
            M_CS_PROC
        WHERE
            PLANT_CD = cvc2PlantCd
            AND CS_PROC_CD = cvc2CsProcCd;
    
    --���H��ރ}�X�^
    CURSOR curM_PROC_COST_CLS(
        cvc2ProcCostClsCd  VARCHAR2
    ) 
    IS
        SELECT
            1
        FROM
            M_PROC_COST_CLS
        WHERE
            PROC_COST_CLS_CD = cvc2ProcCostClsCd;
    
    --���H��}�X�^
    CURSOR curM_PROC_COST(
         cnumYear               NUMBER
        ,cnumHalfTermTyp        NUMBER
        ,cnumCostTyp            NUMBER
        ,cvc2PlantCd            VARCHAR2
        ,cvc2CsProcCd           VARCHAR2
        ,cvc2ProcCostClsCd      VARCHAR2
    )
    IS
        SELECT
            UPDATE_TYP
        FROM
            M_PROC_COST
        WHERE
            YEAR = cnumYear
            AND HALF_TERM_TYP = cnumHalfTermTyp
            AND COST_TYP = cnumCostTyp
            AND PLANT_CD = cvc2PlantCd
            AND CS_PROC_CD = cvc2CsProcCd
            AND PROC_COST_CLS_CD = cvc2ProcCostClsCd;
    /*
    --�i�ڕʉ��H��}�X�^
    CURSOR curM_ITEM_PROC_COST(
         cvc2PlantCd            VARCHAR2
        ,cvc2ItemCd             VARCHAR2
    ) 
    IS 
        SELECT
            PROC_COST_CLS_CD,
            CS_PROC_CD
        FROM
            M_ITEM_PROC_COST
        WHERE
            PLANT_CD = cvc2PlantCd
            AND ITEM_CD = cvc2ItemCd;
    */
    
    --�i�ڕʉ��H��}�X�^2
    CURSOR curM_ITEM_PROC_COST2(
         cvc2PlantCd            VARCHAR2
        ,cvc2ItemCd             VARCHAR2
        ,cvc2ProcCostClsCd      VARCHAR2
    ) 
    IS 
        SELECT
            PROC_COST_CLS_CD,
            CS_PROC_CD
        FROM
            M_ITEM_PROC_COST
        WHERE
            PLANT_CD = cvc2PlantCd
            AND ITEM_CD = cvc2ItemCd
            AND PROC_COST_CLS_CD = cvc2ProcCostClsCd;
    
    --�i�ڕʉ��H��}�X�^3
    CURSOR curM_ITEM_PROC_COST3(
         cvc2PlantCd            VARCHAR2
        ,cvc2ItemCd             VARCHAR2
        ,cvc2CsProcCd           VARCHAR2
    ) 
    IS 
        SELECT
            PROC_COST_CLS_CD,
            CS_PROC_CD
        FROM
            M_ITEM_PROC_COST
        WHERE
            PLANT_CD = cvc2PlantCd
            AND ITEM_CD = cvc2ItemCd
            AND CS_PROC_CD <> cvc2CsProcCd
            AND ITEM_CD <> '*';
    
    --�i�ڕʉ��H��}�X�^4
    CURSOR curM_ITEM_PROC_COST4(
         cvc2PlantCd            VARCHAR2
        ,cvc2CsProcCd           VARCHAR2
        ,cvc2ProcCostClsCd      VARCHAR2
    ) 
    IS 
        SELECT
            PROC_COST_CLS_CD,
            CS_PROC_CD
        FROM
            M_ITEM_PROC_COST
        WHERE
            PLANT_CD = cvc2PlantCd
            AND CS_PROC_CD = cvc2CsProcCd
            AND PROC_COST_CLS_CD = cvc2ProcCostClsCd
            AND ITEM_CD <> '*';

    --[�����Ǘ��p�����[�^]
    CURSOR curSYS_COST_CTRL(
        cvc2PlantCd  VARCHAR2
    )
    IS 
        SELECT
            M_PROC_COST_PRIORITY_TYP
        FROM
            SYS_COST_CTRL
        WHERE 
            PLANT_CD = cvc2PlantCd;
    
    --�����ꊇ�G���[�o�^�T�u�t�@���N�V����
    FUNCTION SubFncInsertCsError(
         pvc2PlantCd           VARCHAR2
        ,pvc2ItemCd            VARCHAR2
        ,pvc2CsProcCd          VARCHAR2
        ,pvc2ProcCostClsCd     VARCHAR2
        ,pnumTransactionTyp    NUMBER
        ,pvc2MesssageCode      VARCHAR2
        ,pnumReadCount         NUMBER
    ) RETURN BOOLEAN
    IS
        numTmp varchar2(25);
        vc2CsErrorCd  VARCHAR2(20);
        vc2Remarks    VARCHAR2(100);
        
        --�����ꊇ�o�^�G���[�ԍ��̔�
        CURSOR curCS_ERROR_CD
        IS 
            SELECT
                TO_CHAR(SEQ_CS_ERROR_CD.NEXTVAL, 'FM00000000000000000000') AS CS_ERROR_CD
            FROM
              DUAL;
        
    BEGIN
        numTmp := null;
        
        --���l
        vc2Remarks := 'YEAR=' || pvc2Year || ' HALF_TERM_TYP=' || pvc2HalfTermTyp;
        
        --�ꊇ�o�^�G���[�ԍ��̔�
        OPEN curCS_ERROR_CD;
        FETCH curCS_ERROR_CD INTO vc2CsErrorCd;
        CLOSE curCS_ERROR_CD;
        
        INSERT INTO T_CS_ERROR(
            CS_ERROR_CD, 
            BATCH_TYP, 
            BUSINESS_ID, 
            COST_TYP, 
            PLANT_CD, 
            ITEM_CD, 
            CS_PROC_CD, 
            VEND_CD, 
            PROC_COST_CLS_CD, 
            EFFECTIVE_START_DATE, 
            TRANSACTION_TYP, 
            MESSAGE_CD, 
            READ_COUNT, 
            REMARKS, 
            LIST_ISS_FLG,
            CREATED_DATE,
            CREATED_BY,
            CREATED_PRG_NM,
            UPDATED_DATE,
            UPDATED_BY,
            UPDATED_PRG_NM,
            MODIFY_COUNT
        ) VALUES (
            vc2CsErrorCd,
            TO_NUMBER(pvc2BatchTyp),
            pvc2BusinessName,
            TO_NUMBER(pvc2CostTyp),
            pvc2PlantCd,
            pvc2ItemCd,
            pvc2CsProcCd,
            NULL,
            pvc2ProcCostClsCd,
            NULL,
            pnumTransactionTyp,
            pvc2MesssageCode,
            pnumReadCount,
            vc2Remarks,
            0,
            SYSDATE,
            pvc2UserId,
            pvc2BusinessName,
            SYSDATE,
            pvc2UserId,
            pvc2BusinessName,
            FIRST_MODIFY_COUNT
        );
        
        RETURN TRUE;
    END;
    
BEGIN
    
    /* LogFile �� OPEN */
    blnRet := FNCLOGOPEN(pvc2OutputPath, pvc2OutputName,pvc2TargetPlantCd, pvc2OutputMode, UTL_FileHandle);
    
    /* TraceLog�̏o��(Start)�������s�� */
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2TargetPlantCd, MY_SQL_NAME, METHOD_START);
    
    /* �Ɩ��J�n���b�Z�[�W�̍쐬 */
    vc2Comment      := SUBSTR('�@�H��R�[�h�F' || '[ ' || pvc2TargetPlantCd || ' ]' ||
                              '�@�Ώ۔N�x�F' || '[ ' || pvc2Year || ' ]' ||
                              '�@�����敪�F' || '[ ' || pvc2HalfTermTyp || ' ]' ||
                              '�@������ʁF' || '[ ' || pvc2CostTyp        || ' ]',1,256);
    
    /* �Ɩ��J�n���b�Z�[�W�̏o�� */
    blnRet :=   FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                          pvc2TargetPlantCd, MY_SQL_NAME, APS_COM_BATCH_START,
                          '(SBM0514)' || LOGMSG_START_PGNM || vc2Comment);
    COMMIT;
    
    vc2Comment      := SUBSTR('READ COUNT:' || numReadCount || ' ' ||
                              'ERROR COUNT:' || numErrCnt, 1, 256);
    
    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                        pvc2TargetPlantCd, MY_SQL_NAME, 'DB04001', null);
    
    COMMIT;
    
    intProcCostIFName := DBMS_SQL.OPEN_CURSOR;
    vc2Sql := 'SELECT ';
    vc2Sql := vc2Sql || '  YEAR, ';                --�N�x
    vc2Sql := vc2Sql || '  HALF_TERM_TYP, ';       --�����敪
    vc2Sql := vc2Sql || '  COST_TYP, ';            --�������
    vc2Sql := vc2Sql || '  PLANT_CD, ';            --�H��R�[�h
    vc2Sql := vc2Sql || '  CS_PROC_CD, ';          --�H���R�[�h
    vc2Sql := vc2Sql || '  PROC_COST_CLS_CD, ';    --���H��ރR�[�h
    vc2Sql := vc2Sql || '  ITEM_CD, ';             --�i�ڔԍ�
    vc2Sql := vc2Sql || '  PROC_COST_UNIT_QTY, ';  --���H��P�ʐ�
    vc2Sql := vc2Sql || '  STOCK_UNIT, ';          --�v�ʒP��
    vc2Sql := vc2Sql || '  PROC_COST_01, ';        --���H��01
    vc2Sql := vc2Sql || '  PROC_COST_02, ';        --���H��02
    vc2Sql := vc2Sql || '  PROC_COST_03, ';        --���H��03
    vc2Sql := vc2Sql || '  PROC_COST_04, ';        --���H��04
    vc2Sql := vc2Sql || '  PROC_COST_05, ';        --���H��05
    vc2Sql := vc2Sql || '  PROC_COST_06, ';        --���H��06
    vc2Sql := vc2Sql || '  PROC_COST_07, ';        --���H��07
    vc2Sql := vc2Sql || '  PROC_COST_08, ';        --���H��08
    vc2Sql := vc2Sql || '  PROC_COST_09, ';        --���H��09
    vc2Sql := vc2Sql || '  PROC_COST_10, ';        --���H��10
    vc2Sql := vc2Sql || '  PROC_COST_11, ';        --���H��11
    vc2Sql := vc2Sql || '  PROC_COST_12, ';        --���H��12
    vc2Sql := vc2Sql || '  CLASIFICATION_CD, ';    --�i�ڊǗ��R�[�h
    vc2Sql := vc2Sql || '  COMPANY_CD, ';          --��ЃR�[�h
    vc2Sql := vc2Sql || '  ORG_CD, ';              --����R�[�h
    vc2Sql := vc2Sql || '  SAVE_UPDATED_DATE, ';   --�ޔ��X�V��
    vc2Sql := vc2Sql || '  TRANSACTION_TYP, ';     --�����敪
    vc2Sql := vc2Sql || '  UPD_FLG ';              --�X�V�σt���O
    vc2Sql := vc2Sql || 'FROM ';
    vc2Sql := vc2Sql || '  T_PROC_COST_IF ';       --���H��I/F
    vc2Sql := vc2Sql || 'WHERE ';
    vc2Sql := vc2Sql || '  YEAR = TO_NUMBER(''' || pvc2Year || ''') ';
    vc2Sql := vc2Sql || '  AND HALF_TERM_TYP = TO_NUMBER(''' || pvc2HalfTermTyp || ''') ';
    vc2Sql := vc2Sql || '  AND COST_TYP = TO_NUMBER(''' || pvc2CostTyp || ''') ';
    vc2Sql := vc2Sql || '  AND PLANT_CD = ''' || pvc2TargetPlantCd || ''' ';
    vc2Sql := vc2Sql || '  AND UPD_FLG = 0 ';
    vc2Sql := vc2Sql || 'ORDER BY ';
    vc2Sql := vc2Sql || '  DECODE(ITEM_CD,''*'','''',ITEM_CD) NULLS LAST, ';
    vc2Sql := vc2Sql || '  CS_PROC_CD ASC, ';
    vc2Sql := vc2Sql || '  PROC_COST_CLS_CD ASC';
    
    -- �r�p�k�����
    DBMS_SQL.PARSE(intProcCostIFName, vc2Sql, DBMS_SQL.NATIVE);
    
    -- ���`
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 1, numYear);                  --�N�x
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 2, numHalfTermTyp);           --�����敪
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 3, numCostTyp);               --�������
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 4, vc2PlantCd, 8);            --�H��R�[�h
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 5, vc2CsProcCd, 100);          --�H���R�[�h
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 6, vc2ProcCostClsCd, 100);     --���H��ރR�[�h
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 7, vc2ItemCd, 100);            --�i�ڔԍ�
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 8, numProcCostUnitQty);       --���H��P�ʐ�
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 9, vc2StockUnit, 48);         --�v�ʒP��
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 10, numProcCost01);           --���H��01
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 11, numProcCost02);           --���H��02
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 12, numProcCost03);           --���H��03
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 13, numProcCost04);           --���H��04
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 14, numProcCost05);           --���H��05
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 15, numProcCost06);           --���H��06
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 16, numProcCost07);           --���H��07
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 17, numProcCost08);           --���H��08
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 18, numProcCost09);           --���H��09
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 19, numProcCost10);           --���H��10
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 20, numProcCost11);           --���H��11
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 21, numProcCost12);           --���H��12
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 22, vc2ClasificationCd, 100);  --�i�ڊǗ��R�[�h
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 23, vc2CompanyCd, 100);        --��ЃR�[�h
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 24, vc2OrgCd, 100);            --����R�[�h
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 25, dtmSaveUpdatedDate);      --�ޔ��X�V��
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 26, numTransactionTyp);       --�����敪
    DBMS_SQL.DEFINE_COLUMN(intProcCostIFName, 27, numUpdFlg);               --�X�V�σt���O
    
    -- �J�[�\�����s
    intRet := DBMS_SQL.EXECUTE(intProcCostIFName);
    
    -- �s�t�F�b�`
    LOOP
        
        IF DBMS_SQL.FETCH_ROWS(intProcCostIFName) > 0 THEN
        
          BEGIN
              -- �t�F�b�`�����l�̎擾
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 1, numYear);              --�N�x
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 2, numHalfTermTyp);       --�����敪
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 3, numCostTyp);           --�������
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 4, vc2PlantCd);           --�H��R�[�h
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 5, vc2CsProcCd);          --�H���R�[�h
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 6, vc2ProcCostClsCd);     --���H��ރR�[�h
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 7, vc2ItemCd);            --�i�ڔԍ�
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 8, numProcCostUnitQty);   --���H��P�ʐ�
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 9, vc2StockUnit);         --�v�ʒP��
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 10, numProcCost01);       --���H��01
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 11, numProcCost02);       --���H��02
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 12, numProcCost03);       --���H��03
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 13, numProcCost04);       --���H��04
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 14, numProcCost05);       --���H��05
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 15, numProcCost06);       --���H��06
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 16, numProcCost07);       --���H��07
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 17, numProcCost08);       --���H��08
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 18, numProcCost09);       --���H��09
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 19, numProcCost10);       --���H��10
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 20, numProcCost11);       --���H��11
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 21, numProcCost12);       --���H��12
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 22, vc2ClasificationCd);  --�i�ڊǗ��R�[�h
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 23, vc2CompanyCd);        --��ЃR�[�h
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 24, vc2OrgCd);            --����R�[�h
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 25, dtmSaveUpdatedDate);  --�ޔ��X�V��
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 26, numTransactionTyp);   --�����敪
              DBMS_SQL.COLUMN_VALUE(intProcCostIFName, 27, numUpdFlg);           --�X�V�σt���O
              
              numReadCount := numReadCount + 1;
              
              --���H��C���^�t�F�[�X���̓`�F�b�N
              --�i�ڔԍ���'*' ���� [�i��]�ɑ��݂��Ȃ��ꍇ�G���[
              --[ZZ11002]�i�ڔԍ������݂��܂���B
              IF vc2ItemCd != '*' THEN
                  --�i�ړǍ�
                  OPEN curM_ITEM(vc2ItemCd);
                  FETCH curM_ITEM INTO vc2Tmp;
                  IF curM_ITEM%NOTFOUND THEN
                      CLOSE curM_ITEM;
                      vc2MesssageCode := 'ZZ11002';
                      RAISE excERR_PROC_COST_IF;
                  END IF;
                  CLOSE curM_ITEM;
              END IF;
              
              --�H��R�[�h�A�H���R�[�h��[�H���}�X�^]�ɑ��݂��Ȃ��ꍇ�G���[
              --[DB00012]�H�������݂��܂���B
              vc2OrgCd_CsProc := NULL;
              OPEN curM_CS_PROC(vc2PlantCd, vc2CsProcCd);
              FETCH curM_CS_PROC INTO vc2OrgCd_CsProc;
              IF curM_CS_PROC%NOTFOUND THEN
                  CLOSE curM_CS_PROC;
                  vc2MesssageCode := 'DB00012';
                  RAISE excERR_PROC_COST_IF;
              END IF;
              CLOSE curM_CS_PROC;
              
              --����R�[�h��Null�A���A�H��R�[�h�A�H���R�[�h��[�H���}�X�^]�����݂��A
              --[�H���}�X�^]."����R�[�h"������R�[�h�̏ꍇ�G���[
              --[DB04003]�H���}�X�^�Ɖ��H��C���^�t�F�[�X�̕���R�[�h�����ƂȂ��Ă��܂��B
              IF vc2OrgCd IS NOT NULL THEN
                  IF vc2OrgCd_CsProc IS NOT NULL THEN
                      IF vc2OrgCd != vc2OrgCd_CsProc THEN
                          vc2MesssageCode := 'DB04003';
                          RAISE excERR_PROC_COST_IF;
                      END IF;
                  END IF;
              END IF;
              
              --���H��ރR�[�h���A[���H��ރ}�X�^]�ɑ��݂��Ȃ��ꍇ�G���[
              --[DB04004]���H��ރ}�X�^�����݂��܂���B
              OPEN curM_PROC_COST_CLS(vc2ProcCostClsCd);
              FETCH curM_PROC_COST_CLS INTO vc2Tmp;
              IF curM_PROC_COST_CLS%NOTFOUND THEN
                  CLOSE curM_PROC_COST_CLS;
                  vc2MesssageCode := 'DB04004';
                  RAISE excERR_PROC_COST_IF;
              END IF;
              CLOSE curM_PROC_COST_CLS;
              
              --�����敪��1(�V�K)���A�i�ڔԍ���'*'�ŁA�N�x�{�����敪�{������ʁ{�H��R�[�h
              --�{�H���R�[�h�{���H��ރR�[�h��[���H��ރ}�X�^]�Ɋ��ɑ��݂���ꍇ�G���[
              --[DB00013]���H��}�X�^�����ɑ��݂��Ă��܂��B
              IF numTransactionTyp = 1 THEN
                  IF vc2ItemCd = '*' THEN
                      OPEN curM_PROC_COST(
                        numYear
                       ,numHalfTermTyp
                       ,numCostTyp
                       ,vc2PlantCd
                       ,vc2CsProcCd
                       ,vc2ProcCostClsCd
                      );
                      FETCH curM_PROC_COST INTO numUpdateTyp;
                      IF curM_PROC_COST%FOUND THEN
                          CLOSE curM_PROC_COST;
                          vc2MesssageCode := 'DB00013';
                          RAISE excERR_PROC_COST_IF;
                      END IF;
                      CLOSE curM_PROC_COST;
                  END IF;
              END IF;
              
              --�����敪��2(�X�V)�܂���3(�폜)���A�i�ڔԍ���'*'�ŁA
              --�N�x�{�����敪�{������ʁ{�H��R�[�h�{�H���R�[�h�{���H��ރR�[�h��
              --[���H��ރ}�X�^]�ɑ��݂��Ȃ��ꍇ�G���[
              --[DB00014]���H��}�X�^�����݂��܂���B
              IF numTransactionTyp = 2 OR numTransactionTyp = 3 THEN
                  IF vc2ItemCd = '*' THEN
                      OPEN curM_PROC_COST(
                        numYear
                       ,numHalfTermTyp
                       ,numCostTyp
                       ,vc2PlantCd
                       ,vc2CsProcCd
                       ,vc2ProcCostClsCd
                      );
                      FETCH curM_PROC_COST INTO numUpdateTyp;
                      IF curM_PROC_COST%NOTFOUND THEN
                          CLOSE curM_PROC_COST;
                          vc2MesssageCode := 'DB00014';
                          RAISE excERR_PROC_COST_IF;
                      END IF;
                      CLOSE curM_PROC_COST;
                  END IF;
              END IF;
              
              IF numTransactionTyp = 1 THEN
                  --�����敪��1(�V�K)�̏ꍇ
                  IF vc2ItemCd = '*' THEN
                      --���H��v�v�Z
                      numProcCostSum := 
                          numProcCost01 + 
                          numProcCost02 + 
                          numProcCost03 + 
                          numProcCost04 + 
                          numProcCost05 + 
                          numProcCost06 + 
                          numProcCost07 + 
                          numProcCost08 + 
                          numProcCost09 + 
                          numProcCost10 + 
                          numProcCost11 + 
                          numProcCost12;
                      
                      --���H��}�X�^�ǉ�
                      vc2ItemCd_Item := null;
                      INSERT INTO M_PROC_COST(
                          YEAR,
                          HALF_TERM_TYP,
                          COST_TYP,
                          PLANT_CD,
                          CS_PROC_CD,
                          PROC_COST_CLS_CD,
                          PROC_COST_UNIT_QTY,
                          STOCK_UNIT,
                          PROC_COST_01,
                          PROC_COST_02,
                          PROC_COST_03,
                          PROC_COST_04,
                          PROC_COST_05,
                          PROC_COST_06,
                          PROC_COST_07,
                          PROC_COST_08,
                          PROC_COST_09,
                          PROC_COST_10,
                          PROC_COST_11,
                          PROC_COST_12,
                          PROC_COST_SUM,
                          UPDATE_TYP,
                          DEL_FLG,
                          CREATED_DATE,
                          CREATED_BY,
                          CREATED_PRG_NM,
                          UPDATED_DATE,
                          UPDATED_BY,
                          UPDATED_PRG_NM,
                          MODIFY_COUNT
                      ) VALUES (
                          numYear,
                          numHalfTermTyp,
                          numCostTyp,
                          vc2PlantCd,
                          vc2CsProcCd,
                          vc2ProcCostClsCd,
                          numProcCostUnitQty,
                          vc2StockUnit,
                          numProcCost01,
                          numProcCost02,
                          numProcCost03,
                          numProcCost04,
                          numProcCost05,
                          numProcCost06,
                          numProcCost07,
                          numProcCost08,
                          numProcCost09,
                          numProcCost10,
                          numProcCost11,
                          numProcCost12,
                          numProcCostSum,
                          1,
                          0,
                          SYSDATE,
                          pvc2UserId,
                          pvc2BusinessName,
                          SYSDATE,
                          pvc2UserId,
                          pvc2BusinessName,
                          FIRST_MODIFY_COUNT
                      );
                      
                  ELSE
                      
                      --�H��R�[�h�{�i�ڔԍ��{���H��ރR�[�h��[�i�ڕʉ��H��}�X�^]������
                      --���R�[�h�����݂��A"���H��ރR�[�h"��'*'�ȊO�̏ꍇ�G���[
                      --[DB00015]�i�ڕʉ��H��}�X�^�����ɑ��݂��Ă��܂��B
                      OPEN curM_ITEM_PROC_COST2(
                          vc2PlantCd,
                          vc2ItemCd,
                          vc2ProcCostClsCd
                      );
                      FETCH curM_ITEM_PROC_COST2 
                          INTO vc2ProcCostClsCd_ItemProcCost, vc2CsProcCd_ItemProcCost;
                      IF curM_ITEM_PROC_COST2%FOUND 
                          AND vc2ProcCostClsCd_ItemProcCost != '*' THEN
                          CLOSE curM_ITEM_PROC_COST2;
                          vc2MesssageCode := 'DB00015';
                          RAISE excERR_PROC_COST_IF;
                      END IF;
                      CLOSE curM_ITEM_PROC_COST2;
                      
                      --�i�ڕʉ��H��}�X�^�̍폜
                      DELETE 
                          M_ITEM_PROC_COST
                      WHERE
                          PLANT_CD = vc2PlantCd
                          AND ITEM_CD = vc2ItemCd
                          AND PROC_COST_CLS_CD = '*';
                      
                      --�i�ڕʉ��H��}�X�^�̒ǉ�
                      INSERT INTO M_ITEM_PROC_COST(
                          PLANT_CD,
                          ITEM_CD,
                          PROC_COST_CLS_CD,
                          CS_PROC_CD,
                          CLASIFICATION_CD,
                          ONEROUS_CONS_FLG,
                          CREATED_DATE,
                          CREATED_BY,
                          CREATED_PRG_NM,
                          UPDATED_DATE,
                          UPDATED_BY,
                          UPDATED_PRG_NM,
                          MODIFY_COUNT
                      ) VALUES (
                          vc2PlantCd,
                          vc2ItemCd,
                          vc2ProcCostClsCd,
                          vc2CsProcCd,
                          vc2ClasificationCd,
                          0,
                          SYSDATE,
                          pvc2UserId,
                          pvc2BusinessName,
                          SYSDATE,
                          pvc2UserId,
                          pvc2BusinessName,
                          FIRST_MODIFY_COUNT
                      );
                      
                  END IF;
                  
              ELSIF numTransactionTyp = 2 THEN
                
                  --�����敪��2(�X�V)�̏ꍇ
                  
                  IF vc2ItemCd = '*' THEN
                      
                      --[�����p�����[�^]�Ǎ�
                      OPEN curSYS_COST_CTRL(vc2PlantCd);
                      FETCH curSYS_COST_CTRL INTO numMProcCostPriorityTyp;
                      CLOSE curSYS_COST_CTRL;
                      
                      --[�����p�����[�^]."���H��}�X�^�D��敪" = 1(�}�X�^�����e�i���X)�̏ꍇ�ŁA
                      --[���H��}�X�^]."�X�V�敪"=2(�}�X�^�����e�i���X�ōX�V)�̏ꍇ�G���[
                      --[DB00009]�}�X�^�����e�i���X�ōX�V�ς̂��߁A�X�V���܂���ł����B
                      IF numMProcCostPriorityTyp = 1 THEN
                          IF numUpdateTyp = 2 THEN 
                              vc2MesssageCode := 'DB00009';
                              RAISE excERR_PROC_COST_IF;
                          END IF;
                      END IF;
                      
                      --���H��v�v�Z
                      numProcCostSum := 
                          numProcCost01 + 
                          numProcCost02 + 
                          numProcCost03 + 
                          numProcCost04 + 
                          numProcCost05 + 
                          numProcCost06 + 
                          numProcCost07 + 
                          numProcCost08 + 
                          numProcCost09 + 
                          numProcCost10 + 
                          numProcCost11 + 
                          numProcCost12;
                          
                      --���H��}�X�^�X�V
                      UPDATE
                          M_PROC_COST
                      SET
                          PROC_COST_UNIT_QTY = numProcCostUnitQty,
                          STOCK_UNIT = vc2StockUnit,
                          PROC_COST_01 = numProcCost01,
                          PROC_COST_02 = numProcCost02,
                          PROC_COST_03 = numProcCost03,
                          PROC_COST_04 = numProcCost04,
                          PROC_COST_05 = numProcCost05,
                          PROC_COST_06 = numProcCost06,
                          PROC_COST_07 = numProcCost07,
                          PROC_COST_08 = numProcCost08,
                          PROC_COST_09 = numProcCost09,
                          PROC_COST_10 = numProcCost10,
                          PROC_COST_11 = numProcCost11,
                          PROC_COST_12 = numProcCost12,
                          PROC_COST_SUM = numProcCostSum,
                          UPDATE_TYP = 1,
                          DEL_FLG = 0,
                          UPDATED_DATE = SYSDATE,
                          UPDATED_BY = pvc2UserId,
                          UPDATED_PRG_NM = pvc2BusinessName,
                          MODIFY_COUNT = MODIFY_COUNT + 1
                      WHERE
                          YEAR = numYear
                          AND HALF_TERM_TYP = numHalfTermTyp
                          AND COST_TYP = numCostTyp
                          AND PLANT_CD = vc2PlantCd
                          AND CS_PROC_CD = vc2CsProcCd
                          AND PROC_COST_CLS_CD = vc2ProcCostClsCd;
                      
                  ELSE
                      
                      --�H��R�[�h�{�i�ڔԍ��{���H��ރR�[�h��[�i�ڕʉ��H��}�X�^]������
                      --���R�[�h�����݂��Ȃ��ꍇ�G���[
                      --[DB00016]�i�ڕʉ��H��}�X�^�����݂��܂���B
                      OPEN curM_ITEM_PROC_COST2(
                          vc2PlantCd,
                          vc2ItemCd,
                          vc2ProcCostClsCd
                      );
                      FETCH curM_ITEM_PROC_COST2 
                          INTO vc2ProcCostClsCd_ItemProcCost, vc2CsProcCd_ItemProcCost;
                      IF curM_ITEM_PROC_COST2%NOTFOUND THEN
                          CLOSE curM_ITEM_PROC_COST2;
                          vc2MesssageCode := 'DB00016';
                          RAISE excERR_PROC_COST_IF;
                      END IF;
                      CLOSE curM_ITEM_PROC_COST2;
                      
                      --�H��R�[�h�{�i�ڔԍ��{���H��ރR�[�h��[�i�ڕʉ��H��}�X�^]������
                      --���R�[�h�����݂��A
                      --[���H��C���^�t�F�[�X]."�H���R�[�h"��[�i�ڕʉ��H��}�X�^]."�H���R�[�h"
                      --�̏ꍇ�G���[
                      --[DB00010]�w�肵���i�ڔԍ��͑��̍H���R�[�h�œo�^�ς݂ł��B
                      OPEN curM_ITEM_PROC_COST3(
                          vc2PlantCd,
                          vc2ItemCd,
                          vc2CsProcCd
                      );
                      FETCH curM_ITEM_PROC_COST3 
                          INTO vc2ProcCostClsCd_ItemProcCost, vc2CsProcCd_ItemProcCost;
                      IF curM_ITEM_PROC_COST3%FOUND THEN
                          CLOSE curM_ITEM_PROC_COST3;
                          vc2MesssageCode := 'DB00010';
                          RAISE excERR_PROC_COST_IF;
                      END IF;
                      CLOSE curM_ITEM_PROC_COST3;
                      
                      --�i�ڕʉ��H��}�X�^�̍X�V���s���B
                      UPDATE 
                          M_ITEM_PROC_COST
                      SET
                          CLASIFICATION_CD = vc2ClasificationCd,
                          UPDATED_DATE = SYSDATE,
                          UPDATED_BY = pvc2UserId,
                          UPDATED_PRG_NM = pvc2BusinessName,
                          MODIFY_COUNT = MODIFY_COUNT + 1
                      WHERE
                          PLANT_CD = vc2PlantCd
                          AND ITEM_CD = vc2ItemCd
                          AND CS_PROC_CD = vc2CsProcCd
                          AND PROC_COST_CLS_CD = vc2ProcCostClsCd;
                          
                  END IF;
                  
              ELSIF numTransactionTyp = 3 THEN
              
                  --�����敪��3(�폜)�̏ꍇ                                    
                  IF vc2ItemCd = '*' THEN
                      --[�����p�����[�^]�Ǎ�
                      OPEN curSYS_COST_CTRL(vc2PlantCd);
                      FETCH curSYS_COST_CTRL INTO numMProcCostPriorityTyp;
                      CLOSE curSYS_COST_CTRL;
                      
                      --[�����p�����[�^]."���H��}�X�^�D��敪" = 1(�}�X�^�����e�i���X)�̏ꍇ�ŁA
                      --[���H��}�X�^]."�X�V�敪"=2(�}�X�^�����e�i���X�ōX�V)�̏ꍇ�G���[
                      --[DB00009]�}�X�^�����e�i���X�ōX�V�ς̂��߁A�X�V���܂���ł����B
                      IF numMProcCostPriorityTyp = 1 THEN
                           IF numUpdateTyp = 2 THEN 
                              vc2MesssageCode := 'DB00009';
                              RAISE excERR_PROC_COST_IF;
                           END IF;
                      END IF;
                      OPEN curM_ITEM_PROC_COST4(
                          vc2PlantCd,
                          vc2CsProcCd,
                          vc2ProcCostClsCd
                      );
                      FETCH curM_ITEM_PROC_COST4 
                          INTO vc2ProcCostClsCd_ItemProcCost, vc2CsProcCd_ItemProcCost;
                      IF curM_ITEM_PROC_COST4%FOUND THEN
                          CLOSE curM_ITEM_PROC_COST4;
                          vc2MesssageCode := 'DA03001';
                          RAISE excERR_PROC_COST_IF;
                      END IF;
                      CLOSE curM_ITEM_PROC_COST4;
                      --���H��}�X�^�̍X�V���s���B�i�_���폜�j
                      UPDATE
                          M_PROC_COST
                      SET
                          UPDATE_TYP = 1,
                          DEL_FLG = 1,
                          UPDATED_DATE = SYSDATE,
                          UPDATED_BY = pvc2UserId,
                          UPDATED_PRG_NM = pvc2BusinessName,
                          MODIFY_COUNT = MODIFY_COUNT + 1
                      WHERE
                          YEAR = numYear
                          AND HALF_TERM_TYP = numHalfTermTyp
                          AND COST_TYP = numCostTyp
                          AND PLANT_CD = vc2PlantCd
                          AND CS_PROC_CD = vc2CsProcCd
                          AND PROC_COST_CLS_CD = vc2ProcCostClsCd;
                  END IF;

                  IF vc2ItemCd != '*' THEN
                     --�����폜�i�ڕʉ��H��}�X�^
                     DELETE 
                         M_ITEM_PROC_COST
                     WHERE
                         PLANT_CD = vc2PlantCd
                         AND ITEM_CD = vc2ItemCd
                         AND CS_PROC_CD = vc2CsProcCd
                         AND PROC_COST_CLS_CD = vc2ProcCostClsCd;
                  END IF;
                  
              END IF;
              
              --�G���[���Ȃ������ꍇ�A�N�x�A�����敪�A������ʁA�H��R�[�h�A���H��ރR�[�h��
              --�������A���ׂĂ�[���H��C���^�t�F�[�X]�̍X�V���s���B
              UPDATE
                  T_PROC_COST_IF
              SET
                  UPD_FLG = 1,
                  UPDATED_DATE = SYSDATE,
                  UPDATED_BY = pvc2UserId,
                  UPDATED_PRG_NM = pvc2BusinessName,
                  MODIFY_COUNT = MODIFY_COUNT + 1
              WHERE
                  YEAR = numYear
                  AND HALF_TERM_TYP = numHalfTermTyp
                  AND COST_TYP = numCostTyp
                  AND PLANT_CD = vc2PlantCd
                  AND PROC_COST_CLS_CD = vc2ProcCostClsCd
                  AND ITEM_CD = vc2ItemCd
                  AND CS_PROC_CD = vc2CsProcCd;
              
              --�R�~�b�g
              COMMIT;
              
              numNormalCount := numNormalCount + 1;
              
          EXCEPTION
              
              WHEN excERR_PROC_COST_IF THEN
                  ROLLBACK;
                  numErrCnt := numErrCnt + 1;
                  blnRet := SubFncInsertCsError(
                      vc2PlantCd,
                      vc2ItemCd,
                      vc2CsProcCd,
                      vc2ProcCostClsCd,
                      numTransactionTyp,
                      vc2MesssageCode,
                      numReadCount
                  );
                  COMMIT;
                  
              WHEN OTHERS THEN
                  ROLLBACK;
                  numErrCnt := numErrCnt + 1;
                  
                  -- �J�[�\���N���[�Y
                  DBMS_SQL.CLOSE_CURSOR(intProcCostIFName);
                  RAISE;
                
          END;
          
        ELSE
            
            EXIT;
            
        END IF;
        
    END LOOP;
    
    -- �J�[�\���N���[�Y
    DBMS_SQL.CLOSE_CURSOR(intProcCostIFName);
    
    /*  */
    vc2Comment      := SUBSTR('READ COUNT:' || numReadCount || ' ' ||
                              'ERROR COUNT:' || numErrCnt, 1, 256);
    
    /* �I�����b�Z�[�W�̏o�� */
    blnRet          := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId, pvc2BusinessName,
                                 pvc2TargetPlantCd, MY_SQL_NAME, 'DB04002',
                                 vc2Comment);
    
    COMMIT;
    
    /* �Ɩ��I�����b�Z�[�W�̍쐬 */
    
    vc2Comment      := SUBSTR('�@�Ώی����F' || '[ ' || numReadCount || ' ]' ||
                              '�@���팏���F' || '[ ' || numNormalCount || ' ]' ||
                              '�@�ُ팏���F' || '[ ' || numErrCnt || ' ]',1,256);
    
    /* �I�����b�Z�[�W�̏o�� */
    blnRet          := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId, pvc2BusinessName,
                                 pvc2TargetPlantCd, MY_SQL_NAME, APS_COM_BATCH_END,
                                 '(SBM0515)' || LOGMSG_END_PGNM || vc2Comment);
    
    COMMIT;
    
    /* �g���[�X���O�̏o��(�I��) */
    blnRet          := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                   pvc2UserId,pvc2BusinessName,
                                   pvc2TargetPlantCd, MY_SQL_NAME, METHOD_END);
    
    COMMIT;
    
    /* LogFile �� CLOSE */
    blnRet          := FNCLOGCLOSE(UTL_FileHandle);
    
--< ��O���� >---------------------------------------------------------------
EXCEPTION
    
    WHEN OTHERS THEN   --���̑��̃G���[
        
        ROLLBACK;
        
        vc2Comment := SUBSTR('���������̑��̃G���[���������܂���������',1,256);
        
        /* �I�����b�Z�[�W�̏o�� */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
                            pvc2BusinessName, pvc2TargetPlantCd, MY_SQL_NAME, APS_COM_BATCH_END,
                            '(SBM0516)' ||  LOGMSG_END_PGNM || vc2Comment);
        
        /* �g���[�X���O�̏o��(�I��) */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId,pvc2BusinessName, pvc2TargetPlantCd, MY_SQL_NAME, METHOD_END);
        
        COMMIT;
        
        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);
    
END;
/