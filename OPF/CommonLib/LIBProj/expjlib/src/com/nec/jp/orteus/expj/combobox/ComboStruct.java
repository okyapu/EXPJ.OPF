/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/combobox/ComboStruct.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.combobox;

import java.util.ArrayList;
import java.util.List;

/**
 * �R���{�{�b�N�X�p�̃f�[�^�N���X�B
 * "�l"��"����"�����X�g(List)�ŕێ����܂��B<br>
 * ��F <br>
 * �@�l = 1�@�@���� = 1�F�l�̌ܓ� <br>
 * �@�l = 2�@�@���� = 2�F�؂�グ <br>
 * �@�l = 3�@�@���� = 3�F�؂�̂�
 *
 * @see ComboBox
 * @see ComboException
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:27:52 $
 */
public class ComboStruct {

	/**
	 * �l���X�g
	 */
	private List _valList = null;

	/**
	 * �������X�g
	 */
	private List _explanList = null;

	/**
	 * �I�u�W�F�N�g���\�z���܂��B
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
	public List getValList(){
		return _valList;
	}

	/**
	 * �����擾
	 *
	 * @return �������X�g
	 */
	public List getExplanList(){
		return _explanList;
	}

	/**
	 * �w�肳�ꂽ�l���A�v�f�̍Ō�ɒǉ����܂��B <BR>
	 * �w�肳�ꂽ"�l"��"����"�Ɠ������̂�����΁A�ǉ��͂��܂���B
	 * @param val �l
	 * @param explan ����
	 */
	public void addData(String val, String explan){
		if (val != null && explan != null){
			//�d���`�F�b�N
			for (int i = 0; i < size(); i++){
				String[] buff = getData(i);
				if (val.equals(buff[0]) == true || explan.equals(buff[1]) == true){
					return;
				}
			}
			_valList.add(val);
			_explanList.add(explan);
		}
	 }

	/**
	 * �w�肳�ꂽ"�l"�̗v�f���폜���܂��B
	 *
	 * @param val �l
	 */
	public void removeData(String val){
		for (int i = 0; i < _valList.size(); i++){
			if (_valList.get(i).equals(val) == true){
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
	 * @return 0�Ԗڂ�"�l"�A1�Ԗڂ�"����"���������z���ԋp���܂��B<BR>
	 *         �C���f�b�N�X���͈͊O�̏ꍇ�Anull��ԋp���܂��B
	 * @throws IndexOutOfBoundsException �C���f�b�N�X���͈͊O�̏ꍇ (index < 0 || index >= size())
	 */
	public String[] getData(int index){
		String[] str = new String[2];
		str[0] = new String((String)_valList.get(index));
		str[1] = new String((String)_explanList.get(index));
		return str;
	}

	/**
	 * �v�f���擾
	 *
	 * @return "�l"��"����"�̗v�f����ԋp���܂��B
	 */
	public int size(){
		return _valList.size();
	}

}


