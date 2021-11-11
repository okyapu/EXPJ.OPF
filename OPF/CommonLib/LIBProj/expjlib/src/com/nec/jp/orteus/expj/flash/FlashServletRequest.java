/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/flash/FlashServletRequest.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */
package com.nec.jp.orteus.expj.flash;

/**
 * クライアントからのFLASHパラメータを取り出す仕組みを追加したHttpServletRequest
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
	 * コンストラクタ
	 * 指定したリクエストをラッピングしたリクエスト・オブジェクトを構築します。
	 * @param request リクエスト
	 */
	public FlashServletRequest(HttpServletRequest request) throws IOException {
		super(request);
		_hm = null;
		_parameterNamesStr = null;
		makeParameterMap();
	}

	/**
	 * リクエストパラメータもしくはFLASHパラメータの値を
         * String 型のオブジェクトで返します。
	 * パラメータが存在しない場合は null を返します。
	 * このメソッドをマルチバリューのパラメータに対して使用すると、
	 * getParameterValues() のメソッドの戻り値である配列の最初の値のみが返されます。
	 * @param name 取得対象のリクエストパラメータまたはFLASHパラメータ名
	 * @return 単一のパラメータの値を表す String
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
	 * 指定された名前で取得できるリクエストパラメータもしくはFLASHパラメータの全ての値を
	 * String オブジェクトの配列で返します。
	 * パラメータが存在しない場合は null を返します。 
	 * @param name 取得対象のリクエストパラメータまたはFLASHパラメータ名
	 * @return パラメータの値が入っている String オブジェクトの配列
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
	 * このリクエストに含まれているパラメータ名及びFLASHパラメータ名を表す
	 * String オブジェクトで構成される Enumeration を返します。
	 * リクエストにパラメータが無い場合、空の Enumeration を返します。
	 * FLASHパラメータを指定している場合は"_FLASHPARAMETERVALUES_"という
	 * パラメータが追加されています。
	 * @return String オブジェクトで構成された Enumeration。
	 *         String は各リクエストパラメータの名前。
	 *         パラメータが無い場合は空の Enumeration。
	 */
	public Enumeration getParameterNames() {
		return new StringTokenizer(_parameterNamesStr);
	}

	/**
	 * このリクエストから取得できるパラメータ、FLASHパラメータを java.util.Map で返します。
	 * @return パラメータ名が key 、パラメータ値がマップの値となっている不変なjava.util.Map。
	 *  パラメータマップの key は String 型。パラメータマップの値は String の配列です。
	 */
	public Map getParameterMap() {
		return _hm;
	}

	/**
	 * このリクエストから取得できるパラメータ、FLASHパラメータを java.util.Map で構築します。
	 *  パラメータマップの key は String 型。パラメータマップの値は String の配列です。
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

