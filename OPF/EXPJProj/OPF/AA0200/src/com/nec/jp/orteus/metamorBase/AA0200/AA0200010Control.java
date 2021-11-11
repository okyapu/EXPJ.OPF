/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0200/src/com/nec/jp/orteus/metamorBase/AA0200/AA0200010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0200;

import com.nec.jp.orteus.metamorBase.AA0200.*;
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
import com.nec.jp.orteus.xaf.common.XafTools;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AA0200010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.2 $ $Date: 2015/10/27 08:06:33 $
 *
 */
//}}user_implement_code_header

public class AA0200010Control
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
	// �f�t�H���g�A�N�Z�T���\�b�h
	protected List list;											// ���ʃ��X�g�̃C���X�^���X
	public List getList() { return this.list; }						// ���X�g��Ԃ��܂��B
	public void setList(List listname) { this.list = listname; }	// ���X�g���Z�b�g���܂��B
	public int getListsize() {										// ���X�g�^�̃T�C�Y��Ԃ��܂��B
		int nret = 0;
		if( this.list != null ) {nret = this.list.size();}
		return nret;
	}
//	public Object getListvalue(int x) { return this.list.get(x); }	// ���X�g�̒l��Ԃ��܂��B
	public AA0200010Struct getListvalue(int x) { return (AA0200010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AA0200010Struct getStruct() { return this.struct; }	// Struct�̒l��Ԃ��܂��B
	public AA0200010Struct createStruct() { return new AA0200010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AA0200010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
	/**�S�����R�[�h����**/
	private int _intTotalCount = 0; 
	/**�G���[���R�[�h����**/
	private int _intErrorCount = 0;  
	/**���탌�R�[�h����**/
	private int _intSuccessCount = 0;
	/**���[�j���O����**/
	private int _intWarningCount = 0;
	/**�G���[�R�[�h**/
	private String _strSysdate = "";

	// �e��ʂ�struct��ޔ�
	private String _strRdoInsert = "";
	private String _strRdoUpdate = "";
	private String _strRdoDelete = "";
	private String _strDoChk = "";
	// �g���q
    private final String EXTENSION_CSV = "csv";
	/** �b�r�u���ڔԍ���` */
	// ���p�҃R�[�h
	private final int CSV_USER_CD = 0;
	// ���p��
	private final int CSV_USER_NAME = 1;
	// �p�X���[�h
	private final int CSV_PASSWORD = 2;
	// �H��R�[�h
	private final int CSV_PLANT_CD = 3;
	// ����R�[�h
	private final int CSV_SECTION_CD = 4;
	// ������
	private final int CSV_LOCALE = 5;
	// ���[���A�h���X
	private final int CSV_ADDRESS = 6;
	// ���F����
	private final int CSV_APPR_POWER_TYP = 7;
	// ��������R�[�h
	private final int CSV_BELONG_GROUP_CD = 8;
	// �����t���O
	private final int CSV_BELONG_FLG = 9;
	//�b�r�u�捞�f�[�^�K�v���ڐ�(���v)
	private final int CSV_NECESSARY_COLUMN= 10;
	// 99
	private final String CSV_COLNO_99 = "99";
	// ���b�Z�[�W
	private ExpjMessage _emsg = null;

	// �����ꍀ�ڎ擾�Ή�
	private String _locale = CoreTools.getLocale(sysUSER_CD);
	ResourceBundle _resource = CoreTools.getResourceBundle("OrteusUserDic", _locale);

	/** ��\���Ɩ��O���[�v���A�N�Z�X�L�[ */
	private final static String _DISABLE_BUSINESS_GROUP_ACCESS_KEY = "DISABLE_BUSINESS_G";
	
	/** �Ɩ��O���[�v�f�[�^�i�[�p */
	private List _listNotBusinessGroupCD = null;
	
	/** ��ЃR�[�h */
	private String _strCompany_cd;

	/** �R���{�{�b�N�X�f�[�^�F�G���[�敪 */
	private ComboStruct _COM_ERR_TYP = null;

	/**
	 * ���F�������Q�b�g
	 * 
	 * @return
	 */
	private ComboStruct APPR_POWER_TYP = null;
	
	/**
	 * ��������Q�b�g
	 * 
	 * @return
	 */
	private ComboStruct LOCALE_TYP = null;	
	
	/** ��ЃR�[�h�擾 */
	public String getCompanyCd() {
		return _strCompany_cd;
	}
	/**
	 * �Ɩ����W�b�N�̃G���[���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * @param code ���b�Z�[�W�R�[�h
	 * @param value1 �u��������P
	 * @param value2 �u��������2
	 * @param value3 �u��������3
	 */
	private void setErrorMessage(String code, String value1, String value2, String value3) {
		ExpjMessage emsg = new ExpjMessage(code, value1, value2, value3);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, sysUSER_CD);
	}
	
	/**
	 * �Ɩ����W�b�N�̃G���[���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * @param code ���b�Z�[�W�R�[�h
	 * @param value1 �u��������P
	 * @param value2 �u��������2
	 */
	private void setErrorMessage(String code, String value1, String value2) {
		ExpjMessage emsg = new ExpjMessage(code, value1, value2);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, sysUSER_CD);
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
	 * �Ɩ����W�b�N�̃��[�j���O���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * @param code ���b�Z�[�W�R�[�h
	 * @param msg1
	 * @param msg2
	 */
	private void setWarningMessage(String code, String msg1, String msg2) {
		ExpjMessage emsg = new ExpjMessage(code, msg1, msg2);
		msgStruct.addWarn(emsg);
		sysLog.info(emsg, sysUSER_CD);
	}

	/**
	 * SQLException�G���[���b�Z�[�W�ݒ�
	 * 
	 * @param SQLException
	 */
	private void setSqlExceptionMsg(SQLException e) throws ExpjException {
		ExpjMessage emsg = new ExpjMessage("ZZ01106");
		sysLog.severe(emsg, getsysUSER_CD());
		ExpjException ee = new ExpjException(e, emsg);
		throw ee;
	}

	/**
	 * ���O���b�Z�[�W�ݒ�
	 * @param �o�̓��b�Z�[�W
	 */
	private void setSyslogConfig(String message) {
		ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
		sysLog.config(emsg, getsysUSER_CD());
	}
	
	/**
	 * �Ɩ����W�b�N�̃C���t�H���[�V�����ݒ菈����؂�o���Ċ֐���
	 * @param code
	 * @param value1
	 */
	private void setInfoMessage(String code, String value1, String value2, String value3) {
		ExpjMessage emsg = new ExpjMessage(code, value1, value2, value3);
		msgStruct.addInfo(emsg);
		sysLog.info(emsg, sysUSER_CD);
	}
	
	/**
	 * �Ɩ����W�b�N�̃C���t�H���[�V�����ݒ菈����؂�o���Ċ֐���
	 * @param code
	 * @param value1
	 */
	private void setInfoMessage(String code, String value1) {
		ExpjMessage emsg = new ExpjMessage(code, value1);
		msgStruct.addInfo(emsg);
		sysLog.info(emsg, sysUSER_CD);
	}
	/**
	 * NULL�̏ꍇ�A�h�h��߂�
	 * @param strInput
	 * @return
	 */
	private String getString(String strInput){
		if(CsvInCheck.isNull(strInput)){
			return "";
		}else{
			return strInput;
		}
	}
	/** 
	 * �Ɩ��^�p���Ǎ�����
	 *
	 * @return boolean
	 */
	private String readBUSINESS_OPR_DATE(String plantCd) throws BusinessProcessException, FoundationException
	{
		String businessDate = null;
		try {
			// �Ɩ��^�p���Ǎ�
			AA0200010Struct structCsv = new AA0200010Struct();
			structCsv.setl_PLANT_CD(plantCd);
			List businessList = entity.mselectBUSINESS_OPR_DATE.read(conn, structCsv);
			if(businessList.size() > 0){
				businessDate = ((AA0200010Struct)businessList.get(0)).getl_BUSINESS_OPR_DATE();
			}
		} catch(SQLException e) {
			// �G���[���b�Z�[�W�쐬
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}
		return businessDate;
	}
	/**
	 * �b�r�u�f�[�^�擾�ƃ��X�g�f�[�^���@
	 * 
	 * @return CSV�f�[�^���X�g
	 */
	private List readCsvData() throws ExpjException {
		String[] strsCsvData = null;
		List listCsv = new ArrayList();
		try {
			// CSV�f�[�^�̃A�b�v���[�h
			strsCsvData = (String []) csvReader.lineRead();
			if (strsCsvData != null) {
				setSyslogConfig("strsCsvData.length:" + strsCsvData.length);
				// �f�[�^�����Ƃ���strsCsvData.length�͎g���Ȃ��B���ۂ̍s���{�T�s���炢�炵��
				AA0200010Struct structCsv = null;
				Vector v = null;
				
				for (int i = 0; i < strsCsvData.length; i++) {
					if (strsCsvData[i].length() == 0) {
						// �����𔲂���B
						break;
					}
					// ���R�[�h�����ږ��ɂ΂炷
					v = csvReader.importCSVLine(strsCsvData[i]);
					if (v != null ) {
						structCsv = new AA0200010Struct();
						if (CSV_NECESSARY_COLUMN == v.size()) {
							// ���p�҃R�[�h
							structCsv.setl_USER_CD((String)v.get(CSV_USER_CD));
							// ���p�Җ�
							structCsv.setl_USER_NAME((String)v.get(CSV_USER_NAME));
							// �p�X���[�h
							structCsv.setl_PASSWORD((String)v.get(CSV_PASSWORD));
							// �H��R�[�h
							structCsv.setl_PLANT_CD((String)v.get(CSV_PLANT_CD));
							// ����R�[�h
							structCsv.setl_SECTION_CD((String)v.get(CSV_SECTION_CD));
							// ������
							if(CsvInCheck.isNull((String)v.get(CSV_LOCALE))){
								structCsv.setl_LOCALE(" ");
							}else{
								structCsv.setl_LOCALE((String)v.get(CSV_LOCALE));
							}
							// ���[���A�h���X
							structCsv.setl_ADDRESS((String)v.get(CSV_ADDRESS));							
							// ���F����
							if(CsvInCheck.isNull((String)v.get(CSV_APPR_POWER_TYP))){
								structCsv.setl_APPR_POWER_TYP("0");
							}else{
								structCsv.setl_APPR_POWER_TYP((String)v.get(CSV_APPR_POWER_TYP));
							}
							// ��������R�[�h
							structCsv.setl_BELONG_GROUP_CD((String)v.get(CSV_BELONG_GROUP_CD));
							// �����t���O
							if(CsvInCheck.isNull((String)v.get(CSV_BELONG_FLG))){
								structCsv.setw_BELONG_FLG("0");
							}else{
								structCsv.setw_BELONG_FLG((String)v.get(CSV_BELONG_FLG));
							}
							
							// ��ЃR�[�h
							structCsv.setl_COMPANY_CD(_strCompany_cd);
							
							structCsv.setw_COLUMN_FLG((String)null);
						} else {
							// ���p�҃R�[�h
							structCsv.setl_USER_CD((String)v.get(CSV_USER_CD));
							structCsv.setw_COLUMN_FLG(String.valueOf(v.size()));
						}						
						listCsv.add(structCsv);
					} else {
						//�x�N�^�[�������s�G���[
						setSyslogConfig("csvReader.Vector was Failed... line:" + strsCsvData[i]);
						listCsv = null;
						break;
					}
				}
				
				//  �b�r�u�f�[�^�����i�^�C�g���s�͏Ȃ��j
				if((listCsv == null) || (listCsv.size() <= 0)) {
					// �捞���s�܂��̓f�[�^�Ȃ�
					ExpjMessage emsg = new ExpjMessage( "AH00042", "0", "0");
					msgStruct.addError( emsg );
					sysLog.warning(emsg, getsysUSER_CD());
					listCsv = null;
				} else {
					// �b�r�u�Ǎ��݌������O�\��
					ExpjMessage emsg = new ExpjMessage( "AH00043", String.valueOf(listCsv.size()));
					sysLog.config(emsg, getsysUSER_CD());
				}
			}
		} catch (Exception e) {
			ExpjMessage emsg = new ExpjMessage("AH00042", "0", "0");
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}		
		return listCsv;
	}
	/**
     * �t�@�C���l�[�~���O
     *
     * @return  ����:true / �G���[:false
     */
	private boolean chkOutputFilePath() throws BusinessProcessException,
			FoundationException {
		String filePath = null;
		try {
			// �o�̓t�@�C���l�[�~���O
			PrivateConfig pc = new PrivateConfig(conn);
			// �������O�t�@�C�����擾(�V�X�e���p�����[�^���擾)
			String CsvCancelFileName = pc.getString("J_USER_MST_CANCEL");
			if (null == CsvCancelFileName || "".equals(CsvCancelFileName)) {
				msgStruct.clear();
				// �G���[���b�Z�[�W�\��
				ExpjMessage emsg = new ExpjMessage("AA01521");
				msgStruct.addError(emsg);
				sysLog.severe(emsg, getsysUSER_CD());
				return false;
			}
			// �t�@�C���l�[�~���O
			FileNaming fnm = new FileNaming();
			// ���[�U
			fnm.setUser(getsysUSER_CD());
			// �g���q
			fnm.setExtension(EXTENSION_CSV);
			// �f�B���N�g��
			fnm.setDirectory(CsvCancelFileName);
			filePath = fnm.naming();
			if (null == filePath || "".equals(filePath)) {
				msgStruct.clear();
				// �G���[���b�Z�[�W�\��
				ExpjMessage emsg = new ExpjMessage("AA01522");
				msgStruct.addError(emsg);
				sysLog.severe(emsg, getsysUSER_CD());
				return false;
			}
		} catch (Exception e) {
			ExpjMessage emsg = new ExpjMessage("AH00042", "0", "0");
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}
		struct.setCANCEL_FILE(filePath);
		return true;
	}
	/**
	 * �b�r�u�o�̓f�[�^�ݒ菀��
	 * 
	 * @param errlineNo
	 *            �G���[�����s
	 * @param errItemNo
	 *            �G���[���ڔԍ�
	 * @param errTyp
	 *            �G���[�敪
	 * @param target_struct
	 *            �Ώۃf�[�^���
	 * @param fieldName
	 *            �G���[���ږ�
	 * @param strMessage
	 *            �G���[���b�Z�[�W
	 * @return �ُ�Ȃ� true �G���[ false
	 */
	private void csvExport(String errlineNo, String errItemNo,
			String errTyp, AA0200010Struct target_struct, String fieldName,	String strMessage) throws BusinessProcessException, FoundationException {
		
		AA0200010Struct errStruct = new AA0200010Struct();
		String locale = CoreTools.getLocale(sysUSER_CD);
		
		ExpjMessage emsg = null;
		// �G���[�ӏ�
		// ������L�[�Z�b�g
		if (!CSV_COLNO_99.equals(errItemNo)) {
			emsg = new ExpjMessage("AH00045", errlineNo, errItemNo);
		} else {
			emsg = new ExpjMessage("AA01520", errlineNo);
		}
		errStruct.setl_ERROR_IN(emsg.getMessage(locale));
		
		// �G���[�敪
		errStruct.setl_ERR_TYP(errTyp);
		// ���p�҃R�[�h
		errStruct.setl_USER_CD(CsvInCheck.replaceSlash(target_struct.getl_USER_CD()));
		errStruct.seto_USER_CD(target_struct.getl_USER_CD());
		// �G���[���ږ�
		errStruct.setl_ERR_CTR_NM(fieldName);
		// �G���[���e
		errStruct.setl_ERR_INFO(strMessage);
		// list��ǉ�
		list.add(errStruct);
	}
	
	/**
	 * CSV�t�F�C�����e�`�F�b�N
	 * @param csvList
	 * @return
	 * @throws BusinessProcessException
	 * @throws FoundationException
	 * @throws SQLException 
	 */
	private boolean checkCsvData(List csvList)
			throws BusinessProcessException, FoundationException {
		// �����ꍀ�ڎ擾�Ή�
		String locale = CoreTools.getLocale(sysUSER_CD);
		String property = "OrteusUserDic";
	    ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
	    
	    boolean break_flg = false;

	    // ���ډߕs��
	 	String strCsvColCom = CoreTools.getRBString("Expj.Cmt3099", resource);
	 	
	 	// �G���[�t���O������
	 	boolean checkFlag = true;
	 	
		AA0200010Struct csvStruct = new AA0200010Struct();
		AA0200010Struct tempStruct = null;

		try {
			for (int i = 0; i < csvList.size(); i++) {
				
				// �S�����R�[�h��
				_intTotalCount++;
				break_flg = false;
				csvStruct = (AA0200010Struct)csvList.get(i);
				csvStruct.setl_COMPANY_CD(getCompanyCd());
				// �o�^�X�V�`�F�b�N
				if ("true".equals(_strRdoInsert) || "true".equals(_strRdoUpdate)) {
					// CSV�t�@�C���̍��ڐ��`�F�b�N���s��
					if (!CsvInCheck.isNull(csvStruct.getw_COLUMN_FLG())) {
						if (Calculate.compare(String.valueOf(CSV_NECESSARY_COLUMN),
								csvStruct.getw_COLUMN_FLG().toString()) > 0) {
							// ���ڂɕs��������ꍇ
							_emsg = new ExpjMessage("AA01500", csvStruct.getw_COLUMN_FLG());
						} else if (Calculate.compare(String.valueOf(CSV_NECESSARY_COLUMN), 
								csvStruct.getw_COLUMN_FLG().toString()) < 0) {
							// ���ڂ��K�v���ȏ�̏ꍇ
							_emsg = new ExpjMessage("AA01519", csvStruct.getw_COLUMN_FLG());
						}
						csvExport(
								String.valueOf(i + 1),
								CSV_COLNO_99,
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strCsvColCom,
								_emsg.getMessage(locale));
						_intErrorCount++;
						continue;
					}
				}
				// ���p�҃R�[�h��NULL�̏ꍇ
				String strUserCd = CoreTools.getRBString("Expj.AR_USER_CD",	resource);
				//�o�^���̂�
				if ("true".equals(_strRdoInsert)){					
					if (CsvInCheck.isNull(csvStruct.getl_USER_CD())) {
						_emsg = new ExpjMessage("AA01530", strUserCd);
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_USER_CD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strUserCd,
								_emsg.getMessage(locale));
						_intErrorCount ++;
						continue;
					}
					// ����26���ȏ�̏ꍇ
					if (CsvInCheck.strLengthChk(csvStruct.getl_USER_CD()) >= 26) {
						_emsg = new ExpjMessage("AA01501");
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_USER_CD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strUserCd,
								_emsg.getMessage(locale));
						_intErrorCount ++;
						continue;
					}
					// �֑����������͂���Ă����ꍇ
					if (CsvInCheck.chkHankaku(csvStruct.getl_USER_CD())) {
						_emsg = new ExpjMessage("AA01524");
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_USER_CD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strUserCd,
								_emsg.getMessage(locale));
						_intErrorCount ++;
						continue;
					}
				}
				// �o�^�X�V�`�F�b�N
				if ("true".equals(_strRdoInsert) || "true".equals(_strRdoUpdate)) {
					//���p�Җ�
					String strUserName = CoreTools.getRBString("Expj.AR_USER_NAME",	resource);
					//NULL�̏ꍇ
					if (CsvInCheck.isNull(csvStruct.getl_USER_NAME())) {
						_emsg = new ExpjMessage("AA01530", strUserName);
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_USER_NAME + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strUserName,
								_emsg.getMessage(locale));
						_intErrorCount ++;
						continue;
					}
					// ����41���ȏ�̏ꍇ
					if (CsvInCheck.strLengthChk(csvStruct.getl_USER_NAME()) >= 41) {
						_emsg = new ExpjMessage("AA01501");
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_USER_NAME + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strUserName,
								_emsg.getMessage(locale));
						_intErrorCount ++;
						continue;
					}
					// �֑����������͂���Ă����ꍇ
					if (CsvInCheck.chkHankaku(csvStruct.getl_USER_NAME())) {
						_emsg = new ExpjMessage("AA01524");
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_USER_NAME + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strUserName,
								_emsg.getMessage(locale));
						_intErrorCount ++;
						continue;
					}
					//�p�X���[�h
					String strPassword = CoreTools.getRBString("Expj.PASSWORD",	resource);
					//NULL�̏ꍇ
					if (CsvInCheck.isNull(csvStruct.getl_PASSWORD())) {
						_emsg = new ExpjMessage("AA01530", strPassword);
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_PASSWORD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strPassword,
								_emsg.getMessage(locale));
						_intErrorCount ++;
						continue;
					}
					// ����41���ȏ�̏ꍇ
					if (CsvInCheck.strLengthChk(csvStruct.getl_PASSWORD()) >= 41) {
						_emsg = new ExpjMessage("AA01501");
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_PASSWORD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strPassword,
								_emsg.getMessage(locale));
						_intErrorCount ++;
						continue;
					}
					// �֑����������͂���Ă����ꍇ
					if (CsvInCheck.chkHankaku(csvStruct.getl_PASSWORD())) {
						_emsg = new ExpjMessage("AA01524");
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_PASSWORD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strPassword,
								_emsg.getMessage(locale));
						_intErrorCount ++;
						continue;
					}	
					//�w�肳�ꂽ�p�X���[�h�ƃ��[�U�R�[�h�������ꍇ
					if(csvStruct.getl_PASSWORD().equals(csvStruct.getl_USER_CD())){
						_emsg = new ExpjMessage("AA00206");
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_PASSWORD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strPassword,
								_emsg.getMessage(locale));
						_intErrorCount ++;
						continue;
					}
					//�V�p�X���[�h�i�Í����O�j�̌������@�V�X�e���p�����[�^�u�p�X���[�h�ŏ������iPSW_MIN_LENGTH�j�v�̒l��菭�Ȃ��ꍇ
					Map chkMap = UserPassWordInputRule.compareMinLength(conn, csvStruct.getl_PASSWORD());
					if("false".equals(String.valueOf(chkMap.get("2")))) {
						_emsg = new ExpjMessage("AA00207", String.valueOf(chkMap.get("1")));
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_PASSWORD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strPassword,
								_emsg.getMessage(locale));
						_intErrorCount ++;
						continue;
					}
					//�V�X�e���p�����[�^�u�p�X���[�h�K���iPSW_RULE�j�v�̒l���u1�v�i�p�������܂ށj�̂Ƃ��A�V�p�X���[�h���p�X���[�h�Ɂia-z�܂���A-Z�j�A0-9�̗������܂܂�Ă��Ȃ��ꍇ
					if(!UserPassWordInputRule.checkWordRule(conn, csvStruct.getl_PASSWORD())) {
						_emsg = new ExpjMessage("AA00208");
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_PASSWORD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strPassword,
								_emsg.getMessage(locale));
						_intErrorCount ++;
						continue;
					}
									
					// �H�꺰��
					String strPlantCd = CoreTools.getRBString("Expj.PLANT_CD",	resource);
					//NULL�̏ꍇ
					if (CsvInCheck.isNull(csvStruct.getl_PLANT_CD())) {
						_emsg = new ExpjMessage("AA01530", strPlantCd);
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_PLANT_CD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strPlantCd,
								_emsg.getMessage(locale));
						_intErrorCount ++;
						continue;
					}
					// ����3���ȏ�̏ꍇ
					if (CsvInCheck.strLengthChk(csvStruct.getl_PLANT_CD()) >= 3) {
						_emsg = new ExpjMessage("AA01501");
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_PLANT_CD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strPlantCd,
								_emsg.getMessage(locale));
						_intErrorCount ++;
						continue;
					}
					// �֑����������͂���Ă����ꍇ
					if (CsvInCheck.chkHankaku(csvStruct.getl_PLANT_CD())) {
						_emsg = new ExpjMessage("AA01524");
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_PLANT_CD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strPlantCd,
								_emsg.getMessage(locale));
						_intErrorCount ++;
						continue;
					}
					//����R�[�h
					String strOrgCd = CoreTools.getRBString("Expj.ORG_CD",	resource);
					if(!CsvInCheck.isNull(csvStruct.getl_SECTION_CD())){
						// ����26���ȏ�̏ꍇ
						if (CsvInCheck.strLengthChk(csvStruct.getl_SECTION_CD()) >= 26) {
							_emsg = new ExpjMessage("AA01501");
							csvExport(String.valueOf(i + 1),
									String.valueOf(CSV_SECTION_CD + 1),
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									csvStruct,
									strOrgCd,
									_emsg.getMessage(locale));
							_intErrorCount ++;
							continue;
						}
						// �֑����������͂���Ă����ꍇ
						if (CsvInCheck.chkHankaku(csvStruct.getl_SECTION_CD())) {
							_emsg = new ExpjMessage("AA01524");
							csvExport(String.valueOf(i + 1),
									String.valueOf(CSV_SECTION_CD + 1),
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									csvStruct,
									strOrgCd,
									_emsg.getMessage(locale));
							_intErrorCount ++;
							continue;
						}		
					}
					//���[���A�h���X
					String strEmail = CoreTools.getRBString("Expj.EMAIL",	resource);
					if(!CsvInCheck.isNull(csvStruct.getl_ADDRESS())){
						// ����41���ȏ�̏ꍇ
						if (CsvInCheck.strLengthChk(csvStruct.getl_ADDRESS()) >= 41) {
							_emsg = new ExpjMessage("AA01501");
							csvExport(String.valueOf(i + 1),
									String.valueOf(CSV_ADDRESS + 1),
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									csvStruct,
									strEmail,
									_emsg.getMessage(locale));
							_intErrorCount ++;
							continue;
						}
						//���[���A�h���X�ɓ��͂�����ꍇ�A�`�����s���̏ꍇ
						if (CsvInCheck.chkEmail(csvStruct.getl_ADDRESS())) {
							_emsg = new ExpjMessage("AA00109");
							csvExport(String.valueOf(i + 1),
									String.valueOf(CSV_ADDRESS + 1),
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									csvStruct,
									strEmail,
									_emsg.getMessage(locale));
							_intErrorCount ++;
							continue;
						}
					}
					// ������
					String strLocale = CoreTools.getRBString("Expj.LOCALE",	resource);
					//�R���{�{�b�N�X����
					//�R���{�{�b�N�X�p�f�[�^�擾
					StringTokenizer std;
					int losize = 0;
					String loca = null;
					String[]  lolist = null;
					boolean locale_flg = false;
					if (csvStruct.getl_LOCALE() != null){
						while(losize < LOCALE_TYP.size()){
							lolist = LOCALE_TYP.getData(losize);
							std = new StringTokenizer(lolist[1],":");
							loca = std.nextToken();
							if(csvStruct.getl_LOCALE().equals(loca)){
								locale_flg = true;
								break;
							}
							losize++;
						}
					}					
					if (!locale_flg) {
						_emsg = new ExpjMessage("AA01504");
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_LOCALE + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strLocale,
								_emsg.getMessage(locale));
						_intErrorCount++;
						continue;
					}
					//���F����					
					String strApprPowerTyp = CoreTools.getRBString("Expj.Cmt3161",	resource);					
					//�����ȊO�̏ꍇ
					if (!CsvInCheck.isIntegerChk(csvStruct.getl_APPR_POWER_TYP())) {
						_emsg = new ExpjMessage("AA01502");
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_APPR_POWER_TYP + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strApprPowerTyp,
								_emsg.getMessage(locale));
						_intErrorCount ++;
						continue;
					}
					//�R���{�{�b�N�X����
					if (!CsvInCheck.chkValue(APPR_POWER_TYP, csvStruct.getl_APPR_POWER_TYP())) {
						_emsg = new ExpjMessage("AA01504");
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_APPR_POWER_TYP + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strApprPowerTyp,
								_emsg.getMessage(locale));
						_intErrorCount++;
						continue;
					}
					//��������R�[�h
					String strBelongGroupCd = CoreTools.getRBString("Expj.Cmt5435",	resource);					
					//NULL�̏ꍇ
					if("1".equals(csvStruct.getw_BELONG_FLG())){
						if (CsvInCheck.isNull(csvStruct.getl_BELONG_GROUP_CD())) {
							_emsg = new ExpjMessage("AA01530", strPlantCd);
							csvExport(String.valueOf(i + 1),
									String.valueOf(CSV_BELONG_GROUP_CD + 1),
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									csvStruct,
									strBelongGroupCd,
									_emsg.getMessage(locale));
							_intErrorCount ++;
							continue;
						}
					}
					if (!CsvInCheck.isNull(csvStruct.getl_BELONG_GROUP_CD())) {						
						// ����11���ȏ�̏ꍇ
						if (CsvInCheck.strLengthChk(csvStruct.getl_BELONG_GROUP_CD()) >= 11) {
							_emsg = new ExpjMessage("AA01501");
							csvExport(String.valueOf(i + 1),
									String.valueOf(CSV_BELONG_GROUP_CD + 1),
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									csvStruct,
									strBelongGroupCd,
									_emsg.getMessage(locale));
							_intErrorCount ++;
							continue;
						}
						// �֑����������͂���Ă����ꍇ
						if (CsvInCheck.chkHankaku(csvStruct.getl_BELONG_GROUP_CD())) {
							_emsg = new ExpjMessage("AA01524");
							csvExport(String.valueOf(i + 1),
									String.valueOf(CSV_BELONG_GROUP_CD + 1),
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									csvStruct,
									strBelongGroupCd,
									_emsg.getMessage(locale));
							_intErrorCount ++;
							continue;
						}	
					}
					//��������R�[�h��NULL�ȊO�@���@�����t���O��0�A1�ȊO�̏ꍇ
					String strBelongFlg = CoreTools.getRBString("Expj.BELONG_FLG",	resource);
					if(!CsvInCheck.isNull(csvStruct.getl_BELONG_GROUP_CD())){
						if(!"0".equals(csvStruct.getw_BELONG_FLG()) && !"1".equals(csvStruct.getw_BELONG_FLG())){
							_emsg = new ExpjMessage("AA34130");
							csvExport(String.valueOf(i + 1),
									String.valueOf(CSV_BELONG_FLG + 1),
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									csvStruct,
									strBelongFlg,
									_emsg.getMessage(locale));
							_intErrorCount ++;
							continue;
						}
					}
					if ("true".equals(_strRdoInsert)){
						//����L�[��CSV���ŏd�����Ă���ꍇ
						checkFlag = true;
						for (int j = 0; j < csvList.size(); j++) {
	    					tempStruct = (AA0200010Struct) csvList.get(j);
	    					if (csvStruct.getl_USER_CD().equals(tempStruct.getl_USER_CD())
	    							&& getString(csvStruct.getl_BELONG_GROUP_CD()).equals(getString(tempStruct.getl_BELONG_GROUP_CD()))) {
	    						if(j!=i){
	    							_emsg = new ExpjMessage("AA34134", String.valueOf(j+1));
	    							csvExport(
	    									String.valueOf(i + 1),
	    									CSV_COLNO_99,
	    									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
	    									csvStruct,
	    									strUserCd,
	    									_emsg.getMessage(locale));
	    							checkFlag = false;
	    						}
	    					}
	    				}
	    				if(!checkFlag){
	    					_intErrorCount++;
	    					continue;
	    				}
					}
					//�R���{�{�b�N�X����(�e���ڃ`�F�b�N�̏��Ɉړ�����)
					//�Ɩ��`�F�b�N
					//���O�C�����[�U�̏�����ЃR�[�h��[CSV���].�h�H��R�[�h�h �� [�H��] �ɑ��݂��Ȃ��ꍇ
					if(!entity.mcheckM_PLANT.check(conn, csvStruct)){
						_emsg = new ExpjMessage("AA01012");
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_PLANT_CD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strPlantCd,
								_emsg.getMessage(locale));
						_intErrorCount++;
						continue;
					}
					//���O�C�����[�U�̏�����ЃR�[�h�Ɓ@[CSV���].�h����R�[�h�h �� [����] �ɑ��݂��Ȃ��ꍇ
					if(!CsvInCheck.isNull(csvStruct.getl_SECTION_CD())){
						if(!entity.mcheckM_ORG.check(conn, csvStruct)){
							_emsg = new ExpjMessage("AA20054");
							csvExport(String.valueOf(i + 1),
									String.valueOf(CSV_SECTION_CD + 1),
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									csvStruct,
									strOrgCd,
									_emsg.getMessage(locale));
							_intErrorCount++;
							continue;
						}
					}
					//�ȉ��̏�����[��ЕʋƖ��O���[�v]���������A���݂��Ȃ��ꍇ
					//[��ЕʋƖ��O���[�v].�h��ЃR�[�h�h�@���@���O�C�����[�U�̏�����ЃR�[�h
					//[�Ɩ��O���[�v�}�X�^].�h�Ɩ��O���[�v�R�[�h�h�@�� [��ЕʋƖ��O���[�v].�h�Ɩ��O���[�v�R�[�h�h
					//[��ЕʋƖ��O���[�v].�h�Ɩ��O���[�v�R�[�h�h �� [CSV���]�D�g��������R�[�h�h
					if(!CsvInCheck.isNull(csvStruct.getl_BELONG_GROUP_CD())){
						if(!entity.mcheckCOMPANY_BUSINESS_GROUP.check(conn, csvStruct)){
							_emsg = new ExpjMessage("AA34131");
							csvExport(String.valueOf(i + 1),
									String.valueOf(CSV_BELONG_GROUP_CD + 1),
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									csvStruct,
									strBelongGroupCd,
									_emsg.getMessage(locale));
							_intErrorCount++;
							continue;
						}					
						//[CSV���]�D�g��������R�[�h�h��[�p�����[�^]����擾������\���Ɩ��O���[�v�R�[�h�ɑ��݂���ꍇ
						for(int j = 0; j < _listNotBusinessGroupCD.size(); j++){
							String strBusinessGroupCD = (String)_listNotBusinessGroupCD.get(j);
							if(strBusinessGroupCD.equals(csvStruct.getl_BELONG_GROUP_CD()))
							{
								_emsg = new ExpjMessage("AA34126");
								csvExport(String.valueOf(i + 1),
										String.valueOf(CSV_BELONG_GROUP_CD + 1),
										String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
										csvStruct,
										strBelongGroupCd,
										_emsg.getMessage(locale));
								_intErrorCount++;
								break_flg = true;
								break;
							}
						}
						if(break_flg){
							continue;
						}
					}					
	                if ("true".equals(_strRdoInsert)){
	                	//[CSV���]�D�g���p�҃R�[�h�h �����ł� [���[�U�}�X�^] �ɑ��݂��� ���@�ȉ��̏�����[�����}�X�^]���������A���݂����ꍇ
		                //�i�X�V�Ώۃ��R�[�h�͏����j
	                	if(entity.mcheckUSER_MST.check(conn, csvStruct)){
							_emsg = new ExpjMessage("ZZ01102");
							csvExport(String.valueOf(i + 1),
									CSV_COLNO_99,
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									csvStruct,
									strUserCd,
									_emsg.getMessage(locale));
							_intErrorCount++;
							continue;
	                	}
	                	if(!CsvInCheck.isNull(csvStruct.getl_BELONG_GROUP_CD()) && "1".equals(csvStruct.getw_BELONG_FLG())){
	                		if(entity.mcheckBELONG_MST.check(conn, csvStruct)){
								_emsg = new ExpjMessage("ZZ01102");
								csvExport(String.valueOf(i + 1),
										CSV_COLNO_99,
										String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
										csvStruct,
										strUserCd,
										_emsg.getMessage(locale));
								_intErrorCount++;
								continue;
		                	}
	                	}
	                }	                
	                //�X�V�̏ꍇ
	                if("true".equals(_strRdoUpdate)){
	                	//[CSV���]�D�g���p�҃R�[�h�h�����o�^�̏ꍇ
	                	if(!entity.mcheckUSER_MST.check(conn, csvStruct)){
							_emsg = new ExpjMessage("ZZ06001");
							csvExport(String.valueOf(i + 1),
									CSV_COLNO_99,
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									csvStruct,
									strUserCd,
									_emsg.getMessage(locale));
							_intErrorCount++;
							continue;
						}
	                }	                
				}
				// �폜�̏ꍇ
				if ("true".equalsIgnoreCase(_strRdoDelete)) {
				    //����L�[��CSV���ŏd�����Ă���ꍇ
					checkFlag = true;
					for (int j = 0; j < csvList.size(); j++) {
    					tempStruct = (AA0200010Struct) csvList.get(j);
    					if (csvStruct.getl_USER_CD().equals(tempStruct.getl_USER_CD())) {
    						if(j!=i){
    							_emsg = new ExpjMessage("AA34134", String.valueOf(j+1));
    							csvExport(
    									String.valueOf(i + 1),
    									CSV_COLNO_99,
    									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    									csvStruct,
    									strUserCd,
    									_emsg.getMessage(locale));
    							checkFlag = false;
    						}
    					}
    				}
    				if(!checkFlag){
    					_intErrorCount++;
    					continue;
    				}
					//�u���p�҃R�[�h�v �����o�^�̏ꍇ
					if(!entity.mcheckUSER_MST.check(conn, csvStruct)){
						_emsg = new ExpjMessage("ZZ06001");
						csvExport(String.valueOf(i + 1),
								CSV_COLNO_99,
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strUserCd,
								_emsg.getMessage(locale));
						_intErrorCount++;
						continue;
					}
					//�u���p�҃R�[�h�v��[���Ӑ�}�X�^]�́u���ВS���҃R�[�h�v�ɑ��݂����ꍇ
					if(entity.mcheckM_CUST.check(conn, csvStruct)){
						_emsg = new ExpjMessage("AA01017");
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_USER_CD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strUserCd,
								_emsg.getMessage(locale));
						_intErrorCount++;
						continue;
					}
					//�u���p�҃R�[�h�v��[���Ӑ�x�X]�́u���ВS���҃R�[�h�v�ɑ��݂����ꍇ
					if(entity.mcheckM_CUST_BRANCH.check(conn, csvStruct)){
						_emsg = new ExpjMessage("KA10004");
						csvExport(String.valueOf(i + 1),
								String.valueOf(CSV_USER_CD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								csvStruct,
								strUserCd,
								_emsg.getMessage(locale));
						_intErrorCount++;
						continue;
					}
				}
			}
			_intSuccessCount = _intTotalCount - _intErrorCount - _intWarningCount;
			if (_intErrorCount > 0) {
				return false;
			} else {
				return true;
			}
		} catch (Exception e) {
			ExpjMessage emsg = new ExpjMessage("AH00042", "0", "0");
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}
	}
	/** 
     * �b�r�u�o�̓f�[�^�ݒ菀��(�������O)
     *
     * @param target_struct �Ώۃf�[�^���
     * @param SyoriKbn      �����敪
     * @param DataKbn       �ύX�f�[�^�敪
     * @param bWrite        
     * @return �ُ�Ȃ� true �G���[ false
     */ 
    private boolean csvExportCorrection( AA0200010Struct target_struct , String SyoriKbn,
    		String DataKbn ,boolean bWrite)
    {
        // CSV�t�@�C���ҏW�p
        String csvStr = "";
        BufferedWriter outStream = null;

        try {
            // ��������
            csvStr = '"' + _strSysdate + '"' + "," ;
            // �������[�U�[�h�c
            csvStr = csvStr + '"' + getsysUSER_CD() + '"' + "," ;
            // �����敪
            csvStr = csvStr + '"' + SyoriKbn + '"' + "," ;
            // �ύX�f�[�^�敪
            csvStr = csvStr + '"' + DataKbn + '"' + "," ;
            // ���p�҃R�[�h
            csvStr = csvStr + '"' + getString(target_struct.getl_USER_CD()) + '"' + "," ;
            // ���p��
            csvStr = csvStr + '"' + getString(target_struct.getl_USER_NAME()) + '"' + "," ;
            // �p�X���[�h
            csvStr = csvStr + '"' + getString(target_struct.getl_PASSWORD()) + '"' + "," ;
            // �H��R�[�h
            csvStr = csvStr + '"' + getString(target_struct.getl_PLANT_CD()) + '"' + "," ;
            // ����R�[�h
            csvStr = csvStr + '"' + getString(target_struct.getl_SECTION_CD()) + '"' + "," ;
            //������
            csvStr = csvStr + '"' + getString(target_struct.getl_LOCALE()) + '"' + "," ;
            //���[���A�h���X
            csvStr = csvStr + '"' + getString(target_struct.getl_ADDRESS()) + '"' + "," ;
            //���F����
            csvStr = csvStr + '"' + getString(target_struct.getl_APPR_POWER_TYP()) + '"' + "," ;
            //��������R�[�h
            csvStr = csvStr + '"' + getString(target_struct.getl_BELONG_GROUP_CD()) + '"' + "," ;
            //�����t���O
            csvStr = csvStr + '"' + getString(target_struct.getw_BELONG_FLG()) + '"';
            
            if (bWrite) {
            	outStream = new BufferedWriter(new FileWriter(struct.getCANCEL_FILE(),true));
            } else {
            	outStream = new BufferedWriter(new FileWriter(struct.getCANCEL_FILE(),false));
            }
            // �t�@�C���ɏ���
            outStream.write(csvStr);
            // ���s�R�[�h�t��
            outStream.newLine();
            // BufferedWriter�N���[�Y
            outStream.close();
            // �����t���O�Z�b�g(true:����)
        	return true;
        }catch(Exception e){
            ExpjMessage emsg = new ExpjMessage( "AH00042", "0", "0" );
            sysLog.severe(emsg, getsysUSER_CD());
            return false;
        }finally{
            if (outStream != null ) {
                try {
                    outStream.close();
                } catch (Exception e ) {
                    e.printStackTrace();
                }
              outStream = null;
             }
        }
    }
	/**
	 * CSV�t�F�C�����e�́A�o�^����
	 * @param csvList
	 * @return
	 * @throws FoundationException 
	 */
	private boolean csvDataToDb(List csvList) throws BusinessProcessException, FoundationException {
		int intCsvDataCount = 0; // �Ώۃf�[�^����
		boolean bWrite = false; // �����t�@�C��
		// ���O�o�͏��i�[�p
		String logMessage = "";
		AA0200010Struct structCsv = null;
		boolean bSuccess = false; // ���������t���O������
		boolean bDBUpdate = false; // DB�X�V���t���O������

		try {
			// �g�����U�N�V�����J�n
			conn.beginTransWeb();
			// DB�X�V���t���OON
			bDBUpdate = true;

			// �V�X�e�����t�擾
            beginTransaction();
			
			_strSysdate = struct.getsSysdate();

			// �f�[�^�����������J��Ԃ�
			intCsvDataCount = csvList.size();
			//  �e��ʂ̃��W�I�{�^����1:�o�^�̏ꍇ�̏���
			if ("true".equals(_strRdoInsert)) {
				for (int i = 0; i < intCsvDataCount; i++) {
					structCsv = (AA0200010Struct) csvList.get(i);
					AA0200010Struct csvExportStruct = new AA0200010Struct();
					csvExportStruct.setl_USER_CD(structCsv.getl_USER_CD()) ;
					csvExportStruct.setl_USER_NAME(structCsv.getl_USER_NAME()) ;
					csvExportStruct.setl_PASSWORD(structCsv.getl_PASSWORD()) ;
					csvExportStruct.setl_PLANT_CD(structCsv.getl_PLANT_CD()) ;
					csvExportStruct.setl_SECTION_CD(structCsv.getl_SECTION_CD()) ;
					csvExportStruct.setl_LOCALE(structCsv.getl_LOCALE()) ;
					csvExportStruct.setl_ADDRESS(structCsv.getl_ADDRESS()) ;
					csvExportStruct.setl_APPR_POWER_TYP(structCsv.getl_APPR_POWER_TYP());
					csvExportStruct.setl_BELONG_GROUP_CD(structCsv.getl_BELONG_GROUP_CD()) ;
					csvExportStruct.setw_BELONG_FLG(structCsv.getw_BELONG_FLG()) ;
					// �Ɩ��^�p����ǂ�
					String businessDate = readBUSINESS_OPR_DATE(structCsv.getl_PLANT_CD());
					structCsv.setl_PASSWORD_CHG_DATE(businessDate);
					structCsv.setsUser_ID(sysUSER_CD);	
					structCsv.setl_PASSWORD(XafTools.getCryptString(structCsv.getl_PASSWORD()));					
					// �����ɓo�^���Ȃ��ꍇ�A[���p�ҏ��]��o�^����
					if (!entity.mcheckUSER_MST.check(conn, structCsv)) {
						entity.minsertUSER_MST.create(conn, structCsv);
					}
					//�����t���O��1�̏ꍇ�A�����}�X�^�ɓo�^
					if("1".equals(structCsv.getw_BELONG_FLG())){
						entity.minsertBELONG_MST.create(conn, structCsv);
					}
					// ����CSV�o�͏���(����:�Ώۃf�[�^�A���[�U�[ID�A�����敪�A�ύX�f�[�^�敪)
					csvExportCorrection(csvExportStruct, "1", "2", bWrite);
					bWrite = true;
				}
			}
			// �e��ʂ̃��W�I�{�^����2:�ύX�̏ꍇ�̏���
			if ("true".equals(_strRdoUpdate)) {
				for (int i = 0; i < intCsvDataCount; i++) {
					structCsv = (AA0200010Struct) csvList.get(i);	
					AA0200010Struct csvExportStruct = new AA0200010Struct();
					csvExportStruct.setl_USER_CD(structCsv.getl_USER_CD()) ;
					csvExportStruct.setl_USER_NAME(structCsv.getl_USER_NAME()) ;
					csvExportStruct.setl_PASSWORD(structCsv.getl_PASSWORD()) ;
					csvExportStruct.setl_PLANT_CD(structCsv.getl_PLANT_CD()) ;
					csvExportStruct.setl_SECTION_CD(structCsv.getl_SECTION_CD()) ;
					csvExportStruct.setl_LOCALE(structCsv.getl_LOCALE()) ;
					csvExportStruct.setl_ADDRESS(structCsv.getl_ADDRESS()) ;
					csvExportStruct.setl_APPR_POWER_TYP(structCsv.getl_APPR_POWER_TYP());
					csvExportStruct.setl_BELONG_GROUP_CD(structCsv.getl_BELONG_GROUP_CD()) ;
					csvExportStruct.setw_BELONG_FLG(structCsv.getw_BELONG_FLG()) ;
					// [���p�ҏ��]�擾
					List mSourceList = entity.mselectUSER_MST.read(conn, structCsv);
					if (!mSourceList.isEmpty()) {
						AA0200010Struct target_struct = (AA0200010Struct)mSourceList.get(0);
						AA0200010Struct belongStruct = new AA0200010Struct();
						
						belongStruct.setl_USER_CD(structCsv.getl_USER_CD());
						belongStruct.setl_BELONG_GROUP_CD(structCsv.getl_BELONG_GROUP_CD());
						List mBlongList = entity.mselectBELONG_MST.read(conn, belongStruct);
						if(!mBlongList.isEmpty()){
							target_struct.setw_BELONG_FLG("1");
						}else{
							target_struct.setw_BELONG_FLG("0");
						}
						target_struct.setl_BELONG_GROUP_CD(structCsv.getl_BELONG_GROUP_CD());
						//�p�X���[�h�̐ݒ�
						target_struct.setl_PASSWORD("********************************");
						// ����CSV�o�͏���(����:�Ώۍs�A�Ώۃf�[�^�A���[�U�[ID�A�����敪�A�f�[�^�敪)
						csvExportCorrection(target_struct, "2", "1", bWrite);
						bWrite = true;
					}
					// �Ɩ��^�p����ǂ�
					String businessDate = readBUSINESS_OPR_DATE(structCsv.getl_PLANT_CD());
					structCsv.setl_PASSWORD_CHG_DATE(businessDate);
					structCsv.setsUser_ID(sysUSER_CD);			
					structCsv.setl_PASSWORD(XafTools.getCryptString(structCsv.getl_PASSWORD()));
					// [���p�ҏ��]�̍X�V
					entity.mupdateUSER_MST.update(conn, structCsv);
					if("0".equals(structCsv.getw_BELONG_FLG()) && entity.mcheckBELONG_MST.check(conn, structCsv)){
						//[�����}�X�^]�폜
						entity.mdeleteBELONG_MST.delete(conn, structCsv);
					}
					if("1".equals(structCsv.getw_BELONG_FLG()) && !entity.mcheckBELONG_MST.check(conn, structCsv)){
						//[�����}�X�^]�V�K
						entity.minsertBELONG_MST.create(conn, structCsv);
					}
					// ����CSV�o�͏���(����:�Ώۃf�[�^�A���[�U�[ID�A�����敪�A�ύX�f�[�^�敪)
					csvExportCorrection(csvExportStruct, "2", "2", bWrite);
					bWrite = true;
				}
			}
			// �e��ʂ̃��W�I�{�^����3:�폜�̏ꍇ�̏���
			if ("true".equals(_strRdoDelete)) {
				for (int i = 0; i < intCsvDataCount; i++) {
					structCsv = (AA0200010Struct) csvList.get(i);					
					// [���p�ҏ��]�擾
					List mSourceList = entity.mselectUSER_MST.read(conn, structCsv);
					if (!mSourceList.isEmpty()) {
						AA0200010Struct target_struct = (AA0200010Struct)mSourceList.get(0);
						AA0200010Struct belongStruct = new AA0200010Struct();
						
						belongStruct.setl_USER_CD(structCsv.getl_USER_CD());
						belongStruct.setl_BELONG_GROUP_CD(structCsv.getl_BELONG_GROUP_CD());
						List mBlongList = entity.mselectBELONG_MST.read(conn, belongStruct);
						if(!mBlongList.isEmpty()){
							target_struct.setw_BELONG_FLG("1");
						}else{
							target_struct.setw_BELONG_FLG("0");
						}
						// ����CSV�o�͏���(����:�Ώۍs�A�Ώۃf�[�^�A���[�U�[ID�A�����敪�A�f�[�^�敪)
						target_struct.setl_BELONG_GROUP_CD(structCsv.getl_BELONG_GROUP_CD());
						//�p�X���[�h�̐ݒ�
						target_struct.setl_PASSWORD("********************************");
						csvExportCorrection(target_struct, "3", "1", bWrite);
						bWrite = true;
					}			
					// [�����}�X�^]�̍폜
					entity.mdeleteBELONG_MST.delete(conn, structCsv);
					//[���p�ҏ��]�̍폜
					entity.mdeleteUSER_MST.delete(conn, structCsv);
				}
			}
			conn.commit();
			
			// DB�X�V���t���OOFF
			bDBUpdate = false;

			// ���������t���O�ݒ�
			bSuccess = true;
		} catch (SQLException e) {
			logMessage = "USER_MST.USER_CD:" + structCsv.getl_USER_CD();
			ExpjMessage emsg = new ExpjMessage("ZZ01006", logMessage);
			sysLog.severe(emsg, getsysUSER_CD());
			setSqlExceptionMsg(e);
		} finally {
			// DB�X�V�������ɉ��炩�̃G���[�����������ꍇ��roolback�������Ȃ�
			if (bDBUpdate == true) {
				// ���[���o�b�N
				conn.rollback();
				logMessage = "Control�FcsvDataToDb - rollback!! ";
				setSyslogConfig(logMessage);
				// �X�V���s�̃��b�Z�[�W�\��
				ExpjMessage emsg = new ExpjMessage("AH00042", "" + intCsvDataCount, "0", "0");
				msgStruct.addError(emsg);
				sysLog.warning(emsg, getsysUSER_CD());
			}
		}
		return bSuccess;
	}
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * CSV�捞�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCsvImport() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0200");
		logger.entering("AA0200010Control"+":USER="+struct.getsUser_ID(),"controlCsvImport");
			//{{user_implement_dev:<controlCsvImport>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		setList(null);
		// �e��ʂ�struct��ޔ�
		_strRdoInsert = struct.getrdoInsert();
		_strRdoUpdate = struct.getrdoUpdate();
		_strRdoDelete = struct.getrdoDelete();
		_strDoChk = struct.getDO_CHK();
                //}}user_implement_dev:<controlCsvImport>
		logger.exiting("AA0200010Control"+":USER="+struct.getsUser_ID(),"controlCsvImport");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0200");
		logger.entering("AA0200010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		this.struct.clear();
		this.struct.setrdoInsert("true");
		this.struct.setrdoUpdate("false");
		this.struct.setrdoDelete("false");
		this.struct.setDO_CHK("false");

		setReadStatus(INITIAL);
                //}}user_implement_dev:<controlClear>
		logger.exiting("AA0200010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0200");
		logger.entering("AA0200010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		controlClear();
                //}}user_implement_dev:<controlClose>
		logger.exiting("AA0200010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * �Q�ƃ{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlBrowse() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0200");
		logger.entering("AA0200010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");
			//{{user_implement_dev:<controlBrowse>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlBrowse>
		logger.exiting("AA0200010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");

		return;
	}

	/**
	 * �捞�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCsvIn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0200");
		logger.entering("AA0200010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");
			//{{user_implement_dev:<controlCsvIn>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		// �S�����R�[�h��
		_intTotalCount = 0; 
		// �G���[���R�[�h����
		_intErrorCount = 0;  
		// ���탌�R�[�h����
		_intSuccessCount = 0;
		// ���[�j���O����
		_intWarningCount = 0;
		// ��ʕ\���p���X�g�N���A
		if (list == null) {
			list = new ArrayList();
		} else {
			list.clear();
		}
		
		// �b�r�u�f�[�^�擾
		List listCsv = null;
		listCsv = readCsvData();
		
		if (listCsv != null) {
			if (!"true".equals(this._strDoChk)) {
				if (!chkOutputFilePath()) {
					return;
				}
			}
			// CSV�f�[�^�`�F�b�N
			boolean checkFlg = checkCsvData(listCsv);
			// �u�`�F�b�N�̂ݍs���v�Ƀ`�F�b�N������ꍇ
			if ("true".equals(this._strDoChk)) {
				setInfoMessage("AA01517", String.valueOf(_intSuccessCount), String.valueOf(_intWarningCount), String.valueOf(_intErrorCount));
			} else {
				// �b�r�u���ڂ̃`�F�b�N�Ɛ������`�F�b�N�Ɠo�^�O�`�F�b�N���s��
				if (checkFlg) {
					// �o�^����
					if (csvDataToDb(listCsv)) {
						// �G���[�E���[�j���O���Ȃ��ꍇ
						if (_intWarningCount == 0) {
							setInfoMessage("AA01514", String.valueOf(_intSuccessCount));
						} else {
							// ���[�j���O����������ꍇ
							setWarningMessage("AA01515", String.valueOf(_intSuccessCount), String.valueOf(_intWarningCount));
						}
					}
				} else {
					// �G���[������ꍇ
					setErrorMessage("AA01516", String.valueOf(_intSuccessCount), String.valueOf(_intWarningCount), String.valueOf(_intErrorCount));
				}
			}
			
		}
            
                //}}user_implement_dev:<controlCsvIn>
		logger.exiting("AA0200010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");

		return;
	}

	/**
	 * CSV�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCSVOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0200");
		logger.entering("AA0200010Control"+":USER="+struct.getsUser_ID(),"controlCSVOut");
			//{{user_implement_dev:<controlCSVOut>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		// CSV�o�͕��i��ݒ�
		csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));
		AA0200010Struct errorStruct = null;
		List csv = new ArrayList();	// CSV���
		// CSV�w�b�_�s��CSV���ɒǉ�
		String[] title = {
				 "Expj.Cmt3094"					// �G���[�ӏ�
				,"Expj.Cmt3095"					// �G���[�敪
				,"Expj.AR_USER_CD"              // ���p�҃R�[�h
				,"Expj.Cmt3097"					// �G���[���ږ�
				,"Expj.Cmt3098"					// �G���[���e
				};

		csv.add(title);
		// [���].�ꗗ���̃G���[����CSV���ɒǉ�
		for (int i = 0; i < list.size(); i++) {
			errorStruct = (AA0200010Struct)list.get(i);
			String[] data = {
					 errorStruct.getl_ERROR_IN()
					,errorStruct.getl_ERR_TYP()
					,errorStruct.geto_USER_CD()
					,errorStruct.getl_ERR_CTR_NM()
					,errorStruct.getl_ERR_INFO()						
			};
			csv.add(data);
		}

		try {
			// CSV�t�@�C�����쐬
			csvWriter.write(csv, CoreTools.getLocale(struct.getsUser_ID()), true);
			// CSV�t�@�C�����N���C�A���g�ɏo��
			struct.setDOWNLOAD_FILE(getCsvWriter().getFilePath());
		}catch(Exception e) {
			// CSV�o�͎��s
			ExpjMessage emsg = new ExpjMessage("ZZ01107");
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		} 	
                //}}user_implement_dev:<controlCSVOut>
		logger.exiting("AA0200010Control"+":USER="+struct.getsUser_ID(),"controlCSVOut");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlreturn_sub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0200");
		logger.entering("AA0200010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub1");
			//{{user_implement_dev:<controlreturn_sub1>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		controlClear();
                //}}user_implement_dev:<controlreturn_sub1>
		logger.exiting("AA0200010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub1");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0200");
		logger.entering("AA0200010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AA0200010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0200");
		logger.entering("AA0200010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			// �e�[�u���p�Ɩ��O���[�v�f�[�^���X�g�̏�����
			if(_listNotBusinessGroupCD != null)
			{
				_listNotBusinessGroupCD.clear();
			}
			else
			{
				_listNotBusinessGroupCD = new ArrayList(0);
			}

			// ��ЃR�[�h�擾
			List tempList = entity.mselectCOMPANY_CD.read(conn, struct);
			if (tempList.size() > 0) {
				_strCompany_cd = ((AA0200010Struct) tempList.get(0)).getl_COMPANY_CD();
			}
						
			// �R���{�{�b�N�X�f�[�^���擾
			ComboBox cb = new ComboBox(conn, sysUSER_CD);

			// �G���[��ԋ敪���Z�b�g
			_COM_ERR_TYP = cb.getData("ERR_TYP");

			// ���F����
			APPR_POWER_TYP = cb.getData("APPR_POWER_TYP");

			// ������
			LOCALE_TYP = cb.getData("LOCALE");
			
			// ��\���Ɩ��O���[�v���擾
			PrivateConfig privateConfig = new PrivateConfig(conn);
			_listNotBusinessGroupCD = privateConfig.getStrings(_DISABLE_BUSINESS_GROUP_ACCESS_KEY);

		} catch(SQLException e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			throw ee;
		} catch(ExpjException e) {
			throw e;
		} catch(Exception e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			throw ee;
		} 
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AA0200010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0200");
		logger.entering("AA0200010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
		logger.exiting("AA0200010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("CsvImport") ) {
				controlCsvImport();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("Browse") ) {
				controlBrowse();
			} else if( button.equals("CsvIn") ) {
				controlCsvIn();
			} else if( button.equals("CSVOut") ) {
				controlCSVOut();
			} else if( button.equals("return_sub1") ) {
				controlreturn_sub1();
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
//			throw new FoundationException("AA0200010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0200010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AA0200010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0200010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AA0200010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0200010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AA0200010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AA0200010Entity entity;
	protected AA0200010Struct struct;
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

		entity = new AA0200010Entity();
		struct = new AA0200010Struct();

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
	 * AA0200010�N���X�̕W���R���X�g���N�^
	 */
	public AA0200010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
			// TODO: �����ɏ����������L�q���Ă�������
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
				AA0200010Struct key = (AA0200010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("rdoInsert") && key.getrdoInsert() != null) {
					msgKey.setKeyValue("rdoInsert", key.getrdoInsert());
				}
				if(msgKeyType.containsKeyColumn("rdoUpdate") && key.getrdoUpdate() != null) {
					msgKey.setKeyValue("rdoUpdate", key.getrdoUpdate());
				}
				if(msgKeyType.containsKeyColumn("rdoDelete") && key.getrdoDelete() != null) {
					msgKey.setKeyValue("rdoDelete", key.getrdoDelete());
				}
				if(msgKeyType.containsKeyColumn("DO_CHK") && key.getDO_CHK() != null) {
					msgKey.setKeyValue("DO_CHK", key.getDO_CHK());
				}
				if(msgKeyType.containsKeyColumn("FileName") && key.getFileName() != null) {
					msgKey.setKeyValue("FileName", key.getFileName());
				}
				if(msgKeyType.containsKeyColumn("CANCEL_FILE") && key.getCANCEL_FILE() != null) {
					msgKey.setKeyValue("CANCEL_FILE", key.getCANCEL_FILE());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("l_ERROR_IN") && key.getl_ERROR_IN() != null) {
					msgKey.setKeyValue("l_ERROR_IN", key.getl_ERROR_IN());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_TYP") && key.getl_ERR_TYP() != null) {
					msgKey.setKeyValue("l_ERR_TYP", key.getl_ERR_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_CTR_NM") && key.getl_ERR_CTR_NM() != null) {
					msgKey.setKeyValue("l_ERR_CTR_NM", key.getl_ERR_CTR_NM());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_INFO") && key.getl_ERR_INFO() != null) {
					msgKey.setKeyValue("l_ERR_INFO", key.getl_ERR_INFO());
				}
				if(msgKeyType.containsKeyColumn("w_COLUMN_FLG") && key.getw_COLUMN_FLG() != null) {
					msgKey.setKeyValue("w_COLUMN_FLG", key.getw_COLUMN_FLG());
				}
				if(msgKeyType.containsKeyColumn("w_BELONG_FLG") && key.getw_BELONG_FLG() != null) {
					msgKey.setKeyValue("w_BELONG_FLG", key.getw_BELONG_FLG());
				}
				if(msgKeyType.containsKeyColumn("o_USER_CD") && key.geto_USER_CD() != null) {
					msgKey.setKeyValue("o_USER_CD", key.geto_USER_CD());
				}
				if(msgKeyType.containsKeyColumn("l_USER_CD") && key.getl_USER_CD() != null) {
					msgKey.setKeyValue("l_USER_CD", key.getl_USER_CD());
				}
				if(msgKeyType.containsKeyColumn("l_USER_NAME") && key.getl_USER_NAME() != null) {
					msgKey.setKeyValue("l_USER_NAME", key.getl_USER_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_PASSWORD") && key.getl_PASSWORD() != null) {
					msgKey.setKeyValue("l_PASSWORD", key.getl_PASSWORD());
				}
				if(msgKeyType.containsKeyColumn("l_COMPANY_CD") && key.getl_COMPANY_CD() != null) {
					msgKey.setKeyValue("l_COMPANY_CD", key.getl_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("l_PLANT_CD") && key.getl_PLANT_CD() != null) {
					msgKey.setKeyValue("l_PLANT_CD", key.getl_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_SECTION_CD") && key.getl_SECTION_CD() != null) {
					msgKey.setKeyValue("l_SECTION_CD", key.getl_SECTION_CD());
				}
				if(msgKeyType.containsKeyColumn("l_LOCALE") && key.getl_LOCALE() != null) {
					msgKey.setKeyValue("l_LOCALE", key.getl_LOCALE());
				}
				if(msgKeyType.containsKeyColumn("l_ADDRESS") && key.getl_ADDRESS() != null) {
					msgKey.setKeyValue("l_ADDRESS", key.getl_ADDRESS());
				}
				if(msgKeyType.containsKeyColumn("l_APPR_POWER_TYP") && key.getl_APPR_POWER_TYP() != null) {
					msgKey.setKeyValue("l_APPR_POWER_TYP", key.getl_APPR_POWER_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_PASSWORD_CHG_DATE") && key.getl_PASSWORD_CHG_DATE() != null) {
					msgKey.setKeyValue("l_PASSWORD_CHG_DATE", key.getl_PASSWORD_CHG_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_BELONG_GROUP_CD") && key.getl_BELONG_GROUP_CD() != null) {
					msgKey.setKeyValue("l_BELONG_GROUP_CD", key.getl_BELONG_GROUP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_BUSINESS_OPR_DATE") && key.getl_BUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("l_BUSINESS_OPR_DATE", key.getl_BUSINESS_OPR_DATE());
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
					AA0200010Struct key = new AA0200010Struct();
					if(msgKeyType.containsKeyColumn("rdoInsert")) {
						key.setrdoInsert(msgKey.getKeyValue("rdoInsert"));
					}
					if(msgKeyType.containsKeyColumn("rdoUpdate")) {
						key.setrdoUpdate(msgKey.getKeyValue("rdoUpdate"));
					}
					if(msgKeyType.containsKeyColumn("rdoDelete")) {
						key.setrdoDelete(msgKey.getKeyValue("rdoDelete"));
					}
					if(msgKeyType.containsKeyColumn("DO_CHK")) {
						key.setDO_CHK(msgKey.getKeyValue("DO_CHK"));
					}
					if(msgKeyType.containsKeyColumn("FileName")) {
						key.setFileName(msgKey.getKeyValue("FileName"));
					}
					if(msgKeyType.containsKeyColumn("CANCEL_FILE")) {
						key.setCANCEL_FILE(msgKey.getKeyValue("CANCEL_FILE"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("l_ERROR_IN")) {
						key.setl_ERROR_IN(msgKey.getKeyValue("l_ERROR_IN"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_TYP")) {
						key.setl_ERR_TYP(msgKey.getKeyValue("l_ERR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_CTR_NM")) {
						key.setl_ERR_CTR_NM(msgKey.getKeyValue("l_ERR_CTR_NM"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_INFO")) {
						key.setl_ERR_INFO(msgKey.getKeyValue("l_ERR_INFO"));
					}
					if(msgKeyType.containsKeyColumn("w_COLUMN_FLG")) {
						key.setw_COLUMN_FLG(msgKey.getKeyValue("w_COLUMN_FLG"));
					}
					if(msgKeyType.containsKeyColumn("w_BELONG_FLG")) {
						key.setw_BELONG_FLG(msgKey.getKeyValue("w_BELONG_FLG"));
					}
					if(msgKeyType.containsKeyColumn("o_USER_CD")) {
						key.seto_USER_CD(msgKey.getKeyValue("o_USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_USER_CD")) {
						key.setl_USER_CD(msgKey.getKeyValue("l_USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_USER_NAME")) {
						key.setl_USER_NAME(msgKey.getKeyValue("l_USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_PASSWORD")) {
						key.setl_PASSWORD(msgKey.getKeyValue("l_PASSWORD"));
					}
					if(msgKeyType.containsKeyColumn("l_COMPANY_CD")) {
						key.setl_COMPANY_CD(msgKey.getKeyValue("l_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_PLANT_CD")) {
						key.setl_PLANT_CD(msgKey.getKeyValue("l_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_SECTION_CD")) {
						key.setl_SECTION_CD(msgKey.getKeyValue("l_SECTION_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_LOCALE")) {
						key.setl_LOCALE(msgKey.getKeyValue("l_LOCALE"));
					}
					if(msgKeyType.containsKeyColumn("l_ADDRESS")) {
						key.setl_ADDRESS(msgKey.getKeyValue("l_ADDRESS"));
					}
					if(msgKeyType.containsKeyColumn("l_APPR_POWER_TYP")) {
						key.setl_APPR_POWER_TYP(msgKey.getKeyValue("l_APPR_POWER_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_PASSWORD_CHG_DATE")) {
						key.setl_PASSWORD_CHG_DATE(msgKey.getKeyValue("l_PASSWORD_CHG_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_BELONG_GROUP_CD")) {
						key.setl_BELONG_GROUP_CD(msgKey.getKeyValue("l_BELONG_GROUP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_BUSINESS_OPR_DATE")) {
						key.setl_BUSINESS_OPR_DATE(msgKey.getKeyValue("l_BUSINESS_OPR_DATE"));
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
