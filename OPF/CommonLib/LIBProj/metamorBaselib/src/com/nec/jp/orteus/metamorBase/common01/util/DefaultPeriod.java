//------------------------------------------------------------------------------
// (#)DefaultPeriod.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2004/02/24 新規作成  M.Isoda
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.util;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import com.nec.jp.orteus.metamorBase.common01.util.DateConverter;

/**
 * デフォルト生産計画期間取得クラス
 *
 * @author  M.Isoda
 * @version 1.01
*/
public class DefaultPeriod
{
//--------------------------------------------------------------------------
// 構築

	/** コンストラクタ */
	public DefaultPeriod(){}

//------------------------------------------------------------------------------------
// 共通メソッド

	////////////////////////////////////////////////////////////////////////////
	/**
	 * プリペアドステートメントを閉じる
	 *
	 * @param	statement	閉じる対象のステートメント
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
	 *
	 * @param	resultset	閉じる対象のリザルトセット
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

//--------------------------------------------------------------------------
// 操作

	////////////////////////////////////////////////////////////////////////////
	/**
	 * デフォルト生産計画期間取得
	 *
	 * @param	conn				DBアクセス用のコネクション
	 * @param	strBusinessOprDate	業務運用日
	 * @param	strOutDefDate[]		デフォルト生産計画期間日付([0]:From [1]:To)
	 * @return	true:成功 / false:失敗
	 * @throws	SQLException
	 */
	public boolean get(
		IDbConnection conn, 
		String strBusinessOprDate,
		String strOutDefDate[]) throws SQLException
	{
		DateConverter dc = new DateConverter();
		Date dateBusinessOprDate = dc.str2date(strBusinessOprDate);
		return get(conn, dateBusinessOprDate, strOutDefDate);
	}

	/**
	 * デフォルト生産計画期間取得
	 *
	 * @param	conn				DBアクセス用のコネクション
	 * @param	dateBusinessOprDate	業務運用日
	 * @param	strOutDefDate[]		デフォルト生産計画期間日付([0]:From [1]:To)
	 * @return	true:成功 / false:失敗
	 * @throws	SQLException
	 */
	public boolean get(
		IDbConnection conn, 
		Date dateBusinessOprDate,
		String strOutDefDate[]) throws SQLException
	{
		// 引数チェック
		if( (conn == null) || (dateBusinessOprDate == null) )
		{
			return false;
		}

		// FROM,TO用加算月数取得
		String strAddMonth4From, strAddMonth4To;
		strAddMonth4From = readSysPrdPlanPeriod4PlanSpan(conn, "1");
		strAddMonth4To = readSysPrdPlanPeriod4PlanSpan(conn, "2");

		// FROM,TO用生産計画期間日付区分取得
		String strDayTyp4From, strDayTyp4To;
		strDayTyp4From = readSysPrdPlanPeriod4DayTyp(conn, "1");
		strDayTyp4To = readSysPrdPlanPeriod4DayTyp(conn, "2");

		if((strAddMonth4From == null) || (strAddMonth4To == null)
		|| (strDayTyp4From == null) || (strDayTyp4To == null) )
		{
			// エラー（レコードなし）
			return false;
		}

		// デフォルト生産計画期間算出
		Date dateDefFrom, dateDefTo;
		dateDefFrom = calcDefDate(dateBusinessOprDate, strAddMonth4From, strDayTyp4From);	// FROM
		dateDefTo = calcDefDate(dateBusinessOprDate, strAddMonth4To, strDayTyp4To);			// TO
		if( (dateDefFrom == null) || (dateDefTo == null) )
		{
			// エラー
			return false;
		}
		// デフォルト生産計画期間(FROM)が業務運用日より過去なら 業務運用日に補正
		if(dateDefFrom.getTime() < dateBusinessOprDate.getTime())
		{
			dateDefFrom = dateBusinessOprDate;
		}
		// デフォルト生産期間(TO)が業務運用日より過去なら 業務運用日に補正
		if(dateDefTo.getTime() < dateBusinessOprDate.getTime())
		{
			dateDefTo = dateBusinessOprDate;
		}
		// デフォルト生産計画期間(FROM)がデフォルト生産計画期間(TO)より未来になっていないかどうかのチェック
		if(dateDefFrom.getTime() > dateDefTo.getTime())
		{
			return false;
		}

		// 日付文字列へ変換
		DateConverter dc = new DateConverter();
		strOutDefDate[0] = new String(dc.date2str(dateDefFrom));
		strOutDefDate[1] = new String(dc.date2str(dateDefTo));

		return true;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * デフォルト生産計画期間算出処理
	 *
	 * @param	dateBusinessOprDate	業務運用日
	 * @param	strAddMonth			加算月数
	 * @param	strDayTyp			生産計画日付区分
	 * @return	デフォルト生産計画期間日付:成功 / null:失敗
	 */
	private Date calcDefDate(
		Date dateBusinessOprDate,
		String strAddMonth,
		String strDayTyp)
	{
		Calendar cal = new GregorianCalendar();
		cal.setTime(dateBusinessOprDate);
		Date dateDef = cal.getTime();
		cal.add(Calendar.MONTH, Integer.parseInt(strAddMonth));	// 業務運用日に加算月数を加算
		dateDef = cal.getTime();
		if("1".equals(strDayTyp) == true)
		{
			// 月初へ設定する処理
			cal.set(Calendar.DAY_OF_MONTH , 1);
			dateDef = cal.getTime();
		}
		else if("2".equals(strDayTyp) == true)
		{
			// 月末へ設定する処理
			cal.add(Calendar.MONTH, 1);
			cal.set(Calendar.DAY_OF_MONTH, 1);
			cal.add(Calendar.DAY_OF_MONTH, -1);
			dateDef = cal.getTime();
		}
		else
		{
			// 生産計画日付区分異常
			dateDef = null;
		}
		return dateDef;
	}

	/**
	 * 加算月数取得
	 *
	 * @param	conn			DBアクセス用のコネクション
	 * @param	strPeriodTyp	生産計画期間区分
	 * @return	加算月数:成功 / null:失敗
	 * @throws	SQLException
	 */
	private String readSysPrdPlanPeriod4PlanSpan(
		IDbConnection conn,
		String strPeriodTyp) throws SQLException
	{
		PreparedStatement stmt = null;	// select
		ResultSet rset = null;
		String strPlanSpan = null;
		try
		{
			stmt = conn.getConn().prepareStatement(_sqlSysPrdPlanPeriod4PlanSpan);
			stmt.setString(1, strPeriodTyp);
			rset = stmt.executeQuery();
			if(rset.next() == true)
			{
				strPlanSpan = new String(rset.getString(1));
			}
		}
		finally
		{
			closeResultSet(rset);
			closePreparedStatement(stmt);
		}
		return strPlanSpan;
	}

	/**
	 * 生産計画日付区分取得
	 *
	 * @param	conn			DBアクセス用のコネクション
	 * @param	strPeriodTyp	生産計画期間区分
	 * @return	生産計画日付区分:成功 / null:失敗
	 * @throws	SQLException
	 */
	private String readSysPrdPlanPeriod4DayTyp(
		IDbConnection conn,
		String strPeriodTyp) throws SQLException
	{
		PreparedStatement stmt = null;	// select
		ResultSet rset = null;
		String strDayTyp = null;
		try
		{
			stmt = conn.getConn().prepareStatement(_sqlSysPrdPlanPeriod4DayTyp);
			stmt.setString(1, strPeriodTyp);
			rset = stmt.executeQuery();
			if(rset.next() == true)
			{
				strDayTyp = new String(rset.getString(1));
			}
		}
		finally
		{
			closeResultSet(rset);
			closePreparedStatement(stmt);
		}
		return strDayTyp;
	}

//------------------------------------------------------------------------------------
// SQL定義

	/** 加算月数読込SQL */
	private String _sqlSysPrdPlanPeriod4PlanSpan = ""
+"select "
+"  TO_CHAR(SYS_PRD_PLAN_PERIOD.PLAN_SPAN, 'FM9990') as PLAN_SPAN "
+"from "
+"  SYS_PRD_PLAN_PERIOD "
+"where "
+"  SYS_PRD_PLAN_PERIOD.PRD_PLAN_PERIOD_TYP = TO_NUMBER(?) ";


	/** 生産計画日付区分読込SQL */
	private String _sqlSysPrdPlanPeriod4DayTyp = ""
+"select "
+"  TO_CHAR(SYS_PRD_PLAN_PERIOD.PRD_PLAN_FINAL_DAY_TYP, 'FM90') as PRD_PLAN_FINAL_DAY_TYP "
+"from "
+"  SYS_PRD_PLAN_PERIOD "
+"where "
+"  SYS_PRD_PLAN_PERIOD.PRD_PLAN_PERIOD_TYP = TO_NUMBER(?) ";

}
