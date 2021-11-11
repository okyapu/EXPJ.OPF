/**
 * <p>タイトル: EXPJ共通クラス</p>
 * <p>説明: EXPJ共通数値関連メソッド</p>
 * <p>著作権: Copyright (c) 2003</p>
 * <p>会社名: NIS</p>
 * @author NIS
 * @version 1.0
 *
 * 2003/07/29 西藤 作成
 * 2003/11/13 y.takematsu EXPJシステム利用の為、パッケージ名変更
 * 2004/01/24 カンマ付き処理変更(.X対応)
 * 2004/02/09 カンマ付き処理変更(-.X対応)
 */

package com.nec.jp.orteus.metamorBase.common06.util;

import java.math.BigDecimal;

public class numberUtil {

    /**
     * 四捨五入
     * @param val 四捨五入する数値文字列(カンマ付きは不可)
     * @param i    四者五入する小数点以下の位（整数にする場合は０）
     * @return valの小数点下i桁で四捨五入した数値,失敗した場合には""を返す
     */
    static public String roundNumber(String val, int i){
        try{
            BigDecimal bd = new BigDecimal(val);
            BigDecimal bd2 = bd.setScale(i, BigDecimal.ROUND_HALF_UP);
            return bd2.toString();
        }catch(Exception e){
            return "";
        }
    }

    /**
     * 文字列の頭に'0'を付加
     * @param val  元の文字列(1byte文字列のみ)
     * @param imax 総桁数(valで指定した文字列がimax桁以上の桁数の場合はval文字列がそのまま返る)
     * @return valの頭に'0'を付加した文字列
     */
    static public String addZero(String val, int imax) {
        String rtn = "";
        if (val.length() >= imax){
            return val;
        }
        for (int x=0; x < imax - val.length(); x++){
            rtn = rtn + "0";
        }
        rtn = rtn + val;
        return rtn;
    }

    /**
     * カンマ付き数値文字列をカンマなし数値文字列に変換
     * @param val カンマ付き数値文字列
     * @return 数値文字列 失敗時には""(空文字)を返す
     */
    static public String decodeNumberFormat(String val) {
        // 未入力チェック
        if ( val == null || val.length() == 0 ){
            return "";
        }
        // 先頭文字チェック
        if ( val.charAt(0) == '.' ){
            return "";
        }

        // 使用許可文字
        String chkRealNum="0123456789.-";

        boolean hasComma = false;
        String conv="";

        try{
            //数値チェック
            for (int x = 0; x < val.length(); x++) {
                boolean chkflg = false;
                for (int y=0; y < chkRealNum.length(); y++) {
                    if (val.charAt(x) == chkRealNum.charAt(y)) {
                        chkflg = true;
                        break;
                    }
                    else if (val.charAt(x)==',') {
                        hasComma=true;
                        chkflg = true;
                        break;
                    }
                }
                if (chkflg != true){
                    // 形式不正
                    return "";
                }
            }

            // 小数点確認
            boolean fg = false;
            int x = 0;
            for (x = 0; x< val.length(); x++) {
                if (val.charAt(x) == '.') {
                    fg = true;
                    break;
                }
            }

            // 整数・少数抽出
            String seisu = val.substring(0,x);
            String syosu = "";
            if (fg == true){
                syosu = val.substring(x, val.length());
            }

            // 整数部一桁目チェック
            boolean mflg = false;
            if ( seisu.charAt(0) == '-' ){
                mflg = true;
                seisu=seisu.substring(1, seisu.length());
            }

            // カンマチェック＆除去
            if (hasComma == true){
                int lop = 0;
                for (x = seisu.length()-1; x >= 0; x--) {
                    if (lop == 3){
                        if (seisu.charAt(x) == ',' && x != 0){
                        }
                        else {
                            return "";
                        }
                        lop = 0;
                    }
                    else {
                        conv = seisu.charAt(x) + conv;
                        lop++;
                    }
                }
            }
            else {
                conv = seisu;
            }
            conv=conv + syosu;

            if ( mflg == true ){
                conv = "-" + conv;
            }

            // 数値変換
            Double dData = Double.valueOf(conv);
        }catch(Exception e){
            return "";
        }
        return conv;
    }

    /**
     * 数値文字列をカンマ付き数値文字列に変換
     * @param val 数値文字列（カンマなし）
     * @return カンマ付き数値文字列 失敗時には""(空文字)
     */
    static public String encodeNumberFormat(String val){
        // 数値変換
        try{
            Double dData = Double.valueOf(val);
        }
        catch(Exception e){
            return "";
        }

        // 先頭文字チェック
        if ( val.charAt(0) == '.' ){
            // 2004/01/24 0を付けて戻る
            //return "";
            return "0"+val;
        }
        // 2004/02/09 マイナス値に0を付けて戻る
        if ( val.charAt(0) == '-' && val.charAt(1) == '.' ){
            return "-0"+val.substring(1, val.length());
        }

        // 使用許可文字
        String chkRealNum="0123456789.-";

        //数値チェック
        for (int x=0; x < val.length(); x++) {
            boolean chkflg = false;
            for (int y=0; y < chkRealNum.length(); y++) {
                if (val.charAt(x) == chkRealNum.charAt(y)){
                    chkflg = true;
                    break;
                }
            }
            if (chkflg != true) {
                // 形式不正
                return "";
            }
        }

        // 小数点確認
        boolean fg = false;
        int x = 0;
        for (x = 0; x< val.length(); x++) {
            if (val.charAt(x) == '.') {
                fg = true;
                break;
            }
        }

        // 整数・少数抽出
        String seisu = val.substring(0,x);
        String syosu = null;
        if ( fg == true ){
            syosu=val.substring(x, val.length());
        }
        if ( seisu.length() == 0 ){
            return "";
        }

        // 整数部一桁目チェック
        boolean mflg = false;
        if (seisu.charAt(0) == '-'){
            mflg = true;
            seisu=seisu.substring(1,seisu.length());
        }
        if (seisu.length() <= 3){
            return val;
        }

        int lop = 0;
        String ret = "";
        for (x=seisu.length()-1; x >= 0; x--) {
            if (lop == 3){
                ret = seisu.charAt(x) + "," + ret;
                lop = 0;
            }
            else{
                ret = seisu.charAt(x) + ret;
            }
            lop++;
        }
        if (mflg == true) {
            ret = "-" + ret;
        }
        if (fg == true){
            ret = ret + syosu;
        }
        return ret;
    }
}