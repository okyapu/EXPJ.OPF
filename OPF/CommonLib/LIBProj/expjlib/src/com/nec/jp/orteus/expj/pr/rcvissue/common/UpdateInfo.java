/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/common/UpdateInfo.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */

package com.nec.jp.orteus.expj.pr.rcvissue.common;

/**
 * <pre>
 * 更新情報クラス
 * 更新情報(更新数、更新者、更新プログラム名)を保持することができます。
 * </pre>
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:27:58 $
 *
 **/

public class UpdateInfo{

    /* 更新情報保持用 変数定義 */
    private String _updateBy;       // 更新者
    private String _updatePrgNm;    // 更新プログラム
    private int _modifyCount;       // 更新プログラム
    private int[] _someModifyCount; // 更新数(複数)

    /**
     * コンストラクタ
     * @param iUpdateBy 更新者
     * @param iUpdatePrgNm     更新プログラム
     * @param iModifyCount 更新数
     */
    public UpdateInfo(String iUpdateBy, String iUpdatePrgNm, int iModifyCount){
        _updateBy = iUpdateBy;
        _updatePrgNm = iUpdatePrgNm;
        _modifyCount = iModifyCount;
    }

    /**
     * コンストラクタ<br>
     * ※更新数が複数必要な場合のコンストラクタ。
     * @param iUpdateBy 更新者
     * @param iUpdatePrgNm     更新プログラム
     * @param iModifyCount 更新数(複数)
     */
    public UpdateInfo(String iUpdateBy, String iUpdatePrgNm, int[] iSomeModifyCount){
        _updateBy = iUpdateBy;
        _updatePrgNm = iUpdatePrgNm;
        _someModifyCount = iSomeModifyCount;
    }

    //-------  公開メソッド  -------------------------------
    /**
     * 更新者を返します。
     * @return 更新者
     */
    public String getUpdateBy(){
        return _updateBy;
    }

    /**
     * 更新プログラムを返します。
     * @return 更新者
     */
    public String getUpdatePrgNm(){
        return _updatePrgNm;
    }

    /**
     * 更新数を返します。
     * @return 更新数
     */
    public int getModifyCount(){
        return _modifyCount;
    }

    /**
     * 複数の更新数を返します。
     * @return 更新数の配列
     */
    public int[] getSomeModifyCount(){
        return _someModifyCount;
    }
}
