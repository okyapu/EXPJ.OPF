//------------------------------------------------------------------------------
// (#)TranAppr.java
//
// Copyright (c) 2003 NES 済南.
//
// 2008/07/16 新規作成 wang-c
//
//
//------------------------------------------------------------------------------
package com.nec.jp.orteus.expj.tranappr;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.util.FoundationException;
import com.nec.jp.orteus.xaf.wa.DataObject;

/**
 * トラン承認依頼クラス
 * @author  wang-c
 * @version 1.00
 */
public class TranAppr extends DataObject{
	/** DBアクセス用のコネクション */
	private IDbConnection conn = null;

	/** ユーザコード */
	private String sysUserCd = null;
	/** 業務ID */
	private String sysBusinessId = null;


	/** 承認ID */
	private String _getApprIdSql = "SELECT SEQ_TRAN_APR_ID.NEXTVAL FROM DUAL";
	/** トラン承認依頼の登録 */
	private String insertTranAprSql =
		"insert into "
			+ "  T_TRAN_APR "
			+ "  ( "
			+ "    APPR_ID, "
			+ "    SCREEN_URL, "
			+ "    PROC_TYP, "
			+ "    APPR_REMARKS, "
			+ "    STATUS, "
			+ "    REQUEST_BY, "
			+ "    REQUEST_DATE, "
			+ "    CREATED_DATE, "
			+ "    CREATED_BY, "
			+ "    CREATED_PRG_NM, "
			+ "    UPDATED_DATE, "
			+ "    UPDATED_BY, "
			+ "    UPDATED_PRG_NM, "
			+ "    MODIFY_COUNT "
			+ "  ) "
			+ "values "
			+ "  ( "
			+ "    ?, "
			+ "    ?, "
			+ "    to_number(?), "
			+ "    ?, "
			+ "    to_number(?), "
			+ "    ?, "
			+ "    ?, "
			+ "    sysdate, "
			+ "    ?, "
			+ "    ?, "
			+ "    sysdate, "
			+ "    ?, "
			+ "    ?, "
			+ "    0 "
			+ "  ) ";
	/** トラン承認依頼の更新 */
	private String updateTranAprSql =
			"update "
			+ "  T_TRAN_APR "
			+ "set "
			+ "  STATUS = ?, "
			+ "  RESERVE_CAUSE = ?, "
			+ "  APPR_BY = ?, "
			+ "  UPDATED_DATE = sysdate, "
			+ "  UPDATED_BY = ?, "
			+ "  UPDATED_PRG_NM = ?, "
			+ "  MODIFY_COUNT = (T_TRAN_APR.MODIFY_COUNT + 1) "
			+ "where "
			+ "  T_TRAN_APR.APPR_ID = ? ";
	/** トラン承認依頼の削除 */
	private String deleteTranAprSql =
			"delete from "
			+ "  T_TRAN_APR "
			+ "where "
			+ "  T_TRAN_APR.APPR_ID = ? ";
	

	/** トラン画面データの登録 */
	private String insertTranSrcSql =
		"insert into "
			+ "  T_TRAN_SRC "
			+ "  ( "
			+ "    APPR_ID, "
			+ "    FIELD_NAME, "
			+ "    FIELD_VALUE, "
			+ "    FIELD_FLG, "
			+ "    CREATED_DATE, "
			+ "    CREATED_BY, "
			+ "    CREATED_PRG_NM, "
			+ "    UPDATED_DATE, "
			+ "    UPDATED_BY, "
			+ "    UPDATED_PRG_NM, "
			+ "    MODIFY_COUNT "
			+ "  ) "
			+ "values "
			+ "  ( "
			+ "    ?, "
			+ "    ?, "
			+ "    ?, "
			+ "    to_number(?), "
			+ "    sysdate, "
			+ "    ?, "
			+ "    ?, "
			+ "    sysdate, "
			+ "    ?, "
			+ "    ?, "
			+ "    0 "
			+ "  ) ";
	/** トラン画面データの削除 */
	private String deleteTranSrcSql =
			"delete from "
			+ "  T_TRAN_SRC "
			+ "where "
			+ "  T_TRAN_SRC.APPR_ID = ? ";
	
	/** トラン画面データキー値存在のチェック */
	private String checkTranSrcSql =
			"select *  from "
			+ "  T_TRAN_SRC "
			+ "where "
			+ "  T_TRAN_SRC.FIELD_NAME = ? "
	        + "and " 
	        + " T_TRAN_SRC.FIELD_VALUE = ? ";

	/** トラン画面データキー値存在のチェック */
	private String checkTranSrcSqlUNCNFM =
			"select *  from "
			+ "  T_TRAN_SRC "
			+ "where "
			+ "  T_TRAN_SRC.FIELD_NAME = ? "
	        + "and " 
	        + " T_TRAN_SRC.FIELD_VALUE = ? ";
	
	/** トラン画面データの検索 */
	private String selectTranSrcByApprIDSql = 
			"SELECT T.FIELD_VALUE " 
			+ "FROM T_TRAN_SRC T " 
			+ "WHERE " 
			+ " T.APPR_ID = ? " 
			+ " AND T.FIELD_NAME = ? ";
	/**
	 * コンストラクタ
	 * @param connect コネクションがOPENされているIDbConnection
	 * @param userCd ユーザコード
	 * @param busineId 業務ID
	 * @param plantCd 工場コード
	 */
	public TranAppr(IDbConnection connect, String userCd, String busineId) {
		this.conn = connect;
		this.sysUserCd = userCd;
		this.sysBusinessId = busineId;
	}

	/**
	 * 承認IDを取得処理
	 * @param conn  DBアクセス用のコネクション
	 * @return String 承認ID
	 * @throws SQLException DBアクセスエラー
	 */
	public String selectSEQ_APPR_ID() throws SQLException {
		PreparedStatement ps = null;
		ResultSet rslt = null;
		String appr_ID = null;
		try {
			ps = this.conn.getConn().prepareStatement(_getApprIdSql);
			rslt = ps.executeQuery();
			if(rslt.next()){
				appr_ID = rslt.getString(1);
			}
			return appr_ID;
		} finally {
			if (ps != null) {
				ps.close();
			}
			if (rslt != null) {
				rslt.close();
			}
		}
	}
	/**
	 * トラン承認依頼の登録
	 * @param apprId      承認ID
	 * @param screenUrl   画面URL
	 * @param plantCd     工場コード
	 * @param procTyp     処理区分 
	 * @param apprRemarks 承認備考
	 * @param status      状態区分
	 * @param requestBy   依頼者
	 * @return リザルトセット
	 * @throws SQLException DBアクセスエラー
	 */
	public boolean insertTranApr(
			String apprId, 
			String screenUrl, 
			String procTyp, 
			String apprRemarks, 
			String status,
			String requestBy,
			String requesDate) throws SQLException {
		PreparedStatement ps = null;
		try {
			ps = this.conn.getConn().prepareStatement(insertTranAprSql);
			ps.setString(1, apprId);
			ps.setString(2, screenUrl);
			ps.setString(3, procTyp);
			ps.setString(4, apprRemarks);
			ps.setString(5, status);
			ps.setString(6, requestBy);
			ps.setString(7, requesDate);
			ps.setString(8, this.sysUserCd);
			ps.setString(9, this.sysBusinessId);
			ps.setString(10, this.sysUserCd);
			ps.setString(11, this.sysBusinessId);
			int row = ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			throw ex;
		} finally {
			if (ps != null) {
				ps.close();
			}
		}
	}

	/**
	 * トラン承認依頼の更新
	 * @param apprId 　　　　承認ID
	 * @param status 　　　　状態区分
	 * @param appBy 　　　　 承認者
	 * @param reserverCause  保留理由
	 * @return リザルトセット
	 * @throws SQLException DBアクセスエラー
	 */
	public boolean updateTranApr(
			String apprId, 
			String status,
			String apprBy,
			String reserverCause) throws SQLException {
		PreparedStatement ps = null;
		try {
			ps = this.conn.getConn().prepareStatement(updateTranAprSql);
			ps.setString(1, status);
			ps.setString(2, reserverCause);
			ps.setString(3, apprBy);
			ps.setString(4, this.sysUserCd);
			ps.setString(5, this.sysBusinessId);
			ps.setString(6, apprId);
			int row = ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			throw ex;
		} finally {
			if (ps != null) {
				ps.close();
			}
		}
	}
	
	/**
	 * トラン承認依頼の削除
	 * @param apprId 承認ID
	 * @return リザルトセット
	 * @throws SQLException DBアクセスエラー
	 */
	public boolean deleteTranApr(String apprId) throws SQLException {
		PreparedStatement ps = null;
		try {
			ps = this.conn.getConn().prepareStatement(deleteTranAprSql);
			ps.setString(1, apprId);
			int row = ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			throw ex;
		} finally {
			if (ps != null) {
				ps.close();
			}
		}
	}	

	/**
	 * トラン画面データの登録
	 * @param apprId     承認ID
	 * @param fieldName  項目名
	 * @param fieldValue 項目値
	 * @param fieldFlg   キーフラグ
	 * @return リザルトセット
	 * @throws SQLException DBアクセスエラー
	 */
	public boolean insertTranSrc(String apprId,String fieldName,String fieldValue,String fieldFlg) throws SQLException {
		PreparedStatement ps = null;
		try {
			ps = this.conn.getConn().prepareStatement(insertTranSrcSql);
			ps.setString(1, apprId);
			ps.setString(2, fieldName);
			ps.setString(3, fieldValue);
			ps.setString(4, fieldFlg);
			ps.setString(5, this.sysUserCd);
			ps.setString(6, this.sysBusinessId);
			ps.setString(7, this.sysUserCd);
			ps.setString(8, this.sysBusinessId);
			int row = ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			throw ex;
		} finally {
			if (ps != null) {
				ps.close();
			}
		}
	}		
	
	/**
	 * トラン画面データの削除
	 * @param apprId 承認ID
	 * @return リザルトセット
	 * @throws SQLException DBアクセスエラー
	 */
	public boolean deleteTranSrc(String apprId) throws SQLException {
		PreparedStatement ps = null;
		try {
			ps = this.conn.getConn().prepareStatement(deleteTranSrcSql);
			ps.setString(1, apprId);
			int row = ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			throw ex;
		} finally {
			if (ps != null) {
				ps.close();
			}
		}
	}	
	
//	/**
//	 * トラン画面データキー存在のチェック
//	 * @param fieldName 項目名
//	 * @param fieldValue 項目値
//	 * @return リザルトセット
//	 * @throws SQLException DBアクセスエラー
//	 */
//	public boolean checkTranSrc(String fieldName,String fieldValue) throws SQLException {
//		PreparedStatement ps = null;
//		ResultSet rslt = null;
//		try {
//			ps = this.conn.getConn().prepareStatement(checkTranSrcSql);
//			ps.setString(1, fieldName);
//			ps.setString(2, fieldValue);
//			rslt = ps.executeQuery();
//			if (rslt.next()) {
//				return true;
//			}
//			return false;
//		} catch (SQLException ex) {
//			throw ex;
//		} finally {
//			if (ps != null) {
//				ps.close();
//			}
//			if (rslt != null) {
//				rslt.close();
//			}
//		}
//	}		

	/**
	 * トラン画面データキー存在のチェック
	 * @param fieldName 項目名
	 * @param fieldValue 項目値
	 * @return リザルトセット
	 * @throws SQLException DBアクセスエラー
	 */
	public boolean selectTranSrc(String fieldName,String fieldValue) throws SQLException {
		PreparedStatement ps = null;
		ResultSet rslt = null;
		try {
			ps = this.conn.getConn().prepareStatement(checkTranSrcSql);
			ps.setString(1, fieldName);
			ps.setString(2, fieldValue);
			rslt = ps.executeQuery();
			if (rslt.next()) {
				return true;
			}
			return false;
		} catch (SQLException ex) {
			throw ex;
		} finally {
			if (ps != null) {
				ps.close();
			}
			if (rslt != null) {
				rslt.close();
			}
		}
	}	
	
	/**
	 * トラン画面データキー存在のチェック
	 * @param fieldName 項目名
	 * @param fieldValue 項目値
	 * @return リザルトセット
	 * @throws SQLException DBアクセスエラー
	 */
	public boolean checkTranSrc(String fieldName,String fieldValue) throws SQLException {
		return selectTranSrc(fieldName,fieldValue);
	}
	/**
	 * トラン画面データの検索
	 * @param fieldName 項目名
	 * @param fieldValue 項目値
	 * @return リザルトセット
	 * @throws SQLException DBアクセスエラー
	 * @throws FoundationException 
	 */
	public String getTranSrc(String apprID,String fieldName) throws SQLException, FoundationException {
		PreparedStatement ps = null;
		ResultSet rslt = null;
		String fieldValue = null;
		try {
			ps = this.conn.getConn().prepareStatement(selectTranSrcByApprIDSql);
			ps.setString(1, apprID);
			ps.setString(2, fieldName);
			rslt = ps.executeQuery();
			while(rslt.next()) {
				fieldValue = rslt.getString(1);
			}
			return fieldValue;
		} catch (SQLException ex) {
			throw ex;
		} finally {
			if (ps != null) {
				ps.close();
			}
			if (rslt != null) {
				rslt.close();
			}
		}
	}
}