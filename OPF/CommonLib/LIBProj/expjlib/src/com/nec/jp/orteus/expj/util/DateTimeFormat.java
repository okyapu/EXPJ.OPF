/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/util/DateTimeFormat.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.util;

import java.sql.*;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;

/**
 * ���t����
 * �N�����Ǝ������킯�܂�
 *
*/

public class DateTimeFormat {
	
	/** DB�A�N�Z�X�p�̃R�l�N�V���� */
	private IDbConnection conn = null;
	
	/** �����Ǘ��t���O */
	private String TimeCtrlFlg;
	
	/** �߂�l �N�����A���� */
	private String sepaDate;
	private String sepaTime;
	private String sepaCoronTime;
	
	
	private static final String selectTimeCtrlSql
			= "SELECT "
			+ "  SYS_PARAMETER.VALUE AS VALUE "
			+ "FROM "
			+ "  SYS_PARAMETER "
			+ "WHERE "
			+ "  SYS_PARAMETER.NAME = 'TIME_CTRL' ";

	/**
	 * �R���X�g���N�^
	 * @param connect �R�l�N�V������OPEN����Ă���IDbConnection
	 */
	public DateTimeFormat(IDbConnection connect) throws SQLException {
		try {
			this.conn = connect;
			setTimeCtrl(getTimeCtrl());
		} catch (SQLException ex) {
			throw ex;
		} finally {
		}

	}
	
	/**
	 * TimeCtrl���擾�B
	*/
	public String getTimeCtrl() throws SQLException {
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			// SQL�쐬
			ps = this.conn.getConn().prepareStatement(selectTimeCtrlSql);
			// SQL���s
			rs = ps.executeQuery();

			String TimeFlg = "false";

			// ���ʂ�ݒ�
			if (rs.next()) {
				// �f�[�^���擾
				TimeFlg = rs.getString("VALUE");
			}
			return TimeFlg;
			
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
	 * TimeCtrl��ݒ�B
	*/
	public void setTimeCtrl(String flg) {
		
		this.TimeCtrlFlg = flg;
		
	}
	
	
	/**
	 * �N�����Ǝ������킯��B
	 * �����̌`��str�FYYYY/MM/DD HH24:MI
	*/
	public void format(String str){
		
		//������
		sepaDate = "";
		sepaTime = "";
		sepaCoronTime = "";
		
		if(str != null){
			//�`��YYYY/MM/DD HH24:MI�̏ꍇ
			if(str.length() == 16){
				
				if((this.TimeCtrlFlg).equals("true")){
					
					sepaDate = str.substring(0,10);
					sepaTime = str.substring(11,13) + str.substring(14,16);
					sepaCoronTime = str.substring(11,16);
					
				}else{
					
					sepaDate = str.substring(0,10);
					sepaTime = "";
					sepaCoronTime = "";
					
				}
				
			//�`��YYYY/MM/DD�̏ꍇ
			}else if(str.length() == 10){
				
				sepaDate = str;
				sepaTime = "";
				sepaCoronTime = "";
				
			}else{
				
				sepaDate = "";
				sepaTime = "";
				sepaCoronTime = "";
				
			}
		}
	}
	
	/**
	 * �N������Ԃ��B
	 * �����̌`��str�FYYYY/MM/DD HH24:MI
	*/
	public String getDatePart(String str) {
		
		this.format(str);
		return sepaDate;
		
	}
	
	/**
	 * ������Ԃ��B
	 * �����̌`��str�FYYYY/MM/DD HH24:MI
	*/
	public String getTimePart(String str) {
		
		this.format(str);
		return sepaTime;
		
	}
	
	/**
	 * ������Ԃ��B�R������
	 * �����̌`��str�FYYYY/MM/DD HH24:MI
	*/
	public String getCoronTimePart(String str) {
		
		this.format(str);
		return sepaCoronTime;
		
	}
}
