//------------------------------------------------------------------------------
// (#)RcvProcess.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/08/21 �V�K�쐬 M.Hotokebuchi
// 2003/08/22 M.Hotokebuchi
//            ���ԍ݌ɂւ�insertSQL���s�����������߁A�C��
// 2003/08/26 M.Hotokebuchi
//            �Einfo,warning���x���̏o�͗p���X�g��ǉ�
//            �E���ʂ�Integer �� Double (int �� double) �ɕϊ�
// 2003/08/27 M.Hotokebuchi
//           �ESYSTEM�������擾���鏈����ǉ�
// 2003/08/28 M.Hotokebuchi
//           �EexecProcess()��SQLException��throw����悤�C��
// 2003/09/01 M.Hotokebuchi
//           �EDouble��String �Ή�
// 2003/09/18 M.Hotokebuchi
//           �E���o�ɐ���0�̏ꍇ�A�݌Ƀe�[�u���ɃA�N�Z�X���Ȃ��悤�C��
//           �EString�v�Z�����N���X�̃C���X�^���X��ǉ�
// 2003/10/20 M.Hotokebuchi
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
 * <B>RcvProcess</B><BR>
 * ���ɏ������C������<BR>
 * <BR>
 * @author  M.Hotokebuchi
 * @version 1.01
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
	 */
	public boolean execProcess() throws SQLException
	{
		RcvStruct _struct = createStruct();
		// �擾���s
		if(_struct == null)
		{
			return false;
		}
		RcvDBAccessor _dbAccessor = new RcvDBAccessor(_conn);

		// ���o�ɊǗ��ԍ��̑Ó����`�F�b�N
		// ���o�ɋ敪������or�s�Ǖi���ɂł��邱��
		if(_struct.getRCV_ISSUE_TYP().intValue() != _struct.ISSUE_RCV_TYP_RCV
			&& _struct.getRCV_ISSUE_TYP().intValue() != _struct.ISSUE_RCV_TYP_DEF_RCV)
		{
			_errorList.add("AF00072");
			return false;
		}

		// ���o�ɔ����敪�� �ʏ���ɁE�v��O���ɁE�ړ����ɁE�U�֓��ɁE���Ɏ���ł���
		if(_struct.getRCV_ISSUE_GNR_TYP().intValue() != _struct.GNR_TYP_DEFAULT
			&& _struct.getRCV_ISSUE_GNR_TYP().intValue() != _struct.GNR_TYP_OUTSIDE_OF_PLAN
			&& _struct.getRCV_ISSUE_GNR_TYP().intValue() != _struct.GNR_TYP_MOVE
			&& _struct.getRCV_ISSUE_GNR_TYP().intValue() != _struct.GNR_TYP_TRANSFER
			&& _struct.getRCV_ISSUE_GNR_TYP().intValue() != _struct.GNR_TYP_CANCEL)
		{
			_errorList.add("AF00073");
			return false;
		}

		// ���o�ɋ敪���s�Ǖi���ɂ̏ꍇ�A���o�ɔ����敪���v��O���ɂŁA�����Ԃ�NULL�ł���
		if(_struct.getRCV_ISSUE_TYP().intValue() == _struct.ISSUE_RCV_TYP_DEF_RCV
			&& (_struct.getRCV_ISSUE_GNR_TYP().intValue() != _struct.GNR_TYP_OUTSIDE_OF_PLAN
				|| _struct.getJOB_ODR_CD() != null))
		{
			_errorList.add("AF00074");
			return false;
		}

		// ���o�ɔ����敪���U�֓��ɂŁA���Ԃ�NULL�ł���
		if(_struct.getRCV_ISSUE_GNR_TYP().intValue() == _struct.GNR_TYP_TRANSFER
			&& _struct.getJOB_ODR_CD() != null)
		{
			_errorList.add("AF00075");
			return false;
		}

		// ���o�ɐ���0�̏ꍇ�A�ۊǋ�ʓ��o�ɂ��X�V���ďI��
		if(_calc.compare(_struct.getRCV_ISSUE_QTY(), "0") == 0)
		{
			// �ۊǋ�ʓ��o�Ƀe�[�u���̍X�V
			_dbAccessor.updateRcvIssue(_struct);

			return true;
		}

		// �s�Ǖi���ɂ̏ꍇ
		if(_struct.getRCV_ISSUE_TYP().intValue() == _struct.ISSUE_RCV_TYP_DEF_RCV)
		{
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
		if(_calc.compare(_struct.getRCV_ISSUE_QTY(), "0") != 0)
		{
			// ���ԕi���ǂ����`�F�b�N
			if(_struct.getJOB_ODR_CD() == null)
			{
				// �ۊǋ�ʕi�ڍ݌ɂ̏o�ɉ\��,�i�ڕʕs�ǐ� �擾
				RcvStruct itemStruct = new RcvStruct();
				itemStruct = _dbAccessor.selectItemStock(_struct);

				if(itemStruct != null)
				{
					_struct.setITEM_STOCK_ON_HAND_QTY(itemStruct.getITEM_STOCK_ON_HAND_QTY());
					_struct.setDEFECT_QTY(itemStruct.getDEFECT_QTY());
					_itemFlg = true;
				}
			}else{
				// �ۊǋ�ʐ��ԍ݌ɂ̏o�ɉ\�� �擾
				RcvStruct jobStruct = new RcvStruct();
				jobStruct = _dbAccessor.selectJobOdrCdStock(_struct);

				if(jobStruct != null)
				{
					_struct.setJOB_STOCK_ON_HAND_QTY(jobStruct.getJOB_STOCK_ON_HAND_QTY());
					_jobFlg = true;
				}
			}
		}

	return _struct;
	}

	/** String�v�Z�����N���X */
	protected Calculate _calc;

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