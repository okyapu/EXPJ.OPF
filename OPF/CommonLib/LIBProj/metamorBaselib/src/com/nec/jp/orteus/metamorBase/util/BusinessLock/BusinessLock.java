//------------------------------------------------------------------------------
// (#)BusinessLock.java
//クリーンアップ
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/06/04 新規作成 K.Matsumoto
// 2003/06/24 OrteusStudioバージョンアップに伴う修正 Y.Inada
//            前：doConnection[ver1.00.03]
//            後：IDbConnection[ver1.00.05]
// 2003/06/25 Copyrightの記述修正 Y.Inada
//            前：Copyright (c) 2003 NEC informatec Systems,Ltd.
//            後：Copyright (c) 2003 NEC Informatec Systems,Ltd.
//            JavaDoc用コメントの体裁を整える
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
public class BusinessLock
{
	/** 業務ロック管理 */
	private BusinessLockManager _lockManager = null;

	/**
	 * 業務ロッククラスのコンストラクタ。
	 *
	 * @param conn DBアクセス用のコネクション
	 * @param userCode Orteusユーザ名
	 * @param planCode 工場コード
	 */
	public BusinessLock(IDbConnection conn, String userCode, String plantCode) {
		_lockManager = new BusinessLockManager(conn, userCode, plantCode);
	}

	/**
	 * 業務ロックの実行。
	 *
	 * @param businessName ロック／アンロックする業務名
	 * @return 解除キーとなる識別子
	 */
	public int doLock(String businessName) {
		return _lockManager.doLock(businessName);
	}

	/**
	 * 業務ロックの解除。
	 *
	 * @param businessName ロック／アンロックする業務名
	 * @param descriptor ロック時に渡された解除キー
	 * @return 実施した処理の結果正常／異常
	 */
	public boolean doUnLock(String businessName, int descriptor) {
		return _lockManager.doUnLock(businessName, descriptor);
	}
}
