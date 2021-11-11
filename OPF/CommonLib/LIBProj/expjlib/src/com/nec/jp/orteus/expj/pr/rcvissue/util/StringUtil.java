/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/util/StringUtil.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */

package com.nec.jp.orteus.expj.pr.rcvissue.util;

/**
 * <pre>
 * 文字列(String)チェッククラス
 * 文字列の有効性をチェックすることができます。
 * </pre>
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:28:05 $
 *
 **/

public class StringUtil{

    /**
     * コンストラクタ
     */
    private StringUtil(){
    }

    //-------  公開メソッド  -------------------------------
    /**
     * 対象文字列の有効性チェックを行う。
     *
     * @param iCheckString 有効性をチェックする文字列
     * @return true/false 対象文字列が有効であれば true
     */
    public static final boolean Validate(String iCheckString)
    {

        if(iCheckString == null || iCheckString.equals(""))
        {
            return false;
        }else{
            return true;
        }

    }
}
