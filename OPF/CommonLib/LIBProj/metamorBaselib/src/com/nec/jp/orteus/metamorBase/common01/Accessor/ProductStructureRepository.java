//------------------------------------------------------------------------------
// (#)ProductStructureRepository.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/06/09 �V�K�쐬 K.Matsumoto
// 2003/06/16 �p�b�P�[�W���C�� K.Matsumoto
//            �O�Fcom.nec.jp.orteus.metamorBase.util.ProductStructureRepository
//            ��Fcom.nec.jp.orteus.metamorBase.util.common
// 2003/06/24 OrteusStudio�o�[�W�����A�b�v�ɔ����C�� Y.Inada
//            �O�FdoConnection[ver1.00.03]
//            ��FIDbConnection[ver1.00.05]
// 2003/06/25 Copyright�̋L�q�C�� Y.Inada
//            �O�FCopyright (c) 2003 NEC informatec Systems,Ltd.
//            ��FCopyright (c) 2003 NEC Informatec Systems,Ltd.
//            JavaDoc�p�R�����g�̑̍ق𐮂���
// 2003/08/08 �p�b�P�[�W���ύX M.Isoda
//            �O�Fcom.nec.jp.orteus.metamorBase.util.common
//            ��Fcom.nec.jp.orteus.metamorBase.common01.Accessor
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.Accessor;

import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;

/**
 * ���i�\����W�J���邽�߂̃��[�e�B���e�B�N���X�B
 *
 * @author  M.Sakamoto
 * @version 1.00
 */
public class ProductStructureRepository
{
	/**
	 * �W�J(���W�J)�B
	 * @param  itemCd ��i�ڔԍ�
	 * @return �i�ڔԍ��ꗗ
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 */
	public ArrayList orderDeployment(String itemCd) throws SQLException
	{
		return deploymentOnly(itemCd, _sqlOrderDeployment);
	}

	/**
	 * �W�J(���W�J) ���t�w�肠��B
	 * @param  itemCd ��i�ڔԍ�
	 * @param  targetDate �w����t
	 * @return �i�ڔԍ��ꗗ
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 */
	public ArrayList orderDeployment(String itemCd, Date targetDate) throws SQLException
	{
		if(null == targetDate)
			return orderDeployment(itemCd);
		else
			return deploymentOnlyDate(itemCd, targetDate, _sqlOrderDeploymentDate);
	}

	/**
	 * �W�J(�t�W�J)�B
	 * @param  itemCd ��i�ڔԍ�
	 * @return �i�ڔԍ��ꗗ
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 */
	public ArrayList reverseDeployment(String itemCd) throws SQLException
	{
		return deploymentOnly(itemCd, _sqlReverseDeployment);
	}

	/**
	 * �W�J(�t�W�J) ���t�w�肠��B
	 * @param  itemCd ��i�ڔԍ�
	 * @param  targetDate �w����t
	 * @return �i�ڔԍ��ꗗ
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 */
	public ArrayList reverseDeployment(String itemCd, Date targetDate) throws SQLException
	{
		if(null == targetDate)
			return reverseDeployment(itemCd);
		else
			return deploymentOnlyDate(itemCd, targetDate, _sqlReverseDeploymentDate);
	}

	/**
	 * �W�J���s:���t�w��Ȃ�(�P�̓W�J)�B
	 * @param  itemCd ��i�ڔԍ�
	 * @param  sql SQL��
	 * @return �i�ڔԍ��ꗗ
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 */
	private ArrayList deploymentOnly(String itemCd, String sql) throws SQLException
	{
		ArrayList list = null;
		PreparedStatement stmt = null;
		try {
			// �W�J����
			stmt = (_connection.getConn()).prepareStatement(sql);
			stmt.setString(1, itemCd);
			list = executeQueryOnly(stmt);
		} finally {
			if(null != stmt) stmt.close();
		}
		return list;
	}

	/**
	 * �W�J:���t�w�肠��(�P�̓W�J)�B
	 * @param  itemCd ��i�ڔԍ�
	 * @param  targetDate �w����t
	 * @param  sql SQL��
	 * @return �i�ڔԍ��ꗗ
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 */
	private ArrayList deploymentOnlyDate(
			String itemCd, Date targetDate, String sql) throws SQLException
	{
		ArrayList list = null;
		PreparedStatement stmt = null;
		try {
			// �W�J����
			SimpleDateFormat formatter = new SimpleDateFormat(_dateFormat);
			stmt = (_connection.getConn()).prepareStatement(sql);
			stmt.setString(1, itemCd);
			stmt.setString(2, formatter.format(targetDate));
			stmt.setString(3, formatter.format(targetDate));
			list = executeQueryOnly(stmt);
		} finally {
			if(null != stmt) stmt.close();
		}
		return list;
	}

	/**
	 * SQL���s(�P�̓W�J)�B
	 * @param  stmt SQL�\�z�ς݂�PreparedStatement
	 * @return �i�ڔԍ��ꗗ
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 */
	private ArrayList executeQueryOnly(PreparedStatement stmt) throws SQLException
	{
		ArrayList list = new ArrayList(0);
		ResultSet result = null;
		try {
			// SQL���s
			result = stmt.executeQuery();

			// �W�J
			while(true == result.next()) {
				String value = new String(result.getString(1));
				list.add(value);
			}
		} finally {
			if(null != result) result.close();
		}
		return list;
	}

	/**
	 * �\�z�B
	 * @param connection �R�l�N�V�����I�u�W�F�N�g
	 */
	public ProductStructureRepository(IDbConnection connection)
	{
		_connection = connection;
	}


	/** SQL��`�B ���W�J�擾�p */
	private final String _sqlOrderDeployment =
		  "select M_PS.\"COMP_ITEM_CD\" as \"ITEM_CD\" "
		+ "from M_PS "
		+ "where M_PS.\"PARENT_ITEM_CD\" = ? "
		+ "order by M_PS.\"PS_REF_NO\", M_PS.\"COMP_ITEM_CD\"";

	/**  SQL��`�B ���W�J�擾�p(���t����) */
	private final String _sqlOrderDeploymentDate =
		  "select M_PS.\"COMP_ITEM_CD\" as \"ITEM_CD\" "
		+ "from M_PS "
		+ "where M_PS.\"PARENT_ITEM_CD\" = ? "
		+ "and TO_CHAR(M_PS.\"EFF_PHASE_IN_DATE\", 'YYYYMMDD') <= ? "
		+ "and ? <= TO_CHAR(M_PS.\"EFF_PHASE_OUT_DATE\", 'YYYYMMDD') "
		+ "order by M_PS.\"PS_REF_NO\", M_PS.\"COMP_ITEM_CD\"";

	/**  SQL��`�B �t�W�J�擾�p */
	private final String _sqlReverseDeployment =
		  "select M_PS.\"PARENT_ITEM_CD\" as \"ITEM_CD\" "
		+ "from M_PS "
		+ "where M_PS.\"COMP_ITEM_CD\" = ? "
		+ "order by M_PS.\"PS_REF_NO\", M_PS.\"PARENT_ITEM_CD\"";

	/**  SQL��`�B �t�W�J�擾�p(���t����) */
	private final String _sqlReverseDeploymentDate =
		  "select M_PS.\"PARENT_ITEM_CD\" as \"ITEM_CD\" "
		+ "from M_PS "
		+ "where M_PS.\"COMP_ITEM_CD\" = ? "
		+ "and TO_CHAR(M_PS.\"EFF_PHASE_IN_DATE\", 'YYYYMMDD') <= ? "
		+ "and ? <= TO_CHAR(M_PS.\"EFF_PHASE_OUT_DATE\", 'YYYYMMDD') "
		+ "order by M_PS.\"PS_REF_NO\", M_PS.\"PARENT_ITEM_CD\"";

	/** ���t�w����s���ꍇ�̗L���t�H�[�}�b�g�B */
	private final String _dateFormat = "yyyyMMdd";

	/** �R�l�N�V�����I�u�W�F�N�g�B */
	private IDbConnection _connection = null;
}
