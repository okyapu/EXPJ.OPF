//------------------------------------------------------------------------------
// (#)MrpData.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// History
// 2003/07/04 新規作成 K.Matsumoto
// 2003/08/05 version 1.00 改版 M.Isoda
// 2003/08/08 version 1.01 パッケージ化に伴う変更 M.Isoda
//            前：com.nec.jp.orteus.metamorBase.AB0010
//            後：com.nec.jp.orteus.metamorBase.common01.StockCalculate
//            メソッド（getNewPlanOrder_double(), setNewPlanOrder()）をpublicへ変更
//------------------------------------------------------------------------------

//------------------------------------------------------------------------------
// 2003/08/08 M.Isoda
//------------------------------------------------------------------------------
package com.nec.jp.orteus.metamorBase.common01.StockCalculate;
//------------------------------------------------------------------------------

/**
 * MRPのデータクラス。
 *
 * @author K.Matsumoto
 * @version 1.00
 */
public class MrpData
{
	private String _fixDemand			= "0.0";
	private String _planDemand			= "0.0";
	private String _fixOrder			= "0.0";
	private String _planOrder			= "0.0";
	private String _stock				= "0.0";

	/**
	 * 確定デマンド取得。
	 * @return String 確定デマンド
	 */
	public String getFixDemand()
	{
		return _fixDemand;
	}

	/**
	 * 計画デマンド取得。
	 * @return String 計画デマンド
	 */
	public String getPlanDemand()
	{
		return _planDemand;
	}

	/**
	 * 確定オーダ取得。
	 * @return String 確定オーダ
	 */
	public String getFixOrder()
	{
		return _fixOrder;
	}

	/**
	 * 計画オーダ取得。
	 * @return String 計画オーダ
	 */
	public String getPlanOrder()
	{
		return _planOrder;
	}

	/**
	 * 有効在庫取得。
	 * @return String 有効在庫
	 */
	public String getStock()
	{
		return _stock;
	}

	/**
	 * 確定デマンド取得。
	 * @return double 確定デマンド
	 */
	double getFixDemand_double()
	{
		try {
			return Double.parseDouble(_fixDemand);
		} catch(Exception e) {
			e.printStackTrace();
			return 0.0;
		}
	}

	/**
	 * 計画デマンド取得。
	 * @return double 計画デマンド
	 */
	double getPlanDemand_double()
	{
		try {
			return Double.parseDouble(_planDemand);
		} catch(Exception e) {
			e.printStackTrace();
			return 0.0;
		}
	}

	/**
	 * 確定オーダ取得。
	 * @return double 確定オーダ
	 */
	double getFixOrder_double()
	{
		try {
			return Double.parseDouble(_fixOrder);
		} catch(Exception e) {
			e.printStackTrace();
			return 0.0;
		}
	}

	/**
	 * 計画オーダ取得。
	 * @return double 計画オーダ
	 */
	double getPlanOrder_double()
	{
		try {
			return Double.parseDouble(_planOrder);
		} catch(Exception e) {
			e.printStackTrace();
			return 0.0;
		}
	}

	/**
	 * 有効在庫取得。
	 * @return double 有効在庫
	 */
	double getStock_double()
	{
		try {
			return Double.parseDouble(_stock);
		} catch(Exception e) {
			e.printStackTrace();
			return 0.0;
		}
	}




	/**
	 * 確定デマンド設定。
	 * @param fixDemand 確定デマンド
	 */
	void setFixDemand(String fixDemand)
	{
		_fixDemand = fixDemand;
	}

	/**
	 * 計画デマンド設定。
	 * @param planDemant 計画デマンド
	 */
	void setPlanDemand(String planDemant)
	{
		_planDemand = planDemant;
	}

	/**
	 * 確定オーダ設定。
	 * @param fixOrder 確定オーダ
	 */
	void setFixOrder(String fixOrder)
	{
		_fixOrder = fixOrder;
	}

	/**
	 * 計画オーダ設定。
	 * @param planOrder 計画オーダ
	 */
	void setPlanOrder(String planOrder)
	{
		_planOrder = planOrder;
	}

	/**
	 * 有効在庫設定。
	 * @param stock 有効在庫
	 */
	void setStock(String stock)
	{
		_stock = stock;
	}



//------------------------------------------------------------------------------
// 2003/07/25 M.Isoda
//------------------------------------------------------------------------------
	private String _newPlanOrder		= "0.0";
	private String _planDate			= "";

	/**
	 * 新計画オーダ取得。
	 * @return String 新計画オーダ
	 */
	public String getNewPlanOrder()
	{
		return _newPlanOrder;
	}
	/**
	 * 新計画オーダ取得。
	 * @return double 新計画オーダ
	 */
	public double getNewPlanOrder_double()
	{
		try {
			return Double.parseDouble(_newPlanOrder);
		} catch(Exception e) {
			e.printStackTrace();
			return 0.0;
		}
	}
	/**
	 * 新計画オーダ設定。
	 * @param newPlanOrder 新計画オーダ
	 */
	public void setNewPlanOrder(String newPlanOrder)
	{
		_newPlanOrder = newPlanOrder;
	}



	/**
	 * 計画日付取得。
	 * @return String 日付
	 */
	public String getPlanDate()
	{
		return _planDate;
	}

	/**
	 * 計画日付設定。
	 * @param String 日付
	 */
	void setPlanDate(String planDate)
	{
		_planDate = planDate;
	}

//------------------------------------------------------------------------------
// 2003/07/30 M.Isoda
//------------------------------------------------------------------------------
	// 休日フラグ
	private boolean _holiday			= false;

	/**
	 * 休日フラグ取得。
	 * @return 休日フラグ
	 */
	public boolean getHoliday()
	{
		return _holiday;
	}

	/**
	 * 休日フラグ設定。
	 * @param boolean 休日フラグ
	 */
	public void setHoliday(boolean holiday)
	{
		_holiday = holiday;
	}

}
