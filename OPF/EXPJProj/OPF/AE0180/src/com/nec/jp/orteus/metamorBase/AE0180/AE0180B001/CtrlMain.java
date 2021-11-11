/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0180/src/com/nec/jp/orteus/metamorBase/AE0180/AE0180B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0180.AE0180B001;

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
import com.nec.jp.orteus.metamorBase.AE0180.AE0180010Entity;
import com.nec.jp.orteus.metamorBase.AE0180.AE0180010Struct;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.metamorBase.common04.amount.AmountCalculator;
import com.nec.jp.orteus.metamorBase.common04.amount.CurControl;
import com.nec.jp.orteus.metamorBase.common04.amount.CurStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateControl;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.PuchUnitCostControl;
import com.nec.jp.orteus.metamorBase.common04.amount.PuchUnitCostStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxControl;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxStruct;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlStruct;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurStruct;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.expj.util.ATAspBom;
import com.nec.jp.orteus.expj.util.ATCommonOd;
import com.nec.jp.orteus.expj.util.ATWorkCalendar;
import com.nec.jp.orteus.expj.util.CommonOd;
import com.nec.jp.orteus.expj.util.Converter;
import com.nec.jp.orteus.expj.util.DateTool;
import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.expj.util.ExpjException;
import com.nec.jp.orteus.expj.util.Numbering;
import com.nec.jp.orteus.expj.util.ScreenParam;
import com.nec.jp.orteus.expj.util.SystemInformation;
import com.nec.jp.orteus.expj.util.WorkCalendar;
import java.util.Date;
import com.nec.jp.orteus.xaf.wa.BusinessProcessException;
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain �N���X
 * �t�@�C���E�N���X����
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.5 $ $Date: 2016/05/23 08:15:51 $
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
	public medAE0180B001 m_med=null;

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
	public CtrlMain(medAE0180B001 med, BatchAppConductor cdr) throws BatchAppException
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
	public CtrlMain(medAE0180B001 med) throws BatchAppException
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
    
	/** ���͕i�ڑ��݊m�F�t���O */
	private boolean _Itemflg = true;
	
	/** EJa-ASPROVA�A�g�I�v�V���������t���O�擾�p */
	private String _SysInstallOptions_ASP = null;
		
	private boolean warningFlg = false;
	
	/*��ЃR�[�h*/
	public String _company_cd = null;
	/** [�M��]��� */
    private HomeCurStruct _homeCurStruct = new HomeCurStruct();
	

    /**AE0180 entity*/
    AE0180010Struct struct = null;
	protected AE0180010Entity entity;
	
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


	/**
	 * �����v��捞�f�[�^�擾
     * @return	puchOrdList     �����v��捞���X�g
	 * @throws BatchAppException 
	 */
	private List selectTPuchOdrTemp() throws BatchAppException {
		List rtnList = new ArrayList();
		AE0180010Struct structdata = null;
		m_med.getT_PUCH_ODR_TEMP().read();
		while(m_med.getT_PUCH_ODR_TEMP().next()) {
			structdata = new AE0180010Struct();			
			structdata.setITEM_CD(m_med.getITEM_CD());
			structdata.setPUCH_ODR_DLV_DATE(m_med.getPUCH_ODR_DLV_DATE());
			structdata.setPUCH_ODR_START_DATE(m_med.getPUCH_ODR_START_DATE());
			structdata.setPUCH_ODR_QTY(m_med.getPUCH_ODR_QTY());
			structdata.setVEND_CD(m_med.getVEND_CD());
			structdata.setJOB_ODR_CD(m_med.getJOB_ODR_CD());
			structdata.setCONFIRM_DLV_DATE(m_med.getCONFIRM_DLV_DATE());
			structdata.setWH_CD(m_med.getWH_CD());
			structdata.setPUCH_ODR_COMMENT(m_med.getPUCH_ODR_COMMENT());
			structdata.setNON_NO_ITEM_FLG(m_med.getNON_NO_ITEM_FLG());
			structdata.setNON_NO_ITEM_NAME(m_med.getNON_NO_ITEM_NAME());
			structdata.setNON_NO_ITEM_TYP(m_med.getNON_NO_ITEM_TYP());
			structdata.setNON_NO_ITEM_PUCH_ODR_UNIT(m_med.getNON_NO_ITEM_PUCH_ODR_UNIT());
			structdata.setUNIT_COST_TYP(m_med.getUNIT_COST_TYP());
			structdata.setUNIT_COST(m_med.getUNIT_COST());
			structdata.setPROCESSING_COST(m_med.getPROCESSING_COST());
			structdata.setMATERIAL_COST(m_med.getMATERIAL_COST());
			structdata.setOTHER_OVERHEADS(m_med.getOTHER_OVERHEADS());
			structdata.setNET_AMOUNT(m_med.getNET_AMOUNT());
			structdata.setEXCH_RATE(m_med.getEXCH_RATE());
			structdata.setACCT_CD(m_med.getACCT_CD());
			structdata.setDEPT_CD(m_med.getDEPT_CD());
			structdata.setPJ_CD(m_med.getPJ_CD());
			structdata.setSEG_CONTENTS1(m_med.getSEG_CONTENTS1());
			structdata.setSEG_CONTENTS2(m_med.getSEG_CONTENTS2());
			structdata.setSEG_CONTENTS3(m_med.getSEG_CONTENTS3());
			structdata.setSEG_CONTENTS4(m_med.getSEG_CONTENTS4());
			
			rtnList.add(structdata);
		}
		return rtnList;
	}
		
	/**
     * �ғ����`�F�b�N��������t������Ŏg����悤�ɂ����Ϗ����\�b�h�ł��B
     * @param dateString ���t������
     * @return �ғ����̏ꍇ�� true�A ��ғ����̏ꍇ��false��Ԃ��܂��B
     * @throws FoundationException  ���ʕ��i�����Ŏ��s
     * @throws ParseException �^�ϊ��Ɏ��s
     */
    private boolean isWorkDay(String dateString ,String itemCd) throws FoundationException, ParseException {
    	
     Date date = Converter.strToDate(dateString, "yyyy/MM/dd");
   
     // �ғ������ʕ��i�𐶐����A�`�F�b�N���������s
     WorkCalendar wc;
     if(!_Itemflg){
     	wc = new WorkCalendar(conn, getSysUserCd(), getSysProgramId(), this.getSysPlantCd(),itemCd, date);
     }else{
     	wc = new WorkCalendar(conn, getSysUserCd(), getSysProgramId(), this.getSysPlantCd(), date);
     }
     boolean reslt = wc.isWorkDate();
     return reslt;
    }
    
    /**
     * �ғ������Z��������t������Ŏg����悤�ɂ����Ϗ����\�b�h�ł��B
     * @param dateString ���t������
     * @return ���Z���ʂ̓��t������
     * @throws FoundationException ���ʕ��i�����Ŏ��s
     * @throws ParseException �^�ϊ��Ɏ��s
     */
    private String calcWorkDay(String dateString, String timeString, String ltString, boolean flg, String itemCd)
     throws FoundationException, ParseException {

     // �n����Ă���������hh24:mi:ss�`���ɐ�����
     timeString = timeString.substring(0,2) + ":" + timeString.substring(2) + ":00";

     // �����̔N�����ƌ`���𐮂����������������A���t�^�ɕϊ�����
     Date date = Converter.strToDate(dateString + " " + timeString, "yyyy/MM/dd HH:mm:ss");
     int lt = Integer.parseInt(ltString);
   
     // �ғ������ʕ��i�𐶐����A�`�F�b�N���������s
     WorkCalendar wc =
      new WorkCalendar(conn, getSysUserCd(), getSysProgramId(), this.getSysPlantCd(),itemCd, date, lt, flg);
     Date resultDate = wc.calcDate();

     if (resultDate == null || "".equals(resultDate)){
    	 return ""; 
     }
     // �����Z�o���ꂽ���t�𕶎��^�ɕϊ����ĕێ�����
     String tidydate = Converter.dateToStr(resultDate, "yyyy/MM/dd HH:mm:ss");

     // �����Z�o���ꂽ���t��yyyy/mm/dd hh24mi�`���ɐ�����
     tidydate = tidydate.substring(0,10) + tidydate.substring(11,13) + tidydate.substring(14,16);

     //return df.format(tidydate);
     return tidydate;
    }
	
	//---------- ���t�ϊ� -------------------------------------------
	public Date StrngToDt(String in){
		Date out = null;
		SimpleDateFormat fm = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		if(in == null) return out;
		try{
			if((out = fm.parse(in)) != null) return out;
		}catch(ParseException e){}
		return out;
	}
	
	public String DtGetDate(Date in)
	{
		SimpleDateFormat fm = new SimpleDateFormat("yyyy/MM/dd");
		if(in == null) return null;
		return fm.format(in);
	}
    
	/**
	 * ���l�͈̓`�F�b�N
	 * 
	 * @param strI	ing
	 *            ���l
	 * @param integerSize
	 *            �����ʐ�
	 * @param decimalSize
	 *            �����ʐ�
	 * @return ����:true / �G���[:false
	 */
	public boolean isNotInNumRange(String strInString, int integerSize, int decimalSize) {

		String strInputString = null;
		// �}�C�i�X�̏ꍇ
		if (strInString.indexOf("-") == 0) {
			strInputString = strInString.substring(1);
		} else {
			// �����̏ꍇ
			strInputString = strInString;
		}
		int toneFlg = strInputString.indexOf('.');
		if (toneFlg == -1) {
			// �����̏ꍇ
			if (strInputString.length() > integerSize) {
				return false;
			}
		} else {
			if (decimalSize == 0 && toneFlg == integerSize) {
				return false;
			}
			if (strInputString.length() > decimalSize + integerSize + 1) {
				return false;
			}
			// ����
			String zhstr = strInputString.substring(0, toneFlg);
			// ����
			String xistr = strInputString.substring(toneFlg + 1, strInputString.length());
			if (zhstr.length() > integerSize || xistr.length() > decimalSize) {
				return false;
			}
		}
		return true;
	}
	
    
	/**
	 * �����v��捞�f�[�^�̃}�X�^�������`�F�b�N
	 * @param dataList
	 * @return
	 * @throws BusinessProcessException
	 * @throws FoundationException
	 */
	private boolean check_listTPuchOdrTemp(List dataList) throws Exception{
		// �S�����R�[�h��
		_intTotalCount = dataList.size();
		AE0180010Struct dataStruct = new AE0180010Struct();
		boolean itemCheckFlg = false;
		//�G���[�s�ԍ�
		String errorNumber = "0";
		//�Ɩ����b�Z�[�W�p�G���[�s�ԍ�
		String err_commt ="";
		try {
			for (int i = 0; i < dataList.size(); i++)	{
	             //�t���O��������
		        _Itemflg = true;
		        itemCheckFlg = false;
				dataStruct = (AE0180010Struct)dataList.get(i);
				errorNumber =String.valueOf(i+1);
				AE0180010Struct itemStruct = new AE0180010Struct();
				AE0180010Struct jobOdrStruct = new AE0180010Struct();
				
		        // [CSV���]�D�h�i�ڔԍ��h��[�i��] ���������A���݂��Ȃ������ꍇ
		        if(!isNull(dataStruct.getITEM_CD())){
		        	List itemList = entity.mselectM_ITEM.read(conn, dataStruct);
		        	
			        if (itemList.isEmpty()) {
			        	errCode = "AE50509";
			        	//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
			        	err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
			        	writeLog(ERROR,errCode,err_commt);	
			        	_intErrorCount++;
    					continue;
					}else{
						_Itemflg = false;
						// [�i��]."�i�ڎ�z�敪"��8�̏ꍇ
						itemStruct = (AE0180010Struct) itemList.get(0);
						if (("8".equals(itemStruct.getMRP_ODR_TYP()))) {
							errCode = "AE32601";
							//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
							err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
							writeLog(ERROR,errCode,err_commt);	
							_intErrorCount++;
							continue;
		    			}
					}
		        }
		        
		        // [CSV���]�D�h�����[���h�ɋx�������͂��ꂽ�ꍇ
		        if (!isWorkDay(dataStruct.getPUCH_ODR_DLV_DATE(), dataStruct.getITEM_CD())) {
		        	errCode = "AE00028";
		        	//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
		        	err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
		        	writeLog(ERROR,errCode,err_commt);	
		        	_intErrorCount++;     
		        	continue;
		        }
		        
				// ASPROVA�A�g�I�v�V�����C���X�g�[���t���O�̎擾
				 List InstallOptionList_ASP = entity.mselectSYS_INSTALL_OPTIONS_ASP.read(conn, dataStruct);
				 if (InstallOptionList_ASP.isEmpty()) {
					 dataStruct.setASP_INSTALL_FLG(null);			
				 }else{
					 dataStruct.setASP_INSTALL_FLG(((AE0180010Struct)InstallOptionList_ASP.get(0)).getASP_INSTALL_FLG());
				 }
				 
				 _SysInstallOptions_ASP = dataStruct.getASP_INSTALL_FLG();
		        
				DateCtrlStruct dcs = DateCtrlControl.getData(conn, this.getSysPlantCd());
				// ASPROVA�A�g�I�v�V�����������̏ꍇ(�����ς̏ꍇ�A�ߋ����t�̓o�^��)
                if(!"1".equals(_SysInstallOptions_ASP)){
                	// [CSV���]�D�h�����[���h<[���t����]."�Ɩ��^�p��"�̏ꍇ
    				if(DateTool.compareYMD(dataStruct.getPUCH_ODR_DLV_DATE(), dcs.getBUSINESS_OPR_DATE())<0){
    					errCode = "AE00030";
    					//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
    					err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
    					writeLog(ERROR,errCode,err_commt);	
    					_intErrorCount++;
    					continue;
    				}
                }
		        
             // [CSV���]�D�h�����\����h�ɋx�������͂��ꂽ�ꍇ
		        if (!isNull(dataStruct.getPUCH_ODR_START_DATE())) {
		        	if(!isWorkDay(dataStruct.getPUCH_ODR_START_DATE(),dataStruct.getITEM_CD())){
		        	
		        		errCode = "AE00029";
		        		//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
		        		err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
		        		writeLog(ERROR,errCode,err_commt);	
		        		_intErrorCount++;
		        		continue;
		        	}
		        	
		        	// ASPROVA�A�g�I�v�V�����������̏ꍇ(�����ς̏ꍇ�A�ߋ����t�̓o�^��)
	                if(!"1".equals(_SysInstallOptions_ASP)){
	                	 // [CSV���]�D�h�����\����h�� [���t����]."�Ɩ��^�p��"�̏ꍇ
						if(DateTool.compareYMD(dataStruct.getPUCH_ODR_START_DATE(), dcs.getBUSINESS_OPR_DATE())<0){		
							errCode = "AE00031";
							//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
							err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
							writeLog(ERROR,errCode,err_commt);	
							_intErrorCount++;
							continue;
						}
	                }
		        }

		        // [CSV���]�D�h�����\����h�@�� Null ���A[CSV���]�D�h�����[���h �� [CSV���]�D�h�����\����h�̏ꍇ
	        	if(!isNull(dataStruct.getPUCH_ODR_START_DATE()) && 
	        			(DateTool.compareYMD(dataStruct.getPUCH_ODR_DLV_DATE(), dataStruct.getPUCH_ODR_START_DATE())< 0)){
	        		errCode = "AE32608";
	        		//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
	        		err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
	        		writeLog(ERROR,errCode,err_commt);	
	        		_intErrorCount++;
	        		continue;

	        	}
	        	// ���[�g������̐ݒ�
	        	dataStruct.setRATE_JUDGE_DATE(dataStruct.getPUCH_ODR_DLV_DATE());
		        // �����\����̐ݒ�
				String PUCH_ODR_DLV_TIME = null;
				// ���͎����̃`�F�b�N(�����Ǘ�����ꍇ�̂�)
				if ("true".equals(dataStruct.getTIME_CTRL())) {
					PUCH_ODR_DLV_TIME = "2359";
				} else {
					// �����Ǘ����Ȃ��ꍇ��0000�ɐݒ�
					PUCH_ODR_DLV_TIME = "0000";
				}
	        	
				// [CSV���]�D�h�����\����h��null�̏ꍇ
				if(isNull(dataStruct.getPUCH_ODR_START_DATE())){
                    //���i�����łȂ��ꍇ
		        	if ("0".equals(dataStruct.getNON_NO_ITEM_FLG())){
		        		// [CSV���]�D�h�����[���h�����ɔ����\������Z�o�����̌��ʂ𔭒��\����Ƃ���B
		        		String resultDate = null;
		        		// ASPROVA�A�g�I�v�V�����������̏ꍇ�F���P�ʂ̃��[�h�^�C���v�Z���s���B
						if (!"1".equals(_SysInstallOptions_ASP)) {
							String fixedLt = itemStruct.getFIXED_LT();
							String propLt = itemStruct.getPROP_LT();
							String safetyLt = itemStruct.getSAFETY_LT();
							String propLotSize = itemStruct.getPROP_LOT_SIZE();

							String itemLt = Calculate.divide(dataStruct.getPUCH_ODR_QTY(), propLotSize, 0, Calculate._CEIL);
							itemLt = Calculate.multiply(itemLt, propLt);
							itemLt = Calculate.add(itemLt, fixedLt);
							itemLt = Calculate.add(itemLt, safetyLt);
							itemLt = Calculate.multiply(itemLt, "-1");

							resultDate = calcWorkDay(dataStruct.getPUCH_ODR_DLV_DATE(),PUCH_ODR_DLV_TIME, itemLt, true,  dataStruct.getITEM_CD());
							if ("".equals(resultDate)) {
								errCode = "AE00198";
								//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
								err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
								writeLog(ERROR,errCode,err_commt);	
								_intErrorCount++;
								continue;
							}
							// �Z�o���������\��� <[���t����]."�Ɩ��^�p��"�̏ꍇ��[���t����]."�Ɩ��^�p��"�𢔭���\�����Ƃ���B
							if (DateTool.compareYMD(resultDate.substring(0, 10), dcs.getBUSINESS_OPR_DATE()) < 0) {
								dataStruct.setPUCH_ODR_START_DATE(dcs.getBUSINESS_OPR_DATE());
							} else {
								// �����v�Z�������ʂ𔭒��\����Ƃ���
								dataStruct.setPUCH_ODR_START_DATE(resultDate.substring(0, 10));
							}
							// ASPROVA�A�g�I�v�V���������ς̏ꍇ�F���ԒP�ʂ̃��[�h�^�C���v�Z���s���B
		        	    }else{
		        	    	String propLotSize = itemStruct.getPROP_LOT_SIZE();
		        	    	String sWkDate, sShiftMin, sWkTime;
		        	    	ATAspBom ab = new ATAspBom(conn, this.getSysPlantCd(),this.getSysUserCd(), this.getSysProgramId());
		        	    	ATWorkCalendar atWC = new ATWorkCalendar(conn, this.getSysUserCd(), "AE0180010",
									this.getSysPlantCd());
		        	    	Date puchOdrStartDate = null; // �����\���
							Date puchOdrDlvDate = null; // �����[��
							
							// �����[��������̏��
							puchOdrDlvDate = StrngToDt(dataStruct.getPUCH_ODR_DLV_DATE()
									+ " " + (PUCH_ODR_DLV_TIME).substring(0, 2)
									+ ":" + (PUCH_ODR_DLV_TIME).substring(2, 4));
							// �����\���LT�V�t�g(�|)
							sShiftMin = ab.getProdLtMin(dataStruct.getITEM_CD(), dataStruct.getPUCH_ODR_QTY(), propLotSize, "U");
							sShiftMin = Calculate.multiply(sShiftMin, "-1"); // �ߋ���
							puchOdrStartDate = atWC.calcShiftMinute(puchOdrDlvDate, sShiftMin, ATWorkCalendar.SHIFT_START); // Conv
							sWkDate = DtGetDate(puchOdrStartDate);
							dataStruct.setPUCH_ODR_START_DATE(sWkDate);
		        	    }
					// ���i�w���̏ꍇ
		        	}else{
		        		// [�Ɩ����t]."�Ɩ��^�p��"�𔭒��\����Ƃ���B
		        		dataStruct.setPUCH_ODR_START_DATE(dcs.getBUSINESS_OPR_DATE());
						if(!isWorkDay(dataStruct.getPUCH_ODR_START_DATE(),dataStruct.getITEM_CD())){
							errCode = "AE00198";
							//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
							err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
							writeLog(ERROR,errCode,err_commt);	
							_intErrorCount++;
							continue;
						}
		        	}
				}
		        
	        	// [CSV���]�D�h�������h��0�ȉ��̏ꍇ
	        	if(Calculate.compare(dataStruct.getPUCH_ODR_QTY(),"0") == 0){
	        		errCode = "AE00038";
	        		//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
	        		err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
	        		writeLog(ERROR,errCode,err_commt);	
	        		_intErrorCount++;
	        		continue;
	        	}
	        	
	        	// ������R�[�h����A[�����]�ɑ��݂��Ȃ��ꍇ
                List vendCtrlList = entity.mselectM_VEND_CTRL.read(conn, dataStruct);
                AE0180010Struct vendCtrlStruct = null;
                if (vendCtrlList.isEmpty()) {
                	errCode = "AE20030";
                	//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
                	err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
                	writeLog(ERROR,errCode,err_commt);	
                	_intErrorCount++;
                	continue;

                }else {
                    // ������."�����ԃt���O" = 1:�����~�̏ꍇ
                    vendCtrlStruct = (AE0180010Struct) vendCtrlList.get(0);
                    if ("1".equals(vendCtrlStruct.getDEAL_STS_FLG())) {
                    	errCode = "AE00002";
                    	//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
                    	err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
                    	writeLog(ERROR,errCode,err_commt);	
                    	_intErrorCount++;
                    	continue;

                    }
                }
	        	
             // [CSV���]�D�h�i�ڔԍ��h��[�i��] ���������A[�i��].�g�i�ڎ�z�敪�h ��1�F���� �܂�2�F�݌Ɉ����^����
                if (("1".equals(itemStruct.getMRP_ODR_TYP())) || ("2".equals(itemStruct.getMRP_ODR_TYP()))){
                	// ���Ԃ�NULL�̏ꍇ
                	if(isNull(dataStruct.getJOB_ODR_CD())){
                		errCode = "AB00017";
                		//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
                		err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
                		writeLog(ERROR,errCode,err_commt);	
                		_intErrorCount++;
                		continue;
                	}
                	// ���O�C�����[�U�̏����̍H��R�[�h
                	dataStruct.setPLANT_CD(getSysPlantCd());
                	// ���ԕi�̏ꍇ�A���O�C�����[�U�̏����̍H��R�[�h�A [CSV���]�D�h���ԁh �A�u���Ԏ}�ԁv�Ɓu���Ԏ�������ԍ��v �� [���Ԍv��] �ɑ��݂��Ȃ��ꍇ
                    // �i�u���Ԏ}�ԁv�@�� 0�A�u���Ԏ�������ԍ��v�@�� 0�j
                    List jobordcdList = entity.mselectT_JOB_ODR.read(conn, dataStruct);
                    if (jobordcdList.isEmpty()) {                    	
                    	errCode = "AB00043";
                    	//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
                    	err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
                    	writeLog(ERROR,errCode,err_commt);	
                    	_intErrorCount++;
                    	continue;
                    }else{
                        // [���Ԍv��]. �g���ԏ�ԋ敪�h�� 1�F���v�ʌv�Z���Ώ� or 2�F���v�ʌv�Z�Ώ� or 9�F���� �̏ꍇ
                        AE0180010Struct jobordcdStruct = new AE0180010Struct();
                        jobordcdStruct = (AE0180010Struct)jobordcdList.get(0);
                        if(("1".equals(jobordcdStruct.getJOB_ODR_STS_TYP())) 
                        		|| ("2".equals(jobordcdStruct.getJOB_ODR_STS_TYP())) 
                        		|| ("9".equals(jobordcdStruct.getJOB_ODR_STS_TYP()))){                    	
                        	errCode = "AE01001";
                        	//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
                        	err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
                        	writeLog(ERROR,errCode,err_commt);	
                        	_intErrorCount++;
                        	continue;
                        }
                        // [���v��]��񂪑��݂��Ă��Ȃ��ꍇ
                        List jobOdrList = entity.mselectT_OD_JOB_ODR.read(conn, dataStruct);
                        if(jobOdrList.isEmpty()){                    	
                        	errCode = "AH00039";
                        	//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
                        	err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
                        	writeLog(ERROR,errCode,err_commt);	
                        	_intErrorCount++;
                        	continue;
                        }
                        // [���v��].�g���ԁh�� [���Ԍv��] ���������A[���Ԍv��].�g�[���h �� [CSV���]�D�h�����[���h����[���Ԍv��].�g�[���h���Ɩ��^�p���ȍ~�̏ꍇ
        				jobOdrStruct = (AE0180010Struct) jobOdrList.get(0);
        				// �I�[�_�f�}���h�ԍ�
        				dataStruct.setOD_NO(jobOdrStruct.getOD_NO());
        				if(DateTool.compareYMD(dataStruct.getPUCH_ODR_DLV_DATE(),jobOdrStruct.getJOB_ODR_DLV_DATE())> 0){
        					if(DateTool.compareYMD(jobOdrStruct.getJOB_ODR_DLV_DATE(),dcs.getBUSINESS_OPR_DATE()) >= 0){    						
        						errCode = "AE32604";
        						//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
        						err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
        						writeLog(ERROR,errCode,err_commt);	
        						_intErrorCount++;
        						continue;
        					}
        				}
                    }
                } else {
                	dataStruct.setJOB_ODR_CD("");
                }
                
             // [CSV���]�D�h����ꏊ�h�Łm�ۊǋ�n���������A���݂��Ȃ������ꍇ
                List wh_cdList = entity.mselectM_WH.read(conn, dataStruct);
                if(wh_cdList.isEmpty()){            
                	errCode = "AE00018";
                	//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
                	err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
                	writeLog(ERROR,errCode,err_commt);	
                	_intErrorCount++;
                	continue;
            	}else{
            		AE0180010Struct wh_cdStruct = (AE0180010Struct) wh_cdList.get(0);
            		// ���O�C�����[�U�̏����̍H��R�[�h �� [�ۊǋ�].�g�H��R�[�h�h �̏ꍇ
            		if (!this.getSysPlantCd().equals(wh_cdStruct.getPLANT_CD())) {            			
            			errCode = "AE00032";
            			//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
            			err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
            			writeLog(ERROR,errCode,err_commt);	
            			_intErrorCount++;
            			continue;
            		}    
            	}
	        	
                // ���i�����ł��A��i�ڔԍ����Null�̏ꍇ�͈ȉ��̏������s��Ȃ�
                if(!(("1".equals(dataStruct.getNON_NO_ITEM_FLG())) && (dataStruct.getITEM_CD() == null || dataStruct.getITEM_CD().length() <= 0))){
               	 // [�i��] . �g�݌ɐ��P�ʋ敪�h �� 1�F�����Ǘ� ���A[CSV���]�D�h�������h�ɏ������܂ޏꍇ
               	 if (("1".equals(itemStruct.getUNIT_QTY_TYP()))) {
                   	 String ceilPuchOdrQty = Calculate.ceil(dataStruct.getPUCH_ODR_QTY(), 0);
                   	 if (Calculate.compare(ceilPuchOdrQty, dataStruct.getPUCH_ODR_QTY()) != 0) {
                   		 dataStruct.setPUCH_ODR_QTY(ceilPuchOdrQty);
                   		itemCheckFlg = true;
                   	 }
                    }
                }
                
                TaxStruct ts = new TaxStruct();
                CurStruct cs = new CurStruct();
                try {
                	// ����ŃR�[�h���擾
                	ts =
                    TaxControl.getData(
                    conn,
                    _company_cd,
                    dataStruct.getVEND_CD(),
                    dataStruct.getITEM_CD(),
                    dataStruct.getPUCH_ODR_DLV_DATE());
                 } catch (DataNotFoundException e) {
                		errCode = "AE00017";
                		//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
                		err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
                		writeLog(ERROR,errCode,err_commt);	
                		_intErrorCount++;
                		continue;  	 
                }
                 dataStruct.setTAX_CD(ts.getTAX_CD());
                 dataStruct.setTAX_RATE_1(ts.getTAX_RATE_1());
                 dataStruct.setTAX_RATE_2(ts.getTAX_RATE_2());
                 dataStruct.setTAX_RATE_3(ts.getTAX_RATE_3());
                 dataStruct.setTAX_ROUND_TYP(ts.getTAX_ROUND_TYP());            
                // [�ʉ�]�����擾
                try {
                 cs =
                  CurControl.getData(conn, _company_cd, dataStruct.getVEND_CD());
                } catch (DataNotFoundException e) {               	
                	errCode = "AE05075";
                	//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
                	err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
                	writeLog(ERROR,errCode,err_commt);	
                	_intErrorCount++;
                	continue;
                }
                dataStruct.setVEND_DECIMAL_FIG(cs.getDECIMAL_FIG());
                
                PuchUnitCostStruct pucs = new PuchUnitCostStruct();
                
                //  [CSV���]�D�h�P���h��NULL�ꍇ
                if(isNull(dataStruct.getUNIT_COST())){
                	// [�w���P��]�����擾
                	pucs =
                    PuchUnitCostControl.getData(
                    conn,
                    _company_cd,
                    dataStruct.getVEND_CD(),
                    this.getSysPlantCd(),
                    dataStruct.getITEM_CD(),
                    dataStruct.getPUCH_ODR_START_DATE(),
                    dataStruct.getPUCH_ODR_DLV_DATE(),
                    dataStruct.getPUCH_ODR_QTY());
                	// [�w���P��].�h �w���P���敪�h�Ƃ���B
                	dataStruct.setUNIT_COST_TYP(pucs.getUNIT_COST_TYP());
                	// [�w���P��].�h �w���P���h�Ƃ���B
                	dataStruct.setUNIT_COST(pucs.getUNIT_COST());
                	// [�w���P��].�h �w�����H��h�Ƃ���B
                	dataStruct.setPROCESSING_COST(pucs.getPROCESSING_COST());
                	// [�w���P��].�h �w���ޗ���h�Ƃ���B
                	dataStruct.setMATERIAL_COST(pucs.getMATERIAL_COST());
                	// [�w���P��].�h �w�����̑��o��h�Ƃ���B
                	dataStruct.setOTHER_OVERHEADS(pucs.getOTHER_OVERHEADS());
                }
                //�������z���܂�ߏ���
				String tempOdrAmount =
				AmountCalculator.calcPuchOdrAmount(
					dataStruct.getPUCH_ODR_QTY(),
					dataStruct.getUNIT_COST(),
					cs.getROUND_TYP(),
					cs.getDECIMAL_FIG());
                 if(!isNotInNumRange(tempOdrAmount, 14, 4)){              
	            	errCode = "AA00215";
	            	//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
	            	err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
	            	writeLog(ERROR,errCode,err_commt);	
	            	_intErrorCount++;
	            	continue;
                 }
                 // �������z
                 dataStruct.setPUCH_ODR_AMOUNT(tempOdrAmount);
                 // �{�̋��z
                 if(isNull(dataStruct.getNET_AMOUNT()) || "0".equals(dataStruct.getNET_AMOUNT())){
                	 dataStruct.setNET_AMOUNT(tempOdrAmount);
                 }
                 // [CSV���]�D�h�בփ��[�g�h��NULL�ȊO�̏ꍇ
                 if(!isNull(dataStruct.getEXCH_RATE())){
                	 // �בփ��[�g��0�ȉ��̏ꍇ
                     if(Calculate.compare(dataStruct.getEXCH_RATE(),"0") == 0){
                 		errCode = "AE00059";
                 		//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
                 		err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
                 		writeLog(ERROR,errCode,err_commt);	
                 		_intErrorCount++;   
                 		continue;
                     }
                 }
                 // [CSV���]�D�h�בփ��[�g�h��NULL�̏ꍇ
                 if(isNull(dataStruct.getEXCH_RATE())){
                	 // �בփ��[�g���擾
                	 try {
                		 ExchRateStruct ers =
                                 ExchRateControl.getData(
                                 conn,
                                 _company_cd,
                                 cs.getCUR_CD(),
                                 cs.getEXCH_TYP(),
                                 null,
                                 dataStruct.getPUCH_ODR_DLV_DATE());
                                 // ��בփ��[�g���ݒ�
                         dataStruct.setEXCH_RATE(ers.getEXCH_RATE());
                     }catch (DataNotFoundException e) {
                 		errCode = "AE05076";
                 		//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
                 		err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
                 		writeLog(ERROR,errCode,err_commt);	
                 		_intErrorCount++;	     
                 		continue;
                     }
                     // �בփ��[�g��0�ȉ��̏ꍇ
                     if(Calculate.compare(dataStruct.getEXCH_RATE(),"0") == 0){                    	 
                 		errCode = "AE00059";
                 		//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
                 		err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
                 		writeLog(ERROR,errCode,err_commt);	
                 		_intErrorCount++;
                 		continue;
                     }
                 }
                 
                 //���ł̏ꍇ�ɐŊz���v�Z����
                 String lowerTaxCd =
                		 ts.getTAX_CD().substring(ts.getTAX_CD().length() - 1);                
              	 if (!lowerTaxCd.equals("1")) {
              		//�o�b�`�p�����[�^�ďo
          			List batList = entity.mselectSYS_BAT_PARM.read(conn, dataStruct);
          			if(!batList.isEmpty()){
          				//�Ōv�Z���i���R�[��
          				AE0180010Struct batStruct = (AE0180010Struct)batList.get(0);
          				dataStruct.setPVC2LOGMODE(batStruct.getPVC2LOGMODE());
          				dataStruct.setPVC2OUTPUTMODE(batStruct.getPVC2OUTPUTMODE());
          				dataStruct.setPVC2OUTPUTPATH(batStruct.getPVC2OUTPUTPATH());
          				dataStruct.setPVC2OUTPUTNAME(batStruct.getPVC2OUTPUTNAME());
          				dataStruct.setPVC2USERID(this.getSysUserCd());
          				dataStruct.setPVC2BUSINESSNAME(batStruct.getPVC2BUSINESSNAME());
          				dataStruct.setPVC2PLANTCD(this.getSysPlantCd());
          				dataStruct.setPVC2TAXID("5");
          				batList = entity.mcallSQLCALCTAXCALCAMT.call(conn, dataStruct);
          				batStruct = (AE0180010Struct)batList.get(0);
          				if(!"1".equals(batStruct.getPNUMSTATUS())){
          					errCode = batStruct.getPVC2ERRCD();
          					//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
          					err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
          					writeLog(ERROR,errCode,err_commt);	
          					_intErrorCount++;
          					continue;
          				}
          				dataStruct.setTAX_AMOUNT_1(batStruct.getTAX_AMOUNT_1());
          				dataStruct.setTAX_AMOUNT_2(batStruct.getTAX_AMOUNT_2());
          				dataStruct.setTAX_AMOUNT_3(batStruct.getTAX_AMOUNT_3());
          				dataStruct.setAMOUNT_INCLUDE_TAX(batStruct.getAMOUNT_INCLUDE_TAX());  				
             		}else{
             			errCode = "ZZ09007";
             			//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
             			err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
             			writeLog(ERROR,errCode,err_commt);	
             			_intErrorCount++;
             			continue;
         			}	
                 }else{
                	// ��Ŋz1��̌v�Z
  	                String taxAmount1 =
  	                 AmountCalculator.calcTaxAmount(
  	                  dataStruct.getNET_AMOUNT(),
  	                  ts.getTAX_RATE_1(),
  	                  ts.getTAX_ROUND_TYP(),
  	                  cs.getDECIMAL_FIG());
  	                 dataStruct.setTAX_AMOUNT_1(taxAmount1);
  	                 // ��Ŋz2��̌v�Z
  	                 String taxAmount2 =
  	                  AmountCalculator.calcTaxAmount(
  	                   dataStruct.getNET_AMOUNT(),
  	                   ts.getTAX_RATE_2(),
  	                   ts.getTAX_ROUND_TYP(),
  	                   cs.getDECIMAL_FIG());
  	                 dataStruct.setTAX_AMOUNT_2(taxAmount2);
  	                 // ��Ŋz3��̌v�Z
  	                 String taxAmount3 =
  	                  AmountCalculator.calcTaxAmount(
  	                   dataStruct.getNET_AMOUNT(),
  	                   ts.getTAX_RATE_3(),
  	                   ts.getTAX_ROUND_TYP(),
  	                   cs.getDECIMAL_FIG());
  	                 dataStruct.setTAX_AMOUNT_3(taxAmount3);
  	                 // ��ō����z��̌v�Z
  	                 String amountIncludeTax =
  	                  AmountCalculator.calcAmountIncludeTax(
  	                   dataStruct.getNET_AMOUNT(),
  	                   dataStruct.getTAX_AMOUNT_1(),
  	                   dataStruct.getTAX_AMOUNT_2(),
  	                   dataStruct.getTAX_AMOUNT_3());
  	                 dataStruct.setAMOUNT_INCLUDE_TAX(amountIncludeTax);
  	                 if(!isNotInNumRange(amountIncludeTax, 14, 4)){
  	  		          	errCode = "AA00215";
  	  		          	//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
  	  		          	err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
  	  		          	writeLog(ERROR,errCode,err_commt);	
  	  		          	_intErrorCount++;
  	  		          	continue;  	  		          	
  	                 }
                 }
                 // ��M�݋��z��̌v�Z
                 String homeCurAmount =
                  AmountCalculator.calcHomeCurAmount(
                   dataStruct.getAMOUNT_INCLUDE_TAX(),
                   dataStruct.getEXCH_RATE(),
                   cs.getROUND_TYP(),
                   _homeCurStruct.getDECIMAL_FIG());
                 dataStruct.setHOME_CUR_AMOUNT(homeCurAmount);
                 if(!isNotInNumRange(homeCurAmount, 14, 4)){	    
		        	errCode = "AA00215";
		        	//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
		        	err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
		        	writeLog(ERROR,errCode,err_commt);	
		        	_intErrorCount++;
		        	continue;
                 }
                 // ���i�����ł��A��i�ڔԍ����Null�̏ꍇ�͈ȉ��̏������s��Ȃ�
                 if(itemCheckFlg){
             		errCode = "AE00034";
             		//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
             		err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
             		writeLog(WARNING,errCode,err_commt);	
             		_intWarningCount++;
                 }
                 // [CSV���]�D�h�i�ڔԍ��h��[�i��] ���������A[�i��].�g�i�ڎ�z�敪�h ��1�F���� �܂�2�F�݌Ɉ����^����
                 if (("1".equals(itemStruct.getMRP_ODR_TYP())) || ("2".equals(itemStruct.getMRP_ODR_TYP()))){
                	 // [���Ԍv��].�g�[���h �� [CSV���]�D�h�����[���h����[���Ԍv��].�g�[���h���Ɩ��^�p�����ߋ��̏ꍇ
                	 if(DateTool.compareYMD(dataStruct.getPUCH_ODR_DLV_DATE(),jobOdrStruct.getJOB_ODR_DLV_DATE())> 0){
                		 if(DateTool.compareYMD(jobOdrStruct.getJOB_ODR_DLV_DATE(),dcs.getBUSINESS_OPR_DATE()) < 0){
                				errCode = "AE32605";
                				//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
                				err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
                				writeLog(WARNING,errCode,err_commt);	
                				_intWarningCount++;
       					 }
      				 }
                 }
                 if(isNull(dataStruct.getUNIT_COST())){
                	 dataStruct.setUNIT_COST("0");
                 }
                 if(isNull(dataStruct.getPROCESSING_COST())){
                	 dataStruct.setPROCESSING_COST("0");
                 }
                 if(isNull(dataStruct.getMATERIAL_COST())){
                	 dataStruct.setMATERIAL_COST("0");
                 }
                 if(isNull(dataStruct.getOTHER_OVERHEADS())){
                	 dataStruct.setOTHER_OVERHEADS("0");
                 }
                 // �u�P���v �� �i�u���H��v �{ �u�ޗ���v �{ �u���̑��o��v�j�̏ꍇ
                 if(Calculate.compare(dataStruct.getUNIT_COST(),
                		 Calculate.add(dataStruct.getPROCESSING_COST(), 
                				 Calculate.add(dataStruct.getMATERIAL_COST(),dataStruct.getOTHER_OVERHEADS()))) == -1){
             		errCode = "AE05074";
             		//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
             		err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
             		writeLog(WARNING,errCode,err_commt);	
             		_intWarningCount++;                	 	
                 }
                 
                 // [CSV���]�D�h�����\����h��null�̏ꍇ
 				if(isNull(dataStruct.getL_PUCH_ODR_START_DATE())){ 					
 					errCode = "AD34041";
 					//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
 					err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
 					writeLog(WARNING,errCode,err_commt);	
 					_intWarningCount++;

 				}
 				
 				//20150806 ADD START BY SYSCOM
				//�ȖڃR�[�h�����͂���Ă���ꍇ
				//[CSV���]�D�h���i�����t���O�h��1:���i�����̏ꍇ���A[CSV���]�D�h�ȖڃR�[�h�h�����͂���Ă���ꍇ
				if("1".equals(dataStruct.getNON_NO_ITEM_FLG()) && !isNull(dataStruct.getACCT_CD())){
					//�ȖڃR�[�h������
					List acct_cdList = entity.mselectV_ACCT_CD.read(conn, dataStruct);
					// ���݂��Ȃ��ꍇ
         			if (acct_cdList.isEmpty()) {
                    	errCode = "AE25026";
                    	//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
                    	err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
                    	writeLog(ERROR,errCode,err_commt);
                    	_intErrorCount++;
                    	continue;
         			}
				}
				//���S����R�[�h������Ă���ꍇ
				//[CSV���]�D�h���i�����t���O�h��1:���i�����̏ꍇ���A[CSV���]�D�h���S����R�[�h�h�����͂���Ă���ꍇ�A
				if("1".equals(dataStruct.getNON_NO_ITEM_FLG()) && !isNull(dataStruct.getDEPT_CD())){
					//���S����R�[�h������
         			List dept_cdList = entity.mselectV_DEPT_CD.read(conn, dataStruct);
					// ���݂��Ȃ��ꍇ
         			if (dept_cdList.isEmpty()) {
                    	errCode = "AA23603";
                    	//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
                    	err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
                    	writeLog(ERROR,errCode,err_commt);
                    	_intErrorCount++;
                    	continue;    
         			}
				}
				
				//�v���W�F�N�g�R�[�h�����͂���Ă���ꍇ
				//[CSV���]�D�h���i�����t���O�h��1:���i�����̏ꍇ���A[CSV���]�D�h�v���W�F�N�g�R�[�h�h�����͂���Ă���ꍇ
				if("1".equals(dataStruct.getNON_NO_ITEM_FLG()) && !isNull(dataStruct.getPJ_CD())){
					//�v���W�F�N�g�R�[�h������
         			List pj_cdList = entity.mselectV_PJ_CD.read(conn, dataStruct);
					// ���݂��Ȃ��ꍇ
         			if (pj_cdList.isEmpty()) {
                    	errCode = "AA23608";
                    	//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
                    	err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
                    	writeLog(ERROR,errCode,err_commt);
                    	_intErrorCount++;
                    	continue;    
         			}
				}
				
				//�Z�O�����g1�����͂���Ă���ꍇ
				//[CSV���]�D�h���i�����t���O�h��1:���i�����̏ꍇ���A[CSV���]�D�h�Z�O�����g1�h�����͂���Ă���ꍇ
				if("1".equals(dataStruct.getNON_NO_ITEM_FLG()) && !isNull(dataStruct.getSEG_CONTENTS1())){
					//�Z�O�����g1������
					List seg_1List = entity.mselectV_SEG_CONTENTS_1.read(conn, dataStruct);
					// ���݂��Ȃ��ꍇ
         			if (seg_1List.isEmpty()) {
                    	errCode = "AA23604";
                    	//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
                    	err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
                    	writeLog(ERROR,errCode,err_commt);
                    	_intErrorCount++;
                    	continue;    
         			}
				}
				
				//�Z�O�����g2�����͂���Ă���ꍇ
				//[CSV���]�D�h���i�����t���O�h��1:���i�����̏ꍇ���A[CSV���]�D�h�Z�O�����g2�h�����͂���Ă���ꍇ
				if("1".equals(dataStruct.getNON_NO_ITEM_FLG()) && !isNull(dataStruct.getSEG_CONTENTS2())){
					//�Z�O�����g2������
					List seg_2List = entity.mselectV_SEG_CONTENTS_2.read(conn, dataStruct);
					// ���݂��Ȃ��ꍇ
         			if (seg_2List.isEmpty()) {
                    	errCode = "AA23605";
                    	//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
                    	err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
                    	writeLog(ERROR,errCode,err_commt);
                    	_intErrorCount++;
                    	continue;             				
         			}
				}
				
				//�Z�O�����g3�����͂���Ă���ꍇ
				//[CSV���]�D�h���i�����t���O�h��1:���i�����̏ꍇ���A[CSV���]�D�h�Z�O�����g3�h�����͂���Ă���ꍇ
				if("1".equals(dataStruct.getNON_NO_ITEM_FLG()) && !isNull(dataStruct.getSEG_CONTENTS3())){
					//�Z�O�����g3������
					List seg_3List = entity.mselectV_SEG_CONTENTS_3.read(conn, dataStruct);
					// ���݂��Ȃ��ꍇ
         			if (seg_3List.isEmpty()) {
                    	errCode = "AA23606";
                    	//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
                    	err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
                    	writeLog(ERROR,errCode,err_commt);
                    	_intErrorCount++;
                    	continue;          				
         			}
				}
				
				//�Z�O�����g4�����͂���Ă���ꍇ
				//[CSV���]�D�h���i�����t���O�h��1:���i�����̏ꍇ���A[CSV���]�D�h�Z�O�����g4�h�����͂���Ă���ꍇ
				if("1".equals(dataStruct.getNON_NO_ITEM_FLG()) && !isNull(dataStruct.getSEG_CONTENTS4())){
					//�Z�O�����g4������
					List seg_4List = entity.mselectV_SEG_CONTENTS_4.read(conn, dataStruct);
					
					// ���݂��Ȃ��ꍇ
         			if (seg_4List.isEmpty()) {
                    	errCode = "AA23607";
                    	//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
                    	err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
                    	writeLog(ERROR,errCode,err_commt);
                    	_intErrorCount++;
                    	continue;   
         			}
				}
//20150806 ADD END BY SYSCOM
 				
                 dataStruct.setTAX_CD(ts.getTAX_CD());                   // ����ŃR�[�h
                 dataStruct.setTAX_RATE_1(ts.getTAX_RATE_1());           // �ŗ�1
                 dataStruct.setTAX_RATE_2(ts.getTAX_RATE_2());           // �ŗ�2
                 dataStruct.setTAX_RATE_3(ts.getTAX_RATE_3());           // �ŗ�3
                 dataStruct.setTAX_ROUND_TYP(ts.getTAX_ROUND_TYP());     // �Œ[���敪
                 // ��������������敪
                 // ���i�ȊO�A�܂��͔��i�ŕi�ڂ���̏ꍇ
                 if("0".equals(dataStruct.getNON_NO_ITEM_FLG()) ||("1".equals(dataStruct.getNON_NO_ITEM_FLG()) && !isNull(dataStruct.getITEM_CD()))){
                	 // �m�i�ځn�D�h��������敪�h��ݒ�
                	 dataStruct.setACPT_INSPC_TYP(itemStruct.getACPT_INSPC_TYP());
                 }else{
                	 // �P�F����݂̂�ݒ�
                	 dataStruct.setACPT_INSPC_TYP("1");
                 }
                 // ��ЃR�[�h
                 dataStruct.setCOMPANY_CD(_company_cd);
                 // �H��R�[�h
                 dataStruct.setPLANT_CD(this.getSysPlantCd());
                 // �����S����
                 dataStruct.setPUCH_ODR_PERSON(this.getSysUserCd());
                 // �l�����z
                 String discAmount =
                  AmountCalculator.calcDiscAmount(
                		  dataStruct.getPUCH_ODR_AMOUNT(),
                          dataStruct.getNET_AMOUNT());
                 dataStruct.setDISC_AMOUNT(discAmount);
							        
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
	 * CSV�t�@�C���i�����v��捞�j�̓��e��o�^
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

	        // �����c�o�^�������J�n���܂����B
	        writeLog(INFOMATION,"AE60007");
	        
			for (int i = 0; i < csvList.size(); i++) {
				warningFlg = false;
				AE0180010Struct cvsStruct = (AE0180010Struct)csvList.get(i);

				 // �V�X�e���p�����[�^�iTIME_CTRL�j�擾
				 AE0180010Struct TIME_CTRLStruct = new AE0180010Struct();
				 List TIME_CTRLList = entity.mselectTIME_CTRL.read(conn, TIME_CTRLStruct);
				 if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
			 		TIME_CTRLStruct = (AE0180010Struct)TIME_CTRLList.get(0);
			 		cvsStruct.setTIME_CTRL(TIME_CTRLStruct.getTIME_CTRL());
				 }else{
					 cvsStruct.setTIME_CTRL("false");
				 }
				 
				// ���Ԃ��Ȃ��ꍇ
				if(isNull(cvsStruct.getJOB_ODR_CD())){
					// CSV�t�@�C�����e�����ɔ����c�o�^����
					rtnFlg = insertRlsdPuchOdr (cvsStruct,i);
					if(!rtnFlg) {
						conn.rollback();
						//�����c�o�^�������ُ�I�����܂����B
						 writeLog(INFOMATION, "AE60009");	
						return false;
					}
				// ���ԏꍇ
				}else{
					// CSV�t�@�C�����e�����ɔ����c�o�^����
					rtnFlg = insertRlsdPuchOdrJob (cvsStruct,i);
					if(!rtnFlg) {
						conn.rollback();
						//�����c�o�^�������ُ�I�����܂����B
						 writeLog(INFOMATION, "AE60009");	
						return false;
					}
				}
			}
			//  �o�^����������ɏI�������ꍇ
			_intSuccessCount = csvList.size();
	        String succCommt = "(SBM1701)�Ǎ������@=�@[" + _intTotalCount + "] "
	        				 + "�o�^�����@=�@[" + _intSuccessCount + "] ";
	        //�����c�o�^�����𐳏�ɏI�����܂����B
	        writeLog(INFOMATION, "AE60008", succCommt);	
			// �g�����U�N�V�����̊J�n
			conn.beginTransWeb();
			conn.commit();
			return true;
		} catch (Exception e) {
			conn.rollback();;
			throw new ExpjException(e);
		}
		
	}
	
	/**
	 * ���Ԃ��Ȃ��ꍇ�ACSV�t�@�C���i�����v��捞�j�̓��e�����ɔ����c�o�^����
	 * @param csvList
	 * @return
	 * @throws FoundationException 
	 */
	private boolean insertRlsdPuchOdr (AE0180010Struct adstruct ,int j) throws ExpjException {
		try {
			String PUCH_ODR_DLV_TIME = null;
			String PUCH_ODR_START_TIME = null;
			String CONFIRM_DLV_TIME = null;
			adstruct.setsUser_ID(getSysUserCd());
			// ���͎����̃`�F�b�N(�����Ǘ�����ꍇ�̂�)
			if ("true".equals(adstruct.getTIME_CTRL())) {
				PUCH_ODR_DLV_TIME = "2359";
				PUCH_ODR_START_TIME = "2359";
				CONFIRM_DLV_TIME = "2359";
			} else {
				// �����Ǘ����Ȃ��ꍇ��0000�ɐݒ�
				PUCH_ODR_DLV_TIME = "0000";
				PUCH_ODR_START_TIME = "0000";
				CONFIRM_DLV_TIME = "0000";
			}
			/** �����\����i�����܂ށj*/
			adstruct.setPUCH_ODR_START_DATE(adstruct.getPUCH_ODR_START_DATE() + " " + PUCH_ODR_START_TIME);
			 /** �����[���i�����܂ށj*/
			adstruct.setPUCH_ODR_DLV_DATE(adstruct.getPUCH_ODR_DLV_DATE() + " " + PUCH_ODR_DLV_TIME);
			 /** �����񓚔[���i�����܂ށj*/
            if(adstruct.getCONFIRM_DLV_DATE() != null && !("".equals(adstruct.getCONFIRM_DLV_DATE()))){
            	adstruct.setCONFIRM_DLV_DATE(adstruct.getCONFIRM_DLV_DATE() + " " + CONFIRM_DLV_TIME);
            }
			// �I�[�_�[�f�}���h�ԍ��������̔�
            // [���v��]�̍X�V
            if ("0".equals(adstruct.getNON_NO_ITEM_FLG())) {
           	    String odNoString = null;
                // ASPROVA�A�g�I�v�V�����������̏ꍇ�F���P�ʂ̃��[�h�^�C���v�Z���s���B
          	    if(!"1".equals(_SysInstallOptions_ASP)){
          	    	CommonOd od = new CommonOd(conn, getSysPlantCd(), getSysUserCd(), getSysProgramId());
          	  		odNoString =
          	  			od.addOdInfo(
          	  				adstruct.getITEM_CD(),
          	  					Converter.strToDate(
          	  						adstruct.getPUCH_ODR_DLV_DATE(), Converter.SLASH_DATE_HOUR_MINUTE),
          	  							Converter.strToDate(
          	  								adstruct.getPUCH_ODR_START_DATE(), Converter.SLASH_DATE_HOUR_MINUTE),
          	  									Double.parseDouble(adstruct.getPUCH_ODR_QTY()),
          	  									2);
          	  	// ASPROVA�A�g�I�v�V���������ς̏ꍇ�F���ԒP�ʂł̃��[�h�^�C���v�Z���s���B
          	  	}else{
	          	  	ATCommonOd od = new ATCommonOd(conn, getSysPlantCd(), getSysUserCd(), getSysProgramId());
	       	  		odNoString =
	       	  			od.addOdInfo(
	       	  				adstruct.getITEM_CD(),
	       	  					Converter.strToDate(
	       	  						adstruct.getPUCH_ODR_DLV_DATE(), Converter.SLASH_DATE_HOUR_MINUTE),
	       	  							Converter.strToDate(
	       	  								adstruct.getPUCH_ODR_START_DATE(), Converter.SLASH_DATE_HOUR_MINUTE),
				
	       	  									Double.parseDouble(adstruct.getPUCH_ODR_QTY()),
	       	  									2,
	       	  									new Integer("2").intValue());
          	  	}
          	  	// �I�[�_�[�f�}���h�ԍ��ݒ�
          	    adstruct.setOD_NO(odNoString);
          	    // ���i�����i�ږ�
          	    adstruct.setNON_NO_ITEM_NAME(null);
          	    // ���i�������i�敪
          	    adstruct.setNON_NO_ITEM_TYP("0");
          	    // ���i�����P��
          	    adstruct.setNON_NO_ITEM_PUCH_ODR_UNIT(null);
          	    // �݌ɊǗ��t���O
          	    adstruct.setINV_CTRL_FLG("1");
          	} else {
           	    // �I�[�_�[�f�}���h�ԍ��ݒ�
            	adstruct.setOD_NO(null);
          	    // �݌ɊǗ��t���O
          	    adstruct.setINV_CTRL_FLG("0");
          	    // ���H��
          	    adstruct.setPROCESSING_COST("0");
          	    // �ޗ���
          	    adstruct.setMATERIAL_COST("0");
          	    // ���̑��o��
          	    adstruct.setOTHER_OVERHEADS("0");
          	}
            // �����ԍ��������̔�
            Numbering puchCdNumbering =
             new Numbering(
              conn,
              Numbering.PUCH_CD,
              getSysUserCd(),
              getSysProgramId(),
              getSysPlantCd());
            adstruct.setPUCH_ODR_CD(puchCdNumbering.getNo());
            if (isNull(adstruct.getPUCH_ODR_CD())) {
				//�̔Ԍ��ʂ��Ȃ�
				writeLogFiles(ERROR, "ZZ01106");
				_intErrorCount++;
				return false;
			}
            // [�����c]��o�^
            entity.minsertT_RLSD_PUCH_ODR.create(conn, adstruct);
            return true;
		}catch(Exception e) {
			throw new ExpjException(e);
		}
	}	
	
	/**
	 * ���ԏꍇ�ACSV�t�@�C���i�����v��捞�j�̓��e�����ɔ����c�o�^����
	 * @param csvList
	 * @return
	 * @throws FoundationException 
	 */
	private boolean insertRlsdPuchOdrJob (AE0180010Struct adstruct ,int j) throws ExpjException {
		try {
			String PUCH_ODR_DLV_TIME = null;
			String PUCH_ODR_START_TIME = null;
			String CONFIRM_DLV_TIME = null;
			adstruct.setsUser_ID(getSysUserCd());
			
			// ���͎����̃`�F�b�N(�����Ǘ�����ꍇ�̂�)
			if ("true".equals(adstruct.getTIME_CTRL())) {
				PUCH_ODR_DLV_TIME = "2359";
				PUCH_ODR_START_TIME = "2359";
				CONFIRM_DLV_TIME = "2359";
			} else {
				// �����Ǘ����Ȃ��ꍇ��0000�ɐݒ�
				PUCH_ODR_DLV_TIME = "0000";
				PUCH_ODR_START_TIME = "0000";
				CONFIRM_DLV_TIME = "0000";
			}
			/** �����\����i�����܂ށj*/
			adstruct.setPUCH_ODR_START_DATE(adstruct.getPUCH_ODR_START_DATE() + " " + PUCH_ODR_START_TIME);
			 /** �����[���i�����܂ށj*/
			adstruct.setPUCH_ODR_DLV_DATE(adstruct.getPUCH_ODR_DLV_DATE() + " " + PUCH_ODR_DLV_TIME);
			 /** �����񓚔[���i�����܂ށj*/
            if(adstruct.getCONFIRM_DLV_DATE() != null && !("".equals(adstruct.getCONFIRM_DLV_DATE()))){
            	adstruct.setCONFIRM_DLV_DATE(adstruct.getCONFIRM_DLV_DATE() + " " + CONFIRM_DLV_TIME);
            }
            // ���i�����i�ږ�
      	    adstruct.setNON_NO_ITEM_NAME(null);
      	    // ���i�������i�敪
      	    adstruct.setNON_NO_ITEM_TYP("0");
      	    // ���i�����P��
      	    adstruct.setNON_NO_ITEM_PUCH_ODR_UNIT(null);
      	    // �݌ɊǗ��t���O
      	    adstruct.setINV_CTRL_FLG("1");
      	    // ���i�����t���O
      	    adstruct.setNON_NO_ITEM_FLG("0");
			// ������ԍ���������̔�
			Numbering puchCdNumbering =
					new Numbering(
							conn,
							Numbering.PUCH_CD,
							getSysUserCd(),
							getSysProgramId(),
							getSysPlantCd());
			adstruct.setPUCH_ODR_CD(puchCdNumbering.getNo());
			if (isNull(adstruct.getPUCH_ODR_CD())) {
				//�̔Ԍ��ʂ��Ȃ�				
				writeLogFiles(ERROR, "ZZ01106");
				_intErrorCount++;
				return false;
			}
			// [�����c]��o�^
			int nRet = entity.minsertT_RLSD_PUCH_ODR.create(conn, adstruct);

			// [���v��]�̃I�[�_���̍X�V
			CommonOd od = new CommonOd(conn, getSysPlantCd(), getSysUserCd(), getSysProgramId());
			od.changeOdInfo(adstruct.getOD_NO(), -1);
			return true;
		}catch(Exception e) {
			throw new ExpjException(e);
		}
	}

	//////////////////////////////

	/**
	 * main�F ���[�U��`�p���\�b�h�ł�<br>
	 * <<�������L�q���Ă�������>>
	 *
	 * @return <<�������L�q���Ă�������>>
	 * @exception <<�������L�q���Ă�������>>
	 */
	public int main() throws BatchAppException, BusinessProcessException, FoundationException
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
			m_med.setFUNCTION_NAME("SQLPUCHODRINTERFACE");
			
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
			callList = m_med.getSQLPUCHODRINTERFACE().call();
			// PL/SQL�̎��s���ʂ��擾
			medAE0180B001 resultMed = (medAE0180B001) callList.get(0);
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
		
			// [�����v��捞]�̃f�[�^���擾
			List listTPuchOdrTemp = new ArrayList();
			listTPuchOdrTemp = selectTPuchOdrTemp();
			
			// ��ЃR�[�h�擾
			int nret1 = m_med.getSYS_MY_COMPANY().read();
			if (!m_med.getSYS_MY_COMPANY().next()) {
				
				writeLog(ERROR, "VK34002");
				return BREAK;
			}
			_company_cd = m_med.getCOMPANY_CD();
			
            // [�M��]���𕔕i���擾			
            _homeCurStruct = HomeCurControl.getData(conn);
            
			// [�����v��捞]�̃f�[�^���擾����
			if (listTPuchOdrTemp != null) {
				//�}�X�^�������`�F�b�N���{
				if(check_listTPuchOdrTemp(listTPuchOdrTemp)){
	             // �o�^����
					if(insertCsvDate(listTPuchOdrTemp)) {
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
			    m_med.getdeleteT_PUCH_ODR_TEMP().delete();
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
			entity = new AE0180010Entity();
						
		} catch (FoundationException e) {
			//TODO �ُ�I��
		}catch(Exception e) {
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
		public medAE0180B001 m_med=null;

		/**
		 * �R���e�i�N���X�C���X�^���X
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medAE0180B001 med) throws BatchAppException
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
