/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0130/src/com/nec/jp/orteus/metamorBase/AF0130/AF0130B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.AF0130.AF0130B001;

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
import com.nec.jp.orteus.metamorBase.AF0130.AF0130010Entity;
import com.nec.jp.orteus.metamorBase.AF0130.AF0130010Struct;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlStruct;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.expj.pr.rcvissue.common.UpdateInfo;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueInstStruct;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueProcess;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueRemain;
import com.nec.jp.orteus.expj.pr.rcvissue.process.JobOdrAlc;
import com.nec.jp.orteus.expj.pr.rcvissue.process.RcvProcess;
import com.nec.jp.orteus.expj.systemlog.SystemLog;
import com.nec.jp.orteus.expj.util.Calculate;
import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.expj.util.ExpjException;
import com.nec.jp.orteus.expj.util.MessageStruct;
import com.nec.jp.orteus.expj.util.Numbering;
import java.math.BigDecimal;
import com.nec.jp.orteus.xaf.wa.BusinessProcessException;
import com.nec.jp.orteus.util.logging.*;
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain �N���X
 * �t�@�C���E�N���X����
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.3 $ $Date: 2016/05/23 08:18:12 $
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
	public medAF0130B001 m_med=null;

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
	public CtrlMain(medAF0130B001 med, BatchAppConductor cdr) throws BatchAppException
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
	public CtrlMain(medAF0130B001 med) throws BatchAppException
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
	
	/**�S�����R�[�h��**/
	private int _intTotalCount = 0; 
	/**�G���[���R�[�h����**/
	private int _intErrorCount = 0;  
	/**���탌�R�[�h����**/
	private int _intSuccessCount = 0;
	/**���[�j���O����**/
	private int _intWarningCount = 0;
    /**�G���[�R�[�h*/
    String errCode = null;    
    
	/** �Ɩ��^�p��*/
	private String _btmBusinessOprDate;
	
	// �ݒ�l
	private String strValus = null;
	private String _wh_cd = null;
	private String  _ctrlCd = null;
	
	protected AF0130010Struct struct = new AF0130010Struct();

    /**AF0130 entity*/
	protected AF0130010Entity entity;
	
	protected SystemLog sysLog = null;
	
	
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
	 * ���O���b�Z�[�W�ݒ�
	 * @param �o�̓��b�Z�[�W
	 */
	private void setSyslogConfig(String message) {
		ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
		m_med.getSyslog().config(emsg, getSysUserCd());
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
	
	/**
	 * �}�j���A���o�Ɏ��ю捞�f�[�^�擾
     * @return	puchOrdList     �}�j���A���o�Ɏ��ю捞���X�g
	 * @throws BatchAppException 
	 */
	private List selectTManIssueInstTemp() throws BatchAppException {
		List rtnList = new ArrayList();
		AF0130010Struct structdata = null;
		m_med.getT_MAN_ISSUE_INST_TEMP().read();
		while(m_med.getT_MAN_ISSUE_INST_TEMP().next()) {
			structdata = new AF0130010Struct();
			structdata.setISSUE_INST_CD(m_med.getISSUE_INST_CD());
			structdata.setITEM_CD(m_med.getITEM_CD());
			structdata.setJOB_ODR_CD(m_med.getJOB_ODR_CD());
			structdata.setWH_CD(m_med.getISSUE_WH_CD());
			structdata.setLOT_NO(m_med.getLOT_NO());
			structdata.setISSUE_QTY(m_med.getISSUE_QTY());
			structdata.setISSUE_DATE(m_med.getISSUE_DATE());
			structdata.setISSUE_CMPLT_FLG(m_med.getISSUE_CMPLT_FLG());
			structdata.setRCV_WH_CD(m_med.getRCV_WH_CD());
			structdata.setVEND_LOT_NO(m_med.getVEND_LOT_NO());
			rtnList.add(structdata);
		}
		return rtnList;
	}	

	/*
	 * �����̃`�F�b�N
	 * 
	 * @param dataSource String
	 * 
	 * @return true or false boolean true�̏ꍇ�@�����ł��A�@false�̏ꍇ�A�����ł͂Ȃ�
	 */
	private String chageDate(String dataSource) {
		String dataEnd = "";
		if (dataSource.matches("^^\\d{4}\\/\\d{2}\\/\\d{2}$")) {
			dataEnd = dataSource;
		} else if (dataSource.matches("^^\\d{4}\\/\\d{1}\\/\\d{1}$")) {
			dataEnd = dataSource.substring(0, 5) + "0"+dataSource.substring(5, 7)+"0"+dataSource.substring(7, 8);

		} else if (dataSource.matches("^^\\d{4}\\/\\d{2}\\/\\d{1}$")) {
			dataEnd = dataSource.substring(0, 5) + dataSource.substring(5, 8)+ "0" + dataSource.substring(8, 9);

		} else if (dataSource.matches("^^\\d{4}\\/\\d{1}\\/\\d{2}$")) {
			dataEnd = dataSource.substring(0, 5) + "0" + dataSource.substring(5, 7) + dataSource.substring(7, 9);
		}
		return dataEnd;
	}
	
	/**
	 * ���ی����Ǘ��p�����[�^�̑Ώ۔N�����擾
	 * @param in �`�F�b�N��
	 * @param in �`�F�b�N�H��R�[�h
	 * @param in AD0050010Struct
	 * @param in AD0050010Entity
	 * �߂�l �`�F�b�N����
	 */
	private boolean checkProcExecDate(String checkDate,String plantCD, AF0130010Struct struct) throws BusinessProcessException, FoundationException {
		boolean checkResult = true;
		try {
			
			struct.setPLANT_CD(plantCD);
			List procExecDateList = entity.mselectSYS_ACTUAL_COST_CTRL_AC.read(conn, struct);
			// ���ی����Ǘ��p�����[�^�ɑ��݂��Ȃ�
			if(procExecDateList == null || procExecDateList.isEmpty()){
				return true;
			}
			AF0130010Struct procExecDateStruct = (AF0130010Struct) procExecDateList.get(0);
			BigDecimal date = new BigDecimal(procExecDateStruct.getPROC_EXEC_DATE());
			BigDecimal input = new BigDecimal(chageDate(checkDate).substring(0,4) + chageDate(checkDate).substring(5,7));
			if(input.compareTo(date) >= 0){
				checkResult = true;
			}else{
				//���ߋ��̏ꍇ
				checkResult = false;
			}
		}catch(Exception e) {
			conn.rollback();;
			throw new ExpjException(e);
		}
		return checkResult;
	}
	
	
	/**
	 * �o�Ɏ��ю捞�f�[�^�̃}�X�^�������`�F�b�N
	 * @param dataList
	 * @return
	 * @throws BusinessProcessException
	 * @throws FoundationException
	 */
	private boolean check_listTManIssueInstTemp(List dataList) throws Exception{
		// �S�����R�[�h��
		_intTotalCount = dataList.size();
		AF0130010Struct dataStruct = new AF0130010Struct();
		//�G���[�s�ԍ�
		String errorNumber = "0";
		//�Ɩ����b�Z�[�W�p�G���[�s�ԍ�
		String err_commt ="";
		try {
			for (int i = 0; i < dataList.size(); i++)	{
				boolean lotWarningFlg = false;
				dataStruct = (AF0130010Struct)dataList.get(i);
				errorNumber =String.valueOf(i+1);
				
				AF0130010Struct tIssueinstStruct = new AF0130010Struct();
				AF0130010Struct tlotcrtl  =new AF0130010Struct();
				
				
				//�u�o�Ɏw���ԍ��v �ւ̓��͒l��[�o�Ɏw��]�ɑ��݂��Ȃ��ꍇ
				List issueinstcd = entity.mselect_T_ISSUE_INST1.read(conn, dataStruct);
				if(issueinstcd.isEmpty()){
					errCode = "AF00007";
					//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
					err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
					writeLog(ERROR,errCode,err_commt);	
					_intErrorCount++;
					continue;
				}else{
					tIssueinstStruct = (AF0130010Struct)issueinstcd.get(0);
					//[�o�Ɏw��].�g�H��R�[�h�h �� ���O�C���������[�U�[�̍H��R�[�h�Ɠ������Ȃ��ꍇ
					if(!tIssueinstStruct.getPLANT_CD().equals(getSysPlantCd())){						
						errCode = "AF00182";
						//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
						err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}
					//[�o�Ɏw��].�h�o�Ɏw���o�ɋ敪�h �� 1�F�}�j���A���o�ɏꍇ
					if(!"1".equals(tIssueinstStruct.getISSUE_TYP())){						
						errCode = "AF00183";
						//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
						err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}
					//[�o�Ɏw��].�h�o�Ɋ����t���O�h = 1�F�o�Ɋ����ꍇ
					if("1".equals(tIssueinstStruct.getISSUE_CMPLT_FLG())){
						
						errCode = "AF00132";
						//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
						err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}
					//ADD START 20141208 fei-hy
					//�u�i�ڔԍ��v��NULL�ł͂Ȃ����u�i�ڔԍ��v��[�o�Ɏw��].�g�o�ɕi�ڔԍ��h�ƈ�v���Ȃ��ꍇ
					if (dataStruct.getITEM_CD() != null && !"".equals(dataStruct.getITEM_CD()) && !dataStruct.getITEM_CD().equals(tIssueinstStruct.getITEM_CD())) {						
						errCode = "AF00192";
						//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
						err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}
					//ADD END 20141208 fei-hy
				}
				
				
				//[�o�Ɏw��].�g�o�ɕi�ڔԍ��h�����
				//[�i��].�h �i�ڎ�z�敪�h���u1:���� �v�܂��́u2:�݌Ɉ����^���ԁv�ȊO�����Ԃ�NULL�ł͂Ȃ��ꍇ
				List lotctrlflg =entity.mselect_LOT_CTRL_FLG.read(conn, dataStruct);
				tlotcrtl =(AF0130010Struct)lotctrlflg.get(0);
				if(!("1".equals(tlotcrtl.getMRP_ODR_TYP()) ||"2".equals(tlotcrtl.getMRP_ODR_TYP()))){
					if(!isNull(dataStruct.getJOB_ODR_CD())){						
						errCode = "AF00018";
						//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
						err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}
				}
				
				//���Ԃ�NULL�ł͂Ȃ��A���A[���Ԍv��] �̓f�[�^�������ł��Ȃ��ꍇ
				tIssueinstStruct = (AF0130010Struct)issueinstcd.get(0);
				if(!isNull(dataStruct.getJOB_ODR_CD())){
					boolean blnTWorkProcByItem = entity.mcheck_JOB_ODR_CD.check(conn, dataStruct);
					if (!blnTWorkProcByItem) {						
						errCode = "AF00184";
						//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
						err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}
				}
				
				
				//�u�o�Ɍ��ۊǋ�R�[�h�v �� �u�o�ɐ�ۊǋ�R�[�h�v �̓��͒l�������ꍇ
				if(dataStruct.getWH_CD().equals(dataStruct.getRCV_WH_CD())){					
					errCode = "AF00054";
					//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
					err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
					writeLog(ERROR,errCode,err_commt);	
					_intErrorCount++;
					continue;
				}
				
				//�u�o�Ɍ��ۊǋ�R�[�h�v �� [�ۊǋ�] �ɑ��݂��Ȃ��ꍇ
				List whList  =entity.mselect_M_WH.read(conn, dataStruct);
				if(whList.isEmpty()){					
					errCode = "AF00028";
					//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
					err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
					writeLog(ERROR,errCode,err_commt);	
					_intErrorCount++;
					continue;
				}else{
					//�u�o�Ɍ��ۊǋ�R�[�h�v��[�ۊǋ�].�g�H��R�[�h�h �� ���O�C�����[�U�[�̍H��R�[�h ���قȂ�ꍇ
					if(!((AF0130010Struct)whList.get(0)).getPLANT_CD().equals(getSysPlantCd()))
					{						
						errCode = "AF00029";
						//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
						err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}
					//�u�o�Ɍ��ۊǋ�R�[�h�v�����[�ۊǋ�].�g���v�ʌv�Z�Ώۃt���O�h �� 1�F���v�ʌv�Z�Ώ� �łȂ��ꍇ
					if(! "1".equals(((AF0130010Struct)whList.get(0)).getMRP_FLG())){						
						errCode = "AF00096";
						//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
						err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}
				}
				if("1".equals(tlotcrtl.getLOT_CTRL_FLG())){
					//[�o�Ɏw��].�g�o�ɕi�ڔԍ��h�����[�i��].�h���b�g�Ǘ��t���O�h���u�P�F���b�g�Ǘ����s���v�A
					//�u�݌Ƀ��b�g�ԍ��v��NULL�ꍇ
					if(isNull(dataStruct.getLOT_NO())){						
						errCode = "AF20001";
						//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
						err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}else{
						// [�o�Ɏw��].�g�o�ɕi�ڔԍ��h�����[�i��].�h���b�g�Ǘ��t���O�h���u�P�F���b�g�Ǘ����s���v�A
						//�u�݌Ƀ��b�g�ԍ��v�ƁA[�o�Ɏw��]�D�g�o�ɕi�ڔԍ��h�� [���b�g�Ǘ�]�����������݂��Ȃ��ꍇ
						boolean chklotno =entity.mcheck_TLOT_CTRL.check(conn, dataStruct);
						if (!chklotno) {							
							errCode = "AF20002";
							//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
							err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
							writeLog(ERROR,errCode,err_commt);	
							_intErrorCount++;
							continue;
						}
					}
				
				}else{
					// [�o�Ɏw��].�g�o�ɕi�ڔԍ��h�����[�i��].�h���b�g�Ǘ��t���O�h���u0�F���b�g�Ǘ����s��Ȃ��v�A
					//�u���ԁv �� null �� �u�o�ɐ��v �̒l�� �� 0 �̏ꍇ
					//�i�ڔԍ��A�ۊǋ� ����� [�ۊǋ�ʕi�ڍ݌�] �����݂��Ȃ��ꍇ
					List itemstock =entity.mselect_T_ITEM_STOCK.read(conn, dataStruct);
					if (isNull(dataStruct.getJOB_ODR_CD()) && Calculate.compare(dataStruct.getISSUE_QTY(), "0")  >0 && itemstock.size()<=0) {						
						errCode = "AF00044";
						//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
						err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}
					
					//[�o�Ɏw��].�g�o�ɕi�ڔԍ��h�����[�i��].�h���b�g�Ǘ��t���O�h���u0�F���b�g�Ǘ����s��Ȃ��v�A
					//�u���ԁv �� null�ł͂Ȃ� �� �u�o�ɐ��v �̒l�� �� 0 �̏ꍇ
					//���ԁA�i�ڔԍ��A�ۊǋ� ����� [�ۊǋ�ʐ��ԍ݌�] �����݂��Ȃ��ꍇ
					List itemjobstock =entity.mselect_T_JOB_ODR_CD_STOCK.read(conn, dataStruct);
					if (!isNull(dataStruct.getJOB_ODR_CD()) && Calculate.compare(dataStruct.getISSUE_QTY(), "0")>0 && itemjobstock.size()<=0) {						
						errCode = "AF00045";
						//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
						err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}
					//[�o�Ɏw��].�g�o�ɕi�ڔԍ��h�����[�i��].�h���b�g�Ǘ��t���O�h���u0�F���b�g�Ǘ����s��Ȃ��v�A
					//�i�ڎ�z�敪�� 1�F���� �������� 2�F�݌Ɉ����^���� �� �u����
					//�v��null�� �u�o�ɐ��v �� �u�o�ɉ\���v �̏ꍇ
					tIssueinstStruct = (AF0130010Struct)issueinstcd.get(0);
					//�����ϖ��o�ɐ�
					IssueRemain issueRemain = new IssueRemain(conn);
					struct.setALC_NOISSUE_QTY(
					issueRemain.getRemainQtyByItem(tIssueinstStruct.getOD_NO()).toString());

					// �u�i�ڍ݌ɖ��������v
					struct.setITEM_STOCK_NON_ALC_QTY(
					issueRemain.getFreeStockQtyOfItem(getSysPlantCd(),tIssueinstStruct.getITEM_CD()).toString());
					//�u�o�ɉ\���v = �u�����ϖ��o�ɐ��v �{ �u�i�ڍ݌ɖ��������v
					struct.setTHIS_TIME_ISSUE_POSS_QTY(
					Calculate.add(struct.getALC_NOISSUE_QTY(),struct.getITEM_STOCK_NON_ALC_QTY()));
					
					if("1".equals(tlotcrtl.getMRP_ODR_TYP()) ||"2".equals(tlotcrtl.getMRP_ODR_TYP()) ){
						BigDecimal issueQty = new BigDecimal(dataStruct.getISSUE_QTY());
						BigDecimal itemStock = new BigDecimal(struct.getITEM_STOCK_NON_ALC_QTY());
						if (isNull(dataStruct.getJOB_ODR_CD()) 
								&& issueQty.doubleValue() > itemStock.doubleValue()) {							
							errCode = "AF00115";
							//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
							err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
							writeLog(ERROR,errCode,err_commt);	
							_intErrorCount++;
							continue;
						}
					}
					
					//// �N���A
					struct.setALC_NOISSUE_QTY("0.0");
					struct.setITEM_STOCK_NON_ALC_QTY("0.0");
					struct.setTHIS_TIME_ISSUE_POSS_QTY("0.0");
					
					//[�o�Ɏw��].�g�o�ɕi�ڔԍ��h�����[�i��].�h���b�g�Ǘ��t���O�h���u0�F���b�g�Ǘ����s��Ȃ��v�A
					//�i�ڎ�z�敪�� 1�F���� �������� 2�F�݌Ɉ����^���� �� �u���ԁv��null�ł͂Ȃ��� 
					//�u���ԁv�������ԂłȂ�  �u�o�ɐ��v �� �u�o�ɉ\���v �̏ꍇ
					
					//�ʎ�z���o�ɉ\��
					IssueRemain.ResultByOd  re = issueRemain.getRemainQtyByOd(tIssueinstStruct.getOD_NO());
					struct.setODR_ISSUE_POSS_QTY(re.remainQty.toString());
					
					//�u���ԁv �� null�ł͂Ȃ� �̏ꍇ
					List tmpList;
					// ���Ԃ�null�łȂ����A���ԍ݌� �Ǎ�
					tmpList = entity.mselectSub1_ODR_STOCK.read(conn, struct);		

					if(tmpList.size()> 0){
						AF0130010Struct tmpStruct = (AF0130010Struct)tmpList.get(0);
						struct.setw_TOTAL_STOCK_ON_HAND_QTY(tmpStruct.getw_TOTAL_STOCK_ON_HAND_QTY());
					}
					//�u�����ϖ��o�ɐ��v
					struct.setITEM_STOCK_NON_ALC_QTY(struct.getw_TOTAL_STOCK_ON_HAND_QTY());
					
					
					//�i�ڂ̕i�ڎ�z�敪�� 1�F���� �������� 2�F�݌Ɉ����^���� �� �u���ԁv�� null�ł͂Ȃ� �̏ꍇ�A
					//�u�o�ɉ\���v = �u�ʎ�z���o�ɉ\���v�{�u�����ϖ��o�ɐ��v
					struct.setTHIS_TIME_ISSUE_POSS_QTY(
							Calculate.add(struct.getODR_ISSUE_POSS_QTY(), struct.getALC_NOISSUE_QTY()));

					if("1".equals(tlotcrtl.getMRP_ODR_TYP()) || "2".equals(tlotcrtl.getMRP_ODR_TYP())){
						if (!isNull(dataStruct.getJOB_ODR_CD()) 
								&& Calculate.compare(dataStruct.getISSUE_QTY(), struct.getTHIS_TIME_ISSUE_POSS_QTY())>0) {							
							errCode = "AF00116";
							//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
							err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
							writeLog(ERROR,errCode,err_commt);	
							_intErrorCount++;
							continue;
						}
					}
				}
				
				// �u�o�ɓ��v �� �u������(�Ɩ��^�p����薢��) �ł���ꍇ
				//�Ɩ��^�p���̎擾
					DateCtrlStruct dateCtrl = DateCtrlControl.getData(conn, getSysPlantCd());
					_btmBusinessOprDate = dateCtrl.getBUSINESS_OPR_DATE();
				
				// �Ɩ��^�p��
				BigDecimal decimalBusinessDate = new BigDecimal(_btmBusinessOprDate.substring(0,4) + 
						_btmBusinessOprDate.substring(5,7)+ _btmBusinessOprDate.substring(8,10));
				// �o�ɓ�
				BigDecimal decimalOprDate = new BigDecimal(chageDate(dataStruct.getISSUE_DATE()).substring(0,4) + 
						chageDate(dataStruct.getISSUE_DATE()).substring(5,7)+ chageDate(dataStruct.getISSUE_DATE()).substring(8,10));
				if (decimalOprDate.compareTo(decimalBusinessDate) > 0) {					
					errCode = "ZZ05103";
					//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
					err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
					writeLog(ERROR,errCode,err_commt);	
					_intErrorCount++;
					continue;
				}
				
				// �ȉ��̏����ŁA[�V�X�e���p�����[�^]���������A�ݒ�l�i�������Ă��錎�̎��т̓o�^�^�C�����\�Ƃ��邩�ۂ��̋敪�j���擾����B
				AF0130010Struct adStruct = new AF0130010Struct();
				List valueList = entity.mselectPARAMETER.read(conn, adStruct);
				if (valueList.isEmpty()) {
					strValus = "true";
				}else {
					adStruct = (AF0130010Struct)valueList.get(0);
					strValus = adStruct.getVALUE();
				}	
				

				// ���ی����̒��߂��������Ă�����t�`�F�b�N�A�u�V�X�e���p�����[�^�v�D�ݒ�l=�gfalse�h�̏ꍇ�A�u�o�ɓ��v�̔N�� �iYYYY/MM�j��[���ی����Ǘ��p�����[�^].�g�Ώ۔N���h���ߋ��̏ꍇ
				if ("false".equals(strValus)) {
					if(!checkProcExecDate(dataStruct.getISSUE_DATE(),tIssueinstStruct.getPLANT_CD(),struct)){						
						errCode = "AE00160";
						//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
						err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}
				}
				//[�o�Ɏw��].�g�o�ɕi�ڔԍ��h�����[�i��].�h���b�g�Ǘ��t���O�h���u�P�F���b�g�Ǘ����s���v�ꍇ�A
				//�u�݌Ƀ��b�g�ԍ��v��Null�łȂ��܂��́u�o�ɐ��v���O�ȊO�A���A[���b�g�Ǘ�].�h�ܖ������h�� �u�o�ɓ��v�A���A
				//[�p�����[�^].�h ���O�h���f BEST_BEFORE_DATE_CHECK_FLG�f��1:�G���[�̏ꍇ
				List bestbeforedate = entity.mc_BEST_BEFORE_DATE.read(conn, dataStruct);
				dataStruct.setSYS_PARAMETER_NAME("BEST_BEFORE_DATE_CHECK_FLG");
				
				List syspara =entity.mSELECT_SYS_PARAMETER.read(conn, dataStruct);
				
				if("1".equals(tlotcrtl.getLOT_CTRL_FLG())){
					if(!isNull(dataStruct.getLOT_NO())|| !"0".equals(dataStruct.getISSUE_QTY())){
						if(bestbeforedate.size()>0 && syspara.size()>0 ){
							AF0130010Struct bbdstruct = new AF0130010Struct();
							bbdstruct = (AF0130010Struct)bestbeforedate.get(0);						
							AF0130010Struct sysvalue = new AF0130010Struct();
							sysvalue = (AF0130010Struct)syspara.get(0);
							if("1".equals(bbdstruct.getBEST_BEFORE_DATE())){
								if("1".equals(sysvalue.getSYS_PARAMETER_VALUE())){									
									errCode = "AE05060";
									//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
									err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
									writeLog(ERROR,errCode,err_commt);	
									_intErrorCount++;
									continue;
								}else{
									lotWarningFlg = true;
								
								}
							}
						}
					}
				}
				
				// ���|�Ǘ����C���X�g�[������Ă���ꍇ�A���N���x���擾
				AF0130010Struct readStruct = new AF0130010Struct();
				List installOptionsList = entity.mSYS_INSTALL_OPTIONS.read(conn, readStruct);
				if (installOptionsList.size() > 0) {
					AF0130010Struct installOptionsStruct = (AF0130010Struct)installOptionsList.get(0);
					dataStruct.setINSTALL_FLG(installOptionsStruct.getINSTALL_FLG());
				} else {
					dataStruct.setINSTALL_FLG("0");
				}
				
				// [�C���X�g�[���I�v�V����].�h �V�X�e���I�v�V�������ʎq�h �� C* �A[�C���X�g�[���I�v�V����].�h �V�X�e�������t���O�h �� 1:�����A
				//[�o�Ɏw��].�h�x���敪�h �� 1�F�L���x���̏ꍇ��
				//[����].�hSYS�R���g���[���R�[�h�h�@���@SYSTEM�A[����].�h��ЃR�[�h�h��[���|�V�X�e���Ǘ�].�h��ЃR�[�h�h�ƂȂ�
				//���R�[�h�����݂��Ȃ��ꍇ
				if ("1".equals(dataStruct.getINSTALL_FLG())) {
					List debtCtrlList = entity.mSYS_DEBT_CTRL.read(conn, readStruct);
					if (debtCtrlList.size() > 0) {
						AF0130010Struct debtCtrlStruct = (AF0130010Struct)debtCtrlList.get(0);
						dataStruct.setTHIS_MONTH(debtCtrlStruct.getTHIS_MONTH());
					} else {						
						errCode = "AF00142";
						//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
						err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}
				}	
				//[�o�Ɏw��].�h�o�ɐ�ۊǋ�R�[�h�h���m�������ŁA�u�o�ɐ�ۊǋ�R�[�h�v���m�������̏ꍇ
				if(!isNull(tIssueinstStruct.getRCV_WH_CD())&& isNull(dataStruct.getRCV_WH_CD())){
					dataStruct.setRCV_WH_CD(tIssueinstStruct.getRCV_WH_CD());
				}
				//[�o�Ɏw��].�h�o�ɐ�ۊǋ�R�[�h�h���m�������ŁA�u�o�ɐ�ۊǋ�R�[�h�v���m�������̏ꍇ
				if(isNull(tIssueinstStruct.getRCV_WH_CD())&& !isNull(dataStruct.getRCV_WH_CD())){					
					errCode = "AF00138";
					//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
					err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
					writeLog(ERROR,errCode,err_commt);	
					_intErrorCount++;
					continue;
				}
				
				//�u�o�ɐ�ۊǋ�R�[�h�v���m�������łȂ��A[�ۊǋ�] �ɑ��݂��Ȃ��ꍇ
				_wh_cd = null;
				_wh_cd =dataStruct.getWH_CD();
				dataStruct.setWH_CD(dataStruct.getRCV_WH_CD());
				List rcvWhList =entity.mselect_M_WH.read(conn, dataStruct);
				dataStruct.setWH_CD(_wh_cd);
				AF0130010Struct rcvWhStruct = new AF0130010Struct();
				if(!isNull(dataStruct.getRCV_WH_CD())){
					if(rcvWhList.isEmpty()){						
						errCode = "AF00031";
						//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
						err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}else{
						rcvWhStruct =(AF0130010Struct)rcvWhList.get(0);
						//�u�o�ɐ�ۊǋ�R�[�h�v��[�ۊǋ�].�g�H��R�[�h�h �� ���O�C�����[�U�[�̍H��R�[�h ���قȂ�ꍇ
						if(!rcvWhStruct.getPLANT_CD().equals(getSysPlantCd())){							
							errCode = "AF00032";
							//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
							err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
							writeLog(ERROR,errCode,err_commt);	
							_intErrorCount++;
							continue;
					}
						//�u�o�ɐ�ۊǋ�R�[�h�v���m��������
						//�u�o�ɐ�ۊǋ�R�[�h�v�ƈ�v����[�ۊǋ�].�h���v�ʌv�Z�Ώۃt���O�h��1:���v�ʌv�Z�Ώۂ̏ꍇ
						if("1".equals(rcvWhStruct.getMRP_FLG())){							
							errCode = "AF00139";
							//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
							err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
							writeLog(ERROR,errCode,err_commt);	
							_intErrorCount++;
							continue;
					}
						//�u�o�ɐ�ۊǋ�R�[�h�v���m�������ŁA[�o�Ɏw��].�h�x���敪�h�x���敪�v��0�F��̏ꍇ�A
						//�u�o�ɐ�ۊǋ�R�[�h�v�ƈ�v����[�ۊǋ�].�h�����h���m�������̏ꍇ
						if("0".equals(tIssueinstStruct.getCONS_TYP())){
							if(!isNull(rcvWhStruct.getVEND_CD())){								
								errCode = "AF00140";
								//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
								err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
								writeLog(ERROR,errCode,err_commt);	
								_intErrorCount++;
								continue;
						}
					 }else{
						 if(isNull(rcvWhStruct.getVEND_CD())|| isNull(tIssueinstStruct.getVEND_CD())){							 
								errCode = "AF00141";
								//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
								err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
								writeLog(ERROR,errCode,err_commt);	
								_intErrorCount++;
								continue;
						 }else{
								//�u�o�ɐ�ۊǋ�R�[�h�v���m�������A[�o�Ɏw��].�h�x���敪�h��0�F��̏ꍇ�A
								//�u�o�ɐ�ۊǋ�R�[�h�v�ƈ�v����[�ۊǋ�].�h�����h [�o�Ɏw��].�h�����R�[�h�h����v���Ȃ��ꍇ
								if(!rcvWhStruct.getVEND_CD().equals(tIssueinstStruct.getVEND_CD()) ){									
									errCode = "AF00141";
									//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
									err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
									writeLog(ERROR,errCode,err_commt);	
									_intErrorCount++;
									continue;
								}
						 }
					 }
					}
				}


				//[�o�Ɏw��].�g�o�ɕi�ڔԍ��h�����[�i��].�h���b�g�Ǘ��t���O�h���u�P�F���b�g�Ǘ����s���v�ꍇ�A�u�݌Ƀ��b�g�ԍ��v��Null�łȂ��܂��́u�o�ɐ��v���O�ȊO�̏ꍇ���A
				//[���b�g�Ǘ�].�h�ܖ������h�� �u�o�ɓ��v
				//[�p�����[�^].�h ���O�h���f BEST_BEFORE_DATE_CHECK_FLG�f��2:�x���̏ꍇ
				if (lotWarningFlg){						
					errCode = "AE05061";
					//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
					err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
					writeLog(WARNING,errCode,err_commt);	
					_intWarningCount++;	
				}	
					// [�C���X�g�[���I�v�V����].�h �V�X�e���I�v�V�������ʎq�h �� C* �A[�C���X�g�[���I�v�V����].�h �V�X�e�������t���O�h �� 1:�����A
					//[�o�Ɏw��].�h�x���敪�h �� 1�F�L���x���̏ꍇ��
					//[����].�hSYS�R���g���[���R�[�h�h�@���@SYSTEM�A[����].�h��ЃR�[�h�h��[���|�V�X�e���Ǘ�].�h��ЃR�[�h�h�A
					//[���|�V�X�e���Ǘ�]."���N���x"���u�o�ɓ��v�iYYYY/MM�j
					if ("1".equals(dataStruct.getINSTALL_FLG())) {
						List debtCtrlList = entity.mSYS_DEBT_CTRL.read(conn, readStruct);
						AF0130010Struct debtCtrlStruct = (AF0130010Struct)debtCtrlList.get(0);
						if ("1".equals(tIssueinstStruct.getCONS_TYP()) && debtCtrlList.size() > 0){
							if(debtCtrlStruct.getTHIS_MONTH().compareTo(dataStruct.getISSUE_DATE())>0){
								
								errCode = "AF00187";
								//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
								err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
								writeLog(WARNING,errCode,err_commt);	
								_intWarningCount++;

							}
							}
						}
					
					BigDecimal decimalIssueQty2 = new BigDecimal("0");
					BigDecimal decimalIssueQty = new BigDecimal(dataStruct.getISSUE_QTY());
					// �o�ɐ�
					//�����Ǘ��i��
					decimalIssueQty2 = decimalIssueQty.setScale(0,BigDecimal.ROUND_FLOOR);
					//�؂艺�������O�ƌ�Œl���قȂ��Ă����珬�������͂���Ă����Ɣ��f�����[�j���O�Ƃ���
					if (decimalIssueQty.doubleValue() != decimalIssueQty2.doubleValue()){						
						errCode = "AF60004";
						//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
						err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
						writeLog(WARNING,errCode,err_commt);	
						_intWarningCount++;
						
						dataStruct.setISSUE_QTY(decimalIssueQty2.toString());
					}	
					
					//�u�o�ɐ��v �̒l���o�Ɏc�����傫�� �u�����t���O�v �̓��͒l�� �� �̏ꍇ
					BigDecimal decimalRemainQty = new BigDecimal(tIssueinstStruct.getSHIP_REMAIN_QTY());
					if (decimalIssueQty.doubleValue() > decimalRemainQty.doubleValue())
					{
						if("0".equals(dataStruct.getISSUE_CMPLT_FLG())){							
							errCode = "AF00188";
							//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
							err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
							writeLog(WARNING,errCode,err_commt);	
							_intWarningCount++;

						}
					}
				
					//�u�o�ɐ��v �̒l���o�Ɏc����菬���� �u�����t���O�v �̓��͒l�� ���� �̏ꍇ
					if (decimalIssueQty.doubleValue() < decimalRemainQty.doubleValue())
					{
						if("1".equals(dataStruct.getISSUE_CMPLT_FLG())){							
							errCode = "AF00189";
							//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
							err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
							writeLog(WARNING,errCode,err_commt);	
							_intWarningCount++;
						}
					}
			}
			
			if (_intErrorCount > 0) {
				return false;
			} else {
				return true;
			}
		}catch (Exception e) {
			conn.rollback();;
			throw new ExpjException(e);
		}		
	}
	
	/**
	 * CSV�t�@�C���i�}�j���A���o�Ɏ��ю捞�j�̓��e��o�^
	 * @param csvList
	 * @return
	 * @throws FoundationException 
	 */
	private boolean insertCsvDate(List csvList) throws FoundationException, ExpjException {
		try {
			boolean rtnFlg = true;
			conn.beginTransWeb();
			// �S�����R�[�h��
			_intTotalCount = csvList.size();
			//�@�o�^����
			_intSuccessCount =0;

	        // �o�Ɏ��ѓo�^�������J�n���܂����B
	        writeLog(INFOMATION,"AF80002");

			for (int i = 0; i < csvList.size(); i++) {
				
				AF0130010Struct cvsStruct = (AF0130010Struct)csvList.get(i);
				
				AF0130010Struct tlotcrtl  =new AF0130010Struct();
				List lotctrlflg =entity.mselect_LOT_CTRL_FLG.read(conn, cvsStruct);
				tlotcrtl =(AF0130010Struct)lotctrlflg.get(0);
				
				//���b�g�Ǘ��t���O��0�F���b�g�Ǘ����s��Ȃ��ꍇ
				if("0".equals(tlotcrtl.getLOT_CTRL_FLG())){
					//�݌Ƀ��b�g�ԍ�  null
					cvsStruct.setLOT_NO("");
					
					//���ԕi�̕i�ڍ݌ɖ�����������o�ɂ���ꍇ
					//�u���ԍ݌ɂ���o�ɂ���v��Off�� �u�o�ɐ��v�� �i�ڍ݌ɂ���́u�����ϖ��o�ɐ��v���傫���ꍇ
					//���Ԉ����̒ǉ��E�X�V
					rtnFlg = insertTjobodralc(cvsStruct, i);
					if(!rtnFlg) {
						conn.rollback();
						//�o�Ɏ��ѓo�^�������ُ�I�����܂����B
						 writeLog(INFOMATION, "AF80004");
						return false;
						
					}
					//�ۊǋ�ʓ��o��] �֒ǉ����s���A�擾���� �u���o�ɊǗ��ԍ��v ���p�����[�^�Ƃ��āA
					//�o�ɏ��� ���Ăяo��
					rtnFlg = insert_issue_process(cvsStruct, i);
					if(!rtnFlg) {
						conn.rollback();
						//�o�Ɏ��ѓo�^�������ُ�I�����܂����B
						 writeLog(INFOMATION, "AF80004");
						return false;
					}
					//�L���x���i�̏ꍇ�A�L���x������o�^
					//�H���ۊǏꏊ�܂��͎����ۊǋ�ƂȂ�o�ɐ�ۊǋ�R�[�h�֓��ɂ��邽�� 
					//[�ۊǋ�ʓ��o��]�ɒǉ��� �擾�������o�ɊǗ��ԍ����p�����[�^�Ƃ��ē��ɏ������Ăяo���B
					rtnFlg = insert_rcv_process(cvsStruct, i);
					if(!rtnFlg) {
						conn.rollback();
						//�o�Ɏ��ѓo�^�������ُ�I�����܂����B
						 writeLog(INFOMATION, "AF80004");
						return false;
					}
				}
				if("1".equals(tlotcrtl.getLOT_CTRL_FLG())){
					//���[�J���b�g�ԍ� null
					cvsStruct.setVEND_LOT_NO("");
					//���� null
					cvsStruct.setJOB_ODR_CD("");
					//�ۊǋ�ʓ��o��] �֒ǉ����s���A�擾���� �u���o�ɊǗ��ԍ��v ���p�����[�^�Ƃ��āA
					//�o�ɏ��� ���Ăяo��
					rtnFlg = insert_issue_process(cvsStruct, i);
					if(!rtnFlg) {
						conn.rollback();
						//�o�Ɏ��ѓo�^�������ُ�I�����܂����B
						 writeLog(INFOMATION, "AF80004");
						return false;
					}
					//�L���x���i�̏ꍇ�A�L���x������o�^
					//�H���ۊǏꏊ�܂��͎����ۊǋ�ƂȂ�o�ɐ�ۊǋ�R�[�h�֓��ɂ��邽�� 
					//[�ۊǋ�ʓ��o��]�ɒǉ��� �擾�������o�ɊǗ��ԍ����p�����[�^�Ƃ��ē��ɏ������Ăяo���B
					rtnFlg = insert_rcv_process(cvsStruct, i);
					if(!rtnFlg) {
						conn.rollback();
						//�o�Ɏ��ѓo�^�������ُ�I�����܂����B
						 writeLog(INFOMATION, "AF80004");
						return false;
					}
					//���b�g�ʂɏo�ɂ��������A�o�Ɏ��і��ׂ֒ǉ�����B	
					rtnFlg = insertupTlotissueinst(cvsStruct, i);
					if(!rtnFlg) {
						conn.rollback();
						//�o�Ɏ��ѓo�^�������ُ�I�����܂����B
						 writeLog(INFOMATION, "AF80004");
						return false;
					}
				}
			}
			//  �o�^����������ɏI�������ꍇ
			_intSuccessCount = csvList.size();
	        String succCommt = "(SBM1701)�Ǎ������@=�@[" + _intTotalCount + "] "
	        				 + "�o�^�����@=�@[" + _intSuccessCount + "] ";
	        //�o�Ɏ��ѓo�^�����𐳏�ɏI�����܂����B
	        writeLog(INFOMATION, "AF80003", succCommt);	
			// �g�����U�N�V�����̊J�n
			conn.beginTransWeb();
			conn.commit();
			return true;
		} catch (Exception e) {
			conn.rollback();
			throw new ExpjException(e);
		}
	}
	
	/**
	 * CSV�t�F�C�����e�́A [���Ԉ���]�̒ǉ��E�X�V
	 * @param csvList
	 * @return
	 * @throws FoundationException 
	 */
	private boolean insertTjobodralc (AF0130010Struct adstruct, int m) throws ExpjException {
		// ���O�o�͏��i�[�p

		String logMessage = "";
		
		logMessage = "Control : insertTjobodralc"
				+ ", T_ISSUE_INST.ISSUE_INST_CD:" + adstruct.getISSUE_INST_CD();
	  setSyslogConfig(logMessage);
	
	  
		//�G���[�s�ԍ�
		String errorNumber =String.valueOf(m+1);
		//�Ɩ����b�Z�[�W�p�G���[�s�ԍ�
		String err_commt ="";

		boolean jobOdrAlcFlg = false;
		try {
			IssueRemain issueRemain = new IssueRemain(conn);
			
			AF0130010Struct readStruct = new AF0130010Struct();
			readStruct.setw_ISSUE_INST_CD(adstruct.getISSUE_INST_CD());
			readStruct.setw_WS_CD((String)null);
			readStruct.setw_VEND_CD((String)null);
			readStruct.setw_ISSUE_CMPLT_FLG((String)null);
			readStruct.setw_LOT_CTRL_FLG((String)null);
			readStruct.setw_PLANT_CD((String)null);

			List tmpList = entity.mselect_T_ISSUE_INST1.read(conn, adstruct);
			AF0130010Struct issueInstStruct = (AF0130010Struct)tmpList.get(0);
			
			//[�i��]����́u�i�ڎ�z�敪�v�̃f�[�^���`
			AF0130010Struct tlotcrtl  =new AF0130010Struct();
			List lotctrlflg =entity.mselect_LOT_CTRL_FLG.read(conn, adstruct);
			tlotcrtl =(AF0130010Struct)lotctrlflg.get(0);
			
			//�����ϖ��o�ɐ����擾
			struct.setALC_NOISSUE_QTY(
					issueRemain.getRemainQtyByItem(issueInstStruct.getOD_NO()).toString());
			//���ԕi�̕i�ڍ݌ɖ�����������o�ɂ���ꍇ
			//�u���ԁv��null�� �u�o�ɐ��v�� �i�ڍ݌ɂ���́u�����ϖ��o�ɐ��v���傫���ꍇ�́A
			//�ȉ��̃��R�[�h�����݂���΁A�X�V����B���݂���ꍇ�A�o�^����B
			//[���Ԉ���]�D"�I�[�_�f�}���h�ԍ�" �� [�o�Ɏw��]�D�I�[�_�f�}���h�ԍ�
			//[���Ԉ���]�D"�����݌ɋ敪" �� 1�F�i�ڍ݌�

			if(isNull(adstruct.getJOB_ODR_CD())
					&& Calculate.compare(adstruct.getISSUE_QTY(), struct.getALC_NOISSUE_QTY()) == 1 ){
				if(("1".equals(tlotcrtl.getMRP_ODR_TYP()) || "2".equals(tlotcrtl.getMRP_ODR_TYP()))){
					
					// �o�Ɏw�����N���X�ɏ����Z�b�g
					IssueInstStruct issueInstforStruct = new IssueInstStruct();
					issueInstforStruct.m_OD_NO = issueInstStruct.getOD_NO();
					issueInstforStruct.m_PLANT_CD = getSysPlantCd();
					issueInstforStruct.m_ITEM_CD = issueInstStruct.getITEM_CD();
					
					// �X�V���N���X�ɏ����Z�b�g
					UpdateInfo updateInfo = new UpdateInfo(getSysPlantCd(), this.getSysProgramId(), 0);
					
					// [���Ԉ���]�̒ǉ��E�X�V
					(new JobOdrAlc(conn)).updateAlcQty(issueInstforStruct,
							new BigDecimal(adstruct.getISSUE_QTY()), updateInfo);
					jobOdrAlcFlg = true;;
					
					// [���Ԉ���]���X�V�����ꍇ
					if(jobOdrAlcFlg){
						errCode = "AD60002";
						//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
						err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
						writeLog(WARNING,errCode,err_commt);	
						_intWarningCount++;
					}
				}
				}
		}catch(Exception e) {
			throw new ExpjException(e);
		}
		return true;
	}
	//---------- �o�ɏ����c�a�o�^�����i�e��ʁA�q��ʂŋ��ʎg�p�ׁ̈j�j --------------------
	/**
	 * �e��ʂ̓o�^�{�^���Ǝq��ʂ̓o�^�{�^�����狤�ʂɌĂяo����鏈���ł��B
	 *
	 * @return (true:����I��  false:�ُ�I���j
	 */
	private boolean insert_issue_process(AF0130010Struct adstruct, int n) throws BusinessProcessException, FoundationException, SQLException
	{
		// ���O�o�͏��i�[�p
		String logMessage = "";
		String message1 = "";
		List listMessage = new ArrayList();
		

		logMessage = "Control : insert_issue_process"
					+ ", T_ISSUE_INST.ISSUE_INST_CD:" + adstruct.getISSUE_INST_CD();
		setSyslogConfig(logMessage);
		
		//�G���[�s�ԍ�
		String errorNumber =String.valueOf(n+1);
		
		//�Ɩ����b�Z�[�W�p�G���[�s�ԍ�
		String err_commt ="";

			//----------------------------------------------------------
			// �ۊǋ�ʓ��o�Ɂi�o�Ɂj�o�^
			//----------------------------------------------------------
			// ���o�ɊǗ��ԍ��̔ԁi�o�Ɂj
			_ctrlCd = null;

			try{
				Numbering MyNo = new Numbering(conn,CollectNumber.ISSUE_CD,getSysUserCd(),getSysProgramId(),getSysPlantCd());
				_ctrlCd = MyNo.getNo();
				if(_ctrlCd == null || _ctrlCd.length() == 0){
					// �̔Ԍ��ʂ��Ȃ�
					errCode = "AF00057";
					//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
					err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
					writeLog(ERROR,errCode,err_commt);	
					_intErrorCount++;
					return false;
				}
			}
			catch(FoundationException ex){
				// �o�^�������s�F���o�ɊǗ��ԍ��i�o�Ɂj�̍̔ԂɎ��s���܂���				
				errCode = "AF00057";
				//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
				err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
				writeLog(ERROR,errCode,err_commt);	
				_intErrorCount++;
				return false;
			}
			AF0130010Struct readStruct = new AF0130010Struct();
			List tmpList = entity.mselect_T_ISSUE_INST1.read(conn, adstruct);
			if (!tmpList.isEmpty()) {
		    readStruct = (AF0130010Struct)tmpList.get(0);
		    
			// ���o�ɊǗ��ԍ�
		    readStruct.setRCV_ISSUE_CTRL_CD(_ctrlCd);
			//����
		    readStruct.setJOB_ODR_CD(adstruct.getJOB_ODR_CD());
			// �o�ɕۊǋ�
		    readStruct.settmp_WH_CD(adstruct.getWH_CD());
		    //�H��R�[�h
		    readStruct.setPLANT_CD(getSysPlantCd());
			// �o�ɐ�
		    readStruct.settmp_RCV_ISSUE_QTY(Calculate.multiply(adstruct.getISSUE_QTY(), "-1"));
		    //���o�ɔN����
		    readStruct.setRCV_ISSUE_DATE(adstruct.getISSUE_DATE());
			// ���o�Ɋ����t���O
		    readStruct.setRCV_ISSUE_CMPLT_FLG(adstruct.getISSUE_CMPLT_FLG());
			// ���o�ɋ敪�i2:�o�Ɂj
		    readStruct.setRCV_ISSUE_TYP(new Integer(2));
			// ���o�ɔ����敪�i21:�ʏ�o�Ɂj
		    readStruct.setRCV_ISSUE_GNR_TYP(new Integer(21));
			// �݌ɍX�V�敪�i1:���j
		    readStruct.setSTOCK_UPD_TYP(new Integer(1));
		    //���[�J���b�g�ԍ�
		    readStruct.setVEND_LOT_NO(adstruct.getVEND_LOT_NO());
		  //�݌Ƀ��b�g�ԍ�
		   readStruct.setw_STOCK_LOT_CD(adstruct.getLOT_NO());

			logMessage = "T_RCV_ISSUE.RCV_ISSUE_CTRL_CD:" + readStruct.getRCV_ISSUE_CTRL_CD()
						+ ", T_RCV_ISSUE.JOB_ODR_CD:" + readStruct.getw_JOB_ODR_CD()
						+ ", T_RCV_ISSUE.ITEM_CD:" + readStruct.getITEM_CD()
						+ ", T_RCV_ISSUE.WH_CD:" + readStruct.getWH_CD()
						+ ", T_RCV_ISSUE.RCV_ISSUE_DATE:" + readStruct.getRCV_ISSUE_DATE()
						+ ", T_RCV_ISSUE.RCV_ISSUE_QTY:" + readStruct.gettmp_RCV_ISSUE_QTY();
			setSyslogConfig(logMessage);
						readStruct.setsUser_ID(getSysUserCd());
			// �ۊǋ�ʓ��o�Ɂi�o�Ɂj�o�^
			entity.minsertSub1T_RCV_ISSUE.create(conn, readStruct);

			// [�o�ɏ���]�ďo��
			IssueProcess issuePrc = new IssueProcess(conn, _ctrlCd);
			try{
				if(issuePrc.execProcess() == true){
					// �X�V�n�j
					logMessage = "Issue Process was Complated!";
					setSyslogConfig(logMessage);
				}
				else {
					// �X�V�G���[
					logMessage = "Issue Process was Failed...";
					setSyslogConfig(logMessage);
					return false;
				}
			} finally {
				// �X�V���ʃ��b�Z�[�W�\��
				logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
				for(int idx = 0; idx < issuePrc.getErrorList().size(); idx++){
					message1 = message1 + "," + new ExpjMessage(issuePrc.getErrorList().get(idx).toString());
				}
				if (!isNull(message1)) {
					message1 = message1.substring(1);					
					errCode = "ZZ01006";
					//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
					err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
					writeLog(ERROR,errCode,err_commt);	
					_intErrorCount++;
				}
				
				message1 = "";
				for(int idx = 0; idx < issuePrc.getWarnList().size(); idx++){
					message1 = message1 + "," + new ExpjMessage(issuePrc.getWarnList().get(idx).toString());
				}
				if (!isNull(message1)) {
					message1 = message1.substring(1);					
					errCode = "ZZ01006";
					//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
					err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
					writeLog(WARNING,errCode,err_commt);	
					_intWarningCount++;

				}
			}
		}

			return true;
	}
	
	//---------- ���ɏ����c�a�o�^�����i�e��ʁA�q��ʂŋ��ʎg�p�ׁ̈j�j --------------------
	/**
	 * �e��ʂ̓o�^�{�^���Ǝq��ʂ̓o�^�{�^�����狤�ʂɌĂяo����鏈���ł��B
	 *
	 * @return (true:����I��  false:�ُ�I���j
	 */
	private boolean insert_rcv_process(AF0130010Struct adstruct, int j) throws BusinessProcessException, FoundationException, SQLException
	{
		// ���O�o�͏��i�[�p
		String logMessage = "";
		String message1 = "";
		List listMessage = new ArrayList();
		
		logMessage = "Control : insert_rcv_process"
					+ ", T_ISSUE_INST.ISSUE_INST_CD:" + adstruct.getISSUE_INST_CD();
		setSyslogConfig(logMessage);
		
		//�G���[�s�ԍ�
		String errorNumber =String.valueOf(j+1);
		//�Ɩ����b�Z�[�W�p�G���[�s�ԍ�
		String err_commt ="";

			//----------------------------------------------------------
			// �L���x���i�̏ꍇ�A�L���x������o�^
			//----------------------------------------------------------
			
		AF0130010Struct readStruct = new AF0130010Struct();
		List tpList = entity.mselect_T_ISSUE_INST1.read(conn, adstruct);
		if (!tpList.isEmpty()) {
	    readStruct = (AF0130010Struct)tpList.get(0);
	    //�o�Ɏw���̎x���敪��1(�L���x��)�̎�
			if ("1".equals(readStruct.getCONS_TYP())) {

				logMessage = "M_CONS_UNIT_COST.ITEM_CD:" +  readStruct.getITEM_CD()
							+ ", M_CONS_UNIT_COST.VEND_CD:" +  readStruct.getVEND_CD()
							+ ", M_CONS_UNIT_COST.COMPANY_CD:" +  readStruct.getCOMPANY_CD()
							+ ", T_ISSUE_INST.EFF_PHASE_IN_DATE:" + readStruct.getRCV_ISSUE_DATE();
				setSyslogConfig(logMessage);
				//�x���P���̎擾
				List tmpList = entity.mmselectM_COST.read(conn, adstruct);
				if(tmpList.size() <= 0) {
					readStruct.setUNIT_COST(new String("0"));
					readStruct.setUNIT_COST_TYP(new Integer(1));
				}
				else{
					AF0130010Struct workStruct = (AF0130010Struct)tmpList.get(0);
					logMessage = "M_CONS_UNIT_COST.ONEROUS_FLG:" +  workStruct.getONEROUS_FLG()
								+ ", M_CONS_UNIT_COST.UNIT_COST:" +  workStruct.getUNIT_COST()
								+ ", M_CONS_UNIT_COST.UNIT_COST_TYP:" +  workStruct.getUNIT_COST_TYP();
					setSyslogConfig(logMessage);
					// �x���P���̗L���t���O��1(�L��)�̎��A�L���P���Z�b�g
					if(("1").equals(workStruct.getONEROUS_FLG()) == true){
						readStruct.setUNIT_COST(workStruct.getUNIT_COST());
						readStruct.setUNIT_COST_TYP(workStruct.getUNIT_COST_TYP());
					}
					else{
						readStruct.setUNIT_COST(new String("0"));
						readStruct.setUNIT_COST_TYP(new Integer(1));
					}
				}

				// �L���x���ԍ��̔�
				String ctrlCd = null;

				try{
					Numbering MyNo = new Numbering(conn,CollectNumber.ONERCONS_CD,getSysUserCd(),getSysProgramId(),getSysPlantCd());
					ctrlCd = MyNo.getNo();

					if(ctrlCd == null || ctrlCd.length() == 0){
						// �̔Ԍ��ʂ��Ȃ�
						errCode = "AF00078";
						//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
						err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						return false;
					}
				}
				catch(FoundationException ex){
					// �o�^�������s�F�L���x���ԍ��̍̔ԂɎ��s���܂���
					
					errCode = "AF00078";
					//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
					err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
					writeLog(ERROR,errCode,err_commt);	
					_intErrorCount++;
					return false;
				}
				
				// �L���x���ԍ�
				readStruct.setONEROUS_CONS_NO(ctrlCd);
				// �o�ɐ�
				readStruct.setRCV_ISSUE_QTY(adstruct.getISSUE_QTY());
				//�o�ɓ�
				readStruct.setRCV_ISSUE_DATE(adstruct.getISSUE_DATE());
				// ����
				readStruct.setJOB_ODR_CD(adstruct.getJOB_ODR_CD());
				//���[�J���b�g�ԍ�
				readStruct.setVEND_LOT_NO(adstruct.getVEND_LOT_NO());
				// �ԕi��ۊǋ�R�[�h
				readStruct.setRETURNED_WH_CD("");
				// ���o�ɊǗ��ԍ�
				readStruct.setRCV_ISSUE_CTRL_CD(_ctrlCd);
				//�݌Ƀ��b�g�ԍ�
			    readStruct.setSTOCK_LOT_CD(adstruct.getLOT_NO());

				logMessage = "T_PAST_ONEROUS_CONS.ONEROUS_CONS_NO:" + readStruct.getONEROUS_CONS_NO()
							+ ",T_PAST_ONEROUS_CONS.JOB_ODR_CD:" + readStruct.getw_JOB_ODR_CD()
							+ ", T_PAST_ONEROUS_CONS.ITEM_CD:" + readStruct.getITEM_CD()
							+ ", T_PAST_ONEROUS_CONS.VEND_CD:" + readStruct.getVEND_CD()
							+ ", T_PAST_ONEROUS_CONS.ISSUE_DATE:" + readStruct.getRCV_ISSUE_DATE()
							+ ", T_PAST_ONEROUS_CONS.ISSUE_QTY:" + readStruct.gettmp_RCV_ISSUE_QTY();
				setSyslogConfig(logMessage);
				readStruct.setsUser_ID(getSysUserCd());
				// �L���x������o�^
				entity.minsertSub1T_PAST_ONEROUS_CONS.create(conn, readStruct);
			}
		  }
			if (readStruct.getRCV_WH_CD() != null && "".equals(readStruct.getRCV_WH_CD()) == false) {
			//----------------------------------------------------------
			// �ۊǋ�ʓ��o�Ɂi���Ɂj�o�^
			//----------------------------------------------------------
				// ���o�ɊǗ��ԍ��̔ԁi���Ɂj
				String ctrlCd = null;

				try{
					Numbering MyNo = new Numbering(conn,CollectNumber.ISSUE_CD,getSysUserCd(),getSysProgramId(),getSysPlantCd());
					ctrlCd = MyNo.getNo();

					if(ctrlCd == null || ctrlCd.length() == 0){
						// �̔Ԍ��ʂ��Ȃ�						
						errCode = "AF00057";
						//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
						err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						return false;
					}
				}
				catch(FoundationException ex){
					// �̔Ԍ��ʂ��Ȃ�					
					errCode = "AF00057";
					//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
					err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
					writeLog(ERROR,errCode,err_commt);	
					_intErrorCount++;
					return false;
				}

				// ���o�ɊǗ��ԍ�
				readStruct.setRCV_ISSUE_CTRL_CD(ctrlCd);
				// ���ɕۊǋ�
				readStruct.settmp_WH_CD(adstruct.getRCV_WH_CD());
				//����
				List mitemList =entity.mselect_LOT_CTRL_FLG.read(conn, readStruct);
				AF0130010Struct mitemStruct =(AF0130010Struct)mitemList.get(0);
				//�i�ڂ̕i�ڎ�z�敪�� 1�F���ԁA2�F�݌Ɉ����^���Ԃ̏ꍇ
				//[�o�Ɏw��].�g���ԁh ,��L�ȊO Null
				if(!"1".equals(mitemStruct.getMRP_ODR_TYP()) && 
						!"2".equals(mitemStruct.getMRP_ODR_TYP())){
					readStruct.setJOB_ODR_CD("");
				}
				else{
					readStruct.setJOB_ODR_CD(adstruct.getJOB_ODR_CD());
				}
				//���o�ɔN����
			    readStruct.setRCV_ISSUE_DATE(adstruct.getISSUE_DATE());
				// ���ɐ�
				readStruct.settmp_RCV_ISSUE_QTY(adstruct.getISSUE_QTY());
			    //���[�J���b�g�ԍ�
			    readStruct.setVEND_LOT_NO(adstruct.getVEND_LOT_NO());
			    //�݌Ƀ��b�g�ԍ�
			    readStruct.setw_STOCK_LOT_CD(adstruct.getLOT_NO());
			    
				// ���o�Ɋ����t���O
				readStruct.setRCV_ISSUE_CMPLT_FLG(adstruct.getISSUE_CMPLT_FLG());
				// ���o�ɋ敪�i1:���Ɂj
				readStruct.setRCV_ISSUE_TYP(new Integer(1));
				if ("0".equals(readStruct.getCONS_TYP())) {
					// ���o�ɔ����敪�i61:�H���݌ɓ��Ɂj
					readStruct.setRCV_ISSUE_GNR_TYP(new Integer(61));
				} else {
					// ���o�ɔ����敪�i81:�����݌ɓ��Ɂj
					readStruct.setRCV_ISSUE_GNR_TYP(new Integer(81));
				}
				// �݌ɍX�V�敪�i1:���j
				readStruct.setSTOCK_UPD_TYP(new Integer(1));
	            //��ЃR�[�h
				logMessage = "T_RCV_ISSUE.RCV_ISSUE_CTRL_CD:" + readStruct.getRCV_ISSUE_CTRL_CD()
							+ ", T_RCV_ISSUE.JOB_ODR_CD:" + readStruct.getw_JOB_ODR_CD()
							+ ", T_RCV_ISSUE.ITEM_CD:" + readStruct.getITEM_CD()
							+ ", T_RCV_ISSUE.WH_CD:" + readStruct.getWH_CD()
							+ ", T_RCV_ISSUE.RCV_ISSUE_DATE:" + readStruct.getRCV_ISSUE_DATE()
							+ ", T_RCV_ISSUE.RCV_ISSUE_QTY:" + readStruct.gettmp_RCV_ISSUE_QTY();
				setSyslogConfig(logMessage);
				
				//���[�U��
				readStruct.setsUser_ID(getSysUserCd());
				// [�o�Ɏw��]."����"��o�^���邽�߂̑ޔ�
				String saveJobOdrCd = readStruct.getw_JOB_ODR_CD();
				readStruct.setw_JOB_ODR_CD(readStruct.getJOB_ODR_CD());

				// �ۊǋ�ʓ��o�Ɂi���Ɂj�o�^
				entity.minsertSub1T_RCV_ISSUE.create(conn, readStruct);

				// �ޔ��������Ԃ�߂�
				struct.setw_JOB_ODR_CD(saveJobOdrCd);

				// [���ɏ���]�ďo��
				RcvProcess rcvPrc = new RcvProcess(conn, ctrlCd);
				try{
					if(rcvPrc.execProcess() == true){
						// �X�V�n�j
						logMessage = "Rcv Process was Complated!";
						setSyslogConfig(logMessage);
					}
					else {
						// �X�V�G���[
						logMessage = "Rcv Process was Failed...";
						setSyslogConfig(logMessage);
						return false;
					}
				} finally {
					// �X�V���ʃ��b�Z�[�W�\��
					logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
					
					for(int idx = 0; idx < rcvPrc.getErrorList().size(); idx++){
						message1 = message1 + "," + new ExpjMessage(rcvPrc.getErrorList().get(idx).toString());
					}
					if (!isNull(message1)) {
						message1 = message1.substring(1);						
						errCode = "ZZ01006";
						//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
						err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
					}
					message1 = "";
					for(int idx = 0; idx < rcvPrc.getWarnList().size(); idx++){
						message1 = message1 + "," + new ExpjMessage(rcvPrc.getWarnList().get(idx).toString());
					}
					if (!isNull(message1)) {
						message1 = message1.substring(1);
						errCode = "ZZ01006";
						//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
						err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
						writeLog(WARNING,errCode,err_commt);	
						_intWarningCount++;
					}
				}
			}	
			return true;
	}
	
	/**
	 * ���b�g�ʂɏo�ɂ��������A�o�Ɏ��і��ׂ֒ǉ�����B
	 *
	 */
	public boolean insertupTlotissueinst(AF0130010Struct adstruct, int k) throws  BusinessProcessException, FoundationException, SQLException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0130");
		logger.entering("AF0130010Control"+":USER="+getSysUserCd(),"insertupTlotissueinst");
			//{{user_implement_dev:<controlBrowse>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		// �o�Ɏ��і��ׂւ̓o�^
		// �o�ɐ����O�̏ꍇ�́A�o�^�E�X�V���s��Ȃ�
		  if (adstruct.getISSUE_QTY() != null 
				&& !"".equals(adstruct.getISSUE_QTY())
				&& Calculate.compare(adstruct.getISSUE_QTY(), "0") != 0) {
			  
			 AF0130010Struct readStruct = new AF0130010Struct();
			List tpList = entity.mselect_T_ISSUE_INST1.read(conn, adstruct);
			//  �f�[�^�����݂��Ȃ��ꍇ�o�^�A���݂���ꍇ�X�V
			List lockList = entity.mT_LOT_ISSUE_INST_Lock.read(conn, adstruct);
			if (lockList.size() <= 0) {
				readStruct=(AF0130010Struct)tpList.get(0);
				//�݌Ƀ��b�g�ԍ�
				readStruct.setLOT_NO(adstruct.getLOT_NO());
				//readStruct.setw_STOCK_LOT_CD(adstruct.getLOT_NO());
				//�o�Ɏ��ѐ���
				readStruct.setRCV_ISSUE_QTY((adstruct.getISSUE_QTY()));
				//�o�Ɏ��ѓ�
				readStruct.setRCV_ISSUE_DATE(adstruct.getISSUE_DATE());
				//���[�U��
				readStruct.setsUser_ID(getSysUserCd());
				//�o�^
				entity.mT_LOT_ISSUE_INST.create(conn, readStruct);

			} else {
				AF0130010Struct lockStruct = new AF0130010Struct();
				lockStruct = (AF0130010Struct)lockList.get(0);
				// �o�Ɏ��ѐ��ʂ̌v�Z
				//  [�o�Ɏ��і���]."�o�Ɏ��ѐ�" + ��ʁu�o�ɐ��v 
				String rcvIssueQty = "0";
				rcvIssueQty = Calculate.add(
						lockStruct.getISSUE_QTY(),
						adstruct.getISSUE_QTY());
				struct.setISSUE_QTY(rcvIssueQty);
				//�o�ɓ�
				struct.setRCV_ISSUE_DATE(adstruct.getISSUE_DATE());
				//�݌Ƀ��b�g�ԍ�
				struct.setLOT_NO(adstruct.getLOT_NO());
				//�o�Ɏw���ԍ�
				struct.setISSUE_INST_CD(adstruct.getISSUE_INST_CD());
				//���[�U��
				struct.setsUser_ID(getSysUserCd());
				
				entity.mT_LOT_ISSUE_INST.update(conn, struct);
			}
			
		}
		 // return true;
                //}}user_implement_dev:<controlBrowse>
		logger.exiting("AF0130010Control"+":USER="+getSysUserCd(),"insertupTlotissueinst");
		return true;

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
			m_med.setFUNCTION_NAME("SQLMANISSUEINSTINTERFACE");
			
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
			callList = m_med.getSQLMANISSUEINSTINTERFACE().call();
			// PL/SQL�̎��s���ʂ��擾
			medAF0130B001 resultMed = (medAF0130B001) callList.get(0);
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
			
			// [�}�j���A���o�Ɏ��ю捞]�̃f�[�^���擾
			
			List listTManIssueInstTemp = new ArrayList();
			listTManIssueInstTemp = selectTManIssueInstTemp();
			
			
			// [�}�j���A���o�Ɏ��ю捞]�̃f�[�^���擾����
			if (listTManIssueInstTemp != null) {
				//�}�X�^�������`�F�b�N���{
				if(check_listTManIssueInstTemp(listTManIssueInstTemp)){
	             // �o�^����
					if(insertCsvDate(listTManIssueInstTemp)) {
						// �I�����O
						writeLog(INFOMATION, "ZZ09002");
					}        
				}else {
					writeLog(INFOMATION, "ZZ09002");
					return BREAK;
				}	
			}
			
			
			
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
				
				// �����v��捞�̍폜
			    m_med.getdeleteT_MAN_ISSUE_INST_TEMP().delete();
				// �g�����U�N�V�����̊J�n
				conn.beginTransWeb();
			    conn.commit();
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
		try {
			entity = new AF0130010Entity();
		} catch (FoundationException e) {
			//TODO �ُ�I��
		}

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
		public medAF0130B001 m_med=null;

		/**
		 * �R���e�i�N���X�C���X�^���X
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medAF0130B001 med) throws BatchAppException
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
