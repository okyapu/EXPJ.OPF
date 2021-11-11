/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0080/src/com/nec/jp/orteus/metamorBase/AD0080/AD0080B002/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0080.AD0080B002;

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
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.expj.util.ExpjException;
import com.nec.jp.orteus.expj.util.Numbering;
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain �N���X
 * �t�@�C���E�N���X����
 * @author $Author: geng-jia $
 * @version $Revision: 1.4 $ $Date: 2015/12/22 09:52:55 $
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
	public medAD0080B002 m_med=null;

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
	public CtrlMain(medAD0080B002 med, BatchAppConductor cdr) throws BatchAppException
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
	public CtrlMain(medAD0080B002 med) throws BatchAppException
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
	protected void finalize()
	{
		// �e�����o�ϐ��̏�����
		m_med = null;
		m_control = null;
		objMessage = null;

		// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������

		return;
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
     return m_med.getArgs()[3];
    }
   
    /**
     * �o�b�`�p�����[�^(����4)�Ɩ�ID��Ԃ��܂��B
     * @return �Ɩ�ID
     */
    private String getSysProgramId() {
     return m_med.getArgs()[2];
    }
    
    /**
     * �o�b�`�p�����[�^(����5)CSV�捞������Ԃ��܂��B
     * @return CSV�捞����
     */
    private String getCsvTakeTyp() {
     return m_med.getArgs()[4];
    }
    
    /**
     * �o�b�`�p�����[�^(����6)�捞�t�@�C���p�X��Ԃ��܂��B
     * @return �捞�t�@�C���p�X
     */
    private String getCsvTakePath() {
     return m_med.getArgs()[5];
    }
    
    /**
     * �o�b�`�p�����[�^(����7)�o�b�N�A�b�v�t�H���_�p�X��Ԃ��܂��B
     * @return �o�b�N�A�b�v�t�H���_�p�X
     */
    private String getCsvBackupPath() {
     return m_med.getArgs()[6];
    }
    
    /** DB�R�l�N�V���� */
    private IDbConnection conn = null;
    /** �Ɩ����b�Z�[�W���O�pNumbering�N���X */
    private Numbering numbering = null;
    /** �Ɩ����b�Z�[�W���O�pBusinessMessageAccessor�N���X */
    private BusinessMessageAccessor businessMsgAcc = new BusinessMessageAccessor();
    /** �Ɩ����b�Z�[�W���O�pBusinessMessage�N���X */
    private BusinessMessage businessMsg = new BusinessMessage();
 
	/** ���b�N���s�����b�N�L�[ */
	private static final int LOCK_FAILD = -1;
	/** �Ɩ����b�N�N���X */
	private BusinessLock lock = null;
	
	private static final int INFOMATION = 0;
	/** ���O���x�� ���[�j���O */
	private static final int WARNING = 1;
	/** ���O���x�� �G���[ */
	private static final int ERROR = 2;
	
	/** �h���C�u���^�[�ϊ������� **/
	private char _driveLetterChangeCharBefore;
	/** �h���C�u���^�[�ϊ��敶�� **/
	private char _driveLetterChangeCharAfter;
	/** DB�T�[�o�� */
	private String _strDbServerName;
	
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
	 * ���O�t�@�C���o��
	 * @param logLevel ���O���x��
	 * @param code ���b�Z�[�W�R�[�h
	 */
	private void writeLogFiles(int logLevel, String code) {
		writeLogFiles(logLevel, code, null);
	}
	
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
			case WARNING :
				m_med.getSyslog().warning(emsg, m_med.getUsername());
				break;
			case ERROR :
				m_med.getSyslog().severe(emsg, m_med.getUsername());
				break;
		}
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
	 * �Ɩ����b�N���s���܂�
	 * @return ���b�N�L�����Z���L�[
	 * @throws FoundationException
	 */
	private int businessLock() throws FoundationException {
		lock = new BusinessLock(conn, getSysUserCd(), getSysPlantCd());
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
	 * �o�b�`�p�����[�^�i���ʁj�̃`�F�b�N���s���܂��B
	 * @return ����̏ꍇtrue�A�s���̏ꍇfalse
	 * @throws BatchAppException
	 */
	private boolean checkCommonParams() throws BatchAppException {
		
		// �o�b�`�p�����[�^�̌`�����s���ȏꍇ
		String[] args = m_med.getArgs();
		if (args.length > 7){
			writeLogFiles(ERROR, "ZZ09022");
			return false;
		}
		// �o�b�`�p�����[�^�̌`�����s���ȏꍇ
		if (args.length < 5){
			writeLogFiles(ERROR, "ZZ09022");
			return false;
		}		
		
		
		// �o�b�`�����敪��Null�̏ꍇ
		if (isNull(getSysBatchType())) {
			writeLogFiles(ERROR, "ZZ09023");
			return false;
		}
		
		// �o�b�`�����敪���P�A�Q�ȊO�̏ꍇ
		if ((!getSysBatchType().equals("1") && !getSysBatchType().equals("2"))) {
			writeLogFiles(ERROR, "ZZ09024");
			return false;
		}
		
		// ���[�U�[�R�[�h��Null�̏ꍇ
		if (isNull(getSysUserCd())) {
			writeLogFiles(ERROR, "ZZ09025");
			return false;
		}
		
		// [���[�U�}�X�^]�ɑ��݂��Ȃ��ꍇ
		if (!isExsistsUserMst(getSysUserCd())) {
			writeLogFiles(ERROR, "ZZ09026");
			return false;
		}
		
		// �H��R�[�h��Null�̏ꍇ
		if (isNull(getSysPlantCd())) {
			writeLogFiles(ERROR, "ZZ09027");
			return false;
		}
		// [�H��]�ɑ��݂��Ȃ��ꍇ
		if (!isExistsMPlant(getSysPlantCd())) {
			writeLogFiles(ERROR, "ZZ09028");
			return false;
		}
		
		// �Ɩ�ID��Null�̏ꍇ
		if (isNull(getSysProgramId())) {
			writeLogFiles(ERROR, "ZZ09029");
			return false;
		}
		
		// �����́uCSV�捞�����v��1�F�Œ�t�@�C���捞�A2�F�w��t�@�C���捞�@�ȊO�̏ꍇ
		if ((!getCsvTakeTyp().equals("1") && !getCsvTakeTyp().equals("2"))) {
			writeLogFiles(ERROR, "AD60038");
			return false;
		}
		// �����́uCSV�捞�����v��2�F�w��t�@�C���捞���� �����́u�捞�p�X�v��NULL�̏ꍇ
		if ((getCsvTakeTyp().equals("2"))) {
			if (isNull(getCsvTakePath())) {
				writeLogFiles(ERROR, "AD60039");
				return false;
			}
		}
		// �����́uCSV�捞�����v��2�F�w��t�@�C���捞 ���� �����́u�o�b�N�A�b�v�t�H���_�p�X�v��NULL�̏ꍇ
		if ((getCsvTakeTyp().equals("2"))) {
			if (isNull(getCsvBackupPath())) {
				writeLogFiles(ERROR, "AD60040");
				return false;
			}
		}
		
		return true;
	}
	
	/**
	 * [�p�����[�^]����uDB�T�[�o���v�ƁuDB�捞�t�H���_�p�X�v���擾���A�f�B���N�g���`�F�b�N���s���B
	 * 
	 * @param  �Ȃ�
	 * @return strMessageId     �G���[���̃��b�Z�[�W�ԍ�
	 *         strDetailMessage �G���[���̏ڍ׃��b�Z�[�W
	 */
	private String[] dbServerPathGetCheck()
		throws BatchAppException {
		
		// �߂�l�p�̕ϐ��錾
		String[] strResultMessage = new String[2];
		
		// [�敪�R�[�h]���u�h���C�u���^�[�ϊ������v���擾����B
		m_med.setSYS_CLASS("PRODUCTION");
		m_med.setCLASS_CODE("DRIVE_LETTER_CHANGE_CHAR");
		
		// [�敪�R�[�h]�̌������s
		int nret = m_med.getSYS_CLASS_CODE().read();
		if (!m_med.getSYS_CLASS_CODE().next()) {
			// [�敪�R�[�h]�����݂��Ȃ��ꍇ�A���b�Z�[�W�ԍ���ݒ肵�G���[�I���B
			strResultMessage[0] = "AD60041";
			strResultMessage[1] = null;
			return strResultMessage;
		} else if (isNull(m_med.getCODE())) {
			// [�敪�R�[�h]�����݂��邪�R�[�h��NULL�̏ꍇ�A���b�Z�[�W�ԍ���ݒ肵�G���[�I���B
			strResultMessage[0] = "AD60041";
			strResultMessage[1] = null;
			return strResultMessage;
		} else {
			_driveLetterChangeCharBefore = m_med.getCODE().charAt(0);
			_driveLetterChangeCharAfter = m_med.getCODE2().charAt(0);
		}
		// [�敪�R�[�h]���uDB�T�[�o���v���擾����B
		m_med.setSYS_CLASS("PRODUCTION");
		m_med.setCLASS_CODE("DB_SERVER_NAME");
		
		// [�敪�R�[�h]�̌������s
		nret = m_med.getSYS_CLASS_CODE().read();
		if (!m_med.getSYS_CLASS_CODE().next()) {
			// [�敪�R�[�h]�����݂��Ȃ��ꍇ�A���b�Z�[�W�ԍ���ݒ肵�G���[�I���B
			strResultMessage[0] = "AD60042";
			strResultMessage[1] = null;
			return strResultMessage;
		} else if (isNull(m_med.getCODE_NAME())) {
			// [�敪�R�[�h]�����݂��邪�R�[�h��NULL�̏ꍇ�A���b�Z�[�W�ԍ���ݒ肵�G���[�I���B
			strResultMessage[0] = "AD60042";
			strResultMessage[1] = null;
			return strResultMessage;
		} else {
			_strDbServerName = m_med.getCODE_NAME();
		}
				
		// �����́uCSV�捞�����v��2�F�w��t�@�C���捞�̏ꍇ���A
		// DB�T�[�o�Ƀo�b�N�A�b�v�t�H���_�i�g\\�h + �uDB�T�[�o���v + �g\�h + �����́u�o�b�N�A�b�v�t�H���_�p�X�v�j�����݂��Ȃ��ꍇ
		if (getCsvTakeTyp().equals("2")) {
			String strCsvDbBackupPath = "\\\\" + _strDbServerName + "\\" + getCsvBackupPath().replace(_driveLetterChangeCharBefore, _driveLetterChangeCharAfter);
			File csvDbBackupFile = new File(strCsvDbBackupPath);
			if (!csvDbBackupFile.isDirectory()) {
				strResultMessage[0] = "AD60043";
				strResultMessage[1] = "�o�b�N�A�b�v�t�H���_�p�X�F" + strCsvDbBackupPath.replaceAll("\\\\\\\\", "").replaceAll("\\\\","/");
				return strResultMessage;
			}
		}
		
		return strResultMessage;
	}
	
	
	//////////////////////////////

	/**
	 * main�F ���[�U��`�p���\�b�h�ł�<br>
	 * <<�������L�q���Ă�������>>
	 *
	 * @return <<�������L�q���Ă�������>>
	 * @exception <<�������L�q���Ă�������>>
	 */
	public int main() throws BatchAppException, FoundationException
	{
/*
		// todo: �����Ƀ��[�U��`�R�[�h���L�q���Ă�������
*/
		// ���b�N�����L�[
		int lockCancelKey = LOCK_FAILD;
		// DB�ڑ��擾����
		conn = m_conductor.m_transactionConn;
		String[] args = m_med.getArgs();
		if(args.length >= 2){
	           m_med.setUsername(m_med.getArgs()[1]);
	        }
		
		// �o�b�`�p�����[�^�i���ʁj�`�F�b�N
		if (!checkCommonParams()) {
			writeLogFiles(ERROR, "ZZ09009");
			return BREAK;
		}
		
		// PL/SQL�̎��s
		String result = null;
		try {	
			// DB���b�Z�[�W�X�V����
			IDbConnection conn_msg = m_conductor.m_defaultConn;
			numbering = new Numbering(conn_msg, Numbering.LOG_CD, getSysUserCd(), getSysProgramId(), getSysPlantCd());
			businessMsgAcc.init(conn_msg);
			businessMsg.setBusinessOperatingName(getSysProgramId());
			businessMsg.setUser(getSysUserCd());
			businessMsg.setPlantCode(getSysPlantCd());
			
			// �Ɩ����b�N
			lockCancelKey = businessLock();
			if (lockCancelKey == LOCK_FAILD) {
				writeLog(ERROR, "ZZ01008");
				return BREAK;
			}
			
			// �J�n���b�Z�[�W
			writeLog(INFOMATION, "ZZ09001");
			
			m_med.setPROGRAM_CD(m_med.getProgname());
			m_med.setFUNCTION_NAME("SQLOPRRSLTINTERFACE");
			
			int nret = m_med.getSYS_BAT_PARM().read();
			if (!m_med.getSYS_BAT_PARM().next()) {
				ExpjMessage emsg = new ExpjMessage("ZZ09030");
				throw new BatchAppException("CtrlMain", "excuteProcedure", emsg.getMessage(CoreTools.getLocale(getSysUserCd())));
			}	

			m_med.setpvc2LogMode(m_med.getLOG_MODE_TYP().toString());
			m_med.setpvc2OutputMode(m_med.getOUTPUT_MODE_TYP().toString());
			m_med.setpvc2OutputPath(m_med.getFILE_PATH());
			m_med.setpvc2OutputName(m_med.getFILE_NAME());
			m_med.setpvc2UserId(getSysUserCd());
			m_med.setpvc2BusinessName(getSysProgramId());
			m_med.setpvc2PlantCd(getSysPlantCd());
			
			// �G���[���̃��b�Z�[�W�ێ��p�ϐ�
			String[] strMessage = new String[2];			
			
			// �����́uCSV�捞�����v��2�F�w��t�@�C���捞�̏ꍇ�ADB�T�[�o�p�X�̎擾�E�f�B���N�g���`�F�b�N���s���B
			if ((getCsvTakeTyp().equals("2"))) {
				// DB�T�[�o�p�X�̎擾�E�f�B���N�g���`�F�b�N���s���B
				strMessage = dbServerPathGetCheck();
				
				// �߂�l�z���0�Ԗ�(���b�Z�[�WID)��NULL�łȂ��ꍇ�A�G���[�������s���B
				if (!isNull(strMessage[0])) {
					// DB�T�[�o�p�X�̎擾�E�f�B���N�g���`�F�b�N�ɂăG���[�����������ꍇ�A��O�I���Ƃ���B
					if (isNull(strMessage[1])) {
						writeLog(ERROR, strMessage[0]);
						// �ُ�I�����O
						writeLog(INFOMATION, "VZ00003");
						return BREAK;
					} else {
						writeLog(ERROR, strMessage[0], strMessage[1]);
						// �ُ�I�����O
						writeLog(INFOMATION, "VZ00003");
						return BREAK;
					}
				}
			}

			// CSV�捞������1�F�Œ�t�@�C���捞 �̏ꍇ
			if (getCsvTakeTyp().equals("1")) {
				// CSV�捞����
				m_med.setpnumCsvTakeTyp(getCsvTakeTyp());
				// �捞�p�X
				m_med.setpvc2CsvTakePath(null);
				// �o�b�N�A�b�v�t�H���_�p�X
				m_med.setpvc2CsvBackupPath(null);
			}else if (getCsvTakeTyp().equals("2")) {
				// CSV�捞����
				m_med.setpnumCsvTakeTyp(getCsvTakeTyp());
				// �捞�p�X
				m_med.setpvc2CsvTakePath(getCsvTakePath());
				// �o�b�N�A�b�v�t�H���_�p�X
				m_med.setpvc2CsvBackupPath(getCsvBackupPath());
			}
			
			List callList = null;
			callList = m_med.getSQLOPRRSLTINTERFACE().call();
			// PL/SQL�̎��s���ʂ��擾
			medAD0080B002 resultMed = (medAD0080B002) callList.get(0);
			result = resultMed.getpnumReturn();
			// �������ʂ�3�F�ُ�I���̏ꍇ�A�����Ń��[�v���I������B
			if (result.equals("3")) {
				// �I�����O
				writeLog(INFOMATION, "ZZ09002");
				return BREAK;
			}
			// �g�����U�N�V�����̊J�n
			conn.beginTransWeb();
			conn.commit();				
			writeLog(INFOMATION, "ZZ09002");
			
		}catch (FoundationException e) {
			conn.rollback();
			e.printStackTrace();
			throw new BatchAppException("CtrlMain", "main", e.getMessage());			
		}catch (SQLException e) {
			conn.rollback();
			e.printStackTrace();
			throw new BatchAppException("CtrlMain", "main", e.getMessage());
		}catch (Exception e) {
			conn.rollback();
			e.printStackTrace();
			throw new BatchAppException("CtrlMain", "main", e.getMessage());
		}finally{
			try{
				// �Ɩ����b�N����
				if (!businessUnLock(lockCancelKey)) {
					writeLog(ERROR, "ZZ01004");
				}
			}catch(Exception e){
				conn.rollback();
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
		public medAD0080B002 m_med=null;

		/**
		 * �R���e�i�N���X�C���X�^���X
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medAD0080B002 med) throws BatchAppException
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
