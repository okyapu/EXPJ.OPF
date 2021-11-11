/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0030/src/com/nec/jp/orteus/metamorBase/AC0030/AC0030020Control.java,v $
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
 * EXPJ    (2005/01/31),SRCGEN�Ή��A���[�c�[���A�g��KIND�Ή��AgetFlashTreeXML��Linux�Ή��A���b�Z�[�W�̑�����Ή�(MessageStruct)
 * EXPJ    (2004/10/14),user_implement_code_header ���̃��[�U�R�[�f�B���O��L���ɂ���
 * EXPJ    (2004/08/02),�a��������Ή�
 * EXPJ    (2004/07/14),�T�[�o������_�Ή�
 * EXPJ    (2004/06/28),����p�̃��W�b�N��啝����
 * EXPJ    (2004/06/24),FLASH�A�g���\�b�h�ǉ�
 * EXPJ    (2004/04/15),������̃v�����^���A�t�H���_�E�t�@�C�����̋󔒑Ή�
 * EXPJ    (2004/04/09),���\�b�h���C�� "getLabel"->"getlabel"
 * EXPJ    (2004/04/06),Print���\�b�h�̍Č����E�I���s����Ή�
 * EXPJ    (2004/04/05),���\�b�h�R�����g�́u* @param �Ȃ��v�����ׂč폜
 * EXPJ    (2004/04/01),user_imprement���̃R�����g�ɕύX���Ă���conn.beginTransWeb();��user_imprement�O�̕K�{�����Ƃ��ĕ���
 * EXPJ    (2004/03/31),Print���\�b�h��null�����o�͑Ή�
 * EXPJ    (2004/03/30),�C���|�[�g���ꕔ�C��(print���폜,exception��ǉ��j
 * EXPJ    (2004/03/20),���r���[���ʂ𔽉f
 * EXPJ    (2004/03/13),���M���{�^���A�N�Z�T�ǉ�
 * EXPJ    (2004/03/09),Print���\�b�h�̏C���s�v�ȕ��������[�U�L�q���̊O�Ɉړ�
 * EXPJ    (2004/03/04),���b�Z�[�W�n���i�����Ή�
 * EXPJ    (2004/03/03),�������C��
 *                     ,FLASH��ʗp���\�b�hgetReadStsString��ǉ�
 *                     ,���\�b�h�R�����g�́u* @return �Ȃ��v�����ׂč폜
 *                     ,CsvOut���\�b�h�̏�����ǉ�
 *                     ,Print���\�b�h�̏�����EXPLANNER/J�p�ɉ���
 * EXPJ    (2004/03/02),EXPLANNER/J�p�ɉ���
 * 4.0.1.3 (2004/12/02),���M�L�[�E��M�L�[��ݒ肷�郁�\�b�h��V�� (setOrMsgKey, getOrMsgKey)
 * 4.0.1.2 (2004/11/15),���[�c�[���A�g��KIND�Ή�
 * 4.0.1.1 (2004/06/16),���[�c�[���A�g��event-option�Ή�
 * 4.0.1.0 (2004/08/02),TRUST-V�v���W�F�N�g�̃t�B�[�h�o�b�N�i�y�[�W���䕔�i�Ή��j
 * 4.0.0.9 (2004/05/24),�_�E�����[�h�Ή���ǉ��Bevent-type=print,download����������ꍇ�ɑΉ�
 * 4.0.0.8 (2004/05/21),connect()�̏��������ǉ�
 * 4.0.0.7 (2004/04/19),event-type�Ή�
 * 4.0.0.6 (2004/04/12),FlashTree�p���\�b�h�Ɉ����ǉ��A���[�o�̓I�u�W�F�N�gNULL��������ύX
 * 4.0.0.5 (2004/02/23),���[�p�A�N�Z�T���\�b�h�ǉ�
 * 4.0.0.4 (2004/02/17),FlashTree�Ή���ǉ�
 * 4.0.0.3 (2004/01/23),���[�c�[���A�g�p�R�[�h��ǉ�
 * 4.0.0.2 (2003/09/08),ManageContainer�̎擾���@���C��
 * 4.0.0.1 (2003/06/05),javadoc�R�����g�G���[�C��
 * 4.0.0.0 (2003/04/23),�N���X���W�����Ή�
 * 3.0.0.0 (2003/03/19),mgrContainer�R���X�g���N�^�C��
 * 2.1.0.0 (2002/12/17),User OwnCode�����M���O�ǉ�,LoggingPackage�C��
 * 2.0.0.1 (2002/07/05),Connection�Ή�
 * 2.0.0.0 (2002/05/27),new foundation�Ή�
 *
 */

package com.nec.jp.orteus.metamorBase.AC0030;

import com.nec.jp.orteus.metamorBase.AC0030.*;
import com.nec.jp.orteus.util.*;
import com.nec.jp.orteus.msg.util.*;
import com.nec.jp.orteus.msg.core.*;

import com.nec.jp.orteus.xaf.foundation.*;
import com.nec.jp.orteus.xaf.util.*;
import com.nec.jp.orteus.xaf.wa.*;

import com.nec.jp.orteus.util.logging.*;

import java.rmi.RemoteException;
import java.util.Date;
import java.util.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.lang.reflect.*;

import com.nec.jp.orteus.expj.util.*;
import com.nec.jp.orteus.expj.exception.*;
import com.nec.jp.orteus.expj.combobox.*;
import com.nec.jp.orteus.expj.systemlog.*;
import com.nec.jp.orteus.expj.businesslock.*;
import com.nec.jp.orteus.expj.file.*;
import com.nec.jp.orteus.expj.csv.*;
import com.nec.jp.orteus.expj.util.MessageStruct;

//{{user_implement_code_import
 // TODO: ������import�p�b�P�[�W���L�q���Ă�������
// insert Original Code ===================================================
import java.io.File;
import java.io.IOException;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessage;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
import java.io.*;
//=========================================================================
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AC0030020Control
{

	//////////////////////////////
	// �A�N�Z�T���\�b�h�����`���܂�
	// Business�I�u�W�F�N�g�A�N�Z�T���\�b�h
	private Business business;
	public Business getBusiness() { return this.business; }
	public void setBusiness( Business obj ) { this.business = obj; }

	/** �V�X�e���g�p�̃��[�U�R�[�h */
	protected String sysUSER_CD;
	public void setsysUSER_CD(String name) { this.sysUSER_CD = name; };
	public String getsysUSER_CD() { return this.sysUSER_CD; };

	/** �V�X�e���g�p�̍H��R�[�h */
	protected String sysPLANT_CD;
	public void setsysPLANT_CD(String name) { this.sysPLANT_CD = name; };
	public String getsysPLANT_CD() { return this.sysPLANT_CD; };

	/** �V�X�e���g�p�̃��[�U�� */
	protected String sysUSER_NAME;
	public void setsysUSER_NAME(String name) { this.sysUSER_NAME = name; };
	public String getsysUSER_NAME() { return this.sysUSER_NAME; };

	/** �V�X�e���g�p�̍H�ꖼ */
	protected String sysPLANT_NAME;
	public void setsysPLANT_NAME(String name) { this.sysPLANT_NAME = name; };
	public String getsysPLANT_NAME() { return this.sysPLANT_NAME; };

	/** ��ʑJ�ڃt���O */
	private boolean screenMoveFlg;
	public void setScreenMoveFlg(boolean flg){ this.screenMoveFlg = flg; };
	public boolean isScreenMove(){ return this.screenMoveFlg; };

	/** ���M�����ID */
	private String submitScreen;
	public void setScreenId(String ScreenId){ this.submitScreen = ScreenId; };
	public String getScreenId(){ return this.submitScreen; };

	/** ���M���v���O����ID */
	private String submitProgram;
	public void setProgramId(String ProgramId){ this.submitProgram = ProgramId; };
	public String getProgramId(){ return this.submitProgram; };

	/** ���M���{�^�� */
	private String submitButton;
	public void setButton(String Button){ this.submitButton = Button; };
	public String getButton(){ return this.submitButton; };

	/** �����{�^����� */
	private String submitButtonType;
	public void setButtonType(String ButtonType){ this.submitButtonType = ButtonType; };
	public String getButtonType(){ return this.submitButtonType; };

	/** �V�K��ʃt���O */
	private boolean newScreenFlg;
	public void setNewScreenFlg(boolean flg){ this.newScreenFlg = flg; };
	public boolean isNewScreen(){ return this.newScreenFlg; };

	/** �V�K�f�[�^�t���O */
	private boolean newDataFlg;
	public void setNewDataFlg(boolean flg){ this.newDataFlg = flg; };
	public boolean isNewData(){ return this.newDataFlg; };


	/** ��Ԑ��� */
	private int readStatus = INITIAL;
		/** �Ǎ����s */
		static final public int ERROR = -1;
		/** ������� */
		static final public int INITIAL = 0;
		/** �O���Ǎ� */
		static final public int NOT_FOUND = 1;
		/** �ő�s���I�[�o�[ */
		static final public int TOO_MANY = 2;
		/** �Ǎ����� */
		static final public int NORMAL = 3;
	public void setReadStatus(int ReadStatus) { readStatus = ReadStatus; }
	public int getReadStatus() { return readStatus; }
	public String getReadStatusString() {
		if (this.readStatus == NORMAL) {
			return "NORMAL"; 
		}
		else if (this.readStatus == TOO_MANY) {
			return "TOO_MANY"; 
		}
		else if (this.readStatus == NOT_FOUND) {
			return "NOT_FOUND"; 
		}
		else if (this.readStatus == ERROR) {
			return "ERROR"; 
		}
		else {
			return "INITIAL"; 
		}
	}
	public boolean isError(){ return (this.readStatus == ERROR); }
	public boolean isInitialized() { return (this.readStatus != ERROR); }
	public boolean isSelected() { return (this.readStatus > NOT_FOUND); }
	public boolean hasRecord() { return (this.readStatus > INITIAL); }
	public boolean isShown() { return (this.readStatus > TOO_MANY); }
	public boolean canAppend() { return ((this.readStatus == NOT_FOUND) || (this.readStatus == NORMAL) ); }

	/** ���[�o�̓^�C�v */
	private String pdfOutputType;
	public void setPdfOutputType(String PdfOutputType){ this.pdfOutputType = PdfOutputType; };
	public String getPdfOutputType(){ return this.pdfOutputType; };

	/** ���[�o�͐� */
	private String pdfOutputPrinter;
	public void setPdfOutputPrinter(String PdfOutputPrinter){ this.pdfOutputPrinter = PdfOutputPrinter; };
	public String getPdfOutputPrinter(){ return this.pdfOutputPrinter; };

	/** ���[�o�̓��X�g�p�^�[�� */
	private String pdfOutputListPattern;
	public void setPdfOutputListPattern(String PdfOutputListPattern){ this.pdfOutputListPattern = PdfOutputListPattern; };
	public String getPdfOutputListPattern(){ return this.pdfOutputListPattern; };

	/** ���[�o�̓��X�g�s */
	private String[] pdfOutputListLine;
	public void setPdfOutputListLine(String[] PdfOutputListLine){ this.pdfOutputListLine = PdfOutputListLine; };
	public String[] getPdfOutputListLine(){ return this.pdfOutputListLine; };

	protected SystemLog sysLog = null;
	protected boolean logInit = false;

	/** ���b�Z�[�W�X�g���N�g */
	private MessageStruct msgStruct = null;
	public MessageStruct getMsgStruct(){ return this.msgStruct;}

	/**
	 * ���b�Z�[�W�X�g���N�g�쐬�i������Ή��j
	 */
	public void createMsgStruct() {
		msgStruct = new MessageStruct(getsysUSER_CD(), false);
	}

	protected ScreenParam sp = null;

	private BusinessLock bLock = null;
	private String cancelId = "0";

	public boolean doUnBusinessLock() {
		//�����ł�Exception�����ݏ���
		boolean doUnLock = false;
		try {
			bLock = new BusinessLock(conn, getsysUSER_CD(), getsysPLANT_CD());
			doUnLock = bLock.doUnLock(this.sp.getProcId(),Integer.parseInt(cancelId));
			if(!doUnLock){
				//�Ɩ����b�N�������s
				throw new ExpjException("ZZ01004");
			}
		} catch ( Exception e ) {
			sysLog.severe("ZZ01004",getsysUSER_CD());//���b�N�������s
		}
		return doUnLock;
	}
	//{{user_implement_code_main
        // �f�t�H���g�A�N�Z�T���\�b�h
        protected List list;											// ���ʃ��X�g�̃C���X�^���X
        public List getList() { return this.list; }						// ���X�g��Ԃ��܂��B
        public void setList(List listname) { this.list = listname; }	// ���X�g���Z�b�g���܂��B
        public int getListsize() {										// ���X�g�^�̃T�C�Y��Ԃ��܂��B
         int nret = 0;
         if( this.list != null ) {nret = this.list.size();}
         return nret;
        }
        public Object getListvalue(int x) { return this.list.get(x); }	// ���X�g�̒l�i���f�B�G�[�^�j��Ԃ��܂��B
       
        public AC0030020Struct getStruct() { return this.struct; }	// Struct�̒l�i���f�B�G�[�^�j��Ԃ��܂��B
       
        // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
        // �P�[�`�����ǂݏo���p
        protected List list1;											// ���ʃ��X�g�̃C���X�^���X
        public List getList1() { return this.list1; }					// ���X�g��Ԃ��܂��B
        public void setList1(List listname) { this.list1 = listname; }	// ���X�g���Z�b�g���܂��B
        public int getList1size() {										// ���X�g�^�̃T�C�Y��Ԃ��܂��B
         int nret = 0;
         if( this.list1 != null ) {nret = this.list1.size();}
         return nret;
        }
        // ���X�g�̒l�i���f�B�G�[�^�j��Ԃ��܂��B
        public AC0030020Struct getList1value(int x) { return (AC0030020Struct)(this.list1.get(x)); }
       
        // �ꗗ�`�����ǂݏo���p
        protected List list2;											// ���ʃ��X�g�̃C���X�^���X
        public List getList2() { return this.list2; }					// ���X�g��Ԃ��܂��B
        public void setList2(List listname) { this.list2 = listname; }	// ���X�g���Z�b�g���܂��B
        public int getList2size() {										// ���X�g�^�̃T�C�Y��Ԃ��܂��B
         int nret = 0;
         if( this.list2 != null ) {nret = this.list2.size();}
         return nret;
        }
        // ���X�g�̒l�i���f�B�G�[�^�j��Ԃ��܂��B
        public AC0030020Struct getList2value(int x) { return (AC0030020Struct)(this.list2.get(x)); }
       
        private boolean closeFlag = false;
        public boolean isCloseFlag(){
         return this.closeFlag;
        }
       
        /**
				* �����̐���
				* @param ���� 
				*/
				private String formatHM(String inTime , String inFlag){
						
						if(null == inTime || "".equals(inTime)){
							if("0".equals(inFlag)){
								return "23:59" ;
							}else{
								return inTime;
							}
						}
						
						if(inTime.length() < 3 || inTime.length() > 4){
							if("0".equals(inFlag)){
								return "23:59" ;
							}else{
								return inTime;
							}
						}
						
						if(inTime.length() ==  3 ){
							if("0".equals(inFlag)){
								return "0" + inTime.substring(0,1) + ":" + inTime.substring(1);
							}else{
								return "0" + inTime;
							}
						}
						
						if(inTime.length() ==  4 ){
							if("0".equals(inFlag)){
								return inTime.substring(0,2) + ":" + inTime.substring(2);
							}else{
								return inTime;
							}
						}
			
						return inTime;
				}	
				
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlNone() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0030");
		logger.entering("AC0030020Control"+":USER="+struct.getsUser_ID(),"controlNone");
			//{{user_implement_dev:<controlNone>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                 sysLog.setConnection(conn);
                 this.msgStruct.clearAll();
              // insert Original Code ===================================================
                // ���ڂ��N���A����i�����l���Z�b�g�j
                struct.settxtJobOdrCd("");       // ����
                struct.setrdoOutsideTyp1("true");  // ���O��敪�i1:����̂݁j
                struct.setrdoOutsideTyp2(null);    // ���O��敪�i1:����̂݁j
                struct.setrdoOutsideTyp3(null);    // ���O��敪�i1:����̂݁j
                struct.setrdoEntry1Typ1("true");   // �G���g���敪�P�i1:��z������j
                struct.setrdoEntry1Typ2(null);     // �G���g���敪�P�i1:��z������j
                struct.setrdoEntry1Typ3(null);     // �G���g���敪�P�i1:��z������j
                struct.settxtEntryDate("");      // �G���g�����t�i�\���p���ځj
                struct.settxtEntryTime("");      // �G���g�����t�i�\���p���ځj
              //=========================================================================
                //}}user_implement_dev:<controlNone>
		logger.exiting("AC0030020Control"+":USER="+struct.getsUser_ID(),"controlNone");

		return;
	}

	/**
	 * ���s�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlExecute() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0030");
		logger.entering("AC0030020Control"+":USER="+struct.getsUser_ID(),"controlExecute");
			//{{user_implement_dev:<controlExecute>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                try {
                 sysLog.setConnection(conn);
                 this.msgStruct.clearAll();
              
              // insert Original Code ===================================================
                 // �o�b�`�����N���X��main����
                 String batchProcessingTyp = null; // �o�b�`�����敪
                 String userId = null;			  // ���[�UID
                 String plantCd = null;			  // �H��R�[�h
                 String managementTyp = null;	  // �Ǘ��敪
                 String outsideTyp = null;		  // ���O��敪
                 String jobOdrCd = null;			  // ����
                 String jobOdrDetailNo= null;	  // ���Ԏ}�ԁiSI�Ή����� metamorBase�ł͖��g�p�j
                 String entry1Typ = null;		  // �G���g���敪�P
                 String entry2Typ = null;		  // �G���g���敪�Q
                 String entryDate = null;		  // �G���g�����t
                 String entryTime = null;		  // �G���g�����t
                               
                 // �Œ�l���Z�b�g
                 batchProcessingTyp = "2";		  // 2: �����^�]���Ȃ��i��ԃo�b�`�Ȃ��j
                 managementTyp = "2";			  // 2: ����
              
                 // ���[�UID�A�H��R�[�h���擾����
                 userId = getsysUSER_CD();
                 plantCd = getsysPLANT_CD();
              
                 // ��ʂ��瑗�M���ꂽ�����擾����
                 //outsideTyp = struct.getrdoOutsideTyp().toString();  // ���O��敪
                 if ("true".equals(struct.getrdoOutsideTyp1())) {
                  outsideTyp = "1";
                 } else if ("true".equals(struct.getrdoOutsideTyp2())) {
                  outsideTyp = "2";
                 } else {
                  outsideTyp = "9";
                 }
              
                 jobOdrCd = struct.gettxtJobOdrCd();                 // ����
                 if ((jobOdrCd == null) || jobOdrCd.equals("")) {
                  jobOdrCd = "jobOdrCd";  // �_�~�[��������Z�b�g
                 }
              
                 //entry1Typ = struct.getrdoEntry1Typ().toString();    // �G���g���敪�P
                 if ("true".equals(struct.getrdoEntry1Typ1())) {
                  entry1Typ = "1";
                 } else if ("true".equals(struct.getrdoEntry1Typ2())) {
                  entry1Typ = "2";
                 } else {
                  entry1Typ = "3";
                 }
              
                 //entry2Typ = struct.getrdoEntry2Typ().toString();    // �G���g���敪�Q
                 entry2Typ = "1";
              
                 //entryDate = struct.gethdnEntryDate();               // �G���g�����t
                 entryDate = struct.gettxtEntryDate();                 // �G���g�����t
							   entryTime = formatHM(struct.gettxtEntryTime(),"0");
							   struct.settxtEntryTime(formatHM(struct.gettxtEntryTime(),"1"));
								 entryDate = entryDate + entryTime;
								               
                 // ���g�p���ڂɃ_�~�[��������Z�b�g�i���̒l�͎g�p����Ȃ��j
              
                 jobOdrDetailNo= "jobOdrDetailNo";  // ���Ԏ}�ԁiSI�Ή����ځj
              
                 // �\���p�t�B�[���h"txtEntryDate"�ɁA���M�f�[�^�p�t�B�[���h"hdnEntryDate"��
                 // �l���R�s�[����
//                 struct.settxtEntryDate(entryDate);
              
                 // �o�b�`���������s���� -------------------------------------------
                 ResourceBundle bundle = SystemConfig.getBundle();
                 String javaPath = SystemConfig.getProperty("JAVA_PATH", bundle);
                 if(javaPath == null){
              //				struct.setMESSAGE_ERR("�V�X�e������l�t�@�C������̏��擾�Ɏ��s���܂���(�i�u�l�p�X)");
                  ExpjMessage emsg = new ExpjMessage("ZZ09010");
              //				msgStruct.getError().add(emsg.getMessage());
                  msgStruct.addError(emsg);
                 }
                 String ClassPath = SystemConfig.getProperty("CLASS_PATH", bundle);
                 if(ClassPath == null){
              //				struct.setMESSAGE_ERR("�V�X�e������l�t�@�C������̏��擾�Ɏ��s���܂���(�N���X�p�X)");
                  ExpjMessage emsg = new ExpjMessage("ZZ09012");
              //				msgStruct.getError().add(emsg.getMessage());
                  msgStruct.addError(emsg);
                 }
                 String batchPath = SystemConfig.getProperty("BATCH_PATH", bundle);
                 if(batchPath == null){
              //				struct.setMESSAGE_ERR("�V�X�e������l�t�@�C������̏��擾�Ɏ��s���܂���(�o�b�`�N���ݒ�)");
                  ExpjMessage emsg = new ExpjMessage("ZZ09011");
              //				msgStruct.getError().add(emsg.getMessage());
                  msgStruct.addError(emsg);
                 }
              
                 try {
//                  String cmd = "";
//                  cmd = cmd + javaPath; // �i�u�l
//                  cmd = cmd + " -cp ";
//                  cmd = cmd + ClassPath; //Java ClassPath
//                  cmd = cmd + " -Dcom.nec.jp.orteus.util.logging.config.file=";
//                  cmd = cmd + batchPath; // D:/OrteusStudio/lib/logging.properties"; // �N���ݒ�
//                  cmd = cmd + " " + "com.nec.jp.orteus.metamorBase.AC0020.AC0020B001.mainAC0020B001"; // �Ăяo����N���X
//                  cmd = cmd + " \"" + batchProcessingTyp + "\""; // �o�b�`�����敪
//                  cmd = cmd + " \"" + userId + "\"";			  // ���[�UID
//                  cmd = cmd + " \"" + plantCd + "\"";			  // �H��R�[�h
//                  cmd = cmd + " \"" + managementTyp + "\"";	  // �Ǘ��敪
//                  cmd = cmd + " \"" + outsideTyp + "\"";		  // ���O��敪
//                  cmd = cmd + " \"" + jobOdrCd + "\"";			  // ����
//                  cmd = cmd + " \"" + jobOdrDetailNo + "\"";	  // ���Ԏ}��
//                  cmd = cmd + " \"" + entry1Typ + "\"";		  // �G���g���敪�P
//                  cmd = cmd + " \"" + entry2Typ + "\"";		  // �G���g���敪�Q
//                  cmd = cmd + " \"" + entryDate + "\"";		  // �G���g�����t
//             
//              
//         
//                  Runtime runtime = Runtime.getRuntime();
//                  Process p = runtime.exec(cmd);
              
                  List buffer = new ArrayList();
                  buffer.add(javaPath);            // �i�u�l
                  buffer.add("-cp");
                  buffer.add(ClassPath);          // Java ClassPath
                  buffer.add("-Dcom.nec.jp.orteus.util.logging.config.file="+batchPath); // �N���ݒ�
                  buffer.add("com.nec.jp.orteus.metamorBase.AC0020.AC0020B001.mainAC0020B001"); // �Ăяo����N���X
                  buffer.add(batchProcessingTyp);             // �o�b�`�����敪
                  buffer.add(userId);                         // ���[�UID
                  buffer.add(plantCd);                        // �H��R�[�h
                  buffer.add(managementTyp);                  // �Ǘ��敪
                  buffer.add(outsideTyp);                     // ���O��敪
                  buffer.add(jobOdrCd);                       // ����
                  buffer.add(jobOdrDetailNo);                 // ���Ԏ}��
                  buffer.add(entry1Typ);                      // �G���g���敪�P
                  buffer.add(entry2Typ);                      // �G���g���敪�Q
                  buffer.add(entryDate);                      // �G���g�����t

                  // �o�b�`�������s
                  Runtime runtime = Runtime.getRuntime();
                  runtime.exec((String[])buffer.toArray(new String[buffer.size()]));
                 } catch (IOException e) {
                 // �o�b�`�Ăяo�����s�̏ꍇ�A��ʃ��b�Z�[�W��\������B
                  ExpjMessage emsg = new ExpjMessage("ZZ09014", new String[0]);
              //				msgStruct.getError().add(emsg.getMessage());
                  msgStruct.addError(emsg);
                  throw e;
                 }
            
                 // �o�b�`�Ăяo�������̏ꍇ�A��ʃ��b�Z�[�W��\������B
                 ExpjMessage emsg = new ExpjMessage("ZZ09013", new String[0]);
              //			msgStruct.getInfo().add(emsg.getMessage());
                 msgStruct.addInfo(emsg);
                } catch (Exception e) {
                 AlarmMessageException ame = null;
                 if (e instanceof AlarmMessageException){
                  ame = (AlarmMessageException)e;
                  ame.next();
                  sysLog.severe("ZZ01006",this.sysUSER_CD,ame.getMessage());//�G���[�ڍ�
                  ame.resetCurrent();
                 } else {
                  ame = new AlarmMessageException("ZZ01106",new String[0]);
                  sysLog.severe("ZZ01106",this.sysUSER_CD);//�v���I�G���[
                  sysLog.severe("ZZ01006",this.sysUSER_CD,e.toString());//�G���[�ڍ�
                 }
                 throw ame;
              
                } finally {
                 if (conn != null){
                  try {
                   conn.rollback();
                  } catch (FoundationException fe){
                   AlarmMessageException ame = new AlarmMessageException("ZZ01106",new String[0]);
                   sysLog.severe("ZZ01106",this.sysUSER_CD);//�v���I�G���[
                   sysLog.severe("ZZ01006",this.sysUSER_CD,fe.toString());//�G���[�ڍ�
                   throw ame;
                  }
                 }
                }
              
                // �o�b�`���������s���� �I���-----------------------------------
              
              //=========================================================================
              
                //}}user_implement_dev:<controlExecute>
		logger.exiting("AC0030020Control"+":USER="+struct.getsUser_ID(),"controlExecute");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0030");
		logger.entering("AC0030020Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                 this.msgStruct.clearAll();
                 struct.setrdoOutsideTyp1("true");
                 struct.setrdoEntry1Typ1("true");
                //}}user_implement_dev:<controlClear>
		logger.exiting("AC0030020Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0030");
		logger.entering("AC0030020Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("AC0030020Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0030");
		logger.entering("AC0030020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AC0030020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0030");
		logger.entering("AC0030020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
              
              //=========================================================================
                boolean logInit = false;
                try{
                 conn.beginTransWeb();
              
                 this.closeFlag = false;
                 this.sp = new ScreenParam(this.getClass());
                 this.msgStruct.clearAll();
                 struct.setrdoOutsideTyp1("true");
                 struct.setrdoEntry1Typ1("true");
              
                 sysLog = new SystemLog();
                 logInit = sysLog.init(this.sp.getLogId());
                 if(!logInit){
                  //�V�X�e�����O�̏������Ɏ��s���܂���
                  throw new AlarmMessageException("ZZ01005",new String[0]);
                 }
                 sysLog.setConnection(conn);
              
                 //��ʂ�rl���ڎw��N���̋֎~
                 try{
                  if(ScreenPermission.isUseful(conn, this.sysUSER_CD, this.sp.getProcId()) == false) {
                   throw new Exception();
                  }
                 }catch(Exception e){
                  //���̋@�\�̎g�p����������܂���B
                  throw new AlarmMessageException("ZZ01002",new String[0]);
                 }
              
                 //���b�N����
              //			this.doUnBusinessLock();
              
                 // �H��R�[�h�̎擾
                 String plantCd = getsysPLANT_CD();
                 struct.setplantCd(plantCd);
              
                 // �Ɩ��^�p����ǂݍ��݁Astruct�ɕێ�������
                 list = entity.mreadSysDateCtrl.read(conn, struct);
                 if(list == null || list.size() != 1){
                  //�Ɩ����t��񂪖���/������
                              //�f�[�^�����݂��Ȃ�
                  struct.sethdnBusinessOprDate(null);
                              ExpjMessage emsg = new ExpjMessage( "KR00017" );
                              msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
                              sysLog.warning(emsg, this.sysUSER_CD); //�G���[���e
                 }else{
                  AC0030020Struct wStruct = (AC0030020Struct) list.get(0);
                  struct.sethdnBusinessOprDate( wStruct.gethdnBusinessOprDate());
                 }
              
              /*
                 bLock = new BusinessLock(conn,this.struct.getsUser_ID(),this.sysPLANT_CD);
                 int id = bLock.doLock(this.sp.getProcId());
                 this.cancelId = "" + id;
                 if(id == -1){
                  //�Ɩ����b�N����Ă���
                  throw new AlarmMessageException("ZZ01001",new String[0]);
                 }
              */
              
									// �V�X�e���p�����[�^�iTIME_CTRL�j�擾
									AC0030020Struct TIME_CTRLStruct = new AC0030020Struct();
									List TIME_CTRLList = entity.mreadTIME_CTRL.read(conn, TIME_CTRLStruct);
									if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
										TIME_CTRLStruct = (AC0030020Struct)TIME_CTRLList.get(0);
										struct.setTIME_CTRL(TIME_CTRLStruct.getTIME_CTRL());
									}else{
										struct.setTIME_CTRL("false");
									} 
									              
                 conn.commit();
                } catch(SQLException e) {
                 e.printStackTrace();
                 // �G���[�������L�q���Ă��������B
                 setReadStatus(ERROR);
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
                 ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
                 throw ee;
                }catch(Exception e){
                 AlarmMessageException ame = null;
                 if(e instanceof AlarmMessageException){
                  ame = (AlarmMessageException)e;
                  ame.next();
                  if(logInit){
                   ExpjMessage emsg = new ExpjMessage();
                   emsg.setCode(ame.getCode());
                   emsg.setValue(ame.getValue());
                   sysLog.severe("ZZ01006",
                		   this.sysUSER_CD,emsg.getMessage(CoreTools.getLocale(this.sysUSER_CD)));//�G���[�ڍ�
                  }
                  ame.resetCurrent();
                 }else{
                  ame = new AlarmMessageException("ZZ01106",new String[0]);
                  if(logInit){
                   sysLog.severe("ZZ01106",this.sysUSER_CD);//�v���I�G���[
                   sysLog.severe("ZZ01006",this.sysUSER_CD,e.toString());//�G���[�ڍ�
                  }
                 }
                 throw ame;
                }finally{
                 if(conn != null){
                  try{
                   conn.rollback();
                  }catch(FoundationException fe){
                   AlarmMessageException ame = new AlarmMessageException("ZZ01106",new String[0]);
                   if(logInit){
                    sysLog.severe("ZZ01106",this.sysUSER_CD);//�v���I�G���[
                    sysLog.severe("ZZ01006",this.sysUSER_CD,fe.toString());//�G���[�ڍ�
                   }
                   throw ame;
                  }
                 }
                }
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AC0030020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0030");
		logger.entering("AC0030020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

		this.msgStruct.clearAll();
		setNewDataFlg(true);
		this.sp = new ScreenParam(this.getClass());

		if (sysLog == null ) {
			sysLog = new SystemLog();
			logInit = sysLog.init(this.sp.getLogId());
			if(!logInit){
				//�V�X�e�����O�̏������Ɏ��s���܂���
				ExpjException ee = new ExpjException("ZZ01005");
				throw ee;
			}
		}

//		if(logInit){
//			sysLog.setConnection(conn);
//		}

		//���URL���ڎw��N���̋֎~
		try{
			if(ScreenPermission.isUseful(conn, getsysUSER_CD(), this.sp.getProcId()) == false) {
				throw new Exception();
			}
		}catch(Exception e){
			//���̋@�\�̎g�p����������܂���B
			ExpjException ee = new ExpjException(e, "ZZ01002");
			throw ee;
		}

		if( !( "initial".equals(button) ) && ( "1".equals(getButtonType()) ) ) {
			//�Ɩ����b�N���s����
			bLock = new BusinessLock(conn,getsysUSER_CD(),getsysPLANT_CD());
			int id = bLock.doLock(this.sp.getProcId());
			this.cancelId = "" + id;
			if(id == -1){
				//�Ɩ����b�N����Ă���
				ExpjMessage emsg = new ExpjMessage("ZZ01001");
				msgStruct.addError(emsg);
				sysLog.warning(emsg, getsysUSER_CD());
				List messageParameter = bLock.getLockingInfo();
				if(messageParameter != null) {
					int parameterSize = messageParameter.size();
					for(int i = 0; i < parameterSize; i++ ) {
						emsg = new ExpjMessage("ZZ01007", (String[])messageParameter.get(i));
						msgStruct.addError(emsg);
						sysLog.warning(emsg, getsysUSER_CD());
					}
				}
				BusinessLockException ble = new BusinessLockException();
				throw ble;
			}
		}

			conn.beginTransWeb();

		//{{user_implement_dev:<controlPREPARATION>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                 // �R���{�{�b�N�X���i�̃f�[�^�̃Z�b�g�͂����ɋL�q���Ă��������B
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AC0030020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

		return;
	}

	/**
	 * �{�^���������ꂽ�ꍇ�̃C�x���g�n���h��
	 *
	 * @param buttun �{�^����
	 */
	public void control_eventHandller(String button) throws BusinessProcessException, FoundationException {

		try {
			controlPREPARATION(button);
			if( button.equals("None") ) {
				controlNone();
			} else if( button.equals("Execute") ) {
				controlExecute();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// �g���b�Z�[�W�o�͈˗��쐬
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AC0030020Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		} finally {
			if( !( "initial".equals(button) ) && ( "1".equals(getButtonType()) ) && (Integer.parseInt(cancelId) >= 0) ) {
				//���b�N����
				this.doUnBusinessLock();
			}
		}

		return;
	}

	//////////////////////////////


	//////////////////////////////

	/**
	 * CSV�o�̓��\�b�h
	 *
	 * @param list �e�[�u���񍀖ڃ��X�g�C���X�^���X
	 */
	public void createDefaultCSV(List list, String sTitle[]) throws BusinessProcessException, FoundationException {

		try {
			// ManageContainer �I�u�W�F�N�g��V�K�ɐ�������̂���߂��B
			// Singleton�Ŏ����Ă���I�u�W�F�N�g���g�p����悤�ɕύX�B
			// 2003.09.08 m-kasai
			//ManageContainer container = new ManageContainer(AppServerResources.getInstance());
			entity.mei_CSVOut.setPath(CoreTools.getContainer().getString("webroot")+"/csv/");
			entity.mei_CSVOut.setFname(entity.mei_CSVOut.m_ProjName
										+(struct.getsUser_ID() == null ? "" : "_"+struct.getsUser_ID())
										+(struct.getsSysdate() == null ? "" : "_"+struct.getsSysdate().substring(0,4)
																				 +struct.getsSysdate().substring(5,7)
																				 +struct.getsSysdate().substring(8,10)
																				 +struct.getsSysdate().substring(11,13)
																				 +struct.getsSysdate().substring(14,16)
																				 +struct.getsSysdate().substring(17,19))
										+".csv");
			entity.mei_CSVOut.create(list, sTitle);
		//{{user_implement_dev:<createDefaultCSV>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<createDefaultCSV>
		} catch( FoundationException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0030020-E999","CSV�̏o�͏���"));
			throw new FoundationException("AC0030020Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	/**
	 * �V�X�e�����t�擾���\�b�h
	 *
	 */
	public void beginTransaction() throws BusinessProcessException, FoundationException {
		String sToday = "";

		if(conn == null) { CoreTools.getTransConnection(); }

		try {
			if((sToday = entity.mei_Sysdate.read(conn))==null) {
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0030020-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AC0030020Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0030020-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AC0030020Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AC0030020Entity entity;
	protected AC0030020Struct struct;
	protected IDbConnection conn;

	/**
	 * ���O���i�C���X�^���X
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ���[�UID���Z�b�g���܂��B

	/**
	 * �����o�ϐ������������܂�
	 *
	 */
	public void initialize() throws FoundationException
	{
		conn = null;
		entity = null;
		struct = null;

		entity = new AC0030020Entity();
		struct = new AC0030020Struct();

		return;
	}

	/**
	 * �ڑ��������s���܂��B
	 *
	 * @return IDbConnection
	 */
	public IDbConnection connect() throws FoundationException
	{
		// DB�ڑ��������s���܂��B
		if( conn == null || conn.getConn() == null) {
			conn = CoreTools.getTransConnection();
		}
		return conn;
	}

	/**
	 * �ؒf�������s���܂��B
	 *
	 */
	public void disconnect(IDbConnection connect) throws FoundationException
	{
		// �Z�b�V�����̐ؒf�������s���܂��B
		if( connect != null ) {
			connect.commit();
			CoreTools.closeTransConnection(connect);
			connect = null;
		}
		return;
	}
	//////////////////////////////

	/**
	 * AC0030020�N���X�̕W���R���X�g���N�^
	 */
	public AC0030020Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
                 // TODO: �����ɏ����������L�q���Ă�������
                //}}user_implement_code_constractor

		return;
	}

	/**
	 * �C���X�^���X�j�󎞂ɍs������
	 *
	 */
	protected void finalize() throws FoundationException
	{
		//{{user_implement_dev:control_destractor
                 // TODO: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                //}}user_implement_dev:control_destractor

		objMessage = null;

		return;
	}

	//////////////////////////////

	//////////////////////////////
	//  ��ʑJ�ڌ����@�֘A���\�b�h

	//////////////////////////////
	// ���M�L�[��ݒ�	
	public void setOrMsgKey(List keyList) throws MessageApiException {

		// ���t�ϊ��p
		SimpleDateFormat sdf = new SimpleDateFormat();

		ArrayList msgKeyTypeArray = business.getMessageKeyType(Business.MSGKEY_TYPE_CAN_SEND); //�Ɩ������M�\�ȃ��b�Z�[�W�L�[�̏ꍇ
		ArrayList msgKeyArray = new ArrayList();

		for (int i = 0; msgKeyTypeArray != null && i < msgKeyTypeArray.size(); i++) {
			// ���b�Z�[�W�L�[�̎�ނ̐������J��Ԃ�	
			MessageKeyType msgKeyType = (MessageKeyType)msgKeyTypeArray.get(i);

			// ���b�Z�[�W�L�[�̃e�[�u����	
			String tableName = msgKeyType.getTableName();

			// ���b�Z�[�W�L�[�̃L�[�J���������X�g	
			// �����L�[�̏ꍇ�AkeyColumnName�̔z�񐔂��Q�ȏ�ƂȂ�
			String [] keyColumnName = msgKeyType.getKeyColumnName();
			for(int j = 0; j < keyList.size(); j++) {
				AC0030020Struct key = (AC0030020Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("txtEntryDate") && key.gettxtEntryDate() != null) {
					msgKey.setKeyValue("txtEntryDate", key.gettxtEntryDate());
				}
				if(msgKeyType.containsKeyColumn("rdoOutsideTyp1") && key.getrdoOutsideTyp1() != null) {
					msgKey.setKeyValue("rdoOutsideTyp1", key.getrdoOutsideTyp1());
				}
				if(msgKeyType.containsKeyColumn("rdoOutsideTyp2") && key.getrdoOutsideTyp2() != null) {
					msgKey.setKeyValue("rdoOutsideTyp2", key.getrdoOutsideTyp2());
				}
				if(msgKeyType.containsKeyColumn("rdoOutsideTyp3") && key.getrdoOutsideTyp3() != null) {
					msgKey.setKeyValue("rdoOutsideTyp3", key.getrdoOutsideTyp3());
				}
				if(msgKeyType.containsKeyColumn("rdoEntry1Typ1") && key.getrdoEntry1Typ1() != null) {
					msgKey.setKeyValue("rdoEntry1Typ1", key.getrdoEntry1Typ1());
				}
				if(msgKeyType.containsKeyColumn("rdoEntry1Typ2") && key.getrdoEntry1Typ2() != null) {
					msgKey.setKeyValue("rdoEntry1Typ2", key.getrdoEntry1Typ2());
				}
				if(msgKeyType.containsKeyColumn("rdoEntry1Typ3") && key.getrdoEntry1Typ3() != null) {
					msgKey.setKeyValue("rdoEntry1Typ3", key.getrdoEntry1Typ3());
				}
				if(msgKeyType.containsKeyColumn("txtJobOdrCd") && key.gettxtJobOdrCd() != null) {
					msgKey.setKeyValue("txtJobOdrCd", key.gettxtJobOdrCd());
				}
				if(msgKeyType.containsKeyColumn("rdoOutsideTyp") && key.getrdoOutsideTyp() != null) {
					msgKey.setKeyValue("rdoOutsideTyp", key.getrdoOutsideTyp());
				}
				if(msgKeyType.containsKeyColumn("rdoEntry1Typ") && key.getrdoEntry1Typ() != null) {
					msgKey.setKeyValue("rdoEntry1Typ", key.getrdoEntry1Typ());
				}
				if(msgKeyType.containsKeyColumn("txtEntryTime") && key.gettxtEntryTime() != null) {
					msgKey.setKeyValue("txtEntryTime", key.gettxtEntryTime());
				}
				if(msgKeyType.containsKeyColumn("TIME_CTRL") && key.getTIME_CTRL() != null) {
					msgKey.setKeyValue("TIME_CTRL", key.getTIME_CTRL());
				}
				if(msgKeyType.containsKeyColumn("hdnBusinessOprDate") && key.gethdnBusinessOprDate() != null) {
					msgKey.setKeyValue("hdnBusinessOprDate", key.gethdnBusinessOprDate());
				}
				if(msgKeyType.containsKeyColumn("plantCd") && key.getplantCd() != null) {
					msgKey.setKeyValue("plantCd", key.getplantCd());
				}
				//{{user_implement_dev:setOrMsgKey
					// TODO: �L�[���ݒ�̃R�[�h��ǉ����Ă�������
                                //}}user_implement_dev:setOrMsgKey

				// ���b�Z�[�W�L�[�ǉ�
				msgKeyArray.add(msgKey);

				// ���b�Z�[�W�L�[���Ɩ��ɓo�^����
				business.setSendMessageKey(tableName, keyColumnName, msgKeyArray);
			}
		}
	}

	//////////////////////////////
	// ��M�L�[���擾
	public List getOrMsgKey() throws MessageApiException {
		
		// ���t�ϊ��p
		SimpleDateFormat sdf = new SimpleDateFormat();

		ArrayList keyList = new ArrayList();
		ArrayList msgKeyTypeArray = business.getMessageKeyType(Business.MSGKEY_TYPE_CAN_RECEIVE);//�Ɩ�����M�\�ȃ��b�Z�[�W�L�[�̏ꍇ

		try {
			for (int i = 0; msgKeyTypeArray != null && i < msgKeyTypeArray.size(); i++) {
				// ���b�Z�[�W�L�[�̎�ނ̐������J��Ԃ�
				MessageKeyType msgKeyType = (MessageKeyType)msgKeyTypeArray.get(i);

				// ���b�Z�[�W�L�[�̃e�[�u����
				String tableName = msgKeyType.getTableName();

				// ���b�Z�[�W�L�[�̃L�[�J���������X�g
				// �����L�[�̏ꍇ�AkeyColumnName�̔z�񐔂��Q�ȏ�ƂȂ�
				String [] keyColumnName = msgKeyType.getKeyColumnName();

				// ���b�Z�[�W�L�[���擾����
				ArrayList msgKeyArray = business.getRecieveMessageKey(tableName, keyColumnName);//��M�������b�Z�[�W�L�[

				// ���b�Z�[�W�L�[�����݂���ꍇ�́A���b�Z�[�W�L�[�̐������J��Ԃ�
				for (int j = 0; msgKeyArray != null && j < msgKeyArray.size(); j++) {
					MessageKey msgKey = (MessageKey)msgKeyArray.get(j);
					AC0030020Struct key = new AC0030020Struct();
					if(msgKeyType.containsKeyColumn("txtEntryDate")) {
						key.settxtEntryDate(msgKey.getKeyValue("txtEntryDate"));
					}
					if(msgKeyType.containsKeyColumn("rdoOutsideTyp1")) {
						key.setrdoOutsideTyp1(msgKey.getKeyValue("rdoOutsideTyp1"));
					}
					if(msgKeyType.containsKeyColumn("rdoOutsideTyp2")) {
						key.setrdoOutsideTyp2(msgKey.getKeyValue("rdoOutsideTyp2"));
					}
					if(msgKeyType.containsKeyColumn("rdoOutsideTyp3")) {
						key.setrdoOutsideTyp3(msgKey.getKeyValue("rdoOutsideTyp3"));
					}
					if(msgKeyType.containsKeyColumn("rdoEntry1Typ1")) {
						key.setrdoEntry1Typ1(msgKey.getKeyValue("rdoEntry1Typ1"));
					}
					if(msgKeyType.containsKeyColumn("rdoEntry1Typ2")) {
						key.setrdoEntry1Typ2(msgKey.getKeyValue("rdoEntry1Typ2"));
					}
					if(msgKeyType.containsKeyColumn("rdoEntry1Typ3")) {
						key.setrdoEntry1Typ3(msgKey.getKeyValue("rdoEntry1Typ3"));
					}
					if(msgKeyType.containsKeyColumn("txtJobOdrCd")) {
						key.settxtJobOdrCd(msgKey.getKeyValue("txtJobOdrCd"));
					}
					if(msgKeyType.containsKeyColumn("rdoOutsideTyp")) {
						key.setrdoOutsideTyp(msgKey.getKeyValue("rdoOutsideTyp"));
					}
					if(msgKeyType.containsKeyColumn("rdoEntry1Typ")) {
						key.setrdoEntry1Typ(msgKey.getKeyValue("rdoEntry1Typ"));
					}
					if(msgKeyType.containsKeyColumn("txtEntryTime")) {
						key.settxtEntryTime(msgKey.getKeyValue("txtEntryTime"));
					}
					if(msgKeyType.containsKeyColumn("TIME_CTRL")) {
						key.setTIME_CTRL(msgKey.getKeyValue("TIME_CTRL"));
					}
					if(msgKeyType.containsKeyColumn("hdnBusinessOprDate")) {
						key.sethdnBusinessOprDate(msgKey.getKeyValue("hdnBusinessOprDate"));
					}
					if(msgKeyType.containsKeyColumn("plantCd")) {
						key.setplantCd(msgKey.getKeyValue("plantCd"));
					}
					//{{user_implement_dev:getOrMsgKey
						// TODO: �L�[���擾�̃R�[�h��ǉ����Ă�������
                                        //}}user_implement_dev:getOrMsgKey
					keyList.add(key);
				}
			}
		} catch (Exception e) {
			// printStackTrace ��\���B
			e.printStackTrace();
		}
		return keyList;
	}
}
