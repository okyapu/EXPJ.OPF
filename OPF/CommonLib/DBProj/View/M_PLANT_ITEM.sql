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
COMMENT ON TABLE M_PLANT_ITEM                            IS '工場別品目マスタビュー'
/
COMMENT ON COLUMN M_PLANT_ITEM.PLANT_CD                  IS  '工場コード'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CD                   IS  '品目番号'
/
COMMENT ON COLUMN M_PLANT_ITEM.DRAW_CD                   IS  '図面番号'
/
COMMENT ON COLUMN M_PLANT_ITEM.SPEC                      IS  '規格'
/
COMMENT ON COLUMN M_PLANT_ITEM.HIGH_LEVEL_NO             IS  'レベル番号'
/
COMMENT ON COLUMN M_PLANT_ITEM.MRP_ODR_TYP               IS  '品目手配区分'
/
COMMENT ON COLUMN M_PLANT_ITEM.OUTSIDE_TYP               IS  '代表内外作区分'
/
COMMENT ON COLUMN M_PLANT_ITEM.STOCK_UNIT_FLG            IS  '荷姿管理フラグ'
/
COMMENT ON COLUMN M_PLANT_ITEM.PKG_UNIT                  IS  '荷姿計量単位'
/
COMMENT ON COLUMN M_PLANT_ITEM.PKG_UNIT_QTY              IS  '荷姿単位数'
/
COMMENT ON COLUMN M_PLANT_ITEM.ISSUE_TYP                 IS  '出庫区分'
/
COMMENT ON COLUMN M_PLANT_ITEM.MPS_FLG                   IS  'MPS品目フラグ'
/
COMMENT ON COLUMN M_PLANT_ITEM.ACPT_INSPC_TYP            IS  '受入検査区分'
/
COMMENT ON COLUMN M_PLANT_ITEM.PRODUCT_TYP               IS  '製品区分'
/
COMMENT ON COLUMN M_PLANT_ITEM.CLASIFICATION_CD          IS  '管理コード'
/
COMMENT ON COLUMN M_PLANT_ITEM.UNIT_WEIGHT               IS  '単位重量'
/
COMMENT ON COLUMN M_PLANT_ITEM.ABC_TYP                   IS  '棚卸区分'
/
COMMENT ON COLUMN M_PLANT_ITEM.OPR_RSLT_TYP              IS  '作業実績区分'
/
COMMENT ON COLUMN M_PLANT_ITEM.SPL_ITEM_TYP              IS  '受給品区分'
/
COMMENT ON COLUMN M_PLANT_ITEM.TAX_CD                    IS  '消費税コード'
/
COMMENT ON COLUMN M_PLANT_ITEM.CAL_NO                    IS  'カレンダ番号'
/
COMMENT ON COLUMN M_PLANT_ITEM.BEST_BEFORE_YEAR          IS  '賞味期限年数'
/
COMMENT ON COLUMN M_PLANT_ITEM.BEST_BEFORE_MONTH         IS  '賞味期限月数'
/
COMMENT ON COLUMN M_PLANT_ITEM.BEST_BEFORE_DAY           IS  '賞味期限日数'
/
COMMENT ON COLUMN M_PLANT_ITEM.SHIP_DEADLINE_YEAR        IS  '出荷期限年数'
/
COMMENT ON COLUMN M_PLANT_ITEM.SHIP_DEADLINE_MONTH       IS  '出荷期限月数'
/
COMMENT ON COLUMN M_PLANT_ITEM.SHIP_DEADLINE_DAY         IS  '出荷期限日数'
/
COMMENT ON COLUMN M_PLANT_ITEM.LOT_CTRL_FLG              IS  'ロット管理フラグ'
/
COMMENT ON COLUMN M_PLANT_ITEM.LOT_NUMBERING_TYP         IS  'ロット番号採番区分'
/
COMMENT ON COLUMN M_PLANT_ITEM.ODR_UNIT                  IS  '受注単位'
/
COMMENT ON COLUMN M_PLANT_ITEM.ODR_UNIT_QTY              IS  '受注単位数'
/
COMMENT ON COLUMN M_PLANT_ITEM.MAX_STOCK_QTY             IS  '最大在庫数'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_01_TYP         IS  '品目分類０１'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_01_CD          IS  '品目分類０１コード'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_01_NAME        IS  '品目分類０１名称'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_02_TYP         IS  '品目分類０２'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_02_CD          IS  '品目分類０２コード'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_02_NAME        IS  '品目分類０２名称'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_03_TYP         IS  '品目分類０３'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_03_CD          IS  '品目分類０３コード'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_03_NAME        IS  '品目分類０３名称'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_04_TYP         IS  '品目分類０４'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_04_CD          IS  '品目分類０４コード'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_04_NAME        IS  '品目分類０４名称'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_05_TYP         IS  '品目分類０５'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_05_CD          IS  '品目分類０５コード'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_05_NAME        IS  '品目分類０５名称'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_06_TYP         IS  '品目分類０６'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_06_CD          IS  '品目分類０６コード'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_06_NAME        IS  '品目分類０６名称'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_07_TYP         IS  '品目分類０７'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_07_CD          IS  '品目分類０７コード'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_07_NAME        IS  '品目分類０７名称'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_08_TYP         IS  '品目分類０８'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_08_CD          IS  '品目分類０８コード'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_08_NAME        IS  '品目分類０８名称'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_09_TYP         IS  '品目分類０９'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_09_CD          IS  '品目分類０９コード'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_09_NAME        IS  '品目分類０９名称'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_10_TYP         IS  '品目分類１０'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_10_CD          IS  '品目分類１０コード'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_10_NAME        IS  '品目分類１０名称'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_11_TYP         IS  '品目分類１１'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_11_CD          IS  '品目分類１１コード'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_11_NAME        IS  '品目分類１１名称'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_12_TYP         IS  '品目分類１２'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_12_CD          IS  '品目分類１２コード'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_CLASS_12_NAME        IS  '品目分類１２名称'
/
COMMENT ON COLUMN M_PLANT_ITEM.DEPO_TYP                  IS  '保管区分'
/
COMMENT ON COLUMN M_PLANT_ITEM.JANCODE                   IS  'JANコード'
/
COMMENT ON COLUMN M_PLANT_ITEM.PATTERN_CD                IS  '代表パターンコード'
/
COMMENT ON COLUMN M_PLANT_ITEM.PRD_CD                    IS  '生産場所'
/
COMMENT ON COLUMN M_PLANT_ITEM.SET_LT                    IS  'セットリードタイム'
/
COMMENT ON COLUMN M_PLANT_ITEM.BEST_BEFORE_DATE_LT       IS  '賞味期限リードタイム'
/
COMMENT ON COLUMN M_PLANT_ITEM.REMARK1                   IS  '備考１'
/
COMMENT ON COLUMN M_PLANT_ITEM.REMARK2                   IS  '備考２'
/
COMMENT ON COLUMN M_PLANT_ITEM.MANHOUR_TYP               IS  '工数管理品目区分'
/
COMMENT ON COLUMN M_PLANT_ITEM.OPR_PROC_TYP              IS  '代表作業区分'
/
COMMENT ON COLUMN M_PLANT_ITEM.LOT_TYP                   IS  'ロット種別'
/
COMMENT ON COLUMN M_PLANT_ITEM.SITE_NO                   IS  '管理拠点番号'
/
COMMENT ON COLUMN M_PLANT_ITEM.SHIFT_CALC_TYP            IS  'シフト計算方法'
/
COMMENT ON COLUMN M_PLANT_ITEM.CALC_TIME_DAYS            IS  '時刻計算対象期間'
/
COMMENT ON COLUMN M_PLANT_ITEM.SAFTY_STOCK_METHOD_TYP    IS  '安全在庫確保方式'
/
COMMENT ON COLUMN M_PLANT_ITEM.SAFTY_STOCK_COND_FLG      IS  '安全在庫確保条件'
/
COMMENT ON COLUMN M_PLANT_ITEM.SAFTY_STOCK_WXHAUST_FLG   IS  '安全在庫使切り区分'
/
COMMENT ON COLUMN M_PLANT_ITEM.SAFTY_STOCK               IS  '安全在庫量'
/
COMMENT ON COLUMN M_PLANT_ITEM.SAFTY_STOCK_PERIOD        IS  '安全在庫期間'
/
COMMENT ON COLUMN M_PLANT_ITEM.SAFTY_STOCK_RATIO         IS  '安全在庫比率'
/
COMMENT ON COLUMN M_PLANT_ITEM.SAFTY_STOCK_MNT_PERIOD    IS  '安全在庫確保開始期間'
/
COMMENT ON COLUMN M_PLANT_ITEM.SAFTY_STOCK_MNT_DAYS      IS  '安全在庫確保日数'
/
COMMENT ON COLUMN M_PLANT_ITEM.GROSS_PERIOD_ADD_DAYS     IS  'グロス期間加算日数'
/
COMMENT ON COLUMN M_PLANT_ITEM.FIXED_MESH_SIZE_TYP       IS  '固定メッシュ巾'
/
COMMENT ON COLUMN M_PLANT_ITEM.DYNAMIC_MESH_SIZE         IS  '動的メッシュ巾'
/
COMMENT ON COLUMN M_PLANT_ITEM.ISSUE_DATE_SET_TYP        IS  '出庫可能日設定タイプ'
/
COMMENT ON COLUMN M_PLANT_ITEM.MAX_PERIOD                IS  '最大まとめ期間'
/
COMMENT ON COLUMN M_PLANT_ITEM.MAX_PERIOD_MIN            IS  '最大まとめ期間(時間)'
/
COMMENT ON COLUMN M_PLANT_ITEM.MAX_PERIOD_QTY            IS  '最大まとめ数量'
/
COMMENT ON COLUMN M_PLANT_ITEM.ODR_POINT                 IS  '発注点在庫'
/
COMMENT ON COLUMN M_PLANT_ITEM.FIXED_ODR_QTY             IS  '定量発注数量'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_SPOIL                IS  '品目仕損率'
/
COMMENT ON COLUMN M_PLANT_ITEM.LOCK_STATUS_TYP           IS  'ロックステータス'
/
COMMENT ON COLUMN M_PLANT_ITEM.ISSUE_CTRL_TYP            IS  '出庫管理区分'
/
COMMENT ON COLUMN M_PLANT_ITEM.DM_RELEASE_CATEGORY       IS  'デマンドリリースカテゴリ'
/
COMMENT ON COLUMN M_PLANT_ITEM.DM_OUTPUT_CATEGORY        IS  'デマンド出力カテゴリ'
/
COMMENT ON COLUMN M_PLANT_ITEM.ACPT_PLAN_CATEGORY        IS  '受入予定日集約カテゴリ'
/
COMMENT ON COLUMN M_PLANT_ITEM.PARTITION_SUM_FLG         IS  'パーティション集約有無'
/
COMMENT ON COLUMN M_PLANT_ITEM.EXHAUSION_FLG             IS  '使い切り計算対象フラグ'
/
COMMENT ON COLUMN M_PLANT_ITEM.PERMISSION_EARLY_DAY      IS  '許容早期日数'
/
COMMENT ON COLUMN M_PLANT_ITEM.PERMISSION_EARLY_TIME     IS  '許容早期時間'
/
COMMENT ON COLUMN M_PLANT_ITEM.ITEM_RESERVE_FIELD        IS  '品目予備フィールド'
/
COMMENT ON COLUMN M_PLANT_ITEM.INHERI_FIELD_B_ITEM       IS  '継承項目Ｂ（品目）'
/
COMMENT ON COLUMN M_PLANT_ITEM.INHERI_FIELD_C_ITEM       IS  '継承項目Ｃ（品目）'
/
COMMENT ON COLUMN M_PLANT_ITEM.MULTI_AOURCE_TYP          IS  '手配先決定方式'
/
COMMENT ON COLUMN M_PLANT_ITEM.PERSON_CD                 IS  '担当者コード'
/
COMMENT ON COLUMN M_PLANT_ITEM.DEPT_CD                   IS  '負担部門コード'
/
COMMENT ON COLUMN M_PLANT_ITEM.PJ_CD                     IS  'プロジェクトコード'
/
COMMENT ON COLUMN M_PLANT_ITEM.SEG_CONTENTS1             IS  'セグメント1'
/
COMMENT ON COLUMN M_PLANT_ITEM.SEG_CONTENTS2             IS  'セグメント2'
/
COMMENT ON COLUMN M_PLANT_ITEM.SEG_CONTENTS3             IS  'セグメント3'
/
COMMENT ON COLUMN M_PLANT_ITEM.SEG_CONTENTS4             IS  'セグメント4'
/
COMMENT ON COLUMN M_PLANT_ITEM.COST_CLASS_01_TYP         IS  '原価分類０１'
/
COMMENT ON COLUMN M_PLANT_ITEM.COST_CLASS_01_CD          IS  '原価分類０１コード'
/
COMMENT ON COLUMN M_PLANT_ITEM.COST_CLASS_01_NAME        IS  '原価分類０１名称'
/
COMMENT ON COLUMN M_PLANT_ITEM.COST_CLASS_02_TYP         IS  '原価分類０２'
/
COMMENT ON COLUMN M_PLANT_ITEM.COST_CLASS_02_CD          IS  '原価分類０２コード'
/
COMMENT ON COLUMN M_PLANT_ITEM.COST_CLASS_02_NAME        IS  '原価分類０２名称'
/
COMMENT ON COLUMN M_PLANT_ITEM.COST_CLASS_03_TYP         IS  '原価分類０３'
/
COMMENT ON COLUMN M_PLANT_ITEM.COST_CLASS_03_CD          IS  '原価分類０３コード'
/
COMMENT ON COLUMN M_PLANT_ITEM.COST_CLASS_03_NAME        IS  '原価分類０3名称'
/
COMMENT ON COLUMN M_PLANT_ITEM.COST_CLASS_04_TYP         IS  '原価分類０4'
/
COMMENT ON COLUMN M_PLANT_ITEM.COST_CLASS_04_CD          IS  '原価分類０4コード'
/
COMMENT ON COLUMN M_PLANT_ITEM.COST_CLASS_04_NAME        IS  '原価分類０4名称'
/
COMMENT ON COLUMN M_PLANT_ITEM.COST_CLASS_05_TYP         IS  '原価分類０５'
/
COMMENT ON COLUMN M_PLANT_ITEM.COST_CLASS_05_CD          IS  '原価分類０５コード'
/
COMMENT ON COLUMN M_PLANT_ITEM.COST_CLASS_05_NAME        IS  '原価分類０５名称'
/
COMMENT ON COLUMN M_PLANT_ITEM.CREATED_DATE              IS  '作成日'
/
COMMENT ON COLUMN M_PLANT_ITEM.CREATED_BY                IS  '作成者'
/
COMMENT ON COLUMN M_PLANT_ITEM.CREATED_PRG_NM            IS  '作成プログラム名'
/
COMMENT ON COLUMN M_PLANT_ITEM.UPDATED_DATE              IS  '更新日'
/
COMMENT ON COLUMN M_PLANT_ITEM.UPDATED_BY                IS  '更新者'
/
COMMENT ON COLUMN M_PLANT_ITEM.UPDATED_PRG_NM            IS  '更新プログラム名'
/
COMMENT ON COLUMN M_PLANT_ITEM.MODIFY_COUNT              IS  '更新数'
/
