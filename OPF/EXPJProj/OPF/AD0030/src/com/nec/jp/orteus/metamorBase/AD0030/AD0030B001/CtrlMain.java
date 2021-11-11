/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0030/src/com/nec/jp/orteus/metamorBase/AD0030/AD0030B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0030.AD0030B001;

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
	// TODO: ������import�p�b�P�[�W���L�q���Ă�������
import com.nec.jp.orteus.metamorBase.util.BusinessLock.BusinessLock;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.metamorBase.common.util.ScreenParam;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
import com.nec.jp.orteus.expj.util.*;
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain �N���X
 * �t�@�C���E�N���X����
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.23 $ $Date: 2016/05/23 08:12:43 $
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
	public medAD0030B001 m_med=null;

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
	public CtrlMain(medAD0030B001 med, BatchAppConductor cdr) throws BatchAppException
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

	/** �G���[���X�g */
	List errCodeList = new ArrayList();
	
	/** �G���[�m�[�g */
	Hashtable errNoteHash = new Hashtable();
	
	/** �G���[�H��R�[�h */
	Hashtable errPlantCdHash = new Hashtable();
	
	/**
	 * �G���[�m�[�g�Z�b�^�[
	 * @param note �G���[�m�[�g
	 */
	public void setErrNote(String note){
		errNoteHash.put(Integer.toString(errCodeList.size() - 1), note);
	}
	
	/**
	 * �G���[�H��R�[�h�Z�b�^�[
	 * @param code �H��R�[�h
	 */
	public void setErrPlantCd(String code){
		errPlantCdHash.put(Integer.toString(errCodeList.size() - 1), code);
	}
	
	//SP���s
	/**
	 * �X�g�A�h�v���V�[�W�����s
	 * @param logMode ���O���[�h
	 * @param outputMode �o�̓��[�h
	 * @param outputPath �o�̓t�@�C���p�X
	 * @param outputName �o�̓t�@�C����
	 * @param userId ���[�UID
	 * @param businessName �Ɩ���
	 * @param plantCd �H��R�[�h
	 * @param finalMonthlyDate ���������Ώۓ�
	 * @return boolean true ����I�� : false �ُ�I��
	 */
	public boolean spExecute(String logMode, String outputMode, String outputPath, 
			String outputName, String userId, String businessName, String plantCd, 
			String oprInstStartDate, String workOdrDlvDate, String jobOdrCd) {
		try {
			// �X�g�A�h�v���V�[�W���̃p�����[�^���Z�b�g����
			m_med.setpvc2LogMode(logMode);
			m_med.setpvc2OutputMode(outputMode);
			m_med.setpvc2OutputPath(outputPath);
			m_med.setpvc2OutputName(outputName);
			m_med.setpvc2UserId(userId);
			m_med.setpvc2BusinessName(businessName);
			m_med.setpvc2PlantCd(plantCd);
			m_med.setpvc2OprInstStartDate(oprInstStartDate);  // ��Ɛ��������
			m_med.setpvc2WorkOdrDlvDate(workOdrDlvDate);      // ��Ɛ����[��
			m_med.setpvc2JobOdrCd(jobOdrCd);                  // ����
			
			ExpjMessage emsg = new ExpjMessage("ZZ01006", 
					"(SBM0891)�������X�g�A�h�v���V�[�W���̃p�����[�^�Z�b�g������");
			m_med.getSyslog().info(emsg, userId);
			emsg = new ExpjMessage("ZZ01006", "�@�@��logModeTyp = " + logMode);
			m_med.getSyslog().info(emsg, userId);
			emsg = new ExpjMessage("ZZ01006", "�@�@��outputMode = " + outputMode);
			m_med.getSyslog().info(emsg, userId);
			emsg = new ExpjMessage("ZZ01006", "�@�@��outputPath = " + outputPath);
			m_med.getSyslog().info(emsg, userId);
			emsg = new ExpjMessage("ZZ01006", "�@�@��outputName = " + outputName);
			m_med.getSyslog().info(emsg, userId);
			emsg = new ExpjMessage("ZZ01006", "�@�@��userId = " + userId);
			m_med.getSyslog().info(emsg, userId);
			emsg = new ExpjMessage("ZZ01006", "�@�@��businessName = " + businessName);
			m_med.getSyslog().info(emsg, userId);
			emsg = new ExpjMessage("ZZ01006", "�@�@��plantCd = " + plantCd);
			m_med.getSyslog().info(emsg, userId);
			emsg = new ExpjMessage("ZZ01006", "�@�@��oprInstStartDate = " + oprInstStartDate);
			m_med.getSyslog().info(emsg, userId);
			emsg = new ExpjMessage("ZZ01006", "�@�@��workOdrDlvDate = " + workOdrDlvDate);
			m_med.getSyslog().info(emsg, userId);
			emsg = new ExpjMessage("ZZ01006", "�@�@��jobOdrCd = " + jobOdrCd);
			m_med.getSyslog().info(emsg, userId);
			
			// �X�g�A�h�v���V�[�W���̎��s
			try {
				emsg = new ExpjMessage("ZZ01006", "(SBM0892)�������@SP���s�@������");
				m_med.getSyslog().info(emsg, userId);
				m_med.getcallSqlExpandByProc().call();
			} catch (Exception e) {
				errCodeList.add("AD00026");//�X�g�A�h�v���V�[�W�����s���G���[
				StringBuffer sb = new StringBuffer();
				sb.append("(SBM0577)�X�g�A�h�v���V�[�W�������F[ ");
				sb.append(logMode + " ");
				sb.append(outputMode + " ");
				sb.append(outputPath + " ");
				sb.append(outputName + " ");
				sb.append(userId + " ");
				sb.append(businessName + " ");
				sb.append(plantCd + " ");
				sb.append(oprInstStartDate + " ");
				sb.append(workOdrDlvDate + " ");
				sb.append(jobOdrCd + " ");
				sb.append(" ]");

				String errNote = sb.toString();
				//�G���[�m�[�g�ǉ�
				setErrNote(errNote);
				setErrPlantCd(plantCd);
				return false;
			}
		} catch (Exception e) {
			errCodeList.add("AD00024");// �o�b�`�p�����[�^�̓ǂݍ��݂Ɏ��s���܂���
			setErrNote("(SBM0580)���[�U�R�[�h�F[ " + userId + " ] �H��R�[�h�F[ " + plantCd + " ]");
			setErrPlantCd(plantCd);
			ExpjMessage emsg = new ExpjMessage("ZZ01006", 
					"(SBM1111)�X�g�A�h�v���V�[�W�����s���G���[");
			m_med.getSyslog().severe(emsg, userId);
			return false;
		}
		return true;
	}

	/**
	 * CtrlMain�N���X�̕W���R���X�g���N�^
	 *
	 */
	public CtrlMain(medAD0030B001 med) throws BatchAppException
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
/*

		// todo: �����Ƀ��[�U��`�R�[�h���L�q���Ă�������

*/
		IDbConnection conn = null;	  // DB�R�l�N�V����
		BusinessLock Lock = null;     // �Ɩ����b�N
		int lockCancelKey = 0;	      // ���b�N�����L�[

		// metamorBase�Ɩ����b�Z�[�W
		BusinessMessageAccessor businessMsgAcc = null;
		BusinessMessage businessMsg = null;     // metamorBase�Ɩ����b�Z�[�W

		// ��ԃo�b�`���}�j���A����
		int batchProcessingTyp = 0;   // 1: ��ԃo�b�`�i�����^�]�j2: �}�j���A���i�����^�]�Ȃ��j

		// �X�g�A�h�v���V�[�W����
		String functionName = "SQLEXPANDBYPROC";  // ��ƌn��W�J

		// �X�g�A�h�v���V�[�W���p�����[�^
		String logMode = null;             // ���O���[�h
		String outputMode = null;          // �o�̓��[�h
		String outputPath = null;          // �o�̓p�X
		String outputName = null;          // �o�̓t�@�C����
		String userId = null;              // ���[�UID
		String businessName = null;        // �Ɩ����i�o�b�`����ID�j
		String plantCd = null;             // �H��R�[�h
		String oprInstStartDate = null;    // ��Ɛ��������
		String workOdrDlvDate = null;      // ��Ɛ����[��
		String jobOdrCd = null;            // ����
		String etcPrm = null;              // ��Ɛ��������+��Ɛ����[��+����

		// �Ɩ����i�o�b�`����ID�j�̎擾
		Class myClass = this.getClass();
		businessName = myClass.getName();
		businessName = businessName.substring(businessName.length() - 19, 
				businessName.length() - 9);

		// main�����󂯎��
		String args[] = m_med.getArgs();
		
		// �p�����[�^�m�F
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

// �����̑Ó������`�F�b�N���A�ϐ��ɃZ�b�g���� -----------------------
			if (argsLength != 4) {
				// �o�b�`���������̌`�����s���ł�
				userId = "SYSTEM";
				businessName = sp.getPackageName(ScreenParam.SHORT);
				plantCd = "##";
				errCodeList.add("AD00023");
				setErrNote("(SBM0617)�o�b�`�����������F[ " + argsLength + " ]");
				setErrPlantCd(plantCd);
				Exception e = new Exception();
				ExpjMessage emsg = new ExpjMessage("ZZ01006", "(SBM0838)�����̐����s���ł��B");
				m_med.getSyslog().severe(emsg, userId);
				throw e;
			}

			batchProcessingTyp = Integer.parseInt(args[0]);
			userId = args[1];
			plantCd = args[2];
			etcPrm = args[3];  // ��Ɛ��������+��Ɛ����[��+����

			StringTokenizer tokEtcPrm = new StringTokenizer(etcPrm,",");
			int i = 0;
			while(tokEtcPrm.hasMoreTokens()){
				if(i == 0){
					oprInstStartDate = (String)tokEtcPrm.nextElement();  // ��Ɛ��������
					i++;
				}else if(i == 1){
					workOdrDlvDate = (String)tokEtcPrm.nextElement();    // ��Ɛ����[��
					i++;
				}else{
					jobOdrCd = (String)tokEtcPrm.nextElement();          // ����
					i++;
				}
			}
				
			if (oprInstStartDate == null || oprInstStartDate.equals("null") 
					|| oprInstStartDate.equals("Null") || oprInstStartDate.equals("NULL")) {
				oprInstStartDate = null;
			}
			if (workOdrDlvDate == null || workOdrDlvDate.equals("null") 
					|| workOdrDlvDate.equals("Null") || workOdrDlvDate.equals("NULL")) {
				workOdrDlvDate = null;
			}
			if (jobOdrCd == null || jobOdrCd.equals("null") || jobOdrCd.equals("Null") 
					|| jobOdrCd.equals("NULL")) {
				jobOdrCd = null;
			}

			// �����Ɂunull�v�������Ă����ꍇ�B�i�K�{���ځj
			if (userId == null || userId.equals("null") || userId.equals("Null") 
					|| userId.equals("NULL")) {
				// �o�b�`���������̌`�����s���ł�
				errCodeList.add("AD00023");
				setErrNote("(SBM0619)���[�U�R�[�h�F[ " + userId + " ]");
				Exception e = new Exception();
				userId = "SYSTEM";
				plantCd = "##";
				setErrPlantCd(plantCd);
				ExpjMessage emsg = new ExpjMessage("ZZ01006", "(SBM0839)���[�U�R�[�h�������͂ł��B");
				m_med.getSyslog().severe(emsg, userId);
				throw e;
			}
			if (plantCd == null || plantCd.equals("null") || plantCd.equals("Null") 
					|| plantCd.equals("NULL")) {
				// �o�b�`���������̌`�����s���ł�
				errCodeList.add("AD00023");
				setErrNote("(SBM0620)�H��R�[�h�F[ " + plantCd + " ]");
				userId = "SYSTEM";
				plantCd = "##";
				setErrPlantCd(plantCd);
				Exception e = new Exception();
				ExpjMessage emsg = new ExpjMessage("ZZ01006", "(SBM0840)�H��R�[�h�������͂ł��B");
				m_med.getSyslog().severe(emsg, userId);
				throw e;
			}
				// �Ɩ����b�Z�[�W�̏���
				businessMsg.setBusinessOperatingName(businessName);
				businessMsg.setUser(userId);
				businessMsg.setPlantCode(plantCd);
			
			if (batchProcessingTyp != 1 && batchProcessingTyp != 2) {
				// �o�b�`���������̌`�����s���ł�
				errCodeList.add("AD00023");
				setErrNote("(SBM0621)�o�b�`�v���Z�X�^�C�v�F[ " + batchProcessingTyp + " ]");
				setErrPlantCd(plantCd);
				Exception e = new Exception();
				ExpjMessage emsg = new ExpjMessage("ZZ01006", "(SBM0841)�o�b�`�v���Z�X�^�C�v���s���ł��B");
				m_med.getSyslog().severe(emsg, userId);
				throw e;
			}

			// �o�b�`�p�����[�^table����A�X�g�A�h���ʃp�����[�^��ǂݍ���
			m_med.setprogramCd(businessName);
			m_med.setfunctionName(functionName);
			AbstractBatchAppEntity sysBatParam = m_med.getreadSysBatParm();
			
			try {
				sysBatParam.read();
			} catch (Exception e) {
				errCodeList.add("AD00024");// �o�b�`�p�����[�^�̓ǂݍ��݂Ɏ��s���܂���
				setErrNote("(SBM0580)���[�U�R�[�h�F[ " + userId + " ] �H��R�[�h�F[ " + plantCd + " ]");
				setErrPlantCd(plantCd);
				ExpjMessage emsg = new ExpjMessage("ZZ01006", 
						"(SBM0925)�o�b�`�p�����[�^�̓ǂݍ��݂Ɏ��s���܂����B");
				m_med.getSyslog().severe(emsg, userId);
				throw e;
			}

			if (sysBatParam.next()) {
				logMode = m_med.getlogModeTyp().toString();
				outputMode = m_med.getoutputModeTyp().toString();
				outputPath = m_med.getfilePath();
				outputName = m_med.getfileName();
			} else {
				errCodeList.add("AD00025");// �o�b�`�p�����[�^�f�[�^�����݂��܂���
				setErrNote("(SBM0580)���[�U�R�[�h�F[ " + userId + " ] �H��R�[�h�F[ " + plantCd + " ]");
				setErrPlantCd(plantCd);
				Exception e = new Exception();
				ExpjMessage emsg = new ExpjMessage("ZZ01006", 
						"(SBM0576)�o�b�`�p�����[�^�f�[�^�����݂��܂���B");
				m_med.getSyslog().severe(emsg, userId);
				throw e;
			}

// ���̓`�F�b�N************************************************************************************
			// ��ԃo�b�`�i�����^�]�j�̏ꍇ
			if (batchProcessingTyp == 1) {

				// ���[�UID�����݂��邩�ǂ���
				m_med.setwhereUserCd(userId);

				m_med.setprogramCd(businessName);
				m_med.setfunctionName(functionName);
				AbstractBatchAppEntity selectUserCd = m_med.getselectUserCd();
				try {
					selectUserCd.read();
				} catch (Exception e) {
					errCodeList.add("ZZ01106");// �T�[�o�ŃG���[���������܂����B
					setErrNote("(SBM0619)���[�U�R�[�h�F[ " + userId + " ]");
					setErrPlantCd(plantCd);
					ExpjMessage emsg = new ExpjMessage("ZZ01006", 
							"(SBM0927)���[�U�R�[�h�̓Ǎ��݂Ɏ��s���܂����B");
					m_med.getSyslog().severe(emsg, userId);
					throw e;
				}

				if (selectUserCd.next()) {
				} else {
					errCodeList.add("ZZ09003");// ���[�U�R�[�h�̃p�����[�^�������͂ł��B
					setErrNote("(SBM0619)���[�U�R�[�h�F[ " + userId + " ] ");
					setErrPlantCd(plantCd);
					Exception e = new Exception();
					ExpjMessage emsg = new ExpjMessage("ZZ01006", 
							"(SBM0928)�w�肳�ꂽ���[�U�R�[�h�͑��݂��܂���B");
					m_med.getSyslog().severe(emsg, userId);
					throw e;
				}
				
				// �H��R�[�h�����݂��邩�ǂ���
				m_med.setwherePlantCd(plantCd);
				
				m_med.setprogramCd(businessName);
				m_med.setfunctionName(functionName);
				AbstractBatchAppEntity selectPlantCd = m_med.getselectPlantCd();
				try {
					selectPlantCd.read();
				} catch (Exception e) {
					errCodeList.add("AD00034");//�H��R�[�h�̓Ǎ��݂Ɏ��s���܂����B
					setErrNote("(SBM0620)�H��R�[�h�F[ " + plantCd + " ]");
					setErrPlantCd(plantCd);
					ExpjMessage emsg = new ExpjMessage("ZZ01006", 
							"(SBM0929)�H��R�[�h�̓Ǎ��݂Ɏ��s���܂����B");
					m_med.getSyslog().severe(emsg, userId);
					throw e;
				}
				if (selectPlantCd.next()) {
				} else {
					errCodeList.add("AD00009");// �w�肳�ꂽ�H��͑��݂��܂���B
					setErrNote("(SBM0620)�H��R�[�h�F[ " + plantCd + " ]");
					setErrPlantCd(plantCd);
					Exception e = new Exception();
					ExpjMessage emsg = new ExpjMessage("ZZ01006", 
							"(SBM0930)�w�肳�ꂽ�H��͑��݂��܂���B");
					m_med.getSyslog().severe(emsg, userId);
					throw e;
				}
				
				// ���͓��t�̃`�F�b�N
				// Calendar�^�̓��t��p��
				Calendar calDate = Calendar.getInstance();
				// "yyyy/MM/dd"�̓��t�t�H�[�}�b�g�𐶐�
				DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
				df.setLenient(false);  // ���t���߂̂����܂������Ȃ���

				// ��Ɛ������������Ɛ����[���̂ǂ��炩�ɒl�������Ă��邩
				if ((oprInstStartDate != null || !oprInstStartDate.equals("")) 
						&& (workOdrDlvDate == null || workOdrDlvDate.equals(""))) {
					// �擾������Ɛ�����������Ó��ł��邩
					try {
						calDate.setTime(df.parse(oprInstStartDate));
					} catch (ParseException e) {
						errCodeList.add("AD00037");// ������Ɏw�肳�ꂽ���t�̌`�����s���ł��B
						setErrNote("(SBM0618)��Ɛ���������F[ " + oprInstStartDate + " ]");
						setErrPlantCd(plantCd);
						ExpjMessage emsg = new ExpjMessage("ZZ01006", 
								"(SBM0922)������Ɏw�肳�ꂽ���t�̌`�����s���ł��B");
						m_med.getSyslog().severe(emsg, userId);
						throw e;
					}
				} else if ((oprInstStartDate == null || oprInstStartDate.equals("")) 
						&& (workOdrDlvDate != null || !workOdrDlvDate.equals(""))) {
					// �擾������Ɛ����[�����Ó��ł��邩
					try {
						calDate.setTime(df.parse(workOdrDlvDate));
					} catch (ParseException e) {
						errCodeList.add("AD00035");// �[���Ɏw�肳�ꂽ���t�̌`�����s���ł��B
						setErrNote("(SBM0622)��Ɛ����[���F[ " + workOdrDlvDate + " ]");
						setErrPlantCd(plantCd);
						ExpjMessage emsg = new ExpjMessage("ZZ01006", 
								"(SBM0923)�[���Ɏw�肳�ꂽ���t�̌`�����s���ł��B");
						m_med.getSyslog().severe(emsg, userId);
						throw e;
					}
				} else {
					errCodeList.add("AD00023");// �o�b�`���������̌`�����s���ł�
					setErrNote("(SBM0623)��Ɛ���������F[ " + oprInstStartDate 
							+ " ] ��Ɛ����[���F[ " + workOdrDlvDate + " ]");
					setErrPlantCd(plantCd);
					ExpjMessage emsg = new ExpjMessage("ZZ01006", 
							"(SBM0924)���͓��t�̃`�F�b�N�Ńo�b�`���������̌`�����s���ł��B");
					m_med.getSyslog().severe(emsg, userId);
					Exception e = new Exception();
					throw e;
				}
			}
			// �Ɩ����b�N��������
			ExpjMessage emsg = new ExpjMessage("ZZ01006", "(SBM0842)�������@�Ɩ����b�N�J�n�@������");
			m_med.getSyslog().info(emsg, userId);
			Lock = new BusinessLock(conn, userId, plantCd);
			lockCancelKey = Lock.doLock(businessName);  // �����L�[�̎擾
			// lockCancelKey==-1�̏ꍇ���Ɩ����b�N����Ă���̃G���[
			if(lockCancelKey == -1){
				errCodeList.add("ZZ01001");// �Ɩ����b�N����Ă��邽�ߋN���ł��܂���
				setErrNote("(SBM0580)���[�U�R�[�h�F[ " + userId 
						+ " ] �H��R�[�h�F[ " + plantCd + " ]");
				setErrPlantCd(plantCd);
				emsg = new ExpjMessage("ZZ01006", 
						"(SBM0843)�Ɩ����b�N����Ă��邽�ߋN���ł��܂���B");
				m_med.getSyslog().severe(emsg, userId);
				throw new Exception("");
			}
			conn.commit();

			//SP���s
			if (!spExecute(logMode, outputMode, outputPath, outputName, 
					userId, businessName, plantCd, oprInstStartDate, 
					workOdrDlvDate, jobOdrCd)) {
				//���ʂ�false�̏ꍇ�����b�N�������s�̃G���[
				emsg = new ExpjMessage("ZZ01006", 
						"(SBM1344)�������@�Ɩ����b�N�����@������ " + plantCd);
				m_med.getSyslog().info(emsg, userId);
				if(!Lock.doUnLock(businessName, lockCancelKey)) {
					throw new FoundationException("CtrlMain", "main", "ZZ01004");
				}
				throw new Exception("");
			}
			//���ʂ�false�̏ꍇ�����b�N�������s�̃G���[
			emsg = new ExpjMessage("ZZ01006", "(SBM1344)�������@�Ɩ����b�N�����@������ " + plantCd);
			m_med.getSyslog().info(emsg, userId);
			if (!Lock.doUnLock(businessName, lockCancelKey)) {
				throw new FoundationException("CtrlMain", "main", "ZZ01004");
			}
			conn.commit();
			
		} catch (Exception e) {
			try {
				conn.rollback();
			} catch (FoundationException fe) {
				fe.printStackTrace();
			}
			e.printStackTrace();
			if (errCodeList == null || errCodeList.size() == 0) {
				errCodeList.add("AD00027");//���̑��@�d��������
				setErrNote("(SBM0580)���[�U�R�[�h�F[ " + userId 
						+ " ] �H��R�[�h�F[ " + plantCd + " ]");
				setErrPlantCd(plantCd);
				ExpjMessage emsg = new ExpjMessage("ZZ01006", "(SBM1363)���̑��@�d��������");
				m_med.getSyslog().severe(emsg, userId);
			}
		} finally {
			try {
				for (int i = 0; i < errCodeList.size(); i++) {
					String errCode = (String)errCodeList.get(i);
					String errNote = (String)errNoteHash.get(Integer.toString(i));
					String errPlantCd = (String)errPlantCdHash.get(Integer.toString(i));
	
					// �Ɩ����b�Z�[�W�̓o�^
					if (businessMsg != null) {
						try{
							Numbering numbering = new Numbering(conn, Numbering.LOG_CD, 
									userId, businessName, errPlantCd);
							businessMsg.setLogCode(numbering.getNo());
							businessMsg.setPlantCode(errPlantCd);
							businessMsg.setMessageCode(errCode);
							businessMsg.setData(errNote);
							businessMsgAcc.add(businessMsg);
							ExpjMessage emsg = new ExpjMessage("ZZ01006", 
									"(SBM0836)�������@�Ɩ����b�Z�[�W�̓o�^�@������ <" + (i + 1) + "/" 
									+ errCodeList.size() + ">");
							m_med.getSyslog().info(emsg, userId);
							emsg = new ExpjMessage("ZZ01006", 
									"�@�@��No:" + businessMsg.getLogCode() + " errCode:" 
									+ errCode + " errNote:" + errNote);
							m_med.getSyslog().severe(emsg, userId);
	
						} catch (Exception ex) {
							ex.printStackTrace();
						}
					}
				}
				
				conn.commit();

				ExpjMessage emsg = new ExpjMessage("ZZ01006", "(SBM1344)�������@�Ɩ����b�N�����@������");
				m_med.getSyslog().info(emsg, userId);

				//���ʂ�false�̏ꍇ�����b�N�������s�̃G���[
				if (!Lock.doUnLock(businessName, lockCancelKey)) {
					throw new FoundationException("CtrlMain", "main", "ZZ01004");
				}
			} catch (FoundationException e) {
				e.printStackTrace();
				String errCode = "ZZ01004";  // �Ɩ����b�N�̉����Ɏ��s���܂����B
				ExpjMessage emsg = new ExpjMessage("ZZ01006", "(SBM0846)�Ɩ����b�N�̉����Ɏ��s���܂����B");
				m_med.getSyslog().severe(emsg, userId);
				
				try {
					// �Ɩ����b�Z�[�W�̓o�^�i�Ɩ����b�N�������s���j
					Numbering numbering = new Numbering(conn, Numbering.LOG_CD, 
							userId, businessName, plantCd);
					businessMsg.setLogCode(numbering.getNo());
					businessMsg.setPlantCode(plantCd);
					businessMsg.setMessageCode(errCode);
					businessMsg.setData("");
					businessMsgAcc.add(businessMsg);
					emsg = new ExpjMessage("ZZ01006", "(SBM1345)�������@�Ɩ����b�Z�[�W�̓o�^�@������");
					m_med.getSyslog().info(emsg, userId);
					emsg = new ExpjMessage("ZZ01006", 
							"�@�@��No:" + businessMsg.getLogCode() + " errCode:" + errCode);
					m_med.getSyslog().severe(emsg, userId);
					
				} catch (SQLException ex) {
					ex.printStackTrace();
				} catch (FoundationException ex) {
					ex.printStackTrace();
				}
			}
		}

// ��INS ====================================================================================
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
		public medAD0030B001 m_med=null;

		/**
		 * �R���e�i�N���X�C���X�^���X
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medAD0030B001 med) throws BatchAppException
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