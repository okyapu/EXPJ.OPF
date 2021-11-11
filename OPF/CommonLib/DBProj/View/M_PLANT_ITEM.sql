CREATE OR REPLACE VIEW M_PLANT_ITEM (
     PLANT_CD
    ,ITEM_CD
    ,DRAW_CD
    ,SPEC
    ,HIGH_LEVEL_NO
    ,MRP_ODR_TYP
    ,OUTSIDE_TYP
    ,STOCK_UNIT_FLG
    ,PKG_UNIT
    ,PKG_UNIT_QTY
    ,ISSUE_TYP
    ,MPS_FLG
    ,ACPT_INSPC_TYP
    ,PRODUCT_TYP
    ,CLASIFICATION_CD
    ,UNIT_WEIGHT
    ,ABC_TYP
    ,OPR_RSLT_TYP
    ,SPL_ITEM_TYP
    ,TAX_CD
    ,CAL_NO
    ,BEST_BEFORE_YEAR
    ,BEST_BEFORE_MONTH
    ,BEST_BEFORE_DAY
    ,SHIP_DEADLINE_YEAR
    ,SHIP_DEADLINE_MONTH
    ,SHIP_DEADLINE_DAY
    ,LOT_CTRL_FLG
    ,LOT_NUMBERING_TYP
    ,ODR_UNIT
    ,ODR_UNIT_QTY
    ,MAX_STOCK_QTY
    ,ITEM_CLASS_01_TYP
    ,ITEM_CLASS_01_CD
    ,ITEM_CLASS_01_NAME
    ,ITEM_CLASS_02_TYP
    ,ITEM_CLASS_02_CD
    ,ITEM_CLASS_02_NAME
    ,ITEM_CLASS_03_TYP
    ,ITEM_CLASS_03_CD
    ,ITEM_CLASS_03_NAME
    ,ITEM_CLASS_04_TYP
    ,ITEM_CLASS_04_CD
    ,ITEM_CLASS_04_NAME
    ,ITEM_CLASS_05_TYP
    ,ITEM_CLASS_05_CD
    ,ITEM_CLASS_05_NAME
    ,ITEM_CLASS_06_TYP
    ,ITEM_CLASS_06_CD
    ,ITEM_CLASS_06_NAME
    ,ITEM_CLASS_07_TYP
    ,ITEM_CLASS_07_CD
    ,ITEM_CLASS_07_NAME
    ,ITEM_CLASS_08_TYP
    ,ITEM_CLASS_08_CD
    ,ITEM_CLASS_08_NAME
    ,ITEM_CLASS_09_TYP
    ,ITEM_CLASS_09_CD
    ,ITEM_CLASS_09_NAME
    ,ITEM_CLASS_10_TYP
    ,ITEM_CLASS_10_CD
    ,ITEM_CLASS_10_NAME
    ,ITEM_CLASS_11_TYP
    ,ITEM_CLASS_11_CD
    ,ITEM_CLASS_11_NAME
    ,ITEM_CLASS_12_TYP
    ,ITEM_CLASS_12_CD
    ,ITEM_CLASS_12_NAME
    ,DEPO_TYP
    ,JANCODE
    ,PATTERN_CD
    ,PRD_CD
    ,SET_LT
    ,BEST_BEFORE_DATE_LT
    ,REMARK1
    ,REMARK2
    ,MANHOUR_TYP
    ,OPR_PROC_TYP
    ,LOT_TYP
    ,SITE_NO
    ,SHIFT_CALC_TYP
    ,CALC_TIME_DAYS
    ,SAFTY_STOCK_METHOD_TYP
    ,SAFTY_STOCK_COND_FLG
    ,SAFTY_STOCK_WXHAUST_FLG
    ,SAFTY_STOCK
    ,SAFTY_STOCK_PERIOD
    ,SAFTY_STOCK_RATIO
    ,SAFTY_STOCK_MNT_PERIOD
    ,SAFTY_STOCK_MNT_DAYS
    ,GROSS_PERIOD_ADD_DAYS
    ,FIXED_MESH_SIZE_TYP
    ,DYNAMIC_MESH_SIZE
    ,ISSUE_DATE_SET_TYP
    ,MAX_PERIOD
    ,MAX_PERIOD_MIN
    ,MAX_PERIOD_QTY
    ,ODR_POINT
    ,FIXED_ODR_QTY
    ,ITEM_SPOIL
    ,LOCK_STATUS_TYP
    ,ISSUE_CTRL_TYP
    ,DM_RELEASE_CATEGORY
    ,DM_OUTPUT_CATEGORY
    ,ACPT_PLAN_CATEGORY
    ,PARTITION_SUM_FLG
    ,EXHAUSION_FLG
    ,PERMISSION_EARLY_DAY
    ,PERMISSION_EARLY_TIME
    ,ITEM_RESERVE_FIELD
    ,INHERI_FIELD_B_ITEM
    ,INHERI_FIELD_C_ITEM
    ,MULTI_AOURCE_TYP
    ,PERSON_CD
    ,DEPT_CD
    ,PJ_CD
    ,SEG_CONTENTS1
    ,SEG_CONTENTS2
    ,SEG_CONTENTS3
    ,SEG_CONTENTS4
    ,COST_CLASS_01_TYP
    ,COST_CLASS_01_CD
    ,COST_CLASS_01_NAME
    ,COST_CLASS_02_TYP
    ,COST_CLASS_02_CD
    ,COST_CLASS_02_NAME
    ,COST_CLASS_03_TYP
    ,COST_CLASS_03_CD
    ,COST_CLASS_03_NAME
    ,COST_CLASS_04_TYP
    ,COST_CLASS_04_CD
    ,COST_CLASS_04_NAME
    ,COST_CLASS_05_TYP
    ,COST_CLASS_05_CD
    ,COST_CLASS_05_NAME
    ,CREATED_DATE
    ,CREATED_BY
    ,CREATED_PRG_NM
    ,UPDATED_DATE
    ,UPDATED_BY
    ,UPDATED_PRG_NM
    ,MODIFY_COUNT
) AS
SELECT   MP.PLANT_CD                         AS  PLANT_CD
        ,MI.ITEM_CD                          AS  ITEM_CD
        ,MI.DRAW_CD                          AS  DRAW_CD
        ,MI.SPEC                             AS  SPEC
        ,NVL(MI.HIGH_LEVEL_NO, 0)            AS  HIGH_LEVEL_NO
        ,NVL(MI.MRP_ODR_TYP, 1)              AS  MRP_ODR_TYP
        ,NVL(MI.OUTSIDE_TYP, 1)              AS  OUTSIDE_TYP
        ,NVL(MI.STOCK_UNIT_FLG, 2)           AS  STOCK_UNIT_FLG
        ,MI.PKG_UNIT                         AS  PKG_UNIT
        ,NVL(MI.PKG_UNIT_QTY, 1)             AS  PKG_UNIT_QTY
        ,NVL(MI.ISSUE_TYP, 1)                AS  ISSUE_TYP
        ,NVL(MI.MPS_FLG, 0)                  AS  MPS_FLG
        ,NVL(MI.ACPT_INSPC_TYP, 1)           AS  ACPT_INSPC_TYP
        ,NVL(MI.PRODUCT_TYP, 1)              AS  PRODUCT_TYP
        ,MI.CLASIFICATION_CD                 AS  CLASIFICATION_CD
        ,NVL(MI.UNIT_WEIGHT, 0)              AS  UNIT_WEIGHT
        ,NVL(MI.ABC_TYP, 1)                  AS  ABC_TYP
        ,NVL(MI.OPR_RSLT_TYP, 1)             AS  OPR_RSLT_TYP
        ,NVL(MI.SPL_ITEM_TYP, 1)             AS  SPL_ITEM_TYP
        ,MI.TAX_CD                           AS  TAX_CD
        ,MI.CAL_NO                           AS  CAL_NO
        ,NVL(MI.BEST_BEFORE_YEAR, 0)         AS  BEST_BEFORE_YEAR
        ,NVL(MI.BEST_BEFORE_MONTH, 0)        AS  BEST_BEFORE_MONTH
        ,NVL(MI.BEST_BEFORE_DAY, 0)          AS  BEST_BEFORE_DAY
        ,NVL(MI.SHIP_DEADLINE_YEAR, 0)       AS  SHIP_DEADLINE_YEAR
        ,NVL(MI.SHIP_DEADLINE_MONTH, 0)      AS  SHIP_DEADLINE_MONTH
        ,NVL(MI.SHIP_DEADLINE_DAY, 0)        AS  SHIP_DEADLINE_DAY
        ,NVL(MI.LOT_CTRL_FLG, 0)             AS  LOT_CTRL_FLG
        ,NVL(MI.LOT_NUMBERING_TYP, 0)        AS  LOT_NUMBERING_TYP
        ,MI.ODR_UNIT                         AS  ODR_UNIT
        ,ROUND(NVL(MI.ODR_UNIT_QTY, 1),0)    AS  ODR_UNIT_QTY
        ,ROUND(NVL(MI.MAX_STOCK_QTY, 0),0)   AS  MAX_STOCK_QTY
        ,NVL(MI.ITEM_CLASS_01_TYP, '3001')   AS  ITEM_CLASS_01_TYP
        ,MI.ITEM_CLASS_01_CD                 AS  ITEM_CLASS_01_CD
        ,MI.ITEM_CLASS_01_NAME               AS  ITEM_CLASS_01_NAME
        ,NVL(MI.ITEM_CLASS_02_TYP, '3002')   AS  ITEM_CLASS_02_TYP
        ,MI.ITEM_CLASS_02_CD                 AS  ITEM_CLASS_02_CD
        ,MI.ITEM_CLASS_02_NAME               AS  ITEM_CLASS_02_NAME
        ,NVL(MI.ITEM_CLASS_03_TYP, '3003')   AS  ITEM_CLASS_03_TYP
        ,MI.ITEM_CLASS_03_CD                 AS  ITEM_CLASS_03_CD
        ,MI.ITEM_CLASS_03_NAME               AS  ITEM_CLASS_03_NAME
        ,NVL(MI.ITEM_CLASS_04_TYP, '3004')   AS  ITEM_CLASS_04_TYP
        ,MI.ITEM_CLASS_04_CD                 AS  ITEM_CLASS_04_CD
        ,MI.ITEM_CLASS_04_NAME               AS  ITEM_CLASS_04_NAME
        ,NVL(MI.ITEM_CLASS_05_TYP, '3005')   AS  ITEM_CLASS_05_TYP
        ,MI.ITEM_CLASS_05_CD                 AS  ITEM_CLASS_05_CD
        ,MI.ITEM_CLASS_05_NAME               AS  ITEM_CLASS_05_NAME
        ,NVL(MI.ITEM_CLASS_06_TYP, '3006')   AS  ITEM_CLASS_06_TYP
        ,MI.ITEM_CLASS_06_CD                 AS  ITEM_CLASS_06_CD
        ,MI.ITEM_CLASS_06_NAME               AS  ITEM_CLASS_06_NAME
        ,NVL(MI.ITEM_CLASS_07_TYP, '3007')   AS  ITEM_CLASS_07_TYP
        ,MI.ITEM_CLASS_07_CD                 AS  ITEM_CLASS_07_CD
        ,MI.ITEM_CLASS_07_NAME               AS  ITEM_CLASS_07_NAME
        ,NVL(MI.ITEM_CLASS_08_TYP, '3008')   AS  ITEM_CLASS_08_TYP
        ,MI.ITEM_CLASS_08_CD                 AS  ITEM_CLASS_08_CD
        ,MI.ITEM_CLASS_08_NAME               AS  ITEM_CLASS_08_NAME
        ,NVL(MI.ITEM_CLASS_09_TYP, '3009')   AS  ITEM_CLASS_09_TYP
        ,MI.ITEM_CLASS_09_CD                 AS  ITEM_CLASS_09_CD
        ,MI.ITEM_CLASS_09_NAME               AS  ITEM_CLASS_09_NAME
        ,NVL(MI.ITEM_CLASS_10_TYP, '3010')   AS  ITEM_CLASS_10_TYP
        ,MI.ITEM_CLASS_10_CD                 AS  ITEM_CLASS_10_CD
        ,MI.ITEM_CLASS_10_NAME               AS  ITEM_CLASS_10_NAME
        ,NVL(MI.ITEM_CLASS_11_TYP, '3011')   AS  ITEM_CLASS_11_TYP
        ,MI.ITEM_CLASS_11_CD                 AS  ITEM_CLASS_11_CD
        ,MI.ITEM_CLASS_11_NAME               AS  ITEM_CLASS_11_NAME
        ,NVL(MI.ITEM_CLASS_12_TYP, '3012')   AS  ITEM_CLASS_12_TYP
        ,MI.ITEM_CLASS_12_CD                 AS  ITEM_CLASS_12_CD
        ,MI.ITEM_CLASS_12_NAME               AS  ITEM_CLASS_12_NAME
        ,MI.DEPO_TYP                         AS  DEPO_TYP
        ,MI.JANCODE                          AS  JANCODE
        ,MI.PATTERN_CD                       AS  PATTERN_CD
        ,MI.PRD_CD                           AS  PRD_CD
        ,NVL(MI.SET_LT, 0)                   AS  SET_LT
        ,NVL(MI.BEST_BEFORE_DATE_LT, 0)      AS  BEST_BEFORE_DATE_LT
        ,MI.REMARK1                          AS  REMARK1
        ,MI.REMARK2                          AS  REMARK2
        ,NVL(MI.MANHOUR_TYP, 0)              AS  MANHOUR_TYP
        ,1                                   AS  OPR_PROC_TYP
        ,1                                   AS  LOT_TYP
        ,''                                  AS  SITE_NO
        ,1                                   AS  SHIFT_CALC_TYP
        ,999                                 AS  CALC_TIME_DAYS
        ,1                                   AS  SAFTY_STOCK_METHOD_TYP
        ,1                                   AS  SAFTY_STOCK_COND_FLG
        ,0                                   AS  SAFTY_STOCK_WXHAUST_FLG
        ,0                                   AS  SAFTY_STOCK
        ,0                                   AS  SAFTY_STOCK_PERIOD
        ,0                                   AS  SAFTY_STOCK_RATIO
        ,0                                   AS  SAFTY_STOCK_MNT_PERIOD
        ,0                                   AS  SAFTY_STOCK_MNT_DAYS
        ,-1                                  AS  GROSS_PERIOD_ADD_DAYS
        ,1                                   AS  FIXED_MESH_SIZE_TYP
        ,1                                   AS  DYNAMIC_MESH_SIZE
        ,1                                   AS  ISSUE_DATE_SET_TYP
        ,1                                   AS  MAX_PERIOD
        ,1                                   AS  MAX_PERIOD_MIN
        ,99999999                            AS  MAX_PERIOD_QTY
        ,0                                   AS  ODR_POINT
        ,0                                   AS  FIXED_ODR_QTY
        ,0                                   AS  ITEM_SPOIL
        ,0                                   AS  LOCK_STATUS_TYP
        ,0                                   AS  ISSUE_CTRL_TYP
        ,''                                  AS  DM_RELEASE_CATEGORY
        ,''                                  AS  DM_OUTPUT_CATEGORY
        ,''                                  AS  ACPT_PLAN_CATEGORY
        ,0                                   AS  PARTITION_SUM_FLG
        ,0                                   AS  EXHAUSION_FLG
        ,0                                   AS  PERMISSION_EARLY_DAY
        ,0                                   AS  PERMISSION_EARLY_TIME
        ,''                                  AS  ITEM_RESERVE_FIELD
        ,''                                  AS  INHERI_FIELD_B_ITEM
        ,''                                  AS  INHERI_FIELD_C_ITEM
        ,0                                   AS  MULTI_AOURCE_TYP
        ,''                                  AS  PERSON_CD
        ,''                                  AS  DEPT_CD
        ,''                                  AS  PJ_CD
        ,''                                  AS  SEG_CONTENTS1
        ,''                                  AS  SEG_CONTENTS2
        ,''                                  AS  SEG_CONTENTS3
        ,''                                  AS  SEG_CONTENTS4
        ,'6001'                              AS  COST_CLASS_01_TYP
        ,''                                  AS  COST_CLASS_01_CD
        ,''                                  AS  COST_CLASS_01_NAME
        ,'6002'                              AS  COST_CLASS_02_TYP
        ,''                                  AS  COST_CLASS_02_CD
        ,''                                  AS  COST_CLASS_02_NAME
        ,'6003'                              AS  COST_CLASS_03_TYP
        ,''                                  AS  COST_CLASS_03_CD
        ,''                                  AS  COST_CLASS_03_NAME
        ,'6004'                              AS  COST_CLASS_04_TYP
        ,''                                  AS  COST_CLASS_04_CD
        ,''                                  AS  COST_CLASS_04_NAME
        ,'6005'                              AS  COST_CLASS_05_TYP
        ,''                                  AS  COST_CLASS_05_CD
        ,''                                  AS  COST_CLASS_05_NAME
        ,MI.CREATED_DATE                     AS  CREATED_DATE
        ,MI.CREATED_BY                       AS  CREATED_BY
        ,MI.CREATED_PRG_NM                   AS  CREATED_PRG_NM
        ,MI.UPDATED_DATE                     AS  UPDATED_DATE
        ,MI.UPDATED_BY                       AS  UPDATED_BY
        ,MI.UPDATED_PRG_NM                   AS  UPDATED_PRG_NM
        ,MI.MODIFY_COUNT                     AS  MODIFY_COUNT
FROM    M_ITEM MI
       ,M_PLANT MP
/
COMMENT ON TABLE M_PLANT_ITEM                            IS '�H��ʕi�ڃ}�X�^�r���['
/
COMMENT ON COLUMN M_PLANT_ITEM.PLANT_CD                  IS  '�H��R�[�h'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CD                   IS  '�i�ڔԍ�'
/
COMMENT ON COLUMN M_PLANT_ITEM.DRAW_CD                   IS  '�}�ʔԍ�'
/
COMMENT ON COLUMN M_PLANT_ITEM.SPEC                      IS  '�K�i'
/
COMMENT ON COLUMN M_PLANT_ITEM.HIGH_LEVEL_NO             IS  '���x���ԍ�'
/
COMMENT ON COLUMN M_PLANT_ITEM.MRP_ODR_TYP               IS  '�i�ڎ�z�敪'
/
COMMENT ON COLUMN M_PLANT_ITEM.OUTSIDE_TYP               IS  '��\���O��敪'
/
COMMENT ON COLUMN M_PLANT_ITEM.STOCK_UNIT_FLG            IS  '�׎p�Ǘ��t���O'
/
COMMENT ON COLUMN M_PLANT_ITEM.PKG_UNIT                  IS  '�׎p�v�ʒP��'
/
COMMENT ON COLUMN M_PLANT_ITEM.PKG_UNIT_QTY              IS  '�׎p�P�ʐ�'
/
COMMENT ON COLUMN M_PLANT_ITEM.ISSUE_TYP                 IS  '�o�ɋ敪'
/
COMMENT ON COLUMN M_PLANT_ITEM.MPS_FLG                   IS  'MPS�i�ڃt���O'
/
COMMENT ON COLUMN M_PLANT_ITEM.ACPT_INSPC_TYP            IS  '��������敪'
/
COMMENT ON COLUMN M_PLANT_ITEM.PRODUCT_TYP               IS  '���i�敪'
/
COMMENT ON COLUMN M_PLANT_ITEM.CLASIFICATION_CD          IS  '�Ǘ��R�[�h'
/
COMMENT ON COLUMN M_PLANT_ITEM.UNIT_WEIGHT               IS  '�P�ʏd��'
/
COMMENT ON COLUMN M_PLANT_ITEM.ABC_TYP                   IS  '�I���敪'
/
COMMENT ON COLUMN M_PLANT_ITEM.OPR_RSLT_TYP              IS  '��Ǝ��ы敪'
/
COMMENT ON COLUMN M_PLANT_ITEM.SPL_ITEM_TYP              IS  '�󋋕i�敪'
/
COMMENT ON COLUMN M_PLANT_ITEM.TAX_CD                    IS  '����ŃR�[�h'
/
COMMENT ON COLUMN M_PLANT_ITEM.CAL_NO                    IS  '�J�����_�ԍ�'
/
COMMENT ON COLUMN M_PLANT_ITEM.BEST_BEFORE_YEAR          IS  '�ܖ������N��'
/
COMMENT ON COLUMN M_PLANT_ITEM.BEST_BEFORE_MONTH         IS  '�ܖ���������'
/
COMMENT ON COLUMN M_PLANT_ITEM.BEST_BEFORE_DAY           IS  '�ܖ���������'
/
COMMENT ON COLUMN M_PLANT_ITEM.SHIP_DEADLINE_YEAR        IS  '�o�׊����N��'
/
COMMENT ON COLUMN M_PLANT_ITEM.SHIP_DEADLINE_MONTH       IS  '�o�׊�������'
/
COMMENT ON COLUMN M_PLANT_ITEM.SHIP_DEADLINE_DAY         IS  '�o�׊�������'
/
COMMENT ON COLUMN M_PLANT_ITEM.LOT_CTRL_FLG              IS  '���b�g�Ǘ��t���O'
/
COMMENT ON COLUMN M_PLANT_ITEM.LOT_NUMBERING_TYP         IS  '���b�g�ԍ��̔ԋ敪'
/
COMMENT ON COLUMN M_PLANT_ITEM.ODR_UNIT                  IS  '�󒍒P��'
/
COMMENT ON COLUMN M_PLANT_ITEM.ODR_UNIT_QTY              IS  '�󒍒P�ʐ�'
/
COMMENT ON COLUMN M_PLANT_ITEM.MAX_STOCK_QTY             IS  '�ő�݌ɐ�'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_01_TYP         IS  '�i�ڕ��ނO�P'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_01_CD          IS  '�i�ڕ��ނO�P�R�[�h'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_01_NAME        IS  '�i�ڕ��ނO�P����'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_02_TYP         IS  '�i�ڕ��ނO�Q'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_02_CD          IS  '�i�ڕ��ނO�Q�R�[�h'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_02_NAME        IS  '�i�ڕ��ނO�Q����'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_03_TYP         IS  '�i�ڕ��ނO�R'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_03_CD          IS  '�i�ڕ��ނO�R�R�[�h'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_03_NAME        IS  '�i�ڕ��ނO�R����'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_04_TYP         IS  '�i�ڕ��ނO�S'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_04_CD          IS  '�i�ڕ��ނO�S�R�[�h'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_04_NAME        IS  '�i�ڕ��ނO�S����'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_05_TYP         IS  '�i�ڕ��ނO�T'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_05_CD          IS  '�i�ڕ��ނO�T�R�[�h'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_05_NAME        IS  '�i�ڕ��ނO�T����'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_06_TYP         IS  '�i�ڕ��ނO�U'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_06_CD          IS  '�i�ڕ��ނO�U�R�[�h'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_06_NAME        IS  '�i�ڕ��ނO�U����'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_07_TYP         IS  '�i�ڕ��ނO�V'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_07_CD          IS  '�i�ڕ��ނO�V�R�[�h'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_07_NAME        IS  '�i�ڕ��ނO�V����'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_08_TYP         IS  '�i�ڕ��ނO�W'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_08_CD          IS  '�i�ڕ��ނO�W�R�[�h'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_08_NAME        IS  '�i�ڕ��ނO�W����'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_09_TYP         IS  '�i�ڕ��ނO�X'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_09_CD          IS  '�i�ڕ��ނO�X�R�[�h'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_09_NAME        IS  '�i�ڕ��ނO�X����'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_10_TYP         IS  '�i�ڕ��ނP�O'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_10_CD          IS  '�i�ڕ��ނP�O�R�[�h'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_10_NAME        IS  '�i�ڕ��ނP�O����'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_11_TYP         IS  '�i�ڕ��ނP�P'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_11_CD          IS  '�i�ڕ��ނP�P�R�[�h'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_11_NAME        IS  '�i�ڕ��ނP�P����'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_12_TYP         IS  '�i�ڕ��ނP�Q'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_12_CD          IS  '�i�ڕ��ނP�Q�R�[�h'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_12_NAME        IS  '�i�ڕ��ނP�Q����'
/
COMMENT ON COLUMN M_PLANT_ITEM.DEPO_TYP                  IS  '�ۊǋ敪'
/
COMMENT ON COLUMN M_PLANT_ITEM.JANCODE                   IS  'JAN�R�[�h'
/
COMMENT ON COLUMN M_PLANT_ITEM.PATTERN_CD                IS  '��\�p�^�[���R�[�h'
/
COMMENT ON COLUMN M_PLANT_ITEM.PRD_CD                    IS  '���Y�ꏊ'
/
COMMENT ON COLUMN M_PLANT_ITEM.SET_LT                    IS  '�Z�b�g���[�h�^�C��'
/
COMMENT ON COLUMN M_PLANT_ITEM.BEST_BEFORE_DATE_LT       IS  '�ܖ��������[�h�^�C��'
/
COMMENT ON COLUMN M_PLANT_ITEM.REMARK1                   IS  '���l�P'
/
COMMENT ON COLUMN M_PLANT_ITEM.REMARK2                   IS  '���l�Q'
/
COMMENT ON COLUMN M_PLANT_ITEM.MANHOUR_TYP               IS  '�H���Ǘ��i�ڋ敪'
/
COMMENT ON COLUMN M_PLANT_ITEM.OPR_PROC_TYP              IS  '��\��Ƌ敪'
/
COMMENT ON COLUMN M_PLANT_ITEM.LOT_TYP                   IS  '���b�g���'
/
COMMENT ON COLUMN M_PLANT_ITEM.SITE_NO                   IS  '�Ǘ����_�ԍ�'
/
COMMENT ON COLUMN M_PLANT_ITEM.SHIFT_CALC_TYP            IS  '�V�t�g�v�Z���@'
/
COMMENT ON COLUMN M_PLANT_ITEM.CALC_TIME_DAYS            IS  '�����v�Z�Ώۊ���'
/
COMMENT ON COLUMN M_PLANT_ITEM.SAFTY_STOCK_METHOD_TYP    IS  '���S�݌Ɋm�ە���'
/
COMMENT ON COLUMN M_PLANT_ITEM.SAFTY_STOCK_COND_FLG      IS  '���S�݌Ɋm�ۏ���'
/
COMMENT ON COLUMN M_PLANT_ITEM.SAFTY_STOCK_WXHAUST_FLG   IS  '���S�݌Ɏg�؂�敪'
/
COMMENT ON COLUMN M_PLANT_ITEM.SAFTY_STOCK               IS  '���S�݌ɗ�'
/
COMMENT ON COLUMN M_PLANT_ITEM.SAFTY_STOCK_PERIOD        IS  '���S�݌Ɋ���'
/
COMMENT ON COLUMN M_PLANT_ITEM.SAFTY_STOCK_RATIO         IS  '���S�݌ɔ䗦'
/
COMMENT ON COLUMN M_PLANT_ITEM.SAFTY_STOCK_MNT_PERIOD    IS  '���S�݌Ɋm�ۊJ�n����'
/
COMMENT ON COLUMN M_PLANT_ITEM.SAFTY_STOCK_MNT_DAYS      IS  '���S�݌Ɋm�ۓ���'
/
COMMENT ON COLUMN M_PLANT_ITEM.GROSS_PERIOD_ADD_DAYS     IS  '�O���X���ԉ��Z����'
/
COMMENT ON COLUMN M_PLANT_ITEM.FIXED_MESH_SIZE_TYP       IS  '�Œ胁�b�V����'
/
COMMENT ON COLUMN M_PLANT_ITEM.DYNAMIC_MESH_SIZE         IS  '���I���b�V����'
/
COMMENT ON COLUMN M_PLANT_ITEM.ISSUE_DATE_SET_TYP        IS  '�o�ɉ\���ݒ�^�C�v'
/
COMMENT ON COLUMN M_PLANT_ITEM.MAX_PERIOD                IS  '�ő�܂Ƃߊ���'
/
COMMENT ON COLUMN M_PLANT_ITEM.MAX_PERIOD_MIN            IS  '�ő�܂Ƃߊ���(����)'
/
COMMENT ON COLUMN M_PLANT_ITEM.MAX_PERIOD_QTY            IS  '�ő�܂Ƃߐ���'
/
COMMENT ON COLUMN M_PLANT_ITEM.ODR_POINT                 IS  '�����_�݌�'
/
COMMENT ON COLUMN M_PLANT_ITEM.FIXED_ODR_QTY             IS  '��ʔ�������'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_SPOIL                IS  '�i�ڎd����'
/
COMMENT ON COLUMN M_PLANT_ITEM.LOCK_STATUS_TYP           IS  '���b�N�X�e�[�^�X'
/
COMMENT ON COLUMN M_PLANT_ITEM.ISSUE_CTRL_TYP            IS  '�o�ɊǗ��敪'
/
COMMENT ON COLUMN M_PLANT_ITEM.DM_RELEASE_CATEGORY       IS  '�f�}���h�����[�X�J�e�S��'
/
COMMENT ON COLUMN M_PLANT_ITEM.DM_OUTPUT_CATEGORY        IS  '�f�}���h�o�̓J�e�S��'
/
COMMENT ON COLUMN M_PLANT_ITEM.ACPT_PLAN_CATEGORY        IS  '����\����W��J�e�S��'
/
COMMENT ON COLUMN M_PLANT_ITEM.PARTITION_SUM_FLG         IS  '�p�[�e�B�V�����W��L��'
/
COMMENT ON COLUMN M_PLANT_ITEM.EXHAUSION_FLG             IS  '�g���؂�v�Z�Ώۃt���O'
/
COMMENT ON COLUMN M_PLANT_ITEM.PERMISSION_EARLY_DAY      IS  '���e��������'
/
COMMENT ON COLUMN M_PLANT_ITEM.PERMISSION_EARLY_TIME     IS  '���e��������'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_RESERVE_FIELD        IS  '�i�ڗ\���t�B�[���h'
/
COMMENT ON COLUMN M_PLANT_ITEM.INHERI_FIELD_B_ITEM       IS  '�p�����ڂa�i�i�ځj'
/
COMMENT ON COLUMN M_PLANT_ITEM.INHERI_FIELD_C_ITEM       IS  '�p�����ڂb�i�i�ځj'
/
COMMENT ON COLUMN M_PLANT_ITEM.MULTI_AOURCE_TYP          IS  '��z�挈�����'
/
COMMENT ON COLUMN M_PLANT_ITEM.PERSON_CD                 IS  '�S���҃R�[�h'
/
COMMENT ON COLUMN M_PLANT_ITEM.DEPT_CD                   IS  '���S����R�[�h'
/
COMMENT ON COLUMN M_PLANT_ITEM.PJ_CD                     IS  '�v���W�F�N�g�R�[�h'
/
COMMENT ON COLUMN M_PLANT_ITEM.SEG_CONTENTS1             IS  '�Z�O�����g1'
/
COMMENT ON COLUMN M_PLANT_ITEM.SEG_CONTENTS2             IS  '�Z�O�����g2'
/
COMMENT ON COLUMN M_PLANT_ITEM.SEG_CONTENTS3             IS  '�Z�O�����g3'
/
COMMENT ON COLUMN M_PLANT_ITEM.SEG_CONTENTS4             IS  '�Z�O�����g4'
/
COMMENT ON COLUMN M_PLANT_ITEM.COST_CLASS_01_TYP         IS  '�������ނO�P'
/
COMMENT ON COLUMN M_PLANT_ITEM.COST_CLASS_01_CD          IS  '�������ނO�P�R�[�h'
/
COMMENT ON COLUMN M_PLANT_ITEM.COST_CLASS_01_NAME        IS  '�������ނO�P����'
/
COMMENT ON COLUMN M_PLANT_ITEM.COST_CLASS_02_TYP         IS  '�������ނO�Q'
/
COMMENT ON COLUMN M_PLANT_ITEM.COST_CLASS_02_CD          IS  '�������ނO�Q�R�[�h'
/
COMMENT ON COLUMN M_PLANT_ITEM.COST_CLASS_02_NAME        IS  '�������ނO�Q����'
/
COMMENT ON COLUMN M_PLANT_ITEM.COST_CLASS_03_TYP         IS  '�������ނO�R'
/
COMMENT ON COLUMN M_PLANT_ITEM.COST_CLASS_03_CD          IS  '�������ނO�R�R�[�h'
/
COMMENT ON COLUMN M_PLANT_ITEM.COST_CLASS_03_NAME        IS  '�������ނO3����'
/
COMMENT ON COLUMN M_PLANT_ITEM.COST_CLASS_04_TYP         IS  '�������ނO4'
/
COMMENT ON COLUMN M_PLANT_ITEM.COST_CLASS_04_CD          IS  '�������ނO4�R�[�h'
/
COMMENT ON COLUMN M_PLANT_ITEM.COST_CLASS_04_NAME        IS  '�������ނO4����'
/
COMMENT ON COLUMN M_PLANT_ITEM.COST_CLASS_05_TYP         IS  '�������ނO�T'
/
COMMENT ON COLUMN M_PLANT_ITEM.COST_CLASS_05_CD          IS  '�������ނO�T�R�[�h'
/
COMMENT ON COLUMN M_PLANT_ITEM.COST_CLASS_05_NAME        IS  '�������ނO�T����'
/
COMMENT ON COLUMN M_PLANT_ITEM.CREATED_DATE              IS  '�쐬��'
/
COMMENT ON COLUMN M_PLANT_ITEM.CREATED_BY                IS  '�쐬��'
/
COMMENT ON COLUMN M_PLANT_ITEM.CREATED_PRG_NM            IS  '�쐬�v���O������'
/
COMMENT ON COLUMN M_PLANT_ITEM.UPDATED_DATE              IS  '�X�V��'
/
COMMENT ON COLUMN M_PLANT_ITEM.UPDATED_BY                IS  '�X�V��'
/
COMMENT ON COLUMN M_PLANT_ITEM.UPDATED_PRG_NM            IS  '�X�V�v���O������'
/
COMMENT ON COLUMN M_PLANT_ITEM.MODIFY_COUNT              IS  '�X�V��'
/
