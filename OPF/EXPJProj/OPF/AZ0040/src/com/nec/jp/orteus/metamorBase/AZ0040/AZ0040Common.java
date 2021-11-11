//------------------------------------------------------------------------------
/**
 * CLASS     : AZ0040SQLEdit クラス
 * ファイル・クラス説明
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.5 $ $Date: 2017/01/09 08:54:38 $
 *
 */
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.AZ0040;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import org.apache.commons.lang.StringUtils;

/**
 * AZ0040共通モジュール
 */
public class AZ0040Common
{
	
	public static final String DATE_FORMAT = "YYYY/MM/DD HH24:MI:SS";
	
	//--------------------------------------------------------------------------
	// 操作
	
	/**
	 * クエリ使用可能テーブルを取得する
	 *
	 * @param conn DBとのコネクション
	 * @return クエリ使用可能テーブル
	 */
	public final static ArrayList GetUsefulTable(IDbConnection conn) throws SQLException
	{
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList Table = new ArrayList();
		
		String sql = "select TABLE_NAME  from user_tables";

		// SQL文生成
		stmt = (conn.getConn()).prepareStatement(sql);
		
		// SQLの実行
		rs = stmt.executeQuery();
		
		while(rs.next())
		{
			Table.add(rs.getString(1));
		}
		
		// プリペアドステートメントを閉じる
		stmt.close();
		
		// リザルトセットを閉じる
		rs.close();
		
		// 結果の返却
		return Table;
	}
	
	/**
	 * フリーで入力されたSQL文内に使用不可文字列がないか<br>
	 * チェックを行う
	 *
	 * @param strSql フリー入力で記述されたSQL
	 * @return treu/false
	 */
	public final static boolean checkFreeSqlStr(String strSql)
	{
		int size = 0;
		int i = 0;
		List temp_list = new ArrayList();
		
		// スペースで分割する
		StringTokenizer st = new StringTokenizer(strSql, " ");
		size = st.countTokens();
		for (i=0; i<size; i++)
		{
			temp_list.add(st.nextToken().trim());
		}
		
		// SQL内に使用不可の文字列があるかチェック
		for(i=0; i<temp_list.size(); i++)
		{
			String buffer = (String)temp_list.get(i);

			if(buffer.compareToIgnoreCase("UPDATE") == 0 ||
			   buffer.compareToIgnoreCase("INSERT") == 0 ||
			   buffer.compareToIgnoreCase("DELETE") == 0   )
			{
				return false;
			}
		}

		return true;
	}

    /**
    *   VARCHAR型項目のSQL書式を、値に変換します。
    *  ('' を取り除く)
    *
    *
    *
    */
	public final static String UnescapeSQL(String i_str) {

		//カンマ区切り
        String[] w_str = StringUtils.split(i_str, ",");
		List w_str_o = new ArrayList(w_str.length);
		for (int i=0; i<w_str.length; i++) {
			//各値の、''を削除(一番外側の''のペアを取り除く)
			w_str_o.add(StringUtils.strip(w_str[i], "'")); 
		}
		Iterator itr = w_str_o.iterator();
		String w_unescape = StringUtils.join(itr, ",");
		return w_unescape;
	}

    /**
    *   VARCHAR型項目の値をSQL書式に変換します。
    *  ('' をつける)
    *
    *
    *
    */
	public final static String EscapeSQL(String i_str) {

		//カンマ区切り
        String[] w_str = StringUtils.split(i_str, ",");

		List w_str_o = new ArrayList(w_str.length);

		for (int i=0; i<w_str.length; i++) {
			//各値の最初と最後に、''をつける
			w_str_o.add("'" + w_str[i] + "'"); 
		}
        Iterator itr = w_str_o.iterator();
		String w_escape = StringUtils.join(itr, ",");
		return w_escape;
	}
	
    /**
    *   DATE型項目のSQL書式を、値に変換します。
    *  (TO_DATE を取り除く)
    *
    *
    *
    */
	public final static String UnescapeSQL_Date(String i_str) {

		String val;
		String[] w_str = null;
		//カンマ区切り
		// 時間管理場合
		if(i_str.indexOf("))") != -1) {
			w_str = StringUtils.split(i_str, "))");
		} else {
			w_str = StringUtils.split(i_str, ")");
		}
		List w_str_o = new ArrayList(w_str.length);
		for (int i=0; i<w_str.length; i++) {
			val = StringUtils.stripStart(w_str[i], ",");
			if(val.indexOf("TRUNC(TO_DATE(") != -1) {
				val = StringUtils.stripStart(val, "TRUNC(TO_DATE(");
			} else {
				val = StringUtils.stripStart(val, "TO_DATE(");
			}
			String sDate = val.substring(0, val.indexOf(",")).trim();

			//各値の、日付部分を抜きだす
			w_str_o.add(StringUtils.strip(sDate, "'"));
		}
		Iterator itr = w_str_o.iterator();
		String w_unescape = StringUtils.join(itr, ",");
		return w_unescape;
	}

    /**
    *   DATE型項目の値をSQL書式に変換します。
    *  (TO_DATE をつける)
    *
    *
    *
    */
	public final static String EscapeSQL_Date(String i_str) {

		//カンマ区切り
        String[] w_str = StringUtils.split(i_str, ",");

		List w_str_o = new ArrayList(w_str.length);

		for (int i=0; i<w_str.length; i++) {
			//各値にTO_DATEをつける
			w_str_o.add("TO_DATE('" + w_str[i] + "', '" + DATE_FORMAT + "')");
		}
        Iterator itr = w_str_o.iterator();
		String w_escape = StringUtils.join(itr, ",");
		return w_escape;
	}


    // SQL特殊文字変換メソッド
    /**
     *  文字列をSQLの文字リテラルとして使用するために、
     *  特殊文字()をエスケープして返却します。
     *  <pre>
     *  エスケープする文字は、'(シングルクオート)です。
     *  </pre>
     *
     * @param    i_str       変換前文字列
     * @return   (String)    変換後文字列
     */
    public static String toSqlString(String i_str) {

		//変換したい文字の指定（複数指定可能）
        /** SQL特殊文字変換前 */
        String SPECIAL_CHAR[] = {"'"};

        /** SQL特殊文字変換後 */
        String REPLACE_CHAR[] = {"''"};

        // 置換対象領域
        StringBuffer w_stringBuffer = null;
        int          w_notCheckedLength = 0;
        int          w_specialCharNo = SPECIAL_CHAR.length;

        // 文字操作ワーク
        String w_string        = null;
        int    w_index = 0;
        int    w_start = 0;

        if (i_str == null) {
            w_stringBuffer = new StringBuffer(null);
        } else {
            // 初期化
            w_stringBuffer = new StringBuffer(i_str);

            // チェック
            for (int charNo=0; charNo<w_specialCharNo; charNo++) {
                // 文字の長さ取得
                w_notCheckedLength = w_stringBuffer.length();
                w_start            = 0;

                // 文字の末端まで検査
                while(w_notCheckedLength > 0) {
                    w_string = w_stringBuffer.substring(w_start);
                    w_index = w_string.indexOf(SPECIAL_CHAR[charNo]);
                    if (w_index == -1) {
                        break;
                    } else {
                        w_notCheckedLength -= (w_index + 1);
                        w_start += w_index;
                        w_stringBuffer.replace(w_start,
                                               w_start+1,
                                               REPLACE_CHAR[charNo]);
                        w_start += REPLACE_CHAR[charNo].length();
                    }
                }
            }
        }
        return w_stringBuffer.toString();
    }

}