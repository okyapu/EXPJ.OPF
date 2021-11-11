//------------------------------------------------------------------------------
/**
 * CLASS     : AZ0040DBUtil �N���X
 * �t�@�C���E�N���X����
 * @author $Author: suganuma $
 * @version $Revision: 1.1 $ $Date: 2005/03/09 06:49:40 $
 *
 */
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.AZ0040;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.expj.systemlog.SystemLog;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * �e�[�u���̃R�����g�A�J�����̃R�����g���擾����B<br>
 * �e�[�u���̃R�����g�A�J�����̃R�����g�̎擾���\�b�h�����s����O�ɂ� load���������Ă���K�v������B
 * load���s���Ă��Ȃ� �܂��� �������Ă��Ȃ��ꍇ�̕ԋp�l�͕ۏႵ�Ȃ��B
 */
public class AZ0040DBUtil 
{


	private HashMap _infoMap;
	private SystemLog _sysLog = null;
	private String _User_ID = null;

	//--------------------------------------------------------------------------
	// �\�z

	/** �R���X�g���N�^ */
	public AZ0040DBUtil()	{
	}

	public AZ0040DBUtil(SystemLog sysLog, String User_ID) //
	{
		_sysLog = sysLog;
		_User_ID = User_ID;
		
		clear();
	}

	//--------------------------------------------------------------------------
	// ���J�֐�
	//--------------------------------------------------------------------------
	
	/**
	 * @param conn DB�Ƃ̃R�l�N�V����
	 * @param list �e�[�u�����C�J���������ݒ肳�ꂽ���X�g
	 * @return �e�[�u���R�����g�C�J�����R�����g��ݒ肵�����X�g
	 */
	public boolean load(IDbConnection conn, List list) throws SQLException
	{
		//_sysLog.finest_d("AZ0040DBUtil�Fload", _User_ID);
		
		this.clear();
		if(conn == null) return false;

		PreparedStatement stmt = null;
		PreparedStatement stmt2 = null;
		ResultSet rset = null;
		String sql = null;
		String w_tableName = null;
		String w_tableComment = null;

		// �e�[�u���R�����g���擾����SQL�𐶐�
		sql = makeGetTableCommentSQL();
		stmt = (conn.getConn()).prepareStatement(sql);
        //�J�������C�R�����g,�J�����������擾����SQL 
        sql = makeGetColInfoSQL();
		stmt2 = (conn.getConn()).prepareStatement(sql);
		try {
			ArrayList temp_list1 = new ArrayList();
			ArrayList temp_list2 = new ArrayList();
			ArrayList temp_list3 = new ArrayList();
			check_point:
			for(int i=0; i< list.size(); i++)
			{
				//��������e�[�u�����̎��o��
				w_tableName = list.get(i).toString().toUpperCase();
				//DBInfo���쐬�ς݂̃e�[�u�����ǂ������`�F�b�N
				//���łɍ쐬�ς݂�������A�č쐬���Ȃ��B
				if(_infoMap.containsKey(w_tableName)) continue check_point;

				List columnlist = new ArrayList();
				AZ0040DBInfo l_COMMENT = new AZ0040DBInfo();

				// �e�[�u���R�����g�̎擾
				stmt.setString(1, w_tableName);
				rset = stmt.executeQuery();
				
				w_tableComment = "";
				if(rset.next()) {
					w_tableComment = rset.getString(1);
				}
				if(w_tableComment == null) {	//�e�[�u���R�����g���ݒ�̏ꍇ�A�e�[�u������ݒ�
					w_tableComment = w_tableName;
				}
				
				// �J������, �J��������,�R�����g���擾
                stmt2.setString(1, w_tableName); 
				rset = stmt2.executeQuery();
				// �擾�����������X�g�ɐݒ�
				while(rset.next())
				{
					temp_list1.add(rset.getString(1));	//�J������
					temp_list2.add(rset.getString(2));	//�J��������
					if (rset.getString(3) == null) {//�J�����R�����g
						temp_list3.add(rset.getString(1));	//�J�����R�����g���ݒ�̏ꍇ�A�J������
					} else {
						temp_list3.add(rset.getString(3));	//�J�����R�����g
					}
				}
				
				// �擾��������DBInfo�N���X�ɐݒ肷��
				l_COMMENT.setTablename(w_tableName);		//�e�[�u����
				l_COMMENT.setTableComment(w_tableComment);	//�e�[�u���R�����g
				l_COMMENT.setColumnNames(temp_list1);		//�J������
				l_COMMENT.setColumnTypes(temp_list2);		//�J��������
				l_COMMENT.setColumnComments(temp_list3);	//�J�����R�����g

				// ���X�g�ɒǉ�
				_infoMap.put(w_tableName,l_COMMENT);
				temp_list1.clear();
				temp_list2.clear();
				temp_list3.clear();
			}
			return true;
		}finally{
			this.closeResultSet(rset);
			this.closePreparedStatement(stmt);
			this.closePreparedStatement(stmt2);
		}
	}
	

	/**
	 * AZ0040DBInfo�N���X�̎擾<br>
	 * <br>
	 * @param tablename �e�[�u����
	 * @return AZ0040DBInfo�N���X �Y������e�[�u����������Ȃ��ꍇ null
	 */
	public AZ0040DBInfo getDBInfo(String tableName)
	{
		if(tableName == null)  return null;

		return (AZ0040DBInfo)_infoMap.get(tableName);

	}

	/**
	 * @param conn DB�Ƃ̃R�l�N�V����
	 * @param list �e�[�u�������ݒ肳�ꂽ���X�g
	 * @return �e�[�u���R�����g��ݒ肵�����X�g
	 * 
	 */
	// AZ0040DBUtil()�R���X�g���N�^�Ăяo����O��Ƃ���B
	// (�e�[�u���I����ʂ̃e�[�u���ꗗ�p)
	public ArrayList getTableComments(IDbConnection conn, List i_tlist) throws SQLException
	{
		ArrayList wl_comments = null;

		//�����`�F�b�N
		if(conn == null) return wl_comments;
		if (i_tlist.size() == 0 ) return wl_comments;
		
		wl_comments = new ArrayList(i_tlist.size());		//�e�[�u���R�����g�i�[�p���X�g
		PreparedStatement stmt = null;
		String sql = null;

		// �e�[�u���R�����g���擾����SQL�𐶐�
		sql = makeGetTableCommentSQL();
		stmt = (conn.getConn()).prepareStatement(sql);
		ResultSet rset = null;

		try {
			for(Iterator itr=i_tlist.iterator(); itr.hasNext();) {
				String w_tablename = itr.next().toString();
				stmt.setString(1,w_tablename);
				// �e�[�u���R�����g�̎擾
				rset = stmt.executeQuery();
				if(rset.next())	{
					if (rset.getString(1) == null) {
						wl_comments.add(w_tablename);	//�e�[�u���R�����g���ݒ�̏ꍇ
					} else {
						wl_comments.add(rset.getString(1));
					}
				}
			}
			rset.close();
			stmt.close();
			return wl_comments;
		} finally {
		}
	}
	
	/**
	 * �e�[�u���R�����g�̎擾<br>
	 * <br>
	 * @param tableName �e�[�u����
	 * @return �e�[�u���R�����g �Y������e�[�u���R�����g��������Ȃ��ꍇ null
	 */ 
	public String getTableComment(String tableName)
	{
		if(tableName == null)  return null;
		AZ0040DBInfo info = this.getDBInfo(tableName);	//�Y������DBInfo�����o��
		if(info == null) return null;

		return info.getTableComment();
	}
	
	/**
	 * �J�����R�����g�̎擾<br>
	 * <br>
	 * @param tableName �e�[�u����
	 * @param columnName �J������
	 * @return �J�����R�����g �Y������J�����R�����g��������Ȃ��ꍇ null
	 */
	public String getColumnComment(String tableName, String columnName)
	{
		if(tableName == null || tableName == null)  return null;
		AZ0040DBInfo info = this.getDBInfo(tableName);
		if(info == null) return null;

		return info.getColumnComment(columnName);
	}

	/**
	 * �J���������̎擾<br>
	 * <br>
	 * @param tableName �e�[�u����
	 * @param columnName �J������
	 * @return �J�������� �Y������J����������������Ȃ��ꍇ null
	 */
	public String getColumnType(String tableName, String columnName)
	{
		if(tableName == null || tableName == null)  return null;
		AZ0040DBInfo info = this.getDBInfo(tableName);
		if(info == null) return null;

		return info.getColumnType(columnName);
	}

	//-------------------------------------------------------------------
	//  �p�b�P�[�W���J�֐�
	//-------------------------------------------------------------------



	//-------------------------------------------------------------------
	//  ����J�֐�
	//-------------------------------------------------------------------
	/**
	 * �e�[�u�����̃R�����g���擾����SQL�����쐬����
	 *
	 * @return �e�[�u���R�����g�擾�pSQL��
	 */
	private String makeGetTableCommentSQL()
	{
		String sql = "SELECT comments FROM user_tab_comments " +
				     "WHERE table_name = ?";

		return sql;
	}

	/**
	 * �J�������̃R�����g�A�������擾����SQL�����쐬����
	 *
	 * @param tabNmae �J���������擾�������e�[�u����
	 * @return �f�[�^�擾�pSQL��
	 */
	private String makeGetColInfoSQL()
	{
		String sql = 
		"SELECT tab.column_name,tab.data_type,com.comments " +
		"FROM user_tab_columns tab, user_col_comments com " + 
		"WHERE  tab.table_name = ? and " +
				"tab.table_name = com.table_name and " +
				"tab.column_name = com.column_name " +
		"ORDER BY tab.column_id";

		return sql;
	}
	
	/**
	 * �v���y�A�h�X�e�[�g�����g�����
	 *
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
	 *
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
	
	/** �N���A */
	private void clear()
	{ 
		_infoMap = new HashMap();

	}
}
