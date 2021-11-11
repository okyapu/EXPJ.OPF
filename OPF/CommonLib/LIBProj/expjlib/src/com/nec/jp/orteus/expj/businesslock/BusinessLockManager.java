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
 * �Ɩ����b�N�����s����B 
 *
 * @author $Author: tai-yanhong $
 * @version $Revision: 1.9 $ $Date: 2012/04/07 07:14:38 $
 */
class BusinessLockManager
{
	/** �Ɩ����b�N��`�̍H��敪:���H��̂� */
	private final static int OWN_PLANT_ONLY = 1;
	/** �Ɩ����b�N��`�̍H��敪:�S�H�� */
	private final static int ALL_PLANT = 2;
	/** �ő�Ɩ����b�N�����L�[�l */
	private final static int MAX_LOCK_DESCRIPTOR = 99999999;
	/** DB�Ƃ̃R�l�N�V���� */
	private IDbConnection _conn = null;
	/** ���[�U�R�[�h */
	private String _userCode  = null;
	/** �H��R�[�h */
	private String _plantCode = null;
	/** �p�b�P�[�W�� */
	private final static String _packageName = "BusinessLockManager";
	/** �Ɩ����b�N��� */
	private List _lockingInfoList = null;

	/** �r�����b�N�e�[�u���ɋƖ����b�N���s�������ł���|�������A�����ɋƖ����b�N�����L�[���擾����SQL */
	private String _lockAndGetDescriptorSql =
		"select lock_descriptor " +
		"from sys_lock_exclusive " +
		"where ctrl_cd = 'SYSTEM' " +
		"for update wait 5 ";
	
	/** �r�����b�N�e�[�u���ɋƖ����b�N�����������ł���|�������A�����ɋƖ����b�N�����L�[���擾����SQL */
	private String _unlockAndGetDescriptorSql =
		"select lock_descriptor " +
		"from sys_lock_exclusive " +
		"where ctrl_cd = 'SYSTEM' " +
		"for update wait 5 ";

	/** ���b�N�󋵃e�[�u�����烍�b�N�����ǂ����₢���킹��SQL */
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

	/** �r�����b�N�e�[�u���̋Ɩ����b�N�����L�[���X�V����SQL */
	private String _incrementDescriptorSql =
		"update sys_lock_exclusive " +
		"set lock_descriptor = ? " +
		"where ctrl_cd = 'SYSTEM' ";

	/** ���b�N�g�����e�[�u�����烍�b�N����Ɩ���/�ΏۍH��敪���擾����SQL */
	private String _getLockMatrixSql =
		"select mode_form_to_name, target_plant_typ " +
		"from sys_business_lock " +
		"where mode_form_from_name = ? ";

	/** ���b�N�󋵃e�[�u���Ƀ��b�N����Ɩ���ǉ�����SQL */
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

	/** ���b�N�󋵃e�[�u������Ɩ����b�N���|�����Ă���Ɩ�������SQL */
	private String _unlockSql =
		"delete sys_lock_status " +
		"where cancel_cd = ? ";

	/** �H��}�X�^����H��R�[�h���擾����SQL */
	private String _getPlantCodeSql =
		"select plant_cd " +
		"from m_plant " +
		"order by plant_cd ";

	/**
	 * �Ɩ����b�N�Ǘ����\�z���܂��B
	 *
	 * @param conn DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param userCode Orteus���[�U��
	 * @param planCode �H��R�[�h
	 */
	BusinessLockManager(IDbConnection conn, String userCode, String plantCode)
	{
		_conn = conn;
		_userCode = userCode;
		_plantCode = plantCode;
	}

	/**
	 * �Ɩ����b�N�����s���܂��B
	 *
	 * @param businessName ���b�N���Ɩ���
	 * @return �Ɩ����b�N�����L�[�ƂȂ鎯�ʎq�B���s������-1�B�Ɩ���`�e�[�u���ɒ�`���Ȃ��Ƃ���-2�B
	 */
	int doLock(String businessName)
	{
		int descriptor = -1;		// �Ɩ����b�N�����L�[
		boolean autoCommitState;	// �����R�~�b�g���
		try {
			// �����R�~�b�g��}�~
			autoCommitState = _conn.getConn().getAutoCommit();
			_conn.getConn().setAutoCommit(false);
		} catch (Exception e) {
			return -1;
		}
		try {
			PreparedStatement stmt = null;	// ���b�N��Ɩ����擾�p
			ResultSet res = null;			// ���b�N��Ɩ����擾����
			try {
				// �Ɩ����b�N��`�e�[�u����Ǎ�
				stmt = _conn.getConn().prepareStatement(_getLockMatrixSql);
				stmt.setString(1, businessName);
				res = stmt.executeQuery();
				if ( res.next() == false ) {
					return -2;
				}
				// �Ɩ����b�N�����̔r��������J�n�������L�[���擾
				descriptor = this.lockAndGetDescriptor();
				if (descriptor == -1) {
					return -1;
				}
				// ���̋Ɩ��ɂ��Ɩ����b�N���𔻒�
				if (this.isLocking(businessName) == true) {
					return -1;
				}
				// �S�H��R�[�h���擾
				ArrayList plants = this.getAllPantCode();
				// �Ɩ����b�N�����L�[�̒l���X�V
				incrementDescriptor(descriptor);
				// �Ɩ����b�N�����s
				do {
					String toBusiness = res.getString(1);
					switch (res.getInt(2)) {
					case OWN_PLANT_ONLY:	// ���H��
						this.lock(businessName, _plantCode, toBusiness, descriptor);
						break;
					case ALL_PLANT:			// �S�H��
						for (int i = 0; i < plants.size(); i++) {
							this.lock(businessName, (String)(plants.get(i)), toBusiness,
									descriptor);
						}
						break;
					}
				}while (res.next() == true);
				// �������ʂ��m��i�Ɩ����b�N�����̔r������������j
				_conn.getConn().commit();
			} finally {
				this.closeResultSet(res);
				this.closePreparedStatement(stmt);
			}
		} catch (Exception e) {
			return -1;
		} finally {
			try {
				// �Ɩ����b�N�����̔r������������������R�~�b�g��Ԃ𕜋�
				_conn.getConn().rollback();
				_conn.getConn().setAutoCommit(autoCommitState);
			} catch (SQLException e) {
				// SQLException�𖳎�
			}
		}
		return descriptor;
	}

	/**
	 * �Ɩ����b�N���������܂��B
	 *
	 * @param businessName �A�����b�N���郍�b�N���Ɩ���
	 * @param descriptor �Ɩ����b�N�����L�[
	 * @return ���s���������̌��ʐ���^�ُ�
	 */
	boolean doUnLock(String businessName, int descriptor)
	{
		boolean autoCommitState;	// �����R�~�b�g���
		try {
			// �����R�~�b�g��}�~
			autoCommitState = _conn.getConn().getAutoCommit();
			_conn.getConn().setAutoCommit(false);
		} catch (Exception e) {
			return false;
		}
		try {
			// �Ɩ����b�N�����̔r��������J�n
			if (this.unlockAndGetDescriptor() == -1) {
				return false;
			}
			// �Ɩ����b�N�̉���
			this.unlock(descriptor);
			// �������ʂ��m��i�Ɩ����b�N�����̔r������������j
			_conn.getConn().commit();
		} catch (Exception e) {
			return false;
		} finally {
			try {
				// �Ɩ����b�N�����̔r������������������R�~�b�g��Ԃ𕜋�
				_conn.getConn().rollback();
				_conn.getConn().setAutoCommit(autoCommitState);
			} catch (SQLException e) {
				// SQLException�𖳎�
			}
		}
		return true;
	}

	/**
	 * �Ɩ����b�N�����擾���܂��B
	 *
	 * @return �Ɩ����b�N�i�G���[�j���
	 */
	List getLockingInfo()
	{
		return _lockingInfoList;
	}

	/**
	 * �S�H��R�[�h���擾���܂��B
	 *
	 * @return �H��R�[�h�̃��X�g
	 * @throws SQLException
	 */
	private ArrayList getAllPantCode()
			throws SQLException
	{
		PreparedStatement stmt = null;		// �H��R�[�h�擾�pSQL��
		ResultSet res = null;				// �擾�����H��R�[�h
		ArrayList plants = new ArrayList();	// �H��R�[�h�ԋp�p���X�g
		try {
			// �S�H��R�[�h���擾
			stmt = _conn.getConn().prepareStatement(_getPlantCodeSql);
			res = stmt.executeQuery();
			while (res.next() == true) {
				// �ԋp�p���X�g�Ɋi�[
				plants.add(res.getString(1));
			}
		} finally {
			this.closePreparedStatement(stmt);
			this.closeResultSet(res);
		}
		return plants;
	}

	/**
	 * �Ɩ����b�N���s�����̔r�������ݒ肵�A�Ɩ����b�N�����L�[��Ԃ��܂��B
	 * ���ɋƖ����b�N�����̔r�����䒆�Ȃ�΁A-1��Ԃ��܂��B
	 *
	 * @return �Ɩ����b�N�����L�[�i�������j�^-1�i���s���j
	 * @throws SQLException
	 */
	private int lockAndGetDescriptor()
			throws SQLException
	{
		PreparedStatement stmt = null;	// �Ɩ����b�N�����J�n�pSQL
		ResultSet res = null;			// �Ɩ����b�N�����L�[���܂ޏ�������
		int descriptor = -1;			// �Ɩ����b�N�����L�[
		_lockingInfoList = null;
		try {
			// �r�����b�N�e�[�u�������b�N���i�Ɩ����b�N�����̔r������j�A�Ɩ����b�N�����L�[���擾
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
	 * �Ɩ����b�N���������̔r�������ݒ肵�A�Ɩ����b�N�����L�[��Ԃ��܂��B
	 * ���ɋƖ����b�N�����̔r�����䒆�Ȃ�΁A-1��Ԃ��܂��B
	 *
	 * @return �Ɩ����b�N�����L�[�i�������j�^-1�i���s���j
	 * @throws SQLException
	 */
	private int unlockAndGetDescriptor()
			throws SQLException
	{
		PreparedStatement stmt = null;	// �Ɩ����b�N�����J�n�pSQL
		ResultSet res = null;			// �Ɩ����b�N�����L�[���܂ޏ�������
		int descriptor = -1;			// �Ɩ����b�N�����L�[
		_lockingInfoList = null;
		try {
			// �r�����b�N�e�[�u�������b�N���i�Ɩ����b�N�����̔r������j�A�Ɩ����b�N�����L�[���擾
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
	 * �Ɩ����b�N�����ǂ����₢���킹�܂��B
	 *
	 * @param businessName �⍇���Ώۂ̋Ɩ���
	 * @return true�i�Ɩ����b�N���j�^false�i�Ɩ����b�N�Ȃ��j
	 * @throws SQLException
	 */
	private boolean isLocking(String businessName)
			throws SQLException
	{
		PreparedStatement stmt = null;	// �Ɩ����b�N���擾�pSQL
		ResultSet res = null;			// �Ɩ����b�N���擾����
		try {
			// ���b�N�󋵃e�[�u���ɑ΂��Ď��Ɩ����Ɩ����b�N�����⍇��
			stmt = _conn.getConn().prepareStatement(_isLockingSql);
			stmt.setString(1, businessName);
			stmt.setString(2, _plantCode);
			res = stmt.executeQuery();
			if (res.next() == false) {
				return false;
			}
			// �Ɩ����b�N����ۑ�
			_lockingInfoList = new ArrayList();
			do {
				String info[] = new String[4];
				info[0] = res.getString(1);		// �H�ꖼ
				info[1] = res.getString(2);		// ���[�U��
				info[2] = res.getString(4);		// �Ɩ����i�Ɩ����b�N���̑��Ɩ��j
				info[3] = res.getString(3);		// ���R�[�h��������
				_lockingInfoList.add(info);
			} while (res.next() == true);
		} finally {
			this.closePreparedStatement(stmt);
			this.closeResultSet(res);
		}
		return true;
	}

	/**
	 * �Ɩ����b�N�����L�[���C���N�������g���܂��B
	 * �Ɩ����b�N�����L�[���擾�ł��Ȃ������ꍇ�́A-1��ԋp���܂��B
	 *
	 * @param descriptor �Ɩ����b�N�����L�[
	 * @throws SQLException
	 */
	private void incrementDescriptor(int descriptor)
			throws SQLException
	{
		PreparedStatement stmt = null;	// �Ɩ����b�N�����L�[�X�V�pSQL��
		try {
			int newDescriptor;
			if (descriptor >= MAX_LOCK_DESCRIPTOR) {
				newDescriptor = 1;
			} else {
				newDescriptor = descriptor + 1;
			}
			// �r�����b�N�e�[�u���̋Ɩ����b�N�����L�[���X�V
			stmt = _conn.getConn().prepareStatement(_incrementDescriptorSql);
			stmt.setInt(1, newDescriptor);
			stmt.executeUpdate();
		} finally {
			this.closePreparedStatement(stmt);
		}
	}

	/**
	 * �Ɩ����b�N�����s���܂��B
	 *
	 * @param businessName ���b�N���Ɩ���
	 * @param toPlant �H��R�[�h
	 * @param toName ���b�N��Ɩ���
	 * @param descriptor �Ɩ����b�N�����L�[
	 * @throws SQLException
	 */
	private void lock(String businessName, String toPlant, String toName, int descriptor)
			throws SQLException
	{
		PreparedStatement stmt = null;	// �Ɩ����b�N���s�pSQL
		try {
			// �Ɩ����b�N���s
			stmt = _conn.getConn().prepareStatement(_addLockStateSql);
			stmt.setString(1, toName);			// ���b�N���Ɩ���
			stmt.setString(2, toPlant);			// �H��R�[�h
			stmt.setInt(3, descriptor);			// �Ɩ����b�N�����L�[
			stmt.setString(4, _userCode);		// ���[�U��
			stmt.setString(5, businessName);	// ���b�N��Ɩ���
			stmt.setString(6, _userCode);		// ���[�U��
			stmt.setString(7, _packageName);	// �Ɩ����Ƃ��ăp�b�P�[�W����ݒ�
			stmt.setString(8, _userCode);		// ���[�U��
			stmt.setString(9, _packageName);	// �Ɩ����Ƃ��ăp�b�P�[�W����ݒ�
			stmt.executeUpdate();
		} finally {
			this.closePreparedStatement(stmt);
		}
	}

	/**
	 * �Ɩ����b�N���������܂��B
	 *
	 * @param descriptor �Ɩ����b�N�����L�[
	 * @throws SQLException
	 */
	private void unlock(int descriptor)
			throws SQLException
	{
		PreparedStatement stmt = null;	// �Ɩ����b�N�����pSQL
		try {
			// �Ɩ����b�N������
			stmt = _conn.getConn().prepareStatement(_unlockSql);
			stmt.setInt(1, descriptor);
			stmt.executeUpdate();
		} finally {
			this.closePreparedStatement(stmt);
		}
	}

	/**
	 * �v���y�A�h�X�e�[�g�����g����܂��B
	 *
	 * @param stmt ����Ώۂ̃X�e�[�g�����g
	 */
	private void closePreparedStatement(PreparedStatement stmt)
	{
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				// SQLException�𖳎�
			}
		}
	}

	/**
	 * ���U���g�Z�b�g����܂��B
	 *
	 * @param res ����Ώۂ̃��U���g�Z�b�g
	 */
	private void closeResultSet(ResultSet res)
	{
		if (res != null) {
			try {
				res.close();
			} catch (SQLException e) {
				// SQLException�𖳎�
			}
		}
	}
}
