/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/sa/ArIfIn.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.sa;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.metamorBase.KZ0010.*;

/**
 * 売掛Ｉ／Ｆ
 *
 * @author $Author: zhang-yan $
 * @version $Revision: 1.1 $ $Date: 2015/04/16 05:06:25 $
*/
public class ArIfIn {

    /**
     * 売掛Ｉ／Ｆ本体
     */
    private KZ0010P002 tempKZ0010P002;

    /**
     * 売掛Ｉ／Ｆを呼び出します。
     *
     * @param conn コネクションがOPENされているIDbConnection
     * @param userId ログインユーザ
     */
    public ArIfIn(IDbConnection conn){
        tempKZ0010P002 = new KZ0010P002(conn);
    }

    /**
     * パラメータを設定します。<BR>
     * <BR>
     * @param mode           処理モード
     *                         1:出荷実績-登録
     *                         2:出荷実績-取消
     *                         3:出荷実績-返品
     *                         4:受領売上-登録
     *                         5:受領売上-取消
     *                         6:その他売上-登録
     *                         7:その他売上-更新
     *                         8:その他売上-削除
     *                         9:預託検収I/F
     * @param userId         呼出側利用者コード
     * @param originalSlipCd 元伝票番号
     * @param redSlipCd      赤伝票番号
     * @param blackSlipCd    黒伝票番号
     * @param taxCd          消費税コード
     */
    public void setParameter(String mode, String userId, String originalSlipCd,
                             String redSlipCd, String blackSlipCd, String taxCd)
    {
        tempKZ0010P002.setParameter(mode, userId, originalSlipCd,
                                    redSlipCd, blackSlipCd, taxCd);
    }

    /**
     * メッセージ番号
     */
    private String _messageNo = "0";

    /**
     * 処理を実行します。<BR>
     *
     * @return メッセージ番号
     *         正常終了時:"0"
     */
    public String execute() {
        return tempKZ0010P002.execute();
    }
}