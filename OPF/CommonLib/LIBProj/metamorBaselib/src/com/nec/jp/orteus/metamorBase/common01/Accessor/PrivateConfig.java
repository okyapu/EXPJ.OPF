//------------------------------------------------------------------------------
// (#)PrivateConfig.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// version 1.00
// 2003/09/26 �V�K�쐬 Y.Mitsui
//
// version 1.01
// 2003/10/23 K.Shiraki
//            �J�[�\���N���[�Y�R��C��
//            SQL�����ۂɔ��s����ӏ���1�ӏ��ɏW��
//            ���l�^�����擾���� Integer�^�ւ̕ϊ��R��C��
//            ���l�^�����擾�� ����0���̂Ƃ����s(null)��ԋp����o�O�C��
//            �����擾�� 1�Ԗڂ̐ݒ�l���擾�s�ł�����ŕԋp����o�O�C��
//------------------------------------------------------------------------------
package com.nec.jp.orteus.metamorBase.common01.Accessor;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import java.sql.SQLException;
import java.lang.NumberFormatException;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

/**
 * SYS_PARAMETER�̐ݒ�l�擾�N���X <br>
 * <br>
 * �P�Ƃ̒l�擾�� NAME �̒l���w�肷��B <br>
 * <br>
 * �����̒l�̐ݒ�/�擾�� �ȉ��̂Ƃ���B <br>
 * NAME�Ɉȉ��̂悤�ɓo�^�� <br>
 * &nbsp;&nbsp; key + "_COUNT"  (�ݒ�l�̐�) <br>
 * &nbsp;&nbsp; key + "_" + n   (�e�ݒ�l�Bn��1�I���W��) <br>
 * key_n ��1�ł��s�����Ă���ꍇ �擾���s�Ƃ݂Ȃ�<br>
 * key_n �� key_COUNT �̐���葽���ݒ肳��Ă���ꍇ ������ COUNT�̐����ԋp<br>
 * �擾�̍ۂ� key�����������Ƃ��ēn���B
 *
 * @version 1.01
 */

public class PrivateConfig
{
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
	 * @param �擾�L�[
	 * @return �ݒ�l(�擾�Ɏ��s�����ꍇnull)
	 */
	public String getString(String name) throws SQLException
	{
		String stringValue = null;
		ResultSet result = null;
		PreparedStatement stmt = null;

		//�R�l�N�V�����A�����������ꍇ�͏������Ȃ�
		if(name == null || _conn == null) return null;

		try{
			//�ݒ�l����SQL�擾
			stmt = makeSQL(name);

			//����
			result = stmt.executeQuery();
			
			if(result.next()){
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
	 * @param �擾�L�[
	 * @return �ݒ�l(�擾�Ɏ��s/���l�ϊ����s�����ꍇnull)
	 */
	public Integer getNumber(String name) throws SQLException
	{
		String s = null;
		Integer integerValue = null;
		try{
			if((s = getString(name)) == null) return null;
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
	 * @param �擾�L�[�̃L�[���[�h
	 * @return �ݒ�l(String)�̃��X�g(�擾�Ɏ��s�����ꍇnull)
	 */
	public ArrayList getStrings(String key) throws SQLException
	{
		ArrayList list = null;

		//�R�l�N�V�����A�����������ꍇ�͏������Ȃ�
		if(key == null || _conn == null) return null;

		list = getStringList(key);

		return list;

	}

	/**
	 * �ݒ�l�擾(�����^�E�����ݒ�l)
	 * @param �擾�L�[�̃L�[���[�h
	 * @return �ݒ�l(Integer)�̃��X�g(�擾�Ɏ��s/���l�ϊ����s�����ꍇnull)
	 */
	public ArrayList getNumbers(String key) throws SQLException
	{
		ArrayList list = null;
		ArrayList intList = null;
		boolean bRet = false;

		//�R�l�N�V�����A�����������ꍇ�͏������Ȃ�
		if(key == null || _conn == null) return null;

		list = getStringList(key);
		if(list == null)  return null;
		try{
			intList = new ArrayList(0);
			for(int n = 0; n < list.size(); n++){
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
 	 * @param �擾�L�[�̃L�[���[�h
	 * @return �ݒ�l(Integer)�̃��X�g(�擾�Ɏ��s�����ꍇnull)
	 */
	private ArrayList getStringList(String key)  throws SQLException
	{
		ResultSet result = null;
		ArrayList list = null;
		String keyName = null;
		String counts = null;
		String each = null;

		try{
			// �ݒ萔���擾
			keyName = makeCountName(key);
			if((counts = getString(keyName)) != null){
				list = new ArrayList(0);
				int loopCnt = Integer.parseInt(counts);
				// �e�ݒ�l���擾
				for(int cnt = 0 ;cnt < loopCnt; cnt++){
					//�ݒ�l����SQL�擾(1�`�A��)
					keyName = makeSeqName(key, (cnt + 1));
					if((each = getString(keyName)) != null){
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
	 * @param �擾�L�[
	 * @return SQL
	 */
	private PreparedStatement makeSQL(String name) throws SQLException
	{
		PreparedStatement stmt = null;

		stmt = (_conn.getConn()).prepareStatement(_sqlSysParameterl);
		stmt.setString(1, name);

		return stmt;
	}

	/**
	 * �J�E���g�l�擾���̐���
	 * @param �擾�L�[
	 * @return �������R�[�h��`����
	 */
	private String makeCountName(String key)
	{
		return key + _ADD_NAME;
	}

	/**
	 * �ݒ�l�擾���̐���
	 * @param �擾�L�[
	 * @return �������R�[�h��`����
	 */
	private String makeSeqName(String key, int keyNo)
	{
		return key + "_" + keyNo;
	}
	/**
	 * �v���y�A�h�X�e�[�g�����g�����
	 * @param statement ����Ώۂ̃X�e�[�g�����g
	 */
	private void closePreparedStatement(PreparedStatement statement)
	{
		if(statement == null)  return;
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
	private void closeResultSet(ResultSet resultset)
	{
		if(resultset == null)  return;
		try{
			resultset.close();
			resultset = null;
		}
		catch (SQLException e){}
	}

	/** DB�Ƃ̃R�l�N�V���� */
	private IDbConnection _conn = null;

	/** �ݒ�l�쐬�p�t������ */
	private final String _ADD_NAME = "_COUNT";

	/** �ݒ�l�擾SQL */
	private final String _sqlSysParameterl =
		  "select SYS_PARAMETER.\"VALUE\" as \"VALUE\" "
		+ "from SYS_PARAMETER "
		+ "where SYS_PARAMETER.\"NAME\" = ? "
		+ "order by SYS_PARAMETER.\"NAME\"";

}
