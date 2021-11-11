/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/process/IssueRemain.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */

package com.nec.jp.orteus.expj.pr.rcvissue.process;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.math.BigDecimal;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;

import com.nec.jp.orteus.expj.pr.rcvissue.util.StringUtil;
import com.nec.jp.orteus.expj.pr.rcvissue.common.RcvIssueConst;

/**
 * <pre>
 * �ʎ�z���o�Ɏc���E�����Ϗo�Ɏc���̎擾�N���X
 * </pre>
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.8 $
 *
 **/

public class IssueRemain implements RcvIssueConst{

	/** �����o�ϐ� */
	private IDbConnection _conn = null;		// �R�l�N�V����
	private BigDecimal _odrQty = null; 		// �I�[�_��
	private BigDecimal _totalIssueQty = null;	// �o�ɗ݌v��
	private BigDecimal _issueedQty = null;		// �o�ɍϑ���
	private String _jobOdrCd = null;			// ����
	private int _jobOdrDetailNo = 0;			// ���Ԏ}��
	private final static BigDecimal cZero = new BigDecimal("0");

	/**
	 * <pre>
	 * �R���X�g���N�^
	 * �w��̃R�l�N�V���������I�u�W�F�N�g���\�z����
	 * </pre>
	 * @param  connect �R�l�N�V������OPEN����Ă���IDbConnection
	 */
	public IssueRemain(IDbConnection connect){
		_conn = connect;
	}
	
	/**
	 * <pre>
	 * ���ԏ��i�[�p�C���i�[�N���X
	 * �o�Ɏc���A���ԁA���Ԏ}��
	 * </pre>
	 */
	public class ResultByOd{
		/** �o�Ɏc�� */
		public BigDecimal remainQty;
		
		/** ���� */
		public String jobOdrCd;
		
		/** ���Ԏ}�� */
		public int jobOdrDetailNo;
	}

	//-------  ���J���\�b�h  -------------------------------
	/**
	 * <pre>
	 * <b>�I�[�_�f�}���h�P�ʂ̌ʎ�z���o�Ɏc���̎擾</b><br>
	 * ����̃I�[�_�f�}���h�̌ʎ�z���݌ɂ���̏o�Ɏc�����擾����B
	 * </pre>
	 *
	 * @param iOdNo �I�[�_�f�}���h�ԍ�
	 * @return ResultByOd ���ԏ��i�[�p�C���i�[�N���X �擾�Ɏ��s�����ꍇ��NULL�B
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public ResultByOd getRemainQtyByOd(String iOdNo) throws SQLException
	{
		// �����`�F�b�N
		if( !StringUtil.Validate(iOdNo) ){
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}
		
		BigDecimal calcResult = cZero;
		
		// [���v��]�A[���Ԉ���]����I�[�_���A�o�ɗ݌v���A�o�ɍϐ��̎擾
		if( !read(iOdNo) ){
			// �Ώۃf�[�^�����݂��Ȃ��ꍇ
			return null;
			
		}
		
		// �ʎ�z���o�Ɏc���̌v�Z����
		calcResult =  _odrQty.subtract(_totalIssueQty.subtract(_issueedQty));
		if( calcResult.compareTo(cZero) < 0 ){
			// �v�Z���ʁ��O�̏ꍇ
			calcResult = cZero;
		}
		
		// ���ԏ��i�[
		ResultByOd resultByOd = new ResultByOd();
		resultByOd.remainQty = calcResult;
		resultByOd.jobOdrCd = _jobOdrCd;
		resultByOd.jobOdrDetailNo = _jobOdrDetailNo;
		
		return resultByOd;
	}

	/**
	 * <pre>
	 * <b>�I�[�_�f�}���h�P�ʂ̌ʎ�z���o�ɍϐ��̎擾</b><br>
	 * ����̃I�[�_�f�}���h�̌ʎ�z���݌ɂ���̏o�ɍϐ����擾����B
	 * </pre>
	 *
	 * @param iOdNo �I�[�_�f�}���h�ԍ�
	 * @return BigDecimal �ʎ�z���o�ɍϐ� �擾�Ɏ��s�����ꍇ�͂O�B
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public BigDecimal getIssuedQtyByOd(String iOdNo) throws SQLException
	{
		// �����`�F�b�N
		if( !StringUtil.Validate(iOdNo) ){
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}
		
		BigDecimal calcResult = cZero;
		
		// [���v��]�A[���Ԉ���]����o�ɗ݌v���A�o�ɍϐ��̎擾
		if( !read(iOdNo) ){
			// �Ώۃf�[�^�����݂��Ȃ��ꍇ
			return calcResult;
			
		}
		
		// �ʎ�z���o�Ɏc���̌v�Z����
		calcResult =  _totalIssueQty.subtract(_issueedQty);
		if( calcResult.compareTo(cZero) < 0 ){
			// �v�Z���ʁ��O�̏ꍇ
			return cZero;
		}
		
		return calcResult;
	}

	/**
	 * <pre>
	 * <b>����I�[�_�f�}���h�ւ̑����ԍ݌Ɂi���萻�ԁj����̈����Ϗo�Ɏc���̎擾</b><br>
	 * ����̃I�[�_�f�}���h�ւ̓���̐��Ԃ���̈����Ϗo�Ɏc�����擾����B
	 * </pre>
	 *
	 * @param iOdNo �I�[�_�f�}���h�ԍ�
	 * @param iJobOdrCd ����
	 * @param iJobOdrDetailNo ���Ԏ}��
	 * @return BigDecimal �ʎ�z���o�ɍϐ� �擾�Ɏ��s�����ꍇ�͂O�B
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public BigDecimal getRemainQtyByJobOdr(String iOdNo, String iJobOdrCd,
											int iJobOdrDetailNo)
		throws SQLException {
		
		// �����`�F�b�N
		if( !StringUtil.Validate(iOdNo) ||
				!StringUtil.Validate(iJobOdrCd) ) {
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}
		
		BigDecimal calcResult = cZero;
		
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;

		/** [���Ԉ���]�Ǎ� SQL */
		String sql = 
			"SELECT"
			+" ALCD_QTY,"
			+" ISSUEED_QTY "
			+"FROM"
			+" T_JOB_ODR_ALC "
			+"WHERE"
			+" OD_NO = ?"
			+" AND JOB_ODR_CD = ?"
			+" AND JOB_ODR_DETAIL_NO = ?"
			+" AND ALC_STOCK_TYP = " + RcvIssueConst.ALC_STOCK_JOB_ODR;
		
		try {
			
			// [���Ԉ���]�̓Ǎ��������s
			selectStmt = _conn.getConn().prepareStatement(sql);
			selectStmt.setString(1, iOdNo);
			selectStmt.setString(2, iJobOdrCd);
			selectStmt.setInt(3, iJobOdrDetailNo);
			selectRslt = selectStmt.executeQuery();
			
			// �Ώۃf�[�^�Ȃ��̏ꍇ
			if( !selectRslt.next() ){
				return calcResult;
			}

			// �������ʂ̃Z�b�g�i�����ϐ��A�o�ɍϐ��j
			BigDecimal alcdQty = selectRslt.getBigDecimal(1);
			BigDecimal issuedQty = selectRslt.getBigDecimal(2);
			
			// �����Ϗo�Ɏc���̌v�Z����
			calcResult =  alcdQty.subtract(issuedQty);
			
			return calcResult;

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}

	/**
	 * <pre>
	 * <b>����̃I�[�_�f�}���h�ւ̑����ԍ݌Ɂi���萻�ԁj����̏o�ɍϐ��̎擾</b><br>
	 * ���ԕi�̓���̃I�[�_�f�}���h�ւ̓���̑����ԍ݌ɂ�������ɂ��o�ɍϐ����擾����B
	 * </pre>
	 *
	 * @param iOdNo �I�[�_�f�}���h�ԍ�
	 * @param iJobOdrCd ����
	 * @param iJobOdrDetailNo ���Ԏ}��
	 * @return BigDecimal �ʎ�z���o�ɍϐ� �擾�Ɏ��s�����ꍇ�͂O�B
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public BigDecimal getIssuedQtyByJobOdr(String iOdNo, String iJobOdrCd,
											int iJobOdrDetailNo)
		throws SQLException {
		
		// �����`�F�b�N
		if( !StringUtil.Validate(iOdNo) ||
				!StringUtil.Validate(iJobOdrCd) ) {
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}
		
		BigDecimal calcResult = cZero;
		
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;

		/** [���Ԉ���]�Ǎ� SQL */
		String sql = 
			"SELECT"
			+" ISSUEED_QTY "
			+"FROM"
			+" T_JOB_ODR_ALC "
			+"WHERE"
			+" OD_NO = ?"
			+" AND JOB_ODR_CD = ?"
			+" AND JOB_ODR_DETAIL_NO = ?"
			+" AND ALC_STOCK_TYP = " + RcvIssueConst.ALC_STOCK_JOB_ODR;
		
		try {
			
			// [���Ԉ���]�̓Ǎ��������s
			selectStmt = _conn.getConn().prepareStatement(sql);
			selectStmt.setString(1, iOdNo);
			selectStmt.setString(2, iJobOdrCd);
			selectStmt.setInt(3, iJobOdrDetailNo);
			selectRslt = selectStmt.executeQuery();
			
			// �Ώۃf�[�^�Ȃ��̏ꍇ
			if( !selectRslt.next() ){
				return calcResult;
			}

			// �������ʂ̃Z�b�g�i�o�ɍϐ��j
			calcResult = selectRslt.getBigDecimal(1);
			
			return calcResult;

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}

	/**
	 * <pre>
	 * <b>����̃I�[�_�f�}���h�ւ̕i�ڍ݌ɂ���̈����Ϗo�Ɏc���̎擾</b><br>
	 * ����̃I�[�_�f�}���h�ւ̕i�ڍ݌ɂ���̈����Ϗo�Ɏc�����擾����B
	 * </pre>
	 *
	 * @param iOdNo �I�[�_�f�}���h�ԍ�
	 * @return BigDecimal �ʎ�z���o�ɍϐ� �擾�Ɏ��s�����ꍇ�͂O�B
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public BigDecimal getRemainQtyByItem(String iOdNo)
		throws SQLException {
		
		// �����`�F�b�N
		if( !StringUtil.Validate(iOdNo) ) {
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}
		
		BigDecimal calcResult = cZero;
		
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;

		/** [���Ԉ���]�Ǎ� SQL */
		String sql = 
			"SELECT"
			+" ALCD_QTY,"
			+" ISSUEED_QTY "
			+"FROM"
			+" T_JOB_ODR_ALC "
			+"WHERE"
			+" OD_NO = ?"
			+" AND ALC_STOCK_TYP = " + RcvIssueConst.ALC_STOCK_ITEM;
		
		try {
			
			// [���Ԉ���]�̓Ǎ��������s
			selectStmt = _conn.getConn().prepareStatement(sql);
			selectStmt.setString(1, iOdNo);
			selectRslt = selectStmt.executeQuery();
			
			// �Ώۃf�[�^�Ȃ��̏ꍇ
			if( !selectRslt.next() ){
				return calcResult;
			}

			// �������ʂ̃Z�b�g�i�����ϐ��A�o�ɍϐ��j
			BigDecimal alcdQty = selectRslt.getBigDecimal(1);
			BigDecimal issuedQty = selectRslt.getBigDecimal(2);
			
			// �����Ϗo�Ɏc���̌v�Z����
			calcResult =  alcdQty.subtract(issuedQty);
			
			return calcResult;

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}

	/**
	 * <pre>
	 * <b>����̃I�[�_�f�}���h�ւ̕i�ڍ݌ɂ���̏o�ɍϐ��̎擾</b><br>
	 * ���ԕi�̓���̃I�[�_�f�}���h�ւ̕i�ڍ݌ɂ�������ɂ��o�ɍϐ����擾����B
	 * </pre>
	 *
	 * @param iOdNo �I�[�_�f�}���h�ԍ�
	 * @return BigDecimal �ʎ�z���o�ɍϐ� �擾�Ɏ��s�����ꍇ�͂O�B
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public BigDecimal getIssuedQtyByItem(String iOdNo)
		throws SQLException {
		
		// �����`�F�b�N
		if( !StringUtil.Validate(iOdNo) ) {
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}
		
		BigDecimal calcResult = cZero;
		
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;

		/** [���Ԉ���]�Ǎ� SQL */
		String sql = 
			"SELECT"
			+" ISSUEED_QTY "
			+"FROM"
			+" T_JOB_ODR_ALC "
			+"WHERE"
			+" OD_NO = ?"
			+" AND ALC_STOCK_TYP = " + RcvIssueConst.ALC_STOCK_ITEM;
		
		try {
			
			// [���Ԉ���]�̓Ǎ��������s
			selectStmt = _conn.getConn().prepareStatement(sql);
			selectStmt.setString(1, iOdNo);
			selectRslt = selectStmt.executeQuery();
			
			// �Ώۃf�[�^�Ȃ��̏ꍇ
			if( !selectRslt.next() ){
				return calcResult;
			}

			// �������ʂ̃Z�b�g�i�o�ɍϐ��j
			calcResult = selectRslt.getBigDecimal(1);
			
			return calcResult;

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}

	/**
	 * <pre>
	 * <b>����̃I�[�_�f�}���h�ւ̑����ԍ݌Ɂi�S���ԁj����̏o�Ɏc���̎擾</b><br>
	 * ���ԕi�̓���̃I�[�_�f�}���h�ւ̑S�Ă̑����ԍ݌ɂ�������ɂ��o�Ɏc�����擾����B
	 * </pre>
	 * @param iOdNo �I�[�_�f�}���h�ԍ�
	 * @return BigDecimal �ʎ�z���o�ɍϐ� �擾�Ɏ��s�����ꍇ�͂O�B
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public BigDecimal getRemainQtyByAllJobOdr(String iOdNo)
		throws SQLException {
		
		// �����`�F�b�N
		if( !StringUtil.Validate(iOdNo) ) {
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}
		
		BigDecimal calcResult = cZero;
		
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;

		/** [���Ԉ���]�Ǎ� SQL */
		String sql = 
			 "SELECT"
			+" SUM(ALCD_QTY) -"
			+" SUM(ISSUEED_QTY) "
			+"FROM"
			+" T_JOB_ODR_ALC "
			+"WHERE"
			+" OD_NO = ?"
			+" AND ALC_STOCK_TYP = " + RcvIssueConst.ALC_STOCK_JOB_ODR;
		
		try {
			
			// [���Ԉ���]�̓Ǎ��������s
			selectStmt = _conn.getConn().prepareStatement(sql);
			selectStmt.setString(1, iOdNo);
			selectRslt = selectStmt.executeQuery();
			
			// �Ώۃf�[�^�Ȃ��̏ꍇ
			selectRslt.next();
			if( selectRslt.getBigDecimal(1) == null ){
				return calcResult;
			}

			// �������ʂ̃Z�b�g�i�����Ϗo�ɍϐ��j
			calcResult = selectRslt.getBigDecimal(1);
			
			return calcResult;

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}

	/**
	 * <pre>
	 * <b>����̃I�[�_�f�}���h�ւ̑����ԍ݌Ɂi�S���ԁj����̏o�ɍϐ��̎擾</b><br>
	 * ���ԕi�̓���̃I�[�_�f�}���h�ւ̑S�Ă̑����ԍ݌ɂ�������ɂ��o�ɍϐ����擾����B
	 * </pre>
	 * @param iOdNo �I�[�_�f�}���h�ԍ�
	 * @return BigDecimal �ʎ�z���o�ɍϐ� �擾�Ɏ��s�����ꍇ�͂O�B
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public BigDecimal getIssuedQtyByAllJobOdr(String iOdNo)
		throws SQLException {
		
		// �����`�F�b�N
		if( !StringUtil.Validate(iOdNo) ) {
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}
		
		BigDecimal calcResult = cZero;
		
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;

		/** [���Ԉ���]�Ǎ� SQL */
		String sql = 
			 "SELECT"
			+" SUM(ISSUEED_QTY) "
			+"FROM"
			+" T_JOB_ODR_ALC "
			+"WHERE"
			+" OD_NO = ?"
			+" AND ALC_STOCK_TYP = " + RcvIssueConst.ALC_STOCK_JOB_ODR;
		
		try {
			
			// [���Ԉ���]�̓Ǎ��������s
			selectStmt = _conn.getConn().prepareStatement(sql);
			selectStmt.setString(1, iOdNo);
			selectRslt = selectStmt.executeQuery();
			
			// �Ώۃf�[�^�Ȃ��̏ꍇ
			selectRslt.next();
			if( selectRslt.getBigDecimal(1) == null ){
				return calcResult;
			}

			// �������ʂ̃Z�b�g
			calcResult = selectRslt.getBigDecimal(1);
			
			return calcResult;

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}

	/**
	 * <pre>
	 * <b>���ԁE�i�ڒP�ʂ̖��������̎擾</b><br>
	 * �w�肵�����ԁE�i�ڂ̐��ԍ݌ɐ����疢�������̐��ʂ��擾����B
	 * </pre>
	 *
	 * @param iPlantCd �H��R�[�h
	 * @param iItemCd �i�ڔԍ�
	 * @param iJobOdrCd ����
	 * @param iJobOdrDetailNo ���Ԏ}��
	 * @return BigDecimal �ʎ�z���o�ɍϐ� �擾�Ɏ��s�����ꍇ�͂O�B
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public BigDecimal getFreeStockQtyOfJobOdr(String iPlantCd,  String iItemCd,
											   String iJobOdrCd, int iJobOdrDetailNo)
		throws SQLException {
		
		// �����`�F�b�N
		if( !StringUtil.Validate(iPlantCd) || !StringUtil.Validate(iItemCd) || 
				!StringUtil.Validate(iJobOdrCd)) {
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}
		
		BigDecimal calcResult = cZero;
		
		// ���ԕʎ莝�݌ɍ��v���̎擾
		JobOdrStock jobodrstock = new JobOdrStock(_conn);
		BigDecimal nowQty =  jobodrstock.getSumHandQty(iJobOdrCd, iJobOdrDetailNo,
													   iItemCd,   iPlantCd);
		if( nowQty == null ){
			return cZero;
		}
		
		PreparedStatement selectStmtTOd = null;
		ResultSet selectRsltTOd = null;
		PreparedStatement selectStmtTJobOdrAlc = null;
		ResultSet selectRsltTJobOdrAlc = null;
		
		try {
			
			/** [���v��]�Ǎ�SQL */
			String sqlTOd =
				 "SELECT"
				+" OD_NO "
				+"FROM"
				+" T_OD "
				+"WHERE"
				+" PLANT_CD = ?"
				+" AND ITEM_CD = ?"
				+" AND JOB_ODR_CD = ?"
				+" AND JOB_ODR_DETAIL_NO = ?"
				+" AND PARENT_OD_NO IS NOT NULL"
				+" AND DM_STS_TYP <> " + RcvIssueConst.DM_STS_COMPLETE;
			
			// [���v��]�̓Ǎ��������s
			selectStmtTOd = _conn.getConn().prepareStatement(sqlTOd);
			selectStmtTOd.setString(1, iPlantCd);
			selectStmtTOd.setString(2, iItemCd);
			selectStmtTOd.setString(3, iJobOdrCd);
			selectStmtTOd.setInt(4, iJobOdrDetailNo);
			selectRsltTOd = selectStmtTOd.executeQuery();
			
			BigDecimal ownRemainQty = cZero;

			while(selectRsltTOd.next()){
				ownRemainQty = ownRemainQty.add((getRemainQtyByOd(selectRsltTOd.getString(1))).remainQty);
			}
			/** [���Ԉ���]�Ǎ� SQL */
			String sqlTJobOdrAlc = 
				 "SELECT"
				+" SUM(ALCD_QTY),"
				+" SUM(ISSUEED_QTY) "
				+"FROM"
				+" T_JOB_ODR_ALC "
				+"WHERE"
				+" PLANT_CD = ?"
				+" AND ITEM_CD = ?"
				+" AND JOB_ODR_CD = ?"
				+" AND JOB_ODR_DETAIL_NO = ?"
				+" AND ALC_STOCK_TYP = " + RcvIssueConst.ALC_STOCK_JOB_ODR;
			
			// [���Ԉ���]�̓Ǎ��������s
			selectStmtTJobOdrAlc = _conn.getConn().prepareStatement(sqlTJobOdrAlc);
			selectStmtTJobOdrAlc.setString(1, iPlantCd);
			selectStmtTJobOdrAlc.setString(2, iItemCd);
			selectStmtTJobOdrAlc.setString(3, iJobOdrCd);
			selectStmtTJobOdrAlc.setInt(4, iJobOdrDetailNo);
			selectRsltTJobOdrAlc = selectStmtTJobOdrAlc.executeQuery();
			
			selectRsltTJobOdrAlc.next();
			BigDecimal alcRemainQty = cZero;
			if( selectRsltTJobOdrAlc.getBigDecimal(1) != null ){
				// �������ʂ̃Z�b�g�i�����ϐ��A�o�ɍϐ��j
				BigDecimal alcdQty = selectRsltTJobOdrAlc.getBigDecimal(1);
				BigDecimal issuedQty = selectRsltTJobOdrAlc.getBigDecimal(2);
				
				// �����Ϗo�Ɏc���̌v�Z����
				alcRemainQty =  alcdQty.subtract(issuedQty);
			}
			
			// ���������̌v�Z
			calcResult = (nowQty.subtract(ownRemainQty)).subtract(alcRemainQty);
			
			// �����������O�ȉ��̏ꍇ
			if( calcResult.compareTo(cZero) <= 0 ){
				return cZero;
			}
			
			return calcResult;

		} finally {
			this.closeResultSet(selectRsltTOd);
			this.closePreparedStatement(selectStmtTOd);
			this.closeResultSet(selectRsltTJobOdrAlc);
			this.closePreparedStatement(selectStmtTJobOdrAlc);
		}
	}

	/**
	 * <pre>
	 * <b>�i�ڍ݌ɂ̖��������̎擾</b><br>
	 * �w�肵���i�ڂ̍݌ɐ����疢�������̐��ʂ��擾����B
	 * </pre>
	 *
	 * @param iPlantCd �H��R�[�h
	 * @param iItemCd �i�ڔԍ�
	 * @return BigDecimal �ʎ�z���o�ɍϐ� �擾�Ɏ��s�����ꍇ�͂O�B
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public BigDecimal getFreeStockQtyOfItem(String iPlantCd, String iItemCd) throws SQLException
	{
		
		// �����`�F�b�N
		if( !StringUtil.Validate(iPlantCd) || !StringUtil.Validate(iItemCd) ) {
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}
		
		BigDecimal calcResult = cZero;
		
		// ���ԕʎ莝�݌ɍ��v���̎擾
		ItemStock itemstock = new ItemStock(_conn);
		BigDecimal handQty =  itemstock.getSumHandQty(iItemCd, iPlantCd);
		if( handQty == null ){
			handQty = cZero;
		}
		
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;

		/** [���Ԉ���]�Ǎ� SQL */
		String sql = 
			"SELECT"
			+" SUM(ALCD_QTY),"
			+" SUM(ISSUEED_QTY) "
			+"FROM"
			+" T_JOB_ODR_ALC "
			+"WHERE"
			+" PLANT_CD = ?"
			+" AND ITEM_CD = ?"
			+" AND ALC_STOCK_TYP = " + RcvIssueConst.ALC_STOCK_ITEM;
		
		try {
			
			// [���Ԉ���]�̓Ǎ��������s
			selectStmt = _conn.getConn().prepareStatement(sql);
			selectStmt.setString(1, iPlantCd);
			selectStmt.setString(2, iItemCd);
			selectRslt = selectStmt.executeQuery();
			
			// �Ώۃf�[�^�Ȃ��̏ꍇ
			selectRslt.next();
			BigDecimal freeQty;
			if( selectRslt.getBigDecimal(1) == null ){
				freeQty = cZero;
			} else {
				// �������ʂ̃Z�b�g�i�����ϐ��A�o�ɍϐ��j
				BigDecimal alcdQty = selectRslt.getBigDecimal(1);
				BigDecimal issuedQty = selectRslt.getBigDecimal(2);
				
				// �����Ϗo�Ɏc���̌v�Z����
				freeQty =  alcdQty.subtract(issuedQty);
			}
			
			// ���������̌v�Z
			calcResult = handQty.subtract(freeQty);
			
			// �O�ȉ��̏ꍇ�͂O�Ƃ���
			if( calcResult.compareTo(cZero) <= 0 ){
				return cZero;
			}
			
			return calcResult;

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}

	/**
	 * <pre>
	 * ����̐��ԁE�i�ڂ���̈����Ϗo�Ɏc���Ɛ��ԍ݌Ɂi�莝�݌Ɂj���r���āA
	 * �莝�݌ɂ������ςݏo�Ɏc���ɖ����Ȃ��ꍇ�Afalse��ԋp���܂��B
	 * </pre>
	 * @param iPlantCd �H��R�[�h
	 * @param iItemCd �i�ڔԍ�
	 * @param iJobOdrCd ����
	 * @param iJobOdrDetailNo ���Ԏ}��
	 * @return true/false �����Ϗo�Ɏc�������ԍ݌Ɂi�莝�݌Ɂj�@�̂Ƃ�false
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public boolean isEnoughAlcdQty(String iPlantCd,
	                                 String iItemCd,
 			                         String iJobOdrCd,
 			                         int iJobOdrDetailNo) throws SQLException {
 			                             
 		boolean ret;	                             
 			                             
 		//�w�肳�ꂽ���ԁE�i�ڂ̈����ςݏo�Ɏc���̎擾	             
	    BigDecimal w_RemainQty = this.getRemainQtyOfJobOdr(iPlantCd,iItemCd,iJobOdrCd,iJobOdrDetailNo);
	    
	    //�w�肳�ꂽ�i�ڂ̐��ԍ݌Ɂi�莝�݌Ɂj�̎擾
	    JobOdrStock wStock = new JobOdrStock(_conn);
	    BigDecimal w_HandQty = wStock.getSumHandQty(iJobOdrCd,iJobOdrDetailNo,iItemCd,iPlantCd);
	    if (w_HandQty == null) {
	        w_HandQty = new BigDecimal("0");
	    }
	    
	    if (w_RemainQty.compareTo(w_HandQty) > 0) {
	        ret = false;
	    } else {
	        ret = true;
	    }
	    return ret;
	}
	

	//-------  ����J���\�b�h  -------------------------------
	/**
	 * �����o�ϐ��̏�����
	 */
	private void initialize()
	{
		_odrQty = new BigDecimal("0");
		_totalIssueQty = new BigDecimal("0");
		_issueedQty = new BigDecimal("0");
		_jobOdrCd = "";
		_jobOdrDetailNo = 0;
	}

	/**
	 * <pre>
	 * <b>����̐��ԁE�i�ڂ���̈����Ϗo�Ɏc���̎擾</b>
	 * </pre>
	 * @param iPlantCd �H��R�[�h
	 * @param iItemCd �i�ڔԍ�
	 * @param iJobOdrCd ����
	 * @param iJobOdrDetailNo ���Ԏ}��
	 * @return BigDecimal �����Ϗo�Ɏc�� �擾�Ɏ��s�����ꍇ�͂O
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	private BigDecimal getRemainQtyOfJobOdr(String iPlantCd, String iItemCd,
											String iJobOdrCd, int iJobOdrDetailNo) throws SQLException
	{
		// �����`�F�b�N
		if( !StringUtil.Validate(iPlantCd) || !StringUtil.Validate(iItemCd) ||
				!StringUtil.Validate(iJobOdrCd)) {
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}
		
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;
		
		// [���Ԉ���]�Ǎ�(�v�Z)�pSQL
		String sql =
			 "SELECT"
			+" SUM(ALCD_QTY)-SUM(ISSUEED_QTY) "
			+"FROM"
			+" T_JOB_ODR_ALC "
			+"WHERE"
			+" PLANT_CD =?"
			+" AND ITEM_CD = ?"
			+" AND JOB_ODR_CD = ?"
			+" AND JOB_ODR_DETAIL_NO = ?"
			+" AND ALC_STOCK_TYP = " + RcvIssueConst.ALC_STOCK_JOB_ODR;
		
		try{

			BigDecimal calcResult = cZero;
			
			// [���Ԉ���]�̓Ǎ�(�v�Z)�������s
			selectStmt = _conn.getConn().prepareStatement(sql);
			selectStmt.setString(1, iPlantCd);
			selectStmt.setString(2, iItemCd);
			selectStmt.setString(3, iJobOdrCd);
			selectStmt.setInt(4, iJobOdrDetailNo);
			selectRslt = selectStmt.executeQuery();
			
			selectRslt.next();
			if( selectRslt.getBigDecimal(1) != null ){
				calcResult = selectRslt.getBigDecimal(1);
			}
			
			return calcResult;
			
		}finally{
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}
	
	/**
	 * <pre>
	 * <b>�I�[�_���A�o�ɗ݌v���A�o�ɍϑ����̎擾</b><br>
	 * ����̃I�[�_�f�}���h�̃I�[�_���A�o�ɗ݌v���A�o�ɍϑ���
	 * ���擾����B
	 * </pre>
	 *
	 * @param iOdNo �I�[�_�f�}���h�ԍ�
	 * @return boolean true/false �Ώۃf�[�^�����݂��Ȃ��ꍇfalse
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	private boolean read(String iOdNo) throws SQLException
	{
		
		PreparedStatement selectStmtTOd = null;
		ResultSet selectRsltTOd = null;
		PreparedStatement selectStmtTJobOdrAlc = null;
		ResultSet selectRsltTJobOdrAlc = null;


		/** [���v��]�Ǎ� SQL */
		String sqlTOd = 
			"SELECT"
			+" ODR_QTY,"
			+" TOTAL_ISSUE_QTY,"
			+" JOB_ODR_CD,"
			+" JOB_ODR_DETAIL_NO "
			+"FROM"
			+" T_OD "
			+"WHERE"
			+" OD_NO = ?";

		/** [���Ԉ���]�Ǎ� SQL */
		String sqlTJobOdrAlc = 
			"SELECT"
			+" SUM(ISSUEED_QTY) "
			+"FROM"
			+" T_JOB_ODR_ALC "
			+"WHERE"
			+" OD_NO = ?";
		
		try {
			initialize();
			
			// [���v��]�̓Ǎ��������s
			selectStmtTOd = _conn.getConn().prepareStatement(sqlTOd);
			selectStmtTOd.setString(1, iOdNo);
			selectRsltTOd = selectStmtTOd.executeQuery();

			// �������ʂ̃Z�b�g�i�I�[�_���A�o�ɗ݌v���j
			if(selectRsltTOd.next()){
				_odrQty = selectRsltTOd.getBigDecimal(1);
				_totalIssueQty = selectRsltTOd.getBigDecimal(2);
				_jobOdrCd = selectRsltTOd.getString(3);
				_jobOdrDetailNo = selectRsltTOd.getInt(4);
			} else {
				return false;
			}
			
			// [���Ԉ���]�̓Ǎ��������s
			selectStmtTJobOdrAlc = _conn.getConn().prepareStatement(sqlTJobOdrAlc);
			selectStmtTJobOdrAlc.setString(1, iOdNo);
			selectRsltTJobOdrAlc = selectStmtTJobOdrAlc.executeQuery();

			// �������ʂ̃Z�b�g�i�o�ɍϑ����j
			selectRsltTJobOdrAlc.next();
			if(selectRsltTJobOdrAlc.getBigDecimal(1) != null){
				_issueedQty = selectRsltTJobOdrAlc.getBigDecimal(1);
			} else {
				_issueedQty = cZero;
			}
			
			return true;

		} finally {
			this.closeResultSet(selectRsltTOd);
			this.closePreparedStatement(selectStmtTOd);
			this.closeResultSet(selectRsltTJobOdrAlc);
			this.closePreparedStatement(selectStmtTJobOdrAlc);
		}
	}
	
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
				e.printStackTrace();
			} finally {
				statement = null;
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
				e.printStackTrace();
			} finally {
				resultset = null;
			}
		}
	}
}
