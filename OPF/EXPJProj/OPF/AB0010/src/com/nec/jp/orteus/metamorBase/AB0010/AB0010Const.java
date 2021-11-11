/**
 * CLASS     : AB0010Const クラス
 * ファイル・クラス説明
 * @author $Author: gao-yang $
 * @version $Revision: 1.3 $ $Date: 2009/04/14 03:48:20 $
 *
 */
package com.nec.jp.orteus.metamorBase.AB0010;



/**
 * AZ0040共通 定数定義インタフェースクラス
 * @author  Y.Hashimoto
 * @version 1.00
 * @see 
 */
public interface AB0010Const
{
	//--------------------------------------------------------------------------
	/** リソースバンドル基底名(辞書) */
	public final static String C_DICNAME = "OrteusUserDic";
	
	/** 辞書の「過去」キー */
	public final static String C_KEYWORD_PAST = "Expj.Cmt0030";

	//--------------------------------------------------------------------------
	// M_ITEM 品目手配区分(MRP_ODR_TYP)

	/** 品目手配区分:ロット手配品目 */
	public final static String C_ODR_LOT = "5";
}
