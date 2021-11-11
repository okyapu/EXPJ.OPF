//------------------------------------------------------------------------------
/**
 * CLASS     : AC0060Const クラス
 * ファイル・クラス説明
 * @author $Author: izukura $
 * @version $Revision: 1.2 $ $Date: 2007/04/06 07:44:26 $
 *
 */
//-----------------------------------------------------------------------------
package com.nec.jp.orteus.metamorBase.AC0060;

/**
 * AC0060共通 定数定義インタフェースクラス
 */
public interface AC0060Const
{
	//--------------------------------------------------------------------------
	// M_CAL 稼動/非稼動

	/** 稼動 */
	public final static int C_WORKDAY = 0;
	/** 非稼動 */
	public final static int C_HOLIDAY = 1;

	//--------------------------------------------------------------------------
	// M_ITEM 品目手配区分(MRP_ODR_TYP)

	/** 品目手配区分:マニュアル手配品目 */
	public final static String C_ODR_MANUAL = "4";
	/** 品目手配区分:ロット手配品目 */
	public final static String C_ODR_LOT = "5";

	//--------------------------------------------------------------------------
	// M_ITEM 在庫数量単位区分(UNIT_QTY_TYP)

	/** 在庫数量単位区分:整数管理 */
	public final static String C_UNIT_QTY_INTEGER = "1";

	//--------------------------------------------------------------------------
	// T_OD オーダ状態区分(ODR_STS_TYP)

	/** オーダ状態区分:オーダでない */
	public final static String C_ODR_STS_NONE = "0";
	/** オーダ状態区分:計画 */
	public final static String C_ODR_STS_PLAN = "1";

	//--------------------------------------------------------------------------
	// T_OD デマンド状態区分(DM_STS_TYP)

	/** デマンド状態区分:デマンドでない */
	public final static String C_DM_STS_NONE = "0";
	/** デマンド状態区分:計画 */
	public final static String C_DM_STS_PLAN = "1";

	//--------------------------------------------------------------------------
	// T_OD 所要量処理区分(MRP_TYP)

	/** 所要量処理区分:済 */
	public final static String C_MRP_DONE = "9";
	/** 所要量処理区分:追加 */
	public final static String C_MRP_ADD = "1";

	//--------------------------------------------------------------------------
	// T_OD オーダデマンド区分(OD_TYP)

	/** オーダデマンド区分:オーダ */
	public final static String C_KIND_ODER = "2";
	/** オーダデマンド区分:デマンド */
	public final static String C_KIND_DMD = "3";
	
	//--------------------------------------------------------------------------
	// T_OD 外部デマンドフラグ(EXTERNAL_DM_FLG)

	/** 外部デマンドフラグ:内部デマンド */
	public final static String C_EXT_DM_NO = "0";
	/** 外部デマンドフラグ:外部デマンド */
	public final static String C_EXT_DM_YES = "1";

	//--------------------------------------------------------------------------
	// T_OD オーダ発効済みフラグ(ODR_RELEASE_FLG)/同一外部計画のサマリも使用

	/** オーダ発効済フラグ:未 */
	public final static String C_RELEASE_YET = "0";
	/** オーダ発効済フラグ:済 */
	public final static String C_RELEASE_DONE = "1";

	//--------------------------------------------------------------------------
	// T_EXTERNAL_PLAN 削除フラグ(EXTERNAL_PLAN_DEL_FLG)

	/** 外部計画削除フラグ:非 */
	public final static String C_EXT_DEL_NO = "0";
	/** 外部計画削除フラグ:削除対象 */
	public final static String C_EXT_DEL_YES = "1";

	//--------------------------------------------------------------------------
	// T_EXTERNAL_PLAN 処理区分

	/** 外部計画処理区分:追加 */
	public final static String C_EXT_EXP_ADD = "1";
	/** 外部計画処理区分:変更 */
	public final static String C_EXT_EXP_CHANGE = "2";

	//--------------------------------------------------------------------------
	// 画面モード

	/** 画面モード:検索処理 */
	public final static String C_SELECT = "select";
	/** 画面モード:登録 */
	public final static String C_INSERT = "insert";
	/** 画面モード:更新 */
	public final static String C_UPDATE = "udpate";
	/** 画面モード:検索/閉じる以外の処理 */
	public final static String C_NORMAL = "normal";
	/** 画面モード:閉じる処理 */
	public final static String C_CLOSE = "close";

	//--------------------------------------------------------------------------
	// 画面チェックボックス設定値(下位部品を展開する)  画面設定→Control判定

	/** チェックボックス:ON */
	public final static String C_CHECK_YES = "on";
	/** チェックボックス:OFF */
	public final static String C_CHECK_NO = "off";

	//--------------------------------------------------------------------------
	/** リソースバンドル基底名(辞書) */
	public final static String C_DICNAME = "OrteusUserDic";
	
	/** 辞書の「過去」キー */
	public final static String C_KEYWORD_PAST = "Expj.Cmt0030";
}
