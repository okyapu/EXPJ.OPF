/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KV0030/src/com/nec/jp/orteus/metamorBase/KV0030/KV0030010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KV0030;

import com.nec.jp.orteus.metamorBase.KV0030.*;
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
import java.io.IOException;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class KV0030010Control
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
        protected List list;											// �ꗗ�����̌��ʃ��X�g����ʂɕ\�����邽�߂̃��X�g�C���X�^���X
       
        // �f�t�H���g�A�N�Z�T���\�b�h
        public List getList() { return this.list; }						// ���X�g��Ԃ��܂��B
        public void setList(List listname) { this.list = listname; }	// ���X�g���Z�b�g���܂��B
        public int getListsize() {										// ���X�g�^�̃T�C�Y��Ԃ��܂��B
         int nret = 0;
         if( this.list != null ) {nret = this.list.size();}
         return nret;
        }
       //	public Object getListvalue(int x) { return this.list.get(x); }	// ���X�g�̒l��Ԃ��܂��B
        public KV0030010Struct getListvalue(int x) { return (KV0030010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
        public KV0030010Struct getStruct() { return this.struct; }	// Struct��Ԃ��܂��B
        public KV0030010Struct createStruct() { return new KV0030010Struct(); }	// �V����Struct������ĕԂ��܂��B
        public void setStruct(Object structname) { this.struct.setStruct((KV0030010Struct)structname); }	// Struct���Z�b�g���܂��B
        public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B
       
        // CSV�o�͗p���X�g
        private CsvWriter csvWriter = null;
        public CsvWriter getCsvWriter(){ return this.csvWriter; }
       
        private CsvReader csvReader = null;
        public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
       
        // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
       
        /**
         * �o�b�`�����N���X���Ăяo��
         *
         * @param userID ���[�UID
         * @param plantTyp �����敪�i�H��w��^�C�v�j
         * @param plantCd �H��R�[�h
         * @return �Ȃ�
         */
        private void executeBatchProgram(String plantCd) throws Exception {
       
         try {
          // �o�b�`���������s���� -------------------------------------------
          ResourceBundle bundle = SystemConfig.getBundle();
          String javaPath = SystemConfig.getProperty("JAVA_PATH", bundle);
          if(javaPath == null){
           //�V�X�e������l�t�@�C������̏��擾�Ɏ��s���܂���(�i�u�l�p�X)
           ExpjMessage emsg = new ExpjMessage("ZZ09010", new String[0]);
           msgStruct.addError( emsg );
          }
          String ClassPath = SystemConfig.getProperty("CLASS_PATH", bundle);
          if(ClassPath == null){
           //�V�X�e������l�t�@�C������̏��擾�Ɏ��s���܂���(�N���X�p�X)
           ExpjMessage emsg = new ExpjMessage("ZZ09012", new String[0]);
           msgStruct.addError( emsg );
          }
          String batchPath = SystemConfig.getProperty("BATCH_PATH", bundle);
          if(batchPath == null){
           //"�V�X�e������l�t�@�C������̏��擾�Ɏ��s���܂���(�o�b�`�N���ݒ�)"
           ExpjMessage emsg = new ExpjMessage("ZZ09011", new String[0]);
           msgStruct.addError( emsg );
          }
          // �Œ�l���Z�b�g
          String batchProcessingTyp = "2";		  // ��ʂ��N���F2�^�����^�]�F1
          String ProgID = "KV0030010";		  // �ďo���Ƃ̋Ɩ�ID
          String userID = struct.getsUser_ID(); // ���O�C�����[�UID
          String userPlantCD = struct.getstrPLANT_CD();// ���[�U�����H��
       
          // �S�Ă̒�`��񂪎擾�ł��Ă���΁A���������s����B
          if ((javaPath != null) && (ClassPath != null) && (batchPath != null)) {
//           String cmd = "";
//           cmd = cmd + javaPath;    // �i�u�l
//           cmd = cmd + " -cp ";
//           cmd = cmd + ClassPath;   // Java ClassPath
//           cmd = cmd + " -Dcom.nec.jp.orteus.util.logging.config.file=";
//           cmd = cmd + batchPath;   // D:/OrteusStudio/lib/logging.properties"; // �N���ݒ�
//           cmd = cmd + " " + "com.nec.jp.orteus.metamorBase.KV0030.KV0030B001.mainKV0030B001"; // �Ăяo����N���X
//           cmd = cmd + " " + batchProcessingTyp;
//           cmd = cmd + " " + userID;     // ���[�UID
//           cmd = cmd + " " + userPlantCD;// ���[�U�����H��
//           cmd = cmd + " " + ProgID;      // �Ɩ�ID
//           cmd = cmd + " " + plantCd;      // �H��R�[�h
           
           List buffer = new ArrayList();
           buffer.add(javaPath);    // �i�u�l
           buffer.add("-cp");
           buffer.add(ClassPath);   // Java ClassPath
           buffer.add("-Dcom.nec.jp.orteus.util.logging.config.file=" + batchPath); // D:/OrteusStudio/lib/logging.properties"; // �N���ݒ�
           buffer.add("com.nec.jp.orteus.metamorBase.KV0030.KV0030B001.mainKV0030B001"); // �Ăяo����N���X
           buffer.add(batchProcessingTyp);
           buffer.add(userID);     // ���[�UID
           buffer.add(userPlantCD);// ���[�U�����H��
           buffer.add(ProgID);      // �Ɩ�ID
           buffer.add(plantCd);      // �H��R�[�h
       
           //System.out.println(cmd);
       
           Runtime runtime = Runtime.getRuntime();
//           Process p = runtime.exec(cmd);
           runtime.exec((String[])buffer.toArray(new String[buffer.size()]));
       
           //
           /*
           // ��Q���m�F�p�B�Ăяo�����v���O�������Ď����A�W���o�͂��擾����B
           // �^�p���̓R�����g�A�E�g����B
           BufferedReader brE = new BufferedReader(new InputStreamReader(p.
            getErrorStream()));
           BufferedReader brO = new BufferedReader(new InputStreamReader(p.
            getInputStream()));
           String s;
           while ( (s = brO.readLine()) != null) {
            //System.out.println("out:" + s);
           }
           while ( (s = brE.readLine()) != null) {
            //System.out.println("err:" + s);
           }
           //
           */
       
           // �o�b�`�Ăяo�������̏ꍇ�A��ʃ��b�Z�[�W��\������B
           //AlarmMessage almMsg = new AlarmMessage("ZZ09013", new String[0]);
           //msgStruct.getInfo().add(almMsg.getMessage());
           ExpjMessage emsg = new ExpjMessage("ZZ09013", new String[0]);
           msgStruct.addInfo( emsg );
          }
         } catch(IOException e) {
          // �o�b�`�Ăяo�����s�̏ꍇ�A��ʃ��b�Z�[�W��\������B
          ExpjMessage emsg = new ExpjMessage("ZZ09016", new String[0]);
          msgStruct.addError( emsg );
          throw e;
         } catch(Exception e) {
          throw e;
         }
       
       
        }
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * ���s�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlexecute() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KV0030");
		logger.entering("KV0030010Control"+":USER="+struct.getsUser_ID(),"controlexecute");
			//{{user_implement_dev:<controlexecute>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                try {
                     //�V�X�e���p�����[�^�̃`�F�b�N
                     List listSysInfo = new ArrayList();
                     listSysInfo = entity.mgetSYS_PARAM.read(conn,struct);
                     if(listSysInfo == null || listSysInfo.size() != 1) {
                        //�V�X�e���p�����[�^��񂪖���/������
                        ExpjMessage emsg = new ExpjMessage("KV03005");
                        msgStruct.addError(emsg);	// �G���[���b�Z�[�W�Ƃ��ēo�^
                        sysLog.warning(emsg, getsysUSER_CD()); //�G���[���e
                        ExpjException ee = new ExpjException(emsg);
                        throw ee;
                     } else {
                       if("2".equals(((KV0030010Struct)listSysInfo.get(0)).getSYS_PARAM_VALUE())) {
                         ExpjMessage emsg = new ExpjMessage("KV03006");
                         msgStruct.addError(emsg);	// �G���[���b�Z�[�W�Ƃ��ēo�^
                         sysLog.warning(emsg, getsysUSER_CD()); //�G���[���e
                         return;
                       }
                     }
              // insert Original Code ===================================================
                 //sysLog.setConnection(conn);
                 //this.msgStruct.clearAll();
              
                 String blnPlantTyp1 = null;
                 String plantTyp = null; // �H��w��^�C�v 1:�H��w�� 2:�S�H��
                 String plantCd = null;  // �H��R�[�h
              
                 // �O����̃N���A
                 this.list = null;
              //System.out.println("this.struct.getrdoPlantTyp()==" + this.struct.getrdoPlantTyp());
              //System.out.println("this.struct.getrdoPlantTyp1()==" + this.struct.getrdoPlantTyp1());
              //System.out.println("this.struct.getrdoPlantTyp2()==" + this.struct.getrdoPlantTyp2());
              //System.out.println("this.struct.gettxtPlantCd()==" + this.struct.gettxtPlantCd());
                 // ��ʏ��̎擾
                 blnPlantTyp1 = this.struct.getrdoPlantTyp1();
                 if (blnPlantTyp1.equals("true")) {
                  plantTyp = "1";
                 } else {
                  plantTyp = "2";
                 }
                 //plantTyp = this.struct.getrdoPlantTyp();
                 plantCd = this.struct.gettxtPlantCd();
              
                 // �H��w��̏ꍇ
                 if (plantTyp.equals("1")) {
                  // �f�[�^��ǂݍ��݁Alist�ɕێ�������
                  try {
                   this.list = entity.mreadMPlant.read(conn, this.struct);
                  } catch(SQLException e) {
                   //sysLog.severe("AC00999", sysUSER_CD); // SQL���s���G���[�B
                   //throw new AlarmMessageException("AC00999", new String[0]); // SQL���s���G���[�B�L�[�l�Ȃ�
                   ExpjMessage emsg = new ExpjMessage("AC00999",new String[0]);
                   msgStruct.addError( emsg );
                   ExpjException ee = new ExpjException(e, emsg);
                   throw ee;
                  }
                  // �f�[�^������΁A�o�b�`���������s����
                  if (this.list != null && this.list.size() > 0) {
                   // �o�b�`�����̎��s
                   executeBatchProgram(plantCd);
                  } else {
                   //sysLog.info("KV00302", sysUSER_CD); // �H��f�[�^�����݂��܂���B
                   //AlarmMessage almMsg = new AlarmMessage("KV00302", new String[0]);
                   //msgStruct.getWarn().add(almMsg.getMessage());
                   ExpjMessage emsg = new ExpjMessage("KV03001",new String[0]);
                   msgStruct.addError( emsg );
                   return ;
                  }
              
                 // �S�H��̏ꍇ
                 } else {
                  plantCd = ""; // �_�~�[������(���̒l�͎g���Ȃ�)
                  // �o�b�`�����̎��s
                  executeBatchProgram(plantCd);
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
              
                //}}user_implement_dev:<controlexecute>
		logger.exiting("KV0030010Control"+":USER="+struct.getsUser_ID(),"controlexecute");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KV0030");
		logger.entering("KV0030010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                 //sysLog.setConnection(conn);
                 this.msgStruct.clearAll();
              
                 // �����l���Z�b�g
                 struct.setrdoPlantTyp("1");             // �H��w��^�C�v "1"�F�H��w��
                 struct.settxtPlantCd(getsysPLANT_CD()); // �H��R�[�h ���H��R�[�h
                //}}user_implement_dev:<controlclear>
		logger.exiting("KV0030010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KV0030");
		logger.entering("KV0030010Control"+":USER="+struct.getsUser_ID(),"controlclose");
			//{{user_implement_dev:<controlclose>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlclose>
		logger.exiting("KV0030010Control"+":USER="+struct.getsUser_ID(),"controlclose");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KV0030");
		logger.entering("KV0030010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KV0030010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KV0030");
		logger.entering("KV0030010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                try {
                 struct.clear();
                 // ��ʋN�����̏����l���Z�b�g
                 struct.settxtPlantCd(getsysPLANT_CD());
                 // =======================================
                 // ���p�ҏ��̎擾
                 // =======================================
                 struct.setstrUSER_CD(struct.getsUser_ID());
                 List listUserInfo = entity.mgetUserInfo.read(conn,struct);
                 if(listUserInfo == null || listUserInfo.size() != 1){
                  //���[�U��񂪖���/������
                  ExpjMessage emsg = new ExpjMessage("KQ00025");
                  msgStruct.addError(emsg);	// �G���[���b�Z�[�W�Ƃ��ēo�^
                  sysLog.warning(emsg, getsysUSER_CD()); //�G���[���e
                  ExpjException ee = new ExpjException(emsg);
                  throw ee;
              
                 }else{
                  struct.setstrUSER_NAME(((KV0030010Struct)listUserInfo.get(0)).getstrUSER_NAME());
                  struct.setstrPLANT_CD(((KV0030010Struct)listUserInfo.get(0)).getstrPLANT_CD());
                  struct.setstrSECTION_CD(((KV0030010Struct)listUserInfo.get(0)).getstrSECTION_CD());
                  struct.setstrORG_CD(((KV0030010Struct)listUserInfo.get(0)).getstrORG_CD());
                  struct.setstrORG_NAME(((KV0030010Struct)listUserInfo.get(0)).getstrORG_NAME());
                  struct.setstrORG_ANAME(((KV0030010Struct)listUserInfo.get(0)).getstrORG_ANAME());
                  struct.setstrPLANT_NAME(((KV0030010Struct)listUserInfo.get(0)).getstrPLANT_NAME());
                  struct.setstrPLANT_ANAME(((KV0030010Struct)listUserInfo.get(0)).getstrPLANT_ANAME());
                  struct.setstrCAL_NO(((KV0030010Struct)listUserInfo.get(0)).getstrCAL_NO());
              
                 }
                 listUserInfo = null;
                }catch(SQLException e){
                 e.printStackTrace();
              
                 // �G���[���b�Z�[�W�쐬
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
                 ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
              
              
                 emsg = new ExpjMessage( "ZZ01006", e.toString());
                 sysLog.severe(emsg ,getsysUSER_CD()); //�G�N�Z�v�V�����̏ڍ׏��
              
                 msgStruct.addError(emsg);
              
                 throw ee;
              
                }catch(ExpjException ee){
                  throw ee;
                }catch(Exception e){
                  e.printStackTrace();
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106");
                  sysLog.severe(emsg, struct.getsUser_ID());
                  ExpjException ee = new ExpjException(e,emsg);
                  emsg = new ExpjMessage( "AA99991");
                  sysLog.severe(emsg, struct.getsUser_ID());
                  emsg = new ExpjMessage( "ZZ01106",e.toString());
                  sysLog.severe(emsg, struct.getsUser_ID());
                  throw ee;
                }
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KV0030010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KV0030");
		logger.entering("KV0030010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("KV0030010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
              //		�\�[�X���ɂ܂�AlarmMessageException���c���Ă���ꍇ�́A�ȉ��̍s�̃R�����g���O����AlarmMessageException���n������B
              //		} catch(AlarmMessageException ame){
              //			ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
              //			throw ee;
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// �g���b�Z�[�W�o�͈˗��쐬
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("KV0030010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KV0030010-E999","CSV�̏o�͏���"));
			throw new FoundationException("KV0030010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KV0030010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("KV0030010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KV0030010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("KV0030010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected KV0030010Entity entity;
	protected KV0030010Struct struct;
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

		entity = new KV0030010Entity();
		struct = new KV0030010Struct();

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
	 * KV0030010�N���X�̕W���R���X�g���N�^
	 */
	public KV0030010Control() throws BusinessProcessException, FoundationException
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
				KV0030010Struct key = (KV0030010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("rdoPlantTyp1") && key.getrdoPlantTyp1() != null) {
					msgKey.setKeyValue("rdoPlantTyp1", key.getrdoPlantTyp1());
				}
				if(msgKeyType.containsKeyColumn("rdoPlantTyp2") && key.getrdoPlantTyp2() != null) {
					msgKey.setKeyValue("rdoPlantTyp2", key.getrdoPlantTyp2());
				}
				if(msgKeyType.containsKeyColumn("rdoPlantTyp") && key.getrdoPlantTyp() != null) {
					msgKey.setKeyValue("rdoPlantTyp", key.getrdoPlantTyp());
				}
				if(msgKeyType.containsKeyColumn("SYS_PARAM_NAME") && key.getSYS_PARAM_NAME() != null) {
					msgKey.setKeyValue("SYS_PARAM_NAME", key.getSYS_PARAM_NAME());
				}
				if(msgKeyType.containsKeyColumn("SYS_PARAM_VALUE") && key.getSYS_PARAM_VALUE() != null) {
					msgKey.setKeyValue("SYS_PARAM_VALUE", key.getSYS_PARAM_VALUE());
				}
				if(msgKeyType.containsKeyColumn("plantCd") && key.getplantCd() != null) {
					msgKey.setKeyValue("plantCd", key.getplantCd());
				}
				if(msgKeyType.containsKeyColumn("txtPlantCd") && key.gettxtPlantCd() != null) {
					msgKey.setKeyValue("txtPlantCd", key.gettxtPlantCd());
				}
				if(msgKeyType.containsKeyColumn("strUSER_NAME") && key.getstrUSER_NAME() != null) {
					msgKey.setKeyValue("strUSER_NAME", key.getstrUSER_NAME());
				}
				if(msgKeyType.containsKeyColumn("strPLANT_CD") && key.getstrPLANT_CD() != null) {
					msgKey.setKeyValue("strPLANT_CD", key.getstrPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("strSECTION_CD") && key.getstrSECTION_CD() != null) {
					msgKey.setKeyValue("strSECTION_CD", key.getstrSECTION_CD());
				}
				if(msgKeyType.containsKeyColumn("strORG_CD") && key.getstrORG_CD() != null) {
					msgKey.setKeyValue("strORG_CD", key.getstrORG_CD());
				}
				if(msgKeyType.containsKeyColumn("strORG_NAME") && key.getstrORG_NAME() != null) {
					msgKey.setKeyValue("strORG_NAME", key.getstrORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("strORG_ANAME") && key.getstrORG_ANAME() != null) {
					msgKey.setKeyValue("strORG_ANAME", key.getstrORG_ANAME());
				}
				if(msgKeyType.containsKeyColumn("strPLANT_NAME") && key.getstrPLANT_NAME() != null) {
					msgKey.setKeyValue("strPLANT_NAME", key.getstrPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("strPLANT_ANAME") && key.getstrPLANT_ANAME() != null) {
					msgKey.setKeyValue("strPLANT_ANAME", key.getstrPLANT_ANAME());
				}
				if(msgKeyType.containsKeyColumn("strCAL_NO") && key.getstrCAL_NO() != null) {
					msgKey.setKeyValue("strCAL_NO", key.getstrCAL_NO().toString());
				}
				if(msgKeyType.containsKeyColumn("strUSER_CD") && key.getstrUSER_CD() != null) {
					msgKey.setKeyValue("strUSER_CD", key.getstrUSER_CD());
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
					KV0030010Struct key = new KV0030010Struct();
					if(msgKeyType.containsKeyColumn("rdoPlantTyp1")) {
						key.setrdoPlantTyp1(msgKey.getKeyValue("rdoPlantTyp1"));
					}
					if(msgKeyType.containsKeyColumn("rdoPlantTyp2")) {
						key.setrdoPlantTyp2(msgKey.getKeyValue("rdoPlantTyp2"));
					}
					if(msgKeyType.containsKeyColumn("rdoPlantTyp")) {
						key.setrdoPlantTyp(msgKey.getKeyValue("rdoPlantTyp"));
					}
					if(msgKeyType.containsKeyColumn("SYS_PARAM_NAME")) {
						key.setSYS_PARAM_NAME(msgKey.getKeyValue("SYS_PARAM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("SYS_PARAM_VALUE")) {
						key.setSYS_PARAM_VALUE(msgKey.getKeyValue("SYS_PARAM_VALUE"));
					}
					if(msgKeyType.containsKeyColumn("plantCd")) {
						key.setplantCd(msgKey.getKeyValue("plantCd"));
					}
					if(msgKeyType.containsKeyColumn("txtPlantCd")) {
						key.settxtPlantCd(msgKey.getKeyValue("txtPlantCd"));
					}
					if(msgKeyType.containsKeyColumn("strUSER_NAME")) {
						key.setstrUSER_NAME(msgKey.getKeyValue("strUSER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("strPLANT_CD")) {
						key.setstrPLANT_CD(msgKey.getKeyValue("strPLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("strSECTION_CD")) {
						key.setstrSECTION_CD(msgKey.getKeyValue("strSECTION_CD"));
					}
					if(msgKeyType.containsKeyColumn("strORG_CD")) {
						key.setstrORG_CD(msgKey.getKeyValue("strORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("strORG_NAME")) {
						key.setstrORG_NAME(msgKey.getKeyValue("strORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("strORG_ANAME")) {
						key.setstrORG_ANAME(msgKey.getKeyValue("strORG_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("strPLANT_NAME")) {
						key.setstrPLANT_NAME(msgKey.getKeyValue("strPLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("strPLANT_ANAME")) {
						key.setstrPLANT_ANAME(msgKey.getKeyValue("strPLANT_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("strCAL_NO")) {
						key.setstrCAL_NO(new Double(msgKey.getKeyValue("strCAL_NO")));
					}
					if(msgKeyType.containsKeyColumn("strUSER_CD")) {
						key.setstrUSER_CD(msgKey.getKeyValue("strUSER_CD"));
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
