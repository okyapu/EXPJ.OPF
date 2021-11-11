//------------------------------------------------------------------------------
// (#)InvSaveAccessor.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2004/01/23 新規作成  M.Isoda
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.Inventry;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.nec.jp.orteus.metamorBase.common01.db.DBErrorMessage;

/**
 * 棚卸在庫退避アクセッサクラス
 *
 * @author  M.Isoda
 * @version 1.00
*/
public class InvSaveAccessor
{
//--------------------------------------------------------------------------
// 構築

	/** コンストラクタ */
	public InvSaveAccessor(){ clear(); }

	/** コンストラクタ
	 *
	 * @param	strPlantCd		工場コード
	 * @param	strUserCd		ユーザコード
	 * @param	strProgramName	プログラム名（例 AH0070B001）
	 */
	public InvSaveAccessor(
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
	private InvMessageControl _msg = null;

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
	 * 保管区別品目棚卸削除
	 *
	 * @param	conn	DBアクセス用のコネクション
	 * @param	info	パラメータ情報
	 * @return	処理レコード数:成功 / -1:失敗
	 */
	protected int deleteItemInvTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// 処理結果メッセージ管理クラス初期設定
		PreparedStatement stmt = null;	// delete
		int	intResultCount = -1;
		try
		{
			stmt = conn.getConn().prepareStatement(_sqlDeleteItemInvTable2);
			stmt.setString(1, info.getINV_DATE());
			stmt.setString(2, info.getPLANT_CD());
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
	/**
	 * 保管区別品目棚卸の追加
	 *
	 * @param	conn	DBアクセス用のコネクション
	 * @param	info	パラメータ情報
	 * @return	処理レコード数:成功 / -1:失敗
	 */
	protected int insertItemInvTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// 処理結果メッセージ管理クラス初期設定
		int	intResultCount = -1;
		PreparedStatement stmt = null;	// insert
		try {
			String strDateTime = _invCommon.readSystemDateTime(conn);
			stmt = conn.getConn().prepareStatement(_sqlInsertItemInvTable);
/*System.out.println(""
	+ "\n s) INV_DATE: " + info.getINV_DATE()
	+ "\n s) ITEM_CD: " + info.getITEM_CD()
	+ "\n s) WH_CD: " + info.getWH_CD()
	+ "\n s) PLANT_CD: " + info.getPLANT_CD()
	+ "\n s) ACTUAL_STOCK_QTY: " + info.getACTUAL_STOCK_QTY()
	+ "\n s) FINAL_BOOK_STOCK_QTY: " + info.getFINAL_BOOK_STOCK_QTY()
	+ "\n s) FINAL_BOOK_DEFECT_QTY: " + info.getFINAL_BOOK_DEFECT_QTY()
	+ "\n s) strDateTime: " + strDateTime
	+ "\n s) _strUserCd: " + _strUserCd
	+ "\n s) _strProgramName: " + _strProgramName
	+ "\n s) strDateTime: " + strDateTime
	+ "\n s) _strUserCd: " + _strUserCd
	+ "\n s) _strProgramName: " + _strProgramName
);*/
			stmt.setString(1, info.getINV_DATE());
			stmt.setString(2, info.getITEM_CD());
			stmt.setString(3, info.getWH_CD());
			stmt.setString(4, info.getPLANT_CD());
			stmt.setString(5, info.getSTOCK_ON_HAND_QTY());
			stmt.setString(6, info.getSTOCK_ON_HAND_QTY());
			stmt.setString(7, info.getDEFECT_QTY());
			stmt.setString(8, strDateTime);
			stmt.setString(9, _strUserCd);
			stmt.setString(10, _strProgramName);
			stmt.setString(11, strDateTime);
			stmt.setString(12, _strUserCd);
			stmt.setString(13, _strProgramName);
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
	/**
	 * 保管区別製番棚卸の削除
	 *
	 * @param	conn	DBアクセス用のコネクション
	 * @param	info	パラメータ情報
	 * @return	処理レコード数:成功 / -1:失敗
	 */
	protected int deleteJobOdrCdInvTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// 処理結果メッセージ管理クラス初期設定
		int	intResultCount = -1;
		PreparedStatement stmt = null;	// delete
		try
		{
			stmt = conn.getConn().prepareStatement(_sqlDeleteJobOdrCdInvTable2);
			stmt.setString(1, info.getINV_DATE());
			stmt.setString(2, info.getPLANT_CD());
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
	/**
	 * ロット別品目在庫の削除
	 *
	 * @param	conn	DBアクセス用のコネクション
	 * @param	info	パラメータ情報
	 * @return	処理レコード数:成功 / -1:失敗
	 */
	protected int deleteLotInvTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// 処理結果メッセージ管理クラス初期設定
		int	intResultCount = -1;
		PreparedStatement stmt = null;	// delete
		try
		{
			stmt = conn.getConn().prepareStatement(_sqlDeleteLotInvTable2);
			stmt.setString(1, info.getINV_DATE());
			stmt.setString(2, info.getPLANT_CD());
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
	/**
	 * 保管区別製番棚卸の追加
	 *
	 * @param	conn	DBアクセス用のコネクション
	 * @param	info	パラメータ情報
	 * @return	処理レコード数:成功 / -1:失敗
	 */
	protected int insertJobOdrCdInvTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// 処理結果メッセージ管理クラス初期設定
		int	intResultCount = -1;
		PreparedStatement stmt = null;	// delete
		try
		{
			String strDateTime = _invCommon.readSystemDateTime(conn);
			stmt = conn.getConn().prepareStatement(_sqlInsertJobOdrCdInvTable);
/*System.out.println(""
	+ "\n s) INV_DATE: " + info.getINV_DATE()
	+ "\n s) JOB_ODR_CD: " + info.getJOB_ODR_CD()
	+ "\n s) ITEM_CD: " + info.getITEM_CD()
	+ "\n s) WH_CD: " + info.getWH_CD()
	+ "\n s) PLANT_CD: " + info.getPLANT_CD()
	+ "\n s) ACTUAL_STOCK_QTY: " + info.getACTUAL_STOCK_QTY()
	+ "\n s) FINAL_BOOK_STOCK_QTY: " + info.getFINAL_BOOK_STOCK_QTY()
	+ "\n s) strDateTime: " + strDateTime
	+ "\n s) _strUserCd: " + _strUserCd
	+ "\n s) _strProgramName: " + _strProgramName
	+ "\n s) strDateTime: " + strDateTime
	+ "\n s) _strUserCd: " + _strUserCd
	+ "\n s) _strProgramName: " + _strProgramName
);*/
			stmt.setString(1, info.getINV_DATE());
			stmt.setString(2, info.getJOB_ODR_CD());
			stmt.setString(3, info.getITEM_CD());
			stmt.setString(4, info.getWH_CD());
			stmt.setString(5, info.getPLANT_CD());
			stmt.setString(6, info.getACTUAL_STOCK_QTY());
			stmt.setString(7, info.getFINAL_BOOK_STOCK_QTY());
			stmt.setString(8, strDateTime);
			stmt.setString(9, _strUserCd);
			stmt.setString(10, _strProgramName);
			stmt.setString(11, strDateTime);
			stmt.setString(12, _strUserCd);
			stmt.setString(13, _strProgramName);
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
	 * ロット別品目棚卸の追加
	 *
	 * @param	conn	DBアクセス用のコネクション
	 * @param	info	パラメータ情報
	 * @return	処理レコード数:成功 / -1:失敗
	 */
	protected int insertLotInvTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// 処理結果メッセージ管理クラス初期設定
		int	intResultCount = -1;
		PreparedStatement stmt = null;	// delete
		try
		{
			String strDateTime = _invCommon.readSystemDateTime(conn);
			stmt = conn.getConn().prepareStatement(_sqlInsertLotOdrCdInvTable);
			stmt.setString(1, info.getINV_DATE());
			stmt.setString(2, info.getLOT_NO());
			stmt.setString(3, info.getITEM_CD());
			stmt.setString(4, info.getWH_CD());
			stmt.setString(5, info.getPLANT_CD());
			stmt.setString(6, info.getACTUAL_STOCK_QTY());
			stmt.setString(7, info.getFINAL_BOOK_STOCK_QTY());
			stmt.setString(8, strDateTime);
			stmt.setString(9, _strUserCd);
			stmt.setString(10, _strProgramName);
			stmt.setString(11, strDateTime);
			stmt.setString(12, _strUserCd);
			stmt.setString(13, _strProgramName);
			intResultCount = stmt.executeUpdate();
		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// エラー情報設定
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// 詳細情報
				+ " (SBM1116)棚卸日:[ " + info.getINV_DATE() + " ]"
				+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
				+ " 在庫ロット番号:[ " + info.getLOT_NO() + " ]"
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
		// 棚卸制御の更新（実施前→期間中,在庫退避日時）
		try
		{
			String strDateTime = _invCommon.readSystemDateTime(conn);
			stmt = conn.getConn().prepareStatement(_sqlUpdateInvCtrl);
/*System.out.println(""
	+ "\n s) INV_STS_TYP: " + info.getINV_STS_TYP()
	+ "\n s) strDateTime: " + strDateTime
	+ "\n s) strDateTime: " + strDateTime
	+ "\n s) _strUserCd: " + _strUserCd
	+ "\n s) _strProgramName: " + _strProgramName
	+ "\n w) INV_DATE: " + info.getINV_DATE()
	+ "\n w) PLANT_CD: " + info.getPLANT_CD()
);*/
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

//------------------------------------------------------------------------------------
// SQL定義

	/** 保管区別製番棚卸の削除SQL */
	private String _sqlDeleteItemInvTable2 = ""
		+"delete from T_ITEM_INV "
		+"where "
		+"    T_ITEM_INV.INV_DATE = TO_DATE(?,'YYYY/MM/DD') "
		+"and T_ITEM_INV.PLANT_CD = ? ";

	/** 保管区別製番棚卸の削除SQL */
	private String _sqlDeleteJobOdrCdInvTable2 = ""
		+"delete from T_JOB_ODR_CD_INV "
		+"where "
		+"    T_JOB_ODR_CD_INV.INV_DATE = TO_DATE(?,'YYYY/MM/DD') "
		+"and T_JOB_ODR_CD_INV.PLANT_CD = ? ";
	
	/** ロット別品目在庫の削除SQL */
	private String _sqlDeleteLotInvTable2 = ""
		+"delete from T_LOT_INV "
		+"where "
		+"    T_LOT_INV.INV_DATE = TO_DATE(?,'YYYY/MM/DD') "
		+"and T_LOT_INV.PLANT_CD = ? ";

	/** 保管区別品目棚卸の追加SQL */
	private String _sqlInsertItemInvTable = ""
		+"insert into T_ITEM_INV ( "
		+"    INV_DATE "
		+"   ,ITEM_CD "
		+"   ,WH_CD "
		+"   ,PLANT_CD "
		+"   ,ACTUAL_STOCK_QTY "
		+"   ,FINAL_BOOK_STOCK_QTY "
		+"   ,FINAL_BOOK_DEFECT_QTY "
		+"   ,CREATED_DATE "
		+"   ,CREATED_BY "
		+"   ,CREATED_PRG_NM "
		+"   ,UPDATED_DATE "
		+"   ,UPDATED_BY "
		+"   ,UPDATED_PRG_NM) "
		+"values "
		+"   (TO_DATE(?,'YYYY/MM/DD'),?,?,?,TO_NUMBER(?),TO_NUMBER(?),TO_NUMBER(?) "
		+"   ,TO_DATE(?,'YYYY/MM/DD HH24:MI:SS'),?,?,TO_DATE(?,'YYYY/MM/DD HH24:MI:SS'),?,?) ";

	/** 保管区別製番棚卸の追加SQL */
	private String _sqlInsertJobOdrCdInvTable = ""
		+"insert into T_JOB_ODR_CD_INV ( "
		+"    INV_DATE "
		+"   ,JOB_ODR_CD "
		+"   ,ITEM_CD "
		+"   ,WH_CD "
		+"   ,PLANT_CD "
		+"   ,ACTUAL_STOCK_QTY "
		+"   ,FINAL_BOOK_STOCK_QTY "
		+"   ,CREATED_DATE "
		+"   ,CREATED_BY "
		+"   ,CREATED_PRG_NM "
		+"   ,UPDATED_DATE "
		+"   ,UPDATED_BY "
		+"   ,UPDATED_PRG_NM) "
		+"values "
		+"   (TO_DATE(?,'YYYY/MM/DD'),?,?,?,?,TO_NUMBER(?),TO_NUMBER(?) "
		+"   ,TO_DATE(?,'YYYY/MM/DD HH24:MI:SS'),?,?,TO_DATE(?,'YYYY/MM/DD HH24:MI:SS'),?,?) ";
	
	/** ロット別品目棚卸の追加SQL */
	private String _sqlInsertLotOdrCdInvTable = ""
		+"insert into T_LOT_INV ( "
		+"    INV_DATE "
		+"   ,LOT_NO "
		+"   ,ITEM_CD "
		+"   ,WH_CD "
		+"   ,PLANT_CD "
		+"   ,ACTUAL_STOCK_QTY "
		+"   ,FINAL_BOOK_STOCK_QTY "
		+"   ,CREATED_DATE "
		+"   ,CREATED_BY "
		+"   ,CREATED_PRG_NM "
		+"   ,UPDATED_DATE "
		+"   ,UPDATED_BY "
		+"   ,UPDATED_PRG_NM) "
		+"values "
		+"   (TO_DATE(?,'YYYY/MM/DD'),?,?,?,?,TO_NUMBER(?),TO_NUMBER(?) "
		+"   ,TO_DATE(?,'YYYY/MM/DD HH24:MI:SS'),?,?,TO_DATE(?,'YYYY/MM/DD HH24:MI:SS'),?,?) ";

	/** 棚卸制御の更新SQL */
	private String _sqlUpdateInvCtrl = ""
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
}
