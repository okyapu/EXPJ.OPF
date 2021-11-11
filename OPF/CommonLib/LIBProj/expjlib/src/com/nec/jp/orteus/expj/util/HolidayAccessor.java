//------------------------------------------------------------------------------
// (#)HolidayAccessor.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// History
// 2003/07/08 新規作成 M.Isoda
// 2003/08/05 version 1.00 改版 M.Isoda
// 2003/08/06 version 1.01 パッケージ名を変更 M.Isoda
//                         前：HolidayList
//                         後：HolidayAccessor
// 2003/08/08 version 1.02 パッケージ名変更 M.Isoda
//                         前：com.nec.jp.orteus.metamorBase.AB0010
//                         後：com.nec.jp.orteus.metamorBase.common01.Accessor
// 2003/10/23 version 1.03 カーソルクローズ漏れ修正  K.Shiraki
//
//------------------------------------------------------------------------------

//------------------------------------------------------------------------------
// 2003/08/08 M.Isoda
//------------------------------------------------------------------------------
package com.nec.jp.orteus.expj.util;
//------------------------------------------------------------------------------

import com.nec.jp.orteus.xaf.foundation.IDbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Vector;


/**
 * 休日一覧を管理するクラス。
 *
 * @author M.Isoda
 * @version 1.00
 */
public class HolidayAccessor
{
	private Vector _vList = new Vector();	// 休日一覧
	private Connection _conn = null;		// DB接続
	private String _planCD = "";			// 工場コード
	private String _itemCD = "";			// 品目番号
	private String _dateFrom = "";			// 日付FROM
	private String _dateTo = "";			// 日付TO

	//休日日付取得SQL(検索キー：工場コード）
	private String _selHolidayAccessorSql =
		"select M_CAL.\"CAL_DATE\" as \"CAL_DATE\" "
		+"from M_CAL "
		+"where "
		+"  M_CAL.\"CAL_DATE\" >= to_date(?) "
		+"  and M_CAL.\"CAL_DATE\" <= to_date(?) "
		+"  and M_CAL.\"HOLIDAY_FLG\" = 1 "
		+"  and M_CAL.\"CAL_NO\" = (select M_PLANT.\"CAL_NO\" as \"CAL_NO\" from M_PLANT where M_PLANT.\"PLANT_CD\" = ?) "
		+"order by M_CAL.\"CAL_DATE\" ";
	//休日日付取得SQL(検索キー：品目コード）
	private String _selHolidayAccessorSql_item =
		"select M_CAL.\"CAL_DATE\" as \"CAL_DATE\" "
		+"from M_CAL "
		+"where "
		+"  M_CAL.\"CAL_DATE\" >= to_date(?) "
		+"  and M_CAL.\"CAL_DATE\" <= to_date(?) "
		+"  and M_CAL.\"HOLIDAY_FLG\" = 1 "
		+"  and M_CAL.\"CAL_NO\" = (select M_ITEM.\"CAL_NO\" as \"CAL_NO\" from M_ITEM where M_ITEM.\"ITEM_CD\" = ?) "
		+"order by M_CAL.\"CAL_DATE\" ";
	/**
	 * 休日一覧クラス初期化
	 * @param DB接続
	 * @param String 工場コード
	 * @param String 日付FROM yyyy/mm/dd
	 * @param String 日付TO yyyy/mm/dd
	 */
	public void init(Connection conn, String plantCD, String dateFrom, String dateTo) throws SQLException
	{
		PreparedStatement stmt = null;
		ResultSet rslt = null;
		_conn = conn;
		_planCD = plantCD;
		_dateFrom = dateFrom;
		_dateTo = dateTo;
		_vList.clear();
		try {
			stmt = _conn.prepareStatement(_selHolidayAccessorSql);
			stmt.setString(1, _dateFrom);
			stmt.setString(2, _dateTo);
			stmt.setString(3, _planCD);
			rslt = stmt.executeQuery();
			while(rslt.next() == true) {
				_vList.add(rslt.getString(1));
			}
		}
		finally {
			closePreparedStatement(stmt);
			closeResultSet(rslt);
		}
	}
	public void init(Connection conn, String itemCD, String dateFrom, String dateTo,int fg) throws SQLException
	{
		PreparedStatement stmt = null;
		ResultSet rslt = null;
		_conn = conn;
		_itemCD = itemCD;
		_dateFrom = dateFrom;
		_dateTo = dateTo;
		_vList.clear();
		try {
			stmt = _conn.prepareStatement(_selHolidayAccessorSql_item);
			stmt.setString(1, _dateFrom);
			stmt.setString(2, _dateTo);
			stmt.setString(3, _itemCD);
			rslt = stmt.executeQuery();
			while(rslt.next() == true) {
				_vList.add(rslt.getString(1));
			}
		}
		finally {
			closePreparedStatement(stmt);
			closeResultSet(rslt);
		}
	}
	/**
	 * 休日判定
	 * @param String 日付 yyyy/mm/dd
	 * @return 休日の判定(true:休日, false:休日以外)
	 */
	public boolean isHoliday(String targetDate) {
		Date date = stringToDate(targetDate);

		return isHoliday(date);
	}

	/**
	 * 休日判定
	 * @param Date 日付 yyyy/mm/dd
	 * @return 休日の判定(true:休日, false:休日以外)
	 */
	public boolean isHoliday(Date targetDate) {
		boolean bFound = false;
		Date dateFrom = stringToDate(_dateFrom);
		Date dateTo = stringToDate(_dateTo);
		Date dateWork;

		// dateが期間外なら休日で返す
		if(targetDate.getTime() < dateFrom.getTime() || targetDate.getTime() > dateTo.getTime()) {
			return true;
		}

		// dateと一致する休日を検索
		for(int i = 0; i < _vList.size(); i++) {
			dateWork = stringToDate((String)_vList.get(i));
			if(targetDate.getTime() == dateWork.getTime()) {
				bFound = true;
				break;
			}
		}

		return bFound;
	}

	/** 日付フォーマット */
	private SimpleDateFormat _dateFormat = new SimpleDateFormat("yyyy/MM/dd");

	/**
	 * Date型 ⇒ String型。
	 * @return String YYYY/MM/DD形式
	 */
	public String dateToString(Date date)
	{
		return _dateFormat.format(date);
	}

	/**
	 * String型 ⇒ Date型。
	 * @return Date 
	 */
	public Date stringToDate(String date)
	{
		try{
			return _dateFormat.parse(date);

		}catch(ParseException ex){}

		return null;
	}
	/**
	 * プリペアドステートメントを閉じる
	 * @param statement 閉じる対象のステートメント
	 */
	private void closePreparedStatement(PreparedStatement statement)
	{
		if(statement == null)  return;
		try{
			statement.close();
			statement = null;
		}
		catch (SQLException e){}
	}

	/**
	 * リザルトセットを閉じる
	 * @param resultset 閉じる対象のリザルトセット
	 */
	private void closeResultSet(ResultSet resultset)
	{
		if(resultset == null)  return;
		try{
			resultset.close();
			resultset = null;
		}
		catch (SQLException e){}
	}

}
