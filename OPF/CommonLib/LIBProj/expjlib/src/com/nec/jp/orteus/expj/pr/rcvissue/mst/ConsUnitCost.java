/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/mst/ConsUnitCost.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */

package com.nec.jp.orteus.expj.pr.rcvissue.mst;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.math.BigDecimal;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;

import com.nec.jp.orteus.expj.pr.rcvissue.util.StringUtil;

/**
 * <pre>
 * �x���P�����擾�N���X
 * �x���P���ɓo�^���Ă�������擾���邱�Ƃ��ł��܂��B
 * </pre>
 * @author $Author: wang-derui $
 * @version $Revision: 1.4 $ $Date: 2008/03/26 07:27:59 $
 *
 **/

public class ConsUnitCost{

	/* �����o�ϐ� */
	private IDbConnection _conn;							// IDbConnection
	private BigDecimal _unitCost =  new BigDecimal(0.00);	// �P��
	private int _unitCostTyp;								// �P���敪
	private int _onerousFlg;								// �L���t���O
	private boolean _newFlg;								// PreparedStatement�I�u�W�F�N�g�����t���O
	PreparedStatement _ps;

	/**
	 * �R���X�g���N�^
	 * @param iConnect �R�l�N�V������OPEN����Ă���IDbConnection
	 */
	public ConsUnitCost(IDbConnection iConnect){
		_conn = iConnect;
		_newFlg = false;
	}

	//-------  ���J���\�b�h  -------------------------------
	/**
	 * <pre>
	 * <b>���w�肳�ꂽ�x���P���̏����擾���܂��B</b>
	 * ��ЃR�[�h�A�����R�[�h�A�H��R�[�h�A�i�ڔԍ��A�x���P���L���J�n��������
	 * �x���P���L���J�n���ōő�l�̎x���P�������擾����B
	 * </pre>
	 * @param iCompanyCd ��ЃR�[�h
	 * @param iVendCd �����R�[�h
	 * @param iPlantCd �H��R�[�h
	 * @param iItemCd �i�ڔԍ�
	 * @param iEffPhaseInDate �x���P���L���J�n��
	 * @return true/false �Y�������񂪑��݂��Ȃ��ꍇ��false
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public boolean read(String iCompanyCd, String iVendCd, String iPlantCd,
						String iItemCd, String iEffPhaseInDate) throws SQLException {

		ResultSet rs = null;

		// �����`�F�b�N
		if (!StringUtil.Validate(iCompanyCd) || !StringUtil.Validate(iVendCd) || !StringUtil.Validate(iPlantCd)
				|| !StringUtil.Validate(iItemCd) || !StringUtil.Validate(iEffPhaseInDate)) {
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}

		Connection conn = _conn.getConn();

		// [�x���P��]�̓Ǎ��pSQL
		final String sql = "SELECT" + " UNIT_COST," + " UNIT_COST_TYP,"
				+ " ONEROUS_FLG " + "FROM" + " M_CONS_UNIT_COST " + "WHERE"
				+ " COMPANY_CD = ?" + " AND VEND_CD = ?" + " AND PLANT_CD = ?"
				+ " AND ITEM_CD = ?"
				+ " AND EFF_PHASE_IN_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
				+ "ORDER BY EFF_PHASE_IN_DATE DESC";
		try {
			// �f�[�^�Ǎ���SQL�쐬�E���s
			if (!_newFlg) {
				_ps = conn.prepareStatement(sql);
				_newFlg = true;
			}
			_ps.setString(1, iCompanyCd);
			_ps.setString(2, iVendCd);
			_ps.setString(3, iPlantCd);
			_ps.setString(4, iItemCd);
			_ps.setString(5, iEffPhaseInDate);
			rs = _ps.executeQuery();
			if (!rs.next()) {
				return false;
			} // �Y���f�[�^�Ȃ�

			// �����o�ϐ��̃N���A
			initialize();

			// ���ʂ�ݒ�
			int n = 1;
			_unitCost = rs.getBigDecimal(n);
			n++;
			_unitCostTyp = rs.getInt(n);
			n++;
			_onerousFlg = rs.getInt(n);

			return true;
		} catch (SQLException e) {
			throw e;
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rs = null;
			}
		}
	}

	/**
	 * <pre>
	 *  �P�����擾����B
	 *  ���f�[�^���擾����ɂ͐��&lt;b&gt;read&lt;/b&gt;���\�b�h���s���Ă��������B
	 * </pre>
	 * 
	 * @return �P��<br>
	 *         �Y������f�[�^�����݂��Ȃ��ꍇ��0
	 */
	public BigDecimal getUnitCost(){
		return _unitCost;
	}

	/**
	 * <pre>
	 * �P���敪���擾����B
	 * ���f�[�^���擾����ɂ͐��<b>read</b>���\�b�h���s���Ă��������B
	 * </pre>
	 * @return �P���敪<br>�Y������f�[�^�����݂��Ȃ��ꍇ��0
	 */
	public int getUnitCostTyp(){
		return _unitCostTyp;
	}

	/**
	 * <pre>
	 * �L���t���O���擾����B
	 * ���f�[�^���擾����ɂ͐��<b>read</b>���\�b�h���s���Ă��������B
	 * </pre>
	 * @return �L���t���O<br>�Y������f�[�^�����݂��Ȃ��ꍇ��0
	 */
	public int getOnerousFlg(){
		return _onerousFlg;
	}

	//-------  ����J���\�b�h  -------------------------------
	/**
	 * �����o�ϐ��̏�����
	 */
	private void initialize()
	{
		_unitCost = new BigDecimal(0.00);
		_unitCostTyp = 0;
		_onerousFlg = 0;
	}

	/**
	 * �C���X�^���X�j�󎞂ɍs������
	 */
	public void finalize() throws Throwable {
		_ps.close();
	}
}
