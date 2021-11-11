/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0150/src/com/nec/jp/orteus/metamorBase/AD0150/AD0150B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0150.AD0150B001;

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
import com.nec.jp.orteus.metamorBase.AD0150.AD0150010Entity;
import com.nec.jp.orteus.metamorBase.AD0150.AD0150010Struct;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlStruct;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.msg.util.Business;
import com.nec.jp.orteus.expj.util.CommonOd;
import com.nec.jp.orteus.expj.util.Converter;
import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.expj.util.ExpjException;
import com.nec.jp.orteus.expj.util.Numbering;
import com.nec.jp.orteus.expj.util.ScreenParam;
import com.nec.jp.orteus.expj.util.WorkCalendar;
import com.nec.jp.orteus.expj.util.WorkDay;
import java.math.BigDecimal;
import com.nec.jp.orteus.xaf.wa.BusinessProcessException;
import java.util.Date;
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain �N���X
 * �t�@�C���E�N���X����
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.4 $ $Date: 2016/05/23 08:03:53 $
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
	public medAD0150B001 m_med=null;

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
	public CtrlMain(medAD0150B001 med, BatchAppConductor cdr) throws BatchAppException
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
	public CtrlMain(medAD0150B001 med) throws BatchAppException
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
     * @return �Ɩ�ID
     */
    private String getCsvTakeTyp() {
     return m_med.getArgs()[4];
    }
    
    /**
     * �o�b�`�p�����[�^(����6)�捞�t�@�C���p�X��Ԃ��܂��B
     * @return �Ɩ�ID
     */
    private String getCsvTakePath() {
     return m_med.getArgs()[5];
    }
    
    /**
     * �o�b�`�p�����[�^(����7)�o�b�N�A�b�v�t�H���_�p�X��Ԃ��܂��B
     * @return �Ɩ�ID
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
    
	/** �h���C�u���^�[�ϊ������� **/
	private char _driveLetterChangeCharBefore;
	/** �h���C�u���^�[�ϊ��敶�� **/
	private char _driveLetterChangeCharAfter;
	/** DB�T�[�o�� */
	private String _strDbServerName;
    
    /**AD0150 entity*/
    AD0150010Struct struct = null;
	protected AD0150010Entity entity;
	
	/** ���b�N���s�����b�N�L�[ */
	private static final int LOCK_FAILD = -1;
	
	/** �Ɩ����b�N�N���X */
	private BusinessLock lock = null;
		
	/** �Ɩ��^�p��*/
	private String _btmBusinessOprDate;
	
	/** ���t�����p */
	DateFormat _df = DateFormat.getDateInstance();
	
	private static final int INFOMATION = 0;
	/** ���O���x�� ���[�j���O */
	private static final int WARNING = 1;
	/** ���O���x�� �G���[ */
	private static final int ERROR = 2;
	
	// �i�ڕʐ����[���p
	String WORK_ODR_DLV_DATE_TIME = "0000";	
	//�i�ڕʐ���������p
	String OPR_INST_START_DATE_TIME = "0000";
	// �����Ǘ��p�t���O
	private String _flgTimeCtrl = null;
	public AD0150010Struct mItemStruct = new AD0150010Struct();
	public AD0150010Struct jobodrStruct = new AD0150010Struct();
//	private Business business;
	
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
	 * CSV�t�@�C�����e�́A�i�ڕʎd�|�o�^����
	 * @param csvList
	 * @return
	 * @throws FoundationException 
	 */
	private boolean insertT_WORK_IN_PROC_BY_ITEM (AD0150010Struct adstruct ,int j) throws ExpjException {
		try {
			if (isNull(adstruct.getWORK_ODR_CD())) {
				// ��ƌv��ԍ��̔ԏ������s���B

				Numbering MyNo = new Numbering(conn,CollectNumber.ODR_CD,getSysUserCd(),getSysProgramId(),getSysPlantCd());
				String strWorkOdrCd = MyNo.getNo();
				if (isNull(strWorkOdrCd)) {
					//�̔Ԍ��ʂ��Ȃ�
					writeLogFiles(ERROR, "ZZ01106");
					_intErrorCount++;
					return false;
				} else {
					adstruct.setWORK_ODR_CD(strWorkOdrCd);
				}
			}
			
			// ��Ɛ����[��
			adstruct.setWORK_ODR_DLV_DATE(adstruct.getWORK_ODR_DLV_DATE() + " " + WORK_ODR_DLV_DATE_TIME);
			// ��Ɛ��������
			adstruct.setOPR_INST_START_DATE(adstruct.getOPR_INST_START_DATE() + " " + OPR_INST_START_DATE_TIME);
			
			// ��Ǝw����
			// [�i��].�݌ɐ��ʒP�ʋ敪=1�Łu��Ǝw�����v�ɏ��������͂��ꂽ�ꍇ�A
			// �؂�グ����������
			BigDecimal OprInstQty_up = new BigDecimal(adstruct.getOPR_INST_QTY());
			if ("1".equals(mItemStruct.getUNIT_QTY_TYP())) {
				BigDecimal OprInstQty2 = new BigDecimal("0");
				OprInstQty2 = OprInstQty_up.setScale(0,BigDecimal.ROUND_UP);
				//�؂�グ�����O�ƌ�Œl���قȂ��Ă�����
				//���������͂���Ă����Ɣ��f�����[�j���O
				if ( OprInstQty_up.doubleValue() != OprInstQty2.doubleValue()) {
					//	�i�ڂ������Ǘ��i�̏ꍇ�A�؏グ���s��
					OprInstQty_up = OprInstQty_up.setScale(0, BigDecimal.ROUND_UP);
				}
			}
			adstruct.setOPR_INST_QTY(OprInstQty_up.toString());
			// �i�ڕʍ�Ə�ԋ敪
			adstruct.setWORK_STS_TYP("1");
			// ��ƌn��W�J�σt���O
			adstruct.setPROC_EXPLOSION_FLG("0");
			
			// �i�ڕʍ�Ǝ��ы敪
			adstruct.setOPR_RSLT_TYP(mItemStruct.getOPR_RSLT_TYP());
			
			// ��Ǝw���ԍ�
			// [�i��].�g��Ǝ��ы敪�h���A1�F�o�������� �̏ꍇ�A�u��Ǝw���ԍ��v
			if ("1".equals(mItemStruct.getOPR_RSLT_TYP())) {
				
			}else if ("2".equals(mItemStruct.getOPR_RSLT_TYP())) {
				// 2�F��Ǝw�����с@�̏ꍇ�ANull
				adstruct.setOPR_INST_CD("");
			}
			// �H��R�[�h
			adstruct.setPLANT_CD(getSysPlantCd());
			
			// [�i�ڕʎd�|]�ւ̒ǉ����e
			entity.minsertT_WORK_IN_PROC_BY_ITEM.create(conn, adstruct);
			return true;
		}catch(Exception e) {
			throw new ExpjException(e);
		}
	}
	
	/**
	 * CSV�t�F�C�����e�́A��Ǝw���`�[�o�^����
	 * @param csvList
	 * @return
	 * @throws FoundationException 
	 */
	private boolean insertT_OPR_INST_SLIP (AD0150010Struct adstruct ,int j) throws ExpjException {
		try {
			if (isNull(adstruct.getOPR_INST_CD())) {
				// ��Ǝw���ԍ��̔ԏ������s���B
				Numbering MyNo = new Numbering(conn,CollectNumber.INST_CD,getSysUserCd(),getSysProgramId(),getSysPlantCd());
				String strOprInstCd = MyNo.getNo();
				if (isNull(strOprInstCd)) {
					//�̔Ԍ��ʂ��Ȃ�
					writeLogFiles(ERROR, "ZZ01106");
					_intErrorCount++;
					return false;
				} else {
					adstruct.setOPR_INST_CD(strOprInstCd);
				}
			}
			// ��Ǝw���ԍ������敪
			adstruct.setOPR_INST_CD_GNR_TYP("1");
			// ��Ǝw���`�[���s�ς݃t���O
			adstruct.setOPR_INST_SLIP_ISS_FLG("0");
			// �H��R�[�h
			adstruct.setPLANT_CD(getSysPlantCd());
			
			// [��Ǝw���`�[]�ւ̒ǉ����e
			entity.minsertT_OPR_INST_SLIP.create(conn, adstruct);
			return true;
		}catch(Exception e) {
			throw new ExpjException(e);
		}
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
	 * ��ƌv��捞�f�[�^�擾
     * @return	oprRsltList     ��ƌv��捞���X�g
	 * @throws BatchAppException 
	 * @throws SQLException 
	 * @throws FoundationException 
	 */
	private List selectTWorkOdrTemp() throws BatchAppException {
		List rtnList = new ArrayList();
		AD0150010Struct structdata = null;
		m_med.getT_WORK_ODR_TEMP().read();
		while(m_med.getT_WORK_ODR_TEMP().next()) {
			structdata = new AD0150010Struct();
			structdata.setITEM_CD(m_med.getITEM_CD());
			structdata.setWORK_ODR_DLV_DATE(m_med.getPRD_DUE_DATE());
			structdata.setOPR_INST_START_DATE(m_med.getPRD_START_DATE());
			structdata.setOPR_INST_QTY(m_med.getOPR_INST_QTY());
			structdata.setWS_CD(m_med.getWS_CD());
			structdata.setJOB_ODR_CD(m_med.getJOB_ODR_CD());
			structdata.setWORK_IN_PROC_COMMENT(m_med.getWK_IN_PROC_BY_ITEM_COMMENT());
			rtnList.add(structdata);
		}
		return rtnList;
	}
	
	/**
	 * ��ƌv��捞�f�[�^�̃}�X�^�������`�F�b�N
	 * @param csvList
	 * @return
	 * @throws BusinessProcessException
	 * @throws FoundationException
	 */
	private boolean check_listTWorkOdrTemp(List dataList) throws Exception {
		
		// �S�����R�[�h��
		_intTotalCount = dataList.size();
		AD0150010Struct dataStruct = new AD0150010Struct();
		//�G���[�s�ԍ�
		String errorNumber = "0";
		//�Ɩ����b�Z�[�W�p�G���[�s�ԍ�
		String err_commt ="";
		try{
			for (int i = 0; i < dataList.size(); i++)	{
				dataStruct = (AD0150010Struct)dataList.get(i);
				errorNumber =String.valueOf(i+1);
				// ���������
				Date OprInstStartDatetemp = null;
				// �����[��
				Date workOdrDlvDatetemp = null;		
				if (!isNull(dataStruct.getOPR_INST_START_DATE())) {
					OprInstStartDatetemp = _df.parse(dataStruct.getOPR_INST_START_DATE());
				}
				if (!isNull(dataStruct.getWORK_ODR_DLV_DATE())) {
					workOdrDlvDatetemp = _df.parse(dataStruct.getWORK_ODR_DLV_DATE());
				}
				
				// �u�i�ڔԍ��v �ɓ��͂��ꂽ�l�� [�i��] �ɑ��݂��Ȃ��ꍇ
				List itemCdList = entity.mselectItem_CD.read(conn, dataStruct);

				if (itemCdList.isEmpty()) {
					errCode = "AD00019";
					//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
					err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
					writeLog(ERROR,errCode,err_commt);	
					_intErrorCount++;
					continue;
				}else{
					mItemStruct = (AD0150010Struct)itemCdList.get(0);
					// ���͂��ꂽ [�i��] �� �g�i�ڎ�z�敪�h ��	3�F���� 8�F�[���i�� �̏ꍇ
					if ("3".equals(mItemStruct.getMRP_ODR_TYP()) 
							|| "8".equals(mItemStruct.getMRP_ODR_TYP())) {
						errCode = "AD32217";
						//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
						err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}	
				}
				// �u�����[���v �ɋx�������͂��ꂽ�ꍇ
				String strWorkOdrDlvDate = Converter.dateToStr(workOdrDlvDatetemp, "yyyy/MM/dd");
				dataStruct.setDATE(strWorkOdrDlvDate);
				dataStruct.setPLANT_CD(getSysPlantCd());
				//�i�ڔԍ��������L�[�Ƃ��ēǍ�
				List dateList = entity.mSelectM_CAL1.read(conn,dataStruct);
				if (dateList.isEmpty()) {
					//�H��R�[�h�������L�[�Ƃ��ēǍ�
					dateList = entity.mselectM_CAL.read(conn,dataStruct);
					if(dateList.isEmpty()){
						//�f�[�^�����݂��Ȃ�
						errCode = "KQ00325";
						//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
						err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}else{
						AD0150010Struct dateStruct = (AD0150010Struct)dateList.get(0);
						if ("1".equals(dateStruct.getHOLIDAY_FLG())) {
							errCode = "AD00036";
							//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
							err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
							writeLog(ERROR,errCode,err_commt);	
							_intErrorCount++;
							continue;
						}
					}
				}else{
					AD0150010Struct dateStruct = (AD0150010Struct)dateList.get(0);
					if ("1".equals(dateStruct.getHOLIDAY_FLG())) {
						errCode = "AD00036";
						//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
						err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}
				}
				
				// �u����������v �ɋx�������͂��ꂽ�ꍇ
				if (!isNull(dataStruct.getOPR_INST_START_DATE())) {
					//���͂��ꂽ������������x���������ꍇ�G���[
					String strOprInstStartDate = Converter.dateToStr(OprInstStartDatetemp, "yyyy/MM/dd");
					dataStruct.setDATE(strOprInstStartDate);
					//�i�ڔԍ��������L�[�Ƃ��ēǍ�
					List dateList2 = entity.mSelectM_CAL1.read(conn,dataStruct);
					if (dateList2.isEmpty()) {
						//�H��R�[�h�������L�[�Ƃ��ēǍ�
						dateList2 = entity.mselectM_CAL.read(conn,dataStruct);
						if(dateList2.isEmpty()){
							//�f�[�^�����݂��Ȃ�
							errCode = "KQ00325";
							//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
							err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
							writeLog(ERROR,errCode,err_commt);	
							_intErrorCount++;	
							continue;
						} else {
							AD0150010Struct dateStruct2 = (AD0150010Struct)dateList2.get(0);
							if ("1".equals(dateStruct2.getHOLIDAY_FLG())) {
								errCode = "AD00038";
								//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
								err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
								writeLog(ERROR,errCode,err_commt);	
								_intErrorCount++;
								continue;
							}
						}
					}else{
						AD0150010Struct dateStruct2 = (AD0150010Struct)dateList2.get(0);
						if ("1".equals(dateStruct2.getHOLIDAY_FLG())) {
							errCode = "AD00038";
							//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
							err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
							writeLog(ERROR,errCode,err_commt);	
							_intErrorCount++;
							continue;
						}
					}
					
					// �u�����[���v �� �u����������v�̏ꍇ
					if (workOdrDlvDatetemp.compareTo(OprInstStartDatetemp) < 0) {
						errCode = "AD32156";
						//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
						err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}
				}
				
				// �u��Ǝw�����v �� 0�̏ꍇ
				if ("0".equals(dataStruct.getOPR_INST_QTY())) {
					errCode = "AD30222";
					//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
					err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
					writeLog(ERROR,errCode,err_commt);	
					_intErrorCount++;
					continue;
				}
				
				// [��Ƌ�] �ɑ��݂��Ȃ���Ƌ�R�[�h����͂����ꍇ
				if (!isNull(dataStruct.getWS_CD())) {
					List wsCdList = entity.mselectM_WS.read(conn, dataStruct);
					AD0150010Struct wsCdStruct = new AD0150010Struct();
					if (wsCdList.isEmpty()) {
						errCode = "AD20029";
						//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
						err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}else{
						wsCdStruct = (AD0150010Struct)wsCdList.get(0);
						// �u��Ƌ�R�[�h�v�ɑ΂���H��R�[�h�Ɓu�H��R�[�h�v����v���Ȃ��ꍇ
						if (!getSysPlantCd().equals(wsCdStruct.getvc2PLANT_CD())) {
							errCode = "AD00004";
							//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
							err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
							writeLog(ERROR,errCode,err_commt);	
							_intErrorCount++;
							continue;
						}
					}
				}
				
				// [�i��].�g��Ǝ��ы敪�h �� 1�F�o�������� �ŁA
				if ("1".equals(mItemStruct.getOPR_RSLT_TYP())) {
					// �u��Ƌ�R�[�h�v �� Null �̏ꍇ
					if (isNull(dataStruct.getWS_CD())) {
						// ��ƌn�񂩂�u��Ƌ�R�[�h�v ���擾���A�擾�ł��Ȃ��ꍇ
						List procgrpList = entity.mselectM_PROC_GRP.read(conn, dataStruct);
						AD0150010Struct procgrpStruct = new AD0150010Struct();
						if (procgrpList.isEmpty()) {
							errCode = "AC00103";
							//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
							err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
							writeLog(ERROR,errCode,err_commt);	
							_intErrorCount++;	
							continue;
						}else {
							procgrpStruct = (AD0150010Struct)procgrpList.get(0);
							dataStruct.setWS_CD(procgrpStruct.getWS_CD());
						}
					}
					
				}else if ("2".equals(mItemStruct.getOPR_RSLT_TYP())) {
					// [�i��].�g��Ǝ��ы敪�h �� 2�F��Ǝw������ ��
					// �u��Ƌ�R�[�h�v �����͂���Ă���ꍇ
					if (!isNull(dataStruct.getWS_CD())) {
						errCode = "AD00227";
						//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
						err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}
				}
				
				// ���͂��ꂽ [�i��] �� �g�i�ڎ�z�敪�h ��1�F���� 2�F�݌Ɉ����^���Ԃ̏ꍇ
				if (("1".equals(mItemStruct.getMRP_ODR_TYP()) || "2".equals(mItemStruct.getMRP_ODR_TYP()))) {
					// [��ƌv��捞]�̐��Ԃ����͂���Ă��Ȃ��ꍇ�A
					if (isNull(dataStruct.getJOB_ODR_CD())) {
						errCode = "AD30017";
						//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
						err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
						writeLog(ERROR,errCode,err_commt);	
						_intErrorCount++;
						continue;
					}else {
						// �u���ԁv �̒l�� [���Ԍv��] �ɑ��݂��Ȃ��ꍇ
						List jobodrList = entity.mselectT_JOB_ODR.read(conn, dataStruct);
						if (jobodrList.isEmpty()) {
							errCode = "AB00043";
							//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
							err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
							writeLog(ERROR,errCode,err_commt);	
							_intErrorCount++;
							continue;
						}else {
							jobodrStruct = (AD0150010Struct)jobodrList.get(0);
							// [���Ԍv��].�g���ԏ�ԋ敪�h ��1�F���v�ʌv�Z���Ώ� or 2�F���v�ʌv�Z�Ώ� or 9�F���� �̏ꍇ
							if ("1".equals(jobodrStruct.getJOB_ODR_STS_TYP())
									|| "2".equals(jobodrStruct.getJOB_ODR_STS_TYP())
									|| "9".equals(jobodrStruct.getJOB_ODR_STS_TYP())) {
								errCode = "AD32616";
								//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
								err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
								writeLog(ERROR,errCode,err_commt);	
								_intErrorCount++;
								continue;
							}
							
							// ���[�U����������H��R�[�h�ƁA[���Ԍv��] �̍H��R�[�h����v���Ȃ��ꍇ
							if (!jobodrStruct.getPLANT_CD().equals(getSysPlantCd())) {
								errCode = "AD00016";
								//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
								err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
								writeLog(ERROR,errCode,err_commt);	
								_intErrorCount++;
								continue;
							}
							
							// [���Ԍv��].�g���Ԕ[���h �� �u�����[���v�ɂȂ�ꍇ
							Date jobOdrDlvDate = _df.parse(jobodrStruct.getJOB_ODR_DLV_DATE());
							if (jobOdrDlvDate.compareTo(workOdrDlvDatetemp) < 0) {
								errCode = "AD32214";
								//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
								err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
								writeLog(ERROR,errCode,err_commt);	
								_intErrorCount++;
								continue;
							}
						}
					}
				}
				
				// [�i��].�݌ɐ��ʒP�ʋ敪=1�Łu��Ǝw�����v�ɏ��������͂��ꂽ�ꍇ
				BigDecimal OprInstQty_up = new BigDecimal(dataStruct.getOPR_INST_QTY());
				if ("1".equals(mItemStruct.getUNIT_QTY_TYP())) {
					BigDecimal OprInstQty2 = new BigDecimal("0");
					OprInstQty2 = OprInstQty_up.setScale(0,BigDecimal.ROUND_UP);
					//�؂�グ�����O�ƌ�Œl���قȂ��Ă�����
					//���������͂���Ă����Ɣ��f�����[�j���O
					if ( OprInstQty_up.doubleValue() != OprInstQty2.doubleValue()) { 
						errCode = "AD00043";
						//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
						err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
						writeLog(WARNING,errCode,err_commt);	
						_intWarningCount++;
					}
				}
				
				// �u����������v �� Null �̏ꍇ
				if (isNull(dataStruct.getOPR_INST_START_DATE())){
					errCode = "AD34034";
					//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
					err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
					writeLog(WARNING,errCode,err_commt);	
					_intWarningCount++;
				}
				
				//�Ɩ��^�p���擾
				DateCtrlStruct dateCtrl = DateCtrlControl.getData(conn,  getSysPlantCd());
				_btmBusinessOprDate = dateCtrl.getBUSINESS_OPR_DATE();
				
				// �Ɩ��^�p��
				Date _btmBusinessOprDatetemp = _df.parse(_btmBusinessOprDate);
				
				// �u�����[���v �� �ߋ���(�Ɩ��^�p�����ߋ�) ����͂��ꂽ�ꍇ
				if (!isNull(dataStruct.getWORK_ODR_DLV_DATE())) {
					
					if (workOdrDlvDatetemp.compareTo(_btmBusinessOprDatetemp) < 0) {
						errCode = "AD34035";
						//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
						err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
						writeLog(WARNING,errCode,err_commt);	
						_intWarningCount++;
					}
				}
				
				// �u����������v �� �ߋ���(�Ɩ��^�p�����ߋ�) ����͂��ꂽ�ꍇ
				if (!isNull(dataStruct.getOPR_INST_START_DATE())) {
					if (OprInstStartDatetemp.compareTo(_btmBusinessOprDatetemp) < 0) {
						errCode = "AD34036";
						//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
						err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
						writeLog(WARNING,errCode,err_commt);	
						_intWarningCount++;
					}
				}
				
				// ���͂��ꂽ [�i��] �� �g�i�ڎ�z�敪�h ��1�F���� 2�F�݌Ɉ����^���Ԃ̏ꍇ
				if (("1".equals(mItemStruct.getMRP_ODR_TYP()) || "2".equals(mItemStruct.getMRP_ODR_TYP()))) {
					// ���ԕi�ځF�Ή����� [���v��].�g�e�I�[�_�f�}���h�ԍ��h ���A Null �ȊO
					if (!isNull(jobodrStruct.getPARENT_OD_NO())) {
						if (!isNull(jobodrStruct.getDUE_DATE())) {
							Date dueDate = _df.parse(jobodrStruct.getDUE_DATE());
							
							// ���ԕi�̏ꍇ�ŁA [���v��].�g�v���[���h �� �u�����[���v�̏ꍇ
							if (dueDate.compareTo(workOdrDlvDatetemp) < 0) {
								errCode = "AD34037";
								//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
								err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
								writeLog(WARNING,errCode,err_commt);	
								_intWarningCount++;
							}
						}
					}
					
					// [���v��].�g��z������h �� �u����������v �̏ꍇ
					if (!isNull(jobodrStruct.getODR_START_DATE()) && !isNull(dataStruct.getOPR_INST_START_DATE())) {
						Date odrStartDate = _df.parse(jobodrStruct.getODR_START_DATE());
						if (odrStartDate.compareTo(OprInstStartDatetemp) > 0) {
							errCode = "AD34038";
							//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
							err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
							writeLog(WARNING,errCode,err_commt);	
							_intWarningCount++;
						}
					}
					
					// ��s��z����([���Ԍv��]."���Ԏ��"=2)�̍ŏ�ʕi�ڂ̏ꍇ�ŁA
					//�u�����[���v��min�i�����ԁE���Ԏ}�Ԃ��L�[�ɗv�����Ƃ̃f�}���h���������A
					// ����[���v��]."�v���[��"�j�ɂȂ�ꍇ
					if ("2".equals(jobodrStruct.getJOB_ODR_TYP())) {
						// �ŏ�ʕi��(�e�I�[�_�f�}���h�ԍ���NULL)�̏ꍇ
						if (isNull(jobodrStruct.getPARENT_OD_NO())) {
									
							List jobOdrAlcList = entity.mselectJobOdrAlc.read(conn,dataStruct);
							if (jobOdrAlcList.isEmpty()) {
								//�����f�[�^��������΁A�`�F�b�N���Ȃ��B	
							} else {
								AD0150010Struct jobOdrAlcStruct = 
										(AD0150010Struct)jobOdrAlcList.get(0);
								if (!isNull(jobOdrAlcStruct.getDUE_DATE_BY_ALC())) {
									Date datealcDueDate = 
										_df.parse(jobOdrAlcStruct.getDUE_DATE_BY_ALC());
									
									//�u�����[���v��[���v��]."�v���[��"
									if (workOdrDlvDatetemp.compareTo(datealcDueDate) > 0) {
										//�����[���ɖ���������܂��B
										errCode = "AD00044";
										//�Ɩ����b�Z�[�W�p�G���[���b�Z�[�W�̊i�[
										err_commt="(SBM1330)CSV�s�ԍ� =�@[" + errorNumber + "]";
										writeLog(WARNING,errCode,err_commt);	
										_intWarningCount++;
									}
								}
							}
						}
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
	 * CSV�t�@�C���i��ƌv��捞�j�̓��e��o�^
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

	        // �i�ڕʍ�ƌv��o�^�������J�n���܂����B
	        writeLog(INFOMATION,"AD60048");
			for (int i = 0; i < csvList.size(); i++) {

				AD0150010Struct csvStruct = (AD0150010Struct)csvList.get(i);
//				csvStruct.setsSysdate(struct.getsSysdate());
				csvStruct.setsUser_ID(getSysUserCd());
				//�����Ǘ��p�����[�^�擾
				 AD0150010Struct TIME_CTRLStruct = new AD0150010Struct();
				List TIME_CTRLlist = entity.mselectTIME_CTRL.read(conn,TIME_CTRLStruct);
				if(TIME_CTRLlist.isEmpty()){
					csvStruct.setTIME_CTRL("false");
					_flgTimeCtrl = "false";
				}else{
					csvStruct.setTIME_CTRL(((AD0150010Struct)TIME_CTRLlist.get(0)).getTIME_CTRL());
					_flgTimeCtrl = csvStruct.getTIME_CTRL();
				}
				// [�p�����[�^].�h���O�h=�fTIME_CTRL�f��[�p�����[�^].�h�l�h=�ftrue�f�Ȃ�
				if ("true".equals(_flgTimeCtrl)) {
					WORK_ODR_DLV_DATE_TIME = "2359";
					OPR_INST_START_DATE_TIME = "2359";
				} else {
					WORK_ODR_DLV_DATE_TIME = "0000";
					OPR_INST_START_DATE_TIME = "0000";
				}
				
				// [�b�r�u�f�[�^].�h����������h��NULL�̏ꍇ�F�����[���ɂ��A�Z�o
				if (isNull(csvStruct.getOPR_INST_START_DATE())) {
					//������̎����v�Z
					List ltList = entity.mselectLT.read(conn,csvStruct);
					if (ltList.isEmpty()) {
 						errCode = "ZZ01101";
 						writeLog(ERROR,errCode);	
 				        //�i�ڕʍ�ƌv��o�^�������ُ�I�����܂����B
 				        writeLog(INFOMATION, "AD60047");	
						return false;
					} else {
						AD0150010Struct ltStruct = (AD0150010Struct)ltList.get(0);
						int fixed = new Integer(ltStruct.getFIXED_LT()).intValue();
						int prop = new Integer(ltStruct.getPROP_LT()).intValue();
						int safety = new Integer(ltStruct.getSAFETY_LT()).intValue();
						int prop_lot = new Integer(ltStruct.getPROP_LOT_SIZE()).intValue();
						//��Ǝw������؂�グ��������
						BigDecimal StrOprInstQty = new BigDecimal(csvStruct.getOPR_INST_QTY());
						BigDecimal OprInstQty = StrOprInstQty.setScale(0, BigDecimal.ROUND_UP);
						String strOprInstQty = OprInstQty.toString();
						//�i�ڂ̃��[�h�^�C��
						int lt = 
								0 - (fixed + (Integer.parseInt(strOprInstQty)/prop_lot) * prop + safety);
						Date WorkOdrDlvDate = 
								Converter.strToDate(csvStruct.getWORK_ODR_DLV_DATE(), "yyyy/MM/dd");
						//������������v�Z����
						Date calcDate = null;
						WorkCalendar MyCal;
						MyCal = new WorkCalendar(conn,getSysUserCd(),getSysProgramId(),getSysPlantCd(),csvStruct.getITEM_CD(),WorkOdrDlvDate,lt,true);
						calcDate = MyCal.calcDate();
						
						String StrOprInstStartDate = 
								Converter.dateToStr(calcDate, "yyyy/MM/dd");
						if(StrOprInstStartDate == null){
							// �Ɩ����t�̎擾�Ɏ��s���܂����B
	 						errCode = "AD60044";
	 						writeLog(ERROR,errCode);
	 				        //�i�ڕʍ�ƌv��o�^�������ُ�I�����܂����B
	 				        writeLog(INFOMATION, "AD60047");	
							return false;
						} else {
							csvStruct.setOPR_INST_START_DATE(StrOprInstStartDate.substring(0,10));
						}
					}
				}
				
				// ���v�ʂ̃I�[�_���̒ǉ��A���v�ʂ̉��ʃf�}���h�̒ǉ�
				String odNoString;
				CommonOd od = 
						new CommonOd(conn,
							getSysPlantCd(),
							getSysUserCd(),
							getSysProgramId());
				// �I�[�_�[�f�}���h�ԍ����Z�b�g����
				odNoString = 
				od.addOdInfo(csvStruct.getITEM_CD(),
					Converter.strToDate(
							csvStruct.getWORK_ODR_DLV_DATE() + " " + WORK_ODR_DLV_DATE_TIME, Converter.SLASH_DATE_HOUR_MINUTE),
					Converter.strToDate(
							csvStruct.getOPR_INST_START_DATE() + " " + OPR_INST_START_DATE_TIME, Converter.SLASH_DATE_HOUR_MINUTE),
					Double.parseDouble(csvStruct.getOPR_INST_QTY()),
					3);
				
				csvStruct.setOD_NO(odNoString);
				
				// [�i��].�g��Ǝ��ы敪�h���A1�F�o�������� �̏ꍇ�A[��Ǝw���`�[] �̒ǉ����s���B
				List itemCdList = entity.mselectItem_CD.read(conn, csvStruct);
				mItemStruct = (AD0150010Struct)itemCdList.get(0);
				if ("1".equals(mItemStruct.getOPR_RSLT_TYP())) {
					rtnFlg = insertT_OPR_INST_SLIP (csvStruct,i);
					if(!rtnFlg) {
						conn.rollback();
 				        //�i�ڕʍ�ƌv��o�^�������ُ�I�����܂����B
 				        writeLog(INFOMATION, "AD60047");	
						return false;
					}
				}
	
				// [�i�ڕʎd�|]�̒ǉ����s��
				rtnFlg = insertT_WORK_IN_PROC_BY_ITEM (csvStruct,i);
				if(!rtnFlg) {
				    //�i�ڕʍ�ƌv��o�^�������ُ�I�����܂����B
				    writeLog(INFOMATION, "AD60047");	
					conn.rollback();
					return false;
				}
				
			}
			//  �o�^����������ɏI�������ꍇ
			_intSuccessCount = csvList.size();
	        String succCommt = "(SBM1701)�Ǎ������@=�@[" + _intTotalCount + "] "
	        				 + "�o�^�����@=�@[" + _intSuccessCount + "] ";
	        //�i�ڕʍ�ƌv��o�^�����𐳏�ɏI�����܂����B
	        writeLog(INFOMATION, "AD60046", succCommt);	
			// �g�����U�N�V�����̊J�n
			conn.beginTransWeb();
			conn.commit();
			return true;
		} catch (Exception e) {
			conn.rollback();;
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
			m_med.setFUNCTION_NAME("SQLWORKINPROCBYITEMINTERFACE");
			
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
			callList = m_med.getSQLWORKINPROCBYITEMINTERFACE().call();
			// PL/SQL�̎��s���ʂ��擾
			medAD0150B001 resultMed = (medAD0150B001) callList.get(0);
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
			
			// [��ƌv��捞]�̃f�[�^���擾
			List listTWorkOdrTemp = new ArrayList();
			listTWorkOdrTemp = selectTWorkOdrTemp();
			
			// [��ƌv��捞]�̃f�[�^���擾����
			if (listTWorkOdrTemp != null) {
				//�}�X�^�������`�F�b�N���{
				if(check_listTWorkOdrTemp(listTWorkOdrTemp)){
	             // �o�^����
					if(insertCsvDate(listTWorkOdrTemp)) {
						// �I�����O
						writeLog(INFOMATION, "ZZ09002");
					}        
				}else {
					writeLog(INFOMATION, "ZZ09002");
					return BREAK;
				}	
			}

		} catch (FoundationException e) {
			conn.rollback();
			e.printStackTrace();
			throw new BatchAppException("CtrlMain", "main", e.getMessage());			
		} catch (SQLException e) {
			conn.rollback();
			e.printStackTrace();
			throw new BatchAppException("CtrlMain", "main", e.getMessage());
		} catch (Exception e) {
			conn.rollback();
			e.printStackTrace();
			throw new BatchAppException("CtrlMain", "main", e.getMessage());
		} finally{
			try{
				// ��ƌv��捞�̍폜
			    m_med.getdeleteT_WORK_ODR_TEMP().delete();
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
			entity = new AD0150010Entity();
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
		public medAD0150B001 m_med=null;

		/**
		 * �R���e�i�N���X�C���X�^���X
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medAD0150B001 med) throws BatchAppException
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
