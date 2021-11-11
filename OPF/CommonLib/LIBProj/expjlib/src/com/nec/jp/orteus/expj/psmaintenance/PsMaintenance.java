/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/psmaintenance/PsMaintenance.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 * 2004/02/09 �V�K�쐬 S.Ishiguro
 *
 */

package com.nec.jp.orteus.expj.psmaintenance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.nec.jp.orteus.util.DisplayMessageUtil;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.util.FoundationException;
import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.expj.exception.ExpjBadException;
import com.nec.jp.orteus.expj.exception.NoDataException;
import com.nec.jp.orteus.expj.exception.PsLoopException;
import com.nec.jp.orteus.expj.exception.PsEffPhaseException;
import com.nec.jp.orteus.expj.exception.PsMrpOdrTypException;
// 2008/07/15 SYSCOM ���� ADD START
import com.nec.jp.orteus.expj.exception.PsManhourTypException;
// 2008/07/15 SYSCOM ���� ADD END

/**
 * ���i�\���������e�i���X���邽�߂̃��[�e�B���e�B�N���X
 *
 * @author $Author: chenjunhua268 $
 * @version $Revision: 1.5 $ $Date: 2014/06/17 02:10:24 $
 */
public class PsMaintenance
{
	/**
	  * [�i��].�i�ڎ�z�敪�R�[�h
	  */
	private final static int MRP_ODR_TYP_ORDER_CD = 1;		// ����
	private final static int MRP_ODR_TYP_STOCK_ALLOC = 2;	// �݌Ɉ����^����
	private final static int MRP_ODR_TYP_MANUAL = 4;		// �}�j���A����z�i��
	private final static int MRP_ODR_TYP_LOT_QTY = 5;		// ���b�g��z�i��
	private final static int MRP_ODR_TYP_FIXED_QTY = 6;		// ��ʎ�z�i��
	private final static int MRP_ODR_TYP_ORDER_POINT = 7;	// �����_��z�i��
	private final static int MRP_ODR_TYP_PSEUDO_ITEM = 8;	// �[���i��
	
	/**
	  * [���i�\��].�������@�R�[�h
	  */
	private final static int ACCESS_TYP_ADD = 1;		// �ǉ�
	private final static int ACCESS_TYP_DELETE = 2;		// �폜

	/**
	  * [���i�\��].�����t���O
	  */
	private final static int CMPLT_FLG_FALSE = 0;		// ������
	private final static int CMPLT_FLG_TRUE = 1;		// ����

// 2008/07/15 SYSCOM ���� ADD START
	/**
	  * [�i��].�H���Ǘ��i�ڋ敪
	  */
	private final static int MANHOUR_TYP_NORMAL = 0;	// �ʏ�i��
	private final static int MANHOUR_TYP_CTRL = 1;		// �H���Ǘ��i��
// 2008/07/15 SYSCOM ���� ADD END
	
	// Add Start 20140311 wanghp
	/**
	 * �u���̌����i0���̏ꍇ�A�G���[�o�́j
	 */
	private int ReplaceCount = 0;
	// Add End 20140311 wanghp

	/**
	  * SQL��` �q���i�\���擾�p
	  */
	private final String _sqlGetCompPs =
		  "SELECT "
		+ "COMP_ITEM_CD, "
		+ "PS_EDITION, "
		+ "TO_CHAR(EFF_PHASE_IN_DATE, 'YYYY/MM/DD'), "
		+ "TO_CHAR(EFF_PHASE_OUT_DATE, 'YYYY/MM/DD'), "
		+ "TO_CHAR(MODIFY_COUNT) "
		+ "FROM M_PS "
		+ "WHERE PARENT_ITEM_CD = ? "
		+ "ORDER BY PS_REF_NO, COMP_ITEM_CD ";

	/**
	  * SQL��` �q���i�\���擾�p(���t�w��)
	  */
	private final String _sqlGetCompPsByDate =
		  "SELECT "
		+ "COMP_ITEM_CD, "
		+ "PS_EDITION, "
		+ "TO_CHAR(EFF_PHASE_IN_DATE, 'YYYY/MM/DD'), "
		+ "TO_CHAR(EFF_PHASE_OUT_DATE, 'YYYY/MM/DD'), "
		+ "TO_CHAR(MODIFY_COUNT) "
		+ "FROM M_PS "
		+ "WHERE PARENT_ITEM_CD = ? "
		+ "AND TO_CHAR(EFF_PHASE_IN_DATE, 'YYYY/MM/DD') <= ? "
		+ "AND TO_CHAR(EFF_PHASE_OUT_DATE, 'YYYY/MM/DD') >= ? "
		+ "ORDER BY PS_REF_NO, COMP_ITEM_CD ";

	/**
	  * SQL��` �e���i�\���擾�p
	  */
	private final String _sqlGetParentPs =
		  "SELECT "
		+ "PARENT_ITEM_CD, "
		+ "PS_EDITION, "
		+ "TO_CHAR(EFF_PHASE_IN_DATE, 'YYYY/MM/DD'), "
		+ "TO_CHAR(EFF_PHASE_OUT_DATE, 'YYYY/MM/DD'), "
		+ "TO_CHAR(MODIFY_COUNT) "
		+ "FROM M_PS "
		+ "WHERE COMP_ITEM_CD = ? "
		+ "ORDER BY PS_REF_NO, PARENT_ITEM_CD ";

	/**
	  * SQL��` �e���i�\���擾�p(���t�w��)
	  */
	private final String _sqlGetParentPsByDate =
		  "SELECT "
		+ "PARENT_ITEM_CD, "
		+ "PS_EDITION, "
		+ "TO_CHAR(EFF_PHASE_IN_DATE, 'YYYY/MM/DD'), "
		+ "TO_CHAR(EFF_PHASE_OUT_DATE, 'YYYY/MM/DD'), "
		+ "TO_CHAR(MODIFY_COUNT) "
		+ "FROM M_PS "
		+ "WHERE COMP_ITEM_CD = ? "
		+ "AND TO_CHAR(EFF_PHASE_IN_DATE, 'YYYY/MM/DD') <= ? "
		+ "AND TO_CHAR(EFF_PHASE_OUT_DATE, 'YYYY/MM/DD') >= ? "
		+ "ORDER BY PS_REF_NO, PARENT_ITEM_CD ";

	/**
	  * SQL��` ���i�\���ǉ��p
	  */
	private final String _sqlAddM_PS =
		  "INSERT INTO M_PS ("
		+ "PARENT_ITEM_CD, "
		+ "COMP_ITEM_CD, "
		+ "PS_EDITION, "
		+ "PS_UNIT_DENOMINATOR, "
		+ "PS_UNIT_NUMERATOR, "
		+ "EFF_PHASE_IN_DATE, "
		+ "EFF_PHASE_OUT_DATE, "
		+ "PS_SPOIL, "
		+ "CONS_TYP, "
		+ "PS_LT_FLG, "
		+ "PS_FIXED_LT, "
		+ "PS_PROP_LT, "
		+ "PS_PROP_LOT_SIZE, "
		+ "PS_REF_NO, "
		+ "COST_UP_TYP, "
		+ "MRP_EXP_TYP) "
		+ "VALUES( ?, ?, ?, TO_NUMBER(?), TO_NUMBER(?), "
		+ "TO_DATE(?, 'YYYY/MM/DD'), TO_DATE(?, 'YYYY/MM/DD'), "
		+ "TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), "
		+ "TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), "
		+ "TO_NUMBER(?)) ";

	// Add Start 20140310 wanghp
	/**
	 * SQL��` ���i�\���C���p�i�u����i�ڂ��q�\������j
	 */
	private final String _sqlHasCompModifyM_PS = 
		  "UPDATE M_PS SET "
		+ "EFF_PHASE_IN_DATE = TO_DATE(?, 'YYYY/MM/DD'), "
		+ "EFF_PHASE_OUT_DATE = TO_DATE(?, 'YYYY/MM/DD')"
		+ "WHERE PARENT_ITEM_CD = ? "
		+ "AND COMP_ITEM_CD = ? "
		+ "AND PS_EDITION = ? ";
	// Add End 20140310 wanghp
	
	/**
	  * SQL��` ���i�\���C���p
	  */
	private final String _sqlModifyM_PS =
		  "UPDATE M_PS SET "
		+ "PS_UNIT_DENOMINATOR = TO_NUMBER(?), "
		+ "PS_UNIT_NUMERATOR = TO_NUMBER(?), "
		+ "EFF_PHASE_IN_DATE = TO_DATE(?, 'YYYY/MM/DD'), "
		+ "EFF_PHASE_OUT_DATE = TO_DATE(?, 'YYYY/MM/DD'), "
		+ "PS_SPOIL = TO_NUMBER(?), "
		+ "CONS_TYP = TO_NUMBER(?), "
		+ "PS_LT_FLG = TO_NUMBER(?), "
		+ "PS_FIXED_LT = TO_NUMBER(?), "
		+ "PS_PROP_LT = TO_NUMBER(?), "
		+ "PS_PROP_LOT_SIZE = TO_NUMBER(?), "
		+ "PS_REF_NO = TO_NUMBER(?), "
		+ "COST_UP_TYP = TO_NUMBER(?), "
		+ "MRP_EXP_TYP = TO_NUMBER(?) "
		+ "WHERE PARENT_ITEM_CD = ? "
		+ "AND COMP_ITEM_CD = ? "
		+ "AND PS_EDITION = ? ";

	/**
	  * SQL��` ���i�\���폜�p
	  */
	private final String _sqlDeleteM_PS =
		  "DELETE FROM M_PS "
		+ "WHERE PARENT_ITEM_CD = ? "
		+ "AND COMP_ITEM_CD = ? "
		+ "AND PS_EDITION = ? ";

	/**
	  * SQL��` ���i�\���X�V���擾�p
	  */
	private final String _sqlGetModifyCount =
		  "SELECT "
		+ "TO_CHAR(MODIFY_COUNT) "
		+ "FROM M_PS "
		+ "WHERE PARENT_ITEM_CD = ? "
		+ "AND COMP_ITEM_CD = ? "
		+ "AND PS_EDITION = ? "
		+ "FOR UPDATE ";

	/**
	  * SQL��` �ő�SYS�V�[�P���V�����ԍ��擾�p
	  */
	private final String _sqlGetMaxSeqNo =
		  "SELECT MAX(SEQ_NO) "
		+ "FROM SYS_PS_T ";

	/**
	  * SQL��` ���i�\���g�����U�N�V�����ǉ��p
	  */
	private final String _sqlAddSYS_PS_T =
		  "INSERT INTO SYS_PS_T ("
		+ "SEQ_NO, "
		+ "PARENT_ITEM_CD, "
		+ "COMP_ITEM_CD, "
		+ "PS_EDITION, "
		+ "ACCESS_TYP, "
		+ "CMPLT_FLG) "
		+ "VALUES( ?, ?, ?, ?, ?, ? ) ";

	/**
	  * SQL��` ���i�\�������f�[�^�擾�p
	  */
	private final String _sqlGetPsAttribute =
		  "SELECT "
		+ "TO_CHAR(PS_UNIT_DENOMINATOR, 'FM99999999999990.0999'), "
		+ "TO_CHAR(PS_UNIT_NUMERATOR, 'FM99999999999990.0999'), "
		+ "TO_CHAR(EFF_PHASE_IN_DATE, 'YYYY/MM/DD'), "
		+ "TO_CHAR(EFF_PHASE_OUT_DATE, 'YYYY/MM/DD'), "
		+ "TO_CHAR(PS_SPOIL, 'FM99990.0999'), "
		+ "CONS_TYP, "
		+ "PS_LT_FLG, "
		+ "TO_CHAR(PS_FIXED_LT), "
		+ "TO_CHAR(PS_PROP_LT), "
		+ "TO_CHAR(PS_PROP_LOT_SIZE, 'FM99999999999990.0999'), "
		+ "TO_CHAR(PS_REF_NO), "
		+ "COST_UP_TYP, "
		+ "MRP_EXP_TYP, "
		+ "MODIFY_COUNT "
		+ "FROM M_PS "
		+ "WHERE PARENT_ITEM_CD = ? "
		+ "AND COMP_ITEM_CD = ? "
		+ "AND PS_EDITION = ? ";

	/**
	  * SQL��` �e�i�ڔԍ����݊m�F�p
	  */
	private final String _sqlHasParentItem =
		  "SELECT PARENT_ITEM_CD "
		+ "FROM M_PS "
		+ "WHERE COMP_ITEM_CD = ? ";

	/**
	  * SQL��` �q�i�ڔԍ����݊m�F�p
	  */
	private final String _sqlHasCompItem =
		  "SELECT COMP_ITEM_CD "
		+ "FROM M_PS "
		+ "WHERE PARENT_ITEM_CD = ? ";

	/**
	  * SQL��` ���i�\���L�����Ԉꗗ�擾�p
	  */
	private final String _sqlGetEffPhaseList =
		  "SELECT "
		+ "TO_CHAR(EFF_PHASE_IN_DATE, 'YYYYMMDD'), "
		+ "TO_CHAR(EFF_PHASE_OUT_DATE, 'YYYYMMDD') "
		+ "FROM M_PS "
		+ "WHERE PARENT_ITEM_CD = ? "
		+ "AND COMP_ITEM_CD = ? ";

	/**
	  * SQL��` ���i�\���L�����Ԉꗗ�擾�p�i�w�萻�i�\���Ő������O�j
	  */
	private final String _sqlGetEffPhaseListWoPse =
		  "SELECT TRUNC(EFF_PHASE_IN_DATE), TRUNC(EFF_PHASE_OUT_DATE) "
		+ "FROM M_PS "
		+ "WHERE PARENT_ITEM_CD = ? "
		+ "AND COMP_ITEM_CD = ? "
		+ "AND PS_EDITION != ? ";

	/**
	  * SQL��` �i�ڎ�z�敪�擾�p
	  */
	private final String _sqlGetMrpOrderType =
		  "SELECT MRP_ODR_TYP "
		+ "FROM M_ITEM "
		+ "WHERE ITEM_CD = ? ";

// 2008/07/15 SYSCOM ���� ADD START
	/**
	  * SQL��` �H���Ǘ��i�ڋ敪�擾�p
	  */
	private final String _sqlGetManhourTyp =
		  "SELECT MANHOUR_TYP "
		+ "FROM M_ITEM "
		+ "WHERE ITEM_CD = ? ";
// 2008/07/15 SYSCOM ���� ADD END

	/**
	  * ���t�w����s���ꍇ�̗L���t�H�[�}�b�g
	  */
	private final String _dateFormat = "yyyyMMdd";

	/**
	  * �R�l�N�V�����I�u�W�F�N�g
	  */
	private Connection _connection = null;

	/**
	  * ���[�U�R�[�h
	  */
	private String _userCode = null;

	/**
	  * �v���O������
	  */
	private String _programName = null;

	/**
	  * �V�X�e������
	  */
	private String _sysdate = null;

	/**
	  * ���t�^�̕�����^�ϊ��p�I�u�W�F�N�g
	  */
	private DisplayMessageUtil _objMessage = new DisplayMessageUtil();

	/**
	  * SQL��O�������̃G���[���b�Z�[�W���ۑ��p�I�u�W�F�N�g
	  */
	private ExpjMessage _errorInfo = null;

	/**
	 * ���i�\�����擾���܂��i���t�w��Ȃ��j
	 *
	 * @param  itemCd ��i�ڔԍ�
	 * @param  sql ���i�\���擾�p��SQL��
	 * @return �i�ڔԍ��̈ꗗ
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 */
	private List getPsList(String itemCd, String sql)
			throws SQLException
	{
		PreparedStatement stmt = null;
		try {
			// ���i�\�����擾
			stmt = _connection.prepareStatement(sql);
			stmt.setString(1, itemCd);
			return getPsListSub(stmt);
		} catch (SQLException se) {
			_errorInfo = new ExpjMessage("ZZ01006", "M_PS.PARENT_ITEM_CD:" + itemCd);
			throw se;
		} finally {
			closePreparedStatement(stmt);
		}
	}

	/**
	 * ���i�\�����擾���܂��i���t�w�肠��j
	 *
	 * @param  itemCd ��i�ڔԍ�
	 * @param  targetDate �w����t
	 * @param  sql ���i�\���擾�p��SQL��
	 * @return �i�ڔԍ��̈ꗗ
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 * @throws ParseException ���t�̌`���ϊ��Ɏ��s
	 */
	private List getPsListByDate(String itemCd, String targetDate, String sql)
			throws SQLException, ParseException
	{
		PreparedStatement stmt = null;
		try {
			SimpleDateFormat formatYyyyMmDd = new SimpleDateFormat("yyyy/MM/dd");
			// �u�����t�𐳋K���i"YYYY/MM/DD"�j
			Date dateTargetDate = formatYyyyMmDd.parse(targetDate);
			String targetDateYyyyMmDd = formatYyyyMmDd.format(dateTargetDate);
			// ���i�\�����擾�i���t�w�肠��j
			stmt = _connection.prepareStatement(sql);
			stmt.setString(1, itemCd);
			stmt.setString(2, targetDateYyyyMmDd);
			stmt.setString(3, targetDateYyyyMmDd);
			return getPsListSub(stmt);
		} catch (SQLException se) {
			_errorInfo = new ExpjMessage("ZZ01006", "M_PS.PARENT_ITEM_CD:" + itemCd);
			throw se;
		} catch (ParseException pe) {
			_errorInfo = new ExpjMessage("ZZ01006", targetDate);
			throw pe;
		} finally {
			closePreparedStatement(stmt);
		}
	}

	/**
	 * ���i�\���̎擾��SQL�𔭍s���A���i�\���̈ꗗ���擾���܂�
	 *
	 * @param  stmt SQL�\�z�ς݂�PreparedStatement
	 * @return ���i�\���̈ꗗ
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 */
	private List getPsListSub(PreparedStatement stmt)
			throws SQLException
	{
		ResultSet result = null;
		try {
			List list = new ArrayList(0);
			// SQL���s
			result = stmt.executeQuery();
			// ���i�\�����擾
			while (result.next()) {
				String[] data = new String[5];
				data[0] = result.getString(1);	// �q�i�ڔԍ�/�e�i�ڔԍ�
				data[1] = result.getString(2);	// ���i�\���Ő�
				data[2] = result.getString(3);	// ���i�\���L���J�n��
				data[3] = result.getString(4);	// ���i�\���L���I����
				data[4] = result.getString(5);	// �X�V��
				list.add(data);
			}
			return list;
		} finally {
			closeResultSet(result);
		}
	}

	/**
	 * ���i�\���̍X�V���𒲂ׂ܂�
	 *
	 * @param  parentItemCd �e�i�ڔԍ�
	 * @param  compItemCd �q�i�ڔԍ�
	 * @param  psEdition ���i�\���Ő�
	 * @param  modifyCount �X�V
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 * @throws ExpjBadException �X�V���s��v
	 * @throws NoDataException �Ώۃf�[�^�Ȃ�
	 */
	private void testModifyCount(
			String parentItemCd, String compItemCd, String psEdition, String modifyCount)
			throws SQLException, ExpjBadException, NoDataException
	{
		PreparedStatement stmt = null;
		ResultSet result = null;
		try {
			String nowModifyCount = "0";
			// ���i�\���̍X�V�����擾
			stmt = _connection.prepareStatement(_sqlGetModifyCount);
			stmt.setString(1, parentItemCd);	// �e�i�ڔԍ�
			stmt.setString(2, compItemCd);		// �q�i�ڔԍ�
			stmt.setString(3, psEdition);		// ���i�\���Ő�
			result = stmt.executeQuery();
			if (result.next() == false) {
				// �Ώۃf�[�^�����݂��܂���B
				_errorInfo = new ExpjMessage("ZZ01006",
						"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD,PS_EDITION:"
						+ parentItemCd + "," + compItemCd + "," + psEdition);
				throw new NoDataException();
			}
			nowModifyCount = result.getString(1);	// [���i�\��]."�X�V��"
			if (nowModifyCount.equals(modifyCount) == false) {
				// ���̏����ɂ���ăf�[�^�������������Ă��܂��B�Ď��s���Ă��������B
				throw new ExpjBadException(new ExpjMessage("ZZ01105",
						"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD,PS_EDITION:"
						+ parentItemCd + "," + compItemCd + "," + psEdition));
			}
		} catch (SQLException se) {
			_errorInfo = new ExpjMessage("ZZ01006",
					"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD,PS_EDITION:"
					+ parentItemCd + "," + compItemCd + "," + psEdition);
			throw se;
		} finally {
			closePreparedStatement(stmt);
			closeResultSet(result);
		}
	}

	/**
	 * ���i�\���̒ǉ��A�폜���L�^���܂�
	 *
	 * @param  parentItemCd �e�i�ڔԍ�
	 * @param  compItemCd �q�i�ڔԍ�
	 * @param  psEdition ���i�\���Ő�
	 * @param  accsessType �������@
	 * @param  completeFlag �����t���O
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 * @throws FoundationException �������o�^�pSQL���̐����Ɏ��s
	 */
	private void addSYS_PS_T(String parentItemCd, String compItemCd, String psEdition,
			int accessType, int completeFlag)
			throws SQLException, FoundationException
	{
		PreparedStatement stmt = null;
		ResultSet result = null;
		int maxSeqNo = 0;
		try {
			// ���i�\���g�����U�N�V�����̍ő�V�[�P���X�ԍ����擾
			stmt = _connection.prepareStatement(_sqlGetMaxSeqNo);
			result = stmt.executeQuery();
			if (result.next() == true) {
				maxSeqNo = result.getInt(1);
			}
		} finally {
			closePreparedStatement(stmt);
			closeResultSet(result);
		}
		try {
			// ���i�\���̒ǉ��A�폜�𐻕i�\���g�����U�N�V�����ɋL�^
			if ("Oracle".equals(_connection.getMetaData().getDatabaseProductName()) == true) {
				stmt = _connection.prepareStatement(
						_objMessage.replaceSQL_I(_sqlAddSYS_PS_T));
			} else if ("Microsoft SQL Server".equals(
					_connection.getMetaData().getDatabaseProductName()) == true)
			{
				stmt = _connection.prepareStatement(
						_objMessage.replaceSQL_I_MSSQL(_sqlAddSYS_PS_T));
			} else {
				stmt = _connection.prepareStatement(
						_objMessage.replaceSQL_I_DB2(_sqlAddSYS_PS_T));
			}
			stmt.setString(1, _sysdate);		// �쐬����
			stmt.setString(2, _userCode);		// �쐬��
			stmt.setString(3, _programName);	// �쐬�v���O������
			stmt.setString(4, _sysdate);		// �X�V����
			stmt.setString(5, _userCode);		// �X�V��
			stmt.setString(6, _programName);	// �X�V�v���O������
			stmt.setInt(7, maxSeqNo + 1);		// �V�K�̃V�[�P���X�ԍ�
			stmt.setString(8, parentItemCd);	// �e�i�ڔԍ�
			stmt.setString(9, compItemCd);		// �q�i�ڔԍ�
			stmt.setString(10, psEdition);		// ���i�\���Ő�
			stmt.setInt(11, accessType);		// �����敪
			stmt.setInt(12, completeFlag);		// �����t���O
			stmt.executeUpdate();
		} catch (SQLException se) {
			_errorInfo = new ExpjMessage("ZZ01006",
					"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD,PS_EDITION:"
					+ parentItemCd + "," + compItemCd + "," + psEdition);
			throw se;
		} finally {
			closePreparedStatement(stmt);
		}
	}

	/**
	 * �e���i�\���������Ă��邩���ׂ܂�
	 *
	 * @param  compItemCd �q�i�ڔԍ�
	 * @return true:�����Ă���^false:�����Ă��Ȃ�
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 */
	private boolean hasParentPs(String compItemCd)
			throws SQLException
	{
		PreparedStatement stmt = null;
		ResultSet result = null;
		try {
			// �e���i�\���̑��݂�����
			stmt = _connection.prepareStatement(_sqlHasParentItem);
			stmt.setString(1, compItemCd);
			result = stmt.executeQuery();
			// �e���i�\�����F true:���݂���^false:���݂��Ȃ�
			return result.next();
		} catch (SQLException se) {
			_errorInfo = new ExpjMessage("ZZ01006", "M_PS.COMP_ITEM_CD:" + compItemCd);
			throw se;
		} finally {
			closePreparedStatement(stmt);
			closeResultSet(result);
		}
	}

	/**
	 * �q���i�\���̑��݂𒲂ׂ܂�
	 *
	 * @param  parentItemCd �e�i�ڔԍ�
	 * @return true:���݂���^false:���݂��Ȃ�
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 */
	private boolean hasCompPs(String parentItemCd)
			throws SQLException
	{
		PreparedStatement stmt = null;
		ResultSet result = null;
		try {
			// �q���i�\���̑��݂�����
			stmt = _connection.prepareStatement(_sqlHasCompItem);
			stmt.setString(1, parentItemCd);
			result = stmt.executeQuery();
			// �q���i�\�����F true:���݂���^false:���݂��Ȃ�
			return result.next();
		} catch (SQLException se) {
			_errorInfo = new ExpjMessage("ZZ01006", "M_PS.PARENT_ITEM_CD:" + parentItemCd);
			throw se;
		} finally {
			closePreparedStatement(stmt);
			closeResultSet(result);
		}
	}
	
	// Add Start 20140310 wanghp
	/**
	 * �u����i�ڂ��q�\������̏ꍇ�A�u�����q�\���ƒu����q�\���̒u��
	 * @param fromItemCd�@�u�����i��
	 * @param toItemCd�@�u����i��
	 * @param replaceDate�@�u����
	 * @return true:���[�j���O����@false:���[�j���O�Ȃ�
	 * @throws ParseException ���t�̌`���ϊ��Ɏ��s
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 * @throws ExpjBadException �X�V���s��v
	 * @throws FoundationException �e�[�u���X�V�pSQL���̐����Ɏ��s
	 */
	private boolean replaceHasCompPs(String fromItemCd, String toItemCd, String replaceDate) 
			throws ParseException, SQLException, FoundationException, ExpjBadException{
		// �u����̕i�ڍ\���ɁA�L�����Ԕ͈͈ȊO�̉��ʕi�ڂ̑��݃t���O
		boolean hasWarning = false;
		
		try {
			SimpleDateFormat formatYyyyMmDd = new SimpleDateFormat("yyyy/MM/dd");
			// �u�����t�𐳋K���i"YYYY/MM/DD"�j
			Date dateReplaceDate;
			dateReplaceDate = formatYyyyMmDd.parse(replaceDate);
			replaceDate = formatYyyyMmDd.format(dateReplaceDate);
			
			// �u�����i�ڂ̎q�\�����擾
			List fromCompPsList = getCompPsList(fromItemCd);
			String[] fromCompPs = new String[5];
			for(int i = 0; i < fromCompPsList.size(); i++){
				fromCompPs = (String[])fromCompPsList.get(i);
				List fromAttribute = getPsAttribute(fromItemCd, fromCompPs[0], fromCompPs[1]);
				
				String fromInDate = (String)fromAttribute.get(2);	// ���i�\���L���J�n��
				Date dateFromInDate = formatYyyyMmDd.parse(fromInDate);
				String fromOutDate = (String)fromAttribute.get(3);	// ���i�\���L���I����
				Date dateFromOutDate = formatYyyyMmDd.parse(fromOutDate);
				if (dateFromOutDate.compareTo(dateReplaceDate) < 0) {
					// �u�����t�@���@���i�\���L���I�����̏ꍇ
					// �������Ȃ�
					continue;
				}
				if (dateFromInDate.compareTo(dateReplaceDate) >= 0) {
					// �u�����t�@���@���i�\���L���J�n���ꍇ
					// �u�������i�\�����폜
					deleteM_PS(fromItemCd, fromCompPs[0], fromCompPs[1], (String)fromAttribute.get(13));
					// �u�������̃J�E���g�A�b�v
					++ReplaceCount;
				} else {
					// ���i�\���L���J�n���@���@�u�u�����t�v�@���@���i�\���L���I����
					// �u�������i�\�����C���i���i�\���L���I������u�����t�̑O���ɏC���j
					String newFromOutDate = formatYyyyMmDd.format(
							new Date(dateReplaceDate.getTime() - 60 * 60 * 24));
					modifyM_PS(fromItemCd, fromCompPs[0], fromCompPs[1], 
							fromInDate, newFromOutDate, (String)fromAttribute.get(13));
					// �u�������̃J�E���g�A�b�v
					++ReplaceCount;
				}
			}
			
			// �u����i�ڂ̎q�\�����擾
			List toCompPsList = getCompPsList(toItemCd);
			String[] toCompPs = new String[5];
			for(int i = 0; i < toCompPsList.size(); i++){
				toCompPs = (String[])toCompPsList.get(i);
				List toAttribute = getPsAttribute(toItemCd, toCompPs[0], toCompPs[1]);
				
				String toInDate = (String)toAttribute.get(2);	// ���i�\���L���J�n��
				Date dateToInDate = formatYyyyMmDd.parse(toInDate);
				String toOutDate = (String)toAttribute.get(3);	// ���i�\���L���I����
				Date dateToOutDate = formatYyyyMmDd.parse(toOutDate);
				if (dateToOutDate.compareTo(dateReplaceDate) < 0 
				        || dateToInDate.compareTo(dateReplaceDate) >= 0) {
					// �u�����t�@���@���i�\���L���I�����̏ꍇ
					// �u�����t�@���@���i�\���L���J�n���ꍇ
					// �������Ȃ�
					hasWarning = true;
					continue;
				}
				// Del Start 20140410 wanghp
//				else {
//					// ���i�\���L���J�n���@���@�u�u�����t�v�@���@���i�\���L���I����
//					// �u���搻�i�\�����C���i���i�\���L���J�n����u�����t�ɏC���j
//					modifyM_PS(toItemCd, toCompPs[0], toCompPs[1], 
//							replaceDate, toOutDate, (String)toAttribute.get(13));
//					// �u�������̃J�E���g�A�b�v
//					++ReplaceCount;
//				}
				// Del End 20140410 wanghp
			}
			
			return hasWarning;
		} catch (ParseException pe) {
			_errorInfo = new ExpjMessage("ZZ01006", replaceDate);
			throw pe;
		}
	}
	// Add End 20140310 wanghp

	/**
	 * ���i�\���̐e�i�ڂ܂��͎q�i�ڂ�u�����܂�
	 *
	 * @param  parentItemCd �u�����鐻�i�\���̒u�����e�i�ڔԍ�
	 * @param  compItemCd �u�����鐻�i�\���̒u�����q�i�ڔԍ�
	 * @param  psEdition �u�����鐻�i�\���̔Ő�
	 * @param  toItemCd �u�����鐻�i�\���̒u����i�ڔԍ�
	 * @param  replaceDate �u�����t
	 * @param  modifyCount �u�����鐻�i�\���̍X�V��
	 * @param  parent �e�i�ڒu���t���O�ifalse�̂Ƃ��q�i�ڒu���j
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 * @throws ParseException ���t�̌`���ϊ��Ɏ��s
	 * @throws FoundationException �������o�^�pSQL���̐����Ɏ��s
	 * @throws ExpjBadException �X�V���s��v
	 */
	private void replacePsSub(String parentItemCd, String compItemCd, String psEdition,
			String toItemCd, String replaceDate, String modifyCount, boolean parent)
			throws SQLException, ParseException, FoundationException, ExpjBadException
	{
		PreparedStatement stmt = null;
		ResultSet result = null;
		try {
			SimpleDateFormat formatYyyyMmDd = new SimpleDateFormat("yyyy/MM/dd");
			// �u�����t�𐳋K���i"YYYY/MM/DD"�j
			Date dateReplaceDate = formatYyyyMmDd.parse(replaceDate);
			replaceDate = formatYyyyMmDd.format(dateReplaceDate);
			// �u�������i�\���̐��i�\�������f�[�^���擾
			List fromAttribute = getPsAttribute(parentItemCd, compItemCd, psEdition);
			if (((String)fromAttribute.get(13)).equals(modifyCount) == false) {
				// �X�V������v���Ȃ��ꍇ
				// ���̏����ɂ���ăf�[�^�������������Ă��܂��B�Ď��s���Ă��������B
				throw new ExpjBadException(new ExpjMessage("ZZ01105",
						"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD,PS_EDITION:"
						+ parentItemCd + "," + compItemCd + "," + psEdition));
			}
			String fromInDate = (String)fromAttribute.get(2);	// ���i�\���L���J�n��
			Date dateFromInDate = formatYyyyMmDd.parse(fromInDate);
			String fromOutDate = (String)fromAttribute.get(3);	// ���i�\���L���I����
			Date dateFromOutDate = formatYyyyMmDd.parse(fromOutDate);
			if (dateFromOutDate.compareTo(dateReplaceDate) < 0) {
				// ���i�\���L���I�������u�����t���O�̏ꍇ
				// �������Ȃ�
				return;
			}
			// �ǉ��܂��͏C���p�̐��i�\�������f�[�^���X�g���쐬
			List replaceAttribute = new ArrayList(0);
			replaceAttribute.add((String)fromAttribute.get(0));		// ���i�\���P�ʐ�����
			replaceAttribute.add((String)fromAttribute.get(1));		// ���i�\���P�ʐ����q
			if (dateFromInDate.compareTo(dateReplaceDate) >= 0) {
				// ���i�\���L���J�n�����u�����t�ȍ~�̏ꍇ
				// ���i�\���L���J�n���͒u�����̒l
				replaceAttribute.add(fromInDate);
			} else {
				// ���i�\���L���J�n�����u�����t���O�̏ꍇ
				// ���i�\���L���J�n���͒u�����t
				replaceAttribute.add(replaceDate);
			}
			replaceAttribute.add(fromOutDate);	// ���i�\���L���I����
			// �\���d�������珊�v�ʓW�J�敪�܂�
			for (int i = 4; i < 14; i++) {
				replaceAttribute.add((String)fromAttribute.get(i));
			}
			// �u���搻�i�\����ǉ�
			if (parent) {
				// �e�i�ڒu���̏ꍇ
				addM_PS(toItemCd, compItemCd, psEdition, replaceAttribute);
				// Add Start 20140311 wanghp
				// �u�������̃J�E���g�A�b�v
				++ReplaceCount;
				// Add End 20140311 wanghp
			} else {
				// �q�i�ڒu���̏ꍇ
				addM_PS(parentItemCd, toItemCd, psEdition, replaceAttribute);
				// Add Start 20140311 wanghp
				// �u�������̃J�E���g�A�b�v
				++ReplaceCount;
				// Add End 20140311 wanghp
			}
			if (dateFromInDate.compareTo(dateReplaceDate) >= 0) {
				// ���i�\���L���J�n�����u�����t�ȍ~�̏ꍇ
				// �u�������i�\�����폜
				deleteM_PS(parentItemCd, compItemCd, psEdition, (String)fromAttribute.get(13));
				// Add Start 20140311 wanghp
				// �u�������̃J�E���g�A�b�v
				++ReplaceCount;
				// Add End 20140311 wanghp
			} else {
				// ���i�\���L���J�n�����u�����t���O�̏ꍇ
				// �u�������i�\�����C��
				// �i���i�\���L���I������u�����t�̑O���ɕύX�j
				replaceAttribute.remove(2);						// ���i�\���L���J�n��
				replaceAttribute.add(2, fromInDate);			// �i�擾�����l�ɖ߂��j
				replaceAttribute.remove(3);						// ���i�\���L���I����
				String newFromOutDate = formatYyyyMmDd.format(
						new Date(dateReplaceDate.getTime() - 60 * 60 * 24));
				replaceAttribute.add(3, newFromOutDate);		// �i�u�����t�̑O����ݒ�j
				modifyM_PS(parentItemCd, compItemCd, psEdition, replaceAttribute);
				// Add Start 20140311 wanghp
				// �u�������̃J�E���g�A�b�v
				++ReplaceCount;
				// Add End 20140311 wanghp
			}
		} catch (ParseException pe) {
			_errorInfo = new ExpjMessage("ZZ01006", replaceDate);
			throw pe;
		} finally {
			closePreparedStatement(stmt);
			closeResultSet(result);
		}
	}

	/**
	 * ���i�\���̗L�����Ԃ̈ꗗ���擾���܂�
	 *
	 * @param  parentItemCd �e�i�ڔԍ�
	 * @param  compItemCd �q�i�ڔԍ�
	 * @return �i�ڎ�z�敪
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 */
	private List getEffPhaseList(String parentItemCd, String compItemCd)
			throws SQLException
	{
		PreparedStatement stmt = null;
		ResultSet result = null;
		try {
			List phaseList = new ArrayList(0);
			// ���i�\���̗L�����Ԃ̈ꗗ���擾
			stmt = _connection.prepareStatement(_sqlGetEffPhaseList);
			stmt.setString(1, parentItemCd);
			stmt.setString(2, compItemCd);
			result = stmt.executeQuery();
			while (result.next() == true) {
				Date[] phase = new Date[2];
				phase[0] = result.getDate(1);	// ���i�\���L�����ԊJ�n��
				phase[1] = result.getDate(2);	// ���i�\���L�����ԏI����
				phaseList.add(phase);
			}
			return phaseList;
		} catch (SQLException se) {
			_errorInfo = new ExpjMessage("ZZ01006",
					"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD:" + parentItemCd + "," + compItemCd);
			throw se;
		} finally {
			closePreparedStatement(stmt);
			closeResultSet(result);
		}
	}

	/**
	 * �w�肳�ꂽ���i�\���Ő������������i�\���̗L�����Ԃ̈ꗗ���擾���܂�
	 *
	 * @param  parentItemCd �e�i�ڔԍ�
	 * @param  compItemCd �q�i�ڔԍ�
	 * @param  peEdition ���i�\���Ő�
	 * @return �i�ڎ�z�敪
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 */
	private List getEffPhaseListWoPse(String parentItemCd, String compItemCd, String psEdition)
			throws SQLException
	{
		PreparedStatement stmt = null;
		ResultSet result = null;
		try {
			List phaseList = new ArrayList(0);
			// ���i�\���̗L�����Ԃ̈ꗗ���擾
			stmt = _connection.prepareStatement(_sqlGetEffPhaseListWoPse);
			stmt.setString(1, parentItemCd);
			stmt.setString(2, compItemCd);
			stmt.setString(3, psEdition);
			result = stmt.executeQuery();
			while (result.next() == true) {
				Date[] phase = new Date[2];
				phase[0] = result.getDate(1);	// ���i�\���L�����ԊJ�n��
				phase[1] = result.getDate(2);	// ���i�\���L�����ԏI����
				phaseList.add(phase);
			}
			return phaseList;
		} catch (SQLException se) {
			_errorInfo = new ExpjMessage("ZZ01006",
					"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD,PS_EDITION:"
					+ parentItemCd + "," + compItemCd + "," + psEdition);
			throw se;
		} finally {
			closePreparedStatement(stmt);
			closeResultSet(result);
		}
	}

	/**
	 * �w�肳�ꂽ���Ԃ����i�\���L�����ԂƏd�����Ȃ������ׂ܂�
	 *
	 * @param targetList �����Ώۂ̐��i�\���L�����Ԃ̈ꗗ
	 * @param inDate ���i�\���L���i���ԁj�J�n��
	 * @param outDate ���i�\���L���i���ԁj�I����
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 * @throws ParseException ���t�̌`���ϊ��Ɏ��s
	 * @throws FoundationException �������o�^�pSQL���̐����Ɏ��s
	 * @throws PsEffPhaseException �L�����Ԃɏd������
	*/
	private void testConflictEffPhaseSub(List targetList, String inDate, String outDate)
			throws SQLException, FoundationException, ParseException, PsEffPhaseException
	{
		SimpleDateFormat formatYyyyMmDd = new SimpleDateFormat("yyyy/MM/dd");
		Date dateInDate = formatYyyyMmDd.parse(inDate);
		Date dateOutDate = formatYyyyMmDd.parse(outDate);
		int listSize = targetList.size();
		for (int i = 0; i < listSize; i++) {
			Date[] targetPhase = (Date[])(targetList.get(i));
			// [0]:�J�n���A[1]:�I����
			// �����Ώۂ̊J�n�����w��J�n���̏ꍇ
			if (targetPhase[0].compareTo(dateInDate) > 0) {
				// �����Ώۂ̊J�n�����w��I�����Ȃ�΁F
				if (targetPhase[0].compareTo(dateOutDate) <= 0) {
					// �d������
					throw new PsEffPhaseException(new ExpjMessage("ZZ01006",
							inDate + "," + outDate));
				}
			// �����Ώۂ̊J�n�����w��J�n�̏ꍇ
			} else if (targetPhase[0].compareTo(dateInDate) < 0) {
				// �����Ώۂ̏I�������w��J�n��
				if (targetPhase[1].compareTo(dateInDate) >= 0) {
					// �d������
					throw new PsEffPhaseException(new ExpjMessage("ZZ01006",
							inDate + "," + outDate));
				}
			} else {
				// �����Ώۂ̊J�n��==�w��J�n��
				// �d������
				throw new PsEffPhaseException(new ExpjMessage("ZZ01006",
						inDate + "," + outDate));
			}
		}
		// �d�����Ȃ�
	}

	/**
	 * �i�ڎ�z�敪���擾���܂�
	 *
	 * @param  itemCd �i�ڔԍ�
	 * @return �i�ڎ�z�敪
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 * @throws NoDataException �w��L�[�f�[�^�Ȃ�
	 */
	private Integer getMrpOrderType(String itemCd)
			throws SQLException, NoDataException
	{
		PreparedStatement stmt = null;
		ResultSet result = null;
		try {
			// �i�ڎ�z�敪���擾
			stmt = _connection.prepareStatement(_sqlGetMrpOrderType);
			stmt.setString(1, itemCd);
			result = stmt.executeQuery();
			if (result.next() == false) {
				// �w��L�[�̃f�[�^�����݂��܂���B
				_errorInfo = new ExpjMessage("ZZ01006", "M_ITEM.ITEM_CD:" + itemCd);
				throw new NoDataException();
			}
			return new Integer(result.getInt(1));	// �i�ڎ�z�敪
		} catch (SQLException se) {
			_errorInfo = new ExpjMessage("ZZ01006", "M_ITEM.ITEM_CD:" + itemCd);
			throw se;
		} finally {
			closePreparedStatement(stmt);
			closeResultSet(result);
		}
	}

// 2008/07/15 SYSCOM ���� ADD START
	/**
	 * �H���Ǘ��i�ڋ敪���擾���܂�
	 *
	 * @param  itemCd �i�ڔԍ�
	 * @return �H���Ǘ��i�ڋ敪
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 * @throws NoDataException �w��L�[�f�[�^�Ȃ�
	 */
	private Integer getManhourTyp(String itemCd)
			throws SQLException, NoDataException
	{
		PreparedStatement stmt = null;
		ResultSet result = null;
		try {
			// �H���Ǘ��i�ڋ敪���擾
			stmt = _connection.prepareStatement(_sqlGetManhourTyp);
			stmt.setString(1, itemCd);
			result = stmt.executeQuery();
			if (result.next() == false) {
				// �w��L�[�̃f�[�^�����݂��܂���B
				_errorInfo = new ExpjMessage("ZZ01006", "M_ITEM.ITEM_CD:" + itemCd);
				throw new NoDataException();
			}
			return new Integer(result.getInt(1));	// �H���Ǘ��i�ڋ敪
		} catch (SQLException se) {
			_errorInfo = new ExpjMessage("ZZ01006", "M_ITEM.ITEM_CD:" + itemCd);
			throw se;
		} finally {
			closePreparedStatement(stmt);
			closeResultSet(result);
		}
	}
// 2008/07/15 SYSCOM ���� ADD END

	/**
	 * �v���y�A�h�X�e�[�g�����g����܂�
	 *
	 * @param stmt ����v���y�A�h�X�e�[�g�����g
	 */
	private void closePreparedStatement(PreparedStatement stmt)
	{
		if (stmt != null) {
			try {
				stmt.close();
				stmt = null;
			} catch (SQLException se) {
				// �Ώ��s�\�Ȃ̂�SQLException�𖳎�����
			}
		}
	}

	/**
	 * ���U���g�Z�b�g����܂�
	 *
	 * @param result ���郊�U���g�Z�b�g
	 */
	private void closeResultSet(ResultSet result)
	{
		if (result != null) {
			try {
				result.close();
				result = null;
			} catch (SQLException e) {
				// �Ώ��s�\�Ȃ̂�SQLException�𖳎�����
			}
		}
	}

	/**
	 * �d������i�ڔԍ����ЂƂɂ��܂�
	 *
	 * @param targetList �i�ڔԍ��̈ꗗ
	 */
	private void deleteDuplicateItemCd(List targetList)
	{
		// �i�ڔԍ��i���i�\���F�i�ڔԍ��A���i�\���Ő��A���j�̈ꗗ����Ɨp���X�g�ɕ���
		List workList = new ArrayList(targetList);
		// ��������i�ڔԍ��̈ꗗ���N���A
		targetList.clear();
		int workListSize = workList.size();
		for (int i = 0; i < workListSize; i++) {
			boolean unique = true;
			String[] workPs = (String[])workList.get(i);
			String itemCd = workPs[0];
			int targetListSize = targetList.size();
			for (int j = 0; j < targetListSize; j++) {
				String[] targetPs = (String[])targetList.get(j);
				if (itemCd.equals(targetPs[0]) == true) {
					// �d������
					unique = false;
					break;
				}
			}
			if (unique == true) {
				// �d�����Ă��Ȃ��i�ڔԍ��������ꗗ�ɒǉ�
				targetList.add(workPs);
			}
		}
	}

	/**
	 * ���i�\���̑����f�[�^���擾���܂�
	 *
	 * @param  parentItemCd �e�i�ڔԍ�
	 * @param  compItemCd �e�i�ڔԍ�
	 * @param  psEdition ���i�\���Ő�
	 * @return ���i�\���̑����f�[�^
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 * @throws NoDataException �Ώۃf�[�^�Ȃ�
	 */
	public List getPsAttribute(String parentItemCd, String compItemCd, String psEdition)
			throws SQLException, NoDataException
	{
		PreparedStatement stmt = null;
		ResultSet result = null;
		try {
			// ���i�\���̑����f�[�^���擾
			stmt = _connection.prepareStatement(_sqlGetPsAttribute);
			stmt.setString(1, parentItemCd);	// �e�i�ڔԍ�
			stmt.setString(2, compItemCd);		// �q�i�ڔԍ�
			stmt.setString(3, psEdition);		// ���i�\���Ő�
			result = stmt.executeQuery();
			if (result.next() == false) {
				// �Ώۃf�[�^�����݂��܂���B
				_errorInfo = new ExpjMessage("ZZ01006",
						"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD,PS_EDITION:"
						+ parentItemCd + "," + compItemCd + "," + psEdition);
				throw new NoDataException();
			}
			List attribute = new ArrayList(0);
			for (int i = 1; i <= 14; i++) {
				attribute.add(result.getString(i));
			}
			return attribute;
		} catch (SQLException se) {
			_errorInfo = new ExpjMessage("ZZ01006", "M_PS.PARENT_ITEM_CD,COMP_ITEM_CD,PS_EDITION:"
						+ parentItemCd + "," + compItemCd + "," + psEdition);
			throw se;
		} finally {
			closePreparedStatement(stmt);
			closeResultSet(result);
		}
	}

	/**
	 * �q���i�\���̈ꗗ���擾���A�ԋp���܂�
	 *
	 * @param  parentItemCd �e�i�ڔԍ��i��i�ڔԍ��j
	 * @return �q���i�\���̈ꗗ
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 */
	public List getCompPsList(String parentItemCd)
			throws SQLException
	{
		return getPsList(parentItemCd, _sqlGetCompPs);
	}

	/**
	 * �w����t�ŗL���Ȏq���i�\���̈ꗗ���擾���A�ԋp���܂�
	 *
	 * @param  parentItemCd �e�i�ڔԍ��i��i�ڔԍ��j
	 * @param  targetDate �w����t
	 * @return �q���i�\���̈ꗗ
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 * @throws ParseException ���t�̌`���ϊ��Ɏ��s
	 */
	public List getCompPsList(String parentItemCd, String targetDate)
			throws SQLException, ParseException
	{
		if (targetDate == null) {
			return getCompPsList(parentItemCd);
		} else {
			return getPsListByDate(parentItemCd, targetDate, _sqlGetCompPsByDate);
		}
	}

	/**
	 * �e���i�\���̈ꗗ���擾���A�ԋp���܂�
	 *
	 * @param  compItemCd �q�i�ڔԍ��i��i�ڔԍ��j
	 * @return �e���i�\���̈ꗗ
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 */
	public List getParentPsList(String compItemCd)
			throws SQLException
	{
		return getPsList(compItemCd, _sqlGetParentPs);
	}

	/**
	 * �w����t�ŗL���Ȑe���i�\���̈ꗗ���擾���A�ԋp���܂�
	 *
	 * @param  compItemCd �q�i�ڔԍ��i��i�ڔԍ��j
	 * @param  targetDate �w����t
	 * @return �e���i�\���̈ꗗ
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 * @throws ParseException ���t�̌`���ϊ��Ɏ��s
	 */
	public List getParentPsList(String compItemCd, String targetDate)
			throws SQLException, ParseException
	{
		if (targetDate == null) {
			return getParentPsList(compItemCd);
		} else {
			return getPsListByDate(compItemCd, targetDate, _sqlGetParentPsByDate);
		}
	}

	/**
	 * ���i�\����ǉ����܂�
	 *
	 * @param  parentItemCd �ǉ����鐻�i�\���̐e�i�ڔԍ�
	 * @param  compItemCd �ǉ����鐻�i�\���̎q�i�ڔԍ�
	 * @param  psEdition �ǉ����鐻�i�\���̔Ő�
	 * @param  attribute �ǉ����鐻�i�\���̑����f�[�^
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 * @throws FoundationException �������o�^�pSQL���̐����Ɏ��s
	 * @throws ExpjBadException �L�[�d��
	 */
	public void addM_PS(String parentItemCd, String compItemCd, String psEdition, List attribute)
			throws SQLException, FoundationException, ExpjBadException
	{
		// ���i�\����ǉ�
		PreparedStatement stmt = null;
		try {
			if ("Oracle".equals(_connection.getMetaData().getDatabaseProductName()) == true) {
				stmt = _connection.prepareStatement(
						_objMessage.replaceSQL_I(_sqlAddM_PS));
			} else if ("Microsoft SQL Server".equals(
					_connection.getMetaData().getDatabaseProductName()) == true)
			{
				stmt = _connection.prepareStatement(
						_objMessage.replaceSQL_I_MSSQL(_sqlAddM_PS));
			} else {
				stmt = _connection.prepareStatement(
						_objMessage.replaceSQL_I_DB2(_sqlAddM_PS));
			}
			stmt.setString(1, _sysdate);		// �쐬����
			stmt.setString(2, _userCode);		// �쐬��
			stmt.setString(3, _programName);	// �쐬�v���O������
			stmt.setString(4, _sysdate);		// �X�V����
			stmt.setString(5, _userCode);		// �X�V��
			stmt.setString(6, _programName);	// �X�V�v���O������
			stmt.setString(7, parentItemCd);	// �e�i�ڔԍ�
			stmt.setString(8, compItemCd);		// �q�i�ڔԍ�
			stmt.setString(9, psEdition);		// ���i�\���Ő�
			stmt.setString(10, (String)attribute.get(0));	// ���i�\���P�ʐ�����
			stmt.setString(11, (String)attribute.get(1));	// ���i�\���P�ʐ����q
			stmt.setString(12, (String)attribute.get(2));	// ���i�\���L���J�n��
			stmt.setString(13, (String)attribute.get(3));	// ���i�\���L���I����
			stmt.setString(14, (String)attribute.get(4));	// �\���d����
			stmt.setString(15, (String)attribute.get(5));	// �x���敪
			stmt.setString(16, (String)attribute.get(6));	// ���i�\�����[�h�^�C���g�p�t���O
			stmt.setString(17, (String)attribute.get(7));	// ���i�\���Œ胊�[�h�^�C��
			stmt.setString(18, (String)attribute.get(8));	// ���i�\����ᕪ���[�h�^�C��
			stmt.setString(19, (String)attribute.get(9));	// ���i�\����ᕪ���b�g�T�C�Y
			stmt.setString(20, (String)attribute.get(10));	// ���i�\���Ɖ�L�[
			stmt.setString(21, (String)attribute.get(11));	// �����Ϗ�敪
			stmt.setString(22, (String)attribute.get(12));	// ���v�ʓW�J�敪
			stmt.executeUpdate();
		} catch (SQLException se) {
			if (se.getErrorCode() == 1) {
				// �L�[�d���̏ꍇ
				throw new ExpjBadException(new ExpjMessage("ZZ01102",
						"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD,PS_EDITION:"
						+ parentItemCd + "," + compItemCd + "," + psEdition));
			} else {
				_errorInfo = new ExpjMessage("ZZ01006",
						"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD,PS_EDITION:"
						+ parentItemCd + "," + compItemCd + "," + psEdition);
				throw se;
			}
		} finally {
			closePreparedStatement(stmt);
		}
		// ���i�\���g�����U�N�V�����ւ̒ǉ��L�^�̒ǉ�
		addSYS_PS_T(parentItemCd, compItemCd, psEdition, ACCESS_TYP_ADD, CMPLT_FLG_FALSE);
	}

	// Add Start 20140310 wanghp
	/**
	 * ���i�\�����C�����܂�
	 *
	 * @param  parentItemCd �e�i�ڔԍ�
	 * @param  compItemCd �q�i�ڔԍ�
	 * @param  psEdition �Ő�
	 * @param  inDate �J�n��
	 * @param  outDate �I����
	 * @param  modifyCount �X�V��
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 * @throws FoundationException �������o�^�pSQL���̐����Ɏ��s
	 * @throws ExpjBadException �X�V���s��v
	 */
	private void modifyM_PS(String parentItemCd, String compItemCd, String psEdition,
			String inDate, String outDate, String modifyCount)
			throws SQLException, FoundationException, ExpjBadException
	{
		// ���i�\���̍X�V��������
		testModifyCount(parentItemCd, compItemCd, psEdition, modifyCount);
		// ���i�\�����C��
		PreparedStatement stmt = null;
		try {
			if ("Oracle".equals(_connection.getMetaData().getDatabaseProductName()) == true) {
				stmt = _connection.prepareStatement(
						_objMessage.replaceSQL_U(_sqlHasCompModifyM_PS));
			} else if ("Microsoft SQL Server".equals(
					_connection.getMetaData().getDatabaseProductName()) == true)
			{
				stmt = _connection.prepareStatement(
						_objMessage.replaceSQL_U_MSSQL(_sqlHasCompModifyM_PS));
			} else {
				stmt = _connection.prepareStatement(
						_objMessage.replaceSQL_U_DB2(_sqlHasCompModifyM_PS));
			}
			stmt.setString(1, _sysdate);		// �X�V����
			stmt.setString(2, _userCode);		// �X�V��
			stmt.setString(3, _programName);	// �X�V�v���O������
			stmt.setString(4, inDate);			// ���i�\���L���J�n��
			stmt.setString(5, outDate);			// ���i�\���L���I����
			stmt.setString(6, parentItemCd);	// �e�i�ڔԍ�
			stmt.setString(7, compItemCd);		// �q�i�ڔԍ�
			stmt.setString(8, psEdition);		// ���i�\���Ő�
			stmt.executeUpdate();
		} catch (SQLException se) {
			_errorInfo = new ExpjMessage("ZZ01006",
					"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD,PS_EDITION:"
					+ parentItemCd + "," + compItemCd + "," + psEdition);
			throw se;
		} finally {
			closePreparedStatement(stmt);
		}
	}
	// Add End 20140310 wanghp
	
	/**
	 * ���i�\�����C�����܂�
	 *
	 * @param  parentItemCd �C�����鐻�i�\���̐e�i�ڔԍ�
	 * @param  compItemCd �C�����鐻�i�\���̎q�i�ڔԍ�
	 * @param  psEdition �C�����鐻�i�\���̔Ő�
	 * @param  attribute �C�����鐻�i�\���̑����f�[�^
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 * @throws FoundationException �������o�^�pSQL���̐����Ɏ��s
	 * @throws ExpjBadException �X�V���s��v
	 */
	public void modifyM_PS(String parentItemCd, String compItemCd, String psEdition,
			List attribute)
			throws SQLException, FoundationException, ExpjBadException
	{
		// ���i�\���̍X�V��������
		testModifyCount(parentItemCd, compItemCd, psEdition, (String)attribute.get(13));
		// ���i�\�����C��
		PreparedStatement stmt = null;
		ResultSet result = null;
		try {
			if ("Oracle".equals(_connection.getMetaData().getDatabaseProductName()) == true) {
				stmt = _connection.prepareStatement(
						_objMessage.replaceSQL_U(_sqlModifyM_PS));
			} else if ("Microsoft SQL Server".equals(
					_connection.getMetaData().getDatabaseProductName()) == true)
			{
				stmt = _connection.prepareStatement(
						_objMessage.replaceSQL_U_MSSQL(_sqlModifyM_PS));
			} else {
				stmt = _connection.prepareStatement(
						_objMessage.replaceSQL_U_DB2(_sqlModifyM_PS));
			}
			stmt.setString(1, _sysdate);		// �X�V����
			stmt.setString(2, _userCode);		// �X�V��
			stmt.setString(3, _programName);	// �X�V�v���O������
			stmt.setString(4, (String)attribute.get(0));	// ���i�\���P�ʐ�����
			stmt.setString(5, (String)attribute.get(1));	// ���i�\���P�ʐ����q
			stmt.setString(6, (String)attribute.get(2));	// ���i�\���L���J�n��
			stmt.setString(7, (String)attribute.get(3));	// ���i�\���L���I����
			stmt.setString(8, (String)attribute.get(4));	// �\���d����
			stmt.setString(9, (String)attribute.get(5));	// �x���敪
			stmt.setString(10, (String)attribute.get(6));	// ���i�\�����[�h�^�C���g�p�t���O
			stmt.setString(11, (String)attribute.get(7));	// ���i�\���Œ胊�[�h�^�C��
			stmt.setString(12, (String)attribute.get(8));	// ���i�\����ᕪ���[�h�^�C��
			stmt.setString(13, (String)attribute.get(9));	// ���i�\����ᕪ���b�g�T�C�Y
			stmt.setString(14, (String)attribute.get(10));	// ���i�\���Ɖ�L�[
			stmt.setString(15, (String)attribute.get(11));	// �����Ϗ�敪
			stmt.setString(16, (String)attribute.get(12));	// ���v�ʓW�J�敪
			stmt.setString(17, parentItemCd);	// �e�i�ڔԍ�
			stmt.setString(18, compItemCd);		// �q�i�ڔԍ�
			stmt.setString(19, psEdition);		// ���i�\���Ő�
			stmt.executeUpdate();
		} catch (SQLException se) {
			_errorInfo = new ExpjMessage("ZZ01006",
					"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD,PS_EDITION:"
					+ parentItemCd + "," + compItemCd + "," + psEdition);
			throw se;
		} finally {
			closePreparedStatement(stmt);
		}
	}

	/**
	 * ���i�\�����폜���܂�
	 *
	 * @param  parentItemCd �폜���鐻�i�\���̐e�i�ڔԍ�
	 * @param  compItemCd �폜���鐻�i�\���̎q�i�ڔԍ�
	 * @param  psEdition �폜���鐻�i�\���̔Ő�
	 * @param  modifyCount �폜���鐻�i�\���̍X�V��
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 * @throws FoundationException �������o�^�pSQL���̐����Ɏ��s
	 * @throws ExpjBadException �X�V���s��v
	 */
	public void deleteM_PS(String parentItemCd, String compItemCd, String psEdition,
			String modifyCount)
			throws SQLException, FoundationException, ExpjBadException
	{
		// ���i�\���̍X�V��������
		testModifyCount(parentItemCd, compItemCd, psEdition, modifyCount);
		// ���i�\�����폜
		PreparedStatement stmt = null;
		ResultSet result = null;
		try {
			stmt = _connection.prepareStatement(_sqlDeleteM_PS);
			stmt.setString(1, parentItemCd);
			stmt.setString(2, compItemCd);
			stmt.setString(3, psEdition);
			stmt.executeUpdate();
		} catch (SQLException se) {
			_errorInfo = new ExpjMessage("ZZ01006",
					"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD,PS_EDITION:"
					+ parentItemCd + "," + compItemCd + "," + psEdition);
			throw se;
		} finally {
			closePreparedStatement(stmt);
		}
		// ���i�\���g�����U�N�V�����ւ̍폜�L�^�̒ǉ�
		addSYS_PS_T(parentItemCd, compItemCd, psEdition, ACCESS_TYP_DELETE, CMPLT_FLG_FALSE);
	}

	/**
	 * �q���i�\�����R�s�[���܂�
	 *
	 * @param  fromParentItemCd �R�s�[�����i�\���̐e�i�ڔԍ�
	 * @param  fromCompItemCd �R�s�[�����i�\���̎q�i�ڔԍ�
	 * @param  fromPsEdition �R�s�[�����i�\���̐��i�\���Ő�
	 * @param  fromModifyCount �R�s�[�����i�\���̍X�V��
	 * @param  toParentItemCd �R�s�[�搻�i�\���̐e�i�ڔԍ�
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 * @throws FoundationException �������o�^�pSQL���̐����Ɏ��s
	 * @throws ExpjBadException �X�V���s��v
	 */
	public void copyCompPs(String fromParentItemCd, String fromCompItemCd, String fromPsEdition,
			String fromModifyCount, String toParentItemCd)
			throws SQLException, FoundationException, ExpjBadException
	{
		// �R�s�[�����i�\���̑����f�[�^���擾
		List attribute = getPsAttribute(fromParentItemCd, fromCompItemCd, fromPsEdition);
		if (((String)attribute.get(13)).equals(fromModifyCount) == false) {
			// �X�V������v���Ȃ��ꍇ
			// ���̏����ɂ���ăf�[�^�������������Ă��܂��B�Ď��s���Ă��������B
			throw new ExpjBadException(new ExpjMessage("ZZ01105",
					"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD,PS_EDITION:"
					+ fromParentItemCd + "," + fromCompItemCd + "," + fromPsEdition));
		}
		// �R�s�[��e�i�ڂ̉��ɐ��i�\����ǉ�
		addM_PS(toParentItemCd, fromCompItemCd, fromPsEdition, attribute);
	}

	/**
	 * �e���i�\�����R�s�[���܂�
	 *
	 * @param  fromParentItemCd �R�s�[�����i�\���̐e�i�ڔԍ�
	 * @param  fromCompItemCd �R�s�[�����i�\���̎q�i�ڔԍ�
	 * @param  fromPsEdition �R�s�[�����i�\���̐��i�\���Ő�
	 * @param  fromModifyCount �R�s�[�����i�\���̍X�V��
	 * @param  toCompItemCd �R�s�[�搻�i�\���̎q�i�ڔԍ�
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 * @throws FoundationException �������o�^�pSQL���̐����Ɏ��s
	 * @throws ExpjBadException �X�V���s��v
	 */
	public void copyParentPs(String fromParentItemCd, String fromCompItemCd,
			String fromPsEdition, String fromModifyCount, String toCompItemCd)
			throws SQLException, FoundationException, ExpjBadException
	{
		// �R�s�[�����i�\���̑����f�[�^���擾
		List attribute = getPsAttribute(fromParentItemCd, fromCompItemCd, fromPsEdition);
		if (((String)attribute.get(13)).equals(fromModifyCount) == false) {
			// �X�V������v���Ȃ��ꍇ
			// ���̏����ɂ���ăf�[�^�������������Ă��܂��B�Ď��s���Ă��������B
			throw new ExpjBadException(new ExpjMessage("ZZ01105",
					"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD,PS_EDITION:"
					+ fromParentItemCd + "," + fromCompItemCd + "," + fromPsEdition));
		}
		// �R�s�[��q�i�ڂ̏�ɐ��i�\����ǉ�
		addM_PS(fromParentItemCd, toCompItemCd, fromPsEdition, attribute);
	}

	/**
	 * ���i�\���̐e�i�ڂ�u�����܂�
	 *
	 * @param  parentItemCd �u�����鐻�i�\���̒u�����e�i�ڔԍ�
	 * @param  compItemCd �u�����鐻�i�\���̎q�i�ڔԍ�
	 * @param  psEdition �u�����鐻�i�\���̔Ő�
	 * @param  toParentItemCd �u�����鐻�i�\���̒u����e�i�ڔԍ�
	 * @param  replaceDate �u�����t
	 * @param  modifyCount �폜/�X�V���鐻�i�\���̍X�V��
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 * @throws ParseException ���t�̌`���ϊ��Ɏ��s
	 * @throws FoundationException �������o�^�pSQL���̐����Ɏ��s
	 * @throws ExpjBadException �X�V���s��v
	 */
	//
	// �e�i�ڒu���C���[�W
	//
	//   parentItemCd  P --> T toParentItemCd
	//      psEdition  |     |
	//     compItemCd  C     C
	//
	//   �L���I�������u�����t�ȍ~�Ȃ�ΗL���I������u�����t�̑O���Ƃ��Ďc����A
	//   �L���I�������u�����t���O�Ȃ�΍폜�����
	//   �V���ɁA�L���J�n�����u�����t�܂��͒u�����t����̗L���J�n���̍\����
	//   ���������
	//
	public void replaceParentPs(String parentItemCd, String compItemCd, String psEdition,
			String toParentItemCd, String replaceDate, String modifyCount)
			throws SQLException, ParseException, FoundationException, ExpjBadException
	{
		replacePsSub(parentItemCd, compItemCd, psEdition, toParentItemCd, replaceDate, modifyCount,
				true);
	}

	/**
	 * ���i�\���̎q�i�ڂ�u�����܂�
	 *
	 * @param  parentItemCd �u�����鐻�i�\���̐e�i�ڔԍ�
	 * @param  compItemCd �u�����鐻�i�\���̒u�����q�i�ڔԍ�
	 * @param  psEdition �u�����鐻�i�\���̔Ő�
	 * @param  toCompItemCd �u�����鐻�i�\���̒u����q�i�ڔԍ�
	 * @param  replaceDate �u�����t
	 * @param  modifyCount �폜/�X�V���鐻�i�\���̍X�V��
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 * @throws ParseException ���t�̌`���ϊ��Ɏ��s
	 * @throws FoundationException �������o�^�pSQL���̐����Ɏ��s
	 * @throws ExpjBadException �X�V���s��v
	 */
	//
	// �q�i�ڒu���C���[�W
	//
	//   parentItemCd  P     P
	//      psEdition  |     |
	//     compItemCd  C --> T toCompItemCd
	//
	//   �L���I�������u�����t�ȍ~�Ȃ�ΗL���I������u�����t�̑O���Ƃ��Ďc����A
	//   �L���I�������u�����t���O�Ȃ�΍폜�����
	//   �V���ɁA�L���J�n�����u�����t�܂��͒u�����t����̗L���J�n���̍\����
	//   ���������
	//
	public void replaceCompPs(String parentItemCd, String compItemCd, String psEdition,
			String toCompItemCd, String replaceDate, String modifyCount)
			throws SQLException, ParseException, FoundationException, ExpjBadException
	{
		replacePsSub(parentItemCd, compItemCd, psEdition, toCompItemCd, replaceDate, modifyCount,
				false);
	}

	/**
	 * ���i�\���̕i�ڂ�u�����܂�
	 *
	 * @param  fromItemCd �u�����鐻�i�\�����̒u�����i�ڔԍ�
	 * @param  parentDataList �u�����鐻�i�\���̐e�i�ڔԍ��A���i�\���Ő��A�X�V���̑g�̈ꗗ
	 * @param  compDataList �u�����鐻�i�\���̎q�i�ڔԍ��Ɛ��i�\���Ő��A�X�V���̑g�̈ꗗ
	 * @param  toItemCd �u�����鐻�i�\�����̒u����i�ڔԍ�
	 * @param  replaceDate �u�����t
	 * @return 1�ȏ�:���[�j���O����@0:���[�j���O�Ȃ�
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 * @throws ParseException ���t�̌`���ϊ��Ɏ��s
	 * @throws FoundationException �������o�^�pSQL���̐����Ɏ��s
	 * @throws ExpjBadException �u����i�ڂɊ����\������
	 * @throws PsMrpOdrTypException �i�ڎ�z�敪�ɖ�������
	 */
	//
	// �u���C���[�W
	//
	//   parentDataList P1 P2 P3...   P1 P2 P3...
	//                  |  |  |       |  |  |
	//                  +--+--+       +--+--+
	//                     |             |
	//       fromItemCd    F   ------>   T    toItemCd
	//                     |             |
	//                  +--+--+       +--+--+
	//                  |  |  |       |  |  |
	//     compDataList C1 C2 C3...   C1 C2 C3...
	//
	//   �L���I�������u�����t�ȍ~�̍\���͗L���I������u�����t�̑O���Ƃ��Ďc����A
	//   �L���I�������u�����t���O�̍\���͍폜�����
	//   �V���ɁA�L���J�n�����u�����t�܂��͒u�����t����̗L���J�n���̍\����
	//   ���������
	//
	// Upd Start 20140310 wanghp
	// public void replacePs(String fromItemCd, List parentDataList, List compDataList,
	public int replacePs(String fromItemCd, List parentDataList, List compDataList,
	// Upd End 20140310 wanghp
			String toItemCd, String replaceDate)
			throws SQLException, ParseException, FoundationException, ExpjBadException,
// 2008/07/15 SYSCOM ���� ORIGINAL START
//					PsMrpOdrTypException
// 2008/07/15 SYSCOM ���� ORIGINAL END
// 2008/07/15 SYSCOM ���� UPD START
					PsMrpOdrTypException, PsManhourTypException
// 2008/07/15 SYSCOM ���� UPD END
	{
		// Upd Start 20140304 wanghp
		// List itemEditionList = null;
		// �q�\���Ȃ�/����t���O
		boolean hasCompPs = false;
		// �u����̕i�ڍ\���ɁA�L�����Ԕ͈͈ȊO�̉��ʕi�ڂ̑��݃t���O
		int hasWarning = 0;
		// �u�������̏�����
		ReplaceCount = 0;
		// Upd End 20140304 wanghp
		
		// Del Start 20140304 wanghp
		// if (hasParentPs(toItemCd)) {
		// 	// �u����i�ڂ��e���i�\���������Ă����ꍇ
		// 	// �G���[�F�u����i�ڂ͊��ɐ��i�\���Ɏg�p����Ă��܂��B
		// 	throw new ExpjBadException(new ExpjMessage("AA20012",
		// 			"M_PS.COMP_ITEM_CD:" + toItemCd));
		// }
		// Del End 20140304 wanghp
		
		if (hasCompPs(toItemCd)) {
			// Upd Start 20140304 wanghp
			// // �u����i�ڂ��q���i�\���������Ă����ꍇ
			// // �G���[�F�u����i�ڂ͊��ɐ��i�\���Ɏg�p����Ă��܂��B
			// throw new ExpjBadException(new ExpjMessage("AA20012",
			// 		"M_PS.PARENT_ITEM_CD:" + toItemCd));
			// �q�\������
			hasCompPs = true;
			// Upd End 20140304 wanghp
		}
		
		// Add Start 20140306 wanghp
		// �u���悪�q�\������̏ꍇ
		if(hasCompPs){
			// �u����̎q�\���ƒu�����̐e�\�����������̃`�F�b�N
			isParentCompEqual(fromItemCd, toItemCd);
			
			// �u�����q�\�����I�����ꂽ�ꍇ�A�G���[�Ƃ��܂��B
			if(compDataList.size() > 0){
				throw new ExpjBadException("AA00218");
			}
		}
		// Add End 20140306 wanghp
		
// 2008/07/15 SYSCOM ���� ADD START
		// Del Start 20140310 wanghp
		// if (compDataList.size() > 0) {
		// Del End 20140310 wanghp
			// �q�\���̈ꗗ��I�����Ă���ꍇ�A�u����i�ڔԍ����H���Ǘ��i�ڂ��`�F�b�N���s���B
			// �G���[�F�u�����i�ڂ��H���Ǘ��i�ڂ̏ꍇ�A���ʕi�ڂ��쐬����u���͍s���܂���B
			testManhourTyp(toItemCd);
		// Del Start 20140310 wanghp
		// }
		// Del End 20140310 wanghp
// 2008/07/15 SYSCOM ���� ADD END
		
		int parentListSize = parentDataList.size();
		for (int i = 0; i < parentListSize; i++) {
			// �u���Ώې��i�\���̐e�i�ڔԍ��Ɛ��i�\���Ő����P�g�擾
			String[] parentData = (String[])parentDataList.get(i);
			
			// Add Start 20140311 wanghp
			// �����e�i�ڂ����݂���ꍇ�A���̍\���͒u���ΏۊO
			if(isParentSame(parentData[0], toItemCd)){
				continue;
			}
			// Add End 20140311 wanghp
			
			// ���i�\���̕i�ڎ�z�敪����
			testMrpOrderType(parentData[0], toItemCd);
			// ���i�\���̎q�i�ڂ�u��
			replaceCompPs(parentData[0], fromItemCd, parentData[1], toItemCd, replaceDate,
					parentData[2]);
		}
		
		// Add Start 20140310 wanghp
		// �u���悪�q�\������̏ꍇ
		if(hasCompPs){
			if(replaceHasCompPs(fromItemCd, toItemCd, replaceDate)){
				++hasWarning;
			}
		}
		// Add End 20140310 wanghp
		
		int compListSize = compDataList.size();
		for (int i = 0; i < compListSize; i++) {
			// �u���Ώې��i�\���̎q�i�ڔԍ��Ɛ��i�\���Ő����P�g�擾
			String[] compData = (String[])compDataList.get(i);
			// ���i�\���̕i�ڎ�z�敪����
			testMrpOrderType(toItemCd, compData[0]);
			// ���i�\���̐e�i�ڂ�u��
			replaceParentPs(fromItemCd, compData[0], compData[1], toItemCd, replaceDate,
					compData[2]);
		}
		
		// Add Start 20140310 wanghp
		if(ReplaceCount == 0){
			throw new ExpjBadException("AA00220");
		}
		
		return hasWarning;
		// Add End 20140310 wanghp
	}
	
	// Add Start 20140306 wanghp
	/**
	 * �u�����e�\���ƒu����e�\���̓����`�F�b�N
	 * @param parentItemCd �u�����e�\���̕i�ڔԍ�
	 * @param toItemCd �u����i�ڔԍ�
	 * @return true:�u�����e�\���ƒu����e�\��������  false:�u�����e�\���ƒu����e�\�����������Ȃ�
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 */
	private boolean isParentSame(String parentItemCd, String toItemCd) throws SQLException{
		// �u����e�\���̈ꗗ���擾
		List parentPsList = getParentPsList(toItemCd);
		deleteDuplicateItemCd(parentPsList);
		String[] parentPs = new String[5];
		for(int i = 0; i < parentPsList.size(); i++){
			parentPs = (String[])parentPsList.get(i);
			if(parentItemCd.equals(parentPs[0])){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * �u����̎q�\���i�ځi�u����i�ڂƎq�̎q�\�����܂ށj�ƒu�����̐e�\���i�ځi�e�̐e�\�����܂ށj���������̃`�F�b�N
	 * @param fromItemCd�@�u�����i��
	 * @param toItemCd�@�u����i��
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 * @throws PsLoopException
	 */
	private void isParentCompEqual(String fromItemCd, String toItemCd) throws SQLException, PsLoopException{
		try {
			// �q�i�ڂ̓���i�ڌ����i���[�v�����j
			testLoopingParentPs(fromItemCd ,toItemCd);
			
			// �u����q�\���̈ꗗ���擾
	        List compPsList = getCompPsList(toItemCd);
	        deleteDuplicateItemCd(compPsList);
	        String[] grandCompPs = new String[5];
	        String grandCompItemCd = new String();
	        for(int i = 0; i < compPsList.size(); i ++){
	        	grandCompPs = (String[])compPsList.get(i);
	        	grandCompItemCd = grandCompPs[0];
	 			// ���i�ڂ̓���i�ڌ����i���[�v�����j
				testLoopingParentPs(fromItemCd ,grandCompItemCd);
 			
				isParentCompEqual(fromItemCd, grandCompItemCd);
	        }
		} catch (PsLoopException e) {
			throw new PsLoopException(new ExpjMessage("AA00055"));
		}
	}
	
	// Add End 20140306 wanghp

	/**
	 * �e���i�\���Ƀ��[�v���Ȃ������ׂ܂�
	 *
	 * @param  parentItemCd �������鐻�i�\���̐e�i�ڔԍ�
	 * @param  compItemCd �������鐻�i�\���̎q�i�ڔԍ�
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 * @throws PsLoopException �e���i�\���Ƀ��[�v����
	 */
	public void testLoopingParentPs(String parentItemCd, String compItemCd)
			throws SQLException, PsLoopException
	{
		// �e�i�ڂƎq�i�ڂ̓���i�ڌ����i���[�v�����j
		if (parentItemCd.equals(compItemCd) == true) {
			// ���[�v����
			throw new PsLoopException(new ExpjMessage("ZZ01006",
				"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD:" + parentItemCd + "," + compItemCd));
		}
		// �e�̐e�i�ڔԍ��̈ꗗ���擾
		List grandParentPsList = getParentPsList(parentItemCd);
		deleteDuplicateItemCd(grandParentPsList);
		int listSize = grandParentPsList.size();
		for (int i = 0; i < listSize; i++) {
			String[] grandParentPs = (String[])grandParentPsList.get(i);
			String grandParentItemCd = grandParentPs[0];
			// �e�̐e�i�ڂ̓���i�ڌ����i���[�v�����j
			if (compItemCd.equals(grandParentItemCd) == true) {
				// ���[�v����
				throw new PsLoopException(new ExpjMessage("ZZ01006",
					"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD:" + parentItemCd + "," + compItemCd));
			}
			// �e�̐e�̐e�i�ڂ̃��[�v����
			testLoopingParentPs(grandParentItemCd, compItemCd);
		}
		// ���[�v�Ȃ�
	}

	/**
	 * �q���i�\���Ƀ��[�v���Ȃ������ׂ܂�
	 *
	 * @param  parentItemCd �������鐻�i�\���̐e�i�ڔԍ�
	 * @param  compItemCd �������鐻�i�\���̎q�i�ڔԍ�
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 * @throws PsLoopException �q���i�\���Ƀ��[�v����
	 */
	public void testLoopingCompPs(String parentItemCd, String compItemCd)
			throws SQLException, PsLoopException
	{
		// �e�i�ڂƎq�i�ڂ̓���i�ڌ����i���[�v�����j
		if (parentItemCd.equals(compItemCd) == true) {
			// ���[�v����
			throw new PsLoopException(new ExpjMessage("ZZ01006",
				"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD:" + parentItemCd + "," + compItemCd));
		}
		// ���i�ڔԍ��̈ꗗ���擾
		List grandCompPsList = getCompPsList(compItemCd);
		deleteDuplicateItemCd(grandCompPsList);
		int listSize = grandCompPsList.size();
		for (int i = 0; i < listSize; i++) {
			String[] grandCompPs = (String[])grandCompPsList.get(i);
			String grandCompItemCd = grandCompPs[0];
			// ���i�ڂ̓���i�ڌ����i���[�v�����j
			if (parentItemCd.equals(grandCompItemCd) == true) {
				// ���[�v����
				throw new PsLoopException(new ExpjMessage("ZZ01006",
					"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD:" + parentItemCd + "," + compItemCd));
			}
			// �]���i�ڂ̃��[�v����
			testLoopingCompPs(parentItemCd, grandCompItemCd);
		}
		// ���[�v�Ȃ�
	}

	/**
	 * �ǉ����悤�Ƃ��Ă��鐻�i�\���ɗL�����Ԃ̏d�����Ȃ������ׂ܂�
	 *
	 * @param  parentItemCd �������鐻�i�\���̐e�i�ڔԍ�
	 * @param  compItemCd �������鐻�i�\���̎q�i�ڔԍ�
	 * @param  inDate ���i�\���L���J�n��
	 * @param  inDate ���i�\���L���J�n��
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 * @throws ParseException ���t�̌`���ϊ��Ɏ��s
	 * @throws FoundationException �������o�^�pSQL���̐����Ɏ��s
	 * @throws PsEffPhaseException �L�����Ԃɏd������
	 */
	public void testConflictEffPhase(String parentItemCd, String compItemCd, String inDate,
			String outDate)
			throws SQLException, ParseException, FoundationException, PsEffPhaseException
	{
		// �w�肳�ꂽ�e�i�ڂƎq�i�ڂ̐��i�\���̗L�����Ԃ̈ꗗ���擾
		List dateList = getEffPhaseList(parentItemCd, compItemCd);
		// �w�肳�ꂽ�J�n���ƏI�����ƗL�����Ԃ̈ꗗ���d������
		testConflictEffPhaseSub(dateList, inDate, outDate);
	}

	/**
	 * �C�����悤�Ƃ��Ă��鐻�i�\���ɗL�����Ԃ̏d�����Ȃ������ׂ܂�
	 *
	 * @param  parentItemCd �������鐻�i�\���̐e�i�ڔԍ�
	 * @param  compItemCd �������鐻�i�\���̎q�i�ڔԍ�
	 * @param  psEdition �������鐻�i�\���̔Ő�
	 * @param  inDate ���i�\���L���J�n��
	 * @param  inDate ���i�\���L���J�n��
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 * @throws ParseException ���t�̌`���ϊ��Ɏ��s
	 * @throws FoundationException �������o�^�pSQL���̐����Ɏ��s
	 * @throws PsEffPhaseException �L�����Ԃɏd������
	 */
	public void testConflictEffPhase(String parentItemCd, String compItemCd, String psEdition,
			String inDate, String outDate)
			throws SQLException, ParseException, FoundationException, PsEffPhaseException
	{
		// �w�肳�ꂽ�e�i�ڂƎq�i�ڂ̐��i�\���̗L�����Ԃ̈ꗗ���擾
		// �������A�w�肳�ꂽ�\���i�ڔŐ��̂��̂����O
		List dateList = getEffPhaseListWoPse(parentItemCd, compItemCd, psEdition);
		// �w�肳�ꂽ�J�n���ƏI�����ƗL�����Ԃ̈ꗗ���d������
		testConflictEffPhaseSub(dateList, inDate, outDate);
	}

	/**
	 * ���i�\���ɕi�ڎ�z�敪�̖������Ȃ������ׂ܂�
	 *
	 * @param  parentItemCd �������鐻�i�\���̐e�i�ڔԍ�
	 * @param  compItemCd �������鐻�i�\���̎q�i�ڔԍ�
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 * @throws NoDataException �i�ڂ����݂��Ȃ�
	 * @throws PsMrpOdrTypException �i�ڎ�z�敪�ɖ�������
	 */
	public void testMrpOrderType(String parentItemCd, String compItemCd)
			throws SQLException, NoDataException, PsMrpOdrTypException
	{
		Integer parentType = null;	// �e�i�ڂ̕i�ڎ�z�敪
		Integer compType = null;	// �q�i�ڂ̕i�ڎ�z�敪
		// �e�i�ڂ̕i�ڎ�z�敪���擾
		parentType = getMrpOrderType(parentItemCd);
		// �q�i�ڂ̕i�ڎ�z�敪���擾
		compType = getMrpOrderType(compItemCd);
		if (parentType.intValue() == MRP_ODR_TYP_MANUAL
				|| parentType.intValue() == MRP_ODR_TYP_LOT_QTY
				|| parentType.intValue() == MRP_ODR_TYP_FIXED_QTY
				|| parentType.intValue() == MRP_ODR_TYP_ORDER_POINT)
		{
			// �e�i�ڂ��C�}�j���A����z�i�ځA�D���b�g��z�i�ځA�E��ʎ�z�i�ځA
			// �F�����_��z�i�ڂ̂����ꂩ�̏ꍇ
			if (compType.intValue() == MRP_ODR_TYP_ORDER_CD
					|| compType.intValue() == MRP_ODR_TYP_STOCK_ALLOC)
			{
				// �q�i�ڂ��@�ʕi�� �A�݌Ɉ����^�ʕi�ڂȂ�΁F
				// �i�ڎ�z�敪�ɖ�������
				throw new PsMrpOdrTypException(new ExpjMessage("ZZ01006",
						"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD:" + parentItemCd + "," + compItemCd));
			}
		}
		if (parentType.intValue() == MRP_ODR_TYP_PSEUDO_ITEM) {
			// �e�i�ڂ��G�[���i�ڂ̏ꍇ
			if (compType.intValue() == MRP_ODR_TYP_PSEUDO_ITEM) {
				// �q�i�ڂ��G�[���i�ڂȂ�΁F
				// �i�ڎ�z�敪�ɖ�������
				throw new PsMrpOdrTypException(new ExpjMessage("ZZ01006",
						"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD:" + parentItemCd + "," + compItemCd));
			}
			if (compType.intValue() == MRP_ODR_TYP_MANUAL
					|| compType.intValue() == MRP_ODR_TYP_LOT_QTY
					|| compType.intValue() == MRP_ODR_TYP_FIXED_QTY
					|| compType.intValue() == MRP_ODR_TYP_ORDER_POINT)
			{
				// �q�i�ڂ��C�}�j���A����z�i�ځA�D���b�g��z�i�ځA�E��ʎ�z�i�ځA
				// �F�����_��z�i�ڂ̂����ꂩ�Ȃ�΁F
				// �i�ڎ�z�敪�ɖ����Ȃ�
				return;
			}
			// ����ȊO(�@�ʕi�� �A�݌Ɉ����^�ʕi��)�Ȃ�΁F
			// �e�i�ڂ��q�i�ڂƂȂ鐻�i�\���̐e�i�ڂ��擾
			List psList = getParentPsList(parentItemCd);
			deleteDuplicateItemCd(psList);
			int listSize = psList.size();
			for (int i = 0; i < listSize; i++) {
				// �擾�����e�i�ڂ̕i�ڎ�z�敪�擾
				String[] workPs = (String[])psList.get(i);
				Integer type = getMrpOrderType(workPs[0]);
				if (type.intValue() == MRP_ODR_TYP_MANUAL
						|| type.intValue() == MRP_ODR_TYP_LOT_QTY
						|| type.intValue() == MRP_ODR_TYP_FIXED_QTY
						|| type.intValue() == MRP_ODR_TYP_ORDER_POINT)
				{
					// �e�i�ڂ��C�}�j���A����z�i�ځA�D���b�g��z�i�ځA
					// �E��ʎ�z�i�ځA�F�����_��z�i�ڂ̂����ꂩ�Ȃ�΁F
					// �i�ڎ�z�敪�ɖ�������
					throw new PsMrpOdrTypException(new ExpjMessage("ZZ01006",
							"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD:"
							+ parentItemCd + "," + compItemCd));
				}
			}
		}
		if (compType.intValue() == MRP_ODR_TYP_PSEUDO_ITEM) {
			// �q�i�ڂ��G�[���i�ڂ̏ꍇ
			if (parentType.intValue() == MRP_ODR_TYP_PSEUDO_ITEM) {
				// �e�i�ڂ��G�[���i�ڂȂ�΁F
				// �i�ڎ�z�敪�ɖ�������
				throw new PsMrpOdrTypException(new ExpjMessage("ZZ01006",
						"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD:" + parentItemCd + "," + compItemCd));
			}
			if (parentType.intValue() == MRP_ODR_TYP_ORDER_CD
					|| parentType.intValue() == MRP_ODR_TYP_STOCK_ALLOC)
			{
				// �e�i�ڂ��@�ʕi�� �A�݌Ɉ����^�ʕi�ڂ̂����ꂩ�Ȃ�΁F
				// �i�ڎ�z�敪�ɖ����Ȃ�
				return;
			}
			// ����ȊO(�C�}�j���A����z�i�ځA�D���b�g��z�i�ځA�E��ʎ�z�i�ځA
			// �F�����_��z�i��)�Ȃ�΁F
			// �q�i�ڂ��e�i�ڂƂȂ鐻�i�\���̎q�i�ڂ��擾
			List psList = getCompPsList(compItemCd);
			deleteDuplicateItemCd(psList);
			int listSize = psList.size();
			for (int i = 0; i < listSize; i++) {
				// �擾�����q�i�ڂ̕i�ڎ�z�敪�擾
				String[] workPs = (String[])psList.get(i);
				Integer type = getMrpOrderType(workPs[0]);
				if (type.intValue() == MRP_ODR_TYP_ORDER_CD
						|| type.intValue() == MRP_ODR_TYP_STOCK_ALLOC)
				{
					// �q�i�ڂ��@�ʕi�� �A�݌Ɉ����^�ʕi�ڂ̂����ꂩ�Ȃ�΁F
					// �i�ڎ�z�敪�ɖ�������
					throw new PsMrpOdrTypException(new ExpjMessage("ZZ01006",
							"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD:"
							+ parentItemCd + "," + compItemCd));
				}
			}
		}
		// �i�ڎ�z�敪�ɖ����Ȃ�
	}

// 2008/07/15 SYSCOM ���� ADD START
	/**
	 * �H���Ǘ��i�ڋ敪�̃`�F�b�N���s���܂��B
	 *
	 * @param  itemCd ��������e�ƂȂ�i�ڔԍ�
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 * @throws NoDataException �i�ڂ����݂��Ȃ�
	 * @throws PsManhourTypException �e�i�ڂ��H���Ǘ��i�ڂ������ꍇ
	 */
	public void testManhourTyp(String itemCd)
			throws SQLException, NoDataException, PsManhourTypException
	{
		Integer manhourTyp = null;	// �H���Ǘ��i�ڋ敪
		
		// �H���Ǘ��i�ڋ敪���擾
		manhourTyp = getManhourTyp(itemCd);

		if (manhourTyp.intValue() == MANHOUR_TYP_CTRL)
		{
			throw new PsManhourTypException(new ExpjMessage("ZZ01006",
					"M_ITEM.ITEM_CD:" + itemCd));
		}
		// �H���Ǘ��i�ڂł͂Ȃ�
	}
// 2008/07/15 SYSCOM ���� ADD END

	/**
	 * SQL��O�������̃G���[�����N���A���܂�
	 */
	public void clearErrorInfo()
	{
		_errorInfo = null;
	}

	/**
	 * SQL��O�������̃G���[����ԋp���܂�
	 *
	 * @return �G���[�̏��
	 */
	public ExpjMessage getErrorInfo()
	{
		if (_errorInfo == null) {
			return null;
		} else {
			return _errorInfo;
		}
	}

	/**
	 * PsMaintenance�I�u�W�F�N�g���\�z���܂�
	 *
	 * @param connection �R�l�N�V�����I�u�W�F�N�g
	 * @param userCode ���[�U�R�[�h
	 * @param programName �v���O������
	 * @param sysdate ��������
	 */
	public PsMaintenance(IDbConnection connection, String userCode, String programName,
			String sysdate)
	{
		_connection = connection.getConn();
		_userCode = userCode;
		_programName = programName;
		_sysdate = sysdate;
		clearErrorInfo();
	}
}