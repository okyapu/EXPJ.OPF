//------------------------------------------------------------------------------
// (#)BusinessLockManager.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/06/04 �V�K�쐬 K.Matsumoto
// 2003/06/09 �Ɩ����b�N�������̉����L�[�C���N�������g��p�~ K.Matsumoto
// 2003/06/24 OrteusStudio�o�[�W�����A�b�v�ɔ����C�� Y.Inada
//			  �O�FdoConnection[ver1.00.03]
//			  ��FIDbConnection[ver1.00.05]
// 2003/06/25 Copyright�̋L�q�C�� Y.Inada
//			  �O�FCopyright (c) 2003 NEC informatec Systems,Ltd.
//			  ��FCopyright (c) 2003 NEC Informatec Systems,Ltd.
//			  JavaDoc�p�R�����g�̑̍ق𐮂���
// 2003/07/01 ���b�N�󋵃e�[�u���̗񖼂��C�� K.Matsumoto
//			  ��Fuser_name
//			  ���Fuser_cd
//			  ���b�N�g�ݍ��킹�e�[�u���̗񖼂��C�� K.Matsumoto
//			  ��Fmode_form_name
//			  ���Fmode_form_to_name
// 2003/07/28 �S�H��ɑ΂��ċƖ����b�N���{/�������s�����\�b�h��ǉ�
// 2003/08/01 ��������ύX	(��) userName  (�V) userCode
//			  ��L�ɔ��������ϐ����ύX	(��) _userName	(�V)userCode
//			  �Ɩ����b�N����, �S�H��Ɩ����b�N�����̈������� ��L�C��
//				(��) userName  (��) businessName
// 2003/10/03 M.Isoda
//			  SYS_LOCK_STATUS�e�[�u���̍��ڒǉ��ɔ����ύX
//				�p�b�P�[�W���̒�`�����o�ǉ�
//				_isStatusSql�A_addStatusSql�A_removeStatusSql�̕ύX
//				locking���\�b�h��lock,unlock���\�b�h�ɕ����Ă����Ȃ��悤�ɕύX
// 2003/10/08 K.Shiraki
//            ���b�N������ ��`�e�[�u���̍H��敪�𔻒肵 �H�ꖈ/�S�H���
//            ���b�N�󋵂�o�^����悤�ύX
//            ���b�N�������̃L�[�ύX �H��/���[�U/�����L�[�������L�[
//            DB�Ƃ̃R�l�N�V������ێ�����^�̓R���X�g���N�^�Ŏ󂯂��^�ɏC��
//
//==============================================================================
//
// 2004/06/08 isExclusive() ���b�N���������̔��f���W�b�N��ύX
//�@�@�@�@�@�@���b�N�������łȂ��ꍇ��SYS_LOCK_EXCLUSIVE�����b�N�擾�ł���悤��
//            doUnLock() �g�����U�N�V���������ǉ�
//
// 2004/06/19 isExclusive() ���b�N���������̔��f���W�b�N��ύX
//              free,locked�̃X�e�[�^�X�p�~�AOracle�̃��b�N�݂̂Ŕ��f����B
//              ����ɔ����s�v�ƂȂ郁�\�b�h(modExclusive)��p�~�B
//            UnLock���͔r����������Ȃ��B
//            doLock�ُ̈픭�����㏈����������
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
 * �Ɩ����b�N�����s����B
 *
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.7 $ $Date: 2013/06/27 03:45:54 $
 */
class BusinessLockManager
{
	/** ���b�N��`�̍H��敪:���H��̂� */
	private final static int _OWN_PLANT_ONLY = 1;
	/** ���b�N��`�̍H��敪:�S�H�� */
	private final static int _ALL_PLANT = 2;

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
	
	/** �r�����b�N�e�[�u���ɋƖ����b�N���������ǂ����₢���킹��SQL */
	private String _isExclusiveSql =
		"select lock_status " +
		"from sys_lock_exclusive " +
		"where " +
			"ctrl_cd = 'SYSTEM' " +
			"for update nowait";

	/** ���b�N�󋵃e�[�u�����烍�b�N�����ǂ����₢���킹��SQL */
	private String _isStatusSql =
		"select mode_form_to_name " +
		"from sys_lock_status " +
		"where " +
			"MODE_FORM_TO_NAME = ? and " +
			"plant_cd = ?";

	/** �r�����b�N�e�[�u������Ɩ����b�N�����L�[���擾����SQL */
	private String _getDescSql =
		"select lock_descriptor " +
		"from sys_lock_exclusive " +
		"where ctrl_cd = 'SYSTEM'";
	
	/** �r�����b�N�e�[�u���ɋƖ����b�N�����������ł���|�������A�����ɋƖ����b�N�����L�[���擾����SQL */
	private String _unlockAndGetDescriptorSql =
		"select lock_descriptor " +
		"from sys_lock_exclusive " +
		"where ctrl_cd = 'SYSTEM' " +
		"for update wait 5 ";
	
	/** �r�����b�N�e�[�u���̋Ɩ����b�N�����L�[���X�V����SQL */
	private String _modDescSql =
		"update sys_lock_exclusive " +
		"set lock_descriptor = ? " +
		"where ctrl_cd = 'SYSTEM'";
	
	/** ���b�N�g�ݍ��킹�e�[�u�����烍�b�N����Ɩ���/�ΏۍH��敪���擾����SQL */
	private String _getLockedNameSql =
		"select mode_form_to_name, target_plant_typ " +
		"from sys_business_lock " +
		"where mode_form_from_name = ?";

	/** ���b�N�󋵃e�[�u���Ƀ��b�N���|����Ɩ���ǉ�����SQL */
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

	/** ���b�N�󋵃e�[�u�����烍�b�N���|�����Ă���Ɩ�������SQL */
	private String _removeStatusSql =
		"delete sys_lock_status " +
		"where cancel_cd = ?";

	/** �H��}�X�^����H��R�[�h���擾����SQL */
	private String _getPlantCodeSql =
		"select plant_cd " +
		"from m_plant " +
		"order by plant_cd";

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
		//_conn = conn.getConn();
		_userCode = userCode;
		_plantCode = plantCode;
	}

	/**
	 * �Ɩ����b�N�̎��s�B
	 *
	 * @param businessName ���b�N����Ɩ���
	 * @return �����L�[�ƂȂ鎯�ʎq�B���s������-1�B�Ɩ���`�e�[�u���ɒ�`���Ȃ��Ƃ���-2�B
	 */
	// ���b�N�ςݔ���NG�̂Ƃ� �r���e�[�u�����t���[�ɂ��鏈���ǉ�
	// ���b�N�󋵃e�[�u���̓Ǎ������ǉ�
	// �S�H��R�[�h�Ǎ������ǉ�
	// DB�A�N�Z�X�̎����R�~�b�g��Ԃ̐ݒ菈�� �ǉ�
	int doLock(String businessName){
		int lockDescriptor = -1; // �����L�[
		boolean orgCommit;
		PreparedStatement getLockNameStmt = null; // ���b�N�Ώۂ̋Ɩ������擾
		ResultSet getLockNameRslt = null;  // ���b�N�Ώۂ̋Ɩ����̎擾����

System.err.print(DateFormat.getDateTimeInstance().format(new Date()));
System.err.println(" Lock >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>�y" + businessName + ":" + _userCode + "�z");
		try{
			// �R�~�b�g�^�C�~���O�̐ݒ�
			orgCommit = _conn.getConn().getAutoCommit();
			_conn.getConn().setAutoCommit(false);
		} catch (Exception e) {
System.err.println(e.toString());
System.err.print(DateFormat.getDateTimeInstance().format(new Date()));
System.err.println(" Lock >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>:Exception 1�y" + businessName + ":" + _userCode + "�z");
			return -1;
		}
		try{
			
			// �Ɩ����b�N��`�e�[�u����Ǎ�
			// ���b�N��`�e�[�u���̓��e��Ǎ�
			getLockNameStmt =_conn.getConn().prepareStatement(_getLockedNameSql);
			getLockNameStmt.setString(1, businessName);
			getLockNameRslt = getLockNameStmt.executeQuery();
			if ( getLockNameRslt.next() == false ) {
				return -2;
			}
			// ���b�N�������Ȃ� �����Ȃ��I��
			if(this.isExclusive() == false){

				// �Ɩ����b�N�ςݔ���
				if(this.isLocking(businessName) == false){
					// �����L�[�擾
					lockDescriptor = this.modDescriptor();

					if(lockDescriptor != -1){
System.err.println("   (SBM1205)Lock:�����L�[:" + lockDescriptor + "�y" + businessName + ":" + _userCode + "�z");
						// �H��R�[�h�擾
						ArrayList plants = this.getAllPantCode();

						// �Ɩ����b�N���{
						do {
							String toBusiness = getLockNameRslt.getString(1);
							int target = getLockNameRslt.getInt(2);

							switch(target){
							case _OWN_PLANT_ONLY: // ���H��
								this.lock(businessName, _plantCode, toBusiness, lockDescriptor);
								break;
							case _ALL_PLANT: // �S�H��
								for(int n = 0; n < plants.size(); n++)
									lock(businessName, (String)(plants.get(n)), toBusiness, lockDescriptor);
								break;
							}
						}while(getLockNameRslt.next() == true);
System.err.println("   (SBM1206)Lock:�R�~�b�g");
						_conn.getConn().commit();
					}

				}
			}
		}catch(Exception e){
System.err.println(e.toString());
System.err.print(DateFormat.getDateTimeInstance().format(new Date()));
System.err.println(" Lock >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>:Exception 2�y" + businessName + ":" + _userCode + "�z");
			e.printStackTrace();
			lockDescriptor = -1;
		}finally{
			try {
System.err.println("   doLock:finally�y" + businessName + ":" + _userCode + "�z");
				// ���b�N�����I��
				_conn.getConn().rollback();
				_conn.getConn().setAutoCommit(orgCommit);

				if(getLockNameRslt!=null){
					this.closeResultSet(getLockNameRslt);
				}
				if(getLockNameStmt!=null){
					this.closePreparedStatement(getLockNameStmt);
				}
			} catch (SQLException e) {
System.err.println("   doLock:finally exceptoin�y" + businessName + ":" + _userCode + "�z");
				// SQLException�𖳎�
			}
		}
System.err.print(DateFormat.getDateTimeInstance().format(new Date()));
System.err.println(" Lock >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>:Normal End�y" + businessName + ":" + _userCode + "�z");
		return lockDescriptor;
	}

	/**
	 * �S�H��ɋƖ����b�N�̎��s�B
	 * ����API�͎b��Ώ��Ŏc���Ă��܂��� �߂������폜���܂��B
	 *
	 * @param businessName ���b�N����Ɩ���
	 * @return �����L�[�ƂȂ鎯�ʎq
	 */
	int doLockAll(String businessName)
	{
		int lockDescriptor = -1; // �����L�[

System.err.print(DateFormat.getDateTimeInstance().format(new Date()));
System.err.println(" ***** LockAll >>>>>>>>>>>>>>>>>>�y" + businessName + ":" + _userCode + "�z");
		try {

			// ���b�N����������
			if (this.isExclusive() == false) {
				try {
					// ���b�N�����J�n
					_conn.getConn().setAutoCommit(false);

					// �����L�[�X�V
					if ((lockDescriptor = this.modDescriptor()) == -1) {
						return -1;
					}

					// �S�H��R�[�h�擾
					ArrayList list = this.getAllPantCode();
					for (int i = 0; i < list.size(); i++) {
						_plantCode = (String)list.get(i);
						// �Ɩ����b�N�ςݔ��� true:locked false:unlocked
						if (this.isLocking(businessName) == false) {
							// �񃍃b�N���F�Ɩ����b�N���{
							this.lockall(businessName, lockDescriptor);
						}else{
							// �Ɩ����b�N��
							_conn.getConn().rollback();

							return -1;
						}
					}

					_conn.getConn().commit();

				} finally {
					// ���b�N�����I��
					_conn.getConn().commit();
					_conn.getConn().setAutoCommit(true);
				}
			}

		} catch (Exception e) {
			// ��O��������-1��ԋp
			lockDescriptor = -1;

			try {
				_conn.getConn().rollback();
			} catch (SQLException exception) {
			}
		}
System.err.print(DateFormat.getDateTimeInstance().format(new Date()));
System.err.println(" LockAll Normal End�y" + businessName + ":" + _userCode + "�z");
		return lockDescriptor;
	}


	/**
	 * �Ɩ����b�N�̉����B
	 *
	 * @param businessName ���b�N�^�A�����b�N����Ɩ���
	 * @param descriptor ���b�N���ɓn���ꂽ�����L�[
	 * @return ���{���������̌��ʐ���^�ُ�
	 */
	 // History 2003/06/09 �����L�[�̃C���N�������g�������폜 K.Matsumoto
	boolean doUnLock(String businessName, int descriptor)
	{
		boolean result = false; 	// ��������
		boolean autoCommitState;	// �����R�~�b�g���

System.err.print(DateFormat.getDateTimeInstance().format(new Date()));
System.err.println(" <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< UnLock�y" + businessName + ":" + _userCode + "�z");
		try {
			// �����R�~�b�g��}�~
			autoCommitState = _conn.getConn().getAutoCommit();
			_conn.getConn().setAutoCommit(false);
		} catch (Exception e) {
System.err.println(e.toString());
System.err.print(DateFormat.getDateTimeInstance().format(new Date()));
System.err.println(" <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< UnLock:Exception 1�y" + businessName + ":" + _userCode + "�z");
			return false;
		}
		try {
			// �Ɩ����b�N�����̔r��������J�n
			if (this.unlockAndGetDescriptor() == -1) {
				return false;
			}
			try {
				// ���b�N�����J�n
				this.unlock(descriptor);
				result = true;
			} finally {
				// ���b�N�����I��
				_conn.getConn().commit();
			}
		} catch (Exception e) {
System.err.println(e.toString());
System.err.print(DateFormat.getDateTimeInstance().format(new Date()));
System.err.println(" <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< UnLock:Exception 2�y" + businessName + ":" + _userCode + "�z");
			// ��O��������false��ԋp
			result = false;
		} finally {
System.err.println("   doUnLock:finally 1�y" + businessName + ":" + _userCode + "�z");
			try {
				// �Ɩ����b�N�����̔r������������������R�~�b�g��Ԃ𕜋�
				_conn.getConn().rollback();
				_conn.getConn().setAutoCommit(autoCommitState);
			} catch (SQLException e) {
System.err.println(e.toString());
System.err.print(DateFormat.getDateTimeInstance().format(new Date()));
System.err.println(" <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< UnLock:Exception 3�y" + businessName + ":" + _userCode + "�z");
				// SQLException�𖳎�
			}
		}
System.err.print(DateFormat.getDateTimeInstance().format(new Date()));
System.err.println(" <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< UnLock Normal End�y" + businessName + ":" + _userCode + "�z");
		return result;
	}

	/**
	 * �S�H��ɋƖ����b�N�̉����B
	 * ����API�͎b��Ώ��Ŏc���Ă��܂��� �߂������폜���܂��B
	 *
	 * @param businessName ���b�N�^�A�����b�N����Ɩ���
	 * @param descriptor ���b�N���ɓn���ꂽ�����L�[
	 * @return ���{���������̌��ʐ���^�ُ�
	 */
	 // History 2003/06/09 �����L�[�̃C���N�������g�������폜 K.Matsumoto
	 // 2003/10/07 �b��Ώ��Ή��Ƃ��� ���e��doUnLock���ĂԂ����ɕύX  K.Shiraki
	boolean doUnLockAll(String businessName, int descriptor)
	{
System.err.print(DateFormat.getDateTimeInstance().format(new Date()));
System.err.println(" <<<<<<<<<<<<<<<<<< UnLockALL ****** �y" + businessName + ":" + _userCode + "�z");
		return doUnLock(businessName, descriptor);
	}
	/**
	 * �S�H��R�[�h���擾����B
	 *
	 * @return �H��R�[�h�̃��X�g
	 * @throws SQLException
	 */
	private ArrayList getAllPantCode() throws SQLException {
		PreparedStatement isPlantCodeStmt = null; // �H��R�[�h���擾
		ResultSet isPlantCodeRslt = null;		  // �擾��������
		ArrayList list = new ArrayList();

		try {
			// �S�H��R�[�h���擾����
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
	 * ���b�N���������ǂ����₢���킹��B
	 *
	 * @return ���b�N��/true�A������/false
	 * @throws SQLException
	 */
	private boolean isExclusive() throws SQLException {
		PreparedStatement isExclusiveStmt = null; // ���b�N���������₤
		ResultSet isExclusiveRslt = null;		  // �₢���킹����

		try {
System.err.println("     isExclusive");
			// �r�����b�N�e�[�u���ɑ΂��ă��b�N���������₢���킹��
			isExclusiveStmt = _conn.getConn().prepareStatement(_isExclusiveSql);
			isExclusiveRslt = isExclusiveStmt.executeQuery();
			if (isExclusiveRslt.next() == true) {
System.err.println("     (SBM1207)isExclusive:false(Lock���łȂ�)");
				return false;
			} else {
System.err.println("     (SBM1208)isExclusive:true(Lock��)");
				return true;
			}
		} finally {
System.err.println("     (SBM1209)isExclusive:finally(�|��)");
			this.closePreparedStatement(isExclusiveStmt);
			this.closeResultSet(isExclusiveRslt);
		}
	}

	/**
	 * �Ɩ����b�N�����ǂ����₢���킹��B
	 *
	 * @param businessName
	 */
	private boolean isLocking(String businessName) throws SQLException {
		PreparedStatement isStatusStmt = null; // �Ɩ����b�N����Ă��邩
		ResultSet isStatusRslt = null;		   // �Ɩ����b�N����Ă��邩����

		try {
System.err.println("     isLocking");
			// ���b�N�󋵃e�[�u���ɑ΂��Ď��Ɩ����Ɩ����b�N�����₢���킹��
			isStatusStmt = _conn.getConn().prepareStatement(_isStatusSql);
			isStatusStmt.setString(1, businessName);
			isStatusStmt.setString(2, _plantCode);
			isStatusRslt = isStatusStmt.executeQuery();

			if (isStatusRslt.next() == true) {
System.err.println("     (SBM1210)isLocking:true(Lock��)");
				return true;
			} else {
System.err.println("     (SBM1211)isLocking:false(Lock���łȂ�)");
				return false;
			}
		} finally {
			this.closeResultSet(isStatusRslt);
			this.closePreparedStatement(isStatusStmt);
		}
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
	 * ���b�N�����L�[���C���N�������g����B
	 * ���b�N�����L�[���擾�ł��Ȃ������ꍇ��-1��ԋp����B
	 *
	 * @return ���b�N�����L�[
	 * @throws SQLException
	 */
	private int modDescriptor() throws SQLException
	{
		PreparedStatement getDescStmt = null; // ���b�N�����L�[���擾
		PreparedStatement modDescStmt = null; // ���b�N�����L�[���X�V
		ResultSet getDescRslt = null;	// �Ɩ����b�N�̉����L�[�擾����
		int descriptor 	  = -1;			// �Ɩ����b�N�̉����L�[
		int moddescriptor = -1;			// �X�V��������L�[

		try {
System.err.println("     modDescriptor");
			// �r�����b�N�e�[�u������Ɩ����b�N�����L�[���擾����
			getDescStmt = _conn.getConn().prepareStatement(_getDescSql);
			getDescRslt = getDescStmt.executeQuery();

			// �Ɩ����b�N�����L�[��ޔ�����B
			// �擾�ł��Ă��Ȃ����-1��ԋp
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
			// �r�����b�N�e�[�u���̉����L�[���X�V����
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
	 * �Ɩ����b�N�����̎��{���s���B
	 *
	 * @param businessName �Ɩ���
	 * @param toPlant �H��R�[�h
	 * @param toName ���b�N�����Ɩ���
	 * @param descriptor �����L�[
	 */
	private void lock(String businessName,
					  String toPlant, String toName,
					  int descriptor) throws SQLException {
		PreparedStatement lockingStmt = null;

		try {
System.err.print("lock");
			// �Ɩ����b�N������SQL��g�ݗ��Ă�
			lockingStmt = _conn.getConn().prepareStatement(_addStatusSql);
			lockingStmt.setString(1, toName);
			lockingStmt.setString(2, toPlant);	// �H��R�[�h
			lockingStmt.setInt(3, descriptor);		// �����L�[
			lockingStmt.setString(4, _userCode);	// ���[�U��
			lockingStmt.setString(5, businessName);	// �Ɩ����i���b�N���鑤�j
			lockingStmt.setString(6, _userCode);	// ���[�U��
			lockingStmt.setString(7, _packageName);	// �Ɩ����Ƃ��ăp�b�P�[�W����ݒ�
			lockingStmt.setString(8, _userCode);	// ���[�U��
			lockingStmt.setString(9, _packageName);	// �Ɩ����Ƃ��ăp�b�P�[�W����ݒ�

			lockingStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(lockingStmt);
		}
	}
	/**
	 * �Ɩ����b�N�����̎��{���s���B ** �S�H��p / �b�菈�u **
	 * ����API�͎b��Ώ��̂��� �쐬���܂����� �߂������폜���܂��B
	 *
	 * @param businessName �Ɩ���
	 * @param descriptor �����L�[
	 */
	private void lockall(String businessName,
					  int descriptor) throws SQLException {
		PreparedStatement getLockNameStmt = null; // ���b�N�Ώۂ̋Ɩ������擾
		PreparedStatement lockingStmt = null; // �Ɩ����b�N����������
		ResultSet getLockNameRslt = null;	  // ���b�N�Ώۂ̋Ɩ����̎擾����

		try {
System.err.println("     lockall ***** ");
			// ���b�N�Ώۂ̋Ɩ������擾
			getLockNameStmt =
				 _conn.getConn().prepareStatement(_getLockedNameSql);
			getLockNameStmt.setString(1, businessName);
			getLockNameRslt = getLockNameStmt.executeQuery();

			// �Ɩ����b�N������SQL��g�ݗ��Ă�
			lockingStmt = _conn.getConn().prepareStatement(_addStatusSql);
			lockingStmt.setString(2, _plantCode);	// �H��R�[�h
			lockingStmt.setInt(3, descriptor);		// �����L�[
			lockingStmt.setString(4, _userCode);	// ���[�U��
			lockingStmt.setString(5, businessName);	// �Ɩ����i���b�N���鑤�j
			lockingStmt.setString(6, _userCode);	// ���[�U��
			lockingStmt.setString(7, _packageName);	// �Ɩ����Ƃ��ăp�b�P�[�W����ݒ�
			lockingStmt.setString(8, _userCode);	// ���[�U��
			lockingStmt.setString(9, _packageName);	// �Ɩ����Ƃ��ăp�b�P�[�W����ݒ�

			// �擾�������b�N�Ώۂ̋Ɩ��̃��b�N�������s��
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
	 * �Ɩ����b�N�����̉������s���B
	 *
	 * @param businessName �Ɩ���
	 * @param descriptor �����L�[
	 */
	// 2003/10/07 ���b�N��`�e�[�u���̓��e���Q�Ƃ��ĉ�������̂ł͂Ȃ�
	//            �����L�[�̃��R�[�h�S�폜  K.Shiraki
	private void unlock(int descriptor) throws SQLException
	{
		PreparedStatement lockingStmt = null; // �Ɩ����b�N����������

		try {
System.err.println("     unlock(" + descriptor + ")");
			// �Ɩ����b�N������SQL��g�ݗ��Ă�
			lockingStmt = _conn.getConn().prepareStatement(_removeStatusSql);
			lockingStmt.setInt(1, descriptor);
			lockingStmt.executeUpdate();
		}
		finally {
			this.closePreparedStatement(lockingStmt);
		}
	}

	/**
	 * �v���y�A�h�X�e�[�g�����g�����B
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
	 * ���U���g�Z�b�g�����B
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