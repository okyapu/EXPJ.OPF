//------------------------------------------------------------------------------
/**
 * CLASS     : AA0030Common クラス
 * ファイル・クラス説明
 * @author $Author: suganuma $
 * @version $Revision: 1.4 $ $Date: 2009/02/04 02:52:51 $
 *
 */
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.AA0030;

/**
 * AA00300定義
 */
class AA0030Common
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

}
