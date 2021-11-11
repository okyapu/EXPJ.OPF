/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/flash/FlashServletRequest.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */
package com.nec.jp.orteus.expj.flash;

/**
 * �N���C�A���g�����FLASH�p�����[�^�����o���d�g�݂�ǉ�����HttpServletRequest
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:27:56 $
 *
 */

import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.util.Enumeration;
import java.util.StringTokenizer;
import java.util.Iterator;

public class FlashServletRequest extends HttpServletRequestWrapper {

	private Map _hm;
	private String _parameterNamesStr;

	/**
	 * �R���X�g���N�^
	 * �w�肵�����N�G�X�g�����b�s���O�������N�G�X�g�E�I�u�W�F�N�g���\�z���܂��B
	 * @param request ���N�G�X�g
	 */
	public FlashServletRequest(HttpServletRequest request) throws IOException {
		super(request);
		_hm = null;
		_parameterNamesStr = null;
		makeParameterMap();
	}

	/**
	 * ���N�G�X�g�p�����[�^��������FLASH�p�����[�^�̒l��
         * String �^�̃I�u�W�F�N�g�ŕԂ��܂��B
	 * �p�����[�^�����݂��Ȃ��ꍇ�� null ��Ԃ��܂��B
	 * ���̃��\�b�h���}���`�o�����[�̃p�����[�^�ɑ΂��Ďg�p����ƁA
	 * getParameterValues() �̃��\�b�h�̖߂�l�ł���z��̍ŏ��̒l�݂̂��Ԃ���܂��B
	 * @param name �擾�Ώۂ̃��N�G�X�g�p�����[�^�܂���FLASH�p�����[�^��
	 * @return �P��̃p�����[�^�̒l��\�� String
	 */
	public  String getParameter(String name) {
		if(_hm.get(name)==null) {
			return super.getParameter(name);
		}
		else {
			return ((String[])(_hm.get(name)))[0];
		}
	}

	/**
	 * �w�肳�ꂽ���O�Ŏ擾�ł��郊�N�G�X�g�p�����[�^��������FLASH�p�����[�^�̑S�Ă̒l��
	 * String �I�u�W�F�N�g�̔z��ŕԂ��܂��B
	 * �p�����[�^�����݂��Ȃ��ꍇ�� null ��Ԃ��܂��B 
	 * @param name �擾�Ώۂ̃��N�G�X�g�p�����[�^�܂���FLASH�p�����[�^��
	 * @return �p�����[�^�̒l�������Ă��� String �I�u�W�F�N�g�̔z��
	 */
	public String[] getParameterValues(String name) {
		if(_hm.get(name)!=null) {
			return (String[])(_hm.get(name));
		}
		else {
			return super.getParameterValues(name);
		}
	}

	/**
	 * ���̃��N�G�X�g�Ɋ܂܂�Ă���p�����[�^���y��FLASH�p�����[�^����\��
	 * String �I�u�W�F�N�g�ō\������� Enumeration ��Ԃ��܂��B
	 * ���N�G�X�g�Ƀp�����[�^�������ꍇ�A��� Enumeration ��Ԃ��܂��B
	 * FLASH�p�����[�^���w�肵�Ă���ꍇ��"_FLASHPARAMETERVALUES_"�Ƃ���
	 * �p�����[�^���ǉ�����Ă��܂��B
	 * @return String �I�u�W�F�N�g�ō\�����ꂽ Enumeration�B
	 *         String �͊e���N�G�X�g�p�����[�^�̖��O�B
	 *         �p�����[�^�������ꍇ�͋�� Enumeration�B
	 */
	public Enumeration getParameterNames() {
		return new StringTokenizer(_parameterNamesStr);
	}

	/**
	 * ���̃��N�G�X�g����擾�ł���p�����[�^�AFLASH�p�����[�^�� java.util.Map �ŕԂ��܂��B
	 * @return �p�����[�^���� key �A�p�����[�^�l���}�b�v�̒l�ƂȂ��Ă���s�ς�java.util.Map�B
	 *  �p�����[�^�}�b�v�� key �� String �^�B�p�����[�^�}�b�v�̒l�� String �̔z��ł��B
	 */
	public Map getParameterMap() {
		return _hm;
	}

	/**
	 * ���̃��N�G�X�g����擾�ł���p�����[�^�AFLASH�p�����[�^�� java.util.Map �ō\�z���܂��B
	 *  �p�����[�^�}�b�v�� key �� String �^�B�p�����[�^�}�b�v�̒l�� String �̔z��ł��B
	 */
	private void makeParameterMap() {
		String parameters = super.getParameter("_FLASHPARAMETERVALUES_");
		boolean continueFlg = true;
		String pnameValue;
		int fromIndex = 0;
		int toIndex = 0;
		int pnameEndIndex = 0;
		String name = null;
		String pValue = null;
		String currentName = "";
		List valueList = new ArrayList();
		String[] pValues=null;
		String[] hmPValues=null;
		String[] normalValues=null;
		int pSize;
		int hmSize;
		int vlSize;
		HashMap hm;
		String parameterNames = "";
		Enumeration normalParameterNames;

		hm = new HashMap();

		while((parameters!=null) && (continueFlg)) {

			toIndex = parameters.indexOf("%&%", fromIndex);
			if(toIndex > -1) {
				pnameValue = (parameters.substring(fromIndex, toIndex)).trim();
			}
			else {
				pnameValue = (parameters.substring(fromIndex)).trim();
				continueFlg = false;
			}

			pnameEndIndex = pnameValue.indexOf("%=%");
			if(pnameEndIndex > -1) {
				name = (pnameValue.substring(0, pnameEndIndex)).trim();
				pValue = (pnameValue.substring(pnameEndIndex+3)).trim();
			}
			else {
				fromIndex = toIndex + 3;
				continue;
			}

			if(currentName.equals(name) || currentName.equals("")) {
				valueList.add(pValue);
			}
			else {
				if(hm.containsKey(currentName)==true) {
					hmPValues = (String[])hm.get(currentName);
					hmSize = hmPValues.length;

					hm.remove(currentName);
				}
				else {
					hmSize = 0;
				}

				vlSize = valueList.size();
				pSize = hmSize + vlSize;
				pValues = new String[pSize];
				for(int i=0; i<hmSize; i++) {
					pValues[i] = hmPValues[i];
				}
				for(int i=0; i<vlSize; i++) {
					pValues[i+hmSize] = (String)(valueList.get(i));
				}
				hm.put(currentName, pValues);

				valueList.clear();
				valueList.add(pValue);
			}

			currentName = name;

			fromIndex = toIndex + 3;
		}

		if(parameters != null) {
			if(hm.containsKey(currentName)==true) {
				hmPValues = (String[])hm.get(currentName);
				hmSize = hmPValues.length;

				hm.remove(currentName);
			}
			else {
				hmSize = 0;
			}

			vlSize = valueList.size();
			pSize = hmSize + vlSize;
			pValues = new String[pSize];
			for(int i=0; i<hmSize; i++) {
				pValues[i] = hmPValues[i];
			}
			for(int i=0; i<vlSize; i++) {
				pValues[i+hmSize] = (String)(valueList.get(i));
			}
			hm.put(currentName, pValues);

			valueList.clear();
			valueList.add(pValue);

			Iterator iteNames;
			iteNames = hm.keySet().iterator();
			while(iteNames.hasNext()==true) {
				parameterNames = parameterNames + " " + (String)iteNames.next();
			}
		}

		normalParameterNames = super.getParameterNames();

		while(normalParameterNames.hasMoreElements()) {

			name = (String)normalParameterNames.nextElement();

			if(hm.containsKey(name)==true) {
				hmPValues = (String[])hm.get(name);
				hmSize = hmPValues.length;

				hm.remove(name);
			}
			else {
				hmSize = 0;
			}

			normalValues = super.getParameterValues(name);
			vlSize = normalValues.length;
			pSize = hmSize + vlSize;
			pValues = new String[pSize];

			for(int i=0; i<vlSize; i++) {
				pValues[i] = normalValues[i];
			}
			for(int i=0; i<hmSize; i++) {
				pValues[i+vlSize] = hmPValues[i];
			}

			if(name.equals("")!=true) {
				if(parameterNames.equals("") != true) {
					parameterNames = parameterNames + " " + name;
				}
				else {
					parameterNames = name;
				}
				hm.put(name, pValues);
			}

		}

		_parameterNamesStr = parameterNames;
		_hm = hm;

	}

}

