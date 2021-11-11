/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/process/IssueDBAccessor.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */

package com.nec.jp.orteus.expj.pr.rcvissue.process;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.wa.DataObject;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import com.nec.jp.orteus.expj.util.Calculate;

/**
 * <B>IssueDBAccessor</B><BR>
 * �o�ɏ����p��DB�A�N�Z�b�T<BR>
 * <BR>
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.7 $
 */
public class IssueDBAccessor extends DataObject
{
	/**
	 * �R���X�g���N�^
	 */
	public IssueDBAccessor(){}

	/**
	 * �w��̃R�l�N�V���������I�u�W�F�N�g���\�z����
	 *
	 * @param  connect �R�l�N�V������OPEN����Ă���IDbConnection
	 */
	public IssueDBAccessor(IDbConnection connect){_conn = connect;}


	/**
	 * �R�l�N�V�����ݒ�<BR>
	 * �R�l�N�V�����̎Q�Ƃ𖳌��ɂ���ꍇ�A������null��ݒ肷�邱��
	 *
	 * @param  connect �R�l�N�V������OPEN����Ă���IDbConnection
	 */
	public void setConnection(IDbConnection connect){_conn = connect;}

	/**
	 * �ۊǋ�ʓ��o�Ƀe�[�u���̓ǂݍ���
	 *
	 * @param  String ���o�ɊǗ��ԍ�
	 * @return struct �o�ɏ����f�[�^�N���X
	 * @throws SQLException
	 *		   SQL�̔��s�Ɏ��s�����ꍇ
	 */
	public IssueStruct selectRcvIssue(String _rcvIssueCtrlCd) throws SQLException
	{
		PreparedStatement selectStmt = null;	// select
		ResultSet selectRslt = null;			// ���ʂ̃Z�b�g

		/** [T_RCV_ISSUE]�Ǎ��p��SQL */
		String _selectRcvIssue = 
			 "SELECT"
			+" T_RCV_ISSUE.RCV_ISSUE_CTRL_CD,"
			+" T_RCV_ISSUE.RCV_ISSUE_TYP,"
			+" T_RCV_ISSUE.ITEM_CD,"
			+" T_RCV_ISSUE.PLANT_CD,"
			+" T_RCV_ISSUE.WH_CD,"
			+" T_RCV_ISSUE.JOB_ODR_CD,"
			+" T_RCV_ISSUE.JOB_ODR_DETAIL_NO,"
			+" T_RCV_ISSUE.PUCH_ODR_CD,"
			+" T_RCV_ISSUE.WORK_ODR_CD,"
			+" T_RCV_ISSUE.ISSUE_INST_CD,"
			+" TO_CHAR(T_RCV_ISSUE.RCV_ISSUE_QTY, 'FM999999999999999990.0999'),"
			+" TO_CHAR(T_RCV_ISSUE.RCV_ISSUE_DATE,'YYYY/MM/DD'),"
			+" T_RCV_ISSUE.STOCK_UPD_TYP,"
			+" T_RCV_ISSUE.RCV_ISSUE_GNR_TYP,"
			+" T_RCV_ISSUE.RCV_ISSUE_CMPLT_FLG,"
			+" T_RCV_ISSUE.OD_NO,"
			+" T_RCV_ISSUE.LOT_NO,"
			+" T_RCV_ISSUE.UPDATED_BY,"
			+" T_RCV_ISSUE.UPDATED_PRG_NM, "
			+" M_ITEM.LOT_CTRL_FLG "
			+"FROM"
			+" T_RCV_ISSUE, "
			+" M_ITEM "
			+"WHERE "
			+" M_ITEM.ITEM_CD = T_RCV_ISSUE.ITEM_CD"
			+" AND T_RCV_ISSUE.RCV_ISSUE_CTRL_CD = ? "
			+"FOR UPDATE NOWAIT";

		try {
			selectStmt = _conn.getConn().prepareStatement(_selectRcvIssue);
			selectStmt.setString(1, _rcvIssueCtrlCd);

			selectRslt = selectStmt.executeQuery();

			// ����������0����������null��ԋp
			if(selectRslt.next()==false) return null;

			IssueStruct struct = new IssueStruct();

			struct.setRCV_ISSUE_CTRL_CD( getString(1, selectRslt) );
			struct.setRCV_ISSUE_TYP( getInteger(2, selectRslt) );
			struct.setITEM_CD( getString(3, selectRslt) );
			struct.setPLANT_CD( getString(4, selectRslt) );
			struct.setWH_CD( getString(5, selectRslt) );
			struct.setJOB_ODR_CD( getString(6, selectRslt) );
			struct.setJOB_ODR_DETAIL_NO( getString(7, selectRslt) );
			struct.setPUCH_ODR_CD( getString(8, selectRslt) );
			struct.setWORK_ODR_CD( getString(9, selectRslt) );
			struct.setISSUE_INST_CD( getString(10, selectRslt) );
			struct.setRCV_ISSUE_QTY( getString(11, selectRslt) );
			struct.setRCV_ISSUE_DATE( getString(12, selectRslt) );
			struct.setSTOCK_UPD_TYP( getInteger(13, selectRslt) );
			struct.setRCV_ISSUE_GNR_TYP( getInteger(14, selectRslt) );
			struct.setRCV_ISSUE_CMPLT_FLG( getInteger(15, selectRslt) );
			struct.setOD_NO( getString(16, selectRslt) );
			struct.setLOT_NO( getString(17, selectRslt) );
			struct.setUPDATED_BY( getString(18, selectRslt) );
			struct.setUPDATED_PRG_NM( getString(19, selectRslt) );
			struct.setLOT_CTRL_FLG( getInteger(20, selectRslt));
			
			return struct;

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}

	/**
	 * ���Ԉ����e�[�u���̓ǂݍ���
	 *
	 * @param  struct �o�ɏ����f�[�^�N���X
	 * @return struct �o�ɏ����f�[�^�N���X
	 * @throws SQLException
	 *		   SQL�̔��s�Ɏ��s�����ꍇ
	 */
	public IssueStruct selectJobOdrAlc(IssueStruct struct) throws SQLException
	{
		PreparedStatement selectStmt = null;	// select
		ResultSet selectRslt = null;			// ����

		try {
			// ���Ԃ�Null�̂Ƃ� �i�ڂ̃��R�[�h������
			if(struct.getJOB_ODR_CD() == null)
			{
				/** [���Ԉ���](�i��)�o�ɍϐ��E�����ϐ� �Z�o�p SQL */
				String _selectJobOdrAlcItem = 
					"SELECT "
					+" JOB_ODR_ALC_CD,"
					+" TO_CHAR(ALCD_QTY, 'FM999999999999999990.0999'),"
					+" TO_CHAR(ISSUEED_QTY, 'FM999999999999999990.0999') "
					+"FROM"
					+" T_JOB_ODR_ALC "
					+"WHERE"
					+" OD_NO = ?"
					+" AND ITEM_CD = ?"
					+" AND ALC_STOCK_TYP = ?"
					+" AND PLANT_CD = ? "
					+"FOR UPDATE NOWAIT";

				selectStmt = _conn.getConn().prepareStatement(_selectJobOdrAlcItem);

				selectStmt.setString(1, struct.getOD_NO());
				selectStmt.setString(2, struct.getITEM_CD());
				selectStmt.setInt(3, IssueStruct.ALC_STOCK_TYP_ITEM);
				selectStmt.setString(4, struct.getPLANT_CD());
			}else{
				/** [���Ԉ���](����)�o�ɍϐ��E�����ϐ� �Z�o�p SQL */
				String _selectJobOdrAlcJob = 
					"SELECT"
					+" JOB_ODR_ALC_CD,"
					+" TO_CHAR(ALCD_QTY, 'FM999999999999999990.0999'),"
					+" TO_CHAR(ISSUEED_QTY, 'FM999999999999999990.0999') "
					+"FROM"
					+" T_JOB_ODR_ALC "
					+"WHERE"
					+" OD_NO = ?"
					+" AND ITEM_CD = ?"
					+" AND JOB_ODR_CD = ?"
					+" AND ALC_STOCK_TYP = ?"
					+" AND PLANT_CD = ? "
					+"FOR UPDATE NOWAIT";

				// ���Ԃ̃��R�[�h������
				selectStmt = _conn.getConn().prepareStatement(_selectJobOdrAlcJob);

				selectStmt.setString(1, struct.getOD_NO());
				selectStmt.setString(2, struct.getITEM_CD());
				selectStmt.setString(3, struct.getJOB_ODR_CD());
				selectStmt.setInt(4, IssueStruct.ALC_STOCK_TYP_JOB);
				selectStmt.setString(5, struct.getPLANT_CD());
			}

			selectRslt = selectStmt.executeQuery();

			// ����������0����������null��ԋp
			if(selectRslt.next()==false) return null;

			IssueStruct rtnStruct = new IssueStruct(struct);

			rtnStruct.setJOB_ODR_ALC_CD( getString(1, selectRslt) );
			rtnStruct.setALCD_QTY( getString(2, selectRslt) );
			rtnStruct.setISSUEED_QTY( getString(3, selectRslt) );

			return rtnStruct;

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}

	/**
	 * �o�Ɏw���e�[�u���̓ǂݍ���
	 *
	 * @param  struct �o�ɏ����f�[�^�N���X
	 * @return struct �o�ɏ����f�[�^�N���X
	 * @throws SQLException
	 *		   SQL�̔��s�Ɏ��s�����ꍇ
	 */
	public IssueStruct selectIssueInst(IssueStruct struct) throws SQLException
	{
		PreparedStatement selectStmt = null;	// select
		ResultSet selectRslt = null;			// ����

		/** [�o�Ɏw��]�s���b�N�p SQL */
		String _selectIssueInst = 
			"SELECT"
			+" ISSUE_INST_CD "
			+"FROM"
			+" T_ISSUE_INST "
			+"WHERE"
			+" ISSUE_INST_CD = ? "
			+"FOR UPDATE NOWAIT";

		try {
			selectStmt = _conn.getConn().prepareStatement(_selectIssueInst);

			selectStmt.setString(1, struct.getISSUE_INST_CD());

			selectRslt = selectStmt.executeQuery();

			// ����������0����������null��ԋp
			if(selectRslt.next()==false) return null;

			IssueStruct rtnStruct = new IssueStruct(struct);

			rtnStruct.setISSUE_INST_CD( getString(1, selectRslt) );

			return rtnStruct;

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}

	/**
	 * ���v�ʃe�[�u���̓ǂݍ���
	 *
	 * @param  struct �o�ɏ����f�[�^�N���X
	 * @throws SQLException
	 *		   SQL�̔��s�Ɏ��s�����ꍇ
	 */
	protected void selectOd(IssueStruct struct) throws SQLException
	{
		PreparedStatement selectStmt = null;	// select
		ResultSet selectRslt = null;			// ����

		/** [���v��]�s���b�N�p SQL */
		String _selectOd = 
			 "SELECT "
			+" ODR_QTY,"
			+" JOB_ODR_CD,"
			+" JOB_ODR_DETAIL_NO "
			+"FROM"
			+" T_OD "
			+"WHERE"
			+" OD_NO = ? "
			+"FOR UPDATE NOWAIT";

		try {
			selectStmt = _conn.getConn().prepareStatement(_selectOd);

			selectStmt.setString(1, struct.getOD_NO());

			selectRslt = selectStmt.executeQuery();

			// ����������0����������null��ԋp
			if(selectRslt.next()==false) return;

			struct.setODR_QTY( getString(1, selectRslt) );
			struct.setJOB_ODR_CD_BY_T_OD( getString(2, selectRslt) );
			struct.setJOB_ODR_DETAIL_NO_BY_T_OD( getString(3, selectRslt) );

			return;

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}

	/**
	 * �ۊǋ�ʓ��o�Ƀe�[�u���̍X�V
	 *
	 * @param  struct �o�ɏ����f�[�^�N���X
	 * @return �X�V����������Ԃ�
	 * @throws SQLException
	 *		   SQL�̔��s�Ɏ��s�����ꍇ
	 */
	public int updateRcvIssue(IssueStruct struct) throws SQLException
	{
		PreparedStatement updateStmt = null;

		/** [T_RCV_ISSUE]update�p��SQL */
		String _updateRcvIssue = 
			 "UPDATE"
			+" T_RCV_ISSUE "
			+"SET"
			+" STOCK_UPD_TYP = ?,"
			+" RCV_ISSUE_BEFORE_QTY = ?,"
			+" RCV_ISSUE_AFTER_QTY = ? + RCV_ISSUE_QTY,"
			+" UPDATED_BY = ?,"
			+" UPDATED_PRG_NM = ?,"
			+" UPDATED_DATE = TO_DATE( ? ,'YYYY/MM/DD HH24:MI:SS'),"
			+" MODIFY_COUNT = MODIFY_COUNT + 1 "
			+"WHERE"
			+" RCV_ISSUE_CTRL_CD = ?";

		try {
			updateStmt = _conn.getConn().prepareStatement(_updateRcvIssue);

			updateStmt.setInt(1, IssueStruct.UPD_TYP_COMPLETED);
			updateStmt.setString(2, struct.getSAVE_STOCK_QTY());
			updateStmt.setString(3, struct.getSAVE_STOCK_QTY());
			updateStmt.setString(4, struct.getUPDATED_BY());
			updateStmt.setString(5, struct.getUPDATED_PRG_NM());
			updateStmt.setString(6, struct.getSYSDATE());
			updateStmt.setString(7, struct.getRCV_ISSUE_CTRL_CD());

			return updateStmt.executeUpdate();

		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}

	/**
	 * �o�Ɏw���e�[�u���̍X�V
	 *
	 * @param  struct �o�ɏ����f�[�^�N���X
	 * @return �X�V����������Ԃ�
	 * @throws SQLException
	 *		   SQL�̔��s�Ɏ��s�����ꍇ
	 */
	public int updateIssueInst(IssueStruct struct) throws SQLException
	{
		PreparedStatement updateStmt = null;

		/** [T_ISSUE_INST]update�p��SQL */
		//String cmpltFlg = selectIssueCmpltFlg(struct);
		String _updateIssueInst;
		_updateIssueInst = 
			 "UPDATE"
			+" T_ISSUE_INST "
			+"SET"
			+" TOTAL_ISSUE_QTY = TOTAL_ISSUE_QTY + TO_NUMBER(?),"
			+" ISSUE_CMPLT_DATE = TO_DATE(?),"
			+" ISSUE_CMPLT_FLG = ?,"
			+" UPDATED_BY = ?,"
			+" UPDATED_PRG_NM = ?,"
			+" UPDATED_DATE = TO_DATE( ? ,'YYYY/MM/DD HH24:MI:SS'),"
			+" MODIFY_COUNT = MODIFY_COUNT + 1 "
			+"WHERE"
			+" ISSUE_INST_CD = ?";
	


		try {
			// �X�V������o�ɐ�
			String rcvIssueQty = struct.getRCV_ISSUE_QTY();

			updateStmt = _conn.getConn().prepareStatement(_updateIssueInst);

			// �o�ɍϐ��ɉ��Z���邽�߁A�������t�ɂ���
			rcvIssueQty = Calculate.multiply(rcvIssueQty,"-1");

			updateStmt.setString(1, rcvIssueQty);			
			updateStmt.setString(2, struct.getRCV_ISSUE_DATE());
			updateStmt.setInt(3, struct.getRCV_ISSUE_CMPLT_FLG().intValue());
			updateStmt.setString(4, struct.getUPDATED_BY());
			updateStmt.setString(5, struct.getUPDATED_PRG_NM());
			updateStmt.setString(6, struct.getSYSDATE());
			updateStmt.setString(7, struct.getISSUE_INST_CD());
		

			return updateStmt.executeUpdate();

		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	/**
	 * �o�Ɏw���e�[�u���̓ǂݍ���
	 *
	 * @param  struct �o�ɏ����f�[�^�N���X
	 * @return �X�V����������Ԃ�
	 * @throws SQLException
	 *		   SQL�̔��s�Ɏ��s�����ꍇ
	 */
	public String selectIssueCmpltFlg(IssueStruct struct) throws SQLException
	{
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;			// ����
		String cmpltFlg = null;
		String _selectIssueInst = 
			 "SELECT "
			+"ISSUE_CMPLT_FLG "
			+"FROM "
			+"T_ISSUE_INST "
			+"WHERE "
			+"ISSUE_INST_CD = ?";

		try {

			selectStmt = _conn.getConn().prepareStatement(_selectIssueInst);

			selectStmt.setString(1, struct.getISSUE_INST_CD());

			selectRslt = selectStmt.executeQuery();
			
			if(selectRslt.next()){
				cmpltFlg = getString(1,selectRslt);
			}

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
		return cmpltFlg;
	}
	/**
	 * ���Ԉ����e�[�u���̍X�V
	 *
	 * @param  struct �o�ɏ����f�[�^�N���X
	 * @return �X�V����������Ԃ�
	 * @throws SQLException
	 *		   SQL�̔��s�Ɏ��s�����ꍇ
	 */
	public int updateJobOdrAlc(IssueStruct struct) throws SQLException
	{
		PreparedStatement updateStmt = null;
		ResultSet result = null;
		PreparedStatement preJobOdrAlc = null;

		// ���ԕi�łȂ��ꍇ�͏������Ȃ�
		if( struct.getJOB_ODR_CD_BY_T_OD() == null ) return 0;

		try {
			// �X�V����o�ɍϐ��̎Z�o
			String issueedQty = "0";

			if(struct.getRCV_ISSUE_GNR_TYP().intValue() == IssueStruct.GNR_TYP_DEFAULT)
			{
				// ���o�ɔ����敪�� 21:�ʏ�o�� �̏ꍇ

				if( struct.getJOB_ODR_CD_BY_T_OD().equals(struct.getJOB_ODR_CD()) &&
					struct.getJOB_ODR_DETAIL_NO_BY_T_OD().equals(struct.getJOB_ODR_DETAIL_NO()) ){
					// �I�[�_�f�}���h�Ɠ��ꐻ�Ԃ̏ꍇ

					IssueRemain issueRemain = new IssueRemain(_conn);
					String issueQty = Calculate.subtract(struct.getODR_QTY(),
													 (issueRemain.getIssuedQtyByOd(struct.getOD_NO())).toString());
					if( !(Calculate.compare(issueQty,Calculate.multiply(struct.getRCV_ISSUE_QTY(),"-1")) == -1) ){
						// �ʎ�z�o�ɉ\�� �� [�ۊǋ�ʓ��o��]."���o�ɐ�" �~ �|�P �łȂ��ꍇ
						// [���Ԉ���]�͍X�V���Ȃ�
						return 0;
					}

					// [���Ԉ���]�Ǎ��pSQL
					String sql =
						  "SELECT"
						+ " JOB_ODR_ALC_CD "
						+ "FROM"
						+ " T_JOB_ODR_ALC "
						+ "WHERE"
						+ " JOB_ODR_ALC_CD = ?";

					updateStmt = _conn.getConn().prepareStatement(sql);
					updateStmt.setString(1, struct.getJOB_ODR_ALC_CD());
					result = updateStmt.executeQuery();

					if( !result.next() ){
						// [���Ԉ���]�ɊY���̈�����񂪑��݂��Ȃ��ꍇ[���Ԉ���]�͍X�V���Ȃ�
						return 0;
					}

					// comp1 �� [���Ԉ���]."�o�ɍϐ�" + (([�ۊǋ�ʓ��o��]."���o�ɐ�" �~ -1) �| �ʎ�z�o�ɉ\��)
					String comp1 = Calculate.add(struct.getISSUEED_QTY(),
								   Calculate.subtract(Calculate.multiply(struct.getRCV_ISSUE_QTY(),"-1"),
								   issueQty));

					// comp2 �� [���Ԉ���]."�����ϐ�"
					String comp2 = struct.getALCD_QTY();

					// comp1 �� comp2 �̏������@���o�ɍϐ��Ƃ���[���Ԉ���]���X�V
					if( Calculate.compare(comp1, comp2) <= 0 ){
						issueedQty = comp1;
					} else {
						issueedQty = comp2;
					}

					// �o�ɍϐ��� - (�}�C�i�X)�̏ꍇ�A0�ɕ␳
					if( Calculate.compare(issueedQty, "0") < 0 ){
						issueedQty = "0";
					}

					/** [���Ԉ���]�X�V�pSQL */
					String _updateTJobOdrAlc = 
						 "UPDATE"
						+" T_JOB_ODR_ALC "
						+"SET"
						+" ISSUEED_QTY = TO_NUMBER(?),"
						+" UPDATED_BY = ?,"
						+" UPDATED_PRG_NM = ?,"
						+" UPDATED_DATE = TO_DATE( ? ,'YYYY/MM/DD HH24:MI:SS'),"
						+" MODIFY_COUNT = MODIFY_COUNT + 1 "
						+"WHERE"
						+" JOB_ODR_ALC_CD = ?";

						preJobOdrAlc = _conn.getConn().prepareStatement(_updateTJobOdrAlc);

						preJobOdrAlc.setString(1, issueedQty);
						preJobOdrAlc.setString(2, struct.getUPDATED_BY());
						preJobOdrAlc.setString(3, struct.getUPDATED_PRG_NM());
						preJobOdrAlc.setString(4, struct.getSYSDATE());
						preJobOdrAlc.setString(5, struct.getJOB_ODR_ALC_CD());

						return preJobOdrAlc.executeUpdate();
				} else {
					// �I�[�_�f�}���h�ƕʐ��Ԃ̏ꍇ
					issueedQty = Calculate.add(Calculate.multiply(struct.getRCV_ISSUE_QTY(), "-1"), struct.getISSUEED_QTY());
					String alcdQty = struct.getALCD_QTY();

					if(Calculate.compare(issueedQty, alcdQty) == 1){
						issueedQty = alcdQty;
					}
				}
			}else if(struct.getRCV_ISSUE_GNR_TYP().intValue() == IssueStruct.GNR_TYP_CANCEL)
			{
				// ���o�ɔ����敪�� 29:�o�Ɏ�� �̏ꍇ
				if(Calculate.compare(struct.getISSUEED_QTY(), Calculate.multiply(struct.getRCV_ISSUE_QTY(),"-1")) >= 0)
				{
					issueedQty = Calculate.subtract(struct.getISSUEED_QTY(), struct.getRCV_ISSUE_QTY());
				}
			}

			// �o�ɍϐ��� - (�}�C�i�X)�̏ꍇ�A0�ɕ␳
			if(Calculate.compare(issueedQty, "0") < 0)
			{
				issueedQty = "0";
			}

			// ���Ԃ�Null�̂Ƃ� �i�ڂ̃��R�[�h���X�V
			if(struct.getJOB_ODR_CD() == null)
			{

				/** [T_JOB_ODR_ALC](�i��)update�p��SQL */
				String _updateJobOdrAlcItem = 
					 "UPDATE"
					+" T_JOB_ODR_ALC "
					+"SET"
					+" ISSUEED_QTY = TO_NUMBER(?),"
					+" UPDATED_BY = ?,"
					+" UPDATED_PRG_NM = ?,"
					+" UPDATED_DATE = TO_DATE( ? ,'YYYY/MM/DD HH24:MI:SS'),"
					+" MODIFY_COUNT = MODIFY_COUNT + 1 "
					+"WHERE"
					+" OD_NO = ?"
					+" AND ALC_STOCK_TYP = ?"
					+" AND PLANT_CD = ?";

				preJobOdrAlc = _conn.getConn().prepareStatement(_updateJobOdrAlcItem);

				preJobOdrAlc.setString(1, issueedQty);
				preJobOdrAlc.setString(2, struct.getUPDATED_BY());
				preJobOdrAlc.setString(3, struct.getUPDATED_PRG_NM());
				preJobOdrAlc.setString(4, struct.getSYSDATE());
				preJobOdrAlc.setString(5, struct.getOD_NO());
				preJobOdrAlc.setInt(6, IssueStruct.ALC_STOCK_TYP_ITEM);
				preJobOdrAlc.setString(7, struct.getPLANT_CD());
			}else{
				/** [T_JOB_ODR_ALC](����)update�p��SQL */
				String _updateJobOdrAlcJob = 
					 "UPDATE"
					+" T_JOB_ODR_ALC "
					+"SET"
					+" ISSUEED_QTY = TO_NUMBER(?),"
					+" UPDATED_BY = ?,"
					+" UPDATED_PRG_NM = ?,"
					+" UPDATED_DATE = TO_DATE( ? ,'YYYY/MM/DD HH24:MI:SS'),"
					+" MODIFY_COUNT = MODIFY_COUNT + 1 "
					+"WHERE"
					+" OD_NO = ?"
					+" AND JOB_ODR_CD = ?"
					+" AND ALC_STOCK_TYP = ?"
					+" AND PLANT_CD = ?";

				// ���Ԃ̃��R�[�h���X�V
				preJobOdrAlc = _conn.getConn().prepareStatement(_updateJobOdrAlcJob);

				preJobOdrAlc.setString(1, issueedQty);
				preJobOdrAlc.setString(2, struct.getUPDATED_BY());
				preJobOdrAlc.setString(3, struct.getUPDATED_PRG_NM());
				preJobOdrAlc.setString(4, struct.getSYSDATE());
				preJobOdrAlc.setString(5, struct.getOD_NO());
				preJobOdrAlc.setString(6, struct.getJOB_ODR_CD());
				preJobOdrAlc.setInt(7, IssueStruct.ALC_STOCK_TYP_JOB);
				preJobOdrAlc.setString(8, struct.getPLANT_CD());
			}

			return preJobOdrAlc.executeUpdate();

		} finally {
			this.closePreparedStatement(updateStmt);
			this.closeResultSet(result);
			this.closePreparedStatement(preJobOdrAlc);
		}
	}

	/**
	 * ���v�ʃe�[�u���̍X�V
	 *
	 * @param  struct �o�ɏ����f�[�^�N���X
	 * @return �X�V����������Ԃ�
	 * @throws SQLException
	 *		   SQL�̔��s�Ɏ��s�����ꍇ
	 */
	public int updateOd(IssueStruct struct) throws SQLException
	{
		PreparedStatement updateStmt = null;

		/** [T_OD]update�p��SQL */
		String _updateOd = 
			"UPDATE"
			+" T_OD "
			+"SET"
			+" DM_STS_TYP = ?,"
			+" TOTAL_ISSUE_QTY = TOTAL_ISSUE_QTY + TO_NUMBER(?),"
			+" ISSUE_CMPLT_DATE = TO_DATE(?),"
			+" UPDATED_BY = ?,"
			+" UPDATED_PRG_NM = ?,"
			+" UPDATED_DATE = TO_DATE( ? ,'YYYY/MM/DD HH24:MI:SS'),"
			+" MODIFY_COUNT = MODIFY_COUNT + 1 "
			+"WHERE"
			+" OD_NO = ?";

		try {
			// �f�}���h��ԋ敪�̔���
			int dmStsTyp = IssueStruct.DM_STS_TYP_DECIDE;
			// ���o�ɋ敪�̊����t���O�� "����" �̏ꍇ
			if(struct.getRCV_ISSUE_CMPLT_FLG().intValue() == 1)
			{
				dmStsTyp = IssueStruct.DM_STS_TYP_COMPLETED;
			}

			// �X�V������o�ɐ�
			String rcvIssueQty = struct.getRCV_ISSUE_QTY();

			updateStmt = _conn.getConn().prepareStatement(_updateOd);

			// �o�ɍϐ��ɉ��Z���邽�߁A�������t�ɂ���
			rcvIssueQty = Calculate.multiply(rcvIssueQty,"-1");

			updateStmt.setInt(1, dmStsTyp);
			updateStmt.setString(2, rcvIssueQty);
			updateStmt.setString(3, struct.getRCV_ISSUE_DATE());
			updateStmt.setString(4, struct.getUPDATED_BY());
			updateStmt.setString(5, struct.getUPDATED_PRG_NM());
			updateStmt.setString(6, struct.getSYSDATE());
			updateStmt.setString(7, struct.getOD_NO());

			return updateStmt.executeUpdate();

		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}

	/**
	 * SYSTEM�����̎擾
	 *
	 * @param  struct �o�ɏ����f�[�^�N���X
	 * @return struct �o�ɏ����f�[�^�N���X
	 * @throws SQLException
	 *		   SQL�̔��s�Ɏ��s�����ꍇ
	 */
	public IssueStruct selectSYSDATE(IssueStruct struct) throws SQLException
	{
		PreparedStatement selectStmt = null;	// select
		ResultSet selectRslt = null;			// ����

		/** SYSDATE�擾�p��SQL */
		String _selectSysDate = 
			 "SELECT"
			+" TO_CHAR(SYSDATE,'YYYY/MM/DD HH24:MI:SS') "
			+"FROM"
			+" DUAL";

		try {
			selectStmt = _conn.getConn().prepareStatement(_selectSysDate);

			selectRslt = selectStmt.executeQuery();

			// ����������0����������null��ԋp
			if(selectRslt.next()==false) return null;

			IssueStruct rtnStruct = new IssueStruct(struct);

			rtnStruct.setSYSDATE( getString(1, selectRslt) );

			return rtnStruct;

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}

	/** �o�ɏ����p�R�l�N�V���� */
	private IDbConnection _conn = null;

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
				e.printStackTrace();
			} finally {
				statement = null;
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
				e.printStackTrace();
			} finally {
				resultset = null;
			}
		}
	}

}

