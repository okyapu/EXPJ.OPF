//------------------------------------------------------------------------------
// (#)BusinessLock.java
//�N���[���A�b�v
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/06/04 �V�K�쐬 K.Matsumoto
// 2003/06/24 OrteusStudio�o�[�W�����A�b�v�ɔ����C�� Y.Inada
//            �O�FdoConnection[ver1.00.03]
//            ��FIDbConnection[ver1.00.05]
// 2003/06/25 Copyright�̋L�q�C�� Y.Inada
//            �O�FCopyright (c) 2003 NEC informatec Systems,Ltd.
//            ��FCopyright (c) 2003 NEC Informatec Systems,Ltd.
//            JavaDoc�p�R�����g�̑̍ق𐮂���
// 2003/08/01 �������ύX  (��) userName  (�V) userCode
//            �Ɩ����b�N�����̈������� ��L�C��
//              (��) userName  (��) businnessName
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.util.BusinessLock;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;

/**
 * �Ɩ����b�N�����{���邽�߂̃��[�e�B���e�B�N���X�B
 *
 * @author  K.Matsumoto
 * @version 1.00
 */
public class BusinessLock
{
	/** �Ɩ����b�N�Ǘ� */
	private BusinessLockManager _lockManager = null;

	/**
	 * �Ɩ����b�N�N���X�̃R���X�g���N�^�B
	 *
	 * @param conn DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param userCode Orteus���[�U��
	 * @param planCode �H��R�[�h
	 */
	public BusinessLock(IDbConnection conn, String userCode, String plantCode) {
		_lockManager = new BusinessLockManager(conn, userCode, plantCode);
	}

	/**
	 * �Ɩ����b�N�̎��s�B
	 *
	 * @param businessName ���b�N�^�A�����b�N����Ɩ���
	 * @return �����L�[�ƂȂ鎯�ʎq
	 */
	public int doLock(String businessName) {
		return _lockManager.doLock(businessName);
	}

	/**
	 * �Ɩ����b�N�̉����B
	 *
	 * @param businessName ���b�N�^�A�����b�N����Ɩ���
	 * @param descriptor ���b�N���ɓn���ꂽ�����L�[
	 * @return ���{���������̌��ʐ���^�ُ�
	 */
	public boolean doUnLock(String businessName, int descriptor) {
		return _lockManager.doUnLock(businessName, descriptor);
	}
}
