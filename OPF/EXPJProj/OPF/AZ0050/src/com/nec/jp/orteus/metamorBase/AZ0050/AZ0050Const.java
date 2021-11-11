//------------------------------------------------------------------------------
/**
 * CLASS     : AZ0050Const クラス
 * ファイル・クラス説明
 * @author $Author: suganuma $
 * @version $Revision: 1.3 $ $Date: 2010/04/12 00:18:39 $
 *
 */
//-----------------------------------------------------------------------------
package com.nec.jp.orteus.metamorBase.AZ0050;



/**
 * AZ0050共通 定数定義インタフェースクラス
 * @author  Y.Hashimoto
 * @version 1.00
 * @see 
 */
public interface AZ0050Const
{
// ******* 公開変数,定数 *********

    /**  カラム属性(ORACLE) ****/
    public static final String C_VARCHAR = "VARCHAR2";   //VARCHAR2
    public static final String C_NUMBER = "NUMBER";   //VARCHAR2
    public static final String C_DATE = "DATE";   //VARCHAR2

    /** 種別指定なし */
    public static final int C_NONE = 0; // なし

    /** ソート種別 */
    public static final int C_ASC = 1;   //昇順
    public static final int C_DESC = 2;  //降順

    /** select句 におけるテーブル名指定区分 */
    public static final int C_AS_NONE = 1;   //テーブル名指定なし
    public static final int C_AS_TB = 2;     //テーブル名指定
    public static final int C_AS_ALIAS = 3;  //テーブル名別名指定

    //WHERE条件の種類(結合条件、比較条件)
    public static final String C_JOIN_EQUAL = "="; //テーブル結合条件(inner join)
    public static final String C_LEFT_JOIN  = "left"; //テーブル結合条件(left outer join)
    public static final String C_RIGHT_JOIN = "right"; //テーブル結合条件(right outer join)

    /** WHERE句の比較条件式(解析用) */
    /*  解析ロジックへの影響があるため、順番をかえてはいけないyo！ */
    public static final String[] COMP_STR =
            {"!=","<=",">=","=",">","<",
             " LIKE "," BETWEEN "," IN ",
             "IS NULL","IS NOT NULL"};

    /** WHERE句の比較条件式(画面用) */
    public static final String[] COMP_STR_DISP =
            {" ","LIKE","=","!=","<=",">=","<",">",
             "BETWEEN","IN",
             "IS NULL","IS NOT NULL"};

    public final static int C_LIKE    = 1;    // like 
    public final static int C_EQ      = 2;    // = 
    public final static int C_NE      = 3;    // != 
    public final static int C_LT      = 4;    // <= 
    public final static int C_GT      = 5;    // >= 
    public final static int C_LS      = 6;    // < 
    public final static int C_GR      = 7;    // > 
    public final static int C_RANG    = 8;    // between
    public final static int C_IN      = 9;    // in 
    public final static int C_ISNULL  = 10;   // is null 
    public final static int C_NOTNULL = 11;   // is not null 
    //****************
    
    //  業務処理モード */
    /** 参照モード (DB更新なし) */
    public final static String C_PROCESS_REF = new String("REF");
    /** 更新モード (DB更新あり) */
    public final static String C_PROCESS_UPD = new String("UPD");
    /** 追加モード (DB更新あり) */
    public final static String C_PROCESS_INS = new String("INS");
    /** 複写モード (DB更新あり) */
    public final static String C_PROCESS_COPY = new String("COPY");

    //  入力モード */
    /** GUIモード */
    public final static int C_INPUT_GUI = 0;
    /** フリーモード */
    public final static int C_INPUT_FREE = 1;
}
