package com.nec.jp.orteus.expj.util;

import java.text.StringCharacterIterator;
import java.text.CharacterIterator;
import java.text.SimpleDateFormat;
import com.nec.jp.orteus.expj.combobox.*;

/**
 * CSV取込の共通チェック方法
 * 数値チェック、日付チェック、禁則文字チェックなど
 *
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.1 $ $Date: 2015/10/23 10:08:30 $
*/
public class CsvInCheck {
	/**
	 *   文字列長さチェック
	 *   
	 *   @param    strInString  入力パラメータ
	 *   @return 正常:true / エラー:false
	 */
    public static int strLengthChk(String strInput) {
    	int intLen = 0;
        try {
             byte[] bytstr = strInput.getBytes("SJIS");
             intLen = bytstr.length;
        } catch( Exception e ) {	
        	 return  0;
        }
        return intLen;
    }
    
    /**
     * 禁則文字チェック(「_」 「"」「\」)
     * @param str  文字列
     * @return     「_」: 1
     *             「"」: 2
     *             「\」: 3
     *            その他: 0
     */
    public static boolean chkHankaku(String str) {
		CharacterIterator iter = new StringCharacterIterator(str);
		for (char c = iter.first(); c != CharacterIterator.DONE; c = iter.next()) {
			// 「%」 0x0025
			if (c == 0x0025) {
				// 禁則文字!
				return true;
			}
			// 「\」 0x005C
			if (c == 0x005C) {
				// 禁則文字!
				return true;
			}
			// 「_」 0x005F
			if (c == 0x005F) {
				// 禁則文字!
				return true;
			}
		}
		return false;
	}
    
    /**
     * メールアドレスの禁則文字チェック(「\」)
     * @param str  文字列
     * @return     true or false
     */
    public static boolean chkEmail(String str) {
		CharacterIterator iter = new StringCharacterIterator(str);
		for (char c = iter.first(); c != CharacterIterator.DONE; c = iter.next()) {
			// 「\」 0x005C
			if (c == 0x005C) {
				// 禁則文字!
				return true;
			}
		}
		return false;
	}
    
    /**
     * 数値、ハイフンのチェック(電話番号,FAX番号)
     * @param str  文字列
     * @return     true or false
     */
    public static boolean chkTelOrFax(String dataStr) {
		if (!isNull(dataStr)) {
			return dataStr.matches("^([0-9]*[-]*)+$");
		}
		return false;
	}
    
    /**
   	 * 日期のチェック
   	 * 
   	 * @param dataSource String
   	 * 
   	 * @return true or false boolean trueの場合　日期です、　falseの場合、日期ではない
   	 */
    public static boolean checkDate(String dataSource) {
   		String flag = "";
   		if (dataSource.matches("^^\\d{4}\\/\\d{2}\\/\\d{2}$")) {
   			flag = "true";

   		} else if (dataSource.matches("^^\\d{4}\\/\\d{1}\\/\\d{1}$")) {
   			flag = "true";

   		} else if (dataSource.matches("^^\\d{4}\\/\\d{2}\\/\\d{1}$")) {
   			flag = "true";

   		} else if (dataSource.matches("^^\\d{4}\\/\\d{1}\\/\\d{2}$")) {
   			flag = "true";
   		} else {
   			flag = "false";
   		}
   		if ("true".equals(flag)) {
   			try {
   				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
   				dateFormat.setLenient(false);
   				dateFormat.parse(dataSource);
   				return true;
   			} catch (Exception e) {
   				return false;
   			}
   		} else {
   			return false;
   		}
   	}
   	
   	/**
	 * コンボボックスデータから表示説明を取得する
	 * 
	 * @param combo
	 *            コンボボックスデータ
	 * @param value
	 *            コンボボックスデータの値
	 * @return コンボボックスデータの表示説明
	 */
    public static String getDisplayName(ComboStruct combo, String value) {
		for (int j = 0; j < combo.size(); j++) {
			if ((combo.getData(j)[0]).equals(value)) {
				return combo.getData(j)[1];
			}
		}
		return null;
	}
	
	/**
	 * コンボボックスデータの存在チェック
	 * 
	 * @param combo
	 *            コンボボックスデータ
	 * @param value
	 *            コンボボックスデータの値
	 * @return コンボボックスデータ存在場合戻値true,存在しない場合戻値false
	 */
    public static boolean chkValue(ComboStruct combo, String value) {
		for (int j = 0; j < combo.size(); j++) {
			if (value.equals((combo.getData(j)[0]))) {
				return true;
			}
		}
		return false;
	}
	
	/**
     *   整数チェック
     *   項目が整数か判断する
     *
     *   @param  strInString  入力パラメータ
     *   @return 正常:true / エラー:false
     */
    public static boolean isIntegerChk(String strInString) {
        // 整数のinputをセット用
    	try {
    	     Integer.parseInt(strInString);
        } catch(Exception e) {
             // 整数ではない場合Exceptionに飛ばして処理
             // falseをセットして処理を抜ける(エラー：数値以外の入力)
             return false;
        }
        // trueをセットして処理を抜ける(正常終了)
        return true;
    }
    
    /**
     *   数値チェック
     *   項目が数値か判断する
     *
     *   @param  strInString  入力パラメータ
     *   @return 正常:true / エラー:false
     */
    public static boolean IsNumChk(String strInString) {
        // 数値のinputをセット用
		try {
			Double.parseDouble(strInString);
		} catch (Exception e) {
			// 数値ではない場合Exceptionに飛ばして処理
			// falseをセットして処理を抜ける(エラー：数値以外の入力)
			return false;
		}
		if (strInString.indexOf('d') != -1 || strInString.indexOf('D') != -1
				|| strInString.indexOf('f') != -1
				|| strInString.indexOf('F') != -1) {
			return false;
		}
		// trueをセットして処理を抜ける(正常終了)
		return true;
    }
    
    /**
     * 数値範囲チェック
     * @param strInString 数値
     * @param integerSize 整数位数
     * @param decimalSize 小数位数
     * @return 正常:true / エラー:false
     */
    public static boolean isNotInNumRange(String strInString, int integerSize, int decimalSize) {
    	String strInputString = null;
		// マイナスの場合
		if (strInString.indexOf("-") == 0) {
			strInputString = strInString.substring(1);
		} else {
			// 正数の場合
			strInputString = strInString;
		}
		int toneFlg = strInputString.indexOf('.');
		if (toneFlg == -1) {
			// 整数の場合
			if (strInputString.length() > integerSize) {
				return false;
			}
		} else {
			if (decimalSize == 0 && toneFlg == integerSize) {
				return false;
			}
			if (strInputString.length() > decimalSize + integerSize + 1) {
				return false;
			}
			// 整数
			String zhstr = strInputString.substring(0, toneFlg);
			// 小数
			String xistr = strInputString.substring(toneFlg + 1, strInputString.length());
			if (zhstr.length() > integerSize || xistr.length() > decimalSize) {
				return false;
			}
		}
		return true;
    }
    
    /**
     * 対象の文字列がNull（空文字あるいはNull）であるかを判定します。
     * @param str 対象文字列
     * @return Nullの場合はtrue、Nullではない場合はfalse
     */
    public static boolean isNull(String str) {
		if (str == null || str.length() == 0 || str.equalsIgnoreCase("null")
				|| str == "") {
			return true;
		}
		return false;
	}
	
	/**
	 * 半角英数のチェック
	 * 
	 * @param dataStr String
	 * 
	 * @return true or false boolean 
	 *         trueの場合 半角英数
	 *         falseの場合 半角英数ではない
	 */
    public static boolean checkCharater(String dataStr) {
		return dataStr.matches("^[\\x21-\\x7e]+$");
	}
    
    /**
     * 文字(\)変換、「\」なら、「\」を直前に追加する
     * @param in  文字列
     * @return    編集後文字列
     */
    public static String replaceSlash(String in) {
        if(in == null)
            return null;
        StringBuffer buffer = new StringBuffer(in.length()*2);
        for(int i=0;i<in.length();i++) {
            char c = in.charAt(i);
            if(c == '\\')
                buffer.append("\\\\");
            else
                buffer.append(c);
        }
        return buffer.toString();
    }
}
