//------------------------------------------------------------------------------
// (#)BusinessLockManager.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/06/04 新規作成 K.Matsumoto
// 2003/06/09 業務ロック解除時の解除キーインクリメントを廃止 K.Matsumoto
// 2003/06/24 OrteusStudioバージョンアップに伴う修正 Y.Inada
//			  前：doConnection[ver1.00.03]
//			  後：IDbConnection[ver1.00.05]
// 2003/06/25 Copyrightの記述修正 Y.Inada
//			  前：Copyright (c) 2003 NEC informatec Systems,Ltd.
//			  後：Copyright (c) 2003 NEC Informatec Systems,Ltd.
//			  JavaDoc用コメントの体裁を整える
// 2003/07/01 ロック状況テーブルの列名を修正 K.Matsumoto
//			  誤：user_name
//			  正：user_cd
//			  ロック組み合わせテーブルの列名を修正 K.Matsumoto
//			  誤：mode_form_name
//			  正：mode_form_to_name
// 2003/07/28 全工場に対して業務ロック実施/解除を行うメソッドを追加
// 2003/08/01 引数名を変更	(旧) userName  (新) userCode
//			  上記に伴い内部変数名変更	(旧) _userName	(新)userCode
//			  業務ロック解除, 全工場業務ロック解除の引数説明 誤記修正
//				(誤) userName  (正) businessName
// 2003/10/03 M.Isoda
//			  SYS_LOCK_STATUSテーブルの項目追加に伴う変更
//				パッケージ名称定義メンバ追加
//				_isStatusSql、_addStatusSql、_removeStatusSqlの変更
//				lockingメソッドをlock,unlockメソッドに分けておこなうように変更
// 2003/10/08 K.Shiraki
//            ロック処理で 定義テーブルの工場区分を判定し 工場毎/全工場の
//            ロック状況を登録するよう変更
//            ロック解除時のキー変更 工場/ユーザ/解除キー→解除キー
//            DBとのコネクションを保持する型はコンストラクタで受けた型に修正
//
//==============================================================================
//
// 2004/06/08 isExclusive() ロック処理中かの判断ロジックを変更
//　　　　　　ロック処理中でない場合にSYS_LOCK_EXCLUSIVEをロック取得できるように
//            doUnLock() トランザクション制御を追加
//
// 2004/06/19 isExclusive() ロック処理中かの判断ロジックを変更
//              free,lockedのステータス廃止、Oracleのロックのみで判断する。
//              これに伴い不要となるメソッド(modExclusive)を廃止。
//            UnLock時は排他制御をしない。
//            doLockの異常発生時後処理を見直し
//
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.util.BusinessLock;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;

//--------------------------
import java.util.Date;
import java.text.DateFormat;
//--------------------------

/**
 * 業務ロックを実行する。
 *
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.7 $ $Date: 2013/06/27 03:45:54 $
 */
class BusinessLockManager
{
	/** ロック定義の工場区分:自工場のみ */
	private final static int _OWN_PLANT_ONLY = 1;
	/** ロック定義の工場区分:全工場 */
	private final static int _ALL_PLANT = 2;

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
	
	/** 排他ロックテーブルに業務ロック処理中かどうか問い合わせるSQL */
	private String _isExclusiveSql =
		"select lock_status " +
		"from sys_lock_exclusive " +
		"where " +
			"ctrl_cd = 'SYSTEM' " +
			"for update nowait";

	/** ロック状況テーブルからロック中かどうか問い合わせるSQL */
	private String _isStatusSql =
		"select mode_form_to_name " +
		"from sys_lock_status " +
		"where " +
			"MODE_FORM_TO_NAME = ? and " +
			"plant_cd = ?";

	/** 排他ロックテーブルから業務ロック解除キーを取得するSQL */
	private String _getDescSql =
		"select lock_descriptor " +
		"from sys_lock_exclusive " +
		"where ctrl_cd = 'SYSTEM'";
	
	/** 排他ロックテーブルに業務ロック解除処理中である旨を示し、同時に業務ロック解除キーを取得するSQL */
	private String _unlockAndGetDescriptorSql =
		"select lock_descriptor " +
		"from sys_lock_exclusive " +
		"where ctrl_cd = 'SYSTEM' " +
		"for update wait 5 ";
	
	/** 排他ロックテーブルの業務ロック解除キーを更新するSQL */
	private String _modDescSql =
		"update sys_lock_exclusive " +
		"set lock_descriptor = ? " +
		"where ctrl_cd = 'SYSTEM'";
	
	/** ロック組み合わせテーブルからロックする業務名/対象工場区分を取得するSQL */
	private String _getLockedNameSql =
		"select mode_form_to_name, target_plant_typ " +
		"from sys_business_lock " +
		"where mode_form_from_name = ?";

	/** ロック状況テーブルにロックを掛ける業務を追加するSQL */
	private String _addStatusSql =
		"insert into sys_lock_status ( " +
			"MODE_FORM_TO_NAME, " +
			"plant_cd, " +
			"cancel_cd, " +
			"user_cd, " +
			"MODE_FORM_FROM_NAME, " +
			"created_by, " +
			"created_prg_nm, " +
			"updated_by, " +
			"updated_prg_nm) " +
			"values(?, ?, ?, ?,  ?,?,?,?,?)";

	/** ロック状況テーブルからロックが掛かっている業務を消すSQL */
	private String _removeStatusSql =
		"delete sys_lock_status " +
		"where cancel_cd = ?";

	/** 工場マスタから工場コードを取得するSQL */
	private String _getPlantCodeSql =
		"select plant_cd " +
		"from m_plant " +
		"order by plant_cd";

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
		//_conn = conn.getConn();
		_userCode = userCode;
		_plantCode = plantCode;
	}

	/**
	 * 業務ロックの実行。
	 *
	 * @param businessName ロックする業務名
	 * @return 解除キーとなる識別子。失敗したら-1。業務定義テーブルに定義がないときは-2。
	 */
	// ロック済み判定NGのとき 排他テーブルをフリーにする処理追加
	// ロック状況テーブルの読込処理追加
	// 全工場コード読込処理追加
	// DBアクセスの自動コミット状態の設定処理 追加
	int doLock(String businessName){
		int lockDescriptor = -1; // 解除キー
		boolean orgCommit;
		PreparedStatement getLockNameStmt = null; // ロック対象の業務名を取得
		ResultSet getLockNameRslt = null;  // ロック対象の業務名の取得結果

System.err.print(DateFormat.getDateTimeInstance().format(new Date()));
System.err.println(" Lock >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>【" + businessName + ":" + _userCode + "】");
		try{
			// コミットタイミングの設定
			orgCommit = _conn.getConn().getAutoCommit();
			_conn.getConn().setAutoCommit(false);
		} catch (Exception e) {
System.err.println(e.toString());
System.err.print(DateFormat.getDateTimeInstance().format(new Date()));
System.err.println(" Lock >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>:Exception 1【" + businessName + ":" + _userCode + "】");
			return -1;
		}
		try{
			
			// 業務ロック定義テーブルを読込
			// ロック定義テーブルの内容を読込
			getLockNameStmt =_conn.getConn().prepareStatement(_getLockedNameSql);
			getLockNameStmt.setString(1, businessName);
			getLockNameRslt = getLockNameStmt.executeQuery();
			if ( getLockNameRslt.next() == false ) {
				return -2;
			}
			// ロック処理中なら 処理なし終了
			if(this.isExclusive() == false){

				// 業務ロック済み判定
				if(this.isLocking(businessName) == false){
					// 解除キー取得
					lockDescriptor = this.modDescriptor();

					if(lockDescriptor != -1){
System.err.println("   (SBM1205)Lock:解除キー:" + lockDescriptor + "【" + businessName + ":" + _userCode + "】");
						// 工場コード取得
						ArrayList plants = this.getAllPantCode();

						// 業務ロック実施
						do {
							String toBusiness = getLockNameRslt.getString(1);
							int target = getLockNameRslt.getInt(2);

							switch(target){
							case _OWN_PLANT_ONLY: // 自工場
								this.lock(businessName, _plantCode, toBusiness, lockDescriptor);
								break;
							case _ALL_PLANT: // 全工場
								for(int n = 0; n < plants.size(); n++)
									lock(businessName, (String)(plants.get(n)), toBusiness, lockDescriptor);
								break;
							}
						}while(getLockNameRslt.next() == true);
System.err.println("   (SBM1206)Lock:コミット");
						_conn.getConn().commit();
					}

				}
			}
		}catch(Exception e){
System.err.println(e.toString());
System.err.print(DateFormat.getDateTimeInstance().format(new Date()));
System.err.println(" Lock >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>:Exception 2【" + businessName + ":" + _userCode + "】");
			e.printStackTrace();
			lockDescriptor = -1;
		}finally{
			try {
System.err.println("   doLock:finally【" + businessName + ":" + _userCode + "】");
				// ロック処理終了
				_conn.getConn().rollback();
				_conn.getConn().setAutoCommit(orgCommit);

				if(getLockNameRslt!=null){
					this.closeResultSet(getLockNameRslt);
				}
				if(getLockNameStmt!=null){
					this.closePreparedStatement(getLockNameStmt);
				}
			} catch (SQLException e) {
System.err.println("   doLock:finally exceptoin【" + businessName + ":" + _userCode + "】");
				// SQLExceptionを無視
			}
		}
System.err.print(DateFormat.getDateTimeInstance().format(new Date()));
System.err.println(" Lock >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>:Normal End【" + businessName + ":" + _userCode + "】");
		return lockDescriptor;
	}

	/**
	 * 全工場に業務ロックの実行。
	 * このAPIは暫定対処で残していますが 近い将来削除します。
	 *
	 * @param businessName ロックする業務名
	 * @return 解除キーとなる識別子
	 */
	int doLockAll(String businessName)
	{
		int lockDescriptor = -1; // 解除キー

System.err.print(DateFormat.getDateTimeInstance().format(new Date()));
System.err.println(" ***** LockAll >>>>>>>>>>>>>>>>>>【" + businessName + ":" + _userCode + "】");
		try {

			// ロック処理中判定
			if (this.isExclusive() == false) {
				try {
					// ロック処理開始
					_conn.getConn().setAutoCommit(false);

					// 解除キー更新
					if ((lockDescriptor = this.modDescriptor()) == -1) {
						return -1;
					}

					// 全工場コード取得
					ArrayList list = this.getAllPantCode();
					for (int i = 0; i < list.size(); i++) {
						_plantCode = (String)list.get(i);
						// 業務ロック済み判定 true:locked false:unlocked
						if (this.isLocking(businessName) == false) {
							// 非ロック中：業務ロック実施
							this.lockall(businessName, lockDescriptor);
						}else{
							// 業務ロック中
							_conn.getConn().rollback();

							return -1;
						}
					}

					_conn.getConn().commit();

				} finally {
					// ロック処理終了
					_conn.getConn().commit();
					_conn.getConn().setAutoCommit(true);
				}
			}

		} catch (Exception e) {
			// 例外発生時は-1を返却
			lockDescriptor = -1;

			try {
				_conn.getConn().rollback();
			} catch (SQLException exception) {
			}
		}
System.err.print(DateFormat.getDateTimeInstance().format(new Date()));
System.err.println(" LockAll Normal End【" + businessName + ":" + _userCode + "】");
		return lockDescriptor;
	}


	/**
	 * 業務ロックの解除。
	 *
	 * @param businessName ロック／アンロックする業務名
	 * @param descriptor ロック時に渡された解除キー
	 * @return 実施した処理の結果正常／異常
	 */
	 // History 2003/06/09 解除キーのインクリメント処理を削除 K.Matsumoto
	boolean doUnLock(String businessName, int descriptor)
	{
		boolean result = false; 	// 処理結果
		boolean autoCommitState;	// 自動コミット状態

System.err.print(DateFormat.getDateTimeInstance().format(new Date()));
System.err.println(" <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< UnLock【" + businessName + ":" + _userCode + "】");
		try {
			// 自動コミットを抑止
			autoCommitState = _conn.getConn().getAutoCommit();
			_conn.getConn().setAutoCommit(false);
		} catch (Exception e) {
System.err.println(e.toString());
System.err.print(DateFormat.getDateTimeInstance().format(new Date()));
System.err.println(" <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< UnLock:Exception 1【" + businessName + ":" + _userCode + "】");
			return false;
		}
		try {
			// 業務ロック処理の排他制御を開始
			if (this.unlockAndGetDescriptor() == -1) {
				return false;
			}
			try {
				// ロック処理開始
				this.unlock(descriptor);
				result = true;
			} finally {
				// ロック処理終了
				_conn.getConn().commit();
			}
		} catch (Exception e) {
System.err.println(e.toString());
System.err.print(DateFormat.getDateTimeInstance().format(new Date()));
System.err.println(" <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< UnLock:Exception 2【" + businessName + ":" + _userCode + "】");
			// 例外発生時はfalseを返却
			result = false;
		} finally {
System.err.println("   doUnLock:finally 1【" + businessName + ":" + _userCode + "】");
			try {
				// 業務ロック処理の排他制御を解除＆自動コミット状態を復旧
				_conn.getConn().rollback();
				_conn.getConn().setAutoCommit(autoCommitState);
			} catch (SQLException e) {
System.err.println(e.toString());
System.err.print(DateFormat.getDateTimeInstance().format(new Date()));
System.err.println(" <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< UnLock:Exception 3【" + businessName + ":" + _userCode + "】");
				// SQLExceptionを無視
			}
		}
System.err.print(DateFormat.getDateTimeInstance().format(new Date()));
System.err.println(" <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< UnLock Normal End【" + businessName + ":" + _userCode + "】");
		return result;
	}

	/**
	 * 全工場に業務ロックの解除。
	 * このAPIは暫定対処で残していますが 近い将来削除します。
	 *
	 * @param businessName ロック／アンロックする業務名
	 * @param descriptor ロック時に渡された解除キー
	 * @return 実施した処理の結果正常／異常
	 */
	 // History 2003/06/09 解除キーのインクリメント処理を削除 K.Matsumoto
	 // 2003/10/07 暫定対処対応として 内容をdoUnLockを呼ぶだけに変更  K.Shiraki
	boolean doUnLockAll(String businessName, int descriptor)
	{
System.err.print(DateFormat.getDateTimeInstance().format(new Date()));
System.err.println(" <<<<<<<<<<<<<<<<<< UnLockALL ****** 【" + businessName + ":" + _userCode + "】");
		return doUnLock(businessName, descriptor);
	}
	/**
	 * 全工場コードを取得する。
	 *
	 * @return 工場コードのリスト
	 * @throws SQLException
	 */
	private ArrayList getAllPantCode() throws SQLException {
		PreparedStatement isPlantCodeStmt = null; // 工場コードを取得
		ResultSet isPlantCodeRslt = null;		  // 取得した結果
		ArrayList list = new ArrayList();

		try {
			// 全工場コードを取得する
			isPlantCodeStmt = _conn.getConn().prepareStatement(_getPlantCodeSql);
			isPlantCodeRslt = isPlantCodeStmt.executeQuery();
			while (isPlantCodeRslt.next() == true) {
				list.add(isPlantCodeRslt.getString(1));
			}
		} finally {
			this.closePreparedStatement(isPlantCodeStmt);
			this.closeResultSet(isPlantCodeRslt);
		}
		return list;
	}
	/**
	 * ロック処理中かどうか問い合わせる。
	 *
	 * @return ロック中/true、解除中/false
	 * @throws SQLException
	 */
	private boolean isExclusive() throws SQLException {
		PreparedStatement isExclusiveStmt = null; // ロック処理中か問う
		ResultSet isExclusiveRslt = null;		  // 問い合わせ結果

		try {
System.err.println("     isExclusive");
			// 排他ロックテーブルに対してロック処理中か問い合わせる
			isExclusiveStmt = _conn.getConn().prepareStatement(_isExclusiveSql);
			isExclusiveRslt = isExclusiveStmt.executeQuery();
			if (isExclusiveRslt.next() == true) {
System.err.println("     (SBM1207)isExclusive:false(Lock中でない)");
				return false;
			} else {
System.err.println("     (SBM1208)isExclusive:true(Lock中)");
				return true;
			}
		} finally {
System.err.println("     (SBM1209)isExclusive:finally(掃除)");
			this.closePreparedStatement(isExclusiveStmt);
			this.closeResultSet(isExclusiveRslt);
		}
	}

	/**
	 * 業務ロック中かどうか問い合わせる。
	 *
	 * @param businessName
	 */
	private boolean isLocking(String businessName) throws SQLException {
		PreparedStatement isStatusStmt = null; // 業務ロックされているか
		ResultSet isStatusRslt = null;		   // 業務ロックされているか結果

		try {
System.err.println("     isLocking");
			// ロック状況テーブルに対して自業務が業務ロック中か問い合わせる
			isStatusStmt = _conn.getConn().prepareStatement(_isStatusSql);
			isStatusStmt.setString(1, businessName);
			isStatusStmt.setString(2, _plantCode);
			isStatusRslt = isStatusStmt.executeQuery();

			if (isStatusRslt.next() == true) {
System.err.println("     (SBM1210)isLocking:true(Lock中)");
				return true;
			} else {
System.err.println("     (SBM1211)isLocking:false(Lock中でない)");
				return false;
			}
		} finally {
			this.closeResultSet(isStatusRslt);
			this.closePreparedStatement(isStatusStmt);
		}
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
	 * ロック解除キーをインクリメントする。
	 * ロック解除キーが取得できなかった場合は-1を返却する。
	 *
	 * @return ロック解除キー
	 * @throws SQLException
	 */
	private int modDescriptor() throws SQLException
	{
		PreparedStatement getDescStmt = null; // ロック解除キーを取得
		PreparedStatement modDescStmt = null; // ロック解除キーを更新
		ResultSet getDescRslt = null;	// 業務ロックの解除キー取得結果
		int descriptor 	  = -1;			// 業務ロックの解除キー
		int moddescriptor = -1;			// 更新する解除キー

		try {
System.err.println("     modDescriptor");
			// 排他ロックテーブルから業務ロック解除キーを取得する
			getDescStmt = _conn.getConn().prepareStatement(_getDescSql);
			getDescRslt = getDescStmt.executeQuery();

			// 業務ロック解除キーを退避する。
			// 取得できていなければ-1を返却
			if (getDescRslt.next() == true) {
				descriptor = getDescRslt.getInt(1);
			} else {
				return descriptor;
			}
			moddescriptor = descriptor;
			if (moddescriptor >= 99999999) {
				moddescriptor = 1;
			} else {
				moddescriptor++;
			}
			// 排他ロックテーブルの解除キーを更新する
			modDescStmt = _conn.getConn().prepareStatement(_modDescSql);
			modDescStmt.setInt(1, moddescriptor);
			modDescStmt.executeUpdate();
			return descriptor;
		} finally {
			this.closeResultSet(getDescRslt);
			this.closePreparedStatement(getDescStmt);
			this.closePreparedStatement(modDescStmt);
		}
	}

	/**
	 * 業務ロック処理の実施を行う。
	 *
	 * @param businessName 業務名
	 * @param toPlant 工場コード
	 * @param toName ロックされる業務名
	 * @param descriptor 解除キー
	 */
	private void lock(String businessName,
					  String toPlant, String toName,
					  int descriptor) throws SQLException {
		PreparedStatement lockingStmt = null;

		try {
System.err.print("lock");
			// 業務ロック処理のSQLを組み立てる
			lockingStmt = _conn.getConn().prepareStatement(_addStatusSql);
			lockingStmt.setString(1, toName);
			lockingStmt.setString(2, toPlant);	// 工場コード
			lockingStmt.setInt(3, descriptor);		// 解除キー
			lockingStmt.setString(4, _userCode);	// ユーザ名
			lockingStmt.setString(5, businessName);	// 業務名（ロックする側）
			lockingStmt.setString(6, _userCode);	// ユーザ名
			lockingStmt.setString(7, _packageName);	// 業務名としてパッケージ名を設定
			lockingStmt.setString(8, _userCode);	// ユーザ名
			lockingStmt.setString(9, _packageName);	// 業務名としてパッケージ名を設定

			lockingStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(lockingStmt);
		}
	}
	/**
	 * 業務ロック処理の実施を行う。 ** 全工場用 / 暫定処置 **
	 * このAPIは暫定対処のため 作成しましたが 近い将来削除します。
	 *
	 * @param businessName 業務名
	 * @param descriptor 解除キー
	 */
	private void lockall(String businessName,
					  int descriptor) throws SQLException {
		PreparedStatement getLockNameStmt = null; // ロック対象の業務名を取得
		PreparedStatement lockingStmt = null; // 業務ロックを解除する
		ResultSet getLockNameRslt = null;	  // ロック対象の業務名の取得結果

		try {
System.err.println("     lockall ***** ");
			// ロック対象の業務名を取得
			getLockNameStmt =
				 _conn.getConn().prepareStatement(_getLockedNameSql);
			getLockNameStmt.setString(1, businessName);
			getLockNameRslt = getLockNameStmt.executeQuery();

			// 業務ロック処理のSQLを組み立てる
			lockingStmt = _conn.getConn().prepareStatement(_addStatusSql);
			lockingStmt.setString(2, _plantCode);	// 工場コード
			lockingStmt.setInt(3, descriptor);		// 解除キー
			lockingStmt.setString(4, _userCode);	// ユーザ名
			lockingStmt.setString(5, businessName);	// 業務名（ロックする側）
			lockingStmt.setString(6, _userCode);	// ユーザ名
			lockingStmt.setString(7, _packageName);	// 業務名としてパッケージ名を設定
			lockingStmt.setString(8, _userCode);	// ユーザ名
			lockingStmt.setString(9, _packageName);	// 業務名としてパッケージ名を設定

			// 取得したロック対象の業務のロック処理を行う
			while (getLockNameRslt.next() == true) {
				lockingStmt.setString(1, getLockNameRslt.getString(1));
				lockingStmt.executeUpdate();
			}
		} finally {
			this.closeResultSet(getLockNameRslt);
			this.closePreparedStatement(lockingStmt);
			this.closePreparedStatement(getLockNameStmt);
		}
	}

	/**
	 * 業務ロック処理の解除を行う。
	 *
	 * @param businessName 業務名
	 * @param descriptor 解除キー
	 */
	// 2003/10/07 ロック定義テーブルの内容を参照して解除するのではなく
	//            解除キーのレコード全削除  K.Shiraki
	private void unlock(int descriptor) throws SQLException
	{
		PreparedStatement lockingStmt = null; // 業務ロックを解除する

		try {
System.err.println("     unlock(" + descriptor + ")");
			// 業務ロック処理のSQLを組み立てる
			lockingStmt = _conn.getConn().prepareStatement(_removeStatusSql);
			lockingStmt.setInt(1, descriptor);
			lockingStmt.executeUpdate();
		}
		finally {
			this.closePreparedStatement(lockingStmt);
		}
	}

	/**
	 * プリペアドステートメントを閉じる。
	 *
	 * @param statement 閉じる対象のステートメント
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
	 * リザルトセットを閉じる。
	 *
	 * @param resultset 閉じる対象のリザルトセット
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