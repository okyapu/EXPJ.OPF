CREATE OR REPLACE VIEW M_SOURCE (
     COMPANY_CD
    ,PLANT_CD
    ,ITEM_CD
    ,SPLIT_PRIORITY
    ,SOURCE_CD
    ,EFF_PHASE_IN_DATE
    ,EFF_PHASE_OUT_DATE
    ,SHIFT_CALC_TYP
    ,CAL_NO
    ,SPLIT_QTY
    ,SPLIT_RATE
    ,MIN_ODR_QTY
    ,MUL_ODR_QTY
    ,ISSUE_LT
    ,RCV_LT
    ,TRANS_LT
    ,FIXED_LT
    ,PROP_LT
    ,ODR_LT
    ,ISSUE_LT_MIN
    ,RCV_LT_MIN
    ,TRANS_LT_MIN
    ,FIXED_LT_MIN
    ,PROP_LT_MIN
    ,ODR_LT_MIN
    ,STD_LOT_SIZE
    ,MAX_LOT_SIZE
    ,SAFTY_LT
    ,SAFTY_LT_MIN
    ,ODR_RELEASE_CATEGORY
    ,ODR_OUTPUT_CATEGORY
    ,DLV_REVISION_CATEGORY
    ,CARRY_DATE_TOTAL_CATEGORY
    ,ODR_DATE_TOTAL_CATEGORY
    ,OUTSIDE_TYP
    ,PERSON_CD
    ,RELEASE_NO_CD
    ,ROUTING_NO
    ,INSPC_DATE
    ,SOURCE_RESERVE_FIELD
    ,ODR_PUCH_TYP
    ,OPR_PROC_TYP
    ,REMARK
    ,SOURCE_PLANT_CD
    ,SOURCE_VEND_CD
    ,SOURCE_NAME
    ,INTERNAL_SEQ_NO
) AS
SELECT   (SELECT COMPANY_CD FROM SYS_MY_COMPANY SMC
             WHERE SMC.CTRL_CD = 'SYSTEM')                                 AS  COMPANY_CD
        ,MP.PLANT_CD                                                       AS  PLANT_CD
        ,MI.ITEM_CD                                                        AS  ITEM_CD
        ,1                                                                 AS  SPLIT_PRIORITY
        ,'*'                                                               AS  SOURCE_CD
        ,TO_DATE('1900/01/01','YYYY/MM/DD')                                AS  EFF_PHASE_IN_DATE
        ,TO_DATE('9999/12/31','YYYY/MM/DD')                                AS  EFF_PHASE_OUT_DATE
        ,1                                                                 AS  SHIFT_CALC_TYP
        ,NVL(MI.CAL_NO, MP.CAL_NO)                                         AS  CAL_NO
        ,0                                                                 AS  SPLIT_QTY
        ,0                                                                 AS  SPLIT_RATE
        ,NVL((CASE WHEN MI.MIN_ODR_QTY > 99999999.9999 THEN 99999999.9999
              ELSE MI.MIN_ODR_QTY END), 0)                                 AS  MIN_ODR_QTY
        ,NVL((CASE WHEN MI.MUL_ODR_QTY > 99999999.9999 THEN 99999999.9999
              ELSE MI.MUL_ODR_QTY END), 0)                                 AS  MUL_ODR_QTY
        ,0                                                                 AS  ISSUE_LT
        ,0                                                                 AS  RCV_LT
        ,0                                                                 AS  TRANS_LT
        ,NVL((CASE WHEN MI.FIXED_LT > 999 THEN 999
              ELSE MI.FIXED_LT END), 0)                                    AS  FIXED_LT
        ,NVL((CASE WHEN MI.PROP_LT > 999 THEN 999
              ELSE MI.PROP_LT END), 0)                                     AS  PROP_LT
        ,NVL((CASE WHEN MI.ODR_LT > 999 THEN 999
              ELSE MI.ODR_LT END), 0)                                      AS  ODR_LT
        ,0                                                                 AS  ISSUE_LT_MIN
        ,0                                                                 AS  RCV_LT_MIN
        ,0                                                                 AS  TRANS_LT_MIN
        ,0                                                                 AS  FIXED_LT_MIN
        ,0                                                                 AS  PROP_LT_MIN
        ,0                                                                 AS  ODR_LT_MIN
        ,NVL((CASE WHEN MI.PROP_LOT_SIZE > 99999999.9999 THEN 99999999.9999
              ELSE MI.PROP_LOT_SIZE END), 0)                               AS  STD_LOT_SIZE
        ,NVL((CASE WHEN MI.MAX_ODR_QTY > 99999999.9999 THEN 99999999.9999
              ELSE MI.MAX_ODR_QTY END), 0)                                 AS  MAX_LOT_SIZE
        ,NVL((CASE WHEN MI.SAFETY_LT > 999 THEN 999
              ELSE MI.SAFETY_LT END), 0)                                   AS  SAFTY_LT
        ,0                                                                 AS  SAFTY_LT_MIN
        ,NULL                                                              AS  ODR_RELEASE_CATEGORY
        ,NULL                                                              AS  ODR_OUTPUT_CATEGORY
        ,NULL                                                              AS  DLV_REVISION_CATEGORY
        ,NULL                                                              AS  CARRY_DATE_TOTAL_CATEGORY
        ,NULL                                                              AS  ODR_DATE_TOTAL_CATEGORY
        ,MI.OUTSIDE_TYP                                                    AS  OUTSIDE_TYP
        ,NULL                                                              AS  PERSON_CD
        ,NULL                                                              AS  RELEASE_NO_CD
        ,NULL                                                              AS  ROUTING_NO
        ,NULL                                                              AS  INSPC_DATE
        ,NULL                                                              AS  SOURCE_RESERVE_FIELD
        ,4                                                                 AS  ODR_PUCH_TYP
        ,1                                                                 AS  OPR_PROC_TYP
        ,NULL                                                              AS  REMARK
        ,MP.PLANT_CD                                                       AS  SOURCE_PLANT_CD
        ,M_PROC_GRP.WS_CD                                                  AS  SOURCE_VEND_CD
        ,MW.WS_NAME                                                        AS  SOURCE_NAME
        ,0                                                                 AS  INTERNAL_SEQ_NO
FROM    M_ITEM MI
       ,M_PLANT MP
       ,M_WS MW
       ,M_PROC_GRP
       ,(SELECT 
          MIN(MPG.PROC_NO)       AS PROC_NO
         ,MPG.PLANT_CD           AS PLANT_CD
         ,MPG.ITEM_CD            AS ITEM_CD
        FROM
          M_PROC_GRP MPG
        GROUP BY
          MPG.PLANT_CD
         ,MPG.ITEM_CD
          ) MPG
 WHERE MI.OUTSIDE_TYP = '1'
   AND MP.PLANT_CD = M_PROC_GRP.PLANT_CD
   AND MI.ITEM_CD = M_PROC_GRP.ITEM_CD
   AND M_PROC_GRP.WS_CD = MW.WS_CD(+)
   AND M_PROC_GRP.PLANT_CD = MPG.PLANT_CD
   AND M_PROC_GRP.ITEM_CD = MPG.ITEM_CD
   AND M_PROC_GRP.PROC_NO = MPG.PROC_NO
UNION
SELECT   (SELECT COMPANY_CD FROM SYS_MY_COMPANY SMC
             WHERE SMC.CTRL_CD = 'SYSTEM')                                 AS  COMPANY_CD
        ,MP.PLANT_CD                                                       AS  PLANT_CD
        ,MI.ITEM_CD                                                        AS  ITEM_CD
        ,(CASE WHEN M_PUCH_UNIT_COST_H.PUCH_PRIORITY_REF_NO > 99 THEN 99
          ELSE M_PUCH_UNIT_COST_H.PUCH_PRIORITY_REF_NO END)                AS  SPLIT_PRIORITY
        ,'*'                                                               AS  SOURCE_CD
        ,M_PUCH_UNIT_COST_ADD_OUT_DATE.EFF_PHASE_IN_DATE                   AS  EFF_PHASE_IN_DATE
        ,M_PUCH_UNIT_COST_ADD_OUT_DATE.EFF_PHASE_OUT_DATE                  AS  EFF_PHASE_OUT_DATE
        ,1                                                                 AS  SHIFT_CALC_TYP
        ,NVL(MI.CAL_NO, MP.CAL_NO)                                         AS  CAL_NO
        ,0                                                                 AS  SPLIT_QTY
        ,0                                                                 AS  SPLIT_RATE
        ,NVL((CASE WHEN MI.MIN_ODR_QTY > 99999999.9999 THEN 99999999.9999
              ELSE MI.MIN_ODR_QTY END), 0)                                 AS  MIN_ODR_QTY
        ,NVL((CASE WHEN MI.MUL_ODR_QTY > 99999999.9999 THEN 99999999.9999
              ELSE MI.MUL_ODR_QTY END), 0)                                 AS  MUL_ODR_QTY
        ,0                                                                 AS  ISSUE_LT
        ,0                                                                 AS  RCV_LT
        ,0                                                                 AS  TRANS_LT
        ,NVL((CASE WHEN MI.FIXED_LT > 999 THEN 999
              ELSE MI.FIXED_LT END), 0)                                    AS  FIXED_LT
        ,NVL((CASE WHEN MI.PROP_LT > 999 THEN 999
              ELSE MI.PROP_LT END), 0)                                     AS  PROP_LT
        ,NVL((CASE WHEN MI.ODR_LT > 999 THEN 999
              ELSE MI.ODR_LT END), 0)                                      AS  ODR_LT
        ,0                                                                 AS  ISSUE_LT_MIN
        ,0                                                                 AS  RCV_LT_MIN
        ,0                                                                 AS  TRANS_LT_MIN
        ,0                                                                 AS  FIXED_LT_MIN
        ,0                                                                 AS  PROP_LT_MIN
        ,0                                                                 AS  ODR_LT_MIN
        ,NVL((CASE WHEN MI.PROP_LOT_SIZE > 99999999.9999 THEN 99999999.9999
              ELSE MI.PROP_LOT_SIZE END), 0)                               AS  STD_LOT_SIZE
        ,NVL((CASE WHEN MI.MAX_ODR_QTY > 99999999.9999 THEN 99999999.9999
              ELSE MI.MAX_ODR_QTY END), 0)                                 AS  MAX_LOT_SIZE
        ,NVL((CASE WHEN MI.SAFETY_LT > 999 THEN 999
              ELSE MI.SAFETY_LT END), 0)                                   AS  SAFTY_LT
        ,0                                                                 AS  SAFTY_LT_MIN
        ,NULL                                                              AS  ODR_RELEASE_CATEGORY
        ,NULL                                                              AS  ODR_OUTPUT_CATEGORY
        ,NULL                                                              AS  DLV_REVISION_CATEGORY
        ,NULL                                                              AS  CARRY_DATE_TOTAL_CATEGORY
        ,NULL                                                              AS  ODR_DATE_TOTAL_CATEGORY
        ,MI.OUTSIDE_TYP                                                    AS  OUTSIDE_TYP
        ,NULL                                                              AS  PERSON_CD
        ,NULL                                                              AS  RELEASE_NO_CD
        ,NULL                                                              AS  ROUTING_NO
        ,NULL                                                              AS  INSPC_DATE
        ,NULL                                                              AS  SOURCE_RESERVE_FIELD
        ,1                                                                 AS  ODR_PUCH_TYP
        ,3                                                                 AS  OPR_PROC_TYP
        ,NULL                                                              AS  REMARK
        ,NULL                                                              AS  SOURCE_PLANT_CD
        ,M_PUCH_UNIT_COST_ADD_OUT_DATE.VEND_CD                             AS  SOURCE_VEND_CD
        ,MVC.VEND_NAME                                                     AS  SOURCE_NAME
        ,0                                                                 AS  INTERNAL_SEQ_NO
FROM    M_ITEM MI
       ,M_PLANT MP
       ,M_VEND_CTRL MVC
       ,M_PUCH_UNIT_COST_H
       ,(SELECT
          MPUC.VEND_CD               AS VEND_CD
         ,MAX(MPUC.PUCH_SIZE)        AS PUCH_SIZE
         ,MPUC.COMPANY_CD            AS COMPANY_CD
         ,MPUC.PLANT_CD              AS PLANT_CD
         ,MPUC.ITEM_CD               AS ITEM_CD
        FROM
          M_PUCH_UNIT_COST MPUC
        GROUP BY
           MPUC.VEND_CD
          ,MPUC.COMPANY_CD
          ,MPUC.PLANT_CD
          ,MPUC.ITEM_CD
          ) MPUC
       ,(SELECT
           MPUC_1.COMPANY_CD
          ,MPUC_1.VEND_CD
          ,MPUC_1.PLANT_CD
          ,MPUC_1.ITEM_CD
          ,MPUC_1.EFF_PHASE_IN_DATE
          ,NVL(TO_DATE(MPUC_2.EFF_PHASE_IN_DATE-1),'9999/12/31') AS EFF_PHASE_OUT_DATE
          ,MPUC_1.PUCH_SIZE
        FROM 
          (SELECT
            ROW_ID
           ,COMPANY_CD
           ,VEND_CD
           ,PLANT_CD
           ,ITEM_CD
           ,EFF_PHASE_IN_DATE
           ,PUCH_SIZE
          FROM
           (SELECT
             ROW_NUMBER() OVER(
              ORDER BY
                COMPANY_CD
               ,VEND_CD
               ,PLANT_CD
               ,ITEM_CD
               ,EFF_PHASE_IN_DATE
               ,PUCH_SIZE
              ) ROW_ID
             ,COMPANY_CD
             ,VEND_CD
             ,PLANT_CD
             ,ITEM_CD
             ,EFF_PHASE_IN_DATE
             ,PUCH_SIZE
            FROM
             M_PUCH_UNIT_COST
            ORDER BY
              COMPANY_CD
             ,VEND_CD
             ,PLANT_CD
             ,ITEM_CD
             ,EFF_PHASE_IN_DATE
             ,PUCH_SIZE
            )
          ) MPUC_1
         ,(SELECT
            ROW_ID
           ,COMPANY_CD
           ,VEND_CD
           ,PLANT_CD
           ,ITEM_CD
           ,EFF_PHASE_IN_DATE
           ,PUCH_SIZE
          FROM
           (SELECT
             ROW_NUMBER() OVER(
              ORDER BY
                COMPANY_CD
               ,VEND_CD
               ,PLANT_CD
               ,ITEM_CD
               ,EFF_PHASE_IN_DATE
               ,PUCH_SIZE
              )-1 ROW_ID
             ,COMPANY_CD
             ,VEND_CD
             ,PLANT_CD
             ,ITEM_CD
             ,EFF_PHASE_IN_DATE
             ,PUCH_SIZE
            FROM
             M_PUCH_UNIT_COST
            ORDER BY
              COMPANY_CD
             ,VEND_CD
             ,PLANT_CD
             ,ITEM_CD
             ,EFF_PHASE_IN_DATE
             ,PUCH_SIZE
            )
          ) MPUC_2
        WHERE MPUC_1.ROW_ID = MPUC_2.ROW_ID(+)
        AND MPUC_1.COMPANY_CD = MPUC_2.COMPANY_CD(+)
        AND MPUC_1.VEND_CD = MPUC_2.VEND_CD(+)
        AND MPUC_1.PLANT_CD = MPUC_2.PLANT_CD(+)
        AND MPUC_1.ITEM_CD = MPUC_2.ITEM_CD(+)
        AND MPUC_1.PUCH_SIZE = MPUC_2.PUCH_SIZE(+)
        ) M_PUCH_UNIT_COST_ADD_OUT_DATE
 WHERE MI.OUTSIDE_TYP = '2'
  AND MP.PLANT_CD = MPUC.PLANT_CD
  AND MI.ITEM_CD = MPUC.ITEM_CD
  AND M_PUCH_UNIT_COST_ADD_OUT_DATE.VEND_CD = MVC.VEND_CD
  AND M_PUCH_UNIT_COST_ADD_OUT_DATE.COMPANY_CD = MPUC.COMPANY_CD
  AND M_PUCH_UNIT_COST_ADD_OUT_DATE.VEND_CD = MPUC.VEND_CD
  AND M_PUCH_UNIT_COST_ADD_OUT_DATE.PLANT_CD = MPUC.PLANT_CD
  AND M_PUCH_UNIT_COST_ADD_OUT_DATE.ITEM_CD = MPUC.ITEM_CD
  AND M_PUCH_UNIT_COST_ADD_OUT_DATE.PUCH_SIZE = MPUC.PUCH_SIZE
  AND M_PUCH_UNIT_COST_ADD_OUT_DATE.COMPANY_CD = M_PUCH_UNIT_COST_H.COMPANY_CD
  AND M_PUCH_UNIT_COST_ADD_OUT_DATE.VEND_CD = M_PUCH_UNIT_COST_H.VEND_CD
  AND M_PUCH_UNIT_COST_ADD_OUT_DATE.PLANT_CD = M_PUCH_UNIT_COST_H.PLANT_CD
  AND M_PUCH_UNIT_COST_ADD_OUT_DATE.ITEM_CD = M_PUCH_UNIT_COST_H.ITEM_CD
/
COMMENT ON TABLE M_SOURCE               IS '手配先情報ビュー'
/
COMMENT ON COLUMN M_SOURCE.COMPANY_CD                IS '会社コード'
/
COMMENT ON COLUMN M_SOURCE.PLANT_CD                  IS '工場コード'
/
COMMENT ON COLUMN M_SOURCE.ITEM_CD                   IS '品目番号'
/
COMMENT ON COLUMN M_SOURCE.SPLIT_PRIORITY            IS '分割優先順位'
/
COMMENT ON COLUMN M_SOURCE.SOURCE_CD                 IS '手配先コード'
/
COMMENT ON COLUMN M_SOURCE.EFF_PHASE_IN_DATE         IS '有効開始日'
/
COMMENT ON COLUMN M_SOURCE.EFF_PHASE_OUT_DATE        IS '有効終了日'
/
COMMENT ON COLUMN M_SOURCE.SHIFT_CALC_TYP            IS 'シフト計算方法'
/
COMMENT ON COLUMN M_SOURCE.CAL_NO                    IS 'カレンダ番号'
/
COMMENT ON COLUMN M_SOURCE.SPLIT_QTY                 IS '分割数量'
/
COMMENT ON COLUMN M_SOURCE.SPLIT_RATE                IS '分割比率'
/
COMMENT ON COLUMN M_SOURCE.MIN_ODR_QTY               IS '最小手配数'
/
COMMENT ON COLUMN M_SOURCE.MUL_ODR_QTY               IS 'まるめ単位'
/
COMMENT ON COLUMN M_SOURCE.ISSUE_LT                  IS '出庫リードタイム'
/
COMMENT ON COLUMN M_SOURCE.RCV_LT                    IS '入庫リードタイム'
/
COMMENT ON COLUMN M_SOURCE.TRANS_LT                  IS '輸送リードタイム'
/
COMMENT ON COLUMN M_SOURCE.FIXED_LT                  IS '製造リードタイム（固定）'
/
COMMENT ON COLUMN M_SOURCE.PROP_LT                   IS '製造リードタイム（比例）'
/
COMMENT ON COLUMN M_SOURCE.ODR_LT                    IS '手配リードタイム'
/
COMMENT ON COLUMN M_SOURCE.ISSUE_LT_MIN              IS '出庫リードタイム(時間)'
/
COMMENT ON COLUMN M_SOURCE.RCV_LT_MIN                IS '入庫リードタイム(時間)'
/
COMMENT ON COLUMN M_SOURCE.TRANS_LT_MIN              IS '輸送リードタイム(時間)'
/
COMMENT ON COLUMN M_SOURCE.FIXED_LT_MIN              IS '製造リードタイム（固定）(時間)'
/
COMMENT ON COLUMN M_SOURCE.PROP_LT_MIN               IS '製造リードタイム（比例）(時間)'
/
COMMENT ON COLUMN M_SOURCE.ODR_LT_MIN                IS '手配リードタイム(時間)'
/
COMMENT ON COLUMN M_SOURCE.STD_LOT_SIZE              IS '標準ロットサイズ'
/
COMMENT ON COLUMN M_SOURCE.MAX_LOT_SIZE              IS '最大ロットサイズ'
/
COMMENT ON COLUMN M_SOURCE.SAFTY_LT                  IS '安全日数'
/
COMMENT ON COLUMN M_SOURCE.SAFTY_LT_MIN              IS '安全時間'
/
COMMENT ON COLUMN M_SOURCE.ODR_RELEASE_CATEGORY      IS 'オーダリリースカテゴリ'
/
COMMENT ON COLUMN M_SOURCE.ODR_OUTPUT_CATEGORY       IS 'オーダ出力カテゴリ'
/
COMMENT ON COLUMN M_SOURCE.DLV_REVISION_CATEGORY     IS '納期補正カテゴリ'
/
COMMENT ON COLUMN M_SOURCE.CARRY_DATE_TOTAL_CATEGORY IS '搬出予定日集約カテゴリ'
/
COMMENT ON COLUMN M_SOURCE.ODR_DATE_TOTAL_CATEGORY   IS '手配予定日集約カテゴリ'
/
COMMENT ON COLUMN M_SOURCE.OUTSIDE_TYP               IS '内外作区分'
/
COMMENT ON COLUMN M_SOURCE.PERSON_CD                 IS '担当者コード'
/
COMMENT ON COLUMN M_SOURCE.RELEASE_NO_CD             IS 'リリースＮＯコード'
/
COMMENT ON COLUMN M_SOURCE.ROUTING_NO                IS '手順番号'
/
COMMENT ON COLUMN M_SOURCE.INSPC_DATE                IS '検収日'
/
COMMENT ON COLUMN M_SOURCE.SOURCE_RESERVE_FIELD      IS '手配先予備フィールド'
/
COMMENT ON COLUMN M_SOURCE.ODR_PUCH_TYP              IS '受発注区分'
/
COMMENT ON COLUMN M_SOURCE.OPR_PROC_TYP              IS '作業区分'
/
COMMENT ON COLUMN M_SOURCE.REMARK                    IS '備考'
/
COMMENT ON COLUMN M_SOURCE.SOURCE_PLANT_CD           IS '手配先工場コード'
/
COMMENT ON COLUMN M_SOURCE.SOURCE_VEND_CD            IS '手配先取引先コード'
/
COMMENT ON COLUMN M_SOURCE.SOURCE_NAME               IS '手配先名称'
/
COMMENT ON COLUMN M_SOURCE.INTERNAL_SEQ_NO           IS '内部連番'
/