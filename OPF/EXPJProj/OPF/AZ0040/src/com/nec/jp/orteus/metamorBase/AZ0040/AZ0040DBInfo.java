//------------------------------------------------------------------------------
/**
 * CLASS     : AZ0040DBInfo クラス
 * ファイル・クラス説明
 * @author $Author: suganuma $
 * @version $Revision: 1.1 $ $Date: 2005/03/09 06:49:40 $
 *
 */
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.AZ0040;

import java.util.List;
import java.util.ArrayList;

public class AZ0040DBInfo
{
	//--------------------------------------------------------------------------
	// 構築

	/** コンストラクタ */
	public AZ0040DBInfo(){ clear(); }

	//--------------------------------------------------------------------------
	//         公開関数

	//---------------------------------
	// 値設定用メソッド

	/** テーブル名の設定 */
	public void setTablename(String tablename){ 
		_tablename = tablename;
	}
	/** テーブル名のコメントの設定 */
	public void setTableComment(String tableComment){ 
		_tableComment = tableComment;
	}
	/** カラム属性の設定 */
	public void setColumnTypes(List columnTypes){
		_columnTypes.clear();
        _columnTypes.addAll(columnTypes);
    }
	/** カラム名の設定 */
	public void setColumnNames(List columnNames){
		_columnNames.clear();
		_columnNames.addAll(columnNames);
    }

	/** カラム名コメントの設定 */
	public void setColumnComments(List columnComments){ 
		_columnComments.clear();
        _columnComments.addAll(columnComments);
    }

	//---------------------------------
	// 値取得用メソッド

	/** テーブル名の取得 */
	public String getTablename(){ return _tablename; }

	/** カラム名リストの取得 */
	public List getColumnNames(){ return _columnNames; }

	/** テーブル名のコメントの取得 */
	public String getTableComment(){ return _tableComment; }

	/** カラム名コメントリストの取得 */
	public List getColumnComments(){ return _columnComments; }
	
	
	/** カラム属性リストの取得 */
	public List getColumnTypes(){ return _columnTypes; }

	//----------------------------------------------------------------------------
	//         パッケージ公開関数
	//----------------------------------------------------------------------------

	/** カラムコメントの取得(カラム名指定) */
	String getColumnComment(String iColumnName){
		String w_comment = null; 
		//カラム名リストの中から、指定されたカラム名のindexを取得する。
		int idx = _columnNames.indexOf(iColumnName);
		if(idx > -1) {
			w_comment = _columnComments.get(idx).toString();
		}
		return w_comment; 
	}

	/** カラム属性の取得(カラム名指定) */
	String getColumnType(String iColumnName){
		String w_type = null; 
		//カラム名リストの中から、指定されたカラム名のindexを取得する。
		int idx = _columnNames.indexOf(iColumnName);
		if(idx > -1) {
			w_type = _columnTypes.get(idx).toString();
		}
		return w_type; 
	}

	//-------------------------------------------
	//         非公開関数
	//-------------------------------------------
	/** クリア */
	private void clear()
	{ 
		_tablename = null; 
		_tableComment = null;
		_columnNames = new ArrayList();
		_columnComments = new ArrayList();
		_columnTypes = new ArrayList();
	}

	//--------------------------------------------------------------------------
	// 属性
	/** テーブル名 */
	private String _tablename = null;
	/** テーブルコメント */
	private String _tableComment = null;
	/** カラム名 */
	private List _columnNames;
	/** カラムコメント */
	private List _columnComments;
	/** カラム属性　java.sql.Types  */
	private List _columnTypes;
}