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
 * 業務ロックを実施するためのユーティリティクラス。
 *
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:27:50 $
 */
public class BusinessLock
{
	/** 業務ロック管理 */
	private BusinessLockManager _lockManager = null;

	/**
	 * 業務ロッククラスのコンストラクタです。
	 *
	 * @param conn DBアクセス用のコネクション
	 * @param userCode Orteusユーザ名
	 * @param planCode 工場コード
	 */
	public BusinessLock(IDbConnection conn, String userCode, String plantCode) {
		_lockManager = new BusinessLockManager(conn, userCode, plantCode);
	}

	/**
	 * 業務ロックを実行します。
	 *
	 * @param businessName ロックする業務名
	 * @return 解除キーとなる識別子
	 */
	public int doLock(String businessName) {
		return _lockManager.doLock(businessName);
	}

	/**
	 * 業務ロックを解除します。
	 *
	 * @param businessName アンロックする業務名
	 * @param descriptor ロック時に渡された解除キー
	 * @return 実施した処理の結果正常／異常
	 */
	public boolean doUnLock(String businessName, int descriptor) {
		return _lockManager.doUnLock(businessName, descriptor);
	}

	/**
	 * 業務ロック情報を取得します。
	 *
	 * @return 業務ロック情報
	 */
	public List getLockingInfo() {
		return _lockManager.getLockingInfo();
	}
}
