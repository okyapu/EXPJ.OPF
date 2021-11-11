//------------------------------------------------------------------------------
// (#)ProcInformation.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/10/24 新規作成  K.Shiraki
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.Accessor.ProcMaster;

class ProcInformation
{
	//--------------------------------------------------------------------------
	// 構築

	/** コンストラクタ */
	public ProcInformation(){ clear(); }
	/**
	 * コンストラクタ
	 * @param コピー元
	 */
	ProcInformation(ProcInformation p)
	{
		_id = p._id;
		_name = p._name;
	}

	//--------------------------------------------------------------------------
	// 操作

	/** 処理IDの設定 */
	public void setId(String id){ _id = id; }
	/** 処理IDの取得 */
	public String getId(){ return _id; }

	/** 処理名の設定 */
	public void setName(String name){ _name = name; }
	/** 処理IDの取得 */
	public String getName(){ return _name; }

	/** クリア */
	public void clear(){ _id = null; _name = null; }

	//--------------------------------------------------------------------------
	// 属性

	/** 処理ID */
	private String _id = null;
	/** 処理名 */
	private String _name = null;
}
