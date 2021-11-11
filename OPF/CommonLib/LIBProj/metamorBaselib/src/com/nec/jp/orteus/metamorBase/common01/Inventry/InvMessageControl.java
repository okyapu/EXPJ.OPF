//------------------------------------------------------------------------------
// (#)InvMessageControl.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2004/01/23 新規作成  M.Isoda
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.Inventry;

import java.util.ArrayList;

/**
 * 棚卸専用メッセージ管理クラス
 *
 * @author  M.Isoda
 * @version 1.00
*/
public class InvMessageControl
{
//--------------------------------------------------------------------------
// 定数定義

	////////////////////////////////////////////////////////////////////////////
	// メッセージ種別定数

	/** 処理成功 */
	public static final int TYP_SUCCESS			= 0;

	/** 一般エラー */
	public static final int TYP_ERROR			= TYP_SUCCESS + 1;
	/** SQLExceptionエラー */
	public static final int TYP_SQL_ERROR		= TYP_ERROR + 1;
	/** 最大エラーメッセージ番号 */
	private static final int MAX_TYP_ERROR		= TYP_SQL_ERROR + 1;

	/** 警告メッセージ */
	public static final int TYP_WARN			= MAX_TYP_ERROR + 1;
	/** 最大警告メッセージ番号 */
	private static final int MAX_TYP_WARN		= TYP_WARN + 1;

	/** 情報メッセージ */
	public static final int TYP_INFO			= MAX_TYP_WARN + 1;
	/** 最大情報メッセージ番号 */
	private static final int MAX_TYP_INFO		= TYP_INFO + 1;

	/** デバッグメッセージ種類 */
	public static final int TYP_CONFIG			= MAX_TYP_INFO + 1;
	/** 最大デバッグメッセージ番号 */
	private static final int MAX_TYP_CONFIG		= TYP_CONFIG + 1;

//--------------------------------------------------------------------------
// 構築

	/** コンストラクタ */
	public InvMessageControl(){ clear(); }

//--------------------------------------------------------------------------
// 変数

	/** メッセージ格納リスト */
	private ArrayList _list = new ArrayList(0);

//--------------------------------------------------------------------------
// 操作

	////////////////////////////////////////////////////////////////////////////
	/**
	 * クリア
	 */
	public void clear()
	{
		_list.clear();
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * メッセージ取得
	 * @return エラーリスト
	 */
	public ArrayList getList()
	{
		return _list;
	}

	/**
	 * メッセージ設定
	 * @param メッセージリスト
	 */
	public void setList(ArrayList list)
	{
		_list = list;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * メッセージ情報追加
	 *
	 * @param	intType	メッセージ種別
	 * @param	strCode	メッセージ番号
	 * @param	strNote	詳細情報
	 * @return	追加した情報の配列番号:成功 / -1:失敗
	 */
	public int add(int intType, String strCode, String strNote)
	{
		int intIndex = -1;
		int intParentType = TYP_SUCCESS;
		InvMessageInformation invMessageInfo = null;

		if(intType >= TYP_ERROR && intType < MAX_TYP_ERROR)
		{
			intParentType = TYP_ERROR;
		}
		else if(intType >= TYP_WARN && intType < MAX_TYP_WARN)
		{
			intParentType = TYP_WARN;
		}
		else if(intType >= TYP_INFO && intType < MAX_TYP_INFO)
		{
			intParentType = TYP_INFO;
		}
		else if(intType >= TYP_CONFIG && intType < MAX_TYP_CONFIG)
		{
			intParentType = TYP_CONFIG;
		}

		invMessageInfo = 
			new InvMessageInformation(intParentType, intType, strCode, strNote);
		_list.add(invMessageInfo);
		intIndex = _list.size() - 1;
		return intIndex;
	}

	/**
	 * メッセージ情報取得
	 *
	 * @param	intIndex	配列番号
	 * @return	メッセージ情報:成功 / null:失敗
	 */
	public InvMessageInformation get(int intIndex)
	{
		InvMessageInformation invMessageInfo = null;
		if((_list != null) && (_list.size() > 0) && (intIndex < _list.size()))
		{
			invMessageInfo = (InvMessageInformation)_list.get(intIndex);
		}
		return invMessageInfo;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * メッセージ情報数取得
	 *
	 * @param	メッセージ情報数
	 */
	public int size()
	{
		return (_list.size());
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * メッセージ情報追加コピー
	 *
	 * @param	msg	メッセージ管理クラス
	 */
	public void addCopy(InvMessageControl msg)
	{
		InvMessageInformation invMessageInfo = null;
		for(int i = 0; ((invMessageInfo = msg.get(i)) != null); i++)
		{
			add(invMessageInfo.getType(), 
				invMessageInfo.getCode(), 
				invMessageInfo.getNote() );
		}
		return;
	}
}
