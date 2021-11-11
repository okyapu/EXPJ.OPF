/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/process/ItemStock.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */

package com.nec.jp.orteus.expj.pr.rcvissue.process;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;

import com.nec.jp.orteus.expj.pr.rcvissue.util.StringUtil;
import com.nec.jp.orteus.expj.pr.rcvissue.common.RcvIssueConst;
import com.nec.jp.orteus.expj.util.Calculate;

import java.math.BigDecimal;

/**
 * <pre>
 * �ۊǋ�ʕi�ڍ݌ɏ�񑀍�N���X
 * </pre>
 * @author $Author: chenjunhua268 $
 * @version $Revision: 1.5 $
 *
 **/

public class ItemStock implements RcvIssueConst{

	/** �R�l�N�V���� */
	private IDbConnection _conn = null;

	/**
	 * <pre>
	 * �R���X�g���N�^
	 * �w��̃R�l�N�V���������I�u�W�F�N�g���\�z����
	 * </pre>
	 * @param  connect �R�l�N�V������OPEN����Ă���IDbConnection
	 */
	public ItemStock(IDbConnection connect){
		_conn = connect;
	}

	//-------  ���J���\�b�h  -------------------------------
	/**
	 * <pre>
	 * <b>���ۊǋ�E�i�ڕʎ莝���݌ɐ��̎擾</b>
	 * �ۊǋ�ʕi�ڍ݌Ƀe�[�u���̓ǂݍ���
	 * </pre>
	 *
	 * @param  iItemCd �i�ڔԍ�
	 * @param  iWhCd �ۊǋ�R�[�h
	 * @param  iMode  �Ǎ����[�h(0:�r�����b�N�Ȃ� 1:�r�����b�N����) 
	 * @return BigDecimal �i�ڕʎ莝�݌ɐ� �Y�������񂪑��݂��Ȃ��ꍇ��NULL
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public BigDecimal getHandQty(String iItemCd, String iWhCd, int iMode)
		throws SQLException 	{
		
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;

		// �����`�F�b�N
		if( !StringUtil.Validate(iItemCd) || !StringUtil.Validate(iWhCd) ) {
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}

		/** [�ۊǋ�ʕi�ڍ݌�]�Ǎ��p SQL */
		String selectStr = 
			"SELECT"
			+" STOCK_ON_HAND_QTY "
			+"FROM"
			+" T_ITEM_STOCK "
			+"WHERE"
			+" ITEM_CD = ?"
			+" AND WH_CD = ?";
			
		if (iMode == 1) {
			selectStr = selectStr + " FOR UPDATE NOWAIT";
		} else {
			selectStr = selectStr + " AND STOCK_ON_HAND_QTY > 0";
		}
			
		try {
			selectStmt = _conn.getConn().prepareStatement(selectStr);

			selectStmt.setString(1, iItemCd);
			selectStmt.setString(2, iWhCd);

			selectRslt = selectStmt.executeQuery();

			// ����������0����������null��ԋp
			if(selectRslt.next()==false) return null;

			return selectRslt.getBigDecimal(1);

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}

	/**
	 * <pre>
	 * <b>���ۊǋ�E���b�g�ʎ莝���݌ɐ��̎擾</b>
	 * ���b�g�ʕi�ڍ݌Ƀe�[�u���̓ǂݍ���
	 * </pre>
	 *
	 * @param  iItemCd �i�ڔԍ�
	 * @param  iWhCd �ۊǋ�R�[�h
	 * @param  iWhCd �ۊǋ�R�[�h
	 * @param  iLotNo  �Ǎ����[�h(0:�r�����b�N�Ȃ� 1:�r�����b�N����) 
	 * @return BigDecimal �i�ڕʎ莝�݌ɐ� �Y�������񂪑��݂��Ȃ��ꍇ��NULL
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public BigDecimal getLotHandQty(String iItemCd, String iWhCd, String iLotNo, int iMode)
		throws SQLException 	{
		
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;

		// �����`�F�b�N
		if( !StringUtil.Validate(iItemCd) || !StringUtil.Validate(iWhCd) || !StringUtil.Validate(iLotNo)) {
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}

		/** [���b�g�ʕi�ڍ݌�]�Ǎ��p SQL */
		String selectStr = 
			"SELECT"
			+" STOCK_ON_HAND_QTY "
			+"FROM"
			+" T_LOT_STOCK "
			+"WHERE"
			+" ITEM_CD = ?"
			+" AND WH_CD = ?"
			+" AND LOT_NO = ?";
			
		if (iMode == 1) {
			selectStr = selectStr + " FOR UPDATE NOWAIT";
		} else {
			selectStr = selectStr + " AND STOCK_ON_HAND_QTY > 0";
		}
			
		try {
			selectStmt = _conn.getConn().prepareStatement(selectStr);

			selectStmt.setString(1, iItemCd);
			selectStmt.setString(2, iWhCd);
			selectStmt.setString(3, iLotNo);
			selectRslt = selectStmt.executeQuery();

			// ����������0����������null��ԋp
			if(selectRslt.next()==false) return null;

			return selectRslt.getBigDecimal(1);

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}
	
	/**
	 * <pre>
	 * <b>���ۊǋ�E�i�ڕʕs�ǐ��̎擾</b>
	 * �ۊǋ�ʕi�ڍ݌Ƀe�[�u���̓ǂݍ���
	 * </pre>
	 *
	 * @param  iItemCd �i�ڔԍ�
	 * @param  iWhCd �ۊǋ�R�[�h
	 * @param  iMode  �Ǎ����[�h(0:�r�����b�N�Ȃ� 1:�r�����b�N����) 
	 * @return BigDecimal �i�ڕʕs�ǐ� �Y�������񂪑��݂��Ȃ��ꍇ��NULL
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public BigDecimal getDefectQty(String iItemCd, String iWhCd, int iMode)
		throws SQLException 	{
		
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;

		// �����`�F�b�N
		if( !StringUtil.Validate(iItemCd) || !StringUtil.Validate(iWhCd) ) {
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}

		/** [�ۊǋ�ʕi�ڍ݌�]�Ǎ��p SQL */
		String selectStr = 
			"SELECT"
			+" DEFECT_QTY "
			+"FROM"
			+" T_ITEM_STOCK "
			+"WHERE"
			+" ITEM_CD = ?"
			+" AND WH_CD = ?";
			
		if (iMode == 1) {
			selectStr = selectStr + " FOR UPDATE NOWAIT";
		}
			
		try {
			selectStmt = _conn.getConn().prepareStatement(selectStr);

			selectStmt.setString(1, iItemCd);
			selectStmt.setString(2, iWhCd);

			selectRslt = selectStmt.executeQuery();

			// ����������0����������null��ԋp
			if(selectRslt.next()==false) return null;

			return selectRslt.getBigDecimal(1);

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}
	
	/**
	 * <pre>
	 * <b>���ۊǋ�E���b�g�ʕs�ǐ��̎擾</b>
	 * ���b�g�ʕi�ڍ݌Ƀe�[�u���̓ǂݍ���
	 * </pre>
	 *
	 * @param  iItemCd �i�ڔԍ�
	 * @param  iWhCd �ۊǋ�R�[�h
     * @param  iLotNo ���b�g�Ǘ��ԍ�
	 * @param  iMode  �Ǎ����[�h(0:�r�����b�N�Ȃ� 1:�r�����b�N����) 
	 * @return BigDecimal �i�ڕʕs�ǐ� �Y�������񂪑��݂��Ȃ��ꍇ��NULL
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public BigDecimal getLotDefectQty(String iItemCd, String iWhCd, String iLotNo, int iMode)
		throws SQLException 	{
		
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;

		// �����`�F�b�N
		if( !StringUtil.Validate(iItemCd) || !StringUtil.Validate(iWhCd) || !StringUtil.Validate(iLotNo)) {
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}

		/** [���b�g�ʕi�ڍ݌�]�Ǎ��p SQL */
		String selectStr = 
			"SELECT"
			+" DEFECT_QTY "
			+"FROM"
			+" T_LOT_STOCK "
			+"WHERE"
			+" ITEM_CD = ?"
			+" AND WH_CD = ?"
			+" AND LOT_NO = ?";
			
		if (iMode == 1) {
			selectStr = selectStr + " FOR UPDATE NOWAIT";
		}
			
		try {
			selectStmt = _conn.getConn().prepareStatement(selectStr);

			selectStmt.setString(1, iItemCd);
			selectStmt.setString(2, iWhCd);
			selectStmt.setString(3, iLotNo);

			selectRslt = selectStmt.executeQuery();

			// ����������0����������null��ԋp
			if(selectRslt.next()==false) return null;

			return selectRslt.getBigDecimal(1);

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}
	
	/**
	 * <pre>
	 * <b>���i�ڕʎ莝�݌ɍ��v���̎擾(���v�ʌv�Z�Ώەۊǋ�̂�)</b>
	 * �ۊǋ�ʕi�ڍ݌Ƀe�[�u���̓ǂݍ���
	 * </pre>
	 *
	 * @param  iItemCd �i�ڔԍ�
	 * @param  iPlantCd �H��R�[�h
	 * @return BigDecimal �i�ڕʎ莝�݌ɍ��v�� �Y�������񂪑��݂��Ȃ��ꍇ��NULL
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public BigDecimal getSumHandQty(String iItemCd, String iPlantCd)
		throws SQLException 	{
		
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;

		// �����`�F�b�N
		if( !StringUtil.Validate(iItemCd) || !StringUtil.Validate(iPlantCd) ){
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}

		/** [�ۊǋ�ʕi�ڍ݌�]�Ǎ��p SQL */
		String selectStr = 
			"SELECT"
			+" SUM(T_ITEM_STOCK.STOCK_ON_HAND_QTY) "
			+"FROM"
			+" T_ITEM_STOCK, "
			+" M_WH "
			+"WHERE"
			+" T_ITEM_STOCK.WH_CD = M_WH.WH_CD"
			+" AND T_ITEM_STOCK.ITEM_CD = ?"
			+" AND T_ITEM_STOCK.PLANT_CD = ?"
			+" AND M_WH.MRP_FLG = " + RcvIssueConst.MRP_TARGET;
			
		try {
			selectStmt = _conn.getConn().prepareStatement(selectStr);

			selectStmt.setString(1, iItemCd);
			selectStmt.setString(2, iPlantCd);

			selectRslt = selectStmt.executeQuery();

			// ����������0����������null��ԋp
			selectRslt.next();
			if(selectRslt.getBigDecimal(1)==null) return null;

			return selectRslt.getBigDecimal(1);

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}

	/**
	 * �ۊǋ�ʕi�ڍ݌Ƀe�[�u���̒ǉ�
	 *
	 * @param  struct �o�ɏ����f�[�^�N���X
	 * @return �X�V����������Ԃ�
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public int insertItemStock(IssueStruct struct) throws SQLException
	{
		PreparedStatement updateStmt = null;

		// �����`�F�b�N
		if( struct == null ){
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}

		/** [T_ITEM_STOCK](�s�Ǖi)insert�p��SQL */
		String _insertDefectItemStock = 
			"INSERT INTO T_ITEM_STOCK( "
			+"    DEFECT_QTY "
			+"   ,ITEM_CD "
			+"   ,WH_CD "
			+"   ,PLANT_CD "
			+"   ,CREATED_BY "
			+"   ,CREATED_PRG_NM "
			+"   ,UPDATED_BY "
			+"   ,UPDATED_PRG_NM) "
			+"values( TO_NUMBER(?) , ? , ? , ? , ? , ? , ? , ? ) ";

		/** [T_ITEM_STOCK](�Ǖi)insert�p��SQL */
		String _insertItemStock = 
			"INSERT INTO T_ITEM_STOCK( "
			+"    STOCK_ON_HAND_QTY "
			+"   ,ITEM_CD "
			+"   ,WH_CD "
			+"   ,PLANT_CD "
			+"   ,CREATED_BY "
			+"   ,CREATED_PRG_NM "
			+"   ,UPDATED_BY "
			+"   ,UPDATED_PRG_NM) "
			+"values( TO_NUMBER(?) , ? , ? , ? , ? , ? , ? , ? ) ";

				// �莝�݌ɐ����X�V
				updateStmt = _conn.getConn().prepareStatement(_insertItemStock);

		try {

			// �s�Ǎ݌ɍX�V�� �Ǖi�݌ɍX�V��
			if(struct.getRCV_ISSUE_TYP().intValue() == IssueStruct.ISSUE_RCV_TYP_DEF_ISSUE){
				// �s�Ǎ݌ɐ����X�V
				updateStmt = _conn.getConn().prepareStatement(_insertDefectItemStock);
			} else {
				// �莝�݌ɐ����X�V
				updateStmt = _conn.getConn().prepareStatement(_insertItemStock);
			}

			updateStmt.setString(1, (struct.getRCV_ISSUE_QTY()));
			updateStmt.setString(2, struct.getITEM_CD());
			updateStmt.setString(3, struct.getWH_CD());
			updateStmt.setString(4, struct.getPLANT_CD());
			updateStmt.setString(5, struct.getUPDATED_BY());
			updateStmt.setString(6, struct.getUPDATED_PRG_NM());
			updateStmt.setString(7, struct.getUPDATED_BY());
			updateStmt.setString(8, struct.getUPDATED_PRG_NM());

			return updateStmt.executeUpdate();

		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}

	// Add Start 20140220 liuj
	/**
	 * �s�Ǖi�ۊǋ�ʕi�ڍ݌Ƀe�[�u���̒ǉ�
	 *
	 * @param  struct �o�ɏ����f�[�^�N���X
	 * @return �X�V����������Ԃ�
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public int insertDefectItemStock(IssueStruct struct) throws SQLException
	{
		PreparedStatement updateStmt = null;

		// �����`�F�b�N
		if( struct == null ){
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}

		/** [T_ITEM_STOCK](�s�Ǖi)insert�p��SQL */
		String _insertDefectItemStock = 
			"INSERT INTO T_ITEM_STOCK( "
			+"    DEFECT_QTY "
			+"   ,ITEM_CD "
			+"   ,WH_CD "
			+"   ,PLANT_CD "
			+"   ,CREATED_BY "
			+"   ,CREATED_PRG_NM "
			+"   ,UPDATED_BY "
			+"   ,UPDATED_PRG_NM) "
			+"values( TO_NUMBER(?) , ? , ? , ? , ? , ? , ? , ? ) ";
		
		/** [T_ITEM_STOCK](�Ǖi)insert�p��SQL */
		String _insertItemStock = 
			"INSERT INTO T_ITEM_STOCK( "
			+"    STOCK_ON_HAND_QTY "
			+"   ,ITEM_CD "
			+"   ,WH_CD "
			+"   ,PLANT_CD "
			+"   ,CREATED_BY "
			+"   ,CREATED_PRG_NM "
			+"   ,UPDATED_BY "
			+"   ,UPDATED_PRG_NM) "
			+"values( TO_NUMBER(?) , ? , ? , ? , ? , ? , ? , ? ) ";
		
		// �莝�݌ɐ����X�V
		updateStmt = _conn.getConn().prepareStatement(_insertItemStock);

		try {

			// �s�Ǎ݌ɍX�V
			// �s�Ǎ݌ɐ����X�V
			updateStmt = _conn.getConn().prepareStatement(_insertDefectItemStock);

			updateStmt.setString(1, (struct.getRCV_ISSUE_QTY()));
			updateStmt.setString(2, struct.getITEM_CD());
			updateStmt.setString(3, struct.getWH_CD());
			updateStmt.setString(4, struct.getPLANT_CD());
			updateStmt.setString(5, struct.getUPDATED_BY());
			updateStmt.setString(6, struct.getUPDATED_PRG_NM());
			updateStmt.setString(7, struct.getUPDATED_BY());
			updateStmt.setString(8, struct.getUPDATED_PRG_NM());

			return updateStmt.executeUpdate();

		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	/**
	 * �Ǖi�ۊǋ�ʕi�ڍ݌Ƀe�[�u���̒ǉ�
	 *
	 * @param  struct �o�ɏ����f�[�^�N���X
	 * @return �X�V����������Ԃ�
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public int insertAcptItemStock(IssueStruct struct) throws SQLException
	{
		PreparedStatement updateStmt = null;

		// �����`�F�b�N
		if( struct == null ){
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}

		/** [T_ITEM_STOCK](�Ǖi)insert�p��SQL */
		String _insertItemStock = 
			"INSERT INTO T_ITEM_STOCK( "
			+"    STOCK_ON_HAND_QTY "
			+"   ,ITEM_CD "
			+"   ,WH_CD "
			+"   ,PLANT_CD "
			+"   ,CREATED_BY "
			+"   ,CREATED_PRG_NM "
			+"   ,UPDATED_BY "
			+"   ,UPDATED_PRG_NM) "
			+"values( TO_NUMBER(?) , ? , ? , ? , ? , ? , ? , ? ) ";

			// �莝�݌ɐ����X�V
			updateStmt = _conn.getConn().prepareStatement(_insertItemStock);

		try {

			// �s�Ǎ݌ɍX�V�� �Ǖi�݌ɍX�V��
			// �莝�݌ɐ����X�V
			updateStmt = _conn.getConn().prepareStatement(_insertItemStock);
			updateStmt.setString(1, (struct.getRCV_ISSUE_QTY()));
			updateStmt.setString(2, struct.getITEM_CD());
			updateStmt.setString(3, struct.getWH_CD());
			updateStmt.setString(4, struct.getPLANT_CD());
			updateStmt.setString(5, struct.getUPDATED_BY());
			updateStmt.setString(6, struct.getUPDATED_PRG_NM());
			updateStmt.setString(7, struct.getUPDATED_BY());
			updateStmt.setString(8, struct.getUPDATED_PRG_NM());

			return updateStmt.executeUpdate();

		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	/**
	 * �Ǖi�ۊǋ�ʕi�ڍ݌Ƀe�[�u���̍X�V
	 *
	 * @param  struct �o�ɏ����f�[�^�N���X
	 * @return �X�V����������Ԃ�
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public int updateAcptItemStock(IssueStruct struct) throws SQLException
	{
		PreparedStatement updateStmt = null;

		// �����`�F�b�N
		if( struct == null ){
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}

		/** [T_ITEM_STOCK](�Ǖi)update�p��SQL */
		String _updateItemStock = 
			"UPDATE T_ITEM_STOCK "
			+"SET STOCK_ON_HAND_QTY = TO_NUMBER(?) "
			+"   ,UPDATED_BY = ? "
			+"   ,UPDATED_PRG_NM = ? "
			+"   ,UPDATED_DATE = TO_DATE( ? ,'YYYY/MM/DD HH24:MI:SS') "
			+"   ,MODIFY_COUNT = MODIFY_COUNT + 1 "
			+"WHERE "
			+"    ITEM_CD = ? "
			+"AND WH_CD = ? "
			+"AND PLANT_CD = ?";
		
		try {

			// �Ǖi�݌ɍX�V
			updateStmt = _conn.getConn().prepareStatement(_updateItemStock);

			// �X�V�O��(�i�ڕʎ莝�݌ɐ�)
			String stockQty = struct.getSAVE_STOCK_QTY();
			// �X�V������o�ɐ�
			String rcvIssueQty = struct.getRCV_ISSUE_QTY();

			updateStmt.setString(1, Calculate.add(stockQty, rcvIssueQty));
			updateStmt.setString(2, struct.getUPDATED_BY());
			updateStmt.setString(3, struct.getUPDATED_PRG_NM());
			updateStmt.setString(4, struct.getSYSDATE());
			updateStmt.setString(5, struct.getITEM_CD());
			updateStmt.setString(6, struct.getWH_CD());
			updateStmt.setString(7, struct.getPLANT_CD());

			return updateStmt.executeUpdate();

		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	/**
	 * �s�Ǖi�ۊǋ�ʕi�ڍ݌Ƀe�[�u���̍X�V
	 *
	 * @param  struct �o�ɏ����f�[�^�N���X
	 * @return �X�V����������Ԃ�
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public int updateDefectItemStock(IssueStruct struct) throws SQLException
	{
		PreparedStatement updateStmt = null;

		// �����`�F�b�N
		if( struct == null ){
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}
		
		/** [T_ITEM_STOCK](�s�Ǖi)update�p��SQL */
		String _updateDefectItemStock = 
			"UPDATE T_ITEM_STOCK "
			+"SET DEFECT_QTY = TO_NUMBER(?) "
			+"   ,UPDATED_BY = ? "
			+"   ,UPDATED_PRG_NM = ? "
			+"   ,UPDATED_DATE = TO_DATE( ? ,'YYYY/MM/DD HH24:MI:SS') "
			+"   ,MODIFY_COUNT = MODIFY_COUNT + 1 "
			+"WHERE "
			+"    ITEM_CD = ? "
			+"AND WH_CD = ? "
			+"AND PLANT_CD = ?";
		
		try {

			// �s�Ǎ݌ɍX�V
			updateStmt = _conn.getConn().prepareStatement(_updateDefectItemStock);


			// �X�V�O��(�i�ڕʕs�ǐ�)
			String stockQty = struct.getSAVE_STOCK_QTY();
			// �X�V������o�ɐ�
			String rcvIssueQty = struct.getRCV_ISSUE_QTY();

			updateStmt.setString(1, Calculate.add(stockQty, rcvIssueQty));
			updateStmt.setString(2, struct.getUPDATED_BY());
			updateStmt.setString(3, struct.getUPDATED_PRG_NM());
			updateStmt.setString(4, struct.getSYSDATE());
			updateStmt.setString(5, struct.getITEM_CD());
			updateStmt.setString(6, struct.getWH_CD());
			updateStmt.setString(7, struct.getPLANT_CD());

			return updateStmt.executeUpdate();

		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	// Add End 20140220 liuj
	/**
	 * �ۊǋ�ʕi�ڍ݌Ƀe�[�u���̍X�V
	 *
	 * @param  struct �o�ɏ����f�[�^�N���X
	 * @return �X�V����������Ԃ�
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public int updateItemStock(IssueStruct struct) throws SQLException
	{
		PreparedStatement updateStmt = null;

		// �����`�F�b�N
		if( struct == null ){
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}
		
		/** [T_ITEM_STOCK](�s�Ǖi)update�p��SQL */
		String _updateDefectItemStock = 
			"UPDATE T_ITEM_STOCK "
			+"SET DEFECT_QTY = TO_NUMBER(?) "
			+"   ,UPDATED_BY = ? "
			+"   ,UPDATED_PRG_NM = ? "
			+"   ,UPDATED_DATE = TO_DATE( ? ,'YYYY/MM/DD HH24:MI:SS') "
			+"   ,MODIFY_COUNT = MODIFY_COUNT + 1 "
			+"WHERE "
			+"    ITEM_CD = ? "
			+"AND WH_CD = ? "
			+"AND PLANT_CD = ?";
		
		/** [T_ITEM_STOCK](�Ǖi)update�p��SQL */
		String _updateItemStock = 
			"UPDATE T_ITEM_STOCK "
			+"SET STOCK_ON_HAND_QTY = TO_NUMBER(?) "
			+"   ,UPDATED_BY = ? "
			+"   ,UPDATED_PRG_NM = ? "
			+"   ,UPDATED_DATE = TO_DATE( ? ,'YYYY/MM/DD HH24:MI:SS') "
			+"   ,MODIFY_COUNT = MODIFY_COUNT + 1 "
			+"WHERE "
			+"    ITEM_CD = ? "
			+"AND WH_CD = ? "
			+"AND PLANT_CD = ?";
		
		try {

			// �s�Ǎ݌ɍX�V�� �Ǖi�݌ɍX�V��
			if(struct.getRCV_ISSUE_TYP().intValue() == IssueStruct.ISSUE_RCV_TYP_DEF_ISSUE){
				updateStmt = _conn.getConn().prepareStatement(_updateDefectItemStock);
			} else {
				updateStmt = _conn.getConn().prepareStatement(_updateItemStock);
			}

			// �X�V�O��(�i�ڕʕs�ǐ� or �i�ڕʎ莝�݌ɐ�)
			String stockQty = struct.getSAVE_STOCK_QTY();
			// �X�V������o�ɐ�
			String rcvIssueQty = struct.getRCV_ISSUE_QTY();

			updateStmt.setString(1, Calculate.add(stockQty, rcvIssueQty));
			updateStmt.setString(2, struct.getUPDATED_BY());
			updateStmt.setString(3, struct.getUPDATED_PRG_NM());
			updateStmt.setString(4, struct.getSYSDATE());
			updateStmt.setString(5, struct.getITEM_CD());
			updateStmt.setString(6, struct.getWH_CD());
			updateStmt.setString(7, struct.getPLANT_CD());

			return updateStmt.executeUpdate();

		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}

	//-------  ����J���\�b�h  -------------------------------
	/**
	 * �v���y�A�h�X�e�[�g�����g�����
	 *
	 * @param statement ����Ώۂ̃X�e�[�g�����g
	 */
	private void closePreparedStatement(PreparedStatement statement)
	{
		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
			}
		}
	}
	
	/**
	 * ���U���g�Z�b�g�����
	 *
	 * @param resultset ����Ώۂ̃��U���g�Z�b�g
	 */
	private void closeResultSet(ResultSet resultset)
	{
		if (resultset != null) {
			try {
				resultset.close();
			} catch (SQLException e) {
			}
		}
	}
}
