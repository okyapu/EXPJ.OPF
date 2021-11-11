/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KV0040/src/com/nec/jp/orteus/metamorBase/KV0040/KV0040B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.KV0040.KV0040B001;

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
import com.nec.jp.orteus.expj.util.*;
import com.nec.jp.orteus.expj.csv.*;
import com.nec.jp.orteus.expj.businesslock.*;
import com.nec.jp.orteus.expj.util.Numbering;
import com.nec.jp.orteus.metamorBase.KV0040.KV0040B001.medKV0040B001;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessage;
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain �N���X
 * �t�@�C���E�N���X����
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.8 $ $Date: 2016/05/23 08:25:58 $
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
	public medKV0040B001 m_med=null;

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
	public CtrlMain(medKV0040B001 med, BatchAppConductor cdr) throws BatchAppException
	{
		// �����o�ϐ������������܂�
		m_conductor = cdr;
		m_med = med;
		m_control = new interControl(med);

		return;
	}

	//{{user_implement_code
//	 �G���[���X�g
    List errCodeList = new ArrayList();
   
    // �G���[�m�[�g
    Hashtable errNoteHash = new Hashtable();
   
	   /**
	* �G���[/�x�����b�Z�[�W���O�o�͏���
	*
	* @param String ���b�Z�[�W�R�[�h
	* @param String ���
	*/
	private void writeLogMessage(String msgCd,String if_no) throws Exception,BatchAppException{
		AlarmMessage am = new AlarmMessage(msgCd,if_no);
		CoreTools.write(am.getMessage());
	}
   /**
	* �G���[/�x�����b�Z�[�W���O�o�͏���
	*
	* @param String ���b�Z�[�W�R�[�h
	*/
	private void writeLogMessage(String msgCd) throws Exception,BatchAppException{
		ExpjMessage am = new ExpjMessage(msgCd);
		CoreTools.write(am.getMessage(CoreTools.getLocale(m_med.getUSER_CD())));
	}
	
	  /** �G���[�H��R�[�h */
    Hashtable errPlantCdHash = new Hashtable();
    
    /**
     * �G���[�m�[�g�Z�b�^�[
     * @param note �G���[�m�[�g
     */
    public void setErrNote(String note) {
     errNoteHash.put(Integer.toString(errCodeList.size() - 1), note);
    }
    
    
    
    /**
     * �G���[�H��R�[�h�Z�b�^�[
     * @param code �H��R�[�h
     */
    public void setErrPlantCd(String code) {
     errPlantCdHash.put(Integer.toString(errCodeList.size() - 1), code);
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
     */    
	 public boolean spExecute( 
          String logMode,String outputMode, String outputPath,String outputName,String userId, 
		  String businessName, String plantCd, String companyCd,String yearMonth) {
          ExpjMessage emsg = null;
		try {
				//set para
		      // �X�g�A�h�v���V�[�W���̃p�����[�^���Z�b�g����
			m_med.setpvc2LogMode(logMode);
			m_med.setpvc2OutputMode(outputMode);
			m_med.setpvc2OutputPath(outputPath);
			m_med.setpvc2OutputName(outputName);
			m_med.setpvc2UserId(userId);
			m_med.setpvc2BusinessName(businessName);
			m_med.setpvc2PlantCd(plantCd);
			m_med.setpvc2CompanyCd(companyCd);
			m_med.setpnumYearMonth(yearMonth);

			emsg = new ExpjMessage("ZZ01006", "�������cproc�c������");
			m_med.getSyslog().info(emsg, "enter spexecute");

			m_med.getSyslog().info(emsg, m_med.getpvc2UserId());
			m_med.getSyslog().info(emsg, m_med.getpvc2BusinessName());
			m_med.getSyslog().info(emsg, m_med.getpvc2PlantCd());
			m_med.getSyslog().info(emsg, m_med.getpvc2CompanyCd());
			m_med.getSyslog().info(emsg, m_med.getpnumYearMonth());

			// call proc
			m_med.getcallSQL().call();
			return true;

		} catch (Exception e) {
			errCodeList.add("ZZ09016");// �o�b�`�p�����[�^�̓ǂݍ��݂Ɏ��s���܂���
			setErrNote("(SBM0580)���[�U�R�[�h�F[ " + userId + " ] �H��R�[�h�F[ " + plantCd + " ]");
			setErrPlantCd(plantCd);
			return false;
		}
	}    
  
	/**
	 * string Format
	 */
	public String strFormat(String str){
		String fstr = str;
		if (fstr.equals("null99999")){
			fstr = "";
		}
		return fstr;
	}
	
    /**
     * ���t�t�H�[�}�b�g�`�F�b�N
     * �w�肳�ꂽ���t��"YYYYMM"�`���`�F�b�N���s���B
     * ��������������Ɛ���Ɣ��f����B
     * @param  String  strCheckDate "yyyymmdd"�`���̂�
     * @return boolean true�F����Afalse�F�ُ�
     */
    private boolean DateFormatCheck(String strCheckDate)
    {
     // ���͓��t�̃`�F�b�N
     // Calendar�^�̓��t��p��
     Calendar calDate = Calendar.getInstance();
     // "yyyy/MM/dd"�̓��t�t�H�[�}�b�g�𐶐�
     DateFormat		df = new SimpleDateFormat("yyyyMM");
     df.setLenient(false);  // ���t���߂̂����܂������Ȃ���
     boolean		bRet = true;
   
     // ���t�̑Ó����`�F�b�N
     try {
      calDate.setTime( df.parse(strCheckDate) );
     } catch (ParseException e) {
      bRet = false;
     } catch (Exception e) {
      bRet = false;
     }
     return bRet;
    }
    // ���b�N���s�����b�N�L�[
    private static final int LOCK_FAILED = -1;
	//////////////////////////////
	// �R�[�h�W�F�l���[�^�́A�ȉ��̃R�[�h�ւ̏㏑�����s���܂���

	/**
	 * CtrlMain�N���X�̕W���R���X�g���N�^
	 *
		 */
	public CtrlMain(medKV0040B001 med) throws BatchAppException
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
		/*
		 *  // todo: �����Ƀ��[�U��`�R�[�h���L�q���Ă�������
		 * 
		 */
	    ExpjMessage emsg = null;
		IDbConnection conn = null;       	// DB�R�l�N�V����
       	IDbRecordset rdset = null;      	//DB����
		BusinessLock Lock = null;     	// �Ɩ����b�N
		int lockCancelKey = 0;       	// ���b�N�����L�[
		// metamorBase�Ɩ����b�Z�[�W
		BusinessMessageAccessor businessMsgAcc = null;
		BusinessMessage businessMsg = null;     // metamorBase�Ɩ����b�Z�[�W
		
		// �X�g�A�h�v���V�[�W����
		String functionName = null;  
		
		// �X�g�A�h�v���V�[�W���p�����[�^
		String logMode = null;             	// ���O���[�h
		String outputMode = null;          	// �o�̓��[�h
		String outputPath = null;          	// �o�̓p�X
		String outputName = null;         	// �o�̓t�@�C����
		String userId = null;         		// ���[�UID
        String businessName = null;   		// �Ɩ����i�o�b�`����ID�j
        String plantCd = null;        		// �H��R�[�h	
        String companyCd=null;				// ��ЃR�[�h
		String procTyp = null;              // �Ɩ������敪
		String yearMonth = null;            // ������
		String batchProcessingTyp = null;   // �o�b�`�����敪


	     // �Œ�l���Z�b�g
	    functionName = "SQLSALESTRNDELETE"; 
		businessName = "KV0040B001";					// �Ɩ����i�o�b�`����ID�j�̎擾


	    emsg = new ExpjMessage("ZZ01006",  "�������@debug log�@������");
		m_med.getSyslog().info(emsg, userId);          
		String[] args = m_med.getArgs();//�����̎擾
		// �p�����[�^�m�F
		int argsLength = args.length;   // �����̌���ێ�

		for(int i=0;i<argsLength;i++)
		{
			emsg = new ExpjMessage("ZZ01006",  "(SBM0896)�������@sysBatParam["+i+"]�擾�@������");
			m_med.getSyslog().info(emsg, ""+args[i]);
		}
			
		try {
        
        // �R�l�N�V�����̎擾
		conn = m_conductor.m_transactionConn;
		Hashtable plantHash = new Hashtable();
		
		// �����̑Ó������`�F�b�N���A�ϐ��ɃZ�b�g���� 
		if (argsLength !=5) {
	        errCodeList.add("AK00006");   
	        setErrPlantCd(plantCd);
	        Exception e = new Exception();
	        emsg = new ExpjMessage("AK00006", "(SBM0897)�o�b�`���������̌`�����s���ł�");
	        m_med.getSyslog().severe(emsg, userId);
	        throw e;			
		}
		
		batchProcessingTyp=strFormat(args[0]);
		emsg = new ExpjMessage("ZZ01006",  "batchProcessingTyp=");
		m_med.getSyslog().info(emsg, ""+batchProcessingTyp);
		
		
		userId = args[1];
		emsg = new ExpjMessage("ZZ01006",  "userId=");
		m_med.getSyslog().info(emsg, ""+userId);
		
		plantCd = args[2];
		emsg = new ExpjMessage("ZZ01006",  "plantCd=");
		m_med.getSyslog().info(emsg, ""+plantCd);
		
		companyCd=args[3];
		emsg = new ExpjMessage("ZZ01006",  "companyCd=");
		m_med.getSyslog().info(emsg, ""+companyCd);
		
		yearMonth=strFormat(args[4]);
		emsg = new ExpjMessage("ZZ01006",  "yearMonth=");
		m_med.getSyslog().info(emsg, ""+yearMonth);
		
     
		// ���[�U�R�[�h��Null�̏ꍇ
		if (userId == null || "null".equals(userId)) {
	        errCodeList.add("ZZ09003");   
	        setErrPlantCd(plantCd);
	        Exception e = new Exception();
	        emsg = new ExpjMessage("ZZ09003", "(SBM0898)���[�U�R�[�h�̃p�����[�^�������͂ł�");
	        m_med.getSyslog().severe(emsg, userId);
	        throw e;			
		}		
		
		// ���[�U�R�[�h�� [���[�U�}�X�^] �ɑ��݂��Ȃ��ꍇ
		m_med.setUSER_CD(userId);

		AbstractBatchAppEntity selectUserCd = m_med.getselectUSER_MST();
		try {
			selectUserCd.read();
		} catch (Exception e) {
			errCodeList.add("ZZ01106");// �T�[�o�ŃG���[���������܂����B
			setErrNote("(SBM0619)���[�U�R�[�h�F[ " + userId + " ]");
			setErrPlantCd(plantCd);
			emsg = new ExpjMessage("ZZ01006", 
					"(SBM0927)���[�U�R�[�h�̓Ǎ��݂Ɏ��s���܂����B");
			m_med.getSyslog().severe(emsg, userId);
			throw e;
		}

		if (!selectUserCd.next()) {
			Exception e = new Exception();
			emsg = new ExpjMessage("ZZ09026", "(SBM1250)���[�U�R�[�h�����[�U�}�X�^�ɑ��݂��܂���");
			m_med.getSyslog().severe(emsg, userId);
			throw e;
		}
		
		// ��ЃR�[�h��Null�̏ꍇ
		if ( companyCd == null || "null".equals(userId)) {
	        errCodeList.add("BZ20001");   
	        setErrPlantCd(plantCd);
	        Exception e = new Exception();
	        emsg = new ExpjMessage("BZ20001", "(SBM1251)��ЃR�[�h�̃p�����[�^�������͂ł�");
	        m_med.getSyslog().severe(emsg, userId);
	        throw e;			
		}	
			

        // �폜�N�Z�N�������t�t�H�[�}�b�g�`�F�b�N
        if (!DateFormatCheck(yearMonth)) {
				// �p�����[�^�������͂܂��͕s���ł��B
				errCodeList.add("AK00022");
				setErrPlantCd(plantCd);
				Exception e = new Exception();
				emsg = new ExpjMessage("AK00022", "(SBM1252)�폜�����Ώی��̌`�����s���ł��B");
				m_med.getSyslog().severe(emsg, userId);
				throw e;
		}
	
	 	// �Ɩ����b�Z�[�W�̏����i�������n���Ă���O�p�j
      
        businessMsgAcc = new BusinessMessageAccessor();
		businessMsg = new BusinessMessage();
		businessMsgAcc.init(conn);
		businessMsg.setBusinessOperatingName(businessName);
		businessMsg.setUser(userId);
		businessMsg.setPlantCode(plantCd);

		//business msg
		Numbering  numbering = new Numbering(conn, Numbering.LOG_CD, 
		        userId, businessName, plantCd);

	    emsg = new ExpjMessage("ZZ01006",  "�������@LogCode=�@������"+numbering.getNo());
		m_med.getSyslog().info(emsg, userId);   
		
		// �o�b�`�p�����[�^table����A�X�g�A�h���ʃp�����[�^��ǂݍ���
		m_med.setPROGRAM_CD(businessName);
		m_med.setFUNCTION_NAME(functionName);
		
		//logmode,outputMode,filepath,filename
		selectSYS_BAT_PARM sysBatParm = (selectSYS_BAT_PARM)m_med.getselectSYS_BAT_PARM();
		emsg = new ExpjMessage("ZZ01006",  "�������rreadSysBatParm sysBatParm�@������");
		m_med.getSyslog().info(emsg, "enter spexecute");	
		
		if(sysBatParm.read() != SUCCESS){
			errCodeList.add("AK00007"); // �o�b�`�p�����[�^�̓ǂݍ��݂Ɏ��s���܂���
			setErrNote("(SBM0580)���[�U�R�[�h�F[ " + userId + " ] �H��R�[�h�F[ " + plantCd + " ]");
			setErrPlantCd(plantCd);
			emsg = new ExpjMessage("AK00007", "(SBM0925)�o�b�`�p�����[�^�̓ǂݍ��݂Ɏ��s���܂���");
			m_med.getSyslog().severe(emsg, userId);
			throw new Exception();
		}	
		rdset = sysBatParm.getRecordset(false);
	
		if (rdset.next()){

			outputPath = rdset.getString(1);
			outputName = rdset.getString(2);
			logMode = rdset.getString(3);
			outputMode = rdset.getString(4);
			emsg = new ExpjMessage("ZZ01006",  "outputPath=");
			m_med.getSyslog().info(emsg, ""+outputPath);
			emsg = new ExpjMessage("ZZ01006",  "outputName=");
			m_med.getSyslog().info(emsg, ""+outputName);
			emsg = new ExpjMessage("ZZ01006",  "logMode=");
			m_med.getSyslog().info(emsg, ""+logMode);
			emsg = new ExpjMessage("ZZ01006",  "outputMode=");
			m_med.getSyslog().info(emsg, ""+outputMode);

		} else {
		
			errCodeList.add("AK00007"); // �o�b�`�p�����[�^�f�[�^�����݂��܂���
			setErrNote("(SBM0580)���[�U�R�[�h�F[ " + userId + " ] �H��R�[�h�F[ " + plantCd + " ]");
			setErrPlantCd(plantCd);
			Exception e = new Exception();
			emsg = new ExpjMessage("AK00008"," (SBM0576)�o�b�`�p�����[�^�f�[�^�����݂��܂���");
			m_med.getSyslog().severe(emsg, userId);
			throw e;
		}
		//=======================================
		// �Ɩ����b�N
		//=======================================
		// �Ɩ����b�N��������
		emsg = new ExpjMessage("ZZ01006", "(SBM0842)�������@�Ɩ����b�N�J�n�@������");
		m_med.getSyslog().info(emsg, userId);
		
		Lock = new BusinessLock(conn, userId, plantCd);
		lockCancelKey = Lock.doLock(businessName);  // �����L�[�̎擾
		conn.commit();
		
		// lockCancelKey==-1�̏ꍇ���Ɩ����b�N����Ă���̃G���[
		if(lockCancelKey == -1){
			emsg = new ExpjMessage("ZZ01008", "(SBM0596)�Ɩ����b�N�̊J�n�Ɏ��s���܂���");
			m_med.getSyslog().severe(emsg, userId);
			throw new Exception();
		}
	  	// SP���s
		// �o�b�`�����J�n�������s��
		errCodeList.add("ZZ09001"); // 
		setErrNote("USER_CD�F[ " + userId  + " ] PLANT_CD�F[ " + plantCd + " ]");
		setErrPlantCd(plantCd);
		emsg = new ExpjMessage("ZZ09001", "(SBM0992)�o�b�`�������J�n���܂���");
		m_med.getSyslog().severe(emsg, userId);
	
		emsg = new ExpjMessage("ZZ01006", "(SBM0892)������ SP���s�@������");
		m_med.getSyslog().info(emsg, logMode+"---"+ outputMode+"---"+ outputPath+"---"+ outputName+"---"+ 
	            		userId+"---"+ businessName+"---"+ plantCd+"---"+ 
	            		companyCd+"---"+yearMonth+"---");	
		
	     if (!spExecute(logMode, outputMode, outputPath, outputName, 
	            		userId, businessName, plantCd, companyCd,yearMonth)) {
 		
				//���ʂ�false�̏ꍇ�����b�N�������s�̃G���[

			if (!Lock.doUnLock(businessName, lockCancelKey)) {
					throw new Exception();
				}
				emsg = new ExpjMessage("ZZ01006",  "������ SPStatus�@������"+"["+getExecuteStatus()+"]");
				m_med.getSyslog().info(emsg, userId);   
				throw new Exception();    
	  	}
	
			// �o�b�`�������I�������ꍇ
			errCodeList.add("ZZ09002"); // �o�b�`�p�����[�^�̓ǂݍ��݂Ɏ��s���܂���
			setErrNote("USER_CD�F[ " + userId + " ] PLANT_CD�F[ " + plantCd
					+ " ]");
			setErrPlantCd(plantCd);
			emsg = new ExpjMessage("ZZ09002", "(SBM1005)�o�b�`�������I�����܂���");
			m_med.getSyslog().severe(emsg, userId);
			
	        }catch (Exception e) {
	        this.setExecuteStatus(1);
	        emsg = new ExpjMessage("ZZ01006", "(SBM1255)���̑��@Exception �F"+"["+e.getMessage()+"]");
			m_med.getSyslog().severe(emsg, userId);
	        e.printStackTrace();	
			try {
				conn.rollback();
			} catch(Exception fe) {
			  	fe.printStackTrace();
			  	if (errCodeList == null || errCodeList.size() == 0) {
					errCodeList.add("ZZ01006");//���̑��@�d��������
					setErrNote("(SBM0580)���[�U�R�[�h�F[ " + userId 
					 + " ] �H��R�[�h�F[ " + plantCd + " ]");
					setErrPlantCd(plantCd);
					emsg = new ExpjMessage("ZZ01006", "(SBM1363)���̑��@�d��������");
					m_med.getSyslog().severe(emsg, userId);
				}
			}
		} finally {
			if (rdset != null ) {
			    try {
			        rdset.close();	   //DB���ʉ��
					emsg = new ExpjMessage("ZZ01006",  "(SBM1257)�������@DB���ʉ���@������ ");
					m_med.getSyslog().severe(emsg, userId);
			    } catch (Exception e ) {
			         e.printStackTrace();
			    }
			    rdset = null;
			}

			for (int i = 0; i < errCodeList.size(); i++) {
				String errCode = (String)errCodeList.get(i);
				String errNote = (String)errNoteHash.get(Integer.toString(i));
				String errPlantCd = (String)errPlantCdHash.get(Integer.toString(i));
				// �Ɩ����b�Z�[�W�̓o�^
				if (businessMsg != null) {
					try {
						 Numbering numbering_err = new Numbering(conn, Numbering.LOG_CD, 
						 userId, businessName, plantCd);
						 businessMsg.setLogCode(numbering_err.getNo());
						 businessMsg.setMessageCode(errCode);
						 businessMsg.setData(errNote);
						 businessMsgAcc.add(businessMsg);
						 emsg = new ExpjMessage("ZZ01006", 
						   "(SBM0836)�������@�Ɩ����b�Z�[�W�̓o�^�@������ <" + (i + 1) 
						   + "/" + errCodeList.size() + ">");
						 m_med.getSyslog().severe(emsg, userId);
						 emsg = new ExpjMessage("ZZ01006", 
						   "�@�@��No:" + businessMsg.getLogCode() + " errCode:" + errCode 
						   + " errNote:" + errNote + " businessMsg:" + businessMsg);
						 m_med.getSyslog().severe(emsg, userId);
					
					} catch (Exception ex) {
					 ex.printStackTrace();
					}
				}	
			}
			
		      try {
				 //�Ɩ����b�N����

				if(!Lock.doUnLock(businessName, lockCancelKey)) {
					throw new Exception();
				}
				emsg = new ExpjMessage("ZZ01006", "(SBM0658)�Ɩ����b�N����");
				m_med.getSyslog().severe(emsg, userId);
				conn.commit();
				
			} catch (Exception e) {
				e.printStackTrace();
				emsg = new ExpjMessage("ZZ01006", "(SBM0846)�Ɩ����b�N�̉����Ɏ��s���܂����B"+e.getMessage());
				m_med.getSyslog().severe(emsg, userId);
				
				try {
					// �Ɩ����b�Z�[�W�̓o�^�i�Ɩ����b�N�������s���j
					Numbering numbering_l = new Numbering(conn, Numbering.LOG_CD, 
					userId, businessName, plantCd);
					businessMsg.setLogCode(numbering_l.getNo());
					businessMsg.setMessageCode("ZZ01004");
					businessMsg.setData("(SBM0658)�Ɩ����b�N����");
					businessMsgAcc.add(businessMsg);
					emsg = new ExpjMessage("ZZ01006", "(SBM1345)�������@�Ɩ����b�Z�[�W�̓o�^�@������");
					m_med.getSyslog().severe(emsg, userId);
					emsg = new ExpjMessage("ZZ01006", "�@�@��No:" + businessMsg.getLogCode() 
					  + " errCode:ZZ01004"  + " businessMsg:" + businessMsg);
					m_med.getSyslog().severe(emsg, userId);
				
				} catch (SQLException ex) {
					ex.printStackTrace();
				
				} catch (Exception ex) {
					ex.printStackTrace();
					
				}
			}
		    if (this.getExecuteStatus()!=0){
		    	emsg = new ExpjMessage("ZZ01006",  "(SBM1258)������ �o�b�`�����@���s���܂��@������");
				m_med.getSyslog().info(emsg, userId);   			
				throw new BatchAppException("CtrlMain", "CtrlMain", "(SBM1258)�o�b�`�����@���s���܂�");
		    }
	  	}
	  	try{
	  		this.writeLogMessage("ZZ09002");  
	  	}catch(Exception e){
	  		e.printStackTrace();
	  	}

		return BREAK;
	}

	// ////////////////////////////

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
		public medKV0040B001 m_med=null;

		/**
		 * �R���e�i�N���X�C���X�^���X
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medKV0040B001 med) throws BatchAppException
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
