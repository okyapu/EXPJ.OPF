//------------------------------------------------------------------------------
// (#)HolidayAccessor.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// History
// 2003/07/08 �V�K�쐬 M.Isoda
// 2003/08/05 version 1.00 ���� M.Isoda
// 2003/08/06 version 1.01 �p�b�P�[�W����ύX M.Isoda
//                         �O�FHolidayList
//                         ��FHolidayAccessor
// 2003/08/08 version 1.02 �p�b�P�[�W���ύX M.Isoda
//                         �O�Fcom.nec.jp.orteus.metamorBase.AB0010
//                         ��Fcom.nec.jp.orteus.metamorBase.common01.Accessor
// 2003/10/23 version 1.03 �J�[�\���N���[�Y�R��C��  K.Shiraki
//
//------------------------------------------------------------------------------

//------------------------------------------------------------------------------
// 2003/08/08 M.Isoda
//------------------------------------------------------------------------------
package com.nec.jp.orteus.expj.util;
//------------------------------------------------------------------------------

import com.nec.jp.orteus.xaf.foundation.IDbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Vector;


/**
 * �x���ꗗ���Ǘ�����N���X�B
 *
 * @author M.Isoda
 * @version 1.00
 */
public class HolidayAccessor
{
	private Vector _vList = new Vector();	// �x���ꗗ
	private Connection _conn = null;		// DB�ڑ�
	private String _planCD = "";			// �H��R�[�h
	private String _itemCD = "";			// �i�ڔԍ�
	private String _dateFrom = "";			// ���tFROM
	private String _dateTo = "";			// ���tTO

	//�x�����t�擾SQL(�����L�[�F�H��R�[�h�j
	private String _selHolidayAccessorSql =
		"select M_CAL.\"CAL_DATE\" as \"CAL_DATE\" "
		+"from M_CAL "
		+"where "
		+"  M_CAL.\"CAL_DATE\" >= to_date(?) "
		+"  and M_CAL.\"CAL_DATE\" <= to_date(?) "
		+"  and M_CAL.\"HOLIDAY_FLG\" = 1 "
		+"  and M_CAL.\"CAL_NO\" = (select M_PLANT.\"CAL_NO\" as \"CAL_NO\" from M_PLANT where M_PLANT.\"PLANT_CD\" = ?) "
		+"order by M_CAL.\"CAL_DATE\" ";
	//�x�����t�擾SQL(�����L�[�F�i�ڃR�[�h�j
	private String _selHolidayAccessorSql_item =
		"select M_CAL.\"CAL_DATE\" as \"CAL_DATE\" "
		+"from M_CAL "
		+"where "
		+"  M_CAL.\"CAL_DATE\" >= to_date(?) "
		+"  and M_CAL.\"CAL_DATE\" <= to_date(?) "
		+"  and M_CAL.\"HOLIDAY_FLG\" = 1 "
		+"  and M_CAL.\"CAL_NO\" = (select M_ITEM.\"CAL_NO\" as \"CAL_NO\" from M_ITEM where M_ITEM.\"ITEM_CD\" = ?) "
		+"order by M_CAL.\"CAL_DATE\" ";
	/**
	 * �x���ꗗ�N���X������
	 * @param DB�ڑ�
	 * @param String �H��R�[�h
	 * @param String ���tFROM yyyy/mm/dd
	 * @param String ���tTO yyyy/mm/dd
	 */
	public void init(Connection conn, String plantCD, String dateFrom, String dateTo) throws SQLException
	{
		PreparedStatement stmt = null;
		ResultSet rslt = null;
		_conn = conn;
		_planCD = plantCD;
		_dateFrom = dateFrom;
		_dateTo = dateTo;
		_vList.clear();
		try {
			stmt = _conn.prepareStatement(_selHolidayAccessorSql);
			stmt.setString(1, _dateFrom);
			stmt.setString(2, _dateTo);
			stmt.setString(3, _planCD);
			rslt = stmt.executeQuery();
			while(rslt.next() == true) {
				_vList.add(rslt.getString(1));
			}
		}
		finally {
			closePreparedStatement(stmt);
			closeResultSet(rslt);
		}
	}
	public void init(Connection conn, String itemCD, String dateFrom, String dateTo,int fg) throws SQLException
	{
		PreparedStatement stmt = null;
		ResultSet rslt = null;
		_conn = conn;
		_itemCD = itemCD;
		_dateFrom = dateFrom;
		_dateTo = dateTo;
		_vList.clear();
		try {
			stmt = _conn.prepareStatement(_selHolidayAccessorSql_item);
			stmt.setString(1, _dateFrom);
			stmt.setString(2, _dateTo);
			stmt.setString(3, _itemCD);
			rslt = stmt.executeQuery();
			while(rslt.next() == true) {
				_vList.add(rslt.getString(1));
			}
		}
		finally {
			closePreparedStatement(stmt);
			closeResultSet(rslt);
		}
	}
	/**
	 * �x������
	 * @param String ���t yyyy/mm/dd
	 * @return �x���̔���(true:�x��, false:�x���ȊO)
	 */
	public boolean isHoliday(String targetDate) {
		Date date = stringToDate(targetDate);

		return isHoliday(date);
	}

	/**
	 * �x������
	 * @param Date ���t yyyy/mm/dd
	 * @return �x���̔���(true:�x��, false:�x���ȊO)
	 */
	public boolean isHoliday(Date targetDate) {
		boolean bFound = false;
		Date dateFrom = stringToDate(_dateFrom);
		Date dateTo = stringToDate(_dateTo);
		Date dateWork;

		// date�����ԊO�Ȃ�x���ŕԂ�
		if(targetDate.getTime() < dateFrom.getTime() || targetDate.getTime() > dateTo.getTime()) {
			return true;
		}

		// date�ƈ�v����x��������
		for(int i = 0; i < _vList.size(); i++) {
			dateWork = stringToDate((String)_vList.get(i));
			if(targetDate.getTime() == dateWork.getTime()) {
				bFound = true;
				break;
			}
		}

		return bFound;
	}

	/** ���t�t�H�[�}�b�g */
	private SimpleDateFormat _dateFormat = new SimpleDateFormat("yyyy/MM/dd");

	/**
	 * Date�^ �� String�^�B
	 * @return String YYYY/MM/DD�`��
	 */
	public String dateToString(Date date)
	{
		return _dateFormat.format(date);
	}

	/**
	 * String�^ �� Date�^�B
	 * @return Date 
	 */
	public Date stringToDate(String date)
	{
		try{
			return _dateFormat.parse(date);

		}catch(ParseException ex){}

		return null;
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

}
