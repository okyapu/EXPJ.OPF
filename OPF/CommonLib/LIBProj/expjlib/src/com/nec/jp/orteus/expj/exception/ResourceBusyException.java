/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/exception/ResourceBusyException.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.exception;

import com.nec.jp.orteus.xaf.util.FoundationException;

/**
 * ���\�[�X�r�W�[�̗�O�N���X�B
 * 
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:27:54 $
 */
public class ResourceBusyException extends FoundationException {
	
	/**
	 * �I�u�W�F�N�g���\�z���܂��B
	 */
	public ResourceBusyException(){
		super("COMMON-N000","EXPLANNER/J ERROR","DEFAULT MESSAGE");
	}
	

}

