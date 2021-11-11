CREATE OR REPLACE VIEW V_WH_STOCK_LST_LOT
    (PLANT_CD,WH_CD,WH_NAME,DISPLAY_NAME,VEND_CD,VEND_ANAME,ITEM_CD,ITEM_NAME,
    LOT_NO,JOB_ODR_CD,STOCK_ON_HAND_QTY,DEFECT_QTY,PRVS_DAYEND_STOCK_QTY,
    PRVS_MONTHEND_STOCK_QTY,STOCK_UNIT,SUPPLY_KBN)
AS
SELECT
    PLANT_CD,
    WH_CD,
    WH_NAME,
    DISPLAY_NAME,
    VEND_CD,
    VEND_ANAME,
    ITEM_CD,
    ITEM_NAME,
    LOT_NO,
    JOB_ODR_CD,
    STOCK_ON_HAND_QTY,
    DEFECT_QTY,
    PRVS_DAYEND_STOCK_QTY,
    PRVS_MONTHEND_STOCK_QTY,
    STOCK_UNIT,
    SUPPLY_KBN
 from (
 	SELECT
	    T_LOT_STOCK.PLANT_CD,
	    T_LOT_STOCK.WH_CD,
	    M_WH.WH_NAME,
	    SYS_TYPE_VALUE.VALUE as DISPLAY_NAME,
	    M_WH.VEND_CD,
	    M_VEND_CTRL.VEND_ANAME,
	    T_LOT_STOCK.ITEM_CD,
	    M_ITEM.ITEM_NAME,
            T_LOT_STOCK.LOT_NO,
	    null as JOB_ODR_CD,
	    T_LOT_STOCK.STOCK_ON_HAND_QTY,
	    T_LOT_STOCK.DEFECT_QTY,
            null as PRVS_DAYEND_STOCK_QTY,
            null as PRVS_MONTHEND_STOCK_QTY,
	    M_ITEM.STOCK_UNIT,
	    (CASE WHEN M_WH.VEND_CD is null THEN
			(SELECT VALUE FROM SYS_TYPE_VALUE WHERE NAME='CONS_TYP' AND VALUE = 0)
		WHEN M_WH.VEND_CD is not null THEN (
			SELECT
				(CASE WHEN ONEROUS_FLG = 0 THEN
					(SELECT VALUE FROM SYS_TYPE_VALUE WHERE NAME='CONS_TYP' AND VALUE = 2)
				WHEN ONEROUS_FLG = 1 THEN
					(SELECT VALUE FROM SYS_TYPE_VALUE WHERE NAME='CONS_TYP' AND VALUE = 1)
				 END)
			FROM
				M_CONS_UNIT_COST
			WHERE
				COMPANY_CD = (
					SELECT
						COMPANY_CD
					FROM
						SYS_MY_COMPANY
					WHERE
						CTRL_CD = 'SYSTEM'
					)
			AND
				VEND_CD = M_WH.VEND_CD
			AND
				PLANT_CD = M_WH.PLANT_CD
			AND
				ITEM_CD =  T_LOT_STOCK.ITEM_CD
			AND
				EFF_PHASE_IN_DATE = (
				SELECT
					MAX(EFF_PHASE_IN_DATE)
				FROM
					M_CONS_UNIT_COST
				WHERE
					COMPANY_CD = (
						SELECT
							COMPANY_CD
						FROM
							SYS_MY_COMPANY
						WHERE
							CTRL_CD = 'SYSTEM'
						)
				AND
					VEND_CD = M_WH.VEND_CD
				AND
					PLANT_CD = M_WH.PLANT_CD
	            AND
					ITEM_CD =  T_LOT_STOCK.ITEM_CD
				AND
					EFF_PHASE_IN_DATE <= (
						SELECT
							BUSINESS_OPR_DATE
						FROM
							SYS_DATE_CTRL
						WHERE
							PLANT_CD = M_WH.PLANT_CD
						)
				)
		)
		END ) as SUPPLY_KBN
	FROM
	    T_LOT_STOCK,
	    M_WH,
	    M_VEND_CTRL,
	    M_ITEM,
	    SYS_TYPE_VALUE
	WHERE
	    SYS_TYPE_VALUE.NAME = 'MRP_FLG'
	AND
		SYS_TYPE_VALUE.VALUE = M_WH.MRP_FLG
	AND
		T_LOT_STOCK.WH_CD = M_WH.WH_CD
	AND
		M_WH.COMPANY_CD = M_VEND_CTRL.COMPANY_CD(+)
	AND
	    M_WH.VEND_CD = M_VEND_CTRL.VEND_CD(+)
	AND
	   T_LOT_STOCK.ITEM_CD = M_ITEM.ITEM_CD
)
/
COMMENT ON TABLE V_WH_STOCK_LST_LOT IS 'ロット別在庫一覧ビュー'
/
COMMENT ON COLUMN V_WH_STOCK_LST_LOT.PLANT_CD IS '工場コード'
/
COMMENT ON COLUMN V_WH_STOCK_LST_LOT.WH_CD IS '保管区コード'
/
COMMENT ON COLUMN V_WH_STOCK_LST_LOT.WH_NAME IS '保管区名'
/
COMMENT ON COLUMN V_WH_STOCK_LST_LOT.DISPLAY_NAME IS '所要量計算対象フラグ'
/
COMMENT ON COLUMN V_WH_STOCK_LST_LOT.VEND_CD IS '取引先コード'
/
COMMENT ON COLUMN V_WH_STOCK_LST_LOT.VEND_ANAME IS '取引先略称'
/
COMMENT ON COLUMN V_WH_STOCK_LST_LOT.ITEM_CD IS '品目番号'
/
COMMENT ON COLUMN V_WH_STOCK_LST_LOT.ITEM_NAME IS '品目名'
/
COMMENT ON COLUMN V_WH_STOCK_LST_LOT.LOT_NO IS '在庫ロット番号'
/
COMMENT ON COLUMN V_WH_STOCK_LST_LOT.JOB_ODR_CD IS '製番'
/
COMMENT ON COLUMN V_WH_STOCK_LST_LOT.STOCK_ON_HAND_QTY IS 'ロット別手持在庫'
/
COMMENT ON COLUMN V_WH_STOCK_LST_LOT.DEFECT_QTY IS 'ロット別不良数'
/
COMMENT ON COLUMN V_WH_STOCK_LST_LOT.PRVS_DAYEND_STOCK_QTY IS '品目別前日末在庫数'
/
COMMENT ON COLUMN V_WH_STOCK_LST_LOT.PRVS_MONTHEND_STOCK_QTY IS '品目別前月末在庫数'
/
COMMENT ON COLUMN V_WH_STOCK_LST_LOT.STOCK_UNIT IS '計量単位'
/
COMMENT ON COLUMN V_WH_STOCK_LST_LOT.SUPPLY_KBN IS '支給区分'
/
