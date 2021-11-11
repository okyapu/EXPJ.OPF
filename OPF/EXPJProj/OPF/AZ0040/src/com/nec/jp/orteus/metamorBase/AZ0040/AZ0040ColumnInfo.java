//------------------------------------------------------------------------------
/**
 * CLASS     : AZ0040ColumnInfo クラス
 * ファイル・クラス説明
 * @author $Author: suganuma $
 * @version $Revision: 1.1 $ $Date: 2005/03/09 06:49:39 $
 *
 */
//-----------------------------------------------------------------------------
//package com.nec.jp.orteus.metamorBase.AZ0040;

package com.nec.jp.orteus.metamorBase.AZ0040;

/**
 * SQL解析クラス
 * @author  Y.Hashimoto
 * @version 1.00
 * @see 
 */
public class AZ0040ColumnInfo
              implements AZ0040Const {
// ******* 公開変数,定数 *********


// ******* Package公開変数 *********

    // --------SQL情報  -------------
    String    Table_Name;           // テーブル名
    String    Table_Name_Comment;   // テーブル名コメント
    String    Table_Name_Alias;     // テーブル名別名
    String    Column_Name;          // カラム名
    String    Column_Name_Comment;  // カラム名コメント
    String    Column_Name_Alias;    // カラム名別名
    int       Column_Type;          // カラムのＳＱＬ型(java.sql.Types)
    String    Column_Type_Ora;      // カラムの属性(ORACLE DATA_TYPE)
    int       Column_Asflag;		// テーブル名指定区分
    int       Cond_Type;            //抽出条件（比較演算子）
    String    Cond_Value1;          //抽出条件値 from
    String    Cond_Value2;          //抽出条件値 to
    boolean   Display_Flg;          //表示区分
    int       Sort_Type;            //ソート種類（1:昇順、2:降順）
    int       Sort_No;              //ソートキー順


// ******* 非公開定数・変数 *********


// ********  コンストラクタ **************
    /**
      * 
      * コンストラクタ<br>
      *
      * @param xx
      * @see #xxxxx
      */
    AZ0040ColumnInfo() {
        //値保持領域の初期化
        clear();
    }

//------------------------------------------------------------------
//  公開関数
//------------------------------------------------------------------
    // *********  値取得用メソッド*********************
    public final String  getTable_Name() {           // テーブル名
        return Table_Name;
    }


    public final String getTable_Name_Comment() {    // テーブル名コメント
        return Table_Name_Comment;
    }

    public final String getTable_Name_Alias() {    // テーブル名別名
        return Table_Name_Alias;
    }

    public final String getColumn_Name() {// カラム名
        return Column_Name;
    }

    public final String getColumn_Name_Comment() {// カラム名コメント
        return Column_Name_Comment;
    }

    public final String getColumn_Name_Alias() {// カラム名別名
        return Column_Name_Alias;
    }

    public final int getColumn_Type() {  // カラムのＳＱＬ型(java.sql.Types)
        return Column_Type;
    }

    public final String getColumn_Type_Ora() {  // カラム属性(ORACLE DATA_TYPE)
        return Column_Type_Ora;
    }

    public final int getCond_Type() {//抽出条件（比較演算子）
        return Cond_Type;
    }
    public final String getCond_Value1() { //抽出条件値 from
        return Cond_Value1;
    }

    public final String getCond_Value2() { //抽出条件値 to
        return Cond_Value2;
    }

    public final boolean getDisplay_Flg() {//表示区分
        return Display_Flg;
    }

    public final int getSort_Type() {//ソート種類（1:昇順、2:降順）
        return Sort_Type;
    }

    public final int getSort_No() {  //ソートキー順
        return Sort_No;
    }


    // *********  値設定用メソッド*********************

    public final void  setTable_Name(String w_value) {           // テーブル名
        Table_Name = w_value;
    }

    public final void setTable_Name_Comment(String w_value) {// テーブル名コメント
        Table_Name_Comment = w_value; 
    }

    public final void  setTable_Name_Alias(String w_value) {// テーブル名別名
        Table_Name_Alias = w_value;
    }

    public final void setColumn_Name(String w_value) {// カラム名
        Column_Name = w_value; 
    }

    public final void setColumn_Name_Comment(String w_value) {//カラム名コメント
        Column_Name_Comment = w_value;
    }

    public final void setColumn_Type(int w_value) {  // カラムのＳＱＬ型(java.sql.Types)
        Column_Type = w_value;
    }

    public final void setColumn_Type_Ora(String w_value) {  // カラム属性(ORACLE DATA_TYPE)
        Column_Type_Ora = w_value;
    }

    public final void setColumn_Asflag(int w_value) {  // テーブル名指定区分
        Column_Asflag = w_value;
    }

    public final void setCond_Type(int w_value) {//抽出条件（比較演算子）
        Cond_Type = w_value; 
    }
    public final void setCond_Value1(String w_value) { //抽出条件値 from
        Cond_Value1 = w_value;;
    }

    public final void setCond_Value2(String w_value) { //抽出条件値 to
        Cond_Value2 = w_value;
    }

    public final void setDisplay_Flg(boolean w_value) {//表示区分
        Display_Flg = w_value;
    }

    public final void setSort_Type(int w_value) {//ソート種類（1:昇順、2:降順）
        Sort_Type = w_value;
    }

    public final void setSort_No(int w_value) {  //ソートキー順
        Sort_No = w_value;
    }

	//引数で指定されたColumnInfoの情報を、自インスタンスに格納する。(実コピー用メソッド）
	public final void setColumnInfo(AZ0040ColumnInfo i_info) {
    	Table_Name          = i_info.Table_Name;           // テーブル名
    	Table_Name_Comment  = i_info.Table_Name_Comment;   // テーブル名コメント
        Table_Name_Alias    = i_info.Table_Name_Alias;     // テーブル名別名
        Column_Name         = i_info.Column_Name;          // カラム名
        Column_Name_Comment = i_info.Column_Name_Comment;  // カラム名コメント
        Column_Name_Alias   = i_info.Column_Name_Alias;    // カラム名別名
        Column_Type         = i_info.Column_Type;          // カラムのＳＱＬ型(java.sql.Types)
        Column_Type_Ora     = i_info.Column_Type_Ora;      // カラムの属性(ORACLE DATA_TYPE)
        Column_Asflag       = i_info.Column_Asflag;		// テーブル名指定区分
        Cond_Type           = i_info.Cond_Type;            //抽出条件（比較演算子）
        Cond_Value1         = i_info.Cond_Value1;          //抽出条件値 from
        Cond_Value2         = i_info.Cond_Value2;          //抽出条件値 to
        Display_Flg         = i_info.Display_Flg;          //表示区分
        Sort_Type           = i_info.Sort_Type;            //ソート種類（1:昇順、2:降順）
        Sort_No             = i_info.Sort_No;              //ソートキー順
	}

    //-------------------------------------------------------------------
    //  非公開メソッド
    //-------------------------------------------------------------------

    /**
      * 値保持用領域のクリア。
      */
    private void clear() {
	    Table_Name = null;           // テーブル名
    	Table_Name_Comment = null;   // テーブル名コメント
    	Table_Name_Alias = null;   // テーブル名別名
    	Column_Name = null;          // カラム名
    	Column_Name_Comment = null;  // カラム名コメント
    	Column_Name_Alias = null;   // カラム名別名
    	Column_Type = 0;          // カラムのＳＱＬ型(java.sql.Types)
        Column_Type_Ora = null;      // カラムの属性(ORACLE DATA_TYPE)
        Column_Asflag = C_AS_NONE;			// テーブル名指定区分
    	Cond_Type = 0;            //抽出条件（比較演算子）
    	Cond_Value1 = null;          //抽出条件値 from
    	Cond_Value2 = null;          //抽出条件値 to
    	Display_Flg = true;          //表示区分
    	Sort_Type = 0;            //ソート種類（1:昇順、2:降順）
    	Sort_No = 0;              //ソートキー順
    }

}

