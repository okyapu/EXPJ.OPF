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
 * コンボボックス用のデータクラス。
 * "値"と"説明"をリスト(List)で保持します。<br>
 * 例： <br>
 * 　値 = 1　　説明 = 1：四捨五入 <br>
 * 　値 = 2　　説明 = 2：切り上げ <br>
 * 　値 = 3　　説明 = 3：切り捨て
 *
 * @see ComboBox
 * @see ComboException
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:27:52 $
 */
public class ComboStruct {

	/**
	 * 値リスト
	 */
	private List _valList = null;

	/**
	 * 説明リスト
	 */
	private List _explanList = null;

	/**
	 * オブジェクトを構築します。
	 */
	public ComboStruct()
	{
		_valList = new ArrayList(0);
		_explanList = new ArrayList(0);
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
	 * 説明取得
	 *
	 * @return 説明リスト
	 */
	public List getExplanList(){
		return _explanList;
	}

	/**
	 * 指定された値を、要素の最後に追加します。 <BR>
	 * 指定された"値"と"説明"と同じものがあれば、追加はしません。
	 * @param val 値
	 * @param explan 説明
	 */
	public void addData(String val, String explan){
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
				break;
			}
		}
	 }

	/**
	 * 指定されたインデックスの要素を取得する。
	 *
	 * @param  index 取得する要素の位置
	 * @return 0番目に"値"、1番目に"説明"が入った配列を返却します。<BR>
	 *         インデックスが範囲外の場合、nullを返却します。
	 * @throws IndexOutOfBoundsException インデックスが範囲外の場合 (index < 0 || index >= size())
	 */
	public String[] getData(int index){
		String[] str = new String[2];
		str[0] = new String((String)_valList.get(index));
		str[1] = new String((String)_explanList.get(index));
		return str;
	}

	/**
	 * 要素数取得
	 *
	 * @return "値"と"説明"の要素数を返却します。
	 */
	public int size(){
		return _valList.size();
	}

}


