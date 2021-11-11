//------------------------------------------------------------------------------
// (#)BusinessLock.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/07/28 �V�K�쐬 K.Matsumoto
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
public class BusinessLockAll
{
	/** �Ɩ����b�N�Ǘ� */
	private BusinessLockManager _lockManager = null;

	/**
	 * �Ɩ����b�N�N���X�̃R���X�g���N�^�B
	 *
	 * @param conn DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param userCode Orteus���[�U��
	 */
	public BusinessLockAll(IDbConnection conn, String userCode)
	{
		_lockManager = new BusinessLockManager(conn, userCode, null);
	}

	/**
	 * �Ɩ����b�N�̎��s�B
	 *
	 * @param businessName ���b�N�^�A�����b�N����Ɩ���
	 * @return �����L�[�ƂȂ鎯�ʎq
	 */
	public int doLock(String businessName)
	{
		return _lockManager.doLockAll(businessName);
	}

	/**
	 * �Ɩ����b�N�̉����B
	 *
	 * @param businessName ���b�N�^�A�����b�N����Ɩ���
	 * @param descriptor ���b�N���ɓn���ꂽ�����L�[
	 * @return ���{���������̌��ʐ���^�ُ�
	 */
	public boolean doUnLock(String businessName, int descriptor)
	{
		return _lockManager.doUnLockAll(businessName, descriptor);
	}
}
