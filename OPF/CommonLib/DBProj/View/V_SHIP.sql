CREATE OR REPLACE VIEW V_SHIP (
     SHIP_SEQ_NO
    ,COMPANY_CD
    ,ODR_CTL_NO
    ,SLIP_CD
    ,SHIP_ODR_NO
    ,CUST_CD
    ,CUST_ITEM_CD
    ,CUST_ITEM_NAME
    ,ITEM_CD
    ,FINAL_DLV_LOC_CD
    ,CUST_DESINATED_DLV_LOC_CD
    ,CONCENTRATE_DLV_LOC_CD
    ,PART_DLV_SEQ_NO
    ,ORG_SLIP_CD
    ,SLIP_TRN_CD
    ,SHIP_TYP
    ,CUST_ODR_NO
    ,SHIP_WH_CD
    ,SHIP_CTL_TYP
    ,LOC_CD
    ,CUST_DLV_PLAN_TRANS_NO
    ,IN_HOUSE_SHIP_PLAN_TRANS_NO
    ,DESINATED_DLV_DATE
    ,SHIP_DATE
    ,SHIP_QTY
    ,SHIP_UNIT_PRICE
    ,PURPOSE_UNIT_PRICE_TYP
    ,SHIP_AMOUNT
    ,SHIP_AMOUNT_EXCH_RATES
    ,CUR_CD
    ,TRANSPORT_CD
    ,TRANSPORT_TRADER_CD
    ,TEMP_SALES_FLG
    ,SALES_TARGET_FLG
    ,SALES_DEPT_CD
    ,PKG_BOX_CD
    ,PKG_UNIT_QTY
    ,CASE_QTY
    ,CASE_OF_PALETTE_QTY
    ,PALETTE_QTY
    ,SEBANGO
    ,KANBAN_PAPER_QTY
    ,DLV_SLIP_ISS_FLG
    ,SHIP_INFO_SLIP_KIND
    ,SHIP_INDICATION_SLIP_PRINT_FLG
    ,SHIP_INDICATION_SLIP_PRNT_DATE
    ,DLV_SLIP_PRINT_FLG
    ,DLV_SLIP_PRINT_DATE
    ,PRINT_FLG_1
    ,PRINT_DATE_1
    ,PRINT_FLG_2
    ,PRINT_DATE_2
    ,CUS_DLV_KEY_CD
    ,REMARKS
    ,DEL_FLG
    ,CUST_CHRG_PSN_CD
    ,ACPT_PSN_CD
) AS
SELECT   SP.SHIP_SEQ_NO
        ,CP.COMPANY_CD
        ,SP.ODR_NO
        ,SP.SLIP_CD
        ,SP.SHIP_ODR_NO
        ,SP.CUST_CD
        ,SP.CUST_ITEM_CD
        ,MI.CUST_ITEM_NAME
        ,SP.ITEM_CD
        ,SP.DLV_LOC_CD
        ,null
        ,null
        ,SP.PART_DLV_SEQ_NO
        ,SP.ORGNAL_SLIP_CD
        ,SP.SLIP_TRN_CD
        ,1
        ,SP.CUST_ODR_NO
        ,SP.ALLCT_WH_CD
        ,1
        ,SP.LOC_CD
        ,null
        ,null
        ,SP.SHIP_DATE
        ,SP.SHIP_DATE
        ,SP.SHIP_QTY
        ,SP.SHIP_UNIT_PRICE
        ,1
        ,SP.SHIP_ODR_AMOUNT
        ,SP.SHIP_ODR_AMOUNT_EXCH_RATES
        ,SP.CURRNCY_CD
        ,null
        ,null
        ,1
        ,1
        ,null
        ,null
        ,null
        ,null
        ,null
        ,null
        ,null
        ,null
        ,0
        ,null
        ,0
        ,null
        ,0
        ,null
        ,0
        ,null
        ,0
        ,null
        ,SP.CUS_DLV_KEY_CD
        ,SP.REMARKS
        ,SP.DEL_FLG
        ,SP.CUST_CHRG_PSN_CD
        ,null
FROM     T_SHIP      SP
        ,M_ITEM_SPEC MI
        ,(SELECT COMPANY_CD FROM SYS_MY_COMPANY
          WHERE CTRL_CD = 'SYSTEM') CP
WHERE    SP.CUST_CD = MI.CUST_CD(+)
  AND    SP.CUST_ITEM_CD = MI.CUST_ITEM_CD(+)
/
COMMENT ON TABLE V_SHIP                                 IS '?o???????r???[?iJ?V???O???j'
/
COMMENT ON COLUMN V_SHIP.SHIP_SEQ_NO                    IS '?o??????????????'
/
COMMENT ON COLUMN V_SHIP.COMPANY_CD                     IS '?????R?[?h'
/
COMMENT ON COLUMN V_SHIP.ODR_CTL_NO                     IS '????????????'
/
COMMENT ON COLUMN V_SHIP.SLIP_CD                        IS '?`?[????'
/
COMMENT ON COLUMN V_SHIP.SHIP_ODR_NO                    IS '?o???w??????'
/
COMMENT ON COLUMN V_SHIP.CUST_CD                        IS '???????R?[?h'
/
COMMENT ON COLUMN V_SHIP.CUST_ITEM_CD                   IS '???????i??????'
/
COMMENT ON COLUMN V_SHIP.CUST_ITEM_NAME                 IS '???????i??????'
/
COMMENT ON COLUMN V_SHIP.ITEM_CD                        IS '?i??????'
/
COMMENT ON COLUMN V_SHIP.FINAL_DLV_LOC_CD               IS '???I?[?i?????R?[?h'
/
COMMENT ON COLUMN V_SHIP.CUST_DESINATED_DLV_LOC_CD      IS '???????w???[?i?????R?[?h'
/
COMMENT ON COLUMN V_SHIP.CONCENTRATE_DLV_LOC_CD         IS '?W?????[?i?????R?[?h'
/
COMMENT ON COLUMN V_SHIP.PART_DLV_SEQ_NO                IS '???[????'
/
COMMENT ON COLUMN V_SHIP.ORG_SLIP_CD                    IS '???`?[????'
/
COMMENT ON COLUMN V_SHIP.SLIP_TRN_CD                    IS '?`?[????'
/
COMMENT ON COLUMN V_SHIP.SHIP_TYP                       IS '?o??????'
/
COMMENT ON COLUMN V_SHIP.CUST_ODR_NO                    IS '??????????????'
/
COMMENT ON COLUMN V_SHIP.SHIP_WH_CD                     IS '?o???q???R?[?h'
/
COMMENT ON COLUMN V_SHIP.SHIP_CTL_TYP                   IS '?o????????????'
/
COMMENT ON COLUMN V_SHIP.LOC_CD                         IS '???P?[?V????????'
/
COMMENT ON COLUMN V_SHIP.CUST_DLV_PLAN_TRANS_NO         IS '???????[???\????????'
/
COMMENT ON COLUMN V_SHIP.IN_HOUSE_SHIP_PLAN_TRANS_NO    IS '?????o???\????????'
/
COMMENT ON COLUMN V_SHIP.DESINATED_DLV_DATE             IS '?w???[??'
/
COMMENT ON COLUMN V_SHIP.SHIP_DATE                      IS '?o????????'
/
COMMENT ON COLUMN V_SHIP.SHIP_QTY                       IS '?o??????????'
/
COMMENT ON COLUMN V_SHIP.SHIP_UNIT_PRICE                IS '?P??'
/
COMMENT ON COLUMN V_SHIP.PURPOSE_UNIT_PRICE_TYP         IS '?p?r???P??????'
/
COMMENT ON COLUMN V_SHIP.SHIP_AMOUNT                    IS '?o?????????z'
/
COMMENT ON COLUMN V_SHIP.SHIP_AMOUNT_EXCH_RATES         IS '?o?????????z?i?M???j'
/
COMMENT ON COLUMN V_SHIP.CUR_CD                         IS '?????R?[?h'
/
COMMENT ON COLUMN V_SHIP.TRANSPORT_CD                   IS '?^?????R?[?h'
/
COMMENT ON COLUMN V_SHIP.TRANSPORT_TRADER_CD            IS '?^???????R?[?h'
/
COMMENT ON COLUMN V_SHIP.TEMP_SALES_FLG                 IS '???????v???t???O'
/
COMMENT ON COLUMN V_SHIP.SALES_TARGET_FLG               IS '?????v???????t???O'
/
COMMENT ON COLUMN V_SHIP.SALES_DEPT_CD                  IS '?????v???????R?[?h'
/
COMMENT ON COLUMN V_SHIP.PKG_BOX_CD                     IS '?????R?[?h'
/
COMMENT ON COLUMN V_SHIP.PKG_UNIT_QTY                   IS '???p?P??????'
/
COMMENT ON COLUMN V_SHIP.CASE_QTY                       IS '????'
/
COMMENT ON COLUMN V_SHIP.CASE_OF_PALETTE_QTY            IS '?p???b?g????'
/
COMMENT ON COLUMN V_SHIP.PALETTE_QTY                    IS '?p???b?g??'
/
COMMENT ON COLUMN V_SHIP.SEBANGO                        IS '?w????'
/
COMMENT ON COLUMN V_SHIP.KANBAN_PAPER_QTY               IS '????????????'
/
COMMENT ON COLUMN V_SHIP.DLV_SLIP_ISS_FLG               IS '?[?i?????s?t???O'
/
COMMENT ON COLUMN V_SHIP.SHIP_INFO_SLIP_KIND            IS '?o????????????'
/
COMMENT ON COLUMN V_SHIP.SHIP_INDICATION_SLIP_PRINT_FLG IS '?o?????????o???t???O'
/
COMMENT ON COLUMN V_SHIP.SHIP_INDICATION_SLIP_PRNT_DATE IS '?o?????????o??????'
/
COMMENT ON COLUMN V_SHIP.DLV_SLIP_PRINT_FLG             IS '?[?i???o???t???O'
/
COMMENT ON COLUMN V_SHIP.DLV_SLIP_PRINT_DATE            IS '?[?i???o??????'
/
COMMENT ON COLUMN V_SHIP.PRINT_FLG_1                    IS '???[?o???t???O?i?\???P?j'
/
COMMENT ON COLUMN V_SHIP.PRINT_DATE_1                   IS '???[?o???????i?\???P?j'
/
COMMENT ON COLUMN V_SHIP.PRINT_FLG_2                    IS '???[?o???t???O?i?\???Q?j'
/
COMMENT ON COLUMN V_SHIP.PRINT_DATE_2                   IS '???[?o???????i?\???Q?j'
/
COMMENT ON COLUMN V_SHIP.CUS_DLV_KEY_CD                 IS '?[?i?L?[????'
/
COMMENT ON COLUMN V_SHIP.REMARKS                        IS '???l'
/
COMMENT ON COLUMN V_SHIP.DEL_FLG                        IS '?????t???O'
/
COMMENT ON COLUMN V_SHIP.CUST_CHRG_PSN_CD               IS '?c???S?????R?[?h'
/
COMMENT ON COLUMN V_SHIP.ACPT_PSN_CD                    IS '???s?S?????R?[?h'
/
