/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0070/src/com/nec/jp/orteus/metamorBase/AD0070/AD0070010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0070;

import com.nec.jp.orteus.metamorBase.AD0070.*;
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
	// TODO: ������import�p�b�P�[�W���L�q���Ă�������
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AD0070010Control
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
	public AD0070010Struct getListvalue(int x) { return (AD0070010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AD0070010Struct getStruct() { return this.struct; }	// Struct��Ԃ��܂��B
	public AD0070010Struct createStruct() { return new AD0070010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AD0070010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

	// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������


	//�Ɩ����t
	private String BUSINESSOPRDATE;
	public void setBUSINESSOPRDATE(String name) { this.BUSINESSOPRDATE = name; };
	public String getBUSINESSOPRDATE() { return this.BUSINESSOPRDATE; };

	//��ЃR�[�h
	private String COMPANY_CD;
	public void setCOMPANY_CD(String name) { this.COMPANY_CD = name; };
	public String getCOMPANY_CD() { return this.COMPANY_CD; };

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
	 * �G���[���b�Z�[�W�ݒ�
	 * @param ���b�Z�[�W�ԍ�
	 * @param �o�̓��b�Z�[�W
	 * @param �u��������P
	 */
	private void setErrorMessage(String messageno, String message, String value1)
	{
		ExpjMessage emsg = new ExpjMessage( messageno , value1 );
		msgStruct.addError( emsg );
		sysLog.warning(emsg, getsysUSER_CD());
	}

	/**
	 * �C���t�H���[�V�����������̃p�����[�^�ݒ菈����؂�o���Ċ֐���
	 * @param tableName �e�[�u����
	 * @param columnName �J������
	 * @param value �l
	 */
	private void setInformationParameter(String tableName, String columnName, String value) {
		StringBuffer param = new StringBuffer();
		param.append(tableName);
		param.append('.');
		param.append(columnName);
		param.append(':');
		if (value != null) {
			param.append(value);
		}

		ExpjMessage emsg = new ExpjMessage("ZZ01006", param.toString());
		msgStruct.addInfo(emsg);
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
//------------------------------------------------------------------------
	/**
	 * SQLException�G���[���b�Z�[�W�ݒ�
	 * @param SQLException
	 * @param �o�̓G���[���b�Z�[�W
	 */
	private void setSqlExceptionMsg(SQLException e) throws ExpjException
	{
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
	}

	/**
	 * �x�����b�Z�[�W�ݒ�
	 * @param ���b�Z�[�W�ԍ�
	 * @param �o�̓��b�Z�[�W
	 */
	private void setWarnMessage(String messageno, String message)
	{
		ExpjMessage emsg = new ExpjMessage( messageno );
		msgStruct.addWarn( emsg );
		sysLog.info(emsg, getsysUSER_CD());
		emsg = new ExpjMessage( "ZZ01006", message );
		msgStruct.addWarn( emsg );
		sysLog.info(emsg, getsysUSER_CD());
	}
		
	/**
	 * ��񃁃b�Z�[�W�ݒ�
	 * @param ���b�Z�[�W�ԍ�
	 * @param �o�̓��b�Z�[�W
	 */
	private void setInfoMessage(String messageno, String message)
	{
		ExpjMessage emsg = new ExpjMessage( messageno );
		msgStruct.addInfo( emsg );
		sysLog.config(emsg, getsysUSER_CD());
		emsg = new ExpjMessage( "ZZ01006", message );
		msgStruct.addInfo( emsg );
		sysLog.config(emsg, getsysUSER_CD());
	}
		
	/**
	 * ���O���b�Z�[�W�ݒ�
	 * @param ���b�Z�[�W�ԍ�
	 * @param �o�̓��b�Z�[�W
	 */
	private void setSyslogConfig(String message)
	{
		ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
		sysLog.config(emsg, getsysUSER_CD());
	}

	/**
	 * Exception�G���[���b�Z�[�W�ݒ�
	 * @param	code	���b�Z�[�W�ԍ�
	 * @return	ExpjMessage
	 */
	private ExpjMessage setExceptionMessage(String code)
	{
		ExpjMessage emsg = new ExpjMessage(code);
		sysLog.severe(emsg, getsysUSER_CD());
		return emsg;
	}

	/**
	 * Exception�G���[�������p�����[�^�ݒ�
	 * @param	key		�p�����[�^
	 */
	private void setExceptionParameter(String key)
	{
		ExpjMessage emsg = new ExpjMessage("ZZ01006", key);
		sysLog.severe(emsg, getsysUSER_CD());
	}

	/** CSV�f�[�^���X�g */
	private List _csvList = null;

	/**
	 * �����l�̐ݒ�
	 * @return boolean true ����I�� : false �ُ�I��
	 */
	public boolean initialSet() throws BusinessProcessException, FoundationException
	{
		try {

			// ��ʌ������ڂ̏�����
          struct.setIN_PLANT_CD(null);
          struct.setIN_PLANT_NAME(null);
          struct.setIN_WS_CD(null);
          struct.setIN_WS_NAME(null);
          struct.setIN_VEND_CD(null);
          struct.setIN_VEND_NAME(null);
          struct.setIN_ITEM_CD(null);
          struct.setIN_ITEM_NAME(null);
          struct.setIN_WORK_ODR_CD(null);
          struct.setIN_OPR_INST_CD(null);
          struct.setIN_JOB_ODR_CD(null);
          struct.setIN_OPR_INST_START_DATE_FROM(null);
          struct.setIN_OPR_INST_START_DATE_TO(null);
          struct.setIN_WORK_ODR_DLV_DATE_FROM(null);
          struct.setIN_WORK_ODR_DLV_DATE_TO(null);
          struct.setIN_OPR_INST_START_TIME_FROM(null);
          struct.setIN_OPR_INST_START_TIME_TO(null);
          struct.setIN_WORK_ODR_DLV_TIME_FROM(null);
          struct.setIN_WORK_ODR_DLV_TIME_TO(null);
          struct.setL_IN_OPR_INST_START_DATE_FROM(null);
          struct.setL_IN_OPR_INST_START_DATE_TO(null);
          struct.setL_IN_WORK_ODR_DLV_DATE_FROM(null);
          struct.setL_IN_WORK_ODR_DLV_DATE_TO(null);
          struct.setL_IN_OPR_INST_START_DATE_FROM_ZERO(null);
          struct.setL_IN_WORK_ODR_DLV_DATE_FROM_ZERO(null);
          struct.setc1_WORK_STS_TYP(null);
          struct.setc2_WORK_STS_TYP(null);
          struct.setc3_WORK_STS_TYP(null);
          struct.setc4_WORK_STS_TYP("true");
          struct.setc5_WORK_STS_TYP(null);
          struct.setc6_WORK_STS_TYP(null);
          struct.setDOWNLOAD_FILE(null);

			// ��ʈꗗ�\�����e��������
			setList(null);

			// �Ǎ��X�e�[�^�X�ݒ�
			setReadStatus(INITIAL);

			// ���H��R�[�h�ݒ�
			struct.setIN_PLANT_CD(getsysPLANT_CD());

			// �H��R�[�h�̑��݃`�F�b�N
			List plantList = entity.mselectM_PLANT.read(conn, struct);
			if(plantList.size() <= 0) {
				// �Ǎ��������s�F�H��R�[�h���H��ɑ��݂��܂���
				return false;
			}else{
				AD0070010Struct tmpStruct = (AD0070010Struct)plantList.get(0);
				struct.setIN_PLANT_NAME(tmpStruct.getIN_PLANT_NAME());
			}

			// �V�X�e���p�����[�^�iTIME_CTRL�j�擾
      AD0070010Struct tmpStruct = new AD0070010Struct();
			List TIME_CTRLList = entity.mSELECT_TIME_CTRL.read(conn, tmpStruct);
			if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
				tmpStruct = (AD0070010Struct)TIME_CTRLList.get(0);
				struct.setTIME_CTRL(tmpStruct.getTIME_CTRL());
			}else{
				struct.setTIME_CTRL(null);
			}
			return true;
		} catch(SQLException e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			setSqlExceptionMsg(e);
			return false;
		}
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
	 * ���������̐ݒ�
	 */
	private void setSearchCondition() {
		
		// �f�[�^�����N���A
		struct.setL_IN_OPR_INST_START_DATE_FROM(null);
	  struct.setL_IN_OPR_INST_START_DATE_TO(null);
	  struct.setL_IN_WORK_ODR_DLV_DATE_FROM(null);
		struct.setL_IN_WORK_ODR_DLV_DATE_TO(null);
		struct.setL_IN_OPR_INST_START_DATE_FROM_ZERO(null);
	  struct.setL_IN_WORK_ODR_DLV_DATE_FROM_ZERO(null);
		
		
		// ���o�����i���t�̐ݒ�j
		if(null != struct.getTIME_CTRL() && "true".equals(struct.getTIME_CTRL())){
			
		  // ���������(From)
			if(null == struct.getIN_OPR_INST_START_DATE_FROM() || "".equals(struct.getIN_OPR_INST_START_DATE_FROM())){
				struct.setL_IN_OPR_INST_START_DATE_FROM(null);
			}else{
				// �����ݒ�
				if(null == struct.getIN_OPR_INST_START_TIME_FROM() || "".equals(struct.getIN_OPR_INST_START_TIME_FROM())){
					struct.setL_IN_OPR_INST_START_DATE_FROM(struct.getIN_OPR_INST_START_DATE_FROM() + " 00:00");
				}else{
				  struct.setIN_OPR_INST_START_TIME_FROM(AppendZero(struct.getIN_OPR_INST_START_TIME_FROM(),4));
					struct.setL_IN_OPR_INST_START_DATE_FROM(struct.getIN_OPR_INST_START_DATE_FROM() + " " + 
					                                struct.getIN_OPR_INST_START_TIME_FROM().substring(0,2) + ":" + 
					                                struct.getIN_OPR_INST_START_TIME_FROM().substring(2));
				}
		  }
		  // ���������(To)
			if(null == struct.getIN_OPR_INST_START_DATE_TO() || "".equals(struct.getIN_OPR_INST_START_DATE_TO())){
				struct.setL_IN_OPR_INST_START_DATE_TO(null);
			}else{
				// �����ݒ�
				if(null == struct.getIN_OPR_INST_START_TIME_TO() || "".equals(struct.getIN_OPR_INST_START_TIME_TO())){
					struct.setL_IN_OPR_INST_START_DATE_TO(struct.getIN_OPR_INST_START_DATE_TO() + " 23:59");
				}else{
				  struct.setIN_OPR_INST_START_TIME_TO(AppendZero(struct.getIN_OPR_INST_START_TIME_TO(),4));
					struct.setL_IN_OPR_INST_START_DATE_TO(struct.getIN_OPR_INST_START_DATE_TO() + " " + 
					                                struct.getIN_OPR_INST_START_TIME_TO().substring(0,2) + ":" + 
					                                struct.getIN_OPR_INST_START_TIME_TO().substring(2));
				}
		  }
		  
			// �����[���iFrom�j
			if(null == struct.getIN_WORK_ODR_DLV_DATE_FROM() || "".equals(struct.getIN_WORK_ODR_DLV_DATE_FROM())){
			  struct.setL_IN_WORK_ODR_DLV_DATE_FROM(null);
		  }else{
				// �����ݒ�
				if(null == struct.getIN_WORK_ODR_DLV_TIME_FROM() || "".equals(struct.getIN_WORK_ODR_DLV_TIME_FROM())){
			    struct.setL_IN_WORK_ODR_DLV_DATE_FROM(struct.getIN_WORK_ODR_DLV_DATE_FROM() + " 00:00");
				}else{
				  struct.setIN_WORK_ODR_DLV_TIME_FROM(AppendZero(struct.getIN_WORK_ODR_DLV_TIME_FROM(),4));
			    struct.setL_IN_WORK_ODR_DLV_DATE_FROM(struct.getIN_WORK_ODR_DLV_DATE_FROM() + " " + 
			                                  struct.getIN_WORK_ODR_DLV_TIME_FROM().substring(0,2) + ":" + 
			                                  struct.getIN_WORK_ODR_DLV_TIME_FROM().substring(2));
				}
		  }
		  // �����[���iTo�j
			if(null == struct.getIN_WORK_ODR_DLV_DATE_TO() || "".equals(struct.getIN_WORK_ODR_DLV_DATE_TO())){
			  struct.setL_IN_WORK_ODR_DLV_DATE_TO(null);
		  }else{
				// �����ݒ�
				if(null == struct.getIN_WORK_ODR_DLV_TIME_TO() || "".equals(struct.getIN_WORK_ODR_DLV_TIME_TO())){
			    struct.setL_IN_WORK_ODR_DLV_DATE_TO(struct.getIN_WORK_ODR_DLV_DATE_TO() + " 23:59");
				}else{
				  struct.setIN_WORK_ODR_DLV_TIME_TO(AppendZero(struct.getIN_WORK_ODR_DLV_TIME_TO(),4));
			    struct.setL_IN_WORK_ODR_DLV_DATE_TO(struct.getIN_WORK_ODR_DLV_DATE_TO() + " " + 
			                                  struct.getIN_WORK_ODR_DLV_TIME_TO().substring(0,2) + ":" + 
			                                  struct.getIN_WORK_ODR_DLV_TIME_TO().substring(2));
				}
		  }
	  }else{
			struct.setL_IN_OPR_INST_START_DATE_FROM(struct.getIN_OPR_INST_START_DATE_FROM());
			if(null == struct.getIN_OPR_INST_START_DATE_TO() || "".equals(struct.getIN_OPR_INST_START_DATE_TO())){
		  	struct.setL_IN_OPR_INST_START_DATE_TO(null);
			}else{
		  	struct.setL_IN_OPR_INST_START_DATE_TO(struct.getIN_OPR_INST_START_DATE_TO() + " 23:59");
			}
		  struct.setL_IN_WORK_ODR_DLV_DATE_FROM(struct.getIN_WORK_ODR_DLV_DATE_FROM());
		  if(null == struct.getIN_WORK_ODR_DLV_DATE_TO() || "".equals(struct.getIN_WORK_ODR_DLV_DATE_TO())){
				struct.setL_IN_WORK_ODR_DLV_DATE_TO(null);
		  }else{
				struct.setL_IN_WORK_ODR_DLV_DATE_TO(struct.getIN_WORK_ODR_DLV_DATE_TO() + " 23:59");
		  }
	  }
	}
	/**
	 * �����̐ݒ�
	 * @param  input    ����String
	 * @param  cnt      ����
	 * @return String   ���Ƀ[���𖄂߂�
	 */
	private String AppendZero(String input,int cnt){
	  int nCount = cnt - input.length() ;
	  for(int i = 1; i <= nCount;i++)
	  {
	  	input = "0" + input;
	  }
	  return input;
	}
	/**
	* �����̐���
	* @param ���t����
	* @param ���t����
	*/
	private String formatHM(String inDate){
			if(null == inDate || "".equals(inDate)){
				return inDate ;
			}
			if(inDate.length() < 16){
				return inDate ;
			}
			return inDate.replaceAll("00:00","     ");					
	}
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0070");
		logger.entering("AD0070010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������

      try {

        // �Ǎ��X�e�[�^�X�ݒ�
        setReadStatus(INITIAL);

        // �ꗗ�\�����e���N���A
        setList(null);

        // CSV�_�E�����[�h�t�@�C���̃N���A
        struct.setDOWNLOAD_FILE(null);

        //�y�G���[�`�F�b�N�z
        
        // ��Ə�ԋ敪�̃`�F�b�N���S��[off]�̏ꍇ
        if(!struct.getc1_WORK_STS_TYP().equals("true") 
           && !struct.getc2_WORK_STS_TYP().equals("true") 
           && !struct.getc3_WORK_STS_TYP().equals("true")
           && !struct.getc4_WORK_STS_TYP().equals("true")
           && !struct.getc5_WORK_STS_TYP().equals("true")
           && !struct.getc6_WORK_STS_TYP().equals("true")
           ){
          setErrorMessage("ZZ06001");
          return;
        }
        
        // �H��R�[�h���w�肳�ꂽ�ꍇ
        if(struct.getIN_PLANT_CD() != null && ("").equals(struct.getIN_PLANT_CD()) == false){
          // �H��R�[�h�̑��݃`�F�b�N
          List plantList = entity.mselectM_PLANT.read(conn, struct);
          if(plantList.size() <= 0) {
            // �Ǎ��������s�F�H��R�[�h���H��ɑ��݂��܂���
            setErrorMessage("ZZ09028");
            setErrorParameter("M_PLANT", "PLANT_CD", struct.getIN_PLANT_CD());
            return;
          }else{
            AD0070010Struct tmpStruct = (AD0070010Struct)plantList.get(0);
            struct.setIN_PLANT_NAME(tmpStruct.getIN_PLANT_NAME());
          }
        }else{
          struct.setIN_PLANT_NAME(null);
        }
        
        // ��Ƌ�R�[�h���w�肳�ꂽ�ꍇ
        if(struct.getIN_WS_CD() != null && ("").equals(struct.getIN_WS_CD()) == false){
          // ��Ƌ�R�[�h�̑��݃`�F�b�N
          List wsList = entity.mselectM_WS.read(conn, struct);
          if(wsList.size() <= 0) {
            // �Ǎ��������s�F��Ƌ悪���݂��܂���
            setErrorMessage("ZZ11007");
            setErrorParameter("M_WS", "WS_CD", struct.getIN_WS_CD());
            return;
          }else{
            AD0070010Struct tmpStruct = (AD0070010Struct)wsList.get(0);
            struct.setIN_WS_NAME(tmpStruct.getIN_WS_NAME());
            
            // �H��R�[�h���w�肳�ꂽ�ꍇ�֘A�`�F�b�N���s��
            // �@���.�H��R�[�h�͓��͂���Ă��邩�H
            if(struct.getIN_PLANT_CD() != null && ("").equals(struct.getIN_PLANT_CD()) == false){
              if(tmpStruct.getreadWS_PLANT_CD().equals(struct.getIN_PLANT_CD()) == false){
                // ���������s��v�F�H��R�[�h�ƍ�Ƌ�̍H��R�[�h����v���܂���
                setErrorMessage("AD00109");
                setErrorParameter("M_WS", "WS_CD", struct.getIN_WS_CD());
                return;
              }
            }
          }
        }else{
          struct.setIN_WS_NAME(null);
        }
        
        // �����R�[�h���w�肳�ꂽ�ꍇ
        if(struct.getIN_VEND_CD() != null && ("").equals(struct.getIN_VEND_CD()) == false){
          // �����R�[�h�̑��݃`�F�b�N
          List vendList = entity.mselectM_VEND_CTRL.read(conn, struct);
          if(vendList.size() <= 0) {
            // �Ǎ��������s�F�����}�X�^�����݂��܂���
            setErrorMessage("ZZ11005");
            setErrorParameter("M_VEND_CTRL", "VEND_CD", struct.getIN_VEND_CD());
            return;
          }else{
            AD0070010Struct tmpStruct = (AD0070010Struct)vendList.get(0);
            struct.setIN_VEND_NAME(tmpStruct.getIN_VEND_NAME());
          }
        }else{
          struct.setIN_VEND_NAME(null);
        }
        
        // �i�ڃR�[�h���w�肳�ꂽ�ꍇ
        if(struct.getIN_ITEM_CD() != null && ("").equals(struct.getIN_ITEM_CD()) == false){
          // �i�ڃR�[�h�̑��݃`�F�b�N
          List itemList = entity.mselectM_ITEM.read(conn, struct);
          if(itemList.size() <= 0) {
            // �Ǎ��������s�F�i�ڂ����݂��܂���
            setErrorMessage("ZZ11002");
            setErrorParameter("M_ITEM", "ITEM_CD", struct.getIN_ITEM_CD());
            return;
          }else{
            AD0070010Struct tmpStruct = (AD0070010Struct)itemList.get(0);
            struct.setIN_ITEM_NAME(tmpStruct.getIN_ITEM_NAME());
          }
        }else{
          struct.setIN_ITEM_NAME(null);
        }
        
        // ��ƌv��ԍ����w�肳�ꂽ�ꍇ
        if(struct.getIN_WORK_ODR_CD() != null && ("").equals(struct.getIN_WORK_ODR_CD()) == false){
          // ��ƌv��ԍ��̑��݃`�F�b�N
          List workList = entity.mselectT_WORK_IN_PROC_BY_ITEM.read(conn, struct);
          if(workList.size() <= 0) {
            // �Ǎ��������s�F��ƌv��ԍ������݂��܂���
            setErrorMessage("AD00107");
            setErrorParameter("T_WORK_IN_PROC_BY_ITEM", "WORK_ODR_CD", struct.getIN_WORK_ODR_CD());
            return;
          }else{
            AD0070010Struct tmpStruct = (AD0070010Struct)workList.get(0);
            
            // �H��R�[�h���w�肳�ꂽ�ꍇ�֘A�`�F�b�N���s��
            // �@���.�H��R�[�h�͓��͂���Ă��邩�H
            if(struct.getIN_PLANT_CD() != null && ("").equals(struct.getIN_PLANT_CD()) == false){
              if(tmpStruct.getreadPLANT_CD().equals(struct.getIN_PLANT_CD()) == false){
                // ���������s��v�F�H��R�[�h�ƍ�ƌv��ԍ��̍H��R�[�h����v���܂���
                setErrorMessage("AD00110");
                setErrorParameter("T_WORK_IN_PROC_BY_ITEM", "WORK_ODR_CD", struct.getIN_WORK_ODR_CD());
                return;
              }
            }
          }
        }
        
        // ��Ǝw���ԍ����w�肳�ꂽ�ꍇ
        if(struct.getIN_OPR_INST_CD() != null && ("").equals(struct.getIN_OPR_INST_CD()) == false){
          // ��Ǝw���ԍ��̑��݃`�F�b�N
          List oprList = entity.mselectT_OPR_INST_SLIP.read(conn, struct);
          if(oprList.size() <= 0) {
            // �Ǎ��������s�F��Ǝw���ԓ`�[�����݂��܂���
            setErrorMessage("AD30587");
            setErrorParameter("T_OPR_INST_SLIP", "OPR_INST_CD", struct.getIN_OPR_INST_CD());
            return;
          }else{
            AD0070010Struct tmpStruct = (AD0070010Struct)oprList.get(0);
            
            // �H��R�[�h���w�肳�ꂽ�ꍇ�֘A�`�F�b�N���s��
            // �@���.�H��R�[�h�͓��͂���Ă��邩�H
            if(struct.getIN_PLANT_CD() != null && ("").equals(struct.getIN_PLANT_CD()) == false){
              if(tmpStruct.getreadPLANT_CD().equals(struct.getIN_PLANT_CD()) == false){
                // ���������s��v�F�H��R�[�h�ƍ�Ǝw���ԍ��̍H��R�[�h����v���܂���
                setErrorMessage("AD00111");
                setErrorParameter("T_OPR_INST_SLIP", "OPR_INST_CD", struct.getIN_OPR_INST_CD());
                return;
              }
            }
          }
        }
        
        // ���Ԃ��w�肳�ꂽ�ꍇ
        if(struct.getIN_JOB_ODR_CD() != null && ("").equals(struct.getIN_JOB_ODR_CD()) == false){
          // ���Ԃ̑��݃`�F�b�N
          List jobList = entity.mreadT_JOB_ODR.read(conn, struct);
          if(jobList.size() <= 0) {
            // �Ǎ��������s�F���Ԃ����Ԍv��ɑ��݂��܂���
            setErrorMessage("AD00108");
            setErrorParameter("T_JOB_ODR", "JOB_ODR_CD", struct.getIN_JOB_ODR_CD());
            return;
          }else{
            AD0070010Struct tmpStruct = (AD0070010Struct)jobList.get(0);
            
            // �H��R�[�h���w�肳�ꂽ�ꍇ�֘A�`�F�b�N���s��
            // �@���.�H��R�[�h�͓��͂���Ă��邩�H
            if(struct.getIN_PLANT_CD() != null && ("").equals(struct.getIN_PLANT_CD()) == false){
              if(tmpStruct.getreadPLANT_CD().equals(struct.getIN_PLANT_CD()) == false){
                // ���������s��v�F�H��R�[�h�Ɛ��Ԃ̍H��R�[�h����v���܂���
                setErrorMessage("AD00112");
                setErrorParameter("T_JOB_ODR", "JOB_ODR_CD", struct.getIN_JOB_ODR_CD());
                return;
              }
            }
          }
        }
        
        //�y�f�[�^�Ǎ��z
        
        // �Ǎ��X�e�[�^�X�ݒ�
        setReadStatus(INITIAL);
        
        //��ʁD�X�e�[�^�X�̏�����
        struct.setSTATUS1(null);
        struct.setSTATUS2(null);
        struct.setSTATUS3(null);
        struct.setSTATUS4(null);
        struct.setSTATUS5(null);
        struct.setSTATUS6(null);
        
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

				// ���������̐ݒ�
			setSearchCondition();
			// �\���ő�s������
			ScreenParam sp = new ScreenParam(this.getClass());
			int maxLine = sp.getMaxLine(conn, 10);
			if (maxLine != 0)
				struct.setROW_COUNT(String.valueOf(maxLine));
			else
				struct.setROW_COUNT(null);

			// ���������Ɏw�肳�ꂽ���e��[��Ǝw���`�[��i�ڕʎd�|���ƌn��ʎd�|]���擾
			List tempList = entity.mselectWorkInProcCnt.read(conn, struct);
			long rowCount = Long.parseLong(((AD0070010Struct) tempList.get(0))
					.getl_COUNT());

			// �Y�����R�[�h���擾�ł��Ȃ��ꍇ�B
			if (rowCount == 0) {
				// �Ǎ��������s�F�ΏۃG�[�^�����݂��܂���
				setErrorMessage("ZZ06001");
				setReadStatus(NOT_FOUND);
				 // �\���p���X�g�ɃZ�b�g
				if(list !=null && list.size()>0){
					list.clear();
				}
				return;
			} else {
				// �\���ő�s����������

				if (maxLine != 0 && rowCount == maxLine + 1) {
					// �Ǎ��X�e�[�^�X�ݒ�
					setReadStatus(TOO_MANY);
					setErrorMessage("ZZ01119", "" + maxLine);
                   // �\���p���X�g�ɃZ�b�g
					if(list !=null && list.size()>0){
						list.clear();
					}
					return;
				} else {
					// �Ǎ��X�e�[�^�X�ݒ�
					setReadStatus(NORMAL);
					// �\���p���X�g�ɃZ�b�g
					tempList = entity.mselectWorkInProc.read(conn, struct);
					// CSV�o�͗p�ɑҔ�
					_csvList = tempList;
					setList(tempList);
            AD0070010Struct TempStruct;
            for (int i = 0; i < list.size(); i++) {
		     TempStruct = (AD0070010Struct)list.get(i);
		     // �R���{�{�b�N�X�̎擾
		     TempStruct.setSTATUS_DN(multcombo("OPR_INST_STATUS",TempStruct.getSTATUS_DN()));
		     TempStruct.setWORK_STS_NAME(multcombo("WORK_STS_TYP",TempStruct.getWORK_STS_NAME()));
		     TempStruct.setMRP_ODR_TYP(multcombo("MRP_ODR_TYP",TempStruct.getMRP_ODR_TYP()));
		     TempStruct.setOUTSIDE_TYP(multcombo("OUTSIDE_TYP",TempStruct.getOUTSIDE_TYP()));
		     TempStruct.setACPT_INSPC_TYP(multcombo("ACPT_INSPC_TYP",TempStruct.getACPT_INSPC_TYP()));
		     
		    }
          }
        }
        
      } catch(SQLException e) {
        
        e.printStackTrace();
        
        // �Ǎ��X�e�[�^�X�ݒ�
        setReadStatus(ERROR);
        setSqlExceptionMsg(e);
      }
      
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AD0070010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * CSV�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCsvOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0070");
		logger.entering("AD0070010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");
			//{{user_implement_dev:<controlCsvOut>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������


		// ������
		csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));
		List csvList = new ArrayList();

		// �^�C�g���s
		String[] title = {
			"Expj.Cmt0721" ,
			"Expj.PLANT_CD" ,
			"Expj.WORK_ODR_CD" ,
			"Expj.PROC_NO_1" ,
			"Expj.WORK_IN_PROC_CD" ,
			"Expj.PROC_NAME_1" ,
			"Expj.WORK_ODR_DLV_DATE_3" ,
			"Expj.PRD_START_DATE" ,
			"Expj.OPR_INST_CD" ,
			"Expj.PUCH_ODR_CD" ,
			"Expj.OPR_INST_DATE" ,
			"Expj.OPR_INST_SLIP_ISS_DATE" ,
			"Expj.OPR_INST_QTY" ,
			"Expj.Cmt0318" ,
			"Expj.Cmt0325" ,
			"Expj.STOCK_UNIT_1" ,
			"Expj.WORK_STS_TYP" ,
			"Expj.WORK_CMPLT_DATE" ,
			"Expj.ITEM_CD" ,
			"Expj.ITEM_NAME" ,
			"Expj.DRAW_CD" ,
			"Expj.ITEM_SPEC" ,
			"Expj.MRP_ODR_TYP" ,
			"Expj.JOB_ODR_CD" ,
			"Expj.JOB_ODR_CANCEL_NO" ,
			"Expj.OUTSIDE_TYP_2" ,
			"Expj.ACPT_INSPC_TYP" ,
			"Expj.WS_CD" ,
			"Expj.WS_NAME" ,
			"Expj.VEND_CD" ,
			"Expj.VEND_NAME" 
		};
		csvList.add(title);

		// �f�[�^�s
		for (Iterator i = _csvList.iterator(); i.hasNext();) {
          AD0070010Struct csvStruct = (AD0070010Struct) i.next();
          String[] csvStr = new String[title.length];
          csvStr[0] = csvStruct.getSTATUS_DN();				// �X�e�[�^�X
          csvStr[1] = csvStruct.getPLANT_CD();				// �H��R�[�h
          csvStr[2] = csvStruct.getWORK_ODR_CD();				// ��ƌv��ԍ�
          csvStr[3] = csvStruct.getPROC_NO();					// �d�|��ƌn��ԍ�
          csvStr[4] = csvStruct.getWORK_IN_PROC_CD();			// �d�|��ƃR�[�h
          csvStr[5] = csvStruct.getPROC_NAME();				// �d�|��Ɩ�
          csvStr[6] = csvStruct.getWORK_ODR_DLV_DATE();		// �����[��
          csvStr[7] = csvStruct.getOPR_INST_START_DATE();		// ���������
          csvStr[8] = csvStruct.getOPR_INST_CD();				// ��Ǝw���ԍ�
          csvStr[9] = csvStruct.getPUCH_ODR_CD();				// �����ԍ�
          csvStr[10] = csvStruct.getOPR_INST_DATE();			// ��Ǝw����
          csvStr[11] = csvStruct.getOPR_INST_SLIP_ISS_DATE();	// ��Ǝw���`�[���s��
          csvStr[12] = csvStruct.getOPR_INST_QTY();			// ��Ǝw����
          csvStr[13] = csvStruct.getSUM_ACPT_QTY();			// �Ǖi�݌v��
          csvStr[14] = csvStruct.getSUM_DEFECT_QTY();			// �s�Ǘ݌v��
          csvStr[15] = csvStruct.getSTOCK_UNIT();				// �P��
          csvStr[16] = csvStruct.getWORK_STS_NAME();			// ��Ə�ԋ敪
          csvStr[17] = csvStruct.getWORK_CMPLT_DATE();		// ��Ɗ�����
          csvStr[18] = csvStruct.getITEM_CD();				// �i�ڔԍ�
          csvStr[19] = csvStruct.getITEM_NAME();				// �i�ږ�
          csvStr[20] = csvStruct.getDRAW_CD();				// �}�ʔԍ�
          csvStr[21] = csvStruct.getSPEC();					// �K�i
          csvStr[22] = csvStruct.getMRP_ODR_TYP();			// �i�ڎ�z�敪
          csvStr[23] = csvStruct.getJOB_ODR_CD();				// ����
          csvStr[24] = csvStruct.getJOB_ODR_CANCEL_NO();		// ���Ԏ�������ԍ�
          csvStr[25] = csvStruct.getOUTSIDE_TYP();			// �d�|���O��敪
          csvStr[26] = csvStruct.getACPT_INSPC_TYP();			// ��������敪
          csvStr[27] = csvStruct.getWS_CD();					// ��Ƌ�R�[�h
          csvStr[28] = csvStruct.getWS_NAME();				// ��Ƌ於
          csvStr[29] = csvStruct.getVEND_CD();				// �����R�[�h
          csvStr[30] = csvStruct.getVEND_ANAME();				// ����於
          csvList.add(csvStr);
		}

		if (csvList != null && !csvList.isEmpty()) {
			// CsvWriter�𐶐�
			csvWriter = new CsvWriter(CsvWriter.getFileName(sysUSER_CD));
			csvWriter.write(csvList, CoreTools.getLocale(struct.getsUser_ID()),true);
			struct.setDOWNLOAD_FILE(csvWriter.getFilePath());
		}

                //}}user_implement_dev:<controlCsvOut>
		logger.exiting("AD0070010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0070");
		logger.entering("AD0070010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������

			// ���ڂ��N���A����i�����l���Z�b�g�j
			initialSet();

                //}}user_implement_dev:<controlClear>
		logger.exiting("AD0070010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0070");
		logger.entering("AD0070010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AD0070010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0070");
		logger.entering("AD0070010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>

			// ���ڂ��N���A����i�����l���Z�b�g�j
			initialSet();

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AD0070010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0070");
		logger.entering("AD0070010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			// �R���{�{�b�N�X���i�̃f�[�^�̃Z�b�g�͂����ɋL�q���Ă��������B
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AD0070010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("CsvOut") ) {
				controlCsvOut();
			} else if( button.equals("Clear") ) {
				controlClear();
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
//			throw new FoundationException("AD0070010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0070010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AD0070010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0070010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AD0070010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0070010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AD0070010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AD0070010Entity entity;
	protected AD0070010Struct struct;
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

		entity = new AD0070010Entity();
		struct = new AD0070010Struct();

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
	 * AD0070010�N���X�̕W���R���X�g���N�^
	 */
	public AD0070010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
			// TODO: �����ɏ����������L�q���Ă�������
		try {
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
				AD0070010Struct key = (AD0070010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("c3_WORK_STS_TYP") && key.getc3_WORK_STS_TYP() != null) {
					msgKey.setKeyValue("c3_WORK_STS_TYP", key.getc3_WORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("IN_OPR_INST_START_DATE_FROM") && key.getIN_OPR_INST_START_DATE_FROM() != null) {
					msgKey.setKeyValue("IN_OPR_INST_START_DATE_FROM", key.getIN_OPR_INST_START_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("IN_OPR_INST_START_DATE_TO") && key.getIN_OPR_INST_START_DATE_TO() != null) {
					msgKey.setKeyValue("IN_OPR_INST_START_DATE_TO", key.getIN_OPR_INST_START_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("IN_WORK_ODR_DLV_DATE_FROM") && key.getIN_WORK_ODR_DLV_DATE_FROM() != null) {
					msgKey.setKeyValue("IN_WORK_ODR_DLV_DATE_FROM", key.getIN_WORK_ODR_DLV_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("IN_WORK_ODR_DLV_DATE_TO") && key.getIN_WORK_ODR_DLV_DATE_TO() != null) {
					msgKey.setKeyValue("IN_WORK_ODR_DLV_DATE_TO", key.getIN_WORK_ODR_DLV_DATE_TO());
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
				if(msgKeyType.containsKeyColumn("c1_WORK_STS_TYP") && key.getc1_WORK_STS_TYP() != null) {
					msgKey.setKeyValue("c1_WORK_STS_TYP", key.getc1_WORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("c2_WORK_STS_TYP") && key.getc2_WORK_STS_TYP() != null) {
					msgKey.setKeyValue("c2_WORK_STS_TYP", key.getc2_WORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("IN_OPR_INST_START_TIME_FROM") && key.getIN_OPR_INST_START_TIME_FROM() != null) {
					msgKey.setKeyValue("IN_OPR_INST_START_TIME_FROM", key.getIN_OPR_INST_START_TIME_FROM());
				}
				if(msgKeyType.containsKeyColumn("IN_OPR_INST_START_TIME_TO") && key.getIN_OPR_INST_START_TIME_TO() != null) {
					msgKey.setKeyValue("IN_OPR_INST_START_TIME_TO", key.getIN_OPR_INST_START_TIME_TO());
				}
				if(msgKeyType.containsKeyColumn("IN_WORK_ODR_DLV_TIME_FROM") && key.getIN_WORK_ODR_DLV_TIME_FROM() != null) {
					msgKey.setKeyValue("IN_WORK_ODR_DLV_TIME_FROM", key.getIN_WORK_ODR_DLV_TIME_FROM());
				}
				if(msgKeyType.containsKeyColumn("IN_WORK_ODR_DLV_TIME_TO") && key.getIN_WORK_ODR_DLV_TIME_TO() != null) {
					msgKey.setKeyValue("IN_WORK_ODR_DLV_TIME_TO", key.getIN_WORK_ODR_DLV_TIME_TO());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_CD") && key.getWORK_ODR_CD() != null) {
					msgKey.setKeyValue("WORK_ODR_CD", key.getWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("PROC_NO") && key.getPROC_NO() != null) {
					msgKey.setKeyValue("PROC_NO", key.getPROC_NO());
				}
				if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD") && key.getWORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("WORK_IN_PROC_CD", key.getWORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("PROC_NAME") && key.getPROC_NAME() != null) {
					msgKey.setKeyValue("PROC_NAME", key.getPROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE") && key.getWORK_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("WORK_ODR_DLV_DATE", key.getWORK_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE") && key.getOPR_INST_START_DATE() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATE", key.getOPR_INST_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD") && key.getOPR_INST_CD() != null) {
					msgKey.setKeyValue("OPR_INST_CD", key.getOPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_DATE") && key.getOPR_INST_DATE() != null) {
					msgKey.setKeyValue("OPR_INST_DATE", key.getOPR_INST_DATE());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_QTY") && key.getOPR_INST_QTY() != null) {
					msgKey.setKeyValue("OPR_INST_QTY", key.getOPR_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("SUM_ACPT_QTY") && key.getSUM_ACPT_QTY() != null) {
					msgKey.setKeyValue("SUM_ACPT_QTY", key.getSUM_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("SUM_DEFECT_QTY") && key.getSUM_DEFECT_QTY() != null) {
					msgKey.setKeyValue("SUM_DEFECT_QTY", key.getSUM_DEFECT_QTY());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("WORK_STS_NAME") && key.getWORK_STS_NAME() != null) {
					msgKey.setKeyValue("WORK_STS_NAME", key.getWORK_STS_NAME());
				}
				if(msgKeyType.containsKeyColumn("WORK_CMPLT_DATE") && key.getWORK_CMPLT_DATE() != null) {
					msgKey.setKeyValue("WORK_CMPLT_DATE", key.getWORK_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("DRAW_CD") && key.getDRAW_CD() != null) {
					msgKey.setKeyValue("DRAW_CD", key.getDRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("SPEC") && key.getSPEC() != null) {
					msgKey.setKeyValue("SPEC", key.getSPEC());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO") && key.getJOB_ODR_CANCEL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_CANCEL_NO", key.getJOB_ODR_CANCEL_NO());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("WS_NAME") && key.getWS_NAME() != null) {
					msgKey.setKeyValue("WS_NAME", key.getWS_NAME());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_ANAME") && key.getVEND_ANAME() != null) {
					msgKey.setKeyValue("VEND_ANAME", key.getVEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_SLIP_ISS_DATE") && key.getOPR_INST_SLIP_ISS_DATE() != null) {
					msgKey.setKeyValue("OPR_INST_SLIP_ISS_DATE", key.getOPR_INST_SLIP_ISS_DATE());
				}
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP") && key.getACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP", key.getACPT_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("STATUS_DN") && key.getSTATUS_DN() != null) {
					msgKey.setKeyValue("STATUS_DN", key.getSTATUS_DN());
				}
				if(msgKeyType.containsKeyColumn("IN_PLANT_CD") && key.getIN_PLANT_CD() != null) {
					msgKey.setKeyValue("IN_PLANT_CD", key.getIN_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_WS_CD") && key.getIN_WS_CD() != null) {
					msgKey.setKeyValue("IN_WS_CD", key.getIN_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_VEND_CD") && key.getIN_VEND_CD() != null) {
					msgKey.setKeyValue("IN_VEND_CD", key.getIN_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_ITEM_CD") && key.getIN_ITEM_CD() != null) {
					msgKey.setKeyValue("IN_ITEM_CD", key.getIN_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_WORK_ODR_CD") && key.getIN_WORK_ODR_CD() != null) {
					msgKey.setKeyValue("IN_WORK_ODR_CD", key.getIN_WORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_OPR_INST_CD") && key.getIN_OPR_INST_CD() != null) {
					msgKey.setKeyValue("IN_OPR_INST_CD", key.getIN_OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_JOB_ODR_CD") && key.getIN_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("IN_JOB_ODR_CD", key.getIN_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("L_IN_OPR_INST_START_DATE_FROM") && key.getL_IN_OPR_INST_START_DATE_FROM() != null) {
					msgKey.setKeyValue("L_IN_OPR_INST_START_DATE_FROM", key.getL_IN_OPR_INST_START_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("L_IN_OPR_INST_START_DATE_TO") && key.getL_IN_OPR_INST_START_DATE_TO() != null) {
					msgKey.setKeyValue("L_IN_OPR_INST_START_DATE_TO", key.getL_IN_OPR_INST_START_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("L_IN_OPR_INST_START_DATE_FROM_ZERO") && key.getL_IN_OPR_INST_START_DATE_FROM_ZERO() != null) {
					msgKey.setKeyValue("L_IN_OPR_INST_START_DATE_FROM_ZERO", key.getL_IN_OPR_INST_START_DATE_FROM_ZERO());
				}
				if(msgKeyType.containsKeyColumn("L_IN_WORK_ODR_DLV_DATE_FROM") && key.getL_IN_WORK_ODR_DLV_DATE_FROM() != null) {
					msgKey.setKeyValue("L_IN_WORK_ODR_DLV_DATE_FROM", key.getL_IN_WORK_ODR_DLV_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("L_IN_WORK_ODR_DLV_DATE_TO") && key.getL_IN_WORK_ODR_DLV_DATE_TO() != null) {
					msgKey.setKeyValue("L_IN_WORK_ODR_DLV_DATE_TO", key.getL_IN_WORK_ODR_DLV_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("L_IN_WORK_ODR_DLV_DATE_FROM_ZERO") && key.getL_IN_WORK_ODR_DLV_DATE_FROM_ZERO() != null) {
					msgKey.setKeyValue("L_IN_WORK_ODR_DLV_DATE_FROM_ZERO", key.getL_IN_WORK_ODR_DLV_DATE_FROM_ZERO());
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
				if(msgKeyType.containsKeyColumn("readPLAN_CD") && key.getreadPLAN_CD() != null) {
					msgKey.setKeyValue("readPLAN_CD", key.getreadPLAN_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_PLANT_NAME") && key.getIN_PLANT_NAME() != null) {
					msgKey.setKeyValue("IN_PLANT_NAME", key.getIN_PLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("readWS_CD") && key.getreadWS_CD() != null) {
					msgKey.setKeyValue("readWS_CD", key.getreadWS_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_WS_NAME") && key.getIN_WS_NAME() != null) {
					msgKey.setKeyValue("IN_WS_NAME", key.getIN_WS_NAME());
				}
				if(msgKeyType.containsKeyColumn("readWS_PLANT_CD") && key.getreadWS_PLANT_CD() != null) {
					msgKey.setKeyValue("readWS_PLANT_CD", key.getreadWS_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("readVEND_CD") && key.getreadVEND_CD() != null) {
					msgKey.setKeyValue("readVEND_CD", key.getreadVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_VEND_NAME") && key.getIN_VEND_NAME() != null) {
					msgKey.setKeyValue("IN_VEND_NAME", key.getIN_VEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("readITEM_CD") && key.getreadITEM_CD() != null) {
					msgKey.setKeyValue("readITEM_CD", key.getreadITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_ITEM_NAME") && key.getIN_ITEM_NAME() != null) {
					msgKey.setKeyValue("IN_ITEM_NAME", key.getIN_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("readWORK_ODR_CD") && key.getreadWORK_ODR_CD() != null) {
					msgKey.setKeyValue("readWORK_ODR_CD", key.getreadWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("readPLANT_CD") && key.getreadPLANT_CD() != null) {
					msgKey.setKeyValue("readPLANT_CD", key.getreadPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("readOPR_INST_CD") && key.getreadOPR_INST_CD() != null) {
					msgKey.setKeyValue("readOPR_INST_CD", key.getreadOPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("readJOB_ODR_CD") && key.getreadJOB_ODR_CD() != null) {
					msgKey.setKeyValue("readJOB_ODR_CD", key.getreadJOB_ODR_CD());
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
					AD0070010Struct key = new AD0070010Struct();
					if(msgKeyType.containsKeyColumn("c3_WORK_STS_TYP")) {
						key.setc3_WORK_STS_TYP(msgKey.getKeyValue("c3_WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("IN_OPR_INST_START_DATE_FROM")) {
						key.setIN_OPR_INST_START_DATE_FROM(msgKey.getKeyValue("IN_OPR_INST_START_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("IN_OPR_INST_START_DATE_TO")) {
						key.setIN_OPR_INST_START_DATE_TO(msgKey.getKeyValue("IN_OPR_INST_START_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("IN_WORK_ODR_DLV_DATE_FROM")) {
						key.setIN_WORK_ODR_DLV_DATE_FROM(msgKey.getKeyValue("IN_WORK_ODR_DLV_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("IN_WORK_ODR_DLV_DATE_TO")) {
						key.setIN_WORK_ODR_DLV_DATE_TO(msgKey.getKeyValue("IN_WORK_ODR_DLV_DATE_TO"));
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
					if(msgKeyType.containsKeyColumn("c1_WORK_STS_TYP")) {
						key.setc1_WORK_STS_TYP(msgKey.getKeyValue("c1_WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("c2_WORK_STS_TYP")) {
						key.setc2_WORK_STS_TYP(msgKey.getKeyValue("c2_WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("IN_OPR_INST_START_TIME_FROM")) {
						key.setIN_OPR_INST_START_TIME_FROM(msgKey.getKeyValue("IN_OPR_INST_START_TIME_FROM"));
					}
					if(msgKeyType.containsKeyColumn("IN_OPR_INST_START_TIME_TO")) {
						key.setIN_OPR_INST_START_TIME_TO(msgKey.getKeyValue("IN_OPR_INST_START_TIME_TO"));
					}
					if(msgKeyType.containsKeyColumn("IN_WORK_ODR_DLV_TIME_FROM")) {
						key.setIN_WORK_ODR_DLV_TIME_FROM(msgKey.getKeyValue("IN_WORK_ODR_DLV_TIME_FROM"));
					}
					if(msgKeyType.containsKeyColumn("IN_WORK_ODR_DLV_TIME_TO")) {
						key.setIN_WORK_ODR_DLV_TIME_TO(msgKey.getKeyValue("IN_WORK_ODR_DLV_TIME_TO"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_CD")) {
						key.setWORK_ODR_CD(msgKey.getKeyValue("WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROC_NO")) {
						key.setPROC_NO(msgKey.getKeyValue("PROC_NO"));
					}
					if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD")) {
						key.setWORK_IN_PROC_CD(msgKey.getKeyValue("WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROC_NAME")) {
						key.setPROC_NAME(msgKey.getKeyValue("PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE")) {
						key.setWORK_ODR_DLV_DATE(msgKey.getKeyValue("WORK_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE")) {
						key.setOPR_INST_START_DATE(msgKey.getKeyValue("OPR_INST_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD")) {
						key.setOPR_INST_CD(msgKey.getKeyValue("OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_DATE")) {
						key.setOPR_INST_DATE(msgKey.getKeyValue("OPR_INST_DATE"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_QTY")) {
						key.setOPR_INST_QTY(msgKey.getKeyValue("OPR_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SUM_ACPT_QTY")) {
						key.setSUM_ACPT_QTY(msgKey.getKeyValue("SUM_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SUM_DEFECT_QTY")) {
						key.setSUM_DEFECT_QTY(msgKey.getKeyValue("SUM_DEFECT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("WORK_STS_NAME")) {
						key.setWORK_STS_NAME(msgKey.getKeyValue("WORK_STS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WORK_CMPLT_DATE")) {
						key.setWORK_CMPLT_DATE(msgKey.getKeyValue("WORK_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DRAW_CD")) {
						key.setDRAW_CD(msgKey.getKeyValue("DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("SPEC")) {
						key.setSPEC(msgKey.getKeyValue("SPEC"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO")) {
						key.setJOB_ODR_CANCEL_NO(msgKey.getKeyValue("JOB_ODR_CANCEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(msgKey.getKeyValue("OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("WS_NAME")) {
						key.setWS_NAME(msgKey.getKeyValue("WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_ANAME")) {
						key.setVEND_ANAME(msgKey.getKeyValue("VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_SLIP_ISS_DATE")) {
						key.setOPR_INST_SLIP_ISS_DATE(msgKey.getKeyValue("OPR_INST_SLIP_ISS_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP")) {
						key.setACPT_INSPC_TYP(msgKey.getKeyValue("ACPT_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("STATUS_DN")) {
						key.setSTATUS_DN(msgKey.getKeyValue("STATUS_DN"));
					}
					if(msgKeyType.containsKeyColumn("IN_PLANT_CD")) {
						key.setIN_PLANT_CD(msgKey.getKeyValue("IN_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_WS_CD")) {
						key.setIN_WS_CD(msgKey.getKeyValue("IN_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_VEND_CD")) {
						key.setIN_VEND_CD(msgKey.getKeyValue("IN_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_ITEM_CD")) {
						key.setIN_ITEM_CD(msgKey.getKeyValue("IN_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_WORK_ODR_CD")) {
						key.setIN_WORK_ODR_CD(msgKey.getKeyValue("IN_WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_OPR_INST_CD")) {
						key.setIN_OPR_INST_CD(msgKey.getKeyValue("IN_OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_JOB_ODR_CD")) {
						key.setIN_JOB_ODR_CD(msgKey.getKeyValue("IN_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("L_IN_OPR_INST_START_DATE_FROM")) {
						key.setL_IN_OPR_INST_START_DATE_FROM(msgKey.getKeyValue("L_IN_OPR_INST_START_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("L_IN_OPR_INST_START_DATE_TO")) {
						key.setL_IN_OPR_INST_START_DATE_TO(msgKey.getKeyValue("L_IN_OPR_INST_START_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("L_IN_OPR_INST_START_DATE_FROM_ZERO")) {
						key.setL_IN_OPR_INST_START_DATE_FROM_ZERO(msgKey.getKeyValue("L_IN_OPR_INST_START_DATE_FROM_ZERO"));
					}
					if(msgKeyType.containsKeyColumn("L_IN_WORK_ODR_DLV_DATE_FROM")) {
						key.setL_IN_WORK_ODR_DLV_DATE_FROM(msgKey.getKeyValue("L_IN_WORK_ODR_DLV_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("L_IN_WORK_ODR_DLV_DATE_TO")) {
						key.setL_IN_WORK_ODR_DLV_DATE_TO(msgKey.getKeyValue("L_IN_WORK_ODR_DLV_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("L_IN_WORK_ODR_DLV_DATE_FROM_ZERO")) {
						key.setL_IN_WORK_ODR_DLV_DATE_FROM_ZERO(msgKey.getKeyValue("L_IN_WORK_ODR_DLV_DATE_FROM_ZERO"));
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
					if(msgKeyType.containsKeyColumn("readPLAN_CD")) {
						key.setreadPLAN_CD(msgKey.getKeyValue("readPLAN_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_PLANT_NAME")) {
						key.setIN_PLANT_NAME(msgKey.getKeyValue("IN_PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("readWS_CD")) {
						key.setreadWS_CD(msgKey.getKeyValue("readWS_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_WS_NAME")) {
						key.setIN_WS_NAME(msgKey.getKeyValue("IN_WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("readWS_PLANT_CD")) {
						key.setreadWS_PLANT_CD(msgKey.getKeyValue("readWS_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("readVEND_CD")) {
						key.setreadVEND_CD(msgKey.getKeyValue("readVEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_VEND_NAME")) {
						key.setIN_VEND_NAME(msgKey.getKeyValue("IN_VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("readITEM_CD")) {
						key.setreadITEM_CD(msgKey.getKeyValue("readITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_ITEM_NAME")) {
						key.setIN_ITEM_NAME(msgKey.getKeyValue("IN_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("readWORK_ODR_CD")) {
						key.setreadWORK_ODR_CD(msgKey.getKeyValue("readWORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("readPLANT_CD")) {
						key.setreadPLANT_CD(msgKey.getKeyValue("readPLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("readOPR_INST_CD")) {
						key.setreadOPR_INST_CD(msgKey.getKeyValue("readOPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("readJOB_ODR_CD")) {
						key.setreadJOB_ODR_CD(msgKey.getKeyValue("readJOB_ODR_CD"));
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
