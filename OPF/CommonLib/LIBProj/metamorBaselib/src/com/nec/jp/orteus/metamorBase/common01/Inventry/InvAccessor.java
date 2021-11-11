//------------------------------------------------------------------------------
// (#)InvAccessor.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/12/15 �V�K�쐬  M.Isoda
// 2004/01/05 M.Isoda
//            ���t�ϊ�������DataConverter�N���X���g�p���ď�������悤�ɕύX
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.Inventry;

import com.nec.jp.orteus.util.CoreTools;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import java.util.List;

import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.metamorBase.common01.Accessor.PrivateConfig;
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.LotCtrl;

import java.lang.NumberFormatException;
import java.text.MessageFormat;
import java.sql.SQLException;

/**
 * �I���A�N�Z�b�T�N���X
 *
 * @author  M.Isoda
 * @version 1.00
*/
public class InvAccessor
{
//--------------------------------------------------------------------------
// �\�z

	/** �R���X�g���N�^ */
	public InvAccessor(){ clear(); }

	/** �R���X�g���N�^
	 *
	 * @param	strPlantCd		�H��R�[�h
	 */
	public InvAccessor(
		String strPlantCd)
	{
		clear();
		_strPlantCd = strPlantCd;
	}

	/** �R���X�g���N�^
	 *
	 * @param	strPlantCd		�H��R�[�h
	 * @param	strUserCd		���[�U�R�[�h
	 * @param	strProgramName	�v���O�������i�� AH0070B001�j
	 */
	public InvAccessor(
		String strPlantCd, 
		String strUserCd, 
		String strProgramName)
	{
		clear();
		_strPlantCd = strPlantCd;
		_strUserCd = strUserCd;
		_strProgramName = strProgramName;
		_msg = new InvMessageControl();
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

//--------------------------------------------------------------------------
// ���ʃ��\�b�h

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
	 * �I�����ꗗ�擾����
	 *
	 * @param	conn			DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	strInvDate		�I����
	 * @param	intKindData		�擾�����
	 * @param	intKindStock	�݌Ɏ��
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
		// ���������t���O������
		List list = null;

		// �g�p�N���X����
		InvGetProcess invGetProcess =
			new InvGetProcess(_strPlantCd, _strUserCd, _strProgramName);

		// ���b�Z�[�W�Ǘ��N���X�N���A
		_msg.clear();

		// �I�����ꗗ�̎擾
		list = invGetProcess.getStockList(conn, strInvDate, strKindData, strKindStock, strWhCd, strLotNo, strItemCd);
		_msg = invGetProcess.getMessage();	// �������ʃ��b�Z�[�W�擾

		return list;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * �I���X�V�����i�ۊǋ�ʕi�ڍ݌ɍX�V�j
	 *
	 * @param	conn			DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	strInvDate		�I����
	 * @return	true:���� / false:���s
	 */
	public boolean updateItemStock(
		IDbConnection conn, 
		String strInvDate)
	{
		// ���������t���O������
		boolean bSuccess = true;

		// �g�p�N���X����
		InvUpdateProcess invUpdateProcess =
			new InvUpdateProcess(_strPlantCd, _strUserCd, _strProgramName);

		// ���b�Z�[�W�Ǘ��N���X�N���A
		_msg.clear();

		// �ۊǋ�ʕi�ڍ݌ɂ̍X�V
		bSuccess = invUpdateProcess.updateItemStock(conn, strInvDate);
		_msg = invUpdateProcess.getMessage();	// �������ʃ��b�Z�[�W�擾

		return bSuccess;
	}
	////////////////////////////////////////////////////////////////////////////
	/**
	 * �I���X�V�����i���b�g�ʕi�ڍ݌ɍX�V�j
	 *
	 * @param	conn			DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	strInvDate		�I����
	 * @return	true:���� / false:���s
	 */
	public boolean updateLotStock(
		IDbConnection conn, 
		String strInvDate)
	{
		// ���������t���O������
		boolean bSuccess = true;

		// �g�p�N���X����
		InvUpdateProcess invUpdateProcess =
			new InvUpdateProcess(_strPlantCd, _strUserCd, _strProgramName);

		// ���b�Z�[�W�Ǘ��N���X�N���A
		_msg.clear();

		// �ۊǋ�ʕi�ڍ݌ɂ̍X�V
		bSuccess = invUpdateProcess.updateLotStock(conn, strInvDate);
		_msg = invUpdateProcess.getMessage();	// �������ʃ��b�Z�[�W�擾

		return bSuccess;
	}
	/**
	 * �I���X�V�����i�ۊǋ�ʐ��ԍ݌ɍX�V�j
	 *
	 * @param	conn			DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	strInvDate		�I����
	 * @return	true:���� / false:���s
	 */
	public boolean updateJobOdrCdStock(
		IDbConnection conn, 
		String strInvDate)
	{
		// ���������t���O������
		boolean bSuccess = true;

		// �g�p�N���X����
		InvUpdateProcess invUpdateProcess =
			new InvUpdateProcess(_strPlantCd, _strUserCd, _strProgramName);

		// ���b�Z�[�W�Ǘ��N���X�N���A
		_msg.clear();

		// �ۊǋ�ʐ��ԍ݌ɂ̍X�V
		bSuccess = invUpdateProcess.updateJobOdrCdStock(conn, strInvDate);
		_msg = invUpdateProcess.getMessage();	// �������ʃ��b�Z�[�W�擾

		return bSuccess;
	}
	/**
	 * �I���X�V�����i�I������X�V�j
	 *
	 * @param	conn			DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	strInvDate		�I����
	 * @return	true:���� / false:���s
	 */
	public boolean updateInvCtrl(
		IDbConnection conn, 
		String strInvDate)
	{
		// ���������t���O������
		boolean bSuccess = true;

		// �g�p�N���X����
		InvUpdateProcess invUpdateProcess =
			new InvUpdateProcess(_strPlantCd, _strUserCd, _strProgramName);

		// ���b�Z�[�W�Ǘ��N���X�N���A
		_msg.clear();

		// �I������̍X�V
		bSuccess = invUpdateProcess.updateInvCtrl(conn, strInvDate);
		_msg = invUpdateProcess.getMessage();	// �������ʃ��b�Z�[�W�擾

		return bSuccess;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * �I���폜����
	 *
	 * @param	conn			DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	strInvDate		�I����
	 * @return	true:���� / false:���s
	 */
	public boolean delete(
		IDbConnection conn, 
		String strInvDate)
	{
		// ���������t���O������
		boolean bSuccess = true;

		// �g�p�N���X����
		InvDeleteProcess invDeleteProcess =
			new InvDeleteProcess(_strPlantCd, _strUserCd, _strProgramName);

		// ���b�Z�[�W�Ǘ��N���X�N���A
		_msg.clear();

		// �ۊǋ�ʕi�ڒI���̍폜
		bSuccess = invDeleteProcess.deleteItemInv(conn, strInvDate);
		_msg = invDeleteProcess.getMessage();	// �������ʃ��b�Z�[�W�擾
		if(bSuccess != true)
		{
			// �G���[
			return false;
		}

		// �ۊǋ�ʐ��ԒI���̍폜
		bSuccess = invDeleteProcess.deleteJobOdrCdInv(conn, strInvDate);
		_msg = invDeleteProcess.getMessage();	// �������ʃ��b�Z�[�W�擾
		if(bSuccess != true)
		{
			// �G���[
			return false;
		}

		// �I������̍폜
		bSuccess = invDeleteProcess.deleteInvCtrl(conn, strInvDate);
		_msg = invDeleteProcess.getMessage();	// �������ʃ��b�Z�[�W�擾
		if(bSuccess != true)
		{
			// �G���[
			return false;
		}
		try {
			if(LotCtrl.checkLotCtrl(conn)){
				// ���b�g�ʕi�ڒI���̍폜
				bSuccess = invDeleteProcess.deleteLotInv(conn, strInvDate);
				_msg = invDeleteProcess.getMessage();	// �������ʃ��b�Z�[�W�擾
				if(bSuccess != true)
				{
					// �G���[
					return false;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			// �G���[
			return false;
		}

		return true;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * �I���ޔ�����
	 *
	 * @param	conn			DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	strInvDate		�I����
	 * @return	true:���� / false:���s
	 */
	public boolean save(
		IDbConnection conn, 
		String strInvDate)
	{
		// ���������t���O������
		boolean bSuccess = true;

		// �g�p�N���X����
		InvSaveProcess invSaveProcess =
			new InvSaveProcess(_strPlantCd, _strUserCd, _strProgramName);

		// ���b�Z�[�W�Ǘ��N���X�N���A
		_msg.clear();

		// �I������̍X�V
		bSuccess = invSaveProcess.updateInvCtrl(conn, strInvDate);_msg = invSaveProcess.getMessage();	// �������ʃ��b�Z�[�W�擾
		if(bSuccess != true)
		{
			// �G���[
			return false;
		}

		// �ۊǋ�ʕi�ڍ݌ɂ̑ޔ�
		bSuccess = invSaveProcess.saveItemStock(conn, strInvDate);
		_msg = invSaveProcess.getMessage();	// �������ʃ��b�Z�[�W�擾
		if(bSuccess != true)
		{
			// �G���[
			return false;
		}

		// ���ԕi�ڍ݌ɂ̑ޔ�
		bSuccess = invSaveProcess.saveJobOdrCdStock(conn, strInvDate);
		_msg = invSaveProcess.getMessage();	// �������ʃ��b�Z�[�W�擾
		if(bSuccess != true)
		{
			// �G���[
			return false;
		}
		try {
			if(LotCtrl.checkLotCtrl(conn)){
				// ���b�g�ʕi�ڍ݌ɂ̑ޔ�
				bSuccess = invSaveProcess.saveLotStock(conn, strInvDate);
				_msg = invSaveProcess.getMessage();	// �������ʃ��b�Z�[�W�擾
				if(bSuccess != true)
				{
					// �G���[
					return false;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			// �G���[
			return false;
		}

		return true;
	}

	////////////////////////////////////////////////////////////////////////////
	/** �I���^�C�v���p�����[�^�擾�A�N�Z�X�L�[ */
	private final String INV_FLG_ACCESS_KEY = "INV_FLG";

	/** �I����ԋ敪���p�����[�^�擾�A�N�Z�X�L�[ */
	private final String INV_STS_TYP_ACCESS_KEY = "INV_STS_TYP";

	/**
	 * �I����ԕ�����擾<br>
	 *<br>
	 * @param	conn				DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	strRegularInvFlg	����I���t���O
	 * @param	strCycleInvFlg		�z�I���t���O
	 * @param	strTempInvFlg		�Վ��I���t���O
	 * @param	strInvStsTyp		�I����ԋ敪
	 * @param	locale		        ���P�[��
	 * @return	�I����ԕ�����:���� / null:���s
	 */
	public String getInvStatus(
		IDbConnection conn,
		String strRegularInvFlg, 
		String strCycleInvFlg, 
		String strTempInvFlg, 
		String strInvStsTyp,
		String local)
 	{
		// ���b�Z�[�W���
		ExpjMessage emsg = null;

		// ����I��
		if("1".equals(strRegularInvFlg)) {
			if("0".equals(strInvStsTyp)) {
				emsg = new ExpjMessage("AH00052"); // ����I�����I�����{�O�ł��B
			} else if("1".equals(strInvStsTyp)) {
				emsg = new ExpjMessage("AH00053"); // ����I�����I�����Ԓ��ł��B
			} else if("2".equals(strInvStsTyp)) {
				emsg = new ExpjMessage("AH00054"); // ����I�����I���X�V�ςł��B
			}
		}
		
		// �z�I��
		if("1".equals(strCycleInvFlg)) {
			if("0".equals(strInvStsTyp)) {
				emsg = new ExpjMessage("AH00055"); // �z�I�����I�����{�O�ł��B
			} else if("1".equals(strInvStsTyp)) {
				emsg = new ExpjMessage("AH00056"); // �z�I�����I�����Ԓ��ł��B
			} else if("2".equals(strInvStsTyp)) {
				emsg = new ExpjMessage("AH00057"); // �z�I�����I���X�V�ςł��B
			}
		}
		
		// �Վ��I��
		if("1".equals(strTempInvFlg)) {
			if("0".equals(strInvStsTyp)) {
				emsg = new ExpjMessage("AH00058"); // �Վ��I�����I�����{�O�ł��B
			} else if("1".equals(strInvStsTyp)) {
				emsg = new ExpjMessage("AH00059"); // �Վ��I�����I�����Ԓ��ł��B
			} else if("2".equals(strInvStsTyp)) {
				emsg = new ExpjMessage("AH00060"); // �Վ��I�����I���X�V�ςł��B
			}
		}	
		return 	emsg.getMessage(local);
	}

	////////////////////////////////////////////////////////////////////////////

}
