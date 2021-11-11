/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KP0040/src/com/nec/jp/orteus/metamorBase/KP0040/KP0040B003/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.KP0040.KP0040B003;

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
import java.util.Date;
import com.nec.jp.orteus.msg.util.*;
import com.nec.jp.orteus.msg.core.*;
import com.nec.jp.orteus.expj.util.*;
import com.nec.jp.orteus.expj.exception.*;
import com.nec.jp.orteus.expj.systemlog.*;
import com.nec.jp.orteus.expj.businesslock.*;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.metamorBase.util.common.SystemConfig;
import com.nec.jp.orteus.metamorBase.common.util.Converter;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
import com.nec.jp.orteus.metamorBase.common.WorkDay.WorkCalendar;
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain �N���X
 * �t�@�C���E�N���X����
 * @author $Author: geng-jia $
 * @version $Revision: 1.17 $ $Date: 2015/12/03 08:53:29 $
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
	public medKP0040B003 m_med=null;

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
	public CtrlMain(medKP0040B003 med, BatchAppConductor cdr) throws BatchAppException
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
		
		
	/** �N������ */
	private String strBusinessName = null;
	private String strUserId = null;
	private String strPlantCd = null;
	private String strMsgPlantCd = null;

	/** DB�R�l�N�V���� */
	private IDbConnection conn = null;

	private String m_vMSG = "";				//���O�t�@�C���p���b�Z�[�W

	// �H��R�[�h�Ƃ���ɑ΂��郍�b�N�����L�[�̔z���ێ����郊�X�g
	private ArrayList plantList = new ArrayList();
		
	/** �Ɩ����b�N�N���X */
	private BusinessLock lock = null;
	
	/** ���b�N���s�����b�N�L�[ */
	private static final int LOCK_FAILD = -1;

	/**
	* ���[�O�t�@�C���̃��b�Z�[�W�̎擾
	*
	* @param String strMsgCd		�L�[:SYS�R���g���[���R�[�h
	*
	*/
	private boolean getSysMsg(String strMsgCd) throws BatchAppException {
		boolean rv = true;
		try{
		//�L�[�ݒ�
			
			m_med.setsysBusinessIN_MEG_CD(strMsgCd);
			
			if(m_med.getreadSysBusinessMessage().read() != SUCCESS) {
				rv = false;
			} else {
				if(m_med.getreadSysBusinessMessage().next()) {
					this.m_vMSG = m_med.getsysBusinessMEG();
				} else {
					throw new Exception();
				}
			}
		}catch (Exception e) {
			rv=false;
		}finally{
			return rv;
		}
	}

	/**
	* �G���[/�x�����b�Z�[�W���O�o�͏���(���ߍ��݂Ȃ�)
	*
	* @param String ���b�Z�[�W�R�[�h
	*/
	private void writeLogMessage(String msgCd) throws Exception,BatchAppException {
		ExpjMessage  am = new ExpjMessage (msgCd);
		CoreTools.write(am.getMessage(CoreTools.getLocale(strUserId)));
	}
	
	/**
	* �G���[/�x�����b�Z�[�W���O�o�͏���(IF���Ǘ��ԍ����ߍ���)
	*
	* @param String ���b�Z�[�W�R�[�h
	* @param String IF���Ǘ��ԍ�
	*/
	private void writeLogMessage(String msgCd,String if_no) throws Exception,BatchAppException {
		ExpjMessage am = new ExpjMessage(msgCd,if_no);
		CoreTools.write(am.getMessage(CoreTools.getLocale(strUserId)));
	}
	/**
	* �G���[/�x�����b�Z�[�W���O�o�͕⏕���(���ߍ���)
	*
	* @param String �⏕���
	* @param String �⏕���l
	*/
	private void writeLogMessageInfo(String name,String value) throws Exception,BatchAppException {
		AlarmMessage am = new AlarmMessage("AA99991","    " + name,value);
		CoreTools.write(am.getMessage());
	}
	
	/**
	* �Ɩ����b�N���s���܂�
	* @param strBusinessName �Ɩ���
	* @param strUserId ���[�U�R�[�h
	* @param strMsgPlantCd �H��R�[�h
	* @return ���b�N�L�����Z���L�[
	* @throws FoundationException
	*/
	private int businessLock(String strBusinessName,String strUserId,String strMsgPlantCd) throws FoundationException {
		lock = new BusinessLock(conn, strUserId, strMsgPlantCd);
		// �����L�[�̎擾
		int lockCancelKey = lock.doLock(m_med.getProgname());
		conn.commit();
		return lockCancelKey;
	}

	/**
	* �Ɩ����b�N���������܂�
	* @param lockCancelKey ���b�N�L�����Z���L�[
	* @return ���b�N����������true�A���s��false
	* @throws FoundationException
	*/
	private boolean businessUnLock(int lockCancelKey) throws FoundationException {
		if (lockCancelKey == LOCK_FAILD) {
			return true;
		}
		boolean result = lock.doUnLock(m_med.getProgname(), lockCancelKey);
		conn.commit();
		return result;
	}
	
	/**
	 * CtrlMain�N���X�̕W���R���X�g���N�^
	 *
	 */
	public CtrlMain(medKP0040B003 med) throws BatchAppException
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
		// todo: �����Ƀ��[�U��`�R�[�h���L�q���Ă�������
		// �G���[���X�g
		List errCodeList = new ArrayList();
		BusinessMessageAccessor businessMsgAcc = new BusinessMessageAccessor();
		BusinessMessage businessMsg = new BusinessMessage();
		Numbering logCd = null;		//���O���ʃR�[�h�̔Ԃ̏���
		
		// �����󂯎��
		String args[] = m_med.getArgs();
		
		strBusinessName = args[0];
		strUserId = args[1];
		strPlantCd = args[2];
		strMsgPlantCd = args[2];
		
		//�Ɩ����b�N�����L�[
		int lockCancelKey = LOCK_FAILD;
		
		try{
			conn = m_conductor.m_transactionConn;
			try {
				if(m_med.getreadM_PLANT().read() != SUCCESS){
					this.writeLogMessage("KP04303");
					throw new Exception();
				}
				if(m_med.getreadM_PLANT().next() == false){
				//�ΏۍH��R�[�h�擾���s
					this.writeLogMessage("KV03001");
					throw new Exception();
				}
				//=======================================
				// �Ɩ����b�N�J�n
				//=======================================
				lockCancelKey = businessLock(strBusinessName,strUserId,strMsgPlantCd);
				if (lockCancelKey == LOCK_FAILD) {
					//this.writeLogMessage("ZZ01008");
					logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strMsgPlantCd);
					String strMsgCd = "ZZ01008";
					String strDataString = "(SBM0596)<< �Ɩ����b�N�̊J�n�Ɏ��s���܂����B >>";
					businessMsgAcc.init(conn);
					businessMsg.setBusinessOperatingName(strBusinessName);
					businessMsg.setUser(strUserId);
					businessMsg.setPlantCode(strMsgPlantCd);
					businessMsg.setLogCode(logCd.getNo());
					businessMsg.setMessageCode(strMsgCd);
					businessMsg.setData(strDataString);
					businessMsgAcc.add(businessMsg);
					if(this.getSysMsg(strMsgCd)) {
						CoreTools.write(strMsgCd+" "+this.m_vMSG+" "+strDataString);
					} else {
						throw new Exception();
					}
					return BREAK;
				}
				
				//�o�b�`�J�n���b�Z�[�W�o�^
				// �R�l�N�V������n���āA�̔Ԃ̏���
				logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strMsgPlantCd);
				// �R�l�N�V������n���āA�Ɩ����b�Z�[�W����
				String strMsgCd = "KP04301";
				String strDataString = "(SBM0590)<< �̔����v�c�W�v�o�b�`�����J�n >>";
				businessMsgAcc.init(conn);
				businessMsg.setBusinessOperatingName(strBusinessName);
				businessMsg.setUser(strUserId);
				businessMsg.setPlantCode(strMsgPlantCd);
				businessMsg.setLogCode(logCd.getNo());
				businessMsg.setMessageCode(strMsgCd);
				businessMsg.setData(strDataString);
				businessMsgAcc.add(businessMsg);
				if(this.getSysMsg(strMsgCd)) {
					CoreTools.write(strMsgCd+" "+this.m_vMSG+" "+strDataString);
				} else {
					throw new Exception();
				}
				conn.commit();
			} catch(Exception e) {
				e.printStackTrace();
				throw new Exception();
			}
		
		try{
			//-----------------------------------------------------------------------------
			//		�̔����v�c�W�v�o�b�`�����i��������j
			//-----------------------------------------------------------------------------
			int rec = 0;
			int rv = 0;
			try{
				m_med.setSysdate(Converter.dateToStr(new Date(),"yyyy/MM/dd HH:mm:ss"));
				m_med.setUsername(strUserId);
				//=======================================
				// �Ώۃf�[�^�̎擾
				//=======================================
				if(m_med.getgetV_SLP_ODR_CAL().read() != SUCCESS){
						throw new Exception();
				}
				
				//========================================
				// �擾�ł������R�[�h�̐������X�V����
				//========================================
				for(rec=0; m_med.getgetV_SLP_ODR_CAL().next(); rec++){
					this.writeLogMessageInfo("SALES_PLAN_CD",(m_med.getVIEW_SALES_PLAN_CD()));
					
					//========================================
					// �l��ݒ�
					//========================================
					m_med.setIN_SALES_PLAN_CD(m_med.getVIEW_SALES_PLAN_CD());
					m_med.setIN_REM_QTY(m_med.getVIEW_REM_QTY());
					
					//========================================
					// �X�V����
					//========================================
					rv = m_med.getinsertT_SALES_PLAN().update();
					conn.commit();
				}
			} catch(Exception e) {
				try {
				conn.rollback();
				e.printStackTrace();
				// =========================================
				// �G���[���O���o�͂��A���̃��R�[�h����������
				// =========================================
				this.writeLogMessage("KP04303");
				this.writeLogMessageInfo("ErrorRecord",Integer.toString(rec+1));
				
				// �R�l�N�V������n���āA�̔Ԃ̏���
				logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strMsgPlantCd);
				// �̔̔����v�c�W�v�����ɂĒv���I�G���[���������܂����B
				String strMsgCd = "KP04304";
				String strDataString = "LINE=" + (rec + 1);
				businessMsgAcc.init(conn);
				businessMsg.setBusinessOperatingName(strBusinessName);
				businessMsg.setUser(strUserId);
				businessMsg.setPlantCode(strMsgPlantCd);
				businessMsg.setLogCode(logCd.getNo());
				businessMsg.setMessageCode(strMsgCd);
				businessMsg.setData(strDataString);
				businessMsgAcc.add(businessMsg);
				if(this.getSysMsg(strMsgCd)){
					CoreTools.write(strMsgCd+" "+this.m_vMSG);
				} else {
					throw new Exception();
				}
				conn.commit();
			    } catch (SQLException ex) {
					ex.printStackTrace();
				} catch (FoundationException ex) {
					ex.printStackTrace();
				}
			}
			
			//-----------------------------------------------------------------------------
			//		�̔����v�v����捞�o�b�`�����i�����܂Łj
			//-----------------------------------------------------------------------------
			} catch (Exception e) {
				try {
					conn.rollback();
					e.printStackTrace();
					logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strMsgPlantCd);
					// �̔̔����v�c�W�v�����ɂĒv���I�G���[���������܂����B
					String strMsgCd = "KP04304";
					String strDataString = "(SBM0591)<< �̔����v�c�W�v�o�b�`�ُ팟�o >>";
					businessMsgAcc.init(conn);
					businessMsg.setBusinessOperatingName(strBusinessName);
					businessMsg.setUser(strUserId);
					businessMsg.setPlantCode(strMsgPlantCd);
					businessMsg.setLogCode(logCd.getNo());
					businessMsg.setMessageCode(strMsgCd);
					businessMsg.setData(strDataString);
					businessMsgAcc.add(businessMsg);
					
					if(this.getSysMsg(strMsgCd)){
						CoreTools.write(strMsgCd+" "+this.m_vMSG);
					} else{
						throw new Exception();
					}
					conn.commit();
				} catch (SQLException ex) {
					ex.printStackTrace();
				} catch (FoundationException ex) {
					ex.printStackTrace();
				}
			}
		} catch (Exception e) {
			try {
				conn.rollback();
				e.printStackTrace();
				logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strMsgPlantCd);
				// �̔����v�v����捞�o�b�`�����ɂĒv���I�G���[���������܂����B
				String strMsgCd = "KP04304";
				String strDataString = "(SBM0591)<< �̔����v�c�W�v�o�b�`�ُ팟�o >>";
				businessMsgAcc.init(conn);
				businessMsg.setBusinessOperatingName(strBusinessName);
				businessMsg.setUser(strUserId);
				businessMsg.setPlantCode(strMsgPlantCd);
				businessMsg.setLogCode(logCd.getNo());
				businessMsg.setMessageCode(strMsgCd);
				businessMsg.setData(strDataString);
				businessMsgAcc.add(businessMsg);
				if(this.getSysMsg(strMsgCd)){
					CoreTools.write(strMsgCd+" "+this.m_vMSG);
				}
				conn.commit();
			} catch (SQLException ex) {
				ex.printStackTrace();
			} catch (FoundationException ex) {
				ex.printStackTrace();
			}
		} finally {
			//�o�b�`�I�����b�Z�[�W�o�^
			// �R�l�N�V������n���āA�̔Ԃ̏���
			try {
				if (lockCancelKey != LOCK_FAILD) {
					logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strMsgPlantCd);
					// �R�l�N�V������n���āA�Ɩ����b�Z�[�W����
					String strMsgCd = "KP04305";
					String strDataString = "(SBM0592)<< �̔����v�c�W�v�o�b�`�����I�� >>";
					businessMsgAcc.init(conn);
					businessMsg.setBusinessOperatingName(strBusinessName);
					businessMsg.setUser(strUserId);
					businessMsg.setPlantCode(strMsgPlantCd);
					businessMsg.setLogCode(logCd.getNo());
					businessMsg.setMessageCode(strMsgCd);
					businessMsg.setData(strDataString);
					businessMsgAcc.add(businessMsg);
					if(this.getSysMsg(strMsgCd)){
						CoreTools.write(strMsgCd+" "+this.m_vMSG+" "+strDataString);
					}
					conn.commit();
				}
				//=======================================
				// �Ɩ����b�N����
				//=======================================
				if (!businessUnLock(lockCancelKey)) {
					this.writeLogMessage("ZZ01004");
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			} catch (FoundationException ex) {
				ex.printStackTrace();
			} catch(Exception e) {
				e.printStackTrace();
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
		public medKP0040B003 m_med=null;

		/**
		 * �R���e�i�N���X�C���X�^���X
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medKP0040B003 med) throws BatchAppException
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
