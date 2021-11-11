//------------------------------------------------------------------------------
// (#)BusinessLock.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/07/28 新規作成 K.Matsumoto
// 2003/08/01 引数名変更  (旧) userName  (新) userCode
//            業務ロック解除の引数説明 誤記修正
//              (誤) userName  (正) businnessName
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.util.BusinessLock;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;

/**
 * 業務ロックを実施するためのユーティリティクラス。
 *
 * @author  K.Matsumoto
 * @version 1.00
 */
public class BusinessLockAll
{
	/** 業務ロック管理 */
	private BusinessLockManager _lockManager = null;

	/**
	 * 業務ロッククラスのコンストラクタ。
	 *
	 * @param conn DBアクセス用のコネクション
	 * @param userCode Orteusユーザ名
	 */
	public BusinessLockAll(IDbConnection conn, String userCode)
	{
		_lockManager = new BusinessLockManager(conn, userCode, null);
	}

	/**
	 * 業務ロックの実行。
	 *
	 * @param businessName ロック／アンロックする業務名
	 * @return 解除キーとなる識別子
	 */
	public int doLock(String businessName)
	{
		return _lockManager.doLockAll(businessName);
	}

	/**
	 * 業務ロックの解除。
	 *
	 * @param businessName ロック／アンロックする業務名
	 * @param descriptor ロック時に渡された解除キー
	 * @return 実施した処理の結果正常／異常
	 */
	public boolean doUnLock(String businessName, int descriptor)
	{
		return _lockManager.doUnLockAll(businessName, descriptor);
	}
}
