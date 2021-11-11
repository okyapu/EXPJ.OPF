/*
 * Copyright (c) 2003 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common08.LotCtrl;

import java.sql.*;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;

/**
 * �V�X�e�������t���O�擾�N���X
 * @author $Author: wang-derui $
 * @version $Revision: 1.2 $ $Date: 2008/03/26 07:28:41 $
 */
public class LotCtrl {
    /** DB�A�N�Z�X�p�̃R�l�N�V���� */
    private  IDbConnection conn = null;

    /** �f�[�^�擾�p��SQL */
    private static final String selectLotCtrlSql
            = "SELECT "
              + "  SYS_INSTALL_OPTIONS.INSTALL_FLG as \"INSTALL_FLG\" "
              + "FROM "
              + "  SYS_INSTALL_OPTIONS "
              + "WHERE "
              + "  SYS_INSTALL_OPTIONS.\"OPTION_ID\" = 'LT*' "
              + "AND SYS_INSTALL_OPTIONS.\"INSTALL_FLG\" = 1 ";

    /**
     * �R���X�g���N�^
     * @param connect �R�l�N�V������OPEN����Ă���IDbConnection
     */
    public LotCtrl(IDbConnection connect) {
        this.conn = connect;
    }

    /**
     * �Ώۃf�[�^�����݂��ǂ������f����
     * @param conn �R�l�N�V������OPEN����Ă���IDbConnection
     * @return  �Ώۃf�[�^�����݂̏ꍇtrue�A���݂��Ȃ��̏ꍇfalse�@
     * @throws SQLException DB�A�N�Z�X�G���[
     */
    public static boolean checkLotCtrl(IDbConnection conn) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            //�t���O�ݒ�
            boolean flag = false;
            // SQL�쐬
            ps = conn.getConn().prepareStatement(selectLotCtrlSql);
            // SQL���s
            rs = ps.executeQuery();

            // ���ʂ�ݒ�
            if (rs.next()) {
                // �f�[�^������
                flag = true;
            }

            return flag;
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
	
}