//------------------------------------------------------------------------------
// (#)PrintCleaning.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/05/22 �V�K�쐬 Y.Inada
// 2003/06/25 Copyright�̋L�q�C�� Y.Inada
//            �O�FCopyright (C) 2003 NEC INFORMATEC SYSTEMS, LTD.
//            ��FCopyright (c) 2003 NEC Informatec Systems,Ltd.
//            JavaDoc�p�R�����g�̑̍ق𐮂���
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.util.Combo;

import java.util.ArrayList;
import java.util.List;

/**
 * <B>ComboStruct</B><BR>
 * �R���{�{�b�N�X�p�̃f�[�^�N���X�B<BR>
 * "�l"��"���{�����"�����X�g(List)�ŕێ�����B<BR><BR>
 * ��F <BR>
 * �@�l = 1�@�@���{����� = 1�F�l�̌ܓ� <BR>
 * �@�l = 2�@�@���{����� = 2�F�؂�グ <BR>
 * �@�l = 3�@�@���{����� = 3�F�؂�̂� <BR>
 * <BR>
 * @author  Y.Inada
 * @version 1.00
 */
public class ComboStruct
{
	/** �l���X�g */
	private List _valList = null;

	/** ���{��������X�g */
	private List _explanList = null;

	/**
	 * �I�u�W�F�N�g���\�z����B
	 */
	public ComboStruct()
	{
		_valList = new ArrayList(0);
		_explanList = new ArrayList(0);
	}

	/**
	 * �l�擾
	 *
	 * @return �l���X�g
	 */
	public List getValList(){ return _valList; }

	/**
	 * ���{������擾
	 *
	 * @return ���{��������X�g
	 */
	public List getExplanList(){ return _explanList; }

	/**
	 * �w�肳�ꂽ�l���A�v�f�̍Ō�ɒǉ�����B <BR>
	 * �w�肳�ꂽ"�l"��"���{�����"�Ɠ������̂�����΁A�ǉ��͂��Ȃ��B
	 * @param val �l
	 * @param explan ���{�����
	 */
	public void addData(String val, String explan)
	{
		if(val != null && explan != null){
			//�d���`�F�b�N
			for(int i = 0; i < size(); i++){
				String[] buff = getData(i);
				if(val.equals(buff[0]) == true ||
						explan.equals(buff[1]) == true){
					return;
				}
			}
			_valList.add(val);
			_explanList.add(explan);
		}
 	}

	/**
	 * �v�f�폜
	 *
	 * @param val �l
	 */
	public void removeData(String val)
	{
		for(int i = 0; i < _valList.size(); i++){
			if(_valList.get(i).equals(val) == true){
				_valList.remove(i);
				_explanList.remove(i);
				break;
			}
		}
 	}

	/**
	 * �w�肳�ꂽ�C���f�b�N�X�̗v�f���擾����B
	 *
	 * @param  index �擾����v�f�̈ʒu
	 * @return 0�Ԗڂ�"�l"�A1�Ԗڂ�"���{�����"���������z���ԋp����B<BR>
	 *         �C���f�b�N�X���͈͊O�̏ꍇ�Anull��ԋp����B
	 * @throws IndexOutOfBoundsException
     *         �C���f�b�N�X���͈͊O�̏ꍇ (index < 0 || index >= size())
	 */
	public String[] getData(int index)
	{
		String[] str = new String[2];
		str[0] = new String((String)_valList.get(index));
		str[1] = new String((String)_explanList.get(index));
		return str;
	}

	/**
	 * �v�f���擾
	 *
	 * @return "�l"��"���{�����"�̗v�f����ԋp����B<BR>
	 *         "�l"��"���{�����"�̗v�f���͓����ł���B
	 */
	public int size(){ return _valList.size(); }

}


