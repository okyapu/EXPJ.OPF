//------------------------------------------------------------------------------
/**
 * CLASS     : AZ0050ColumnData クラス
 * ファイル・クラス説明
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.6 $ $Date: 2012/05/30 08:00:32 $
 *
 */
//-----------------------------------------------------------------------------
package com.nec.jp.orteus.metamorBase.AZ0050;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.commons.lang.StringUtils;

/**
 * SQL解析クラス
 * @author  Y.Hashimoto
 * @version 1.00
 * @see 
 */
public class AZ0050ColumnData
              implements AZ0050Const 
{
// ******* Package公開変数 *********


    // --------SQL情報  -------------
    List Column_infos = null;		// カラム情報リスト

    //等しいindexの場所にテーブル名と別名を格納する。
    List Table_Names = null;	    // テーブル名リスト
    List Table_Name_Aliass = null;	// テーブル名別名リスト
    List Table_Name_Comments = null;	// テーブル名別名リスト
    List Join_Infos = null;		    // テーブル結合条件式(table.col = table.col の形式）
	public List JoinList = null;			// テーブル結合条件（WhereInfoクラスのリスト)

// ******* 非公開定数・変数 *********

    //結合条件の各式を左辺、右辺に分割した情報
	protected class WhereInfo {
		public String left_TableName = "";	    //テーブル名
		public String left_TableNameAlias = ""; //テーブル別名
		public String left_ColumnName = "";     //カラム名
		public String right_TableName = "";     //テーブル名
		public String right_TableNameAlias = "";//テーブル別名
		public String right_ColumnName = "";    //カラム名
		public String condition; //結合条件 ((C_JOIN_EQUAL/C_JOIN_LEFT/C_JOIN_RIGHT)
	}

    //検索条件画面の表示/非表示指定
    int [] Disp_flg = null;

// ********  コンストラクタ **************
    /**
      * 
      * コンストラクタ<br>
      *
      * @param xx
      * @see #xxxxx
      */
    AZ0050ColumnData() {
    	Column_infos = new ArrayList();		 // カラム情報リスト
 		Table_Names = new ArrayList();		 // テーブル名リスト
     	Table_Name_Aliass = new ArrayList(); // テーブル名別名リスト
		Table_Name_Comments = new ArrayList();//テーブルコメント情報リスト
     	Join_Infos = new ArrayList();        // テーブル結合条件式
		JoinList = new ArrayList();
    }

//------------------------------------------------------------------
//  公開関数
//------------------------------------------------------------------
    // *********  値取得用メソッド*********************
    public final List  getColumnInfos() { // カラム情報リスト
        return Column_infos;
    }

    public final AZ0050ColumnInfo  getColumnInfo(int Idx) { // カラム情報クラス
        return (AZ0050ColumnInfo)Column_infos.get(Idx);
    }

    public final List  getTableNames() { // テーブル情報リスト
        return Table_Names;
    }

    public final List  getTableComments() { // テーブルコメント情報リスト
        return Table_Name_Comments;
    }


     public final List  getJoinInfos() { // テーブル結合条件
        return Join_Infos;
    }
//------------------------------------------------------------------
//  パッケージ公開関数
//------------------------------------------------------------------
    void  setTableNames(List list) { // テーブル情報リスト
        Table_Names.clear();
        Table_Names.addAll(list);
    }
    void  setTableNameComments(List list) { // テーブル情報リスト
        Table_Name_Comments.clear();
        Table_Name_Comments.addAll(list);
    }

	/* 指定されたテーブル名（またはテーブル別名）、カラム名（またはカラム別名)
	 *　をもつColumnInfoクラスを取得する。
	 * @param TableName テーブル名、またはテーブル別名
	 * @param ColumnName カラム名、またはカラム別名)
	 * @param ColumnCount カラムの行数
	 *
	*/
	AZ0050ColumnInfo getColumnInfo(String TableName, String ColumnName, int ColumnCount) {
		AZ0050ColumnInfo w_info = null;
		int checkCount = 0;
		for (Iterator itr=Column_infos.iterator(); itr.hasNext();) {
			AZ0050ColumnInfo col_info = (AZ0050ColumnInfo)itr.next();
			if(TableName != null) {
				if((TableName.equals(col_info.Table_Name) ||
					TableName.equals(col_info.Table_Name_Alias)) &&
			  	 (ColumnName.equals(col_info.Column_Name) ||
				  ColumnName.equals(col_info.Column_Name_Alias))) {
					checkCount++;
					if (checkCount == ColumnCount) {
						w_info = col_info;
						return w_info;
					}
				}
			} else {
				// カラム名、若しくはエリアス名と一致
				if(ColumnName.equals(col_info.Column_Name) ||
				   ColumnName.equals(col_info.Column_Name_Alias)) {
					checkCount++;
					if (checkCount == ColumnCount) {
						w_info = col_info;
						return w_info;
					}
				}
			}
		}
		return w_info;
	}

	/*
	 * SQL文を分析した結果（テーブル結合条件文）を
     * Join_Infosリスト、およびJoinListリスト
	 * (WhereInfoクラスのリスト)に１行追加する。
	 * AZ0050SQLEdit.Analize()からsetColumnInfoWhere()経由で呼び出される。
	 *
	 */
	boolean setJoinList(String[] comps, String str_where) {
        //****  compsの形式  ********************
	        //[0] 結合条件/比較条件の区分 C_JOIN/C_COMP
            //[1] 左辺(テーブル名)
            //[2] 左辺(カラム名)
            //[3] 比較演算子
            //[4] 右辺(テーブル名 or 比較値)
            //[5] 右辺(カラム名 or 比較値)
		//*********************************************
		int idx;
		int idx_t = -1;
		//----- JoinList の設定 -------------
		WhereInfo w_whereinfo = new WhereInfo();
		  //結合条件
		w_whereinfo.condition       = C_JOIN_EQUAL;	//default

		  //左辺 テーブル名
		idx_t = -1;
		idx_t = Table_Name_Aliass.indexOf(comps[1]);
		if( idx_t > -1) {	//エリアス名指定だった場合
			w_whereinfo.left_TableNameAlias  = comps[1];
			w_whereinfo.left_TableName = Table_Names.get(idx_t).toString();
		} else {			//エリアスが指定されていない場合
			idx_t = Table_Names.indexOf(comps[1]);
			if(idx_t > -1) {
				w_whereinfo.left_TableNameAlias  = "";
				w_whereinfo.left_TableName = comps[1];
			} else {
				return false;
			}
		}
		 //左辺　カラム名
		idx = comps[2].indexOf("(+)");
		if(idx == -1) {
			w_whereinfo.left_ColumnName = comps[2];
		} else {
			w_whereinfo.left_ColumnName = comps[2].substring(0,idx);
			w_whereinfo.condition       = C_RIGHT_JOIN;
		}
		  //右辺 テーブル名
		idx_t = -1;
		idx_t = Table_Name_Aliass.indexOf(comps[4]);
		if( idx_t > -1) {	//エリアス名指定だった場合
			w_whereinfo.right_TableNameAlias  = comps[4];
			w_whereinfo.right_TableName = Table_Names.get(idx_t).toString();
		} else {			//エリアスが指定されていない場合
			idx_t = Table_Names.indexOf(comps[4]);
			if(idx_t > -1) {
				w_whereinfo.right_TableNameAlias  = "";
				w_whereinfo.right_TableName = comps[4];
			} else {
				return false;
			}
		}
		//右辺　カラム名
		idx = comps[5].indexOf("(+)");
		if(idx == -1) {
			w_whereinfo.right_ColumnName = comps[5];
		} else {
			w_whereinfo.right_ColumnName = comps[5].substring(0,idx);
			w_whereinfo.condition       = C_LEFT_JOIN;
		}
		// JoinListへ追加 --------------
		JoinList.add(w_whereinfo);

		//----- Join_Infos　の設定 --------------
		Join_Infos.add(str_where);
		
		return true;
	}

	/*
	 * 画面で指定されたテーブル結合条件文を
     * Join_Infosリスト、およびJoinListリストに格納する
	 * AZ0050SQLEdit.setJoinInfo() から呼び出される
	 * @param InputInfo  画面入力情報を保持したリスト
     *  InputInfo(i)の各要素はString[]。データ形式は下記のとおり。
     *            String[0] 左辺のテーブル名
     *            String[1] 左辺のテーブル名別名
     *            String[2] 左辺のカラム名
     *            String[3] 結合条件(C_JOIN_EQUAL/C_JOIN_LEFT/C_JOIN_RIGHT)
     *            String[4] 右辺のテーブル名
     *            String[5] 右辺のテーブル名別名
     *            String[6] 右辺のカラム名
	 */
	boolean setJoinInfo(List InputInfo) {
		String[] w_comps = null;
		StringBuffer w_str = null;
		//元の情報をクリアする
		Join_Infos.clear();
		JoinList.clear();

		//最新の結合条件情報をセットする。
		for(Iterator itr=InputInfo.iterator(); itr.hasNext();) {
			//----- JoinList の設定 -----------------------------------
			w_comps = (String[])itr.next();
			WhereInfo w_whereinfo = new WhereInfo();
			w_whereinfo.left_TableName       = w_comps[0];
			w_whereinfo.left_TableNameAlias  = w_comps[1];
			w_whereinfo.left_ColumnName      = w_comps[2];
			w_whereinfo.condition            = w_comps[3];
			w_whereinfo.right_TableName      = w_comps[4];
			w_whereinfo.right_TableNameAlias = w_comps[5];
			w_whereinfo.right_ColumnName     = w_comps[6];
			JoinList.add(w_whereinfo);

			//---- Join_Infos　の設定 ----------------------------------
			w_str = new StringBuffer("");
			//左辺組み立て
			if(w_comps[1] != null) {	//別名指定の場合、別名をセット
				w_str.append(w_comps[1]);
			} else {
				w_str.append(w_comps[0]);
			}
			w_str.append(".").append( w_comps[2]);	//左辺組み立て
			if (w_comps[3].equals(C_RIGHT_JOIN)) {	//右側外部結合の場合(右辺すべて）
				w_str.append("(+)");
			}				
			w_str.append(" = ");
			//右辺組み立て
			if(w_comps[5] != null) {	//別名指定の場合、別名をセット
				w_str.append(w_comps[5]);
			} else {
				w_str.append(w_comps[4]);
			}
			w_str.append(".").append( w_comps[6]);
			if (w_comps[3].equals(C_LEFT_JOIN)) {  //左側外部結合の場合(左辺すべて）
				w_str.append("(+)");
			}
			Join_Infos.add(w_str.toString());
		}
		return true;
	}


	/*-----------------------------------------------------------
    // 画面上で選択されたテーブルに対して、テーブル別名を割り当てる。
    //    命名規則:   同一テーブル名内の通番を振る  
    //                (ex)  A,A,B,C,B,D  --> A1,A2,B1,C1,B2,D1  
    //
	/------------------------------------------------------------*/
	final void renewTableAlias(List tableList)
	{
		// 新しいテーブルリストに対応した仮のエリアスリストを作成
		List TempAliasList = new ArrayList(tableList.size());
		
		// 仮エリアスリストの初期化
		for(int i=0; i<tableList.size(); i++)
		{
			// 既存エリアスありの場合
			if(Table_Name_Aliass.size() != 0 && i<Table_Name_Aliass.size())
			{
				TempAliasList.add((String)Table_Name_Aliass.get(i));
			}
			else
			{
				TempAliasList.add("");
			}
		}
		
		// テーブルに対する設定エリアス数をカウントするMap
		HashMap hashAlias = new HashMap();
		
		for(int i=0; i<tableList.size(); i++)
		{
			int count=0;
			
			// エリアスがnullでMap上にデータが存在しない場合
			if(((String)TempAliasList.get(i)).equals("") && hashAlias.get(tableList.get(i)) == null)
			{
				// 
				hashAlias.put(tableList.get(i), new Integer(1));

				TempAliasList.remove(i);
				TempAliasList.add(i, (String)tableList.get(i) + "1");
			}
			
			// エリアスがnullでMap上にデータがある場合
			else if(((String)TempAliasList.get(i)).equals("") && hashAlias.get(tableList.get(i)) != null)
			{
				// エリアス指定件数の取得
				count = ((Integer)hashAlias.get(tableList.get(i))).intValue();
				
				// エリアスの件数に１を加えた値を設定する
				hashAlias.remove(tableList.get(i));
				hashAlias.put(tableList.get(i), new Integer(count + 1));
				
				TempAliasList.remove(i);
				count++;
				TempAliasList.add(i, (String)tableList.get(i) + Integer.toString(count));
			}
			
			// エリアスにデータがありMapにデータがない場合
			else if(((String)TempAliasList.get(i)).equals("") == false && hashAlias.get(tableList.get(i)) == null)
			{
				// エリアスに設定してある数字を取得する
				//String val = StringUtils.stripStart((String)TempAliasList.get(i), (String)tableList.get(i));
				String val = StringUtils.replace(((String)TempAliasList.get(i)),((String)tableList.get(i)),"");
				count = Integer.parseInt(val);
				
				// 取得した値をMapへ設定する
				hashAlias.put(tableList.get(i), new Integer(count));
			}
			
			// エリアス,Map上共にデータがある場合
			else if(((String)TempAliasList.get(i)).equals("") == false && hashAlias.get(tableList.get(i)) != null)
			{
				// エリアスに設定してある数字を取得する
				//String val = StringUtils.stripStart((String)TempAliasList.get(i), (String)tableList.get(i));
				String val = StringUtils.replace(((String)TempAliasList.get(i)),((String)tableList.get(i)),"");
				count = Integer.parseInt(val);

				// Map上に設定してある値を比較する
				if(((Integer)hashAlias.get(tableList.get(i))).intValue() < count)
				{
					hashAlias.remove(tableList.get(i));
					hashAlias.put(tableList.get(i), new Integer(count));
				}
			}
		}
		
		Table_Name_Aliass.clear();
		Table_Name_Aliass.addAll(TempAliasList);
	}

}

