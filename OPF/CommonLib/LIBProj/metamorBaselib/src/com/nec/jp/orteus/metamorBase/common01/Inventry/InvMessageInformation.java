//------------------------------------------------------------------------------
// (#)InvMessageInformation.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2004/01/23 新規作成  M.Isoda
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.Inventry;

/**
 * 棚卸専用メッセージ情報クラス<br>
 *
 * @author  M.Isoda
 * @version 1.00
*/
public class InvMessageInformation
{
	//--------------------------------------------------------------------------
	// 構築

	/** コンストラクタ */
	public InvMessageInformation(){ clear(); }

	/** コンストラクタ
	 *
	 * @param	strParentType	親メッセージタイプ
	 * @param	strType			メッセージタイプ
	 * @param	strCode			メッセージ番号
	 * @param	strNote			詳細情報
	 */
	public InvMessageInformation(
		int strParentType, 
		int strType, 
		String strCode,
		String strNote)
	{
		clear();
		_intParentType = strParentType;
		_intType = strType;
		_strCode = strCode;
		_strNote = strNote;
	}

	//--------------------------------------------------------------------------
	// 変数

	private int _intParentType = 0;
	private int _intType = 0;
	private String _strCode = null;
	private String _strNote = null;

	//--------------------------------------------------------------------------
	// (get|set)メソッド

	public int getParentType() { return _intParentType; }
	public int getType() { return _intType; }
	public String getCode() { return _strCode; }
	public String getNote() { return _strNote; }

	public void setParentType(int val) { _intParentType = val; }
	public void setType(int val) { _intType = val; }
	public void setCode(String val) { _strCode = val; }
	public void setNote(String val) { _strNote = val; }

	//--------------------------------------------------------------------------
	// その他メソッド

	/**
	 * クリア
	 */
	public void clear()
	{
		_intParentType = 0;
		_intType = 0;
		_strCode = null;
		_strNote = null;
	}
}
