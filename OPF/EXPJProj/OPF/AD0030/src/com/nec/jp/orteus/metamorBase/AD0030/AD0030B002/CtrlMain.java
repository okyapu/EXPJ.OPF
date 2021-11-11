/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0030/src/com/nec/jp/orteus/metamorBase/AD0030/AD0030B002/CtrlMain.java,v $
 *
 * Copyright (c) 2003-2005 NEC Corporation.
 * Copyright (c) 2003-2005 NEC Informatec Systems,Ltd.
 *
 * ALL RIGHTS RESERVED  BY   NEC INFORMATEC SYSTEMS, LTD.
 * THIS PROGRAM MUST BE USED SOLELY  FOR  THE PURPOSE FOR
 * WHICH IT WAS FURNISHED BY NEC INFORMATEC SYSTEMS, LTD,
 * NO PART OF THIS PROGRAM MAY BE REPRODUCED OR DISCLOSED
 * TO  OTHERS,  IN ANY FORM  WITHOUT  THE  PRIOR  WRITTEN
 * PERMISSION OF NEC INFORMATEC SYSTEMS, LTD.
 * USE OF COPYRIGHT NOTICE  DOES NOT EVIDENCE PUBLICATION
 * OF THE PROGRAM
 *
 * NEC INFORMATEC SYSTEMS  CONFIDENTIAL  AND  PROPRIETARY
 *
 * �e���v���[�g�����F
 * EXPJ    (2004/04/05),���\�b�h�R�����g�́u* @param �Ȃ��v�����ׂč폜
 *                     ,���\�b�h�R�����g�́u* @return �Ȃ��v�����ׂč폜
 *                     ,EXPLANNER/J�p�ɉ���
 * 3.0.0.0 (2003/12/10),�������ʂ𗘗p�\�ɂ���C��
 * 2.0.0.0 (2002/05/27),new foundation�Ή�
 *
 */

package com.nec.jp.orteus.metamorBase.AD0030.AD0030B002;

import com.nec.jp.orteus.util.*;
import com.nec.jp.orteus.xaf.foundation.*;
import com.nec.jp.orteus.xaf.util.*;
import com.nec.jp.orteus.xaf.ba.*;

import java.lang.Number.*;
import java.util.*;
import java.io.*;
import java.text.*;
import java.sql.*;

//{{user_implement_dev:import

import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessLock.BusinessLock;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
import com.nec.jp.orteus.metamorBase.common.util.ScreenParam;

//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain �N���X
 * �t�@�C���E�N���X����
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.23 $ $Date: 2016/05/23 08:12:46 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class CtrlMain extends Object
		implements IBatchAppCommon
{

	//////////////////////////////

	/**
	 * mediator�N���X �C���X�^���X
	 */
	public medAD0030B002 m_med=null;

	/**
	 * control�N���X �C���X�^���X
	 */
	protected interControl m_control=null;

	/**
	 * �R���_�N�^�N���X�C���X�^���X
	 */
	protected BatchAppConductor m_conductor;

	/**
	 * ���O���i�C���X�^���X
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();

	/**
	 * �������ʃX�e�[�^�X
	 */
	public static int m_status = 0;
	public static int getExecuteStatus() { return m_status; }
	public static void setExecuteStatus(int status) { m_status = status; }

	//////////////////////////////

	/**
	 * CtrlMain�N���X�̃R���X�g���N�^
	 *
		 */
	public CtrlMain(medAD0030B002 med, BatchAppConductor cdr) throws BatchAppException
	{
		// �����o�ϐ������������܂�
		m_conductor = cdr;
		m_med = med;
		m_control = new interControl(med);

		return;
	}

	//{{user_implement_code

	//////////////////////////////
	// �R�[�h�W�F�l���[�^�́A�ȉ��̃R�[�h�ւ̏㏑�����s���܂���

	/** �V�X�e�����O���b�Z�[�W�쐬�p */
	private StringBuffer _sysLogMessage = null;

	/**
	 * �Ɩ����b�Z�[�W�̃��b�Z�[�W�R�[�h�ɕ\�������邽�߂̃R�[�h���X�g�ł��B
	 */
	List errCodeList = new ArrayList();
	/**
	 * �Ɩ����b�Z�[�W�̃f�[�^�X�g�����O�ɕ\�������邽�߂̃m�[�g���X�g�ł��B
	 */
	Hashtable errNoteHash = new Hashtable();
	/**
	 * �Ɩ����b�Z�[�W�̃f�[�^�X�g�����O�ɕ\�������邽�߂̃m�[�g���X�g��ݒ肵�܂��B
	 */
	public void setErrNote(String note){
		errNoteHash.put(Integer.toString(errCodeList.size()-1),note);
	}

	/**
	 * �Ɩ����W�b�N�̃V�X�e�����O(�G���[)�ݒ菈����؂�o���Ċ֐���
	 * @param db1 �f�[�^�x�[�X���ڂP
	 * @param value1 �u��������P
	 * @param userId ���[�U�R�[�h
	 */
	private void setWarningSysLogMessage(String db1, String value1, String userId) {
		_sysLogMessage = new StringBuffer();
		_sysLogMessage.append(db1);
		_sysLogMessage.append(":");
		_sysLogMessage.append(value1);
		ExpjMessage emsg 
				= new ExpjMessage("ZZ01006",_sysLogMessage.toString());
		m_med.getSyslog().warning(emsg, userId);
	}
	/**
	 * �Ɩ����W�b�N�̃V�X�e�����O�i���[�j���O�j�ݒ菈����؂�o���Ċ֐���
	 * @param db1 �f�[�^�x�[�X���ڂP
	 * @param value1 �u��������P
	 */
	private void setInfoSysLogMessage(String db1, String value1, String userId) {
		_sysLogMessage = new StringBuffer();
		_sysLogMessage.append(db1);
		_sysLogMessage.append(":");
		_sysLogMessage.append(value1);
		ExpjMessage emsg 
				= new ExpjMessage("ZZ01006",_sysLogMessage.toString());
		m_med.getSyslog().info(emsg, userId);
	}

	/**
	 * SP�����s���܂��B
	 * @param logMode LOG���[�h
	 * @param outputMode �o�̓��[�h
	 * @param outputPath �o�̓p�X
	 * @param outputName �o�̓t�@�C����
	 * @param userId ���[�U�R�[�h
	 * @param businessName �Ɩ����i�o�b�`����ID�j
	 * @param plantCd �H��R�[�h
	 * @param OprInstStartDate �����
	 * @param WorkOdrDlvDate �[��
	 * @param JobOdrCd ����
	 * @param ItemCd �i�ڔԍ�
	 * @param WsCd ��Ƌ�R�[�h
	 * @param OprRsltTyp ��Ǝ��ы敪
	 * @param OutSideTyp ��Ǝw���v��i����j
	 * @param OutSideTyp2 ��Ǝw���v��i�O��j
	 * @param VendCd �����R�[�h
	 * @return true ����/false ���s
	 */
	public boolean spExecute(String logMode, String outputMode, String outputPath, String outputName, String userId, String businessName,
				 String plantCd, String OprInstStartDate, String WorkOdrDlvDate, String JobOdrCd, String ItemCd, String WsCd,
				 String OprRsltTyp, String OutSideTyp, String OutSideTyp2, String VendCd){
		try {
			// �X�g�A�h�v���V�[�W���̃p�����[�^���Z�b�g����
			m_med.setpvc2LogMode(logMode);
			m_med.setpvc2OutputMode(outputMode);
			m_med.setpvc2OutputPath(outputPath);
			m_med.setpvc2OutputName(outputName);
			m_med.setpvc2UserId(userId);
			m_med.setpvc2BusinessName(businessName);
			m_med.setpvc2PlantCd(plantCd);
			m_med.setpvc2OprInstStartDate(OprInstStartDate);
			m_med.setpvc2WorkOdrDlvDate(WorkOdrDlvDate);
			m_med.setpvc2JobOdrCd(JobOdrCd);
			m_med.setpvc2ItemCd(ItemCd);
			m_med.setpvc2WsCd(WsCd);
			m_med.setpvc2OprRsltTyp(OprRsltTyp);
			m_med.setpvc2OutSideTyp(OutSideTyp);
			m_med.setpvc2OutSideTyp2(OutSideTyp2);
			m_med.setpvc2VendCd(VendCd);

			System.out.println("Parameter : ");
			System.out.println(" logModeTyp = " + logMode);
			System.out.println(" outputMode = " + outputMode);
			System.out.println(" outputPath = " + outputPath);
			System.out.println(" outputName = " + outputName);
			System.out.println(" userId = " + userId);
			System.out.println(" businessName = " + businessName);
			System.out.println(" plantCd = " + plantCd);
			System.out.println(" OprInstStartDate = " + OprInstStartDate);
			System.out.println(" WorkOdrDlvDate = " + WorkOdrDlvDate);
			System.out.println(" JobOdrCd = " + JobOdrCd);
			System.out.println(" ItemCd = " + ItemCd);
			System.out.println(" WsCd = " + WsCd);
			System.out.println(" OprRsltTyp = " + OprRsltTyp);
			System.out.println(" OutSideTyp = " + OutSideTyp);
			System.out.println(" OutSideTyp2 = " + OutSideTyp2);
			System.out.println(" VendCd = " + VendCd);

			// �X�g�A�h�v���V�[�W���̎��s
			try {
				System.out.println("SPExecute");
				m_med.getcallSqlDailyProc().call();
			} catch (Exception e) {
				errCodeList.add("AD00026"); // �X�g�A�h�v���V�[�W�����s���G���[
				StringBuffer sb = new StringBuffer();
				sb.append("SPparameter : ");
				sb.append(logMode + " ");
				sb.append(outputMode + " ");
				sb.append(outputPath + " ");
				sb.append(outputName + " ");
				sb.append(userId + " ");
				sb.append(businessName + " ");
				sb.append(plantCd + " ");
				sb.append(OprInstStartDate + " ");
				sb.append(WorkOdrDlvDate + " ");
				sb.append(JobOdrCd + " ");
				sb.append(ItemCd + " ");
				sb.append(WsCd + " ");
				sb.append(OprRsltTyp + " ");
				sb.append(OutSideTyp + " ");
				sb.append(OutSideTyp2 + " ");
				sb.append(VendCd + " ");
				
				String errNote = sb.toString();
				//�G���[�m�[�g�ǉ�
				setErrNote(errNote);
				return false;
			}
		} catch (Exception e) {
			// �o�b�`�p�����[�^�̓ǂݍ��݂Ɏ��s���܂���
			errCodeList.add("AD00024");
			setErrNote("(SBM0580)���[�U�R�[�h�F[ " + userId + " ] �H��R�[�h�F[ " + plantCd + " ]");
			ExpjMessage emsg = new ExpjMessage("AD00024");
			m_med.getSyslog().warning(emsg, userId);
			setWarningSysLogMessage("userId", userId, userId);
			setWarningSysLogMessage("plantCd", plantCd, userId);
			return false;
		}
		return true;
	}


	/**
	 * CtrlMain�N���X�̕W���R���X�g���N�^
	 *
	 */
	public CtrlMain(medAD0030B002 med) throws BatchAppException
	{
		// �����o�ϐ������������܂�
		m_med = med;
		m_control = new interControl(med);

		// todo: �C���X�^���X���������Ɏ��s���鏈�����L�q���Ă�������

		return;
	}

	/**
	 * �C���X�^���X�j�󎞂ɍs������
	 *
	 */
	public void finalize()
	{
		// �e�����o�ϐ��̏�����
		m_med = null;
		m_control = null;
		objMessage = null;

		// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������

		return;
	}

	//////////////////////////////

	/**
	 * main�F ���[�U��`�p���\�b�h�ł�<br>
	 * <<�������L�q���Ă�������>>
	 *
	 * @return <<�������L�q���Ă�������>>
	 * @exception <<�������L�q���Ă�������>>
	 */
	public int main() throws BatchAppException
	{
		IDbConnection conn = null;	  // DB�R�l�N�V����
		BusinessLock Lock = null;     // �Ɩ����b�N
		int lockCancelKey = 0;	      // ���b�N�����L�[

		// �o�b�`�������ʃG���[����
		String errCode = null;		  // �G���[�R�[�h
		String errNote = "";          // �G���[���b�Z�[�W(���l)

		// Orteus�Ɩ����b�Z�[�W

		// metamorBase�Ɩ����b�Z�[�W
		BusinessMessageAccessor businessMsgAcc = null;
		BusinessMessage businessMsg = null;     // metamorBase�Ɩ����b�Z�[�W

		// �X�g�A�h�v���V�[�W����
		String functionName = null;
		functionName = "SQLOPRINST";  // ��Ǝw���m��

		// �X�g�A�h�v���V�[�W���p�����[�^
		String logMode = null;             // ���O���[�h
		String outputMode = null;          // �o�̓��[�h
		String outputPath = null;          // �o�̓p�X
		String outputName = null;          // �o�̓t�@�C����
		String userId = null;              // ���[�UID
		String businessName = null;        // �Ɩ����i�o�b�`����ID�j
		String plantCd = null;             // �H��R�[�h
		String OprInstStartDate = null;    // �����
		String WorkOdrDlvDate = null;      // �[��
		String JobOdrCd = null;            // ����
		String ItemCd = null;              // �i�ڔԍ�
		String WsCd = null;                // ��Ƌ�R�[�h
		String OprRsltTyp = null;          // ��Ǝ��ы敪
		String OutSideTyp = null;          // ��Ǝw���v��i����j
		String OutSideTyp2 = null;         // ��Ǝw���v��i�O��j
		String VendCd = null;              // �����R�[�h

		// ��ԃo�b�`���}�j���A����
		int batchProcessingTyp = 0;   // 1: ��ԃo�b�`�i�����^�]�j2: �}�j���A���i�����^�]�Ȃ��j

		// �Ɩ����i�o�b�`����ID�j�̎擾
		Class myClass = this.getClass();
		businessName = myClass.getName();
		businessName = businessName.substring(businessName.length()-19, businessName.length()-9);

		// main�����󂯎��
		String args[] = m_med.getArgs();
		int argsLength = args.length;   // �����̌���ێ�

		try {
			// �R�l�N�V�����̎擾
			ScreenParam sp = new ScreenParam(this.getClass());
			conn = m_conductor.m_transactionConn;

			// �Ɩ����b�Z�[�W�̏����i�������n���Ă���O�p�j
			businessMsgAcc = new BusinessMessageAccessor();
			businessMsg = new BusinessMessage();
			businessMsgAcc.init(conn);
			businessMsg.setBusinessOperatingName(sp.getPackageName(ScreenParam.SHORT));
			businessMsg.setUser("SYSTEM");
			businessMsg.setPlantCode("##");

	// �����̑Ó������`�F�b�N���A�ϐ��ɃZ�b�g���� -----------------------------------------------------------
			if (argsLength != 4) {
				userId = "SYSTEM";
				businessName = sp.getPackageName(ScreenParam.SHORT);
				plantCd = "##";
				errCodeList.add("AD00023");// �o�b�`���������̌`�����s���ł�
				setErrNote("(SBM0617)�o�b�`�����������F[ " + argsLength + " ]");
				Exception e = new Exception();
				ExpjMessage emsg = new ExpjMessage("AD00023");
				m_med.getSyslog().warning(emsg, userId);

				throw e;
			}
			
			batchProcessingTyp = Integer.parseInt(args[0]);
			userId = args[1];
			plantCd = args[2];

			String vcarg = args[3];
			StringTokenizer arg = new StringTokenizer(vcarg,",");
			int i = 0;
			while(arg.hasMoreTokens()){
				if (i==0) {
					OprInstStartDate = (String)arg.nextElement(); 
				} else if (i==1){
					WorkOdrDlvDate = (String)arg.nextElement(); 
				} else if (i==2){
					JobOdrCd = (String)arg.nextElement(); 
				} else if (i==3){
					ItemCd = (String)arg.nextElement(); 
				} else if (i==4){
					WsCd = (String)arg.nextElement(); 
				} else if (i==5){
					OprRsltTyp = (String)arg.nextElement(); 
				} else if (i==6){
					OutSideTyp = (String)arg.nextElement(); 
				} else if (i==7){
					OutSideTyp2 = (String)arg.nextElement(); 
				} else if (i==8){
					VendCd = (String)arg.nextElement(); 
				}
				i++;
			}
			
			System.out.println("(SBM0893)�������o�b�`���������̃Z�b�g������");
			System.out.println("�@�@��businessName = " + businessName);
			System.out.println("�@�@��batchProcessingTyp = " + batchProcessingTyp);
			System.out.println("�@�@��userId = " + userId);
			System.out.println("�@�@��plantCd = " + plantCd);
			System.out.println("�@�@��OprInstStartDate = " + OprInstStartDate);
			System.out.println("�@�@��WorkOdrDlvDate = " + WorkOdrDlvDate);
			System.out.println("�@�@��JobOdrCd = " + JobOdrCd);
			System.out.println("�@�@��ItemCd = " + ItemCd);
			System.out.println("�@�@��WsCd = " + WsCd);
			System.out.println("�@�@��OprRsltTyp = " + OprRsltTyp);
			System.out.println("�@�@��OutSideTyp = " + OutSideTyp);
			System.out.println("�@�@��OutSideTyp2 = " + OutSideTyp2);
			System.out.println("�@�@��VendCd = " + VendCd);

			if(OprInstStartDate == null || OprInstStartDate.equals("null") || OprInstStartDate.equals("Null") || OprInstStartDate.equals("NULL")){
				OprInstStartDate = null;
			}
			if(WorkOdrDlvDate == null || WorkOdrDlvDate.equals("null") || WorkOdrDlvDate.equals("Null") || WorkOdrDlvDate.equals("NULL")){
				WorkOdrDlvDate = null;
			}

			// �����Ɂunull�v�������Ă����ꍇ�B�i�K�{���ځj
			if(batchProcessingTyp != 1 && batchProcessingTyp != 2){
				// �o�b�`���������̌`�����s���ł�
				errCodeList.add("AD00023");
				setErrNote("(SBM0621)�o�b�`�v���Z�X�^�C�v�F[ " + batchProcessingTyp + " ]");
				userId = "SYSTEM";
				plantCd = "##";
				Exception e = new Exception();
				ExpjMessage emsg = new ExpjMessage("AD00023");
				m_med.getSyslog().warning(emsg, userId);

				throw e;
			}
			if(userId == null || userId.equals("null") || userId.equals("Null") || userId.equals("NULL")){
				// �o�b�`���������̌`�����s���ł�
				errCodeList.add("AD00023");
				setErrNote("(SBM0619)���[�U�R�[�h�F[ " + userId + " ]");
				userId = "SYSTEM";
				plantCd = "##";
				Exception e = new Exception();
				ExpjMessage emsg = new ExpjMessage("AD00023");
				m_med.getSyslog().warning(emsg, userId);
				setWarningSysLogMessage("userId", userId, userId);

				throw e;
			}
			if(plantCd == null || plantCd.equals("null") || plantCd.equals("Null") || plantCd.equals("NULL")){
				// �o�b�`���������̌`�����s���ł�
				errCodeList.add("AD00023");
				setErrNote("(SBM0620)�H��R�[�h�F[ " + plantCd + " ]");
				userId = "SYSTEM";
				plantCd = "##";
				Exception e = new Exception();
				ExpjMessage emsg = new ExpjMessage("AD00023");
				m_med.getSyslog().warning(emsg, userId);
				setWarningSysLogMessage("plantCd", plantCd, userId);

				throw e;
			}

			// �Ɩ����b�Z�[�W�̏���
			businessMsg.setBusinessOperatingName(businessName);
			businessMsg.setUser(userId);
			businessMsg.setPlantCode(plantCd);

			// �Ɩ����b�N��������
			System.out.println("(SBM0842)�������@�Ɩ����b�N�J�n�@������");
			Lock = new BusinessLock(conn, userId, plantCd);
			lockCancelKey = Lock.doLock(businessName);  // �����L�[�̎擾
			// lockCancelKey==-1�̏ꍇ���Ɩ����b�N����Ă���̃G���[
			if(lockCancelKey == -1){
				errCodeList.add("ZZ01001");// �Ɩ����b�N����Ă��邽�ߋN���ł��܂���
				setErrNote("(SBM0580)���[�U�R�[�h�F[ " + userId + " ] �H��R�[�h�F[ " + plantCd + " ]");
				ExpjMessage emsg = new ExpjMessage("ZZ01001");
				m_med.getSyslog().warning(emsg, userId);
				setWarningSysLogMessage("userId", userId, userId);
				setWarningSysLogMessage("plantCd", plantCd, userId);

				throw new Exception("");
			}
			conn.commit();
			
			// �o�b�`�p�����[�^table����A�X�g�A�h���ʃp�����[�^��ǂݍ���
			m_med.setprogramCd(businessName);
			m_med.setfunctionName(functionName);
			AbstractBatchAppEntity sysBatParam = m_med.getreadSysBatParm();
			
			try {
				sysBatParam.read();
			} catch (Exception e) {
				// �o�b�`�p�����[�^�̓ǂݍ��݂Ɏ��s���܂���
				errCodeList.add("AD00024");
				setErrNote("(SBM0580)���[�U�R�[�h�F[ " + userId + " ] �H��R�[�h�F[ " + plantCd + " ]");
				ExpjMessage emsg = new ExpjMessage("AD00024");
				m_med.getSyslog().warning(emsg, userId);
				setWarningSysLogMessage("userId", userId, userId);
				setWarningSysLogMessage("plantCd", plantCd, userId);

				throw e;
			}
			
			if (sysBatParam.next()) {
				logMode = m_med.getlogModeTyp().toString();
				outputMode = m_med.getoutputModeTyp().toString();
				outputPath = m_med.getfilePath();
				outputName = m_med.getfileName();
			} else {
				// �o�b�`�p�����[�^�f�[�^�����݂��܂���
				errCodeList.add("AD00025");
				setErrNote("(SBM0580)���[�U�R�[�h�F[ " + userId + " ] �H��R�[�h�F[ " + plantCd + " ]");
				ExpjMessage emsg = new ExpjMessage("AD00025");
				m_med.getSyslog().warning(emsg, userId);
				setWarningSysLogMessage("userId", userId, userId);
				setWarningSysLogMessage("plantCd", plantCd, userId);

				Exception e = new Exception();
				throw e;
			}
			// ��ԃo�b�`�i�����^�]�j�̏ꍇ
			if ( batchProcessingTyp == 1 ) {

				// ���[�UID�����݂��邩�ǂ���
				m_med.setUSER_CD(userId);

				m_med.setprogramCd(businessName);
				m_med.setfunctionName(functionName);
				AbstractBatchAppEntity checkUserCd = m_med.getselectUserCd();
				try {
					checkUserCd.read();
				} catch (Exception e) {
					errCodeList.add("ZZ01106");// �T�[�o�ŃG���[���������܂����B
					setErrNote("(SBM0619)���[�U�R�[�h�F[ " + userId + " ]");
					ExpjMessage emsg = new ExpjMessage("ZZ01106");
					m_med.getSyslog().warning(emsg, userId);
					setWarningSysLogMessage("userId", userId, userId);

					throw e;
				}

				if (checkUserCd.next()) {
				} else {
					errCodeList.add("AD00023");// �o�b�`���������̌`�����s���ł�
					setErrNote("(SBM0619)���[�U�R�[�h�F[ " + userId + " ] ");
					Exception e = new Exception();
					ExpjMessage emsg = new ExpjMessage("AD00023");
					m_med.getSyslog().warning(emsg, userId);
					setWarningSysLogMessage("plantCd", plantCd, userId);

					throw e;
				}

				// �H��R�[�h�����݂��邩�ǂ���
				m_med.setPLANT_CD(plantCd);
				
				m_med.setpvc2BusinessName(businessName);
				m_med.setfunctionName(functionName);
				AbstractBatchAppEntity checkPlantCd = m_med.getselectPlantCd();
				try {
					checkPlantCd.read();
				} catch (Exception e) {
					errCodeList.add("AD00034");//�H��R�[�h�̓Ǎ��݂Ɏ��s���܂����B
					setErrNote("(SBM0620)�H��R�[�h�F[ " + plantCd + " ]");
					ExpjMessage emsg = new ExpjMessage("AD00034");
					m_med.getSyslog().warning(emsg, userId);
					setWarningSysLogMessage("plantCd", plantCd, userId);

					throw e;
				}
				if (checkPlantCd.next()) {
				} else {
					errCodeList.add("AD00009");// �w�肳�ꂽ�H��͑��݂��܂���B
					setErrNote("(SBM0620)�H��R�[�h�F[ " + plantCd + " ]");
					Exception e = new Exception();
					ExpjMessage emsg = new ExpjMessage("AD00009");
					m_med.getSyslog().warning(emsg, userId);
					setWarningSysLogMessage("plantCd", plantCd, userId);

					throw e;
				}
				
				// ���͓��t�̃`�F�b�N
				// Calendar�^�̓��t��p��
				Calendar calDate = Calendar.getInstance();
				// "yyyy/MM/dd"�̓��t�t�H�[�}�b�g�𐶐�
				DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
				df.setLenient(false);  // ���t���߂̂����܂������Ȃ���

				// ��������[���̂ǂ��炩�ɒl�������Ă��邩
				if ((OprInstStartDate != null || !OprInstStartDate.equals("")) && (WorkOdrDlvDate == null || WorkOdrDlvDate.equals(""))){
					// �擾������������Ó��ł��邩
					try {
						calDate.setTime(df.parse(OprInstStartDate));
					} catch (ParseException e) {
						errCodeList.add("AD00037");// ������Ɏw�肳�ꂽ���t�̌`�����s���ł��B
						setErrNote("(SBM0624)������F[ " + OprInstStartDate + " ]");
						ExpjMessage emsg = new ExpjMessage("AD00037");
						m_med.getSyslog().warning(emsg, userId);
						setWarningSysLogMessage("OprInstStartDate", OprInstStartDate, userId);

						throw e;
					}
				}else if((OprInstStartDate == null || OprInstStartDate.equals("")) && (WorkOdrDlvDate != null || !WorkOdrDlvDate.equals(""))){
					// �擾�����[�����Ó��ł��邩
					try {
						calDate.setTime(df.parse(WorkOdrDlvDate));
					} catch (ParseException e) {
						errCodeList.add("AD00035");// �[���Ɏw�肳�ꂽ���t�̌`�����s���ł��B
						setErrNote("(SBM0625)�[���F[ " + WorkOdrDlvDate + " ]");
						ExpjMessage emsg = new ExpjMessage("AD00035");
						m_med.getSyslog().warning(emsg, userId);
						setWarningSysLogMessage("WorkOdrDlvDate", WorkOdrDlvDate, userId);

						throw e;
					}
				}else{
					errCodeList.add("AD00023");// �o�b�`���������̌`�����s���ł�
					setErrNote("(SBM0626)������F[ " + OprInstStartDate + " ] �[���F[ " + WorkOdrDlvDate + " ]");
					ExpjMessage emsg = new ExpjMessage("AD00023");
					m_med.getSyslog().warning(emsg, userId);
					setWarningSysLogMessage("OprInstStartDate", OprInstStartDate, userId);
					setWarningSysLogMessage("WorkOdrDlvDate", WorkOdrDlvDate, userId);

					Exception e = new Exception();
					throw e;
				}
			}
			// SP���s
			if (!spExecute(logMode,outputMode,outputPath,outputName,userId,businessName,plantCd,OprInstStartDate,
						 WorkOdrDlvDate,JobOdrCd,ItemCd,WsCd,OprRsltTyp,OutSideTyp,OutSideTyp2,VendCd)){
				throw new Exception("");
			}
		} catch (Exception e) {
			try{
				conn.rollback();
			}catch(FoundationException fe){
				fe.printStackTrace();
				ExpjMessage exmsg = new ExpjMessage("ZZ01106");
				m_med.getSyslog().severe(exmsg, userId);
			}
			e.printStackTrace();
			if (errCodeList == null || errCodeList.size() == 0) {
				errCodeList.add("AK00010");//���̑��@�d��������
				setErrNote("(SBM0580)���[�U�R�[�h�F[ " + userId + " ] �H��R�[�h�F[ " + plantCd + " ]");
				ExpjMessage emsg = new ExpjMessage("AK00010");
				m_med.getSyslog().warning(emsg, userId);
				setWarningSysLogMessage("userId", userId, userId);
				setWarningSysLogMessage("plantCd", plantCd, userId);

			}
		} finally {
			for(int i=0;i<errCodeList.size();i++){
				errCode = (String)errCodeList.get(i);
				errNote = (String)errNoteHash.get(Integer.toString(i));

				// �Ɩ����b�Z�[�W�̓o�^
				if (businessMsg != null) {
					try{
						Numbering numbering = new Numbering(conn,Numbering.LOG_CD,userId,businessName,plantCd);
						businessMsg.setLogCode(numbering.getNo());
						businessMsg.setMessageCode(errCode);
						businessMsg.setData(errNote);
						businessMsgAcc.add(businessMsg);
						System.out.println("(SBM0836)�������@�Ɩ����b�Z�[�W�̓o�^�@������ <" + (i+1) + "/" + errCodeList.size() + ">");
						System.out.println("�@�@��userId = " + userId);
						System.out.println("�@�@��plantCd = " + plantCd);
						System.out.println("�@�@��No:" + businessMsg.getLogCode() + " errCode:" + errCode + " errNote:" + errNote);

					} catch (Exception ex) {
						ex.printStackTrace();
						ExpjMessage emsg = new ExpjMessage("ZZ01106");
						m_med.getSyslog().warning(emsg, userId);
					}
				}
			}
			try {
				System.out.println("(SBM1344)�������@�Ɩ����b�N�����@������");

				//���ʂ�false�̏ꍇ�����b�N�������s�̃G���[
				if(!Lock.doUnLock(businessName, lockCancelKey))
					throw new FoundationException("CtrlMain", "main", "ZZ01004");
				
			}catch (FoundationException e) {
				e.printStackTrace();
				errCode = "ZZ01004";  // �Ɩ����b�N�̉����Ɏ��s���܂����B
				ExpjMessage emsg = new ExpjMessage("ZZ01004");
				m_med.getSyslog().warning(emsg, userId);

				
				try {
					// �Ɩ����b�Z�[�W�̓o�^�i�Ɩ����b�N�������s���j
					Numbering numbering = new Numbering(conn,Numbering.LOG_CD,userId,businessName,plantCd);
					businessMsg.setLogCode(numbering.getNo());
					businessMsg.setMessageCode(errCode);
					businessMsg.setData("");
					businessMsgAcc.add(businessMsg);
					System.out.println("(SBM1345)�������@�Ɩ����b�Z�[�W�̓o�^�@������");
					System.out.println("�@�@��No:" + businessMsg.getLogCode() + " errCode:" + errCode);
					
				} catch (SQLException ex) {
					ex.printStackTrace();
					ExpjMessage exmsg = new ExpjMessage("ZZ01106");
					m_med.getSyslog().severe(exmsg, userId);
					ExpjMessage eexmsg = new ExpjMessage("ZZ01006", e.toString());
					m_med.getSyslog().severe(eexmsg, userId);
				} catch (FoundationException ex) {
					ex.printStackTrace();
					ExpjMessage exmsg = new ExpjMessage("ZZ01106");
					m_med.getSyslog().severe(exmsg, userId);
				}
			}
		}

		return BREAK;
	}


	//////////////////////////////

	/**
	 * object�^��Ԃ��܂�
	 *
	 * @return object�^
	 */
	public int getType()
	{
		return m_control.getType();
	}

	/**
	 * ��������
	 *
	 * @return <<�R�����g���L�q���Ă�������>>
	 * @exception <<�R�����g���L�q���Ă�������>>
	 */
	public int beginProc() throws BatchAppException
	{

		// todo: �����Ƀ��[�U��`�R�[�h���L�q���Ă�������

		return m_control.beginProc();
	}

	/**
	 * �I������
	 *
	 * @exception <<�R�����g���L�q���Ă�������>>
	 */
	public int endProc() throws BatchAppException
	{

		// todo: �����Ƀ��[�U��`�R�[�h���L�q���Ă�������

		return m_control.endProc();
	}

	/**
	 * �I������
	 *
	 * @exception <<�R�����g���L�q���Ă�������>>
	 */
	public int execute() throws BatchAppException
	{

		// todo: �����Ƀ��[�U��`�R�[�h���L�q���Ă�������

		// �������ʂ����^�[���l�Ƃ������Ƃ��͂����Őݒ肵�܂��B
		// setExecuteStatus(0);

		return m_control.execute();
	}

        //}}user_implement_code

	//{{control_class(wizard code)

	//////////////////////////////

	class interControl
		implements IBatchAppCommon
	{

		//////////////////////////////

		/**
		 * mediator�N���X �C���X�^���X
		 */
		public medAD0030B002 m_med=null;

		/**
		 * �R���e�i�N���X�C���X�^���X
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medAD0030B002 med) throws BatchAppException
		{
			// �e�����o�ϐ��̏�����
			m_med = med;

			try {
				m_container = new ManageContainer();
			} catch(FoundationException e) {
				e.printStackTrace();
				throw new BatchAppException("CtrlMain", "constractor", "DB�ւ̐ڑ��Ɏ��s���܂���");
			}
			return;
		}

		protected void finalize()
		{
			m_med = null;
			return;
		}

		//////////////////////////////



		//////////////////////////////

		public int getType()
		{
			return TYPE_CONTROL;
		}

		public int beginProc() throws BatchAppException
		{
			return IBatchAppCommon.SUCCESS;
		}

		public int endProc() throws BatchAppException
		{
			int ret;

			return IBatchAppCommon.SUCCESS;
		}

		public int execute() throws BatchAppException
		{
			int ret;

			try {
				if((ret=main())!=IBatchAppCommon.SUCCESS ) return ret;
			} catch(Exception ex) {
				throw new BatchAppException("CtrlMain", "execute", "execute�̏����Ɏ��s���܂���");
			}

			return IBatchAppCommon.SUCCESS;
		}

		public void commit() throws BatchAppException
		{
			try {
				m_conductor.m_transactionConn.getConn().commit();
				m_conductor.m_transactionConn.getConn().setAutoCommit(false);
			} catch(SQLException e) {
				e.printStackTrace();
				throw new BatchAppException("CtrlMain", "commit", "DB�ւ̃R�~�b�g���Ɏ��s���܂���(SQLException)");
			}

			return;
		}

		public void rollback() throws BatchAppException
		{
			try {
				m_conductor.m_transactionConn.getConn().rollback();
				m_conductor.m_transactionConn.getConn().setAutoCommit(false);
			} catch(SQLException e) {
				e.printStackTrace();
				throw new BatchAppException("CtrlMain", "rollback", "DB�ւ̃��[���o�b�N���Ɏ��s���܂���(SQLException)");
			}

			return;
		}

		//////////////////////////////

	}

	//}}control_class(wizard code)

}
