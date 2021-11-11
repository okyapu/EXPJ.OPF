/**
 * <p>タイトル: EXPJ共通クラス</p>
 * <p>説明: EXPJ共通文字列関連メソッド</p>
 * <p>著作権: Copyright (c) 2003</p>
 * <p>会社名: NIS</p>
 * @author NIS
 * @version 1.0
 *
 * 2003/07/29 西藤 作成
 * 2003/11/13 y.takematsu EXPJシステム利用の為、パッケージ名変更
 */

package com.nec.jp.orteus.metamorBase.common06.util;

import java.io.StringReader;
import java.io.StringWriter;
import java.io.IOException;

public class stringUtil {

    /**
     * 文字列長(Byte)を取得します
     * @param Val 文字列
     * @return Valの長さ(byte)
     */
    static public int getByteLength(String val) {
        // 未入力
        if ( val == null || val.length() == 0 ){
            return 0;
        }
        byte[] bLen = val.getBytes();
        return bLen.length;
    }

    /**
     * 2byte文字有無チェック
     * @param Val 文字列
     * @return true:2byte混在 false:1byteのみ
     */
    static public boolean has2Byte(String Val) {
        if (Val == null){
            return false;
        }
        if (Val.length() != getByteLength(Val)) {
            return true;
        }
        return false;
    }

    /**
     * 文字列の一部を指定したバイト数分に切り出す処理
     * 文字が途中で分断される場合は、その文字を省き 半角スペースに置き換え
     *
     * @param str 対象文字列
     * @param beginIndex 開始位置 (先頭0)
     * @param len 取得バイト数
     * @return 指定したバイト数にカットした部分文字列
     */
    public static String stringSlice(String str, int beginIndex, int len) {
        // 未入力
        if (null == str) {
            return null;
        }
        // バイト数0
        if (len <= 0) {
            return "";
        }

        try{
            StringReader reader = new StringReader(str);
            StringWriter writer = new StringWriter();
            int iTotalLength = 0;

            // 開始位置移動
            for (int iCurrentLength = 0; iCurrentLength < beginIndex; ) {
                // １文字ずつ読込
                int iRead = reader.read();
                // ストリームエンド（-1）
                if (iRead < 0) {
                    // 開始位置以下
                    return "";
                }

                if (isDoubleByte(iRead)) {
                    iCurrentLength += 2;
                    if (iCurrentLength >= beginIndex) {
                        // ２バイト文字の真中で切る場合:半角スペース置換
                        if (iCurrentLength > beginIndex) {
                            writer.write(' ');
                            iTotalLength++;
                        }
                        break;
                    }
                }
                else {
                    iCurrentLength += 1;
                }
            }

            // 指定長読取
            while (iTotalLength < len) {
                int iRead = reader.read();
                // ストリームエンド（-1）
                if (iRead < 0) {
                    break;
                }

                if (isDoubleByte(iRead)) {
                    iTotalLength += 2;
                    // ２バイト文字の真中で切る場合:半角スペース置換
                    if (iTotalLength > len) {
                        writer.write(' ');
                        break;
                    }
                }
                else {
                    iTotalLength += 1;
                }
                writer.write(iRead);
            }

            writer.flush();
            writer.close();
            return writer.toString();
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    /**
     * ２バイト文字判定
     * @param iCode 文字コード
     * @return ２バイト文字なら true, １バイト文字なら false
     */
    private static boolean isDoubleByte(int iCode) {
        return ((2 == getBytesLength(iCode)) ? true : false);
    }

    /**
     * 文字コードに該当する文字のバイト数を取得する処理。<BR>
     *          return new Character((char)iCode).toString().getBytes().length;
     * この方法を用いると正確なバイト数を判定することができる。
     *  例）
     *      '×' -> ２バイト
     *      'ｱ' -> １バイト
     * 上記のように、特殊な２バイト文字（U+0000 から U+00FF までの Unicode にマッピング
     * れている２バイト文字）や、半角カナ文字のバイト数を正確に取得することができる。
     *
     * @param iCode 文字コード
     * @return バイト数（1 or 2）
     */
    private static int getBytesLength(int iCode) {
        return new Character((char)iCode).toString().getBytes().length;
    }
}