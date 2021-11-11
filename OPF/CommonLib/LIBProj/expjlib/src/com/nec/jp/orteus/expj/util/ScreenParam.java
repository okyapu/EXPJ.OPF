/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/util/ScreenParam.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.util;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.foundation.IDbAdapter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.nec.jp.orteus.xaf.util.FoundationException;

/**
 * ��ʋ��ʒ�`�擾�N���X
 *
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.5 $ $Date: 2013/06/27 02:55:08 $
*/

public class ScreenParam {

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
	 * @throws FoundationException targetClass �� null �̏ꍇ
	 */
	public ScreenParam(Class targetClass) 
			throws FoundationException {
		if(targetClass == null){
			throw new FoundationException("ScreenParam","�R���X�g���N�^","(SBM0865)�������s���ł��B");
		}
		this.targetClass = targetClass;
	}

	/**
	 * �p�b�P�[�W�����擾���܂��B
	 * @param	format ALL �܂��� SHORT
	 * @return	format �� ALL�̏ꍇ�́A�p�b�P�[�W���S�Ă�Ԃ��܂��B
	 * 			SHORT�̏ꍇ�́A�p�b�P�[�W�ŉ����݂̂�Ԃ��܂��B
	 */
	public String getPackageName(int format) {
		
		if (this.targetClass == null || format > MAX){
			 return null; 
		}

		String packageName = this.targetClass.getPackage().getName();
		if(format == this.ALL){
			return packageName;
		}

		int index = packageName.lastIndexOf(".");
		if (index == -1){
			return packageName;
		}

		return packageName.substring(index + 1);
	}

	/**
	 * �N���X�����擾���܂��B
	 * @param	format ALL �܂��� SHORT
	 * @return	format �� ALL�̏ꍇ�́A�p�b�P�[�W���܂ރN���X����Ԃ��܂��B
	 * 			SHORT�̏ꍇ�́A�N���X���݂̂�Ԃ��܂��B
	 */
	public String getClassName(int format) {
		if (this.targetClass == null){
			return null;
		} 

		String className = this.targetClass.getName();
		if (format == this.ALL){
			return className;
		}

		int index = className.lastIndexOf(".");
		if (index == -1){
			return className;
		}

		return className.substring(index + 1);
	}

	/**
	 * ����ID���擾���܂��B
	 * @return  ����ID
	 */
	public String getProcId() {
		
		if (this.targetClass == null){
			 return null;
		}

		String procId = this.getClassName(this.SHORT);
		int index = procId.indexOf("Control");
		if (index == -1){
			return procId;
		}
		return procId.substring(0, index);
	}


	/**
	 * ���OID���擾���܂��B
	 * @return  ���OID
	 */
	public String getLogId() {
		
		if (this.targetClass == null){
			return null;
		}

		String logId = this.getPackageName(this.ALL);
		int index = logId.lastIndexOf(".");
		if (index == -1){
			return this.getProcId();
		}
		return logId.substring(0, index + 1) + this.getProcId();
	}

	/**
	 * ��ʍő�\���s�����擾���܂��B<br>
	 * 		SYS_SCREEN_PARM�e�[�u�����AgetProcId �Ŏ擾��������ID�ƈ����œn���ꂽ key
	 * 		�������Ɍ������āA MAX_DISPLAY_ROWNUM ��Ԃ��܂��B�Y���f�[�^�����݂��Ȃ��ꍇ��
	 * 		0 ��Ԃ��܂��B
	 * @param	idbConn idbConnection
	 * @param	key ����p�b�P�[�W�ł̎��ʃL�[
	 * @return	��ʍő�\���s���iDB�ɒ�`����Ă��Ȃ��ꍇ0��ԋp�j
	 * @throws	FoundationException �������s���ȏꍇ�܂��́A�I���N���G���[�����������ꍇ
	 */
	public int getMaxLine(IDbConnection idbConn,int key)
			throws FoundationException {
				
		String packageName = this.getProcId();
		if (idbConn == null || packageName == null){
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
			if (!rs.next()){
				return 0;
			}

			return rs.getInt("MAX_DISPLAY_ROWNUM");

		}catch(SQLException se){
			FoundationException fe = new FoundationException("ScreenParam","getMaxLine","(SBM0871)���R�[�h�����Ɏ��s���܂����B");
			fe.setPreviousException(se);
			throw fe;
		}finally{
			try{
				if (rs != null){
					rs.close();
					rs = null;
				}
				if (stmt != null){
					stmt.close();
					stmt = null;
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
}