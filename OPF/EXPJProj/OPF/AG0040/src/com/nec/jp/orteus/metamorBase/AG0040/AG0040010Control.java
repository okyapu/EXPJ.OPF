/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AG0040/src/com/nec/jp/orteus/metamorBase/AG0040/AG0040010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AG0040;

import com.nec.jp.orteus.metamorBase.AG0040.*;
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
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.LotCtrl;
	// TODO: ������import�p�b�P�[�W���L�q���Ă�������
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AG0040010Control
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
    private String lotctrl;
	// �f�t�H���g�A�N�Z�T���\�b�h
	public List getList() { return this.list; }						// ���X�g��Ԃ��܂��B
	public void setList(List listname) { this.list = listname; }	// ���X�g���Z�b�g���܂��B
	public int getListsize() {										// ���X�g�^�̃T�C�Y��Ԃ��܂��B
		int nret = 0;
		if( this.list != null ) {nret = this.list.size();}
		return nret;
	}
//	public Object getListvalue(int x) { return this.list.get(x); }	// ���X�g�̒l��Ԃ��܂��B
	public AG0040010Struct getListvalue(int x) { return (AG0040010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AG0040010Struct getStruct() { return this.struct; }	// Struct��Ԃ��܂��B
	public AG0040010Struct createStruct() { return new AG0040010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AG0040010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

	// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������

	/** ��ʑJ�ڃL�[(�i�ڔԍ�) */
	private String _itemCd;
		
	/** ��ʑJ�ڃL�[(�݌Ƀ��b�g�ԍ�) */
	private String _lotNo;
	
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
			struct.setIN_WH_CD(null);
			struct.setIN_WH_NAME(null);
			struct.setIN_VEND_CD(null);
			struct.setIN_VEND_NAME(null);
			struct.setIN_JOB_ODR_CD(null);
			struct.setIN_ITEM_CD(null);
			struct.setIN_ITEM_NAME(null);
			struct.setc1_VIEW_TYP(null);
			struct.setc2_VIEW_TYP(null);
			struct.setc3_VIEW_TYP(null);
			struct.setDOWNLOAD_FILE(null);
			struct.seth_lotCtrl(null);

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
				AG0040010Struct tmpStruct = (AG0040010Struct)plantList.get(0);
				struct.setIN_PLANT_NAME(tmpStruct.getIN_PLANT_NAME());
				return true;
			}

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
	 * ��ʑJ�ڃL�[(�i�ڔԍ�)�擾
	 * @return �i�ڔԍ�
	 */
	public String getItemCd() {
		return _itemCd;
	}

	/**
	 * ��ʑJ�ڃL�[(�i�ڔԍ�)�ݒ�
	 * @param cd �i�ڔԍ�
	 */
	public void setItemCd(String cd) {
		_itemCd = cd;
	}
		
	/**
	 * ��ʑJ�ڃL�[(�݌Ƀ��b�g�ԍ�)�擾
	 * @return �݌Ƀ��b�g�ԍ�
	 */
	public String getLotNo() {
		return _lotNo;
	}

	/**
	 * ��ʑJ�ڃL�[(�݌Ƀ��b�g�ԍ�)�ݒ�
	 * @param cd �݌Ƀ��b�g�ԍ�
	 */
	public void setLotNo(String cd) {
		_lotNo = cd;
	}
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0040");
		logger.entering("AG0040010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
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
						AG0040010Struct tmpStruct = (AG0040010Struct)plantList.get(0);
						struct.setIN_PLANT_NAME(tmpStruct.getIN_PLANT_NAME());
					}
				}else{
					struct.setIN_PLANT_NAME(null);
				}

				// �ۊǋ�R�[�h���w�肳�ꂽ�ꍇ
				if(struct.getIN_WH_CD() != null && ("").equals(struct.getIN_WH_CD()) == false){
					// �ۊǋ�R�[�h�̑��݃`�F�b�N
					List whList = entity.mselectM_WH.read(conn, struct);
					if(whList.size() <= 0) {
						// �Ǎ��������s�F�ۊǋ悪���݂��܂���
						setErrorMessage("ZZ11006");
						setErrorParameter("M_WH", "WH_CD", struct.getIN_WH_CD());
						return;
					}else{
						AG0040010Struct tmpStruct = (AG0040010Struct)whList.get(0);
						struct.setIN_WH_NAME(tmpStruct.getIN_WH_NAME());

						// �H��R�[�h���w�肳�ꂽ�ꍇ�֘A�`�F�b�N���s��
						// �@���.�H��R�[�h�͓��͂���Ă��邩�H
						if(struct.getIN_PLANT_CD() != null && ("").equals(struct.getIN_PLANT_CD()) == false){
							if(tmpStruct.getreadPLAN_CD().equals(struct.getIN_PLANT_CD()) == false){
								// ���������s��v�F�H��R�[�h�ƕۊǋ�̍H��R�[�h����v���܂���
								setErrorMessage("AG00011");
								setErrorParameter("M_WH", "WH_CD", struct.getIN_WH_CD());
								return;
							}
						}
						// �����R�[�h���w�肳�ꂽ�ꍇ�֘A�`�F�b�N���s��
						// �@���.�����R�[�h�͓��͂���Ă��邩�H
						if(struct.getIN_VEND_CD() != null && ("").equals(struct.getIN_VEND_CD()) == false){
							// �@����.�����R�[�h�͗L���l�����͂���Ă��邩�H
							if(tmpStruct.getreadVEND_CD() != null && ("").equals(tmpStruct.getreadVEND_CD()) == false){
								if(tmpStruct.getreadVEND_CD().equals(struct.getIN_VEND_CD()) == false){
									// ���������s��v�F�����R�[�h�ƕۊǋ�̎����R�[�h����v���܂���
									setErrorMessage("AG00012");
									setErrorParameter("M_VEND_CTRL", "VEND_CD", struct.getIN_VEND_CD());
									return;
								}
							}
						}
					}
				}else{
					struct.setIN_WH_NAME(null);
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
						AG0040010Struct tmpStruct = (AG0040010Struct)vendList.get(0);
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
						// �Ǎ��������s�F�i�ڃ}�X�^�����݂��܂���
						setErrorMessage("AG00010");
						setErrorParameter("M_ITEM", "ITEM_CD", struct.getIN_ITEM_CD());
						return;
					}else{
						AG0040010Struct tmpStruct = (AG0040010Struct)itemList.get(0);
						struct.setIN_ITEM_NAME(tmpStruct.getIN_ITEM_NAME());
					}
				}else{
					struct.setIN_ITEM_NAME(null);
				}

			//�y�f�[�^�Ǎ��z
				setReadStatus(INITIAL);
				List tempList = null;
				
				// �ő�\���s��
				ScreenParam sp = new ScreenParam(this.getClass());
				int maxLine = sp.getMaxLine(conn, 10);
				if (maxLine != 0)
					struct.setROW_COUNT(String.valueOf(maxLine));
				else
					struct.setROW_COUNT(null);
				
				
                 // �`�F�b�N�{�b�N�X�̏�Ԃŏ�����U�蕪����
				// [�����ۊǋ�̂ݕ\��:off][�}�C�i�X�݌ɂ̂ݕ\��:off][���b�g�ʍ݌ɑΏە\��:off]
				if(!"true".equals(struct.getc1_VIEW_TYP()) && !"true".equals(struct.getc2_VIEW_TYP())
						&& !"true".equals(struct.getc3_VIEW_TYP())){
					// ���������Ɏw�肳�ꂽ���e��[�ۊǋ�ʕi�ڍ݌ɥ�ۊǋ�ʐ��ԍ݌�]���擾
					tempList = entity.mselectT_STOCK1Cnt.read(conn, struct);

				// [�����ۊǋ�̂ݕ\��:on][�}�C�i�X�݌ɂ̂ݕ\��:on][���b�g�ʍ݌ɑΏە\��:off]
				} else if("true".equals(struct.getc1_VIEW_TYP()) && "true".equals(struct.getc2_VIEW_TYP())
						&& !"true".equals(struct.getc3_VIEW_TYP())){
					// ���������Ɏw�肳�ꂽ���e��[�ۊǋ�ʕi�ڍ݌ɥ�ۊǋ�ʐ��ԍ݌�]���擾
					tempList = entity.mselectT_STOCK2Cnt.read(conn, struct);

				// [�����ۊǋ�̂ݕ\��:on][�}�C�i�X�݌ɂ̂ݕ\��:off][���b�g�ʍ݌ɑΏە\��:off]
				} else if("true".equals(struct.getc1_VIEW_TYP())&& !"true".equals(struct.getc2_VIEW_TYP())
						  && !"true".equals(struct.getc3_VIEW_TYP())){
					// ���������Ɏw�肳�ꂽ���e��[�ۊǋ�ʕi�ڍ݌ɥ�ۊǋ�ʐ��ԍ݌�]���擾
					tempList = entity.mselectT_STOCK3Cnt.read(conn, struct);

				// [�����ۊǋ�̂ݕ\��:off][�}�C�i�X�݌ɂ̂ݕ\��:on][���b�g�ʍ݌ɑΏە\��:off]
				} else if("true".equals(struct.getc2_VIEW_TYP())&& !"true".equals(struct.getc1_VIEW_TYP())
						   && !"true".equals(struct.getc3_VIEW_TYP())){
					// ���������Ɏw�肳�ꂽ���e��[�ۊǋ�ʕi�ڍ݌ɥ�ۊǋ�ʐ��ԍ݌�]���擾
					tempList = entity.mselectT_STOCK4Cnt.read(conn, struct);
					
				// [�����ۊǋ�̂ݕ\��:on][�}�C�i�X�݌ɂ̂ݕ\��:on][���b�g�ʍ݌ɑΏە\��:on]
				}else if("true".equals(struct.getc1_VIEW_TYP()) 
						  && "true".equals(struct.getc2_VIEW_TYP()) 
						  && "true".equals(struct.getc3_VIEW_TYP())){
				    // ���������Ɏw�肳�ꂽ���e��[���b�g�ʕi�ڍ݌�]���擾
					tempList = entity.mselectT_STOCK5Cnt.read(conn, struct);
			
				// [�����ۊǋ�̂ݕ\��:on][�}�C�i�X�݌ɂ̂ݕ\��:off][���b�g�ʍ݌ɑΏە\��:on]
				}  else if("true".equals(struct.getc1_VIEW_TYP()) 
						  && "true".equals(struct.getc3_VIEW_TYP()) 
						  && !"true".equals(struct.getc2_VIEW_TYP())){
				    // ���������Ɏw�肳�ꂽ���e��[���b�g�ʕi�ڍ݌�]���擾
					tempList = entity.mselectT_STOCK6Cnt.read(conn, struct);
					
				// [�����ۊǋ�̂ݕ\��:off][�}�C�i�X�݌ɂ̂ݕ\��:on][���b�g�ʍ݌ɑΏە\��:on]
				}  else if(!"true".equals(struct.getc1_VIEW_TYP()) 
						  && "true".equals(struct.getc2_VIEW_TYP()) 
						  && "true".equals(struct.getc3_VIEW_TYP())){
				    // ���������Ɏw�肳�ꂽ���e��[���b�g�ʕi�ڍ݌�]���擾
					tempList = entity.mselectT_STOCK7Cnt.read(conn, struct);
					
			    // [�����ۊǋ�̂ݕ\��:off][�}�C�i�X�݌ɂ̂ݕ\��:off][���b�g�ʍ݌ɑΏە\��:on]
				}  else if("true".equals(struct.getc3_VIEW_TYP())
						   && !"true".equals(struct.getc1_VIEW_TYP())
						   && !"true".equals(struct.getc2_VIEW_TYP())){
				    // ���������Ɏw�肳�ꂽ���e��[���b�g�ʕi�ڍ݌�]���擾
				    tempList = entity.mselectT_STOCK8Cnt.read(conn, struct);
				}

				long rowCount = Long.parseLong(((AG0040010Struct) tempList.get(0))
						.getl_COUNT());
				
				
                  // �Y�����R�[�h���擾�ł��Ȃ��ꍇ�B
				if (rowCount == 0){
					// �Y���f�[�^�Ȃ�
					setErrorMessage("ZZ06001");
					setReadStatus(NOT_FOUND);
					// CSV�Ҕ��G���A�̃N���A
					_csvList = null;
					
					if(list!=null && list.size()>0){
						list.clear();
					}
					return;
				}else {
					if(maxLine != 0 && rowCount == maxLine+1){
						// �Ǎ��X�e�[�^�X�ݒ�
						setReadStatus(TOO_MANY);
						setErrorMessage("ZZ01119", ""+maxLine);
						// �\���p���X�g�ɃZ�b�g
						if(list!=null && list.size()>0){
							list.clear();
						}
						return;
					}
					    }


				// �`�F�b�N�{�b�N�X�̏�Ԃŏ�����U�蕪����
				//�@[�����ۊǋ�̂ݕ\��:off][�}�C�i�X�݌ɂ̂ݕ\��:off][���b�g�ʍ݌ɑΏە\��:off]
				if(!"true".equals(struct.getc1_VIEW_TYP()) && !"true".equals(struct.getc2_VIEW_TYP())
						&& !"true".equals(struct.getc3_VIEW_TYP())){
					// ���������Ɏw�肳�ꂽ���e��[�ۊǋ�ʕi�ڍ݌ɥ�ۊǋ�ʐ��ԍ݌�]���擾
					tempList = entity.mselectT_STOCK1.read(conn, struct);

				//�@[�����ۊǋ�̂ݕ\��:on][�}�C�i�X�݌ɂ̂ݕ\��:on][���b�g�ʍ݌ɑΏە\��:off]
				} else if("true".equals(struct.getc1_VIEW_TYP()) && "true".equals(struct.getc2_VIEW_TYP())
						&& !"true".equals(struct.getc3_VIEW_TYP())){
					// ���������Ɏw�肳�ꂽ���e��[�ۊǋ�ʕi�ڍ݌ɥ�ۊǋ�ʐ��ԍ݌�]���擾
					tempList = entity.mselectT_STOCK2.read(conn, struct);

				//�@[�����ۊǋ�̂ݕ\��:on][�}�C�i�X�݌ɂ̂ݕ\��:off][���b�g�ʍ݌ɑΏە\��:off]
				} else if("true".equals(struct.getc1_VIEW_TYP())&& !"true".equals(struct.getc2_VIEW_TYP())
						  && !"true".equals(struct.getc3_VIEW_TYP())){
					// ���������Ɏw�肳�ꂽ���e��[�ۊǋ�ʕi�ڍ݌ɥ�ۊǋ�ʐ��ԍ݌�]���擾
					tempList = entity.mselectT_STOCK3.read(conn, struct);

				//�@[�����ۊǋ�̂ݕ\��:off][�}�C�i�X�݌ɂ̂ݕ\��:on][���b�g�ʍ݌ɑΏە\��:off]
				} else if("true".equals(struct.getc2_VIEW_TYP())&& !"true".equals(struct.getc1_VIEW_TYP())
						   && !"true".equals(struct.getc3_VIEW_TYP())){
					// ���������Ɏw�肳�ꂽ���e��[�ۊǋ�ʕi�ڍ݌ɥ�ۊǋ�ʐ��ԍ݌�]���擾
					tempList = entity.mselectT_STOCK4.read(conn, struct);
					
				// [�����ۊǋ�̂ݕ\��:on][�}�C�i�X�݌ɂ̂ݕ\��:on][���b�g�ʍ݌ɑΏە\��:on]
				}else if("true".equals(struct.getc1_VIEW_TYP()) 
						  && "true".equals(struct.getc2_VIEW_TYP()) 
						  && "true".equals(struct.getc3_VIEW_TYP())){
				    // ���������Ɏw�肳�ꂽ���e��[���b�g�ʕi�ڍ݌�]���擾
					tempList = entity.mselectT_STOCK5.read(conn, struct);
			
				// [�����ۊǋ�̂ݕ\��:on][�}�C�i�X�݌ɂ̂ݕ\��:off][���b�g�ʍ݌ɑΏە\��:on]
				}  else if("true".equals(struct.getc1_VIEW_TYP()) 
						  && "true".equals(struct.getc3_VIEW_TYP()) 
						  && !"true".equals(struct.getc2_VIEW_TYP())){
				    // ���������Ɏw�肳�ꂽ���e��[���b�g�ʕi�ڍ݌�]���擾 
					tempList = entity.mselectT_STOCK6.read(conn, struct);
					
				// 	[�����ۊǋ�̂ݕ\��:off][�}�C�i�X�݌ɂ̂ݕ\��:on][���b�g�ʍ݌ɑΏە\��:on]		     
				}  else if(!"true".equals(struct.getc1_VIEW_TYP()) 
						  && "true".equals(struct.getc2_VIEW_TYP()) 
						  && "true".equals(struct.getc3_VIEW_TYP())){
				    // ���������Ɏw�肳�ꂽ���e��[���b�g�ʕi�ڍ݌�]���擾
					tempList = entity.mselectT_STOCK7.read(conn, struct);
					
			    // [�����ۊǋ�̂ݕ\��:off][�}�C�i�X�݌ɂ̂ݕ\��:off][���b�g�ʍ݌ɑΏە\��:on]	
				}  else if("true".equals(struct.getc3_VIEW_TYP())
						   && !"true".equals(struct.getc1_VIEW_TYP())
						   && !"true".equals(struct.getc2_VIEW_TYP())){
				    // ���������Ɏw�肳�ꂽ���e��[���b�g�ʕi�ڍ݌�]���擾
				    tempList = entity.mselectT_STOCK8.read(conn, struct);
				}
				
				// CSV�o�͗p�ɑҔ�
				_csvList = tempList;
					  AG0040010Struct TempStruct;
			          for (int i = 0; i < tempList.size(); i++) {
					     TempStruct = (AG0040010Struct)tempList.get(i);
					     TempStruct.setSUPPLY_KBN_DN(multcombo("CONS_TYP",TempStruct.getSUPPLY_KBN_DN()));
					     TempStruct.setMRP_FLG(multcombo("MRP_FLG",TempStruct.getMRP_FLG()));
			          }
					   
						// �Ǎ��X�e�[�^�X�ݒ�
						setReadStatus(NORMAL);
						// �\���p���X�g�ɃZ�b�g
						setList(tempList);
					
		} catch(SQLException e) {

			e.printStackTrace();

			// �Ǎ��X�e�[�^�X�ݒ�
			setReadStatus(ERROR);
			setSqlExceptionMsg(e);
		}

                //}}user_implement_dev:<controlSelect>
		logger.exiting("AG0040010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * CSV�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCsvOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0040");
		logger.entering("AG0040010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");
			//{{user_implement_dev:<controlCsvOut>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������

		// ������
		csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));
		List csvList = new ArrayList();

		// �^�C�g���s
		String[] title = {
			"Expj.PLANT_CD" ,
			"Expj.WH_CD" ,
			"Expj.WH_NAME" ,
			"Expj.MRP_FLG" ,
			"Expj.VEND_CD" ,
			"Expj.VEND_NAME" ,
			"Expj.ITEM_CD" ,
			"Expj.ITEM_NAME" ,
			"Expj.STOCK_LOT_CD" ,
			"Expj.JOB_ODR_CD" ,
			"Expj.STOCK_ON_HAND_QTY" ,
			"Expj.DEFECT_QTY" ,
			"Expj.PRVS_DAYEND_STOCK_QTY" ,
			"Expj.PRVS_MONTHEND_STOCK_QTY" ,
			"Expj.STOCK_UNIT_1" ,
			"Expj.CONS_TYP" 
		};
		csvList.add(title);

		// �f�[�^�s
		for (Iterator i = _csvList.iterator(); i.hasNext();) {
			AG0040010Struct csvStruct = (AG0040010Struct) i.next();
			if("false".equals(struct.geth_lotCtrl())){
				csvStruct.setl_LOT_NO("");
			}
			String[] csvStr = new String[title.length];
			csvStr[0] = csvStruct.getPLANT_CD();					// �H��R�[�h
			csvStr[1] = csvStruct.getWH_CD();						// �ۊǋ�R�[�h
			csvStr[2] = csvStruct.getWH_NAME();						// �ۊǋ於
			csvStr[3] = csvStruct.getMRP_FLG();						// ���v�ʌv�Z�Ώۃt���O
			csvStr[4] = csvStruct.getVEND_CD();						// �����R�[�h
			csvStr[5] = csvStruct.getVEND_ANAME();					// ����於
			csvStr[6] = csvStruct.getITEM_CD();						// �i�ڔԍ�
			csvStr[7] = csvStruct.getITEM_NAME();					// �i�ږ�
			csvStr[8] = csvStruct.getl_LOT_NO();					// �݌Ƀ��b�g�ԍ�
			csvStr[9] = csvStruct.getJOB_ODR_CD();					// ����
			csvStr[10] = csvStruct.getSTOCK_ON_HAND_QTY();			// �莝�݌ɐ�
			csvStr[11] = csvStruct.getDEFECT_QTY();					// �s�ǐ�
			csvStr[12] = csvStruct.getPRVS_DAYEND_STOCK_QTY();		// �O�����݌ɐ�
			csvStr[13] = csvStruct.getPRVS_MONTHEND_STOCK_QTY();	// �O�����݌ɐ�
			csvStr[14] = csvStruct.getSTOCK_UNIT();					// �P��
			csvStr[15] = csvStruct.getSUPPLY_KBN_DN();				// �x���敪
			csvList.add(csvStr);
		}

		if (csvList != null && !csvList.isEmpty()) {
			// CsvWriter�𐶐�
			csvWriter = new CsvWriter(CsvWriter.getFileName(sysUSER_CD));
			csvWriter.write(csvList, CoreTools.getLocale(struct.getsUser_ID()),true);
			struct.setDOWNLOAD_FILE(csvWriter.getFilePath());
		}

                //}}user_implement_dev:<controlCsvOut>
		logger.exiting("AG0040010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0040");
		logger.entering("AG0040010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������

			// ���ڂ��N���A����i�����l���Z�b�g�j
			initialSet();

                //}}user_implement_dev:<controlClear>
		logger.exiting("AG0040010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0040");
		logger.entering("AG0040010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("AG0040010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * �݌ɏƉ�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlJobOdrAlc() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0040");
		logger.entering("AG0040010Control"+":USER="+struct.getsUser_ID(),"controlJobOdrAlc");
			//{{user_implement_dev:<controlJobOdrAlc>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlJobOdrAlc>
		logger.exiting("AG0040010Control"+":USER="+struct.getsUser_ID(),"controlJobOdrAlc");

		return;
	}

	/**
	 * ���b�g�ʍ݌ɎQ�ƃ{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlLotOdrAlc() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0040");
		logger.entering("AG0040010Control"+":USER="+struct.getsUser_ID(),"controlLotOdrAlc");
			//{{user_implement_dev:<controlLotOdrAlc>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlLotOdrAlc>
		logger.exiting("AG0040010Control"+":USER="+struct.getsUser_ID(),"controlLotOdrAlc");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0040");
		logger.entering("AG0040010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AG0040010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0040");
		logger.entering("AG0040010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������

			// ���ڂ��N���A����i�����l���Z�b�g�j
			initialSet();
			//check���b�g����
			try {
				if(LotCtrl.checkLotCtrl(conn)){
				    struct.seth_lotCtrl("true");
				    lotctrl = "true";
				}else{
					struct.seth_lotCtrl("false");
					lotctrl = "false";
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if ( isScreenMove() == true ) {
				// �����̃R���g���[�����\�b�h���Ăяo���܂��B
				struct.setIN_ITEM_CD(_itemCd);
				struct.setIN_LOT_NO(_lotNo);
				struct.setc3_VIEW_TYP("true");
				controlSelect();
			}

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AG0040010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0040");
		logger.entering("AG0040010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
		logger.exiting("AG0040010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("JobOdrAlc") ) {
				controlJobOdrAlc();
			} else if( button.equals("LotOdrAlc") ) {
				controlLotOdrAlc();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
			struct.seth_lotCtrl(lotctrl);
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
//			throw new FoundationException("AG0040010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AG0040010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AG0040010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AG0040010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AG0040010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AG0040010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AG0040010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AG0040010Entity entity;
	protected AG0040010Struct struct;
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

		entity = new AG0040010Entity();
		struct = new AG0040010Struct();

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
	 * AG0040010�N���X�̕W���R���X�g���N�^
	 */
	public AG0040010Control() throws BusinessProcessException, FoundationException
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
				AG0040010Struct key = (AG0040010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("c1_VIEW_TYP") && key.getc1_VIEW_TYP() != null) {
					msgKey.setKeyValue("c1_VIEW_TYP", key.getc1_VIEW_TYP());
				}
				if(msgKeyType.containsKeyColumn("c2_VIEW_TYP") && key.getc2_VIEW_TYP() != null) {
					msgKey.setKeyValue("c2_VIEW_TYP", key.getc2_VIEW_TYP());
				}
				if(msgKeyType.containsKeyColumn("tempLot") && key.gettempLot() != null) {
					msgKey.setKeyValue("tempLot", key.gettempLot());
				}
				if(msgKeyType.containsKeyColumn("c3_VIEW_TYP") && key.getc3_VIEW_TYP() != null) {
					msgKey.setKeyValue("c3_VIEW_TYP", key.getc3_VIEW_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_lotCtrl") && key.geth_lotCtrl() != null) {
					msgKey.setKeyValue("h_lotCtrl", key.geth_lotCtrl());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("MRP_FLG") && key.getMRP_FLG() != null) {
					msgKey.setKeyValue("MRP_FLG", key.getMRP_FLG());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_ANAME") && key.getVEND_ANAME() != null) {
					msgKey.setKeyValue("VEND_ANAME", key.getVEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY") && key.getSTOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("STOCK_ON_HAND_QTY", key.getSTOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_QTY") && key.getDEFECT_QTY() != null) {
					msgKey.setKeyValue("DEFECT_QTY", key.getDEFECT_QTY());
				}
				if(msgKeyType.containsKeyColumn("PRVS_DAYEND_STOCK_QTY") && key.getPRVS_DAYEND_STOCK_QTY() != null) {
					msgKey.setKeyValue("PRVS_DAYEND_STOCK_QTY", key.getPRVS_DAYEND_STOCK_QTY());
				}
				if(msgKeyType.containsKeyColumn("PRVS_MONTHEND_STOCK_QTY") && key.getPRVS_MONTHEND_STOCK_QTY() != null) {
					msgKey.setKeyValue("PRVS_MONTHEND_STOCK_QTY", key.getPRVS_MONTHEND_STOCK_QTY());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("SUPPLY_KBN_DN") && key.getSUPPLY_KBN_DN() != null) {
					msgKey.setKeyValue("SUPPLY_KBN_DN", key.getSUPPLY_KBN_DN());
				}
				if(msgKeyType.containsKeyColumn("IN_PLANT_CD") && key.getIN_PLANT_CD() != null) {
					msgKey.setKeyValue("IN_PLANT_CD", key.getIN_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_WH_CD") && key.getIN_WH_CD() != null) {
					msgKey.setKeyValue("IN_WH_CD", key.getIN_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_VEND_CD") && key.getIN_VEND_CD() != null) {
					msgKey.setKeyValue("IN_VEND_CD", key.getIN_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_JOB_ODR_CD") && key.getIN_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("IN_JOB_ODR_CD", key.getIN_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_ITEM_CD") && key.getIN_ITEM_CD() != null) {
					msgKey.setKeyValue("IN_ITEM_CD", key.getIN_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readPLAN_CD") && key.getreadPLAN_CD() != null) {
					msgKey.setKeyValue("readPLAN_CD", key.getreadPLAN_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_PLANT_NAME") && key.getIN_PLANT_NAME() != null) {
					msgKey.setKeyValue("IN_PLANT_NAME", key.getIN_PLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("readWH_CD") && key.getreadWH_CD() != null) {
					msgKey.setKeyValue("readWH_CD", key.getreadWH_CD());
				}
				if(msgKeyType.containsKeyColumn("readVEND_CD") && key.getreadVEND_CD() != null) {
					msgKey.setKeyValue("readVEND_CD", key.getreadVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_WH_NAME") && key.getIN_WH_NAME() != null) {
					msgKey.setKeyValue("IN_WH_NAME", key.getIN_WH_NAME());
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
				if(msgKeyType.containsKeyColumn("SUPPLY_KBN") && key.getSUPPLY_KBN() != null) {
					msgKey.setKeyValue("SUPPLY_KBN", key.getSUPPLY_KBN());
				}
				if(msgKeyType.containsKeyColumn("l_LOT_NO") && key.getl_LOT_NO() != null) {
					msgKey.setKeyValue("l_LOT_NO", key.getl_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("IN_LOT_NO") && key.getIN_LOT_NO() != null) {
					msgKey.setKeyValue("IN_LOT_NO", key.getIN_LOT_NO());
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
					AG0040010Struct key = new AG0040010Struct();
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("c1_VIEW_TYP")) {
						key.setc1_VIEW_TYP(msgKey.getKeyValue("c1_VIEW_TYP"));
					}
					if(msgKeyType.containsKeyColumn("c2_VIEW_TYP")) {
						key.setc2_VIEW_TYP(msgKey.getKeyValue("c2_VIEW_TYP"));
					}
					if(msgKeyType.containsKeyColumn("tempLot")) {
						key.settempLot(msgKey.getKeyValue("tempLot"));
					}
					if(msgKeyType.containsKeyColumn("c3_VIEW_TYP")) {
						key.setc3_VIEW_TYP(msgKey.getKeyValue("c3_VIEW_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_lotCtrl")) {
						key.seth_lotCtrl(msgKey.getKeyValue("h_lotCtrl"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MRP_FLG")) {
						key.setMRP_FLG(msgKey.getKeyValue("MRP_FLG"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_ANAME")) {
						key.setVEND_ANAME(msgKey.getKeyValue("VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY")) {
						key.setSTOCK_ON_HAND_QTY(msgKey.getKeyValue("STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_QTY")) {
						key.setDEFECT_QTY(msgKey.getKeyValue("DEFECT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PRVS_DAYEND_STOCK_QTY")) {
						key.setPRVS_DAYEND_STOCK_QTY(msgKey.getKeyValue("PRVS_DAYEND_STOCK_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PRVS_MONTHEND_STOCK_QTY")) {
						key.setPRVS_MONTHEND_STOCK_QTY(msgKey.getKeyValue("PRVS_MONTHEND_STOCK_QTY"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("SUPPLY_KBN_DN")) {
						key.setSUPPLY_KBN_DN(msgKey.getKeyValue("SUPPLY_KBN_DN"));
					}
					if(msgKeyType.containsKeyColumn("IN_PLANT_CD")) {
						key.setIN_PLANT_CD(msgKey.getKeyValue("IN_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_WH_CD")) {
						key.setIN_WH_CD(msgKey.getKeyValue("IN_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_VEND_CD")) {
						key.setIN_VEND_CD(msgKey.getKeyValue("IN_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_JOB_ODR_CD")) {
						key.setIN_JOB_ODR_CD(msgKey.getKeyValue("IN_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_ITEM_CD")) {
						key.setIN_ITEM_CD(msgKey.getKeyValue("IN_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readPLAN_CD")) {
						key.setreadPLAN_CD(msgKey.getKeyValue("readPLAN_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_PLANT_NAME")) {
						key.setIN_PLANT_NAME(msgKey.getKeyValue("IN_PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("readWH_CD")) {
						key.setreadWH_CD(msgKey.getKeyValue("readWH_CD"));
					}
					if(msgKeyType.containsKeyColumn("readVEND_CD")) {
						key.setreadVEND_CD(msgKey.getKeyValue("readVEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_WH_NAME")) {
						key.setIN_WH_NAME(msgKey.getKeyValue("IN_WH_NAME"));
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
					if(msgKeyType.containsKeyColumn("SUPPLY_KBN")) {
						key.setSUPPLY_KBN(msgKey.getKeyValue("SUPPLY_KBN"));
					}
					if(msgKeyType.containsKeyColumn("l_LOT_NO")) {
						key.setl_LOT_NO(msgKey.getKeyValue("l_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("IN_LOT_NO")) {
						key.setIN_LOT_NO(msgKey.getKeyValue("IN_LOT_NO"));
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
