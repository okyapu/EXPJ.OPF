/**
 * CLASS     : AB0020Common クラス
 * ファイル・クラス説明
 * @author $Author: kong-haijing $
 * @version $Revision: 1.2 $ $Date: 2007/11/02 03:49:07 $
 *
 */

package com.nec.jp.orteus.metamorBase.AB0020;

/**
 * AB0020定義
 * @author  Y.Inada
 * @version 1.00
 */
public interface AB0020Common
{
	/** 製番種別 */
	final static Integer _JOB_ODR_TYP = new Integer(1);

	/** 計画タイプ */
	final static Integer _PLAN_TYP = new Integer(1);

	/** 手配数量 */
	final static String _JOB_ODR_QTY = new String("0.0");

	/** 製番状態区分 */
	final static Integer _JOB_ODR_STS_TYP = new Integer(2);

	/** 自動採番 */
	final static Integer _AUTO_NUM = new Integer(0);

	/** 休日フラグ:稼動 */
	public final static int c_WORKDAY = 0;
}
