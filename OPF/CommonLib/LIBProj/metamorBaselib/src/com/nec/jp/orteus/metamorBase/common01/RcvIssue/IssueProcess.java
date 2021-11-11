//------------------------------------------------------------------------------
// (#)IssueProcess.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/08/21 �V�K�쐬 M.Hotokebuchi
// 2003/08/26 M.Hotokebuchi
//           �Einfo,warning���x���̏o�͗p���X�g��ǉ�
//           �E�݌ɍX�V���ɁA�v��O�E�U�ֈȊO�̏ꍇ�Ń}�C�i�X�݌ɂƂȂ�l
//             ����info���b�Z�[�W���o���悤�C��
//           �E���ʂ�Integer �� Double (int �� double) �ɕϊ�
// 2003/08/27 M.Hotokebuchi
//           �ESYSTEM�������擾���鏈����ǉ�
// 2003/08/28 M.Hotokebuchi
//           �EexecProcess()��SQLException��throw����悤�C��
// 2003/08/31 M.Hotokebuchi
//           �E�݌Ƀ��R�[�h���Ȃ��ꍇ�Ainsert���鏈����ǉ�
// 2003/09/01 M.Hotokebuchi
//           �E�v�Z����Calculate() �Ή�
//           �EDouble��String �Ή�
// 2003/09/17 M.Hotokebuchi
//           �E�o�Ɏ�����̃}�C�i�X�݌ɍX�V�̃��b�Z�[�W��ǉ�
// 2003/09/18 M.Hotokebuchi
//           �E[�o�Ɏw��]�A[���v��] �X�V�O�ɍs���b�N����悤�C��
//           �E[���Ԉ���].�����݌ɋ敪 �̐ݒ���폜
//           �E���o�ɐ���0�̏ꍇ�A�݌Ƀe�[�u���ɃA�N�Z�X���Ȃ��悤�C��
//           �ESQLException �����������ꍇ��info���b�Z�[�W��r�o���Ȃ��悤�C��
// 2003/10/20 M.Hotokebuchi
//           �E���o�Ɋ����t���O��off�̏ꍇ�A���o�Ɋ������� null ��ݒ肷��悤�C��
//           �E�Ɩ��^�p�����v����ɕύX���A���o�ɔN�������v�����薢������
//             ���������ɐ���I������悤�C��
// 2003/12/05 M.Hotokebuchi
//           �E�v������菈���̍폜�ɔ����ASimpleDateFormat,Date��import���폜
//           �E�v������菈���̍폜�ɔ����A���o�ɓ��ƌv����̔��菈�����폜
//           �E�v������菈���̍폜�ɔ����A���t��Convert���\�b�h���폜
//
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.RcvIssue;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.util.FoundationException;
import com.nec.jp.orteus.util.CoreTools;

import java.text.ParseException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.nec.jp.orteus.metamorBase.common01.util.Calculate;

/**
 * <B>IssueProcess</B><BR>
 * �o�ɏ������C������<BR>
 * <BR>
 * @author  M.Hotokebuchi
 * @version 1.00
 */
public class IssueProcess
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
	 *         SQL�̔��s�Ɏ��s�����ꍇ
	 */
	public boolean execProcess() throws SQLException
	{
		IssueStruct _struct = createStruct();
		// �擾���s
		if(_struct == null)
		{
			return false;
		}
		IssueDBAccessor _dbAccessor = new IssueDBAccessor(_conn);

		// ���o�ɊǗ��ԍ��̑Ó����`�F�b�N
		// ���o�ɋ敪���o��or�s�Ǖi�o�ɂł��邱��
		if(_struct.getRCV_ISSUE_TYP().intValue() != _struct.ISSUE_RCV_TYP_ISSUE
			&& _struct.getRCV_ISSUE_TYP().intValue() != _struct.ISSUE_RCV_TYP_DEF_ISSUE)
		{
			_errorList.add("AF00063");
			return false;
		}

		// ���o�ɔ����敪�� �ʏ�o�ɁE�v��O�o�ɁE�ړ��o�ɁE�U�֏o�ɁE�o�Ɏ���ł���
		if(_struct.getRCV_ISSUE_GNR_TYP().intValue() != _struct.GNR_TYP_DEFAULT
			&& _struct.getRCV_ISSUE_GNR_TYP().intValue() != _struct.GNR_TYP_OUTSIDE_OF_PLAN
			&& _struct.getRCV_ISSUE_GNR_TYP().intValue() != _struct.GNR_TYP_MOVE
			&& _struct.getRCV_ISSUE_GNR_TYP().intValue() != _struct.GNR_TYP_TRANSFER
			&& _struct.getRCV_ISSUE_GNR_TYP().intValue() != _struct.GNR_TYP_CANCEL)
		{
			_errorList.add("AF00064");
			return false;
		}

		// ���o�ɋ敪���s�Ǖi�o�ɂ̏ꍇ�A���o�ɔ����敪���v��O�o�ɂŁA�����Ԃ�NULL�ł���
		if(_struct.getRCV_ISSUE_TYP().intValue() == _struct.ISSUE_RCV_TYP_DEF_ISSUE
			&& (_struct.getRCV_ISSUE_GNR_TYP().intValue() != _struct.GNR_TYP_OUTSIDE_OF_PLAN
				|| _struct.getJOB_ODR_CD() != null))
		{
			_errorList.add("AF00065");
			return false;
		}

		// ���o�ɔ����敪���U�֏o�ɂŁA���Ԃ�NOT NULL�ł���
		if(_struct.getRCV_ISSUE_GNR_TYP().intValue() == _struct.GNR_TYP_TRANSFER
			&& _struct.getJOB_ODR_CD() == null)
		{
			_errorList.add("AF00066");
			return false;
		}

		// �s�Ǖi�o�ɂ̏ꍇ
		if(_struct.getRCV_ISSUE_TYP().intValue() == _struct.ISSUE_RCV_TYP_DEF_ISSUE)
		{
			// �s�Ǐo�ɐ��̃`�F�b�N
			if(_calc.compare(_calc.multiply(_struct.getRCV_ISSUE_QTY(), "-1"), _struct.getDEFECT_QTY()) == 1)
			{
				_errorList.add("AF00069");
				return false;
			}

			if(_itemFlg){
				// �ۊǋ�ʕi�ڍ݌Ƀe�[�u���̍X�V
				_dbAccessor.updateItemStock(_struct);
			}else{
				// �ۊǋ�ʕi�ڍ݌Ƀe�[�u���̒ǉ�
				_dbAccessor.insertItemStock(_struct);
			}

			// �ۊǋ�ʓ��o�Ƀe�[�u���̍X�V
			_dbAccessor.updateRcvIssue(_struct);

			return true;
		}


		// ���o�ɐ��� 0(Zero)�ȊO�̏ꍇ�A�݌Ɏ擾����
		if(_calc.compare(_struct.getRCV_ISSUE_QTY(), "0") != 0)
		{
			// info���b�Z�[�W�̈ꎞ�ޔ�p
			ArrayList tmpInfoList = new ArrayList();

			// �o�ɉ\���̔���
			if( _struct.getJOB_ODR_CD() == null )
			{
				if(_calc.compare(_calc.multiply(_struct.getRCV_ISSUE_QTY(), "-1"), _struct.getITEM_STOCK_ON_HAND_QTY()) == 1)
				{
					// �v��O�o�ɁE�]��U�ւ̏ꍇ
					if(_struct.getRCV_ISSUE_GNR_TYP().intValue() == _struct.GNR_TYP_OUTSIDE_OF_PLAN
						|| _struct.getRCV_ISSUE_GNR_TYP().intValue() == _struct.GNR_TYP_TRANSFER)
					{
						_errorList.add("AF00071");
						return false;
					}else if(_struct.getRCV_ISSUE_GNR_TYP().intValue() == _struct.GNR_TYP_CANCEL) {
						tmpInfoList.add("AF60002");
					}else{
						tmpInfoList.add("AF60001");
					}
				}

				// ����=='NULL'�̂Ƃ� �ۊǋ�ʕi�ڍ݌Ƀe�[�u���̍X�V
				if(_itemFlg){
					// �ۊǋ�ʕi�ڍ݌Ƀe�[�u���̍X�V
					_dbAccessor.updateItemStock(_struct);
				}else{
					// �ۊǋ�ʕi�ڍ݌Ƀe�[�u���̒ǉ�
					_dbAccessor.insertItemStock(_struct);
				}
			}else if( _struct.getJOB_ODR_CD() != null )
			{
				if(_calc.compare(_calc.multiply(_struct.getRCV_ISSUE_QTY(), "-1"), _struct.getJOB_STOCK_ON_HAND_QTY()) == 1)
				{
					// �v��O�o�ɁE�]��U�ւ̏ꍇ
					if(_struct.getRCV_ISSUE_GNR_TYP().intValue() == _struct.GNR_TYP_OUTSIDE_OF_PLAN
						|| _struct.getRCV_ISSUE_GNR_TYP().intValue() == _struct.GNR_TYP_TRANSFER)
					{
						_errorList.add("AF00070");
						return false;
					}else if(_struct.getRCV_ISSUE_GNR_TYP().intValue() == _struct.GNR_TYP_CANCEL) {
						tmpInfoList.add("AF60002");
					}else{
						tmpInfoList.add("AF60001");
					}
				}

				// ����!='NULL'�̂Ƃ� �ۊǋ�ʐ��ԍ݌Ƀe�[�u���̍X�V
				if(_jobFlg){
					// �ۊǋ�ʐ��ԍ݌Ƀe�[�u���̍X�V
					_dbAccessor.updateJobOdrCdStock(_struct);
				}else{
					// �ۊǋ�ʐ��ԍ݌Ƀe�[�u���̒ǉ�
					_dbAccessor.insertJobOdrCdStock(_struct);
				}
			}

			// �ꎞ���X�g��info���X�g�ֈڍs
			_infoList.addAll(tmpInfoList);
		}

		// ���o�ɔ����敪���ʏ�o��or�o�Ɏ���̏ꍇ
		if( _struct.getRCV_ISSUE_GNR_TYP().intValue() == _struct.GNR_TYP_DEFAULT
			|| _struct.getRCV_ISSUE_GNR_TYP().intValue() == _struct.GNR_TYP_CANCEL)
		{
			// ���o�Ɋ����t���O��off�̏ꍇ�A���o�Ɋ������� null ��ݒ�
			if(_struct.getRCV_ISSUE_CMPLT_FLG().intValue() != _struct.ISSUE_CMPLT_FLG_COMPLETED){
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

	/**
	 * �o�ɏ����p��Struct���\�z����
	 *
	 * @return IssueStruct �o�ɏ����pStruct
	 * @throws SQLException
	 *         SQL�̔��s�Ɏ��s�����ꍇ
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
		if(_calc.compare(_struct.getRCV_ISSUE_QTY(), "0") != 0)
		{
			// ���ԕi���ǂ����`�F�b�N
			if(_struct.getJOB_ODR_CD() == null)
			{
				// �ۊǋ�ʕi�ڍ݌ɂ̏o�ɉ\��,�i�ڕʕs�ǐ� �擾
				IssueStruct itemStruct = new IssueStruct();
				itemStruct = _dbAccessor.selectItemStock(_struct);

				if(itemStruct != null)
				{
					_struct.setITEM_STOCK_ON_HAND_QTY(itemStruct.getITEM_STOCK_ON_HAND_QTY());
					_struct.setDEFECT_QTY(itemStruct.getDEFECT_QTY());
					_itemFlg = true;
				}
			}else{
				// �ۊǋ�ʐ��ԍ݌ɂ̏o�ɉ\�� �擾
				IssueStruct jobStruct = new IssueStruct();
				jobStruct = _dbAccessor.selectJobOdrCdStock(_struct);

				if(jobStruct != null)
				{
					_struct.setJOB_STOCK_ON_HAND_QTY(jobStruct.getJOB_STOCK_ON_HAND_QTY());
					_jobFlg = true;
				}
			}
		}

		// [���Ԉ���]�o�ɍϐ��E�����ϐ� �擾
		IssueStruct alcStruct = _dbAccessor.selectJobOdrAlc(_struct);

		if(alcStruct != null)
		{
			_struct.setALCD_QTY(alcStruct.getALCD_QTY());
			_struct.setISSUEED_QTY(alcStruct.getISSUEED_QTY());
		}

		// �s���b�N�pselect��
		_dbAccessor.selectIssueInst(_struct);
		_dbAccessor.selectOd(_struct);

	return _struct;
	}

	/** String�v�Z�����N���X */
	protected Calculate _calc;

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