//------------------------------------------------------------------------------
// (#)InvDeleteAccessor.java
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
import java.util.List;
import java.util.ArrayList;
import com.nec.jp.orteus.metamorBase.common01.db.DBErrorMessage;

/**
 * �I���폜�A�N�Z�b�T�N���X
 *
 * @author  M.Isoda
 * @version 1.00
*/
public class InvDeleteAccessor
{
//--------------------------------------------------------------------------
// �\�z

	/** �R���X�g���N�^ */
	public InvDeleteAccessor(){ clear(); }

	/** �R���X�g���N�^
	 *
	 * @param	strPlantCd		�H��R�[�h
	 * @param	strUserCd		���[�U�R�[�h
	 * @param	strProgramName	�v���O�������i�� AH0070B001�j
	 */
	public InvDeleteAccessor(
		String strPlantCd, 
		String strUserCd, 
		String strProgramName)
	{
		clear();
		_strPlantCd = strPlantCd;
		_strUserCd = strUserCd;
		_strProgramName = strProgramName;
		_msg = new InvMessageControl();
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

//------------------------------------------------------------------------------------
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
		int	intResultCount = -1;
		PreparedStatement stmt = null;	// delete
		try
		{
			stmt = conn.getConn().prepareStatement(_sqlDeleteItemInvTable1);
			stmt.setString(1, info.getPERIOD_DATE());	// where
			stmt.setString(2, info.getPLANT_CD());		// where
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
	 * �I�������ۊǋ�w��̍폜
	 *
	 * @param	conn	DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	info	�p�����[�^���
	 * @return	�������R�[�h��:���� / -1:���s
	 */
	protected int deleteInvTargetWhTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// �������ʃ��b�Z�[�W�Ǘ��N���X�����ݒ�
		int	intResultCount = -1;
		PreparedStatement stmt = null;	// delete
		try
		{
			stmt = conn.getConn().prepareStatement(_sqlDeleteInvTargetWhTable);
			stmt.setString(1, info.getPERIOD_DATE());
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
	 * �I�������i�ڎw��̍폜
	 *
	 * @param	conn	DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	info	�p�����[�^���
	 * @return	�������R�[�h��:���� / -1:���s
	 */
	protected int deleteInvTargetItemTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// �������ʃ��b�Z�[�W�Ǘ��N���X�����ݒ�
		int	intResultCount = -1;
		PreparedStatement stmt = null;	// delete
		try
		{
			stmt = conn.getConn().prepareStatement(_sqlDeleteInvTargetItemTable);
			stmt.setString(1, info.getPERIOD_DATE());
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
				+ " �H��R�[�h:[ " + info.getMNT_DATA_TYP() + " ]"
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
	 * �I������̍폜
	 *
	 * @param	conn	DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	info	�p�����[�^���
	 * @return	�������R�[�h��:���� / -1:���s
	 */
	protected int deleteInvCtrlTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// �������ʃ��b�Z�[�W�Ǘ��N���X�����ݒ�
		int	intResultCount = -1;
		PreparedStatement stmt = null;	// delete
		try
		{
			stmt = conn.getConn().prepareStatement(_sqlDeleteInvCtrlTable);
			stmt.setString(1, info.getPERIOD_DATE());
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
				+ " �H��R�[�h:[ " + info.getMNT_DATA_TYP() + " ]"
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
	 * �ێ����Ԃ̓Ǎ��i���ʁj
	 *
	 * @param	conn	DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	info	�p�����[�^���
	 * @return	���ꗗ:���� / null:���s
	 */
	protected List readSysMntPeriodTable(
		IDbConnection conn, 
		InvInformation info)
	{
		initResultMessage();	// �������ʃ��b�Z�[�W�Ǘ��N���X�����ݒ�
		List list = new ArrayList(0);
		PreparedStatement stmt = null;	// select
		ResultSet rset = null;			// ����
		try
		{
			stmt = conn.getConn().prepareStatement(_sqlReadSysMntPeriodTable);
			stmt.setString(1, info.getPLANT_CD());		// where
			stmt.setString(2, info.getMNT_DATA_TYP());	// where
			rset = stmt.executeQuery();
			while(rset.next() == true)
			{
				InvInformation infoTemp = new InvInformation();
				infoTemp.setPERIOD_DATE(rset.getString(1));	// select
				infoTemp.setTODAY(rset.getString(2));		// select
				infoTemp.setMNT_PERIOD(rset.getString(3));	// select
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
				+ " (SBM1077)�H��R�[�h:[ " + info.getPLANT_CD() + " ]"
				+ " �ێ����敪:[ " + info.getMNT_DATA_TYP()
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
			stmt = conn.getConn().prepareStatement(_sqlDeleteJobOdrCdInvTable1);
			stmt.setString(1, info.getPERIOD_DATE());
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
	 * ���b�g�ʕi�ڒI���̍폜
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
			stmt = conn.getConn().prepareStatement(_sqlDeleteLotTable1);
			stmt.setString(1, info.getPERIOD_DATE());
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

//------------------------------------------------------------------------------------
// SQL��`

	/** �ێ����Ԃ̓Ǎ�SQL */
	private String _sqlReadSysMntPeriodTable = ""
		+"select "
		+"   TO_CHAR(TO_DATE(TO_CHAR(ADD_MONTHS(sysdate,SYS_MNT_PERIOD.MNT_PERIOD * (-1)),'yyyy/mm') || '01','yyyy/mm/dd'),'yyyy/mm/dd') as PERIOD_DATE "
		+"  ,TO_CHAR(sysdate,'yyyy/mm/dd')  "
		+"  ,SYS_MNT_PERIOD.MNT_PERIOD as MNT_PERIOD "
		+"from "
		+"   SYS_MNT_PERIOD "
		+"where "
		+"      SYS_MNT_PERIOD.PLANT_CD = ? "
		+"  and SYS_MNT_PERIOD.MNT_DATA_TYP = ? ";

	/** �ۊǋ�ʕi�ڒI���̍폜SQL */
	private String _sqlDeleteItemInvTable1 = ""
		+"delete from T_ITEM_INV "
		+"where "
		+"    T_ITEM_INV.INV_DATE < TO_DATE(?,'YYYY/MM/DD') "
		+"and T_ITEM_INV.PLANT_CD = ? "
		+"and "
		+" (((T_ITEM_INV.INV_DATE "
		+"   ,T_ITEM_INV.PLANT_CD ) "
		+"            IN    (select "
		+"                        T_INV_CTRL.INV_DATE "
		+"                       ,T_INV_CTRL.PLANT_CD "
		+"                  from  T_INV_CTRL "
		+"                  where "
		+"                      T_INV_CTRL.INV_DATE = T_ITEM_INV.INV_DATE "
		+"                  and T_INV_CTRL.PLANT_CD = T_ITEM_INV.PLANT_CD "
		+"                  and T_INV_CTRL.INV_STS_TYP in (0,2))) "
		+"    OR "
		+"    NOT EXISTS   (select * from T_INV_CTRL "
		+"                  where "
		+"                      T_INV_CTRL.INV_DATE = T_ITEM_INV.INV_DATE "
		+"                  and T_INV_CTRL.PLANT_CD = T_ITEM_INV.PLANT_CD))";

	/** �ۊǋ�ʐ��ԒI���̍폜SQL */
	private String _sqlDeleteJobOdrCdInvTable1 = ""
		+"delete from T_JOB_ODR_CD_INV "
		+"where "
		+"    T_JOB_ODR_CD_INV.INV_DATE < TO_DATE(?,'YYYY/MM/DD') "
		+"and T_JOB_ODR_CD_INV.PLANT_CD = ? "
		+"and "
		+" (((T_JOB_ODR_CD_INV.INV_DATE "
		+"   ,T_JOB_ODR_CD_INV.PLANT_CD ) "
		+"            IN    (select "
		+"                        T_INV_CTRL.INV_DATE "
		+"                       ,T_INV_CTRL.PLANT_CD "
		+"                  from  T_INV_CTRL "
		+"                  where "
		+"                      T_INV_CTRL.INV_DATE = T_JOB_ODR_CD_INV.INV_DATE "
		+"                  and T_INV_CTRL.PLANT_CD = T_JOB_ODR_CD_INV.PLANT_CD "
		+"                  and T_INV_CTRL.INV_STS_TYP in (0,2))) "
		+"    OR "
		+"    NOT EXISTS   (select * from T_INV_CTRL "
		+"                  where "
		+"                      T_INV_CTRL.INV_DATE = T_JOB_ODR_CD_INV.INV_DATE "
		+"                  and T_INV_CTRL.PLANT_CD = T_JOB_ODR_CD_INV.PLANT_CD))";
	
	/** ���b�g�ʕi�ڒI���̍폜SQL */
	private String _sqlDeleteLotTable1 = ""
		+"delete from T_LOT_INV "
		+"where "
		+"    T_LOT_INV.INV_DATE < TO_DATE(?,'YYYY/MM/DD') "
		+"and T_LOT_INV.PLANT_CD = ? "
		+"and "
		+" (((T_LOT_INV.INV_DATE "
		+"   ,T_LOT_INV.PLANT_CD ) "
		+"            IN    (select "
		+"                        T_INV_CTRL.INV_DATE "
		+"                       ,T_INV_CTRL.PLANT_CD "
		+"                  from  T_INV_CTRL "
		+"                  where "
		+"                      T_INV_CTRL.INV_DATE = T_LOT_INV.INV_DATE "
		+"                  and T_INV_CTRL.PLANT_CD = T_LOT_INV.PLANT_CD "
		+"                  and T_INV_CTRL.INV_STS_TYP in (0,2))) "
		+"    OR "
		+"    NOT EXISTS   (select * from T_INV_CTRL "
		+"                  where "
		+"                      T_INV_CTRL.INV_DATE = T_LOT_INV.INV_DATE "
		+"                  and T_INV_CTRL.PLANT_CD = T_LOT_INV.PLANT_CD))";

	/** �I�������ۊǋ�w��̍폜SQL */
	private String _sqlDeleteInvTargetWhTable = ""
		+"delete from T_INV_TARGET_WH "
		+"where "
		+"    T_INV_TARGET_WH.INV_DATE < TO_DATE(?,'YYYY/MM/DD') "
		+"and T_INV_TARGET_WH.PLANT_CD = ? "
		+"and "
		+" (((T_INV_TARGET_WH.INV_DATE "
		+"   ,T_INV_TARGET_WH.PLANT_CD ) "
		+"            IN    (select "
		+"                        T_INV_CTRL.INV_DATE "
		+"                       ,T_INV_CTRL.PLANT_CD "
		+"                  from  T_INV_CTRL "
		+"                  where "
		+"                      T_INV_CTRL.INV_DATE = T_INV_TARGET_WH.INV_DATE "
		+"                  and T_INV_CTRL.PLANT_CD = T_INV_TARGET_WH.PLANT_CD "
		+"                  and T_INV_CTRL.INV_STS_TYP in (0,2))) "
		+"    OR "
		+"    NOT EXISTS   (select * from T_INV_CTRL "
		+"                  where "
		+"                      T_INV_CTRL.INV_DATE = T_INV_TARGET_WH.INV_DATE "
		+"                  and T_INV_CTRL.PLANT_CD = T_INV_TARGET_WH.PLANT_CD))";

	/** �I�������i�ڎw��̍폜SQL */
	private String _sqlDeleteInvTargetItemTable = ""
		+"delete from T_INV_TARGET_ITEM "
		+"where "
		+"    T_INV_TARGET_ITEM.INV_DATE < TO_DATE(?,'YYYY/MM/DD') "
		+"and T_INV_TARGET_ITEM.PLANT_CD = ? "
		+"and "
		+" (((T_INV_TARGET_ITEM.INV_DATE "
		+"   ,T_INV_TARGET_ITEM.PLANT_CD ) "
		+"            IN    (select "
		+"                        T_INV_CTRL.INV_DATE "
		+"                       ,T_INV_CTRL.PLANT_CD "
		+"                  from  T_INV_CTRL "
		+"                  where "
		+"                      T_INV_CTRL.INV_DATE = T_INV_TARGET_ITEM.INV_DATE "
		+"                  and T_INV_CTRL.PLANT_CD = T_INV_TARGET_ITEM.PLANT_CD "
		+"                  and T_INV_CTRL.INV_STS_TYP in (0,2))) "
		+"    OR "
		+"    NOT EXISTS   (select * from T_INV_CTRL "
		+"                  where "
		+"                      T_INV_CTRL.INV_DATE = T_INV_TARGET_ITEM.INV_DATE "
		+"                  and T_INV_CTRL.PLANT_CD = T_INV_TARGET_ITEM.PLANT_CD))";

	/** �I������̍폜SQL */
	private String _sqlDeleteInvCtrlTable = ""
		+"delete from T_INV_CTRL "
		+"where "
		+"    T_INV_CTRL.INV_DATE < TO_DATE(?,'YYYY/MM/DD') "
		+"and T_INV_CTRL.PLANT_CD = ? "
		+"and T_INV_CTRL.INV_STS_TYP in (0,2) "
		+"and "
		+"    NOT EXISTS   (select * from T_ITEM_INV "
		+"                  where "
		+"                      T_ITEM_INV.INV_DATE = T_INV_CTRL.INV_DATE "
		+"                  and T_ITEM_INV.PLANT_CD = T_INV_CTRL.PLANT_CD)" 
		+"and "
		+"    NOT EXISTS   (select * from T_JOB_ODR_CD_INV "
		+"                  where "
		+"                      T_JOB_ODR_CD_INV.INV_DATE = T_INV_CTRL.INV_DATE "
		+"                  and T_JOB_ODR_CD_INV.PLANT_CD = T_INV_CTRL.PLANT_CD)" 
		+"and "
		+"    NOT EXISTS   (select * from T_INV_TARGET_WH "
		+"                  where "
		+"                      T_INV_TARGET_WH.INV_DATE = T_INV_CTRL.INV_DATE "
		+"                  and T_INV_TARGET_WH.PLANT_CD = T_INV_CTRL.PLANT_CD)" 
		+"and "
		+"    NOT EXISTS   (select * from T_INV_TARGET_ITEM "
		+"                  where "
		+"                      T_INV_TARGET_ITEM.INV_DATE = T_INV_CTRL.INV_DATE "
		+"                  and T_INV_TARGET_ITEM.PLANT_CD = T_INV_CTRL.PLANT_CD)"; 


}
