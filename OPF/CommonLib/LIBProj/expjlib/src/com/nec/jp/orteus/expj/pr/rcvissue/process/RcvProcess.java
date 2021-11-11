/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/process/RcvProcess.java,v $
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


import com.nec.jp.orteus.expj.lot.BizCommon;
import com.nec.jp.orteus.expj.util.Calculate;
/**
 * <B>IssueProcess</B><BR>
 * ���ɏ������C������<BR>
 * <BR>
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.6 $
 */
public class RcvProcess
{

	/**
	 * �f�t�H���g�R���X�g���N�^
	 */
	private RcvProcess(){}
	
	/**
	 * �w��̃R�l�N�V���������I�u�W�F�N�g���\�z����
	 *
	 * @param  connect �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param  rcvIssueCtrlCd �o�ɏ������s�����o�ɊǗ��ԍ�
	 */
	public RcvProcess(IDbConnection connect, String rcvIssueCtrlCd)
	{
		_conn = connect;
		_ctrlCd = rcvIssueCtrlCd;
	}

	/**
	 * �o�ɏ�����main���\�b�h
	 *
	 * @return boolean ���������Ȃ�true�A�������s�Ȃ�false��Ԃ�
	 * @throws SQLException
	 *         SQL�̔��s�Ɏ��s�����ꍇ
	 * @throws FoundationException 
	 */
	public boolean execProcess() throws SQLException, FoundationException
	{
		RcvStruct _struct = createStruct();
		// �擾���s
		if(_struct == null)
		{
			return false;
		}
		RcvDBAccessor _dbAccessor = new RcvDBAccessor(_conn);
		
		BizCommon bc = new BizCommon(_conn,_struct.getUPDATED_BY(),_struct.getUPDATED_PRG_NM(),_struct.getPLANT_CD());

		// ���o�ɊǗ��ԍ��̑Ó����`�F�b�N
		// ���o�ɋ敪������or�s�Ǖi���ɂł��邱��
		if(_struct.getRCV_ISSUE_TYP().intValue() != RcvStruct.ISSUE_RCV_TYP_RCV
			&& _struct.getRCV_ISSUE_TYP().intValue() != RcvStruct.ISSUE_RCV_TYP_DEF_RCV)
		{
			_errorList.add("AF00072");
			return false;
		}

		// ���o�ɔ����敪�� �ʏ���ɁE�v��O���ɁE�ړ����ɁE�U�֓��ɁE���Ɏ���A
		// �H���݌ɓ��ɁA�H���݌ɓ��Ɏ���A�����݌ɓ��ɁA�����݌ɓ���t����ł���
		if(_struct.getRCV_ISSUE_GNR_TYP().intValue() != RcvStruct.GNR_TYP_DEFAULT
			&& _struct.getRCV_ISSUE_GNR_TYP().intValue() != RcvStruct.GNR_TYP_OUTSIDE_OF_PLAN
			&& _struct.getRCV_ISSUE_GNR_TYP().intValue() != RcvStruct.GNR_TYP_MOVE
			&& _struct.getRCV_ISSUE_GNR_TYP().intValue() != RcvStruct.GNR_TYP_TRANSFER
			&& _struct.getRCV_ISSUE_GNR_TYP().intValue() != RcvStruct.GNR_TYP_CANCEL
			&& _struct.getRCV_ISSUE_GNR_TYP().intValue() != RcvStruct.GNR_TYP_PROC_STOCK
			&& _struct.getRCV_ISSUE_GNR_TYP().intValue() != RcvStruct.GNR_TYP_PROC_STOCK_CANCEL
			&& _struct.getRCV_ISSUE_GNR_TYP().intValue() != RcvStruct.GNR_TYP_VEND_STOCK
			&& _struct.getRCV_ISSUE_GNR_TYP().intValue() != RcvStruct.GNR_TYP_VEND_STOCK_CANCEL)
		{
			_errorList.add("AF00073");
			return false;
		}

		// ���o�ɋ敪���s�Ǖi���ɂ̏ꍇ�A���o�ɔ����敪���v��O���ɂŁA�����Ԃ�NULL�ł���
		if(_struct.getRCV_ISSUE_TYP().intValue() == RcvStruct.ISSUE_RCV_TYP_DEF_RCV
			&& (_struct.getRCV_ISSUE_GNR_TYP().intValue() != RcvStruct.GNR_TYP_OUTSIDE_OF_PLAN
				|| _struct.getJOB_ODR_CD() != null))
		{
			_errorList.add("AF00074");
			return false;
		}

		// ���o�ɔ����敪���U�֓��ɂŁA���Ԃ�NULL�ł���
		if(_struct.getRCV_ISSUE_GNR_TYP().intValue() == RcvStruct.GNR_TYP_TRANSFER
			&& _struct.getJOB_ODR_CD() != null)
		{
			_errorList.add("AF00075");
			return false;
		}

		// ���o�ɐ���0�̏ꍇ�A�ۊǋ�ʓ��o�ɂ��X�V���ďI��
		if(Calculate.compare(_struct.getRCV_ISSUE_QTY(), "0") == 0)
		{
			// �ۊǋ�ʓ��o�Ƀe�[�u���̍X�V
			_dbAccessor.updateRcvIssue(_struct);

			return true;
		}

		// �s�Ǖi���ɂ̏ꍇ
		if(_struct.getRCV_ISSUE_TYP().intValue() == RcvStruct.ISSUE_RCV_TYP_DEF_RCV)
		{
			if(_itemFlg){
				// �ۊǋ�ʕi�ڍ݌Ƀe�[�u���̍X�V
				_dbAccessor.updateItemStock(_struct);
			}else{
				// �ۊǋ�ʕi�ڍ݌Ƀe�[�u���̒ǉ�
				_dbAccessor.insertItemStock(_struct);
			}
			
			if(_struct.getLOT_NO() != null){
				RcvStruct lotStruct = _dbAccessor.selectLotStock(_struct);
				if(lotStruct != null){
					_struct.setSAVE_STOCK_QTY(lotStruct.getDEFECT_QTY());
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

		if(_struct.getJOB_ODR_CD() == null)
		{
			// ����=='NULL'�̂Ƃ� �ۊǋ�ʕi�ڍ݌Ƀe�[�u���̍X�V
			if(_itemFlg){
				// �ۊǋ�ʕi�ڍ݌Ƀe�[�u���̍X�V
				_dbAccessor.updateItemStock(_struct);
			}else{
				// �ۊǋ�ʕi�ڍ݌Ƀe�[�u���̒ǉ�
				_dbAccessor.insertItemStock(_struct);
			}
			
			if(_struct.getLOT_NO() != null){
				RcvStruct lotStruct = _dbAccessor.selectLotStock(_struct);
				if(lotStruct != null){
					_struct.setSAVE_STOCK_QTY(lotStruct.getITEM_STOCK_ON_HAND_QTY());
				}
				/*���b�g�ʕi�ڍ݌ɓo�^�E�X�V���i�Ăяo��*/
				_resultList = bc.excUpdateLotStockFd(_ctrlCd,"");
				if(bc.getResultStatus().intValue() != 1){
					_errorList.add((String)_resultList.get(0));
					return false;
				}
			}
		}else{
			// ����!='NULL'�̂Ƃ� �ۊǋ�ʐ��ԍ݌Ƀe�[�u���̍X�V
			if(_jobFlg){
				// �ۊǋ�ʐ��ԍ݌Ƀe�[�u���̍X�V
				_dbAccessor.updateJobOdrCdStock(_struct);
			}else{
				// �ۊǋ�ʐ��ԍ݌Ƀe�[�u���̒ǉ�
				_dbAccessor.insertJobOdrCdStock(_struct);
			}
		}

		// �ۊǋ�ʓ��o�Ƀe�[�u���̍X�V
		_dbAccessor.updateRcvIssue(_struct);

		return true;
	}

	/**
	 * ���ɏ����p��Struct���\�z����
	 *
	 * @return RcvStruct ���ɏ����pStruct
	 * @throws SQLException
	 *         SQL�̔��s�Ɏ��s�����ꍇ
	 */
	private RcvStruct createStruct() throws SQLException
	{
		RcvStruct _struct = new RcvStruct();
		RcvDBAccessor _dbAccessor = new RcvDBAccessor(_conn);

		// �ۊǋ�ʓ��o�Ƀe�[�u���̓Ǎ���
		_struct = _dbAccessor.selectRcvIssue(_ctrlCd);

		if(_struct == null)
		{
			_errorList.add("AF00068");
			return null;
		}

		// SYSTEM�����̎擾
		RcvStruct sysDateStruct = _dbAccessor.selectSYSDATE(_struct);
		_struct.setSYSDATE(sysDateStruct.getSYSDATE());

		// ���o�ɐ��� 0(Zero)�ȊO�̏ꍇ�A�݌Ɏ擾����
		//20091102 ���o�ɐ��� 0�̎��A�����Ŏ擾���Ȃ���[�ۊǋ�ʓ��o��]."���o�ɑO�݌ɐ�","���o�Ɍ�݌ɐ�"��0�ɂȂ��Ă��܂����߁A�擾����B
		/*
		if(Calculate.compare(_struct.getRCV_ISSUE_QTY(), "0") != 0)
		{
		*/
			// ���ԕi���ǂ����`�F�b�N
			if(_struct.getJOB_ODR_CD() == null)
			{
				// �ۊǋ�ʕi�ڍ݌ɂ̏o�ɉ\��,�i�ڕʕs�ǐ� �擾
				RcvStruct itemStruct = new RcvStruct();
				itemStruct = _dbAccessor.selectItemStock(_struct);

				// �s�Ǎ݌ɍX�V�� �Ǖi�݌ɍX�V��
				if( _struct.getRCV_ISSUE_TYP().intValue() == RcvStruct.ISSUE_RCV_TYP_DEF_RCV ){

					if(itemStruct != null){
						_struct.setDEFECT_QTY(itemStruct.getDEFECT_QTY());
						_struct.setSAVE_STOCK_QTY(itemStruct.getDEFECT_QTY());
						_itemFlg = true;
					}

				} else {

					if(itemStruct != null){
						_struct.setITEM_STOCK_ON_HAND_QTY(itemStruct.getITEM_STOCK_ON_HAND_QTY());
						_struct.setSAVE_STOCK_QTY(itemStruct.getITEM_STOCK_ON_HAND_QTY());
						_itemFlg = true;
					}

				}

			}else{
				// �ۊǋ�ʐ��ԍ݌ɂ̏o�ɉ\�� �擾
				RcvStruct jobStruct = new RcvStruct();
				jobStruct = _dbAccessor.selectJobOdrCdStock(_struct);

				if(jobStruct != null)
				{
					_struct.setJOB_STOCK_ON_HAND_QTY(jobStruct.getJOB_STOCK_ON_HAND_QTY());
					_struct.setSAVE_STOCK_QTY(jobStruct.getJOB_STOCK_ON_HAND_QTY());
					_jobFlg = true;
				}
			}
		//}

	return _struct;
	}

	/** ���ɏ����R�l�N�V�����N���X */
	protected IDbConnection _conn;

	/** ���ɏ����f�[�^�N���X */
	protected RcvStruct _struct;

	/** ���ɏ��� DB�A�N�Z�X�N���X */
	protected RcvDBAccessor _dbAccessor;

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