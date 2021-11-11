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
COMMENT ON TABLE V_SHIP                                 IS '出荷実績ビュー（Jシングル）'
/
COMMENT ON COLUMN V_SHIP.SHIP_SEQ_NO                    IS '出荷実績管理番号'
/
COMMENT ON COLUMN V_SHIP.COMPANY_CD                     IS '会社コード'
/
COMMENT ON COLUMN V_SHIP.ODR_CTL_NO                     IS '受注管理番号'
/
COMMENT ON COLUMN V_SHIP.SLIP_CD                        IS '伝票番号'
/
COMMENT ON COLUMN V_SHIP.SHIP_ODR_NO                    IS '出荷指示番号'
/
COMMENT ON COLUMN V_SHIP.CUST_CD                        IS '得意先コード'
/
COMMENT ON COLUMN V_SHIP.CUST_ITEM_CD                   IS '得意先品目番号'
/
COMMENT ON COLUMN V_SHIP.CUST_ITEM_NAME                 IS '得意先品目名称'
/
COMMENT ON COLUMN V_SHIP.ITEM_CD                        IS '品目番号'
/
COMMENT ON COLUMN V_SHIP.FINAL_DLV_LOC_CD               IS '最終納品場所コード'
/
COMMENT ON COLUMN V_SHIP.CUST_DESINATED_DLV_LOC_CD      IS '得意先指定納品場所コード'
/
COMMENT ON COLUMN V_SHIP.CONCENTRATE_DLV_LOC_CD         IS '集結先納品場所コード'
/
COMMENT ON COLUMN V_SHIP.PART_DLV_SEQ_NO                IS '分納項番'
/
COMMENT ON COLUMN V_SHIP.ORG_SLIP_CD                    IS '元伝票番号'
/
COMMENT ON COLUMN V_SHIP.SLIP_TRN_CD                    IS '伝票区分'
/
COMMENT ON COLUMN V_SHIP.SHIP_TYP                       IS '出荷区分'
/
COMMENT ON COLUMN V_SHIP.CUST_ODR_NO                    IS '得意先注文番号'
/
COMMENT ON COLUMN V_SHIP.SHIP_WH_CD                     IS '出荷倉庫コード'
/
COMMENT ON COLUMN V_SHIP.SHIP_CTL_TYP                   IS '出荷管理先区分'
/
COMMENT ON COLUMN V_SHIP.LOC_CD                         IS 'ロケーション番号'
/
COMMENT ON COLUMN V_SHIP.CUST_DLV_PLAN_TRANS_NO         IS '得意先納入予定便番号'
/
COMMENT ON COLUMN V_SHIP.IN_HOUSE_SHIP_PLAN_TRANS_NO    IS '社内出荷予定便番号'
/
COMMENT ON COLUMN V_SHIP.DESINATED_DLV_DATE             IS '指定納期'
/
COMMENT ON COLUMN V_SHIP.SHIP_DATE                      IS '出荷実績日'
/
COMMENT ON COLUMN V_SHIP.SHIP_QTY                       IS '出荷実績数量'
/
COMMENT ON COLUMN V_SHIP.SHIP_UNIT_PRICE                IS '単価'
/
COMMENT ON COLUMN V_SHIP.PURPOSE_UNIT_PRICE_TYP         IS '用途別単価区分'
/
COMMENT ON COLUMN V_SHIP.SHIP_AMOUNT                    IS '出荷実績金額'
/
COMMENT ON COLUMN V_SHIP.SHIP_AMOUNT_EXCH_RATES         IS '出荷実績金額（邦貨）'
/
COMMENT ON COLUMN V_SHIP.CUR_CD                         IS '通貨コード'
/
COMMENT ON COLUMN V_SHIP.TRANSPORT_CD                   IS '運送便コード'
/
COMMENT ON COLUMN V_SHIP.TRANSPORT_TRADER_CD            IS '運送業者コード'
/
COMMENT ON COLUMN V_SHIP.TEMP_SALES_FLG                 IS '仮売上計上フラグ'
/
COMMENT ON COLUMN V_SHIP.SALES_TARGET_FLG               IS '売上計上対象フラグ'
/
COMMENT ON COLUMN V_SHIP.SALES_DEPT_CD                  IS '売上計上部門コード'
/
COMMENT ON COLUMN V_SHIP.PKG_BOX_CD                     IS '箱種コード'
/
COMMENT ON COLUMN V_SHIP.PKG_UNIT_QTY                   IS '荷姿単位数量'
/
COMMENT ON COLUMN V_SHIP.CASE_QTY                       IS '箱数'
/
COMMENT ON COLUMN V_SHIP.CASE_OF_PALETTE_QTY            IS 'パレット箱数'
/
COMMENT ON COLUMN V_SHIP.PALETTE_QTY                    IS 'パレット数'
/
COMMENT ON COLUMN V_SHIP.SEBANGO                        IS '背番号'
/
COMMENT ON COLUMN V_SHIP.KANBAN_PAPER_QTY               IS 'かんばん枚数'
/
COMMENT ON COLUMN V_SHIP.DLV_SLIP_ISS_FLG               IS '納品書発行フラグ'
/
COMMENT ON COLUMN V_SHIP.SHIP_INFO_SLIP_KIND            IS '出荷案内書種別'
/
COMMENT ON COLUMN V_SHIP.SHIP_INDICATION_SLIP_PRINT_FLG IS '出荷案内書出力フラグ'
/
COMMENT ON COLUMN V_SHIP.SHIP_INDICATION_SLIP_PRNT_DATE IS '出荷案内書出力日時'
/
COMMENT ON COLUMN V_SHIP.DLV_SLIP_PRINT_FLG             IS '納品書出力フラグ'
/
COMMENT ON COLUMN V_SHIP.DLV_SLIP_PRINT_DATE            IS '納品書出力日時'
/
COMMENT ON COLUMN V_SHIP.PRINT_FLG_1                    IS '帳票出力フラグ（予備１）'
/
COMMENT ON COLUMN V_SHIP.PRINT_DATE_1                   IS '帳票出力日時（予備１）'
/
COMMENT ON COLUMN V_SHIP.PRINT_FLG_2                    IS '帳票出力フラグ（予備２）'
/
COMMENT ON COLUMN V_SHIP.PRINT_DATE_2                   IS '帳票出力日時（予備２）'
/
COMMENT ON COLUMN V_SHIP.CUS_DLV_KEY_CD                 IS '納品キー番号'
/
COMMENT ON COLUMN V_SHIP.REMARKS                        IS '備考'
/
COMMENT ON COLUMN V_SHIP.DEL_FLG                        IS '削除フラグ'
/
COMMENT ON COLUMN V_SHIP.CUST_CHRG_PSN_CD               IS '営業担当者コード'
/
COMMENT ON COLUMN V_SHIP.ACPT_PSN_CD                    IS '発行担当者コード'
/
