//------------------------------------------------------------------------------
// (#)InvGetProcess.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2004/01/23 �V�K�쐬  M.Isoda
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.Inventry;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import java.util.List;

/**
 * �I�����擾�����N���X
 *
 * @author  M.Isoda
 * @version 1.00
*/
public class InvGetProcess
{
//--------------------------------------------------------------------------
// �\�z

	/** �R���X�g���N�^ */
	public InvGetProcess(){ clear(); }

	/** �R���X�g���N�^
	 *
	 * @param	strPlantCd		�H��R�[�h
	 * @param	strUserCd		���[�U�R�[�h
	 * @param	strProgramName	�v���O�������i�� AH0070B001�j
	 */
	public InvGetProcess(
		String strPlantCd, 
		String strUserCd, 
		String strProgramName)
	{
		clear();
		_strPlantCd = strPlantCd;
		_strUserCd = strUserCd;
		_strProgramName = strProgramName;
		_msg = new InvMessageControl();
		_invGetAccessor = new InvGetAccessor(_strPlantCd, _strUserCd, _strProgramName);
		_invCommon = new InvCommon();
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

	/** �I�����擾�A�N�Z�b�T�N���X */
	private InvGetAccessor _invGetAccessor = null;

	/** ���ʃN���X */
	private InvCommon _invCommon = null;

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
		_invGetAccessor = null;
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
	 * �擾����ޕʃf�[�^�擾<br>
	 *<br>
	 * @param	conn			DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	strInvDate		�I����
	 * @param	strKindData		�擾�����
	 * @param	strKindStock	�݌Ɏ��
	 * @param	strWhCd			�ۊǋ�R�[�h
	 * @param	strLotNo		���b�g
	 * @param	strItemCd		�i�ڔԍ�
	 * @return	���ꗗ:���� / null:���s
	 */
	public List getStockList(
		IDbConnection conn, 
		String strInvDate,
		String strKindData,
		String strKindStock,
		String strWhCd,
		String strLotNo,
		String strItemCd)

	{
		InvInformation info = new InvInformation();
		int intKindStock;	// �݌Ɏ��
		int intKindData;	// �擾�����

		// �݌Ɏ�ޕϊ��ݒ�
		if("0".equals(strKindStock) == true)
		{
			intKindStock = InvGetAccessor.STOCK_ITEM;
		}
		else
		{
			intKindStock = InvGetAccessor.STOCK_JOB_ODR;
		}

		// �擾����ޕϊ��ݒ�
		if("0".equals(strKindData) == true)
		{
			intKindData = InvGetAccessor.DATA_NORMAL;
		}
		else if("1".equals(strKindData) == true)
		{
			intKindData = InvGetAccessor.DATA_DEFECT;
		}
		else if("2".equals(strKindData) == true)
		{
			intKindData = InvGetAccessor.DATA_MINUS;
		}
		else
		{
			intKindData = InvGetAccessor.DATA_TRANSPORT;

			// �ϑ��̏ꍇ�͍݌Ɏ�ނɐϑ���ݒ�
			intKindStock = InvGetAccessor.STOCK_TRANSPORT;
		}

		// �ŐV���Ǎ�
		info.setINV_DATE(strInvDate);
		info.setPLANT_CD(_strPlantCd);
		info = _invGetAccessor.readInvCtrl(conn, info);
		if(info == null)
		{
			// �G���[
			_msg.addCopy(_invGetAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
			return null;
		}

		// �擾
		info.setINV_DATE(strInvDate);
		info.setPLANT_CD(_strPlantCd);
		info.setWH_CD(strWhCd);
		info.setLOT_NO(strLotNo);
		info.setITEM_CD(strItemCd);

		List list = _invGetAccessor.getStockList(conn, info, intKindData, intKindStock);
		if(list == null)
		{
			// �G���[
			_msg.addCopy(_invGetAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
			return null;
		}

		// �V�X�e�������擾
		String strDateTime = _invCommon.readSystemDateTime(conn);
		if(strDateTime == null)
		{
			// �V�X�e�������擾�Ɏ��s
			list = null;
			// �V�X�e�������擾�ɐ���
		}
		else
		{
			for(int i = 0; i < list.size(); i++)
			{
				// ���X�g���̃f�[�^�ɃV�X�e�����t��ݒ�
				InvInformation infoTemp = (InvInformation)list.get(i);
				infoTemp.setSYSTEM_DATETIME(strDateTime);
			}
		}
		return list;
	}
}
