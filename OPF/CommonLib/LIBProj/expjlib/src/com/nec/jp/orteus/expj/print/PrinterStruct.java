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
 * 使用可能なプリンタ用のデータクラス。
 * "値"と"日本語説明"をリスト(List)で保持します。<br>
 * 例： <br>
 * 　値 = 1　　日本語説明 = 1：四捨五入 <br>
 * 　値 = 2　　日本語説明 = 2：切り上げ <br>
 * 　値 = 3　　日本語説明 = 3：切り捨て
 *
 * @see Printer
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:28:06 $
 */
public class PrinterStruct {

	/**
	 * 値リスト
	 */
	private List _valList = null;

	/**
	 * プリンタ表示名リスト
	 */
	private List _explanList = null;

	/**
	 * 物理プリンタ名／スプールサーバリスト
	 */
	private List _printerNameList = null;

	/**
	 * プリンタ種別リスト
	 */
	private List _printerTypeList = null;

	/**
	 * オブジェクトを構築します。
	 */
	public PrinterStruct()
	{
		_valList = new ArrayList(0);
		_explanList = new ArrayList(0);
		_printerNameList = new ArrayList(0);
		_printerTypeList = new ArrayList(0);
	}

	/**
	 * 値取得
	 *
	 * @return 値リスト
	 */
	public List getValList(){
		return _valList;
	}

	/**
	 * プリンタ表示名取得
	 *
	 * @return プリンタ表示名リスト
	 */
	public List getExplanList(){
		return _explanList;
	}

	/**
	 * 物理プリンタ名／スプールサーバ取得
	 *
	 * @return 物理プリンタ名／スプールサーバリスト
	 */
	public List getPrintererName(){
		return _printerNameList;
	}

	/**
	 * プリンタ種別取得
	 *
	 * @return プリンタ種別リスト
	 */
	public List getPrintererType(){
		return _printerTypeList;
	}

	/**
	 * 指定された値を、要素の最後に追加します。 <BR>
	 * 既に指定された"値"と"プリンタ表示名"と同じ要素がある場合は追加しません。
	 * @param val 値
	 * @param explan 日本語説明
	 */
	public void addData(String val, String explan, String printer, String type){
		if (val != null && explan != null){
			//重複チェック
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
	 * 指定された"値"の要素を削除します。
	 *
	 * @param val 値
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
	 * 指定されたインデックスの要素を取得する。
	 *
	 * @param  index 取得する要素の位置
	 * @return 0番目に"値"、1番目に"日本語説明"が入った配列を返却します。<BR>
	 *         インデックスが範囲外の場合、nullを返却します。
	 * @throws IndexOutOfBoundsException インデックスが範囲外の場合 (index < 0 || index >= size())
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
	 * 要素数取得
	 *
	 * @return "値"の要素数を返却します。
	 */
	public int size(){
		return _valList.size();
	}

}


