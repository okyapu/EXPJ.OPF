//------------------------------------------------------------------------------
// (#)InvUpdateAccessor.java
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
import com.nec.jp.orteus.xaf.util.FoundationException;
import com.nec.jp.orteus.metamorBase.common01.db.DBErrorMessage;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;

/**
 * 棚卸更新アクセッサクラス
 *
 * @author  M.Isoda
 * @version 1.00
*/
public class InvUpdateAccessor
{
//--------------------------------------------------------------------------
// 構築

	/** コンストラクタ */
	public InvUpdateAccessor(){ clear(); }

	/** コンストラクタ
	 *
	 * @param	strPlantCd		工場コード
	 * @param	strUserCd		ユーザコード
	 * @param	strProgramName	プログラム名（例 AH0070B001）
	 */
	public InvUpdateAccessor(
		String strPlantCd, 
		String strUserCd, 
		String strProgramName)
	{
		clear();
		_strPlantCd = strPlantCd;
		_strUserCd = strUserCd;
		_strProgramName = strProgramName;
		_msg = new InvMessageControl();
		_invCommon = new InvCommon();
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
	private InvMessageControl _msg = new InvMessageControl();

	/** 共通クラス */
	private InvCommon _invCommon = null;

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

	////////////////////////////////////////////////////////////////////////////
	/**
	 * 保管区別品目棚卸読込(for update)
	 *
	 * @param	conn	DBアクセス用のコネクション
	 * @param	info	パラメータ情報
	 * @return	情報一覧:成功 / null:失敗
	 */
	protected List readItemInvTable4Update(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// 処理結果メッセージ管理クラス初期設定
		List list = new ArrayList(0);
		PreparedStatement stmt = null;	// select
		ResultSet rset = null;			// 結果
		try
		{
			stmt = conn.getConn().prepareStatement(_sqlItemInvTable4Update);
			stmt.setString(1, info.getINV_DATE());	// where
			stmt.setString(2, info.getPLANT_CD());	// where
			rset = stmt.executeQuery();
			while(rset.next() == true)
			{
				InvInformation infoTemp = new InvInformation();
				infoTemp.setITEM_CD(rset.getString(1));
				infoTemp.setWH_CD(rset.getString(2));
				infoTemp.setACTUAL_STOCK_QTY(rset.getString(3));
				infoTemp.setFINAL_BOOK_STOCK_QTY(rset.getString(4));
				list.add(infoTemp);
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
			list = null;
		}
		finally
		{
			closeResultSet(rset);
			closePreparedStatement(stmt);
		}
		return list;
	}
	////////////////////////////////////////////////////////////////////////////
	/**
	 * ロット別品目棚卸読込(for update)
	 *
	 * @param	conn	DBアクセス用のコネクション
	 * @param	info	パラメータ情報
	 * @return	情報一覧:成功 / null:失敗
	 */
	protected List readLotInvTable4Update(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// 処理結果メッセージ管理クラス初期設定
		List list = new ArrayList(0);
		PreparedStatement stmt = null;	// select
		ResultSet rset = null;			// 結果
		try
		{
			stmt = conn.getConn().prepareStatement(_sqlLotInvTable4Update);
			stmt.setString(1, info.getINV_DATE());	// where
			stmt.setString(2, info.getPLANT_CD());	// where
			rset = stmt.executeQuery();
			while(rset.next() == true)
			{
				InvInformation infoTemp = new InvInformation();
				infoTemp.setITEM_CD(rset.getString(1));
				infoTemp.setWH_CD(rset.getString(2));
				infoTemp.setACTUAL_STOCK_QTY(rset.getString(3));
				infoTemp.setFINAL_BOOK_STOCK_QTY(rset.getString(4));
				infoTemp.setLOT_NO(rset.getString(5));
				list.add(infoTemp);
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
			list = null;
		}
		finally
		{
			closeResultSet(rset);
			closePreparedStatement(stmt);
		}
		return list;
	}
	////////////////////////////////////////////////////////////////////////////
	/**
	 * 保管区別品目在庫読込(for update)
	 *
	 * @param	conn	DBアクセス用のコネクション
	 * @param	info	パラメータ情報
	 * @return	情報一覧:成功 / null:失敗
	 */
	protected List readItemStockTable4Update(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// 処理結果メッセージ管理クラス初期設定
		List list = new ArrayList(0);
		PreparedStatement stmt = null;	// select
		ResultSet rset = null;			// 結果
		try
		{
			stmt = conn.getConn().prepareStatement(_sqlItemStockTable4Update);

System.out.println(""
	+ "\n w) ITEM_CD：" + info.getITEM_CD()
	+ "\n w) WH_CD：" + info.getWH_CD()
	+ "\n w) PLANT_CD：" + info.getPLANT_CD()
);

			stmt.setString(1, info.getITEM_CD());	// where
			stmt.setString(2, info.getWH_CD());		// where
			stmt.setString(3, info.getPLANT_CD());	// where
			rset = stmt.executeQuery();
			while(rset.next() == true)
			{
				InvInformation infoTemp = new InvInformation();
				infoTemp.setSTOCK_ON_HAND_QTY(rset.getString(1));
				list.add(infoTemp);
			}
		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// エラー情報設定
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// 詳細情報
				+ " (SBM1142)品目番号:[ " + info.getITEM_CD() + " ]"
				+ " 保管区コード:[ " + info.getWH_CD() + " ]"
				+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
			);
			list = null;
		}
		finally
		{
			closeResultSet(rset);
			closePreparedStatement(stmt);
		}
		return list;
	}

	
	/**
	 * ロット別品目在庫読込(for update)
	 *
	 * @param	conn	DBアクセス用のコネクション
	 * @param	info	パラメータ情報
	 * @return	情報一覧:成功 / null:失敗
	 */
	protected List readLotStockTable4Update(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// 処理結果メッセージ管理クラス初期設定
		List list = new ArrayList(0);
		PreparedStatement stmt = null;	// select
		ResultSet rset = null;			// 結果
		try
		{
			stmt = conn.getConn().prepareStatement(_sqlLotStockTable4Update);

			System.out.println(""
				+ "\n w) ITEM_CD：" + info.getITEM_CD()
				+ "\n w) WH_CD：" + info.getWH_CD()
				+ "\n w) PLANT_CD：" + info.getPLANT_CD()
			);

			stmt.setString(1, info.getITEM_CD());	// where
			stmt.setString(2, info.getWH_CD());		// where
			stmt.setString(3, info.getPLANT_CD());	// where
			stmt.setString(4, info.getLOT_NO());  // where
			rset = stmt.executeQuery();
			while(rset.next() == true)
			{
				InvInformation infoTemp = new InvInformation();
				infoTemp.setSTOCK_ON_HAND_QTY(rset.getString(1));
				list.add(infoTemp);
			}
		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// エラー情報設定
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// 詳細情報
				+ " (SBM1143)品目番号:[ " + info.getITEM_CD() + " ]"
				+ " 保管区コード:[ " + info.getWH_CD() + " ]"
				+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
				+ " 在庫ロット番号:[ " + info.getLOT_NO() + " ]"
			);
			list = null;
		}
		finally
		{
			closeResultSet(rset);
			closePreparedStatement(stmt);
		}
		return list;
	}
	////////////////////////////////////////////////////////////////////////////
	/**
	 * 保管区別品目在庫更新
	 *
	 * @param	conn	DBアクセス用のコネクション
	 * @param	info	パラメータ情報
	 * @return	処理レコード数:成功 / -1:失敗
	 */
	protected int updateItemStockTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// 処理結果メッセージ管理クラス初期設定
		int	intResultCount = -1;
		PreparedStatement stmt = null;	// update
		try {
			String strDateTime = _invCommon.readSystemDateTime(conn);
			stmt = conn.getConn().prepareStatement(_sqlUpdateItemStockTable);

			System.out.println(""
	+ "\n (SBM1148)s) 新在庫数：" + info.getSTOCK_ON_HAND_QTY()
	+ "\n s) strDateTime：" + strDateTime
	+ "\n s) _strUserCd：" + _strUserCd
	+ "\n s) _strProgramName：" + _strProgramName
	+ "\n w) ITEM_CD：" + info.getITEM_CD()
	+ "\n w) PLANT_CD：" + info.getPLANT_CD()
	+ "\n w) WH_CD：" + info.getWH_CD()
);

			stmt.setString(1, info.getSTOCK_ON_HAND_QTY());	// set
			stmt.setString(2, strDateTime);					// set
			stmt.setString(3, _strUserCd);					// set
			stmt.setString(4, _strProgramName);				// set
			stmt.setString(5, info.getITEM_CD());			// where
			stmt.setString(6, info.getWH_CD());				// where
			stmt.setString(7, info.getPLANT_CD());			// where

			intResultCount = stmt.executeUpdate();
		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// エラー情報設定
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// 詳細情報
				+ " (SBM1142)品目番号:[ " + info.getITEM_CD() + " ]"
				+ " 保管区コード:[ " + info.getWH_CD() + " ]"
				+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
			);
			intResultCount = -1;
		}
		finally
		{
			closePreparedStatement(stmt);
		}
		return intResultCount;
	}
	
	/**
	 * ロット管理フラグを取得
	 *
	 * @param	conn	DBアクセス用のコネクション
	 * @param	info	パラメータ情報
	 */
	protected void readLotCtrlFlg(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// 処理結果メッセージ管理クラス初期設定
		PreparedStatement stmt = null;	// update
		ResultSet rset = null;			// 結果
		try {
			stmt = conn.getConn().prepareStatement(_sqlGetLotCtrlFlg);
			
			System.out.println(""
				+ "\n w) ITEM_CD：" + info.getITEM_CD()
			);
			
			stmt.setString(1, info.getITEM_CD());			// where
			rset = stmt.executeQuery();
			while(rset.next() == true)
			{
				info.setLOT_CTRL_FLG(rset.getString(1));
			}
		}
		catch(SQLException se)
		{
			se.printStackTrace();
			
			// エラー情報設定
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// 詳細情報
				+ " (SBM0688)品目番号:[ " + info.getITEM_CD() + " ]"
			);
		}
		finally
		{
			closeResultSet(rset);
			closePreparedStatement(stmt);
		}
	}
	
	/**
	 * ロット別品目在庫更新
	 *
	 * @param	conn	DBアクセス用のコネクション
	 * @param	info	パラメータ情報
	 * @return	処理レコード数:成功 / -1:失敗
	 */
	protected int updateLotStockTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// 処理結果メッセージ管理クラス初期設定
		int	intResultCount = -1;
		PreparedStatement stmt = null;	// update
		try {
			String strDateTime = _invCommon.readSystemDateTime(conn);
			stmt = conn.getConn().prepareStatement(_sqlUpdateLotStockTable);

			System.out.println(""
				+ "\n (SBM1148)s) 新在庫数：" + info.getSTOCK_ON_HAND_QTY()
				+ "\n s) strDateTime：" + strDateTime
				+ "\n s) _strUserCd：" + _strUserCd
				+ "\n s) _strProgramName：" + _strProgramName
				+ "\n w) ITEM_CD：" + info.getITEM_CD()
				+ "\n w) PLANT_CD：" + info.getPLANT_CD()
				+ "\n w) WH_CD：" + info.getWH_CD()
			);

			stmt.setString(1, info.getSTOCK_ON_HAND_QTY());	// set
			stmt.setString(2, strDateTime);					// set
			stmt.setString(3, _strUserCd);					// set
			stmt.setString(4, _strProgramName);				// set
			stmt.setString(5, info.getITEM_CD());			// where
			stmt.setString(6, info.getWH_CD());				// where
			stmt.setString(7, info.getPLANT_CD());			// where
			stmt.setString(8, info.getLOT_NO());			// where
			intResultCount = stmt.executeUpdate();
		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// エラー情報設定
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// 詳細情報
				+ " (SBM1142)品目番号:[ " + info.getITEM_CD() + " ]"
				+ " 保管区コード:[ " + info.getWH_CD() + " ]"
				+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
			);
			intResultCount = -1;
		}
		finally
		{
			closePreparedStatement(stmt);
		}
		return intResultCount;
	}
	
	
	////////////////////////////////////////////////////////////////////////////
	/**
	 * 保管区別品目在庫登録
	 *
	 * @param	conn	DBアクセス用のコネクション
	 * @param	info	パラメータ情報
	 * @return	処理レコード数:成功 / -1:失敗
	 */
	protected int insertItemStockTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// 処理結果メッセージ管理クラス初期設定
		int	intResultCount = -1;
		PreparedStatement stmt = null;	// insert
		try {
			String strDateTime = _invCommon.readSystemDateTime(conn);
			stmt = conn.getConn().prepareStatement(_sqlInsertItemStockTable);

System.out.println(""
	+ "\n s) ITEM_CD：" + info.getITEM_CD()
	+ "\n s) WH_CD：" + info.getWH_CD()
	+ "\n s) PLANT_CD：" + info.getPLANT_CD()
	+ "\n s) STOCK_ON_HAND_QTY：" + info.getSTOCK_ON_HAND_QTY()
	+ "\n s) strDateTime：" + strDateTime
	+ "\n s) _strUserCd：" + _strUserCd
	+ "\n s) _strProgramName：" + _strProgramName
	+ "\n s) strDateTime：" + strDateTime
	+ "\n s) _strUserCd：" + _strUserCd
	+ "\n s) _strProgramName：" + _strProgramName
);
			stmt.setString(1, info.getITEM_CD());			// set
			stmt.setString(2, info.getWH_CD());				// set
			stmt.setString(3, info.getPLANT_CD());			// set
			stmt.setString(4, info.getSTOCK_ON_HAND_QTY());	// set
			stmt.setString(5, strDateTime);					// set
			stmt.setString(6, _strUserCd);					// set
			stmt.setString(7, _strProgramName);				// set
			stmt.setString(8, strDateTime);					// set
			stmt.setString(9, _strUserCd);					// set
			stmt.setString(10, _strProgramName);			// set

			intResultCount = stmt.executeUpdate();
		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// エラー情報設定
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// 詳細情報
				+ " (SBM1142)品目番号:[ " + info.getITEM_CD() + " ]"
				+ " 保管区コード:[ " + info.getWH_CD() + " ]"
				+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
			);
			intResultCount = -1;
		}
		finally
		{
			closePreparedStatement(stmt);
		}
		return intResultCount;
	}

	
	/**
	 * ロット別品目在庫登録
	 *
	 * @param	conn	DBアクセス用のコネクション
	 * @param	info	パラメータ情報
	 * @return	処理レコード数:成功 / -1:失敗
	 */
	protected int insertLotStockTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// 処理結果メッセージ管理クラス初期設定
		int	intResultCount = -1;
		PreparedStatement stmt = null;	// insert
		try {
			String strDateTime = _invCommon.readSystemDateTime(conn);
			stmt = conn.getConn().prepareStatement(_sqlInsertLotStockTable);

			System.out.println(""
				+ "\n s) ITEM_CD：" + info.getITEM_CD()
				+ "\n s) WH_CD：" + info.getWH_CD()
				+ "\n s) PLANT_CD：" + info.getPLANT_CD()
				+ "\n s) STOCK_ON_HAND_QTY：" + info.getSTOCK_ON_HAND_QTY()
				+ "\n s) strDateTime：" + strDateTime
				+ "\n s) _strUserCd：" + _strUserCd
				+ "\n s) _strProgramName：" + _strProgramName
				+ "\n s) strDateTime：" + strDateTime
				+ "\n s) _strUserCd：" + _strUserCd
				+ "\n s) _strProgramName：" + _strProgramName
			);
			stmt.setString(1, info.getITEM_CD());			// set
			stmt.setString(2, info.getWH_CD());				// set
			stmt.setString(3, info.getPLANT_CD());			// set
			stmt.setString(4, info.getSTOCK_ON_HAND_QTY());	// set
			stmt.setString(5, strDateTime);					// set
			stmt.setString(6, _strUserCd);					// set
			stmt.setString(7, _strProgramName);				// set
			stmt.setString(8, strDateTime);					// set
			stmt.setString(9, _strUserCd);					// set
			stmt.setString(10, _strProgramName);			// set
			stmt.setString(11, info.getLOT_NO());			// set
			intResultCount = stmt.executeUpdate();
		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// エラー情報設定
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// 詳細情報
				+ " (SBM1142)品目番号:[ " + info.getITEM_CD() + " ]"
				+ " 保管区コード:[ " + info.getWH_CD() + " ]"
				+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
			);
			intResultCount = -1;
		}
		finally
		{
			closePreparedStatement(stmt);
		}
		return intResultCount;
	}
	////////////////////////////////////////////////////////////////////////////
	/**
	 * 保管区別品目棚卸更新
	 *
	 * @param	conn	DBアクセス用のコネクション
	 * @param	info	棚卸日
	 * @return	処理レコード数:成功 / -1:失敗
	 */
	protected int updateItemInvTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// 処理結果メッセージ管理クラス初期設定
		int	intResultCount = -1;
		PreparedStatement stmt = null;	// update
		try {
			String strDateTime = _invCommon.readSystemDateTime(conn);
			stmt = conn.getConn().prepareStatement(_sqlUpdateItemInvTable);

System.out.println(""
	+ "\n s) INV_UPD_FLG：" + info.getINV_UPD_FLG()
	+ "\n s) strDateTime：" + strDateTime
	+ "\n s) _strUserCd：" + _strUserCd
	+ "\n s) _strProgramName：" + _strProgramName
	+ "\n w) INV_DATE：" + info.getINV_DATE()
	+ "\n w) ITEM_CD：" + info.getITEM_CD()
	+ "\n w) PLANT_CD：" + info.getPLANT_CD()
	+ "\n w) WH_CD：" + info.getWH_CD()
);

			stmt.setString(1, info.getINV_UPD_FLG());		// set
			stmt.setString(2, strDateTime);					// set
			stmt.setString(3, _strUserCd);					// set
			stmt.setString(4, _strProgramName);				// set
			stmt.setString(5, info.getINV_DATE());			// where
			stmt.setString(6, info.getPLANT_CD());			// where
			stmt.setString(7, info.getITEM_CD());			// where
			stmt.setString(8, info.getWH_CD());				// where

			intResultCount = stmt.executeUpdate();
		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// エラー情報設定
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// 詳細情報
				+ " (SBM1114)棚卸日:[ " + info.getINV_DATE() + " ]"
				+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
				+ " 品目番号:[ " + info.getITEM_CD() + " ]"
				+ " 保管区コード:[ " + info.getWH_CD() + " ]"
			);
			intResultCount = -1;
		}
		finally
		{
			closePreparedStatement(stmt);
		}
		return intResultCount;
	}
	
	/**
	 * ロット別品目棚卸更新
	 *
	 * @param	conn	DBアクセス用のコネクション
	 * @param	info	棚卸日
	 * @return	処理レコード数:成功 / -1:失敗
	 */
	protected int updateLotInvTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// 処理結果メッセージ管理クラス初期設定
		int	intResultCount = -1;
		PreparedStatement stmt = null;	// update
		try {
			String strDateTime = _invCommon.readSystemDateTime(conn);
			stmt = conn.getConn().prepareStatement(_sqlUpdateLotInvTable);

			System.out.println(""
				+ "\n s) INV_UPD_FLG：" + info.getINV_UPD_FLG()
				+ "\n s) strDateTime：" + strDateTime
				+ "\n s) _strUserCd：" + _strUserCd
				+ "\n s) _strProgramName：" + _strProgramName
				+ "\n w) INV_DATE：" + info.getINV_DATE()
				+ "\n w) ITEM_CD：" + info.getITEM_CD()
				+ "\n w) PLANT_CD：" + info.getPLANT_CD()
				+ "\n w) WH_CD：" + info.getWH_CD()
			);

			stmt.setString(1, info.getINV_UPD_FLG());		// set
			stmt.setString(2, strDateTime);					// set
			stmt.setString(3, _strUserCd);					// set
			stmt.setString(4, _strProgramName);				// set
			stmt.setString(5, info.getINV_DATE());			// where
			stmt.setString(6, info.getPLANT_CD());			// where
			stmt.setString(7, info.getITEM_CD());			// where
			stmt.setString(8, info.getWH_CD());				// where
			stmt.setString(9, info.getLOT_NO());				// where

			intResultCount = stmt.executeUpdate();
		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// エラー情報設定
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// 詳細情報
				+ " (SBM1114)棚卸日:[ " + info.getINV_DATE() + " ]"
				+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
				+ " 品目番号:[ " + info.getITEM_CD() + " ]"
				+ " 保管区コード:[ " + info.getWH_CD() + " ]"
			);
			intResultCount = -1;
		}
		finally
		{
			closePreparedStatement(stmt);
		}
		return intResultCount;
	}

	////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////
	/**
	 * 保管区別製番棚卸読込(for update)
	 *
	 * @param	conn	DBアクセス用のコネクション
	 * @param	info	パラメータ情報
	 * @return	情報一覧:成功 / null:失敗
	 */
	protected List readJobOdrCdInvTable4Update(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// 処理結果メッセージ管理クラス初期設定
		List list = new ArrayList(0);
		PreparedStatement stmt = null;
		ResultSet rset = null;
		try {
			stmt = (conn.getConn()).prepareStatement(_sqlReadJobOdrCdInvTable4Update);
			stmt.setString(1, info.getINV_DATE());	// where
			stmt.setString(2, info.getPLANT_CD());	// where
			rset = stmt.executeQuery();
			while(rset.next() == true)
			{
				InvInformation infoTemp = new InvInformation();
				infoTemp.setJOB_ODR_CD(rset.getString(1));				// select
				infoTemp.setITEM_CD(rset.getString(2));					// select
				infoTemp.setWH_CD(rset.getString(3));					// select
				infoTemp.setPLANT_CD(rset.getString(4));				// select
				infoTemp.setACTUAL_STOCK_QTY(rset.getString(5));		// select
				infoTemp.setFINAL_BOOK_STOCK_QTY(rset.getString(6));	// select
				list.add(infoTemp);
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
			list = null;
		}
		finally
		{
			closeResultSet(rset);
			closePreparedStatement(stmt);
		}
		return list;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * 保管区別製番在庫読込(for update)
	 *
	 * @param	conn	DBアクセス用のコネクション
	 * @param	info	パラメータ情報
	 * @return	情報一覧:成功 / null:失敗
	 */
	protected List readJobOdrCdStockTable4Update(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// 処理結果メッセージ管理クラス初期設定
		List list = new ArrayList(0);
		PreparedStatement stmt = null;
		ResultSet rset = null;
		try {
			stmt = (conn.getConn()).prepareStatement(_sqlReadJobOdrCdStockTable4Update);

System.out.println(""
	+ "\n w) JOB_ODR_CD：" + info.getJOB_ODR_CD()
	+ "\n w) ITEM_CD：" + info.getITEM_CD()
	+ "\n w) WH_CD：" + info.getWH_CD()
	+ "\n w) PLANT_CD：" + info.getPLANT_CD()
);
			stmt.setString(1, info.getJOB_ODR_CD());	// where
			stmt.setString(2, info.getITEM_CD());		// where
			stmt.setString(3, info.getWH_CD());			// where
			stmt.setString(4, info.getPLANT_CD());		// where
			rset = stmt.executeQuery();
			while(rset.next() == true)
			{
				InvInformation infoTemp = new InvInformation();
				infoTemp.setSTOCK_ON_HAND_QTY(rset.getString(1));	// select
				list.add(infoTemp);
			}
		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// エラー情報設定
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// 詳細情報
				+ " (SBM1145)製番:[ " + info.getJOB_ODR_CD() + " ]"
				+ " 品目番号:[ " + info.getITEM_CD() + " ]"
				+ " 保管区コード:[ " + info.getWH_CD() + " ]"
				+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
			);
			list = null;
		}
		finally
		{
			closeResultSet(rset);
			closePreparedStatement(stmt);
		}
		return list;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * 保管区別製番在庫更新
	 *
	 * @param	conn	DBアクセス用のコネクション
	 * @param	info	パラメータ情報
	 * @return	処理レコード数:成功 / -1:失敗
	 */
	protected int updateJobOdrCdStockTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// 処理結果メッセージ管理クラス初期設定
		int	intResultCount = -1;
		PreparedStatement stmt = null;
		try
		{
			String strDateTime = _invCommon.readSystemDateTime(conn);
			stmt = conn.getConn().prepareStatement(_sqlUpdateJobOdrCdStockTable);

			System.out.println(""
	+ "\n (SBM1144)s) 新在庫数：" + info.getSTOCK_ON_HAND_QTY()
	+ "\n s) strDateTime：" + strDateTime
	+ "\n s) _strUserCd：" + _strUserCd
	+ "\n s) _strProgramName：" + _strProgramName
	+ "\n w) JOB_ODR_CD：" + info.getJOB_ODR_CD()
	+ "\n w) ITEM_CD：" + info.getITEM_CD()
	+ "\n w) PLANT_CD：" + info.getPLANT_CD()
	+ "\n w) WH_CD：" + info.getWH_CD()
);

			stmt.setString(1, info.getSTOCK_ON_HAND_QTY());	// set
			stmt.setString(2, strDateTime);					// set
			stmt.setString(3, _strUserCd);					// set
			stmt.setString(4, _strProgramName);				// set
			stmt.setString(5, info.getJOB_ODR_CD());		// where
			stmt.setString(6, info.getITEM_CD());			// where
			stmt.setString(7, info.getWH_CD());				// where
			stmt.setString(8, info.getPLANT_CD());			// where

			intResultCount = stmt.executeUpdate();
		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// エラー情報設定
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// 詳細情報
				+ " (SBM1145)製番:[ " + info.getJOB_ODR_CD() + " ]"
				+ " 品目番号:[ " + info.getITEM_CD() + " ]"
				+ " 保管区コード:[ " + info.getWH_CD() + " ]"
				+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
			);
			intResultCount = -1;
		}
		finally
		{
			closePreparedStatement(stmt);
		}
		return intResultCount;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * 保管区別製番在庫登録
	 *
	 * @param	conn	DBアクセス用のコネクション
	 * @param	info	パラメータ情報
	 * @return	処理レコード数:成功 / -1:失敗
	 */
	protected int insertJobOdrCdStockTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// 処理結果メッセージ管理クラス初期設定
		int	intResultCount = -1;
		PreparedStatement stmt = null;
		try
		{
			String strDateTime = _invCommon.readSystemDateTime(conn);
			stmt = conn.getConn().prepareStatement(_sqlInsertJobOdrCdStockTable);

System.out.println(""
	+ "\n s) JOB_ODR_CD：" + info.getJOB_ODR_CD()
	+ "\n s) ITEM_CD：" + info.getITEM_CD()
	+ "\n s) WH_CD：" + info.getWH_CD()
	+ "\n s) PLANT_CD：" + info.getPLANT_CD()
	+ "\n s) STOCK_ON_HAND_QTY：" + info.getSTOCK_ON_HAND_QTY()
	+ "\n s) strDateTime：" + strDateTime
	+ "\n s) _strUserCd：" + _strUserCd
	+ "\n s) _strProgramName：" + _strProgramName
	+ "\n s) strDateTime：" + strDateTime
	+ "\n s) _strUserCd：" + _strUserCd
	+ "\n s) _strProgramName：" + _strProgramName
);

			stmt.setString(1, info.getJOB_ODR_CD());		// set
			stmt.setString(2, info.getITEM_CD());			// set
			stmt.setString(3, info.getWH_CD());				// set
			stmt.setString(4, info.getPLANT_CD());			// set
			stmt.setString(5, info.getSTOCK_ON_HAND_QTY());	// set
			stmt.setString(6, strDateTime);					// set
			stmt.setString(7, _strUserCd);					// set
			stmt.setString(8, _strProgramName);				// set
			stmt.setString(9, strDateTime);					// set
			stmt.setString(10, _strUserCd);					// set
			stmt.setString(11, _strProgramName);			// set

			intResultCount = stmt.executeUpdate();
		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// エラー情報設定
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// 詳細情報
				+ " (SBM1145)製番:[ " + info.getJOB_ODR_CD() + " ]"
				+ " 品目番号:[ " + info.getITEM_CD() + " ]"
				+ " 保管区コード:[ " + info.getWH_CD() + " ]"
				+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
			);
			intResultCount = -1;
		}
		finally
		{
			closePreparedStatement(stmt);
		}
		return intResultCount;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * 保管区別製番棚卸更新
	 *
	 * @param	conn	DBアクセス用のコネクション
	 * @param	info	棚卸日
	 * @return	処理レコード数:成功 / -1:失敗
	 */
	protected int updateJobOdrCdInvTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// 処理結果メッセージ管理クラス初期設定
		int	intResultCount = -1;
		PreparedStatement stmt = null;
		try
		{
			String strDateTime = _invCommon.readSystemDateTime(conn);
			stmt = conn.getConn().prepareStatement(_sqlUpdateJobOdrCdInvTable);

System.out.println(""
	+ "\n s) INV_UPD_FLG：" + info.getINV_UPD_FLG()
	+ "\n s) strDateTime：" + strDateTime
	+ "\n s) _strUserCd：" + _strUserCd
	+ "\n s) _strProgramName：" + _strProgramName
	+ "\n w) INV_DATE：" + info.getINV_DATE()
	+ "\n w) PLANT_CD：" + info.getPLANT_CD()
	+ "\n w) JOB_ODR_CD：" + info.getJOB_ODR_CD()
	+ "\n w) ITEM_CD：" + info.getITEM_CD()
	+ "\n w) WH_CD：" + info.getWH_CD()
);
			stmt.setString(1, info.getINV_UPD_FLG());		// set
			stmt.setString(2, strDateTime);					// set
			stmt.setString(3, _strUserCd);					// set
			stmt.setString(4, _strProgramName);				// set
			stmt.setString(5, info.getINV_DATE());			// where
			stmt.setString(6, info.getPLANT_CD());			// where
			stmt.setString(7, info.getJOB_ODR_CD());		// where
			stmt.setString(8, info.getITEM_CD());			// where
			stmt.setString(9, info.getWH_CD());				// where
			intResultCount = stmt.executeUpdate();

		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// エラー情報設定
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// 詳細情報
				+ " (SBM1115)棚卸日:[ " + info.getINV_DATE() + " ]"
				+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
				+ " 製番:[ " + info.getJOB_ODR_CD() + " ]"
				+ " 品目番号:[ " + info.getITEM_CD() + " ]"
				+ " 保管区コード:[ " + info.getWH_CD() + " ]"
			);
			intResultCount = -1;
		}
		finally
		{
			closePreparedStatement(stmt);
		}
		return intResultCount;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * 棚卸制御読込(for update)
	 *
	 * @param	conn	DBアクセス用のコネクション
	 * @param	info	棚卸日
	 * @return	情報一覧:成功 / null:失敗
	 */
	protected List readInvCtrlTable4Update(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// 処理結果メッセージ管理クラス初期設定
		List list = new ArrayList(0);
		PreparedStatement stmt = null;
		ResultSet rset = null;
		try {
			stmt = (conn.getConn()).prepareStatement(_sqlReadInvCtrlTable4Update);
			stmt.setString(1, info.getINV_DATE());	// where
			stmt.setString(2, info.getPLANT_CD());	// where
			rset = stmt.executeQuery();
			while(rset.next() == true)
			{
				InvInformation infoTemp = new InvInformation();
				infoTemp.setREGULAR_INV_FLG(rset.getString(1));	// select
				infoTemp.setCYCLE_INV_FLG(rset.getString(2));	// select
				infoTemp.setTEMP_INV_FLG(rset.getString(3));	// select
				infoTemp.setINV_STS_TYP(rset.getString(4));		// select
				list.add(infoTemp);
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
			list = null;
		}
		finally
		{
			closeResultSet(rset);
			closePreparedStatement(stmt);
		}
		return list;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * 棚卸制御更新
	 *
	 * @param	conn	DBアクセス用のコネクション
	 * @param	info	棚卸日
	 * @return	処理レコード数:成功 / -1:失敗
	 */
	protected int updateInvCtrlTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// 処理結果メッセージ管理クラス初期設定
		int	intResultCount = -1;
		PreparedStatement stmt = null;
		try
		{
			String strDateTime = _invCommon.readSystemDateTime(conn);
			stmt = conn.getConn().prepareStatement(_sqlUpdateInvCtrlTable4InvUpdate);

			stmt.setString(1, info.getINV_STS_TYP());		// set
			stmt.setString(2, strDateTime);					// set
			stmt.setString(3, strDateTime);					// set
			stmt.setString(4, _strUserCd);					// set
			stmt.setString(5, _strProgramName);				// set
			stmt.setString(6, info.getINV_DATE());			// where
			stmt.setString(7, info.getPLANT_CD());			// where
			intResultCount = stmt.executeUpdate();
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
			intResultCount = -1;
		}
		finally
		{
			closePreparedStatement(stmt);
		}
		return intResultCount;
	}

	////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////
	/**
	 * 保管区別入出庫読込
	 *
	 * @param	conn	DBアクセス用のコネクション
	 * @param	info	パラメータ情報
	 * @return	情報一覧:成功 / null:失敗
	 */
	protected List readRcvIssueTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// 処理結果メッセージ管理クラス初期設定
		List list = new ArrayList(0);
		PreparedStatement stmt = null;
		ResultSet rset = null;
		try {
			stmt = (conn.getConn()).prepareStatement(_sqlReadRcvIssueTable);
System.out.println("--_sqlReadRcvIssueTable--");
System.out.println(""
	+ "\n w) INV_DATE：" + info.getINV_DATE()
	+ "\n w) PLANT_CD：" + info.getPLANT_CD()
	+ "\n w) JOB_ODR_CD：" + info.getJOB_ODR_CD()
	+ "\n w) ITEM_CD：" + info.getITEM_CD()
	+ "\n w) WH_CD：" + info.getWH_CD()
);

			stmt.setString(1, info.getINV_DATE());		// where
			stmt.setString(2, info.getPLANT_CD());		// where
			stmt.setString(3, info.getJOB_ODR_CD());	// where
			stmt.setString(4, info.getITEM_CD());		// where
			stmt.setString(5, info.getWH_CD());			// where
			rset = stmt.executeQuery();
			while(rset.next() == true)
			{
				InvInformation infoTemp = new InvInformation();
				infoTemp.setw_SUM_RCV_ISSUE_QTY(rset.getString(1));	// select
				list.add(infoTemp);
			}
		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// エラー情報設定
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// 詳細情報
				+ " (SBM1115)棚卸日:[ " + info.getINV_DATE() + " ]"
				+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
				+ " 製番:[ " + info.getJOB_ODR_CD() + " ]"
				+ " 品目番号:[ " + info.getITEM_CD() + " ]"
				+ " 保管区コード:[ " + info.getWH_CD() + " ]"
			);
			list = null;
		}
		finally
		{
			closeResultSet(rset);
			closePreparedStatement(stmt);
		}
		return list;
	}

	
	/**
	 * ロット別入出庫読込
	 *
	 * @param	conn	DBアクセス用のコネクション
	 * @param	info	パラメータ情報
	 * @return	情報一覧:成功 / null:失敗
	 */
	protected List readLotRcvIssueTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// 処理結果メッセージ管理クラス初期設定
		List list = new ArrayList(0);
		PreparedStatement stmt = null;
		ResultSet rset = null;
		try {
			stmt = (conn.getConn()).prepareStatement(_sqlReadLotRcvIssueTable);
			System.out.println("--_sqlReadLotRcvIssueTable--");
			System.out.println(""
				+ "\n w) INV_DATE：" + info.getINV_DATE()
				+ "\n w) PLANT_CD：" + info.getPLANT_CD()
				+ "\n w) JOB_ODR_CD：" + info.getJOB_ODR_CD()
				+ "\n w) ITEM_CD：" + info.getITEM_CD()
				+ "\n w) WH_CD：" + info.getWH_CD()
			);

			stmt.setString(1, info.getINV_DATE());		// where
			stmt.setString(2, info.getPLANT_CD());		// where
			stmt.setString(3, info.getLOT_NO());		// where
			stmt.setString(4, info.getJOB_ODR_CD());	// where
			stmt.setString(5, info.getITEM_CD());		// where
			stmt.setString(6, info.getWH_CD());			// where
			rset = stmt.executeQuery();
			while(rset.next() == true)
			{
				InvInformation infoTemp = new InvInformation();
				infoTemp.setw_SUM_RCV_ISSUE_QTY(rset.getString(1));	// select
				list.add(infoTemp);
			}
		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// エラー情報設定
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// 詳細情報
				+ " (SBM1115)棚卸日:[ " + info.getINV_DATE() + " ]"
				+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
				+ " 製番:[ " + info.getJOB_ODR_CD() + " ]"
				+ " 品目番号:[ " + info.getITEM_CD() + " ]"
				+ " 保管区コード:[ " + info.getWH_CD() + " ]"
			);
			list = null;
		}
		finally
		{
			closeResultSet(rset);
			closePreparedStatement(stmt);
		}
		return list;
	}
	////////////////////////////////////////////////////////////////////////////
	/**
	 * 保管区別入出庫更新
	 *
	 * @param	conn	DBアクセス用のコネクション
	 * @param	info	パラメータ情報
	 * @return	処理レコード数:成功 / -1:失敗
	 */
	protected int insertRcvIssueTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// 処理結果メッセージ管理クラス初期設定
		int	intResultCount = -1;
		PreparedStatement stmt = null;
		try
		{
			String strDateTime = _invCommon.readSystemDateTime(conn);
			stmt = conn.getConn().prepareStatement(_sqlInsertRcvIssueTable);

System.out.println(""
	+ "\n s) RCV_ISSUE_CTRL_CD：" + info.getRCV_ISSUE_CTRL_CD()
	+ "\n s) RCV_ISSUE_TYP：" + info.getRCV_ISSUE_TYP()
	+ "\n s) ITEM_CD：" + info.getITEM_CD()
	+ "\n s) PLANT_CD：" + info.getPLANT_CD()
	+ "\n s) WH_CD：" + info.getWH_CD()
	+ "\n s) JOB_ODR_CD：" + info.getJOB_ODR_CD()
	+ "\n s) RCV_ISSUE_QTY：" + info.getRCV_ISSUE_QTY()
	+ "\n s) RCV_ISSUE_DATE：" + info.getRCV_ISSUE_DATE()
	+ "\n s) RCV_ISSUE_GNR_TYP：" + info.getRCV_ISSUE_GNR_TYP()
	+ "\n s) STOCK_UPD_TYP：" + info.getSTOCK_UPD_TYP()
	+ "\n s) RCV_ISSUE_CMPLT_FLG：" + info.getRCV_ISSUE_CMPLT_FLG()
	+ "\n s) COMPANY_CD：" + info.getCOMPANY_CD()
	+ "\n s) strDateTime：" + strDateTime
	+ "\n s) _strUserCd：" + _strUserCd
	+ "\n s) _strProgramName：" + _strProgramName
	+ "\n s) strDateTime：" + strDateTime
	+ "\n s) _strUserCd：" + _strUserCd
	+ "\n s) _strProgramName：" + _strProgramName
);
			stmt.setString(1, info.getRCV_ISSUE_CTRL_CD());		// set
			stmt.setString(2, info.getRCV_ISSUE_TYP());			// set
			stmt.setString(3, info.getITEM_CD());				// set
			stmt.setString(4, info.getPLANT_CD());				// set
			stmt.setString(5, info.getWH_CD());					// set
			stmt.setString(6, info.getJOB_ODR_CD());			// set
			stmt.setString(7, info.getRCV_ISSUE_QTY());			// set
			stmt.setString(8, info.getRCV_ISSUE_DATE());		// set
			stmt.setString(9, info.getRCV_ISSUE_GNR_TYP());		// set
			stmt.setString(10, info.getSTOCK_UPD_TYP());		// set
			stmt.setString(11, info.getRCV_ISSUE_CMPLT_FLG());	// set
			stmt.setString(12, info.getCOMPANY_CD());			// set
			stmt.setString(13, strDateTime);					// set
			stmt.setString(14, _strUserCd);						// set
			stmt.setString(15, _strProgramName);				// set
			stmt.setString(16, strDateTime);					// set
			stmt.setString(17, _strUserCd);						// set
			stmt.setString(18, _strProgramName);				// set
			stmt.setString(19, info.getSAVE_STOCK_HAND_QTY());	// set
			stmt.setString(20, Calculate.add(info.getSAVE_STOCK_HAND_QTY(),
					info.getRCV_ISSUE_QTY()));	// set

			intResultCount = stmt.executeUpdate();
		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// エラー情報設定
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// 詳細情報
				+ " (SBM1145)製番:[ " + info.getJOB_ODR_CD() + " ]"
				+ " 品目番号:[ " + info.getITEM_CD() + " ]"
				+ " 保管区コード:[ " + info.getWH_CD() + " ]"
				+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
			);
			intResultCount = -1;
		}
		finally
		{
			closePreparedStatement(stmt);
		}
		return intResultCount;
	}
	
	/**
	 * 保管区別入出庫更新
	 *
	 * @param	conn	DBアクセス用のコネクション
	 * @param	info	パラメータ情報
	 * @return	処理レコード数:成功 / -1:失敗
	 */
	protected int insertLotRcvIssueTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// 処理結果メッセージ管理クラス初期設定
		int	intResultCount = -1;
		PreparedStatement stmt = null;
		try
		{
			String strDateTime = _invCommon.readSystemDateTime(conn);
			stmt = conn.getConn().prepareStatement(_sqlInsertLotRcvIssueTable);

			System.out.println(""
				+ "\n s) RCV_ISSUE_CTRL_CD：" + info.getRCV_ISSUE_CTRL_CD()
				+ "\n s) RCV_ISSUE_TYP：" + info.getRCV_ISSUE_TYP()
				+ "\n s) ITEM_CD：" + info.getITEM_CD()
				+ "\n s) PLANT_CD：" + info.getPLANT_CD()
				+ "\n s) WH_CD：" + info.getWH_CD()
				+ "\n s) JOB_ODR_CD：" + info.getJOB_ODR_CD()
				+ "\n s) RCV_ISSUE_QTY：" + info.getRCV_ISSUE_QTY()
				+ "\n s) RCV_ISSUE_DATE：" + info.getRCV_ISSUE_DATE()
				+ "\n s) RCV_ISSUE_GNR_TYP：" + info.getRCV_ISSUE_GNR_TYP()
				+ "\n s) STOCK_UPD_TYP：" + info.getSTOCK_UPD_TYP()
				+ "\n s) RCV_ISSUE_CMPLT_FLG：" + info.getRCV_ISSUE_CMPLT_FLG()
				+ "\n s) COMPANY_CD：" + info.getCOMPANY_CD()
				+ "\n s) strDateTime：" + strDateTime
				+ "\n s) _strUserCd：" + _strUserCd
				+ "\n s) _strProgramName：" + _strProgramName
				+ "\n s) strDateTime：" + strDateTime
				+ "\n s) _strUserCd：" + _strUserCd
				+ "\n s) _strProgramName：" + _strProgramName
			);
			stmt.setString(1, info.getRCV_ISSUE_CTRL_CD());		// set
			stmt.setString(2, info.getRCV_ISSUE_TYP());			// set
			stmt.setString(3, info.getITEM_CD());				// set
			stmt.setString(4, info.getPLANT_CD());				// set
			stmt.setString(5, info.getWH_CD());					// set
			stmt.setString(6, info.getJOB_ODR_CD());			// set
			stmt.setString(7, info.getRCV_ISSUE_QTY());			// set
			stmt.setString(8, info.getRCV_ISSUE_DATE());		// set
			stmt.setString(9, info.getRCV_ISSUE_GNR_TYP());		// set
			stmt.setString(10, info.getSTOCK_UPD_TYP());		// set
			stmt.setString(11, info.getRCV_ISSUE_CMPLT_FLG());	// set
			stmt.setString(12, info.getCOMPANY_CD());			// set
			stmt.setString(13, strDateTime);					// set
			stmt.setString(14, _strUserCd);						// set
			stmt.setString(15, _strProgramName);				// set
			stmt.setString(16, strDateTime);					// set
			stmt.setString(17, _strUserCd);						// set
			stmt.setString(18, _strProgramName);				// set
			stmt.setString(19, info.getSAVE_STOCK_HAND_QTY());	// set
			stmt.setString(20, Calculate.add(info.getSAVE_STOCK_HAND_QTY(),
					info.getRCV_ISSUE_QTY()));	// set
			stmt.setString(21, info.getLOT_NO()); // set

			intResultCount = stmt.executeUpdate();
		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// エラー情報設定
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// 詳細情報
				+ " (SBM1145)製番:[ " + info.getJOB_ODR_CD() + " ]"
				+ " 品目番号:[ " + info.getITEM_CD() + " ]"
				+ " 保管区コード:[ " + info.getWH_CD() + " ]"
				+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
			);
			intResultCount = -1;
		}
		finally
		{
			closePreparedStatement(stmt);
		}
		return intResultCount;
	}
	////////////////////////////////////////////////////////////////////////////
	/**
	 * 入出庫管理番号自動採番処理
	 *
	 * @param	conn	DBアクセス用のコネクション
	 * @return	採番された入出庫管理番号:成功 / null:失敗
	 */
	protected String getRcvIssueCtrlCd(
		IDbConnection conn)
	{
		initResultMessage();	// 処理結果メッセージ管理クラス初期設定
		String ctrlCd = null;
		try
		{
			Numbering numbering = new Numbering(
				conn, Numbering.ISSUE_CD, _strUserCd, _strProgramName, _strPlantCd);
			ctrlCd = numbering.getNo();
		}
		catch(FoundationException fe)
		{
			// エラー
			fe.printStackTrace();
			ctrlCd = null;
		}
		if(ctrlCd == null)
		{
			// エラー情報設定
			_msg.add(InvMessageControl.TYP_ERROR, "AH00038", ""
				// 詳細情報
				+ " (SBM1146)ユーザID:[ " + _strUserCd + " ]"
				+ " 業務名:[ " + _strProgramName + " ]"
				+ " 工場コード:[ " + _strPlantCd + " ]"
			);
		}
		return ctrlCd;
	}

//------------------------------------------------------------------------------------
// SQL定義

	////////////////////////////////////////////////////////////////////////////
	// 品目棚卸

	/** 保管区別品目棚卸読込(for update) */
	private String _sqlItemInvTable4Update = ""
+"select "
+" T_ITEM_INV.ITEM_CD as ITEM_CD "
+",T_ITEM_INV.WH_CD as WH_CD "
+",TO_CHAR(T_ITEM_INV.ACTUAL_STOCK_QTY, 'fm99999999999990.0999') as ACTUAL_STOCK_QTY "
+",TO_CHAR(T_ITEM_INV.FINAL_BOOK_STOCK_QTY, 'fm99999999999990.0999') as FINAL_BOOK_STOCK_QTY "
+"from "
+" T_ITEM_INV "
+"where "
+" T_ITEM_INV.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+" and T_ITEM_INV.PLANT_CD = ? "
+" and T_ITEM_INV.INV_UPD_FLG = '0' "
+"for update nowait ";
	
	
	/** 保管区別品目棚卸読込(for update) */
	private String _sqlLotInvTable4Update = ""
+"select "
+" T_LOT_INV.ITEM_CD as ITEM_CD "
+",T_LOT_INV.WH_CD as WH_CD "
+",TO_CHAR(T_LOT_INV.ACTUAL_STOCK_QTY, 'fm99999999999990.0999') as ACTUAL_STOCK_QTY "
+",TO_CHAR(T_LOT_INV.FINAL_BOOK_STOCK_QTY, 'fm99999999999990.0999') as FINAL_BOOK_STOCK_QTY "
+",T_LOT_INV.LOT_NO as LOT_NO "
+"from "
+" T_LOT_INV "
+"where "
+" T_LOT_INV.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+" and T_LOT_INV.PLANT_CD = ? "
+" and T_LOT_INV.INV_UPD_FLG = '0' "
+"for update nowait ";

	/** 保管区別品目在庫読込(for update) */
	private String _sqlItemStockTable4Update = ""
+"select "
+" TO_CHAR(T_ITEM_STOCK.STOCK_ON_HAND_QTY, 'fm99999999999990.0999') as STOCK_ON_HAND_QTY "
+"from "
+" T_ITEM_STOCK "
+"where "
+" T_ITEM_STOCK.ITEM_CD = ? "
+" and T_ITEM_STOCK.WH_CD = ? "
+" and T_ITEM_STOCK.PLANT_CD = ? "
+"for update nowait ";
	
	/** ロット別品目在庫読込(for update) */
	private String _sqlLotStockTable4Update = ""
+"select "
+" TO_CHAR(T_LOT_STOCK.STOCK_ON_HAND_QTY, 'fm99999999999990.0999') as STOCK_ON_HAND_QTY "
+"from "
+" T_LOT_STOCK "
+"where "
+" T_LOT_STOCK.ITEM_CD = ? "
+" and T_LOT_STOCK.WH_CD = ? "
+" and T_LOT_STOCK.PLANT_CD = ? "
+" and T_LOT_STOCK.LOT_NO = ? "
+"for update nowait ";


	/** 保管区別品目在庫更新 */
	private String _sqlUpdateItemStockTable = ""
+"update T_ITEM_STOCK "
+"set "
+" STOCK_ON_HAND_QTY = TO_NUMBER(?) "
+",UPDATED_DATE = TO_DATE(? ,'YYYY/MM/DD HH24:MI:SS') "
+",UPDATED_BY = ? "
+",UPDATED_PRG_NM = ? "
+",MODIFY_COUNT=MODIFY_COUNT + 1 "
+"where "
+" T_ITEM_STOCK.ITEM_CD = ? "
+" and T_ITEM_STOCK.WH_CD = ? "
+" and T_ITEM_STOCK.PLANT_CD = ? ";

	/** ロット管理フラグを取得 */
	private String _sqlGetLotCtrlFlg = ""
+"SELECT M_ITEM.LOT_CTRL_FLG "
+"FROM "
+" M_ITEM "
+" WHERE "
+" M_ITEM.ITEM_CD = ? ";
	
	/** ロット別品目在庫更新 */
	private String _sqlUpdateLotStockTable = ""
+"update T_LOT_STOCK "
+"set "
+" STOCK_ON_HAND_QTY = TO_NUMBER(?) "
+",UPDATED_DATE = TO_DATE(? ,'YYYY/MM/DD HH24:MI:SS') "
+",UPDATED_BY = ? "
+",UPDATED_PRG_NM = ? "
+",MODIFY_COUNT=MODIFY_COUNT + 1 "
+"where "
+" T_LOT_STOCK.ITEM_CD = ? "
+" and T_LOT_STOCK.WH_CD = ? "
+" and T_LOT_STOCK.PLANT_CD = ? "
+" and T_LOT_STOCK.LOT_NO = ? ";
	

	/** 保管区別品目在庫登録 */
	private String _sqlInsertItemStockTable = ""
+"insert into T_ITEM_STOCK "
+"(ITEM_CD "
+",WH_CD "
+",PLANT_CD "
+",STOCK_ON_HAND_QTY "
+",CREATED_DATE "
+",CREATED_BY "
+",CREATED_PRG_NM "
+",UPDATED_DATE "
+",UPDATED_BY "
+",UPDATED_PRG_NM) "
+"values (?, ?, ?, TO_NUMBER(?), TO_DATE(? ,'YYYY/MM/DD HH24:MI:SS'), ?, ?, TO_DATE(? ,'YYYY/MM/DD HH24:MI:SS'), ?, ?) ";

	
	/** ロット別品目在庫登録 */
	private String _sqlInsertLotStockTable = ""
+"insert into T_LOT_STOCK "
+"(ITEM_CD "
+",WH_CD "
+",PLANT_CD "
+",STOCK_ON_HAND_QTY "
+",CREATED_DATE "
+",CREATED_BY "
+",CREATED_PRG_NM "
+",UPDATED_DATE "
+",UPDATED_BY "
+",UPDATED_PRG_NM "
+",LOT_NO "
+",DEFECT_QTY "
+",ALCD_QTY)"
+"values (?, ?, ?, TO_NUMBER(?), TO_DATE(? ,'YYYY/MM/DD HH24:MI:SS'), ?, ?, TO_DATE(? ,'YYYY/MM/DD HH24:MI:SS'), ?, ? , ? , 0 , 0) ";


	/** 保管区別品目棚卸更新 */
	private String _sqlUpdateItemInvTable = ""
+"update T_ITEM_INV "
+"set "
+" INV_UPD_FLG = ? "
+",UPDATED_DATE = TO_DATE(? ,'YYYY/MM/DD HH24:MI:SS') "
+",UPDATED_BY = ? "
+",UPDATED_PRG_NM = ? "
+",MODIFY_COUNT=MODIFY_COUNT + 1 "
+"where "
+" T_ITEM_INV.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+" and T_ITEM_INV.PLANT_CD = ? "
+" and T_ITEM_INV.ITEM_CD = ? "
+" and T_ITEM_INV.WH_CD = ? ";
	

	/** ロット別品目棚卸更新 */
	private String _sqlUpdateLotInvTable = ""
+"update T_LOT_INV "
+"set "
+" INV_UPD_FLG = ? "
+",UPDATED_DATE = TO_DATE(? ,'YYYY/MM/DD HH24:MI:SS') "
+",UPDATED_BY = ? "
+",UPDATED_PRG_NM = ? "
+",MODIFY_COUNT=MODIFY_COUNT + 1 "
+"where "
+" T_LOT_INV.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+" and T_LOT_INV.PLANT_CD = ? "
+" and T_LOT_INV.ITEM_CD = ? "
+" and T_LOT_INV.WH_CD = ? "
+" and T_LOT_INV.LOT_NO = ? ";


	////////////////////////////////////////////////////////////////////////////
	// 製番棚卸

	/** 保管区別製番棚卸読込(for update) */
	private String _sqlReadJobOdrCdInvTable4Update = ""
+"select "
+" T_JOB_ODR_CD_INV.JOB_ODR_CD as JOB_ODR_CD "
+",T_JOB_ODR_CD_INV.ITEM_CD as ITEM_CD "
+",T_JOB_ODR_CD_INV.WH_CD as WH_CD "
+",T_JOB_ODR_CD_INV.PLANT_CD as PLANT_CD "
+",TO_CHAR(T_JOB_ODR_CD_INV.ACTUAL_STOCK_QTY, 'fm99999999999990.0999') as ACTUAL_STOCK_QTY "
+",TO_CHAR(T_JOB_ODR_CD_INV.FINAL_BOOK_STOCK_QTY, 'fm99999999999990.0999') as FINAL_BOOK_STOCK_QTY "
+"from "
+" T_JOB_ODR_CD_INV "
+"where "
+" T_JOB_ODR_CD_INV.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+" and T_JOB_ODR_CD_INV.PLANT_CD = ? "
+" and T_JOB_ODR_CD_INV.INV_UPD_FLG = '0' "
+"for update nowait ";


	/** 保管区別製番在庫読込(for update) */
	private String _sqlReadJobOdrCdStockTable4Update = ""
+"select "
+" TO_CHAR(T_JOB_ODR_CD_STOCK.STOCK_ON_HAND_QTY, 'fm99999999999990.0999') as STOCK_ON_HAND_QTY "
+"from "
+" T_JOB_ODR_CD_STOCK "
+"where "
+" T_JOB_ODR_CD_STOCK.JOB_ODR_CD = ? "
+" and T_JOB_ODR_CD_STOCK.ITEM_CD = ? "
+" and T_JOB_ODR_CD_STOCK.WH_CD = ? "
+" and T_JOB_ODR_CD_STOCK.PLANT_CD = ? "
+"for update nowait ";


	/** 保管区別製番在庫更新 */
	private String _sqlUpdateJobOdrCdStockTable = ""
+"update T_JOB_ODR_CD_STOCK "
+"set "
+" STOCK_ON_HAND_QTY = TO_NUMBER(?) "
+",UPDATED_DATE = TO_DATE(? ,'YYYY/MM/DD HH24:MI:SS') "
+",UPDATED_BY = ? "
+",UPDATED_PRG_NM = ? "
+",MODIFY_COUNT=MODIFY_COUNT + 1 "
+"where "
+" T_JOB_ODR_CD_STOCK.JOB_ODR_CD = ? "
+" and T_JOB_ODR_CD_STOCK.ITEM_CD = ? "
+" and T_JOB_ODR_CD_STOCK.WH_CD = ? "
+" and T_JOB_ODR_CD_STOCK.PLANT_CD = ? ";


	/** 保管区別製番在庫登録 */
	private String _sqlInsertJobOdrCdStockTable = ""
+"insert into T_JOB_ODR_CD_STOCK "
+"(JOB_ODR_CD "
+",ITEM_CD "
+",WH_CD "
+",PLANT_CD "
+",STOCK_ON_HAND_QTY "
+",CREATED_DATE "
+",CREATED_BY "
+",CREATED_PRG_NM "
+",UPDATED_DATE "
+",UPDATED_BY "
+",UPDATED_PRG_NM) "
+"values (?, ?, ? ,?, TO_NUMBER(?), TO_DATE(? ,'YYYY/MM/DD HH24:MI:SS'), ?, ?, TO_DATE(? ,'YYYY/MM/DD HH24:MI:SS'), ?, ?) ";


	/** 保管区別製番棚卸更新 */
	private String _sqlUpdateJobOdrCdInvTable = ""
+"update T_JOB_ODR_CD_INV "
+"set "
+" INV_UPD_FLG = ? "
+",UPDATED_DATE = TO_DATE(? ,'YYYY/MM/DD HH24:MI:SS') "
+",UPDATED_BY = ? "
+",UPDATED_PRG_NM = ? "
+",MODIFY_COUNT=MODIFY_COUNT + 1 "
+"where "
+" T_JOB_ODR_CD_INV.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+" and T_JOB_ODR_CD_INV.PLANT_CD = ? "
+" and T_JOB_ODR_CD_INV.JOB_ODR_CD = ? "
+" and T_JOB_ODR_CD_INV.ITEM_CD = ? "
+" and T_JOB_ODR_CD_INV.WH_CD = ? ";


	////////////////////////////////////////////////////////////////////////////
	// 棚卸制御

	/** 棚卸制御読込(for update) */
	private String _sqlReadInvCtrlTable4Update = ""
+"select "
+" T_INV_CTRL.REGULAR_INV_FLG as REGULAR_INV_FLG "
+",T_INV_CTRL.CYCLE_INV_FLG as CYCLE_INV_FLG "
+",T_INV_CTRL.TEMP_INV_FLG as TEMP_INV_FLG "
+",T_INV_CTRL.INV_STS_TYP as INV_STS_TYP "
+"from "
+" T_INV_CTRL "
+"where "
+" T_INV_CTRL.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+" and T_INV_CTRL.PLANT_CD = ? "
+"for update nowait ";

	/** 棚卸更新用棚卸制御更新 */
	private String _sqlUpdateInvCtrlTable4InvUpdate = ""
+"update T_INV_CTRL "
+"set "
+" INV_STS_TYP = ? "
+",INV_UPDATED_DATE = TO_DATE(? ,'YYYY/MM/DD HH24:MI:SS') "
+",UPDATED_DATE = TO_DATE(? ,'YYYY/MM/DD HH24:MI:SS') "
+",UPDATED_BY = ? "
+",UPDATED_PRG_NM = ? "
+",MODIFY_COUNT = MODIFY_COUNT + 1 "
+"where "
+" T_INV_CTRL.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+" and T_INV_CTRL.PLANT_CD = ? ";

	/** 棚卸日在庫退避用棚卸制御更新 */
	private String _sqlUpdateInvCtrlTable4InvSave = ""
		+"update T_INV_CTRL "
		+"set INV_STS_TYP = ? "
		+"   ,STOCK_SAVE_DATE = TO_DATE(?,'YYYY/MM/DD HH24:MI:SS') "
		+"   ,UPDATED_DATE = TO_DATE(?,'YYYY/MM/DD HH24:MI:SS') "
		+"   ,UPDATED_BY = ? "
		+"   ,UPDATED_PRG_NM = ? "
		+"   ,MODIFY_COUNT = MODIFY_COUNT + 1 "
		+"where "
		+"    T_INV_CTRL.INV_DATE = TO_DATE(?,'YYYY/MM/DD') "
		+"and T_INV_CTRL.PLANT_CD = ? ";


	////////////////////////////////////////////////////////////////////////////
	// 棚卸更新処理関連SQL定義（共通）

	/** 保管区別入出庫読込 */
	private String _sqlReadRcvIssueTable = ""
+"select  "
+" TO_CHAR(SUM(T_RCV_ISSUE.RCV_ISSUE_QTY), 'fm99999999999990.0999') as SUM_RCV_ISSUE_QTY "
+"from  "
+" T_RCV_ISSUE "
+",T_INV_CTRL "
+"where "
+" T_RCV_ISSUE.PLANT_CD = T_INV_CTRL.PLANT_CD "
+" and T_RCV_ISSUE.RCV_ISSUE_DATE <= T_INV_CTRL.INV_DATE "
+" and T_RCV_ISSUE.CREATED_DATE > T_INV_CTRL.STOCK_SAVE_DATE "
+" and T_RCV_ISSUE.STOCK_UPD_TYP = '2' "
+" and T_INV_CTRL.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+" and T_INV_CTRL.PLANT_CD = ? "
+" and NVL(T_RCV_ISSUE.JOB_ODR_CD, ' ') = NVL(?, ' ') "
+" and T_RCV_ISSUE.ITEM_CD = ? "
+" and T_RCV_ISSUE.WH_CD = ? "
+"group by "
+" T_RCV_ISSUE.JOB_ODR_CD "
+",T_RCV_ISSUE.ITEM_CD "
+",T_RCV_ISSUE.WH_CD "
+",T_RCV_ISSUE.PLANT_CD ";
	
	/** ロット別入出庫読込 */
	private String _sqlReadLotRcvIssueTable = ""
+"select  "
+" TO_CHAR(SUM(T_RCV_ISSUE.RCV_ISSUE_QTY), 'fm99999999999990.0999') as SUM_RCV_ISSUE_QTY "
+"from  "
+" T_RCV_ISSUE "
+",T_INV_CTRL "
+"where "
+" T_RCV_ISSUE.PLANT_CD = T_INV_CTRL.PLANT_CD "
+" and T_RCV_ISSUE.RCV_ISSUE_DATE <= T_INV_CTRL.INV_DATE "
+" and T_RCV_ISSUE.CREATED_DATE > T_INV_CTRL.STOCK_SAVE_DATE "
+" and T_RCV_ISSUE.STOCK_UPD_TYP = '2' "
+" and T_INV_CTRL.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+" and T_INV_CTRL.PLANT_CD = ? "
+" and T_RCV_ISSUE.LOT_NO = ?"
+" and NVL(T_RCV_ISSUE.JOB_ODR_CD, ' ') = NVL(?, ' ') "
+" and T_RCV_ISSUE.ITEM_CD = ? "
+" and T_RCV_ISSUE.WH_CD = ? "
+"group by "
+" T_RCV_ISSUE.JOB_ODR_CD "
+",T_RCV_ISSUE.ITEM_CD "
+",T_RCV_ISSUE.WH_CD "
+",T_RCV_ISSUE.PLANT_CD ";

	/** 保管区別入出庫更新 */
	private String _sqlInsertRcvIssueTable = ""
+"insert into T_RCV_ISSUE "
+"(RCV_ISSUE_CTRL_CD "
+",RCV_ISSUE_TYP "
+",ITEM_CD "
+",PLANT_CD "
+",WH_CD "
+",JOB_ODR_CD "
+",RCV_ISSUE_QTY "
+",RCV_ISSUE_DATE "
+",RCV_ISSUE_GNR_TYP "
+",STOCK_UPD_TYP "
+",RCV_ISSUE_CMPLT_FLG "
+",COMPANY_CD "
+",CREATED_DATE "
+",CREATED_BY "
+",CREATED_PRG_NM "
+",UPDATED_DATE "
+",UPDATED_BY "
+",UPDATED_PRG_NM "
+",RCV_ISSUE_BEFORE_QTY "
+",RCV_ISSUE_AFTER_QTY) "
+"values (?, ?, ?, ?, ?, ?, TO_NUMBER(?), TO_DATE(? ,'YYYY/MM/DD'), ?, ?, ?, ?, TO_DATE(? ,'YYYY/MM/DD HH24:MI:SS'), ?, ?, TO_DATE(? ,'YYYY/MM/DD HH24:MI:SS'), ?, ?, ?, ?) ";

	/** 保管区別入出庫更新 */
	private String _sqlInsertLotRcvIssueTable = ""
+"insert into T_RCV_ISSUE "
+"(RCV_ISSUE_CTRL_CD "
+",RCV_ISSUE_TYP "
+",ITEM_CD "
+",PLANT_CD "
+",WH_CD "
+",JOB_ODR_CD "
+",RCV_ISSUE_QTY "
+",RCV_ISSUE_DATE "
+",RCV_ISSUE_GNR_TYP "
+",STOCK_UPD_TYP "
+",RCV_ISSUE_CMPLT_FLG "
+",COMPANY_CD "
+",CREATED_DATE "
+",CREATED_BY "
+",CREATED_PRG_NM "
+",UPDATED_DATE "
+",UPDATED_BY "
+",UPDATED_PRG_NM "
+",RCV_ISSUE_BEFORE_QTY "
+",RCV_ISSUE_AFTER_QTY "
+",LOT_NO)"
+"values (?, ?, ?, ?, ?, ?, TO_NUMBER(?), TO_DATE(? ,'YYYY/MM/DD'), ?, ?, ?, ?, TO_DATE(? ,'YYYY/MM/DD HH24:MI:SS'), ?, ?, TO_DATE(? ,'YYYY/MM/DD HH24:MI:SS'), ?, ?, ?, ? ,?) ";

}
