/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0140/src/com/nec/jp/orteus/metamorBase/AD0140/AD0140010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0140;

import com.nec.jp.orteus.metamorBase.AD0140.*;
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
import java.text.ParseException ;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AD0140010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: geng-jia $
 * @version $Revision: 1.6 $ $Date: 2015/12/21 03:06:19 $
 * 
 */
//}}user_implement_code_header

public class AD0140010Control
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
	public AD0140010Struct getListvalue(int x) { return (AD0140010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AD0140010Struct getStruct() { return this.struct; }	// Struct�̒l��Ԃ��܂��B
	public AD0140010Struct createStruct() { return new AD0140010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AD0140010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	
	/**�S�����R�[�h��**/
	private int _intTotalCount = 0; 
	/**�G���[���R�[�h����**/
	private int _intErrorCount = 0;  
	/**���탌�R�[�h����**/
	private int _intSuccessCount = 0;
	/**���[�j���O����**/
	private int _intWarningCount = 0;
	
	/** �b�r�u���ڔԍ���` */
	// ����敪
	private final int CSV_DAILY_WORK_REPORT_TYP = 0;

	// ���[�U�R�[�h�i�l����j
	private final int CSV_USER_CD2 = 1;
	// ��Ɠ��i�l����j
	private final int CSV_OPR_DATE2 = 2;
	// �Ζ��V�t�g�i�l����j
	private final int CSV_WORK_SHIFT_CODE2 = 3;
	// ��Ƌ�R�[�h�P
	private final int CSV_WS_CD1 = 4;
	// �J�n�����P
	private final int CSV_START_TIME1 = 5;
	// �I�������P
	private final int CSV_END_TIME1 = 6;
	// ��Ƌ敪�P
	private final int CSV_OPR_TYP1 = 7;
	// �s��Ɨ��R�P
	private final int CSV_UN_OPR_CAUSE_TYP1 = 8;
	// �s��Ǝ��ԁi���j�P
	private final int CSV_UN_OPR_TIME1 = 9;
	// �s��Ɨ��R���l�P
	private final int CSV_REMARKS1 = 10;
	// ��Ƌ�R�[�h�Q
	private final int CSV_WS_CD2 = 11;
	// �J�n�����Q
	private final int CSV_START_TIME2 = 12;
	// �I�������Q
	private final int CSV_END_TIME2 = 13;
	// ��Ƌ敪�Q
	private final int CSV_OPR_TYP2 = 14;
	// �s��Ɨ��R�Q
	private final int CSV_UN_OPR_CAUSE_TYP2 = 15;
	// �s��Ǝ��ԁi���j�Q
	private final int CSV_UN_OPR_TIME2 = 16;
	// �s��Ɨ��R���l�Q
	private final int CSV_REMARKS2 = 17;
	// ��Ƌ�R�[�h�R
	private final int CSV_WS_CD3 = 18;
	// �J�n�����R
	private final int CSV_START_TIME3 = 19;
	// �I�������R
	private final int CSV_END_TIME3 = 20;
	// ��Ƌ敪�R
	private final int CSV_OPR_TYP3 = 21;
	// �s��Ɨ��R�R
	private final int CSV_UN_OPR_CAUSE_TYP3 = 22;
	// �s��Ǝ��ԁi���j�R
	private final int CSV_UN_OPR_TIME3 = 23;
	// �s��Ɨ��R���l�R
	private final int CSV_REMARKS3 = 24;
	// ��Ƌ�R�[�h�S
	private final int CSV_WS_CD4 = 25;
	// �J�n�����S
	private final int CSV_START_TIME4 = 26;
	// �I�������S
	private final int CSV_END_TIME4 = 27;
	// ��Ƌ敪�S
	private final int CSV_OPR_TYP4 = 28;
	// �s��Ɨ��R�S
	private final int CSV_UN_OPR_CAUSE_TYP4 = 29;
	// �s��Ǝ��ԁi���j�S
	private final int CSV_UN_OPR_TIME4 = 30;
	// �s��Ɨ��R���l�S
	private final int CSV_REMARKS4 = 31;
	// ��Ƌ�R�[�h�T
	private final int CSV_WS_CD5 = 32;
	// �J�n�����T
	private final int CSV_START_TIME5 = 33;
	// �I�������T
	private final int CSV_END_TIME5 = 34;
	// ��Ƌ敪�T
	private final int CSV_OPR_TYP5 = 35;
	// �s��Ɨ��R�T
	private final int CSV_UN_OPR_CAUSE_TYP5 = 36;
	// �s��Ǝ��ԁi���j�T
	private final int CSV_UN_OPR_TIME5 = 37;
	// �s��Ɨ��R���l�T
	private final int CSV_REMARKS5 = 38;
	// �b�r�u�捞�f�[�^�K�v���ڐ�(���v)
	private final int CSV_NECESSARY_COLUMN = 39;
	// 199
	private final int CSV_COLNO_199 = 199;        
	
	// �G���[���b�Z�[�W
	private ExpjMessage _emsg = null;

	// �����ꍀ�ڎ擾�Ή�
	private String _locale = CoreTools.getLocale(sysUSER_CD);
	ResourceBundle _resource = CoreTools.getResourceBundle("OrteusUserDic", _locale);

//	/** ��ЃR�[�h */
//	private String _strCompany_cd;
//
//	/** ��ЃR�[�h�擾 */
//	public String getCompanyCd() {
//		return _strCompany_cd;
//	}
	
	/** �Ɩ��^�p��*/
	private String _businessOprDate;
	/**
	 * 
	 * @return �Ɩ��^�p�����擾
	 * @throws SQLException
	 */
	private String getBUSINESS_OPR_DATE() {
		return _businessOprDate;
	}
	
	// �R���{�{�b�N�X��`
	// �G���[��ԋ敪
	private ComboStruct _COM_ERR_TYP = null;
	// ����敪
	private ComboStruct _DAILY_WORK_REPORT_TYP_01 = null;
	// ��Ƌ敪
	private ComboStruct _OPR_TYP_CD_01 = null;
	// �s��Ɨ��R�敪
	private ComboStruct _UN_OPR_CAUSE_CD_01 = null;
	// ��Ǝ��Ԃ̏���l
	String _MAX_OPR_TIME = null;
	
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
	private void setInfoMessage(String code, String value1) {
		ExpjMessage emsg = new ExpjMessage(code, value1);
		msgStruct.addInfo(emsg);
		sysLog.info(emsg, sysUSER_CD);
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

	
	/**
	 * "HH:mm"�`���̓��t��������r���܂��B
	 * @param dateString1 ���t������P
	 * @param dateString2 ���t������Q
	 * @return ���t������P �� ���t������Q �̏ꍇ�� 0��߂��B���t������P �� ���t������Q �̏ꍇ�� 0 ��菬�����l��߂��B���t������P �� ���t������Q �̏ꍇ�� 0 ���傫���l��߂��B
	 * @throws ParseException �p�����[�^�����t������ł͂Ȃ��B
	 */
	public int compareHm(String dateString1, String dateString2) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("HHmm");
		
		if(dateString1.length() == 3) {
			dateString1 = "0" + dateString1;
		} 
		if(dateString2.length() == 3) {
			dateString2 = "0" + dateString2;
		} 
		Date date1 = sdf.parse(dateString1);
		Date date2 = sdf.parse(dateString2);
		return date1.compareTo(date2);

	}

	/**
	 * �����`�F�b�N ���ڂ����������f����
	 * 
	 * @param strInString
	 *            ���̓p�����[�^
	 * @return ����:true / �G���[:false
	 */
	public boolean isIntegerChk(String strInString) {
		// ������input���Z�b�g�p
		try {
			Integer.parseInt(strInString);
		} catch (Exception e) {
			// �����ł͂Ȃ��ꍇException�ɔ�΂��ď���
			// false���Z�b�g���ď����𔲂���(�G���[�F���l�ȊO�̓���)
			return false;
		}
		// true���Z�b�g���ď����𔲂���(����I��)
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
	 * ��Ǝ��Ԍv�Z
	 * 
	 * @param workShiftCode
	 *				�Ζ��V�t�g
	 * @param startTime
	 *				�J�n����
	 * @param endTime
	 *				�I������
	 * @return
	 * @throws SQLException
	 * @throws FoundationException
	 * @throws ParseException 
	 */
	private String getTimeCalculate(AD0140010Struct csvStruct) throws FoundationException, SQLException, ParseException {
		String strOprTime = null;
		if(compareHm(csvStruct.getSTART_TIME6(), csvStruct.getEND_TIME6()) == 0) {
			csvStruct.setRETURN_MESSAGE(new ExpjMessage("AD61007").getMessage(_locale));
			return strOprTime;
		}
		
		AD0140010Struct callStruct = new AD0140010Struct();
		ResourceBundle rb = SystemConfig.getBundle();
		callStruct.setPVC2LOGMODE(SystemConfig.getProperty("LOG_MODE", rb));
		callStruct.setPVC2OUTPUTMODE(SystemConfig.getProperty("OUTPUT_MODE", rb));
		callStruct.setPVC2OUTPUTPATH(SystemConfig.getProperty("OUTPUT_PATH", rb));
		callStruct.setPVC2OUTPUTNAME(SystemConfig.getProperty("OUTPUT_NAME", rb));
		callStruct.setPVC2USERID(sysUSER_CD);
		callStruct.setPVC2BUSINESSNAME(sp.getProcId());
		callStruct.setPVC2PLANTCD(sysPLANT_CD);
		callStruct.setWORK_SHIFT_CODE3(csvStruct.getWORK_SHIFT_CODE3());
		callStruct.setSTART_TIME6(csvStruct.getSTART_TIME6());
		callStruct.setEND_TIME6(csvStruct.getEND_TIME6());

		//�o�b�`�p�����[�^�ďo
		List resultList = entity.mCallSQLOPRTIMECALC.call(conn, callStruct);
		AD0140010Struct resultStruct = (AD0140010Struct)resultList.get(0);
		if ("9".equals(resultStruct.getRETURN_STATUS())) {
			csvStruct.setRETURN_MESSAGE(new ExpjMessage(resultStruct.getRETURN_MESSAGE()).getMessage(_locale));
		} else {
			strOprTime = resultStruct.getOPR_TIME();
		}
		return strOprTime;
	}
	
	/**
	 * �R���{�{�b�N�X�f�[�^�̑��݃`�F�b�N
	 * 
	 * @param combo
	 *			���{�{�b�N�X�f�[�^
	 * @param value
	 *			�R���{�{�b�N�X�f�[�^�̒l
	 * @return �R���{�{�b�N�X�f�[�^���ݏꍇ�ߒltrue,���݂��Ȃ��ꍇ�ߒlfalse
	 */
	private boolean checkCombValue(ComboStruct combo, String value) {
		for (int j = 0; j < combo.size(); j++) {
			if (value.equals((combo.getData(j)[0]))) {
				return true;
			}
		}
		return false;
	}

	/**
	 * �R���{�{�b�N�X���ڂ̃`�F�b�N
	 * 
	 * @param csvStruct
	 *				CSV�f�[�^
	 * @param lineNo
	 *				�s�ԍ�
	 * @return�@true�F�l���݁@false�F�l���݂��Ȃ�
	 */
	private boolean checkCombData(AD0140010Struct csvStruct, int lineNo) {
		// �G���[���b�Z�[�W
		String errMsg = new ExpjMessage("AA01504").getMessage(_locale);
			// ��Ƌ敪1
			if (!checkCombValue(_OPR_TYP_CD_01, csvStruct.getOPR_TYP1())) {
				csvExport(csvStruct
						 , "1"									// �G���[�敪
						 , lineNo								// �G���[�s�ԍ�
						 , CSV_OPR_TYP1							// �G���[���ڔԍ�
						 , "Expj.Cmt6751"						// �G���[���ږ�
						 , errMsg);								// �G���[���b�Z�[�W
				return false;
			}
			// �s��Ɨ��R1
			if (!checkCombValue(_UN_OPR_CAUSE_CD_01, csvStruct.getUN_OPR_CAUSE_TYP1())) {
				csvExport(csvStruct
						 , "1"									// �G���[�敪
						 , lineNo								// �G���[�s�ԍ�
						 , CSV_UN_OPR_CAUSE_TYP1				// �G���[���ڔԍ�
						 , "Expj.Cmt6752"						// �G���[���ږ�
						 , errMsg);								// �G���[���b�Z�[�W
				return false;
			}
			// ��Ƌ敪2
			if (!checkCombValue(_OPR_TYP_CD_01, csvStruct.getOPR_TYP2())) {
				csvExport(csvStruct
						 , "1"									// �G���[�敪
						 , lineNo								// �G���[�s�ԍ�
						 , CSV_OPR_TYP2							// �G���[���ڔԍ�
						 , "Expj.Cmt6758"						// �G���[���ږ�
						 , errMsg);								// �G���[���b�Z�[�W
				return false;
			}
			// �s��Ɨ��R2
			if (!checkCombValue(_UN_OPR_CAUSE_CD_01, csvStruct.getUN_OPR_CAUSE_TYP2())) {
				csvExport(csvStruct
						 , "1"									// �G���[�敪
						 , lineNo								// �G���[�s�ԍ�
						 , CSV_UN_OPR_CAUSE_TYP2				// �G���[���ڔԍ�
						 , "Expj.Cmt6759"						// �G���[���ږ�
						 , errMsg);								// �G���[���b�Z�[�W
				return false;
			}
			// ��Ƌ敪3
			if (!checkCombValue(_OPR_TYP_CD_01, csvStruct.getOPR_TYP3())) {
				csvExport(csvStruct
						 , "1"									// �G���[�敪
						 , lineNo								// �G���[�s�ԍ�
						 , CSV_OPR_TYP3							// �G���[���ڔԍ�
						 , "Expj.Cmt6765"						// �G���[���ږ�
						 , errMsg);								// �G���[���b�Z�[�W
				return false;
			}
			// �s��Ɨ��R3
			if (!checkCombValue(_UN_OPR_CAUSE_CD_01, csvStruct.getUN_OPR_CAUSE_TYP3())) {
				csvExport(csvStruct
						 , "1"									// �G���[�敪
						 , lineNo								// �G���[�s�ԍ�
						 , CSV_UN_OPR_CAUSE_TYP3				// �G���[���ڔԍ�
						 , "Expj.Cmt6766"						// �G���[���ږ�
						 , errMsg);								// �G���[���b�Z�[�W
				return false;
			}
			// ��Ƌ敪4
			if (!checkCombValue(_OPR_TYP_CD_01, csvStruct.getOPR_TYP4())) {
				csvExport(csvStruct
						 , "1"									// �G���[�敪
						 , lineNo								// �G���[�s�ԍ�
						 , CSV_OPR_TYP4							// �G���[���ڔԍ�
						 , "Expj.Cmt6772"						// �G���[���ږ�
						 , errMsg);								// �G���[���b�Z�[�W
				return false;
			}
			// �s��Ɨ��R4
			if (!checkCombValue(_UN_OPR_CAUSE_CD_01, csvStruct.getUN_OPR_CAUSE_TYP4())) {
				csvExport(csvStruct
						 , "1"									// �G���[�敪
						 , lineNo								// �G���[�s�ԍ�
						 , CSV_UN_OPR_CAUSE_TYP4				// �G���[���ڔԍ�
						 , "Expj.Cmt6773"						// �G���[���ږ�
						 , errMsg);								// �G���[���b�Z�[�W
				return false;
			}
			// ��Ƌ敪5
			if (!checkCombValue(_OPR_TYP_CD_01, csvStruct.getOPR_TYP5())) {
				csvExport(csvStruct
						 , "1"									// �G���[�敪
						 , lineNo								// �G���[�s�ԍ�
						 , CSV_OPR_TYP5							// �G���[���ڔԍ�
						 , "Expj.Cmt6779"						// �G���[���ږ�
						 , errMsg);								// �G���[���b�Z�[�W
				return false;
			}
			// �s��Ɨ��R5
			if (!checkCombValue(_UN_OPR_CAUSE_CD_01, csvStruct.getUN_OPR_CAUSE_TYP5())) {
				csvExport(csvStruct
						 , "1"									// �G���[�敪
						 , lineNo								// �G���[�s�ԍ�
						 , CSV_UN_OPR_CAUSE_TYP5				// �G���[���ڔԍ�
						 , "Expj.Cmt6780"						// �G���[���ږ�
						 , errMsg);								// �G���[���b�Z�[�W
				return false;
			}
//		}
		
		return true;
	}
	/**
	 * �G���[���ڏo��
	 * @param csvStruct�@CSV�f�[�^
	 * @param lineNo�@�s�ԍ�
	 * @param detialNo�@��Ƌ斾�הԍ�
	 */
	public void exportCompareLog(AD0140010Struct csvStruct, int lineNo, int detialNo) {
		switch(detialNo) {
			case 1:
				csvExport(csvStruct
						, "1"					// �G���[�敪
						, lineNo				// �G���[�s�ԍ�
						, CSV_START_TIME1		// �G���[���ڔԍ�
						, "Expj.Cmt6749"		// �G���[���ږ�
						, new ExpjMessage("AD61007").getMessage(_locale));  // �G���[���b�Z�[�W
				break;
			case 2:
				csvExport(csvStruct
						, "1"					// �G���[�敪
						, lineNo				// �G���[�s�ԍ�
						, CSV_START_TIME2		// �G���[���ڔԍ�
						, "Expj.Cmt6756"		// �G���[���ږ�
						, new ExpjMessage("AD61007").getMessage(_locale));  // �G���[���b�Z�[�W
				break;
			case 3:
				csvExport(csvStruct
						, "1"					// �G���[�敪
						, lineNo				 // �G���[�s�ԍ�
						, CSV_START_TIME3		// �G���[���ڔԍ�
						, "Expj.Cmt6763"		// �G���[���ږ�
						, new ExpjMessage("AD61007").getMessage(_locale));  // �G���[���b�Z�[�W
				break;
			case 4:
				csvExport(csvStruct
						, "1"					// �G���[�敪
						, lineNo				// �G���[�s�ԍ�
						, CSV_START_TIME4		// �G���[���ڔԍ�
						, "Expj.Cmt6770"		// �G���[���ږ�
						, new ExpjMessage("AD61007").getMessage(_locale));  // �G���[���b�Z�[�W
				break;
			case 5:
				csvExport(csvStruct
						, "1"					// �G���[�敪
						, lineNo				// �G���[�s�ԍ�
						, CSV_START_TIME5		// �G���[���ڔԍ�
						, "Expj.Cmt6777"		// �G���[���ږ�
						, new ExpjMessage("AD61007").getMessage(_locale));  // �G���[���b�Z�[�W
				break;
		}
		
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
	 * ���ԑт̏d���`�F�b�N
	 * @param csvStruct�@CSV�f�[�^
	 * @param lineNo�@�s�ԍ�
	 * @return�@true�F�G���[�Ȃ��@false:�G���[����
	 */
	private boolean checkTimeDuplicate(AD0140010Struct csvStruct, int lineNo) {
		try {
			// ����1�Ǝ���2�̔�r
			if(!isNull(csvStruct.getSTART_TIME2()) && !isNull(csvStruct.getEND_TIME2())) {
				if (compareHm(csvStruct.getSTART_TIME1(), csvStruct.getEND_TIME1()) > 0) {
					if (compareHm(csvStruct.getSTART_TIME2(), csvStruct.getSTART_TIME1()) >= 0
							|| compareHm(csvStruct.getEND_TIME2(), csvStruct.getSTART_TIME1()) > 0
							|| compareHm(csvStruct.getSTART_TIME2(), csvStruct.getEND_TIME1()) < 0
							|| compareHm(csvStruct.getEND_TIME2(), csvStruct.getEND_TIME1()) <= 0
							|| (compareHm(csvStruct.getSTART_TIME2(), csvStruct.getEND_TIME2()) > 0 && compareHm(csvStruct.getSTART_TIME2(), csvStruct.getSTART_TIME1()) < 0 && compareHm(csvStruct.getEND_TIME2(), csvStruct.getEND_TIME1()) > 0)) {
						// <�G���[> AD61007 �y�J�n�����E�I�������ɖ���������܂��B�z
						// �u�s�ԍ��F{0}�v�����b�Z�[�W�ɕt������B
						// {0}�F���ׂ̔ԍ��i1�j
						// �G���[���ځF�J�n����1
						exportCompareLog(csvStruct, lineNo, 1);
						return false;
					}
				}

				if (compareHm(csvStruct.getSTART_TIME1(), csvStruct.getEND_TIME1()) <= 0) {
					if (compareHm(csvStruct.getSTART_TIME2(), csvStruct.getEND_TIME2()) > 0) {
						if (compareHm(csvStruct.getSTART_TIME2(), csvStruct.getSTART_TIME1()) <= 0
								|| compareHm(csvStruct.getSTART_TIME2(), csvStruct.getEND_TIME1()) < 0
								|| compareHm(csvStruct.getEND_TIME2(), csvStruct.getSTART_TIME1()) > 0
								|| compareHm(csvStruct.getEND_TIME2(), csvStruct.getEND_TIME1()) >= 0) {
							// <�G���[> AD61007 �y�J�n�����E�I�������ɖ���������܂��B�z
							// �u�s�ԍ��F{0}�v�����b�Z�[�W�ɕt������B
							// {0}�F���ׂ̔ԍ��i1�j
							// �G���[���ځF�J�n����1
							exportCompareLog(csvStruct, lineNo, 1);
							return false;
						}
					}

				}

				if (compareHm(csvStruct.getSTART_TIME1(), csvStruct.getEND_TIME1()) <= 0) {
					if (compareHm(csvStruct.getSTART_TIME2(), csvStruct.getEND_TIME2()) <= 0) {
						if ((compareHm(csvStruct.getSTART_TIME2(), csvStruct.getSTART_TIME1()) >= 0 && compareHm(csvStruct.getSTART_TIME2(), csvStruct.getEND_TIME1()) < 0)
								|| (compareHm(csvStruct.getEND_TIME2(), csvStruct.getSTART_TIME1()) > 0 && compareHm(csvStruct.getEND_TIME2(), csvStruct.getEND_TIME1()) <= 0)
								|| (compareHm(csvStruct.getSTART_TIME2(), csvStruct.getSTART_TIME1()) <= 0) && (compareHm(csvStruct.getEND_TIME2(), csvStruct.getEND_TIME1()) >= 0)) {
							// <�G���[> AD61007 �y�J�n�����E�I�������ɖ���������܂��B�z
							// �u�s�ԍ��F{0}�v�����b�Z�[�W�ɕt������B
							// {0}�F���ׂ̔ԍ��i1�j
							// �G���[���ځF�J�n����1
							exportCompareLog(csvStruct, lineNo, 1);
							return false;
						}
					}
				}
			}
			// ����1�Ǝ���3�̔�r
			if(!isNull(csvStruct.getSTART_TIME3()) && !isNull(csvStruct.getEND_TIME3())) {
				if (compareHm(csvStruct.getSTART_TIME1(), csvStruct.getEND_TIME1()) > 0) {
					if (compareHm(csvStruct.getSTART_TIME3(), csvStruct.getSTART_TIME1()) >= 0
							|| compareHm(csvStruct.getEND_TIME3(), csvStruct.getSTART_TIME1()) > 0
							|| compareHm(csvStruct.getSTART_TIME3(), csvStruct.getEND_TIME1()) < 0
							|| compareHm(csvStruct.getEND_TIME3(), csvStruct.getEND_TIME1()) <= 0
							|| (compareHm(csvStruct.getSTART_TIME3(), csvStruct.getEND_TIME3()) > 0 && compareHm(csvStruct.getSTART_TIME3(), csvStruct.getSTART_TIME1()) < 0 && compareHm(csvStruct.getEND_TIME3(), csvStruct.getEND_TIME1()) > 0)) {
						// <�G���[> AD61007 �y�J�n�����E�I�������ɖ���������܂��B�z
						// �u�s�ԍ��F{0}�v�����b�Z�[�W�ɕt������B
						// {0}�F���ׂ̔ԍ��i1�j
						// �G���[���ځF�J�n����1
						exportCompareLog(csvStruct, lineNo, 1);
						return false;
					}
				}

				if (compareHm(csvStruct.getSTART_TIME1(), csvStruct.getEND_TIME1()) <= 0) {
					if (compareHm(csvStruct.getSTART_TIME3(), csvStruct.getEND_TIME3()) > 0) {
						if (compareHm(csvStruct.getSTART_TIME3(), csvStruct.getSTART_TIME1()) <= 0
								|| compareHm(csvStruct.getSTART_TIME3(), csvStruct.getEND_TIME1()) < 0
								|| compareHm(csvStruct.getEND_TIME3(), csvStruct.getSTART_TIME1()) > 0
								|| compareHm(csvStruct.getEND_TIME3(), csvStruct.getEND_TIME1()) >= 0) {
							// <�G���[> AD61007 �y�J�n�����E�I�������ɖ���������܂��B�z
							// �u�s�ԍ��F{0}�v�����b�Z�[�W�ɕt������B
							// {0}�F���ׂ̔ԍ��i1�j
							// �G���[���ځF�J�n����1
							exportCompareLog(csvStruct, lineNo, 1);
							return false;
						}
					}
				}

				if (compareHm(csvStruct.getSTART_TIME1(), csvStruct.getEND_TIME1()) <= 0) {
					if (compareHm(csvStruct.getSTART_TIME3(), csvStruct.getEND_TIME3()) <= 0) {
						if ((compareHm(csvStruct.getSTART_TIME3(), csvStruct.getSTART_TIME1()) >= 0 && compareHm(csvStruct.getSTART_TIME3(), csvStruct.getEND_TIME1()) < 0)
								|| (compareHm(csvStruct.getEND_TIME3(), csvStruct.getSTART_TIME1()) > 0 && compareHm(csvStruct.getEND_TIME3(), csvStruct.getEND_TIME1()) <= 0)
								|| (compareHm(csvStruct.getSTART_TIME3(), csvStruct.getSTART_TIME1()) <= 0) && (compareHm(csvStruct.getEND_TIME3(), csvStruct.getEND_TIME1()) >= 0)) {
							// <�G���[> AD61007 �y�J�n�����E�I�������ɖ���������܂��B�z
							// �u�s�ԍ��F{0}�v�����b�Z�[�W�ɕt������B
							// {0}�F���ׂ̔ԍ��i1�j
							// �G���[���ځF�J�n����1
							exportCompareLog(csvStruct, lineNo, 1);
							return false;
						}
					}
				}
			}
			
			// ����1�Ǝ���4�̔�r
			if(!isNull(csvStruct.getSTART_TIME4()) && !isNull(csvStruct.getEND_TIME4())) {
				if (compareHm(csvStruct.getSTART_TIME1(), csvStruct.getEND_TIME1()) > 0) {
					if (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getSTART_TIME1()) >= 0
							|| compareHm(csvStruct.getEND_TIME4(), csvStruct.getSTART_TIME1()) > 0
							|| compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME1()) < 0
							|| compareHm(csvStruct.getEND_TIME4(), csvStruct.getEND_TIME1()) <= 0
							|| (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME4()) > 0 && compareHm(csvStruct.getSTART_TIME4(), csvStruct.getSTART_TIME1()) < 0 && compareHm(csvStruct.getEND_TIME4(), csvStruct.getEND_TIME1()) > 0)) {
						// <�G���[> AD61007 �y�J�n�����E�I�������ɖ���������܂��B�z
						// �u�s�ԍ��F{0}�v�����b�Z�[�W�ɕt������B
						// {0}�F���ׂ̔ԍ��i1�j
						// �G���[���ځF�J�n����1
						exportCompareLog(csvStruct, lineNo, 1);
						return false;
					}
				}

				if (compareHm(csvStruct.getSTART_TIME1(), csvStruct.getEND_TIME1()) <= 0) {
					if (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME4()) > 0) {
						if (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getSTART_TIME1()) <= 0
								|| compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME1()) < 0
								|| compareHm(csvStruct.getEND_TIME4(), csvStruct.getSTART_TIME1()) > 0
								|| compareHm(csvStruct.getEND_TIME4(), csvStruct.getEND_TIME1()) >= 0) {
							// <�G���[> AD61007 �y�J�n�����E�I�������ɖ���������܂��B�z
							// �u�s�ԍ��F{0}�v�����b�Z�[�W�ɕt������B
							// {0}�F���ׂ̔ԍ��i1�j
							// �G���[���ځF�J�n����1
							exportCompareLog(csvStruct, lineNo, 1);
							return false;
						}
					}

				}

				if (compareHm(csvStruct.getSTART_TIME1(), csvStruct.getEND_TIME1()) <= 0) {
					if (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME4()) <= 0) {
						if ((compareHm(csvStruct.getSTART_TIME4(), csvStruct.getSTART_TIME1()) >= 0 && compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME1()) < 0)
								|| (compareHm(csvStruct.getEND_TIME4(), csvStruct.getSTART_TIME1()) > 0 && compareHm(csvStruct.getEND_TIME4(), csvStruct.getEND_TIME1()) <= 0)
								|| (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getSTART_TIME1()) <= 0) && (compareHm(csvStruct.getEND_TIME4(), csvStruct.getEND_TIME1()) >= 0)) {
							// <�G���[> AD61007 �y�J�n�����E�I�������ɖ���������܂��B�z
							// �u�s�ԍ��F{0}�v�����b�Z�[�W�ɕt������B
							// {0}�F���ׂ̔ԍ��i1�j
							// �G���[���ځF�J�n����1
							exportCompareLog(csvStruct, lineNo, 1);
							return false;
						}
					}
				}
			}
			
			// ����1�Ǝ���5�̔�r
			if(!isNull(csvStruct.getSTART_TIME5()) && !isNull(csvStruct.getEND_TIME5())) {
				if (compareHm(csvStruct.getSTART_TIME1(), csvStruct.getEND_TIME1()) > 0) {
					if (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getSTART_TIME1()) >= 0
							|| compareHm(csvStruct.getEND_TIME5(), csvStruct.getSTART_TIME1()) > 0
							|| compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME1()) < 0
							|| compareHm(csvStruct.getEND_TIME5(), csvStruct.getEND_TIME1()) <= 0
							|| (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME5()) > 0 && compareHm(csvStruct.getSTART_TIME5(), csvStruct.getSTART_TIME1()) < 0 && compareHm(csvStruct.getEND_TIME5(), csvStruct.getEND_TIME1()) > 0)) {
						// <�G���[> AD61007 �y�J�n�����E�I�������ɖ���������܂��B�z
						// �u�s�ԍ��F{0}�v�����b�Z�[�W�ɕt������B
						// {0}�F���ׂ̔ԍ��i1�j
						// �G���[���ځF�J�n����1
						exportCompareLog(csvStruct, lineNo, 1);
						return false;

					}
				}

				if (compareHm(csvStruct.getSTART_TIME1(), csvStruct.getEND_TIME1()) <= 0) {
					if (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME5()) > 0) {
						if (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getSTART_TIME1()) <= 0
								|| compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME1()) < 0
								|| compareHm(csvStruct.getEND_TIME5(), csvStruct.getSTART_TIME1()) > 0
								|| compareHm(csvStruct.getEND_TIME5(), csvStruct.getEND_TIME1()) >= 0) {
							// <�G���[> AD61007 �y�J�n�����E�I�������ɖ���������܂��B�z
							// �u�s�ԍ��F{0}�v�����b�Z�[�W�ɕt������B
							// {0}�F���ׂ̔ԍ��i1�j
							// �G���[���ځF�J�n����1
							exportCompareLog(csvStruct, lineNo, 1);
							return false;
						}
					}

				}

				if (compareHm(csvStruct.getSTART_TIME1(), csvStruct.getEND_TIME1()) <= 0) {
					if (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME5()) <= 0) {
						if ((compareHm(csvStruct.getSTART_TIME5(), csvStruct.getSTART_TIME1()) >= 0 && compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME1()) < 0)
								|| (compareHm(csvStruct.getEND_TIME5(), csvStruct.getSTART_TIME1()) > 0 && compareHm(csvStruct.getEND_TIME5(), csvStruct.getEND_TIME1()) <= 0)
								|| (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getSTART_TIME1()) <= 0) && (compareHm(csvStruct.getEND_TIME5(), csvStruct.getEND_TIME1()) >= 0)) {
							// <�G���[> AD61007 �y�J�n�����E�I�������ɖ���������܂��B�z
							// �u�s�ԍ��F{0}�v�����b�Z�[�W�ɕt������B
							// {0}�F���ׂ̔ԍ��i1�j
							// �G���[���ځF�J�n����1
							exportCompareLog(csvStruct, lineNo, 1);
							return false;
						}
					}
				}
			}
			
			// ����2�`�F�b�N
			if(!isNull(csvStruct.getSTART_TIME2()) && !isNull(csvStruct.getEND_TIME2())) {
				// ����2�Ǝ���3�̔�r
				if(!isNull(csvStruct.getSTART_TIME3()) && !isNull(csvStruct.getEND_TIME3())) {
					if (compareHm(csvStruct.getSTART_TIME2(), csvStruct.getEND_TIME2()) > 0) {
						if (compareHm(csvStruct.getSTART_TIME3(), csvStruct.getSTART_TIME2()) >= 0
								|| compareHm(csvStruct.getEND_TIME3(), csvStruct.getSTART_TIME2()) > 0
								|| compareHm(csvStruct.getSTART_TIME3(), csvStruct.getEND_TIME2()) < 0
								|| compareHm(csvStruct.getEND_TIME3(), csvStruct.getEND_TIME2()) <= 0
								|| (compareHm(csvStruct.getSTART_TIME3(), csvStruct.getEND_TIME3()) > 0 && compareHm(csvStruct.getSTART_TIME3(), csvStruct.getSTART_TIME2()) < 0 && compareHm(csvStruct.getEND_TIME3(), csvStruct.getEND_TIME2()) > 0)) {
							// <�G���[> AD61007 �y�J�n�����E�I�������ɖ���������܂��B�z
							// �u�s�ԍ��F{0}�v�����b�Z�[�W�ɕt������B
							// {0}�F���ׂ̔ԍ��i2�j
							// �G���[���ځF�J�n����2
							exportCompareLog(csvStruct, lineNo, 2);
							return false;
						}

					}

					if (compareHm(csvStruct.getSTART_TIME2(), csvStruct.getEND_TIME2()) <= 0) {
						if (compareHm(csvStruct.getSTART_TIME3(), csvStruct.getEND_TIME3()) > 0) {
							if (compareHm(csvStruct.getSTART_TIME3(), csvStruct.getSTART_TIME2()) <= 0
									|| compareHm(csvStruct.getSTART_TIME3(), csvStruct.getEND_TIME2()) < 0
									|| compareHm(csvStruct.getEND_TIME3(), csvStruct.getSTART_TIME2()) > 0
									|| compareHm(csvStruct.getEND_TIME3(), csvStruct.getEND_TIME2()) >= 0) {
								// <�G���[> AD61007 �y�J�n�����E�I�������ɖ���������܂��B�z
								// �u�s�ԍ��F{0}�v�����b�Z�[�W�ɕt������B
								// {0}�F���ׂ̔ԍ��i2�j
								// �G���[���ځF�J�n����2
								exportCompareLog(csvStruct, lineNo, 2);
								return false;
							}
						}

					}

					if (compareHm(csvStruct.getSTART_TIME2(), csvStruct.getEND_TIME2()) <= 0) {
						if (compareHm(csvStruct.getSTART_TIME3(), csvStruct.getEND_TIME3()) <= 0) {
							if ((compareHm(csvStruct.getSTART_TIME3(), csvStruct.getSTART_TIME2()) >= 0 && compareHm(csvStruct.getSTART_TIME3(), csvStruct.getEND_TIME2()) < 0)
									|| (compareHm(csvStruct.getEND_TIME3(), csvStruct.getSTART_TIME2()) > 0 && compareHm(csvStruct.getEND_TIME3(), csvStruct.getEND_TIME2()) <= 0)
									|| (compareHm(csvStruct.getSTART_TIME3(), csvStruct.getSTART_TIME2()) <= 0) && (compareHm(csvStruct.getEND_TIME3(), csvStruct.getEND_TIME2()) >= 0)) {
								// <�G���[> AD61007 �y�J�n�����E�I�������ɖ���������܂��B�z
								// �u�s�ԍ��F{0}�v�����b�Z�[�W�ɕt������B
								// {0}�F���ׂ̔ԍ��i2�j
								// �G���[���ځF�J�n����2
								exportCompareLog(csvStruct, lineNo, 2);
								return false;
							}
						}
					}
				}
				
				// ����2�Ǝ���4�̔�r
				if(!isNull(csvStruct.getSTART_TIME4()) && !isNull(csvStruct.getEND_TIME4())) {
					if (compareHm(csvStruct.getSTART_TIME2(), csvStruct.getEND_TIME2()) > 0) {
						if (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getSTART_TIME2()) >= 0
								|| compareHm(csvStruct.getEND_TIME4(), csvStruct.getSTART_TIME2()) > 0
								|| compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME2()) < 0
								|| compareHm(csvStruct.getEND_TIME4(), csvStruct.getEND_TIME2()) <= 0
								|| (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME4()) > 0 && compareHm(csvStruct.getSTART_TIME4(), csvStruct.getSTART_TIME2()) < 0 && compareHm(csvStruct.getEND_TIME4(), csvStruct.getEND_TIME2()) > 0)) {
							// <�G���[> AD61007 �y�J�n�����E�I�������ɖ���������܂��B�z
							// �u�s�ԍ��F{0}�v�����b�Z�[�W�ɕt������B
							// {0}�F���ׂ̔ԍ��i2�j
							// �G���[���ځF�J�n����2
							exportCompareLog(csvStruct, lineNo, 2);
							return false;
						}
					}

					if (compareHm(csvStruct.getSTART_TIME2(), csvStruct.getEND_TIME2()) <= 0) {
						if (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME4()) > 0) {
							if (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getSTART_TIME2()) <= 0
									|| compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME2()) < 0
									|| compareHm(csvStruct.getEND_TIME4(), csvStruct.getSTART_TIME2()) > 0
									|| compareHm(csvStruct.getEND_TIME4(), csvStruct.getEND_TIME2()) >= 0) {
								// <�G���[> AD61007 �y�J�n�����E�I�������ɖ���������܂��B�z
								// �u�s�ԍ��F{0}�v�����b�Z�[�W�ɕt������B
								// {0}�F���ׂ̔ԍ��i2�j
								// �G���[���ځF�J�n����2
								exportCompareLog(csvStruct, lineNo, 2);
								return false;
							}
						}
					}

					if (compareHm(csvStruct.getSTART_TIME2(), csvStruct.getEND_TIME2()) <= 0) {
						if (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME4()) <= 0) {
							if ((compareHm(csvStruct.getSTART_TIME4(), csvStruct.getSTART_TIME2()) >= 0 && compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME2()) < 0)
									|| (compareHm(csvStruct.getEND_TIME4(), csvStruct.getSTART_TIME2()) > 0 && compareHm(csvStruct.getEND_TIME4(), csvStruct.getEND_TIME2()) <= 0)
									|| (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getSTART_TIME2()) <= 0) && (compareHm(csvStruct.getEND_TIME4(), csvStruct.getEND_TIME2()) >= 0)) {
								// <�G���[> AD61007 �y�J�n�����E�I�������ɖ���������܂��B�z
								// �u�s�ԍ��F{0}�v�����b�Z�[�W�ɕt������B
								// {0}�F���ׂ̔ԍ��i2�j
								// �G���[���ځF�J�n����2
								exportCompareLog(csvStruct, lineNo, 2);
								return false;
							}
						}
					}
				}
				
				// ����2�Ǝ���5�̔�r
				if(!isNull(csvStruct.getSTART_TIME5()) && !isNull(csvStruct.getEND_TIME5())) {
					if (compareHm(csvStruct.getSTART_TIME2(), csvStruct.getEND_TIME2()) > 0) {
						if (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getSTART_TIME2()) >= 0
								|| compareHm(csvStruct.getEND_TIME5(), csvStruct.getSTART_TIME2()) > 0
								|| compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME2()) < 0
								|| compareHm(csvStruct.getEND_TIME5(), csvStruct.getEND_TIME2()) <= 0
								|| (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME5()) > 0 && compareHm(csvStruct.getSTART_TIME5(), csvStruct.getSTART_TIME2()) < 0 && compareHm(csvStruct.getEND_TIME5(), csvStruct.getEND_TIME2()) > 0)) {
							// <�G���[> AD61007 �y�J�n�����E�I�������ɖ���������܂��B�z
							// �u�s�ԍ��F{0}�v�����b�Z�[�W�ɕt������B
							// {0}�F���ׂ̔ԍ��i2�j
							// �G���[���ځF�J�n����2
							exportCompareLog(csvStruct, lineNo, 2);
							return false;
						}
					}

					if (compareHm(csvStruct.getSTART_TIME2(), csvStruct.getEND_TIME2()) <= 0) {
						if (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME5()) > 0) {
							if (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getSTART_TIME2()) <= 0
									|| compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME2()) < 0
									|| compareHm(csvStruct.getEND_TIME5(), csvStruct.getSTART_TIME2()) > 0
									|| compareHm(csvStruct.getEND_TIME5(), csvStruct.getEND_TIME2()) >= 0) {
								// <�G���[> AD61007 �y�J�n�����E�I�������ɖ���������܂��B�z
								// �u�s�ԍ��F{0}�v�����b�Z�[�W�ɕt������B
								// {0}�F���ׂ̔ԍ��i2�j
								// �G���[���ځF�J�n����2
								exportCompareLog(csvStruct, lineNo, 2);
								return false;
							}
						}

					}

					if (compareHm(csvStruct.getSTART_TIME2(), csvStruct.getEND_TIME2()) <= 0) {
						if (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME5()) <= 0) {
							if ((compareHm(csvStruct.getSTART_TIME5(), csvStruct.getSTART_TIME2()) >= 0 && compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME2()) < 0)
									|| (compareHm(csvStruct.getEND_TIME5(), csvStruct.getSTART_TIME2()) > 0 && compareHm(csvStruct.getEND_TIME5(), csvStruct.getEND_TIME2()) <= 0)
									|| (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getSTART_TIME2()) <= 0) && (compareHm(csvStruct.getEND_TIME5(), csvStruct.getEND_TIME2()) >= 0)) {
								// <�G���[> AD61007 �y�J�n�����E�I�������ɖ���������܂��B�z
								// �u�s�ԍ��F{0}�v�����b�Z�[�W�ɕt������B
								// {0}�F���ׂ̔ԍ��i2�j
								// �G���[���ځF�J�n����2
								exportCompareLog(csvStruct, lineNo, 2);
								return false;
							}
						}
					}
				}
			}
			
			// ����3�`�F�b�N
			if(!isNull(csvStruct.getSTART_TIME3()) && !isNull(csvStruct.getEND_TIME3())) {
				// ����3�Ǝ���4�̔�r
				if(!isNull(csvStruct.getSTART_TIME4()) && !isNull(csvStruct.getEND_TIME4())) {
					if (compareHm(csvStruct.getSTART_TIME3(), csvStruct.getEND_TIME3()) > 0) {
						if (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getSTART_TIME3()) >= 0
								|| compareHm(csvStruct.getEND_TIME4(), csvStruct.getSTART_TIME3()) > 0
								|| compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME3()) < 0
								|| compareHm(csvStruct.getEND_TIME4(), csvStruct.getEND_TIME3()) <= 0
								|| (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME4()) > 0 && compareHm(csvStruct.getSTART_TIME4(), csvStruct.getSTART_TIME3()) < 0 && compareHm(csvStruct.getEND_TIME4(), csvStruct.getEND_TIME3()) > 0)) {
							// <�G���[> AD61007 �y�J�n�����E�I�������ɖ���������܂��B�z
							// �u�s�ԍ��F{0}�v�����b�Z�[�W�ɕt������B
							// {0}�F���ׂ̔ԍ��i3�j
							// �G���[���ځF�J�n����3
							exportCompareLog(csvStruct, lineNo, 3);
							return false;
						}
					}

					if (compareHm(csvStruct.getSTART_TIME3(), csvStruct.getEND_TIME3()) <= 0) {
						if (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME4()) > 0) {
							if (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getSTART_TIME3()) <= 0
									|| compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME3()) < 0
									|| compareHm(csvStruct.getEND_TIME4(), csvStruct.getSTART_TIME3()) > 0
									|| compareHm(csvStruct.getEND_TIME4(), csvStruct.getEND_TIME3()) >= 0) {
								// <�G���[> AD61007 �y�J�n�����E�I�������ɖ���������܂��B�z
								// �u�s�ԍ��F{0}�v�����b�Z�[�W�ɕt������B
								// {0}�F���ׂ̔ԍ��i3�j
								// �G���[���ځF�J�n����3
								exportCompareLog(csvStruct, lineNo, 3);
								return false;
							}
						}

					}

					if (compareHm(csvStruct.getSTART_TIME3(), csvStruct.getEND_TIME3()) <= 0) {
						if (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME4()) <= 0) {
							if ((compareHm(csvStruct.getSTART_TIME4(), csvStruct.getSTART_TIME3()) >= 0 && compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME3()) < 0)
									|| (compareHm(csvStruct.getEND_TIME4(), csvStruct.getSTART_TIME3()) > 0 && compareHm(csvStruct.getEND_TIME4(), csvStruct.getEND_TIME3()) <= 0)
									|| (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getSTART_TIME3()) <= 0) && (compareHm(csvStruct.getEND_TIME4(), csvStruct.getEND_TIME3()) >= 0)) {
								// <�G���[> AD61007 �y�J�n�����E�I�������ɖ���������܂��B�z
								// �u�s�ԍ��F{0}�v�����b�Z�[�W�ɕt������B
								// {0}�F���ׂ̔ԍ��i3�j
								// �G���[���ځF�J�n����3
								exportCompareLog(csvStruct, lineNo, 3);
								return false;
							}
						}
					}
				}
				
				// ����3�Ǝ���5�̔�r
				if(!isNull(csvStruct.getSTART_TIME5()) && !isNull(csvStruct.getEND_TIME5())) {
					if (compareHm(csvStruct.getSTART_TIME3(), csvStruct.getEND_TIME3()) > 0) {
						if (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getSTART_TIME3()) >= 0
								|| compareHm(csvStruct.getEND_TIME5(), csvStruct.getSTART_TIME3()) > 0
								|| compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME3()) < 0
								|| compareHm(csvStruct.getEND_TIME5(), csvStruct.getEND_TIME3()) <= 0
								|| (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME5()) > 0 && compareHm(csvStruct.getSTART_TIME5(), csvStruct.getSTART_TIME3()) < 0 && compareHm(csvStruct.getEND_TIME5(), csvStruct.getEND_TIME3()) > 0)) {
							// <�G���[> AD61007 �y�J�n�����E�I�������ɖ���������܂��B�z
							// �u�s�ԍ��F{0}�v�����b�Z�[�W�ɕt������B
							// {0}�F���ׂ̔ԍ��i3�j
							// �G���[���ځF�J�n����3
							exportCompareLog(csvStruct, lineNo, 3);
							return false;

						}
					}

					if (compareHm(csvStruct.getSTART_TIME3(), csvStruct.getEND_TIME3()) <= 0) {
						if (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME5()) > 0) {
							if (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getSTART_TIME3()) <= 0
									|| compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME3()) < 0
									|| compareHm(csvStruct.getEND_TIME5(), csvStruct.getSTART_TIME3()) > 0
									|| compareHm(csvStruct.getEND_TIME5(), csvStruct.getEND_TIME3()) >= 0) {
								// <�G���[> AD61007 �y�J�n�����E�I�������ɖ���������܂��B�z
								// �u�s�ԍ��F{0}�v�����b�Z�[�W�ɕt������B
								// {0}�F���ׂ̔ԍ��i3�j
								// �G���[���ځF�J�n����3
								exportCompareLog(csvStruct, lineNo, 3);
								return false;
							}
						}

					}

					if (compareHm(csvStruct.getSTART_TIME3(), csvStruct.getEND_TIME3()) <= 0) {
						if (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME5()) <= 0) {
							if ((compareHm(csvStruct.getSTART_TIME5(), csvStruct.getSTART_TIME3()) >= 0 && compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME3()) < 0)
									|| (compareHm(csvStruct.getEND_TIME5(), csvStruct.getSTART_TIME3()) > 0 && compareHm(csvStruct.getEND_TIME5(), csvStruct.getEND_TIME3()) <= 0)
									|| (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getSTART_TIME3()) <= 0) && (compareHm(csvStruct.getEND_TIME5(), csvStruct.getEND_TIME3()) >= 0)) {
								// <�G���[> AD61007 �y�J�n�����E�I�������ɖ���������܂��B�z
								// �u�s�ԍ��F{0}�v�����b�Z�[�W�ɕt������B
								// {0}�F���ׂ̔ԍ��i3�j
								// �G���[���ځF�J�n����3
								exportCompareLog(csvStruct, lineNo, 3);
								return false;
							}
						}
					}
				}
			}
			
			// ����4�`�F�b�N
			if(!isNull(csvStruct.getSTART_TIME4()) && !isNull(csvStruct.getEND_TIME4())) {
				// ����4�Ǝ���5�̔�r
				if(!isNull(csvStruct.getSTART_TIME5()) && !isNull(csvStruct.getEND_TIME5())) {
					if (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME4()) > 0) {
						if (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getSTART_TIME4()) >= 0
								|| compareHm(csvStruct.getEND_TIME5(), csvStruct.getSTART_TIME4()) > 0
								|| compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME4()) < 0
								|| compareHm(csvStruct.getEND_TIME5(), csvStruct.getEND_TIME4()) <= 0
								|| (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME5()) > 0 && compareHm(csvStruct.getSTART_TIME5(), csvStruct.getSTART_TIME4()) < 0 && compareHm(csvStruct.getEND_TIME5(), csvStruct.getEND_TIME4()) > 0)) {
							// <�G���[> AD61007 �y�J�n�����E�I�������ɖ���������܂��B�z
							// �u�s�ԍ��F{0}�v�����b�Z�[�W�ɕt������B
							// {0}�F���ׂ̔ԍ��i4�j
							// �G���[���ځF�J�n����4
							exportCompareLog(csvStruct, lineNo, 4);
							return false;
						}
					}

					if (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME4()) <= 0) {
						if (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME5()) > 0) {
							if (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getSTART_TIME4()) <= 0
									|| compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME4()) < 0
									|| compareHm(csvStruct.getEND_TIME5(), csvStruct.getSTART_TIME4()) > 0
									|| compareHm(csvStruct.getEND_TIME5(), csvStruct.getEND_TIME4()) >= 0) {
								// <�G���[> AD61007 �y�J�n�����E�I�������ɖ���������܂��B�z
								// �u�s�ԍ��F{0}�v�����b�Z�[�W�ɕt������B
								// {0}�F���ׂ̔ԍ��i4�j
								// �G���[���ځF�J�n����4
								exportCompareLog(csvStruct, lineNo, 4);
								return false;
							}
						}
					}

					if (compareHm(csvStruct.getSTART_TIME4(), csvStruct.getEND_TIME4()) <= 0) {
						if (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME5()) <= 0) {
							if ((compareHm(csvStruct.getSTART_TIME5(), csvStruct.getSTART_TIME4()) >= 0 && compareHm(csvStruct.getSTART_TIME5(), csvStruct.getEND_TIME4()) < 0)
									|| (compareHm(csvStruct.getEND_TIME5(), csvStruct.getSTART_TIME4()) > 0 && compareHm(csvStruct.getEND_TIME5(), csvStruct.getEND_TIME4()) <= 0)
									|| (compareHm(csvStruct.getSTART_TIME5(), csvStruct.getSTART_TIME4()) <= 0) && (compareHm(csvStruct.getEND_TIME5(), csvStruct.getEND_TIME4()) >= 0)) {
								// <�G���[> AD61007 �y�J�n�����E�I�������ɖ���������܂��B�z
								// �u�s�ԍ��F{0}�v�����b�Z�[�W�ɕt������B
								// {0}�F���ׂ̔ԍ��i4�j
								// �G���[���ځF�J�n����4
								exportCompareLog(csvStruct, lineNo, 4);
								return false;
							}
						}
					}
				}
			}
		} catch(Exception e) {
			return false;
		}
		
		return true;
	}
	 /**
	 *   HH24MI�`�F�b�N
	 *   ���ڂ�HH24MI�����f����
	 *
	 *   @param  strInString  ���̓p�����[�^
	 *   @return ����:true / �G���[:false
	 */
	public boolean checkTimeFormat(String strInString) {
		// ���l��input���Z�b�g�p
		try {
			int getInt = Integer.parseInt(strInString);
			int getIntbel = getInt%100;
			int getIntfrt = getInt/100;
			if(getIntfrt >= 24 || getIntfrt < 0 || getIntbel >= 60 || getIntbel < 0){
				 return false;
			}
		} catch(Exception e) {
			 return false;
		}
		// true���Z�b�g���ď����𔲂���(����I��)
		return true;
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
	* @return �ُ�Ȃ� true �G���[ false
	*/  
	
	private boolean csvExport(AD0140010Struct targetStruct, String errTyp, int errlineNo, int errItemNo, String errItem, String errMsg) {
		AD0140010Struct errStruct = new AD0140010Struct();
		// �G���[�ӏ�
		ExpjMessage emsg = new ExpjMessage("AA01520", String.valueOf(errlineNo));
		errStruct.setl_ERROR_IN(emsg.getMessage(_locale));

		// �G���[�敪
		errStruct.setl_ERR_TYP(getDisplayName(_COM_ERR_TYP, errTyp));
		// �G���[���e
		errStruct.setl_ERR_INFO(errMsg);
		// �G���[���ږ�
		errStruct.setl_ERR_CTR_NM(CoreTools.getRBString(errItem, _resource));
		// �H��
		errStruct.setl_ERR_PLANT_NO(targetStruct.getPLANT_CD());
		// ����敪
		if (isNull(targetStruct.getDAILY_WORK_REPORT_TYP()) || !checkCombValue(_DAILY_WORK_REPORT_TYP_01, targetStruct.getDAILY_WORK_REPORT_TYP())) {
			errStruct.setl_ERR_DAILY_WORK_REPORT_TYP(targetStruct.getDAILY_WORK_REPORT_TYP());
		} else {
			errStruct.setl_ERR_DAILY_WORK_REPORT_TYP(getDisplayName(_DAILY_WORK_REPORT_TYP_01, targetStruct.getDAILY_WORK_REPORT_TYP()));
		}
		

			// ���[�U�R�[�h
			errStruct.setl_ERR_USER_CD(replaceSlashAdd(targetStruct.getUSER_CD2()));
			// ��Ɠ�
			errStruct.setl_ERR_OPR_DATE(targetStruct.getOPR_DATE2());
			// �Ζ��V�t�g
			errStruct.setl_ERR_WORK_SHIFT_CODE(replaceSlashAdd(targetStruct.getWORK_SHIFT_CODE2()));
			// ��Ƌ�R�[�h1
			if (errItemNo >= CSV_USER_CD2 && errItemNo <= CSV_REMARKS1) {
				errStruct.setl_ERR_WS_CD(replaceSlashAdd(targetStruct.getWS_CD1()));
			}
			// ��Ƌ�R�[�h2
			if (errItemNo >= CSV_WS_CD2 && errItemNo <= CSV_REMARKS2) {
				errStruct.setl_ERR_WS_CD(replaceSlashAdd(targetStruct.getWS_CD2()));
			}
			// ��Ƌ�R�[�h3
			if (errItemNo >= CSV_WS_CD3 && errItemNo <= CSV_REMARKS3) {
				errStruct.setl_ERR_WS_CD(replaceSlashAdd(targetStruct.getWS_CD3()));
			}
			// ��Ƌ�R�[�h4
			if (errItemNo >= CSV_WS_CD4 && errItemNo <= CSV_REMARKS4) {
				errStruct.setl_ERR_WS_CD(replaceSlashAdd(targetStruct.getWS_CD4()));
			}
			// ��Ƌ�R�[�h5
			if (errItemNo >= CSV_WS_CD5 && errItemNo <= CSV_REMARKS5) {
				errStruct.setl_ERR_WS_CD(replaceSlashAdd(targetStruct.getWS_CD5()));
			}
//		}

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
	private boolean checkCsvData(List csvList)
			throws BusinessProcessException, FoundationException {
		// �S�����R�[�h��
		_intTotalCount = csvList.size();
		AD0140010Struct csvStruct = new AD0140010Struct();
		try {
			for (int i = 0; i < csvList.size(); i++)	{
				csvStruct = (AD0140010Struct)csvList.get(i);
//				csvStruct.setCOMPANY_CD(getCompanyCd());
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
							, CSV_COLNO_199				// �G���[���ڔԍ�
							, "Expj.Cmt3099"			// �G���[���ږ�
							, _emsg.getMessage(_locale) // �G���[���b�Z�[�W
							); 
					_intErrorCount++;
					continue;
				}
				// ����敪�A NULL�̏ꍇ
				if (isNull(csvStruct.getDAILY_WORK_REPORT_TYP())) {
					csvStruct.clear();
					csvExport(csvStruct						// �Ώۃf�[�^���
							, "1"							// �G���[�敪
							, i + 1							// �G���[�����s
							, CSV_DAILY_WORK_REPORT_TYP		// �G���[���ڔԍ�
							, "Expj.DAILY_WORK_REPORT_TYP" // �G���[���ږ�
							, new ExpjMessage("AD61016").getMessage(_locale)		// �G���[���b�Z�[�W
							); 
					_intErrorCount++;
					continue;
				}
				// ����敪�A�����ȊO�̏ꍇ
				if (!isIntegerChk(csvStruct.getDAILY_WORK_REPORT_TYP())) {
					csvStruct.clear();
					csvExport(csvStruct						// �Ώۃf�[�^���
							, "1"							// �G���[�敪
							, i + 1							// �G���[�����s
							, CSV_DAILY_WORK_REPORT_TYP		// �G���[���ڔԍ�
							, "Expj.DAILY_WORK_REPORT_TYP" // �G���[���ږ�
							, new ExpjMessage("AA01502").getMessage(_locale)		// �G���[���b�Z�[�W
							); 
					_intErrorCount++;
					continue;
				}
				// ����敪�A���� 3���ȏ�̏ꍇ
				if (csvStruct.getDAILY_WORK_REPORT_TYP().length() >= 3) {
					csvStruct.clear();
					csvExport(csvStruct							// �Ώۃf�[�^���
							, "1"								// �G���[�敪
							, i + 1								// �G���[�����s
							, CSV_DAILY_WORK_REPORT_TYP			// �G���[���ڔԍ�
							, "Expj.DAILY_WORK_REPORT_TYP"		// �G���[���ږ�
							, new ExpjMessage("AA01501").getMessage(_locale)			// �G���[���b�Z�[�W
							); 
					_intErrorCount++;
					continue;
				}
				// ����敪
				if (!checkCombValue(_DAILY_WORK_REPORT_TYP_01, csvStruct.getDAILY_WORK_REPORT_TYP())) {
					csvStruct.clear();
					csvExport(csvStruct
							 , "1"								// �G���[�敪
							 , i + 1							// �G���[�s�ԍ�
							 , CSV_DAILY_WORK_REPORT_TYP		// �G���[���ڔԍ�
							 , "Expj.DAILY_WORK_REPORT_TYP"	// �G���[���ږ�
							 , new ExpjMessage("AA01504").getMessage(_locale));	// �G���[���b�Z�[�W
					_intErrorCount++;
					continue;
				}
				
					// CSV�t�F�C�����e�`�F�b�N
					if (!checkPersonCsvData(csvStruct, i + 1)) {
						_intErrorCount++;
						continue;
					}
					// �R���{�{�b�N�X���ڂ̃`�F�b�N
					if (!checkCombData(csvStruct, i + 1)) {
						_intErrorCount++;
						continue;
					}
					// �o�^���`�F�b�N�Q
					if (!checkPersonInsertData(csvStruct, i + 1)) {
						_intErrorCount++;
						continue;
					}
				}
//			}
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
			 ee.setLocale(CoreTools.getLocale(getsysUSER_CD()));
			 throw ee;
		}
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
	 * �o�^���`�F�b�N�Q �i����敪���Q�i�l����j�̏ꍇ�j
	 * 
	 * @param csvStruct
	 *			�@csv�f�[�^
	 * @param lineNo
	 *			�@�s�ԍ�
	 * @return�@true:�G���[�Ȃ��Afalse�F�G���[����
	 */
	private boolean checkPersonInsertData(AD0140010Struct csvStruct, int lineNo) throws ExpjException{
		try {
			//�u��Ɠ��v���Ɩ��^�p���̏ꍇ
			if (DateTool.compareYMD(csvStruct.getOPR_DATE2(), getBUSINESS_OPR_DATE()) > 0) {
				// <�G���[> ZZ05103�y�����̓��t�͎w��ł��܂���B�z
				// �G���[���ځF��Ɠ�
				csvExport(csvStruct
						 , "1"								// �G���[�敪
						 , lineNo							// �G���[�s�ԍ�
						 , CSV_OPR_DATE2					// �G���[���ڔԍ�
						 , "Expj.Cmt6783"					// �G���[���ږ�
						 , new ExpjMessage("ZZ05103").getMessage(_locale));	// �G���[���b�Z�[�W
				return false;
			}
			
			//�H��R�[�h
			csvStruct.setOPR_DATE3(csvStruct.getOPR_DATE2());

			List tempList = entity.mselectM_CAL.read(conn, csvStruct);

			if (tempList.isEmpty()) {
				// <�G���[> AC10005 �y�J�����_�����݂��܂���B�z
				// �G���[���ځF�H��R�[�h
				csvExport(csvStruct
						, "1"					// �G���[�敪
						, lineNo				// �G���[�s�ԍ�
						, CSV_USER_CD2			// �G���[���ڔԍ�
						, "Expj.Cmt6784"		// �G���[���ږ�
						, new ExpjMessage("AC10005").getMessage(_locale));	// �G���[���b�Z�[�W
				return false;
			} else {
				AD0140010Struct tempStruct = (AD0140010Struct)tempList.get(0);
				csvStruct.setHOLIDAY_FLG(tempStruct.getHOLIDAY_FLG());
			}
			csvStruct.setWORK_SHIFT_CODE3(csvStruct.getWORK_SHIFT_CODE2());	
			if (!entity.mcheckUM_WORK_SHIFT_H.check(conn, csvStruct)) {
				// <�G���[> AD61003 �y�Ζ��V�t�g���Ζ��V�t�g�w�b�_�ɑ��݂��܂���B�z 
				// �G���[���ځF�Ζ��V�t�g
				csvExport(csvStruct
						, "1"							// �G���[�敪
						, lineNo						// �G���[�s�ԍ�
						, CSV_WORK_SHIFT_CODE2			// �G���[���ڔԍ�
						, "Expj.Cmt6785"				// �G���[���ږ�
						, new ExpjMessage("AD61003").getMessage(_locale));	// �G���[���b�Z�[�W
				return false;
			}
//			csvStruct.setCOMPANY_CD2(_strCompany_cd);
			/** ����1�̃`�F�b�N�@*/
			csvStruct.setWS_CD6(csvStruct.getWS_CD1());
			tempList = entity.mselectM_WS_PLANT.read(conn, csvStruct);
			if (tempList.isEmpty()) {
				// <�G���[> AA01003 �y��Ƌ�R�[�h����Ƌ�ɑ��݂��܂���B�z
				// �G���[���ځF��Ƌ�R�[�h�@
				csvExport(csvStruct
							, "1"					// �G���[�敪
							, lineNo				// �G���[�s�ԍ�
							, CSV_WS_CD1			// �G���[���ڔԍ�
							, "Expj.Cmt6748"		// �G���[���ږ�
							, new ExpjMessage("AA01003").getMessage(_locale));	// �G���[���b�Z�[�W
				return false;
			}
			
			if (isNull(csvStruct.getSTART_TIME1()) || isNull(csvStruct.getEND_TIME1())) {
				// <�G���[> AD61004 �y�J�n�����E�I����������͂��ĉ������B�z
				// �G���[���ځF�J�n����
				csvExport(csvStruct
							, "1"					// �G���[�敪
							, lineNo				// �G���[�s�ԍ�
							, CSV_START_TIME1		// �G���[���ڔԍ�
							, "Expj.Cmt6749"		// �G���[���ږ�
							, new ExpjMessage("AD61004").getMessage(_locale));	// �G���[���b�Z�[�W
				return false;
			} else {
				if (!checkTimeNum(csvStruct.getSTART_TIME1()) || !checkTimeNum(csvStruct.getEND_TIME1())) {
					// �J�n�����E�I���������P�E�Q���̏ꍇ
					// <�G���[> AD61005
					// �y�J�n�����E�I��������ݒ肷��ꍇ�́A3����������4���̐����Ŏw�肵�Ă��������B�z
					csvExport(csvStruct
								, "1"					// �G���[�敪
								, lineNo				// �G���[�s�ԍ�
								, CSV_START_TIME1			// �G���[���ڔԍ�
								, "Expj.Cmt6749"		// �G���[���ږ�
								, new ExpjMessage("AD61005").getMessage(_locale));	// �G���[���b�Z�[�W
					return false;
				}
				// �J�n�����E�I������
				if (!checkTimeFormat(csvStruct.getSTART_TIME1()) || !checkTimeFormat(csvStruct.getEND_TIME1())) {
					// �G���[���ځF�J�n����
					// 3�J�n�����E�I��������hh24mi�`���łȂ��ꍇ
					// <�G���[> AD61006
					// �y�J�n�����E�I��������hh24mi�̎����`���œ��͂��Ă��������B�z
					// �G���[���ځF�J�n����
					csvExport(csvStruct
								, "1"					// �G���[�敪
								, lineNo				// �G���[�s�ԍ�
								, CSV_START_TIME1			// �G���[���ڔԍ�
								, "Expj.Cmt6749"		// �G���[���ږ�
								, new ExpjMessage("AD61006").getMessage(_locale));	// �G���[���b�Z�[�W
					return false;
				}
			}
			
			if ("0".equals(csvStruct.getUN_OPR_CAUSE_TYP1()) && (!"0".equals(csvStruct.getUN_OPR_TIME1()))) {
				// �u�s��Ɨ��R�P�v��0�F�ΏۊO ���A
				// �i�u�s��Ǝ��ԂP�v��0�j �̏ꍇ
				// <�G���[> AD61008 �y�s��Ɨ��R����͂��ĉ������B�z
				// �G���[���ځF�s��Ɨ��R1
				csvExport(csvStruct
							, "1"					// �G���[�敪
							, lineNo				// �G���[�s�ԍ�
							, CSV_UN_OPR_CAUSE_TYP1	// �G���[���ڔԍ�
							, "Expj.Cmt6752"		// �G���[���ږ�
							, new ExpjMessage("AD61008").getMessage(_locale));	// �G���[���b�Z�[�W
				return false;
			}
			
			if (!"0".equals(csvStruct.getUN_OPR_CAUSE_TYP1()) && "0".equals(csvStruct.getUN_OPR_TIME1())) {
				// �u�s��Ɨ��R�P�v��0�F�ΏۊO�ȊO���A�u�s��Ǝ��ԂP�v��0 �̏ꍇ
				// <�G���[> AD61009 �y�s��Ǝ��Ԃ���͂��ĉ������B�z
				csvExport(csvStruct
							, "1"					// �G���[�敪
							, lineNo				// �G���[�s�ԍ�
							, CSV_UN_OPR_TIME1		// �G���[���ڔԍ�
							, "Expj.Cmt6753"		// �G���[���ږ�
							, new ExpjMessage("AD61009").getMessage(_locale));	// �G���[���b�Z�[�W
				return false;
			}
			
			// ��Ǝ��Ԍv�Z�������s���A��Ǝ��Ԍv�Z�������G���[�ƂȂ����ꍇ
			csvStruct.setWORK_SHIFT_CODE3(csvStruct.getWORK_SHIFT_CODE2());
			csvStruct.setSTART_TIME6(csvStruct.getSTART_TIME1());
			csvStruct.setEND_TIME6(csvStruct.getEND_TIME1());
			String oprTime = getTimeCalculate(csvStruct);
			if (isNull(oprTime)) {
				csvExport(csvStruct
							, "1"						// �G���[�敪
							, lineNo					// �G���[�s�ԍ�
							, CSV_START_TIME1			// �G���[���ڔԍ�
							, "Expj.Cmt6749"		// �G���[���ږ�
							, new ExpjMessage("AD61010", csvStruct.getRETURN_MESSAGE()).getMessage(_locale));	// �G���[���b�Z�[�W
				return false;
			} else {
				csvStruct.setOPR_TIME(oprTime);
			}
			
			csvStruct.setSTART_TIME6(csvStruct.getSTART_TIME1());
			csvStruct.setEND_TIME6(csvStruct.getEND_TIME1());
			if (compareHm(csvStruct.getSTART_TIME6(), csvStruct.getEND_TIME6()) > 0) {
				csvStruct.setTIME_FLG2("1");
			} else {
				csvStruct.setTIME_FLG2("2");
			}
			tempList = entity.mUT_DAILY_WORK_REPORT_2.read(conn, csvStruct);
			if (!tempList.isEmpty()) {
				// <�G���[> AD61014
				// �y�����Ɠ��ŁA��Ǝ��ԑт��d�����Ă���f�[�^�����ɑ��݂��܂��B�z
				// �G���[���ځF�J�n����
				csvExport(csvStruct
							, "1"						// �G���[�敪
							, lineNo					// �G���[�s�ԍ�
							, CSV_START_TIME1			// �G���[���ڔԍ�
							, "Expj.Cmt6749"			// �G���[���ږ�
							, new ExpjMessage("AD61014").getMessage(_locale));	// �G���[���b�Z�[�W
				return false;
			}
			
			/** ����2�̃`�F�b�N�@*/
			if(isNull(csvStruct.getWS_CD2()) && (!isNull(csvStruct.getSTART_TIME2()) || !isNull(csvStruct.getEND_TIME2()) || !"0".equals(csvStruct.getOPR_TYP2()))) {
				// <�G���[> AD20057  �y��Ƌ�R�[�h����͂��ĉ������B�z
				// �G���[���ځF��Ƌ�R�[�h�@
				csvExport(csvStruct
							, "1"					// �G���[�敪
							, lineNo				// �G���[�s�ԍ�
							, CSV_WS_CD2			// �G���[���ڔԍ�
							, "Expj.CSV_SUB_WS_CD"		// �G���[���ږ�
							, new ExpjMessage("AD20057").getMessage(_locale));	// �G���[���b�Z�[�W
				return false;
			}
			
			if(!isNull(csvStruct.getWS_CD2())) {
				//��Ƌ�R�[�h2�@
				csvStruct.setWS_CD6(csvStruct.getWS_CD2());
				tempList = entity.mselectM_WS_PLANT.read(conn, csvStruct);
				if (tempList.isEmpty()) {
					// <�G���[> AA01003 �y��Ƌ�R�[�h����Ƌ�ɑ��݂��܂���B�z
					// �G���[���ځF��Ƌ�R�[�h�@
					csvExport(csvStruct
								, "1"					// �G���[�敪
								, lineNo				// �G���[�s�ԍ�
								, CSV_WS_CD2			// �G���[���ڔԍ�
								, "Expj.Cmt6755"		// �G���[���ږ�
								, new ExpjMessage("AA01003").getMessage(_locale));	// �G���[���b�Z�[�W
					return false;
				}
				
				if (isNull(csvStruct.getSTART_TIME2()) || isNull(csvStruct.getEND_TIME2())) {
					// <�G���[> AD61004 �y�J�n�����E�I����������͂��ĉ������B�z
					// �G���[���ځF�J�n����
					csvExport(csvStruct
								, "1"					// �G���[�敪
								, lineNo				// �G���[�s�ԍ�
								, CSV_START_TIME2		// �G���[���ڔԍ�
								, "Expj.Cmt6756"		// �G���[���ږ�
								, new ExpjMessage("AD61004").getMessage(_locale));	// �G���[���b�Z�[�W
					return false;
				} else {
					if (!checkTimeNum(csvStruct.getSTART_TIME2()) || !checkTimeNum(csvStruct.getEND_TIME2())) {
						// �J�n�����E�I���������P�E�Q���̏ꍇ
						// <�G���[> AD61005
						// �y�J�n�����E�I��������ݒ肷��ꍇ�́A3����������4���̐����Ŏw�肵�Ă��������B�z
						csvExport(csvStruct
									, "1"					// �G���[�敪
									, lineNo				// �G���[�s�ԍ�
									, CSV_START_TIME2		// �G���[���ڔԍ�
									, "Expj.Cmt6756"		// �G���[���ږ�
									, new ExpjMessage("AD61005").getMessage(_locale));	// �G���[���b�Z�[�W
						return false;
					}
					// �J�n�����E�I������
					if (!checkTimeFormat(csvStruct.getSTART_TIME2()) || !checkTimeFormat(csvStruct.getEND_TIME2())) {
						// �G���[���ځF�J�n����
						// �J�n�����E�I��������hh24mi�`���łȂ��ꍇ
						// <�G���[> AD61006
						// �y�J�n�����E�I��������hh24mi�̎����`���œ��͂��Ă��������B�z
						// �G���[���ځF�J�n����
						csvExport(csvStruct
									, "1"					// �G���[�敪
									, lineNo				// �G���[�s�ԍ�
									, CSV_START_TIME2		// �G���[���ڔԍ�
									, "Expj.Cmt6756"		// �G���[���ږ�
									, new ExpjMessage("AD61006").getMessage(_locale));	// �G���[���b�Z�[�W
						return false;
					}
				}
			}
			
			if ("0".equals(csvStruct.getUN_OPR_CAUSE_TYP2()) && (!"0".equals(csvStruct.getUN_OPR_TIME2()))) {
				// �u�s��Ɨ��R2�v��0�F�ΏۊO ���A
				// �i�u�s��Ǝ���2�v��0�ȊO�j �̏ꍇ
				// <�G���[> AD61008 �y�s��Ɨ��R����͂��ĉ������B�z
				// �G���[���ځF�s��Ɨ��R2
				csvExport(csvStruct
							, "1"					// �G���[�敪
							, lineNo				// �G���[�s�ԍ�
							, CSV_UN_OPR_CAUSE_TYP2	// �G���[���ڔԍ�
							, "Expj.Cmt6759"		// �G���[���ږ�
							, new ExpjMessage("AD61008").getMessage(_locale));	// �G���[���b�Z�[�W
				return false;
			}
			
			if (!"0".equals(csvStruct.getUN_OPR_CAUSE_TYP2()) && "0".equals(csvStruct.getUN_OPR_TIME2())) {
				// �u�s��Ɨ��R2�v��0�F�ΏۊO�ȊO ���A�u�s��Ǝ���2�v�� 0 �̏ꍇ
				// <�G���[> AD61009 �y�s��Ǝ��Ԃ���͂��ĉ������B�z
				csvExport(csvStruct
							, "1"					// �G���[�敪
							, lineNo				// �G���[�s�ԍ�
							, CSV_UN_OPR_TIME2		// �G���[���ڔԍ�
							, "Expj.Cmt6760"		// �G���[���ږ�
							, new ExpjMessage("AD61009").getMessage(_locale));	// �G���[���b�Z�[�W
				return false;
			}
			
			// ��Ǝ��Ԍv�Z�������s���A��Ǝ��Ԍv�Z�������G���[�ƂȂ����ꍇ
			if(!isNull(csvStruct.getSTART_TIME2()) && !isNull(csvStruct.getEND_TIME2())) {
				csvStruct.setSTART_TIME6(csvStruct.getSTART_TIME2());
				csvStruct.setEND_TIME6(csvStruct.getEND_TIME2());
				String oprTime2 = getTimeCalculate(csvStruct);
				if (isNull(oprTime2)) {
					csvExport(csvStruct
								, "1"						// �G���[�敪
								, lineNo					// �G���[�s�ԍ�
								, CSV_START_TIME2			// �G���[���ڔԍ�
								, "Expj.Cmt6756"			// �G���[���ږ�
								, new ExpjMessage("AD61010", csvStruct.getRETURN_MESSAGE()).getMessage(_locale));	// �G���[���b�Z�[�W
					return false;
				} else {
					oprTime = Calculate.add(oprTime, oprTime2);
					csvStruct.setOPR_TIME2(oprTime2);
				}
			} else {
				csvStruct.setOPR_TIME2(null);
			}
			// �u��Ƌ�R�[�h2�v��Null ���u�s��Ɨ��R2�v��0�F�ΏۊO�ȊO�̏ꍇ
			if(isNull(csvStruct.getWS_CD2()) && !"0".equals(csvStruct.getUN_OPR_CAUSE_TYP2())) {
				// <�G���[> AD20057 �y��Ƌ�R�[�h����͂��ĉ������B�z
				// �G���[���ځF��Ƌ�R�[�h�@
				csvExport(csvStruct
							, "1"					// �G���[�敪
							, lineNo				// �G���[�s�ԍ�
							, CSV_WS_CD2			// �G���[���ڔԍ�
							, "Expj.CSV_WS_CD_02"		// �G���[���ږ�
							, new ExpjMessage("AD20057").getMessage(_locale));	// �G���[���b�Z�[�W
				return false;
			}
			
			if(!isNull(csvStruct.getSTART_TIME2()) && !isNull(csvStruct.getEND_TIME2())) {
				csvStruct.setSTART_TIME6(csvStruct.getSTART_TIME2());
				csvStruct.setEND_TIME6(csvStruct.getEND_TIME2());
				if (compareHm(csvStruct.getSTART_TIME6(), csvStruct.getEND_TIME6()) > 0) {
					csvStruct.setTIME_FLG2("1");
				} else {
					csvStruct.setTIME_FLG2("2");
				}
				tempList = entity.mUT_DAILY_WORK_REPORT_2.read(conn, csvStruct);
				if (!tempList.isEmpty()) {
					// <�G���[> AD61014
					// �y�����Ɠ��ŁA��Ǝ��ԑт��d�����Ă���f�[�^�����ɑ��݂��܂��B�z
					// �G���[���ځF�J�n����
					csvExport(csvStruct
								, "1"						// �G���[�敪
								, lineNo					// �G���[�s�ԍ�
								, CSV_START_TIME2			// �G���[���ڔԍ�
								, "Expj.Cmt6756"			// �G���[���ږ�
								, new ExpjMessage("AD61014").getMessage(_locale));	// �G���[���b�Z�[�W
					return false;
				}
			}
			
			/** ����3�̃`�F�b�N�@*/
			if(isNull(csvStruct.getWS_CD3()) && (!isNull(csvStruct.getSTART_TIME3()) || !isNull(csvStruct.getEND_TIME3()) || !"0".equals(csvStruct.getOPR_TYP3()))) {
				// <�G���[> AD20057 �y��Ƌ�R�[�h����͂��ĉ������B�z
				// �G���[���ځF��Ƌ�R�[�h�@
				csvExport(csvStruct
							, "1"					// �G���[�敪
							, lineNo				// �G���[�s�ԍ�
							, CSV_WS_CD3			// �G���[���ڔԍ�
							 , "Expj.CSV_SUB_WS_CD"		// �G���[���ږ�
							 , new ExpjMessage("AD20057").getMessage(_locale));	// �G���[���b�Z�[�W
				return false;
			}
			
			if(!isNull(csvStruct.getWS_CD3())) {
				//��Ƌ�R�[�h3�@
				csvStruct.setWS_CD6(csvStruct.getWS_CD3());
				tempList = entity.mselectM_WS_PLANT.read(conn, csvStruct);
				if (tempList.isEmpty()) {
					// <�G���[> AA01003 �y��Ƌ�R�[�h����Ƌ�ɑ��݂��܂���B�z
					// �G���[���ځF��Ƌ�R�[�h�@
					csvExport(csvStruct
								, "1"					// �G���[�敪
								, lineNo				// �G���[�s�ԍ�
								, CSV_WS_CD3			// �G���[���ڔԍ�
								, "Expj.Cmt6762"		// �G���[���ږ�
								, new ExpjMessage("AA01003").getMessage(_locale));	// �G���[���b�Z�[�W
					return false;
				}
				if (isNull(csvStruct.getSTART_TIME3()) || isNull(csvStruct.getEND_TIME3())) {
					// <�G���[> AD61004 �y�J�n�����E�I����������͂��ĉ������B�z
					// �G���[���ځF�J�n����
					csvExport(csvStruct
								, "1"					// �G���[�敪
								, lineNo				// �G���[�s�ԍ�
								, CSV_START_TIME3		// �G���[���ڔԍ�
								, "Expj.Cmt6763"		// �G���[���ږ�
								, new ExpjMessage("AD61004").getMessage(_locale));	// �G���[���b�Z�[�W
					return false;
				} else {
					if (!checkTimeNum(csvStruct.getSTART_TIME3()) || !checkTimeNum(csvStruct.getEND_TIME3())) {
						// �J�n�����E�I���������P�E�Q���̏ꍇ
						// <�G���[> AD61005
						// �y�J�n�����E�I��������ݒ肷��ꍇ�́A3����������4���̐����Ŏw�肵�Ă��������B�z
						csvExport(csvStruct
									, "1"					// �G���[�敪
									, lineNo				// �G���[�s�ԍ�
									, CSV_START_TIME3		// �G���[���ڔԍ�
									, "Expj.Cmt6763"		// �G���[���ږ�
									, new ExpjMessage("AD61005").getMessage(_locale));	// �G���[���b�Z�[�W
						return false;
					}
					// �J�n�����E�I������
					if (!checkTimeFormat(csvStruct.getSTART_TIME3()) || !checkTimeFormat(csvStruct.getEND_TIME3())) {
						// �G���[���ځF�J�n����
						// �J�n�����E�I��������hh24mi�`���łȂ��ꍇ
						// <�G���[> AD61006
						// �y�J�n�����E�I��������hh24mi�̎����`���œ��͂��Ă��������B�z
						// �G���[���ځF�J�n����
						csvExport(csvStruct
									, "1"					// �G���[�敪
									, lineNo				// �G���[�s�ԍ�
									, CSV_START_TIME3		// �G���[���ڔԍ�
									, "Expj.Cmt6763"		// �G���[���ږ�
									, new ExpjMessage("AD61006").getMessage(_locale));	// �G���[���b�Z�[�W
						return false;
					}
				}
			}
			
			if ("0".equals(csvStruct.getUN_OPR_CAUSE_TYP3()) && (!"0".equals(csvStruct.getUN_OPR_TIME3()))) {
				// �u�s��Ɨ��R3�v��0�F�ΏۊO ���A
				// �i�u�s��Ǝ���3�v��0�ȊO�j �̏ꍇ
				// <�G���[> AD61008 �y�s��Ɨ��R����͂��ĉ������B�z
				// �G���[���ځF�s��Ɨ��R1
				csvExport(csvStruct
							, "1"					// �G���[�敪
							, lineNo				// �G���[�s�ԍ�
							, CSV_UN_OPR_CAUSE_TYP3	// �G���[���ڔԍ�
							, "Expj.Cmt6766"		// �G���[���ږ�
							, new ExpjMessage("AD61008").getMessage(_locale));	// �G���[���b�Z�[�W
				return false;
			}
			
			if (!"0".equals(csvStruct.getUN_OPR_CAUSE_TYP3()) && "0".equals(csvStruct.getUN_OPR_TIME3())) {
				// �u�s��Ɨ��R3�v��0�F�ΏۊO�@�ȊO ���A�u�s��Ǝ���3�v��0 �̏ꍇ
				// <�G���[> AD61009 �y�s��Ǝ��Ԃ���͂��ĉ������B�z
				csvExport(csvStruct
							, "1"					// �G���[�敪
							, lineNo				// �G���[�s�ԍ�
							, CSV_UN_OPR_TIME3		// �G���[���ڔԍ�
							, "Expj.Cmt6767"		// �G���[���ږ�
							, new ExpjMessage("AD61009").getMessage(_locale));	// �G���[���b�Z�[�W
				return false;
			}
			
			// ��Ǝ��Ԍv�Z�������s���A��Ǝ��Ԍv�Z�������G���[�ƂȂ����ꍇ
			if(!isNull(csvStruct.getSTART_TIME3()) && !isNull(csvStruct.getEND_TIME3())) {
				csvStruct.setSTART_TIME6(csvStruct.getSTART_TIME3());
				csvStruct.setEND_TIME6(csvStruct.getEND_TIME3());
				String oprTime3 = getTimeCalculate(csvStruct);
				if (isNull(oprTime3)) {
					csvExport(csvStruct
								, "1"						// �G���[�敪
								, lineNo					// �G���[�s�ԍ�
								, CSV_START_TIME3			// �G���[���ڔԍ�
								, "Expj.Cmt6763"			// �G���[���ږ�
								, new ExpjMessage("AD61010", csvStruct.getRETURN_MESSAGE()).getMessage(_locale));	// �G���[���b�Z�[�W
					return false;
				} else {
					oprTime = Calculate.add(oprTime, oprTime3);
					csvStruct.setOPR_TIME3(oprTime3);
				}
			} else {
				csvStruct.setOPR_TIME3(null);
			}
			// �u��Ƌ�R�[�h3�v��Null ���A�u�s��Ɨ��R�v��0�F�ΏۊO�@�ȊO�̏ꍇ
			if(isNull(csvStruct.getWS_CD3()) && !"0".equals(csvStruct.getUN_OPR_CAUSE_TYP3())) {
				// <�G���[> AD20057 �y��Ƌ�R�[�h����͂��ĉ������B�z
				// �G���[���ځF��Ƌ�R�[�h�@
				csvExport(csvStruct
							, "1"					// �G���[�敪
							, lineNo				// �G���[�s�ԍ�
							, CSV_WS_CD3			// �G���[���ڔԍ�
							, "Expj.CSV_WS_CD_03"		// �G���[���ږ�
							, new ExpjMessage("AD20057").getMessage(_locale));	// �G���[���b�Z�[�W
				return false;
			}
			
			if(!isNull(csvStruct.getSTART_TIME3()) && !isNull(csvStruct.getEND_TIME3())) {
				csvStruct.setSTART_TIME6(csvStruct.getSTART_TIME3());
				csvStruct.setEND_TIME6(csvStruct.getEND_TIME3());
				if (compareHm(csvStruct.getSTART_TIME6(), csvStruct.getEND_TIME6()) > 0) {
					csvStruct.setTIME_FLG2("1");
				} else {
					csvStruct.setTIME_FLG2("2");
				}
				tempList = entity.mUT_DAILY_WORK_REPORT_2.read(conn, csvStruct);
				if (!tempList.isEmpty()) {
					// <�G���[> AD61014
					// �y�����Ɠ��ŁA��Ǝ��ԑт��d�����Ă���f�[�^�����ɑ��݂��܂��B�z
					// �G���[���ځF�J�n����
					csvExport(csvStruct
								, "1"						// �G���[�敪
								, lineNo					// �G���[�s�ԍ�
								, CSV_START_TIME3			// �G���[���ڔԍ�
								, "Expj.Cmt6763"			// �G���[���ږ�
								, new ExpjMessage("AD61014").getMessage(_locale));	// �G���[���b�Z�[�W
					return false;
				}
			}
			
			/** ����4�̃`�F�b�N�@*/
			if(isNull(csvStruct.getWS_CD4()) && (!isNull(csvStruct.getSTART_TIME4()) || !isNull(csvStruct.getEND_TIME4()) || !"0".equals(csvStruct.getOPR_TYP4()))) {
				// <�G���[> AD20057 �y��Ƌ�R�[�h����͂��ĉ������B�z
				// �G���[���ځF��Ƌ�R�[�h�@
				csvExport(csvStruct
							, "1"					// �G���[�敪
							, lineNo				// �G���[�s�ԍ�
							, CSV_WS_CD4			// �G���[���ڔԍ�
							, "Expj.CSV_SUB_WS_CD"		// �G���[���ږ�
							, new ExpjMessage("AD20057").getMessage(_locale));	// �G���[���b�Z�[�W
				return false;
			}
			
			if(!isNull(csvStruct.getWS_CD4())) {
				//��Ƌ�R�[�h4�@
				csvStruct.setWS_CD6(csvStruct.getWS_CD4());
				tempList = entity.mselectM_WS_PLANT.read(conn, csvStruct);
				if (tempList.isEmpty()) {
					// <�G���[> AA01003 �y��Ƌ�R�[�h����Ƌ�ɑ��݂��܂���B�z
					// �G���[���ځF��Ƌ�R�[�h�@
					csvExport(csvStruct
								, "1"					// �G���[�敪
								, lineNo				// �G���[�s�ԍ�
								, CSV_WS_CD4			// �G���[���ڔԍ�
								, "Expj.Cmt6769"		// �G���[���ږ�
								, new ExpjMessage("AA01003").getMessage(_locale));	// �G���[���b�Z�[�W
					return false;
				}
				if (isNull(csvStruct.getSTART_TIME4()) || isNull(csvStruct.getEND_TIME4())) {
					// <�G���[> AD61004 �y�J�n�����E�I����������͂��ĉ������B�z
					// �G���[���ځF�J�n����
					csvExport(csvStruct
								, "1"					// �G���[�敪
								, lineNo				// �G���[�s�ԍ�
								, CSV_START_TIME4		// �G���[���ڔԍ�
								, "Expj.Cmt6770"		// �G���[���ږ�
								, new ExpjMessage("AD61004").getMessage(_locale));	// �G���[���b�Z�[�W
					return false;
				} else {
					if (!checkTimeNum(csvStruct.getSTART_TIME4()) || !checkTimeNum(csvStruct.getEND_TIME4())) {
						// 2�J�n�����E�I���������P�E�Q���̏ꍇ
						// <�G���[> AD61005
						// �y�J�n�����E�I��������ݒ肷��ꍇ�́A3����������4���̐����Ŏw�肵�Ă��������B�z
						csvExport(csvStruct
									, "1"					// �G���[�敪
									, lineNo				// �G���[�s�ԍ�
									, CSV_START_TIME4		// �G���[���ڔԍ�
									, "Expj.Cmt6770"		// �G���[���ږ�
									, new ExpjMessage("AD61005").getMessage(_locale));	// �G���[���b�Z�[�W
						return false;
					}
					// �J�n�����E�I������
					if (!checkTimeFormat(csvStruct.getSTART_TIME4()) || !checkTimeFormat(csvStruct.getEND_TIME4())) {
						// �G���[���ځF�J�n����
						// �J�n�����E�I��������hh24mi�`���łȂ��ꍇ
						// <�G���[> AD61006
						// �y�J�n�����E�I��������hh24mi�̎����`���œ��͂��Ă��������B�z
						// �G���[���ځF�J�n����
						csvExport(csvStruct
									, "1"					// �G���[�敪
									, lineNo				// �G���[�s�ԍ�
									, CSV_START_TIME4		// �G���[���ڔԍ�
									, "Expj.Cmt6770"		// �G���[���ږ�
									, new ExpjMessage("AD61006").getMessage(_locale));	// �G���[���b�Z�[�W
						return false;
					}
				}
			}
			
			if ("0".equals(csvStruct.getUN_OPR_CAUSE_TYP4()) && (!"0".equals(csvStruct.getUN_OPR_TIME4()))) {
				// �u�s��Ɨ��R4�v��0�F�ΏۊO ���A
				// �i�u�s��Ǝ���4�v��0�ȊO�j �̏ꍇ
				// <�G���[> AD61008 �y�s��Ɨ��R����͂��ĉ������B�z
				// �G���[���ځF�s��Ɨ��R4
				csvExport(csvStruct
							, "1"					// �G���[�敪
							, lineNo				// �G���[�s�ԍ�
							, CSV_UN_OPR_CAUSE_TYP4	// �G���[���ڔԍ�
							, "Expj.Cmt6773"		// �G���[���ږ�
							, new ExpjMessage("AD61008").getMessage(_locale));	// �G���[���b�Z�[�W
				return false;
			}
			
			if (!"0".equals(csvStruct.getUN_OPR_CAUSE_TYP4()) && "0".equals(csvStruct.getUN_OPR_TIME4())) {
				// �u�s��Ɨ��R4�v��0�F�ΏۊO�ȊO ���A�u�s��Ǝ���4�v�� 0 �̏ꍇ
				// <�G���[> AD61009 �y�s��Ǝ��Ԃ���͂��ĉ������B�z
				csvExport(csvStruct
							, "1"					// �G���[�敪
							, lineNo				// �G���[�s�ԍ�
							, CSV_UN_OPR_TIME4		// �G���[���ڔԍ�
							, "Expj.Cmt6774"		// �G���[���ږ�
							, new ExpjMessage("AD61009").getMessage(_locale));	// �G���[���b�Z�[�W
				return false;
			}
			
			// ��Ǝ��Ԍv�Z�������s���A��Ǝ��Ԍv�Z�������G���[�ƂȂ����ꍇ
			if(!isNull(csvStruct.getSTART_TIME4()) && !isNull(csvStruct.getEND_TIME4())) {
				csvStruct.setSTART_TIME6(csvStruct.getSTART_TIME4());
				csvStruct.setEND_TIME6(csvStruct.getEND_TIME4());
				String oprTime4 = getTimeCalculate(csvStruct);
				if (isNull(oprTime4)) {
					csvExport(csvStruct
								, "1"						// �G���[�敪
								, lineNo					// �G���[�s�ԍ�
								, CSV_START_TIME4			// �G���[���ڔԍ�
								, "Expj.Cmt6770"			// �G���[���ږ�
								, new ExpjMessage("AD61010", csvStruct.getRETURN_MESSAGE()).getMessage(_locale));	// �G���[���b�Z�[�W
					return false;
				} else {
					oprTime = Calculate.add(oprTime, oprTime4);
					csvStruct.setOPR_TIME4(oprTime4);
				}
			} else{
				csvStruct.setOPR_TIME4(null);
			}
			
			if(isNull(csvStruct.getWS_CD4()) && !"0".equals(csvStruct.getUN_OPR_CAUSE_TYP4())) {
				// <�G���[> AD20057 �y��Ƌ�R�[�h����͂��ĉ������B�z
				// �G���[���ځF��Ƌ�R�[�h�@
				csvExport(csvStruct
							, "1"					// �G���[�敪
							, lineNo				// �G���[�s�ԍ�
							, CSV_WS_CD4			// �G���[���ڔԍ�
							, "Expj.CSV_SUB_WS_CD"		// �G���[���ږ�
							, new ExpjMessage("AD20057").getMessage(_locale));	// �G���[���b�Z�[�W
				return false;
			}
			
			if(!isNull(csvStruct.getSTART_TIME4()) && !isNull(csvStruct.getEND_TIME4())) {
				csvStruct.setSTART_TIME6(csvStruct.getSTART_TIME4());
				csvStruct.setEND_TIME6(csvStruct.getEND_TIME4());
				if (compareHm(csvStruct.getSTART_TIME6(), csvStruct.getEND_TIME6()) > 0) {
					csvStruct.setTIME_FLG2("1");
				} else {
					csvStruct.setTIME_FLG2("2");
				}
				tempList = entity.mUT_DAILY_WORK_REPORT_2.read(conn, csvStruct);
				if (!tempList.isEmpty()) {
					// <�G���[> AD61014
					// �y�����Ɠ��ŁA��Ǝ��ԑт��d�����Ă���f�[�^�����ɑ��݂��܂��B�z
					// �G���[���ځF�J�n����
					csvExport(csvStruct
								, "1"						// �G���[�敪
								, lineNo					// �G���[�s�ԍ�
								, CSV_START_TIME4			// �G���[���ڔԍ�
								, "Expj.Cmt6770"			// �G���[���ږ�
								, new ExpjMessage("AD61014").getMessage(_locale));	// �G���[���b�Z�[�W
					return false;
				}
			}
			
			/** ����5�̃`�F�b�N�@*/
			if(isNull(csvStruct.getWS_CD5()) && (!isNull(csvStruct.getSTART_TIME5()) || !isNull(csvStruct.getEND_TIME5()) || !"0".equals(csvStruct.getOPR_TYP5()))) {
				// <�G���[> AD20057 �y��Ƌ�R�[�h����͂��ĉ������B�z
				// �G���[���ځF��Ƌ�R�[�h�@
				csvExport(csvStruct
							, "1"					// �G���[�敪
							, lineNo				// �G���[�s�ԍ�
							, CSV_WS_CD5			// �G���[���ڔԍ�
							, "Expj.CSV_SUB_WS_CD"		// �G���[���ږ�
							, new ExpjMessage("AD20057").getMessage(_locale));	// �G���[���b�Z�[�W
				return false;
			}
			
			if(!isNull(csvStruct.getWS_CD5())) {
				//��Ƌ�R�[�h5�@
				csvStruct.setWS_CD6(csvStruct.getWS_CD5());
				tempList = entity.mselectM_WS_PLANT.read(conn, csvStruct);
				if (tempList.isEmpty()) {
					// <�G���[> AA01003 �y��Ƌ�R�[�h����Ƌ�ɑ��݂��܂���B�z
					// �G���[���ځF��Ƌ�R�[�h�@
					csvExport(csvStruct
								, "1"					// �G���[�敪
								, lineNo				// �G���[�s�ԍ�
								, CSV_WS_CD5			// �G���[���ڔԍ�
								, "Expj.Cmt6776"		// �G���[���ږ�
								, new ExpjMessage("AA01003").getMessage(_locale));	// �G���[���b�Z�[�W
					return false;
				}
				if (isNull(csvStruct.getSTART_TIME5()) || isNull(csvStruct.getEND_TIME5())) {
					// <�G���[> AD61004 �y�J�n�����E�I����������͂��ĉ������B�z
					// �G���[���ځF�J�n����
					csvExport(csvStruct
								, "1"					// �G���[�敪
								, lineNo				// �G���[�s�ԍ�
								, CSV_START_TIME5		// �G���[���ڔԍ�
								, "Expj.Cmt6777"		// �G���[���ږ�
								, new ExpjMessage("AD61004").getMessage(_locale));	// �G���[���b�Z�[�W
					return false;
				} else {
					if (!checkTimeNum(csvStruct.getSTART_TIME5()) || !checkTimeNum(csvStruct.getEND_TIME5())) {
						// 2�J�n�����E�I���������P�E�Q���̏ꍇ
						// <�G���[> AD61005
						// �y�J�n�����E�I��������ݒ肷��ꍇ�́A3����������4���̐����Ŏw�肵�Ă��������B�z
						csvExport(csvStruct
									, "1"					// �G���[�敪
									, lineNo				// �G���[�s�ԍ�
									, CSV_START_TIME5		// �G���[���ڔԍ�
									, "Expj.Cmt6777"		// �G���[���ږ�
									, new ExpjMessage("AD61005").getMessage(_locale));	// �G���[���b�Z�[�W
						return false;
					}
					// �J�n�����E�I������
					if (!checkTimeFormat(csvStruct.getSTART_TIME5()) || !checkTimeFormat(csvStruct.getEND_TIME5())) {
						// �G���[���ځF�J�n����
						// 3�J�n�����E�I��������hh24mi�`���łȂ��ꍇ
						// <�G���[> AD61006
						// �y�J�n�����E�I��������hh24mi�̎����`���œ��͂��Ă��������B�z
						// �G���[���ځF�J�n����
						csvExport(csvStruct
									, "1"					// �G���[�敪
									, lineNo				// �G���[�s�ԍ�
									, CSV_START_TIME5		// �G���[���ڔԍ�
									, "Expj.Cmt6777"		// �G���[���ږ�
									, new ExpjMessage("AD61006").getMessage(_locale));	// �G���[���b�Z�[�W
						return false;
					}
				}
			}
			
			if ("0".equals(csvStruct.getUN_OPR_CAUSE_TYP5()) && (!"0".equals(csvStruct.getUN_OPR_TIME5()))) {
				// �u�s��Ɨ��R5�v��0�F�ΏۊO  ���A
				// �i�u�s��Ǝ���5�v��0�ȊO�j �̏ꍇ
				// <�G���[> AD61008 �y�s��Ɨ��R����͂��ĉ������B�z
				// �G���[���ځF�s��Ɨ��R1
				csvExport(csvStruct
							, "1"					// �G���[�敪
							, lineNo				// �G���[�s�ԍ�
							, CSV_UN_OPR_CAUSE_TYP5	// �G���[���ڔԍ�
							, "Expj.Cmt6780"		// �G���[���ږ�
							, new ExpjMessage("AD61008").getMessage(_locale));	// �G���[���b�Z�[�W
				return false;
			}
			
			if (!"0".equals(csvStruct.getUN_OPR_CAUSE_TYP5()) && "0".equals(csvStruct.getUN_OPR_TIME5())) {
				// �u�s��Ɨ��R5�v��0�F�ΏۊO�@�ȊO ���A�u�s��Ǝ���5�v�� 0 �̏ꍇ
				// <�G���[> AD61009 �y�s��Ǝ��Ԃ���͂��ĉ������B�z
				csvExport(csvStruct
						, "1"					// �G���[�敪
						, lineNo				// �G���[�s�ԍ�
						, CSV_UN_OPR_TIME5		// �G���[���ڔԍ�
						, "Expj.Cmt6781"		// �G���[���ږ�
						, new ExpjMessage("AD61009").getMessage(_locale));	// �G���[���b�Z�[�W
				return false;
			}
			
			// ��Ǝ��Ԍv�Z�������s���A��Ǝ��Ԍv�Z�������G���[�ƂȂ����ꍇ
			if(!isNull(csvStruct.getSTART_TIME5()) && !isNull(csvStruct.getEND_TIME5())) {
				csvStruct.setSTART_TIME6(csvStruct.getSTART_TIME5());
				csvStruct.setEND_TIME6(csvStruct.getEND_TIME5());
				String oprTime5 = getTimeCalculate(csvStruct);
				if (isNull(oprTime5)) {
					csvExport(csvStruct
								, "1"						// �G���[�敪
								, lineNo					// �G���[�s�ԍ�
								, CSV_START_TIME5			// �G���[���ڔԍ�
								, "Expj.Cmt6777"			// �G���[���ږ�
								, new ExpjMessage("AD61010", csvStruct.getRETURN_MESSAGE()).getMessage(_locale));	// �G���[���b�Z�[�W
					return false;
				} else {
					oprTime = Calculate.add(oprTime, oprTime5);
					csvStruct.setOPR_TIME5(oprTime5);
				}
			} else {
				csvStruct.setOPR_TIME5(null);
			}
			
			if(isNull(csvStruct.getWS_CD5()) && !"0".equals(csvStruct.getUN_OPR_CAUSE_TYP5())) {
				// <�G���[> AD20057 �y��Ƌ�R�[�h����͂��ĉ������B�z
				// �G���[���ځF��Ƌ�R�[�h�@
				csvExport(csvStruct
							, "1"					// �G���[�敪
							, lineNo				// �G���[�s�ԍ�
							, CSV_WS_CD5			// �G���[���ڔԍ�
							, "Expj.Cmt6776"		// �G���[���ږ�
							, new ExpjMessage("AD20057").getMessage(_locale));	// �G���[���b�Z�[�W
				return false;
			}
			
			if(!isNull(csvStruct.getSTART_TIME5()) && !isNull(csvStruct.getEND_TIME5())) {
				csvStruct.setSTART_TIME6(csvStruct.getSTART_TIME5());
				csvStruct.setEND_TIME6(csvStruct.getEND_TIME5());
				if (compareHm(csvStruct.getSTART_TIME6(), csvStruct.getEND_TIME6()) > 0) {
					csvStruct.setTIME_FLG2("1");
				} else {
					csvStruct.setTIME_FLG2("2");
				}
				tempList = entity.mUT_DAILY_WORK_REPORT_2.read(conn, csvStruct);
				if (!tempList.isEmpty()) {
					// <�G���[> AD61014
					// �y�����Ɠ��ŁA��Ǝ��ԑт��d�����Ă���f�[�^�����ɑ��݂��܂��B�z
					// �G���[���ځF�J�n����
					csvExport(csvStruct
								, "1"						// �G���[�敪
								, lineNo					// �G���[�s�ԍ�
								, CSV_START_TIME5			// �G���[���ڔԍ�
								, "Expj.Cmt6777"			// �G���[���ږ�
								, new ExpjMessage("AD61014").getMessage(_locale));	// �G���[���b�Z�[�W
					return false;
				}
			}
		
			// �u����1�v�`�u����5�v�����̓���L�[�Əd�Ȃ��Ă�ꍇ
			if(!checkTimeDuplicate(csvStruct, lineNo)) {
				return false;
			}
			
			if (Calculate.compare(oprTime, _MAX_OPR_TIME) > 0) {
				// <�G���[> AD61012 �y��Ǝ��Ԃ�����𒴂��Ă��܂��B�z
				// �G���[���ځF�J�n����
				csvExport(csvStruct
							, "1"						// �G���[�敪
							, lineNo					// �G���[�s�ԍ�
							, CSV_START_TIME1			// �G���[���ڔԍ�
							, "Expj.Cmt6749"			// �G���[���ږ�
							, new ExpjMessage("AD61012").getMessage(_locale));// �G���[���b�Z�[�W
				return false;
			} else {
				csvStruct.setTOTAL_OPR_TIME(oprTime);
			}
			
			if ("1".equals(csvStruct.getHOLIDAY_FLG())) {
				// <���[�j���O> AD61013 �y���͂��ꂽ���t�͉ғ����ł͂���܂���B�z
				// �G���[���ځF���[�U�R�[�h�i�l����j
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "2"						// �G���[�敪
						, lineNo					// �G���[�����s
						, CSV_OPR_DATE2				// �G���[���ڔԍ�
						,"Expj.Cmt6783"			// �G���[���ږ�
						,new ExpjMessage("AD61013").getMessage(_locale));	// �G���[���b�Z�[�W
				_intWarningCount++;
			}
		} catch(Exception e) {
			 ExpjMessage emsg = new ExpjMessage( "ZZ01106");
			 sysLog.severe(emsg, getsysUSER_CD());
			 ExpjException ee = new ExpjException(e, emsg);
			 ee.setLocale(CoreTools.getLocale(getsysUSER_CD()));
			 throw ee;
		}
		
		return true;
	}
	
	/**
	 * ���������`�F�b�N
	 * @param date ��������
	 * @return�@
	 */
	private boolean checkTimeNum (String date){
		if (date.length() != 3 && date.length() != 4) {
			return false;
		} 
		return true;
	}
	
	/**
	 * CSV�t�F�C�����e�`�F�b�N�i����敪���Q�i�l����j�̏ꍇ�j
	 * @param csvStruct CSV�t�F�C�����e
	 * @throws DataNotFoundException 
	 * @throws SQLException 
	 * @throws ParseException 
	 * @throws FoundationException 
	 */
	private boolean checkPersonCsvData(AD0140010Struct csvStruct, int index) throws ExpjException {
		try {
			// ���[�U�R�[�h�i�l����j�ANULL�̏ꍇ
			if (isNull(csvStruct.getUSER_CD2())){
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_USER_CD2				// �G���[���ڔԍ�
						, "Expj.Cmt6784"			// �G���[���ږ�
						,new ExpjMessage("AD61017").getMessage(_locale)	// �G���[���b�Z�[�W
						); 
				return false;
			}
			
			// ���[�U�R�[�h�i�l����j�A����26���̏ꍇ
			if (strLengthChk(csvStruct.getUSER_CD2()) >= 26) {
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_USER_CD2				// �G���[���ڔԍ�
						, "Expj.Cmt6784"			// �G���[���ږ�
						,new ExpjMessage("AA01501").getMessage(_locale)	// �G���[���b�Z�[�W
						);  
				return false;
			}
			// ���[�U�R�[�h�A�y�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B�z
			if (chkHankaku(csvStruct.getUSER_CD2())) {
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_USER_CD2				// �G���[���ڔԍ�
						, "Expj.Cmt6784"			// �G���[���ږ�
						, new ExpjMessage("AA01524").getMessage(_locale)	// �G���[���b�Z�[�W
						); 
				return false;
			}
			// ���[�U�R�[�h�i�l����j�����[���[�U�}�X�^].�g�H��R�[�h�h
			List tempList = entity.mselectUSER_MST.read(conn, csvStruct);
			if(!tempList.isEmpty()) {
				AD0140010Struct tempStruct = (AD0140010Struct)tempList.get(0);
				csvStruct.setPLANT_CD(tempStruct.getPLANT_CD());
			} else {
				csvStruct.setPLANT_CD(sysPLANT_CD);
			}
			
			// ��Ɠ��i�l����j�A NULL�̏ꍇ
			if (isNull(csvStruct.getOPR_DATE2())) {
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_OPR_DATE2				// �G���[���ڔԍ�
						, "Expj.Cmt6783"			// �G���[���ږ�
						, new ExpjMessage("AD20059").getMessage(_locale)	// �G���[���b�Z�[�W
						); 
				return false;
			}
			// ��Ɠ��i�l����j���t�t�H�[�}�b�g������łȂ��ꍇ
			if (!checkDate(csvStruct.getOPR_DATE2())) {
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_OPR_DATE2				// �G���[���ڔԍ�
						, "Expj.Cmt6783"			// �G���[���ږ�
						, new ExpjMessage("AA01606").getMessage(_locale)	// �G���[���b�Z�[�W
						); 
				return false;
			}
			// �Ζ��V�t�g�i�l����j�ANULL�̏ꍇ
			if( isNull(csvStruct.getWORK_SHIFT_CODE2())) {
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_WORK_SHIFT_CODE2		// �G���[���ڔԍ�
						, "Expj.Cmt6785"			// �G���[���ږ�
						,new ExpjMessage("AD61015").getMessage(_locale)	// �G���[���b�Z�[�W
						);  
				return false;
			}
			// �Ζ��V�t�g�A����26���̏ꍇ
			if (strLengthChk(csvStruct.getWORK_SHIFT_CODE2()) >= 26) {
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_WORK_SHIFT_CODE2		// �G���[���ڔԍ�
						, "Expj.Cmt6785"			// �G���[���ږ�
						, new ExpjMessage("AA01501").getMessage(_locale)	// �G���[���b�Z�[�W
						);  
				return false;
			}
			// �Ζ��V�t�g�A�y�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B�z
			if (chkHankaku(csvStruct.getWORK_SHIFT_CODE2())) {
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_WORK_SHIFT_CODE2		// �G���[���ڔԍ�
						, "Expj.Cmt6785"			// �G���[���ږ�
						, new ExpjMessage("AA01524").getMessage(_locale)	// �G���[���b�Z�[�W
						);  
				return false;
			}
			// ��Ƌ�R�[�h1 �ANULL�̏ꍇ
			if (isNull(csvStruct.getWS_CD1())){
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_WS_CD1				// �G���[���ڔԍ�
						, "Expj.CSV_WS_CD_01"			// �G���[���ږ�
						, new ExpjMessage("AD20057").getMessage(_locale)	// �G���[���b�Z�[�W
						);  
				return false;
			} 
			//��Ƌ�R�[�h1 �A����26���ȏ�̏ꍇ�A
			if (strLengthChk(csvStruct.getWS_CD1()) >= 26) {
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_WS_CD1				// �G���[���ڔԍ�
						, "Expj.CSV_WS_CD_01"			// �G���[���ږ�
						, new ExpjMessage("AA01501").getMessage(_locale)	// �G���[���b�Z�[�W
						); 
				return false;
			}
			// ��Ƌ�R�[�h1 �y�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B�z
			if (chkHankaku(csvStruct.getWS_CD1())){
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_WS_CD1				// �G���[���ڔԍ�
						, "Expj.CSV_WS_CD_01"			// �G���[���ږ�
						, new ExpjMessage("AA01524").getMessage(_locale)	// �G���[���b�Z�[�W
						);  
				return false;
			} 
			if (!isNull(csvStruct.getSTART_TIME1())) {
				// �J�n����1�A�����ȊO�̏ꍇ
				if (!isDigitChk(csvStruct.getSTART_TIME1())){
					csvExport(csvStruct						// �Ώۃf�[�^���
							, "1"							// �G���[�敪
							, index							// �G���[�����s
							, CSV_START_TIME1				// �G���[���ڔԍ�
							, "Expj.Cmt6749"				// �G���[���ږ�
							, new ExpjMessage("AA01503").getMessage(_locale)	// �G���[���b�Z�[�W
							); 
					return false;
				}
				// �J�n����1�A����2���ȉ��A�܂���5���ȏ�̏ꍇ
				if (csvStruct.getSTART_TIME1().length() >= 5 || csvStruct.getSTART_TIME1().length() <= 2){
					csvExport(csvStruct					// �Ώۃf�[�^���
							, "1"						// �G���[�敪
							, index						// �G���[�����s
							, CSV_START_TIME1			// �G���[���ڔԍ�
							, "Expj.Cmt6749"			// �G���[���ږ�
							, new ExpjMessage("AS00019").getMessage(_locale)	// �G���[���b�Z�[�W
							); 
					return false;
				}
			}
			if (!isNull(csvStruct.getEND_TIME1())) {
				// �I������1�A�����ȊO�̏ꍇ
				if (!isDigitChk(csvStruct.getEND_TIME1())){
					csvExport(csvStruct					// �Ώۃf�[�^���
							, "1"						// �G���[�敪
							, index						// �G���[�����s
							, CSV_END_TIME1				// �G���[���ڔԍ�
							, "Expj.Cmt6750"			// �G���[���ږ�
							, new ExpjMessage("AA01503").getMessage(_locale)	// �G���[���b�Z�[�W
							); 
					return false;
				}
				// �I������1�A����2���ȉ��A�܂���5���ȏ�̏ꍇ
				if (csvStruct.getEND_TIME1().length() >= 5 || csvStruct.getEND_TIME1().length() <= 2){
					csvExport(csvStruct					// �Ώۃf�[�^���
							, "1"						// �G���[�敪
							, index						// �G���[�����s
							, CSV_END_TIME1				// �G���[���ڔԍ�
							, "Expj.Cmt6750"			// �G���[���ږ�
							, new ExpjMessage("AS00019").getMessage(_locale)	// �G���[���b�Z�[�W
							); 
					return false;
				}
			}
			// ��Ƌ敪1�A�����ȊO�̏ꍇ
			if (!isIntegerChk(csvStruct.getOPR_TYP1())){
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_OPR_TYP1				// �G���[���ڔԍ�
						, "Expj.Cmt6751"			// �G���[���ږ�
						, new ExpjMessage("AA01502").getMessage(_locale)	// �G���[���b�Z�[�W
						); 
				return false;
			}
			// ��Ƌ敪1�A���� 3���ȏ�̏ꍇ
			if (csvStruct.getOPR_TYP1().length() >= 3) {
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_OPR_TYP1				// �G���[���ڔԍ�
						, "Expj.Cmt6751"			// �G���[���ږ�
						, new ExpjMessage("AA01501").getMessage(_locale)	// �G���[���b�Z�[�W
						); 
				return false;
			}
			// �s��Ɨ��R�敪1�A�����ȊO�̏ꍇ
			if (!isIntegerChk(csvStruct.getUN_OPR_CAUSE_TYP1())){
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_UN_OPR_CAUSE_TYP1		// �G���[���ڔԍ�
						, "Expj.Cmt6752"			// �G���[���ږ�
						, new ExpjMessage("AA01502").getMessage(_locale)	// �G���[���b�Z�[�W
						);
				
				return false;
			}
			// �s��Ɨ��R�敪1�A���� 3���ȏ�̏ꍇ
			if (csvStruct.getUN_OPR_CAUSE_TYP1().length() >= 3) {
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_UN_OPR_CAUSE_TYP1		// �G���[���ڔԍ�
						, "Expj.Cmt6752"			// �G���[���ږ�
						, new ExpjMessage("AA01501").getMessage(_locale)	// �G���[���b�Z�[�W
						); 
				return false;
			}
			// �s��Ǝ��ԁi���j1�A���l�ȊO�̏ꍇ
			if (!isNumChk(csvStruct.getUN_OPR_TIME1())){
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_UN_OPR_TIME1			// �G���[���ڔԍ�
						, "Expj.Cmt6753"			// �G���[���ږ�
						, new ExpjMessage("AA01503").getMessage(_locale)	// �G���[���b�Z�[�W
						); 
				return false;
			}
			// �s��Ǝ��ԁi���j1�A0�����̏ꍇ
			if (Calculate.compare(csvStruct.getUN_OPR_TIME1(), "0") == -1){
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_UN_OPR_TIME1			// �G���[���ڔԍ�
						, "Expj.Cmt6753"			// �G���[���ږ�
						,new ExpjMessage("UD60167").getMessage(_locale)	// �G���[���b�Z�[�W
						); 
				return false;
			}
			// �s��Ǝ��ԁi���j1�A9999�`0�͈͈ȊO�̏ꍇ
			if (!isNotInNumRange(csvStruct.getUN_OPR_TIME1(), 4, 0)) {
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_UN_OPR_TIME1			// �G���[���ڔԍ�
						, "Expj.Cmt6753"			// �G���[���ږ�
						, new ExpjMessage("AA01501").getMessage(_locale)	// �G���[���b�Z�[�W
						); 
				return false;
			}
			if (!isNull(csvStruct.getREMARKS1())) {
				// �s��Ɨ��R���l1�A����81���ȏ�̏ꍇ
				if (strLengthChk(csvStruct.getREMARKS1()) >= 81) {
					csvExport(csvStruct					// �Ώۃf�[�^���
							, "1"						// �G���[�敪
							, index						// �G���[�����s
							, CSV_REMARKS1				// �G���[���ڔԍ�
							, "Expj.Cmt6754"			// �G���[���ږ�
							, new ExpjMessage("AA01501").getMessage(_locale)	// �G���[���b�Z�[�W
							); 
					return false;
				}
				// �s��Ɨ��R���l1�A�֑����������͂���Ă����ꍇ
				if (chkHankaku(csvStruct.getREMARKS1())) {
					csvExport(csvStruct					// �Ώۃf�[�^���
							, "1"						// �G���[�敪
							, index						// �G���[�����s
							, CSV_REMARKS1				// �G���[���ڔԍ�
							, "Expj.Cmt6754"			// �G���[���ږ�
							, new ExpjMessage("AA01524").getMessage(_locale)	// �G���[���b�Z�[�W
							);  
					return false;
				}	
			}
			if (!isNull(csvStruct.getWS_CD2())) {
				//��Ƌ�R�[�h2 �A����26���ȏ�̏ꍇ�A
				if (strLengthChk(csvStruct.getWS_CD2()) >= 26) {
					csvExport(csvStruct					// �Ώۃf�[�^���
							, "1"						// �G���[�敪
							, index						// �G���[�����s
							, CSV_WS_CD2				// �G���[���ڔԍ�
							, "Expj.CSV_WS_CD_02"			// �G���[���ږ�
							, new ExpjMessage("AA01501").getMessage(_locale)	// �G���[���b�Z�[�W
							); 
					return false;
				}
				// ��Ƌ�R�[�h2 �y�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B�z
				if (chkHankaku(csvStruct.getWS_CD2())) {
					csvExport(csvStruct					// �Ώۃf�[�^���
							, "1"						// �G���[�敪
							, index						// �G���[�����s
							, CSV_WS_CD2				// �G���[���ڔԍ�
							, "Expj.CSV_WS_CD_02"			// �G���[���ږ�
							, new ExpjMessage("AA01524").getMessage(_locale)	// �G���[���b�Z�[�W
							);  
					return false;
				}
			}
			if (!isNull(csvStruct.getSTART_TIME2())) {
				// �J�n����2�A�����ȊO�̏ꍇ
				if (!isDigitChk(csvStruct.getSTART_TIME2())) {
					csvExport(csvStruct						// �Ώۃf�[�^���
							, "1"							// �G���[�敪
							, index							// �G���[�����s
							, CSV_START_TIME2				// �G���[���ڔԍ�
							, "Expj.Cmt6756"				// �G���[���ږ�
							, new ExpjMessage("AA01503").getMessage(_locale)	// �G���[���b�Z�[�W
							); 
					return false;
					
				}
				// �J�n����2�A����2���ȉ��A�܂���5���ȏ�̏ꍇ
				if (csvStruct.getSTART_TIME2().length() >= 5 || csvStruct.getSTART_TIME2().length() <= 2){
					csvExport(csvStruct					// �Ώۃf�[�^���
							, "1"						// �G���[�敪
							, index						// �G���[�����s
							, CSV_START_TIME2			// �G���[���ڔԍ�
							, "Expj.Cmt6756"			// �G���[���ږ�
							, new ExpjMessage("AS00019").getMessage(_locale)	// �G���[���b�Z�[�W
							); 
					return false;
				}
			}
			if (!isNull(csvStruct.getEND_TIME2())) {
				// �I������2�A�����ȊO�̏ꍇ
				if (!isDigitChk(csvStruct.getEND_TIME2())){
					csvExport(csvStruct					// �Ώۃf�[�^���
							, "1"						// �G���[�敪
							, index						// �G���[�����s
							, CSV_END_TIME2				// �G���[���ڔԍ�
							, "Expj.Cmt6757"			// �G���[���ږ�
							, new ExpjMessage("AA01503").getMessage(_locale)	// �G���[���b�Z�[�W
							); 
					return false;
				}
				// �I������2�A����2���ȉ��A�܂���5���ȏ�̏ꍇ
				if (csvStruct.getEND_TIME2().length() >= 5 || csvStruct.getEND_TIME2().length() <= 2){
					csvExport(csvStruct					// �Ώۃf�[�^���
							, "1"						// �G���[�敪
							, index						// �G���[�����s
							, CSV_END_TIME2				// �G���[���ڔԍ�
							, "Expj.Cmt6757"			// �G���[���ږ�
							, new ExpjMessage("AS00019").getMessage(_locale)	// �G���[���b�Z�[�W
							); 
					return false;
				}
			}
			// ��Ƌ敪2�A�����ȊO�̏ꍇ
			if (!isIntegerChk(csvStruct.getOPR_TYP2())){
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_OPR_TYP2				// �G���[���ڔԍ�
						, "Expj.Cmt6758"			// �G���[���ږ�
						, new ExpjMessage("AA01502").getMessage(_locale)	// �G���[���b�Z�[�W
						); 
				return false;
			}
			// ��Ƌ敪2�A���� 3���ȏ�̏ꍇ
			if (csvStruct.getOPR_TYP2().length() >= 3) {
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_OPR_TYP2				// �G���[���ڔԍ�
						, "Expj.Cmt6758"			// �G���[���ږ�
						, new ExpjMessage("AA01501").getMessage(_locale)	// �G���[���b�Z�[�W
						); 
				return false;
			}
			// �s��Ɨ��R�敪2�A�����ȊO�̏ꍇ
			if (!isIntegerChk(csvStruct.getUN_OPR_CAUSE_TYP2())){
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_UN_OPR_CAUSE_TYP2		// �G���[���ڔԍ�
						, "Expj.Cmt6759"			// �G���[���ږ�
						, new ExpjMessage("AA01502").getMessage(_locale)	// �G���[���b�Z�[�W
						); 
				return false;
			}
			// �s��Ɨ��R�敪2�A���� 3���ȏ�̏ꍇ
			if (csvStruct.getUN_OPR_CAUSE_TYP2().length() >= 3) {
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_UN_OPR_CAUSE_TYP2		// �G���[���ڔԍ�
						, "Expj.Cmt6759"			// �G���[���ږ�
						, new ExpjMessage("AA01501").getMessage(_locale)	// �G���[���b�Z�[�W
						); 
				return false;
			}
			// �s��Ǝ��ԁi���j2�A���l�ȊO�̏ꍇ
			if (!isNumChk(csvStruct.getUN_OPR_TIME2())) {
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_UN_OPR_TIME2			// �G���[���ڔԍ�
						, "Expj.Cmt6760"			// �G���[���ږ�
						, new ExpjMessage("AA01503").getMessage(_locale)	// �G���[���b�Z�[�W
						); 
				return false;
			}
			// �s��Ǝ��ԁi���j2�A0�����̏ꍇ
			if (Calculate.compare(csvStruct.getUN_OPR_TIME2(), "0") == -1){
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_UN_OPR_TIME2			// �G���[���ڔԍ�
						, "Expj.Cmt6760"			// �G���[���ږ�
						, new ExpjMessage("UD60167").getMessage(_locale)	// �G���[���b�Z�[�W
						);  
				return false;
			}
			// �s��Ǝ��ԁi���j2�A9999�`0�͈͈ȊO�̏ꍇ
			if (!isNotInNumRange(csvStruct.getUN_OPR_TIME2(), 4, 0)) {
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_UN_OPR_TIME2			// �G���[���ڔԍ�
						, "Expj.Cmt6760"			// �G���[���ږ�
						, new ExpjMessage("AA01501").getMessage(_locale)	// �G���[���b�Z�[�W
						);  
				return false;
			}
			if (!isNull(csvStruct.getREMARKS2())) {
				// �s��Ɨ��R���l2�A����81���ȏ�̏ꍇ
				if (strLengthChk(csvStruct.getREMARKS2()) >= 81) {
					csvExport(csvStruct					// �Ώۃf�[�^���
							, "1"						// �G���[�敪
							, index						// �G���[�����s
							, CSV_REMARKS2				// �G���[���ڔԍ�
							, "Expj.Cmt6761"			// �G���[���ږ�
							, new ExpjMessage("AA01501").getMessage(_locale)	// �G���[���b�Z�[�W
							); 
					return false;
				}
				// �s��Ɨ��R���l2�A�֑����������͂���Ă����ꍇ
				if (chkHankaku(csvStruct.getREMARKS2())){
					csvExport(csvStruct					// �Ώۃf�[�^���
							, "1"						// �G���[�敪
							, index						// �G���[�����s
							, CSV_REMARKS2				// �G���[���ڔԍ�
							, "Expj.Cmt6761"			// �G���[���ږ�
							, new ExpjMessage("AA01524").getMessage(_locale)	// �G���[���b�Z�[�W
							); 
					return false;
				}
			}
			if (!isNull(csvStruct.getWS_CD3())) {
				//��Ƌ�R�[�h3 �A����26���ȏ�̏ꍇ�A
				if (strLengthChk(csvStruct.getWS_CD3()) >= 26) {
					csvExport(csvStruct					// �Ώۃf�[�^���
							, "1"						// �G���[�敪
							, index						// �G���[�����s
							, CSV_WS_CD3				// �G���[���ڔԍ�
							, "Expj.CSV_WS_CD_03"			// �G���[���ږ�
							, new ExpjMessage("AA01501").getMessage(_locale)	// �G���[���b�Z�[�W
							); 
					return false;
				}
				// ��Ƌ�R�[�h3 �y�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B�z
				if (chkHankaku(csvStruct.getWS_CD3())){
					csvExport(csvStruct					// �Ώۃf�[�^���
							, "1"						// �G���[�敪
							, index						// �G���[�����s
							, CSV_WS_CD3				// �G���[���ڔԍ�
							, "Expj.CSV_WS_CD_03"			// �G���[���ږ�
							, new ExpjMessage("AA01524").getMessage(_locale)	// �G���[���b�Z�[�W
							);  
					return false;
				}
			}
			if (!isNull(csvStruct.getSTART_TIME3())) {
				// �J�n����3�A�����ȊO�̏ꍇ
				if (!isDigitChk(csvStruct.getSTART_TIME3())){
					csvExport(csvStruct						// �Ώۃf�[�^���
							, "1"							// �G���[�敪
							, index							// �G���[�����s
							, CSV_START_TIME3				// �G���[���ڔԍ�
							, "Expj.Cmt6763"				// �G���[���ږ�
							, new ExpjMessage("AA01503").getMessage(_locale)	// �G���[���b�Z�[�W
							); 
					return false;
				}
				// �J�n����3�A����2���ȉ��A�܂���5���ȏ�̏ꍇ
				if (csvStruct.getSTART_TIME3().length() >= 5 || csvStruct.getSTART_TIME3().length() <= 2){
					csvExport(csvStruct					// �Ώۃf�[�^���
							, "1"						// �G���[�敪
							, index						// �G���[�����s
							, CSV_START_TIME3			// �G���[���ڔԍ�
							, "Expj.Cmt6763"			// �G���[���ږ�
							, new ExpjMessage("AS00019").getMessage(_locale)	// �G���[���b�Z�[�W
							); 
					return false;
				}
			}
			if (!isNull(csvStruct.getEND_TIME3())) {
				// �I������3�A�����ȊO�̏ꍇ
				if (!isDigitChk(csvStruct.getEND_TIME3())){
					csvExport(csvStruct					// �Ώۃf�[�^���
							, "1"						// �G���[�敪
							, index						// �G���[�����s
							, CSV_END_TIME3				// �G���[���ڔԍ�
							, "Expj.Cmt6764"			// �G���[���ږ�
							, new ExpjMessage("AA01503").getMessage(_locale)	// �G���[���b�Z�[�W
							); 
					return false;
				}
				// �I������3�A����2���ȉ��A�A�܂���5���ȏ�̏ꍇ
				if (csvStruct.getEND_TIME3().length() >= 5 || csvStruct.getEND_TIME3().length() <= 2){
					csvExport(csvStruct					// �Ώۃf�[�^���
							, "1"						// �G���[�敪
							, index						// �G���[�����s
							, CSV_END_TIME3				// �G���[���ڔԍ�
							, "Expj.Cmt6764"			// �G���[���ږ�
							, new ExpjMessage("AS00019").getMessage(_locale)	// �G���[���b�Z�[�W
							); 
					return false;
				}
			}
			// ��Ƌ敪3�A�����ȊO�̏ꍇ
			if (!isIntegerChk(csvStruct.getOPR_TYP3())){
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_OPR_TYP3				// �G���[���ڔԍ�
						, "Expj.Cmt6765"			// �G���[���ږ�
						, new ExpjMessage("AA01502").getMessage(_locale)	// �G���[���b�Z�[�W
						); 
				return false;
			}
			// ��Ƌ敪3�A���� 3���ȏ�̏ꍇ
			if (csvStruct.getOPR_TYP3().length() >= 3) {
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_OPR_TYP3				// �G���[���ڔԍ�
						, "Expj.Cmt6765"			// �G���[���ږ�
						, new ExpjMessage("AA01501").getMessage(_locale)	// �G���[���b�Z�[�W
						); 
				return false;
			}
			// �s��Ɨ��R�敪3�A�����ȊO�̏ꍇ
			if (!isIntegerChk(csvStruct.getUN_OPR_CAUSE_TYP3())){
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_UN_OPR_CAUSE_TYP3		// �G���[���ڔԍ�
						, "Expj.Cmt6766"			// �G���[���ږ�
						, new ExpjMessage("AA01502").getMessage(_locale)	// �G���[���b�Z�[�W
						); 
				return false;
			}
			// �s��Ɨ��R�敪3�A���� 3���ȏ�̏ꍇ
			if (csvStruct.getUN_OPR_CAUSE_TYP3().length() >= 3) {
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_UN_OPR_CAUSE_TYP3		// �G���[���ڔԍ�
						, "Expj.Cmt6766"			// �G���[���ږ�
						, new ExpjMessage("AA01501").getMessage(_locale)	// �G���[���b�Z�[�W
						); 
				return false;
			}
			// �s��Ǝ��ԁi���j3�A���l�ȊO�̏ꍇ
			if (!isNumChk(csvStruct.getUN_OPR_TIME3())){
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_UN_OPR_TIME3			// �G���[���ڔԍ�
						, "Expj.Cmt6767"			// �G���[���ږ�
						, new ExpjMessage("AA01503").getMessage(_locale)	// �G���[���b�Z�[�W
						); 
				return false;
			}
			// �s��Ǝ��ԁi���j3�A0�����̏ꍇ
			if (Calculate.compare(csvStruct.getUN_OPR_TIME3(), "0") == -1){
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_UN_OPR_TIME3			// �G���[���ڔԍ�
						, "Expj.Cmt6767"			// �G���[���ږ�
						, new ExpjMessage("UD60167").getMessage(_locale)	// �G���[���b�Z�[�W
						);  
				return false;
			}
			// �s��Ǝ��ԁi���j3�A9999�`0�͈͈ȊO�̏ꍇ
			if (!isNotInNumRange(csvStruct.getUN_OPR_TIME3(), 4, 0)) {
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_UN_OPR_TIME3			// �G���[���ڔԍ�
						, "Expj.Cmt6767"			// �G���[���ږ�
						, new ExpjMessage("AA01501").getMessage(_locale)	// �G���[���b�Z�[�W
						);  
				return false;
			}
			if (!isNull(csvStruct.getREMARKS3())) {
				// �s��Ɨ��R���l3�A����81���ȏ�̏ꍇ
				if (strLengthChk(csvStruct.getREMARKS3()) >= 81) {
					csvExport(csvStruct					// �Ώۃf�[�^���
							, "1"						// �G���[�敪
							, index						// �G���[�����s
							, CSV_REMARKS3				// �G���[���ڔԍ�
							, "Expj.Cmt6768"			// �G���[���ږ�
							, new ExpjMessage("AA01501").getMessage(_locale)	// �G���[���b�Z�[�W
							); 
					return false;
				}
				// �s��Ɨ��R���l3�A�֑����������͂���Ă����ꍇ
				if (chkHankaku(csvStruct.getREMARKS3())){
					csvExport(csvStruct					// �Ώۃf�[�^���
							, "1"						// �G���[�敪
							, index						// �G���[�����s
							, CSV_REMARKS3				// �G���[���ڔԍ�
							, "Expj.Cmt6768"			// �G���[���ږ�
							, new ExpjMessage("AA01524").getMessage(_locale)	// �G���[���b�Z�[�W
							); 
					return false;
				}
			}
			if (!isNull(csvStruct.getWS_CD4())) {
				//��Ƌ�R�[�h4 �A����26���ȏ�̏ꍇ�A
				if (strLengthChk(csvStruct.getWS_CD4()) >= 26) {
					csvExport(csvStruct					// �Ώۃf�[�^���
							, "1"						// �G���[�敪
							, index						// �G���[�����s
							, CSV_WS_CD4				// �G���[���ڔԍ�
							, "Expj.CSV_WS_CD_04"			// �G���[���ږ�
							, new ExpjMessage("AA01501").getMessage(_locale)	// �G���[���b�Z�[�W
							); 
					return false;
				}
				// ��Ƌ�R�[�h4 �y�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B�z
				if (chkHankaku(csvStruct.getWS_CD4())){
					csvExport(csvStruct					// �Ώۃf�[�^���
							, "1"						// �G���[�敪
							, index						// �G���[�����s
							, CSV_WS_CD4				// �G���[���ڔԍ�
							, "Expj.CSV_WS_CD_04"			// �G���[���ږ�
							, new ExpjMessage("AA01524").getMessage(_locale)	// �G���[���b�Z�[�W
							);  
					return false;
				}
			}
			if (!isNull(csvStruct.getSTART_TIME4())) {
				// �J�n����4�A�����ȊO�̏ꍇ
				if (!isDigitChk(csvStruct.getSTART_TIME4())){
					csvExport(csvStruct						// �Ώۃf�[�^���
							, "1"							// �G���[�敪
							, index							// �G���[�����s
							, CSV_START_TIME4				// �G���[���ڔԍ�
							, "Expj.Cmt6770"				// �G���[���ږ�
							, new ExpjMessage("AA01503").getMessage(_locale)	// �G���[���b�Z�[�W
							); 
					return false;
				}
				// �J�n����4�A����2���ȉ��A�܂���5���ȏ�̏ꍇ
				if (csvStruct.getSTART_TIME4().length() >= 5 || csvStruct.getSTART_TIME4().length() <= 2) {
					csvExport(csvStruct					// �Ώۃf�[�^���
							, "1"						// �G���[�敪
							, index						// �G���[�����s
							, CSV_START_TIME4			// �G���[���ڔԍ�
							, "Expj.Cmt6770"			// �G���[���ږ�
							, new ExpjMessage("AS00019").getMessage(_locale)	// �G���[���b�Z�[�W
							); 
					return false;
				}
			}
			if (!isNull(csvStruct.getEND_TIME4())) {
				// �I������4�A�����ȊO�̏ꍇ
				if (!isDigitChk(csvStruct.getEND_TIME4())){
					csvExport(csvStruct					// �Ώۃf�[�^���
							, "1"						// �G���[�敪
							, index						// �G���[�����s
							, CSV_END_TIME4				// �G���[���ڔԍ�
							, "Expj.Cmt6771"			// �G���[���ږ�
							, new ExpjMessage("AA01503").getMessage(_locale)	// �G���[���b�Z�[�W
							); 
					return false;
				}
				// �I������4�A����5���ȏ�̏ꍇ
				if (csvStruct.getEND_TIME4().length() >= 5 || csvStruct.getEND_TIME4().length() <= 2){
					csvExport(csvStruct					// �Ώۃf�[�^���
							, "1"						// �G���[�敪
							, index						// �G���[�����s
							, CSV_END_TIME4				// �G���[���ڔԍ�
							, "Expj.Cmt6771"			// �G���[���ږ�
							, new ExpjMessage("AS00019").getMessage(_locale)	// �G���[���b�Z�[�W
							); 
					return false;
				}
			}
			// ��Ƌ敪4�A�����ȊO�̏ꍇ
			if (!isIntegerChk(csvStruct.getOPR_TYP4())){
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_OPR_TYP4				// �G���[���ڔԍ�
						, "Expj.Cmt6772"			// �G���[���ږ�
						, new ExpjMessage("AA01502").getMessage(_locale)	// �G���[���b�Z�[�W
						); 
				return false;
			}
			// ��Ƌ敪4�A���� 3���ȏ�̏ꍇ
			if (csvStruct.getOPR_TYP4().length() >= 3) {
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_OPR_TYP4				// �G���[���ڔԍ�
						, "Expj.Cmt6772"			// �G���[���ږ�
						, new ExpjMessage("AA01501").getMessage(_locale)	// �G���[���b�Z�[�W
						); 
				return false;
			}
			// �s��Ɨ��R�敪4�A�����ȊO�̏ꍇ
			if (!isIntegerChk(csvStruct.getUN_OPR_CAUSE_TYP4())){
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_UN_OPR_CAUSE_TYP4		// �G���[���ڔԍ�
						, "Expj.Cmt6773"			// �G���[���ږ�
						, new ExpjMessage("AA01502").getMessage(_locale)	// �G���[���b�Z�[�W
						); 
				return false;
			}
			// �s��Ɨ��R�敪4�A���� 3���ȏ�̏ꍇ
			if (csvStruct.getUN_OPR_CAUSE_TYP4().length() >= 3) {
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_UN_OPR_CAUSE_TYP4		// �G���[���ڔԍ�
						, "Expj.Cmt6773"			// �G���[���ږ�
						, new ExpjMessage("AA01501").getMessage(_locale)	// �G���[���b�Z�[�W
						); 
				return false;
			}
			// �s��Ǝ��ԁi���j4�A���l�ȊO�̏ꍇ
			if (!isNumChk(csvStruct.getUN_OPR_TIME4())) {
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_UN_OPR_TIME4			// �G���[���ڔԍ�
						, "Expj.Cmt6774"			// �G���[���ږ�
						, new ExpjMessage("AA01503").getMessage(_locale)	// �G���[���b�Z�[�W
						); 
				return false;
			}
			// �s��Ǝ��ԁi���j4�A0�����̏ꍇ
			if (Calculate.compare(csvStruct.getUN_OPR_TIME4(), "0") == -1){
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_UN_OPR_TIME4			// �G���[���ڔԍ�
						, "Expj.Cmt6774"			// �G���[���ږ�
						, new ExpjMessage("UD60167").getMessage(_locale)	// �G���[���b�Z�[�W
						);  
				return false;
			}
			// �s��Ǝ��ԁi���j4�A9999�`0�͈͈ȊO�̏ꍇ
			if (!isNotInNumRange(csvStruct.getUN_OPR_TIME4(), 4, 0)) {
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_UN_OPR_TIME4			// �G���[���ڔԍ�
						, "Expj.Cmt6774"			// �G���[���ږ�
						, new ExpjMessage("AA01501").getMessage(_locale)	// �G���[���b�Z�[�W
						);  
				return false;
			}
			if (!isNull(csvStruct.getREMARKS4())) {
				// �s��Ɨ��R���l4�A����81���ȏ�̏ꍇ
				if (strLengthChk(csvStruct.getREMARKS4()) >= 81) {
					csvExport(csvStruct					// �Ώۃf�[�^���
							,"1"						// �G���[�敪
							,index						// �G���[�����s
							, CSV_REMARKS4				// �G���[���ڔԍ�
							, "Expj.Cmt6775"			// �G���[���ږ�
							, new ExpjMessage("AA01501").getMessage(_locale)	// �G���[���b�Z�[�W
							); 
					return false;
				}
				// �s��Ɨ��R���l4�A�֑����������͂���Ă����ꍇ
				if (chkHankaku(csvStruct.getREMARKS4())){
					csvExport(csvStruct					// �Ώۃf�[�^���
							, "1"						// �G���[�敪
							, index						// �G���[�����s
							, CSV_REMARKS4				// �G���[���ڔԍ�
							, "Expj.Cmt6775"			// �G���[���ږ�
							, new ExpjMessage("AA01524").getMessage(_locale)	// �G���[���b�Z�[�W
							); 
					return false;
				}
			}
			if (!isNull(csvStruct.getWS_CD5())) {
				//��Ƌ�R�[�h5 �A����26���ȏ�̏ꍇ�A
				if (strLengthChk(csvStruct.getWS_CD5()) >= 26) {
					csvExport(csvStruct					// �Ώۃf�[�^���
							, "1"						// �G���[�敪
							, index						// �G���[�����s
							, CSV_WS_CD5				// �G���[���ڔԍ�
							, "Expj.CSV_WS_CD_05"			// �G���[���ږ�
							, new ExpjMessage("AA01501").getMessage(_locale)	// �G���[���b�Z�[�W
							); 
					return false;
				}
				// ��Ƌ�R�[�h5 �y�֑������i�u%�v�A�u_�v�A�u\�v�j���܂܂�Ă��܂��B�z
				if (chkHankaku(csvStruct.getWS_CD5())){
					csvExport(csvStruct					// �Ώۃf�[�^���
							, "1"						// �G���[�敪
							, index						// �G���[�����s
							, CSV_WS_CD5				// �G���[���ڔԍ�
							, "Expj.CSV_WS_CD_05"			// �G���[���ږ�
							, new ExpjMessage("AA01524").getMessage(_locale)	// �G���[���b�Z�[�W
							);  
					return false;
				}
			}
			if (!isNull(csvStruct.getSTART_TIME5())) {
				// �J�n����5�A�����ȊO�̏ꍇ
				if (!isDigitChk(csvStruct.getSTART_TIME5())){
					csvExport(csvStruct						// �Ώۃf�[�^���
							, "1"							// �G���[�敪
							, index							// �G���[�����s
							, CSV_START_TIME5				// �G���[���ڔԍ�
							, "Expj.Cmt6777"				// �G���[���ږ�
							, new ExpjMessage("AA01503").getMessage(_locale)	// �G���[���b�Z�[�W
							); 
					return false;
				}
				// �J�n����5�A����2���ȉ��A5���ȏ�̏ꍇ
				if (csvStruct.getSTART_TIME5().length() >= 5 || csvStruct.getSTART_TIME5().length() <= 2){
					csvExport(csvStruct					// �Ώۃf�[�^���
							, "1"						// �G���[�敪
							, index						// �G���[�����s
							, CSV_START_TIME5			// �G���[���ڔԍ�
							, "Expj.Cmt6777"			// �G���[���ږ�
							, new ExpjMessage("AS00019").getMessage(_locale)	// �G���[���b�Z�[�W
							); 
					return false;
				}
			}
			if (!isNull(csvStruct.getEND_TIME5())) {
				// �I������5�A�����ȊO�̏ꍇ
				if (!isDigitChk(csvStruct.getEND_TIME5())){
					csvExport(csvStruct					// �Ώۃf�[�^���
							, "1"						// �G���[�敪
							, index						// �G���[�����s
							, CSV_END_TIME5				// �G���[���ڔԍ�
							, "Expj.Cmt6778"			// �G���[���ږ�
							, new ExpjMessage("AA01503").getMessage(_locale)	// �G���[���b�Z�[�W
							); 
					return false;
				}
				// �I������5�A����2���ȉ��A�܂���5���ȏ�̏ꍇ
				if (csvStruct.getEND_TIME5().length() >= 5 || csvStruct.getEND_TIME5().length() <= 2){
					csvExport(csvStruct					// �Ώۃf�[�^���
							, "1"						// �G���[�敪
							, index						// �G���[�����s
							, CSV_END_TIME5				// �G���[���ڔԍ�
							, "Expj.Cmt6778"			// �G���[���ږ�
							, new ExpjMessage("AS00019").getMessage(_locale)	// �G���[���b�Z�[�W
							); 
					return false;
				}
			}
			// ��Ƌ敪5�A�����ȊO�̏ꍇ
			if (!isIntegerChk(csvStruct.getOPR_TYP5())){
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_OPR_TYP5				// �G���[���ڔԍ�
						, "Expj.Cmt6779"			// �G���[���ږ�
						, new ExpjMessage("AA01502").getMessage(_locale)	// �G���[���b�Z�[�W
						); 
				return false;
			}
			// ��Ƌ敪5�A���� 3���ȏ�̏ꍇ
			if (csvStruct.getOPR_TYP5().length() >= 3) {
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_OPR_TYP5				// �G���[���ڔԍ�
						, "Expj.Cmt6779"			// �G���[���ږ�
						, new ExpjMessage("AA01501").getMessage(_locale)	// �G���[���b�Z�[�W
						); 
				return false;
			}
			// �s��Ɨ��R�敪5�A�����ȊO�̏ꍇ
			if (!isIntegerChk(csvStruct.getUN_OPR_CAUSE_TYP5())){
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_UN_OPR_CAUSE_TYP5		// �G���[���ڔԍ�
						, "Expj.Cmt6780"			// �G���[���ږ�
						, new ExpjMessage("AA01502").getMessage(_locale)	// �G���[���b�Z�[�W
						); 
				return false;
			}
			// �s��Ɨ��R�敪5�A���� 3���ȏ�̏ꍇ
			if (csvStruct.getUN_OPR_CAUSE_TYP5().length() >= 3) {
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_UN_OPR_CAUSE_TYP5		// �G���[���ڔԍ�
						, "Expj.Cmt6780"			// �G���[���ږ�
						, new ExpjMessage("AA01501").getMessage(_locale)	// �G���[���b�Z�[�W
						); 
				return false;
			}
			// �s��Ǝ��ԁi���j5�A���l�ȊO�̏ꍇ
			if (!isNumChk(csvStruct.getUN_OPR_TIME5())) {
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_UN_OPR_TIME5			// �G���[���ڔԍ�
						, "Expj.Cmt6781"			// �G���[���ږ�
						, new ExpjMessage("AA01503").getMessage(_locale)	// �G���[���b�Z�[�W
						); 
				return false;
			}
			// �s��Ǝ��ԁi���j5�A0�����̏ꍇ
			if (Calculate.compare(csvStruct.getUN_OPR_TIME5(), "0") == -1){
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_UN_OPR_TIME5			// �G���[���ڔԍ�
						, "Expj.Cmt6781"			// �G���[���ږ�
						, new ExpjMessage("UD60167").getMessage(_locale)	// �G���[���b�Z�[�W
						);  
				return false;
			}
			// �s��Ǝ��ԁi���j5�A9999�`0�͈͈ȊO�̏ꍇ
			if (!isNotInNumRange(csvStruct.getUN_OPR_TIME5(), 4, 0)) {
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, index						// �G���[�����s
						, CSV_UN_OPR_TIME5			// �G���[���ڔԍ�
						, "Expj.Cmt6781"			// �G���[���ږ�
						, new ExpjMessage("AA01501").getMessage(_locale)	// �G���[���b�Z�[�W
						);  
				return false;
			}
			if (!isNull(csvStruct.getREMARKS5())) {
				// �s��Ɨ��R���l5�A����81���ȏ�̏ꍇ
				if (strLengthChk(csvStruct.getREMARKS5()) >= 81) {
					csvExport(csvStruct					// �Ώۃf�[�^���
							, "1"						// �G���[�敪
							, index						// �G���[�����s
							, CSV_REMARKS5				// �G���[���ڔԍ�
							, "Expj.Cmt6782"			// �G���[���ږ�
							, new ExpjMessage("AA01501").getMessage(_locale)	// �G���[���b�Z�[�W
							); 
					return false;
				}
				// �s��Ɨ��R���l5�A�֑����������͂���Ă����ꍇ
				if (chkHankaku(csvStruct.getREMARKS5())) {
					csvExport(csvStruct					// �Ώۃf�[�^���
							, "1"						// �G���[�敪
							, index						// �G���[�����s
							, CSV_REMARKS5				// �G���[���ڔԍ�
							, "Expj.Cmt6782"			// �G���[���ږ�
							, new ExpjMessage("AA01524").getMessage(_locale)	// �G���[���b�Z�[�W
							); 
					return false;
				}
			}			
		} catch (Exception e) {
			 ExpjMessage emsg = new ExpjMessage( "ZZ01106");
			 sysLog.severe(emsg, getsysUSER_CD());
			 ExpjException ee = new ExpjException(e, emsg);
			 ee.setLocale(CoreTools.getLocale(getsysUSER_CD()));
			 throw ee;
		}
		return true;
	}
		
	/**
	 * �b�r�u�f�[�^�擾�A���X�g�f�[�^���A����敪�̔���
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
				AD0140010Struct structCsv = null;
				Vector v = null;
				for (int i = 0; i < strsCsvData.length; i++) {
					if (strsCsvData[i].length() == 0) {
						// �����𔲂���B
						break;
					}
					// ���R�[�h�����ږ��ɂ΂炷
					v = csvReader.importCSVLine(strsCsvData[i]);
					if (v != null ) {
						structCsv = new AD0140010Struct();
						if (CSV_NECESSARY_COLUMN == v.size()) {
							// ����敪
							structCsv.setDAILY_WORK_REPORT_TYP((String)v.get(CSV_DAILY_WORK_REPORT_TYP)); 
							
							// ����敪 2:�l����
							// ���[�U�R�[�h
							structCsv.setUSER_CD2((String)v.get(CSV_USER_CD2)); 
							// ��Ɠ�
							structCsv.setOPR_DATE2((String)v.get(CSV_OPR_DATE2));
							// �Ζ��V�t�g
							structCsv.setWORK_SHIFT_CODE2((String)v.get(CSV_WORK_SHIFT_CODE2)); 
							// ��Ƌ�R�[�h�P
							structCsv.setWS_CD1((String)v.get(CSV_WS_CD1)); 
							// �J�n�����P
							structCsv.setSTART_TIME1((String)v.get(CSV_START_TIME1)); 
							// �I�������P
							structCsv.setEND_TIME1((String)v.get(CSV_END_TIME1)); 
							// ��Ƌ敪�P
							if(isNull((String)v.get(CSV_OPR_TYP1))) {
								structCsv.setOPR_TYP1("0"); 
							} else {
								structCsv.setOPR_TYP1((String)v.get(CSV_OPR_TYP1)); 
							}
							// �s��Ɨ��R�P
							if (isNull((String)v.get(CSV_UN_OPR_CAUSE_TYP1))) {
								structCsv.setUN_OPR_CAUSE_TYP1("0");
							} else {
								structCsv.setUN_OPR_CAUSE_TYP1((String)v.get(CSV_UN_OPR_CAUSE_TYP1)); 
							}
							// �s��Ǝ��ԁi���j�P
							if (isNull((String)v.get(CSV_UN_OPR_TIME1))) {
								structCsv.setUN_OPR_TIME1("0"); 
							} else {
								structCsv.setUN_OPR_TIME1((String)v.get(CSV_UN_OPR_TIME1)); 
							}
							// �s��Ɨ��R���l�P
							structCsv.setREMARKS1((String)v.get(CSV_REMARKS1)); 
							// ��Ƌ�R�[�h�Q
							structCsv.setWS_CD2((String)v.get(CSV_WS_CD2)); 
							// �J�n�����Q
							structCsv.setSTART_TIME2((String)v.get(CSV_START_TIME2)); 
							// �I�������Q
							structCsv.setEND_TIME2((String)v.get(CSV_END_TIME2)); 
							// ��Ƌ敪�Q
							if(isNull((String)v.get(CSV_OPR_TYP2))) {
								structCsv.setOPR_TYP2("0"); 
							} else {
								structCsv.setOPR_TYP2((String)v.get(CSV_OPR_TYP2)); 
							}
							// �s��Ɨ��R�Q
							if (isNull((String)v.get(CSV_UN_OPR_CAUSE_TYP2))) {
								structCsv.setUN_OPR_CAUSE_TYP2("0");
							} else {
								structCsv.setUN_OPR_CAUSE_TYP2((String)v.get(CSV_UN_OPR_CAUSE_TYP2));
							}
							// �s��Ǝ��ԁi���j�Q
							if (isNull((String)v.get(CSV_UN_OPR_TIME2))) {
								structCsv.setUN_OPR_TIME2("0"); 
							} else {
								structCsv.setUN_OPR_TIME2((String)v.get(CSV_UN_OPR_TIME2)); 
							}
							// �s��Ɨ��R���l�Q
							structCsv.setREMARKS2((String)v.get(CSV_REMARKS2)); 
							// ��Ƌ�R�[�h�R
							structCsv.setWS_CD3((String)v.get(CSV_WS_CD3)); 
							// �J�n�����R
							structCsv.setSTART_TIME3((String)v.get(CSV_START_TIME3)); 
							// �I�������R
							structCsv.setEND_TIME3((String)v.get(CSV_END_TIME3)); 
							// ��Ƌ敪�R
							if(isNull((String)v.get(CSV_OPR_TYP3))) {
								structCsv.setOPR_TYP3("0"); 
							} else {
								structCsv.setOPR_TYP3((String)v.get(CSV_OPR_TYP3)); 
							}
							// �s��Ɨ��R�R
							if (isNull((String)v.get(CSV_UN_OPR_CAUSE_TYP3))) {
								structCsv.setUN_OPR_CAUSE_TYP3("0"); 
							} else {
								structCsv.setUN_OPR_CAUSE_TYP3((String)v.get(CSV_UN_OPR_CAUSE_TYP3)); 
							}
							// �s��Ǝ��ԁi���j�R
							if (isNull((String)v.get(CSV_UN_OPR_TIME3))) {
								structCsv.setUN_OPR_TIME3("0"); 
							} else {
								structCsv.setUN_OPR_TIME3((String)v.get(CSV_UN_OPR_TIME3)); 
							}
							// �s��Ɨ��R���l�R
							structCsv.setREMARKS3((String)v.get(CSV_REMARKS3)); 
							// ��Ƌ�R�[�h�S
							structCsv.setWS_CD4((String)v.get(CSV_WS_CD4)); 
							// �J�n�����S
							structCsv.setSTART_TIME4((String)v.get(CSV_START_TIME4)); 
							// �I�������S
							structCsv.setEND_TIME4((String)v.get(CSV_END_TIME4)); 
							// ��Ƌ敪�S
							if(isNull((String)v.get(CSV_OPR_TYP4))) {
								structCsv.setOPR_TYP4("0"); 
							} else {
								structCsv.setOPR_TYP4((String)v.get(CSV_OPR_TYP4)); 
							}
							// �s��Ɨ��R�S
							if (isNull((String)v.get(CSV_UN_OPR_CAUSE_TYP4))) {
								structCsv.setUN_OPR_CAUSE_TYP4("0"); 
							} else {
								structCsv.setUN_OPR_CAUSE_TYP4((String)v.get(CSV_UN_OPR_CAUSE_TYP4)); 
							}
							// �s��Ǝ��ԁi���j�S
							if (isNull((String)v.get(CSV_UN_OPR_TIME4))) {
								structCsv.setUN_OPR_TIME4("0"); 
							} else {
								structCsv.setUN_OPR_TIME4((String)v.get(CSV_UN_OPR_TIME4));
							}
							// �s��Ɨ��R���l�S
							structCsv.setREMARKS4((String)v.get(CSV_REMARKS4));
							// ��Ƌ�R�[�h�T
							structCsv.setWS_CD5((String)v.get(CSV_WS_CD5)); 
							// �J�n�����T
							structCsv.setSTART_TIME5((String)v.get(CSV_START_TIME5));
							// �I�������T
							structCsv.setEND_TIME5((String)v.get(CSV_END_TIME5)); 
							// ��Ƌ敪�T
							if(isNull((String)v.get(CSV_OPR_TYP5))) {
								structCsv.setOPR_TYP5("0"); 
							} else {
								structCsv.setOPR_TYP5((String)v.get(CSV_OPR_TYP5)); 
							}
							// �s��Ɨ��R�T
							if (isNull((String)v.get(CSV_UN_OPR_CAUSE_TYP5))) {
								structCsv.setUN_OPR_CAUSE_TYP5("0");
							} else {
								structCsv.setUN_OPR_CAUSE_TYP5((String)v.get(CSV_UN_OPR_CAUSE_TYP5));
							}
							// �s��Ǝ��ԁi���j�T
							if (isNull((String)v.get(CSV_UN_OPR_TIME5))) {
								structCsv.setUN_OPR_TIME5("0"); 
							} else {
								structCsv.setUN_OPR_TIME5((String)v.get(CSV_UN_OPR_TIME5)); 
							}
							// �s��Ɨ��R���l�T
							structCsv.setREMARKS5((String)v.get(CSV_REMARKS5));
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
			throw new ExpjException();
		}
		return listCsv;
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
				AD0140010Struct cvsStruct = (AD0140010Struct)csvList.get(i);
//				if ("1".equals(cvsStruct.getDAILY_WORK_REPORT_TYP())) {
//					//����敪 1:��Ɠ���̓o�^
//					rtnFlg = workCsvDataInsert(cvsStruct, i + 1);
//				} else {
					//����敪 2:�l����̓o�^
					rtnFlg = personCsvDataInsert(cvsStruct, i + 1);
//				}
				if(!rtnFlg) {
					conn.rollback();
					break;
				}
			}
			conn.commit();
			return rtnFlg;
		} catch (Exception e) {
			conn.rollback();;
			throw new ExpjException();
		}
	}
	
	
	/**
	 * CSV�t�F�C�����e�́A�l����̓o�^����
	 * @param csvStruct�@csv�f�[�^
	 * @param lineNo �s�ԍ�
	 * @throws ExpjException 
	 */
	private boolean personCsvDataInsert(AD0140010Struct csvStruct, int lineNo) throws ExpjException {
		try {
			// �d���`�F�b�N(����1)
			csvStruct.setSTART_TIME6(csvStruct.getSTART_TIME1());
			csvStruct.setEND_TIME6(csvStruct.getEND_TIME1());
			if (compareHm(csvStruct.getSTART_TIME6(), csvStruct.getEND_TIME6()) > 0) {
				csvStruct.setTIME_FLG2("1");
			} else {
				csvStruct.setTIME_FLG2("2");
			}
			List tempList = entity.mUT_DAILY_WORK_REPORT_2.read(conn, csvStruct);
			if(!tempList.isEmpty()) {
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "3"						// �G���[�敪
						, lineNo					// �G���[�����s
						, CSV_START_TIME1			// �G���[���ڔԍ�
						, null						// �G���[���ږ�
						, new ExpjMessage("AD61014").getMessage(_locale)	// �G���[���b�Z�[�W
						); 
				return false;
			}
				
			// �d���`�F�b�N(����2)
			if(!isNull(csvStruct.getSTART_TIME2()) && !isNull(csvStruct.getEND_TIME2())) {
				csvStruct.setSTART_TIME6(csvStruct.getSTART_TIME2());
				csvStruct.setEND_TIME6(csvStruct.getEND_TIME2());
				if (compareHm(csvStruct.getSTART_TIME6(), csvStruct.getEND_TIME6()) > 0) {
					csvStruct.setTIME_FLG2("1");
				} else {
					csvStruct.setTIME_FLG2("2");
				}
				tempList = entity.mUT_DAILY_WORK_REPORT_2.read(conn, csvStruct);
				if(!tempList.isEmpty()) {
					csvExport(csvStruct					// �Ώۃf�[�^���
							, "3"						// �G���[�敪
							, lineNo					// �G���[�����s
							, CSV_START_TIME2			// �G���[���ڔԍ�
							, null						// �G���[���ږ�
							, new ExpjMessage("AD61014").getMessage(_locale)	// �G���[���b�Z�[�W
							); 
					return false;
				}
			}
			
			// �d���`�F�b�N(����3)
			if(!isNull(csvStruct.getSTART_TIME3()) && !isNull(csvStruct.getEND_TIME3())) {
				csvStruct.setSTART_TIME6(csvStruct.getSTART_TIME3());
				csvStruct.setEND_TIME6(csvStruct.getEND_TIME3());
				if (compareHm(csvStruct.getSTART_TIME6(), csvStruct.getEND_TIME6()) > 0) {
					csvStruct.setTIME_FLG2("1");
				} else {
					csvStruct.setTIME_FLG2("2");
				}
				tempList = entity.mUT_DAILY_WORK_REPORT_2.read(conn, csvStruct);
				if(!tempList.isEmpty()) {
					csvExport(csvStruct					// �Ώۃf�[�^���
							, "3"						// �G���[�敪
							, lineNo					// �G���[�����s
							, CSV_START_TIME3			// �G���[���ڔԍ�
							, null						// �G���[���ږ�
							, new ExpjMessage("AD61014").getMessage(_locale)	// �G���[���b�Z�[�W
							); 
					return false;
				}
			}
			
			// �d���`�F�b�N(����4)
			if(!isNull(csvStruct.getSTART_TIME4()) && !isNull(csvStruct.getEND_TIME4())) {
				csvStruct.setSTART_TIME6(csvStruct.getSTART_TIME4());
				csvStruct.setEND_TIME6(csvStruct.getEND_TIME4());
				if (compareHm(csvStruct.getSTART_TIME6(), csvStruct.getEND_TIME6()) > 0) {
					csvStruct.setTIME_FLG2("1");
				} else {
					csvStruct.setTIME_FLG2("2");
				}
				tempList = entity.mUT_DAILY_WORK_REPORT_2.read(conn, csvStruct);
				if(!tempList.isEmpty()) {
					csvExport(csvStruct					// �Ώۃf�[�^���
							, "3"						// �G���[�敪
							, lineNo					// �G���[�����s
							, CSV_START_TIME4			// �G���[���ڔԍ�
							, null						// �G���[���ږ�
							, new ExpjMessage("AD61014").getMessage(_locale)	// �G���[���b�Z�[�W
							); 
					return false;
				}
			}
			
			// �d���`�F�b�N(����5)
			if(!isNull(csvStruct.getSTART_TIME5()) && !isNull(csvStruct.getEND_TIME5())) {
				csvStruct.setSTART_TIME6(csvStruct.getSTART_TIME5());
				csvStruct.setEND_TIME6(csvStruct.getEND_TIME5());
				if (compareHm(csvStruct.getSTART_TIME6(), csvStruct.getEND_TIME6()) > 0) {
					csvStruct.setTIME_FLG2("1");
				} else {
					csvStruct.setTIME_FLG2("2");
				}
				tempList = entity.mUT_DAILY_WORK_REPORT_2.read(conn, csvStruct);
				if(!tempList.isEmpty()) {
					csvExport(csvStruct					// �Ώۃf�[�^���
							, "3"						// �G���[�敪
							, lineNo					// �G���[�����s
							, CSV_START_TIME5			// �G���[���ڔԍ�
							, null						// �G���[���ږ�
							, new ExpjMessage("AD61014").getMessage(_locale)	// �G���[���b�Z�[�W
							); 
					return false;
				}
			}
			
			// ����l�`�F�b�N
			List sumOprTimeList = entity.mselectTOTAL_OPR_TIME.read(conn, csvStruct);
			String totalOprTime = ((AD0140010Struct)sumOprTimeList.get(0)).getTOTAL_OPR_TIME();
			if (Calculate.compare(Calculate.add(totalOprTime, csvStruct.getTOTAL_OPR_TIME()), _MAX_OPR_TIME) > 0) {
				// <�G���[> AD61012 �y��Ǝ��Ԃ�����𒴂��Ă��܂��B�z
				csvExport(csvStruct					// �Ώۃf�[�^���
						, "3"						// �G���[�敪
						, lineNo					// �G���[�����s
						, CSV_START_TIME1			// �G���[���ڔԍ�
						, null						// �G���[���ږ�
						, new ExpjMessage("AD61012").getMessage(_locale)	// �G���[���b�Z�[�W
						); 
				return false;
			}
			
			// ��Ɠ���Ǘ��ԍ��̎擾
			List noList = entity.mUSEQ_DAILY_WORK_REPORT_CTL_NO.read(conn, struct);
			csvStruct.setDAILY_WORK_REPORT_CTL_NO(((AD0140010Struct)noList.get(0)).getDAILY_WORK_REPORT_CTL_NO());
//			// ��Ɠ���f�[�^�敪
//			csvStruct.setDAILY_WORK_REPORT_DATA_TYP("0");
			int j = 0;
			for (int i = 0; i < 5; i++) {
				// ��Ƌ�R�[�h�i�P�`�T�j�`���l�P�`�T
				switch (i) {
				case 0:
					// ��Ƌ�R�[�h�P
					csvStruct.setWS_CD(csvStruct.getWS_CD1()); 
					// �J�n�����P
					if(csvStruct.getSTART_TIME1().length() == 3){
						csvStruct.setSTART_TIME("0" + csvStruct.getSTART_TIME1());
					} else {
						csvStruct.setSTART_TIME(csvStruct.getSTART_TIME1());
					}
					// �I�������P
					if(csvStruct.getEND_TIME1().length() == 3){
						csvStruct.setEND_TIME("0" + csvStruct.getEND_TIME1());
					} else {
						csvStruct.setEND_TIME(csvStruct.getEND_TIME1());
					}
					// ��Ƌ敪�P
					csvStruct.setOPR_TYP(csvStruct.getOPR_TYP1()); 
					// �s��Ɨ��R�敪�P
					csvStruct.setUN_OPR_CAUSE_TYP(csvStruct.getUN_OPR_CAUSE_TYP1()); 
					// �s��Ǝ��ԂP
					csvStruct.setUN_OPR_TIME(csvStruct.getUN_OPR_TIME1());
					// ���l�P
					csvStruct.setREMARKS(csvStruct.getREMARKS1()); 
					break;
				case 1:
					if(isNull(csvStruct.getWS_CD2())) {
						continue;
					}
					// ��Ƌ�R�[�h�Q
					csvStruct.setWS_CD(csvStruct.getWS_CD2()); 
					// �J�n�����Q
					if(csvStruct.getSTART_TIME2().length() == 3){
						csvStruct.setSTART_TIME("0" + csvStruct.getSTART_TIME2());
					} else {
						csvStruct.setSTART_TIME(csvStruct.getSTART_TIME2());
					}
					// �I�������Q
					if(csvStruct.getEND_TIME2().length() == 3){
						csvStruct.setEND_TIME("0" + csvStruct.getEND_TIME2());
					} else {
						csvStruct.setEND_TIME(csvStruct.getEND_TIME2());
					}
					// ��Ǝ��ԂQ
					csvStruct.setOPR_TIME(csvStruct.getOPR_TIME2());
					// ��Ƌ敪�Q
					csvStruct.setOPR_TYP(csvStruct.getOPR_TYP2()); 
					// �s��Ɨ��R�敪�Q
					csvStruct.setUN_OPR_CAUSE_TYP(csvStruct.getUN_OPR_CAUSE_TYP2()); 
					// �s��Ǝ��ԂQ
					csvStruct.setUN_OPR_TIME(csvStruct.getUN_OPR_TIME2());
					// ���l�Q
					csvStruct.setREMARKS(csvStruct.getREMARKS2()); 
					break;
				case 2:
					if(isNull(csvStruct.getWS_CD3())) {
						continue;
					}
					// ��Ƌ�R�[�h�R
					csvStruct.setWS_CD(csvStruct.getWS_CD3()); 
					// �J�n�����R
					if(csvStruct.getSTART_TIME3().length() == 3){
						csvStruct.setSTART_TIME("0" + csvStruct.getSTART_TIME3());
					} else {
						csvStruct.setSTART_TIME(csvStruct.getSTART_TIME3());
					}
					// �I�������R
					if(csvStruct.getEND_TIME3().length() == 3){
						csvStruct.setEND_TIME("0" + csvStruct.getEND_TIME3());
					} else {
						csvStruct.setEND_TIME(csvStruct.getEND_TIME3());
					}
					// ��Ǝ��ԂR
					csvStruct.setOPR_TIME(csvStruct.getOPR_TIME3());
					// ��Ƌ敪�R
					csvStruct.setOPR_TYP(csvStruct.getOPR_TYP3()); 
					// �s��Ɨ��R�敪�R
					csvStruct.setUN_OPR_CAUSE_TYP(csvStruct.getUN_OPR_CAUSE_TYP3()); 
					// �s��Ǝ��ԂR
					csvStruct.setUN_OPR_TIME(csvStruct.getUN_OPR_TIME3());
					// ���l�R
					csvStruct.setREMARKS(csvStruct.getREMARKS3()); 
					break;
				case 3:
					if(isNull(csvStruct.getWS_CD4())) {
						continue;
					}
					// ��Ƌ�R�[�h�S
					csvStruct.setWS_CD(csvStruct.getWS_CD4()); 
					// �J�n�����S
					if(csvStruct.getSTART_TIME4().length() == 3){
						csvStruct.setSTART_TIME("0" + csvStruct.getSTART_TIME4());
					} else {
						csvStruct.setSTART_TIME(csvStruct.getSTART_TIME4());
					}
					// �I�������S
					if(csvStruct.getEND_TIME4().length() == 3){
						csvStruct.setEND_TIME("0" + csvStruct.getEND_TIME4());
					} else {
						csvStruct.setEND_TIME(csvStruct.getEND_TIME4());
					}
					// ��Ǝ��ԂS
					csvStruct.setOPR_TIME(csvStruct.getOPR_TIME4());
					// ��Ƌ敪�S
					csvStruct.setOPR_TYP(csvStruct.getOPR_TYP4()); 
					// �s��Ɨ��R�敪�S
					csvStruct.setUN_OPR_CAUSE_TYP(csvStruct.getUN_OPR_CAUSE_TYP4()); 
					// �s��Ǝ��ԂS
					csvStruct.setUN_OPR_TIME(csvStruct.getUN_OPR_TIME4());
					// ���l�S
					csvStruct.setREMARKS(csvStruct.getREMARKS4()); 
					break;
				case 4:
					if(isNull(csvStruct.getWS_CD5())) {
						continue;
					}
					// ��Ƌ�R�[�h�T
					csvStruct.setWS_CD(csvStruct.getWS_CD5()); 
					// �J�n�����T
					if(csvStruct.getSTART_TIME5().length() == 3){
						csvStruct.setSTART_TIME("0" + csvStruct.getSTART_TIME5());
					} else {
						csvStruct.setSTART_TIME(csvStruct.getSTART_TIME5());
					}
					// �I�������T
					if(csvStruct.getEND_TIME5().length() == 3){
						csvStruct.setEND_TIME("0" + csvStruct.getEND_TIME5());
					} else {
						csvStruct.setEND_TIME(csvStruct.getEND_TIME5());
					}
					// ��Ǝ��ԂT
					csvStruct.setOPR_TIME(csvStruct.getOPR_TIME5());
					// ��Ƌ敪�T
					csvStruct.setOPR_TYP(csvStruct.getOPR_TYP5()); 
					// �s��Ɨ��R�敪�T
					csvStruct.setUN_OPR_CAUSE_TYP(csvStruct.getUN_OPR_CAUSE_TYP5()); 
					// �s��Ǝ��ԂT
					csvStruct.setUN_OPR_TIME(csvStruct.getUN_OPR_TIME5());
					// ���l�T
					csvStruct.setREMARKS(csvStruct.getREMARKS5()); 
					break;
				}
				// �s�ԍ�
				csvStruct.setSEQ_NO(String.valueOf(++j)); 
				// ���[�U�R�[�h
				csvStruct.setUSER_CD(csvStruct.getUSER_CD2());
				// ��Ɠ�
				csvStruct.setOPR_DATE(csvStruct.getOPR_DATE2());
				// �Ζ��V�t�g�R�[�h
				csvStruct.setWORK_SHIFT_CODE(csvStruct.getWORK_SHIFT_CODE2());
				
				csvStruct.setsUser_ID(getsysUSER_CD());
				//�o�^���s
				entity.minsert.create(conn, csvStruct);
			}
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			throw new ExpjException();
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0140");
		logger.entering("AD0140010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");
			//{{user_implement_dev:<controlBrowse>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlBrowse>
		logger.exiting("AD0140010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");

		return;
	}

	/**
	 * �捞�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCsvIn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0140");
		logger.entering("AD0140010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");
			//{{user_implement_dev:<controlCsvIn>
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
						// �G���[�E���[�j���O���Ȃ��ꍇ
						if (_intWarningCount == 0) {
							setInfoMessage("AA01514", String.valueOf(_intSuccessCount));
						} else {
							setWarningMessage("AA01515", String.valueOf(_intSuccessCount), String.valueOf(_intWarningCount));
						}
					} else {
						setErrorMessage("AD61018");
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
		logger.exiting("AD0140010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");

		return;
	}

	/**
	 * CSV�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCSVOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0140");
		logger.entering("AD0140010Control"+":USER="+struct.getsUser_ID(),"controlCSVOut");
			//{{user_implement_dev:<controlCSVOut>
		// CSV�o�͕��i��ݒ�
		csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));
		AD0140010Struct errorStruct = null;
		List csv = new ArrayList();	// CSV���
		// CSV�w�b�_�s��CSV���ɒǉ�
		String[] title = {
				 "Expj.Cmt3094"							//�G���[�ӏ�
				,"Expj.Cmt3095"							//�G���[�敪
				,"Expj.Cmt3098"							//�G���[���e
				,"Expj.Cmt6745"						//�G���[����
				,"Expj.Cmt0037"							//�H��
				,"Expj.DAILY_WORK_REPORT_TYP"			//����敪
				,"Expj.USER_CD"							//���[�U�R�[�h
				,"Expj.Cmt5833"							//��Ɠ�
				,"Expj.Cmt6746"						//�Ζ��V�t�g
				,"Expj.CSV_SUB_WS_CD"						//��Ƌ�R�[�h
		};
		csv.add(title);
		// [���].�ꗗ���̃G���[����CSV���ɒǉ�
		for (int i = 0; i < list.size(); i++) {
			errorStruct = (AD0140010Struct)list.get(i);
			String[] date = {
					 errorStruct.getl_ERROR_IN()
					,errorStruct.getl_ERR_TYP()
					,errorStruct.getl_ERR_INFO()
					,errorStruct.getl_ERR_CTR_NM()
					,errorStruct.getl_ERR_PLANT_NO()
					,errorStruct.getl_ERR_DAILY_WORK_REPORT_TYP()
					,replaceSlashSub(errorStruct.getl_ERR_USER_CD())
					,errorStruct.getl_ERR_OPR_DATE()
					,replaceSlashSub(errorStruct.getl_ERR_WORK_SHIFT_CODE())
					,replaceSlashSub(errorStruct.getl_ERR_WS_CD())
			};
			csv.add(date);
		}
		
		// CSV�t�@�C�����쐬
		csvWriter.write(csv, CoreTools.getLocale(struct.getsUser_ID()), true);
		// CSV�t�@�C�����N���C�A���g�ɏo��
		struct.setDOWNLOAD_FILE(getCsvWriter().getFilePath());
	    
                //}}user_implement_dev:<controlCSVOut>
		logger.exiting("AD0140010Control"+":USER="+struct.getsUser_ID(),"controlCSVOut");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0140");
		logger.entering("AD0140010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
		setList(null);
		// ������Ԃ��u������ԁv�ɐݒ�
		setReadStatus(INITIAL);
                //}}user_implement_dev:<controlClear>
		logger.exiting("AD0140010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0140");
		logger.entering("AD0140010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("AD0140010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0140");
		logger.entering("AD0140010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AD0140010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0140");
		logger.entering("AD0140010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		try{
			
			// �Ɩ��^�p���擾
			try {
				DateCtrlStruct dateCtrl = DateCtrlControl.getData(conn, getsysPLANT_CD());
				_businessOprDate = dateCtrl.getBUSINESS_OPR_DATE();
			} catch(DataNotFoundException e) {
				ExpjMessage emsg = new ExpjMessage("AC34080" );
				sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
				ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
				ee.setLocale(CoreTools.getLocale(getsysUSER_CD()));
				setReadStatus(ERROR);
				throw ee;
			}
			
			// �R���{�{�b�N�X�f�[�^�p��
	 		ComboBox combBox = new ComboBox(conn, sysUSER_CD);
			// �R���{�{�b�N�X�̃f�[�^���擾
			_COM_ERR_TYP = combBox.getData("DAILY_WORK_REP_CSV_ERR_TYP_01");
			// ����敪
			_DAILY_WORK_REPORT_TYP_01 = combBox.getData("DAILY_WORK_REPORT_TYP_01");
			// ��Ƌ敪
			_OPR_TYP_CD_01 = combBox.getData("OPR_TYP_CD_01");
			// �s��Ɨ��R
			_UN_OPR_CAUSE_CD_01 = combBox.getData("UN_OPR_CAUSE_CD_01");
			
			// ��Ǝ��Ԃ̏���l
			PrivateConfig privateConfig = new PrivateConfig(conn);
			_MAX_OPR_TIME = privateConfig.getString("WORK_REPORT_MAX_OPR_TIME");
			// �m�V�X�e���p�����[�^�n�����݂��Ȃ�
			if (isNull(_MAX_OPR_TIME)) {
				ExpjMessage emsg = new ExpjMessage("AD61001" );
				sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
				ExpjException ee = new ExpjException(emsg); // �G�N�Z�v�V�����𐶐�
				ee.setLocale(CoreTools.getLocale(getsysUSER_CD()));
				setReadStatus(ERROR);
				throw ee;
			}
		} catch(SQLException e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			ee.setLocale(CoreTools.getLocale(getsysUSER_CD()));
			throw ee;
		} catch(ExpjException e) {
			throw e;
		} catch(Exception e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			ee.setLocale(CoreTools.getLocale(getsysUSER_CD()));
			throw ee;
		} 

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AD0140010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0140");
		logger.entering("AD0140010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
		logger.exiting("AD0140010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// �g���b�Z�[�W�o�͈˗��쐬
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AD0140010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0140010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AD0140010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0140010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AD0140010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0140010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AD0140010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AD0140010Entity entity;
	protected AD0140010Struct struct;
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

		entity = new AD0140010Entity();
		struct = new AD0140010Struct();

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
	 * AD0140010�N���X�̕W���R���X�g���N�^
	 */
	public AD0140010Control() throws BusinessProcessException, FoundationException
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
				AD0140010Struct key = (AD0140010Struct)keyList.get(j);
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
				if(msgKeyType.containsKeyColumn("l_ERR_INFO") && key.getl_ERR_INFO() != null) {
					msgKey.setKeyValue("l_ERR_INFO", key.getl_ERR_INFO());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_CTR_NM") && key.getl_ERR_CTR_NM() != null) {
					msgKey.setKeyValue("l_ERR_CTR_NM", key.getl_ERR_CTR_NM());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_PLANT_NO") && key.getl_ERR_PLANT_NO() != null) {
					msgKey.setKeyValue("l_ERR_PLANT_NO", key.getl_ERR_PLANT_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_DAILY_WORK_REPORT_TYP") && key.getl_ERR_DAILY_WORK_REPORT_TYP() != null) {
					msgKey.setKeyValue("l_ERR_DAILY_WORK_REPORT_TYP", key.getl_ERR_DAILY_WORK_REPORT_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_USER_CD") && key.getl_ERR_USER_CD() != null) {
					msgKey.setKeyValue("l_ERR_USER_CD", key.getl_ERR_USER_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_OPR_DATE") && key.getl_ERR_OPR_DATE() != null) {
					msgKey.setKeyValue("l_ERR_OPR_DATE", key.getl_ERR_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_WORK_SHIFT_CODE") && key.getl_ERR_WORK_SHIFT_CODE() != null) {
					msgKey.setKeyValue("l_ERR_WORK_SHIFT_CODE", key.getl_ERR_WORK_SHIFT_CODE());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_WS_CD") && key.getl_ERR_WS_CD() != null) {
					msgKey.setKeyValue("l_ERR_WS_CD", key.getl_ERR_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_TYP") && key.getl_ERR_TYP() != null) {
					msgKey.setKeyValue("l_ERR_TYP", key.getl_ERR_TYP());
				}
				if(msgKeyType.containsKeyColumn("WORK_SHIFT_CODE2") && key.getWORK_SHIFT_CODE2() != null) {
					msgKey.setKeyValue("WORK_SHIFT_CODE2", key.getWORK_SHIFT_CODE2());
				}
				if(msgKeyType.containsKeyColumn("WS_CD1") && key.getWS_CD1() != null) {
					msgKey.setKeyValue("WS_CD1", key.getWS_CD1());
				}
				if(msgKeyType.containsKeyColumn("START_TIME1") && key.getSTART_TIME1() != null) {
					msgKey.setKeyValue("START_TIME1", key.getSTART_TIME1());
				}
				if(msgKeyType.containsKeyColumn("END_TIME1") && key.getEND_TIME1() != null) {
					msgKey.setKeyValue("END_TIME1", key.getEND_TIME1());
				}
				if(msgKeyType.containsKeyColumn("OPR_TYP1") && key.getOPR_TYP1() != null) {
					msgKey.setKeyValue("OPR_TYP1", key.getOPR_TYP1());
				}
				if(msgKeyType.containsKeyColumn("UN_OPR_CAUSE_TYP1") && key.getUN_OPR_CAUSE_TYP1() != null) {
					msgKey.setKeyValue("UN_OPR_CAUSE_TYP1", key.getUN_OPR_CAUSE_TYP1());
				}
				if(msgKeyType.containsKeyColumn("UN_OPR_TIME1") && key.getUN_OPR_TIME1() != null) {
					msgKey.setKeyValue("UN_OPR_TIME1", key.getUN_OPR_TIME1());
				}
				if(msgKeyType.containsKeyColumn("REMARKS1") && key.getREMARKS1() != null) {
					msgKey.setKeyValue("REMARKS1", key.getREMARKS1());
				}
				if(msgKeyType.containsKeyColumn("WS_CD2") && key.getWS_CD2() != null) {
					msgKey.setKeyValue("WS_CD2", key.getWS_CD2());
				}
				if(msgKeyType.containsKeyColumn("START_TIME2") && key.getSTART_TIME2() != null) {
					msgKey.setKeyValue("START_TIME2", key.getSTART_TIME2());
				}
				if(msgKeyType.containsKeyColumn("END_TIME2") && key.getEND_TIME2() != null) {
					msgKey.setKeyValue("END_TIME2", key.getEND_TIME2());
				}
				if(msgKeyType.containsKeyColumn("OPR_TYP2") && key.getOPR_TYP2() != null) {
					msgKey.setKeyValue("OPR_TYP2", key.getOPR_TYP2());
				}
				if(msgKeyType.containsKeyColumn("UN_OPR_CAUSE_TYP2") && key.getUN_OPR_CAUSE_TYP2() != null) {
					msgKey.setKeyValue("UN_OPR_CAUSE_TYP2", key.getUN_OPR_CAUSE_TYP2());
				}
				if(msgKeyType.containsKeyColumn("UN_OPR_TIME2") && key.getUN_OPR_TIME2() != null) {
					msgKey.setKeyValue("UN_OPR_TIME2", key.getUN_OPR_TIME2());
				}
				if(msgKeyType.containsKeyColumn("REMARKS2") && key.getREMARKS2() != null) {
					msgKey.setKeyValue("REMARKS2", key.getREMARKS2());
				}
				if(msgKeyType.containsKeyColumn("WS_CD3") && key.getWS_CD3() != null) {
					msgKey.setKeyValue("WS_CD3", key.getWS_CD3());
				}
				if(msgKeyType.containsKeyColumn("START_TIME3") && key.getSTART_TIME3() != null) {
					msgKey.setKeyValue("START_TIME3", key.getSTART_TIME3());
				}
				if(msgKeyType.containsKeyColumn("END_TIME3") && key.getEND_TIME3() != null) {
					msgKey.setKeyValue("END_TIME3", key.getEND_TIME3());
				}
				if(msgKeyType.containsKeyColumn("OPR_TYP3") && key.getOPR_TYP3() != null) {
					msgKey.setKeyValue("OPR_TYP3", key.getOPR_TYP3());
				}
				if(msgKeyType.containsKeyColumn("UN_OPR_CAUSE_TYP3") && key.getUN_OPR_CAUSE_TYP3() != null) {
					msgKey.setKeyValue("UN_OPR_CAUSE_TYP3", key.getUN_OPR_CAUSE_TYP3());
				}
				if(msgKeyType.containsKeyColumn("UN_OPR_TIME3") && key.getUN_OPR_TIME3() != null) {
					msgKey.setKeyValue("UN_OPR_TIME3", key.getUN_OPR_TIME3());
				}
				if(msgKeyType.containsKeyColumn("REMARKS3") && key.getREMARKS3() != null) {
					msgKey.setKeyValue("REMARKS3", key.getREMARKS3());
				}
				if(msgKeyType.containsKeyColumn("WS_CD4") && key.getWS_CD4() != null) {
					msgKey.setKeyValue("WS_CD4", key.getWS_CD4());
				}
				if(msgKeyType.containsKeyColumn("START_TIME4") && key.getSTART_TIME4() != null) {
					msgKey.setKeyValue("START_TIME4", key.getSTART_TIME4());
				}
				if(msgKeyType.containsKeyColumn("END_TIME4") && key.getEND_TIME4() != null) {
					msgKey.setKeyValue("END_TIME4", key.getEND_TIME4());
				}
				if(msgKeyType.containsKeyColumn("OPR_TYP4") && key.getOPR_TYP4() != null) {
					msgKey.setKeyValue("OPR_TYP4", key.getOPR_TYP4());
				}
				if(msgKeyType.containsKeyColumn("UN_OPR_CAUSE_TYP4") && key.getUN_OPR_CAUSE_TYP4() != null) {
					msgKey.setKeyValue("UN_OPR_CAUSE_TYP4", key.getUN_OPR_CAUSE_TYP4());
				}
				if(msgKeyType.containsKeyColumn("UN_OPR_TIME4") && key.getUN_OPR_TIME4() != null) {
					msgKey.setKeyValue("UN_OPR_TIME4", key.getUN_OPR_TIME4());
				}
				if(msgKeyType.containsKeyColumn("REMARKS4") && key.getREMARKS4() != null) {
					msgKey.setKeyValue("REMARKS4", key.getREMARKS4());
				}
				if(msgKeyType.containsKeyColumn("WS_CD5") && key.getWS_CD5() != null) {
					msgKey.setKeyValue("WS_CD5", key.getWS_CD5());
				}
				if(msgKeyType.containsKeyColumn("START_TIME5") && key.getSTART_TIME5() != null) {
					msgKey.setKeyValue("START_TIME5", key.getSTART_TIME5());
				}
				if(msgKeyType.containsKeyColumn("END_TIME5") && key.getEND_TIME5() != null) {
					msgKey.setKeyValue("END_TIME5", key.getEND_TIME5());
				}
				if(msgKeyType.containsKeyColumn("OPR_TYP5") && key.getOPR_TYP5() != null) {
					msgKey.setKeyValue("OPR_TYP5", key.getOPR_TYP5());
				}
				if(msgKeyType.containsKeyColumn("UN_OPR_CAUSE_TYP5") && key.getUN_OPR_CAUSE_TYP5() != null) {
					msgKey.setKeyValue("UN_OPR_CAUSE_TYP5", key.getUN_OPR_CAUSE_TYP5());
				}
				if(msgKeyType.containsKeyColumn("UN_OPR_TIME5") && key.getUN_OPR_TIME5() != null) {
					msgKey.setKeyValue("UN_OPR_TIME5", key.getUN_OPR_TIME5());
				}
				if(msgKeyType.containsKeyColumn("REMARKS5") && key.getREMARKS5() != null) {
					msgKey.setKeyValue("REMARKS5", key.getREMARKS5());
				}
				if(msgKeyType.containsKeyColumn("w_COLUMN_FLG") && key.getw_COLUMN_FLG() != null) {
					msgKey.setKeyValue("w_COLUMN_FLG", key.getw_COLUMN_FLG());
				}
				if(msgKeyType.containsKeyColumn("OPR_TYP6") && key.getOPR_TYP6() != null) {
					msgKey.setKeyValue("OPR_TYP6", key.getOPR_TYP6());
				}
				if(msgKeyType.containsKeyColumn("UN_OPR_CAUSE_TYP6") && key.getUN_OPR_CAUSE_TYP6() != null) {
					msgKey.setKeyValue("UN_OPR_CAUSE_TYP6", key.getUN_OPR_CAUSE_TYP6());
				}
				if(msgKeyType.containsKeyColumn("UN_OPR_TIME6") && key.getUN_OPR_TIME6() != null) {
					msgKey.setKeyValue("UN_OPR_TIME6", key.getUN_OPR_TIME6());
				}
				if(msgKeyType.containsKeyColumn("REMARKS6") && key.getREMARKS6() != null) {
					msgKey.setKeyValue("REMARKS6", key.getREMARKS6());
				}
				if(msgKeyType.containsKeyColumn("DAILY_WORK_REPORT_DATA_TYP_NULL") && key.getDAILY_WORK_REPORT_DATA_TYP_NULL() != null) {
					msgKey.setKeyValue("DAILY_WORK_REPORT_DATA_TYP_NULL", key.getDAILY_WORK_REPORT_DATA_TYP_NULL());
				}
				if(msgKeyType.containsKeyColumn("OPR_TIME2") && key.getOPR_TIME2() != null) {
					msgKey.setKeyValue("OPR_TIME2", key.getOPR_TIME2());
				}
				if(msgKeyType.containsKeyColumn("OPR_TIME3") && key.getOPR_TIME3() != null) {
					msgKey.setKeyValue("OPR_TIME3", key.getOPR_TIME3());
				}
				if(msgKeyType.containsKeyColumn("OPR_TIME4") && key.getOPR_TIME4() != null) {
					msgKey.setKeyValue("OPR_TIME4", key.getOPR_TIME4());
				}
				if(msgKeyType.containsKeyColumn("OPR_TIME5") && key.getOPR_TIME5() != null) {
					msgKey.setKeyValue("OPR_TIME5", key.getOPR_TIME5());
				}
				if(msgKeyType.containsKeyColumn("DAILY_WORK_REPORT_CTL_NO") && key.getDAILY_WORK_REPORT_CTL_NO() != null) {
					msgKey.setKeyValue("DAILY_WORK_REPORT_CTL_NO", key.getDAILY_WORK_REPORT_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("SEQ_NO") && key.getSEQ_NO() != null) {
					msgKey.setKeyValue("SEQ_NO", key.getSEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("DAILY_WORK_REPORT_TYP") && key.getDAILY_WORK_REPORT_TYP() != null) {
					msgKey.setKeyValue("DAILY_WORK_REPORT_TYP", key.getDAILY_WORK_REPORT_TYP());
				}
				if(msgKeyType.containsKeyColumn("USER_CD") && key.getUSER_CD() != null) {
					msgKey.setKeyValue("USER_CD", key.getUSER_CD());
				}
				if(msgKeyType.containsKeyColumn("OPR_DATE") && key.getOPR_DATE() != null) {
					msgKey.setKeyValue("OPR_DATE", key.getOPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("WORK_SHIFT_CODE") && key.getWORK_SHIFT_CODE() != null) {
					msgKey.setKeyValue("WORK_SHIFT_CODE", key.getWORK_SHIFT_CODE());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("START_TIME") && key.getSTART_TIME() != null) {
					msgKey.setKeyValue("START_TIME", key.getSTART_TIME());
				}
				if(msgKeyType.containsKeyColumn("END_TIME") && key.getEND_TIME() != null) {
					msgKey.setKeyValue("END_TIME", key.getEND_TIME());
				}
				if(msgKeyType.containsKeyColumn("OPR_TIME") && key.getOPR_TIME() != null) {
					msgKey.setKeyValue("OPR_TIME", key.getOPR_TIME());
				}
				if(msgKeyType.containsKeyColumn("OPR_TYP") && key.getOPR_TYP() != null) {
					msgKey.setKeyValue("OPR_TYP", key.getOPR_TYP());
				}
				if(msgKeyType.containsKeyColumn("UN_OPR_CAUSE_TYP") && key.getUN_OPR_CAUSE_TYP() != null) {
					msgKey.setKeyValue("UN_OPR_CAUSE_TYP", key.getUN_OPR_CAUSE_TYP());
				}
				if(msgKeyType.containsKeyColumn("UN_OPR_TIME") && key.getUN_OPR_TIME() != null) {
					msgKey.setKeyValue("UN_OPR_TIME", key.getUN_OPR_TIME());
				}
				if(msgKeyType.containsKeyColumn("REMARKS") && key.getREMARKS() != null) {
					msgKey.setKeyValue("REMARKS", key.getREMARKS());
				}
				if(msgKeyType.containsKeyColumn("COUNT") && key.getCOUNT() != null) {
					msgKey.setKeyValue("COUNT", key.getCOUNT());
				}
				if(msgKeyType.containsKeyColumn("TIME_FLG1") && key.getTIME_FLG1() != null) {
					msgKey.setKeyValue("TIME_FLG1", key.getTIME_FLG1());
				}
				if(msgKeyType.containsKeyColumn("USER_CD2") && key.getUSER_CD2() != null) {
					msgKey.setKeyValue("USER_CD2", key.getUSER_CD2());
				}
				if(msgKeyType.containsKeyColumn("OPR_DATE2") && key.getOPR_DATE2() != null) {
					msgKey.setKeyValue("OPR_DATE2", key.getOPR_DATE2());
				}
				if(msgKeyType.containsKeyColumn("TIME_FLG2") && key.getTIME_FLG2() != null) {
					msgKey.setKeyValue("TIME_FLG2", key.getTIME_FLG2());
				}
				if(msgKeyType.containsKeyColumn("START_TIME6") && key.getSTART_TIME6() != null) {
					msgKey.setKeyValue("START_TIME6", key.getSTART_TIME6());
				}
				if(msgKeyType.containsKeyColumn("END_TIME6") && key.getEND_TIME6() != null) {
					msgKey.setKeyValue("END_TIME6", key.getEND_TIME6());
				}
				if(msgKeyType.containsKeyColumn("HOLIDAY_FLG") && key.getHOLIDAY_FLG() != null) {
					msgKey.setKeyValue("HOLIDAY_FLG", key.getHOLIDAY_FLG());
				}
				if(msgKeyType.containsKeyColumn("OPR_DATE3") && key.getOPR_DATE3() != null) {
					msgKey.setKeyValue("OPR_DATE3", key.getOPR_DATE3());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD2") && key.getPLANT_CD2() != null) {
					msgKey.setKeyValue("PLANT_CD2", key.getPLANT_CD2());
				}
				if(msgKeyType.containsKeyColumn("WORK_SHIFT_CODE3") && key.getWORK_SHIFT_CODE3() != null) {
					msgKey.setKeyValue("WORK_SHIFT_CODE3", key.getWORK_SHIFT_CODE3());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD") && key.getOPR_INST_CD() != null) {
					msgKey.setKeyValue("OPR_INST_CD", key.getOPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("WS_CD6") && key.getWS_CD6() != null) {
					msgKey.setKeyValue("WS_CD6", key.getWS_CD6());
				}
				if(msgKeyType.containsKeyColumn("TARGET_PLANT_CD") && key.getTARGET_PLANT_CD() != null) {
					msgKey.setKeyValue("TARGET_PLANT_CD", key.getTARGET_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("TARGET_ITEM_NO") && key.getTARGET_ITEM_NO() != null) {
					msgKey.setKeyValue("TARGET_ITEM_NO", key.getTARGET_ITEM_NO());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_OPR_TIME") && key.getTOTAL_OPR_TIME() != null) {
					msgKey.setKeyValue("TOTAL_OPR_TIME", key.getTOTAL_OPR_TIME());
				}
				if(msgKeyType.containsKeyColumn("PVC2LOGMODE") && key.getPVC2LOGMODE() != null) {
					msgKey.setKeyValue("PVC2LOGMODE", key.getPVC2LOGMODE());
				}
				if(msgKeyType.containsKeyColumn("PVC2OUTPUTMODE") && key.getPVC2OUTPUTMODE() != null) {
					msgKey.setKeyValue("PVC2OUTPUTMODE", key.getPVC2OUTPUTMODE());
				}
				if(msgKeyType.containsKeyColumn("PVC2OUTPUTPATH") && key.getPVC2OUTPUTPATH() != null) {
					msgKey.setKeyValue("PVC2OUTPUTPATH", key.getPVC2OUTPUTPATH());
				}
				if(msgKeyType.containsKeyColumn("PVC2OUTPUTNAME") && key.getPVC2OUTPUTNAME() != null) {
					msgKey.setKeyValue("PVC2OUTPUTNAME", key.getPVC2OUTPUTNAME());
				}
				if(msgKeyType.containsKeyColumn("PVC2USERID") && key.getPVC2USERID() != null) {
					msgKey.setKeyValue("PVC2USERID", key.getPVC2USERID());
				}
				if(msgKeyType.containsKeyColumn("PVC2BUSINESSNAME") && key.getPVC2BUSINESSNAME() != null) {
					msgKey.setKeyValue("PVC2BUSINESSNAME", key.getPVC2BUSINESSNAME());
				}
				if(msgKeyType.containsKeyColumn("PVC2PLANTCD") && key.getPVC2PLANTCD() != null) {
					msgKey.setKeyValue("PVC2PLANTCD", key.getPVC2PLANTCD());
				}
				if(msgKeyType.containsKeyColumn("RETURN_MESSAGE") && key.getRETURN_MESSAGE() != null) {
					msgKey.setKeyValue("RETURN_MESSAGE", key.getRETURN_MESSAGE());
				}
				if(msgKeyType.containsKeyColumn("RETURN_STATUS") && key.getRETURN_STATUS() != null) {
					msgKey.setKeyValue("RETURN_STATUS", key.getRETURN_STATUS());
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
					AD0140010Struct key = new AD0140010Struct();
					if(msgKeyType.containsKeyColumn("FileName")) {
						key.setFileName(msgKey.getKeyValue("FileName"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("l_ERROR_IN")) {
						key.setl_ERROR_IN(msgKey.getKeyValue("l_ERROR_IN"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_INFO")) {
						key.setl_ERR_INFO(msgKey.getKeyValue("l_ERR_INFO"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_CTR_NM")) {
						key.setl_ERR_CTR_NM(msgKey.getKeyValue("l_ERR_CTR_NM"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_PLANT_NO")) {
						key.setl_ERR_PLANT_NO(msgKey.getKeyValue("l_ERR_PLANT_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_DAILY_WORK_REPORT_TYP")) {
						key.setl_ERR_DAILY_WORK_REPORT_TYP(msgKey.getKeyValue("l_ERR_DAILY_WORK_REPORT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_USER_CD")) {
						key.setl_ERR_USER_CD(msgKey.getKeyValue("l_ERR_USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_OPR_DATE")) {
						key.setl_ERR_OPR_DATE(msgKey.getKeyValue("l_ERR_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_WORK_SHIFT_CODE")) {
						key.setl_ERR_WORK_SHIFT_CODE(msgKey.getKeyValue("l_ERR_WORK_SHIFT_CODE"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_WS_CD")) {
						key.setl_ERR_WS_CD(msgKey.getKeyValue("l_ERR_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_TYP")) {
						key.setl_ERR_TYP(msgKey.getKeyValue("l_ERR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("WORK_SHIFT_CODE2")) {
						key.setWORK_SHIFT_CODE2(msgKey.getKeyValue("WORK_SHIFT_CODE2"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD1")) {
						key.setWS_CD1(msgKey.getKeyValue("WS_CD1"));
					}
					if(msgKeyType.containsKeyColumn("START_TIME1")) {
						key.setSTART_TIME1(msgKey.getKeyValue("START_TIME1"));
					}
					if(msgKeyType.containsKeyColumn("END_TIME1")) {
						key.setEND_TIME1(msgKey.getKeyValue("END_TIME1"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TYP1")) {
						key.setOPR_TYP1(msgKey.getKeyValue("OPR_TYP1"));
					}
					if(msgKeyType.containsKeyColumn("UN_OPR_CAUSE_TYP1")) {
						key.setUN_OPR_CAUSE_TYP1(msgKey.getKeyValue("UN_OPR_CAUSE_TYP1"));
					}
					if(msgKeyType.containsKeyColumn("UN_OPR_TIME1")) {
						key.setUN_OPR_TIME1(msgKey.getKeyValue("UN_OPR_TIME1"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS1")) {
						key.setREMARKS1(msgKey.getKeyValue("REMARKS1"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD2")) {
						key.setWS_CD2(msgKey.getKeyValue("WS_CD2"));
					}
					if(msgKeyType.containsKeyColumn("START_TIME2")) {
						key.setSTART_TIME2(msgKey.getKeyValue("START_TIME2"));
					}
					if(msgKeyType.containsKeyColumn("END_TIME2")) {
						key.setEND_TIME2(msgKey.getKeyValue("END_TIME2"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TYP2")) {
						key.setOPR_TYP2(msgKey.getKeyValue("OPR_TYP2"));
					}
					if(msgKeyType.containsKeyColumn("UN_OPR_CAUSE_TYP2")) {
						key.setUN_OPR_CAUSE_TYP2(msgKey.getKeyValue("UN_OPR_CAUSE_TYP2"));
					}
					if(msgKeyType.containsKeyColumn("UN_OPR_TIME2")) {
						key.setUN_OPR_TIME2(msgKey.getKeyValue("UN_OPR_TIME2"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS2")) {
						key.setREMARKS2(msgKey.getKeyValue("REMARKS2"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD3")) {
						key.setWS_CD3(msgKey.getKeyValue("WS_CD3"));
					}
					if(msgKeyType.containsKeyColumn("START_TIME3")) {
						key.setSTART_TIME3(msgKey.getKeyValue("START_TIME3"));
					}
					if(msgKeyType.containsKeyColumn("END_TIME3")) {
						key.setEND_TIME3(msgKey.getKeyValue("END_TIME3"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TYP3")) {
						key.setOPR_TYP3(msgKey.getKeyValue("OPR_TYP3"));
					}
					if(msgKeyType.containsKeyColumn("UN_OPR_CAUSE_TYP3")) {
						key.setUN_OPR_CAUSE_TYP3(msgKey.getKeyValue("UN_OPR_CAUSE_TYP3"));
					}
					if(msgKeyType.containsKeyColumn("UN_OPR_TIME3")) {
						key.setUN_OPR_TIME3(msgKey.getKeyValue("UN_OPR_TIME3"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS3")) {
						key.setREMARKS3(msgKey.getKeyValue("REMARKS3"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD4")) {
						key.setWS_CD4(msgKey.getKeyValue("WS_CD4"));
					}
					if(msgKeyType.containsKeyColumn("START_TIME4")) {
						key.setSTART_TIME4(msgKey.getKeyValue("START_TIME4"));
					}
					if(msgKeyType.containsKeyColumn("END_TIME4")) {
						key.setEND_TIME4(msgKey.getKeyValue("END_TIME4"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TYP4")) {
						key.setOPR_TYP4(msgKey.getKeyValue("OPR_TYP4"));
					}
					if(msgKeyType.containsKeyColumn("UN_OPR_CAUSE_TYP4")) {
						key.setUN_OPR_CAUSE_TYP4(msgKey.getKeyValue("UN_OPR_CAUSE_TYP4"));
					}
					if(msgKeyType.containsKeyColumn("UN_OPR_TIME4")) {
						key.setUN_OPR_TIME4(msgKey.getKeyValue("UN_OPR_TIME4"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS4")) {
						key.setREMARKS4(msgKey.getKeyValue("REMARKS4"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD5")) {
						key.setWS_CD5(msgKey.getKeyValue("WS_CD5"));
					}
					if(msgKeyType.containsKeyColumn("START_TIME5")) {
						key.setSTART_TIME5(msgKey.getKeyValue("START_TIME5"));
					}
					if(msgKeyType.containsKeyColumn("END_TIME5")) {
						key.setEND_TIME5(msgKey.getKeyValue("END_TIME5"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TYP5")) {
						key.setOPR_TYP5(msgKey.getKeyValue("OPR_TYP5"));
					}
					if(msgKeyType.containsKeyColumn("UN_OPR_CAUSE_TYP5")) {
						key.setUN_OPR_CAUSE_TYP5(msgKey.getKeyValue("UN_OPR_CAUSE_TYP5"));
					}
					if(msgKeyType.containsKeyColumn("UN_OPR_TIME5")) {
						key.setUN_OPR_TIME5(msgKey.getKeyValue("UN_OPR_TIME5"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS5")) {
						key.setREMARKS5(msgKey.getKeyValue("REMARKS5"));
					}
					if(msgKeyType.containsKeyColumn("w_COLUMN_FLG")) {
						key.setw_COLUMN_FLG(msgKey.getKeyValue("w_COLUMN_FLG"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TYP6")) {
						key.setOPR_TYP6(msgKey.getKeyValue("OPR_TYP6"));
					}
					if(msgKeyType.containsKeyColumn("UN_OPR_CAUSE_TYP6")) {
						key.setUN_OPR_CAUSE_TYP6(msgKey.getKeyValue("UN_OPR_CAUSE_TYP6"));
					}
					if(msgKeyType.containsKeyColumn("UN_OPR_TIME6")) {
						key.setUN_OPR_TIME6(msgKey.getKeyValue("UN_OPR_TIME6"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS6")) {
						key.setREMARKS6(msgKey.getKeyValue("REMARKS6"));
					}
					if(msgKeyType.containsKeyColumn("DAILY_WORK_REPORT_DATA_TYP_NULL")) {
						key.setDAILY_WORK_REPORT_DATA_TYP_NULL(msgKey.getKeyValue("DAILY_WORK_REPORT_DATA_TYP_NULL"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TIME2")) {
						key.setOPR_TIME2(msgKey.getKeyValue("OPR_TIME2"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TIME3")) {
						key.setOPR_TIME3(msgKey.getKeyValue("OPR_TIME3"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TIME4")) {
						key.setOPR_TIME4(msgKey.getKeyValue("OPR_TIME4"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TIME5")) {
						key.setOPR_TIME5(msgKey.getKeyValue("OPR_TIME5"));
					}
					if(msgKeyType.containsKeyColumn("DAILY_WORK_REPORT_CTL_NO")) {
						key.setDAILY_WORK_REPORT_CTL_NO(msgKey.getKeyValue("DAILY_WORK_REPORT_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("SEQ_NO")) {
						key.setSEQ_NO(msgKey.getKeyValue("SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("DAILY_WORK_REPORT_TYP")) {
						key.setDAILY_WORK_REPORT_TYP(msgKey.getKeyValue("DAILY_WORK_REPORT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("USER_CD")) {
						key.setUSER_CD(msgKey.getKeyValue("USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("OPR_DATE")) {
						key.setOPR_DATE(msgKey.getKeyValue("OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WORK_SHIFT_CODE")) {
						key.setWORK_SHIFT_CODE(msgKey.getKeyValue("WORK_SHIFT_CODE"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("START_TIME")) {
						key.setSTART_TIME(msgKey.getKeyValue("START_TIME"));
					}
					if(msgKeyType.containsKeyColumn("END_TIME")) {
						key.setEND_TIME(msgKey.getKeyValue("END_TIME"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TIME")) {
						key.setOPR_TIME(msgKey.getKeyValue("OPR_TIME"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TYP")) {
						key.setOPR_TYP(msgKey.getKeyValue("OPR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UN_OPR_CAUSE_TYP")) {
						key.setUN_OPR_CAUSE_TYP(msgKey.getKeyValue("UN_OPR_CAUSE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UN_OPR_TIME")) {
						key.setUN_OPR_TIME(msgKey.getKeyValue("UN_OPR_TIME"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS")) {
						key.setREMARKS(msgKey.getKeyValue("REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("COUNT")) {
						key.setCOUNT(msgKey.getKeyValue("COUNT"));
					}
					if(msgKeyType.containsKeyColumn("TIME_FLG1")) {
						key.setTIME_FLG1(msgKey.getKeyValue("TIME_FLG1"));
					}
					if(msgKeyType.containsKeyColumn("USER_CD2")) {
						key.setUSER_CD2(msgKey.getKeyValue("USER_CD2"));
					}
					if(msgKeyType.containsKeyColumn("OPR_DATE2")) {
						key.setOPR_DATE2(msgKey.getKeyValue("OPR_DATE2"));
					}
					if(msgKeyType.containsKeyColumn("TIME_FLG2")) {
						key.setTIME_FLG2(msgKey.getKeyValue("TIME_FLG2"));
					}
					if(msgKeyType.containsKeyColumn("START_TIME6")) {
						key.setSTART_TIME6(msgKey.getKeyValue("START_TIME6"));
					}
					if(msgKeyType.containsKeyColumn("END_TIME6")) {
						key.setEND_TIME6(msgKey.getKeyValue("END_TIME6"));
					}
					if(msgKeyType.containsKeyColumn("HOLIDAY_FLG")) {
						key.setHOLIDAY_FLG(msgKey.getKeyValue("HOLIDAY_FLG"));
					}
					if(msgKeyType.containsKeyColumn("OPR_DATE3")) {
						key.setOPR_DATE3(msgKey.getKeyValue("OPR_DATE3"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD2")) {
						key.setPLANT_CD2(msgKey.getKeyValue("PLANT_CD2"));
					}
					if(msgKeyType.containsKeyColumn("WORK_SHIFT_CODE3")) {
						key.setWORK_SHIFT_CODE3(msgKey.getKeyValue("WORK_SHIFT_CODE3"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD")) {
						key.setOPR_INST_CD(msgKey.getKeyValue("OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD6")) {
						key.setWS_CD6(msgKey.getKeyValue("WS_CD6"));
					}
					if(msgKeyType.containsKeyColumn("TARGET_PLANT_CD")) {
						key.setTARGET_PLANT_CD(msgKey.getKeyValue("TARGET_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("TARGET_ITEM_NO")) {
						key.setTARGET_ITEM_NO(msgKey.getKeyValue("TARGET_ITEM_NO"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_OPR_TIME")) {
						key.setTOTAL_OPR_TIME(msgKey.getKeyValue("TOTAL_OPR_TIME"));
					}
					if(msgKeyType.containsKeyColumn("PVC2LOGMODE")) {
						key.setPVC2LOGMODE(msgKey.getKeyValue("PVC2LOGMODE"));
					}
					if(msgKeyType.containsKeyColumn("PVC2OUTPUTMODE")) {
						key.setPVC2OUTPUTMODE(msgKey.getKeyValue("PVC2OUTPUTMODE"));
					}
					if(msgKeyType.containsKeyColumn("PVC2OUTPUTPATH")) {
						key.setPVC2OUTPUTPATH(msgKey.getKeyValue("PVC2OUTPUTPATH"));
					}
					if(msgKeyType.containsKeyColumn("PVC2OUTPUTNAME")) {
						key.setPVC2OUTPUTNAME(msgKey.getKeyValue("PVC2OUTPUTNAME"));
					}
					if(msgKeyType.containsKeyColumn("PVC2USERID")) {
						key.setPVC2USERID(msgKey.getKeyValue("PVC2USERID"));
					}
					if(msgKeyType.containsKeyColumn("PVC2BUSINESSNAME")) {
						key.setPVC2BUSINESSNAME(msgKey.getKeyValue("PVC2BUSINESSNAME"));
					}
					if(msgKeyType.containsKeyColumn("PVC2PLANTCD")) {
						key.setPVC2PLANTCD(msgKey.getKeyValue("PVC2PLANTCD"));
					}
					if(msgKeyType.containsKeyColumn("RETURN_MESSAGE")) {
						key.setRETURN_MESSAGE(msgKey.getKeyValue("RETURN_MESSAGE"));
					}
					if(msgKeyType.containsKeyColumn("RETURN_STATUS")) {
						key.setRETURN_STATUS(msgKey.getKeyValue("RETURN_STATUS"));
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
