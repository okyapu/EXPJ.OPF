/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/process/IssueComplete.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */

package com.nec.jp.orteus.expj.pr.rcvissue.process;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;

import com.nec.jp.orteus.expj.pr.rcvissue.util.StringUtil;
import com.nec.jp.orteus.expj.pr.rcvissue.common.RcvIssueConst;
import com.nec.jp.orteus.expj.pr.rcvissue.common.UpdateInfo;

/**
 * <pre>
 * 出庫完了解除クラス
 * 「出庫完了」とした出庫指示に対して完了解除を行うことができます。
 * </pre>
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2009/10/22 06:13:49 $
 *
 **/

public class IssueComplete implements RcvIssueConst{

    /**
     * コンストラクタ
     */
    private IssueComplete(){
    }

    //-------  公開メソッド  -------------------------------
    /**
     * 出庫指示番号、オーダデマンド番号を元に出庫完了取り消し処理を行う。<br>
     * ※コミットは行いません。<br>
     * ※対象レコードの排他処理を行います。
     *
     * @param iConnect コネクションがOPENされているIDbConnection
     * @param iIssueInstCd      出庫指示番号
     * @param iOdNo       オーダデマンド番号
     * @param iUpInfo       更新情報取得クラス
     * @return int<br>STS_OK：正常終了<br>STS_NO_RECORD：データが存在しない<br>
	 * STS_UPDATED：データが更新済み<br>STS_OTHER：その他のエラー
     * @throws SQLException DBアクセスエラー
     */
    public static final int Cancel(IDbConnection iConnect, String iIssueInstCd, String iOdNo, UpdateInfo iUpInfo)
        throws SQLException {

        PreparedStatement psSelectTIssueInst = null;
        PreparedStatement psTIssueInst = null;
        PreparedStatement psTOd = null;
        ResultSet rs = null;

        // 引数チェック
        if( iConnect == null || iUpInfo == null ||
            !StringUtil.Validate(iIssueInstCd) || !StringUtil.Validate(iOdNo) ){
            IllegalArgumentException e = new IllegalArgumentException("IssueComplete.Cancel()");
			throw e;
        }

        Connection conn = iConnect.getConn();

        /* [出庫指示]データ読込(排他モード)のSQL */
        String selectTIssueInst =
            "select "
                + "  T_ISSUE_INST.MODIFY_COUNT "
                + "from "
                + "  T_ISSUE_INST "
                + "where "
                + "  T_ISSUE_INST.ISSUE_INST_CD = ? "
                + "for update nowait";

        /* [出庫指示]データ更新のSQL */
        String updateTIssueInst =
            "update "
                + "  T_ISSUE_INST "
                + "set "
                + "  T_ISSUE_INST.ISSUE_CMPLT_DATE = null, "                                    // 出庫完了日 ⇒ NULL
                + "  T_ISSUE_INST.ISSUE_CMPLT_FLG = ?, "    // 出庫完了フラグ ⇒ 0:未
                + "  T_ISSUE_INST.UPDATED_DATE = SYSDATE, "
                + "  T_ISSUE_INST.UPDATED_BY = ?, "
                + "  T_ISSUE_INST.UPDATED_PRG_NM = ?, "
                + "  T_ISSUE_INST.MODIFY_COUNT = T_ISSUE_INST.MODIFY_COUNT + 1 "
                + "where "
                + "  T_ISSUE_INST.ISSUE_INST_CD = ? ";

        /* [所要量]データ更新のSQL */
        String updateTOd =
            "update "
                + "  T_OD "
                + "set "
                + "  T_OD.DM_STS_TYP = ?, "  // デマンド状態区分 ⇒ 2:確定(発効)
                + "  T_OD.ISSUE_CMPLT_DATE = null, "                            // 出庫完了日 ⇒ NULL
                + "  T_OD.UPDATED_DATE = SYSDATE, "
                + "  T_OD.UPDATED_BY = ?, "
                + "  T_OD.UPDATED_PRG_NM = ?, "
                + "  T_OD.MODIFY_COUNT = T_OD.MODIFY_COUNT + 1 "
                + "where "
                + "  T_OD.OD_NO = ? ";

        try {
            // [出庫指示]データ読込のSQL作成
            psSelectTIssueInst = conn.prepareStatement(selectTIssueInst);
            psSelectTIssueInst.setString(1, iIssueInstCd);
            rs = psSelectTIssueInst.executeQuery();

            // [出庫指示]の存在チェック
            if(!rs.next()){
                return RcvIssueConst.STS_NO_RECORD;
            }

            // [出庫指示]."更新数"のチェック処理
            if( rs.getInt(1) != iUpInfo.getModifyCount() ){
                return RcvIssueConst.STS_UPDATED;
            }

            // [出庫指示]データ更新のSQL作成
            psTIssueInst = conn.prepareStatement(updateTIssueInst);
            psTIssueInst.setInt(1, RcvIssueConst.ISSUE_CMPLT_YET);
            psTIssueInst.setString(2, iUpInfo.getUpdateBy());
            psTIssueInst.setString(3, iUpInfo.getUpdatePrgNm());
            psTIssueInst.setString(4, iIssueInstCd);

            // [所要量]データ更新のSQL作成
            psTOd = conn.prepareStatement(updateTOd);
            psTOd.setInt(1, RcvIssueConst.DM_STS_ALREADY);
            psTOd.setString(2, iUpInfo.getUpdateBy());
            psTOd.setString(3, iUpInfo.getUpdatePrgNm());
            psTOd.setString(4, iOdNo);

            // SQL実行
            psTIssueInst.executeQuery();
            psTOd.executeQuery();

            return RcvIssueConst.STS_OK;
        } finally {
			if (psSelectTIssueInst != null) {
				try {
					psSelectTIssueInst.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				psSelectTIssueInst = null;
			}
			if (psTIssueInst != null) {
				psTIssueInst.close();
			}

			if (psTOd != null) {
				psTOd.close();
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rs = null;
			}
		}
    }
}
