/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KM0060/src/com/nec/jp/orteus/metamorBase/KM0060/KM0060B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.KM0060.KM0060B001;

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
	import com.nec.jp.orteus.expj.businesslock.BusinessLock;
	import com.nec.jp.orteus.expj.util.ExpjMessage;
	import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
	import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
	import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;

//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain �N���X
 * �t�@�C���E�N���X����
 * @author $Author: luoxiao $
 * @version $Revision: 1.1 $ $Date: 2014/06/10 06:10:46 $
 */

//{{user_implement_dev:header
/**
 *
 * �@�\���@�Č��\�Z�Ϗ�o�b�`����
 *
 * [�C������]
 * 2014/04/25 ����
 */
//}}user_implement_dev:header

public class CtrlMain extends Object
		implements IBatchAppCommon
{

	//////////////////////////////

	/**
	 * mediator�N���X �C���X�^���X
	 */
	public medKM0060B001 m_med=null;

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
	public CtrlMain(medKM0060B001 med, BatchAppConductor cdr) throws BatchAppException
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
	public CtrlMain(medKM0060B001 med) throws BatchAppException
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

	//////////////////////////////		/** ���O���x�� �C���t�H���[�V���� */
		private static final int INFOMATION = 0;
		/** ���O���x�� ���[�j���O */
		private static final int WORNING = 1;
		/** ���O���x�� �G���[ */
		private static final int ERROR = 2;
		
		/** DB�R�l�N�V���� */
		private IDbConnection conn = null;
		
		/** �Ɩ����b�Z�[�W���O�pNumbering�N���X */
		private Numbering numbering = null;
		/** �Ɩ����b�Z�[�W���O�pBusinessMessageAccessor�N���X */
		private BusinessMessageAccessor businessMsgAcc = new BusinessMessageAccessor();
		/** �Ɩ����b�Z�[�W���O�pBusinessMessage�N���X */
		private BusinessMessage businessMsg = new BusinessMessage();
		
		/** �Ɩ����b�N�N���X */
		private BusinessLock lock = null;
		
		/** ���b�N���s�����b�N�L�[ */
		private static final int LOCK_FAILD = -1;
		
		/** �o�b�`�p�����[�^(����1)�Ɩ�ID */
		private String _sysProgramId;
		/** �o�b�`�p�����[�^(����2)���[�UID */
		private String _sysUserCd;
		/** �o�b�`�p�����[�^(����3)�H��R�[�h */
		private String _sysPlantCd;
		
		/**
		 * ���O�t�@�C���o��
		 * @param logLevel ���O���x��
		 * @param code ���b�Z�[�W�R�[�h
		 * @param value �u��������
		 */
		private void writeLogFiles(int logLevel, String code, String value) {
			ExpjMessage emsg;
			// �u�������񔻒�
			if (!isNull(value)) {
				emsg = new ExpjMessage(code, value);
			} else {
				emsg = new ExpjMessage(code);
			}
			
			// ���O���x���ɂ���ă��O�^�C�v�𕪂���
			switch (logLevel) {
				case INFOMATION :
					m_med.getSyslog().info(emsg, m_med.getUsername());
					break;
				case WORNING :
					m_med.getSyslog().warning(emsg, m_med.getUsername());
					break;
				case ERROR :
					m_med.getSyslog().severe(emsg, m_med.getUsername());
					break;
			}
		}
		
		/**
		 * ���O�t�@�C���o��
		 * @param logLevel ���O���x��
		 * @param code ���b�Z�[�W�R�[�h
		 */
		private void writeLogFiles(int logLevel, String code) {
			writeLogFiles(logLevel, code, null);
		}
		
		/**
		 * ���ODB�o��
		 * @param code ���b�Z�[�W�R�[�h
		 * @param value �u��������
		 * @param dataStr �f�[�^�X�g�����O
		 * @throws FoundationException
		 * @throws SQLException
		 */
		private void writeLogDB(String code, String value, String dataStr)
			throws FoundationException, SQLException {
			if (numbering == null) {
				throw new NullPointerException();
			}
			businessMsg.setLogCode(numbering.getNo());
			businessMsg.setMessageCode(code);
			businessMsg.setData(dataStr);
			businessMsgAcc.add(businessMsg);
		}
		
		/**
		 * ���ODB�o��
		 * @param code ���b�Z�[�W�R�[�h
		 * @param dataStr �f�[�^�X�g�����O
		 * @throws FoundationException
		 * @throws SQLException
		 */
		private void writeLogDB(String code, String dataStr) throws FoundationException, SQLException {
			writeLogDB(code, null, dataStr);
		}
		
		/**
		 * ���O�t�@�C���A���ODB�o�͂��s���܂��B
		 * @param logLevel ���O���x��
		 * @param code ���b�Z�[�W�R�[�h
		 * @param value �u��������
		 * @param dataStr �f�[�^�X�g�����O
		 * @throws FoundationException
		 * @throws SQLException
		 */
		private void writeLog(int logLevel, String code, String value, String dataStr)
			throws FoundationException, SQLException {
			writeLogFiles(logLevel, code, value);
			if (!isNull(dataStr)) {
				writeLogFiles(logLevel, "ZZ01006", dataStr);
			}
			writeLogDB(code, value, dataStr);
		}
		
		/**
		 * ���O�t�@�C���A���ODB�o�͂��s���܂��B
		 * @param logLevel ���O���x��
		 * @param code ���b�Z�[�W�R�[�h
		 * @param dataStr �f�[�^�X�g�����O
		 * @throws FoundationException
		 * @throws SQLException
		 */
		private void writeLog(int logLevel, String code, String dataStr)
			throws FoundationException, SQLException {
			writeLog(logLevel, code, null, dataStr);
		}
		
		/**
		 * ���O�t�@�C���A���ODB�o�͂��s���܂��B
		 * @param logLevel ���O���x��
		 * @param code ���b�Z�[�W�R�[�h
		 * @throws FoundationException
		 * @throws SQLException
		 */
		private void writeLog(int logLevel, String code) throws FoundationException, SQLException {
			writeLog(logLevel, code, null, null);
		}
		
		/**
		 * �Ɩ����b�N���s���܂�
		 * @return ���b�N�L�����Z���L�[
		 * @throws FoundationException
		 */
		private int businessLock() throws FoundationException {
			lock = new BusinessLock(conn, _sysUserCd, _sysPlantCd);
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
		 * �o�b�`�p�����[�^�i���ʁj��ݒ肵�܂��B
		 * @return �ݒ�ɐ��������ꍇ�� true �A���s�����ꍇ�� false ��Ԃ��܂��B
		 * @throws BatchAppException
		 */
		private boolean setCommonParams() throws BatchAppException {
			String[] args = m_med.getArgs();
			
			// �o�b�`�p�����[�^�̌`�����s���ȏꍇ
			if (args.length <= 2) {
				writeLogFiles(ERROR, "ZZ09022");
				return false;
			}
			_sysProgramId = args[0];
			_sysUserCd = args[1];
			_sysPlantCd = args[2];
			return true;
		}
		
		/**
		 * �o�b�`�p�����[�^�i���ʁj�̃`�F�b�N���s���܂��B
		 * @return ����̏ꍇtrue�A�s���̏ꍇfalse
		 * @throws BatchAppException
		 */
		private boolean checkCommonParams() throws BatchAppException {
			// [���[�U�}�X�^]�ɑ��݂��Ȃ��ꍇ
			if (!isExsistsUserMst(_sysUserCd)) {
				writeLogFiles(ERROR, "ZZ09026");
				return false;
			}
			
			// [�H��]�ɑ��݂��Ȃ��ꍇ
			if (!isExistsMPlant(_sysPlantCd)) {
				writeLogFiles(ERROR, "ZZ09028");
				return false;
			}
			
			return true;
		}
		
		/**
		 * [���[�U�}�X�^]�ɑ��݂��邩�𔻒肵�܂� �B
		 * @return [���[�U�}�X�^]�ɑ��݂���ꍇ��true�A���݂��Ȃ��ꍇ��false
		 */
		private boolean isExsistsUserMst(String userCd) throws BatchAppException {
			m_med.setUSER_CD(userCd);
			m_med.getUSER_MST().read();
			return m_med.getUSER_MST().hasRecord(false);
		}
		
		/**
		 * [�H��]�ɑ��݂��邩�𔻒肵�܂� �B
		 * @param plantCd �H��R�[�h
		 * @return [�H��]�ɑ��݂���ꍇ��true�A���݂��Ȃ��ꍇ��false
		 */
		private boolean isExistsMPlant(String plantCd) throws BatchAppException {
			m_med.setPLANT_CD(plantCd);
			m_med.getM_PLANT().read();
			return m_med.getM_PLANT().hasRecord(false);
		}
		
		/**
		 * �Ώۂ̕�����Null�i�󕶎����邢��Null�j�ł��邩�𔻒肵�܂��B
		 * @param str �Ώە�����
		 * @return Null�̏ꍇ��true�ANull�ł͂Ȃ��ꍇ��false
		 */
		private boolean isNull(String str) {
			if (str == null || str.length() == 0 || str.equalsIgnoreCase("null")) {
				return true;
			}
			return false;
		}

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
		// ���b�N�����L�[
		int lockCancelKey = LOCK_FAILD;
		
		// PL/SQL�̎��s����
		String result = null;
		
		// �p�����[�^�擾
		String args[] = m_med.getArgs();
		
		// DB�ڑ��擾����
		conn = m_conductor.m_transactionConn;
		
		String errinfo ;

		// �o�b�`�p�����[�^�i���ʁj���p�����[�^�ϐ��ɐݒ�
		if (!setCommonParams()) {
			writeLogFiles(ERROR, "ZZ09009");
			return BREAK;
		}
		// �o�b�`�p�����[�^�i���ʁj�`�F�b�N
		if (!checkCommonParams()) {
			writeLogFiles(ERROR, "ZZ09009");
			return BREAK;
		}
		
		
		try{
			// DB���b�Z�[�W�X�V����
			IDbConnection conn_msg = m_conductor.m_defaultConn;
			numbering = new Numbering(conn_msg, Numbering.LOG_CD, _sysUserCd, _sysProgramId, _sysPlantCd);
			businessMsgAcc.init(conn_msg);
			businessMsg.setBusinessOperatingName(_sysProgramId);
			businessMsg.setUser(_sysUserCd);
			businessMsg.setPlantCode(_sysPlantCd);
			
			m_med.setUsername(_sysUserCd);
			
			// [�o�b�`�p�����[�^]�̌���
			m_med.setPROGRAM_CD(m_med.getProgname());

			int nret = m_med.getSYS_BAT_PARM().read();
			if (!m_med.getSYS_BAT_PARM().next()) {
				writeLog(ERROR, "ZZ09030");
				return BREAK;
			}

			// �Ɩ����b�N
			lockCancelKey = businessLock();
			if (lockCancelKey == LOCK_FAILD) {
				writeLog(ERROR, "ZZ01008");
				return BREAK;
			}
			
			// �J�n���b�Z�[�W
			writeLog(INFOMATION, "KM00040");
			
			// �g�����U�N�V�����̊J�n
			conn.beginTransWeb();

			//�Č�������
			if( m_med.getT_PROJECT_cnt().read()!= SUCCESS){
				throw new Exception();
			}
			// ���݂��Ȃ�
			if( m_med.getT_PROJECT_cnt().next() == false || "0".equals(m_med.getPJ_count())) {
				return BREAK;
			}
			m_med.setpvc2LogMode(m_med.getLOG_MODE_TYP());
			m_med.setpvc2OutputMode(m_med.getOUTPUT_MODE_TYP());
			m_med.setpvc2OutputPath(m_med.getFILE_PATH());
			m_med.setpvc2OutputName(m_med.getFILE_NAME());
			m_med.setpvc2UserId(_sysUserCd);
			m_med.setpvc2BusinessName(_sysProgramId);
			m_med.setpvc2PlantCd(_sysPlantCd);
			m_med.setpnumFlag("1");  //�o�b�`���s

			// �Č��̌����J�n
			if( m_med.getT_PROJECT().read()!= SUCCESS){
				throw new Exception();
			}
			// �Č����A���[�v
			for(int rec1=0; m_med.getT_PROJECT().next();rec1++ ){
				//�󒍔ԍ�����
				if( m_med.getreadODR_NO().read()!= SUCCESS){
					throw new Exception();
				}
				// �󒍕��A���[�v
				for(int rec2=0; m_med.getreadODR_NO().next();rec2++ ){

					m_med.setpvc2OdrNo(m_med.getODR_NO());
					m_med.setpvc2ProjectCd(m_med.getPROJECT_CD());
					m_med.setpnumEstimateNo(m_med.getESTIMATE_NO());
					m_med.setpnumDetalNo(m_med.getDETAL_NO());

					//�v���V�[�W���̎��s
					List callList = null;
					callList = m_med.getSQLPjBudgetCostMake().call();
	
					// PL/SQL�̎��s���ʂ��擾
					medKM0060B001 resultMed = (medKM0060B001) callList.get(0);
					result = resultMed.getpnumReturn();

					// �ُ�I��
					if( "3".equals(result) ) {
						writeLog(ERROR, "KM00059");
						throw new Exception();
					}
					// �x��
					if( "2".equals(result) ) {
						errinfo = "PROJECT_CD:"+m_med.getPROJECT_CD()+",ODR_CD:"+m_med.getODR_NO(); 
						writeLog(WORNING, "KM00060", errinfo );
					}
				}

				// ���ׂĐςݏオ���Ă��邩�m�F
				if( m_med.getT_ESTIMATE_DETAL().read()!= SUCCESS){
					throw new Exception();
				}
				m_med.getT_ESTIMATE_DETAL().next();
				// ���ׂĐςݏオ���Ă���
				if( "0".equals(m_med.getOD_NO_count())) {
					// �Č����X�V
					m_med.getT_PROJECT().update();
				}
			}
			
			conn.commit();
			result = "0" ;

		} catch (SQLException e) {
			e.printStackTrace();
			throw new BatchAppException("CtrlMain", "main", e.getMessage());
		} catch (FoundationException e) {
			e.printStackTrace();
			throw new BatchAppException("CtrlMain", "main", e.getMessage());
		} catch (Exception e) {
			// ������Exception���L���b�`���Ă͂����Ȃ��̂ł����Amain���\�b�h��
			// �Ăяo���Ă���execute���\�b�h��StackTrace���s��Ȃ����߃L���b�`���Ă��܂��B
			e.printStackTrace();
			throw new BatchAppException("CtrlMain", "main", e.getMessage());
		} finally {
			try {
				// ���[���o�b�N
				conn.rollback();
				
				// �Ɩ����b�N����
				if (!businessUnLock(lockCancelKey)) {
					writeLog(ERROR, "ZZ01004");
				}
				
				// �I�����O
				if( "0".equals(result) ) {
					errinfo = "PROJECT_COUNT:" + m_med.getPJ_count() ;
					writeLog(INFOMATION, "KM00041", errinfo);
				} else {
					writeLog(INFOMATION, "KM00042");
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw new BatchAppException("CtrlMain", "main", e.getMessage());
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
		public medKM0060B001 m_med=null;

		/**
		 * �R���e�i�N���X�C���X�^���X
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medKM0060B001 med) throws BatchAppException
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
