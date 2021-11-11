//------------------------------------------------------------------------------
// (#)InvMessageInformation.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2004/01/23 �V�K�쐬  M.Isoda
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.Inventry;

/**
 * �I����p���b�Z�[�W���N���X<br>
 *
 * @author  M.Isoda
 * @version 1.00
*/
public class InvMessageInformation
{
	//--------------------------------------------------------------------------
	// �\�z

	/** �R���X�g���N�^ */
	public InvMessageInformation(){ clear(); }

	/** �R���X�g���N�^
	 *
	 * @param	strParentType	�e���b�Z�[�W�^�C�v
	 * @param	strType			���b�Z�[�W�^�C�v
	 * @param	strCode			���b�Z�[�W�ԍ�
	 * @param	strNote			�ڍ׏��
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
	// �ϐ�

	private int _intParentType = 0;
	private int _intType = 0;
	private String _strCode = null;
	private String _strNote = null;

	//--------------------------------------------------------------------------
	// (get|set)���\�b�h

	public int getParentType() { return _intParentType; }
	public int getType() { return _intType; }
	public String getCode() { return _strCode; }
	public String getNote() { return _strNote; }

	public void setParentType(int val) { _intParentType = val; }
	public void setType(int val) { _intType = val; }
	public void setCode(String val) { _strCode = val; }
	public void setNote(String val) { _strNote = val; }

	//--------------------------------------------------------------------------
	// ���̑����\�b�h

	/**
	 * �N���A
	 */
	public void clear()
	{
		_intParentType = 0;
		_intType = 0;
		_strCode = null;
		_strNote = null;
	}
}
