//------------------------------------------------------------------------------
// (#)PrintCleaning.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/05/22 新規作成 Y.Inada
// 2003/06/25 Copyrightの記述修正 Y.Inada
//            前：Copyright (C) 2003 NEC INFORMATEC SYSTEMS, LTD.
//            後：Copyright (c) 2003 NEC Informatec Systems,Ltd.
//            JavaDoc用コメントの体裁を整える
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.util.Combo;

import java.util.ArrayList;
import java.util.List;

/**
 * <B>ComboStruct</B><BR>
 * コンボボックス用のデータクラス。<BR>
 * "値"と"日本語説明"をリスト(List)で保持する。<BR><BR>
 * 例： <BR>
 * 　値 = 1　　日本語説明 = 1：四捨五入 <BR>
 * 　値 = 2　　日本語説明 = 2：切り上げ <BR>
 * 　値 = 3　　日本語説明 = 3：切り捨て <BR>
 * <BR>
 * @author  Y.Inada
 * @version 1.00
 */
public class ComboStruct
{
	/** 値リスト */
	private List _valList = null;

	/** 日本語説明リスト */
	private List _explanList = null;

	/**
	 * オブジェクトを構築する。
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
	public List getValList(){ return _valList; }

	/**
	 * 日本語説明取得
	 *
	 * @return 日本語説明リスト
	 */
	public List getExplanList(){ return _explanList; }

	/**
	 * 指定された値を、要素の最後に追加する。 <BR>
	 * 指定された"値"と"日本語説明"と同じものがあれば、追加はしない。
	 * @param val 値
	 * @param explan 日本語説明
	 */
	public void addData(String val, String explan)
	{
		if(val != null && explan != null){
			//重複チェック
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
	 * 要素削除
	 *
	 * @param val 値
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
	 * 指定されたインデックスの要素を取得する。
	 *
	 * @param  index 取得する要素の位置
	 * @return 0番目に"値"、1番目に"日本語説明"が入った配列を返却する。<BR>
	 *         インデックスが範囲外の場合、nullを返却する。
	 * @throws IndexOutOfBoundsException
     *         インデックスが範囲外の場合 (index < 0 || index >= size())
	 */
	public String[] getData(int index)
	{
		String[] str = new String[2];
		str[0] = new String((String)_valList.get(index));
		str[1] = new String((String)_explanList.get(index));
		return str;
	}

	/**
	 * 要素数取得
	 *
	 * @return "値"と"日本語説明"の要素数を返却する。<BR>
	 *         "値"と"日本語説明"の要素数は同じである。
	 */
	public int size(){ return _valList.size(); }

}


