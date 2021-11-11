/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/util/PrivateConfig.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.util;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

/**
 * SYS_PARAMETER�̐ݒ�l�擾�N���X
 *
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:28:13 $
*/

public class PrivateConfig {


	/** 
	 * DB�Ƃ̃R�l�N�V���� 
	 */
	private IDbConnection _conn = null;

	/** 
	 * �ݒ�l�쐬�p�t������ 
	 */
	private final String _ADD_NAME = "_COUNT";

	/** 
	 * �ݒ�l�擾SQL 
	 */
	private final String _sqlSysParameterl =
		  "select SYS_PARAMETER.\"VALUE\" as \"VALUE\" "
		+ "from SYS_PARAMETER "
		+ "where SYS_PARAMETER.\"NAME\" = ? "
		+ "order by SYS_PARAMETER.\"NAME\"";

	/**
	 * �R���X�g���N�^
	 * ���̌`���ł̃C���X�^���X�����͕s��
	 */
	private PrivateConfig(){}

	/**
	 * �R���X�g���N�^
	 * @param DB�A�N�Z�X�p�̃R�l�N�V����
	 */
	public PrivateConfig(IDbConnection conn){ 
		_conn = conn; 
	}

	/**
	 * �ݒ�l�擾(������^)
	 * @param name �擾�L�[
	 * @return �ݒ�l(�擾�Ɏ��s�����ꍇnull)
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public String getString(String name)
			throws SQLException {
		String stringValue = null;
		ResultSet result = null;
		PreparedStatement stmt = null;

		//�R�l�N�V�����A�����������ꍇ�͏������Ȃ�
		if (name == null || _conn == null) {
			return null;
		} 

		try{
			stmt = makeSQL(name);
			result = stmt.executeQuery();
			
			if (result.next()){
				stringValue = result.getString(1);
			}

		}finally{
			closeResultSet(result);
			closePreparedStatement(stmt);
		}

		return stringValue;
	}

	/**
	 * �ݒ�l�擾(�����^)
	 * @param name �擾�L�[
	 * @return �ݒ�l(�擾�Ɏ��s/���l�ϊ����s�����ꍇnull)
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public Integer getNumber(String name)
			throws SQLException {
		String s = null;
		Integer integerValue = null;
		try{
			s = getString(name);
			if(s == null) {
				return null;
			} 
			Integer convValue = new Integer(s);
			integerValue = convValue;
		}
		catch(NumberFormatException e){
			integerValue = null;
		}
		return integerValue;
	}

	/**
	 * �ݒ�l�擾(������^�E�����ݒ�l)
	 * @param key �擾�L�[�̃L�[���[�h
	 * @return �ݒ�l(String)�̃��X�g(�擾�Ɏ��s�����ꍇnull)
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public ArrayList getStrings(String key)
			throws SQLException {
		ArrayList list = null;

		//�R�l�N�V�����A�����������ꍇ�͏������Ȃ�
		if (key == null || _conn == null) {
			return null;
		} 

		list = getStringList(key);

		return list;

	}

	/**
	 * �ݒ�l�擾(�����^�E�����ݒ�l)
	 * @param key �擾�L�[�̃L�[���[�h
	 * @return �ݒ�l(Integer)�̃��X�g(�擾�Ɏ��s/���l�ϊ����s�����ꍇnull)
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public ArrayList getNumbers(String key)
			throws SQLException {
		ArrayList list = null;
		ArrayList intList = null;
		boolean bRet = false;

		//�R�l�N�V�����A�����������ꍇ�͏������Ȃ�
		if (key == null || _conn == null) {
			return null;
		} 

		list = getStringList(key);
		if (list == null) {
			return null;
		} 
		try{
			intList = new ArrayList(0);
			for (int n = 0; n < list.size(); n++){
				Integer value = new Integer((String)list.get(n));
				intList.add(value);
			}
		}
		catch(NumberFormatException e){
			intList = null;
			return null;
		}
		return intList;
	}
	
	/**
	 * �����񃊃X�g����
 	 * @param key �擾�L�[�̃L�[���[�h
	 * @return �ݒ�l(Integer)�̃��X�g(�擾�Ɏ��s�����ꍇnull)
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	private ArrayList getStringList(String key)
			throws SQLException {
		ResultSet result = null;
		ArrayList list = null;
		String keyName = null;
		String counts = null;
		String each = null;

		try{
			// �ݒ萔���擾
			keyName = makeCountName(key);
			counts = getString(keyName);
			if (counts != null){
				list = new ArrayList(0);
				int loopCnt = Integer.parseInt(counts);
				// �e�ݒ�l���擾
				for (int cnt = 0 ;cnt < loopCnt; cnt++){
					//�ݒ�l����SQL�擾(1�`�A��)
					keyName = makeSeqName(key, (cnt + 1));
					each = getString(keyName);
					if (each != null){
						String value = new String(each);
						list.add(value);
					}else{
						// �A�ԂłȂ��ꍇ��null��Ԃ�
						list = null;
						break;
					}
				}
			}
		}catch(NumberFormatException e){
			list = null;
		}
		return list;
	}
	
	/**
	 * �ݒ�l�擾SQL����
	 * @param name �擾�L�[
	 * @return SQL
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	private PreparedStatement makeSQL(String name)
			throws SQLException {
		PreparedStatement stmt = null;

		stmt = (_conn.getConn()).prepareStatement(_sqlSysParameterl);
		stmt.setString(1, name);

		return stmt;
	}

	/**
	 * �J�E���g�l�擾���̐���
	 * @param key �擾�L�[
	 * @return �������R�[�h��`����
	 */
	private String makeCountName(String key)
	{
		return key + _ADD_NAME;
	}

	/**
	 * �ݒ�l�擾���̐���
	 * @param key �擾�L�[
	 * @param keyNo �擾�L�[
	 * @return �������R�[�h��`����(key + "_" + keyNo) 
	 */
	private String makeSeqName(String key, int keyNo){
		return key + "_" + keyNo;
	}
	
	/**
	 * �v���y�A�h�X�e�[�g�����g�����
	 * @param statement ����Ώۂ̃X�e�[�g�����g
	 */
	private void closePreparedStatement(PreparedStatement statement){
		if (statement == null) {
			return; 
		} 
		try{
			statement.close();
			statement = null;
		}
		catch (SQLException e){}
	}

	/**
	 * ���U���g�Z�b�g�����
	 * @param resultset ����Ώۂ̃��U���g�Z�b�g
	 */
	private void closeResultSet(ResultSet resultset){
		if (resultset == null) {
			return; 
		} 
		try{
			resultset.close();
			resultset = null;
		}
		catch (SQLException e){}
	}

}
