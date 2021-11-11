/**
 * CLASS     : AA0020Common クラス
 * 製品構成メンテナンスで使用する静的な初期値を定義
 * @author $Author: kong-haijing $
 * @version $Revision: 1.2 $ $Date: 2007/07/04 07:31:56 $
 *
 */

package com.nec.jp.orteus.metamorBase.AA0020;

class AA0020Common
{
	/** 製品構成版数 */
	final static String _PS_EDITION = new String("1");

	/** 製品構成単位数分母 */
	final static String _PS_UNIT_DENOMINATOR = new String("1.0");

	/** 製品構成単位数分子 */
	final static String _PS_UNIT_NUMERATOR = new String("1.0");

	/** 構成仕損率 */
	final static String _PS_SPOIL = new String("0.0");

	/** 支給区分 */
	final static Integer _CONS_TYP = new Integer(0);

	/** 製品構成リードタイム使用フラグ */
	final static Integer _PS_LT_FLG = new Integer(0);

	/** 製品構成固定分リードタイム */
	final static String _PS_FIXED_LT = new String("0");

	/** 製品構成比例分リードタイム */
	final static String _PS_PROP_LT = new String("0");

	/** 製品構成比例分ロットサイズ */
	final static String _PS_PROP_LOT_SIZE = new String("1.0");

	/** 製品構成照会キー */
	final static String _PS_REF_NO = new String("0");

	/** 原価積上区分 */
	final static Integer _COST_UP_TYP = new Integer(1);

	/** 所要量展開区分 */
	final static Integer _MRP_EXP_TYP = new Integer(1);

}
