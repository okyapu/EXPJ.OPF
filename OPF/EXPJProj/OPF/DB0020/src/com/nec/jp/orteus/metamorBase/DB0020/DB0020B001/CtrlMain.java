/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DB0020/src/com/nec/jp/orteus/metamorBase/DB0020/DB0020B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.DB0020.DB0020B001;

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
import com.nec.jp.orteus.expj.businesslock.BusinessLock;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.expj.util.ExpjException;
import com.nec.jp.orteus.expj.util.Numbering;
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain �N���X
 * �t�@�C���E�N���X����
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.10 $ $Date: 2014/11/05 07:21:08 $
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
	public medDB0020B001 m_med=null;

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
	public CtrlMain(medDB0020B001 med, BatchAppConductor cdr) throws BatchAppException
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
	public CtrlMain(medDB0020B001 med) throws BatchAppException {
		// �����o�ϐ������������܂�
		m_med = med;
		m_control = new interControl(med);

		return;
	}

	/**
	 * �C���X�^���X�j�󎞂ɍs������
	 *
	 */
	public void finalize() {
		// �e�����o�ϐ��̏�����
		m_med = null;
		m_control = null;
		objMessage = null;

		return;
	}

	//////////////////////////////

	/** ���O���x�� �C���t�H���[�V���� */
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
		lock = new BusinessLock(conn, getSysUserCd(), getTargetPlantCd());
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
	 * �o�b�`�p�����[�^�̃`�F�b�N���s���܂��B
	 * @return ����̏ꍇtrue�A�s���̏ꍇfalse
	 * @throws BatchAppException
	 */
	private boolean checkArgs() throws FoundationException, BatchAppException, SQLException {
		// �o�b�`�p�����[�^�̌`�����s���ȏꍇ
		if (m_med.getArgs().length != 10) {
			writeLog(ERROR, "ZZ09022");
			return false;
		}

		// �o�b�`�����敪��Null�̏ꍇ
		if (isNull(getSysBatchType())) {
			writeLog(ERROR, "ZZ09023");
			return false;
		}

		// �o�b�`�����敪���P�A�Q�ȊO�̏ꍇ
		if ((!getSysBatchType().equals("1") && !getSysBatchType().equals("2"))) {
			writeLog(ERROR, "ZZ09024");
			return false;
		}

		// ���[�U�[�R�[�h��Null�̏ꍇ
		if (isNull(getSysUserCd())) {
			writeLog(ERROR, "ZZ09025");
			return false;
		}

		// [���[�U�}�X�^]�ɑ��݂��Ȃ��ꍇ
		if (!isExsistsUserMst(getSysUserCd())) {
			writeLog(ERROR, "ZZ09026");
			return false;
		}

		// �H��R�[�h��Null�̏ꍇ
		if (isNull(getSysPlantCd())) {
			writeLog(ERROR, "ZZ09027");
			return false;
		}
		// [�H��]�ɑ��݂��Ȃ��ꍇ
		if (!isExistsMPlant(getSysPlantCd())) {
			writeLog(ERROR, "ZZ09028");
			return false;
		}

		// �Ɩ�ID��Null�̏ꍇ
		if (isNull(getSysProgramId())) {
			writeLog(ERROR, "ZZ09029");
			return false;
		}

		// �����ΏۍH��R�[�h��[�H��]�ɑ��݂��Ȃ��ꍇ
		if (!isExistsMPlant(getTargetPlantCd())) {
			writeLog(ERROR, "DB00004");
			return false;
		}

		// ���s�����敪���P�A�Q�A�R�ȊO�̏ꍇ
		String executeType = getExecuteType();
		if (!executeType.equals("1") && !executeType.equals("2") && !executeType.equals("3")) {
			writeLog(ERROR, "DB00005");
			return false;
		}
		// �X�V�������[�h���P�A�Q�ȊO�̏ꍇ
		String updateMode = getUpdateMode();
		if (!updateMode.equals("1") && !updateMode.equals("2")) {
			writeLog(ERROR, "DB00006");
			return false;
		}
		// [�����Ǘ��p�����[�^]�ɑ��݂��Ȃ��ꍇ
		if (getPriorityType() == null) {
			writeLog(ERROR, "DB00007");
			return false;
		}

		return true;
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
	 * �o�b�`�p�����[�^(����1) �o�b�`�����敪��Ԃ��܂��B
	 * @return �o�b�`�����敪
	 */
	private String getSysBatchType() {
		return m_med.getArgs()[0];
	}

	/**
	 * �o�b�`�p�����[�^(����2)���[�UID��Ԃ��܂��B
	 * @return ���[�UID
	 */
	private String getSysUserCd() {
		return m_med.getArgs()[1];
	}

	/**
	 * �o�b�`�p�����[�^(����3)�H��R�[�h��Ԃ��܂��B
	 * @return �H��R�[�h
	 */
	private String getSysPlantCd() {
		return m_med.getArgs()[2];
	}

	/**
	 * �o�b�`�p�����[�^(����4)�Ɩ�ID��Ԃ��܂��B
	 * @return �Ɩ�ID
	 */
	private String getSysProgramId() {
		return m_med.getArgs()[3];
	}

	/**
	 * �o�b�`�p�����[�^(5)�����ΏۍH��R�[�h��Ԃ��܂��B
	 * @return �����ΏۍH��R�[�h
	 */
	private String getTargetPlantCd() {
		String args[] = m_med.getArgs();
		if (!isNull(args[4])) {
			return args[4];
		}
		return getSysPlantCd();
	}
	/**
	 * �o�b�`�p�����[�^(6)�Ώ۔N�x��Ԃ��܂��B
	 * @return �Ώ۔N�x
	 */
	private String getYear() throws BatchAppException {
		String args[] = m_med.getArgs();
		if (!isNull(args[5])) {
			return args[5];
		}
		if (!isNull(m_med.getYEAR())) {
			return m_med.getYEAR();
		}
		String p = m_med.getPLANT_CD();
		m_med.setPLANT_CD(getSysPlantCd());
		m_med.getSYS_COST_CTRL().read();
		m_med.getSYS_COST_CTRL().next();
		m_med.setPLANT_CD(p);
		return m_med.getYEAR();
	}

	/**
	 * �o�b�`�p�����[�^(7)�����敪��Ԃ��܂��B
	 * @return �����敪
	 */
	private String getHalfTermTyp() throws BatchAppException {
		String args[] = m_med.getArgs();
		if (!isNull(args[6])) {
			return args[6];
		}
		if (!isNull(m_med.getHALF_TERM_TYP())) {
			return m_med.getHALF_TERM_TYP();
		}
		String p = m_med.getPLANT_CD();
		m_med.setPLANT_CD(getSysPlantCd());
		m_med.getSYS_COST_CTRL().read();
		m_med.getSYS_COST_CTRL().next();
		m_med.setPLANT_CD(p);
		return m_med.getHALF_TERM_TYP();
	}
	/**
	 * �o�b�`�p�����[�^(8)������ʂ�Ԃ��܂��B�N�������ȗ����́u1�v��Ԃ��܂��B
	 * @return �������
	 */
	private String getCostType() {
		String args[] = m_med.getArgs();
		if (!isNull(args[7])) {
			return args[7];
		}
		return "1";
	}

	/**
	 * �o�b�`�p�����[�^(9)���s�����敪��Ԃ��܂��B
	 * @return 1:�H����񒊏o�ƍH�����ꊇ�o�^�i�f�t�H���g�j
	 *          2:�H����񒊏o�����̂�
	 *          3:�H�����ꊇ�o�^�̂�
	 */
	private String getExecuteType() {
		String args[] = m_med.getArgs();
		if (!isNull(args[8])) {
			return args[8];
		}
		return "1";
	}

	/**
	 * �o�b�`�p�����[�^(10)�X�V���[�h�敪��Ԃ��܂��B
	 * @return 1:�����X�V�i�f�t�H���g�j
	 *          2:�S���X�V
	 */
	private String getUpdateMode() {
		String args[] = m_med.getArgs();
		if (!isNull(args[9])) {
			return args[9];
		}
		return "1";
	}

	/**
	 * "�w���i�}�X�^�D��敪"��Ԃ��܂��B
	 * @return [�����Ǘ��p�����[�^]."�w���i�}�X�^�D��敪"
	 * ���݂��Ȃ��ꍇ��null��Ԃ��B
	 */
	private String getPriorityType() throws BatchAppException {
		if (isNull(m_med.getPRIORITY_TYP())) {
			m_med.setPLANT_CD(getTargetPlantCd());
			m_med.getSYS_COST_CTRL().read();
			m_med.getSYS_COST_CTRL().next();
		}
		return m_med.getPRIORITY_TYP();
	}

	/**
	 * [�����Ǘ��p�����[�^]."�N�x�J�n��"��Ԃ��܂��B
	 * @return [�����Ǘ��p�����[�^]."�N�x�J�n��"
	 * ���݂��Ȃ��ꍇ��null��Ԃ��B
	 */
	private String getStartMonth(String plantCd) throws BatchAppException {
		if (m_med.getSTART_MONTH() == null) {
			m_med.setPLANT_CD(plantCd);
			m_med.getSYS_COST_CTRL().read();
			m_med.getSYS_COST_CTRL().next();
		}
		return m_med.getSTART_MONTH();
	}

	/**
	 * main�F ���[�U��`�p���\�b�h�ł�<br>
	 * <<�������L�q���Ă�������>>
	 *
	 * @return <<�������L�q���Ă�������>>
	 * @exception <<�������L�q���Ă�������>>
	 */
	public int main() throws BatchAppException, FoundationException {

		System.out.println("main");

		// ���b�N�����L�[
		int lockCancelKey = LOCK_FAILD;

		// �p�����[�^�擾
		String args[] = m_med.getArgs();

		// �o�b�`�p�����[�^�o��
		System.out.println("-------------------------------------------------");
		System.out.println("execute " + m_med.getProgname());
		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "]:" + args[i]);
		}

		// DB�ڑ��擾����
		conn = m_conductor.m_transactionConn;

		try {

			// DB���b�Z�[�W�X�V����
			IDbConnection conn_msg = m_conductor.m_defaultConn;
			numbering =
				new Numbering(
					conn_msg,
					Numbering.LOG_CD,
					getSysUserCd(),
					getSysProgramId(),
					getTargetPlantCd());
			businessMsgAcc.init(conn_msg);
			businessMsg.setBusinessOperatingName(getSysProgramId());
			businessMsg.setUser(getSysUserCd());
			businessMsg.setPlantCode(getTargetPlantCd());
			
			//SYSLOG�p�ꉻ�p
			if(args.length >= 2){
				m_med.setUsername(getSysUserCd()); // writelog�Ŏg�p
			}
			

			// �����`�F�b�N
			if (!checkArgs()) {
				writeLog(ERROR, "ZZ09009");
				return BREAK;
			}
			
			// �J�n���b�Z�[�W
			writeLog(INFOMATION, "ZZ09001");

			// �Ɩ����b�N
			lockCancelKey = businessLock();
			if (lockCancelKey == LOCK_FAILD) {
				writeLog(ERROR, "ZZ01008");
				return BREAK;
			}

			String executeType = getExecuteType();
			if (executeType.equals("1") || executeType.equals("2")) {
				// �w���P����񒊏o����
				if (executeCsPuchOut() == 3) {
					return BREAK;
				}
			}
			
			if (executeType.equals("1") || executeType.equals("3")) {
				// �w���i���ꊇ�o�^����
				if (executeCsPuchAll() == 3) {
					return BREAK;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BatchAppException("CtrlMain", "main", e.getMessage());
		} catch (FoundationException e) {
			e.printStackTrace();
			throw new BatchAppException("CtrlMain", "main", e.getMessage());
		} catch (BatchAppException e) {
			e.printStackTrace();
			throw new BatchAppException("CtrlMain", "main", e.getMessage());
		} catch (Exception e) {
			// ����͖{��Exception���L���b�`���Ă͂����Ȃ�
			// main���\�b�h���Ăяo���Ă���execute���\�b�h��StackTrace���s��Ȃ����߃L���b�`���Ă��܂��B
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
				writeLog(INFOMATION, "ZZ09002");

			} catch (Exception e) {
				e.printStackTrace();
				throw new BatchAppException("CtrlMain", "main", e.getMessage());
			}
		}
		return BREAK;
	}

	/**
	 * �w���P����񒊏o���������s���܂��B
	 * @return �߂�l
	 * @throws BatchAppException, FoundationException
	 */
	private int executeCsPuchOut() throws BatchAppException, FoundationException {

		m_med.setPROGRAM_CD(m_med.getProgname());
		m_med.setFUNCTION_NAME("SQLCSPUCHOUT");
		
		m_med.getSYS_BAT_PARM().read();
		if (!m_med.getSYS_BAT_PARM().next()) {
			ExpjMessage emsg = new ExpjMessage("ZZ09030");
			throw new BatchAppException("CtrlMain","",emsg.getMessage(CoreTools.getLocale(getSysUserCd())));
		}

		// EXPLANNNER/J�K�{���ڂ̐ݒ�
		m_med.setpvc2LogMode(m_med.getLOG_MODE_TYP());
		m_med.setpvc2OutPutMode(m_med.getOUTPUT_MODE_TYP());
		m_med.setpvc2OutPutPath(m_med.getFILE_PATH());
		m_med.setpvc2OutPutName(m_med.getFILE_NAME());
		m_med.setpvc2UserId(getSysUserCd());
		m_med.setpvc2BusinessName(getSysProgramId());
		m_med.setpvc2PlantCd(getTargetPlantCd());
		
		// �v���O�����ŗL���ڂ̐ݒ�
		m_med.setBATCH_TYP(Integer.valueOf(getSysBatchType()));
		m_med.setpnumYear(Integer.valueOf(getYear()));
		m_med.setpnumHalfTermTyp(Integer.valueOf(getHalfTermTyp()));
		m_med.setpnumCostTyp(Integer.valueOf(getCostType()));
		m_med.setpnumYyyyMm(
			Integer.valueOf(
				getStartMonthOfHalfTerm(
					getYear(),
					getStartMonth(getTargetPlantCd()),
					getHalfTermTyp())));
		m_med.setpnumExecuteTyp(Integer.valueOf(getExecuteType()));
		m_med.setpnumUpdateMode(Integer.valueOf(getUpdateMode()));

		System.out.println("--------------------------------------");
		System.out.println("pvc2LogMode: " + m_med.getpvc2LogMode());
		System.out.println("pvc2OutPutMode: " + m_med.getpvc2OutPutMode());
		System.out.println("pvc2OutPutPath: " + m_med.getpvc2OutPutPath());
		System.out.println("pvc2OutPutName: " + m_med.getpvc2OutPutName());
		System.out.println("pvc2UserId: " +  m_med.getpvc2UserId());
		System.out.println("pvc2BusinessName: " + m_med.getpvc2BusinessName());
		System.out.println("pvc2PlantCd: " + m_med.getpvc2PlantCd());
		
		// �v���O�����ŗL����
		System.out.println("pnumYear:  " + m_med.getpnumYear());
		System.out.println("pnumHalfTermTyp: " + m_med.getpnumHalfTermTyp());
		System.out.println("pnumCostTyp: " + m_med.getpnumCostTyp().toString());
		System.out.println("pnumYyyyMm: " + m_med.getpnumYyyyMm().toString());
		System.out.println("pnumExecuteTyp: " + m_med.getpnumExecuteTyp().toString());
		System.out.println("pnumUpdateMode: " + m_med.getpnumUpdateMode().toString());
		
		List returnList = m_med.getSQLCSPUCHOUT().call();
		
		medDB0020B001 resultMed = (medDB0020B001) returnList.get(0);
		System.out.println(resultMed.getpnumReturn().intValue());
		
		return resultMed.getpnumReturn().intValue();

	}

	/**
	 * �w���i���ꊇ�o�^���������s���܂��B
	 * @return �߂�l
	 * @throws BatchAppException, FoundationException
	 */
	private int executeCsPuchAll() throws BatchAppException, FoundationException {
		m_med.setPROGRAM_CD(m_med.getProgname());
		m_med.setFUNCTION_NAME("SQLCSPUCHALL");
		
		m_med.getSYS_BAT_PARM().read();
		if (!m_med.getSYS_BAT_PARM().next()) {
			ExpjMessage emsg = new ExpjMessage("ZZ09030");
			throw new BatchAppException("CtrlMain","",emsg.getMessage(CoreTools.getLocale(getSysUserCd())));
		}

		// EXPLANNNER/J�K�{���ڂ̐ݒ�
		m_med.setpvc2LogMode(m_med.getLOG_MODE_TYP());
		m_med.setpvc2OutPutMode(m_med.getOUTPUT_MODE_TYP());
		m_med.setpvc2OutPutPath(m_med.getFILE_PATH());
		m_med.setpvc2OutPutName(m_med.getFILE_NAME());
		m_med.setpvc2UserId(getSysUserCd());
		m_med.setpvc2BusinessName(getSysProgramId());
		m_med.setpvc2PlantCd(getTargetPlantCd());
		
		// �v���O�����ŗL���ڂ̐ݒ�
		m_med.setBATCH_TYP(Integer.valueOf(getSysBatchType()));
		m_med.setpnumYear(Integer.valueOf(getYear()));
		m_med.setpnumHalfTermTyp(Integer.valueOf(getHalfTermTyp()));
		m_med.setpnumCostTyp(Integer.valueOf(getCostType()));
		m_med.setpnumYyyyMm(
			Integer.valueOf(
				getStartMonthOfHalfTerm(
					getYear(),
					getStartMonth(getTargetPlantCd()),
					getHalfTermTyp())));
		m_med.setpnumExecuteTyp(Integer.valueOf(getExecuteType()));
		m_med.setpnumUpdateMode(Integer.valueOf(getUpdateMode()));

		System.out.println("--------------------------------------");
		System.out.println("pvc2LogMode: " + m_med.getpvc2LogMode());
		System.out.println("pvc2OutPutMode: " + m_med.getpvc2OutPutMode());
		System.out.println("pvc2OutPutPath: " + m_med.getpvc2OutPutPath());
		System.out.println("pvc2OutPutName: " + m_med.getpvc2OutPutName());
		System.out.println("pvc2UserId: " +  m_med.getpvc2UserId());
		System.out.println("pvc2BusinessName: " + m_med.getpvc2BusinessName());
		System.out.println("pvc2PlantCd: " + m_med.getpvc2PlantCd());
		
		// �v���O�����ŗL����
		System.out.println("pnumYear:  " + m_med.getpnumYear());
		System.out.println("pnumHalfTermTyp: " + m_med.getpnumHalfTermTyp());
		System.out.println("pnumCostTyp: " + m_med.getpnumCostTyp().toString());
		System.out.println("pnumYyyyMm: " + m_med.getpnumYyyyMm().toString());
		System.out.println("pnumExecuteTyp: " + m_med.getpnumExecuteTyp().toString());
		System.out.println("pnumUpdateMode: " + m_med.getpnumUpdateMode().toString());
		
		List returnList = m_med.getSQLCSPUCHALL().call();
		
		medDB0020B001 resultMed = (medDB0020B001) returnList.get(0);
		System.out.println(resultMed.getpnumReturn().intValue());
		
		return resultMed.getpnumReturn().intValue();

	}

	/**
	 * �u�Ώ۔N�x�v�u�N�x�J�n���v�u�����敪�v����ɗ���̔N���iyyyyMM�j���v�Z���܂��B<br>
	 * �i��j�Ώ۔N�x=2005�A�J�n��=7�̏ꍇ<br>
	 * �����̏ꍇ�F200507
	 * ������̏ꍇ�F200601
	 * @param year �Ώ۔N�x
	 * @param startMonth �J�n��
	 * @param halfTerm �����敪�i1:����@2:�����j
	 * @return ����̔N���iyyyyMM�j
	 * @throws IllegalArgumentException �������s���iNull�j�̏ꍇ
	 * @throws NumberFormatException �����������ł͂Ȃ��ꍇ
	 */
	private String getStartMonthOfHalfTerm(String year, String startMonth, String halfTerm) {

		if (halfTerm == null || year == null || startMonth == null) {
			throw new IllegalArgumentException();
		}
		int y = Integer.parseInt(year);
		int m = Integer.parseInt(startMonth);

		y = m > 6 ? y + 1 : y;
		m = m > 6 ? m - 6 : m + 6;
		if (halfTerm.equals("2")) {
			y = m > 6 ? y + 1 : y;
			m = m > 6 ? m - 6 : m + 6;
		}
		StringBuffer startYM = new StringBuffer(String.valueOf(m));
		if (m < 10) {
			startYM.insert(0, '0');
		}
		startYM.insert(0, String.valueOf(y));
		while (true) {
			if (startYM.length() >= 6) {
				break;
			}
			startYM.insert(0, '0');
		}
		return startYM.substring(0);
	}

	/**
	 * ���o�����ɂ����āA�X�V�\�ł��邩�𔻒肵�܂��B
	 * @return �X�V�\�ȏꍇ��true�A�X�V�\�ł͂Ȃ��ꍇ��false
	 */
	private boolean canUpdate() {
		// �����敪���u�X�V�v�ȊO�͑Ώۂɂ��Ȃ�
		if (!m_med.getTRANSACTION_TYP().equals("2")) {
			return false;
		}
		// �ޔ��X�V�������݂��Ȃ��ꍇ�͍X�V����
		if (isNull(m_med.getSAVE_UPDATED_DATE())) {
			return true;
		}
		try {
			DateFormat format = DateFormat.getInstance();
			java.util.Date saveDate = format.parse(m_med.getSAVE_UPDATED_DATE());
			java.util.Date updateDate = format.parse(m_med.getUPDATED_DATE());
			// �u�ޔ��X�V���v<�u�X�V���v�̏ꍇ�͍X�V����B
			if (saveDate.before(updateDate)) {
				return true;
			} else {
				// 1:�����X�V�̏ꍇ�͑Ώۂɂ��Ȃ�
				if (getUpdateMode().equals("1")) {
					return false;
				}
			}
			return true;
		} catch (ParseException e) {
			// ��̓G���[�̏ꍇ��UPDATE���Ă�Oracle�G���[�ɂȂ�̂őΏۂɂ��Ȃ��B
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * ���݂̃G���[����m_med���擾���A[�ꊇ�o�^�G���[]��INSERT���܂��B
	 * @param messageCode �G���[�̃��b�Z�[�W�R�[�h
	 * @param count IF���͌����i�Ǎ������j
	 */
	private void insertCsError(String messageCode, int count)
		throws FoundationException, BatchAppException {

		String tmpCostTyp = m_med.getCOST_TYP();

		m_med.setCOST_TYP(getCostType());

		m_med.getSEQ_CS_ERROR_CD().read();
		m_med.getSEQ_CS_ERROR_CD().next();
		// SEQ_CS_ERROR_CD�̎擾��m_med.CS_ERROR_CD�ɒl���i�[����邽�߃f�[�^���Z�b�g���Ă��܂���

		m_med.setMESSAGE_CD(messageCode);
		m_med.setREAD_COUNT(String.valueOf(count));
		m_med.setREMARKS(getRemarks());
		m_med.getT_CS_ERROR().create();

		m_med.setCOST_TYP(tmpCostTyp);
	}

	/**
	 * ���l�p�������Ԃ��܂�
	 * @return ���l�p������
	 * @throws BatchAppException
	 */
	private String getRemarks() throws BatchAppException {

		return "YEAR=" + getYear() + " HALF_TERM_TYP=" + getHalfTermTyp();

	}

	/**
	 * [�i��]�ɑ��݂��邩�𔻒肵�܂� �B
	 * @return [�i��]�ɑ��݂���ꍇ��true�A���݂��Ȃ��ꍇ��false
	 */
	private boolean isExistsMItem() throws BatchAppException {
		m_med.getM_ITEM().read();
		return m_med.getM_ITEM().hasRecord(false);
	}

	/**
	 * [�w���i�}�X�^]�ɑ��݂��邩�𔻒肵�܂� �B
	 * @return [�w���i�}�X�^]�ɑ��݂���ꍇ��true�A���݂��Ȃ��ꍇ��false
	 * @throws BatchAppException
	 */
	private boolean isExistsMCsPuch() throws BatchAppException {
		m_med.getM_CS_PUCH().read();
		return m_med.getM_CS_PUCH().next();
	}

	/**
	 * �}�X�^�D��ŁA���}�X�^�ɂ���čX�V����Ă��邩�𔻒肵�܂��B
	 * �w���i�}�X�^�D��敪=1:�}�X�^�A�X�V�敪=2:�}�X�^�ōX�V�̏ꍇ��true��Ԃ��܂��B
	 * ��L�ȊO��false��Ԃ��܂��B
	 * @return �}�X�^�X�V�\�ȏꍇ��true�A�ύX�s�̏ꍇ��false
	 */
	private boolean isUpdatedByMaster() throws BatchAppException {
		return getPriorityType().equals("1") && m_med.getUPDATE_TYP().equals("2");
	}

	/**
	 * �����敪���폜���ǂ����𔻒肵�܂��B
	 * @return �폜�̏ꍇ��true�A�V�K�E�X�V�̏ꍇ��false
	 */
	private boolean isDeleteTransaction() {
		return m_med.getTRANSACTION_TYP().equals("3");
	}

	/**
	 * ���[�N�t�@�C���𐶐����ĕԂ��܂��B
	 */
	private CsPuchIfWork createWork() throws BatchAppException {
		return new CsPuchIfWork(m_med.getITEM_CD());
	}

	/**
	 * �w���i�C���^�t�F�[�X�̏����i�[����I�u�W�F�N�g�ł��B
	 */
	private class CsPuchIfWork {
		private final String itemCd;
		private boolean exists;
		private boolean error;
		private boolean delete;

		CsPuchIfWork(String item) throws BatchAppException {
			itemCd = item;
			if (item == null) {
				throw new NullPointerException();
			}
			exists = isExistsMCsPuch();
		}
		/**
		 * ���ݓǂݍ���ł��郌�R�[�h�Ɠ����ł��邩�𔻒肵�܂��B
		 * @return ���ݓǂݍ���ł��郌�R�[�h�Ɠ��l�̏ꍇ��true�A�Ⴄ�ꍇ��false
		 */
		boolean equalsCurrentRecord() {
			return itemCd.equals(m_med.getITEM_CD());
		}

		void setError() {
			error = true;
		}

		/**
		 * �}�X�^�폜�����鏈���敪�ɐݒ肵�܂��B
		 */
		void setDeleteTransaction(boolean b) {
			delete = b;
		}

		/**
		 * �w���i�}�X�^�ɑ��݂��邩�𔻒肵�܂��B
		 * @return �}�X�^�ɑ��݂���ꍇ��true�A�Ⴄ�ꍇ��false
		 */
		boolean isExistsMaster() {
			return exists;
		}

		/**
		 * �}�X�^�폜�����鏈���敪�ł��邩�𔻒肵�܂��B
		 * @return �폜�̏ꍇ��true�A�Ⴄ�ꍇ��false
		 */
		boolean isDeleteTransaction() {
			return delete;
		}

		/**
		 * �G���[�����邩�𔻒肵�܂��B
		 * @return �G���[�̏ꍇ��true�A�Ⴄ�ꍇ��false
		 */
		boolean hasError() {
			return error;
		}
	}

	//////////////////////////////

	/**
	 * object�^��Ԃ��܂�
	 *
	 * @return object�^
	 */
	public int getType() {
		return m_control.getType();
	}

	/**
	 * ��������
	 *
	 * @return <<�R�����g���L�q���Ă�������>>
	 * @exception <<�R�����g���L�q���Ă�������>>
	 */
	public int beginProc() throws BatchAppException {

		return m_control.beginProc();
	}

	/**
	 * �I������
	 *
	 * @exception <<�R�����g���L�q���Ă�������>>
	 */
	public int endProc() throws BatchAppException {

		return m_control.endProc();
	}

	/**
	 * �I������
	 *
	 * @exception <<�R�����g���L�q���Ă�������>>
	 */
	public int execute() throws BatchAppException {

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
		public medDB0020B001 m_med=null;

		/**
		 * �R���e�i�N���X�C���X�^���X
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medDB0020B001 med) throws BatchAppException
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
