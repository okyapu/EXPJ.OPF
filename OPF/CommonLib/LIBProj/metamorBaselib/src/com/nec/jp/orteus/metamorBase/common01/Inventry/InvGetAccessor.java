//------------------------------------------------------------------------------
// (#)InvGetAccessor.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2004/01/23 新規作成  M.Isoda
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.Inventry;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import java.util.List;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import com.nec.jp.orteus.metamorBase.common01.db.DBErrorMessage;
import com.nec.jp.orteus.metamorBase.common01.util.DateConverter;

/**
 * 棚卸情報取得アクセッサクラス
 *
 * @author  M.Isoda
 * @version 1.00
*/
public class InvGetAccessor
{
//--------------------------------------------------------------------------
// 定数定義

	////////////////////////////////////////////////////////////////////////////
	// 取得情報種類定義定数

	/** 棚卸在庫情報 */
	public static final int DATA_NORMAL			= 0;
	/** 不良在庫情報 */
	public static final int DATA_DEFECT			= 1;
	/** マイナス在庫情報 */
	public static final int DATA_MINUS			= 2;
	/** 積送在庫情報 */
	public static final int DATA_TRANSPORT		= 3;
	/** ロット在庫情報 */
	public static final int DATA_LOT		= 4;

	////////////////////////////////////////////////////////////////////////////
	// 在庫種類定義定数

	/** 品目在庫 */
	public static final int STOCK_ITEM			= 0;
	
	/** 品目在庫 add on*/
	public static final int STOCK_ITEM_AddOn	= 10;

	/** 製番在庫 */
	public static final int STOCK_JOB_ODR		= 1;
	/** 積送在庫 */
	public static final int STOCK_TRANSPORT		= 2;
	/** ロット在庫 */
	public static final int STOCK_LOT		= 3;

	////////////////////////////////////////////////////////////////////////////
	// 棚卸種類定義定数

	/** 定期棚卸 */
	public static final int INV_REGULAR			= 0;
	/** 循環棚卸 */
	public static final int INV_CYCLE			= 1;
	/** 臨時棚卸 */
	public static final int	INV_TEMP			= 2;
	/** 循環、臨時棚卸 */
	public static final int INV_CYCLE_AND_TEMP	= 3;

//--------------------------------------------------------------------------
// 構築

	/** コンストラクタ */
	public InvGetAccessor(){ clear(); }

	/** コンストラクタ
	 *
	 * @param	strPlantCd		工場コード
	 * @param	strUserCd		ユーザコード
	 * @param	strProgramName	プログラム名（例 AH0070B001）
	 */
	public InvGetAccessor(
		String strPlantCd, 
		String strUserCd, 
		String strProgramName)
	{
		clear();
		_strPlantCd = strPlantCd;
		_strUserCd = strUserCd;
		_strProgramName = strProgramName;
		_msg = new InvMessageControl();
	}

//--------------------------------------------------------------------------
// 変数

	/** 工場コード格納用 */
	private String _strPlantCd = null;

	/** ユーザコード格納用 */
	private String _strUserCd = null;

	/** プログラム名格納用 */
	private String _strProgramName = null;

	/** メッセージ管理クラス */
	private InvMessageControl _msg = null;

//--------------------------------------------------------------------------
// 共通メソッド

	////////////////////////////////////////////////////////////////////////////
	/**
	 * クリア
	 *
	 * @return	なし
	 */
	public void clear()
	{
		_strPlantCd = null;
		_strUserCd = null;
		_strProgramName = null;
		_msg = null;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * メッセージ管理クラス設定
	 *
	 * @param	メッセージ管理クラス
	 */
	public void setMessage(InvMessageControl msg)
	{
		_msg = msg;
	}

	/**
	 * メッセージ管理クラス取得
	 *
	 * @return	メッセージ管理クラス
	 */
	public InvMessageControl getMessage()
	{
		return _msg;
	}

	/**
	 * 処理結果メッセージ管理クラス初期設定
	 *
	 * @return	なし
	 */
	public void initResultMessage()
	{
		_msg.clear();
	}

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

	/**
	 * 取得情報種類別データ取得<br>
	 *<br>
	 * @param	conn			DBアクセス用のコネクション
	 * @param	info			パラメータ情報
	 * @param	intKindData		取得情報種類
	 * @param	intKindStock	在庫種類
	 * @return	情報一覧:成功 / null:失敗
	 */
	public List getStockList(
		IDbConnection conn, 
		InvInformation info,
		int intKindData, 
		int intKindStock)
	{
		// 文字型から数値型へ変換
		int intRegularInvFlg = Integer.parseInt(info.getREGULAR_INV_FLG());
		int intCycleInvFlg = Integer.parseInt(info.getCYCLE_INV_FLG());
		int intTempInvFlg = Integer.parseInt(info.getTEMP_INV_FLG());
		
		List list = null;
		if( (intRegularInvFlg == 1) && (intCycleInvFlg == 0) && (intTempInvFlg == 0) )
		{
			// 定期棚卸のみの場合
			list = getList4Regular(conn, info, intKindData, intKindStock);
		}
		else if( (intRegularInvFlg == 0) && (intCycleInvFlg == 1) && (intTempInvFlg == 0) )
		{
			// 循環棚卸のみの場合
			list = getList4Cycle(conn, info, intKindData, intKindStock);
		}
		else if( (intRegularInvFlg == 0) && (intCycleInvFlg == 0) && (intTempInvFlg == 1) )
		{
			// 臨時棚卸のみの場合
			list = getList4Temp(conn, info, intKindData, intKindStock);
		}
		else if( (intRegularInvFlg == 0) && (intCycleInvFlg == 1) && (intTempInvFlg == 1) )
		{
			// 循環、臨時棚卸の場合
			list = getList4CycleAndTemp(conn, info, intKindData, intKindStock);
		}
		else
		{
			// フラグ値異常
		}
		return list;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * 棚卸制御テーブルからの読込処理<br>
	 *<br>
	 * @param	conn	DBアクセス用のコネクション
	 * @param	info	パラメータ情報
	 * @return	取得情報:成功 / null:失敗
	 */
	public InvInformation readInvCtrl(
		IDbConnection conn, 
		InvInformation info)
	{
		InvInformation infoTemp = null;
		PreparedStatement stmt = null;
		ResultSet rset = null;
		String strSQL = ""
			+"select "
			+" TO_CHAR(T_INV_CTRL.REGULAR_INV_FLG, 'fm0') as REGULAR_INV_FLG, "
			+" TO_CHAR(T_INV_CTRL.CYCLE_INV_FLG, 'fm0') as CYCLE_INV_FLG, "
			+" TO_CHAR(T_INV_CTRL.TEMP_INV_FLG, 'fm0') as TEMP_INV_FLG, "
			+" TO_CHAR(T_INV_CTRL.INV_STS_TYP, 'fm90') as INV_STS_TYP "
			+"from "
			+" T_INV_CTRL "
			+"where "
			+" T_INV_CTRL.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
			+" and T_INV_CTRL.PLANT_CD = ? ";
		try
		{
			stmt = conn.getConn().prepareStatement(strSQL);
			stmt.setString(1, info.getINV_DATE());
			stmt.setString(2, info.getPLANT_CD());
			rset = stmt.executeQuery();
			if(rset.next() == true)
			{
				infoTemp = new InvInformation();

				infoTemp.setREGULAR_INV_FLG(rset.getString(1));
				infoTemp.setCYCLE_INV_FLG(rset.getString(2));
				infoTemp.setTEMP_INV_FLG(rset.getString(3));
				infoTemp.setINV_STS_TYP(rset.getString(4));
			}
		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// エラー情報設定
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// 詳細情報
				+ " (SBM1076)棚卸日:[ " + info.getINV_DATE() + " ]"
				+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
			);
			infoTemp = null;
		}
		finally
		{
			closeResultSet(rset);
			closePreparedStatement(stmt);
		}
		return infoTemp;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * 情報一覧取得（定期棚卸）
	 *
	 * @param	conn			DBアクセス用のコネクション
	 * @param	info			パラメータ情報
	 * @param	intKindData		取得情報種類
	 * @param	intKindStock	在庫種類
	 * @return	情報一覧:成功 / null:失敗
	 */
	private List getList4Regular(
		IDbConnection conn, 
		InvInformation info,
		int intKindData, 
		int intKindStock)
	{
		List list = null;

		// SQL作成
		String strSql = getSql(info, intKindData, intKindStock, INV_REGULAR);
		String strSqlNoOrder = strSql;
		String strSqlOrderBy = getSqlOrderBy(intKindStock);
		if(strSqlOrderBy != null)
		{
			strSql += strSqlOrderBy;
		}

		// SQL実行
		PreparedStatement stmt = null;
		PreparedStatement stmtAddOn = null;

		ResultSet rset = null;
		ResultSet rsetAddOn = null;

		try
		{
			// 定期棚卸のみの場合
			stmt = conn.getConn().prepareStatement(strSql);
			stmt.setString(1, info.getPLANT_CD());
			stmt.setString(2, info.getWH_CD());
			stmt.setString(3, info.getITEM_CD());
			if(intKindStock == STOCK_ITEM || intKindStock == STOCK_TRANSPORT){
				stmt.setString(4, info.getLOT_NO());
			}

			rset = stmt.executeQuery();
			list = getList(rset, info, intKindStock);

			if(intKindStock == STOCK_ITEM && info.getLOT_NO().equals("%")){
				String strSqlAddOn = " select " 
					               + getSqlSelectFrom(STOCK_ITEM_AddOn)
					               + " where "
				                   + getSqlWhereBase(info, STOCK_ITEM_AddOn, INV_REGULAR)
				                   + getSqlWhereAdd(intKindData, STOCK_ITEM_AddOn);
				String allSql = _sqlSelectAllFromItem + strSqlNoOrder + " union " 
								+ strSqlAddOn + " )A " + _sqlAllOderByItem;

				stmtAddOn = conn.getConn().prepareStatement(allSql);
				stmtAddOn.setString(1, info.getPLANT_CD());
				stmtAddOn.setString(2, info.getWH_CD());
				stmtAddOn.setString(3, info.getITEM_CD());
				stmtAddOn.setString(4, info.getLOT_NO());					
				stmtAddOn.setString(5, info.getLOT_NO());
				stmtAddOn.setString(6, info.getPLANT_CD());
				stmtAddOn.setString(7, info.getWH_CD());
				stmtAddOn.setString(8, info.getITEM_CD());


				rsetAddOn = stmtAddOn.executeQuery();
				list = getList(rsetAddOn, info, intKindStock);				
			}

		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// エラー情報設定
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// 詳細情報
				+ " (SBM1112)工場コード:[ " + info.getPLANT_CD() + " ]"
				+ " 保管区コード:[ " + info.getWH_CD() + " ]"
			);
			list = null;
		}
		finally
		{
			closeResultSet(rset);
			closePreparedStatement(stmt);
			closePreparedStatement(stmtAddOn);
		}
		return list;
	}
	////////////////////////////////////////////////////////////////////////////
	/**
	 * 情報一覧取得（循環棚卸）
	 *
	 * @param	conn			DBアクセス用のコネクション
	 * @param	info			パラメータ情報
	 * @param	intKindData		取得情報種類
	 * @param	intKindStock	在庫種類
	 * @return	情報一覧:成功 / null:失敗
	 */
	private List getList4Cycle(
		IDbConnection conn, 
		InvInformation info,
		int intKindData, 
		int intKindStock)
	{
		List list = null;

		// SQL作成
		String strSql = null;
		strSql = getSql(info, intKindData, intKindStock, INV_CYCLE);
		String strSqlNoOrder = strSql;
		String strSqlOrderBy = getSqlOrderBy(intKindStock);
		if(strSqlOrderBy != null)
		{
			strSql += strSqlOrderBy;
		}

		// SQL実行
		PreparedStatement stmt = null;
		ResultSet rset = null;
		
		PreparedStatement stmtAddOn = null;
		ResultSet rsetAddOn = null;
		try
		{
			// 定期棚卸のみの場合
			stmt = conn.getConn().prepareStatement(strSql);
			stmt.setString(1, info.getPLANT_CD());
			stmt.setString(2, info.getPLANT_CD());
			stmt.setString(3, info.getWH_CD());
			stmt.setString(4, info.getITEM_CD());
			if(intKindStock == STOCK_ITEM || intKindStock == STOCK_TRANSPORT){
				stmt.setString(5, info.getLOT_NO());
			}
			
			rset = stmt.executeQuery();
			list = getList(rset, info, intKindStock);
			if(intKindStock == STOCK_ITEM && info.getLOT_NO().equals("%")){
				
				String strSqlAddOn = " select " 
					               + getSqlSelectFrom(STOCK_ITEM_AddOn)
					               + " where "
				                   + getSqlWhereBase(info, STOCK_ITEM_AddOn, INV_CYCLE)
				                   + getSqlWhereAdd(intKindData, STOCK_ITEM_AddOn);
				
				String allSql = _sqlSelectAllFromItem + strSqlNoOrder + " union " 
					+ strSqlAddOn + " )A " + _sqlAllOderByItem;

				stmtAddOn = conn.getConn().prepareStatement(allSql);
				stmtAddOn.setString(1, info.getPLANT_CD());
				stmtAddOn.setString(2, info.getPLANT_CD());
				stmtAddOn.setString(3, info.getWH_CD());
				stmtAddOn.setString(4, info.getITEM_CD());
				stmtAddOn.setString(5, info.getLOT_NO());
				stmtAddOn.setString(6, info.getLOT_NO());
				stmtAddOn.setString(7, info.getPLANT_CD());
				stmtAddOn.setString(8, info.getPLANT_CD());
				stmtAddOn.setString(9, info.getWH_CD());
				stmtAddOn.setString(10, info.getITEM_CD());
				
				rsetAddOn = stmtAddOn.executeQuery();
				list = getList(rsetAddOn, info, intKindStock);
			}

		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// エラー情報設定
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// 詳細情報
				+ " (SBM1112)工場コード:[ " + info.getPLANT_CD() + " ]"
				+ " 保管区コード:[ " + info.getWH_CD() + " ]"
			);
			list = null;
		}
		finally
		{
			closeResultSet(rset);
			closePreparedStatement(stmt);
			closePreparedStatement(stmtAddOn);
		}
		return list;
	}
	////////////////////////////////////////////////////////////////////////////
	/**
	 * 情報一覧取得（臨時棚卸）
	 *
	 * @param	conn			DBアクセス用のコネクション
	 * @param	info			パラメータ情報
	 * @param	intKindData		取得情報種類
	 * @param	intKindStock	在庫種類
	 * @return	情報一覧:成功 / null:失敗
	 */
	private List getList4Temp(
		IDbConnection conn, 
		InvInformation info,
		int intKindData, 
		int intKindStock)
	{
		List list = null;

		// SQL作成
		String strSql = null;
		strSql = getSql(info, intKindData, intKindStock, INV_TEMP);
		String strSqlNoOrder = strSql;
		String strSqlOrderBy = getSqlOrderBy(intKindStock);
		if(strSqlOrderBy != null)
		{
			strSql += strSqlOrderBy;
		}

		// SQL実行
		PreparedStatement stmt = null;
		ResultSet rset = null;
		PreparedStatement stmtAddOn = null;
		ResultSet rsetAddOn = null;
		try
		{
			// 定期棚卸のみの場合
			stmt = conn.getConn().prepareStatement(strSql);
			stmt.setString(1, info.getPLANT_CD());
			stmt.setString(2, info.getINV_DATE());
			stmt.setString(3, info.getPLANT_CD());
			stmt.setString(4, info.getINV_DATE());
			stmt.setString(5, info.getPLANT_CD());
			stmt.setString(6, info.getWH_CD());
			stmt.setString(7, info.getITEM_CD());
			if(intKindStock == STOCK_ITEM || intKindStock == STOCK_TRANSPORT){
				stmt.setString(8, info.getLOT_NO());
			}
						
			rset = stmt.executeQuery();
			list = getList(rset, info, intKindStock);
			
			if(intKindStock == STOCK_ITEM && info.getLOT_NO().equals("%")){
				String strSqlAddOn = " select " 
					               + getSqlSelectFrom(STOCK_ITEM_AddOn)
					               + " where "
				                   + getSqlWhereBase(info, STOCK_ITEM_AddOn, INV_TEMP)
				                   + getSqlWhereAdd(intKindData, STOCK_ITEM_AddOn);
				
				String allSql = _sqlSelectAllFromItem + strSqlNoOrder + " union " 
				+ strSqlAddOn + " )A " + _sqlAllOderByItem;
				stmtAddOn = conn.getConn().prepareStatement(allSql);
				stmtAddOn.setString(1, info.getPLANT_CD());
				stmtAddOn.setString(2, info.getINV_DATE());
				stmtAddOn.setString(3, info.getPLANT_CD());
				stmtAddOn.setString(4, info.getINV_DATE());
				stmtAddOn.setString(5, info.getPLANT_CD());
				stmtAddOn.setString(6, info.getWH_CD());
				stmtAddOn.setString(7, info.getITEM_CD());
				stmtAddOn.setString(8, info.getLOT_NO());
				stmtAddOn.setString(9, info.getLOT_NO());
				stmtAddOn.setString(10, info.getPLANT_CD());
				stmtAddOn.setString(11, info.getINV_DATE());
				stmtAddOn.setString(12, info.getPLANT_CD());
				stmtAddOn.setString(13, info.getINV_DATE());
				stmtAddOn.setString(14, info.getPLANT_CD());
				stmtAddOn.setString(15, info.getWH_CD());
				stmtAddOn.setString(16, info.getITEM_CD());

				rsetAddOn = stmtAddOn.executeQuery();
				list = getList(rsetAddOn, info, intKindStock);
			}

		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// エラー情報設定
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// 詳細情報
				+ " (SBM1113)棚卸日:[ " + info.getINV_DATE() + " ]"
				+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
				+ " 保管区コード:[ " + info.getWH_CD() + " ]"
			);
			list = null;
		}
		finally
		{
			closeResultSet(rset);
			closePreparedStatement(stmt);
			closePreparedStatement(stmtAddOn);
		}
		return list;
	}
	////////////////////////////////////////////////////////////////////////////
	/**
	 * 情報一覧取得（循環棚卸＆臨時棚卸）
	 *
	 * @param	conn			DBアクセス用のコネクション
	 * @param	info			パラメータ情報
	 * @param	intKindData		取得情報種類
	 * @param	intKindStock	在庫種類
	 * @return	情報一覧:成功 / null:失敗
	 */
	private List getList4CycleAndTemp(
		IDbConnection conn, 
		InvInformation info,
		int intKindData, 
		int intKindStock)
	{
		List list = null;

		// SQL作成
		String strSql = null;
		String strSql1 = getSql(info, intKindData, intKindStock, INV_CYCLE);
		String strSql2 = getSql(info, intKindData, intKindStock, INV_TEMP);
		if( (strSql1 != null) && (strSql2 != null) )
		{
			strSql = strSql1 + " union " + strSql2;
		}

		// SQL実行
		PreparedStatement stmt = null;
		ResultSet rset = null;

		PreparedStatement stmtAddOn_CycleTemp = null;
		ResultSet rsetAddOn_CycleTemp = null;

		try
		{
			if(intKindStock == STOCK_ITEM || intKindStock == STOCK_TRANSPORT){
				stmt = conn.getConn().prepareStatement(strSql);
				
				stmt.setString(1, info.getPLANT_CD());
				stmt.setString(2, info.getPLANT_CD());
				stmt.setString(3, info.getWH_CD());
				stmt.setString(4, info.getITEM_CD());
				stmt.setString(5, info.getLOT_NO());
				stmt.setString(6, info.getPLANT_CD());
				stmt.setString(7, info.getINV_DATE());
				stmt.setString(8, info.getPLANT_CD());
				stmt.setString(9, info.getINV_DATE());
				stmt.setString(10, info.getPLANT_CD());
				stmt.setString(11, info.getWH_CD());
				stmt.setString(12, info.getITEM_CD());
				stmt.setString(13, info.getLOT_NO());
				
				rset = stmt.executeQuery();
				list = getList(rset, info, intKindStock);
				
				if(intKindStock == STOCK_ITEM && info.getLOT_NO().equals("%")){
					String strSqlAddOn_Cycle = " select " 
						               + getSqlSelectFrom(STOCK_ITEM_AddOn)
						               + " where "
					                   + getSqlWhereBase(info, STOCK_ITEM_AddOn, INV_CYCLE)
					                   + getSqlWhereAdd(intKindData, STOCK_ITEM_AddOn);
					
					String strSqlAddOn_Temp = " select " 
			               + getSqlSelectFrom(STOCK_ITEM_AddOn)
			               + " where "
		                   + getSqlWhereBase(info, STOCK_ITEM_AddOn, INV_TEMP)
		                   + getSqlWhereAdd(intKindData, STOCK_ITEM_AddOn);
					
					String strSqlAddOn_CycleTemp = strSqlAddOn_Cycle + " union " + strSqlAddOn_Temp;
					
					String allSql = _sqlSelectAllFromItem + strSql + " union " 
					+ strSqlAddOn_CycleTemp + " )A " + _sqlAllOderByItem;
					
					stmtAddOn_CycleTemp = conn.getConn().prepareStatement(allSql);
					
					stmtAddOn_CycleTemp.setString(1, info.getPLANT_CD());
					stmtAddOn_CycleTemp.setString(2, info.getPLANT_CD());
					stmtAddOn_CycleTemp.setString(3, info.getWH_CD());
					stmtAddOn_CycleTemp.setString(4, info.getITEM_CD());
					stmtAddOn_CycleTemp.setString(5, info.getLOT_NO());
					stmtAddOn_CycleTemp.setString(6, info.getPLANT_CD());
					stmtAddOn_CycleTemp.setString(7, info.getINV_DATE());
					stmtAddOn_CycleTemp.setString(8, info.getPLANT_CD());
					stmtAddOn_CycleTemp.setString(9, info.getINV_DATE());
					stmtAddOn_CycleTemp.setString(10, info.getPLANT_CD());
					stmtAddOn_CycleTemp.setString(11, info.getWH_CD());
					stmtAddOn_CycleTemp.setString(12, info.getITEM_CD());
					stmtAddOn_CycleTemp.setString(13, info.getLOT_NO());
					stmtAddOn_CycleTemp.setString(14, info.getLOT_NO());
					stmtAddOn_CycleTemp.setString(15, info.getPLANT_CD());
					stmtAddOn_CycleTemp.setString(16, info.getPLANT_CD());
					stmtAddOn_CycleTemp.setString(17, info.getWH_CD());
					stmtAddOn_CycleTemp.setString(18, info.getITEM_CD());
					stmtAddOn_CycleTemp.setString(19, info.getLOT_NO());
					stmtAddOn_CycleTemp.setString(20, info.getPLANT_CD());
					stmtAddOn_CycleTemp.setString(21, info.getINV_DATE());
					stmtAddOn_CycleTemp.setString(22, info.getPLANT_CD());
					stmtAddOn_CycleTemp.setString(23, info.getINV_DATE());
					stmtAddOn_CycleTemp.setString(24, info.getPLANT_CD());
					stmtAddOn_CycleTemp.setString(25, info.getWH_CD());
					stmtAddOn_CycleTemp.setString(26, info.getITEM_CD());
					
					rsetAddOn_CycleTemp = stmtAddOn_CycleTemp.executeQuery();
					list = getList(rsetAddOn_CycleTemp, info, intKindStock);					
				}
				
			}else{
                // 定期棚卸のみの場合
				stmt = conn.getConn().prepareStatement(strSql);
				stmt.setString(1, info.getPLANT_CD());
				stmt.setString(2, info.getPLANT_CD());
				stmt.setString(3, info.getWH_CD());
				stmt.setString(4, info.getITEM_CD());
				stmt.setString(5, info.getPLANT_CD());
				stmt.setString(6, info.getINV_DATE());
				stmt.setString(7, info.getPLANT_CD());
				stmt.setString(8, info.getINV_DATE());
				stmt.setString(9, info.getPLANT_CD());
				stmt.setString(10, info.getWH_CD());
				stmt.setString(11, info.getITEM_CD());
				
				rset = stmt.executeQuery();
				list = getList(rset, info, intKindStock);
			}
		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// エラー情報設定
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// 詳細情報
				+ " (SBM1113)棚卸日:[ " + info.getINV_DATE() + " ]"
				+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
				+ " 保管区コード:[ " + info.getWH_CD() + " ]"
			);
			list = null;
		}
		finally
		{
			closeResultSet(rset);
			closePreparedStatement(stmt);
			closePreparedStatement(stmtAddOn_CycleTemp);
		}
		return list;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * 一覧情報取得（共通）
	 *
	 * @param	rset			対象ResultSet
	 * @param	info			パラメータ情報
	 * @param	intKindStock	在庫種類
	 * @return	SQL文字列:成功 / null:失敗
	 */
	private List getList(
		ResultSet rset, 
		InvInformation info,
		int intKindStock) throws SQLException
	{
		List list = new ArrayList(0);
		DateConverter dateConv = new DateConverter();
		int i = 0;
		while(rset.next() == true)
		{
			InvInformation infoTemp = new InvInformation();
			infoTemp.setINV_DATE(dateConv.date2str(dateConv.str2date(info.getINV_DATE())));
			switch(intKindStock)
			{
			case STOCK_ITEM: // 品目在庫
				infoTemp.setPLANT_CD(rset.getString(1));
				infoTemp.setPLANT_NAME(rset.getString(2));
				infoTemp.setWH_CD(rset.getString(3));
				infoTemp.setWH_NAME(rset.getString(4));
				infoTemp.setITEM_CD(rset.getString(5));
				infoTemp.setITEM_NAME(rset.getString(6));
				infoTemp.setLOT_NO_P(rset.getString(7));
				infoTemp.setEXTERNAL_LOT_NO(rset.getString(8));
				infoTemp.setSTOCK_ON_HAND_QTY(rset.getString(9));
				infoTemp.setDEFECT_QTY(rset.getString(10));
				infoTemp.setSTOCK_UNIT(rset.getString(11));
				infoTemp.setABC_TYP(rset.getString(12));

				break;
			case STOCK_JOB_ODR: // 製番在庫
				infoTemp.setPLANT_CD(rset.getString(1));
				infoTemp.setPLANT_NAME(rset.getString(2));
				infoTemp.setWH_CD(rset.getString(3));
				infoTemp.setWH_NAME(rset.getString(4));
				infoTemp.setITEM_CD(rset.getString(5));
				infoTemp.setITEM_NAME(rset.getString(6));
				infoTemp.setJOB_ODR_CD(rset.getString(7));
				infoTemp.setSTOCK_ON_HAND_QTY(rset.getString(8));
				infoTemp.setSTOCK_UNIT(rset.getString(9));
				infoTemp.setABC_TYP(rset.getString(10));
				break;
			case STOCK_LOT: // ロット在庫
				infoTemp.setPLANT_CD(rset.getString(1));
				infoTemp.setPLANT_NAME(rset.getString(2));
				infoTemp.setWH_CD(rset.getString(3));
				infoTemp.setWH_NAME(rset.getString(4));
				infoTemp.setITEM_CD(rset.getString(5));
				infoTemp.setITEM_NAME(rset.getString(6));
				infoTemp.setSTOCK_ON_HAND_QTY(rset.getString(7));
				infoTemp.setDEFECT_QTY(rset.getString(8));
				infoTemp.setSTOCK_UNIT(rset.getString(9));
				infoTemp.setABC_TYP(rset.getString(10));
				infoTemp.setLOT_NO(rset.getString(11));
				break;	
			case STOCK_TRANSPORT: // 積送在庫
				infoTemp.setISSUE_PLANT_CD(rset.getString(1));
				infoTemp.setISSUE_PLANT_NAME(rset.getString(2));
				infoTemp.setISSUE_WH_CD(rset.getString(3));
				infoTemp.setISSUE_WH_NAME(rset.getString(4));
				infoTemp.setITEM_CD(rset.getString(5));
				infoTemp.setITEM_NAME(rset.getString(6));
				infoTemp.setJOB_ODR_CD(rset.getString(7));
				infoTemp.setRCV_PLANT_CD(rset.getString(8));
				infoTemp.setRCV_PLANT_NAME(rset.getString(9));
				infoTemp.setRCV_WH_CD(rset.getString(10));
				infoTemp.setRCV_WH_NAME(rset.getString(11));
				infoTemp.setw_TRANSPORT_QTY(rset.getString(12));
				infoTemp.setSTOCK_UNIT(rset.getString(13));
				infoTemp.setABC_TYP(rset.getString(14));
				infoTemp.setLOT_NO_P(rset.getString(15));
				break;
			}
			list.add(infoTemp);
		}
		return list;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * 取得情報種類によるSQL取得
	 *
	 * @param	info			パラメータ情報
	 * @param	intKindData		取得情報種類
	 * @param	intKindStock	在庫種類
	 * @param	intInvFlg		棚卸種類
	 * @return	SQL文字列:成功 / null:失敗
	 */
	private String getSql(
		InvInformation info,
		int intKindData, 
		int intKindStock, 
		int intInvFlg)
	{
		// 作成したSQLを格納する変数を初期化
		String strSQL = null;

		// SELECT～FROM句取得
		String strSqlSelectFrom = getSqlSelectFrom(intKindStock);

		// WHERE句取得
		// 棚卸種類からwhere句を取得
		String strSqlWhereBase = getSqlWhereBase(info, intKindStock, intInvFlg);

		// 取得情報、在庫種類によるwhere句の追加条件SQLを取得
		String strSqlWhereAdd = getSqlWhereAdd(intKindData, intKindStock);

		// SQL作成
		if( (strSqlSelectFrom != null) && (strSqlWhereBase != null) && (strSqlWhereAdd != null) )
		{
			strSQL = "select " + strSqlSelectFrom + " where " + strSqlWhereBase + strSqlWhereAdd;
		}
		return strSQL;
	}


	////////////////////////////////////////////////////////////////////////////
	/**
	 * 在庫種類別によるSQL取得（SELECT～FROM句）
	 *
	 * @param	intKindStock	在庫種類
	 * @return	SQL文字列:成功 / null:失敗
	 */
	private String getSqlSelectFrom(
		int intKindStock)
	{
		String strSql = "";
		switch(intKindStock)
		{
		case STOCK_ITEM:		// 品目在庫
			strSql = _sqlSelectFromItem;
			break;
		case STOCK_ITEM_AddOn:		// 品目在庫 add on
			strSql = _sqlSelectFromItem_AddOn;
			break;
		case STOCK_JOB_ODR:	// 製番在庫
			strSql = _sqlSelectFromJobOdr;
			break;
		case STOCK_LOT:	// ロット在庫
			strSql = _sqlSelectFromLot;
			break;
		case STOCK_TRANSPORT:	// 積送在庫
			strSql = _sqlSelectFromTransport;
			break;
		default:// エラー
			strSql = null;
			break;
		}
		return strSql;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * 棚卸タイプ、在庫種類別による条件SQL取得（WHERE句）
	 *
	 * @param	info			パラメータ情報
	 * @param	intKindStock	在庫種類
	 * @param	intInvFlg		棚卸種類
	 * @return	SQL文字列:成功 / null:失敗
	 */
	private String getSqlWhereBase(
		InvInformation info,
		int intKindStock, 
		int intInvFlg)
	{
		String strSql = "";
		switch(intInvFlg)
		{
		case INV_REGULAR:// 定期棚卸
			switch(intKindStock)
			{
			case STOCK_ITEM:		// 品目在庫
				strSql = _sqlWhereRegularAndItem;
				break;
			case STOCK_ITEM_AddOn:		// 品目在庫  addon
				strSql = _sqlWhereRegularAndItem_AddOn;
				break;
			case STOCK_JOB_ODR:	// 製番在庫
				strSql = _sqlWhereRegularAndJobOdr;
				break;
			case STOCK_LOT:	// ロット在庫
				strSql = _sqlWhereRegularAndLot;
				break;
			case STOCK_TRANSPORT:	// 積送在庫
				strSql = _sqlWhereRegularAndTransport;
				break;
			default:// エラー
				strSql = null;
				break;
			}
			break;
		case INV_CYCLE:// 循環棚卸
			switch(intKindStock)
			{
			case STOCK_ITEM:		// 品目在庫
				strSql = _sqlWhereCycleAndItem;
				break;
			case STOCK_ITEM_AddOn:		// 品目在庫  addon
				strSql = _sqlWhereCycleAndItem_AddOn;
				break;
			case STOCK_JOB_ODR:	// 製番在庫
				strSql = _sqlWhereCycleAndJobOdr;
				break;
			case STOCK_LOT:	// ロット在庫
				strSql = _sqlWhereCycleAndLot;
				break;
			case STOCK_TRANSPORT:	// 積送在庫
				strSql = _sqlWhereCycleAndTransport;
				break;
			default:// エラー
				strSql = null;
				break;
			}

			// 棚卸日の月とマッチする棚卸実施月フラグの条件を設定する処理
			if( (strSql != null) && ("".equals(strSql) != true) )
			{
				Object[] monthNames = {"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};

				// 棚卸日付の月を取得
				DateConverter dateConv = new DateConverter();
				Date dateWork = dateConv.str2date(info.getINV_DATE());
				Calendar cal = new GregorianCalendar();
				cal.setTime(dateWork);
				int intMonth = cal.get(Calendar.MONTH);

				// 条件生成
				if( (intMonth >= 0) && (intMonth <= 11) )
				{
					// 棚卸月のフラグの条件式を生成する
					Object param[] = new Object[1];
					param[0] = monthNames[intMonth];
					strSql = MessageFormat.format(strSql, param);
				}
				else
				{
					// エラー
					strSql = null;
				}
			}
			break;
		case INV_TEMP:// 臨時棚卸
			switch(intKindStock)
			{
			case STOCK_ITEM:		// 品目在庫
				strSql = _sqlWhereTempAndItem;
				break;
			case STOCK_ITEM_AddOn:		// 品目在庫 add on
				strSql = _sqlWhereTempAndItem_AddOn;
				break;
			case STOCK_JOB_ODR:	// 製番在庫
				strSql = _sqlWhereTempAndJobOdr;
				break;
			case STOCK_LOT:	// ロット在庫
				strSql = _sqlWhereTempAndLot;
				break;
			case STOCK_TRANSPORT:	// 積送在庫
				strSql = _sqlWhereTempAndTransport;
				break;
			default:// エラー
				strSql = null;
				break;
			}
			break;
		default:// エラー
			strSql = null;
			break;
		}
		return strSql;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * 取得情報、在庫種類による追加条件SQL取得（WHERE句）
	 *
	 * @param	intKindData		取得情報種類
	 * @param	intKindStock	在庫種類
	 * @return	SQL文字列:成功 / null:失敗
	 */
	private String getSqlWhereAdd(
		int intKindData, 
		int intKindStock)
	{
		String strSql = "";
		switch(intKindData)
		{
		case DATA_NORMAL:// 棚卸在庫情報
			switch(intKindStock)
			{
			case STOCK_ITEM:// 品目在庫
				strSql = _sqlWhereAddNormalAndItem;
				break;
			case STOCK_ITEM_AddOn:// 品目在庫
				strSql = _sqlWhereAddNormalAndItem_AddOn;
				break;
			case STOCK_JOB_ODR:// 製番在庫
				strSql = _sqlWhereAddNormalAndJobOdr;
				break;
			case STOCK_LOT:// ロット在庫
				strSql = _sqlWhereAddNormalAndLot;
				break;
			}
			break;
		case DATA_DEFECT:		// 不良在庫情報
			if(intKindStock == STOCK_ITEM)// 品目在庫
			{
				strSql = _sqlWhereAddDefectAndItem;
			}
			if(intKindStock == STOCK_ITEM_AddOn)// 品目在庫 add on
			{
				strSql = _sqlWhereAddDefectAndItem_AddOn;
			}
			break;
		case DATA_MINUS:		// マイナス在庫情報
			switch(intKindStock)
			{
			case STOCK_ITEM:// 品目在庫
				strSql = _sqlWhereAddMinusAndItem;
				break;
			case STOCK_ITEM_AddOn:// 品目在庫 add on
				strSql = _sqlWhereAddMinusAndItem_AddOn;
				break;
			case STOCK_JOB_ODR:// 製番在庫
				strSql = _sqlWhereAddMinusAndJobOdr;
				break;
			}
			break;
		case DATA_TRANSPORT:	// 積送在庫情報
			if(intKindStock == STOCK_TRANSPORT)// 積送在庫
			{
				strSql = _sqlWhereAddTransportAndTransport;
			}
			break;
		case DATA_LOT:	// ロット在庫情報
			if(intKindStock == STOCK_LOT)// ロット在庫
			{
				strSql = _sqlWhereAddNormalAndLot;
			}
			break;	
		default:
			// エラー
			strSql = null;
		}
		return strSql;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * 在庫種類による並び順SQLを取得(ORDER BY句)
	 *
	 * @param	intKindStock	在庫種類
	 * @return	SQL文字列:成功 / null:失敗
	 */
	private String getSqlOrderBy(
		int intKindStock)
	{
		String strSql = "";
		switch(intKindStock)
		{
		case STOCK_ITEM:// 品目在庫
			strSql = _sqlOderByItem;
			break;
		case STOCK_JOB_ODR:// 製番在庫
			strSql = _sqlOderByJobOdr;
			break;
		case STOCK_TRANSPORT:// 積送在庫
			strSql = _sqlOderByTransport;
			break;
		case STOCK_LOT:// 品目在庫
			strSql = _sqlOderByLot;
			break;	
		default:
			// エラー
			strSql = null;
		}
		return strSql;
	}

//------------------------------------------------------------------------------------
// SQL定義

	////////////////////////////////////////////////////////////////////////////
	// 読込SQL定義

	/** 品目在庫読込部分SQL */
	private String _sqlSelectFromItem = ""
+" T_ITEM_STOCK.PLANT_CD as PLANT_CD "
+",M_PLANT.PLANT_NAME as PLANT_NAME "
+",T_ITEM_STOCK.WH_CD as WH_CD "
+",M_WH.WH_NAME as WH_NAME "
+",T_ITEM_STOCK.ITEM_CD as ITEM_CD "
+",M_ITEM.ITEM_NAME as ITEM_NAME "
+",T_LOT_STOCK.LOT_NO  as LOT_NO " 
+",T_LOT_CTRL.EXTERNAL_LOT_NO  as EXTERNAL_LOT_NO "
+",TO_CHAR(T_LOT_STOCK.STOCK_ON_HAND_QTY, 'fm99999999999990.0999') as STOCK_ON_HAND_QTY "
+",TO_CHAR(T_LOT_STOCK.DEFECT_QTY, 'fm99999999999990.0999') as DEFECT_QTY "
+",M_ITEM.STOCK_UNIT as STOCK_UNIT "
+",M_ITEM.ABC_TYP as ABC_TYP "
+"from "
+" T_ITEM_STOCK "
+",M_PLANT "
+",M_ITEM "
+",M_WH "
+",T_LOT_STOCK "
+",T_LOT_CTRL ";

	// 読込SQL定義
		/** 品目在庫読込部分SQL */
		private String _sqlSelectFromItem_AddOn = ""
	+" T_ITEM_STOCK.PLANT_CD as PLANT_CD "
	+",M_PLANT.PLANT_NAME as PLANT_NAME "
	+",T_ITEM_STOCK.WH_CD as WH_CD "
	+",M_WH.WH_NAME as WH_NAME "
	+",T_ITEM_STOCK.ITEM_CD as ITEM_CD "
	+",M_ITEM.ITEM_NAME as ITEM_NAME "
	+",null " 
	+",null "
	+",TO_CHAR((NVL(T_ITEM_STOCK.STOCK_ON_HAND_QTY,0)-NVL(LOT_SUM.SUM_LOT_STOCK_QTY,0)), 'fm99999999999990.0999') as STOCK_ON_HAND_QTY "
	+",TO_CHAR((NVL(T_ITEM_STOCK.DEFECT_QTY,0) - NVL(LOT_SUM.SUM_DEFECT_QTY,0)), 'fm99999999999990.0999') as DEFECT_QTY "
	+",M_ITEM.STOCK_UNIT as STOCK_UNIT "
	+",M_ITEM.ABC_TYP as ABC_TYP "
	+"from "
	+" T_ITEM_STOCK "
	+",M_PLANT "
	+",M_ITEM "
	+",M_WH "
	+",(select SUM(T_LOT_STOCK.STOCK_ON_HAND_QTY) AS SUM_LOT_STOCK_QTY, SUM(T_LOT_STOCK.DEFECT_QTY) AS SUM_DEFECT_QTY,T_LOT_STOCK.ITEM_CD ITEM_CD_a,T_LOT_STOCK.WH_CD WH_CD_a, T_LOT_STOCK.PLANT_CD PLANT_CD_A from T_LOT_STOCK WHERE T_LOT_STOCK.LOT_NO LIKE ? group by T_LOT_STOCK.ITEM_CD ,T_LOT_STOCK.WH_CD,T_LOT_STOCK.PLANT_CD ) LOT_SUM ";

   /** 品目在庫読込部分SQL */
   private String _sqlSelectAllFromItem = "select"
   + " A.PLANT_CD as PLANT_CD, "
   + " A.PLANT_NAME as PLANT_NAME,"
   + " A.WH_CD as WH_CD,"
   + " A.WH_NAME as WH_NAME,"
   + " A.ITEM_CD as ITEM_CD,"
   + " A.ITEM_NAME as ITEM_NAME,"
   + " A.LOT_NO  as LOT_NO,"
   + " A.EXTERNAL_LOT_NO as EXTERNAL_LOT_NO,"
   + " A.STOCK_ON_HAND_QTY as STOCK_ON_HAND_QTY,"
   + " A.DEFECT_QTY as DEFECT_QTY,"
   + " A.STOCK_UNIT as STOCK_UNIT," 
   + " A.ABC_TYP as ABC_TYP"
   + " FROM (";
   						
	/** 製番在庫読込部分SQL */
	private String _sqlSelectFromJobOdr = ""
+" T_JOB_ODR_CD_STOCK.PLANT_CD as PLANT_CD "
+",M_PLANT.PLANT_NAME as PLANT_NAME "
+",T_JOB_ODR_CD_STOCK.WH_CD as WH_CD "
+",M_WH.WH_NAME as WH_NAME "
+",T_JOB_ODR_CD_STOCK.ITEM_CD as ITEM_CD "
+",M_ITEM.ITEM_NAME as ITEM_NAME "
+",T_JOB_ODR_CD_STOCK.JOB_ODR_CD as JOB_ODR_CD "
+",TO_CHAR(T_JOB_ODR_CD_STOCK.STOCK_ON_HAND_QTY, 'fm99999999999990.0999') as STOCK_ON_HAND_QTY "
+",M_ITEM.STOCK_UNIT as STOCK_UNIT "
+",M_ITEM.ABC_TYP as ABC_TYP "
+"from "
+" T_JOB_ODR_CD_STOCK "
+",M_PLANT "
+",M_ITEM "
+",M_WH ";
	
	/** ロット在庫読込部分SQL */
	private String _sqlSelectFromLot = ""
		+" T_LOT_STOCK.PLANT_CD as PLANT_CD "
		+",M_PLANT.PLANT_NAME as PLANT_NAME "
		+",T_LOT_STOCK.WH_CD as WH_CD "
		+",M_WH.WH_NAME as WH_NAME "
		+",T_LOT_STOCK.ITEM_CD as ITEM_CD "
		+",M_ITEM.ITEM_NAME as ITEM_NAME "
		+",TO_CHAR(T_LOT_STOCK.STOCK_ON_HAND_QTY, 'fm99999999999990.0999') as STOCK_ON_HAND_QTY "
		+",TO_CHAR(T_LOT_STOCK.DEFECT_QTY, 'fm99999999999990.0999') as DEFECT_QTY "
		+",M_ITEM.STOCK_UNIT as STOCK_UNIT "
		+",M_ITEM.ABC_TYP as ABC_TYP "
		+",T_LOT_STOCK.LOT_NO as LOT_NO "
		+"from "
		+" T_LOT_STOCK "
		+",M_PLANT "
		+",M_ITEM "
		+",M_WH ";

	/** 積送在庫の読込内容 */
	private String _sqlSelectFromTransport = ""
+" T_TRANSPORT_STOCK.ISSUE_PLANT_CD as ISSUE_PLANT_CD "
+",PLANT1.PLANT_NAME as ISSUE_PLANT_NAME "
+",T_TRANSPORT_STOCK.ISSUE_WH_CD as ISSUE_WH_CD "
+",WH1.WH_NAME as ISSUE_WH_NAME "
+",T_TRANSPORT_STOCK.ITEM_CD as ITEM_CD "
+",M_ITEM.ITEM_NAME as ITEM_NAME "
+",T_TRANSPORT_STOCK.JOB_ODR_CD as JOB_ODR_CD "
+",T_TRANSPORT_STOCK.RCV_PLANT_CD as RCV_PLANT_CD "
+",PLANT2.PLANT_NAME as RCV_PLANT_NAME "
+",T_TRANSPORT_STOCK.RCV_WH_CD as RCV_WH_CD "
+",WH2.WH_NAME as RCV_WH_NAME "
+",TO_CHAR((T_TRANSPORT_STOCK.ISSUE_QTY - T_TRANSPORT_STOCK.RCV_QTY), 'fm99999999999990.0999') as TRANSPORT_QTY "
+",M_ITEM.STOCK_UNIT as STOCK_UNIT "
+",M_ITEM.ABC_TYP as ABC_TYP "
+",T_TRANSPORT_STOCK.LOT_NO AS LOT_NO "
+"from "
+" T_TRANSPORT_STOCK "
+",M_PLANT PLANT1 "
+",M_PLANT PLANT2 "
+",M_ITEM "
+",M_WH WH1 "
+",M_WH WH2 ";

	////////////////////////////////////////////////////////////////////////////
	// 条件SQL定義

	/** 定期棚卸、品目在庫 */
	private String _sqlWhereRegularAndItem = ""
+" T_ITEM_STOCK.WH_CD = M_WH.WH_CD "
+" and T_ITEM_STOCK.ITEM_CD = M_ITEM.ITEM_CD "
+" and T_ITEM_STOCK.PLANT_CD = M_PLANT.PLANT_CD "
+" and T_ITEM_STOCK.PLANT_CD = ? "
+" and M_ITEM.ABC_TYP <> 9 "
+" and M_ITEM.MRP_ODR_TYP <> 8 "
+" and T_LOT_STOCK.STOCK_ON_HAND_QTY > 0 "
+" and T_LOT_CTRL.LOT_NO = T_LOT_STOCK.LOT_NO "
+" and T_LOT_CTRL.ITEM_CD = T_LOT_STOCK.ITEM_CD "
+" and T_LOT_STOCK.ITEM_CD = T_ITEM_STOCK.ITEM_CD "
+" and T_LOT_STOCK.WH_CD = T_ITEM_STOCK.WH_CD "
+" and T_LOT_STOCK.PLANT_CD = T_ITEM_STOCK.PLANT_CD "
+" and M_ITEM.LOT_CTRL_FLG = 1 ";

	/** 定期棚卸、品目在庫 add on */
	private String _sqlWhereRegularAndItem_AddOn = ""
+" T_ITEM_STOCK.WH_CD = M_WH.WH_CD "
+" and T_ITEM_STOCK.ITEM_CD = M_ITEM.ITEM_CD "
+" and T_ITEM_STOCK.PLANT_CD = M_PLANT.PLANT_CD "
+" and T_ITEM_STOCK.PLANT_CD = ? "
+" and M_ITEM.ABC_TYP <> 9 "
+" and M_ITEM.MRP_ODR_TYP <> 8 "
+" and T_ITEM_STOCK.ITEM_CD = LOT_SUM.ITEM_CD_a(+) "
+" and T_ITEM_STOCK.WH_CD = LOT_SUM.WH_CD_a(+) "
+" and T_ITEM_STOCK.PLANT_CD = LOT_SUM.PLANT_CD_a(+) "
+" and  ("
+" M_ITEM.LOT_CTRL_FLG = 0"
+" OR"
+" (M_ITEM.LOT_CTRL_FLG = 1"
+" AND T_ITEM_STOCK.STOCK_ON_HAND_QTY<>LOT_SUM.SUM_LOT_STOCK_QTY"
+" OR T_ITEM_STOCK.DEFECT_QTY <> LOT_SUM.SUM_DEFECT_QTY)"
+" )";


	/** 定期棚卸、製番在庫 */
	private String _sqlWhereRegularAndJobOdr = ""
+" T_JOB_ODR_CD_STOCK.WH_CD = M_WH.WH_CD "
+" and T_JOB_ODR_CD_STOCK.ITEM_CD = M_ITEM.ITEM_CD "
+" and T_JOB_ODR_CD_STOCK.PLANT_CD = M_PLANT.PLANT_CD "
+" and T_JOB_ODR_CD_STOCK.PLANT_CD = ? "
+" and M_ITEM.ABC_TYP <> 9 "
+" and M_ITEM.MRP_ODR_TYP <> 8 ";
	
	/** 定期棚卸、ロット在庫 */
	private String _sqlWhereRegularAndLot = ""
		+" T_LOT_STOCK.WH_CD = M_WH.WH_CD "
		+" and T_LOT_STOCK.ITEM_CD = M_ITEM.ITEM_CD "
		+" and T_LOT_STOCK.PLANT_CD = M_PLANT.PLANT_CD "
		+" and T_LOT_STOCK.STOCK_ON_HAND_QTY > 0 "
		+" and T_LOT_STOCK.PLANT_CD = ? "
		+" and M_ITEM.ABC_TYP <> 9 "
		+" and M_ITEM.MRP_ODR_TYP <> 8 ";


	/** 定期棚卸、積送在庫 */
	private String _sqlWhereRegularAndTransport = ""
+" T_TRANSPORT_STOCK.ISSUE_WH_CD = WH1.WH_CD "
+" and T_TRANSPORT_STOCK.RCV_WH_CD = WH2.WH_CD "
+" and T_TRANSPORT_STOCK.ITEM_CD = M_ITEM.ITEM_CD "
+" and T_TRANSPORT_STOCK.ISSUE_PLANT_CD = PLANT1.PLANT_CD "
+" and T_TRANSPORT_STOCK.RCV_PLANT_CD = PLANT2.PLANT_CD "
+" and T_TRANSPORT_STOCK.ISSUE_PLANT_CD = ? "
+" and T_TRANSPORT_STOCK.TRANSPORT_CMPLT_TYP = 0 "
+" and M_ITEM.ABC_TYP <> 9 "
+" and M_ITEM.MRP_ODR_TYP <> 8 ";


	/** 循環棚卸、品目在庫 */
	private String _sqlWhereCycleAndItem = ""
+" T_ITEM_STOCK.WH_CD = M_WH.WH_CD "
+" and T_ITEM_STOCK.ITEM_CD = M_ITEM.ITEM_CD "
+" and M_ITEM.ABC_TYP <> 9 "
+" and M_ITEM.MRP_ODR_TYP <> 8 "
+" and T_LOT_STOCK.STOCK_ON_HAND_QTY > 0 "
+" and T_ITEM_STOCK.PLANT_CD = M_PLANT.PLANT_CD "
+" and T_ITEM_STOCK.PLANT_CD = ? "
+" and T_ITEM_STOCK.ITEM_CD IN ( "
+"  select "
+"   T_INV_CYCLE.ITEM_CD "
+"  from "
+"   T_INV_CYCLE "
+"  where "
+"   T_INV_CYCLE.PLANT_CD = ? "
+"   and T_INV_CYCLE.INV_FLG_{0} = 1 "
+" ) "
+" and T_LOT_CTRL.LOT_NO = T_LOT_STOCK.LOT_NO "
+" and T_LOT_CTRL.ITEM_CD = T_LOT_STOCK.ITEM_CD "
+" and T_LOT_STOCK.ITEM_CD = T_ITEM_STOCK.ITEM_CD "
+" and T_LOT_STOCK.WH_CD = T_ITEM_STOCK.WH_CD "
+" and T_LOT_STOCK.PLANT_CD = T_ITEM_STOCK.PLANT_CD ";

	/** 循環棚卸、品目在庫 add on */
	private String _sqlWhereCycleAndItem_AddOn = ""
+" T_ITEM_STOCK.WH_CD = M_WH.WH_CD "
+" and T_ITEM_STOCK.ITEM_CD = M_ITEM.ITEM_CD "
+" and M_ITEM.ABC_TYP <> 9 "
+" and M_ITEM.MRP_ODR_TYP <> 8 "
+" and T_ITEM_STOCK.PLANT_CD = M_PLANT.PLANT_CD "
+" and T_ITEM_STOCK.PLANT_CD = ? "
+" and T_ITEM_STOCK.ITEM_CD IN ( "
+"  select "
+"   T_INV_CYCLE.ITEM_CD "
+"  from "
+"   T_INV_CYCLE "
+"  where "
+"   T_INV_CYCLE.PLANT_CD = ? "
+"   and T_INV_CYCLE.INV_FLG_{0} = 1 "
+" ) "
+" and T_ITEM_STOCK.ITEM_CD = LOT_SUM.ITEM_CD_a(+) "
+" and T_ITEM_STOCK.WH_CD = LOT_SUM.WH_CD_a(+) "
+" and T_ITEM_STOCK.PLANT_CD = LOT_SUM.PLANT_CD_a(+) "
+" and  ("
+" M_ITEM.LOT_CTRL_FLG = 0"
+" OR"
+" (M_ITEM.LOT_CTRL_FLG = 1"
+" AND T_ITEM_STOCK.STOCK_ON_HAND_QTY<>LOT_SUM.SUM_LOT_STOCK_QTY"
+" OR T_ITEM_STOCK.DEFECT_QTY <> LOT_SUM.SUM_DEFECT_QTY)"
+" )";


	/** 循環棚卸、製番在庫 */
	private String _sqlWhereCycleAndJobOdr = ""
+" T_JOB_ODR_CD_STOCK.WH_CD = M_WH.WH_CD "
+" and T_JOB_ODR_CD_STOCK.ITEM_CD = M_ITEM.ITEM_CD "
+" and M_ITEM.ABC_TYP <> 9 "
+" and M_ITEM.MRP_ODR_TYP <> 8 "
+" and T_JOB_ODR_CD_STOCK.PLANT_CD = M_PLANT.PLANT_CD "
+" and T_JOB_ODR_CD_STOCK.PLANT_CD = ? "
+" and T_JOB_ODR_CD_STOCK.ITEM_CD IN ( "
+"  select "
+"   T_INV_CYCLE.ITEM_CD "
+"  from "
+"   T_INV_CYCLE "
+"  where "
+"   T_INV_CYCLE.PLANT_CD = ? "
+"   and T_INV_CYCLE.INV_FLG_{0} = 1 "
+" ) ";
	
	/** 循環棚卸、ロット在庫 */
	private String _sqlWhereCycleAndLot = ""
		+" T_LOT_STOCK.WH_CD = M_WH.WH_CD "
		+" and T_LOT_STOCK.ITEM_CD = M_ITEM.ITEM_CD "
		+" and M_ITEM.ABC_TYP <> 9 "
		+" and M_ITEM.MRP_ODR_TYP <> 8 "
		+" and T_LOT_STOCK.PLANT_CD = M_PLANT.PLANT_CD "
		+" and T_LOT_STOCK.PLANT_CD = ? "
		+" and T_LOT_STOCK.STOCK_ON_HAND_QTY > 0 "
		+" and T_LOT_STOCK.ITEM_CD IN ( "
		+"  select "
		+"   T_INV_CYCLE.ITEM_CD "
		+"  from "
		+"   T_INV_CYCLE "
		+"  where "
		+"   T_INV_CYCLE.PLANT_CD = ? "
		+"   and T_INV_CYCLE.INV_FLG_{0} = 1 "
		+" ) ";

	/** 循環棚卸、積送在庫 */
	private String _sqlWhereCycleAndTransport = ""
+" T_TRANSPORT_STOCK.ISSUE_WH_CD = WH1.WH_CD "
+" and T_TRANSPORT_STOCK.RCV_WH_CD = WH2.WH_CD "
+" and T_TRANSPORT_STOCK.ITEM_CD = M_ITEM.ITEM_CD "
+" and M_ITEM.ABC_TYP <> 9 "
+" and M_ITEM.MRP_ODR_TYP <> 8 "
+" and T_TRANSPORT_STOCK.ISSUE_PLANT_CD = PLANT1.PLANT_CD "
+" and T_TRANSPORT_STOCK.RCV_PLANT_CD = PLANT2.PLANT_CD "
+" and T_TRANSPORT_STOCK.ISSUE_PLANT_CD = ? "
+" and T_TRANSPORT_STOCK.TRANSPORT_CMPLT_TYP = 0 "
+" and T_TRANSPORT_STOCK.ITEM_CD IN ( "
+"  select "
+"   T_INV_CYCLE.ITEM_CD "
+"  from "
+"   T_INV_CYCLE "
+"  where "
+"   T_INV_CYCLE.PLANT_CD = ? "
+"   and T_INV_CYCLE.INV_FLG_{0} = 1 "
+" ) ";

	/** 臨時棚卸、品目在庫 */
	private String _sqlWhereTempAndItem = ""
+" T_ITEM_STOCK.WH_CD = M_WH.WH_CD "
+" and T_ITEM_STOCK.ITEM_CD = M_ITEM.ITEM_CD "
+" and M_ITEM.ABC_TYP <> 9 "
+" and M_ITEM.MRP_ODR_TYP <> 8 "
+" and T_LOT_STOCK.STOCK_ON_HAND_QTY > 0 "
+" and T_ITEM_STOCK.PLANT_CD = M_PLANT.PLANT_CD "
+" and T_ITEM_STOCK.PLANT_CD = ? "
+" and ((T_ITEM_STOCK.WH_CD IN ( "
+"	  select "
+"	   T_INV_TARGET_WH.WH_CD "
+"	  from "
+"	   T_INV_TARGET_WH "
+"	  where "
+"	   T_INV_TARGET_WH.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+"	   and T_INV_TARGET_WH.PLANT_CD = ? )) "
+"	 or (T_ITEM_STOCK.ITEM_CD IN ( "
+"	  select "
+"	   T_INV_TARGET_ITEM.ITEM_CD "
+"	  from "
+"	   T_INV_TARGET_ITEM "
+"	  where "
+"	   T_INV_TARGET_ITEM.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+"	   and T_INV_TARGET_ITEM.PLANT_CD = ? )) "
+" ) "
+" and T_LOT_CTRL.LOT_NO = T_LOT_STOCK.LOT_NO "
+" and T_LOT_CTRL.ITEM_CD = T_LOT_STOCK.ITEM_CD "
+" and T_LOT_STOCK.ITEM_CD = T_ITEM_STOCK.ITEM_CD "
+" and T_LOT_STOCK.WH_CD = T_ITEM_STOCK.WH_CD "
+" and T_LOT_STOCK.PLANT_CD = T_ITEM_STOCK.PLANT_CD ";

	/** 臨時棚卸、品目在庫 add on*/
	private String _sqlWhereTempAndItem_AddOn = ""
+" T_ITEM_STOCK.WH_CD = M_WH.WH_CD "
+" and T_ITEM_STOCK.ITEM_CD = M_ITEM.ITEM_CD "
+" and M_ITEM.ABC_TYP <> 9 "
+" and M_ITEM.MRP_ODR_TYP <> 8 "
+" and T_ITEM_STOCK.PLANT_CD = M_PLANT.PLANT_CD "
+" and T_ITEM_STOCK.PLANT_CD = ? "
+" and ((T_ITEM_STOCK.WH_CD IN ( "
+"	  select "
+"	   T_INV_TARGET_WH.WH_CD "
+"	  from "
+"	   T_INV_TARGET_WH "
+"	  where "
+"	   T_INV_TARGET_WH.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+"	   and T_INV_TARGET_WH.PLANT_CD = ? )) "
+"	 or (T_ITEM_STOCK.ITEM_CD IN ( "
+"	  select "
+"	   T_INV_TARGET_ITEM.ITEM_CD "
+"	  from "
+"	   T_INV_TARGET_ITEM "
+"	  where "
+"	   T_INV_TARGET_ITEM.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+"	   and T_INV_TARGET_ITEM.PLANT_CD = ? )) "
+" ) "
+" and T_ITEM_STOCK.ITEM_CD = LOT_SUM.ITEM_CD_a(+) "
+" and T_ITEM_STOCK.WH_CD = LOT_SUM.WH_CD_a(+) "
+" and T_ITEM_STOCK.PLANT_CD = LOT_SUM.PLANT_CD_a(+) "
+" and  ("
+" M_ITEM.LOT_CTRL_FLG = 0"
+" OR"
+" (M_ITEM.LOT_CTRL_FLG = 1"
+" AND T_ITEM_STOCK.STOCK_ON_HAND_QTY<>LOT_SUM.SUM_LOT_STOCK_QTY"
+" OR T_ITEM_STOCK.DEFECT_QTY <> LOT_SUM.SUM_DEFECT_QTY)"
+" )";


	/** 臨時棚卸、製番在庫 */
	private String _sqlWhereTempAndJobOdr = ""
+" T_JOB_ODR_CD_STOCK.WH_CD = M_WH.WH_CD "
+" and T_JOB_ODR_CD_STOCK.ITEM_CD = M_ITEM.ITEM_CD "
+" and M_ITEM.ABC_TYP <> 9 "
+" and M_ITEM.MRP_ODR_TYP <> 8 "
+" and T_JOB_ODR_CD_STOCK.PLANT_CD = M_PLANT.PLANT_CD "
+" and T_JOB_ODR_CD_STOCK.PLANT_CD = ? "
+" and ((T_JOB_ODR_CD_STOCK.WH_CD IN ( "
+"	  select "
+"	   T_INV_TARGET_WH.WH_CD "
+"	  from "
+"	   T_INV_TARGET_WH "
+"	  where "
+"	   T_INV_TARGET_WH.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+"	   and T_INV_TARGET_WH.PLANT_CD = ? )) "
+"	 or (T_JOB_ODR_CD_STOCK.ITEM_CD IN ( "
+"	  select "
+"	   T_INV_TARGET_ITEM.ITEM_CD "
+"	  from "
+"	   T_INV_TARGET_ITEM "
+"	  where "
+"	   T_INV_TARGET_ITEM.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+"	   and T_INV_TARGET_ITEM.PLANT_CD = ?)) "
+" ) ";

	/** 臨時棚卸、ロット在庫 */
	private String _sqlWhereTempAndLot = ""
		+" T_LOT_STOCK.WH_CD = M_WH.WH_CD "
		+" and T_LOT_STOCK.ITEM_CD = M_ITEM.ITEM_CD "
		+" and M_ITEM.ABC_TYP <> 9 "
		+" and M_ITEM.MRP_ODR_TYP <> 8 "
		+" and T_LOT_STOCK.PLANT_CD = M_PLANT.PLANT_CD "
		+" and T_LOT_STOCK.PLANT_CD = ? "
		+" and T_LOT_STOCK.STOCK_ON_HAND_QTY > 0 "
		+" and ((T_LOT_STOCK.WH_CD IN ( "
		+"	  select "
		+"	   T_INV_TARGET_WH.WH_CD "
		+"	  from "
		+"	   T_INV_TARGET_WH "
		+"	  where "
		+"	   T_INV_TARGET_WH.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
		+"	   and T_INV_TARGET_WH.PLANT_CD = ? )) "
		+"	 or (T_LOT_STOCK.ITEM_CD IN ( "
		+"	  select "
		+"	   T_INV_TARGET_ITEM.ITEM_CD "
		+"	  from "
		+"	   T_INV_TARGET_ITEM "
		+"	  where "
		+"	   T_INV_TARGET_ITEM.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
		+"	   and T_INV_TARGET_ITEM.PLANT_CD = ? )) "
		+" ) ";
	
	/** 臨時棚卸、積送在庫 */
	private String _sqlWhereTempAndTransport = ""
+" T_TRANSPORT_STOCK.ISSUE_WH_CD = WH1.WH_CD "
+" and T_TRANSPORT_STOCK.RCV_WH_CD = WH2.WH_CD "
+" and T_TRANSPORT_STOCK.ITEM_CD = M_ITEM.ITEM_CD "
+" and M_ITEM.ABC_TYP <> 9 "
+" and M_ITEM.MRP_ODR_TYP <> 8 "
+" and T_TRANSPORT_STOCK.ISSUE_PLANT_CD = PLANT1.PLANT_CD "
+" and T_TRANSPORT_STOCK.RCV_PLANT_CD = PLANT2.PLANT_CD "
+" and T_TRANSPORT_STOCK.ISSUE_PLANT_CD = ? "
+" and T_TRANSPORT_STOCK.TRANSPORT_CMPLT_TYP = 0 "
+" and ((T_TRANSPORT_STOCK.ISSUE_WH_CD IN ( "
+"	  select "
+"	   T_INV_TARGET_WH.WH_CD "
+"	  from "
+"	   T_INV_TARGET_WH "
+"	  where "
+"	   T_INV_TARGET_WH.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+"	   and T_INV_TARGET_WH.PLANT_CD = ? )) "
+"	 or (T_TRANSPORT_STOCK.ITEM_CD IN ( "
+"	  select "
+"	   T_INV_TARGET_ITEM.ITEM_CD "
+"	  from "
+"	   T_INV_TARGET_ITEM "
+"	  where "
+"	   T_INV_TARGET_ITEM.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+"	   and T_INV_TARGET_ITEM.PLANT_CD = ? )) "
+" ) ";

	////////////////////////////////////////////////////////////////////////////
	// 追加条件SQL定義

	/** 在庫情報、品目在庫 */
	private String _sqlWhereAddNormalAndItem = ""
+" and T_ITEM_STOCK.WH_CD like ? "
+" and T_LOT_STOCK.ITEM_CD like ? "
+" and T_LOT_STOCK.LOT_NO like ? ";

	/** 在庫情報、品目在庫add on */
	private String _sqlWhereAddNormalAndItem_AddOn = ""
+" and T_ITEM_STOCK.WH_CD like ? "
+" and T_ITEM_STOCK.ITEM_CD like ? ";

	/** 在庫情報、製番在庫 */
	private String _sqlWhereAddNormalAndJobOdr = ""
+" and T_JOB_ODR_CD_STOCK.WH_CD like ? "
+" and T_JOB_ODR_CD_STOCK.ITEM_CD like ? ";
	
	/** 在庫情報、ロット在庫 */
	private String _sqlWhereAddNormalAndLot = ""
		+" and T_LOT_STOCK.WH_CD like ? "
		+" and T_LOT_STOCK.ITEM_CD like ? ";

	/** 不良在庫情報、品目在庫 */
	private String _sqlWhereAddDefectAndItem = ""
+" and T_ITEM_STOCK.WH_CD like ? "
+" and T_LOT_STOCK.DEFECT_QTY != 0 "
+" and T_LOT_STOCK.ITEM_CD like ? "
+" and T_LOT_STOCK.LOT_NO like ? ";

	/** 不良在庫情報、品目在庫 add on*/
	private String _sqlWhereAddDefectAndItem_AddOn = ""
+" and T_ITEM_STOCK.WH_CD like ? "
+" and T_ITEM_STOCK.DEFECT_QTY != 0 "
+" and T_ITEM_STOCK.ITEM_CD like ? ";

	/** マイナス在庫情報、品目在庫 */
	private String _sqlWhereAddMinusAndItem = ""
+" and T_ITEM_STOCK.WH_CD like ? "
//+" and (T_ITEM_STOCK.STOCK_ON_HAND_QTY < 0 or T_LOT_STOCK.STOCK_ON_HAND_QTY < 0) "
+" and T_LOT_STOCK.STOCK_ON_HAND_QTY < 0 "
+" and T_LOT_STOCK.ITEM_CD like ? "
+" and T_LOT_STOCK.LOT_NO like ? ";

	/** マイナス在庫情報、品目在庫 add on*/
	private String _sqlWhereAddMinusAndItem_AddOn = ""
+" and T_ITEM_STOCK.WH_CD like ? "
+" and T_ITEM_STOCK.STOCK_ON_HAND_QTY < 0 "
+" and T_ITEM_STOCK.ITEM_CD like ? ";

	/** マイナス在庫情報、製番在庫 */
	private String _sqlWhereAddMinusAndJobOdr = ""
+" and T_JOB_ODR_CD_STOCK.WH_CD like ? "
+" and T_JOB_ODR_CD_STOCK.STOCK_ON_HAND_QTY < 0 "
+" and T_JOB_ODR_CD_STOCK.ITEM_CD like ? ";
	
	/** 積送在庫情報、積送在庫 */
	private String _sqlWhereAddTransportAndTransport = ""
+" and T_TRANSPORT_STOCK.ISSUE_WH_CD like ? "
+" and T_TRANSPORT_STOCK.ITEM_CD like ? "
+" and NVL(T_TRANSPORT_STOCK.LOT_NO,'%') like ? ";


	////////////////////////////////////////////////////////////////////////////
	// 並び順SQL定義

	/** 品目在庫 */
	private String _sqlOderByItem = "order by "
+" T_ITEM_STOCK.WH_CD "
+",T_ITEM_STOCK.ITEM_CD "
+",T_LOT_STOCK.LOT_NO ";
	
	/** 品目在庫 */
	private String _sqlAllOderByItem = "order by "
	+" A.WH_CD "
	+",A.ITEM_CD "
	+",A.LOT_NO ";


	/** 製番在庫 */
	private String _sqlOderByJobOdr = "order by "
+" T_JOB_ODR_CD_STOCK.WH_CD "
+",T_JOB_ODR_CD_STOCK.ITEM_CD "
+",T_JOB_ODR_CD_STOCK.JOB_ODR_CD ";

	/** 積送在庫 */
	private String _sqlOderByTransport = "order by "
+" T_TRANSPORT_STOCK.ISSUE_WH_CD "
+",T_TRANSPORT_STOCK.ITEM_CD "
+",T_TRANSPORT_STOCK.JOB_ODR_CD "
+",T_TRANSPORT_STOCK.RCV_PLANT_CD "
+",T_TRANSPORT_STOCK.RCV_WH_CD "
+",T_TRANSPORT_STOCK.LOT_NO ";
	/** 品目在庫 */
	private String _sqlOderByLot = "order by "
		+" T_LOT_STOCK.WH_CD "
		+",T_LOT_STOCK.ITEM_CD ";
}

