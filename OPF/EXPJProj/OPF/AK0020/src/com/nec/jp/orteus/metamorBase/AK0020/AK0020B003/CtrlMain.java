/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AK0020/src/com/nec/jp/orteus/metamorBase/AK0020/AK0020B003/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.AK0020.AK0020B003;

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
import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessLock.BusinessLock;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
import com.nec.jp.orteus.metamorBase.common.util.Converter;
import com.nec.jp.orteus.metamorBase.common01.util.DateConverter;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import java.text.SimpleDateFormat;

import com.nec.jp.orteus.expj.util.PrivateConfig;
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain �N���X
 * �t�@�C���E�N���X����
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.7 $ $Date: 2016/05/23 08:27:52 $
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
	public medAK0020B003 m_med=null;

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
	public CtrlMain(medAK0020B003 med, BatchAppConductor cdr) throws BatchAppException
	{
		// �����o�ϐ������������܂�
		m_conductor = cdr;
		m_med = med;
		m_control = new interControl(med);

		return;
	}

	//{{user_implement_code
    
    /** �G���[���X�g */
    List errCodeList = new ArrayList();
    
    /** �G���[�m�[�g */
    Hashtable errNoteHash = new Hashtable();
    
    /** �G���[�H��R�[�h */
    Hashtable errPlantCdHash = new Hashtable();
    
    /**
     * �G���[�m�[�g�Z�b�^�[
     * @param note �G���[�m�[�g
     */
    public void setErrNote(String note){
     errNoteHash.put(Integer.toString(errCodeList.size() - 1), note);
    }
    
    /**
     * �G���[�H��R�[�h�Z�b�^�[
     * @param code �H��R�[�h
     */
    public void setErrPlantCd(String code){
     errPlantCdHash.put(Integer.toString(errCodeList.size() - 1), code);
    }
    
	
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
   
    /** �o�b�`�p�����[�^(����1) �o�b�`�����敪 */
    private String _sysBatchType;
    /** �o�b�`�p�����[�^(����2)�Ɩ�ID */
    private String _sysProgramId;
    /** �o�b�`�p�����[�^(����3)���[�UID */
    private String _sysUserCd;
    /** �o�b�`�p�����[�^(����4)�H��R�[�h */
    private String _sysPlantCd;
    /** �o�b�`�p�����[�^(����5)�폜������N�� */
    private String _sysProcExecDate;
    // �o�b�`�N���X���ʃG���[�����p
    private String errCode = null;		     // �o�b�`�G���[�R�[�h
    private String errMsg = null;		     // �o�b�`�G���[���b�Z�[�W
    private String errNote = "";             // �o�b�`�G���[���b�Z�[�W(���l) �K�v�ɉ����Ďg�p�B

    // metamorBase�Ɩ����b�Z�[�W�p
    private String businessErrCode = null;   // metamorBase�Ɩ����b�Z�[�W�R�[�h
	
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
     * metamorBase�Ɩ����b�Z�[�W�̏o�͂��s���B
     * metamorBase�Ɩ����b�Z�[�W�̏o�͂ɂ́A�Ɩ����A���[�U�R�[�h�A�H��R�[�h��K�v�Ƃ���
     *
     * @param conn DB�R�l�N�V����
     * @param businessName �Ɩ���
     * @param userId ���[�U�R�[�h
     * @param plantCd �H��R�[�h
     * @return �Ȃ�
     */
    protected void outBusinessMessage(IDbConnection conn,
                                      String businessName,
                                      String userId,
                                      String plantCd) throws Exception{

        // ����̋Ɩ��G���[�R�[�h���Z�b�g����Ă��Ȃ��ꍇ
        if (businessErrCode == null) {
            businessErrCode = "ZZ09009";  // �o�b�`�������J�n�ł��܂���ł����B
        }

        // �Ɩ����b�Z�[�W�̏���
        BusinessMessageAccessor businessMsgAcc = new BusinessMessageAccessor();
        BusinessMessage businessMsg = new BusinessMessage();
        businessMsgAcc.init(conn);
        businessMsg.setBusinessOperatingName(businessName);
        businessMsg.setUser(userId);
        businessMsg.setPlantCode(plantCd);
        businessMsg.setMessageCode(businessErrCode);
        businessMsg.setData(errNote);
        try {
   Numbering logCd = new Numbering(conn,Numbering.LOG_CD,userId,businessName,plantCd);
   businessMsg.setLogCode(logCd.getNo());
            businessMsgAcc.add(businessMsg);
            // �Ɩ����b�Z�[�W�́A�Ɩ��v���O�������ŃR�l�N�V�������R�~�b�g����
            // �K�v������B���v�ʌv�Z�w���́A�Ɩ��v���O�����Ńg�����U�N�V������
            // �ӎ�����K�v���Ȃ����߁A���C�������Ɠ����R�l�N�V�����ɑ΂��s�x�R�~�b�g
            // ����B
            conn.commit();
        } catch (SQLException e) {
            errCode = "AC00999"; // SQL���s���G���[�B
            throw e;
        } catch (Exception e) {
            errCode = "AC53402";  // ���̑��@�G���[�B
            throw e;
        }
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
    * �o�b�`�p�����[�^�i���ʁj��ݒ肵�܂��B
    * @return �ݒ�ɐ��������ꍇ�� true �A���s�����ꍇ�� false ��Ԃ��܂��B
    * @throws BatchAppException
    */
    private boolean setCommonParams() throws BatchAppException {
     String[] args = m_med.getArgs();

     // �o�b�`�p�����[�^�̌`�����s���ȏꍇ
     if (args.length != 4) {
     writeLogFiles(ERROR, "AK00006");
     return false;
     }

     _sysBatchType = args[0];
     _sysUserCd = args[1];
     _sysPlantCd = args[2];
     _sysProcExecDate = args[3];

     return true;
    }

    /**
    * �o�b�`�p�����[�^�i���ʁj�̃`�F�b�N���s���܂��B
    * @return ����̏ꍇtrue�A�s���̏ꍇfalse
    * @throws BatchAppException
     * @throws ParseException 
    */
    private boolean checkCommonParams() throws BatchAppException {
     // �o�b�`�����敪��Null�̏ꍇ
     if (isNull(_sysBatchType)) {
     	writeLogFiles(ERROR, "ZZ09023");
     	return false;
     }

     // �o�b�`�����敪���P�A�Q�ȊO�̏ꍇ
     if ((!_sysBatchType.equals("1") && !_sysBatchType.equals("2"))) {
     	writeLogFiles(ERROR, "ZZ09024");
     	return false;
     }

		
     // ���[�U�[�R�[�h��Null�̏ꍇ
     if (isNull(_sysUserCd)) {
     	writeLogFiles(ERROR, "ZZ09025");
     	return false;
     }

     // [���[�U�}�X�^]�ɑ��݂��Ȃ��ꍇ
     if (!isExsistsUserMst(_sysUserCd)) {
     	writeLogFiles(ERROR, "ZZ09026");
     	return false;
     }

     // �H��R�[�h��Null�̏ꍇ
     if (isNull(_sysPlantCd)) {
     	writeLogFiles(ERROR, "ZZ09027");
     	return false;
     }
     // [�H��]�ɑ��݂��Ȃ��ꍇ
     if (!isExistsMPlant(_sysPlantCd)) {
     	writeLogFiles(ERROR, "ZZ09028");
     	return false;
     }
     	
/*     // �폜������N����Null�̏ꍇ
     if (isNull(_sysProcExecDate)) {    	 
         writeLogFiles(ERROR, "ZZ09029");
         return false;
     }
     // �폜������N�� ���t�`���`�F�b�N
     String deleteDate = _sysProcExecDate + "/01";
     DateConverter dateConv = new DateConverter();
     java.util.Date dateWork = dateConv.str2date(deleteDate);
     if(dateWork == null){
         writeLogFiles(ERROR, "AK00022");
         return false;
     }*/

     
     // �폜������N�� ���t�̃`�F�b�N
     // Calendar�^�̓��t��p��
     Calendar calscreenMonthlyDate = Calendar.getInstance();
     Calendar calselectMonthlyDate = Calendar.getInstance(); 
     try {
      //�폜�����Ώۓ��`���`�F�b�N
      calscreenMonthlyDate.setTime(Converter.strToDate(_sysProcExecDate, "yyyy/MM"));
     } catch (ParseException e) {
         writeLogFiles(ERROR, "AK00022");
         return false;
     }
    return true;
    }

    /**
    * [���[�U�}�X�^]�ɑ��݂��邩�𔻒肵�܂� �B
    * @return [���[�U�}�X�^]�ɑ��݂���ꍇ��true�A���݂��Ȃ��ꍇ��false
     * @throws BatchAppException 
    */
    private boolean isExsistsUserMst(String userCd) throws BatchAppException {
    	m_med.setUSER_CD(userCd);
    	m_med.getselectUSER_MST().read();
    	return m_med.getselectUSER_MST().hasRecord(false);
    }

    /**
    * [�H��]�ɑ��݂��邩�𔻒肵�܂� �B
    * @param plantCd �H��R�[�h
    * @return [�H��]�ɑ��݂���ꍇ��true�A���݂��Ȃ��ꍇ��false
    */
    private boolean isExistsMPlant(String plantCd) throws BatchAppException {
    	m_med.setPLANT_CD(plantCd);
    	m_med.getselectM_PLANT();
    	return m_med.getselectM_PLANT().hasRecord(false);
    }
    
    /**
     * �X�g�A�h�v���V�[�W�����s
     * @param logMode ���O���[�h
     * @param outputMode �o�̓��[�h
     * @param outputPath �o�̓t�@�C���p�X
     * @param outputName �o�̓t�@�C����
     * @param userId ���[�UID
     * @param businessName �Ɩ���
     * @param plantCd �H��R�[�h
     * @param finalMonthlyDate �폜�����Ώ۔N��
     * @return boolean true ����I�� : false �ُ�I��
     */
    public boolean spExecute(String logMode, String outputMode, String outputPath, 
      String outputName, String userId, String businessName, 
      String plantCd, String finalMonthlyDate) {
     try {
      // �X�g�A�h�v���V�[�W���̃p�����[�^���Z�b�g����
      m_med.setpvc2LogMode(logMode);
      m_med.setpvc2OutputMode(outputMode);
      m_med.setpvc2OutputPath(outputPath);
      m_med.setpvc2OutputName(outputName);
      m_med.setpvc2UserId(userId);
      m_med.setpvc2BusinessName(businessName);
      m_med.setpvc2PlantCd(plantCd);
      m_med.setpvcDeleteProcExecDate(finalMonthlyDate);
   
      ExpjMessage emsg = new ExpjMessage("ZZ01006", 
        "�������X�g�A�h�v���V�[�W���̃p�����[�^�Z�b�g������");
      m_med.getSyslog().info(emsg, userId);
      emsg = new ExpjMessage("ZZ01006", "�@�@��logModeTyp = " + logMode);
      m_med.getSyslog().info(emsg, userId);
      emsg = new ExpjMessage("ZZ01006", "�@�@��outputMode = " + outputMode);
      m_med.getSyslog().info(emsg, userId);
      emsg = new ExpjMessage("ZZ01006", "�@�@��outputPath = " + outputPath);
      m_med.getSyslog().info(emsg, userId);
      emsg = new ExpjMessage("ZZ01006", "�@�@��outputName = " + outputName);
      m_med.getSyslog().info(emsg, userId);
      emsg = new ExpjMessage("ZZ01006", "�@�@��userId = " + userId);
      m_med.getSyslog().info(emsg, userId);
      emsg = new ExpjMessage("ZZ01006", "�@�@��businessName = " + businessName);
      m_med.getSyslog().info(emsg, userId);
      emsg = new ExpjMessage("ZZ01006", "�@�@��plantCd = " + plantCd);
      m_med.getSyslog().info(emsg, userId);
      emsg = new ExpjMessage("ZZ01006", "�@�@��finalMonthlyDate = " + finalMonthlyDate);
      m_med.getSyslog().info(emsg, userId);
   
      // �X�g�A�h�v���V�[�W���̎��s
      try {
       emsg = new ExpjMessage("ZZ01006", "�������@SP���s�@������");
       m_med.getSyslog().info(emsg, userId);
       m_med.getcallSqlDeleteProc().call();
      } catch (Exception e) {
       errCodeList.add("AK00009");//�X�g�A�h�v���V�[�W�����s���G���[
       StringBuffer sb = new StringBuffer();
       sb.append("(SBM0577)�X�g�A�h�v���V�[�W�������F[ ");
       sb.append(logMode + " ");
       sb.append(outputMode + " ");
       sb.append(outputPath + " ");
       sb.append(outputName + " ");
       sb.append(userId + " ");
       sb.append(businessName + " ");
       sb.append(plantCd + " ");
       sb.append(finalMonthlyDate + " ");
       sb.append(" ]");
       
       String errNote = sb.toString();
       //�G���[�m�[�g�ǉ�
       setErrNote(errNote);
       setErrPlantCd(plantCd);
       return false;
      }
     } catch (Exception e) {
      errCodeList.add("AK00007");//�o�b�`�p�����[�^�̓ǂݍ��݂Ɏ��s���܂���
      setErrNote("(SBM0580)���[�U�R�[�h�F[ " + userId + " ] �H��R�[�h�F[ " + plantCd + " ]");
      setErrPlantCd(plantCd);
      ExpjMessage emsg = new ExpjMessage("ZZ01006", 
        "�o�b�`�p�����[�^�̓ǂݍ��݂Ɏ��s���܂����B");
      m_med.getSyslog().severe(emsg, userId);
      return false;
     }
     return true;
    }
   

	//////////////////////////////
	// �R�[�h�W�F�l���[�^�́A�ȉ��̃R�[�h�ւ̏㏑�����s���܂���

	/**
	 * CtrlMain�N���X�̕W���R���X�g���N�^
	 *
		 */
	public CtrlMain(medAK0020B003 med) throws BatchAppException
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
		
        IDbConnection conn = null;	  // DB�R�l�N�V����
        BusinessLock Lock = null;     // �Ɩ����b�N
        int lockCancelKey = 0;	      // ���b�N�����L�[
        Numbering logCd = null;       //���O���ʃR�[�h�̔Ԃ̏���
       
        // metamorBase�Ɩ����b�Z�[�W
        BusinessMessageAccessor businessMsgAcc = null;
        BusinessMessage businessMsg = null;     // metamorBase�Ɩ����b�Z�[�W
        String businessErrCode = null;          // metamorBase�Ɩ����b�Z�[�W�R�[�h
       
        // Orteus�Ɩ����b�Z�[�W
        String memoText = "";         // Orteus�Ɩ����b�Z�[�W ���l
      
        // ��ԃo�b�`���}�j���A����
        //int batchProcessingTyp = 0;   // 1: ��ԃo�b�`�i�����^�]�j2: �}�j���A���i�����^�]�Ȃ��j
      
        // �X�g�A�h�v���V�[�W����
        String functionName = "SQLDELETEHISTORYBYTRIGGER";  // ���������폜����
      
        // �X�g�A�h�v���V�[�W���p�����[�^
        String logMode = null;             // ���O���[�h
        String outputMode = null;          // �o�̓��[�h
        String outputPath = null;          // �o�̓p�X
        String outputName = null;          // �o�̓t�@�C����
        /*String userId = null;              // ���[�UID
        String businessName = null;        // �Ɩ����i�o�b�`����ID�j
        String plantCd = null;             // �H��R�[�h
        String finalMonthlyDate = null;    // ��ʂ̍폜������N��*/    
        
        //------------------------------------------------------------------
		// �p�����[�^�擾
		String[] args = m_med.getArgs();
        
		// �o�b�`�p�����[�^�o��
		System.out.println("-------------------------------------------------");
		System.out.println("execute " + m_med.getProgname());
		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "]:" + args[i]);
		}
        
        // �Ɩ����i�o�b�`����ID�j�̎擾
        Class myClass = this.getClass();
        _sysProgramId = myClass.getName();
        _sysProgramId = _sysProgramId.substring(_sysProgramId.length() - 19, 
        		_sysProgramId.length() - 9);
		
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
		try{     // -- catch try0
			
			// DB�ڑ��擾����
			conn = m_conductor.m_transactionConn;
			
	        ExpjMessage emsg = new ExpjMessage();
	        
	        // �o�b�`�p�����[�^table����A�X�g�A�h���ʃp�����[�^��ǂݍ���
	        m_med.setprogramCd(_sysProgramId);
	        m_med.setfunctionName(functionName);
	        AbstractBatchAppEntity sysBatParam = m_med.getreadSysBatParm();
	        
	        try {
	         sysBatParam.read();
	        } catch (Exception e) {
	         errCodeList.add("AK00007"); // �o�b�`�p�����[�^�̓ǂݍ��݂Ɏ��s���܂���
	         setErrNote("(SBM0580)���[�U�R�[�h�F[ " + _sysUserCd + " ] �H��R�[�h�F[ " + _sysPlantCd + " ]");
	         setErrPlantCd(_sysPlantCd);
	         emsg = new ExpjMessage("ZZ01006", "�o�b�`�p�����[�^�̓ǂݍ��݂Ɏ��s���܂���");
	         m_med.getSyslog().severe(emsg, _sysUserCd);
	         throw e;
	        }			
	        
	        if (sysBatParam.next()) {	        	
	        	logMode = m_med.getlogModeTyp().toString();
	        	outputMode = m_med.getoutputModeTyp().toString();
	        	outputPath = m_med.getfilePath();
	        	outputName = m_med.getfileName();
	        } else {	 
	        	writeLogFiles(ERROR, "ZZ01006", "(SBM0576)�o�b�`�p�����[�^�f�[�^�����݂��܂���");
	            businessErrCode = "ZZ09013"; // 
	            //errCode = businessErrCode;
	            errNote = "(SBM0576)�o�b�`�p�����[�^�f�[�^�����݂��܂���";
				outBusinessMessage(conn, _sysProgramId, _sysUserCd, _sysPlantCd);
	        	Exception e = new Exception();
	        	emsg = new ExpjMessage("ZZ01006", "�o�b�`�p�����[�^�f�[�^�����݂��܂���");
	        	throw e;
	        }
           
             // �Ɩ����b�Z�[�W�̏���
             businessMsgAcc = new BusinessMessageAccessor();
             businessMsg = new BusinessMessage();
             businessMsgAcc.init(conn);
             businessMsg.setBusinessOperatingName(_sysProgramId);
             businessMsg.setUser(_sysUserCd);
             businessMsg.setPlantCode(_sysPlantCd);
             try{   // try1 --
                 // �Ɩ����b�N��������
                 try {
                  Lock = new BusinessLock(conn, _sysUserCd, _sysPlantCd);
                  lockCancelKey = Lock.doLock(_sysProgramId);  // �����L�[�̎擾
                  conn.commit();
                  if (lockCancelKey == -1) throw new Exception();
                 } catch (Exception e) {
                  businessErrCode = "ZZ01001"; // �Ɩ����b�N����Ă��邽�ߋN���ł��܂���
                  errCode = businessErrCode;
                  throw e;
                 }
                 
     	        // SP���s
     	        if (!spExecute(logMode, outputMode, outputPath, outputName, _sysUserCd, 
     	        		_sysProgramId, _sysPlantCd, _sysProcExecDate)) {
     	        	//���ʂ�false�̏ꍇ�����b�N�������s�̃G���[
     		        emsg = new ExpjMessage("ZZ01006", 
     		             "�������@�Ɩ����b�N�����@������ " + _sysPlantCd);
     		        m_med.getSyslog().info(emsg, _sysUserCd);
     		       if (!Lock.doUnLock(_sysProgramId, lockCancelKey)) {
     		            throw new FoundationException("CtrlMain", "main", "ZZ01004");
     		           
     		       }        
     	        }
    			
     	        conn.commit();
            	 
             }catch(Exception e){ // -- try1 catch
                 
                 if (errCode == null) {
                  errCode = "AC53402";  // ���̑��@�d��������
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
                  //outBusinessMessage(conn,_sysProgramId,_sysUserCd,_sysPlantCd);
                  try {
                   logCd = new Numbering(m_conductor.m_transactionConn,Numbering.LOG_CD,args[1],_sysProgramId,_sysPlantCd);
                   businessMsg.setLogCode(logCd.getNo());
                   businessMsgAcc.add(businessMsg);
                  } catch (SQLException ex) {
                   ex.printStackTrace();
                  }
                 }
                 memoText = errMsg; // ���l���b�Z�[�W
                 throw e;
            	 
             }finally{ // -- try1 finally
                 try {
                     // �Ɩ����b�N����	                 
                     Lock.doUnLock(_sysProgramId, lockCancelKey);
                     conn.commit();
                    } catch (FoundationException e) {
                     e.printStackTrace();
                     businessErrCode = "ZZ01004";  // �Ɩ����b�N�̉����Ɏ��s���܂����B
                 
                     // �Ɩ����b�Z�[�W�̓o�^�i�Ɩ����b�N�������s���j
                     businessMsg.setMessageCode(businessErrCode);
                     businessMsg.setData("");
                     try {
                      logCd = new Numbering(m_conductor.m_transactionConn,Numbering.LOG_CD,_sysUserCd,_sysProgramId,_sysPlantCd);
                      businessMsg.setLogCode(logCd.getNo());
                      businessMsgAcc.add(businessMsg);
                     } catch (SQLException ex) {
                      ex.printStackTrace();
                     }
                     AlarmMessage msg = new AlarmMessage(businessErrCode);
                     errMsg = "[" + businessErrCode + "]" + msg.getMessage();
                     memoText = errMsg; // ���l���b�Z�[�W
                 
                    }   
            	 
             }   // -- end try1
			
		}catch(Exception e){     // -- catch try0
		       
	        if (errCode == null) {
	         errCode = "AC53402";  // ���̑��@�d��������
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
		public medAK0020B003 m_med=null;

		/**
		 * �R���e�i�N���X�C���X�^���X
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medAK0020B003 med) throws BatchAppException
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
