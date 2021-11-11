CREATE OR REPLACE VIEW V_SUPPLIED_ISSUE_LIST
    (PLANT_CD
    ,PLANT_NAME
    ,VEND_CD
    ,VEND_NAME
    ,ITEM_CD
    ,ITEM_NAME
    ,JOB_ODR_CD
    ,CONS_TYP_DN
    ,SCDL_ISSUE_DATE
    ,ISSUE_INST_QTY
    ,TOTAL_ISSUE_QTY
    ,STOCK_UNIT
    ,UNIT_COST
    ,CUR_UNIT
    ,DECIMAL_FIG
    ,ROUND_TYP
    ,ISSUE_INST_AMOUNT)
AS
select
    T_ISSUE_INST."PLANT_CD"                                      as "PLANT_CD",
    M_PLANT."PLANT_NAME"                                         as "PLANT_NAME",
    T_ISSUE_INST."VEND_CD"                                       as "VEND_CD",
    M_VEND_CTRL."VEND_NAME"                                      as "VEND_NAME",
    T_ISSUE_INST."ITEM_CD"                                       as "ITEM_CD",
    M_ITEM."ITEM_NAME"                                           as "ITEM_NAME",
    T_OD."JOB_ODR_CD"                                            as "JOB_ODR_CD",
    T_ISSUE_INST.CONS_TYP                                        as "CONS_TYP_DN",
    T_ISSUE_INST."SCDL_ISSUE_DATE"                               as "SCDL_ISSUE_DATE",
    to_char(T_ISSUE_INST."ISSUE_INST_QTY")                       as "ISSUE_INST_QTY",
    to_char(T_ISSUE_INST."TOTAL_ISSUE_QTY")                      as "TOTAL_ISSUE_QTY",
    M_ITEM."STOCK_UNIT"                                          as "STOCK_UNIT",
    to_char(decode(T_ISSUE_INST.CONS_TYP, 2, 0, T2."UNIT_COST")) as "UNIT_COST",
    decode(T_ISSUE_INST.CONS_TYP, 2, '', M_CUR."CUR_UNIT")       as "CUR_UNIT",
    to_char(M_CUR."DECIMAL_FIG")                                 as "DECIMAL_FIG",
    to_char(M_VEND_CTRL."ROUND_TYP")                             as "ROUND_TYP",
    CASE
      WHEN  decode(T_ISSUE_INST.CONS_TYP, 2, 0, T2."UNIT_COST") IS NOT NULL
               AND T_ISSUE_INST.TOTAL_ISSUE_QTY  IS NOT NULL
               AND M_VEND_CTRL.ROUND_TYP IS NOT NULL
               AND M_CUR.DECIMAL_FIG IS NOT NULL
      THEN decode(T_ISSUE_INST.CONS_TYP, 2, 0, T2."UNIT_COST") * T_ISSUE_INST.ISSUE_INST_QTY
    END AS ISSUE_INST_AMOUNT
from
  T_ISSUE_INST,
  M_PLANT,
  M_VEND_CTRL,
  M_ITEM,
  M_CUR,
  SYS_HOME_CUR,
  T_OD,
  (
    select
      T_ISSUE_INST."ISSUE_INST_CD" as "ISSUE_INST_CD",
      M_CONS_UNIT_COST."UNIT_COST" as "UNIT_COST"
    from
      T_ISSUE_INST,
      M_CONS_UNIT_COST,
      (
        select
          T_ISSUE_INST."ISSUE_INST_CD" as "ISSUE_INST_CD",
          max(M_CONS_UNIT_COST."EFF_PHASE_IN_DATE") as "MAX_EFF_PHASE_IN_DATE"
        from
          T_ISSUE_INST,
          M_CONS_UNIT_COST
        where
          T_ISSUE_INST.COMPANY_CD = M_CONS_UNIT_COST.COMPANY_CD
          and T_ISSUE_INST.VEND_CD = M_CONS_UNIT_COST.VEND_CD
          and T_ISSUE_INST.PLANT_CD = M_CONS_UNIT_COST.PLANT_CD
          and T_ISSUE_INST.ITEM_CD = M_CONS_UNIT_COST.ITEM_CD
          and T_ISSUE_INST.SCDL_ISSUE_DATE >= M_CONS_UNIT_COST.EFF_PHASE_IN_DATE
        group by
          T_ISSUE_INST.ISSUE_INST_CD
      ) T1
    where
      T_ISSUE_INST.COMPANY_CD = M_CONS_UNIT_COST.COMPANY_CD
      and T_ISSUE_INST.VEND_CD = M_CONS_UNIT_COST.VEND_CD
      and T_ISSUE_INST.PLANT_CD = M_CONS_UNIT_COST.PLANT_CD
      and T_ISSUE_INST.ITEM_CD = M_CONS_UNIT_COST.ITEM_CD
      and T_ISSUE_INST.ISSUE_INST_CD = T1.ISSUE_INST_CD
      and T1.MAX_EFF_PHASE_IN_DATE = M_CONS_UNIT_COST.EFF_PHASE_IN_DATE
  ) T2
where
  T_ISSUE_INST.PLANT_CD = M_PLANT.PLANT_CD(+)
  and T_ISSUE_INST.COMPANY_CD = M_VEND_CTRL.COMPANY_CD(+)
  and T_ISSUE_INST.VEND_CD = M_VEND_CTRL.VEND_CD(+)
  and T_ISSUE_INST.ITEM_CD = M_ITEM.ITEM_CD(+)
  and T_ISSUE_INST.OD_NO = T_OD.OD_NO(+)
  and T_ISSUE_INST.ISSUE_INST_CD = T2.ISSUE_INST_CD(+)
  and M_CUR.CUR_CD = nvl(M_VEND_CTRL.CUR_CD, SYS_HOME_CUR.HOME_CUR_CD)
  and 'SYSTEM' = SYS_HOME_CUR.CTRL_CD(+)
  and T_ISSUE_INST."PUCH_ODR_CD" is not null
  and T_ISSUE_INST."WORK_ODR_CD" IS NULL
  and T_ISSUE_INST."ISSUE_CMPLT_FLG" = 0
/
