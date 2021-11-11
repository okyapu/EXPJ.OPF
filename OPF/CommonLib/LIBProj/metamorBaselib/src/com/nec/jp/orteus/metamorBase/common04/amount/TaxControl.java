/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/amount/TaxControl.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common04.amount;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;

/**
 * ����ŏ��擾���i
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.7 $ $Date: 2014/02/20 14:46:18 $
 */
public class TaxControl {

	/** [�����]�f�[�^�擾�p��SQL */
	private static final String selectVendCtrlSql =
		"select "
			+ "  M_VEND_CTRL.ROUND_TYP as ROUND_TYP, "
			+ "  M_VEND_CTRL.TAX_APPLY_TYP as TAX_APPLY_TYP, "
			+ "  M_VEND_CTRL.TAX_CD as TAX_CD "
			+ "from "
			+ "  M_VEND_CTRL "
			+ "where "
			+ "  M_VEND_CTRL.COMPANY_CD = ? "
			+ "  and M_VEND_CTRL.VEND_CD = ? ";
	/** [�i��]�f�[�^�擾�p��SQL */
	private static final String selectItemSql =
		"select "
			+ "  M_ITEM.TAX_CD as TAX_CD "
			+ "from "
			+ "  M_ITEM "
			+ "where "
			+ "  M_ITEM.ITEM_CD = ? ";
	/** [�����]�f�[�^�擾�p��SQL */
	private static final String selectTaxSql =
		"select "
			+ "  M_TAX.OLD_TAX_RATE_1 as TAX_RATE_1, "
			+ "  M_TAX.OLD_TAX_RATE_2 as TAX_RATE_2, "
			+ "  M_TAX.OLD_TAX_RATE_3 as TAX_RATE_3, "
			+ "  M_TAX.ROUND_TYP as TAX_ROUND_TYP "
			+ "from "
			+ "  M_TAX "
			+ "where "
			+ "  M_TAX.TAX_CD = ? "
			+ "  and M_TAX.NEW_TAX_RATE_START_DATE > TO_DATE(?, 'YYYY/MM/DD') "
			+ "union all "
			+ "select "
			+ "  M_TAX.NEW_TAX_RATE_1 as TAX_RATE_1, "
			+ "  M_TAX.NEW_TAX_RATE_2 as TAX_RATE_2, "
			+ "  M_TAX.NEW_TAX_RATE_3 as TAX_RATE_3, "
			+ "  M_TAX.ROUND_TYP as TAX_ROUND_TYP "
			+ "from "
			+ "  M_TAX "
			+ "where "
			+ "  M_TAX.TAX_CD = ? "
			+ "  and M_TAX.NEW_TAX_RATE_START_DATE <= TO_DATE(?, 'YYYY/MM/DD') ";

	/**
	 * �ʉݏ��擾���i�̃f�t�H���g�R���X�g���N�^�ł��B
	 * ���̃N���X�� static ���\�b�h�݂̂ł���A
	 * ���I�A�N�Z�X�h�~�̂��� private �Ƃ��ăI�[�o�[���C�h���Ă��܂��B
	 */
	private TaxControl() {
	}

	/**
	 * ����ŏ����擾���܂��B
	 * @param conn �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param companyCd ��ЃR�[�h�i�K�{�j
	 * @param vendCd �����R�[�h�i�K�{�j
	 * @param itemCd �i�ڔԍ��i�K�{�j
	 * @param newTaxRateJudgeDate �V����ŗ�������i�K�{�j
	 * @return ����ŏ��f�[�^�N���X
	 * @throws IllegalArgumentException �K�{�p�����[�^�� null �܂��͋󕶎��̏ꍇ
	 * @throws SQLException �f�[�^�x�[�X�A�N�Z�X�G���[�����������ꍇ
	 * @throws DataNotFoundException �Y�����R�[�h�����݂��Ȃ��ꍇ
	 */
	public static TaxStruct getData(
		IDbConnection conn,
		String companyCd,
		String vendCd,
		String itemCd,
		String newTaxRateJudgeDate)
		throws SQLException, DataNotFoundException {

		// ��ЃR�[�h���s���ȏꍇ			
		if (companyCd == null || companyCd.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// �����R�[�h���s���ȏꍇ
		if (vendCd == null || vendCd.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// �V����ŗ���������s���ȏꍇ
		if (newTaxRateJudgeDate == null || newTaxRateJudgeDate.length() <= 0) {
			throw new IllegalArgumentException();
		}

		// ���\�b�h���^�[���p�f�[�^�N���X
		TaxStruct ts = new TaxStruct();

		// �����}�X�^������
		TaxStruct vendCtrlTs = selectVendCtrl(conn, companyCd, vendCd);

		// �i�ڔԍ���null�܂��́A[�����]."����œK�p�敪"���A
		// 1(�i��)�̏ꍇ�A[�i��]."����ŃR�[�h"���L�[�ɂ���
		// 2(�����)�̏ꍇ�A[�����R�[�h]."����ŃR�[�h"���L�[�ɂ���
		if (itemCd == null
			|| itemCd.length() <= 0
			|| "2".equals(vendCtrlTs.getTAX_APPLY_TYP())) {

			ts.setTAX_CD(vendCtrlTs.getTAX_CD());
		} else {

			// �i�ڃ}�X�^������
			TaxStruct itemTs = selectItem(conn, itemCd);
			ts.setTAX_CD(itemTs.getTAX_CD());
		}

		// ����ŋ敪�}�X�^������
		TaxStruct taxTs = selectTax(conn, ts.getTAX_CD(), newTaxRateJudgeDate);

		// �Œ[���敪��ݒ�
		ts.setTAX_APPLY_TYP(vendCtrlTs.getTAX_APPLY_TYP());
		ts.setTAX_RATE_1(taxTs.getTAX_RATE_1());
		ts.setTAX_RATE_2(taxTs.getTAX_RATE_2());
		ts.setTAX_RATE_3(taxTs.getTAX_RATE_3());
		ts.setTAX_ROUND_TYP(taxTs.getTAX_ROUND_TYP());

		return ts;
	}
//Add  Start 20131225 song-yy
	/**
	 * ����ŏ��TAX���擾���܂��B
	 * @param conn �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param companyCd ��ЃR�[�h�i�K�{�j
	 * @param vendCd �����R�[�h�i�K�{�j
	 * @param itemCd �i�ڔԍ��i�K�{�j
	 * @param newTaxRateJudgeDate �V����ŗ�������i�K�{�j
	 * @param taxCd ����ŃR�[�h�i�K�{�j
	 * @return ����ŏ��f�[�^�N���X
	 * @throws IllegalArgumentException �K�{�p�����[�^�� null �܂��͋󕶎��̏ꍇ
	 * @throws SQLException �f�[�^�x�[�X�A�N�Z�X�G���[�����������ꍇ
	 * @throws DataNotFoundException �Y�����R�[�h�����݂��Ȃ��ꍇ
	 */
	public static TaxStruct getDataTax(
		IDbConnection conn,
		String companyCd,
		String vendCd,
		String itemCd,
		String newTaxRateJudgeDate,
		String taxCd)
		throws SQLException, DataNotFoundException {

		// ��ЃR�[�h���s���ȏꍇ			
		if (companyCd == null || companyCd.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// �����R�[�h���s���ȏꍇ
		if (vendCd == null || vendCd.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// �V����ŗ���������s���ȏꍇ
		if (newTaxRateJudgeDate == null || newTaxRateJudgeDate.length() <= 0) {
			throw new IllegalArgumentException();
		}

		// ���\�b�h���^�[���p�f�[�^�N���X
		TaxStruct ts = new TaxStruct();
		
					// �����}�X�^������
		TaxStruct vendCtrlTs = selectVendCtrl(conn, companyCd, vendCd);
		
		//����ŃR�[�h�h���@Null�̏ꍇ
		if(taxCd == null || taxCd.length() <= 0){
			            
		    // �i�ڔԍ���null�܂��́A[�����]."����œK�p�敪"���A
		    // 1(�i��)�̏ꍇ�A[�i��]."����ŃR�[�h"���L�[�ɂ���
		    // 2(�����)�̏ꍇ�A[�����R�[�h]."����ŃR�[�h"���L�[�ɂ���
		    if (itemCd == null
		    	|| itemCd.length() <= 0
		    	|| "2".equals(vendCtrlTs.getTAX_APPLY_TYP())) {
            
		    	ts.setTAX_CD(vendCtrlTs.getTAX_CD());
		    } else {
            
		    	// �i�ڃ}�X�^������
		    	TaxStruct itemTs = selectItem(conn, itemCd);
		    	ts.setTAX_CD(itemTs.getTAX_CD());
		    }
    	}else{
    		//����ŃR�[�h�h��Null�̏ꍇ
    		ts.setTAX_CD(taxCd);
    	}
		

		// ����ŋ敪�}�X�^������
		TaxStruct taxTs = selectTax(conn, ts.getTAX_CD(), newTaxRateJudgeDate);

		// �Œ[���敪��ݒ�
		ts.setTAX_APPLY_TYP(vendCtrlTs.getTAX_APPLY_TYP());
		ts.setTAX_RATE_1(taxTs.getTAX_RATE_1());
		ts.setTAX_RATE_2(taxTs.getTAX_RATE_2());
		ts.setTAX_RATE_3(taxTs.getTAX_RATE_3());
		ts.setTAX_ROUND_TYP(taxTs.getTAX_ROUND_TYP());

		return ts;
	}
//Add  End   20131225 song-yy
//Add  Start 20140117 liu-j
	/**
	 * ����ŏ��TAX���擾���܂��B
	 * @param conn �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param newTaxRateJudgeDate �V����ŗ�������i�K�{�j
	 * @param taxCd ����ŃR�[�h�i�K�{�j
	 * @return ����ŏ��f�[�^�N���X
	 * @throws IllegalArgumentException �K�{�p�����[�^�� null �܂��͋󕶎��̏ꍇ
	 * @throws SQLException �f�[�^�x�[�X�A�N�Z�X�G���[�����������ꍇ
	 * @throws DataNotFoundException �Y�����R�[�h�����݂��Ȃ��ꍇ
	 */
	public static TaxStruct getDataTax(
		IDbConnection conn,
		String newTaxRateJudgeDate,
		String taxCd)
		throws SQLException, DataNotFoundException {

		// �V����ŗ���������s���ȏꍇ
		if (newTaxRateJudgeDate == null || newTaxRateJudgeDate.length() <= 0) {
			throw new IllegalArgumentException();
		}
      
      // ����ŃR�[�h���s���ȏꍇ
		if (taxCd == null || taxCd.length() <= 0) {
			throw new IllegalArgumentException();
		}

		// ���\�b�h���^�[���p�f�[�^�N���X
		TaxStruct ts = new TaxStruct();

		// ����ŋ敪�}�X�^������
		TaxStruct taxTs = selectTax(conn, taxCd, newTaxRateJudgeDate);

		// �Œ[���敪��ݒ�
		ts.setTAX_RATE_1(taxTs.getTAX_RATE_1());
		ts.setTAX_RATE_2(taxTs.getTAX_RATE_2());
		ts.setTAX_RATE_3(taxTs.getTAX_RATE_3());
		ts.setTAX_ROUND_TYP(taxTs.getTAX_ROUND_TYP());

		return ts;
	}
//Add  End 20140117 liu-j
	/**
	 * [�����]����
	 * @param conn �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param companyCd ��ЃR�[�h
	 * @param vendCd �����R�[�h
	 * @return �P�����f�[�^�N���X
	 * @throws SQLException �f�[�^�x�[�X�A�N�Z�X�G���[�����������ꍇ
	 * @throws DataNotFoundException �Y�����R�[�h�����݂��Ȃ��ꍇ
	 */
	private static TaxStruct selectVendCtrl(
		IDbConnection conn,
		String companyCd,
		String vendCd)
		throws SQLException, DataNotFoundException {

		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.getConn().prepareStatement(selectVendCtrlSql);
			ps.setString(1, companyCd);
			ps.setString(2, vendCd);
			rs = ps.executeQuery();

			if (!rs.next()) {
				throw new DataNotFoundException("ZZ02021");
			}

			TaxStruct ts = new TaxStruct();
			ts.setTAX_CD(rs.getString("TAX_CD"));
			ts.setTAX_APPLY_TYP(rs.getString("TAX_APPLY_TYP"));

			return ts;
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
		}
	}

	/**
	 * [�i��]����
	 * @param conn �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param itemCd �i�ڔԍ�
	 * @return ����ŏ��f�[�^�N���X
	 * @throws SQLException �f�[�^�x�[�X�A�N�Z�X�G���[�����������ꍇ
	 * @throws DataNotFoundException �Y�����R�[�h�����݂��Ȃ��ꍇ
	 */
	private static TaxStruct selectItem(IDbConnection conn, String itemCd)
		throws SQLException, DataNotFoundException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.getConn().prepareStatement(selectItemSql);
			ps.setString(1, itemCd);
			rs = ps.executeQuery();

			if (!rs.next()) {
				throw new DataNotFoundException("ZZ02025");
			}

			TaxStruct ts = new TaxStruct();
			ts.setTAX_CD(rs.getString("TAX_CD"));

			return ts;
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
		}
	}

	/**
	 * [����ŋ敪]����
	 * @param conn �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param taxCd ����ŃR�[�h
	 * @param newTaxRateStartDate �V����ŃR�[�h�J�n��
	 * @return ����ŏ��f�[�^�N���X
	 * @throws SQLException �f�[�^�x�[�X�A�N�Z�X�G���[�����������ꍇ
	 * @throws DataNotFoundException �Y�����R�[�h�����݂��Ȃ��ꍇ
	 */
	private static TaxStruct selectTax(
		IDbConnection conn,
		String taxCd,
		String newTaxRateStartDate)
		throws SQLException, DataNotFoundException {

		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.getConn().prepareStatement(selectTaxSql);
			ps.setString(1, taxCd);
			ps.setString(2, newTaxRateStartDate);
			ps.setString(3, taxCd);
			ps.setString(4, newTaxRateStartDate);
			rs = ps.executeQuery();

			if (!rs.next()) {
				throw new DataNotFoundException("ZZ02026");
			}

			TaxStruct ts = new TaxStruct();
			ts.setTAX_RATE_1(rs.getString("TAX_RATE_1"));
			ts.setTAX_RATE_2(rs.getString("TAX_RATE_2"));
			ts.setTAX_RATE_3(rs.getString("TAX_RATE_3"));
			ts.setTAX_ROUND_TYP(rs.getString("TAX_ROUND_TYP"));

			return ts;
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
		}
	}
}
