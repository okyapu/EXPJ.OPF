//------------------------------------------------------------------------------
// (#)MrpManager.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// History
// 2003/07/08 新規作成 K.Matsumoto
// 2003/08/05 version 1.00 改版 M.Isoda
// 2003/08/06 version 1.01 HolidayListクラス名の変更に伴う修正.Isoda
//                         前：HolidayList
//                         後：HolidayAccessor
// 2003/08/08 version 1.02 MrpManagerパッケージ化に伴う変更 M.Isoda
//            前：com.nec.jp.orteus.metamorBase.AB0010
//            後：com.nec.jp.orteus.metamorBase.common01.StockCalculate
//            HolidayAccessorクラスのパッケージ化のため、importを追加
//            MrpDataクラスのパッケージ化のため、importを追加
//
// version 1.03
// 2003/09/05 M.Isoda
//            前日の有効在庫がマイナスの場合もプラスの場合と同様の計算処理をおこなうように修正
//
// version 1.04
// 2003/09/12 M.Isoda
//            共通演算クラスへ対応(Calculateパッケージののimport追加)
//              対応に伴い、使用しなくなったメソッドを削除
//
//------------------------------------------------------------------------------

//------------------------------------------------------------------------------
// 2003/08/08 M.Isoda
//------------------------------------------------------------------------------
package com.nec.jp.orteus.metamorBase.common01.StockCalculate;

import com.nec.jp.orteus.metamorBase.common01.StockCalculate.MrpData;
import com.nec.jp.orteus.metamorBase.common01.Accessor.HolidayAccessor;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
//------------------------------------------------------------------------------

import com.nec.jp.orteus.xaf.foundation.IDbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Hashtable;
import java.util.Vector;

/**
 * MRPの情報を取得するクラス。
 *
 * @author K.Matsumoto
 * @version 1.00
 */
public class MrpManager
{
	private MrpData _pastData = null;	// 過去の情報
	private Hashtable _hStore = null;	// MRP情報
	private Vector    _vStore = null;	// MRP情報(From以降)
	private Vector   _vPStore = null;	// MRP情報(業務運用日〜Fromの前日)
	private Connection _conn  = null;	// DB接続
	private String _itemCode  = null;	// 品目コード
	private String _plantCode = null;	// 工場コード
	private String _from      = null;	// 生産計画期間(From)
	private String _to        = null;	// 生産計画期間(To)
	private String _running   = null;	// 業務運用日

//------------------------------------------------------------------------------
// 2003/07/30 M.Isoda
//------------------------------------------------------------------------------
	private String _defFrom   = null;	// デフォルト生産計画期間(From)
	private String _defTo     = null;	// デフォルト生産計画期間(To)
	private HolidayAccessor _holiday = null;// 休日一覧
//------------------------------------------------------------------------------

	// 確定デマンド算出
	private String _fixDemSql =
		"SELECT" +
		" TO_CHAR(DUE_DATE, 'YYYY/MM/DD') AS DUE_DATE," +
		" TO_CHAR(SUM(DM_QTY - TOTAL_ISSUE_QTY), 'FM99999999999990.0999') AS FIX_DM " +
			"FROM T_OD " +
			"WHERE DUE_DATE IS NOT NULL AND" +
			" ITEM_CD = ? AND" +
			" PLANT_CD = ? AND" +
			" OD_TYP = '3' AND" +
			" DM_STS_TYP = '2' AND" +
			" DM_QTY - TOTAL_ISSUE_QTY > 0 " +
			" GROUP BY DUE_DATE" +
			" ORDER BY DUE_DATE";

	// 計画デマンド算出
	private String _planDemSql =
		"SELECT" +
		" TO_CHAR(DUE_DATE, 'YYYY/MM/DD') AS DUE_DATE," +
		" TO_CHAR(SUM(DM_QTY), 'FM99999999999990.0999') AS DM_QTY " +
			"FROM T_OD " +
			"WHERE DUE_DATE IS NOT NULL AND" +
			" ITEM_CD = ? AND" +
			" PLANT_CD = ? AND" +
			" OD_TYP = '3' AND" +
			" DM_STS_TYP = '1' " +
			" GROUP BY DUE_DATE" +
			" ORDER BY DUE_DATE";

	// 確定オーダ算出
	private String _fixOrdSql =
		"SELECT" +
		" TO_CHAR(PRD_DUE_DATE, 'YYYY/MM/DD') AS PRD_DUE_DATE," +
		" TO_CHAR(SUM(ODR_QTY - TOTAL_RCV_QTY), 'FM99999999999990.0999') AS FIX_OD " +
			"FROM T_OD " +
			"WHERE PRD_DUE_DATE IS NOT NULL AND" +
			" ITEM_CD = ? AND" +
			" PLANT_CD = ? AND" +
			" OD_TYP = '2' AND" +
			" ODR_STS_TYP = '2' AND" +
			" ODR_QTY - TOTAL_RCV_QTY > 0 " +
			" GROUP BY PRD_DUE_DATE" +
			" ORDER BY PRD_DUE_DATE";

	// 計画オーダ算出
	private String _planOrdSql =
		"SELECT" +
		" TO_CHAR(PRD_DUE_DATE, 'YYYY/MM/DD') AS PRD_DUE_DATE," +
		" TO_CHAR(SUM(ODR_QTY), 'FM99999999999990.0999') AS OLD_PLAN_OD " +
			"FROM T_OD " +
			"WHERE PRD_DUE_DATE IS NOT NULL AND" +
			" ITEM_CD = ? AND" +
			" PLANT_CD = ? AND" +
			" OD_TYP = '2' AND" +
			" ODR_STS_TYP = '1'"+
			" GROUP BY PRD_DUE_DATE" +
			" ORDER BY PRD_DUE_DATE";

	// 業務運用日
	private String _ordDateSql =
		"SELECT" +
		" TO_CHAR(BUSINESS_OPR_DATE, 'YYYY/MM/DD') AS BUSINESS_OPR_DATE " +
			"FROM SYS_DATE_CTRL " +
			"WHERE PLANT_CD = ?";


	/**
	 * 引数なしコンストラクタ。
	 */
	public MrpManager()
	{
		initialize();
	}

	/**
	 * 引数ありコンストラクタ。
	 * @param conn DB接続
	 * @param itemCode 品目番号
	 * @param plantCode 工場コード
	 * @param from 開始日
	 * @param to 終了日
	 */
	public MrpManager(IDbConnection conn,
					   String itemCode,
					   String plantCode,
					   String from,
					   String to)
	{
		initialize();
		setConnection(conn);
		setItemCode(itemCode);
		setPlantCode(plantCode);
		setFrom(from);
		setTo(to);
	}

	/**
	 * DB接続設定。
	 * @param DB接続
	 */
	public void setConnection(IDbConnection conn)
	{
		_conn = conn.getConn();
	}

	/**
	 * 品目番号設定。
	 * @param itemCode 品目番号
	 */
	public void setItemCode(String itemCode)
	{
		_itemCode = itemCode;
	}

	/**
	 * 工場コード設定。
	 * @param String 工場コード
	 */
	public void setPlantCode(String plantCode)
	{
		_plantCode = plantCode;
	}

	/**
	 * 開始日設定。
	 * @param 開始日
	 */
	public void setFrom(String from)
	{
		_from = from;
	}

	/**
	 * 終了日設定。
	 * @param 終了日
	 */
	public void setTo(String to)
	{
		_to = to;
	}

	/**
	 * MRPの情報の取得。
	 * @param String 日付 yyyy/mm/dd
	 */
	public MrpData getData(String date)
	{
		return (MrpData)_hStore.get(date);
	}

	/**
	 * MRPの情報の取得。
	 * @param int インデックス ゼロ開始
	 */
	public MrpData getData(int index)
	{
		return (MrpData)_vStore.get(index);
	}

	/**
	 * MRPの過去情報の取得。
	 */
	public MrpData getPast()
	{
		return _pastData;
	}

	/**
	 * MRP情報の件数を取得。
	 *
	 * @return 件数
	 */
	public int size()
	{
		return _vStore.size();
	}

	/**
	 * MRPの情報を構築。
	 *
	 * @param stockOnHandQty 手持在庫
	 * @param itemSpoil 仕損率
	 * @return 成否
	 */
	//public boolean execute(double stockOnHandQty, double itemSpoil)
	public boolean execute(String stockOnHandQty, String itemSpoil)
	{
		try
		{
			// 妥当性検査
			if (isValid() == false) {
				return false;
			}
			// 初期化
			initialize();

			// 業務運用日取得
			_running = doRunning();
			if (_running == null || _running.equals("") == true) {
				return false;
			}

			// 休日一覧取得
			_holiday.init(_conn, _plantCode, _from , _to);

			// 生産計画期間(From)が業務運用日の場合
			if (_running.compareTo(_from) == 0)
			{
				// 期間日付作成
				createSpan();

				// デマンド・オーダの算出
				doFixDmd();
				doPlanDmd();
				doFixOrd();
				doPlanOrd();

				// 有効在庫の算出
				doStock(stockOnHandQty, itemSpoil);
			}

			// 生産計画期間(From)が業務運用日の翌日以降の場合
			if(_running.compareTo(_from) < 0)
			{
				// 期間日付作成
				createSpan();
				createPastSpan();

				// デマンド・オーダの算出
				doFixDmdAfter();
				doPlanDmdAfter();
				doFixOrdAfter();
				doPlanOrdAfter();

				// 有効在庫の算出
				doStockAfter(stockOnHandQty, itemSpoil);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * 属性の妥当性確認。
	 * @return 妥当性
	 */
	private boolean isValid()
	{
		if (_conn == null ||
			_itemCode == null ||
			_plantCode == null ||
			_from == null ||
			_to == null)
		{
			return false;
		}
		return true;
	}

	/**
	 * 算出済みのMRP情報を初期化する。
	 */
	private void initialize()
	{
		_hStore   = new Hashtable();
		_vStore   = new Vector();
		_vPStore  = new Vector();
		_pastData = new MrpData();
		_holiday  = new HolidayAccessor();
	}

	/**
	 * 業務運用日を取得します。
	 *
	 * @return 業務運用日
	 */
	private String doRunning() throws SQLException
	{
		PreparedStatement stmt = null;
		ResultSet rslt  = null;
		String running  = "";

		try
		{
			// 取得
			stmt = _conn.prepareStatement(_ordDateSql);
			stmt.setString(1, _plantCode);
			rslt = stmt.executeQuery();
			if (rslt.next() == true) {
				running = rslt.getString(1);
			}
		}
		finally
		{
			closeResultSet(rslt);
			closePreparedStatement(stmt);
		}
		return running;
	 }

	/**
	 * 生産計画期間の日付を作成します。
	 *
	 * @throws ParseException 日付が不正
	 */
	private void createSpan() throws ParseException
	{
		SimpleDateFormat convert = new SimpleDateFormat("yyyy/MM/dd");
		Calendar fromCal = new GregorianCalendar();
		Calendar toCal   = new GregorianCalendar();
		Date fromDate = convert.parse(_from);
		Date toDate   = convert.parse(_to);

		// 前処理
		fromCal.setTime(fromDate);
		toCal.setTime(toDate);

		// fromとtoの日数差を算出
		long fromTime = fromCal.getTime().getTime();
		long toTime   = toCal.getTime().getTime();
		long diff = (toTime - fromTime) / 24 / 60 / 60 / 1000;

		// 格納
		for(int i = 0; i <= diff; i++)
		{
			MrpData data = new MrpData();
//------------------------------------------------------------------------------
// 2003/07/30 M.Isoda
//------------------------------------------------------------------------------
			String dateWork = convert.format(fromCal.getTime());
			data.setPlanDate(dateWork);
//System.out.println("[" + i + "]= " + data.getPlanDate());
			data.setHoliday(_holiday.isHoliday(dateWork));
			_vStore.add(data);
			_hStore.put(dateWork, data);
//------------------------------------------------------------------------------
			fromCal.add(Calendar.DATE, + 1);
		}
	}

	/**
	 * 生産計画期間(過去)の日付を作成します。
	 * 業務運用日の翌日〜生産計画期間(From)の前日まで
	 *
	 * @throws ParseException 日付が不正
	 */
	private void createPastSpan() throws ParseException
	{
		SimpleDateFormat convert = new SimpleDateFormat("yyyy/MM/dd");
		Calendar fromCal = new GregorianCalendar();
		Calendar toCal   = new GregorianCalendar();
		Date fromDate = convert.parse(_running);
		Date toDate   = convert.parse(_from);

		// 前処理
		fromCal.setTime(fromDate);
		toCal.setTime(toDate);
		fromCal.add(Calendar.DATE, + 1);
		toCal.add(Calendar.DATE, - 1);

		// fromとtoの日数差を算出
		long fromTime = fromCal.getTime().getTime();
		long toTime   = toCal.getTime().getTime();
		long diff = (toTime - fromTime) / 24 / 60 / 60 / 1000;

		// 格納
		for(int i = 0; i <= diff; i++)
		{
			MrpData data = new MrpData();
			data.setPlanDate(convert.format(fromCal.getTime()));
			_vPStore.add(data);
			_hStore.put(convert.format(fromCal.getTime()), data);
			fromCal.add(Calendar.DATE, + 1);
		}
	}

	/**
	 * 確定デマンドを取得。
	 * 生産計画期間(From)の値が業務運用日の場合
	 *
	 * @throws SQLException
	 */
	private void doFixDmd() throws SQLException
	{
		PreparedStatement stmt = null;
		ResultSet rslt = null;

		try
		{
			// 取得
			stmt = _conn.prepareStatement(_fixDemSql);
			stmt.setString(1, _itemCode);
			stmt.setString(2, _plantCode);
			rslt = stmt.executeQuery();

			while (rslt.next() == true)
			{
				// 過去データ作成
				if (rslt.getString(1).compareTo(_running) < 0)
				{
					//double past = _pastData.getFixDemand_double();
					//past += Double.parseDouble(rslt.getString(2));
					//_pastData.setFixDemand(Double.toString(past));
					String past = _pastData.getFixDemand();
					past = Calculate.add(past, rslt.getString(2));
					_pastData.setFixDemand(past);
				}
				// 期間内データ作成
				else if (_hStore.containsKey(rslt.getString(1)) == true)
				{
					MrpData data = (MrpData)_hStore.get(rslt.getString(1));
					data.setFixDemand(rslt.getString(2));
				}
				else
				{
					// 対象外の日付なら破棄する
				}
			}
		}
		finally
		{
			closeResultSet(rslt);
			closePreparedStatement(stmt);
		}
	}

	/**
	 * 計画デマンドを取得。
	 * 生産計画期間(From)の値が業務運用日の場合
	 *
	 * @throws SQLException
	 */
	private void doPlanDmd() throws SQLException
	{
		PreparedStatement stmt = null;
		ResultSet rslt = null;

		try
		{
			// 取得
			stmt = _conn.prepareStatement(_planDemSql);
			stmt.setString(1, _itemCode);
			stmt.setString(2, _plantCode);
			rslt = stmt.executeQuery();

			while (rslt.next() == true)
			{
				// 過去データ作成
				if (rslt.getString(1).compareTo(_running) < 0)
				{
					//double past = _pastData.getPlanDemand_double();
					//past += Double.parseDouble(rslt.getString(2));
					//_pastData.setPlanDemand(Double.toString(past));
					String past = _pastData.getPlanDemand();
					past = Calculate.add(past, rslt.getString(2));
					_pastData.setPlanDemand(past);
				}
				// 期間内データ作成
				else if (_hStore.containsKey(rslt.getString(1)) == true)
				{
					MrpData data = (MrpData)_hStore.get(rslt.getString(1));
					data.setPlanDemand(rslt.getString(2));
				}
				else
				{
					// 対象外の日付なら破棄する
				}
			}
		}
		finally
		{
			closeResultSet(rslt);
			closePreparedStatement(stmt);
		}
	}

	/**
	 * 確定オーダを取得。
	 * 生産計画期間(From)の値が業務運用日の場合
	 *
	 * @throws SQLException
	 */
	private void doFixOrd() throws SQLException
	{
		PreparedStatement stmt = null;
		ResultSet rslt = null;

		try
		{
			// 取得
			stmt = _conn.prepareStatement(_fixOrdSql);
			stmt.setString(1, _itemCode);
			stmt.setString(2, _plantCode);
			rslt = stmt.executeQuery();

			while (rslt.next() == true)
			{
				// 過去データ作成
				if (rslt.getString(1).compareTo(_running) < 0)
				{
					//double past = _pastData.getFixOrder_double();
					//past += Double.parseDouble(rslt.getString(2));
					//_pastData.setFixOrder(Double.toString(past));
					String past = _pastData.getFixOrder();
					past = Calculate.add(past, rslt.getString(2));
					_pastData.setFixOrder(past);
				}
				// 期間内データ作成
				else if (_hStore.containsKey(rslt.getString(1)) == true)
				{
					MrpData data = (MrpData)_hStore.get(rslt.getString(1));
					data.setFixOrder(rslt.getString(2));
				}
				else
				{
					// 対象外の日付なら破棄する
				}
			}
		}
		finally
		{
			closeResultSet(rslt);
			closePreparedStatement(stmt);
		}
	}

	/**
	 * 計画オーダを取得。
	 * 生産計画期間(From)の値が業務運用日の場合
	 *
	 * @throws SQLException
	 */
	private void doPlanOrd() throws SQLException
	{
		PreparedStatement stmt = null;
		ResultSet rslt = null;

		try
		{
			// 取得
			stmt = _conn.prepareStatement(_planOrdSql);
			stmt.setString(1, _itemCode);
			stmt.setString(2, _plantCode);
			rslt = stmt.executeQuery();

			while (rslt.next() == true)
			{
				// 過去データ作成
				if (rslt.getString(1).compareTo(_running) < 0)
				{
					//double past = _pastData.getPlanOrder_double();
					//past += Double.parseDouble(rslt.getString(2));
					//_pastData.setPlanOrder(Double.toString(past));
					String past = _pastData.getPlanOrder();
					past = Calculate.add(past, rslt.getString(2));
					_pastData.setPlanOrder(past);
				}
				// 期間内データ作成
				else if (_hStore.containsKey(rslt.getString(1)) == true)
				{
					MrpData data = (MrpData)_hStore.get(rslt.getString(1));
					data.setPlanOrder(rslt.getString(2));
//System.out.println("doPlanOrd() 計画オーダ(取得時) = " + rslt.getString(2));
//					data.setPlanOrder(Double.toString(Double.parseDouble(rslt.getString(2))));
//System.out.println("doPlanOrd() 計画オーダ(変換後) = " + data.getPlanOrder());
				}
				else
				{
					// 対象外の日付なら破棄する
				}
			}
		}
		finally
		{
			closeResultSet(rslt);
			closePreparedStatement(stmt);
		}
	}

	/**
	 * 確定デマンドを取得。
	 * 生産計画期間(From)の値が業務運用日の翌日以降の場合
	 *
	 * @throws SQLException
	 */
	private void doFixDmdAfter() throws SQLException
	{
		PreparedStatement stmt = null;
		ResultSet rslt = null;

		try
		{
			// 取得
			stmt = _conn.prepareStatement(_fixDemSql);
			stmt.setString(1, _itemCode);
			stmt.setString(2, _plantCode);
			rslt = stmt.executeQuery();

			while (rslt.next() == true)
			{
				// 過去データ作成
				if (rslt.getString(1).compareTo(_running) <= 0)
				{
					//double past = _pastData.getFixDemand_double();
					//past += Double.parseDouble(rslt.getString(2));
					//_pastData.setFixDemand(Double.toString(past));
					String past = _pastData.getFixDemand();
					past = Calculate.add(past, rslt.getString(2));
					_pastData.setFixDemand(past);
				}
				// 期間内データ作成
				else if (_hStore.containsKey(rslt.getString(1)) == true)
				{
					MrpData data = (MrpData)_hStore.get(rslt.getString(1));
					data.setFixDemand(rslt.getString(2));
				}
				else
				{
					// 対象外の日付なら破棄する
				}
			}
		}
		finally
		{
			closeResultSet(rslt);
			closePreparedStatement(stmt);
		}
	}

	/**
	 * 計画デマンドを取得。
	 * 生産計画期間(From)の値が業務運用日の翌日以降の場合
	 *
	 * @throws SQLException
	 */
	private void doPlanDmdAfter() throws SQLException
	{
		PreparedStatement stmt = null;
		ResultSet rslt = null;

		try
		{
			// 取得
			stmt = _conn.prepareStatement(_planDemSql);
			stmt.setString(1, _itemCode);
			stmt.setString(2, _plantCode);
			rslt = stmt.executeQuery();

			while (rslt.next() == true)
			{
				// 過去データ作成
				if (rslt.getString(1).compareTo(_running) <= 0)
				{
					//double past = _pastData.getPlanDemand_double();
					//past += Double.parseDouble(rslt.getString(2));
					//_pastData.setPlanDemand(Double.toString(past));
					String past = _pastData.getPlanDemand();
					past = Calculate.add(past, rslt.getString(2));
					_pastData.setPlanDemand(past);
				}
				// 期間内データ作成
				else if (_hStore.containsKey(rslt.getString(1)) == true)
				{
					MrpData data = (MrpData)_hStore.get(rslt.getString(1));
					data.setPlanDemand(rslt.getString(2));
				}
				else
				{
					// 対象外の日付なら破棄する
				}
			}
		}
		finally
		{
			closeResultSet(rslt);
			closePreparedStatement(stmt);
		}
	}

	/**
	 * 確定オーダを取得。
	 * 生産計画期間(From)の値が業務運用日の翌日以降の場合
	 *
	 * @throws SQLException
	 */
	private void doFixOrdAfter() throws SQLException
	{
		PreparedStatement stmt = null;
		ResultSet rslt = null;

		try
		{
			// 取得
			stmt = _conn.prepareStatement(_fixOrdSql);
			stmt.setString(1, _itemCode);
			stmt.setString(2, _plantCode);
			rslt = stmt.executeQuery();

			while (rslt.next() == true)
			{
				// 過去データ作成
				if (rslt.getString(1).compareTo(_running) <= 0)
				{
					//double past = _pastData.getFixOrder_double();
					//past += Double.parseDouble(rslt.getString(2));
					//_pastData.setFixOrder(Double.toString(past));
					String past = _pastData.getFixOrder();
					past = Calculate.add(past, rslt.getString(2));
					_pastData.setFixOrder(past);
				}
				// 期間内データ作成
				else if (_hStore.containsKey(rslt.getString(1)) == true)
				{
					MrpData data = (MrpData)_hStore.get(rslt.getString(1));
					data.setFixOrder(rslt.getString(2));
				}
				else
				{
					// 対象外の日付なら破棄する
				}
			}
		}
		finally
		{
			closeResultSet(rslt);
			closePreparedStatement(stmt);
		}
	}

	/**
	 * 計画オーダを取得。
	 * 生産計画期間(From)の値が業務運用日の翌日以降の場合
	 *
	 * @throws SQLException
	 */
	private void doPlanOrdAfter() throws SQLException
	{
		PreparedStatement stmt = null;
		ResultSet rslt = null;

		try
		{
			// 取得
			stmt = _conn.prepareStatement(_planOrdSql);
			stmt.setString(1, _itemCode);
			stmt.setString(2, _plantCode);
			rslt = stmt.executeQuery();

			while (rslt.next() == true)
			{
				// 過去データ作成
				if (rslt.getString(1).compareTo(_running) <= 0)
				{
					//double past = _pastData.getPlanOrder_double();
					//past += Double.parseDouble(rslt.getString(2));
					//_pastData.setPlanOrder(Double.toString(past));
					String past = _pastData.getPlanOrder();
					past = Calculate.add(past, rslt.getString(2));
					_pastData.setPlanOrder(past);
				}
				// 期間内データ作成
				else if (_hStore.containsKey(rslt.getString(1)) == true)
				{
					MrpData data = (MrpData)_hStore.get(rslt.getString(1));
					data.setPlanOrder(rslt.getString(2));
//System.out.println("doPlanOrdAfter() 計画オーダ(取得時) = " + rslt.getString(2));
//					data.setPlanOrder(Double.toString(Double.parseDouble(rslt.getString(2))));
//System.out.println("doPlanOrdAfter() 計画オーダ(変換後) = " + data.getPlanOrder());
				}
				else
				{
					// 対象外の日付なら破棄する
				}
			}
		}
		finally
		{
			closeResultSet(rslt);
			closePreparedStatement(stmt);
		}
	}

	/**
	 * 有効在庫を算出します。
	 * 生産計画期間(From)が業務運用日の場合。
	 *
	 * @param stockOnHandQty 手持在庫
	 * @param itemSpoil 仕損率
	 * @throws SQLException DBエラー
	 */
	private void doStock(String stockOnHandQty, String itemSpoil) throws SQLException
	{
		//double planOrdMin = 0;		// 計画オーダ最小許容数
		//double fixOrdMin  = 0;		// 確定オーダ最小許容数
		//double store      = 0;		// 入庫予定
		//double fixDmd     = 0;		// 確定デマンド
		//double planDmd    = 0;		// 計画デマンド
		//double stock      = 0;		// 有効在庫
		String planOrdMin = "0";		// 計画オーダ最小許容数
		String fixOrdMin  = "0";		// 確定オーダ最小許容数
		String store      = "0";		// 入庫予定
		String fixDmd     = "0";		// 確定デマンド
		String planDmd    = "0";		// 計画デマンド
		String stock      = "0";		// 有効在庫

		// 過去のオーダ最小許容量・入庫予定を算出
		//planOrdMin = convert(_pastData.getPlanOrder_double() / (1 + (itemSpoil / 100)));
		planOrdMin	= Calculate.divide(_pastData.getPlanOrder(), Calculate.add("1", Calculate.divide(itemSpoil, "100", 6, Calculate._FLOOR)), 4, Calculate._FLOOR);
		//fixOrdMin  = convert(_pastData.getFixOrder_double()  / (1 + (itemSpoil / 100)));
		fixOrdMin	= Calculate.divide(_pastData.getFixOrder(), Calculate.add("1", Calculate.divide(itemSpoil, "100", 6, Calculate._FLOOR)), 4, Calculate._FLOOR);
		//store      = convert(planOrdMin + fixOrdMin);
		store		= Calculate.floor(Calculate.add(planOrdMin, fixOrdMin), 4);

		// 過去の値を算出
		//fixDmd  = _pastData.getFixDemand_double();
		fixDmd  = _pastData.getFixDemand();
		//planDmd = _pastData.getPlanDemand_double();
		planDmd = _pastData.getPlanDemand();
		//stock = stockOnHandQty - ((fixDmd + planDmd) - store);
		stock	= Calculate.subtract(stockOnHandQty, Calculate.subtract(Calculate.add(fixDmd, planDmd), store));
		//_pastData.setStock(Double.toString(stock));
		_pastData.setStock(stock);

		// 生産計画期間(From)の値を算出
		MrpData data = (MrpData)_vStore.get(0);
		//fixDmd     = convert(data.getFixDemand_double());
		fixDmd		= Calculate.floor(data.getFixDemand(), 4);
		//planDmd    = convert(data.getPlanDemand_double());
		planDmd		= Calculate.floor(data.getPlanDemand(), 4);
		//planOrdMin = convert(data.getPlanOrder_double() / (1 + (itemSpoil / 100)));
		planOrdMin	= Calculate.divide(data.getPlanOrder(),	Calculate.add("1", Calculate.divide(itemSpoil, "100", 6, Calculate._FLOOR)), 4, Calculate._FLOOR);
		//fixOrdMin  = convert(data.getFixOrder_double()  / (1 + (itemSpoil / 100)));
		fixOrdMin	= Calculate.divide(data.getFixOrder(),	Calculate.add("1", Calculate.divide(itemSpoil, "100", 6, Calculate._FLOOR)), 4, Calculate._FLOOR);
		//store      = convert(planOrdMin + fixOrdMin);
		store		= Calculate.floor(Calculate.add(planOrdMin, fixOrdMin), 4);
		//stock      = convert(stock - ((fixDmd + planDmd) - store));
		stock		= Calculate.floor(Calculate.subtract(stock, Calculate.subtract(Calculate.add(fixDmd, planDmd), store)), 4);
		//data.setStock(Double.toString(stock));
		data.setStock(stock);

		// 生産計画期間(From)の翌日以降の値を算出
		int size = _vStore.size();
		for(int i = 1; i < size; i++)
		{
			data = (MrpData)_vStore.get(i);
			//fixDmd     = convert(data.getFixDemand_double());
			fixDmd     = Calculate.floor(data.getFixDemand(), 4);
			//planDmd    = convert(data.getPlanDemand_double());
			planDmd    = Calculate.floor(data.getPlanDemand(), 4);
			//planOrdMin = convert(data.getPlanOrder_double() / (1 + (itemSpoil / 100)));
			planOrdMin	= Calculate.divide(data.getPlanOrder(),	Calculate.add("1", Calculate.divide(itemSpoil, "100", 6, Calculate._FLOOR)), 4, Calculate._FLOOR);
			//fixOrdMin  = convert(data.getFixOrder_double()  / (1 + (itemSpoil / 100)));
			fixOrdMin	= Calculate.divide(data.getFixOrder(),	Calculate.add("1", Calculate.divide(itemSpoil, "100", 6, Calculate._FLOOR)), 4, Calculate._FLOOR);
			//store      = convert(planOrdMin + fixOrdMin);
			store		= Calculate.floor(Calculate.add(planOrdMin, fixOrdMin), 4);
			//stock = convert(stock - ((fixDmd + planDmd) - store));
			stock		= Calculate.floor(Calculate.subtract(stock, Calculate.subtract(Calculate.add(fixDmd, planDmd), store)), 4);
			//data.setStock(Double.toString(stock));
			data.setStock(stock);
		}
	}

	/**
	 * 有効在庫を算出します。
	 * 生産計画期間(From)が業務運用日の翌日以降の場合。
	 *
	 * @param stockOnHandQty 手持在庫
	 * @param itemSpoil 仕損率
	 * @throws SQLException DBエラー
	 */
	private void doStockAfter(String stockOnHandQty, String itemSpoil) throws SQLException
	{
		//double planOrdMin = 0;		// 計画オーダ最小許容数
		//double fixOrdMin  = 0;		// 確定オーダ最小許容数
		//double store      = 0;		// 入庫予定
		//double fixDmd     = 0;		// 確定デマンド
		//double planDmd    = 0;		// 計画デマンド
		//double stock      = 0;		// 有効在庫
		String planOrdMin = "0";		// 計画オーダ最小許容数
		String fixOrdMin  = "0";		// 確定オーダ最小許容数
		String store      = "0";		// 入庫予定
		String fixDmd     = "0";		// 確定デマンド
		String planDmd    = "0";		// 計画デマンド
		String stock      = "0";		// 有効在庫


		// 過去のオーダ最小許容量・入庫予定を算出
		//planOrdMin = convert(_pastData.getPlanOrder_double() / (1 + (itemSpoil / 100)));
		planOrdMin	= Calculate.divide(_pastData.getPlanOrder(),	Calculate.add("1", Calculate.divide(itemSpoil, "100", 6, Calculate._FLOOR)), 4, Calculate._FLOOR);
		//fixOrdMin  = convert(_pastData.getFixOrder_double()  / (1 + (itemSpoil / 100)));
		fixOrdMin	= Calculate.divide(_pastData.getFixOrder(),	Calculate.add("1", Calculate.divide(itemSpoil, "100", 6, Calculate._FLOOR)), 4, Calculate._FLOOR);
		//store      = convert(planOrdMin + fixOrdMin);
		store		= Calculate.floor(Calculate.add(planOrdMin, fixOrdMin), 4);

		// 過去の値を算出(業務運用日まで)
		//fixDmd  = _pastData.getFixDemand_double();
		fixDmd  = _pastData.getFixDemand();
		//planDmd = _pastData.getPlanDemand_double();
		planDmd = _pastData.getPlanDemand();
		//stock = stockOnHandQty - ((fixDmd + planDmd) - store);
		stock	= Calculate.subtract(stockOnHandQty, Calculate.subtract(Calculate.add(fixDmd, planDmd), store));

		// 過去の値を算出(業務運用日の翌日〜生産計画期間(From)の前日まで)
		MrpData data = null;
		int size = _vPStore.size();
		for(int i = 0; i < size; i++)
		{
			data = (MrpData)_vPStore.get(i);
			//fixDmd     = convert(data.getFixDemand_double());
			fixDmd		= Calculate.floor(data.getFixDemand(), 4);
			//planDmd    = convert(data.getPlanDemand_double());
			planDmd		= Calculate.floor(data.getPlanDemand(), 4);
			//planOrdMin = convert(data.getPlanOrder_double() / (1 + (itemSpoil / 100)));
			planOrdMin	= Calculate.divide(data.getPlanOrder(),	Calculate.add("1", Calculate.divide(itemSpoil, "100", 6, Calculate._FLOOR)), 4, Calculate._FLOOR);
			//fixOrdMin  = convert(data.getFixOrder_double()  / (1 + (itemSpoil / 100)));
			fixOrdMin	= Calculate.divide(data.getFixOrder(),	Calculate.add("1", Calculate.divide(itemSpoil, "100", 6, Calculate._FLOOR)), 4, Calculate._FLOOR);
			//store      = convert(planOrdMin + fixOrdMin);
			store		= Calculate.floor(Calculate.add(planOrdMin, fixOrdMin), 4);
			//stock = convert(stock - ((fixDmd + planDmd) - store));
			stock		= Calculate.floor(Calculate.subtract(stock, Calculate.subtract(Calculate.add(fixDmd, planDmd), store)), 4);
		}
		//_pastData.setStock(Double.toString(stock));
		_pastData.setStock(stock);

		// 生産計画期間(From)の翌日以降の値を算出
		size = _vStore.size();
		for(int i = 0; i < size; i++)
		{
			data = (MrpData)_vStore.get(i);
			//fixDmd     = convert(data.getFixDemand_double());
			fixDmd		= Calculate.floor(data.getFixDemand(), 4);
			//planDmd    = convert(data.getPlanDemand_double());
			planDmd		= Calculate.floor(data.getPlanDemand(), 4);
			//planOrdMin = convert(data.getPlanOrder_double() / (1 + (itemSpoil / 100)));
			planOrdMin	= Calculate.divide(data.getPlanOrder(),	Calculate.add("1", Calculate.divide(itemSpoil, "100", 6, Calculate._FLOOR)), 4, Calculate._FLOOR);
			//fixOrdMin  = convert(data.getFixOrder_double()  / (1 + (itemSpoil / 100)));
			fixOrdMin	= Calculate.divide(data.getFixOrder(),	Calculate.add("1", Calculate.divide(itemSpoil, "100", 6, Calculate._FLOOR)), 4, Calculate._FLOOR);
			//store      = convert(planOrdMin + fixOrdMin);
			store		= Calculate.floor(Calculate.add(planOrdMin, fixOrdMin), 4);
			//stock = convert(stock - ((fixDmd + planDmd) - store));
			stock		= Calculate.floor(Calculate.subtract(stock, Calculate.subtract(Calculate.add(fixDmd, planDmd), store)), 4);
			//data.setStock(Double.toString(stock));
			data.setStock(stock);
		}
	}

	/**
	 * PreparedStatementを閉じる。
	 *
	 * @param statement 閉じる対象のstatment
	 */
	private void closePreparedStatement(PreparedStatement statement)
	{
		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
			}
		}
	}

	/**
	 * ResultSetを閉じる。
	 *
	 * @param resultset 閉じる対象のresultset
	 */
	private void closeResultSet(ResultSet resultset)
	{
		if (resultset != null) {
			try {
				resultset.close();
			} catch (SQLException e) {
			}
		}
	}

}
