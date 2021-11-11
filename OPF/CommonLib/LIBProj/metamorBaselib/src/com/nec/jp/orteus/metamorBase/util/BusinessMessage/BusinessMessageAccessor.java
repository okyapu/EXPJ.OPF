//------------------------------------------------------------------------------
// (#)BusinessMessageAccessor.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/05/29 新規作成 K.Matsumoto
// 2003/06/24 OrteusStudioバージョンアップに伴う修正 Y.Inada
//            前：doConnection[ver1.00.03]
//            後：IDbConnection[ver1.00.05]
// 2003/06/25 Copyrightの記述修正 Y.Inada
//            前：Copyright (c) 2003 NEC informatec Systems,Ltd.
//            後：Copyright (c) 2003 NEC Informatec Systems,Ltd.
//            JavaDoc用コメントの体裁を整える
// 2003/07/29 コンピュータ名を廃止。工場コードを追加 K.Matsumoto
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.util.BusinessMessage;

import java.sql.Timestamp;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.text.SimpleDateFormat;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;

import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageException;

/**
 * 業務メッセージの登録、削除を行うアクセッサクラス。<BR>
 *
 * @author  K.Matsumoto
 * @version 1.00
 */
public class BusinessMessageAccessor
{
	/**
	 * オブジェクトを構築する。
	 */
	public BusinessMessageAccessor(){}

	/**
	 * 初期化。
	 * @param connect コネクション
	 */
	public void init(IDbConnection connect) {
		_connect = connect;
	}

	/**
	 * 業務メッセージの追加を行う。
	 * @throws SQLException
	 *          DBアクセス時に何らかの異常が発生した場合
	 */
	public void add(BusinessMessage message) throws SQLException
	{
		PreparedStatement getDataStatment = null;
		PreparedStatement insertDataStatment = null;
		ResultSet resultMessage = null;

		try{
			// 業務メッセージ定義テーブル検索用のSQL作成
			getDataStatment =
					_connect.getConn().prepareStatement(_getMessageSql);
			getDataStatment.setString(1, message.getMessageCode());

			// SQL実行
			resultMessage = getDataStatment.executeQuery();

			// 業務メッセージテーブル追加用のSQL作成
			insertDataStatment =
					_connect.getConn().prepareStatement(_insertSql);
			insertDataStatment.setString(1, message.getLogCode());
			insertDataStatment.setString(2, message.getPlantCode());
			insertDataStatment.setString(3, message.getBusinessName());
			insertDataStatment.setString(4, message.getMessageCode());
			insertDataStatment.setString(6, message.getData());
			// insertDataStatment.setTimestamp(
			// 		7, new Timestamp(System.currentTimeMillis()));
			insertDataStatment.setString(7, message.getUser());
			if(resultMessage.next() == true) {
				insertDataStatment.setString(5, resultMessage.getString(1));
			}else{
				insertDataStatment.setString(5,
					"(SBM0616)業務メッセージ番号に該当するメッセージが存在しません");
			}

			// SQL実行
			insertDataStatment.executeUpdate();

		} finally {
			if (resultMessage != null) {
				try {
					resultMessage.close();
				} catch (SQLException e) {}
			}

			if (getDataStatment != null) {
				try {
					getDataStatment.close();
				} catch (SQLException e) {}
			}

			if (insertDataStatment != null) {
				try {
					insertDataStatment.close();
				} catch (SQLException e) {}
			}
		}
	}

	/**
	 * 業務メッセージを取得する。
	 * @throws SQLException
	 *          DBアクセス時に何らかの異常が発生した場合
	 */
	public ArrayList get(String plant) throws SQLException
	{
		ArrayList list = new ArrayList(0);		// メッセージ格納用
		PreparedStatement stmt = null;			// ステートメント
		ResultSet rset = null;					// リザルトセット

		try{
			// 業務メッセージテーブル検索用のSQL作成
			stmt = (_connect.getConn()).prepareStatement(_selectBusinessSql);
			stmt.setString(1, plant);

			// SQL実行
			rset = stmt.executeQuery();

			// 結果を取得
			while(rset.next()){
				BusinessMessage msg = new BusinessMessage();
				msg.setLogCode(rset.getString(1));
				msg.setPlantCode(rset.getString(2));
				msg.setBusinessOperatingName(rset.getString(3));
				msg.setMessageCode(rset.getString(4));
				msg.setMessage(rset.getString(5));
				msg.setData(rset.getString(6));
				if(rset.getTimestamp(7) != null){
					msg.setCheckDate(
							new Date(rset.getTimestamp(7).getTime()));
				}
				if(rset.getTimestamp(8) != null){
					msg.setGenerateDate(
							new Date(rset.getTimestamp(8).getTime()));
				}
				msg.setUser(rset.getString(9));
				list.add(msg);
			}
			return list;

		}finally{
			if(rset != null){
				try{
					rset.close();
				}catch(Exception e){}
				rset = null;
			}
			if(stmt != null){
				try{
					stmt.close();
				}catch(Exception e){}
				stmt = null;
			}
		}
	}

	/**
	 * 業務メッセージを取得する。
	 * @throws SQLException
	 *          DBアクセス時に何らかの異常が発生した場合
	 */
	public ArrayList get(String plant, String user) throws SQLException
	{
		ArrayList list = new ArrayList(0);		// メッセージ格納用
		PreparedStatement stmt = null;			// ステートメント
		ResultSet rset = null;					// リザルトセット

		try{
			// 業務メッセージテーブル検索用のSQL作成
			stmt = (_connect.getConn()).prepareStatement(_selectPlantBusinessSql);
			stmt.setString(1, user);
			stmt.setString(2, plant);

			// SQL実行
			rset = stmt.executeQuery();

			// 結果を取得
			while(rset.next()){
				BusinessMessage msg = new BusinessMessage();
				msg.setLogCode(rset.getString(1));
				msg.setPlantCode(rset.getString(2));
				msg.setBusinessOperatingName(rset.getString(3));
				msg.setMessageCode(rset.getString(4));
				msg.setMessage(rset.getString(5));
				msg.setData(rset.getString(6));
				if(rset.getTimestamp(7) != null){
					msg.setCheckDate(
							new Date(rset.getTimestamp(7).getTime()));
				}
				if(rset.getTimestamp(8) != null){
					msg.setGenerateDate(
							new Date(rset.getTimestamp(8).getTime()));
				}
				msg.setUser(rset.getString(9));
				list.add(msg);
			}
			return list;

		}finally{
			if(rset != null){
				try{
					rset.close();
				}catch(Exception e){}
				rset = null;
			}
			if(stmt != null){
				try{
					stmt.close();
				}catch(Exception e){}
				stmt = null;
			}
		}
	}

	/**
	 * 業務メッセージを確認する。
	 * @throws SQLException
	 *          DBアクセス時に何らかの異常が発生した場合
	 */
	public void confirm(String logcd, String plant, String user) throws SQLException
	{
		PreparedStatement stmt = null;			// ステートメント

		try{
			// 業務メッセージテーブル確認用のSQL作成
			stmt = (_connect.getConn()).prepareStatement(_updateBusinessSql);
			// stmt.setTimestamp(1, new Timestamp(System.currentTimeMillis()));
			stmt.setString(1, user);
			stmt.setString(2, logcd);
			stmt.setString(3, plant);

			// SQL実行
			stmt.executeQuery();

		}finally{
			if(stmt != null){
				try{
					stmt.close();
				}catch(Exception e){}
				stmt = null;
			}
		}
	}

	/**
	 * 業務メッセージを確認する。
	 * @throws SQLException
	 *          DBアクセス時に何らかの異常が発生した場合
	 */
	public void confirmAll(String plant, String user) throws SQLException
	{
		PreparedStatement stmt = null;			// ステートメント

		try{
			// 業務メッセージテーブル確認用のSQL作成
			stmt = (_connect.getConn()).prepareStatement(_updateAllBusinessSql);
			// stmt.setTimestamp(1, new Timestamp(System.currentTimeMillis()));
			stmt.setString(1, user);
			stmt.setString(2, plant);

			// SQL実行
			stmt.executeQuery();

		}finally{
			if(stmt != null){
				try{
					stmt.close();
				}catch(Exception e){}
				stmt = null;
			}
		}
	}

	/**
	 * 業務メッセージを削除する。
	 * @throws SQLException
	 *          DBアクセス時に何らかの異常が発生した場合
	 */
	public void delete(String logcd, String plant, String user) throws SQLException
	{
		PreparedStatement stmt = null;			// ステートメント

		try{
			// 業務メッセージテーブル確認用のSQL作成
			stmt = (_connect.getConn()).prepareStatement(_deleteBusinessSql);
			stmt.setString(1, user);
			stmt.setString(2, logcd);
			stmt.setString(3, plant);

			// SQL実行
			stmt.executeQuery();

		}finally{
			if(stmt != null){
				try{
					stmt.close();
				}catch(Exception e){}
				stmt = null;
			}
		}
	}

	/**
	 * 業務メッセージを削除する。
	 * @throws SQLException
	 *          DBアクセス時に何らかの異常が発生した場合
	 */
	public void deleteAll(String plant, String user) throws SQLException
	{
		PreparedStatement stmt = null;			// ステートメント

		try{
			// 業務メッセージテーブル確認用のSQL作成
			stmt = (_connect.getConn()).prepareStatement(_deleteAllBusinessSql);
			stmt.setString(1, user);
			stmt.setString(2, plant);

			// SQL実行
			stmt.executeQuery();

		}finally{
			if(stmt != null){
				try{
					stmt.close();
				}catch(Exception e){}
				stmt = null;
			}
		}
	}

	/**
	 * 一定期間を経過した業務メッセージを削除する。
	 * @throws SQLException
	 *          DBアクセス時に何らかの異常が発生した場合
	 * @throws BusinessMessageException
	 *          保持期間テーブルに業務メッセージ保持期間レコードが
     *          存在しない場合
	 */
	public void cleanup() throws SQLException, BusinessMessageException
	{
		PreparedStatement getDataStatment = null;
		PreparedStatement deleteDataStatment = null;
		ResultSet resultData = null;

		try {
			// 保持期間テーブル検索用のSQL作成
			getDataStatment =
					_connect.getConn().prepareStatement(_getPeriodSql);
			// SQL発行
			resultData = getDataStatment.executeQuery();

			if (resultData.next() == true) {
				// 業務メッセージテーブル削除用のSQL作成
				deleteDataStatment =
						_connect.getConn().prepareStatement(_cleanUpSql);

				deleteDataStatment.setInt(1, resultData.getInt(1));
				deleteDataStatment.setTimestamp(
						2, new java.sql.Timestamp(System.currentTimeMillis()));

				// SQL発行
				deleteDataStatment.executeUpdate();

			} else {
				throw new BusinessMessageException();
			}
		} finally {
			if (getDataStatment != null) {
				try {
					getDataStatment.close();
				} catch (SQLException e) {}
			}
			if (resultData != null){
				try{
					resultData.close();
				}catch(Exception e){
					e.printStackTrace();
				}
				resultData = null;
			}
			if (deleteDataStatment != null){
				try{
					deleteDataStatment.close();
				}catch(Exception e){
					e.printStackTrace();
				}
				deleteDataStatment = null;
			}
		}
	}

	/** コネクション */
	private IDbConnection _connect = null;

	/** 業務メッセージ定義テーブル--検索用のSQL */
	private String _getMessageSql =
			"select MSG from SYS_BUSINESS_MESSAGE where MSG_CD = ?";

	/** 業務メッセージテーブル--追加用のSQL */
	private String _insertSql =
			"insert into SYS_MSG_LOG " +
			"(LOG_CD," +
			" PLANT_CD," +
			" BUSINESS_NAME," +
			" MSG_CD," +
			" MSG," +
			" DATA_STRING," +
			" CONFIRM_DATE," +
			" CREATED_DATE," +
			" CREATED_BY," +
			" CREATED_PRG_NM," +
			" UPDATED_DATE," +
			" UPDATED_BY," +
			" UPDATED_PRG_NM) " +
			"values" +
			"(?, ?, ?, ?, ?, ?, NULL," +
			" sysdate, ?, 'BusinessMessage', sysdate," +
			" 'SYSTEM', 'BusinessMessage')";

	/** 業務メッセージテーブル--検索用のSQL */
	private String _selectBusinessSql =
			"select " +
				"LOG_CD," +
				"PLANT_CD," +
				"BUSINESS_NAME," +
				"MSG_CD," +
				"MSG," +
				"DATA_STRING," +
				"CONFIRM_DATE," +
				"CREATED_DATE," +
				"CREATED_BY " +
			"from " +
				"SYS_MSG_LOG " +
			"where " +
				"PLANT_CD = ? " +
			"order by " +
				"CREATED_DATE ASC";

	/** 業務メッセージテーブル--検索用のSQL */
	private String _selectPlantBusinessSql =
			"select " +
				"LOG_CD," +
				"PLANT_CD," +
				"BUSINESS_NAME," +
				"MSG_CD," +
				"MSG," +
				"DATA_STRING," +
				"CONFIRM_DATE," +
				"CREATED_DATE," +
				"CREATED_BY " +
			"from " +
				"SYS_MSG_LOG " +
			"where " +
				"CREATED_BY = ? and " +
				"PLANT_CD = ? " +
			"order by " +
				"CREATED_DATE ASC";

	/** 業務メッセージテーブル--更新用のSQL */
	private String _updateBusinessSql =
			"update " +
				"SYS_MSG_LOG " +
			"set " +
				"CONFIRM_DATE = sysdate, " +
				"UPDATED_DATE = sysdate, " +
				"UPDATED_BY = 'SYSTEM' " +
			"where " +
				"CREATED_BY = ? and " +
				"LOG_CD = ? and " +
				"PLANT_CD = ? and " +
				"CONFIRM_DATE is null";

	/** 業務メッセージテーブル--更新用のSQL */
	private String _updateAllBusinessSql =
			"update " +
				"SYS_MSG_LOG " +
			"set " +
				"CONFIRM_DATE = sysdate, " +
				"UPDATED_DATE = sysdate, " +
				"UPDATED_BY = 'SYSTEM' " +
			"where " +
				"CREATED_BY = ? and " +
				"PLANT_CD = ? and " +
				"CONFIRM_DATE is null";

	/** 業務メッセージテーブル--削除用のSQL */
	private String _deleteBusinessSql =
			"delete from " +
				"SYS_MSG_LOG " +
			"where " +
				"CREATED_BY = ? and " +
				"LOG_CD = ? and " +
				"PLANT_CD = ? and " +
				"NOT CONFIRM_DATE is null";

	/** 業務メッセージテーブル--削除用のSQL */
	private String _deleteAllBusinessSql =
			"delete from " +
				"SYS_MSG_LOG " +
			"where " +
				"CREATED_BY = ? and " +
				"PLANT_CD = ? and " +
				"NOT CONFIRM_DATE is null";

	/** 業務メッセージテーブル--削除用のSQL */
	private String _cleanUpSql =
			"delete from SYS_MSG_LOG where " +
			"ADD_MONTHS(CREATED_DATE, ?) < ?";

	/** 保持期間テーブル--検索用のSQL */
	private String _getPeriodSql =
			"select MNT_PERIOD from SYS_MNT_PERIOD " +
			"where MNT_DATA_TYP = 6";

}
