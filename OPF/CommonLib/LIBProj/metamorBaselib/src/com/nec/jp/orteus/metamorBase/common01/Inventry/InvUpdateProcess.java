//------------------------------------------------------------------------------
// (#)InvUpdateProcess.java
//
// Copyright (c) 2004 NEC Informatec Systems,Ltd.
//
// 2004/01/23 �V�K�쐬  M.Isoda
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.Inventry;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;

import java.sql.SQLException;
import java.util.List;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.metamorBase.common04.sysdata.*;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
/**
 * �I���X�V�����N���X
 *
 * @author  M.Isoda
 * @version 1.00
*/
public class InvUpdateProcess
{
//--------------------------------------------------------------------------
// �\�z

	/** �R���X�g���N�^ */
	public InvUpdateProcess(){ clear(); }

	/** �R���X�g���N�^
	 *
	 * @param	strPlantCd		�H��R�[�h
	 * @param	strUserCd		���[�U�R�[�h
	 * @param	strProgramName	�v���O�������i�� AH0070B001�j
	 */
	public InvUpdateProcess(
		String strPlantCd, 
		String strUserCd, 
		String strProgramName)
	{
		clear();
		_strPlantCd = strPlantCd;
		_strUserCd = strUserCd;
		_strProgramName = strProgramName;
		_msg = new InvMessageControl();
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

	////////////////////////////////////////////////////////////////////////////
	/**
	 * �V�݌ɐ��Z�o
	 *
	 * @param	info	�p�����[�^���
	 * @return	�V�݌ɐ�������
	 */
	private String calculateNewStock(
		InvInformation info)
	{
		// �v�Z�Ώۓ��e�`�F�b�N
		String strStockInHandQty = info.getSTOCK_ON_HAND_QTY();
		String strFinalBookStockQty = info.getFINAL_BOOK_STOCK_QTY();
		String strSumRecIssueQty = info.getw_SUM_RCV_ISSUE_QTY();
		String strActualStockQty = info.getACTUAL_STOCK_QTY();

		// ���ѓ����I�����ȍ~�̓��o�ɐ������݌Ɂ|�i�Z�[�u�݌Ɂ{�x��`�[�j
		// wk�� = �AstrStockInHandQty - (�@strFinalBookStockQty + �BstrSumRecIssueQty)
		String strWork = Calculate.subtract(strStockInHandQty, Calculate.add(strFinalBookStockQty, strSumRecIssueQty) );
		// �V�݌ɐ������I���{���ѓ����I�����ȍ~�̓��o�ɐ�
		// �V�݌ɐ� = �@strActualStockQty + wk��
		String strNewStock = Calculate.add(strActualStockQty, strWork);

		return strNewStock;
	}

//--------------------------------------------------------------------------
// ����

	////////////////////////////////////////////////////////////////////////////
	/**
	 * �ۊǋ�ʕi�ڍ݌ɍX�V����
	 *
	 * @param	conn		DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	strInvDate	�I����
	 * @return	true:���� / false:���s
	 */
	public boolean updateItemStock(
		IDbConnection conn, 
		String strInvDate)
	{
		InvInformation info = new InvInformation();	// �Ώۏ��i�[�p
		boolean bSuccess = true;	// ���������t���O
		int intUpdateCount = 0;		// �X�V���R�[�h��
		//��ЃR�[�h�擾
		MyCompanyStruct companystruct = new MyCompanyStruct();
		try {
			 companystruct = MyCompanyControl.getData(conn);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (DataNotFoundException e) {
			e.printStackTrace();
		}
		//---------------------------------------
		// �@ �ۊǋ�ʕi�ڒI���Ǎ��i�r�����[�h�j
		//---------------------------------------
		List listItemInv = null;
		info.setINV_DATE(strInvDate);	// where
		info.setPLANT_CD(_strPlantCd);	// where
		listItemInv = _invUpdateAccessor.readItemInvTable4Update(conn, info);
		if(listItemInv == null)
		{
			// �G���[
			_msg.addCopy(_invUpdateAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
			bSuccess = false;
		}

		// ���������̏ꍇ
		if(bSuccess == true)
		{
			boolean bIsStock;			// �݌ɑ��݃t���O
			InvInformation infoTemp;	// ���R�[�h���ޔ�p
			List listTemp;				// ���X�g���ޔ�p
			String strRcvIssueCtrlCd;	// �����̔ԃR�[�h�ޔ�p
			int intResultCount;			// �������R�[�h���ޔ�p
			String strStockOnHandQty;	// �݌ɐ��ޔ�p
			String strSumRcvIssueQty;	// ���o�ɏW�v���ޔ�p
			String strNewStock;			// �V�݌ɐ��ޔ�p
			for(int i = 0; i < listItemInv.size(); i++)
			{
				// �Ǎ����擾
				info = (InvInformation)listItemInv.get(i);
				info.setINV_DATE(strInvDate);
				info.setPLANT_CD(_strPlantCd);
				info.setJOB_ODR_CD(null);
				System.out.println("(SBM1147)���������� �X�V�Ώەۊǋ�ʕi�ڒI�����R�[�h�F" + (i+1) + " ���� ����������"
	+ "\n���R�[�h���"
	+ "\n             INV_DATE�F" + info.getINV_DATE()
	+ "\n             PLANT_CD�F" + info.getPLANT_CD()
	+ "\n              ITEM_CD�F" + info.getITEM_CD()
	+ "\n                WH_CD�F" + info.getWH_CD()
	+ "\n           JOB_ODR_CD�F" + info.getJOB_ODR_CD()
	+ "\n     ACTUAL_STOCK_QTY�F" + info.getACTUAL_STOCK_QTY()
	+ "\n FINAL_BOOK_STOCK_QTY�F" + info.getFINAL_BOOK_STOCK_QTY()
);

				// -------------------------------------------------------
				// �A �ۊǋ�ʓ��o�ɓǍ��i�x��`�[�̓��o�ɐ����W�v�擾�j
				// -------------------------------------------------------
				System.out.println("(SBM1149)�A�ۊǋ�ʓ��o�ɓǍ�");
				// INV_DATE // where �㕔�Őݒ�ς�
				// PLANT_CD // where �㕔�Őݒ�ς�
				// JOB_ODR_CD // where �㕔�Őݒ�ς�
				// ITEM_CD // where �㕔�Őݒ�ς�
				// WH_CD // where �㕔�Őݒ�ς�
				listTemp = _invUpdateAccessor.readRcvIssueTable(conn, info);
				if (listTemp == null) {
					// �G���[
					_msg.addCopy(_invUpdateAccessor.getMessage()); // �������ʃ��b�Z�[�W�擾�ǉ�
					bSuccess = false;
					break;
				}
				// �x��`�[�̓��o�ɏW�v�����擾
				strSumRcvIssueQty = "0"; // ���o�ɏW�v����0(�[��)�ŏ�����
				if (listTemp.size() > 0) {
					// �f�[�^�����݂����ꍇ�A�W�v�����擾
					infoTemp = (InvInformation) listTemp.get(0);
					strSumRcvIssueQty = infoTemp.getw_SUM_RCV_ISSUE_QTY();
				}
				
				System.out.println("(SBM1150)�A �ۊǋ�ʓ��o�ɓǍ��I��"
		+ "\n r) w_SUM_RCV_ISSUE_QTY�F" + strSumRcvIssueQty
		+ "\n �Ǎ������F" + listTemp.size());

				// �ŏI����݌ɐ� + �x��`�[ <> ���I�����A�V�݌ɐ����Z�o
				if(Calculate.compare(Calculate.add(info.getFINAL_BOOK_STOCK_QTY(), strSumRcvIssueQty), 
						info.getACTUAL_STOCK_QTY()) == 0) {
					continue;
				}
	
				//---------------------------------------
				// �B �ۊǋ�ʕi�ڍ݌ɓǍ��i�r�����[�h�j
				//---------------------------------------
				System.out.println("(SBM1151)�B �ۊǋ�ʕi�ڍ݌ɓǍ�");
				//ITEM_CD						// where �㕔�Őݒ�ς�
				//WH_CD							// where �㕔�Őݒ�ς�
				info.setPLANT_CD(_strPlantCd);	// where
				listTemp = _invUpdateAccessor.readItemStockTable4Update(conn, info);
				if(listTemp == null)
				{
					// �G���[
					_msg.addCopy(_invUpdateAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
					bSuccess = false;
					break;
				}
				// �i�ڍ݌ɐ��擾
				strStockOnHandQty = "0";	// �i�ڍ݌ɐ���0(�[��)�ŏ�����
				bIsStock = false;			// �i�ڍ݌ɑ��݃t���O���Ȃ��ŏ�����
				if(listTemp.size() > 0)
				{
					// �i�ڍ݌ɂ����݂���
					bIsStock = true;
					infoTemp = (InvInformation)listTemp.get(0);
					strStockOnHandQty = infoTemp.getSTOCK_ON_HAND_QTY();
				}
				System.out.println("(SBM1152)�B �ۊǋ�ʕi�ڍ݌ɓǍ��I��"
	+ "\n r) STOCK_ON_HAND_QTY�F" + strStockOnHandQty
	+ "\n �Ǎ������F" + listTemp.size()
);
				//------------------------------------------------------
				// ���b�g�Ǘ��t���O�̎擾
				//------------------------------------------------------
                _invUpdateAccessor.readLotCtrlFlg(conn, info);
                
				//-----------------
				// �C �V�݌ɐ��Z�o
				//-----------------
				info.setSTOCK_ON_HAND_QTY(strStockOnHandQty);
				info.setw_SUM_RCV_ISSUE_QTY(strSumRcvIssueQty);
				strNewStock = calculateNewStock(info);	// �V�݌ɐ��擾
				System.out.println("(SBM1153)�C �V�݌ɐ��Z�o��"
	+ "\n �Z�[�u�݌�(FINAL_BOOK_STOCK_QTY)�F" + info.getFINAL_BOOK_STOCK_QTY()
	+ "\n ���݌�(STOCK_ON_HAND_QTY)�F" + info.getSTOCK_ON_HAND_QTY()
	+ "\n �x��`�[(SUM_RCV_ISSUE_QTY)�F" + info.getw_SUM_RCV_ISSUE_QTY()
	+ "\n �V�݌ɁF" + strNewStock);

				if(bIsStock == true)
				{
					// �i�ڍ݌ɂ����݂���

					//------------------------------------------
					// �D-1 �ۊǋ�ʕi�ڍ݌ɍX�V�i�V�݌ɐ����f�j
					//------------------------------------------
					System.out.println("(SBM1154)�D-1 �ۊǋ�ʕi�ڍ݌ɍX�V - �i�ڍ݌ɂ����݂���");
					info.setSTOCK_ON_HAND_QTY(strNewStock);	// set
					//ITEM_CD								// where �㕔�Őݒ�ς�
					//PLANT_CD								// where �㕔�Őݒ�ς�
					//WH_CD									// where �㕔�Őݒ�ς�
					intResultCount = _invUpdateAccessor.updateItemStockTable(conn, info);
					if(intResultCount == -1)
					{
						// �G���[
						_msg.addCopy(_invUpdateAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
						bSuccess = false;
						break;
					}
					System.out.println("(SBM1155)�D-1 �ۊǋ�ʕi�ڍ݌ɍX�V�I�� - �i�ڍ݌ɂ����݂���B�X�V�����F" + intResultCount);
                    //���b�g�Ǘ��t���O��1�̏ꍇ
                    if (!(info.getLOT_CTRL_FLG() != null && "1".equals(info.getLOT_CTRL_FLG()))){
    					//-------------------------------
    					// �E �ۊǋ�ʓ��o�ɓo�^�i�ԓ`�j
    					//-------------------------------
                    	System.out.println("(SBM1156)�E �ۊǋ�ʓ��o�ɓo�^�i�ԓ`�j - �i�ڍ݌ɂ����݂���");
    					strRcvIssueCtrlCd = _invUpdateAccessor.getRcvIssueCtrlCd(conn);	// ���o�ɊǗ��ԍ��̎����̔�
    					if(strRcvIssueCtrlCd == null)
    					{
    						// �G���[
    						_msg.addCopy(_invUpdateAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
    						bSuccess = false;
    						break;
    					}
    					info.setRCV_ISSUE_CTRL_CD(strRcvIssueCtrlCd);						// set �̔Ԍ�̓��o�ɊǗ��ԍ���ݒ�
    					info.setRCV_ISSUE_TYP("2");											// set �ԓ`�� 2 ��ݒ�
    					//ITEM_CD															// set �㕔�Őݒ�ς�
    					//PLANT_CD															// set �㕔�Őݒ�ς�
    					//WH_CD																// set �㕔�Őݒ�ς�
    					//JOB_ODR_CD														// set �㕔�Őݒ�ς�
    					info.setRCV_ISSUE_QTY(Calculate.multiply(strStockOnHandQty, "-1"));	// set �X�V�O�̕i�ڎ莝�݌ɐ����}�C�i�X�ϊ�
    					info.setSAVE_STOCK_HAND_QTY(strStockOnHandQty);						// set �O�㐔�Z�b�g�p�Ɏ莝���݌ɐ����Z�b�g
    					info.setRCV_ISSUE_DATE(strInvDate);									// set �I������ݒ�
    					info.setRCV_ISSUE_GNR_TYP("28");									// set 28�i�I�������o�Ɂj��ݒ�
    					info.setSTOCK_UPD_TYP("2");											// set 2�i�X�V�ς݁j��ݒ�
    					info.setRCV_ISSUE_CMPLT_FLG("0");									// set 0�i���j��ݒ�
    				    info.setCOMPANY_CD(companystruct.getCOMPANY_CD());                  // set ��ЃR�[�h
    					intResultCount = _invUpdateAccessor.insertRcvIssueTable(conn, info);
    					if(intResultCount == -1)
    					{
    						// �G���[
    						_msg.addCopy(_invUpdateAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
    						bSuccess = false;
    						break;
    					}
    					System.out.println("(SBM1157)�E �ۊǋ�ʓ��o�ɓo�^�I���i�ԓ`�j - �i�ڍ݌ɂ����݂���B�o�^�����F" + intResultCount);

    					//-------------------------------
    					// �E �ۊǋ�ʓ��o�ɓo�^�i���`�j
    					//-------------------------------
    					System.out.println("(SBM1158)�E �ۊǋ�ʓ��o�ɓo�^�i���`�j - �i�ڍ݌ɂ����݂���");
    					strRcvIssueCtrlCd = _invUpdateAccessor.getRcvIssueCtrlCd(conn);	// ���o�ɊǗ��ԍ��̎����̔�
    					if(strRcvIssueCtrlCd == null)
    					{
    						// �G���[
    						_msg.addCopy(_invUpdateAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
    						bSuccess = false;
    						break;
    					}
    					info.setRCV_ISSUE_CTRL_CD(strRcvIssueCtrlCd);	// set �̔Ԍ�̓��o�ɊǗ��ԍ���ݒ�
    					info.setRCV_ISSUE_TYP("1");						// set ���`�� 1 ��ݒ�
    					//ITEM_CD										// set �㕔�Őݒ�ς�
    					//PLANT_CD										// set �㕔�Őݒ�ς�
    					//WH_CD											// set �㕔�Őݒ�ς�
    					//JOB_ODR_CD									// set �㕔�Őݒ�ς�
    					info.setRCV_ISSUE_QTY(strNewStock);				// set �V�݌ɐ���ݒ�
    					info.setSAVE_STOCK_HAND_QTY("0");				// set �O�㐔�Z�b�g�p��0���Z�b�g
    					info.setRCV_ISSUE_DATE(strInvDate);				// set �I������ݒ�
    					info.setRCV_ISSUE_GNR_TYP("28");				// set 28�i�I�������o�Ɂj��ݒ�
    					info.setSTOCK_UPD_TYP("2");						// set 2�i�X�V�ς݁j��ݒ�
    					info.setRCV_ISSUE_CMPLT_FLG("0");				// set 0�i���j��ݒ�
    				    info.setCOMPANY_CD(companystruct.getCOMPANY_CD());    // set ��ЃR�[�h
    					intResultCount = _invUpdateAccessor.insertRcvIssueTable(conn, info);
    					if(intResultCount == -1)
    					{
    						// �G���[
    						_msg.addCopy(_invUpdateAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
    						bSuccess = false;
    						break;
    					}
    					System.out.println("(SBM1159)�E �ۊǋ�ʓ��o�ɓo�^�I���i���`�j - �i�ڍ݌ɂ����݂���B�o�^�����F" + intResultCount);	
                    }
				}
				else
				{
					// �i�ڍ݌ɂ����݂��Ȃ�

					//-------------------------------------------
					// �D-2 �ۊǋ�ʕi�ڍ݌ɓo�^�i�V�݌ɐ����f�j
					//-------------------------------------------
					System.out.println("(SBM1160)�D-2 �ۊǋ�ʕi�ڍ݌ɓo�^ - �i�ڍ݌ɂ����݂��Ȃ�");
					//ITEM_CD		// �㕔�Őݒ�ς�
					//WH_CD			// �㕔�Őݒ�ς�
					//PLANT_CD		// �㕔�Őݒ�ς�
					info.setSTOCK_ON_HAND_QTY(strNewStock);
					intResultCount = _invUpdateAccessor.insertItemStockTable(conn, info);
					if(intResultCount == -1)
					{
						// �G���[
						_msg.addCopy(_invUpdateAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
						bSuccess = false;
						break;
					}
					System.out.println("(SBM1161)�D-2 �ۊǋ�ʕi�ڍ݌ɓo�^�I�� - �i�ڍ݌ɂ����݂��Ȃ��B�o�^�����F" + intResultCount);

                    //���b�g�Ǘ��t���O��1�̏ꍇ
                    if (!(info.getLOT_CTRL_FLG() != null && "1".equals(info.getLOT_CTRL_FLG()))){
    					//-------------------------------
    					// �E �ۊǋ�ʓ��o�ɓo�^�i���`�j
    					//-------------------------------
                    	System.out.println("(SBM1162)�E �ۊǋ�ʓ��o�ɓo�^�i���`�j - �i�ڍ݌ɂ����݂��Ȃ�");
    					strRcvIssueCtrlCd = _invUpdateAccessor.getRcvIssueCtrlCd(conn);	// ���o�ɊǗ��ԍ��̎����̔�
    					if(strRcvIssueCtrlCd == null)
    					{
    						// �G���[
    						_msg.addCopy(_invUpdateAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
    						bSuccess = false;
    						break;
    					}
    					info.setRCV_ISSUE_CTRL_CD(strRcvIssueCtrlCd);	// set �̔Ԍ�̓��o�ɊǗ��ԍ���ݒ�
    					info.setRCV_ISSUE_TYP("1");							// set ���`�� 1 ��ݒ�
    					//ITEM_CD											// set �㕔�Őݒ�ς�
    					//PLANT_CD											// set �㕔�Őݒ�ς�
    					//WH_CD												// set �㕔�Őݒ�ς�
    					//JOB_ODR_CD										// set �㕔�Őݒ�ς�
    					info.setRCV_ISSUE_QTY(strNewStock);					// set �V�݌ɐ���ݒ�
    					info.setSAVE_STOCK_HAND_QTY("0");					// set �O�㐔�Z�b�g�p��0���Z�b�g
    					info.setRCV_ISSUE_DATE(strInvDate);					// set �I������ݒ�
    					info.setRCV_ISSUE_GNR_TYP("28");					// set 28�i�I�������o�Ɂj��ݒ�
    					info.setSTOCK_UPD_TYP("2");							// set 2�i�X�V�ς݁j��ݒ�
    					info.setRCV_ISSUE_CMPLT_FLG("0");					// set 0�i���j��ݒ�
    				    info.setCOMPANY_CD(companystruct.getCOMPANY_CD());  // set ��ЃR�[�h
    					intResultCount = _invUpdateAccessor.insertRcvIssueTable(conn, info);
    					if(intResultCount == -1)
    					{
    						// �G���[
    						_msg.addCopy(_invUpdateAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
    						bSuccess = false;
    						break;
    					}
    					System.out.println("(SBM1163)�E �ۊǋ�ʓ��o�ɓo�^�I���i���`�j - �i�ڍ݌ɂ����݂��Ȃ��B�o�^�����F" + intResultCount);
                    }
				}
				//-------------------------------------------
				// �F �ۊǋ�ʕi�ڒI���X�V�i�X�V�t���O�X�V�j
				//-------------------------------------------
				System.out.println("(SBM1164)�F �ۊǋ�ʕi�ڒI���X�V");
				info.setINV_UPD_FLG("1");	// 1�i�ρj��ݒ�
				intResultCount = _invUpdateAccessor.updateItemInvTable(conn, info);
				if(intResultCount == -1)
				{
					// �G���[
					_msg.addCopy(_invUpdateAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
					bSuccess = false;
					break;
				}
				System.out.println("(SBM1165)�F �ۊǋ�ʕi�ڒI���X�V�I���B�X�V�����F" + intResultCount);

				// �X�V���R�[�h���J�E���g
				intUpdateCount++;
			}
		}
		// ���������̏ꍇ
		if(bSuccess == true)
		{
			// ��������
			_msg.add(InvMessageControl.TYP_SUCCESS, "", ""
				// �ڍ׏��
				+ "(SBM1166)�ۊǋ�ʕi�ڍ݌ɍX�V���R�[�h�����F[ " + intUpdateCount + " ]"
			);
		}
		return bSuccess;
	}
	
	
	/**
	 * ���b�g�ʕi�ڍ݌ɍX�V����
	 *
	 * @param	conn		DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	strInvDate	�I����
	 * @return	true:���� / false:���s
	 */
	public boolean updateLotStock(
		IDbConnection conn, 
		String strInvDate)
	{
		InvInformation info = new InvInformation();	// �Ώۏ��i�[�p
		boolean bSuccess = true;	// ���������t���O
		int intUpdateCount = 0;		// �X�V���R�[�h��
		//��ЃR�[�h�擾
		MyCompanyStruct companystruct = new MyCompanyStruct();
		try {
			 companystruct = MyCompanyControl.getData(conn);			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (DataNotFoundException e) {
			e.printStackTrace();
		}
		//---------------------------------------
		// �@ ���b�g�ʕi�ڒI���Ǎ��i�r�����[�h�j
		//---------------------------------------
		List listLotInv = null;
		info.setINV_DATE(strInvDate);	// where
		info.setPLANT_CD(_strPlantCd);	// where
		listLotInv = _invUpdateAccessor.readLotInvTable4Update(conn, info);
		if(listLotInv == null)
		{
			// �G���[
			_msg.addCopy(_invUpdateAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
			bSuccess = false;
		}

		// ���������̏ꍇ
		if(bSuccess == true)
		{
			boolean bIsStock;			// �݌ɑ��݃t���O
			InvInformation infoTemp;	// ���R�[�h���ޔ�p
			List listTemp;				// ���X�g���ޔ�p
			String strRcvIssueCtrlCd;	// �����̔ԃR�[�h�ޔ�p
			int intResultCount;			// �������R�[�h���ޔ�p
			String strStockOnHandQty;	// �݌ɐ��ޔ�p
			String strSumRcvIssueQty;	// ���o�ɏW�v���ޔ�p
			String strNewStock;			// �V�݌ɐ��ޔ�p
			for(int i = 0; i < listLotInv.size(); i++)
			{
				// �Ǎ����擾
				info = (InvInformation)listLotInv.get(i);
				info.setINV_DATE(strInvDate);
				info.setPLANT_CD(_strPlantCd);
				info.setJOB_ODR_CD(null);
				System.out.println("(SBM1167)���������� �X�V�Ώۃ��b�g�ʕi�ڒI�����R�[�h�F" + (i+1) + " ���� ����������"
					+ "\n���R�[�h���"
					+ "\n             INV_DATE�F" + info.getINV_DATE()
					+ "\n             PLANT_CD�F" + info.getPLANT_CD()
					+ "\n              ITEM_CD�F" + info.getITEM_CD()
					+ "\n                WH_CD�F" + info.getWH_CD()
					+ "\n           JOB_ODR_CD�F" + info.getJOB_ODR_CD()
					+ "\n     ACTUAL_STOCK_QTY�F" + info.getACTUAL_STOCK_QTY()
					+ "\n               LOT_NO�F" + info.getLOT_NO()
					+ "\n FINAL_BOOK_STOCK_QTY�F" + info.getFINAL_BOOK_STOCK_QTY()
				);

				//-------------------------------------------------------
				// �A���b�g�ʓ��o�ɓǍ��i�x��`�[�̓��o�ɐ����W�v�擾�j
				//-------------------------------------------------------
				System.out.println("(SBM1168)�A ���b�g�ʓ��o�ɓǍ�");
				//INV_DATE		// where �㕔�Őݒ�ς�
				//PLANT_CD		// where �㕔�Őݒ�ς�
				//JOB_ODR_CD	// where �㕔�Őݒ�ς�
				//ITEM_CD		// where �㕔�Őݒ�ς�
				//WH_CD			// where �㕔�Őݒ�ς�
				listTemp = _invUpdateAccessor.readLotRcvIssueTable(conn, info);
				if(listTemp == null)
				{
					// �G���[
					_msg.addCopy(_invUpdateAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
					bSuccess = false;
					break;
				}
				// �x��`�[�̓��o�ɏW�v�����擾
				strSumRcvIssueQty = "0";	// ���o�ɏW�v����0(�[��)�ŏ�����
				if(listTemp.size() > 0)
				{
					// �f�[�^�����݂����ꍇ�A�W�v�����擾
					infoTemp = (InvInformation)listTemp.get(0);
					strSumRcvIssueQty = infoTemp.getw_SUM_RCV_ISSUE_QTY();
				}
				System.out.println("(SBM1169)�A ���b�g�ʓ��o�ɓǍ��I��"
					+ "\n r) w_SUM_RCV_ISSUE_QTY�F" + strSumRcvIssueQty
					+ "\n �Ǎ������F" + listTemp.size()
				);
				
				// �ŏI����݌ɐ� + �x��`�[ <> ���I�����A�V�݌ɐ����Z�o
				if(Calculate.compare(Calculate.add(info.getFINAL_BOOK_STOCK_QTY(), strSumRcvIssueQty), 
						info.getACTUAL_STOCK_QTY()) == 0) {
					continue;
				}
				
				//---------------------------------------
				// �B ���b�g�ʕi�ڍ݌ɓǍ��i�r�����[�h�j
				//---------------------------------------
				System.out.println("(SBM1170)�B ���b�g�ʕi�ڍ݌ɓǍ�");
				//ITEM_CD						// where �㕔�Őݒ�ς�
				//WH_CD							// where �㕔�Őݒ�ς�
				info.setPLANT_CD(_strPlantCd);	// where
				listTemp = _invUpdateAccessor.readLotStockTable4Update(conn, info);
				if(listTemp == null)
				{
					// �G���[
					_msg.addCopy(_invUpdateAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
					bSuccess = false;
					break;
				}
				// �i�ڍ݌ɐ��擾
				strStockOnHandQty = "0";	// �i�ڍ݌ɐ���0(�[��)�ŏ�����
				bIsStock = false;			// �i�ڍ݌ɑ��݃t���O���Ȃ��ŏ�����
				if(listTemp.size() > 0)
				{
					// �i�ڍ݌ɂ����݂���
					bIsStock = true;
					infoTemp = (InvInformation)listTemp.get(0);
					strStockOnHandQty = infoTemp.getSTOCK_ON_HAND_QTY();
				}
				System.out.println("(SBM1171)�B ���b�g�ʕi�ڍ݌ɓǍ��I��"
					+ "\n r) STOCK_ON_HAND_QTY�F" + strStockOnHandQty
					+ "\n �Ǎ������F" + listTemp.size()
				);

				//-----------------
				// �C �V�݌ɐ��Z�o
				//-----------------
				info.setSTOCK_ON_HAND_QTY(strStockOnHandQty);
				info.setw_SUM_RCV_ISSUE_QTY(strSumRcvIssueQty);
				strNewStock = calculateNewStock(info);	// �V�݌ɐ��擾
				System.out.println("(SBM1153)�C �V�݌ɐ��Z�o��"
					+ "\n �Z�[�u�݌�(FINAL_BOOK_STOCK_QTY)�F" + info.getFINAL_BOOK_STOCK_QTY()
					+ "\n ���݌�(STOCK_ON_HAND_QTY)�F" + info.getSTOCK_ON_HAND_QTY()
					+ "\n �x��`�[(SUM_RCV_ISSUE_QTY)�F" + info.getw_SUM_RCV_ISSUE_QTY()
					+ "\n �V�݌ɁF" + strNewStock);

				if(bIsStock == true)
				{
					// �i�ڍ݌ɂ����݂���

					//------------------------------------------
					// �D-1 ���b�g�ʕi�ڍ݌ɍX�V�i�V�݌ɐ����f�j
					//------------------------------------------
					System.out.println("(SBM1172)�D-1 ���b�g�ʕi�ڍ݌ɍX�V - �i�ڍ݌ɂ����݂���");
					info.setSTOCK_ON_HAND_QTY(strNewStock);	// set
					//ITEM_CD								// where �㕔�Őݒ�ς�
					//PLANT_CD								// where �㕔�Őݒ�ς�
					//WH_CD									// where �㕔�Őݒ�ς�
					intResultCount = _invUpdateAccessor.updateLotStockTable(conn, info);
					if(intResultCount == -1)
					{
						// �G���[
						_msg.addCopy(_invUpdateAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
						bSuccess = false;
						break;
					}
					System.out.println("(SBM1173)�D-1 ���b�g�ʕi�ڍ݌ɍX�V�I�� - �i�ڍ݌ɂ����݂���B�X�V�����F" + intResultCount);

					//-------------------------------
					// �E �ۊǋ�ʓ��o�ɓo�^�i�ԓ`�j
					//-------------------------------
					System.out.println("(SBM1156)�E �ۊǋ�ʓ��o�ɓo�^�i�ԓ`�j - �i�ڍ݌ɂ����݂���");
					strRcvIssueCtrlCd = _invUpdateAccessor.getRcvIssueCtrlCd(conn);	// ���o�ɊǗ��ԍ��̎����̔�
					if(strRcvIssueCtrlCd == null)
					{
						// �G���[
						_msg.addCopy(_invUpdateAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
						bSuccess = false;
						break;
					}
					info.setRCV_ISSUE_CTRL_CD(strRcvIssueCtrlCd);						// set �̔Ԍ�̓��o�ɊǗ��ԍ���ݒ�
					info.setRCV_ISSUE_TYP("2");											// set �ԓ`�� 2 ��ݒ�
					//ITEM_CD															// set �㕔�Őݒ�ς�
					//PLANT_CD															// set �㕔�Őݒ�ς�
					//WH_CD																// set �㕔�Őݒ�ς�
					//JOB_ODR_CD														// set �㕔�Őݒ�ς�
					info.setRCV_ISSUE_QTY(Calculate.multiply(strStockOnHandQty, "-1"));	// set �X�V�O�̕i�ڎ莝�݌ɐ����}�C�i�X�ϊ�
					info.setSAVE_STOCK_HAND_QTY(strStockOnHandQty);						// set �O�㐔�Z�b�g�p�Ɏ莝���݌ɐ����Z�b�g
					info.setRCV_ISSUE_DATE(strInvDate);									// set �I������ݒ�
					info.setRCV_ISSUE_GNR_TYP("28");									// set 28�i�I�������o�Ɂj��ݒ�
					info.setSTOCK_UPD_TYP("2");											// set 2�i�X�V�ς݁j��ݒ�
					info.setRCV_ISSUE_CMPLT_FLG("0");									// set 0�i���j��ݒ�
				    info.setCOMPANY_CD(companystruct.getCOMPANY_CD());                  // set ��ЃR�[�h
					intResultCount = _invUpdateAccessor.insertLotRcvIssueTable(conn, info);
					if(intResultCount == -1)
					{
						// �G���[
						_msg.addCopy(_invUpdateAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
						bSuccess = false;
						break;
					}
					System.out.println("(SBM1157)�E �ۊǋ�ʓ��o�ɓo�^�I���i�ԓ`�j - �i�ڍ݌ɂ����݂���B�o�^�����F" + intResultCount);

					//-------------------------------
					// �E �ۊǋ�ʓ��o�ɓo�^�i���`�j
					//-------------------------------
					System.out.println("(SBM1158)�E �ۊǋ�ʓ��o�ɓo�^�i���`�j - �i�ڍ݌ɂ����݂���");
					strRcvIssueCtrlCd = _invUpdateAccessor.getRcvIssueCtrlCd(conn);	// ���o�ɊǗ��ԍ��̎����̔�
					if(strRcvIssueCtrlCd == null)
					{
						// �G���[
						_msg.addCopy(_invUpdateAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
						bSuccess = false;
						break;
					}
					info.setRCV_ISSUE_CTRL_CD(strRcvIssueCtrlCd);	// set �̔Ԍ�̓��o�ɊǗ��ԍ���ݒ�
					info.setRCV_ISSUE_TYP("1");						// set ���`�� 1 ��ݒ�
					//ITEM_CD										// set �㕔�Őݒ�ς�
					//PLANT_CD										// set �㕔�Őݒ�ς�
					//WH_CD											// set �㕔�Őݒ�ς�
					//JOB_ODR_CD									// set �㕔�Őݒ�ς�
					info.setRCV_ISSUE_QTY(strNewStock);				// set �V�݌ɐ���ݒ�
					info.setSAVE_STOCK_HAND_QTY("0");				// set �O�㐔�Z�b�g�p��0���Z�b�g
					info.setRCV_ISSUE_DATE(strInvDate);				// set �I������ݒ�
					info.setRCV_ISSUE_GNR_TYP("28");				// set 28�i�I�������o�Ɂj��ݒ�
					info.setSTOCK_UPD_TYP("2");						// set 2�i�X�V�ς݁j��ݒ�
					info.setRCV_ISSUE_CMPLT_FLG("0");				// set 0�i���j��ݒ�
				    info.setCOMPANY_CD(companystruct.getCOMPANY_CD()); // set ��ЃR�[�h
					intResultCount = _invUpdateAccessor.insertLotRcvIssueTable(conn, info);
					if(intResultCount == -1)
					{
						// �G���[
						_msg.addCopy(_invUpdateAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
						bSuccess = false;
						break;
					}
					System.out.println("(SBM1159)�E �ۊǋ�ʓ��o�ɓo�^�I���i���`�j - �i�ڍ݌ɂ����݂���B�o�^�����F" + intResultCount);
				}
				else
				{
					// �i�ڍ݌ɂ����݂��Ȃ�

					//-------------------------------------------
					// �D-2 ���b�g�ʕi�ڍ݌ɓo�^�i�V�݌ɐ����f�j
					//-------------------------------------------
					System.out.println("(SBM1174)�D-2 ���b�g�ʕi�ڍ݌ɓo�^ - �i�ڍ݌ɂ����݂��Ȃ�");
					//ITEM_CD		// �㕔�Őݒ�ς�
					//WH_CD			// �㕔�Őݒ�ς�
					//PLANT_CD		// �㕔�Őݒ�ς�
					info.setSTOCK_ON_HAND_QTY(strNewStock);
					intResultCount = _invUpdateAccessor.insertLotStockTable(conn, info);
					if(intResultCount == -1)
					{
						// �G���[
						_msg.addCopy(_invUpdateAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
						bSuccess = false;
						break;
					}
					System.out.println("(SBM1175)�D-2���b�g�ʕi�ڍ݌ɓo�^�I�� - �i�ڍ݌ɂ����݂��Ȃ��B�o�^�����F" + intResultCount);

					//-------------------------------
					// �E ���b�g�ʓ��o�ɓo�^�i���`�j
					//-------------------------------
					System.out.println("(SBM1176)�E ���b�g�ʓ��o�ɓo�^�i���`�j - �i�ڍ݌ɂ����݂��Ȃ�");
					strRcvIssueCtrlCd = _invUpdateAccessor.getRcvIssueCtrlCd(conn);	// ���o�ɊǗ��ԍ��̎����̔�
					if(strRcvIssueCtrlCd == null)
					{
						// �G���[
						_msg.addCopy(_invUpdateAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
						bSuccess = false;
						break;
					}
					info.setRCV_ISSUE_CTRL_CD(strRcvIssueCtrlCd);	// set �̔Ԍ�̓��o�ɊǗ��ԍ���ݒ�
					info.setRCV_ISSUE_TYP("1");							// set ���`�� 1 ��ݒ�
					//ITEM_CD											// set �㕔�Őݒ�ς�
					//PLANT_CD											// set �㕔�Őݒ�ς�
					//WH_CD												// set �㕔�Őݒ�ς�
					//JOB_ODR_CD										// set �㕔�Őݒ�ς�
					info.setRCV_ISSUE_QTY(strNewStock);					// set �V�݌ɐ���ݒ�
					info.setSAVE_STOCK_HAND_QTY("0");					// set �O�㐔�Z�b�g�p��0���Z�b�g
					info.setRCV_ISSUE_DATE(strInvDate);					// set �I������ݒ�
					info.setRCV_ISSUE_GNR_TYP("28");					// set 28�i�I�������o�Ɂj��ݒ�
					info.setSTOCK_UPD_TYP("2");							// set 2�i�X�V�ς݁j��ݒ�
					info.setRCV_ISSUE_CMPLT_FLG("0");					// set 0�i���j��ݒ�
				    info.setCOMPANY_CD(companystruct.getCOMPANY_CD());  // set ��ЃR�[�h
					intResultCount = _invUpdateAccessor.insertLotRcvIssueTable(conn, info);
					if(intResultCount == -1)
					{
						// �G���[
						_msg.addCopy(_invUpdateAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
						bSuccess = false;
						break;
					}
					System.out.println("(SBM1177)�E  ���b�g�ʓ��o�ɓo�^�I���i���`�j - �i�ڍ݌ɂ����݂��Ȃ��B�o�^�����F" + intResultCount);
				}

				//-------------------------------------------
				// �F  ���b�g�ʕi�ڒI���X�V�i�X�V�t���O�X�V�j
				//-------------------------------------------
				System.out.println("(SBM1178)�F  ���b�g�ʕi�ڒI���X�V");
				info.setINV_UPD_FLG("1");	// 1�i�ρj��ݒ�
				intResultCount = _invUpdateAccessor.updateLotInvTable(conn, info);
				if(intResultCount == -1)
				{
					// �G���[
					_msg.addCopy(_invUpdateAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
					bSuccess = false;
					break;
				}
				System.out.println("(SBM1179)�F  ���b�g�ʕi�ڒI���X�V�I���B�X�V�����F" + intResultCount);

				// �X�V���R�[�h���J�E���g
				intUpdateCount++;
			}
		}

		// ���������̏ꍇ
		if(bSuccess == true)
		{
			// ��������
			_msg.add(InvMessageControl.TYP_SUCCESS, "", ""
				// �ڍ׏��
				+ " (SBM1180)���b�g�ʍ݌ɍX�V���R�[�h�����F[ " + intUpdateCount + " ]"
			);
		}
		return bSuccess;
	}
	////////////////////////////////////////////////////////////////////////////
	/**
	 * �ۊǋ�ʐ��ԍ݌ɍX�V����
	 *
	 * @param	conn		DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param	strInvDate	�I����
	 * @return	true:���� / false:���s
	 */
	public boolean updateJobOdrCdStock(
		IDbConnection conn, 
		String strInvDate)
	{
		InvInformation info = new InvInformation();	// �Ώۏ��i�[�p
		boolean bSuccess = true;	// ���������t���O
		int intUpdateCount = 0;		// �X�V���R�[�h��
		//��ЃR�[�h�擾
		MyCompanyStruct companystruct = new MyCompanyStruct();
		try {
			 companystruct = MyCompanyControl.getData(conn);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (DataNotFoundException e) {
			e.printStackTrace();
		}
		//---------------------------------------
		// �@ �ۊǋ�ʐ��ԒI���Ǎ��i�r�����[�h�j
		//---------------------------------------
		List listJobOdrCdInv = null;
		info.setINV_DATE(strInvDate);	// where
		info.setPLANT_CD(_strPlantCd);	// where
		listJobOdrCdInv = _invUpdateAccessor.readJobOdrCdInvTable4Update(conn, info);
		if(listJobOdrCdInv == null)
		{
			// �G���[
			_msg.addCopy(_invUpdateAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
			bSuccess = false;
		}

		// ���������̏ꍇ
		if(bSuccess == true)
		{
			boolean bIsStock;			// �݌ɑ��݃t���O
			InvInformation infoTemp;	// ���R�[�h���ޔ�p
			List listTemp;				// ���X�g���ޔ�p
			String strRcvIssueCtrlCd;	// �����̔ԃR�[�h�ޔ�p
			int intResultCount;			// �������R�[�h���ޔ�p
			String strStockOnHandQty;	// �݌ɐ��ޔ�p
			String strSumRcvIssueQty;	// ���o�ɏW�v���ޔ�p
			String strNewStock;			// �V�݌ɐ��ޔ�p
			for(int i = 0; i < listJobOdrCdInv.size(); i++)
			{
				// �Ǎ����擾
				info = (InvInformation)listJobOdrCdInv.get(i);
				info.setINV_DATE(strInvDate);
				info.setPLANT_CD(_strPlantCd);
				System.out.println("(SBM1181)���������� �X�V�Ώەۊǋ�ʐ��ԒI�����R�[�h�F" + (i+1) + " ���� ����������"
	+ "\n���R�[�h���"
	+ "\n             INV_DATE�F" + info.getINV_DATE()
	+ "\n             PLANT_CD�F" + info.getPLANT_CD()
	+ "\n              ITEM_CD�F" + info.getITEM_CD()
	+ "\n                WH_CD�F" + info.getWH_CD()
	+ "\n           JOB_ODR_CD�F" + info.getJOB_ODR_CD()
	+ "\n     ACTUAL_STOCK_QTY�F" + info.getACTUAL_STOCK_QTY()
	+ "\n FINAL_BOOK_STOCK_QTY�F" + info.getFINAL_BOOK_STOCK_QTY()
);

				// -------------------------------------------------------
				// �A �ۊǋ�ʓ��o�ɓǍ��i�x��`�[�̓��o�ɐ����W�v�擾�j
				// -------------------------------------------------------
				System.out.println("(SBM1149)�A �ۊǋ�ʓ��o�ɓǍ�");
				// INV_DATE // where �㕔�Őݒ�ς�
				// PLANT_CD // where �㕔�Őݒ�ς�
				// JOB_ODR_CD // where �㕔�Őݒ�ς�
				// ITEM_CD // where �㕔�Őݒ�ς�
				// WH_CD // where �㕔�Őݒ�ς�
				listTemp = _invUpdateAccessor.readRcvIssueTable(conn, info);
				if (listTemp == null) {
					// �G���[
					_msg.addCopy(_invUpdateAccessor.getMessage()); // �������ʃ��b�Z�[�W�擾�ǉ�
					bSuccess = false;
					break;
				}
				// �x��`�[�̓��o�ɏW�v�����擾
				strSumRcvIssueQty = "0"; // ���o�ɏW�v����0(�[��)�ŏ�����
				if (listTemp.size() > 0) {
					// �f�[�^�����݂����ꍇ�A�W�v�����擾
					infoTemp = (InvInformation) listTemp.get(0);
					strSumRcvIssueQty = infoTemp.getw_SUM_RCV_ISSUE_QTY();
				}
				System.out.println("(SBM1150)�A �ۊǋ�ʓ��o�ɓǍ��I��"
						+ "\n ��) w_SUM_RCV_ISSUE_QTY�F" + strSumRcvIssueQty
						+ "\n �Ǎ������F" + listTemp.size());

				// �ŏI����݌ɐ� + �x��`�[ <> ���I�����A�V�݌ɐ����Z�o
				if(Calculate.compare(Calculate.add(info.getFINAL_BOOK_STOCK_QTY(), strSumRcvIssueQty), 
						info.getACTUAL_STOCK_QTY()) == 0) {
					continue;
				}

				//---------------------------------------
				// �B �ۊǋ�ʐ��ԍ݌ɓǍ��i�r�����[�h�j
				//---------------------------------------
				System.out.println("(SBM1182)�B �ۊǋ�ʐ��ԍ݌ɓǍ�");
				//JOB_ODR_CD					// where �㕔�Őݒ�ς�
				//ITEM_CD						// where �㕔�Őݒ�ς�
				//WH_CD							// where �㕔�Őݒ�ς�
				info.setPLANT_CD(_strPlantCd);	// where
				listTemp = _invUpdateAccessor.readJobOdrCdStockTable4Update(conn, info);
				if(listTemp == null)
				{
					// �G���[
					_msg.addCopy(_invUpdateAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
					bSuccess = false;
					break;
				}
				// ���ԍ݌ɐ��擾
				strStockOnHandQty = "0";// ���ԍ݌ɐ���0(�[��)�ŏ�����
				bIsStock = false;		// ���ԍ݌ɑ��݃t���O���Ȃ��ŏ�����
				if(listTemp.size() > 0)
				{
					// ���ԍ݌ɂ����݂���
					bIsStock = true;
					infoTemp = (InvInformation)listTemp.get(0);
					strStockOnHandQty = infoTemp.getSTOCK_ON_HAND_QTY();
				}
				System.out.println("(SBM1183)�B �ۊǋ�ʐ��ԍ݌ɓǍ��I��"
	+ "\n r) STOCK_ON_HAND_QTY�F" + strStockOnHandQty
	+ "\n �Ǎ������F" + listTemp.size()
);
				
				//-----------------
				// �C �V�݌ɐ��Z�o
				//-----------------
				info.setSTOCK_ON_HAND_QTY(strStockOnHandQty);
				info.setw_SUM_RCV_ISSUE_QTY(strSumRcvIssueQty);
				strNewStock = calculateNewStock(info);	// �V�݌ɐ��擾
				System.out.println("(SBM1153)�C �V�݌ɐ��Z�o��"
	+ "\n �Z�[�u�݌�(FINAL_BOOK_STOCK_QTY)�F" + info.getFINAL_BOOK_STOCK_QTY()
	+ "\n ���݌�(STOCK_ON_HAND_QTY)�F" + info.getSTOCK_ON_HAND_QTY()
	+ "\n �x��`�[(SUM_RCV_ISSUE_QTY)�F" + info.getw_SUM_RCV_ISSUE_QTY()
	+ "\n �V�݌ɁF" + strNewStock);

				if(bIsStock == true)
				{
					// ���ԍ݌ɂ����݂���

					//-------------------------------------------
					// �D-1 �ۊǋ�ʐ��ԍ݌ɍX�V�i�V�݌ɐ����f�j
					//-------------------------------------------
					System.out.println("(SBM1184)�D-1 �ۊǋ�ʐ��ԍ݌ɍX�V - ���ԍ݌ɂ����݂���");
					info.setSTOCK_ON_HAND_QTY(strNewStock);	// set
					//JOB_ODR_CD							// where �㕔�Őݒ�ς�
					//ITEM_CD								// where �㕔�Őݒ�ς�
					//WH_CD									// where �㕔�Őݒ�ς�
					//PLANT_CD								// where �㕔�Őݒ�ς�
					intResultCount = _invUpdateAccessor.updateJobOdrCdStockTable(conn, info);
					if(intResultCount == -1)
					{
						// �G���[
						_msg.addCopy(_invUpdateAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
						bSuccess = false;
						break;
					}
					System.out.println("(SBM1185)�D-1 �ۊǋ�ʐ��ԍ݌ɍX�V�I�� - ���ԍ݌ɂ����݂���B�X�V�����F" + intResultCount);

					//-------------------------------
					// �E �ۊǋ�ʓ��o�ɓo�^�i�ԓ`�j
					//-------------------------------
					System.out.println("(SBM1186)�E �ۊǋ�ʓ��o�ɓo�^�i�ԓ`�j - ���ԍ݌ɂ����݂���");
					strRcvIssueCtrlCd = _invUpdateAccessor.getRcvIssueCtrlCd(conn);	// ���o�ɊǗ��ԍ��̎����̔�
					if(strRcvIssueCtrlCd == null)
					{
						// �G���[
						_msg.addCopy(_invUpdateAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
						bSuccess = false;
						break;
					}
					info.setRCV_ISSUE_CTRL_CD(strRcvIssueCtrlCd);						// set �̔Ԍ�̓��o�ɊǗ��ԍ���ݒ�
					info.setRCV_ISSUE_TYP("2");											// set �ԓ`�� 2 ��ݒ�
					//ITEM_CD															// set �㕔�Őݒ�ς�
					//PLANT_CD															// set �㕔�Őݒ�ς�
					//WH_CD																// set �㕔�Őݒ�ς�
					//JOB_ODR_CD														// set �㕔�Őݒ�ς�
					info.setRCV_ISSUE_QTY(Calculate.multiply(strStockOnHandQty, "-1"));	// set �X�V�O�̐��Ԏ莝�݌ɐ����}�C�i�X�ϊ�
					info.setSAVE_STOCK_HAND_QTY(strStockOnHandQty);							// set �O�㐔�Z�b�g�p�ɍX�V�O�莝���݌ɐ����Z�b�g
					info.setRCV_ISSUE_DATE(strInvDate);									// set �I������ݒ�
					info.setRCV_ISSUE_GNR_TYP("28");									// set 28�i�I�������o�Ɂj��ݒ�
					info.setSTOCK_UPD_TYP("2");											// set 2�i�X�V�ς݁j��ݒ�
					info.setRCV_ISSUE_CMPLT_FLG("0");									// set 0�i���j��ݒ�
				    info.setCOMPANY_CD(companystruct.getCOMPANY_CD());                  // set ��ЃR�[�h
					intResultCount = _invUpdateAccessor.insertRcvIssueTable(conn, info);
					if(intResultCount == -1)
					{
						// �G���[
						_msg.addCopy(_invUpdateAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
						bSuccess = false;
						break;
					}
					System.out.println("(SBM1187)�E �ۊǋ�ʓ��o�ɓo�^�I���i�ԓ`�j - ���ԍ݌ɂ����݂���B�o�^�����F" + intResultCount);

					//-------------------------------
					// �E �ۊǋ�ʓ��o�ɓo�^�i���`�j
					//-------------------------------
					System.out.println("(SBM1188)�E �ۊǋ�ʓ��o�ɓo�^�i���`�j - ���ԍ݌ɂ����݂���");
					strRcvIssueCtrlCd = _invUpdateAccessor.getRcvIssueCtrlCd(conn);	// ���o�ɊǗ��ԍ��̎����̔�
					if(strRcvIssueCtrlCd == null)
					{
						// �G���[
						_msg.addCopy(_invUpdateAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
						bSuccess = false;
						break;
					}
					info.setRCV_ISSUE_CTRL_CD(strRcvIssueCtrlCd);	// set �̔Ԍ�̓��o�ɊǗ��ԍ���ݒ�
					info.setRCV_ISSUE_TYP("1");						// set ���`�� 1 ��ݒ�
					//ITEM_CD										// set �㕔�Őݒ�ς�
					//PLANT_CD										// set �㕔�Őݒ�ς�
					//WH_CD											// set �㕔�Őݒ�ς�
					//JOB_ODR_CD									// set �㕔�Őݒ�ς�
					info.setRCV_ISSUE_QTY(strNewStock);				// set �V�݌ɐ��ݒ�
					info.setSAVE_STOCK_HAND_QTY("0");				// set �O�㐔�Z�b�g�p��0���Z�b�g
					info.setRCV_ISSUE_DATE(strInvDate);				// set �I������ݒ�
					info.setRCV_ISSUE_GNR_TYP("28");				// set 28�i�I�������o�Ɂj��ݒ�
					info.setSTOCK_UPD_TYP("2");						// set 2�i�X�V�ς݁j��ݒ�
					info.setRCV_ISSUE_CMPLT_FLG("0");				// set 0�i���j��ݒ�
				    info.setCOMPANY_CD(companystruct.getCOMPANY_CD()); // set ��ЃR�[�h
					intResultCount = _invUpdateAccessor.insertRcvIssueTable(conn, info);
					if(intResultCount == -1)
					{
						// �G���[
						_msg.addCopy(_invUpdateAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
						bSuccess = false;
						break;
					}
					System.out.println("(SBM1189)�E �ۊǋ�ʓ��o�ɓo�^�I���i���`�j - ���ԍ݌ɂ����݂���B�o�^�����F" + intResultCount);
				}
				else
				{
					// ���ԍ݌ɂ����݂��Ȃ�

					//-------------------------------------------
					// �D-2 �ۊǋ�ʐ��ԍ݌ɓo�^�i�V�݌ɐ����f�j
					//-------------------------------------------
					System.out.println("(SBM1190)�D-2 �ۊǋ�ʐ��ԍ݌ɓo�^ - ���ԍ݌ɂ����݂��Ȃ�");
					//JOB_ODR_CD							// set �㕔�Őݒ�ς�
					//ITEM_CD								// set �㕔�Őݒ�ς�
					//WH_CD									// set �㕔�Őݒ�ς�
					//PLANT_CD								// set �㕔�Őݒ�ς�
					info.setSTOCK_ON_HAND_QTY(strNewStock);	// set
					intResultCount = _invUpdateAccessor.insertJobOdrCdStockTable(conn, info);
					if(intResultCount == -1)
					{
						// �G���[
						_msg.addCopy(_invUpdateAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
						bSuccess = false;
						break;
					}
					System.out.println("(SBM1191)�D-2 �ۊǋ�ʐ��ԍ݌ɓo�^�I�� - ���ԍ݌ɂ����݂��Ȃ��B�o�^�����F" + intResultCount);

					//-------------------------------
					// �E �ۊǋ�ʓ��o�ɓo�^�i���`�j
					//-------------------------------
					System.out.println("(SBM1192)�E �ۊǋ�ʓ��o�ɓo�^�i���`�j - ���ԍ݌ɂ����݂��Ȃ�");
					strRcvIssueCtrlCd = _invUpdateAccessor.getRcvIssueCtrlCd(conn);	// ���o�ɊǗ��ԍ��̎����̔�
					if(strRcvIssueCtrlCd == null)
					{
						// �G���[
						_msg.addCopy(_invUpdateAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
						bSuccess = false;
						break;
					}
					info.setRCV_ISSUE_CTRL_CD(strRcvIssueCtrlCd);	// set �̔Ԍ�̓��o�ɊǗ��ԍ���ݒ�
					info.setRCV_ISSUE_TYP("1");						// set ���`�� 1 ��ݒ�
					//ITEM_CD										// set �㕔�Őݒ�ς�
					//PLANT_CD										// set �㕔�Őݒ�ς�
					//WH_CD											// set �㕔�Őݒ�ς�
					//JOB_ODR_CD									// set �㕔�Őݒ�ς�
					info.setRCV_ISSUE_QTY(strNewStock);				// set �V�݌ɐ���ݒ�
					info.setSAVE_STOCK_HAND_QTY("0");				// set �O�㐔�Z�b�g�p��0���Z�b�g
					info.setRCV_ISSUE_DATE(strInvDate);				// set �I������ݒ�
					info.setRCV_ISSUE_GNR_TYP("28");				// set 28�i�I�������o�Ɂj��ݒ�
					info.setSTOCK_UPD_TYP("2");						// set 2�i�X�V�ς݁j��ݒ�
					info.setRCV_ISSUE_CMPLT_FLG("0");				// set 0�i���j��ݒ�
				    info.setCOMPANY_CD(companystruct.getCOMPANY_CD());   // set ��ЃR�[�h
					intResultCount = _invUpdateAccessor.insertRcvIssueTable(conn, info);
					if(intResultCount == -1)
					{
						// �G���[
						_msg.addCopy(_invUpdateAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
						bSuccess = false;
						break;
					}
					System.out.println("(SBM1193)�E �ۊǋ�ʓ��o�ɓo�^�I���i���`�j - ���ԍ݌ɂ����݂��Ȃ��B�o�^�����F" + intResultCount);
				}

				//-------------------------------------------
				// �F �ۊǋ�ʐ��ԒI���X�V�i�X�V�t���O�X�V�j
				//-------------------------------------------
				System.out.println("(SBM1164)�F �ۊǋ�ʕi�ڒI���X�V");
				info.setINV_UPD_FLG("1");	// 1�i�ρj��ݒ�
				intResultCount = _invUpdateAccessor.updateJobOdrCdInvTable(conn, info);
				if(intResultCount == -1)
				{
					// �G���[
					_msg.addCopy(_invUpdateAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
					bSuccess = false;
					break;
				}
				System.out.println("(SBM1165)�F �ۊǋ�ʕi�ڒI���X�V�I���B�X�V�����F" + intResultCount);

				// �X�V���R�[�h���J�E���g
				intUpdateCount++;
			}
		}

		// ���������̏ꍇ
		if(bSuccess == true)
		{
			// ��������
			_msg.add(InvMessageControl.TYP_SUCCESS, "", ""
				// �ڍ׏��
				+ "(SBM1194)�ۊǋ�ʐ��ԍ݌ɍX�V���R�[�h�����F[ " + intUpdateCount + " ]"
			);
		}
		return bSuccess;
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
		boolean bSuccess = true;	// ���������t���O
		int intUpdateCount = 0;		// �X�V���R�[�h��

		//----------------------------
		// �I������Ǎ��i�r�����[�h�j
		//----------------------------
		info.setINV_DATE(strInvDate);	// where
		info.setPLANT_CD(_strPlantCd);	// where
		List listInvCtrl = _invUpdateAccessor.readInvCtrlTable4Update(conn, info);
		if(listInvCtrl == null)
		{
			// �G���[
			_msg.addCopy(_invUpdateAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
			bSuccess = false;
		}

		// ���������̏ꍇ
		if(bSuccess == true)
		{
			//--------------
			// �I������X�V
			//--------------
			info.setINV_STS_TYP("2");		// set 2�i�I���X�V�ρj��ݒ�
			info.setINV_DATE(strInvDate);	// where
			info.setPLANT_CD(_strPlantCd);	// where
			intUpdateCount = _invUpdateAccessor.updateInvCtrlTable(conn, info);
			if(intUpdateCount == -1)
			{
				// �G���[
				_msg.addCopy(_invUpdateAccessor.getMessage());	// �������ʃ��b�Z�[�W�擾�ǉ�
				bSuccess = false;
			}
		}

		// ���������̏ꍇ
		if(bSuccess == true)
		{
			// ��������
			_msg.add(InvMessageControl.TYP_SUCCESS, "", ""
				// �ڍ׏��
				+ "(SBM1195)�I������X�V���R�[�h�����F[ " + intUpdateCount + " ]"
			);
		}
		return bSuccess;
	}
}
