/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/process/JobOdrStock.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */

package com.nec.jp.orteus.expj.pr.rcvissue.process;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;

import com.nec.jp.orteus.expj.pr.rcvissue.util.StringUtil;
import com.nec.jp.orteus.expj.pr.rcvissue.common.RcvIssueConst;
import com.nec.jp.orteus.expj.util.Calculate;

import java.math.BigDecimal;

/**
 * <pre>
 * �ۊǋ�ʐ��ԍ݌ɏ�񑀍�N���X
 * </pre>
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $
 *
 **/

public class JobOdrStock implements RcvIssueConst{

	/** �R�l�N�V���� */
	private IDbConnection _conn = null;

	/**
	 * <pre>
	 * �R���X�g���N�^
	 * �w��̃R�l�N�V���������I�u�W�F�N�g���\�z����
	 * </pre>
	 * @param  connect �R�l�N�V������OPEN����Ă���IDbConnection
	 */
	public JobOdrStock(IDbConnection connect){
		_conn = connect;
	}

	//-------  ���J���\�b�h  -------------------------------
	/**
	 * <pre>
	 * <b>���ۊǋ�E���ԕʎ莝���݌ɐ��̎擾</b>
	 * �ۊǋ�ʐ��ԍ݌Ƀe�[�u���̓ǂݍ���
	 * </pre>
	 *
	 * @param  iJobOdrCd ����
	 * @param  iJobOdrDetailNo ���Ԏ}��
	 * @param  iItemCd �i�ڔԍ�
	 * @param  iWhCd �ۊǋ�R�[�h
	 * @param  iMode  �Ǎ����[�h(0:�r�����b�N�Ȃ� 1:�r�����b�N����) 
	 * @return BigDecimal ���ԕʎ莝�݌ɐ� �Y�������񂪑��݂��Ȃ��ꍇ��NULL
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public BigDecimal getHandQty(String iJobOdrCd, int iJobOdrDetailNo,
	                              String iItemCd,   String iWhCd,
	                              int iMode)
		throws SQLException 	{
		
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;

		// �����`�F�b�N
		if( !StringUtil.Validate(iJobOdrCd) || !StringUtil.Validate(iItemCd) ||
				!StringUtil.Validate(iWhCd) ){
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}

		/** ���Ԃ̏o�ɉ\���Z�o�p SQL */
		String selectStr = 
			"SELECT"
			+" STOCK_ON_HAND_QTY "
			+"FROM"
			+" T_JOB_ODR_CD_STOCK "
			+"WHERE"
			+" JOB_ODR_CD = ?"
			+" AND ITEM_CD = ?"
			+" AND WH_CD = ?"
			+" AND JOB_ODR_DETAIL_NO = ?";
			
		if (iMode == 1) {
			selectStr = selectStr + " FOR UPDATE NOWAIT";
		} else {
			selectStr = selectStr + " AND STOCK_ON_HAND_QTY > 0";
		}
			
		try {
			selectStmt = _conn.getConn().prepareStatement(selectStr);

			selectStmt.setString(1, iJobOdrCd);
			selectStmt.setString(2, iItemCd);
			selectStmt.setString(3, iWhCd);
			selectStmt.setInt(4, iJobOdrDetailNo);

			selectRslt = selectStmt.executeQuery();

			// ����������0����������null��ԋp
			if(selectRslt.next()==false) return null;

			return selectRslt.getBigDecimal(1);

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}
	
	/**
	 * <pre>
	 * <b>�����ԕʎ莝�݌ɍ��v���̎擾(���v�ʌv�Z�Ώەۊǋ�̂�)</b>
	 * �ۊǋ�ʐ��ԍ݌Ƀe�[�u���̓ǂݍ���
	 * </pre>
	 *
	 * @param  iJobOdrCd ����
	 * @param  iJobOdrDetailNo ���Ԏ}��
	 * @param  iItemCd �i�ڔԍ�
	 * @param  iPlantCd �H��R�[�h
	 * @return BigDecimal ���ԕʎ莝�݌ɍ��v�� �Y�������񂪑��݂��Ȃ��ꍇ��NULL
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public BigDecimal getSumHandQty(String iJobOdrCd, int iJobOdrDetailNo,
			                         String iItemCd,   String iPlantCd) 
	                   throws SQLException 	{
		
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;

		// �����`�F�b�N
		if( !StringUtil.Validate(iJobOdrCd) ||
				!StringUtil.Validate(iItemCd) ||
				!StringUtil.Validate(iPlantCd) ){
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}

		/** ���Ԃ̏o�ɉ\���Z�o�p SQL */
		String selectStr = 
			"SELECT"
			+" SUM(T_JOB_ODR_CD_STOCK.STOCK_ON_HAND_QTY) "
			+"FROM"
			+" T_JOB_ODR_CD_STOCK, "
			+" M_WH "
			+"WHERE"
			+" T_JOB_ODR_CD_STOCK.WH_CD = M_WH.WH_CD"
			+" AND T_JOB_ODR_CD_STOCK.JOB_ODR_CD = ?"
			+" AND T_JOB_ODR_CD_STOCK.ITEM_CD = ?"
			+" AND T_JOB_ODR_CD_STOCK.PLANT_CD = ?"
			+" AND T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO = " + iJobOdrDetailNo
			+" AND M_WH.MRP_FLG = " + RcvIssueConst.MRP_TARGET;
			
		try {
			selectStmt = _conn.getConn().prepareStatement(selectStr);

			selectStmt.setString(1, iJobOdrCd);
			selectStmt.setString(2, iItemCd);
			selectStmt.setString(3, iPlantCd);

			selectRslt = selectStmt.executeQuery();

			// ����������0����������null��ԋp
			selectRslt.next();
			if(selectRslt.getBigDecimal(1)==null) return null;

			return selectRslt.getBigDecimal(1);

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}

	/**
	 * �ۊǋ�ʐ��ԍ݌Ƀe�[�u���̒ǉ�
	 *
	 * @param  struct �o�ɏ����f�[�^�N���X
	 * @return �X�V����������Ԃ�
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public int insertJobOdrCdStock(IssueStruct struct) throws SQLException
	{
		PreparedStatement updateStmt = null;

		// �����`�F�b�N
		if( struct == null ){
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}

		/** [T_JOB_ODR_CD_STOCK]insert�p��SQL */
		String _insertJobOdrCdStock = 
			"INSERT INTO T_JOB_ODR_CD_STOCK( "
			+"    STOCK_ON_HAND_QTY "
			+"   ,JOB_ODR_CD "
			+"   ,ITEM_CD "
			+"   ,WH_CD "
			+"   ,PLANT_CD "
			+"   ,CREATED_BY "
			+"   ,CREATED_PRG_NM "
			+"   ,UPDATED_BY "
			+"   ,UPDATED_PRG_NM) "
			+"values( TO_NUMBER(?) , ? , ? , ? , ? , ? , ? , ? , ? ) ";

		try {
			updateStmt = _conn.getConn().prepareStatement(_insertJobOdrCdStock);

			updateStmt.setString(1, (struct.getRCV_ISSUE_QTY()));
			updateStmt.setString(2, struct.getJOB_ODR_CD());
			updateStmt.setString(3, struct.getITEM_CD());
			updateStmt.setString(4, struct.getWH_CD());
			updateStmt.setString(5, struct.getPLANT_CD());
			updateStmt.setString(6, struct.getUPDATED_BY());
			updateStmt.setString(7, struct.getUPDATED_PRG_NM());
			updateStmt.setString(8, struct.getUPDATED_BY());
			updateStmt.setString(9, struct.getUPDATED_PRG_NM());

			return updateStmt.executeUpdate();

		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}

	/**
	 * �ۊǋ�ʐ��ԍ݌Ƀe�[�u���̍X�V
	 *
	 * @param  struct �o�ɏ����f�[�^�N���X
	 * @return �X�V����������Ԃ�
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public int updateJobOdrCdStock(IssueStruct struct) throws SQLException
	{
		PreparedStatement updateStmt = null;

		// �����`�F�b�N
		if( struct == null ){
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}
		
		/** [T_JOB_ODR_CD_STOCK]update�p��SQL */
		String _updateJobOdrCdStock = 
			"UPDATE T_JOB_ODR_CD_STOCK "
			+"SET STOCK_ON_HAND_QTY = TO_NUMBER(?) "
			+"   ,UPDATED_BY = ? "
			+"   ,UPDATED_PRG_NM = ? "
			+"   ,UPDATED_DATE = TO_DATE( ? ,'YYYY/MM/DD HH24:MI:SS') "
			+"   ,MODIFY_COUNT = MODIFY_COUNT + 1 "
			+"WHERE "
			+"    JOB_ODR_CD = ? "
			+"AND ITEM_CD = ? "
			+"AND WH_CD = ? "
			+"AND PLANT_CD = ? ";
		
		try {
			// �X�V�O�̍݌ɐ�
			String stockQty = struct.getJOB_STOCK_ON_HAND_QTY();
			// �X�V������o�ɐ�
			String rcvIssueQty = struct.getRCV_ISSUE_QTY();

			updateStmt = _conn.getConn().prepareStatement(_updateJobOdrCdStock);

			updateStmt.setString(1, Calculate.add(stockQty, rcvIssueQty));
			updateStmt.setString(2, struct.getUPDATED_BY());
			updateStmt.setString(3, struct.getUPDATED_PRG_NM());
			updateStmt.setString(4, struct.getSYSDATE());
			updateStmt.setString(5, struct.getJOB_ODR_CD());
			updateStmt.setString(6, struct.getITEM_CD());
			updateStmt.setString(7, struct.getWH_CD());
			updateStmt.setString(8, struct.getPLANT_CD());

			return updateStmt.executeUpdate();

		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}

	//-------  ����J���\�b�h  -------------------------------
	/**
	 * �v���y�A�h�X�e�[�g�����g�����
	 *
	 * @param statement ����Ώۂ̃X�e�[�g�����g
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
	 * ���U���g�Z�b�g�����
	 *
	 * @param resultset ����Ώۂ̃��U���g�Z�b�g
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
