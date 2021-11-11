//------------------------------------------------------------------------------
// (#)SystemLogFilter.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/05/22 新規作成 Y.Inada
// 2003/06/25 Copyrightの記述修正 Y.Inada
//            前：Copyright (c) 2003 NEC informatec Systems,Ltd.
//            後：Copyright (c) 2003 NEC Informatec Systems,Ltd.
//            JavaDoc用コメントの体裁を整える
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.util.SystemLog;

import com.nec.jp.orteus.util.logging.LogRecord;
import com.nec.jp.orteus.util.logging.Filter;


/**
 * 出力可否制御を実施<BR>
 *
 * @author  Y.Inada
 * @version 1.00
 */
public class SystemLogFilter implements Filter
{
	/**
	* メンバ変数の定義
	*
	*/
	private String _category = null;

	/**
	 * オブジェクトを構築する。
	 * @param  category カテゴリ
	 */
	public SystemLogFilter(String category){
		_category = new String(category);
	}

	/**
	 * 出力可否判定。
	 * @param  logrecord ログレコード
	 * @return 出力する：true  出力しない：false
	 */
	public boolean isLoggable(LogRecord logrecord)
	{
		if(logrecord.getLoggerName().equals(_category) == true){return true;}

		return false;
	}

}

