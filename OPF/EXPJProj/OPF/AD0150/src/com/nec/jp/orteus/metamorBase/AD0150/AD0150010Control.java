/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0150/src/com/nec/jp/orteus/metamorBase/AD0150/AD0150010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0150;

import com.nec.jp.orteus.metamorBase.AD0150.*;
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
import java.text.DateFormat;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.math.BigDecimal;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlStruct;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import java.io.IOException;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AD0150010Control �N���X
 * 			�i�ڕʍ�ƌv��CSV�捞
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.5 $ $Date: 2016/05/23 08:03:49 $
 *
 */
//}}user_implement_code_header

public class AD0150010Control
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
	public AD0150010Struct getListvalue(int x) { return (AD0150010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AD0150010Struct getStruct() { return this.struct; }	// Struct�̒l��Ԃ��܂��B
	public AD0150010Struct createStruct() { return new AD0150010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AD0150010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
	public AD0150010Struct mItemStruct = new AD0150010Struct();
	public AD0150010Struct jobodrStruct = new AD0150010Struct();
	
	/**�S�����R�[�h��**/
	private int _intTotalCount = 0; 
	/**�G���[���R�[�h����**/
	private int _intErrorCount = 0;  
	/**���탌�R�[�h����**/
	private int _intSuccessCount = 0;
	/**���[�j���O����**/
	private int _intWarningCount = 0;
	
	private boolean warningFlg = false;
	/** �V�X�e�����O���b�Z�[�W�쐬�p */
	private StringBuffer _sysLogMessage;
	
	/** �b�r�u���ڔԍ���` */
	// �i�ڔԍ�
	private final int CSV_ITEM_CD = 0;
	// �����[��
	private final int CSV_WORK_ODR_DLV_DATE = 1;
	// ���������
	private final int CSV_OPR_INST_START_DATE = 2;
	// ��Ǝw����
	private final int CSV_OPR_INST_QTY = 3;
	// ��Ƌ�R�[�h
	private final int CSV_WS_CD = 4;
	// ����
	private final int CSV_JOB_ODR_CD = 5;
	// ���l
	private final int CSV_WORK_IN_PROC_COMMENT = 6;

	// �b�r�u�捞�f�[�^�K�v���ڐ�(���v)
	private final int CSV_NECESSARY_COLUMN = 7;
	
	// �G���[���b�Z�[�W
	private ExpjMessage _emsg = null;
	
	// �����Ǘ��p�t���O
	private String _flgTimeCtrl = null;
	
	/*���p�X�x�[�X*/
	private String _space = " ";
	
	// �i�ڕʐ����[���p
	String WORK_ODR_DLV_DATE_TIME = "0000";	
	//�i�ڕʐ���������p
	String OPR_INST_START_DATE_TIME = "0000";
	
	// �����ꍀ�ڎ擾�Ή�
	private String _locale = CoreTools.getLocale(sysUSER_CD);
	ResourceBundle _resource = CoreTools.getResourceBundle("OrteusUserDic", _locale);

	/** �Ɩ��^�p��*/
	private String _btmBusinessOprDate;
	
	// �R���{�{�b�N�X��`
	// �G���[��ԋ敪
	private ComboStruct _COM_ERR_TYP = null;
	
	/** ���t�����p */
	DateFormat _df = DateFormat.getDateInstance();
	
	/**
	 * ���O���b�Z�[�W�ݒ�
	 * @param �o�̓��b�Z�[�W
	 */
	private void setSyslogConfig(String message) {
		ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
		sysLog.config(emsg, getsysUSER_CD());
	}
	
	/**
	 * �Ɩ����W�b�N�̃G���[���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * @param list ���b�Z�[�W���X�g
	 */
	private void setErrorMessage(List list) {
		ExpjMessage emsg;
		if (list != null && !list.isEmpty() && list.size() > 0){
			for(int l = 0; l < list.size(); l++){
				emsg = new ExpjMessage((String)list.get(l));
				msgStruct.addError(emsg);
				sysLog.warning(emsg, getsysUSER_CD());
			}
		}
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
	 * �Ɩ����W�b�N�̃C���t�H���[�V�����ݒ菈����؂�o���Ċ֐���
	 * @param code
	 */
	private void setInfoMessage2(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addInfo(emsg);
		sysLog.info(emsg, sysUSER_CD);
	}
	
	/**
	 * �Ɩ����W�b�N�̃V�X�e�����O(�G���[)�ݒ菈����؂�o���Ċ֐���
	 * @param db1 �f�[�^�x�[�X���ڂP
	 * @param value1 �u��������P
	 */
	private void setWarningSysLogMessage(String db1, String value1) {
		_sysLogMessage = new StringBuffer();
		_sysLogMessage.append(db1);
		_sysLogMessage.append(":");
		_sysLogMessage.append(value1);
		ExpjMessage emsg 
				= new ExpjMessage("ZZ01006",_sysLogMessage.toString());
		sysLog.warning(emsg, getsysUSER_CD());
	}
	
	/**
	 * �Ɩ����W�b�N�̃��[�j���O���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * @param code ���b�Z�[�W�R�[�h
	 */
	private void setWarningMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addWarn(emsg);
		sysLog.info(emsg, getsysUSER_CD());
	}
	/**
	 * �Ɩ����W�b�N�̃��[�j���O���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * @param code ���b�Z�[�W�R�[�h
	 * @param value1 �u��������P
	 */
	private void setWarningMessage(String code, String value1) {
		ExpjMessage emsg = new ExpjMessage(code, value1);
		msgStruct.addWarn(emsg);
		sysLog.info(emsg, getsysUSER_CD());
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
	 * �Ώۂ̕�����Null�i�󕶎����邢��Null�j�ł��邩�𔻒肵�܂��B
	 * @param str �Ώە�����
	 * @return Null�̏ꍇ��true�ANull�ł͂Ȃ��ꍇ��false
	 */
	private boolean isNull(String str) {
		if (str == null || str.length() == 0 || str.equalsIgnoreCase("null")) {
			return true;
		}
		return false;
	}
	
	/**
	 * �R���{�{�b�N�X�f�[�^����\���������擾����
	 * 
	 * @param combo
	 *            �R���{�{�b�N�X�f�[�^
	 * @param value
	 *            �R���{�{�b�N�X�f�[�^�̒l
	 * @return �R���{�{�b�N�X�f�[�^�̕\������
	 */
	private String getDisplayName(ComboStruct combo, String value) {
		for (int j = 0; j < combo.size(); j++) {
			if ((combo.getData(j)[0]).equals(value)) {
				return combo.getData(j)[1];
			}
		}
		return null;
	}
	
	/**
	 * ����(\)�ϊ��A�u\�v�Ȃ�A�u\�v�𒼑O�ɒǉ�����
	 * 
	 * @param in   ������
	 * @return	 �ҏW�㕶����
	 */
	private String replaceSlashAdd(String in) {
		if (in == null)
			return null;
		StringBuffer buffer = new StringBuffer(in.length() * 2);
		for (int i = 0; i < in.length(); i++) {
			char c = in.charAt(i);
			if (c == '\\')
				buffer.append("\\\\");
			else
				buffer.append(c);
		}
		return buffer.toString();
	}
	
	/**
	 * �����񒷂��`�F�b�N
	 * 
	 * @param strInString
	 *			���̓p�����[�^
	 * @return ����:true / �G���[:false
	 */
	public int strLengthChk(String strInput) {
		int intLen = 0;
		try {
			byte[] bytstr = strInput.getBytes("SJIS");
			intLen = bytstr.length;
		} catch (Exception e) {
			return 0;
		}
		return intLen;
	}
	
	/**
	 * �֑������`�F�b�N(�u_�v�u%�v�u\�v)
	 * 
	 * @param str
	 *			������
	 * @return �u_�v: true �u%�v: true �u\�v: true ���̑�: false
	 */
	private boolean chkHankaku(String str) {
		CharacterIterator iter = new StringCharacterIterator(str);
		for (char c = iter.first(); c != CharacterIterator.DONE; c = iter.next()) {
			// �u%�v 0x0025
			if (c == 0x0025) {
				// �֑�����!
				return true;
			}
			// �u\�v 0x005C
			if (c == 0x005C) {
				// �֑�����!
				return true;
			}
			// �u_�v 0x005F
			if (c == 0x005F) {
				// �֑�����!
				return true;
			}
		}
		return false;
	}
	
	/*
	 * �����̃`�F�b�N
	 * 
	 * @param dataSource String
	 * 
	 * @return true or false boolean true�̏ꍇ�@�����ł��A�@false�̏ꍇ�A�����ł͂Ȃ�
	 */
	private boolean checkDate(String dataSource) {
		String flag = "";
		if (dataSource.matches("^^\\d{4}\\/\\d{2}\\/\\d{2}$")) {
			flag = "true";

		} else if (dataSource.matches("^^\\d{4}\\/\\d{1}\\/\\d{1}$")) {
			flag = "true";

		} else if (dataSource.matches("^^\\d{4}\\/\\d{2}\\/\\d{1}$")) {
			flag = "true";

		} else if (dataSource.matches("^^\\d{4}\\/\\d{1}\\/\\d{2}$")) {
			flag = "true";
		} else {
			flag = "false";
		}
		if ("true".equals(flag)) {
			try {
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
				dateFormat.setLenient(false);
				dateFormat.parse(dataSource);
				return true;
			} catch (Exception e) {
				return false;
			}
		} else {
			return false;
		}
	}
	
	/*
	 * �����̃`�F�b�N(�����t��)
	 * 
	 * @param dataSource String
	 * 
	 * @return true or false boolean true�̏ꍇ�@�����ł��A�@false�̏ꍇ�A�����ł͂Ȃ�
	 */
	private boolean checkTime(String dataSource) {
		dataSource = dataSource.trim();
		if (dataSource.length()!= 4) {
			return false;
		}
		/* �����̎��Ԃ�"00"�`"23"�̊ԈȊO�̏ꍇ�̓G���[�Ƃ��� */
		if(Integer.parseInt(dataSource.substring(0,2)) < 0 || Integer.parseInt(dataSource.substring(0,2)) > 23) {
			return false;
		}
		/* �����̕���"00"�`"59"�̊ԈȊO�̏ꍇ�̓G���[�Ƃ��� */
		if(Integer.parseInt(dataSource.substring(2,4)) < 0 || Integer.parseInt(dataSource.substring(2,4)) > 59) {
			return false;
		}
		return true;
	}
	
	/**
	 * ���l�`�F�b�N ���ڂ����l�����f����
	 * 
	 * @param strInString
	 *            ���̓p�����[�^
	 * @return ����:true / �G���[:false
	 */
	public boolean isNumChk(String strInString) {
		// ���l��input���Z�b�g�p
		try {
			Double.parseDouble(strInString);
		} catch (Exception e) {
			// ���l�ł͂Ȃ��ꍇException�ɔ�΂��ď���
			// false���Z�b�g���ď����𔲂���(�G���[�F���l�ȊO�̓���)
			return false;
		}
		if (strInString.indexOf('d') != -1 || strInString.indexOf('D') != -1
				|| strInString.indexOf('f') != -1
				|| strInString.indexOf('F') != -1) {
			return false;
		}
		// true���Z�b�g���ď����𔲂���(����I��)
		return true;
	}
	
	/**
	 * ���l�͈̓`�F�b�N
	 * 
	 * @param strI	ing
	 *            ���l
	 * @param integerSize
	 *            �����ʐ�
	 * @param decimalSize
	 *            �����ʐ�
	 * @return ����:true / �G���[:false
	 */
	public boolean isNotInNumRange(String strInString, int integerSize, int decimalSize) {

		String strInputString = null;
		// �}�C�i�X�̏ꍇ
		if (strInString.indexOf("-") == 0) {
			strInputString = strInString.substring(1);
		} else {
			// �����̏ꍇ
			strInputString = strInString;
		}
		int toneFlg = strInputString.indexOf('.');
		if (toneFlg == -1) {
			// �����̏ꍇ
			if (strInputString.length() > integerSize) {
				return false;
			}
		} else {
			if (decimalSize == 0 && toneFlg == integerSize) {
				return false;
			}
			if (strInputString.length() > decimalSize + integerSize + 1) {
				return false;
			}
			// ����
			String zhstr = strInputString.substring(0, toneFlg);
			// ����
			String xistr = strInputString.substring(toneFlg + 1, strInputString.length());
			if (zhstr.length() > integerSize || xistr.length() > decimalSize) {
				return false;
			}
		}
		return true;
	}
	
	/**
	* �b�r�u�f�[�^�Ǎ���
	* 
	* @return CSV�f�[�^���X�g
	*/  
	private List readCsvData() throws ExpjException{

		String[] strsCsvData = null;
		List listCsv = new ArrayList();
		try {
			// CSV�f�[�^�̃A�b�v���[�h
			strsCsvData = (String []) csvReader.lineRead();
			if (strsCsvData != null) {
				setSyslogConfig("strsCsvData.length:" + strsCsvData.length);
				// �f�[�^�����Ƃ���strsCsvData.length�͎g���Ȃ��B���ۂ̍s���{�T�s���炢�炵��
				AD0150010Struct structCsv = null;
				Vector v = null;
				for (int i = 0; i < strsCsvData.length; i++) {
					if (strsCsvData[i].length() == 0) {
						// �����𔲂���B
						break;
					}
					// �^�C�g���s�ǂݔ�΂�
					if(i == 0) {
						continue;
					}

					// ���R�[�h�����ږ��ɂ΂炷
					v = csvReader.importCSVLine(strsCsvData[i]);
					if (v != null ) {
						structCsv = new AD0150010Struct();
						if (CSV_NECESSARY_COLUMN == v.size()) {
							// �i�ڔԍ��@
							structCsv.setITEM_CD(v.get(CSV_ITEM_CD).toString()); 
							// �����[��
							structCsv.setWORK_ODR_DLV_DATE(v.get(CSV_WORK_ODR_DLV_DATE).toString());
							// ���������
							structCsv.setOPR_INST_START_DATE(v.get(CSV_OPR_INST_START_DATE).toString()); 
							// ��Ǝw����
							structCsv.setOPR_INST_QTY(v.get(CSV_OPR_INST_QTY).toString());
							// ��Ƌ�R�[�h
							structCsv.setWS_CD(v.get(CSV_WS_CD).toString()); 
							// ����
							structCsv.setJOB_ODR_CD(v.get(CSV_JOB_ODR_CD).toString()); 
							// ���l
							structCsv.setWORK_IN_PROC_COMMENT(v.get(CSV_WORK_IN_PROC_COMMENT).toString()); 
							structCsv.setw_COLUMN_FLG(null);
						} else {
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
			setErrorMessage("AH00042", "0", "0");
			setReadStatus(ERROR);
			throw new ExpjException(e);
		}
		return listCsv;
	
	}
	
	/**
	* �b�r�u�o�̓f�[�^�ݒ菀��
	* 
	* @param target_struct
	*			�Ώۃf�[�^���
	* @param errTyp
	*			�G���[�敪 
	* @param errlineNo
	*			�G���[�����s
	* @param errItemNo
	*			�G���[���ڔԍ�
	* @param errItem
	*			�G���[���ږ�
	* @param errMsg
	*			�G���[���b�Z�[�W
	* @param errItemCd
	*			�G���[���ڃR�[�h
	* @return �ُ�Ȃ� true �G���[ false
	*/  
	
	private boolean csvExport(AD0150010Struct targetStruct, String errTyp, int errlineNo, String errItem, String errMsg, String errItemCd) {
		AD0150010Struct errStruct = new AD0150010Struct();
		// �G���[�ӏ�
		ExpjMessage emsg = new ExpjMessage("AA01520", String.valueOf(errlineNo));
		errStruct.setl_ERROR_IN(emsg.getMessage(_locale));
		
		String strErrItem = null;
		
		if (!isNull(errItemCd)) {
			strErrItem = CoreTools.getRBString(errItem, _resource) + "," +CoreTools.getRBString(errItemCd, _resource);
		}else{
			strErrItem = CoreTools.getRBString(errItem, _resource);
		}

		// �G���[�敪
		errStruct.setl_ERR_TYP(getDisplayName(_COM_ERR_TYP, errTyp));
		// �G���[���e
		errStruct.setl_ERR_INFO(errMsg);
		// �G���[���ږ�
		errStruct.setl_ERR_CTR_NM(strErrItem);
		// �i�ڔԍ�
		errStruct.setl_ERR_ITEM_CD(replaceSlashAdd(targetStruct.getITEM_CD()));	
		// �����[��
		errStruct.setl_ERR_PRD_DUE_DATE(replaceSlashAdd(targetStruct.getWORK_ODR_DLV_DATE()));
		// ���������
		errStruct.setl_ERR_PRD_START_DATE((replaceSlashAdd(targetStruct.getOPR_INST_START_DATE())));
		// ��Ǝw����
		errStruct.setl_ERR_OPR_INST_QTY(targetStruct.getOPR_INST_QTY());
		// ��Ƌ�R�[�h
		errStruct.setl_ERR_WS_CD(replaceSlashAdd(targetStruct.getWS_CD()));
		// ����
		errStruct.setl_ERR_JOB_ODR_CD(replaceSlashAdd(targetStruct.getJOB_ODR_CD()));
		// list��ǉ�
		list.add(errStruct);
		return true;
	}
	
	/**
	 * 
	 * @param csvList
	 * @return
	 * @throws BusinessProcessException
	 * @throws FoundationException
	 */
	private boolean checkCsvData(List csvList) throws BusinessProcessException, FoundationException {

		// �S�����R�[�h��
		_intTotalCount = csvList.size();
		
		AD0150010Struct csvStruct = new AD0150010Struct();
		
		// �����[��
		String strWorkOdrDlv = null;
		
		// ���������
		String strOprInstStart = null;
		
		try {
			for (int i = 0; i < csvList.size(); i++)	{

				csvStruct = (AD0150010Struct)csvList.get(i);
				warningFlg = false;
				
				// CSV�t�@�C���̍��ڐ��`�F�b�N���s��
				if (!isNull(csvStruct.getw_COLUMN_FLG())) {
					if (Integer.parseInt(csvStruct.getw_COLUMN_FLG()) < CSV_NECESSARY_COLUMN) {
						// ���ڂɕs��������ꍇ
						_emsg = new ExpjMessage("AA01500", csvStruct.getw_COLUMN_FLG());
					} else {
						// ���ڂ��K�v���ȏ�̏ꍇ
						_emsg = new ExpjMessage("AA01519", csvStruct.getw_COLUMN_FLG());
					}
					csvExport(csvStruct					// �Ώۃf�[�^���
							, "1"						// �G���[�敪
							, i + 1						// �G���[�����s
							, "Expj.Cmt3099"			// �G���[���ږ�
							, _emsg.getMessage(_locale) // �G���[���b�Z�[�W
							, null
							); 
					_intErrorCount++;
					continue;
				}
				// �ȉ��i�ڔԍ��̃`�F�b�N
				// �i�ڔԍ��ANULL�̏ꍇ
				if (isNull(csvStruct.getITEM_CD())) {
					csvExport(csvStruct						// �Ώۃf�[�^���
							, "1"							// �G���[�敪
							, i + 1							// �G���[�����s
							, "Expj.ITEM_CD"				// �G���[���ږ�
							, new ExpjMessage("AB00002").getMessage(_locale)		// �G���[���b�Z�[�W
							, null
							); 
					_intErrorCount++;
					continue;
				}else{
					// �i�ڔԍ��A����26���ȏ�̏ꍇ
					if (strLengthChk(csvStruct.getITEM_CD()) >= 26) {
						csvExport(csvStruct						// �Ώۃf�[�^���
								, "1"							// �G���[�敪
								, i + 1							// �G���[�����s
								, "Expj.ITEM_CD"				// �G���[���ږ�
								, new ExpjMessage("AA01501").getMessage(_locale)		// �G���[���b�Z�[�W
								, null
								); 
						_intErrorCount++;
						continue;
					}
					// �i�ڔԍ��A�֑����������͂���Ă����ꍇ
					if (chkHankaku(csvStruct.getITEM_CD())) {
						csvExport(csvStruct						// �Ώۃf�[�^���
								, "1"							// �G���[�敪
								, i + 1							// �G���[�����s
								, "Expj.ITEM_CD"				// �G���[���ږ�
								, new ExpjMessage("AA01524").getMessage(_locale)		// �G���[���b�Z�[�W
								, null
								); 
						_intErrorCount++;
						continue;
					}
				}
				
				// �ȉ������[���̃`�F�b�N
				// �����[���ANULL�̏ꍇ
				if (isNull(csvStruct.getWORK_ODR_DLV_DATE())) {
					csvExport(csvStruct
							 , "1"								// �G���[�敪
							 , i + 1							// �G���[�s�ԍ�
							 , "Expj.WORK_ODR_DLV_DATE_3"		// �G���[���ږ�
							 , new ExpjMessage("AD20213").getMessage(_locale)// �G���[���b�Z�[�W
							, null
							 );	
					_intErrorCount++;
					continue;
				}else{
					// �����[���A���t�^�łȂ��ꍇ
					String strDate = csvStruct.getWORK_ODR_DLV_DATE();
					int dateIdx = strDate.indexOf(_space);
					if (dateIdx < 0) {
						strWorkOdrDlv = csvStruct.getWORK_ODR_DLV_DATE();
						if (!checkDate(csvStruct.getWORK_ODR_DLV_DATE())) {
							csvExport(csvStruct
									, "1"								// �G���[�敪
									, i + 1								// �G���[�s�ԍ�
									, "Expj.WORK_ODR_DLV_DATE_3"		// �G���[���ږ�
									, new ExpjMessage("AA01606").getMessage(_locale)// �G���[���b�Z�[�W
									, null
									);	
							_intErrorCount++;
							continue;
						}
					} else {
						strWorkOdrDlv = strDate.substring(0, dateIdx);
						String strTime = strDate.substring(dateIdx+1);
						if ("false".equals(struct.getTIME_CTRL())) {
							strTime = "0000";
							csvStruct.setWORK_ODR_DLV_DATE(strWorkOdrDlv+_space+strTime);
						}
						if (!checkDate(strWorkOdrDlv) || !checkTime(strTime)) {
							csvExport(csvStruct
									, "1"								// �G���[�敪
									, i + 1								// �G���[�s�ԍ�
									, "Expj.WORK_ODR_DLV_DATE_3"		// �G���[���ږ�
									, new ExpjMessage("AA01606").getMessage(_locale)// �G���[���b�Z�[�W
									, null
									);	
							_intErrorCount++;
							continue;
						}
					}
				}
				// �ȉ�����������̃`�F�b�N
				// ����������A���t�^�łȂ��ꍇ
				if (!isNull(csvStruct.getOPR_INST_START_DATE())) {
					String strDate = csvStruct.getOPR_INST_START_DATE();
					int dateIdx = strDate.indexOf(_space);
					if (dateIdx < 0) {
						strOprInstStart = csvStruct.getOPR_INST_START_DATE();
						if (!checkDate(csvStruct.getOPR_INST_START_DATE())) {
							csvExport(csvStruct
									 , "1"								// �G���[�敪
									 , i + 1							// �G���[�s�ԍ�
									 , "Expj.PRD_START_DATE"			// �G���[���ږ�
									 , new ExpjMessage("AA01606").getMessage(_locale)// �G���[���b�Z�[�W
									 , null
									 );	
						_intErrorCount++;
						continue;
						}
					} else {
						strOprInstStart = strDate.substring(0, dateIdx);
						String strTime = strDate.substring(dateIdx+1);
						if ("false".equals(struct.getTIME_CTRL())) {
							strTime = "0000";
							csvStruct.setOPR_INST_START_DATE(strOprInstStart+_space+strTime);
						}
						if (!checkDate(strOprInstStart) || !checkTime(strTime)) {
							csvExport(csvStruct
									 , "1"								// �G���[�敪
									 , i + 1							// �G���[�s�ԍ�
									 , "Expj.PRD_START_DATE"			// �G���[���ږ�
									 , new ExpjMessage("AA01606").getMessage(_locale)// �G���[���b�Z�[�W
									 , null
									 );		
							_intErrorCount++;
							continue;
						}
					}
				}
				
				// �ȉ���Ǝw�����̃`�F�b�N
				// ��Ǝw�����ANULL�̏ꍇ
				if (isNull(csvStruct.getOPR_INST_QTY())) {
					csvExport(csvStruct
							 , "1"								// �G���[�敪
							 , i + 1							// �G���[�s�ԍ�
							 , "Expj.Cmt0634"					// �G���[���ږ�
							 , new ExpjMessage("AD30222").getMessage(_locale)// �G���[���b�Z�[�W
							 , null 
							);	
					_intErrorCount++;
					continue;
				}else{
					// ��Ǝw�����A���l�ȊO�̏ꍇ
					if (!isNumChk(csvStruct.getOPR_INST_QTY())) {
						csvExport(csvStruct
								 , "1"								// �G���[�敪
								 , i + 1							// �G���[�s�ԍ�
								 , "Expj.Cmt0634"					// �G���[���ږ�
								 , new ExpjMessage("AA01503").getMessage(_locale)// �G���[���b�Z�[�W
								 , null 
								);	
						_intErrorCount++;
						continue;
					}
					// ��Ǝw�����A0�����̏ꍇ
					if (Calculate.compare(csvStruct.getOPR_INST_QTY(), "0") == -1) {
						csvExport(csvStruct
								 , "1"								// �G���[�敪
								 , i + 1							// �G���[�s�ԍ�
								 , "Expj.Cmt0634"					// �G���[���ږ�
								 , new ExpjMessage("AD34026").getMessage(_locale)// �G���[���b�Z�[�W
								 , null
								);	
						_intErrorCount++;
						continue;
					}
					// ��Ǝw�����A������14���ȏ�A�܂��́A�����_�ȉ�5���ȏ�̏ꍇ
					if (!isNotInNumRange(csvStruct.getOPR_INST_QTY(), 14, 4)) {
						csvExport(csvStruct
								 , "1"								// �G���[�敪
								 , i + 1							// �G���[�s�ԍ�
								 , "Expj.Cmt0634"					// �G���[���ږ�
								 , new ExpjMessage("AA01501").getMessage(_locale)	// �G���[���b�Z�[�W
								 , null
								 );
						_intErrorCount++;
						continue;
					}
				}
				
				// �ȉ���Ƌ�R�[�h�̃`�F�b�N
				// ��Ƌ�R�[�h�ANULL�̏ꍇ
				if (!isNull(csvStruct.getWS_CD())) {
					// ��Ƌ�R�[�h�A����26���ȏ�̏ꍇ
					if (strLengthChk(csvStruct.getWS_CD()) >= 26) {
						csvExport(csvStruct							// �Ώۃf�[�^���
								, "1"								// �G���[�敪
								, i + 1								// �G���[�����s
								, "Expj.WS_CD"						// �G���[���ږ�
								, new ExpjMessage("AA01501").getMessage(_locale)			// �G���[���b�Z�[�W
								, null
								); 
						_intErrorCount++;
						continue;
					}
					// ��Ƌ�R�[�h�A�֑����������͂���Ă����ꍇ
					if (chkHankaku(csvStruct.getWS_CD())) {
						csvExport(csvStruct							// �Ώۃf�[�^���
								, "1"								// �G���[�敪
								, i + 1								// �G���[�����s
								, "Expj.WS_CD"						// �G���[���ږ�
								, new ExpjMessage("AA01524").getMessage(_locale)			// �G���[���b�Z�[�W
								, null
								); 
						_intErrorCount++;
						continue;
					}
				}
				
				// �ȉ����Ԃ̃`�F�b�N
				if (!isNull(csvStruct.getJOB_ODR_CD())) {
					// ���ԁA����26���ȏ�̏ꍇ
					if (strLengthChk(csvStruct.getJOB_ODR_CD()) >= 26) {
						csvExport(csvStruct						// �Ώۃf�[�^���
								, "1"							// �G���[�敪
								, i + 1							// �G���[�����s
								, "Expj.Cmt3156"				// �G���[���ږ�
								, new ExpjMessage("AA01501").getMessage(_locale)		// �G���[���b�Z�[�W
								, null
								); 
						_intErrorCount++;
						continue;
					}
					// ���ԁA�֑����������͂���Ă����ꍇ
					if (chkHankaku(csvStruct.getJOB_ODR_CD())) {
						csvExport(csvStruct						// �Ώۃf�[�^���
								, "1"							// �G���[�敪
								, i + 1							// �G���[�����s
								, "Expj.Cmt3156"				// �G���[���ږ�
								, new ExpjMessage("AA01524").getMessage(_locale)		// �G���[���b�Z�[�W
								, null
								); 
						_intErrorCount++;
						continue;
					}
				}
				
				// �ȉ����l�̃`�F�b�N
				if (!isNull(csvStruct.getWORK_IN_PROC_COMMENT())) {
					// ���l�A����8�P���ȏ�̏ꍇ
					if (strLengthChk(csvStruct.getWORK_IN_PROC_COMMENT()) >= 81) {
						csvExport(csvStruct						// �Ώۃf�[�^���
								, "1"							// �G���[�敪
								, i + 1							// �G���[�����s
								, "Expj.OPR_RSLT_COMMENT_1"		// �G���[���ږ�
								, new ExpjMessage("AA01501").getMessage(_locale)		// �G���[���b�Z�[�W
								, null
								); 
						_intErrorCount++;
						continue;
					}
					// ���l�A�֑����������͂���Ă����ꍇ
					if (chkHankaku(csvStruct.getWORK_IN_PROC_COMMENT())) {
						csvExport(csvStruct						// �Ώۃf�[�^���
								, "1"							// �G���[�敪
								, i + 1							// �G���[�����s
								, "Expj.OPR_RSLT_COMMENT_1"		// �G���[���ږ�
								, new ExpjMessage("AA01524").getMessage(_locale)		// �G���[���b�Z�[�W
								, null
								); 
						_intErrorCount++;
						continue;
					}
				}
				
				// �}�X�^�������`�F�b�N
				// ���������
				Date OprInstStartDatetemp = null;
				// �����[��
				Date workOdrDlvDatetemp = null;				
				if (!isNull(csvStruct.getOPR_INST_START_DATE())) {
					OprInstStartDatetemp = _df.parse(strOprInstStart);
				}
				if (!isNull(csvStruct.getWORK_ODR_DLV_DATE())) {
					workOdrDlvDatetemp = _df.parse(strWorkOdrDlv);
				}
				
				// �u�i�ڔԍ��v �ɓ��͂��ꂽ�l�� [�i��] �ɑ��݂��Ȃ��ꍇ
				List itemCdList = entity.mselectItem_CD.read(conn, csvStruct);
				if (itemCdList.isEmpty()) {
					csvExport(csvStruct
							, "1"													// �G���[�敪
							, i + 1													// �G���[�s�ԍ�
							, "Expj.ITEM_CD"										// �G���[���ږ�
							, new ExpjMessage("AD00019").getMessage(_locale)		// �G���[���b�Z�[�W
							, null);
					_intErrorCount++;
					continue;
				}else{
					mItemStruct = (AD0150010Struct)itemCdList.get(0);
					// ���͂��ꂽ [�i��] �� �g�i�ڎ�z�敪�h ��	3�F���� 8�F�[���i�� �̏ꍇ
					if ("3".equals(mItemStruct.getMRP_ODR_TYP()) 
							|| "8".equals(mItemStruct.getMRP_ODR_TYP())) {
						csvExport(csvStruct
								, "1"													// �G���[�敪
								, i + 1													// �G���[�s�ԍ�
								, "Expj.ITEM_CD"										// �G���[���ږ�
								, new ExpjMessage("AD32217").getMessage(_locale)		// �G���[���b�Z�[�W
								, null);
						_intErrorCount++;
						continue;
					}
				}
				
				// �u�����[���v �ɋx�������͂��ꂽ�ꍇ
				String strWorkOdrDlvDate = Converter.dateToStr(workOdrDlvDatetemp, "yyyy/MM/dd");
				csvStruct.setDATE(strWorkOdrDlvDate);
				csvStruct.setPLANT_CD(getsysPLANT_CD());
				//�i�ڔԍ��������L�[�Ƃ��ēǍ�
				List dateList = entity.mSelectM_CAL1.read(conn,csvStruct);
				if (dateList.isEmpty()) {
					//�H��R�[�h�������L�[�Ƃ��ēǍ�
					dateList = entity.mselectM_CAL.read(conn,csvStruct);
					if(dateList.isEmpty()){
						//�f�[�^�����݂��Ȃ�
						csvExport(csvStruct
								, "1"													// �G���[�敪
								, i + 1													// �G���[�s�ԍ�
								, "Expj.WORK_ODR_DLV_DATE_3"							// �G���[���ږ�
								, new ExpjMessage("KQ00325").getMessage(_locale)		// �G���[���b�Z�[�W
								, null);
						_intErrorCount++;
						continue;
					}else{
						AD0150010Struct dateStruct = (AD0150010Struct)dateList.get(0);
						if ("1".equals(dateStruct.getHOLIDAY_FLG())) {
							csvExport(csvStruct
									, "1"													// �G���[�敪
									, i + 1													// �G���[�s�ԍ�
									, "Expj.WORK_ODR_DLV_DATE_3"							// �G���[���ږ�
									, new ExpjMessage("AD00036").getMessage(_locale)		// �G���[���b�Z�[�W
									, null);
							_intErrorCount++;
							continue;
						}
					}
				}else{
					AD0150010Struct dateStruct = (AD0150010Struct)dateList.get(0);
					if ("1".equals(dateStruct.getHOLIDAY_FLG())) {
						csvExport(csvStruct
								, "1"													// �G���[�敪
								, i + 1													// �G���[�s�ԍ�
								, "Expj.WORK_ODR_DLV_DATE_3"							// �G���[���ږ�
								, new ExpjMessage("AD00036").getMessage(_locale)		// �G���[���b�Z�[�W
								, null);
						_intErrorCount++;
						continue;
					}
				}
				
				// �u����������v �ɋx�������͂��ꂽ�ꍇ
				if (!isNull(csvStruct.getOPR_INST_START_DATE())) {
					//���͂��ꂽ������������x���������ꍇ�G���[
					String strOprInstStartDate =
							Converter.dateToStr(OprInstStartDatetemp, "yyyy/MM/dd");
					csvStruct.setDATE(strOprInstStartDate);
					//�i�ڔԍ��������L�[�Ƃ��ēǍ�
					List dateList2 = entity.mSelectM_CAL1.read(conn,csvStruct);
					if (dateList2.isEmpty()) {
						//�H��R�[�h�������L�[�Ƃ��ēǍ�
						dateList2 = entity.mselectM_CAL.read(conn,csvStruct);
						if(dateList2.isEmpty()){
							//�f�[�^�����݂��Ȃ�
							csvExport(csvStruct
									, "1"													// �G���[�敪
									, i + 1													// �G���[�s�ԍ�
									, "Expj.PRD_START_DATE"									// �G���[���ږ�
									, new ExpjMessage("KQ00325").getMessage(_locale)		// �G���[���b�Z�[�W
									, null);
							_intErrorCount++;
							continue;
						} else {
							AD0150010Struct dateStruct2 = (AD0150010Struct)dateList2.get(0);
							if ("1".equals(dateStruct2.getHOLIDAY_FLG())) {
								csvExport(csvStruct
									, "1"													// �G���[�敪
									, i + 1													// �G���[�s�ԍ�
									, "Expj.PRD_START_DATE"									// �G���[���ږ�
									, new ExpjMessage("AD00038").getMessage(_locale)		// �G���[���b�Z�[�W
									, null);
							_intErrorCount++;
							continue;
							}
						}
					}else{
						AD0150010Struct dateStruct2 = (AD0150010Struct)dateList2.get(0);
						if ("1".equals(dateStruct2.getHOLIDAY_FLG())) {
							csvExport(csvStruct
								, "1"													// �G���[�敪
								, i + 1													// �G���[�s�ԍ�
								, "Expj.PRD_START_DATE"									// �G���[���ږ�
								, new ExpjMessage("AD00038").getMessage(_locale)		// �G���[���b�Z�[�W
								, null);
							_intErrorCount++;
							continue;
						}
					}
					
					// �u�����[���v �� �u����������v�̏ꍇ
					if (workOdrDlvDatetemp.compareTo(OprInstStartDatetemp) < 0) {
						csvExport(csvStruct
								, "1"													// �G���[�敪
								, i + 1													// �G���[�s�ԍ�
								, "Expj.WORK_ODR_DLV_DATE_3"							// �G���[���ږ�
								, new ExpjMessage("AD32156").getMessage(_locale)		// �G���[���b�Z�[�W
								, "Expj.PRD_START_DATE");
						_intErrorCount++;
						continue;
					}
				}
				
				// �u��Ǝw�����v �� 0�̏ꍇ
				if ("0".equals(csvStruct.getOPR_INST_QTY())) {
					csvExport(csvStruct
							, "1"													// �G���[�敪
							, i + 1													// �G���[�s�ԍ�
							, "Expj.Cmt0634"										// �G���[���ږ�
							, new ExpjMessage("AD30222").getMessage(_locale)		// �G���[���b�Z�[�W
							, null);
					_intErrorCount++;
					continue;
				}
				
				// [��Ƌ�] �ɑ��݂��Ȃ���Ƌ�R�[�h����͂����ꍇ
				if (!isNull(csvStruct.getWS_CD())) {
					List wsCdList = entity.mselectM_WS.read(conn, csvStruct);
					AD0150010Struct wsCdStruct = new AD0150010Struct();
					if (wsCdList.isEmpty()) {
						csvExport(csvStruct
								, "1"													// �G���[�敪
								, i + 1													// �G���[�s�ԍ�
								, "Expj.WS_CD"											// �G���[���ږ�
								, new ExpjMessage("AD20029").getMessage(_locale)		// �G���[���b�Z�[�W
								, null);
						_intErrorCount++;
						continue;
					}else{
						wsCdStruct = (AD0150010Struct)wsCdList.get(0);
						// �u��Ƌ�R�[�h�v�ɑ΂���H��R�[�h�Ɓu�H��R�[�h�v����v���Ȃ��ꍇ
						if (!this.sysPLANT_CD.equals(wsCdStruct.getvc2PLANT_CD())) {
							csvExport(csvStruct
									, "1"													// �G���[�敪
									, i + 1													// �G���[�s�ԍ�
									, "Expj.WS_CD"													// �G���[���ږ�
									, new ExpjMessage("AD00004").getMessage(_locale)
									, null);												// �G���[���b�Z�[�W
							_intErrorCount++;
							continue;
						}
					}
				}
				
				// [�i��].�g��Ǝ��ы敪�h �� 1�F�o�������� �ŁA
				if ("1".equals(mItemStruct.getOPR_RSLT_TYP())) {
					// �u��Ƌ�R�[�h�v �� Null �̏ꍇ
					if (isNull(csvStruct.getWS_CD())) {
						// ��ƌn�񂩂�u��Ƌ�R�[�h�v ���擾���A�擾�ł��Ȃ��ꍇ
						List procgrpList = entity.mselectM_PROC_GRP.read(conn, csvStruct);
						AD0150010Struct procgrpStruct = new AD0150010Struct();
						if (procgrpList.isEmpty()) {
							csvExport(csvStruct
									, "1"													// �G���[�敪
									, i + 1													// �G���[�s�ԍ�
									, "Expj.WS_CD"											// �G���[���ږ�
									, new ExpjMessage("AC00103").getMessage(_locale)		// �G���[���b�Z�[�W
									, null);
							_intErrorCount++;
							continue;
						}else {
							procgrpStruct = (AD0150010Struct)procgrpList.get(0);
							csvStruct.setWS_CD(procgrpStruct.getWS_CD());
						}
					}
					
				}else if ("2".equals(mItemStruct.getOPR_RSLT_TYP())) {
					// [�i��].�g��Ǝ��ы敪�h �� 2�F��Ǝw������ ��
					// �u��Ƌ�R�[�h�v �����͂���Ă���ꍇ
					if (!isNull(csvStruct.getWS_CD())) {
						csvExport(csvStruct
								, "1"													// �G���[�敪
								, i + 1													// �G���[�s�ԍ�
								, "Expj.WS_CD"											// �G���[���ږ�
								, new ExpjMessage("AD00227").getMessage(_locale)		// �G���[���b�Z�[�W
								, null);
						_intErrorCount++;
						continue;
					}
				}
				// ���͂��ꂽ [�i��] �� �g�i�ڎ�z�敪�h ��1�F���� 2�F�݌Ɉ����^���Ԃ̏ꍇ
				if (("1".equals(mItemStruct.getMRP_ODR_TYP()) || "2".equals(mItemStruct.getMRP_ODR_TYP()))) {
					// CSV���ڂ̐��Ԃ����͂���Ȃ��ꍇ�A
					if (isNull(csvStruct.getJOB_ODR_CD())) {
						csvExport(csvStruct
								, "1"													// �G���[�敪
								, i + 1													// �G���[�s�ԍ�
								, "Expj.Cmt3156"										// �G���[���ږ�
								, new ExpjMessage("AD30017").getMessage(_locale)		// �G���[���b�Z�[�W
								, null);
						_intErrorCount++;
						continue;
					}else {
						// �u���ԁv �̒l�� [���Ԍv��] �ɑ��݂��Ȃ��ꍇ
						List jobodrList = entity.mselectT_JOB_ODR.read(conn, csvStruct);
						if (jobodrList.isEmpty()) {
							csvExport(csvStruct
									, "1"													// �G���[�敪
									, i + 1													// �G���[�s�ԍ�
									, "Expj.Cmt3156"										// �G���[���ږ�
									, new ExpjMessage("AB00043").getMessage(_locale)		// �G���[���b�Z�[�W
									, null);
							_intErrorCount++;
							continue;
						}else {
							jobodrStruct = (AD0150010Struct)jobodrList.get(0);
							// [���Ԍv��].�g���ԏ�ԋ敪�h ��1�F���v�ʌv�Z���Ώ� or 2�F���v�ʌv�Z�Ώ� or 9�F���� �̏ꍇ
							if ("1".equals(jobodrStruct.getJOB_ODR_STS_TYP())
									|| "2".equals(jobodrStruct.getJOB_ODR_STS_TYP())
									|| "9".equals(jobodrStruct.getJOB_ODR_STS_TYP())) {
								csvExport(csvStruct
										, "1"													// �G���[�敪
										, i + 1													// �G���[�s�ԍ�
										, "Expj.Cmt3156"										// �G���[���ږ�
										, new ExpjMessage("AD32616").getMessage(_locale)		// �G���[���b�Z�[�W
										, null);
								_intErrorCount++;
								continue;
							}
							
							// ���[�U����������H��R�[�h�ƁA[���Ԍv��] �̍H��R�[�h����v���Ȃ��ꍇ
							if (!jobodrStruct.getPLANT_CD().equals(this.sysPLANT_CD)) {
								csvExport(csvStruct
										, "1"													// �G���[�敪
										, i + 1													// �G���[�s�ԍ�
										, "Expj.Cmt3156"													// �G���[���ږ�
										, new ExpjMessage("AD00016").getMessage(_locale)		// �G���[���b�Z�[�W
										, null);
								_intErrorCount++;
								continue;
							}
							
							// [���Ԍv��].�g���Ԕ[���h �� �u�����[���v�ɂȂ�ꍇ
							Date jobOdrDlvDate = _df.parse(jobodrStruct.getJOB_ODR_DLV_DATE());
							if (jobOdrDlvDate.compareTo(workOdrDlvDatetemp) < 0) {
								csvExport(csvStruct
										, "1"													// �G���[�敪
										, i + 1													// �G���[�s�ԍ�
										, "Expj.WORK_ODR_DLV_DATE_3"							// �G���[���ږ�
										, new ExpjMessage("AD32214").getMessage(_locale)		// �G���[���b�Z�[�W
										, null);
								_intErrorCount++;
								continue;
							}
						}
					}
				}
				
				// [�i��].�݌ɐ��ʒP�ʋ敪=1�Łu��Ǝw�����v�ɏ��������͂��ꂽ�ꍇ
				BigDecimal OprInstQty_up = new BigDecimal(csvStruct.getOPR_INST_QTY());
				if ("1".equals(mItemStruct.getUNIT_QTY_TYP())) {
					BigDecimal OprInstQty2 = new BigDecimal("0");
					OprInstQty2 = OprInstQty_up.setScale(0,BigDecimal.ROUND_UP);
					//�؂�グ�����O�ƌ�Œl���قȂ��Ă�����
					//���������͂���Ă����Ɣ��f�����[�j���O
					if ( OprInstQty_up.doubleValue() != OprInstQty2.doubleValue()) { 
						csvExport(csvStruct
								, "2"													// �G���[�敪
								, i + 1													// �G���[�s�ԍ�
								, "Expj.Cmt0634"										// �G���[���ږ�
								, new ExpjMessage("AD00043").getMessage(_locale)		// �G���[���b�Z�[�W
								, null);
						if(!warningFlg){
							_intWarningCount++;
							warningFlg = true;
						}
					}
				}
				
				// �u����������v �� Null �̏ꍇ
				if (isNull(csvStruct.getOPR_INST_START_DATE())){
					csvExport(csvStruct
							, "2"													// �G���[�敪
							, i + 1													// �G���[�s�ԍ�
							, "Expj.PRD_START_DATE"									// �G���[���ږ�
							, new ExpjMessage("AD34034").getMessage(_locale)		// �G���[���b�Z�[�W
							, null);
					if(!warningFlg){
						_intWarningCount++;
						warningFlg = true;
					}
				}
				
				// �Ɩ��^�p��
				Date _btmBusinessOprDatetemp = _df.parse(_btmBusinessOprDate);
				
				// �u�����[���v �� �ߋ���(�Ɩ��^�p�����ߋ�) ����͂��ꂽ�ꍇ
				if (!isNull(csvStruct.getWORK_ODR_DLV_DATE())) {
					
					if (workOdrDlvDatetemp.compareTo(_btmBusinessOprDatetemp) < 0) {
						csvExport(csvStruct
								, "2"													// �G���[�敪
								, i + 1													// �G���[�s�ԍ�
								, "Expj.WORK_ODR_DLV_DATE_3"							// �G���[���ږ�
								, new ExpjMessage("AD34035").getMessage(_locale)		// �G���[���b�Z�[�W
								, null);
						if(!warningFlg){
							_intWarningCount++;
							warningFlg = true;
						}
					}
				}
				
				// �u����������v �� �ߋ���(�Ɩ��^�p�����ߋ�) ����͂��ꂽ�ꍇ
				if (!isNull(csvStruct.getOPR_INST_START_DATE())) {
					if (OprInstStartDatetemp.compareTo(_btmBusinessOprDatetemp) < 0) {
						csvExport(csvStruct
								, "2"													// �G���[�敪
								, i + 1													// �G���[�s�ԍ�
								, "Expj.PRD_START_DATE"									// �G���[���ږ�
								, new ExpjMessage("AD34036").getMessage(_locale)		// �G���[���b�Z�[�W
								, null);
						if(!warningFlg){
							_intWarningCount++;
							warningFlg = true;
						}
					}
				}
				
				// ���͂��ꂽ [�i��] �� �g�i�ڎ�z�敪�h ��1�F���� 2�F�݌Ɉ����^���Ԃ̏ꍇ
				if (("1".equals(mItemStruct.getMRP_ODR_TYP()) || "2".equals(mItemStruct.getMRP_ODR_TYP()))) {
					// ���ԕi�ځF�Ή����� [���v��].�g�e�I�[�_�f�}���h�ԍ��h ���A Null �ȊO
					if (!isNull(jobodrStruct.getPARENT_OD_NO())) {
						if (!isNull(jobodrStruct.getDUE_DATE())) {
							Date dueDate = _df.parse(jobodrStruct.getDUE_DATE());
							
							// ���ԕi�̏ꍇ�ŁA [���v��].�g�v���[���h �� �u�����[���v�̏ꍇ
							if (dueDate.compareTo(workOdrDlvDatetemp) < 0) {
								csvExport(csvStruct
										, "2"													// �G���[�敪
										, i + 1													// �G���[�s�ԍ�
										, "Expj.WORK_ODR_DLV_DATE_3"							// �G���[���ږ�
										, new ExpjMessage("AD34037").getMessage(_locale)		// �G���[���b�Z�[�W
										, null);
								if(!warningFlg){
									_intWarningCount++;
									warningFlg = true;
								}
							}
						}
					}
					
					// [���v��].�g��z������h �� �u����������v �̏ꍇ
					if (!isNull(jobodrStruct.getODR_START_DATE()) && !isNull(csvStruct.getOPR_INST_START_DATE())) {
						Date odrStartDate = _df.parse(jobodrStruct.getODR_START_DATE());
						if (odrStartDate.compareTo(OprInstStartDatetemp) > 0) {
							csvExport(csvStruct
									, "2"													// �G���[�敪
									, i + 1													// �G���[�s�ԍ�
									, "Expj.PRD_START_DATE"									// �G���[���ږ�
									, new ExpjMessage("AD34038").getMessage(_locale)		// �G���[���b�Z�[�W
									, null);
							if(!warningFlg){
								_intWarningCount++;
								warningFlg = true;
							}
						}
					}
					
					// ��s��z����([���Ԍv��]."���Ԏ��"=2)�̍ŏ�ʕi�ڂ̏ꍇ�ŁA
					//�u�����[���v��min�i�����ԁE���Ԏ}�Ԃ��L�[�ɗv�����Ƃ̃f�}���h���������A
					// ����[���v��]."�v���[��"�j�ɂȂ�ꍇ
					if ("2".equals(jobodrStruct.getJOB_ODR_TYP())) {
						// �ŏ�ʕi��(�e�I�[�_�f�}���h�ԍ���NULL)�̏ꍇ
						if (isNull(jobodrStruct.getPARENT_OD_NO())) {
									
							List jobOdrAlcList = entity.mselectJobOdrAlc.read(conn,csvStruct);
							if (jobOdrAlcList.isEmpty()) {
								//�����f�[�^��������΁A�`�F�b�N���Ȃ��B	
							} else {
								AD0150010Struct jobOdrAlcStruct = 
										(AD0150010Struct)jobOdrAlcList.get(0);
								if (!isNull(jobOdrAlcStruct.getDUE_DATE_BY_ALC())) {
									Date datealcDueDate = 
										_df.parse(jobOdrAlcStruct.getDUE_DATE_BY_ALC());
									
									//�u�����[���v��[���v��]."�v���[��"
									if (workOdrDlvDatetemp.compareTo(datealcDueDate) > 0) {
										//�����[���ɖ���������܂��B
										csvExport(csvStruct
												, "2"													// �G���[�敪
												, i + 1													// �G���[�s�ԍ�
												, "Expj.WORK_ODR_DLV_DATE_3"							// �G���[���ږ�
												, new ExpjMessage("AD00044").getMessage(_locale)		// �G���[���b�Z�[�W
												, null);
										if(!warningFlg){
											_intWarningCount++;
											warningFlg = true;
										}
									}
								}
							}
						}
					}
//					// CSV���ڂ̐��Ԃ����͂��ꂽ�ꍇ�A
//					// ���ԕi�ځF�Ή����� [���v��].�g�e�I�[�_�f�}���h�ԍ��h ���A Null �ȊO
//					if (!isNull(jobodrStruct.getPARENT_OD_NO())) {
//						
//						// ���ԕi�ڂ̏ꍇ�ŁA �u��Ǝw�����v ���ύX���ꂽ�ꍇ
//						if (!isNull(csvStruct.getOPR_INST_QTY())) {
//							csvExport(csvStruct
//									, "2"													// �G���[�敪
//									, i + 1													// �G���[�s�ԍ�
//									, "Expj.Cmt0634"										// �G���[���ږ�
//									, new ExpjMessage("AD00045").getMessage(_locale)		// �G���[���b�Z�[�W
//									, null);
//							if(!warningFlg){
//								_intWarningCount++;
//								warningFlg = true;
//							}
//						}
//					}
					
//					// CSV���ڂ̐��Ԃ����͂��ꂽ�ꍇ�A
//					List tempList = entity.mCheckChild.read(conn, jobodrStruct);
//					if (tempList.isEmpty()) {
//						// ���ʕ��i�f�[�^��������΁A�`�F�b�N���Ȃ��B
//					} else {
//						// ���ʕ��i�����݂���ꍇ�ŁA �u��Ǝw�����v �u����������v �̂����ꂩ���ύX���ꂽ�ꍇ
//						if (!isNull(csvStruct.getOPR_INST_QTY()) || !isNull(csvStruct.getOPR_INST_START_DATE())) {
//							csvExport(csvStruct
//									, "2"													// �G���[�敪
//									, i + 1													// �G���[�s�ԍ�
//									, "Expj.Cmt0634"										// �G���[���ږ�
//									, new ExpjMessage("AD00047").getMessage(_locale)		// �G���[���b�Z�[�W
//									, "Expj.PRD_START_DATE");
//							if(!warningFlg){
//								_intWarningCount++;
//								warningFlg = true;
//							}
//						}
//					}
				}
			}
			_intSuccessCount = _intTotalCount - _intErrorCount - _intWarningCount;
			if (_intErrorCount > 0) {
				return false;
			} else {
				return true;
			}
		} catch (Exception e) {
			 ExpjMessage emsg = new ExpjMessage("ZZ01106");
			 sysLog.severe(emsg, getsysUSER_CD());
			 ExpjException ee = new ExpjException(e, emsg);
			 throw ee;
		}
	}
	
	/**
	 * CSV�t�F�C�����e�́A�o�^����
	 * @param csvList
	 * @return
	 * @throws FoundationException 
	 */
	private boolean insertCsvDate(List csvList) throws FoundationException, ExpjException {
		try {
			boolean rtnFlg = true;
			conn.beginTransWeb();
			for (int i = 0; i < csvList.size(); i++) {
				warningFlg = false;
				AD0150010Struct csvStruct = (AD0150010Struct)csvList.get(i);
				csvStruct.setsSysdate(struct.getsSysdate());
				csvStruct.setsUser_ID(struct.getsUser_ID());
				// [�p�����[�^].�h���O�h=�fTIME_CTRL�f��[�p�����[�^].�h�l�h=�ftrue�f�Ȃ�
				if ("true".equals(_flgTimeCtrl)) {
					WORK_ODR_DLV_DATE_TIME = "2359";
					OPR_INST_START_DATE_TIME = "2359";
				} else {
					WORK_ODR_DLV_DATE_TIME = "0000";
					OPR_INST_START_DATE_TIME = "0000";
				}
				
				// [�b�r�u�f�[�^].�h����������h��NULL�̏ꍇ�F�����[���ɂ��A�Z�o
				if (isNull(csvStruct.getOPR_INST_START_DATE())) {
					//������̎����v�Z
					List ltList = entity.mselectLT.read(conn,csvStruct);
					if (ltList.isEmpty()) {
						//�f�[�^�����݂��Ȃ�
						csvExport(csvStruct
								, "1"													// �G���[�敪
								, i + 1													// �G���[�s�ԍ�
								, "Expj.PRD_START_DATE"									// �G���[���ږ�
								, new ExpjMessage("ZZ01101").getMessage(_locale)		// �G���[���b�Z�[�W
								, null);
						_intErrorCount++;
						setReadStatus(ERROR);
						return false;
					} else {
						AD0150010Struct ltStruct = (AD0150010Struct)ltList.get(0);
						int fixed = new Integer(ltStruct.getFIXED_LT()).intValue();
						int prop = new Integer(ltStruct.getPROP_LT()).intValue();
						int safety = new Integer(ltStruct.getSAFETY_LT()).intValue();
						int prop_lot = new Integer(ltStruct.getPROP_LOT_SIZE()).intValue();
						//��Ǝw������؂�グ��������
						BigDecimal StrOprInstQty = new BigDecimal(csvStruct.getOPR_INST_QTY());
						BigDecimal OprInstQty = StrOprInstQty.setScale(0, BigDecimal.ROUND_UP);
						String strOprInstQty = OprInstQty.toString();
						//�i�ڂ̃��[�h�^�C��
						int lt = 
								0 - (fixed + (Integer.parseInt(strOprInstQty)/prop_lot) * prop + safety);
						Date WorkOdrDlvDate = 
								Converter.strToDate(csvStruct.getWORK_ODR_DLV_DATE().substring(0,10), "yyyy/MM/dd");
						//������������v�Z����
						WorkDay OprInstStartDate = 
								new WorkDay(
									this.sysUSER_CD, 
									business.getBusinessCd(), 
									this.sysPLANT_CD,
									csvStruct.getITEM_CD(),
									WorkOdrDlvDate,lt,
									true);
						String StrOprInstStartDate = 
								Converter.dateToStr(OprInstStartDate.calcDate(), "yyyy/MM/dd");
						if(StrOprInstStartDate == null){
							// �Ɩ����t�̎擾�Ɏ��s���܂����B
							csvExport(csvStruct
									, "1"													// �G���[�敪
									, i + 1													// �G���[�s�ԍ�
									, "Expj.PRD_START_DATE"									// �G���[���ږ�
									, new ExpjMessage("KQ00026").getMessage(_locale)		// �G���[���b�Z�[�W
									, null);
							_intErrorCount++;
							setReadStatus(ERROR);
							return false;
						} else {
							if (csvStruct.getWORK_ODR_DLV_DATE().length()>10){
								csvStruct.setOPR_INST_START_DATE(StrOprInstStartDate.substring(0,10)+_space+csvStruct.getWORK_ODR_DLV_DATE().substring(11));
							} else {
								csvStruct.setOPR_INST_START_DATE(StrOprInstStartDate.substring(0,10));
							}
						}
					}
				}
				
				// ���v�ʂ̃I�[�_���̒ǉ��A���v�ʂ̉��ʃf�}���h�̒ǉ�
				String odNoString;
				CommonOd od = 
						new CommonOd(conn,
							this.sysPLANT_CD,
							this.sysUSER_CD,
							this.sp.getProcId());
				// ���t�^�̓]��
				if (csvStruct.getWORK_ODR_DLV_DATE().length()<=10) {
					csvStruct.setWORK_ODR_DLV_DATE(csvStruct.getWORK_ODR_DLV_DATE() + " " + WORK_ODR_DLV_DATE_TIME);
				}
				if (csvStruct.getOPR_INST_START_DATE().length()<=10) {
					csvStruct.setOPR_INST_START_DATE(csvStruct.getOPR_INST_START_DATE() + " " + OPR_INST_START_DATE_TIME);
				}				
				// �I�[�_�[�f�}���h�ԍ����Z�b�g����
				odNoString = 
				od.addOdInfo(csvStruct.getITEM_CD(),
					Converter.strToDate(
							csvStruct.getWORK_ODR_DLV_DATE(), Converter.SLASH_DATE_HOUR_MINUTE),
					Converter.strToDate(
							csvStruct.getOPR_INST_START_DATE(), Converter.SLASH_DATE_HOUR_MINUTE),
					Double.parseDouble(csvStruct.getOPR_INST_QTY()),
					3);
				
				csvStruct.setOD_NO(odNoString);
				
				// [�i��].�g��Ǝ��ы敪�h���A1�F�o�������� �̏ꍇ�A[��Ǝw���`�[] �̒ǉ����s���B
				List itemCdList = entity.mselectItem_CD.read(conn, csvStruct);
				mItemStruct = (AD0150010Struct)itemCdList.get(0);
				if ("1".equals(mItemStruct.getOPR_RSLT_TYP())) {
					rtnFlg = insertT_OPR_INST_SLIP (csvStruct,i);
					if(!rtnFlg) {
						conn.rollback();
						return false;
					}
				}
				
				// [�i�ڕʎd�|]�̒ǉ����s��
				rtnFlg = insertT_WORK_IN_PROC_BY_ITEM (csvStruct,i);
				if(!rtnFlg) {
					conn.rollback();
					return false;
				}
			}
			conn.commit();
			return true;
		} catch (Exception e) {
			conn.rollback();;
			throw new ExpjException(e);
		}
		
	}
	
	/**
	 * CSV�t�F�C�����e�́A��Ǝw���`�[�o�^����
	 * @param csvList
	 * @return
	 * @throws FoundationException 
	 */
	private boolean insertT_OPR_INST_SLIP (AD0150010Struct adstruct ,int j) throws ExpjException {
		try {
			if (isNull(adstruct.getOPR_INST_CD())) {
				// ��Ǝw���ԍ��̔ԏ������s���B
				CollectNumber OPR_INST_CD = 
						new CollectNumber(CollectNumber.INST_CD,
							this.sysUSER_CD, 
							this.sp.getProcId(), 
							this.sysPLANT_CD);
				String strOprInstCd = OPR_INST_CD.getNo();
				if (isNull(strOprInstCd)) {
					//�̔Ԍ��ʂ��Ȃ�
					csvExport(adstruct					// �Ώۃf�[�^���
							, "1"						// �G���[�敪
							, j + 1						// �G���[�����s
							,null
							,new ExpjMessage("ZZ01106").getMessage(_locale)
							,null);	// �G���[���b�Z�[�W
					_intErrorCount++;
					setReadStatus(ERROR);
					return false;
				} else {
					adstruct.setOPR_INST_CD(strOprInstCd);
				}
			}
			// ��Ǝw���ԍ������敪
			adstruct.setOPR_INST_CD_GNR_TYP("1");
			// ��Ǝw���`�[���s�ς݃t���O
			adstruct.setOPR_INST_SLIP_ISS_FLG("0");
			// �H��R�[�h
			adstruct.setPLANT_CD(sysPLANT_CD);
			
			// [��Ǝw���`�[]�ւ̒ǉ����e
			entity.minsertT_OPR_INST_SLIP.create(conn, adstruct);
			return true;
		}catch(Exception e) {
			throw new ExpjException(e);
		}
	}
	
	/**
	 * CSV�t�F�C�����e�́A�i�ڕʎd�|�o�^����
	 * @param csvList
	 * @return
	 * @throws FoundationException 
	 */
	private boolean insertT_WORK_IN_PROC_BY_ITEM (AD0150010Struct adstruct ,int j) throws ExpjException {
		try {
			if (isNull(adstruct.getWORK_ODR_CD())) {
				// ��ƌv��ԍ��̔ԏ������s���B
				CollectNumber OPR_INST_CD = 
						new CollectNumber(CollectNumber.ODR_CD,
							this.sysUSER_CD, 
							this.sp.getProcId(), 
							this.sysPLANT_CD);
				String strWorkOdrCd = OPR_INST_CD.getNo();
				if (isNull(strWorkOdrCd)) {
					//�̔Ԍ��ʂ��Ȃ�
					csvExport(adstruct					// �Ώۃf�[�^���
							, "1"						// �G���[�敪
							, j + 1						// �G���[�����s
							,null
							,new ExpjMessage("ZZ01106").getMessage(_locale)
							,null);	// �G���[���b�Z�[�W
					_intErrorCount++;
					setReadStatus(ERROR);
					return false;
				} else {
					adstruct.setWORK_ODR_CD(strWorkOdrCd);
				}
			}
			// ���t�^�̓]��
			if (adstruct.getWORK_ODR_DLV_DATE().length()<=10) {
				// ��Ɛ����[��
				adstruct.setWORK_ODR_DLV_DATE(adstruct.getWORK_ODR_DLV_DATE() + " " + WORK_ODR_DLV_DATE_TIME);
			}
			if (adstruct.getOPR_INST_START_DATE().length()<=10) {
				// ��Ɛ��������
				adstruct.setOPR_INST_START_DATE(adstruct.getOPR_INST_START_DATE() + " " + OPR_INST_START_DATE_TIME);
			}
			
			// ��Ǝw����
			// [�i��].�݌ɐ��ʒP�ʋ敪=1�Łu��Ǝw�����v�ɏ��������͂��ꂽ�ꍇ�A
			// �؂�グ����������
			BigDecimal OprInstQty_up = new BigDecimal(adstruct.getOPR_INST_QTY());
			if ("1".equals(mItemStruct.getUNIT_QTY_TYP())) {
				BigDecimal OprInstQty2 = new BigDecimal("0");
				OprInstQty2 = OprInstQty_up.setScale(0,BigDecimal.ROUND_UP);
				//�؂�グ�����O�ƌ�Œl���قȂ��Ă�����
				//���������͂���Ă����Ɣ��f�����[�j���O
				if ( OprInstQty_up.doubleValue() != OprInstQty2.doubleValue()) {
					//	�i�ڂ������Ǘ��i�̏ꍇ�A�؏グ���s��
					OprInstQty_up = OprInstQty_up.setScale(0, BigDecimal.ROUND_UP);
				}
			}
			adstruct.setOPR_INST_QTY(OprInstQty_up.toString());
			// �i�ڕʍ�Ə�ԋ敪
			adstruct.setWORK_STS_TYP("1");
			// ��ƌn��W�J�σt���O
			adstruct.setPROC_EXPLOSION_FLG("0");
			
			// �i�ڕʍ�Ǝ��ы敪
			adstruct.setOPR_RSLT_TYP(mItemStruct.getOPR_RSLT_TYP());
			
			// ��Ǝw���ԍ�
			// [�i��].�g��Ǝ��ы敪�h���A1�F�o�������� �̏ꍇ�A�u��Ǝw���ԍ��v
			if ("1".equals(mItemStruct.getOPR_RSLT_TYP())) {
				
			}else if ("2".equals(mItemStruct.getOPR_RSLT_TYP())) {
				// 2�F��Ǝw�����с@�̏ꍇ�ANull
				adstruct.setOPR_INST_CD("");
			}
			// �H��R�[�h
			adstruct.setPLANT_CD(sysPLANT_CD);
			
			// [�i�ڕʎd�|]�ւ̒ǉ����e
			entity.minsertT_WORK_IN_PROC_BY_ITEM.create(conn, adstruct);
			return true;
		}catch(Exception e) {
			throw new ExpjException(e);
		}
	}
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Q�ƃ{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlBrowse() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0150");
		logger.entering("AD0150010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");
			//{{user_implement_dev:<controlBrowse>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlBrowse>
		logger.exiting("AD0150010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");

		return;
	}

	/**
	 * �捞�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCsvIn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0150");
		logger.entering("AD0150010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");
			//{{user_implement_dev:<controlCsvIn>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			try {
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
				
				// �b�r�u�f�[�^�擾����
				if (listCsv != null) {
					
					// �b�r�u���ڂ̃`�F�b�N���� �b�r�u���ڂ̓o�^
					if (checkCsvData(listCsv)) {
						
						// �o�^����
						if(insertCsvDate(listCsv)) {
							// �G���[���Ȃ��ꍇ
							if (_intWarningCount== 0) {
								// ����Ɏ�荞�݂܂����B�i���� {0}���j
								setInfoMessage("AA01514", String.valueOf(_intSuccessCount));
							} else {
								// ��荞�݂܂������A���[�j���O������܂��B�i���� {0}���A���[�j���O {1}���j
								setWarningMessage("AA01515", String.valueOf(_intSuccessCount), String.valueOf(_intWarningCount));
							}
						} else {
							// �o�^���ɃG���[���������܂����B�w�肳�ꂽCSV�̃f�[�^�͓o�^����܂���ł����B
							setErrorMessage("AD34033");
						}
					} else {
						// �G���[������ꍇ
						// �G���[�f�[�^�����邽�ߎ�荞�݂܂���ł����B�i���� {0}���A���[�j���O {1}���A�G���[ {2}���j
						setErrorMessage("AA01516", String.valueOf(_intSuccessCount), String.valueOf(_intWarningCount), String.valueOf(_intErrorCount));
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
				setErrorMessage("ZZ01106");
				setReadStatus(ERROR);
			}
                //}}user_implement_dev:<controlCsvIn>
		logger.exiting("AD0150010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");

		return;
	}

	/**
	 * CSV�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCSVOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0150");
		logger.entering("AD0150010Control"+":USER="+struct.getsUser_ID(),"controlCSVOut");
			//{{user_implement_dev:<controlCSVOut>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			// CSV�o�͕��i��ݒ�
				csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));
				AD0150010Struct errorStruct = null;
				List csv = new ArrayList();	// CSV���
				// CSV�w�b�_�s��CSV���ɒǉ�
				String[] title = {
						 "Expj.Cmt3094"							// �G���[�ӏ�
						,"Expj.Cmt3095"							// �G���[�敪
						,"Expj.Cmt3098"							// �G���[���e
						,"Expj.Cmt6220"							// �G���[����
						,"Expj.ITEM_CD"							// �i�ڔԍ�
						,"Expj.WORK_ODR_DLV_DATE_3"				// �����[��
						,"Expj.PRD_START_DATE"					// ���������
						,"Expj.Cmt0634"							// ��Ǝw����
						,"Expj.WS_CD"							// ��Ƌ�R�[�h
						,"Expj.Cmt3156"							// ����
				};
				csv.add(title);
				// [���].�ꗗ���̃G���[����CSV���ɒǉ�
				for (int i = 0; i < list.size(); i++) {
					errorStruct = (AD0150010Struct)list.get(i);
					String[] data = {
							 errorStruct.getl_ERROR_IN()
							,errorStruct.getl_ERR_TYP()
							,errorStruct.getl_ERR_INFO()
							,errorStruct.getl_ERR_CTR_NM()
							,errorStruct.getl_ERR_ITEM_CD()
							,errorStruct.getl_ERR_PRD_DUE_DATE()
							,errorStruct.getl_ERR_PRD_START_DATE()
							,errorStruct.getl_ERR_OPR_INST_QTY()
							,errorStruct.getl_ERR_WS_CD()
							,errorStruct.getl_ERR_JOB_ODR_CD()
					};
					csv.add(data);
				}
				
				// CSV�t�@�C�����쐬
				csvWriter.write(csv, CoreTools.getLocale(struct.getsUser_ID()), true);
				// CSV�t�@�C�����N���C�A���g�ɏo��
				struct.setDOWNLOAD_FILE(getCsvWriter().getFilePath());
				
                //}}user_implement_dev:<controlCSVOut>
		logger.exiting("AD0150010Control"+":USER="+struct.getsUser_ID(),"controlCSVOut");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0150");
		logger.entering("AD0150010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			setList(null);
			// ������Ԃ��u������ԁv�ɐݒ�
			setReadStatus(INITIAL);
                //}}user_implement_dev:<controlClear>
		logger.exiting("AD0150010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0150");
		logger.entering("AD0150010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("AD0150010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * �{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlExecute() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0150");
		logger.entering("AD0150010Control"+":USER="+struct.getsUser_ID(),"controlExecute");
			//{{user_implement_dev:<controlExecute>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		    try{
		    	setReadStatus(INITIAL); 
		        // �o�b�`�����N���X��main����
		        String strBatchClassName = null;		// �Ăяo����N���X��
		        String strBatchProcessingTyp = null;	// �o�b�`�����敪
		        String strProgramId = null;			    // �Ɩ����iAD0080B001�j
		        String strUserId = null;				// ���[�UID
		        String strPlantCd = null;				// �H��R�[�h
		        String strCsvTakeTyp =null;             // CSV�捞����
		        // �����Z�b�g
		        strBatchClassName = "com.nec.jp.orteus.metamorBase.AD0150.AD0150B001.mainAD0150B001";
		        strBatchProcessingTyp = "2";					  // 2: �����^�]���Ȃ��i��ԃo�b�`�Ȃ��j
		        strProgramId = "AD0150B001";					  // �Ɩ����iAD0150B001�j
		        strUserId = getsysUSER_CD();					  // ���[�UID
		        strPlantCd = getsysPLANT_CD();					  // �H��R�[�h
		        strCsvTakeTyp ="1";                               // CSV�捞���� = 1:�Œ�t�@�C���捞
		        // �o�b�`���������s���� -------------------------------------------
		        ResourceBundle bundle = SystemConfig.getBundle();
		        String javaPath = SystemConfig.getProperty("JAVA_PATH", bundle);
		        if(javaPath == null){
		            //�V�X�e������l�t�@�C������̏��擾�Ɏ��s���܂���(�i�u�l�p�X)
		            setErrorMessage("ZZ09010");
		            return;
		           }
		        String ClassPath = SystemConfig.getProperty("CLASS_PATH", bundle);
		        if(ClassPath == null){
		        	//�V�X�e������l�t�@�C������̏��擾�Ɏ��s���܂���(�N���X�p�X)
		        	setErrorMessage("ZZ09012");
		            return;
		        }
		        String batchPath = SystemConfig.getProperty("BATCH_PATH", bundle);
		        if(batchPath == null){        	
		            //�V�X�e������l�t�@�C������̏��擾�Ɏ��s���܂���(�o�b�`�N���ݒ�)        	
		        	setErrorMessage("ZZ09011");
		            return;
		        }
		    
		        String heapSize = SystemConfig.getProperty("HIGH_HEAP_SIZE",bundle); 
		        if (heapSize == null) {
		            //�V�X�e������l�t�@�C������̏��擾�Ɏ��s���܂���(�o�b�`�q�[�v�T�C�Y�ݒ�)
		        	setErrorMessage("ZZ09017");
		            return;
		           }
		        List buffer = new ArrayList();
				buffer.add(javaPath);            // �i�u�l
				buffer.add("-cp");
				buffer.add(ClassPath);           // Java ClassPath
				buffer.add("-Dcom.nec.jp.orteus.util.logging.config.file="+batchPath); // �N���ݒ�
				buffer.add(strBatchClassName);                       // �Ăяo����N���X
				buffer.add(strBatchProcessingTyp);                   // �o�b�`�����敪
				buffer.add(strUserId);                               // ���[�UID
				buffer.add(strProgramId);                            // �Ɩ�ID
				buffer.add(strPlantCd);                              // �H��R�[�h
				buffer.add(strCsvTakeTyp);                           // CSV�捞����		
				try {
					// �o�b�`�������s
					Runtime runtime = Runtime.getRuntime();
					runtime.exec((String[])buffer.toArray(new String[buffer.size()]));
				} catch (IOException e) {	        	
			        // �o�b�`�Ăяo�����s�̏ꍇ�A��ʃ��b�Z�[�W��\������B
					setErrorMessage("ZZ09014");
					return;
		        }	    
		        // �o�b�`�Ăяo�������̏ꍇ�A��ʃ��b�Z�[�W��\������B
				setInfoMessage2("ZZ09013");
		    }catch(Exception e){			
				e.printStackTrace();
				setErrorMessage("ZZ01106");
			
			}
		    	
                //}}user_implement_dev:<controlExecute>
		logger.exiting("AD0150010Control"+":USER="+struct.getsUser_ID(),"controlExecute");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0150");
		logger.entering("AD0150010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AD0150010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0150");
		logger.entering("AD0150010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			// �f�[�^�x�[�X�ւ̃A�N�Z�X���s���ꍇ�́A����try catch���̃R�����g���O���Ă��������B
		try{
			// �H��R�[�h���Z�b�g����B
			this.struct.setPLANT_CD(this.sysPLANT_CD);
			
			// �Ɩ��^�p���擾
			try {
				DateCtrlStruct dateCtrl = DateCtrlControl.getData(conn, getsysPLANT_CD());
				_btmBusinessOprDate = dateCtrl.getBUSINESS_OPR_DATE();
			} catch(DataNotFoundException e) {
				ExpjMessage emsg = new ExpjMessage("AC34080" );
				sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
				ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
				setReadStatus(ERROR);
				throw ee;
			}
			
			//�����Ǘ��p�����[�^�擾
			List listTimeCtrl = entity.mselectTIME_CTRL.read(conn,struct);
			if(listTimeCtrl.isEmpty()){
				struct.setTIME_CTRL("false");
				_flgTimeCtrl = "false";
			}else{
				struct.setTIME_CTRL(((AD0150010Struct)listTimeCtrl.get(0)).getTIME_CTRL());
				_flgTimeCtrl = struct.getTIME_CTRL();
			}
			
			// �R���{�{�b�N�X�f�[�^�p��
	 		ComboBox combBox = new ComboBox(conn, sysUSER_CD);
			// �R���{�{�b�N�X�̃f�[�^���擾
			_COM_ERR_TYP = combBox.getData("ERR_TYP");

		} catch(SQLException e) {
			e.printStackTrace();
		}

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AD0150010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0150");
		logger.entering("AD0150010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
		logger.exiting("AD0150010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("Browse") ) {
				controlBrowse();
			} else if( button.equals("CsvIn") ) {
				controlCsvIn();
			} else if( button.equals("CSVOut") ) {
				controlCSVOut();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("Execute") ) {
				controlExecute();
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
//			throw new FoundationException("AD0150010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0150010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AD0150010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0150010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AD0150010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0150010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AD0150010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AD0150010Entity entity;
	protected AD0150010Struct struct;
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

		entity = new AD0150010Entity();
		struct = new AD0150010Struct();

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
	 * AD0150010�N���X�̕W���R���X�g���N�^
	 */
	public AD0150010Control() throws BusinessProcessException, FoundationException
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
				AD0150010Struct key = (AD0150010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("FileName") && key.getFileName() != null) {
					msgKey.setKeyValue("FileName", key.getFileName());
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
				if(msgKeyType.containsKeyColumn("l_ERR_INFO") && key.getl_ERR_INFO() != null) {
					msgKey.setKeyValue("l_ERR_INFO", key.getl_ERR_INFO());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_CTR_NM") && key.getl_ERR_CTR_NM() != null) {
					msgKey.setKeyValue("l_ERR_CTR_NM", key.getl_ERR_CTR_NM());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_ITEM_CD") && key.getl_ERR_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ERR_ITEM_CD", key.getl_ERR_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_PRD_DUE_DATE") && key.getl_ERR_PRD_DUE_DATE() != null) {
					msgKey.setKeyValue("l_ERR_PRD_DUE_DATE", key.getl_ERR_PRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_PRD_START_DATE") && key.getl_ERR_PRD_START_DATE() != null) {
					msgKey.setKeyValue("l_ERR_PRD_START_DATE", key.getl_ERR_PRD_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_OPR_INST_QTY") && key.getl_ERR_OPR_INST_QTY() != null) {
					msgKey.setKeyValue("l_ERR_OPR_INST_QTY", key.getl_ERR_OPR_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_WS_CD") && key.getl_ERR_WS_CD() != null) {
					msgKey.setKeyValue("l_ERR_WS_CD", key.getl_ERR_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_JOB_ODR_CD") && key.getl_ERR_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_ERR_JOB_ODR_CD", key.getl_ERR_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("w_COLUMN_FLG") && key.getw_COLUMN_FLG() != null) {
					msgKey.setKeyValue("w_COLUMN_FLG", key.getw_COLUMN_FLG());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD") && key.getOPR_INST_CD() != null) {
					msgKey.setKeyValue("OPR_INST_CD", key.getOPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD_GNR_TYP") && key.getOPR_INST_CD_GNR_TYP() != null) {
					msgKey.setKeyValue("OPR_INST_CD_GNR_TYP", key.getOPR_INST_CD_GNR_TYP());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_SLIP_ISS_DATE") && key.getOPR_INST_SLIP_ISS_DATE() != null) {
					msgKey.setKeyValue("OPR_INST_SLIP_ISS_DATE", key.getOPR_INST_SLIP_ISS_DATE());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_SLIP_ISS_FLG") && key.getOPR_INST_SLIP_ISS_FLG() != null) {
					msgKey.setKeyValue("OPR_INST_SLIP_ISS_FLG", key.getOPR_INST_SLIP_ISS_FLG());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_CD") && key.getWORK_ODR_CD() != null) {
					msgKey.setKeyValue("WORK_ODR_CD", key.getWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE") && key.getOPR_INST_START_DATE() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATE", key.getOPR_INST_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE") && key.getWORK_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("WORK_ODR_DLV_DATE", key.getWORK_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_QTY") && key.getOPR_INST_QTY() != null) {
					msgKey.setKeyValue("OPR_INST_QTY", key.getOPR_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP") && key.getOPR_RSLT_TYP() != null) {
					msgKey.setKeyValue("OPR_RSLT_TYP", key.getOPR_RSLT_TYP());
				}
				if(msgKeyType.containsKeyColumn("WORK_STS_TYP") && key.getWORK_STS_TYP() != null) {
					msgKey.setKeyValue("WORK_STS_TYP", key.getWORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("PROC_EXPLOSION_FLG") && key.getPROC_EXPLOSION_FLG() != null) {
					msgKey.setKeyValue("PROC_EXPLOSION_FLG", key.getPROC_EXPLOSION_FLG());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_DATE") && key.getOPR_INST_DATE() != null) {
					msgKey.setKeyValue("OPR_INST_DATE", key.getOPR_INST_DATE());
				}
				if(msgKeyType.containsKeyColumn("WORK_CMPLT_DATE") && key.getWORK_CMPLT_DATE() != null) {
					msgKey.setKeyValue("WORK_CMPLT_DATE", key.getWORK_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("WORK_IN_PROC_COMMENT") && key.getWORK_IN_PROC_COMMENT() != null) {
					msgKey.setKeyValue("WORK_IN_PROC_COMMENT", key.getWORK_IN_PROC_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("DUE_DATE") && key.getDUE_DATE() != null) {
					msgKey.setKeyValue("DUE_DATE", key.getDUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("PARENT_OD_NO") && key.getPARENT_OD_NO() != null) {
					msgKey.setKeyValue("PARENT_OD_NO", key.getPARENT_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("ODR_START_DATE") && key.getODR_START_DATE() != null) {
					msgKey.setKeyValue("ODR_START_DATE", key.getODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP") && key.getJOB_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_STS_TYP", key.getJOB_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE") && key.getJOB_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("JOB_ODR_DLV_DATE", key.getJOB_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP") && key.getJOB_ODR_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP", key.getJOB_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("HOLIDAY_FLG") && key.getHOLIDAY_FLG() != null) {
					msgKey.setKeyValue("HOLIDAY_FLG", key.getHOLIDAY_FLG());
				}
				if(msgKeyType.containsKeyColumn("DATE") && key.getDATE() != null) {
					msgKey.setKeyValue("DATE", key.getDATE());
				}
				if(msgKeyType.containsKeyColumn("FIXED_LT") && key.getFIXED_LT() != null) {
					msgKey.setKeyValue("FIXED_LT", key.getFIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("PROP_LT") && key.getPROP_LT() != null) {
					msgKey.setKeyValue("PROP_LT", key.getPROP_LT());
				}
				if(msgKeyType.containsKeyColumn("SAFETY_LT") && key.getSAFETY_LT() != null) {
					msgKey.setKeyValue("SAFETY_LT", key.getSAFETY_LT());
				}
				if(msgKeyType.containsKeyColumn("PROP_LOT_SIZE") && key.getPROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("PROP_LOT_SIZE", key.getPROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("vc2PLANT_CD") && key.getvc2PLANT_CD() != null) {
					msgKey.setKeyValue("vc2PLANT_CD", key.getvc2PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("TIME_CTRL") && key.getTIME_CTRL() != null) {
					msgKey.setKeyValue("TIME_CTRL", key.getTIME_CTRL());
				}
				if(msgKeyType.containsKeyColumn("count_JOB_ODR_ALC_CD") && key.getcount_JOB_ODR_ALC_CD() != null) {
					msgKey.setKeyValue("count_JOB_ODR_ALC_CD", key.getcount_JOB_ODR_ALC_CD());
				}
				if(msgKeyType.containsKeyColumn("DUE_DATE_BY_ALC") && key.getDUE_DATE_BY_ALC() != null) {
					msgKey.setKeyValue("DUE_DATE_BY_ALC", key.getDUE_DATE_BY_ALC());
				}
				if(msgKeyType.containsKeyColumn("DUE_DATE_BY_ALC_TIME") && key.getDUE_DATE_BY_ALC_TIME() != null) {
					msgKey.setKeyValue("DUE_DATE_BY_ALC_TIME", key.getDUE_DATE_BY_ALC_TIME());
				}
				if(msgKeyType.containsKeyColumn("count_OD_NO") && key.getcount_OD_NO() != null) {
					msgKey.setKeyValue("count_OD_NO", key.getcount_OD_NO());
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
					AD0150010Struct key = new AD0150010Struct();
					if(msgKeyType.containsKeyColumn("FileName")) {
						key.setFileName(msgKey.getKeyValue("FileName"));
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
					if(msgKeyType.containsKeyColumn("l_ERR_INFO")) {
						key.setl_ERR_INFO(msgKey.getKeyValue("l_ERR_INFO"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_CTR_NM")) {
						key.setl_ERR_CTR_NM(msgKey.getKeyValue("l_ERR_CTR_NM"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_ITEM_CD")) {
						key.setl_ERR_ITEM_CD(msgKey.getKeyValue("l_ERR_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_PRD_DUE_DATE")) {
						key.setl_ERR_PRD_DUE_DATE(msgKey.getKeyValue("l_ERR_PRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_PRD_START_DATE")) {
						key.setl_ERR_PRD_START_DATE(msgKey.getKeyValue("l_ERR_PRD_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_OPR_INST_QTY")) {
						key.setl_ERR_OPR_INST_QTY(msgKey.getKeyValue("l_ERR_OPR_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_WS_CD")) {
						key.setl_ERR_WS_CD(msgKey.getKeyValue("l_ERR_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_JOB_ODR_CD")) {
						key.setl_ERR_JOB_ODR_CD(msgKey.getKeyValue("l_ERR_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_COLUMN_FLG")) {
						key.setw_COLUMN_FLG(msgKey.getKeyValue("w_COLUMN_FLG"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD")) {
						key.setOPR_INST_CD(msgKey.getKeyValue("OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD_GNR_TYP")) {
						key.setOPR_INST_CD_GNR_TYP(msgKey.getKeyValue("OPR_INST_CD_GNR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_SLIP_ISS_DATE")) {
						key.setOPR_INST_SLIP_ISS_DATE(msgKey.getKeyValue("OPR_INST_SLIP_ISS_DATE"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_SLIP_ISS_FLG")) {
						key.setOPR_INST_SLIP_ISS_FLG(msgKey.getKeyValue("OPR_INST_SLIP_ISS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_CD")) {
						key.setWORK_ODR_CD(msgKey.getKeyValue("WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE")) {
						key.setOPR_INST_START_DATE(msgKey.getKeyValue("OPR_INST_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE")) {
						key.setWORK_ODR_DLV_DATE(msgKey.getKeyValue("WORK_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_QTY")) {
						key.setOPR_INST_QTY(msgKey.getKeyValue("OPR_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP")) {
						key.setOPR_RSLT_TYP(msgKey.getKeyValue("OPR_RSLT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("WORK_STS_TYP")) {
						key.setWORK_STS_TYP(msgKey.getKeyValue("WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PROC_EXPLOSION_FLG")) {
						key.setPROC_EXPLOSION_FLG(msgKey.getKeyValue("PROC_EXPLOSION_FLG"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_DATE")) {
						key.setOPR_INST_DATE(msgKey.getKeyValue("OPR_INST_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WORK_CMPLT_DATE")) {
						key.setWORK_CMPLT_DATE(msgKey.getKeyValue("WORK_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WORK_IN_PROC_COMMENT")) {
						key.setWORK_IN_PROC_COMMENT(msgKey.getKeyValue("WORK_IN_PROC_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("DUE_DATE")) {
						key.setDUE_DATE(msgKey.getKeyValue("DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_OD_NO")) {
						key.setPARENT_OD_NO(msgKey.getKeyValue("PARENT_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("ODR_START_DATE")) {
						key.setODR_START_DATE(msgKey.getKeyValue("ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP")) {
						key.setJOB_ODR_STS_TYP(msgKey.getKeyValue("JOB_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE")) {
						key.setJOB_ODR_DLV_DATE(msgKey.getKeyValue("JOB_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP")) {
						key.setJOB_ODR_TYP(msgKey.getKeyValue("JOB_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("HOLIDAY_FLG")) {
						key.setHOLIDAY_FLG(msgKey.getKeyValue("HOLIDAY_FLG"));
					}
					if(msgKeyType.containsKeyColumn("DATE")) {
						key.setDATE(msgKey.getKeyValue("DATE"));
					}
					if(msgKeyType.containsKeyColumn("FIXED_LT")) {
						key.setFIXED_LT(msgKey.getKeyValue("FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("PROP_LT")) {
						key.setPROP_LT(msgKey.getKeyValue("PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("SAFETY_LT")) {
						key.setSAFETY_LT(msgKey.getKeyValue("SAFETY_LT"));
					}
					if(msgKeyType.containsKeyColumn("PROP_LOT_SIZE")) {
						key.setPROP_LOT_SIZE(msgKey.getKeyValue("PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("vc2PLANT_CD")) {
						key.setvc2PLANT_CD(msgKey.getKeyValue("vc2PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("TIME_CTRL")) {
						key.setTIME_CTRL(msgKey.getKeyValue("TIME_CTRL"));
					}
					if(msgKeyType.containsKeyColumn("count_JOB_ODR_ALC_CD")) {
						key.setcount_JOB_ODR_ALC_CD(msgKey.getKeyValue("count_JOB_ODR_ALC_CD"));
					}
					if(msgKeyType.containsKeyColumn("DUE_DATE_BY_ALC")) {
						key.setDUE_DATE_BY_ALC(msgKey.getKeyValue("DUE_DATE_BY_ALC"));
					}
					if(msgKeyType.containsKeyColumn("DUE_DATE_BY_ALC_TIME")) {
						key.setDUE_DATE_BY_ALC_TIME(msgKey.getKeyValue("DUE_DATE_BY_ALC_TIME"));
					}
					if(msgKeyType.containsKeyColumn("count_OD_NO")) {
						key.setcount_OD_NO(msgKey.getKeyValue("count_OD_NO"));
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
