/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/exception/PsMrpOdrTypException.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.exception;

import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.expj.exception.ExpjBadException;

/**
 * ���i�\���̎�z�敪�ُ��ʒm���邽�߂̗�O�N���X
 *
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:27:54 $
 */
public class PsMrpOdrTypException extends ExpjBadException
{
	/**
	 * PsMrpOdrTypException�I�u�W�F�N�g���\�z���܂�
     *
	 * @param em �G���[���b�Z�[�W�i���b�Z�[�W�R�[�h�ƕt�����j
	 */
	public PsMrpOdrTypException(ExpjMessage em)
	{
		super(em);
	}
}

