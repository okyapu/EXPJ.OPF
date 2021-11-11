/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/exception/PsManhourTypException.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.exception;

import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.expj.exception.ExpjBadException;

/**
 * 製品構成の工数管理区分異常を通知するための例外クラス
 *
 * @author $Author: wang-c $
 * @version $Revision: 1.1 $ $Date: 2008/09/22 01:14:19 $
 */
public class PsManhourTypException extends ExpjBadException
{
	/**
	 * PsManhourTypExceptionオブジェクトを構築します
     *
	 * @param em エラーメッセージ（メッセージコードと付加情報）
	 */
	public PsManhourTypException(ExpjMessage em)
	{
		super(em);
	}
}

