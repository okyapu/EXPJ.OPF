/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/exception/PsEffPhaseException.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.exception;

import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.expj.exception.ExpjBadException;

/**
 * 製品構成の有効期間の重複を通知するための例外クラス
 *
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:27:54 $
 */
public class PsEffPhaseException extends ExpjBadException
{
	/**
	 * PsEffPhaseExceptionオブジェクトを構築します
     *
	 * @param em エラーメッセージ（メッセージコードと付加情報）
	 */
	public PsEffPhaseException(ExpjMessage em)
	{
		super(em);
	}
}

