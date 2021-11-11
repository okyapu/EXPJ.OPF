//------------------------------------------------------------------------------
// (#)InvMessageControl.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2004/01/23 �V�K�쐬  M.Isoda
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.Inventry;

import java.util.ArrayList;

/**
 * �I����p���b�Z�[�W�Ǘ��N���X
 *
 * @author  M.Isoda
 * @version 1.00
*/
public class InvMessageControl
{
//--------------------------------------------------------------------------
// �萔��`

	////////////////////////////////////////////////////////////////////////////
	// ���b�Z�[�W��ʒ萔

	/** �������� */
	public static final int TYP_SUCCESS			= 0;

	/** ��ʃG���[ */
	public static final int TYP_ERROR			= TYP_SUCCESS + 1;
	/** SQLException�G���[ */
	public static final int TYP_SQL_ERROR		= TYP_ERROR + 1;
	/** �ő�G���[���b�Z�[�W�ԍ� */
	private static final int MAX_TYP_ERROR		= TYP_SQL_ERROR + 1;

	/** �x�����b�Z�[�W */
	public static final int TYP_WARN			= MAX_TYP_ERROR + 1;
	/** �ő�x�����b�Z�[�W�ԍ� */
	private static final int MAX_TYP_WARN		= TYP_WARN + 1;

	/** ��񃁃b�Z�[�W */
	public static final int TYP_INFO			= MAX_TYP_WARN + 1;
	/** �ő��񃁃b�Z�[�W�ԍ� */
	private static final int MAX_TYP_INFO		= TYP_INFO + 1;

	/** �f�o�b�O���b�Z�[�W��� */
	public static final int TYP_CONFIG			= MAX_TYP_INFO + 1;
	/** �ő�f�o�b�O���b�Z�[�W�ԍ� */
	private static final int MAX_TYP_CONFIG		= TYP_CONFIG + 1;

//--------------------------------------------------------------------------
// �\�z

	/** �R���X�g���N�^ */
	public InvMessageControl(){ clear(); }

//--------------------------------------------------------------------------
// �ϐ�

	/** ���b�Z�[�W�i�[���X�g */
	private ArrayList _list = new ArrayList(0);

//--------------------------------------------------------------------------
// ����

	////////////////////////////////////////////////////////////////////////////
	/**
	 * �N���A
	 */
	public void clear()
	{
		_list.clear();
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * ���b�Z�[�W�擾
	 * @return �G���[���X�g
	 */
	public ArrayList getList()
	{
		return _list;
	}

	/**
	 * ���b�Z�[�W�ݒ�
	 * @param ���b�Z�[�W���X�g
	 */
	public void setList(ArrayList list)
	{
		_list = list;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * ���b�Z�[�W���ǉ�
	 *
	 * @param	intType	���b�Z�[�W���
	 * @param	strCode	���b�Z�[�W�ԍ�
	 * @param	strNote	�ڍ׏��
	 * @return	�ǉ��������̔z��ԍ�:���� / -1:���s
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
	 * ���b�Z�[�W���擾
	 *
	 * @param	intIndex	�z��ԍ�
	 * @return	���b�Z�[�W���:���� / null:���s
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
	 * ���b�Z�[�W��񐔎擾
	 *
	 * @param	���b�Z�[�W���
	 */
	public int size()
	{
		return (_list.size());
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * ���b�Z�[�W���ǉ��R�s�[
	 *
	 * @param	msg	���b�Z�[�W�Ǘ��N���X
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
