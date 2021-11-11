/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DB0100/src/com/nec/jp/orteus/metamorBase/DB0100/DB0100010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.DB0100;

import com.nec.jp.orteus.metamorBase.DB0100.*;
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

import java.io.*;
import jp.co.fit.vfreport.*;
//{{user_implement_code_import
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class DB0100010Control
{

	//////////////////////////////
	// �A�N�Z�T���\�b�h�����`���܂�
	// Business�I�u�W�F�N�g�A�N�Z�T���\�b�h
	private Business business;
	public Business getBusiness() { return this.business; }
	public void setBusiness( Business obj ) { this.business = obj; }

	// PDF�p�A�N�Z�T���\�b�h
	private String queryFileName = null;
	public String getQueryfileName() { return this.queryFileName; }
	public void setQueryFileName(String queryFileName) { this.queryFileName = queryFileName; }
	private String frmFileName = null;
	public String getFrmfileName() { return this.frmFileName; }
	public void setFrmFileName(String frmFileName) { this.frmFileName = frmFileName; }
	private String pdfFileName = null;
	public String getPdfFileName() { return this.pdfFileName; }
	public void setPdfFileName(String pdfFileName) { this.pdfFileName = pdfFileName; }
	private String dbUID = null;
	private String dbPWD = null;
	private String dbDBQ = null;
	private String dbKIND = null;
	private String pdfFilePath = null;
	public String getPdfFilePath() { return this.pdfFilePath; }
	public void setPdfFilePath(String pdfFilePath) { this.pdfFilePath = pdfFilePath; }

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
        protected List list; // �ꗗ�����̌��ʃ��X�g����ʂɕ\�����邽�߂̃��X�g�C���X�^���X
       
        // �f�t�H���g�A�N�Z�T���\�b�h
        public List getList() {
         return this.list;
        } // ���X�g��Ԃ��܂��B
        public void setList(List listname) {
         this.list = listname;
        } // ���X�g���Z�b�g���܂��B
        public int getListsize() { // ���X�g�^�̃T�C�Y��Ԃ��܂��B
         int nret = 0;
         if (this.list != null) {
          nret = this.list.size();
         }
         return nret;
        }
        //	public Object getListvalue(int x) { return this.list.get(x); }	// ���X�g�̒l��Ԃ��܂��B
        public DB0100010Struct getListvalue(int x) {
         return (DB0100010Struct) (this.list.get(x));
        } // ���X�g�̒l��Ԃ��܂��B
        public DB0100010Struct getStruct() {
         return this.struct;
        } // Struct��Ԃ��܂��B
        public DB0100010Struct createStruct() {
         return new DB0100010Struct();
        } // �V����Struct������ĕԂ��܂��B
        public void setStruct(Object structname) {
         this.struct.setStruct((DB0100010Struct) structname);
        } // Struct���Z�b�g���܂��B
        public void initializeStruct() {
         this.struct.initialize();
        } // Struct�̒l�����������܂��B
       
        // CSV�o�͗p���X�g
        private CsvWriter csvWriter = null;
        public CsvWriter getCsvWriter() {
         return this.csvWriter;
        }
       
        private CsvReader csvReader = null;
        public void setCsvReader(CsvReader cr) {
         this.csvReader = cr;
        }
       
        // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
        /** �������ʣ�R���{�{�b�N�X�f�[�^ */
        private ComboStruct _costTypComboStruct = new ComboStruct();
       
        /**
         * �Ɩ����W�b�N�̃C���t�H���[�V�������b�Z�[�W�ݒ菈����؂�o���Ċ֐���
         * @param code ���b�Z�[�W�R�[�h
         */
        private void setInformationMessage(String code) {
         ExpjMessage emsg = new ExpjMessage(code);
         msgStruct.addInfo(emsg);
        }
        /**
         * �Ɩ����W�b�N�̃��[�j���O���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
         * @param code ���b�Z�[�W�R�[�h
         */
        private void setWarningMessage(String code) {
         ExpjMessage emsg = new ExpjMessage(code);
         msgStruct.addWarn(emsg);
         sysLog.info(emsg, sysUSER_CD);
        }
        /**
         * �Ɩ����W�b�N�̃��[�j���O���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
         * @param code ���b�Z�[�W�R�[�h
         * @param value1 �u��������P
         */
        private void setWarningMessage(String code, String value1) {
         ExpjMessage emsg = new ExpjMessage(code, value1);
         msgStruct.addWarn(emsg);
         sysLog.info(emsg, sysUSER_CD);
        }
        /**
         * �Ɩ����W�b�N�̃G���[���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
         * @param code ���b�Z�[�W�R�[�h
         */
        private void setErrorMessage(String code) {
         ExpjMessage emsg = new ExpjMessage(code);
         msgStruct.addError(emsg);
         sysLog.warning(emsg, sysUSER_CD);
        }
        /**
         * �Ɩ����W�b�N�̃G���[���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
         * @param code ���b�Z�[�W�R�[�h
         * @param value1 �u��������P
         */
        private void setErrorMessage(String code, String value1) {
         ExpjMessage emsg = new ExpjMessage(code, value1);
         msgStruct.addError(emsg);
         sysLog.warning(emsg, sysUSER_CD);
        }
        /**
         * �Ɩ����[�j���O�������̃p�����[�^�ݒ菈����؂�o���Ċ֐���
         * @param tableName �e�[�u����
         * @param columnName �J������
         * @param value �l
         */
        private void setWarningParameter(String tableName, String columnName, String value) {
         StringBuffer param = new StringBuffer();
         param.append(tableName);
         param.append('.');
         param.append(columnName);
         param.append(':');
         if (value != null) {
          param.append(value);
         }
       
         ExpjMessage emsg = new ExpjMessage("ZZ01006", param.toString());
         msgStruct.addWarn(emsg);
         sysLog.info(emsg, sysUSER_CD);
        }
        /**
         * �Ɩ��G���[�������̃p�����[�^�ݒ菈����؂�o���Ċ֐���
         * @param tableName �e�[�u����
         * @param columnName �J������
         * @param value �l
         */
        private void setErrorParameter(String tableName, String columnName, String value) {
         StringBuffer param = new StringBuffer();
         param.append(tableName);
         param.append('.');
         param.append(columnName);
         param.append(':');
         if (value != null) {
          param.append(value);
         }
       
         ExpjMessage emsg = new ExpjMessage("ZZ01006", param.toString());
         msgStruct.addError(emsg);
         sysLog.warning(emsg, sysUSER_CD);
        }
       
        /**
         * Struct�̒l���Z�b�g���܂��B
         * @param s ���������f�[�^
         */
        private void setStruct(DB0100010Struct s) {
         struct.setDB0010B001_0_COUNT(s.getDB0010B001_0_COUNT());
         struct.setDB0010B001_1_COUNT(s.getDB0010B001_1_COUNT());
         struct.setDB0020B001_0_COUNT(s.getDB0020B001_0_COUNT());
         struct.setDB0020B001_1_COUNT(s.getDB0020B001_1_COUNT());
         struct.setDB0030B001_0_COUNT(s.getDB0030B001_0_COUNT());
         struct.setDB0030B001_1_COUNT(s.getDB0030B001_1_COUNT());
         struct.setDB0040B001_0_COUNT(s.getDB0040B001_0_COUNT());
         struct.setDB0040B001_1_COUNT(s.getDB0040B001_1_COUNT());
        }
       
        /**
         * ��ʂ̑S���ڂ����������܂��B
         */
        private void initializeAll() {
         struct.setPLANT_CD(sysPLANT_CD);
         struct.setCOST_TYP("1");
         struct.setCREATED_BY(null);
       
         initializeDetail();
        }
       
        /**
         * ��ʂ̏ڍ׍��ڂ����������܂��B
         */
        private void initializeDetail() {
         struct.setPLANT_NAME(null);
         struct.setDB0010B001_0_COUNT("0");
         struct.setDB0010B001_1_COUNT("0");
         struct.setDB0020B001_0_COUNT("0");
         struct.setDB0020B001_1_COUNT("0");
         struct.setDB0030B001_0_COUNT("0");
         struct.setDB0030B001_1_COUNT("0");
         struct.setDB0040B001_0_COUNT("0");
         struct.setDB0040B001_1_COUNT("0");
         struct.setc_DB0010B001("true");
         struct.setc_DB0020B001("true");
         struct.setc_DB0030B001("true");
         struct.setc_DB0040B001("true");
         struct.setc_ReOut(null);
       
         list = null;
       
         readStatus = INITIAL;
        }
	//�R���{�{�b�N�X�̐����擾�i������j
	public String multcombo(String comname,String value) throws BusinessProcessException, FoundationException {
		try {
			ComboBox com = new ComboBox(conn, sysUSER_CD);
			ComboStruct _comstruct = new ComboStruct();
			_comstruct = com.getData(comname);
			for (int j = 0; j < _comstruct.size(); j++) {
				if ((_comstruct.getData(j)[0]).equals(value)) {
					return _comstruct.getData(j)[1];
				}
			}
			return null;
		}catch(Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}
	}  
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DB0100");
		logger.entering("DB0100010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
                try {
                 // �L�[�ȊO�̍��ڂ�������
                 initializeDetail();
              
                 // �L�[�ɑ΂��閼�̍��ڂ�����
                 // �H�ꖼ
                 List mPlantList = entity.mM_PLANT.read(conn, struct);
                 if (mPlantList.isEmpty()) {
                  setErrorMessage("ZZ11001");
                  setErrorParameter("M_PLANT", "PLANT_CD", struct.getPLANT_CD());
                  struct.setPLANT_NAME(null);
                 } else {
                  DB0100010Struct mPlantStruct = (DB0100010Struct) mPlantList.get(0);
                  struct.setPLANT_NAME(mPlantStruct.getPLANT_NAME());
                 }
                 // ���[�U��
                 if (struct.getCREATED_BY() != null && struct.getCREATED_BY().length() != 0) {
                  List userMstList = entity.mUSER_MST.read(conn, struct);
                  if (userMstList.isEmpty()) {
                   // ���[�U���͎擾�ł��Ȃ��ꍇ�ɃG���[�ɂ��Ȃ�
                   struct.setUSER_NAME(null);
                  } else {
                   DB0100010Struct userMstStruct = (DB0100010Struct) userMstList.get(0);
                   struct.setUSER_NAME(userMstStruct.getUSER_NAME());
                  }
                 } else {
                  struct.setUSER_NAME(null);
                 }
                 // �G���[���������珈���𒆒f
                 if (msgStruct.hasError()) {
                  return;
                 }
              
                 // ���׏�������
                 List formList = entity.mForm.read(conn, struct);
                 // ���׏�񂪑��݂��Ȃ��ꍇ�̓G���[
                 if (formList.isEmpty()) {
                  setErrorMessage("ZZ06001");
                  setErrorParameter("T_CS_ERROR", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("T_CS_ERROR", "COST_TYP", struct.getCOST_TYP());
                  setErrorParameter("T_CS_ERROR", "CREATED_BY", struct.getCREATED_BY());
                  return;
                 }
              
                 // �f�[�^���擾
                 DB0100010Struct formStruct = (DB0100010Struct) formList.get(0);
              
                 // �f�[�^�擾SQL�̍\����K��1������͂��Ȃ̂�
                 // �S�Ẵ��R�[�h������0�̏ꍇ�ɑΏۃf�[�^�����G���[�ɂ���
                 if (Calculate.compare(formStruct.getDB0010B001_0_COUNT(), "0") == 0
                  && Calculate.compare(formStruct.getDB0010B001_1_COUNT(), "0") == 0
                  && Calculate.compare(formStruct.getDB0020B001_0_COUNT(), "0") == 0
                  && Calculate.compare(formStruct.getDB0020B001_1_COUNT(), "0") == 0
                  && Calculate.compare(formStruct.getDB0030B001_0_COUNT(), "0") == 0
                  && Calculate.compare(formStruct.getDB0030B001_1_COUNT(), "0") == 0
                  && Calculate.compare(formStruct.getDB0040B001_0_COUNT(), "0") == 0
                  && Calculate.compare(formStruct.getDB0040B001_1_COUNT(), "0") == 0) {
                  setErrorMessage("ZZ06001");
                  setErrorParameter("T_CS_ERROR", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("T_CS_ERROR", "COST_TYP", struct.getCOST_TYP());
                  setErrorParameter("T_CS_ERROR", "CREATED_BY", struct.getCREATED_BY());
                  return;
                 }
              
                 // ��ʂɕ\��
                 setStruct(formStruct);
              
                 readStatus = NORMAL;
              
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlSelect>
		logger.exiting("DB0100010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * ���[�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlPrint() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DB0100");
		logger.entering("DB0100010Control"+":USER="+struct.getsUser_ID(),"controlPrint");
			DB0100010Struct strPdf = null;

		int ret = 0;
		String printType      = getPdfOutputType();
		String printPattern   = getPdfOutputListPattern();
		String printer        = getPdfOutputPrinter();
		SvfWrapper svf        = new SvfWrapper(printType, getsysUSER_CD(), printer);

			//{{user_implement_dev:<controlPrint>
                try {
              
                 // ���[�p�f�[�^���Č���
                 if ("true".equals(struct.getc_ReOut())) {
                  struct.setLIST_ISS_FLG(null);
                 } else {
                  struct.setLIST_ISS_FLG("0");
                 }
              
                 if ("true".equals(struct.getc_DB0010B001())) {
                  struct.setCREATED_PRG_NM_1("DB0010");
                 } else {
                  struct.setCREATED_PRG_NM_1(null);
                 }
                 if ("true".equals(struct.getc_DB0020B001())) {
                  struct.setCREATED_PRG_NM_2("DB0020");
                 } else {
                  struct.setCREATED_PRG_NM_2(null);
                 }
                 if ("true".equals(struct.getc_DB0030B001())) {
                  struct.setCREATED_PRG_NM_3("DB0030");
                 } else {
                  struct.setCREATED_PRG_NM_3(null);
                 }
                 if ("true".equals(struct.getc_DB0040B001())) {
                  struct.setCREATED_PRG_NM_4("DB0040");
                 } else {
                  struct.setCREATED_PRG_NM_4(null);
                 }
              
                 list = entity.mPdf.read(conn, struct);
                 if (list.isEmpty()) {
                  setErrorMessage("ZZ06001");
                  setErrorParameter("T_CS_ERROR", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("T_CS_ERROR", "COST_TYP", struct.getCOST_TYP());
                  setErrorParameter("T_CS_ERROR", "CREATED_BY", struct.getCREATED_BY());
                  return;
                 }
                 struct.setDOWNLOAD_FILE(null);	// �_�E�����[�h�t�@�C�����N���A
                 String printId1 = "DB01000101"; // ���[ID���w�肵�Ă�������
                
                 ret = svf.VrInit(printId1); // PDF�쐬�J�n
                 pdfFilePath = svf.getPdfFilePath(); // pdf�t���p�X�t�@�C����
                 pdfFileName = svf.getPdfFileName(); // pdf�t�@�C�����iWeb�p�j
                 // �N�G���[�t�@�C���̎w�� 
     			if (dbKIND != null && !dbKIND.equals("")) {
     				ret = svf.VrSetQuery("KIND=" + dbKIND + ";UID=" + dbUID
     						+ ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);
     			} else {
     				ret = svf.VrSetQuery("UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ="
     						+ dbDBQ);
     			}

     			// �u���[�o�́v�{�^�����������ꂽ�ꍇ
     			//�H��R�[�h�擾
     			 ret = svf.VrCondition("[X|PLANT_CD]=" + struct.getPLANT_CD(),4);
     			 //������ʎ擾
     			 ret = svf.VrCondition("[X|COST_TYP]=" + struct.getCOST_TYP(),4);
     			 //���s���[�U�R�[�h�擾
     			 if("".equals(struct.getCREATED_BY())||struct.getCREATED_BY()==null){
     				ret = svf.VrCondition("[X|CREATED_BY]=" + "%",4);
     			 }else{
     			 ret = svf.VrCondition("[X|CREATED_BY]=" + struct.getCREATED_BY(),4);
     			 }
     			 //���X�g�o�͍σt���O�擾
     			 if("true".equals(struct.getc_ReOut())){
     				ret = svf.VrCondition("[X|LIST_ISS_FLG]=" + "%",4);
     			 }else{
     				ret = svf.VrCondition("[X|LIST_ISS_FLG]=" + "0",4);
     			 }
     			 
     			 //�쐬�v���O�������擾
     			if ("".equals(struct.getCREATED_PRG_NM_1())|| struct.getCREATED_PRG_NM_1() == null) {
    				ret = svf.VrCondition("[X|CREATED_PRG_NM_1]=" + "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ", 4);
    			} else {
    				ret = svf.VrCondition("[X|CREATED_PRG_NM_1]=" + (struct.getCREATED_PRG_NM_1()+ "%"), 4);
    			}
     			if ("".equals(struct.getCREATED_PRG_NM_2())|| struct.getCREATED_PRG_NM_2() == null) {
    				ret = svf.VrCondition("[X|CREATED_PRG_NM_2]=" + "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ", 4);
    			} else {
    				ret = svf.VrCondition("[X|CREATED_PRG_NM_2]=" + (struct.getCREATED_PRG_NM_2()+ "%"), 4);
    			}
     			if ("".equals(struct.getCREATED_PRG_NM_3())|| struct.getCREATED_PRG_NM_3() == null) {
    				ret = svf.VrCondition("[X|CREATED_PRG_NM_3]=" + "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ", 4);
    			} else {
    				ret = svf.VrCondition("[X|CREATED_PRG_NM_3]=" + (struct.getCREATED_PRG_NM_3()+ "%"), 4);
    			}
     			if ("".equals(struct.getCREATED_PRG_NM_4())|| struct.getCREATED_PRG_NM_4() == null) {
    				ret = svf.VrCondition("[X|CREATED_PRG_NM_4]=" + "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ", 4);
    			} else {
    				ret = svf.VrCondition("[X|CREATED_PRG_NM_4]=" + (struct.getCREATED_PRG_NM_4()+ "%"), 4);
    			}
    			//�X�V����
                entity.mT_CS_ERROR.update(conn, struct);
     			// �N�G���[���s 
    			ret = svf.VrReport();
    			if (ret == -554) {
    				ExpjMessage emsg = new ExpjMessage("ZZ06001");
    				msgStruct.addError(emsg);
    				sysLog.warning(emsg, sysUSER_CD);
    				return;
    			}  			
    			 //PDF�쐬�I�� 
    			ret = svf.VrQuit();
    			if ("0".equals(printType)) { // �N���C�A���g����̏ꍇ
    				struct.setDOWNLOAD_FILE(getPdfFileName());
    			} else if ("1".equals(printType)) {
    				try {
    					String acrobatPath = svf.getAcrobatPath();
    					String acrobatOption1 = svf.getAcrobatOption1();
    					String acrobatOption2 = svf.getAcrobatOption2();
    					String pdfPrinter = svf.getPrinter();
    					Runtime.getRuntime().exec(new String[]{acrobatPath, acrobatOption1, acrobatOption2, pdfFilePath, pdfPrinter});
    					//Runtime.getRuntime().exec(svf.getExecuteOutput());
    				} catch (IOException e) {
    					// �T�[�o������s���̃G���[�������L�q���Ă��������B
    				}
    			}
                 controlSelect();
              
                 conn.commit();
                 
                } catch (Exception e) {
                 e.printStackTrace();
                 ExpjMessage emsg = new ExpjMessage("ZZ01106");
                 sysLog.severe(emsg, getsysUSER_CD()); //�v���I�G���[ �G���[���e
                 ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
                 throw ee;
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
                //}}user_implement_dev:<controlPrint>
		logger.exiting("DB0100010Control"+":USER="+struct.getsUser_ID(),"controlPrint");

		return;
	}

	/**
	 * �o�͍ύ폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlIssDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DB0100");
		logger.entering("DB0100010Control"+":USER="+struct.getsUser_ID(),"controlIssDelete");
			//{{user_implement_dev:<controlIssDelete>
                try {
                 if ("true".equals(struct.getc_DB0010B001())) {
                  struct.setCREATED_PRG_NM_1("DB0010");
                 } else {
                  struct.setCREATED_PRG_NM_1(null);
                 }
                 if ("true".equals(struct.getc_DB0020B001())) {
                  struct.setCREATED_PRG_NM_2("DB0020");
                 } else {
                  struct.setCREATED_PRG_NM_2(null);
                 }
                 if ("true".equals(struct.getc_DB0030B001())) {
                  struct.setCREATED_PRG_NM_3("DB0030");
                 } else {
                  struct.setCREATED_PRG_NM_3(null);
                 }
                 if ("true".equals(struct.getc_DB0040B001())) {
                  struct.setCREATED_PRG_NM_4("DB0040");
                 } else {
                  struct.setCREATED_PRG_NM_4(null);
                 }
              
                 List tCsErrorList = entity.mT_CS_ERROR.read(conn, struct);
                 if (tCsErrorList.isEmpty()) {
                  setErrorMessage("ZZ06001");
                  setErrorParameter("T_CS_ERROR", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("T_CS_ERROR", "COST_TYP", struct.getCOST_TYP());
                  setErrorParameter("T_CS_ERROR", "CREATED_BY", struct.getCREATED_BY());
                  return;
                 }
              
                 for (Iterator i = tCsErrorList.iterator(); i.hasNext();) {
                  DB0100010Struct tCsErrorStruct = (DB0100010Struct) i.next();
                  struct.setCS_ERROR_CD(tCsErrorStruct.getCS_ERROR_CD());
                  entity.mT_CS_ERROR.delete(conn, struct);
                 }
              
                 conn.commit();
              
                 initializeAll();
              
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
                //}}user_implement_dev:<controlIssDelete>
		logger.exiting("DB0100010Control"+":USER="+struct.getsUser_ID(),"controlIssDelete");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DB0100");
		logger.entering("DB0100010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
                initializeAll();
                //}}user_implement_dev:<controlClear>
		logger.exiting("DB0100010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DB0100");
		logger.entering("DB0100010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("DB0100010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DB0100");
		logger.entering("DB0100010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                try {
                 // �R���{�{�b�N�X�f�[�^���擾
                 ComboBox comboBox = new ComboBox(conn, sysUSER_CD);
                 _costTypComboStruct = comboBox.getData("COST_TYP");
                 comboBox.setConnection(null);
                 // �R���{�{�b�N�X�f�[�^�̐ݒ�
                 struct.setList_COST_TYP_val(_costTypComboStruct.getValList());
                 struct.setList_COST_TYP_name(_costTypComboStruct.getExplanList());
              
                 // ��ʂ�������
                 initializeAll();
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("DB0100010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DB0100");
		logger.entering("DB0100010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
		struct.setDOWNLOAD_FILE((String)null);	// �_�E�����[�h�t�@�C�����N���A

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
                // �R���{�{�b�N�X�f�[�^�̐ݒ�
                struct.setList_COST_TYP_val(_costTypComboStruct.getValList());
                struct.setList_COST_TYP_name(_costTypComboStruct.getExplanList());
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("DB0100010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Print") ) {
				controlPrint();
			} else if( button.equals("IssDelete") ) {
				controlIssDelete();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// �g���b�Z�[�W�o�͈˗��쐬
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("DB0100010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
                //}}user_implement_dev:<createDefaultCSV>
		} catch( FoundationException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("DB0100010-E999","CSV�̏o�͏���"));
			throw new FoundationException("DB0100010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("DB0100010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("DB0100010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("DB0100010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("DB0100010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected DB0100010Entity entity;
	protected DB0100010Struct struct;
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

		entity = new DB0100010Entity();
		struct = new DB0100010Struct();

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
	 * DB0100010�N���X�̕W���R���X�g���N�^
	 */
	public DB0100010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
                try {
                	ResourceBundle bundle = SystemConfig.getBundle();
        			dbUID = SystemConfig.getProperty("CONNECT_DBUSER", bundle);
        			dbPWD = SystemConfig.getProperty("CONNECT_DBPASS", bundle);
        			dbDBQ = SystemConfig.getProperty("CONNECT_DBHOST", bundle);
        			dbKIND = SystemConfig.getProperty("CONNECT_KIND", bundle);
                } catch (MissingResourceException e) {
                 e.printStackTrace();
                }
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
				DB0100010Struct key = (DB0100010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("COST_TYP_name") && key.getCOST_TYP_name() != null) {
					msgKey.setKeyValue("COST_TYP_name", key.getCOST_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("COST_TYP_val") && key.getCOST_TYP_val() != null) {
					msgKey.setKeyValue("COST_TYP_val", key.getCOST_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("c_DB0010B001") && key.getc_DB0010B001() != null) {
					msgKey.setKeyValue("c_DB0010B001", key.getc_DB0010B001());
				}
				if(msgKeyType.containsKeyColumn("c_DB0020B001") && key.getc_DB0020B001() != null) {
					msgKey.setKeyValue("c_DB0020B001", key.getc_DB0020B001());
				}
				if(msgKeyType.containsKeyColumn("c_DB0030B001") && key.getc_DB0030B001() != null) {
					msgKey.setKeyValue("c_DB0030B001", key.getc_DB0030B001());
				}
				if(msgKeyType.containsKeyColumn("c_DB0040B001") && key.getc_DB0040B001() != null) {
					msgKey.setKeyValue("c_DB0040B001", key.getc_DB0040B001());
				}
				if(msgKeyType.containsKeyColumn("c_ReOut") && key.getc_ReOut() != null) {
					msgKey.setKeyValue("c_ReOut", key.getc_ReOut());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("DB0010B001_0_COUNT") && key.getDB0010B001_0_COUNT() != null) {
					msgKey.setKeyValue("DB0010B001_0_COUNT", key.getDB0010B001_0_COUNT());
				}
				if(msgKeyType.containsKeyColumn("DB0010B001_1_COUNT") && key.getDB0010B001_1_COUNT() != null) {
					msgKey.setKeyValue("DB0010B001_1_COUNT", key.getDB0010B001_1_COUNT());
				}
				if(msgKeyType.containsKeyColumn("DB0020B001_0_COUNT") && key.getDB0020B001_0_COUNT() != null) {
					msgKey.setKeyValue("DB0020B001_0_COUNT", key.getDB0020B001_0_COUNT());
				}
				if(msgKeyType.containsKeyColumn("DB0020B001_1_COUNT") && key.getDB0020B001_1_COUNT() != null) {
					msgKey.setKeyValue("DB0020B001_1_COUNT", key.getDB0020B001_1_COUNT());
				}
				if(msgKeyType.containsKeyColumn("DB0030B001_0_COUNT") && key.getDB0030B001_0_COUNT() != null) {
					msgKey.setKeyValue("DB0030B001_0_COUNT", key.getDB0030B001_0_COUNT());
				}
				if(msgKeyType.containsKeyColumn("DB0030B001_1_COUNT") && key.getDB0030B001_1_COUNT() != null) {
					msgKey.setKeyValue("DB0030B001_1_COUNT", key.getDB0030B001_1_COUNT());
				}
				if(msgKeyType.containsKeyColumn("DB0040B001_0_COUNT") && key.getDB0040B001_0_COUNT() != null) {
					msgKey.setKeyValue("DB0040B001_0_COUNT", key.getDB0040B001_0_COUNT());
				}
				if(msgKeyType.containsKeyColumn("DB0040B001_1_COUNT") && key.getDB0040B001_1_COUNT() != null) {
					msgKey.setKeyValue("DB0040B001_1_COUNT", key.getDB0040B001_1_COUNT());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("COST_TYP") && key.getCOST_TYP() != null) {
					msgKey.setKeyValue("COST_TYP", key.getCOST_TYP());
				}
				if(msgKeyType.containsKeyColumn("CREATED_BY") && key.getCREATED_BY() != null) {
					msgKey.setKeyValue("CREATED_BY", key.getCREATED_BY());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("USER_NAME") && key.getUSER_NAME() != null) {
					msgKey.setKeyValue("USER_NAME", key.getUSER_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROGRAM_CD") && key.getPROGRAM_CD() != null) {
					msgKey.setKeyValue("PROGRAM_CD", key.getPROGRAM_CD());
				}
				if(msgKeyType.containsKeyColumn("PROGRAM_NAME") && key.getPROGRAM_NAME() != null) {
					msgKey.setKeyValue("PROGRAM_NAME", key.getPROGRAM_NAME());
				}
				if(msgKeyType.containsKeyColumn("COST_TYP_DN") && key.getCOST_TYP_DN() != null) {
					msgKey.setKeyValue("COST_TYP_DN", key.getCOST_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("CS_ERROR_CD") && key.getCS_ERROR_CD() != null) {
					msgKey.setKeyValue("CS_ERROR_CD", key.getCS_ERROR_CD());
				}
				if(msgKeyType.containsKeyColumn("BATCH_TYP_DN") && key.getBATCH_TYP_DN() != null) {
					msgKey.setKeyValue("BATCH_TYP_DN", key.getBATCH_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("CS_PROC_CD") && key.getCS_PROC_CD() != null) {
					msgKey.setKeyValue("CS_PROC_CD", key.getCS_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_CLS_CD") && key.getPROC_COST_CLS_CD() != null) {
					msgKey.setKeyValue("PROC_COST_CLS_CD", key.getPROC_COST_CLS_CD());
				}
				if(msgKeyType.containsKeyColumn("EFFECTIVE_START_DATE") && key.getEFFECTIVE_START_DATE() != null) {
					msgKey.setKeyValue("EFFECTIVE_START_DATE", key.getEFFECTIVE_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("TRANSACTION_TYP_DN") && key.getTRANSACTION_TYP_DN() != null) {
					msgKey.setKeyValue("TRANSACTION_TYP_DN", key.getTRANSACTION_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("MESSAGE_CD") && key.getMESSAGE_CD() != null) {
					msgKey.setKeyValue("MESSAGE_CD", key.getMESSAGE_CD());
				}
				if(msgKeyType.containsKeyColumn("MESSAGE") && key.getMESSAGE() != null) {
					msgKey.setKeyValue("MESSAGE", key.getMESSAGE());
				}
				if(msgKeyType.containsKeyColumn("REMARKS") && key.getREMARKS() != null) {
					msgKey.setKeyValue("REMARKS", key.getREMARKS());
				}
				if(msgKeyType.containsKeyColumn("LIST_ISS_FLG") && key.getLIST_ISS_FLG() != null) {
					msgKey.setKeyValue("LIST_ISS_FLG", key.getLIST_ISS_FLG());
				}
				if(msgKeyType.containsKeyColumn("CREATED_DATE") && key.getCREATED_DATE() != null) {
					msgKey.setKeyValue("CREATED_DATE", key.getCREATED_DATE());
				}
				if(msgKeyType.containsKeyColumn("CREATED_PRG_NM_1") && key.getCREATED_PRG_NM_1() != null) {
					msgKey.setKeyValue("CREATED_PRG_NM_1", key.getCREATED_PRG_NM_1());
				}
				if(msgKeyType.containsKeyColumn("CREATED_PRG_NM_2") && key.getCREATED_PRG_NM_2() != null) {
					msgKey.setKeyValue("CREATED_PRG_NM_2", key.getCREATED_PRG_NM_2());
				}
				if(msgKeyType.containsKeyColumn("CREATED_PRG_NM_3") && key.getCREATED_PRG_NM_3() != null) {
					msgKey.setKeyValue("CREATED_PRG_NM_3", key.getCREATED_PRG_NM_3());
				}
				if(msgKeyType.containsKeyColumn("CREATED_PRG_NM_4") && key.getCREATED_PRG_NM_4() != null) {
					msgKey.setKeyValue("CREATED_PRG_NM_4", key.getCREATED_PRG_NM_4());
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
					DB0100010Struct key = new DB0100010Struct();
					if(msgKeyType.containsKeyColumn("COST_TYP_name")) {
						key.setCOST_TYP_name(msgKey.getKeyValue("COST_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("COST_TYP_val")) {
						key.setCOST_TYP_val(msgKey.getKeyValue("COST_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("c_DB0010B001")) {
						key.setc_DB0010B001(msgKey.getKeyValue("c_DB0010B001"));
					}
					if(msgKeyType.containsKeyColumn("c_DB0020B001")) {
						key.setc_DB0020B001(msgKey.getKeyValue("c_DB0020B001"));
					}
					if(msgKeyType.containsKeyColumn("c_DB0030B001")) {
						key.setc_DB0030B001(msgKey.getKeyValue("c_DB0030B001"));
					}
					if(msgKeyType.containsKeyColumn("c_DB0040B001")) {
						key.setc_DB0040B001(msgKey.getKeyValue("c_DB0040B001"));
					}
					if(msgKeyType.containsKeyColumn("c_ReOut")) {
						key.setc_ReOut(msgKey.getKeyValue("c_ReOut"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("DB0010B001_0_COUNT")) {
						key.setDB0010B001_0_COUNT(msgKey.getKeyValue("DB0010B001_0_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("DB0010B001_1_COUNT")) {
						key.setDB0010B001_1_COUNT(msgKey.getKeyValue("DB0010B001_1_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("DB0020B001_0_COUNT")) {
						key.setDB0020B001_0_COUNT(msgKey.getKeyValue("DB0020B001_0_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("DB0020B001_1_COUNT")) {
						key.setDB0020B001_1_COUNT(msgKey.getKeyValue("DB0020B001_1_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("DB0030B001_0_COUNT")) {
						key.setDB0030B001_0_COUNT(msgKey.getKeyValue("DB0030B001_0_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("DB0030B001_1_COUNT")) {
						key.setDB0030B001_1_COUNT(msgKey.getKeyValue("DB0030B001_1_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("DB0040B001_0_COUNT")) {
						key.setDB0040B001_0_COUNT(msgKey.getKeyValue("DB0040B001_0_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("DB0040B001_1_COUNT")) {
						key.setDB0040B001_1_COUNT(msgKey.getKeyValue("DB0040B001_1_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("COST_TYP")) {
						key.setCOST_TYP(msgKey.getKeyValue("COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CREATED_BY")) {
						key.setCREATED_BY(msgKey.getKeyValue("CREATED_BY"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("USER_NAME")) {
						key.setUSER_NAME(msgKey.getKeyValue("USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROGRAM_CD")) {
						key.setPROGRAM_CD(msgKey.getKeyValue("PROGRAM_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROGRAM_NAME")) {
						key.setPROGRAM_NAME(msgKey.getKeyValue("PROGRAM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("COST_TYP_DN")) {
						key.setCOST_TYP_DN(msgKey.getKeyValue("COST_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("CS_ERROR_CD")) {
						key.setCS_ERROR_CD(msgKey.getKeyValue("CS_ERROR_CD"));
					}
					if(msgKeyType.containsKeyColumn("BATCH_TYP_DN")) {
						key.setBATCH_TYP_DN(msgKey.getKeyValue("BATCH_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("CS_PROC_CD")) {
						key.setCS_PROC_CD(msgKey.getKeyValue("CS_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_CLS_CD")) {
						key.setPROC_COST_CLS_CD(msgKey.getKeyValue("PROC_COST_CLS_CD"));
					}
					if(msgKeyType.containsKeyColumn("EFFECTIVE_START_DATE")) {
						key.setEFFECTIVE_START_DATE(msgKey.getKeyValue("EFFECTIVE_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("TRANSACTION_TYP_DN")) {
						key.setTRANSACTION_TYP_DN(msgKey.getKeyValue("TRANSACTION_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("MESSAGE_CD")) {
						key.setMESSAGE_CD(msgKey.getKeyValue("MESSAGE_CD"));
					}
					if(msgKeyType.containsKeyColumn("MESSAGE")) {
						key.setMESSAGE(msgKey.getKeyValue("MESSAGE"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS")) {
						key.setREMARKS(msgKey.getKeyValue("REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("LIST_ISS_FLG")) {
						key.setLIST_ISS_FLG(msgKey.getKeyValue("LIST_ISS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("CREATED_DATE")) {
						key.setCREATED_DATE(msgKey.getKeyValue("CREATED_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CREATED_PRG_NM_1")) {
						key.setCREATED_PRG_NM_1(msgKey.getKeyValue("CREATED_PRG_NM_1"));
					}
					if(msgKeyType.containsKeyColumn("CREATED_PRG_NM_2")) {
						key.setCREATED_PRG_NM_2(msgKey.getKeyValue("CREATED_PRG_NM_2"));
					}
					if(msgKeyType.containsKeyColumn("CREATED_PRG_NM_3")) {
						key.setCREATED_PRG_NM_3(msgKey.getKeyValue("CREATED_PRG_NM_3"));
					}
					if(msgKeyType.containsKeyColumn("CREATED_PRG_NM_4")) {
						key.setCREATED_PRG_NM_4(msgKey.getKeyValue("CREATED_PRG_NM_4"));
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
