/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/businesslock/BusinessLockManager.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.businesslock;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;

/**
 * 業務ロックを実行する。 
 *
 * @author $Author: tai-yanhong $
 * @version $Revision: 1.9 $ $Date: 2012/04/07 07:14:38 $
 */
class BusinessLockManager
{
	/** 業務ロック定義の工場区分:自工場のみ */
	private final static int OWN_PLANT_ONLY = 1;
	/** 業務ロック定義の工場区分:全工場 */
	private final static int ALL_PLANT = 2;
	/** 最大業務ロック解除キー値 */
	private final static int MAX_LOCK_DESCRIPTOR = 99999999;
	/** DBとのコネクション */
	private IDbConnection _conn = null;
	/** ユーザコード */
	private String _userCode  = null;
	/** 工場コード */
	private String _plantCode = null;
	/** パッケージ名 */
	private final static String _packageName = "BusinessLockManager";
	/** 業務ロック情報 */
	private List _lockingInfoList = null;

	/** 排他ロックテーブルに業務ロック実行処理中である旨を示し、同時に業務ロック解除キーを取得するSQL */
	private String _lockAndGetDescriptorSql =
		"select lock_descriptor " +
		"from sys_lock_exclusive " +
		"where ctrl_cd = 'SYSTEM' " +
		"for update wait 5 ";
	
	/** 排他ロックテーブルに業務ロック解除処理中である旨を示し、同時に業務ロック解除キーを取得するSQL */
	private String _unlockAndGetDescriptorSql =
		"select lock_descriptor " +
		"from sys_lock_exclusive " +
		"where ctrl_cd = 'SYSTEM' " +
		"for update wait 5 ";

	/** ロック状況テーブルからロック中かどうか問い合わせるSQL */
	private String _isLockingSql =
		"select distinct " +
			"m_plant.plant_name as plant_name, " +
			"user_mst.user_name as user_name, " +
			"to_char(sys_lock_status.created_date, 'YYYY/MM/DD HH24:MI:SS') as created_date, " +
			"nvl(sys_objects.program_name, sys_lock_status.mode_form_from_name) as mode_form_from_name " +
		"from m_plant, user_mst, sys_objects, sys_lock_status " +
		"where sys_lock_status.mode_form_to_name = ? " +
			"and sys_lock_status.plant_cd = ? " +
			"and m_plant.plant_cd = user_mst.plant_cd " +
			"and user_mst.user_cd = sys_lock_status.user_cd " +
			"and sys_objects.program_cd(+) = sys_lock_status.mode_form_from_name ";

	/** 排他ロックテーブルの業務ロック解除キーを更新するSQL */
	private String _incrementDescriptorSql =
		"update sys_lock_exclusive " +
		"set lock_descriptor = ? " +
		"where ctrl_cd = 'SYSTEM' ";

	/** ロック組合せテーブルからロックする業務名/対象工場区分を取得するSQL */
	private String _getLockMatrixSql =
		"select mode_form_to_name, target_plant_typ " +
		"from sys_business_lock " +
		"where mode_form_from_name = ? ";

	/** ロック状況テーブルにロックする業務を追加するSQL */
	private String _addLockStateSql =
		"insert into sys_lock_status (" +
			"mode_form_to_name, " +
			"plant_cd, " +
			"cancel_cd, " +
			"user_cd, " +
			"mode_form_from_name, " +
			"created_by, " +
			"created_prg_nm, " +
			"updated_by, " +
			"updated_prg_nm) " +
			"values(?, ?, ?, ?, ?, ?, ?, ?, ?) ";

	/** ロック状況テーブルから業務ロックが掛かっている業務を消すSQL */
	private String _unlockSql =
		"delete sys_lock_status " +
		"where cancel_cd = ? ";

	/** 工場マスタから工場コードを取得するSQL */
	private String _getPlantCodeSql =
		"select plant_cd " +
		"from m_plant " +
		"order by plant_cd ";

	/**
	 * 業務ロック管理を構築します。
	 *
	 * @param conn DBアクセス用のコネクション
	 * @param userCode Orteusユーザ名
	 * @param planCode 工場コード
	 */
	BusinessLockManager(IDbConnection conn, String userCode, String plantCode)
	{
		_conn = conn;
		_userCode = userCode;
		_plantCode = plantCode;
	}

	/**
	 * 業務ロックを実行します。
	 *
	 * @param businessName ロック元業務名
	 * @return 業務ロック解除キーとなる識別子。失敗したら-1。業務定義テーブルに定義がないときは-2。
	 */
	int doLock(String businessName)
	{
		int descriptor = -1;		// 業務ロック解除キー
		boolean autoCommitState;	// 自動コミット状態
		try {
			// 自動コミットを抑止
			autoCommitState = _conn.getConn().getAutoCommit();
			_conn.getConn().setAutoCommit(false);
		} catch (Exception e) {
			return -1;
		}
		try {
			PreparedStatement stmt = null;	// ロック先業務名取得用
			ResultSet res = null;			// ロック先業務名取得結果
			try {
				// 業務ロック定義テーブルを読込
				stmt = _conn.getConn().prepareStatement(_getLockMatrixSql);
				stmt.setString(1, businessName);
				res = stmt.executeQuery();
				if ( res.next() == false ) {
					return -2;
				}
				// 業務ロック処理の排他制御を開始＆解除キーを取得
				descriptor = this.lockAndGetDescriptor();
				if (descriptor == -1) {
					return -1;
				}
				// 他の業務による業務ロック中を判定
				if (this.isLocking(businessName) == true) {
					return -1;
				}
				// 全工場コードを取得
				ArrayList plants = this.getAllPantCode();
				// 業務ロック解除キーの値を更新
				incrementDescriptor(descriptor);
				// 業務ロックを実行
				do {
					String toBusiness = res.getString(1);
					switch (res.getInt(2)) {
					case OWN_PLANT_ONLY:	// 自工場
						this.lock(businessName, _plantCode, toBusiness, descriptor);
						break;
					case ALL_PLANT:			// 全工場
						for (int i = 0; i < plants.size(); i++) {
							this.lock(businessName, (String)(plants.get(i)), toBusiness,
									descriptor);
						}
						break;
					}
				}while (res.next() == true);
				// 処理結果を確定（業務ロック処理の排他制御を解除）
				_conn.getConn().commit();
			} finally {
				this.closeResultSet(res);
				this.closePreparedStatement(stmt);
			}
		} catch (Exception e) {
			return -1;
		} finally {
			try {
				// 業務ロック処理の排他制御を解除＆自動コミット状態を復旧
				_conn.getConn().rollback();
				_conn.getConn().setAutoCommit(autoCommitState);
			} catch (SQLException e) {
				// SQLExceptionを無視
			}
		}
		return descriptor;
	}

	/**
	 * 業務ロックを解除します。
	 *
	 * @param businessName アンロックするロック元業務名
	 * @param descriptor 業務ロック解除キー
	 * @return 実行した処理の結果正常／異常
	 */
	boolean doUnLock(String businessName, int descriptor)
	{
		boolean autoCommitState;	// 自動コミット状態
		try {
			// 自動コミットを抑止
			autoCommitState = _conn.getConn().getAutoCommit();
			_conn.getConn().setAutoCommit(false);
		} catch (Exception e) {
			return false;
		}
		try {
			// 業務ロック処理の排他制御を開始
			if (this.unlockAndGetDescriptor() == -1) {
				return false;
			}
			// 業務ロックの解除
			this.unlock(descriptor);
			// 処理結果を確定（業務ロック処理の排他制御を解除）
			_conn.getConn().commit();
		} catch (Exception e) {
			return false;
		} finally {
			try {
				// 業務ロック処理の排他制御を解除＆自動コミット状態を復旧
				_conn.getConn().rollback();
				_conn.getConn().setAutoCommit(autoCommitState);
			} catch (SQLException e) {
				// SQLExceptionを無視
			}
		}
		return true;
	}

	/**
	 * 業務ロック情報を取得します。
	 *
	 * @return 業務ロック（エラー）情報
	 */
	List getLockingInfo()
	{
		return _lockingInfoList;
	}

	/**
	 * 全工場コードを取得します。
	 *
	 * @return 工場コードのリスト
	 * @throws SQLException
	 */
	private ArrayList getAllPantCode()
			throws SQLException
	{
		PreparedStatement stmt = null;		// 工場コード取得用SQL文
		ResultSet res = null;				// 取得した工場コード
		ArrayList plants = new ArrayList();	// 工場コード返却用リスト
		try {
			// 全工場コードを取得
			stmt = _conn.getConn().prepareStatement(_getPlantCodeSql);
			res = stmt.executeQuery();
			while (res.next() == true) {
				// 返却用リストに格納
				plants.add(res.getString(1));
			}
		} finally {
			this.closePreparedStatement(stmt);
			this.closeResultSet(res);
		}
		return plants;
	}

	/**
	 * 業務ロック実行処理の排他制御を設定し、業務ロック解除キーを返します。
	 * 既に業務ロック処理の排他制御中ならば、-1を返します。
	 *
	 * @return 業務ロック解除キー（成功時）／-1（失敗時）
	 * @throws SQLException
	 */
	private int lockAndGetDescriptor()
			throws SQLException
	{
		PreparedStatement stmt = null;	// 業務ロック処理開始用SQL
		ResultSet res = null;			// 業務ロック解除キーを含む処理結果
		int descriptor = -1;			// 業務ロック解除キー
		_lockingInfoList = null;
		try {
			// 排他ロックテーブルをロックし（業務ロック処理の排他制御）、業務ロック解除キーを取得
			stmt = _conn.getConn().prepareStatement(_lockAndGetDescriptorSql);
			res = stmt.executeQuery();
			if (res.next() == false) {
				return -1;
			}
			descriptor = res.getInt(1);
		} finally {
			this.closePreparedStatement(stmt);
			this.closeResultSet(res);
		}
		return descriptor;
	}

	/**
	 * 業務ロック解除処理の排他制御を設定し、業務ロック解除キーを返します。
	 * 既に業務ロック処理の排他制御中ならば、-1を返します。
	 *
	 * @return 業務ロック解除キー（成功時）／-1（失敗時）
	 * @throws SQLException
	 */
	private int unlockAndGetDescriptor()
			throws SQLException
	{
		PreparedStatement stmt = null;	// 業務ロック処理開始用SQL
		ResultSet res = null;			// 業務ロック解除キーを含む処理結果
		int descriptor = -1;			// 業務ロック解除キー
		_lockingInfoList = null;
		try {
			// 排他ロックテーブルをロックし（業務ロック処理の排他制御）、業務ロック解除キーを取得
			stmt = _conn.getConn().prepareStatement(_unlockAndGetDescriptorSql);
			res = stmt.executeQuery();
			if (res.next() == false) {
				return -1;
			}
			descriptor = res.getInt(1);
		} finally {
			this.closePreparedStatement(stmt);
			this.closeResultSet(res);
		}
		return descriptor;
	}
	
	/**
	 * 業務ロック中かどうか問い合わせます。
	 *
	 * @param businessName 問合せ対象の業務名
	 * @return true（業務ロック中）／false（業務ロックなし）
	 * @throws SQLException
	 */
	private boolean isLocking(String businessName)
			throws SQLException
	{
		PreparedStatement stmt = null;	// 業務ロック情報取得用SQL
		ResultSet res = null;			// 業務ロック情報取得結果
		try {
			// ロック状況テーブルに対して自業務が業務ロック中か問合せ
			stmt = _conn.getConn().prepareStatement(_isLockingSql);
			stmt.setString(1, businessName);
			stmt.setString(2, _plantCode);
			res = stmt.executeQuery();
			if (res.next() == false) {
				return false;
			}
			// 業務ロック情報を保存
			_lockingInfoList = new ArrayList();
			do {
				String info[] = new String[4];
				info[0] = res.getString(1);		// 工場名
				info[1] = res.getString(2);		// ユーザ名
				info[2] = res.getString(4);		// 業務名（業務ロック元の他業務）
				info[3] = res.getString(3);		// レコード生成時刻
				_lockingInfoList.add(info);
			} while (res.next() == true);
		} finally {
			this.closePreparedStatement(stmt);
			this.closeResultSet(res);
		}
		return true;
	}

	/**
	 * 業務ロック解除キーをインクリメントします。
	 * 業務ロック解除キーが取得できなかった場合は、-1を返却します。
	 *
	 * @param descriptor 業務ロック解除キー
	 * @throws SQLException
	 */
	private void incrementDescriptor(int descriptor)
			throws SQLException
	{
		PreparedStatement stmt = null;	// 業務ロック解除キー更新用SQL文
		try {
			int newDescriptor;
			if (descriptor >= MAX_LOCK_DESCRIPTOR) {
				newDescriptor = 1;
			} else {
				newDescriptor = descriptor + 1;
			}
			// 排他ロックテーブルの業務ロック解除キーを更新
			stmt = _conn.getConn().prepareStatement(_incrementDescriptorSql);
			stmt.setInt(1, newDescriptor);
			stmt.executeUpdate();
		} finally {
			this.closePreparedStatement(stmt);
		}
	}

	/**
	 * 業務ロックを実行します。
	 *
	 * @param businessName ロック元業務名
	 * @param toPlant 工場コード
	 * @param toName ロック先業務名
	 * @param descriptor 業務ロック解除キー
	 * @throws SQLException
	 */
	private void lock(String businessName, String toPlant, String toName, int descriptor)
			throws SQLException
	{
		PreparedStatement stmt = null;	// 業務ロック実行用SQL
		try {
			// 業務ロック実行
			stmt = _conn.getConn().prepareStatement(_addLockStateSql);
			stmt.setString(1, toName);			// ロック元業務名
			stmt.setString(2, toPlant);			// 工場コード
			stmt.setInt(3, descriptor);			// 業務ロック解除キー
			stmt.setString(4, _userCode);		// ユーザ名
			stmt.setString(5, businessName);	// ロック先業務名
			stmt.setString(6, _userCode);		// ユーザ名
			stmt.setString(7, _packageName);	// 業務名としてパッケージ名を設定
			stmt.setString(8, _userCode);		// ユーザ名
			stmt.setString(9, _packageName);	// 業務名としてパッケージ名を設定
			stmt.executeUpdate();
		} finally {
			this.closePreparedStatement(stmt);
		}
	}

	/**
	 * 業務ロックを解除します。
	 *
	 * @param descriptor 業務ロック解除キー
	 * @throws SQLException
	 */
	private void unlock(int descriptor)
			throws SQLException
	{
		PreparedStatement stmt = null;	// 業務ロック解除用SQL
		try {
			// 業務ロックを解除
			stmt = _conn.getConn().prepareStatement(_unlockSql);
			stmt.setInt(1, descriptor);
			stmt.executeUpdate();
		} finally {
			this.closePreparedStatement(stmt);
		}
	}

	/**
	 * プリペアドステートメントを閉じます。
	 *
	 * @param stmt 閉じる対象のステートメント
	 */
	private void closePreparedStatement(PreparedStatement stmt)
	{
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				// SQLExceptionを無視
			}
		}
	}

	/**
	 * リザルトセットを閉じます。
	 *
	 * @param res 閉じる対象のリザルトセット
	 */
	private void closeResultSet(ResultSet res)
	{
		if (res != null) {
			try {
				res.close();
			} catch (SQLException e) {
				// SQLExceptionを無視
			}
		}
	}
}
