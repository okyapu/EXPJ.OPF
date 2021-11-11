/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KV0020/src/com/nec/jp/orteus/metamorBase/KV0020/KV0020B005/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.KV0020.KV0020B005;

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
import com.nec.jp.orteus.msg.util.*;
import com.nec.jp.orteus.msg.core.*;
import com.nec.jp.orteus.util.logging.Level;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.expj.util.*;
import com.nec.jp.orteus.expj.util.Numbering;
import com.nec.jp.orteus.expj.exception.*;
import com.nec.jp.orteus.expj.systemlog.*;
import com.nec.jp.orteus.expj.businesslock.*;
//import com.nec.jp.orteus.expj.businesslog.*;
import com.nec.jp.orteus.expj.sa.ArIf;
import com.nec.jp.orteus.metamorBase.common06.ExchAmount.*;
import java.math.BigDecimal;
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain �N���X
 * �t�@�C���E�N���X����
 * @author $Author: geng-jia $
 * @version $Revision: 1.10 $ $Date: 2015/12/03 08:55:54 $
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
	public medKV0020B005 m_med=null;

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
	public CtrlMain(medKV0020B005 med, BatchAppConductor cdr) throws BatchAppException
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
        public CtrlMain(medKV0020B005 med) throws BatchAppException
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
       
        // �ȉ��ɋ��ʂ̃I�u�W�F�N�g�ƃA�N�Z�b�T���`
       
        IDbConnection conn = null;	// DB�ڑ�
        private final static String FILE_ENCODING = "MS932";
       
        Numbering numbering = null;		//���O���ʃR�[�h�̔Ԃ̏���
       
        String programName  = null;
        String functionName = null;	// �X�g�A�h�v���V�[�W����
        String programId    = null;	// �@�\ID(�Ɩ���)
        String userId       = "SYSTEM";	// ���[�U�h�c
        String plantCd      = "##";	// �H��R�[�h
        String inDir        = null;	// ���͌��t�H���_
        String inFile       = null;	// ���͌��t�@�C��
        String chkUserId    = null;	// ���[�U�h�c
        String chkPlantCd   = null;	// �H��R�[�h
        String sysMyCompany = null;	// ���Ђ̉�ЃR�[�h
        String businessDate = null;	// ���Ђ̋Ɩ����t
        String homeCurCd    = null;	// ��ʉ�(�M��)
        int    arInstallCnt = 0;
       
        /**
         * �[���敪�ɂ���Đ����ϊ�
         *
         * @param strIn �ϊ��l
         *        strRoundTyp �[���敪
         *        strDecimalFig �L������
         * @return rv �ϊ�����
         */
        private String doRound(String strIn, String strRoundTyp, String strDecimalFig){
       
         int decimalFig = 0;
         if (strDecimalFig != null) {
          decimalFig = Integer.parseInt(strDecimalFig);
         }
         BigDecimal b1 = new BigDecimal(strIn);
         BigDecimal b2 = b1.movePointRight(decimalFig);
         BigDecimal b3 = null;
         if ( "1".equals(strRoundTyp) ) {
          b3 = b2.setScale((int)0, BigDecimal.ROUND_HALF_UP);
         } else if ( "2".equals(strRoundTyp) ) {
          b3 = b2.setScale((int)0, BigDecimal.ROUND_CEILING);
         } else if ( "3".equals(strRoundTyp) ) {
          b3 = b2.setScale((int)0, BigDecimal.ROUND_FLOOR);
         } else {
          b3 = b2.setScale((int)0, BigDecimal.ROUND_HALF_UP);
         }
         BigDecimal b4 = b3.movePointLeft(decimalFig);
       
         return b4.toString();
        }
       
        public void errOutput(Level level, String userId, String errMsg) throws BatchAppException
        {
         ExpjMessage emsg = new ExpjMessage("ZZ01006", errMsg);
         errOutput(level, userId, emsg);
        }
       
        public void errOutput(Level level, String userId, String errMsg, String errNote) throws BatchAppException
        {
         ExpjMessage emsg  = new ExpjMessage("ZZ01006", errMsg);
         if ( errNote == null ) {
          errOutput(level, userId, emsg);
         } else {
          ExpjMessage enote = new ExpjMessage("ZZ01006", errNote);
          errOutput(level, userId, emsg, enote);
         }
        }
       
        public void errOutput(Level level, String userId, ExpjMessage errMsg) throws BatchAppException
        {
         if ( userId == null ) {
          userId = "SYSTEM";
         }
         if ( level == Level.SEVERE ) {
          m_med.getSyslog().severe(errMsg, userId);
       //			System.out.println("SEVERE:" + errMsg.getMessage());
         } 
         else if ( level == Level.WARNING ) {
          m_med.getSyslog().warning(errMsg, userId);
       //			System.out.println("WARNING:" + errMsg.getMessage());
         }
         else if ( level == Level.INFO ) {
          m_med.getSyslog().info(errMsg, userId);
       //			System.out.println("INFO:" + errMsg.getMessage());
         }
        }
       
        public void errOutput(Level level, String userId, ExpjMessage errMsg, ExpjMessage errNote) throws BatchAppException
        {
         errOutput(level, userId, errMsg);
         if ( errNote != null ) {
          errOutput(level, userId, errNote);
         }
        }
       
        public void errOutput(Level level, String userId, String plantCd, String programId, ExpjMessage errMsg, ExpjMessage errNote) throws BatchAppException
        {
         // ���b�Z�[�W���V�X�e�����O�֏o��
         errOutput(level, userId, errMsg, errNote);
       
         String logCd = null;
       
         if ( level != Level.INFO ) {
          // �R�l�N�V������n���āA�̔Ԃ̏���
          try {
           numbering = new Numbering(conn, Numbering.LOG_CD, userId, programId, plantCd);
           logCd = numbering.getNo();
       //				errOutput(Level.INFO, userId, "���̔Ԕԍ�:" + logCd);
       //				errOutput(Level.INFO, userId, "���̔Ԍ���:" + numbering.getResultStatus());
          }
          catch (Exception e) {
           ExpjMessage errMsg0  = new ExpjMessage("ZZ01006", "BusinessLog LogCd Numbering filed");
           ExpjMessage errNote0 = null;
           errOutput(Level.SEVERE, userId, errMsg0, errNote0);
           throw new BatchAppException("CtrlMain", "main", errMsg.getMessage(CoreTools.getLocale(userId)));
          }
          finally {
           numbering = null;
          }
       //			errOutput(Level.INFO, userId, "LOG_CD get success");
       
          // �R�l�N�V������n���āA�Ɩ����b�Z�[�W����
          try {
       //				errOutput(Level.INFO, userId, "BusinessLog Entry Start");
           BusinessMessageAccessor businessMsgAcc = new BusinessMessageAccessor();
           BusinessMessage businessMsg = new BusinessMessage();
           businessMsgAcc.init(conn);
           businessMsg.setBusinessOperatingName(programId);
           businessMsg.setUser(userId);
           businessMsg.setPlantCode(plantCd);
           businessMsg.setLogCode(logCd);
           businessMsg.setMessageCode(errMsg.getCode());
           if ( errNote != null ) {
            businessMsg.setData(errNote.getMessage(CoreTools.getLocale(userId)));
           }
           businessMsgAcc.add(businessMsg);
       //				errOutput(Level.INFO, userId, "BusinessLog Entry End");
          }
          catch (Exception e) {
           e.printStackTrace();
           ExpjMessage errMsg0  = new ExpjMessage("ZZ01006", "Business Message cannot Entry");
           ExpjMessage errNote0 = null;
           errOutput(Level.SEVERE, userId, errMsg0, errNote0);
           throw new BatchAppException("CtrlMain", "main", errMsg.getMessage(CoreTools.getLocale(userId)));
          }
          try {
           conn.commit();
          }
          catch (Exception e) {
           e.printStackTrace();
           errOutput(Level.INFO, userId, "commit failed");
          }
         }
         if ( level == Level.SEVERE ) {
          throw new BatchAppException("CtrlMain", "main", "fatal error");
         }
        }
       
        public void errDataOutput(Level level, String userId, String plantCd, String programId, ExpjMessage errMsg, ExpjMessage errNote) throws BatchAppException
        {
         // ���b�Z�[�W���V�X�e�����O�֏o��
         errOutput(level, userId, errMsg, errNote);
       
         try {
          //=======================================
          // �G���[�x�����X�g�Ǘ��ԍ����擾
          //=======================================
          if(m_med.getT_ERR_WNG_LST().read() != SUCCESS){
           throw new Exception();
          }else if(m_med.getT_ERR_WNG_LST().next() == false){
           throw new Exception();
          }
          if((m_med.getCTRL_NO() == null) || ("".equals(m_med.getCTRL_NO()))){
           throw new Exception();
          }
         } catch (Exception e) {
          // �G���[�x�����X�g�Ǘ��ԍ��̔ԃG���[
          errMsg  = new ExpjMessage("KQ00143");
          errNote = null;
          errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
         }
       
         //=======================================
         // �a������I/F�ɏ����ُ���Z�b�g
         //=======================================
         // �����敪��"2"�i�ُ�I���j���Z�b�g
         m_med.setSYSTEM_PROC_TYP("2");
         try {
          int rt = m_med.getT_INSPC_ACPT_INFO_IF_1().update();
         } catch (Exception e) {
          // �a������I/F�X�V�G���[
          e.printStackTrace();
          errMsg  = new ExpjMessage("KV02502");
          errNote = new ExpjMessage("ZZ01006", "T_INSPC_ACPT_INFO_IF update failed");
          errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
         }
       
         // *************************
         // �G���[�x�����X�g�o�^���e���Z�b�g
         // *************************
         m_med.setBUSINESS_OPR_DATE(businessDate);
         if ( level == Level.SEVERE ) {
          m_med.setSTATUS("2");
         } else {
          m_med.setSTATUS("1");
         }
         m_med.setMSG_CD("[" + errMsg.getCode() + "]");
         String msgTxt = null;
         if(errMsg.getMessage(CoreTools.getLocale(userId)).indexOf("]") != -1){
          msgTxt = new String(errMsg.getMessage(CoreTools.getLocale(userId)).substring(errMsg.getMessage(CoreTools.getLocale(userId)).indexOf("]") + 1).trim());
         } else {
          msgTxt = new String(errMsg.getMessage(CoreTools.getLocale(userId)).trim());
         }
         m_med.setMSG_TXT("[" + msgTxt + "]");
       
       //			System.out.println("CTRL_NO:" + m_med.getCTRL_NO());
       
         try {
       /*
          errOutput(Level.INFO, userId, "CTRL_NO:" + m_med.getCTRL_NO());
          errOutput(Level.INFO, userId, "BUSINESS_OPR_DATE:" + m_med.getBUSINESS_OPR_DATE());
          errOutput(Level.INFO, userId, "STATUS:" + m_med.getSTATUS());
          errOutput(Level.INFO, userId, "MSG_CD:" + m_med.getMSG_CD());
          errOutput(Level.INFO, userId, "MSG_TXT:" + m_med.getMSG_TXT());
          errOutput(Level.INFO, userId, "CUST_CD:" + m_med.getCUST_CD());
          errOutput(Level.INFO, userId, "CUST_ITEM_CD:" + m_med.getCUST_ITEM_CD());
          errOutput(Level.INFO, userId, "ITEM_CD:" + m_med.getITEM_CD());
          errOutput(Level.INFO, userId, "CUST_ODR_CD:" + m_med.getCUST_ODR_CD());
          errOutput(Level.INFO, userId, "CUST_CHRG_PSN_CD:" + m_med.getCUST_CHRG_PSN_CD());
          errOutput(Level.INFO, userId, "IN_UNIT_PRICE:" + m_med.getIN_UNIT_PRICE());
          errOutput(Level.INFO, userId, "UNIT_COST:" + m_med.getUNIT_COST());
          errOutput(Level.INFO, userId, "IN_QTY:" + m_med.getIN_QTY());
          errOutput(Level.INFO, userId, "IN_DATE:" + m_med.getIN_DATE());
          errOutput(Level.INFO, userId, "INSPC_ACPT_SLIP_CD:" + m_med.getINSPC_ACPT_SLIP_CD());
          errOutput(Level.INFO, userId, "INSPC_ACPT_INFO_IF_CTRL_NO:" + m_med.getINSPC_ACPT_INFO_IF_CTRL_NO());
       */
       
          // �G���[�x�����X�g�֓o�^
          int rv = m_med.getT_ERR_WNG_LST().create();
         } catch (Exception e) {
          // �G���[�x�����X�g�o�^�G���[
          e.printStackTrace();
          errMsg  = new ExpjMessage("KV02502");
          errNote = new ExpjMessage("ZZ01006", "T_ERR_WNG_LST Entry failed");
          errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
         }
       
         try {
          conn.commit();
         } catch(Exception e){
          try {
           conn.rollback();
          } catch(Exception ee){
           errMsg  = new ExpjMessage("ZZ01006", "rollback failed at Step2");
           errNote = null;
           errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
          }
          errMsg  = new ExpjMessage("ZZ01006", "commit failed at Step2");
          errNote = null;
          errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
         }
        }
       
       //-----------------------------------------------------------------------------
       
        /**
         * main�F ���[�U��`�p���\�b�h�ł�<br>
         * <<�������L�q���Ă�������>>
         *
         * @return <<�������L�q���Ă�������>>
         * @exception <<�������L�q���Ă�������>>
         */
        public int main() throws BatchAppException
        {
         // �ϐ�������
         int nret = 0;
         BusinessLock Lock = null;	//�Ɩ����b�N�̏���
         int lockCancelKey = 0;	// ���b�N�����L�[
       
         int inCntLine    = 0;
         int ret;
       
         ExpjMessage errMsg  = null;
         ExpjMessage errNote = null;
       
         // ���Ɩ���(ID)�̐ݒ�
         String className = this.getClass().getName();
         programName = className.substring(className.length()-19, className.length()-9);
       
         // DB�ڑ��擾����
         try {
          conn = m_conductor.m_transactionConn;
         }
         catch(Exception e) {
          // DB�ڑ����s�i�R�l�N�V�����������̂ŁA�R���\�[���ɂ̂݃G���[�o�́j
          String emsg = "connection cannot get";
          System.out.println("PROGRAM:" + programName);
          System.out.println(emsg);
          errOutput(Level.SEVERE, userId, emsg);
          throw new BatchAppException("CtrlMain", "main", emsg);
         }
       
         // �N���ۂ̃`�F�b�N
         try {
          // �����̑Ó������`�F�b�N���A�ϐ��ɃZ�b�g���� -----------------------
          // �p�����[�^�̃G���[�`�F�b�N�y�яȗ����̒l�ݒ�
          String args[] = m_med.getArgs();
          int argsLength = args.length;   // �����̌���ێ�
       
          if (argsLength >= 2) {
        	  chkUserId  = args[1];	// ���[�U�h�c
          }
          if (argsLength != 5) {
           errMsg  = new ExpjMessage("ZZ09016");
           errNote = new ExpjMessage("ZZ01006", "abnormal paramater count�F[ " + argsLength + " ]");
           errOutput(Level.SEVERE, chkUserId, plantCd, programName, errMsg, errNote);
          }
       
       
          // �p�����[�^�m�F
       /*
          errOutput(Level.INFO, userId, "FUNC_NM:" + functionName);	// �X�g�A�h�v���V�[�W����
          errOutput(Level.INFO, userId, "BAT_PRG:" + programName);	// �o�b�`�Ɩ���
          errOutput(Level.INFO, userId, "PRG_NAM:" + args[0]);	// �@�\ID(�Ɩ���)
          errOutput(Level.INFO, userId, "USER_CD:" + args[1]);	// ���[�U�h�c
          errOutput(Level.INFO, userId, "PLNT_CD:" + args[2]);	// �H��R�[�h
          errOutput(Level.INFO, userId, "DIR_NAM:" + args[3]);	// ���͌��t�H���_
          errOutput(Level.INFO, userId, "FIL_NAM:" + args[4]);	// ���͌��t�@�C��
       */
       
          programId  = args[0];	// �@�\ID(�Ɩ���)
          chkPlantCd = args[2];	// �H��R�[�h
          inDir      = args[3];	// ���͌��t�H���_
          inFile     = args[4];	// ���͌��t�@�C��
       
          // �����Ɂunull�v�������Ă����ꍇ�B�i�K�{���ځj
          // ���[�UID�������Ă���ꍇ�́A�g�p����
          if (!(chkUserId == null || chkUserId.equals("") || chkUserId.equals("null") || chkUserId.equals("Null") || chkUserId.equals("NULL"))) {
           userId = chkUserId;
          }
          // �H��R�[�h�������Ă���ꍇ�́A�g�p����
          if (!(chkPlantCd == null || chkPlantCd.equals("") || chkPlantCd.equals("null") || chkPlantCd.equals("Null") || chkPlantCd.equals("NULL"))) {
           plantCd = chkPlantCd;
          }
          // �Ɩ����������Ă��Ȃ��ꍇ�́A�@�\ID�ő�p����
          if (programId == null || programId.equals("") || programId.equals("null") || programId.equals("Null") || programId.equals("NULL")) {
           programId = programName;
          }
          // ���[�UID�������Ă��Ȃ������ꍇ�́A�v���I�ȃG���[
          if (!userId.equals(chkUserId)) {
           errMsg  = new ExpjMessage("ZZ09016");
           errNote = new ExpjMessage("ZZ01006", "abnormal paramater USER_CD�F[ " + chkUserId + " ]");
           errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
          }
          // �H��R�[�h�������Ă��Ȃ������ꍇ�́A�v���I�ȃG���[
          if (!plantCd.equals(chkPlantCd)) {
           errMsg  = new ExpjMessage("ZZ09016");
           errNote = new ExpjMessage("ZZ01006", "abnormal paramater PLANT_CD�F[ " + chkPlantCd + " ]");
           errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
          }
          // ���͌��t�H���_�������Ă��Ȃ������ꍇ�́A�v���I�ȃG���[
          if (inDir == null || inDir.equals("") || inDir.equals("null") || inDir.equals("Null") || inDir.equals("NULL")) {
           errMsg  = new ExpjMessage("ZZ09016");
           errNote = new ExpjMessage("ZZ01006", "abnormal paramater Input Dir�F[ " + inDir + " ]");
           errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
          }
          // ���͌��t�@�C���������Ă��Ȃ������ꍇ�́A�v���I�ȃG���[
          if (inFile == null || inFile.equals("") || inFile.equals("null") || inFile.equals("Null") || inFile.equals("NULL")) {
           errMsg  = new ExpjMessage("ZZ09016");
           errNote = new ExpjMessage("ZZ01006", "abnormal paramater Input File�F[ " + inFile + " ]");
           errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
          }
       
          try{
           // *************************
           // ���|�����̃`�F�b�N
           // *************************
           if(m_med.getchkSysInstallOptions().read() == SUCCESS){
            if(m_med.getchkSysInstallOptions().next() != false){
             String tmpAr = m_med.getAR_INSTALL_CNT();
             if ( tmpAr == null || tmpAr.equals("") || tmpAr.equals("0") ) {
              arInstallCnt = 0;
             } else {
              arInstallCnt = Integer.parseInt(tmpAr);
             }
            }
           }
          } catch(Exception e){
           // �G���[�͋C�ɂ��Ȃ��B
           arInstallCnt = 0;
          }
       //			errOutput(Level.INFO, userId, "AR_INSTALL_CNT:" + arInstallCnt);
       
          try{
           // *************************
           // ���Џ��̎擾
           // *************************
           if(m_med.getgetCompanyInfo().read() != SUCCESS){
            throw new Exception();
           }
           if(m_med.getgetCompanyInfo().next() == false){
            throw new Exception();
           }
           sysMyCompany = m_med.getCOMPANY_CD();
          } catch(Exception e){
           // ���Џ�񂪖���
           errMsg  = new ExpjMessage("KV02404");
           errNote = null;
           errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
          }
       //			errOutput(Level.INFO, userId, "MY_COMPANY_CD:" + sysMyCompany);
       
          try{
           // *************************
           // �o�b�`�p�H��R�[�h�̎擾
           // *************************
           if(m_med.getgetPlantCd().read() != SUCCESS){
            throw new Exception();
           }
           if(m_med.getgetPlantCd().next() == false){
            throw new Exception();
           }
           plantCd = m_med.getPLANT_CD();
          } catch(Exception e){
           // ���Џ�񂪖���
           errMsg  = new ExpjMessage("KQ00153");
           errNote = null;
           errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
          }
       //			errOutput(Level.INFO, userId, "BATCH_PLANT_CD:" + plantCd);
       
          try{
           // ***************************************************
           // �Ɩ����t�̎擾�i�G���[�x�����X�g�̔������t�Ɏg�p�j
           // ***************************************************
           if(m_med.getgetBusinessOprDate().read() != SUCCESS){
            throw new Exception();
           }
           if(m_med.getgetBusinessOprDate().next() == false){
            throw new Exception();
           }
           if(plantCd.equals(m_med.getPLANT_CD())){
            businessDate = m_med.getBUSINESS_OPR_DATE();
           } else {
            throw new Exception();
           }
          } catch(Exception e){
           // �Ɩ����t������
           errMsg  = new ExpjMessage("KQ00026");
           errNote = null;
           errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
          }
       //			errOutput(Level.INFO, userId, "BUSINESS_OPR_DATE:" + businessDate);
       
          try{
           // *************************
           // ��ʉ�(�M��)�̎擾
           // *************************
           if(m_med.getgetHomeCurCd().read() != SUCCESS){
            throw new Exception();
           }
           if(m_med.getgetHomeCurCd().next() == false){
            throw new Exception();
           }
           homeCurCd = m_med.getCUR_CD();
          } catch(Exception e){
           // ��ʉ�(�M��)������
           errMsg  = new ExpjMessage("KQ00041");
           errNote = null;
           errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
          }
       //			errOutput(Level.INFO, userId, "HOME_CUR_CD:" + homeCurCd);
       
          // �o�b�`�p�����[�^�̎擾
          // �{�v���O�����́A�o�b�`�p�����[�^���擾���Ȃ��d�l�ł���B
       
          // �Ɩ����b�N�擾
          try {
           // �R�l�N�V�����E���[�U�h�c�E�H��R�[�h��n���āA�Ɩ����b�N�N���X���쐬
           Lock = new BusinessLock(conn, userId, plantCd);
           lockCancelKey = Lock.doLock(programId);
           if ( lockCancelKey == 0 ) {
            errMsg  = new ExpjMessage("ZZ09016");
            errNote = new ExpjMessage("ZZ01001");
            errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
           } else {
            errOutput(Level.INFO, userId, "Business Lock Success");
           }
           conn.commit();
          } catch(Exception e){
           errMsg  = new ExpjMessage("ZZ09016");
           errNote = new ExpjMessage("ZZ01001");
           errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
          }
       //			errOutput(Level.INFO, userId, "LOCK_KEY:" + lockCancelKey);
       
          // �Ɩ����O�ɏ����J�n���b�Z�[�W�̓o�^�B
          errMsg  = new ExpjMessage("KV02501");
       //			errNote = new ExpjMessage("ZZ01006", "inputFileName:[" + inDir + inFile + "]");
          errNote = new ExpjMessage("ZZ01006", "inputFileName:[" + inDir + "/" + inFile + "]");
          errOutput(Level.WARNING, userId, plantCd, programId, errMsg, errNote);
       
          try {
           conn.commit();
          } catch(Exception e){
           try {
            conn.rollback();
           } catch(Exception ee){
            errMsg  = new ExpjMessage("ZZ01006", "rollback failed before Step1");
            errNote = null;
            errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
           }
           errMsg  = new ExpjMessage("ZZ01006", "commit failed before Step1");
           errNote = null;
           errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
          }
       
       
       //����������������������������������������������������������������������������������������������������������������������������������������������
       //-----------------------------------------------------------------------------
       //		�a������I/F�o�̓o�b�`�����i��������j
       //-----------------------------------------------------------------------------
       
          inCntLine    = 0;
          try{
           //=======================================
           // �Ώۃf�[�^�̎擾
           //=======================================
           FileReader fr;
       //				fr = new FileReader(inDir + inFile, FILE_ENCODING);
           fr = new FileReader(inDir + "/" + inFile, FILE_ENCODING);
           while(fr.next()) {
       
            //=======================================
            // ���R�[�h���̃`�F�b�N
            //=======================================
            if ( fr.getValue().length() > 1026 ) {
             errMsg  = new ExpjMessage("KV02105");
             errNote = new ExpjMessage("ZZ01006", "line[" + (inCntLine + 1) + "] Input File Record too long:" + fr.getValue().length());
             errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
            } else if ( fr.getValue().length() < 1026 ) {
             errMsg  = new ExpjMessage("KV02105");
             errNote = new ExpjMessage("ZZ01006", "line[" + (inCntLine + 1) + "] Input File Record too short:" + fr.getValue().length());
             errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
            }
       
            //=======================================
            // ���R�[�h�̐؂蕪��
            //=======================================
            m_med.setDATA_PROC_CD(new String(fr.getValue().getBytes(FILE_ENCODING),0,5));
            m_med.setINFO_TYP_CD(new String(fr.getValue().getBytes(FILE_ENCODING),5,4));
            m_med.setDATA_CREATED_DATE(new String(fr.getValue().getBytes(FILE_ENCODING),9,6));
            m_med.setCLIENT_CD(new String(fr.getValue().getBytes(FILE_ENCODING),15,12));
            m_med.setTRUSTEE_CD(new String(fr.getValue().getBytes(FILE_ENCODING),27,12));
            m_med.setBUYER_ORG_CD(new String(fr.getValue().getBytes(FILE_ENCODING),39,8));
            m_med.setCUST_ODR_CD(new String(fr.getValue().getBytes(FILE_ENCODING),47,23));
            m_med.setPRDCT_ODR_CD(new String(fr.getValue().getBytes(FILE_ENCODING),70,19));
            m_med.setMODIFICATION_CODE(new String(fr.getValue().getBytes(FILE_ENCODING),89,1));
            m_med.setCOCK_TYP(new String(fr.getValue().getBytes(FILE_ENCODING),90,1));
            m_med.setUNIT_CD(new String(fr.getValue().getBytes(FILE_ENCODING),91,3));
            m_med.setUNIT_PRICE_EXCH_RATES(new String(fr.getValue().getBytes(FILE_ENCODING),94,13));
            m_med.setUNIT_PRICE_TYP(new String(fr.getValue().getBytes(FILE_ENCODING),107,1));
            m_med.setODR_QTY(new String(fr.getValue().getBytes(FILE_ENCODING),108,12));
            m_med.setBUYER_CD(new String(fr.getValue().getBytes(FILE_ENCODING),120,7));
            m_med.setDROWING_EDITION(new String(fr.getValue().getBytes(FILE_ENCODING),127,3));
            m_med.setITEM_NAME(new String(fr.getValue().getBytes(FILE_ENCODING),130,30));
            m_med.setOWN_ITEM_CD(new String(fr.getValue().getBytes(FILE_ENCODING),160,25));
            m_med.setCUST_ITEM_CD(new String(fr.getValue().getBytes(FILE_ENCODING),185,25));
            m_med.setDLV_LOC_CD(new String(fr.getValue().getBytes(FILE_ENCODING),210,8));
            m_med.setDLV_CD(new String(fr.getValue().getBytes(FILE_ENCODING),218,8));
            m_med.setDLV_QTY(new String(fr.getValue().getBytes(FILE_ENCODING),226,12));
            m_med.setSHIP_DATE(new String(fr.getValue().getBytes(FILE_ENCODING),238,6));
            m_med.setDLV_DATE(new String(fr.getValue().getBytes(FILE_ENCODING),244,6));
            m_med.setPART_DLV_COUNT(new String(fr.getValue().getBytes(FILE_ENCODING),250,3));
            m_med.setSHORT_QTY(new String(fr.getValue().getBytes(FILE_ENCODING),253,12));
            m_med.setREJECT_QTY(new String(fr.getValue().getBytes(FILE_ENCODING),265,12));
            m_med.setINSPC_ACPT_UNIT_PRICE_EXCH_RAT(new String(fr.getValue().getBytes(FILE_ENCODING),277,13));
            m_med.setINSPC_ACPT_AMOUNT_EXCH_RATES(new String(fr.getValue().getBytes(FILE_ENCODING),290,10));
            m_med.setINSPC_ACPT_QTY(new String(fr.getValue().getBytes(FILE_ENCODING),300,12));
            m_med.setINSPC_ACPT_DATE(new String(fr.getValue().getBytes(FILE_ENCODING),312,6));
            m_med.setINSPC_ACPT_TYP(new String(fr.getValue().getBytes(FILE_ENCODING),318,1));
            m_med.setINSPC_ACPT_SLIP_CD(new String(fr.getValue().getBytes(FILE_ENCODING),319,10));
            m_med.setSHIP_PACKING_CD(new String(fr.getValue().getBytes(FILE_ENCODING),329,7));
            m_med.setREMARKS(new String(fr.getValue().getBytes(FILE_ENCODING),336,30));
            m_med.setTAX_TYP(new String(fr.getValue().getBytes(FILE_ENCODING),366,1));
            m_med.setTRADE_TYP(new String(fr.getValue().getBytes(FILE_ENCODING),367,1));
            m_med.setTAXATION_TYP(new String(fr.getValue().getBytes(FILE_ENCODING),368,1));
            m_med.setTAX_AMOUNT_EXCH_RATES(new String(fr.getValue().getBytes(FILE_ENCODING),369,10));
            m_med.setTOTAL_AMOUNT_EXCH_RATES(new String(fr.getValue().getBytes(FILE_ENCODING),379,10));
            m_med.setINSPC_ACPT_MONTH(new String(fr.getValue().getBytes(FILE_ENCODING),389,4));
            m_med.setDLV_KEY_CD(new String(fr.getValue().getBytes(FILE_ENCODING),393,23));
            m_med.setDLV_LOC_NAME(new String(fr.getValue().getBytes(FILE_ENCODING),416,20));
            m_med.setOWN_BARCODE_INF(new String(fr.getValue().getBytes(FILE_ENCODING),436,23));
            m_med.setOWN_REMARKS(new String(fr.getValue().getBytes(FILE_ENCODING),459,25));
            m_med.setCONTRACT_COND_TYP(new String(fr.getValue().getBytes(FILE_ENCODING),484,1));
            m_med.setQTY_CONTRACT_TYP(new String(fr.getValue().getBytes(FILE_ENCODING),485,1));
            m_med.setBUYER_ORG_NAME(new String(fr.getValue().getBytes(FILE_ENCODING),486,20));
            m_med.setBUYER_NAME_KANJI(new String(fr.getValue().getBytes(FILE_ENCODING),506,14));
            m_med.setITEM_NAME_KANJI(new String(fr.getValue().getBytes(FILE_ENCODING),520,60));
            m_med.setREMARKS_KANJI(new String(fr.getValue().getBytes(FILE_ENCODING),580,60));
            m_med.setDLV_LOC_NAME_KANJI(new String(fr.getValue().getBytes(FILE_ENCODING),640,40));
            m_med.setOWN_REMARKS_KANJI(new String(fr.getValue().getBytes(FILE_ENCODING),680,50));
            m_med.setBUYER_ORG_CD_KANJI(new String(fr.getValue().getBytes(FILE_ENCODING),730,40));
            m_med.setCUR_CD(new String(fr.getValue().getBytes(FILE_ENCODING),770,3));
            m_med.setUNIT_PRICE(new String(fr.getValue().getBytes(FILE_ENCODING),773,16));
            m_med.setINSPC_ACPT_UNIT_PRICE(new String(fr.getValue().getBytes(FILE_ENCODING),789,16));
            m_med.setINSPC_ACPT_AMOUNT(new String(fr.getValue().getBytes(FILE_ENCODING),805,15));
            m_med.setTAX_AMOUNT(new String(fr.getValue().getBytes(FILE_ENCODING),820,15));
            m_med.setTOTAL_AMOUNT(new String(fr.getValue().getBytes(FILE_ENCODING),835,15));
            m_med.setSTEEL_SHIP_LIST(new String(fr.getValue().getBytes(FILE_ENCODING),850,15));
            m_med.setSTEEL_SLIP_CD(new String(fr.getValue().getBytes(FILE_ENCODING),865,12));
            m_med.setSTEEL_POC_INDUSTRY(new String(fr.getValue().getBytes(FILE_ENCODING),877,12));
            m_med.setSTEEL_DLV_LOC(new String(fr.getValue().getBytes(FILE_ENCODING),889,12));
            m_med.setSTEEL_DEM_FACTRY_CD(new String(fr.getValue().getBytes(FILE_ENCODING),901,6));
            m_med.setSTEEL_TR_COMP_ORG_CD(new String(fr.getValue().getBytes(FILE_ENCODING),907,6));
            m_med.setSTEEL_TR_COMP_ORG_INQUIRY_CD(new String(fr.getValue().getBytes(FILE_ENCODING),913,11));
            m_med.setSTEEL_DSP_SPEC(new String(fr.getValue().getBytes(FILE_ENCODING),924,60));
            m_med.setSTEEL_SIZE(new String(fr.getValue().getBytes(FILE_ENCODING),984,40));
            m_med.setSTEEL_POC_COST(new String(fr.getValue().getBytes(FILE_ENCODING),1024,2));
            m_med.setSYSTEM_PROC_TYP("0");
            m_med.setDEL_FLG("0");
            //--Add Start 20140128 qian-lf
            m_med.setUsername(userId);
            //--Add End 20140128 qian-lf
       
            //=======================================
            // �������IF�Ǘ��ԍ����擾
            //=======================================
            try {
             if(m_med.getT_INSPC_ACPT_INFO_IF().read() != SUCCESS){
              errMsg  = new ExpjMessage("KV02503");
              errNote = new ExpjMessage("ZZ01006", "INSPC_ACPT_INFO_IF_CTRL_NO Cannot Get at read");
              errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
             } else if(m_med.getT_INSPC_ACPT_INFO_IF().next() == false){
              errMsg  = new ExpjMessage("KV02503");
              errNote = new ExpjMessage("ZZ01006", "INSPC_ACPT_INFO_IF_CTRL_NO Cannot Get at next");
              errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
             }
            } catch(BatchAppException e){
             throw e;
            } catch(Exception e){
             e.printStackTrace();
             errMsg  = new ExpjMessage("KV02503");
             errNote = new ExpjMessage("ZZ01006", "INSPC_ACPT_INFO_IF_CTRL_NO Cannot Get cause Exception");
             errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
            }
       
            try {
             //�������IF/DB�֓o�^
             int rv = m_med.getT_INSPC_ACPT_INFO_IF().create();
       
             //���R�[�h�����̉��Z
             inCntLine++;
            } catch(Exception e){
             e.printStackTrace();
             errMsg  = new ExpjMessage("KV02105");
             errNote = null;
             errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
            }
           }
           conn.commit();
       
          } catch(BatchAppException e){
           throw e;
          } catch(Exception e){
           e.printStackTrace();
           errMsg  = new ExpjMessage("KV02502");
           errNote = new ExpjMessage("ZZ01006", "Process abort at Step1 at:[ " + (inCntLine + 1) + " ]");
           errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
          }
       
          // �Ɩ����O��STEP1�����I�����b�Z�[�W�̓o�^�B
          errMsg  = new ExpjMessage("KV02106");
          errNote = new ExpjMessage("ZZ01006", "Entry record count:[ " + inCntLine + " ]");
          errOutput(Level.WARNING, userId, plantCd, programId, errMsg, errNote);
       
          try {
           conn.commit();
          } catch(Exception e){
           try {
            conn.rollback();
           } catch(Exception ee){
            errMsg  = new ExpjMessage("ZZ01006", "rollback failed at Step1");
            errNote = null;
            errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
           }
           errMsg  = new ExpjMessage("ZZ01006", "commit failed after Step1");
           errNote = null;
           errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
          }
       
          // ��荞�񂾗a���������уf�[�^����A�o�׎��ё���o�^�B
          inCntLine    = 0;
          try {
           //=======================================
           // �Ώۃf�[�^�̎擾
           //=======================================
           if(m_med.getT_INSPC_ACPT_INFO_IF_1().read() != SUCCESS){
            errMsg  = new ExpjMessage("ZZ01006", "data read failed at Step2");
            errNote = null;
            errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
           }
           // T_INSPC_ACPT_INFO_IF�e�[�u��������o��
           while(m_med.getT_INSPC_ACPT_INFO_IF_1().next()) {
       
            //���R�[�h�����̉��Z
            inCntLine++;
       
            m_med.setCOMPANY_CD(sysMyCompany);
            m_med.setBUSINESS_OPR_DATE(businessDate);
            m_med.setUSER_CD(userId);
       
            // med�ϐ��̒l�̃N���A
            m_med.setIN_AMOUNT("");
            m_med.setIN_AMOUNT_EXCH_RATES("");
            m_med.setIN_DATE("");
            m_med.setIN_QTY("");
            m_med.setIN_UNIT_PRICE("");
            m_med.setCUR_CD("");
            m_med.setCUST_CD("");
            m_med.setCUST_CHRG_PSN_CD("");
            m_med.setCUST_NAME("");
            m_med.setDEPO_WH_CD("");
            m_med.setUNIT_COST("0");
            m_med.setITEM_CD("");
            m_med.setITEM_NAME("");
            m_med.setPKG_UNIT_QTY("0");
            m_med.setITEM_STOK_PLANT_CD("");
            m_med.setMSG_CD("");
            m_med.setMSG_TXT("");
            m_med.setPART_DLV_COUNT("");
            m_med.setRCV_ISSUE_CTRL_CD("");
            m_med.setSALES_DEPT_CD("");
            m_med.setSHIP_ODR_NO("");
            m_med.setSLIP_CD("");
            m_med.setSTATUS("");
       
            // *************************
            // ���Ӑ���̎擾
            // *************************
            try {
             if(m_med.getM_CUST().read() != SUCCESS){
              throw new Exception();
             }else if(m_med.getM_CUST().next() == false){
              throw new Exception();
             }else if(m_med.getM_CUST().next() != false){
              //���R�[�h���������݂���ꍇ�́A�V�X�e������
              errMsg  = new ExpjMessage("KV02504", m_med.getINSPC_ACPT_INFO_IF_CTRL_NO());
              errNote = new ExpjMessage("ZZ01006", "CLIENT_CD:" +  m_med.getCLIENT_CD());
              errDataOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
              continue;
             }
            } catch(BatchAppException e){
             throw e;
            } catch(Exception e){

             // ���Ӑ��񂪖����A�܂��́A�Ǎ����s
             errMsg  = new ExpjMessage("KQ00103", m_med.getINSPC_ACPT_INFO_IF_CTRL_NO());
             errNote = new ExpjMessage("ZZ01006", "CLIENT_CD:" +  m_med.getCLIENT_CD());
             errDataOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
             continue;
            }
       
       /*
            //System.out.println("CUST_CD:" + m_med.getCUST_CD());
            //System.out.println("CUST_NAME:" + m_med.getCUST_NAME());
            //System.out.println("CUST_CHRG_PSN_CD:" + m_med.getCUST_CHRG_PSN_CD());
            //System.out.println("CUR_CD:" + m_med.getCUR_CD());
            //System.out.println("DETAIL_ROUND_TYP:" + m_med.getDETAIL_ROUND_TYP());
            //System.out.println("CUST_EXCH_TYP:" + m_med.getCUST_EXCH_TYP());
            //System.out.println("TAX_APPLY_TYP:" + m_med.getTAX_APPLY_TYP());
            //System.out.println("CUST_TAX_CD:" + m_med.getCUST_TAX_CD());
       */
       
            // *************************
            // ���i���̎擾
            // *************************
            try {
             if(m_med.getM_ITEM_SPEC().read() != SUCCESS){
              throw new Exception();
             }else if(m_med.getM_ITEM_SPEC().next() == false){
              throw new Exception();
             }
            } catch(Exception e){

             // ���i��񂪖����A�܂��́A�Ǎ����s
             errMsg  = new ExpjMessage("KV02505", m_med.getINSPC_ACPT_INFO_IF_CTRL_NO());
             errNote = new ExpjMessage("ZZ01006", "CUST_ITEM_CD:" +  m_med.getCUST_ITEM_CD());
             errDataOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
             continue;
            }
       
            if ("10".equals(m_med.getDEPO_TYP())){
             // �a���q�ɋ敪 = 10:�ʏ�
             errMsg  = new ExpjMessage("KV02515", m_med.getINSPC_ACPT_INFO_IF_CTRL_NO());
             errNote = new ExpjMessage("ZZ01006", "DEPO_TYP:" +  m_med.getDEPO_TYP());
             errDataOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
             continue;
            }
       
            if ((m_med.getSALES_DEPT_CD() == null) ||
             (m_med.getSALES_DEPT_CD().length() == 0)) {
             // ����v�㕔�� = Null
             if ( (m_med.getOWN_ORG_CD() == null) || (m_med.getOWN_ORG_CD().length() == 0)) {
              // ���ВS������ = Null
              errMsg = new ExpjMessage("KV02516", m_med.getINSPC_ACPT_INFO_IF_CTRL_NO());
              errNote = new ExpjMessage("ZZ01006", "SALES_DEPT_CD:" + m_med.getSALES_DEPT_CD());
              errDataOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
              continue;
             }
             else {
              m_med.setSALES_DEPT_CD(m_med.getOWN_ORG_CD());
             }
            }
       
            // *************************
            // �i�ڏ��̎擾
            // *************************
            try {
             if(m_med.getM_ITEM().read() != SUCCESS){
              throw new Exception();
             }else if(m_med.getM_ITEM().next() == false){
              throw new Exception();
             }
            } catch(Exception e){
             //�i�ڏ�񂪖����A�܂��́A�Ǎ����s
             errMsg  = new ExpjMessage("KV02509", m_med.getINSPC_ACPT_INFO_IF_CTRL_NO());
             errNote = new ExpjMessage("ZZ01006", "ITEM_CD:" +  m_med.getITEM_CD());
             errDataOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
             continue;
            }
       
       //			errOutput(Level.INFO, userId, "INSPC_ACPT_AMOUNT:" + m_med.getINSPC_ACPT_AMOUNT());
       //			errOutput(Level.INFO, userId, "INSPC_ACPT_AMOUNT_EXCH_RATES:" + m_med.getINSPC_ACPT_AMOUNT_EXCH_RATES());
       //			errOutput(Level.INFO, userId, "INSPC_ACPT_UNIT_PRICE:" + m_med.getINSPC_ACPT_UNIT_PRICE());
       //			errOutput(Level.INFO, userId, "INSPC_ACPT_QTY:" + m_med.getINSPC_ACPT_QTY());
       //			errOutput(Level.INFO, userId, "INSPC_ACPT_DATE:" + m_med.getINSPC_ACPT_DATE());
       
            // *************************
            // �Ώۃf�[�^��ϊ�
            // *************************
            try {
             if(m_med.getinFikeConvert().read() != SUCCESS){
              throw new Exception();
             }else if(m_med.getinFikeConvert().next() == false){
              throw new Exception();
             }
       //			errOutput(Level.INFO, userId, "IN_AMOUNT:"            + m_med.getIN_AMOUNT());
       //			errOutput(Level.INFO, userId, "IN_AMOUNT_EXCH_RATES:" + m_med.getIN_AMOUNT_EXCH_RATES());
       //			errOutput(Level.INFO, userId, "IN_UNIT_PRICE:"        + m_med.getIN_UNIT_PRICE());
       //			errOutput(Level.INFO, userId, "IN_QTY:"               + m_med.getIN_QTY());
       //			errOutput(Level.INFO, userId, "IN_DATE:"              + m_med.getIN_DATE());
            } catch(Exception e){
             // �Ώۃf�[�^��NUMBER�ϊ��EDATE�ϊ��Ɏ��s
             errMsg  = new ExpjMessage("ZZ01006", "(SBM0895)[" + m_med.getINSPC_ACPT_INFO_IF_CTRL_NO() + "] ���̓f�[�^�̌`���Ɍ�肪����܂��B");
             errNote = new ExpjMessage("ZZ01006", "Worning at Step2 at:[ " + inCntLine + " ]");
             errDataOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
             continue;
            }
       
            // *************************
            // ���i�P�����̎擾
            // *************************
            try {
             if(m_med.getM_UNIT_COST().read() != SUCCESS){
              throw new Exception();
             }else if(m_med.getM_UNIT_COST().next() == false){
              throw new Exception();
             }
            } catch(Exception e){
             // ���i�P����񂪖����A�܂��́A�Ǎ����s
             errMsg  = new ExpjMessage("KQ00121", m_med.getINSPC_ACPT_INFO_IF_CTRL_NO());
             errNote = new ExpjMessage("ZZ01006", "ITEM_CD:" +  m_med.getITEM_CD());
             errDataOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
             continue;
            }
       
            if(new BigDecimal(m_med.getUNIT_COST()).compareTo(new BigDecimal(m_med.getIN_UNIT_PRICE())) != 0){
             // ���i�P���ƌ����P�����Ⴄ
             errMsg  = new ExpjMessage("KQ00120", m_med.getINSPC_ACPT_INFO_IF_CTRL_NO());
             errNote = new ExpjMessage("ZZ01006", "UNIT_COST:" +  m_med.getUNIT_COST() + "!= IN_UNIT_PRICE:" +  m_med.getIN_UNIT_PRICE());
       //						errOutput(Level.INFO, userId, "BigDecimal(UNIT_COST):" + new BigDecimal(m_med.getUNIT_COST()));
       //						errOutput(Level.INFO, userId, "BigDecimal(IN_UNIT_PRICE):" + new BigDecimal(m_med.getIN_UNIT_PRICE()));
       //						errOutput(Level.INFO, userId, "compareTo:" + new BigDecimal(m_med.getUNIT_COST()).compareTo(new BigDecimal(m_med.getIN_UNIT_PRICE())));
             errDataOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
             continue;
            }
       
            // *************************
            // ���Ӑ�[�i�ꏊ���̎擾
            // *************************
            try {
             if(m_med.getM_CUST_BASE().read() != SUCCESS){
              throw new Exception();
             }else if(m_med.getM_CUST_BASE().next() == false){
              throw new Exception();
             }
            } catch(Exception e){
             // ���Ӑ�[�i��ꏊ��񂪖����A�܂��́A�Ǎ����s
             errMsg  = new ExpjMessage("KV02506", m_med.getINSPC_ACPT_INFO_IF_CTRL_NO());
             errNote = new ExpjMessage("ZZ01006", "DLV_LOC_CD:" +  m_med.getDLV_LOC_CD());
             errDataOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
             continue;
            }
       
            // *************************
            // �ʉݏ��̎擾
            // *************************
            try {
             if(m_med.getM_CUR().read() != SUCCESS){
              throw new Exception();
             }else if(m_med.getM_CUR().next() == false){
              throw new Exception();
             }
            } catch(Exception e){
             // �ʉݏ�񂪖����A�܂��́A�Ǎ����s
             errMsg  = new ExpjMessage("KV02507", m_med.getINSPC_ACPT_INFO_IF_CTRL_NO());
             errNote = new ExpjMessage("ZZ01006", "CUR_CD:" +  m_med.getCUR_CD());
             errDataOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
             continue;
            }
       
            // *************************
            // �������z�E�������z(�M��)�̌v�Z
            // *************************
            if( homeCurCd.equals(m_med.getCUR_CD()) ){
             // ���Ӑ�ʉ݃R�[�h�����Вʉ݃R�[�h
             if (new BigDecimal(m_med.getIN_AMOUNT()).compareTo(new BigDecimal("0")) != 0 ) {
              // [�������IF]."�������z" �� 0
              m_med.setIN_AMOUNT_EXCH_RATES(m_med.getIN_AMOUNT());
       
             } else if (new BigDecimal(m_med.getIN_AMOUNT_EXCH_RATES()).compareTo(new BigDecimal("0")) != 0 ) {
              // [�������IF]."�������z" �� 0�@���@[�������IF]."�������z(�M��)"��0
              m_med.setIN_AMOUNT(m_med.getIN_AMOUNT_EXCH_RATES());
              errMsg  = new ExpjMessage("KV02514", m_med.getINSPC_ACPT_INFO_IF_CTRL_NO());
              errNote = null;
              errDataOutput(Level.WARNING, userId, plantCd, programId, errMsg, errNote);
       
             } else {
              // [�������IF]."�������z" �� 0�@���@[�������IF]."�������z(�M��)"��0
              // �������z�������B
              errMsg  = new ExpjMessage("KV02513", m_med.getINSPC_ACPT_INFO_IF_CTRL_NO());
              errNote = null;
              errDataOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
              continue;
       
             }
            } else {
             // ���Ӑ�ʉ݃R�[�h�����Вʉ݃R�[�h
             if (new BigDecimal(m_med.getIN_AMOUNT()).compareTo(new BigDecimal("0")) == 0 ) {
              // [�������IF]."�������z" �� 0
              // �������z�������B
              errMsg  = new ExpjMessage("KV02513", m_med.getINSPC_ACPT_INFO_IF_CTRL_NO());
              errNote = null;
              errDataOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
              continue;
       
             } else {
              // [�������IF]."�������z" �� 0
       
              // *************************
              // �בփ��[�g���̎擾
              // *************************
              try {
               if(m_med.getM_EXCH_RATE().read() != SUCCESS){
                throw new Exception();
               }else if(m_med.getM_EXCH_RATE().next() == false){
                throw new Exception();
               }
              } catch(Exception e){
               // �בփ��[�g��񂪖����A�܂��́A�Ǎ����s
               errMsg  = new ExpjMessage("KV02508", m_med.getINSPC_ACPT_INFO_IF_CTRL_NO());
               errNote = new ExpjMessage("ZZ01006", "CUR_CD:" +  m_med.getCUR_CD());
               errDataOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
               continue;
              }
       
              // [�������IF]."�������z"�~[�בփ��[�g]."�בփ��[�g"���A
              // [�ʉ�]."��������" �Ŏw�肳�ꂽ�����_�܂łɂ���
              // [���Ӑ�]."���׌v�Z�܂�ߋ敪"�Ŋۂ߂��l
       
              ExchAmount exch = new ExchAmount(conn);	// �O�݊��Z�N���X�̃C���X�^���X
              if ( exch.doExchAmount(m_med.getIN_AMOUNT(), m_med.getCOMPANY_CD(),
                 m_med.getCUR_CD(), m_med.getEXCH_TYP(),
                 m_med.getDETAIL_ROUND_TYP(), m_med.getIN_DATE() ) ) {
               // ���Z���z��ݒ�
               m_med.setIN_AMOUNT_EXCH_RATES(String.valueOf(exch.getD_EXCH_AMOUNT()));
              }else{
               // ���Z�Ɏ��s
               errMsg  = new ExpjMessage("KV02502");
               errNote = new ExpjMessage("ZZ01006", "ExchAmount failed");
               errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
              }
             }
            }
       
            // *************************
            // �ǂ̏���ŃR�[�h���g�����H
            // *************************
            if( Integer.parseInt(m_med.getTAX_APPLY_TYP()) == 1 ) {
             // ���i�̏���ŃR�[�h���g�p
       //						errOutput(Level.INFO, userId, "M_ITEM_SPEC_TAX_CD:" + m_med.getTAX_CD());
            } else if( Integer.parseInt(m_med.getTAX_APPLY_TYP()) == 2 ) {
             // ���Ӑ�̏���ŃR�[�h���g�p
             m_med.setTAX_CD(m_med.getCUST_TAX_CD());
       //						errOutput(Level.INFO, userId, "M_CUST_TAX_CD:" + m_med.getTAX_CD());
            } else {
             // ���Z�Ɏ��s
             errMsg  = new ExpjMessage("KV02502");
             errNote = new ExpjMessage("ZZ01006", "Tax Culculate failed");
             errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
            }
       
            // *************************
            // ����ŗ��v�Z
            // *************************
            String taxTyp = (m_med.getTAX_CD()).substring(2, 3);
       //					errOutput(Level.INFO, userId, "TAX_TYPE:" + taxTyp);
       
            // �ǂ̓���?�O��?��ې�?
            if ( "0".equals(taxTyp) ) {
             // ����ŏ��̓Ǎ��Ȃ�
            } else if ( "1".equals(taxTyp) || "5".equals(taxTyp) || "9".equals(taxTyp) ) {
             // *************************
             // ����ŏ��̎擾
             // *************************
             try {
              if(m_med.getM_TAX().read() != SUCCESS){
               throw new Exception();
              }else if(m_med.getM_TAX().next() == false){
               throw new Exception();
              }
             } catch(Exception e){
              // ����ŏ�񂪖����A�܂��́A�Ǎ����s
              errMsg  = new ExpjMessage("KV02502");
              errNote = new ExpjMessage("ZZ01006", "TAX_CD:" +  m_med.getTAX_CD());
              errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
              continue;
             }
       
       //					errOutput(Level.INFO, userId, "TAX_START_DATE:" + m_med.getTAX_START_DATE());
       //					errOutput(Level.INFO, userId, "IN_DATE:" + m_med.getIN_DATE());
       
             //--Mod Start 20140126 qian-lf
             if ( m_med.getTAX_START_DATE().compareTo(m_med.getIN_DATE()) > 0 ) {
             //--Mod End 20140126 qian-lf
              m_med.setTAX_RATE_1(m_med.getOLD_TAX_RATE_1());
              m_med.setTAX_RATE_2(m_med.getOLD_TAX_RATE_2());
              m_med.setTAX_RATE_3(m_med.getOLD_TAX_RATE_3());
             }
       
       //					errOutput(Level.INFO, userId, "TAX_RATE_1:" + m_med.getTAX_RATE_1());
       //					errOutput(Level.INFO, userId, "TAX_RATE_2:" + m_med.getTAX_RATE_2());
       //					errOutput(Level.INFO, userId, "TAX_RATE_3:" + m_med.getTAX_RATE_3());
       
            } else {
             // ����ŗ��v�Z�Ɏ��s
             errMsg  = new ExpjMessage("KV02502");
             errNote = new ExpjMessage("ZZ01006", "Tax Culculate failed");
             errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
            }
       
            // *************************
            // ����Ŋz�v�Z
            // *************************
            m_med.setTAX_AMOUNT_1("0");
            m_med.setTAX_AMOUNT_2("0");
            m_med.setTAX_AMOUNT_3("0");
       
            m_med.setEXTERNAL_TAX_AMOUNT("0");
            m_med.setINTERNAL_TAX_AMOUNT("0");
       
            m_med.setEXTERNAL_TAX_SALES_AMOUNT("0");
            m_med.setINTERNAL_TAX_SALES_AMOUNT("0");
            m_med.setTAXFREE_SALES_AMOUNT("0");
       
            m_med.setTAX_CREDIT_SALES_AMOUNT("0");
       
            String amount = m_med.getIN_AMOUNT();
       
            ExchAmount exch = new ExchAmount(conn);	// �O�݊��Z�N���X�̃C���X�^���X
            String tax1 = "0";
            String tax2 = "0";
            String tax3 = "0";
            String tax = "0";
            String taxRound = m_med.getTAX_ROUND_TYP();
            String decimalFig = m_med.getDECIMAL_FIG();
       
            if ( "0".equals(taxTyp) ) {
             // ��ې�
             tax1 = "0";
             tax2 = "0";
             tax3 = "0";
            } else if ( "1".equals(taxTyp) ) {
             // �O��
             tax1 = this.doRound(exch.doDiv(exch.doMul(amount, m_med.getTAX_RATE_1()), "100"), taxRound, decimalFig);
             tax2 = this.doRound(exch.doDiv(exch.doMul(amount, m_med.getTAX_RATE_2()), "100"), taxRound, decimalFig);
             tax3 = this.doRound(exch.doDiv(exch.doMul(amount, m_med.getTAX_RATE_3()), "100"), taxRound, decimalFig);
            } else {
             // ����
             tax1 = this.doRound(exch.doDiv(exch.doMul(amount, m_med.getTAX_RATE_1()),  exch.doSum(m_med.getTAX_RATE_1(), "100")), taxRound, decimalFig);
             tax2 = this.doRound(exch.doDiv(exch.doMul(amount, m_med.getTAX_RATE_2()),  exch.doSum(m_med.getTAX_RATE_2(), "100")), taxRound, decimalFig);
             tax3 = this.doRound(exch.doDiv(exch.doMul(amount, m_med.getTAX_RATE_3()),  exch.doSum(m_med.getTAX_RATE_3(), "100")), taxRound, decimalFig);
            }
       
            tax = exch.doSum(exch.doSum(tax1,tax2),tax3);
            m_med.setTAX_AMOUNT_1(tax1);
            m_med.setTAX_AMOUNT_2(tax2);
            m_med.setTAX_AMOUNT_3(tax3);
            m_med.setTAX_CREDIT_SALES_AMOUNT(amount);
       
            if ( "0".equals(taxTyp) ) {
             // ��ې�
             m_med.setTAXFREE_SALES_AMOUNT(amount);
            } else if ( "1".equals(taxTyp) ) {
             // �O��
             m_med.setEXTERNAL_TAX_AMOUNT(tax);
             m_med.setEXTERNAL_TAX_SALES_AMOUNT(amount);
            } else {
             // ����
             m_med.setINTERNAL_TAX_AMOUNT(tax);
             m_med.setINTERNAL_TAX_SALES_AMOUNT(amount);
             m_med.setTAX_CREDIT_SALES_AMOUNT(exch.doSub(amount, tax));
            }
       
       
            if( homeCurCd.equals(m_med.getCUR_CD()) ){
             // ���Ӑ�ʉ݃R�[�h�����Вʉ݃R�[�h
             m_med.setOWN_CUR_TAXCREDIT_SALES_AMOUNT(m_med.getTAX_CREDIT_SALES_AMOUNT());
             // �בփ��[�g
             m_med.setEXCH_RATE("1");
       
            } else {
             // ���Ӑ�ʉ݃R�[�h�����Вʉ݃R�[�h
             if ( exch.doExchAmount(m_med.getTAX_CREDIT_SALES_AMOUNT(), m_med.getCOMPANY_CD(),
                m_med.getCUR_CD(), m_med.getEXCH_TYP(),
                m_med.getDETAIL_ROUND_TYP(), m_med.getIN_DATE() ) ) {
              // ���Z���z��ݒ�
              m_med.setOWN_CUR_TAXCREDIT_SALES_AMOUNT(String.valueOf(exch.getD_EXCH_AMOUNT()));
             }else{
              // ���Z�Ɏ��s
              errMsg  = new ExpjMessage("KV02502");
              errNote = new ExpjMessage("ZZ01006", "ExchAmount failed");
              errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
             }
            }
       
            // *************************
            // �ۊǋ���̎擾
            // *************************
            try {
             if(m_med.getM_WH().read() != SUCCESS){
              throw new Exception();
             }else if(m_med.getM_WH().next() == false){
              throw new Exception();
             }
            } catch(Exception e){
             // �ۊǋ��񂪖����A�܂��́A�Ǎ����s
             errMsg  = new ExpjMessage("KV02511", m_med.getINSPC_ACPT_INFO_IF_CTRL_NO());
             errNote = new ExpjMessage("ZZ01006", "DLV_LOC_CD:" +  m_med.getDLV_LOC_CD());
             errDataOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
             continue;
            }
       
            // *************************
            // �ۊǋ�ʍ݌ɏ��̎擾
            // *************************
            try {
             if(m_med.getT_ITEM_STOCK().read() != SUCCESS){
              throw new Exception();
             }else if(m_med.getT_ITEM_STOCK().next() == false){
              throw new Exception();
             }
            } catch(Exception e){
             // �ۊǋ�ʍ݌ɏ�񂪖����A�܂��́A�Ǎ����s
             errMsg  = new ExpjMessage("KV02510", m_med.getINSPC_ACPT_INFO_IF_CTRL_NO());
             errNote = new ExpjMessage("ZZ01006", "ITEM_CD:" +  m_med.getITEM_CD());
             errDataOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
             continue;
            }
       
            // *************************
            // �`�[�ԍ��̔�
            // *************************
            // �R�l�N�V������n���āA�̔Ԃ̏���
            try {
             numbering = new Numbering(conn, Numbering.SLIP_CD, userId, programId, plantCd);
             m_med.setSLIP_CD(numbering.getNo());
       //						errOutput(Level.INFO, userId, "���̔Ԕԍ�:" + m_med.getSLIP_CD());
       //						errOutput(Level.INFO, userId, "���̔Ԍ���:" + numbering.getResultStatus());
            }
            catch (Exception e) {
             errMsg  = new ExpjMessage("KV02502");
             errNote = new ExpjMessage("ZZ01006", "SLIP_CD Numbering failed");
             errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
            }
            finally {
             numbering = null;
            }
       //					errOutput(Level.INFO, userId, "SLIP_CD get success");
       
            // *************************
            // �o�׎w���ԍ��̔�
            // *************************
            // �R�l�N�V������n���āA�̔Ԃ̏���
            try {
             numbering = new Numbering(conn, Numbering.SHIP_ODR_NO, userId, programId, plantCd);
             m_med.setSHIP_ODR_NO(numbering.getNo());
       //						errOutput(Level.INFO, userId, "���̔Ԕԍ�:" + m_med.getSHIP_ODR_NO());
       //						errOutput(Level.INFO, userId, "���̔Ԍ���:" + numbering.getResultStatus());
            }
            catch (Exception e) {
             errMsg  = new ExpjMessage("KV02502");
             errNote = new ExpjMessage("ZZ01006", "SHIP_ODR_NO Numbering failed");
             errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
            }
            finally {
             numbering = null;
            }
       //					errOutput(Level.INFO, userId, "SHIP_ODR_NO get success");
       /*
             errOutput(Level.INFO, userId, "CTRL_NO                    :" + m_med.getCTRL_NO());
             errOutput(Level.INFO, userId, "SHIP_ODR_NO                :" + m_med.getSHIP_ODR_NO());
             errOutput(Level.INFO, userId, "SLIP_CD                    :" + m_med.getSLIP_CD());
             errOutput(Level.INFO, userId, "ITEM_CD                    :" + m_med.getITEM_CD());
             errOutput(Level.INFO, userId, "CUST_ITEM_CD               :" + m_med.getCUST_ITEM_CD());
             errOutput(Level.INFO, userId, "CUST_ODR_CD                :" + m_med.getCUST_ODR_CD());
             errOutput(Level.INFO, userId, "CUST_CD                    :" + m_med.getCUST_CD());
             errOutput(Level.INFO, userId, "CUST_NAME                  :" + m_med.getCUST_NAME());
             errOutput(Level.INFO, userId, "CUST_CHRG_PSN_CD           :" + m_med.getCUST_CHRG_PSN_CD());
             errOutput(Level.INFO, userId, "USER_CD                    :" + m_med.getUSER_CD());
             errOutput(Level.INFO, userId, "DLV_LOC_CD                 :" + m_med.getDLV_LOC_CD());
             errOutput(Level.INFO, userId, "IN_DATE                    :" + m_med.getIN_DATE());
             errOutput(Level.INFO, userId, "IN_QTY                     :" + m_med.getIN_QTY());
             errOutput(Level.INFO, userId, "UNIT_CD                    :" + m_med.getUNIT_CD());
             errOutput(Level.INFO, userId, "IN_UNIT_PRICE              :" + m_med.getIN_UNIT_PRICE());
             errOutput(Level.INFO, userId, "IN_AMOUNT                  :" + m_med.getIN_AMOUNT());
             errOutput(Level.INFO, userId, "IN_AMOUNT_EXCH_RATES       :" + m_med.getIN_AMOUNT_EXCH_RATES());
             errOutput(Level.INFO, userId, "CUR_CD                     :" + m_med.getCUR_CD());
             errOutput(Level.INFO, userId, "PKG_UNIT_QTY               :" + m_med.getPKG_UNIT_QTY());
             errOutput(Level.INFO, userId, "DLV_KEY_CD                 :" + m_med.getDLV_KEY_CD());
             errOutput(Level.INFO, userId, "PART_DLV_COUNT             :" + m_med.getPART_DLV_COUNT());
             errOutput(Level.INFO, userId, "DEPO_WH_CD                 :" + m_med.getDEPO_WH_CD());
             errOutput(Level.INFO, userId, "DLV_CD                     :" + m_med.getDLV_CD());
       */
            // *************************
            // �o�׎w���쐬
            // *************************
            try {
             // �o�׎w���֓o�^
             int rv = m_med.getT_SHIP_ODR().create();
            } catch (Exception e) {
             // �o�׎w���o�^�G���[
             e.printStackTrace();
             errMsg  = new ExpjMessage("KV02502");
             errNote = new ExpjMessage("ZZ01006", "T_SHIP_ODR Entry failed");
             errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
            }
       
            // *************************
            // �o�׎��э쐬
            // *************************
            try {
             // ��L�[�̔�
             if(m_med.getT_SHIP().read() != SUCCESS){
              throw new Exception();
             }else if(m_med.getT_SHIP().next() == false){
              throw new Exception();
             }
             if((m_med.getCTRL_NO() == null) || ("".equals(m_med.getCTRL_NO()))){
              throw new Exception();
             }
       
             // �o�׎��т֓o�^
             int rv = m_med.getT_SHIP().create();
            } catch (Exception e) {
             // �o�׎��ѓo�^�G���[
             e.printStackTrace();
             errMsg  = new ExpjMessage("KV02502");
             errNote = new ExpjMessage("ZZ01006", "T_SHIP Entry failed");
             errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
            }
       
            // *************************
            // ������э쐬
            // *************************
            try {
             // ��L�[�̔�
             if(m_med.getT_SALES().read() != SUCCESS){
              throw new Exception();
             }else if(m_med.getT_SALES().next() == false){
              throw new Exception();
             }
             if((m_med.getCTRL_NO() == null) || ("".equals(m_med.getCTRL_NO()))){
              throw new Exception();
             }
       /*
             errOutput(Level.INFO, userId, "CTRL_NO                    :" + m_med.getCTRL_NO());
             errOutput(Level.INFO, userId, "SHIP_ODR_NO                :" + m_med.getSHIP_ODR_NO());
             errOutput(Level.INFO, userId, "SLIP_CD                    :" + m_med.getSLIP_CD());
             errOutput(Level.INFO, userId, "ITEM_CD                    :" + m_med.getITEM_CD());
             errOutput(Level.INFO, userId, "CUST_ITEM_CD               :" + m_med.getCUST_ITEM_CD());
             errOutput(Level.INFO, userId, "CUST_ODR_CD                :" + m_med.getCUST_ODR_CD());
             errOutput(Level.INFO, userId, "CUST_CD                    :" + m_med.getCUST_CD());
             errOutput(Level.INFO, userId, "CUST_NAME                  :" + m_med.getCUST_NAME());
             errOutput(Level.INFO, userId, "CUST_CHRG_PSN_CD           :" + m_med.getCUST_CHRG_PSN_CD());
             errOutput(Level.INFO, userId, "USER_CD                    :" + m_med.getUSER_CD());
             errOutput(Level.INFO, userId, "DLV_LOC_CD                 :" + m_med.getDLV_LOC_CD());
             errOutput(Level.INFO, userId, "DEPO_WH_CD                 :" + m_med.getDEPO_WH_CD());
             errOutput(Level.INFO, userId, "IN_DATE                    :" + m_med.getIN_DATE());
             errOutput(Level.INFO, userId, "IN_QTY                     :" + m_med.getIN_QTY());
             errOutput(Level.INFO, userId, "UNIT_CD                    :" + m_med.getUNIT_CD());
             errOutput(Level.INFO, userId, "IN_UNIT_PRICE              :" + m_med.getIN_UNIT_PRICE());
             errOutput(Level.INFO, userId, "IN_AMOUNT                  :" + m_med.getIN_AMOUNT());
             errOutput(Level.INFO, userId, "IN_AMOUNT_EXCH_RATES       :" + m_med.getIN_AMOUNT_EXCH_RATES());
             errOutput(Level.INFO, userId, "CUR_CD                     :" + m_med.getCUR_CD());
             errOutput(Level.INFO, userId, "INSPC_ACPT_INFO_IF_CTRL_NO :" + m_med.getINSPC_ACPT_INFO_IF_CTRL_NO());
             errOutput(Level.INFO, userId, "DLV_CD                     :" + m_med.getDLV_CD());
             errOutput(Level.INFO, userId, "DLV_KEY_CD                 :" + m_med.getDLV_KEY_CD());
       
             errOutput(Level.INFO, userId, "CTRL_NO                        :" + m_med.getCTRL_NO());
             errOutput(Level.INFO, userId, "SHIP_ODR_NO                    :" + m_med.getSHIP_ODR_NO());
             errOutput(Level.INFO, userId, "SLIP_CD                        :" + m_med.getSLIP_CD());
             errOutput(Level.INFO, userId, "CUST_CD                        :" + m_med.getCUST_CD());
             errOutput(Level.INFO, userId, "ITEM_CD                        :" + m_med.getITEM_CD());
             errOutput(Level.INFO, userId, "ITEM_NAME                      :" + m_med.getITEM_NAME());
             errOutput(Level.INFO, userId, "CUST_ODR_CD                    :" + m_med.getCUST_ODR_CD());
             errOutput(Level.INFO, userId, "IN_DATE                        :" + m_med.getIN_DATE());
             errOutput(Level.INFO, userId, "SALES_DEPT_CD                  :" + m_med.getSALES_DEPT_CD());
             errOutput(Level.INFO, userId, "CUST_CHRG_PSN_CD               :" + m_med.getCUST_CHRG_PSN_CD());
             errOutput(Level.INFO, userId, "USER_CD                        :" + m_med.getUSER_CD());
             errOutput(Level.INFO, userId, "IN_QTY                         :" + m_med.getIN_QTY());
             errOutput(Level.INFO, userId, "IN_UNIT_PRICE                  :" + m_med.getIN_UNIT_PRICE());
             errOutput(Level.INFO, userId, "UNIT_CD                        :" + m_med.getUNIT_CD());
             errOutput(Level.INFO, userId, "IN_AMOUNT                      :" + m_med.getIN_AMOUNT());
             errOutput(Level.INFO, userId, "IN_AMOUNT_EXCH_RATES           :" + m_med.getIN_AMOUNT_EXCH_RATES());
             errOutput(Level.INFO, userId, "IN_DATE                        :" + m_med.getIN_DATE());
             errOutput(Level.INFO, userId, "IN_QTY                         :" + m_med.getIN_QTY());
             errOutput(Level.INFO, userId, "EXTERNAL_TAX_SALES_AMOUNT      :" + m_med.getEXTERNAL_TAX_SALES_AMOUNT());
             errOutput(Level.INFO, userId, "INTERNAL_TAX_SALES_AMOUNT      :" + m_med.getINTERNAL_TAX_SALES_AMOUNT());
             errOutput(Level.INFO, userId, "TAXFREE_SALES_AMOUNT           :" + m_med.getTAXFREE_SALES_AMOUNT());
             errOutput(Level.INFO, userId, "TAX_CREDIT_SALES_AMOUNT        :" + m_med.getTAX_CREDIT_SALES_AMOUNT());
             errOutput(Level.INFO, userId, "EXTERNAL_TAX_AMOUNT            :" + m_med.getEXTERNAL_TAX_AMOUNT());
             errOutput(Level.INFO, userId, "INTERNAL_TAX_AMOUNT            :" + m_med.getINTERNAL_TAX_AMOUNT());
             errOutput(Level.INFO, userId, "TAX_AMOUNT_1                   :" + m_med.getTAX_AMOUNT_1());
             errOutput(Level.INFO, userId, "TAX_AMOUNT_2                   :" + m_med.getTAX_AMOUNT_2());
             errOutput(Level.INFO, userId, "TAX_AMOUNT_3                   :" + m_med.getTAX_AMOUNT_3());
             errOutput(Level.INFO, userId, "OWN_CUR_TAXCREDIT_SALES_AMOUNT :" + m_med.getOWN_CUR_TAXCREDIT_SALES_AMOUNT());
             errOutput(Level.INFO, userId, "CUR_CD                         :" + m_med.getCUR_CD());
       */
       
             // ������т֓o�^
             int rv = m_med.getT_SALES().create();
            } catch (Exception e) {
             // ������ѓo�^�G���[
             e.printStackTrace();
             errMsg  = new ExpjMessage("KV02502");
             errNote = new ExpjMessage("ZZ01006", "T_SALES Entry failed");
             errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
            }
       
            // *************************
            // �ۊǋ�ʕi�ڍ݌ɍX�V
            // *************************
            try {
             // �ۊǋ�ʕi�ڍ݌ɂ̍X�V
             int rv = m_med.getT_ITEM_STOCK().update();
            } catch (Exception e) {
             // �ۊǋ�ʕi�ڍ݌ɍX�V�G���[
             e.printStackTrace();
             errMsg  = new ExpjMessage("KV02502");
             errNote = new ExpjMessage("ZZ01006", "T_ITEM_STOCK Update failed");
             errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
            }
       
            // *************************
            // ���o�ɔԍ��̔�
            // *************************
            // �R�l�N�V������n���āA�̔Ԃ̏���
            try {
             numbering = new Numbering(conn, Numbering.ISSUE_CD, userId, programId, plantCd);
             m_med.setRCV_ISSUE_CTRL_CD(numbering.getNo());
       //						errOutput(Level.INFO, userId, "���̔Ԕԍ�:" + m_med.getRCV_ISSUE_CTRL_CD());
       //						errOutput(Level.INFO, userId, "���̔Ԍ���:" + numbering.getResultStatus());
            }
            catch (Exception e) {
             errMsg  = new ExpjMessage("KV02502");
             errNote = new ExpjMessage("ZZ01006", "ISSUE_CD Numbering failed");
             errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
            }
            finally {
             numbering = null;
            }
       //					errOutput(Level.INFO, userId, "ISSUE_CD get success");
       
            // *************************
            // �ۊǋ�ʓ��o�ɍ쐬
            // *************************
            try {
             // �ۊǋ�ʓ��o�ɂ̓o�^
             int rv = m_med.getT_RCV_ISSUE().create();
            } catch (Exception e) {
             // �ۊǋ�ʓ��o�ɓo�^�G���[
             e.printStackTrace();
             errMsg  = new ExpjMessage("KV02502");
             errNote = new ExpjMessage("ZZ01006", "T_RCV_ISSUE Entry failed");
             errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
            }
       
            if (arInstallCnt > 0) {
             // *************************
             // ���|�Ǘ��A��
             // *************************
             try {
              // ���|�Ǘ��A�����i�̌Ăяo��
              ArIf arif = new ArIf(conn);
              arif.setParameter("9", userId, null, null, m_med.getSLIP_CD());
              String msgNo = arif.execute();
              if (!"0".equals(msgNo)) {
       //								errOutput(Level.INFO, userId, "MSG_NO:" + msgNo);
               errMsg  = new ExpjMessage(msgNo);
               errNote = new ExpjMessage("ZZ01006", "ArIf failed");
               errDataOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
               continue;
              }
             } catch(BatchAppException e){
              throw e;
             } catch (Exception e) {
              // ���|�Ǘ��A�����i�G���[
              e.printStackTrace();
              errMsg  = new ExpjMessage("KV02502");
              errNote = new ExpjMessage("ZZ01006", "ArIf failed");
              errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
             }
            }
       
            try {
             //=======================================
             // �a������I/F�ɏ����ς݂��Z�b�g
             //=======================================
             // �����敪��"1"�i�����ς݁j���Z�b�g
             m_med.setSYSTEM_PROC_TYP("1");
             int rv = m_med.getT_INSPC_ACPT_INFO_IF_1().update();
            } catch (Exception e) {
             // �a������I/F�X�V�G���[
             e.printStackTrace();
             errMsg  = new ExpjMessage("KV02502");
             errNote = new ExpjMessage("ZZ01006", "T_INSPC_ACPT_INFO_IF update failed");
             errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
            }
       
            try {
             conn.commit();
            } catch(Exception e){
             try {
              conn.rollback();
             } catch(Exception ee){
              errMsg  = new ExpjMessage("ZZ01006", "rollback failed at Step2");
              errNote = null;
              errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
             }
             errMsg  = new ExpjMessage("ZZ01006", "commit failed at Step2");
             errNote = null;
             errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
            }
       
            try {
             conn.commit();
            } catch(Exception e){
             try {
              conn.rollback();
             } catch(Exception ee){
              errMsg  = new ExpjMessage("ZZ01006", "rollback failed at Step2 at:[ " + inCntLine + " ]");
              errNote = null;
              errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
             }
             errMsg  = new ExpjMessage("ZZ01006", "commit failed at Step2 at:[ " + inCntLine + " ]");
             errNote = null;
             errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
            }
           }
       
           // �Ɩ����O��STEP2�����I�����b�Z�[�W�̓o�^�B
           errMsg  = new ExpjMessage("KV02512");
           errNote = new ExpjMessage("ZZ01006", "Entry record count:[ " + inCntLine + " ]");
           errOutput(Level.WARNING, userId, plantCd, programId, errMsg, errNote);
       
          } catch(BatchAppException e){
           throw e;
          } catch(Exception e){
           e.printStackTrace();
           errMsg  = new ExpjMessage("KV02502");
           errNote = new ExpjMessage("ZZ01006", "Process abort at Step2 at:[ " + inCntLine + " ]");
           errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
          }
       
          try {
           conn.commit();
          } catch(Exception e){
           try {
            conn.rollback();
           } catch(Exception ee){
            errMsg  = new ExpjMessage("ZZ01006", "rollback failed after Step2");
            errNote = null;
            errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
           }
           errMsg  = new ExpjMessage("ZZ01006", "commit failed after Step2");
           errNote = null;
           errOutput(Level.SEVERE, userId, plantCd, programId, errMsg, errNote);
          }
       
          return BREAK;
         }
         catch(BatchAppException bae){
          throw bae;
         }
         catch(Exception e){
          try {
           conn.rollback();
          }
          catch (Exception ee) {
          }
         }
         finally {
          try {
           if ( lockCancelKey != 0 ) {
            // �Ɩ����b�N����
            errOutput(Level.INFO, userId, "Business Lock Release");
            Lock.doUnLock(programId, lockCancelKey);
           }
           try {
            conn.commit();
           }
           catch(Exception e) {
           }
          }
          catch(Exception e) {
           errMsg  = new ExpjMessage("ZZ01004");
           errNote = null;
           errOutput(Level.WARNING, userId, plantCd, programId, errMsg, errNote);
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
		public medKV0020B005 m_med=null;

		/**
		 * �R���e�i�N���X�C���X�^���X
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medKV0020B005 med) throws BatchAppException
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
