/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/process/IssueProcess.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */

package com.nec.jp.orteus.expj.pr.rcvissue.process;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.util.FoundationException;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;

import com.nec.jp.orteus.expj.util.Calculate;
import com.nec.jp.orteus.expj.lot.BizCommon;
import com.nec.jp.orteus.expj.pr.rcvissue.common.RcvIssueConst;

/**
 * <B>IssueProcess</B><BR>
 * �o�ɏ������C������<BR>
 * <BR>
 * @author $Author: chenjunhua268 $
 * @version $Revision: 1.8 $
 */
public class IssueProcess implements RcvIssueConst
{

	/**
	 * �f�t�H���g�R���X�g���N�^
	 */
	private IssueProcess(){}
	
	/**
	 * �w��̃R�l�N�V���������I�u�W�F�N�g���\�z����
	 *
	 * @param  connect �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param  rcvIssueCtrlCd �o�ɏ������s�����o�ɊǗ��ԍ�
	 */
	public IssueProcess(IDbConnection connect, String rcvIssueCtrlCd)
	{
		_conn = connect;
		_ctrlCd = rcvIssueCtrlCd;
	}

	/**
	 * �o�ɏ�����main���\�b�h
	 *
	 * @return boolean ���������Ȃ�true�A�������s�Ȃ�false��Ԃ�
	 * @throws SQLException
	 *		   SQL�̔��s�Ɏ��s�����ꍇ
	 * @throws FoundationException 
	 */
	public boolean execProcess() throws SQLException, FoundationException
	{
		IssueStruct _struct = createStruct();
		// �擾���s
		if(_struct == null)
		{
			return false;
		}
		IssueDBAccessor _dbAccessor = new IssueDBAccessor(_conn);
		
		BizCommon bc = new BizCommon(_conn,_struct.getUPDATED_BY(),_struct.getUPDATED_PRG_NM(),_struct.getPLANT_CD());

		// ���o�ɊǗ��ԍ��̑Ó����`�F�b�N
		// ���o�ɋ敪���o��or�s�Ǖi�o�ɂł��邱��
		if(_struct.getRCV_ISSUE_TYP().intValue() != IssueStruct.ISSUE_RCV_TYP_ISSUE
			&& _struct.getRCV_ISSUE_TYP().intValue() != IssueStruct.ISSUE_RCV_TYP_DEF_ISSUE)
		{
			_errorList.add("AF00063");
			return false;
		}

		// ���o�ɔ����敪�� �ʏ�o�ɁE�v��O�o�ɁE�ړ��o�ɁE�U�֏o�ɁE�o�Ɏ���ł���
		if(_struct.getRCV_ISSUE_GNR_TYP().intValue() != IssueStruct.GNR_TYP_DEFAULT
			&& _struct.getRCV_ISSUE_GNR_TYP().intValue() != IssueStruct.GNR_TYP_OUTSIDE_OF_PLAN
			&& _struct.getRCV_ISSUE_GNR_TYP().intValue() != IssueStruct.GNR_TYP_MOVE
			&& _struct.getRCV_ISSUE_GNR_TYP().intValue() != IssueStruct.GNR_TYP_TRANSFER
			&& _struct.getRCV_ISSUE_GNR_TYP().intValue() != IssueStruct.GNR_TYP_CANCEL)
		{
			_errorList.add("AF00064");
			return false;
		}

		// ���o�ɋ敪���s�Ǖi�o�ɂ̏ꍇ�A���o�ɔ����敪���v��O�o�ɂŁA�����Ԃ�NULL�ł���
		if(_struct.getRCV_ISSUE_TYP().intValue() == IssueStruct.ISSUE_RCV_TYP_DEF_ISSUE
			&& (_struct.getRCV_ISSUE_GNR_TYP().intValue() != IssueStruct.GNR_TYP_OUTSIDE_OF_PLAN
				|| _struct.getJOB_ODR_CD() != null))
		{
			_errorList.add("AF00065");
			return false;
		}
		
		if (_struct.getLOT_CTRL_FLG().intValue() != IssueStruct.LOT_CTRL_LOT) {
			// ���o�ɔ����敪���U�֏o�ɂŁA���Ԃ�NOT NULL�ł���
			if(_struct.getRCV_ISSUE_GNR_TYP().intValue() == IssueStruct.GNR_TYP_TRANSFER
				&& _struct.getJOB_ODR_CD() == null)
			{
				_errorList.add("AF00066");
				return false;
			}
		}

		// �s�Ǖi�o�ɂ̏ꍇ
		if(_struct.getRCV_ISSUE_TYP().intValue() == IssueStruct.ISSUE_RCV_TYP_DEF_ISSUE)
		{
			// �s�Ǐo�ɐ��̃`�F�b�N
			if(Calculate.compare(Calculate.multiply(_struct.getRCV_ISSUE_QTY(), "-1"), _struct.getDEFECT_QTY()) == 1)
			{
				_errorList.add("AF00069");
				return false;
			}

			ItemStock itemStock = new ItemStock(_conn);
			if(_itemFlg){
				// �ۊǋ�ʕi�ڍ݌Ƀe�[�u���̍X�V
				itemStock.updateItemStock(_struct);
				
			}else{
				// �ۊǋ�ʕi�ڍ݌Ƀe�[�u���̒ǉ�
				itemStock.insertItemStock(_struct);
			}
			
			if(_struct.getLOT_NO() != null) {
				// ���b�g�ʕs�Ǎ݌ɐ����擾
				BigDecimal stockQty = itemStock.getLotDefectQty(
						   _struct.getITEM_CD(),
						   _struct.getWH_CD(),
						   _struct.getLOT_NO(),
						   RcvIssueConst.SELECT_FOR_UPDATE);
				if(stockQty != null){
					_struct.setSAVE_STOCK_QTY(stockQty.toString());
				}
				/*���b�g�ʕi�ڍ݌ɓo�^�E�X�V���i�Ăяo��*/
				_resultList = bc.excUpdateLotStockFd(_ctrlCd,"");
				if(bc.getResultStatus().intValue() != 1){
					_errorList.add((String)_resultList.get(0));
					return false;
				}
			}
			// �ۊǋ�ʓ��o�Ƀe�[�u���̍X�V
			_dbAccessor.updateRcvIssue(_struct);

			return true;
		}


		// ���o�ɐ��� 0(Zero)�ȊO�̏ꍇ�A�݌Ɏ擾����
		if(Calculate.compare(_struct.getRCV_ISSUE_QTY(), "0") != 0)
		{
			// info���b�Z�[�W�̈ꎞ�ޔ�p
			ArrayList tmpInfoList = new ArrayList();

			// �o�ɉ\���̔���
			if( _struct.getJOB_ODR_CD() == null )
			{
				if(Calculate.compare(Calculate.multiply(_struct.getRCV_ISSUE_QTY(), "-1"), _struct.getITEM_STOCK_ON_HAND_QTY()) == 1)
				{
					// �v��O�o�ɁE�]��U�ւ̏ꍇ
					if(_struct.getRCV_ISSUE_GNR_TYP().intValue() == IssueStruct.GNR_TYP_OUTSIDE_OF_PLAN
						|| _struct.getRCV_ISSUE_GNR_TYP().intValue() == IssueStruct.GNR_TYP_TRANSFER)
					{
						_errorList.add("AF00071");
						return false;
					}else if(_struct.getRCV_ISSUE_GNR_TYP().intValue() == IssueStruct.GNR_TYP_CANCEL) {
						tmpInfoList.add("AF60002");
					}else{
						tmpInfoList.add("AF60001");
					}
				}

				// ����=='NULL'�̂Ƃ� �ۊǋ�ʕi�ڍ݌Ƀe�[�u���̍X�V
				ItemStock itemStock = new ItemStock(_conn);
				if(_itemFlg){
					// �ۊǋ�ʕi�ڍ݌Ƀe�[�u���̍X�V
					itemStock.updateItemStock(_struct);
				}else{
					// �ۊǋ�ʕi�ڍ݌Ƀe�[�u���̒ǉ�
					itemStock.insertItemStock(_struct);
				}
				if(_struct.getLOT_NO() != null){
					// ���b�g�ʎ莝�݌ɐ����擾
					BigDecimal stockQty = itemStock.getLotHandQty(
							   _struct.getITEM_CD(),
							   _struct.getWH_CD(),
							   _struct.getLOT_NO(),
							   RcvIssueConst.SELECT_FOR_UPDATE);
					if(stockQty!=null){
						_struct.setSAVE_STOCK_QTY(stockQty.toString());
					}
					/*���b�g�ʕi�ڍ݌ɓo�^�E�X�V���i�Ăяo��*/
					_resultList = bc.excUpdateLotStockFd(_ctrlCd,"");
					if(bc.getResultStatus().intValue() != 1){
						_errorList.add((String)_resultList.get(0));
						return false;
					}
				}
			}else if( _struct.getJOB_ODR_CD() != null )
			{
				if(Calculate.compare(Calculate.multiply(_struct.getRCV_ISSUE_QTY(), "-1"), _struct.getJOB_STOCK_ON_HAND_QTY()) == 1)
				{
					// �v��O�o�ɁE�]��U�ւ̏ꍇ
					if(_struct.getRCV_ISSUE_GNR_TYP().intValue() == IssueStruct.GNR_TYP_OUTSIDE_OF_PLAN
						|| _struct.getRCV_ISSUE_GNR_TYP().intValue() == IssueStruct.GNR_TYP_TRANSFER)
					{
						_errorList.add("AF00070");
						return false;
					}else if(_struct.getRCV_ISSUE_GNR_TYP().intValue() == IssueStruct.GNR_TYP_CANCEL) {
						tmpInfoList.add("AF60002");
					}else{
						tmpInfoList.add("AF60001");
					}
				}

				// ����!='NULL'�̂Ƃ� �ۊǋ�ʐ��ԍ݌Ƀe�[�u���̍X�V
				JobOdrStock jobodrstock = new JobOdrStock(_conn);
				if(_jobFlg){
					// �ۊǋ�ʐ��ԍ݌Ƀe�[�u���̍X�V
					jobodrstock.updateJobOdrCdStock(_struct);
				}else{
					// �ۊǋ�ʐ��ԍ݌Ƀe�[�u���̒ǉ�
					jobodrstock.insertJobOdrCdStock(_struct);
				}
			}

			// �ꎞ���X�g��info���X�g�ֈڍs
			_infoList.addAll(tmpInfoList);
		}

		// ���o�ɔ����敪���ʏ�o��or�o�Ɏ���̏ꍇ
		if( _struct.getRCV_ISSUE_GNR_TYP().intValue() == IssueStruct.GNR_TYP_DEFAULT
			|| _struct.getRCV_ISSUE_GNR_TYP().intValue() == IssueStruct.GNR_TYP_CANCEL)
		{
			// ���o�Ɋ����t���O��off�̏ꍇ�A���o�Ɋ������� null ��ݒ�
			if(_struct.getRCV_ISSUE_CMPLT_FLG().intValue() != IssueStruct.ISSUE_CMPLT_FLG_COMPLETED){
				_struct.setRCV_ISSUE_DATE((String)null);
			}

			// �o�Ɏw���e�[�u���̍X�V
			_dbAccessor.updateIssueInst(_struct);

			// ���Ԉ����e�[�u���̍X�V
			_dbAccessor.updateJobOdrAlc(_struct);

			// ���v�ʃe�[�u���̍X�V
			_dbAccessor.updateOd(_struct);
		}

		// �ۊǋ�ʓ��o�Ƀe�[�u���̍X�V
		_dbAccessor.updateRcvIssue(_struct);

		return true;
	}

	// Add Start 20140220 liuj
	/**
	 * �Ǖi�o�ɏ�����main���\�b�h
	 *
	 * @return boolean ���������Ȃ�true�A�������s�Ȃ�false��Ԃ�
	 * @throws SQLException
	 *		   SQL�̔��s�Ɏ��s�����ꍇ
	 * @throws FoundationException 
	 */
	public boolean execAcptProcess() throws SQLException, FoundationException
	{
		IssueStruct _struct = createAcptStruct();
		// �擾���s
		if(_struct == null)
		{
			return false;
		}
		
		// ���o�ɐ��� 0(Zero)�ȊO�̏ꍇ�A�݌Ɏ擾����
		if(Calculate.compare(_struct.getRCV_ISSUE_QTY(), "0") != 0)
		{
			// �o�ɉ\���̔���
			if( _struct.getJOB_ODR_CD() == null )
			{

				// ����=='NULL'�̂Ƃ� �ۊǋ�ʕi�ڍ݌Ƀe�[�u���̍X�V
				ItemStock itemStock = new ItemStock(_conn);
				if(_itemFlg){
					// �ۊǋ�ʕi�ڍ݌Ƀe�[�u���̍X�V
					itemStock.updateAcptItemStock(_struct);
				}else{
					// �ۊǋ�ʕi�ڍ݌Ƀe�[�u���̒ǉ�
					itemStock.insertAcptItemStock(_struct);
				}

				if(_struct.getLOT_NO() != null){
					// ���b�g�ʎ莝�݌ɐ����擾
					BigDecimal stockQty = itemStock.getLotHandQty(
							   _struct.getITEM_CD(),
							   _struct.getWH_CD(),
							   _struct.getLOT_NO(),
							   RcvIssueConst.SELECT_FOR_UPDATE);
					if(stockQty!=null){
						_struct.setSAVE_STOCK_QTY(stockQty.toString());
					}
					/*���b�g�ʕi�ڍ݌ɓo�^�E�X�V���i�Ăяo��*/
					BizCommon bc = new BizCommon(_conn,_struct.getUPDATED_BY(),_struct.getUPDATED_PRG_NM(),_struct.getPLANT_CD());
					_resultList = bc.excUpdateLotStockFd(_ctrlCd,"");
					if(bc.getResultStatus().intValue() != 1){
						_errorList.add((String)_resultList.get(0));
						return false;
					}
				}
			}else if( _struct.getJOB_ODR_CD() != null ){

				// ����!='NULL'�̂Ƃ� �ۊǋ�ʐ��ԍ݌Ƀe�[�u���̍X�V
				JobOdrStock jobodrstock = new JobOdrStock(_conn);
				if(_jobFlg){
					// �ۊǋ�ʐ��ԍ݌Ƀe�[�u���̍X�V
					jobodrstock.updateJobOdrCdStock(_struct);
				}else{
					// �ۊǋ�ʐ��ԍ݌Ƀe�[�u���̒ǉ�
					jobodrstock.insertJobOdrCdStock(_struct);
				}
			}
		}
		
		IssueDBAccessor _dbAccessor = new IssueDBAccessor(_conn);
      
		// �ۊǋ�ʓ��o�Ƀe�[�u���̍X�V
		_dbAccessor.updateRcvIssue(_struct);
		
		return true;
	}
	
	/**
	 * �s�Ǖi�o�ɏ�����main���\�b�h
	 *
	 * @return boolean ���������Ȃ�true�A�������s�Ȃ�false��Ԃ�
	 * @throws SQLException
	 *		   SQL�̔��s�Ɏ��s�����ꍇ
	 * @throws FoundationException 
	 */
	public boolean execDefectProcess() throws SQLException, FoundationException
	{
		IssueStruct _struct = createDefectStruct();
		// �擾���s
		if(_struct == null)
		{
			return false;
		}
		
		// ���o�ɐ��� 0(Zero)�ȊO�̏ꍇ�A�݌Ɏ擾����
		if(Calculate.compare(_struct.getRCV_ISSUE_QTY(), "0") != 0)
		{
			// �o�ɉ\���̔���
			if( _struct.getJOB_ODR_CD() == null )
			{
				// ����=='NULL'�̂Ƃ� �ۊǋ�ʕi�ڍ݌Ƀe�[�u���̍X�V
				ItemStock itemStock = new ItemStock(_conn);
				if(_itemFlg){
					// �ۊǋ�ʕi�ڍ݌Ƀe�[�u���̍X�V
					itemStock.updateDefectItemStock(_struct);
				}else{
					// �ۊǋ�ʕi�ڍ݌Ƀe�[�u���̒ǉ�
					itemStock.insertDefectItemStock(_struct);
				}

			}
			if(_struct.getLOT_NO() != null) {
				// ���b�g�ʕs�Ǎ݌ɐ����擾
				ItemStock itemStock = new ItemStock(_conn);
				BigDecimal stockQty = itemStock.getLotDefectQty(
						   _struct.getITEM_CD(),
						   _struct.getWH_CD(),
						   _struct.getLOT_NO(),
						   RcvIssueConst.SELECT_FOR_UPDATE);
				if(stockQty != null){
					_struct.setSAVE_STOCK_QTY(stockQty.toString());
				}
				/*���b�g�ʕi�ڍ݌ɓo�^�E�X�V���i�Ăяo��*/
				BizCommon bc = new BizCommon(_conn,_struct.getUPDATED_BY(),_struct.getUPDATED_PRG_NM(),_struct.getPLANT_CD());
				_resultList = bc.excUpdateLotStockFd(_ctrlCd,"");
				if(bc.getResultStatus().intValue() != 1){
					_errorList.add((String)_resultList.get(0));
					return false;
				}
			}
		}
		
		IssueDBAccessor _dbAccessor = new IssueDBAccessor(_conn);
      
		// �ۊǋ�ʓ��o�Ƀe�[�u���̍X�V
		_dbAccessor.updateRcvIssue(_struct);
		
		return true;
	}
	/**
	 * �Ǖi�o�ɏ����p��Struct���\�z����
	 *
	 * @return IssueStruct �o�ɏ����pStruct
	 * @throws SQLException
	 *		   SQL�̔��s�Ɏ��s�����ꍇ
	 */
	private IssueStruct createAcptStruct() throws SQLException
	{
		IssueStruct _struct = new IssueStruct();
		IssueDBAccessor _dbAccessor = new IssueDBAccessor(_conn);
		// �ۊǋ�ʓ��o�Ƀe�[�u���̓Ǎ���
		_struct = _dbAccessor.selectRcvIssue(_ctrlCd);

		if(_struct == null)
		{
			_errorList.add("AF00068");
			return null;
		}

		// SYSTEM�����̎擾
		IssueStruct sysDateStruct = _dbAccessor.selectSYSDATE(_struct);
		_struct.setSYSDATE(sysDateStruct.getSYSDATE());
		
        // ���o�ɐ��� 0(Zero)�ȊO�̏ꍇ�A�݌Ɏ擾����
		if(Calculate.compare(_struct.getRCV_ISSUE_QTY(), "0") != 0 ||
				(Calculate.compare(_struct.getRCV_ISSUE_QTY(), "0") == 0 && 
						_struct.getWH_CD() != null && !"".equals(_struct.getWH_CD()))) {
			// ���ԕi���ǂ����`�F�b�N
			if(_struct.getJOB_ODR_CD() == null)
			{
				// �ۊǋ�ʕi�ڍ݌ɂ̏o�ɉ\��,�i�ڕʕs�ǐ� �擾
				ItemStock itemStock = new ItemStock(_conn);
				
				BigDecimal stockQty = null;

				stockQty = itemStock.getHandQty(
						   _struct.getITEM_CD(),
						   _struct.getWH_CD(),
						   RcvIssueConst.SELECT_FOR_UPDATE);

				if(stockQty!=null){
					_struct.setITEM_STOCK_ON_HAND_QTY(stockQty.toString());
					_struct.setSAVE_STOCK_QTY(stockQty.toString());
					_itemFlg = true;
				}
					
			}else{
				// �ۊǋ�ʐ��ԍ݌ɂ̏o�ɉ\�� �擾
				JobOdrStock jobodrstock = new JobOdrStock(_conn);
				BigDecimal stockOnHandQty = jobodrstock.getHandQty(_struct.getJOB_ODR_CD(),
																   RcvIssueConst.JOB_ODR_DETAIL_ZERO,
																   _struct.getITEM_CD(),
																   _struct.getWH_CD(),
																   RcvIssueConst.SELECT_FOR_UPDATE);
				if(stockOnHandQty != null)
				{
					_struct.setJOB_STOCK_ON_HAND_QTY(stockOnHandQty.toString());
					_struct.setSAVE_STOCK_QTY(stockOnHandQty.toString());
					_jobFlg = true;
				}
			}
		}
		return _struct;
	}
	
	/**
	 * �s�Ǖi�o�ɏ����p��Struct���\�z����
	 *
	 * @return IssueStruct �o�ɏ����pStruct
	 * @throws SQLException
	 *		   SQL�̔��s�Ɏ��s�����ꍇ
	 */
	private IssueStruct createDefectStruct() throws SQLException
	{
		IssueStruct _struct = new IssueStruct();
		IssueDBAccessor _dbAccessor = new IssueDBAccessor(_conn);
		// �ۊǋ�ʓ��o�Ƀe�[�u���̓Ǎ���
		_struct = _dbAccessor.selectRcvIssue(_ctrlCd);

		if(_struct == null)
		{
			_errorList.add("AF00068");
			return null;
		}

		// SYSTEM�����̎擾
		IssueStruct sysDateStruct = _dbAccessor.selectSYSDATE(_struct);
		_struct.setSYSDATE(sysDateStruct.getSYSDATE());
		
        // ���o�ɐ��� 0(Zero)�ȊO�̏ꍇ�A�݌Ɏ擾����
		if(Calculate.compare(_struct.getRCV_ISSUE_QTY(), "0") != 0 ||
				(Calculate.compare(_struct.getRCV_ISSUE_QTY(), "0") == 0 && 
						_struct.getWH_CD() != null && !"".equals(_struct.getWH_CD()))) {
			// ���ԕi���ǂ����`�F�b�N
			if(_struct.getJOB_ODR_CD() == null)
			{
				// �ۊǋ�ʕi�ڍ݌ɂ̕i�ڕʕs�ǐ� �擾
				ItemStock itemStock = new ItemStock(_conn);
				
				BigDecimal stockQty = null;

				stockQty = itemStock.getDefectQty(
						   _struct.getITEM_CD(),
						   _struct.getWH_CD(),
						   RcvIssueConst.SELECT_FOR_UPDATE);
				
				if(stockQty!=null){
					_struct.setDEFECT_QTY(stockQty.toString());
					_struct.setSAVE_STOCK_QTY(stockQty.toString());
					_itemFlg = true;
				}	
			}
		}
		return _struct;
	}
	// Add End 20140220 liuj
	/**
	 * �o�ɏ����p��Struct���\�z����
	 *
	 * @return IssueStruct �o�ɏ����pStruct
	 * @throws SQLException
	 *		   SQL�̔��s�Ɏ��s�����ꍇ
	 */
	private IssueStruct createStruct() throws SQLException
	{
		IssueStruct _struct = new IssueStruct();
		IssueDBAccessor _dbAccessor = new IssueDBAccessor(_conn);

		// �ۊǋ�ʓ��o�Ƀe�[�u���̓Ǎ���
		_struct = _dbAccessor.selectRcvIssue(_ctrlCd);

		if(_struct == null)
		{
			_errorList.add("AF00068");
			return null;
		}

		// SYSTEM�����̎擾
		IssueStruct sysDateStruct = _dbAccessor.selectSYSDATE(_struct);
		_struct.setSYSDATE(sysDateStruct.getSYSDATE());

		// ���o�ɐ��� 0(Zero)�ȊO�̏ꍇ�A�݌Ɏ擾����
		if(Calculate.compare(_struct.getRCV_ISSUE_QTY(), "0") != 0 ||
				(Calculate.compare(_struct.getRCV_ISSUE_QTY(), "0") == 0 && 
						_struct.getWH_CD() != null && !"".equals(_struct.getWH_CD()))) {
			// ���ԕi���ǂ����`�F�b�N
			if(_struct.getJOB_ODR_CD() == null)
			{
				// �ۊǋ�ʕi�ڍ݌ɂ̏o�ɉ\��,�i�ڕʕs�ǐ� �擾
				ItemStock itemStock = new ItemStock(_conn);
				
				BigDecimal stockQty = null;
				
				// �s�Ǎ݌ɍX�V�� �Ǖi�݌ɍX�V��
				if (_struct.getRCV_ISSUE_TYP().intValue() == IssueStruct.ISSUE_RCV_TYP_DEF_ISSUE) {
					stockQty = itemStock.getDefectQty(
							   _struct.getITEM_CD(),
							   _struct.getWH_CD(),
							   RcvIssueConst.SELECT_FOR_UPDATE);
					
					if(stockQty!=null){
						_struct.setDEFECT_QTY(stockQty.toString());
						_struct.setSAVE_STOCK_QTY(stockQty.toString());
						_itemFlg = true;
					}
					
				} else {
					stockQty = itemStock.getHandQty(
							   _struct.getITEM_CD(),
							   _struct.getWH_CD(),
							   RcvIssueConst.SELECT_FOR_UPDATE);

					if(stockQty!=null){
						_struct.setITEM_STOCK_ON_HAND_QTY(stockQty.toString());
						_struct.setSAVE_STOCK_QTY(stockQty.toString());
						_itemFlg = true;
					}
				}
					
			}else{
				// �ۊǋ�ʐ��ԍ݌ɂ̏o�ɉ\�� �擾
				JobOdrStock jobodrstock = new JobOdrStock(_conn);
				BigDecimal stockOnHandQty = jobodrstock.getHandQty(_struct.getJOB_ODR_CD(),
																   RcvIssueConst.JOB_ODR_DETAIL_ZERO,
																   _struct.getITEM_CD(),
																   _struct.getWH_CD(),
																   RcvIssueConst.SELECT_FOR_UPDATE);
				if(stockOnHandQty != null)
				{
					_struct.setJOB_STOCK_ON_HAND_QTY(stockOnHandQty.toString());
					_struct.setSAVE_STOCK_QTY(stockOnHandQty.toString());
					_jobFlg = true;
				}
			}
		}

		// [���Ԉ���]�o�ɍϐ��E�����ϐ� �擾
		IssueStruct alcStruct = _dbAccessor.selectJobOdrAlc(_struct);

		if(alcStruct != null)
		{
			_struct.setJOB_ODR_ALC_CD(alcStruct.getJOB_ODR_ALC_CD());
			_struct.setALCD_QTY(alcStruct.getALCD_QTY());
			_struct.setISSUEED_QTY(alcStruct.getISSUEED_QTY());
		}

		// �s���b�N�pselect��
		_dbAccessor.selectIssueInst(_struct);
		_dbAccessor.selectOd(_struct);

	return _struct;
	}

	/** �o�ɏ����R�l�N�V�����N���X */
	protected IDbConnection _conn;

	/** �o�ɏ����f�[�^�N���X */
	protected IssueStruct _struct;

	/** �o�ɏ��� DB�A�N�Z�X�N���X */
	protected IssueDBAccessor _dbAccessor;

	/** ���o�ɊǗ��ԍ� */
	protected String _ctrlCd;

	/** �i�ڍ݌ɑ��݃t���O */
	protected boolean _itemFlg = false;

	/** ���ԍ݌ɑ��݃t���O */
	protected boolean _jobFlg = false;

	/** �G���[���b�Z�[�W�i�[���X�g */
	protected ArrayList _errorList = new ArrayList();
	
	/** ���i�ďo���̕ԋp�l�i�[���X�g */
	protected List _resultList;

	/**
	 * ���b�Z�[�W�擾 
	 * @return �G���[���X�g
	 */
	public ArrayList getErrorList()
	{
		return _errorList;
	}

	/**
	 * ���b�Z�[�W�ݒ�
	 * @param ���b�Z�[�W���X�g
	 */
	public void setErrorList(ArrayList list)
	{
		_errorList = list;
	}

	/** ��񃁃b�Z�[�W�i�[���X�g */
	protected ArrayList _infoList = new ArrayList();

	/**
	 * ���b�Z�[�W�擾 
	 * @return info���X�g
	 */
	public ArrayList getInfoList()
	{
		return _infoList;
	}

	/**
	 * ���b�Z�[�W�ݒ�
	 * @param ���b�Z�[�W���X�g
	 */
	public void setInfoList(ArrayList list)
	{
		_infoList = list;
	}

	/** �x�����b�Z�[�W�i�[���X�g */
	protected ArrayList _warnList = new ArrayList();

	/**
	 * ���b�Z�[�W�擾 
	 * @return warn���X�g
	 */
	public ArrayList getWarnList()
	{
		return _warnList;
	}

	/**
	 * ���b�Z�[�W�ݒ�
	 * @param ���b�Z�[�W���X�g
	 */
	public void setWarnList(ArrayList list)
	{
		_warnList = list;
	}

}