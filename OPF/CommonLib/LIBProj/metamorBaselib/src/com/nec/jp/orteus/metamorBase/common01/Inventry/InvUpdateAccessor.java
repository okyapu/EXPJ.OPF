//------------------------------------------------------------------------------
// (#)InvUpdateAccessor.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2004/01/23 �V�K�쐬  M.Isoda
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.Inventry;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import java.util.List;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.nec.jp.orteus.xaf.util.FoundationException;
import com.nec.jp.orteus.metamorBase.common01.db.DBErrorMessage;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;

/**
 * �I���X�V�A�N�Z�b�T�N���X
 *
 * @author  M.Isoda
 * @version 1.00
*/
public class InvUpdateAccessor
{
//--------------------------------------------------------------------------
// �\�z

	/** �R���X�g���N�^ */
	public InvUpdateAccessor(){ clear(); }

	/** �R���X�g���N�^
	 *
	 * @param	strPlantCd		�H��R�[�h
	 * @param	strUserCd		���[�U�R�[�h
	 * @param	strProgramName	�v���O�������i�� AH0070B001�j
	 */
	public InvUpdateAccessor(
		String strPlantCd, 
		String strUserCd, 
		String strProgramName)
	{
		clear();
		_strPlantCd = strPlantCd;
		_strUserCd = strUserCd;
		_strProgramName = strProgramName;
		_msg = new InvMessageControl();
		_invCommon = new InvCommon();
	}

//--------------------------------------------------------------------------
// �ϐ�

	/** �H��R�[�h�i�[�p */
	private String _strPlantCd = null;

	/** ���[�U�R�[�h�i�[�p */
	private String _strUserCd = null;

	/** �v���O�������i�[�p */
	private String _strProgramName = null;

	/** ���b�Z�[�W�Ǘ��N���X */
	private InvMessageControl _msg = new InvMessageControl();

	/** ���ʃN���X */
	private InvCommon _invCommon = null;

//--------------------------------------------------------------------------
// ���ʃ��\�b�h

	////////////////////////////////////////////////////////////////////////////
	/**
	 * �N���A
	 *
	 * @return	�Ȃ�
	 */
	public void clear()
	{
		_strPlantCd = null;
		_strUserCd = null;
		_strProgramName = null;
		_msg = null;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * ���b�Z�[�W�Ǘ��N���X�ݒ�
	 *
	 * @param	���b�Z�[�W�Ǘ��N���X
	 */
	public void setMessage(InvMessageControl msg)
	{
		_msg = msg;
	}

	/**
	 * ���b�Z�[�W�Ǘ��N���X�擾
	 *
	 * @return	���b�Z�[�W�Ǘ��N���X
	 */
	public InvMessageControl getMessage()
	{
		return _msg;
	}

	/**
	 * �������ʃ��b�Z�[�W�Ǘ��N���X�����ݒ�
	 *
	 * @return	�Ȃ�
	 */
	public void initResultMessage()
	{
		_msg.clear();
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * �v���y�A�h�X�e�[�g�����g�����
	 *
	 * @param	statement	����Ώۂ̃X�e�[�g�����g
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
	 * @param	resultset	����Ώۂ̃��U���g�Z�b�g
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

	////////////////////////////////////////////////////////////////////////////
	/**
	 * �ۊǋ�ʕi�ڒI���Ǎ�(for update)
	 *
	 * @param	conn	DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	info	�p�����[�^���
	 * @return	���ꗗ:���� / null:���s
	 */
	protected List readItemInvTable4Update(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// �������ʃ��b�Z�[�W�Ǘ��N���X�����ݒ�
		List list = new ArrayList(0);
		PreparedStatement stmt = null;	// select
		ResultSet rset = null;			// ����
		try
		{
			stmt = conn.getConn().prepareStatement(_sqlItemInvTable4Update);
			stmt.setString(1, info.getINV_DATE());	// where
			stmt.setString(2, info.getPLANT_CD());	// where
			rset = stmt.executeQuery();
			while(rset.next() == true)
			{
				InvInformation infoTemp = new InvInformation();
				infoTemp.setITEM_CD(rset.getString(1));
				infoTemp.setWH_CD(rset.getString(2));
				infoTemp.setACTUAL_STOCK_QTY(rset.getString(3));
				infoTemp.setFINAL_BOOK_STOCK_QTY(rset.getString(4));
				list.add(infoTemp);
			}
		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// �G���[���ݒ�
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// �ڍ׏��
				+ " (SBM1076)�I����:[ " + info.getINV_DATE() + " ]"
				+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
			);
			list = null;
		}
		finally
		{
			closeResultSet(rset);
			closePreparedStatement(stmt);
		}
		return list;
	}
	////////////////////////////////////////////////////////////////////////////
	/**
	 * ���b�g�ʕi�ڒI���Ǎ�(for update)
	 *
	 * @param	conn	DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	info	�p�����[�^���
	 * @return	���ꗗ:���� / null:���s
	 */
	protected List readLotInvTable4Update(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// �������ʃ��b�Z�[�W�Ǘ��N���X�����ݒ�
		List list = new ArrayList(0);
		PreparedStatement stmt = null;	// select
		ResultSet rset = null;			// ����
		try
		{
			stmt = conn.getConn().prepareStatement(_sqlLotInvTable4Update);
			stmt.setString(1, info.getINV_DATE());	// where
			stmt.setString(2, info.getPLANT_CD());	// where
			rset = stmt.executeQuery();
			while(rset.next() == true)
			{
				InvInformation infoTemp = new InvInformation();
				infoTemp.setITEM_CD(rset.getString(1));
				infoTemp.setWH_CD(rset.getString(2));
				infoTemp.setACTUAL_STOCK_QTY(rset.getString(3));
				infoTemp.setFINAL_BOOK_STOCK_QTY(rset.getString(4));
				infoTemp.setLOT_NO(rset.getString(5));
				list.add(infoTemp);
			}
		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// �G���[���ݒ�
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// �ڍ׏��
				+ " (SBM1076)�I����:[ " + info.getINV_DATE() + " ]"
				+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
			);
			list = null;
		}
		finally
		{
			closeResultSet(rset);
			closePreparedStatement(stmt);
		}
		return list;
	}
	////////////////////////////////////////////////////////////////////////////
	/**
	 * �ۊǋ�ʕi�ڍ݌ɓǍ�(for update)
	 *
	 * @param	conn	DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	info	�p�����[�^���
	 * @return	���ꗗ:���� / null:���s
	 */
	protected List readItemStockTable4Update(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// �������ʃ��b�Z�[�W�Ǘ��N���X�����ݒ�
		List list = new ArrayList(0);
		PreparedStatement stmt = null;	// select
		ResultSet rset = null;			// ����
		try
		{
			stmt = conn.getConn().prepareStatement(_sqlItemStockTable4Update);

System.out.println(""
	+ "\n w) ITEM_CD�F" + info.getITEM_CD()
	+ "\n w) WH_CD�F" + info.getWH_CD()
	+ "\n w) PLANT_CD�F" + info.getPLANT_CD()
);

			stmt.setString(1, info.getITEM_CD());	// where
			stmt.setString(2, info.getWH_CD());		// where
			stmt.setString(3, info.getPLANT_CD());	// where
			rset = stmt.executeQuery();
			while(rset.next() == true)
			{
				InvInformation infoTemp = new InvInformation();
				infoTemp.setSTOCK_ON_HAND_QTY(rset.getString(1));
				list.add(infoTemp);
			}
		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// �G���[���ݒ�
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// �ڍ׏��
				+ " (SBM1142)�i�ڔԍ�:[ " + info.getITEM_CD() + " ]"
				+ " �ۊǋ�R�[�h:[ " + info.getWH_CD() + " ]"
				+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
			);
			list = null;
		}
		finally
		{
			closeResultSet(rset);
			closePreparedStatement(stmt);
		}
		return list;
	}

	
	/**
	 * ���b�g�ʕi�ڍ݌ɓǍ�(for update)
	 *
	 * @param	conn	DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	info	�p�����[�^���
	 * @return	���ꗗ:���� / null:���s
	 */
	protected List readLotStockTable4Update(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// �������ʃ��b�Z�[�W�Ǘ��N���X�����ݒ�
		List list = new ArrayList(0);
		PreparedStatement stmt = null;	// select
		ResultSet rset = null;			// ����
		try
		{
			stmt = conn.getConn().prepareStatement(_sqlLotStockTable4Update);

			System.out.println(""
				+ "\n w) ITEM_CD�F" + info.getITEM_CD()
				+ "\n w) WH_CD�F" + info.getWH_CD()
				+ "\n w) PLANT_CD�F" + info.getPLANT_CD()
			);

			stmt.setString(1, info.getITEM_CD());	// where
			stmt.setString(2, info.getWH_CD());		// where
			stmt.setString(3, info.getPLANT_CD());	// where
			stmt.setString(4, info.getLOT_NO());  // where
			rset = stmt.executeQuery();
			while(rset.next() == true)
			{
				InvInformation infoTemp = new InvInformation();
				infoTemp.setSTOCK_ON_HAND_QTY(rset.getString(1));
				list.add(infoTemp);
			}
		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// �G���[���ݒ�
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// �ڍ׏��
				+ " (SBM1143)�i�ڔԍ�:[ " + info.getITEM_CD() + " ]"
				+ " �ۊǋ�R�[�h:[ " + info.getWH_CD() + " ]"
				+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
				+ " �݌Ƀ��b�g�ԍ�:[ " + info.getLOT_NO() + " ]"
			);
			list = null;
		}
		finally
		{
			closeResultSet(rset);
			closePreparedStatement(stmt);
		}
		return list;
	}
	////////////////////////////////////////////////////////////////////////////
	/**
	 * �ۊǋ�ʕi�ڍ݌ɍX�V
	 *
	 * @param	conn	DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	info	�p�����[�^���
	 * @return	�������R�[�h��:���� / -1:���s
	 */
	protected int updateItemStockTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// �������ʃ��b�Z�[�W�Ǘ��N���X�����ݒ�
		int	intResultCount = -1;
		PreparedStatement stmt = null;	// update
		try {
			String strDateTime = _invCommon.readSystemDateTime(conn);
			stmt = conn.getConn().prepareStatement(_sqlUpdateItemStockTable);

			System.out.println(""
	+ "\n (SBM1148)s) �V�݌ɐ��F" + info.getSTOCK_ON_HAND_QTY()
	+ "\n s) strDateTime�F" + strDateTime
	+ "\n s) _strUserCd�F" + _strUserCd
	+ "\n s) _strProgramName�F" + _strProgramName
	+ "\n w) ITEM_CD�F" + info.getITEM_CD()
	+ "\n w) PLANT_CD�F" + info.getPLANT_CD()
	+ "\n w) WH_CD�F" + info.getWH_CD()
);

			stmt.setString(1, info.getSTOCK_ON_HAND_QTY());	// set
			stmt.setString(2, strDateTime);					// set
			stmt.setString(3, _strUserCd);					// set
			stmt.setString(4, _strProgramName);				// set
			stmt.setString(5, info.getITEM_CD());			// where
			stmt.setString(6, info.getWH_CD());				// where
			stmt.setString(7, info.getPLANT_CD());			// where

			intResultCount = stmt.executeUpdate();
		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// �G���[���ݒ�
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// �ڍ׏��
				+ " (SBM1142)�i�ڔԍ�:[ " + info.getITEM_CD() + " ]"
				+ " �ۊǋ�R�[�h:[ " + info.getWH_CD() + " ]"
				+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
			);
			intResultCount = -1;
		}
		finally
		{
			closePreparedStatement(stmt);
		}
		return intResultCount;
	}
	
	/**
	 * ���b�g�Ǘ��t���O���擾
	 *
	 * @param	conn	DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	info	�p�����[�^���
	 */
	protected void readLotCtrlFlg(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// �������ʃ��b�Z�[�W�Ǘ��N���X�����ݒ�
		PreparedStatement stmt = null;	// update
		ResultSet rset = null;			// ����
		try {
			stmt = conn.getConn().prepareStatement(_sqlGetLotCtrlFlg);
			
			System.out.println(""
				+ "\n w) ITEM_CD�F" + info.getITEM_CD()
			);
			
			stmt.setString(1, info.getITEM_CD());			// where
			rset = stmt.executeQuery();
			while(rset.next() == true)
			{
				info.setLOT_CTRL_FLG(rset.getString(1));
			}
		}
		catch(SQLException se)
		{
			se.printStackTrace();
			
			// �G���[���ݒ�
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// �ڍ׏��
				+ " (SBM0688)�i�ڔԍ�:[ " + info.getITEM_CD() + " ]"
			);
		}
		finally
		{
			closeResultSet(rset);
			closePreparedStatement(stmt);
		}
	}
	
	/**
	 * ���b�g�ʕi�ڍ݌ɍX�V
	 *
	 * @param	conn	DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	info	�p�����[�^���
	 * @return	�������R�[�h��:���� / -1:���s
	 */
	protected int updateLotStockTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// �������ʃ��b�Z�[�W�Ǘ��N���X�����ݒ�
		int	intResultCount = -1;
		PreparedStatement stmt = null;	// update
		try {
			String strDateTime = _invCommon.readSystemDateTime(conn);
			stmt = conn.getConn().prepareStatement(_sqlUpdateLotStockTable);

			System.out.println(""
				+ "\n (SBM1148)s) �V�݌ɐ��F" + info.getSTOCK_ON_HAND_QTY()
				+ "\n s) strDateTime�F" + strDateTime
				+ "\n s) _strUserCd�F" + _strUserCd
				+ "\n s) _strProgramName�F" + _strProgramName
				+ "\n w) ITEM_CD�F" + info.getITEM_CD()
				+ "\n w) PLANT_CD�F" + info.getPLANT_CD()
				+ "\n w) WH_CD�F" + info.getWH_CD()
			);

			stmt.setString(1, info.getSTOCK_ON_HAND_QTY());	// set
			stmt.setString(2, strDateTime);					// set
			stmt.setString(3, _strUserCd);					// set
			stmt.setString(4, _strProgramName);				// set
			stmt.setString(5, info.getITEM_CD());			// where
			stmt.setString(6, info.getWH_CD());				// where
			stmt.setString(7, info.getPLANT_CD());			// where
			stmt.setString(8, info.getLOT_NO());			// where
			intResultCount = stmt.executeUpdate();
		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// �G���[���ݒ�
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// �ڍ׏��
				+ " (SBM1142)�i�ڔԍ�:[ " + info.getITEM_CD() + " ]"
				+ " �ۊǋ�R�[�h:[ " + info.getWH_CD() + " ]"
				+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
			);
			intResultCount = -1;
		}
		finally
		{
			closePreparedStatement(stmt);
		}
		return intResultCount;
	}
	
	
	////////////////////////////////////////////////////////////////////////////
	/**
	 * �ۊǋ�ʕi�ڍ݌ɓo�^
	 *
	 * @param	conn	DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	info	�p�����[�^���
	 * @return	�������R�[�h��:���� / -1:���s
	 */
	protected int insertItemStockTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// �������ʃ��b�Z�[�W�Ǘ��N���X�����ݒ�
		int	intResultCount = -1;
		PreparedStatement stmt = null;	// insert
		try {
			String strDateTime = _invCommon.readSystemDateTime(conn);
			stmt = conn.getConn().prepareStatement(_sqlInsertItemStockTable);

System.out.println(""
	+ "\n s) ITEM_CD�F" + info.getITEM_CD()
	+ "\n s) WH_CD�F" + info.getWH_CD()
	+ "\n s) PLANT_CD�F" + info.getPLANT_CD()
	+ "\n s) STOCK_ON_HAND_QTY�F" + info.getSTOCK_ON_HAND_QTY()
	+ "\n s) strDateTime�F" + strDateTime
	+ "\n s) _strUserCd�F" + _strUserCd
	+ "\n s) _strProgramName�F" + _strProgramName
	+ "\n s) strDateTime�F" + strDateTime
	+ "\n s) _strUserCd�F" + _strUserCd
	+ "\n s) _strProgramName�F" + _strProgramName
);
			stmt.setString(1, info.getITEM_CD());			// set
			stmt.setString(2, info.getWH_CD());				// set
			stmt.setString(3, info.getPLANT_CD());			// set
			stmt.setString(4, info.getSTOCK_ON_HAND_QTY());	// set
			stmt.setString(5, strDateTime);					// set
			stmt.setString(6, _strUserCd);					// set
			stmt.setString(7, _strProgramName);				// set
			stmt.setString(8, strDateTime);					// set
			stmt.setString(9, _strUserCd);					// set
			stmt.setString(10, _strProgramName);			// set

			intResultCount = stmt.executeUpdate();
		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// �G���[���ݒ�
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// �ڍ׏��
				+ " (SBM1142)�i�ڔԍ�:[ " + info.getITEM_CD() + " ]"
				+ " �ۊǋ�R�[�h:[ " + info.getWH_CD() + " ]"
				+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
			);
			intResultCount = -1;
		}
		finally
		{
			closePreparedStatement(stmt);
		}
		return intResultCount;
	}

	
	/**
	 * ���b�g�ʕi�ڍ݌ɓo�^
	 *
	 * @param	conn	DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	info	�p�����[�^���
	 * @return	�������R�[�h��:���� / -1:���s
	 */
	protected int insertLotStockTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// �������ʃ��b�Z�[�W�Ǘ��N���X�����ݒ�
		int	intResultCount = -1;
		PreparedStatement stmt = null;	// insert
		try {
			String strDateTime = _invCommon.readSystemDateTime(conn);
			stmt = conn.getConn().prepareStatement(_sqlInsertLotStockTable);

			System.out.println(""
				+ "\n s) ITEM_CD�F" + info.getITEM_CD()
				+ "\n s) WH_CD�F" + info.getWH_CD()
				+ "\n s) PLANT_CD�F" + info.getPLANT_CD()
				+ "\n s) STOCK_ON_HAND_QTY�F" + info.getSTOCK_ON_HAND_QTY()
				+ "\n s) strDateTime�F" + strDateTime
				+ "\n s) _strUserCd�F" + _strUserCd
				+ "\n s) _strProgramName�F" + _strProgramName
				+ "\n s) strDateTime�F" + strDateTime
				+ "\n s) _strUserCd�F" + _strUserCd
				+ "\n s) _strProgramName�F" + _strProgramName
			);
			stmt.setString(1, info.getITEM_CD());			// set
			stmt.setString(2, info.getWH_CD());				// set
			stmt.setString(3, info.getPLANT_CD());			// set
			stmt.setString(4, info.getSTOCK_ON_HAND_QTY());	// set
			stmt.setString(5, strDateTime);					// set
			stmt.setString(6, _strUserCd);					// set
			stmt.setString(7, _strProgramName);				// set
			stmt.setString(8, strDateTime);					// set
			stmt.setString(9, _strUserCd);					// set
			stmt.setString(10, _strProgramName);			// set
			stmt.setString(11, info.getLOT_NO());			// set
			intResultCount = stmt.executeUpdate();
		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// �G���[���ݒ�
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// �ڍ׏��
				+ " (SBM1142)�i�ڔԍ�:[ " + info.getITEM_CD() + " ]"
				+ " �ۊǋ�R�[�h:[ " + info.getWH_CD() + " ]"
				+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
			);
			intResultCount = -1;
		}
		finally
		{
			closePreparedStatement(stmt);
		}
		return intResultCount;
	}
	////////////////////////////////////////////////////////////////////////////
	/**
	 * �ۊǋ�ʕi�ڒI���X�V
	 *
	 * @param	conn	DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	info	�I����
	 * @return	�������R�[�h��:���� / -1:���s
	 */
	protected int updateItemInvTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// �������ʃ��b�Z�[�W�Ǘ��N���X�����ݒ�
		int	intResultCount = -1;
		PreparedStatement stmt = null;	// update
		try {
			String strDateTime = _invCommon.readSystemDateTime(conn);
			stmt = conn.getConn().prepareStatement(_sqlUpdateItemInvTable);

System.out.println(""
	+ "\n s) INV_UPD_FLG�F" + info.getINV_UPD_FLG()
	+ "\n s) strDateTime�F" + strDateTime
	+ "\n s) _strUserCd�F" + _strUserCd
	+ "\n s) _strProgramName�F" + _strProgramName
	+ "\n w) INV_DATE�F" + info.getINV_DATE()
	+ "\n w) ITEM_CD�F" + info.getITEM_CD()
	+ "\n w) PLANT_CD�F" + info.getPLANT_CD()
	+ "\n w) WH_CD�F" + info.getWH_CD()
);

			stmt.setString(1, info.getINV_UPD_FLG());		// set
			stmt.setString(2, strDateTime);					// set
			stmt.setString(3, _strUserCd);					// set
			stmt.setString(4, _strProgramName);				// set
			stmt.setString(5, info.getINV_DATE());			// where
			stmt.setString(6, info.getPLANT_CD());			// where
			stmt.setString(7, info.getITEM_CD());			// where
			stmt.setString(8, info.getWH_CD());				// where

			intResultCount = stmt.executeUpdate();
		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// �G���[���ݒ�
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// �ڍ׏��
				+ " (SBM1114)�I����:[ " + info.getINV_DATE() + " ]"
				+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
				+ " �i�ڔԍ�:[ " + info.getITEM_CD() + " ]"
				+ " �ۊǋ�R�[�h:[ " + info.getWH_CD() + " ]"
			);
			intResultCount = -1;
		}
		finally
		{
			closePreparedStatement(stmt);
		}
		return intResultCount;
	}
	
	/**
	 * ���b�g�ʕi�ڒI���X�V
	 *
	 * @param	conn	DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	info	�I����
	 * @return	�������R�[�h��:���� / -1:���s
	 */
	protected int updateLotInvTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// �������ʃ��b�Z�[�W�Ǘ��N���X�����ݒ�
		int	intResultCount = -1;
		PreparedStatement stmt = null;	// update
		try {
			String strDateTime = _invCommon.readSystemDateTime(conn);
			stmt = conn.getConn().prepareStatement(_sqlUpdateLotInvTable);

			System.out.println(""
				+ "\n s) INV_UPD_FLG�F" + info.getINV_UPD_FLG()
				+ "\n s) strDateTime�F" + strDateTime
				+ "\n s) _strUserCd�F" + _strUserCd
				+ "\n s) _strProgramName�F" + _strProgramName
				+ "\n w) INV_DATE�F" + info.getINV_DATE()
				+ "\n w) ITEM_CD�F" + info.getITEM_CD()
				+ "\n w) PLANT_CD�F" + info.getPLANT_CD()
				+ "\n w) WH_CD�F" + info.getWH_CD()
			);

			stmt.setString(1, info.getINV_UPD_FLG());		// set
			stmt.setString(2, strDateTime);					// set
			stmt.setString(3, _strUserCd);					// set
			stmt.setString(4, _strProgramName);				// set
			stmt.setString(5, info.getINV_DATE());			// where
			stmt.setString(6, info.getPLANT_CD());			// where
			stmt.setString(7, info.getITEM_CD());			// where
			stmt.setString(8, info.getWH_CD());				// where
			stmt.setString(9, info.getLOT_NO());				// where

			intResultCount = stmt.executeUpdate();
		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// �G���[���ݒ�
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// �ڍ׏��
				+ " (SBM1114)�I����:[ " + info.getINV_DATE() + " ]"
				+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
				+ " �i�ڔԍ�:[ " + info.getITEM_CD() + " ]"
				+ " �ۊǋ�R�[�h:[ " + info.getWH_CD() + " ]"
			);
			intResultCount = -1;
		}
		finally
		{
			closePreparedStatement(stmt);
		}
		return intResultCount;
	}

	////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////
	/**
	 * �ۊǋ�ʐ��ԒI���Ǎ�(for update)
	 *
	 * @param	conn	DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	info	�p�����[�^���
	 * @return	���ꗗ:���� / null:���s
	 */
	protected List readJobOdrCdInvTable4Update(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// �������ʃ��b�Z�[�W�Ǘ��N���X�����ݒ�
		List list = new ArrayList(0);
		PreparedStatement stmt = null;
		ResultSet rset = null;
		try {
			stmt = (conn.getConn()).prepareStatement(_sqlReadJobOdrCdInvTable4Update);
			stmt.setString(1, info.getINV_DATE());	// where
			stmt.setString(2, info.getPLANT_CD());	// where
			rset = stmt.executeQuery();
			while(rset.next() == true)
			{
				InvInformation infoTemp = new InvInformation();
				infoTemp.setJOB_ODR_CD(rset.getString(1));				// select
				infoTemp.setITEM_CD(rset.getString(2));					// select
				infoTemp.setWH_CD(rset.getString(3));					// select
				infoTemp.setPLANT_CD(rset.getString(4));				// select
				infoTemp.setACTUAL_STOCK_QTY(rset.getString(5));		// select
				infoTemp.setFINAL_BOOK_STOCK_QTY(rset.getString(6));	// select
				list.add(infoTemp);
			}
		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// �G���[���ݒ�
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// �ڍ׏��
				+ " (SBM1076)�I����:[ " + info.getINV_DATE() + " ]"
				+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
			);
			list = null;
		}
		finally
		{
			closeResultSet(rset);
			closePreparedStatement(stmt);
		}
		return list;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * �ۊǋ�ʐ��ԍ݌ɓǍ�(for update)
	 *
	 * @param	conn	DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	info	�p�����[�^���
	 * @return	���ꗗ:���� / null:���s
	 */
	protected List readJobOdrCdStockTable4Update(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// �������ʃ��b�Z�[�W�Ǘ��N���X�����ݒ�
		List list = new ArrayList(0);
		PreparedStatement stmt = null;
		ResultSet rset = null;
		try {
			stmt = (conn.getConn()).prepareStatement(_sqlReadJobOdrCdStockTable4Update);

System.out.println(""
	+ "\n w) JOB_ODR_CD�F" + info.getJOB_ODR_CD()
	+ "\n w) ITEM_CD�F" + info.getITEM_CD()
	+ "\n w) WH_CD�F" + info.getWH_CD()
	+ "\n w) PLANT_CD�F" + info.getPLANT_CD()
);
			stmt.setString(1, info.getJOB_ODR_CD());	// where
			stmt.setString(2, info.getITEM_CD());		// where
			stmt.setString(3, info.getWH_CD());			// where
			stmt.setString(4, info.getPLANT_CD());		// where
			rset = stmt.executeQuery();
			while(rset.next() == true)
			{
				InvInformation infoTemp = new InvInformation();
				infoTemp.setSTOCK_ON_HAND_QTY(rset.getString(1));	// select
				list.add(infoTemp);
			}
		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// �G���[���ݒ�
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// �ڍ׏��
				+ " (SBM1145)����:[ " + info.getJOB_ODR_CD() + " ]"
				+ " �i�ڔԍ�:[ " + info.getITEM_CD() + " ]"
				+ " �ۊǋ�R�[�h:[ " + info.getWH_CD() + " ]"
				+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
			);
			list = null;
		}
		finally
		{
			closeResultSet(rset);
			closePreparedStatement(stmt);
		}
		return list;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * �ۊǋ�ʐ��ԍ݌ɍX�V
	 *
	 * @param	conn	DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	info	�p�����[�^���
	 * @return	�������R�[�h��:���� / -1:���s
	 */
	protected int updateJobOdrCdStockTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// �������ʃ��b�Z�[�W�Ǘ��N���X�����ݒ�
		int	intResultCount = -1;
		PreparedStatement stmt = null;
		try
		{
			String strDateTime = _invCommon.readSystemDateTime(conn);
			stmt = conn.getConn().prepareStatement(_sqlUpdateJobOdrCdStockTable);

			System.out.println(""
	+ "\n (SBM1144)s) �V�݌ɐ��F" + info.getSTOCK_ON_HAND_QTY()
	+ "\n s) strDateTime�F" + strDateTime
	+ "\n s) _strUserCd�F" + _strUserCd
	+ "\n s) _strProgramName�F" + _strProgramName
	+ "\n w) JOB_ODR_CD�F" + info.getJOB_ODR_CD()
	+ "\n w) ITEM_CD�F" + info.getITEM_CD()
	+ "\n w) PLANT_CD�F" + info.getPLANT_CD()
	+ "\n w) WH_CD�F" + info.getWH_CD()
);

			stmt.setString(1, info.getSTOCK_ON_HAND_QTY());	// set
			stmt.setString(2, strDateTime);					// set
			stmt.setString(3, _strUserCd);					// set
			stmt.setString(4, _strProgramName);				// set
			stmt.setString(5, info.getJOB_ODR_CD());		// where
			stmt.setString(6, info.getITEM_CD());			// where
			stmt.setString(7, info.getWH_CD());				// where
			stmt.setString(8, info.getPLANT_CD());			// where

			intResultCount = stmt.executeUpdate();
		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// �G���[���ݒ�
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// �ڍ׏��
				+ " (SBM1145)����:[ " + info.getJOB_ODR_CD() + " ]"
				+ " �i�ڔԍ�:[ " + info.getITEM_CD() + " ]"
				+ " �ۊǋ�R�[�h:[ " + info.getWH_CD() + " ]"
				+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
			);
			intResultCount = -1;
		}
		finally
		{
			closePreparedStatement(stmt);
		}
		return intResultCount;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * �ۊǋ�ʐ��ԍ݌ɓo�^
	 *
	 * @param	conn	DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	info	�p�����[�^���
	 * @return	�������R�[�h��:���� / -1:���s
	 */
	protected int insertJobOdrCdStockTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// �������ʃ��b�Z�[�W�Ǘ��N���X�����ݒ�
		int	intResultCount = -1;
		PreparedStatement stmt = null;
		try
		{
			String strDateTime = _invCommon.readSystemDateTime(conn);
			stmt = conn.getConn().prepareStatement(_sqlInsertJobOdrCdStockTable);

System.out.println(""
	+ "\n s) JOB_ODR_CD�F" + info.getJOB_ODR_CD()
	+ "\n s) ITEM_CD�F" + info.getITEM_CD()
	+ "\n s) WH_CD�F" + info.getWH_CD()
	+ "\n s) PLANT_CD�F" + info.getPLANT_CD()
	+ "\n s) STOCK_ON_HAND_QTY�F" + info.getSTOCK_ON_HAND_QTY()
	+ "\n s) strDateTime�F" + strDateTime
	+ "\n s) _strUserCd�F" + _strUserCd
	+ "\n s) _strProgramName�F" + _strProgramName
	+ "\n s) strDateTime�F" + strDateTime
	+ "\n s) _strUserCd�F" + _strUserCd
	+ "\n s) _strProgramName�F" + _strProgramName
);

			stmt.setString(1, info.getJOB_ODR_CD());		// set
			stmt.setString(2, info.getITEM_CD());			// set
			stmt.setString(3, info.getWH_CD());				// set
			stmt.setString(4, info.getPLANT_CD());			// set
			stmt.setString(5, info.getSTOCK_ON_HAND_QTY());	// set
			stmt.setString(6, strDateTime);					// set
			stmt.setString(7, _strUserCd);					// set
			stmt.setString(8, _strProgramName);				// set
			stmt.setString(9, strDateTime);					// set
			stmt.setString(10, _strUserCd);					// set
			stmt.setString(11, _strProgramName);			// set

			intResultCount = stmt.executeUpdate();
		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// �G���[���ݒ�
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// �ڍ׏��
				+ " (SBM1145)����:[ " + info.getJOB_ODR_CD() + " ]"
				+ " �i�ڔԍ�:[ " + info.getITEM_CD() + " ]"
				+ " �ۊǋ�R�[�h:[ " + info.getWH_CD() + " ]"
				+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
			);
			intResultCount = -1;
		}
		finally
		{
			closePreparedStatement(stmt);
		}
		return intResultCount;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * �ۊǋ�ʐ��ԒI���X�V
	 *
	 * @param	conn	DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	info	�I����
	 * @return	�������R�[�h��:���� / -1:���s
	 */
	protected int updateJobOdrCdInvTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// �������ʃ��b�Z�[�W�Ǘ��N���X�����ݒ�
		int	intResultCount = -1;
		PreparedStatement stmt = null;
		try
		{
			String strDateTime = _invCommon.readSystemDateTime(conn);
			stmt = conn.getConn().prepareStatement(_sqlUpdateJobOdrCdInvTable);

System.out.println(""
	+ "\n s) INV_UPD_FLG�F" + info.getINV_UPD_FLG()
	+ "\n s) strDateTime�F" + strDateTime
	+ "\n s) _strUserCd�F" + _strUserCd
	+ "\n s) _strProgramName�F" + _strProgramName
	+ "\n w) INV_DATE�F" + info.getINV_DATE()
	+ "\n w) PLANT_CD�F" + info.getPLANT_CD()
	+ "\n w) JOB_ODR_CD�F" + info.getJOB_ODR_CD()
	+ "\n w) ITEM_CD�F" + info.getITEM_CD()
	+ "\n w) WH_CD�F" + info.getWH_CD()
);
			stmt.setString(1, info.getINV_UPD_FLG());		// set
			stmt.setString(2, strDateTime);					// set
			stmt.setString(3, _strUserCd);					// set
			stmt.setString(4, _strProgramName);				// set
			stmt.setString(5, info.getINV_DATE());			// where
			stmt.setString(6, info.getPLANT_CD());			// where
			stmt.setString(7, info.getJOB_ODR_CD());		// where
			stmt.setString(8, info.getITEM_CD());			// where
			stmt.setString(9, info.getWH_CD());				// where
			intResultCount = stmt.executeUpdate();

		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// �G���[���ݒ�
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// �ڍ׏��
				+ " (SBM1115)�I����:[ " + info.getINV_DATE() + " ]"
				+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
				+ " ����:[ " + info.getJOB_ODR_CD() + " ]"
				+ " �i�ڔԍ�:[ " + info.getITEM_CD() + " ]"
				+ " �ۊǋ�R�[�h:[ " + info.getWH_CD() + " ]"
			);
			intResultCount = -1;
		}
		finally
		{
			closePreparedStatement(stmt);
		}
		return intResultCount;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * �I������Ǎ�(for update)
	 *
	 * @param	conn	DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	info	�I����
	 * @return	���ꗗ:���� / null:���s
	 */
	protected List readInvCtrlTable4Update(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// �������ʃ��b�Z�[�W�Ǘ��N���X�����ݒ�
		List list = new ArrayList(0);
		PreparedStatement stmt = null;
		ResultSet rset = null;
		try {
			stmt = (conn.getConn()).prepareStatement(_sqlReadInvCtrlTable4Update);
			stmt.setString(1, info.getINV_DATE());	// where
			stmt.setString(2, info.getPLANT_CD());	// where
			rset = stmt.executeQuery();
			while(rset.next() == true)
			{
				InvInformation infoTemp = new InvInformation();
				infoTemp.setREGULAR_INV_FLG(rset.getString(1));	// select
				infoTemp.setCYCLE_INV_FLG(rset.getString(2));	// select
				infoTemp.setTEMP_INV_FLG(rset.getString(3));	// select
				infoTemp.setINV_STS_TYP(rset.getString(4));		// select
				list.add(infoTemp);
			}
		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// �G���[���ݒ�
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// �ڍ׏��
				+ " (SBM1076)�I����:[ " + info.getINV_DATE() + " ]"
				+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
			);
			list = null;
		}
		finally
		{
			closeResultSet(rset);
			closePreparedStatement(stmt);
		}
		return list;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * �I������X�V
	 *
	 * @param	conn	DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	info	�I����
	 * @return	�������R�[�h��:���� / -1:���s
	 */
	protected int updateInvCtrlTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// �������ʃ��b�Z�[�W�Ǘ��N���X�����ݒ�
		int	intResultCount = -1;
		PreparedStatement stmt = null;
		try
		{
			String strDateTime = _invCommon.readSystemDateTime(conn);
			stmt = conn.getConn().prepareStatement(_sqlUpdateInvCtrlTable4InvUpdate);

			stmt.setString(1, info.getINV_STS_TYP());		// set
			stmt.setString(2, strDateTime);					// set
			stmt.setString(3, strDateTime);					// set
			stmt.setString(4, _strUserCd);					// set
			stmt.setString(5, _strProgramName);				// set
			stmt.setString(6, info.getINV_DATE());			// where
			stmt.setString(7, info.getPLANT_CD());			// where
			intResultCount = stmt.executeUpdate();
		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// �G���[���ݒ�
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// �ڍ׏��
				+ " (SBM1076)�I����:[ " + info.getINV_DATE() + " ]"
				+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
			);
			intResultCount = -1;
		}
		finally
		{
			closePreparedStatement(stmt);
		}
		return intResultCount;
	}

	////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////
	/**
	 * �ۊǋ�ʓ��o�ɓǍ�
	 *
	 * @param	conn	DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	info	�p�����[�^���
	 * @return	���ꗗ:���� / null:���s
	 */
	protected List readRcvIssueTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// �������ʃ��b�Z�[�W�Ǘ��N���X�����ݒ�
		List list = new ArrayList(0);
		PreparedStatement stmt = null;
		ResultSet rset = null;
		try {
			stmt = (conn.getConn()).prepareStatement(_sqlReadRcvIssueTable);
System.out.println("--_sqlReadRcvIssueTable--");
System.out.println(""
	+ "\n w) INV_DATE�F" + info.getINV_DATE()
	+ "\n w) PLANT_CD�F" + info.getPLANT_CD()
	+ "\n w) JOB_ODR_CD�F" + info.getJOB_ODR_CD()
	+ "\n w) ITEM_CD�F" + info.getITEM_CD()
	+ "\n w) WH_CD�F" + info.getWH_CD()
);

			stmt.setString(1, info.getINV_DATE());		// where
			stmt.setString(2, info.getPLANT_CD());		// where
			stmt.setString(3, info.getJOB_ODR_CD());	// where
			stmt.setString(4, info.getITEM_CD());		// where
			stmt.setString(5, info.getWH_CD());			// where
			rset = stmt.executeQuery();
			while(rset.next() == true)
			{
				InvInformation infoTemp = new InvInformation();
				infoTemp.setw_SUM_RCV_ISSUE_QTY(rset.getString(1));	// select
				list.add(infoTemp);
			}
		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// �G���[���ݒ�
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// �ڍ׏��
				+ " (SBM1115)�I����:[ " + info.getINV_DATE() + " ]"
				+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
				+ " ����:[ " + info.getJOB_ODR_CD() + " ]"
				+ " �i�ڔԍ�:[ " + info.getITEM_CD() + " ]"
				+ " �ۊǋ�R�[�h:[ " + info.getWH_CD() + " ]"
			);
			list = null;
		}
		finally
		{
			closeResultSet(rset);
			closePreparedStatement(stmt);
		}
		return list;
	}

	
	/**
	 * ���b�g�ʓ��o�ɓǍ�
	 *
	 * @param	conn	DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	info	�p�����[�^���
	 * @return	���ꗗ:���� / null:���s
	 */
	protected List readLotRcvIssueTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// �������ʃ��b�Z�[�W�Ǘ��N���X�����ݒ�
		List list = new ArrayList(0);
		PreparedStatement stmt = null;
		ResultSet rset = null;
		try {
			stmt = (conn.getConn()).prepareStatement(_sqlReadLotRcvIssueTable);
			System.out.println("--_sqlReadLotRcvIssueTable--");
			System.out.println(""
				+ "\n w) INV_DATE�F" + info.getINV_DATE()
				+ "\n w) PLANT_CD�F" + info.getPLANT_CD()
				+ "\n w) JOB_ODR_CD�F" + info.getJOB_ODR_CD()
				+ "\n w) ITEM_CD�F" + info.getITEM_CD()
				+ "\n w) WH_CD�F" + info.getWH_CD()
			);

			stmt.setString(1, info.getINV_DATE());		// where
			stmt.setString(2, info.getPLANT_CD());		// where
			stmt.setString(3, info.getLOT_NO());		// where
			stmt.setString(4, info.getJOB_ODR_CD());	// where
			stmt.setString(5, info.getITEM_CD());		// where
			stmt.setString(6, info.getWH_CD());			// where
			rset = stmt.executeQuery();
			while(rset.next() == true)
			{
				InvInformation infoTemp = new InvInformation();
				infoTemp.setw_SUM_RCV_ISSUE_QTY(rset.getString(1));	// select
				list.add(infoTemp);
			}
		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// �G���[���ݒ�
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// �ڍ׏��
				+ " (SBM1115)�I����:[ " + info.getINV_DATE() + " ]"
				+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
				+ " ����:[ " + info.getJOB_ODR_CD() + " ]"
				+ " �i�ڔԍ�:[ " + info.getITEM_CD() + " ]"
				+ " �ۊǋ�R�[�h:[ " + info.getWH_CD() + " ]"
			);
			list = null;
		}
		finally
		{
			closeResultSet(rset);
			closePreparedStatement(stmt);
		}
		return list;
	}
	////////////////////////////////////////////////////////////////////////////
	/**
	 * �ۊǋ�ʓ��o�ɍX�V
	 *
	 * @param	conn	DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	info	�p�����[�^���
	 * @return	�������R�[�h��:���� / -1:���s
	 */
	protected int insertRcvIssueTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// �������ʃ��b�Z�[�W�Ǘ��N���X�����ݒ�
		int	intResultCount = -1;
		PreparedStatement stmt = null;
		try
		{
			String strDateTime = _invCommon.readSystemDateTime(conn);
			stmt = conn.getConn().prepareStatement(_sqlInsertRcvIssueTable);

System.out.println(""
	+ "\n s) RCV_ISSUE_CTRL_CD�F" + info.getRCV_ISSUE_CTRL_CD()
	+ "\n s) RCV_ISSUE_TYP�F" + info.getRCV_ISSUE_TYP()
	+ "\n s) ITEM_CD�F" + info.getITEM_CD()
	+ "\n s) PLANT_CD�F" + info.getPLANT_CD()
	+ "\n s) WH_CD�F" + info.getWH_CD()
	+ "\n s) JOB_ODR_CD�F" + info.getJOB_ODR_CD()
	+ "\n s) RCV_ISSUE_QTY�F" + info.getRCV_ISSUE_QTY()
	+ "\n s) RCV_ISSUE_DATE�F" + info.getRCV_ISSUE_DATE()
	+ "\n s) RCV_ISSUE_GNR_TYP�F" + info.getRCV_ISSUE_GNR_TYP()
	+ "\n s) STOCK_UPD_TYP�F" + info.getSTOCK_UPD_TYP()
	+ "\n s) RCV_ISSUE_CMPLT_FLG�F" + info.getRCV_ISSUE_CMPLT_FLG()
	+ "\n s) COMPANY_CD�F" + info.getCOMPANY_CD()
	+ "\n s) strDateTime�F" + strDateTime
	+ "\n s) _strUserCd�F" + _strUserCd
	+ "\n s) _strProgramName�F" + _strProgramName
	+ "\n s) strDateTime�F" + strDateTime
	+ "\n s) _strUserCd�F" + _strUserCd
	+ "\n s) _strProgramName�F" + _strProgramName
);
			stmt.setString(1, info.getRCV_ISSUE_CTRL_CD());		// set
			stmt.setString(2, info.getRCV_ISSUE_TYP());			// set
			stmt.setString(3, info.getITEM_CD());				// set
			stmt.setString(4, info.getPLANT_CD());				// set
			stmt.setString(5, info.getWH_CD());					// set
			stmt.setString(6, info.getJOB_ODR_CD());			// set
			stmt.setString(7, info.getRCV_ISSUE_QTY());			// set
			stmt.setString(8, info.getRCV_ISSUE_DATE());		// set
			stmt.setString(9, info.getRCV_ISSUE_GNR_TYP());		// set
			stmt.setString(10, info.getSTOCK_UPD_TYP());		// set
			stmt.setString(11, info.getRCV_ISSUE_CMPLT_FLG());	// set
			stmt.setString(12, info.getCOMPANY_CD());			// set
			stmt.setString(13, strDateTime);					// set
			stmt.setString(14, _strUserCd);						// set
			stmt.setString(15, _strProgramName);				// set
			stmt.setString(16, strDateTime);					// set
			stmt.setString(17, _strUserCd);						// set
			stmt.setString(18, _strProgramName);				// set
			stmt.setString(19, info.getSAVE_STOCK_HAND_QTY());	// set
			stmt.setString(20, Calculate.add(info.getSAVE_STOCK_HAND_QTY(),
					info.getRCV_ISSUE_QTY()));	// set

			intResultCount = stmt.executeUpdate();
		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// �G���[���ݒ�
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// �ڍ׏��
				+ " (SBM1145)����:[ " + info.getJOB_ODR_CD() + " ]"
				+ " �i�ڔԍ�:[ " + info.getITEM_CD() + " ]"
				+ " �ۊǋ�R�[�h:[ " + info.getWH_CD() + " ]"
				+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
			);
			intResultCount = -1;
		}
		finally
		{
			closePreparedStatement(stmt);
		}
		return intResultCount;
	}
	
	/**
	 * �ۊǋ�ʓ��o�ɍX�V
	 *
	 * @param	conn	DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	info	�p�����[�^���
	 * @return	�������R�[�h��:���� / -1:���s
	 */
	protected int insertLotRcvIssueTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// �������ʃ��b�Z�[�W�Ǘ��N���X�����ݒ�
		int	intResultCount = -1;
		PreparedStatement stmt = null;
		try
		{
			String strDateTime = _invCommon.readSystemDateTime(conn);
			stmt = conn.getConn().prepareStatement(_sqlInsertLotRcvIssueTable);

			System.out.println(""
				+ "\n s) RCV_ISSUE_CTRL_CD�F" + info.getRCV_ISSUE_CTRL_CD()
				+ "\n s) RCV_ISSUE_TYP�F" + info.getRCV_ISSUE_TYP()
				+ "\n s) ITEM_CD�F" + info.getITEM_CD()
				+ "\n s) PLANT_CD�F" + info.getPLANT_CD()
				+ "\n s) WH_CD�F" + info.getWH_CD()
				+ "\n s) JOB_ODR_CD�F" + info.getJOB_ODR_CD()
				+ "\n s) RCV_ISSUE_QTY�F" + info.getRCV_ISSUE_QTY()
				+ "\n s) RCV_ISSUE_DATE�F" + info.getRCV_ISSUE_DATE()
				+ "\n s) RCV_ISSUE_GNR_TYP�F" + info.getRCV_ISSUE_GNR_TYP()
				+ "\n s) STOCK_UPD_TYP�F" + info.getSTOCK_UPD_TYP()
				+ "\n s) RCV_ISSUE_CMPLT_FLG�F" + info.getRCV_ISSUE_CMPLT_FLG()
				+ "\n s) COMPANY_CD�F" + info.getCOMPANY_CD()
				+ "\n s) strDateTime�F" + strDateTime
				+ "\n s) _strUserCd�F" + _strUserCd
				+ "\n s) _strProgramName�F" + _strProgramName
				+ "\n s) strDateTime�F" + strDateTime
				+ "\n s) _strUserCd�F" + _strUserCd
				+ "\n s) _strProgramName�F" + _strProgramName
			);
			stmt.setString(1, info.getRCV_ISSUE_CTRL_CD());		// set
			stmt.setString(2, info.getRCV_ISSUE_TYP());			// set
			stmt.setString(3, info.getITEM_CD());				// set
			stmt.setString(4, info.getPLANT_CD());				// set
			stmt.setString(5, info.getWH_CD());					// set
			stmt.setString(6, info.getJOB_ODR_CD());			// set
			stmt.setString(7, info.getRCV_ISSUE_QTY());			// set
			stmt.setString(8, info.getRCV_ISSUE_DATE());		// set
			stmt.setString(9, info.getRCV_ISSUE_GNR_TYP());		// set
			stmt.setString(10, info.getSTOCK_UPD_TYP());		// set
			stmt.setString(11, info.getRCV_ISSUE_CMPLT_FLG());	// set
			stmt.setString(12, info.getCOMPANY_CD());			// set
			stmt.setString(13, strDateTime);					// set
			stmt.setString(14, _strUserCd);						// set
			stmt.setString(15, _strProgramName);				// set
			stmt.setString(16, strDateTime);					// set
			stmt.setString(17, _strUserCd);						// set
			stmt.setString(18, _strProgramName);				// set
			stmt.setString(19, info.getSAVE_STOCK_HAND_QTY());	// set
			stmt.setString(20, Calculate.add(info.getSAVE_STOCK_HAND_QTY(),
					info.getRCV_ISSUE_QTY()));	// set
			stmt.setString(21, info.getLOT_NO()); // set

			intResultCount = stmt.executeUpdate();
		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// �G���[���ݒ�
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// �ڍ׏��
				+ " (SBM1145)����:[ " + info.getJOB_ODR_CD() + " ]"
				+ " �i�ڔԍ�:[ " + info.getITEM_CD() + " ]"
				+ " �ۊǋ�R�[�h:[ " + info.getWH_CD() + " ]"
				+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
			);
			intResultCount = -1;
		}
		finally
		{
			closePreparedStatement(stmt);
		}
		return intResultCount;
	}
	////////////////////////////////////////////////////////////////////////////
	/**
	 * ���o�ɊǗ��ԍ������̔ԏ���
	 *
	 * @param	conn	DB�A�N�Z�X�p�̃R�l�N�V����
	 * @return	�̔Ԃ��ꂽ���o�ɊǗ��ԍ�:���� / null:���s
	 */
	protected String getRcvIssueCtrlCd(
		IDbConnection conn)
	{
		initResultMessage();	// �������ʃ��b�Z�[�W�Ǘ��N���X�����ݒ�
		String ctrlCd = null;
		try
		{
			Numbering numbering = new Numbering(
				conn, Numbering.ISSUE_CD, _strUserCd, _strProgramName, _strPlantCd);
			ctrlCd = numbering.getNo();
		}
		catch(FoundationException fe)
		{
			// �G���[
			fe.printStackTrace();
			ctrlCd = null;
		}
		if(ctrlCd == null)
		{
			// �G���[���ݒ�
			_msg.add(InvMessageControl.TYP_ERROR, "AH00038", ""
				// �ڍ׏��
				+ " (SBM1146)���[�UID:[ " + _strUserCd + " ]"
				+ " �Ɩ���:[ " + _strProgramName + " ]"
				+ " �H��R�[�h:[ " + _strPlantCd + " ]"
			);
		}
		return ctrlCd;
	}

//------------------------------------------------------------------------------------
// SQL��`

	////////////////////////////////////////////////////////////////////////////
	// �i�ڒI��

	/** �ۊǋ�ʕi�ڒI���Ǎ�(for update) */
	private String _sqlItemInvTable4Update = ""
+"select "
+" T_ITEM_INV.ITEM_CD as ITEM_CD "
+",T_ITEM_INV.WH_CD as WH_CD "
+",TO_CHAR(T_ITEM_INV.ACTUAL_STOCK_QTY, 'fm99999999999990.0999') as ACTUAL_STOCK_QTY "
+",TO_CHAR(T_ITEM_INV.FINAL_BOOK_STOCK_QTY, 'fm99999999999990.0999') as FINAL_BOOK_STOCK_QTY "
+"from "
+" T_ITEM_INV "
+"where "
+" T_ITEM_INV.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+" and T_ITEM_INV.PLANT_CD = ? "
+" and T_ITEM_INV.INV_UPD_FLG = '0' "
+"for update nowait ";
	
	
	/** �ۊǋ�ʕi�ڒI���Ǎ�(for update) */
	private String _sqlLotInvTable4Update = ""
+"select "
+" T_LOT_INV.ITEM_CD as ITEM_CD "
+",T_LOT_INV.WH_CD as WH_CD "
+",TO_CHAR(T_LOT_INV.ACTUAL_STOCK_QTY, 'fm99999999999990.0999') as ACTUAL_STOCK_QTY "
+",TO_CHAR(T_LOT_INV.FINAL_BOOK_STOCK_QTY, 'fm99999999999990.0999') as FINAL_BOOK_STOCK_QTY "
+",T_LOT_INV.LOT_NO as LOT_NO "
+"from "
+" T_LOT_INV "
+"where "
+" T_LOT_INV.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+" and T_LOT_INV.PLANT_CD = ? "
+" and T_LOT_INV.INV_UPD_FLG = '0' "
+"for update nowait ";

	/** �ۊǋ�ʕi�ڍ݌ɓǍ�(for update) */
	private String _sqlItemStockTable4Update = ""
+"select "
+" TO_CHAR(T_ITEM_STOCK.STOCK_ON_HAND_QTY, 'fm99999999999990.0999') as STOCK_ON_HAND_QTY "
+"from "
+" T_ITEM_STOCK "
+"where "
+" T_ITEM_STOCK.ITEM_CD = ? "
+" and T_ITEM_STOCK.WH_CD = ? "
+" and T_ITEM_STOCK.PLANT_CD = ? "
+"for update nowait ";
	
	/** ���b�g�ʕi�ڍ݌ɓǍ�(for update) */
	private String _sqlLotStockTable4Update = ""
+"select "
+" TO_CHAR(T_LOT_STOCK.STOCK_ON_HAND_QTY, 'fm99999999999990.0999') as STOCK_ON_HAND_QTY "
+"from "
+" T_LOT_STOCK "
+"where "
+" T_LOT_STOCK.ITEM_CD = ? "
+" and T_LOT_STOCK.WH_CD = ? "
+" and T_LOT_STOCK.PLANT_CD = ? "
+" and T_LOT_STOCK.LOT_NO = ? "
+"for update nowait ";


	/** �ۊǋ�ʕi�ڍ݌ɍX�V */
	private String _sqlUpdateItemStockTable = ""
+"update T_ITEM_STOCK "
+"set "
+" STOCK_ON_HAND_QTY = TO_NUMBER(?) "
+",UPDATED_DATE = TO_DATE(? ,'YYYY/MM/DD HH24:MI:SS') "
+",UPDATED_BY = ? "
+",UPDATED_PRG_NM = ? "
+",MODIFY_COUNT=MODIFY_COUNT + 1 "
+"where "
+" T_ITEM_STOCK.ITEM_CD = ? "
+" and T_ITEM_STOCK.WH_CD = ? "
+" and T_ITEM_STOCK.PLANT_CD = ? ";

	/** ���b�g�Ǘ��t���O���擾 */
	private String _sqlGetLotCtrlFlg = ""
+"SELECT M_ITEM.LOT_CTRL_FLG "
+"FROM "
+" M_ITEM "
+" WHERE "
+" M_ITEM.ITEM_CD = ? ";
	
	/** ���b�g�ʕi�ڍ݌ɍX�V */
	private String _sqlUpdateLotStockTable = ""
+"update T_LOT_STOCK "
+"set "
+" STOCK_ON_HAND_QTY = TO_NUMBER(?) "
+",UPDATED_DATE = TO_DATE(? ,'YYYY/MM/DD HH24:MI:SS') "
+",UPDATED_BY = ? "
+",UPDATED_PRG_NM = ? "
+",MODIFY_COUNT=MODIFY_COUNT + 1 "
+"where "
+" T_LOT_STOCK.ITEM_CD = ? "
+" and T_LOT_STOCK.WH_CD = ? "
+" and T_LOT_STOCK.PLANT_CD = ? "
+" and T_LOT_STOCK.LOT_NO = ? ";
	

	/** �ۊǋ�ʕi�ڍ݌ɓo�^ */
	private String _sqlInsertItemStockTable = ""
+"insert into T_ITEM_STOCK "
+"(ITEM_CD "
+",WH_CD "
+",PLANT_CD "
+",STOCK_ON_HAND_QTY "
+",CREATED_DATE "
+",CREATED_BY "
+",CREATED_PRG_NM "
+",UPDATED_DATE "
+",UPDATED_BY "
+",UPDATED_PRG_NM) "
+"values (?, ?, ?, TO_NUMBER(?), TO_DATE(? ,'YYYY/MM/DD HH24:MI:SS'), ?, ?, TO_DATE(? ,'YYYY/MM/DD HH24:MI:SS'), ?, ?) ";

	
	/** ���b�g�ʕi�ڍ݌ɓo�^ */
	private String _sqlInsertLotStockTable = ""
+"insert into T_LOT_STOCK "
+"(ITEM_CD "
+",WH_CD "
+",PLANT_CD "
+",STOCK_ON_HAND_QTY "
+",CREATED_DATE "
+",CREATED_BY "
+",CREATED_PRG_NM "
+",UPDATED_DATE "
+",UPDATED_BY "
+",UPDATED_PRG_NM "
+",LOT_NO "
+",DEFECT_QTY "
+",ALCD_QTY)"
+"values (?, ?, ?, TO_NUMBER(?), TO_DATE(? ,'YYYY/MM/DD HH24:MI:SS'), ?, ?, TO_DATE(? ,'YYYY/MM/DD HH24:MI:SS'), ?, ? , ? , 0 , 0) ";


	/** �ۊǋ�ʕi�ڒI���X�V */
	private String _sqlUpdateItemInvTable = ""
+"update T_ITEM_INV "
+"set "
+" INV_UPD_FLG = ? "
+",UPDATED_DATE = TO_DATE(? ,'YYYY/MM/DD HH24:MI:SS') "
+",UPDATED_BY = ? "
+",UPDATED_PRG_NM = ? "
+",MODIFY_COUNT=MODIFY_COUNT + 1 "
+"where "
+" T_ITEM_INV.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+" and T_ITEM_INV.PLANT_CD = ? "
+" and T_ITEM_INV.ITEM_CD = ? "
+" and T_ITEM_INV.WH_CD = ? ";
	

	/** ���b�g�ʕi�ڒI���X�V */
	private String _sqlUpdateLotInvTable = ""
+"update T_LOT_INV "
+"set "
+" INV_UPD_FLG = ? "
+",UPDATED_DATE = TO_DATE(? ,'YYYY/MM/DD HH24:MI:SS') "
+",UPDATED_BY = ? "
+",UPDATED_PRG_NM = ? "
+",MODIFY_COUNT=MODIFY_COUNT + 1 "
+"where "
+" T_LOT_INV.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+" and T_LOT_INV.PLANT_CD = ? "
+" and T_LOT_INV.ITEM_CD = ? "
+" and T_LOT_INV.WH_CD = ? "
+" and T_LOT_INV.LOT_NO = ? ";


	////////////////////////////////////////////////////////////////////////////
	// ���ԒI��

	/** �ۊǋ�ʐ��ԒI���Ǎ�(for update) */
	private String _sqlReadJobOdrCdInvTable4Update = ""
+"select "
+" T_JOB_ODR_CD_INV.JOB_ODR_CD as JOB_ODR_CD "
+",T_JOB_ODR_CD_INV.ITEM_CD as ITEM_CD "
+",T_JOB_ODR_CD_INV.WH_CD as WH_CD "
+",T_JOB_ODR_CD_INV.PLANT_CD as PLANT_CD "
+",TO_CHAR(T_JOB_ODR_CD_INV.ACTUAL_STOCK_QTY, 'fm99999999999990.0999') as ACTUAL_STOCK_QTY "
+",TO_CHAR(T_JOB_ODR_CD_INV.FINAL_BOOK_STOCK_QTY, 'fm99999999999990.0999') as FINAL_BOOK_STOCK_QTY "
+"from "
+" T_JOB_ODR_CD_INV "
+"where "
+" T_JOB_ODR_CD_INV.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+" and T_JOB_ODR_CD_INV.PLANT_CD = ? "
+" and T_JOB_ODR_CD_INV.INV_UPD_FLG = '0' "
+"for update nowait ";


	/** �ۊǋ�ʐ��ԍ݌ɓǍ�(for update) */
	private String _sqlReadJobOdrCdStockTable4Update = ""
+"select "
+" TO_CHAR(T_JOB_ODR_CD_STOCK.STOCK_ON_HAND_QTY, 'fm99999999999990.0999') as STOCK_ON_HAND_QTY "
+"from "
+" T_JOB_ODR_CD_STOCK "
+"where "
+" T_JOB_ODR_CD_STOCK.JOB_ODR_CD = ? "
+" and T_JOB_ODR_CD_STOCK.ITEM_CD = ? "
+" and T_JOB_ODR_CD_STOCK.WH_CD = ? "
+" and T_JOB_ODR_CD_STOCK.PLANT_CD = ? "
+"for update nowait ";


	/** �ۊǋ�ʐ��ԍ݌ɍX�V */
	private String _sqlUpdateJobOdrCdStockTable = ""
+"update T_JOB_ODR_CD_STOCK "
+"set "
+" STOCK_ON_HAND_QTY = TO_NUMBER(?) "
+",UPDATED_DATE = TO_DATE(? ,'YYYY/MM/DD HH24:MI:SS') "
+",UPDATED_BY = ? "
+",UPDATED_PRG_NM = ? "
+",MODIFY_COUNT=MODIFY_COUNT + 1 "
+"where "
+" T_JOB_ODR_CD_STOCK.JOB_ODR_CD = ? "
+" and T_JOB_ODR_CD_STOCK.ITEM_CD = ? "
+" and T_JOB_ODR_CD_STOCK.WH_CD = ? "
+" and T_JOB_ODR_CD_STOCK.PLANT_CD = ? ";


	/** �ۊǋ�ʐ��ԍ݌ɓo�^ */
	private String _sqlInsertJobOdrCdStockTable = ""
+"insert into T_JOB_ODR_CD_STOCK "
+"(JOB_ODR_CD "
+",ITEM_CD "
+",WH_CD "
+",PLANT_CD "
+",STOCK_ON_HAND_QTY "
+",CREATED_DATE "
+",CREATED_BY "
+",CREATED_PRG_NM "
+",UPDATED_DATE "
+",UPDATED_BY "
+",UPDATED_PRG_NM) "
+"values (?, ?, ? ,?, TO_NUMBER(?), TO_DATE(? ,'YYYY/MM/DD HH24:MI:SS'), ?, ?, TO_DATE(? ,'YYYY/MM/DD HH24:MI:SS'), ?, ?) ";


	/** �ۊǋ�ʐ��ԒI���X�V */
	private String _sqlUpdateJobOdrCdInvTable = ""
+"update T_JOB_ODR_CD_INV "
+"set "
+" INV_UPD_FLG = ? "
+",UPDATED_DATE = TO_DATE(? ,'YYYY/MM/DD HH24:MI:SS') "
+",UPDATED_BY = ? "
+",UPDATED_PRG_NM = ? "
+",MODIFY_COUNT=MODIFY_COUNT + 1 "
+"where "
+" T_JOB_ODR_CD_INV.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+" and T_JOB_ODR_CD_INV.PLANT_CD = ? "
+" and T_JOB_ODR_CD_INV.JOB_ODR_CD = ? "
+" and T_JOB_ODR_CD_INV.ITEM_CD = ? "
+" and T_JOB_ODR_CD_INV.WH_CD = ? ";


	////////////////////////////////////////////////////////////////////////////
	// �I������

	/** �I������Ǎ�(for update) */
	private String _sqlReadInvCtrlTable4Update = ""
+"select "
+" T_INV_CTRL.REGULAR_INV_FLG as REGULAR_INV_FLG "
+",T_INV_CTRL.CYCLE_INV_FLG as CYCLE_INV_FLG "
+",T_INV_CTRL.TEMP_INV_FLG as TEMP_INV_FLG "
+",T_INV_CTRL.INV_STS_TYP as INV_STS_TYP "
+"from "
+" T_INV_CTRL "
+"where "
+" T_INV_CTRL.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+" and T_INV_CTRL.PLANT_CD = ? "
+"for update nowait ";

	/** �I���X�V�p�I������X�V */
	private String _sqlUpdateInvCtrlTable4InvUpdate = ""
+"update T_INV_CTRL "
+"set "
+" INV_STS_TYP = ? "
+",INV_UPDATED_DATE = TO_DATE(? ,'YYYY/MM/DD HH24:MI:SS') "
+",UPDATED_DATE = TO_DATE(? ,'YYYY/MM/DD HH24:MI:SS') "
+",UPDATED_BY = ? "
+",UPDATED_PRG_NM = ? "
+",MODIFY_COUNT = MODIFY_COUNT + 1 "
+"where "
+" T_INV_CTRL.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+" and T_INV_CTRL.PLANT_CD = ? ";

	/** �I�����݌ɑޔ�p�I������X�V */
	private String _sqlUpdateInvCtrlTable4InvSave = ""
		+"update T_INV_CTRL "
		+"set INV_STS_TYP = ? "
		+"   ,STOCK_SAVE_DATE = TO_DATE(?,'YYYY/MM/DD HH24:MI:SS') "
		+"   ,UPDATED_DATE = TO_DATE(?,'YYYY/MM/DD HH24:MI:SS') "
		+"   ,UPDATED_BY = ? "
		+"   ,UPDATED_PRG_NM = ? "
		+"   ,MODIFY_COUNT = MODIFY_COUNT + 1 "
		+"where "
		+"    T_INV_CTRL.INV_DATE = TO_DATE(?,'YYYY/MM/DD') "
		+"and T_INV_CTRL.PLANT_CD = ? ";


	////////////////////////////////////////////////////////////////////////////
	// �I���X�V�����֘ASQL��`�i���ʁj

	/** �ۊǋ�ʓ��o�ɓǍ� */
	private String _sqlReadRcvIssueTable = ""
+"select  "
+" TO_CHAR(SUM(T_RCV_ISSUE.RCV_ISSUE_QTY), 'fm99999999999990.0999') as SUM_RCV_ISSUE_QTY "
+"from  "
+" T_RCV_ISSUE "
+",T_INV_CTRL "
+"where "
+" T_RCV_ISSUE.PLANT_CD = T_INV_CTRL.PLANT_CD "
+" and T_RCV_ISSUE.RCV_ISSUE_DATE <= T_INV_CTRL.INV_DATE "
+" and T_RCV_ISSUE.CREATED_DATE > T_INV_CTRL.STOCK_SAVE_DATE "
+" and T_RCV_ISSUE.STOCK_UPD_TYP = '2' "
+" and T_INV_CTRL.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+" and T_INV_CTRL.PLANT_CD = ? "
+" and NVL(T_RCV_ISSUE.JOB_ODR_CD, ' ') = NVL(?, ' ') "
+" and T_RCV_ISSUE.ITEM_CD = ? "
+" and T_RCV_ISSUE.WH_CD = ? "
+"group by "
+" T_RCV_ISSUE.JOB_ODR_CD "
+",T_RCV_ISSUE.ITEM_CD "
+",T_RCV_ISSUE.WH_CD "
+",T_RCV_ISSUE.PLANT_CD ";
	
	/** ���b�g�ʓ��o�ɓǍ� */
	private String _sqlReadLotRcvIssueTable = ""
+"select  "
+" TO_CHAR(SUM(T_RCV_ISSUE.RCV_ISSUE_QTY), 'fm99999999999990.0999') as SUM_RCV_ISSUE_QTY "
+"from  "
+" T_RCV_ISSUE "
+",T_INV_CTRL "
+"where "
+" T_RCV_ISSUE.PLANT_CD = T_INV_CTRL.PLANT_CD "
+" and T_RCV_ISSUE.RCV_ISSUE_DATE <= T_INV_CTRL.INV_DATE "
+" and T_RCV_ISSUE.CREATED_DATE > T_INV_CTRL.STOCK_SAVE_DATE "
+" and T_RCV_ISSUE.STOCK_UPD_TYP = '2' "
+" and T_INV_CTRL.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+" and T_INV_CTRL.PLANT_CD = ? "
+" and T_RCV_ISSUE.LOT_NO = ?"
+" and NVL(T_RCV_ISSUE.JOB_ODR_CD, ' ') = NVL(?, ' ') "
+" and T_RCV_ISSUE.ITEM_CD = ? "
+" and T_RCV_ISSUE.WH_CD = ? "
+"group by "
+" T_RCV_ISSUE.JOB_ODR_CD "
+",T_RCV_ISSUE.ITEM_CD "
+",T_RCV_ISSUE.WH_CD "
+",T_RCV_ISSUE.PLANT_CD ";

	/** �ۊǋ�ʓ��o�ɍX�V */
	private String _sqlInsertRcvIssueTable = ""
+"insert into T_RCV_ISSUE "
+"(RCV_ISSUE_CTRL_CD "
+",RCV_ISSUE_TYP "
+",ITEM_CD "
+",PLANT_CD "
+",WH_CD "
+",JOB_ODR_CD "
+",RCV_ISSUE_QTY "
+",RCV_ISSUE_DATE "
+",RCV_ISSUE_GNR_TYP "
+",STOCK_UPD_TYP "
+",RCV_ISSUE_CMPLT_FLG "
+",COMPANY_CD "
+",CREATED_DATE "
+",CREATED_BY "
+",CREATED_PRG_NM "
+",UPDATED_DATE "
+",UPDATED_BY "
+",UPDATED_PRG_NM "
+",RCV_ISSUE_BEFORE_QTY "
+",RCV_ISSUE_AFTER_QTY) "
+"values (?, ?, ?, ?, ?, ?, TO_NUMBER(?), TO_DATE(? ,'YYYY/MM/DD'), ?, ?, ?, ?, TO_DATE(? ,'YYYY/MM/DD HH24:MI:SS'), ?, ?, TO_DATE(? ,'YYYY/MM/DD HH24:MI:SS'), ?, ?, ?, ?) ";

	/** �ۊǋ�ʓ��o�ɍX�V */
	private String _sqlInsertLotRcvIssueTable = ""
+"insert into T_RCV_ISSUE "
+"(RCV_ISSUE_CTRL_CD "
+",RCV_ISSUE_TYP "
+",ITEM_CD "
+",PLANT_CD "
+",WH_CD "
+",JOB_ODR_CD "
+",RCV_ISSUE_QTY "
+",RCV_ISSUE_DATE "
+",RCV_ISSUE_GNR_TYP "
+",STOCK_UPD_TYP "
+",RCV_ISSUE_CMPLT_FLG "
+",COMPANY_CD "
+",CREATED_DATE "
+",CREATED_BY "
+",CREATED_PRG_NM "
+",UPDATED_DATE "
+",UPDATED_BY "
+",UPDATED_PRG_NM "
+",RCV_ISSUE_BEFORE_QTY "
+",RCV_ISSUE_AFTER_QTY "
+",LOT_NO)"
+"values (?, ?, ?, ?, ?, ?, TO_NUMBER(?), TO_DATE(? ,'YYYY/MM/DD'), ?, ?, ?, ?, TO_DATE(? ,'YYYY/MM/DD HH24:MI:SS'), ?, ?, TO_DATE(? ,'YYYY/MM/DD HH24:MI:SS'), ?, ?, ?, ? ,?) ";

}
