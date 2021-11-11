//------------------------------------------------------------------------------
/**
 * CLASS     : AC0060OdRelease �N���X
 * �t�@�C���E�N���X����
 * @author $Author: izukura $
 * @version $Revision: 1.2 $ $Date: 2007/04/06 07:44:26 $
 *
 */
//-----------------------------------------------------------------------------
package com.nec.jp.orteus.metamorBase.AC0060;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * ���v�� ����O���v��̃I�[�_�����ς��ǂ������m�F
 * �{�N���X�ł͕K���I�������𖾎��I�Ɏ��s����K�v������B
 */

public class AC0060OdRelease
{
	AC0060OdRelease(){}

	/**
	 * ����������
	 * @param conn DB�Ƃ̃R�l�N�V����
	 */
	public void initialize(Connection conn) throws SQLException
	{
		String sql
			= "select T_OD.\"OD_NO\" "
			+ "from T_OD,T_EXTERNAL_PLAN "
			+ "where "
			+ "T_OD.\"OD_NO\" = T_EXTERNAL_PLAN.\"OD_NO\" "
			+ "and T_OD.\"ODR_RELEASE_FLG\" != " + AC0060Const.C_RELEASE_YET + " "
			+ "and T_EXTERNAL_PLAN.\"EXTERNAL_PLAN_CD\" = ? ";
		_pstmt = conn.prepareStatement(sql);
	}
	/**
	 * �Y���O���v��ԍ��̃I�[�_�̂��� 1�ł��I�[�_�����ς݂����邩�ǂ���
	 * ���݂��Ȃ��O���v��ԍ��� �O���v��ԍ��ɐݒ肳��Ă���I�[�_�ԍ������݂��Ȃ��ꍇ
	 * �I�[�_�������Ƃ݂Ȃ��B
	 * @param extNo �O���v��ԍ�
	 * @return true:�I�[�_�����ς݂̃I�[�_��1���ȏ゠�� / false:�I�[�_�����ς݂̃I�[�_���Ȃ�
	 */
	public boolean isReleased(String odNo) throws SQLException
	{
		boolean result = false;
		_pstmt.setString(1,odNo);
		ResultSet rset = _pstmt.executeQuery();
		if(rset.next())  result = true;
		closeResultSet(rset);
		return result;
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
	/**
	 * �I������
	 * @param statement ����Ώۂ̃X�e�[�g�����g
	 */
	public void finalize()
	{
		if(_pstmt == null)  return;
		try{
			_pstmt.close();
			_pstmt = null;
		}
		catch (SQLException e){}
	}
	//--------------------------------------------------------------------------
	// ����
	private PreparedStatement _pstmt = null;
}
