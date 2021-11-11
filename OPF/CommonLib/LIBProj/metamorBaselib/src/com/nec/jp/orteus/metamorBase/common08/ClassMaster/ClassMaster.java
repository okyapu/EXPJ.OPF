/*
 * Copyright (c) 2003 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common08.ClassMaster;

import java.sql.*;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;

/**
 * ���ޖ��̎擾�Ɠo�^�X�V���̃`�F�b�N�N���X
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:28:40 $
 */
public class ClassMaster{
    /** DB�A�N�Z�X�p�̃R�l�N�V���� */
    private static IDbConnection conn = null;
    /** �f�[�^�擾�p��SQL */  
   private static final String selectClassSql
            = "select"
            	+"  M_CLASS.\"CLASS_NAME\" AS \"CLASS_NAME\" "
            	+"from "
            	+"M_CLASS "
            	+"where "
            	+"M_CLASS.\"CLASS_CD1\" = ? "
                +"AND M_CLASS.\"CLASS_CD2\" = ? "
                +"AND M_CLASS.\"CLASS_CD3\" = ? ";
            	
    /**
     * �R���X�g���N�^
     * @param connect �R�l�N�V������OPEN����Ă���IDbConnection
     */
    public ClassMaster(IDbConnection connect) {
        this.conn = connect;
    }

    /**
     * �w�肳�ꂽ�L�[��ClassName���擾����B
     * @param classcd1 �啪�ރR�[�h
     * @param classcd2�@�����ރR�[�h
     * @param classcd3 �����ރR�[�h
     * @return className
     * @throws SQLException DB�A�N�Z�X�G���[
     */
    public static String getClassName(IDbConnection conn,String classcd1,String classcd2,String classcd3) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            // SQL�쐬
            ps = conn.getConn().prepareStatement(selectClassSql);
            ps.setString(1,classcd1);
            ps.setString(2,classcd2);
            ps.setString(3,classcd3);
            // SQL���s
            rs = ps.executeQuery();

            String className = null;

            // ���ʂ�ݒ�
            if (rs.next()) {
                // �f�[�^���擾
            	className = rs.getString("CLASS_NAME");
            }

            return className;
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
	 * �o�^�ƍX�V���鎞���݃`�F�b�N���s���B
     * @param classcd1 �啪�ރR�[�h
     * @param classcd2�@�����ރR�[�h
     * @param classcd3 �����ރR�[�h
	 * @return checkResult	 
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public static boolean  checkMclass(IDbConnection conn,String classcd1,String classcd2,String classcd3) throws SQLException{
		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean checkResult;
		try {
			// SQL�쐬
			ps = conn.getConn().prepareStatement(selectClassSql);
            ps.setString(1,classcd1);
            ps.setString(2,classcd2);
            ps.setString(3,classcd3);
			// SQL���s
			rs = ps.executeQuery();

			// �������ʂ�0���̏ꍇ�̓G���[
			if (!rs.next()) {
                checkResult=false;
			}else{ 
				checkResult=true;
			}
			
             return checkResult;
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