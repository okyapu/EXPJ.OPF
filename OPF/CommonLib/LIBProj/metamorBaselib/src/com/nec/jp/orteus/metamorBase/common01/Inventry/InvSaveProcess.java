//------------------------------------------------------------------------------
// (#)InvSaveProcess.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2004/01/23 �V�K�쐬  M.Isoda
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.Inventry;

import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;

import java.util.ArrayList;
import java.util.List;

/**
 * �I���݌ɑޔ������N���X
 *
 * @author  M.Isoda
 * @version 1.00
*/
public class InvSaveProcess
{
//--------------------------------------------------------------------------
// �\�z

	/** �R���X�g���N�^ */
	public InvSaveProcess(){ clear(); }

	/** �R���X�g���N�^
	 *
	 * @param	strPlantCd		�H��R�[�h
	 * @param	strUserCd		���[�U�R�[�h
	 * @param	strProgramName	�v���O�������i�� AH0070B001�j
	 */
	public InvSaveProcess(
		String strPlantCd, 
		String strUserCd, 
		String strProgramName)
	{
		clear();
		_strPlantCd = strPlantCd;
		_strUserCd = strUserCd;
		_strProgramName = strProgramName;
		_msg = new InvMessageControl();
		_invSaveAccessor = 
			new InvSaveAccessor(_strPlantCd, _strUserCd, _strProgramName);
		_invGetAccessor = 
			new InvGetAccessor(_strPlantCd, _strUserCd, _strProgramName);
		_invUpdateAccessor = 
			new InvUpdateAccessor(_strPlantCd, _strUserCd, _strProgramName);
	}

//--------------------------------------------------------------------------
// �ϐ�

	/** �H��R�[�h�i�[�p */
	private String _strPlantCd = null;

	/** ���[�U�R�[�h�i�[�p */
	private String _strUserCd = null;

	/** �v���O�������i�[�p */
	private String _strProgramName = null;

	/** ���b�Z�[�W�Ǘ��N���X */
	private InvMessageControl _msg = null;

	/** �I���ޔ��A�N�Z�b�T�N���X */
	private InvSaveAccessor _invSaveAccessor = null;

	/** �I���擾�A�N�Z�b�T�N���X */
	private InvGetAccessor _invGetAccessor = null;

	/** �I���X�V�A�N�Z�b�T�N���X */
	private InvUpdateAccessor _invUpdateAccessor = null;

//--------------------------------------------------------------------------
// ���ʃ��\�b�h

	////////////////////////////////////////////////////////////////////////////
	/**
	 * �N���A
	 *
	 * @return	�Ȃ�
	 */
	public void clear()
	{
		_strPlantCd = null;
		_strUserCd = null;
		_strProgramName = null;
		_msg = null;
		_invSaveAccessor = null;
		_invGetAccessor = null;
		_invUpdateAccessor = null;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * ���b�Z�[�W�Ǘ��N���X�ݒ�
	 *
	 * @param	���b�Z�[�W�Ǘ��N���X
	 */
	public void setMessage(InvMessageControl msg)
	{
		_msg = msg;
	}

	/**
	 * ���b�Z�[�W�Ǘ��N���X�擾
	 *
	 * @return	���b�Z�[�W�Ǘ��N���X
	 */
	public InvMessageControl getMessage()
	{
		return _msg;
	}

//--------------------------------------------------------------------------
// ����

	////////////////////////////////////////////////////////////////////////////
	/**
	 * �ۊǋ�ʕi�ڍ݌ɑޔ�����
	 *
	 * @param	conn		DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	strInvDate	�I����
	 * @return	true:���� / false:���s
	 */
	public boolean saveItemStock(
		IDbConnection conn, 
		String strInvDate)
	{
		InvInformation info = new InvInformation();	// �Ώۏ��i�[�p
		int intDeleteCount = 0;	// �폜���R�[�h��
		int intInsertCount = 0;	// �ǉ����R�[�h��
		int intTargetCount = 0;	// �����Ώۃ��R�[�h��
		int intResult;			// ��������
		_msg.add(InvMessageControl.TYP_CONFIG, "", "\n(SBM1117)���������������������ۊǋ�ʕi�ڍ݌ɑޔ�����-�J�n");

		//-------------------------------------------------------------------
		// �@ �ۊǋ�ʕi�ڒI���폜�i����I�����̑O�񏈗��f�[�^�F�Ď��s�Ή��j
		//-------------------------------------------------------------------
		info.setINV_DATE(strInvDate);
		info.setPLANT_CD(_strPlantCd);
		_msg.add(InvMessageControl.TYP_CONFIG, "", ""
			+ "(SBM1118)�@ �ۊǋ�ʕi�ڒI���폜�i����I�����̑O�񏈗��f�[�^�F�Ď��s�Ή��j\n"
			+ " �I����:[ " + info.getINV_DATE() + " ]"
			+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
		);
		intDeleteCount = _invSaveAccessor.deleteItemInvTable(conn, info);
		if(intDeleteCount == -1)
		{
			// �G���[
			_msg.addCopy(_invSaveAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
			return false;
		}

		//-----------------------------------------------
		// �A �ۊǋ�ʕi�ڍ݌ɓǍ��i�I���Ώۃf�[�^�̂݁j
		//-----------------------------------------------
		_msg.add(InvMessageControl.TYP_CONFIG, "", "(SBM1119)�A �ۊǋ�ʐ��ԍ݌ɂ̓Ǎ��i�I���Ώۃf�[�^�̂݁j");
		// �ŐV�I�����擾
		info.setINV_DATE(strInvDate);
		info.setPLANT_CD(_strPlantCd);
		_msg.add(InvMessageControl.TYP_CONFIG, "", ""
			+ "(SBM1120)�ŐV�I�����擾\n"
			+ " �I����:[ " + info.getINV_DATE() + " ]"
			+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
		);
		info = _invGetAccessor.readInvCtrl(conn, info);
		if(info == null)
		{
			// �G���[
			_msg.addCopy(_invSaveAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
			return false;
		}
		// �݌ɏ��ꗗ�Ǎ�
		List listItemStock = null;						// �i�ڍ݌Ɉꗗ
		int intKindData = InvGetAccessor.DATA_NORMAL;	// �I���݌ɏ��
		int intKindStock = InvGetAccessor.STOCK_ITEM;	// �i�ڍ݌�
		info.setINV_DATE(strInvDate);
		info.setPLANT_CD(_strPlantCd);
		info.setWH_CD("%");
		info.setLOT_NO("%");
		info.setITEM_CD("%");
		_msg.add(InvMessageControl.TYP_CONFIG, "", ""
			+ "(SBM1121)�݌ɏ��ꗗ�Ǎ�\n"
			+ " �擾�����:[ �I���݌ɏ��:" + String.valueOf(intKindData) + " ]"
			+ " �݌Ɏ��:[ �i�ڍ݌�:" + String.valueOf(intKindStock) + " ]"
			+ " �I����:[ " + info.getINV_DATE() + " ]"
			+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
			+ " �ۊǋ�R�[�h:[ " + info.getWH_CD() + " ]"
		);
		_invGetAccessor.setMessage(_msg);
		listItemStock =_invGetAccessor.getStockList(conn, info, intKindData, intKindStock);
		_msg = _invGetAccessor.getMessage();
		if(listItemStock == null)
		{
			// �G���[
			_msg.addCopy(_invGetAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
			return false;
		}

		// �Ώۃf�[�^�����`�F�b�N
		intTargetCount = listItemStock.size();
		if(intTargetCount <= 0)
		{
			// �I�������ɊY������f�[�^���ۊǋ�ʕi�ڍ݌ɂɑ��݂��܂���ł���
			_msg.add(InvMessageControl.TYP_INFO, "AH60003", "");
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// �ڍ׏��
				+ " (SBM1122)�I����:[ " + info.getINV_DATE() + " ]"
				+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
				+ " �ۊǋ�R�[�h:[ " + info.getWH_CD() + " ]"
				+ " �擾�����:[ �I���݌ɏ�� ]"
				+ " �݌Ɏ��:[ �i�ڍ݌� ]"
			);
		}
		
		// �폜�d���s
		List itemInvList = new ArrayList();
		if(intTargetCount > 0){			
			itemInvList.add((InvInformation)listItemStock.get(0));
			InvInformation itemInvInfo;
			boolean flg = false;
			for(int i = 1; i < intTargetCount; i++){
				info = (InvInformation)listItemStock.get(i);
				flg = false;
				for (int j = 0; j < itemInvList.size(); j++) {
					itemInvInfo = (InvInformation)itemInvList.get(j);
					if(info.getWH_CD().equals(itemInvInfo.getWH_CD())&& 
							info.getITEM_CD().equals(itemInvInfo.getITEM_CD())){ 
						itemInvInfo.setSTOCK_ON_HAND_QTY(
								Calculate.add(info.getSTOCK_ON_HAND_QTY(),itemInvInfo.getSTOCK_ON_HAND_QTY()));
						flg = true;
					} 
				}
				if (!flg){
					itemInvList.add(info);
				}
			}
		}

		for(int i = 0; i < itemInvList.size(); i++)
		{
			// �Ǎ����擾
			info = (InvInformation)itemInvList.get(i);
			info.setINV_DATE(strInvDate);
			info.setPLANT_CD(_strPlantCd);
			info.setACTUAL_STOCK_QTY(info.getSTOCK_ON_HAND_QTY());
			info.setFINAL_BOOK_STOCK_QTY(info.getSTOCK_ON_HAND_QTY());

			//---------------------------
			// �B �ۊǋ�ʕi�ڒI���̒ǉ�
			//---------------------------
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				+ "(SBM1123)�B �ۊǋ�ʐ��ԒI���̒ǉ�(" + (i+1) + "����)\n"
				+ " s)�I����:[ " + info.getINV_DATE() + " ]"
				+ " s)�i�ڔԍ�:[ " + info.getITEM_CD() + " ]"
				+ " s)�ۊǋ�R�[�h:[ " + info.getWH_CD() + " ]"
				+ " s)�H��R�[�h:[ " + info.getPLANT_CD() + " ]"
				+ " s)���I��:[ " + info.getACTUAL_STOCK_QTY() + " ]"
				+ " s)�ŏI����݌ɐ�:[ " + info.getFINAL_BOOK_STOCK_QTY() + " ]"
				+ " s)�s�ǐ�:[ " + info.getDEFECT_QTY() + " ]"
			);
			intResult = _invSaveAccessor.insertItemInvTable(conn, info);
			if(intResult == -1)
			{
				// �G���[
				_msg.addCopy(_invSaveAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
				return false;
			}

			// �o�^���R�[�h���J�E���g
			intInsertCount++;
		}

		// ��������
		_msg.add(InvMessageControl.TYP_SUCCESS, "", ""
			// �ڍ׏��
			+ "(SBM1124)��������������������" 
			+ "\n �ۊǋ�ʕi�ڍ݌ɑޔ����������I" 
			+ "\n �ۊǋ�ʕi�ڒI���폜���R�[�h����:[ " + intDeleteCount + " ]"
			+ "\n �ۊǋ�ʕi�ڒI���ǉ����R�[�h����:[ " + intInsertCount + " ]"
		);

		return true;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * �ۊǋ�ʐ��ԍ݌ɑޔ�����
	 *
	 * @param	conn		DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	strInvDate	�I����
	 * @return	true:���� / false:���s
	 */
	public boolean saveJobOdrCdStock(
		IDbConnection conn, 
		String strInvDate)
	{
		InvInformation info = new InvInformation();	// �Ώۏ��i�[�p
		int intDeleteCount = 0;	// �폜���R�[�h��
		int intInsertCount = 0;	// �ǉ����R�[�h��
		int intTargetCount = 0;	// �����Ώۃ��R�[�h��
		int intResult;			// ��������
		_msg.add(InvMessageControl.TYP_CONFIG, "", "\n(SBM1125)���������������������ۊǋ�ʐ��ԍ݌ɑޔ�����-�J�n");

		//---------------------------------------------------------------------
		// �@ �ۊǋ�ʐ��ԒI���̍폜�i����I�����̑O�񏈗��f�[�^�F�Ď��s�Ή��j
		//---------------------------------------------------------------------
		info.setINV_DATE(strInvDate);
		info.setPLANT_CD(_strPlantCd);
		_msg.add(InvMessageControl.TYP_CONFIG, "", ""
			+ "(SBM1126)�@ �ۊǋ�ʐ��ԒI���̍폜�i����I�����̑O�񏈗��f�[�^�F�Ď��s�Ή��j\n"
			+ " �I����:[ " + info.getINV_DATE() + " ]"
			+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
		);
		intDeleteCount = _invSaveAccessor.deleteJobOdrCdInvTable(conn, info);
		if(intDeleteCount == -1)
		{
			// �G���[
			_msg.addCopy(_invSaveAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
			return false;
		}

		//-------------------------------------------------
		// �A �ۊǋ�ʐ��ԍ݌ɂ̓Ǎ��i�I���Ώۃf�[�^�̂݁j
		//-------------------------------------------------
		_msg.add(InvMessageControl.TYP_CONFIG, "", "(SBM1127)�A �ۊǋ�ʐ��ԍ݌ɂ̓Ǎ��i�I���Ώۃf�[�^�̂݁j");
				// �ŐV�I�����擾
				info.setINV_DATE(strInvDate);
				info.setPLANT_CD(_strPlantCd);
		_msg.add(InvMessageControl.TYP_CONFIG, "", ""
			+ "(SBM1120)�ŐV�I�����擾\n"
			+ " �I����:[ " + info.getINV_DATE() + " ]"
			+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
		);
		info = _invGetAccessor.readInvCtrl(conn, info);
		if(info == null)
		{
			// �G���[
			_msg.addCopy(_invSaveAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
			return false;
		}
		// �݌ɏ��ꗗ�Ǎ�
		List listJobOdrCdStock = null;					// ���ԍ݌Ɉꗗ
		int intKindData = InvGetAccessor.DATA_NORMAL;	// �I���݌ɏ��
		int intKindStock = InvGetAccessor.STOCK_JOB_ODR;// ���ԍ݌�
		info.setINV_DATE(strInvDate);
		info.setPLANT_CD(_strPlantCd);
		info.setWH_CD("%");
		info.setITEM_CD("%");
		_msg.add(InvMessageControl.TYP_CONFIG, "", ""
			+ "(SBM1121)�݌ɏ��ꗗ�Ǎ�\n"
			+ " �擾�����:[ �I���݌ɏ��:" + String.valueOf(intKindData) + " ]"
			+ " �݌Ɏ��:[ �i�ڍ݌�:]" + String.valueOf(intKindStock) + " ]"
			+ " �I����:[ " + info.getINV_DATE() + " ]"
			+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
			+ " �ۊǋ�R�[�h:[ " + info.getWH_CD() + " ]"
		);
		_invGetAccessor.setMessage(_msg);
		listJobOdrCdStock =_invGetAccessor.getStockList(conn, info, intKindData, intKindStock);
		_msg = _invGetAccessor.getMessage();
		if(listJobOdrCdStock == null)
		{
			// �G���[
			_msg.addCopy(_invGetAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
			return false;
		}

		// �Ώۃf�[�^�����`�F�b�N
		intTargetCount = listJobOdrCdStock.size();
		if(intTargetCount <= 0)
		{
			// �I�������ɊY������f�[�^���ۊǋ�ʐ��ԍ݌ɂɑ��݂��܂���ł���
			_msg.add(InvMessageControl.TYP_INFO, "AH60004", "");
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// �ڍ׏��
				+ " (SBM1128)�I����:[ " + info.getINV_DATE() + " ]"
				+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
				+ " �ۊǋ�R�[�h:[ " + info.getWH_CD() + " ]"
				+ " �擾�����:[ �I���݌ɏ�� ]"
				+ " �݌Ɏ��:[ ���ԍ݌� ]"
			);
		}

		for(int i = 0; i < intTargetCount; i++)
		{
			// �Ǎ����擾
			info = (InvInformation)listJobOdrCdStock.get(i);
			info.setINV_DATE(strInvDate);
			info.setPLANT_CD(_strPlantCd);
			info.setACTUAL_STOCK_QTY(info.getSTOCK_ON_HAND_QTY());
			info.setFINAL_BOOK_STOCK_QTY(info.getSTOCK_ON_HAND_QTY());

			//---------------------------
			// �B �ۊǋ�ʐ��ԒI���̒ǉ�
			//---------------------------
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				+ "(SBM1129)�B �ۊǋ�ʐ��ԒI���̒ǉ�(" + (i+1) + "����)\n"
				+ " s)�I����:[ " + info.getINV_DATE() + " ]"
				+ " s)����:[ " + info.getJOB_ODR_CD() + " ]"
				+ " s)�i�ڔԍ�:[ " + info.getITEM_CD() + " ]"
				+ " s)�ۊǋ�R�[�h:[ " + info.getWH_CD() + " ]"
				+ " s)�H��R�[�h:[ " + info.getPLANT_CD() + " ]"
				+ " s)���I��:[ " + info.getACTUAL_STOCK_QTY() + " ]"
				+ " s)�ŏI����݌ɐ�:[ " + info.getFINAL_BOOK_STOCK_QTY() + " ]"
			);
			intResult = _invSaveAccessor.insertJobOdrCdInvTable(conn, info);
			if(intResult == -1)
			{
				// �G���[
				_msg.addCopy(_invSaveAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
				return false;
			}

			// �o�^���R�[�h���J�E���g
			intInsertCount++;
		}

		// ��������
		_msg.add(InvMessageControl.TYP_SUCCESS, "", ""
			// �ڍ׏��
			+ "\n(SBM1130)��������������������" 
			+ "\n �ۊǋ�ʐ��ԍ݌ɑޔ����������I" 
			+ "\n �ۊǋ�ʐ��ԒI���폜���R�[�h����:[ " + intDeleteCount + " ]"
			+ "\n �ۊǋ�ʐ��ԒI���ǉ����R�[�h����:[ " + intInsertCount + " ]"
		);

		return true;
	}
	
	////////////////////////////////////////////////////////////////////////////
	/**
	 * ���b�g�ʕi�ڍ݌ɑޔ�����
	 *
	 * @param	conn		DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	strInvDate	�I����
	 * @return	true:���� / false:���s
	 */
	public boolean saveLotStock(
			IDbConnection conn, 
			String strInvDate)
		{
			InvInformation info = new InvInformation();	// �Ώۏ��i�[�p
			int intDeleteCount = 0;	// �폜���R�[�h��
			int intInsertCount = 0;	// �ǉ����R�[�h��
			int intTargetCount = 0;	// �����Ώۃ��R�[�h��
			int intResult;			// ��������
			_msg.add(InvMessageControl.TYP_CONFIG, "", "\n(SBM1131)�����������������������b�g�ʕi�ڍ݌ɑޔ�����-�J�n");

			//-------------------------------------------------------------------
			// �@���b�g�ԍ��ʒI���폜�i����I�����̑O�񏈗��f�[�^�F�Ď��s�Ή��j
			//-------------------------------------------------------------------
			info.setINV_DATE(strInvDate);
			info.setPLANT_CD(_strPlantCd);
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				+ "(SBM1132)�@ ���b�g�ʕi�ڒI���폜�i����I�����̑O�񏈗��f�[�^�F�Ď��s�Ή��j\n"
				+ " �I����:[ " + info.getINV_DATE() + " ]"
				+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
			);
	        intDeleteCount = _invSaveAccessor.deleteLotInvTable(conn, info);
			if(intDeleteCount == -1)
			{
				// �G���[
				_msg.addCopy(_invSaveAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
				return false;
			}

			//-----------------------------------------------
			// �A ���b�g�ԍ��ʕi�ڍ݌ɓǍ��i�I���Ώۃf�[�^�̂݁j
			//-----------------------------------------------
			_msg.add(InvMessageControl.TYP_CONFIG, "", "(SBM1133)�A ���b�g�ʕi�ڍ݌ɂ̓Ǎ��i�I���Ώۃf�[�^�̂݁j");
					// �ŐV�I�����擾
					info.setINV_DATE(strInvDate);
					info.setPLANT_CD(_strPlantCd);
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				+ "(SBM1120)�ŐV�I�����擾\n"
				+ " �I����:[ " + info.getINV_DATE() + " ]"
				+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
			);
	        info = _invGetAccessor.readInvCtrl(conn, info);
			if(info == null)
			{
				// �G���[
				_msg.addCopy(_invSaveAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
				return false;
			}
			// �݌ɏ��ꗗ�Ǎ�
			List listItemStock = null;					// �i�ڍ݌Ɉꗗ
			int intKindData = InvGetAccessor.DATA_LOT;	// ���b�g�݌ɏ��
			int intKindStock = InvGetAccessor.STOCK_LOT;// ���b�g�݌�
			info.setINV_DATE(strInvDate);
			info.setPLANT_CD(_strPlantCd);
			info.setWH_CD("%");
			info.setITEM_CD("%");
			info.setLOT_NO("%");
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				+ "(SBM1134)�݌ɏ��ꗗ�Ǎ�\n"
				+ " �擾�����:[ ���b�g�݌ɏ��:" + String.valueOf(intKindData) + " ]"
				+ " �݌Ɏ��:[ ���b�g�݌�:" + String.valueOf(intKindStock) + " ]"
				+ " �I����:[ " + info.getINV_DATE() + " ]"
				+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
				+ " �ۊǋ�R�[�h:[ " + info.getWH_CD() + " ]"
			);
			_invGetAccessor.setMessage(_msg);
			listItemStock =_invGetAccessor.getStockList(conn, info, intKindData, intKindStock);
			_msg = _invGetAccessor.getMessage();
			if(listItemStock == null)
			{
				// �G���[
				_msg.addCopy(_invGetAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
				return false;
			}

			// �Ώۃf�[�^�����`�F�b�N
			intTargetCount = listItemStock.size();
			if(intTargetCount <= 0)
			{
				// �I�������ɊY������f�[�^���ۊǋ�ʕi�ڍ݌ɂɑ��݂��܂���ł���
				_msg.add(InvMessageControl.TYP_INFO, "AH60009", "");
				_msg.add(InvMessageControl.TYP_CONFIG, "", ""
					// �ڍ׏��
					+ " (SBM1135)�I����:[ " + info.getINV_DATE() + " ]"
					+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
					+ " �ۊǋ�R�[�h:[ " + info.getWH_CD() + " ]"
					+ " �擾�����:[ �I���݌ɏ�� ]"
					+ " �݌Ɏ��:[ ���b�g�݌� ]"
				);
			}

			for(int i = 0; i < intTargetCount; i++)
			{
				// �Ǎ����擾
				info = (InvInformation)listItemStock.get(i);
				info.setINV_DATE(strInvDate);
				info.setPLANT_CD(_strPlantCd);
				info.setACTUAL_STOCK_QTY(info.getSTOCK_ON_HAND_QTY());
				info.setFINAL_BOOK_STOCK_QTY(info.getSTOCK_ON_HAND_QTY());
				info.setLOT_NO(info.getLOT_NO());

				//---------------------------
				// �B ���b�g�ԍ��ʒI���̒ǉ�
				//---------------------------
				_msg.add(InvMessageControl.TYP_CONFIG, "", ""
					+ "(SBM1136)�B ���b�g�ԍ��ʒI���̒ǉ�(" + (i+1) + "����)\n"
					+ " s)�I����:[ " + info.getINV_DATE() + " ]"
					+ " s)�i�ڔԍ�:[ " + info.getITEM_CD() + " ]"
					+ " s)�ۊǋ�R�[�h:[ " + info.getWH_CD() + " ]"
					+ " s)�H��R�[�h:[ " + info.getPLANT_CD() + " ]"
					+ " s)���I��:[ " + info.getACTUAL_STOCK_QTY() + " ]"
					+ " s)�ŏI����݌ɐ�:[ " + info.getFINAL_BOOK_STOCK_QTY() + " ]"
					+ " s)�s�ǐ�:[ " + info.getDEFECT_QTY() + " ]"
				);
				intResult = _invSaveAccessor.insertLotInvTable(conn, info);
				if(intResult == -1)
				{
					// �G���[
					_msg.addCopy(_invSaveAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
					return false;
				}

				// �o�^���R�[�h���J�E���g
				intInsertCount++;
			}

			// ��������
			_msg.add(InvMessageControl.TYP_SUCCESS, "", ""
				// �ڍ׏��
				+ "(SBM1137)��������������������" 
				+ "\n ���b�g�ԍ��ʕi�ڍ݌ɑޔ����������I" 
				+ "\n ���b�g�ԍ��ʕi�ڒI���폜���R�[�h����:[ " + intDeleteCount + " ]"
				+ "\n ���b�g�ԍ��ʕi�ڒI���ǉ����R�[�h����:[ " + intInsertCount + " ]"
			);

			return true;
		}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * �I������X�V����
	 *
	 * @param	conn		DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	strInvDate	�I����
	 * @return	true:���� / false:���s
	 */
	public boolean updateInvCtrl(
		IDbConnection conn, 
		String strInvDate)
	{
		InvInformation info = new InvInformation();	// �Ώۏ��i�[�p
		int intUpdateCount = 0;	// �X�V���R�[�h��
		_msg.add(InvMessageControl.TYP_CONFIG, "", "\n(SBM1138)���������������������I������X�V����-�J�n");

		//----------------------------
		// �I������Ǎ��i�r�����[�h�j
		//----------------------------
		List listInvCtrl = null;		// �I������ꗗ
		info.setINV_DATE(strInvDate);	// where
		info.setPLANT_CD(_strPlantCd);	// where
		_msg.add(InvMessageControl.TYP_CONFIG, "", ""
	+ "(SBM1139)�I������Ǎ��i�r�����[�h�j\n"
	+ " �I����:[ " + info.getINV_DATE() + " ]"
	+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
);
		listInvCtrl = _invUpdateAccessor.readInvCtrlTable4Update(conn, info);
		if(listInvCtrl == null)
		{
			// �G���[
			_msg.addCopy(_invUpdateAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
			return false;
		}

		//--------------
		// �I������X�V
		//--------------
		info.setINV_STS_TYP("1");		// set 1�i�I�����Ԓ��j��ݒ�
		info.setINV_DATE(strInvDate);	// where
		info.setPLANT_CD(_strPlantCd);	// where
		_msg.add(InvMessageControl.TYP_CONFIG, "", ""
	+ "(SBM1140)�I������X�V\n"
	+ " �I����ԋ敪:[ " + info.getINV_STS_TYP() + " ]"
	+ " �I����:[ " + info.getINV_DATE() + " ]"
	+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
);
		intUpdateCount = _invSaveAccessor.updateInvCtrlTable(conn, info);
		if(intUpdateCount == -1)
		{
			// �G���[
			_msg.addCopy(_invSaveAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
			return false;
		}

		// ��������
		_msg.add(InvMessageControl.TYP_SUCCESS, "", ""
			// �ڍ׏��
			+ "\n(SBM1141)��������������������" 
			+ "\n �I������X�V���������I" 
			+ "\n �I������X�V���R�[�h�����F[ " + intUpdateCount + " ]"
		);

		return true;
	}
}
