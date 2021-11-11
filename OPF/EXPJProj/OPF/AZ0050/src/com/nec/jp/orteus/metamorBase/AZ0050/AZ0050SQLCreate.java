//------------------------------------------------------------------------------
/**
 * CLASS     : AZ0050SQLCreat クラス
 * ファイル・クラス説明
 * @author $Author: zhou-kehong $
 * @version $Revision: 1.7 $ $Date: 2015/04/07 11:59:00 $
 *
 */
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.AZ0050;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.expj.systemlog.SystemLog;
import com.nec.jp.orteus.metamorBase.common01.Accessor.PrivateConfig;

import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Iterator;
import java.text.MessageFormat;

/**
 * SQL文を組立てる
 */
public class AZ0050SQLCreate implements AZ0050Const
{
	//--------------------------------------------------------------------------
	// 構築

	public final static int C_DISPLAY = 0;
	public final static int C_WRITE = 1;
	public int ColumnNameAliasCount = 0;
	private String w_format = "";

	/** コンストラクタ */
	public AZ0050SQLCreate(SystemLog sysLog, String User_ID)
	{
		_sysLog = sysLog;
		_User_ID = User_ID;
	}

	//--------------------------------------------------------------------------
	// 操作

	//---------------------------------------
	//  公開関数
	//---------------------------------------
	
	/**
	 * @param conn DBとのコネクション
	 * @param w_cdata AZ0050ColumnData 画面設定情報
	 * @param display_flg ＳＱＬ文字列作成条件 (0:表示用/1:ＤＢ登録用) 
	 * @return true:成功 / false:失敗
	 */
	public final void Create(IDbConnection conn,AZ0050ColumnData w_cdata,int display_flg) 
                            throws SQLException
	{
			int cnt = 0;
			String sSQL     = "";
			String sSELECT  = "";
			String sFROM    = "";
			String sWHERE   = "";
			String sORDERBY = "";
			String val      = "";
			String tmpWHERE = "";
			AZ0050ColumnInfo col_info;

			if(display_flg == C_DISPLAY) {
				//SYSTEM_PARAMETERテーブルから、日付表示形式の取得
 				PrivateConfig prconf = new PrivateConfig(conn);
				w_format = prconf.getString("DISPLAY_DATE_FORMAT");
			}

			//------------------------------------------------------------------------------
			// SELECT句の組立て
			//------------------------------------------------------------------------------
			for(cnt=0; cnt<w_cdata.Column_infos.size(); cnt++)
			{
				col_info = (AZ0050ColumnInfo)w_cdata.Column_infos.get(cnt);
				String w_colName = "";
				String checkFlg = "";
				//生成するＳＱＬ文字列は、表示用 or 登録用かを判定する
				if(display_flg == C_DISPLAY) {
					// 表示/非表示フラグチェック
					if(col_info.Display_Flg == true)
					{
						for (int j=0; j < cnt; j++){
							if(col_info.getColumn_Name().equals(((AZ0050ColumnInfo)w_cdata.Column_infos.get(j)).getColumn_Name())){
								checkFlg="1";
								break;
							}else{
								checkFlg="0";
							}
						}
						w_colName =  this.getColumnName(col_info,checkFlg);

						val += w_colName + ",";
					}
				} else {
					w_colName =  this.getColumnNameAlias(col_info);
					val += w_colName + ",";
				}
			}
			// 最後にカンマがある場合は、削除しSELECT句を生成する
			if(val.lastIndexOf(",") != -1)
			{
				if((val.lastIndexOf(",")+1) == val.length())
				{
					// 最後のカンマを削除
					sSELECT = val.substring(0, val.lastIndexOf(",")).trim();
				}
				else
				{
					sSELECT = val.trim();
				}
			}

			//------------------------------------------------------------------------------
			// FROM句の組立て
			//------------------------------------------------------------------------------
			val = "";
			for(cnt=0; cnt<w_cdata.Table_Names.size(); cnt++)
			{
				// エリアスの指定があるかチェック
				if(w_cdata.Table_Name_Aliass.get(cnt).equals(""))
				{
					// エリアス指定なし
					val += w_cdata.Table_Names.get(cnt) + ",";
				}
				else
				{
					// エリアス指定あり
					val += w_cdata.Table_Names.get(cnt) + " " + w_cdata.Table_Name_Aliass.get(cnt) + ",";
				}
				// 最後にカンマがある場合は、削除しFROM句を生成する
				if(val.lastIndexOf(",") != -1)
				{
					if((val.lastIndexOf(",")+1) == val.length())
					{
						// 最後のカンマを削除
						sFROM = val.substring(0, val.lastIndexOf(",")).trim();
					}
					else
					{
						sFROM = val.trim();
					}
				}
			}
			
			//------------------------------------------------------------------------------
			// WHERE句の組立て
			//------------------------------------------------------------------------------
			// 比較条件式の生成
			val = "";
			for(cnt=0; cnt<w_cdata.Column_infos.size(); cnt++)
			{
				col_info = (AZ0050ColumnInfo)w_cdata.Column_infos.get(cnt);
				
				// 各カラムの比較演算子を判定
				String wBuffer = this.MakesWhere(col_info);

				// nullチェック
				if(wBuffer != null)
				{
					val += wBuffer + " AND ";
				}
			}
			// 最後に" AND "がある場合は、削除しWHERE句を生成する
			if(val.equals("") != true)
			{
				if((val.lastIndexOf(" AND ")+5) == val.length())
				{
					// 最後の" AND "を削除
					tmpWHERE = val.substring(0, val.lastIndexOf(" AND ")).trim();
				}
				else
				{
					tmpWHERE = val.trim();
				}
			}

			// テーブル結合条件式の生成
			val = "";
			for(cnt=0; cnt<w_cdata.Join_Infos.size(); cnt++)
			{
				if(cnt == (w_cdata.Join_Infos.size()-1))
				{
					val += w_cdata.Join_Infos.get(cnt);
				}
				else
				{
					val += w_cdata.Join_Infos.get(cnt) + " AND ";
				}
			}

			// WHERE句の生成
			if(val.equals("") != true && tmpWHERE.equals("") != true)
			{
				sWHERE = val + " AND " + tmpWHERE;
			}
			else if(val.equals("") != true && tmpWHERE.equals("") == true)
			{
				sWHERE = val;
			}
			else if(val.equals("") == true && tmpWHERE.equals("") != true)
			{
				sWHERE = tmpWHERE;
			}

			//------------------------------------------------------------------------------
			// ORDER BY句の組立て
			//------------------------------------------------------------------------------
			HashMap ha = new HashMap();
			List sortList = new ArrayList();
			
			for(cnt=0; cnt<w_cdata.Column_infos.size(); cnt++)
			{
				
				col_info = (AZ0050ColumnInfo)w_cdata.Column_infos.get(cnt);
				
				// ソートするカラム名を判定
				if(col_info.Sort_No != 0)
				{
					ha.put(new Integer(col_info.Sort_No), new Integer(cnt));
				}
			}
			
			TreeMap tm = new TreeMap(ha);
			Iterator itr = tm.entrySet().iterator();

			// ソート順リストの作成
			while(itr.hasNext())
			{
				Map.Entry Entry = (Map.Entry)itr.next();
				sortList.add(Entry.getValue());
			}
				
			val = "";
			for(cnt=0; cnt<sortList.size(); cnt++)
			{
				int index = ((Integer)sortList.get(cnt)).intValue();
				String SortTyp = "";
				
				col_info = (AZ0050ColumnInfo)w_cdata.Column_infos.get(index);
				
				// 昇降順チェック
				if(col_info.Sort_Type == C_ASC)
				{
					SortTyp = " ASC";
				}
				else
				{
					SortTyp = " DESC";
				}
				
				val += this.getColumnName(col_info,"notochar") + SortTyp + ",";
			}
			
			// 最後にカンマがある場合は、削除しORDER BY句を生成する
			if(val.lastIndexOf(",") != -1)
			{
				if((val.lastIndexOf(",")+1) == val.length())
				{
					// 最後のカンマを削除
					sORDERBY = val.substring(0, val.lastIndexOf(",")).trim();
				}
				else
				{
					sORDERBY = val.trim();
				}
			}
			
			//------------------------------------------------------------------------------
			// SQLパターンの決定後、SQL文作成
			//------------------------------------------------------------------------------
			if(sWHERE.equals("") != true && sORDERBY.equals("") != true)
			{
				sSQL = "SELECT {0} FROM {1} WHERE {2} ORDER BY {3}";
				String[] sSqlArgs = {sSELECT, sFROM, sWHERE, sORDERBY};
				sql = MessageFormat.format(sSQL, sSqlArgs);
			}
			else if(sWHERE.equals("") != true && sORDERBY.equals("") == true)
			{
				sSQL = "SELECT {0} FROM {1} WHERE {2}";
				String[] sSqlArgs = {sSELECT, sFROM, sWHERE};
				sql = MessageFormat.format(sSQL, sSqlArgs);
			}
			else if(sWHERE.equals("") == true && sORDERBY.equals("") != true)
			{
				sSQL = "SELECT {0} FROM {1} ORDER BY {2}";
				String[] sSqlArgs = {sSELECT, sFROM, sORDERBY};
				sql = MessageFormat.format(sSQL, sSqlArgs);
			}
			else
			{
				sSQL = "SELECT {0} FROM {1}";
				String[] sSqlArgs = {sSELECT, sFROM};
				sql = MessageFormat.format(sSQL, sSqlArgs);
			}
	}
	
	/**
	 * WHEREの条件を構築する<br>
	 * <br>
	 * @param info 一カラムの情報
	 * @return WHERE句
	 */
	private String MakesWhere(AZ0050ColumnInfo info)
	{
		String buf = null;

		switch(info.Cond_Type)
		{
		case C_NE:	// !=
		case C_LT:	// <=
		case C_GT:	// >=
		case C_EQ:	// =
		case C_LS:	// >
		case C_GR:	// <
			
			buf = this.getColumnNameWhere(info,"notochar") + " " + info.Cond_Value1;
			break;

			// like
		case C_LIKE:
			buf = this.getColumnNameWhere(info,"like") + " " + info.Cond_Value1;
			break;
			
			// between
		case C_RANG:
			// テーブル名指定区分の判定
			buf = this.getColumnNameWhere(info,"notochar") + " " + 
                  info.Cond_Value1 + " AND " + info.Cond_Value2;
			break;
			
			// in
		case C_IN:
			buf = this.getColumnNameWhere(info,"notochar") + " (" + info.Cond_Value1 + ")";
			break;
			
		case C_ISNULL:	// is null
		case C_NOTNULL:	// is not null
			buf = this.getColumnNameWhere(info,"notochar");
			break;
			
		default:
			break;
		}
		
		return buf;
	}
	
	/**
	 * SQL文を取得する<br>
	 * <br>
	 * @return 構築したSQL
	 */
	public String getSQL()
	{
		return sql;
	}
	

	//---------------------------------------
	//  非公開関数
	//---------------------------------------
	private String getColumnName(AZ0050ColumnInfo i_info,String checkAlias) {
		String w_tableName = "";
		String w_columnName = "";
		if(i_info.Column_Asflag == C_AS_ALIAS)	{
			// エリアス指定
			w_tableName = i_info.Table_Name_Alias;
		} else {
			// テーブル名指定
			w_tableName = i_info.Table_Name;
		}
		w_columnName = w_tableName + "." + i_info.Column_Name;
		// 日付型の場合、フォーマット転換
		if (i_info.Column_Type_Ora.equals(C_DATE)) {
			if (!("notochar").equals(checkAlias)) {
				w_columnName = "TO_CHAR(" + w_columnName + ",'" + w_format + "')";
			}
		}
		if("1".equals(checkAlias)){
			w_columnName = w_columnName  +" AS " +i_info.Column_Name + ColumnNameAliasCount++;
		}
		return w_columnName;	
	}
	
	/**
	 * カラム名を取得、別名を考慮して
	 * @param i_info 一カラムの情報
	 * @return カラム名
	 */
	private String getColumnNameAlias(AZ0050ColumnInfo i_info) {
		String w_tableName = "";
		String w_columnName = "";
		if(i_info.Column_Asflag == C_AS_ALIAS)	{
			// エリアス指定
			w_tableName = i_info.Table_Name_Alias;
		} else {
			// テーブル名指定
			w_tableName = i_info.Table_Name;
		}
		w_columnName = w_tableName + "." + i_info.Column_Name;
		// 非表示場合、別名「undisplayed」を追加。
		if (!i_info.Display_Flg) {
			w_columnName = w_columnName + " AS undisplayed";
		}
		return w_columnName;	
	}

	private String getColumnNameWhere(AZ0050ColumnInfo i_info,String strAlias) {
		String w_columnName = this.getColumnName(i_info,strAlias) + 
                              " " + COMP_STR_DISP[i_info.Cond_Type];
		return w_columnName;
	}

	private String sql = null;
	private SystemLog _sysLog = null;
	private String _User_ID = null;
}