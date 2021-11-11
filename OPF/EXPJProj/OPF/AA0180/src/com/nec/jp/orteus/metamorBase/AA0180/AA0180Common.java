//------------------------------------------------------------------------------
/**
 * CLASS     : AA0180Common クラス
 * ファイル・クラス説明
 * @author $Author: wang-derui $
 * @version $Revision: 1.1.1.1 $ $Date: 2008/03/26 06:56:01 $
 *
 */
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.AA0180;

/**
 * AA01800定義
 */
class AA0180Common
{
	/** 作業系列番号 */
	final static String _PROC_NO = new String("0");

	/** 作業系列固定分リードタイム */
	final static String _FIXED_LT = new String("0");

	/** 作業系列比例分リードタイム */
	final static String _PROP_LT = new String("0");

	/** 作業系列安全日数 */
	final static String _SAFETY_LT = new String("0");

	/** 作業系列比例分ロットサイズ */
	final static String _PROP_LOT_SIZE = new String("1.0");

	/** 作業系列仕損率 */
	final static String _SPOIL = new String("0.0");

	/** 作業系列内外作区分 */
	final static Integer _OUTSIDE_TYP = new Integer(1);

	/** 作業系列受入検査区分 */
	final static Integer _ACPT_INSPC_TYP = new Integer(1);

	/** 標準工数 */
	final static String _STANDARD_COST = new String("0.0");

	/** 品目固定分リードタイム */
	final static Long _ITEM_FIXED_LT = new Long(0);

	/** 品目比例分リードタイム */
	final static Long _ITEM_PROP_LT = new Long(0);
	
	/** 品目比例分ロットサイズ */
	final static String _ITEM_PROP_LOT_SIZE = new String("0.0");

	/** 品目払出リードタイム */
	final static Long _ITEM_ISSUE_LT = new Long(0);

	/** 品目安全日数 */
	final static Long _ITEM_SAFETY_LT = new Long(0);
	
	/** 製品構成版数 */
	final static String _PS_EDITION              = new String("1");

	/** 製品構成単位数分母 */
	final static String _PS_UNIT_DENOMINATOR     = new String("1.0");

	/** 製品構成単位数分子 */
	final static String _PS_UNIT_NUMERATOR       = new String("1.0");

	/** 構成仕損率 */
	final static String _PS_SPOIL                = new String("0.0");

	/** 支給区分 */
	final static String _CONS_TYP                = new String("0");

	/** 製品構成リードタイム使用フラグ */
	final static String _PS_LT_FLG               = new String("0");

	/** 製品構成固定分リードタイム */
	final static String _PS_FIXED_LT             = new String("0");

	/** 製品構成比例分リードタイム */
	final static String _PS_PROP_LT              = new String("0");

	/** 製品構成比例分ロットサイズ */
	final static String _PS_PROP_LOT_SIZE        = new String("1.0");

	/** 製品構成照会キー */
	final static String _PS_REF_NO               = new String("0");

	/** 原価積上区分 */
	final static String _COST_UP_TYP             = new String("0");

	/** 所要量展開区分 */
	final static String _MRP_EXP_TYP             = new String("0");
	
	////////////////////////////////////////////////
    //////////     以下、作業系列情報       ////////　　
	////////////////////////////////////////////////
	/** 作業系列番号 */
	final static String  _PR_PROC_NO             = new String("0");

	/** 作業系列固定分リードタイム */
	final static String  _PR_FIXED_LT            = new String("0");

	/** 作業系列比例分リードタイム */
	final static String  _PR_PROP_LT             = new String("0");

	/** 作業系列安全日数 */
	final static String  _PR_SAFETY_LT           = new String("0");

	/** 作業系列比例分ロットサイズ */
	final static String  _PR_PROP_LOT_SIZE       = new String("1.0");

	/** 作業系列仕損率 */
	final static String  _PR_SPOIL               = new String("0.0");

	/** 作業系列内外作区分 */
	final static String _PR_OUTSIDE_TYP          = new String("1");

	/** 作業系列受入検査区分 */
	final static String _PR_ACPT_INSPC_TYP       = new String("1");

	/** 標準工数 */
	final static String  _PR_STANDARD_COST       = new String("0.0");

	/** 品目固定分リードタイム */
	final static Long    _PR_ITEM_FIXED_LT       = new Long(0);

	/** 品目比例分リードタイム */
	final static Long    _PR_ITEM_PROP_LT        = new Long(0);
	
	/** 品目比例分ロットサイズ */
	final static String  _PR_ITEM_PROP_LOT_SIZE  = new String("0.0");

	/** 品目払出リードタイム */
	final static Long    _PR_ITEM_ISSUE_LT       = new Long(0);

	/** 品目安全日数 */
	final static Long    _PR_ITEM_SAFETY_LT      = new Long(0);

}


