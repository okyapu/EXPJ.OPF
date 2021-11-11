/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/print/PrinterStruct.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.print;

import java.util.ArrayList;
import java.util.List;

/**
 * �g�p�\�ȃv�����^�p�̃f�[�^�N���X�B
 * "�l"��"���{�����"�����X�g(List)�ŕێ����܂��B<br>
 * ��F <br>
 * �@�l = 1�@�@���{����� = 1�F�l�̌ܓ� <br>
 * �@�l = 2�@�@���{����� = 2�F�؂�グ <br>
 * �@�l = 3�@�@���{����� = 3�F�؂�̂�
 *
 * @see Printer
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:28:06 $
 */
public class PrinterStruct {

	/**
	 * �l���X�g
	 */
	private List _valList = null;

	/**
	 * �v�����^�\�������X�g
	 */
	private List _explanList = null;

	/**
	 * �����v�����^���^�X�v�[���T�[�o���X�g
	 */
	private List _printerNameList = null;

	/**
	 * �v�����^��ʃ��X�g
	 */
	private List _printerTypeList = null;

	/**
	 * �I�u�W�F�N�g���\�z���܂��B
	 */
	public PrinterStruct()
	{
		_valList = new ArrayList(0);
		_explanList = new ArrayList(0);
		_printerNameList = new ArrayList(0);
		_printerTypeList = new ArrayList(0);
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
	 * �v�����^�\�����擾
	 *
	 * @return �v�����^�\�������X�g
	 */
	public List getExplanList(){
		return _explanList;
	}

	/**
	 * �����v�����^���^�X�v�[���T�[�o�擾
	 *
	 * @return �����v�����^���^�X�v�[���T�[�o���X�g
	 */
	public List getPrintererName(){
		return _printerNameList;
	}

	/**
	 * �v�����^��ʎ擾
	 *
	 * @return �v�����^��ʃ��X�g
	 */
	public List getPrintererType(){
		return _printerTypeList;
	}

	/**
	 * �w�肳�ꂽ�l���A�v�f�̍Ō�ɒǉ����܂��B <BR>
	 * ���Ɏw�肳�ꂽ"�l"��"�v�����^�\����"�Ɠ����v�f������ꍇ�͒ǉ����܂���B
	 * @param val �l
	 * @param explan ���{�����
	 */
	public void addData(String val, String explan, String printer, String type){
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
			_printerNameList.add(printer);
			_printerTypeList.add(type);
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
				_printerNameList.remove(i);
				_printerTypeList.remove(i);
				break;
			}
		}
 	}

	/**
	 * �w�肳�ꂽ�C���f�b�N�X�̗v�f���擾����B
	 *
	 * @param  index �擾����v�f�̈ʒu
	 * @return 0�Ԗڂ�"�l"�A1�Ԗڂ�"���{�����"���������z���ԋp���܂��B<BR>
	 *         �C���f�b�N�X���͈͊O�̏ꍇ�Anull��ԋp���܂��B
	 * @throws IndexOutOfBoundsException �C���f�b�N�X���͈͊O�̏ꍇ (index < 0 || index >= size())
	 */
	public String[] getData(int index){
		String[] str = new String[4];
		str[0] = new String((String)_valList.get(index));
		str[1] = new String((String)_explanList.get(index));
		str[2] = new String((String)_printerNameList.get(index));
		str[3] = new String((String)_printerTypeList.get(index));
		return str;
	}

	/**
	 * �v�f���擾
	 *
	 * @return "�l"�̗v�f����ԋp���܂��B
	 */
	public int size(){
		return _valList.size();
	}

}


