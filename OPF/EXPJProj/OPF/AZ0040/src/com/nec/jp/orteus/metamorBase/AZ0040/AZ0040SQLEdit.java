//------------------------------------------------------------------------------
/**
 * CLASS     : AZ0040SQLEdit クラス
 * ファイル・クラス説明
 * @author $Author: zhou-kehong $
 * @version $Revision: 1.4 $ $Date: 2015/04/07 11:58:22 $
 *
 */
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.AZ0040;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import com.nec.jp.orteus.expj.systemlog.SystemLog;

/**
 * SQL文を各項目ごとに分解して解析を行う
 */
public class AZ0040SQLEdit 
              implements AZ0040Const
{
	//--------------------------------------------------------------------------
	// 構築

	/** コンストラクタ */

	public AZ0040SQLEdit(SystemLog i_syslog, String i_userid){
	    //SystemLog用
		_sysLog = i_syslog;
    	_UserId = i_userid;

		clear();
	}

	public AZ0040SQLEdit(){
		clear();
	}

	//--------------------------------------------------------------------------
	// 操作
	
	//******************************************/
	//                  公開関数                /
	//******************************************/

	/**
	 * @param conn DBとのコネクション
	 * @param str_sql 解析するSQL文
	 * @return true:成功 / false:失敗
	 */
	public final boolean Analize(IDbConnection conn, String str_sql ) 
                                                 throws SQLException
	{
		try
		{
			int cnt = 0;
			List parts_list = new ArrayList();
			
			sql = str_sql.trim();

			//SQL文が"SELECT"で始まるかどうかチェック
			if(!sql.startsWith("SELECT") ) {
				return false;
			}

			//*****  SQL文の各パーツを取り出す。*****************************
			
			// SELECT句を取得する
			_SELECT_VALUE = this.PatternSplit(_SELECT);
			
			// ALL, DISTINCT, UNIQUEをチェックする
			if(_SELECT_VALUE.indexOf("ALL ") != -1 ||
	           _SELECT_VALUE.indexOf("DISTINCT ") != -1 ||
			   _SELECT_VALUE.indexOf("UNIQUE ") != -1)
			{
				_sysLog.finest_d("It does not correspond to SELECT ALL, DISTINCT, and UNIQUE",_UserId);
				return false;
			}

			// 副問合せ判定
			if(_temp_sql.indexOf("(SELECT ") == -1 && _temp_sql.indexOf(" SELECT ") == -1)
			{
				// FROM句を取得する
				_FROM_VALUE = this.PatternSplit(_FROM);
			}
			else
			{
				_sysLog.finest_d("Analize:It does not correspond to a subinquiry",_UserId);
				return false;
			}

			// WHERE句を取得する
			if(sql.indexOf(" WHERE ") != -1 && _sql_flg == 0)
			{
				_WHERE_VALUE = this.PatternSplit(_WHERE);
				if(_WHERE_VALUE == null)
				{
					_sysLog.finest_d("Analize:There is no description to a WHERE phrase",_UserId);
					return false;
				}
			}

			// GROPU BY句を取得する
			if(sql.indexOf(" GROUP BY ") != -1 && _sql_flg == 0)
			{
				_GROUP_BY_VALUE = this.PatternSplit(_GROUP);
				if(_GROUP_BY_VALUE == null)
				{
					return false;
				}
				else
				{
					_sysLog.finest_d("Analize:It does not correspond to a GROUP BY phrase",_UserId);
					return false;
				}
			}
			
			// HAVING句を取得する
			if(_GROUP_BY_VALUE != null && sql.indexOf(" HAVING ") != -1)
			{
				_HAVING_VALUE = this.PatternSplit(_HAVING);
				if(_HAVING_VALUE == null)
				{
					_sysLog.finest_d("Analize:There is no description to a HAVING phrase",_UserId);
					return false;
				}
			}

			// ORDER BY句を取得する
			if(_sql_flg == 0)
			{
				_ORDER_BY_VALUE = this.PatternSplit(_ORDER);
				if(_ORDER_BY_VALUE == null)
				{
					_sysLog.finest_d("Analize:There is no description to an ORDER BY phrase",_UserId);
					return false;
				}
			}

			//*****  SQL文の各パーツを解析する。*****************************
			
			// FROM句の解析を行う。*************************************
	
			// FROM句をカンマで区切り細分化する
			parts_list.clear();
			parts_list = PartsSplit(_FROM_VALUE);
			
			for(cnt=0; cnt<parts_list.size(); cnt++)
			{
				this.frTableSet((String)parts_list.get(cnt));
			}

			//使用しているテーブルの解析が終了したので、
			// 各テーブルのコメント、全カラム名、全カラムコメント等を取得する
			if(!_dbutil.load(conn,_w_cdata.Table_Names)) {
				return false;
			}

			//テーブルコメント情報リストを設定する。
			for (Iterator itr=_w_cdata.Table_Names.iterator(); itr.hasNext();) {
				String w_tbname = itr.next().toString();
				_w_cdata.Table_Name_Comments.add(_dbutil.getTableComment(w_tbname));
			}

			// SELECT句の解析を行う。*************************************
			// アスタリスク指定の場合
			if(_SELECT_VALUE.equals("*"))
			{
				setAllColumns();
			}
			else
			{
				// SELECT句をさらに細分化する
				parts_list.clear();
				parts_list = PartsSplit(_SELECT_VALUE);
				for(cnt=0; cnt<parts_list.size(); cnt++)
				{
					// カラム情報リストに設定する
					this.seColumnSet((String)parts_list.get(cnt));
				}
					
			}
				
			// テーブルコメント、カラムコメント、カラム属性を設定する
			for(cnt=0; cnt<_w_cdata.Column_infos.size(); cnt++)
			{
				AZ0040ColumnInfo col_info = (AZ0040ColumnInfo)_w_cdata.Column_infos.get(cnt);
				this.setColumnInfo(col_info);
			}

			// WHERE句の解析を行う。*************************************
			if(!_WHERE_VALUE.equals(""))
			{
				this.analizeWhere(_WHERE_VALUE);
				
			}

			// ORDER BY句がある場合は分析を行う *************************
			if(_ORDER_BY_VALUE != null)
			{
				// FROM句をカンマで区切り細分化する
				parts_list.clear();
				parts_list = PartsSplit(_ORDER_BY_VALUE);

				// ORDER BY句判定用リストの作成
				List oderList = this.setOrderByList(parts_list);
				
				// Package公開変数にORDER BY句を設定する
				this.setColumnInfoOrderBy(oderList);
			}		
			return true;
		} catch(SQLException e){
			throw e;
		} catch(Exception e2){
			_sysLog.finest_d("Analise error : " + e2.getMessage(), _UserId);
			return false;
		}
	}
	


//***************************************************
//      パッケージ公開関数
//***************************************************
	/**
	 * 解析したSQL文の結果(ColumnDataクラス)を取得する
	 * @return AZ0040ColumnData  解析したSQLデータ
	 */
	public AZ0040ColumnData getColumnData()
	{
		return _w_cdata;
	}
	
	/**
	 * 解析したSQLが使用しているテーブルのカラム情報クラス
	 * (DBUtilクラス)を取得する
	 * @return AZ0040DBUtil 解析したSQLデータ
	 */
	public final AZ0040DBUtil getDBUtil() {
		return _dbutil;
	}

	//---------------------------------------------------------------------------
	//    ColumnData,ColumnInfo情報の再構築用メソッド
	//---------------------------------------------------------------------------

	/* 画面入力情報をもとに、テーブル情報(ColumnData)を再構築する。
	 * このメソッドを発行すると、既存のColumnDataクラス内のテーブル情報が
     * 書き換えられる。
     * @param tlist テーブル選択画面で指定されたテーブル名リスト<-- struct情報
     * @param clist テーブル選択画面で指定されたテーブル別名リスト<-- struct情報
     * @return true/false
	 *
	 * 前提条件として、各リストの行数は同じであること。
     *
     */
	protected final boolean setTables(IDbConnection conn,List tlist,List clist) 
                                    throws SQLException
 	{
		//テーブル別名を再命名するして、ColumnDataクラスにテーブル別名情報を設定しなおす
		_w_cdata.renewTableAlias(tlist);
		//ColumnDataクラスにテーブル情報を設定しなおす。
		_w_cdata.setTableNames(tlist);
		//ColumnDataクラスにテーブルコメント情報を設定しなおす。
		_w_cdata.setTableNameComments(clist);

		//テーブル情報(DBUtilクラス)を再作成する。
		if(!_dbutil.load(conn,tlist)) {
			return false;
		} 
		return true;
	}
	/*
	 * 画面で指定されたテーブル結合条件文(Struct)を
     * ColumnDataクラスの結合条件情報(Join_Infos、JoinList)に格納する。
	 *  Controlクラスから呼び出される。
	 * @param left_tlist   画面入力情報リスト(左辺テーブル名) <-- struct
	 * @param left_alist   画面入力情報リスト(左辺テーブル別名) <-- struct
	 * @param left_clist   画面入力情報リスト(左辺カラム名) <-- struct
	 * @param right_tlist  画面入力情報リスト(右辺テーブル名) <-- struct
	 * @param right_alist  画面入力情報リスト(右辺テーブル名) <-- struct
	 * @param right_clist  画面入力情報リスト(右辺テーブル名) <-- struct
	 * @param cond_list    画面入力情報リスト
     *                      (結合条件(C_JOIN_EQUAL/C_JOIN_LEFT/C_JOIN_RIGHT)) <-- struct
	 * 前提条件として、各リストの行数は同じであること。
     *
	 */
	protected final boolean setJoinInfo(List left_tlist,  List left_alist, 
                                        List left_clist,  List right_tlist,
										List right_alist, List right_clist,
                                        List cond_list) {

		String[] w_input = null;
				 //データ格納形式
                 //String[0] 左辺のテーブル名
                 //String[1] 左辺のテーブル名別名
                 //String[2] 左辺のカラム名
                 //String[3] 結合条件(C_JOIN_EQUAL/C_JOIN_LEFT/C_JOIN_RIGHT)
                 //String[4] 右辺のテーブル名
                 //String[5] 右辺のテーブル名別名
                 //String[6] 右辺のカラム名
		
		ArrayList w_InputList = new ArrayList(left_tlist.size());
		// 
		for (int i=0; i<left_tlist.size(); i++) {
			w_input = new String[7];
			/***** 左辺情報 *****/
			w_input[0] = left_tlist.get(i).toString();
			w_input[1] = left_alist.get(i).toString();
			w_input[2] = left_clist.get(i).toString();
			/***** 結合条件 *****/
			w_input[3] = cond_list.get(i).toString();
			/***** 右辺情報 *****/
			w_input[4] = right_tlist.get(i).toString();
			w_input[5] = right_alist.get(i).toString();
			w_input[6] = right_clist.get(i).toString();

			w_InputList.add(w_input);
		}
		boolean w_ret = _w_cdata.setJoinInfo(w_InputList);
		return w_ret;
	}

	/* 画面入力情報をもとに、項目情報(ColumnInfo)を再構築する。
	 * このメソッドを発行すると、既存のColumnDataクラス内のColumnInfo情報が
     * 書き換えられる。
     * @param l_table 項目選択画面で指定された項目情報(テーブル名リスト）<-- struct情報
     * @param l_talias 項目選択画面で指定された項目情報(テーブル別名リスト）<-- struct情報
     * @param l_column 項目選択画面で指定された項目情報（カラム名リスト）<-- struct情報
     * @return true/false
	 *
	 * 前提条件として、各リストの行数は同じであること。
     *
     */
	protected final boolean renewColumnInfos(List l_table, List l_talias, List l_column)
	{
		String w_tableName = null;
		String w_tableAlias = null;
		String w_columnName = null;

		//最新の項目情報を格納するリストを生成		
		List new_INFOS = new ArrayList(l_table.size());
		
		int count = 1;
		String check_tableAlias = null;
		String check_columnName = null;

		for(int i=0; i<l_table.size(); i++) {
			//新しいColumnInfo 生成
			AZ0040ColumnInfo new_info = new AZ0040ColumnInfo();

			w_tableName = l_table.get(i).toString();
			w_tableAlias = l_talias.get(i).toString();
			w_columnName = l_column.get(i).toString();
			
			count = 1;
			// 同じカラムの行数
			for (int j = 0; j < i; j++) {
				check_tableAlias = l_talias.get(j).toString();
				check_columnName = l_column.get(j).toString();
				if (w_tableAlias != null && check_tableAlias != null) {
					if (w_tableAlias.equals(check_tableAlias) && w_columnName.equals(check_columnName)) {
						count++;
					}
				} else if (w_tableAlias == null && check_tableAlias == null) {
					if (w_columnName.equals(check_columnName)) {
						count++;
					} 
				}
			}

			//元の項目情報リストにあるかチェック
			AZ0040ColumnInfo org_info = _w_cdata.getColumnInfo(w_tableAlias, w_columnName, count);

			if(org_info != null) {
				new_info.setColumnInfo(org_info);
			} else {
				// テーブル名
				new_info.setTable_Name(w_tableName);
				// テーブル名別名		
				new_info.setTable_Name_Alias(w_tableAlias);	
				//テーブル名指定区分
				new_info.setColumn_Asflag(C_AS_ALIAS);
			    // カラム名
				new_info.setColumn_Name(w_columnName);		
				// テーブル名コメント
			    new_info.setTable_Name_Comment(_dbutil.getTableComment(w_tableName));
				// カラム名コメント
   				new_info.setColumn_Name_Comment(
                                 _dbutil.getColumnComment(w_tableName,w_columnName));
				//カラムの属性(ORACLE DATA_TYPE)
			    new_info.setColumn_Type_Ora(_dbutil.getColumnType(w_tableName,w_columnName));
			}
			new_INFOS.add(new_info);
		}

		//古い項目情報をクリア
		_w_cdata.Column_infos.clear();
		
		//新しい情報をセットしなおす。
		for(Iterator itr=new_INFOS.iterator(); itr.hasNext();) {
			_w_cdata.Column_infos.add((AZ0040ColumnInfo)itr.next());
		}
		new_INFOS.clear();
		return true;
	}

//***************************************************
//      非公開関数
//***************************************************
	
	/**
	 * SQL文の各部分を取得する<br>
	 * <br>
	 * @param SelectNum 各処理パターン
	 * @return 処理名 取得したいSQL部分の各項目 取得できない場合はnull
	 */
	private String PatternSplit(int SelectNum)
	{
		String token = null;
		
		switch(SelectNum)
		{
			// SELECT
			case _SELECT:
				// SELECT抽出処理
				index_first = 6;
				token = this.GetPattern(" FROM ");
			break;
			
			// FROM
			case _FROM:
				// FROM抽出処理
				token = this.GetPattern(" WHERE ");
				// WHEREがない場合
				if(token == null)
				{
					token = this.GetPattern(" GROUP BY ");
				}
				// GROUP BYがない場合
				if(token == null)
				{
					token = this.GetPattern(" ORDER BY ");
				}
				// ORDER BYがない場合
				if(_sql_flg == 0 && token == null)
				{
					token = sql.substring(index_first, sql.length()).trim();
					_sql_flg = 1;
				}
			break;
			
			// WHERE
			case _WHERE:
				// WHERE抽出処理
				token = this.GetPattern(" GROUP BY ");
				// GROUP BYがない場合
				if(token == null)
				{
					token = this.GetPattern(" ORDER BY ");
				}
				if(token == null)
				{
					token = this.GetPattern(" HAVING ");
				}
				// ORDER BYがない場合
				if(_sql_flg == 0 && token == null)
				{
					token = sql.substring(index_first, sql.length()).trim();
					_sql_flg = 1;
				}
			break;
			
			// GROPU BY
			case _GROUP:
				// GROUP BY抽出処理
				token = this.GetPattern(" HAVING ");
				// HAVINGがない場合
				if(token == null)
				{
					token = this.GetPattern(" ORDER BY ");
				}
				// ORDER BYがない場合
				if(_sql_flg == 0 && token == null)
				{
					token = sql.substring(index_first, sql.length()).trim();
					_sql_flg = 1;
				}
			break;
			
			// HAVING
			case _HAVING:
				// HAVING抽出処理
				token = this.GetPattern(" ORDER BY ");
				// ORDER BYがない場合
				if(_sql_flg == 0 && token == null)
				{
					token = sql.substring(index_first, sql.length()).trim();
					_sql_flg = 1;
				}
			break;
			
			// ORDER BY
			case _ORDER:
				// ORDER BY抽出処理
				if(_sql_flg == 0)
				{
					token = sql.substring(index_first, sql.length()).trim();
					_sql_flg = 1;
				}
			break;
		}
		
		return token;
	}
	
	/** 各SQL文の取得 */
	/**
	 * SQL文の各項目部分毎に取得を行う<br>
	 * @param target 検索する文字列
	 * @return pattern 分割した文字列
	 */
	private String GetPattern(String target)
	{
		String pattern = "";
		
		// 指定された部分文字列が最初に出現する位置を取得
		index_end = sql.indexOf(target);
		if(index_end == -1)
		{
			return null;
		}

		// 取得したい各SQL文をスペースを削除して取得
		pattern = sql.substring(index_first, index_end).trim();
		index_first = index_end + (target.length()-1);
		
		_temp_sql = sql.substring(index_end + (target.length()-1)).trim();

		return pattern;
	}
	
			
	/**
	 * カンマで区切りし細分化を行う<br>
	 * @param value SQL文を分解した各項目
	 * @return temp_list カンマで分割したリスト(String)
	 */
	private List PartsSplit(String value)
	{
		int size = 0;
		int i = 0;
		
		List temp_list = new ArrayList();
		
		// カンマで分割する
		StringTokenizer st = new StringTokenizer(value, ",");
		size = st.countTokens();
		
		String token[] = new String[size];
		for (i=0; i<size; i++)
		{
			temp_list.add(st.nextToken().trim());
		}
		
		return temp_list;
	}
	
	/**
	 * スペースで分割を行い、<br>
	 * テーブル名、テーブル別名リストに設定する<br>
	 * @param val カンマ区切りのFROM区
	 * @return なし
	 */
	private void frTableSet(String val)
	{
		// スペースで分割
		StringTokenizer Alias_st = new StringTokenizer(val, " ");
		int Alias_tk_size = Alias_st.countTokens();
		String token[] = new String[Alias_tk_size];

		for (int i=0; i<Alias_tk_size; i++)
		{
			token[i] = Alias_st.nextToken().trim();
		}

		// テーブル名のみ
		if(Alias_tk_size == 1)
		{
			_w_cdata.Table_Names.add(token[0]);
			_w_cdata.Table_Name_Aliass.add("");
		}
		else if(Alias_tk_size == 2)
		{
			// Ailas設定の場合
			_w_cdata.Table_Names.add(token[0]);
			_w_cdata.Table_Name_Aliass.add(token[1]);
		}
	}

			
	/**
	 * エリアス指定、テーブル指定かのチェックを行い<br>
	 * Package公開変数に設定を行う<br>
	 * @param val カンマで区切られたSELECT部分
	 * @return なし
	 */
	private void seColumnSet(String val)
	{
		int index = 0;
		String AsValue[] = new String[2];
		
		AZ0040ColumnInfo w_cinfo = new AZ0040ColumnInfo();
		
		// alias指定チェック
		index = val.indexOf(" AS ");
		if(index != -1)
		{
			AsValue[0] = val.substring(0, index).trim();
			AsValue[1] = val.substring((index+3), val.length()).trim();
			// テーブル名指定チェック
			index = AsValue[0].indexOf(".");
			if(index != -1)
			{
				// TYPE [テーブル名.カラム名 AS エリアス名]
				w_cinfo.Table_Name = AsValue[0].substring(0, index).trim();
				w_cinfo.Column_Name = AsValue[0].substring((index+1), AsValue[0].length()).trim();
				w_cinfo.Column_Name_Alias = AsValue[1];
			}
			else
			{
				// TYPE [カラム名 AS エリアス名]
				w_cinfo.Column_Name = AsValue[0].substring((index+1), AsValue[0].length()).trim();
				w_cinfo.Column_Name_Alias = AsValue[1];
			}
			
			// 表示フラグ
			if ( "undisplayed".equals(AsValue[1]) )
			{
				w_cinfo.Display_Flg = false;
			} 
			else
			{
				w_cinfo.Display_Flg = true;
			}
		}
		else
		{
			// テーブル名指定チェック
			index = val.indexOf(".");
			if(index != -1)
			{
				// TYPE [テーブル名.カラム名]
				w_cinfo.Table_Name = val.substring(0, index).trim();
				w_cinfo.Column_Name = val.substring((index+1), val.length()).trim();
				
				// カラム名が"*"指定の場合
				if(w_cinfo.Column_Name.equals("*"))
				{
					this.setAllColumns(w_cinfo.Table_Name);
					return ;
				}
			}
			else
			{
				// TYPE [カラム名]
				w_cinfo.Column_Name = val.trim();
			}
			
		}
		
		_w_cdata.Column_infos.add(w_cinfo);
	}

	/**
	 * 引数で指定されたテーブルの全カラム名を取得し<br>
	 * 項目情報クラス(ColumnInfoクラス)に設定を行う<br>
	 * @param table テーブル名
	 * @return なし
	 */
	private void setAllColumns(String table)
	{
		//該当するカラム情報クラス(DBInfo)を取り出す
		AZ0040DBInfo dbinfo = _dbutil.getDBInfo(table);
		
		// カラム名設定
		for(Iterator cols=dbinfo.getColumnNames().iterator(); cols.hasNext();)
		{
			//項目情報クラスの生成
			AZ0040ColumnInfo w_cinfo = new AZ0040ColumnInfo();
			
			// テーブル名,カラム名を項目情報クラス(ColumnInfo)に設定
			w_cinfo.Table_Name  = dbinfo.getTablename();
			w_cinfo.Column_Name = cols.next().toString();
			
			//ColumnDataクラスに追加
			_w_cdata.Column_infos.add(w_cinfo);
		}
	}
		
	/**
	 * 全てのテーブルのカラム名を取得し<br>
	 * Package公開変数に設定を行う<br>
	 * @return なし
	 */
	private void setAllColumns()
	{
		String w_tableName = null;
		for(Iterator itr=_w_cdata.Table_Names.iterator();itr.hasNext();) {
			w_tableName = itr.next().toString();
			this.setAllColumns(w_tableName);
		}
	}
			
	/**
	 * 各カラムの情報を設定する
	 * @param col_info カラムの情報
	 * @return なし
	 */
	private void setColumnInfo(AZ0040ColumnInfo col_info)
	{
		int i = 0;
		String buffer = null;

		// テーブル名がnullかどうか判定
		if(col_info.Table_Name != null)
		{
			// テーブル名指定区分にテーブル名指定を設定
			col_info.Column_Asflag = C_AS_TB;
			
			// 設定してあるテーブル名がエリアスか判定する
			int w_idx = -1;
			w_idx = _w_cdata.Table_Name_Aliass.indexOf(col_info.Table_Name);
				// エリアス指定の場合
			if(w_idx > -1) {
					// 現在のテーブル名をテーブル別名に設定
					col_info.Table_Name_Alias = col_info.Table_Name;
					// テーブル名リストよりテーブル名を設定
					col_info.Table_Name = (String)_w_cdata.Table_Names.get(w_idx);
					// テーブル名指定区分にテーブル別名指定を設定
					col_info.Column_Asflag = C_AS_ALIAS;
			}
		}
		else
		{
			// テーブル名指定区分にテーブル名指定なしを設定
			col_info.Column_Asflag = C_AS_NONE;
			
			// テーブル名指定がない  
            //  -->  全テーブルより最初に一致するテーブル名を設定する
			for(i=0; i<_w_cdata.Table_Names.size(); i++)
			{
				buffer = _dbutil.getColumnComment((String)_w_cdata.Table_Names.get(i), col_info.Column_Name);
				// 該当するDBInfo情報が見つかった場合
				if(buffer != null)
				{
					// テーブル名、テーブル別名を設定する
					col_info.Table_Name = (String)_w_cdata.Table_Names.get(i);
					col_info.Table_Name_Alias = (String)_w_cdata.Table_Name_Aliass.get(i);
					break;
				}
			}
		}

		// テーブルコメントを設定
		col_info.Table_Name_Comment = _dbutil.getTableComment(col_info.Table_Name);

		// カラムコメントを設定
		col_info.Column_Name_Comment = _dbutil.getColumnComment(col_info.Table_Name, col_info.Column_Name);

		// カラム属性を設定
		col_info.Column_Type_Ora = _dbutil.getColumnType(col_info.Table_Name, col_info.Column_Name);

	}

	/**
	 * 各カラムのソート順、種類を設定する
	 * @param valList ソートキーの情報
	 * @return なし
	 */
	private void setColumnInfoOrderBy(List valList)
	{
		String table = null;
		String column = null;
		AZ0040ColumnInfo col_info = null;
		
		String checkTable = null;
		String checkColumn = null;
		String[] checkValues = new String[2];
		int count = 1;

		for(int i=0; i<valList.size(); i++)
		{
			String[] values = new String[2];
			values = (String[])valList.get(i);
			// values の形式
			//  values[0] カラム名 Table.Column  or Column (Aliasあり)
			//  values[1] ソート種類 ASC or DSESC

			if(values[0].indexOf(".") != -1) {
				// テーブル名を取得
				table = values[0].substring(0, values[0].indexOf(".")).trim();
				// カラム名を取得
				column = values[0].substring(values[0].indexOf(".")+1).trim();
			} else {
				column = values[0];
			}
			
			count = 1;
			// 同じカラムの行数
			for (int j = 0; j < i; j++) {
				checkValues = (String[]) valList.get(j);
				if(checkValues[0].indexOf(".") != -1) {
					// テーブル名を取得
					checkTable = checkValues[0].substring(0, checkValues[0].indexOf(".")).trim();
					// カラム名を取得
					checkColumn = checkValues[0].substring(checkValues[0].indexOf(".")+1).trim();
				} else {
					checkColumn = checkValues[0];
				}
				if (table != null && checkTable != null) {
					if (table.equals(checkTable) && column.equals(checkColumn)) {
						count++;
					}
				} else if (table == null && checkTable == null) {
					if (column.equals(checkColumn)) {
						count++;
					}
				}
			}

			//ソートキー指定されているカラムに該当するColumnInfoを取得する。
			col_info = _w_cdata.getColumnInfo(table,column,count);
			// ソート順を設定
			col_info.Sort_No = (i+1);
			// ソート種類を設定
			col_info.Sort_Type = Integer.parseInt(values[1]);
		}
	}
			
	/**
	 * 空白で分割し、ソートの種類と順序を設定する
	 * @param valList ソートキーの情報
	 * @return temp_list ソート情報のリスト（String配列）
	 */
	private List setOrderByList(List valList)
	{
		int cnt = 0;
		List temp_list = new ArrayList();
		

		for(int i=0; i<valList.size(); i++)
		{
			String token[] = new String[2];
			
			// スペースで分割
			StringTokenizer st = new StringTokenizer((String)valList.get(i), " ");
			int size =st.countTokens();

			// ASC,DESC指定あり
			if(size == 2)
			{
				for (cnt=0; cnt<size; cnt++)
				{
					token[cnt] = st.nextToken().trim();
				}
				// 昇順、降順チェック
				if(token[1].equals("DESC"))
				{
					token[1] = "2";
				}
				else
				{
					token[1] = "1";
				}
			}
			else
			{
				for (cnt=0; cnt<size; cnt++)
				{
					token[cnt] = st.nextToken().trim();
				}
				token[1] = "1";
			}
			// リストにセットする
			temp_list.add(token);
		}
		
		return temp_list;
	}

    /**
     * comment SQL(WHERE句)を解析し、結果をAZ0040ColumnDataに
     *         格納する。
     * @param 
     */
    private void analizeWhere(String i_str)  {

    	String w_cond = null;
    	String[] w_comps = new String[6];
        List w_where_infos = new ArrayList();  //解析結果

        // (AND) で区切る
        List w_cond_list = where_separate(i_str);
        for (Iterator itr = w_cond_list.iterator(); itr.hasNext();) {
            w_cond = (String)itr.next();
            //BETWEEN句がある場合の処理
            if(w_cond.indexOf("BETWEEN") > 0) {
                w_cond += " AND ";              // between句に対するand
                w_cond += (String)itr.next();   // 範囲指定(To)
			}
            // 区切った条件節の解析・分解
            w_comps = condition_separate(w_cond);

            w_where_infos.add(w_comps);
        }

		// カラム情報クラス(ColumnData)にWHERE句情報を設定する
		this.setColumnInfoWhere(w_where_infos,w_cond_list);
    }

    /**
    *  (AND)で 区切った条件節を解析・分解
    *   <<想定する形式>>
    *   (1) テーブル結合条件
    *     Table.column = Table.column
    *   (2)抽出条件
    *     Table.column [比較演算子] value
    *       
    */

    private static String[] condition_separate(String i_str) {     

        // 文字操作ワーク
        int    w_index = 0;
        int    w_index2 = 0;
        String[]  w_info = new String[6];  //返却情報 (formatは下記)
                                           //[0] C_JOIN/C_COMP
                                           //[1] 左辺(テーブル名)
                                           //[2] 左辺(カラム名)
                                           //[3] 比較演算子
                                           //[4] 右辺(テーブル名 or 比較値)
                                           //[5] 右辺(カラム名 or 比較値)
        // チェック
        String w_left = null;
        String w_cond_right = null;
        String w_right = null;
        StringTokenizer st = null; 

        // 比較演算子で区切る。
        w_index = StringUtils.indexOfAny(i_str, COMP_STR);
	    if (w_index == -1) {
			//なにもしない。
	    } else {
            // 左辺を取り出す。
            w_left = i_str.substring(0,w_index).trim();
            // 演算子 + 右辺を取り出す
            w_cond_right = i_str.substring(w_index);
            // 演算子 + 右辺を分ける
            for ( int i=0; i<COMP_STR.length; i++) {
                //演算子はなにか？
                if (w_cond_right.startsWith(COMP_STR[i])) {
                    w_info[3] = COMP_STR[i].trim();
                    w_index2 = w_index + COMP_STR[i].length();
                    break;
                }
            }
            w_right = i_str.substring(w_index2);
      	}

        //左辺をテーブル名.カラム名 に分けて w_info[1],[2] にセット
        st = new StringTokenizer(w_left,".");
        if ( st.countTokens() == 1) {
            w_info[1] = null;    //テーブル名
            w_info[2] = st.nextToken().trim(); //カラム名
            int w_info_tochar = w_info[2].indexOf("TO_CHAR(");
            if(w_info_tochar>=0){
            	int w_info_tochar2 = w_info[2].indexOf(",");
            	w_info[2] = w_info[2].substring(w_info_tochar+8, w_info_tochar2);
            }
        } else {
        	w_info[1] = st.nextToken().trim(); //テーブル名
    		w_info[2] = st.nextToken().trim(); //カラム名
        	int w_info_tochar = w_info[1].indexOf("TO_CHAR(");
        	int w_info_tochar2 = w_info[2].indexOf(",");
        	if (w_info_tochar>=0 && w_info_tochar2>=0) {
        		w_info[1] = w_info[1].substring(w_info_tochar+8);
        		w_info[2] = w_info[2].substring(0,w_info_tochar2);
        	}
        }
        
		//比較演算子の種別ごとの 右辺の分割処理

        // IS NULL, IS NOT NULL
        if (w_info[3].equals("IS NULL") || w_info[3].equals("IS NOT NULL") ) {
	            w_info[0] = C_COMP;
				w_info[4] = null;
				w_info[5] = null;
		// BETWEEN
		} else if (w_info[3].equals("BETWEEN")) {
			int w_position = w_right.indexOf(" AND ");
			String w_from = w_right.substring(0, w_position);
			String w_to   = w_right.substring(w_position+5);
	        w_info[0] = C_COMP;
			w_info[4] = w_from.trim();
			w_info[5] = w_to.trim();
		// IN
		} else if (w_info[3].equals("IN")) {
			int w_first = w_right.indexOf("(");
			int w_last =  w_right.lastIndexOf(")"); 
	        w_info[0] = C_COMP;
			w_info[4] = null;
			w_info[5] = w_right.substring(w_first+1,w_last).trim();
		// LIKE
		} else if (w_info[3].equals("LIKE")) {
	        w_info[0] = C_COMP;
			w_info[4] = null;
			w_info[5] = w_right.trim();
		// テーブル結合条件(=) or 比較条件(=,!= ,<,>,<=,>=)
		} else {
	        //右辺は数値か？(右辺内のドットが小数点かどうかを検査)
	        if(NumberUtils.isNumber(w_right)) {;
	            w_info[0] = C_COMP;
				w_info[4] = null;
				w_info[5] = w_right.trim();
	        } else {
	            //右辺(テーブル名.カラム名) を分割。または比較値を取り出す。
	            st = new StringTokenizer(w_right,".");
	            if ( st.countTokens() == 1) {
	                w_info[0] = C_COMP;
	                w_info[4] = null;
	                w_info[5] = st.nextToken().trim(); //比較値
	            } else {
                    if (w_info[3].equals("=")) { 
		                w_info[0] = C_JOIN;
					} else {
		                w_info[0] = C_COMP;
					}
	                w_info[4] = st.nextToken().trim(); //テーブル名
	                w_info[5] = st.nextToken().trim(); //カラム名
	            }
	        }
		}

        return w_info;
	}
    /**
    *
    *  WHERE句を解析・分解する
    *   <<想定する形式>>
    *   条件 AND 条件 AND 条件......
    *
    */
    private static ArrayList where_separate(String i_str) {     
        /** SQL where句の複合条件区切り文字列 */
        String[] SEPARATOR_STR = {" AND "};

        // 文字操作ワーク
        String w_string        = null;
        int    w_index = 0;
        int    w_index2 = 0;
        int    w_start = 0;
        ArrayList   w_cond_list = new ArrayList();

        // チェック
        String w_separator = null;
        String w_condition = null;

        w_start = 0;
        while(true) {
            //未検査文字列を取り出す。
	        w_string = i_str.substring(w_start);

            // (" AND ") で区切られているかどうかを調べる。
            w_index = StringUtils.indexOfAny(w_string, SEPARATOR_STR);
	        if (w_index == -1) {
                w_cond_list.add(w_string.trim());
	            break;
	        } else {
                // (" AND ") で区切られている条件の左側を取り出す。
                w_condition = w_string.substring(0,w_index);
                // 条件式リストに退避
                w_cond_list.add(w_condition.trim());
	            w_start += w_index;
                
                // 区切った文字列（右側）の左端から(AND)を取り出す
                w_string = i_str.substring(w_start);
                //
                w_index2 = w_string.indexOf(" ",1);
                w_separator = w_string.substring(0,w_index2).trim();
                w_start += (w_index2 + 1);
	        }
      	}
        return w_cond_list;
	}

	/**
	 * 各カラムの検索条件をAZ0040ColumnDataに設定する
	 * @param valList 検索条件情報(条件式分割後)
	 * @param condList 検索条件情報(条件式分割前)
	 * @return なし
	 */
	private void setColumnInfoWhere(List valList,List condList)
	{
		String[] w_comps = new String[6];
        AZ0040ColumnInfo col_info = null;
		
        //****  valList[i]の形式  ********************
	        //[0] 結合条件/比較条件の区分 C_JOIN/C_COMP
            //[1] 左辺(テーブル名)
            //[2] 左辺(カラム名)
            //[3] 比較演算子
            //[4] 右辺(テーブル名 or 比較値)
            //[5] 右辺(カラム名 or 比較値)
		//*********************************************
		_w_cdata.JoinList.clear();
		_w_cdata.Join_Infos.clear();
		
		String[] check_comps = new String[6];
		int count = 1;

		for(int i=0; i<valList.size(); i++)
		{
			w_comps = (String[])valList.get(i);
            if (w_comps[0].equals(C_JOIN)) { 		//結合条件だった場合
				_w_cdata.setJoinList(w_comps,(String)condList.get(i));
			} else {						    //比較条件だった場合
				count = 1;
				// 同じカラムの行数
				for (int j = 0; j < i; j++) {
					check_comps = (String[])valList.get(j);
					if (!check_comps[0].equals(C_JOIN)) {
						if (w_comps[1] != null && check_comps[1] != null){
							if (w_comps[1].equals(check_comps[1]) && w_comps[2].equals(check_comps[2])) {
								count++;
							}
						} else if (w_comps[1] == null && check_comps[1] == null) {
							if (w_comps[2].equals(check_comps[2])) {
								count++;
							}
						}
					}
				}

				//WHERE句で指定されているカラムに該当するColumnInfoを取得する。
				col_info = _w_cdata.getColumnInfo(w_comps[1],w_comps[2], count);
				//比較演算子の設定
				col_info.Cond_Type = getCondTypeNo(w_comps[3]);

				//条件値の設定 
                if (w_comps[3].equals("BETWEEN")) {
					col_info.Cond_Value1 = w_comps[4]; // from
					col_info.Cond_Value2 = w_comps[5]; // to
				} else {
					col_info.Cond_Value1 = w_comps[5]; // fromのみ
				}
			}
		}
	}

    /**
    *  @param  比較条件式(String)
    *  @return 比較条件番号(画面上コンボボックス上の番号)
    *
    *
    */
    protected int getCondTypeNo(String w_cond) {
        int w_no = 0;
        for (int i=0; i< COMP_STR_DISP.length; i++) {
        	if (w_cond.equals(COMP_STR_DISP[i])) {
				w_no = i;
                break;
			}
    	}
        return w_no;
    }

	/** クリア */
	private void clear()
	{ 
		_w_cdata = new AZ0040ColumnData();
		_dbutil = new AZ0040DBUtil(_sysLog,_UserId);
	}
    


    //***********  定数・変数定義  ******/

	//Syslog用
    SystemLog _sysLog = null;
    String _UserId = null;

	private AZ0040ColumnData _w_cdata;		
	private AZ0040DBUtil _dbutil;			

	private int index_first = 0;			
	private int index_end   = 0;			
	private int _sql_flg = 0;				
	private String sql = "";				
	private String _temp_sql = "";			
	private String _SELECT_VALUE   = "";	
	private String _FROM_VALUE     = "";	
	private String _WHERE_VALUE    = "";	
	private String _GROUP_BY_VALUE = "";	
	private String _HAVING_VALUE   = "";	
	private String _ORDER_BY_VALUE = "";	
	private final int _SELECT = 1;
	private final int _FROM   = 2;
	private final int _WHERE  = 3;
	private final int _GROUP  = 4;
	private final int _HAVING = 5;
	private final int _ORDER  = 6;

    //WHERE条件の種類(結合条件、比較条件)
    private static final String C_JOIN = "JOIN"; //テーブル結合条件
    private static final String C_COMP = "COMP"; //比較条件



}