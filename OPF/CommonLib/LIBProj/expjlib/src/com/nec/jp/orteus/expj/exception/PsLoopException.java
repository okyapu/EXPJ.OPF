/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/exception/PsLoopException.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.exception;

import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.expj.exception.ExpjBadException;

/**
 * ���i�\���̃��[�v�ُ��ʒm���邽�߂̗�O�N���X
 *
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:27:54 $
 */
public class PsLoopException extends ExpjBadException
{
	/**
	 * PsLoopException�I�u�W�F�N�g���\�z���܂�
     *
	 * @param em �G���[���b�Z�[�W�i���b�Z�[�W�R�[�h�ƕt�����j
	 */
	public PsLoopException(ExpjMessage em)
	{
		super(em);
	}
}

