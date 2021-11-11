/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/lot/LotStock.java,v $
 *
 */

package com.nec.jp.orteus.expj.lot;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;

import com.nec.jp.orteus.expj.pr.rcvissue.common.RcvIssueConst;
import com.nec.jp.orteus.expj.pr.rcvissue.util.StringUtil;
import com.nec.jp.orteus.expj.util.Calculate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <pre>
 * 別品目在庫情報操作クラス
 * </pre>
 * 
 * @author $Author: wang-derui $
 * @version $Revision: 1.1 $
 * 
 */

public class LotStock implements RcvIssueConst {

    /** コネクション */
    private IDbConnection _conn = null;

    /**
     * <pre>
     *           コンストラクタ
     *           指定のコネクションを持つオブジェクトを構築する
     * </pre>
     * 
     * @param connect
     *            コネクションがOPENされているIDbConnection
     */
    public LotStock(IDbConnection connect) {
        _conn = connect;
    }

    // ------- 公開メソッド -------------------------------
    /**
     * <pre>
     *           &lt;b&gt;※ロット・品目別手持ち在庫数の取得&lt;/b&gt;
     *           ロット別品目在庫テーブルの読み込み
     * </pre>
     * 
     * @param iItemCd
     *            品目番号
     * @param iWhCd
     *            保管区コード
     * @param AUTOISSUE_BEST_BEFORE
     *            賞味期限を優先コード(1:優先)
     * @return List ロット品目別手持在庫数list 該当する情報が存在しない場合はNULL
     * @throws SQLException
     *             DBアクセスエラー
     */

    public List getHandQty(String iItemCd, Date BEST_BEFORE_DATE,
            String AUTOISSUE_BEST_BEFORE,String PLANT_CD) throws SQLException {

        PreparedStatement selectStmt = null;
        ResultSet selectRslt = null;
        List lotstocklist = new ArrayList();
        String selectStr = "SELECT B.BEST_BEFORE_DATE,"
                + " C.WH_PRIORITY_REF_NO,"
                + " A.STOCK_ON_HAND_QTY - A.ALCD_QTY as STOCK_ON_HAND_QTY,"
                + " A.LOT_NO,A.WH_CD"
                + " FROM T_LOT_STOCK A,T_LOT_CTRL B,M_WH_PRIORITY C,M_WH D "
                + " WHERE (B.BEST_BEFORE_DATE IS NULL OR B.BEST_BEFORE_DATE >? ) "
                + "  AND A.STOCK_ON_HAND_QTY > 0 "
                + "  AND A.LOT_NO = B.LOT_NO(+) "
                + "  AND A.ITEM_CD = B.ITEM_CD(+) "
                + "  AND A.ITEM_CD = C.ITEM_CD(+) "
                + "  AND A.WH_CD = C.WH_CD(+) "
                + "  AND A.WH_CD = D.WH_CD "
                + "  AND A.PLANT_CD =C.PLANT_CD(+) " + "  AND A.ITEM_CD = ? "
                + "  AND D.MRP_FLG='1' " + "  AND A.PLANT_CD = ?";
        // 引数チェック
        if (!StringUtil.Validate(iItemCd)
                || !StringUtil.Validate(AUTOISSUE_BEST_BEFORE)) {
            IllegalArgumentException e = new IllegalArgumentException(this
                    .getClass().getName());
            throw e;
        }
        if (AUTOISSUE_BEST_BEFORE != null && AUTOISSUE_BEST_BEFORE.equals("1")) {
            /** 賞味期限を優先するの場合読込用 SQL */
            selectStr += " ORDER BY B.BEST_BEFORE_DATE,C.WH_PRIORITY_REF_NO,"
                    + "A.LOT_NO,A.STOCK_ON_HAND_QTY- A.ALCD_QTY,A.WH_CD";
        } else {
            /** 賞味期限を優先しないの場合読込用 SQL */
            selectStr += " ORDER BY C.WH_PRIORITY_REF_NO,B.BEST_BEFORE_DATE,"
                    + "A.LOT_NO,A.STOCK_ON_HAND_QTY- A.ALCD_QTY,A.WH_CD";
        }

        // System.out.println("読込用 SQL=[" + selectStr + "]");

        try {
            selectStmt = _conn.getConn().prepareStatement(selectStr);
            if (BEST_BEFORE_DATE == null) {
                selectStmt.setNull(1, Types.DATE);
            } else {
                selectStmt.setDate(1, new java.sql.Date(BEST_BEFORE_DATE
                        .getTime()));
            }
            
            selectStmt.setString(2, iItemCd);
            selectStmt.setString(3, PLANT_CD);

            selectRslt = selectStmt.executeQuery();

            // 検索件数が0件だったらnullを返却
            // System.out.println("loop start");
            while (selectRslt.next()) {
                LotStockStruct lss = new LotStockStruct();
                lss.m_STOCK_ON_HAND_QTY = selectRslt
                        .getBigDecimal("STOCK_ON_HAND_QTY"); // ロット別手持在庫
                // System.out.println(lss.m_STOCK_ON_HAND_QTY);
                lss.m_LOT_NO = Nvl(selectRslt.getString("LOT_NO")); // 在庫ロット番号
                // System.out.println(lss.m_LOT_NO);
                lss.m_WH_CD = Nvl(selectRslt.getString("WH_CD")); // 保管区コード
                // System.out.println(lss.m_WH_CD);
                lotstocklist.add(lss);
            }
            // System.out.println("loop end");
            return lotstocklist;

        } finally {
            this.closeResultSet(selectRslt);
            this.closePreparedStatement(selectStmt);
        }
    }

    public class LotStockStruct {

        public BigDecimal m_STOCK_ON_HAND_QTY = null; // ロット別手持在庫

        public String m_LOT_NO = null; // 在庫ロット番号

        public String m_WH_CD = null; // 保管区コード
    }

    // ------- 非公開メソッド -------------------------------
    /**
     * １．指定された文字列がNULLの場合、長さ０の文字列を返却します。 ２．指定された文字列がNUllでない場合は、指定された文字列を
     * そのまま返却します。
     */
    private String Nvl(String iStr) {
        String ret_str;
        if (iStr == null) {
            ret_str = "";
        } else {
            ret_str = iStr;
        }
        return ret_str;

    }

    /**
     * プリペアドステートメントを閉じる
     * 
     * @param statement
     *            閉じる対象のステートメント
     */
    private void closePreparedStatement(PreparedStatement statement) {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
            }
        }
    }

    /**
     * リザルトセットを閉じる
     * 
     * @param resultset
     *            閉じる対象のリザルトセット
     */
    private void closeResultSet(ResultSet resultset) {
        if (resultset != null) {
            try {
                resultset.close();
            } catch (SQLException e) {
            }
        }
    }
}
