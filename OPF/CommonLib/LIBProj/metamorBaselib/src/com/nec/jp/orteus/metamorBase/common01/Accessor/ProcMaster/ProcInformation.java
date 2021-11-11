//------------------------------------------------------------------------------
// (#)ProcInformation.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/10/24 �V�K�쐬  K.Shiraki
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.Accessor.ProcMaster;

class ProcInformation
{
	//--------------------------------------------------------------------------
	// �\�z

	/** �R���X�g���N�^ */
	public ProcInformation(){ clear(); }
	/**
	 * �R���X�g���N�^
	 * @param �R�s�[��
	 */
	ProcInformation(ProcInformation p)
	{
		_id = p._id;
		_name = p._name;
	}

	//--------------------------------------------------------------------------
	// ����

	/** ����ID�̐ݒ� */
	public void setId(String id){ _id = id; }
	/** ����ID�̎擾 */
	public String getId(){ return _id; }

	/** �������̐ݒ� */
	public void setName(String name){ _name = name; }
	/** ����ID�̎擾 */
	public String getName(){ return _name; }

	/** �N���A */
	public void clear(){ _id = null; _name = null; }

	//--------------------------------------------------------------------------
	// ����

	/** ����ID */
	private String _id = null;
	/** ������ */
	private String _name = null;
}
