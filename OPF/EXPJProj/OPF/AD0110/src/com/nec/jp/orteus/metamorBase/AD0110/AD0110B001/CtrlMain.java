/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0110/src/com/nec/jp/orteus/metamorBase/AD0110/AD0110B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0110.AD0110B001;

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
import java.math.BigDecimal;
import com.nec.jp.orteus.xaf.wa.BusinessProcessException;
import com.nec.jp.orteus.expj.businesslock.BusinessLock;
import com.nec.jp.orteus.expj.util.Converter;
import com.nec.jp.orteus.expj.util.ExpjException;
import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.expj.util.Calculate;
import com.nec.jp.orteus.expj.util.SystemInformation;
import com.nec.jp.orteus.expj.lot.BizCommon;
import com.nec.jp.orteus.expj.pr.rcvissue.process.RcvCancel;
import com.nec.jp.orteus.expj.pr.rcvissue.process.ValidateWh;
import com.nec.jp.orteus.expj.pr.rcvissue.process.WhAutoIssueProc;
import com.nec.jp.orteus.expj.pr.rcvissue.process.AutoIssue;
import com.nec.jp.orteus.metamorBase.AD0110.AD0110010Entity;
import com.nec.jp.orteus.metamorBase.AD0110.AD0110010Struct;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlStruct;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain �N���X
 * �t�@�C���E�N���X����
 * @author $Author: geng-jia $
 * @version $Revision: 1.3 $ $Date: 2015/12/22 10:04:34 $
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
	public medAD0110B001 m_med=null;

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
	public CtrlMain(medAD0110B001 med, BatchAppConductor cdr) throws BatchAppException
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
	public CtrlMain(medAD0110B001 med) throws BatchAppException
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

	//////////////////////////////
	/** ���O���x�� �C���t�H���[�V���� */
	private static final int INFOMATION = 0;
	/** ���O���x�� ���[�j���O */
	private static final int WARNING = 1;
	/** ���O���x�� �G���[ */
	private static final int ERROR = 2;

	/** �����ꍀ�ڎ擾�Ή� */
	private String _locale = null;
	ResourceBundle _resource = null;

	/** DB�R�l�N�V���� */
	private IDbConnection conn = null;

	/** �Ɩ����b�Z�[�W���O�pNumbering�N���X */
	private Numbering numbering = null;
	/** �Ɩ����b�Z�[�W���O�pBusinessMessageAccessor�N���X */
	private BusinessMessageAccessor businessMsgAcc = new BusinessMessageAccessor();
	/** �Ɩ����b�Z�[�W���O�pBusinessMessage�N���X */
	private BusinessMessage businessMsg = new BusinessMessage();

	/** �i�ڏ��i�[�p */
	AD0110010Struct itemStruct = new AD0110010Struct();
	/** ��Ǝ��эX�V�Ώ�Struct*/
	private AD0110010Struct rsltStruct = new AD0110010Struct();
	/** �i�ڕʎd�|�X�V�Ώ�Struct*/
	private AD0110010Struct procByItemStruct = new AD0110010Struct();
	/**AD0110 entity*/
	protected AD0110010Entity entity;

	/** �Ɩ����b�N�N���X */
	private BusinessLock lock = null;

	/** ���b�N���s�����b�N�L�[ */
	private static final int LOCK_FAILD = -1;

	/** �Ɩ��^�p��*/
	private String _btmBusinessOprDate;
	/** �݌Ƀ��b�g�ԍ�*/
	private String strLotNo = null;
	/** �o�������єԍ�*/
	private String strOutputRsldCd = null;
	/** ��ЃR�[�h*/
	private String _company_cd = null;

	/** ���t�����p */
	DateFormat _df = DateFormat.getDateInstance();

	/**�S�����R�[�h��**/
	private int _intTotalCount = 0;
	/**�G���[���R�[�h����**/
	private int _intErrorCount = 0;
	/**���[�j���O����**/
	private int _intWarningCount = 0;
	/**���탌�R�[�h����**/
	private int _intSuccessCount = 0;
	/**�G���[�R�[�h*/
	String errCode = null;
	private boolean warningFlg = false;

	/** �h���C�u���^�[�ϊ������� **/
	private String _strDriveLetterChangeCharBefore;
	/** �h���C�u���^�[�ϊ��敶�� **/
	private String _strDriveLetterChangeCharAfter;
	/** DB�T�[�o�� */
	private String _strDbServerName;
	/** DB�捞�t�H���_�p�X */
	private String _strCsvDbBackupPath;

	/**
	 * ���O�t�@�C���o��
	 * 
	 * @param logLevel
	 *            ���O���x��
	 * @param code
	 *            ���b�Z�[�W�R�[�h
	 * @param value
	 *            �u��������
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
		case INFOMATION:
			m_med.getSyslog().info(emsg, m_med.getUsername());
			break;
		case WARNING:
			m_med.getSyslog().warning(emsg, m_med.getUsername());
			break;
		case ERROR:
			m_med.getSyslog().severe(emsg, m_med.getUsername());
			break;
		}
	}

	/**
	 * ���O�t�@�C���o��
	 * 
	 * @param logLevel
	 *            ���O���x��
	 * @param code
	 *            ���b�Z�[�W�R�[�h
	 */
	private void writeLogFiles(int logLevel, String code) {
		writeLogFiles(logLevel, code, null);
	}

	/**
	 * ���ODB�o��
	 * 
	 * @param code
	 *            ���b�Z�[�W�R�[�h
	 * @param value
	 *            �u��������
	 * @param dataStr
	 *            �f�[�^�X�g�����O
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
	 * ���O�t�@�C���A���ODB�o�͂��s���܂��B
	 * 
	 * @param logLevel
	 *            ���O���x��
	 * @param code
	 *            ���b�Z�[�W�R�[�h
	 * @param value
	 *            �u��������
	 * @param dataStr
	 *            �f�[�^�X�g�����O
	 * @throws FoundationException
	 * @throws SQLException
	 */
	private void writeLog(int logLevel, String code, String value,
			String dataStr) throws FoundationException, SQLException {
		writeLogFiles(logLevel, code, value);
		if (!isNull(dataStr)) {
			writeLogFiles(logLevel, "ZZ01006", dataStr);
		}
		writeLogDB(code, value, dataStr);
	}

	/**
	 * ���O�t�@�C���A���ODB�o�͂��s���܂��B
	 * 
	 * @param logLevel
	 *            ���O���x��
	 * @param code
	 *            ���b�Z�[�W�R�[�h
	 * @param dataStr
	 *            �f�[�^�X�g�����O
	 * @throws FoundationException
	 * @throws SQLException
	 */
	private void writeLog(int logLevel, String code, String dataStr)
			throws FoundationException, SQLException {
		writeLogFiles(logLevel, code, null);
		if (!isNull(dataStr)) {
			writeLogFiles(logLevel, "ZZ01006", dataStr);
		}
		writeLogDB(code, null, dataStr);
	}

	/**
	 * ���O�t�@�C���A���ODB�o�͂��s���܂��B
	 * 
	 * @param logLevel
	 *            ���O���x��
	 * @param code
	 *            ���b�Z�[�W�R�[�h
	 * @throws FoundationException
	 * @throws SQLException
	 */
	private void writeLog(int logLevel, String code)
			throws FoundationException, SQLException {
		writeLog(logLevel, code, null, null);
	}

	/**
	 * �Ɩ����b�N���s���܂�
	 * 
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
	 * 
	 * @param lockCancelKey
	 *            ���b�N�L�����Z���L�[
	 * @return ���b�N����������true�A���s��false
	 * @throws FoundationException
	 */
	private boolean businessUnLock(int lockCancelKey)
			throws FoundationException {

		if (lockCancelKey == LOCK_FAILD) {
			return true;
		}
		boolean result = lock.doUnLock(m_med.getProgname(), lockCancelKey);
		conn.commit();
		return result;
	}

	/**
	 * �Ώۂ̕�����Null�i�󕶎����邢��Null�j�ł��邩�𔻒肵�܂��B
	 * 
	 * @param str
	 *            �Ώە�����
	 * @return Null�̏ꍇ��true�ANull�ł͂Ȃ��ꍇ��false
	 */
	private boolean isNull(String str) {
		if (str == null || str.length() == 0 || str.equalsIgnoreCase("null")) {
			return true;
		}
		return false;
	}

	/**
	 * �o�b�`�p�����[�^(����1) �o�b�`�����敪��Ԃ��܂��B
	 * 
	 * @return �o�b�`�����敪
	 */
	private String getSysBatchType() {
		return m_med.getArgs()[0];
	}

	/**
	 * �o�b�`�p�����[�^(����2)���[�UID��Ԃ��܂��B
	 * 
	 * @return ���[�UID
	 */
	private String getSysUserCd() {
		return m_med.getArgs()[1];
	}

	/**
	 * �o�b�`�p�����[�^(����3)�Ɩ�����Ԃ��܂��B
	 * 
	 * @return �Ɩ���
	 */
	private String getSysProgramId() {
		return m_med.getArgs()[2];
	}

	/**
	 * �o�b�`�p�����[�^(����4)�H��R�[�h��Ԃ��܂��B
	 * 
	 * @return �H��R�[�h
	 */
	private String getSysPlantCd() {
		return m_med.getArgs()[3];
	}

	/**
	 * �o�b�`�p�����[�^(5)CSV�捞������Ԃ��܂��B<br>
	 * 
	 * @return CSV�捞����
	 */
	private String getCsvTakeTyp() {
		if (isNull(m_med.getArgs()[4])) {
			return null;
		}
		return m_med.getArgs()[4];
	}

	/**
	 * �o�b�`�p�����[�^(6)�捞�p�X��Ԃ��܂��B<br>
	 * 
	 * @return �捞�p�X
	 */
	private String getCsvTakePath() {
		if (isNull(m_med.getArgs()[5])) {
			return null;
		}
		return m_med.getArgs()[5];
	}

	/**
	 * �o�b�`�p�����[�^(7)�o�b�N�A�b�v�t�H���_�p�X��Ԃ��܂��B<br>
	 * 
	 * @return �o�b�N�A�b�v�t�H���_�p�X
	 */
	private String getCsvBackupPath() {
		if (isNull(m_med.getArgs()[6])) {
			return null;
		}
		return m_med.getArgs()[6];
	}

	/**
	 * �o�b�`�p�����[�^�̃`�F�b�N���s���܂��B
	 * 
	 * @return ����̏ꍇtrue�A�s���̏ꍇfalse
	 * @throws BatchAppException
	 */
	private boolean checkArgs() throws BatchAppException {
		// �o�b�`�p�����[�^�̌`�����s���ȏꍇ
		if (m_med.getArgs().length < 5 || m_med.getArgs().length > 7) {
			writeLogFiles(ERROR, "ZZ09022");
			return false;
		}

		// �o�b�`�����敪��Null�̏ꍇ
		if (isNull(getSysBatchType())) {
			writeLogFiles(ERROR, "ZZ09023");
			return false;
		}

		// �o�b�`�����敪���P�A�Q�ȊO�̏ꍇ
		if ((!"1".equals(getSysBatchType()) && !"2".equals(getSysBatchType()))) {
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

		// �Ɩ�����Null�̏ꍇ
		if (isNull(getSysProgramId())) {
			writeLogFiles(ERROR, "ZZ09029");
			return false;
		}

		// CSV�捞������1�F�Œ�t�@�C���捞�A2�F�w��t�@�C���捞 �ȊO�̏ꍇ
		if (!"1".equals(getCsvTakeTyp()) && !"2".equals(getCsvTakeTyp())) {
			writeLogFiles(ERROR, "AD60038");
			return false;
		}

		// CSV�捞������2�F�w��t�@�C���捞 ����
		if ("2".equals(getCsvTakeTyp())) {
			// �捞�p�X��NULL�̏ꍇ
			if (isNull(getCsvTakePath())) {
				writeLogFiles(ERROR, "AD60039");
				return false;
			}

			// �o�b�N�A�b�v�t�H���_�p�X��NULL�̏ꍇ
			if (isNull(getCsvBackupPath())) {
				writeLogFiles(ERROR, "AD60040");
				return false;
			}
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
		m_med.getSYS_CLASS_CODE().read();
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
			_strDriveLetterChangeCharBefore = m_med.getCODE();
			_strDriveLetterChangeCharAfter = m_med.getCODE2();
		}
		// [�敪�R�[�h]���uDB�T�[�o���v���擾����B
		m_med.setSYS_CLASS("PRODUCTION");
		m_med.setCLASS_CODE("DB_SERVER_NAME");
		
		// [�敪�R�[�h]�̌������s
		m_med.getSYS_CLASS_CODE().read();
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
		if ("2".equals(getCsvTakeTyp())) {
			_strCsvDbBackupPath = "\\\\" + _strDbServerName + "\\" + getCsvBackupPath().replaceAll(_strDriveLetterChangeCharBefore, _strDriveLetterChangeCharAfter);
			File csvDbBackupFile = new File(_strCsvDbBackupPath);
			if (!csvDbBackupFile.isDirectory()) {
				strResultMessage[0] = "AD60043";
				String[] strArray = _strCsvDbBackupPath.split("\\\\");
				strResultMessage[1] = "�o�b�N�A�b�v�t�H���_�p�X�F" + strArray[2] + "/" +strArray[3];
				return strResultMessage;
			}
		}
		
		return strResultMessage;
	}

	/**
	 * �o�������ю捞�f�[�^�擾
	 * @return	outputRsltList     �o�������ю捞���X�g
	 * @throws BatchAppException 
	 * @throws SQLException 
	 * @throws FoundationException 
	 */
	private List selectTOutputRsltTemp() throws BatchAppException, SQLException {
		List rtnList = new ArrayList();
		AD0110010Struct structdata = null;
		m_med.getT_OUTPUT_RSLT_TEMP().read();
		while(m_med.getT_OUTPUT_RSLT_TEMP().next()) {
			structdata = new AD0110010Struct();
			structdata.setPLANT_CD(m_med.getPLANT_CD());
			structdata.setITEM_CD(m_med.getITEM_CD());
			structdata.setWS_CD(m_med.getWS_CD());
			structdata.setOPR_DATE(m_med.getOPR_DATE());
			structdata.setWH_CD(m_med.getWH_CD());
			if (isNull(structdata.getWH_CD())) {
				structdata.setWH_CD(ValidateWh.getDefaultOprWh(conn, structdata.getPLANT_CD(),structdata.getITEM_CD()));
			}
			structdata.setACPT_QTY(m_med.getACPT_QTY());
			structdata.setDEFECT_QTY(m_med.getDEFECT_QTY());
			structdata.setDEFECT_CAUSE_CD(m_med.getDEFECT_CAUSE_CD());
			structdata.setDEFECT_COMMENT(m_med.getDEFECT_COMMENT());
			structdata.setOUTPUT_RSLT_PERSON(m_med.getOUTPUT_RSLT_PERSON());
			structdata.setOPR_TIME_UNIT_TYP(m_med.getOPR_TIME_UNIT_TYP());
			structdata.setOPR_TIME(m_med.getOPR_TIME());
			structdata.setVEND_LOT_NO(m_med.getVEND_LOT_NO());
			structdata.setLOT_NO(m_med.getLOT_NO());
			structdata.setPRE_ARRANGEMENT_TIME(m_med.getPRE_ARRANGEMENT_TIME());
			structdata.setPOST_ARRANGEMENT_TIME(m_med.getPOST_ARRANGEMENT_TIME());
			structdata.setCESSATION_TIME(m_med.getCESSATION_TIME());
			structdata.setCESSATION_CAUSE(m_med.getCESSATION_CAUSE());
			structdata.setOUTPUT_RSLT_COMMENT(m_med.getOUTPUT_RSLT_COMMENT());

			rtnList.add(structdata);
		}
		return rtnList;
	}

	/**
	 * ��Ɠ��ƑΏ۔N���̔�r
	 * ���ی����̒��߂��������Ă�����t�ł̎��т̓o�^��s�Ƃ���
	 * @param  oprDate ��Ɠ�
	 * @return ����:true ��Ɠ��̔N�����Ώ۔N�����ߋ��̏ꍇ:false
	 * @throws BatchAppException 
	 */
	private boolean chkProcExecDate(String oprDate) throws BusinessProcessException, FoundationException, BatchAppException {
		// �Ώ۔N��
		String procExecDate = null;

		m_med.getSYS_PARAMETER().read();
		if (m_med.getSYS_PARAMETER().next()) {
			// �u�V�X�e���p�����[�^�v�D�ݒ�l=�gfalse�h�̏ꍇ
			if ("false".equals(m_med.getPAST_RESULT_ENTRY_TYP())) {
				// [���ی����Ǘ��p�����[�^].�g�Ώ۔N���h�擾
				m_med.setPLANT_CD(getSysPlantCd());
				m_med.getSYS_ACTUAL_COST_CTRL_AC().read();
				if (m_med.getSYS_ACTUAL_COST_CTRL_AC().next()) {
					procExecDate = m_med.getPROC_EXEC_DATE();
				}
				if (!isNull(procExecDate)) {
					// �u��Ɠ��v�̔N�� �iYYYY/MM�j��[���ی����Ǘ��p�����[�^].�g�Ώ۔N���h���ߋ��̏ꍇ
					if (oprDate.compareTo(procExecDate) < 0) {
						return false;
					}
				}
			}
		}
		return true;
	}

	/**
	 * �o�������ю捞�f�[�^�̃}�X�^�������`�F�b�N
	 * @param dateList
	 * @return
	 * @throws BusinessProcessException
	 * @throws FoundationException
	 */
	private boolean check_listTOutputRsltTemp(List dataList) throws Exception {
		// �S�����R�[�h��
		_intTotalCount = dataList.size();
		AD0110010Struct dataStruct = new AD0110010Struct();
		AD0110010Struct tempStruct = new AD0110010Struct();;
		// �G���[�s�ԍ�
		String errorNumber = "";
		// �Ɩ����b�Z�[�W�p�G���[�s�ԍ�
		String err_commt ="";
		// ����t���O
		boolean result = true;
		// ��Ɠ�
		String oprDateTemp = null;
		try {
			for (int i = 0; i < dataList.size(); i++) {
				dataStruct = (AD0110010Struct)dataList.get(i);
				// �s�ԍ���ݒ�
				errorNumber = String.valueOf(i + 1);
				// ��Ɠ���ݒ�
				oprDateTemp = Converter.dateToStr(_df.parse(dataStruct.getOPR_DATE()), "yyyy/MM/dd");
				warningFlg = false;

				// ���ی����̒��߂��������Ă�����t�ꍇ
				if (!chkProcExecDate(oprDateTemp)) {
					errCode = "AE00160";
					//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
					err_commt = "(SBM0381)CSV�s�ԍ� = [" + errorNumber + "]";
					writeLog(ERROR, errCode, err_commt);
					_intErrorCount++;
					continue;
				}

				// �u�i�ڔԍ��v �ɓ��͂��ꂽ�l�� [�i��] �ɑ��݂��Ȃ��ꍇ
				List itemCdList = entity.mselectItem_CD.read(conn, dataStruct);
				if (itemCdList.isEmpty()) {
					errCode = "AD00019";
					//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
					err_commt = "(SBM0381)CSV�s�ԍ� = [" + errorNumber + "]";
					writeLog(ERROR, errCode, err_commt);
					_intErrorCount++;
					continue;
				} else {
					// �擾�����f�[�^���i�[
					itemStruct = (AD0110010Struct)itemCdList.get(0);
					dataStruct.setLOT_CTRL_FLG(itemStruct.getLOT_CTRL_FLG());
				}

				// [�i�ڕʎd�|].�g�i�ڔԍ��h �� �u�i�ڔԍ��v ���A
				// [�i�ڕʎd�|].�g��Ǝ��ы敪�h �� 1�F�o�������� ���A
				// [�i�ڕʎd�|].�g�i�ڕʍ�Ə�ԋ敪�h �� 2�F�w���ς� ����
				// [�i�ڕʎd�|].�g�H��R�[�h�h �� �u�H��R�[�h�v����
				// �f�[�^1�������݂��Ȃ��ꍇ
				result = entity.mcheckT_WORK_IN_PROC_BY_ITEM.check(conn, dataStruct);
				if (!result) {
					errCode = "ZZ06001";
					//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
					err_commt = "(SBM0381)CSV�s�ԍ� = [" + errorNumber + "]";
					writeLog(ERROR, errCode, err_commt);
					_intErrorCount++;
					continue;
				}

				// �u��Ƌ�R�[�h�v�ɓ��͂��ꂽ�l�� [��Ƌ�] �ɑ��݂��Ȃ��ꍇ
				List wsCdList = entity.mselectM_WS.read(conn, dataStruct);
				if (wsCdList.isEmpty()) {
					errCode = "AD20029";
					//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
					err_commt = "(SBM0381)CSV�s�ԍ� = [" + errorNumber + "]";
					writeLog(ERROR, errCode, err_commt);
					_intErrorCount++;
					continue;
				} else {
					// �u��Ƌ�R�[�h�v�ɑ΂���H��R�[�h�Ɓu�H��R�[�h�v����v���Ȃ��ꍇ
					tempStruct = (AD0110010Struct)wsCdList.get(0);
					if (!dataStruct.getPLANT_CD().equals(tempStruct.getvc2PLANT_CD())) {
						errCode = "AD00004";
						//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
						err_commt = "(SBM0381)CSV�s�ԍ� = [" + errorNumber + "]";
						writeLog(ERROR, errCode, err_commt);
						_intErrorCount++;
						continue;
					}
				}

				if (!isNull(dataStruct.getWH_CD())) {
					// �u�ۊǋ�R�[�h�v �ɓ��͂��ꂽ�l�� [�ۊǋ�] �ɑ��݂��Ȃ��ꍇ
					List whCdList = entity.mselectM_WH.read(conn, dataStruct);
					if (whCdList.isEmpty()) {
						errCode = "AD00020";
						//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
						err_commt = "(SBM0381)CSV�s�ԍ� = [" + errorNumber + "]";
						writeLog(ERROR, errCode, err_commt);
						_intErrorCount++;
						continue;
					} else {
						// �u�ۊǋ�R�[�h�v�̍H��R�[�h�Ɓu�H��R�[�h�v����v���Ȃ��ꍇ
						tempStruct = (AD0110010Struct)whCdList.get(0);
						if (!dataStruct.getPLANT_CD().equals(tempStruct.getvc2PLANT_CD())) {
							errCode = "AA01007";
							//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
							err_commt = "(SBM0381)CSV�s�ԍ� = [" + errorNumber + "]";
							writeLog(ERROR, errCode, err_commt);
							_intErrorCount++;
							continue;
						}
					}
				}

				// �Ɩ��^�p���擾
				DateCtrlStruct dateCtrl = DateCtrlControl.getData(conn,  getSysPlantCd());
				_btmBusinessOprDate = dateCtrl.getBUSINESS_OPR_DATE();

				// �u��Ɠ��v�� ������(�Ɩ��^�p����薢��) ����͂��ꂽ�ꍇ
				if (oprDateTemp.compareTo(_btmBusinessOprDate) > 0) {
					errCode = "AD30773";
					//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
					err_commt = "(SBM0381)CSV�s�ԍ� = [" + errorNumber + "]";
					writeLog(ERROR, errCode, err_commt);
					_intErrorCount++;
					continue;
				}

				// �u�Ǖi���v > 0�A���A
				// [�i��].�h���b�g�Ǘ��t���O�h��1�F���b�g�Ǘ����s���A���A
				// [�i��].�h���b�g�ԍ��̔ԋ敪�h��0�F����́A���A
				// �u�݌Ƀ��b�g�ԍ��v�������͂̏ꍇ
				if (Calculate.compare(dataStruct.getACPT_QTY(), "0") > 0) {
					// [�i��].�h���b�g�Ǘ��t���O�h��1�F���b�g�Ǘ����s��
					if ("1".equals(itemStruct.getLOT_CTRL_FLG()) && "0".equals(itemStruct.getLOT_NUMBERING_TYP())) {
						// �u�݌Ƀ��b�g�ԍ��v��������
						if (isNull(dataStruct.getLOT_NO())) {
							errCode = "AE20600";
							//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
							err_commt = "(SBM0381)CSV�s�ԍ� = [" + errorNumber + "]";
							writeLog(ERROR, errCode, err_commt);
							_intErrorCount++;
							continue;
						}
					}
				}

				// [�i��].�h���b�g�Ǘ��t���O�h��1�F���b�g�Ǘ����s��
				if ("1".equals(itemStruct.getLOT_CTRL_FLG())) {
					if ("0".equals(itemStruct.getLOT_NUMBERING_TYP())) {
						// [�i��].�h���b�g�ԍ��̔ԋ敪�h��0�F����́A���A�u�݌Ƀ��b�g�ԍ��v��[���b�g�Ǘ�]�ɑ��݂��Ȃ��ꍇ
						if (!isNull(dataStruct.getLOT_NO())) {
							List lotCtrlList = entity.mselectT_LOT_CTRL.read(conn, dataStruct);
							if (lotCtrlList.isEmpty()) {
								errCode = "AE21203";
								//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
								err_commt = "(SBM0381)CSV�s�ԍ� = [" + errorNumber + "]";
								writeLog(ERROR, errCode, err_commt);
								_intErrorCount++;
								continue;
							}
						}
					}
				} else {
					// [�i��].�h���b�g�Ǘ��t���O�h��1�F���b�g�Ǘ����s���@���A�u�݌Ƀ��b�g�ԍ��v�����͂���Ă���ꍇ
					if (!isNull(dataStruct.getLOT_NO())) {
						errCode = "AE20601";
						//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
						err_commt = "(SBM0381)CSV�s�ԍ� = [" + errorNumber + "]";
						writeLog(ERROR, errCode, err_commt);
						_intErrorCount++;
						continue;
					}
				}

				// �u�Ǖi���v �� 0�A���A�u�݌Ƀ��b�g�ԍ��v�����͂���Ă���ꍇ
				if (Calculate.compare(dataStruct.getACPT_QTY(), "0") == 0) {
					if (!isNull(dataStruct.getLOT_NO())) {
						errCode = "AD20139";
						//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
						err_commt = "(SBM0381)CSV�s�ԍ� = [" + errorNumber + "]";
						writeLog(ERROR, errCode, err_commt);
						_intErrorCount++;
						continue;
					}
				}

				// �u�s�Ǘ��R�R�[�h�v��Null ���A�u�s�ǐ��v > 0 �̏ꍇ
				if (isNull(dataStruct.getDEFECT_CAUSE_CD())) {
					if (Calculate.compare(dataStruct.getDEFECT_QTY(), "0") > 0) {
						errCode = "AE05039";
						//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
						err_commt = "(SBM0381)CSV�s�ԍ� = [" + errorNumber + "]";
						writeLog(ERROR, errCode, err_commt);
						_intErrorCount++;
						continue;
					}
				} else {
					// �u�s�Ǘ��R�R�[�h�v��Null ���A�u�s�ǐ��v = 0
					if (Calculate.compare(dataStruct.getDEFECT_QTY(), "0") == 0) {
						// �����Ǘ��i�ڂ̏ꍇ
						if ("1".equals(itemStruct.getUNIT_QTY_TYP())) {
							errCode = "AE05033";
							//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
							err_commt = "(SBM0381)CSV�s�ԍ� = [" + errorNumber + "]";
							writeLog(ERROR, errCode, err_commt);
							_intErrorCount++;
							continue;
						} else if ("2".equals(itemStruct.getUNIT_QTY_TYP())) {
							// �����Ǘ��i�ڂ̏ꍇ
							errCode = "AE05032";
							//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
							err_commt = "(SBM0381)CSV�s�ԍ� = [" + errorNumber + "]";
							writeLog(ERROR, errCode, err_commt);
							_intErrorCount++;
							continue;
						}
					}
				}

				// �u��ƒS���҃R�[�h�v�����͂��ꂽ�ꍇ
				if (!isNull(dataStruct.getOUTPUT_RSLT_PERSON())) {
					tempStruct = new AD0110010Struct();
					tempStruct.setUSER_CD(dataStruct.getOUTPUT_RSLT_PERSON());
					List userCdList = entity.mselectUSER_MST.read(conn, tempStruct);

					// �u��ƒS���҃R�[�h�v��[���[�U�[�}�X�^] �ɑ��݂��Ȃ��ꍇ
					if (userCdList.isEmpty()) {
						errCode = "AD34032";
						//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
						err_commt = "(SBM0381)CSV�s�ԍ� = [" + errorNumber + "]";
						writeLog(ERROR, errCode, err_commt);
						_intErrorCount++;
						continue;
					} else {
						tempStruct = (AD0110010Struct)userCdList.get(0);
						// �u��ƒS���҃R�[�h�v�̍H��R�[�h �� �u�H��R�[�h�v�̏ꍇ
						if (!dataStruct.getPLANT_CD().equals(tempStruct.getvc2PLANT_CD())) {
							errCode = "AD34029";
							//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
							err_commt = "(SBM0381)CSV�s�ԍ� = [" + errorNumber + "]";
							writeLog(ERROR, errCode, err_commt);
							_intErrorCount++;
							continue;
						}
					}
				}

				// �Œx�[���̃I�[�_���擾�ł��Ȃ������ꍇ
				List lastList = entity.mSelectTargetProcByItem1.read(conn, dataStruct);
				if (lastList.isEmpty()) {
					List lastDateList = entity.mSelectCompleteProcByItem1.read(conn, dataStruct);
					if (lastDateList.isEmpty()) {
						errCode = "AD34027";
						//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
						err_commt = "(SBM0381)CSV�s�ԍ� = [" + errorNumber + "]";
						writeLog(ERROR, errCode, err_commt);
						_intErrorCount++;
						continue;
					}
				}

				// �����Ǘ��i�ڂŁu�Ǖi���v�܂��́u�s�ǐ��v�ɏ��������͂��ꂽ�ꍇ
				if (!isNull(itemStruct.getUNIT_QTY_TYP()) && "1".equals(itemStruct.getUNIT_QTY_TYP())) {
					//�Ǖi���ɏ��������͂��ꂽ�ꍇ
					if (Calculate.isNumeric(dataStruct.getACPT_QTY())) {
						errCode = "AD00087";
						//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
						err_commt = "(SBM0381)CSV�s�ԍ� = [" + errorNumber + "]";
						writeLog(WARNING, errCode, err_commt);
						if (!warningFlg) {
							_intWarningCount++;
							warningFlg = true;
						}
						// �����_�ȉ��͐؂�̂Ă�
						dataStruct.setACPT_QTY(Calculate.floor(dataStruct.getACPT_QTY(), 0));
					}
					// �s�ǐ��ɏ��������͂��ꂽ�ꍇ
					if (Calculate.isNumeric(dataStruct.getDEFECT_QTY())) {
						errCode = "AD00087";
						//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
						err_commt = "(SBM0381)CSV�s�ԍ� = [" + errorNumber + "]";
						writeLog(WARNING, errCode, err_commt);
						if (!warningFlg) {
							_intWarningCount++;
							warningFlg = true;
						}
						// �����_�ȉ��͐؂�̂Ă�
						dataStruct.setDEFECT_QTY(Calculate.floor(dataStruct.getDEFECT_QTY(), 0));
					}
				}
			}

			if (_intErrorCount > 0) {
				return false;
			} else {
				return true;
			}
		} catch (Exception e) {
			conn.rollback();
			throw new ExpjException(e);
		}
	}

	/**
	 * CSV�t�@�C���i�o�������ю捞�j�̓��e��o�^
	 * @param csvList
	 * @return
	 * @throws FoundationException 
	 */
	private void insertCsvDate(List csvList) throws FoundationException, ExpjException {
		try {
			boolean rtnFlg = true;
			conn.beginTransWeb();
			// �S�����R�[�h��
			_intTotalCount = csvList.size();
			//�@�o�^����
			_intSuccessCount = 0;
			// �o�������ѓo�^�������J�n���܂����B
			writeLog(INFOMATION, "AD00244");
			for (int i = 0; i < csvList.size(); i++) {
				AD0110010Struct cvsStruct = (AD0110010Struct)csvList.get(i);
				// �o�������ѓo�^����
				rtnFlg = insertToutputRlsd (cvsStruct, i);
				if(!rtnFlg) {
					conn.rollback();
					// �o�������ѓo�^�������ُ�I�����܂����B
					writeLog(INFOMATION, "AD00246");
					return;
				}
				// ��Ǝ��ѓo�^���� 
				rtnFlg = insertTOprRslt (cvsStruct, i);
				if(!rtnFlg) {
					conn.rollback();
					// �o�������ѓo�^�������ُ�I�����܂����B
					writeLog(INFOMATION, "AD00246");
					return;
				}
			}

			// �o�^����������ɏI�������ꍇ
			_intSuccessCount = csvList.size();
			String succCommt = "(SBM0638)�Ǎ������@=�@[" + _intTotalCount + "] "
					+ "�o�^�����@=�@[" + _intSuccessCount + "] "
					+ "�G���[�����@=�@[0]";
			// �o�������ѓo�^�����𐳏�ɏI�����܂����B
			writeLog(INFOMATION, "AD00245", succCommt);	

			conn.commit();
		} catch (Exception e) {
			conn.rollback();
			throw new ExpjException(e);
		}
	}

	/**
	 * CSV�t�F�C�����e�́A�o�������ѓo�^����
	 * @param csvList
	 * @return
	 * @throws FoundationException 
	 */
	private boolean insertToutputRlsd (AD0110010Struct adstruct, int j) throws ExpjException {
		try {
			// �݌Ƀ��b�g�ԍ��̔ԏ������s���B
			// [�i��]�D�h���b�g�Ǘ��t���O�h�� 1�F���b�g�Ǘ����s�� �A���A[�i��]�D�h���b�g�ԍ��̔ԋ敪�h�� 0:����́A���A
			if ("1".equals(itemStruct.getLOT_CTRL_FLG()) && !"0".equals(itemStruct.getLOT_NUMBERING_TYP())){
				// �u�Ǖi���v > 0�A���A��݌Ƀ��b�g�ԍ�� ��Null
				if (Calculate.compare(adstruct.getACPT_QTY(), "0") > 0 && isNull(adstruct.getLOT_NO())) {
					// �݌Ƀ��b�g�ԍ��̎����̔Ԃ��s���B
					BizCommon bc = new BizCommon(conn, getSysUserCd(), getSysProgramId(), getSysPlantCd());
					List retList = bc.getsetLotNumberingFd(adstruct.getITEM_CD(), adstruct.getOPR_DATE());

					// ����I���̏ꍇ
					if (bc.getResultStatus().intValue() == 1) {
						// �݌Ƀ��b�g�ԍ��̎擾
						if (retList != null && retList.size() > 0) {
							strLotNo = (String) retList.get(0);
						}
						// �x�� or �ُ�I���̏ꍇ
					} else {
						// �G���[���b�Z�[�W�̎擾
						if (retList != null && retList.size() > 1) {
							errCode = (String) retList.get(1);
							writeLog(ERROR, errCode);
							return false;
						}
					}
				} else {
					strLotNo = adstruct.getLOT_NO();
				}
			} else {
				strLotNo = adstruct.getLOT_NO();
			}

			// �o�������єԍ��̎����̔�
			Numbering collectNum = 
					new Numbering(conn,
							CollectNumber.OUT_RSLT_CD,
							getSysUserCd(),
							getSysProgramId(),
							adstruct.getPLANT_CD());
			strOutputRsldCd = collectNum.getNo();
			if (isNull(strOutputRsldCd)) {
				// �̔Ԍ��ʂ��Ȃ�
				errCode = "ZZ01106";
				writeLog(ERROR, errCode);
				return false;
			}
			// �o�������єԍ���ݒ肷��B
			adstruct.setOUTPUT_RSLT_CD(strOutputRsldCd);
			// �݌Ƀ��b�g�ԍ�
			adstruct.setLOT_NO(strLotNo);
			adstruct.setsUser_ID(getSysUserCd());
			// [�o��������]�ւ̒ǉ����e
			entity.minsertT_OUTPUT_RSLT.create(conn, adstruct);
			return true;
		} catch (Exception e) {
			throw new ExpjException(e);
		}
	}

	/**
	 * CSV�t�F�C�����e�́A��Ǝ��ѓo�^����
	 * @param csvList
	 * @return
	 * @throws FoundationException 
	 */
	private boolean insertTOprRslt (AD0110010Struct adstruct, int m) throws ExpjException {
		try {
			List targetProcByItemList = entity.mSelectTargetProcByItem.read(conn, adstruct);
			if (targetProcByItemList.isEmpty()) {

				// �i�ڕʎd�|���Z�b�g����
				procByItemStruct = new AD0110010Struct();
				procByItemStruct = (AD0110010Struct)entity.mSelectCompleteProcByItem.read(conn,adstruct).get(0);
				procByItemStruct.setsUser_ID(getSysUserCd());

				rsltStruct = new AD0110010Struct();
				rsltStruct.setsUser_ID(getSysUserCd());
				// ��Ǝw���ԍ�
				rsltStruct.setOPR_INST_CD(procByItemStruct.getvc2OPR_INST_CD());

				// �ő啪��񐔁{�P�̃Z�b�g
				List partialPrdNoList = entity.mselectMaxPrdNo.read(conn, rsltStruct);
				AD0110010Struct partialPrdNoStruct = new AD0110010Struct();
				if (!partialPrdNoList.isEmpty()) {
					partialPrdNoStruct = (AD0110010Struct)partialPrdNoList.get(0);
				}
				// �����
				rsltStruct.setPARTIAL_PRD_NO(partialPrdNoStruct.getMAX_PRD_NO());
				// �ۊǋ�R�[�h
				rsltStruct.setWH_CD(adstruct.getWH_CD());
				// �o�������єԍ�
				rsltStruct.setOUTPUT_RSLT_CD(strOutputRsldCd);
				// �݌Ƀ��b�g�ԍ�
				rsltStruct.setLOT_NO(strLotNo);
				// �i�ڔԍ�
				rsltStruct.setITEM_CD(adstruct.getITEM_CD());
				// ��Ƌ�R�[�h
				rsltStruct.setWS_CD(adstruct.getWS_CD());
				// �Ǖi��
				rsltStruct.setACPT_QTY(adstruct.getACPT_QTY());
				// �s�ǐ�
				rsltStruct.setDEFECT_QTY(adstruct.getDEFECT_QTY());
				// ��Ɠ�
				rsltStruct.setOPR_DATE(adstruct.getOPR_DATE());
				// �H��R�[�h
				rsltStruct.setPLANT_CD(adstruct.getPLANT_CD());
				// ��ƒ�����
				rsltStruct.setOPR_CRCT_NO("0");

				// [��Ǝ���]�̒ǉ����s��
				entity.minsertT_OPR_RSLT.create(conn, rsltStruct);

				AD0110010Struct updateWorkInProcByitemStruct = new AD0110010Struct();
				updateWorkInProcByitemStruct.setsUser_ID(getSysUserCd());
				// ��ƌv��ԍ�
				updateWorkInProcByitemStruct.setWORK_ODR_CD(procByItemStruct.getvc2WORK_ODR_CD());
				// ��Ǝw���ԍ�
				updateWorkInProcByitemStruct.setOPR_INST_CD(procByItemStruct.getvc2OPR_INST_CD());

				// ����Ǝw���ԍ����̍Œx��Ɠ��̎擾�i[��Ǝ���]."��Ǝ��э�Ɠ�"�j
				List lastDateList = entity.mselectLastDate.read(conn, updateWorkInProcByitemStruct);
				AD0110010Struct lastDateStruct = new AD0110010Struct();
				if (lastDateList.isEmpty()) {
					errCode = "ZZ01101";
					writeLog(ERROR, errCode);
					return false;
				} else {
					lastDateStruct = (AD0110010Struct)lastDateList.get(0);
				}

				// �i�ڕʎd�|������
				updateWorkInProcByitemStruct.setdateOPR_DATE(lastDateStruct.getMAX_OPR_DATE());

				// [�i�ڕʎd�|]�̍X�V���s��
				entity.mupdateT_WORK_IN_PROC_BY_ITEM.update(conn, updateWorkInProcByitemStruct);

				//���ʕ��i�̎����o�ɏ���
				String sFLG = "1";	//��Ɗ���
				boolean result = true;
				//���ʕ��i���A�o�Ɍ^�������o�ɂ̕��i���o�ɏ���
				result = callCommonIssue(adstruct, sFLG, adstruct.getPLANT_CD(), m);
				if (result == false) {
					return result;
				}
				//��ʕ��i���ɏ���
				//���ɏ����i�ۊǋ�ʓ��o�ɒǉ������ɏ����j
				result = callRcvCancel(adstruct, sFLG, adstruct.getPLANT_CD(), m);
				if (result == false) {
					return result;
				}
			} else {

				// �Ǖi��
				BigDecimal AcptQty = new BigDecimal(adstruct.getACPT_QTY());
				// ���ьv�オ�K�v�ȗǕi�̎c��
				BigDecimal TempAcptQty = new BigDecimal(adstruct.getACPT_QTY());
				// �s�ǐ�
				BigDecimal DefectQty = new BigDecimal(adstruct.getDEFECT_QTY());
				// ���ьv�オ�K�v�ȕs�ǂ̎c��
				BigDecimal TempDefectQty = new BigDecimal(adstruct.getDEFECT_QTY());
				// �Ǖi���{�s�ǐ�
				BigDecimal TotalQty = new BigDecimal("0");
				TotalQty = AcptQty.add(DefectQty);
				// ���ьv��Ώۂ̕i�ڕʎd�|�̍�Ǝw����
				BigDecimal TargetOprInstQty = new BigDecimal("0");
				// ���ьv��Ώۂ̕i�ڕʎd�|�̍�Ǝw���ԍ�������Ǝ��т�SUM(�Ǖi��+�s�ǐ�)
				BigDecimal SumOprRsltQty = new BigDecimal("0");	
				// ���ьv��Ώۂ̕i�ڕʎd�|�Ɏ��ьv��ł���c��
				BigDecimal TempOprInstQty = new BigDecimal("0");
				// ���ьv�オ�K�v�ȗǕi�c���{�s�ǎc��
				BigDecimal TempSumOprRsltQty = new BigDecimal("0");

				int i = 0 ;
				int ExitFlg = 0 ;		 //while�����o���t���OOFF
				int CompleteFlg = 0 ;	 //�i�ڕʎd�|�����t���OOFF

				while ( i < targetProcByItemList.size() && ExitFlg == 0 ) {

					//�Ώەi�ڕʎd�|���Z�b�g
					procByItemStruct = (AD0110010Struct)targetProcByItemList.get(i);
					procByItemStruct.setsUser_ID(getSysUserCd());

					//�Ώۃ��R�[�h�̍�Ǝw�������Z�b�g
					TargetOprInstQty = new BigDecimal(procByItemStruct.getOPR_INST_QTY());

					//�Ώەi�ڕʎd�|�̍�Ǝw���ԍ��Ɠ���̍�Ǝ��т�SUM(�Ǖi���{�s�ǐ�)�擾
					List sumOprRsltQtyList = entity.mselectSumOprRsltQty.read(conn, procByItemStruct);
					if (sumOprRsltQtyList.isEmpty()) {
						//��Ǝ��т��������߁ASUM(�Ǖi��+�s�ǐ�)��ZERO�Ƃ���
						SumOprRsltQty = new BigDecimal("0");
					} else {
						//�i�ڕʎd�|���Z�b�g����
						AD0110010Struct tempStruct = (AD0110010Struct)sumOprRsltQtyList.get(0);
						SumOprRsltQty = new BigDecimal(tempStruct.getSUM_OPR_RSLT_QTY());
					}

					// ��Ǝw���������ѐ����傫���ꍇ�̂ݎc�w�����v�Z���s���B
					if (TargetOprInstQty.doubleValue() > SumOprRsltQty.doubleValue()){
						//��Ǝw����-SUM(�Ǖi��+�s�ǐ�)
						TempOprInstQty = TargetOprInstQty.subtract(SumOprRsltQty );
					};

					// ���ьv�オ�K�v�Ȑ����Z�o
					TempSumOprRsltQty = TempAcptQty.add(TempDefectQty);

					if ( TempSumOprRsltQty.doubleValue() > 0 ) {
						if ( TempOprInstQty.doubleValue() <= TempSumOprRsltQty.doubleValue() ) {
							//��Ǝw���c���������ьv�オ�K�v�Ȑ��̏ꍇ�F�i�ڕʎd�|����

							if ( i + 1 == targetProcByItemList.size() ) {
								//�i�ڕʎd�|�Ō��1���ł���Ύc����S�Čv�シ��
								rsltStruct.setACPT_QTY(TempAcptQty.toString());	//�Ǖi��
								rsltStruct.setDEFECT_QTY(TempDefectQty.toString());//�s�ǐ�
								TempAcptQty	= new BigDecimal("0");		//�Ǖi�c��ZERO
								TempDefectQty  = new BigDecimal("0");	//�s�ǎc��ZERO
								TempOprInstQty = new BigDecimal("0");	//���юc��ZERO
								CompleteFlg = 1 ;						//�i�ڕʎd�|�����t���OON
							} else {
								//����ȊO�͕i�ڕʎd�|�Ɍv��ł��镪�����v�シ��
								if ( TempOprInstQty.doubleValue() <= TempAcptQty.doubleValue() ) {

									rsltStruct.setACPT_QTY(
											TempOprInstQty.toString());		//�Ǖi��
									rsltStruct.setDEFECT_QTY("0.0");	//�s�ǐ�
									TempAcptQty = 
											TempAcptQty.subtract(TempOprInstQty);//�Ǖi�c��
									CompleteFlg = 1 ;	//�i�ڕʎd�|�����t���OON
								} else {
									//�s�ǂ��g��
									if ( TempAcptQty.doubleValue() > 0 ) {
										//�Ǖi�{�s�ǐ��ŏ�������
										rsltStruct.setACPT_QTY(TempAcptQty.toString());
										TempOprInstQty = TempOprInstQty.subtract(TempAcptQty);
										rsltStruct.setDEFECT_QTY(TempOprInstQty.toString());
										TempDefectQty =  TempDefectQty.subtract(TempOprInstQty);
										TempAcptQty = new BigDecimal("0");	//�Ǖi�c��ZERO
										CompleteFlg = 1 ;	//�i�ڕʎd�|�����t���OON
									} else {
									//�s�ǐ������ŏ�������
										rsltStruct.setACPT_QTY("0.0");
										rsltStruct.setDEFECT_QTY(TempOprInstQty.toString());
										TempDefectQty =  TempDefectQty.subtract(TempOprInstQty);
										TempAcptQty = new BigDecimal("0");	//�Ǖi�c��ZERO
										CompleteFlg = 1 ;	//�i�ڕʎd�|�����t���OON
									}
								}
							}
						} else {
							//�i�ڕʎd�|���������̏ꍇ
							rsltStruct.setACPT_QTY(TempAcptQty.toString());
							rsltStruct.setDEFECT_QTY(TempDefectQty.toString());
							TempAcptQty   = new BigDecimal("0");	//�Ǖi�c��ZERO
							TempDefectQty = new BigDecimal("0");	//�s�ǎc��ZERO
							ExitFlg=1;  //while�����o���t���OON
						}

						//��Ǝ��т̓o�^����
						rsltStruct.setsUser_ID(getSysUserCd());
						rsltStruct.setOPR_INST_CD(procByItemStruct.getOPR_INST_CD());//��Ǝw���ԍ�

						//�ő啪��񐔁{�P�̃Z�b�g
						List maxPrdNoList = entity.mselectMaxPrdNo.read(conn, rsltStruct);

						//�������ʂ͕K������
						AD0110010Struct maxPrdNoStruct = (AD0110010Struct)maxPrdNoList.get(0);

						rsltStruct.setPARTIAL_PRD_NO(maxPrdNoStruct.getMAX_PRD_NO());//�����
						rsltStruct.setITEM_CD(adstruct.getITEM_CD());//�i�ڔԍ�
						rsltStruct.setWS_CD(adstruct.getWS_CD());	//��Ƌ�R�[�h
						rsltStruct.setOPR_DATE(adstruct.getOPR_DATE());//��Ɠ�
						rsltStruct.setWH_CD(adstruct.getWH_CD());	//�ۊǋ�R�[�h
						rsltStruct.setOUTPUT_RSLT_CD(strOutputRsldCd);//�o�������єԍ�
						rsltStruct.setPLANT_CD(adstruct.getPLANT_CD());//�H��R�[�h
						rsltStruct.setLOT_NO(strLotNo);//�݌Ƀ��b�g�ԍ�
						rsltStruct.setVEND_LOT_NO(adstruct.getVEND_LOT_NO());//���[�J���b�g�ԍ�
						rsltStruct.setOPR_CRCT_NO("0");				//��ƒ�����

						//��Ǝ��т̓o�^
						entity.minsertT_OPR_RSLT.create(conn, rsltStruct);
						String sFLG = "0";	//�����l�Z�b�g�i��Ɩ������j
						//��Ǝw�������̎��т��v�コ��Ă���Εi�ڕʎd�|���X�V����
						if ( CompleteFlg == 1 ) {
							AD0110010Struct completeStruct = new AD0110010Struct();
							completeStruct.setsUser_ID(getSysUserCd());
							completeStruct.setWORK_ODR_CD(procByItemStruct.getvc2WORK_ODR_CD());
							completeStruct.setOPR_INST_CD(rsltStruct.getOPR_INST_CD());

							//����Ǝw���ԍ����̍Œx��Ɠ��̎擾�i[��Ǝ���]."��Ǝ��э�Ɠ�"�j
							List lastdist = entity.mselectLastDate.read(conn, completeStruct);
							if (lastdist.isEmpty()) {
								errCode = "ZZ01101";
								writeLog(ERROR, errCode);
								return false;
							}
							AD0110010Struct tempStruct = (AD0110010Struct)lastdist.get(0);
							completeStruct.setdateOPR_DATE(tempStruct.getMAX_OPR_DATE());

							entity.mupdateT_WORK_IN_PROC_BY_ITEM.update(conn, completeStruct);
							sFLG = "1";	//��Ɗ���
						}

						//���ʕ��i�̎����o�ɏ���
						boolean result = true;
						//���ʕ��i���A�o�Ɍ^�������o�ɂ̕��i���o�ɏ���
						result = this.callCommonIssue(adstruct, sFLG, adstruct.getPLANT_CD(), m);
						if(result == false){
							return result;
						}
						//��ʕ��i���ɏ���
						//���ɏ����i�ۊǋ�ʓ��o�ɒǉ������ɏ����j
						result = this.callRcvCancel(adstruct, sFLG, adstruct.getPLANT_CD(), m);
						if(result == false){
							return result;
						}

						CompleteFlg=0 ;	 //�i�ڕʎd�|�����t���O�ēxOFF
						i = i + 1 ;
					} else {
						//���ьv�オ�K�v�Ȑ����O�ȉ��Ȃ̂Ŏ��ьv��͍s��Ȃ�
						ExitFlg=1;  //while�����o���t���OON
					}
				}
			}
			// �o�������єԍ�
			adstruct.setOUTPUT_RSLT_CD(strOutputRsldCd);

			//�}�j���A���o�� �L�b�g�o�ɏ���
			boolean result = this.callManiaruIssue(adstruct, adstruct.getPLANT_CD(),m);
			if(result == false){
				return false;
			}
			//���b�g�Ǘ��t���O = 1(���b�g�g���[�X�Ǘ����s���B)�̏ꍇ
			if("1".equals(itemStruct.getLOT_CTRL_FLG())){
				//�݌Ƀ��b�g�ԍ���Null�łȂ��ꍇ
				if(adstruct.getLOT_NO() != null && !"".equals(adstruct.getLOT_NO())){
					//���b�g�Ǘ��e�[�u���X�V
					entity.mT_LOT_CTRL.update(conn,adstruct);
				}
			}
			return true;
		}catch(Exception e) {
			throw new ExpjException(e);
		}
	}

	/**
	 * �����o�ɂ��Ăяo���܂��B
	 * @param sFLG ��Ɗ����t���O(0:��Ɩ����� 1:��Ɗ���)
	 * @throws SQLException
	 * @throws Exception
	 */
	private boolean callCommonIssue(AD0110010Struct parStruct, String sFLG, String plantCD, int m) 
			throws SQLException, Exception {

		//�����o�ɌĂяo��
		BigDecimal bdQty = new BigDecimal("0");
		if (rsltStruct.getACPT_QTY() != null) {
			bdQty = new BigDecimal(rsltStruct.getACPT_QTY());
		}
		if (rsltStruct.getDEFECT_QTY() != null) {
			bdQty = bdQty.add(new BigDecimal(rsltStruct.getDEFECT_QTY()));
		}
		if (isNull(rsltStruct.getOPR_CRCT_NO())) {
			rsltStruct.setOPR_CRCT_NO("0");
		}

		/********************
		 * �����o�ɏ����J�n *
		 *******************/
		WhAutoIssueProc whAutoIssueProc = new WhAutoIssueProc(conn,
				plantCD,
				getSysUserCd(),
				getSysProgramId());
		WhAutoIssueProc.AutoIssueParam autoIssueParam = whAutoIssueProc.new AutoIssueParam();

		// �p�����[�^�̃Z�b�g
		autoIssueParam.m_WORK_ODR_CD = procByItemStruct.getvc2WORK_ODR_CD();
		autoIssueParam.m_WORK_IN_PROC_CD = "";
		autoIssueParam.m_PARTIAL_PRD_NO = Integer.parseInt(rsltStruct.getPARTIAL_PRD_NO());
		autoIssueParam.m_OPR_RSLT_CRCT_NO = Integer.parseInt(rsltStruct.getOPR_CRCT_NO());
		autoIssueParam.m_PUCH_ODR_CD = "";
		autoIssueParam.m_ACPT_NO = 0;
		autoIssueParam.m_ACPT_RSLT_CRCT_NO = 0;
		autoIssueParam.m_RCV_ISSUE_TYP = 2;
		autoIssueParam.m_RCV_ISSUE_DATE = rsltStruct.getOPR_DATE();
		autoIssueParam.m_RCV_ISSUE_RSLT_NO = bdQty.toString();
		autoIssueParam.m_RCV_ISSUE_CMPLT_FLG = Integer.parseInt(sFLG);
		autoIssueParam.m_PLANT_CD = plantCD;

		AutoIssue autoIssue = new AutoIssue(conn,
				plantCD, getSysUserCd(), getSysProgramId());

		// �����o�Ɏ��s
		boolean result = autoIssue.AutoIssueOpr(autoIssueParam);

		String message1 = "";
		if (result) {
			// �Ɩ��A���[��������Ώo�͂���B
			// �Ɩ��G���[�̏o��
			for (int n = 0; n < autoIssue.getWarnList().size(); n++) {
				message1 = message1 + "," + new ExpjMessage(autoIssue.getWarnList().get(n).toString()).getMessage(_locale);
			}
			if (!isNull(message1)) {
				message1 = message1.substring(1);
				errCode = "ZZ01006";
				writeLog(WARNING, errCode, message1);
				if (!warningFlg) {
					_intWarningCount++;
					warningFlg = true;
				}
			}

			return result;
		} else {
			// �Ɩ��G���[�̏o��
			for (int n = 0; n < autoIssue.getErrorList().size(); n++) {
				message1 = message1 + "," + new ExpjMessage(autoIssue.getErrorList().get(n).toString()).getMessage(_locale);
			}
			if (!isNull(message1)) {
				message1 = message1.substring(1);
				errCode = "ZZ01006";
				writeLog(ERROR, errCode, message1);
			}
		}
		return result;
	}

	/**
	 * ���ɏ������Ăяo���܂��B
	 * @param sFLG ��Ɗ����t���O(0:��Ɩ����� 1:��Ɗ���)
	 * @throws Exception
	 */
	private boolean callRcvCancel(AD0110010Struct parStruct, String sFLG, String plantCD, int m)
			throws Exception {

		//���o�ɊǗ��ԍ��̔�
		Numbering collectNum = 
				new Numbering(conn,
					CollectNumber.ISSUE_CD,
					getSysUserCd(),
					getSysProgramId(),
					plantCD);
		String no = collectNum.getNo();
		if (no == null || no.length() == 0) {
			//�̔Ԍ��ʂ��Ȃ�
			errCode = "AE00152";
			writeLog(ERROR, errCode);
			return false;
		}
		AD0110010Struct rcvIssueStruct = new AD0110010Struct();
		rcvIssueStruct.setsUser_ID(getSysUserCd());

		rcvIssueStruct.setRCV_ISSUE_CTRL_CD(no);				//���o�ɊǗ��ԍ�
		rcvIssueStruct.setRCV_ISSUE_TYP("1");					//���o�ɋ敪
		rcvIssueStruct.setITEM_CD(rsltStruct.getITEM_CD());		//�i�ڔԍ�
		rcvIssueStruct.setPLANT_CD(plantCD);					//�H��R�[�h
		rcvIssueStruct.setWH_CD(rsltStruct.getWH_CD());			//�ۊǋ�R�[�h
		rcvIssueStruct.setJOB_ODR_CD(null);						//����
		rcvIssueStruct.setJOB_ODR_DETAIL_NO("0");				//���Ԏ}��
		rcvIssueStruct.setPUCH_ODR_CD(null);					//�����ԍ�
		rcvIssueStruct.setACPT_NO("0");							//�����
		rcvIssueStruct.setACPT_RSLT_CRCT_NO("0");				//������ђ�����
		rcvIssueStruct.setINSPEC_RSLT_CRCT_NO("0");				//�������ђ�����

		rcvIssueStruct.setWORK_ODR_CD(procByItemStruct.getvc2WORK_ODR_CD());//��ƌv��ԍ�
		rcvIssueStruct.setWORK_IN_PROC_CD(null);							//�d�|��ƃR�[�h
		rcvIssueStruct.setPARTIAL_PRD_NO(rsltStruct.getPARTIAL_PRD_NO());//�����
		rcvIssueStruct.setOPR_RSLT_CRCT_NO(rsltStruct.getOPR_CRCT_NO());//��Ǝ��ђ�����
		rcvIssueStruct.seth_ISSUE_INST_CD(null);						//�o�Ɏw���ԍ�
		rcvIssueStruct.setRCV_ISSUE_QTY(rsltStruct.getACPT_QTY());		//���o�ɐ�
		rcvIssueStruct.setRCV_ISSUE_AMOUNT("0");						//���o�ɋ��z
		rcvIssueStruct.setRCV_ISSUE_DATE(rsltStruct.getOPR_DATE());		//���o�ɔN����
		rcvIssueStruct.setRCV_ISSUE_GNR_TYP("11");						//���o�ɔ����敪
		rcvIssueStruct.setRCV_ISSUE_ODD_QTY("0");				//���o�ɒ[��
		rcvIssueStruct.setDEFECT_CAUSE_CD(null);				//���o�ɕs�Ǘ��R�R�[�h
		rcvIssueStruct.setSTOCK_UPD_TYP("1");					//�݌ɍX�V�敪
		rcvIssueStruct.setRCV_ISSUE_CMPLT_FLG(sFLG);			//���o�Ɋ����t���O

		rcvIssueStruct.setOD_NO(procByItemStruct.getOD_NO());	//�I�[�_�f�}���h�ԍ�
		rcvIssueStruct.setLOT_NO(rsltStruct.getLOT_NO());		//�݌Ƀ��b�g�ԍ�
		rcvIssueStruct.setVEND_LOT_NO(null);					//���[�J���b�g�ԍ�
		rcvIssueStruct.setRCV_ISSUE_COMMENT(null);				//���o�ɔ��l
		rcvIssueStruct.setCONS_TYP("0");						//�x���敪
		rcvIssueStruct.setCOMPANY_CD(null);

		// �ޔ�p�莝���݌ɐ���������
		rcvIssueStruct.setSAVE_STOCK_ON_HAND_QTY("0");

		//���ɏ���
		RcvCancel RCan = 
				new RcvCancel(conn, rcvIssueStruct.getRCV_ISSUE_CTRL_CD(), getSysUserCd());

		//��ЃR�[�h
		rcvIssueStruct.setCOMPANY_CD(_company_cd);

		//�ۊǋ�ʓ��o�ɓo�^
		entity.minsertT_RCV_ISSUE.create(conn, rcvIssueStruct);
		boolean bRSLT = RCan.execProcess();

		String message1 = "";
		if (!bRSLT) {
			for (int n = 0; n < RCan.getErrorList().size(); n++) {
				message1 = message1 + "," + new ExpjMessage(RCan.getErrorList().get(n).toString()).getMessage(_locale);
			}
			if (!isNull(message1)) {
				message1 = message1.substring(1);
				errCode = "ZZ01006";
				writeLog(ERROR, errCode, message1);
				return false;
			}
		}
		return true;
	}

	/**
	 * �}�j���A���o�ɃL�b�g�o�ɂ��Ăяo���܂��B
	 * @param sFLG ��Ɗ����t���O(0:��Ɩ����� 1:��Ɗ���)
	 * @throws SQLException
	 * @throws Exception
	 */
	private boolean callManiaruIssue(AD0110010Struct parStruct, String plantCD, int m)
	throws SQLException, Exception {
		boolean result=true;
		List UpdateAllList;
		///�o�������ь���
		AD0110010Struct selectStruct = new AD0110010Struct();
		List selectList = entity.mselectT_OUTPUT_RSLT.read(conn, parStruct);
		if (!selectList.isEmpty()) {
			selectStruct = (AD0110010Struct)selectList.get(0);
		}
		selectStruct.setsUser_ID(getSysUserCd());
		//�o�������єԍ��ݒ�
		selectStruct.setOUTPUT_RSLT_CD(parStruct.getOUTPUT_RSLT_CD());

		//�o�Ɏw�����X�g�擾
		UpdateAllList = entity.mselectIssue.read(conn, selectStruct);

		parStruct.setvc2PLANT_CD(parStruct.getPLANT_CD());
		//�o�Ɏw�����X�g��ݒ�
		result = this.setIssueList(UpdateAllList, parStruct);
		if(result == false){
			return result;
		}

		for (int i = 0; i < UpdateAllList.size(); i++ ) {

			AD0110010Struct issueStruct = new AD0110010Struct();
			issueStruct = (AD0110010Struct)UpdateAllList.get(i);
			issueStruct.setsUser_ID(getSysUserCd());

			issueStruct.setPARTIAL_PRD_NO("0");		//ZERO���Z�b�g����
			issueStruct.setJOB_ODR_CD(null);		//���ԕi�ڂ͏����ΏۊO�Ƃ���

			if (issueStruct.getTEMP_USE_QTY() == null 
					|| Double.parseDouble(issueStruct.getTEMP_USE_QTY()) == 0) {
				continue;	//�X�V�g�p���ʂ�ZERO�̈׈ȉ��̏����͍s�킸�A���̍s�Ɉڂ�
			}

			// �o�������єԍ��̎����̔�
			Numbering collectNum = 
				new Numbering(conn,
						CollectNumber.ISSUE_CD,
						getSysUserCd(),
						getSysProgramId(),
						plantCD);

			String no = collectNum.getNo();
			if (no == null || no.length() == 0) {
				//�̔Ԍ��ʂ��Ȃ�
				errCode = "AE00152";
				writeLog(ERROR, errCode);
				return false;
			}

			BigDecimal keepUseQty = new BigDecimal(issueStruct.getTEMP_USE_QTY());
			BigDecimal useQty = new BigDecimal(issueStruct.getTEMP_USE_QTY());
			if (issueStruct.getl_UNIT_QTY_TYP() != null 
					&& "1".equals(issueStruct.getl_UNIT_QTY_TYP())) {
				//�i�ڂ������Ǘ��i�̏ꍇ�A�؏グ���s��
				useQty = useQty.setScale(0,BigDecimal.ROUND_UP);
			}
			//�C�����e��ێ�
			issueStruct.setRCV_ISSUE_CTRL_CD(no);
			issueStruct.setPLANT_CD(plantCD);
			//�o�������єԍ�
			issueStruct.setWORK_ODR_CD(parStruct.getOUTPUT_RSLT_CD());
			issueStruct.setWORK_IN_PROC_CD(null);

			issueStruct.setRCV_ISSUE_QTY(useQty.negate().toString());
			if (useQty.doubleValue() > 0) {
				//�H���݌ɏo��
				issueStruct.setRCV_ISSUE_GNR_TYP("51");
			} else {
				//�H���݌ɏo�Ɏ��
				issueStruct.setRCV_ISSUE_GNR_TYP("59");
			}

			issueStruct.setRCV_ISSUE_ODD_QTY(useQty.subtract(keepUseQty).toString());
			issueStruct.setOD_NO(null);
			issueStruct.setRCV_ISSUE_CMPLT_FLG("0");
			issueStruct.setSTOCK_UPD_TYP("2");
			issueStruct.setRCV_ISSUE_TYP("2");

			useQty = new BigDecimal(issueStruct.getTEMP_USE_QTY());
			BigDecimal stockQty = null;
			//�H���d�|�݌ɏo�ɏ���
			//�ۊǋ�ʕi�ڍ݌ɍX�V
			List tempList = new ArrayList();
			AD0110010Struct tempStruct= new AD0110010Struct();
			tempList = entity.mselectItemStock.read(conn, issueStruct);
			AD0110010Struct stockStruct = new AD0110010Struct();
			stockStruct.setStructM(issueStruct);
			stockStruct.setsUser_ID(getSysUserCd());
			// �ޔ�p�莝���݌ɐ���������
			issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");

			if (tempList.isEmpty()) {
				//�o�^
				useQty = useQty.negate();
				stockStruct.setSTOCK_ON_HAND_QTY(useQty.toString());

				entity.minsertItemStock.create(conn, stockStruct);
			} else {
				//�X�V
				tempStruct = new AD0110010Struct();
				tempStruct = (AD0110010Struct)tempList.get(0);
				stockStruct.setsUser_ID(getSysUserCd());
				issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
				stockQty = new BigDecimal(tempStruct.getSTOCK_ON_HAND_QTY());
				if (useQty.doubleValue() > 0) { //�o��
					useQty = stockQty.subtract(useQty);
				} else { //����
					useQty = stockQty.add(useQty.negate());
				}
				stockStruct.setSTOCK_ON_HAND_QTY(useQty.toString());

				entity.mupdateItemStock.update(conn, stockStruct);
			}

			issueStruct.setJOB_ODR_CD(null);			//����
			issueStruct.setJOB_ODR_DETAIL_NO("0");		//���Ԏ}��
			issueStruct.setACPT_NO("0");				//�����
			issueStruct.setACPT_RSLT_CRCT_NO("0");		//������ђ�����
			issueStruct.setINSPEC_RSLT_CRCT_NO("0");	//�������ђ�����
			issueStruct.setOPR_RSLT_CRCT_NO("0");		//��Ǝ��ђ�����
			issueStruct.setRCV_ISSUE_AMOUNT("0");		//���o�ɋ��z
			issueStruct.setCONS_TYP("0");				//�x���敪
			//��ЃR�[�h
			issueStruct.setCOMPANY_CD(_company_cd);

			// ���b�g�Ǘ��t���O = 1(���b�g���[�X�Ǘ����s���B)�̏ꍇ
			if("1".equals(issueStruct.getLOT_CTRL_FLG())){
				issueStruct.setOUTPUT_RSLT_CD(parStruct.getOUTPUT_RSLT_CD());//�o�������єԍ�
				issueStruct.setOPR_DATE(parStruct.getOPR_DATE());

				//�o�Ɏ��і��׎擾
				List lotIssueList = entity.mselectT_LOT_ISSUE_INST.read(conn,issueStruct);

				//�f�[�^���Ȃ��ꍇ
				if (lotIssueList == null || lotIssueList.size() == 0) {
					errCode = "AD20135";
					writeLog(ERROR, errCode);
					return false;
				}

				//�g�p�c���ݒ�
				BigDecimal remainQty = new BigDecimal(issueStruct.getTEMP_USE_QTY());

				AD0110010Struct lotUseStruct = new AD0110010Struct();
				lotUseStruct.setStructM(issueStruct);
				lotUseStruct.setsUser_ID(getSysUserCd());

				for (int j = 0; j < lotIssueList.size(); j++ ) {
					AD0110010Struct lotIssueStruct = (AD0110010Struct)lotIssueList.get(j);

					//�������ĉ\���ݒ�
					BigDecimal issueQty = new BigDecimal(lotIssueStruct.getISSUE_QTY());//�o�Ɏ��ѐ���
					BigDecimal spentQty = new BigDecimal(lotIssueStruct.getSPENT_QTY());//�g�p��
					BigDecimal availQty = issueQty.subtract(spentQty);

					//���b�g�ʎg�p���ъǗ��ԍ��̔�
					List seqList = entity.mSEQ_JF_RSLT.read(conn, parStruct);
					if(seqList != null && seqList.size() > 0){
						lotUseStruct.setRSLT_CTL_SEQ_NO(((AD0110010Struct)seqList.get(0)).getNEXTVAL());
					}

					//�o�Ɏw���ԍ��A���b�g�ԍ��ݒ�
					lotUseStruct.seth_ISSUE_INST_CD(lotIssueStruct.geth_ISSUE_INST_CD());
					lotUseStruct.setLOT_NO(lotIssueStruct.getLOT_NO());

					BigDecimal useLotQty = null;

					//�������ĉ\�� >= �g�p�c���̏ꍇ
					if(availQty.doubleValue() >= remainQty.doubleValue()){
						//�g�p�c�����������Đ��ɐݒ�
						useLotQty = remainQty;
					//�������ĉ\�� < �g�p�c���̏ꍇ
					} else {
						//�ŏI�f�[�^�̏ꍇ
						if (j == lotIssueList.size() - 1) {
							//�g�p�c�����g�p���ɐݒ�
							useLotQty = remainQty;
						//�ŏI�f�[�^�łȂ��ꍇ
						} else {
							//�����\����0���傫���ꍇ
							if(availQty.doubleValue() > 0){
								//�g�p�c�����g�p���ɐݒ�
								useLotQty = remainQty;

								//�����R�[�h�ȍ~���擾
								for (int k = j + 1; k < lotIssueList.size(); k++ ) {
									AD0110010Struct nextLotIssueStruct = (AD0110010Struct)lotIssueList.get(k);

									//�������ĉ\���ݒ�
									BigDecimal nextIssueQty = new BigDecimal(nextLotIssueStruct.getISSUE_QTY());
									BigDecimal nextSpentQty = new BigDecimal(nextLotIssueStruct.getSPENT_QTY());
									BigDecimal nextAvailQty = nextIssueQty.subtract(nextSpentQty);

									//�����R�[�h�ȍ~�Ɉ����\�ȃf�[�^������ꍇ
									if (nextAvailQty.doubleValue() > 0) {
										//�������ĉ\�����g�p���ɐݒ�
										useLotQty = availQty;
										break;
									}
								}
							//�����\����0�ȉ��̏ꍇ
							} else {
								//���̃f�[�^���擾
								continue;
							}
						}
					}

					//�g�p���������\�����傫���ꍇ
					if(useLotQty.doubleValue() > availQty.doubleValue()){
						//�x�����b�Z�[�W�o��
						errCode = "AD20136";
						writeLog(WARNING, errCode);
						if(!warningFlg){
							warningFlg = true;
						}
					}

					//�g�p�ϐ��ʁA�g�p�\�萔�ʂɏ�L�Őݒ肵���g�p����ݒ�
					lotUseStruct.setTOTAL_ISSUE_QTY(useLotQty.toString());
					lotUseStruct.setSUPPLIED_ISSUE_QTY(useLotQty.toString());

					//���ѓ����g�p���ɐݒ�
					lotUseStruct.setSUPPLIED_DATE(lotUseStruct.getOPR_DATE());

					//[���b�g�ʎg�p����]�̒ǉ�
					entity.mT_LOT_USE_RSLT.create(conn, lotUseStruct);

					//[�o�Ɏ��і���]�̍X�V
					lotUseStruct.setSPENT_QTY(spentQty.add(useLotQty).toString());
					entity.mT_LOT_ISSUE_INST.update(conn, lotUseStruct);

					issueStruct.setLOT_NO(lotIssueStruct.getLOT_NO());
					issueStruct.setRCV_ISSUE_QTY(useLotQty.negate().toString());

					//���b�g�ʕi�ڍ݌Ɍ���
					tempList = entity.mT_LOT_STOCK.read(conn,issueStruct);

					//�X�V�O�̍݌ɐ��ݒ�
					if (tempList.isEmpty()) {
						issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
					} else {
						tempStruct = (AD0110010Struct)tempList.get(0);
						issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
					}

					//2���ڈȍ~�̃f�[�^�̏ꍇ
					if (j > 0) {
						//���o�ɊǗ��ԍ��̔�
						collectNum = 
							new Numbering(conn,
									CollectNumber.ISSUE_CD,
									getSysUserCd(),
									getSysProgramId(),
									plantCD);
						no = collectNum.getNo();
						if (no == null || no.length() == 0) {
							//�̔Ԍ��ʂ��Ȃ�
							errCode = "AE00152";
							writeLog(ERROR, errCode);
							return false;
						}
						issueStruct.setRCV_ISSUE_CTRL_CD(no);
					}

					//�ۊǋ�ʓ��o�ɓo�^
					entity.minsertT_RCV_ISSUE.create(conn, issueStruct);

					//���b�g�ʕi�ڍ݌ɍX�V
					BizCommon bc = new BizCommon(conn, getSysUserCd(), getSysProgramId(), plantCD);
					List updateLotStockList = bc.excUpdateLotStockFd(no, "");

					//�ُ�I���̏ꍇ
					if(bc.getResultStatus().intValue() == 3){
						//�G���[���b�Z�[�W�擾
						if(updateLotStockList != null && updateLotStockList.size() > 0){
							errCode = (String)updateLotStockList.get(0);
							writeLog(ERROR, errCode);
						}
						return false;
					}

					//���b�g�Ǘ��t���O = 1(���b�g�g���[�X�Ǘ����s���B)�̏ꍇ
					if("1".equals(parStruct.getLOT_CTRL_FLG())){
						//�e�i�ڂ̍݌Ƀ��b�g�ԍ����w�肳��Ă���ꍇ
						if(parStruct.getLOT_NO() != null && !"".equals(parStruct.getLOT_NO())){
							//���b�g�g���[�X�o�^�E�X�V����
							List lotTraceList = bc.excMakeLotTraceFd(issueStruct.getITEM_CD(),
								issueStruct.getLOT_NO(), parStruct.getITEM_CD(), parStruct.getLOT_NO(),
								"3");
							
							//����I���̏ꍇ
							if(bc.getResultStatus().intValue() == 1){
								AD0110010Struct updateStruct = new AD0110010Struct();
								updateStruct.setFROM_ITEM_CD(issueStruct.getITEM_CD());
								updateStruct.setFROM_LOT_NO(issueStruct.getLOT_NO());
								updateStruct.setTO_ITEM_CD(parStruct.getITEM_CD());
								updateStruct.setTO_LOT_NO(parStruct.getLOT_NO());
								updateStruct.setTO_PUCH_ODR_CD(null);
								updateStruct.setsUser_ID(getSysUserCd());
								
								// �������ԍ����擾����
								List fromPuchOdrNoList = entity.mgetFROM_PUCH_ODR_CD.read(conn, updateStruct);
								if (fromPuchOdrNoList != null && fromPuchOdrNoList.size() > 0) {
									AD0110010Struct puchStruct = (AD0110010Struct)fromPuchOdrNoList.get(0);
									updateStruct.setFROM_PUCH_ODR_CD(puchStruct.getFROM_PUCH_ODR_CD());
								} else {
									updateStruct.setFROM_PUCH_ODR_CD(null);
								}
								entity.mupdateT_LOT_TRACE.update(conn, updateStruct);
							}

							//�ُ�I���̏ꍇ
							if(bc.getResultStatus().intValue() == 3){
								//�G���[���b�Z�[�W�擾
								if(lotTraceList != null && lotTraceList.size() > 0){
									errCode = (String)lotTraceList.get(0);
									writeLog(ERROR, errCode);
								}
								return false;
							}
						}
					}

					//�g�p�c�����Z
					remainQty = remainQty.subtract(new BigDecimal(lotUseStruct.getTOTAL_ISSUE_QTY()));

					//�g�p�c����0�ȉ��̏ꍇ���[�v�I��
					if (remainQty.doubleValue() <= 0) {
						break;
					}
				}
			//���b�g�Ǘ��t���O = 1(���b�g�g���[�X�Ǘ����s���B)�łȂ��ꍇ
			} else {
				//�ۊǋ�ʓ��o�ɓo�^
				entity.minsertT_RCV_ISSUE.create(conn, issueStruct);
			}
		}

		return result;
	}

	/**
	 * �o�Ɏw�����X�g��ݒ肵�܂��B
	 * @throws FoundationException
	 * @throws SQLException
	 * @throws BatchAppException 
	 */
	private boolean setIssueList(List mainIssueList, AD0110010Struct parStruct)
			throws FoundationException, SQLException {

		//�Ǖi��
		BigDecimal acptQty = new BigDecimal(parStruct.getACPT_QTY());
		//�s�ǐ�
		BigDecimal defectQty = new BigDecimal(parStruct.getDEFECT_QTY());

		//��Ɠ�(���t����.�Ɩ��^�p��)�̃Z�b�g
		parStruct.setBUSINESS_OPR_DATE(_btmBusinessOprDate);

		for (int i = 0; i < mainIssueList.size(); i++ ) {
			BigDecimal planSum = acptQty.add(defectQty);
			AD0110010Struct tempIssueStruct = (AD0110010Struct)mainIssueList.get(i);
			tempIssueStruct.setsUser_ID(getSysUserCd());
			//�v��g�p���ʂ̎擾
			int round = Integer.parseInt(tempIssueStruct.getl_UNIT_QTY_TYP());
			BigDecimal denominator = 
					new BigDecimal(tempIssueStruct.getISSUE_INST_UNIT_DENOMINATOR());
			BigDecimal numerator = 
					new BigDecimal(tempIssueStruct.getISSUE_INST_UNIT_NUMERATOR());

			//���b�g�Ǘ��ΏۊO�̏ꍇ�A���邢�͐V�K�o�^�̏ꍇ
			if (isNull(tempIssueStruct.getLOT_NO())) {
				if (round == 1) {
					planSum = planSum.multiply(numerator).divide(denominator,0, BigDecimal.ROUND_UP).setScale(1);
				} else {
					planSum = planSum.multiply(numerator).divide(denominator,4, BigDecimal.ROUND_UP);

					// �����̕\���X�P�[������
					BigDecimal intVal = new BigDecimal("" + planSum.intValue());
					BigDecimal decimalVal = planSum.subtract(intVal).multiply(
							new BigDecimal(10000));
					int decVal = decimalVal.intValue();
					int roundCount = 1;
					while (true) {
						decVal = decVal / 10;
						if (decVal == 0) {
							break;
						}
						roundCount++;
					}
					planSum = planSum.setScale(roundCount, BigDecimal.ROUND_UP);
				}
				// ���b�g���蓖�čς݂̏ꍇ
			} else {
				// [���b�g�ʎg�p����]�̎g�p�\�萔�ʂ��v��g�p���ʂɐݒ�
				planSum = new BigDecimal(tempIssueStruct.getSUPPLIED_ISSUE_QTY());
			}
			tempIssueStruct.setTEMP_PLAN_QTY(planSum.toString());

			//�g�p�ϐ��ʁA�v��O�g�p�ϐ��ʁA�X�V�g�p���ʂ̎擾
			tempIssueStruct.setTEMP_USEOVER_QTY("0.0");
			tempIssueStruct.setTEMP_PLANOUT_QTY("0.0");
			tempIssueStruct.setTEMP_USE_QTY("0.0");

			//��ƌv��ԍ��ɏo�������єԍ����Z�b�g
			List tempList = new ArrayList();
			AD0110010Struct tempStruct = null;
			tempStruct = new AD0110010Struct();
			tempStruct.setsUser_ID(getSysUserCd());
			tempStruct.setWORK_ODR_CD(parStruct.getOUTPUT_RSLT_CD());
			tempStruct.setITEM_CD(tempIssueStruct.getITEM_CD());
			tempStruct.seth_ISSUE_INST_CD(tempIssueStruct.geth_ISSUE_INST_CD());

			// ���b�g�Ǘ��ΏۊO�̏ꍇ�A���邢�͐V�K�o�^�̏ꍇ
			if (isNull(tempIssueStruct.getLOT_NO())) {
				// �ۊǋ�ʓ��o�ɂ̌���
				tempList = new ArrayList();
				tempList = entity.mselectRecvIssue.read(conn, tempStruct);
				if (tempList != null && tempList.size() != 0) {
					tempStruct = (AD0110010Struct) tempList.get(0);
					tempStruct.setsUser_ID(getSysUserCd());
					BigDecimal bdIssue = new BigDecimal(tempStruct.getRCV_ISSUE_QTY());
					tempIssueStruct.setTEMP_USEOVER_QTY(bdIssue.negate().toString());
					if ("0".equals(tempStruct.getcount_RCV_ISSUE())) {
						tempIssueStruct.setTEMP_PLANOUT_QTY("0.0");
						tempIssueStruct.setTEMP_USE_QTY(planSum.toString());
					} else {
						BigDecimal useoverQty = new BigDecimal(tempIssueStruct.getTEMP_USEOVER_QTY());
						BigDecimal planoutQty = (planSum.subtract(useoverQty)).multiply(new BigDecimal(-1));
						tempIssueStruct.setTEMP_PLANOUT_QTY(planoutQty.toString());
						tempIssueStruct.setTEMP_USE_QTY("0.0");
					}
				}
				// ���b�g���蓖�čς݂̏ꍇ
			} else {
				// [���b�g�ʎg�p����]�̎g�p�ϐ��ʂ��g�p�ϐ��ʂɐݒ�
				tempIssueStruct.setTEMP_USEOVER_QTY(tempIssueStruct.getTOTAL_ISSUE_QTY());

				// �v��O�g�p�ϐ��ʂɌv��g�p����-�g�p�ϐ��ʁA�X�V�g�p���ʂ�0��ݒ�
				BigDecimal useoverQty = new BigDecimal(tempIssueStruct.getTEMP_USEOVER_QTY());
				BigDecimal planoutQty = (planSum.subtract(useoverQty)).multiply(new BigDecimal(-1));
				tempIssueStruct.setTEMP_PLANOUT_QTY(planoutQty.toString());
				tempIssueStruct.setTEMP_USE_QTY("0.0");
			}

			//���חp�̕ϐ��Ƀ��b�g�ԍ��ݒ�
			tempIssueStruct.setRCV_ISSUE_DATE(parStruct.getOPR_DATE());
			if (parStruct.getOPR_DATE() == null || "".equals(parStruct.getOPR_DATE())){
				tempIssueStruct.setRCV_ISSUE_DATE(_btmBusinessOprDate);
			}
		}
		return true;
	}

	/**
	 * main�F ���[�U��`�p���\�b�h�ł�<br>
	 * <<�������L�q���Ă�������>>
	 *
	 * @return <<�������L�q���Ă�������>>
	 * @exception <<�������L�q���Ă�������>>
	 */
	public int main() throws BatchAppException, BusinessProcessException, FoundationException
	{
		// todo: �����Ƀ��[�U��`�R�[�h���L�q���Ă�������
		// PL/SQL�̎��s
		String result = null;
		// ���b�N�����L�[
		int lockCancelKey = LOCK_FAILD;

		// DB�ڑ��擾����
		conn = m_conductor.m_transactionConn;

		try {
			// �����`�F�b�N
			if (!checkArgs()) {
				writeLog(ERROR, "ZZ09009");
				return BREAK;
			}

			// DB���b�Z�[�W�X�V����
			IDbConnection conn_msg = m_conductor.m_defaultConn;
			numbering = new Numbering(conn_msg, Numbering.LOG_CD,
					getSysUserCd(), getSysProgramId(), getSysPlantCd());
			businessMsgAcc.init(conn_msg);
			businessMsg.setBusinessOperatingName(getSysProgramId());
			businessMsg.setUser(getSysUserCd());
			businessMsg.setPlantCode(getSysPlantCd());
			m_med.setUsername(getSysUserCd());

			// �Ɩ����b�N
			lockCancelKey = businessLock();
			if (lockCancelKey == LOCK_FAILD) {
				writeLog(ERROR, "ZZ01008");
				return BREAK;
			}

			// �y�o�b�`�������J�n���܂����B�z
			writeLog(INFOMATION, "ZZ09001");

			// �����́uCSV�捞�����v��2�F�w��t�@�C���捞 �̏ꍇ�ADB�T�[�o�p�X�̎擾�E�f�B���N�g���`�F�b�N
			if ("2".equals(getCsvTakeTyp())) {
				// �G���[���̃��b�Z�[�W�ێ��p�ϐ�
				String[] strMessage = new String[2];

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

			// �o��������CSV�捞�����iPL/SQL�j�̈������Z�b�g
			m_med.setPROGRAM_CD(m_med.getProgname());
			m_med.setFUNCTION_NAME("SQLOUTPUTRSLTINTERFACE");

			m_med.getSYS_BAT_PARM().read();
			if (!m_med.getSYS_BAT_PARM().next()) {
				// �ُ�I�����O
				writeLog(INFOMATION, "VZ00003");
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

			// CSV�捞������1�F�Œ�t�@�C���捞 �̏ꍇ
			if ("1".equals(getCsvTakeTyp())) {
				// CSV�捞����
				m_med.setpnumCsvTakeTyp(getCsvTakeTyp());
				// �捞�p�X
				m_med.setpvc2CsvTakePath(null);
				// �o�b�N�A�b�v�t�H���_�p�X
				m_med.setpvc2CsvBackupPath(null);
			} else {
				// CSV�捞����
				m_med.setpnumCsvTakeTyp(getCsvTakeTyp());
				// �捞�p�X
				m_med.setpvc2CsvTakePath(getCsvTakePath());
				// �o�b�N�A�b�v�t�H���_�p�X
				m_med.setpvc2CsvBackupPath(_strCsvDbBackupPath);
			}

			// �o��������CSV�捞�����iPL/SQL�j���s��
			List callList = m_med.getSQLOUTPUTRSLTINTERFACE().call();
			// PL/SQL�̎��s���ʂ��擾
			medAD0110B001 resultMed = (medAD0110B001) callList.get(0);
			result = resultMed.getpnumReturn();
			// �������ʂ�3�F�ُ�I���̏ꍇ�A�����Ń��[�v���I������B
			if (result.equals("3")) {
				// �I�����O
				writeLog(INFOMATION, "VZ00003");
				return BREAK;
			}
			// �g�����U�N�V�����̊J�n
			conn.beginTransWeb();
			conn.commit();

			// [�o�������ю捞]�̃f�[�^���擾
			List listTOutputRsltTemp = selectTOutputRsltTemp();

			// [�o�������ю捞]�̃f�[�^���擾����
			if (!listTOutputRsltTemp.isEmpty()) {
				// �}�X�^�������`�F�b�N���{
				if (check_listTOutputRsltTemp(listTOutputRsltTemp)) {
					// ��ЃR�[�h�擾
					m_med.getSYS_MY_COMPANY().read();
					if (m_med.getSYS_MY_COMPANY().next()) {
						_company_cd = m_med.getCOMPANY_CD();
					}

					// �o�������ѓo�^����
					insertCsvDate(listTOutputRsltTemp);
				}
			}
			// �I�����O
			writeLog(INFOMATION, "ZZ09002");

		} catch (SQLException e) {
			conn.rollback();
			e.printStackTrace();
			throw new BatchAppException("CtrlMain", "main", e.getMessage());
		} catch (FoundationException e) {
			conn.rollback();
			e.printStackTrace();
			throw new BatchAppException("CtrlMain", "main", e.getMessage());
		} catch (Exception e) {
			conn.rollback();
			e.printStackTrace();
			throw new BatchAppException("CtrlMain", "main", e.getMessage());
		} finally {
			try {
				// �g�����U�N�V�����̊J�n
				conn.beginTransWeb();
				// �o�������ю捞�̍폜
				m_med.getT_OUTPUT_RSLT_TEMP().delete();
				conn.commit();

				// �Ɩ����b�N����
				if (!businessUnLock(lockCancelKey)) {
					writeLog(ERROR, "ZZ01004");
				}
			} catch (Exception e) {
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
			entity = new AD0110010Entity();
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
		public medAD0110B001 m_med=null;

		/**
		 * �R���e�i�N���X�C���X�^���X
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medAD0110B001 med) throws BatchAppException
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
