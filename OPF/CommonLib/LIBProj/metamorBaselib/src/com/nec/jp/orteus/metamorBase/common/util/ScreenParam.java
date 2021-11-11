/**
 *(#)ScreenParam.java
 *
 * Copyright (c) 2003 NEC informatec Systems,Ltd.
 *
 * @author S.Takahashi
 * Date : 2003/08/20
 * @version 1.00
 * History 2003/08/20 �V�K�쐬 S.Takahashi
 *         2003/09/09 T.Taniguchi
 *                    �EgetProcId���\�b�h�ǉ�
 *                    �EgetLogId���\�b�h�ǉ�
 *                    �EgetMaxLine���\�b�h�̎��ʂ��p�b�P�[�W�P�ʂł͂Ȃ��A����ID�P�ʂɕύX
 */
package com.nec.jp.orteus.metamorBase.common.util;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.foundation.IDbAdapter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.nec.jp.orteus.xaf.util.FoundationException;

/**
 * ��ʋ��ʒ�`�擾�N���X
 */
public class ScreenParam{
	/**
	 * �S�Ċ܂�
	*/
	static public final int ALL = 0;
	/**
	 * �ȗ�����
	*/
	static public final int SHORT = ALL + 1;

	static protected final int MAX = SHORT;
	protected Class targetClass = null;


	/**
	 * �R���X�g���N�^
	 * @param   targetClass �N���X
	 */
	public ScreenParam(Class targetClass) throws FoundationException{
		if(targetClass == null){
			throw new FoundationException("ScreenParam","�R���X�g���N�^","(SBM0865)�������s���ł��B");
		}
		this.targetClass = targetClass;
	}


	/**
	 * �p�b�P�[�W�����擾����B
	 * @param   format ALL�̏ꍇ�F�p�b�P�[�W���S�āASHORT�̏ꍇ�F�p�b�P�[�W�ŉ���
	 * @return  �p�b�P�[�W��
	 */
	public String getPackageName(int format){
		if(this.targetClass == null || format > MAX) return null;

		String packageName = this.targetClass.getPackage().getName();
		if(format == this.ALL){
			return packageName;
		}

		int index = packageName.lastIndexOf(".");
		if(index == -1){
			return packageName;
		}

		return packageName.substring(index + 1);
	}


	/**
	 * �N���X�����擾����B
	 * @param   format ALL�̏ꍇ�F�p�b�P�[�W���܂ށASHORT�̏ꍇ�F�N���X��
	 * @return  �p�b�P�[�W��
	 */
	public String getClassName(int format){
		if(this.targetClass == null) return null;

		String className = this.targetClass.getName();
		if(format == this.ALL){
			return className;
		}

		int index = className.lastIndexOf(".");
		if(index == -1){
			return className;
		}

		return className.substring(index + 1);
	}


	/**
	 * ����ID���擾����B
	 * @param   ����
	 * @return  ����ID
	 */
	public String getProcId(){
		if(this.targetClass == null) return null;

		String procId = this.getClassName(this.SHORT);
		int index = procId.indexOf("Control");
		if(index == -1){
			return procId;
		}
		return procId.substring(0, index);
	}


	/**
	 * ���OID���擾����B
	 * @param   ����
	 * @return  ���OID
	 */
	public String getLogId(){
		if(this.targetClass == null) return null;

		String logId = this.getPackageName(this.ALL);
		int index = logId.lastIndexOf(".");
		if(index == -1){
			return this.getProcId();
		}
		return logId.substring(0, index + 1) + this.getProcId();
	}


	/**
	 * ��ʍő�\���s�����擾����B
	 * @param   idbConn idbConnection
	 * @param   key ����p�b�P�[�W�ł̎��ʃL�[
	 * @return		 ��ʍő�\���s���iDB�ɒ�`����Ă��Ȃ��ꍇ0��ԋp�j
	 * @throws FoundationException
	 */
	public int getMaxLine(IDbConnection idbConn,int key) throws FoundationException{
		String packageName = this.getProcId();
		if(idbConn == null || packageName == null){
			throw new FoundationException("ScreenParam","getMaxLine","(SBM0865)�������s���ł��B");
		}

		String query = "select MAX_DISPLAY_ROWNUM from SYS_SCREEN_PARM where ";
		query = query + "SERVLET_CD=? and ";
		query = query + "DISPLAY_CD=?";

		IDbAdapter adapt = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try{
			Connection conn = idbConn.getConn();
			stmt = conn.prepareStatement(query);
			stmt.setString(1,packageName);
			stmt.setInt(2,key);
			rs = stmt.executeQuery();
			if(!rs.next()){
				return 0;
			}

			return rs.getInt("MAX_DISPLAY_ROWNUM");

		}catch(SQLException se){
			FoundationException fe = new FoundationException("ScreenParam","getMaxLine","(SBM0871)���R�[�h�����Ɏ��s���܂����B");
			fe.setPreviousException(se);
			throw fe;
		}finally{
			try{
				if(rs != null){
					rs.close();
					rs = null;
				}
				if(stmt != null){
					stmt.close();
					stmt = null;
				}
			}catch(Exception e){}
		}
	}

}
