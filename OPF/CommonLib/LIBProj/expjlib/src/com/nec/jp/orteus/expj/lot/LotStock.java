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
 * �ʕi�ڍ݌ɏ�񑀍�N���X
 * </pre>
 * 
 * @author $Author: wang-derui $
 * @version $Revision: 1.1 $
 * 
 */

public class LotStock implements RcvIssueConst {

    /** �R�l�N�V���� */
    private IDbConnection _conn = null;

    /**
     * <pre>
     *           �R���X�g���N�^
     *           �w��̃R�l�N�V���������I�u�W�F�N�g���\�z����
     * </pre>
     * 
     * @param connect
     *            �R�l�N�V������OPEN����Ă���IDbConnection
     */
    public LotStock(IDbConnection connect) {
        _conn = connect;
    }

    // ------- ���J���\�b�h -------------------------------
    /**
     * <pre>
     *           &lt;b&gt;�����b�g�E�i�ڕʎ莝���݌ɐ��̎擾&lt;/b&gt;
     *           ���b�g�ʕi�ڍ݌Ƀe�[�u���̓ǂݍ���
     * </pre>
     * 
     * @param iItemCd
     *            �i�ڔԍ�
     * @param iWhCd
     *            �ۊǋ�R�[�h
     * @param AUTOISSUE_BEST_BEFORE
     *            �ܖ�������D��R�[�h(1:�D��)
     * @return List ���b�g�i�ڕʎ莝�݌ɐ�list �Y�������񂪑��݂��Ȃ��ꍇ��NULL
     * @throws SQLException
     *             DB�A�N�Z�X�G���[
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
        // �����`�F�b�N
        if (!StringUtil.Validate(iItemCd)
                || !StringUtil.Validate(AUTOISSUE_BEST_BEFORE)) {
            IllegalArgumentException e = new IllegalArgumentException(this
                    .getClass().getName());
            throw e;
        }
        if (AUTOISSUE_BEST_BEFORE != null && AUTOISSUE_BEST_BEFORE.equals("1")) {
            /** �ܖ�������D�悷��̏ꍇ�Ǎ��p SQL */
            selectStr += " ORDER BY B.BEST_BEFORE_DATE,C.WH_PRIORITY_REF_NO,"
                    + "A.LOT_NO,A.STOCK_ON_HAND_QTY- A.ALCD_QTY,A.WH_CD";
        } else {
            /** �ܖ�������D�悵�Ȃ��̏ꍇ�Ǎ��p SQL */
            selectStr += " ORDER BY C.WH_PRIORITY_REF_NO,B.BEST_BEFORE_DATE,"
                    + "A.LOT_NO,A.STOCK_ON_HAND_QTY- A.ALCD_QTY,A.WH_CD";
        }

        // System.out.println("�Ǎ��p SQL=[" + selectStr + "]");

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

            // ����������0����������null��ԋp
            // System.out.println("loop start");
            while (selectRslt.next()) {
                LotStockStruct lss = new LotStockStruct();
                lss.m_STOCK_ON_HAND_QTY = selectRslt
                        .getBigDecimal("STOCK_ON_HAND_QTY"); // ���b�g�ʎ莝�݌�
                // System.out.println(lss.m_STOCK_ON_HAND_QTY);
                lss.m_LOT_NO = Nvl(selectRslt.getString("LOT_NO")); // �݌Ƀ��b�g�ԍ�
                // System.out.println(lss.m_LOT_NO);
                lss.m_WH_CD = Nvl(selectRslt.getString("WH_CD")); // �ۊǋ�R�[�h
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

        public BigDecimal m_STOCK_ON_HAND_QTY = null; // ���b�g�ʎ莝�݌�

        public String m_LOT_NO = null; // �݌Ƀ��b�g�ԍ�

        public String m_WH_CD = null; // �ۊǋ�R�[�h
    }

    // ------- ����J���\�b�h -------------------------------
    /**
     * �P�D�w�肳�ꂽ������NULL�̏ꍇ�A�����O�̕������ԋp���܂��B �Q�D�w�肳�ꂽ������NUll�łȂ��ꍇ�́A�w�肳�ꂽ�������
     * ���̂܂ܕԋp���܂��B
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
     * �v���y�A�h�X�e�[�g�����g�����
     * 
     * @param statement
     *            ����Ώۂ̃X�e�[�g�����g
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
     * ���U���g�Z�b�g�����
     * 
     * @param resultset
     *            ����Ώۂ̃��U���g�Z�b�g
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
