/*
 * Copyright (c) 2003 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common01.ExtPlanExp;

import java.sql.*;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;

/**
 * �Ɩ��^�p���擾�N���X
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2008/03/26 07:28:24 $
 */
public class DateCtrl {
    /** DB�A�N�Z�X�p�̃R�l�N�V���� */
    private IDbConnection conn = null;

    /** �f�[�^�擾�p��SQL */
    private static final String selectDateCtrlSql
            = "select "
              + "  SYS_DATE_CTRL.PLANT_CD as \"PLANT_CD\", "
              + "  to_char(SYS_DATE_CTRL.BUSINESS_OPR_DATE, 'YYYY/MM/DD') as BUSINESS_OPR_DATE, "
              + "  to_char(SYS_DATE_CTRL.STOCK_CRITERION_DATE, 'YYYY/MM/DD') as STOCK_CRITERION_DATE "
              + "from "
              + "  SYS_DATE_CTRL "
              + "where "
              + "  SYS_DATE_CTRL.\"PLANT_CD\" = ? ";

    /**
     * �R���X�g���N�^
     * @param connect �R�l�N�V������OPEN����Ă���IDbConnection
     */
    public DateCtrl(IDbConnection connect) {
        this.conn = connect;
    }

    /**
     * �w��H��̋Ɩ��^�p�����擾
     * @deprecated hoge
     * @param plantCd �H��R�[�h
     * @return �Ɩ��^�p��������iYYYY/MM/DD�`���j�Ώۃf�[�^�����݂��Ȃ��ꍇ��null
     * @throws SQLException DB�A�N�Z�X�G���[
     */
    public String getBusinessOprDate(String plantCd) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            // SQL�쐬
            ps = this.conn.getConn().prepareStatement(selectDateCtrlSql);
            ps.setString(1, plantCd);
            // SQL���s
            rs = ps.executeQuery();

            String businessOprDate = null;

            // ���ʂ�ݒ�
            if (rs.next()) {
                // �f�[�^���擾
                businessOprDate = rs.getString("BUSINESS_OPR_DATE");
            }

            return businessOprDate;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
        }
    }
 
	/**
     * �w��H��̋Ɩ��^�p�����擾
	 * @param plantCd �H��R�[�h
	 * @return �Ɩ��^�p��������iYYYY/MM/DD�`���j�Ώۃf�[�^�����݂��Ȃ��ꍇ��null
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public static String getBusinessOprDate(IDbConnection conn, String plantCd) throws SQLException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			// SQL�쐬
			ps = conn.getConn().prepareStatement(selectDateCtrlSql);
			ps.setString(1, plantCd);
			// SQL���s
			rs = ps.executeQuery();

			String businessOprDate = null;

			// ���ʂ�ݒ�
			if (rs.next()) {
				// �f�[�^���擾
				businessOprDate = rs.getString("BUSINESS_OPR_DATE");
			}

			return businessOprDate;
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
		}
	}
}