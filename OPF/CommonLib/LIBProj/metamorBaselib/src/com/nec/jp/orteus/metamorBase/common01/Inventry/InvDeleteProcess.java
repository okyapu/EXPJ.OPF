//------------------------------------------------------------------------------
// (#)InvDeleteProcess.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2004/01/23 �V�K�쐬  M.Isoda
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.Inventry;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import java.util.List;

/**
 * �I���݌ɍ폜�����N���X
 *
 * @author  M.Isoda
 * @version 1.00
*/
public class InvDeleteProcess
{
//--------------------------------------------------------------------------
// �\�z

	/** �R���X�g���N�^ */
	public InvDeleteProcess(){ clear(); }

	/** �R���X�g���N�^
	 *
	 * @param	strPlantCd		�H��R�[�h
	 * @param	strUserCd		���[�U�R�[�h
	 * @param	strProgramName	�v���O�������i�� AH0070B001�j
	 */
	public InvDeleteProcess(
		String strPlantCd, 
		String strUserCd, 
		String strProgramName)
	{
		clear();
		_strPlantCd = strPlantCd;
		_strUserCd = strUserCd;
		_strProgramName = strProgramName;
		_msg = new InvMessageControl();
		_invDeleteAccessor = new InvDeleteAccessor(_strPlantCd, _strUserCd, _strProgramName);
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

	/** �I���폜�A�N�Z�b�T�N���X */
	private InvDeleteAccessor _invDeleteAccessor = null;

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
		_invDeleteAccessor = null;
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
	 * �ۊǋ�ʕi�ڒI���̍폜����
	 *
	 * @param	conn		DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	strInvDate	�I����
	 * @return	true:���� / false:���s
	 */
	public boolean deleteItemInv(
		IDbConnection conn, 
		String strInvDate)
	{
		InvInformation info = new InvInformation();	// �Ώۏ��i�[�p
		int intDeleteCount = 0;	// �폜���R�[�h��
		_msg.add(InvMessageControl.TYP_CONFIG, "", "\n(SBM1078)���������������������ۊǋ�ʕi�ڒI���̍폜����-�J�n");

		//----------------------------------------------------
		// �ێ����Ԃ̓Ǎ��i�ێ����敪=9�F�ۊǋ�ʕi�ڒI���j
		//----------------------------------------------------
		List listSysMntPeriod = null;
		info.setPLANT_CD(_strPlantCd);
		info.setMNT_DATA_TYP("9");
		_msg.add(InvMessageControl.TYP_CONFIG, "", ""
	+ "(SBM1079)�ێ����Ԃ̓Ǎ��i�ێ����敪=9�F�ۊǋ�ʕi�ڒI���j\n"
	+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
	+ " �ێ����敪:[ " + info.getMNT_DATA_TYP() + " ]"
);
		listSysMntPeriod = _invDeleteAccessor.readSysMntPeriodTable(conn, info);
		if(listSysMntPeriod == null)
		{
			// �G���[
			_msg.addCopy(_invDeleteAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
			return false;
		}
		if(listSysMntPeriod.size() <= 0)
		{
			// �ێ����ԃf�[�^�����݂��Ȃ�
			_msg.add(InvMessageControl.TYP_INFO, "", ""
				+ "(SBM1080)�ێ����ԃf�[�^�����݂��܂���ł����B\n"
				+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
				+ " �ێ����敪:[ " + info.getMNT_DATA_TYP() + " ]�i�ۊǋ�ʕi�ڒI���j"
			);
		}
		else
		{
			InvInformation infoTemp = new InvInformation();
			infoTemp = (InvInformation)listSysMntPeriod.get(0);
			info.setPERIOD_DATE(infoTemp.getPERIOD_DATE());	// �폜����i�V�X�e�����t�|�ێ����ԁj
		_msg.add(InvMessageControl.TYP_CONFIG, "", ""
	// �ڍ׏��
	+ "(SBM1081)�ێ����ԓǍ����ʁi�ێ����敪=9�F�ۊǋ�ʕi�ڒI���j\n"
	+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
	+ " �폜����i�V�X�e�����t�|�ێ����ԁj:[ " + info.getPERIOD_DATE() + " ]"
	+ " �V�X�e�����t:[ " + infoTemp.getTODAY() + " ]"
	+ " �ێ�����:[ " + infoTemp.getMNT_PERIOD() + " ]"
);

			//------------------------------------------------------
			// �ۊǋ�ʕi�ڒI���̍폜�i�ێ����Ԃ𒴂����ߋ��f�[�^�j
			//------------------------------------------------------
		_msg.add(InvMessageControl.TYP_CONFIG, "", ""
	+ "(SBM1082)�ۊǋ�ʕi�ڒI���̍폜�i�ێ����Ԃ𒴂����ߋ��f�[�^�j\n"
	+ " �폜����i�V�X�e�����t�|�ێ����ԁj:[ " + info.getPERIOD_DATE() + " ]"
	+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
);
			intDeleteCount = _invDeleteAccessor.deleteItemInvTable(conn, info);
			if(intDeleteCount == -1)
			{
				// �G���[
				_msg.addCopy(_invDeleteAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
				return false;
			}
		}

		// ��������
				_msg.add(InvMessageControl.TYP_SUCCESS, "", ""
			// �ڍ׏��
			+ "\n(SBM1083)��������������������" 
			+ "\n �ۊǋ�ʕi�ڒI���̍폜���������I" 
			+ "\n �ێ����Ԓ����ۊǋ�ʕi�ڒI���폜���R�[�h����:[ " + intDeleteCount + " ]"
		);

		return true;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * �ۊǋ�ʐ��ԒI���̍폜����
	 *
	 * @param	conn		DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	strInvDate	�I����
	 * @return true:���� / false:���s
	 */
	public boolean deleteJobOdrCdInv(
		IDbConnection conn, 
		String strInvDate)
	{
		boolean bSuccess = true;	// ���������t���O
		InvInformation info = new InvInformation();	// �Ώۏ��i�[�p
		int intDeleteCount = 0;		// �폜���R�[�h��
		_msg.add(InvMessageControl.TYP_CONFIG, "", "\n(SBM1084)���������������������ۊǋ�ʐ��ԒI���̍폜����-�J�n");

		//-----------------------------------------------------
		// �ێ����Ԃ̓Ǎ��i�ێ����敪=10�F�ۊǋ�ʐ��ԒI���j
		//-----------------------------------------------------
		List listSysMntPeriod = null;
		info.setPLANT_CD(_strPlantCd);
		info.setMNT_DATA_TYP("10");
		_msg.add(InvMessageControl.TYP_CONFIG, "", ""
	+ "(SBM1085)�ێ����Ԃ̓Ǎ��i�ێ����敪=10�F�ۊǋ�ʐ��ԒI���j\n"
	+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
	+ " �ێ����敪:[ " + info.getMNT_DATA_TYP() + " ]"
);
		listSysMntPeriod = _invDeleteAccessor.readSysMntPeriodTable(conn, info);
		if(listSysMntPeriod == null)
		{
			// �G���[
			_msg.addCopy(_invDeleteAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
			return false;
		}
		if(listSysMntPeriod.size() <= 0)
		{
			// �ێ����ԃf�[�^�����݂��Ȃ�
				_msg.add(InvMessageControl.TYP_INFO, "", ""
				+ "(SBM1086)�ێ����ԃf�[�^�����݂��܂���ł����B\n"
				+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
				+ " �ێ����敪:[ " + info.getMNT_DATA_TYP() + " ]�i�ۊǋ�ʐ��ԒI���j"
			);
		}
		else
		{
			InvInformation infoTemp = new InvInformation();
			infoTemp = (InvInformation)listSysMntPeriod.get(0);
			info.setPERIOD_DATE(infoTemp.getPERIOD_DATE());	// �폜����i�V�X�e�����t�|�ێ����ԁj
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
	// �ڍ׏��
	+ "(SBM1087)�ێ����ԓǍ����ʁi�ێ����敪=10�F�ۊǋ�ʐ��ԒI���j\n"
	+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
	+ " �폜����i�V�X�e�����t�|�ێ����ԁj:[ " + info.getPERIOD_DATE() + " ]"
	+ " �V�X�e�����t:[ " + infoTemp.getTODAY() + " ]"
	+ " �ێ�����:[ " + infoTemp.getMNT_PERIOD() + " ]"
);

			//------------------------------------------------------
			// �ۊǋ�ʐ��ԒI���̍폜�i�ێ����Ԃ𒴂����ߋ��f�[�^�j
			//------------------------------------------------------
		_msg.add(InvMessageControl.TYP_CONFIG, "", ""
	+ "(SBM1094)�ۊǋ�ʐ��ԒI���̍폜�i�ێ����Ԃ𒴂����ߋ��f�[�^�j\n"
	+ " �폜����i�V�X�e�����t�|�ێ����ԁj:[ " + info.getPERIOD_DATE() + " ]"
	+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
);
			intDeleteCount = _invDeleteAccessor.deleteJobOdrCdInvTable(conn, info);
			if(intDeleteCount == -1)
			{
				// �G���[
				_msg.addCopy(_invDeleteAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
				return false;
			}

			// ��������
				_msg.add(InvMessageControl.TYP_SUCCESS, "", ""
				// �ڍ׏��
				+ "\n(SBM1095)��������������������" 
				+ "\n �ۊǋ�ʐ��ԒI���̍폜���������I" 
				+ "\n �ێ����Ԓ����ۊǋ�ʐ��ԒI���폜���R�[�h����:[ " + intDeleteCount + " ]"
			);
		}

		return true;
	}
	////////////////////////////////////////////////////////////////////////////
	/**
	 * ���b�g�ʕi�ڒI���̍폜����
	 *
	 * @param	conn		DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	strInvDate	�I����
	 * @return true:���� / false:���s
	 */
	public boolean deleteLotInv(
		IDbConnection conn, 
		String strInvDate)
	{
		boolean bSuccess = true;	// ���������t���O
		InvInformation info = new InvInformation();	// �Ώۏ��i�[�p
		int intDeleteCount = 0;		// �폜���R�[�h��
		_msg.add(InvMessageControl.TYP_CONFIG, "", "\n(SBM1096)�����������������������b�g�ʕi�ڒI���̍폜����-�J�n");

		//-----------------------------------------------------
		// �ێ����Ԃ̓Ǎ��i�ێ����敪=9�F���b�g�ʕi�ڒI���j
		//-----------------------------------------------------
		List listSysMntPeriod = null;
		info.setPLANT_CD(_strPlantCd);
		info.setMNT_DATA_TYP("9");
		_msg.add(InvMessageControl.TYP_CONFIG, "", ""
          + "(SBM1097)�ێ����Ԃ̓Ǎ��i�ێ����敪=9�F���b�g�ʕi�ڒI���j\n"
	      + " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
	      + " �ێ����敪:[ " + info.getMNT_DATA_TYP() + " ]"
		);
		listSysMntPeriod = _invDeleteAccessor.readSysMntPeriodTable(conn, info);
		if(listSysMntPeriod == null)
		{
			// �G���[
			_msg.addCopy(_invDeleteAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
			return false;
		}
		if(listSysMntPeriod.size() <= 0)
		{
			// �ێ����ԃf�[�^�����݂��Ȃ�
			_msg.add(InvMessageControl.TYP_INFO, "", ""
				+ "(SBM1098)�ێ����ԃf�[�^�����݂��܂���ł����B\n"
				+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
				+ " �ێ����敪:[ " + info.getMNT_DATA_TYP() + " ]�i���b�g�ʕi�ڒI���j"
			);
		}
		else
		{
			InvInformation infoTemp = new InvInformation();
			infoTemp = (InvInformation)listSysMntPeriod.get(0);
			info.setPERIOD_DATE(infoTemp.getPERIOD_DATE());	// �폜����i�V�X�e�����t�|�ێ����ԁj
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
	        // �ڍ׏��
	          + "(SBM1099)�ێ����ԓǍ����ʁi�ێ����敪=9�F���b�g�ʕi�ڒI���j\n"
	          + " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
	          + " �폜����i�V�X�e�����t�|�ێ����ԁj:[ " + info.getPERIOD_DATE() + " ]"
	          + " �V�X�e�����t:[ " + infoTemp.getTODAY() + " ]"
	          + " �ێ�����:[ " + infoTemp.getMNT_PERIOD() + " ]"
            );

			//------------------------------------------------------
			// ���b�g�ʕi�ڒI���̍폜�i�ێ����Ԃ𒴂����ߋ��f�[�^�j
			//------------------------------------------------------
            _msg.add(InvMessageControl.TYP_CONFIG, "", ""
	          + "(SBM1100)���b�g�ʕi�ڒI���̍폜�i�ێ����Ԃ𒴂����ߋ��f�[�^�j\n"
	          + " �폜����i�V�X�e�����t�|�ێ����ԁj:[ " + info.getPERIOD_DATE() + " ]"
	          + " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
            );
			intDeleteCount = _invDeleteAccessor.deleteLotInvTable(conn, info);
			if(intDeleteCount == -1)
			{
				// �G���[
				_msg.addCopy(_invDeleteAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
				return false;
			}

			// ��������
			_msg.add(InvMessageControl.TYP_SUCCESS, "", ""
				// �ڍ׏��
				+ "\n(SBM1101)��������������������" 
				+ "\n ���b�g�ʕi�ڒI���̍폜���������I" 
				+ "\n �ێ����Ԓ������b�g�ʕi�ڒI���폜���R�[�h����:[ " + intDeleteCount + " ]"
			);
		}

		return true;
	}
	////////////////////////////////////////////////////////////////////////////
	/**
	 * �I������̍폜����
	 *
	 * @param	conn		DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	strInvDate	�I����
	 * @return true:���� / false:���s
	 */
	public boolean deleteInvCtrl(
		IDbConnection conn, 
		String strInvDate)
	{
		InvInformation info = new InvInformation();	// �Ώۏ��i�[�p
		int intInvTargetWhCount = 0;	// �I�������ۊǋ�w��p�폜���R�[�h��
		int intInvTargetItemCount = 0;	// �I�������i�ڎw��p�폜���R�[�h��
		int intInvCtrlCount = 0;		// �I������p�폜���R�[�h��
		_msg.add(InvMessageControl.TYP_CONFIG, "", "\n(SBM1102)���������������������I������̍폜����-�J�n");

		//--------------------------------------------
		// �ێ����Ԃ̓Ǎ��i�ێ����敪=8�F�I������j
		//--------------------------------------------
		List listSysMntPeriod = null;
		info.setPLANT_CD(_strPlantCd);
		info.setMNT_DATA_TYP("8");
		_msg.add(InvMessageControl.TYP_CONFIG, "", ""
	+ "(SBM1103)�ێ����Ԃ̓Ǎ��i�ێ����敪=8�F�I������j\n"
	+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
	+ " �ێ����敪:[ " + info.getMNT_DATA_TYP() + " ]"
);
		listSysMntPeriod = _invDeleteAccessor.readSysMntPeriodTable(conn, info);
		if(listSysMntPeriod == null)
		{
			// �G���[
			_msg.addCopy(_invDeleteAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
			return false;
		}
		if(listSysMntPeriod.size() <= 0)
		{
			// �ێ����ԃf�[�^�����݂��Ȃ�
			_msg.add(InvMessageControl.TYP_INFO, "", ""
				+ "(SBM1104)�ێ����ԃf�[�^�����݂��܂���ł����B\n"
				+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
				+ " �ێ����敪:[ " + info.getMNT_DATA_TYP() + " ]�i�I������j"
			);
		}
		else
		{
			InvInformation infoTemp = new InvInformation();
			infoTemp = (InvInformation)listSysMntPeriod.get(0);
			info.setPERIOD_DATE(infoTemp.getPERIOD_DATE());	// �폜����i�V�X�e�����t�|�ێ����ԁj
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
	// �ڍ׏��
	+ "(SBM1105)�ێ����ԓǍ����ʁi�ێ����敪=8�F�I������j\n"
	+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
	+ " �폜����i�V�X�e�����t�|�ێ����ԁj:[ " + info.getPERIOD_DATE() + " ]"
	+ " �V�X�e�����t:[ " + infoTemp.getTODAY() + " ]"
	+ " �ێ�����:[ " + infoTemp.getMNT_PERIOD() + " ]"
);

			//--------------------------------------------------------
			// �I�������ۊǋ�w��̍폜�i�ێ����Ԃ𒴂����ߋ��f�[�^�j
			//--------------------------------------------------------
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
	+ "(SBM1106)�I�������ۊǋ�w��̍폜�i�ێ����Ԃ𒴂����ߋ��f�[�^�j\n"
	+ " �폜����i�V�X�e�����t�|�ێ����ԁj:[ " + info.getPERIOD_DATE() + " ]"
	+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
);
			intInvTargetWhCount = _invDeleteAccessor.deleteInvTargetWhTable(conn, info);
			if(intInvTargetWhCount == -1)
			{
				// �G���[
				_msg.addCopy(_invDeleteAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
				return false;
			}

			//------------------------------------------------------
			// �I�������i�ڎw��̍폜�i�ێ����Ԃ𒴂����ߋ��f�[�^�j
			//------------------------------------------------------
		_msg.add(InvMessageControl.TYP_CONFIG, "", ""
	+ "(SBM1107)�I�������i�ڎw��̍폜�i�ێ����Ԃ𒴂����ߋ��f�[�^�j\n"
	+ " �폜����i�V�X�e�����t�|�ێ����ԁj:[ " + info.getPERIOD_DATE() + " ]"
	+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
);
			intInvTargetItemCount = _invDeleteAccessor.deleteInvTargetItemTable(conn, info);
			if(intInvTargetItemCount == -1)
			{
				// �G���[
				_msg.addCopy(_invDeleteAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
				return false;
			}

			//----------------------------------------------
			// �I������̍폜�i�ێ����Ԃ𒴂����ߋ��f�[�^�j
			//----------------------------------------------
		_msg.add(InvMessageControl.TYP_CONFIG, "", ""
	+ "(SBM1108)�I������̍폜�i�ێ����Ԃ𒴂����ߋ��f�[�^�j\n"
	+ " �폜����i�V�X�e�����t�|�ێ����ԁj:[ " + info.getPERIOD_DATE() + " ]"
	+ " �H��R�[�h:[ " + info.getPLANT_CD() + " ]"
);
			intInvCtrlCount = _invDeleteAccessor.deleteInvCtrlTable(conn, info);
			if(intInvCtrlCount == -1)
			{
				// �G���[
				_msg.addCopy(_invDeleteAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
				return false;
			}

		}
		// ��������
		_msg.add(InvMessageControl.TYP_SUCCESS, "", ""
			// �ڍ׏��
			+ "\n(SBM1109)��������������������" 
			+ "\n �I������̍폜���������I" 
			+ "\n �I�������ۊǋ�w��̍폜���R�[�h����:[ " + intInvTargetWhCount + " ]"
			+ "\n �I�������i�ڎw��̍폜���R�[�h����:[ " + intInvTargetItemCount + " ]"
			+ "\n �I������̍폜���R�[�h����:[ " + intInvCtrlCount + " ]"
		);

		return true;
	}
}
