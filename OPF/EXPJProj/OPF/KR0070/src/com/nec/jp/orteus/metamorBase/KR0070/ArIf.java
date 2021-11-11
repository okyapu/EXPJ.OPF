/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KR0070/src/com/nec/jp/orteus/metamorBase/KR0070/ArIf.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.metamorBase.KR0070;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
/**
 * 売掛Ｉ／Ｆ
 *
 * @author $Author: luoxiao $
 * @version $Revision: 1.1 $ $Date: 2014/02/21 07:52:15 $
*/
public class ArIf {

    /**
     * 売掛Ｉ／Ｆ本体
     */
    private KZ0010P001 tempKZ0010P001;
    
    /**
     * 売掛Ｉ／Ｆ本体（Ja）
     */
    private KZ1010P001 tempKZ1010P001;
    
    /**
     * 環境フラグ 1:J 2:Ja
     */
    private String Flag;
    
    /**
     * setFlag
     * @param flag
     */
    public void setFlag(String flag){
    	Flag = flag;
    }

    /**
     * 売掛Ｉ／Ｆを呼び出します。
     *
     * @param conn コネクションがOPENされているIDbConnection
     * @param userId ログインユーザ
     */
    public ArIf(IDbConnection conn, String flag){
    	if ("1".equals(flag)) {
    		tempKZ0010P001 = new KZ0010P001(conn);
        } else {
        	tempKZ1010P001 = new KZ1010P001(conn);
        }
    	setFlag(flag);
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
    	if ("1".equals(Flag)) {
    		tempKZ0010P001.setParameter(mode, userId, originalSlipCd,
    				redSlipCd, blackSlipCd, taxCd);
        } else {
        	tempKZ1010P001.setParameter(mode, userId, originalSlipCd,
    				redSlipCd, blackSlipCd, taxCd);
        }
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
    	if ("1".equals(Flag)) {
    		return tempKZ0010P001.execute();
        } else {
        	return tempKZ1010P001.execute();
        }
    }
}