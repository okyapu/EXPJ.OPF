//------------------------------------------------------------------------------
// (#)AH0060Common.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.AH0060;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import com.nec.jp.orteus.metamorBase.util.Combo.ComboStruct;
import com.nec.jp.orteus.metamorBase.util.Combo.ComboDataAccessController;
import com.nec.jp.orteus.metamorBase.util.Combo.ComboException;

/**
 * ���I�ꗗ��p�N���X<br>
 *
 * @author  M.Isoda
 * @version 1.00
*/
public class AH0060Common
{
	/** DB�Ƃ̃R�l�N�V���� */
	private IDbConnection _conn = null;

	/** �H��R�[�h�i�[�p */
	private String _strPlantCd = null;

	/** �I�����i�[�p */
	private String _strInvDate = null;

	//--------------------------------------------------------------------------
	// �\�z

	/**
	 * �R���X�g���N�^
	*/
	public AH0060Common(){ clear(); }

	//--------------------------------------------------------------------------
	// ����

	/**
	 * �����ݒ�<br>
	 *<br>
	 * @param	conn		DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	strPlantCd	�H��R�[�h
	 * @return	true:���� / false:���s
	 */
	public boolean init(IDbConnection conn, String strPlantCd)
	{
		// �N���A
		clear();

		// �H��R�[�h�ݒ�
		setPlantCd(strPlantCd);

		// ���������t���O������
		boolean bSuccess = true;
		try
		{
			// �R���{�f�[�^�̎擾
			ComboDataAccessController controller = new ComboDataAccessController(conn);
			_MRP_FLG	 = controller.getData("MRP_FLG");		// ���v�ʌv�Z�Ώۃt���O
			_WH_TYP		 = controller.getData("WH_TYP");		// �q�ɋ敪
			_MRP_ODR_TYP = controller.getData("MRP_ODR_TYP");	// �i�ڎ�z�敪
			_ABC_TYP	 = controller.getData("ABC_TYP");		// �I���敪

		}catch(SQLException e){
			// �G���[�t���O�ݒ�
			bSuccess = false;

		}catch(ComboException e){
			// �G���[�t���O�ݒ�
			bSuccess = false;
		}

		return bSuccess;
	}

	/**
	 * �H��R�[�h�ݒ�<br>
	 *<br>
	 * @param	strPlantCd	�H��R�[�h
	 * @return	�Ȃ�
	 */
	public void setPlantCd(String strPlantCd)
	{
		_strPlantCd = strPlantCd;
	}

	/**
	 * �H��R�[�h�擾<br>
	 *<br>
	 * @return	�H��R�[�h
	 */
	public String getPlantCd()
	{
		return _strPlantCd;
	}

	/**
	 * �R�l�N�V�����ݒ�<br>
	 *<br>
	 * @param	connect	�R�l�N�V����
	 */
	public void setConnection(IDbConnection connect)
	{
		_conn = connect;
	}

	/**
	 * �I�����ݒ�<br>
	 *<br>
	 * @param	strInvDate	�I����
	 */
	public void setINV_DATE(String strInvDate)
	{
		_strInvDate = strInvDate;
	}

	/**
	 * �I�����擾<br>
	 *<br>
	 * @return	�I����
	 */
	public String getINV_DATE()
	{
		return _strInvDate;
	}

	/**
	 * �N���A<br>
	 *<br>
	 * @return	�Ȃ�
	 */
	public void clear()
	{
		_conn = null;
		_strPlantCd = null;
		_strInvDate = null;
	}

	/**
	 * ���I�ꗗ�\���擾<br>
	 *<br>
	 * @param	conn				DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	strInvDate			�I����
	 * @param	intKindStock		�݌Ɏ�ށi�i�ځF0 ���ԁF1�j
	 * @param	intKindSort			���я���ށi�ۊǋ揇�F0 �i�ڏ��F1�j
	 * @param	strItemCd			�i�ڔԍ�
	 * @param	strWhCd				�ۊǋ�R�[�h
	 * @param	strJobOdrCd			����
	 * @param	strDefferenceRate	���ٗ�
	 * @param	strAbcTyp			�I���敪
	 * @return	���ꗗ:���� / null:���s
	 */
	public List getData(
		IDbConnection conn, 
		String strInvDate, 
		int intKindStock, 
		int intKindSort,
		String strItemCd, 
		String strWhCd, 
		String strJobOdrCd,
		String strDefferenceRate,
		String strAbcTyp,
		String strStock_Lot_Cd) throws SQLException
	{
 		// �R�l�N�V�����ݒ�
		setConnection(conn);

 		// �I�������N���X�����o�ɐݒ�
		setINV_DATE(strInvDate);

		// SQL�쐬
		String strSQL = makeSQL(intKindStock, intKindSort);
		if(strSQL == null)
		{
			return null;
		}
		// SQL���s
		List listData = doSQL(	strSQL, 
								intKindStock, 
								strItemCd, 
								strWhCd, 
								strJobOdrCd, 
								strDefferenceRate,
								strAbcTyp,
								strStock_Lot_Cd);
		if(listData == null)
		{
			return null;
		}
		return listData;
	}

	//--------------------------------------------------------------------------
	//--------------------------------------------------------------------------
	//--------------------------------------------------------------------------

	/**
	 * SQL�쐬
	 *
	 * @param	intKindStock	�݌Ɏ�ށi�i�ځF0 ���ԁF1�j
	 * @param	intKindSort		���я���ށi�ۊǋ揇�F0 �i�ڏ��F1�j
	 * @return	SQL������:���� / null:���s
	 */
	private String makeSQL(
		int intKindStock, 
		int intKindSort)
	{
		// SQL������i�[�p�ϐ��錾
		String strSQL = null;

		// ��{SQL�ݒ�
		if(intKindStock == 0)
		{
			// �i�ڍ݌�
			strSQL = _sqlBASE_ITEM;

			// ���я�SQL��ǉ�
			strSQL += "order by ";
			if(intKindSort == 0)
			{
				// �ۊǋ揇
				strSQL += _sqlORDERBY_ITEM_and_WH;
			}
			else
			{
				// �i�ڏ�
				strSQL += _sqlORDERBY_ITEM_and_ITEM;
			}
		}
		else if (intKindStock == 1) {		
			// ���ԍ݌�
			strSQL = _sqlBASE_JOB_ODR_CD;

			// ���я�SQL��ǉ�
			strSQL += "order by ";
			if(intKindSort == 0)
			{
				// �ۊǋ揇
				strSQL += _sqlORDERBY_JOB_ODR_and_WH;
			}
			else
			{
				// �i�ڏ�
				strSQL += _sqlORDERBY_JOB_ODR_and_ITEM;
			}
		}
		else if (intKindStock == 2) {
			//Lot�݌�
			strSQL = _sqlBASE_Lot;

			// ���я�SQL��ǉ�
			strSQL += "order by ";
			if(intKindSort == 0)
			{
				// �ۊǋ揇
				strSQL += _sqlORDERBY_Lot_and_WH;
			}
			else
			{
				// �i�ڏ�
				strSQL += _sqlORDERBY_Lot_and_ITEM;
			}
		}
		return strSQL;
	}

	/**
	 * ���擾SQL���s
	 *
	 * @param	strSQL				���sSQL
	 * @param	intKindStock		�݌Ɏ�ށi�i�ځF0 ���ԁF1�j
	 * @param	strItemCd			�i�ڔԍ�
	 * @param	strWhCd				�ۊǋ�R�[�h
	 * @param	strJobOdrCd			����
	 * @param	strDefferenceRate	���ٗ�
	 * @param	strAbcTyp			�I���敪
	 * @return	���ꗗ:���� / null:���s
	 */
	private List doSQL(
		String strSQL, 
		int intKindStock, 
		String strItemCd, 
		String strWhCd, 
		String strJobOdrCd, 
		String strDefferenceRate,
		String strAbcTyp,
		String strStock_Lot_Cd) throws SQLException
	{
		List listData = new ArrayList(0);
		PreparedStatement stmt = null;
		ResultSet rset = null;
		try {
			stmt = (_conn.getConn()).prepareStatement(strSQL);
			if(intKindStock == 0) {
				// �i�ڍ݌�
				stmt.setString(1, _strInvDate);
				stmt.setString(2, _strPlantCd);
				stmt.setString(3, strItemCd);
				stmt.setString(4, strWhCd);
				stmt.setString(5, strDefferenceRate);
				stmt.setString(6, strAbcTyp);
				rset = stmt.executeQuery();
				listData = getReadInfoList(rset, intKindStock);
			}
			else if(intKindStock == 1) {
				// ���ԍ݌�
				stmt.setString(1, _strInvDate);
				stmt.setString(2, _strPlantCd);
				stmt.setString(3, strItemCd);
				stmt.setString(4, strWhCd);
				stmt.setString(5, strJobOdrCd);
				stmt.setString(6, strDefferenceRate);
				stmt.setString(7, strAbcTyp);
				rset = stmt.executeQuery();
				listData = getReadInfoList(rset, intKindStock);
			}
			else if (intKindStock == 2) {
                // Lot�݌�
                stmt.setString(1, _strInvDate);
                stmt.setString(2, _strPlantCd);
                stmt.setString(3, strItemCd);
                stmt.setString(4, strWhCd);
                stmt.setString(5, strDefferenceRate);
                stmt.setString(6, strAbcTyp);
                stmt.setString(7, strStock_Lot_Cd);
                rset = stmt.executeQuery();
                listData = getReadInfoList(rset, intKindStock);				
			}
		} finally{
			closeResultSet(rset);
			closePreparedStatement(stmt);
		}
		return listData;
	}

	/**
	 * �Ǎ��f�[�^�擾
	 *
	 * @param	rset			�Ώ�ResultSet
	 * @param	intKindStock	�݌Ɏ��
	 * @return	SQL������:���� / null:���s
	 */
	private List getReadInfoList(ResultSet rset, int intKindStock) throws SQLException
	{
		List listData = new ArrayList(0);
		while(rset.next() == true)
		{
			AH0060010Struct info = new AH0060010Struct();
			if(intKindStock == 0) {
				// �i�ڍ݌�
				info.setINV_DATE(rset.getString(1));
				info.setPLANT_CD(rset.getString(2));
				info.setPLANT_NAME(rset.getString(3));
				info.setWH_CD(rset.getString(4));
				info.setWH_NAME(rset.getString(5));
				info.setITEM_CD(rset.getString(6));
				info.setITEM_NAME(rset.getString(7));
				info.setFINAL_BOOK_STOCK_QTY(rset.getString(8));
				info.setACTUAL_STOCK_QTY(rset.getString(9));
				info.setSTOCK_UNIT(rset.getString(10));
				info.setdifference_rate(rset.getString(11));
				info.setSAFETY_STOCK(rset.getString(12));
				info.setMRP_ODR_TYP(rset.getString(13));
				info.setMRP_FLG(rset.getString(14));
				info.setWH_TYP(rset.getString(15));
				info.setVEND_CD(rset.getString(16));
				info.setVEND_ANAME(rset.getString(17));
				info.setABC_TYP(rset.getString(18));
			}
			else if (intKindStock == 1) {
				// ���ԍ݌�
				info.setINV_DATE(rset.getString(1));
				info.setPLANT_CD(rset.getString(2));
				info.setPLANT_NAME(rset.getString(3));
				info.setWH_CD(rset.getString(4));
				info.setWH_NAME(rset.getString(5));
				info.setITEM_CD(rset.getString(6));
				info.setITEM_NAME(rset.getString(7));
				info.setJOB_ODR_CD(rset.getString(8));
				info.setFINAL_BOOK_STOCK_QTY(rset.getString(9));
				info.setACTUAL_STOCK_QTY(rset.getString(10));
				info.setSTOCK_UNIT(rset.getString(11));
				info.setdifference_rate(rset.getString(12));
				info.setSAFETY_STOCK(rset.getString(13));
				info.setMRP_ODR_TYP(rset.getString(14));
				info.setMRP_FLG(rset.getString(15));
				info.setWH_TYP(rset.getString(16));
				info.setVEND_CD(rset.getString(17));
				info.setVEND_ANAME(rset.getString(18));
				info.setABC_TYP(rset.getString(19));
			}
			else if (intKindStock == 2) {
				// Lot�݌�
                info.setINV_DATE(rset.getString(1));
                info.setPLANT_CD(rset.getString(2));
                info.setPLANT_NAME(rset.getString(3));
                info.setWH_CD(rset.getString(4));
                info.setWH_NAME(rset.getString(5));
                info.setITEM_CD(rset.getString(6));
                info.setITEM_NAME(rset.getString(7));
                info.setFINAL_BOOK_STOCK_QTY(rset.getString(8));
                info.setACTUAL_STOCK_QTY(rset.getString(9));
                info.setSTOCK_UNIT(rset.getString(10));
                info.setdifference_rate(rset.getString(11));               
                info.setMRP_ODR_TYP(rset.getString(12));
                info.setMRP_FLG(rset.getString(13));
                info.setWH_TYP(rset.getString(14));
                info.setVEND_CD(rset.getString(15));
                info.setVEND_ANAME(rset.getString(16));
                info.setABC_TYP(rset.getString(17));
                info.setl_STOCK_LOT_CD(rset.getString(18));			
			}
			// �敪�R�[�h����敪���擾�ݒ�
			info.setw_MRP_ODR_TYP(getMRP_ODR_TYP_name(info.getMRP_ODR_TYP()));
			info.setw_MRP_FLG(getMRP_FLG_name(info.getMRP_FLG()));
			info.setw_WH_TYP(getWH_TYP_name(info.getWH_TYP()));
			info.setw_ABC_TYP(getABC_TYP_name(info.getABC_TYP()));

			listData.add(info);
		}
		return listData;
	}

	//------------ �R���{�{�b�N�X�f�[�^--------------------------------------

	/**
	 * �敪���擾�i���ʁj
	 *
	 * @param	comboStruct	�敪��񃊃X�g
	 * @param	strTyp		�敪�R�[�h
	 * @return	�敪����(�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�)
	 */
	private String getTypName(ComboStruct comboStruct, String strTyp)
	{
		String strTypName = strTyp;
		if((comboStruct != null) && (strTyp != null))
		{
			for(int i = 0; i < comboStruct.getValList().size(); i++)
			{
				if(strTyp.equals((String)(comboStruct.getValList().get(i))) == true)
				{
					strTypName = (String)(comboStruct.getExplanList().get(i));
					break;
				}
			}
		}
		return strTypName;
	}

	/** ���v�ʌv�Z�Ώۃt���O */
	private ComboStruct _MRP_FLG = new ComboStruct();

	/**
	 * ���v�ʌv�Z�Ώۃt���O���e�擾
	 *
	 * @param	typ		�敪�R�[�h
	 * @return	�敪����(�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�)
	 */
	private String getMRP_FLG_name(String typ)
	{
		return (getTypName(_MRP_FLG, typ));
	}

	/** �q�ɋ敪 */
	private ComboStruct _WH_TYP = new ComboStruct();

	/**
	 * �q�ɋ敪���擾
	 *
	 * @param	typ		�敪�R�[�h
	 * @return	�敪����(�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�)
	 */
	private String getWH_TYP_name(String typ)
	{
		return (getTypName(_WH_TYP, typ));
	}

	/** �i�ڎ�z�敪 */
	private ComboStruct _MRP_ODR_TYP = new ComboStruct();

	/**
	 * �i�ڎ�z�敪���擾
	 *
	 * @param	typ		�敪�R�[�h
	 * @return	�敪����(�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�)
	 */
	private String getMRP_ODR_TYP_name(String typ)
	{
		return (getTypName(_MRP_ODR_TYP, typ));
	}

	/** �I���敪 */
	private ComboStruct _ABC_TYP = new ComboStruct();

	/**
	 * �I���敪���擾
	 *
	 * @param	typ		�敪�R�[�h
	 * @return	�敪����(�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�)
	 */
	private String getABC_TYP_name(String typ)
	{
		return (getTypName(_ABC_TYP, typ));
	}

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
	// SQL��`

	/** �i�ڍ݌ɗp��{SQL */
	private String _sqlBASE_ITEM = ""
		+"select "
		+" TO_CHAR(T_ITEM_INV.INV_DATE, 'YYYY/MM/DD') as INV_DATE, "
		+" T_ITEM_INV.PLANT_CD as PLANT_CD, "
		+" M_PLANT.PLANT_NAME as PLANT_NAME, "
		+" T_ITEM_INV.WH_CD as WH_CD, "
		+" M_WH.WH_NAME as WH_NAME, "
		+" T_ITEM_INV.ITEM_CD as ITEM_CD, "
		+" M_ITEM.ITEM_NAME as ITEM_NAME, "
		+" TO_CHAR(T_ITEM_INV.FINAL_BOOK_STOCK_QTY,'FM999999999999999990.0999') as FINAL_BOOK_STOCK_QTY, "
		+" TO_CHAR(T_ITEM_INV.ACTUAL_STOCK_QTY,'FM999999999999999990.0999') as ACTUAL_STOCK_QTY, "
		+" M_ITEM.STOCK_UNIT as STOCK_UNIT, "
		+" TO_CHAR(DECODE(FINAL_BOOK_STOCK_QTY,0,DECODE(ACTUAL_STOCK_QTY,0,0,100), TRUNC(((ACTUAL_STOCK_QTY/FINAL_BOOK_STOCK_QTY)-1)*100)),'FM999999999999999990') as DIFFERENCE_RATE, "
		+" TO_CHAR(M_ITEM.SAFETY_STOCK,'FM999999999999999990.0999') as SAFETY_STOCK, "
		+" M_ITEM.MRP_ODR_TYP as MRP_ODR_TYP, "
		+" M_WH.MRP_FLG as MRP_FLG, "
		+" M_WH.WH_TYP as WH_TYP, "
		+" M_WH.VEND_CD as VEND_CD, "
		+" M_VEND_CTRL.VEND_ANAME as VEND_ANAME, "
		+" M_ITEM.ABC_TYP as ABC_TYP "
		+"from "
		+" T_ITEM_INV, "
		+" M_PLANT, "
		+" M_WH, "
		+" M_ITEM, "
		+" M_VEND_CTRL "
		+"where "
		+" T_ITEM_INV.ITEM_CD = M_ITEM.ITEM_CD "
		+" and T_ITEM_INV.PLANT_CD = M_PLANT.PLANT_CD "
		+" and T_ITEM_INV.WH_CD = M_WH.WH_CD "
		+" and M_WH.VEND_CD = M_VEND_CTRL.VEND_CD(+) "
		+" and M_WH.COMPANY_CD = M_VEND_CTRL.COMPANY_CD(+) "
		+" and T_ITEM_INV.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
		+" and T_ITEM_INV.PLANT_CD = ? "
		+" and T_ITEM_INV.ITEM_CD like NVL(?,'%') "
		+" and T_ITEM_INV.WH_CD like NVL(?,'%') "
		+" and DECODE(FINAL_BOOK_STOCK_QTY,0,DECODE(ACTUAL_STOCK_QTY,0,0,100),ABS(TRUNC(((ACTUAL_STOCK_QTY/FINAL_BOOK_STOCK_QTY)-1)*100))) >= ABS(NVL(?,0)) "
		+" and M_ITEM.ABC_TYP like NVL(?,'%') "
		+" and M_ITEM.ABC_TYP <> 9 ";

	/** ���ԍ݌ɗp��{SQL */
	private String _sqlBASE_JOB_ODR_CD = ""
		+"select "
		+" TO_CHAR(T_JOB_ODR_CD_INV.INV_DATE, 'YYYY/MM/DD') as INV_DATE, "
		+" T_JOB_ODR_CD_INV.PLANT_CD as PLANT_CD, "
		+" M_PLANT.PLANT_NAME as PLANT_NAME, "
		+" T_JOB_ODR_CD_INV.WH_CD as WH_CD, "
		+" M_WH.WH_NAME as WH_NAME, "
		+" T_JOB_ODR_CD_INV.ITEM_CD as ITEM_CD, "
		+" M_ITEM.ITEM_NAME as ITEM_NAME, "
		+" T_JOB_ODR_CD_INV.JOB_ODR_CD as JOB_ODR_CD, "
		+" TO_CHAR(T_JOB_ODR_CD_INV.FINAL_BOOK_STOCK_QTY,'FM999999999999999990.0999') as FINAL_BOOK_STOCK_QTY, "
		+" TO_CHAR(T_JOB_ODR_CD_INV.ACTUAL_STOCK_QTY,'FM999999999999999990.0999') as ACTUAL_STOCK_QTY, "
		+" M_ITEM.STOCK_UNIT as STOCK_UNIT, "
		+" TO_CHAR(DECODE(FINAL_BOOK_STOCK_QTY,0,DECODE(ACTUAL_STOCK_QTY,0,0,100), TRUNC(((ACTUAL_STOCK_QTY/FINAL_BOOK_STOCK_QTY)-1)*100)),'FM999999999999999990') as DIFFERENCE_RATE, "
		+" TO_CHAR(M_ITEM.SAFETY_STOCK,'FM999999999999999990.0999') as SAFETY_STOCK, "
		+" M_ITEM.MRP_ODR_TYP as MRP_ODR_TYP, "
		+" M_WH.MRP_FLG as MRP_FLG, "
		+" M_WH.WH_TYP as WH_TYP, "
		+" M_WH.VEND_CD as VEND_CD, "
		+" M_VEND_CTRL.VEND_ANAME as VEND_ANAME, "
		+" M_ITEM.ABC_TYP as ABC_TYP "
		+"from "
		+" T_JOB_ODR_CD_INV, "
		+" M_PLANT, "
		+" M_WH, "
		+" M_ITEM, "
		+" M_VEND_CTRL "
		+"where "
		+" T_JOB_ODR_CD_INV.ITEM_CD = M_ITEM.ITEM_CD "
		+" and T_JOB_ODR_CD_INV.PLANT_CD = M_PLANT.PLANT_CD "
		+" and T_JOB_ODR_CD_INV.WH_CD = M_WH.WH_CD "
		+" and M_WH.VEND_CD = M_VEND_CTRL.VEND_CD(+) "
		+" and M_WH.COMPANY_CD = M_VEND_CTRL.COMPANY_CD(+) "
		+" and T_JOB_ODR_CD_INV.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
		+" and T_JOB_ODR_CD_INV.PLANT_CD = ? "
		+" and T_JOB_ODR_CD_INV.ITEM_CD like NVL(?,'%') "
		+" and T_JOB_ODR_CD_INV.WH_CD like NVL(?,'%') "
		+" and T_JOB_ODR_CD_INV.JOB_ODR_CD like NVL(?,'%') "
		+" and DECODE(FINAL_BOOK_STOCK_QTY,0,DECODE(ACTUAL_STOCK_QTY,0,0,100),ABS(TRUNC(((ACTUAL_STOCK_QTY/FINAL_BOOK_STOCK_QTY)-1)*100))) >= ABS(NVL(?,0)) "
		+" and M_ITEM.ABC_TYP like NVL(?,'%') "
		+" and M_ITEM.ABC_TYP <> 9 ";
	/** Lot�݌ɗp��{SQL */
	private String _sqlBASE_Lot = "" +
		"select " +
		" TO_CHAR(T_LOT_INV.INV_DATE, 'YYYY/MM/DD') as INV_DATE, " +
		" T_LOT_INV.PLANT_CD as PLANT_CD, " +
		" M_PLANT.PLANT_NAME as PLANT_NAME, " +
		" T_LOT_INV.WH_CD as WH_CD, " +
		" M_WH.WH_NAME as WH_NAME, " +
		" T_LOT_INV.ITEM_CD as ITEM_CD, " +
		" M_ITEM.ITEM_NAME as ITEM_NAME, " +
		" TO_CHAR(T_LOT_INV.FINAL_BOOK_STOCK_QTY,'FM999999999999999990.0999') as FINAL_BOOK_STOCK_QTY, " +
		" TO_CHAR(T_LOT_INV.ACTUAL_STOCK_QTY,'FM999999999999999990.0999') as ACTUAL_STOCK_QTY, " +
		" M_ITEM.STOCK_UNIT as STOCK_UNIT, " +
		" TO_CHAR(DECODE(T_LOT_INV.FINAL_BOOK_STOCK_QTY,0,DECODE(T_LOT_INV.ACTUAL_STOCK_QTY,0,0,100), TRUNC(((T_LOT_INV.ACTUAL_STOCK_QTY/T_LOT_INV.FINAL_BOOK_STOCK_QTY)-1)*100)),'FM999999999999999990') as DIFFERENCE_RATE," +
		" M_ITEM.MRP_ODR_TYP as MRP_ODR_TYP, " +
		" M_WH.MRP_FLG as MRP_FLG, " +
		" M_WH.WH_TYP as WH_TYP, " +
		" M_WH.VEND_CD as VEND_CD, " +
		" M_VEND_CTRL.VEND_ANAME as VEND_ANAME, " +
		" M_ITEM.ABC_TYP as ABC_TYP, " +
		" T_LOT_INV.LOT_NO as LOT_NO " +
		"from " +
		" T_LOT_INV, " +
		" M_PLANT, " +
		" M_WH, " +
		" M_ITEM, " +
		" M_VEND_CTRL " +
		"where " +
		" T_LOT_INV.ITEM_CD = M_ITEM.ITEM_CD " +
		" and T_LOT_INV.PLANT_CD = M_PLANT.PLANT_CD " +
		" and T_LOT_INV.WH_CD = M_WH.WH_CD " +
		" and M_WH.VEND_CD = M_VEND_CTRL.VEND_CD(+) " +
		" and M_WH.COMPANY_CD = M_VEND_CTRL.COMPANY_CD(+) " +
		" and T_LOT_INV.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') " +
		" and T_LOT_INV.PLANT_CD = ? " +
		" and T_LOT_INV.ITEM_CD like NVL(?,'%') " +
		" and T_LOT_INV.WH_CD like NVL(?,'%') " +
		" and DECODE(T_LOT_INV.FINAL_BOOK_STOCK_QTY,0,DECODE(T_LOT_INV.ACTUAL_STOCK_QTY,0,0,100),ABS(TRUNC(((T_LOT_INV.ACTUAL_STOCK_QTY/T_LOT_INV.FINAL_BOOK_STOCK_QTY)-1)*100))) >= ABS(NVL(?,0)) " +
		" and M_ITEM.ABC_TYP like NVL(?,'%') " +
        " and T_LOT_INV.LOT_NO like NVL(?,'%') " +
		" and M_ITEM.ABC_TYP <> 9 " ;
	////////////////////////////////////////////////////////////////////////////
	// ���я�SQL��`

	/** �i�ڍ݌ɗp���я�SQL�i�ۊǋ揇�j */
	private String _sqlORDERBY_ITEM_and_WH = ""
		+" T_ITEM_INV.WH_CD, "
		+" T_ITEM_INV.ITEM_CD ";

	/** �i�ڍ݌ɗp���я�SQL�i�i�ڏ��j */
	private String _sqlORDERBY_ITEM_and_ITEM = ""
		+" T_ITEM_INV.ITEM_CD, "
		+" T_ITEM_INV.WH_CD ";

	/** ���ԍ݌ɗp���я�SQL�i�ۊǋ揇�j */
	private String _sqlORDERBY_JOB_ODR_and_WH = ""
		+" T_JOB_ODR_CD_INV.WH_CD, "
		+" T_JOB_ODR_CD_INV.ITEM_CD, "
		+" T_JOB_ODR_CD_INV.JOB_ODR_CD ";

	/** ���ԍ݌ɗp���я�SQL�i�i�ڏ��j */
	private String _sqlORDERBY_JOB_ODR_and_ITEM = ""
		+" T_JOB_ODR_CD_INV.ITEM_CD, "
		+" T_JOB_ODR_CD_INV.JOB_ODR_CD, "
		+" T_JOB_ODR_CD_INV.WH_CD ";
	/** Lot�݌ɗp���я�SQL�i�ۊǋ揇�j */
	private String _sqlORDERBY_Lot_and_WH =""
		+" T_LOT_INV.WH_CD, "
		+" T_LOT_INV.ITEM_CD, "
        +" T_LOT_INV.LOT_NO ";
	
	/** Lot�݌ɗp���я�SQL�i�i�ڏ��j */
	private String _sqlORDERBY_Lot_and_ITEM = ""
		+" T_LOT_INV.ITEM_CD, "
		+" T_LOT_INV.WH_CD, "
        +" T_LOT_INV.LOT_NO ";
}
