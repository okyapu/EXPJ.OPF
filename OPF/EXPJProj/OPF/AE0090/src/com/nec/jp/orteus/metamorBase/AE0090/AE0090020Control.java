/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0090/src/com/nec/jp/orteus/metamorBase/AE0090/AE0090020Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0090;

import com.nec.jp.orteus.metamorBase.AE0090.*;
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
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlStruct;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;

//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AE0090020Control
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
	public AE0090020Struct getListvalue(int x) { return (AE0090020Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AE0090020Struct getStruct() { return this.struct; }	// Struct��Ԃ��܂��B
	public AE0090020Struct createStruct() { return new AE0090020Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AE0090020Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

	/** [���t����]��� */
	private DateCtrlStruct _dateCtrlStruct = new DateCtrlStruct();
	/** CSV�f�[�^���X�g */
	private List _csvList = null;


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
	
	/**
	 * ��ʂ̑S���ڂ����������܂��B
	 */
	private void initializeAll() {
      struct.setPLANT_CD(sysPLANT_CD);
      struct.setPUCH_ODR_START_DATE(null);
      struct.setPUCH_ODR_DLV_DATE(null);
      struct.setVEND_CD(null);
      struct.setITEM_CD(null);
      struct.setPUCH_ODR_CD(null);

      struct.setc1_WORK_STS_TYP(null);
      struct.setc2_WORK_STS_TYP(null);
      struct.setc3_WORK_STS_TYP("true");
      struct.setc4_WORK_STS_TYP(null);
      struct.setc5_WORK_STS_TYP(null);
      struct.setc6_WORK_STS_TYP(null);
      struct.setc7_WORK_STS_TYP(null);
      struct.setc8_WORK_STS_TYP(null);      
      
		initializeDetail();
	}
	/**
	 * ��ʂ̏ڍ׍��ڂ����������܂��B
	 */
	private void initializeDetail() {
      struct.setPLANT_NAME(null);
      struct.setVEND_NAME(null);
      struct.setITEM_NAME(null);
      struct.setWH_NAME(null);
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

	/**
	 * ���W�I�{�^���̒l���甭����ԋ敪��Ԃ��܂��B
	 * @return ���w���d"1"�A�w���ς݁d"2"�A��������d"9"�A���̑��d"-1"
	 */
	private String getPuchOdrSysType() {
/*
		if ("true".equals(struct.getr_PUCH_ODR_STS_TYP())) {
			return "1";
		} else if ("true".equals(struct.getr2_PUCH_ODR_STS_TYP())) {
			return "2";
		} else if ("true".equals(struct.getr3_PUCH_ODR_STS_TYP())){
			return "9";
		} else {
			return "-1";
		}
*/
		return "-1";
	}

	/** �����Ǘ��p�t���O */
	private String _flgTimeCtrl = null;

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
	 * CSV�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCsvOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090020Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");
			//{{user_implement_dev:<controlCsvOut>

		// CSV���̍쐬
		List csvList = new ArrayList();
		String[] title = {
			"Expj.Cmt0721" ,
			"Expj.PUCH_ODR_CD" ,
			"Expj.PLANT_CD" ,
			"Expj.PLANT_NAME" ,
			"Expj.WH_CD_2" ,
			"Expj.WH_NAME_1" ,
			"Expj.ITEM_CD" ,
			"Expj.ITEM_NAME" ,
			"Expj.COMPANY_CD" ,
			"Expj.VEND_CD" ,
			"Expj.VEND_NAME" ,
			"Expj.PUCH_ODR_PERSON" ,
			"Expj.USER_CD_1" ,
			"Expj.PUCH_ODR_START_DATE" ,
			"Expj.PUCH_ODR_DLV_DATE" ,
			"Expj.PUCH_ODR_QTY" ,
			"Expj.Cmt1103" ,
			"Expj.UNIT_COST_TYP" ,
			"Expj.Cmt1094" ,
			"Expj.UNIT_COST" ,
			"Expj.PUCH_ODR_AMOUNT_2" ,
			"Expj.CUR_UNIT" ,
			"Expj.DISC_AMOUNT" ,
			"Expj.NET_AMOUNT" ,
			"Expj.Cmt1074" ,
			"Expj.Cmt1075" ,
			"Expj.Cmt1076" ,
			"Expj.AMOUNT_INCLUDE_TAX" ,
			"Expj.RATE_JUDGE_DATE" ,
			"Expj.EXCH_RATE" ,
			"Expj.HOME_CUR_AMOUNT" ,
			"Expj.Cmt1113" ,
			"Expj.PUCH_ODR_INST_DATE" ,
			"Expj.PUCH_ODR_INST_SLIP_ISS_FLG" ,
			"Expj.Cmt1104" ,
			"Expj.ODR_CANCEL_SLIP_ISS_FLG" ,
			"Expj.Cmt1095" ,
			"Expj.Cmt1096" ,
			"Expj.ODR_CANCEL_CAUSE_CD" ,
			"Expj.PUCH_ODR_SLIP_ISS_DATE" ,
			"Expj.PUCH_ODR_STS_TYP" ,
			"Expj.Cmt1102" ,
			"Expj.INSPC_CMPLT_FLG" ,
			"Expj.Cmt1034" ,
			"Expj.INSPC_CMPLT_DATE" ,
			"Expj.CONFIRM_DLV_DATE" ,
			"Expj.Cmt1030" ,
			"Expj.SPL_ITEM_TYP" ,
			"Expj.Cmt1065" ,
			"Expj.ACPT_INSPC_TYP" ,
			"Expj.Cmt1066" ,
			"Expj.INV_CTRL_FLG" ,
			"Expj.Cmt1041" ,
			"Expj.WORK_ODR_CD" ,
			"Expj.OD_NO" ,
			"Expj.JOB_ODR_CD" ,
			"Expj.PUCH_ODR_COMMENT" ,
			"Expj.ODR_CD" ,
			"Expj.DETAIL_NO" ,
			"Expj.NON_NO_ITEM_FLG" ,
			"Expj.Cmt1106" ,
			"Expj.DRAW_CD" ,
			"Expj.ITEM_SPEC" ,
			"Expj.MRP_ODR_TYP" ,
			"Expj.Cmt1108" ,
			"Expj.ACPT_QTY_5" ,
			"Expj.ACPT_CMPLT_DATE" ,
			"Expj.Cmt0317" ,
			"Expj.Cmt0324" ,
			"Expj.PUCH_ODR_EDI_ISS_DATE" ,
			"Expj.Cmt1000" ,
			"Expj.CREATED_DATE" ,
			"Expj.CREATED_BY" ,
			"Expj.Cmt1045" 
		};
		csvList.add(title);
		for (Iterator i = _csvList.iterator(); i.hasNext();) {
          AE0090020Struct csvStruct = (AE0090020Struct) i.next();
          //�@�R���{�{�b�N�X�����擾���Ȃ��̏ꍇ
          if(csvStruct.getl_STATUS_DN() == null || "".equals(csvStruct.getl_STATUS_DN())){ 
          //�R���{�{�b�N�X�̎擾
             csvStruct.setl_STATUS_DN(multcombo("PUCH_ODR_STATUS",csvStruct.getl_STATUS()));
             csvStruct.setl_UNIT_COST_TYP_DN(multcombo("UNIT_COST_TYP",csvStruct.getl_UNIT_COST_TYP()));
             csvStruct.setl_PUCH_ODR_INST_SLIP_ISS_FLG_DN(multcombo("PUCH_ODR_INST_SLIP_ISS_FLG",csvStruct.getl_PUCH_ODR_INST_SLIP_ISS_FLG()));
             csvStruct.setl_PUCH_ODR_STS_TYP_DN(multcombo("PUCH_ODR_STS_TYP",csvStruct.getl_PUCH_ODR_STS_TYP()));
             csvStruct.setl_INSPC_CMPLT_FLG_DN(multcombo("INSPC_CMPLT_FLG",csvStruct.getl_INSPC_CMPLT_FLG()));
             csvStruct.setl_SPL_ITEM_TYP_DN(multcombo("SPL_ITEM_TYP",csvStruct.getl_SPL_ITEM_TYP()));
             csvStruct.setl_ACPT_INSPC_TYP_DN(multcombo("ACPT_INSPC_TYP",csvStruct.getl_ACPT_INSPC_TYP()));
             csvStruct.setl_INV_CTRL_FLG_DN(multcombo("INV_CTRL_FLG",csvStruct.getl_INV_CTRL_FLG()));
             csvStruct.setl_NON_NO_ITEM_FLG_DN(multcombo("NON_NO_ITEM_FLG",csvStruct.getl_NON_NO_ITEM_FLG()));
             csvStruct.setl_MRP_ODR_TYP_DN(multcombo("MRP_ODR_TYP",csvStruct.getl_MRP_ODR_TYP()));
             csvStruct.setl_ODR_CANCEL_SLIP_ISS_FLG_DN(multcombo("ODR_CANCEL_SLIP_ISS_FLG",csvStruct.getl_ODR_CANCEL_SLIP_ISS_FLG()));
          }
          String[] csvStr = new String[title.length];
          csvStr[0] = csvStruct.getl_STATUS_DN();          
          csvStr[1] = csvStruct.getl_PUCH_ODR_CD();
          csvStr[2] = csvStruct.getl_PLANT_CD();
          csvStr[3] = csvStruct.getPLANT_NAME();
          csvStr[4] = csvStruct.getl_WH_CD();
          csvStr[5] = csvStruct.getl_WH_NAME();
          csvStr[6] = csvStruct.getl_ITEM_CD();
          csvStr[7] = csvStruct.getl_ITEM_NAME();
          csvStr[8] = csvStruct.getl_COMPANY_CD();
          csvStr[9] = csvStruct.getl_VEND_CD();
          csvStr[10] = csvStruct.getl_VEND_ANAME();
          csvStr[11] = csvStruct.getl_PUCH_ODR_PERSON();
          csvStr[12] = csvStruct.getl_USER_NAME();
          csvStr[13] = csvStruct.getl_PUCH_ODR_START_DATE();
          csvStr[14] = csvStruct.getl_PUCH_ODR_DLV_DATE();
          csvStr[15] = csvStruct.getl_PUCH_ODR_QTY();
          csvStr[16] = csvStruct.getl_STOCK_UNIT();
          csvStr[17] = csvStruct.getl_UNIT_COST_TYP();
          csvStr[18] = csvStruct.getl_UNIT_COST_TYP_DN();
          csvStr[19] = csvStruct.getl_UNIT_COST();
          csvStr[20] = csvStruct.getl_PUCH_ODR_AMOUNT();
          csvStr[21] = csvStruct.getl_VEND_CUR_UNIT();
          csvStr[22] = csvStruct.getl_DISC_AMOUNT();
          csvStr[23] = csvStruct.getl_NET_AMOUNT();
          csvStr[24] = csvStruct.getl_TAX_AMOUNT_1();
          csvStr[25] = csvStruct.getl_TAX_AMOUNT_2();
          csvStr[26] = csvStruct.getl_TAX_AMOUNT_3();
          csvStr[27] = csvStruct.getl_AMOUNT_INCLUDE_TAX();
          csvStr[28] = csvStruct.getl_RATE_JUDGE_DATE();
          csvStr[29] = csvStruct.getl_EXCH_RATE();
          csvStr[30] = csvStruct.getl_HOME_CUR_AMOUNT();
          csvStr[31] = csvStruct.getl_HOME_CUR_UNIT();
          csvStr[32] = csvStruct.getl_PUCH_ODR_INST_DATE();
          csvStr[33] = csvStruct.getl_PUCH_ODR_INST_SLIP_ISS_FLG();
          csvStr[34] = csvStruct.getl_PUCH_ODR_INST_SLIP_ISS_FLG_DN();
          csvStr[35] = csvStruct.getl_ODR_CANCEL_SLIP_ISS_FLG();
          csvStr[36] = csvStruct.getl_ODR_CANCEL_SLIP_ISS_FLG_DN();

          csvStr[37] = csvStruct.getl_ODR_CANCEL_SLIP_ISS_DATE();
          
          csvStr[38] = csvStruct.getl_ODR_CANCEL_CAUSE_CD();
          csvStr[39] = csvStruct.getl_PUCH_ODR_SLIP_ISS_DATE();
          
          csvStr[40] = csvStruct.getl_PUCH_ODR_STS_TYP();
          csvStr[41] = csvStruct.getl_PUCH_ODR_STS_TYP_DN();
          csvStr[42] = csvStruct.getl_INSPC_CMPLT_FLG();
          csvStr[43] = csvStruct.getl_INSPC_CMPLT_FLG_DN();
          csvStr[44] = csvStruct.getl_INSPC_CMPLT_DATE();
          csvStr[45] = csvStruct.getl_CONFIRM_DLV_DATE();
          csvStr[46] = csvStruct.getl_CONFIRM_DLV_DATE_COMMENT();
          
          csvStr[47] = csvStruct.getl_SPL_ITEM_TYP();
          csvStr[48] = csvStruct.getl_SPL_ITEM_TYP_DN();
          csvStr[49] = csvStruct.getl_ACPT_INSPC_TYP();
          csvStr[50] = csvStruct.getl_ACPT_INSPC_TYP_DN();
          csvStr[51] = csvStruct.getl_INV_CTRL_FLG();
          csvStr[52] = csvStruct.getl_INV_CTRL_FLG_DN();
          csvStr[53] = csvStruct.getl_WORK_ODR_CD();
          csvStr[54] = csvStruct.getl_OD_NO();
          csvStr[55] = csvStruct.getl_JOB_ODR_CD();
          csvStr[56] = csvStruct.getl_PUCH_ODR_COMMENT();
          csvStr[57] = csvStruct.getl_ODR_CD();
          csvStr[58] = csvStruct.getl_DETAIL_NO();
          csvStr[59] = csvStruct.getl_NON_NO_ITEM_FLG();
          csvStr[60] = csvStruct.getl_NON_NO_ITEM_FLG_DN();
          csvStr[61] = csvStruct.getl_DRAW_CD();
          csvStr[62] = csvStruct.getl_SPEC();
          csvStr[63] = csvStruct.getl_MRP_ODR_TYP();
          csvStr[64] = csvStruct.getl_MRP_ODR_TYP_DN();
          csvStr[65] = csvStruct.getl_ACPT_QTY();
          csvStr[66] = csvStruct.getl_ACPT_CMPLT_DATE();
          csvStr[67] = csvStruct.getl_INSPECTED_QTY();
          csvStr[68] = csvStruct.getl_ACCEPTED_QTY();
          csvStr[69] = csvStruct.getl_PUCH_ODR_EDI_ISS_DATE();
          csvStr[70] = csvStruct.getl_ODR_CANCEL_EDI_ISS_DATE();
          csvStr[71] = _dateCtrlStruct.getBUSINESS_OPR_DATE();
          csvStr[72] = sysUSER_CD;
          csvStr[73] = sp.getProcId();
          csvList.add(csvStr);
		}
		if (csvList != null && !csvList.isEmpty()) {
			// CsvWriter�𐶐�
			csvWriter = new CsvWriter(CsvWriter.getFileName(sysUSER_CD));
			csvWriter.write(csvList, CoreTools.getLocale(struct.getsUser_ID()),true);
			struct.setDOWNLOAD_FILE(csvWriter.getFilePath());
		}
			
                //}}user_implement_dev:<controlCsvOut>
		logger.exiting("AE0090020Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090020Control"+":USER="+struct.getsUser_ID(),"controlClear");
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
                     struct.setTIME_CTRL(((AE0090020Struct)listTimeCtrl.get(0)).getTIME_CTRL());
                     _flgTimeCtrl = struct.getTIME_CTRL();
                 }
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }

                //}}user_implement_dev:<controlClear>
		logger.exiting("AE0090020Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090020Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			initializeDetail();
			
			// DB���[�H��]."�H�ꖼ"���������A���݂��Ȃ��ꍇ�̓G���[
          if (struct.getPLANT_CD() != null && !struct.getPLANT_CD().equals("")) {

            List plantList = entity.mM_PLANT.read(conn, struct);
			if (plantList.isEmpty()) {
				setErrorMessage("AE00027");
				setErrorParameter("M_PLANT", "PLANT_CD", struct.getPLANT_CD());
			} else {
				// �����ł����ꍇ�́u�H�ꖼ�v��ݒ肷��B
				AE0090020Struct plantStruct = (AE0090020Struct) plantList.get(0);
				struct.setPLANT_NAME(plantStruct.getPLANT_NAME());
			}

          }
			// DB���[�����]."����於"���������A���݂��Ȃ��ꍇ�̓G���[
			if (struct.getVEND_CD() != null && !struct.getVEND_CD().equals("")) {
				List vendList = entity.mM_VEND_CTRL.read(conn, struct);
				if (vendList.isEmpty()) {
					setErrorMessage("AE20030");
					setErrorParameter("M_VEND", "VEND_CD", struct.getVEND_CD());
				} else {
					// �����ł����ꍇ�́u����於�v��ݒ肷��B
					AE0090020Struct vendStruct = (AE0090020Struct) vendList.get(0);
					struct.setVEND_NAME(vendStruct.getVEND_NAME());
				}
			}

          // DB���[�i��]."�i�ږ�"���������A���݂��Ȃ��ꍇ�̓G���[
          if ( struct.getITEM_CD() != null && !struct.getITEM_CD().equals("")) {
            List itemList = entity.mM_ITEM.read(conn, struct);
            if (itemList.isEmpty()) {
              setErrorMessage("AE50509");
              setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
            } else {
            // �����ł����ꍇ�́u����於�v��ݒ肷��B
            AE0090020Struct itemStruct = (AE0090020Struct) itemList.get(0);
            struct.setITEM_NAME(itemStruct.getITEM_NAME());
            }
          }

          // DB���[�����Z�c]."�����ԍ�"���������A���݂��Ȃ��ꍇ�̓G���[
          if (struct.getPUCH_ODR_CD() != null && !struct.getPUCH_ODR_CD().equals("")) {
            List odrList = entity.mT_RLSD_PUCH_ODR.read(conn, struct);
            if (odrList.isEmpty()) {
              setErrorMessage("AE00090");
              setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
            } else {
              //[�����c]."�H��R�[�h"�Ƣ�H��R�[�h����Ⴄ�ꍇ�̓G���[
              if (struct.getPLANT_CD() != null && !struct.getPLANT_CD().equals("")) {
                AE0090020Struct odrStruct = (AE0090020Struct) odrList.get(0);
                
                if (!struct.getPLANT_CD().equals(odrStruct.getPLANT_CD())) {
                  setErrorMessage("AE00100");
                  setErrorParameter("M_PLANT", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
                }
              }
            }
          }
          
          // DB���[�ۊǋ�]."�ۊǋ�R�[�h"���������A���݂��Ȃ��ꍇ�̓G���[
          if (struct.getWH_CD()!= null && !struct.getWH_CD().equals("")){
        	  List whcdList = entity.mM_WH.read(conn, struct);
        	  if (whcdList.isEmpty()){
        		  setErrorMessage("ZZ11006");
        		  setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
        	  }else{
        		  if (struct.getPLANT_CD() != null && !struct.getPLANT_CD().equals("")){
        			  AE0090020Struct whcdStruct = (AE0090020Struct) whcdList.get(0);
        			  // [�ۊǋ�]."�H��R�[�h"�Ƣ�H��R�[�h����Ⴄ�ꍇ�̓G���[  
        			  if (!struct.getPLANT_CD().equals(whcdStruct.getPLANT_CD())){
        				  setErrorMessage("AE00144");
        				  setErrorParameter("M_PLANT","PLANT_CD",struct.getPLANT_CD());
        				  setErrorParameter("M_WH","WH_CD",struct.getWH_CD());
        			  }else{
        		      // �����ł����ꍇ�́u�ۊǋ於�v��ݒ肷��B
        				  struct.setWH_NAME(whcdStruct.getWH_NAME());
        	  }
            }
          }
        }		  
         // DB���[���v��]."����"���������A���݂��Ȃ��ꍇ�̓G���[
          if (struct.getJOB_ODR_CD()!= null && !struct.getJOB_ODR_CD().equals("")){
        	  List jobList = entity.mT_OD.read(conn,struct);
        	  if (jobList.isEmpty()){
        		  setErrorMessage("GD00605");
        		  setErrorParameter("T_OD","JOB_ODR_CD",struct.getJOB_ODR_CD());
        	  }else{
        		  if (struct.getPLANT_CD() != null && !struct.getPLANT_CD().equals("")){
        			  AE0090020Struct jobStruct = (AE0090020Struct) jobList.get(0);
        			  // [���v��]."�H��R�[�h"�Ƣ�H��R�[�h����Ⴄ�ꍇ�̓G���[  
        			  if (!struct.getPLANT_CD().equals(jobStruct.getPLANT_CD())){
        				  setErrorMessage("AE00115");
        				  setErrorParameter("M_PLANT","PLANT_CD",struct.getPLANT_CD());
        				  setErrorParameter("T_OD","JOB_ODR_CD",struct.getJOB_ODR_CD());
        			  }
        		  }
        	  }
          }
          
         // DB���[���[�U�}�X�^]."���[�U�R�[�h"���������A���݂��Ȃ��ꍇ�̓G���[
          if (struct.getPUCH_ODR_PERSON()!= null && !struct.getPUCH_ODR_PERSON().equals("")){
        	  List personList = entity.mUSER_MST.read(conn,struct);
        	  if (personList.isEmpty()){
        		  setErrorMessage("ZZ09026");
        		  setErrorParameter("USER_MST","USER_CD",struct.getPUCH_ODR_PERSON());
        	  }
          }
        // �X�e�[�^�X�̃`�F�b�N���S��[off]�̏ꍇ
          if(!struct.getc1_WORK_STS_TYP().equals("true") 
             && !struct.getc2_WORK_STS_TYP().equals("true") 
             && !struct.getc3_WORK_STS_TYP().equals("true")
             && !struct.getc4_WORK_STS_TYP().equals("true")
             && !struct.getc5_WORK_STS_TYP().equals("true")
             && !struct.getc6_WORK_STS_TYP().equals("true")
             && !struct.getc7_WORK_STS_TYP().equals("true")
             && !struct.getc8_WORK_STS_TYP().equals("true")
             ){
            setErrorMessage("ZZ06001");
          }

          //��ʁD�X�e�[�^�X�̏�����
          struct.setSTATUS1(null);
          struct.setSTATUS2(null);
          struct.setSTATUS3(null);
          struct.setSTATUS4(null);
          struct.setSTATUS5(null);
          struct.setSTATUS6(null);
          struct.setSTATUS7(null);
          struct.setSTATUS8(null);

          //��ʁD�X�e�[�^�X�̔���
          if(struct.getc1_WORK_STS_TYP().equals("true")){
            struct.setSTATUS1("1");
          }
          if(struct.getc2_WORK_STS_TYP().equals("true")){
            struct.setSTATUS2("2");
          }
          if(struct.getc3_WORK_STS_TYP().equals("true")){
            struct.setSTATUS3("3");
          }
          if(struct.getc4_WORK_STS_TYP().equals("true")){
            struct.setSTATUS4("4");
          }
          if(struct.getc5_WORK_STS_TYP().equals("true")){
            struct.setSTATUS5("5");
          }
          if(struct.getc6_WORK_STS_TYP().equals("true")){
            struct.setSTATUS6("6");
          }
          if(struct.getc7_WORK_STS_TYP().equals("true")){
            struct.setSTATUS7("7");
          }
          if(struct.getc8_WORK_STS_TYP().equals("true")){
            struct.setSTATUS8("8");
          }
          
          // �G���[������ΏI��
          if (msgStruct.hasError()) {
            return;
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
         //	�ő�\���s��
          int maxLine = sp.getMaxLine(conn, 10);
			if(maxLine != 0) {
				struct.setROW_COUNT(String.valueOf(maxLine));
			} else {
				struct.setROW_COUNT(null);
			}
			List viewList = entity.mViewCnt.read(conn, struct);
			long rowCount = Long.parseLong(((AE0090020Struct)viewList.get(0)).getl_COUNT()); 
			
          // �Ώی���=0���̏ꍇ�G���[
          if (rowCount==0) {
            setErrorMessage("ZZ06001");
            setErrorParameter("T_RLSD_PUCH_ODR", "PLANT_CD", struct.getPLANT_CD());
            setErrorParameter("T_RLSD_PUCH_ODR", "VEND_CD", struct.getVEND_CD());
            
            setErrorParameter("T_RLSD_PUCH_ODR", "ITEM_CD", struct.getITEM_CD());
            setErrorParameter("T_RLSD_PUCH_ODR", "WH_CD", struct.getWH_CD());
            setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
            
            setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_START_DATE", struct.getPUCH_ODR_START_DATE());
            setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_DLV_DATE", struct.getPUCH_ODR_DLV_DATE());
            
            setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_PERSON", struct.getPUCH_ODR_PERSON());
            setErrorParameter("T_RLSD_PUCH_ODR", "c1_WORK_STS_TYP", struct.getc1_WORK_STS_TYP());
            setErrorParameter("T_RLSD_PUCH_ODR", "c2_WORK_STS_TYP", struct.getc2_WORK_STS_TYP());
            setErrorParameter("T_RLSD_PUCH_ODR", "c3_WORK_STS_TYP", struct.getc3_WORK_STS_TYP());
            setErrorParameter("T_RLSD_PUCH_ODR", "c4_WORK_STS_TYP", struct.getc4_WORK_STS_TYP());
            setErrorParameter("T_RLSD_PUCH_ODR", "c5_WORK_STS_TYP", struct.getc5_WORK_STS_TYP());
            setErrorParameter("T_RLSD_PUCH_ODR", "c6_WORK_STS_TYP", struct.getc6_WORK_STS_TYP());
            setErrorParameter("T_RLSD_PUCH_ODR", "c7_WORK_STS_TYP", struct.getc7_WORK_STS_TYP());
            setErrorParameter("T_RLSD_PUCH_ODR", "c8_WORK_STS_TYP", struct.getc8_WORK_STS_TYP());




            
//20050728				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_STS_TYP", struct.getPUCH_ODR_STS_TYP());
              

		
            readStatus = NOT_FOUND;
        	if(list != null && list.size() > 0){
				list.clear();
			}
            return;
          }
          // �\���s�������l(SYS_SCREEN_PARM)�𒴂����ꍇ�G���[
          if ((maxLine != 0) && (rowCount == maxLine + 1)) {
            setErrorMessage("ZZ01115", String.valueOf(maxLine));
            readStatus = TOO_MANY;
        	if(list != null && list.size() > 0){
				list.clear();
			}
            return;
          }
          // ���X�g�f�[�^�̌���
          viewList = entity.mView.read(conn, struct);
         _csvList = viewList;
           AE0090020Struct TempStruct;
             for (int i = 0; i < viewList.size(); i++) {
		     TempStruct = (AE0090020Struct)viewList.get(i);

		     //�R���{�{�b�N�X�̎擾
		     TempStruct.setl_STATUS_DN(multcombo("PUCH_ODR_STATUS",TempStruct.getl_STATUS()));
		     TempStruct.setl_UNIT_COST_TYP_DN(multcombo("UNIT_COST_TYP",TempStruct.getl_UNIT_COST_TYP()));
		     TempStruct.setl_PUCH_ODR_INST_SLIP_ISS_FLG_DN(multcombo("PUCH_ODR_INST_SLIP_ISS_FLG",TempStruct.getl_PUCH_ODR_INST_SLIP_ISS_FLG()));
		     TempStruct.setl_PUCH_ODR_STS_TYP_DN(multcombo("PUCH_ODR_STS_TYP",TempStruct.getl_PUCH_ODR_STS_TYP()));
		     TempStruct.setl_INSPC_CMPLT_FLG_DN(multcombo("INSPC_CMPLT_FLG",TempStruct.getl_INSPC_CMPLT_FLG()));
		     TempStruct.setl_SPL_ITEM_TYP_DN(multcombo("SPL_ITEM_TYP",TempStruct.getl_SPL_ITEM_TYP()));
		     TempStruct.setl_ACPT_INSPC_TYP_DN(multcombo("ACPT_INSPC_TYP",TempStruct.getl_ACPT_INSPC_TYP()));
		     TempStruct.setl_INV_CTRL_FLG_DN(multcombo("INV_CTRL_FLG",TempStruct.getl_INV_CTRL_FLG()));
		     TempStruct.setl_NON_NO_ITEM_FLG_DN(multcombo("NON_NO_ITEM_FLG",TempStruct.getl_NON_NO_ITEM_FLG()));
		     TempStruct.setl_MRP_ODR_TYP_DN(multcombo("MRP_ODR_TYP",TempStruct.getl_MRP_ODR_TYP()));
		     TempStruct.setl_ODR_CANCEL_SLIP_ISS_FLG_DN(multcombo("ODR_CANCEL_SLIP_ISS_FLG",TempStruct.getl_ODR_CANCEL_SLIP_ISS_FLG()));

	    }
          // ���X�g�f�[�^��ݒ�
          setList(viewList);
          readStatus = NORMAL;
          
        } catch (SQLException e) {
          throw new ExpjException(e);
		}
		
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AE0090020Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �����v�惁���e�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlButton1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090020Control"+":USER="+struct.getsUser_ID(),"controlButton1");
			//{{user_implement_dev:<controlButton1>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlButton1>
		logger.exiting("AE0090020Control"+":USER="+struct.getsUser_ID(),"controlButton1");

		return;
	}

	/**
	 * ������ѓ��̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlButton2() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090020Control"+":USER="+struct.getsUser_ID(),"controlButton2");
			//{{user_implement_dev:<controlButton2>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlButton2>
		logger.exiting("AE0090020Control"+":USER="+struct.getsUser_ID(),"controlButton2");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>

                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AE0090020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>

		try {
			_dateCtrlStruct = DateCtrlControl.getData(conn, sysPLANT_CD);
                        //�����Ǘ��p�����[�^�擾
                        List listTimeCtrl = entity.mSYS_PARAMETER.read(conn,struct);
                        if(listTimeCtrl == null || listTimeCtrl.size() <=0){
                            struct.setTIME_CTRL("false");
                            _flgTimeCtrl = "false";
                        }else{
                            struct.setTIME_CTRL(((AE0090020Struct)listTimeCtrl.get(0)).getTIME_CTRL());
                            _flgTimeCtrl = struct.getTIME_CTRL();
                        }
		} catch (SQLException e) {
			throw new ExpjException(e);
		} catch (DataNotFoundException e) {
			throw new ExpjException(e);
		}

		// ��ʂ�������
		initializeAll();

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AE0090020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
		logger.exiting("AE0090020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("CsvOut") ) {
				controlCsvOut();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Select") ) {
				controlSelect();
			} else if( button.equals("Button1") ) {
				controlButton1();
			} else if( button.equals("Button2") ) {
				controlButton2();
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
//			throw new FoundationException("AE0090020Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0090020-E999","CSV�̏o�͏���"));
			throw new FoundationException("AE0090020Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0090020-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AE0090020Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0090020-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AE0090020Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AE0090020Entity entity;
	protected AE0090020Struct struct;
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

		entity = new AE0090020Entity();
		struct = new AE0090020Struct();

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
	 * AE0090020�N���X�̕W���R���X�g���N�^
	 */
	public AE0090020Control() throws BusinessProcessException, FoundationException
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
				AE0090020Struct key = (AE0090020Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE") && key.getPUCH_ODR_START_DATE() != null) {
					msgKey.setKeyValue("PUCH_ODR_START_DATE", key.getPUCH_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE") && key.getPUCH_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("PUCH_ODR_DLV_DATE", key.getPUCH_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_MRP_ODR_TYP_DN") && key.getl_MRP_ODR_TYP_DN() != null) {
					msgKey.setKeyValue("l_MRP_ODR_TYP_DN", key.getl_MRP_ODR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_ACPT_INSPC_TYP_DN") && key.getl_ACPT_INSPC_TYP_DN() != null) {
					msgKey.setKeyValue("l_ACPT_INSPC_TYP_DN", key.getl_ACPT_INSPC_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("c1_WORK_STS_TYP") && key.getc1_WORK_STS_TYP() != null) {
					msgKey.setKeyValue("c1_WORK_STS_TYP", key.getc1_WORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("c2_WORK_STS_TYP") && key.getc2_WORK_STS_TYP() != null) {
					msgKey.setKeyValue("c2_WORK_STS_TYP", key.getc2_WORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("c3_WORK_STS_TYP") && key.getc3_WORK_STS_TYP() != null) {
					msgKey.setKeyValue("c3_WORK_STS_TYP", key.getc3_WORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("c4_WORK_STS_TYP") && key.getc4_WORK_STS_TYP() != null) {
					msgKey.setKeyValue("c4_WORK_STS_TYP", key.getc4_WORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("c5_WORK_STS_TYP") && key.getc5_WORK_STS_TYP() != null) {
					msgKey.setKeyValue("c5_WORK_STS_TYP", key.getc5_WORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("c6_WORK_STS_TYP") && key.getc6_WORK_STS_TYP() != null) {
					msgKey.setKeyValue("c6_WORK_STS_TYP", key.getc6_WORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("c7_WORK_STS_TYP") && key.getc7_WORK_STS_TYP() != null) {
					msgKey.setKeyValue("c7_WORK_STS_TYP", key.getc7_WORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("c8_WORK_STS_TYP") && key.getc8_WORK_STS_TYP() != null) {
					msgKey.setKeyValue("c8_WORK_STS_TYP", key.getc8_WORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_STATUS_DN") && key.getl_STATUS_DN() != null) {
					msgKey.setKeyValue("l_STATUS_DN", key.getl_STATUS_DN());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_START_TIME") && key.getPUCH_ODR_START_TIME() != null) {
					msgKey.setKeyValue("PUCH_ODR_START_TIME", key.getPUCH_ODR_START_TIME());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_TIME") && key.getPUCH_ODR_DLV_TIME() != null) {
					msgKey.setKeyValue("PUCH_ODR_DLV_TIME", key.getPUCH_ODR_DLV_TIME());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_COST_TYP_DN") && key.getl_UNIT_COST_TYP_DN() != null) {
					msgKey.setKeyValue("l_UNIT_COST_TYP_DN", key.getl_UNIT_COST_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_INST_SLIP_ISS_FLG_DN") && key.getl_PUCH_ODR_INST_SLIP_ISS_FLG_DN() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_INST_SLIP_ISS_FLG_DN", key.getl_PUCH_ODR_INST_SLIP_ISS_FLG_DN());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_STS_TYP_DN") && key.getl_PUCH_ODR_STS_TYP_DN() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_STS_TYP_DN", key.getl_PUCH_ODR_STS_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_INSPC_CMPLT_FLG_DN") && key.getl_INSPC_CMPLT_FLG_DN() != null) {
					msgKey.setKeyValue("l_INSPC_CMPLT_FLG_DN", key.getl_INSPC_CMPLT_FLG_DN());
				}
				if(msgKeyType.containsKeyColumn("l_SPL_ITEM_TYP_DN") && key.getl_SPL_ITEM_TYP_DN() != null) {
					msgKey.setKeyValue("l_SPL_ITEM_TYP_DN", key.getl_SPL_ITEM_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_INV_CTRL_FLG_DN") && key.getl_INV_CTRL_FLG_DN() != null) {
					msgKey.setKeyValue("l_INV_CTRL_FLG_DN", key.getl_INV_CTRL_FLG_DN());
				}
				if(msgKeyType.containsKeyColumn("l_NON_NO_ITEM_FLG_DN") && key.getl_NON_NO_ITEM_FLG_DN() != null) {
					msgKey.setKeyValue("l_NON_NO_ITEM_FLG_DN", key.getl_NON_NO_ITEM_FLG_DN());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_CANCEL_SLIP_ISS_FLG_DN") && key.getl_ODR_CANCEL_SLIP_ISS_FLG_DN() != null) {
					msgKey.setKeyValue("l_ODR_CANCEL_SLIP_ISS_FLG_DN", key.getl_ODR_CANCEL_SLIP_ISS_FLG_DN());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_CD") && key.getl_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_CD", key.getl_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_PLANT_CD") && key.getl_PLANT_CD() != null) {
					msgKey.setKeyValue("l_PLANT_CD", key.getl_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_WH_CD") && key.getl_WH_CD() != null) {
					msgKey.setKeyValue("l_WH_CD", key.getl_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("l_WH_NAME") && key.getl_WH_NAME() != null) {
					msgKey.setKeyValue("l_WH_NAME", key.getl_WH_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_CD") && key.getl_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ITEM_CD", key.getl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_NAME") && key.getl_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ITEM_NAME", key.getl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_COMPANY_CD") && key.getl_COMPANY_CD() != null) {
					msgKey.setKeyValue("l_COMPANY_CD", key.getl_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("l_VEND_CD") && key.getl_VEND_CD() != null) {
					msgKey.setKeyValue("l_VEND_CD", key.getl_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("l_VEND_ANAME") && key.getl_VEND_ANAME() != null) {
					msgKey.setKeyValue("l_VEND_ANAME", key.getl_VEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("VEND_NAME") && key.getVEND_NAME() != null) {
					msgKey.setKeyValue("VEND_NAME", key.getVEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_PERSON") && key.getl_PUCH_ODR_PERSON() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_PERSON", key.getl_PUCH_ODR_PERSON());
				}
				if(msgKeyType.containsKeyColumn("l_USER_NAME") && key.getl_USER_NAME() != null) {
					msgKey.setKeyValue("l_USER_NAME", key.getl_USER_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_START_DATE") && key.getl_PUCH_ODR_START_DATE() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_START_DATE", key.getl_PUCH_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_DLV_DATE") && key.getl_PUCH_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_DLV_DATE", key.getl_PUCH_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_QTY") && key.getl_PUCH_ODR_QTY() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_QTY", key.getl_PUCH_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_STOCK_UNIT") && key.getl_STOCK_UNIT() != null) {
					msgKey.setKeyValue("l_STOCK_UNIT", key.getl_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_COST_TYP") && key.getl_UNIT_COST_TYP() != null) {
					msgKey.setKeyValue("l_UNIT_COST_TYP", key.getl_UNIT_COST_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_COST") && key.getl_UNIT_COST() != null) {
					msgKey.setKeyValue("l_UNIT_COST", key.getl_UNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_AMOUNT") && key.getl_PUCH_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_AMOUNT", key.getl_PUCH_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_VEND_CUR_UNIT") && key.getl_VEND_CUR_UNIT() != null) {
					msgKey.setKeyValue("l_VEND_CUR_UNIT", key.getl_VEND_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("l_DISC_AMOUNT") && key.getl_DISC_AMOUNT() != null) {
					msgKey.setKeyValue("l_DISC_AMOUNT", key.getl_DISC_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_NET_AMOUNT") && key.getl_NET_AMOUNT() != null) {
					msgKey.setKeyValue("l_NET_AMOUNT", key.getl_NET_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_TAX_AMOUNT_1") && key.getl_TAX_AMOUNT_1() != null) {
					msgKey.setKeyValue("l_TAX_AMOUNT_1", key.getl_TAX_AMOUNT_1());
				}
				if(msgKeyType.containsKeyColumn("l_TAX_AMOUNT_2") && key.getl_TAX_AMOUNT_2() != null) {
					msgKey.setKeyValue("l_TAX_AMOUNT_2", key.getl_TAX_AMOUNT_2());
				}
				if(msgKeyType.containsKeyColumn("l_TAX_AMOUNT_3") && key.getl_TAX_AMOUNT_3() != null) {
					msgKey.setKeyValue("l_TAX_AMOUNT_3", key.getl_TAX_AMOUNT_3());
				}
				if(msgKeyType.containsKeyColumn("l_AMOUNT_INCLUDE_TAX") && key.getl_AMOUNT_INCLUDE_TAX() != null) {
					msgKey.setKeyValue("l_AMOUNT_INCLUDE_TAX", key.getl_AMOUNT_INCLUDE_TAX());
				}
				if(msgKeyType.containsKeyColumn("l_RATE_JUDGE_DATE") && key.getl_RATE_JUDGE_DATE() != null) {
					msgKey.setKeyValue("l_RATE_JUDGE_DATE", key.getl_RATE_JUDGE_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_EXCH_RATE") && key.getl_EXCH_RATE() != null) {
					msgKey.setKeyValue("l_EXCH_RATE", key.getl_EXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("l_HOME_CUR_AMOUNT") && key.getl_HOME_CUR_AMOUNT() != null) {
					msgKey.setKeyValue("l_HOME_CUR_AMOUNT", key.getl_HOME_CUR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_HOME_CUR_UNIT") && key.getl_HOME_CUR_UNIT() != null) {
					msgKey.setKeyValue("l_HOME_CUR_UNIT", key.getl_HOME_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_INST_DATE") && key.getl_PUCH_ODR_INST_DATE() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_INST_DATE", key.getl_PUCH_ODR_INST_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_INST_SLIP_ISS_FLG") && key.getl_PUCH_ODR_INST_SLIP_ISS_FLG() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_INST_SLIP_ISS_FLG", key.getl_PUCH_ODR_INST_SLIP_ISS_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_SLIP_ISS_DATE") && key.getl_PUCH_ODR_SLIP_ISS_DATE() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_SLIP_ISS_DATE", key.getl_PUCH_ODR_SLIP_ISS_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_STS_TYP") && key.getl_PUCH_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_STS_TYP", key.getl_PUCH_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_INSPC_CMPLT_FLG") && key.getl_INSPC_CMPLT_FLG() != null) {
					msgKey.setKeyValue("l_INSPC_CMPLT_FLG", key.getl_INSPC_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_INSPC_CMPLT_DATE") && key.getl_INSPC_CMPLT_DATE() != null) {
					msgKey.setKeyValue("l_INSPC_CMPLT_DATE", key.getl_INSPC_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_CONFIRM_DLV_DATE") && key.getl_CONFIRM_DLV_DATE() != null) {
					msgKey.setKeyValue("l_CONFIRM_DLV_DATE", key.getl_CONFIRM_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_SPL_ITEM_TYP") && key.getl_SPL_ITEM_TYP() != null) {
					msgKey.setKeyValue("l_SPL_ITEM_TYP", key.getl_SPL_ITEM_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_ACPT_INSPC_TYP") && key.getl_ACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("l_ACPT_INSPC_TYP", key.getl_ACPT_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_INV_CTRL_FLG") && key.getl_INV_CTRL_FLG() != null) {
					msgKey.setKeyValue("l_INV_CTRL_FLG", key.getl_INV_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_WORK_ODR_CD") && key.getl_WORK_ODR_CD() != null) {
					msgKey.setKeyValue("l_WORK_ODR_CD", key.getl_WORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_OD_NO") && key.getl_OD_NO() != null) {
					msgKey.setKeyValue("l_OD_NO", key.getl_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD") && key.getl_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CD", key.getl_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_COMMENT") && key.getl_PUCH_ODR_COMMENT() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_COMMENT", key.getl_PUCH_ODR_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_CD") && key.getl_ODR_CD() != null) {
					msgKey.setKeyValue("l_ODR_CD", key.getl_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_DETAIL_NO") && key.getl_DETAIL_NO() != null) {
					msgKey.setKeyValue("l_DETAIL_NO", key.getl_DETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("l_NON_NO_ITEM_FLG") && key.getl_NON_NO_ITEM_FLG() != null) {
					msgKey.setKeyValue("l_NON_NO_ITEM_FLG", key.getl_NON_NO_ITEM_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_DRAW_CD") && key.getl_DRAW_CD() != null) {
					msgKey.setKeyValue("l_DRAW_CD", key.getl_DRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC") && key.getl_SPEC() != null) {
					msgKey.setKeyValue("l_SPEC", key.getl_SPEC());
				}
				if(msgKeyType.containsKeyColumn("l_MRP_ODR_TYP") && key.getl_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("l_MRP_ODR_TYP", key.getl_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_ACPT_QTY") && key.getl_ACPT_QTY() != null) {
					msgKey.setKeyValue("l_ACPT_QTY", key.getl_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ACPT_CMPLT_DATE") && key.getl_ACPT_CMPLT_DATE() != null) {
					msgKey.setKeyValue("l_ACPT_CMPLT_DATE", key.getl_ACPT_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_INSPECTED_QTY") && key.getl_INSPECTED_QTY() != null) {
					msgKey.setKeyValue("l_INSPECTED_QTY", key.getl_INSPECTED_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ACCEPTED_QTY") && key.getl_ACCEPTED_QTY() != null) {
					msgKey.setKeyValue("l_ACCEPTED_QTY", key.getl_ACCEPTED_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_EDI_ISS_DATE") && key.getl_PUCH_ODR_EDI_ISS_DATE() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_EDI_ISS_DATE", key.getl_PUCH_ODR_EDI_ISS_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_CANCEL_SLIP_ISS_DATE") && key.getl_ODR_CANCEL_SLIP_ISS_DATE() != null) {
					msgKey.setKeyValue("l_ODR_CANCEL_SLIP_ISS_DATE", key.getl_ODR_CANCEL_SLIP_ISS_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_CONFIRM_DLV_DATE_COMMENT") && key.getl_CONFIRM_DLV_DATE_COMMENT() != null) {
					msgKey.setKeyValue("l_CONFIRM_DLV_DATE_COMMENT", key.getl_CONFIRM_DLV_DATE_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_CANCEL_SLIP_ISS_FLG") && key.getl_ODR_CANCEL_SLIP_ISS_FLG() != null) {
					msgKey.setKeyValue("l_ODR_CANCEL_SLIP_ISS_FLG", key.getl_ODR_CANCEL_SLIP_ISS_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_CANCEL_EDI_ISS_DATE") && key.getl_ODR_CANCEL_EDI_ISS_DATE() != null) {
					msgKey.setKeyValue("l_ODR_CANCEL_EDI_ISS_DATE", key.getl_ODR_CANCEL_EDI_ISS_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_CANCEL_CAUSE_CD") && key.getl_ODR_CANCEL_CAUSE_CD() != null) {
					msgKey.setKeyValue("l_ODR_CANCEL_CAUSE_CD", key.getl_ODR_CANCEL_CAUSE_CD());
				}
				if(msgKeyType.containsKeyColumn("l_STATUS") && key.getl_STATUS() != null) {
					msgKey.setKeyValue("l_STATUS", key.getl_STATUS());
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
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("STATUS1") && key.getSTATUS1() != null) {
					msgKey.setKeyValue("STATUS1", key.getSTATUS1());
				}
				if(msgKeyType.containsKeyColumn("STATUS2") && key.getSTATUS2() != null) {
					msgKey.setKeyValue("STATUS2", key.getSTATUS2());
				}
				if(msgKeyType.containsKeyColumn("STATUS3") && key.getSTATUS3() != null) {
					msgKey.setKeyValue("STATUS3", key.getSTATUS3());
				}
				if(msgKeyType.containsKeyColumn("STATUS4") && key.getSTATUS4() != null) {
					msgKey.setKeyValue("STATUS4", key.getSTATUS4());
				}
				if(msgKeyType.containsKeyColumn("STATUS5") && key.getSTATUS5() != null) {
					msgKey.setKeyValue("STATUS5", key.getSTATUS5());
				}
				if(msgKeyType.containsKeyColumn("STATUS6") && key.getSTATUS6() != null) {
					msgKey.setKeyValue("STATUS6", key.getSTATUS6());
				}
				if(msgKeyType.containsKeyColumn("STATUS7") && key.getSTATUS7() != null) {
					msgKey.setKeyValue("STATUS7", key.getSTATUS7());
				}
				if(msgKeyType.containsKeyColumn("STATUS8") && key.getSTATUS8() != null) {
					msgKey.setKeyValue("STATUS8", key.getSTATUS8());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON") && key.getPUCH_ODR_PERSON() != null) {
					msgKey.setKeyValue("PUCH_ODR_PERSON", key.getPUCH_ODR_PERSON());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("OUT_PUCH_ODR_CD") && key.getOUT_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("OUT_PUCH_ODR_CD", key.getOUT_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("TIME_CTRL") && key.getTIME_CTRL() != null) {
					msgKey.setKeyValue("TIME_CTRL", key.getTIME_CTRL());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_COUNT") && key.getl_COUNT() != null) {
					msgKey.setKeyValue("l_COUNT", key.getl_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ROW_COUNT") && key.getROW_COUNT() != null) {
					msgKey.setKeyValue("ROW_COUNT", key.getROW_COUNT());
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
					AE0090020Struct key = new AE0090020Struct();
					if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE")) {
						key.setPUCH_ODR_START_DATE(msgKey.getKeyValue("PUCH_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE")) {
						key.setPUCH_ODR_DLV_DATE(msgKey.getKeyValue("PUCH_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_MRP_ODR_TYP_DN")) {
						key.setl_MRP_ODR_TYP_DN(msgKey.getKeyValue("l_MRP_ODR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_ACPT_INSPC_TYP_DN")) {
						key.setl_ACPT_INSPC_TYP_DN(msgKey.getKeyValue("l_ACPT_INSPC_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("c1_WORK_STS_TYP")) {
						key.setc1_WORK_STS_TYP(msgKey.getKeyValue("c1_WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("c2_WORK_STS_TYP")) {
						key.setc2_WORK_STS_TYP(msgKey.getKeyValue("c2_WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("c3_WORK_STS_TYP")) {
						key.setc3_WORK_STS_TYP(msgKey.getKeyValue("c3_WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("c4_WORK_STS_TYP")) {
						key.setc4_WORK_STS_TYP(msgKey.getKeyValue("c4_WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("c5_WORK_STS_TYP")) {
						key.setc5_WORK_STS_TYP(msgKey.getKeyValue("c5_WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("c6_WORK_STS_TYP")) {
						key.setc6_WORK_STS_TYP(msgKey.getKeyValue("c6_WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("c7_WORK_STS_TYP")) {
						key.setc7_WORK_STS_TYP(msgKey.getKeyValue("c7_WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("c8_WORK_STS_TYP")) {
						key.setc8_WORK_STS_TYP(msgKey.getKeyValue("c8_WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_STATUS_DN")) {
						key.setl_STATUS_DN(msgKey.getKeyValue("l_STATUS_DN"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_START_TIME")) {
						key.setPUCH_ODR_START_TIME(msgKey.getKeyValue("PUCH_ODR_START_TIME"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_TIME")) {
						key.setPUCH_ODR_DLV_TIME(msgKey.getKeyValue("PUCH_ODR_DLV_TIME"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_COST_TYP_DN")) {
						key.setl_UNIT_COST_TYP_DN(msgKey.getKeyValue("l_UNIT_COST_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_INST_SLIP_ISS_FLG_DN")) {
						key.setl_PUCH_ODR_INST_SLIP_ISS_FLG_DN(msgKey.getKeyValue("l_PUCH_ODR_INST_SLIP_ISS_FLG_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_STS_TYP_DN")) {
						key.setl_PUCH_ODR_STS_TYP_DN(msgKey.getKeyValue("l_PUCH_ODR_STS_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_INSPC_CMPLT_FLG_DN")) {
						key.setl_INSPC_CMPLT_FLG_DN(msgKey.getKeyValue("l_INSPC_CMPLT_FLG_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_SPL_ITEM_TYP_DN")) {
						key.setl_SPL_ITEM_TYP_DN(msgKey.getKeyValue("l_SPL_ITEM_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_INV_CTRL_FLG_DN")) {
						key.setl_INV_CTRL_FLG_DN(msgKey.getKeyValue("l_INV_CTRL_FLG_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_NON_NO_ITEM_FLG_DN")) {
						key.setl_NON_NO_ITEM_FLG_DN(msgKey.getKeyValue("l_NON_NO_ITEM_FLG_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_CANCEL_SLIP_ISS_FLG_DN")) {
						key.setl_ODR_CANCEL_SLIP_ISS_FLG_DN(msgKey.getKeyValue("l_ODR_CANCEL_SLIP_ISS_FLG_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_CD")) {
						key.setl_PUCH_ODR_CD(msgKey.getKeyValue("l_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_PLANT_CD")) {
						key.setl_PLANT_CD(msgKey.getKeyValue("l_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_WH_CD")) {
						key.setl_WH_CD(msgKey.getKeyValue("l_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_WH_NAME")) {
						key.setl_WH_NAME(msgKey.getKeyValue("l_WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_CD")) {
						key.setl_ITEM_CD(msgKey.getKeyValue("l_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_NAME")) {
						key.setl_ITEM_NAME(msgKey.getKeyValue("l_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_COMPANY_CD")) {
						key.setl_COMPANY_CD(msgKey.getKeyValue("l_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_VEND_CD")) {
						key.setl_VEND_CD(msgKey.getKeyValue("l_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_VEND_ANAME")) {
						key.setl_VEND_ANAME(msgKey.getKeyValue("l_VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("VEND_NAME")) {
						key.setVEND_NAME(msgKey.getKeyValue("VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_PERSON")) {
						key.setl_PUCH_ODR_PERSON(msgKey.getKeyValue("l_PUCH_ODR_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("l_USER_NAME")) {
						key.setl_USER_NAME(msgKey.getKeyValue("l_USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_START_DATE")) {
						key.setl_PUCH_ODR_START_DATE(msgKey.getKeyValue("l_PUCH_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_DLV_DATE")) {
						key.setl_PUCH_ODR_DLV_DATE(msgKey.getKeyValue("l_PUCH_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_QTY")) {
						key.setl_PUCH_ODR_QTY(msgKey.getKeyValue("l_PUCH_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_STOCK_UNIT")) {
						key.setl_STOCK_UNIT(msgKey.getKeyValue("l_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_COST_TYP")) {
						key.setl_UNIT_COST_TYP(msgKey.getKeyValue("l_UNIT_COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_COST")) {
						key.setl_UNIT_COST(msgKey.getKeyValue("l_UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_AMOUNT")) {
						key.setl_PUCH_ODR_AMOUNT(msgKey.getKeyValue("l_PUCH_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_VEND_CUR_UNIT")) {
						key.setl_VEND_CUR_UNIT(msgKey.getKeyValue("l_VEND_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("l_DISC_AMOUNT")) {
						key.setl_DISC_AMOUNT(msgKey.getKeyValue("l_DISC_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_NET_AMOUNT")) {
						key.setl_NET_AMOUNT(msgKey.getKeyValue("l_NET_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_TAX_AMOUNT_1")) {
						key.setl_TAX_AMOUNT_1(msgKey.getKeyValue("l_TAX_AMOUNT_1"));
					}
					if(msgKeyType.containsKeyColumn("l_TAX_AMOUNT_2")) {
						key.setl_TAX_AMOUNT_2(msgKey.getKeyValue("l_TAX_AMOUNT_2"));
					}
					if(msgKeyType.containsKeyColumn("l_TAX_AMOUNT_3")) {
						key.setl_TAX_AMOUNT_3(msgKey.getKeyValue("l_TAX_AMOUNT_3"));
					}
					if(msgKeyType.containsKeyColumn("l_AMOUNT_INCLUDE_TAX")) {
						key.setl_AMOUNT_INCLUDE_TAX(msgKey.getKeyValue("l_AMOUNT_INCLUDE_TAX"));
					}
					if(msgKeyType.containsKeyColumn("l_RATE_JUDGE_DATE")) {
						key.setl_RATE_JUDGE_DATE(msgKey.getKeyValue("l_RATE_JUDGE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_EXCH_RATE")) {
						key.setl_EXCH_RATE(msgKey.getKeyValue("l_EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("l_HOME_CUR_AMOUNT")) {
						key.setl_HOME_CUR_AMOUNT(msgKey.getKeyValue("l_HOME_CUR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_HOME_CUR_UNIT")) {
						key.setl_HOME_CUR_UNIT(msgKey.getKeyValue("l_HOME_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_INST_DATE")) {
						key.setl_PUCH_ODR_INST_DATE(msgKey.getKeyValue("l_PUCH_ODR_INST_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_INST_SLIP_ISS_FLG")) {
						key.setl_PUCH_ODR_INST_SLIP_ISS_FLG(msgKey.getKeyValue("l_PUCH_ODR_INST_SLIP_ISS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_SLIP_ISS_DATE")) {
						key.setl_PUCH_ODR_SLIP_ISS_DATE(msgKey.getKeyValue("l_PUCH_ODR_SLIP_ISS_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_STS_TYP")) {
						key.setl_PUCH_ODR_STS_TYP(msgKey.getKeyValue("l_PUCH_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_INSPC_CMPLT_FLG")) {
						key.setl_INSPC_CMPLT_FLG(msgKey.getKeyValue("l_INSPC_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_INSPC_CMPLT_DATE")) {
						key.setl_INSPC_CMPLT_DATE(msgKey.getKeyValue("l_INSPC_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_CONFIRM_DLV_DATE")) {
						key.setl_CONFIRM_DLV_DATE(msgKey.getKeyValue("l_CONFIRM_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_SPL_ITEM_TYP")) {
						key.setl_SPL_ITEM_TYP(msgKey.getKeyValue("l_SPL_ITEM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_ACPT_INSPC_TYP")) {
						key.setl_ACPT_INSPC_TYP(msgKey.getKeyValue("l_ACPT_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_INV_CTRL_FLG")) {
						key.setl_INV_CTRL_FLG(msgKey.getKeyValue("l_INV_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_WORK_ODR_CD")) {
						key.setl_WORK_ODR_CD(msgKey.getKeyValue("l_WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_OD_NO")) {
						key.setl_OD_NO(msgKey.getKeyValue("l_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD")) {
						key.setl_JOB_ODR_CD(msgKey.getKeyValue("l_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_COMMENT")) {
						key.setl_PUCH_ODR_COMMENT(msgKey.getKeyValue("l_PUCH_ODR_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_CD")) {
						key.setl_ODR_CD(msgKey.getKeyValue("l_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_DETAIL_NO")) {
						key.setl_DETAIL_NO(msgKey.getKeyValue("l_DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_NON_NO_ITEM_FLG")) {
						key.setl_NON_NO_ITEM_FLG(msgKey.getKeyValue("l_NON_NO_ITEM_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_DRAW_CD")) {
						key.setl_DRAW_CD(msgKey.getKeyValue("l_DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC")) {
						key.setl_SPEC(msgKey.getKeyValue("l_SPEC"));
					}
					if(msgKeyType.containsKeyColumn("l_MRP_ODR_TYP")) {
						key.setl_MRP_ODR_TYP(msgKey.getKeyValue("l_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_ACPT_QTY")) {
						key.setl_ACPT_QTY(msgKey.getKeyValue("l_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ACPT_CMPLT_DATE")) {
						key.setl_ACPT_CMPLT_DATE(msgKey.getKeyValue("l_ACPT_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_INSPECTED_QTY")) {
						key.setl_INSPECTED_QTY(msgKey.getKeyValue("l_INSPECTED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ACCEPTED_QTY")) {
						key.setl_ACCEPTED_QTY(msgKey.getKeyValue("l_ACCEPTED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_EDI_ISS_DATE")) {
						key.setl_PUCH_ODR_EDI_ISS_DATE(msgKey.getKeyValue("l_PUCH_ODR_EDI_ISS_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_CANCEL_SLIP_ISS_DATE")) {
						key.setl_ODR_CANCEL_SLIP_ISS_DATE(msgKey.getKeyValue("l_ODR_CANCEL_SLIP_ISS_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_CONFIRM_DLV_DATE_COMMENT")) {
						key.setl_CONFIRM_DLV_DATE_COMMENT(msgKey.getKeyValue("l_CONFIRM_DLV_DATE_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_CANCEL_SLIP_ISS_FLG")) {
						key.setl_ODR_CANCEL_SLIP_ISS_FLG(msgKey.getKeyValue("l_ODR_CANCEL_SLIP_ISS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_CANCEL_EDI_ISS_DATE")) {
						key.setl_ODR_CANCEL_EDI_ISS_DATE(msgKey.getKeyValue("l_ODR_CANCEL_EDI_ISS_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_CANCEL_CAUSE_CD")) {
						key.setl_ODR_CANCEL_CAUSE_CD(msgKey.getKeyValue("l_ODR_CANCEL_CAUSE_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_STATUS")) {
						key.setl_STATUS(msgKey.getKeyValue("l_STATUS"));
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
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("STATUS1")) {
						key.setSTATUS1(msgKey.getKeyValue("STATUS1"));
					}
					if(msgKeyType.containsKeyColumn("STATUS2")) {
						key.setSTATUS2(msgKey.getKeyValue("STATUS2"));
					}
					if(msgKeyType.containsKeyColumn("STATUS3")) {
						key.setSTATUS3(msgKey.getKeyValue("STATUS3"));
					}
					if(msgKeyType.containsKeyColumn("STATUS4")) {
						key.setSTATUS4(msgKey.getKeyValue("STATUS4"));
					}
					if(msgKeyType.containsKeyColumn("STATUS5")) {
						key.setSTATUS5(msgKey.getKeyValue("STATUS5"));
					}
					if(msgKeyType.containsKeyColumn("STATUS6")) {
						key.setSTATUS6(msgKey.getKeyValue("STATUS6"));
					}
					if(msgKeyType.containsKeyColumn("STATUS7")) {
						key.setSTATUS7(msgKey.getKeyValue("STATUS7"));
					}
					if(msgKeyType.containsKeyColumn("STATUS8")) {
						key.setSTATUS8(msgKey.getKeyValue("STATUS8"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON")) {
						key.setPUCH_ODR_PERSON(msgKey.getKeyValue("PUCH_ODR_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("OUT_PUCH_ODR_CD")) {
						key.setOUT_PUCH_ODR_CD(msgKey.getKeyValue("OUT_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("TIME_CTRL")) {
						key.setTIME_CTRL(msgKey.getKeyValue("TIME_CTRL"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_COUNT")) {
						key.setl_COUNT(msgKey.getKeyValue("l_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ROW_COUNT")) {
						key.setROW_COUNT(msgKey.getKeyValue("ROW_COUNT"));
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
