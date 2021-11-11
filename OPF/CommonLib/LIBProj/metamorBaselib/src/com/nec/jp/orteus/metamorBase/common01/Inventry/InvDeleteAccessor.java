//------------------------------------------------------------------------------
// (#)InvDeleteAccessor.java
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
import java.util.List;
import java.util.ArrayList;
import com.nec.jp.orteus.metamorBase.common01.db.DBErrorMessage;

/**
 * 棚卸削除アクセッサクラス
 *
 * @author  M.Isoda
 * @version 1.00
*/
public class InvDeleteAccessor
{
//--------------------------------------------------------------------------
// 構築

	/** コンストラクタ */
	public InvDeleteAccessor(){ clear(); }

	/** コンストラクタ
	 *
	 * @param	strPlantCd		工場コード
	 * @param	strUserCd		ユーザコード
	 * @param	strProgramName	プログラム名（例 AH0070B001）
	 */
	public InvDeleteAccessor(
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

//------------------------------------------------------------------------------------
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
		int	intResultCount = -1;
		PreparedStatement stmt = null;	// delete
		try
		{
			stmt = conn.getConn().prepareStatement(_sqlDeleteItemInvTable1);
			stmt.setString(1, info.getPERIOD_DATE());	// where
			stmt.setString(2, info.getPLANT_CD());		// where
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
	 * 棚卸条件保管区指定の削除
	 *
	 * @param	conn	DBアクセス用のコネクション
	 * @param	info	パラメータ情報
	 * @return	処理レコード数:成功 / -1:失敗
	 */
	protected int deleteInvTargetWhTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// 処理結果メッセージ管理クラス初期設定
		int	intResultCount = -1;
		PreparedStatement stmt = null;	// delete
		try
		{
			stmt = conn.getConn().prepareStatement(_sqlDeleteInvTargetWhTable);
			stmt.setString(1, info.getPERIOD_DATE());
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
	 * 棚卸条件品目指定の削除
	 *
	 * @param	conn	DBアクセス用のコネクション
	 * @param	info	パラメータ情報
	 * @return	処理レコード数:成功 / -1:失敗
	 */
	protected int deleteInvTargetItemTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// 処理結果メッセージ管理クラス初期設定
		int	intResultCount = -1;
		PreparedStatement stmt = null;	// delete
		try
		{
			stmt = conn.getConn().prepareStatement(_sqlDeleteInvTargetItemTable);
			stmt.setString(1, info.getPERIOD_DATE());
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
				+ " 工場コード:[ " + info.getMNT_DATA_TYP() + " ]"
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
	 * 棚卸制御の削除
	 *
	 * @param	conn	DBアクセス用のコネクション
	 * @param	info	パラメータ情報
	 * @return	処理レコード数:成功 / -1:失敗
	 */
	protected int deleteInvCtrlTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// 処理結果メッセージ管理クラス初期設定
		int	intResultCount = -1;
		PreparedStatement stmt = null;	// delete
		try
		{
			stmt = conn.getConn().prepareStatement(_sqlDeleteInvCtrlTable);
			stmt.setString(1, info.getPERIOD_DATE());
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
				+ " 工場コード:[ " + info.getMNT_DATA_TYP() + " ]"
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
	 * 保持期間の読込（共通）
	 *
	 * @param	conn	DBアクセス用のコネクション
	 * @param	info	パラメータ情報
	 * @return	情報一覧:成功 / null:失敗
	 */
	protected List readSysMntPeriodTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// 処理結果メッセージ管理クラス初期設定
		List list = new ArrayList(0);
		PreparedStatement stmt = null;	// select
		ResultSet rset = null;			// 結果
		try
		{
			stmt = conn.getConn().prepareStatement(_sqlReadSysMntPeriodTable);
			stmt.setString(1, info.getPLANT_CD());		// where
			stmt.setString(2, info.getMNT_DATA_TYP());	// where
			rset = stmt.executeQuery();
			while(rset.next() == true)
			{
				InvInformation infoTemp = new InvInformation();
				infoTemp.setPERIOD_DATE(rset.getString(1));	// select
				infoTemp.setTODAY(rset.getString(2));		// select
				infoTemp.setMNT_PERIOD(rset.getString(3));	// select
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
				+ " (SBM1077)工場コード:[ " + info.getPLANT_CD() + " ]"
				+ " 保持情報区分:[ " + info.getMNT_DATA_TYP()
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
			stmt = conn.getConn().prepareStatement(_sqlDeleteJobOdrCdInvTable1);
			stmt.setString(1, info.getPERIOD_DATE());
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
	 * ロット別品目棚卸の削除
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
			stmt = conn.getConn().prepareStatement(_sqlDeleteLotTable1);
			stmt.setString(1, info.getPERIOD_DATE());
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

//------------------------------------------------------------------------------------
// SQL定義

	/** 保持期間の読込SQL */
	private String _sqlReadSysMntPeriodTable = ""
		+"select "
		+"   TO_CHAR(TO_DATE(TO_CHAR(ADD_MONTHS(sysdate,SYS_MNT_PERIOD.MNT_PERIOD * (-1)),'yyyy/mm') || '01','yyyy/mm/dd'),'yyyy/mm/dd') as PERIOD_DATE "
		+"  ,TO_CHAR(sysdate,'yyyy/mm/dd')  "
		+"  ,SYS_MNT_PERIOD.MNT_PERIOD as MNT_PERIOD "
		+"from "
		+"   SYS_MNT_PERIOD "
		+"where "
		+"      SYS_MNT_PERIOD.PLANT_CD = ? "
		+"  and SYS_MNT_PERIOD.MNT_DATA_TYP = ? ";

	/** 保管区別品目棚卸の削除SQL */
	private String _sqlDeleteItemInvTable1 = ""
		+"delete from T_ITEM_INV "
		+"where "
		+"    T_ITEM_INV.INV_DATE < TO_DATE(?,'YYYY/MM/DD') "
		+"and T_ITEM_INV.PLANT_CD = ? "
		+"and "
		+" (((T_ITEM_INV.INV_DATE "
		+"   ,T_ITEM_INV.PLANT_CD ) "
		+"            IN    (select "
		+"                        T_INV_CTRL.INV_DATE "
		+"                       ,T_INV_CTRL.PLANT_CD "
		+"                  from  T_INV_CTRL "
		+"                  where "
		+"                      T_INV_CTRL.INV_DATE = T_ITEM_INV.INV_DATE "
		+"                  and T_INV_CTRL.PLANT_CD = T_ITEM_INV.PLANT_CD "
		+"                  and T_INV_CTRL.INV_STS_TYP in (0,2))) "
		+"    OR "
		+"    NOT EXISTS   (select * from T_INV_CTRL "
		+"                  where "
		+"                      T_INV_CTRL.INV_DATE = T_ITEM_INV.INV_DATE "
		+"                  and T_INV_CTRL.PLANT_CD = T_ITEM_INV.PLANT_CD))";

	/** 保管区別製番棚卸の削除SQL */
	private String _sqlDeleteJobOdrCdInvTable1 = ""
		+"delete from T_JOB_ODR_CD_INV "
		+"where "
		+"    T_JOB_ODR_CD_INV.INV_DATE < TO_DATE(?,'YYYY/MM/DD') "
		+"and T_JOB_ODR_CD_INV.PLANT_CD = ? "
		+"and "
		+" (((T_JOB_ODR_CD_INV.INV_DATE "
		+"   ,T_JOB_ODR_CD_INV.PLANT_CD ) "
		+"            IN    (select "
		+"                        T_INV_CTRL.INV_DATE "
		+"                       ,T_INV_CTRL.PLANT_CD "
		+"                  from  T_INV_CTRL "
		+"                  where "
		+"                      T_INV_CTRL.INV_DATE = T_JOB_ODR_CD_INV.INV_DATE "
		+"                  and T_INV_CTRL.PLANT_CD = T_JOB_ODR_CD_INV.PLANT_CD "
		+"                  and T_INV_CTRL.INV_STS_TYP in (0,2))) "
		+"    OR "
		+"    NOT EXISTS   (select * from T_INV_CTRL "
		+"                  where "
		+"                      T_INV_CTRL.INV_DATE = T_JOB_ODR_CD_INV.INV_DATE "
		+"                  and T_INV_CTRL.PLANT_CD = T_JOB_ODR_CD_INV.PLANT_CD))";
	
	/** ロット別品目棚卸の削除SQL */
	private String _sqlDeleteLotTable1 = ""
		+"delete from T_LOT_INV "
		+"where "
		+"    T_LOT_INV.INV_DATE < TO_DATE(?,'YYYY/MM/DD') "
		+"and T_LOT_INV.PLANT_CD = ? "
		+"and "
		+" (((T_LOT_INV.INV_DATE "
		+"   ,T_LOT_INV.PLANT_CD ) "
		+"            IN    (select "
		+"                        T_INV_CTRL.INV_DATE "
		+"                       ,T_INV_CTRL.PLANT_CD "
		+"                  from  T_INV_CTRL "
		+"                  where "
		+"                      T_INV_CTRL.INV_DATE = T_LOT_INV.INV_DATE "
		+"                  and T_INV_CTRL.PLANT_CD = T_LOT_INV.PLANT_CD "
		+"                  and T_INV_CTRL.INV_STS_TYP in (0,2))) "
		+"    OR "
		+"    NOT EXISTS   (select * from T_INV_CTRL "
		+"                  where "
		+"                      T_INV_CTRL.INV_DATE = T_LOT_INV.INV_DATE "
		+"                  and T_INV_CTRL.PLANT_CD = T_LOT_INV.PLANT_CD))";

	/** 棚卸条件保管区指定の削除SQL */
	private String _sqlDeleteInvTargetWhTable = ""
		+"delete from T_INV_TARGET_WH "
		+"where "
		+"    T_INV_TARGET_WH.INV_DATE < TO_DATE(?,'YYYY/MM/DD') "
		+"and T_INV_TARGET_WH.PLANT_CD = ? "
		+"and "
		+" (((T_INV_TARGET_WH.INV_DATE "
		+"   ,T_INV_TARGET_WH.PLANT_CD ) "
		+"            IN    (select "
		+"                        T_INV_CTRL.INV_DATE "
		+"                       ,T_INV_CTRL.PLANT_CD "
		+"                  from  T_INV_CTRL "
		+"                  where "
		+"                      T_INV_CTRL.INV_DATE = T_INV_TARGET_WH.INV_DATE "
		+"                  and T_INV_CTRL.PLANT_CD = T_INV_TARGET_WH.PLANT_CD "
		+"                  and T_INV_CTRL.INV_STS_TYP in (0,2))) "
		+"    OR "
		+"    NOT EXISTS   (select * from T_INV_CTRL "
		+"                  where "
		+"                      T_INV_CTRL.INV_DATE = T_INV_TARGET_WH.INV_DATE "
		+"                  and T_INV_CTRL.PLANT_CD = T_INV_TARGET_WH.PLANT_CD))";

	/** 棚卸条件品目指定の削除SQL */
	private String _sqlDeleteInvTargetItemTable = ""
		+"delete from T_INV_TARGET_ITEM "
		+"where "
		+"    T_INV_TARGET_ITEM.INV_DATE < TO_DATE(?,'YYYY/MM/DD') "
		+"and T_INV_TARGET_ITEM.PLANT_CD = ? "
		+"and "
		+" (((T_INV_TARGET_ITEM.INV_DATE "
		+"   ,T_INV_TARGET_ITEM.PLANT_CD ) "
		+"            IN    (select "
		+"                        T_INV_CTRL.INV_DATE "
		+"                       ,T_INV_CTRL.PLANT_CD "
		+"                  from  T_INV_CTRL "
		+"                  where "
		+"                      T_INV_CTRL.INV_DATE = T_INV_TARGET_ITEM.INV_DATE "
		+"                  and T_INV_CTRL.PLANT_CD = T_INV_TARGET_ITEM.PLANT_CD "
		+"                  and T_INV_CTRL.INV_STS_TYP in (0,2))) "
		+"    OR "
		+"    NOT EXISTS   (select * from T_INV_CTRL "
		+"                  where "
		+"                      T_INV_CTRL.INV_DATE = T_INV_TARGET_ITEM.INV_DATE "
		+"                  and T_INV_CTRL.PLANT_CD = T_INV_TARGET_ITEM.PLANT_CD))";

	/** 棚卸制御の削除SQL */
	private String _sqlDeleteInvCtrlTable = ""
		+"delete from T_INV_CTRL "
		+"where "
		+"    T_INV_CTRL.INV_DATE < TO_DATE(?,'YYYY/MM/DD') "
		+"and T_INV_CTRL.PLANT_CD = ? "
		+"and T_INV_CTRL.INV_STS_TYP in (0,2) "
		+"and "
		+"    NOT EXISTS   (select * from T_ITEM_INV "
		+"                  where "
		+"                      T_ITEM_INV.INV_DATE = T_INV_CTRL.INV_DATE "
		+"                  and T_ITEM_INV.PLANT_CD = T_INV_CTRL.PLANT_CD)" 
		+"and "
		+"    NOT EXISTS   (select * from T_JOB_ODR_CD_INV "
		+"                  where "
		+"                      T_JOB_ODR_CD_INV.INV_DATE = T_INV_CTRL.INV_DATE "
		+"                  and T_JOB_ODR_CD_INV.PLANT_CD = T_INV_CTRL.PLANT_CD)" 
		+"and "
		+"    NOT EXISTS   (select * from T_INV_TARGET_WH "
		+"                  where "
		+"                      T_INV_TARGET_WH.INV_DATE = T_INV_CTRL.INV_DATE "
		+"                  and T_INV_TARGET_WH.PLANT_CD = T_INV_CTRL.PLANT_CD)" 
		+"and "
		+"    NOT EXISTS   (select * from T_INV_TARGET_ITEM "
		+"                  where "
		+"                      T_INV_TARGET_ITEM.INV_DATE = T_INV_CTRL.INV_DATE "
		+"                  and T_INV_TARGET_ITEM.PLANT_CD = T_INV_CTRL.PLANT_CD)"; 


}
