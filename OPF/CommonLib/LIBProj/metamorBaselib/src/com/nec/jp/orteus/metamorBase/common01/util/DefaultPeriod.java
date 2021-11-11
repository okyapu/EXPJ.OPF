//------------------------------------------------------------------------------
// (#)DefaultPeriod.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2004/02/24 �V�K�쐬  M.Isoda
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.util;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import com.nec.jp.orteus.metamorBase.common01.util.DateConverter;

/**
 * �f�t�H���g���Y�v����Ԏ擾�N���X
 *
 * @author  M.Isoda
 * @version 1.01
*/
public class DefaultPeriod
{
//--------------------------------------------------------------------------
// �\�z

	/** �R���X�g���N�^ */
	public DefaultPeriod(){}

//------------------------------------------------------------------------------------
// ���ʃ��\�b�h

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
	 * �f�t�H���g���Y�v����Ԏ擾
	 *
	 * @param	conn				DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	strBusinessOprDate	�Ɩ��^�p��
	 * @param	strOutDefDate[]		�f�t�H���g���Y�v����ԓ��t([0]:From [1]:To)
	 * @return	true:���� / false:���s
	 * @throws	SQLException
	 */
	public boolean get(
		IDbConnection conn, 
		String strBusinessOprDate,
		String strOutDefDate[]) throws SQLException
	{
		DateConverter dc = new DateConverter();
		Date dateBusinessOprDate = dc.str2date(strBusinessOprDate);
		return get(conn, dateBusinessOprDate, strOutDefDate);
	}

	/**
	 * �f�t�H���g���Y�v����Ԏ擾
	 *
	 * @param	conn				DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	dateBusinessOprDate	�Ɩ��^�p��
	 * @param	strOutDefDate[]		�f�t�H���g���Y�v����ԓ��t([0]:From [1]:To)
	 * @return	true:���� / false:���s
	 * @throws	SQLException
	 */
	public boolean get(
		IDbConnection conn, 
		Date dateBusinessOprDate,
		String strOutDefDate[]) throws SQLException
	{
		// �����`�F�b�N
		if( (conn == null) || (dateBusinessOprDate == null) )
		{
			return false;
		}

		// FROM,TO�p���Z�����擾
		String strAddMonth4From, strAddMonth4To;
		strAddMonth4From = readSysPrdPlanPeriod4PlanSpan(conn, "1");
		strAddMonth4To = readSysPrdPlanPeriod4PlanSpan(conn, "2");

		// FROM,TO�p���Y�v����ԓ��t�敪�擾
		String strDayTyp4From, strDayTyp4To;
		strDayTyp4From = readSysPrdPlanPeriod4DayTyp(conn, "1");
		strDayTyp4To = readSysPrdPlanPeriod4DayTyp(conn, "2");

		if((strAddMonth4From == null) || (strAddMonth4To == null)
		|| (strDayTyp4From == null) || (strDayTyp4To == null) )
		{
			// �G���[�i���R�[�h�Ȃ��j
			return false;
		}

		// �f�t�H���g���Y�v����ԎZ�o
		Date dateDefFrom, dateDefTo;
		dateDefFrom = calcDefDate(dateBusinessOprDate, strAddMonth4From, strDayTyp4From);	// FROM
		dateDefTo = calcDefDate(dateBusinessOprDate, strAddMonth4To, strDayTyp4To);			// TO
		if( (dateDefFrom == null) || (dateDefTo == null) )
		{
			// �G���[
			return false;
		}
		// �f�t�H���g���Y�v�����(FROM)���Ɩ��^�p�����ߋ��Ȃ� �Ɩ��^�p���ɕ␳
		if(dateDefFrom.getTime() < dateBusinessOprDate.getTime())
		{
			dateDefFrom = dateBusinessOprDate;
		}
		// �f�t�H���g���Y����(TO)���Ɩ��^�p�����ߋ��Ȃ� �Ɩ��^�p���ɕ␳
		if(dateDefTo.getTime() < dateBusinessOprDate.getTime())
		{
			dateDefTo = dateBusinessOprDate;
		}
		// �f�t�H���g���Y�v�����(FROM)���f�t�H���g���Y�v�����(TO)��薢���ɂȂ��Ă��Ȃ����ǂ����̃`�F�b�N
		if(dateDefFrom.getTime() > dateDefTo.getTime())
		{
			return false;
		}

		// ���t������֕ϊ�
		DateConverter dc = new DateConverter();
		strOutDefDate[0] = new String(dc.date2str(dateDefFrom));
		strOutDefDate[1] = new String(dc.date2str(dateDefTo));

		return true;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * �f�t�H���g���Y�v����ԎZ�o����
	 *
	 * @param	dateBusinessOprDate	�Ɩ��^�p��
	 * @param	strAddMonth			���Z����
	 * @param	strDayTyp			���Y�v����t�敪
	 * @return	�f�t�H���g���Y�v����ԓ��t:���� / null:���s
	 */
	private Date calcDefDate(
		Date dateBusinessOprDate,
		String strAddMonth,
		String strDayTyp)
	{
		Calendar cal = new GregorianCalendar();
		cal.setTime(dateBusinessOprDate);
		Date dateDef = cal.getTime();
		cal.add(Calendar.MONTH, Integer.parseInt(strAddMonth));	// �Ɩ��^�p���ɉ��Z���������Z
		dateDef = cal.getTime();
		if("1".equals(strDayTyp) == true)
		{
			// �����֐ݒ肷�鏈��
			cal.set(Calendar.DAY_OF_MONTH , 1);
			dateDef = cal.getTime();
		}
		else if("2".equals(strDayTyp) == true)
		{
			// �����֐ݒ肷�鏈��
			cal.add(Calendar.MONTH, 1);
			cal.set(Calendar.DAY_OF_MONTH, 1);
			cal.add(Calendar.DAY_OF_MONTH, -1);
			dateDef = cal.getTime();
		}
		else
		{
			// ���Y�v����t�敪�ُ�
			dateDef = null;
		}
		return dateDef;
	}

	/**
	 * ���Z�����擾
	 *
	 * @param	conn			DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	strPeriodTyp	���Y�v����ԋ敪
	 * @return	���Z����:���� / null:���s
	 * @throws	SQLException
	 */
	private String readSysPrdPlanPeriod4PlanSpan(
		IDbConnection conn,
		String strPeriodTyp) throws SQLException
	{
		PreparedStatement stmt = null;	// select
		ResultSet rset = null;
		String strPlanSpan = null;
		try
		{
			stmt = conn.getConn().prepareStatement(_sqlSysPrdPlanPeriod4PlanSpan);
			stmt.setString(1, strPeriodTyp);
			rset = stmt.executeQuery();
			if(rset.next() == true)
			{
				strPlanSpan = new String(rset.getString(1));
			}
		}
		finally
		{
			closeResultSet(rset);
			closePreparedStatement(stmt);
		}
		return strPlanSpan;
	}

	/**
	 * ���Y�v����t�敪�擾
	 *
	 * @param	conn			DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	strPeriodTyp	���Y�v����ԋ敪
	 * @return	���Y�v����t�敪:���� / null:���s
	 * @throws	SQLException
	 */
	private String readSysPrdPlanPeriod4DayTyp(
		IDbConnection conn,
		String strPeriodTyp) throws SQLException
	{
		PreparedStatement stmt = null;	// select
		ResultSet rset = null;
		String strDayTyp = null;
		try
		{
			stmt = conn.getConn().prepareStatement(_sqlSysPrdPlanPeriod4DayTyp);
			stmt.setString(1, strPeriodTyp);
			rset = stmt.executeQuery();
			if(rset.next() == true)
			{
				strDayTyp = new String(rset.getString(1));
			}
		}
		finally
		{
			closeResultSet(rset);
			closePreparedStatement(stmt);
		}
		return strDayTyp;
	}

//------------------------------------------------------------------------------------
// SQL��`

	/** ���Z�����Ǎ�SQL */
	private String _sqlSysPrdPlanPeriod4PlanSpan = ""
+"select "
+"  TO_CHAR(SYS_PRD_PLAN_PERIOD.PLAN_SPAN, 'FM9990') as PLAN_SPAN "
+"from "
+"  SYS_PRD_PLAN_PERIOD "
+"where "
+"  SYS_PRD_PLAN_PERIOD.PRD_PLAN_PERIOD_TYP = TO_NUMBER(?) ";


	/** ���Y�v����t�敪�Ǎ�SQL */
	private String _sqlSysPrdPlanPeriod4DayTyp = ""
+"select "
+"  TO_CHAR(SYS_PRD_PLAN_PERIOD.PRD_PLAN_FINAL_DAY_TYP, 'FM90') as PRD_PLAN_FINAL_DAY_TYP "
+"from "
+"  SYS_PRD_PLAN_PERIOD "
+"where "
+"  SYS_PRD_PLAN_PERIOD.PRD_PLAN_PERIOD_TYP = TO_NUMBER(?) ";

}
