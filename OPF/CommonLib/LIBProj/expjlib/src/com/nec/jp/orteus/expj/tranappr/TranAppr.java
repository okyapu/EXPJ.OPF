//------------------------------------------------------------------------------
// (#)TranAppr.java
//
// Copyright (c) 2003 NES Ïì.
//
// 2008/07/16 VKì¬ wang-c
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
 * g³FËNX
 * @author  wang-c
 * @version 1.00
 */
public class TranAppr extends DataObject{
	/** DBANZXpÌRlNV */
	private IDbConnection conn = null;

	/** [UR[h */
	private String sysUserCd = null;
	/** Æ±ID */
	private String sysBusinessId = null;


	/** ³FID */
	private String _getApprIdSql = "SELECT SEQ_TRAN_APR_ID.NEXTVAL FROM DUAL";
	/** g³FËÌo^ */
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
	/** g³FËÌXV */
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
	/** g³FËÌí */
	private String deleteTranAprSql =
			"delete from "
			+ "  T_TRAN_APR "
			+ "where "
			+ "  T_TRAN_APR.APPR_ID = ? ";
	

	/** gæÊf[^Ìo^ */
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
	/** gæÊf[^Ìí */
	private String deleteTranSrcSql =
			"delete from "
			+ "  T_TRAN_SRC "
			+ "where "
			+ "  T_TRAN_SRC.APPR_ID = ? ";
	
	/** gæÊf[^L[l¶ÝÌ`FbN */
	private String checkTranSrcSql =
			"select *  from "
			+ "  T_TRAN_SRC "
			+ "where "
			+ "  T_TRAN_SRC.FIELD_NAME = ? "
	        + "and " 
	        + " T_TRAN_SRC.FIELD_VALUE = ? ";

	/** gæÊf[^L[l¶ÝÌ`FbN */
	private String checkTranSrcSqlUNCNFM =
			"select *  from "
			+ "  T_TRAN_SRC "
			+ "where "
			+ "  T_TRAN_SRC.FIELD_NAME = ? "
	        + "and " 
	        + " T_TRAN_SRC.FIELD_VALUE = ? ";
	
	/** gæÊf[^Ìõ */
	private String selectTranSrcByApprIDSql = 
			"SELECT T.FIELD_VALUE " 
			+ "FROM T_TRAN_SRC T " 
			+ "WHERE " 
			+ " T.APPR_ID = ? " 
			+ " AND T.FIELD_NAME = ? ";
	/**
	 * RXgN^
	 * @param connect RlNVªOPEN³êÄ¢éIDbConnection
	 * @param userCd [UR[h
	 * @param busineId Æ±ID
	 * @param plantCd HêR[h
	 */
	public TranAppr(IDbConnection connect, String userCd, String busineId) {
		this.conn = connect;
		this.sysUserCd = userCd;
		this.sysBusinessId = busineId;
	}

	/**
	 * ³FIDðæ¾
	 * @param conn  DBANZXpÌRlNV
	 * @return String ³FID
	 * @throws SQLException DBANZXG[
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
	 * g³FËÌo^
	 * @param apprId      ³FID
	 * @param screenUrl   æÊURL
	 * @param plantCd     HêR[h
	 * @param procTyp     æª 
	 * @param apprRemarks ³Fõl
	 * @param status      óÔæª
	 * @param requestBy   ËÒ
	 * @return UgZbg
	 * @throws SQLException DBANZXG[
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
	 * g³FËÌXV
	 * @param apprId @@@@³FID
	 * @param status @@@@óÔæª
	 * @param appBy @@@@ ³FÒ
	 * @param reserverCause  Û¯R
	 * @return UgZbg
	 * @throws SQLException DBANZXG[
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
	 * g³FËÌí
	 * @param apprId ³FID
	 * @return UgZbg
	 * @throws SQLException DBANZXG[
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
	 * gæÊf[^Ìo^
	 * @param apprId     ³FID
	 * @param fieldName  Ú¼
	 * @param fieldValue Úl
	 * @param fieldFlg   L[tO
	 * @return UgZbg
	 * @throws SQLException DBANZXG[
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
	 * gæÊf[^Ìí
	 * @param apprId ³FID
	 * @return UgZbg
	 * @throws SQLException DBANZXG[
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
//	 * gæÊf[^L[¶ÝÌ`FbN
//	 * @param fieldName Ú¼
//	 * @param fieldValue Úl
//	 * @return UgZbg
//	 * @throws SQLException DBANZXG[
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
	 * gæÊf[^L[¶ÝÌ`FbN
	 * @param fieldName Ú¼
	 * @param fieldValue Úl
	 * @return UgZbg
	 * @throws SQLException DBANZXG[
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
	 * gæÊf[^L[¶ÝÌ`FbN
	 * @param fieldName Ú¼
	 * @param fieldValue Úl
	 * @return UgZbg
	 * @throws SQLException DBANZXG[
	 */
	public boolean checkTranSrc(String fieldName,String fieldValue) throws SQLException {
		return selectTranSrc(fieldName,fieldValue);
	}
	/**
	 * gæÊf[^Ìõ
	 * @param fieldName Ú¼
	 * @param fieldValue Úl
	 * @return UgZbg
	 * @throws SQLException DBANZXG[
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