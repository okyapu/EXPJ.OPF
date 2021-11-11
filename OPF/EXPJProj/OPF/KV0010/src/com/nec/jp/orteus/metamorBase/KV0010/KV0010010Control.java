/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KV0010/src/com/nec/jp/orteus/metamorBase/KV0010/KV0010010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KV0010;

import com.nec.jp.orteus.metamorBase.KV0010.*;
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
//=============================
//import java.io.File;
import java.io.IOException;
//import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessage;
//import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
//import com.nec.jp.orteus.metamorBase.util.BusinessLock.BusinessLock;
//import com.nec.jp.orteus.metamorBase.util.SystemLog.SystemLog;
//import com.nec.jp.orteus.metamorBase.util.common.SystemConfig;
//import com.nec.jp.orteus.metamorBase.common.util.Converter;
//import com.nec.jp.orteus.metamorBase.common.util.ScreenParam;
//import com.nec.jp.orteus.metamorBase.common.util.ScreenPermission;
//import com.nec.jp.orteus.expj.util.MessageStruct;
import java.io.*;
//=============================
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class KV0010010Control
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
        protected List list;						// ���ʃ��X�g�̃C���X�^���X
        public List getList() { return this.list; }			// ���X�g��Ԃ��܂��B
        public void setList(List listname) { this.list = listname; }	// ���X�g���Z�b�g���܂��B
        public int getListsize() {					// ���X�g�^�̃T�C�Y��Ԃ��܂��B
         int nret = 0;
         if( this.list != null ) {nret = this.list.size();}
         return nret;
        }
        public Object getListvalue(int x) { return this.list.get(x); }	// ���X�g�̒l�i���f�B�G�[�^�j��Ԃ��܂��B
       
        public KV0010010Struct getStruct() { return this.struct; }	// Struct�̒l�i���f�B�G�[�^�j��Ԃ��܂��B
       
        // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
       // insert Original Code ===================================================
        // �P�[�`�����ǂݏo���p
        protected List list1;						// ���ʃ��X�g�̃C���X�^���X
        public List getList1() { return this.list1; }			// ���X�g��Ԃ��܂��B
        public void setList1(List listname) { this.list1 = listname; }	// ���X�g���Z�b�g���܂��B
        public int getList1size() {					// ���X�g�^�̃T�C�Y��Ԃ��܂��B
         int nret = 0;
         if( this.list1 != null ) {nret = this.list1.size();}
         return nret;
        }
        // ���X�g�̒l�i���f�B�G�[�^�j��Ԃ��܂��B
        public KV0010010Struct getList1value(int x) { return (KV0010010Struct)(this.list1.get(x)); }
       
        // �ꗗ�`�����ǂݏo���p
        protected List list2;						// ���ʃ��X�g�̃C���X�^���X
        public List getList2() { return this.list2; }			// ���X�g��Ԃ��܂��B
        public void setList2(List listname) { this.list2 = listname; }	// ���X�g���Z�b�g���܂��B
        public int getList2size() {					// ���X�g�^�̃T�C�Y��Ԃ��܂��B
         int nret = 0;
         if( this.list2 != null ) {nret = this.list2.size();}
         return nret;
        }
        // ���X�g�̒l�i���f�B�G�[�^�j��Ԃ��܂��B
        public KV0010010Struct getList2value(int x) { return (KV0010010Struct)(this.list2.get(x)); }
       
       //TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT
        //// �V�X�e���g�p�̃��[�U�R�[�h
        //protected String sysUSER_CD;
        //public void setsysUSER_CD(String name) { this.sysUSER_CD = name; };
        //public String getsysUSER_CD() { return this.sysUSER_CD; };
       
        //// �V�X�e���g�p�̍H��R�[�h
        //protected String sysPLANT_CD;
        //public void setsysPLANT_CD(String name) { this.sysPLANT_CD = name; };
        //public String getsysPLANT_CD() { return this.sysPLANT_CD; };
       
        //// �V�X�e���g�p�̃��[�U��
        //protected String sysUSER_NAME;
        //public void setsysUSER_NAME(String name) { this.sysUSER_NAME = name; };
        //public String getsysUSER_NAME() { return this.sysUSER_NAME; };
       
        //// �V�X�e���g�p�̍H�ꖼ
        //protected String sysPLANT_NAME;
        //public void setsysPLANT_NAME(String name) { this.sysPLANT_NAME = name; };
        //public String getsysPLANT_NAME() { return this.sysPLANT_NAME; };
       
        //// ��ʃ��b�Z�[�W��ێ�
        //private MessageStruct msgStruct = new MessageStruct();
        //public MessageStruct getMsgStruct(){ return this.msgStruct;}
       
        //// �V�X�e�����O��ێ�
        //private SystemLog sysLog = new SystemLog();
        //public SystemLog getSysLog(){ return this.sysLog;}
       
        //// ��ʒ�`����ێ�
        //private ScreenParam sp = null;
       
        //private BusinessLock bLock = null;
        //public String cancelId = "0";
       
        //public boolean doUnBusinessLock(){
        //	//�����ł�Exception�����ݏ���
        //	boolean doUnLock = false;
        //	try{
        //		bLock = new BusinessLock(conn,this.struct.getsUser_ID(),this.sysPLANT_CD);
        //		doUnLock = bLock.doUnLock(this.sp.getProcId(),Integer.parseInt(cancelId));
        //		if(!doUnLock){
        //			//�Ɩ����b�N�������s
        //			throw new Exception();
        //		}
        //	}catch(Exception e){
        //		sysLog.setConnection(conn);
        //		sysLog.severe("ZZ01004",this.struct.getsUser_ID());//���b�N�������s
        //	}
        //	return doUnLock;
        //}
       //LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL
       
        private boolean closeFlag = false;
        public boolean isCloseFlag(){
         return this.closeFlag;
        }
       
        /**
         * �o�b�`�����N���X���Ăяo��
         *
         * @param programCLASS �����N���X
         * @param programNAME ������
         * @param userID ���[�UID
         * @param plantCd �H��R�[�h
         * @return �Ȃ�
         */
        private void executeBatchProgram(String programCLASS,
                                            String programNAME,
                                            String userID,
                                            String plantCd,
                                            String flg) throws Exception {
       
         try {
          // �o�b�`���������s���� -------------------------------------------
          ResourceBundle bundle = SystemConfig.getBundle();
          String javaPath = SystemConfig.getProperty("JAVA_PATH", bundle);
          if(javaPath == null || "".equals(javaPath)){
           //�V�X�e������l�t�@�C������̏��擾�Ɏ��s���܂���(�i�u�l�p�X)
           //AlarmMessage almMsg = new AlarmMessage("ZZ09010", new String[0]);
           //msgStruct.getError().add(almMsg.getMessage());
           //sysLog.warning("ZZ09010", sysUSER_CD);
           ExpjMessage emsg = new ExpjMessage("ZZ09010", new String[0]);
           msgStruct.addError( emsg );
          }
          String ClassPath = SystemConfig.getProperty("CLASS_PATH", bundle);
          if(ClassPath == null || "".equals(ClassPath)){
           //�V�X�e������l�t�@�C������̏��擾�Ɏ��s���܂���(�N���X�p�X)
           //AlarmMessage almMsg = new AlarmMessage("ZZ09012", new String[0]);
           //msgStruct.getError().add(almMsg.getMessage());
           //sysLog.warning("ZZ09012", sysUSER_CD);
           ExpjMessage emsg = new ExpjMessage("ZZ09012", new String[0]);
           msgStruct.addError( emsg );
          }
          String batchPath = SystemConfig.getProperty("BATCH_PATH", bundle);
          if(batchPath == null || "".equals(batchPath)){
           //"�V�X�e������l�t�@�C������̏��擾�Ɏ��s���܂���(�o�b�`�N���ݒ�)"
           //AlarmMessage almMsg = new AlarmMessage("ZZ09011", new String[0]);
           //msgStruct.getError().add(almMsg.getMessage());
           //sysLog.warning("ZZ09011", sysUSER_CD);
           ExpjMessage emsg = new ExpjMessage("ZZ09011", new String[0]);
           msgStruct.addError( emsg );
          }
          String txtPath = SystemConfig.getProperty("PATH_KV0020B001", bundle);
          if(txtPath == null || "".equals(txtPath)){
           //"�V�X�e������l�t�@�C������̏��擾�Ɏ��s���܂���(�o�b�`�N���ݒ�)"
           //AlarmMessage almMsg = new AlarmMessage("ZZ09011", new String[0]);
           //msgStruct.getError().add(almMsg.getMessage());
           //sysLog.warning("ZZ09011", sysUSER_CD);
           ExpjMessage emsg = new ExpjMessage("ZZ09011", new String[0]);
           msgStruct.addError( emsg );
          }
          // �S�Ă̒�`��񂪎擾�ł��Ă���΁A���������s����B
          if ((javaPath != null && !"".equals(javaPath)) 
            && (ClassPath != null  && !"".equals(ClassPath)) 
            && (batchPath != null && !"".equals(batchPath))) {
//           String cmd = "";
//           cmd = cmd + javaPath;    // �i�u�l
//           cmd = cmd + " -cp ";
//           cmd = cmd + ClassPath;   // Java ClassPath
//           cmd = cmd + " -Dcom.nec.jp.orteus.util.logging.config.file=";
//           cmd = cmd + batchPath;   // D:/EXPJStudio/lib/logging.properties"; // �N���ݒ�
//           cmd = cmd + " " + programCLASS; // �Ăяo����N���X
//           cmd = cmd + " " + programNAME;  // �Ăяo����NAME
//           cmd = cmd + " " + userID;       // ���[�UID
//           cmd = cmd + " " + plantCd;      // �H��R�[�h
//           
//           if (flg.equals("1")) {
//            String txtfile = "KV0020B001.txt";
//            cmd = cmd + " " + txtPath;
//            cmd = cmd + " " + txtfile;
//           }
//       
//           if (flg.equals("2")) {
//            String txtfile = "KV0020B005.txt";
//            cmd = cmd + " " + txtPath;
//            cmd = cmd + " " + txtfile;
//           }
//
//           if (flg.equals("3")) {
//            String direct_dlv_flg = this.struct.getg_DIRECT_DLV_FLG(); //�݌Ƀ`�F�b�N�Ȃ��t���O
//            cmd = cmd + " " + direct_dlv_flg;
//           }
//           
//           if (flg.equals("4")) {
//            String txtfile = "KP0040B001.txt";
//            cmd = cmd + " " + txtPath;
//            cmd = cmd + " " + txtfile;
//           } 

           List buffer = new ArrayList();
           buffer.add(javaPath);    // �i�u�l
           buffer.add("-cp");
           buffer.add(ClassPath);   // Java ClassPath
           buffer.add("-Dcom.nec.jp.orteus.util.logging.config.file=" + batchPath); // D:/EXPJStudio/lib/logging.properties"; // �N���ݒ�
           buffer.add(programCLASS); // �Ăяo����N���X
           buffer.add(programNAME);  // �Ăяo����NAME
           buffer.add(userID);       // ���[�UID
           buffer.add(plantCd);      // �H��R�[�h
           
           if (flg.equals("1")) {
            String txtfile = "KV0020B001.txt";
            buffer.add(txtPath);
            buffer.add(txtfile);
           }
       
           if (flg.equals("2")) {
            String txtfile = "KV0020B005.txt";
            buffer.add(txtPath);
            buffer.add(txtfile);
           }

           if (flg.equals("3")) {
            String direct_dlv_flg = this.struct.getg_DIRECT_DLV_FLG(); //�݌Ƀ`�F�b�N�Ȃ��t���O
            buffer.add(direct_dlv_flg);
           }
           
           if (flg.equals("4")) {
            String txtfile = "KP0040B001.txt";
            buffer.add(txtPath);
            buffer.add(txtfile);
           } 
       //System.out.println("cmd" + cmd);
             
           Runtime runtime = Runtime.getRuntime();
//           Process p = runtime.exec(cmd);
           runtime.exec((String[])buffer.toArray(new String[buffer.size()]));
       
       /*
           //
           // ��Q���m�F�p�B�Ăяo�����v���O�������Ď����A�W���o�͂��擾����B
           // �^�p���̓R�����g�A�E�g����B
           BufferedReader brE = new BufferedReader(new InputStreamReader(p.getErrorStream()));
           BufferedReader brO = new BufferedReader(new InputStreamReader(p.getInputStream()));
           String s;
           while ( (s = brO.readLine()) != null) {
       
           }
           while ( (s = brE.readLine()) != null) {
       
           }
           //
       */
       
           // �o�b�`�Ăяo�������̏ꍇ�A��ʃ��b�Z�[�W��\������B
           //AlarmMessage almMsg = new AlarmMessage("ZZ09015", new String[0]);
           //msgStruct.getInfo().add(almMsg.getMessage());
           ExpjMessage emsg = new ExpjMessage("ZZ09015", new String[0]);
           msgStruct.addInfo( emsg );
          }
         } catch(IOException e) {
          // �o�b�`�Ăяo�����s�̏ꍇ�A��ʃ��b�Z�[�W��\������B
          //AlarmMessage almMsg = new AlarmMessage("ZZ09016", new String[0]);
          //msgStruct.getError().add(almMsg.getMessage());
          ExpjMessage emsg = new ExpjMessage("ZZ09016", new String[0]);
          msgStruct.addError( emsg );
          throw e;
         } catch(Exception e) {
          throw e;
         }
       
        }

        /**
         * ��ʂ̑S���ڂ����������܂��B(2005/08/11�ǉ�)
         */
        private void initializeAll() {
         struct.setrdoPlantTyp1(null);
         struct.setrdoPlantTyp2(null);
         struct.setrdoPlantTyp3(null);
         struct.setrdoPlantTyp4("true");
         struct.setrdoPlantTyp5(null);
         struct.setrdoPlantTyp6(null);
         struct.setrdoPlantTyp7(null);
         struct.setrdoPlantTyp8(null);
         struct.setrdoPlantTyp9(null);
         struct.setg_DIRECT_DLV_FLG(null);
         initializeDetail();
        }
       
        /**
         * ��ʂ̏ڍ׍��ڂ����������܂��B
         * �����ł́A�L�[�ȊO�̍��ڂ̏��������s���܂��B
         */
        private void initializeDetail() {
         list = null;
         readStatus = INITIAL;
        }
       //=========================================================================
       
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * ���s�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlexecute() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KV0010");
		logger.entering("KV0010010Control"+":USER="+struct.getsUser_ID(),"controlexecute");
			//{{user_implement_dev:<controlexecute>
              
                try {
              // insert Original Code ===================================================
                 //sysLog.setConnection(conn);
                 //this.msgStruct.clearAll();
                 // =======================================
                 // ���Џ��̎擾
                 // =======================================
              
                 List listCompanyInfo = entity.mgetSYS_MY_COMPANY.read(conn,struct);
                 if(listCompanyInfo == null || listCompanyInfo.size() != 1){
                  //���Џ�񂪖���/������
                  // ���b�Z�[�W����ʏo�͂����
                  ExpjMessage emsg = new ExpjMessage("KQ00039");
                  msgStruct.addError( emsg );
                  return;
              //				ExpjException ee = new ExpjException( emsg);
              //				throw ee;
                 }
                 listCompanyInfo = null;
                 String programTyp1 = null;
                 String programTyp2 = null;
                 String programTyp3 = null;
                 String programTyp4 = null;
                 String programTyp5 = null;
                 String programTyp6 = null;
                 String programTyp7 = null;
                 String programTyp8 = null;
                 String programTyp9 = null;
                 String programClass = null;
                 String programName = null;
              
                 // �O����̃N���A
                 this.list = null;
              
                 // ��ʏ��̎擾
                 programTyp1 = this.struct.getrdoPlantTyp1();
                 programTyp2 = this.struct.getrdoPlantTyp2();
                 programTyp3 = this.struct.getrdoPlantTyp3();
                 programTyp4 = this.struct.getrdoPlantTyp4();
                 programTyp5 = this.struct.getrdoPlantTyp5();
                 programTyp6 = this.struct.getrdoPlantTyp6();
                 programTyp7 = this.struct.getrdoPlantTyp7();
                 programTyp8 = this.struct.getrdoPlantTyp8();
                 programTyp9 = this.struct.getrdoPlantTyp9();
              
                 // �H��w��̏ꍇ
                 if (programTyp1.equals("true"))    //�󒍏��捞
                 {
                  programClass = "com.nec.jp.orteus.metamorBase.KQ0010.KQ0010B001.mainKQ0010B001";
                  programName = "KQ0010B001";
                  // �o�b�`�����̎��s
                  executeBatchProgram(programClass,programName,sysUSER_CD,sysPLANT_CD,"0");
                 }
                 else if(programTyp2.equals("true"))//�o�׎w��
                 {
                  programClass = "com.nec.jp.orteus.metamorBase.KU0010.KU0010B001.mainKU0010B001";
                  programName = "KU0010B001";
                  // �o�b�`�����̎��s
                  executeBatchProgram(programClass,programName,sysUSER_CD,sysPLANT_CD,"3");				
                 }
                 else if(programTyp3.equals("true"))//�a�������d�c�h���捞
                 {
                  programClass = "com.nec.jp.orteus.metamorBase.KV0020.KV0020B005.mainKV0020B005";
                  programName = "KV0020B005";
                  // �o�b�`�����̎��s
                  executeBatchProgram(programClass,programName,sysUSER_CD,sysPLANT_CD,"2");
                 }
                 else if(programTyp4.equals("true"))//�d�c�h�����T�^�e�捞
                 {
                  programClass = "com.nec.jp.orteus.metamorBase.KV0020.KV0020B001.mainKV0020B001";
                  programName = "KV0020B001";
                  // �o�b�`�����̎��s
                  executeBatchProgram(programClass,programName,sysUSER_CD,sysPLANT_CD,"1");
                 }
                 else if(programTyp5.equals("true"))//�d�c�h�����T�^�e�ʕϊ�
                 {
                  programClass = "com.nec.jp.orteus.metamorBase.KV0020.KV0020B002.mainKV0020B002";
                  programName = "KV0020B002";
                  // �o�b�`�����̎��s
                  executeBatchProgram(programClass,programName,sysUSER_CD,sysPLANT_CD,"0");
                 }
                 else if(programTyp6.equals("true"))//�d�c�h���v�v��T�^�e�捞
                 {
                  programClass = "com.nec.jp.orteus.metamorBase.KP0040.KP0040B001.mainKP0040B001";
                  programName = "KP0040B001";
                  // �o�b�`�����̎��s
                  executeBatchProgram(programClass,programName,sysUSER_CD,sysPLANT_CD,"4");
                 }
                 else if(programTyp7.equals("true"))//���v�v����捞
                 {
                  programClass = "com.nec.jp.orteus.metamorBase.KP0040.KP0040B002.mainKP0040B002";
                  programName = "KP0040B002";
                  // �o�b�`�����̎��s
                  executeBatchProgram(programClass,programName,sysUSER_CD,sysPLANT_CD,"0");
                 }
                 else if(programTyp8.equals("true"))//���v�v��c�W�v����
                 {
                  programClass = "com.nec.jp.orteus.metamorBase.KP0040.KP0040B003.mainKP0040B003";
                  programName = "KP0040B003";
                  // �o�b�`�����̎��s
                  executeBatchProgram(programClass,programName,sysUSER_CD,sysPLANT_CD,"0");
                 }
                 else if(programTyp9.equals("true"))//�Č��\�Z�Ϗ㏈��
                 {
                  programClass = "com.nec.jp.orteus.metamorBase.KM0060.KM0060B001.mainKM0060B001";
                  programName = "KM0060B001";
                  // �o�b�`�����̎��s
                  executeBatchProgram(programClass,programName,sysUSER_CD,sysPLANT_CD,"0");
                 }
                 else
                 {
                  programClass = "";
                  programName = "";
                  // �o�b�`�����̎��s
                  executeBatchProgram(programClass,programName,sysUSER_CD,sysPLANT_CD,"0");
                 }
                 
              
                } catch (Exception e) {
                 ExpjMessage emsg = new ExpjMessage("ZZ01106",new String[0]);
                 msgStruct.addError( emsg );
                 ExpjException ee = new ExpjException(e, emsg);
                 throw ee;
                } finally {
                 if (conn != null){
                  try {
                   conn.rollback();
                  } catch (FoundationException fe){
                   ExpjMessage emsg = new ExpjMessage("ZZ01106",new String[0]);
                   msgStruct.addError( emsg );
                   ExpjException ee = new ExpjException(fe, emsg);
                   throw ee;
                  }
                 }
                }
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlexecute>
		logger.exiting("KV0010010Control"+":USER="+struct.getsUser_ID(),"controlexecute");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KV0010");
		logger.entering("KV0010010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>

                // ��ʂ�������(2005/08/11�ǉ�)
                initializeAll();

                //}}user_implement_dev:<controlclear>
		logger.exiting("KV0010010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KV0010");
		logger.entering("KV0010010Control"+":USER="+struct.getsUser_ID(),"controlclose");
			//{{user_implement_dev:<controlclose>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlclose>
		logger.exiting("KV0010010Control"+":USER="+struct.getsUser_ID(),"controlclose");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KV0010");
		logger.entering("KV0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KV0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KV0010");
		logger.entering("KV0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
              // insert Original Code ===================================================
                //try {
                 // ���ʏ��� -------------------------------------------
                 // ��ʒ�`���̎擾
                 //sp = new ScreenParam(this.getClass());
              
                 // ��ʃ��b�Z�[�W�ێ��I�u�W�F�N�g�̃N���A
                 //msgStruct.clearAll();
              
                 // �V�X�e�����O������������
                 //sysLog = new SystemLog();
                 //boolean logInit = sysLog.init(this.sp.getLogId());
                 //if(!logInit){
                 //	�V�X�e�����O�̏������Ɏ��s���܂���
                 //	throw new AlarmMessageException("ZZ01005",new String[0]);
                 //	throw ee;
                 //}
              
                 // �V�X�e�����O�𗘗p����
                 //sysLog.setConnection(conn);
              
                 //// ��ʂ�rl���ڎw��N���̋֎~
                 //try{
                 //	if(ScreenPermission.isUseful(conn, sysUSER_CD, sp.getProcId()) == false) {
                 //		throw new Exception();
                 //	}
                 //}catch(Exception e){
                 //	//���̋@�\�̎g�p����������܂���B
                 //	throw new AlarmMessageException("ZZ01002",new String[0]);
                 //}
              
                 // ���ʏ��� -------------------------------------------
              
                //} catch (Exception e) {
                 //AlarmMessageException ame = null;
                 //if(e instanceof AlarmMessageException){
                 //	ame = (AlarmMessageException)e;
                 //	ame.next();
                 //	// �T�[�o�ŃG���[���������܂����B
                 //	sysLog.severe("ZZ01106", sysUSER_CD, ame.getMessage()); 
                 //	ame.resetCurrent();
                 //}else{
                 //	ame = new AlarmMessageException("ZZ01106", new String[0]);
                 //	sysLog.severe("ZZ01106", sysUSER_CD); // �T�[�o�ŃG���[���������܂����B
                 //	sysLog.severe("ZZ01106", sysUSER_CD, e.toString()); // �T�[�o�ŃG���[���������܂����B
                 //}
                 //throw ame;
                //}
              //=========================================================================
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KV0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KV0010");
		logger.entering("KV0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
                 // �_�E�����[�h�t�@�C�����N���A
                 // PDF�ECSV�̃_�E�����[�h���s���Ƃ��́A��ʏ��OrHidden�ŁuDOWNLOAD_FILE�v���`���A
                 //���̍s�̃R�����g���O���Ă��������B
              
              //			struct.setDOWNLOAD_FILE((String)null);
                 // �R���{�{�b�N�X���i�̃f�[�^�̃Z�b�g�͂����ɋL�q���Ă��������B
                 // �R���{�{�b�N�X�f�[�^�p��
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("KV0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("execute") ) {
				controlexecute();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("close") ) {
				controlclose();
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
//			throw new FoundationException("KV0010010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KV0010010-E999","CSV�̏o�͏���"));
			throw new FoundationException("KV0010010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KV0010010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("KV0010010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KV0010010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("KV0010010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected KV0010010Entity entity;
	protected KV0010010Struct struct;
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

		entity = new KV0010010Entity();
		struct = new KV0010010Struct();

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
	 * KV0010010�N���X�̕W���R���X�g���N�^
	 */
	public KV0010010Control() throws BusinessProcessException, FoundationException
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
				KV0010010Struct key = (KV0010010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("rdoPlantTyp1") && key.getrdoPlantTyp1() != null) {
					msgKey.setKeyValue("rdoPlantTyp1", key.getrdoPlantTyp1());
				}
				if(msgKeyType.containsKeyColumn("rdoPlantTyp2") && key.getrdoPlantTyp2() != null) {
					msgKey.setKeyValue("rdoPlantTyp2", key.getrdoPlantTyp2());
				}
				if(msgKeyType.containsKeyColumn("rdoPlantTyp3") && key.getrdoPlantTyp3() != null) {
					msgKey.setKeyValue("rdoPlantTyp3", key.getrdoPlantTyp3());
				}
				if(msgKeyType.containsKeyColumn("rdoPlantTyp4") && key.getrdoPlantTyp4() != null) {
					msgKey.setKeyValue("rdoPlantTyp4", key.getrdoPlantTyp4());
				}
				if(msgKeyType.containsKeyColumn("rdoPlantTyp5") && key.getrdoPlantTyp5() != null) {
					msgKey.setKeyValue("rdoPlantTyp5", key.getrdoPlantTyp5());
				}
				if(msgKeyType.containsKeyColumn("g_DIRECT_DLV_FLG") && key.getg_DIRECT_DLV_FLG() != null) {
					msgKey.setKeyValue("g_DIRECT_DLV_FLG", key.getg_DIRECT_DLV_FLG());
				}
				if(msgKeyType.containsKeyColumn("rdoPlantTyp6") && key.getrdoPlantTyp6() != null) {
					msgKey.setKeyValue("rdoPlantTyp6", key.getrdoPlantTyp6());
				}
				if(msgKeyType.containsKeyColumn("rdoPlantTyp7") && key.getrdoPlantTyp7() != null) {
					msgKey.setKeyValue("rdoPlantTyp7", key.getrdoPlantTyp7());
				}
				if(msgKeyType.containsKeyColumn("rdoPlantTyp8") && key.getrdoPlantTyp8() != null) {
					msgKey.setKeyValue("rdoPlantTyp8", key.getrdoPlantTyp8());
				}
				if(msgKeyType.containsKeyColumn("rdoPlantTyp9") && key.getrdoPlantTyp9() != null) {
					msgKey.setKeyValue("rdoPlantTyp9", key.getrdoPlantTyp9());
				}
				if(msgKeyType.containsKeyColumn("my_COMPANY_CD") && key.getmy_COMPANY_CD() != null) {
					msgKey.setKeyValue("my_COMPANY_CD", key.getmy_COMPANY_CD());
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
					KV0010010Struct key = new KV0010010Struct();
					if(msgKeyType.containsKeyColumn("rdoPlantTyp1")) {
						key.setrdoPlantTyp1(msgKey.getKeyValue("rdoPlantTyp1"));
					}
					if(msgKeyType.containsKeyColumn("rdoPlantTyp2")) {
						key.setrdoPlantTyp2(msgKey.getKeyValue("rdoPlantTyp2"));
					}
					if(msgKeyType.containsKeyColumn("rdoPlantTyp3")) {
						key.setrdoPlantTyp3(msgKey.getKeyValue("rdoPlantTyp3"));
					}
					if(msgKeyType.containsKeyColumn("rdoPlantTyp4")) {
						key.setrdoPlantTyp4(msgKey.getKeyValue("rdoPlantTyp4"));
					}
					if(msgKeyType.containsKeyColumn("rdoPlantTyp5")) {
						key.setrdoPlantTyp5(msgKey.getKeyValue("rdoPlantTyp5"));
					}
					if(msgKeyType.containsKeyColumn("g_DIRECT_DLV_FLG")) {
						key.setg_DIRECT_DLV_FLG(msgKey.getKeyValue("g_DIRECT_DLV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("rdoPlantTyp6")) {
						key.setrdoPlantTyp6(msgKey.getKeyValue("rdoPlantTyp6"));
					}
					if(msgKeyType.containsKeyColumn("rdoPlantTyp7")) {
						key.setrdoPlantTyp7(msgKey.getKeyValue("rdoPlantTyp7"));
					}
					if(msgKeyType.containsKeyColumn("rdoPlantTyp8")) {
						key.setrdoPlantTyp8(msgKey.getKeyValue("rdoPlantTyp8"));
					}
					if(msgKeyType.containsKeyColumn("rdoPlantTyp9")) {
						key.setrdoPlantTyp9(msgKey.getKeyValue("rdoPlantTyp9"));
					}
					if(msgKeyType.containsKeyColumn("my_COMPANY_CD")) {
						key.setmy_COMPANY_CD(msgKey.getKeyValue("my_COMPANY_CD"));
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
