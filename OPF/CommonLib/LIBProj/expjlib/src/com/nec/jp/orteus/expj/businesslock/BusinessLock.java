/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/businesslock/BusinessLock.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.businesslock;

import java.util.List;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;

/**
 * �Ɩ����b�N�����{���邽�߂̃��[�e�B���e�B�N���X�B
 *
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:27:50 $
 */
public class BusinessLock
{
	/** �Ɩ����b�N�Ǘ� */
	private BusinessLockManager _lockManager = null;

	/**
	 * �Ɩ����b�N�N���X�̃R���X�g���N�^�ł��B
	 *
	 * @param conn DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param userCode Orteus���[�U��
	 * @param planCode �H��R�[�h
	 */
	public BusinessLock(IDbConnection conn, String userCode, String plantCode) {
		_lockManager = new BusinessLockManager(conn, userCode, plantCode);
	}

	/**
	 * �Ɩ����b�N�����s���܂��B
	 *
	 * @param businessName ���b�N����Ɩ���
	 * @return �����L�[�ƂȂ鎯�ʎq
	 */
	public int doLock(String businessName) {
		return _lockManager.doLock(businessName);
	}

	/**
	 * �Ɩ����b�N���������܂��B
	 *
	 * @param businessName �A�����b�N����Ɩ���
	 * @param descriptor ���b�N���ɓn���ꂽ�����L�[
	 * @return ���{���������̌��ʐ���^�ُ�
	 */
	public boolean doUnLock(String businessName, int descriptor) {
		return _lockManager.doUnLock(businessName, descriptor);
	}

	/**
	 * �Ɩ����b�N�����擾���܂��B
	 *
	 * @return �Ɩ����b�N���
	 */
	public List getLockingInfo() {
		return _lockManager.getLockingInfo();
	}
}
