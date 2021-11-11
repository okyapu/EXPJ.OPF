/**
 * <p>タイトル: EXPJ共通クラス</p>
 * <p>説明: EXPJ共通チェックメソッド</p>
 * <p>著作権: Copyright (c) 2003</p>
 * <p>会社名: NIS</p>
 * @author NIS
 * @version 1.0
 *
 * 2003/07/29 西藤 作成
 * 2003/11/13 y.takematsu EXPJシステム利用の為、パッケージ名変更
 */

package com.nec.jp.orteus.metamorBase.common06.util;

public class formatCheck{

	/**
	 * 日付形式チェック("YYYY/MM/DD"形式)
	 * @param 日付（文字型）
	 * @return 日付形式が正しければtrue,誤っていればfalse
	 */
	static public boolean isDateFormat(String dateString) {
        // 未入力チェック
        if ( dateString == null || dateString.length() == 0 ){
			return false;
		}
        // 桁数チェック
		if ( stringUtil.getByteLength(dateString) != 10 ){
			return false;
		}
        // ２バイト文字チェック
		if ( stringUtil.has2Byte(dateString) == true ){
			return false;
		}

        boolean iflag = false;
        try{
            // 年月日抽出
            String year = dateString.substring(0,4);
			String month = dateString.substring(5,7);
			String day = dateString.substring(8,10);

            // 数値変換
            int iyear = Integer.parseInt(year);
			int imonth = Integer.parseInt(month);
			int iday = Integer.parseInt(day);

            // 年月範囲
            if ( ( 1900 < iyear && 2100 > iyear ) && ( imonth <= 12 && imonth >= 1 ) ){
                // 31日までの月
                if ( imonth == 1 || imonth == 3 || imonth == 5 || imonth == 7 || imonth == 8 || imonth == 10 || imonth == 12 ){
                    if ( iday >= 1 && iday <= 31 ){
                        iflag = true;
					}
                }
                // 30日までの月
                else if ( imonth != 2 ){
					if ( iday >= 1 && iday <= 30 ){
						iflag = true ;
					}
				}
                // 2月
                else{
					int imax = 28;
                    // うるう年
					if ( iyear % 4 == 0 ){
						if ( iyear % 100 != 0 ){
							imax=29;
						}else if ( iyear % 400 == 0 ){
							imax=29;
						}else{
							imax=28;
						}
					}else{
						imax = 28;
					}
					if ( iday >= 1 && iday <= imax ){
						iflag = true;
					}
				}
			}

		}catch(NumberFormatException n){
			return false;
		}
		return iflag;
	}

	/**
	 * 数値形式チェック
	 * @param チェックする数値
	 * @return 数値形式が正しければtrue, 誤っていればfalse
	 */
	static public boolean isNumberFormat(String val) {
        // 未入力チェック
		if ( val == null || val.length() == 0 ){
			return false;
		}

		double d;
		Double dD;
		boolean iflag = true;

		try {
            // 数値変換
			dD = Double.valueOf(val);
            // 先頭文字
			if ( val.charAt(0) == '.' ) {
				return false;
			}
		}
        catch (NumberFormatException n) {
		    iflag = false;
		}
		return iflag;
	}

    /**
     * 数値形式チェック(指定形式)
     * @param val チェックする数値
     * @param i   チェックする整数部桁数（以内）
     * @param m   チェックする小数部桁数（以内）
     * @return 数値形式が正しければtrue, 誤っていればfalse
     */
    static public boolean isNumberFormat(String val, int i, int m) {
        // 未入力チェック
        if ( val == null || val.length() == 0 ){
            return false;
        }
        // 先頭文字チェック
        if ( val.charAt(0) == '.' ){
            return false;
        }

        // 使用許可文字
        String chkRealNum="0123456789.-";

        // 数値変換
        try{
            Double chkD = Double.valueOf(val);
        }
        catch (NumberFormatException n) {
            return false;
        }

        // 文字チェック
        for (int x = 0; x < val.length(); x++) {
            boolean chkflg = false;
            for (int y = 0; y < chkRealNum.length(); y++ ){
                if (val.charAt(x) == chkRealNum.charAt(y)){
                    chkflg = true;
                    break;
                }
            }
            if (!chkflg){
                // 不正文字使用
                return false;
            }
        }

        //桁数チェック
        int idx=0;
        boolean hasdot = false;
        for( int x = 0; x < val.length()-1; x++ ){
            if ( val.charAt(x) == '.' ){
                hasdot = true;
                idx = x;
                // 小数桁数
                if (val.length()-(x+1) > m) {
                    return false;
                }
                break;
            }
        }

        boolean mflg = false;
        if ( val.length() > 1 && val.charAt(0) == '-' ){
            // マイナス値
            val = val.substring(1, val.length());
            mflg = true;
            idx--;
        }
        //整数部桁数
        if (hasdot == true){
            if (idx > i) {
                return false;
            }
        }else{
            if (val.length() > i){
                return false;
            }
        }
        return true;
    }

    /**
     * 数値形式チェック（小数点以下２桁以内）
     * @param チェックする数値
     * @return 数値形式が正しければtrue, 誤っていればfalse
     */
    static public boolean isNumberFormat2(String val) {
        // 未入力チェック
		if ( val == null || val.length() == 0 ) {
			return false;
		}

        double d;
        Double dD;
        int idx=0;
        boolean iflag = true;

		try {
            // 数値変換
            dD = Double.valueOf(val);
            // 先頭文字
            if ( val.charAt(0) == '.' ){
                return false;
            }
            // 小数点以下桁数
            for (int x = 0; x < val.length()-1; x++){
                if ( val.charAt(x) == '.' ){// .発見
                    idx = x;
                    if (val.length()-(x+1) > 2){
                        iflag = false;
                    }
                    break;
                }
            }
		}
        catch (NumberFormatException n) {
			return false;
		}
		return true;
	}
}