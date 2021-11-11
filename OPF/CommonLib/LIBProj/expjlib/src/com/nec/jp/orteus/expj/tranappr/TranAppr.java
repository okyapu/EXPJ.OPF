//------------------------------------------------------------------------------
// (#)TranAppr.java
//
// Copyright (c) 2003 NES �ϓ�.
//
// 2008/07/16 �V�K�쐬 wang-c
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
 * �g�������F�˗��N���X
 * @author  wang-c
 * @version 1.00
 */
public class TranAppr extends DataObject{
	/** DB�A�N�Z�X�p�̃R�l�N�V���� */
	private IDbConnection conn = null;

	/** ���[�U�R�[�h */
	private String sysUserCd = null;
	/** �Ɩ�ID */
	private String sysBusinessId = null;


	/** ���FID */
	private String _getApprIdSql = "SELECT SEQ_TRAN_APR_ID.NEXTVAL FROM DUAL";
	/** �g�������F�˗��̓o�^ */
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
	/** �g�������F�˗��̍X�V */
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
	/** �g�������F�˗��̍폜 */
	private String deleteTranAprSql =
			"delete from "
			+ "  T_TRAN_APR "
			+ "where "
			+ "  T_TRAN_APR.APPR_ID = ? ";
	

	/** �g������ʃf�[�^�̓o�^ */
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
	/** �g������ʃf�[�^�̍폜 */
	private String deleteTranSrcSql =
			"delete from "
			+ "  T_TRAN_SRC "
			+ "where "
			+ "  T_TRAN_SRC.APPR_ID = ? ";
	
	/** �g������ʃf�[�^�L�[�l���݂̃`�F�b�N */
	private String checkTranSrcSql =
			"select *  from "
			+ "  T_TRAN_SRC "
			+ "where "
			+ "  T_TRAN_SRC.FIELD_NAME = ? "
	        + "and " 
	        + " T_TRAN_SRC.FIELD_VALUE = ? ";

	/** �g������ʃf�[�^�L�[�l���݂̃`�F�b�N */
	private String checkTranSrcSqlUNCNFM =
			"select *  from "
			+ "  T_TRAN_SRC "
			+ "where "
			+ "  T_TRAN_SRC.FIELD_NAME = ? "
	        + "and " 
	        + " T_TRAN_SRC.FIELD_VALUE = ? ";
	
	/** �g������ʃf�[�^�̌��� */
	private String selectTranSrcByApprIDSql = 
			"SELECT T.FIELD_VALUE " 
			+ "FROM T_TRAN_SRC T " 
			+ "WHERE " 
			+ " T.APPR_ID = ? " 
			+ " AND T.FIELD_NAME = ? ";
	/**
	 * �R���X�g���N�^
	 * @param connect �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param userCd ���[�U�R�[�h
	 * @param busineId �Ɩ�ID
	 * @param plantCd �H��R�[�h
	 */
	public TranAppr(IDbConnection connect, String userCd, String busineId) {
		this.conn = connect;
		this.sysUserCd = userCd;
		this.sysBusinessId = busineId;
	}

	/**
	 * ���FID���擾����
	 * @param conn  DB�A�N�Z�X�p�̃R�l�N�V����
	 * @return String ���FID
	 * @throws SQLException DB�A�N�Z�X�G���[
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
	 * �g�������F�˗��̓o�^
	 * @param apprId      ���FID
	 * @param screenUrl   ���URL
	 * @param plantCd     �H��R�[�h
	 * @param procTyp     �����敪 
	 * @param apprRemarks ���F���l
	 * @param status      ��ԋ敪
	 * @param requestBy   �˗���
	 * @return ���U���g�Z�b�g
	 * @throws SQLException DB�A�N�Z�X�G���[
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
	 * �g�������F�˗��̍X�V
	 * @param apprId �@�@�@�@���FID
	 * @param status �@�@�@�@��ԋ敪
	 * @param appBy �@�@�@�@ ���F��
	 * @param reserverCause  �ۗ����R
	 * @return ���U���g�Z�b�g
	 * @throws SQLException DB�A�N�Z�X�G���[
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
	 * �g�������F�˗��̍폜
	 * @param apprId ���FID
	 * @return ���U���g�Z�b�g
	 * @throws SQLException DB�A�N�Z�X�G���[
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
	 * �g������ʃf�[�^�̓o�^
	 * @param apprId     ���FID
	 * @param fieldName  ���ږ�
	 * @param fieldValue ���ڒl
	 * @param fieldFlg   �L�[�t���O
	 * @return ���U���g�Z�b�g
	 * @throws SQLException DB�A�N�Z�X�G���[
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
	 * �g������ʃf�[�^�̍폜
	 * @param apprId ���FID
	 * @return ���U���g�Z�b�g
	 * @throws SQLException DB�A�N�Z�X�G���[
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
//	 * �g������ʃf�[�^�L�[���݂̃`�F�b�N
//	 * @param fieldName ���ږ�
//	 * @param fieldValue ���ڒl
//	 * @return ���U���g�Z�b�g
//	 * @throws SQLException DB�A�N�Z�X�G���[
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
	 * �g������ʃf�[�^�L�[���݂̃`�F�b�N
	 * @param fieldName ���ږ�
	 * @param fieldValue ���ڒl
	 * @return ���U���g�Z�b�g
	 * @throws SQLException DB�A�N�Z�X�G���[
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
	 * �g������ʃf�[�^�L�[���݂̃`�F�b�N
	 * @param fieldName ���ږ�
	 * @param fieldValue ���ڒl
	 * @return ���U���g�Z�b�g
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public boolean checkTranSrc(String fieldName,String fieldValue) throws SQLException {
		return selectTranSrc(fieldName,fieldValue);
	}
	/**
	 * �g������ʃf�[�^�̌���
	 * @param fieldName ���ږ�
	 * @param fieldValue ���ڒl
	 * @return ���U���g�Z�b�g
	 * @throws SQLException DB�A�N�Z�X�G���[
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