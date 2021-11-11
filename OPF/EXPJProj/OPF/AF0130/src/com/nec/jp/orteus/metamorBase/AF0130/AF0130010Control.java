/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0130/src/com/nec/jp/orteus/metamorBase/AF0130/AF0130010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AF0130;

import com.nec.jp.orteus.metamorBase.AF0130.*;
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
import java.math.BigDecimal;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlStruct;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import com.nec.jp.orteus.expj.pr.rcvissue.common.UpdateInfo;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueInstStruct;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueRemain;
import com.nec.jp.orteus.expj.pr.rcvissue.process.WhAutoIssueProc;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

import com.nec.jp.orteus.expj.pr.rcvissue.process.JobOdrAlc;

import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueProcess;
import com.nec.jp.orteus.expj.pr.rcvissue.process.RcvProcess;
import com.nec.jp.orteus.expj.util.Calculate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AF0130010Control �N���X
 *      �}�j���A���o�Ɏ���CSV�捞
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.6 $ $Date: 2016/05/23 08:18:04 $
 *
 */
//}}user_implement_code_header

public class AF0130010Control
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
	public AF0130010Struct getListvalue(int x) { return (AF0130010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AF0130010Struct getStruct() { return this.struct; }	// Struct�̒l��Ԃ��܂��B
	public AF0130010Struct createStruct() { return new AF0130010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AF0130010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
	// CSV�o�͗p���X�g
	

	/**�S�����R�[�h��**/
	private int _intTotalCount = 0; 
	/**�G���[���R�[�h����**/
	private int _intErrorCount = 0;  
	/**���탌�R�[�h����**/
	private int _intSuccessCount = 0;
	/**���[�j���O����**/
	private int _intWarningCount = 0;
	/**���[�j���O����**/
	private int _intWarningCount1 = 0;
	private boolean warningFlg = false;
	
	/** �b�r�u���ڔԍ���` */
	// �o�Ɏw���ԍ�
	private final int CSV_ISSUE_INST_CD = 0;
	//MOD START 20141208 fei-hy
	// �i�ڔԍ�
	private final int CSV_ITEM_CD = 1;
	// ����
	private final int CSV_OB_ODR_CD = 2;
	//private final int CSV_OB_ODR_CD = 3;
	// �o�Ɍ��ۊǋ�R�[�h
	private final int CSV_ISSUE_WH_CD = 3;
	//private final int CSV_ISSUE_WH_CD = 4;
	// �݌Ƀ��b�g�ԍ�
	private final int CSV_STOCK_LOT_CD = 4;
	//private final int CSV_STOCK_LOT_CD = 5;
	// �o�ɐ�
	private final int CSV_ISSUE_QTY = 5;
	//private final int CSV_ISSUE_QTY = 6;
	// �o�ɓ�
	private final int CSV_ISSUE_DATE = 6;
	//private final int CSV_ISSUE_DATE = 7;
	// �o�Ɋ���
	private final int CSV_ISSUE_CMPLT_FLG = 7;
	//private final int CSV_ISSUE_CMPLT_FLG = 8;
	// �o�ɐ�ۊǋ�R�[�h
	private final int CSV_RCV_WH_CD = 8;
	//private final int CSV_RCV_WH_CD = 9;
	// ���[�J���b�g�ԍ�
	private final int CSV_VEND_LOT_NO = 9;
	//private final int CSV_VEND_LOT_NO = 10;

	// �b�r�u�捞�f�[�^�K�v���ڐ�(���v)
	private final int CSV_NECESSARY_COLUMN = 10;
	//private final int CSV_NECESSARY_COLUMN = 11;
	//MOD END 20141208 fei-hy
	
	// �G���[���b�Z�[�W
	private ExpjMessage _emsg = null;

	/*��ЃR�[�h*/
	public String _company_cd = null;

	// �ݒ�l
	private String strValus = null;
	private String _wh_cd = null;
	private String  _ctrlCd = null;
	
	// �����ꍀ�ڎ擾�Ή�
	private String _locale = CoreTools.getLocale(sysUSER_CD);
	ResourceBundle _resource = CoreTools.getResourceBundle("OrteusUserDic", _locale);

	/** �Ɩ��^�p��*/
	private String _btmBusinessOprDate;
	
	// �R���{�{�b�N�X��`
	// �G���[��ԋ敪
	private ComboStruct _COM_ERR_TYP = null;
	
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
	 * �Ɩ����W�b�N�̃G���[���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * @param code ���b�Z�[�W�R�[�h
	 * @param value1 �u��������P
	 */
	private void setErrorMessage(String code, String value1) {
		ExpjMessage emsg = new ExpjMessage(code, value1);
		msgStruct.addError(emsg);
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
	 * �Ɩ����W�b�N�̃C���t�H���[�V�����ݒ菈����؂�o���Ċ֐���
	 * @param code
	 */
	private void setInfoMessage2(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
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
	 * ����(\\)�ϊ��A�u\\�v�Ȃ�A�u\�v���폜����
	 * 
	 * @param in
	 *            ������
	 * @return �ҏW�㕶����
	 */
	private String replaceSlashSub(String in) {
		if (in == null)
			return null;
		return in.replaceAll("\\\\\\\\", "\\\\");
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
	 * ���ی����Ǘ��p�����[�^�̑Ώ۔N�����擾
	 * @param in �`�F�b�N��
	 * @param in �`�F�b�N�H��R�[�h
	 * @param in AD0050010Struct
	 * @param in AD0050010Entity
	 * �߂�l �`�F�b�N����
	 */
	private boolean checkProcExecDate(String checkDate,String plantCD, AF0130010Struct struct) throws BusinessProcessException, FoundationException {
		boolean checkResult = true;
		try {
			
			struct.setPLANT_CD(plantCD);
			List procExecDateList = entity.mselectSYS_ACTUAL_COST_CTRL_AC.read(conn, struct);
			// ���ی����Ǘ��p�����[�^�ɑ��݂��Ȃ�
			if(procExecDateList == null || procExecDateList.isEmpty()){
				return true;
			}
			AF0130010Struct procExecDateStruct = (AF0130010Struct) procExecDateList.get(0);
			BigDecimal date = new BigDecimal(procExecDateStruct.getPROC_EXEC_DATE());
			BigDecimal input = new BigDecimal(chageDate(checkDate).substring(0,4) + chageDate(checkDate).substring(5,7));
			if(input.compareTo(date) >= 0){
				checkResult = true;
			}else{
				//���ߋ��̏ꍇ
				checkResult = false;
			}
		}catch(Exception e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage("ZZ01006", e.toString());
			msgStruct.addError(emsg);
			sysLog.warning(emsg, getsysUSER_CD());
			e.printStackTrace();
		}
		return checkResult;
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

	/*
	 * ����������ꍇ�A�������
	 * 
	 * @param dataSource String
	 * 
	 * @return ����
	 */
	private String subDate(String dataSource) {
		String reg = "[0-9]{4}\\/[0-9]{1,2}\\/[0-9]{1,2}";

		Pattern pattern = Pattern.compile (reg);
		Matcher matcher = pattern.matcher (dataSource);
		while (matcher.find ()) {
			dataSource = matcher.group ();
		}

		return dataSource;
	}
	
	/*
	 * �����̃`�F�b�N
	 * 
	 * @param dataSource String
	 * 
	 * @return true or false boolean true�̏ꍇ�@�����ł��A�@false�̏ꍇ�A�����ł͂Ȃ�
	 */
	private String chageDate(String dataSource) {
		String dataEnd = "";
		if (dataSource.matches("^^\\d{4}\\/\\d{2}\\/\\d{2}$")) {
			dataEnd = dataSource;
		} else if (dataSource.matches("^^\\d{4}\\/\\d{1}\\/\\d{1}$")) {
			dataEnd = dataSource.substring(0, 5) + "0"+dataSource.substring(5, 7)+"0"+dataSource.substring(7, 8);

		} else if (dataSource.matches("^^\\d{4}\\/\\d{2}\\/\\d{1}$")) {
			dataEnd = dataSource.substring(0, 5) + dataSource.substring(5, 8)+ "0" + dataSource.substring(8, 9);

		} else if (dataSource.matches("^^\\d{4}\\/\\d{1}\\/\\d{2}$")) {
			dataEnd = dataSource.substring(0, 5) + "0" + dataSource.substring(5, 7) + dataSource.substring(7, 9);
		}
		return dataEnd;
	}
	/**
	 * ���l�`�F�b�N ���ڂ����l�����f����
	 * 
	 * @param strInString
	 *            ���̓p�����[�^
	 * @return ����:true / �G���[:false
	 */
	public static boolean isDigitChk(String strInString) {
		if (strInString.matches("[0-9]*")) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * �֑������`�F�b�N(�u_�v �u"�v�u\�v)
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
	/*
	 * �����̃`�F�b�N
	 * 
	 * @param dataSource String
	 * 
	 * @return true or false boolean true�̏ꍇ�@�����ł��A�@false�̏ꍇ�A�����ł͂Ȃ�
	 */
	private boolean checkDate(String dataSource) {
		String flag = "";
		String dataType = "";
		String regex = "^[1-9]\\d{3}\\/(0?[1-9]|1[0-2])\\/(0?[1-9]|[12]\\d|3[01])\\s*(0?[0-9]|1\\d|2[0-3])(\\:(0?[0-9]|[1-5]\\d)){2}$";
		String regex1 = "^[1-9]\\d{3}\\/(0?[1-9]|1[0-2])\\/(0?[1-9]|[12]\\d|3[01])\\s*(0?[0-9]|1\\d|2[0-3])(\\:(0?[0-9]|[1-5]\\d))$";
		String regex2 = "^[1-9]\\d{3}\\/(0?[1-9]|1[0-2])\\/(0?[1-9]|[12]\\d|3[01])$";

		if (dataSource.matches (regex)) {
			// yyyy/MM/dd HH:mm:ss �̌`��
			flag = "true";
			dataType = "1";
		} else if (dataSource.matches (regex1)) {
			// yyyy/MM/dd HH:mm �̌`��
			flag = "true";
			dataType = "2";
		} else if (dataSource.matches (regex2)) {
			// yyyy/MM/dd �̌`��
			flag = "true";
			dataType = "3";
		} else {
			flag = "false";
		}

		if ("true".equals(flag)) {
			try {
				SimpleDateFormat dateFormat = null;
				if ("1".equals(dataType)) {
					dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
				}
				if ("2".equals(dataType)) {
					dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
				}
				if ("3".equals(dataType)) {
					dateFormat = new SimpleDateFormat("yyyy/MM/dd");
				}
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
	 * 
	 * @param csvList
	 * @return
	 * @throws BusinessProcessException
	 * @throws FoundationException
	 */
	private boolean checkCsvData(List csvList) throws BusinessProcessException, FoundationException {


		// �S�����R�[�h��
		_intTotalCount = csvList.size();
		AF0130010Struct csvStruct = new AF0130010Struct();
		try {
			for (int i = 0; i < csvList.size(); i++)	{
				warningFlg = false;
				boolean lotWarningFlg = false;
				
				csvStruct = (AF0130010Struct) csvList.get(i);
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
							, null						// �G���[���ږ�
							, _emsg.getMessage(_locale) // �G���[���b�Z�[�W
							, null
							); 
					_intErrorCount++;
					continue;
				}
			   AF0130010Struct mItemStruct = new AF0130010Struct();
			   AF0130010Struct tIssueinstStruct = new AF0130010Struct();
			   AF0130010Struct tlotcrtl  =new AF0130010Struct();
				// �ȉ��o�Ɏw���ԍ��̃`�F�b�N
				// �o�Ɏw���ԍ��A NULL�̏ꍇ
				if (isNull(csvStruct.getISSUE_INST_CD())) {
					csvExport(csvStruct						// �Ώۃf�[�^���
							, "1"							// �G���[�敪
							, i + 1							// �G���[�����s
							, "Expj.ISSUE_INST_CD"			// �G���[���ږ�
							, new ExpjMessage("AE00095").getMessage(_locale)		// �G���[���b�Z�[�W
							, null
							); 
					_intErrorCount++;
					continue;
				}else{
					// �o�Ɏw���ԍ��A����3���ȏ�̏ꍇ
					if (strLengthChk(csvStruct.getISSUE_INST_CD()) >= 26){
						csvExport(csvStruct						// �Ώۃf�[�^���
								, "1"							// �G���[�敪
								, i + 1							// �G���[�����s
								, "Expj.ISSUE_INST_CD"			// �G���[���ږ�
								, new ExpjMessage("AA01501").getMessage(_locale)		// �G���[���b�Z�[�W
								, null
								); 
						_intErrorCount++;
						continue;
					}
					// �o�Ɏw���ԍ��A�֑����������͂���Ă����ꍇ
					if (chkHankaku(csvStruct.getISSUE_INST_CD())) {
						csvExport(csvStruct						// �Ώۃf�[�^���
								, "1"							// �G���[�敪
								, i + 1							// �G���[�����s
								, "Expj.ISSUE_INST_CD"			// �G���[���ږ�
								, new ExpjMessage("AA01524").getMessage(_locale)		// �G���[���b�Z�[�W
								, null
								); 
						_intErrorCount++;
						continue;
					}
				}
				
				// �ȉ����Ԃ̃`�F�b�N
				if (!isNull(csvStruct.getJOB_ODR_CD())) {
					// ���ԁA����26���ȏ�̏ꍇ
					if (strLengthChk(csvStruct.getJOB_ODR_CD()) >= 26){
						csvExport(csvStruct						// �Ώۃf�[�^���
								, "1"							// �G���[�敪
								, i + 1							// �G���[�����s
								, "Expj.JOB_ODR_CD"			// �G���[���ږ�
								, new ExpjMessage("AH00025").getMessage(_locale)		// �G���[���b�Z�[�W
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
								, "Expj.JOB_ODR_CD"			// �G���[���ږ�
								, new ExpjMessage("AA01524").getMessage(_locale)		// �G���[���b�Z�[�W
								, null
								); 
						_intErrorCount++;
						continue;
					}				
				} else {
					csvStruct.setJOB_ODR_CD("");
				}
				// �ȉ��o�Ɍ��ۊǋ�R�[�h�̃`�F�b�N
				// �o�Ɍ��ۊǋ�R�[�h�ANULL�̏ꍇ
				if (isNull(csvStruct.getWH_CD())) {
					csvExport(csvStruct						// �Ώۃf�[�^���
							, "1"							// �G���[�敪
							, i + 1							// �G���[�����s
							, "Expj.ISSUE_WH_CD_1"				// �G���[���ږ�
							, new ExpjMessage("AF00027").getMessage(_locale)		// �G���[���b�Z�[�W
							, null
							); 
					_intErrorCount++;
					continue;
				}else{
					// �o�Ɍ��ۊǋ�R�[�h�A����26���ȏ�̏ꍇ
					if (strLengthChk(csvStruct.getWH_CD()) >= 26) {
						csvExport(csvStruct						// �Ώۃf�[�^���
								, "1"							// �G���[�敪
								, i + 1							// �G���[�����s
								, "Expj.ISSUE_WH_CD_1"				// �G���[���ږ�
								, new ExpjMessage("AA01501").getMessage(_locale)		// �G���[���b�Z�[�W
								, null
								); 
						_intErrorCount++;
						continue;
					}
					// �o�Ɍ��ۊǋ�R�[�h�A�֑����������͂���Ă����ꍇ
					if (chkHankaku(csvStruct.getWH_CD())) {
						csvExport(csvStruct						// �Ώۃf�[�^���
								, "1"							// �G���[�敪
								, i + 1							// �G���[�����s
								, "Expj.ISSUE_WH_CD_1"				// �G���[���ږ�
								, new ExpjMessage("AA01524").getMessage(_locale)		// �G���[���b�Z�[�W
								, null
								); 
						_intErrorCount++;
						continue;
					}
				}
				// �ȉ��݌Ƀ��b�g�ԍ��̃`�F�b�N
				// �݌Ƀ��b�g�ԍ��A����26���ȏ�̏ꍇ
				if(!isNull(csvStruct.getLOT_NO())){
					if (strLengthChk(csvStruct.getLOT_NO()) >= 26) {
						csvExport(csvStruct							// �Ώۃf�[�^���
								, "1"								// �G���[�敪
								, i + 1								// �G���[�����s
								, "Expj.STOCK_LOT_CD"		// �G���[���ږ�
								, new ExpjMessage("AA01501").getMessage(_locale)			// �G���[���b�Z�[�W
								, null
								); 	
						_intErrorCount++;
						continue;
					}
					// �݌Ƀ��b�g�ԍ��A�֑����������͂���Ă����ꍇ
					if (chkHankaku(csvStruct.getLOT_NO())) {
						csvExport(csvStruct							// �Ώۃf�[�^���
								, "1"								// �G���[�敪
								, i + 1								// �G���[�����s
								, "Expj.STOCK_LOT_CD"		// �G���[���ږ�
								, new ExpjMessage("AA01524").getMessage(_locale)			// �G���[���b�Z�[�W
								, null
								); 
						_intErrorCount++;
						continue;
					}
				}
				
				
				// �ȉ��o�ɐ��̃`�F�b�N
				// �o�ɐ��ANULL�̏ꍇ
				if (isNull(csvStruct.getISSUE_QTY())) {
					csvExport(csvStruct
							 , "1"								// �G���[�敪
							 , i + 1							// �G���[�s�ԍ�
							 , "Expj.ISSUE_QTY"					// �G���[���ږ�
							 , new ExpjMessage("AF00181").getMessage(_locale)// �G���[���b�Z�[�W
							 , null 
							);	
					_intErrorCount++;
					continue;
				}else{
					// �o�ɐ��A���l�ȊO�̏ꍇ
					if (!isNumChk(csvStruct.getISSUE_QTY())) {
						csvExport(csvStruct
								 , "1"								// �G���[�敪
								 , i + 1							// �G���[�s�ԍ�
								 , "Expj.ISSUE_QTY"					// �G���[���ږ�
								 , new ExpjMessage("AF00058").getMessage(_locale)// �G���[���b�Z�[�W
								 , null 
								);	
						_intErrorCount++;
						continue;
					}
					// �o�ɐ��A0�����̏ꍇ
					if (Calculate.compare(csvStruct.getISSUE_QTY(), "0") == -1) {
						csvExport(csvStruct
								 , "1"								// �G���[�敪
								 , i + 1							// �G���[�s�ԍ�
								 , "Expj.ISSUE_QTY"				// �G���[���ږ�
								 , new ExpjMessage("AF00055").getMessage(_locale)// �G���[���b�Z�[�W
								 , null
								);	
						_intErrorCount++;
						continue;
					}
					// �o�ɐ��A������15���ȏ�A�܂��́A�����_�ȉ�5���ȏ�̏ꍇ
					if (!isNotInNumRange(csvStruct.getISSUE_QTY(), 14, 4)) {
						csvExport(csvStruct
								 , "1"								// �G���[�敪
								 , i + 1							// �G���[�s�ԍ�
								 , "Expj.ISSUE_QTY"				// �G���[���ږ�
								 , new ExpjMessage("AA01501").getMessage(_locale)	// �G���[���b�Z�[�W
								 , null
								 );
						_intErrorCount++;
						continue;
					}
				}
				
				// �ȉ��o�ɓ��̃`�F�b�N
				// �o�ɓ��ANULL�̏ꍇ
				if (isNull(csvStruct.getISSUE_DATE())) {
					csvExport(csvStruct
							 , "1"								// �G���[�敪
							 , i + 1							// �G���[�s�ԍ�
							 , "Expj.ISSUE_DATE"				// �G���[���ږ�
							 , new ExpjMessage("AE00051").getMessage(_locale)// �G���[���b�Z�[�W
							, null
							 );	
					_intErrorCount++;
					continue;
				}else{
					// �o�ɓ��A���t�^�łȂ��ꍇ
					if (!checkDate(csvStruct.getISSUE_DATE())) {
						csvExport(csvStruct
								 , "1"								// �G���[�敪
								 , i + 1							// �G���[�s�ԍ�
								 , "Expj.ISSUE_DATE"				// �G���[���ږ�
								 , new ExpjMessage("AA01606").getMessage(_locale)// �G���[���b�Z�[�W
								 , null
								 );	
						_intErrorCount++;
						continue;
					} else {
						// �o�ɓ��Ɏ�����������ꍇ�A���������
						csvStruct.setISSUE_DATE_SUB(subDate(csvStruct.getISSUE_DATE()));
					}
				}
				
				// �ȉ��o�Ɋ����̃`�F�b�N
				//  �o�Ɋ����ANULL�̏ꍇ
				if (isNull(csvStruct.getISSUE_CMPLT_FLG())) {
					csvExport(csvStruct						// �Ώۃf�[�^���
							, "1"							// �G���[�敪
							, i + 1							// �G���[�����s
							, "Expj.ISSUE_CMPLT_FLG_2"			// �G���[���ږ�
							, new ExpjMessage("AF00185").getMessage(_locale)		// �G���[���b�Z�[�W
							, null
							); 
					_intErrorCount++;
					continue;
				}else{
					// �o�Ɋ����A���l�ȊO�̏ꍇ
					if (!isNumChk(csvStruct.getISSUE_CMPLT_FLG())) {
						csvExport(csvStruct
								, "1"										// �G���[�敪
								, i + 1										// �G���[�s�ԍ�
								, "Expj.ISSUE_CMPLT_FLG_2"					// �G���[���ږ�
								, new ExpjMessage("AA01503").getMessage(_locale)// �G���[���b�Z�[�W
								, null);	
						_intErrorCount++;
						continue;
					}
					// �o�Ɋ����ANull�ł͂Ȃ��A���A�i0,1�j�ȊO�̏ꍇ
					if (!"0".equals(csvStruct.getISSUE_CMPLT_FLG()) && !"1".equals(csvStruct.getISSUE_CMPLT_FLG())) {
						csvExport(csvStruct
								, "1"										// �G���[�敪
								, i + 1										// �G���[�s�ԍ�
								, "Expj.ISSUE_CMPLT_FLG_2"					// �G���[���ږ�
								, new ExpjMessage("AF00186").getMessage(_locale)// �G���[���b�Z�[�W
								, null);	
						_intErrorCount++;
						continue;
					}
				}
				// �ȉ��o�ɐ�ۊǋ�R�[�h�̃`�F�b�N
				if (!isNull(csvStruct.getRCV_WH_CD())) {
					// �o�ɐ�ۊǋ�R�[�h�A����26���ȏ�̏ꍇ
					if (strLengthChk(csvStruct.getRCV_WH_CD()) >=26) {
						csvExport(csvStruct
								, "1"										// �G���[�敪
								, i + 1										// �G���[�s�ԍ�
								, "Expj.RCV_WH_CD_1"					// �G���[���ږ�
								, new ExpjMessage("AA01501").getMessage(_locale)// �G���[���b�Z�[�W
								, null);	
						_intErrorCount++;
						continue;
					}
					// �o�ɐ�ۊǋ�R�[�h�A�֑����������͂���Ă����ꍇ
					if (chkHankaku(csvStruct.getRCV_WH_CD())) {
						csvExport(csvStruct
								, "1"										// �G���[�敪
								, i + 1										// �G���[�s�ԍ�
								, "Expj.RCV_WH_CD_1"					// �G���[���ږ�
								, new ExpjMessage("AA01524").getMessage(_locale)// �G���[���b�Z�[�W
								, null);	
						_intErrorCount++;
						continue;
					}
				}

				// �ȉ����[�J���b�g�ԍ��̃`�F�b�N
				if (!isNull(csvStruct.getVEND_LOT_NO())) {
					// ���[�J���b�g�ԍ��A����26���ȏ�̏ꍇ
					if (strLengthChk(csvStruct.getVEND_LOT_NO()) >=26) {
						csvExport(csvStruct
								, "1"										// �G���[�敪
								, i + 1										// �G���[�s�ԍ�
								, "Expj.VEND_LOT_NO"					// �G���[���ږ�
								, new ExpjMessage("AA01501").getMessage(_locale)// �G���[���b�Z�[�W
								, null);	
						_intErrorCount++;
						continue;
					}
					// ���[�J���b�g�ԍ��A�֑����������͂���Ă����ꍇ
					if (chkHankaku(csvStruct.getVEND_LOT_NO())) {
						csvExport(csvStruct
								, "1"										// �G���[�敪
								, i + 1										// �G���[�s�ԍ�
								, "Expj.VEND_LOT_NO"					// �G���[���ږ�
								, new ExpjMessage("AA01524").getMessage(_locale)// �G���[���b�Z�[�W
								, null);	
						_intErrorCount++;
						continue;
					}
				}
				
				// �}�X�^�������`�F�b�N
				//�u�o�Ɏw���ԍ��v �ւ̓��͒l��[�o�Ɏw��]�ɑ��݂��Ȃ��ꍇ
				List issueinstcd = entity.mselect_T_ISSUE_INST1.read(conn, csvStruct);
				if(issueinstcd.isEmpty()){
					csvExport(csvStruct
							, "1"													// �G���[�敪
							, i + 1													// �G���[�s�ԍ�
							, "Expj.ISSUE_INST_CD"										// �G���[���ږ�
							, new ExpjMessage("AF00007").getMessage(_locale)
							, null);		// �G���[���b�Z�[�W
					_intErrorCount++;
					continue;
				}else{
					tIssueinstStruct = (AF0130010Struct)issueinstcd.get(0);
					//[�o�Ɏw��].�g�H��R�[�h�h �� ���O�C���������[�U�[�̍H��R�[�h�Ɠ������Ȃ��ꍇ
					if(!tIssueinstStruct.getPLANT_CD().equals(sysPLANT_CD)){
						csvExport(csvStruct
								, "1"													// �G���[�敪
								, i + 1													// �G���[�s�ԍ�
								, "Expj.ISSUE_INST_CD"									// �G���[���ږ�
								, new ExpjMessage("AF00182").getMessage(_locale)
								, null);		// �G���[���b�Z�[�W
						_intErrorCount++;
						continue;
					}
					//[�o�Ɏw��].�h�o�Ɏw���o�ɋ敪�h �� 1�F�}�j���A���o�ɏꍇ
					if(!"1".equals(tIssueinstStruct.getISSUE_TYP())){
						csvExport(csvStruct
								, "1"													// �G���[�敪
								, i + 1													// �G���[�s�ԍ�
								, "Expj.ISSUE_INST_CD"									// �G���[���ږ�
								, new ExpjMessage("AF00183").getMessage(_locale)
								, null);		// �G���[���b�Z�[�W
						_intErrorCount++;
						continue;
					}
					//[�o�Ɏw��].�h�o�Ɋ����t���O�h = 1�F�o�Ɋ����ꍇ
					if("1".equals(tIssueinstStruct.getISSUE_CMPLT_FLG())){
						csvExport(csvStruct
								, "1"													// �G���[�敪
								, i + 1													// �G���[�s�ԍ�
								, "Expj.ISSUE_INST_CD"									// �G���[���ږ�
								, new ExpjMessage("AF00132").getMessage(_locale)
								, null);		// �G���[���b�Z�[�W
						_intErrorCount++;
						continue;
					}
					//ADD START 20141208 fei-hy
					//�u�i�ڔԍ��v��NULL�ł͂Ȃ����u�i�ڔԍ��v��[�o�Ɏw��].�g�o�ɕi�ڔԍ��h�ƈ�v���Ȃ��ꍇ
					if (csvStruct.getITEM_CD() != null && !"".equals(csvStruct.getITEM_CD()) && !csvStruct.getITEM_CD().equals(tIssueinstStruct.getITEM_CD())) {
						csvExport(csvStruct
								, "1"													// �G���[�敪
								, i + 1													// �G���[�s�ԍ�
								, "Expj.ITEM_CD"								    	// �G���[���ږ�
								, new ExpjMessage("AF00192").getMessage(_locale)
								, null);		// �G���[���b�Z�[�W
						_intErrorCount++;
						continue;
					}
					//ADD END 20141208 fei-hy
				}
		         
				//[�o�Ɏw��].�g�o�ɕi�ڔԍ��h�����
				//[�i��].�h �i�ڎ�z�敪�h���u1:���� �v�܂��́u2:�݌Ɉ����^���ԁv�ȊO�����Ԃ�NULL�ł͂Ȃ��ꍇ
				List lotctrlflg =entity.mselect_LOT_CTRL_FLG.read(conn, csvStruct);
				tlotcrtl =(AF0130010Struct)lotctrlflg.get(0);
				if(!("1".equals(tlotcrtl.getMRP_ODR_TYP()) ||"2".equals(tlotcrtl.getMRP_ODR_TYP()))){
					if(!isNull(csvStruct.getJOB_ODR_CD())){
						csvExport(csvStruct
								, "1"													// �G���[�敪
								, i + 1													// �G���[�s�ԍ�
								, "Expj.JOB_ODR_CD"			                            // �G���[���ږ�
								, new ExpjMessage("AF00018").getMessage(_locale)
								, null);		// �G���[���b�Z�[�W
						_intErrorCount++;
						continue;
					}
				}
				
				//���Ԃ�NULL�ł͂Ȃ��A���A[���Ԍv��] �̓f�[�^�������ł��Ȃ��ꍇ
				tIssueinstStruct = (AF0130010Struct)issueinstcd.get(0);
				if(!isNull(csvStruct.getJOB_ODR_CD())){
					boolean blnTWorkProcByItem = entity.mcheck_JOB_ODR_CD.check(conn, csvStruct);
					if (!blnTWorkProcByItem) {
						csvExport(csvStruct
								, "1"													// �G���[�敪
								, i + 1													// �G���[�s�ԍ�
								, "Expj.JOB_ODR_CD" 									// �G���[���ږ�
								, new ExpjMessage("AF00184").getMessage(_locale)
								, null);		                                        // �G���[���b�Z�[�W
						_intErrorCount++;
						continue;
					}
				}
				
				
				//�u�o�Ɍ��ۊǋ�R�[�h�v �� �u�o�ɐ�ۊǋ�R�[�h�v �̓��͒l�������ꍇ
				if(csvStruct.getWH_CD().equals(csvStruct.getRCV_WH_CD())){
					csvExport(csvStruct
							, "1"													// �G���[�敪
							, i + 1													// �G���[�s�ԍ�
							, "Expj.RCV_WH_CD_1"				// �G���[���ږ�
							, new ExpjMessage("AF00054").getMessage(_locale)
							, null);		// �G���[���b�Z�[�W
					_intErrorCount++;
					continue;
				}
				
				//�u�o�Ɍ��ۊǋ�R�[�h�v �� [�ۊǋ�] �ɑ��݂��Ȃ��ꍇ
				List whList  =entity.mselect_M_WH.read(conn, csvStruct);
				if(whList.isEmpty()){
					csvExport(csvStruct
							, "1"													// �G���[�敪
							, i + 1													// �G���[�s�ԍ�
							, "Expj.ISSUE_WH_CD_1"			                        // �G���[���ږ�
							, new ExpjMessage("AF00028").getMessage(_locale)
							, null);		// �G���[���b�Z�[�W
					_intErrorCount++;
					continue;
				}else{
					//�u�o�Ɍ��ۊǋ�R�[�h�v��[�ۊǋ�].�g�H��R�[�h�h �� ���O�C�����[�U�[�̍H��R�[�h ���قȂ�ꍇ
					if(!((AF0130010Struct)whList.get(0)).getPLANT_CD().equals(sysPLANT_CD))
					{
						csvExport(csvStruct
								, "1"													// �G���[�敪
								, i + 1													// �G���[�s�ԍ�
								, "Expj.ISSUE_WH_CD_1"			                        // �G���[���ږ�
								, new ExpjMessage("AF00029").getMessage(_locale)
								, null);		// �G���[���b�Z�[�W
						_intErrorCount++;
						continue;
					}
					//�u�o�Ɍ��ۊǋ�R�[�h�v�����[�ۊǋ�].�g���v�ʌv�Z�Ώۃt���O�h �� 1�F���v�ʌv�Z�Ώ� �łȂ��ꍇ
					if(! "1".equals(((AF0130010Struct)whList.get(0)).getMRP_FLG())){
						csvExport(csvStruct
								, "1"													// �G���[�敪
								, i + 1													// �G���[�s�ԍ�
								, "Expj.ISSUE_WH_CD_1"			                        // �G���[���ږ�
								, new ExpjMessage("AF00096").getMessage(_locale)
								, null);		// �G���[���b�Z�[�W
						_intErrorCount++;
						continue;
					}
				}
				if("1".equals(tlotcrtl.getLOT_CTRL_FLG())){
					//[�o�Ɏw��].�g�o�ɕi�ڔԍ��h�����[�i��].�h���b�g�Ǘ��t���O�h���u�P�F���b�g�Ǘ����s���v�A
					//�u�݌Ƀ��b�g�ԍ��v��NULL�ꍇ
					if(isNull(csvStruct.getLOT_NO())){
						csvExport(csvStruct
								, "1"													// �G���[�敪
								, i + 1													// �G���[�s�ԍ�
								, "Expj.STOCK_LOT_CD"			                        // �G���[���ږ�
								, new ExpjMessage("AF20001").getMessage(_locale)
								, null);		// �G���[���b�Z�[�W
						_intErrorCount++;
						continue;
					}else{
						// [�o�Ɏw��].�g�o�ɕi�ڔԍ��h�����[�i��].�h���b�g�Ǘ��t���O�h���u�P�F���b�g�Ǘ����s���v�A
						//�u�݌Ƀ��b�g�ԍ��v�ƁA[�o�Ɏw��]�D�g�o�ɕi�ڔԍ��h�� [���b�g�Ǘ�]�����������݂��Ȃ��ꍇ
						boolean chklotno =entity.mcheck_TLOT_CTRL.check(conn, csvStruct);
						if (!chklotno) {
							csvExport(csvStruct
									, "1"													// �G���[�敪
									, i + 1													// �G���[�s�ԍ�
									, "Expj.STOCK_LOT_CD"									// �G���[���ږ�
									, new ExpjMessage("AF20002").getMessage(_locale)
									, null);		// �G���[���b�Z�[�W
							_intErrorCount++;
							continue;
						}
					}
				
				}else{
					// [�o�Ɏw��].�g�o�ɕi�ڔԍ��h�����[�i��].�h���b�g�Ǘ��t���O�h���u0�F���b�g�Ǘ����s��Ȃ��v�A
					//�u���ԁv �� null �� �u�o�ɐ��v �̒l�� �� 0 �̏ꍇ
					//�i�ڔԍ��A�ۊǋ� ����� [�ۊǋ�ʕi�ڍ݌�] �����݂��Ȃ��ꍇ
					List itemstock =entity.mselect_T_ITEM_STOCK.read(conn, csvStruct);
					if (isNull(csvStruct.getJOB_ODR_CD()) && Calculate.compare(csvStruct.getISSUE_QTY(), "0")  >0 && itemstock.size()<=0) {
						csvExport(csvStruct
								, "1"													// �G���[�敪
								, i + 1													// �G���[�s�ԍ�
								, "Expj.ISSUE_QTY"									// �G���[���ږ�
								, new ExpjMessage("AF00044").getMessage(_locale)
								, null);		// �G���[���b�Z�[�W
						_intErrorCount++;
						continue;
					}
					
					//[�o�Ɏw��].�g�o�ɕi�ڔԍ��h�����[�i��].�h���b�g�Ǘ��t���O�h���u0�F���b�g�Ǘ����s��Ȃ��v�A
					//�u���ԁv �� null�ł͂Ȃ� �� �u�o�ɐ��v �̒l�� �� 0 �̏ꍇ
					//���ԁA�i�ڔԍ��A�ۊǋ� ����� [�ۊǋ�ʐ��ԍ݌�] �����݂��Ȃ��ꍇ
					List itemjobstock =entity.mselect_T_JOB_ODR_CD_STOCK.read(conn, csvStruct);
					if (!isNull(csvStruct.getJOB_ODR_CD()) && Calculate.compare(csvStruct.getISSUE_QTY(), "0")>0 && itemjobstock.size()<=0) {
						csvExport(csvStruct
								, "1"													// �G���[�敪
								, i + 1													// �G���[�s�ԍ�
								, "Expj.ISSUE_QTY"									// �G���[���ږ�
								, new ExpjMessage("AF00045").getMessage(_locale)
								, null);		// �G���[���b�Z�[�W
						_intErrorCount++;
						continue;
					}
					//[�o�Ɏw��].�g�o�ɕi�ڔԍ��h�����[�i��].�h���b�g�Ǘ��t���O�h���u0�F���b�g�Ǘ����s��Ȃ��v�A
					//�i�ڎ�z�敪�� 1�F���� �������� 2�F�݌Ɉ����^���� �� �u����
					//�v��null�� �u�o�ɐ��v �� �u�o�ɉ\���v �̏ꍇ
					tIssueinstStruct = (AF0130010Struct)issueinstcd.get(0);
					//�����ϖ��o�ɐ�
					IssueRemain issueRemain = new IssueRemain(conn);
					struct.setALC_NOISSUE_QTY(
					issueRemain.getRemainQtyByItem(tIssueinstStruct.getOD_NO()).toString());

					// �u�i�ڍ݌ɖ��������v
					struct.setITEM_STOCK_NON_ALC_QTY(
					issueRemain.getFreeStockQtyOfItem(sysPLANT_CD,tIssueinstStruct.getITEM_CD()).toString());
					//�u�o�ɉ\���v = �u�����ϖ��o�ɐ��v �{ �u�i�ڍ݌ɖ��������v
					struct.setTHIS_TIME_ISSUE_POSS_QTY(
					Calculate.add(struct.getALC_NOISSUE_QTY(), struct.getITEM_STOCK_NON_ALC_QTY()));
					
					if("1".equals(tlotcrtl.getMRP_ODR_TYP()) ||"2".equals(tlotcrtl.getMRP_ODR_TYP()) ){
						BigDecimal issueQty = new BigDecimal(csvStruct.getISSUE_QTY());
						BigDecimal itemStock = new BigDecimal(struct.getITEM_STOCK_NON_ALC_QTY());
						if (isNull(csvStruct.getJOB_ODR_CD()) 
								&& issueQty.doubleValue() > itemStock.doubleValue()) {
							csvExport(csvStruct
									, "1"													// �G���[�敪
									, i + 1													// �G���[�s�ԍ�
									, "Expj.ISSUE_QTY"									    // �G���[���ږ�
									, new ExpjMessage("AF00115").getMessage(_locale)
									, null);		// �G���[���b�Z�[�W
							_intErrorCount++;
							continue;
						}
					}
					
					//// �N���A
					struct.setALC_NOISSUE_QTY("0.0");
					struct.setITEM_STOCK_NON_ALC_QTY("0.0");
					struct.setTHIS_TIME_ISSUE_POSS_QTY("0.0");
					
					//[�o�Ɏw��].�g�o�ɕi�ڔԍ��h�����[�i��].�h���b�g�Ǘ��t���O�h���u0�F���b�g�Ǘ����s��Ȃ��v�A
					//�i�ڎ�z�敪�� 1�F���� �������� 2�F�݌Ɉ����^���� �� �u���ԁv��null�ł͂Ȃ��� 
					//�u���ԁv�������ԂłȂ�  �u�o�ɐ��v �� �u�o�ɉ\���v �̏ꍇ
					
					//�ʎ�z���o�ɉ\��
					IssueRemain.ResultByOd  re = issueRemain.getRemainQtyByOd(tIssueinstStruct.getOD_NO());
					struct.setODR_ISSUE_POSS_QTY(re.remainQty.toString());
					
					//�u���ԁv �� null�ł͂Ȃ� �̏ꍇ
					List tmpList;
					// ���Ԃ�null�łȂ����A���ԍ݌� �Ǎ�
					tmpList = entity.mselectSub1_ODR_STOCK.read(conn, struct);
					
					if(tmpList.size()> 0){
						AF0130010Struct tmpStruct = (AF0130010Struct)tmpList.get(0);
						struct.setw_TOTAL_STOCK_ON_HAND_QTY(tmpStruct.getw_TOTAL_STOCK_ON_HAND_QTY());
					}
					//�u�����ϖ��o�ɐ��v
					struct.setITEM_STOCK_NON_ALC_QTY(struct.getw_TOTAL_STOCK_ON_HAND_QTY());
					
					
					//�i�ڂ̕i�ڎ�z�敪�� 1�F���� �������� 2�F�݌Ɉ����^���� �� �u���ԁv�� null�ł͂Ȃ� �̏ꍇ�A
					//�u�o�ɉ\���v = �u�ʎ�z���o�ɉ\���v�{�u�����ϖ��o�ɐ��v
					struct.setTHIS_TIME_ISSUE_POSS_QTY(
							Calculate.add(struct.getODR_ISSUE_POSS_QTY(), struct.getALC_NOISSUE_QTY()));

					if("1".equals(tlotcrtl.getMRP_ODR_TYP()) || "2".equals(tlotcrtl.getMRP_ODR_TYP())){
						if (!isNull(csvStruct.getJOB_ODR_CD()) 
								&& Calculate.compare(csvStruct.getISSUE_QTY(), struct.getTHIS_TIME_ISSUE_POSS_QTY())>0) {
							csvExport(csvStruct
									, "1"													// �G���[�敪
									, i + 1													// �G���[�s�ԍ�
									, "Expj.ISSUE_QTY"									// �G���[���ږ�
									, new ExpjMessage("AF00116").getMessage(_locale)
									, null);		// �G���[���b�Z�[�W
							_intErrorCount++;
							continue;
						}
					}
					
				}
				// �u�o�ɓ��v �� �u������(�Ɩ��^�p����薢��) �ł���ꍇ
				// �Ɩ��^�p��
				BigDecimal decimalBusinessDate = new BigDecimal(_btmBusinessOprDate.substring(0,4) + 
						_btmBusinessOprDate.substring(5,7)+ _btmBusinessOprDate.substring(8,10));
				// �o�ɓ�
				BigDecimal decimalOprDate = new BigDecimal(chageDate(csvStruct.getISSUE_DATE_SUB()).substring(0,4) + 
						chageDate(csvStruct.getISSUE_DATE_SUB()).substring(5,7)+ chageDate(csvStruct.getISSUE_DATE_SUB()).substring(8,10));
				if (decimalOprDate.compareTo(decimalBusinessDate) > 0) {
					csvExport(csvStruct
							, "1"													// �G���[�敪
							, i + 1													// �G���[�s�ԍ�
							, "Expj.ISSUE_DATE"										// �G���[���ږ�
							, new ExpjMessage("ZZ05103").getMessage(_locale)
							, null);		// �G���[���b�Z�[�W
					_intErrorCount++;
					continue;
				}
				
				// ���ی����̒��߂��������Ă�����t�`�F�b�N�A�u�V�X�e���p�����[�^�v�D�ݒ�l=�gfalse�h�̏ꍇ�A�u�o�ɓ��v�̔N�� �iYYYY/MM�j��[���ی����Ǘ��p�����[�^].�g�Ώ۔N���h���ߋ��̏ꍇ
				if ("false".equals(strValus)) {
					if(!checkProcExecDate(csvStruct.getISSUE_DATE_SUB(),tIssueinstStruct.getPLANT_CD(),struct)){
						csvExport(csvStruct
								, "1"													// �G���[�敪
								, i + 1													// �G���[�s�ԍ�
								, "Expj.ISSUE_DATE"							// �G���[���ږ�
								, new ExpjMessage("AE00160").getMessage(_locale)
								, null);		// �G���[���b�Z�[�W
						_intErrorCount++;
						continue;
					}
				}
				//[�o�Ɏw��].�g�o�ɕi�ڔԍ��h�����[�i��].�h���b�g�Ǘ��t���O�h���u�P�F���b�g�Ǘ����s���v�ꍇ�A
				//�u�݌Ƀ��b�g�ԍ��v��Null�łȂ��܂��́u�o�ɐ��v���O�ȊO�A���A[���b�g�Ǘ�].�h�ܖ������h�� �u�o�ɓ��v�A���A
				//[�p�����[�^].�h ���O�h���f BEST_BEFORE_DATE_CHECK_FLG�f��1:�G���[�̏ꍇ
				List bestbeforedate = entity.mc_BEST_BEFORE_DATE.read(conn, csvStruct);
				csvStruct.setSYS_PARAMETER_NAME("BEST_BEFORE_DATE_CHECK_FLG");
				
				List syspara =entity.mSELECT_SYS_PARAMETER.read(conn, csvStruct);
				
				if("1".equals(tlotcrtl.getLOT_CTRL_FLG())){
					if(!isNull(csvStruct.getLOT_NO())|| !"0".equals(csvStruct.getISSUE_QTY())){
						if(bestbeforedate.size()>0 && syspara.size()>0 ){
							AF0130010Struct bbdstruct = new AF0130010Struct();
							bbdstruct = (AF0130010Struct)bestbeforedate.get(0);						
							AF0130010Struct sysvalue = new AF0130010Struct();
							sysvalue = (AF0130010Struct)syspara.get(0);
							if("1".equals(bbdstruct.getBEST_BEFORE_DATE())){
								if("1".equals(sysvalue.getSYS_PARAMETER_VALUE())){
									csvExport(csvStruct
											, "1"													// �G���[�敪
											, i + 1													// �G���[�s�ԍ�
											, "Expj.ISSUE_DATE"							// �G���[���ږ�
											, new ExpjMessage("AE05060").getMessage(_locale)
											, null);		// �G���[���b�Z�[�W
									_intErrorCount++;
									continue;
								}else{
									lotWarningFlg = true;
								
							}
						}
						}
				}
				}
				
				// ���|�Ǘ����C���X�g�[������Ă���ꍇ�A���N���x���擾
				AF0130010Struct readStruct = new AF0130010Struct();
				List installOptionsList = entity.mSYS_INSTALL_OPTIONS.read(conn, readStruct);
				if (installOptionsList.size() > 0) {
					AF0130010Struct installOptionsStruct = (AF0130010Struct)installOptionsList.get(0);
					csvStruct.setINSTALL_FLG(installOptionsStruct.getINSTALL_FLG());
				} else {
					csvStruct.setINSTALL_FLG("0");
				}
				
				// [�C���X�g�[���I�v�V����].�h �V�X�e���I�v�V�������ʎq�h �� C* �A[�C���X�g�[���I�v�V����].�h �V�X�e�������t���O�h �� 1:�����A
				//[�o�Ɏw��].�h�x���敪�h �� 1�F�L���x���̏ꍇ��
				//[����].�hSYS�R���g���[���R�[�h�h�@���@SYSTEM�A[����].�h��ЃR�[�h�h��[���|�V�X�e���Ǘ�].�h��ЃR�[�h�h�ƂȂ�
				//���R�[�h�����݂��Ȃ��ꍇ
				if ("1".equals(csvStruct.getINSTALL_FLG())) {
					List debtCtrlList = entity.mSYS_DEBT_CTRL.read(conn, readStruct);
					if (debtCtrlList.size() > 0) {
						AF0130010Struct debtCtrlStruct = (AF0130010Struct)debtCtrlList.get(0);
						csvStruct.setTHIS_MONTH(debtCtrlStruct.getTHIS_MONTH());
					} else {
						csvExport(csvStruct
								, "1"													// �G���[�敪
								, i + 1													// �G���[�s�ԍ�
								, "Expj.ISSUE_DATE"										// �G���[���ږ�
								, new ExpjMessage("AF00142").getMessage(_locale)
								, null);		// �G���[���b�Z�[�W
						_intErrorCount++;
						continue;
					}
				}	
				//[�o�Ɏw��].�h�o�ɐ�ۊǋ�R�[�h�h���m�������ŁA�u�o�ɐ�ۊǋ�R�[�h�v���m�������̏ꍇ
				if(!isNull(tIssueinstStruct.getRCV_WH_CD())&& isNull(csvStruct.getRCV_WH_CD())){
					csvStruct.setRCV_WH_CD(tIssueinstStruct.getRCV_WH_CD());
				}
				//[�o�Ɏw��].�h�o�ɐ�ۊǋ�R�[�h�h���m�������ŁA�u�o�ɐ�ۊǋ�R�[�h�v���m�������̏ꍇ
				if(isNull(tIssueinstStruct.getRCV_WH_CD())&& !isNull(csvStruct.getRCV_WH_CD())){
					csvExport(csvStruct
							, "1"													// �G���[�敪
							, i + 1													// �G���[�s�ԍ�
							, "Expj.RCV_WH_CD_1"										// �G���[���ږ�
							, new ExpjMessage("AF00138").getMessage(_locale)
							, null);		// �G���[���b�Z�[�W
					_intErrorCount++;
					continue;
				}
				//�u�o�ɐ�ۊǋ�R�[�h�v���m�������łȂ��A[�ۊǋ�] �ɑ��݂��Ȃ��ꍇ
				_wh_cd = null;
				_wh_cd =csvStruct.getWH_CD();
				csvStruct.setWH_CD(csvStruct.getRCV_WH_CD());
				List rcvWhList =entity.mselect_M_WH.read(conn, csvStruct);
				csvStruct.setWH_CD(_wh_cd);
				AF0130010Struct rcvWhStruct = new AF0130010Struct();
				if(!isNull(csvStruct.getRCV_WH_CD())){
					if(rcvWhList.isEmpty()){
						csvExport(csvStruct
								, "1"													// �G���[�敪
								, i + 1													// �G���[�s�ԍ�
								, "Expj.RCV_WH_CD_1"										// �G���[���ږ�
								, new ExpjMessage("AF00031").getMessage(_locale)
								, null);		// �G���[���b�Z�[�W
						_intErrorCount++;
						continue;
					}else{
						rcvWhStruct =(AF0130010Struct)rcvWhList.get(0);
						//�u�o�ɐ�ۊǋ�R�[�h�v��[�ۊǋ�].�g�H��R�[�h�h �� ���O�C�����[�U�[�̍H��R�[�h ���قȂ�ꍇ
						if(!rcvWhStruct.getPLANT_CD().equals(sysPLANT_CD)){
							csvExport(csvStruct
									, "1"													// �G���[�敪
									, i + 1													// �G���[�s�ԍ�
									, "Expj.RCV_WH_CD_1"										// �G���[���ږ�
									, new ExpjMessage("AF00032").getMessage(_locale)
									, null);		// �G���[���b�Z�[�W
							_intErrorCount++;
							continue;
					}
						//�u�o�ɐ�ۊǋ�R�[�h�v���m��������
						//�u�o�ɐ�ۊǋ�R�[�h�v�ƈ�v����[�ۊǋ�].�h���v�ʌv�Z�Ώۃt���O�h��1:���v�ʌv�Z�Ώۂ̏ꍇ
						if("1".equals(rcvWhStruct.getMRP_FLG())){
							csvExport(csvStruct
									, "1"													// �G���[�敪
									, i + 1													// �G���[�s�ԍ�
									, "Expj.RCV_WH_CD_1"										// �G���[���ږ�
									, new ExpjMessage("AF00139").getMessage(_locale)
									, null);		// �G���[���b�Z�[�W
							_intErrorCount++;
							continue;
					}
						//�u�o�ɐ�ۊǋ�R�[�h�v���m�������ŁA[�o�Ɏw��].�h�x���敪�h�x���敪�v��0�F��̏ꍇ�A
						//�u�o�ɐ�ۊǋ�R�[�h�v�ƈ�v����[�ۊǋ�].�h�����h���m�������̏ꍇ
						if("0".equals(tIssueinstStruct.getCONS_TYP())){
							if(!isNull(rcvWhStruct.getVEND_CD())){
								csvExport(csvStruct
										, "1"													// �G���[�敪
										, i + 1													// �G���[�s�ԍ�
										, "Expj.RCV_WH_CD_1"										// �G���[���ږ�
										, new ExpjMessage("AF00140").getMessage(_locale)
										, null);		// �G���[���b�Z�[�W
								_intErrorCount++;
								continue;
						}
					 }else{
						 if(isNull(rcvWhStruct.getVEND_CD())|| isNull(tIssueinstStruct.getVEND_CD())){
							 csvExport(csvStruct
										, "1"													// �G���[�敪
										, i + 1													// �G���[�s�ԍ�
										, "Expj.RCV_WH_CD_1"										// �G���[���ږ�
										, new ExpjMessage("AF00141").getMessage(_locale)
										, null);		// �G���[���b�Z�[�W
								_intErrorCount++;
								continue;
						 }else{
								//�u�o�ɐ�ۊǋ�R�[�h�v���m�������A[�o�Ɏw��].�h�x���敪�h��0�F��̏ꍇ�A
								//�u�o�ɐ�ۊǋ�R�[�h�v�ƈ�v����[�ۊǋ�].�h�����h [�o�Ɏw��].�h�����R�[�h�h����v���Ȃ��ꍇ
								if(!rcvWhStruct.getVEND_CD().equals(tIssueinstStruct.getVEND_CD()) ){
									csvExport(csvStruct
											, "1"													// �G���[�敪
											, i + 1													// �G���[�s�ԍ�
											, "Expj.RCV_WH_CD_1"										// �G���[���ږ�
											, new ExpjMessage("AF00141").getMessage(_locale)
											, null);		// �G���[���b�Z�[�W
									_intErrorCount++;
									continue;
							}
						 }	
				  }
				}
			}	
			
			//[�o�Ɏw��].�g�o�ɕi�ڔԍ��h�����[�i��].�h���b�g�Ǘ��t���O�h���u�P�F���b�g�Ǘ����s���v�ꍇ�A�u�݌Ƀ��b�g�ԍ��v��Null�łȂ��܂��́u�o�ɐ��v���O�ȊO�̏ꍇ���A
			//[���b�g�Ǘ�].�h�ܖ������h�� �u�o�ɓ��v
			//[�p�����[�^].�h ���O�h���f BEST_BEFORE_DATE_CHECK_FLG�f��2:�x���̏ꍇ
			if (lotWarningFlg){	
				csvExport(csvStruct
						, "2"													// �G���[�敪
						, i + 1													// �G���[�s�ԍ�
						, "Expj.ISSUE_DATE"							// �G���[���ږ�
						, new ExpjMessage("AE05061").getMessage(_locale)
						, null);		// �G���[���b�Z�[�W
				if (!warningFlg){
					_intWarningCount++;
					warningFlg = true;
				}	
			}	
				// [�C���X�g�[���I�v�V����].�h �V�X�e���I�v�V�������ʎq�h �� C* �A[�C���X�g�[���I�v�V����].�h �V�X�e�������t���O�h �� 1:�����A
				//[�o�Ɏw��].�h�x���敪�h �� 1�F�L���x���̏ꍇ��
				//[����].�hSYS�R���g���[���R�[�h�h�@���@SYSTEM�A[����].�h��ЃR�[�h�h��[���|�V�X�e���Ǘ�].�h��ЃR�[�h�h�A
				//[���|�V�X�e���Ǘ�]."���N���x"���u�o�ɓ��v�iYYYY/MM�j
				if ("1".equals(csvStruct.getINSTALL_FLG())) {
					List debtCtrlList = entity.mSYS_DEBT_CTRL.read(conn, readStruct);
					AF0130010Struct debtCtrlStruct = (AF0130010Struct)debtCtrlList.get(0);
					if ("1".equals(tIssueinstStruct.getCONS_TYP()) && debtCtrlList.size() > 0){
						if(debtCtrlStruct.getTHIS_MONTH().compareTo(csvStruct.getISSUE_DATE())>0){
							csvExport(csvStruct					// �Ώۃf�[�^���
									, "2"						// �G���[�敪
									, i + 1						// �G���[�����s
									,"Expj.ISSUE_DATE"			// �G���[���ږ�
									,new ExpjMessage("AF00187").getMessage(_locale)
									, null);	// �G���[���b�Z�[�W
							if (!warningFlg){
								_intWarningCount++;
								warningFlg = true;
							}

						}
						}
					}
				
				BigDecimal decimalIssueQty2 = new BigDecimal("0");
				BigDecimal decimalIssueQty = new BigDecimal(csvStruct.getISSUE_QTY());
				// �o�ɐ�
				//�����Ǘ��i��
				decimalIssueQty2 = decimalIssueQty.setScale(0,BigDecimal.ROUND_FLOOR);
				//�؂艺�������O�ƌ�Œl���قȂ��Ă����珬�������͂���Ă����Ɣ��f�����[�j���O�Ƃ���
				if (decimalIssueQty.doubleValue() != decimalIssueQty2.doubleValue()){
					csvExport(csvStruct					// �Ώۃf�[�^���
							, "2"						// �G���[�敪
							, i + 1						// �G���[�����s
							,"Expj.ISSUE_QTY"			// �G���[���ږ�
							,new ExpjMessage("AF60004").getMessage(_locale)
							, null);	// �G���[���b�Z�[�W
					if (!warningFlg){
						_intWarningCount++;
						warningFlg = true;
					}
					
					csvStruct.setISSUE_QTY(decimalIssueQty2.toString());
				}	
				
				//�u�o�ɐ��v �̒l���o�Ɏc�����傫�� �u�����t���O�v �̓��͒l�� �� �̏ꍇ
				BigDecimal decimalRemainQty = new BigDecimal(tIssueinstStruct.getSHIP_REMAIN_QTY());
				if (decimalIssueQty.doubleValue() > decimalRemainQty.doubleValue())
				{
					if("0".equals(csvStruct.getISSUE_CMPLT_FLG())){
						csvExport(csvStruct					// �Ώۃf�[�^���
								, "2"						// �G���[�敪
								, i + 1						// �G���[�����s
								,"Expj.ISSUE_QTY"			// �G���[���ږ�
								,new ExpjMessage("AF00188").getMessage(_locale)
								, null);	// �G���[���b�Z�[�W
						if (!warningFlg){
							_intWarningCount++;
							warningFlg = true;
						}

					}
				}
			
				//�u�o�ɐ��v �̒l���o�Ɏc����菬���� �u�����t���O�v �̓��͒l�� ���� �̏ꍇ
				if (decimalIssueQty.doubleValue() < decimalRemainQty.doubleValue())
				{
					if("1".equals(csvStruct.getISSUE_CMPLT_FLG())){
						csvExport(csvStruct					// �Ώۃf�[�^���
								, "2"						// �G���[�敪
								, i + 1						// �G���[�����s
								,"Expj.ISSUE_QTY"			// �G���[���ږ�
								,new ExpjMessage("AF00189").getMessage(_locale)
								, null);	// �G���[���b�Z�[�W
						if (!warningFlg){
							_intWarningCount++;
							warningFlg = true;
						}
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
			 ExpjMessage emsg = new ExpjMessage("ZZ01106");
			 sysLog.severe(emsg, getsysUSER_CD());
			 ExpjException ee = new ExpjException(e, emsg);
			 throw ee;
		}
	}
	
   //CVS�t�@�C����Ǎ�
	private List readCsvData() throws ExpjException{

		String[] strsCsvData = null;
		List listCsv = new ArrayList();
		try {
			// CSV�f�[�^�̃A�b�v���[�h
			strsCsvData = (String []) csvReader.lineRead();
			if (strsCsvData != null) {
				setSyslogConfig("strsCsvData.length:" + strsCsvData.length);
				// �f�[�^�����Ƃ���strsCsvData.length�͎g���Ȃ��B���ۂ̍s���{�T�s���炢�炵��
				AF0130010Struct structCsv = null;
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
						structCsv = new AF0130010Struct();
						if (CSV_NECESSARY_COLUMN == v.size()) {
							 // �o�Ɏw���ԍ�
							structCsv.setISSUE_INST_CD((String)v.get(CSV_ISSUE_INST_CD));
							//ADD START 20141208 fei-hy
							//�i�ڔԍ�
							structCsv.setITEM_CD((String)v.get(CSV_ITEM_CD));
							//ADD END 20141208 fei-hy

							// ����
							structCsv.setJOB_ODR_CD((String)v.get(CSV_OB_ODR_CD));
							structCsv.setL_JOB_ODR_CD((String)v.get(CSV_OB_ODR_CD));
							// �o�Ɍ��ۊǋ�R�[�h
							structCsv.setWH_CD((String)v.get(CSV_ISSUE_WH_CD)); 
							// �݌Ƀ��b�g�ԍ�
							structCsv.setLOT_NO((String)v.get(CSV_STOCK_LOT_CD));
							// �o�ɐ�
							structCsv.setISSUE_QTY((String)v.get(CSV_ISSUE_QTY)); 
							structCsv.setLA_ISSUE_QTY((String)v.get(CSV_ISSUE_QTY)); 
							// �o�ɓ�
							structCsv.setISSUE_DATE((String)v.get(CSV_ISSUE_DATE)); 
							// �o�Ɋ���
							structCsv.setISSUE_CMPLT_FLG((String)v.get(CSV_ISSUE_CMPLT_FLG)); 
							// �o�ɐ�ۊǋ�R�[�h
							structCsv.setRCV_WH_CD((String)v.get(CSV_RCV_WH_CD)); 
							// ���[�J���b�g�ԍ�
							structCsv.setVEND_LOT_NO((String)v.get(CSV_VEND_LOT_NO));
						
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
	* @param errMsg
	*			�G���[���ږ�
	* @return �ُ�Ȃ� true �G���[ false
	*/  
	
	private boolean csvExport(AF0130010Struct targetStruct, String errTyp, int errlineNo, String errItem, String errMsg, String errItemCd) {
		AF0130010Struct errStruct = new AF0130010Struct();
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
		// �o�Ɏw���ԍ�
		errStruct.setl_ERR_ISSUE_INST_CD(replaceSlashAdd(targetStruct.getISSUE_INST_CD()));
		// �i�ڔԍ�
		errStruct.setl_ERR_ITEM_CD(replaceSlashAdd(targetStruct.getITEM_CD()));

		// ����
		errStruct.setl_ERR_JOB_ODR_CD(replaceSlashAdd(targetStruct.getL_JOB_ODR_CD()));
		// �o�Ɍ��ۊǋ�R�[�h
		errStruct.setl_ERR_ISSUE_WH_CD(replaceSlashAdd(targetStruct.getWH_CD()));
		// �݌Ƀ��b�g�ԍ�
		errStruct.setl_ERR_STOCK_LOT_CD(replaceSlashAdd(targetStruct.getLOT_NO()));
		// �o�ɐ�
		errStruct.setl_ERR_ISSUE_QTY(replaceSlashAdd(targetStruct.getLA_ISSUE_QTY()));

		// �o�ɓ�
		errStruct.setl_ERR_ISSUE_DATE(replaceSlashAdd(targetStruct.getISSUE_DATE()));

		// �o�Ɋ���
		errStruct.setl_ERR_ISSUE_CMPLT_FLG(replaceSlashAdd(targetStruct.getISSUE_CMPLT_FLG()));
		// �o�ɐ�ۊǋ�R�[�h
		errStruct.setl_ERR_RCV_WH_CD(replaceSlashAdd(targetStruct.getRCV_WH_CD()));
		//���[�J���b�g�ԍ�
		errStruct.setl_ERR_VEND_LOT_NO(replaceSlashAdd(targetStruct.getVEND_LOT_NO()));
		// list��ǉ�
		list.add(errStruct);
		return true;
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
				
				AF0130010Struct cvsStruct = (AF0130010Struct)csvList.get(i);
				
				AF0130010Struct tlotcrtl  =new AF0130010Struct();
				List lotctrlflg =entity.mselect_LOT_CTRL_FLG.read(conn, cvsStruct);
				tlotcrtl =(AF0130010Struct)lotctrlflg.get(0);
				
				//���b�g�Ǘ��t���O��0�F���b�g�Ǘ����s��Ȃ��ꍇ
				if("0".equals(tlotcrtl.getLOT_CTRL_FLG())){
					//�݌Ƀ��b�g�ԍ�  null
					cvsStruct.setLOT_NO("");
					
					//���ԕi�̕i�ڍ݌ɖ�����������o�ɂ���ꍇ
					//�u���ԍ݌ɂ���o�ɂ���v��Off�� �u�o�ɐ��v�� �i�ڍ݌ɂ���́u�����ϖ��o�ɐ��v���傫���ꍇ
					//���Ԉ����̒ǉ��E�X�V
					rtnFlg = insertTjobodralc(cvsStruct, i);
					if(!rtnFlg) {
						conn.rollback();
						return false;
					}
					//�ۊǋ�ʓ��o��] �֒ǉ����s���A�擾���� �u���o�ɊǗ��ԍ��v ���p�����[�^�Ƃ��āA
					//�o�ɏ��� ���Ăяo��
					rtnFlg = insert_issue_process(cvsStruct, i);
					if(!rtnFlg) {
						conn.rollback();
						return false;
					}
					//�L���x���i�̏ꍇ�A�L���x������o�^
					//�H���ۊǏꏊ�܂��͎����ۊǋ�ƂȂ�o�ɐ�ۊǋ�R�[�h�֓��ɂ��邽�� 
					//[�ۊǋ�ʓ��o��]�ɒǉ��� �擾�������o�ɊǗ��ԍ����p�����[�^�Ƃ��ē��ɏ������Ăяo���B
					rtnFlg = insert_rcv_process(cvsStruct, i);
					if(!rtnFlg) {
						conn.rollback();
						return false;
					}
				}
				if("1".equals(tlotcrtl.getLOT_CTRL_FLG())){
					//���[�J���b�g�ԍ� null
					cvsStruct.setVEND_LOT_NO("");
					//���� null
					cvsStruct.setJOB_ODR_CD("");
					//�ۊǋ�ʓ��o��] �֒ǉ����s���A�擾���� �u���o�ɊǗ��ԍ��v ���p�����[�^�Ƃ��āA
					//�o�ɏ��� ���Ăяo��
					rtnFlg = insert_issue_process(cvsStruct, i);
					if(!rtnFlg) {
						conn.rollback();
						return false;
					}
					//�L���x���i�̏ꍇ�A�L���x������o�^
					//�H���ۊǏꏊ�܂��͎����ۊǋ�ƂȂ�o�ɐ�ۊǋ�R�[�h�֓��ɂ��邽�� 
					//[�ۊǋ�ʓ��o��]�ɒǉ��� �擾�������o�ɊǗ��ԍ����p�����[�^�Ƃ��ē��ɏ������Ăяo���B
					rtnFlg = insert_rcv_process(cvsStruct, i);
					if(!rtnFlg) {
						conn.rollback();
						return false;
					}
					//���b�g�ʂɏo�ɂ��������A�o�Ɏ��і��ׂ֒ǉ�����B	
					rtnFlg = insertupTlotissueinst(cvsStruct, i);
					if(!rtnFlg) {
						conn.rollback();
						return false;
					}
				}
			}
			conn.commit();
			return true;
		} catch (Exception e) {
			conn.rollback();
			throw new ExpjException(e);
		}
		
	}
	/**
	 * CSV�t�F�C�����e�́A [���Ԉ���]�̒ǉ��E�X�V
	 * @param csvList
	 * @return
	 * @throws FoundationException 
	 */
	private boolean insertTjobodralc (AF0130010Struct adstruct, int m) throws ExpjException {
		// ���O�o�͏��i�[�p
		String logMessage = "";
		
		logMessage = "Control : insertTjobodralc"
				+ ", T_ISSUE_INST.ISSUE_INST_CD:" + adstruct.getISSUE_INST_CD();
	  setSyslogConfig(logMessage);
		boolean jobOdrAlcFlg = false;
		try {
			IssueRemain issueRemain = new IssueRemain(conn);
			
			AF0130010Struct readStruct = new AF0130010Struct();
			readStruct.setw_ISSUE_INST_CD(adstruct.getISSUE_INST_CD());
			readStruct.setw_WS_CD((String)null);
			readStruct.setw_VEND_CD((String)null);
			readStruct.setw_ISSUE_CMPLT_FLG((String)null);
			readStruct.setw_LOT_CTRL_FLG((String)null);
			readStruct.setw_PLANT_CD((String)null);

			List tmpList = entity.mselect_T_ISSUE_INST1.read(conn, adstruct);
			AF0130010Struct issueInstStruct = (AF0130010Struct)tmpList.get(0);
			
			//[�i��]����́u�i�ڎ�z�敪�v�̃f�[�^���`
			AF0130010Struct tlotcrtl  =new AF0130010Struct();
			List lotctrlflg =entity.mselect_LOT_CTRL_FLG.read(conn, adstruct);
			tlotcrtl =(AF0130010Struct)lotctrlflg.get(0);
			
			//�����ϖ��o�ɐ����擾
			struct.setALC_NOISSUE_QTY(
					issueRemain.getRemainQtyByItem(issueInstStruct.getOD_NO()).toString());
			//���ԕi�̕i�ڍ݌ɖ�����������o�ɂ���ꍇ
			//�u���ԁv��null�� �u�o�ɐ��v�� �i�ڍ݌ɂ���́u�����ϖ��o�ɐ��v���傫���ꍇ�́A
			//�ȉ��̃��R�[�h�����݂���΁A�X�V����B���݂���ꍇ�A�o�^����B
			//[���Ԉ���]�D"�I�[�_�f�}���h�ԍ�" �� [�o�Ɏw��]�D�I�[�_�f�}���h�ԍ�
			//[���Ԉ���]�D"�����݌ɋ敪" �� 1�F�i�ڍ݌�

			if(isNull(adstruct.getJOB_ODR_CD())
					&& Calculate.compare(adstruct.getISSUE_QTY(), struct.getALC_NOISSUE_QTY()) == 1 ){
				if(("1".equals(tlotcrtl.getMRP_ODR_TYP()) || "2".equals(tlotcrtl.getMRP_ODR_TYP()))){
					
					// �o�Ɏw�����N���X�ɏ����Z�b�g
					IssueInstStruct issueInstforStruct = new IssueInstStruct();
					issueInstforStruct.m_OD_NO = issueInstStruct.getOD_NO();
					issueInstforStruct.m_PLANT_CD = sysPLANT_CD;
					issueInstforStruct.m_ITEM_CD = issueInstStruct.getITEM_CD();
					
					// �X�V���N���X�ɏ����Z�b�g
					UpdateInfo updateInfo = new UpdateInfo(sysUSER_CD, this.sp.getProcId(), 0);
					
					// [���Ԉ���]�̒ǉ��E�X�V
					(new JobOdrAlc(conn)).updateAlcQty(issueInstforStruct,
							new BigDecimal(adstruct.getISSUE_QTY()), updateInfo);
					jobOdrAlcFlg = true;;
					
					// [���Ԉ���]���X�V�����ꍇ
					if(jobOdrAlcFlg){
						csvExport(adstruct					// �Ώۃf�[�^���
								, "2"						// �G���[�敪
								, m + 1						// �G���[�����s
								,""			// �G���[���ږ�
								,new ExpjMessage("AD60002", issueInstStruct.getITEM_CD()).getMessage(_locale)
								, null);	// �G���[���b�Z�[�W
						if (!warningFlg){
							_intWarningCount1++;
							warningFlg = true;
						}
					}
				}
				}
		}catch(Exception e) {
			throw new ExpjException(e);
		}
		return true;
	}
	//---------- �o�ɏ����c�a�o�^�����i�e��ʁA�q��ʂŋ��ʎg�p�ׁ̈j�j --------------------
		/**
		 * �e��ʂ̓o�^�{�^���Ǝq��ʂ̓o�^�{�^�����狤�ʂɌĂяo����鏈���ł��B
		 *
		 * @return (true:����I��  false:�ُ�I���j
		 */
		private boolean insert_issue_process(AF0130010Struct adstruct, int n) throws BusinessProcessException, FoundationException, SQLException
		{
			// ���O�o�͏��i�[�p
			String logMessage = "";
			String message1 = "";
			List listMessage = new ArrayList();
			

			logMessage = "Control : insert_issue_process"
						+ ", T_ISSUE_INST.ISSUE_INST_CD:" + adstruct.getISSUE_INST_CD();
			setSyslogConfig(logMessage);

				//----------------------------------------------------------
				// �ۊǋ�ʓ��o�Ɂi�o�Ɂj�o�^
				//----------------------------------------------------------
				// ���o�ɊǗ��ԍ��̔ԁi�o�Ɂj
				_ctrlCd = null;
				CollectNumber collect = new CollectNumber(
										CollectNumber.ISSUE_CD, 
										getsysUSER_CD(), 
										this.sp.getProcId(), 
										sysPLANT_CD);
				try{
					_ctrlCd = collect.getNo();
					if(_ctrlCd == null || _ctrlCd.length() == 0){
						// �̔Ԍ��ʂ��Ȃ�
						csvExport(adstruct					// �Ώۃf�[�^���
								, "1"						// �G���[�敪
								, n + 1						// �G���[�����s
								,null
								,new ExpjMessage("AF00057").getMessage(_locale)
								,null);	// �G���[���b�Z�[�W
						if (warningFlg){
							_intWarningCount1--;
						}
						_intErrorCount++;
						return false;
					}
				}
				catch(FoundationException ex){
					// �o�^�������s�F���o�ɊǗ��ԍ��i�o�Ɂj�̍̔ԂɎ��s���܂���
					csvExport(adstruct					// �Ώۃf�[�^���
							, "1"						// �G���[�敪
							, n + 1						// �G���[�����s
							,null
							,new ExpjMessage("AF00057").getMessage(_locale)
							,null);	// �G���[���b�Z�[�W
					if (warningFlg){
						_intWarningCount1--;
					}
					_intErrorCount++;
					return false;
				}
				AF0130010Struct readStruct = new AF0130010Struct();
				List tmpList = entity.mselect_T_ISSUE_INST1.read(conn, adstruct);
				if (!tmpList.isEmpty()) {
			    readStruct = (AF0130010Struct)tmpList.get(0);
			    
				// ���o�ɊǗ��ԍ�
			    readStruct.setRCV_ISSUE_CTRL_CD(_ctrlCd);
				//����
			    readStruct.setJOB_ODR_CD(adstruct.getJOB_ODR_CD());
				// �o�ɕۊǋ�
			    readStruct.settmp_WH_CD(adstruct.getWH_CD());
			    //�H��R�[�h
			    readStruct.setPLANT_CD(sysPLANT_CD);
				// �o�ɐ�
			    readStruct.settmp_RCV_ISSUE_QTY(Calculate.multiply(adstruct.getISSUE_QTY(), "-1"));
			    //���o�ɔN����
			    readStruct.setRCV_ISSUE_DATE(adstruct.getISSUE_DATE());
				// ���o�Ɋ����t���O
			    readStruct.setRCV_ISSUE_CMPLT_FLG(adstruct.getISSUE_CMPLT_FLG());
				// ���o�ɋ敪�i2:�o�Ɂj
			    readStruct.setRCV_ISSUE_TYP(new Integer(2));
				// ���o�ɔ����敪�i21:�ʏ�o�Ɂj
			    readStruct.setRCV_ISSUE_GNR_TYP(new Integer(21));
				// �݌ɍX�V�敪�i1:���j
			    readStruct.setSTOCK_UPD_TYP(new Integer(1));
			    //���[�J���b�g�ԍ�
			    readStruct.setVEND_LOT_NO(adstruct.getVEND_LOT_NO());
			  //�݌Ƀ��b�g�ԍ�
			   readStruct.setw_STOCK_LOT_CD(adstruct.getLOT_NO());

				logMessage = "T_RCV_ISSUE.RCV_ISSUE_CTRL_CD:" + readStruct.getRCV_ISSUE_CTRL_CD()
							+ ", T_RCV_ISSUE.JOB_ODR_CD:" + readStruct.getw_JOB_ODR_CD()
							+ ", T_RCV_ISSUE.ITEM_CD:" + readStruct.getITEM_CD()
							+ ", T_RCV_ISSUE.WH_CD:" + readStruct.getWH_CD()
							+ ", T_RCV_ISSUE.RCV_ISSUE_DATE:" + readStruct.getRCV_ISSUE_DATE()
							+ ", T_RCV_ISSUE.RCV_ISSUE_QTY:" + readStruct.gettmp_RCV_ISSUE_QTY();
				setSyslogConfig(logMessage);
				readStruct.setsUser_ID(struct.getsUser_ID());
				// �ۊǋ�ʓ��o�Ɂi�o�Ɂj�o�^
				entity.minsertSub1T_RCV_ISSUE.create(conn, readStruct);

				// [�o�ɏ���]�ďo��
				IssueProcess issuePrc = new IssueProcess(conn, _ctrlCd);
				try{
					if(issuePrc.execProcess() == true){
						// �X�V�n�j
						logMessage = "Issue Process was Complated!";
						setSyslogConfig(logMessage);
					}
					else {
						// �X�V�G���[
						logMessage = "Issue Process was Failed...";
						setSyslogConfig(logMessage);
						return false;
					}
				} finally {
					// �X�V���ʃ��b�Z�[�W�\��
					logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
					for(int idx = 0; idx < issuePrc.getErrorList().size(); idx++){
						message1 = message1 + "," + new ExpjMessage(issuePrc.getErrorList().get(idx).toString()).getMessage(_locale);
					}
					if (!isNull(message1)) {
						message1 = message1.substring(1);
						csvExport(adstruct					// �Ώۃf�[�^���
								, "1"						// �G���[�敪
								, n + 1						// �G���[�����s
								,null
								,new ExpjMessage("ZZ01006",message1).getMessage(_locale)
								,null);	// �G���[���b�Z�[�W
						if (warningFlg){
							_intWarningCount1--;
						}
						_intErrorCount++;
					}
					
					message1 = "";
					for(int idx = 0; idx < issuePrc.getWarnList().size(); idx++){
						message1 = message1 + "," + new ExpjMessage(issuePrc.getWarnList().get(idx).toString()).getMessage(_locale);
					}
					if (!isNull(message1)) {
						message1 = message1.substring(1);
						csvExport(adstruct					// �Ώۃf�[�^���
								, "2"						// �G���[�敪
								, n + 1						// �G���[�����s
								,null
								,new ExpjMessage("ZZ01006",message1).getMessage(_locale)
								,null);	// �G���[���b�Z�[�W
						if (!warningFlg){
							_intWarningCount1++;
							warningFlg = true;
						}
					}
				}
			}

				return true;
		}
		//---------- ���ɏ����c�a�o�^�����i�e��ʁA�q��ʂŋ��ʎg�p�ׁ̈j�j --------------------
		/**
		 * �e��ʂ̓o�^�{�^���Ǝq��ʂ̓o�^�{�^�����狤�ʂɌĂяo����鏈���ł��B
		 *
		 * @return (true:����I��  false:�ُ�I���j
		 */
		private boolean insert_rcv_process(AF0130010Struct adstruct, int j) throws BusinessProcessException, FoundationException, SQLException
		{
			// ���O�o�͏��i�[�p
			String logMessage = "";
			String message1 = "";
			List listMessage = new ArrayList();
			
			logMessage = "Control : insert_rcv_process"
						+ ", T_ISSUE_INST.ISSUE_INST_CD:" + adstruct.getISSUE_INST_CD();
			setSyslogConfig(logMessage);

				//----------------------------------------------------------
				// �L���x���i�̏ꍇ�A�L���x������o�^
				//----------------------------------------------------------
				
			AF0130010Struct readStruct = new AF0130010Struct();
			List tpList = entity.mselect_T_ISSUE_INST1.read(conn, adstruct);
			if (!tpList.isEmpty()) {
		    readStruct = (AF0130010Struct)tpList.get(0);
		    //�o�Ɏw���̎x���敪��1(�L���x��)�̎�
				if ("1".equals(readStruct.getCONS_TYP())) {

					logMessage = "M_CONS_UNIT_COST.ITEM_CD:" +  readStruct.getITEM_CD()
								+ ", M_CONS_UNIT_COST.VEND_CD:" +  readStruct.getVEND_CD()
								+ ", M_CONS_UNIT_COST.COMPANY_CD:" +  readStruct.getCOMPANY_CD()
								+ ", T_ISSUE_INST.EFF_PHASE_IN_DATE:" + readStruct.getRCV_ISSUE_DATE();
					setSyslogConfig(logMessage);
					//�x���P���̎擾
					List tmpList = entity.mmselectM_COST.read(conn, adstruct);
					if(tmpList.size() <= 0) {
						readStruct.setUNIT_COST(new String("0"));
						readStruct.setUNIT_COST_TYP(new Integer(1));
					}
					else{
						AF0130010Struct workStruct = (AF0130010Struct)tmpList.get(0);
						logMessage = "M_CONS_UNIT_COST.ONEROUS_FLG:" +  workStruct.getONEROUS_FLG()
									+ ", M_CONS_UNIT_COST.UNIT_COST:" +  workStruct.getUNIT_COST()
									+ ", M_CONS_UNIT_COST.UNIT_COST_TYP:" +  workStruct.getUNIT_COST_TYP();
						setSyslogConfig(logMessage);
						// �x���P���̗L���t���O��1(�L��)�̎��A�L���P���Z�b�g
						if(("1").equals(workStruct.getONEROUS_FLG()) == true){
							readStruct.setUNIT_COST(workStruct.getUNIT_COST());
							readStruct.setUNIT_COST_TYP(workStruct.getUNIT_COST_TYP());
						}
						else{
							readStruct.setUNIT_COST(new String("0"));
							readStruct.setUNIT_COST_TYP(new Integer(1));
						}
					}

					// �L���x���ԍ��̔�
					String ctrlCd = null;
					CollectNumber collect = new CollectNumber(
											CollectNumber.ONERCONS_CD, 
											getsysUSER_CD(), 
											this.sp.getProcId(), 
											sysPLANT_CD);
					try{
						ctrlCd = collect.getNo();
						if(ctrlCd == null || ctrlCd.length() == 0){
							// �̔Ԍ��ʂ��Ȃ�
							csvExport(adstruct					// �Ώۃf�[�^���
									, "1"						// �G���[�敪
									, j + 1						// �G���[�����s
									,null
									,new ExpjMessage("AF00078").getMessage(_locale)
									,null);	// �G���[���b�Z�[�W
							if (warningFlg){
								_intWarningCount1--;
							}
							_intErrorCount++;
							return false;
						}
					}
					catch(FoundationException ex){
						// �o�^�������s�F�L���x���ԍ��̍̔ԂɎ��s���܂���
						csvExport(adstruct					// �Ώۃf�[�^���
								, "1"						// �G���[�敪
								, j + 1						// �G���[�����s
								,null
								,new ExpjMessage("AF00078").getMessage(_locale)
								,null);	// �G���[���b�Z�[�W
						if (warningFlg){
							_intWarningCount1--;
						}
						_intErrorCount++;
						return false;
					}
					
					// �L���x���ԍ�
					readStruct.setONEROUS_CONS_NO(ctrlCd);
					// �o�ɐ�
					readStruct.setRCV_ISSUE_QTY(adstruct.getISSUE_QTY());
					//�o�ɓ�
					readStruct.setRCV_ISSUE_DATE(adstruct.getISSUE_DATE());
					// ����
					readStruct.setJOB_ODR_CD(adstruct.getJOB_ODR_CD());
					//���[�J���b�g�ԍ�
					readStruct.setVEND_LOT_NO(adstruct.getVEND_LOT_NO());
					// �ԕi��ۊǋ�R�[�h
					readStruct.setRETURNED_WH_CD("");
					// ���o�ɊǗ��ԍ�
					readStruct.setRCV_ISSUE_CTRL_CD(_ctrlCd);
					//�݌Ƀ��b�g�ԍ�
				    readStruct.setSTOCK_LOT_CD(adstruct.getLOT_NO());

					logMessage = "T_PAST_ONEROUS_CONS.ONEROUS_CONS_NO:" + readStruct.getONEROUS_CONS_NO()
								+ ",T_PAST_ONEROUS_CONS.JOB_ODR_CD:" + readStruct.getw_JOB_ODR_CD()
								+ ", T_PAST_ONEROUS_CONS.ITEM_CD:" + readStruct.getITEM_CD()
								+ ", T_PAST_ONEROUS_CONS.VEND_CD:" + readStruct.getVEND_CD()
								+ ", T_PAST_ONEROUS_CONS.ISSUE_DATE:" + readStruct.getRCV_ISSUE_DATE()
								+ ", T_PAST_ONEROUS_CONS.ISSUE_QTY:" + readStruct.gettmp_RCV_ISSUE_QTY();
					setSyslogConfig(logMessage);
					readStruct.setsUser_ID(struct.getsUser_ID());
					// �L���x������o�^
					entity.minsertSub1T_PAST_ONEROUS_CONS.create(conn, readStruct);
				}
			  }
				if (readStruct.getRCV_WH_CD() != null && "".equals(readStruct.getRCV_WH_CD()) == false) {
				//----------------------------------------------------------
				// �ۊǋ�ʓ��o�Ɂi���Ɂj�o�^
				//----------------------------------------------------------
					// ���o�ɊǗ��ԍ��̔ԁi���Ɂj
					String ctrlCd = null;
					CollectNumber collect = new CollectNumber(
											CollectNumber.ISSUE_CD, 
											getsysUSER_CD(), 
											this.sp.getProcId(), 
											sysPLANT_CD);
					try{
						ctrlCd = collect.getNo();
						if(ctrlCd == null || ctrlCd.length() == 0){
							// �̔Ԍ��ʂ��Ȃ�
							csvExport(adstruct					// �Ώۃf�[�^���
									, "1"						// �G���[�敪
									, j + 1						// �G���[�����s
									,null
									,new ExpjMessage("AF00057").getMessage(_locale)
									,null);	// �G���[���b�Z�[�W
							if (warningFlg){
								_intWarningCount1--;
							}
							_intErrorCount++;
							return false;
						}
					}
					catch(FoundationException ex){
						// �̔Ԍ��ʂ��Ȃ�
						csvExport(adstruct					// �Ώۃf�[�^���
								, "1"						// �G���[�敪
								, j + 1						// �G���[�����s
								,null
								,new ExpjMessage("AF00057").getMessage(_locale)
								,null);	// �G���[���b�Z�[�W
						if (warningFlg){
							_intWarningCount1--;
						}
						_intErrorCount++;
						return false;
					}

					// ���o�ɊǗ��ԍ�
					readStruct.setRCV_ISSUE_CTRL_CD(ctrlCd);
					// ���ɕۊǋ�
					readStruct.settmp_WH_CD(adstruct.getRCV_WH_CD());
					//����
					List mitemList =entity.mselect_LOT_CTRL_FLG.read(conn, readStruct);
					AF0130010Struct mitemStruct =(AF0130010Struct)mitemList.get(0);
					//�i�ڂ̕i�ڎ�z�敪�� 1�F���ԁA2�F�݌Ɉ����^���Ԃ̏ꍇ
					//[�o�Ɏw��].�g���ԁh ,��L�ȊO Null
					if(!"1".equals(mitemStruct.getMRP_ODR_TYP()) && 
							!"2".equals(mitemStruct.getMRP_ODR_TYP())){
						readStruct.setJOB_ODR_CD("");
					}
					else{
						readStruct.setJOB_ODR_CD(adstruct.getJOB_ODR_CD());
					}
					//���o�ɔN����
				    readStruct.setRCV_ISSUE_DATE(adstruct.getISSUE_DATE());
					// ���ɐ�
					readStruct.settmp_RCV_ISSUE_QTY(adstruct.getISSUE_QTY());
				    //���[�J���b�g�ԍ�
				    readStruct.setVEND_LOT_NO(adstruct.getVEND_LOT_NO());
				    //�݌Ƀ��b�g�ԍ�
				    readStruct.setw_STOCK_LOT_CD(adstruct.getLOT_NO());
				    
					// ���o�Ɋ����t���O
					readStruct.setRCV_ISSUE_CMPLT_FLG(adstruct.getISSUE_CMPLT_FLG());
					// ���o�ɋ敪�i1:���Ɂj
					readStruct.setRCV_ISSUE_TYP(new Integer(1));
					if ("0".equals(readStruct.getCONS_TYP())) {
						// ���o�ɔ����敪�i61:�H���݌ɓ��Ɂj
						readStruct.setRCV_ISSUE_GNR_TYP(new Integer(61));
					} else {
						// ���o�ɔ����敪�i81:�����݌ɓ��Ɂj
						readStruct.setRCV_ISSUE_GNR_TYP(new Integer(81));
					}
					// �݌ɍX�V�敪�i1:���j
					readStruct.setSTOCK_UPD_TYP(new Integer(1));
		            //��ЃR�[�h
					logMessage = "T_RCV_ISSUE.RCV_ISSUE_CTRL_CD:" + readStruct.getRCV_ISSUE_CTRL_CD()
								+ ", T_RCV_ISSUE.JOB_ODR_CD:" + readStruct.getw_JOB_ODR_CD()
								+ ", T_RCV_ISSUE.ITEM_CD:" + readStruct.getITEM_CD()
								+ ", T_RCV_ISSUE.WH_CD:" + readStruct.getWH_CD()
								+ ", T_RCV_ISSUE.RCV_ISSUE_DATE:" + readStruct.getRCV_ISSUE_DATE()
								+ ", T_RCV_ISSUE.RCV_ISSUE_QTY:" + readStruct.gettmp_RCV_ISSUE_QTY();
					setSyslogConfig(logMessage);
					
					//���[�U��
					readStruct.setsUser_ID(struct.getsUser_ID());
					// [�o�Ɏw��]."����"��o�^���邽�߂̑ޔ�
					String saveJobOdrCd = readStruct.getw_JOB_ODR_CD();
					readStruct.setw_JOB_ODR_CD(readStruct.getJOB_ODR_CD());

					// �ۊǋ�ʓ��o�Ɂi���Ɂj�o�^
					entity.minsertSub1T_RCV_ISSUE.create(conn, readStruct);

					// �ޔ��������Ԃ�߂�
					struct.setw_JOB_ODR_CD(saveJobOdrCd);

					// [���ɏ���]�ďo��
					RcvProcess rcvPrc = new RcvProcess(conn, ctrlCd);
					try{
						if(rcvPrc.execProcess() == true){
							// �X�V�n�j
							logMessage = "Rcv Process was Complated!";
							setSyslogConfig(logMessage);
						}
						else {
							// �X�V�G���[
							logMessage = "Rcv Process was Failed...";
							setSyslogConfig(logMessage);
							return false;
						}
					} finally {
						// �X�V���ʃ��b�Z�[�W�\��
						logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
						
						for(int idx = 0; idx < rcvPrc.getErrorList().size(); idx++){
							message1 = message1 + "," + new ExpjMessage(rcvPrc.getErrorList().get(idx).toString()).getMessage(_locale);
						}
						if (!isNull(message1)) {
							message1 = message1.substring(1);
							csvExport(adstruct					// �Ώۃf�[�^���
									, "1"						// �G���[�敪
									, j + 1						// �G���[�����s
									,null
									,new ExpjMessage("ZZ01006",message1).getMessage(_locale)
									,null);	// �G���[���b�Z�[�W
							if (warningFlg){
								_intWarningCount1--;
							}
							_intErrorCount++;
						}
						message1 = "";
						for(int idx = 0; idx < rcvPrc.getWarnList().size(); idx++){
							message1 = message1 + "," + new ExpjMessage(rcvPrc.getWarnList().get(idx).toString()).getMessage(_locale);
						}
						if (!isNull(message1)) {
							message1 = message1.substring(1);
							csvExport(adstruct					// �Ώۃf�[�^���
								, "2"						// �G���[�敪
								, j + 1						// �G���[�����s
								,null
								,new ExpjMessage("ZZ01006",message1).getMessage(_locale)
								,null);	// �G���[���b�Z�[�W
							if (!warningFlg){
								_intWarningCount1++;
								warningFlg = true;
							}
						}
					}
				}	
				return true;
		}
		/**
		 * ���b�g�ʂɏo�ɂ��������A�o�Ɏ��і��ׂ֒ǉ�����B
		 *
		 */
		public boolean insertupTlotissueinst(AF0130010Struct adstruct, int k) throws  BusinessProcessException, FoundationException, SQLException
		{
			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0130");
			logger.entering("AF0130010Control"+":USER="+struct.getsUser_ID(),"insertupTlotissueinst");
				//{{user_implement_dev:<controlBrowse>
				// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			// �o�Ɏ��і��ׂւ̓o�^
			// �o�ɐ����O�̏ꍇ�́A�o�^�E�X�V���s��Ȃ�
			  if (adstruct.getISSUE_QTY() != null 
					&& !"".equals(adstruct.getISSUE_QTY())
					&& Calculate.compare(adstruct.getISSUE_QTY(), "0") != 0) {
				  
				 AF0130010Struct readStruct = new AF0130010Struct();
				List tpList = entity.mselect_T_ISSUE_INST1.read(conn, adstruct);
				//  �f�[�^�����݂��Ȃ��ꍇ�o�^�A���݂���ꍇ�X�V
				List lockList = entity.mT_LOT_ISSUE_INST_Lock.read(conn, adstruct);
				if (lockList.size() <= 0) {
					readStruct=(AF0130010Struct)tpList.get(0);
					//�݌Ƀ��b�g�ԍ�
					readStruct.setLOT_NO(adstruct.getLOT_NO());
					//readStruct.setw_STOCK_LOT_CD(adstruct.getLOT_NO());
					//�o�Ɏ��ѐ���
					readStruct.setRCV_ISSUE_QTY((adstruct.getISSUE_QTY()));
					//�o�Ɏ��ѓ�
					readStruct.setRCV_ISSUE_DATE(adstruct.getISSUE_DATE());
					//���[�U��
					readStruct.setsUser_ID(struct.getsUser_ID());
					//�o�^
					entity.mT_LOT_ISSUE_INST.create(conn, readStruct);

				} else {
					AF0130010Struct lockStruct = new AF0130010Struct();
					lockStruct = (AF0130010Struct)lockList.get(0);
					// �o�Ɏ��ѐ��ʂ̌v�Z
					//  [�o�Ɏ��і���]."�o�Ɏ��ѐ�" + ��ʁu�o�ɐ��v 
					String rcvIssueQty = "0";
					rcvIssueQty = Calculate.add(
							lockStruct.getISSUE_QTY(),
							adstruct.getISSUE_QTY());
					struct.setISSUE_QTY(rcvIssueQty);
					//�o�ɓ�
					struct.setRCV_ISSUE_DATE(adstruct.getISSUE_DATE());
					//�݌Ƀ��b�g�ԍ�
					struct.setLOT_NO(adstruct.getLOT_NO());
					//�o�Ɏw���ԍ�
					struct.setISSUE_INST_CD(adstruct.getISSUE_INST_CD());
					
					entity.mT_LOT_ISSUE_INST.update(conn, struct);
				}
				
			}
			 // return true;
	                //}}user_implement_dev:<controlBrowse>
			logger.exiting("AF0130010Control"+":USER="+struct.getsUser_ID(),"insertupTlotissueinst");
			return true;

		}
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Q�ƃ{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlBrowse() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0130");
		logger.entering("AF0130010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");
			//{{user_implement_dev:<controlBrowse>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlBrowse>
		logger.exiting("AF0130010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");

		return;
	}

	/**
	 * �捞�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCsvIn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0130");
		logger.entering("AF0130010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");
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
				// ���[�j���O����
				_intWarningCount1 = 0;
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
							_intSuccessCount = _intSuccessCount - _intWarningCount1;
							// �G���[���Ȃ��ꍇ
							if (_intWarningCount1 + _intWarningCount== 0) {
								setInfoMessage("AA01514", String.valueOf(_intSuccessCount));
							} else {
								setWarningMessage("AA01515", String.valueOf(_intSuccessCount), String.valueOf(_intWarningCount+_intWarningCount1));
							}
						} else {
							_intSuccessCount = _intTotalCount - _intErrorCount - _intWarningCount-_intWarningCount1;
							setErrorMessage("AA01516", String.valueOf(_intSuccessCount), String.valueOf(_intWarningCount+_intWarningCount1), String.valueOf(_intErrorCount));
						}
					} else {
						// �G���[������ꍇ
						setErrorMessage("AA01516", String.valueOf(_intSuccessCount), String.valueOf(_intWarningCount), String.valueOf(_intErrorCount));
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
				setErrorMessage("ZZ01106");
				setReadStatus(ERROR);
			}
                //}}user_implement_dev:<controlCsvIn>
		logger.exiting("AF0130010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");

		return;
	}

	/**
	 * CSV�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCSVOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0130");
		logger.entering("AF0130010Control"+":USER="+struct.getsUser_ID(),"controlCSVOut");
			//{{user_implement_dev:<controlCSVOut>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			// CSV�o�͕��i��ݒ�
			csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));
			AF0130010Struct errorStruct = null;
			List csv = new ArrayList();	// CSV���
			// CSV�w�b�_�s��CSV���ɒǉ�
			String[] title = {
					 "Expj.Cmt3094"							// �G���[�ӏ�
					,"Expj.Cmt3095"							// �G���[�敪
					,"Expj.Cmt3098"							// �G���[���e
					,"Expj.Cmt6220"							// �G���[����
					,"Expj.ISSUE_INST_CD"				    // �o�Ɏw���ԍ�
					,"Expj.JOB_ODR_CD"						// ����
					,"Expj.ISSUE_WH_CD_1"					// �o�Ɍ��ۊǋ�R�[�h
					,"Expj.STOCK_LOT_CD"					// �݌Ƀ��b�g�ԍ�
					,"Expj.ISSUE_QTY"						// �o�ɐ�
					,"Expj.ISSUE_DATE"						// �o�ɓ�
					,"Expj.ISSUE_CMPLT_FLG_2"				// �o�Ɋ���
					,"Expj.RCV_WH_CD_1"					    // �o�ɐ�ۊǋ�R�[�h
					,"Expj.VEND_LOT_NO"					    // ���[�J���b�g�ԍ�
			};
			csv.add(title);
			// [���].�ꗗ���̃G���[����CSV���ɒǉ�
			// [���].�ꗗ���̃G���[����CSV���ɒǉ�
			for (int i = 0; i < list.size(); i++) {
				errorStruct = (AF0130010Struct)list.get(i);
				String[] date = {
						 errorStruct.getl_ERROR_IN()
						,errorStruct.getl_ERR_TYP()
						,errorStruct.getl_ERR_INFO()
						,errorStruct.getl_ERR_CTR_NM()
						,replaceSlashSub(errorStruct.getl_ERR_ISSUE_INST_CD())
						,replaceSlashSub(errorStruct.getl_ERR_JOB_ODR_CD())
						,replaceSlashSub(errorStruct.getl_ERR_ISSUE_WH_CD())
						,replaceSlashSub(errorStruct.getl_ERR_STOCK_LOT_CD())
						,replaceSlashSub(errorStruct.getl_ERR_ISSUE_QTY())
						,replaceSlashSub(errorStruct.getl_ERR_ISSUE_DATE())
						,replaceSlashSub(errorStruct.getl_ERR_ISSUE_CMPLT_FLG())
						,replaceSlashSub(errorStruct.getl_ERR_RCV_WH_CD())
						,replaceSlashSub(errorStruct.getl_ERR_VEND_LOT_NO())
						
				};
				csv.add(date);
			}
			
			// CSV�t�@�C�����쐬
			csvWriter.write(csv, CoreTools.getLocale(struct.getsUser_ID()), true);
			// CSV�t�@�C�����N���C�A���g�ɏo��
			struct.setDOWNLOAD_FILE(getCsvWriter().getFilePath());

		}catch(Exception e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			throw ee;
		} finally {
			//
		}
                //}}user_implement_dev:<controlCSVOut>
		logger.exiting("AF0130010Control"+":USER="+struct.getsUser_ID(),"controlCSVOut");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0130");
		logger.entering("AF0130010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		setList(null);
		// ������Ԃ��u������ԁv�ɐݒ�
		setReadStatus(INITIAL);
                //}}user_implement_dev:<controlClear>
		logger.exiting("AF0130010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0130");
		logger.entering("AF0130010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("AF0130010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * ���s�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlExecute() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0130");
		logger.entering("AF0130010Control"+":USER="+struct.getsUser_ID(),"controlExecute");
			//{{user_implement_dev:<controlExecute>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try{
	    	setReadStatus(INITIAL); 
	        // �o�b�`�����N���X��main����
	        String strBatchClassName = null;		// �Ăяo����N���X��
	        String strBatchProcessingTyp = null;	// �o�b�`�����敪
	        String strProgramId = null;			    // �Ɩ����iAF0130B001�j
	        String strUserId = null;				// ���[�UID
	        String strPlantCd = null;				// �H��R�[�h
	        String strCsvTakeTyp =null;             // CSV�捞����
	        // �����Z�b�g
	        strBatchClassName = "com.nec.jp.orteus.metamorBase.AF0130.AF0130B001.mainAF0130B001";
	        strBatchProcessingTyp = "2";					  // 2: �����^�]���Ȃ��i��ԃo�b�`�Ȃ��j
	        strProgramId = "AF0130B001";					  // �Ɩ����iAF0130B001�j
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
		logger.exiting("AF0130010Control"+":USER="+struct.getsUser_ID(),"controlExecute");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0130");
		logger.entering("AF0130010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AF0130010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0130");
		logger.entering("AF0130010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try{
			setList(null);
			
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
			// �ȉ��̏����ŁA[�V�X�e���p�����[�^]���������A�ݒ�l�i�������Ă��錎�̎��т̓o�^�^�C�����\�Ƃ��邩�ۂ��̋敪�j���擾����B
			AF0130010Struct adStruct = new AF0130010Struct();
			List valueList = entity.mselectPARAMETER.read(conn, adStruct);
			if (valueList.isEmpty()) {
				strValus = "true";
			}else {
				adStruct = (AF0130010Struct)valueList.get(0);
				strValus = adStruct.getVALUE();
			}		
			// �R���{�{�b�N�X�f�[�^�p��
	 		ComboBox combBox = new ComboBox(conn, sysUSER_CD);
			// �R���{�{�b�N�X�̃f�[�^���擾
			_COM_ERR_TYP = combBox.getData("ERR_TYP");
			
		}catch(ExpjException e) {
			throw e;
		}
		catch(Exception e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			throw ee;
		} 
/*			// �f�[�^�x�[�X�ւ̃A�N�Z�X���s���ꍇ�́A����try catch���̃R�����g���O���Ă��������B
		try{
*/
			// ��ʑJ�ڂ̌Ăяo����������AStruct�ɉ�ʑJ�ڃL�[��ݒ肵��controlSelect()���Ăяo��
			if ( isScreenMove() == true ) {
				// �����̃R���g���[�����\�b�h���Ăяo���܂��B
//				controlSelect();
			}

/*			// �f�[�^�x�[�X�ւ̃A�N�Z�X���s���ꍇ�́A����try catch���̃R�����g���O���Ă��������B
		} catch(SQLException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			// 
		}
*/
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AF0130010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0130");
		logger.entering("AF0130010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
		logger.exiting("AF0130010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
//			throw new FoundationException("AF0130010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0130010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AF0130010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0130010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AF0130010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0130010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AF0130010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AF0130010Entity entity;
	protected AF0130010Struct struct;
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

		entity = new AF0130010Entity();
		struct = new AF0130010Struct();

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
	 * AF0130010�N���X�̕W���R���X�g���N�^
	 */
	public AF0130010Control() throws BusinessProcessException, FoundationException
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
				AF0130010Struct key = (AF0130010Struct)keyList.get(j);
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
				if(msgKeyType.containsKeyColumn("l_ERR_ISSUE_INST_CD") && key.getl_ERR_ISSUE_INST_CD() != null) {
					msgKey.setKeyValue("l_ERR_ISSUE_INST_CD", key.getl_ERR_ISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_JOB_ODR_CD") && key.getl_ERR_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_ERR_JOB_ODR_CD", key.getl_ERR_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_ISSUE_WH_CD") && key.getl_ERR_ISSUE_WH_CD() != null) {
					msgKey.setKeyValue("l_ERR_ISSUE_WH_CD", key.getl_ERR_ISSUE_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_STOCK_LOT_CD") && key.getl_ERR_STOCK_LOT_CD() != null) {
					msgKey.setKeyValue("l_ERR_STOCK_LOT_CD", key.getl_ERR_STOCK_LOT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_ISSUE_QTY") && key.getl_ERR_ISSUE_QTY() != null) {
					msgKey.setKeyValue("l_ERR_ISSUE_QTY", key.getl_ERR_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_ISSUE_DATE") && key.getl_ERR_ISSUE_DATE() != null) {
					msgKey.setKeyValue("l_ERR_ISSUE_DATE", key.getl_ERR_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_ISSUE_CMPLT_FLG") && key.getl_ERR_ISSUE_CMPLT_FLG() != null) {
					msgKey.setKeyValue("l_ERR_ISSUE_CMPLT_FLG", key.getl_ERR_ISSUE_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_RCV_WH_CD") && key.getl_ERR_RCV_WH_CD() != null) {
					msgKey.setKeyValue("l_ERR_RCV_WH_CD", key.getl_ERR_RCV_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_VEND_LOT_NO") && key.getl_ERR_VEND_LOT_NO() != null) {
					msgKey.setKeyValue("l_ERR_VEND_LOT_NO", key.getl_ERR_VEND_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_ITEM_CD") && key.getl_ERR_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ERR_ITEM_CD", key.getl_ERR_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("w_COLUMN_FLG") && key.getw_COLUMN_FLG() != null) {
					msgKey.setKeyValue("w_COLUMN_FLG", key.getw_COLUMN_FLG());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_QTY") && key.getISSUE_QTY() != null) {
					msgKey.setKeyValue("ISSUE_QTY", key.getISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_FLG") && key.getISSUE_CMPLT_FLG() != null) {
					msgKey.setKeyValue("ISSUE_CMPLT_FLG", key.getISSUE_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("RCV_WH_CD") && key.getRCV_WH_CD() != null) {
					msgKey.setKeyValue("RCV_WH_CD", key.getRCV_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_LOT_NO") && key.getVEND_LOT_NO() != null) {
					msgKey.setKeyValue("VEND_LOT_NO", key.getVEND_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_DATE") && key.getISSUE_DATE() != null) {
					msgKey.setKeyValue("ISSUE_DATE", key.getISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("tmp_RCV_ISSUE_QTY") && key.gettmp_RCV_ISSUE_QTY() != null) {
					msgKey.setKeyValue("tmp_RCV_ISSUE_QTY", key.gettmp_RCV_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("THIS_TIME_ISSUE_POSS_QTY") && key.getTHIS_TIME_ISSUE_POSS_QTY() != null) {
					msgKey.setKeyValue("THIS_TIME_ISSUE_POSS_QTY", key.getTHIS_TIME_ISSUE_POSS_QTY());
				}
				if(msgKeyType.containsKeyColumn("ALC_NOISSUE_QTY") && key.getALC_NOISSUE_QTY() != null) {
					msgKey.setKeyValue("ALC_NOISSUE_QTY", key.getALC_NOISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("ODR_ISSUE_POSS_QTY") && key.getODR_ISSUE_POSS_QTY() != null) {
					msgKey.setKeyValue("ODR_ISSUE_POSS_QTY", key.getODR_ISSUE_POSS_QTY());
				}
				if(msgKeyType.containsKeyColumn("ITEM_STOCK_NON_ALC_QTY") && key.getITEM_STOCK_NON_ALC_QTY() != null) {
					msgKey.setKeyValue("ITEM_STOCK_NON_ALC_QTY", key.getITEM_STOCK_NON_ALC_QTY());
				}
				if(msgKeyType.containsKeyColumn("L_JOB_ODR_CD") && key.getL_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("L_JOB_ODR_CD", key.getL_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("LA_ISSUE_QTY") && key.getLA_ISSUE_QTY() != null) {
					msgKey.setKeyValue("LA_ISSUE_QTY", key.getLA_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_CD") && key.getISSUE_INST_CD() != null) {
					msgKey.setKeyValue("ISSUE_INST_CD", key.getISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_CD") && key.getWORK_ODR_CD() != null) {
					msgKey.setKeyValue("WORK_ODR_CD", key.getWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD") && key.getWORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("WORK_IN_PROC_CD", key.getWORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_TYP") && key.getISSUE_TYP() != null) {
					msgKey.setKeyValue("ISSUE_TYP", key.getISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("CONS_TYP") && key.getCONS_TYP() != null) {
					msgKey.setKeyValue("CONS_TYP", key.getCONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_QTY") && key.getISSUE_INST_QTY() != null) {
					msgKey.setKeyValue("ISSUE_INST_QTY", key.getISSUE_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY") && key.getTOTAL_ISSUE_QTY() != null) {
					msgKey.setKeyValue("TOTAL_ISSUE_QTY", key.getTOTAL_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("SHIP_REMAIN_QTY") && key.getSHIP_REMAIN_QTY() != null) {
					msgKey.setKeyValue("SHIP_REMAIN_QTY", key.getSHIP_REMAIN_QTY());
				}
				if(msgKeyType.containsKeyColumn("COUNT") && key.getCOUNT() != null) {
					msgKey.setKeyValue("COUNT", key.getCOUNT());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("MRP_FLG") && key.getMRP_FLG() != null) {
					msgKey.setKeyValue("MRP_FLG", key.getMRP_FLG());
				}
				if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG") && key.getLOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("LOT_CTRL_FLG", key.getLOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO") && key.getLOT_NO() != null) {
					msgKey.setKeyValue("LOT_NO", key.getLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("BEST_BEFORE_DATE") && key.getBEST_BEFORE_DATE() != null) {
					msgKey.setKeyValue("BEST_BEFORE_DATE", key.getBEST_BEFORE_DATE());
				}
				if(msgKeyType.containsKeyColumn("PROC_EXEC_DATE") && key.getPROC_EXEC_DATE() != null) {
					msgKey.setKeyValue("PROC_EXEC_DATE", key.getPROC_EXEC_DATE());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_DATE_SUB") && key.getISSUE_DATE_SUB() != null) {
					msgKey.setKeyValue("ISSUE_DATE_SUB", key.getISSUE_DATE_SUB());
				}
				if(msgKeyType.containsKeyColumn("SYS_PARAMETER_VALUE") && key.getSYS_PARAMETER_VALUE() != null) {
					msgKey.setKeyValue("SYS_PARAMETER_VALUE", key.getSYS_PARAMETER_VALUE());
				}
				if(msgKeyType.containsKeyColumn("SYS_PARAMETER_NAME") && key.getSYS_PARAMETER_NAME() != null) {
					msgKey.setKeyValue("SYS_PARAMETER_NAME", key.getSYS_PARAMETER_NAME());
				}
				if(msgKeyType.containsKeyColumn("INSTALL_FLG") && key.getINSTALL_FLG() != null) {
					msgKey.setKeyValue("INSTALL_FLG", key.getINSTALL_FLG());
				}
				if(msgKeyType.containsKeyColumn("THIS_MONTH") && key.getTHIS_MONTH() != null) {
					msgKey.setKeyValue("THIS_MONTH", key.getTHIS_MONTH());
				}
				if(msgKeyType.containsKeyColumn("w_SHIP_REMAIN_QTY") && key.getw_SHIP_REMAIN_QTY() != null) {
					msgKey.setKeyValue("w_SHIP_REMAIN_QTY", key.getw_SHIP_REMAIN_QTY());
				}
				if(msgKeyType.containsKeyColumn("SCDL_ISSUE_DATE") && key.getSCDL_ISSUE_DATE() != null) {
					msgKey.setKeyValue("SCDL_ISSUE_DATE", key.getSCDL_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_DATE") && key.getISSUE_CMPLT_DATE() != null) {
					msgKey.setKeyValue("ISSUE_CMPLT_DATE", key.getISSUE_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT().toString());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO") && key.getJOB_ODR_DETAIL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_DETAIL_NO", key.getJOB_ODR_DETAIL_NO().toString());
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
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("WS_NAME") && key.getWS_NAME() != null) {
					msgKey.setKeyValue("WS_NAME", key.getWS_NAME());
				}
				if(msgKeyType.containsKeyColumn("VEND_NAME") && key.getVEND_NAME() != null) {
					msgKey.setKeyValue("VEND_NAME", key.getVEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_NAME") && key.getPROC_NAME() != null) {
					msgKey.setKeyValue("PROC_NAME", key.getPROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD_proc") && key.getOPR_INST_CD_proc() != null) {
					msgKey.setKeyValue("OPR_INST_CD_proc", key.getOPR_INST_CD_proc());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD_item") && key.getOPR_INST_CD_item() != null) {
					msgKey.setKeyValue("OPR_INST_CD_item", key.getOPR_INST_CD_item());
				}
				if(msgKeyType.containsKeyColumn("w_ISSUE_INST_CD") && key.getw_ISSUE_INST_CD() != null) {
					msgKey.setKeyValue("w_ISSUE_INST_CD", key.getw_ISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("w_WS_CD") && key.getw_WS_CD() != null) {
					msgKey.setKeyValue("w_WS_CD", key.getw_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("w_VEND_CD") && key.getw_VEND_CD() != null) {
					msgKey.setKeyValue("w_VEND_CD", key.getw_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("w_ISSUE_CMPLT_FLG") && key.getw_ISSUE_CMPLT_FLG() != null) {
					msgKey.setKeyValue("w_ISSUE_CMPLT_FLG", key.getw_ISSUE_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_CD") && key.getw_PLANT_CD() != null) {
					msgKey.setKeyValue("w_PLANT_CD", key.getw_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("t_WORK_ODR_CD") && key.gett_WORK_ODR_CD() != null) {
					msgKey.setKeyValue("t_WORK_ODR_CD", key.gett_WORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("t_WORK_IN_PROC_CD") && key.gett_WORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("t_WORK_IN_PROC_CD", key.gett_WORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("w_PUCH_ODR_CD") && key.getw_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("w_PUCH_ODR_CD", key.getw_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("w_LOT_CTRL_FLG") && key.getw_LOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("w_LOT_CTRL_FLG", key.getw_LOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD") && key.getRCV_ISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CTRL_CD", key.getRCV_ISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP") && key.getRCV_ISSUE_TYP() != null) {
					msgKey.setKeyValue("RCV_ISSUE_TYP", key.getRCV_ISSUE_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("tmp_WH_CD") && key.gettmp_WH_CD() != null) {
					msgKey.setKeyValue("tmp_WH_CD", key.gettmp_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_DATE") && key.getRCV_ISSUE_DATE() != null) {
					msgKey.setKeyValue("RCV_ISSUE_DATE", key.getRCV_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_GNR_TYP") && key.getRCV_ISSUE_GNR_TYP() != null) {
					msgKey.setKeyValue("RCV_ISSUE_GNR_TYP", key.getRCV_ISSUE_GNR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UPD_TYP") && key.getSTOCK_UPD_TYP() != null) {
					msgKey.setKeyValue("STOCK_UPD_TYP", key.getSTOCK_UPD_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_FLG") && key.getRCV_ISSUE_CMPLT_FLG() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CMPLT_FLG", key.getRCV_ISSUE_CMPLT_FLG().toString());
				}
				if(msgKeyType.containsKeyColumn("w_STOCK_LOT_CD") && key.getw_STOCK_LOT_CD() != null) {
					msgKey.setKeyValue("w_STOCK_LOT_CD", key.getw_STOCK_LOT_CD());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST") && key.getUNIT_COST() != null) {
					msgKey.setKeyValue("UNIT_COST", key.getUNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP") && key.getUNIT_COST_TYP() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP", key.getUNIT_COST_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("ONEROUS_FLG") && key.getONEROUS_FLG() != null) {
					msgKey.setKeyValue("ONEROUS_FLG", key.getONEROUS_FLG());
				}
				if(msgKeyType.containsKeyColumn("ONEROUS_CONS_NO") && key.getONEROUS_CONS_NO() != null) {
					msgKey.setKeyValue("ONEROUS_CONS_NO", key.getONEROUS_CONS_NO());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_QTY") && key.getRCV_ISSUE_QTY() != null) {
					msgKey.setKeyValue("RCV_ISSUE_QTY", key.getRCV_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("RETURNED_WH_CD") && key.getRETURNED_WH_CD() != null) {
					msgKey.setKeyValue("RETURNED_WH_CD", key.getRETURNED_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("STOCK_LOT_CD") && key.getSTOCK_LOT_CD() != null) {
					msgKey.setKeyValue("STOCK_LOT_CD", key.getSTOCK_LOT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_LOT_NO") && key.getl_LOT_NO() != null) {
					msgKey.setKeyValue("l_LOT_NO", key.getl_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_CD") && key.getl_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_CD", key.getl_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_WORK_ODR_CD") && key.getl_WORK_ODR_CD() != null) {
					msgKey.setKeyValue("l_WORK_ODR_CD", key.getl_WORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ISSUE_QTY") && key.getl_ISSUE_QTY() != null) {
					msgKey.setKeyValue("l_ISSUE_QTY", key.getl_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ISSUE_DATE") && key.getl_ISSUE_DATE() != null) {
					msgKey.setKeyValue("l_ISSUE_DATE", key.getl_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_SPENT_QTY") && key.getl_SPENT_QTY() != null) {
					msgKey.setKeyValue("l_SPENT_QTY", key.getl_SPENT_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_STOCK_UNIT") && key.getl_STOCK_UNIT() != null) {
					msgKey.setKeyValue("l_STOCK_UNIT", key.getl_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("w_TOTAL_STOCK_ON_HAND_QTY") && key.getw_TOTAL_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("w_TOTAL_STOCK_ON_HAND_QTY", key.getw_TOTAL_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("w_JOB_ODR_CD") && key.getw_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("w_JOB_ODR_CD", key.getw_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("VALUE") && key.getVALUE() != null) {
					msgKey.setKeyValue("VALUE", key.getVALUE());
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
					AF0130010Struct key = new AF0130010Struct();
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
					if(msgKeyType.containsKeyColumn("l_ERR_ISSUE_INST_CD")) {
						key.setl_ERR_ISSUE_INST_CD(msgKey.getKeyValue("l_ERR_ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_JOB_ODR_CD")) {
						key.setl_ERR_JOB_ODR_CD(msgKey.getKeyValue("l_ERR_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_ISSUE_WH_CD")) {
						key.setl_ERR_ISSUE_WH_CD(msgKey.getKeyValue("l_ERR_ISSUE_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_STOCK_LOT_CD")) {
						key.setl_ERR_STOCK_LOT_CD(msgKey.getKeyValue("l_ERR_STOCK_LOT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_ISSUE_QTY")) {
						key.setl_ERR_ISSUE_QTY(msgKey.getKeyValue("l_ERR_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_ISSUE_DATE")) {
						key.setl_ERR_ISSUE_DATE(msgKey.getKeyValue("l_ERR_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_ISSUE_CMPLT_FLG")) {
						key.setl_ERR_ISSUE_CMPLT_FLG(msgKey.getKeyValue("l_ERR_ISSUE_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_RCV_WH_CD")) {
						key.setl_ERR_RCV_WH_CD(msgKey.getKeyValue("l_ERR_RCV_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_VEND_LOT_NO")) {
						key.setl_ERR_VEND_LOT_NO(msgKey.getKeyValue("l_ERR_VEND_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_ITEM_CD")) {
						key.setl_ERR_ITEM_CD(msgKey.getKeyValue("l_ERR_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_COLUMN_FLG")) {
						key.setw_COLUMN_FLG(msgKey.getKeyValue("w_COLUMN_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_QTY")) {
						key.setISSUE_QTY(msgKey.getKeyValue("ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_FLG")) {
						key.setISSUE_CMPLT_FLG(msgKey.getKeyValue("ISSUE_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("RCV_WH_CD")) {
						key.setRCV_WH_CD(msgKey.getKeyValue("RCV_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_LOT_NO")) {
						key.setVEND_LOT_NO(msgKey.getKeyValue("VEND_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_DATE")) {
						key.setISSUE_DATE(msgKey.getKeyValue("ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("tmp_RCV_ISSUE_QTY")) {
						key.settmp_RCV_ISSUE_QTY(msgKey.getKeyValue("tmp_RCV_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("THIS_TIME_ISSUE_POSS_QTY")) {
						key.setTHIS_TIME_ISSUE_POSS_QTY(msgKey.getKeyValue("THIS_TIME_ISSUE_POSS_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ALC_NOISSUE_QTY")) {
						key.setALC_NOISSUE_QTY(msgKey.getKeyValue("ALC_NOISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ODR_ISSUE_POSS_QTY")) {
						key.setODR_ISSUE_POSS_QTY(msgKey.getKeyValue("ODR_ISSUE_POSS_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_STOCK_NON_ALC_QTY")) {
						key.setITEM_STOCK_NON_ALC_QTY(msgKey.getKeyValue("ITEM_STOCK_NON_ALC_QTY"));
					}
					if(msgKeyType.containsKeyColumn("L_JOB_ODR_CD")) {
						key.setL_JOB_ODR_CD(msgKey.getKeyValue("L_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("LA_ISSUE_QTY")) {
						key.setLA_ISSUE_QTY(msgKey.getKeyValue("LA_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_CD")) {
						key.setISSUE_INST_CD(msgKey.getKeyValue("ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_CD")) {
						key.setWORK_ODR_CD(msgKey.getKeyValue("WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD")) {
						key.setWORK_IN_PROC_CD(msgKey.getKeyValue("WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_TYP")) {
						key.setISSUE_TYP(msgKey.getKeyValue("ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CONS_TYP")) {
						key.setCONS_TYP(msgKey.getKeyValue("CONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_QTY")) {
						key.setISSUE_INST_QTY(msgKey.getKeyValue("ISSUE_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY")) {
						key.setTOTAL_ISSUE_QTY(msgKey.getKeyValue("TOTAL_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_REMAIN_QTY")) {
						key.setSHIP_REMAIN_QTY(msgKey.getKeyValue("SHIP_REMAIN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("COUNT")) {
						key.setCOUNT(msgKey.getKeyValue("COUNT"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("MRP_FLG")) {
						key.setMRP_FLG(msgKey.getKeyValue("MRP_FLG"));
					}
					if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG")) {
						key.setLOT_CTRL_FLG(msgKey.getKeyValue("LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO")) {
						key.setLOT_NO(msgKey.getKeyValue("LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("BEST_BEFORE_DATE")) {
						key.setBEST_BEFORE_DATE(msgKey.getKeyValue("BEST_BEFORE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PROC_EXEC_DATE")) {
						key.setPROC_EXEC_DATE(msgKey.getKeyValue("PROC_EXEC_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_DATE_SUB")) {
						key.setISSUE_DATE_SUB(msgKey.getKeyValue("ISSUE_DATE_SUB"));
					}
					if(msgKeyType.containsKeyColumn("SYS_PARAMETER_VALUE")) {
						key.setSYS_PARAMETER_VALUE(msgKey.getKeyValue("SYS_PARAMETER_VALUE"));
					}
					if(msgKeyType.containsKeyColumn("SYS_PARAMETER_NAME")) {
						key.setSYS_PARAMETER_NAME(msgKey.getKeyValue("SYS_PARAMETER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("INSTALL_FLG")) {
						key.setINSTALL_FLG(msgKey.getKeyValue("INSTALL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("THIS_MONTH")) {
						key.setTHIS_MONTH(msgKey.getKeyValue("THIS_MONTH"));
					}
					if(msgKeyType.containsKeyColumn("w_SHIP_REMAIN_QTY")) {
						key.setw_SHIP_REMAIN_QTY(msgKey.getKeyValue("w_SHIP_REMAIN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SCDL_ISSUE_DATE")) {
						key.setSCDL_ISSUE_DATE(msgKey.getKeyValue("SCDL_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_DATE")) {
						key.setISSUE_CMPLT_DATE(msgKey.getKeyValue("ISSUE_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(new Integer(msgKey.getKeyValue("MODIFY_COUNT")));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO")) {
						key.setJOB_ODR_DETAIL_NO(new Integer(msgKey.getKeyValue("JOB_ODR_DETAIL_NO")));
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
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WS_NAME")) {
						key.setWS_NAME(msgKey.getKeyValue("WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("VEND_NAME")) {
						key.setVEND_NAME(msgKey.getKeyValue("VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_NAME")) {
						key.setPROC_NAME(msgKey.getKeyValue("PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD_proc")) {
						key.setOPR_INST_CD_proc(msgKey.getKeyValue("OPR_INST_CD_proc"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD_item")) {
						key.setOPR_INST_CD_item(msgKey.getKeyValue("OPR_INST_CD_item"));
					}
					if(msgKeyType.containsKeyColumn("w_ISSUE_INST_CD")) {
						key.setw_ISSUE_INST_CD(msgKey.getKeyValue("w_ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_WS_CD")) {
						key.setw_WS_CD(msgKey.getKeyValue("w_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_VEND_CD")) {
						key.setw_VEND_CD(msgKey.getKeyValue("w_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_ISSUE_CMPLT_FLG")) {
						key.setw_ISSUE_CMPLT_FLG(msgKey.getKeyValue("w_ISSUE_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_CD")) {
						key.setw_PLANT_CD(msgKey.getKeyValue("w_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("t_WORK_ODR_CD")) {
						key.sett_WORK_ODR_CD(msgKey.getKeyValue("t_WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("t_WORK_IN_PROC_CD")) {
						key.sett_WORK_IN_PROC_CD(msgKey.getKeyValue("t_WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_PUCH_ODR_CD")) {
						key.setw_PUCH_ODR_CD(msgKey.getKeyValue("w_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_LOT_CTRL_FLG")) {
						key.setw_LOT_CTRL_FLG(msgKey.getKeyValue("w_LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD")) {
						key.setRCV_ISSUE_CTRL_CD(msgKey.getKeyValue("RCV_ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP")) {
						key.setRCV_ISSUE_TYP(new Integer(msgKey.getKeyValue("RCV_ISSUE_TYP")));
					}
					if(msgKeyType.containsKeyColumn("tmp_WH_CD")) {
						key.settmp_WH_CD(msgKey.getKeyValue("tmp_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_DATE")) {
						key.setRCV_ISSUE_DATE(msgKey.getKeyValue("RCV_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_GNR_TYP")) {
						key.setRCV_ISSUE_GNR_TYP(new Integer(msgKey.getKeyValue("RCV_ISSUE_GNR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UPD_TYP")) {
						key.setSTOCK_UPD_TYP(new Integer(msgKey.getKeyValue("STOCK_UPD_TYP")));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_FLG")) {
						key.setRCV_ISSUE_CMPLT_FLG(new Integer(msgKey.getKeyValue("RCV_ISSUE_CMPLT_FLG")));
					}
					if(msgKeyType.containsKeyColumn("w_STOCK_LOT_CD")) {
						key.setw_STOCK_LOT_CD(msgKey.getKeyValue("w_STOCK_LOT_CD"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST")) {
						key.setUNIT_COST(msgKey.getKeyValue("UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP")) {
						key.setUNIT_COST_TYP(new Integer(msgKey.getKeyValue("UNIT_COST_TYP")));
					}
					if(msgKeyType.containsKeyColumn("ONEROUS_FLG")) {
						key.setONEROUS_FLG(msgKey.getKeyValue("ONEROUS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ONEROUS_CONS_NO")) {
						key.setONEROUS_CONS_NO(msgKey.getKeyValue("ONEROUS_CONS_NO"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_QTY")) {
						key.setRCV_ISSUE_QTY(msgKey.getKeyValue("RCV_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("RETURNED_WH_CD")) {
						key.setRETURNED_WH_CD(msgKey.getKeyValue("RETURNED_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_LOT_CD")) {
						key.setSTOCK_LOT_CD(msgKey.getKeyValue("STOCK_LOT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_LOT_NO")) {
						key.setl_LOT_NO(msgKey.getKeyValue("l_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_CD")) {
						key.setl_PUCH_ODR_CD(msgKey.getKeyValue("l_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_WORK_ODR_CD")) {
						key.setl_WORK_ODR_CD(msgKey.getKeyValue("l_WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ISSUE_QTY")) {
						key.setl_ISSUE_QTY(msgKey.getKeyValue("l_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ISSUE_DATE")) {
						key.setl_ISSUE_DATE(msgKey.getKeyValue("l_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_SPENT_QTY")) {
						key.setl_SPENT_QTY(msgKey.getKeyValue("l_SPENT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_STOCK_UNIT")) {
						key.setl_STOCK_UNIT(msgKey.getKeyValue("l_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("w_TOTAL_STOCK_ON_HAND_QTY")) {
						key.setw_TOTAL_STOCK_ON_HAND_QTY(msgKey.getKeyValue("w_TOTAL_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("w_JOB_ODR_CD")) {
						key.setw_JOB_ODR_CD(msgKey.getKeyValue("w_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("VALUE")) {
						key.setVALUE(msgKey.getKeyValue("VALUE"));
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
