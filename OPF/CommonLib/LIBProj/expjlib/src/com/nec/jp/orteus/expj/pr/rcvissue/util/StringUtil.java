/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/util/StringUtil.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */

package com.nec.jp.orteus.expj.pr.rcvissue.util;

/**
 * <pre>
 * ������(String)�`�F�b�N�N���X
 * ������̗L�������`�F�b�N���邱�Ƃ��ł��܂��B
 * </pre>
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:28:05 $
 *
 **/

public class StringUtil{

    /**
     * �R���X�g���N�^
     */
    private StringUtil(){
    }

    //-------  ���J���\�b�h  -------------------------------
    /**
     * �Ώە�����̗L�����`�F�b�N���s���B
     *
     * @param iCheckString �L�������`�F�b�N���镶����
     * @return true/false �Ώە����񂪗L���ł���� true
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
