/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/util/CommonOd.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

//package com.nec.jp.orteus.expj.mrp;
package com.nec.jp.orteus.expj.util;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;
import java.math.BigDecimal;

import com.nec.jp.orteus.expj.util.WorkCalendar;
import com.nec.jp.orteus.expj.util.Numbering;
import com.nec.jp.orteus.expj.systemlog.SystemLog;
import com.nec.jp.orteus.xaf.util.FoundationException;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;

/**
 * <pre>
 * ���v�ʂ̋��ʏ������s��
 *	 - ���v�ʏ����敪�ύX				  changeMrpTypToDelete
 *	 - �I�[�_�f�}���h���X�V(�v��ύX�p) changeOdInfo
 *	 - �I�[�_�f�}���h���ǉ�			  addOdInfo
 *	 - �I�[�_���X�V/�����p			  changeOrderForComplete
 *	 - �I�[�_���X�V/���������p		  changeOrderForCancel
 *	 - �f�}���h���X�V/�����p			  changeDemandForComplete
 *	 - �f�}���h���X�V/���������p		  changeDemandForCancel
 *	 - �I�[�_���X�V/���ɗp			  updateOrderForReceiveOld
 *	 - �f�}���h���X�V/�o�ɗp			  updateDemandForIssue
 *
 * �EEXPLANNER(VB��)�Ɠ����d�l�ō쐬���Ă���܂�
 * �EJava�̃o�[�W���� 1.4.1 �ŃR���p�C�����Ă��܂��B1.4 �ȏ�łȂ��Ɠ��삵�܂���
 * �E�f�[�^�x�[�X�֍X�V���s���Ă��܂����A�g�����U�N�V�����͐��䂵�Ă��܂���B�Ăяo�����Ƃ̃v���O�����Ő��䂵�Ă��������B
 * �E�f�[�^�x�[�X�R�l�N�V�������(IDbConnection)�̓R���X�g���N�^�œn���Ă��������B
 *
 * ���̃N���X��������́ASQLException�ƁAApsComException����������\��������܂��B
 * ApsComException�̃G���[�ԍ��ƃG���[���b�Z�[�W�͈ȉ��̒ʂ�ł��B(�ԍ��̐擪��'AC'�Ƃ����������t������܂�)
 *
 *	50031, �����ԍ��������͂ł�
 *	50040, ��ƌv��ԍ��������͂ł�
 *	50261, ����������������͂ł�
 *	50304, �d�|�������������͂ł�
 *	50416, ��ᕪ���b�g�T�C�Y�������͂ł�
 *	50417, ���i�\����ᕪ���b�g�T�C�Y�������͂ł�
 *	50502, �J�����_���׃f�[�^�����݂��܂���
 *	50509, �i�ڃf�[�^�����݂��܂���
 *	50553, �I�[�_�f�}���h�ԍ��̔ԃf�[�^�����݂��܂���
 *	50700, �Ώۃf�[�^�����݂��܂���
 *	50802, ���ɑ��҂ɂ���čX�V����Ă��܂�
 * </pre>
 *
 * @author $Author: geng-jia $
 * @version $Revision: 1.17 $ $Date: 2015/12/03 09:06:20 $
 */

public class CommonOd {

	private IDbConnection _iconn;				 // �g�����U�N�V�����R�l�N�V�������
	private Connection _conn;					 // �R�l�N�V�������
	private String _plantCd;					 // �H��R�[�h
	private UserInfo _userInfo; 				 // ���p�ҊǗ����(�C���i�[�N���X)
	private Log _log;							 // ���O���(�C���i�[�N���X)

	/**
	 * �R���X�g���N�^
	 * new����Ƃ��ɂ͉��L�̃p�����[�^�𑗂�B�H��R�[�h,���[�UID,�Ɩ����͕ʓrsetter�Őݒ肵�������Ƃ��\
	 *
	 * @param conn �R�l�N�V�������
	 * @param plantCd �H��R�[�h
	 * @param userId ���[�UID
	 * @param businessName �Ɩ���
	 */
	public CommonOd(IDbConnection conn, String plantCd, String userId, String businessName) {

		_iconn = conn;
		_conn = _iconn.getConn();
		_plantCd = plantCd;
		_userInfo = new UserInfo(userId,businessName);

		// ���O�p���i�̏��������s��
		String packageName = this.getClass().getName();
		packageName = packageName.substring(0,packageName.lastIndexOf("."));
		_log = new Log(packageName,_iconn); 										// 2003/08/11
	}
	// setter
	public void setPlantCd(String plantCd) {
		this._plantCd = plantCd;
	}
	public void setUserId(String userId) {
		_userInfo.userId = userId;
	}
	public void setBusinessName(String businessName) {
		_userInfo.businessName = businessName;
	}

	/**
	 * �I�[�_���X�V(���ɏ����p)
	 * ���������ƂɃI�[�_���̍X�V�������s���B(1.1.1.1�̏���)
	 *
	 * @param odNo �I�[�_�f�}���h�ԍ�
	 * @param rcvQty ���ɐ���
	 * @param modifyCount �Ǎ��ݎ��̍X�V��(�`�F�b�N���Ȃ��ꍇ�̓}�C�i�X�l��ݒ�)
	 * @throws SQLException
	 * @throws ApsComException
	 */
	public void updateOrderForReceive(String odNo, double rcvQty, long modifyCount)
			throws SQLException,ApsComException {

		PreparedStatement ps = null;
		try {
			_log.methodStart();
			String sql;

			// �X�V���`�F�b�N
			this.checkModifyCount(odNo,modifyCount);

			// ���Ɋ������̌v�Z
			Date rcvCmpltDate = getRcvCmpltDate(odNo);

			// << ���v�ʂ̍X�V >>
			if ( rcvCmpltDate != null ) {

				sql = "update T_OD set"
					+ " RCV_CMPLT_DATE = ?" 							  // ���Ɋ�����
					+ ",ODR_STS_TYP = 9"								  // �I�[�_��ԋ敪=9:����
					+ ",TOTAL_RCV_QTY = TOTAL_RCV_QTY + " + rcvQty		  // ���ɗ݌v��
					+ ",UPDATED_DATE = ?"
					+ ",UPDATED_BY = ?"
					+ ",UPDATED_PRG_NM = ?"
					+ ",MODIFY_COUNT = MODIFY_COUNT + 1 "
					+ "where OD_NO = ?";
				ps = _conn.prepareStatement(sql);
				ps.setTimestamp(1, new Timestamp(rcvCmpltDate.getTime()));
				ps.setTimestamp(2, new Timestamp(new Date().getTime()));
				ps.setString(3, _userInfo.getUserId());
				ps.setString(4, _userInfo.getBusinessName());
				ps.setString(5, odNo);
				ps.execute();
				ps.close();

				//this.changeCommon(odNo);

				// < ���Ԍv��̍X�V >
				// �X�V���ꂽ[���v��]�����Ԃ̍ŏ�ʕi�ڂ������ꍇ�A
				// [���Ԍv��]."���ԏ�ԋ敪"��'9:����'�ɍX�V
				this.updateJobOdr(odNo, 9);

			} else {

				sql = "update T_OD set"
					+ " RCV_CMPLT_DATE = null"							  // ���Ɋ�����
					+ ",ODR_STS_TYP = 2"								  // �I�[�_��ԋ敪=2:�m��(����)
					+ ",TOTAL_RCV_QTY = TOTAL_RCV_QTY + " + rcvQty		  // ���ɗ݌v��
					+ ",UPDATED_DATE = ?"
					+ ",UPDATED_BY = ?"
					+ ",UPDATED_PRG_NM = ?"
					+ ",MODIFY_COUNT = MODIFY_COUNT + 1 "
					+ "where OD_NO = ?";
				ps = _conn.prepareStatement(sql);
				ps.setTimestamp(1, new Timestamp(new Date().getTime()));
				ps.setString(2, _userInfo.getUserId());
				ps.setString(3, _userInfo.getBusinessName());
				ps.setString(4, odNo);
				ps.execute();
				ps.close();

				//this.changeCommon(odNo);
			}

			_log.methodEnd();
		}
		finally {
			if (ps != null)
			{
				ps.close();
			}
		}
	}

	/**
	 * ���Ɋ������̌v�Z
	 * ���Ɋ����� = [�i�ڕʎd�|]."��Ɗ�����"��[�����c]."����������"�̒x����
	 * 1.1.1.1 ����сA1.1.3.1 �ŗ��p
	 *
	 * @param odNo �I�[�_�f�}���h�ԍ�
	 * @return ���Ɋ����� or null
	 * @throws SQLException
	 */
	private Date getRcvCmpltDate(String odNo)
			throws SQLException {

		// 2003/09/16 ���\�b�h�̓����̓����ŁA���Ɋ������̎擾���s���ɂȂ�ꍇ���������̂�
		// �������W�b�N���������A�C�����܂����B(SQL���̏C���͂���܂���)

		PreparedStatement ps = null;
		Date rcvCmpltDate = null;
		ResultSet rsWorkInProcByItem = null;
		ResultSet rsRlsdPuchOdr = null;
		try {
			_log.methodStart();
			String sql;

			rcvCmpltDate = null;									  // ���Ɋ�����
			// << �i�ڕʎd�|�̌��� >>
			sql = "select * from T_WORK_IN_PROC_BY_ITEM "
				+ "where OD_NO = ? "
				+ "order by WORK_CMPLT_DATE desc";						  // ��Ɗ������̍~��
			ps = _conn.prepareStatement(sql);
			ps.setString(1, odNo);
			rsWorkInProcByItem = ps.executeQuery();

			// �i�ڕʎd�|�̌����f�[�^�̒�����i�ڕʍ�Ə�ԋ敪=9(����)������΁A
			// ���Ɋ������̌��Ƃ��čŒx��Ɗ�������ێ�����B
			Timestamp workDate = null;
			boolean odrStsCheckFlg = true;
			while ( rsWorkInProcByItem.next() ) {
				if ( workDate == null ) {
					workDate = rsWorkInProcByItem.getTimestamp("WORK_CMPLT_DATE");
				}
				if ( rsWorkInProcByItem.getInt("WORK_STS_TYP") != 9 ) {
					odrStsCheckFlg = false;
					break;
				}
			}
			rsWorkInProcByItem.close();
			ps.close();
			if (odrStsCheckFlg) {
				rcvCmpltDate = workDate;
			}

			// << �����c�̌��� >>
			sql = "select * from T_RLSD_PUCH_ODR "
				+ "where OD_NO = ? "
				+ "and WORK_ODR_CD is null "							  // ��ƌv��ԍ�=null
				+ "order by INSPC_CMPLT_DATE desc"; 					  // �����������̍~��
			ps = _conn.prepareStatement(sql);
			ps.setString(1, odNo);
			rsRlsdPuchOdr = ps.executeQuery();

			// �����c�̌����f�[�^�̒����猟�������t���O=1(����)������΁A
			// ���Ɋ������̌��Ƃ��čŒx������������ێ�����B
			Timestamp inspcDate = null;
			boolean existRlsdPuchOdr = false;
			while ( rsRlsdPuchOdr.next() ) {
				if ( inspcDate == null ) {
					inspcDate = rsRlsdPuchOdr.getTimestamp("INSPC_CMPLT_DATE");
				}
				if ( rsRlsdPuchOdr.getInt("INSPC_CMPLT_FLG") != 1 ) {
					odrStsCheckFlg = false;
					break;
				}
			}
			rsRlsdPuchOdr.close();
			ps.close();

			// ���Ɋ����� = [�i�ڕʎd�|]."��Ɗ�����"��[�����c]."����������"�̒x����
			if (odrStsCheckFlg) {
				if ( rcvCmpltDate == null ) {
					rcvCmpltDate = inspcDate;
				} else {
					if ( inspcDate != null ) {			   // 2003/10/14 update
						rcvCmpltDate = inspcDate.after(workDate) ? inspcDate : workDate;
					}
				}
			}

/****
			// << �i�ڕʎd�|�̌��� >>
			sql = "select * from T_WORK_IN_PROC_BY_ITEM "
				+ "where OD_NO = ? "
				+ "order by WORK_CMPLT_DATE desc";						  // ��Ɗ������̍~��
			ps = _conn.prepareStatement(sql);
			ps.setString(1, odNo);
			ResultSet rsWorkInProcByItem = ps.executeQuery();

			// �i�ڕʎd�|�̌����f�[�^�̒�����i�ڕʍ�Ə�ԋ敪=9(����)������΁A
			// ���Ɋ������̌��Ƃ��čŒx��Ɗ�������ێ�����B
			Timestamp workDate = null;
			boolean existWorkInProcByItem = false;
			while ( rsWorkInProcByItem.next() ) {
				if ( workDate == null ) {
					workDate = rsWorkInProcByItem.getTimestamp("WORK_CMPLT_DATE");
				}
				if ( rsWorkInProcByItem.getInt("WORK_STS_TYP") == 9 ) {
					existWorkInProcByItem = true;
					break;
				}
			}
			rsWorkInProcByItem.close();
			ps.close();

			// << �����c�̌��� >>
			sql = "select * from T_RLSD_PUCH_ODR "
				+ "where OD_NO = ? "
				+ "and WORK_ODR_CD is null "							  // ��ƌv��ԍ�=null
				+ "order by INSPC_CMPLT_DATE desc"; 					  // �����������̍~��
			ps = _conn.prepareStatement(sql);
			ps.setString(1, odNo);
			ResultSet rsRlsdPuchOdr = ps.executeQuery();

			// �����Z�̌����f�[�^�̒����猟�������t���O=1(����)������΁A
			// ���Ɋ������̌��Ƃ��čŒx������������ێ�����B
			Timestamp inspcDate = null;
			boolean existRlsdPuchOdr = false;
			while ( rsRlsdPuchOdr.next() ) {
				if ( inspcDate == null ) {
					inspcDate = rsRlsdPuchOdr.getTimestamp("INSPC_CMPLT_DATE");
				}
				if ( rsRlsdPuchOdr.getInt("INSPC_CMPLT_FLG") == 1 ) {
					existRlsdPuchOdr = true;
					break;
				}
			}
			rsRlsdPuchOdr.close();
			ps.close();

			// ���Ɋ����� = [�i�ڕʎd�|]."��Ɗ�����"��[�����c]."����������"�̒x����
			if (existWorkInProcByItem && existRlsdPuchOdr) {
				rcvCmpltDate = inspcDate.after(workDate) ? inspcDate : workDate;
			}

****/
			_log.methodEnd();
		}
		finally {
			if (ps != null)
			{
				ps.close();
			}
			if (rsWorkInProcByItem != null) {
				try {
					rsWorkInProcByItem.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rsWorkInProcByItem = null;
			}
			if (rsRlsdPuchOdr != null) {
				try {
					rsRlsdPuchOdr.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rsRlsdPuchOdr = null;
			}
		}
		return rcvCmpltDate;
	}

	/**
	 * �f�}���h���X�V(�o�ɏ����p)
	 * ���������ƂɃf�}���h���̍X�V�������s���B(1.1.1.2�̏���)
	 *
	 * @param workOdrCd ��ƌv��ԍ�
	 * @param puchOdrCd �����ԍ�
	 * @param odNo �I�[�_�f�}���h�ԍ�
	 * @param issueQty �o�ɐ���
	 * @param modifyCount �Ǎ��ݎ��̍X�V��(�`�F�b�N���Ȃ��ꍇ�̓}�C�i�X�l��ݒ�)
	 * @throws SQLException
	 */
	public void updateDemandForIssue(String workOdrCd, String puchOdrCd,
									 String odNo, double issueQty, long modifyCount )
			throws SQLException,ApsComException {

		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			_log.methodStart();
			String sql;

			// �X�V���`�F�b�N
			this.checkModifyCount(odNo,modifyCount);

			// << ��ʃI�[�_�f�}���h�ԍ��̎擾 >>
			if ( workOdrCd == null || workOdrCd.equals("") ) {
				if ( puchOdrCd == null || puchOdrCd.equals("") ) {
					throw new ApsComException(50040,"(SBM0980) ��ƌv��ԍ��������͂ł�");
				} else {
					// �����Z�̌���
					sql = "select * from T_RLSD_PUCH_ODR where PUCH_ODR_CD = ?";
					ps = _conn.prepareStatement(sql);
					ps.setString(1, puchOdrCd);
				}
			} else {
				// �i�ڕʎd�|�̌���
				sql = "select * from T_WORK_IN_PROC_BY_ITEM where WORK_ODR_CD = ?";
				ps = _conn.prepareStatement(sql);
				ps.setString(1, workOdrCd);
			}
			String parentOdNo = "";
			rs = ps.executeQuery();
			if ( rs.next() ) {
				parentOdNo = rs.getString("OD_NO");
			}
			rs.close();
			ps.close();

			// << �o�Ɏw����Ԃ̃`�F�b�N >>
			boolean issueInstFlg = true;
			// �i�ڕʎd�|�̃`�F�b�N
			sql = "select count(*) from T_WORK_IN_PROC_BY_ITEM "
				+ "where OD_NO = ? "
				+ "and ( WORK_STS_TYP = 2 or WORK_STS_TYP = 9 )";		  // �i�ڕʍ�Ə�ԋ敪=2:�w���ς�/9:����
			ps = _conn.prepareStatement(sql);
			ps.setString(1, parentOdNo);
			rs = ps.executeQuery();
			rs.next();
			if	( rs.getInt(1) != 0 ) {
				issueInstFlg = false;
			}
			rs.close();
			ps.close();

			// �����c�̃`�F�b�N
			sql = "select count(*) from T_RLSD_PUCH_ODR "
				+ "where OD_NO = ? "
				+ "and ( PUCH_ODR_STS_TYP = 2 or PUCH_ODR_STS_TYP = 9 )"; // ������ԋ敪=2:�w���ς�/9:�������
			ps = _conn.prepareStatement(sql);
			ps.setString(1, parentOdNo);
			rs = ps.executeQuery();
			rs.next();
			if	( rs.getInt(1) != 0 ) {
				issueInstFlg = false;
			}
			rs.close();
			ps.close();

			// << �o�Ɋ�����Ԃ̃`�F�b�N,�Ēx�o�Ɋ������̎Z�o >>
			boolean issueCmpltFlg = true;
			Date issueCmpltDate = null;

			sql = "select * from T_ISSUE_INST "
				+ "where OD_NO = ? "
				+ "order by ISSUE_CMPLT_DATE desc"; 					  // �o�Ɋ�����
			ps = _conn.prepareStatement(sql);
			ps.setString(1, odNo);
			rs = ps.executeQuery();
			if(rs.getRow() == 0) {
				issueCmpltFlg = false;
			} else {
				while ( rs.next() ) {
					if ( issueCmpltDate == null ) {
						issueCmpltDate = rs.getTimestamp("ISSUE_CMPLT_DATE");
					}
					if ( rs.getInt("ISSUE_CMPLT_FLG") != 1 ) {				  // �o�Ɋ����t���O
						issueCmpltFlg = false;
						break;
					}
				}
			}
			
			rs.close();
			ps.close();

			// << ���v�ʂ̍X�V >>
			if ( issueInstFlg && issueCmpltFlg ) {

				sql = "update T_OD set"
					+ " ISSUE_CMPLT_DATE = ?"							  // �o�Ɋ�����
					+ ",DM_STS_TYP = 9" 								  // �f�}���h��ԋ敪=9:����
					+ ",TOTAL_ISSUE_QTY = TOTAL_ISSUE_QTY - " + issueQty  // �o�ɗ݌v��
					+ ",UPDATED_DATE = ?"
					+ ",UPDATED_BY = ?"
					+ ",UPDATED_PRG_NM = ?"
					+ ",MODIFY_COUNT = MODIFY_COUNT + 1 "
					+ "where OD_NO = ?";
				ps = _conn.prepareStatement(sql);
				ps.setTimestamp(1, new Timestamp(issueCmpltDate.getTime()));
				ps.setTimestamp(2, new Timestamp(new Date().getTime()));
				ps.setString(3, _userInfo.getUserId());
				ps.setString(4, _userInfo.getBusinessName());
				ps.setString(5, odNo);
				ps.execute();
				//this.changeCommon(odNo);

			} else {

				sql = "update T_OD set"
					+" ISSUE_CMPLT_DATE = null" 						  // �o�Ɋ�����
					+",DM_STS_TYP = 2"									  // �I�[�_��ԋ敪=2:�m��(������)
					+",TOTAL_ISSUE_QTY = TOTAL_ISSUE_QTY - " + issueQty   // �o�ɗ݌v��
					+ ",UPDATED_DATE = ?"
					+ ",UPDATED_BY = ?"
					+ ",UPDATED_PRG_NM = ?"
					+ ",MODIFY_COUNT = MODIFY_COUNT + 1 "
					+ "where OD_NO = ?";
				ps = _conn.prepareStatement(sql);
				ps.setTimestamp(1, new Timestamp(new Date().getTime()));
				ps.setString(2, _userInfo.getUserId());
				ps.setString(3, _userInfo.getBusinessName());
				ps.setString(4, odNo);
				ps.execute();

			}
			ps.close();


			_log.methodEnd();
		}
		finally {
			if (ps != null)
			{
				ps.close();
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rs = null;
			}
		}
	}
	//==========================================================================
	/**
	 * �I�[�_�f�}���h���ǉ�
	 * ���������Ƃɏ��v�ʂ̃I�[�_���R�[�h����щ��ʃf�}���h���R�[�h�̒ǉ����s���A
	 * �ǉ������I�[�_���R�[�h�̃I�[�_�f�}���h�ԍ���Ԃ��B
	 *
	 * @param itemCd �i�ڔԍ�
	 * @param prdDueDate �����[��/�����[��
	 * @param prdStartDate ���������/�����\���
	 * @param odrQty �I�[�_����(��Ǝw����/������)
	 * @param odGnrTyp ���v�ʔ��������敪(�H���Ǘ���3:��ƌv�悩��o�^���w��/�w���Ǘ���2:�����v�悩��o�^���w��)
	 * @return �ǉ������I�[�_���R�[�h�̃I�[�_�f�}���h�ԍ�
	 * @throws SQLException
	 * @throws ApsComException
	 */
	public String addOdInfo(String itemCd, Date prdDueDate, Date prdStartDate,
							double odrQty, int odGnrTyp )
			throws SQLException,ApsComException {

		PreparedStatement ps = null;
		String odNo = null;
		ResultSet rsItem = null;
		try {
			_log.methodStart();

			// ��z������̌v�Z
			String sql = "select * from M_ITEM where ITEM_CD = ? ";
			ps = _conn.prepareStatement(sql);
			ps.setString(1, itemCd);
			rsItem = ps.executeQuery();
			Date odrStartDate = null;
			if ( rsItem.next() ) {
				int difference = rsItem.getInt("ODR_LT");				  // ������ ��z���[�h�^�C��
				odrStartDate = this.calcOdrStartDate(difference,prdStartDate,itemCd);

			}
			rsItem.close();
			ps.close();
			// << ���v�ʂփI�[�_�[����ǉ����� >>
			odNo = this.getNewOdNo();							  // �I�[�_�f�}���h�ԍ��̔�
			this.insertOd(odNo,itemCd,odrStartDate,prdDueDate,prdStartDate,odrQty,odGnrTyp);

			// << ���ʕi�ڂ̃f�}���h���̒ǉ� >>	2003/09/02 update
			//this.makeUnderDemand(itemCd,odNo,prdDueDate,odrStartDate,odrQty,odGnrTyp,2);
			this.makeUnderDemand(itemCd,odNo,prdDueDate,odrStartDate,odrQty,odGnrTyp,1);

			_log.methodEnd();
		}
		finally {
			if (ps != null)
			{
				ps.close();
			}
			if (rsItem != null){
				try{
					rsItem.close();
				}catch(Exception e){
					e.printStackTrace();
				}
				rsItem = null;
			}
		}
		return odNo;
	}

	/**
	 * ���v�ʂ̒ǉ�
	 * (1.1.2.1�̃��C������)
	 *
	 * @param odNo �̔Ԃ��ꂽ�I�[�_�f�}���h�ԍ�
	 * @param itemCd �i�ڔԍ�
	 * @param odrStartDate ��z�����(�ғ����x�[�X�Ōv�Z���ꂽ����)
	 * @param prdDueDate �����[��/�����[��
	 * @param prdStartDate ���������/�����\���
	 * @param odrQty �I�[�_����(��Ǝw����/������)
	 * @param odGnrTyp ���v�ʔ��������敪(�H���Ǘ���3:��ƌv�悩��o�^���w��/�w���Ǘ���2:�����v�悩��o�^���w��)
	 * @throws SQLException
	 * @throws ApsComException
	 */
	private void insertOd(String odNo, String itemCd, Date odrStartDate,
						  Date prdDueDate,Date prdStartDate, double odrQty, int odGnrTyp )
			throws SQLException,ApsComException {

		PreparedStatement ps = null;
		ResultSet rsItem = null;
		PreparedStatement pstmt = null;
		try {
			_log.methodStart();

			// << �i�ڂ̌��� >>
			String sql = "select * from M_ITEM where ITEM_CD = ? ";
			ps = _conn.prepareStatement(sql);
			ps.setString(1, itemCd);
			rsItem = ps.executeQuery();

			if ( rsItem.next() ) {

				String sodrStartDate = getMySimpleDateFormat().format(odrStartDate);
				String sprdDueDate = getMySimpleDateFormat().format(prdDueDate);
				String sprdStartDate = getMySimpleDateFormat().format(prdStartDate);

				sql = "insert into T_OD ( "
					+ " OD_NO"					 // �I�[�_�f�}���h�ԍ�
					+ ",ALC_GRP_CD" 			 // �����O���[�v�R�[�h
					+ ",PLANT_CD"				 // �H��R�[�h
					+ ",ITEM_CD"				 // �i�ڔԍ�
					+ ",PS_EDITION" 			 // ���v�ʕi�ڍ\���Ő�
					+ ",JOB_ODR_CD" 			 // ����
					+ ",JOB_ODR_DETAIL_NO"		 // ���Ԏ}��
					+ ",JOB_ODR_CANCEL_NO"		 // ���Ԏ�������ԍ�
					+ ",ODR_STS_TYP"			 // �I�[�_��ԋ敪
					+ ",DM_STS_TYP" 			 // �f�}���h��ԋ敪
					+ ",OD_TYP" 				 // �I�[�_�f�}���h�敪
					+ ",DUE_DATE"				 // �v���[��
					+ ",ODR_START_DATE" 		 // ��z�����
					+ ",PRD_DUE_DATE"			 // �����[��
					+ ",PRD_START_DATE" 		 // ���������
					+ ",DM_QTY" 				 // �f�}���h��
					+ ",ODR_QTY"				 // �I�[�_��
					+ ",MRP_ODR_TYP"			 // �i�ڎ�z�敪
					+ ",OUTSIDE_TYP"			 // ���v�ʓ��O��敪
					+ ",ISSUE_TYP"				 // ���v�ʏo�ɋ敪
					+ ",ODR_LT" 				 // ��z���[�h�^�C��
					+ ",FIXED_LT"				 // �Œ蕪���[�h�^�C��
					+ ",PROP_LT"				 // ��ᕪ���[�h�^�C��
					+ ",SAFETY_LT"				 // ���S����
					+ ",ISSUE_LT"				 // ���o���[�h�^�C��
					+ ",PROP_LOT_SIZE"			 // ��ᕪ���b�g�T�C�Y
					+ ",PS_LT_FLG"				 // ���i�\�����[�h�^�C���g�p�t���O
					+ ",PS_FIXED_LT"			 // ���i�\���Œ蕪���[�h�^�C��
					+ ",PS_PROP_LT" 			 // ���i�\����ᕪ���[�h�^�C��
					+ ",PS_PROP_LOT_SIZE"		 // ���i�\����ᕪ���b�g�T�C�Y
					+ ",PS_UNIT_QTY"			 // ���i�\���P�ʐ�	  ����
					+ ",PS_UNIT_NUMERATOR"		 // ���i�\���P�ʐ����q ����
					+ ",PS_UNIT_DENOMINATOR"	 // ���i�\���P�ʐ����� ����
					+ ",TOTAL_RCV_QTY"			 // ���ɗ݌v��
					+ ",RCV_CMPLT_DATE" 		 // ���Ɋ�����
					+ ",TOTAL_ISSUE_INST_QTY"	 // �o�Ɏw���݌v��
					+ ",TOTAL_ISSUE_QTY"		 // �o�ɗ݌v��
					+ ",ISSUE_CMPLT_DATE"		 // �o�Ɋ�����
					+ ",OD_GNR_TYP" 			 // ���v�ʔ��������敪
					+ ",OD_LEVEL_NO"			 // ���v�ʃ��x���ԍ�
					+ ",PARENT_OD_NO"			 // �e�I�[�_�f�}���h�ԍ�
					+ ",ITEM_SPOIL" 			 // ���v�ʕi�ڎd����
					+ ",PS_SPOIL"				 // ���v�ʍ\���d����
					+ ",CONS_TYP"				 // �\���x���敪
					+ ",EFF_PHASE_IN_DATE"		 // ���v�ʗL���J�n��
					+ ",EFF_PHASE_OUT_DATE" 	 // ���v�ʗL���I����
					+ ",MRP_TYP"				 // ���v�ʏ����敪
					+ ",EXTERNAL_DM_FLG"		 // �O���f�}���h�t���O
					+ ",ODR_RELEASE_FLG"		 // �I�[�_�����σt���O
					+ ",CREATED_BY" 			 // �쐬��
					+ ",CREATED_PRG_NM" 		 // �쐬�v���O������
					+ ",UPDATED_BY" 			 // �X�V��
					+ ",UPDATED_PRG_NM" 		 // �X�V�v���O������
					+ ",MODIFY_COUNT"			 // �X�V��

					+ ") values ("

					+ "?"							 // �I�[�_�f�}���h�ԍ�
					+ ",null"									 // �����O���[�v�R�[�h
					+ ",?" 					 // �H��R�[�h
					+ ",?"	 // �i�ڔԍ�
					+ ",null"									 // ���v�ʕi�ڍ\���Ő�
					+ ",null"									 // ����
					+ ",0"										 // ���Ԏ}��
					+ ",0"										 // ���Ԏ�������ԍ�
					+ ",2"										 // �I�[�_��ԋ敪
					+ ",0"										 // �f�}���h��ԋ敪
					+ ",2"										 // �I�[�_�f�}���h�敪
					+ ",null"									 // �v���[��
					+ ",TO_DATE(?,'YYYY/MM/DD HH24:MI:ss')" // ��z�����
					+ ",TO_DATE(?,'YYYY/MM/DD HH24:MI:ss')" // �����[��
					+ ",TO_DATE(?,'YYYY/MM/DD HH24:MI:ss')" // ���������
					+ ",0"										 // �f�}���h��
					+ ",?"								 // �I�[�_��
					+ ",?"		 // �i�ڎ�z�敪
					+ ",?"		 // ���v�ʓ��O��敪
					+ ",?"			 // ���v�ʏo�ɋ敪
					+ ",?" 			 // ��z���[�h�^�C��
					+ ",?"			 // �Œ蕪���[�h�^�C��
					+ ",?"			 // ��ᕪ���[�h�^�C��
					+ ",?"			 // ���S����
					+ ",?"			 // ���o���[�h�^�C��
					+ ",?"	 // ��ᕪ���b�g�T�C�Y
					+ ",0"										 // ���i�\�����[�h�^�C���g�p�t���O
					+ ",0"										 // ���i�\���Œ蕪���[�h�^�C��
					+ ",0"										 // ���i�\����ᕪ���[�h�^�C��
					+ ",0"										 // ���i�\����ᕪ���b�g�T�C�Y
					+ ",0"										 // ���i�\���P�ʐ�	  ����
					+ ",0"										 // ���i�\���P�ʐ����q ����
					+ ",1"										 // ���i�\���P�ʐ����� ����
					+ ",0"										 // ���ɗ݌v��
					+ ",null"									 // ���Ɋ�����
					+ ",0"										 // �o�Ɏw���݌v��
					+ ",0"										 // �o�ɗ݌v��
					+ ",null"									 // �o�Ɋ�����
					+ ",?"							 // ���v�ʔ��������敪
					+ ",1"										 // ���v�ʃ��x���ԍ�
					+ ",null"									 // �e�I�[�_�f�}���h�ԍ�
					+ ",?"		 // ���v�ʕi�ڎd����
					+ ",0"										 // ���v�ʍ\���d����
					+ ",0"										 // �\���x���敪
					+ ",null"									 // ���v�ʗL���J�n��
					+ ",null"									 // ���v�ʗL���I����
					+ ",9"										 // ���v�ʏ����敪
					+ ",0"										 // �O���f�}���h�t���O
					+ ",1"										 // �I�[�_�����σt���O
					+ ",?"		 // �쐬��
					+ ",?"	 // �쐬�v���O������
					+ ",?"		 // �X�V��
					+ ",?"	 // �X�V�v���O������
					+ ",0"										 // �X�V��
					+ ")";

				// # ������ PreparedStatement ���g��Ȃ��B? �������������Ńf�o�b�O���Â炢����B
				pstmt = _conn.prepareStatement(sql);
				pstmt.setString(1, odNo);
				pstmt.setString(2, _plantCd);
				pstmt.setString(3, rsItem.getString("ITEM_CD"));
				pstmt.setString(4, sodrStartDate);
				pstmt.setString(5, sprdDueDate);
				pstmt.setString(6, sprdStartDate);
				pstmt.setDouble(7, odrQty);
				pstmt.setInt(8, rsItem.getInt("MRP_ODR_TYP"));
				pstmt.setInt(9, rsItem.getInt("OUTSIDE_TYP"));
				pstmt.setInt(10, rsItem.getInt("ISSUE_TYP"));
				pstmt.setInt(11, rsItem.getInt("ODR_LT"));
				pstmt.setInt(12, rsItem.getInt("FIXED_LT"));
				pstmt.setInt(13, rsItem.getInt("PROP_LT"));
				pstmt.setInt(14, rsItem.getInt("SAFETY_LT"));
				pstmt.setInt(15, rsItem.getInt("ISSUE_LT"));
				pstmt.setDouble(16, rsItem.getDouble("PROP_LOT_SIZE"));
				pstmt.setInt(17, odGnrTyp);
				pstmt.setDouble(18, rsItem.getDouble("ITEM_SPOIL"));
				pstmt.setString(19, _userInfo.getUserId());
				pstmt.setString(20, _userInfo.getBusinessName());
				pstmt.setString(21, _userInfo.getUserId());
				pstmt.setString(22, _userInfo.getBusinessName());
				int rsRows = pstmt.executeUpdate();
				pstmt.close();
				rsItem.close();
				ps.close();

				//this.changeCommon(odNo);

			} else {
				rsItem.close();
				ps.close();
				throw new ApsComException(50509,"(SBM0981) �i�ڃf�[�^�����݂��܂���");
			}
			_log.methodEnd();
		}
		finally {
			if (ps != null)
			{
				ps.close();
			}
			if (rsItem != null) {
				try {
					rsItem.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rsItem = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				pstmt = null;
			}
		}
	}
	/**
	 * ���v�ʂ̒ǉ�(���ʃf�}���h���̒ǉ�)
	 * (1.1.2.2�̃��C������) ���ۂ�OD�ւ̍X�V�́AinsertOd�ōs���B
	 *
	 * @param itemCd �i�ڔԍ�
	 * @param parentOdNo �e�I�[�_�f�}���h�ԍ�
	 * @param prdDueDate �����[��
	 * @param odrStartDate ��z�����
	 * @param prdStartDate ���������
	 * @param odrQty �I�[�_����(��Ǝw����/������)
	 * @param odGnrTyp ���v�ʔ��������敪(�H���Ǘ���3:��ƌv�悩��o�^���w��/�w���Ǘ���2:�����v�悩��o�^���w��)
	 * @param odLevelNo ���v�ʃ��x���ԍ�
	 * @throws SQLException
	 * @throws ApsComException
	 */
	private void makeUnderDemand(String itemCd, String parentOdNo,Date prdDueDate,
								 Date odrStartDate, double odrQty, int odGnrTyp, int odLevelNo)
			throws SQLException,ApsComException {

		PreparedStatement ps = null;
		ResultSet rsPs = null;
		try {
			_log.methodStart();

			// ���i�\���̌���
			String sql = "select * from M_PS "
					   + "where PARENT_ITEM_CD = ? "			// �e�i�ڔԍ�
					   + "and EFF_PHASE_IN_DATE <= ? "			// ���i�\���L���J�n��
					   + "and EFF_PHASE_OUT_DATE >= ? " 		// ���i�\���L���I����
					   + "and MRP_EXP_TYP = 1 " 				// ���v�ʓW�J�敪 = 1:�W�J����
					   + "order by COMP_ITEM_CD";				// �q�i�ڔԍ�
			ps = _conn.prepareStatement(sql);
			ps.setString(1, itemCd);
			ps.setTimestamp(2, new Timestamp(odrStartDate.getTime()));
			ps.setTimestamp(3, new Timestamp(odrStartDate.getTime()));
			rsPs = ps.executeQuery();

			// ���v�ʃ��x���ԍ������Z
			odLevelNo++;

			// ���ʃf�}���h���̒ǉ�
			while ( rsPs.next() ) {
				this.insertOd(rsPs,parentOdNo,odrQty,odrStartDate,prdDueDate,odGnrTyp,odLevelNo);
			}
			rsPs.close();
			ps.close();

			_log.methodEnd();
		}
		finally {
			if (ps != null)
			{
				ps.close();
			}
			if (rsPs != null) {
				try {
					rsPs.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rsPs = null;
			}
		}
	}

	/**
	 * ���v�ʂ̒ǉ�(���ʃf�}���h���̒ǉ�)
	 * (1.1.2.2�̃��C������ + 1.1.2.3 �̏���)
	 *
	 * @param rsPs ���i�\��(ResultSet)
	 * @param parentOdNo �e�I�[�_�f�}���h�ԍ�
	 * @param parentOdrQty �e�I�[�_����
	 * @param parentOdrStartDate �e��z�����
	 * @param parentPrdDueDate �e�����[��
	 * @param odGnrTyp ���v�ʔ��������敪(�H���Ǘ���3:��ƌv�悩��o�^���w��/�w���Ǘ���2:�����v�悩��o�^���w��)
	 * @param odLevelNo ���v�ʃ��x���ԍ�
	 * @throws SQLException
	 * @throws ApsComException
	 */
	private void insertOd(ResultSet rsPs, String parentOdNo, double parentOdrQty,
						  Date parentOdrStartDate, Date parentPrdDueDate, int odGnrTyp, int odLevelNo )
			throws SQLException,ApsComException {

		PreparedStatement ps = null;
		ResultSet rsItem = null;
		PreparedStatement pstmt = null;
		try {
			_log.methodStart();

			// << �i�ڂ̌��� >>
			String sql = "select * from M_ITEM where ITEM_CD = ? ";
			ps = _conn.prepareStatement(sql);
			ps.setString(1, rsPs.getString("COMP_ITEM_CD"));
			rsItem = ps.executeQuery();

			String odNo = this.getNewOdNo();							  // �I�[�_�f�}���h�ԍ��̔�

			if ( rsItem.next() ) {

				// �I�[�_��ԋ敪,�f�}���h��ԋ敪,�I�[�_�f�}���h�敪--------------------
				// [�i��]."�i�ڎ�z�敪"�� 8:�^���i�� �����ׂ��ꂼ��̋敪��ݒ肷��
				int mrpOdrTyp  = rsItem.getInt("MRP_ODR_TYP");
				int odrStsTyp  = ( mrpOdrTyp == 8 ) ? 9 : 0;	// �I�[�_��ԋ敪(9:����/0:�I�[�_�łȂ�)
				int dmStsTyp   = ( mrpOdrTyp == 8 ) ? 9 : 2;	// �f�}���h��ԋ敪(9:����/2:�m��ς�)
				int odTyp	   = ( mrpOdrTyp == 8 ) ? 4 : 3;	// �I�[�_�f�}���h�敪(4:�^��/3:�f�}���h)
				double psSpoil = ( mrpOdrTyp == 8 ) ? 0 : rsPs.getDouble("PS_SPOIL");  // �\���d����

				// �\���P�ʐ��̐ݒ�--------------------
				double psNumerator = rsPs.getDouble("PS_UNIT_NUMERATOR");	   // �\���P��(���q)
				double psDenominator = rsPs.getDouble("PS_UNIT_DENOMINATOR");  // �\���P��(����)
				// ���� �\���P�ʐ��͊ۂ߂��Ɍv�Z(2003/8/7)
				double psUnitQty = ( psDenominator == 0.0 ) ? psNumerator : psNumerator / psDenominator;

				// �f�}���h���ʂ̐ݒ�--------------------
				double dmQty = 0.0D;
				if ( mrpOdrTyp == 8 ) {
					// �^���i�ڂ̏ꍇ�A�e�̃I�[�_����*�\���P��(�ۂߑO)
					//dmQty = parentOdrQty * psUnitQty;
					dmQty = new BigDecimal(parentOdrQty).multiply(new BigDecimal(psUnitQty)).doubleValue();
				} else {
					// �^���i�ڈȊO�̏ꍇ�A�e�̃I�[�_����*�\���P��(�ۂߑO)*(1+ �\���d����/100)
					dmQty = new BigDecimal(parentOdrQty).multiply(new BigDecimal(psUnitQty).multiply( new BigDecimal("1").add(new BigDecimal(psSpoil / 100D))) ).doubleValue();
				}
				// �݌ɐ��ʒP�ʋ敪(0:����/1:����)�ɂ��ۂ�
				int unitQtyTyp = rsItem.getInt("UNIT_QTY_TYP");
				psUnitQty = changeQtyUp(psUnitQty,unitQtyTyp);
				dmQty = changeQtyUp(dmQty,unitQtyTyp);
				// �v���[��/�����[���̐ݒ�--------------------
				int psLtFlg = rsPs.getInt("PS_LT_FLG"); 					// ���i�\�����[�h�^�C���g�p�t���O
				int psFixedLt = rsPs.getInt("PS_FIXED_LT"); 				// �Œ蕪���[�h�^�C��
				double psPropLotSize = rsPs.getDouble("PS_PROP_LOT_SIZE");	// ���i�\����ᕪ���b�g�T�C�Y
				int psPropLt = rsPs.getInt("PS_PROP_LT");					// ���i�\����ᕪ���[�h�^�C��
				Date dueDate = null;										// �v���[��
				Date prdDueDate = null; 									// �����[��

				// ���i�\�����[�h�^�C���g�p�t���O  0:�g�p���Ȃ�/1:�g�p����
				if ( psLtFlg == 0 ) {
					// �e�̎�z������Ɠ���
					dueDate = parentOdrStartDate;
					// �ғ����`�F�b�N
						dueDate = this.calcOdrStartDate(0,dueDate,rsPs.getString("COMP_ITEM_CD"));
				} else {
					// �e�̐����[�� - �\�����[�h�^�C���Ōv�Z
					if ( psPropLotSize == 0) {
						rsItem.close();
						 _log.methodEnd();
						throw new ApsComException(50417,"(SBM0982) ���i�\����ᕪ���b�g�T�C�Y�������͂ł�");
					}
					// ���i�\����ᕪ���� = �I�[�_��(�e)/���i�\����ᕪ���b�g�T�C�Y (�����ɐ؂�グ)
					int psPropQty = (int) Math.ceil( parentOdrQty / psPropLotSize );
					// ���i�\����ᕪ����=0 �̏ꍇ�A=1�Ƃ���
					if ( psPropQty == 0 ) {
						psPropQty = 1;
					}
					// �\�����[�h�^�C��=���i�\���Œ胊�[�h�^�C�� + ���i�\����჊�[�h�^�C��*���i�\����ᕪ����(�����ɐ؂�グ)
					int psLt = (int) Math.ceil( psFixedLt + ( psPropLt * psPropQty ) );
					// �ғ����`�F�b�N

					dueDate = this.calcOdrStartDate(psLt,parentPrdDueDate,rsPs.getString("COMP_ITEM_CD"));
				}
				// �����[��= �v���[��
				prdDueDate = dueDate;

				// ���v�ʗL���J�n��,�L���I����--------------------
				// [���i�\��]����擾
				java.sql.Date effPhaseInDate = rsPs.getDate("EFF_PHASE_IN_DATE");	// ���v�ʗL���J�n��
				java.sql.Date effPhaseOutDate = rsPs.getDate("EFF_PHASE_OUT_DATE"); // ���v�ʗL���I����

				// �I�[�_�f�}���h�敪=4:�^���̎��̏��� ===================================

				double itemSpoil = rsItem.getDouble("ITEM_SPOIL");		  // �i�ڎd����
				int odrLt = rsItem.getInt("ODR_LT");					  // ��z���[�h�^�C��
				int issueLt = rsItem.getInt("ISSUE_LT");				  // ���o���[�h�^�C��
				int fixedLt = rsItem.getInt("FIXED_LT");				  // �Œ蕪���[�h�^�C��
				double propLotSize = rsItem.getDouble("PROP_LOT_SIZE");   // ��ᕪ���b�g�T�C�Y
				int propLt = rsItem.getInt("PROP_LT");					  // ��ᕪ���[�h�^�C��
				int safetyLt = rsItem.getInt("SAFETY_LT");				  // ���S����
				Date odrStartDate = null;								  // ��z�����
				Date prdStartDate = null;								  // ���������
				double odrQty = 0.0D;									  // �I�[�_��

				if ( odTyp == 4 ) {

					// �I�[�_�� = �f�}���h���� * ( 1 + ( ���v�ʕi�ڎd���� / 100 )-------
					odrQty = dmQty * ( 1 + itemSpoil / 100D );
					odrQty = changeQtyUp(odrQty,unitQtyTyp);   // �ۂߏ���

					// �����[�� = �v���[�� - ���o���[�h�^�C�� (�ғ����`�F�b�N)------------
					prdDueDate = this.calcOdrStartDate(issueLt,dueDate,rsPs.getString("COMP_ITEM_CD"));

					// ��������� = �����[�� - �i�ڃ��[�h�^�C��-------------------------
					if ( propLotSize == 0) {
						rsItem.close();
						 _log.methodEnd();
						throw new ApsComException(50416,"(SBM0983) ��ᕪ���b�g�T�C�Y�������͂ł�");
					}
					int propQty = (int) Math.ceil( odrQty / propLotSize );
					// ��ᕪ����=0 �̏ꍇ�A=1�Ƃ���
					if ( propQty == 0 ) {
						propQty = 1;
					}
					// �i�ڃ��[�h�^�C�� = �Œ胊�[�h�^�C�� + ( ��჊�[�h�^�C�� * ������) + ���S���� (�����ɐ؂�グ)
					int lt = (int) Math.ceil( fixedLt + ( propLt * propQty ) + safetyLt );
					// �ғ����`�F�b�N
					prdStartDate = this.calcOdrStartDate(lt,prdDueDate,rsPs.getString("COMP_ITEM_CD"));

					// ��z����� = �����[�� - ��z���[�h�^�C�� (�ғ����`�F�b�N)-----------
					odrStartDate = this.calcOdrStartDate(odrLt,prdDueDate,rsPs.getString("COMP_ITEM_CD"));
				}
				// SQL���ϊ�
				String sDueDate = getMySimpleDateFormat().format(dueDate); // �v���[��
				String sPrdDueDate = getMySimpleDateFormat().format(prdDueDate); // �����[��
				String sOdrStartDate = null;							  // ��z�����
				String sPrdStartDate = null;							  // ���������
				if ( odrStartDate != null ) {
					sOdrStartDate = getMySimpleDateFormat().format(odrStartDate);
					sPrdStartDate = getMySimpleDateFormat().format(prdStartDate);
				}

				// �X�V����(SQL)--------------------
				sql = "insert into T_OD ( "
					+ " OD_NO"					 // �I�[�_�f�}���h�ԍ�
					+ ",ALC_GRP_CD" 			 // �����O���[�v�R�[�h
					+ ",PLANT_CD"				 // �H��R�[�h
					+ ",ITEM_CD"				 // �i�ڔԍ�
					+ ",PS_EDITION" 			 // ���v�ʕi�ڍ\���Ő�
					+ ",JOB_ODR_CD" 			 // ����
					+ ",JOB_ODR_DETAIL_NO"		 // ���Ԏ}��
					+ ",JOB_ODR_CANCEL_NO"		 // ���Ԏ�������ԍ�
					+ ",ODR_STS_TYP"			 // �I�[�_��ԋ敪
					+ ",DM_STS_TYP" 			 // �f�}���h��ԋ敪
					+ ",OD_TYP" 				 // �I�[�_�f�}���h�敪
					+ ",DUE_DATE"				 // �v���[��
					+ ",ODR_START_DATE" 		 // ��z�����
					+ ",PRD_DUE_DATE"			 // �����[��
					+ ",PRD_START_DATE" 		 // ���������
					+ ",DM_QTY" 				 // �f�}���h��
					+ ",ODR_QTY"				 // �I�[�_��
					+ ",MRP_ODR_TYP"			 // �i�ڎ�z�敪
					+ ",OUTSIDE_TYP"			 // ���v�ʓ��O��敪
					+ ",ISSUE_TYP"				 // ���v�ʏo�ɋ敪
					+ ",ODR_LT" 				 // ��z���[�h�^�C��
					+ ",FIXED_LT"				 // �Œ蕪���[�h�^�C��
					+ ",PROP_LT"				 // ��ᕪ���[�h�^�C��
					+ ",SAFETY_LT"				 // ���S����
					+ ",ISSUE_LT"				 // ���o���[�h�^�C��
					+ ",PROP_LOT_SIZE"			 // ��ᕪ���b�g�T�C�Y
					+ ",PS_LT_FLG"				 // ���i�\�����[�h�^�C���g�p�t���O
					+ ",PS_FIXED_LT"			 // ���i�\���Œ蕪���[�h�^�C��
					+ ",PS_PROP_LT" 			 // ���i�\����ᕪ���[�h�^�C��
					+ ",PS_PROP_LOT_SIZE"		 // ���i�\����ᕪ���b�g�T�C�Y
					+ ",PS_UNIT_QTY"			 // ���i�\���P�ʐ�	  ����
					+ ",PS_UNIT_NUMERATOR"		 // ���i�\���P�ʐ����q ����
					+ ",PS_UNIT_DENOMINATOR"	 // ���i�\���P�ʐ����� ����
					+ ",TOTAL_RCV_QTY"			 // ���ɗ݌v��
					+ ",RCV_CMPLT_DATE" 		 // ���Ɋ�����
					+ ",TOTAL_ISSUE_INST_QTY"	 // �o�Ɏw���݌v��
					+ ",TOTAL_ISSUE_QTY"		 // �o�ɗ݌v��
					+ ",ISSUE_CMPLT_DATE"		 // �o�Ɋ�����
					+ ",OD_GNR_TYP" 			 // ���v�ʔ��������敪
					+ ",OD_LEVEL_NO"			 // ���v�ʃ��x���ԍ�
					+ ",PARENT_OD_NO"			 // �e�I�[�_�f�}���h�ԍ�
					+ ",ITEM_SPOIL" 			 // ���v�ʕi�ڎd����
					+ ",PS_SPOIL"				 // ���v�ʍ\���d����
					+ ",CONS_TYP"				 // �\���x���敪
					+ ",EFF_PHASE_IN_DATE"		 // ���v�ʗL���J�n��
					+ ",EFF_PHASE_OUT_DATE" 	 // ���v�ʗL���I����
					+ ",MRP_TYP"				 // ���v�ʏ����敪
					+ ",EXTERNAL_DM_FLG"		 // �O���f�}���h�t���O
					+ ",ODR_RELEASE_FLG"		 // �I�[�_�����σt���O
					+ ",CREATED_BY" 			 // �쐬��
					+ ",CREATED_PRG_NM" 		 // �쐬�v���O������
					+ ",UPDATED_BY" 			 // �X�V��
					+ ",UPDATED_PRG_NM" 		 // �X�V�v���O������
					+ ",MODIFY_COUNT"			 // �X�V��

					+ ") values ("

					+ "?"								 // �I�[�_�f�}���h�ԍ�
					+ ",null"										 // �����O���[�v�R�[�h
					+ ",?" 						 // �H��R�[�h
					+ ",?"	 // �i�ڔԍ�
					+ ",?" 	 // ���v�ʕi�ڍ\���Ő�
					+ ",null"									 // ����
					+ ",0"										 // ���Ԏ}��
					+ ",0"										 // ���Ԏ�������ԍ�
					+ ",?"							 // �I�[�_��ԋ敪
					+ ",?"							 // �f�}���h��ԋ敪
					+ ",?"								 // �I�[�_�f�}���h�敪
					+ ",TO_DATE(?,'YYYY/MM/DD HH24:MI:ss')" // �v���[��
					+ ",TO_DATE(?,'YYYY/MM/DD HH24:MI:ss')" // ��z�����
					+ ",TO_DATE(?,'YYYY/MM/DD HH24:MI:ss')" // �����[��
					+ ",TO_DATE(?,'YYYY/MM/DD HH24:MI:ss')" // ���������
					+ ",?"								 // �f�}���h��
					+ ",?"								 // �I�[�_��
					+ ",?"		 // �i�ڎ�z�敪
					+ ",?"		 // ���v�ʓ��O��敪
					+ ",?"			 // ���v�ʏo�ɋ敪
					+ ",?"								 // ��z���[�h�^�C��
					+ ",?" 							 // �Œ蕪���[�h�^�C��
					+ ",?"								 // ��ᕪ���[�h�^�C��
					+ ",?"							 // ���S����
					+ ",?" 							 // ���o���[�h�^�C��
					+ ",?" 						 // ��ᕪ���b�g�T�C�Y
					+ ",?" 							 // ���i�\�����[�h�^�C���g�p�t���O
					+ ",?"							 // ���i�\���Œ蕪���[�h�^�C��
					+ ",?"							 // ���i�\����ᕪ���[�h�^�C��
					+ ",?"						 // ���i�\����ᕪ���b�g�T�C�Y
					+ ",?"							 // ���i�\���P�ʐ�	  ����
					+ ",?" 						 // ���i�\���P�ʐ����q ����
					+ ",?"						 // ���i�\���P�ʐ����� ����
					+ ",0"										 // ���ɗ݌v��
					+ ",null"									 // ���Ɋ�����
					+ ",0"										 // �o�Ɏw���݌v��
					+ ",0"										 // �o�ɗ݌v��
					+ ",null"									 // �o�Ɋ�����
					+ ",?"							 // ���v�ʔ��������敪
					+ ",?"							 // ���v�ʃ��x���ԍ�
					+ ",?"					 // �e�I�[�_�f�}���h�ԍ�
					+ ",?"							 // ���v�ʕi�ڎd����
					+ ",?" 							 // ���v�ʍ\���d����
					+ ",?" 			 // �\���x���敪
					+ ",TO_DATE(?,'YYYY/MM/DD')" // ���v�ʗL���J�n��
					+ ",TO_DATE(?,'YYYY/MM/DD')" // ���v�ʗL���I����
					+ ",9"										 // ���v�ʏ����敪
					+ ",0"										 // �O���f�}���h�t���O
					+ ",0"										 // �I�[�_�����σt���O
					+ ",?"		 // �쐬��
					+ ",?"	 // �쐬�v���O������
					+ ",?"		 // �X�V��
					+ ",?"	 // �X�V�v���O������
					+ ",0"										 // �X�V��
					+ ")";

				// # ������ PreparedStatement ���g��Ȃ��B? �������������Ńf�o�b�O���Â炢����B
				pstmt = _conn.prepareStatement(sql);
				pstmt.setString(1, odNo);
				pstmt.setString(2, _plantCd);
				pstmt.setString(3, rsPs.getString("COMP_ITEM_CD"));
				pstmt.setString(4, rsPs.getString("PS_EDITION"));
				pstmt.setInt(5, odrStsTyp);
				pstmt.setInt(6, dmStsTyp);
				pstmt.setInt(7, odTyp);
				pstmt.setString(8, sDueDate);
				pstmt.setString(9, sOdrStartDate);
				pstmt.setString(10, sPrdDueDate);
				pstmt.setString(11, sPrdStartDate);
				pstmt.setDouble(12, dmQty);
				pstmt.setDouble(13, odrQty);
				pstmt.setInt(14, rsItem.getInt("MRP_ODR_TYP"));
				pstmt.setInt(15, rsItem.getInt("OUTSIDE_TYP"));
				pstmt.setInt(16, rsItem.getInt("ISSUE_TYP"));
				pstmt.setInt(17, odrLt);
				pstmt.setInt(18, fixedLt);
				pstmt.setInt(19, propLt);
				pstmt.setInt(20, safetyLt);
				pstmt.setInt(21, issueLt);
				pstmt.setDouble(22, propLotSize);
				pstmt.setInt(23, psLtFlg);
				pstmt.setInt(24, psFixedLt);
				pstmt.setInt(25, psPropLt);
				pstmt.setDouble(26, psPropLotSize);
				pstmt.setDouble(27, psUnitQty);
				pstmt.setDouble(28, psNumerator);
				pstmt.setDouble(29, psDenominator);
				pstmt.setInt(30, odGnrTyp);
				pstmt.setInt(31, odLevelNo);
				pstmt.setString(32, parentOdNo);
				pstmt.setDouble(33, itemSpoil);
				pstmt.setDouble(34, psSpoil);
				pstmt.setInt(35, rsPs.getInt("CONS_TYP"));
				pstmt.setString(36, ""+effPhaseInDate);
				pstmt.setString(37, ""+effPhaseOutDate);
				pstmt.setString(38, _userInfo.getUserId());
				pstmt.setString(39, _userInfo.getBusinessName());
				pstmt.setString(40, _userInfo.getUserId());
				pstmt.setString(41, _userInfo.getBusinessName());
				int rsRows = pstmt.executeUpdate();
				pstmt.close();
				rsItem.close();

				//this.changeCommon(odNo);

				// �^���i�ڂ̏ꍇ�A����ɉ��ʂ̃f�}���h�����쐬����B
				// �Ɩ���́A��i�K�������蓾�Ȃ����A�ċA�����őΉ�����B
				if ( odTyp == 4 ) {
					String itemCd = rsPs.getString("COMP_ITEM_CD");
					this.makeUnderDemand(itemCd,odNo,prdDueDate,odrStartDate,odrQty,odGnrTyp,odLevelNo);
				}

			} else {
				rsItem.close();
				 _log.methodEnd();
				throw new ApsComException(50509,"(SBM0981) �i�ڃf�[�^�����݂��܂���");
			}
			_log.methodEnd();
		}
		finally {
			if (ps != null)
			{
				ps.close();
			}
			if (rsItem != null){
				try{
					rsItem.close();
				}catch(Exception e){
					e.printStackTrace();
				}
				rsItem = null;
			}
			if (pstmt != null){
				try{
					pstmt.close();
				}catch(Exception e){
					e.printStackTrace();
				}
				pstmt = null;
			}
		}
	}

	//==========================================================================
	/**
	 * �I�[�_�f�}���h���X�V(�v��ύX�p)
	 * �������œn���ꂽ�I�[�_�f�}���h�ԍ����ƂɃI�[�_�f�}���h���̍X�V���s���B
	 *
	 * @param odNo �I�[�_�f�}���h�ԍ�
	 * @param modifyCount �Ǎ��ݎ��̍X�V��(�`�F�b�N���Ȃ��ꍇ�̓}�C�i�X�l��ݒ�)
	 * @throws SQLException
	 * @throws ApsComException
	 */
	public void changeOdInfo(String odNo, long modifyCount)
			throws SQLException,ApsComException {

		PreparedStatement ps = null;
		PreparedStatement psOd = null;
		PreparedStatement psWorkInProcByItem = null;
		PreparedStatement psRlsdPuchOdr = null;
		ResultSet rs = null;
		ResultSet rsWorkInProcByItem = null;
		ResultSet rsRlsdPuchOdr = null;
		try {
			_log.methodStart();
			String sql;

			// �X�V���`�F�b�N
			this.checkModifyCount(odNo,modifyCount);

			// << ���v�ʂ̌��� >>
			boolean odChanged = false;									  // ���v�ʕύX�t���O
			sql = "select * from T_OD where OD_NO = ?";
			psOd = _conn.prepareStatement(sql);
			psOd.setString(1, odNo);
			rs = psOd.executeQuery();
			rs.next();

			// �I�[�_���ʂ̗݌v,����������̍ő��l,�����[���̍Œx�l,��z������̎Z�o===========
			double odrQty = 0;											  // �I�[�_����
			Date prdStartDateFirst = this.getLastDate();				  // ����������ő���
			Date prdDueDateLast = this.getFirstDate();					  // �����[���Œx��

			// << �i�ڕʎd�|�̌��� >>
			sql = "select * from T_WORK_IN_PROC_BY_ITEM where OD_NO = ? ";
			psWorkInProcByItem = _conn.prepareStatement(sql);
			psWorkInProcByItem.setString(1, odNo);
			rsWorkInProcByItem = psWorkInProcByItem.executeQuery();

			// << �����c�̌��� >>
			sql = "select * from T_RLSD_PUCH_ODR "
				+ "where OD_NO = ? and WORK_ODR_CD is null ";			  // ��ƌv��ԍ�=null
			psRlsdPuchOdr = _conn.prepareStatement(sql);
			psRlsdPuchOdr.setString(1, odNo);
			rsRlsdPuchOdr = psRlsdPuchOdr.executeQuery();

			while ( rsWorkInProcByItem.next() ) {
				// �i�ڕʎd�|�̍�Ǝw�����̍��v
				odrQty += rsWorkInProcByItem.getDouble("OPR_INST_QTY");

				// ��Ɛ��������< ����������ő����̏ꍇ�A����������ő������Đݒ� 	// 2003/09/01 update
				//if ( rsWorkInProcByItem.getDate("OPR_INST_START_DATE").after(prdStartDateFirst) ) {
				if ( rsWorkInProcByItem.getTimestamp("OPR_INST_START_DATE").before(prdStartDateFirst) ) {
					prdStartDateFirst = rsWorkInProcByItem.getTimestamp("OPR_INST_START_DATE");
					odChanged = true;
				}
				// ��Ɛ����[�� > �����[���Œx���̏ꍇ�A�����[���Œx�����Đݒ�		   // 2003/09/01 update
				//if ( rsWorkInProcByItem.getDate("WORK_ODR_DLV_DATE").before(prdDueDateLast) ) {
				if ( rsWorkInProcByItem.getTimestamp("WORK_ODR_DLV_DATE").after(prdDueDateLast) ) {
					prdDueDateLast = rsWorkInProcByItem.getTimestamp("WORK_ODR_DLV_DATE");
					odChanged = true;
				}
			}

			while ( rsRlsdPuchOdr.next() ) {
				// �����Z�̔������̍��v
				odrQty += rsRlsdPuchOdr.getDouble("PUCH_ODR_QTY");

				// ���������< ����������ő����̏ꍇ�A����������ő������Đݒ� 	   // 2003/09/01 update
				//if ( rsRlsdPuchOdr.getDate("PUCH_ODR_START_DATE").after(prdStartDateFirst) ) {
				if ( rsRlsdPuchOdr.getTimestamp("PUCH_ODR_START_DATE").before(prdStartDateFirst) ) {
					prdStartDateFirst = rsRlsdPuchOdr.getTimestamp("PUCH_ODR_START_DATE");
					odChanged = true;
				}
				// �����[�� > �����[���Œx���̏ꍇ�A�����[���Œx�����Đݒ�			  // 2003/09/01 update
				//if ( rsRlsdPuchOdr.getDate("PUCH_ODR_DLV_DATE").before(prdDueDateLast) ) {
				if ( rsRlsdPuchOdr.getTimestamp("PUCH_ODR_DLV_DATE").after(prdDueDateLast) ) {
					prdDueDateLast = rsRlsdPuchOdr.getTimestamp("PUCH_ODR_DLV_DATE");
					odChanged = true;
				}
			}

			psWorkInProcByItem.close();
			psRlsdPuchOdr.close();

			// �Z�o�����I�[�_�� <= 0 �̏ꍇ�A���������,�����[���́A[���e��]�Ɠ���(�ύX���Ȃ�)	// 2003/09/01
			Date odrStartDate = rs.getTimestamp("ODR_START_DATE");	   // [���e��].��z�����
			if ( odrQty <= 0 ) {
				prdStartDateFirst = rs.getTimestamp("PRD_START_DATE");
				prdDueDateLast = rs.getTimestamp("PRD_DUE_DATE");
			} else {
				// ����������ő���<>���e��.����������̏ꍇ�A��z��������Čv�Z
				//if (prdStartDateFirst.getTime() == rs.getDate("PRD_START_DATE").getTime()) {	//2003/09/29
				if (prdStartDateFirst.getTime() != rs.getTimestamp("PRD_START_DATE").getTime()) {
					int difference = rs.getInt("ODR_LT");						   // ������ ��z���[�h�^�C��
					odrStartDate = this.calcOdrStartDate(difference, prdStartDateFirst,rs.getString("ITEM_CD"));
				}
			}
			// �I�[�_���ɕύX������ꍇ���v�ʕύX�t���O��true��ݒ�
			if (rs.getDouble("ODR_QTY") != odrQty) {
				odChanged = true;
			}

			// �I�[�_��ԋ敪,���Ɋ������̎Z�o ================================
			int odrStsTyp = 9;											  // �I�[�_��ԋ敪(9:����)
			Date rcvCmpltDate;											  // ���Ɋ�����

			if (odrQty == 0) {
				odrStsTyp = 9;											  // �I�[�_��ԋ敪=9:����
				rcvCmpltDate = this.getBusinessOprDate();				  // ���Ɋ�����=�Ɩ����t
			} else {
				rcvCmpltDate = this.getFirstDate(); 					  // ���Ɋ�����(�����l)
				// << �i�ڕʎd�|�̌��� >>
				sql = "select * from T_WORK_IN_PROC_BY_ITEM "
					+ "where OD_NO = ? ";
				psWorkInProcByItem = _conn.prepareStatement(sql);
				psWorkInProcByItem.setString(1, odNo);
				rsWorkInProcByItem = psWorkInProcByItem.executeQuery();

				// << �����c�̌��� >>
				sql = "select * from T_RLSD_PUCH_ODR "
					+ "where OD_NO = ? "
					+ "and WORK_ODR_CD is null ";						  // ��ƌv��ԍ�=null
				psRlsdPuchOdr = _conn.prepareStatement(sql);
				psRlsdPuchOdr.setString(1, odNo);
				rsRlsdPuchOdr = psRlsdPuchOdr.executeQuery();

				while ( rsWorkInProcByItem.next() ) {
					// �i�ڕʍ�Ə�ԋ敪<>��Ɗ����̏ꍇ
					if ( rsWorkInProcByItem.getInt("WORK_STS_TYP") != 9 ) {
						odrStsTyp = 2;									  // 2:�m��(����)
						rcvCmpltDate = null;
						break;
					} else {
						// ��Ɗ�����>���Ɋ������̏ꍇ�A���Ɋ�����=��Ɗ������Ƃ���    // 2003/09/01 update
						//if ( rsWorkInProcByItem.getDate("WORK_CMPLT_DATE").before(rcvCmpltDate) ) {
						if ( rsWorkInProcByItem.getTimestamp("WORK_CMPLT_DATE").after(rcvCmpltDate) ) {
							rcvCmpltDate = rsWorkInProcByItem.getTimestamp("WORK_CMPLT_DATE");
						}
					}
				}

				while ( rsRlsdPuchOdr.next() ) {
					// ���������t���O<>�����̏ꍇ
					if ( rsRlsdPuchOdr.getInt("INSPC_CMPLT_FLG") != 9 ) {
						odrStsTyp = 2;	// 2:�m��(����)
						rcvCmpltDate = null;
						break;
					} else {
						// ����������>���Ɋ������̏ꍇ�A���Ɋ�����=�����������Ƃ���    // 2003/09/01 update
						//if ( rsRlsdPuchOdr.getDate("INSPC_CMPLT_DATE").before(rcvCmpltDate) ) {
						if ( rsRlsdPuchOdr.getTimestamp("INSPC_CMPLT_DATE").after(rcvCmpltDate) ) {
							rcvCmpltDate = rsRlsdPuchOdr.getTimestamp("INSPC_CMPLT_DATE");
						}
					}
				}
			}

			psWorkInProcByItem.close();
			psRlsdPuchOdr.close();

			//�I�[�_��ԋ敪<>[���e��].�I�[�_��ԋ敪�̏ꍇ�A�ύX���������Ɣ��f����
			if (odrStsTyp != rs.getInt("ODR_STS_TYP")) {
				odChanged = true;
			}

			// << ���v�ʂ̍X�V >>�@�@�@�@�@�@�@�@�@�@�@//�@2003/09/01�@if�u���b�N�̈ʒu������Ă����̂��C��
			if (odChanged) {

				sql = "update T_OD set"
					+ " ODR_QTY = ?"				 // �I�[�_��
					+ ",PRD_DUE_DATE = ?"			 // �����[��
					+ ",PRD_START_DATE = ?" 		 // ���������
					+ ",ODR_START_DATE = ?" 		 // ��z�����
					+ ",ODR_STS_TYP = ?"			 // �I�[�_��ԋ敪
					+ ",RCV_CMPLT_DATE = ?" 		 // ���Ɋ�����
					+ ",UPDATED_DATE = ?"
					+ ",UPDATED_BY = ?"
					+ ",UPDATED_PRG_NM = ?"
					+ ",MODIFY_COUNT = MODIFY_COUNT + 1 "
					+ "where OD_NO = ?";
				ps = _conn.prepareStatement(sql);
				ps.setDouble(1, odrQty);
				ps.setTimestamp(2, new Timestamp(prdDueDateLast.getTime()));
				ps.setTimestamp(3, new Timestamp(prdStartDateFirst.getTime()));
				ps.setTimestamp(4, new Timestamp(odrStartDate.getTime()));
				ps.setInt(5, odrStsTyp);
				//ps.setDate(6, new java.sql.Date(rcvCmpltDate.getTime()));
				if (rcvCmpltDate == null ) {								 // 2003/09/01
					ps.setTimestamp(6, null);
				} else {
					ps.setTimestamp(6, new Timestamp(rcvCmpltDate.getTime()));
				}
				ps.setTimestamp(7, new Timestamp(new Date().getTime()));
				ps.setString(8, _userInfo.getUserId());
				ps.setString(9, _userInfo.getBusinessName());
				ps.setString(10, odNo);
				ps.execute();
				ps.close();

				//this.changeCommon(odNo);

				// < ���Ԍv��̍X�V >
				// �X�V���ꂽ[���v��]�����Ԃ̍ŏ�ʕi�ڂ������ꍇ[���Ԍv��]."���ԏ�ԋ敪"���X�V����
				//if (rs.getString("JOB_ODR_CD") == null || rs.getString("JOB_ODR_CD").equals("")) {	 //    2003/10/30 update
				if (rs.getString("JOB_ODR_CD") != null && !rs.getString("JOB_ODR_CD").equals("")) {
					if (odrStsTyp == 9) {
						this.updateJobOdr(odNo, 9); // ����
					}
					else {
						this.updateJobOdr(odNo, 5); // ���i�ڊm��ς�
					}
				}
			}

			psOd.close();

			//�@���ʕi�ڂ̃f�}���h���̍X�V
			// << ���ʕi�ڂ̏��v�ʂ̌��� >>
			sql = "select * from T_OD where PARENT_OD_NO = ?";
			ps = _conn.prepareStatement(sql);
			ps.setString(1, odNo);
			rs = ps.executeQuery();
			while ( rs.next() ) {										  // ��z�����,�����[��
				this.changeChildOdInfo(rs, odNo, odrQty, odrStartDate, prdDueDateLast);
			}
			rs.close();
			ps.close();

			_log.methodEnd();
		}
		finally {
			if (ps != null)
			{
				ps.close();
			}
			if (psOd != null)
			{
				psOd.close();
			}
			if (psWorkInProcByItem != null)
			{
				psWorkInProcByItem.close();
			}
			if (psRlsdPuchOdr != null)
			{
				psRlsdPuchOdr.close();
			}
			if (rs != null){
				try{
					rs.close();
				}catch(Exception e){
					e.printStackTrace();
				}
				rs = null;
			}
			if (rsWorkInProcByItem != null) {
				try {
					rsWorkInProcByItem.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rsWorkInProcByItem = null;
			}
			if (rsRlsdPuchOdr != null) {
				try {
					rsRlsdPuchOdr.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rsRlsdPuchOdr = null;
			}
		}
	}
	/**
	 * �I�[�_���X�V(���ʕi�ڂ̃f�}���h���X�V)
	 *
	 * @param rs ���ʕi�ڂ�ResultSet
	 * @param parentOdNo �e�I�[�_�f�}���h�ԍ�
	 * @param parentOdrQty �e�I�[�_����
	 * @param parentOdrStartDate �e�I�[�_����
	 * @param parentPrdDueDate �e�����[��
	 * @throws SQLException
	 * @throws ApsComException
	 */
	public void changeChildOdInfo(ResultSet rs, String parentOdNo, double parentOdrQty,
								   Date parentOdrStartDate, Date parentPrdDueDate)
			throws SQLException,ApsComException {

		PreparedStatement ps = null;
		PreparedStatement psOd = null;
		PreparedStatement psWorkInProcByItem = null;
		PreparedStatement psRlsdPuchOdr = null;
		PreparedStatement psItem = null;
		ResultSet rsWorkInProcByItem = null;
		ResultSet rsItem = null;
		ResultSet rsRlsdPuchOdr = null;
		try {
			_log.methodStart();

			String odNo = rs.getString("OD_NO");				// �I�[�_�f�}���h�ԍ�
			int odTyp = rs.getInt("OD_TYP");					// �I�[�_�f�}���h�敪

			// << �i�ڂ̌��� >>
			String sql = "select * from M_ITEM where ITEM_CD = ? ";
			psItem = _conn.prepareStatement(sql);
			psItem.setString(1, rs.getString("ITEM_CD"));
			rsItem = psItem.executeQuery();
			String itemCd = rs.getString("ITEM_CD");

			// �f�}���h���ʂ̐ݒ�--------------------
			int mrpOdrTyp = rs.getInt("MRP_ODR_TYP");					  // �i�ڎ�z�敪
			double psSpoil = rs.getDouble("PS_SPOIL");					  // �\���d����
			double psNumerator = rs.getDouble("PS_UNIT_NUMERATOR"); 	  // �\���P��(���q)
			double psDenominator = rs.getDouble("PS_UNIT_DENOMINATOR");   // �\���P��(����)
			// ���� �\���P�ʐ��͕��q/����Ōv�Z(2003/8/7)
			// double psUnitQty = rs.getDouble("PS_UNIT_QTY");				 // �\���P�ʐ�
			double psUnitQty = ( psDenominator == 0.0 ) ? psNumerator : psNumerator / psDenominator;

			double dmQty = 0.0D;										  // �f�}���h��

			if ( mrpOdrTyp == 8 ) {
				// �^���i�ڂ̏ꍇ�A�e�̃I�[�_����*�\���P��(�ۂߑO)
				dmQty = new BigDecimal(parentOdrQty).multiply(new BigDecimal(psUnitQty)).doubleValue();
			} else {
				//	�^���i�ڈȊO�̏ꍇ�A�e�̃I�[�_����*�\���P��(�ۂߑO)*(1+ �\���d����/100)
				//dmQty = parentOdrQty * psUnitQty * ( 1 + psSpoil / 100D );
				dmQty = new BigDecimal(parentOdrQty).multiply(new BigDecimal(psUnitQty).multiply( new BigDecimal("1").add(new BigDecimal(psSpoil / 100D))) ).doubleValue();

			}

			// �ۂߏ���
			int unitQtyTyp = 0; 								// �݌ɐ��ʒP�ʋ敪(0:����/1:����)
			if ( rsItem.next() ) {
				unitQtyTyp = rsItem.getInt("UNIT_QTY_TYP");
				psUnitQty = changeQtyUp(psUnitQty,unitQtyTyp);
				dmQty = changeQtyUp(dmQty,unitQtyTyp);
			} else {
				rsItem.close();
				_log.methodEnd();
				throw new ApsComException(50509,"(SBM0981) �i�ڃf�[�^�����݂��܂���");
			}

			// �v���[��/�����[���̐ݒ�--------------------
			int psLtFlg = rs.getInt("PS_LT_FLG");						  // ���i�\�����[�h�^�C���g�p�t���O
			int psFixedLt = rs.getInt("PS_FIXED_LT");					  // �Œ蕪���[�h�^�C��
			double psPropLotSize = rs.getDouble("PS_PROP_LOT_SIZE");	  // ���i�\����ᕪ���b�g�T�C�Y
			int psPropLt = rs.getInt("PS_PROP_LT"); 					  // ���i�\����ᕪ���[�h�^�C��
			Date dueDate = null;										  // �v���[��

			// ���i�\�����[�h�^�C���g�p�t���O  0:�g�p���Ȃ�/1:�g�p����
			if (psLtFlg == 0) {
				// �e�̎�z������Ɠ���
				dueDate = parentOdrStartDate;
				// �ғ����`�F�b�N
				dueDate = this.calcOdrStartDate(0, dueDate,itemCd);
			} else {
				// �e�̐����[�� - �\�����[�h�^�C���Ōv�Z
				if (psPropLotSize == 0) {
					rsItem.close();
					_log.methodEnd();
					throw new ApsComException(50417, "(SBM0982) ���i�\����ᕪ���b�g�T�C�Y�������͂ł�");
				}
				// ���i�\����ᕪ���� = �I�[�_��(�e)/���i�\����ᕪ���b�g�T�C�Y (�����ɐ؂�グ)
				int psPropQty = (int) Math.ceil(parentOdrQty / psPropLotSize);
				// ���i�\����ᕪ����=0 �̏ꍇ�A=1�Ƃ���
				if (psPropQty == 0) {
					psPropQty = 1;
				}
				// �\�����[�h�^�C��=���i�\���Œ胊�[�h�^�C�� + ���i�\����჊�[�h�^�C��*���i�\����ᕪ����(�����ɐ؂�グ)
				int psLt = (int) Math.ceil(psFixedLt + (psPropLt * psPropQty));
				// �ғ����`�F�b�N
				dueDate = this.calcOdrStartDate(psLt, parentPrdDueDate,itemCd);
			}

			// MRP�Ǘ��i�ڂ̏ꍇ�A�����[��= �v���[��
			Date prdDueDate = rs.getTimestamp("PRD_DUE_DATE");		  // �����[��	2003/10/14 update
			if (mrpOdrTyp == 4 || mrpOdrTyp == 5 || mrpOdrTyp == 6 || mrpOdrTyp == 7) {
				prdDueDate = dueDate;
			}

			// �w����Ԃ̃`�F�b�N--------------------
			boolean instCmpFlgIsRelAll = true;

			// << �i�ڕʎd�|�̌��� >>
			sql = "select * from T_WORK_IN_PROC_BY_ITEM "
				+ "where OD_NO = ? ";
			psWorkInProcByItem = _conn.prepareStatement(sql);
			psWorkInProcByItem.setString(1, parentOdNo);
			rsWorkInProcByItem = psWorkInProcByItem.executeQuery();
			while ( rsWorkInProcByItem.next() ) {
				// �i�ڕʍ�Ə�ԋ敪=���w���̏ꍇ�A
				if ( rsWorkInProcByItem.getInt("WORK_STS_TYP") == 1 ) {
					instCmpFlgIsRelAll = false;
				}
			}

			psWorkInProcByItem.close();

			// << �����c�̌��� >>
			sql = "select * from T_RLSD_PUCH_ODR "
				+ "where OD_NO = ? "
				+ "and WORK_ODR_CD is null ";							  // ��ƌv��ԍ�=null
			psRlsdPuchOdr = _conn.prepareStatement(sql);
			psRlsdPuchOdr.setString(1, parentOdNo);
			rsRlsdPuchOdr = psRlsdPuchOdr.executeQuery();
			while ( rsRlsdPuchOdr.next() ) {
				//�@������ԋ敪=���w���̏ꍇ�A
				if ( rsRlsdPuchOdr.getInt("PUCH_ODR_STS_TYP") == 1 ) {
					instCmpFlgIsRelAll = false;
				}
			}

			psRlsdPuchOdr.close();

			// �f�}���h��ԋ敪,�o�Ɋ������̐ݒ�--------------------
			int dmStsTyp = 9;											  // �f�}���h��ԋ敪=9:����
			Date issueCmpltDate = null; 								  // �o�Ɋ�����

			Date odrStartDate = null;									  // ��z�����  2003/10/14 update
			Date prdStartDate = null;									  // ���������  2003/10/14 update
			double odrQtyOfChildOd = 0.0D;								  // �I�[�_��	 2003/10/14 update

			// �I�[�_�f�}���h�敪=4:�^���ȊO�̂Ƃ�
			if ( odTyp != 4 ) {

				odrStartDate = rs.getTimestamp("ODR_START_DATE");		  // ��z����� 2003/10/14 update
				prdStartDate = rs.getTimestamp("PRD_START_DATE");		  // ��������� 2003/10/14 update
				odrQtyOfChildOd = rs.getDouble("ODR_QTY");				  // �I�[�_��	2003/10/14 update

				if (parentOdrQty == 0) {
					// �e�̃I�[�_��=0 �̏ꍇ
					dmStsTyp = 9;										  // �f�}���h��ԋ敪=9:����
					issueCmpltDate = this.getBusinessOprDate(); 		  // �o�Ɋ�����=�Ɩ����t
				} else {
					// �e�̃I�[�_��<>0 �̏ꍇ
					// << �o�Ɋ�����Ԃ̃`�F�b�N,�Ēx�o�Ɋ������̎Z�o >>
					boolean issueCmpFlgIsCmpAll = true;

					sql = "select * from T_ISSUE_INST "
						+ "where OD_NO = ? "
						+ "order by ISSUE_CMPLT_DATE desc"; 			  // �o�Ɋ�����
					psOd = _conn.prepareStatement(sql);
					psOd.setString(1, rs.getString("OD_NO"));
					rs = psOd.executeQuery();
					
					if(rs.getRow() == 0) {
						issueCmpFlgIsCmpAll = false;
					} else {
						while ( rs.next() ) {
							if ( issueCmpltDate == null ) {
								issueCmpltDate = rs.getTimestamp("ISSUE_CMPLT_DATE");
							}
							if ( rs.getInt("ISSUE_CMPLT_FLG") != 1 ) {		  // �o�Ɋ����t���O
								issueCmpFlgIsCmpAll = false;
								break;
							}
						}
					}

					psOd.close();

					// �w������ ���A�o�Ɋ����̏ꍇ�A�f�}���h=�����Ƃ���
					if ( instCmpFlgIsRelAll && issueCmpFlgIsCmpAll ) {
						dmStsTyp = 9; // �f�}���h��ԋ敪=9:����
						issueCmpltDate = issueCmpltDate;
					} else {
						dmStsTyp = 2; // �f�}���h��ԋ敪=2:�m��i�������j
						issueCmpltDate = null;
					}
				}
			}

			// �I�[�_�f�}���h�敪=4:�^���̎��̏��� ===================================

			double itemSpoil = rsItem.getDouble("ITEM_SPOIL");			  // �i�ڎd����
			int odrLt = rsItem.getInt("ODR_LT");						  // ��z���[�h�^�C��
			int issueLt = rsItem.getInt("ISSUE_LT");					  // ���o���[�h�^�C��
			int fixedLt = rsItem.getInt("FIXED_LT");					  // �Œ蕪���[�h�^�C��
			double propLotSize = rsItem.getDouble("PROP_LOT_SIZE"); 	  // ��ᕪ���b�g�T�C�Y
			int propLt = rsItem.getInt("PROP_LT");						  // ��ᕪ���[�h�^�C��
			int safetyLt = rsItem.getInt("SAFETY_LT");					  // ���S����
			// Date odrStartDate = null;								  // ��z����� 2003/10/14 delete
			// Date prdStartDate = null;								  // ��������� 2003/10/14 delete
			// double odrQtyOfChildOd = 0.0D;							  // �I�[�_��	2003/10/14 delete

			if ( odTyp == 4 ) {

				// �I�[�_��(���ʕi��) = �f�}���h���� * ( 1 + ( ���v�ʕi�ڎd���� / 100 )-------
				odrQtyOfChildOd = dmQty * (1 + itemSpoil / 100D);
				odrQtyOfChildOd = changeQtyUp(odrQtyOfChildOd, unitQtyTyp); // �ۂߏ���

				// �����[�� = �v���[�� - ���o���[�h�^�C�� (�ғ����`�F�b�N)------------
				prdDueDate = this.calcOdrStartDate(issueLt, dueDate,itemCd);

				// ��������� = �����[�� - �i�ڃ��[�h�^�C��-------------------------
				if (propLotSize == 0) {
					 _log.methodEnd();
					throw new ApsComException(50416, "(SBM0983) ��ᕪ���b�g�T�C�Y�������͂ł�");
				}
				int propQty = (int) Math.ceil(odrQtyOfChildOd / propLotSize);
				// ��ᕪ����=0 �̏ꍇ�A=1�Ƃ���
				if (propQty == 0) {
					propQty = 1;
				}
				// �i�ڃ��[�h�^�C�� = �Œ胊�[�h�^�C�� + ( ��჊�[�h�^�C�� * ������) + ���S���� (�����ɐ؂�グ)
				int lt = (int) Math.ceil(fixedLt + (propLt * propQty) + safetyLt);
				// �ғ����`�F�b�N
				prdStartDate = this.calcOdrStartDate(lt, prdDueDate,itemCd);

				// ��z����� = ��������� - ��z���[�h�^�C�� (�ғ����`�F�b�N)-----------
				odrStartDate = this.calcOdrStartDate(odrLt, prdStartDate,itemCd);
			}
				//System.out.println("Item_cd check line1554(child) : "+itemCd);
			// �X�V����(SQL)--------------------
				if (odTyp == 4) {
				    // �X�V����(SQL)--------------------
				    sql = "update T_OD set"
						+ " DUE_DATE = ?" // �v���[��
						+ ",ODR_START_DATE = ?" // ��z�����
						+ ",PRD_DUE_DATE = ?" // �����[��
						+ ",PRD_START_DATE = ?" // ���������
						+ ",DM_QTY = ?" // �f�}���h��
						+ ",ODR_QTY = ?" // �I�[�_��
						+ ",ISSUE_CMPLT_DATE = ?" // �o�Ɋ�����
						+ ",UPDATED_DATE = ?" + ",UPDATED_BY = ?"
						+ ",UPDATED_PRG_NM = ?"
						+ ",MODIFY_COUNT = MODIFY_COUNT + 1 "
						+ " where OD_NO = ?";
				}else{
					sql = "update T_OD set"
						+ " DUE_DATE = ?" // �v���[��
						+ ",ODR_START_DATE = ?" // ��z�����
						+ ",PRD_DUE_DATE = ?" // �����[��
						+ ",PRD_START_DATE = ?" // ���������
						+ ",DM_QTY = ?" // �f�}���h��
						+ ",ODR_QTY = ?" // �I�[�_��
						+ ",ISSUE_CMPLT_DATE = ?" // �o�Ɋ�����
						+ ",UPDATED_DATE = ?" + ",UPDATED_BY = ?"
						+ ",UPDATED_PRG_NM = ?"
						+ ",MODIFY_COUNT = MODIFY_COUNT + 1 "
						+ ",DM_STS_TYP = ?" // �f�}���h��ԋ敪
						+ " where OD_NO = ?";
				}
				ps = _conn.prepareStatement(sql);
				ps.setTimestamp(1, new Timestamp(dueDate.getTime())); // �v���[��
				if (odrStartDate == null) { // ��z�����
					ps.setNull(2, Types.DATE);
				} else {
					ps.setTimestamp(2, new Timestamp(odrStartDate.getTime()));
				}
				if (prdDueDate == null) { // �����[��
					ps.setNull(3, Types.DATE);
				} else {
					ps.setTimestamp(3, new Timestamp(prdDueDate.getTime()));
				}
				if (prdStartDate == null) { // ���������
					ps.setNull(4, Types.DATE);
				} else {
					ps.setTimestamp(4, new Timestamp(prdStartDate.getTime()));
				}
				ps.setDouble(5, dmQty); // �f�}���h��
				ps.setDouble(6, odrQtyOfChildOd); // �I�[�_��
				if (issueCmpltDate == null) { // �o�Ɋ�����
					ps.setNull(7, Types.DATE);
				} else {
					ps.setTimestamp(7, new Timestamp(issueCmpltDate.getTime()));
				}
				ps.setTimestamp(8, new Timestamp(new Date().getTime()));
				ps.setString(9, _userInfo.getUserId());
				ps.setString(10, _userInfo.getBusinessName());
				if (odTyp == 4) {
					ps.setString(11, odNo);
				} else {
					ps.setInt(11, dmStsTyp); // �f�}���h��ԋ敪
					ps.setString(12, odNo);
				}
                ps.execute();
                ps.close();

			//this.changeCommon(odNo);

			// �^���i�ڂ̏ꍇ�A����ɉ��ʂ̃f�}���h�����쐬����B
			if ( odTyp == 4 ) {
				sql = "select * from T_OD where PARENT_OD_NO = ?";
				ps = _conn.prepareStatement(sql);
				ps.setString(1, odNo);
				rs = ps.executeQuery();
				while ( rs.next() ) {
					// 2003/09/02 update
					//this.changeChildOdInfo(rs, odNo, odrQtyOfChildOd, odrStartDate, prdDueDate);
					this.changeChildOdInfo(rs, parentOdNo, odrQtyOfChildOd, odrStartDate, prdDueDate);
				}
				rs.close();
				ps.close();
			}
			_log.methodEnd();
		}
		finally {
			if (ps != null)
			{
				ps.close();
			}
			if (psOd != null)
			{
				psOd.close();
			}
			if (psWorkInProcByItem != null)
			{
				psWorkInProcByItem.close();
			}
			if (psRlsdPuchOdr != null)
			{
				psRlsdPuchOdr.close();
			}
			if (psItem != null)
			{
				psItem.close();
			}
			if (rsWorkInProcByItem != null){
				try{
					rsWorkInProcByItem.close();
				}catch(Exception e){
					e.printStackTrace();
				}
				rsWorkInProcByItem = null;
			}
			if (rsItem != null) {
				try {
					rsItem.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rsItem = null;
			}
			if (rsRlsdPuchOdr != null) {
				try {
					rsRlsdPuchOdr.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rsRlsdPuchOdr = null;
			}
		}
	}

	//==========================================================================
	/**
	 *	���v�ʏ����敪�ύX
	 * �I�[�_�f�}���h�ԍ����ƂɊY���f�[�^�̏��v�ʏ����敪���폜�ɕύX����
	 *
	 * @param odNo �I�[�_�f�}���h�ԍ�
	 * @throws SQLException
	 */
	public void changeMrpTypToDelete(String odNo)
			throws SQLException {

		PreparedStatement ps = null;
		try {
			_log.methodStart();
			String sql;

			sql = "update T_OD set"
				+ " MRP_TYP = 3"								// ���v�ʏ����敪=3:�폜 // 2003/08/28 SQL���C��(�J���}���폜)
				+ ",UPDATED_DATE = ?"
				+ ",UPDATED_BY = ?"
				+ ",UPDATED_PRG_NM = ?"
				+ ",MODIFY_COUNT = MODIFY_COUNT + 1 "
				+ "where OD_NO = ?";
			ps = _conn.prepareStatement(sql);
			ps.setTimestamp(1, new Timestamp(new Date().getTime()));
			ps.setString(2, _userInfo.getUserId());
			ps.setString(3, _userInfo.getBusinessName());
			ps.setString(4, odNo);
			ps.execute();
			
			this.changeCommon(odNo);

			_log.methodEnd();
		}
		finally {
			if (ps != null)
			{
				ps.close();
			}
		}
	}

	//==========================================================================
	/**
	 * �I�[�_���X�V(�����p)
	 * �����œn���ꂽ�I�[�_�f�}���h�ԍ����ƂɃI�[�_���̊������s���B
	 *
	 * @param odNo �I�[�_�f�}���h�ԍ�
	 * @param modifyCount �Ǎ��ݎ��̍X�V��(�`�F�b�N���Ȃ��ꍇ�̓}�C�i�X�l��ݒ�)
	 * @throws SQLException
	 * @throws ApsComException
	 */
	public void changeOrderForComplete(String odNo, long modifyCount)
			throws SQLException,ApsComException {

		PreparedStatement ps = null;
		try {
			_log.methodStart();
			String sql;

			// �X�V���`�F�b�N
			this.checkModifyCount(odNo,modifyCount);

			// ���Ɋ������̌v�Z
			Date rcvCmpltDate = getRcvCmpltDate(odNo);

			// << ���v�ʂ̍X�V >>
			if ( rcvCmpltDate != null ) {

				sql = "update T_OD set"
					+ " RCV_CMPLT_DATE = ?" 					// ���Ɋ�����
					+ ",ODR_STS_TYP = 9"						// �I�[�_��ԋ敪=9:����
					+ ",UPDATED_DATE = ?"
					+ ",UPDATED_BY = ?"
					+ ",UPDATED_PRG_NM = ?"
					+ ",MODIFY_COUNT = MODIFY_COUNT + 1 "
					+ "where OD_NO = ?";
				ps = _conn.prepareStatement(sql);
				ps.setTimestamp(1, new Timestamp(rcvCmpltDate.getTime()));
				ps.setTimestamp(2, new Timestamp(new Date().getTime()));
				ps.setString(3, _userInfo.getUserId());
				ps.setString(4, _userInfo.getBusinessName());
				ps.setString(5, odNo);
				ps.execute();
				ps.close();

				//this.changeCommon(odNo);

				// < ���Ԍv��̍X�V >
				// �X�V���ꂽ[���v��]�����Ԃ̍ŏ�ʕi�ڂ������ꍇ�A
				// [���Ԍv��]."���ԏ�ԋ敪"��'9:����'�ɍX�V
				this.updateJobOdr( odNo, 9 );
			}

			_log.methodEnd();
		}
		finally {
			if (ps != null)
			{
				ps.close();
			}
		}
	}

	//==========================================================================
	/**
	 * �f�}���h���X�V(�H��/�����p)
	 * ���������ƂɃf�}���h���̊����������s���B
	 *
	 * @param workOdrCd ��ƌv��ԍ�
	 * @param workInProcCd �d�|��ƃR�[�h
	 * @param workCmpltDate ��Ɗ�����
	 * @throws SQLException
	 * @throws ApsComException
	 */
	public void changeDemandForComplete(String workOdrCd, String workInProcCd, Date workCmpltDate)
			throws SQLException,ApsComException {
		if ( workOdrCd != null && !workOdrCd.equals("") ) {
		    this.changeDemandForComplete(workOdrCd, workInProcCd, workCmpltDate, "", null);
	    } else {
	    	throw new ApsComException(50040,"(SBM0980) ��ƌv��ԍ��������͂ł�");
	    }
	}

	/**
	 * �f�}���h���X�V(����/�����p)
	 * ���������ƂɃf�}���h���̊����������s���B
	 * @param puchOdrCd �����ԍ�
	 * @param acptCmpltDate ���������
	 * @throws SQLException
	 * @throws ApsComException
	 */
	public void changeDemandForComplete(String puchOdrCd, Date acptCmpltDate)
			throws SQLException,ApsComException {
	    if ( puchOdrCd != null || !puchOdrCd.equals("") ) {
		    this.changeDemandForComplete("", "", null, puchOdrCd, acptCmpltDate);
	    } else {
	    	throw new ApsComException(50031,"(SBM0985) �����ԍ��������͂ł�");
	    }
	}

	/**
	 * �f�}���h���X�V(�����p���C������)
	 * ���������ƂɃf�}���h���̊����������s���B
	 *
	 * @param workOdrCd ��ƌv��ԍ�
	 * @param workInProcCd �d�|��ƃR�[�h
	 * @param workCmpltDate ��Ɗ�����
	 * @param puchOdrCd �����ԍ�
	 * @param acptCmpltDate ���������
	 * @throws SQLException
	 * @throws ApsComException
	 */
	private void changeDemandForComplete(String workOdrCd, String workInProcCd, Date workCmpltDate,
										 String puchOdrCd, Date acptCmpltDate)
			throws SQLException,ApsComException {

		PreparedStatement ps = null;
		PreparedStatement psIssueInst = null;
		ResultSet rs = null;
		try {
			_log.methodStart();

			// �����`�F�b�N
			if ( workOdrCd != null && !workOdrCd.equals("") ) {
			// ��ƌv�悩��
				if ( workCmpltDate == null ) {
					throw new ApsComException(50304,"(SBM0984) �d�|�������������͂ł�");
				}
			} else {
			// ��������
				if ( acptCmpltDate == null ) {
					throw new ApsComException(50261,"(SBM0986) ����������������͂ł�");
				}
			}

			// < �o�Ɏw���̍X�V >
			// �o�Ɋ�����=��Ǝ��т���̏ꍇ"��Ɗ�����"(����)�A������т���̏ꍇ"���������"(����)
			// �o�Ɋ����t���O=1:�I��
			Date cmpltDate = ( workCmpltDate != null ) ? workCmpltDate : acptCmpltDate;
			this.updateIssueInst(workOdrCd, workInProcCd, puchOdrCd, cmpltDate, 1 );

			// �o�Ɏw���f�[�^�̑I��
			psIssueInst = this.selectIssueInst(workOdrCd, workInProcCd, puchOdrCd);
			rs = psIssueInst.executeQuery();

			Date issueCmpltDate = null; 								  // �o�Ɋ�����
			while ( rs.next() ){
				// �o�Ɋ����� = [�o�Ɏw��]."�o�Ɋ�����"�̒��ōĒx�̂���
				if ( issueCmpltDate == null ) {
					issueCmpltDate = rs.getTimestamp("ISSUE_CMPLT_DATE");
				}

				// < ���v�ʂ̍X�V >
				// �X�V���ꂽ�o�Ɏw��."�I�[�_�[�f�}���h�ԍ�"��[���v��]���X�V����
				String odNo = rs.getString("OD_NO");
				String sql = "update T_OD set "
						   + " DM_STS_TYP = 9"					// �f�}���h��ԋ敪=9:����
						   + ",ISSUE_CMPLT_DATE = ?"			// �o�Ɋ����� = �Ēx�o�Ɋ�����
						   + ",UPDATED_DATE = ?"
						   + ",UPDATED_BY = ?"
						   + ",UPDATED_PRG_NM = ?"
						   + ",MODIFY_COUNT = MODIFY_COUNT + 1 "
						   + "where OD_NO = ?";
				ps = _conn.prepareStatement(sql);
				ps.setTimestamp(1, new Timestamp(issueCmpltDate.getTime()));
				ps.setTimestamp(2, new Timestamp(new Date().getTime()));
				ps.setString(3, _userInfo.getUserId());
				ps.setString(4, _userInfo.getBusinessName());
				ps.setString(5, odNo);
				ps.execute();
				ps.close();

				//this.changeCommon(odNo);
			}
			rs.close();
			_log.methodEnd();
		}
		finally {
			if (ps != null)
			{
				ps.close();
			}
			if (psIssueInst != null)
			{
				psIssueInst.close();
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rs = null;
			}
		}
	}

	//==========================================================================
	/**
	 * �I�[�_���X�V(���������p)
	 * �����œn���ꂽ�I�[�_�f�}���h�ԍ����ƂɃI�[�_���̊����������s���B
	 *
	 * @param odNo �I�[�_�f�}���h�ԍ�
	 * @param modifyCount �Ǎ��ݎ��̍X�V��(�`�F�b�N���Ȃ��ꍇ�̓}�C�i�X�l��ݒ�)
	 * @throws SQLException
	 * @throws ApsComException
	 */
	public void changeOrderForCancel(String odNo, long modifyCount)
			throws SQLException,ApsComException {

		PreparedStatement ps = null;
		try {
			_log.methodStart();
			String sql;

			// �X�V���`�F�b�N
			this.checkModifyCount(odNo,modifyCount);

			// < ���v�ʂ̍X�V >
			//�@����I�[�_�f�}���h�ԍ�������[���v��]���X�V
			sql = "update T_OD set"
				+ " ODR_STS_TYP = 2"							// 2:�m��ς�
				+ ",RCV_CMPLT_DATE = null"
				+ ",UPDATED_DATE = ?"
				+ ",UPDATED_BY = ?"
				+ ",UPDATED_PRG_NM = ?"
				+ ",MODIFY_COUNT = MODIFY_COUNT + 1 "
				+ "where OD_NO = ?";
			ps = _conn.prepareStatement(sql);
			ps.setTimestamp(1, new Timestamp(new Date().getTime()));
			ps.setString(2, _userInfo.getUserId());
			ps.setString(3, _userInfo.getBusinessName());
			ps.setString(4, odNo);
			ps.execute();
			ps.close();

			//this.changeCommon(odNo);

			// < ���Ԍv��̍X�V >
			// �X�V���ꂽ[���v��]�����Ԃ̍ŏ�ʕi�ڂ������ꍇ�A
			// [���Ԍv��]."���ԏ�ԋ敪"��'5:���i�ڊm��ς�'�ɍX�V
			this.updateJobOdr( odNo, 5 );

			_log.methodEnd();
		}
		finally {
			if (ps != null)
			{
				ps.close();
			}
		}
	}

	//==========================================================================
	/**
	 * �f�}���h���X�V(�H��/���������p)
	 * ���������ƂɃf�}���h���̊��������������s���B
	 *
	 * @param workOdrCd ��ƌv��ԍ�
	 * @param workInProcCd �d�|��ƃR�[�h
	 * @throws SQLException
	 * @throws ApsComException
	 */
	public void changeDemandForCancel(String workOdrCd, String workInProcCd)
			throws SQLException,ApsComException {
		this.changeDemandForCancel(workOdrCd, workInProcCd, "");
	}

	/**
	 * �f�}���h���X�V(����/���������p)
	 * ���������ƂɃf�}���h���̊��������������s���B
	 * @param puchOdrCd �����ԍ�
	 * @throws SQLException
	 * @throws ApsComException
	 */
	public void changeDemandForCancel(String puchOdrCd)
			throws SQLException,ApsComException {
		this.changeDemandForCancel("", "", puchOdrCd);
	}

	/**
	 * �f�}���h���X�V(���������p���C������)
	 * ���������ƂɃf�}���h���̊��������������s���B
	 *
	 * @param workOdrCd ��ƌv��ԍ�
	 * @param workInProcCd �d�|��ƃR�[�h
	 * @param puchOdrCd �����ԍ�
	 * @throws SQLException
	 * @throws ApsComException
	 */
	private void changeDemandForCancel(String workOdrCd, String workInProcCd, String puchOdrCd )
			throws SQLException,ApsComException {

		PreparedStatement ps = null;
		PreparedStatement psIssueInst = null;
		ResultSet rs = null;
		try {
			_log.methodStart();

			// �����`�F�b�N
			if ( workInProcCd == null || workInProcCd.equals("") ) {
				if ( puchOdrCd == null || puchOdrCd.equals("") ) {
					throw new ApsComException(50031,"(SBM0985) �����ԍ��������͂ł�");
				}
			}

			// < �o�Ɏw���̍X�V >
			// �����o�Ƀf�[�^�̊�����������
			// �o�Ɋ�����=null,�o�Ɋ����t���O=0:�I�t
			this.updateIssueInst( workOdrCd, workInProcCd, puchOdrCd, null, 0 );

			// �o�Ɏw���f�[�^�̑I��
			psIssueInst = this.selectIssueInst(workOdrCd, workInProcCd, puchOdrCd);
			rs = psIssueInst.executeQuery();

			while ( rs.next() ){
				// < ���v�ʂ̍X�V >
				// �o�Ɏw���̉����ɂ�蓯��I�[�_�f�}���h�ԍ��������v�ʂ��X�V����
				String odNo = rs.getString("OD_NO");
				String sql = "update T_OD set "
						   + " DM_STS_TYP = 2"					// �f�}���h��ԋ敪=2:�m��ς�
						   + ",ISSUE_CMPLT_DATE = null" 		// �o�Ɋ����� = null
						   + ",UPDATED_DATE = ?"
						   + ",UPDATED_BY = ?"
						   + ",UPDATED_PRG_NM = ?"
						   + ",MODIFY_COUNT = MODIFY_COUNT + 1 "
						   + "where OD_NO = ?";
				ps = _conn.prepareStatement(sql);
				ps.setTimestamp(1, new Timestamp(new Date().getTime()));
				ps.setString(2, _userInfo.getUserId());
				ps.setString(3, _userInfo.getBusinessName());
				ps.setString(4, odNo);
				ps.execute();
				ps.close();

				//this.changeCommon(odNo);
			}
			rs.close();
			_log.methodEnd();
		}
		finally {
			if (ps != null)
			{
				ps.close();
			}
			if (psIssueInst != null)
			{
				psIssueInst.close();
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rs = null;
			}
		}
	}

	//==========================================================================
	/**
	 *	�o�Ɏw���̑I������
	 *	�o�Ɏw���������ɂ��I�����A���R�[�h�Z�b�g�����߂鏀�����s��
	 *	1.1.3.2-(1) ����сA1.1.4.2-(1)�̑O����
	 *
	 * @param workOdrCd ��ƌv��ԍ�
	 * @param workInProcCd �d�|��ƃR�[�h
	 * @param puchOdrCd �����ԍ�
	 * @return �I�����邽�߂�PrepareStatement
	 * @throws SQLException
	 */
	private PreparedStatement selectIssueInst(String workOdrCd, String workInProcCd, String puchOdrCd)
			throws SQLException{

		_log.methodStart();
		PreparedStatement ps;

		// < �o�Ɏw���̍X�V >
		// �����o�Ƀf�[�^�̊�����������
		String sql = "select * from T_ISSUE_INST "
				   + "where ISSUE_TYP = 3 ";				// �o�Ɏw���o�ɋ敪=3:�����o��

		// �������(����)����
		if (workOdrCd == null || workOdrCd.equals("") ) {
			sql += "and PUCH_ODR_CD = ? "
				+  "order by ISSUE_CMPLT_DATE desc";		// �o�Ɋ������̍~��
			ps = _conn.prepareStatement(sql);
			ps.setString(1, puchOdrCd);
		} else {
			// ��Ǝ���(�H��)����
			// �d�|�����ƃR�[�h��null�̏ꍇ����B
			if (workInProcCd == null || workInProcCd.equals("")) {
				sql += "and WORK_ODR_CD = ? "
					+  "and WORK_IN_PROC_CD is null "
					+  "order by ISSUE_CMPLT_DATE desc";	// �o�Ɋ������̍~��
				ps = _conn.prepareStatement(sql);
				ps.setString(1, workOdrCd);
			} else {
				sql += "and WORK_ODR_CD = ? "
					+  "and WORK_IN_PROC_CD = ? "
					+  "order by ISSUE_CMPLT_DATE desc";	// �o�Ɋ������̍~��
				ps = _conn.prepareStatement(sql);
				ps.setString(1, workOdrCd);
				ps.setString(2, workInProcCd);
			}
		}
		_log.methodEnd();
		// �o�Ɏw���f�[�^�̑I��
		return ps;

	}
	/**
	 *	�o�Ɏw���̍X�V
	 *	�o�Ɏw���������ɂ��X�V����
	 *	1.1.3.2-(1) ����сA1.1.4.2-(1)�̏���
	 *
	 * @param workOdrCd ��ƌv��ԍ�
	 * @param workInProcCd �d�|��ƃR�[�h
	 * @param puchOdrCd �����ԍ�
	 * @param cmpltDate �o�Ɋ�����
	 * @param cmpltFlg �o�Ɋ����t���O
	 * @throws SQLException
	 */
	private void updateIssueInst(String workOdrCd, String workInProcCd,
								 String puchOdrCd, Date cmpltDate, int cmpltFlg)
			throws SQLException {

		PreparedStatement ps = null;
		try {
			_log.methodStart();

			// �����o�Ƀf�[�^�̊�����������
			String sql = "update T_ISSUE_INST set"
					   + " ISSUE_CMPLT_FLG = ?" 				// �o�Ɋ����t���O(����)
					   + ",ISSUE_CMPLT_DATE = ?"				// �o�Ɋ�����(����)
					   + ",UPDATED_DATE = ?"
					   + ",UPDATED_BY = ?"
					   + ",UPDATED_PRG_NM = ?"
					   + ",MODIFY_COUNT = MODIFY_COUNT + 1 "
					   + "where ISSUE_TYP = 3 ";

			// �������(����)����
			if (workOdrCd == null || workOdrCd.equals("") ) {
				sql += "and PUCH_ODR_CD = ? ";
			} else {
				// ��Ǝ���(�H��)����
				// �d�|�����ƃR�[�h��null�̏ꍇ����B
				if (workInProcCd == null || workInProcCd.equals("")) {
					sql += "and WORK_ODR_CD = ? "
						+  "and WORK_IN_PROC_CD is null ";
				} else {
					sql += "and WORK_ODR_CD = ? "
						+  "and WORK_IN_PROC_CD = ? ";
				}
			}

			// �l�̃Z�b�g
			ps = _conn.prepareStatement(sql);
			int i = 1;											// PreparedStatement �ɃZ�b�g����J�E���^
			ps.setInt(i++, cmpltFlg);
			if ( cmpltDate == null ) {
				ps.setNull(i++, Types.DATE);
			} else {
				ps.setTimestamp(i++, new Timestamp(cmpltDate.getTime()));
			}
			ps.setTimestamp(i++, new Timestamp(new Date().getTime()));
			ps.setString(i++, _userInfo.getUserId());
			ps.setString(i++, _userInfo.getBusinessName());

			// �������(����)����
			if (workOdrCd == null || workOdrCd.equals("") ) {
				ps.setString(i++, puchOdrCd);
			} else {
				// ��Ǝ���(�H��)����
				// �d�|�����ƃR�[�h��null�̏ꍇ����B
				if (workInProcCd == null || workInProcCd.equals("")) {
					ps.setString(i++, workOdrCd);
				} else {
					ps.setString(i++, workOdrCd);
					ps.setString(i++, workInProcCd);
				}
			}
			// �X�V���s
			ps.execute();
			ps.close();

			_log.methodEnd();
		}
		finally {
			if (ps != null)
			{
				ps.close();
			}
		}
	}

	/**
	 *	���Ԍv��̍X�V
	 *	�X�V���ꂽ[���v��]�����Ԃ̍ŏ�ʕi�ڂ������ꍇ�A[���Ԍv��]."���ԏ�ԋ敪"��
	 *	�w�肳�ꂽ�敪�ɕύX����
	 *	1.1.3.1-(2) ����сA1.1.4.1-(2)�̏���
	 *
	 * @param odNo �I�[�_�f�}���h�ԍ�
	 * @param jobOdrStsTyp ���ԏ�ԋ敪
	 * @throws SQLException
	 */
	private void updateJobOdr(String odNo, int jobOdrStsTyp)
			throws SQLException {

		PreparedStatement ps = null;
		PreparedStatement psOd = null;
		ResultSet rs = null;
		try {
			_log.methodStart();

			String sql = "select * from T_OD where OD_NO = ?";
			psOd = _conn.prepareStatement(sql);
			psOd.setString(1, odNo);
			rs = psOd.executeQuery();
			if ( rs.next() ) {

				int mrpOdrTyp = rs.getInt("MRP_ODR_TYP");
				String parentOdNo = rs.getString("PARENT_OD_NO");
				String jobOdrCd = rs.getString("JOB_ODR_CD");
				int jobOdrDetailNo = rs.getInt("JOB_ODR_DETAIL_NO");
				int jobOdrCancelNo = rs.getInt("JOB_ODR_CANCEL_NO");

				// �i�ڎ�z�敪=���ԊǗ��i�� �ł��A�e�I�[�_�f�}���h�ԍ���NULL�̏ꍇ�ɍX�V
				if (( mrpOdrTyp == 1 || mrpOdrTyp == 2 ) && parentOdNo == null) {
					sql = "update T_JOB_ODR set"
						+ " JOB_ODR_STS_TYP = ? "				// ���ԏ�ԋ敪�̕ύX
						+ ",UPDATED_DATE = ?"
						+ ",UPDATED_BY = ?"
						+ ",UPDATED_PRG_NM = ?"
						+ ",MODIFY_COUNT = MODIFY_COUNT + 1 "
						+ "where JOB_ODR_CD = ? "
						+ "and JOB_ODR_DETAIL_NO = ? "
						+ "and JOB_ODR_CANCEL_NO = ?";
					ps = _conn.prepareStatement(sql);
					ps.setInt(1, jobOdrStsTyp );
					ps.setTimestamp(2, new Timestamp( new Date().getTime()) );
					ps.setString(3, _userInfo.getUserId() );
					ps.setString(4, _userInfo.getBusinessName() );
					ps.setString(5, jobOdrCd );
					ps.setInt(6, jobOdrDetailNo );
					ps.setInt(7, jobOdrCancelNo );
					ps.execute();
					ps.close();
				}
			}
			_log.methodEnd();
		}
		finally {
			if (ps != null)
			{
				ps.close();
			}
			if (psOd != null)
			{
				psOd.close();
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rs = null;
			}
		}
	}


	//==========================================================================
	// �ȉ��A���ʊ֐�
	//==========================================================================

	/**
	 * ���ʂ܂�߁i�؏グ�^�j
	 * �����œn���ꂽ���ʁA�݌ɐ��ʒP�ʋ敪�����Ƃɐ��ʂ܂�߂��s���B
	 *	1.�����Ǘ��ŁA�����������l�̏ꍇ�A�����l��؏グ�Đ����ɕϊ�����
	 *	2.�����Ǘ��ŁA�����̏�����5�ʁ�0�̏ꍇ�A������5�ʂ�؏グ��
	 *	3.�����Ǘ��ŁA�����̏�����5�ʁ�0�̏ꍇ�A������5�ʈȉ���؂�̂Ă�
	 *
	 * @param qty ����
	 * @param unitQtyTyp �݌ɐ��ʒP�ʋ敪�ԍ�
	 * @return ���ʂ܂�ߌ���
	 */
	public double  changeQtyUp(double qty, int unitQtyTyp){

		_log.methodStart();
		double result = 0;
		String strResult = "";
		String strQty = Double.toString(qty);

		// �݌ɐ��ʒP�ʋ敪�������Ǘ�
		if ( unitQtyTyp == 1 ) {
			strResult = Calculate.ceil(strQty, 0);
		}
		//�݌ɐ��ʒP�ʋ敪�������Ǘ�
		if ( unitQtyTyp == 2 ) {
			if ( (int)( qty * 100000 ) % 10 == 0 ) {
				// �����_��5�ʂ��[���̏ꍇ�͏����_��5�ʈȉ���؂�̂Ă�
				strResult = Calculate.floor(strQty,4);
			} else {
				// �����_��5�ʂ��[���ȊO�̏ꍇ�͏����_��5�ʂ�؏グ��
				strResult = Calculate.ceil(strQty,4);
			}
		}
		result = Double.parseDouble(strResult);
		_log.methodEnd();
		return result;
	 }

	/**
	 * ���t�֐�(���t�̍Œx����Ԃ�)
	 * @return �Œx��(2099�N�̓��t)
	 */
	private Date getLastDate(){
		Calendar lastDate = Calendar.getInstance();
		lastDate.set(Calendar.YEAR, 2099);
		return lastDate.getTime();
	}
	/**
	 * ���t�֐�(���t�̍ő�����Ԃ�)
	 * @return �ő���(1901�N�̓��t)
	 */
	private Date getFirstDate(){
		Calendar firstDate = Calendar.getInstance();
		firstDate.set(Calendar.YEAR, 1901);
		return firstDate.getTime();
	}

	/**
	 * �Ɩ��^�p�����擾
	 * # ���͔ėp���i������̂�������Ȃ���
	 *
	 * @return �Ɩ��^�p��
	 * @throws SQLException
	 * @throws ApsComException
	 */
	public Date getBusinessOprDate()
			throws SQLException,ApsComException {

		PreparedStatement ps = null;
		java.util.Date retDate = null;
		ResultSet rs = null;
		try {
			_log.methodStart();

			String sql = "select * from SYS_DATE_CTRL where PLANT_CD = ?";
			ps = _conn.prepareStatement(sql);
			ps.setString(1, _plantCd);
			rs = ps.executeQuery();
			if ( rs.next() ) {
				retDate = rs.getDate("BUSINESS_OPR_DATE");
			} else {
				rs.close();
				_log.methodEnd();
				throw new ApsComException(50700,"(SBM0977) �Ώۃf�[�^�����݂��܂���");
			}
			rs.close();
			ps.close();

			_log.methodEnd();
		}
		finally {
			if (ps != null)
			{
				ps.close();
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rs = null;
			}
		}
		return retDate;
	}

	/**
	 * �g�p����SimpleDateFormat�I�u�W�F�N�g��Ԃ�
	 * @return "yyyy/MM/dd HH:mm:ss"��SimpleDateFormat
	 */
	private static final SimpleDateFormat getMySimpleDateFormat() {
		return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	
	}


	/**
	 * ���v�ʍēW�J�˗��A���v�ʌv�Z����̍X�V���s��
	 *
	 * @param odNo �I�[�_�f�}���h�ԍ�
	 * @param count �X�V��
	 * @throws SQLException
	 * @throws ApsComException
	 */
	public void checkModifyCount(String odNo, long count)
			throws SQLException,ApsComException {

		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			_log.methodStart();
			if (count >= 0) {

				String sql = "select * from T_OD where OD_NO = ?";
				ps = _conn.prepareStatement(sql);
				ps.setString(1, odNo);
				rs = ps.executeQuery();
				if (rs.next()) {
					if (rs.getLong("MODIFY_COUNT") != count) {
						rs.close();
						_log.methodEnd();
						throw new ApsComException(50802, "(SBM0978) ���ɑ��҂ɂ���čX�V����Ă��܂�");
					}
				}
				rs.close();
				ps.close();
			}
			_log.methodEnd();
		}
		finally {
			if (ps != null)
			{
				ps.close();
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rs = null;
			}
		}
	}

	/**
	 * ���v�ʍēW�J�˗��A���v�ʌv�Z����̍X�V���s��
	 *
	 * @param odNo �I�[�_�f�}���h�ԍ�
	 * @throws SQLException
	 */
	public void changeCommon(String odNo)
			throws SQLException {

		PreparedStatement ps = null;
		PreparedStatement psOd = null;
		PreparedStatement psMrpReex = null;
		PreparedStatement pstmt = null;
		ResultSet rsOd = null;
		ResultSet rsMrpReex = null;
		try {
			_log.methodStart();
			String sql;
			int rsRows;

			sql = "select * from T_OD where OD_NO = ?";
			psOd = _conn.prepareStatement(sql);
			psOd.setString(1, odNo);
			rsOd = psOd.executeQuery();

			if ( rsOd.next() ) {
				String jobOdrCd = rsOd.getString("JOB_ODR_CD");
				int jobOdrDetailNo = rsOd.getInt("JOB_ODR_DETAIL_NO");
				int jobOdrCancelNo = rsOd.getInt("JOB_ODR_CANCEL_NO");
				int odLevelNo = rsOd.getInt("OD_LEVEL_NO");

				// << ���v�ʍēW�J�˗��̍X�V >>
				// �������ɑ��݂��Ă���΂Ȃɂ����Ȃ��B
				sql = "select * from T_MRP_REEXPLOSION "
					+ "where OD_NO = ? "						// �I�[�_�f�}���h�ԍ�
					+ "and PLANT_CD = ? "						// �H��R�[�h
					+ "and JOB_ODR_CD = ? " 					// ����
					+ "and JOB_ODR_DETAIL_NO = ? "				// ���Ԏ}��
					+ "and JOB_ODR_CANCEL_NO = ? "				// ���Ԏ�������ԍ�
					+ "and OD_LEVEL_NO = ? ";					// ���v�ʃ��x���ԍ�
				psMrpReex = _conn.prepareStatement(sql);
				psMrpReex.setString(1, odNo);
				psMrpReex.setString(2, _plantCd);
				psMrpReex.setString(3, jobOdrCd);
				psMrpReex.setInt(4, jobOdrDetailNo);
				psMrpReex.setInt(5, jobOdrCancelNo);
				psMrpReex.setInt(6, odLevelNo);
				rsMrpReex = psMrpReex.executeQuery();

				if ( ! rsMrpReex.next() ) {

					sql = "insert into T_MRP_REEXPLOSION ( "
						+ " OD_NO"								// �I�[�_�f�}���h�ԍ�
						+ ",PLANT_CD"							// �H��R�[�h
						+ ",JOB_ODR_CD" 						// ����
						+ ",JOB_ODR_DETAIL_NO"					// ���Ԏ}��
						+ ",JOB_ODR_CANCEL_NO"					// ���Ԏ�������ԍ�
						+ ",OD_LEVEL_NO"						// ���v�ʃ��x���ԍ�
						+ ",CREATED_BY" 						// �쐬��
						+ ",CREATED_PRG_NM" 					// �쐬�v���O������
						+ ",UPDATED_BY" 						// �X�V��
						+ ",UPDATED_PRG_NM" 					// �X�V�v���O������
						+ ",MODIFY_COUNT"						// �X�V��

						+ ") values ("

						+ "?"								  // �I�[�_�f�}���h�ԍ�
						+ ",?" 						  // �H��R�[�h
						+ ",?" 						  // ����
						+ ",?"							  // ���Ԏ}��
						+ ",?"							  // ���Ԏ�������ԍ�
						+ ",?"								  // ���v�ʃ��x���ԍ�
						+ ",?"			  // �쐬��
						+ ",?"		  // �쐬�v���O������
						+ ",?"			  // �X�V��
						+ ",?"		  // �X�V�v���O������
						+ ",0" //	�X�V��
						+ ")";

					pstmt = _conn.prepareStatement(sql);
					pstmt.setString(1, odNo);
					pstmt.setString(2, _plantCd);
					pstmt.setString(3, jobOdrCd);
					pstmt.setInt(4, jobOdrDetailNo);
					pstmt.setInt(5, jobOdrCancelNo);
					pstmt.setInt(6, odLevelNo);
					pstmt.setString(7, _userInfo.getUserId());
					pstmt.setString(8, _userInfo.getBusinessName());
					pstmt.setString(9, _userInfo.getUserId());
					pstmt.setString(10, _userInfo.getBusinessName());
					rsRows = pstmt.executeUpdate();
					pstmt.close();
				}

				// << ���v�ʌv�Z����(����)�̍X�V >>
				// ���v�ʃ����e�i���X���t���O��1:�������ɕύX����B
				sql = "update SYS_JOB_OD_CALC_CTRL set"
					+ " OD_MNT_FLG = 1 "
					+ ",UPDATED_DATE = ?"
					+ ",UPDATED_BY = ?"
					+ ",UPDATED_PRG_NM = ?"
					+ ",MODIFY_COUNT = MODIFY_COUNT + 1 "
					+ "where PLANT_CD = ? "
					+ "and JOB_ODR_CD = ?";
				ps = _conn.prepareStatement(sql);
				ps.setTimestamp(1, new Timestamp(new Date().getTime()));
				ps.setString(2, _userInfo.getUserId());
				ps.setString(3, _userInfo.getBusinessName());
				ps.setString(4, _plantCd);
				ps.setString(5, jobOdrCd);
				ps.execute();
				ps.close();
			}
			_log.methodEnd();
		}
		finally {
			if (ps != null)
			{
				ps.close();
			}
			if (psOd != null)
			{
				psOd.close();
			}
			if (psMrpReex != null)
			{
				psMrpReex.close();
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				pstmt = null;
			}
			if (rsOd != null) {
				try {
					rsOd.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rsOd = null;
			}
			if (rsMrpReex != null){
				try{
					rsMrpReex.close();
				}catch(Exception e){
					e.printStackTrace();
				}
				rsMrpReex = null;
			}
		}

 	}

	/**
	 * ��z������̌v�Z
	 *
	 * @param difference ���� (=��z���[�h�^�C��)
	 * @param prdStartDate ��� (=���������)
	 * @return ��z�����
	 * @throws ApsComException
	 */
	public Date calcOdrStartDate(int difference, Date startDate)
			throws ApsComException {

		_log.methodStart();
		Date odrStartDate = null;

		// ���� �ғ����Z�o���i�̌Ăяo��
		WorkCalendar workDay = null;
		try{
			workDay = new WorkCalendar( _iconn, _userInfo.getUserId(), _userInfo.getBusinessName(),
										   _plantCd, startDate, -difference, false );
			odrStartDate = workDay.calcDate();
			workDay = null;
		}
		catch (FoundationException ex) {
			_log.methodEnd();
			throw new ApsComException(50553,"(SBM0979) �I�[�_�f�}���h�ԍ��̔ԃf�[�^�����݂��܂���");
		}
/*
		try {
			//�@�H��R�[�h���J�����_�����擾
			String sql = "select * from M_PLANT where PLANT_CD = ? ";
			PreparedStatement ps = _conn.prepareStatement(sql);
			ps.setString(1, _plantCd);
			ResultSet rsPlant = ps.executeQuery();
			if (rsPlant.next()) {
				int calNo = rsPlant.getInt("CAL_NO");
				odrStartDate = getActiveDate(calNo, startDate, difference);
			} else {
				rsPlant.close();
				_log.methodEnd();
				throw new ApsComException(50700, "�Ώۃf�[�^�����݂��܂���");
			}
			rsPlant.close();
			ps.close();
		}
		catch (Exception ex) {
			_log.methodEnd();
			throw new ApsComException(50553, "�I�[�_�f�}���h�ԍ��̔ԃf�[�^�����݂��܂���");
		}
*/
		_log.methodEnd();
		return odrStartDate;
	}
	public Date calcOdrStartDate(int difference, Date startDate,String itemCd)
			throws ApsComException {

		_log.methodStart();
		Date odrStartDate = null;
		// ���� �ғ����Z�o���i�̌Ăяo��
		WorkCalendar workDay = null;
		try{
			workDay = new WorkCalendar( _iconn, _userInfo.getUserId(), _userInfo.getBusinessName(),
										   _plantCd,itemCd, startDate, -difference, false );
			odrStartDate = workDay.calcDate();
			workDay = null;
		}
		catch (FoundationException ex) {
			_log.methodEnd();
			throw new ApsComException(50553,"(SBM0979) �I�[�_�f�}���h�ԍ��̔ԃf�[�^�����݂��܂���");
		}
		_log.methodEnd();
		return odrStartDate;
	}
	/**
	 * �ғ����Z�o(�ċA�֐�)
	 * �������œn���Ă������t�ƍ�������ғ������Z�o����B���������鎞�͍ċA�Ăяo���B
	 * # �ėp���i������̂ł�����𗘗p
	 *
	 * @param calNo �J�����_�ԍ�
	 * @param date �Ώۓ��t
	 * @param difference ����
	 * @return �Z�o�ғ���
	 * @throws SQLException
	 * @throws ApsComException
	 */
/*
	private Date getActiveDate(int calNo, Date date, int difference)
			throws SQLException,ApsComException {

		_log.methodStart();

		// # M_CAL.CAL_DATE �́AVERCHAR���ځB<-�Ȃ��??
		// # TO_DATE �ŕϊ�����̂�Oracle�ŗL�ɂȂ�̂ŕ����ł̔�r���s���B
		String sql = "select * from M_CAL where CAL_NO = ? and CAL_DATE = ?";
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
		String sDate = f.format(date);
		Date retDate = null;

		// [�J�����_]���������A�ғ��������ׂ�
		PreparedStatement ps = _conn.prepareStatement(sql);
		ps.setInt(1, calNo);								// �J�����_�ԍ�
		ps.setString(2, sDate); 							// ���t
		ResultSet rs = ps.executeQuery();

		if ( rs.next() ) {
			int isHoliday = rs.getInt("HOLIDAY_FLG");
			// ����=0 & ���̓����ғ����Ȃ�΁A���̓����Ώۓ�
			if (isHoliday == 0 && difference == 0) {
				_log.methodEnd();
				return date;
			}
			// �ғ����Ȃ�΍��������炵�A�ċA�Ăяo�����s��
			if (isHoliday == 0) {
				difference--;
			}
			// ���t������߂�
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			cal.add(Calendar.DATE, -1);
			Date yesterday = cal.getTime();
			// �ċA�Ăяo��
			retDate = this.getActiveDate(calNo, yesterday, difference);

		} else {
			rs.close();
			_log.methodEnd();
			throw new ApsComException(50502,"�J�����_���׃f�[�^�����݂��܂���");
		}
		rs.close();
		ps.close();

		_log.methodEnd();
		return retDate;
	}
*/
	/**
	 * �I�[�_�f�}���h�ԍ��̔�
	 *
	 * @return �I�[�_�f�}���h�ԍ�
	 * @throws ApsComException
	 */
	private String getNewOdNo()
			throws ApsComException {

		_log.methodStart();

		String newOdNo = "";

		// ���� �̔ԕ��i�̌Ăяo��
		try{
			Numbering cn = new Numbering( _iconn,Numbering.ODNO,_userInfo.getUserId(),_userInfo.getBusinessName(),_plantCd );
			newOdNo = cn.getNo();
			cn = null;
		} catch (FoundationException ex) {
			_log.methodEnd();
			throw new ApsComException(50553,"(SBM0979) �I�[�_�f�}���h�ԍ��̔ԃf�[�^�����݂��܂���");
		}

/*
		// ���� �ԍ��̔�
		// �̔ԕ��i���g��Ȃ��ȈՔ�->�G���[�`�F�b�N������������ł�
		// ��L orteus�ł�L���ɂ���炱������R�����g�A�E�g���Ă�������
		try {
			String sql = "select * from SYS_OD_NO_CTRL where PLANT_CD = ? ";
			PreparedStatement ps = _conn.prepareStatement(sql);
			ps.setString(1, _plantCd);
			ResultSet rs = ps.executeQuery();
			if ( rs.next() ) {
				java.math.BigDecimal odNo = new java.math.BigDecimal(rs.getString("OD_NO"));
				odNo = odNo.add( new java.math.BigDecimal(1) );
				newOdNo = "00000000000000000000000" + odNo.toString();
				newOdNo = newOdNo.substring(newOdNo.length() - 23);

				sql = "update SYS_OD_NO_CTRL set"
					+ " OD_NO = ?" // �I�[�_�f�}���h�ԍ�
					+ ",UPDATED_DATE = ?"
					+ ",UPDATED_BY = ?"
					+ ",UPDATED_PRG_NM = ?"
					+ ",MODIFY_COUNT = MODIFY_COUNT + 1 "
					+ "where PLANT_CD = ?";
				ps = _conn.prepareStatement(sql);
				ps.setString(1, newOdNo.toString());
				ps.setTimestamp(2, new Timestamp(new Date().getTime()));
				ps.setString(3, _userInfo.getUserId());
				ps.setString(4, _userInfo.getBusinessName());
				ps.setString(5, _plantCd);
				ps.execute();
				newOdNo = _plantCd + newOdNo;
			}
		} catch (Exception ex) {
			_log.methodEnd();
			throw new ApsComException(50553,"�I�[�_�f�}���h�ԍ��̔ԃf�[�^�����݂��܂���");
		}
		// ���� �����܂�*************************
*/
		_log.methodEnd();
		return newOdNo;
	}

	/**
	 *�@���[�U���ێ��p�N���X(�C���i�[�N���X)
	 */
	class UserInfo {

		private String userId;			   // ���[�UID
		private String businessName;	   // �Ɩ���

		public UserInfo(String userId, String businessName) {
			this.userId = userId;
			this.businessName = businessName;
		}
		public String getUserId() {
			return userId;
		}
		public String getBusinessName() {
			return businessName;
		}
	}
	/**
	 * ���O�o��(�C���i�[�N���X)
	 */
	class Log {
		private int indent = 0;
		private SystemLog _syslog = new SystemLog();   // �������O�o�̓N���X

		// �R���X�g���N�^	  // 2003/08/11 connection�擾���C��
		public Log(String packageName,IDbConnection conn){
			// ���� ������
			_syslog.init(packageName);
			_syslog.setConnection(conn);
		}

		public void methodStart() {
			log("start");
			indent++;
		}
		public void methodEnd() {
			indent--;
			log("end");
		}
		public void message(String message) {
			log(message);
		}
		private void log(String message) {

			// ���̃��\�b�h���Ăяo�������\�b�h���擾
			// (JDK1.3�̏ꍇSecurityManager#getStackTrace()���g��)
			StackTraceElement e = (new Throwable()).getStackTrace()[2];
			String className = e.getClassName();
			String methodName = e.getMethodName();

			// �p�b�P�[�W���������N���X�����擾
			StringTokenizer st = new StringTokenizer(className, ".");
			String lastClassName = "";
			while (st.hasMoreTokens()) {
				lastClassName = st.nextToken();
			}
			// ���̎��Ԃ��擾
			Date now = new Date();
			SimpleDateFormat f = new SimpleDateFormat("M/d HH:mm:ss.SSS");
			String sNow = f.format(now);
			String out = sNow + " <" + indent + "> [" + lastClassName + "/" + methodName + "] " +  message;

			// ���� ���O�o��
			_syslog.fine_d( out, _userInfo.getUserId() );

			// ���O�o��(System.out��)
			//System.out.println(out);
		}
	}
}
