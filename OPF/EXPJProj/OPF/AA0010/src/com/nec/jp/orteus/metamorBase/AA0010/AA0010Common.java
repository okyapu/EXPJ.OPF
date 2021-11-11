//------------------------------------------------------------------------------
// (#)AA0010Common.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.AA0010;

/**
 * AA00100定義
 * @author  Y.Inada
 * @version 1.00
 */
class AA0010Common
{
	/** レベル番号 */
	final static String _HIGH_LEVEL_NO = new String("1");

	/** レベル番号 デフォルト値[DB] */
	final static String _HIGH_LEVEL_NO_DB = new String("0");


	/** 出庫区分 */
	final static Integer _ISSUE_TYP = new Integer(1);

	/** 品目手配区分 */
	final static Integer _MRP_ODR_TYP = new Integer(1);

	/** 内外作区分 */
	final static Integer _OUTSIDE_TYP = new Integer(1);

	/** 荷姿管理フラグ */
	final static Integer _STOCK_UNIT_FLG = new Integer(0);


	/** 荷姿単位数 */
	final static String _PKG_UNIT_QTY = new String("1.0");

	/** 荷姿単位数 デフォルト値[DB] */
	final static String _PKG_UNIT_QTY_DB = new String("0.0");


	/** 在庫数単位区分 */
	final static Integer _UNIT_QTY_TYP = new Integer(1);

	/** 品目手配リードタイム */
	final static String _ODR_LT = new String("0");

	/** 品目固定分リードタイム */
	final static String _FIXED_LT = new String("0");

	/** 品目比例分リードタイム */
	final static String _PROP_LT = new String("0");

	/** 安全日数 */
	final static String _SAFETY_LT = new String("0");

	/** 払出リードタイム */
	final static String _ISSUE_LT = new String("0");

	/** 品目比例分ロットサイズ */
	final static String _PROP_LOT_SIZE = new String("1.0");

	/** 品目仕損率 */
	final static String _ITEM_SPOIL = new String("0.0");

	/** 安全在庫量 */
	final static String _SAFETY_STOCK = new String("0.0");

	/** ロットまとめ区分 */
	final static Integer _LOT_SIZING_TYP = new Integer(1);


	/** 最大まとめ期間 */
	final static String _MAX_PERIOD = new String("1");

	/** 最大まとめ期間 デフォルト値[DB] */
	final static String _MAX_PERIOD_DB = new String("0");


	/** 最大手配数 */
	final static String _MAX_ODR_QTY = new String("99999999999999.0000");

	/** 最大手配数 デフォルト値[DB] */
	final static String _MAX_ODR_QTY_DB = new String("0.0");


	/** 発注点在庫数 */
	final static String _ODR_POINT = new String("0.0");


	/** 定量発注数 */
	//final static String _FIXED_ODR_QTY = new String("99999999999999.0000");
	final static String _FIXED_ODR_QTY = new String("0.0");

	/** 定量発注数 デフォルト値[DB] */
	final static String _FIXED_ODR_QTY_DB = new String("0.0");


	/** 最小手配数 */
	final static String _MIN_ODR_QTY = new String("0.0");


	/** まるめ単位 */
	final static String _MUL_ODR_QTY = new String("1.0");

	/** まるめ単位 デフォルト値[DB] */
	final static String _MUL_ODR_QTY_DB = new String("0.0");

// 2008/07/14 SYSCOM 小林 ADD START
	/** 工数管理品目区分 */
	final static Integer _MANHOUR_TYP = new Integer(0);
// 2008/07/14 SYSCOM 小林 ADD END

	/** MPS品目フラグ */
	final static Integer _MPS_FLG = new Integer(0);

	/** 受入検査区分 */
	final static Integer _ACPT_INSPC_TYP = new Integer(1);

	/** 製品区分 */
	final static Integer _PRODUCT_TYP = new Integer(1);

	/** 単位重量 */
	final static String _UNIT_WEIGHT = new String("0.0");

	/** 棚卸区分 */
	final static Integer _ABC_TYP = new Integer(0);

	/** 作業実績区分 */
	final static Integer _OPR_RSLT_TYP = new Integer(2);

	/** 受給品区分 */
	final static Integer _SPL_ITEM_TYP = new Integer(0);
	
	/** 保管区分 */
	final static Integer _DEPO_TYP = new Integer(1); 
	
	/** ロット管理フラグ */
	final static Integer _LOT_CTRL_FLG = new Integer(0); 
	
	/** ロット採番区分 */
	final static Integer _LOT_NUMBERING_TYP = new Integer(1); 
	
	/** 大分類区分 */
	final static String CLASS_CD = new String("30");
	/** 中分類区分00 */
	final static String CLASS_CD00 = new String("00");
	/** 中分類区分01 */
	final static String CLASS_CD01 = new String("01");
	/** 中分類区分02 */
	final static String CLASS_CD02 = new String("02");
	/** 中分類区分03 */
	final static String CLASS_CD03 = new String("03");
	/** 中分類区分04 */
	final static String CLASS_CD04 = new String("04");
	/** 中分類区分05 */
	final static String CLASS_CD05 = new String("05");
	/** 中分類区分06 */
	final static String CLASS_CD06 = new String("06");
	/** 中分類区分07 */
	final static String CLASS_CD07 = new String("07");
	/** 中分類区分08 */
	final static String CLASS_CD08 = new String("08");
	/** 中分類区分09 */
	final static String CLASS_CD09 = new String("09");
	/** 中分類区分10 */
	final static String CLASS_CD10 = new String("10");
	/** 中分類区分11 */
	final static String CLASS_CD11 = new String("11");
	/** 中分類区分12 */
	final static String CLASS_CD12 = new String("12");	
	
}
