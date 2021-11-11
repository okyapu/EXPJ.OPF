/*
 * Copyright (c) 2003 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.expj.util;

import java.sql.*;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern; 
/**
 * �p�X���[�h���̓`�F�b�N�N���X
 * @author $Author: li-lu $
 * @version $Revision: 1.3 $ $Date: 2014/12/29 07:42:39 $
 */
public class UserPassWordInputRule {
    /** DB�A�N�Z�X�p�̃R�l�N�V���� */
    private IDbConnection conn = null;

    /** �f�[�^�擾�p��SQL */
    private static final String selectLengthSql
            = "select "
              + "  SYS_PARAMETER.VALUE as \"VALUE\" "
              + "from "
              + "  SYS_PARAMETER "
              + "where "
              + "  SYS_PARAMETER.\"NAME\" = ? ";

    /**
     * �R���X�g���N�^
     * @param connect �R�l�N�V������OPEN����Ă���IDbConnection
     */
    public UserPassWordInputRule(IDbConnection connect) {
        this.conn = connect;
    }

	/**
     * �p�X���[�h�ŏ������̃`�F�b�N
	 * @param password �p�X���[�h
	 * @return 1: �p�X���[�h�ŏ�����
	 * @return 2: �`�F�b�N����
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public static Map compareMinLength(IDbConnection conn, String password) throws SQLException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		HashMap minLen = new HashMap();
		try {
			// SQL�쐬
			ps = conn.getConn().prepareStatement(selectLengthSql);
			ps.setString(1, "PSW_MIN_LENGTH");
			// SQL���s
			rs = ps.executeQuery();

			String minLength = null;

			// ���ʂ�ݒ�
			if (rs.next()) {
				// �f�[�^���擾
				minLength = rs.getString("VALUE");
				if (Calculate.compare(String.valueOf(password.length()), minLength) < 0){
					minLen.put("1", minLength);
					minLen.put("2", "false");
					return minLen;
				}
			}
			return minLen;
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
     * �p�X���[�h���[���̃`�F�b�N
	 * @param password �p�X���[�h
	 * @return ���[�����ᔽ�̏ꍇ�@false
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public static boolean checkWordRule(IDbConnection conn, String password) throws SQLException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			// SQL�쐬 
			ps = conn.getConn().prepareStatement(selectLengthSql);
			ps.setString(1, "PSW_RULE");
			// SQL���s
			rs = ps.executeQuery();
 
			String wordRule = null; 
			String regex1 = "[0-9]+";
			String regex2 = "[a-zA-Z]+";
			String regex3 = "[\\p{Punct}]+";
			String regex = "(([0-9]+[a-zA-Z]+[0-9a-zA-Z]*)|([a-zA-Z]+[0-9]+[0-9a-zA-Z]*))";
			Pattern p;
			// ���ʂ�ݒ�
			if (rs.next()) {
				// �f�[�^���擾
				wordRule = rs.getString("VALUE");			
				if (wordRule.equals("1") && password.length() > 1){

					//���l���[���̃`�F�b�N
					p = Pattern.compile(regex1);
					Matcher m = p.matcher(password);
					if (!m.find()){
						return false;
					}				
					//�������[���̃`�F�b�N
					p = Pattern.compile(regex2);
					m = p.matcher(password);
					if (!m.find()){
						return false;
					}
				
					if (!Pattern.matches(regex, password)){
						//�L�����[���̃`�F�b�N
						p = Pattern.compile(regex3);
					    m = p.matcher(password);
					    if (!m.find()){
						    return false;
					    }
				    }
			  }
	      }
		return true;
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