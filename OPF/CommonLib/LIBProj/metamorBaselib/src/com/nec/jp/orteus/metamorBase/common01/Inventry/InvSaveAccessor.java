//------------------------------------------------------------------------------
// (#)InvSaveAccessor.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2004/01/23 �V�K�쐬  M.Isoda
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.Inventry;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.nec.jp.orteus.metamorBase.common01.db.DBErrorMessage;

/**
 * �I���݌ɑޔ��A�N�Z�b�T�N���X
 *
 * @author  M.Isoda
 * @version 1.00
*/
public class InvSaveAccessor
{
//--------------------------------------------------------------------------
// �\�z

	/** �R���X�g���N�^ */
	public InvSaveAccessor(){ clear(); }

	/** �R���X�g���N�^
	 *
	 * @param	strPlantCd		�H��R�[�h
	 * @param	strUserCd		���[�U�R�[�h
	 * @param	strProgramName	�v���O�������i�� AH0070B001�j
	 */
	public InvSaveAccessor(
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
	private InvMessageControl _msg = null;

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
	 * �ۊǋ�ʕi�ڒI���폜
	 *
	 * @param	conn	DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	info	�p�����[�^���
	 * @return	�������R�[�h��:���� / -1:���s
	 */
	protected int deleteItemInvTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// �������ʃ��b�Z�[�W�Ǘ��N���X�����ݒ�
		PreparedStatement stmt = null;	// delete
		int	intResultCount = -1;
		try
		{
			stmt = conn.getConn().prepareStatement(_sqlDeleteItemInvTable2);
			stmt.setString(1, info.getINV_DATE());
			stmt.setString(2, info.getPLANT_CD());
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
	/**
	 * �ۊǋ�ʕi�ڒI���̒ǉ�
	 *
	 * @param	conn	DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	info	�p�����[�^���
	 * @return	�������R�[�h��:���� / -1:���s
	 */
	protected int insertItemInvTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// �������ʃ��b�Z�[�W�Ǘ��N���X�����ݒ�
		int	intResultCount = -1;
		PreparedStatement stmt = null;	// insert
		try {
			String strDateTime = _invCommon.readSystemDateTime(conn);
			stmt = conn.getConn().prepareStatement(_sqlInsertItemInvTable);
/*System.out.println(""
	+ "\n s) INV_DATE: " + info.getINV_DATE()
	+ "\n s) ITEM_CD: " + info.getITEM_CD()
	+ "\n s) WH_CD: " + info.getWH_CD()
	+ "\n s) PLANT_CD: " + info.getPLANT_CD()
	+ "\n s) ACTUAL_STOCK_QTY: " + info.getACTUAL_STOCK_QTY()
	+ "\n s) FINAL_BOOK_STOCK_QTY: " + info.getFINAL_BOOK_STOCK_QTY()
	+ "\n s) FINAL_BOOK_DEFECT_QTY: " + info.getFINAL_BOOK_DEFECT_QTY()
	+ "\n s) strDateTime: " + strDateTime
	+ "\n s) _strUserCd: " + _strUserCd
	+ "\n s) _strProgramName: " + _strProgramName
	+ "\n s) strDateTime: " + strDateTime
	+ "\n s) _strUserCd: " + _strUserCd
	+ "\n s) _strProgramName: " + _strProgramName
);*/
			stmt.setString(1, info.getINV_DATE());
			stmt.setString(2, info.getITEM_CD());
			stmt.setString(3, info.getWH_CD());
			stmt.setString(4, info.getPLANT_CD());
			stmt.setString(5, info.getSTOCK_ON_HAND_QTY());
			stmt.setString(6, info.getSTOCK_ON_HAND_QTY());
			stmt.setString(7, info.getDEFECT_QTY());
			stmt.setString(8, strDateTime);
			stmt.setString(9, _strUserCd);
			stmt.setString(10, _strProgramName);
			stmt.setString(11, strDateTime);
			stmt.setString(12, _strUserCd);
			stmt.setString(13, _strProgramName);
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
	/**
	 * �ۊǋ�ʐ��ԒI���̍폜
	 *
	 * @param	conn	DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	info	�p�����[�^���
	 * @return	�������R�[�h��:���� / -1:���s
	 */
	protected int deleteJobOdrCdInvTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// �������ʃ��b�Z�[�W�Ǘ��N���X�����ݒ�
		int	intResultCount = -1;
		PreparedStatement stmt = null;	// delete
		try
		{
			stmt = conn.getConn().prepareStatement(_sqlDeleteJobOdrCdInvTable2);
			stmt.setString(1, info.getINV_DATE());
			stmt.setString(2, info.getPLANT_CD());
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
	/**
	 * ���b�g�ʕi�ڍ݌ɂ̍폜
	 *
	 * @param	conn	DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	info	�p�����[�^���
	 * @return	�������R�[�h��:���� / -1:���s
	 */
	protected int deleteLotInvTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// �������ʃ��b�Z�[�W�Ǘ��N���X�����ݒ�
		int	intResultCount = -1;
		PreparedStatement stmt = null;	// delete
		try
		{
			stmt = conn.getConn().prepareStatement(_sqlDeleteLotInvTable2);
			stmt.setString(1, info.getINV_DATE());
			stmt.setString(2, info.getPLANT_CD());
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
	/**
	 * �ۊǋ�ʐ��ԒI���̒ǉ�
	 *
	 * @param	conn	DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	info	�p�����[�^���
	 * @return	�������R�[�h��:���� / -1:���s
	 */
	protected int insertJobOdrCdInvTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// �������ʃ��b�Z�[�W�Ǘ��N���X�����ݒ�
		int	intResultCount = -1;
		PreparedStatement stmt = null;	// delete
		try
		{
			String strDateTime = _invCommon.readSystemDateTime(conn);
			stmt = conn.getConn().prepareStatement(_sqlInsertJobOdrCdInvTable);
/*System.out.println(""
	+ "\n s) INV_DATE: " + info.getINV_DATE()
	+ "\n s) JOB_ODR_CD: " + info.getJOB_ODR_CD()
	+ "\n s) ITEM_CD: " + info.getITEM_CD()
	+ "\n s) WH_CD: " + info.getWH_CD()
	+ "\n s) PLANT_CD: " + info.getPLANT_CD()
	+ "\n s) ACTUAL_STOCK_QTY: " + info.getACTUAL_STOCK_QTY()
	+ "\n s) FINAL_BOOK_STOCK_QTY: " + info.getFINAL_BOOK_STOCK_QTY()
	+ "\n s) strDateTime: " + strDateTime
	+ "\n s) _strUserCd: " + _strUserCd
	+ "\n s) _strProgramName: " + _strProgramName
	+ "\n s) strDateTime: " + strDateTime
	+ "\n s) _strUserCd: " + _strUserCd
	+ "\n s) _strProgramName: " + _strProgramName
);*/
			stmt.setString(1, info.getINV_DATE());
			stmt.setString(2, info.getJOB_ODR_CD());
			stmt.setString(3, info.getITEM_CD());
			stmt.setString(4, info.getWH_CD());
			stmt.setString(5, info.getPLANT_CD());
			stmt.setString(6, info.getACTUAL_STOCK_QTY());
			stmt.setString(7, info.getFINAL_BOOK_STOCK_QTY());
			stmt.setString(8, strDateTime);
			stmt.setString(9, _strUserCd);
			stmt.setString(10, _strProgramName);
			stmt.setString(11, strDateTime);
			stmt.setString(12, _strUserCd);
			stmt.setString(13, _strProgramName);
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
	 * ���b�g�ʕi�ڒI���̒ǉ�
	 *
	 * @param	conn	DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	info	�p�����[�^���
	 * @return	�������R�[�h��:���� / -1:���s
	 */
	protected int insertLotInvTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// �������ʃ��b�Z�[�W�Ǘ��N���X�����ݒ�
		int	intResultCount = -1;
		PreparedStatement stmt = null;	// delete
		try
		{
			String strDateTime = _invCommon.readSystemDateTime(conn);
			stmt = conn.getConn().prepareStatement(_sqlInsertLotOdrCdInvTable);
			stmt.setString(1, info.getINV_DATE());
			stmt.setString(2, info.getLOT_NO());
			stmt.setString(3, info.getITEM_CD());
			stmt.setString(4, info.getWH_CD());
			stmt.setString(5, info.getPLANT_CD());
			stmt.setString(6, info.getACTUAL_STOCK_QTY());
			stmt.setString(7, info.getFINAL_BOOK_STOCK_QTY());
			stmt.setString(8, strDateTime);
			stmt.setString(9, _strUserCd);
			stmt.setString(10, _strProgramName);
			stmt.setString(11, strDateTime);
			stmt.setString(12, _strUserCd);
			stmt.setString(13, _strProgramName);
			intResultCount = stmt.executeUpdate();
		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// �G���[���ݒ�
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// �ڍ׏��
				+ " (SBM1116)�I����:[ " + info.getINV_DATE() + " ]"
				+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
				+ " �݌Ƀ��b�g�ԍ�:[ " + info.getLOT_NO() + " ]"
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
		// �I������̍X�V�i���{�O�����Ԓ�,�݌ɑޔ�����j
		try
		{
			String strDateTime = _invCommon.readSystemDateTime(conn);
			stmt = conn.getConn().prepareStatement(_sqlUpdateInvCtrl);
/*System.out.println(""
	+ "\n s) INV_STS_TYP: " + info.getINV_STS_TYP()
	+ "\n s) strDateTime: " + strDateTime
	+ "\n s) strDateTime: " + strDateTime
	+ "\n s) _strUserCd: " + _strUserCd
	+ "\n s) _strProgramName: " + _strProgramName
	+ "\n w) INV_DATE: " + info.getINV_DATE()
	+ "\n w) PLANT_CD: " + info.getPLANT_CD()
);*/
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

//------------------------------------------------------------------------------------
// SQL��`

	/** �ۊǋ�ʐ��ԒI���̍폜SQL */
	private String _sqlDeleteItemInvTable2 = ""
		+"delete from T_ITEM_INV "
		+"where "
		+"    T_ITEM_INV.INV_DATE = TO_DATE(?,'YYYY/MM/DD') "
		+"and T_ITEM_INV.PLANT_CD = ? ";

	/** �ۊǋ�ʐ��ԒI���̍폜SQL */
	private String _sqlDeleteJobOdrCdInvTable2 = ""
		+"delete from T_JOB_ODR_CD_INV "
		+"where "
		+"    T_JOB_ODR_CD_INV.INV_DATE = TO_DATE(?,'YYYY/MM/DD') "
		+"and T_JOB_ODR_CD_INV.PLANT_CD = ? ";
	
	/** ���b�g�ʕi�ڍ݌ɂ̍폜SQL */
	private String _sqlDeleteLotInvTable2 = ""
		+"delete from T_LOT_INV "
		+"where "
		+"    T_LOT_INV.INV_DATE = TO_DATE(?,'YYYY/MM/DD') "
		+"and T_LOT_INV.PLANT_CD = ? ";

	/** �ۊǋ�ʕi�ڒI���̒ǉ�SQL */
	private String _sqlInsertItemInvTable = ""
		+"insert into T_ITEM_INV ( "
		+"    INV_DATE "
		+"   ,ITEM_CD "
		+"   ,WH_CD "
		+"   ,PLANT_CD "
		+"   ,ACTUAL_STOCK_QTY "
		+"   ,FINAL_BOOK_STOCK_QTY "
		+"   ,FINAL_BOOK_DEFECT_QTY "
		+"   ,CREATED_DATE "
		+"   ,CREATED_BY "
		+"   ,CREATED_PRG_NM "
		+"   ,UPDATED_DATE "
		+"   ,UPDATED_BY "
		+"   ,UPDATED_PRG_NM) "
		+"values "
		+"   (TO_DATE(?,'YYYY/MM/DD'),?,?,?,TO_NUMBER(?),TO_NUMBER(?),TO_NUMBER(?) "
		+"   ,TO_DATE(?,'YYYY/MM/DD HH24:MI:SS'),?,?,TO_DATE(?,'YYYY/MM/DD HH24:MI:SS'),?,?) ";

	/** �ۊǋ�ʐ��ԒI���̒ǉ�SQL */
	private String _sqlInsertJobOdrCdInvTable = ""
		+"insert into T_JOB_ODR_CD_INV ( "
		+"    INV_DATE "
		+"   ,JOB_ODR_CD "
		+"   ,ITEM_CD "
		+"   ,WH_CD "
		+"   ,PLANT_CD "
		+"   ,ACTUAL_STOCK_QTY "
		+"   ,FINAL_BOOK_STOCK_QTY "
		+"   ,CREATED_DATE "
		+"   ,CREATED_BY "
		+"   ,CREATED_PRG_NM "
		+"   ,UPDATED_DATE "
		+"   ,UPDATED_BY "
		+"   ,UPDATED_PRG_NM) "
		+"values "
		+"   (TO_DATE(?,'YYYY/MM/DD'),?,?,?,?,TO_NUMBER(?),TO_NUMBER(?) "
		+"   ,TO_DATE(?,'YYYY/MM/DD HH24:MI:SS'),?,?,TO_DATE(?,'YYYY/MM/DD HH24:MI:SS'),?,?) ";
	
	/** ���b�g�ʕi�ڒI���̒ǉ�SQL */
	private String _sqlInsertLotOdrCdInvTable = ""
		+"insert into T_LOT_INV ( "
		+"    INV_DATE "
		+"   ,LOT_NO "
		+"   ,ITEM_CD "
		+"   ,WH_CD "
		+"   ,PLANT_CD "
		+"   ,ACTUAL_STOCK_QTY "
		+"   ,FINAL_BOOK_STOCK_QTY "
		+"   ,CREATED_DATE "
		+"   ,CREATED_BY "
		+"   ,CREATED_PRG_NM "
		+"   ,UPDATED_DATE "
		+"   ,UPDATED_BY "
		+"   ,UPDATED_PRG_NM) "
		+"values "
		+"   (TO_DATE(?,'YYYY/MM/DD'),?,?,?,?,TO_NUMBER(?),TO_NUMBER(?) "
		+"   ,TO_DATE(?,'YYYY/MM/DD HH24:MI:SS'),?,?,TO_DATE(?,'YYYY/MM/DD HH24:MI:SS'),?,?) ";

	/** �I������̍X�VSQL */
	private String _sqlUpdateInvCtrl = ""
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
}
