/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0150/src/com/nec/jp/orteus/metamorBase/AC0150/AC0150B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0150.AC0150B001;

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
import com.nec.jp.orteus.msg.util.*;
import com.nec.jp.orteus.msg.core.*;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessLock.BusinessLock;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.metamorBase.util.SystemLog.SystemLog;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
import com.nec.jp.orteus.expj.util.Converter;
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain �N���X
 * �t�@�C���E�N���X����
 * @author $Author: zhou-kehong $
 * @version $Revision: 1.8 $ $Date: 2014/11/28 01:27:48 $
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
	public medAC0150B001 m_med=null;

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
	public CtrlMain(medAC0150B001 med, BatchAppConductor cdr) throws BatchAppException
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

	/**
	 * CtrlMain�N���X�̕W���R���X�g���N�^
	 *
		 */
	public CtrlMain(medAC0150B001 med) throws BatchAppException
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
		// =============
		// �� �� �� �� 
		// =============
		IDbConnection conn = null; // DB�R�l�N�V����
		BusinessLock Lock = null; // �Ɩ����b�N
		int lockCancelKey = 0; // ���b�N�����L�[
		Numbering logCd = null; // ���O���ʃR�[�h�̔Ԃ̏���

		// �o�b�`�������ʃG���[����
		String errCode = null; // �G���[�R�[�h
		String errMsg = null; // �G���[���b�Z�[�W
		String errNote = ""; // �G���[���b�Z�[�W(���l)

		// metamorBase�Ɩ����b�Z�[�W
		BusinessMessageAccessor businessMsgAcc = null;
		BusinessMessage businessMsg = null; // metamorBase�Ɩ����b�Z�[�W
		String businessErrCode = null; // metamorBase�Ɩ����b�Z�[�W�R�[�h

		// �Ɩ����b�Z�[�W
		String memoText = ""; // �Ɩ����b�Z�[�W ���l

		// ��ԃo�b�`���}�j���A����
		int batchProcessingTyp = 0; // 1: ��ԃo�b�`�i�����^�]�j2: �}�j���A���i�����^�]�Ȃ��j

		// �X�g�A�h�v���V�[�W����
		String functionName = null;

		// �X�g�A�h�v���V�[�W���p�����[�^
		String logMode = null; // ���O���[�h
		String outputMode = null; // �o�̓��[�h
		String outputPath = null; // �o�̓p�X
		String outputName = null; // �o�̓t�@�C����
		String userId = null; // ���[�UID
		String businessName = null; // �Ɩ����i�o�b�`����ID�j
		String batchTyp = null;             //�o�b�`�����敪
		String plantCd = null; // �H��R�[�h
		String SysTime = null; // �Ǘ��敪 1�F�l�q�o �Q�F����
		String jobOdrCd = null; // ����
		String jobOdrDetailNo = null; // ���Ԏ}�ԁiSI�Ή����� metamorBase�ł͖��g�p�j

		
		// ==========
		// ���ʏ���
		// ==========
		
		// �Œ�l���Z�b�g
		functionName = "SQLODRELEASE_IND"; // �ʃI�[�_����

		// �Ɩ����i�o�b�`����ID�j�̎擾
		Class myClass = this.getClass();
		businessName = myClass.getName();
		businessName = businessName.substring(businessName.length() - 19,
				businessName.length() - 9);

		// main�����󂯎��
		String args[] = m_med.getArgs();
		int argsLength = args.length; // �����̌���ێ�

		try { 
			// ��������A�o�b�`�����敪���擾����
			if (argsLength >= 2) {
				try {
					batchProcessingTyp = Integer.parseInt(args[0]);
				} catch (NumberFormatException e) {
					errCode = "AC00111"; // �o�b�`���������̌`�����s���ł�
					throw e;
				}
			} else {
				errCode = "AC00111"; // �o�b�`���������̌`�����s���ł�
				Exception e = new Exception();
				throw e;
			}

			// �o�b�`�p�����[�^table����A�X�g�A�h���ʃp�����[�^��ǂݍ���
			m_med.setprogramCd(businessName);
			m_med.setfunctionName(functionName);

			AbstractBatchAppEntity sysBatParam = m_med.getreadSysBatParm();
			try {
				sysBatParam.read();
				if (sysBatParam.next()) {
					logMode = m_med.getlogModeTyp().toString();
					outputMode = m_med.getoutputModeTyp().toString();
					outputPath = m_med.getfilePath();
					outputName = m_med.getfileName();
				} else {
					errCode = "AC00109"; // �o�b�`�p�����[�^�f�[�^�����݂��܂���
					Exception e = new Exception();
					throw e;
				}
			} catch (Exception e) {
				if (errCode == null) {
					errCode = "AC00113"; // �o�b�`�p�����[�^�̓ǂݍ��݂Ɏ��s���܂���
				}
				throw e;
			}
			
			// ===================
			// �o�b�`�i�^�]�j
			// ===================
			
			// �����̑Ó������`�F�b�N���A�ϐ��ɃZ�b�g���� -------------------
			if (argsLength == 5) {
				batchTyp = args[0];
				userId = args[1];
				plantCd = args[2];
				SysTime = args[3];
				jobOdrCd = args[4]; // ���Ԃ̏ꍇ�̂݃Z�b�g
				jobOdrDetailNo = null; // SI�Ή����� metamorBase�ł͖��g�p
			} else {
				errCode = "AC00111"; // �o�b�`���������̌`�����s���ł�
				Exception e = new Exception();
				throw e;
			}
			// �����̃Z�b�g �I��� ---------------------------------------

			// �R�l�N�V�����̎擾
			conn = m_conductor.m_transactionConn;

			// �Ɩ����b�Z�[�W�̏���
			businessMsgAcc = new BusinessMessageAccessor();
			businessMsg = new BusinessMessage();
			businessMsgAcc.init(conn);
			businessMsg.setBusinessOperatingName(businessName);
			businessMsg.setUser(userId);
			businessMsg.setPlantCode(plantCd);

			try { // try2 --
				// �Ɩ����b�N��������
				try {
					Lock = new BusinessLock(conn, userId, plantCd);
					lockCancelKey = Lock.doLock(businessName); // �����L�[�̎擾
					conn.commit();
					if (lockCancelKey == -1)
						throw new Exception();
				} catch (Exception e) {
					businessErrCode = "ZZ01001"; // �Ɩ����b�N����Ă��邽�ߋN���ł��܂���
					errCode = businessErrCode;
					throw e;
				}

				// �X�g�A�h�v���V�[�W���̃p�����[�^���Z�b�g����
				m_med.setpvc2LogMode(logMode);
				m_med.setpvc2OutputMode(outputMode);
				m_med.setpvc2OutputPath(outputPath);
				m_med.setpvc2OutputName(outputName);
				m_med.setpvc2UserId(userId);
				m_med.setpvc2BusinessName(businessName);
				m_med.setpvc2PlantCd(plantCd);
				m_med.setpvc2SysTime(SysTime);
				m_med.setpvc2JobOdrCd(jobOdrCd);
				m_med.setpvc2JobOdrDetailNo(jobOdrDetailNo);

				// �ǉ�
				// �X�g�A�h�v���V�[�W���̎��s
				try {
					m_med.getCallSqlOdRelease_Ind().call();
				} catch (Exception e) {
					errCode = "AC00117"; // �X�g�A�h�v���V�[�W�����s���G���[
					// ������������G���[���l�ɃZ�b�g
					StringBuffer sb = new StringBuffer();
					sb.append("(SBM0582)�X�g�A�h�v���V�[�W�������F");
					sb.append(logMode + " ");
					sb.append(outputMode + " ");
					sb.append(outputPath + " ");
					sb.append(outputName + " ");
					sb.append(userId + " ");
					sb.append(businessName + " ");
					sb.append(plantCd + " ");
					sb.append(SysTime + " ");
					sb.append(jobOdrCd + " ");
					sb.append(jobOdrDetailNo + " ");
					errNote = sb.toString();
					throw e;
				}

			} catch (Exception e) { 
				if (errCode == null) {
					errCode = "AC53402"; // ���̑� �d��������
				}
				// �G���[���b�Z�[�W�̍쐬
				AlarmMessage msg = new AlarmMessage(errCode);
				errMsg = "[" + errCode + "]" + msg.getMessage();
				if (e.getMessage() != null) {
					errMsg = errMsg + " " + e.getMessage();
				}
				// �Ɩ����b�Z�[�W�̓o�^
				if (businessMsg != null) {
					// �Ɩ��G���[���Z�b�g����Ă��Ȃ��ꍇ
					if (businessErrCode == null) {
						businessErrCode = "ZZ09009"; // �o�b�`�������J�n�ł��܂���ł����B
					}
					businessMsg.setMessageCode(businessErrCode);
					businessMsg.setData(errNote);
					try {
						logCd = new Numbering(m_conductor.m_transactionConn,
								Numbering.LOG_CD, args[1], businessName,
								plantCd);
						businessMsg.setLogCode(logCd.getNo());
						businessMsgAcc.add(businessMsg);
					} catch (SQLException ex) {
						ex.printStackTrace();
						throw ex;
					}
				}
				memoText = errMsg; // ���l���b�Z�[�W
				throw e;

			} finally { 
				try {
					Lock.doUnLock(businessName, lockCancelKey);
					conn.commit();
				} catch (FoundationException e) {
					e.printStackTrace();
					businessErrCode = "ZZ01004"; // �Ɩ����b�N�̉����Ɏ��s���܂����B

					// �Ɩ����b�Z�[�W�̓o�^�i�Ɩ����b�N�������s���j
					businessMsg.setMessageCode(businessErrCode);
					businessMsg.setData("");
					try {
						logCd = new Numbering(m_conductor.m_transactionConn,
								Numbering.LOG_CD, args[1], businessName,
								plantCd);
						businessMsg.setLogCode(logCd.getNo());
						businessMsgAcc.add(businessMsg);
					} catch (SQLException ex) {
						ex.printStackTrace();
					}
					AlarmMessage msg = new AlarmMessage(businessErrCode);
					errMsg = "[" + businessErrCode + "]" + msg.getMessage();
					memoText = errMsg; // ���l���b�Z�[�W

				}
			} 

		} catch (Exception e) {
			if (errCode == null) {
				errCode = "AC53402"; // ���̑� �d��������
			}			
			// �G���[���b�Z�[�W�̍쐬
			if (errMsg == null) {
				AlarmMessage msg = new AlarmMessage(errCode);
				errMsg = "[" + errCode + "]" + msg.getMessage();
				if (e.getMessage() != null) {
					errMsg = errMsg + " " + e.getMessage();
				}
			}
			e.printStackTrace();
			m_med.setpvc2SysTime(args[3]);
			m_med.setpvc2UserId(args[1]);
			m_med.getDeleteT_OdReleas_T();
			throw new BatchAppException("CtrlMain", "main", errMsg);

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
		public medAC0150B001 m_med=null;

		/**
		 * �R���e�i�N���X�C���X�^���X
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medAC0150B001 med) throws BatchAppException
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
