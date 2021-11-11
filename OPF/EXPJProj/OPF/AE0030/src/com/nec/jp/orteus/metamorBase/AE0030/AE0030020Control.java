/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0030/src/com/nec/jp/orteus/metamorBase/AE0030/AE0030020Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0030;

import com.nec.jp.orteus.metamorBase.AE0030.*;
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
import java.io.*;
import jp.co.fit.vfreport.*;
//{{user_implement_code_import
import com.nec.jp.orteus.metamorBase.common04.sysdata.*;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AE0030020Control
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
        public AE0030020Struct getListvalue(int x) {
         return (AE0030020Struct) (this.list.get(x));
        } // ���X�g�̒l��Ԃ��܂��B
        public AE0030020Struct getStruct() {
         return this.struct;
        } // Struct��Ԃ��܂��B
        public AE0030020Struct createStruct() {
         return new AE0030020Struct();
        } // �V����Struct������ĕԂ��܂��B
        public void setStruct(Object structname) {
         this.struct.setStruct((AE0030020Struct) structname);
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
        /**
         * ��ʂ̑S���ڂ����������܂��B
         */
        public void initializeAll() {
         struct.setPLANT_CD(sysPLANT_CD);
         struct.setPUCH_ODR_START_DATE(null);
         struct.setPUCH_ODR_DLV_DATE(null);
         struct.setPUCH_ODR_CD(null);
         struct.setJOB_ODR_CD(null);
         struct.setVEND_CD(null);
         struct.setPUCH_ODR_PERSON(null);
         struct.setr1_FILTER1("true");
         struct.setr2_FILTER1(null);
         struct.setr1_FILTER2("true");
         struct.setr2_FILTER2(null);
         struct.setr1_FILTER3("true");
         struct.setr2_FILTER3(null);
         initializeDetail();
        }
       
        /**
         * ��ʂ̏ڍ׍��ڂ����������܂��B
         */
        public void initializeDetail() {
         struct.setPLANT_NAME(null);
         struct.setVEND_NAME(null);
         struct.setUSER_NAME(null);
       
         list = null;
         pdfList = null;
       
         readStatus = INITIAL;
        }
       
	/** �����Ǘ��p�t���O */
	private String _flgTimeCtrl = null;

        /**
         * �N���C�A���g��̃}�X�N���ڂ̒l���N���A���܂��B
         */
        private void clearDisabledField() {
         if ("true".equals(struct.getr1_FILTER1())) {
          struct.setPUCH_ODR_DLV_DATE(null);
         } else {
          struct.setPUCH_ODR_START_DATE(null);
         }
         if ("true".equals(struct.getr1_FILTER2())) {
          struct.setJOB_ODR_CD(null);
         } else {
          struct.setPUCH_ODR_CD(null);
         }
        }
       
        /**
         * �o�c�e�o�͗p���X�g
         */
        private List pdfList;


	/**
	 * ���������̐ݒ�
	 */
	private void setSearchCondition() {
		
		// �f�[�^�����N���A
		struct.setPUCH_ODR_START_DATE_ALL(null);
		struct.setPUCH_ODR_DLV_DATE_ALL(null);

		// ���o�����i���t�̐ݒ�j
		if(null != struct.getTIME_CTRL() && "true".equals(struct.getTIME_CTRL())){

	                if (struct.getPUCH_ODR_START_DATE() != null && !struct.getPUCH_ODR_START_DATE().equals("")) {
				//�����\����̎�����00:00�ȊO�̏ꍇ�˂��̂܂܌���
	                 	if (struct.getPUCH_ODR_START_TIME() != null && !struct.getPUCH_ODR_START_TIME().equals("")) {
			        	/** �����\����i�����܂ށj*/
					struct.setPUCH_ODR_START_DATE_ALL(struct.getPUCH_ODR_START_DATE() + " " + 
									struct.getPUCH_ODR_START_TIME().substring(0,2) + ":" + 
									struct.getPUCH_ODR_START_TIME().substring(2));
				//�����\����̎����������͂̏ꍇ��23:59�Ō���
				}else{
					/** �����\����i�����܂ށj*/
					struct.setPUCH_ODR_START_DATE_ALL(struct.getPUCH_ODR_START_DATE() + " 23:59");
				}
			}
	                if (struct.getPUCH_ODR_DLV_DATE() != null && !struct.getPUCH_ODR_DLV_DATE().equals("")) {
				//�����[���̎�����00:00�ȊO�̏ꍇ�˂��̂܂܌���
	                	if (struct.getPUCH_ODR_DLV_TIME() != null && !struct.getPUCH_ODR_DLV_TIME().equals("")) {
					/** �����[���i�����܂ށj*/
					struct.setPUCH_ODR_DLV_DATE_ALL(struct.getPUCH_ODR_DLV_DATE() + " " + 
									struct.getPUCH_ODR_DLV_TIME().substring(0,2) + ":" + 
									struct.getPUCH_ODR_DLV_TIME().substring(2));
				//�����[���̎����������͂̏ꍇ��23:59�Ō���
				}else{
					/** �����[���i�����܂ށj*/
					struct.setPUCH_ODR_DLV_DATE_ALL(struct.getPUCH_ODR_DLV_DATE() + " 23:59");
				}
			}
		}else{
	                if (struct.getPUCH_ODR_START_DATE() != null && !struct.getPUCH_ODR_START_DATE().equals("")) {
	                	/** �����\����i�����܂ށj*/
				struct.setPUCH_ODR_START_DATE_ALL(struct.getPUCH_ODR_START_DATE() + " 23:59");
			}
	                if (struct.getPUCH_ODR_DLV_DATE() != null && !struct.getPUCH_ODR_DLV_DATE().equals("")) {
	                	/** �����[���i�����܂ށj*/
				struct.setPUCH_ODR_DLV_DATE_ALL(struct.getPUCH_ODR_DLV_DATE() + " 23:59");
			}
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0030");
		logger.entering("AE0030020Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
                try {
                 // �}�X�N���ڂ̒l���N���A
                 clearDisabledField();
              
                 // �ڍ׍��ڂ��N���A
                 initializeDetail();
              
                 // �ϐ���`
                 AE0030020Struct aStruct = null;
              
                 // �H�ꖼ���������A���݂��Ȃ��ꍇ�̓G���[
                 List plantList = entity.mM_PLANT.read(conn, struct);
                 if (plantList.isEmpty()) {
                  setErrorMessage("AE00027");
                  setErrorParameter("M_PLANT", "PLANT_CD", struct.getPLANT_CD());
                 } else {
                  AE0030020Struct plantStruct = (AE0030020Struct) plantList.get(0);
                  struct.setPLANT_NAME(plantStruct.getPLANT_NAME());
                 }
                 // ����於���������A���݂��Ȃ��ꍇ�̓G���[
                 if (struct.getVEND_CD() != null && !struct.getVEND_CD().equals("")) {
                  List vandList = entity.mM_VEND_CTRL.read(conn, struct);
                  if (vandList.isEmpty()) {
                   setErrorMessage("AE20030");
                   setErrorParameter("M_VEND", "VEND_CD", struct.getVEND_CD());
                  } else {
                   AE0030020Struct vendStruct = (AE0030020Struct) vandList.get(0);
                   struct.setVEND_NAME(vendStruct.getVEND_NAME());
                  }
                 }
                 // �����S���Җ����������A���݂��Ȃ��ꍇ�̓G���[
                 if (struct.getPUCH_ODR_PERSON() != null && !struct.getPUCH_ODR_PERSON().equals("")) {
                  List userList = entity.mUSER_MST.read(conn, struct);
                  if (userList.isEmpty()) {
                   setErrorMessage("AE00005");
                   setErrorParameter("USER_MST", "USER_CD", struct.getPUCH_ODR_PERSON());
                  } else {
                   AE0030020Struct userStruct = (AE0030020Struct) userList.get(0);
                   struct.setUSER_NAME(userStruct.getUSER_NAME());
                  }
                 }
              
                 // �G���[������ΏI��
                 if (msgStruct.hasError()) {
                  return;
                 }
                 // �`�F�b�N�{�b�N�X�̒l��ݒ�
                 if ("true".equals(struct.getReOutputFlag())) {
                  struct.setPUCH_ODR_INST_SLIP_ISS_FLG("1");
                  struct.setPARTIAL_DELIV_SLIP_ISS_FLG("1");
                  // �����������t���O
                  struct.setODR_FORM_FLG(null);
                 } else {
                  struct.setPUCH_ODR_INST_SLIP_ISS_FLG("0");
                  struct.setPARTIAL_DELIV_SLIP_ISS_FLG("0");
                  // �����������t���O
                  struct.setODR_FORM_FLG("1");
                 }
              
		 //���͎����̃`�F�b�N(�����Ǘ�����ꍇ�̂�)
		 if((struct.getTIME_CTRL()).equals("true")){
				//�@�����\���(����)�̃`�F�b�N
				if((struct.getPUCH_ODR_START_TIME()).length() == 3 ){
					//�R���͓��ɂO��t����
					struct.setPUCH_ODR_START_TIME("0" + struct.getPUCH_ODR_START_TIME());
				}
				//�A�����[��(����)�̃`�F�b�N
				if((struct.getPUCH_ODR_DLV_TIME()).length() == 3 ){
					//�R���͓��ɂO��t����
					struct.setPUCH_ODR_DLV_TIME("0" + struct.getPUCH_ODR_DLV_TIME());
				}
		 }else{
			struct.setPUCH_ODR_START_TIME("");	
			struct.setPUCH_ODR_DLV_TIME("");
		 }
                	
		 // ���������̐ݒ�
		 setSearchCondition();
		 

		 			// �ő�\���s��
					int maxLine = sp.getMaxLine(conn, 10);
					if (maxLine != 0) {
						struct.setROW_COUNT(String.valueOf(maxLine));
					} else
						struct.setROW_COUNT(null);

					// ���X�g�f�[�^�̌���
					List viewList = new ArrayList();
					if("true".equals(struct.getr2_FILTER3())){
						viewList = entity.mViewCnt1.read(conn, struct);
					}else{
						viewList = entity.mViewCnt.read(conn, struct);
					}
					// pdfList = viewList;
					long rowCount = Long.parseLong(((AE0030020Struct) viewList.get(0))
							.getl_COUNT());
              
                 // �Ώی���=0���̏ꍇ�G���[
			if (rowCount == 0) {
				setErrorMessage("ZZ06001");
				setErrorParameter("T_RLSD_PUCH_ODR", "PLANT_CD", struct.getPLANT_CD());
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_START_DATE",struct.getPUCH_ODR_START_DATE());
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_DLV_DATE",struct.getPUCH_ODR_DLV_DATE());
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				setErrorParameter("T_OD", "JOB_ODR_CD", struct.getJOB_ODR_CD());
				setErrorParameter("T_RLSD_PUCH_ODR", "VEND_CD", struct.getVEND_CD());
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_PERSON", struct.getPUCH_ODR_PERSON());
				setErrorParameter("T_RLSD_PUCH_ODR","PUCH_ODR_INST_SLIP_ISS_FLG", struct.getPUCH_ODR_INST_SLIP_ISS_FLG());
				readStatus = NOT_FOUND;
				if(list !=null &&list.size()>0){
					list.clear();
				}
				return;
			}

                 if ((maxLine != 0) && (rowCount == maxLine + 1)) {
				setErrorMessage("ZZ01115", String.valueOf(maxLine));
				readStatus = TOO_MANY;
				if (list != null && list.size() > 0) {
					list.clear();
				}
				return;
			} else {

				// ���X�g�f�[�^�̌���
				// ���W�I�{�^���y���[�`�[�o�́z�Ō�������ꍇ
				if("true".equals(struct.getr2_FILTER3())){
				    viewList = entity.mView1.read(conn, struct);
				}else{
					viewList = entity.mView.read(conn, struct); 
				}
              
            pdfList = viewList;
			 // ���X�g�f�[�^��ݒ�
	                 setList(viewList);
			for (int i = 0; i < list.size(); i++) {
				aStruct = (AE0030020Struct)list.get(i);
			}
                 }           
                 // ���X�g�f�[�^��ݒ�
                 setList(viewList);
                 readStatus = NORMAL;
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AE0030020Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �������o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlPrint() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0030");
		logger.entering("AE0030020Control"+":USER="+struct.getsUser_ID(),"controlPrint");
			AE0030020Struct strPdf = null;

		int ret = 0;
		String printType      = getPdfOutputType();
		String printPattern   = getPdfOutputListPattern();
		String printer        = getPdfOutputPrinter();
		SvfWrapper svf        = new SvfWrapper(printType, getsysUSER_CD(), printer);

			//{{user_implement_dev:<controlPrint>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                try {
                 // �Č������Ĉ���̏ꍇ
                 if ("1".equals(printPattern)) {
                  // �Č������s��
                  controlSelect();
              
                  // �I��o�^�̏ꍇ
                 } else if ("3".equals(printPattern)) {
                  pdfList = new ArrayList();
              
                  // �I�����ڂ�pdfList�ɐݒ�
                  List selectedPuchOdrCd = struct.getList_l_PUCH_ODR_CD();
                  List selectedModifyCount = struct.getList_l_MODIFY_COUNT();
                  List selectedSlipIssFlg = struct.getList_l_PUCH_ODR_INST_SLIP_ISS_FLG();
                  for (int i = 0; i < selectedPuchOdrCd.size(); i++) {
                   AE0030020Struct s = new AE0030020Struct();
                   s.setl_PUCH_ODR_CD((String) selectedPuchOdrCd.get(i));
                   s.setl_MODIFY_COUNT((String) selectedModifyCount.get(i));
                   s.setl_PUCH_ODR_INST_SLIP_ISS_FLG((String)selectedSlipIssFlg.get(i));
                   pdfList.add(s);
                  }
                 }
              
                 // �G���[������A�܂��̓��X�g�����݂��Ȃ��ꍇ�͏������I��
                 if (msgStruct.hasError() || pdfList == null || pdfList.isEmpty()) {
                  return;
                 }
              
                 // �Ɩ��^�p���̎擾
                 String plantCd = struct.getPLANT_CD();
                 String businessOprDate = DateCtrlControl.getData(conn, plantCd).getBUSINESS_OPR_DATE();
              
                 //��������̊J�n
                 String printId1 = null;	// ���[ID�̏�����
                 if(struct.getReOutputFlag() != null && "true".equals(struct.getReOutputFlag())){
	                 printId1 = "AE00300202";	//�Ĕ��s�p���[ID���w�肵�Ă�������
                 }else{
                     printId1 = "AE00300201";	//�ʏ픭�s�p���[ID���w�肵�Ă�������
                 }
                 ret = svf.VrInit(printId1);	// PDF�쐬�J�n 
                 
                 pdfFilePath = svf.getPdfFilePath();	// pdf�t���p�X�t�@�C����
                 pdfFileName = svf.getPdfFileName();	// pdf�t�@�C�����iWeb�p�j
                 String excuteOutput = svf.getExcuteOutput();	// �T�[�o�o�͏���                 
                
                 List HOME_CUR_UNITList = entity.mHOME_CUR_UNIT.read(conn, null);
                 if (HOME_CUR_UNITList.isEmpty()) {
                	ExpjMessage emsg = new ExpjMessage("ZZ06001");
     				msgStruct.addError(emsg);
     				sysLog.warning(emsg, sysUSER_CD);
     				return;               
                 }
                 AE0030020Struct HOME_CUR_UNITStruct = (AE0030020Struct)HOME_CUR_UNITList.get(0);
                 String HOME_CUR_UNIT = HOME_CUR_UNITStruct.getM_CUR__HOME_CUR_UNIT();             
       			// �N�G���[�t�@�C���̎w�� 		
      			if (dbKIND != null && !dbKIND.equals("")) {
      				ret = svf.VrSetQuery("KIND=" + dbKIND + ";UID=" + dbUID
      						+ ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);
      			} else {
      				ret = svf.VrSetQuery("UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ="
      						+ dbDBQ);
      			}               
              
                 //�w�b�_�[���̃Z�b�g
              
                 //�f�[�^�̃Z�b�g
                 for (Iterator i = pdfList.iterator(); i.hasNext();) {
                	 AE0030020Struct pdfStruct = (AE0030020Struct) i.next();
                	 
                	 // �Ώۍs�̃��b�N
                	 List lockedList = entity.mT_RLSD_PUCH_ODR_Lock.read(conn, pdfStruct);
                	 // PDF�o�͂���L�[�����݂��Ȃ��ꍇ�̓G���[�B
                	 if (lockedList.isEmpty()) {
                		 setErrorMessage("ZZ01105");
                		 return;
                	 }
                	 // �ǂݍ��ݎ���"�X�V��"�ƈقȂ�ꍇ�̓G���[
                	 AE0030020Struct lockedStruct = (AE0030020Struct) lockedList.get(0);
                	 if (!lockedStruct.getMODIFY_COUNT().equals(pdfStruct.getl_MODIFY_COUNT())) {
                		 setErrorMessage("ZZ01105");
                		 return;
                	 }
                	                 	 
                	 // �N�G���[���o�����̎w��
                	 ret = svf.VrCondition("[X|PUCH_ODR_CD]=" + pdfStruct.getl_PUCH_ODR_CD(), 4);
                	 ret = svf.VrCondition("[X|HOME_CUR_UNIT]=" + HOME_CUR_UNIT, 4);
                	 // �N�G���[���s 
                	 ret = svf.VrReport();
            		 if (ret == -554) {
        				ExpjMessage emsg = new ExpjMessage("ZZ06001");
        				msgStruct.addError(emsg);
        				sysLog.warning(emsg, sysUSER_CD);
        				return;
        			 }
                	 //���񔭍s���f
            		 if("0".equals(pdfStruct.getl_PUCH_ODR_INST_SLIP_ISS_FLG())){
                	     // ���[�o�͓��X�V
                	     struct.setPUCH_ODR_SLIP_ISS_DATE(businessOprDate);
                	     struct.setl_PUCH_ODR_CD(pdfStruct.getl_PUCH_ODR_CD());
                	     entity.mT_RLSD_PUCH_ODR.update(conn, struct);
            		 }
                 }             
              
                 ret = svf.VrQuit(); // PDF�쐬�I��
              
                 if ("0".equals(printType)) { // �N���C�A���g����̏ꍇ
                  struct.setDOWNLOAD_FILE(getPdfFileName());
                 } else if ("1".equals(printType)) {
                  try {
                   String acrobatPath = svf.getAcrobatPath();
                   String acrobatOption1 = svf.getAcrobatOption1();
                   String acrobatOption2 = svf.getAcrobatOption2();
                   String pdfPrinter = svf.getPrinter();
                   Runtime.getRuntime().exec(new String[]{acrobatPath, acrobatOption1, acrobatOption2, pdfFilePath, pdfPrinter});
                   //Runtime.getRuntime().exec(excuteOutput);
                  } catch (IOException e) {
                   throw new ExpjException(e);
                  }
                 }
              
                 // �ēǍ�
                 controlSelect();
              
                 conn.commit();
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } catch (DataNotFoundException e) {
                 throw new ExpjException(e);
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
                //}}user_implement_dev:<controlPrint>
		logger.exiting("AE0030020Control"+":USER="+struct.getsUser_ID(),"controlPrint");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0030");
		logger.entering("AE0030020Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
              
                // ��ʂ�������
                initializeAll();
                try {
			//�����Ǘ��p�����[�^�擾
			List listTimeCtrl = entity.mSYS_PARAMETER.read(conn,struct);
			if(listTimeCtrl == null || listTimeCtrl.size() <=0){
				struct.setTIME_CTRL("false");
				_flgTimeCtrl = "false";
			}else{
				struct.setTIME_CTRL(((AE0030020Struct)listTimeCtrl.get(0)).getTIME_CTRL());
				_flgTimeCtrl = struct.getTIME_CTRL();
			}
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }

                //}}user_implement_dev:<controlClear>
		logger.exiting("AE0030020Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * �S�I���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCheckAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0030");
		logger.entering("AE0030020Control"+":USER="+struct.getsUser_ID(),"controlCheckAll");
			//{{user_implement_dev:<controlCheckAll>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlCheckAll>
		logger.exiting("AE0030020Control"+":USER="+struct.getsUser_ID(),"controlCheckAll");

		return;
	}

	/**
	 * �S�����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlUncheckAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0030");
		logger.entering("AE0030020Control"+":USER="+struct.getsUser_ID(),"controlUncheckAll");
			//{{user_implement_dev:<controlUncheckAll>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlUncheckAll>
		logger.exiting("AE0030020Control"+":USER="+struct.getsUser_ID(),"controlUncheckAll");

		return;
	}

	/**
	 * ���[�`�[�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlPartialSlipOutput() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0030");
		logger.entering("AE0030020Control"+":USER="+struct.getsUser_ID(),"controlPartialSlipOutput");
			//{{user_implement_dev:<controlPartialSlipOutput>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			int ret = 0;
			String printType      = getPdfOutputType();
			String printPattern   = getPdfOutputListPattern();
			String printer        = getPdfOutputPrinter();
			SvfWrapper svf        = new SvfWrapper(printType, getsysUSER_CD(), printer);
			
			// �Č������Ĉ���̏ꍇ
            if ("1".equals(printPattern)) {
                // �Č������s��
                controlSelect();
            // �I��o�^�̏ꍇ
            } else if ("3".equals(printPattern)) {
                pdfList = new ArrayList();
                // �I�����ڂ�pdfList�ɐݒ�
                List selectedPuchOdrCd = struct.getList_l_PUCH_ODR_CD();
                List selectedModifyCount = struct.getList_l_MODIFY_COUNT();
                for (int i = 0; i < selectedPuchOdrCd.size(); i++) {
                    AE0030020Struct s = new AE0030020Struct();
                    s.setl_PUCH_ODR_CD((String) selectedPuchOdrCd.get(i));
                    s.setl_MODIFY_COUNT((String) selectedModifyCount.get(i));
                    pdfList.add(s);
                }
            }
            // �G���[������A�܂��̓��X�g�����݂��Ȃ��ꍇ�͏������I��
            if (msgStruct.hasError() || pdfList == null || pdfList.isEmpty()) {
             return;
            }
            // �Ɩ��^�p���̎擾
            String plantCd = struct.getPLANT_CD();
            String businessOprDate = DateCtrlControl.getData(conn, plantCd).getBUSINESS_OPR_DATE();
            
			String printId1 = "AE00300203";		// TODO: ���[ID���w�肵�Ă�������
			//String queryId1 = "AE00300201";		// TODO: �N�G���[ID���w�肵�Ă�������(�ȗ����FprintId)

			ret = svf.VrInit(printId1);	// PDF�쐬�J�n
			//ret = svf.VrInit(printId1, queryId1);	// PDF�쐬�J�n(�N�G���[ID�w���)
			pdfFilePath = svf.getPdfFilePath();	// pdf�t���p�X�t�@�C����
			pdfFileName = svf.getPdfFileName();	// pdf�t�@�C�����iWeb�p�j
			queryFileName = svf.getQueryFileName();	// query�t�@�C����

			/* �N�G���[�t�@�C���̎w�� */
			if(dbKIND != null && !dbKIND.equals("")) {
				ret = svf.VrSetQuery("KIND=" + dbKIND + ";UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);
			} else {
				ret = svf.VrSetQuery("UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);
			}
			
			//�f�[�^�̃Z�b�g
			for(Iterator i = pdfList.iterator(); i.hasNext();){
				AE0030020Struct pdfStruct = (AE0030020Struct) i.next();
				// �Ώۍs�̃��b�N
           	    List lockedList = entity.mT_RLSD_PUCH_ODR_Lock.read(conn, pdfStruct);
           	    // PDF�o�͂���L�[�����݂��Ȃ��ꍇ�̓G���[�B
           	    if (lockedList.isEmpty()) {
           		    setErrorMessage("ZZ01105");
           		    return;
           	    }
           	    // �ǂݍ��ݎ���"�X�V��"�ƈقȂ�ꍇ�̓G���[
           	    AE0030020Struct lockedStruct = (AE0030020Struct) lockedList.get(0);
           	    if (!lockedStruct.getMODIFY_COUNT().equals(pdfStruct.getl_MODIFY_COUNT())) {
           		    setErrorMessage("ZZ01105");
           		    return;
           	    }
				// �N�G���[���o�����̎w��
				ret = svf.VrCondition("[X|PUCH_ODR_CD]=" + pdfStruct.getl_PUCH_ODR_CD(),4);
				
				/* �N�G���[���s */
				ret = svf.VrReport();
				if(ret == -554) {
					ExpjMessage emsg = new ExpjMessage("ZZ06001");
					msgStruct.addError(emsg);
					sysLog.warning(emsg, sysUSER_CD);
					return;
				}
				
				// �y�����c�z�̍X�V�������s��
           	    struct.setwork_ISS_DATE(businessOprDate);
           	    struct.setl_PUCH_ODR_CD(pdfStruct.getl_PUCH_ODR_CD());
				entity.mT_RLSD_PUCH_ODR_UPDATE.update(conn, struct);
			}

			/* PDF�쐬�I�� */
			ret = svf.VrQuit();
			if ( "0".equals(printType) ) {	// �N���C�A���g����̏ꍇ
				struct.setDOWNLOAD_FILE(getPdfFileName());
			}
			else if ( "1".equals(printType) ) {
				try {
					String acrobatPath = svf.getAcrobatPath();
					String acrobatOption1 = svf.getAcrobatOption1();
					String acrobatOption2 = svf.getAcrobatOption2();
					String pdfPrinter = svf.getPrinter();
					Runtime.getRuntime().exec(new String[]{acrobatPath, acrobatOption1, acrobatOption2, pdfFilePath, pdfPrinter});
					//Runtime.getRuntime().exec(svf.getExecuteOutput());
				}catch(IOException e){
					// �T�[�o������s���̃G���[�������L�q���Ă��������B
				}
			}
			// �ēǍ�
			controlSelect();
			conn.commit();
		}catch(Exception e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			throw ee;
		} finally {
			//
		}
                //}}user_implement_dev:<controlPartialSlipOutput>
		logger.exiting("AE0030020Control"+":USER="+struct.getsUser_ID(),"controlPartialSlipOutput");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0030");
		logger.entering("AE0030020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
            
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AE0030020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0030");
		logger.entering("AE0030020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
              
                // ��ʂ�������
                initializeAll();
                try {
			//�����Ǘ��p�����[�^�擾
			List listTimeCtrl = entity.mSYS_PARAMETER.read(conn,struct);
			if(listTimeCtrl == null || listTimeCtrl.size() <=0){
				struct.setTIME_CTRL("false");
				_flgTimeCtrl = "false";
			}else{
				struct.setTIME_CTRL(((AE0030020Struct)listTimeCtrl.get(0)).getTIME_CTRL());
				_flgTimeCtrl = struct.getTIME_CTRL();
			}
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AE0030020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0030");
		logger.entering("AE0030020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
		struct.setDOWNLOAD_FILE((String)null);	// �_�E�����[�h�t�@�C�����N���A
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
              
                struct.setDOWNLOAD_FILE(null);
              
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AE0030020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("CheckAll") ) {
				controlCheckAll();
			} else if( button.equals("UncheckAll") ) {
				controlUncheckAll();
			} else if( button.equals("PartialSlipOutput") ) {
				controlPartialSlipOutput();
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
//			throw new FoundationException("AE0030020Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0030020-E999","CSV�̏o�͏���"));
			throw new FoundationException("AE0030020Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0030020-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AE0030020Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0030020-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AE0030020Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AE0030020Entity entity;
	protected AE0030020Struct struct;
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

		entity = new AE0030020Entity();
		struct = new AE0030020Struct();

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
	 * AE0030020�N���X�̕W���R���X�g���N�^
	 */
	public AE0030020Control() throws BusinessProcessException, FoundationException
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
		} catch(MissingResourceException e) {
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
				AE0030020Struct key = (AE0030020Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("ReOutputFlag") && key.getReOutputFlag() != null) {
					msgKey.setKeyValue("ReOutputFlag", key.getReOutputFlag());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE") && key.getPUCH_ODR_START_DATE() != null) {
					msgKey.setKeyValue("PUCH_ODR_START_DATE", key.getPUCH_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE") && key.getPUCH_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("PUCH_ODR_DLV_DATE", key.getPUCH_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("r1_FILTER1") && key.getr1_FILTER1() != null) {
					msgKey.setKeyValue("r1_FILTER1", key.getr1_FILTER1());
				}
				if(msgKeyType.containsKeyColumn("r2_FILTER1") && key.getr2_FILTER1() != null) {
					msgKey.setKeyValue("r2_FILTER1", key.getr2_FILTER1());
				}
				if(msgKeyType.containsKeyColumn("r1_FILTER2") && key.getr1_FILTER2() != null) {
					msgKey.setKeyValue("r1_FILTER2", key.getr1_FILTER2());
				}
				if(msgKeyType.containsKeyColumn("r2_FILTER2") && key.getr2_FILTER2() != null) {
					msgKey.setKeyValue("r2_FILTER2", key.getr2_FILTER2());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_START_TIME") && key.getPUCH_ODR_START_TIME() != null) {
					msgKey.setKeyValue("PUCH_ODR_START_TIME", key.getPUCH_ODR_START_TIME());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_TIME") && key.getPUCH_ODR_DLV_TIME() != null) {
					msgKey.setKeyValue("PUCH_ODR_DLV_TIME", key.getPUCH_ODR_DLV_TIME());
				}
				if(msgKeyType.containsKeyColumn("r1_FILTER3") && key.getr1_FILTER3() != null) {
					msgKey.setKeyValue("r1_FILTER3", key.getr1_FILTER3());
				}
				if(msgKeyType.containsKeyColumn("r2_FILTER3") && key.getr2_FILTER3() != null) {
					msgKey.setKeyValue("r2_FILTER3", key.getr2_FILTER3());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_START_DATE") && key.getl_PUCH_ODR_START_DATE() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_START_DATE", key.getl_PUCH_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_DLV_DATE") && key.getl_PUCH_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_DLV_DATE", key.getl_PUCH_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_VEND_CD") && key.getl_VEND_CD() != null) {
					msgKey.setKeyValue("l_VEND_CD", key.getl_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("l_VEND_ANAME") && key.getl_VEND_ANAME() != null) {
					msgKey.setKeyValue("l_VEND_ANAME", key.getl_VEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_CD") && key.getl_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ITEM_CD", key.getl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_NAME") && key.getl_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ITEM_NAME", key.getl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_QTY") && key.getl_PUCH_ODR_QTY() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_QTY", key.getl_PUCH_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_STOCK_UNIT") && key.getl_STOCK_UNIT() != null) {
					msgKey.setKeyValue("l_STOCK_UNIT", key.getl_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_CD") && key.getl_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_CD", key.getl_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD") && key.getl_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CD", key.getl_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_SLIP_ISS_DATE") && key.getl_PUCH_ODR_SLIP_ISS_DATE() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_SLIP_ISS_DATE", key.getl_PUCH_ODR_SLIP_ISS_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT") && key.getl_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("l_MODIFY_COUNT", key.getl_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_INST_SLIP_ISS_FLG") && key.getl_PUCH_ODR_INST_SLIP_ISS_FLG() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_INST_SLIP_ISS_FLG", key.getl_PUCH_ODR_INST_SLIP_ISS_FLG());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE_ALL") && key.getPUCH_ODR_START_DATE_ALL() != null) {
					msgKey.setKeyValue("PUCH_ODR_START_DATE_ALL", key.getPUCH_ODR_START_DATE_ALL());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE_ALL") && key.getPUCH_ODR_DLV_DATE_ALL() != null) {
					msgKey.setKeyValue("PUCH_ODR_DLV_DATE_ALL", key.getPUCH_ODR_DLV_DATE_ALL());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON") && key.getPUCH_ODR_PERSON() != null) {
					msgKey.setKeyValue("PUCH_ODR_PERSON", key.getPUCH_ODR_PERSON());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_INST_SLIP_ISS_FLG") && key.getPUCH_ODR_INST_SLIP_ISS_FLG() != null) {
					msgKey.setKeyValue("PUCH_ODR_INST_SLIP_ISS_FLG", key.getPUCH_ODR_INST_SLIP_ISS_FLG());
				}
				if(msgKeyType.containsKeyColumn("ODR_FORM_FLG") && key.getODR_FORM_FLG() != null) {
					msgKey.setKeyValue("ODR_FORM_FLG", key.getODR_FORM_FLG());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("VEND_NAME") && key.getVEND_NAME() != null) {
					msgKey.setKeyValue("VEND_NAME", key.getVEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("USER_NAME") && key.getUSER_NAME() != null) {
					msgKey.setKeyValue("USER_NAME", key.getUSER_NAME());
				}
				if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__PUCH_ODR_CD") && key.getT_RLSD_PUCH_ODR__PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("T_RLSD_PUCH_ODR__PUCH_ODR_CD", key.getT_RLSD_PUCH_ODR__PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("SYS_DATE_CTRL__BUSINESS_OPR_DATE") && key.getSYS_DATE_CTRL__BUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("SYS_DATE_CTRL__BUSINESS_OPR_DATE", key.getSYS_DATE_CTRL__BUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("M_VEND_CTRL__VEND_NAME") && key.getM_VEND_CTRL__VEND_NAME() != null) {
					msgKey.setKeyValue("M_VEND_CTRL__VEND_NAME", key.getM_VEND_CTRL__VEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("M_VEND_CTRL__ZIP_CD") && key.getM_VEND_CTRL__ZIP_CD() != null) {
					msgKey.setKeyValue("M_VEND_CTRL__ZIP_CD", key.getM_VEND_CTRL__ZIP_CD());
				}
				if(msgKeyType.containsKeyColumn("M_VEND_CTRL__ADDRESS_1") && key.getM_VEND_CTRL__ADDRESS_1() != null) {
					msgKey.setKeyValue("M_VEND_CTRL__ADDRESS_1", key.getM_VEND_CTRL__ADDRESS_1());
				}
				if(msgKeyType.containsKeyColumn("M_VEND_CTRL__ADDRESS_2") && key.getM_VEND_CTRL__ADDRESS_2() != null) {
					msgKey.setKeyValue("M_VEND_CTRL__ADDRESS_2", key.getM_VEND_CTRL__ADDRESS_2());
				}
				if(msgKeyType.containsKeyColumn("M_VEND_CTRL__VEND_ORG") && key.getM_VEND_CTRL__VEND_ORG() != null) {
					msgKey.setKeyValue("M_VEND_CTRL__VEND_ORG", key.getM_VEND_CTRL__VEND_ORG());
				}
				if(msgKeyType.containsKeyColumn("M_VEND_CTRL__VEND_PERSON") && key.getM_VEND_CTRL__VEND_PERSON() != null) {
					msgKey.setKeyValue("M_VEND_CTRL__VEND_PERSON", key.getM_VEND_CTRL__VEND_PERSON());
				}
				if(msgKeyType.containsKeyColumn("M_VEND_CTRL__TEL") && key.getM_VEND_CTRL__TEL() != null) {
					msgKey.setKeyValue("M_VEND_CTRL__TEL", key.getM_VEND_CTRL__TEL());
				}
				if(msgKeyType.containsKeyColumn("M_VEND_CTRL__FAX") && key.getM_VEND_CTRL__FAX() != null) {
					msgKey.setKeyValue("M_VEND_CTRL__FAX", key.getM_VEND_CTRL__FAX());
				}
				if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__ITEM_CD") && key.getT_RLSD_PUCH_ODR__ITEM_CD() != null) {
					msgKey.setKeyValue("T_RLSD_PUCH_ODR__ITEM_CD", key.getT_RLSD_PUCH_ODR__ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("M_ITEM__ITEM_NAME") && key.getM_ITEM__ITEM_NAME() != null) {
					msgKey.setKeyValue("M_ITEM__ITEM_NAME", key.getM_ITEM__ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("T_OD__JOB_ODR_CD") && key.getT_OD__JOB_ODR_CD() != null) {
					msgKey.setKeyValue("T_OD__JOB_ODR_CD", key.getT_OD__JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__PUCH_ODR_QTY") && key.getT_RLSD_PUCH_ODR__PUCH_ODR_QTY() != null) {
					msgKey.setKeyValue("T_RLSD_PUCH_ODR__PUCH_ODR_QTY", key.getT_RLSD_PUCH_ODR__PUCH_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("M_ITEM__STOCK_UNIT") && key.getM_ITEM__STOCK_UNIT() != null) {
					msgKey.setKeyValue("M_ITEM__STOCK_UNIT", key.getM_ITEM__STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("PKG_QTY") && key.getPKG_QTY() != null) {
					msgKey.setKeyValue("PKG_QTY", key.getPKG_QTY());
				}
				if(msgKeyType.containsKeyColumn("PKG_ODD_QTY") && key.getPKG_ODD_QTY() != null) {
					msgKey.setKeyValue("PKG_ODD_QTY", key.getPKG_ODD_QTY());
				}
				if(msgKeyType.containsKeyColumn("M_ITEM__PKG_UNIT") && key.getM_ITEM__PKG_UNIT() != null) {
					msgKey.setKeyValue("M_ITEM__PKG_UNIT", key.getM_ITEM__PKG_UNIT());
				}
				if(msgKeyType.containsKeyColumn("M_ITEM__STOCK_UNIT2") && key.getM_ITEM__STOCK_UNIT2() != null) {
					msgKey.setKeyValue("M_ITEM__STOCK_UNIT2", key.getM_ITEM__STOCK_UNIT2());
				}
				if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA") && key.getT_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA() != null) {
					msgKey.setKeyValue("T_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA", key.getT_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA());
				}
				if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__UNIT_COST") && key.getT_RLSD_PUCH_ODR__UNIT_COST() != null) {
					msgKey.setKeyValue("T_RLSD_PUCH_ODR__UNIT_COST", key.getT_RLSD_PUCH_ODR__UNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("M_CUR__VEND_CUR_UNIT") && key.getM_CUR__VEND_CUR_UNIT() != null) {
					msgKey.setKeyValue("M_CUR__VEND_CUR_UNIT", key.getM_CUR__VEND_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT") && key.getT_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("T_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT", key.getT_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__DISC_AMOUNT") && key.getT_RLSD_PUCH_ODR__DISC_AMOUNT() != null) {
					msgKey.setKeyValue("T_RLSD_PUCH_ODR__DISC_AMOUNT", key.getT_RLSD_PUCH_ODR__DISC_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__NET_AMOUNT") && key.getT_RLSD_PUCH_ODR__NET_AMOUNT() != null) {
					msgKey.setKeyValue("T_RLSD_PUCH_ODR__NET_AMOUNT", key.getT_RLSD_PUCH_ODR__NET_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT") && key.getTAX_AMOUNT() != null) {
					msgKey.setKeyValue("TAX_AMOUNT", key.getTAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__AMOUNT_INCLUDE_") && key.getT_RLSD_PUCH_ODR__AMOUNT_INCLUDE_() != null) {
					msgKey.setKeyValue("T_RLSD_PUCH_ODR__AMOUNT_INCLUDE_", key.getT_RLSD_PUCH_ODR__AMOUNT_INCLUDE_());
				}
				if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__HOME_CUR_AMOUNT") && key.getT_RLSD_PUCH_ODR__HOME_CUR_AMOUNT() != null) {
					msgKey.setKeyValue("T_RLSD_PUCH_ODR__HOME_CUR_AMOUNT", key.getT_RLSD_PUCH_ODR__HOME_CUR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("M_CUR__HOME_CUR_UNIT") && key.getM_CUR__HOME_CUR_UNIT() != null) {
					msgKey.setKeyValue("M_CUR__HOME_CUR_UNIT", key.getM_CUR__HOME_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("M_CUR__CUR_NAME") && key.getM_CUR__CUR_NAME() != null) {
					msgKey.setKeyValue("M_CUR__CUR_NAME", key.getM_CUR__CUR_NAME());
				}
				if(msgKeyType.containsKeyColumn("SYS_TYPE_VALUE__DISPLAY_NAME") && key.getSYS_TYPE_VALUE__DISPLAY_NAME() != null) {
					msgKey.setKeyValue("SYS_TYPE_VALUE__DISPLAY_NAME", key.getSYS_TYPE_VALUE__DISPLAY_NAME());
				}
				if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__RATE_JUDGE_DATE") && key.getT_RLSD_PUCH_ODR__RATE_JUDGE_DATE() != null) {
					msgKey.setKeyValue("T_RLSD_PUCH_ODR__RATE_JUDGE_DATE", key.getT_RLSD_PUCH_ODR__RATE_JUDGE_DATE());
				}
				if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__EXCH_RATE") && key.getT_RLSD_PUCH_ODR__EXCH_RATE() != null) {
					msgKey.setKeyValue("T_RLSD_PUCH_ODR__EXCH_RATE", key.getT_RLSD_PUCH_ODR__EXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__PROCESSING_COST") && key.getT_RLSD_PUCH_ODR__PROCESSING_COST() != null) {
					msgKey.setKeyValue("T_RLSD_PUCH_ODR__PROCESSING_COST", key.getT_RLSD_PUCH_ODR__PROCESSING_COST());
				}
				if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__MATERIAL_COST") && key.getT_RLSD_PUCH_ODR__MATERIAL_COST() != null) {
					msgKey.setKeyValue("T_RLSD_PUCH_ODR__MATERIAL_COST", key.getT_RLSD_PUCH_ODR__MATERIAL_COST());
				}
				if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__OTHER_OVERHEADS") && key.getT_RLSD_PUCH_ODR__OTHER_OVERHEADS() != null) {
					msgKey.setKeyValue("T_RLSD_PUCH_ODR__OTHER_OVERHEADS", key.getT_RLSD_PUCH_ODR__OTHER_OVERHEADS());
				}
				if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__PUCH_ODR_COMMEN") && key.getT_RLSD_PUCH_ODR__PUCH_ODR_COMMEN() != null) {
					msgKey.setKeyValue("T_RLSD_PUCH_ODR__PUCH_ODR_COMMEN", key.getT_RLSD_PUCH_ODR__PUCH_ODR_COMMEN());
				}
				if(msgKeyType.containsKeyColumn("M_PLANT__PLANT_NAME") && key.getM_PLANT__PLANT_NAME() != null) {
					msgKey.setKeyValue("M_PLANT__PLANT_NAME", key.getM_PLANT__PLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("M_WH__WH_NAME") && key.getM_WH__WH_NAME() != null) {
					msgKey.setKeyValue("M_WH__WH_NAME", key.getM_WH__WH_NAME());
				}
				if(msgKeyType.containsKeyColumn("M_PLANT__ZIP_CD") && key.getM_PLANT__ZIP_CD() != null) {
					msgKey.setKeyValue("M_PLANT__ZIP_CD", key.getM_PLANT__ZIP_CD());
				}
				if(msgKeyType.containsKeyColumn("M_PLANT__ADDRESS_1") && key.getM_PLANT__ADDRESS_1() != null) {
					msgKey.setKeyValue("M_PLANT__ADDRESS_1", key.getM_PLANT__ADDRESS_1());
				}
				if(msgKeyType.containsKeyColumn("M_PLANT__ADDRESS_2") && key.getM_PLANT__ADDRESS_2() != null) {
					msgKey.setKeyValue("M_PLANT__ADDRESS_2", key.getM_PLANT__ADDRESS_2());
				}
				if(msgKeyType.containsKeyColumn("M_PLANT__TEL") && key.getM_PLANT__TEL() != null) {
					msgKey.setKeyValue("M_PLANT__TEL", key.getM_PLANT__TEL());
				}
				if(msgKeyType.containsKeyColumn("USER_MST__USER_NAME") && key.getUSER_MST__USER_NAME() != null) {
					msgKey.setKeyValue("USER_MST__USER_NAME", key.getUSER_MST__USER_NAME());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_SLIP_ISS_DATE") && key.getPUCH_ODR_SLIP_ISS_DATE() != null) {
					msgKey.setKeyValue("PUCH_ODR_SLIP_ISS_DATE", key.getPUCH_ODR_SLIP_ISS_DATE());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("TIME_CTRL") && key.getTIME_CTRL() != null) {
					msgKey.setKeyValue("TIME_CTRL", key.getTIME_CTRL());
				}
				if(msgKeyType.containsKeyColumn("l_COUNT") && key.getl_COUNT() != null) {
					msgKey.setKeyValue("l_COUNT", key.getl_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ROW_COUNT") && key.getROW_COUNT() != null) {
					msgKey.setKeyValue("ROW_COUNT", key.getROW_COUNT());
				}
				if(msgKeyType.containsKeyColumn("work_busDate") && key.getwork_busDate() != null) {
					msgKey.setKeyValue("work_busDate", key.getwork_busDate());
				}
				if(msgKeyType.containsKeyColumn("work_ISS_DATE") && key.getwork_ISS_DATE() != null) {
					msgKey.setKeyValue("work_ISS_DATE", key.getwork_ISS_DATE());
				}
				if(msgKeyType.containsKeyColumn("PARTIAL_DELIV_SLIP_ISS_FLG") && key.getPARTIAL_DELIV_SLIP_ISS_FLG() != null) {
					msgKey.setKeyValue("PARTIAL_DELIV_SLIP_ISS_FLG", key.getPARTIAL_DELIV_SLIP_ISS_FLG());
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
					AE0030020Struct key = new AE0030020Struct();
					if(msgKeyType.containsKeyColumn("ReOutputFlag")) {
						key.setReOutputFlag(msgKey.getKeyValue("ReOutputFlag"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE")) {
						key.setPUCH_ODR_START_DATE(msgKey.getKeyValue("PUCH_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE")) {
						key.setPUCH_ODR_DLV_DATE(msgKey.getKeyValue("PUCH_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("r1_FILTER1")) {
						key.setr1_FILTER1(msgKey.getKeyValue("r1_FILTER1"));
					}
					if(msgKeyType.containsKeyColumn("r2_FILTER1")) {
						key.setr2_FILTER1(msgKey.getKeyValue("r2_FILTER1"));
					}
					if(msgKeyType.containsKeyColumn("r1_FILTER2")) {
						key.setr1_FILTER2(msgKey.getKeyValue("r1_FILTER2"));
					}
					if(msgKeyType.containsKeyColumn("r2_FILTER2")) {
						key.setr2_FILTER2(msgKey.getKeyValue("r2_FILTER2"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_START_TIME")) {
						key.setPUCH_ODR_START_TIME(msgKey.getKeyValue("PUCH_ODR_START_TIME"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_TIME")) {
						key.setPUCH_ODR_DLV_TIME(msgKey.getKeyValue("PUCH_ODR_DLV_TIME"));
					}
					if(msgKeyType.containsKeyColumn("r1_FILTER3")) {
						key.setr1_FILTER3(msgKey.getKeyValue("r1_FILTER3"));
					}
					if(msgKeyType.containsKeyColumn("r2_FILTER3")) {
						key.setr2_FILTER3(msgKey.getKeyValue("r2_FILTER3"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_START_DATE")) {
						key.setl_PUCH_ODR_START_DATE(msgKey.getKeyValue("l_PUCH_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_DLV_DATE")) {
						key.setl_PUCH_ODR_DLV_DATE(msgKey.getKeyValue("l_PUCH_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_VEND_CD")) {
						key.setl_VEND_CD(msgKey.getKeyValue("l_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_VEND_ANAME")) {
						key.setl_VEND_ANAME(msgKey.getKeyValue("l_VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_CD")) {
						key.setl_ITEM_CD(msgKey.getKeyValue("l_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_NAME")) {
						key.setl_ITEM_NAME(msgKey.getKeyValue("l_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_QTY")) {
						key.setl_PUCH_ODR_QTY(msgKey.getKeyValue("l_PUCH_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_STOCK_UNIT")) {
						key.setl_STOCK_UNIT(msgKey.getKeyValue("l_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_CD")) {
						key.setl_PUCH_ODR_CD(msgKey.getKeyValue("l_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD")) {
						key.setl_JOB_ODR_CD(msgKey.getKeyValue("l_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_SLIP_ISS_DATE")) {
						key.setl_PUCH_ODR_SLIP_ISS_DATE(msgKey.getKeyValue("l_PUCH_ODR_SLIP_ISS_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT")) {
						key.setl_MODIFY_COUNT(msgKey.getKeyValue("l_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_INST_SLIP_ISS_FLG")) {
						key.setl_PUCH_ODR_INST_SLIP_ISS_FLG(msgKey.getKeyValue("l_PUCH_ODR_INST_SLIP_ISS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE_ALL")) {
						key.setPUCH_ODR_START_DATE_ALL(msgKey.getKeyValue("PUCH_ODR_START_DATE_ALL"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE_ALL")) {
						key.setPUCH_ODR_DLV_DATE_ALL(msgKey.getKeyValue("PUCH_ODR_DLV_DATE_ALL"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON")) {
						key.setPUCH_ODR_PERSON(msgKey.getKeyValue("PUCH_ODR_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_INST_SLIP_ISS_FLG")) {
						key.setPUCH_ODR_INST_SLIP_ISS_FLG(msgKey.getKeyValue("PUCH_ODR_INST_SLIP_ISS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ODR_FORM_FLG")) {
						key.setODR_FORM_FLG(msgKey.getKeyValue("ODR_FORM_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("VEND_NAME")) {
						key.setVEND_NAME(msgKey.getKeyValue("VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("USER_NAME")) {
						key.setUSER_NAME(msgKey.getKeyValue("USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__PUCH_ODR_CD")) {
						key.setT_RLSD_PUCH_ODR__PUCH_ODR_CD(msgKey.getKeyValue("T_RLSD_PUCH_ODR__PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("SYS_DATE_CTRL__BUSINESS_OPR_DATE")) {
						key.setSYS_DATE_CTRL__BUSINESS_OPR_DATE(msgKey.getKeyValue("SYS_DATE_CTRL__BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("M_VEND_CTRL__VEND_NAME")) {
						key.setM_VEND_CTRL__VEND_NAME(msgKey.getKeyValue("M_VEND_CTRL__VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("M_VEND_CTRL__ZIP_CD")) {
						key.setM_VEND_CTRL__ZIP_CD(msgKey.getKeyValue("M_VEND_CTRL__ZIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("M_VEND_CTRL__ADDRESS_1")) {
						key.setM_VEND_CTRL__ADDRESS_1(msgKey.getKeyValue("M_VEND_CTRL__ADDRESS_1"));
					}
					if(msgKeyType.containsKeyColumn("M_VEND_CTRL__ADDRESS_2")) {
						key.setM_VEND_CTRL__ADDRESS_2(msgKey.getKeyValue("M_VEND_CTRL__ADDRESS_2"));
					}
					if(msgKeyType.containsKeyColumn("M_VEND_CTRL__VEND_ORG")) {
						key.setM_VEND_CTRL__VEND_ORG(msgKey.getKeyValue("M_VEND_CTRL__VEND_ORG"));
					}
					if(msgKeyType.containsKeyColumn("M_VEND_CTRL__VEND_PERSON")) {
						key.setM_VEND_CTRL__VEND_PERSON(msgKey.getKeyValue("M_VEND_CTRL__VEND_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("M_VEND_CTRL__TEL")) {
						key.setM_VEND_CTRL__TEL(msgKey.getKeyValue("M_VEND_CTRL__TEL"));
					}
					if(msgKeyType.containsKeyColumn("M_VEND_CTRL__FAX")) {
						key.setM_VEND_CTRL__FAX(msgKey.getKeyValue("M_VEND_CTRL__FAX"));
					}
					if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__ITEM_CD")) {
						key.setT_RLSD_PUCH_ODR__ITEM_CD(msgKey.getKeyValue("T_RLSD_PUCH_ODR__ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("M_ITEM__ITEM_NAME")) {
						key.setM_ITEM__ITEM_NAME(msgKey.getKeyValue("M_ITEM__ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("T_OD__JOB_ODR_CD")) {
						key.setT_OD__JOB_ODR_CD(msgKey.getKeyValue("T_OD__JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__PUCH_ODR_QTY")) {
						key.setT_RLSD_PUCH_ODR__PUCH_ODR_QTY(msgKey.getKeyValue("T_RLSD_PUCH_ODR__PUCH_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("M_ITEM__STOCK_UNIT")) {
						key.setM_ITEM__STOCK_UNIT(msgKey.getKeyValue("M_ITEM__STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("PKG_QTY")) {
						key.setPKG_QTY(msgKey.getKeyValue("PKG_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PKG_ODD_QTY")) {
						key.setPKG_ODD_QTY(msgKey.getKeyValue("PKG_ODD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("M_ITEM__PKG_UNIT")) {
						key.setM_ITEM__PKG_UNIT(msgKey.getKeyValue("M_ITEM__PKG_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("M_ITEM__STOCK_UNIT2")) {
						key.setM_ITEM__STOCK_UNIT2(msgKey.getKeyValue("M_ITEM__STOCK_UNIT2"));
					}
					if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA")) {
						key.setT_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA(msgKey.getKeyValue("T_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA"));
					}
					if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__UNIT_COST")) {
						key.setT_RLSD_PUCH_ODR__UNIT_COST(msgKey.getKeyValue("T_RLSD_PUCH_ODR__UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("M_CUR__VEND_CUR_UNIT")) {
						key.setM_CUR__VEND_CUR_UNIT(msgKey.getKeyValue("M_CUR__VEND_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT")) {
						key.setT_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT(msgKey.getKeyValue("T_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__DISC_AMOUNT")) {
						key.setT_RLSD_PUCH_ODR__DISC_AMOUNT(msgKey.getKeyValue("T_RLSD_PUCH_ODR__DISC_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__NET_AMOUNT")) {
						key.setT_RLSD_PUCH_ODR__NET_AMOUNT(msgKey.getKeyValue("T_RLSD_PUCH_ODR__NET_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT")) {
						key.setTAX_AMOUNT(msgKey.getKeyValue("TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__AMOUNT_INCLUDE_")) {
						key.setT_RLSD_PUCH_ODR__AMOUNT_INCLUDE_(msgKey.getKeyValue("T_RLSD_PUCH_ODR__AMOUNT_INCLUDE_"));
					}
					if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__HOME_CUR_AMOUNT")) {
						key.setT_RLSD_PUCH_ODR__HOME_CUR_AMOUNT(msgKey.getKeyValue("T_RLSD_PUCH_ODR__HOME_CUR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("M_CUR__HOME_CUR_UNIT")) {
						key.setM_CUR__HOME_CUR_UNIT(msgKey.getKeyValue("M_CUR__HOME_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("M_CUR__CUR_NAME")) {
						key.setM_CUR__CUR_NAME(msgKey.getKeyValue("M_CUR__CUR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("SYS_TYPE_VALUE__DISPLAY_NAME")) {
						key.setSYS_TYPE_VALUE__DISPLAY_NAME(msgKey.getKeyValue("SYS_TYPE_VALUE__DISPLAY_NAME"));
					}
					if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__RATE_JUDGE_DATE")) {
						key.setT_RLSD_PUCH_ODR__RATE_JUDGE_DATE(msgKey.getKeyValue("T_RLSD_PUCH_ODR__RATE_JUDGE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__EXCH_RATE")) {
						key.setT_RLSD_PUCH_ODR__EXCH_RATE(msgKey.getKeyValue("T_RLSD_PUCH_ODR__EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__PROCESSING_COST")) {
						key.setT_RLSD_PUCH_ODR__PROCESSING_COST(msgKey.getKeyValue("T_RLSD_PUCH_ODR__PROCESSING_COST"));
					}
					if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__MATERIAL_COST")) {
						key.setT_RLSD_PUCH_ODR__MATERIAL_COST(msgKey.getKeyValue("T_RLSD_PUCH_ODR__MATERIAL_COST"));
					}
					if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__OTHER_OVERHEADS")) {
						key.setT_RLSD_PUCH_ODR__OTHER_OVERHEADS(msgKey.getKeyValue("T_RLSD_PUCH_ODR__OTHER_OVERHEADS"));
					}
					if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__PUCH_ODR_COMMEN")) {
						key.setT_RLSD_PUCH_ODR__PUCH_ODR_COMMEN(msgKey.getKeyValue("T_RLSD_PUCH_ODR__PUCH_ODR_COMMEN"));
					}
					if(msgKeyType.containsKeyColumn("M_PLANT__PLANT_NAME")) {
						key.setM_PLANT__PLANT_NAME(msgKey.getKeyValue("M_PLANT__PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("M_WH__WH_NAME")) {
						key.setM_WH__WH_NAME(msgKey.getKeyValue("M_WH__WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("M_PLANT__ZIP_CD")) {
						key.setM_PLANT__ZIP_CD(msgKey.getKeyValue("M_PLANT__ZIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("M_PLANT__ADDRESS_1")) {
						key.setM_PLANT__ADDRESS_1(msgKey.getKeyValue("M_PLANT__ADDRESS_1"));
					}
					if(msgKeyType.containsKeyColumn("M_PLANT__ADDRESS_2")) {
						key.setM_PLANT__ADDRESS_2(msgKey.getKeyValue("M_PLANT__ADDRESS_2"));
					}
					if(msgKeyType.containsKeyColumn("M_PLANT__TEL")) {
						key.setM_PLANT__TEL(msgKey.getKeyValue("M_PLANT__TEL"));
					}
					if(msgKeyType.containsKeyColumn("USER_MST__USER_NAME")) {
						key.setUSER_MST__USER_NAME(msgKey.getKeyValue("USER_MST__USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_SLIP_ISS_DATE")) {
						key.setPUCH_ODR_SLIP_ISS_DATE(msgKey.getKeyValue("PUCH_ODR_SLIP_ISS_DATE"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("TIME_CTRL")) {
						key.setTIME_CTRL(msgKey.getKeyValue("TIME_CTRL"));
					}
					if(msgKeyType.containsKeyColumn("l_COUNT")) {
						key.setl_COUNT(msgKey.getKeyValue("l_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ROW_COUNT")) {
						key.setROW_COUNT(msgKey.getKeyValue("ROW_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("work_busDate")) {
						key.setwork_busDate(msgKey.getKeyValue("work_busDate"));
					}
					if(msgKeyType.containsKeyColumn("work_ISS_DATE")) {
						key.setwork_ISS_DATE(msgKey.getKeyValue("work_ISS_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PARTIAL_DELIV_SLIP_ISS_FLG")) {
						key.setPARTIAL_DELIV_SLIP_ISS_FLG(msgKey.getKeyValue("PARTIAL_DELIV_SLIP_ISS_FLG"));
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
