/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AK0010/src/com/nec/jp/orteus/metamorBase/AK0010/AK0010B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.AK0010.AK0010B001;

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
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain �N���X
 * �t�@�C���E�N���X����
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.9 $ $Date: 2016/05/23 08:26:41 $
 */

//{{user_implement_dev:header
import java.util.Date;
import com.nec.jp.orteus.metamorBase.common.util.Converter;
import com.nec.jp.orteus.metamorBase.common.util.ScreenParam;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
import com.nec.jp.orteus.metamorBase.util.BusinessLock.BusinessLock;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.metamorBase.common04.DateCtrl.DateCtrl;
//import com.nec.jp.orteus.metamorBase.common.WorkDay.WorkDay;
import com.nec.jp.orteus.expj.util.*;
//import com.nec.jp.orteus.expj.util.ExpjMessage;
//}}user_implement_dev:header

public class CtrlMain extends Object
		implements IBatchAppCommon
{

	//////////////////////////////

	/**
	 * mediator�N���X �C���X�^���X
	 */
	public medAK0010B001 m_med=null;

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
	public CtrlMain(medAK0010B001 med, BatchAppConductor cdr) throws BatchAppException
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
         * �ŏI�����������s���`�F�b�N
         * @param plantCd �H��R�[�h
         * @param businessName �Ɩ���
         * @param functionName �@�\��
         * @param userId ���[�UID
         * @param dailyprocDate ���������Ώۓ�
         * @return boolean true ����I�� : false �ُ�I��
         */
        public boolean checkFinalDailyProcExecDate(String plantCd, String businessName,
          String functionName, String userId, String dailyprocDate) {
         
         String allfinalDay = null;
         try{
          ExpjMessage emsg = new ExpjMessage("ZZ01006", 
            "(SBM1006)�������ŏI�����������s���`�F�b�N������");
          m_med.getSyslog().info(emsg, userId);
          m_med.setfinalPlantCd(plantCd);
          
          // �ŏI�����������s���̎擾
          m_med.setprogramCd(businessName);
          m_med.setfunctionName(functionName);
          AbstractBatchAppEntity readFinalDailyProcExecDate
            = m_med.getreadFinalDailyProcExecDate();
          
          try {
           readFinalDailyProcExecDate.read();
          } catch (Exception e) {
           errCodeList.add("ZZ01106");// �T�[�o�ŃG���[���������܂����B
           setErrNote("(SBM0620)�H��R�[�h�F[ " + plantCd + " ]");
           setErrPlantCd(plantCd);
           emsg = new ExpjMessage("ZZ01006", "(SBM1007)�ŏI�����������s���̓Ǎ��݂Ɏ��s���܂����B");
           m_med.getSyslog().severe(emsg, userId);
           return false;
          }
          
          if (readFinalDailyProcExecDate.next()) {
           allfinalDay = m_med.getfinalDailyProcExecDate();
          } else {
           errCodeList.add("AK00005"); // �ŏI�����������s�������݂��܂���B
           setErrNote("(SBM0620)�H��R�[�h�F[ " + plantCd + " ]");
           setErrPlantCd(plantCd);
           emsg = new ExpjMessage("ZZ01006", "(SBM1008)�ŏI�����������s�������݂��܂���B");
           m_med.getSyslog().severe(emsg, userId);
           return false;
          }
          // ���t���`
          Date dateallDailyprocDate = Converter.strToDate(dailyprocDate,Converter.SLASH_DATE);
          Date dateallFinalDay = Converter.strToDate(allfinalDay,Converter.SLASH_DATE);
          
          if (dateallDailyprocDate.compareTo(dateallFinalDay) < 0){
           // ���������� Date �Ɠ����� Date �̏ꍇ�͒l 0�B
           // ���������� Date ����� Date �̏ꍇ�� 0 ��菬�����l�B
           // ���������� Date �̑O�� Date �̏ꍇ�� 0 ���傫���l
           //�u���������Ώۓ��v���m������������n."�ŏI�����������s��"�G���[
           errCodeList.add("AK33232");//�ߋ��̓��������͎��s�ł��܂���B
           setErrNote("(SBM0627)�H��R�[�h�F[ " + plantCd + " ] ���������Ώۓ��F[ " 
             + dailyprocDate + " ] �ŏI�����������s���F[ " + allfinalDay + " ]");
           setErrPlantCd(plantCd);
           emsg = new ExpjMessage("ZZ01006", 
             "(SBM1009)�u���������Ώۓ��v���m������������n.�ŏI�����������s���G���[");
           m_med.getSyslog().severe(emsg, userId);
           return false;
          } else if (dateallDailyprocDate.compareTo(dateallFinalDay) == 0) {
           //�u���������Ώۓ��v���m������������n."�ŏI�����������s��"���[�j���O
           errCodeList.add("AK00017");//�����ς̓��t�ōēx�������s���܂����B
           setErrNote("(SBM0627)�H��R�[�h�F[ " + plantCd + " ] ���������Ώۓ��F[ " 
             + dailyprocDate + " ] �ŏI�����������s���F[ " + allfinalDay + " ]");
           setErrPlantCd(plantCd);
           emsg = new ExpjMessage("ZZ01006", 
           "(SBM1010)�u���������Ώۓ��v���m������������n.�ŏI�����������s�����[�j���O");
           m_med.getSyslog().warning(emsg, userId);
          }
         } catch (Exception e) {
          errCodeList.add("ZZ01106");// �T�[�o�ŃG���[���������܂����B
          setErrNote("(SBM0627)�H��R�[�h�F[ " + plantCd + " ] ���������Ώۓ��F[ " 
            + dailyprocDate + " ] �ŏI�����������s���F[ " + allfinalDay + " ]");
          setErrPlantCd(plantCd);
          ExpjMessage emsg = new ExpjMessage("ZZ01006", 
            "(SBM1011)�ŏI�����������s���`�F�b�N�Ŏ��s���܂����B");
          m_med.getSyslog().severe(emsg, userId);
          return false;
         }
         return true;
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
         * @param dailyprocDate ���������Ώۓ�
         * @param nextBusinessOprDate ���Ɩ��^�p��
         * @return boolean true ����I�� : false �ُ�I��
         */
        public boolean spExecute(String logMode, String outputMode, String outputPath, 
          String outputName, String userId, String businessName, String plantCd, 
          String dailyprocDate, String nextBusinessOprDate) {
         
         try {
          // �X�g�A�h�v���V�[�W���̃p�����[�^���Z�b�g����
          m_med.setpvc2LogMode(logMode);
          m_med.setpvc2OutputMode(outputMode);
          m_med.setpvc2OutputPath(outputPath);
          m_med.setpvc2OutputName(outputName);
          m_med.setpvc2UserId(userId);
          m_med.setpvc2BusinessName(businessName);
          m_med.setpvc2PlantCd(plantCd);
          m_med.setpvc2FinalDailyProcExecDate(dailyprocDate);
          m_med.setpvc2BusinessOprDate(nextBusinessOprDate);
          
          ExpjMessage emsg = new ExpjMessage("ZZ01006", 
            "(SBM0891)�������X�g�A�h�v���V�[�W���̃p�����[�^�Z�b�g������");
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
          emsg = new ExpjMessage("ZZ01006", "�@�@��FinalDailyProcExecDate = " + dailyprocDate);
          m_med.getSyslog().info(emsg, userId);
          emsg = new ExpjMessage("ZZ01006", "�@�@��BusinessOprDate = " + nextBusinessOprDate);
          m_med.getSyslog().info(emsg, userId);
          
          // �X�g�A�h�v���V�[�W���̎��s
          try {
           emsg = new ExpjMessage("ZZ01006", "(SBM0892)�������@SP���s�@������");
           m_med.getSyslog().info(emsg, userId);
           m_med.getcallSqlDailyProc().call();
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
           sb.append(dailyprocDate + " ");
           sb.append(nextBusinessOprDate + " ");
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
            "(SBM0925)�o�b�`�p�����[�^�̓ǂݍ��݂Ɏ��s���܂����B");
          m_med.getSyslog().severe(emsg, userId);
          return false;
         }
         return true;
        }
        
        /**
         * CtrlMain�N���X�̕W���R���X�g���N�^
         *
         */
        public CtrlMain(medAK0010B001 med) throws BatchAppException
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
       
         // todo: �����Ƀ��[�U��`�R�[�h���L�q���Ă�������
       
       */
         IDbConnection conn = null;	  // DB�R�l�N�V����
         BusinessLock Lock = null;     // �Ɩ����b�N
         int lockCancelKey = 0;	      // ���b�N�����L�[
         
         // metamorBase�Ɩ����b�Z�[�W
         BusinessMessageAccessor businessMsgAcc = null;
         BusinessMessage businessMsg = null;     // metamorBase�Ɩ����b�Z�[�W
         
         // ��ԃo�b�`���}�j���A����
         int batchProcessingTyp = 0;   // 1: ��ԃo�b�`�i�����^�]�j2: �}�j���A���i�����^�]�Ȃ��j
         
         // �X�g�A�h�v���V�[�W����
         String functionName = "SQLDAILYPROC";  // ��������
         
         // �X�g�A�h�v���V�[�W���p�����[�^
         String logMode = null;             // ���O���[�h
         String outputMode = null;          // �o�̓��[�h
         String outputPath = null;          // �o�̓p�X
         String outputName = null;          // �o�̓t�@�C����
         String userId = null;              // ���[�UID
         String businessName = null;        // �Ɩ����i�o�b�`����ID�j
         String plantCd = null;             // �H��R�[�h
         String dailyprocDate = null;       // ���������Ώۓ�
         String nextBusinessOprDate = null; // ���Ɩ��^�p��
         
         // �Ɩ����i�o�b�`����ID�j�̎擾
         Class myClass = this.getClass();
         businessName = myClass.getName();
         businessName = businessName.substring(businessName.length() - 19, 
           businessName.length()-9);
         
         // main�����󂯎��
         String args[] = m_med.getArgs();
         
         // �p�����[�^�m�F
         int argsLength = args.length;   // �����̌���ێ�
         
         try {
          // �R�l�N�V�����̎擾
          ScreenParam sp = new ScreenParam(this.getClass());
          conn = m_conductor.m_transactionConn;
          Hashtable plantHash = new Hashtable();
          
          // �Ɩ����b�Z�[�W�̏����i�������n���Ă���O�p�j
          businessMsgAcc = new BusinessMessageAccessor();
          businessMsg = new BusinessMessage();
          businessMsgAcc.init(conn);
          businessMsg.setBusinessOperatingName(sp.getPackageName(ScreenParam.SHORT));
          businessMsg.setUser("SYSTEM");
          businessMsg.setPlantCode("##");
          
       // �����̑Ó������`�F�b�N���A�ϐ��ɃZ�b�g���� -----------------------------------------------------
          if (argsLength != 5 && argsLength != 3) {
           userId = "SYSTEM";
           businessName = sp.getPackageName(ScreenParam.SHORT);
           plantCd = "##";
           errCodeList.add("AK00006");// �o�b�`���������̌`�����s���ł�
           setErrNote("(SBM0617)�o�b�`�����������F[ " + argsLength + " ]");
           setErrPlantCd(plantCd);
           Exception e = new Exception();
           ExpjMessage emsg = emsg 
             = new ExpjMessage("ZZ01006", "(SBM0957)�o�b�`���������̐����s���ł�");
           m_med.getSyslog().severe(emsg, userId);
           throw e;
          }
          
          batchProcessingTyp = Integer.parseInt(args[0]);
          userId = args[1];
          plantCd = args[2];
          if (argsLength == 5) {
           dailyprocDate = args[3];       // ���������Ώۓ�
           nextBusinessOprDate = args[4]; // ���Ɩ��^�p��
          }
          
          ExpjMessage emsg = new ExpjMessage("ZZ01006", "(SBM0958)�������@�o�b�`�������@������");
          m_med.getSyslog().info(emsg, userId);
          emsg = new ExpjMessage("ZZ01006", "�@�@��batchProcessingTyp = " + batchProcessingTyp);
          m_med.getSyslog().info(emsg, userId);
          emsg = new ExpjMessage("ZZ01006", "�@�@��userId = " + userId);
          m_med.getSyslog().info(emsg, userId);
          emsg = new ExpjMessage("ZZ01006", "�@�@��plantCd = " + plantCd);
          m_med.getSyslog().info(emsg, userId);
          emsg = new ExpjMessage("ZZ01006", "�@�@��dailyprocDate = " + dailyprocDate);
          m_med.getSyslog().info(emsg, userId);
          emsg = new ExpjMessage("ZZ01006", "�@�@��nextBusinessOprDate = " + nextBusinessOprDate);
          m_med.getSyslog().info(emsg, userId);
          Lock = new BusinessLock(conn, userId, plantCd);
          // �����Ɂunull�v�������Ă����ꍇ�B�i�K�{���ځj
          if (userId == null || userId.equals("null") || userId.equals("Null") 
            || userId.equals("NULL")) {
           // �o�b�`���������̌`�����s���ł�
           errCodeList.add("AK00006");
           setErrNote("(SBM0619)���[�U�R�[�h�F[ " + userId + " ]");
           userId = "SYSTEM";
           plantCd = "##";
           setErrPlantCd(plantCd);
           Exception e = new Exception();
           emsg = new ExpjMessage("ZZ01006", "(SBM0839)���[�U�R�[�h�������͂ł��B");
           m_med.getSyslog().severe(emsg, userId);
           throw e;
          }
          
          if (plantCd == null || plantCd.equals("null") 
            || plantCd.equals("Null") || plantCd.equals("NULL")) {
           // �o�b�`���������̌`�����s���ł�
           errCodeList.add("AK00006");
           setErrNote("(SBM0620)�H��R�[�h�F[ " + plantCd + " ]");
           userId = "SYSTEM";
           plantCd = "##";
           setErrPlantCd(plantCd);
           Exception e = new Exception();
           emsg = new ExpjMessage("ZZ01006", "(SBM0840)�H��R�[�h�������͂ł��B");
           m_med.getSyslog().severe(emsg, userId);
           throw e;
          }
          // �Ɩ����b�Z�[�W�̏���
          businessMsg.setBusinessOperatingName(businessName);
          businessMsg.setUser(userId);
          businessMsg.setPlantCode(plantCd);
          
          if (batchProcessingTyp != 1 && batchProcessingTyp != 2) {
           // �o�b�`���������̌`�����s���ł�
           errCodeList.add("AK00006");
           setErrNote("(SBM0621)�o�b�`�v���Z�X�^�C�v�F[ " + batchProcessingTyp + " ]");
           setErrPlantCd(plantCd);
           Exception e = new Exception();
           emsg = new ExpjMessage("ZZ01006", "(SBM0841)�o�b�`�v���Z�X�^�C�v���s���ł��B");
           m_med.getSyslog().severe(emsg, userId);
           throw e;
          }
          
          if (batchProcessingTyp != 1 || argsLength != 3) {
           if (dailyprocDate == null || dailyprocDate.equals("null") 
             || dailyprocDate.equals("Null") || dailyprocDate.equals("NULL")) {
            // �o�b�`���������̌`�����s���ł�
            errCodeList.add("AK00006");
            setErrNote("(SBM0628)���������Ώۓ��F[ " + dailyprocDate + " ]");
            setErrPlantCd(plantCd);
            Exception e = new Exception();
            emsg = new ExpjMessage("ZZ01006", "(SBM1012)���������Ώۓ��������͂ł��B");
            m_med.getSyslog().severe(emsg, userId);
            throw e;
           }
           
           if (nextBusinessOprDate == null || nextBusinessOprDate.equals("null") 
             || nextBusinessOprDate.equals("Null") 
             || nextBusinessOprDate.equals("NULL")) {
            // �o�b�`���������̌`�����s���ł�
            errCodeList.add("AK00006");
            setErrNote("(SBM0629)���Ɩ��^�p���F[ " + nextBusinessOprDate + " ]");
            setErrPlantCd(plantCd);
            Exception e = new Exception();
            emsg = new ExpjMessage("ZZ01006", "(SBM1013)���Ɩ��^�p���������͂ł��B");
            m_med.getSyslog().severe(emsg, userId);
            throw e;
           }
          }
          
          // �o�b�`�p�����[�^table����A�X�g�A�h���ʃp�����[�^��ǂݍ���
          m_med.setprogramCd(businessName);
          m_med.setfunctionName(functionName);
          emsg = new ExpjMessage("ZZ01006", "businessName : " + businessName);
          m_med.getSyslog().info(emsg, userId);
          emsg = new ExpjMessage("ZZ01006", "functionName : " + functionName);
          m_med.getSyslog().info(emsg, userId);
          AbstractBatchAppEntity sysBatParam = m_med.getreadSysBatParm();
          
          try {
           sysBatParam.read();
          } catch (Exception e) {
           errCodeList.add("AK00007");// �o�b�`�p�����[�^�̓ǂݍ��݂Ɏ��s���܂���
           setErrNote("(SBM0580)���[�U�R�[�h�F[ " + userId + " ] �H��R�[�h�F[ " + plantCd + " ]");
           setErrPlantCd(plantCd);
           emsg = new ExpjMessage("ZZ01006", "(SBM0925)�o�b�`�p�����[�^�̓ǂݍ��݂Ɏ��s���܂���");
           m_med.getSyslog().severe(emsg, userId);
           throw e;
          }
          
          emsg = new ExpjMessage("ZZ01006", m_med.getfilePath());
          m_med.getSyslog().info(emsg, userId);
          
          if (sysBatParam.next()) {
           logMode = m_med.getlogModeTyp().toString();
           outputMode = m_med.getoutputModeTyp().toString();
           outputPath = m_med.getfilePath();
           outputName = m_med.getfileName();
          } else {
           errCodeList.add("AK00008");// �o�b�`�p�����[�^�f�[�^�����݂��܂���
           setErrNote("(SBM0580)���[�U�R�[�h�F[ " + userId + " ] �H��R�[�h�F[ " + plantCd + " ]");
           setErrPlantCd(plantCd);
           Exception e = new Exception();
           emsg = new ExpjMessage("ZZ01006", "(SBM0576)�o�b�`�p�����[�^�f�[�^�����݂��܂���");
           m_med.getSyslog().severe(emsg, userId);
           throw e;
          }
          
       // ���̓`�F�b�N************************************************************************************
          // ��ԃo�b�`�i�����^�]�j�̏ꍇ
          if (batchProcessingTyp == 1) {
           
           // ���[�UID�����݂��邩�ǂ���
           m_med.setwhereUserCd(userId);
           
           m_med.setprogramCd(businessName);
           m_med.setfunctionName(functionName);
           AbstractBatchAppEntity checkUserCd = m_med.getcheckUserCd();
           try {
            checkUserCd.read();
           } catch (Exception e) {
            errCodeList.add("ZZ01106");// �T�[�o�ŃG���[���������܂����B
            setErrNote("(SBM0619)���[�U�R�[�h�F[ " + userId + " ]");
            setErrPlantCd(plantCd);
            emsg = new ExpjMessage("ZZ01006", "(SBM0927)���[�U�R�[�h�̓Ǎ��݂Ɏ��s���܂����B");
            m_med.getSyslog().severe(emsg, userId);
            throw e;
           }
           
           if (checkUserCd.next()) {
            String chUserCd = m_med.getchUserCd();
           } else {
            errCodeList.add("ZZ09003");// ���[�U�R�[�h�̃p�����[�^�������͂ł��B
            setErrNote("(SBM0619)���[�U�R�[�h�F[ " + userId + " ]");
            setErrPlantCd(plantCd);
            Exception e = new Exception();
            emsg = new ExpjMessage("ZZ01006", "(SBM0928)�w�肳�ꂽ���[�U�R�[�h�͑��݂��܂���B");
            m_med.getSyslog().severe(emsg, userId);
            throw e;
           }
           
           // �H��R�[�h�����݂��邩�ǂ���
           m_med.setwherePlantCd(plantCd);
           
           m_med.setprogramCd(businessName);
           m_med.setfunctionName(functionName);
           AbstractBatchAppEntity checkPlantCd = m_med.getcheckPlantCd();
           try {
            checkPlantCd.read();
           } catch (Exception e) {
            errCodeList.add("AK00014");//�H��R�[�h�̓Ǎ��݂Ɏ��s���܂����B
            setErrNote("(SBM0620)�H��R�[�h�F[ " + plantCd + " ]");
            setErrPlantCd(plantCd);
            emsg = new ExpjMessage("ZZ01006", "(SBM0929)�H��R�[�h�̓Ǎ��݂Ɏ��s���܂����B");
            m_med.getSyslog().severe(emsg, userId);
            throw e;
           }
           if (checkPlantCd.next()) {
            String chPlantCd = m_med.getchPlantCd();
           } else {
            errCodeList.add("AK00001");// �w�肳�ꂽ�H��͑��݂��܂���B
            setErrNote("(SBM0620)�H��R�[�h�F[ " + plantCd + " ]");
            setErrPlantCd(plantCd);
            Exception e = new Exception();
            emsg = new ExpjMessage("ZZ01006", "(SBM0930)�w�肳�ꂽ�H��͑��݂��܂���B");
            m_med.getSyslog().severe(emsg, userId);
            throw e;
           }
           
           if (batchProcessingTyp != 1 || argsLength != 3) {
            // ���͓��t�̃`�F�b�N
            // Calendar�^�̓��t��p��
            Calendar calDailDate = Calendar.getInstance();
            Calendar calNextDate = Calendar.getInstance();
            // "yyyy/MM/dd"�̓��t�t�H�[�}�b�g�𐶐�
            //DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
            //df.setLenient(false);  // ���t���߂̂����܂������Ȃ���
            try {
             //���������Ώۓ��`���`�F�b�N
             //calDailDate.setTime(df.parse(dailyprocDate));
             calDailDate.setTime(Converter.strToDate(dailyprocDate, "yyyy/MM/dd"));
            } catch (ParseException e) {
             errCodeList.add("AK00015");// ���������Ώۓ��̌`�����s���ł��B
             setErrNote("(SBM0628)���������Ώۓ��F[" + dailyprocDate + "]");
             setErrPlantCd(plantCd);
             emsg = new ExpjMessage("ZZ01006", "(SBM1014)���������Ώۓ��̌`�����s���ł��B");
             m_med.getSyslog().severe(emsg, userId);
             throw e;
            }
            try {
             //���Ɩ��^�p���̌`���`�F�b�N
             //calNextDate.setTime(df.parse(nextBusinessOprDate));
             calNextDate.setTime(Converter.strToDate(nextBusinessOprDate, "yyyy/MM/dd"));
            } catch (ParseException e) {
             errCodeList.add("AK00016");// ���Ɩ��^�p���̌`�����s���ł��B
             setErrNote("(SBM0629)���Ɩ��^�p���F[ " + nextBusinessOprDate + " ]");
             setErrPlantCd(plantCd);
             emsg = new ExpjMessage("ZZ01006", "(SBM1015)���Ɩ��^�p���̌`�����s���ł��B");
             m_med.getSyslog().severe(emsg, userId);
             throw e;
            }
            
            // ���t�^�𕶎���i"yyyy/MM/dd"�j�ɕϊ�
            //dailyprocDate = df.format(calDailDate.getTime());
            dailyprocDate = Converter.dateToStr(calDailDate.getTime(), "yyyy/MM/dd");
            //nextBusinessOprDate = df.format(calNextDate.getTime());
            nextBusinessOprDate = Converter.dateToStr(calNextDate.getTime(), "yyyy/MM/dd");
       
            // �u���������Ώۓ��v���m���Ɩ��^�p���n�̃`�F�b�N
            if (dailyprocDate.compareTo(nextBusinessOprDate) > 0) {
             errCodeList.add("AK33231");
             setErrNote("(SBM0630)���������Ώۓ��F[ " + dailyprocDate 
               + " ] ���Ɩ��^�p���F[ " + nextBusinessOprDate + " ]");
             setErrPlantCd(plantCd);
             Exception e = new Exception();
             emsg = new ExpjMessage("ZZ01006", 
               "(SBM1016)�u���������Ώۓ��v���m���Ɩ��^�p���n�̃G���[");
             m_med.getSyslog().severe(emsg, userId);
             throw e;
            }
           }
          }
          
          if (batchProcessingTyp == 1 && argsLength == 3) {
           // �Ɩ��^�p���̎擾
           DateCtrl dateCtrl = new DateCtrl(conn);
           String oprDate = dateCtrl.getBusinessOprDate(plantCd);
           
           // ���Ɩ��^�p���̎擾
           Date dateBusinessOprDate = 
             Converter.strToDate(
              oprDate,
              Converter.SLASH_DATE);
           WorkCalendar nextWorkDay = 
             new WorkCalendar(conn,userId,
              businessName,
              plantCd,dateBusinessOprDate,1,false);
           Date nextBusinessDate = nextWorkDay.calcDate();
           
           if (nextBusinessDate == null || nextBusinessDate.equals("")) {
            // ���Ɩ��^�p���̓ǂݍ��݂Ɏ��s�������܂����B
            errCodeList.add("AK00012");// ���Ɩ��^�p���̓ǂݍ��݂Ɏ��s�������܂����B
            setErrNote("");
            setErrPlantCd(plantCd);
            Exception e = new Exception();
            emsg = emsg = new ExpjMessage("ZZ01006", 
              "(SBM1017)���Ɩ��^�p���̓ǂݍ��݂Ɏ��s�������܂����B");
            m_med.getSyslog().severe(emsg, userId);
            throw e;
           }
           dailyprocDate = oprDate;       // ���������Ώۓ�
           nextBusinessOprDate = Converter.dateToStr(nextBusinessDate, 
             Converter.SLASH_DATE); // ���Ɩ��^�p��
          }
          
          // �Ɩ����b�N��������
          emsg = new ExpjMessage("ZZ01006", "(SBM0842)�������@�Ɩ����b�N�J�n�@������" + plantCd);
          m_med.getSyslog().info(emsg, userId);          
          lockCancelKey = Lock.doLock(businessName);  // �����L�[�̎擾
          // lockCancelKey==-1�̏ꍇ���Ɩ����b�N����Ă���̃G���[
          if(lockCancelKey == -1){
           errCodeList.add("ZZ01001");// �Ɩ����b�N����Ă��邽�ߋN���ł��܂���
           setErrNote("(SBM0580)���[�U�R�[�h�F[ " + userId 
             + " ] �H��R�[�h�F[ " + plantCd + " ]");
           setErrPlantCd(plantCd);
           emsg = new ExpjMessage("ZZ01006", "(SBM0843)�Ɩ����b�N����Ă��邽�ߋN���ł��܂���");
           m_med.getSyslog().severe(emsg, userId);
           throw new Exception("");
          }
          conn.commit();
          if (batchProcessingTyp == 1) {
           //�ŏI�����������s���`�F�b�N
           if (!checkFinalDailyProcExecDate(plantCd, businessName, functionName,
             userId, dailyprocDate)) {
            //���ʂ�false�̏ꍇ�����b�N�������s�̃G���[
            emsg = new ExpjMessage("ZZ01006", 
              "(SBM1344)�������@�Ɩ����b�N�����@������" + plantCd);
            m_med.getSyslog().info(emsg, userId);
            if (!Lock.doUnLock(businessName, lockCancelKey)) {
             throw new FoundationException("CtrlMain", "main", "ZZ01004");
            }
            throw new Exception("");
           }
          }
          
          //SP���s
          if (!spExecute(logMode, outputMode, outputPath, outputName, userId,
            businessName, plantCd, dailyprocDate, nextBusinessOprDate)) {
           //���ʂ�false�̏ꍇ�����b�N�������s�̃G���[
           emsg = new ExpjMessage("ZZ01006", 
             "(SBM1344)�������@�Ɩ����b�N�����@������" + plantCd);
           m_med.getSyslog().info(emsg, userId);
           if (!Lock.doUnLock(businessName, lockCancelKey)) {
            throw new FoundationException("CtrlMain", "main", "ZZ01004");
           }
           throw new Exception("");
          }
          //���ʂ�false�̏ꍇ�����b�N�������s�̃G���[
          emsg = new ExpjMessage("ZZ01006", "(SBM1344)�������@�Ɩ����b�N�����@������" + plantCd);
          m_med.getSyslog().info(emsg, userId);
          if (!Lock.doUnLock(businessName, lockCancelKey)) {
           throw new FoundationException("CtrlMain", "main", "ZZ01004");
          }
          conn.commit();
       
         } catch (Exception e) {
          try{
           conn.rollback();
		   throw new BatchAppException("CtrlMain", "main", e.getMessage());
          }catch(FoundationException fe){}
          e.printStackTrace();
          if (errCodeList == null || errCodeList.size() == 0) {
           errCodeList.add("AK00010");//���̑��@�d��������
           setErrNote("(SBM0580)���[�U�R�[�h�F[ " + userId + " ] �H��R�[�h�F[ " + plantCd + " ]");
           setErrPlantCd(plantCd);
           ExpjMessage emsg = new ExpjMessage("ZZ01006", "(SBM1363)���̑��@�d��������");
           m_med.getSyslog().severe(emsg, userId);
          }
         } finally {
          try {
           for(int i = 0; i < errCodeList.size(); i++) {
            String errCode = (String)errCodeList.get(i);
            String errNote = (String)errNoteHash.get(Integer.toString(i));
            String errPlantCd = (String)errPlantCdHash.get(Integer.toString(i));
            
            // �Ɩ����b�Z�[�W�̓o�^
            if (businessMsg != null) {
             try{
              Numbering numbering = new Numbering(conn, Numbering.LOG_CD, userId, 
                businessName, errPlantCd);
              businessMsg.setLogCode(numbering.getNo());
              businessMsg.setPlantCode(errPlantCd);
              businessMsg.setMessageCode(errCode);
              businessMsg.setData(errNote);
              businessMsgAcc.add(businessMsg);
              ExpjMessage emsg = new ExpjMessage("ZZ01006", 
                "(SBM0836)�������@�Ɩ����b�Z�[�W�̓o�^�@������ <" + (i + 1) 
                + "/" + errCodeList.size() + ">");
              m_med.getSyslog().severe(emsg, userId);
              emsg = new ExpjMessage("ZZ01006", 
                "�@�@��No:" + businessMsg.getLogCode() + " errCode:" 
                + errCode + " errNote:" + errNote);
              m_med.getSyslog().severe(emsg, userId);
             } catch (Exception ex) {
              ex.printStackTrace();
             }
            }
           }
           conn.commit();
       
           ExpjMessage emsg = new ExpjMessage("ZZ01006", "(SBM1344)�������@�Ɩ����b�N�����@������");
           m_med.getSyslog().severe(emsg, userId);
           //���ʂ�false�̏ꍇ�����b�N�������s�̃G���[
           if (!Lock.doUnLock(businessName, lockCancelKey)) {
            throw new FoundationException("CtrlMain", "main", "ZZ01004");
           }

          } catch (FoundationException e) {
           e.printStackTrace();
           String errCode = "ZZ01004";  // �Ɩ����b�N�̉����Ɏ��s���܂����B
           ExpjMessage emsg = new ExpjMessage("ZZ01006", "(SBM0846)�Ɩ����b�N�̉����Ɏ��s���܂����B");
           m_med.getSyslog().severe(emsg, userId);
           
           try {
            // �Ɩ����b�Z�[�W�̓o�^�i�Ɩ����b�N�������s���j
            Numbering numbering 
              = new Numbering(conn, Numbering.LOG_CD, userId, businessName, plantCd);
            businessMsg.setPlantCode(plantCd);
            businessMsg.setLogCode(numbering.getNo());
            businessMsg.setMessageCode(errCode);
            businessMsg.setData("");
            businessMsgAcc.add(businessMsg);
            emsg = new ExpjMessage("ZZ01006", 
              "(SBM1345)�������@�Ɩ����b�Z�[�W�̓o�^�@������");
            m_med.getSyslog().severe(emsg, userId);
            emsg = new ExpjMessage("ZZ01006", 
              "�@�@��No:" + businessMsg.getLogCode() + " errCode:" + errCode);
            m_med.getSyslog().severe(emsg, userId);
            
           } catch (SQLException ex) {
            ex.printStackTrace();
           } catch (FoundationException ex) {
            ex.printStackTrace();
           }
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
		public medAK0010B001 m_med=null;

		/**
		 * �R���e�i�N���X�C���X�^���X
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medAK0010B001 med) throws BatchAppException
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
