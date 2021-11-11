//------------------------------------------------------------------------------
// (#)InvGetAccessor.java
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
import java.text.MessageFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import com.nec.jp.orteus.metamorBase.common01.db.DBErrorMessage;
import com.nec.jp.orteus.metamorBase.common01.util.DateConverter;

/**
 * �I�����擾�A�N�Z�b�T�N���X
 *
 * @author  M.Isoda
 * @version 1.00
*/
public class InvGetAccessor
{
//--------------------------------------------------------------------------
// �萔��`

	////////////////////////////////////////////////////////////////////////////
	// �擾����ޒ�`�萔

	/** �I���݌ɏ�� */
	public static final int DATA_NORMAL			= 0;
	/** �s�Ǎ݌ɏ�� */
	public static final int DATA_DEFECT			= 1;
	/** �}�C�i�X�݌ɏ�� */
	public static final int DATA_MINUS			= 2;
	/** �ϑ��݌ɏ�� */
	public static final int DATA_TRANSPORT		= 3;
	/** ���b�g�݌ɏ�� */
	public static final int DATA_LOT		= 4;

	////////////////////////////////////////////////////////////////////////////
	// �݌Ɏ�ޒ�`�萔

	/** �i�ڍ݌� */
	public static final int STOCK_ITEM			= 0;
	
	/** �i�ڍ݌� add on*/
	public static final int STOCK_ITEM_AddOn	= 10;

	/** ���ԍ݌� */
	public static final int STOCK_JOB_ODR		= 1;
	/** �ϑ��݌� */
	public static final int STOCK_TRANSPORT		= 2;
	/** ���b�g�݌� */
	public static final int STOCK_LOT		= 3;

	////////////////////////////////////////////////////////////////////////////
	// �I����ޒ�`�萔

	/** ����I�� */
	public static final int INV_REGULAR			= 0;
	/** �z�I�� */
	public static final int INV_CYCLE			= 1;
	/** �Վ��I�� */
	public static final int	INV_TEMP			= 2;
	/** �z�A�Վ��I�� */
	public static final int INV_CYCLE_AND_TEMP	= 3;

//--------------------------------------------------------------------------
// �\�z

	/** �R���X�g���N�^ */
	public InvGetAccessor(){ clear(); }

	/** �R���X�g���N�^
	 *
	 * @param	strPlantCd		�H��R�[�h
	 * @param	strUserCd		���[�U�R�[�h
	 * @param	strProgramName	�v���O�������i�� AH0070B001�j
	 */
	public InvGetAccessor(
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

	/**
	 * �擾����ޕʃf�[�^�擾<br>
	 *<br>
	 * @param	conn			DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	info			�p�����[�^���
	 * @param	intKindData		�擾�����
	 * @param	intKindStock	�݌Ɏ��
	 * @return	���ꗗ:���� / null:���s
	 */
	public List getStockList(
		IDbConnection conn, 
		InvInformation info,
		int intKindData, 
		int intKindStock)
	{
		// �����^���琔�l�^�֕ϊ�
		int intRegularInvFlg = Integer.parseInt(info.getREGULAR_INV_FLG());
		int intCycleInvFlg = Integer.parseInt(info.getCYCLE_INV_FLG());
		int intTempInvFlg = Integer.parseInt(info.getTEMP_INV_FLG());
		
		List list = null;
		if( (intRegularInvFlg == 1) && (intCycleInvFlg == 0) && (intTempInvFlg == 0) )
		{
			// ����I���݂̂̏ꍇ
			list = getList4Regular(conn, info, intKindData, intKindStock);
		}
		else if( (intRegularInvFlg == 0) && (intCycleInvFlg == 1) && (intTempInvFlg == 0) )
		{
			// �z�I���݂̂̏ꍇ
			list = getList4Cycle(conn, info, intKindData, intKindStock);
		}
		else if( (intRegularInvFlg == 0) && (intCycleInvFlg == 0) && (intTempInvFlg == 1) )
		{
			// �Վ��I���݂̂̏ꍇ
			list = getList4Temp(conn, info, intKindData, intKindStock);
		}
		else if( (intRegularInvFlg == 0) && (intCycleInvFlg == 1) && (intTempInvFlg == 1) )
		{
			// �z�A�Վ��I���̏ꍇ
			list = getList4CycleAndTemp(conn, info, intKindData, intKindStock);
		}
		else
		{
			// �t���O�l�ُ�
		}
		return list;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * �I������e�[�u������̓Ǎ�����<br>
	 *<br>
	 * @param	conn	DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	info	�p�����[�^���
	 * @return	�擾���:���� / null:���s
	 */
	public InvInformation readInvCtrl(
		IDbConnection conn, 
		InvInformation info)
	{
		InvInformation infoTemp = null;
		PreparedStatement stmt = null;
		ResultSet rset = null;
		String strSQL = ""
			+"select "
			+" TO_CHAR(T_INV_CTRL.REGULAR_INV_FLG, 'fm0') as REGULAR_INV_FLG, "
			+" TO_CHAR(T_INV_CTRL.CYCLE_INV_FLG, 'fm0') as CYCLE_INV_FLG, "
			+" TO_CHAR(T_INV_CTRL.TEMP_INV_FLG, 'fm0') as TEMP_INV_FLG, "
			+" TO_CHAR(T_INV_CTRL.INV_STS_TYP, 'fm90') as INV_STS_TYP "
			+"from "
			+" T_INV_CTRL "
			+"where "
			+" T_INV_CTRL.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
			+" and T_INV_CTRL.PLANT_CD = ? ";
		try
		{
			stmt = conn.getConn().prepareStatement(strSQL);
			stmt.setString(1, info.getINV_DATE());
			stmt.setString(2, info.getPLANT_CD());
			rset = stmt.executeQuery();
			if(rset.next() == true)
			{
				infoTemp = new InvInformation();

				infoTemp.setREGULAR_INV_FLG(rset.getString(1));
				infoTemp.setCYCLE_INV_FLG(rset.getString(2));
				infoTemp.setTEMP_INV_FLG(rset.getString(3));
				infoTemp.setINV_STS_TYP(rset.getString(4));
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
			infoTemp = null;
		}
		finally
		{
			closeResultSet(rset);
			closePreparedStatement(stmt);
		}
		return infoTemp;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * ���ꗗ�擾�i����I���j
	 *
	 * @param	conn			DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	info			�p�����[�^���
	 * @param	intKindData		�擾�����
	 * @param	intKindStock	�݌Ɏ��
	 * @return	���ꗗ:���� / null:���s
	 */
	private List getList4Regular(
		IDbConnection conn, 
		InvInformation info,
		int intKindData, 
		int intKindStock)
	{
		List list = null;

		// SQL�쐬
		String strSql = getSql(info, intKindData, intKindStock, INV_REGULAR);
		String strSqlNoOrder = strSql;
		String strSqlOrderBy = getSqlOrderBy(intKindStock);
		if(strSqlOrderBy != null)
		{
			strSql += strSqlOrderBy;
		}

		// SQL���s
		PreparedStatement stmt = null;
		PreparedStatement stmtAddOn = null;

		ResultSet rset = null;
		ResultSet rsetAddOn = null;

		try
		{
			// ����I���݂̂̏ꍇ
			stmt = conn.getConn().prepareStatement(strSql);
			stmt.setString(1, info.getPLANT_CD());
			stmt.setString(2, info.getWH_CD());
			stmt.setString(3, info.getITEM_CD());
			if(intKindStock == STOCK_ITEM || intKindStock == STOCK_TRANSPORT){
				stmt.setString(4, info.getLOT_NO());
			}

			rset = stmt.executeQuery();
			list = getList(rset, info, intKindStock);

			if(intKindStock == STOCK_ITEM && info.getLOT_NO().equals("%")){
				String strSqlAddOn = " select " 
					               + getSqlSelectFrom(STOCK_ITEM_AddOn)
					               + " where "
				                   + getSqlWhereBase(info, STOCK_ITEM_AddOn, INV_REGULAR)
				                   + getSqlWhereAdd(intKindData, STOCK_ITEM_AddOn);
				String allSql = _sqlSelectAllFromItem + strSqlNoOrder + " union " 
								+ strSqlAddOn + " )A " + _sqlAllOderByItem;

				stmtAddOn = conn.getConn().prepareStatement(allSql);
				stmtAddOn.setString(1, info.getPLANT_CD());
				stmtAddOn.setString(2, info.getWH_CD());
				stmtAddOn.setString(3, info.getITEM_CD());
				stmtAddOn.setString(4, info.getLOT_NO());					
				stmtAddOn.setString(5, info.getLOT_NO());
				stmtAddOn.setString(6, info.getPLANT_CD());
				stmtAddOn.setString(7, info.getWH_CD());
				stmtAddOn.setString(8, info.getITEM_CD());


				rsetAddOn = stmtAddOn.executeQuery();
				list = getList(rsetAddOn, info, intKindStock);				
			}

		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// �G���[���ݒ�
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// �ڍ׏��
				+ " (SBM1112)�H��R�[�h:[ " + info.getPLANT_CD() + " ]"
				+ " �ۊǋ�R�[�h:[ " + info.getWH_CD() + " ]"
			);
			list = null;
		}
		finally
		{
			closeResultSet(rset);
			closePreparedStatement(stmt);
			closePreparedStatement(stmtAddOn);
		}
		return list;
	}
	////////////////////////////////////////////////////////////////////////////
	/**
	 * ���ꗗ�擾�i�z�I���j
	 *
	 * @param	conn			DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	info			�p�����[�^���
	 * @param	intKindData		�擾�����
	 * @param	intKindStock	�݌Ɏ��
	 * @return	���ꗗ:���� / null:���s
	 */
	private List getList4Cycle(
		IDbConnection conn, 
		InvInformation info,
		int intKindData, 
		int intKindStock)
	{
		List list = null;

		// SQL�쐬
		String strSql = null;
		strSql = getSql(info, intKindData, intKindStock, INV_CYCLE);
		String strSqlNoOrder = strSql;
		String strSqlOrderBy = getSqlOrderBy(intKindStock);
		if(strSqlOrderBy != null)
		{
			strSql += strSqlOrderBy;
		}

		// SQL���s
		PreparedStatement stmt = null;
		ResultSet rset = null;
		
		PreparedStatement stmtAddOn = null;
		ResultSet rsetAddOn = null;
		try
		{
			// ����I���݂̂̏ꍇ
			stmt = conn.getConn().prepareStatement(strSql);
			stmt.setString(1, info.getPLANT_CD());
			stmt.setString(2, info.getPLANT_CD());
			stmt.setString(3, info.getWH_CD());
			stmt.setString(4, info.getITEM_CD());
			if(intKindStock == STOCK_ITEM || intKindStock == STOCK_TRANSPORT){
				stmt.setString(5, info.getLOT_NO());
			}
			
			rset = stmt.executeQuery();
			list = getList(rset, info, intKindStock);
			if(intKindStock == STOCK_ITEM && info.getLOT_NO().equals("%")){
				
				String strSqlAddOn = " select " 
					               + getSqlSelectFrom(STOCK_ITEM_AddOn)
					               + " where "
				                   + getSqlWhereBase(info, STOCK_ITEM_AddOn, INV_CYCLE)
				                   + getSqlWhereAdd(intKindData, STOCK_ITEM_AddOn);
				
				String allSql = _sqlSelectAllFromItem + strSqlNoOrder + " union " 
					+ strSqlAddOn + " )A " + _sqlAllOderByItem;

				stmtAddOn = conn.getConn().prepareStatement(allSql);
				stmtAddOn.setString(1, info.getPLANT_CD());
				stmtAddOn.setString(2, info.getPLANT_CD());
				stmtAddOn.setString(3, info.getWH_CD());
				stmtAddOn.setString(4, info.getITEM_CD());
				stmtAddOn.setString(5, info.getLOT_NO());
				stmtAddOn.setString(6, info.getLOT_NO());
				stmtAddOn.setString(7, info.getPLANT_CD());
				stmtAddOn.setString(8, info.getPLANT_CD());
				stmtAddOn.setString(9, info.getWH_CD());
				stmtAddOn.setString(10, info.getITEM_CD());
				
				rsetAddOn = stmtAddOn.executeQuery();
				list = getList(rsetAddOn, info, intKindStock);
			}

		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// �G���[���ݒ�
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// �ڍ׏��
				+ " (SBM1112)�H��R�[�h:[ " + info.getPLANT_CD() + " ]"
				+ " �ۊǋ�R�[�h:[ " + info.getWH_CD() + " ]"
			);
			list = null;
		}
		finally
		{
			closeResultSet(rset);
			closePreparedStatement(stmt);
			closePreparedStatement(stmtAddOn);
		}
		return list;
	}
	////////////////////////////////////////////////////////////////////////////
	/**
	 * ���ꗗ�擾�i�Վ��I���j
	 *
	 * @param	conn			DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	info			�p�����[�^���
	 * @param	intKindData		�擾�����
	 * @param	intKindStock	�݌Ɏ��
	 * @return	���ꗗ:���� / null:���s
	 */
	private List getList4Temp(
		IDbConnection conn, 
		InvInformation info,
		int intKindData, 
		int intKindStock)
	{
		List list = null;

		// SQL�쐬
		String strSql = null;
		strSql = getSql(info, intKindData, intKindStock, INV_TEMP);
		String strSqlNoOrder = strSql;
		String strSqlOrderBy = getSqlOrderBy(intKindStock);
		if(strSqlOrderBy != null)
		{
			strSql += strSqlOrderBy;
		}

		// SQL���s
		PreparedStatement stmt = null;
		ResultSet rset = null;
		PreparedStatement stmtAddOn = null;
		ResultSet rsetAddOn = null;
		try
		{
			// ����I���݂̂̏ꍇ
			stmt = conn.getConn().prepareStatement(strSql);
			stmt.setString(1, info.getPLANT_CD());
			stmt.setString(2, info.getINV_DATE());
			stmt.setString(3, info.getPLANT_CD());
			stmt.setString(4, info.getINV_DATE());
			stmt.setString(5, info.getPLANT_CD());
			stmt.setString(6, info.getWH_CD());
			stmt.setString(7, info.getITEM_CD());
			if(intKindStock == STOCK_ITEM || intKindStock == STOCK_TRANSPORT){
				stmt.setString(8, info.getLOT_NO());
			}
						
			rset = stmt.executeQuery();
			list = getList(rset, info, intKindStock);
			
			if(intKindStock == STOCK_ITEM && info.getLOT_NO().equals("%")){
				String strSqlAddOn = " select " 
					               + getSqlSelectFrom(STOCK_ITEM_AddOn)
					               + " where "
				                   + getSqlWhereBase(info, STOCK_ITEM_AddOn, INV_TEMP)
				                   + getSqlWhereAdd(intKindData, STOCK_ITEM_AddOn);
				
				String allSql = _sqlSelectAllFromItem + strSqlNoOrder + " union " 
				+ strSqlAddOn + " )A " + _sqlAllOderByItem;
				stmtAddOn = conn.getConn().prepareStatement(allSql);
				stmtAddOn.setString(1, info.getPLANT_CD());
				stmtAddOn.setString(2, info.getINV_DATE());
				stmtAddOn.setString(3, info.getPLANT_CD());
				stmtAddOn.setString(4, info.getINV_DATE());
				stmtAddOn.setString(5, info.getPLANT_CD());
				stmtAddOn.setString(6, info.getWH_CD());
				stmtAddOn.setString(7, info.getITEM_CD());
				stmtAddOn.setString(8, info.getLOT_NO());
				stmtAddOn.setString(9, info.getLOT_NO());
				stmtAddOn.setString(10, info.getPLANT_CD());
				stmtAddOn.setString(11, info.getINV_DATE());
				stmtAddOn.setString(12, info.getPLANT_CD());
				stmtAddOn.setString(13, info.getINV_DATE());
				stmtAddOn.setString(14, info.getPLANT_CD());
				stmtAddOn.setString(15, info.getWH_CD());
				stmtAddOn.setString(16, info.getITEM_CD());

				rsetAddOn = stmtAddOn.executeQuery();
				list = getList(rsetAddOn, info, intKindStock);
			}

		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// �G���[���ݒ�
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// �ڍ׏��
				+ " (SBM1113)�I����:[ " + info.getINV_DATE() + " ]"
				+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
				+ " �ۊǋ�R�[�h:[ " + info.getWH_CD() + " ]"
			);
			list = null;
		}
		finally
		{
			closeResultSet(rset);
			closePreparedStatement(stmt);
			closePreparedStatement(stmtAddOn);
		}
		return list;
	}
	////////////////////////////////////////////////////////////////////////////
	/**
	 * ���ꗗ�擾�i�z�I�����Վ��I���j
	 *
	 * @param	conn			DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	info			�p�����[�^���
	 * @param	intKindData		�擾�����
	 * @param	intKindStock	�݌Ɏ��
	 * @return	���ꗗ:���� / null:���s
	 */
	private List getList4CycleAndTemp(
		IDbConnection conn, 
		InvInformation info,
		int intKindData, 
		int intKindStock)
	{
		List list = null;

		// SQL�쐬
		String strSql = null;
		String strSql1 = getSql(info, intKindData, intKindStock, INV_CYCLE);
		String strSql2 = getSql(info, intKindData, intKindStock, INV_TEMP);
		if( (strSql1 != null) && (strSql2 != null) )
		{
			strSql = strSql1 + " union " + strSql2;
		}

		// SQL���s
		PreparedStatement stmt = null;
		ResultSet rset = null;

		PreparedStatement stmtAddOn_CycleTemp = null;
		ResultSet rsetAddOn_CycleTemp = null;

		try
		{
			if(intKindStock == STOCK_ITEM || intKindStock == STOCK_TRANSPORT){
				stmt = conn.getConn().prepareStatement(strSql);
				
				stmt.setString(1, info.getPLANT_CD());
				stmt.setString(2, info.getPLANT_CD());
				stmt.setString(3, info.getWH_CD());
				stmt.setString(4, info.getITEM_CD());
				stmt.setString(5, info.getLOT_NO());
				stmt.setString(6, info.getPLANT_CD());
				stmt.setString(7, info.getINV_DATE());
				stmt.setString(8, info.getPLANT_CD());
				stmt.setString(9, info.getINV_DATE());
				stmt.setString(10, info.getPLANT_CD());
				stmt.setString(11, info.getWH_CD());
				stmt.setString(12, info.getITEM_CD());
				stmt.setString(13, info.getLOT_NO());
				
				rset = stmt.executeQuery();
				list = getList(rset, info, intKindStock);
				
				if(intKindStock == STOCK_ITEM && info.getLOT_NO().equals("%")){
					String strSqlAddOn_Cycle = " select " 
						               + getSqlSelectFrom(STOCK_ITEM_AddOn)
						               + " where "
					                   + getSqlWhereBase(info, STOCK_ITEM_AddOn, INV_CYCLE)
					                   + getSqlWhereAdd(intKindData, STOCK_ITEM_AddOn);
					
					String strSqlAddOn_Temp = " select " 
			               + getSqlSelectFrom(STOCK_ITEM_AddOn)
			               + " where "
		                   + getSqlWhereBase(info, STOCK_ITEM_AddOn, INV_TEMP)
		                   + getSqlWhereAdd(intKindData, STOCK_ITEM_AddOn);
					
					String strSqlAddOn_CycleTemp = strSqlAddOn_Cycle + " union " + strSqlAddOn_Temp;
					
					String allSql = _sqlSelectAllFromItem + strSql + " union " 
					+ strSqlAddOn_CycleTemp + " )A " + _sqlAllOderByItem;
					
					stmtAddOn_CycleTemp = conn.getConn().prepareStatement(allSql);
					
					stmtAddOn_CycleTemp.setString(1, info.getPLANT_CD());
					stmtAddOn_CycleTemp.setString(2, info.getPLANT_CD());
					stmtAddOn_CycleTemp.setString(3, info.getWH_CD());
					stmtAddOn_CycleTemp.setString(4, info.getITEM_CD());
					stmtAddOn_CycleTemp.setString(5, info.getLOT_NO());
					stmtAddOn_CycleTemp.setString(6, info.getPLANT_CD());
					stmtAddOn_CycleTemp.setString(7, info.getINV_DATE());
					stmtAddOn_CycleTemp.setString(8, info.getPLANT_CD());
					stmtAddOn_CycleTemp.setString(9, info.getINV_DATE());
					stmtAddOn_CycleTemp.setString(10, info.getPLANT_CD());
					stmtAddOn_CycleTemp.setString(11, info.getWH_CD());
					stmtAddOn_CycleTemp.setString(12, info.getITEM_CD());
					stmtAddOn_CycleTemp.setString(13, info.getLOT_NO());
					stmtAddOn_CycleTemp.setString(14, info.getLOT_NO());
					stmtAddOn_CycleTemp.setString(15, info.getPLANT_CD());
					stmtAddOn_CycleTemp.setString(16, info.getPLANT_CD());
					stmtAddOn_CycleTemp.setString(17, info.getWH_CD());
					stmtAddOn_CycleTemp.setString(18, info.getITEM_CD());
					stmtAddOn_CycleTemp.setString(19, info.getLOT_NO());
					stmtAddOn_CycleTemp.setString(20, info.getPLANT_CD());
					stmtAddOn_CycleTemp.setString(21, info.getINV_DATE());
					stmtAddOn_CycleTemp.setString(22, info.getPLANT_CD());
					stmtAddOn_CycleTemp.setString(23, info.getINV_DATE());
					stmtAddOn_CycleTemp.setString(24, info.getPLANT_CD());
					stmtAddOn_CycleTemp.setString(25, info.getWH_CD());
					stmtAddOn_CycleTemp.setString(26, info.getITEM_CD());
					
					rsetAddOn_CycleTemp = stmtAddOn_CycleTemp.executeQuery();
					list = getList(rsetAddOn_CycleTemp, info, intKindStock);					
				}
				
			}else{
                // ����I���݂̂̏ꍇ
				stmt = conn.getConn().prepareStatement(strSql);
				stmt.setString(1, info.getPLANT_CD());
				stmt.setString(2, info.getPLANT_CD());
				stmt.setString(3, info.getWH_CD());
				stmt.setString(4, info.getITEM_CD());
				stmt.setString(5, info.getPLANT_CD());
				stmt.setString(6, info.getINV_DATE());
				stmt.setString(7, info.getPLANT_CD());
				stmt.setString(8, info.getINV_DATE());
				stmt.setString(9, info.getPLANT_CD());
				stmt.setString(10, info.getWH_CD());
				stmt.setString(11, info.getITEM_CD());
				
				rset = stmt.executeQuery();
				list = getList(rset, info, intKindStock);
			}
		}
		catch(SQLException se)
		{
			se.printStackTrace();

			// �G���[���ݒ�
			_msg.add(InvMessageControl.TYP_SQL_ERROR, "", DBErrorMessage.getMessage(se));
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// �ڍ׏��
				+ " (SBM1113)�I����:[ " + info.getINV_DATE() + " ]"
				+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
				+ " �ۊǋ�R�[�h:[ " + info.getWH_CD() + " ]"
			);
			list = null;
		}
		finally
		{
			closeResultSet(rset);
			closePreparedStatement(stmt);
			closePreparedStatement(stmtAddOn_CycleTemp);
		}
		return list;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * �ꗗ���擾�i���ʁj
	 *
	 * @param	rset			�Ώ�ResultSet
	 * @param	info			�p�����[�^���
	 * @param	intKindStock	�݌Ɏ��
	 * @return	SQL������:���� / null:���s
	 */
	private List getList(
		ResultSet rset, 
		InvInformation info,
		int intKindStock) throws SQLException
	{
		List list = new ArrayList(0);
		DateConverter dateConv = new DateConverter();
		int i = 0;
		while(rset.next() == true)
		{
			InvInformation infoTemp = new InvInformation();
			infoTemp.setINV_DATE(dateConv.date2str(dateConv.str2date(info.getINV_DATE())));
			switch(intKindStock)
			{
			case STOCK_ITEM: // �i�ڍ݌�
				infoTemp.setPLANT_CD(rset.getString(1));
				infoTemp.setPLANT_NAME(rset.getString(2));
				infoTemp.setWH_CD(rset.getString(3));
				infoTemp.setWH_NAME(rset.getString(4));
				infoTemp.setITEM_CD(rset.getString(5));
				infoTemp.setITEM_NAME(rset.getString(6));
				infoTemp.setLOT_NO_P(rset.getString(7));
				infoTemp.setEXTERNAL_LOT_NO(rset.getString(8));
				infoTemp.setSTOCK_ON_HAND_QTY(rset.getString(9));
				infoTemp.setDEFECT_QTY(rset.getString(10));
				infoTemp.setSTOCK_UNIT(rset.getString(11));
				infoTemp.setABC_TYP(rset.getString(12));

				break;
			case STOCK_JOB_ODR: // ���ԍ݌�
				infoTemp.setPLANT_CD(rset.getString(1));
				infoTemp.setPLANT_NAME(rset.getString(2));
				infoTemp.setWH_CD(rset.getString(3));
				infoTemp.setWH_NAME(rset.getString(4));
				infoTemp.setITEM_CD(rset.getString(5));
				infoTemp.setITEM_NAME(rset.getString(6));
				infoTemp.setJOB_ODR_CD(rset.getString(7));
				infoTemp.setSTOCK_ON_HAND_QTY(rset.getString(8));
				infoTemp.setSTOCK_UNIT(rset.getString(9));
				infoTemp.setABC_TYP(rset.getString(10));
				break;
			case STOCK_LOT: // ���b�g�݌�
				infoTemp.setPLANT_CD(rset.getString(1));
				infoTemp.setPLANT_NAME(rset.getString(2));
				infoTemp.setWH_CD(rset.getString(3));
				infoTemp.setWH_NAME(rset.getString(4));
				infoTemp.setITEM_CD(rset.getString(5));
				infoTemp.setITEM_NAME(rset.getString(6));
				infoTemp.setSTOCK_ON_HAND_QTY(rset.getString(7));
				infoTemp.setDEFECT_QTY(rset.getString(8));
				infoTemp.setSTOCK_UNIT(rset.getString(9));
				infoTemp.setABC_TYP(rset.getString(10));
				infoTemp.setLOT_NO(rset.getString(11));
				break;	
			case STOCK_TRANSPORT: // �ϑ��݌�
				infoTemp.setISSUE_PLANT_CD(rset.getString(1));
				infoTemp.setISSUE_PLANT_NAME(rset.getString(2));
				infoTemp.setISSUE_WH_CD(rset.getString(3));
				infoTemp.setISSUE_WH_NAME(rset.getString(4));
				infoTemp.setITEM_CD(rset.getString(5));
				infoTemp.setITEM_NAME(rset.getString(6));
				infoTemp.setJOB_ODR_CD(rset.getString(7));
				infoTemp.setRCV_PLANT_CD(rset.getString(8));
				infoTemp.setRCV_PLANT_NAME(rset.getString(9));
				infoTemp.setRCV_WH_CD(rset.getString(10));
				infoTemp.setRCV_WH_NAME(rset.getString(11));
				infoTemp.setw_TRANSPORT_QTY(rset.getString(12));
				infoTemp.setSTOCK_UNIT(rset.getString(13));
				infoTemp.setABC_TYP(rset.getString(14));
				infoTemp.setLOT_NO_P(rset.getString(15));
				break;
			}
			list.add(infoTemp);
		}
		return list;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * �擾����ނɂ��SQL�擾
	 *
	 * @param	info			�p�����[�^���
	 * @param	intKindData		�擾�����
	 * @param	intKindStock	�݌Ɏ��
	 * @param	intInvFlg		�I�����
	 * @return	SQL������:���� / null:���s
	 */
	private String getSql(
		InvInformation info,
		int intKindData, 
		int intKindStock, 
		int intInvFlg)
	{
		// �쐬����SQL���i�[����ϐ���������
		String strSQL = null;

		// SELECT�`FROM��擾
		String strSqlSelectFrom = getSqlSelectFrom(intKindStock);

		// WHERE��擾
		// �I����ނ���where����擾
		String strSqlWhereBase = getSqlWhereBase(info, intKindStock, intInvFlg);

		// �擾���A�݌Ɏ�ނɂ��where��̒ǉ�����SQL���擾
		String strSqlWhereAdd = getSqlWhereAdd(intKindData, intKindStock);

		// SQL�쐬
		if( (strSqlSelectFrom != null) && (strSqlWhereBase != null) && (strSqlWhereAdd != null) )
		{
			strSQL = "select " + strSqlSelectFrom + " where " + strSqlWhereBase + strSqlWhereAdd;
		}
		return strSQL;
	}


	////////////////////////////////////////////////////////////////////////////
	/**
	 * �݌Ɏ�ޕʂɂ��SQL�擾�iSELECT�`FROM��j
	 *
	 * @param	intKindStock	�݌Ɏ��
	 * @return	SQL������:���� / null:���s
	 */
	private String getSqlSelectFrom(
		int intKindStock)
	{
		String strSql = "";
		switch(intKindStock)
		{
		case STOCK_ITEM:		// �i�ڍ݌�
			strSql = _sqlSelectFromItem;
			break;
		case STOCK_ITEM_AddOn:		// �i�ڍ݌� add on
			strSql = _sqlSelectFromItem_AddOn;
			break;
		case STOCK_JOB_ODR:	// ���ԍ݌�
			strSql = _sqlSelectFromJobOdr;
			break;
		case STOCK_LOT:	// ���b�g�݌�
			strSql = _sqlSelectFromLot;
			break;
		case STOCK_TRANSPORT:	// �ϑ��݌�
			strSql = _sqlSelectFromTransport;
			break;
		default:// �G���[
			strSql = null;
			break;
		}
		return strSql;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * �I���^�C�v�A�݌Ɏ�ޕʂɂ�����SQL�擾�iWHERE��j
	 *
	 * @param	info			�p�����[�^���
	 * @param	intKindStock	�݌Ɏ��
	 * @param	intInvFlg		�I�����
	 * @return	SQL������:���� / null:���s
	 */
	private String getSqlWhereBase(
		InvInformation info,
		int intKindStock, 
		int intInvFlg)
	{
		String strSql = "";
		switch(intInvFlg)
		{
		case INV_REGULAR:// ����I��
			switch(intKindStock)
			{
			case STOCK_ITEM:		// �i�ڍ݌�
				strSql = _sqlWhereRegularAndItem;
				break;
			case STOCK_ITEM_AddOn:		// �i�ڍ݌�  addon
				strSql = _sqlWhereRegularAndItem_AddOn;
				break;
			case STOCK_JOB_ODR:	// ���ԍ݌�
				strSql = _sqlWhereRegularAndJobOdr;
				break;
			case STOCK_LOT:	// ���b�g�݌�
				strSql = _sqlWhereRegularAndLot;
				break;
			case STOCK_TRANSPORT:	// �ϑ��݌�
				strSql = _sqlWhereRegularAndTransport;
				break;
			default:// �G���[
				strSql = null;
				break;
			}
			break;
		case INV_CYCLE:// �z�I��
			switch(intKindStock)
			{
			case STOCK_ITEM:		// �i�ڍ݌�
				strSql = _sqlWhereCycleAndItem;
				break;
			case STOCK_ITEM_AddOn:		// �i�ڍ݌�  addon
				strSql = _sqlWhereCycleAndItem_AddOn;
				break;
			case STOCK_JOB_ODR:	// ���ԍ݌�
				strSql = _sqlWhereCycleAndJobOdr;
				break;
			case STOCK_LOT:	// ���b�g�݌�
				strSql = _sqlWhereCycleAndLot;
				break;
			case STOCK_TRANSPORT:	// �ϑ��݌�
				strSql = _sqlWhereCycleAndTransport;
				break;
			default:// �G���[
				strSql = null;
				break;
			}

			// �I�����̌��ƃ}�b�`����I�����{���t���O�̏�����ݒ肷�鏈��
			if( (strSql != null) && ("".equals(strSql) != true) )
			{
				Object[] monthNames = {"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};

				// �I�����t�̌����擾
				DateConverter dateConv = new DateConverter();
				Date dateWork = dateConv.str2date(info.getINV_DATE());
				Calendar cal = new GregorianCalendar();
				cal.setTime(dateWork);
				int intMonth = cal.get(Calendar.MONTH);

				// ��������
				if( (intMonth >= 0) && (intMonth <= 11) )
				{
					// �I�����̃t���O�̏������𐶐�����
					Object param[] = new Object[1];
					param[0] = monthNames[intMonth];
					strSql = MessageFormat.format(strSql, param);
				}
				else
				{
					// �G���[
					strSql = null;
				}
			}
			break;
		case INV_TEMP:// �Վ��I��
			switch(intKindStock)
			{
			case STOCK_ITEM:		// �i�ڍ݌�
				strSql = _sqlWhereTempAndItem;
				break;
			case STOCK_ITEM_AddOn:		// �i�ڍ݌� add on
				strSql = _sqlWhereTempAndItem_AddOn;
				break;
			case STOCK_JOB_ODR:	// ���ԍ݌�
				strSql = _sqlWhereTempAndJobOdr;
				break;
			case STOCK_LOT:	// ���b�g�݌�
				strSql = _sqlWhereTempAndLot;
				break;
			case STOCK_TRANSPORT:	// �ϑ��݌�
				strSql = _sqlWhereTempAndTransport;
				break;
			default:// �G���[
				strSql = null;
				break;
			}
			break;
		default:// �G���[
			strSql = null;
			break;
		}
		return strSql;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * �擾���A�݌Ɏ�ނɂ��ǉ�����SQL�擾�iWHERE��j
	 *
	 * @param	intKindData		�擾�����
	 * @param	intKindStock	�݌Ɏ��
	 * @return	SQL������:���� / null:���s
	 */
	private String getSqlWhereAdd(
		int intKindData, 
		int intKindStock)
	{
		String strSql = "";
		switch(intKindData)
		{
		case DATA_NORMAL:// �I���݌ɏ��
			switch(intKindStock)
			{
			case STOCK_ITEM:// �i�ڍ݌�
				strSql = _sqlWhereAddNormalAndItem;
				break;
			case STOCK_ITEM_AddOn:// �i�ڍ݌�
				strSql = _sqlWhereAddNormalAndItem_AddOn;
				break;
			case STOCK_JOB_ODR:// ���ԍ݌�
				strSql = _sqlWhereAddNormalAndJobOdr;
				break;
			case STOCK_LOT:// ���b�g�݌�
				strSql = _sqlWhereAddNormalAndLot;
				break;
			}
			break;
		case DATA_DEFECT:		// �s�Ǎ݌ɏ��
			if(intKindStock == STOCK_ITEM)// �i�ڍ݌�
			{
				strSql = _sqlWhereAddDefectAndItem;
			}
			if(intKindStock == STOCK_ITEM_AddOn)// �i�ڍ݌� add on
			{
				strSql = _sqlWhereAddDefectAndItem_AddOn;
			}
			break;
		case DATA_MINUS:		// �}�C�i�X�݌ɏ��
			switch(intKindStock)
			{
			case STOCK_ITEM:// �i�ڍ݌�
				strSql = _sqlWhereAddMinusAndItem;
				break;
			case STOCK_ITEM_AddOn:// �i�ڍ݌� add on
				strSql = _sqlWhereAddMinusAndItem_AddOn;
				break;
			case STOCK_JOB_ODR:// ���ԍ݌�
				strSql = _sqlWhereAddMinusAndJobOdr;
				break;
			}
			break;
		case DATA_TRANSPORT:	// �ϑ��݌ɏ��
			if(intKindStock == STOCK_TRANSPORT)// �ϑ��݌�
			{
				strSql = _sqlWhereAddTransportAndTransport;
			}
			break;
		case DATA_LOT:	// ���b�g�݌ɏ��
			if(intKindStock == STOCK_LOT)// ���b�g�݌�
			{
				strSql = _sqlWhereAddNormalAndLot;
			}
			break;	
		default:
			// �G���[
			strSql = null;
		}
		return strSql;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * �݌Ɏ�ނɂ����я�SQL���擾(ORDER BY��)
	 *
	 * @param	intKindStock	�݌Ɏ��
	 * @return	SQL������:���� / null:���s
	 */
	private String getSqlOrderBy(
		int intKindStock)
	{
		String strSql = "";
		switch(intKindStock)
		{
		case STOCK_ITEM:// �i�ڍ݌�
			strSql = _sqlOderByItem;
			break;
		case STOCK_JOB_ODR:// ���ԍ݌�
			strSql = _sqlOderByJobOdr;
			break;
		case STOCK_TRANSPORT:// �ϑ��݌�
			strSql = _sqlOderByTransport;
			break;
		case STOCK_LOT:// �i�ڍ݌�
			strSql = _sqlOderByLot;
			break;	
		default:
			// �G���[
			strSql = null;
		}
		return strSql;
	}

//------------------------------------------------------------------------------------
// SQL��`

	////////////////////////////////////////////////////////////////////////////
	// �Ǎ�SQL��`

	/** �i�ڍ݌ɓǍ�����SQL */
	private String _sqlSelectFromItem = ""
+" T_ITEM_STOCK.PLANT_CD as PLANT_CD "
+",M_PLANT.PLANT_NAME as PLANT_NAME "
+",T_ITEM_STOCK.WH_CD as WH_CD "
+",M_WH.WH_NAME as WH_NAME "
+",T_ITEM_STOCK.ITEM_CD as ITEM_CD "
+",M_ITEM.ITEM_NAME as ITEM_NAME "
+",T_LOT_STOCK.LOT_NO  as LOT_NO " 
+",T_LOT_CTRL.EXTERNAL_LOT_NO  as EXTERNAL_LOT_NO "
+",TO_CHAR(T_LOT_STOCK.STOCK_ON_HAND_QTY, 'fm99999999999990.0999') as STOCK_ON_HAND_QTY "
+",TO_CHAR(T_LOT_STOCK.DEFECT_QTY, 'fm99999999999990.0999') as DEFECT_QTY "
+",M_ITEM.STOCK_UNIT as STOCK_UNIT "
+",M_ITEM.ABC_TYP as ABC_TYP "
+"from "
+" T_ITEM_STOCK "
+",M_PLANT "
+",M_ITEM "
+",M_WH "
+",T_LOT_STOCK "
+",T_LOT_CTRL ";

	// �Ǎ�SQL��`
		/** �i�ڍ݌ɓǍ�����SQL */
		private String _sqlSelectFromItem_AddOn = ""
	+" T_ITEM_STOCK.PLANT_CD as PLANT_CD "
	+",M_PLANT.PLANT_NAME as PLANT_NAME "
	+",T_ITEM_STOCK.WH_CD as WH_CD "
	+",M_WH.WH_NAME as WH_NAME "
	+",T_ITEM_STOCK.ITEM_CD as ITEM_CD "
	+",M_ITEM.ITEM_NAME as ITEM_NAME "
	+",null " 
	+",null "
	+",TO_CHAR((NVL(T_ITEM_STOCK.STOCK_ON_HAND_QTY,0)-NVL(LOT_SUM.SUM_LOT_STOCK_QTY,0)), 'fm99999999999990.0999') as STOCK_ON_HAND_QTY "
	+",TO_CHAR((NVL(T_ITEM_STOCK.DEFECT_QTY,0) - NVL(LOT_SUM.SUM_DEFECT_QTY,0)), 'fm99999999999990.0999') as DEFECT_QTY "
	+",M_ITEM.STOCK_UNIT as STOCK_UNIT "
	+",M_ITEM.ABC_TYP as ABC_TYP "
	+"from "
	+" T_ITEM_STOCK "
	+",M_PLANT "
	+",M_ITEM "
	+",M_WH "
	+",(select SUM(T_LOT_STOCK.STOCK_ON_HAND_QTY) AS SUM_LOT_STOCK_QTY, SUM(T_LOT_STOCK.DEFECT_QTY) AS SUM_DEFECT_QTY,T_LOT_STOCK.ITEM_CD ITEM_CD_a,T_LOT_STOCK.WH_CD WH_CD_a, T_LOT_STOCK.PLANT_CD PLANT_CD_A from T_LOT_STOCK WHERE T_LOT_STOCK.LOT_NO LIKE ? group by T_LOT_STOCK.ITEM_CD ,T_LOT_STOCK.WH_CD,T_LOT_STOCK.PLANT_CD ) LOT_SUM ";

   /** �i�ڍ݌ɓǍ�����SQL */
   private String _sqlSelectAllFromItem = "select"
   + " A.PLANT_CD as PLANT_CD, "
   + " A.PLANT_NAME as PLANT_NAME,"
   + " A.WH_CD as WH_CD,"
   + " A.WH_NAME as WH_NAME,"
   + " A.ITEM_CD as ITEM_CD,"
   + " A.ITEM_NAME as ITEM_NAME,"
   + " A.LOT_NO  as LOT_NO,"
   + " A.EXTERNAL_LOT_NO as EXTERNAL_LOT_NO,"
   + " A.STOCK_ON_HAND_QTY as STOCK_ON_HAND_QTY,"
   + " A.DEFECT_QTY as DEFECT_QTY,"
   + " A.STOCK_UNIT as STOCK_UNIT," 
   + " A.ABC_TYP as ABC_TYP"
   + " FROM (";
   						
	/** ���ԍ݌ɓǍ�����SQL */
	private String _sqlSelectFromJobOdr = ""
+" T_JOB_ODR_CD_STOCK.PLANT_CD as PLANT_CD "
+",M_PLANT.PLANT_NAME as PLANT_NAME "
+",T_JOB_ODR_CD_STOCK.WH_CD as WH_CD "
+",M_WH.WH_NAME as WH_NAME "
+",T_JOB_ODR_CD_STOCK.ITEM_CD as ITEM_CD "
+",M_ITEM.ITEM_NAME as ITEM_NAME "
+",T_JOB_ODR_CD_STOCK.JOB_ODR_CD as JOB_ODR_CD "
+",TO_CHAR(T_JOB_ODR_CD_STOCK.STOCK_ON_HAND_QTY, 'fm99999999999990.0999') as STOCK_ON_HAND_QTY "
+",M_ITEM.STOCK_UNIT as STOCK_UNIT "
+",M_ITEM.ABC_TYP as ABC_TYP "
+"from "
+" T_JOB_ODR_CD_STOCK "
+",M_PLANT "
+",M_ITEM "
+",M_WH ";
	
	/** ���b�g�݌ɓǍ�����SQL */
	private String _sqlSelectFromLot = ""
		+" T_LOT_STOCK.PLANT_CD as PLANT_CD "
		+",M_PLANT.PLANT_NAME as PLANT_NAME "
		+",T_LOT_STOCK.WH_CD as WH_CD "
		+",M_WH.WH_NAME as WH_NAME "
		+",T_LOT_STOCK.ITEM_CD as ITEM_CD "
		+",M_ITEM.ITEM_NAME as ITEM_NAME "
		+",TO_CHAR(T_LOT_STOCK.STOCK_ON_HAND_QTY, 'fm99999999999990.0999') as STOCK_ON_HAND_QTY "
		+",TO_CHAR(T_LOT_STOCK.DEFECT_QTY, 'fm99999999999990.0999') as DEFECT_QTY "
		+",M_ITEM.STOCK_UNIT as STOCK_UNIT "
		+",M_ITEM.ABC_TYP as ABC_TYP "
		+",T_LOT_STOCK.LOT_NO as LOT_NO "
		+"from "
		+" T_LOT_STOCK "
		+",M_PLANT "
		+",M_ITEM "
		+",M_WH ";

	/** �ϑ��݌ɂ̓Ǎ����e */
	private String _sqlSelectFromTransport = ""
+" T_TRANSPORT_STOCK.ISSUE_PLANT_CD as ISSUE_PLANT_CD "
+",PLANT1.PLANT_NAME as ISSUE_PLANT_NAME "
+",T_TRANSPORT_STOCK.ISSUE_WH_CD as ISSUE_WH_CD "
+",WH1.WH_NAME as ISSUE_WH_NAME "
+",T_TRANSPORT_STOCK.ITEM_CD as ITEM_CD "
+",M_ITEM.ITEM_NAME as ITEM_NAME "
+",T_TRANSPORT_STOCK.JOB_ODR_CD as JOB_ODR_CD "
+",T_TRANSPORT_STOCK.RCV_PLANT_CD as RCV_PLANT_CD "
+",PLANT2.PLANT_NAME as RCV_PLANT_NAME "
+",T_TRANSPORT_STOCK.RCV_WH_CD as RCV_WH_CD "
+",WH2.WH_NAME as RCV_WH_NAME "
+",TO_CHAR((T_TRANSPORT_STOCK.ISSUE_QTY - T_TRANSPORT_STOCK.RCV_QTY), 'fm99999999999990.0999') as TRANSPORT_QTY "
+",M_ITEM.STOCK_UNIT as STOCK_UNIT "
+",M_ITEM.ABC_TYP as ABC_TYP "
+",T_TRANSPORT_STOCK.LOT_NO AS LOT_NO "
+"from "
+" T_TRANSPORT_STOCK "
+",M_PLANT PLANT1 "
+",M_PLANT PLANT2 "
+",M_ITEM "
+",M_WH WH1 "
+",M_WH WH2 ";

	////////////////////////////////////////////////////////////////////////////
	// ����SQL��`

	/** ����I���A�i�ڍ݌� */
	private String _sqlWhereRegularAndItem = ""
+" T_ITEM_STOCK.WH_CD = M_WH.WH_CD "
+" and T_ITEM_STOCK.ITEM_CD = M_ITEM.ITEM_CD "
+" and T_ITEM_STOCK.PLANT_CD = M_PLANT.PLANT_CD "
+" and T_ITEM_STOCK.PLANT_CD = ? "
+" and M_ITEM.ABC_TYP <> 9 "
+" and M_ITEM.MRP_ODR_TYP <> 8 "
+" and T_LOT_STOCK.STOCK_ON_HAND_QTY > 0 "
+" and T_LOT_CTRL.LOT_NO = T_LOT_STOCK.LOT_NO "
+" and T_LOT_CTRL.ITEM_CD = T_LOT_STOCK.ITEM_CD "
+" and T_LOT_STOCK.ITEM_CD = T_ITEM_STOCK.ITEM_CD "
+" and T_LOT_STOCK.WH_CD = T_ITEM_STOCK.WH_CD "
+" and T_LOT_STOCK.PLANT_CD = T_ITEM_STOCK.PLANT_CD "
+" and M_ITEM.LOT_CTRL_FLG = 1 ";

	/** ����I���A�i�ڍ݌� add on */
	private String _sqlWhereRegularAndItem_AddOn = ""
+" T_ITEM_STOCK.WH_CD = M_WH.WH_CD "
+" and T_ITEM_STOCK.ITEM_CD = M_ITEM.ITEM_CD "
+" and T_ITEM_STOCK.PLANT_CD = M_PLANT.PLANT_CD "
+" and T_ITEM_STOCK.PLANT_CD = ? "
+" and M_ITEM.ABC_TYP <> 9 "
+" and M_ITEM.MRP_ODR_TYP <> 8 "
+" and T_ITEM_STOCK.ITEM_CD = LOT_SUM.ITEM_CD_a(+) "
+" and T_ITEM_STOCK.WH_CD = LOT_SUM.WH_CD_a(+) "
+" and T_ITEM_STOCK.PLANT_CD = LOT_SUM.PLANT_CD_a(+) "
+" and  ("
+" M_ITEM.LOT_CTRL_FLG = 0"
+" OR"
+" (M_ITEM.LOT_CTRL_FLG = 1"
+" AND T_ITEM_STOCK.STOCK_ON_HAND_QTY<>LOT_SUM.SUM_LOT_STOCK_QTY"
+" OR T_ITEM_STOCK.DEFECT_QTY <> LOT_SUM.SUM_DEFECT_QTY)"
+" )";


	/** ����I���A���ԍ݌� */
	private String _sqlWhereRegularAndJobOdr = ""
+" T_JOB_ODR_CD_STOCK.WH_CD = M_WH.WH_CD "
+" and T_JOB_ODR_CD_STOCK.ITEM_CD = M_ITEM.ITEM_CD "
+" and T_JOB_ODR_CD_STOCK.PLANT_CD = M_PLANT.PLANT_CD "
+" and T_JOB_ODR_CD_STOCK.PLANT_CD = ? "
+" and M_ITEM.ABC_TYP <> 9 "
+" and M_ITEM.MRP_ODR_TYP <> 8 ";
	
	/** ����I���A���b�g�݌� */
	private String _sqlWhereRegularAndLot = ""
		+" T_LOT_STOCK.WH_CD = M_WH.WH_CD "
		+" and T_LOT_STOCK.ITEM_CD = M_ITEM.ITEM_CD "
		+" and T_LOT_STOCK.PLANT_CD = M_PLANT.PLANT_CD "
		+" and T_LOT_STOCK.STOCK_ON_HAND_QTY > 0 "
		+" and T_LOT_STOCK.PLANT_CD = ? "
		+" and M_ITEM.ABC_TYP <> 9 "
		+" and M_ITEM.MRP_ODR_TYP <> 8 ";


	/** ����I���A�ϑ��݌� */
	private String _sqlWhereRegularAndTransport = ""
+" T_TRANSPORT_STOCK.ISSUE_WH_CD = WH1.WH_CD "
+" and T_TRANSPORT_STOCK.RCV_WH_CD = WH2.WH_CD "
+" and T_TRANSPORT_STOCK.ITEM_CD = M_ITEM.ITEM_CD "
+" and T_TRANSPORT_STOCK.ISSUE_PLANT_CD = PLANT1.PLANT_CD "
+" and T_TRANSPORT_STOCK.RCV_PLANT_CD = PLANT2.PLANT_CD "
+" and T_TRANSPORT_STOCK.ISSUE_PLANT_CD = ? "
+" and T_TRANSPORT_STOCK.TRANSPORT_CMPLT_TYP = 0 "
+" and M_ITEM.ABC_TYP <> 9 "
+" and M_ITEM.MRP_ODR_TYP <> 8 ";


	/** �z�I���A�i�ڍ݌� */
	private String _sqlWhereCycleAndItem = ""
+" T_ITEM_STOCK.WH_CD = M_WH.WH_CD "
+" and T_ITEM_STOCK.ITEM_CD = M_ITEM.ITEM_CD "
+" and M_ITEM.ABC_TYP <> 9 "
+" and M_ITEM.MRP_ODR_TYP <> 8 "
+" and T_LOT_STOCK.STOCK_ON_HAND_QTY > 0 "
+" and T_ITEM_STOCK.PLANT_CD = M_PLANT.PLANT_CD "
+" and T_ITEM_STOCK.PLANT_CD = ? "
+" and T_ITEM_STOCK.ITEM_CD IN ( "
+"  select "
+"   T_INV_CYCLE.ITEM_CD "
+"  from "
+"   T_INV_CYCLE "
+"  where "
+"   T_INV_CYCLE.PLANT_CD = ? "
+"   and T_INV_CYCLE.INV_FLG_{0} = 1 "
+" ) "
+" and T_LOT_CTRL.LOT_NO = T_LOT_STOCK.LOT_NO "
+" and T_LOT_CTRL.ITEM_CD = T_LOT_STOCK.ITEM_CD "
+" and T_LOT_STOCK.ITEM_CD = T_ITEM_STOCK.ITEM_CD "
+" and T_LOT_STOCK.WH_CD = T_ITEM_STOCK.WH_CD "
+" and T_LOT_STOCK.PLANT_CD = T_ITEM_STOCK.PLANT_CD ";

	/** �z�I���A�i�ڍ݌� add on */
	private String _sqlWhereCycleAndItem_AddOn = ""
+" T_ITEM_STOCK.WH_CD = M_WH.WH_CD "
+" and T_ITEM_STOCK.ITEM_CD = M_ITEM.ITEM_CD "
+" and M_ITEM.ABC_TYP <> 9 "
+" and M_ITEM.MRP_ODR_TYP <> 8 "
+" and T_ITEM_STOCK.PLANT_CD = M_PLANT.PLANT_CD "
+" and T_ITEM_STOCK.PLANT_CD = ? "
+" and T_ITEM_STOCK.ITEM_CD IN ( "
+"  select "
+"   T_INV_CYCLE.ITEM_CD "
+"  from "
+"   T_INV_CYCLE "
+"  where "
+"   T_INV_CYCLE.PLANT_CD = ? "
+"   and T_INV_CYCLE.INV_FLG_{0} = 1 "
+" ) "
+" and T_ITEM_STOCK.ITEM_CD = LOT_SUM.ITEM_CD_a(+) "
+" and T_ITEM_STOCK.WH_CD = LOT_SUM.WH_CD_a(+) "
+" and T_ITEM_STOCK.PLANT_CD = LOT_SUM.PLANT_CD_a(+) "
+" and  ("
+" M_ITEM.LOT_CTRL_FLG = 0"
+" OR"
+" (M_ITEM.LOT_CTRL_FLG = 1"
+" AND T_ITEM_STOCK.STOCK_ON_HAND_QTY<>LOT_SUM.SUM_LOT_STOCK_QTY"
+" OR T_ITEM_STOCK.DEFECT_QTY <> LOT_SUM.SUM_DEFECT_QTY)"
+" )";


	/** �z�I���A���ԍ݌� */
	private String _sqlWhereCycleAndJobOdr = ""
+" T_JOB_ODR_CD_STOCK.WH_CD = M_WH.WH_CD "
+" and T_JOB_ODR_CD_STOCK.ITEM_CD = M_ITEM.ITEM_CD "
+" and M_ITEM.ABC_TYP <> 9 "
+" and M_ITEM.MRP_ODR_TYP <> 8 "
+" and T_JOB_ODR_CD_STOCK.PLANT_CD = M_PLANT.PLANT_CD "
+" and T_JOB_ODR_CD_STOCK.PLANT_CD = ? "
+" and T_JOB_ODR_CD_STOCK.ITEM_CD IN ( "
+"  select "
+"   T_INV_CYCLE.ITEM_CD "
+"  from "
+"   T_INV_CYCLE "
+"  where "
+"   T_INV_CYCLE.PLANT_CD = ? "
+"   and T_INV_CYCLE.INV_FLG_{0} = 1 "
+" ) ";
	
	/** �z�I���A���b�g�݌� */
	private String _sqlWhereCycleAndLot = ""
		+" T_LOT_STOCK.WH_CD = M_WH.WH_CD "
		+" and T_LOT_STOCK.ITEM_CD = M_ITEM.ITEM_CD "
		+" and M_ITEM.ABC_TYP <> 9 "
		+" and M_ITEM.MRP_ODR_TYP <> 8 "
		+" and T_LOT_STOCK.PLANT_CD = M_PLANT.PLANT_CD "
		+" and T_LOT_STOCK.PLANT_CD = ? "
		+" and T_LOT_STOCK.STOCK_ON_HAND_QTY > 0 "
		+" and T_LOT_STOCK.ITEM_CD IN ( "
		+"  select "
		+"   T_INV_CYCLE.ITEM_CD "
		+"  from "
		+"   T_INV_CYCLE "
		+"  where "
		+"   T_INV_CYCLE.PLANT_CD = ? "
		+"   and T_INV_CYCLE.INV_FLG_{0} = 1 "
		+" ) ";

	/** �z�I���A�ϑ��݌� */
	private String _sqlWhereCycleAndTransport = ""
+" T_TRANSPORT_STOCK.ISSUE_WH_CD = WH1.WH_CD "
+" and T_TRANSPORT_STOCK.RCV_WH_CD = WH2.WH_CD "
+" and T_TRANSPORT_STOCK.ITEM_CD = M_ITEM.ITEM_CD "
+" and M_ITEM.ABC_TYP <> 9 "
+" and M_ITEM.MRP_ODR_TYP <> 8 "
+" and T_TRANSPORT_STOCK.ISSUE_PLANT_CD = PLANT1.PLANT_CD "
+" and T_TRANSPORT_STOCK.RCV_PLANT_CD = PLANT2.PLANT_CD "
+" and T_TRANSPORT_STOCK.ISSUE_PLANT_CD = ? "
+" and T_TRANSPORT_STOCK.TRANSPORT_CMPLT_TYP = 0 "
+" and T_TRANSPORT_STOCK.ITEM_CD IN ( "
+"  select "
+"   T_INV_CYCLE.ITEM_CD "
+"  from "
+"   T_INV_CYCLE "
+"  where "
+"   T_INV_CYCLE.PLANT_CD = ? "
+"   and T_INV_CYCLE.INV_FLG_{0} = 1 "
+" ) ";

	/** �Վ��I���A�i�ڍ݌� */
	private String _sqlWhereTempAndItem = ""
+" T_ITEM_STOCK.WH_CD = M_WH.WH_CD "
+" and T_ITEM_STOCK.ITEM_CD = M_ITEM.ITEM_CD "
+" and M_ITEM.ABC_TYP <> 9 "
+" and M_ITEM.MRP_ODR_TYP <> 8 "
+" and T_LOT_STOCK.STOCK_ON_HAND_QTY > 0 "
+" and T_ITEM_STOCK.PLANT_CD = M_PLANT.PLANT_CD "
+" and T_ITEM_STOCK.PLANT_CD = ? "
+" and ((T_ITEM_STOCK.WH_CD IN ( "
+"	  select "
+"	   T_INV_TARGET_WH.WH_CD "
+"	  from "
+"	   T_INV_TARGET_WH "
+"	  where "
+"	   T_INV_TARGET_WH.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+"	   and T_INV_TARGET_WH.PLANT_CD = ? )) "
+"	 or (T_ITEM_STOCK.ITEM_CD IN ( "
+"	  select "
+"	   T_INV_TARGET_ITEM.ITEM_CD "
+"	  from "
+"	   T_INV_TARGET_ITEM "
+"	  where "
+"	   T_INV_TARGET_ITEM.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+"	   and T_INV_TARGET_ITEM.PLANT_CD = ? )) "
+" ) "
+" and T_LOT_CTRL.LOT_NO = T_LOT_STOCK.LOT_NO "
+" and T_LOT_CTRL.ITEM_CD = T_LOT_STOCK.ITEM_CD "
+" and T_LOT_STOCK.ITEM_CD = T_ITEM_STOCK.ITEM_CD "
+" and T_LOT_STOCK.WH_CD = T_ITEM_STOCK.WH_CD "
+" and T_LOT_STOCK.PLANT_CD = T_ITEM_STOCK.PLANT_CD ";

	/** �Վ��I���A�i�ڍ݌� add on*/
	private String _sqlWhereTempAndItem_AddOn = ""
+" T_ITEM_STOCK.WH_CD = M_WH.WH_CD "
+" and T_ITEM_STOCK.ITEM_CD = M_ITEM.ITEM_CD "
+" and M_ITEM.ABC_TYP <> 9 "
+" and M_ITEM.MRP_ODR_TYP <> 8 "
+" and T_ITEM_STOCK.PLANT_CD = M_PLANT.PLANT_CD "
+" and T_ITEM_STOCK.PLANT_CD = ? "
+" and ((T_ITEM_STOCK.WH_CD IN ( "
+"	  select "
+"	   T_INV_TARGET_WH.WH_CD "
+"	  from "
+"	   T_INV_TARGET_WH "
+"	  where "
+"	   T_INV_TARGET_WH.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+"	   and T_INV_TARGET_WH.PLANT_CD = ? )) "
+"	 or (T_ITEM_STOCK.ITEM_CD IN ( "
+"	  select "
+"	   T_INV_TARGET_ITEM.ITEM_CD "
+"	  from "
+"	   T_INV_TARGET_ITEM "
+"	  where "
+"	   T_INV_TARGET_ITEM.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+"	   and T_INV_TARGET_ITEM.PLANT_CD = ? )) "
+" ) "
+" and T_ITEM_STOCK.ITEM_CD = LOT_SUM.ITEM_CD_a(+) "
+" and T_ITEM_STOCK.WH_CD = LOT_SUM.WH_CD_a(+) "
+" and T_ITEM_STOCK.PLANT_CD = LOT_SUM.PLANT_CD_a(+) "
+" and  ("
+" M_ITEM.LOT_CTRL_FLG = 0"
+" OR"
+" (M_ITEM.LOT_CTRL_FLG = 1"
+" AND T_ITEM_STOCK.STOCK_ON_HAND_QTY<>LOT_SUM.SUM_LOT_STOCK_QTY"
+" OR T_ITEM_STOCK.DEFECT_QTY <> LOT_SUM.SUM_DEFECT_QTY)"
+" )";


	/** �Վ��I���A���ԍ݌� */
	private String _sqlWhereTempAndJobOdr = ""
+" T_JOB_ODR_CD_STOCK.WH_CD = M_WH.WH_CD "
+" and T_JOB_ODR_CD_STOCK.ITEM_CD = M_ITEM.ITEM_CD "
+" and M_ITEM.ABC_TYP <> 9 "
+" and M_ITEM.MRP_ODR_TYP <> 8 "
+" and T_JOB_ODR_CD_STOCK.PLANT_CD = M_PLANT.PLANT_CD "
+" and T_JOB_ODR_CD_STOCK.PLANT_CD = ? "
+" and ((T_JOB_ODR_CD_STOCK.WH_CD IN ( "
+"	  select "
+"	   T_INV_TARGET_WH.WH_CD "
+"	  from "
+"	   T_INV_TARGET_WH "
+"	  where "
+"	   T_INV_TARGET_WH.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+"	   and T_INV_TARGET_WH.PLANT_CD = ? )) "
+"	 or (T_JOB_ODR_CD_STOCK.ITEM_CD IN ( "
+"	  select "
+"	   T_INV_TARGET_ITEM.ITEM_CD "
+"	  from "
+"	   T_INV_TARGET_ITEM "
+"	  where "
+"	   T_INV_TARGET_ITEM.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+"	   and T_INV_TARGET_ITEM.PLANT_CD = ?)) "
+" ) ";

	/** �Վ��I���A���b�g�݌� */
	private String _sqlWhereTempAndLot = ""
		+" T_LOT_STOCK.WH_CD = M_WH.WH_CD "
		+" and T_LOT_STOCK.ITEM_CD = M_ITEM.ITEM_CD "
		+" and M_ITEM.ABC_TYP <> 9 "
		+" and M_ITEM.MRP_ODR_TYP <> 8 "
		+" and T_LOT_STOCK.PLANT_CD = M_PLANT.PLANT_CD "
		+" and T_LOT_STOCK.PLANT_CD = ? "
		+" and T_LOT_STOCK.STOCK_ON_HAND_QTY > 0 "
		+" and ((T_LOT_STOCK.WH_CD IN ( "
		+"	  select "
		+"	   T_INV_TARGET_WH.WH_CD "
		+"	  from "
		+"	   T_INV_TARGET_WH "
		+"	  where "
		+"	   T_INV_TARGET_WH.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
		+"	   and T_INV_TARGET_WH.PLANT_CD = ? )) "
		+"	 or (T_LOT_STOCK.ITEM_CD IN ( "
		+"	  select "
		+"	   T_INV_TARGET_ITEM.ITEM_CD "
		+"	  from "
		+"	   T_INV_TARGET_ITEM "
		+"	  where "
		+"	   T_INV_TARGET_ITEM.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
		+"	   and T_INV_TARGET_ITEM.PLANT_CD = ? )) "
		+" ) ";
	
	/** �Վ��I���A�ϑ��݌� */
	private String _sqlWhereTempAndTransport = ""
+" T_TRANSPORT_STOCK.ISSUE_WH_CD = WH1.WH_CD "
+" and T_TRANSPORT_STOCK.RCV_WH_CD = WH2.WH_CD "
+" and T_TRANSPORT_STOCK.ITEM_CD = M_ITEM.ITEM_CD "
+" and M_ITEM.ABC_TYP <> 9 "
+" and M_ITEM.MRP_ODR_TYP <> 8 "
+" and T_TRANSPORT_STOCK.ISSUE_PLANT_CD = PLANT1.PLANT_CD "
+" and T_TRANSPORT_STOCK.RCV_PLANT_CD = PLANT2.PLANT_CD "
+" and T_TRANSPORT_STOCK.ISSUE_PLANT_CD = ? "
+" and T_TRANSPORT_STOCK.TRANSPORT_CMPLT_TYP = 0 "
+" and ((T_TRANSPORT_STOCK.ISSUE_WH_CD IN ( "
+"	  select "
+"	   T_INV_TARGET_WH.WH_CD "
+"	  from "
+"	   T_INV_TARGET_WH "
+"	  where "
+"	   T_INV_TARGET_WH.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+"	   and T_INV_TARGET_WH.PLANT_CD = ? )) "
+"	 or (T_TRANSPORT_STOCK.ITEM_CD IN ( "
+"	  select "
+"	   T_INV_TARGET_ITEM.ITEM_CD "
+"	  from "
+"	   T_INV_TARGET_ITEM "
+"	  where "
+"	   T_INV_TARGET_ITEM.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+"	   and T_INV_TARGET_ITEM.PLANT_CD = ? )) "
+" ) ";

	////////////////////////////////////////////////////////////////////////////
	// �ǉ�����SQL��`

	/** �݌ɏ��A�i�ڍ݌� */
	private String _sqlWhereAddNormalAndItem = ""
+" and T_ITEM_STOCK.WH_CD like ? "
+" and T_LOT_STOCK.ITEM_CD like ? "
+" and T_LOT_STOCK.LOT_NO like ? ";

	/** �݌ɏ��A�i�ڍ݌�add on */
	private String _sqlWhereAddNormalAndItem_AddOn = ""
+" and T_ITEM_STOCK.WH_CD like ? "
+" and T_ITEM_STOCK.ITEM_CD like ? ";

	/** �݌ɏ��A���ԍ݌� */
	private String _sqlWhereAddNormalAndJobOdr = ""
+" and T_JOB_ODR_CD_STOCK.WH_CD like ? "
+" and T_JOB_ODR_CD_STOCK.ITEM_CD like ? ";
	
	/** �݌ɏ��A���b�g�݌� */
	private String _sqlWhereAddNormalAndLot = ""
		+" and T_LOT_STOCK.WH_CD like ? "
		+" and T_LOT_STOCK.ITEM_CD like ? ";

	/** �s�Ǎ݌ɏ��A�i�ڍ݌� */
	private String _sqlWhereAddDefectAndItem = ""
+" and T_ITEM_STOCK.WH_CD like ? "
+" and T_LOT_STOCK.DEFECT_QTY != 0 "
+" and T_LOT_STOCK.ITEM_CD like ? "
+" and T_LOT_STOCK.LOT_NO like ? ";

	/** �s�Ǎ݌ɏ��A�i�ڍ݌� add on*/
	private String _sqlWhereAddDefectAndItem_AddOn = ""
+" and T_ITEM_STOCK.WH_CD like ? "
+" and T_ITEM_STOCK.DEFECT_QTY != 0 "
+" and T_ITEM_STOCK.ITEM_CD like ? ";

	/** �}�C�i�X�݌ɏ��A�i�ڍ݌� */
	private String _sqlWhereAddMinusAndItem = ""
+" and T_ITEM_STOCK.WH_CD like ? "
//+" and (T_ITEM_STOCK.STOCK_ON_HAND_QTY < 0 or T_LOT_STOCK.STOCK_ON_HAND_QTY < 0) "
+" and T_LOT_STOCK.STOCK_ON_HAND_QTY < 0 "
+" and T_LOT_STOCK.ITEM_CD like ? "
+" and T_LOT_STOCK.LOT_NO like ? ";

	/** �}�C�i�X�݌ɏ��A�i�ڍ݌� add on*/
	private String _sqlWhereAddMinusAndItem_AddOn = ""
+" and T_ITEM_STOCK.WH_CD like ? "
+" and T_ITEM_STOCK.STOCK_ON_HAND_QTY < 0 "
+" and T_ITEM_STOCK.ITEM_CD like ? ";

	/** �}�C�i�X�݌ɏ��A���ԍ݌� */
	private String _sqlWhereAddMinusAndJobOdr = ""
+" and T_JOB_ODR_CD_STOCK.WH_CD like ? "
+" and T_JOB_ODR_CD_STOCK.STOCK_ON_HAND_QTY < 0 "
+" and T_JOB_ODR_CD_STOCK.ITEM_CD like ? ";
	
	/** �ϑ��݌ɏ��A�ϑ��݌� */
	private String _sqlWhereAddTransportAndTransport = ""
+" and T_TRANSPORT_STOCK.ISSUE_WH_CD like ? "
+" and T_TRANSPORT_STOCK.ITEM_CD like ? "
+" and NVL(T_TRANSPORT_STOCK.LOT_NO,'%') like ? ";


	////////////////////////////////////////////////////////////////////////////
	// ���я�SQL��`

	/** �i�ڍ݌� */
	private String _sqlOderByItem = "order by "
+" T_ITEM_STOCK.WH_CD "
+",T_ITEM_STOCK.ITEM_CD "
+",T_LOT_STOCK.LOT_NO ";
	
	/** �i�ڍ݌� */
	private String _sqlAllOderByItem = "order by "
	+" A.WH_CD "
	+",A.ITEM_CD "
	+",A.LOT_NO ";


	/** ���ԍ݌� */
	private String _sqlOderByJobOdr = "order by "
+" T_JOB_ODR_CD_STOCK.WH_CD "
+",T_JOB_ODR_CD_STOCK.ITEM_CD "
+",T_JOB_ODR_CD_STOCK.JOB_ODR_CD ";

	/** �ϑ��݌� */
	private String _sqlOderByTransport = "order by "
+" T_TRANSPORT_STOCK.ISSUE_WH_CD "
+",T_TRANSPORT_STOCK.ITEM_CD "
+",T_TRANSPORT_STOCK.JOB_ODR_CD "
+",T_TRANSPORT_STOCK.RCV_PLANT_CD "
+",T_TRANSPORT_STOCK.RCV_WH_CD "
+",T_TRANSPORT_STOCK.LOT_NO ";
	/** �i�ڍ݌� */
	private String _sqlOderByLot = "order by "
		+" T_LOT_STOCK.WH_CD "
		+",T_LOT_STOCK.ITEM_CD ";
}

