/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/process/ValidateWh.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */

package com.nec.jp.orteus.expj.pr.rcvissue.process;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;

import com.nec.jp.orteus.expj.pr.rcvissue.util.StringUtil;
import com.nec.jp.orteus.expj.pr.rcvissue.common.RcvIssueConst;

/**
 * <pre>
 * �L���ۊǋ�̋K��l�擾�N���X
 * �ۊǋ�̗L���K��l���擾���邱�Ƃ��ł��܂��B
 * </pre>
 * @author $Author: wang-derui $
 * @version $Revision: 1.7 $ $Date: 2009/11/04 09:54:44 $
 *
 **/

public class ValidateWh implements RcvIssueConst{

	/**
	 * �R���X�g���N�^
	 */
	private ValidateWh(){
	}

	//-------  ���J���\�b�h  -------------------------------

	/**
	 * <pre>
	 * �����o�ɂ̏o�ɕۊǋ揇���擾����B
	 * �H��R�[�h�A�i�ڃR�[�h�����ɉ��L���������s���ĕۊǋ�R�[�h���擾����B
	 * getPriorityByItem()��getMrpAscAll()�̏��ŏ��������s���A
	 * �f�[�^�����݂������_�ŏ����I���B
	 * </pre>
	 *
	 * @param iConnect �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param iPlantCd		�H��R�[�h
	 * @param iItemCd	   �i�ڔԍ�
	 * @return List �o�Ɍ��ۊǋ�R�[�h<br>�f�[�^�����݂��Ȃ��ꍇ�̓T�C�Y0��List�B
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public static final List getAutoIssue(IDbConnection iConnect, String iPlantCd, String iItemCd)
		throws SQLException {

		List outList;

		// �����`�F�b�N
		if( iConnect == null || !StringUtil.Validate(iPlantCd) || !StringUtil.Validate(iItemCd) ){
			IllegalArgumentException e = new IllegalArgumentException("ValidateWh.getAutoIssue()");
			throw e;
		}

		// �@�H��R�[�h�A�i�ڔԍ��A���v�ʌv�Z�Ώۃt���O������
		//	 [�i�ڕʕۊǐ�D�揇��]�A[�ۊǋ�]����ۊǋ�R�[�h�ꗗ��
		//	 �D�揇�ʔԍ��̏����Ŏ擾����B
		outList = getPriorityByItem(iConnect, iPlantCd, iItemCd, RcvIssueConst.SORT_ASC);
		if( outList.size() > 0 ){
			return outList;
		}

		// �A���v�ʌv�Z�Ώۃt���O��ON�i1:���v�ʌv�Z�Ώہj�̕ۊǋ�R�[�h�ꗗ��
		//	 [�ۊǋ�]����ۊǋ�R�[�h�̏����Ŏ擾����B
		outList = getMrpAscAll(iConnect, iPlantCd);
		if( outList.size() > 0 ){
			return outList;
		}

		// 1�����f�[�^�����݂��Ȃ������ꍇ�����I��
		return outList;

	}

	/**
	 * <pre>
	 * �]��݌Ɉꊇ�U�ւ̐U�֕ۊǋ揇���擾����B
	 * �H��R�[�h�A�i�ڃR�[�h�����ɉ��L���������s���ĕۊǋ�R�[�h���擾����B
	 * getMrpDescExceptPriority()��getPriorityByItem()�̏��ŏ��������s���A
	 * �擾�����f�[�^�S�Ă�ۊǋ�R�[�h�̍~���ŕԋp����B
	 * </pre>
	 *
	 * @param iConnect �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param iPlantCd		�H��R�[�h
	 * @param iItemCd	   �i�ڔԍ�
	 * @return List �o�Ɍ��ۊǋ�R�[�h<br>�f�[�^�����݂��Ȃ��ꍇ�̓T�C�Y0��List�B
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public static final List getFree(IDbConnection iConnect, String iPlantCd, String iItemCd)
		throws SQLException {

		List outList = new ArrayList();
		List wkList;

		// �����`�F�b�N
		if( iConnect == null || !StringUtil.Validate(iPlantCd) || !StringUtil.Validate(iItemCd) ){
			IllegalArgumentException e = new IllegalArgumentException("ValidateWh.getFree()");
			throw e;
		}

		// �@���v�ʌv�Z�Ώۃt���O��ON�i1:���v�ʌv�Z�Ώہj����[�i�ڕʕۊǐ�D�揇��]�ɖ��o�^��
		//	 �ۊǋ�R�[�h�ꗗ��[�ۊǋ�]����ۊǋ�R�[�h�̍~���Ŏ擾����B
		wkList = getMrpDescExceptPriority(iConnect, iPlantCd, iItemCd);
		if( wkList.size() > 0 ){
			for( int i=0; i<wkList.size(); i++ ){
				outList.add((String)wkList.get(i));
			}
			wkList.clear();
		}

		// �A�H��R�[�h�A�i�ڔԍ��A���v�ʌv�Z�Ώۃt���O������
		//	 [�i�ڕʕۊǐ�D�揇��]�A[�ۊǋ�]����ۊǋ�R�[�h�ꗗ��
		//	 �D�揇�ʔԍ��̍~���Ŏ擾����B
		wkList = getPriorityByItem(iConnect, iPlantCd, iItemCd, RcvIssueConst.SORT_DESC);
		if( wkList.size() > 0 ){
			for( int i=0; i<wkList.size(); i++ ){
				outList.add((String)wkList.get(i));
			}
			wkList.clear();
		}

		// 1�����f�[�^�����݂��Ȃ������ꍇ�����I��
		if( outList.size() <= 0 ){
			return outList;
		}

		return outList;

	}

	/**
	 * <pre>
	 * �f�t�H���g���ɕۊǋ���擾����B
	 * �H��R�[�h�A�i�ڃR�[�h�����ɉ��L���������s���ĕۊǋ�R�[�h���擾����B
	 * getPriorityByItem()��getInsideTypical()��getMinimum()�̏��ŏ��������s���A
	 * �f�[�^�����݂������_�ŏ����I���B
	 * </pre>
	 *
	 * @param iConnect �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param iPlantCd		�H��R�[�h
	 * @param iItemCd	   �i�ڔԍ�
	 * @return String ���Ɍ��ۊǋ�R�[�h<br>�f�[�^�����݂��Ȃ��ꍇ�͋󕶎��B
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public static final String getDefaultOprWh(IDbConnection iConnect, String iPlantCd, String iItemCd)
		throws SQLException {

		List outList;
		String outWhCd = "";

		// �����`�F�b�N
		if( iConnect == null || !StringUtil.Validate(iPlantCd) || !StringUtil.Validate(iItemCd) ){
			IllegalArgumentException e = new IllegalArgumentException("ValidateWh.getDefaultIssue()");
			throw e;
		}

		// �@getRcvByItem() �����s
		outWhCd = getRcvByItem(iConnect, iPlantCd, iItemCd);
		if( !"".equals(outWhCd) ){
			return outWhCd;
		}

		// �AgetInsideTypical() �����s
		outWhCd = getInsideTypical(iConnect, iPlantCd);
		if( !"".equals(outWhCd) ){
			return outWhCd;
		}

		// �BgetMinimum() �����s
		outWhCd = getMinimum(iConnect, iPlantCd);
		if( !"".equals(outWhCd) ){
			return outWhCd;
		}

		// 1�����f�[�^�����݂��Ȃ������ꍇ�����I��
		return outWhCd;

	}

	/**
	 * <pre>
	 * �f�t�H���g�󂯓���ۊǋ���擾����B
	 * �H��R�[�h�A�i�ڃR�[�h�����ɉ��L���������s���ĕۊǋ�R�[�h���擾����B
	 * getRcvByItem()��getOutsideTypical()��getMinimum()�̏��ŏ��������s���A
	 * �f�[�^�����݂������_�ŏ����I���B
	 * </pre>
	 *
	 * @param iConnect �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param iPlantCd		�H��R�[�h
	 * @param iItemCd	   �i�ڔԍ�
	 * @return String �o�Ɍ��ۊǋ�R�[�h<br>�f�[�^�����݂��Ȃ��ꍇ�͋󕶎��B
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public static final String getDefaultRcv(IDbConnection iConnect, String iPlantCd, String iItemCd)
		throws SQLException {

		List outList;
		String outWhCd = "";

		// �����`�F�b�N
		if( iConnect == null || !StringUtil.Validate(iPlantCd) || !StringUtil.Validate(iItemCd) ){
			IllegalArgumentException e = new IllegalArgumentException("ValidateWh.getDefaultIssue()");
			throw e;
		}

		// �@getRcvByItem() �����s
		outWhCd = getRcvByItem(iConnect, iPlantCd, iItemCd);
		if( !"".equals(outWhCd) ){
			return outWhCd;
		}

		// �AgetOutsideTypical() �����s
		outWhCd = getOutsideTypical(iConnect, iPlantCd);
		if( !"".equals(outWhCd) ){
			return outWhCd;
		}

		// �BgetMinimum() �����s
		outWhCd = getMinimum(iConnect, iPlantCd);
		if( !"".equals(outWhCd) ){
			return outWhCd;
		}

		// 1�����f�[�^�����݂��Ȃ������ꍇ�����I��
		return outWhCd;

	}

	/**
	 * �H��R�[�h�A���v�ʌv�Z�Ώۃt���O������[�ۊǋ�]����ŏ��̕ۊǋ�R�[�h���擾����B
	 *
	 * @param iConnect �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param iPlantCd		�H��R�[�h
	 * @return String �ۊǋ�R�[�h([�ۊǋ�]."�ۊǋ�R�[�h"�̍ł��������ۊǋ�R�[�h)<br>�f�[�^�����݂��Ȃ��ꍇ�͋󕶎��B
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public static final String getMinimum(IDbConnection iConnect, String iPlantCd)
		throws SQLException {

		PreparedStatement ps = null;
		ResultSet rs = null;

		// �����`�F�b�N
		if( iConnect == null || !StringUtil.Validate(iPlantCd) ){
			IllegalArgumentException e = new IllegalArgumentException("ValidateWh.getMinimum()");
			throw e;
		}

		Connection conn = iConnect.getConn();
		String outWhCd = "";

		// [�ۊǋ�]�f�[�^�Ǎ���SQL
		// ���������F�H��R�[�h�A���v�ʌv�Z�Ώۃt���O��1
		String selectMWh =
			"select"
				+ " MIN(M_WH.WH_CD) "
				+ "from"
				+ " M_WH "
				+ "where"
				+ " M_WH.PLANT_CD = ?"
				+ " and M_WH.MRP_FLG = ?";
		try {
			// �f�[�^�Ǎ���SQL�쐬
			ps = conn.prepareStatement(selectMWh);
			ps.setString(1, iPlantCd);
			ps.setInt(2, RcvIssueConst.MRP_TARGET);
			rs = ps.executeQuery();

			// ���݃`�F�b�N
			rs.next();
			if(rs.getString(1) == null){
				return outWhCd;
			}

			// ���ʂ�ݒ�
			outWhCd = rs.getString(1);

			return outWhCd;

		} finally {
			if (ps != null) {
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
	 * <pre>
	 * �H��R�[�h�A�i�ڔԍ��A���v�ʌv�Z�Ώۃt���O������
	 * [�i�ڕʕۊǐ�D�揇��]�A[�ۊǋ�]����ۊǋ�R�[�h�ꗗ��
	 * �D�揇�ʔԍ��̏����܂��͍~���Ŏ擾����B
	 * </pre>
	 *
	 * @param iConnect �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param iPlantCd		�H��R�[�h
	 * @param iItemCd		�i�ڔԍ�
	 * @param iSortTyp		�\�[�g�t���O TRUE�F�����AFALSE�F�~��
	 * @return List	�D��ۊǋ�R�[�h([�i�ڕʕۊǐ�D�揇��]."�i�ڕʕۊǐ�D�揇��"�̏���or�~��)<br>�f�[�^�����݂��Ȃ��ꍇ�̓��X�g�T�C�Y��0�B
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public static final List getPriorityByItem(IDbConnection iConnect, String iPlantCd, String iItemCd, boolean iSortTyp)
		throws SQLException {

		PreparedStatement ps = null;
		ResultSet rs = null;

		// �����`�F�b�N
		if( iConnect == null ||
			!StringUtil.Validate(iPlantCd) || !StringUtil.Validate(iItemCd) ){
			IllegalArgumentException e = new IllegalArgumentException("ValidateWh.getPriorityByItem()");
			throw e;
		}

		Connection conn = iConnect.getConn();
		List outList = new ArrayList();

		// [�i�ڕʕۊǐ�D�揇��]�f�[�^�Ǎ���SQL
		// ���������F�H��R�[�h�A�ۊǋ�R�[�h�A���v�ʌv�Z�Ώۃt���O��1
		// �\�[�g�^�C�v�̐ݒ�
		String selectMWhPriority = "";
		if( iSortTyp ){
			selectMWhPriority =
			"select"
				+ " M_WH_PRIORITY.WH_CD "
				+ "from"
				+ " M_WH_PRIORITY, "
				+ " M_WH "
				+ "where"
				+ " M_WH_PRIORITY.WH_CD = M_WH.WH_CD"
				+ " and M_WH_PRIORITY.PLANT_CD = ?"
				+ " and M_WH_PRIORITY.ITEM_CD = ?"
				+ " and M_WH.MRP_FLG = ? "
				+ "order by "
				+ " M_WH_PRIORITY.WH_PRIORITY_REF_NO ASC";
		} else {
			selectMWhPriority =
			"select"
				+ " M_WH_PRIORITY.WH_CD "
				+ "from"
				+ " M_WH_PRIORITY, "
				+ " M_WH "
				+ "where"
				+ " M_WH_PRIORITY.WH_CD = M_WH.WH_CD"
				+ " and M_WH_PRIORITY.PLANT_CD = ?"
				+ " and M_WH_PRIORITY.ITEM_CD = ?"
				+ " and M_WH.MRP_FLG = ? "
				+ "order by "
				+ " M_WH_PRIORITY.WH_PRIORITY_REF_NO DESC";
		}
		try {		
			// �f�[�^�Ǎ���SQL�쐬
			ps = conn.prepareStatement(selectMWhPriority);
			ps.setString(1, iPlantCd);
			ps.setString(2, iItemCd);
			ps.setInt(3, RcvIssueConst.MRP_TARGET);
			rs = ps.executeQuery();

			// ���݃`�F�b�N
			if(rs.next()){
				// ���ʂ�ݒ�
				outList.add(rs.getString(1));
				while(rs.next()){
					// �f�[�^���擾
					outList.add(rs.getString(1));
				}
			}

			return outList;

		} finally {
			if (ps != null) {
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
	 * <pre>
	 * �H��R�[�h�A�i�ڔԍ��A���v�ʌv�Z�Ώۃt���O������
	 * [�i�ڕʓ��ɐ�ۊǋ�]�A[�ۊǋ�]����ۊǋ�R�[�h���擾����B
	 * </pre>
	 *
	 * @param iConnect �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param iPlantCd		�H��R�[�h
	 * @param iItemCd		�i�ڔԍ�
	 * @return String	�i�ڕʓ��ɐ�ۊǋ�R�[�h<br>�f�[�^�����݂��Ȃ��ꍇ�͋󕶎��B
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public static final String getRcvByItem(IDbConnection iConnect, String iPlantCd, String iItemCd)
		throws SQLException {

		PreparedStatement ps = null;
		ResultSet rs = null;

		// �����`�F�b�N
		if( iConnect == null ||
			!StringUtil.Validate(iPlantCd) || !StringUtil.Validate(iItemCd) ){
			IllegalArgumentException e = new IllegalArgumentException("ValidateWh.getRcvByItem()");
			throw e;
		}

		Connection conn = iConnect.getConn();
		String outWhCd = "";

		// [�i�ڕʕۊǐ�D�揇��]�f�[�^�Ǎ���SQL
		// ���������F�H��R�[�h�A�ۊǋ�R�[�h�A���v�ʌv�Z�Ώۃt���O��1
		String selectMItemRcvWh =
			"select"
				+ " M_ITEM_RCV_WH.WH_CD "
				+ "from"
				+ " M_ITEM_RCV_WH, "
				+ " M_WH "
				+ "where"
				+ " M_ITEM_RCV_WH.WH_CD = M_WH.WH_CD"
				+ " and M_ITEM_RCV_WH.PLANT_CD = ?"
				+ " and M_ITEM_RCV_WH.ITEM_CD = ?"
				+ " and M_WH.MRP_FLG = ?";
		try {
			// �f�[�^�Ǎ���SQL�쐬
			ps = conn.prepareStatement(selectMItemRcvWh);
			ps.setString(1, iPlantCd);
			ps.setString(2, iItemCd);
			ps.setInt(3, RcvIssueConst.MRP_TARGET);
			rs = ps.executeQuery();

			// ���݃`�F�b�N
			if(rs.next()){
				// ���ʂ�ݒ�
				outWhCd = rs.getString(1);
			}

			return outWhCd;

		} finally {
			if (ps != null) {
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
	 * <pre>
	 * �H��R�[�h�A���v�ʌv�Z�Ώۃt���O�A�����\�t���O������
	 * [�ۊǋ�]��������\�̕ۊǋ�R�[�h���擾����B
	 * </pre>
	 *
	 * @param iConnect �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param iPlantCd		�H��R�[�h
	 * @return String �����\�ۊǋ�R�[�h<br>�f�[�^�����݂��Ȃ��ꍇ�͋󕶎��B
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public static final String getInsideTypical(IDbConnection iConnect, String iPlantCd)
		throws SQLException {

		PreparedStatement ps = null;
		ResultSet rs = null;

		// �����`�F�b�N
		if( iConnect == null || !StringUtil.Validate(iPlantCd) ){
			IllegalArgumentException e = new IllegalArgumentException("ValidateWh.getInsideTypical()");
			throw e;
		}

		Connection conn = iConnect.getConn();
		String outWhCd = "";

		// [�i�ڕʕۊǐ�D�揇��]�f�[�^�Ǎ���SQL
		// ���������F�H��R�[�h�A���v�ʌv�Z�Ώۃt���O��1�A�����\�t���O��1
		String selectMWh =
			"select"
				+ " MIN(M_WH.WH_CD) "
				+ "from"
				+ " M_WH "
				+ "where"
				+ " M_WH.PLANT_CD = ?"
				+ " and M_WH.MRP_FLG = ?" 
				+ " and M_WH.WH_INSIDE_FLG = ?";
		try {
			// �f�[�^�Ǎ���SQL�쐬
			ps = conn.prepareStatement(selectMWh);
			ps.setString(1, iPlantCd);
			ps.setInt(2, RcvIssueConst.MRP_TARGET);
			ps.setInt(3, RcvIssueConst.WH_INSIDE_TYPICAL);
			rs = ps.executeQuery();

			// ���݃`�F�b�N
			rs.next();
			if( rs.getString(1) == null ){
				return outWhCd;
			}

			// ���ʂ�ݒ�
			outWhCd = rs.getString(1);

			return outWhCd;

		} finally {
			if (ps != null) {
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
	 * <pre>
	 * �H��R�[�h�A�O���\�t���O������
	 * [�ۊǋ�]����O���\�̕ۊǋ�R�[�h���擾����B
	 * </pre>
	 *
	 * @param iConnect �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param iPlantCd		�H��R�[�h
	 * @return String �O���\�ۊǋ�R�[�h<br>�f�[�^�����݂��Ȃ��ꍇ�͋󕶎��B
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public static final String getOutsideTypical(IDbConnection iConnect, String iPlantCd)
		throws SQLException {

		PreparedStatement ps = null;
		ResultSet rs = null;

		// �����`�F�b�N
		if( iConnect == null || !StringUtil.Validate(iPlantCd) ){
			IllegalArgumentException e = new IllegalArgumentException("ValidateWh.getOutsideTypical()");
			throw e;
		}

		Connection conn = iConnect.getConn();
		String outWhCd = "";

		// [�i�ڕʕۊǐ�D�揇��]�f�[�^�Ǎ���SQL
		// ���������F�H��R�[�h�A�O���\�t���O��1
		String selectMWh =
			"select"
				+ " MIN(M_WH.WH_CD) "
				+ "from"
				+ " M_WH "
				+ "where"
				+ " M_WH.PLANT_CD = ?"
				+ " and M_WH.WH_OUTSIDE_FLG = ?";
		try {
			// �f�[�^�Ǎ���SQL�쐬
			ps = conn.prepareStatement(selectMWh);
			ps.setString(1, iPlantCd);
			ps.setInt(2, RcvIssueConst.WH_OUTSIDE_TYPICAL);
			rs = ps.executeQuery();

			// ���݃`�F�b�N
			rs.next();
			if( rs.getString(1) == null ){
				return outWhCd;
			}

			// ���ʂ�ݒ�
			outWhCd = rs.getString(1);

			return outWhCd;

		} finally {
			if (ps != null) {
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
	 * <pre>
	 * ���v�ʌv�Z�Ώۃt���O��ON�i1:���v�ʌv�Z�Ώہj�̕ۊǋ�R�[�h�ꗗ��
	 * [�ۊǋ�]����ۊǋ�R�[�h�̏����Ŏ擾����B
	 * </pre>
	 *
	 * @param iConnect �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param iPlantCd		�H��R�[�h
	 * @param oWhCdList		�ۊǋ�R�[�h([�ۊǋ�]."�ۊǋ�R�[�h"�̏���)
	 * @return List �ۊǋ�R�[�h([�ۊǋ�]."�ۊǋ�R�[�h"�̏���)<br>�f�[�^�����݂��Ȃ��ꍇ�̓��X�g�T�C�Y��0�B
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public static final List getMrpAscAll(IDbConnection iConnect, String iPlantCd)
		throws SQLException {

		PreparedStatement ps = null;
		ResultSet rs = null;

		// �����`�F�b�N
		if( iConnect == null || !StringUtil.Validate(iPlantCd) ){
			IllegalArgumentException e = new IllegalArgumentException("ValidateWh.getMrpAscAll()");
			throw e;
		}

		Connection conn = iConnect.getConn();
		List outList = new ArrayList();

		// [�ۊǋ�]�f�[�^�Ǎ���SQL
		// ���������F�H��R�[�h�A���v�ʌv�Z�Ώۃt���O��1
		String selectMWh =
			"select"
				+ " M_WH.WH_CD "
				+ "from"
				+ " M_WH "
				+ "where"
				+ " M_WH.PLANT_CD = ?"
				+ " and M_WH.MRP_FLG = ? "
				+ "order by "
				+ " M_WH.WH_CD ASC";
		try {
			// �f�[�^�Ǎ���SQL�쐬
			ps = conn.prepareStatement(selectMWh);
			ps.setString(1, iPlantCd);
			ps.setInt(2, RcvIssueConst.MRP_TARGET);
			rs = ps.executeQuery();

			// ���݃`�F�b�N
			if(rs.next()){
				// ���ʂ�ݒ�
				outList.add(rs.getString(1));
				while(rs.next()){
					// �f�[�^���擾
					outList.add(rs.getString(1));
				}
			}

			return outList;

		} finally {
			if (ps != null) {
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
	 * <pre>
	 * ���v�ʌv�Z�Ώۃt���O��ON�i1:���v�ʌv�Z�Ώہj����[�i�ڕʕۊǐ�D�揇��]�ɖ��o�^��
	 * �ۊǋ�R�[�h�ꗗ��[�ۊǋ�]����ۊǋ�R�[�h�̍~���Ŏ擾����B
	 * </pre>
	 *
	 * @param iConnect �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param iPlantCd		�H��R�[�h
	 * @param iItemCd		�i�ڔԍ�
	 * @return List �ۊǋ�R�[�h([�ۊǋ�]."�ۊǋ�R�[�h"�̏���)<br>�f�[�^�����݂��Ȃ��ꍇ�̓��X�g�T�C�Y��0�B
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public static final List getMrpDescExceptPriority(IDbConnection iConnect, String iPlantCd, String iItemCd)
		throws SQLException {

		PreparedStatement ps = null;
		ResultSet rs = null;

		// �����`�F�b�N
		if( iConnect == null || !StringUtil.Validate(iPlantCd) ){
			IllegalArgumentException e = new IllegalArgumentException("ValidateWh.getMrpDescExceptPriority()");
			throw e;
		}

		Connection conn = iConnect.getConn();
		List outList = new ArrayList();

		// [�ۊǋ�]�f�[�^�Ǎ���SQL
		// ���������F�H��R�[�h�A���v�ʌv�Z�Ώۃt���O��1�A[�i�ڕʕۊǐ�D�揇��]�ɖ��o�^
		String selectMWh =
			"select"
				+ " WH_CD "
				+ "from"
				+ " M_WH "
				+ "where"
				+ " PLANT_CD =  ? "
				+ " and MRP_FLG = ? "
				+ " and (not exists("
				+ "  select"
				+ "   WH_CD"
				+ "  from"
				+ "   M_WH_PRIORITY"
				+ "  where"
				+ "   M_WH.WH_CD = M_WH_PRIORITY.WH_CD"
				+ "   and PLANT_CD = ?"
				+ "   and ITEM_CD = ?"
				+ "   and MRP_FLG = ?)) "
				+ "order by "
				+ " M_WH.WH_CD DESC";
		try {
			// �f�[�^�Ǎ���SQL�쐬
			ps = conn.prepareStatement(selectMWh);
			ps.setString(1, iPlantCd);
			ps.setInt(2, RcvIssueConst.MRP_TARGET);
			ps.setString(3, iPlantCd);
			ps.setString(4, iItemCd);
			ps.setInt(5, RcvIssueConst.MRP_TARGET);
			rs = ps.executeQuery();

			// ���݃`�F�b�N
			if(rs.next()){
				// ���ʂ�ݒ�
				outList.add(rs.getString(1));
				while(rs.next()){
					// �f�[�^���擾
					outList.add(rs.getString(1));
				}
			}

			return outList;

		} finally {
			if (ps != null) {
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
}
