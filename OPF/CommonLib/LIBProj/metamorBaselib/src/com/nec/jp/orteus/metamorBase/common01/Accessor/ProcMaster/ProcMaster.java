//------------------------------------------------------------------------------
// (#)ProcMaster.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/10/24 �V�K�쐬  K.Shiraki
// 2003/11/05 M.Isoda
//            �擾����Ɩ������d�����Ȃ��悤��SQL��ύX
// 2003/11/06 M.Isoda
//            �f�o�b�O�p�̃R�[�h���폜
//            javadoc�ɐ������������\�������悤�Ɋe���\�b�h�̃R�����g���C��
//            load���\�b�h�ɃN���[�Y������ǉ�
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.Accessor.ProcMaster;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import com.nec.jp.orteus.metamorBase.common01.Accessor.ProcMaster.ProcInformation;

/**
 * ����ID�Ə������̎擾���s���B<br>
 * ����ID�⏈�����̎擾���\�b�h�����s����O�ɂ� load���������Ă���K�v������B
 * load���s���Ă��Ȃ� �܂��� �������Ă��Ȃ��ꍇ�̕ԋp�l�͕ۏႵ�Ȃ��B
 */
public class ProcMaster
{
	//--------------------------------------------------------------------------
	// �\�z

	/** �R���X�g���N�^ */
	public ProcMaster(){ clear(); }

	//--------------------------------------------------------------------------
	// ����

	/**
	 * ����ID���̎捞<br>
	 * SCREEN_MST��BUSINESS_MST���� ����ID�ƋƖ�����ǂݍ���<br>
	 * �捞���͈ȉ��̃��[���ōs���B<br>
	 * &nbsp;&nbsp;SCREEN_MST�ɑ��݂� BUSINESS_MST�ɑ��݂��Ȃ��f�[�^: ��荞��<br>
	 * &nbsp;&nbsp;SCREEN_MST�ɑ��݂��� BUSINESS_MST�ɑ��݂���f�[�^: ��荞�܂Ȃ�<br>
	 * <br>
	 * @param conn DB�Ƃ̃R�l�N�V����
	 * @return true:���� / false:���s
	 */
	public boolean load(IDbConnection conn) throws SQLException
	{
		clear();
		if(conn == null) return false;

		PreparedStatement stmt = null;
		ResultSet rset = null;
		String sql =
			"select " +
			"screen_mst.screen_url, " +
			"business_mst.business_name " +
			"from " +
			"screen_mst, business_mst " +
			"where " +
			" business_mst.business_cd = screen_mst.business_cd and " +
			" business_mst.business_cd in ( " +
			" select "+
			"  min(business_mst.BUSINESS_CD) " +
			" from "+
			"  business_mst " +
			" group by "+
			"  business_mst.BUSINESS_NAME) "+
			"order by screen_mst.screen_url";

		try {
			String procid;
			stmt = (conn.getConn()).prepareStatement(sql);
			rset = stmt.executeQuery();

			while(rset.next()){
				ProcInformation info = new ProcInformation();

				// ����ID�ɕϊ��ł��Ȃ����͖���
				if((procid = url2proc(rset.getString(1))) == null)  continue;

				info.setId(procid);
				info.setName(rset.getString(2));
				_procs.add(info);
			}
		}finally{
			closeResultSet(rset);
			closePreparedStatement(stmt);
		}
		return true;
	}

	/**
	 * �������̎擾<br>
	 * <br>
	 * @param id ����ID
	 * @return ������ �Y�����鏈��ID��������Ȃ��ꍇ null
	 */
	public String getName(String id)
	{
		if(id == null)  return null;
		for(int n = 0; n < _procs.size(); n++){
			ProcInformation info = (ProcInformation)(_procs.get(n));
			if(id.equals(info.getId())) {
				return info.getName();
			}
		}

		return null;
	}
	/**
	 * ����ID�ꗗ�̎擾<br>
	 * �{���\�b�h�Ŏ擾��������ID�̏��� �������ꗗ�̎擾�Ŏ擾�����ꗗ�̏�����ۏႷ��B<br>
	 * <br>
	 * @return ����ID(String)�̃��X�g
	 */
	public ArrayList getIds()
	{
		ArrayList ids = new ArrayList(0);
		for(int n = 0; n < _procs.size(); n++){
			ProcInformation info = (ProcInformation)(_procs.get(n));
			ids.add(info.getId());
		}
		return ids;
	}
	/**
	 * �������ꗗ�̎擾<br>
	 * �{���\�b�h�Ŏ擾�����������̏��� ����ID�ꗗ�̎擾�Ŏ擾�����ꗗ�̏�����ۏႷ��B<br>
	 * <br>
	 * @return ������(String)�̃��X�g
	 */
	public ArrayList getNames()
	{
		ArrayList names = new ArrayList(0);
		for(int n = 0; n < _procs.size(); n++){
			ProcInformation info = (ProcInformation)(_procs.get(n));
			names.add(info.getName());
		}
		return names;
	}
	/** �N���A */
	public void clear(){ _procs = new ArrayList(0); }
	/**
	 * url������ID�ϊ�
	 *
	 * @param url URL  <����ID>Servlet�̌`���ł��邱��
	 * @return ����ID ����ID���s���Ȍ`���̂Ƃ� null
	 */
	private String url2proc(String url)
	{
		if(url == null) return null;
		int index;
		if((index = url.indexOf("Servlet")) < 0) return null;
		return url.substring(0, index);
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

	//--------------------------------------------------------------------------
	// ����

	/** ProcInformation���̏W�� */
	private ArrayList _procs;
}
