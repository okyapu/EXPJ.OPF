/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AN0080/src/com/nec/jp/orteus/metamorBase/AN0080/AN0080010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AN0080;

import com.nec.jp.orteus.metamorBase.AN0080.*;
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
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AN0080010Control
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
        public AN0080010Struct getListvalue(int x) { return (AN0080010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
        public AN0080010Struct getStruct() { return this.struct; }	// Struct��Ԃ��܂��B
        public AN0080010Struct createStruct() { return new AN0080010Struct(); }	// �V����Struct������ĕԂ��܂��B
        public void setStruct(Object structname) { this.struct.setStruct((AN0080010Struct)structname); }	// Struct���Z�b�g���܂��B
        public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B
       
        // CSV�o�͗p���X�g
        private CsvWriter csvWriter = null;
        public CsvWriter getCsvWriter(){ return this.csvWriter; }
       
        private CsvReader csvReader = null;
        public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
       
        /**
         * ��ʂ����������܂��B
         *
         * @throws FoundationException
         * @throws ExpjException �T�[�o�[�G���[
         */
        private void initializeScreen()
          throws FoundationException, ExpjException
        {
         // struct��������
         struct.initialize();
         // �H��R�[�h�̏����l��ݒ�
         struct.setPLANT_CD(getsysPLANT_CD());
       
         // list��������
         if (list != null) {
          list.clear();
         }
       
         // �Ǎ���ԁi������ԁj��ݒ�
         setReadStatus(INITIAL);
        }
       
        /**
         * �f�[�^�������������Ă����ꍇ�̃��b�Z�[�W��\�����܂��B
         *
         * @param tableAndKeys �A�N�Z�X�����e�[�u�����ƃL�[��
         */
        private void doModifyError(String tableAndKeys)
        {
         // �x���F���̏����ɂ��f�[�^�������������Ă��܂��B
         // 		���j���[�ɖ߂��Ă�蒼���ĉ������B
         ExpjMessage emsg = new ExpjMessage("ZZ01105");
         msgStruct.addError(emsg);
         sysLog.warning(emsg, getsysUSER_CD());
         emsg = new ExpjMessage("ZZ01006", tableAndKeys);
         msgStruct.addError(emsg);
         sysLog.warning(emsg, getsysUSER_CD());
        }
       
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AN0080");
		logger.entering("AN0080010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
              
                String tableAndKeys = null;
              
                try {
                 AN0080010Struct workStruct = null;
              
                 // �Ǎ��L�[���c���āAStruct���N���A
                 String plantCd = struct.getPLANT_CD();
                 initializeScreen();
                 struct.setPLANT_CD(plantCd);
              
                 // �H��R�[�h������
                 tableAndKeys = "M_PLANT.PLANT_CD:" + struct.getPLANT_CD();
                 List workList = entity.mSelectM_PLANT.read(conn, struct);
                 if (workList == null || workList.isEmpty()) {
                  // �Ǎ���ԁi�Ǎ����s�j��ݒ�
                  setReadStatus(ERROR);
                  //�u�H��R�[�h�v���m�H��n�ɑ��݂��Ȃ��ꍇ
                  // �x���F�H��R�[�h�����݂��܂���B
                  ExpjMessage emsg = new ExpjMessage("AN00001");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  return;
                 }
              
                 // �H�ꖼ���Z�b�g
                 workStruct = (AN0080010Struct)workList.get(0);
                 struct.setPLANT_NAME(workStruct.getPLANT_NAME());
              
                 // �̔ԃe�[�u��������
                 tableAndKeys = "SYS_ISSUE_INST_CD_CTRL,SYS_OPR_INST_CD_CTRL,SYS_PUCH_ODR_CD_CTRL,"
                   + "SYS_TRANSPORT_SLIP_CD_CTRL,SYS_JOB_ODR_CD_CTRL,SYS_WORK_ODR_CD_CTRL,"
                   + "SYS_EXTERNAL_PLAN_CD_CTRL,M_PLANT.PLANT_CD:" + struct.getPLANT_CD();
                 workList = entity.mSelect.read(conn, struct);
                 // ���ӎ����F���1���f�[�^�����݂���̂ŁA�ȉ���if����False�ɂȂ�B
                 if (workList == null || workList.isEmpty()) {
                  // �Ǎ���ԁi�O���Ǎ��j��ݒ�
                  setReadStatus(NOT_FOUND);
                  //�u�H��R�[�h�v���m�H��n�ɑ��݂��Ȃ��ꍇ
                  // �x���F�H��R�[�h�����݂��܂���B
                  ExpjMessage emsg = new ExpjMessage("AN00001");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  return;
                 }
              
                 workStruct = (AN0080010Struct)workList.get(0);
                 if (workStruct.getISSUE_INST_CD().equals(" ")) {
                  //�u�H��R�[�h�v���m�o�Ɏw���ԍ��̔ԁn�ɑ��݂��Ȃ��ꍇ
                  // �x���F�o�Ɏw���ԍ��̔ԂɑΏۃf�[�^�����݂��܂���B
                  tableAndKeys = "SYS_ISSUE_INST_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  ExpjMessage emsg = new ExpjMessage("AN08008");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                 }
                 if (workStruct.getOPR_INST_CD().equals(" ")) {
                  //�u�H��R�[�h�v���m��Ǝw���ԍ��̔ԁn�ɑ��݂��Ȃ��ꍇ
                  // �x���F��Ǝw���ԍ��̔ԂɑΏۃf�[�^�����݂��܂���B
                  tableAndKeys = "SYS_OPR_INST_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  ExpjMessage emsg = new ExpjMessage("AN08009");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                 }
                 if (workStruct.getPUCH_ODR_CD().equals(" ")) {
                  //�u�H��R�[�h�v���m�����ԍ��̔ԁn�ɑ��݂��Ȃ��ꍇ
                  // �x���F�����ԍ��̔ԂɑΏۃf�[�^�����݂��܂���B
                  tableAndKeys = "SYS_PUCH_ODR_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  ExpjMessage emsg = new ExpjMessage("AN08010");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                 }
                 if (workStruct.getTRANSPORT_SLIP_CD().equals(" ")) {
                  //�u�H��R�[�h�v���m�ϑ��`�[�ԍ��̔ԁn�ɑ��݂��Ȃ��ꍇ
                  // �x���F�ϑ��`�[�ԍ��̔ԂɑΏۃf�[�^�����݂��܂���B
                  tableAndKeys = "SYS_TRANSPORT_SLIP_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  ExpjMessage emsg = new ExpjMessage("AN08011");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                 }
                 if (workStruct.getJOB_ODR_CD().equals(" ")) {
                  //�u�H��R�[�h�v���m���ԍ̔ԁn�ɑ��݂��Ȃ��ꍇ
                  // �x���F���ԍ̔ԂɑΏۃf�[�^�����݂��܂���B
                  tableAndKeys = "SYS_JOB_ODR_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  ExpjMessage emsg = new ExpjMessage("AN08012");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                 }
                 if (workStruct.getWORK_ODR_CD().equals(" ")) {
                  //�u�H��R�[�h�v���m��ƌv��ԍ��̔ԁn�ɑ��݂��Ȃ��ꍇ
                  // �x���F��ƌv��ԍ��̔ԂɑΏۃf�[�^�����݂��܂���B
                  tableAndKeys = "SYS_WORK_ODR_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  ExpjMessage emsg = new ExpjMessage("AN08013");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                 }
                 if (workStruct.getEXTERNAL_PLAN_CD().equals(" ")) {
                  //�u�H��R�[�h�v���m�O���v��ԍ��̔ԁn�ɑ��݂��Ȃ��ꍇ
                  // �x���F�O���v��ԍ��̔ԂɑΏۃf�[�^�����݂��܂���B
                  tableAndKeys = "SYS_EXTERNAL_PLAN_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  ExpjMessage emsg = new ExpjMessage("AN08014");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                 }
                 if (msgStruct.sizeError() > 0) {
                  // �G���[�������͏������f
                  return;
                 }
              
                 // �ҏW�̈���Z�b�g
                 struct.copyStructEditArea(workStruct);
              
                 // �Ǎ���ԁi�Ǎ������j��ݒ�
                 setReadStatus(NORMAL);
              
                } catch (SQLException se) {
                 // �Ǎ���ԁi�Ǎ����s�j��ݒ�
                 setReadStatus(ERROR);
                 // �G���[�F�T�[�o�ŃG���[���������܂����B
                 ExpjMessage emsg = new ExpjMessage("ZZ01106");
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(se, emsg);
                 emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                 sysLog.severe(emsg, getsysUSER_CD());
                 emsg = new ExpjMessage("ZZ01006", se.toString());
                 sysLog.severe(emsg, getsysUSER_CD());
                 throw ee;
                }
              
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AN0080010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AN0080");
		logger.entering("AN0080010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
              
                String tableAndKeys = null;
                try {
                 List workList = null;
                 AN0080010Struct workStruct = null;
                 int dummyRet = 0;
              
                 // �g�����U�N�V�������J�n
                 conn.beginTransWeb();
              
                 // �o�Ɏw���ԍ��̔�
                 if (struct.getISSUE_INST_CD().equals(struct.geth_ISSUE_INST_CD()) == false) {
                  // �X�V�����`�F�b�N
                  tableAndKeys = "SYS_ISSUE_INST_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  workList = entity.mSelectForUpdateISSUE_INST_CD.read(conn, struct);
                  if (workList == null || workList.isEmpty()) {
                   // �X�V�����ύX����Ă����ꍇ�i�폜�ς������ꍇ�j
                   doModifyError(tableAndKeys);
                   return;
                  }
                  workStruct = (AN0080010Struct)workList.get(0);
                  if (workStruct.geth_IssueInst_MODIFY_COUNT().equals(
                    struct.geth_IssueInst_MODIFY_COUNT()) == false) {
                   // �X�V�����ύX����Ă����ꍇ
                   doModifyError(tableAndKeys);
                   return;
                  }
                  // �o�Ɏw���ԍ��̔Ԃ��X�V
                  tableAndKeys = "SYS_ISSUE_INST_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  dummyRet = entity.mUpdateSYS_ISSUE_INST_CD_CTRL.update(conn, struct);
                 }
              
                 // ��Ǝw���ԍ��̔�
                 if (struct.getOPR_INST_CD().equals(struct.geth_OPR_INST_CD()) == false) {
                  // �X�V�����`�F�b�N
                  tableAndKeys = "SYS_OPR_INST_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  workList = entity.mSelectForUpdateOPR_INST_CD.read(conn, struct);
                  if (workList == null || workList.isEmpty()) {
                   // �X�V�����ύX����Ă����ꍇ�i�폜�ς������ꍇ�j
                   doModifyError(tableAndKeys);
                   return;
                  }
                  workStruct = (AN0080010Struct)workList.get(0);
                  if (workStruct.geth_OprInst_MODIFY_COUNT().equals(
                    struct.geth_OprInst_MODIFY_COUNT()) == false) {
                   // �X�V�����ύX����Ă����ꍇ
                   doModifyError(tableAndKeys);
                   return;
                  }
                  // ��Ǝw���ԍ��̔Ԃ��X�V
                  tableAndKeys = "SYS_OPR_INST_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  dummyRet = entity.mUpdateSYS_OPR_INST_CD_CTRL.update(conn, struct);
                 }
              
                 // �����ԍ��̔�
                 if (struct.getPUCH_ODR_CD().equals(struct.geth_PUCH_ODR_CD()) == false) {
                  // �X�V�����`�F�b�N
                  tableAndKeys = "SYS_PUCH_ODR_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  workList = entity.mSelectForUpdatePUCH_ODR_CD.read(conn, struct);
                  if (workList == null || workList.isEmpty()) {
                   // �X�V�����ύX����Ă����ꍇ�i�폜�ς������ꍇ�j
                   doModifyError(tableAndKeys);
                   return;
                  }
                  workStruct = (AN0080010Struct)workList.get(0);
                  if (workStruct.geth_PuchOdr_MODIFY_COUNT().equals(
                    struct.geth_PuchOdr_MODIFY_COUNT()) == false) {
                   // �X�V�����ύX����Ă����ꍇ
                   doModifyError(tableAndKeys);
                   return;
                  }
                  // �����ԍ��̔Ԃ��X�V
                  tableAndKeys = "SYS_PUCH_ODR_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  dummyRet = entity.mUpdateSYS_PUCH_ODR_CD_CTRL.update(conn, struct);
                 }
              
                 // �ϑ��`�[�ԍ��̔�
                 if (struct.getTRANSPORT_SLIP_CD().equals(struct.geth_TRANSPORT_SLIP_CD()) == false) {
                  // �X�V�����`�F�b�N
                  tableAndKeys = "SYS_TRANSPORT_SLIP_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  workList = entity.mSelectForUpdateTRANSPORT_SLIP_CD.read(conn, struct);
                  if (workList == null || workList.isEmpty()) {
                   // �X�V�����ύX����Ă����ꍇ�i�폜�ς������ꍇ�j
                   doModifyError(tableAndKeys);
                   return;
                  }
                  workStruct = (AN0080010Struct)workList.get(0);
                  if (workStruct.geth_TransportSlip_MODIFY_COUNT().equals(
                    struct.geth_TransportSlip_MODIFY_COUNT()) == false) {
                   // �X�V�����ύX����Ă����ꍇ
                   doModifyError(tableAndKeys);
                   return;
                  }
                  // �ϑ��`�[�ԍ��̔Ԃ��X�V
                  tableAndKeys = "SYS_TRANSPORT_SLIP_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  dummyRet = entity.mUpdateSYS_TRANSPORT_SLIP_CD_CTRL.update(conn, struct);
                 }
              
                 // ���ԍ̔�
                 if (struct.getJOB_ODR_CD_PREFIX().equals(struct.geth_JOB_ODR_CD_PREFIX()) == false
                   || struct.getJOB_ODR_CD().equals(struct.geth_JOB_ODR_CD()) == false) {
                  // �X�V�����`�F�b�N
                  tableAndKeys = "SYS_JOB_ODR_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  workList = entity.mSelectForUpdateJOB_ODR_CD.read(conn, struct);
                  if (workList == null || workList.isEmpty()) {
                   // �X�V�����ύX����Ă����ꍇ�i�폜�ς������ꍇ�j
                   doModifyError(tableAndKeys);
                   return;
                  }
                  workStruct = (AN0080010Struct)workList.get(0);
                  if (workStruct.geth_JobOdr_MODIFY_COUNT().equals(
                    struct.geth_JobOdr_MODIFY_COUNT()) == false) {
                   // �X�V�����ύX����Ă����ꍇ
                   doModifyError(tableAndKeys);
                   return;
                  }
                  // ���ԍ̔Ԃ��X�V
                  tableAndKeys = "SYS_JOB_ODR_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  dummyRet = entity.mUpdateSYS_JOB_ODR_CD_CTRL.update(conn, struct);
                 }
              
                 // ��ƌv��ԍ��̔�
                 if (struct.getWORK_ODR_CD().equals(struct.geth_WORK_ODR_CD()) == false) {
                  // �X�V�����`�F�b�N
                  tableAndKeys = "SYS_WORK_ODR_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  workList = entity.mSelectForUpdateWORK_ODR_CD.read(conn, struct);
                  if (workList == null || workList.isEmpty()) {
                   // �X�V�����ύX����Ă����ꍇ�i�폜�ς������ꍇ�j
                   doModifyError(tableAndKeys);
                   return;
                  }
                  workStruct = (AN0080010Struct)workList.get(0);
                  if (workStruct.geth_WorkOdr_MODIFY_COUNT().equals(
                    struct.geth_WorkOdr_MODIFY_COUNT()) == false) {
                   // �X�V�����ύX����Ă����ꍇ
                   doModifyError(tableAndKeys);
                   return;
                  }
                  // ��ƌv��ԍ��̔Ԃ��X�V
                  tableAndKeys = "SYS_WORK_ODR_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  dummyRet = entity.mUpdateSYS_WORK_ODR_CD_CTRL.update(conn, struct);
                 }
              
                 // �O���v��ԍ��̔�
                 if (struct.getEXTERNAL_PLAN_CD().equals(struct.geth_EXTERNAL_PLAN_CD()) == false) {
                  // �X�V�����`�F�b�N
                  tableAndKeys = "SYS_EXTERNAL_PLAN_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  workList = entity.mSelectForUpdateEXTERNAL_PLAN_CD.read(conn, struct);
                  if (workList == null || workList.isEmpty()) {
                   // �X�V�����ύX����Ă����ꍇ�i�폜�ς������ꍇ�j
                   doModifyError(tableAndKeys);
                   return;
                  }
                  workStruct = (AN0080010Struct)workList.get(0);
                  if (workStruct.geth_ExternalPlan_MODIFY_COUNT().equals(
                    struct.geth_ExternalPlan_MODIFY_COUNT()) == false) {
                   // �X�V�����ύX����Ă����ꍇ
                   doModifyError(tableAndKeys);
                   return;
                  }
                  // �O���v��ԍ��̔Ԃ��X�V
                  tableAndKeys = "SYS_EXTERNAL_PLAN_CD_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  dummyRet = entity.mUpdateSYS_EXTERNAL_PLAN_CD_CTRL.update(conn, struct);
                 }
              
                 // �f�[�^���m��
                 conn.commit();
              
                 // �X�V��̃f�[�^��\��
                 controlSelect();
              
                } catch (SQLException se) {
                 // �G���[�F�T�[�o�ŃG���[���������܂����B
                 ExpjMessage emsg = new ExpjMessage("ZZ01106");
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(se, emsg);
                 emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                 sysLog.severe(emsg, getsysUSER_CD());
                 emsg = new ExpjMessage("ZZ01006", se.toString());
                 sysLog.severe(emsg, getsysUSER_CD());
                 throw ee;
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
              
                //}}user_implement_dev:<controlUpdate>
		logger.exiting("AN0080010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AN0080");
		logger.entering("AN0080010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
              
                // ��ʂ�������
                initializeScreen();
              
                //}}user_implement_dev:<controlClear>
		logger.exiting("AN0080010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AN0080");
		logger.entering("AN0080010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("AN0080010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AN0080");
		logger.entering("AN0080010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AN0080010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AN0080");
		logger.entering("AN0080010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
              
                // ��ʂ�������
                initializeScreen();
              
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AN0080010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AN0080");
		logger.entering("AN0080010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AN0080010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("Select") ) {
				controlSelect();
			} else if( button.equals("Update") ) {
				controlUpdate();
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
//			throw new FoundationException("AN0080010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AN0080010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AN0080010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AN0080010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AN0080010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AN0080010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AN0080010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AN0080010Entity entity;
	protected AN0080010Struct struct;
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

		entity = new AN0080010Entity();
		struct = new AN0080010Struct();

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
	 * AN0080010�N���X�̕W���R���X�g���N�^
	 */
	public AN0080010Control() throws BusinessProcessException, FoundationException
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
				AN0080010Struct key = (AN0080010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("ISSUE_INST_CD") && key.getISSUE_INST_CD() != null) {
					msgKey.setKeyValue("ISSUE_INST_CD", key.getISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("h_IssueInst_MODIFY_COUNT") && key.geth_IssueInst_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_IssueInst_MODIFY_COUNT", key.geth_IssueInst_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD") && key.getOPR_INST_CD() != null) {
					msgKey.setKeyValue("OPR_INST_CD", key.getOPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("h_OprInst_MODIFY_COUNT") && key.geth_OprInst_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_OprInst_MODIFY_COUNT", key.geth_OprInst_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("h_PuchOdr_MODIFY_COUNT") && key.geth_PuchOdr_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_PuchOdr_MODIFY_COUNT", key.geth_PuchOdr_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("TRANSPORT_SLIP_CD") && key.getTRANSPORT_SLIP_CD() != null) {
					msgKey.setKeyValue("TRANSPORT_SLIP_CD", key.getTRANSPORT_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("h_TransportSlip_MODIFY_COUNT") && key.geth_TransportSlip_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_TransportSlip_MODIFY_COUNT", key.geth_TransportSlip_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD_PREFIX") && key.getJOB_ODR_CD_PREFIX() != null) {
					msgKey.setKeyValue("JOB_ODR_CD_PREFIX", key.getJOB_ODR_CD_PREFIX());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("h_JobOdr_MODIFY_COUNT") && key.geth_JobOdr_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_JobOdr_MODIFY_COUNT", key.geth_JobOdr_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_CD") && key.getWORK_ODR_CD() != null) {
					msgKey.setKeyValue("WORK_ODR_CD", key.getWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("h_WorkOdr_MODIFY_COUNT") && key.geth_WorkOdr_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_WorkOdr_MODIFY_COUNT", key.geth_WorkOdr_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("EXTERNAL_PLAN_CD") && key.getEXTERNAL_PLAN_CD() != null) {
					msgKey.setKeyValue("EXTERNAL_PLAN_CD", key.getEXTERNAL_PLAN_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ExternalPlan_MODIFY_COUNT") && key.geth_ExternalPlan_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_ExternalPlan_MODIFY_COUNT", key.geth_ExternalPlan_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("h_ISSUE_INST_CD") && key.geth_ISSUE_INST_CD() != null) {
					msgKey.setKeyValue("h_ISSUE_INST_CD", key.geth_ISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("h_OPR_INST_CD") && key.geth_OPR_INST_CD() != null) {
					msgKey.setKeyValue("h_OPR_INST_CD", key.geth_OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("h_WORK_ODR_CD") && key.geth_WORK_ODR_CD() != null) {
					msgKey.setKeyValue("h_WORK_ODR_CD", key.geth_WORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("h_PUCH_ODR_CD") && key.geth_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("h_PUCH_ODR_CD", key.geth_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("h_TRANSPORT_SLIP_CD") && key.geth_TRANSPORT_SLIP_CD() != null) {
					msgKey.setKeyValue("h_TRANSPORT_SLIP_CD", key.geth_TRANSPORT_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("h_EXTERNAL_PLAN_CD") && key.geth_EXTERNAL_PLAN_CD() != null) {
					msgKey.setKeyValue("h_EXTERNAL_PLAN_CD", key.geth_EXTERNAL_PLAN_CD());
				}
				if(msgKeyType.containsKeyColumn("h_JOB_ODR_CD_PREFIX") && key.geth_JOB_ODR_CD_PREFIX() != null) {
					msgKey.setKeyValue("h_JOB_ODR_CD_PREFIX", key.geth_JOB_ODR_CD_PREFIX());
				}
				if(msgKeyType.containsKeyColumn("h_JOB_ODR_CD") && key.geth_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("h_JOB_ODR_CD", key.geth_JOB_ODR_CD());
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
					AN0080010Struct key = new AN0080010Struct();
					if(msgKeyType.containsKeyColumn("ISSUE_INST_CD")) {
						key.setISSUE_INST_CD(msgKey.getKeyValue("ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_IssueInst_MODIFY_COUNT")) {
						key.seth_IssueInst_MODIFY_COUNT(msgKey.getKeyValue("h_IssueInst_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD")) {
						key.setOPR_INST_CD(msgKey.getKeyValue("OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_OprInst_MODIFY_COUNT")) {
						key.seth_OprInst_MODIFY_COUNT(msgKey.getKeyValue("h_OprInst_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_PuchOdr_MODIFY_COUNT")) {
						key.seth_PuchOdr_MODIFY_COUNT(msgKey.getKeyValue("h_PuchOdr_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("TRANSPORT_SLIP_CD")) {
						key.setTRANSPORT_SLIP_CD(msgKey.getKeyValue("TRANSPORT_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_TransportSlip_MODIFY_COUNT")) {
						key.seth_TransportSlip_MODIFY_COUNT(msgKey.getKeyValue("h_TransportSlip_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD_PREFIX")) {
						key.setJOB_ODR_CD_PREFIX(msgKey.getKeyValue("JOB_ODR_CD_PREFIX"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_JobOdr_MODIFY_COUNT")) {
						key.seth_JobOdr_MODIFY_COUNT(msgKey.getKeyValue("h_JobOdr_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_CD")) {
						key.setWORK_ODR_CD(msgKey.getKeyValue("WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_WorkOdr_MODIFY_COUNT")) {
						key.seth_WorkOdr_MODIFY_COUNT(msgKey.getKeyValue("h_WorkOdr_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("EXTERNAL_PLAN_CD")) {
						key.setEXTERNAL_PLAN_CD(msgKey.getKeyValue("EXTERNAL_PLAN_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ExternalPlan_MODIFY_COUNT")) {
						key.seth_ExternalPlan_MODIFY_COUNT(msgKey.getKeyValue("h_ExternalPlan_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("h_ISSUE_INST_CD")) {
						key.seth_ISSUE_INST_CD(msgKey.getKeyValue("h_ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_OPR_INST_CD")) {
						key.seth_OPR_INST_CD(msgKey.getKeyValue("h_OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_WORK_ODR_CD")) {
						key.seth_WORK_ODR_CD(msgKey.getKeyValue("h_WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_PUCH_ODR_CD")) {
						key.seth_PUCH_ODR_CD(msgKey.getKeyValue("h_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_TRANSPORT_SLIP_CD")) {
						key.seth_TRANSPORT_SLIP_CD(msgKey.getKeyValue("h_TRANSPORT_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_EXTERNAL_PLAN_CD")) {
						key.seth_EXTERNAL_PLAN_CD(msgKey.getKeyValue("h_EXTERNAL_PLAN_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_JOB_ODR_CD_PREFIX")) {
						key.seth_JOB_ODR_CD_PREFIX(msgKey.getKeyValue("h_JOB_ODR_CD_PREFIX"));
					}
					if(msgKeyType.containsKeyColumn("h_JOB_ODR_CD")) {
						key.seth_JOB_ODR_CD(msgKey.getKeyValue("h_JOB_ODR_CD"));
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
