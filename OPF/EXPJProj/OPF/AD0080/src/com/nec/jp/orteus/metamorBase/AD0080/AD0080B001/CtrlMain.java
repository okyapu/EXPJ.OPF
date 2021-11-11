/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0080/src/com/nec/jp/orteus/metamorBase/AD0080/AD0080B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0080.AD0080B001;

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
import com.nec.jp.orteus.metamorBase.AD0040.*;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common02.CommonOd.CommonOd;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.expj.lot.BizCommon;
import com.nec.jp.orteus.expj.pr.rcvissue.process.AutoIssue;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueProcess;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueRemain;
import com.nec.jp.orteus.expj.pr.rcvissue.process.RcvCancel;
import com.nec.jp.orteus.expj.pr.rcvissue.process.ValidateWh;
import com.nec.jp.orteus.expj.pr.rcvissue.process.WhAutoIssueProc;
import com.nec.jp.orteus.expj.util.Calculate;
import com.nec.jp.orteus.expj.util.Converter;
import com.nec.jp.orteus.expj.util.DateCtrl;
import com.nec.jp.orteus.expj.util.DateTool;
import com.nec.jp.orteus.expj.util.ExpjException;
import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.expj.util.Numbering;
import com.nec.jp.orteus.expj.util.PrivateConfig;

import java.math.BigDecimal;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import utils.system;
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain �N���X
 * �t�@�C���E�N���X����
 * @author $Author: geng-jia $
 * @version $Revision: 1.17 $ $Date: 2015/12/22 09:52:49 $
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
	public medAD0080B001 m_med=null;

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
	public CtrlMain(medAD0080B001 med, BatchAppConductor cdr) throws BatchAppException
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
	public CtrlMain(medAD0080B001 med) throws BatchAppException
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

    //-++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
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
    /** ���b�Z�[�WHashMap */
    private Map tempHashMap = null;
   
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
        writeLogFiles(logLevel, code, null);
        if (!isNull(dataStr)) {
         writeLogFiles(logLevel, "ZZ01006", dataStr);
        }
        writeLogDB(code, null, dataStr);
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
     * �o�b�`�p�����[�^�̃`�F�b�N���s���܂��B
     * @return ����̏ꍇtrue�A�s���̏ꍇfalse
     * @throws BatchAppException
     */
    private boolean checkArgs() throws BatchAppException {
     // �o�b�`�p�����[�^�̌`�����s���ȏꍇ
     if (m_med.getArgs().length != 7) {
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

     // �H��R�[�h��Null�̏ꍇ
     if (isNull(getSysPlantCd())) {
      writeLogFiles(ERROR, "ZZ09027");
      return false;
     }   
     // �Ɩ�ID��Null�̏ꍇ
     if (isNull(getSysProgramId())) {
      writeLogFiles(ERROR, "ZZ09029");
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
     * �o�b�`�p�����[�^(����5)�Ɩ��^�p����Ԃ��܂��B
     * @return �Ɩ��^�p��
     */
    private String getBusinessDate() {
     return m_med.getArgs()[4];
    }
    
    /**
     * �o�b�`�p�����[�^(6)CSV�捞���Ԃ�Ԃ��܂��B<br>
     * @return CSV�捞����From
     */
    private String getCsvIntakeFrom() {
    	if(isNull(m_med.getArgs()[5])) {
    		return null;
    	}
    	return m_med.getArgs()[5];
    }
    
    /**
     * �o�b�`�p�����[�^(7)CSV�捞���Ԃ�Ԃ��܂��B<br>
     * @return CSV�捞����To
     */
    private String getCsvIntakeTo() {
    	if(isNull(m_med.getArgs()[6])) {
    		return null;
    	}
    	return m_med.getArgs()[6];
    }
    
    /**��Ǝ���entity*/
    AD0040010Entity entity = null;
    
    /**��Ǝ���entity*/
    AD0040010Struct struct = null;
    
    /**�G���[�R�[�h*/
    String errCode = null;
    
    String company_cd = null;
    
    /**
     * �X�V�������C��
     *
     * @param	userId			���[�U�R�[�h
     * @param	strProgramName	�v���O������
     * @param   businessDate    �Ɩ��^�p��
     * @param	csvIntakeFrom   CSV�捞����From
     * @param	csvIntakeTo		CSV�捞����To
     * @return	�Ȃ�
     * @throws FoundationException 
     * @throws SQLException 
     */
    private void exeOprRsltCsvLoad (
            String userId, 
            String strProgramName, 
            String businessDate,
            String csvIntakeFrom,
            String csvIntakeTo) throws Exception {
    	try {
    		
	        // ��Ǝ��ю捞�o�b�`�������J�n���܂����B
	        writeLog(INFOMATION,"AD00201");
	        
	        // ��Ǝ���entity
	        entity = new AD0040010Entity();
	        // ��Ǝ���struct
	        struct = new AD0040010Struct();
	      
	        // �Ǎ�����
	        long readCnt = 0;
	        // �o�^����
	        long insertCnt = 0;
	        // ���i�t���O
	 		boolean productFlg = false;
	        
	        struct.setUSER_CD(userId);
	        struct.setPRG_NM(strProgramName);
	        
	        // ���b�Z�[�W�v���p�e�B�t�@�C��
	        ResourceBundle _messages = CoreTools.getResourceBundle("ExpjMessage", CoreTools.getLocale(userId));
	        
	        //�V�X�e���p�����[�^(���ԊǗ�)�擾
	        GetTimeCtrl();

	        //��ЃR�[�h.getSysMyCompanyCd();
			m_med.getselSYS_MY_COMPANY_CD().read();
			if(!m_med.getselSYS_MY_COMPANY_CD().next()) {
				// ��ЃR�[�h
	 			writeLog(ERROR, "BZ00179");
	 			throw new Exception();
			}
	        company_cd = m_med.getCOMPANY_CD();
	        // �V�X�e���p�����[�^�u��Ǝ���CSV�捞�����i�[���s�v���擾����
	 		PrivateConfig privateConfig = new PrivateConfig(conn);
	 		String identCard = privateConfig.getString("IDENT_CARD");
	 		if(isNull(identCard)) {
	 			writeLog(ERROR, "AD00222");
	 			throw new Exception();
	 		}
	 		
	 		// Add Start 20140219 huang-lh
	 		// �V�X�e���p�����[�^�u�H���ۊǏꏊ�̍݌ɂ��Ǘ��v���擾����
	 		_processManageFlg  = privateConfig.getString("PROCESS_MANAGE_FLG");
	 		if(isNull(_processManageFlg)) {
	 			writeLog(ERROR, "AD00231");
	 			throw new Exception();
	 		} else {
	 			if(!"0".equals(_processManageFlg) && !"1".equals(_processManageFlg)) {
	 				writeLog(ERROR, "AD00231");
		 			throw new Exception();
	 			}
	 		}
	 		
	 		// �V�X�e���p�����[�^�u�s�Ǎ݌ɂ��H���Ǘ��v���擾����
	 		_defectManageFlg  = privateConfig.getString("DEFECT_MANAGE_FLG");
	 		if(isNull(_defectManageFlg)) {
	 			writeLog(ERROR, "AD00232");
	 			throw new Exception();
	 		} else {
	 			if(!"0".equals(_defectManageFlg) && !"1".equals(_defectManageFlg)) {
	 				writeLog(ERROR, "AD00232");
		 			throw new Exception();
	 			}
	 		}
	 		// Add End 20140219 huang-lh

	 		// ���i�[����Ώې��i�敪
	 		String sysPRODUCT_TYP = privateConfig.getString("PRODUCT_TYP");
	 		
	        // �Ɩ��^�p��
	        struct.seth_BUSINESS_OPR_DATE(businessDate);	
			
		    // ��Ǝ��ю捞����
		    AD0040010Struct tempStruct = null;
		    AD0040010Struct headerStruct = null;
		    List tempList = null;
		    List errList = null;
		    List hashList = null;
		    tempHashMap = new HashMap();		    
		    medAD0080B001 tempMed = new medAD0080B001();
		    String oprRsltTempCtlNo = null;
		    List oprRsltList = new ArrayList();
		    boolean compltFlg = false;
		    // �X�V�����t���O
		    int updFlg = 0;
		    int errFlg = 0;
		    
		    m_med.setINTAKE_TERM_FROM(csvIntakeFrom);
		    m_med.setINTAKE_TERM_TO(csvIntakeTo);
		    m_med.getOPR_INST_LIST().read();
		    
		    while(m_med.getOPR_INST_LIST().next()) {
		        tempStruct = new AD0040010Struct();
		        compltFlg = false;	
		        updFlg = 0;
		        errFlg = 0;
		        tempStruct.setIN_OPR_INST_CD(m_med.getOPR_INST_CD());
		        tempStruct.setUSER_CD(userId);
		        tempStruct.setPRG_NM(strProgramName);
			    m_med.setINTAKE_TERM_FROM(csvIntakeFrom);
			    m_med.setINTAKE_TERM_TO(csvIntakeTo);	
	    		m_med.setUSER_CD(userId);
	    		m_med.setPRG_NM(strProgramName);

				// ��Ǝ���CSV�f�[�^�擾
		        oprRsltList = selectOprRsltData(csvIntakeFrom, csvIntakeTo);
		        readCnt = readCnt + oprRsltList.size();

				// �u��Ǝw���ԍ��v �� [��Ǝw���`�[] �ɑ��݃`�F�b�N
				tempList = entity.mSelectOprInstSlip.read(conn, tempStruct);
				if(tempList.isEmpty()) {
					// ��Ǝw���`�[�f�[�^�����݂��܂���B
					errCode = "AD30587";					
					updFlg = 1;
					errFlg = 1;
				}
				if(updFlg ==0) {
					// �n��ʎd�|���擾
			        tempList = entity.mSelectHeader.read(conn, tempStruct);
			        if(tempList.isEmpty()) {
			        	errCode = "ZZ01101";
			        	updFlg = 1;
			        	errFlg = 1;
			        } else {
			        	headerStruct = (AD0040010Struct)tempList.get(0);
			        	struct.setPLANT_CD(headerStruct.getPLANT_CD());
				        tempStruct.setPLANT_CD(headerStruct.getPLANT_CD());
				        
				        if(getSysPlantCd().equals(struct.getPLANT_CD()) == false){
	                       	errCode = "AF00177";
				        	updFlg = 1; 
				        	errFlg = 1;
	                        }
			        }
				}
		        // �i�ڕʎd�|���擾
		        AD0040010Struct workItemStruct = null;
		        if(updFlg ==0) {
			        tempList = entity.mSelectWorkItem.read(conn, headerStruct);
			        if (tempList.isEmpty()) {
			        	errCode = "ZZ01101";
			        	updFlg = 1;
			        	errFlg = 1;
			        } else {
			        	workItemStruct = (AD0040010Struct)tempList.get(0);
			        }
		        }
		        
		        // �o�����̏ꍇ�G���[
		        if(updFlg ==0) {
		        	if (workItemStruct.getOPR_RSLT_TYP() == null
							|| "1".equals(workItemStruct.getOPR_RSLT_TYP())) {
			        	errCode = "ZZ01101";
			        	updFlg = 1;
			        	errFlg = 1;
			        }
		        }
		        
		        // ���w���̏ꍇ�G���[
		        if(updFlg ==0) {
		        	if (headerStruct.geth_WORK_STS_TYP() == null
							|| "1".equals(headerStruct.geth_WORK_STS_TYP())) {
						errCode = "AD30804";
						updFlg = 1;
						errFlg = 1;
					}
		        }
				
				// ��Ə�ԋ敪�̊����G���[
		        if(updFlg ==0) {
					if ("9".equals(headerStruct.geth_WORK_STS_TYP())) {
						errCode = "AD00204";
						updFlg = 1;
						errFlg = 1;
					}
		        }
		        conn.beginTransWeb();
				loop:
		        	for(int i = 0; i < oprRsltList.size(); i++) {
		        		errList = new ArrayList();
		        		hashList=new ArrayList();
			    		tempMed = (medAD0080B001)oprRsltList.get(i);
			    		oprRsltTempCtlNo = tempMed.getOPR_RSLT_TEMP_CTL_NO();
			    		m_med.setOPR_RSLT_TEMP_CTL_NO(oprRsltTempCtlNo);
			    		m_med.getlockT_OPR_RSLT_TEMP().read();
			    		
			    		// ��Ǝ��ю捞�Ǘ��ԍ�{0}���������܂��B
			    		writeLogFiles(INFOMATION, "AD00202", oprRsltTempCtlNo);
			    		if(errFlg==1) {
			    			writeLogFiles(ERROR,errCode);
			    			setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
			    			continue;
			    		}
			    		
			    		// �Ǖi�݌v�A�s�Ǖi�݌v�擾
			    		m_med.setOPR_INST_CD(tempMed.getOPR_INST_CD());
			    		m_med.getselectSumQty().read();
			    		m_med.getselectSumQty().next();
			    		headerStruct.setSUM_ACPT_QTY(m_med.getSUM_ACPT_QTY());
			    		headerStruct.setSUM_DEFECT_QTY(m_med.getSUM_DEFECT_QTY());
			    		
			    		// Mod Start 20140219 huang-lh
			    		
			    		//��ƌv��ԍ��Ǝd�|��ƌn��ԍ���ێ�����
				        tempMed.setWORK_ODR_CD(headerStruct.getWORK_ODR_CD());
				        tempMed.setPROC_NO(headerStruct.getPROC_NO());
				        m_med.setWORK_ODR_CD(tempMed.getWORK_ODR_CD());
				        m_med.setPROC_NO(tempMed.getPROC_NO());
				        
			    		// ��ƌn��ʎd�|����A�ŏ��H�������擾����
			    		m_med.getCheckFirstWork().read();
			    		m_med.getCheckFirstWork().next();
			    		
			    		// �ŏ��H�����ǂ������f����
			    		if (m_med.getOPR_INST_CD().equals(m_med.getFIRST_OPR_INST_CD())) {
			    			// �ŏ��H���ꍇ
			    			m_med.setFIRST_WORK_FLG("1");
			    			tempMed.setFIRST_WORK_FLG("1");
			    			
			    			// ���H�������擾����
				    		m_med.getGetNextWorkInfo().read();
				    		m_med.getGetNextWorkInfo().next();
				    		tempMed.setNEXT_WH_CD(m_med.getNEXT_WH_CD());
				    		tempMed.setNEXT_WORK_ODR_CD(m_med.getNEXT_WORK_ODR_CD());
				    		tempMed.setNEXT_OPR_INST_CD(m_med.getNEXT_OPR_INST_CD());
				    		tempMed.setNEXT_PROC_NO(m_med.getNEXT_PROC_NO());
				    		tempMed.setNEXT_WS_CD(m_med.getNEXT_WS_CD());
			    		} else {
			    			// �ŏ��H���łȂ��ꍇ
			    			m_med.setFIRST_WORK_FLG("0");
			    			tempMed.setFIRST_WORK_FLG("0");
			    			
			    			// �O�H�������擾����
				    		m_med.getGetPrevWorkInfo().read();
				    		m_med.getGetPrevWorkInfo().next();
				    		tempMed.setPREV_WORK_ODR_CD(m_med.getPREV_WORK_ODR_CD());
				    		tempMed.setPREV_OPR_INST_CD(m_med.getPREV_OPR_INST_CD());
				    		tempMed.setPREV_PARTIAL_PRD_NO(m_med.getPREV_PARTIAL_PRD_NO());
				    		tempMed.setPREV_PROC_NO(m_med.getPREV_PROC_NO());
				    		tempMed.setPREV_WH_CD(m_med.getPREV_WH_CD());
			    			// �ŏI�H���ꍇ
			    			if (!"1".equals(headerStruct.geth_FINAL_PROC_FLG())){
			    				// ���H�������擾����
					    		m_med.getGetNextWorkInfo().read();
					    		m_med.getGetNextWorkInfo().next();
					    		tempMed.setNEXT_WH_CD(m_med.getNEXT_WH_CD());
					    		tempMed.setNEXT_WORK_ODR_CD(m_med.getNEXT_WORK_ODR_CD());
					    		tempMed.setNEXT_OPR_INST_CD(m_med.getNEXT_OPR_INST_CD());
					    		tempMed.setNEXT_PROC_NO(m_med.getNEXT_PROC_NO());
					    		tempMed.setNEXT_WS_CD(m_med.getNEXT_WS_CD());
			    			}
				    		
			    			
			    		}
			    		structCopy(tempStruct, tempMed, headerStruct);
			    		
			    		// �ۊǋ�̑q�ɋ敪���擾����
			    		m_med.setNEXT_WH_CD(tempMed.getNEXT_WH_CD());
			    		m_med.getSelectWhTyp().read();
			    		m_med.getSelectWhTyp().next();
			    		tempMed.setWH_TYP(m_med.getWH_TYP());
			    		
			    		// ��Ǝ��т̓�����Ǝw���ԍ��̕ۊǋ�R�[�h�̐��ʂ��擾����
			    		
			    		m_med.setOPR_INST_CD(tempMed.getOPR_INST_CD());
			    		m_med.setWH_CD(tempStruct.getWH_CD());
			    		m_med.getSelectWhCdCount().read();
			    		m_med.getSelectWhCdCount().next();
			    		tempMed.setWH_CD_COUNT(m_med.getWH_CD_COUNT());
			    		
			    		// ��ƌn��ʎd�|]����擾����[��ƌn��ʎd�|].�g�d�|���O��敪�h��2�F�O��̃��R�[�h���擾����
			    		m_med.getSelectTworkProcByProc().read();
			    		m_med.getSelectTworkProcByProc().next();
			    		tempMed.setDATA_COUNT(m_med.getDATA_COUNT());
			    		
			    		// Mod End 20140219 huang-lh
			    		
			    		// ����񐔎擾
			    		if(isNull(tempStruct.getPARTIAL_PRD_NO())) {  				
		    				tempList = entity.mSelectMaxPrdNo.read(conn, tempStruct);
		    				tempStruct.setPARTIAL_PRD_NO(((AD0040010Struct)tempList. get(0)).getPARTIAL_PRD_NO());	
			    		} else {
		    	    		// ����񐔁{�P�̃Z�b�g
		    	    		tempStruct.setPARTIAL_PRD_NO(Calculate.add(tempStruct.getPARTIAL_PRD_NO(), "1"));
			    		}
			    		
			    		// ��Ɗ����t���O�ݒ�
			    		tempStruct.setc_COMPLETE("0"); // �����l
			    		if(i == oprRsltList.size()-1)  {
			    			if(compltFlg || "1".equals(tempMed.getOPR_CMPLT_FLG())|| "2".equals(tempMed.getOPR_CMPLT_FLG())) {
			    				tempStruct.setc_COMPLETE("1");
			    			}	
			    		} else {
			    			if("1".equals(tempMed.getOPR_CMPLT_FLG()) || "2".equals(tempMed.getOPR_CMPLT_FLG())) {
			    				compltFlg = true;
			    				tempStruct.setc_COMPLETE("0");
			    			}
			    		}
			    		
			    		// ��Ǝ���CSV�捞�f�[�^�̃`�F�b�N
			    		if(dataCheck(tempStruct, headerStruct, tempMed) == 1) {
			    			updFlg = 1;
			    			setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
			    			continue;
			    		}	
			    		
			    		//-------------------���b�g���o�^����-----------------
			    		if("1".equals(headerStruct.getLOT_CTRL_FLG()) &&   // ���b�g�Ǘ��i��        
			    				"1".equals(headerStruct.geth_FINAL_PROC_FLG()) &&  // �ŏI�n��
			    				Calculate.compare(tempStruct.getACPT_QTY(), "0") > 0 ) { // �u�Ǖi���v�@���@�O
			    			
			    			// ���b�g�ԍ��̔ԋ敪 �� �����
			    			if("0".equals(headerStruct.getLOT_NUMBERING_TYP())) {
								// ���b�g�Ǘ�����
								tempList = entity.mT_LOT_CTRL.read(conn,tempStruct);
								// ���b�g���o�^
								if(tempList.isEmpty()) {
									m_med.setLOT_NO(tempStruct.getLOT_NO());
									m_med.setITEM_CD(tempStruct.getITEM_CD());
									m_med.setOPR_DATE(tempStruct.getOPR_DATE());
						    		m_med.setUSER_CD(userId);
						    		m_med.setPRG_NM(strProgramName);
									// �ܖ����������v�Z���s���B
									BizCommon bc = new BizCommon(conn, userId, strProgramName, headerStruct.getPLANT_CD());
									// �ܖ����������v�Z���ʕ��i
									List resultList = bc.calcBestBeforeFd(tempStruct.getITEM_CD(), tempStruct.getOPR_DATE().substring(0,10));
									// ���ʃX�e�[�^�X������I��
									if (bc.getResultStatus().intValue() == 1) {
										if (resultList != null && resultList.size() > 0) {
											String result1 = "";
											result1 = (String) resultList.get(0);
											if(result1.length() < 10) {
												m_med.setBEST_BEFORE_DATE(null); // �ܖ�����
											} else {
												m_med.setBEST_BEFORE_DATE(result1); // �ܖ�����
											}
										}
									} else {
										// ���ʃX�e�[�^�X������I���ȊO
										if (resultList != null && resultList.size() > 1) {
											// �����̃G���[�R�[�h�ŃG���[���b�Z�[�W��\����
											m_med.setBEST_BEFORE_DATE(null); // �ܖ�����
											errCode = "AE22056";
											writeLogFiles(ERROR, errCode);
											updFlg = 9;
											setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
											continue;
										}
									}
									m_med.getT_LOT_CTRL().create();
								}
			    			} else {
			    				// �݌Ƀ��b�g�ԍ��̎����̔Ԃ��s���B
			    				if(isNull(tempStruct.getLOT_NO())) {
			    					BizCommon bc = new BizCommon(conn, userId, strProgramName, headerStruct.getPLANT_CD());
							 		List retList = bc.getsetLotNumberingFd(tempStruct.getITEM_CD(), tempStruct.getOPR_DATE());
		
									//����I���̏ꍇ
									if(bc.getResultStatus().intValue() == 1){
										//�݌Ƀ��b�g�ԍ��̎擾
										if(!retList.isEmpty()){
											String result1 = (String)retList.get(0);
											tempStruct.setLOT_NO(result1);
										}
									//�x�� or �ُ�I���̏ꍇ
									} else {
										// ���b�g�ԍ��̍̔ԂɎ��s���܂����B
										errCode = "AD00214";
										writeLogFiles(ERROR,errCode);
										updFlg = 9;
										setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
										continue;
									}
			    				} else {
									// ���b�g�Ǘ�����
									tempList = entity.mT_LOT_CTRL.read(conn,tempStruct);
									// ���b�g���o�^
									if(tempList.isEmpty()) {
										// �݌Ƀ��b�g�ԍ������b�g�Ǘ��ɑ��݂��܂���B
										errCode = "AD00220";
										writeLogFiles(ERROR,errCode);
										updFlg = 1;
										setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
										continue;
									}
			    				}
			    			}
			    		}
			    		
			    		//-------------------��Ǝ��ѓo�^------------------------
			    		entity.mInsertOprRslt.create(conn,tempStruct); 
			    		
			    		//---------[��ƌn��ʎd�|]�A[�i�ڕʎd�|]�̍X�V------------
			    		if("1".equals(tempStruct.getc_COMPLETE())) { // ��Ɗ����̏ꍇ
			    			AD0040010Struct oprRsltStruct = new AD0040010Struct();
			    			oprRsltStruct.setOPR_INST_CD(tempStruct.getOPR_INST_CD());
			    			oprRsltStruct.setUPDATE_WORK_STS_TYP("9");
			    			oprRsltStruct.setWORK_ODR_CD(headerStruct.getWORK_ODR_CD());
			    			oprRsltStruct.setUSER_CD(userId);
			    			oprRsltStruct.setPRG_NM(strProgramName);
			    			
							//����Ǝw���ԍ����̍Œx��Ɠ��̎擾�i[��Ǝ���]."��Ǝ��э�Ɠ�"�j
							tempList = entity.mT_OPR_RSLT.read(conn, oprRsltStruct);
							if (tempList.isEmpty()) {
								errCode = "ZZ01101";
								writeLogFiles(ERROR,errCode);
								updFlg = 1;
								setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
								continue;
							}
							oprRsltStruct.setOPR_DATE(((AD0040010Struct)tempList.get(0)).getOPR_DATE());
							
							//��ƌn��d�|�X�V����
							entity.mUpdateWorkProc.update(conn, oprRsltStruct);
							

							//�f�}���h�����i���v�ʁj
							String strOprDate = tempStruct.getOPR_DATE().substring(0,10);
							CommonOd od = new CommonOd(conn, headerStruct.getPLANT_CD(), userId, strProgramName);
							od.changeDemandForComplete(
									headerStruct.getWORK_ODR_CD(),
									headerStruct.getWORK_IN_PROC_CD(),
									Converter.strToDate("false".equalsIgnoreCase(struct.getTIME_CTRL()) ? 
											strOprDate + " " + "00:00" : tempStruct.getOPR_DATE().substring(0,13) + ":" + tempStruct.getOPR_DATE().substring(13,15), 
											Converter.SLASH_DATE_HOUR_COLON_MINUTE)
							);
							// ��ƌn�񂪍ŏI�n��̏ꍇ
							if("1".equals(headerStruct.geth_FINAL_PROC_FLG())) {
								// �i�ڕʎd�|�X�V����
								entity.mUpdateWorkItem.update(conn, oprRsltStruct);
								
								// �I�[�_�����i���v�ʁj
								od.changeOrderForComplete(headerStruct.getOD_NO(),-1);
								
								AD0040010Struct tOdUpdateStruct = new AD0040010Struct();
								tempList = entity.mSelectItem.read(conn,headerStruct);
								if (!tempList.isEmpty()) {
									tOdUpdateStruct = (AD0040010Struct)tempList.get(0);
								}
								// [�i��].�H���Ǘ��i�ڋ敪 = 1:�H���Ǘ��i�ڂ̏ꍇ
								if (tOdUpdateStruct.getMANHOUR_TYP() != null
										&& "1".equals(tOdUpdateStruct.getMANHOUR_TYP())){
									tOdUpdateStruct.setDM_STS_TYP("9");
									tOdUpdateStruct.setISSUE_CMPLT_DATE(tempStruct.getOPR_DATE());
									tOdUpdateStruct.setUSER_CD(userId);
									tOdUpdateStruct.setPRG_NM(strProgramName);
									tOdUpdateStruct.setOD_NO(headerStruct.getOD_NO());
									// �f�}���h�����i���v�ʁj
									entity.mUPDATE_T_OD.update(conn,tOdUpdateStruct);
								}
							}
			    		}
			    		
			    		//---------------------�����o�ɏ���----------------------
			    		WhAutoIssueProc whAutoIssueProc = new WhAutoIssueProc(conn,
								tempStruct.getPLANT_CD(),
								tempStruct.getUSER_CD(),
								tempStruct.getPRG_NM());
						WhAutoIssueProc.AutoIssueParam autoIssueParam = whAutoIssueProc.new AutoIssueParam();
						
						// �p�����[�^�̃Z�b�g
						autoIssueParam.m_WORK_ODR_CD = headerStruct.getWORK_ODR_CD();
						autoIssueParam.m_WORK_IN_PROC_CD = headerStruct.getWORK_IN_PROC_CD();
						autoIssueParam.m_PARTIAL_PRD_NO = Integer.parseInt(tempStruct.getPARTIAL_PRD_NO());
						autoIssueParam.m_OPR_RSLT_CRCT_NO = 0;
						autoIssueParam.m_PUCH_ODR_CD = null;
						autoIssueParam.m_ACPT_NO = 0;
						autoIssueParam.m_ACPT_RSLT_CRCT_NO = 0;
						autoIssueParam.m_RCV_ISSUE_TYP = 2;
						autoIssueParam.m_RCV_ISSUE_DATE = tempStruct.getOPR_DATE();
						autoIssueParam.m_RCV_ISSUE_RSLT_NO = Calculate.add(tempStruct.getACPT_QTY(), tempStruct.getDEFECT_QTY());
						autoIssueParam.m_RCV_ISSUE_CMPLT_FLG = Integer.parseInt(tempStruct.getc_COMPLETE());
						autoIssueParam.m_PLANT_CD = headerStruct.getPLANT_CD();
						
						AutoIssue autoIssue = new AutoIssue(conn, headerStruct.getPLANT_CD(), userId, strProgramName);
						
						// �����o�Ɏ��s
						boolean result = autoIssue.AutoIssueOpr(autoIssueParam);
						
						String[] message;
						if(result){
							// �Ɩ��A���[��������Ώo�͂���B
							for(int m=0; m<autoIssue.getWarnList().size(); m++){
								message = (String[])autoIssue.getWarnList().get(m);
								writeLogFiles(WORNING, message[0], message[1]);
							}
						}else{
							// �Ɩ��G���[�̏o��
							for(int n=0; n<autoIssue.getErrorList().size(); n++){
								message = (String[])autoIssue.getErrorList().get(n);
								errCode = message[0];
								errList.add(errCode);
								errList.add( message[1]);
								writeLogFiles(ERROR, errCode, message[1]);							
							}
							updFlg = 9;
							StringBuffer buffer = new StringBuffer();
			        		String code  = null;
			        		String value[] = new String[1];
			        		for(int m = 0; m < errList.size(); m+=2) {
			        			code = String.valueOf(errList.get(m));
			        			value[0] = String.valueOf(errList.get(m+1));
			        			buffer.append(MessageFormat.format(_messages.getString(code), value) + " ");
			        		}
							setMessageHash(oprRsltTempCtlNo,updFlg,buffer.toString());
							continue;
						}
						// �V�X�e���p�����[�^�F�@�h�H���ۊǏꏊ�̍݌ɂ��Ǘ�����h�@���@�h�n�m�h�@�ɐݒ肵���ꍇ�A�ȉ��̏������s��
						// �i�ڂ̍H���݌ɂ̊Ǘ����s��
						if ("1".equals(_processManageFlg)) {
							updFlg =ItemWorkManager(tempStruct,headerStruct);
							// �G���[�����ꍇ
							if (updFlg != 0) {
								setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
								continue loop;
							}
						}
						
						// ------------------------���ɏ���--------------------
						if("1".equals(headerStruct.geth_FINAL_PROC_FLG())) {
							//���Ԃ̃`�F�b�N
							String jobOdrNo = headerStruct.getJOB_ODR_CD();
							if (!isNull(jobOdrNo)) {
								tempList = entity.mSelectJobOdr.read(conn,headerStruct);
								if (!tempList.isEmpty()) {
									AD0040010Struct jobStruct = (AD0040010Struct)tempList.get(0);
									if ("3".equals(jobStruct.getJOB_ODR_TYP())
												&& jobStruct.getITEM_CD().equals(headerStruct.getITEM_CD())) {
										//�݌ɕ�[����
										jobOdrNo = null;
									}
								}
							}

							// ���o�ɊǗ��ԍ��̔�
							Numbering collectNum = new Numbering(conn,
									CollectNumber.ISSUE_CD,
									tempStruct.getUSER_CD(),
									tempStruct.getPRG_NM(),
									tempStruct.getPLANT_CD());
							String no = collectNum.getNo();
							if (no == null || no.length() == 0) {
								//�̔Ԍ��ʂ��Ȃ�
								errCode = "ZZ01106";
								writeLogFiles(ERROR, errCode);
								updFlg = 9;
								setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
								continue;
							}
							
							// �ۊǋ�ʓ��o�ɒǉ�
							AD0040010Struct rcvIssueStruct = new AD0040010Struct();
							rcvIssueStruct.setRCV_ISSUE_CTRL_CD(no);
							rcvIssueStruct.setITEM_CD(headerStruct.getITEM_CD());
							rcvIssueStruct.setPLANT_CD(headerStruct.getPLANT_CD());
							rcvIssueStruct.setPARTIAL_PRD_NO(tempStruct.getPARTIAL_PRD_NO());
							rcvIssueStruct.setWH_CD(tempStruct.getWH_CD());
							rcvIssueStruct.setJOB_ODR_CD(jobOdrNo);
							rcvIssueStruct.setWORK_ODR_CD(headerStruct.getWORK_ODR_CD());
							rcvIssueStruct.setWORK_IN_PROC_CD(headerStruct.getWORK_IN_PROC_CD());
							rcvIssueStruct.setRCV_ISSUE_QTY(tempStruct.getACPT_QTY());
							rcvIssueStruct.setRCV_ISSUE_DATE(tempStruct.getOPR_DATE());
							rcvIssueStruct.setRCV_ISSUE_GNR_TYP("11");
							rcvIssueStruct.setRCV_ISSUE_ODD_QTY("0.0");
							rcvIssueStruct.setOD_NO(headerStruct.getOD_NO());
							rcvIssueStruct.setVEND_LOT_NO(tempStruct.getVEND_LOT_NO());
							rcvIssueStruct.setLOT_NO(tempStruct.getLOT_NO());
							rcvIssueStruct.setUSER_CD(userId);
							rcvIssueStruct.setPRG_NM(strProgramName);
							rcvIssueStruct.setRCV_ISSUE_TYP("1");
							rcvIssueStruct.setOPR_RSLT_CRCT_NO("0"); 
							if ("1".equals(tempStruct.getc_COMPLETE())) {
								rcvIssueStruct.setRCV_ISSUE_CMPLT_FLG("1");
							} else {
								rcvIssueStruct.setRCV_ISSUE_CMPLT_FLG("0");
							}
							rcvIssueStruct.setSTOCK_UPD_TYP("1");					 
							rcvIssueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
		                    //��ЃR�[�h
							rcvIssueStruct.setCOMPANY_CD(company_cd);
							//�ۊǋ�ʓ��o��
							rcvIssueStruct.setRCV_ISSUE_AFTER_QTY(rcvIssueStruct.getRCV_ISSUE_QTY());
							entity.mInsertRecvIssue.create(conn, rcvIssueStruct);
							// ���ɏ����Ăяo��
							RcvCancel RCan = new RcvCancel(conn, rcvIssueStruct.getRCV_ISSUE_CTRL_CD(), tempStruct.getUSER_CD());
							boolean bRSLT = RCan.execProcess();
							if (!bRSLT) {
								//���ɏ������s �T�[�o�[�G���[
								errCode = "ZZ01106";
								writeLogFiles(ERROR, errCode);
								updFlg = 9;
								setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
								continue;
							}
							
							// �V�X�e���p�����[�^�F�h�s�Ǎ݌ɂ��H���Ǘ�����h���h�n�m�h���A�u�s�ǐ��v�����O�ꍇ�A�s�Ǖi���ɂ��s��
							if ("1".equals(_defectManageFlg) && !"0".equals(tempStruct.getDEFECT_QTY())) {
								AD0040010Struct defectInIssueStruct = new AD0040010Struct();
								no = collectNum.getNo();
								if (no == null || no.length() == 0) {
									//�̔Ԍ��ʂ��Ȃ�
									errCode = "ZZ01106";
									writeLogFiles(ERROR, errCode);
									setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
									continue;
								}
								
								// ���o�ɊǗ��ԍ�
								defectInIssueStruct.setRCV_ISSUE_CTRL_CD(no);
								//���o�ɋ敪
								defectInIssueStruct.setRCV_ISSUE_TYP("3");
								//�i�ڔԍ�
								defectInIssueStruct.setITEM_CD(tempStruct.getITEM_CD());
								//�ۊǋ�R�[�h
								defectInIssueStruct.setWH_CD(tempStruct.getWH_CD());
								//����
								defectInIssueStruct.setJOB_ODR_CD(jobOdrNo);
								//���Ԏ}��
								defectInIssueStruct.setJOB_ODR_DETAIL_NO("0");
								//�����
								defectInIssueStruct.setACPT_NO("0");
								//��ƌv��ԍ�
								defectInIssueStruct.setWORK_ODR_CD(headerStruct.getWORK_ODR_CD());
								//�d�|��ƃR�[�h
								defectInIssueStruct.setWORK_IN_PROC_CD(headerStruct.getWORK_IN_PROC_CD());
								//�����
								defectInIssueStruct.setPARTIAL_PRD_NO(tempStruct.getPARTIAL_PRD_NO());
								//��Ǝ��ђ�����
								defectInIssueStruct.setOPR_RSLT_CRCT_NO("0");
								//�o�Ɏw���ԍ�
								defectInIssueStruct.setISSUE_INST_CD(null);
								//���o�ɐ�
								defectInIssueStruct.setRCV_ISSUE_QTY(tempStruct.getDEFECT_QTY());
								//���o�ɑO�݌ɐ�
								defectInIssueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
								//���o�Ɍ�݌ɐ�
								defectInIssueStruct.setRCV_ISSUE_AFTER_QTY("0");
								//���o�ɔN����
								defectInIssueStruct.setRCV_ISSUE_DATE(tempStruct.getOPR_DATE());
								//���o�ɔ����敪
								defectInIssueStruct.setRCV_ISSUE_GNR_TYP("11");
								//�݌ɍX�V�敪
								defectInIssueStruct.setSTOCK_UPD_TYP("1");
								//���o�Ɋ����t���O
								if ("1".equals(tempStruct.getc_COMPLETE())) {
									defectInIssueStruct.setRCV_ISSUE_CMPLT_FLG("1");
								} else {
									defectInIssueStruct.setRCV_ISSUE_CMPLT_FLG("0");
								}
								//�I�[�_�f�}���h�ԍ�
								defectInIssueStruct.setOD_NO(headerStruct.getOD_NO());
								//���o�ɒ[��
								defectInIssueStruct.setRCV_ISSUE_ODD_QTY("0");
								//�H��R�[�h
								defectInIssueStruct.setPLANT_CD(headerStruct.getPLANT_CD());
								//�݌Ƀ��b�g�ԍ�
								defectInIssueStruct.setLOT_NO(tempStruct.getLOT_NO());
								defectInIssueStruct.setUSER_CD(tempStruct.getUSER_CD());
								defectInIssueStruct.setPRG_NM(tempStruct.getPRG_NM());
								defectInIssueStruct.setCOMPANY_CD(company_cd);
								// �ۊǋ�ʓ��o��
								entity.mInsertRecvIssue.create(conn, defectInIssueStruct);
								IssueProcess IProc = new IssueProcess(conn, no);
								boolean bResult = IProc.execDefectProcess();
								if (!bResult) {
									//�o�ɏ������s �T�[�o�[�G���[
									updFlg = 9;
									setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
									continue;
								}
							}
							
							// �H���Ǘ��i�ڂ̏ꍇ�A[�ۊǋ�ʓ��o��]�̒ǉ��i�o�Ɂj
							if(!manHourRcvIssue(tempStruct, headerStruct, jobOdrNo, company_cd)) {
								updFlg = 9;
								setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
				    			continue;
							};
							
							// ���b�g�Ǘ��̍X�V����
							if("1".equals(headerStruct.getLOT_CTRL_FLG())) {
								m_med.setLOT_NO(tempStruct.getLOT_NO());
								m_med.setITEM_CD(tempStruct.getITEM_CD());
					    		m_med.setUSER_CD(userId);
					    		m_med.setPRG_NM(strProgramName);
								m_med.getT_LOT_CTRL().update();
							}
							
							//-------------------���i�[�̒ǉ�����---------------------
				    		// ���i���o�͉�
					 		if("1".equals(identCard)) {
					 			m_med.setITEM_CD(tempStruct.getITEM_CD());
					 			m_med.getselectPRODUCT_TYP().read();
					 			if(!m_med.getselectPRODUCT_TYP().next()) {
									// �i�ڃ}�X�^���琻�i�敪�̌�������
									errCode = "KR20011";
									writeLogFiles(ERROR, errCode);
									updFlg = 9;
									setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
					    			continue;
					 			}
					 			String strProduct_Typ = m_med.getPRODUCT_TYP();
					 			
								if (sysPRODUCT_TYP != null && !"".equals(sysPRODUCT_TYP)){
									String[] arrProduct_Typ = sysPRODUCT_TYP.split(",");
									for(int m = 0; m < arrProduct_Typ.length; m ++){
										if(strProduct_Typ != null && !"".equals(strProduct_Typ) && 
												strProduct_Typ.equals(arrProduct_Typ[m])){
											productFlg = true;
											break;
										} 
									}
								}
					 		}
					 		
							// ���i�[�Ǘ��ԍ��̐V�K�̔�
							if(productFlg) {
								m_med.setITEM_CD(tempStruct.getITEM_CD());
								m_med.getselectGetIdentCardCtlNo().read();
								m_med.getselectGetIdentCardCtlNo().next();
								m_med.setOPR_INST_CD(tempStruct.getOPR_INST_CD());
								m_med.setPARTIAL_PRD_NO(tempStruct.getPARTIAL_PRD_NO());
								m_med.setRCV_ISSUE_CTRL_CD(no);							
								m_med.setJOB_ODR_CD(jobOdrNo);
								m_med.setFIRST_IDENT_CARD_QTY(tempStruct.getACPT_QTY());
								m_med.setIDENT_CARD_QTY(tempStruct.getACPT_QTY());
								m_med.setOPR_DATE(tempStruct.getOPR_DATE());
								m_med.setPLANT_CD(tempStruct.getPLANT_CD());
								m_med.setWS_CD(tempStruct.getWS_CD());
								m_med.setLOT_NO(tempStruct.getLOT_NO());
					    		m_med.setUSER_CD(userId);
					    		m_med.setPRG_NM(strProgramName);					
								// ���i�[�̓o�^
					    		m_med.getinsertIdentCard().create();
							}
						}
						
						//-------------------�s�ǎ��т̓o�^����---------------------
						AD0040010Struct defectStruct = new AD0040010Struct();
						defectStruct.setOPR_INST_CD(tempStruct.getOPR_INST_CD());
						defectStruct.setPARTIAL_PRD_NO(tempStruct.getPARTIAL_PRD_NO());
						defectStruct.setPLANT_CD(headerStruct.getPLANT_CD());
						defectStruct.setUSER_CD(tempStruct.getUSER_CD());
						defectStruct.setPRG_NM(tempStruct.getPRG_NM());
						
						// �s�Ǘ��R1
						if(!isNull(tempMed.getDEFECT_CAUSE_CD1())) {
							defectStruct.setl_DEFECT_CAUSE_CD(tempMed.getDEFECT_CAUSE_CD1());
							defectStruct.setl_DEFECT_QTY(tempMed.getDEFECT_QTY1());
							defectStruct.setl_DEFECT_COMMENT(tempMed.getDEFECT_COMMENT1());
							entity.mInsertDefect.create(conn, defectStruct);
						}
						
						// �s�Ǘ��R2
						if(!isNull(tempMed.getDEFECT_CAUSE_CD2())) {
							defectStruct.setl_DEFECT_CAUSE_CD(tempMed.getDEFECT_CAUSE_CD2());
							defectStruct.setl_DEFECT_QTY(tempMed.getDEFECT_QTY2());
							defectStruct.setl_DEFECT_COMMENT(tempMed.getDEFECT_COMMENT2());
							entity.mInsertDefect.create(conn, defectStruct);
						}
						// �s�Ǘ��R3
						if(!isNull(tempMed.getDEFECT_CAUSE_CD3())) {
							defectStruct.setl_DEFECT_CAUSE_CD(tempMed.getDEFECT_CAUSE_CD3());
							defectStruct.setl_DEFECT_QTY(tempMed.getDEFECT_QTY3());
							defectStruct.setl_DEFECT_COMMENT(tempMed.getDEFECT_COMMENT3());
							entity.mInsertDefect.create(conn, defectStruct);
						}
						// �s�Ǘ��R4
						if(!isNull(tempMed.getDEFECT_CAUSE_CD4())) {
							defectStruct.setl_DEFECT_CAUSE_CD(tempMed.getDEFECT_CAUSE_CD4());
							defectStruct.setl_DEFECT_QTY(tempMed.getDEFECT_QTY4());
							defectStruct.setl_DEFECT_COMMENT(tempMed.getDEFECT_COMMENT4());
							entity.mInsertDefect.create(conn, defectStruct);
						}
						// �s�Ǘ��R5
						if(!isNull(tempMed.getDEFECT_CAUSE_CD5())) {
							defectStruct.setl_DEFECT_CAUSE_CD(tempMed.getDEFECT_CAUSE_CD5());
							defectStruct.setl_DEFECT_QTY(tempMed.getDEFECT_QTY5());
							defectStruct.setl_DEFECT_COMMENT(tempMed.getDEFECT_COMMENT5());
							entity.mInsertDefect.create(conn, defectStruct);
						}
						
						//--------------�q���i�ꊇ�X�V����--------------------------
						if ("1".equals(tempMed.getCHILD_RSLTUPDATE_FLG())) {
						// ����̍ő�d�|��ƌn��ԍ����擾
						String maxProcNo = null;
						AD0040010Struct issueStruct = null;
						String denominator = null;  // ����
						String numerator = null;  //  ���q
						String useSum = null;  // �X�V�g�p����
						
						//��Ǝ��ѕi�ڂ̃��b�g�Ǘ��t���O = 1(���b�g�g���[�X�Ǘ����s���B)�̏ꍇ
						List headerLotList = new ArrayList();
						if("1".equals(headerStruct.getLOT_CTRL_FLG())){
							//�ŏI�n��łȂ��ꍇ
							if (!"1".equals(headerStruct.geth_FINAL_PROC_FLG())) {
								tempList = entity.mSelectParentLotNo.read(conn, headerStruct);
								if (!tempList.isEmpty()) {
									for (int l = 0; l < tempList.size(); l++) {
										AD0040010Struct parentStruct = (AD0040010Struct)tempList.get(l);
										headerLotList.add(parentStruct);
									}
								}
							//�ŏI�n��̏ꍇ
							} else {
								AD0040010Struct finalStruct = new AD0040010Struct();
								finalStruct.setStructM(headerStruct);
								finalStruct.setLOT_NO(tempStruct.getLOT_NO());
								headerLotList.add(finalStruct);
							}
						}
						
						List issueList = new ArrayList();
						tempList = entity.mSelectMaxProcNo.read(conn, headerStruct);
						if (!tempList.isEmpty()) {
							AD0040010Struct maxStruct = (AD0040010Struct)tempList.get(0);
							maxProcNo = maxStruct.getPROC_NO();
						}
						//�ŏI�H���t���O�𗧂Ă�
						if (maxProcNo != null && "1".equals(headerStruct.getOUTSIDE_TYP()) 
								&& maxProcNo.equals(headerStruct.getPROC_NO())){
							AD0040010Struct selectIssueStruct= new AD0040010Struct();
							selectIssueStruct.setWORK_ODR_CD(headerStruct.getWORK_ODR_CD());
							selectIssueStruct.setPARTIAL_PRD_NO(tempStruct.getPARTIAL_PRD_NO());
							//����ōő�d�|��ƌn��ԍ��̏ꍇ����
							issueList = entity.mSelectIssue.read(conn,selectIssueStruct);
						}
						
						for(int j = 0; j < issueList.size(); j++) {
							issueStruct = (AD0040010Struct)issueList.get(j);
							if ("1".equals(_processManageFlg)) {
			    				// �擾���ꂽ���ځu�g�p���ۊǋ�v���Đݒ肷��
			        			m_med.setWORK_ODR_CD(headerStruct.getWORK_ODR_CD());
			        			m_med.setPROC_NO(issueStruct.getPROC_NO());
			        			m_med.setWH_CD(issueStruct.getWH_CD());
			        			
			        			m_med.getCheckFirstWork().read();
			        			m_med.getCheckFirstWork().next();
			    				
			        			// �ŏ��H�����ǂ������f����
					    		if (!m_med.getFIRST_OPR_INST_CD().equals(tempStruct.getIN_OPR_INST_CD())) {
					    			// �O�H��������̏ꍇ�F�O�H���̍�Ǝ��тœo�^�����ۊǋ�R�[�h
					    			m_med.setFIRST_WORK_FLG("0");
					    			
					    			// �O�H�������擾����
					    			m_med.getGetPrevWorkInfo().read();
					    			m_med.getGetPrevWorkInfo().next();
					    			issueStruct.setWH_CD(m_med.getPREV_WH_CD());
					    			
					    		}
							}
		        			
							// �ۊǋ�R�[�h��NULL�`�F�b�N
							if (isNull(issueStruct.getWH_CD())) {
								// �q�i�ڂ̎g�p���ۊǋ�R�[�h�������͂ł��B
								errCode = "AD00215";
								writeLogFiles(ERROR, errCode);
								updFlg = 9;
								setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
				    			continue loop;
							}
							
							// �ۊǋ�R�[�h�`�F�b�N
							tempList = entity.mSelectChkWhCd.read(conn,issueStruct);
							if(tempList.isEmpty()){
								errCode = "AD00216";
								writeLogFiles(ERROR, errCode);
								updFlg = 9;
								setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
				    			continue loop;
							}
							
							// �ۊǋ�R�[�h�̍H��R�[�h�ƍ�ƌn��ʎd�|�̍H��R�[�h�̓���`�F�b�N
							AD0040010Struct whStruct = (AD0040010Struct)tempList.get(0);
							if (whStruct.getPLANT_CD() == null || !whStruct.getPLANT_CD().equals(headerStruct.getPLANT_CD())) {
								errCode = "AD00217";
								writeLogFiles(ERROR, errCode);
								updFlg = 9;
								setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
				    			continue loop;
							}
							
							// �X�V�g�p���ʂ̌v�Z
							denominator = issueStruct.geth_ISSUE_INST_UNIT_DENOMINATOR(); // ����
							numerator = issueStruct.geth_ISSUE_INST_UNIT_NUMERATOR(); // ���q
							useSum = Calculate.add(tempStruct.getACPT_QTY(), tempStruct.getDEFECT_QTY());							
							if("1".equals(issueStruct.getUNIT_QTY_TYP())) { //�@�����Ǘ�
								useSum = Calculate.divide(Calculate.multiply(useSum, numerator), denominator, Calculate.CEIL);
								useSum = Calculate.ceil(useSum, 0);
							} else {
								useSum = Calculate.divide(Calculate.multiply(useSum, numerator), denominator, 4, Calculate.CEIL);
							}
							issueStruct.setTEMP_USE_QTY(useSum);
							if (issueStruct.getTEMP_USE_QTY() == null || Calculate.compare(useSum, "0") ==0) {
								continue;
							}
							
							// ���o�ɊǗ��ԍ��̔�
							Numbering collectNum = new Numbering(conn,
									CollectNumber.ISSUE_CD,
									tempStruct.getUSER_CD(),
									tempStruct.getPRG_NM(),
									tempStruct.getPLANT_CD());
							String no = collectNum.getNo();
							if (no == null || no.length() == 0) {
								//�̔Ԍ��ʂ��Ȃ�
								errCode = "ZZ01106";
								writeLogFiles(ERROR, errCode);
								updFlg = 9;
								setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
				    			continue loop;
							}
							// ���o�ɊǗ��ԍ�
							issueStruct.setRCV_ISSUE_CTRL_CD(no);
		
							// �g�p������
							if("1".equals(issueStruct.getMRP_ODR_TYP()) || "2".equals(issueStruct.getMRP_ODR_TYP())) {
								issueStruct.setJOB_ODR_CD(headerStruct.getJOB_ODR_CD());
							} else {
								issueStruct.setJOB_ODR_CD("");
							}
							// �H��
							issueStruct.setPLANT_CD(headerStruct.getPLANT_CD());
							// �ޔ�p�莝���݌ɐ���������
							issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
							issueStruct.setOPR_DATE(tempStruct.getOPR_DATE());
							issueStruct.setRCV_ISSUE_DATE(tempStruct.getOPR_DATE());
							issueStruct.setPARTIAL_PRD_NO(tempStruct.getPARTIAL_PRD_NO());
							issueStruct.setWORK_ODR_CD(headerStruct.getWORK_ODR_CD());
							issueStruct.setWORK_IN_PROC_CD(headerStruct.getWORK_IN_PROC_CD());
							issueStruct.setRCV_ISSUE_QTY(Calculate.multiply(issueStruct.getTEMP_USE_QTY(), "-1"));
							if (Calculate.compare(issueStruct.getTEMP_USE_QTY(), "0") > 0) {
								//�H���݌ɏo��
								issueStruct.setRCV_ISSUE_GNR_TYP("41");
							} else {
								//�H���݌ɏo�Ɏ��
								issueStruct.setRCV_ISSUE_GNR_TYP("49");
							}
							issueStruct.setRCV_ISSUE_ODD_QTY("0");
							issueStruct.setOD_NO(headerStruct.getOD_NO());
							issueStruct.setRCV_ISSUE_CMPLT_FLG("0");
							issueStruct.setSTOCK_UPD_TYP("2");
							issueStruct.setRCV_ISSUE_TYP("2");
							issueStruct.setWS_CD(tempStruct.getWS_CD());
							issueStruct.setOPR_RSLT_CRCT_NO("0");
							issueStruct.setUSER_CD(tempStruct.getUSER_CD());
							issueStruct.setPRG_NM(tempStruct.getPRG_NM());
		
							// �H���d�|�݌ɏo�ɏ���
							if(isNull(issueStruct.getJOB_ODR_CD())) {
								//�ۊǋ�ʕi�ڍ݌ɍX�V
								tempList = entity.mSelectItemStock.read(conn,issueStruct);
								if (tempList.isEmpty()) {
									// �o�^
									issueStruct.setSTOCK_ON_HAND_QTY(Calculate.multiply(issueStruct.getTEMP_USE_QTY(), "-1"));
									entity.mInsertItemStock.create(conn, issueStruct);
								} else {
									// �X�V
									AD0040010Struct itemStruct = (AD0040010Struct)tempList.get(0);
									// �X�V�O�i�ڕʎ莝�݌ɐ�
									issueStruct.setSAVE_STOCK_ON_HAND_QTY(itemStruct.getSTOCK_ON_HAND_QTY());
									// �i�ڕʎ莝�݌ɐ�
									issueStruct.setSTOCK_ON_HAND_QTY(
											Calculate.subtract(issueStruct.getSAVE_STOCK_ON_HAND_QTY(), issueStruct.getTEMP_USE_QTY()));		
									entity.mUpdateItemStock.update(conn, issueStruct);
								}
							} else {
								//���Ԏd�|�݌ɍX�V
								tempList = entity.mSelectOdrStock.read(conn,issueStruct);		
								if (tempList.isEmpty()) {
									//�o�^
									issueStruct.setSTOCK_ON_HAND_QTY(Calculate.multiply(issueStruct.getTEMP_USE_QTY(), "-1"));
									entity.mInsertOdrStock.create(conn,issueStruct);
								} else {
									//�X�V
									AD0040010Struct jobStruct = (AD0040010Struct)tempList.get(0);
									// �X�V�O�i�ڕʎ莝�݌ɐ�
									issueStruct.setSAVE_STOCK_ON_HAND_QTY(jobStruct.getSTOCK_ON_HAND_QTY());
									issueStruct.setJOB_ODR_DETAIL_NO(jobStruct.getJOB_ODR_DETAIL_NO());
									// �i�ڕʎ莝�݌ɐ�
									issueStruct.setSTOCK_ON_HAND_QTY(
											Calculate.subtract(issueStruct.getSAVE_STOCK_ON_HAND_QTY(), issueStruct.getTEMP_USE_QTY()));		
									entity.mUpdateOdrStock.update(conn,issueStruct);
								}
							}
							//��ЃR�[�h
							issueStruct.setCOMPANY_CD(company_cd);
							issueStruct.setRCV_ISSUE_AFTER_QTY(issueStruct.getRCV_ISSUE_QTY());
							// �q�i�ڂ����b�g�Ǘ��i�̏ꍇ
							if ("1".equals(issueStruct.getLOT_CTRL_FLG())) {
								// �o�Ɏ��і��׎擾
								List lotIssueList = entity.mT_LOT_ISSUE_INST.read(conn,issueStruct);
								// �f�[�^���Ȃ��ꍇ
								if (lotIssueList.isEmpty()) {
									errCode = "AD20135";
									writeLogFiles(ERROR, errCode);
									updFlg = 9;
									setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
					    			continue loop;
								}
		
								// �g�p�c���ݒ�
								BigDecimal remainQty = new BigDecimal(issueStruct.getTEMP_USE_QTY());
		
								AD0040010Struct lotUseStruct = new AD0040010Struct();
								lotUseStruct.setStructM(issueStruct);							
								lotUseStruct.setsUser_ID(tempStruct.getUSER_CD());
		
								for (int m = 0; m < lotIssueList.size(); m++) {
									AD0040010Struct lotIssueStruct = (AD0040010Struct) lotIssueList.get(m);
		
									// �������ĉ\���ݒ�
									BigDecimal issueQty = new BigDecimal(lotIssueStruct.getISSUE_QTY());
									BigDecimal spentQty = new BigDecimal(lotIssueStruct.getSPENT_QTY());
									BigDecimal availQty = issueQty.subtract(spentQty);

									// ���b�g�ʎg�p���ъǗ��ԍ��̔�
									List seqList = entity.mSEQ_JF_RSLT.read(conn, lotIssueStruct);
									if (seqList != null && seqList.size() > 0) {
										lotUseStruct.setRSLT_CTL_SEQ_NO(((AD0040010Struct) seqList.get(0)).getNEXTVAL());
									}
		
									// ���b�g�ԍ��ݒ�
									lotUseStruct.setLOT_NO(lotIssueStruct.getLOT_NO());
		
									BigDecimal useLotQty = null;
		
									// �������ĉ\�� >= �g�p�c���̏ꍇ
									if (availQty.doubleValue() >= remainQty.doubleValue()) {
										// �g�p�c�����������Đ��ɐݒ�
										useLotQty = remainQty;
										// �������ĉ\�� < �g�p�c���̏ꍇ
									} else {
										// �ŏI�f�[�^�̏ꍇ
										if (m == lotIssueList.size() - 1) {
											// �g�p�c�����g�p���ɐݒ�
											useLotQty = remainQty;
											// �ŏI�f�[�^�łȂ��ꍇ
										} else {
											// �����\����0���傫���ꍇ
											if (availQty.doubleValue() > 0) {
												// �g�p�c�����g�p���ɐݒ�
												useLotQty = remainQty;
		
												// �����R�[�h�ȍ~���擾
												for (int n = m + 1; n < lotIssueList.size(); n++) {
													AD0040010Struct nextLotIssueStruct = (AD0040010Struct) lotIssueList.get(n);
		
													// �������ĉ\���ݒ�
													BigDecimal nextIssueQty = new BigDecimal(nextLotIssueStruct.getISSUE_QTY());
													BigDecimal nextSpentQty = new BigDecimal(nextLotIssueStruct.getSPENT_QTY());
													BigDecimal nextAvailQty = nextIssueQty.subtract(nextSpentQty);
		
													// �����R�[�h�ȍ~�Ɉ����\�ȃf�[�^������ꍇ
													if (nextAvailQty.doubleValue() > 0) {
														// �������ĉ\�����g�p���ɐݒ�
														useLotQty = availQty;
														break;
													}
												}
												// �����\����0�ȉ��̏ꍇ
											} else {
												// ���̃f�[�^���擾
												continue;
											}
										}
									}
		
									// �g�p���������\�����傫���ꍇ
									if (useLotQty.doubleValue() > availQty.doubleValue()) {
										// ���b�Z�[�W�o��
										writeLogFiles(WORNING, "AD20136");
									}

									// �g�p�ϐ��ʁA�g�p�\�萔�ʂɏ�L�Őݒ肵���g�p����ݒ�
									lotUseStruct.setTOTAL_ISSUE_QTY(useLotQty.toString());
									lotUseStruct.setSUPPLIED_ISSUE_QTY(useLotQty.toString());						
									// ���ѓ����g�p���ɐݒ�
									lotUseStruct.setSUPPLIED_DATE(lotUseStruct.getOPR_DATE().substring(0,10));
		
									// [���b�g�ʎg�p����]�̒ǉ�
									entity.mT_LOT_USE_RSLT.create(conn, lotUseStruct);
		
									// [�o�Ɏ��і���]�̍X�V
									lotUseStruct.setSPENT_QTY(spentQty.add(useLotQty).toString());
									entity.mT_LOT_ISSUE_INST.update(conn, lotUseStruct);
		
									issueStruct.setLOT_NO(lotIssueStruct.getLOT_NO());
									issueStruct.setRCV_ISSUE_QTY(useLotQty.negate().toString());
		
									// ���b�g�ʕi�ڍ݌Ɍ���
									tempList = entity.mT_LOT_STOCK.read(conn,issueStruct);
		
									// �X�V�O�̍݌ɐ��ݒ�
									if (tempList.isEmpty()) {
										issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
									} else {
										AD0040010Struct lotStruct = (AD0040010Struct) tempList.get(0);
										issueStruct.setSAVE_STOCK_ON_HAND_QTY(lotStruct.getSTOCK_ON_HAND_QTY());
									}
		
									// 2���ڈȍ~�̃f�[�^�̏ꍇ
									if (m > 0) {
										// ���o�ɊǗ��ԍ��̔�
										collectNum = new Numbering(conn,
												CollectNumber.ISSUE_CD, 
												tempStruct.getUSER_CD(),
												tempStruct.getPRG_NM(), 
												tempStruct.getPLANT_CD());
										no = collectNum.getNo();
										if (no == null || no.length() == 0) {
											// �̔Ԍ��ʂ��Ȃ�
											errCode = "ZZ01106";
											writeLogFiles(ERROR, errCode);
											updFlg = 9;
											setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
											continue loop;
										}
										issueStruct.setRCV_ISSUE_CTRL_CD(no);
									}
									issueStruct.setRCV_ISSUE_AFTER_QTY(issueStruct.getRCV_ISSUE_QTY());
									entity.mInsertRecvIssue.create(conn, issueStruct);
		
									// ���b�g�ʕi�ڍ݌ɍX�V
									BizCommon bc = new BizCommon(conn, tempStruct.getUSER_CD(), tempStruct.getPRG_NM(), tempStruct.getPLANT_CD());
									List updateLotStockList = bc.excUpdateLotStockFd(no, "");
									// �ُ�I���̏ꍇ
									if (bc.getResultStatus().intValue() == 3) {
										// �G���[���b�Z�[�W�擾
										if (updateLotStockList != null&& updateLotStockList.size() > 0) {
											errCode = (String) updateLotStockList.get(0);
											writeLogFiles(ERROR, errCode);
										}
										updFlg = 9;
										setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
										continue loop;
									}
									
									// ��Ǝ��ѕi�ڂ̃��b�g�Ǘ��t���O = 1(���b�g�g���[�X�Ǘ����s���B)�̏ꍇ
									if ("1".equals(headerStruct.getLOT_CTRL_FLG())) {
										// �e�i�ڂ̎��ѓ��͍ς݂̏ꍇ
										if (!headerLotList.isEmpty()) {
											for (int k = 0; k < headerLotList.size(); k++) {
												AD0040010Struct headerLotStruct = (AD0040010Struct) headerLotList.get(k);					
												// �e�i�ڂ̍݌Ƀ��b�g�ԍ����w�肳��Ă���ꍇ
												if (!isNull(headerLotStruct.getLOT_NO())) {
													// ���b�g�g���[�X�o�^�E�X�V����
													List lotTraceList = bc.excMakeLotTraceFd(issueStruct.getITEM_CD(),
															issueStruct.getLOT_NO(),headerStruct.getITEM_CD(),
															headerLotStruct.getLOT_NO(),"2");
													if(bc.getResultStatus().intValue() == 1){
														// ���b�g�g���[�X�o�^�E�X�V�����������ꍇ�A�m���b�g�g���[�X�n�̍X�V���s��
										            	tempStruct = new AD0040010Struct();
										            	// [���b�g�g���[�X].�g���i�ڔԍ��h��[���b�g�ʎg�p����].�h�x���i�ڔԍ��h
										            	tempStruct.setFROM_ITEM_CD(issueStruct.getITEM_CD());
										            	// [���b�g�g���[�X].�g�����b�g�ԍ��h��[���b�g�ʎg�p����].�h�݌Ƀ��b�g�ԍ��h
										            	tempStruct.setFROM_LOT_NO(issueStruct.getLOT_NO());
										            	// [���b�g�g���[�X].�g��i�ڔԍ��h��[���].�h�����ԍ��h�Ō�������[�����c]�D�h�i�ڔԍ��h
										            	tempStruct.setTO_ITEM_CD(headerStruct.getITEM_CD());
										            	// [���b�g�g���[�X].�g�惍�b�g�ԍ��h��[�������].�h�݌Ƀ��b�g�ԍ��h
										            	tempStruct.setTO_LOT_NO(headerLotStruct.getLOT_NO());
										            	// [���b�g�g���[�X].�g�攭���ԍ��h=""
									            	    tempStruct.setTO_PUCH_ODR_CD("");
										            	// ���[�U�R�[�h
										            	tempStruct.setsUser_ID(getSysUserCd());
										            	//[�������]�Ŕ����ԍ����擾
										            	List formList = entity.mgetFROM_PUCH_ODR_CD.read(conn, tempStruct);
										            	if((formList != null && formList.size() > 0)){
										            		//�����ԍ����\�[�g���i�~���j�ɂ��A�P���ڂ̃��R�[�h���擾����B
										            		AD0040010Struct orderStruct = (AD0040010Struct) formList.get(0);
											            	//[���b�g�g���[�X].�g�������ԍ��h = [�������]."�����ԍ�"
											            	tempStruct.setFROM_PUCH_ODR_CD(orderStruct.getFROM_PUCH_ODR_CD());
										            	}else{
										            		tempStruct.setFROM_PUCH_ODR_CD("");
										            	}
										            	// �m���b�g�g���[�X�n�̍X�V���s��
										            	entity.mupdateT_LOT_TRACE.update(conn, tempStruct);
													}
		
													// �ُ�I���̏ꍇ
													if (bc.getResultStatus().intValue() == 3) {
														// �G���[���b�Z�[�W�擾
														if (!lotTraceList.isEmpty()) {
															errCode = (String) lotTraceList.get(0);
															writeLogFiles(ERROR, errCode);
														}
														updFlg = 9;
														setMessageHash(oprRsltTempCtlNo,updFlg,_messages.getString(errCode));
														continue loop;
													}
												}
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
								entity.mInsertRecvIssue.create(conn, issueStruct);
							}
						}
					}
			    	}

		        // ����I��
		        if(updFlg==0) {		        	
			    	conn.commit();
			    	insertCnt = insertCnt + oprRsltList.size();
			    	m_med.setOPR_RSLT_TEMP_CTL_NO(null);
			    	m_med.setRSLT_TAKE_ERR_TYP(null);
			    	m_med.setRSLT_TAKE_ERR_INFO(null);
			    	
		        } else {
		        	// �ُ�I��
		        	conn.rollback();
		        	
		        }
		        for (int i=0;i<oprRsltList.size();i++) {
		        	m_med.setOPR_RSLT_TEMP_CTL_NO(null);
				    m_med.setRSLT_TAKE_ERR_TYP(null);
				    m_med.setRSLT_TAKE_ERR_INFO(null);
		        	if(updFlg!=0) {
		        		tempMed = (medAD0080B001)oprRsltList.get(i);
			    		oprRsltTempCtlNo = tempMed.getOPR_RSLT_TEMP_CTL_NO();
			    		List getHashList = (List)tempHashMap.get(oprRsltTempCtlNo);
			    		m_med.setOPR_RSLT_TEMP_CTL_NO(oprRsltTempCtlNo);
			    		if(getHashList!=null){
			    			m_med.setRSLT_TAKE_ERR_TYP(getHashList.get(0).toString());
			    			m_med.setRSLT_TAKE_ERR_INFO(getHashList.get(1).toString());
			    		}else{
			    			m_med.setRSLT_TAKE_ERR_TYP("1");
			    			m_med.setRSLT_TAKE_ERR_INFO(_messages.getString("AD00239"));
			    		}
		        	}
		        	// ��Ǝ��шꎞ�����e�[�u���̓o�^
				    m_med.getinsertT_OPR_RSLT_TEMP_HISTORY().create();
					if(updFlg==0){
						break;
					}
		        }
		        // ��Ǝ��шꎞ�e�[�u���̍폜
				m_med.getdeleteT_OPR_RSLT_TEMP_HISTORY().delete();
				conn.commit();

		    } 

	        // �o�b�`������ɏI�������ꍇ
	        String succCommt = "(SBM0638)�Ǎ������@=�@[" + readCnt + "] "
	        				 + "�o�^�����@=�@[" + insertCnt + "] "
	        				 + "�G���[�����@=�@[" + (readCnt - insertCnt) + "]";
	        // ��Ǝ��ю捞�o�b�`�����𐳏�ɏI�����܂����B
	        writeLog(INFOMATION, "AD00218", succCommt);
    	} catch(Exception e) {    		
    		conn.rollback();
    		// ��Ǝ��ю捞�o�b�`�������ُ�I�����܂����B
    		writeLog(INFOMATION, "AD00219");
    		throw e;
    	}
    }
    
    /**
     * �i�ڂ̍H���݌ɂ̊Ǘ�����
     * @param	AD0040010Struct	 ��Ǝ���struct
     * @param	AD0040010Struct	 ��Ǝd�|struct
     * @return  int             ���s����
	 * @throws SQLException 
     * @throws FoundationException 
     * @throws BatchAppException 
     * */
    private int ItemWorkManager(AD0040010Struct tempStruct,AD0040010Struct headerStruct) throws SQLException, FoundationException, BatchAppException {
    	AD0040010Struct issueStruct = null;
    	int updFlg = 0;
    	List issueList = new ArrayList();
    	List tempList = new ArrayList();
    	Numbering collectNum = new Numbering(conn,
				CollectNumber.ISSUE_CD,
				tempStruct.getUSER_CD(),
				tempStruct.getPRG_NM(),
				tempStruct.getPLANT_CD());
    	String no = null;
    	
    		//�@�ŏI�H���̈ȊO���ǂ������f����
    		if (!"1".equals(headerStruct.geth_FINAL_PROC_FLG())) {
    			//�@�ŏI�H���̈ȊO�̏ꍇ
    			// --------------[�o�Ɏw��]�̃f�[�^���擾����----------
    			AD0040010Struct selectIssueStruct= new AD0040010Struct();
    			selectIssueStruct.setWORK_ODR_CD(headerStruct.getWORK_ODR_CD());
    			selectIssueStruct.setPARTIAL_PRD_NO(tempStruct.getPARTIAL_PRD_NO());
    			
    			issueList = entity.mSelectIssue.read(conn,selectIssueStruct);
    			// �o�Ɏw���f�[�^���J��Ԃ��B
    			for(int j = 0; j < issueList.size(); j++) {
    				issueStruct = (AD0040010Struct)issueList.get(j);
        			
    				// �擾���ꂽ���ځu�g�p���ۊǋ�v���Đݒ肷��
        			m_med.setWORK_ODR_CD(headerStruct.getWORK_ODR_CD());
        			m_med.setPROC_NO(issueStruct.getPROC_NO());
        			m_med.setWH_CD(issueStruct.getWH_CD());
    				
        			m_med.getCheckFirstWork().read();
        			m_med.getCheckFirstWork().next();
		    		// �ŏ��H�����ǂ������f����
		    		if (!m_med.getFIRST_OPR_INST_CD().equals(tempStruct.getIN_OPR_INST_CD())) {
		    			// �ŏ��H���łȂ��ꍇ
		    			m_med.setFIRST_WORK_FLG("0");
		    			
		    			// �O�H�������擾����
		    			m_med.getGetPrevWorkInfo().read();
		    			m_med.getGetPrevWorkInfo().next();
		    			
		    			// �O�H��������̏ꍇ�F�O�H���̍�Ǝ��тœo�^�����ۊǋ�R�[�h
		    			issueStruct.setWH_CD(m_med.getPREV_WH_CD());
		    		}
		    		
		    		// �ۊǋ�R�[�h��NULL�`�F�b�N
					if (isNull(issueStruct.getWH_CD())) {
						// �q�i�ڂ̎g�p���ۊǋ�R�[�h�������͂ł��B
						errCode = "AD00215";
						writeLogFiles(ERROR, errCode);
						updFlg = 9;
						break;
					}
					
					// �ۊǋ�R�[�h�`�F�b�N
					tempList = entity.mSelectChkWhCd.read(conn,issueStruct);
					if(tempList.isEmpty()){
						errCode = "AD00216";
						writeLogFiles(ERROR, errCode);
						updFlg = 9;
						break;
					}
					
					// �ۊǋ�R�[�h�̍H��R�[�h�ƍ�ƌn��ʎd�|�̍H��R�[�h�̓���`�F�b�N
					AD0040010Struct whStruct = (AD0040010Struct)tempList.get(0);
					if (whStruct.getPLANT_CD() == null || !whStruct.getPLANT_CD().equals(headerStruct.getPLANT_CD())) {
						errCode = "AD00217";
						writeLogFiles(ERROR, errCode);
						updFlg = 9;
						break;
					}
					
					String denominator = null;  // ����
					String numerator = null;  //  ���q
					String useSum = null;  // �X�V�g�p����
					String acptQty = null; // �X�V�g�p����(�Ǖi)
					String defectQty = null; // �X�V�g�p����(�s�Ǖi)
					
					// �X�V�g�p���ʂ̌v�Z
					denominator = issueStruct.geth_ISSUE_INST_UNIT_DENOMINATOR(); // ����
					numerator = issueStruct.geth_ISSUE_INST_UNIT_NUMERATOR(); // ���q
					useSum = Calculate.add(tempStruct.getACPT_QTY(), tempStruct.getDEFECT_QTY());	
					
					if("1".equals(issueStruct.getUNIT_QTY_TYP())) { //�@�����Ǘ�
						// �X�V�g�p����
						useSum = Calculate.divide(Calculate.multiply(useSum, numerator), denominator, Calculate.CEIL);
						useSum = Calculate.ceil(useSum, 0);
						
						// �X�V�g�p���ʁi�Ǖi���j
						acptQty = Calculate.divide(
								Calculate.multiply(tempStruct.getACPT_QTY(), 
										issueStruct.geth_ISSUE_INST_UNIT_NUMERATOR()),
										issueStruct.geth_ISSUE_INST_UNIT_DENOMINATOR(), 
								Calculate.CEIL);
						acptQty = Calculate.ceil(acptQty, 0);
						
						// �X�V�g�p���ʁi�s�ǐ��j
						defectQty = Calculate.divide(
								Calculate.multiply(tempStruct.getDEFECT_QTY(), 
										issueStruct.geth_ISSUE_INST_UNIT_NUMERATOR()),
										issueStruct.geth_ISSUE_INST_UNIT_DENOMINATOR(), 
								Calculate.CEIL);
						defectQty = Calculate.ceil(defectQty, 0);
					} else {
						// �X�V�g�p����
						useSum = Calculate.divide(Calculate.multiply(useSum, numerator), denominator, 4, Calculate.CEIL);
						
						// �X�V�g�p���ʁi�Ǖi���j
						acptQty = Calculate.divide(
								Calculate.multiply(tempStruct.getACPT_QTY(), 
										issueStruct.geth_ISSUE_INST_UNIT_NUMERATOR()),
										issueStruct.geth_ISSUE_INST_UNIT_DENOMINATOR(), 
										4,
										Calculate.CEIL);
						
						// �X�V�g�p���ʁi�s�ǐ��j
						defectQty = Calculate.divide(
								Calculate.multiply(tempStruct.getDEFECT_QTY(), 
										issueStruct.geth_ISSUE_INST_UNIT_NUMERATOR()),
										issueStruct.geth_ISSUE_INST_UNIT_DENOMINATOR(), 
										4,
										Calculate.CEIL);
					}
        			
					// �ޔ�p�莝���݌ɐ���������
					issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
					issueStruct.setTEMP_USE_QTY(useSum);
					m_med.setUSE_DEFECT_QTY(defectQty);
					m_med.setUSE_ACPT_QTY(acptQty);
					// �H��
					issueStruct.setPLANT_CD(headerStruct.getPLANT_CD());
					issueStruct.setUSER_CD(tempStruct.getUSER_CD());
					issueStruct.setPRG_NM(tempStruct.getPRG_NM());
					issueStruct.setWORK_ODR_CD(headerStruct.getWORK_ODR_CD());
					//�X�V�g�p���ʂ��h0�h�ꍇ�A���̏o�Ɏw���f�[�^�ɐi�ށB
					if ("0".equals(useSum)) {
						continue;
					}
					// ----------------------�H���݌ɏo�ɏ���------------------
					boolean bResult;
					// [���v��].�g���ԁh��null�ꍇ�A[�ۊǋ�ʕi�ڍ݌�]����A�f�[�^���擾����
					if (isNull(issueStruct.getJOB_ODR_CD())) {
						tempList = entity.mSelectItemStock.read(conn,issueStruct);
						if (tempList.isEmpty()) {
							// [�ۊǋ�ʕi�ڍ݌�]����A�f�[�^�𑶍݂��Ȃ�����ꍇ
							issueStruct.setSTOCK_ON_HAND_QTY(Calculate.multiply(issueStruct.getTEMP_USE_QTY(), "-1"));
							entity.mInsertItemStock.create(conn, issueStruct);
						} else {
							//�@[�ۊǋ�ʕi�ڍ݌�]����A�f�[�^�����݂���ꍇ
							AD0040010Struct itemStruct = (AD0040010Struct)tempList.get(0);
							// �X�V�O�i�ڕʎ莝�݌ɐ�
							issueStruct.setSAVE_STOCK_ON_HAND_QTY(itemStruct.getSTOCK_ON_HAND_QTY());
							// �i�ڕʎ莝�݌ɐ�
							issueStruct.setSTOCK_ON_HAND_QTY(
									Calculate.subtract(issueStruct.getSAVE_STOCK_ON_HAND_QTY(), issueStruct.getTEMP_USE_QTY()));		
							entity.mUpdateItemStock.update(conn, issueStruct);
						}
					} else {
						// [���v��].�g���ԁh��null�łȂ��ꍇ�A[�ۊǋ�ʐ��ԍ݌�]����A�f�[�^���擾����
						tempList = entity.mSelectOdrStock.read(conn,issueStruct);		
						if (tempList.isEmpty()) {
							// [�ۊǋ�ʐ��ԍ݌�]����A�f�[�^�𑶍݂��Ȃ�����ꍇ�A���Ԏd�|�݌ɓo�^
							issueStruct.setSTOCK_ON_HAND_QTY(Calculate.multiply(issueStruct.getTEMP_USE_QTY(), "-1"));
							entity.mInsertOdrStock.create(conn,issueStruct);
						} else {
							//�@[�ۊǋ�ʐ��ԍ݌�]����A�f�[�^�����݂���ꍇ�A���Ԏd�|�݌ɍX�V
							AD0040010Struct jobStruct = (AD0040010Struct)tempList.get(0);
							// �X�V�O�i�ڕʎ莝�݌ɐ�
							issueStruct.setSAVE_STOCK_ON_HAND_QTY(jobStruct.getSTOCK_ON_HAND_QTY());
							issueStruct.setJOB_ODR_DETAIL_NO(jobStruct.getJOB_ODR_DETAIL_NO());
							// �i�ڕʎ莝�݌ɐ�
							issueStruct.setSTOCK_ON_HAND_QTY(
									Calculate.subtract(issueStruct.getSAVE_STOCK_ON_HAND_QTY(), issueStruct.getTEMP_USE_QTY()));		
							entity.mUpdateOdrStock.update(conn,issueStruct);
						}
					}
					
					// ���b�g�Ǘ����s���̏ꍇ
					if ("1".equals(issueStruct.getLOT_CTRL_FLG())) {
						// �g�p���̌v�Z�������Ăяo���B
						updFlg = CalcUseQty(issueStruct,tempStruct,headerStruct,"2");
						if (updFlg != 0) {
							break;
						}
						
						// ���b�g�Ǘ����Ȃ��ꍇ
					} else {
						//---------------[�ۊǋ�ʓ��o��]�̒ǉ�(�o��)------------------
						updFlg = InsertRecvIssue(issueStruct,tempStruct,headerStruct,"2");
						if (updFlg != 0) {
							break;
						}
					}
		    		
					// ----------------------�H���݌ɓ��ɏ���------------------
		    		issueStruct.setWH_CD(tempStruct.getWH_CD());
		    		issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
					// [���v��].�g���ԁh��null�ꍇ�A[�ۊǋ�ʕi�ڍ݌�]����A�f�[�^���擾����
					if (isNull(issueStruct.getJOB_ODR_CD())) {
						tempList = entity.mSelectItemStock.read(conn,issueStruct);
						if (tempList.isEmpty()) {
							// [�ۊǋ�ʕi�ڍ݌�]����A�f�[�^�𑶍݂��Ȃ�����ꍇ
							issueStruct.setSTOCK_ON_HAND_QTY(acptQty);
							entity.mInsertItemStock.create(conn, issueStruct);
						} else {
							//�@[�ۊǋ�ʕi�ڍ݌�]����A�f�[�^�����݂���ꍇ
							AD0040010Struct itemStruct = (AD0040010Struct)tempList.get(0);
							// �X�V�O�i�ڕʎ莝�݌ɐ�
							issueStruct.setSAVE_STOCK_ON_HAND_QTY(itemStruct.getSTOCK_ON_HAND_QTY());
							// �i�ڕʎ莝�݌ɐ�
							issueStruct.setSTOCK_ON_HAND_QTY(
									Calculate.add(issueStruct.getSAVE_STOCK_ON_HAND_QTY(), acptQty));		
							entity.mUpdateItemStock.update(conn, issueStruct);
						}
					} else {
						// [���v��].�g���ԁh��null�łȂ��ꍇ�A[�ۊǋ�ʐ��ԍ݌�]����A�f�[�^���擾����
						tempList = entity.mSelectOdrStock.read(conn,issueStruct);		
						if (tempList.isEmpty()) {
							// [�ۊǋ�ʐ��ԍ݌�]����A�f�[�^�𑶍݂��Ȃ�����ꍇ�A���Ԏd�|�݌ɓo�^
							issueStruct.setSTOCK_ON_HAND_QTY(acptQty);
							entity.mInsertOdrStock.create(conn,issueStruct);
						} else {
							//�@[�ۊǋ�ʐ��ԍ݌�]����A�f�[�^�����݂���ꍇ�A���Ԏd�|�݌ɍX�V
							AD0040010Struct jobStruct = (AD0040010Struct)tempList.get(0);
							// �X�V�O�i�ڕʎ莝�݌ɐ�
							issueStruct.setSAVE_STOCK_ON_HAND_QTY(jobStruct.getSTOCK_ON_HAND_QTY());
							issueStruct.setJOB_ODR_DETAIL_NO(jobStruct.getJOB_ODR_DETAIL_NO());
							// �i�ڕʎ莝�݌ɐ�
							issueStruct.setSTOCK_ON_HAND_QTY(
									Calculate.add(issueStruct.getSAVE_STOCK_ON_HAND_QTY(), acptQty));		
							entity.mUpdateOdrStock.update(conn,issueStruct);
						}
					}
					
					// ���b�g�Ǘ����s���̏ꍇ
					if ("1".equals(issueStruct.getLOT_CTRL_FLG())) {
						// �g�p���̌v�Z�������Ăяo���B
						updFlg = CalcUseQty(issueStruct,tempStruct,headerStruct,"1");
						if (updFlg != 0) {
							break;
						}
						// ���b�g�Ǘ����Ȃ��ꍇ
					} else {
						//---------------[�ۊǋ�ʓ��o��]�̒ǉ�(����)------------------
						updFlg = InsertRecvIssue(issueStruct,tempStruct,headerStruct,"1");
						if (updFlg != 0) {
							break;
						}
					}
					// �V�X�e���p�����[�^�F�h�s�Ǎ݌ɂ��H���Ǘ�����h���h�n�m�h���A�u�s�ǐ��v�����O�ꍇ�A�s�Ǖi���ɂ��s��
					if ("1".equals(_defectManageFlg) && !"0".equals(defectQty)) {
						// ���b�g�Ǘ����s���̏ꍇ
						if ("1".equals(issueStruct.getLOT_CTRL_FLG())) {
							// �g�p���̌v�Z�������Ăяo���B
							updFlg = CalcUseQty(issueStruct,tempStruct,headerStruct,"3");
							if (updFlg != 0) {
								break;
							}
							
							// ���b�g�Ǘ����Ȃ��ꍇ
						} else {
							updFlg = InsertRecvIssue(issueStruct,tempStruct,headerStruct,"3");
							if (updFlg != 0) {
								break;
							}
							IssueProcess IProc = new IssueProcess(conn, issueStruct.getRCV_ISSUE_CTRL_CD());
							bResult= IProc.execDefectProcess();
							if (!bResult) {
								//�o�ɏ������s �T�[�o�[�G���[
								updFlg = 9;
								break;
							}
						}
					}
    			}
    		}
    		return updFlg;
    }
    /**
     * �g�p���̌v�Z��������
     * @param	AD0040010Struct	 �o�Ɏw��struct
     * @param	AD0040010Struct	 ��Ǝ���struct
     * @param	AD0040010Struct	 ��Ǝd�|struct
     * @param	int         	 �o�^�t���O
     * @return  int             ���s����
	 * @throws SQLException 
     * @throws FoundationException 
     * @throws BatchAppException 
     * */
    private int CalcUseQty(AD0040010Struct issueStruct,AD0040010Struct tempStruct,
    		AD0040010Struct headerStruct,String insertType) throws FoundationException, SQLException{
    	List tempList = new ArrayList();
    	int updFlg = 0;
    	// �o�Ɏ��і��׎擾
		List lotIssueList = entity.mT_LOT_ISSUE_INST.read(conn,issueStruct);
		if ("1".equals(insertType)) {			// ���ɂ̏ꍇ
			 lestQty = new String[lotIssueList.size()];
			 useQty = new String[lotIssueList.size()];
		}
		
		// �f�[�^���Ȃ��ꍇ
		if (lotIssueList.isEmpty()) {
			errCode = "AD20135";
			writeLogFiles(ERROR, errCode);
			updFlg = 9;
			return updFlg;
		}

		// �g�p�c���ݒ�
		BigDecimal remainQty = null;
		if ("2".equals(insertType)) {		// �o�ɂ̏ꍇ
			remainQty = new BigDecimal(issueStruct.getTEMP_USE_QTY());
		} else if ("1".equals(insertType)) {			// ���ɂ̏ꍇ
			remainQty = new BigDecimal(m_med.getUSE_ACPT_QTY());
		} else if ("3".equals(insertType)) {			// �s�Ǔ��ɂ̏ꍇ
			remainQty = new BigDecimal(m_med.getUSE_DEFECT_QTY());
		}
		for (int m = 0; m < lotIssueList.size(); m++) {
			if ("3".equals(insertType) && Calculate.compare(lestQty[m], "0") <= 0){
				continue;
			}
			AD0040010Struct lotIssueStruct = (AD0040010Struct) lotIssueList.get(m);

			// �������ĉ\���ݒ�
			BigDecimal issueQty = new BigDecimal(lotIssueStruct.getISSUE_QTY());
			BigDecimal spentQty = new BigDecimal(lotIssueStruct.getSPENT_QTY());
			BigDecimal availQty = null;

			if ("3".equals(insertType)){
				availQty = new BigDecimal(lestQty[m]);
			} else {
				availQty = issueQty.subtract(spentQty);
			}
			BigDecimal useLotQty = null;

			if ("1".equals(insertType)) {			// ���ɂ̏ꍇ
				lestQty[m] = availQty.toString();
				useQty[m] = "0";
			}
			//�g�p�c����0�ȉ��̏ꍇ���[�v�I��
			if (remainQty.doubleValue() <= 0) {
				continue;
			}	
			
			// �������ĉ\�� >= �g�p�c���̏ꍇ
			if (availQty.doubleValue() >= remainQty.doubleValue()) {
				// �g�p�c�����������Đ��ɐݒ�
				useLotQty = remainQty;
				// �������ĉ\�� < �g�p�c���̏ꍇ
			} else {
				// �ŏI�f�[�^�̏ꍇ
				if (m == lotIssueList.size() - 1) {
					// �g�p�c�����g�p���ɐݒ�
					useLotQty = remainQty;
					// �ŏI�f�[�^�łȂ��ꍇ
				} else {
					// �����\����0���傫���ꍇ
					if (availQty.doubleValue() > 0) {
						// �g�p�c�����g�p���ɐݒ�
						useLotQty = remainQty;
						// �����R�[�h�ȍ~���擾
						for (int n = m + 1; n < lotIssueList.size(); n++) {
							AD0040010Struct nextLotIssueStruct = (AD0040010Struct) lotIssueList.get(n);

							// �������ĉ\���ݒ�
							BigDecimal nextIssueQty = new BigDecimal(nextLotIssueStruct.getISSUE_QTY());
							BigDecimal nextSpentQty = new BigDecimal(nextLotIssueStruct.getSPENT_QTY());
							BigDecimal nextAvailQty = null;

							if ("3".equals(insertType)){
								nextAvailQty = new BigDecimal(lestQty[n]);
							} else {
								nextAvailQty = nextIssueQty.subtract(nextSpentQty);
							}
							// �����R�[�h�ȍ~�Ɉ����\�ȃf�[�^������ꍇ
							if (nextAvailQty.doubleValue() > 0) {
								// �������ĉ\�����g�p���ɐݒ�
								useLotQty = availQty;
								break;
							}
						}
						// �����\����0�ȉ��̏ꍇ
					} else {
						// ���̃f�[�^���擾
						continue;
					}
				}
			}

			// �g�p���������\�����傫���ꍇ
			if (useLotQty.doubleValue() > availQty.doubleValue()) {
				// ���b�Z�[�W�o��
				writeLogFiles(WORNING, "AD20136");
			}

			m_med.setUSE_LOT_NO(lotIssueStruct.getLOT_NO());
			issueStruct.setRCV_ISSUE_QTY(useLotQty.toString());
			if ("1".equals(insertType)) {			// ���ɂ̏ꍇ
				lestQty[m] = Calculate.add(issueQty.toString(), useLotQty.negate().toString());
				useQty[m] = Calculate.add(spentQty.toString(), useLotQty.toString());
			}
			
			// ���b�g�ʕi�ڍ݌Ɍ���
			tempList = entity.mT_LOT_STOCK.read(conn,issueStruct);

			// �X�V�O�̍݌ɐ��ݒ�
			if (tempList.isEmpty()) {
				issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
			} else {
				AD0040010Struct lotStruct = (AD0040010Struct) tempList.get(0);
				issueStruct.setSAVE_STOCK_ON_HAND_QTY(lotStruct.getSTOCK_ON_HAND_QTY());
			}

			// �ۊǋ�ʓ��o�ɂ̓o�^����
			if ("2".equals(insertType)) {		// �o�ɂ̏ꍇ
				updFlg = InsertRecvIssue(issueStruct,tempStruct,headerStruct,"2");
			} else if ("1".equals(insertType)) {			// ���ɂ̏ꍇ
				updFlg = InsertRecvIssue(issueStruct,tempStruct,headerStruct,"1");
			} else if ("3".equals(insertType)) {			// �s�Ǔ��ɂ̏ꍇ
				updFlg = InsertRecvIssue(issueStruct,tempStruct,headerStruct,"3");
				IssueProcess IProc = new IssueProcess(conn, issueStruct.getRCV_ISSUE_CTRL_CD());
				boolean bResult= IProc.execDefectProcess();
				if (!bResult) {
					//�o�ɏ������s �T�[�o�[�G���[
					updFlg = 9;
					break;
				}
			}
			if (updFlg != 0) {
				break;
			}

			// ���b�g�ʕi�ڍ݌ɍX�V
			BizCommon bc = new BizCommon(conn, tempStruct.getUSER_CD(), tempStruct.getPRG_NM(), tempStruct.getPLANT_CD());
			List updateLotStockList = null;
			if ("2".equals(insertType) || "1".equals(insertType)) {		// �o�Ɉ�����ɂ̏ꍇ
				updateLotStockList = bc.excUpdateLotStockFd(issueStruct.getRCV_ISSUE_CTRL_CD(), "");
				// �ُ�I���̏ꍇ
				if (bc.getResultStatus().intValue() == 3) {
					// �G���[���b�Z�[�W�擾
					if (updateLotStockList != null&& updateLotStockList.size() > 0) {
						errCode = (String) updateLotStockList.get(0);
						writeLogFiles(ERROR, errCode);
					}
					updFlg = 9;
					break;
				}
			}
			
			//�g�p�c�����Z
			remainQty = remainQty.subtract(new BigDecimal(useLotQty.toString()));
																																				
		}
    	return updFlg;
    }
    /**
     * �ۊǋ�ʓ��o�ɂ̓o�^����
     * @param	AD0040010Struct	 �o�Ɏw��struct
     * @param	AD0040010Struct	 ��Ǝ���struct
     * @param	AD0040010Struct	 ��Ǝd�|struct
     * @param	int         	 �o�^�t���O
     * @return  int             ���s����
	 * @throws SQLException 
     * @throws FoundationException 
     * @throws BatchAppException 
     * */
    private int InsertRecvIssue(AD0040010Struct issueStruct,AD0040010Struct tempStruct,
    		AD0040010Struct headerStruct,String insertType) throws FoundationException, SQLException {
    	int updFlg = 0;
    	Numbering collectNum = new Numbering(conn,
				CollectNumber.ISSUE_CD,
				tempStruct.getUSER_CD(),
				tempStruct.getPRG_NM(),
				tempStruct.getPLANT_CD());
    	String no = null;
    	
    	AD0040010Struct tempIssueStruct = new AD0040010Struct();
		// ���o�ɊǗ��ԍ��̔�
		 no = collectNum.getNo();
		if (no == null || no.length() == 0) {
			//�̔Ԍ��ʂ��Ȃ�
			errCode = "ZZ01106";
			writeLogFiles(ERROR, errCode);
			updFlg = 9;
			return updFlg;
		}
		// ���o�ɊǗ��ԍ�
		tempIssueStruct.setRCV_ISSUE_CTRL_CD(no);
		issueStruct.setRCV_ISSUE_CTRL_CD(no);
		//�i�ڔԍ�
		tempIssueStruct.setITEM_CD(issueStruct.getITEM_CD());
		//����
		tempIssueStruct.setJOB_ODR_CD(issueStruct.getJOB_ODR_CD());
		//���Ԏ}��
		tempIssueStruct.setJOB_ODR_DETAIL_NO("0");
		//�����
		tempIssueStruct.setACPT_NO("0");
		//��ƌv��ԍ�
		tempIssueStruct.setWORK_ODR_CD(headerStruct.getWORK_ODR_CD());
		//�d�|��ƃR�[�h
		tempIssueStruct.setWORK_IN_PROC_CD(headerStruct.getWORK_IN_PROC_CD());
		//�����
		tempIssueStruct.setPARTIAL_PRD_NO(tempStruct.getPARTIAL_PRD_NO());
		//��Ǝ��ђ�����
		tempIssueStruct.setOPR_RSLT_CRCT_NO("0");
		//���o�ɔN����
		tempIssueStruct.setRCV_ISSUE_DATE(tempStruct.getOPR_DATE());
		//���o�ɒ[��
		tempIssueStruct.setRCV_ISSUE_ODD_QTY("0");
		//�݌ɍX�V�敪
		tempIssueStruct.setSTOCK_UPD_TYP("2");
		//�I�[�_�f�}���h�ԍ�
		tempIssueStruct.setOD_NO(headerStruct.getOD_NO());
		//�H��R�[�h
		tempIssueStruct.setPLANT_CD(headerStruct.getPLANT_CD());
		
		tempIssueStruct.setUSER_CD(tempStruct.getUSER_CD());
		tempIssueStruct.setPRG_NM(tempStruct.getPRG_NM());
		
		// ���b�g�Ǘ����s���̏ꍇ
		if ("1".equals(issueStruct.getLOT_CTRL_FLG())) {
			//�݌Ƀ��b�g�ԍ�
			tempIssueStruct.setLOT_NO(m_med.getUSE_LOT_NO());
		} else {
			//�݌Ƀ��b�g�ԍ�
			tempIssueStruct.setLOT_NO("");
		}
		
		if ("2".equals(insertType)) {					// �o�ɂ̏ꍇ
			//���o�ɋ敪
			tempIssueStruct.setRCV_ISSUE_TYP("2");
			//�ۊǋ�R�[�h
			tempIssueStruct.setWH_CD(issueStruct.getWH_CD());
			//�o�Ɏw���ԍ�
			tempIssueStruct.seth_ISSUE_INST_CD(issueStruct.geth_ISSUE_INST_CD());
			//���o�ɑO�݌ɐ�
			tempIssueStruct.setSAVE_STOCK_ON_HAND_QTY(issueStruct.getSAVE_STOCK_ON_HAND_QTY());
			// ���b�g�Ǘ����s���̏ꍇ
			if ("1".equals(issueStruct.getLOT_CTRL_FLG())) {
				//���o�ɐ�
				tempIssueStruct.setRCV_ISSUE_QTY(Calculate.multiply(issueStruct.getRCV_ISSUE_QTY(), "-1"));
			} else {
				//���o�ɐ�
				tempIssueStruct.setRCV_ISSUE_QTY(Calculate.multiply(issueStruct.getTEMP_USE_QTY(), "-1"));
			}
			
			//���o�Ɍ�݌ɐ�
			tempIssueStruct.setRCV_ISSUE_AFTER_QTY(tempIssueStruct.getRCV_ISSUE_QTY());
			//���o�ɔ����敪
			tempIssueStruct.setRCV_ISSUE_GNR_TYP("41");
			//���o�Ɋ����t���O
			tempIssueStruct.setRCV_ISSUE_CMPLT_FLG("0");
    	} else if ("1".equals(insertType)) {			// ���ɂ̏ꍇ
    		//���o�ɋ敪
			tempIssueStruct.setRCV_ISSUE_TYP("1");
			//�ۊǋ�R�[�h
			tempIssueStruct.setWH_CD(tempStruct.getWH_CD());
			//�o�Ɏw���ԍ�
			tempIssueStruct.seth_ISSUE_INST_CD(null);
			//���o�ɑO�݌ɐ�
			tempIssueStruct.setSAVE_STOCK_ON_HAND_QTY(issueStruct.getSAVE_STOCK_ON_HAND_QTY());
			//���o�ɐ�
			// ���b�g�Ǘ����s���̏ꍇ
			if ("1".equals(issueStruct.getLOT_CTRL_FLG())) {
				//���o�ɐ�
				tempIssueStruct.setRCV_ISSUE_QTY(issueStruct.getRCV_ISSUE_QTY());
			} else {
				//���o�ɐ�
				tempIssueStruct.setRCV_ISSUE_QTY(m_med.getUSE_ACPT_QTY());
			}
			//���o�Ɍ�݌ɐ�
			tempIssueStruct.setRCV_ISSUE_AFTER_QTY(tempIssueStruct.getRCV_ISSUE_QTY());
			//���o�ɔ����敪
			tempIssueStruct.setRCV_ISSUE_GNR_TYP("61");
			//���o�Ɋ����t���O
			tempIssueStruct.setRCV_ISSUE_CMPLT_FLG(tempStruct.getc_COMPLETE());
    	} else if ("3".equals(insertType)) {			// �s�Ǔ��ɂ̏ꍇ
    		//���o�ɋ敪
			tempIssueStruct.setRCV_ISSUE_TYP("3");
			//�ۊǋ�R�[�h
			tempIssueStruct.setWH_CD(tempStruct.getWH_CD());
			//�o�Ɏw���ԍ�
			tempIssueStruct.seth_ISSUE_INST_CD(null);
			//���o�ɑO�݌ɐ�
			tempIssueStruct.setSAVE_STOCK_ON_HAND_QTY(issueStruct.getSAVE_STOCK_ON_HAND_QTY());
			//���o�ɐ�
			// ���b�g�Ǘ����s���̏ꍇ
			if ("1".equals(issueStruct.getLOT_CTRL_FLG())) {
				//���o�ɐ�
				tempIssueStruct.setRCV_ISSUE_QTY(issueStruct.getRCV_ISSUE_QTY());
			} else {
				//���o�ɐ�
				tempIssueStruct.setRCV_ISSUE_QTY(m_med.getUSE_DEFECT_QTY());
			}
			//���o�Ɍ�݌ɐ�
			tempIssueStruct.setRCV_ISSUE_AFTER_QTY(tempIssueStruct.getRCV_ISSUE_QTY());
			//���o�ɔ����敪
			tempIssueStruct.setRCV_ISSUE_GNR_TYP("61");
			//���o�Ɋ����t���O
			tempIssueStruct.setRCV_ISSUE_CMPLT_FLG(tempStruct.getc_COMPLETE());
    	}
		tempIssueStruct.setCOMPANY_CD(company_cd);
		//�ۊǋ�ʓ��o�ɓo�^
		entity.mInsertRecvIssue.create(conn, tempIssueStruct);
    	return updFlg;
    }
    
	/**
	 * �V�X�e���p�����[�^(���ԊǗ�)�擾
	 * @return 
	 * @throws SQLException 
	 */
	private void GetTimeCtrl() throws SQLException{
		// �V�X�e���p�����[�^�iTIME_CTRL�j�擾
 		PrivateConfig privateConfig = new PrivateConfig(conn);
 		String aprInvCtrl = privateConfig.getString("TIME_CTRL");
		struct.setTIME_CTRL(aprInvCtrl);
	}

	/**
	 * ��Ǝ���CSV�f�[�^�擾
     * @param	csvIntakeFrom   CSV�捞����From
     * @param	csvIntakeTo		CSV�捞����To
     * @return	oprRsltList     ��Ǝ��у��X�g
	 * @throws BatchAppException 
	 * @throws SQLException 
	 * @throws FoundationException 
	 */
	private List selectOprRsltData(String csvIntakeFrom,String csvIntakeTo) throws BatchAppException {
		 List rtnList = new ArrayList();
	     m_med.getT_OPR_RSLT_TEMP().read();
		 medAD0080B001 temp_med = null;
	     while(m_med.getT_OPR_RSLT_TEMP().next()) {
	    	 temp_med = new medAD0080B001();
	    	 temp_med.setOPR_RSLT_TEMP_CTL_NO(m_med.getOPR_RSLT_TEMP_CTL_NO());
	    	 temp_med.setOPR_INST_CD(m_med.getOPR_INST_CD());
	    	 temp_med.setITEM_CD(m_med.getITEM_CD());
	    	 temp_med.setACPT_QTY(m_med.getACPT_QTY());
	    	 temp_med.setDEFECT_QTY(m_med.getDEFECT_QTY());
	    	 temp_med.setOPR_DATE(m_med.getOPR_DATE());
	    	 temp_med.setWH_CD(m_med.getWH_CD());
	    	 temp_med.setWS_CD(m_med.getWS_CD());
	    	 temp_med.setOPR_RSLT_PERSON(m_med.getOPR_RSLT_PERSON());
	    	 temp_med.setOPR_RSLT_COMMENT(m_med.getOPR_RSLT_COMMENT());
	    	 temp_med.setOPR_TIME_UNIT_TYP(m_med.getOPR_TIME_UNIT_TYP());
	    	 temp_med.setPRE_ARRANGEMENT_TIME(m_med.getPRE_ARRANGEMENT_TIME());
	    	 temp_med.setPOST_ARRANGEMENT_TIME(m_med.getPOST_ARRANGEMENT_TIME());
	    	 temp_med.setOPR_TIME(m_med.getOPR_TIME());
	    	 temp_med.setCESSATION_TIME(m_med.getCESSATION_TIME());
	    	 temp_med.setCESSATION_CAUSE(m_med.getCESSATION_CAUSE());
	    	 temp_med.setLOT_NO(m_med.getLOT_NO());
	    	 temp_med.setVEND_LOT_NO(m_med.getVEND_LOT_NO());
	    	 temp_med.setDEFECT_CAUSE_CD1(m_med.getDEFECT_CAUSE_CD1());
	    	 temp_med.setDEFECT_QTY1(m_med.getDEFECT_QTY1());
	    	 temp_med.setDEFECT_COMMENT1(m_med.getDEFECT_COMMENT1());
	    	 temp_med.setDEFECT_CAUSE_CD2(m_med.getDEFECT_CAUSE_CD2());
	    	 temp_med.setDEFECT_QTY2(m_med.getDEFECT_QTY2());
	    	 temp_med.setDEFECT_COMMENT2(m_med.getDEFECT_COMMENT2());
	    	 temp_med.setDEFECT_CAUSE_CD3(m_med.getDEFECT_CAUSE_CD3());
	    	 temp_med.setDEFECT_QTY3(m_med.getDEFECT_QTY3());
	    	 temp_med.setDEFECT_COMMENT3(m_med.getDEFECT_COMMENT3());
	    	 temp_med.setDEFECT_CAUSE_CD4(m_med.getDEFECT_CAUSE_CD4());
	    	 temp_med.setDEFECT_QTY4(m_med.getDEFECT_QTY4());
	    	 temp_med.setDEFECT_COMMENT4(m_med.getDEFECT_COMMENT4());
	    	 temp_med.setDEFECT_CAUSE_CD5(m_med.getDEFECT_CAUSE_CD5());
	    	 temp_med.setDEFECT_QTY5(m_med.getDEFECT_QTY5());
	    	 temp_med.setDEFECT_COMMENT5(m_med.getDEFECT_COMMENT5());
	    	 temp_med.setOPR_CMPLT_FLG(m_med.getOPR_CMPLT_FLG());
	    	 temp_med.setSUM_DEFECT_QTY(m_med.getSUM_DEFECT_QTY());
	    	 temp_med.setTAKE_DATE(m_med.getTAKE_DATE());
	    	 temp_med.setCHILD_RSLTUPDATE_FLG(m_med.getCHILD_RSLTUPDATE_FLG());
	    	 rtnList.add(temp_med);
	     }
	     return rtnList;
	}
	/**
	 * ��Ǝ��уf�[�^�R�s�[
     * @param	AD0040010Struct	 ��Ǝ���struct
     * @param�@�@medAD0080B001�@�@CSV�o��med
     * @param	AD0040010Struct	 ��Ǝd�|struct
	 * @return  �Ȃ�
	 * @throws SQLException 
	 */
	private void structCopy(AD0040010Struct tempStruct, medAD0080B001 tempMed, 
			AD0040010Struct headerStruct) throws SQLException {
		tempStruct.setOPR_INST_CD(tempMed.getOPR_INST_CD());
		// �i�ڔԍ�
		if(isNull(tempMed.getITEM_CD())) {
			tempStruct.setITEM_CD(headerStruct.getITEM_CD());
		} else {
			tempStruct.setITEM_CD(tempMed.getITEM_CD());
		}
		// �Ǖi��
		if(isNull(tempMed.getACPT_QTY())) {
			tempStruct.setACPT_QTY(Calculate.subtract(headerStruct.getOPR_INST_QTY(), 
					Calculate.add(headerStruct.getSUM_ACPT_QTY(), headerStruct.getSUM_DEFECT_QTY())));
		} else {
			tempStruct.setACPT_QTY(tempMed.getACPT_QTY());
		}
		// �s�ǐ�
		if(isNull(tempMed.getDEFECT_QTY())) {
			tempStruct.setDEFECT_QTY("0");
		} else {
			tempStruct.setDEFECT_QTY(tempMed.getDEFECT_QTY());
		}		
		// ��Ɠ�
		if(isNull(tempMed.getOPR_DATE())) {
			tempStruct.setOPR_DATE(struct.geth_BUSINESS_OPR_DATE());
		} else {
			tempStruct.setOPR_DATE(tempMed.getOPR_DATE());
		}
		
		// �ۊǋ�R�[�h
//		if(isNull(tempMed.getWH_CD())) {
//			String wh_cd = ValidateWh.getDefaultOprWh(conn, tempStruct.getPLANT_CD(),tempStruct.getITEM_CD());
//			tempStruct.setWH_CD(wh_cd);
//		} else {
//			tempStruct.setWH_CD(tempMed.getWH_CD());
//		}
	   // �V�X�e���p�����[�^�F�h�H���ۊǏꏊ�̍݌ɂ��Ǘ��h���hON�h�̏ꍇ
		if ("1".equals(_processManageFlg)) {
			// �ŏI�H���̏ꍇ�A
			if ("1".equals(headerStruct.geth_FINAL_PROC_FLG())) {
				// �ۊǋ�R�[�hNULL�ꍇ
				if(isNull(tempMed.getWH_CD())) {
					String wh_cd = ValidateWh.getDefaultOprWh(conn, tempStruct.getPLANT_CD(),tempStruct.getITEM_CD());
					tempStruct.setWH_CD(wh_cd);
				} else {
					// �ۊǋ�R�[�hNULL�łȂ��ꍇ
					tempStruct.setWH_CD(tempMed.getWH_CD());
				} 
				
				// �ŏI�H���ȊO�̏ꍇ�A
			} else {
				// �ۊǋ�R�[�hNULL�ꍇ
				if(isNull(tempMed.getWH_CD())) {
					//���H���̕ۊǋ�R�[�h�Őݒ肷��
					tempStruct.setWH_CD(tempMed.getNEXT_WH_CD());
				} else {
					// �ۊǋ�R�[�hNULL�łȂ��ꍇ
					tempStruct.setWH_CD(tempMed.getWH_CD());
				} 
			}
		} else {
			// �V�X�e���p�����[�^�F�h�H���ۊǏꏊ�̍݌ɂ��Ǘ��h���hOFF�h�̏ꍇ
			if(isNull(tempMed.getWH_CD())) {
				String wh_cd = ValidateWh.getDefaultOprWh(conn, tempStruct.getPLANT_CD(),tempStruct.getITEM_CD());
				tempStruct.setWH_CD(wh_cd);
			} else {
				tempStruct.setWH_CD(tempMed.getWH_CD());
			}
		}
		
		// ��Ƌ�R�[�h
		if(isNull(tempMed.getWS_CD())) {
			tempStruct.setWS_CD(headerStruct.getWS_CD());
		} else {
			tempStruct.setWS_CD(tempMed.getWS_CD());
		}
		tempStruct.setOPR_RSLT_PERSON(tempMed.getOPR_RSLT_PERSON());
		tempStruct.setOPR_RSLT_COMMENT(tempMed.getOPR_RSLT_COMMENT());
		tempStruct.setOPR_TIME_UNIT_TYP(tempMed.getOPR_TIME_UNIT_TYP());
		tempStruct.setPRE_ARRANGEMENT_TIME(tempMed.getPRE_ARRANGEMENT_TIME());
		tempStruct.setPOST_ARRANGEMENT_TIME(tempMed.getPOST_ARRANGEMENT_TIME());
		tempStruct.setOPR_TIME(tempMed.getOPR_TIME());
		tempStruct.setCESSATION_TIME(tempMed.getCESSATION_TIME());
		tempStruct.setCESSATION_CAUSE(tempMed.getCESSATION_CAUSE());
		tempStruct.setLOT_NO(tempMed.getLOT_NO());
		tempStruct.setVEND_LOT_NO(tempMed.getVEND_LOT_NO());
	}
	/**
	 * ��Ǝ���CSV�捞�f�[�^�̃`�F�b�N
     * @param  AD0040010Struct	 ��Ǝ���struct
     * @param  AD0040010Struct	 ��Ǝ��уw�[�_struct
     * @param  medAD0080B001�@�@  CSV�o��med
	 * @return int			     0�F�G���[�����@1�F�f�[�^�`�F�b�N�G���[�@
	 * @throws SQLException
	 * @throws FoundationException 
	 * @throws ParseException 
	 * @throws BatchAppException 
	 */
	private int dataCheck(AD0040010Struct checkStruct, AD0040010Struct headerStruct, medAD0080B001 checkMed)
		throws SQLException, FoundationException, ParseException, BatchAppException{
		// �i�ڔԍ��̈�v�`�F�b�N
		if(!checkStruct.getITEM_CD().equals(headerStruct.getITEM_CD())) {
			// �i�ڔԍ�����ƌn��ʎd�|�ƈ�v���Ă��܂���B
			errCode = "AD00205";
			writeLogFiles(ERROR,errCode);
			return 1;
		}

		// ��Ɠ��̃`�F�b�N
		if(DateTool.compareYMD(checkStruct.getOPR_DATE(), struct.geth_BUSINESS_OPR_DATE()) > 0) {
			// ���t���Ɩ��^�p����薢���ł��B
			errCode = "AD30773";
			writeLogFiles(ERROR,errCode);
			return 1;
		} else if(DateTool.compareYMD(checkStruct.getOPR_DATE(), struct.geth_BUSINESS_OPR_DATE()) < 0) {
			// ��Ɠ��ɉߋ������ݒ肳��Ă��܂��B
			writeLogFiles(WORNING,"AD00206");
		}
		
		// ���ی����̒��߂��������Ă�����t�`�F�b�N
		BigDecimal ProcExecDate = null;
		// �V�X�e���p�����[�^�i���ی����敪�j�擾
 		PrivateConfig privateConfig = new PrivateConfig(conn);
 		String entityTyp = privateConfig.getString("PAST_RESULT_ENTRY_TYP");
 		if("false".equalsIgnoreCase(entityTyp)) {
 			List procExecDateList = entity.mSELECT_SYS_ACTUAL_COST_CTRL_AC.read(conn, struct);
 			if(!procExecDateList.isEmpty()) {
 				ProcExecDate = ((AD0040010Struct) procExecDateList.get(0)).getPROC_EXEC_DATE();
 			}		
 			// CSV���͍�Ɠ�
 			BigDecimal csvInput = new BigDecimal(checkStruct.getOPR_DATE().substring(0,4) + 
 					checkStruct.getOPR_DATE().substring(5,7));
 			if(csvInput.compareTo(ProcExecDate) < 0) {
 				// ���ی����̒��߂��������Ă�����t�ł͓��͂ł��܂���B
 				errCode = "AE00160";
 				writeLogFiles(ERROR,errCode);
 				return 1;
 			}
 		}
 		
 		// �ۊǋ�̑��݃`�F�b�N
 		AD0040010Struct tempStruct = null;
 		List tempList = entity.mSelectChkWhCd.read(conn,checkStruct);
 		if(tempList.isEmpty()) {
 			// �w�肳�ꂽ�ۊǋ�R�[�h�͑��݂��܂���B
 			errCode = "AD00020";
 			writeLogFiles(ERROR,errCode);
 			return 1;
 		} else {
 			tempStruct = (AD0040010Struct)tempList.get(0);
			//�ۊǋ�R�[�h�̍H��R�[�h�ƍ�ƌn��ʎd�|�̍H��R�[�h�̓���`�F�b�N
			if (tempStruct.getPLANT_CD() == null 
					|| !tempStruct.getPLANT_CD().equals(headerStruct.getPLANT_CD())) {
				errCode = "AD00021";
	 			writeLogFiles(ERROR,errCode);
	 			return 1;
			}
 		}

 		// ��Ƌ�̑��݃`�F�b�N
 		tempList = entity.mSelectChkWsCd.read(conn,checkStruct);
 		if (tempList.isEmpty()) {
 			// �Y�������Ƌ�R�[�h��������܂���B
 			errCode = "AD20029";
 			writeLogFiles(ERROR,errCode);
 			return 1;
 		} else {
 			tempStruct = (AD0040010Struct)tempList.get(0);
			//���э�Ƌ�R�[�h�̍H��R�[�h�ƍ�ƌn��ʎd�|�̍H��R�[�h�̓���`�F�b�N
			if (tempStruct.getPLANT_CD() == null 
					|| !tempStruct.getPLANT_CD().equals(headerStruct.getPLANT_CD())) {
				errCode = "AD00004";
	 			writeLogFiles(ERROR,errCode);
	 			return 1;
			}
 		}

 		// �u�Ǖi���v�{ �u�s�ǐ��v
 		String allQty = Calculate.add(checkStruct.getACPT_QTY(), checkStruct.getDEFECT_QTY());
 		//[��Ǝ��Ԃ̗݌v
 		String alltime =Calculate.add(Calculate.add(Calculate.add(checkStruct.getPRE_ARRANGEMENT_TIME()
 				              ,checkStruct.getPOST_ARRANGEMENT_TIME())
 				              ,checkStruct.getOPR_TIME())
 				              ,checkStruct.getCESSATION_TIME());
 		//  �Ǖi�݌v�{�@�s�Ǘ݌v
 		String sumQty = Calculate.add(headerStruct.getSUM_ACPT_QTY(), headerStruct.getSUM_DEFECT_QTY());
 		
 		// �u�Ǖi���v�@���@0�A���A�u�s�ǐ��v�@���@0 ���A�e��Ǝ��� ���@0 �̃`�F�b�N �@���@�u��Ɗ����t���O�v�@���@2�F0�����̏ꍇ
 		if(Calculate.compare(Calculate.add(allQty,alltime), "0") == 0 && !"2".equals(m_med.getOPR_CMPLT_FLG())) {
 			errCode = "AE00202";
 			writeLogFiles(ERROR,errCode);
 			return 1;
 		} 
 				
 		// �ۊǋ�R�[�h�̓��̓`�F�b�N
// 		if("1".equals(headerStruct.geth_FINAL_PROC_FLG()) && isNull(checkStruct.getWH_CD()) &&
// 				Calculate.compare(allQty, "0") != 0) {
// 			// �ۊǋ�R�[�h�������͂ł��B
// 			errCode = "AD20060";
// 			writeLogFiles(ERROR,errCode);
// 			return 1;
// 		}
 		if(!"1".equals(_processManageFlg) && "1".equals(headerStruct.geth_FINAL_PROC_FLG()) 
 				&& isNull(checkStruct.getWH_CD()) &&
			Calculate.compare(allQty, "0") != 0) {
			// �ۊǋ�R�[�h�������͂ł��B
			errCode = "AD20060";
			writeLogFiles(ERROR,errCode);
			return 1;
 		} else if ("1".equals(_processManageFlg) && isNull(checkStruct.getWH_CD()) 
 				&& Calculate.compare(allQty, "0") != 0) {
 			// �V�X�e���p�����[�^�F�h�H���ۊǏꏊ�̍݌ɂ��Ǘ��h���h�n�m�h ���A�u�Ǖi���v�{ �u�s�ǐ��v�� 0�A
 			// ���A�u�ۊǋ�R�[�h�v �� Null �̏ꍇ�A�ۊǋ�R�[�h�������͏ꍇ
			errCode = "AD20060";
			writeLogFiles(ERROR,errCode);
			return 1;
 		}
 		
 		// �V�X�e���p�����[�^�F�h�H���ۊǏꏊ�̍݌ɂ��Ǘ��h���h�n�m�h ���A�ŏI�H���ȊO�̏ꍇ�A[�ۊǋ�].�h�q�ɋ敪�h�� �P�F�H���ۊǏꏊ �łȂ��ꍇ
 		if("1".equals(_processManageFlg) && !"1".equals(headerStruct.geth_FINAL_PROC_FLG()) 
 				&& !"1".equals(checkMed.getWH_TYP().toString())) {
 			errCode = "AA00156";
 			writeLogFiles(ERROR,errCode);
 			return 1;
 		}
 		
 		//�V�X�e���p�����[�^�F�h�H���ۊǏꏊ�̍݌ɂ��Ǘ��h���h�n�m�h ���A�ŏI�H���ȊO�������>1�̏ꍇ�A��Ǝw���ԍ����Ƃɕۊǋ�R�[�h���s��v�̏ꍇ
 		if("1".equals(_processManageFlg) && !"1".equals(headerStruct.geth_FINAL_PROC_FLG()) 
 				&& Calculate.compare(checkStruct.getPARTIAL_PRD_NO(),"1") > 0 
 				&& Calculate.compare(checkMed.getWH_CD_COUNT(),"0") == 0) {
 			errCode = "AD00230";
 			writeLogFiles(ERROR,errCode);
 			return 1;
 		}

 		// �V�X�e���p�����[�^�F�h�H���ۊǏꏊ�̍݌ɂ��Ǘ��h���h�n�m�h ���A�ŏ��H���łȂ��A���O��H����[��Ǝ���]�ɓo�^���Ȃ��ꍇ
 		if("1".equals(_processManageFlg) && !"1".equals(checkMed.getFIRST_WORK_FLG())
 				&& isNull(checkMed.getPREV_WORK_ODR_CD())) {
 			errCode = "AD00228";
 			writeLogFiles(ERROR,errCode);
 			return 1;
 		}
 		// �V�X�e���p�����[�^�F�h�H���ۊǏꏊ�̍݌ɂ��Ǘ��h���h�n�m�h ���A
 		// [��ƌn��ʎd�|]����擾����[��ƌn��ʎd�|].�g�d�|���O��敪�h��2�F�O��̃��R�[�h������ꍇ
 		if("1".equals(_processManageFlg) && Calculate.compare(checkMed.getDATA_COUNT(),"0") > 0) {
 			errCode = "AD00229";
 			writeLogFiles(ERROR,errCode);
 			return 1;
 		}
 		
	 		
	 		// �i�Ǖi�݌v + �@�u�Ǖi���v�j �{�@(�s�Ǘ݌v + �u�s�ǐ��v) �� ��Ǝw���� �̃`�F�b�N
	 		if(Calculate.compare(Calculate.add(sumQty, allQty), headerStruct.getOPR_INST_QTY()) > 0) {
	 			// ��Ǝw�����𒴂��Ă��܂��B
	 			writeLogFiles(WORNING,"AD00208");
	 		}
	 		
	 		// �i�Ǖi�݌v + �@�u�Ǖi���v�j �{�@(�s�Ǘ݌v + �u�s�ǐ��v) �� ��Ǝw���� �̃`�F�b�N
	 		if("1".equals(checkStruct.getc_COMPLETE()) && 
	 				Calculate.compare(Calculate.add(sumQty, allQty), headerStruct.getOPR_INST_QTY()) < 0) {
	 			// ��Ǝw������������āA�������Ă��܂��B
	 			writeLogFiles(WORNING,"AD00209");
	 		}


 		// �i�ڂ������Ǘ��i�̏ꍇ�A�؉������s��
		if ("1".equals(headerStruct.getUNIT_QTY_TYP()) && 
				(Calculate.isNumeric(checkStruct.getACPT_QTY()) || Calculate.isNumeric(checkStruct.getDEFECT_QTY()))) {			
			checkStruct.setACPT_QTY(Calculate.floor(checkStruct.getACPT_QTY(), 0));
			checkStruct.setDEFECT_QTY(Calculate.floor(checkStruct.getDEFECT_QTY(), 0));
			// �����Ǘ��i�ڂ̂��ߏ����_�ȉ��͐؂�̂Ă���܂��B
			writeLogFiles(WORNING,"AD00210");
		}
		
		// �s�Ǘ��R�R�[�h01�̃`�F�b�N
		if(!isNull(checkMed.getDEFECT_CAUSE_CD1())) {
			m_med.setDEFECT_CAUSE_CD(checkMed.getDEFECT_CAUSE_CD1());
			m_med.getSYS_TYPE_VALUE().read();
			if(!m_med.getSYS_TYPE_VALUE().next()) {
				// ��ƕs�Ǘ��R�R�[�h�����݂��܂���B
				errCode = "AD00211";
	 			writeLogFiles(ERROR,errCode);
	 			return 1;
			}
		}
		
		// �s�Ǘ��R�R�[�h02�̃`�F�b�N
		if(!isNull(checkMed.getDEFECT_CAUSE_CD2())) {
			m_med.setDEFECT_CAUSE_CD(checkMed.getDEFECT_CAUSE_CD2());
			m_med.getSYS_TYPE_VALUE().read();
			if(!m_med.getSYS_TYPE_VALUE().next()) {
				// ��ƕs�Ǘ��R�R�[�h�����݂��܂���B
				errCode = "AD00211";
	 			writeLogFiles(ERROR,errCode);
	 			return 1;
			}
		}
		
		// �s�Ǘ��R�R�[�h03�̃`�F�b�N
		if(!isNull(checkMed.getDEFECT_CAUSE_CD3())) {
			m_med.setDEFECT_CAUSE_CD(checkMed.getDEFECT_CAUSE_CD3());
			m_med.getSYS_TYPE_VALUE().read();
			if(!m_med.getSYS_TYPE_VALUE().next()) {
				// ��ƕs�Ǘ��R�R�[�h�����݂��܂���B
				errCode = "AD00211";
	 			writeLogFiles(ERROR,errCode);
	 			return 1;
			}
		}
		
		// �s�Ǘ��R�R�[�h04�̃`�F�b�N
		if(!isNull(checkMed.getDEFECT_CAUSE_CD4())) {
			m_med.setDEFECT_CAUSE_CD(checkMed.getDEFECT_CAUSE_CD4());
			m_med.getSYS_TYPE_VALUE().read();
			if(!m_med.getSYS_TYPE_VALUE().next()) {
				// ��ƕs�Ǘ��R�R�[�h�����݂��܂���B
				errCode = "AD00211";
	 			writeLogFiles(ERROR,errCode);
	 			return 1;
			}
		}
		
		// �s�Ǘ��R�R�[�h05�̃`�F�b�N
		if(!isNull(checkMed.getDEFECT_CAUSE_CD5())) {
			m_med.setDEFECT_CAUSE_CD(checkMed.getDEFECT_CAUSE_CD5());
			m_med.getSYS_TYPE_VALUE().read();
			if(!m_med.getSYS_TYPE_VALUE().next()) {
				// ��ƕs�Ǘ��R�R�[�h�����݂��܂���B
				errCode = "AD00211";
	 			writeLogFiles(ERROR,errCode);
	 			return 1;
			}
		}
		
		// �s�Ǘ��R�R�[�h01��Null ���u�s�ǐ�01�v > 0 �̏ꍇ
		if(isNull(checkMed.getDEFECT_CAUSE_CD1()) && !isNull(checkMed.getDEFECT_QTY1()) && Calculate.compare(checkMed.getDEFECT_QTY1(), "0") > 0) {
			// ��ƕs�Ǘ��R�R�[�h�������͂ł��B
			errCode = "AD30009";
 			writeLogFiles(ERROR,errCode);
 			return 1;
		}
		
		// �s�Ǘ��R�R�[�h02��Null ���u�s�ǐ�02�v > 0 �̏ꍇ
		if(isNull(checkMed.getDEFECT_CAUSE_CD2()) && !isNull(checkMed.getDEFECT_QTY2()) && Calculate.compare(checkMed.getDEFECT_QTY2(), "0") > 0) {
			// ��ƕs�Ǘ��R�R�[�h�������͂ł��B
			errCode = "AD30009";
 			writeLogFiles(ERROR,errCode);
 			return 1;
		}
		
		// �s�Ǘ��R�R�[�h03��Null ���u�s�ǐ�03�v > 0 �̏ꍇ
		if(isNull(checkMed.getDEFECT_CAUSE_CD3()) && !isNull(checkMed.getDEFECT_QTY3()) && Calculate.compare(checkMed.getDEFECT_QTY3(), "0") > 0) {
			// ��ƕs�Ǘ��R�R�[�h�������͂ł��B
			errCode = "AD30009";
 			writeLogFiles(ERROR,errCode);
 			return 1;
		}
		
		// �s�Ǘ��R�R�[�h04��Null ���u�s�ǐ�04�v > 0 �̏ꍇ
		if(isNull(checkMed.getDEFECT_CAUSE_CD4()) && !isNull(checkMed.getDEFECT_QTY4()) && Calculate.compare(checkMed.getDEFECT_QTY4(), "0") > 0) {
			// ��ƕs�Ǘ��R�R�[�h�������͂ł��B
			errCode = "AD30009";
 			writeLogFiles(ERROR,errCode);
 			return 1;
		}
		
		// �s�Ǘ��R�R�[�h05��Null ���u�s�ǐ�05�v > 0 �̏ꍇ
		if(isNull(checkMed.getDEFECT_CAUSE_CD5()) && !isNull(checkMed.getDEFECT_QTY5()) && Calculate.compare(checkMed.getDEFECT_QTY5(), "0") > 0) {
			// ��ƕs�Ǘ��R�R�[�h�������͂ł��B
			errCode = "AD30009";
 			writeLogFiles(ERROR,errCode);
 			return 1;
		}
		
		// �����Ǘ��i�ڂ̏ꍇ
		if("1".equals(headerStruct.getUNIT_QTY_TYP())) {
			// �u�s�Ǘ��R�R�[�h1�v��Null ���A�u�s�ǐ�1�v = Null OR�@0
			if(!isNull(checkMed.getDEFECT_CAUSE_CD1()) &&
					(isNull(checkMed.getDEFECT_QTY1()) || Calculate.compare(checkMed.getDEFECT_QTY1(), "0")==0)) {
				// �s�Ǘ��R�̕s�ǐ��ɂ́A0���傫����������͂��Ă��������B
				errCode = "AD00102";
				writeLogFiles(ERROR,errCode);
				return 1;
			}
			// �u�s�Ǘ��R�R�[�h2�v��Null ���A�u�s�ǐ�2�v = Null OR�@0
			if(!isNull(checkMed.getDEFECT_CAUSE_CD2()) &&
					(isNull(checkMed.getDEFECT_QTY2()) || Calculate.compare(checkMed.getDEFECT_QTY2(), "0")==0)) {
				// �s�Ǘ��R�̕s�ǐ��ɂ́A0���傫����������͂��Ă��������B
				errCode = "AD00102";
				writeLogFiles(ERROR,errCode);
				return 1;
			}
			// �u�s�Ǘ��R�R�[�h3�v��Null ���A�u�s�ǐ�3�v = Null OR�@0
			if(!isNull(checkMed.getDEFECT_CAUSE_CD3()) &&
					(isNull(checkMed.getDEFECT_QTY3()) || Calculate.compare(checkMed.getDEFECT_QTY3(), "0")==0)) {
				// �s�Ǘ��R�̕s�ǐ��ɂ́A0���傫����������͂��Ă��������B
				errCode = "AD00102";
				writeLogFiles(ERROR,errCode);
				return 1;
			}
			// �u�s�Ǘ��R�R�[�h4�v��Null ���A�u�s�ǐ�4�v = Null OR�@0
			if(!isNull(checkMed.getDEFECT_CAUSE_CD4()) &&
					(isNull(checkMed.getDEFECT_QTY4()) || Calculate.compare(checkMed.getDEFECT_QTY4(), "0")==0)) {
				// �s�Ǘ��R�̕s�ǐ��ɂ́A0���傫����������͂��Ă��������B
				errCode = "AD00102";
				writeLogFiles(ERROR,errCode);
				return 1;
			}
			// �u�s�Ǘ��R�R�[�h5�v��Null ���A�u�s�ǐ�5�v = Null OR�@0
			if(!isNull(checkMed.getDEFECT_CAUSE_CD5()) &&
					(isNull(checkMed.getDEFECT_QTY5()) || Calculate.compare(checkMed.getDEFECT_QTY5(), "0")==0)) {
				// �s�Ǘ��R�̕s�ǐ��ɂ́A0���傫����������͂��Ă��������B
				errCode = "AD00102";
				writeLogFiles(ERROR,errCode);
				return 1;
			}
		}
		// �����Ǘ��i�ڂ̏ꍇ
		if("2".equals(headerStruct.getUNIT_QTY_TYP())) {
			// �u�s�Ǘ��R�R�[�h1�v��Null ���A�u�s�ǐ�1�v = Null OR�@0
			if(!isNull(checkMed.getDEFECT_CAUSE_CD1()) &&
					(isNull(checkMed.getDEFECT_QTY1()) || Calculate.compare(checkMed.getDEFECT_QTY1(), "0")==0)) {
				// �s�Ǘ��R�̕s�ǐ��ɂ́A0���傫�����l����͂��Ă��������B
				errCode = "AD00103";
				writeLogFiles(ERROR,errCode);
				return 1;
			}
			// �u�s�Ǘ��R�R�[�h2�v��Null ���A�u�s�ǐ�2�v = Null OR�@0
			if(!isNull(checkMed.getDEFECT_CAUSE_CD2()) &&
					(isNull(checkMed.getDEFECT_QTY2()) || Calculate.compare(checkMed.getDEFECT_QTY2(), "0")==0)) {
				// �s�Ǘ��R�̕s�ǐ��ɂ́A0���傫�����l����͂��Ă��������B
				errCode = "AD00103";
				writeLogFiles(ERROR,errCode);
				return 1;
			}
			// �u�s�Ǘ��R�R�[�h3�v��Null ���A�u�s�ǐ�3�v = Null OR�@0
			if(!isNull(checkMed.getDEFECT_CAUSE_CD3()) &&
					(isNull(checkMed.getDEFECT_QTY3()) || Calculate.compare(checkMed.getDEFECT_QTY3(), "0")==0)) {
				// �s�Ǘ��R�̕s�ǐ��ɂ́A0���傫�����l����͂��Ă��������B
				errCode = "AD00103";
				writeLogFiles(ERROR,errCode);
				return 1;
			}
			// �u�s�Ǘ��R�R�[�h4�v��Null ���A�u�s�ǐ�4�v = Null OR�@0
			if(!isNull(checkMed.getDEFECT_CAUSE_CD4()) &&
					(isNull(checkMed.getDEFECT_QTY4()) || Calculate.compare(checkMed.getDEFECT_QTY4(), "0")==0)) {
				// �s�Ǘ��R�̕s�ǐ��ɂ́A0���傫�����l����͂��Ă��������B
				errCode = "AD00103";
				writeLogFiles(ERROR,errCode);
				return 1;
			}
			// �u�s�Ǘ��R�R�[�h5�v��Null ���A�u�s�ǐ�5�v = Null OR�@0
			if(!isNull(checkMed.getDEFECT_CAUSE_CD5()) &&
					(isNull(checkMed.getDEFECT_QTY5()) || Calculate.compare(checkMed.getDEFECT_QTY5(), "0")==0)) {
				// �s�Ǘ��R�̕s�ǐ��ɂ́A0���傫�����l����͂��Ă��������B
				errCode = "AD00103";
				writeLogFiles(ERROR,errCode);
				return 1;
			}
		}
		
		// �u�s�ǐ�1�`5�v�̍��v�@���@�u�s�ǐ��v�@�̃`�F�b�N
		if(Calculate.compare(checkMed.getSUM_DEFECT_QTY(), checkStruct.getDEFECT_QTY()) > 0) {
			// �s�Ǘ��R�̕s�ǐ�����ƕs�ǐ��𒴂��Ă��܂��B
			errCode = "AD00118";
			writeLogFiles(ERROR,errCode);
			return 1;
		} else if(Calculate.compare(checkMed.getSUM_DEFECT_QTY(), checkStruct.getDEFECT_QTY()) < 0) {
			// �s�Ǘ��R�̕s�ǐ�����ƕs�ǐ������ł��B
			writeLogFiles(WORNING,"AD00212");
		}
		
		// �u�s�Ǘ��R�R�[�hXX�v�̏d���`�F�b�N
		HashSet set = new HashSet();
		int count = 0;
		if(!isNull(checkMed.getDEFECT_CAUSE_CD1())) {set.add(checkMed.getDEFECT_CAUSE_CD1()); count++;}
		if(!isNull(checkMed.getDEFECT_CAUSE_CD2())) {set.add(checkMed.getDEFECT_CAUSE_CD2()); count++;}
		if(!isNull(checkMed.getDEFECT_CAUSE_CD3())) {set.add(checkMed.getDEFECT_CAUSE_CD3()); count++;}
		if(!isNull(checkMed.getDEFECT_CAUSE_CD4())) {set.add(checkMed.getDEFECT_CAUSE_CD4()); count++;}
		if(!isNull(checkMed.getDEFECT_CAUSE_CD5())) {set.add(checkMed.getDEFECT_CAUSE_CD5()); count++;}
		if(set.size() < count) {
			// �s�Ǘ��R�R�[�h���d���s�B
			errCode = "AE05062";
			writeLogFiles(ERROR,errCode);
			return 1;
		}
		
		// �u��Ɠ��v�̎����`�F�b�N	
		if("false".equalsIgnoreCase(struct.getTIME_CTRL()) && 
		   !"0000".equals(checkStruct.getOPR_DATE().substring(11,15))) {
			writeLogFiles(WORNING,"AD00213");
			// �����Ǘ����Ȃ����߁A��Ɠ������͐؎̂Ă���܂��B
			checkStruct.setOPR_DATE(checkStruct.getOPR_DATE().substring(0,10));
		}
		
		// �݌Ƀ��b�g�ԍ��̓��̓`�F�b�N
		if(Calculate.compare(checkStruct.getACPT_QTY(), "0") > 0 &&
				"1".equals(headerStruct.getLOT_CTRL_FLG()) && 
				"1".equals(headerStruct.geth_FINAL_PROC_FLG()) &&
				"0".equals(headerStruct.getLOT_NUMBERING_TYP()) &&
				isNull(checkStruct.getLOT_NO())) {
			// �݌Ƀ��b�g�ԍ������͂���Ă��܂���B
			errCode = "AE20600";
			writeLogFiles(ERROR,errCode);
			return 1;
		}

		if("1".equals(headerStruct.getLOT_CTRL_FLG()) && 
				"0".equals(headerStruct.geth_FINAL_PROC_FLG()) &&
				!isNull(checkStruct.getLOT_NO())) {
			// �H���O���E�ŏI�H���ł͂���܂���B�݌Ƀ��b�g�ԍ������鎖�͂ł��܂���B
			errCode = "AE20602";
			writeLogFiles(ERROR,errCode);
			return 1;
		}
		
		if("0".equals(headerStruct.getLOT_CTRL_FLG()) && !isNull(checkStruct.getLOT_NO())) {
			// ���b�g�Ǘ��łȂ��i�ڂł��B�݌Ƀ��b�g�ԍ����̔Ԃ��鎖�͂ł��܂���B
			errCode = "AE20601";
			writeLogFiles(ERROR,errCode);
			return 1;
		}
		
		// ���ԍ݌ɐ��̃`�F�b�N
		if("1".equals(checkStruct.getc_COMPLETE()) && !isNull(headerStruct.getJOB_ODR_CD())) {
			// �����Ϗo�Ɏc�������ԍ݌Ɂi�莝�݌Ɂj�̏ꍇ
			if(!(new IssueRemain(conn)).isEnoughAlcdQty(checkStruct.getPLANT_CD(),
					checkStruct.getITEM_CD(), headerStruct.getJOB_ODR_CD(),
					AD0040Const._JOB_ODR_DETAIL_NO)){
				// �����Ԃւ̈��������s�����܂��B���������e�i���X�ŏC�����Ă��������B
				writeLogFiles(WORNING,"AD60001");
			}
		}
		return 0;
	}
	
	
	/**
	 * �H���Ǘ��i�ڂ�[�ۊǋ�ʓ��o��]�̒ǉ��i�o�Ɂj
     * @param	AD0040010Struct	 ��Ǝ���struct
     * @param	AD0040010Struct	 ��Ǝ��уw�[�_struct
     * @param	jobOdrNo		 ����
	 *
	 * @return boolean
	 * @exception Exception
	 */
	private boolean manHourRcvIssue(AD0040010Struct tempStruct, AD0040010Struct headerStruct, String jobOdrNo, String company_cd) throws Exception {
		AD0040010Struct manhourTypStruct = null;
		AD0040010Struct parentStruct = null;
		List selelctRcvIssueList = new ArrayList();
		AD0040010Struct selectRcvIssueStruct = new AD0040010Struct();
		boolean bFlg = false;

		String strPuchOdrCd = null;		// �o�^�p�����ԍ�
		String strWorkOdrCd = null;		// �o�^�p��ƌv��ԍ�
		String strWorkInProcCd = null;	// �o�^�p�d�|��ƃR�[�h
		String no = null;
		List tempList = null;
		
		List manhourTypList = entity.mSelectItem.read(conn, headerStruct);

		if (!manhourTypList.isEmpty()) {
			manhourTypStruct = (AD0040010Struct)manhourTypList.get(0);
		}

		// [�i��].�H���Ǘ��i�ڋ敪 = 1:�H���Ǘ��i�ڂ̏ꍇ
		if ("1".equals(manhourTypStruct.getMANHOUR_TYP())){
			Numbering collectNum = new Numbering(conn,
					CollectNumber.ISSUE_CD,
					tempStruct.getUSER_CD(),
					tempStruct.getPRG_NM(),
					tempStruct.getPLANT_CD());
			no = collectNum.getNo();
			if (no == null || no.length() == 0) {
				//�̔Ԍ��ʂ��Ȃ�
				errCode = "ZZ01106";
				writeLogFiles(ERROR, errCode);
				return false;
			}
			
			// �e�i�ڂ̏��H���ɏo�ɂ��邽�߂̃f�[�^�ݒ�
			List parentList = entity.mSELECT_PARENT.read(conn,headerStruct);
			if (!parentList.isEmpty()) {
				parentStruct = (AD0040010Struct)parentList.get(0);
				// �e�i�ڂ��[���i�ڂ̏ꍇ�A����ɏ�̕i�ڂ̃I�[�_�f�}���h�ԍ����擾����
				if ("8".equals(parentStruct.getPARENT_MRP_ODR_TYP())){
					parentList = new ArrayList();
					parentList = entity.mSELECT_DUMMY_PARENT.read(conn,parentStruct);
					if (!parentList.isEmpty()) {
						parentStruct = null;
						parentStruct = (AD0040010Struct)parentList.get(0);
					}
				}

				if (!parentList.isEmpty()){
					// �e�i�ڂ�����̏ꍇ
					if ("1".equals(parentStruct.getPARENT_OUTSIDE_TYP())){
						tempList = entity.mSELECT_T_WORK_IN_PROC_BY_PROC.read(conn,parentStruct);
						if (!tempList.isEmpty()){
							AD0040010Struct tWorkInProcByProcStruct = (AD0040010Struct)tempList.get(0);
							// ��ƌv��ԍ��ݒ�
							strWorkOdrCd = tWorkInProcByProcStruct.getPARENT_WORK_ODR_CD();
							// ��Ǝw���ԍ��ݒ�
							strWorkInProcCd = tWorkInProcByProcStruct.getPARENT_WORK_IN_PROC_CD();
						}
					}
					// �e�i�ڂ��O��̏ꍇ
					if ("2".equals(parentStruct.getPARENT_OUTSIDE_TYP())){
						tempList = entity.mSELECT_T_RLSD_PUCH_ODR.read(conn,parentStruct);
						if (!tempList.isEmpty()){
							AD0040010Struct tRlsdPuchOdrStruct = (AD0040010Struct)tempList.get(0);
							// �����ԍ��ݒ�
							strPuchOdrCd = tRlsdPuchOdrStruct.getPARENT_PUCH_ODR_CD();
						}
					}
				}
			}

			AD0040010Struct outIssueStruct = new AD0040010Struct();
			outIssueStruct.setPUCH_ODR_CD(strPuchOdrCd);
			outIssueStruct.setWORK_ODR_CD(strWorkOdrCd);
			outIssueStruct.setWORK_IN_PROC_CD(strWorkInProcCd);
			outIssueStruct.setRCV_ISSUE_CTRL_CD(no);
			outIssueStruct.setITEM_CD(headerStruct.getITEM_CD());
			outIssueStruct.setPLANT_CD(headerStruct.getPLANT_CD());
			outIssueStruct.setPARTIAL_PRD_NO(tempStruct.getPARTIAL_PRD_NO());
			outIssueStruct.setWH_CD(tempStruct.getWH_CD());
			outIssueStruct.setJOB_ODR_CD(jobOdrNo);
			outIssueStruct.setRCV_ISSUE_QTY(Calculate.multiply(tempStruct.getACPT_QTY(), "-1"));
			outIssueStruct.setRCV_ISSUE_DATE(tempStruct.getOPR_DATE());
			outIssueStruct.setRCV_ISSUE_GNR_TYP("21");
			outIssueStruct.setRCV_ISSUE_ODD_QTY("0.0");
			outIssueStruct.setOD_NO(headerStruct.getOD_NO());
			outIssueStruct.setVEND_LOT_NO(tempStruct.getVEND_LOT_NO());
			outIssueStruct.setLOT_NO(tempStruct.getLOT_NO());
			outIssueStruct.setUSER_CD(tempStruct.getUSER_CD());
			outIssueStruct.setPRG_NM(tempStruct.getPRG_NM());
			outIssueStruct.setRCV_ISSUE_TYP("2");
			if ("1".equals(tempStruct.getc_COMPLETE())) {
				outIssueStruct.setRCV_ISSUE_CMPLT_FLG("1");
			} else {
				outIssueStruct.setRCV_ISSUE_CMPLT_FLG("0");
			}
			outIssueStruct.setSTOCK_UPD_TYP("1");
			outIssueStruct.setOPR_RSLT_CRCT_NO("0");  
			// �ޔ�p�莝���݌ɐ���������
			outIssueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
            //��ЃR�[�h
			outIssueStruct.setCOMPANY_CD(company_cd);
			//�ۊǋ�ʓ��o��
			entity.mINSERT_RCV_ISSUE2.create(conn, outIssueStruct);

			/* �o�Ɏ������START */
			/* [T_RCV_ISSUE]�Ǎ� */
			boolean bRSLT = true;
			selelctRcvIssueList = entity.mSELECT_CHECK_T_RCV_ISSUE.read(conn,outIssueStruct);
			if (selelctRcvIssueList.isEmpty()) {
				bFlg = true;
				bRSLT = false;
			}else{
				selectRcvIssueStruct = (AD0040010Struct)selelctRcvIssueList.get(0);
			}

			/* �G���[�`�F�b�N */
			// ���o�ɋ敪��"2"(�o��)�łȂ�
			if(!"2".equals(selectRcvIssueStruct.getRCV_ISSUE_TYP())) {
				bFlg = true;
				bRSLT = false;
			}

			// ���o�ɔ����敪��"21"(�ʏ�o��)�łȂ�
			if(!bFlg
				&& selectRcvIssueStruct.getRCV_ISSUE_GNR_TYP()!=null 
				&& !selectRcvIssueStruct.getRCV_ISSUE_GNR_TYP().equals("21")){
				bFlg = true;
				bRSLT = false;
			}

			// �o�ɏ����Ăяo��
			if(!bFlg){
				IssueProcess IProc = new IssueProcess(conn,selectRcvIssueStruct.getRCV_ISSUE_CTRL_CD());
				bRSLT = IProc.execProcess();
				if( !bRSLT ){
					bFlg = true;
					bRSLT = false;
				}
			}

			// �o�Ɏ������
			// �O��o�Ɏ��т̌���
			if(!bFlg){
				// [�ۊǋ�ʓ��o��]."��Ǝ��ђ�����"��1�ȏ�̎�
				// ���o�ɂ�������ꍇ�͕K��1�ȏ�ł���
				if( selectRcvIssueStruct.getOPR_RSLT_CRCT_NO()!=null
						&& selectRcvIssueStruct.getOPR_RSLT_CRCT_NO().compareTo("1")>=0){

					selelctRcvIssueList = new ArrayList();
					selelctRcvIssueList = entity.mSELECT_T_RCV_ISSUE.read(conn,selectRcvIssueStruct);
					if (selelctRcvIssueList.isEmpty()) {
						bFlg = true;
						bRSLT = false;
					}else{
						selectRcvIssueStruct = new AD0040010Struct();
						selectRcvIssueStruct = (AD0040010Struct)selelctRcvIssueList.get(0);
					}
				}else{
					bFlg = true;
				}
			}

			if(!bFlg){
				//�ۊǋ�ʓ��o�ɂւ̒ǉ�
				BigDecimal bQty = new BigDecimal(selectRcvIssueStruct.getRCV_ISSUE_QTY());
				selectRcvIssueStruct.setRCV_ISSUE_QTY(bQty.negate().toString());

				collectNum = new Numbering(conn,
						CollectNumber.ISSUE_CD,
						tempStruct.getUSER_CD(), 
						tempStruct.getPRG_NM(),
						tempStruct.getPLANT_CD());
				no = collectNum.getNo();

				selectRcvIssueStruct.setRCV_ISSUE_CTRL_CD(no);		//�̔Ԃ��������
				selectRcvIssueStruct.setUSER_CD(tempStruct.getUSER_CD());
				selectRcvIssueStruct.setPRG_NM(tempStruct.getPRG_NM());
				if ("1".equals(tempStruct.getc_COMPLETE())) {
					selectRcvIssueStruct.setRCV_ISSUE_CMPLT_FLG("1");
				} else {
					selectRcvIssueStruct.setRCV_ISSUE_CMPLT_FLG("0");
				}
                //��ЃR�[�h
				selectRcvIssueStruct.setCOMPANY_CD(company_cd);
				entity.mINSERT_T_RCV_ISSUE.create(conn,selectRcvIssueStruct);

				// �o�Ɏ�������Ăяo��
				IssueProcess IProc = new IssueProcess(conn,selectRcvIssueStruct.getRCV_ISSUE_CTRL_CD());
				bRSLT = IProc.execProcess();
			}

			if (!bRSLT) {
				//�o�ɏ������s �T�[�o�[�G���[
				errCode = "ZZ01106";
				writeLogFiles(ERROR, errCode);
				return false;
			}
		}
		return true;
	}
	
	/**
	 * ���b�Z�[�W���Z�b�g
     * @param	strKey	 HashMap key
     * @param	intFlg	 HashMap intFlg
     * @param	errMsg	 HashMap errMsg
	 *
	 * @exception Exception
	 */	
	private void setMessageHash(String strKey,int intFlg,String errMsg){
		List hashList = new ArrayList();
		hashList.add(0, Integer.toString(intFlg));
		hashList.add(1, errMsg);
		tempHashMap.put(strKey, hashList);
	}
    //-++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	/**
	 * main�F ���[�U��`�p���\�b�h�ł�<br>
	 * <<�������L�q���Ă�������>>
	 *
	 * @return <<�������L�q���Ă�������>>
	 * @exception <<�������L�q���Ă�������>>
	 */
	public int main() throws BatchAppException
	{
		// ���b�N�����L�[
		int lockCancelKey = LOCK_FAILD;
		// DB�ڑ��擾����
		conn = m_conductor.m_transactionConn;
		// �p�����[�^�擾
		String[] args = m_med.getArgs();
        if(args.length >= 2){
           m_med.setUsername(m_med.getArgs()[1]);
        }

		try {		        
			// �����`�F�b�N
			if (!checkArgs()) {
				writeLog(ERROR, "ZZ09009");
				return BREAK;
			}
			
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
			
			/* ��Ǝ���CVS�捞�o�b�`���� */
			exeOprRsltCsvLoad(getSysUserCd(), getSysProgramId(),
					getBusinessDate(),getCsvIntakeFrom(), getCsvIntakeTo());

		} catch (SQLException e) {
			e.printStackTrace();
			throw new BatchAppException("CtrlMain", "main", e.getMessage());
		} catch (FoundationException e) {
			e.printStackTrace();
			throw new BatchAppException("CtrlMain", "main", e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			throw new BatchAppException("CtrlMain", "main", e.getMessage());
		} finally {
			try {
				// �Ɩ����b�N����
				if (!businessUnLock(lockCancelKey)) {
					writeLog(ERROR, "ZZ01004");
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

		/** �H���ۊǏꏊ�̍݌ɂ��Ǘ����� 0:�H���ۊǏꏊ�̍݌ɂ��s�Ȃ�Ȃ� 1:�H���ۊǏꏊ�̍݌ɂ��Ȃ�*/
		private String _processManageFlg = "0";
		/** �s�Ǎ݌ɂ��H���Ǘ����� 0:�s�Ǎ݌ɂ̍H���Ǘ�������s�Ȃ�Ȃ� 1:�s�Ǎ݌ɂ̍H���Ǘ�������Ȃ�*/
		private String _defectManageFlg = "0";
		private String lestQty[] = null;
		private String useQty[] = null;
		
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
		public medAD0080B001 m_med=null;

		/**
		 * �R���e�i�N���X�C���X�^���X
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medAD0080B001 med) throws BatchAppException
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
