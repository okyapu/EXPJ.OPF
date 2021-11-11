/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0110/src/com/nec/jp/orteus/metamorBase/AD0110/AD0110010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0110;

import com.nec.jp.orteus.metamorBase.AD0110.*;
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
import java.math.BigDecimal;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlStruct;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import com.nec.jp.orteus.expj.pr.rcvissue.process.WhAutoIssueProc;
import com.nec.jp.orteus.expj.pr.rcvissue.process.WhAutoIssueProc.AutoIssueParam;
import java.text.ParseException ;
import com.nec.jp.orteus.expj.lot.BizCommon;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

import com.nec.jp.orteus.expj.pr.rcvissue.process.AutoIssue;
import com.nec.jp.orteus.expj.pr.rcvissue.process.RcvCancel;
import com.nec.jp.orteus.expj.pr.rcvissue.process.ValidateWh;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AD0110010Control �N���X
 * 			�o��������CSV�捞
 * @author $Author: geng-jia $
 * @version $Revision: 1.6 $ $Date: 2015/12/22 10:04:26 $
 *
 */
//}}user_implement_code_header

public class AD0110010Control
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
	public AD0110010Struct getListvalue(int x) { return (AD0110010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AD0110010Struct getStruct() { return this.struct; }	// Struct�̒l��Ԃ��܂��B
	public AD0110010Struct createStruct() { return new AD0110010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AD0110010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	public AD0110010Struct mItemStruct = new AD0110010Struct();

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
	/**���[�j���O����**/
	private int _intWarningCount1 = 0;
	private boolean warningFlg = false;
	/** �V�X�e�����O���b�Z�[�W�쐬�p */
	private StringBuffer _sysLogMessage;
	
	//��Ǝ��эX�V�Ώ�Struct
	private AD0110010Struct rsltStruct = new AD0110010Struct();
	//�i�ڕʎd�|�X�V�Ώ�Struct
	private AD0110010Struct procByItemStruct = new AD0110010Struct();
	
	
	/** �b�r�u���ڔԍ���` */
	// �H��R�[�h
	private final int CSV_PLANT_CD = 0;
	// �i�ڔԍ�
	private final int CSV_ITEM_CD = 1;
	// ��Ƌ�R�[�h
	private final int CSV_WS_CD = 2;
	// ��Ɠ�
	private final int CSV_OPR_DATE = 3;
	// ��Ɠ�
	private final int CSV_WH_CD = 4;
	// �Ǖi��
	private final int CSV_ACPT_QTY = 5;
	// �s�ǐ�
	private final int CSV_DEFECT_QTY = 6;
	// �s�Ǘ��R�R�[�h
	private final int CSV_DEFECT_CAUSE_CD = 7;
	// �s�ǔ��l
	private final int CSV_DEFECT_COMMENT = 8;
	// ��ƒS���҃R�[�h
	private final int CSV_OUTPUT_RSLT_PERSON = 9;
	// ��Ǝ��ԒP�ʋ敪
	private final int CSV_OPR_TIME_UNIT_TYP = 10;
	// ��Ǝ���
	private final int CSV_OPR_TIME = 11;
	// �������b�g�ԍ�
	private final int CSV_VEND_LOT_NO = 12;
	// �݌Ƀ��b�g�ԍ�
	private final int CSV_LOT_NO = 13;
	// �O�i�掞��
	private final int CSV_PRE_ARRANGEMENT_TIME = 14;
	// ��i�掞��
	private final int CSV_POST_ARRANGEMENT_TIME = 15;
	// ��~����
	private final int CSV_CESSATION_TIME = 16;
	// ��~���R
	private final int CSV_CESSATION_CAUSE = 17;
	// ���l
	private final int CSV_OUTPUT_RSLT_COMMENT = 18;

	// �b�r�u�捞�f�[�^�K�v���ڐ�(���v)
	private final int CSV_NECESSARY_COLUMN = 19;
	
	// 199
	private final int CSV_COLNO_199 = 199;
	// �G���[���b�Z�[�W
	private ExpjMessage _emsg = null;
	
	// �݌Ƀ��b�g�ԍ�
	private String strLotNo = null;
	
	// �o�������єԍ�
	private String strOutputRsldCd = null;
	
	/*��ЃR�[�h*/
	public String _company_cd = null;

	// �ݒ�l
	private String strValus = null;

	
	// �����ꍀ�ڎ擾�Ή�
	private String _locale = CoreTools.getLocale(sysUSER_CD);
	ResourceBundle _resource = CoreTools.getResourceBundle("OrteusUserDic", _locale);

	/** �Ɩ��^�p��*/
	private String _btmBusinessOprDate;
	
	// �R���{�{�b�N�X��`
	// �G���[��ԋ敪
	private ComboStruct _COM_ERR_TYP = null;
	// ��Ǝ��ԒP�ʋ敪
	private ComboStruct _OPR_TIME_UNIT_TYP = null;
	
	// �s�Ǘ��R�R�[�h
	private ComboStruct _DEFECT_CAUSE_CD_INNER = null;
	

	/**
	 * �Ɩ����W�b�N�̃G���[���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * @param db1 �f�[�^�x�[�X���ڂP
	 * @param value1 �u��������P
	 */
	private void setSupportMessage(String db1, String value1) {
		_sysLogMessage = new StringBuffer();
		_sysLogMessage.append(db1);
		_sysLogMessage.append(":");
		_sysLogMessage.append(value1);
		ExpjMessage emsg = new ExpjMessage("ZZ01006", _sysLogMessage.toString());
		msgStruct.addError(emsg);
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
	 */
	private void setInfoMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addInfo(emsg);
		sysLog.info(emsg, sysUSER_CD);
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
	 * ���ی����Ǘ��p�����[�^�̑Ώ۔N�����擾
	 * @param in �`�F�b�N��
	 * @param in �`�F�b�N�H��R�[�h
	 * @param in AD0050010Struct
	 * @param in AD0050010Entity
	 * �߂�l �`�F�b�N����
	 */
	private boolean checkProcExecDate(String checkDate,String plantCD, AD0110010Struct struct) throws BusinessProcessException, FoundationException {
		boolean checkResult = true;
		try {
			
			struct.setPLANT_CD(plantCD);
			List procExecDateList = entity.mselectSYS_ACTUAL_COST_CTRL_AC.read(conn, struct);
			// ���ی����Ǘ��p�����[�^�ɑ��݂��Ȃ�
			if(procExecDateList == null || procExecDateList.isEmpty()){
				return true;
			}
			AD0110010Struct procExecDateStruct = (AD0110010Struct) procExecDateList.get(0);
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
	 * �����o�ɂ��Ăяo���܂��B
	 * @param sFLG ��Ɗ����t���O(0:��Ɩ����� 1:��Ɗ���)
	 * @throws SQLException
	 * @throws Exception
	 */
	private boolean callCommonIssue(AD0110010Struct parStruct,String sFLG ,String plantCD, int m) 
			throws SQLException, Exception {

		//�����o�ɌĂяo��
		BigDecimal bdQty = new BigDecimal("0");
		if (rsltStruct.getACPT_QTY()!=null) {
			bdQty = new BigDecimal(rsltStruct.getACPT_QTY());
		}
		if (rsltStruct.getDEFECT_QTY()!=null) {
			bdQty = bdQty.add(new BigDecimal(rsltStruct.getDEFECT_QTY()));
		}
		if (rsltStruct.getOPR_CRCT_NO() == null 
				|| rsltStruct.getOPR_CRCT_NO().length() == 0) {
			rsltStruct.setOPR_CRCT_NO("0");
		}
		
		/********************
		 * �����o�ɏ����J�n *
		 *******************/
		WhAutoIssueProc whAutoIssueProc = new WhAutoIssueProc(conn,
				plantCD,
				getsysUSER_CD(),
				sp.getProcId());
		WhAutoIssueProc.AutoIssueParam autoIssueParam = whAutoIssueProc.new AutoIssueParam();
		
		// �p�����[�^�̃Z�b�g
		autoIssueParam.m_WORK_ODR_CD = procByItemStruct.getvc2WORK_ODR_CD();
		autoIssueParam.m_WORK_IN_PROC_CD = "";
		autoIssueParam.m_PARTIAL_PRD_NO = Integer.parseInt(rsltStruct.getPARTIAL_PRD_NO());
		autoIssueParam.m_OPR_RSLT_CRCT_NO = Integer.parseInt(rsltStruct.getOPR_CRCT_NO());
		autoIssueParam.m_PUCH_ODR_CD = "";
		autoIssueParam.m_ACPT_NO = 0;
		autoIssueParam.m_ACPT_RSLT_CRCT_NO = 0;
		autoIssueParam.m_RCV_ISSUE_TYP = 2;
		autoIssueParam.m_RCV_ISSUE_DATE = rsltStruct.getOPR_DATE();
		autoIssueParam.m_RCV_ISSUE_RSLT_NO = bdQty.toString();
		autoIssueParam.m_RCV_ISSUE_CMPLT_FLG = Integer.parseInt(sFLG);
		autoIssueParam.m_PLANT_CD = plantCD;
		
		AutoIssue autoIssue = new AutoIssue(conn,
				plantCD,getsysUSER_CD(),sp.getProcId());
		
		// �����o�Ɏ��s
		boolean result = autoIssue.AutoIssueOpr(autoIssueParam);

		String message1 = "";
		if(result){
			// �Ɩ��A���[��������Ώo�͂���B
			// �Ɩ��G���[�̏o��
			for (int n = 0; n < autoIssue.getWarnList().size(); n++) {
				message1 = message1 + "," + new ExpjMessage(autoIssue.getWarnList().get(n).toString()).getMessage(_locale);
			}
			if (!isNull(message1)) {
				message1 = message1.substring(1);
				csvExport(parStruct // �Ώۃf�[�^���
						, "2" 		// �G���[�敪
						, m + 1 	// �G���[�����s
						, null
						, new ExpjMessage("ZZ01006", message1).getMessage(_locale), null); // �G���[���b�Z�[�W
				if (!warningFlg){
					_intWarningCount1++;
					warningFlg = true;
				}
			
			}

			return result;
		}else{
			// �Ɩ��G���[�̏o��
			for (int n = 0; n < autoIssue.getErrorList().size(); n++) {
				message1 = message1 + "," + new ExpjMessage(autoIssue.getErrorList().get(n).toString()).getMessage(_locale);
			}
			if (!isNull(message1)) {
				message1 = message1.substring(1);
				csvExport(parStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, m + 1						// �G���[�����s
						,null
						,new ExpjMessage("ZZ01006",message1).getMessage(_locale)
						,null);	// �G���[���b�Z�[�W
				_intErrorCount++;
			}
		}
		return result;
	}

	/**
	 * ���ɏ������Ăяo���܂��B
	 * @param sFLG ��Ɗ����t���O(0:��Ɩ����� 1:��Ɗ���)
	 * @throws Exception
	 */
	private boolean callRcvCancel(AD0110010Struct parStruct, String sFLG ,String plantCD,int m) 
			throws Exception {

		//���o�ɊǗ��ԍ��̔�
		Numbering collectNum = 
				new Numbering(conn,
					CollectNumber.ISSUE_CD,
					getsysUSER_CD(),
					sp.getProcId(),
					plantCD);
		String no = collectNum.getNo();
		if (no == null || no.length() == 0) {
			//�̔Ԍ��ʂ��Ȃ�
			csvExport(parStruct					// �Ώۃf�[�^���
					, "1"						// �G���[�敪
					, m + 1						// �G���[�����s
					,null
					,new ExpjMessage("AE00152").getMessage(_locale)
					,null);	// �G���[���b�Z�[�W
			_intErrorCount++;
			return false;
		}
		AD0110010Struct rcvIssueStruct = new AD0110010Struct();
		rcvIssueStruct.setsUser_ID(sysUSER_CD);

		rcvIssueStruct.setRCV_ISSUE_CTRL_CD(no);				//���o�ɊǗ��ԍ�
		rcvIssueStruct.setRCV_ISSUE_TYP("1");					//���o�ɋ敪
		rcvIssueStruct.setITEM_CD(rsltStruct.getITEM_CD());//�i�ڔԍ�
		rcvIssueStruct.setPLANT_CD(plantCD);			//�H��R�[�h
		rcvIssueStruct.setWH_CD(rsltStruct.getWH_CD());	//�ۊǋ�R�[�h
		rcvIssueStruct.setJOB_ODR_CD(null);					//����
		rcvIssueStruct.setJOB_ODR_DETAIL_NO("0");				//���Ԏ}��
		rcvIssueStruct.setPUCH_ODR_CD(null);					//�����ԍ�
		rcvIssueStruct.setACPT_NO("0");							//�����
		rcvIssueStruct.setACPT_RSLT_CRCT_NO("0");				//������ђ�����
		rcvIssueStruct.setINSPEC_RSLT_CRCT_NO("0");				//�������ђ�����

		rcvIssueStruct.setWORK_ODR_CD(procByItemStruct.getvc2WORK_ODR_CD());//��ƌv��ԍ�
		rcvIssueStruct.setWORK_IN_PROC_CD(null);							//�d�|��ƃR�[�h
		rcvIssueStruct.setPARTIAL_PRD_NO(rsltStruct.getPARTIAL_PRD_NO());//�����
		rcvIssueStruct.setOPR_RSLT_CRCT_NO(rsltStruct.getOPR_CRCT_NO());//��Ǝ��ђ�����
		rcvIssueStruct.seth_ISSUE_INST_CD(null);						//�o�Ɏw���ԍ�
		rcvIssueStruct.setRCV_ISSUE_QTY(rsltStruct.getACPT_QTY());		//���o�ɐ�
		rcvIssueStruct.setRCV_ISSUE_AMOUNT("0");							//���o�ɋ��z
		rcvIssueStruct.setRCV_ISSUE_DATE(rsltStruct.getOPR_DATE());		//���o�ɔN����
		rcvIssueStruct.setRCV_ISSUE_GNR_TYP("11");								//���o�ɔ����敪
		rcvIssueStruct.setRCV_ISSUE_ODD_QTY("0");				//���o�ɒ[��
		rcvIssueStruct.setDEFECT_CAUSE_CD(null);				//���o�ɕs�Ǘ��R�R�[�h
		rcvIssueStruct.setSTOCK_UPD_TYP("1");					//�݌ɍX�V�敪
		rcvIssueStruct.setRCV_ISSUE_CMPLT_FLG(sFLG);			//���o�Ɋ����t���O

		rcvIssueStruct.setOD_NO(procByItemStruct.getOD_NO());	//�I�[�_�f�}���h�ԍ�
		rcvIssueStruct.setLOT_NO(rsltStruct.getLOT_NO());	//�݌Ƀ��b�g�ԍ�
		rcvIssueStruct.setVEND_LOT_NO(null);					//���[�J���b�g�ԍ�
		rcvIssueStruct.setRCV_ISSUE_COMMENT(null);				//���o�ɔ��l
		rcvIssueStruct.setCONS_TYP("0");						//�x���敪
		rcvIssueStruct.setCOMPANY_CD(null);

		// �ޔ�p�莝���݌ɐ���������
		rcvIssueStruct.setSAVE_STOCK_ON_HAND_QTY("0");


		//���ɏ���
		RcvCancel RCan = 
				new RcvCancel(conn,rcvIssueStruct.getRCV_ISSUE_CTRL_CD(),getsysUSER_CD());
		
		//��ЃR�[�h
		rcvIssueStruct.setCOMPANY_CD(_company_cd);
		
		//�ۊǋ�ʓ��o�ɓo�^
		entity.minsertT_RCV_ISSUE.create(conn, rcvIssueStruct);
		boolean bRSLT = RCan.execProcess();

		String message1 = "";
		if (!bRSLT) {
			for (int n = 0; n < RCan.getErrorList().size(); n++) {
				message1 = message1 + "," + new ExpjMessage(RCan.getErrorList().get(n).toString()).getMessage(_locale);
			}
			if (!isNull(message1)) {
				message1 = message1.substring(1);
				csvExport(
						parStruct // �Ώۃf�[�^���
						,
						"1" // �G���[�敪
						,
						m + 1 // �G���[�����s
						, null,
						new ExpjMessage("ZZ01006", message1)
								.getMessage(_locale), null); // �G���[���b�Z�[�W
				_intErrorCount++;
				return false;
			}
		}
		return true;
	}
	
	/**
	 * �o�Ɏw�����X�g��ݒ肵�܂��B
	 * @throws FoundationException
	 * @throws SQLException
	 * @throws BatchAppException 
	 */
	private boolean setIssueList(List mainIssueList,AD0110010Struct parStruct) 
			throws FoundationException, SQLException {

		//�Ǖi��
		BigDecimal acptQty = new BigDecimal(parStruct.getACPT_QTY());
		//�s�ǐ�
		BigDecimal defectQty = new BigDecimal(parStruct.getDEFECT_QTY());
		
		//��Ɠ�(���t����.�Ɩ��^�p��)�̃Z�b�g
		parStruct.setBUSINESS_OPR_DATE(_btmBusinessOprDate);


		for (int i = 0; i < mainIssueList.size(); i++ ) {
			BigDecimal planSum = acptQty.add(defectQty);
			AD0110010Struct tempIssueStruct = (AD0110010Struct)mainIssueList.get(i);
			tempIssueStruct.setsUser_ID(sysUSER_CD);
			//�v��g�p���ʂ̎擾
			int round = Integer.parseInt(tempIssueStruct.getl_UNIT_QTY_TYP());
			BigDecimal denominator = 
					new BigDecimal(tempIssueStruct.getISSUE_INST_UNIT_DENOMINATOR());
			BigDecimal numerator = 
					new BigDecimal(tempIssueStruct.getISSUE_INST_UNIT_NUMERATOR());


			//���b�g�Ǘ��ΏۊO�̏ꍇ�A���邢�͐V�K�o�^�̏ꍇ
			if (tempIssueStruct.getLOT_NO() == null || tempIssueStruct.getLOT_NO().equals("")) {
				if (round == 1) {
					planSum = planSum.multiply(numerator).divide(denominator,0, BigDecimal.ROUND_UP).setScale(1);
				} else {
					planSum = planSum.multiply(numerator).divide(denominator,4, BigDecimal.ROUND_UP);

					// �����̕\���X�P�[������
					BigDecimal intVal = new BigDecimal("" + planSum.intValue());
					BigDecimal decimalVal = planSum.subtract(intVal).multiply(
							new BigDecimal(10000));
					int decVal = decimalVal.intValue();
					int roundCount = 1;
					while (true) {
						decVal = decVal / 10;
						if (decVal == 0) {
							break;
						}
						roundCount++;
					}
					planSum = planSum.setScale(roundCount, BigDecimal.ROUND_UP);
				}
				// ���b�g���蓖�čς݂̏ꍇ
			} else {
				// [���b�g�ʎg�p����]�̎g�p�\�萔�ʂ��v��g�p���ʂɐݒ�
				planSum = new BigDecimal(tempIssueStruct.getSUPPLIED_ISSUE_QTY());
			}
			tempIssueStruct.setTEMP_PLAN_QTY(planSum.toString());
			
			//�g�p�ϐ��ʁA�v��O�g�p�ϐ��ʁA�X�V�g�p���ʂ̎擾
			tempIssueStruct.setTEMP_USEOVER_QTY("0.0");
			tempIssueStruct.setTEMP_PLANOUT_QTY("0.0");
			tempIssueStruct.setTEMP_USE_QTY("0.0");
			
			//��ƌv��ԍ��ɏo�������єԍ����Z�b�g
			List tempList = new ArrayList();
			AD0110010Struct tempStruct = null;
			tempStruct = new AD0110010Struct();
			tempStruct.setsUser_ID(sysUSER_CD);
			tempStruct.setWORK_ODR_CD(parStruct.getOUTPUT_RSLT_CD());  
			tempStruct.setITEM_CD(tempIssueStruct.getITEM_CD());
			tempStruct.seth_ISSUE_INST_CD(tempIssueStruct.geth_ISSUE_INST_CD());

			// ���b�g�Ǘ��ΏۊO�̏ꍇ�A���邢�͐V�K�o�^�̏ꍇ
			if (tempIssueStruct.getLOT_NO() == null || tempIssueStruct.getLOT_NO().equals("")) {
				// �ۊǋ�ʓ��o�ɂ̌���
				tempList = new ArrayList();
				tempList = entity.mselectRecvIssue.read(conn, tempStruct);
				if (tempList != null && tempList.size() != 0) {
					tempStruct = (AD0110010Struct) tempList.get(0);
					tempStruct.setsUser_ID(sysUSER_CD);
					BigDecimal bdIssue = new BigDecimal(tempStruct.getRCV_ISSUE_QTY());
					tempIssueStruct.setTEMP_USEOVER_QTY(bdIssue.negate().toString());
					if ("0".equals(tempStruct.getcount_RCV_ISSUE())) {
						tempIssueStruct.setTEMP_PLANOUT_QTY("0.0");
						tempIssueStruct.setTEMP_USE_QTY(planSum.toString());
					} else {
						BigDecimal useoverQty = new BigDecimal(tempIssueStruct.getTEMP_USEOVER_QTY());
						BigDecimal planoutQty = (planSum.subtract(useoverQty)).multiply(new BigDecimal(-1));
						tempIssueStruct.setTEMP_PLANOUT_QTY(planoutQty.toString());
						tempIssueStruct.setTEMP_USE_QTY("0.0");
					}
				}
				// ���b�g���蓖�čς݂̏ꍇ
			} else {
				// [���b�g�ʎg�p����]�̎g�p�ϐ��ʂ��g�p�ϐ��ʂɐݒ�
				tempIssueStruct.setTEMP_USEOVER_QTY(tempIssueStruct.getTOTAL_ISSUE_QTY());

				// �v��O�g�p�ϐ��ʂɌv��g�p����-�g�p�ϐ��ʁA�X�V�g�p���ʂ�0��ݒ�
				BigDecimal useoverQty = new BigDecimal(tempIssueStruct.getTEMP_USEOVER_QTY());
				BigDecimal planoutQty = (planSum.subtract(useoverQty)).multiply(new BigDecimal(-1));
				tempIssueStruct.setTEMP_PLANOUT_QTY(planoutQty.toString());
				tempIssueStruct.setTEMP_USE_QTY("0.0");
			}

			//���חp�̕ϐ��Ƀ��b�g�ԍ��ݒ�
			//tempIssueStruct.setl_LOT_NO(tempIssueStruct.getLOT_NO());
			tempIssueStruct.setRCV_ISSUE_DATE(parStruct.getOPR_DATE());
			if (parStruct.getOPR_DATE() == null || "".equals(parStruct.getOPR_DATE())){
				tempIssueStruct.setRCV_ISSUE_DATE(_btmBusinessOprDate);
			}
		}
		return true;
	}
	
	/**
	 * �}�j���A���o�ɃL�b�g�o�ɂ��Ăяo���܂��B
	 * @param sFLG ��Ɗ����t���O(0:��Ɩ����� 1:��Ɗ���)
	 * @throws SQLException
	 * @throws Exception
	 */
	private boolean callManiaruIssue(AD0110010Struct parStruct,String plantCD, int m) 
	throws SQLException, Exception {
		boolean result=true;
		List UpdateAllList;
		///�o�������ь���
		List selectList = entity.mselectT_OUTPUT_RSLT.read(conn, parStruct);
		AD0110010Struct selectStruct = new AD0110010Struct();
		selectStruct = (AD0110010Struct)selectList.get(0);
		selectStruct.setsUser_ID(sysUSER_CD);
		//�o�������єԍ��ݒ�
		selectStruct.setOUTPUT_RSLT_CD(parStruct.getOUTPUT_RSLT_CD());
		
		//�o�Ɏw�����X�g�擾
		UpdateAllList = entity.mselectIssue.read(conn, selectStruct);

		parStruct.setvc2PLANT_CD(parStruct.getPLANT_CD());
		//�o�Ɏw�����X�g��ݒ�
		result = this.setIssueList(UpdateAllList, parStruct);
		if(result == false){
			return result;
		}
		
		for (int i = 0; i < UpdateAllList.size(); i++ ) {
			
			AD0110010Struct issueStruct = new AD0110010Struct();
			issueStruct = (AD0110010Struct)UpdateAllList.get(i);
			issueStruct.setsUser_ID(sysUSER_CD);

			issueStruct.setPARTIAL_PRD_NO("0");		//ZERO���Z�b�g����
			issueStruct.setJOB_ODR_CD(null);		//���ԕi�ڂ͏����ΏۊO�Ƃ���
		
			if (issueStruct.getTEMP_USE_QTY() == null 
					|| Double.parseDouble(issueStruct.getTEMP_USE_QTY()) == 0) {
				continue;	//�X�V�g�p���ʂ�ZERO�̈׈ȉ��̏����͍s�킸�A���̍s�Ɉڂ�
			}

			// �o�������єԍ��̎����̔�
			Numbering collectNum = 
				new Numbering(conn,
						CollectNumber.ISSUE_CD,
						sysUSER_CD,
						sp.getProcId(),
						plantCD);
			
			String no = collectNum.getNo();
			if (no == null || no.length() == 0) {
				//�̔Ԍ��ʂ��Ȃ�
				csvExport(parStruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, m + 1						// �G���[�����s
						,null
						,new ExpjMessage("AE00152").getMessage(_locale)
						,null);	// �G���[���b�Z�[�W
				_intErrorCount++;
				setReadStatus(ERROR);
				return false;
			}

			BigDecimal keepUseQty = new BigDecimal(issueStruct.getTEMP_USE_QTY());
			BigDecimal planQty = new BigDecimal(issueStruct.getTEMP_PLAN_QTY());
			BigDecimal useQty = new BigDecimal(issueStruct.getTEMP_USE_QTY());
			if (issueStruct.getl_UNIT_QTY_TYP() != null 
					&& "1".equals(issueStruct.getl_UNIT_QTY_TYP())) {
				//�i�ڂ������Ǘ��i�̏ꍇ�A�؏グ���s��
				useQty = useQty.setScale(0,BigDecimal.ROUND_UP);
			}
			//�C�����e��ێ�
			issueStruct.setRCV_ISSUE_CTRL_CD(no);
			issueStruct.setPLANT_CD(plantCD);
			//�o�������єԍ�
			issueStruct.setWORK_ODR_CD(parStruct.getOUTPUT_RSLT_CD());
			issueStruct.setWORK_IN_PROC_CD(null);

			issueStruct.setRCV_ISSUE_QTY(useQty.negate().toString());
			if (useQty.doubleValue() > 0) {
				//�H���݌ɏo��
				issueStruct.setRCV_ISSUE_GNR_TYP("51");
			} else {
				//�H���݌ɏo�Ɏ��
				issueStruct.setRCV_ISSUE_GNR_TYP("59");
			}

			issueStruct.setRCV_ISSUE_ODD_QTY(useQty.subtract(keepUseQty).toString());
			issueStruct.setOD_NO(null);
			issueStruct.setRCV_ISSUE_CMPLT_FLG("0");
			issueStruct.setSTOCK_UPD_TYP("2");
			issueStruct.setRCV_ISSUE_TYP("2");


			useQty = new BigDecimal(issueStruct.getTEMP_USE_QTY());
			BigDecimal stockQty = null;
			//�H���d�|�݌ɏo�ɏ���
		
			//�ۊǋ�ʕi�ڍ݌ɍX�V
			List tempList = new ArrayList();
			AD0110010Struct tempStruct= new AD0110010Struct();
			tempList = entity.mselectItemStock.read(conn, issueStruct);
			AD0110010Struct stockStruct = new AD0110010Struct();
			stockStruct.setStructM(issueStruct);
			stockStruct.setsUser_ID(sysUSER_CD);
			// �ޔ�p�莝���݌ɐ���������
			issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
		
			if (tempList.isEmpty()) {
				//�o�^
				useQty = useQty.negate();
				stockStruct.setSTOCK_ON_HAND_QTY(useQty.toString());
				
				entity.minsertItemStock.create(conn, stockStruct);
			} else {
				//�X�V
				tempStruct = new AD0110010Struct();
				tempStruct = (AD0110010Struct)tempList.get(0);
				stockStruct.setsUser_ID(sysUSER_CD);
				issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
				stockQty = new BigDecimal(tempStruct.getSTOCK_ON_HAND_QTY());
				if (useQty.doubleValue() > 0) { //�o��
					useQty = stockQty.subtract(useQty) ;
				} else { //����
					useQty = stockQty.add(useQty.negate()) ;
				}
				stockStruct.setSTOCK_ON_HAND_QTY(useQty.toString());
				
				entity.mupdateItemStock.update(conn, stockStruct);
			}
		
			issueStruct.setJOB_ODR_CD(null);			//����
			issueStruct.setJOB_ODR_DETAIL_NO("0");		//���Ԏ}��
			issueStruct.setACPT_NO("0");				//�����
			issueStruct.setACPT_RSLT_CRCT_NO("0");		//������ђ�����
			issueStruct.setINSPEC_RSLT_CRCT_NO("0");	//�������ђ�����
			issueStruct.setOPR_RSLT_CRCT_NO("0");		//��Ǝ��ђ�����
			issueStruct.setRCV_ISSUE_AMOUNT("0");		//���o�ɋ��z
			issueStruct.setCONS_TYP("0");				//�x���敪
			//��ЃR�[�h
			issueStruct.setCOMPANY_CD(_company_cd);

			// ���b�g�Ǘ��t���O = 1(���b�g���[�X�Ǘ����s���B)�̏ꍇ
			if(issueStruct.getLOT_CTRL_FLG().equals("1")){
				issueStruct.setOUTPUT_RSLT_CD(parStruct.getOUTPUT_RSLT_CD());//�o�������єԍ�
				issueStruct.setOPR_DATE(parStruct.getOPR_DATE());

				//�o�Ɏ��і��׎擾
				List lotIssueList = entity.mselectT_LOT_ISSUE_INST.read(conn,issueStruct);

				//�f�[�^���Ȃ��ꍇ
				if (lotIssueList == null || lotIssueList.size() == 0) {
					csvExport(parStruct					// �Ώۃf�[�^���
							, "1"						// �G���[�敪
							, m + 1						// �G���[�����s
							,null
							,new ExpjMessage("AD20135").getMessage(_locale)
							,null);	// �G���[���b�Z�[�W
					_intErrorCount++;
					return false;
				}

				//�g�p�c���ݒ�
				BigDecimal remainQty = new BigDecimal(issueStruct.getTEMP_USE_QTY());

				AD0110010Struct lotUseStruct = new AD0110010Struct();
				lotUseStruct.setStructM(issueStruct);
				lotUseStruct.setsUser_ID(sysUSER_CD);

				for (int j = 0; j < lotIssueList.size(); j++ ) {
					AD0110010Struct lotIssueStruct = (AD0110010Struct)lotIssueList.get(j);

					//�������ĉ\���ݒ�
					BigDecimal issueQty = new BigDecimal(lotIssueStruct.getISSUE_QTY());//�o�Ɏ��ѐ���
					BigDecimal spentQty = new BigDecimal(lotIssueStruct.getSPENT_QTY());//�g�p��
					BigDecimal availQty = issueQty.subtract(spentQty);

					//���b�g�ʎg�p���ъǗ��ԍ��̔�
					List seqList = entity.mSEQ_JF_RSLT.read(conn, parStruct);
					if(seqList != null && seqList.size() > 0){
						lotUseStruct.setRSLT_CTL_SEQ_NO(((AD0110010Struct)seqList.get(0)).getNEXTVAL());
					}

					//�o�Ɏw���ԍ��A���b�g�ԍ��ݒ�
					lotUseStruct.seth_ISSUE_INST_CD(lotIssueStruct.geth_ISSUE_INST_CD());
					lotUseStruct.setLOT_NO(lotIssueStruct.getLOT_NO());

					BigDecimal useLotQty = null;

					//�������ĉ\�� >= �g�p�c���̏ꍇ
					if(availQty.doubleValue() >= remainQty.doubleValue()){
						//�g�p�c�����������Đ��ɐݒ�
						useLotQty = remainQty;
					//�������ĉ\�� < �g�p�c���̏ꍇ
					} else {
						//�ŏI�f�[�^�̏ꍇ
						if (j == lotIssueList.size() - 1) {
							//�g�p�c�����g�p���ɐݒ�
							useLotQty = remainQty;
						//�ŏI�f�[�^�łȂ��ꍇ
						} else {
							//�����\����0���傫���ꍇ
							if(availQty.doubleValue() > 0){
								//�g�p�c�����g�p���ɐݒ�
								useLotQty = remainQty;

								//�����R�[�h�ȍ~���擾
								for (int k = j + 1; k < lotIssueList.size(); k++ ) {
									AD0110010Struct nextLotIssueStruct = (AD0110010Struct)lotIssueList.get(k);

									//�������ĉ\���ݒ�
									BigDecimal nextIssueQty = new BigDecimal(nextLotIssueStruct.getISSUE_QTY());
									BigDecimal nextSpentQty = new BigDecimal(nextLotIssueStruct.getSPENT_QTY());
									BigDecimal nextAvailQty = nextIssueQty.subtract(nextSpentQty);

									//�����R�[�h�ȍ~�Ɉ����\�ȃf�[�^������ꍇ
									if (nextAvailQty.doubleValue() > 0) {
										//�������ĉ\�����g�p���ɐݒ�
										useLotQty = availQty;
										break;
									}
								}
							//�����\����0�ȉ��̏ꍇ
							} else {
								//���̃f�[�^���擾
								continue;
							}
						}
					}

					//�g�p���������\�����傫���ꍇ
					if(useLotQty.doubleValue() > availQty.doubleValue()){
						//�x�����b�Z�[�W�o��
						csvExport(parStruct					// �Ώۃf�[�^���
								, "2"						// �G���[�敪
								, m + 1						// �G���[�����s
								,null
								,new ExpjMessage("AD20136").getMessage(_locale)
								,null);	// �G���[���b�Z�[�W
						if(!warningFlg){
							_intWarningCount1++;
							warningFlg = true;
						}
					}

					//�g�p�ϐ��ʁA�g�p�\�萔�ʂɏ�L�Őݒ肵���g�p����ݒ�
					lotUseStruct.setTOTAL_ISSUE_QTY(useLotQty.toString());
					lotUseStruct.setSUPPLIED_ISSUE_QTY(useLotQty.toString());

					//���ѓ����g�p���ɐݒ�
					lotUseStruct.setSUPPLIED_DATE(lotUseStruct.getOPR_DATE());

					//[���b�g�ʎg�p����]�̒ǉ�
					entity.mT_LOT_USE_RSLT.create(conn, lotUseStruct);

					//[�o�Ɏ��і���]�̍X�V
					lotUseStruct.setSPENT_QTY(spentQty.add(useLotQty).toString());
					entity.mT_LOT_ISSUE_INST.update(conn, lotUseStruct);

					issueStruct.setLOT_NO(lotIssueStruct.getLOT_NO());
					issueStruct.setRCV_ISSUE_QTY(useLotQty.negate().toString());

					//���b�g�ʕi�ڍ݌Ɍ���
					tempList = entity.mT_LOT_STOCK.read(conn,issueStruct);

					//�X�V�O�̍݌ɐ��ݒ�
					if (tempList.isEmpty()) {
						issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
					} else {
						tempStruct = (AD0110010Struct)tempList.get(0);
						issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
					}

					//2���ڈȍ~�̃f�[�^�̏ꍇ
					if (j > 0) {
						//���o�ɊǗ��ԍ��̔�
						collectNum = 
							new Numbering(conn,
									CollectNumber.ISSUE_CD,
									sysUSER_CD,
									sp.getProcId(),
									plantCD);
						no = collectNum.getNo();
						if (no == null || no.length() == 0) {
							//�̔Ԍ��ʂ��Ȃ�
							csvExport(parStruct					// �Ώۃf�[�^���
									, "1"						// �G���[�敪
									, m + 1						// �G���[�����s
									,null
									,new ExpjMessage("AE00152").getMessage(_locale)
									,null);	// �G���[���b�Z�[�W
							_intErrorCount++;
							return false;
						}
						issueStruct.setRCV_ISSUE_CTRL_CD(no);
					}

					//�ۊǋ�ʓ��o�ɓo�^
					entity.minsertT_RCV_ISSUE.create(conn, issueStruct);

					//���b�g�ʕi�ڍ݌ɍX�V
					BizCommon bc = new BizCommon(conn, sysUSER_CD, sp.getProcId(), plantCD);
					List updateLotStockList = bc.excUpdateLotStockFd(no, "");

					//�ُ�I���̏ꍇ
					if(bc.getResultStatus().intValue() == 3){
						//�G���[���b�Z�[�W�擾
						if(updateLotStockList != null && updateLotStockList.size() > 0){
							csvExport(parStruct					// �Ώۃf�[�^���
									, "1"						// �G���[�敪
									, m + 1						// �G���[�����s
									,null
									,new ExpjMessage((String)updateLotStockList.get(0)).getMessage(_locale)
									,null);	// �G���[���b�Z�[�W
							_intErrorCount++;
						}
						return false;
					}

					//���b�g�Ǘ��t���O = 1(���b�g�g���[�X�Ǘ����s���B)�̏ꍇ
					if(parStruct.getLOT_CTRL_FLG().equals("1")){
						//�e�i�ڂ̍݌Ƀ��b�g�ԍ����w�肳��Ă���ꍇ
						if(parStruct.getLOT_NO() != null && !parStruct.getLOT_NO().equals("")){
							//���b�g�g���[�X�o�^�E�X�V����
							List lotTraceList = bc.excMakeLotTraceFd(issueStruct.getITEM_CD(),
								issueStruct.getLOT_NO(), parStruct.getITEM_CD(), parStruct.getLOT_NO(),
								"3");
							
							//����I���̏ꍇ
							if(bc.getResultStatus().intValue() == 1){
								AD0110010Struct updateStruct = new AD0110010Struct();
								updateStruct.setFROM_ITEM_CD(issueStruct.getITEM_CD());
								updateStruct.setFROM_LOT_NO(issueStruct.getLOT_NO());
								updateStruct.setTO_ITEM_CD(parStruct.getITEM_CD());
								updateStruct.setTO_LOT_NO(parStruct.getLOT_NO());
								updateStruct.setTO_PUCH_ODR_CD(null);
								updateStruct.setsUser_ID(getsysUSER_CD());
								
								// �������ԍ����擾����
								List fromPuchOdrNoList = entity.mgetFROM_PUCH_ODR_CD.read(conn, updateStruct);
								if (fromPuchOdrNoList != null && fromPuchOdrNoList.size() > 0) {
									AD0110010Struct puchStruct = (AD0110010Struct)fromPuchOdrNoList.get(0);
									updateStruct.setFROM_PUCH_ODR_CD(puchStruct.getFROM_PUCH_ODR_CD());
								} else {
									updateStruct.setFROM_PUCH_ODR_CD(null);
								}
								entity.mupdateT_LOT_TRACE.update(conn, updateStruct);
							}
							
							//�ُ�I���̏ꍇ
							if(bc.getResultStatus().intValue() == 3){
								//�G���[���b�Z�[�W�擾
								if(lotTraceList != null && lotTraceList.size() > 0){
									csvExport(parStruct					// �Ώۃf�[�^���
											, "1"						// �G���[�敪
											, m + 1						// �G���[�����s
											,null
											,new ExpjMessage((String)lotTraceList.get(0)).getMessage(_locale)
											,null);	// �G���[���b�Z�[�W
									_intErrorCount++;
								}
								return false;
							}
						}
					}

					//�g�p�c�����Z
					remainQty = remainQty.subtract(new BigDecimal(lotUseStruct.getTOTAL_ISSUE_QTY()));

					//�g�p�c����0�ȉ��̏ꍇ���[�v�I��
					if (remainQty.doubleValue() <= 0) {
						break;
					}
				}
			//���b�g�Ǘ��t���O = 1(���b�g�g���[�X�Ǘ����s���B)�łȂ��ꍇ
			} else {
				//�ۊǋ�ʓ��o�ɓo�^
				entity.minsertT_RCV_ISSUE.create(conn, issueStruct);
			}
		}
		
		return result;
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
		warningFlg = false;
		AD0110010Struct csvStruct = new AD0110010Struct();
		try {
			for (int i = 0; i < csvList.size(); i++)	{
				csvStruct = (AD0110010Struct)csvList.get(i);
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
				// �ȉ��H��R�[�h�̃`�F�b�N
				// �H��R�[�h�A NULL�̏ꍇ
				if (isNull(csvStruct.getPLANT_CD())) {
					csvExport(csvStruct						// �Ώۃf�[�^���
							, "1"							// �G���[�敪
							, i + 1							// �G���[�����s
							, "Expj.ISSUE_PLANT_CD"			// �G���[���ږ�
							, new ExpjMessage("AA02007").getMessage(_locale)		// �G���[���b�Z�[�W
							, null
							); 
					_intErrorCount++;
					continue;
				}else{
					// �H��R�[�h�A����3���ȏ�̏ꍇ
					if (strLengthChk(csvStruct.getPLANT_CD()) >= 3){
						csvExport(csvStruct						// �Ώۃf�[�^���
								, "1"							// �G���[�敪
								, i + 1							// �G���[�����s
								, "Expj.ISSUE_PLANT_CD"			// �G���[���ږ�
								, new ExpjMessage("AA01501").getMessage(_locale)		// �G���[���b�Z�[�W
								, null
								); 
						_intErrorCount++;
						continue;
					}
					// �H��R�[�h�A�֑����������͂���Ă����ꍇ
					if (chkHankaku(csvStruct.getPLANT_CD())) {
						csvExport(csvStruct						// �Ώۃf�[�^���
								, "1"							// �G���[�敪
								, i + 1							// �G���[�����s
								, "Expj.ISSUE_PLANT_CD"			// �G���[���ږ�
								, new ExpjMessage("AA01524").getMessage(_locale)		// �G���[���b�Z�[�W
								, null
								); 
						_intErrorCount++;
						continue;
					}
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
				// �ȉ���Ƌ�R�[�h�̃`�F�b�N
				// ��Ƌ�R�[�h�ANULL�̏ꍇ
				if (isNull(csvStruct.getWS_CD())) {
					csvExport(csvStruct							// �Ώۃf�[�^���
							, "1"								// �G���[�敪
							, i + 1								// �G���[�����s
							, "Expj.WS_CD"		// �G���[���ږ�
							, new ExpjMessage("AD20057").getMessage(_locale)			// �G���[���b�Z�[�W
							, null
							); 
					_intErrorCount++;
					continue;
				}else{
					// ��Ƌ�R�[�h�A����26���ȏ�̏ꍇ
					if (strLengthChk(csvStruct.getWS_CD()) >= 26) {
						csvExport(csvStruct							// �Ώۃf�[�^���
								, "1"								// �G���[�敪
								, i + 1								// �G���[�����s
								, "Expj.WS_CD"		// �G���[���ږ�
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
								, "Expj.WS_CD"		// �G���[���ږ�
								, new ExpjMessage("AA01524").getMessage(_locale)			// �G���[���b�Z�[�W
								, null
								); 
						_intErrorCount++;
						continue;
					}
				}
				// �ȉ���Ɠ��̃`�F�b�N
				// ��Ɠ��ANULL�̏ꍇ
				if (isNull(csvStruct.getOPR_DATE())) {
					csvExport(csvStruct
							 , "1"								// �G���[�敪
							 , i + 1							// �G���[�s�ԍ�
							 , "Expj.OPR_DATE_3"				// �G���[���ږ�
							 , new ExpjMessage("AD20059").getMessage(_locale)// �G���[���b�Z�[�W
							, null
							 );	
					_intErrorCount++;
					continue;
				}else{
					// ��Ɠ��A���t�^�łȂ��ꍇ
					if (!checkDate(csvStruct.getOPR_DATE())) {
						csvExport(csvStruct
								 , "1"								// �G���[�敪
								 , i + 1							// �G���[�s�ԍ�
								 , "Expj.OPR_DATE_3"				// �G���[���ږ�
								 , new ExpjMessage("AA01606").getMessage(_locale)// �G���[���b�Z�[�W
								 , null
								 );	
						_intErrorCount++;
						continue;
					}
				}
				
				// �ȉ��ۊǋ�R�[�h�̃`�F�b�N
				if (!isNull(csvStruct.getWH_CD())) {
					// �ۊǋ�R�[�h�A����26���ȏ�̏ꍇ
					if (strLengthChk(csvStruct.getWH_CD()) >= 26) {
						csvExport(csvStruct
								 , "1"								// �G���[�敪
								 , i + 1							// �G���[�s�ԍ�
								 , "Expj.WH_CD"						// �G���[���ږ�
								 , new ExpjMessage("AA01501").getMessage(_locale)// �G���[���b�Z�[�W
								 , null 
								);	
						_intErrorCount++;
						continue;
					}
					// �ۊǋ�R�[�h�A�֑����������͂���Ă����ꍇ
					if (chkHankaku(csvStruct.getWH_CD())) {
						csvExport(csvStruct
								 , "1"								// �G���[�敪
								 , i + 1							// �G���[�s�ԍ�
								 , "Expj.WH_CD"						// �G���[���ږ�
								 , new ExpjMessage("AA01524").getMessage(_locale)// �G���[���b�Z�[�W
								 , null 
								);	
						_intErrorCount++;
						continue;
					}
				}

				// �ȉ��Ǖi���̃`�F�b�N
				// �Ǖi���ANULL�̏ꍇ
				if (isNull(csvStruct.getACPT_QTY())) {
					csvExport(csvStruct
							 , "1"								// �G���[�敪
							 , i + 1							// �G���[�s�ԍ�
							 , "Expj.ACPT_QTY"					// �G���[���ږ�
							 , new ExpjMessage("AD34028").getMessage(_locale)// �G���[���b�Z�[�W
							 , null 
							);	
					_intErrorCount++;
					continue;
				}else{
					// �Ǖi���A���l�ȊO�̏ꍇ
					if (!isNumChk(csvStruct.getACPT_QTY())) {
						csvExport(csvStruct
								 , "1"								// �G���[�敪
								 , i + 1							// �G���[�s�ԍ�
								 , "Expj.ACPT_QTY"					// �G���[���ږ�
								 , new ExpjMessage("AA01503").getMessage(_locale)// �G���[���b�Z�[�W
								 , null 
								);	
						_intErrorCount++;
						continue;
					}
					// �Ǖi���A0�����̏ꍇ
					if (Calculate.compare(csvStruct.getACPT_QTY(), "0") == -1) {
						csvExport(csvStruct
								 , "1"								// �G���[�敪
								 , i + 1							// �G���[�s�ԍ�
								 , "Expj.ACPT_QTY"				// �G���[���ږ�
								 , new ExpjMessage("AD34026").getMessage(_locale)// �G���[���b�Z�[�W
								 , null
								);	
						_intErrorCount++;
						continue;
					}
					// �Ǖi���A������14���ȏ�A�܂��́A�����_�ȉ�5���ȏ�̏ꍇ
					if (!isNotInNumRange(csvStruct.getACPT_QTY(), 14, 4)) {
						csvExport(csvStruct
								 , "1"								// �G���[�敪
								 , i + 1							// �G���[�s�ԍ�
								 , "Expj.ACPT_QTY"				// �G���[���ږ�
								 , new ExpjMessage("AA01501").getMessage(_locale)	// �G���[���b�Z�[�W
								 , null
								 );
						_intErrorCount++;
						continue;
					}
				}
				
				// �ȉ��s�ǐ��̃`�F�b�N
				// �s�ǐ��A���l�ȊO�̏ꍇ
				if (!isNumChk(csvStruct.getDEFECT_QTY())) {
					csvExport(csvStruct, "1" // �G���[�敪
							, i + 1 // �G���[�s�ԍ�
							, "Expj.DEFECT_INSPC_QTY_2" // �G���[���ږ�
							, new ExpjMessage("AA01503").getMessage(_locale)// �G���[���b�Z�[�W
							, null);
					_intErrorCount++;
					continue;
				}
				// �s�ǐ��A0�����̏ꍇ
				if (Calculate.compare(csvStruct.getDEFECT_QTY(), "0") == -1) {
					csvExport(csvStruct, "1" // �G���[�敪
							, i + 1 // �G���[�s�ԍ�
							, "Expj.DEFECT_INSPC_QTY_2" // �G���[���ږ�
							, new ExpjMessage("AD34026").getMessage(_locale)// �G���[���b�Z�[�W
							, null);
					_intErrorCount++;
					continue;
				}
				// �s�ǐ��A������14���ȏ�A�܂��́A�����_�ȉ�5���ȏ�̏ꍇ
				if (!isNotInNumRange(csvStruct.getDEFECT_QTY(), 14, 4)) {
					csvExport(csvStruct, "1" // �G���[�敪
							, i + 1 // �G���[�s�ԍ�
							, "Expj.DEFECT_INSPC_QTY_2" // �G���[���ږ�
							, new ExpjMessage("AA01501").getMessage(_locale)// �G���[���b�Z�[�W
							, null);
					_intErrorCount++;
					continue;
				}

				// �ȉ��s�Ǘ��R�R�[�h�̃`�F�b�N
				if (!isNull(csvStruct.getDEFECT_CAUSE_CD())) {
					// �s�Ǘ��R�R�[�h�A���l�ȊO�̏ꍇ
					if (!isNumChk(csvStruct.getDEFECT_CAUSE_CD())) {
						csvExport(csvStruct
								, "1"										// �G���[�敪
								, i + 1										// �G���[�s�ԍ�
								, "Expj.DEFECT_CAUSE_CD"					// �G���[���ږ�
								, new ExpjMessage("AA01503").getMessage(_locale)// �G���[���b�Z�[�W
								, null);	
						_intErrorCount++;
						continue;
					}
					// �s�Ǘ��R�R�[�h�ANull�ł͂Ȃ��A���A�i0,1,2,3,4,5,6,7,8,9,10�j�ȊO�̏ꍇ
					boolean comFlag1 = checkCombValue(_DEFECT_CAUSE_CD_INNER, csvStruct.getDEFECT_CAUSE_CD());
					if (comFlag1 == false) {
						csvExport(csvStruct
								, "1"										// �G���[�敪
								, i + 1										// �G���[�s�ԍ�
								, "Expj.DEFECT_CAUSE_CD"					// �G���[���ږ�
								, new ExpjMessage("AA01504").getMessage(_locale)// �G���[���b�Z�[�W
								, null);	
						_intErrorCount++;
						continue;
					}
				}
				
				// �ȉ��s�ǔ��l�̃`�F�b�N
				if (!isNull(csvStruct.getDEFECT_COMMENT())) {
					// �s�ǔ��l�A����8�P���ȏ�̏ꍇ
					if (strLengthChk(csvStruct.getDEFECT_COMMENT()) >= 81) {
						csvExport(csvStruct
								, "1"										// �G���[�敪
								, i + 1										// �G���[�s�ԍ�
								, "Expj.DEFECT_COMMENT"					// �G���[���ږ�
								, new ExpjMessage("AA01501").getMessage(_locale)// �G���[���b�Z�[�W
								, null);	
						_intErrorCount++;
						continue;
					}
					// �s�ǔ��l�A�֑����������͂���Ă����ꍇ
					if (chkHankaku(csvStruct.getDEFECT_COMMENT())) {
						csvExport(csvStruct
								, "1"										// �G���[�敪
								, i + 1										// �G���[�s�ԍ�
								, "Expj.DEFECT_COMMENT"					// �G���[���ږ�
								, new ExpjMessage("AA01524").getMessage(_locale)// �G���[���b�Z�[�W
								, null);	
						_intErrorCount++;
						continue;
					}
				}
				
				// �ȉ���ƒS���҃R�[�h�̃`�F�b�N
				if (!isNull(csvStruct.getOUTPUT_RSLT_PERSON())) {
					// ��ƒS���҃R�[�h�A����41���ȏ�̏ꍇ
					if (strLengthChk(csvStruct.getOUTPUT_RSLT_PERSON()) >= 41) {
						csvExport(csvStruct
								, "1"										// �G���[�敪
								, i + 1										// �G���[�s�ԍ�
								, "Expj.Cmt6216"					// �G���[���ږ�
								, new ExpjMessage("AA01501").getMessage(_locale)// �G���[���b�Z�[�W
								, null);	
						_intErrorCount++;
						continue;
					}
					// ��ƒS���҃R�[�h�A�֑����������͂���Ă����ꍇ
					if (chkHankaku(csvStruct.getOUTPUT_RSLT_PERSON())) {
						csvExport(csvStruct
								, "1"										// �G���[�敪
								, i + 1										// �G���[�s�ԍ�
								, "Expj.Cmt6216"					// �G���[���ږ�
								, new ExpjMessage("AA01524").getMessage(_locale)// �G���[���b�Z�[�W
								, null);	
						_intErrorCount++;
						continue;
					}
				}
				
				// �ȉ���Ǝ��ԒP�ʋ敪�̃`�F�b�N
				// ��Ǝ��ԒP�ʋ敪�A���l�ȊO�̏ꍇ
				if (!isNumChk(csvStruct.getOPR_TIME_UNIT_TYP())) {
					csvExport(csvStruct, "1" // �G���[�敪
							, i + 1 // �G���[�s�ԍ�
							, "Expj.OPR_TIME_UNIT_TYP" // �G���[���ږ�
							, new ExpjMessage("AA01503").getMessage(_locale)// �G���[���b�Z�[�W
							, null);
					_intErrorCount++;
					continue;
				}
				// ��Ǝ��ԒP�ʋ敪�ANull�ł͂Ȃ��A���A�i1�C2�j�ȊO�̏ꍇ
				boolean ptuFlg = checkCombValue(_OPR_TIME_UNIT_TYP,
						csvStruct.getOPR_TIME_UNIT_TYP());
				if (ptuFlg == false) {
					csvExport(csvStruct, "1" // �G���[�敪
							, i + 1 // �G���[�s�ԍ�
							, "Expj.OPR_TIME_UNIT_TYP" // �G���[���ږ�
							, new ExpjMessage("AD00226").getMessage(_locale)// �G���[���b�Z�[�W
							, null);
					_intErrorCount++;
					continue;
				}

				// �ȉ���Ǝ��Ԃ̃`�F�b�N
				// ��Ǝ��ԁA���l�ȊO�̏ꍇ
				if (!isNumChk(csvStruct.getOPR_TIME())) {
					csvExport(csvStruct, "1" // �G���[�敪
							, i + 1 // �G���[�s�ԍ�
							, "Expj.OPR_TIME" // �G���[���ږ�
							, new ExpjMessage("AA01503").getMessage(_locale) // �G���[���b�Z�[�W
							, null);
					_intErrorCount++;
					continue;
				}
				// ��Ǝ��ԁA0�����̏ꍇ
				if (Calculate.compare(csvStruct.getOPR_TIME(), "0") == -1) {
					csvExport(csvStruct, "1" // �G���[�敪
							, i + 1 // �G���[�s�ԍ�
							, "Expj.OPR_TIME" // �G���[���ږ�
							, new ExpjMessage("AD34026").getMessage(_locale)// �G���[���b�Z�[�W
							, null);
					_intErrorCount++;
					continue;
				}
				// ��Ǝ��ԁA������14���ȏ�A�܂��́A�����_�ȉ�5���ȏ�̏ꍇ
				if (!isNotInNumRange(csvStruct.getOPR_TIME(), 14, 4)) {
					csvExport(csvStruct, "1" // �G���[�敪
							, i + 1 // �G���[�s�ԍ�
							, "Expj.OPR_TIME" // �G���[���ږ�
							, new ExpjMessage("AA01501").getMessage(_locale)// �G���[���b�Z�[�W
							, null);
					_intErrorCount++;
					continue;
				}
				// �ȉ��������b�g�ԍ��̃`�F�b�N
				if (!isNull(csvStruct.getVEND_LOT_NO())) {
					// �������b�g�ԍ��A����26���ȏ�̏ꍇ
					if (strLengthChk(csvStruct.getVEND_LOT_NO()) >= 26) {
						csvExport(csvStruct
								, "1"										// �G���[�敪
								, i + 1										// �G���[�s�ԍ�
								, "Expj.VEND_LOT_NO_1"						// �G���[���ږ�
								, new ExpjMessage("AA01501").getMessage(_locale)
								, null);	// �G���[���b�Z�[�W
						_intErrorCount++;
						continue;
					}
					// �������b�g�ԍ��A�֑����������͂���Ă����ꍇ
					if (chkHankaku(csvStruct.getVEND_LOT_NO())) {
						csvExport(csvStruct
								, "1"										// �G���[�敪
								, i + 1										// �G���[�s�ԍ�
								, "Expj.VEND_LOT_NO_1"						// �G���[���ږ�
								, new ExpjMessage("AA01524").getMessage(_locale)
								, null);	// �G���[���b�Z�[�W
						_intErrorCount++;
						continue;
					}
				}
				
				// �ȉ��݌Ƀ��b�g�ԍ��̃`�F�b�N
				if (!isNull(csvStruct.getLOT_NO())) {
					// �݌Ƀ��b�g�ԍ��A����26���ȏ�̏ꍇ
					if (strLengthChk(csvStruct.getLOT_NO()) >= 26) {
						csvExport(csvStruct
								, "1"										// �G���[�敪
								, i + 1										// �G���[�s�ԍ�
								, "Expj.STOCK_LOT_CD"						// �G���[���ږ�
								, new ExpjMessage("AA01501").getMessage(_locale)
								, null);	// �G���[���b�Z�[�W
						_intErrorCount++;
						continue;
					}
					// �݌Ƀ��b�g�ԍ��A�֑����������͂���Ă����ꍇ
					if (chkHankaku(csvStruct.getLOT_NO())) {
						csvExport(csvStruct
								, "1"										// �G���[�敪
								, i + 1										// �G���[�s�ԍ�
								, "Expj.STOCK_LOT_CD"						// �G���[���ږ�
								, new ExpjMessage("AA01524").getMessage(_locale)
								, null);	// �G���[���b�Z�[�W
						_intErrorCount++;
						continue;
					}
				}
				
				// �ȉ��O�i�掞�Ԃ̃`�F�b�N
				// �O�i�掞�ԁA���l�ȊO�̏ꍇ
				if (!isNumChk(csvStruct.getPRE_ARRANGEMENT_TIME())) {
					csvExport(csvStruct,
							"1" // �G���[�敪
							,
							i + 1 // �G���[�s�ԍ�
							,
							"Expj.PRE_ARRANGEMENT_TIME" // �G���[���ږ�
							, new ExpjMessage("AA01503").getMessage(_locale),
							null); // �G���[���b�Z�[�W
					_intErrorCount++;
					continue;
				}
				// �O�i�掞�ԁA0�����̏ꍇ
				if (Calculate.compare(csvStruct.getPRE_ARRANGEMENT_TIME(), "0") == -1) {
					csvExport(csvStruct,
							"1" // �G���[�敪
							,
							i + 1 // �G���[�s�ԍ�
							,
							"Expj.PRE_ARRANGEMENT_TIME" // �G���[���ږ�
							, new ExpjMessage("AD34026").getMessage(_locale),
							null); // �G���[���b�Z�[�W
					_intErrorCount++;
					continue;
				}
				// �O�i�掞�ԁA������14���ȏ�A�܂��́A�����_�ȉ�5���ȏ�̏ꍇ
				if (!isNotInNumRange(csvStruct.getPRE_ARRANGEMENT_TIME(), 14, 4)) {
					csvExport(csvStruct,
							"1" // �G���[�敪
							,
							i + 1 // �G���[�s�ԍ�
							,
							"Expj.PRE_ARRANGEMENT_TIME" // �G���[���ږ�
							, new ExpjMessage("AA01501").getMessage(_locale),
							null); // �G���[���b�Z�[�W
					_intErrorCount++;
					continue;
				}
				
				// �ȉ���i�掞�Ԃ̃`�F�b�N
				// ����i�掞�ԁA���l�ȊO�̏ꍇ
				if (!isNumChk(csvStruct.getPOST_ARRANGEMENT_TIME())) {
					csvExport(csvStruct,
							"1" // �G���[�敪
							,
							i + 1 // �G���[�s�ԍ�
							,
							"Expj.POST_ARRANGEMENT_TIME" // �G���[���ږ�
							, new ExpjMessage("AA01503").getMessage(_locale),
							null); // �G���[���b�Z�[�W
					_intErrorCount++;
					continue;
				}
				// ����i�掞�ԁA0�����̏ꍇ
				if (Calculate
						.compare(csvStruct.getPOST_ARRANGEMENT_TIME(), "0") == -1) {
					csvExport(csvStruct,
							"1" // �G���[�敪
							,
							i + 1 // �G���[�s�ԍ�
							,
							"Expj.POST_ARRANGEMENT_TIME" // �G���[���ږ�
							, new ExpjMessage("AD34026").getMessage(_locale),
							null); // �G���[���b�Z�[�W
					_intErrorCount++;
					continue;
				}
				// ����i�掞�ԁA������14���ȏ�A�܂��́A�����_�ȉ�5���ȏ�̏ꍇ
				if (!isNotInNumRange(csvStruct.getPOST_ARRANGEMENT_TIME(), 14,
						4)) {
					csvExport(csvStruct,
							"1" // �G���[�敪
							,
							i + 1 // �G���[�s�ԍ�
							,
							"Expj.POST_ARRANGEMENT_TIME" // �G���[���ږ�
							, new ExpjMessage("AA01501").getMessage(_locale),
							null); // �G���[���b�Z�[�W
					_intErrorCount++;
					continue;
				}
				
				// �ȉ���~���Ԃ̃`�F�b�N
				// ��~���ԁA���l�ȊO�̏ꍇ
				if (!isNumChk(csvStruct.getCESSATION_TIME())) {
					csvExport(csvStruct,
							"1" // �G���[�敪
							,
							i + 1 // �G���[�s�ԍ�
							,
							"Expj.CESSATION_TIME" // �G���[���ږ�
							, new ExpjMessage("AA01503").getMessage(_locale),
							null); // �G���[���b�Z�[�W
					_intErrorCount++;
					continue;
				}
				// ��~���ԁA0�����̏ꍇ
				if (Calculate.compare(csvStruct.getCESSATION_TIME(), "0") == -1) {
					csvExport(csvStruct,
							"1" // �G���[�敪
							,
							i + 1 // �G���[�s�ԍ�
							,
							"Expj.CESSATION_TIME" // �G���[���ږ�
							, new ExpjMessage("AD34026").getMessage(_locale),
							null); // �G���[���b�Z�[�W
					_intErrorCount++;
					continue;
				}
				// ��~���ԁA������14���ȏ�A�܂��́A�����_�ȉ�5���ȏ�̏ꍇ
				if (!isNotInNumRange(csvStruct.getCESSATION_TIME(), 14, 4)) {
					csvExport(csvStruct,
							"1" // �G���[�敪
							,
							i + 1 // �G���[�s�ԍ�
							,
							"Expj.CESSATION_TIME" // �G���[���ږ�
							, new ExpjMessage("AA01501").getMessage(_locale),
							null); // �G���[���b�Z�[�W
					_intErrorCount++;
					continue;
				}
				
				// �ȉ���~���R�̃`�F�b�N
				if (!isNull(csvStruct.getCESSATION_CAUSE())) {
					// ��~���R�A����8�P���ȏ�̏ꍇ
					if (strLengthChk(csvStruct.getCESSATION_CAUSE()) >= 81) {
						csvExport(csvStruct
								, "1"													// �G���[�敪
								, i + 1													// �G���[�s�ԍ�
								, "Expj.CESSATION_CAUSE"								// �G���[���ږ�
								, new ExpjMessage("AA01501").getMessage(_locale)
								, null);		// �G���[���b�Z�[�W
						_intErrorCount++;
						continue;
					}
					// ��~���R�A�֑����������͂���Ă����ꍇ
					if (chkHankaku(csvStruct.getCESSATION_CAUSE())) {
						csvExport(csvStruct
								, "1"													// �G���[�敪
								, i + 1													// �G���[�s�ԍ�
								, "Expj.CESSATION_CAUSE"								// �G���[���ږ�
								, new ExpjMessage("AA01524").getMessage(_locale)
								, null);		// �G���[���b�Z�[�W
						_intErrorCount++;
						continue;
					}
				}
				
				// �ȉ����l�̃`�F�b�N
				if (!isNull(csvStruct.getOUTPUT_RSLT_COMMENT())) {
					// ���l�A����8�P���ȏ�̏ꍇ
					if (strLengthChk(csvStruct.getOUTPUT_RSLT_COMMENT()) >= 81) {
						csvExport(csvStruct
								, "1"													// �G���[�敪
								, i + 1													// �G���[�s�ԍ�
								, "Expj.ISSUE_INST_COMMENT_1"							// �G���[���ږ�
								, new ExpjMessage("AA01501").getMessage(_locale)
								, null);		// �G���[���b�Z�[�W
						_intErrorCount++;
						continue;
					}
					// ���l�A�֑����������͂���Ă����ꍇ
					if (chkHankaku(csvStruct.getOUTPUT_RSLT_COMMENT())) {
						csvExport(csvStruct
								, "1"													// �G���[�敪
								, i + 1													// �G���[�s�ԍ�
								, "Expj.ISSUE_INST_COMMENT_1"							// �G���[���ږ�
								, new ExpjMessage("AA01524").getMessage(_locale)
								, null);		// �G���[���b�Z�[�W
						_intErrorCount++;
						continue;
					}
				}
				
				// �}�X�^�������`�F�b�N
				// ���ی����̒��߂��������Ă�����t�`�F�b�N�A�u�V�X�e���p�����[�^�v�D�ݒ�l=�gfalse�h�̏ꍇ�A�u��Ɠ��v�̔N�� �iYYYY/MM�j��[���ی����Ǘ��p�����[�^].�g�Ώ۔N���h���ߋ��̏ꍇ
				if ("false".equals(strValus)) {
					if(!checkProcExecDate(csvStruct.getOPR_DATE(),csvStruct.getPLANT_CD(),struct)){
						csvExport(csvStruct
								, "1"													// �G���[�敪
								, i + 1													// �G���[�s�ԍ�
								, "Expj.Cmt5833"							// �G���[���ږ�
								, new ExpjMessage("AE00160").getMessage(_locale)
								, null);		// �G���[���b�Z�[�W
						_intErrorCount++;
						continue;
					}
				}
				// �u�i�ڔԍ��v �ɓ��͂��ꂽ�l�� [�i��] �ɑ��݂��Ȃ��ꍇ
				List itemCdList = entity.mselectItem_CD.read(conn, csvStruct);
				if (itemCdList.isEmpty()) {
					csvExport(csvStruct
							, "1"													// �G���[�敪
							, i + 1													// �G���[�s�ԍ�
							, "Expj.ITEM_CD"										// �G���[���ږ�
							, new ExpjMessage("AD00019").getMessage(_locale)
							, null);		// �G���[���b�Z�[�W
					_intErrorCount++;
					continue;
				}else{
					mItemStruct = (AD0110010Struct)itemCdList.get(0);
					csvStruct.setLOT_CTRL_FLG(mItemStruct.getLOT_CTRL_FLG());
					//[�i�ڕʎd�|].�g�i�ڔԍ��h �� �u�i�ڔԍ��v ���A[�i�ڕʎd�|].�g��Ǝ��ы敪�h �� 1�F�o�������� ���A[�i�ڕʎd�|].�g�i�ڕʍ�Ə�ԋ敪�h �� 2�F�w���ς� ���� [�i�ڕʎd�|].�g�H��R�[�h�h �� �u�H��R�[�h�v��1�������݂��Ȃ��ꍇ
					boolean blnTWorkProcByItem = entity.mcheckT_WORK_IN_PROC_BY_ITEM.check(conn, csvStruct);
					if (!blnTWorkProcByItem) {
						csvExport(csvStruct
								, "1"													// �G���[�敪
								, i + 1													// �G���[�s�ԍ�
								, "Expj.PLANT_CD" 										// �G���[���ږ�
								, new ExpjMessage("ZZ06001").getMessage(_locale)
								, "Expj.ITEM_CD");		// �G���[���b�Z�[�W
						_intErrorCount++;
						continue;
					}
				}
				// �u��Ƌ�R�[�h�v�ɓ��͂��ꂽ�l�� [��Ƌ�] �ɑ��݂��Ȃ��ꍇ
				List wsCdList = entity.mselectM_WS.read(conn, csvStruct);
				AD0110010Struct wsCdStruct = new AD0110010Struct();
				if (wsCdList.isEmpty()) {
					csvExport(csvStruct
							, "1"													// �G���[�敪
							, i + 1													// �G���[�s�ԍ�
							, "Expj.Cmt6189"										// �G���[���ږ�
							, new ExpjMessage("AD20029").getMessage(_locale)
							, null);		// �G���[���b�Z�[�W
					_intErrorCount++;
					continue;
				}else{
					wsCdStruct = (AD0110010Struct)wsCdList.get(0);
					// �u��Ƌ�R�[�h�v�ɑ΂���H��R�[�h�Ɓu�H��R�[�h�v����v���Ȃ��ꍇ
					if (!csvStruct.getPLANT_CD().equals(wsCdStruct.getvc2PLANT_CD())) {
						csvExport(csvStruct
								, "1"													// �G���[�敪
								, i + 1													// �G���[�s�ԍ�
								, "Expj.Cmt6189"										// �G���[���ږ�
								, new ExpjMessage("AD00004").getMessage(_locale)
								, null);		// �G���[���b�Z�[�W
						_intErrorCount++;
						continue;
					}
				}
				
				// �u�ۊǋ�R�[�h�v �ɓ��͂��ꂽ�l�� [�ۊǋ�] �ɑ��݂��Ȃ��ꍇ
				if (!isNull(csvStruct.getWH_CD())) {
					List whCdList = entity.mselectM_WH.read(conn, csvStruct);
					AD0110010Struct whCdStruct = new AD0110010Struct();
					if (whCdList.isEmpty()) {
						csvExport(csvStruct
								, "1"													// �G���[�敪
								, i + 1													// �G���[�s�ԍ�
								, "Expj.WH_CD"											// �G���[���ږ�
								, new ExpjMessage("AD00020").getMessage(_locale)
								, null);		// �G���[���b�Z�[�W
						_intErrorCount++;
						continue;
					}else{
						whCdStruct = (AD0110010Struct)whCdList.get(0);
						// �u�ۊǋ�R�[�h�v�̍H��R�[�h�Ɓu�H��R�[�h�v����v���Ȃ��ꍇ
						if (!csvStruct.getPLANT_CD().equals(whCdStruct.getvc2PLANT_CD())) {
							csvExport(csvStruct
									, "1"													// �G���[�敪
									, i + 1													// �G���[�s�ԍ�
									, "Expj.WH_CD"											// �G���[���ږ�
									, new ExpjMessage("AA01007").getMessage(_locale)
									, null);		// �G���[���b�Z�[�W
							_intErrorCount++;
							continue;
						}
					}
				}
				
				// �u��Ɠ��v�� ������(�Ɩ��^�p����薢��) ����͂��ꂽ�ꍇ
				// �Ɩ��^�p��
				BigDecimal decimalBusinessDate = new BigDecimal(_btmBusinessOprDate.substring(0,4) + 
						_btmBusinessOprDate.substring(5,7)+ _btmBusinessOprDate.substring(8,10));
				// ��Ɠ�
				BigDecimal decimalOprDate = new BigDecimal(chageDate(csvStruct.getOPR_DATE()).substring(0,4) + 
						chageDate(csvStruct.getOPR_DATE()).substring(5,7)+ chageDate(csvStruct.getOPR_DATE()).substring(8,10));
				if (decimalOprDate.compareTo(decimalBusinessDate) > 0) {
					csvExport(csvStruct
							, "1"													// �G���[�敪
							, i + 1													// �G���[�s�ԍ�
							, "Expj.Cmt5833"										// �G���[���ږ�
							, new ExpjMessage("AD30773").getMessage(_locale)
							, null);		// �G���[���b�Z�[�W
					_intErrorCount++;
					continue;
				}
				
				BigDecimal decimalAcptQty2 = new BigDecimal("0");
				BigDecimal decimalAcptQty = new BigDecimal(csvStruct.getACPT_QTY());

				BigDecimal decimalDefectQty = new BigDecimal(csvStruct.getDEFECT_QTY());
				BigDecimal decimalDefectQty2 = new BigDecimal("0");
				
				//�u�Ǖi���v > 0�A���A[�i��].�h���b�g�Ǘ��t���O�h��1�F���b�g�Ǘ����s���A���A[�i��].�h���b�g�ԍ��̔ԋ敪�h��0�F����́A���A�u�݌Ƀ��b�g�ԍ��v�������͂̏ꍇ
				decimalAcptQty2 = new BigDecimal("0");
				// �u�Ǖi���v > 0
				if (decimalAcptQty.compareTo(decimalAcptQty2) > 0) {
					// [�i��].�h���b�g�Ǘ��t���O�h��1�F���b�g�Ǘ����s��
					if ("1".equals(mItemStruct.getLOT_CTRL_FLG())) {
						// [�i��].�h���b�g�ԍ��̔ԋ敪�h��0�F�����
						if ( "0".equals(mItemStruct.getLOT_NUMBERING_TYP())){
								// �u�݌Ƀ��b�g�ԍ��v��������
								if (isNull(csvStruct.getLOT_NO())) {
									csvExport(csvStruct
											, "1"													// �G���[�敪
											, i + 1													// �G���[�s�ԍ�
											, "Expj.STOCK_LOT_CD"									// �G���[���ږ�
											, new ExpjMessage("AE20600").getMessage(_locale)
											, null);		// �G���[���b�Z�[�W
									_intErrorCount++;
									continue;
								}
							}
						}
				}else {
					// �u�Ǖi���v �� 0�A���A�u�݌Ƀ��b�g�ԍ��v�����͂���Ă���ꍇ
					if (!isNull(csvStruct.getLOT_NO())) {
						csvExport(csvStruct
								, "1"													// �G���[�敪
								, i + 1													// �G���[�s�ԍ�
								, "Expj.STOCK_LOT_CD"									// �G���[���ږ�
								, new ExpjMessage("AD20139").getMessage(_locale)
								, null);		// �G���[���b�Z�[�W
						_intErrorCount++;
						continue;
					}
				}
				// [�i��].�h���b�g�Ǘ��t���O�h��1�F���b�g�Ǘ����s��
				if ("1".equals(mItemStruct.getLOT_CTRL_FLG())) {
					if ("0".equals(mItemStruct.getLOT_NUMBERING_TYP())) {
						// [�i��].�h���b�g�Ǘ��t���O�h��1�F���b�g�Ǘ����s���A���A�u�݌Ƀ��b�g�ԍ��v��[���b�g�Ǘ�]�ɑ��݂��Ȃ��ꍇ
						if (!isNull(csvStruct.getLOT_NO())) {
							List lotCtrlList = entity.mselectT_LOT_CTRL.read(conn, csvStruct);
							if (lotCtrlList.isEmpty()) {
								csvExport(csvStruct
										, "1"													// �G���[�敪
										, i + 1													// �G���[�s�ԍ�
										, "Expj.STOCK_LOT_CD"									// �G���[���ږ�
										, new ExpjMessage("AE21203").getMessage(_locale)
										, null);		// �G���[���b�Z�[�W
								_intErrorCount++;
								continue;
							}
						}
					}
				}else {
					// [�i��].�h���b�g�Ǘ��t���O�h��1�F���b�g�Ǘ����s���@���A�u�݌Ƀ��b�g�ԍ��v�����͂���Ă���ꍇ
					// �u�݌Ƀ��b�g�ԍ��v������
					if (!isNull(csvStruct.getLOT_NO())) {
						csvExport(csvStruct
								, "1"													// �G���[�敪
								, i + 1													// �G���[�s�ԍ�
								, "Expj.STOCK_LOT_CD"									// �G���[���ږ�
								, new ExpjMessage("AE20601").getMessage(_locale)
								, null);		// �G���[���b�Z�[�W
						_intErrorCount++;
						continue;
					}
				}

				// �s�Ǘ��R�R�[�h�`�F�b�N
				decimalDefectQty2 = new BigDecimal("0");
				if (isNull(csvStruct.getDEFECT_CAUSE_CD())) {
					// �u�s�ǐ��v > 0 �̏ꍇ
					if (decimalDefectQty.compareTo( decimalDefectQty2) > 0) {
						csvExport(csvStruct
								, "1"													// �G���[�敪
								, i + 1													// �G���[�s�ԍ�
								, "Expj.DEFECT_CAUSE_CD"								// �G���[���ږ�
								, new ExpjMessage("AE05039").getMessage(_locale)
								, null);		// �G���[���b�Z�[�W
						_intErrorCount++;
						continue;
					}
				}else {
					// �u�s�Ǘ��R�R�[�h�v��Null ���A�u�s�ǐ��v = 0 ���A�����Ǘ��i�ڂ̏ꍇ
					if (decimalDefectQty.compareTo(decimalDefectQty2) == 0) {
						// �����Ǘ��i��
						if (!isNull(mItemStruct.getUNIT_QTY_TYP()) && "1".equals(mItemStruct.getUNIT_QTY_TYP())) {
							csvExport(csvStruct
									, "1"													// �G���[�敪
									, i + 1													// �G���[�s�ԍ�
									, "Expj.DEFECT_INSPC_QTY_2"								// �G���[���ږ�
									, new ExpjMessage("AE05033").getMessage(_locale)
									, null);		// �G���[���b�Z�[�W
							_intErrorCount++;
							continue;
						}else if (!isNull(mItemStruct.getUNIT_QTY_TYP()) && "2".equals(mItemStruct.getUNIT_QTY_TYP())) {
							csvExport(csvStruct
									, "1"													// �G���[�敪
									, i + 1													// �G���[�s�ԍ�
									, "Expj.DEFECT_INSPC_QTY_2"								// �G���[���ږ�
									, new ExpjMessage("AE05032").getMessage(_locale)
									, null);		// �G���[���b�Z�[�W
							_intErrorCount++;
							continue;
						}
					}
				}
				
				// �u��ƒS���҃R�[�h�v�̍H��R�[�h �� �u�H��R�[�h�v�̏ꍇ
				if (!isNull(csvStruct.getOUTPUT_RSLT_PERSON())) {
					AD0110010Struct userStruct = new AD0110010Struct();
					userStruct.setUSER_CD(csvStruct.getOUTPUT_RSLT_PERSON());
					List userCdList = entity.mselectUSER_MST.read(conn, userStruct);
					if (!userCdList.isEmpty()) {
						userStruct = (AD0110010Struct)userCdList.get(0);
						if (!csvStruct.getPLANT_CD().equals(userStruct.getvc2PLANT_CD())) {
							csvExport(csvStruct
									, "1"													// �G���[�敪
									, i + 1													// �G���[�s�ԍ�
									, "Expj.Cmt6216"										// �G���[���ږ�
									, new ExpjMessage("AD34029").getMessage(_locale)
									, null);		// �G���[���b�Z�[�W
							_intErrorCount++;
							continue;
						}
					}else {
						csvExport(csvStruct
								, "1"													// �G���[�敪
								, i + 1													// �G���[�s�ԍ�
								, "Expj.Cmt6216"										// �G���[���ږ�
								, new ExpjMessage("AD34032").getMessage(_locale)
								, null);		// �G���[���b�Z�[�W
						_intErrorCount++;
						continue;
						
					}
				}
				
				// �Œx�[���̃I�[�_���擾�ł��Ȃ������ꍇ
				List lastList = new ArrayList();
				lastList = entity.mSelectTargetProcByItem1.read(conn, csvStruct);
				//�Ώۃf�[�^�����݂��Ȃ��ꍇ
				if (lastList.isEmpty()) {
					List lastDateList = entity.mSelectCompleteProcByItem1.read(conn, csvStruct);
					if (lastDateList.isEmpty()) {
						csvExport(csvStruct
								, "1"													// �G���[�敪
								, i + 1													// �G���[�s�ԍ�
								, "Expj.PLANT_CD"										// �G���[���ږ�
								, new ExpjMessage("AD34027").getMessage(_locale)
								, "Expj.ITEM_CD");		// �G���[���b�Z�[�W
						_intErrorCount++;
						continue;
					}
				}
				// �����Ǘ��i�ڂŁu�Ǖi���v�܂��́u�s�ǐ��v�ɏ��������͂��ꂽ�ꍇ
				//�Ǖi��
				if (!isNull(mItemStruct.getUNIT_QTY_TYP()) && "1".equals(mItemStruct.getUNIT_QTY_TYP())) {
					//�����Ǘ��i��
					decimalAcptQty2 = decimalAcptQty.setScale(0,BigDecimal.ROUND_DOWN);
					//�؂艺�������O�ƌ�Œl���قȂ��Ă����珬�������͂���Ă����Ɣ��f�����[�j���O�Ƃ���
					if (decimalAcptQty.doubleValue() != decimalAcptQty2.doubleValue()){
						csvExport(csvStruct					// �Ώۃf�[�^���
								, "2"						// �G���[�敪
								, i + 1						// �G���[�����s
								,"Expj.ACPT_QTY"			// �G���[���ږ�
								,new ExpjMessage("AD00087").getMessage(_locale)
								, null);	// �G���[���b�Z�[�W
						if(!warningFlg){
							_intWarningCount++;
							warningFlg = true;
						}
						csvStruct.setACPT_QTY(decimalAcptQty2.toString());
					}		
				}
				// �s�ǐ�
				if (!isNull(mItemStruct.getUNIT_QTY_TYP()) && "1".equals(mItemStruct.getUNIT_QTY_TYP())) {
					//�����Ǘ��i��
					decimalDefectQty2 = decimalDefectQty.setScale(0,BigDecimal.ROUND_DOWN);
					//�؂艺�������O�ƌ�Œl���قȂ��Ă����珬�������͂���Ă����Ɣ��f�����[�j���O�Ƃ���
					if (decimalDefectQty.doubleValue() != decimalDefectQty2.doubleValue()){
						csvExport(csvStruct					// �Ώۃf�[�^���
								, "2"						// �G���[�敪
								, i + 1						// �G���[�����s
								,"Expj.DEFECT_QTY"			// �G���[���ږ�
								,new ExpjMessage("AD00087").getMessage(_locale)
								, null);	// �G���[���b�Z�[�W
						if(!warningFlg){
							_intWarningCount++;
							warningFlg = true;	
						}
						csvStruct.setDEFECT_QTY(decimalDefectQty2.toString());
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
			 ee.setLocale(CoreTools.getLocale(getsysUSER_CD()));
			 throw ee;
		}
	}

	private List readCsvData() throws ExpjException{

		String[] strsCsvData = null;
		List listCsv = new ArrayList();
		try {
			// CSV�f�[�^�̃A�b�v���[�h
			strsCsvData = (String []) csvReader.lineRead();
			if (strsCsvData != null) {
				setSyslogConfig("strsCsvData.length:" + strsCsvData.length);
				// �f�[�^�����Ƃ���strsCsvData.length�͎g���Ȃ��B���ۂ̍s���{�T�s���炢�炵��
				AD0110010Struct structCsv = null;
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
						structCsv = new AD0110010Struct();
						if (CSV_NECESSARY_COLUMN == v.size()) {
							 // �H��R�[�h
							structCsv.setPLANT_CD((String) v.get(CSV_PLANT_CD));
							// �i�ڔԍ��@
							structCsv.setITEM_CD((String) v.get(CSV_ITEM_CD)); 
							// ��Ƌ�R�[�h
							structCsv.setWS_CD((String) v.get(CSV_WS_CD));
							// ��Ɠ�
							structCsv.setOPR_DATE((String) v.get(CSV_OPR_DATE)); 
							// �ۊǋ�R�[�h
							if (isNull((String) v.get(CSV_WH_CD))) {
								structCsv.setWH_CD(ValidateWh.getDefaultOprWh(conn, structCsv.getPLANT_CD(),structCsv.getITEM_CD()));
							} else {
								structCsv.setWH_CD((String) v.get(CSV_WH_CD));
							}
							// �Ǖi��
							structCsv.setACPT_QTY((String) v.get(CSV_ACPT_QTY)); 
							structCsv.setl_ERR_ACPT_QTY_KEEP((String) v.get(CSV_ACPT_QTY));
							// �s�ǐ�
							if (isNull((String) v.get(CSV_DEFECT_QTY))) {
								structCsv.setDEFECT_QTY("0"); 
							}else{
								structCsv.setDEFECT_QTY((String) v.get(CSV_DEFECT_QTY)); 
							}
							structCsv.setl_ERR_DEFECT_QTY_KEEP((String) v.get(CSV_DEFECT_QTY));
							
							// �s�Ǘ��R�R�[�h
							structCsv.setDEFECT_CAUSE_CD((String) v.get(CSV_DEFECT_CAUSE_CD)); 
							// �s�ǔ��l
							structCsv.setDEFECT_COMMENT((String) v.get(CSV_DEFECT_COMMENT)); 
							// ��ƒS���҃R�[�h
							structCsv.setOUTPUT_RSLT_PERSON((String) v.get(CSV_OUTPUT_RSLT_PERSON));
							// ��Ǝ��ԒP�ʋ敪
							if (isNull((String) v.get(CSV_OPR_TIME_UNIT_TYP))) {
								structCsv.setOPR_TIME_UNIT_TYP("1"); 
							}else{
								structCsv.setOPR_TIME_UNIT_TYP((String) v.get(CSV_OPR_TIME_UNIT_TYP)); 
							}
							// ��Ǝ���
							if (isNull((String) v.get(CSV_OPR_TIME))) {
								structCsv.setOPR_TIME("0"); 
							}else{
								structCsv.setOPR_TIME((String) v.get(CSV_OPR_TIME)); 
							}

							// �������b�g�ԍ�
							structCsv.setVEND_LOT_NO((String) v.get(CSV_VEND_LOT_NO)); 
							// �݌Ƀ��b�g�ԍ�
							structCsv.setLOT_NO((String) v.get(CSV_LOT_NO)); 
							structCsv.setl_LOT_NO_KEEP((String) v.get(CSV_LOT_NO)); 
							// �O�i�掞��
							if (isNull((String) v.get(CSV_PRE_ARRANGEMENT_TIME))) {
								structCsv.setPRE_ARRANGEMENT_TIME("0"); 
							}else{
								structCsv.setPRE_ARRANGEMENT_TIME((String) v.get(CSV_PRE_ARRANGEMENT_TIME)); 
							}
							// ��i�掞��
							if (isNull((String) v.get(CSV_POST_ARRANGEMENT_TIME))) {
								structCsv.setPOST_ARRANGEMENT_TIME("0"); 
							}else{
								structCsv.setPOST_ARRANGEMENT_TIME((String) v.get(CSV_POST_ARRANGEMENT_TIME)); 
							}

							// ��~����
							if (isNull((String) v.get(CSV_CESSATION_TIME))) {
								structCsv.setCESSATION_TIME("0"); 
							}else{
								structCsv.setCESSATION_TIME((String) v.get(CSV_CESSATION_TIME)); 
							}
							// ��~���R
							structCsv.setCESSATION_CAUSE((String) v.get(CSV_CESSATION_CAUSE)); 
							// ���l
							structCsv.setOUTPUT_RSLT_COMMENT((String) v.get(CSV_OUTPUT_RSLT_COMMENT)); 

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
	
	private boolean csvExport(AD0110010Struct targetStruct, String errTyp, int errlineNo, String errItem, String errMsg, String errItemCd) {
		AD0110010Struct errStruct = new AD0110010Struct();
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
		// �H��R�[�h
		errStruct.setl_ERR_PLANT_CD(replaceSlashAdd(targetStruct.getPLANT_CD()));
		// �i�ڔԍ�
		errStruct.setl_ERR_ITEM_CD(replaceSlashAdd(targetStruct.getITEM_CD()));	
		// ��Ƌ�R�[�h
		errStruct.setl_ERR_WS_CD(replaceSlashAdd(targetStruct.getWS_CD()));
		// �ۊǋ�R�[�h
		errStruct.setl_ERR_WH_CD(replaceSlashAdd(targetStruct.getWH_CD()));
		// ��Ɠ�
		errStruct.setl_ERR_OPR_DATE(replaceSlashAdd(targetStruct.getOPR_DATE()));
		// �Ǖi��
		errStruct.setl_ERR_ACPT_QTY(replaceSlashAdd(targetStruct.getl_ERR_ACPT_QTY_KEEP()));

		// �s�ǐ�
		errStruct.setl_ERR_DEFECT_QTY(replaceSlashAdd(targetStruct.getl_ERR_DEFECT_QTY_KEEP()));

		// ��Ǝ���
		errStruct.setl_ERR_OPR_TIME(replaceSlashAdd(targetStruct.getOPR_TIME()));
		// �݌Ƀ��b�g�ԍ�
		errStruct.setl_ERR_LOT_NO(replaceSlashAdd(targetStruct.getl_LOT_NO_KEEP()));
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
				warningFlg = false;
				AD0110010Struct cvsStruct = (AD0110010Struct)csvList.get(i);
				
				rtnFlg = insertToutputRlsd (cvsStruct,i);
				if(!rtnFlg) {
					conn.rollback();
					return false;
				}
				
				rtnFlg = insertTOprRslt (cvsStruct,i);
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
	 * CSV�t�F�C�����e�́A�o�������ѓo�^����
	 * @param csvList
	 * @return
	 * @throws FoundationException 
	 */
	private boolean insertToutputRlsd (AD0110010Struct adstruct ,int j) throws ExpjException {
		try {
			// �݌Ƀ��b�g�ԍ��̔ԏ������s���B
			// [�i��]�D�h���b�g�Ǘ��t���O�h�� 1�F���b�g�Ǘ����s�� �A���A[�i��]�D�h���b�g�ԍ��̔ԋ敪�h�� 0:����́A���A
			if ("1".equals(mItemStruct.getLOT_CTRL_FLG()) && !"0".equals(mItemStruct.getLOT_NUMBERING_TYP())){
				BigDecimal bigdAcptQty2   = new BigDecimal("0");
				BigDecimal bigdAcptQty   = new BigDecimal(adstruct.getACPT_QTY());
				// �u�Ǖi���v > 0�A���A��݌Ƀ��b�g�ԍ�� ��Null
				if (bigdAcptQty.compareTo(bigdAcptQty2) > 0 && isNull(adstruct.getLOT_NO())) {
					// �݌Ƀ��b�g�ԍ��̎����̔Ԃ��s���B
					BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
					List retList = bc.getsetLotNumberingFd(adstruct.getITEM_CD(), adstruct.getOPR_DATE());

					// ����I���̏ꍇ
					if (bc.getResultStatus().intValue() == 1) {
						// �݌Ƀ��b�g�ԍ��̎擾
						if (retList != null && retList.size() > 0) {
							strLotNo = (String) retList.get(0);
						}
						// �x�� or �ُ�I���̏ꍇ
					} else {
						// �G���[���b�Z�[�W�̎擾
						if (retList != null && retList.size() > 1) {
							csvExport(adstruct, // �Ώۃf�[�^���
									"1", // �G���[�敪
									j + 1, // �G���[�����s
									null,
									new ExpjMessage((String) retList.get(1)).getMessage(_locale), null); // �G���[���b�Z�[�W
							_intErrorCount++;
							return false;
						}
					}
				} else {
					strLotNo = adstruct.getLOT_NO();
				}
			}else{
				strLotNo = adstruct.getLOT_NO();
			}
			
			// �o�������єԍ��̎����̔�
			Numbering collectNum = 
					new Numbering(conn,
							CollectNumber.OUT_RSLT_CD,
							getsysUSER_CD(),
							sp.getProcId(),
							adstruct.getPLANT_CD());
			strOutputRsldCd = collectNum.getNo();
			if (isNull(strOutputRsldCd)) {
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
			}
			// �o�������єԍ���ݒ肷��B
			adstruct.setOUTPUT_RSLT_CD(strOutputRsldCd);

			adstruct.setLOT_NO(strLotNo);

			adstruct.setsUser_ID(sysUSER_CD);
			// [�o��������]�ւ̒ǉ����e
			entity.minsertT_OUTPUT_RSLT.create(conn, adstruct);
			return true;
		}catch(Exception e) {
			throw new ExpjException(e);
		}
	}
	
	/**
	 * CSV�t�F�C�����e�́A��Ǝ��ѓo�^����
	 * @param csvList
	 * @return
	 * @throws FoundationException 
	 */
	private boolean insertTOprRslt (AD0110010Struct adstruct,int m) throws ExpjException {
		try {
			List targetProcByItemList = entity.mSelectTargetProcByItem.read(conn, adstruct);
			AD0110010Struct targetProcByItemStruct = new AD0110010Struct();
			if (targetProcByItemList.isEmpty()) {

				// �i�ڕʎd�|���Z�b�g����
				procByItemStruct = new AD0110010Struct();
				procByItemStruct = (AD0110010Struct)entity.mSelectCompleteProcByItem.read(conn,adstruct).get(0);
				procByItemStruct.setsUser_ID(sysUSER_CD);
				
				rsltStruct = new AD0110010Struct();
				rsltStruct.setsUser_ID(sysUSER_CD);
				// ��Ǝw���ԍ�
				rsltStruct.setOPR_INST_CD(procByItemStruct.getvc2OPR_INST_CD());

				// �ő啪��񐔁{�P�̃Z�b�g
				List partialPrdNoList = entity.mselectMaxPrdNo.read(conn, rsltStruct);
				AD0110010Struct partialPrdNoStruct = new AD0110010Struct();
				if (!partialPrdNoList.isEmpty()) {
					partialPrdNoStruct = (AD0110010Struct)partialPrdNoList.get(0);
				}
				// �����
				rsltStruct.setPARTIAL_PRD_NO(partialPrdNoStruct.getMAX_PRD_NO());
				// �ۊǋ�R�[�h
				rsltStruct.setWH_CD(adstruct.getWH_CD());
				// �o�������єԍ�
				rsltStruct.setOUTPUT_RSLT_CD(strOutputRsldCd);
				// �݌Ƀ��b�g�ԍ�
				rsltStruct.setLOT_NO(strLotNo);
				//�i�ڔԍ�
				rsltStruct.setITEM_CD(adstruct.getITEM_CD());
				//��Ƌ�R�[�h
				rsltStruct.setWS_CD(adstruct.getWS_CD());
				// �Ǖi��
				rsltStruct.setACPT_QTY(adstruct.getACPT_QTY());
				// �s�ǐ�
				rsltStruct.setDEFECT_QTY(adstruct.getDEFECT_QTY());
				// ��Ɠ�
				rsltStruct.setOPR_DATE(adstruct.getOPR_DATE());
				// �H��R�[�h
				rsltStruct.setPLANT_CD(adstruct.getPLANT_CD());
				// ��ƒ�����
				rsltStruct.setOPR_CRCT_NO("0");
				
				// [��Ǝ���]�̒ǉ����s��
				entity.minsertT_OPR_RSLT.create(conn, rsltStruct);
				
				AD0110010Struct updateWorkInProcByitemStruct = new AD0110010Struct();
				updateWorkInProcByitemStruct.setsUser_ID(sysUSER_CD);
				// ��ƌv��ԍ�
				updateWorkInProcByitemStruct.setWORK_ODR_CD(procByItemStruct.getvc2WORK_ODR_CD());
				// ��Ǝw���ԍ�
				updateWorkInProcByitemStruct.setOPR_INST_CD(procByItemStruct.getvc2OPR_INST_CD());

				// ����Ǝw���ԍ����̍Œx��Ɠ��̎擾�i[��Ǝ���]."��Ǝ��э�Ɠ�"�j
				List lastDateList = entity.mselectLastDate.read(conn, updateWorkInProcByitemStruct);
				AD0110010Struct lastDateStruct = new AD0110010Struct();
				if (lastDateList.isEmpty()) {
					csvExport(adstruct					// �Ώۃf�[�^���
							, "1"						// �G���[�敪
							, m + 1						// �G���[�����s
							,"Expj.WORK_ODR_CD"			// �G���[���ږ�
							,new ExpjMessage("ZZ01101").getMessage(_locale)
							,null);	// �G���[���b�Z�[�W
					_intErrorCount++;
					return false;
				}else{
					lastDateStruct = (AD0110010Struct)lastDateList.get(0);
				}
				
				// �i�ڕʎd�|������
				updateWorkInProcByitemStruct.setdateOPR_DATE(lastDateStruct.getMAX_OPR_DATE());
				
				// [�i�ڕʎd�|]�̍X�V���s��
				entity.mupdateT_WORK_IN_PROC_BY_ITEM.update(conn, updateWorkInProcByitemStruct);
				
				//���ʕ��i�̎����o�ɏ���
				String sFLG = "1";	//��Ɗ���
				boolean result = true;
				//���ʕ��i���A�o�Ɍ^�������o�ɂ̕��i���o�ɏ���
				result = callCommonIssue(adstruct, sFLG,adstruct.getPLANT_CD(),m);
				if(result == false){
					return result;
				}
				//��ʕ��i���ɏ���
				//���ɏ����i�ۊǋ�ʓ��o�ɒǉ������ɏ����j
				result = callRcvCancel(adstruct,sFLG,adstruct.getPLANT_CD(),m);
				if(result == false){
					return result;
				}
			}else{

				//�Ǖi��
				BigDecimal AcptQty = new BigDecimal(adstruct.getACPT_QTY());
				//���ьv�オ�K�v�ȗǕi�̎c��
				BigDecimal TempAcptQty = new BigDecimal(adstruct.getACPT_QTY());
				//�s�ǐ�
				BigDecimal DefectQty = new BigDecimal(adstruct.getDEFECT_QTY());
				//���ьv�オ�K�v�ȕs�ǂ̎c��
				BigDecimal TempDefectQty = new BigDecimal(adstruct.getDEFECT_QTY());
				//�Ǖi���{�s�ǐ�
				BigDecimal TotalQty = new BigDecimal("0");
				TotalQty = AcptQty.add(DefectQty) ;
				//���ьv��Ώۂ̕i�ڕʎd�|�̍�Ǝw����
				BigDecimal TargetOprInstQty  = new BigDecimal("0");
				//���ьv��Ώۂ̕i�ڕʎd�|�̍�Ǝw���ԍ�������Ǝ��т�SUM(�Ǖi��+�s�ǐ�)
				BigDecimal SumOprRsltQty	 = new BigDecimal("0");	
				//���ьv��Ώۂ̕i�ڕʎd�|�Ɏ��ьv��ł���c��
				BigDecimal TempOprInstQty	= new BigDecimal("0");
				//���ьv�オ�K�v�ȗǕi�c���{�s�ǎc��
				BigDecimal TempSumOprRsltQty = new BigDecimal("0");
			
				int i=0 ;
				int ExitFlg=0 ;		 //while�����o���t���OOFF
				int CompleteFlg=0 ;	 //�i�ڕʎd�|�����t���OOFF
			
			
				while ( i < targetProcByItemList.size() && ExitFlg == 0 ) {
			
					//�Ώەi�ڕʎd�|���Z�b�g
					procByItemStruct = (AD0110010Struct)targetProcByItemList.get(i);
					procByItemStruct.setsUser_ID(sysUSER_CD);
			
					//�Ώۃ��R�[�h�̍�Ǝw�������Z�b�g
					TargetOprInstQty = new BigDecimal(procByItemStruct.getOPR_INST_QTY());
			
					//�Ώەi�ڕʎd�|�̍�Ǝw���ԍ��Ɠ���̍�Ǝ��т�SUM(�Ǖi���{�s�ǐ�)�擾
					List sumOprRsltQtyList = entity.mselectSumOprRsltQty.read(conn, procByItemStruct);
					if (sumOprRsltQtyList.isEmpty()) {
						//��Ǝ��т��������߁ASUM(�Ǖi��+�s�ǐ�)��ZERO�Ƃ���
						SumOprRsltQty = new BigDecimal("0");
					} else {
						//�i�ڕʎd�|���Z�b�g����
						AD0110010Struct tempStruct = (AD0110010Struct)sumOprRsltQtyList.get(0);
						tempStruct.setsUser_ID(sysUSER_CD);
						SumOprRsltQty = new BigDecimal(tempStruct.getSUM_OPR_RSLT_QTY());
					}
			
					// ��Ǝw���������ѐ����傫���ꍇ�̂ݎc�w�����v�Z���s���B
					if (TargetOprInstQty.doubleValue() > SumOprRsltQty.doubleValue()){
					//��Ǝw����-SUM(�Ǖi��+�s�ǐ�)
					TempOprInstQty = TargetOprInstQty.subtract(SumOprRsltQty );
					};

					//�@���ьv�オ�K�v�Ȑ����Z�o
					TempSumOprRsltQty = TempAcptQty.add(TempDefectQty);
			
					if ( TempSumOprRsltQty.doubleValue() > 0 ) {
						if ( TempOprInstQty.doubleValue() <= TempSumOprRsltQty.doubleValue() ) {
							//��Ǝw���c���������ьv�オ�K�v�Ȑ��̏ꍇ�F�i�ڕʎd�|����
			
							if ( i + 1 == targetProcByItemList.size() ) {
								//�i�ڕʎd�|�Ō��1���ł���Ύc����S�Čv�シ��
								rsltStruct.setACPT_QTY(TempAcptQty.toString());	//�Ǖi��
								rsltStruct.setDEFECT_QTY(TempDefectQty.toString());//�s�ǐ�
								TempAcptQty	= new BigDecimal("0");		//�Ǖi�c��ZERO
								TempDefectQty  = new BigDecimal("0");	//�s�ǎc��ZERO
								TempOprInstQty = new BigDecimal("0");	//���юc��ZERO
								CompleteFlg = 1 ;						//�i�ڕʎd�|�����t���OON
							} else {
								//����ȊO�͕i�ڕʎd�|�Ɍv��ł��镪�����v�シ��
								if ( TempOprInstQty.doubleValue() <= TempAcptQty.doubleValue() ) {
			
									rsltStruct.setACPT_QTY(
											TempOprInstQty.toString());		//�Ǖi��
									rsltStruct.setDEFECT_QTY("0.0");	//�s�ǐ�
									TempAcptQty = 
											TempAcptQty.subtract(TempOprInstQty);//�Ǖi�c��
									CompleteFlg = 1 ;	//�i�ڕʎd�|�����t���OON
								} else {
									//�s�ǂ��g��
									if ( TempAcptQty.doubleValue() > 0 ) {
										//�Ǖi�{�s�ǐ��ŏ�������
										rsltStruct.setACPT_QTY(TempAcptQty.toString());
										TempOprInstQty = TempOprInstQty.subtract(TempAcptQty);
										rsltStruct.setDEFECT_QTY(TempOprInstQty.toString());
										TempDefectQty =  TempDefectQty.subtract(TempOprInstQty);
										TempAcptQty = new BigDecimal("0");	//�Ǖi�c��ZERO
										CompleteFlg = 1 ;	//�i�ڕʎd�|�����t���OON
									} else {
									//�s�ǐ������ŏ�������
										rsltStruct.setACPT_QTY("0.0");
										rsltStruct.setDEFECT_QTY(TempOprInstQty.toString());
										TempDefectQty =  TempDefectQty.subtract(TempOprInstQty);
										TempAcptQty = new BigDecimal("0");	//�Ǖi�c��ZERO
										CompleteFlg = 1 ;	//�i�ڕʎd�|�����t���OON
									}
								}
							}
						} else {
							//�i�ڕʎd�|���������̏ꍇ
			
							rsltStruct.setACPT_QTY(TempAcptQty.toString());
							rsltStruct.setDEFECT_QTY(TempDefectQty.toString());
							TempAcptQty   = new BigDecimal("0");	//�Ǖi�c��ZERO
							TempDefectQty = new BigDecimal("0");	//�s�ǎc��ZERO
							ExitFlg=1;  //while�����o���t���OON
						}
			
						//��Ǝ��т̓o�^����
						rsltStruct.setsUser_ID(sysUSER_CD);
						rsltStruct.setOPR_INST_CD(procByItemStruct.getOPR_INST_CD());//��Ǝw���ԍ�

						//�ő啪��񐔁{�P�̃Z�b�g
						
						List maxPrdNoList = entity.mselectMaxPrdNo.read(conn, rsltStruct);

						//�������ʂ͕K������
						AD0110010Struct maxPrdNoStruct = (AD0110010Struct)maxPrdNoList.get(0);
						maxPrdNoStruct.setsUser_ID(sysUSER_CD);

						rsltStruct.setPARTIAL_PRD_NO(maxPrdNoStruct.getMAX_PRD_NO());//�����
						rsltStruct.setITEM_CD(adstruct.getITEM_CD());//�i�ڔԍ�
						rsltStruct.setWS_CD(adstruct.getWS_CD());	//��Ƌ�R�[�h
						rsltStruct.setOPR_DATE(adstruct.getOPR_DATE());//��Ɠ�
						rsltStruct.setWH_CD(adstruct.getWH_CD());	//�ۊǋ�R�[�h
						rsltStruct.setOUTPUT_RSLT_CD(strOutputRsldCd);//�o�������єԍ�
						rsltStruct.setPLANT_CD(adstruct.getPLANT_CD());//�H��R�[�h
						rsltStruct.setLOT_NO(strLotNo);//�݌Ƀ��b�g�ԍ�
						rsltStruct.setVEND_LOT_NO(adstruct.getVEND_LOT_NO());//���[�J���b�g�ԍ�
						rsltStruct.setOPR_CRCT_NO("0");				//��ƒ�����
			
						//��Ǝ��т̓o�^
						entity.minsertT_OPR_RSLT.create(conn, rsltStruct);
						String sFLG = "0";	//�����l�Z�b�g�i��Ɩ������j
						//��Ǝw�������̎��т��v�コ��Ă���Εi�ڕʎd�|���X�V����
						if ( CompleteFlg == 1 ) {
							AD0110010Struct completeStruct = new AD0110010Struct();
							completeStruct.setsUser_ID(sysUSER_CD);
							completeStruct.setWORK_ODR_CD(procByItemStruct.getvc2WORK_ODR_CD());
							completeStruct.setOPR_INST_CD(rsltStruct.getOPR_INST_CD());

							//����Ǝw���ԍ����̍Œx��Ɠ��̎擾�i[��Ǝ���]."��Ǝ��э�Ɠ�"�j
							List lastdist = entity.mselectLastDate.read(conn, completeStruct);
							if (lastdist.isEmpty()) {
								csvExport(adstruct					// �Ώۃf�[�^���
										, "1"						// �G���[�敪
										, m + 1						// �G���[�����s
										,"Expj.WORK_ODR_CD"			// �G���[���ږ�
										,new ExpjMessage("ZZ01101").getMessage(_locale)
										,null);	// �G���[���b�Z�[�W
								_intErrorCount++;
								return false;
							}
							AD0110010Struct tempStruct = (AD0110010Struct)lastdist.get(0);
							completeStruct.setdateOPR_DATE(tempStruct.getMAX_OPR_DATE());

							entity.mupdateT_WORK_IN_PROC_BY_ITEM.update(conn, completeStruct);
							sFLG = "1";	//��Ɗ���
						}	
			
						//���ʕ��i�̎����o�ɏ���
						//this.callCommonIssue(sFLG);
						//���ɏ����i�ۊǋ�ʓ��o�ɒǉ������ɏ����j
						//this.callRcvCancel(sFLG,entity);
						
						//���ʕ��i�̎����o�ɏ���
						boolean result = true;
						//���ʕ��i���A�o�Ɍ^�������o�ɂ̕��i���o�ɏ���
						result = this.callCommonIssue(adstruct,sFLG,adstruct.getPLANT_CD(),m);
						if(result == false){
							return result;
						}
						//��ʕ��i���ɏ���
						//���ɏ����i�ۊǋ�ʓ��o�ɒǉ������ɏ����j
						result = this.callRcvCancel(adstruct,sFLG,adstruct.getPLANT_CD(),m);
						if(result == false){
							return result;
						}
						
						CompleteFlg=0 ;	 //�i�ڕʎd�|�����t���O�ēxOFF
						i = i + 1 ;
					} else {
					//���ьv�オ�K�v�Ȑ����O�ȉ��Ȃ̂Ŏ��ьv��͍s��Ȃ�
			
						ExitFlg=1;  //while�����o���t���OON
					}
				}
			}
				// 
				adstruct.setOUTPUT_RSLT_CD(strOutputRsldCd);

				//�}�j���A���o�� �L�b�g�o�ɏ���
				boolean result = this.callManiaruIssue(adstruct, adstruct.getPLANT_CD(),m);
				if(result == false){
					return false;
				}
				//���b�g�Ǘ��t���O = 1(���b�g�g���[�X�Ǘ����s���B)�̏ꍇ
				if("1".equals(mItemStruct.getLOT_CTRL_FLG())){
					//�݌Ƀ��b�g�ԍ���Null�łȂ��ꍇ
					if(adstruct.getLOT_NO() != null && !adstruct.getLOT_NO().equals("")){
						//���b�g�Ǘ��e�[�u���X�V
						entity.mT_LOT_CTRL.update(conn,adstruct);
					}
				}
			return true;
		}catch(Exception e) {
			throw new ExpjException(e);
		}
		
	}
	
	// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Q�ƃ{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlBrowse() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0110");
		logger.entering("AD0110010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");
			//{{user_implement_dev:<controlBrowse>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlBrowse>
		logger.exiting("AD0110010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");

		return;
	}

	/**
	 * �捞�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCsvIn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0110");
		logger.entering("AD0110010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");
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
							setErrorMessage("AD34033");
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
		logger.exiting("AD0110010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");

		return;
	}

	/**
	 * CSV�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCSVOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0110");
		logger.entering("AD0110010Control"+":USER="+struct.getsUser_ID(),"controlCSVOut");
			//{{user_implement_dev:<controlCSVOut>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			// CSV�o�͕��i��ݒ�
				csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));
				AD0110010Struct errorStruct = null;
				List csv = new ArrayList();	// CSV���
				// CSV�w�b�_�s��CSV���ɒǉ�
				String[] title = {
						 "Expj.Cmt3094"							// �G���[�ӏ�
						,"Expj.Cmt3095"							// �G���[�敪
						,"Expj.Cmt3098"							// �G���[���e
						,"Expj.Cmt6220"							// �G���[����
						,"Expj.PLANT_CD"						// �H��R�[�h
						,"Expj.ITEM_CD"							// �i�ڔԍ�
						,"Expj.WS_CD"							// ��Ƌ�R�[�h
						,"Expj.WH_CD"							// �ۊǋ�R�[�h
						,"Expj.ACPT_QTY"						// �Ǖi��
						,"Expj.DEFECT_QTY"						// �s�ǐ�
						,"Expj.Cmt5833"							// ��Ɠ�
						,"Expj.OPR_TIME"						// ��Ǝ���
						,"Expj.STOCK_LOT_CD"					// �݌Ƀ��b�g�ԍ�
				};
				csv.add(title);
				// [���].�ꗗ���̃G���[����CSV���ɒǉ�
				for (int i = 0; i < list.size(); i++) {
					errorStruct = (AD0110010Struct)list.get(i);
					String[] date = {
							 errorStruct.getl_ERROR_IN()
							,errorStruct.getl_ERR_TYP()
							,errorStruct.getl_ERR_INFO()
							,errorStruct.getl_ERR_CTR_NM()
							,replaceSlashSub(errorStruct.getl_ERR_PLANT_CD())
							,replaceSlashSub(errorStruct.getl_ERR_ITEM_CD())
							,replaceSlashSub(errorStruct.getl_ERR_WS_CD())
							,replaceSlashSub(errorStruct.getl_ERR_WH_CD())
							,replaceSlashSub(errorStruct.getl_ERR_ACPT_QTY())
							,replaceSlashSub(errorStruct.getl_ERR_DEFECT_QTY())
							,replaceSlashSub(errorStruct.getl_ERR_OPR_DATE())
							,replaceSlashSub(errorStruct.getl_ERR_OPR_TIME())
							,replaceSlashSub(errorStruct.getl_ERR_LOT_NO())
					};
					csv.add(date);
				}
				
				// CSV�t�@�C�����쐬
				csvWriter.write(csv, CoreTools.getLocale(struct.getsUser_ID()), true);
				// CSV�t�@�C�����N���C�A���g�ɏo��
				struct.setDOWNLOAD_FILE(getCsvWriter().getFilePath());
		
                //}}user_implement_dev:<controlCSVOut>
		logger.exiting("AD0110010Control"+":USER="+struct.getsUser_ID(),"controlCSVOut");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0110");
		logger.entering("AD0110010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
		setList(null);
		// ������Ԃ��u������ԁv�ɐݒ�
		setReadStatus(INITIAL);
                //}}user_implement_dev:<controlClear>
		logger.exiting("AD0110010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0110");
		logger.entering("AD0110010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("AD0110010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * ���s�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlExecute() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0110");
		logger.entering("AD0110010Control"+":USER="+struct.getsUser_ID(),"controlExecute");
			//{{user_implement_dev:<controlExecute>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			setReadStatus(INITIAL);
			// �o�b�`�����N���X��main����
			String strBatchClassName = null;		// �Ăяo����N���X��
			String strBatchProcessingTyp = null;	// �o�b�`�����敪
			String strProgramId = null;				// �Ɩ����iAD0110B001�j
			String strUserId = null;				// ���[�UID
			String strPlantCd = null;				// �H��R�[�h
			String strCsvTakeTyp = null;			// CSV�捞����

			// �����Z�b�g
			strBatchClassName = " com.nec.jp.orteus.metamorBase.AD0110.AD0110B001.mainAD0110B001";
			strBatchProcessingTyp = "2";	// 2: �����^�]���Ȃ��i��ԃo�b�`�Ȃ��j
			strProgramId = "AD0110B001";	// �Ɩ����iAD0110B001�j
			strUserId = getsysUSER_CD();	// ���[�UID
			strPlantCd = getsysPLANT_CD();	// �H��R�[�h
			strCsvTakeTyp = "1";			// 1�F�Œ�t�@�C���捞

			// �o�b�`���������s���� -------------------------------------------
			ResourceBundle bundle = SystemConfig.getBundle();
			String javaPath = SystemConfig.getProperty("JAVA_PATH", bundle);
			if (javaPath == null) {
				// �V�X�e������l�t�@�C������̏��擾�Ɏ��s���܂���(�i�u�l�p�X)
				setErrorMessage("ZZ09010");
				return;
			}
			String ClassPath = SystemConfig.getProperty("CLASS_PATH", bundle);
			if (ClassPath == null) {
				// �V�X�e������l�t�@�C������̏��擾�Ɏ��s���܂���(�N���X�p�X)
				setErrorMessage("ZZ09012");
				return;
			}
			String batchPath = SystemConfig.getProperty("BATCH_PATH", bundle);
			if (batchPath == null) {
				// �V�X�e������l�t�@�C������̏��擾�Ɏ��s���܂���(�o�b�`�N���ݒ�)
				setErrorMessage("ZZ09011");
				return;
			}

			String heapSize = SystemConfig.getProperty("HIGH_HEAP_SIZE", bundle);
			if (heapSize == null) {
				// �V�X�e������l�t�@�C������̏��擾�Ɏ��s���܂���(�o�b�`�q�[�v�T�C�Y�ݒ�)
				setErrorMessage("ZZ09017");
				return;
			}
			StringBuffer buffer = new StringBuffer(javaPath); // �R�}���h������
			buffer.append(" -cp ");
			buffer.append(ClassPath);
			buffer.append(" -Dcom.nec.jp.orteus.util.logging.config.file=");
			buffer.append(batchPath);
			buffer.append(strBatchClassName);

			// �o�b�`�����敪
			buffer.append(" ").append(strBatchProcessingTyp);
			// ���O�C�����[�U�̃��[�U�R�[�h
			buffer.append(" ").append(strUserId);
			// �Ɩ���
			buffer.append(" ").append(strProgramId);
			// �H��R�[�h
			buffer.append(" ").append(strPlantCd);
			// CSV�捞����
			buffer.append(" ").append(strCsvTakeTyp);

			try {
				// �o�b�`�������s
				Runtime runtime = Runtime.getRuntime();
				Process p = runtime.exec(buffer.toString());

			} catch (IOException e) {
				// �o�b�`�Ăяo�����s�̏ꍇ�A��ʃ��b�Z�[�W��\������B
				setErrorMessage("ZZ09014");
				return;
			}
			// �o�b�`�Ăяo�������̏ꍇ�A��ʃ��b�Z�[�W��\������B
			setInfoMessage("ZZ09013");

		} catch(Exception e) {
			e.printStackTrace();
			setErrorMessage("ZZ01106");
		}
                //}}user_implement_dev:<controlExecute>
		logger.exiting("AD0110010Control"+":USER="+struct.getsUser_ID(),"controlExecute");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0110");
		logger.entering("AD0110010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AD0110010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0110");
		logger.entering("AD0110010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		try{
			// �Ɩ��^�p���擾
			try {
				DateCtrlStruct dateCtrl = DateCtrlControl.getData(conn, getsysPLANT_CD());
				_btmBusinessOprDate = dateCtrl.getBUSINESS_OPR_DATE();
			} catch(DataNotFoundException e) {
				ExpjMessage emsg = new ExpjMessage("AC34080" );
				sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
				ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
				setReadStatus(ERROR);
				ee.setLocale(CoreTools.getLocale(getsysUSER_CD()));
				throw ee;
			}
			
			// �ȉ��̏����ŁA[�V�X�e���p�����[�^]���������A�ݒ�l�i�������Ă��錎�̎��т̓o�^�^�C�����\�Ƃ��邩�ۂ��̋敪�j���擾����B
			AD0110010Struct adStruct = new AD0110010Struct();
			List valueList = entity.mselectPARAMETER.read(conn, adStruct);
			if (valueList.isEmpty()) {
				strValus = "true";
			}else {
				adStruct = (AD0110010Struct)valueList.get(0);
				strValus = adStruct.getVALUE();
			}

			// �R���{�{�b�N�X�f�[�^�p��
	 		ComboBox combBox = new ComboBox(conn, sysUSER_CD);
			// �R���{�{�b�N�X�̃f�[�^���擾
			_COM_ERR_TYP = combBox.getData("ERR_TYP");
			// ��Ǝ��ԒP�ʋ敪
			_OPR_TIME_UNIT_TYP = combBox.getData("OPR_TIME_UNIT_TYP");
			
			// �s�Ǘ��R�R�[�h
			_DEFECT_CAUSE_CD_INNER = combBox.getData("DEFECT_CAUSE_CD_INNER");

			// ��ЃR�[�h�擾
			_company_cd = SystemInformation.getSysMyCompanyCd();
			
			
		}catch(ExpjException e) {
			throw e;
		}
		catch(Exception e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			ee.setLocale(CoreTools.getLocale(getsysUSER_CD()));
			throw ee;
		} 
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AD0110010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0110");
		logger.entering("AD0110010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
		logger.exiting("AD0110010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
//			throw new FoundationException("AD0110010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0110010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AD0110010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0110010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AD0110010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0110010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AD0110010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AD0110010Entity entity;
	protected AD0110010Struct struct;
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

		entity = new AD0110010Entity();
		struct = new AD0110010Struct();

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
	 * AD0110010�N���X�̕W���R���X�g���N�^
	 */
	public AD0110010Control() throws BusinessProcessException, FoundationException
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
				AD0110010Struct key = (AD0110010Struct)keyList.get(j);
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
				if(msgKeyType.containsKeyColumn("l_ERR_PLANT_CD") && key.getl_ERR_PLANT_CD() != null) {
					msgKey.setKeyValue("l_ERR_PLANT_CD", key.getl_ERR_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_ITEM_CD") && key.getl_ERR_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ERR_ITEM_CD", key.getl_ERR_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_WS_CD") && key.getl_ERR_WS_CD() != null) {
					msgKey.setKeyValue("l_ERR_WS_CD", key.getl_ERR_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_OPR_DATE") && key.getl_ERR_OPR_DATE() != null) {
					msgKey.setKeyValue("l_ERR_OPR_DATE", key.getl_ERR_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_ACPT_QTY") && key.getl_ERR_ACPT_QTY() != null) {
					msgKey.setKeyValue("l_ERR_ACPT_QTY", key.getl_ERR_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_DEFECT_QTY") && key.getl_ERR_DEFECT_QTY() != null) {
					msgKey.setKeyValue("l_ERR_DEFECT_QTY", key.getl_ERR_DEFECT_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_OPR_TIME") && key.getl_ERR_OPR_TIME() != null) {
					msgKey.setKeyValue("l_ERR_OPR_TIME", key.getl_ERR_OPR_TIME());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_LOT_NO") && key.getl_ERR_LOT_NO() != null) {
					msgKey.setKeyValue("l_ERR_LOT_NO", key.getl_ERR_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_WH_CD") && key.getl_ERR_WH_CD() != null) {
					msgKey.setKeyValue("l_ERR_WH_CD", key.getl_ERR_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("w_COLUMN_FLG") && key.getw_COLUMN_FLG() != null) {
					msgKey.setKeyValue("w_COLUMN_FLG", key.getw_COLUMN_FLG());
				}
				if(msgKeyType.containsKeyColumn("TEMP_PLAN_QTY") && key.getTEMP_PLAN_QTY() != null) {
					msgKey.setKeyValue("TEMP_PLAN_QTY", key.getTEMP_PLAN_QTY());
				}
				if(msgKeyType.containsKeyColumn("TEMP_USEOVER_QTY") && key.getTEMP_USEOVER_QTY() != null) {
					msgKey.setKeyValue("TEMP_USEOVER_QTY", key.getTEMP_USEOVER_QTY());
				}
				if(msgKeyType.containsKeyColumn("TEMP_PLANOUT_QTY") && key.getTEMP_PLANOUT_QTY() != null) {
					msgKey.setKeyValue("TEMP_PLANOUT_QTY", key.getTEMP_PLANOUT_QTY());
				}
				if(msgKeyType.containsKeyColumn("TEMP_USE_QTY") && key.getTEMP_USE_QTY() != null) {
					msgKey.setKeyValue("TEMP_USE_QTY", key.getTEMP_USE_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_DEFECT_QTY_KEEP") && key.getl_ERR_DEFECT_QTY_KEEP() != null) {
					msgKey.setKeyValue("l_ERR_DEFECT_QTY_KEEP", key.getl_ERR_DEFECT_QTY_KEEP());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_ACPT_QTY_KEEP") && key.getl_ERR_ACPT_QTY_KEEP() != null) {
					msgKey.setKeyValue("l_ERR_ACPT_QTY_KEEP", key.getl_ERR_ACPT_QTY_KEEP());
				}
				if(msgKeyType.containsKeyColumn("l_LOT_NO_KEEP") && key.getl_LOT_NO_KEEP() != null) {
					msgKey.setKeyValue("l_LOT_NO_KEEP", key.getl_LOT_NO_KEEP());
				}
				if(msgKeyType.containsKeyColumn("OUTPUT_RSLT_CD") && key.getOUTPUT_RSLT_CD() != null) {
					msgKey.setKeyValue("OUTPUT_RSLT_CD", key.getOUTPUT_RSLT_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ACPT_QTY") && key.getACPT_QTY() != null) {
					msgKey.setKeyValue("ACPT_QTY", key.getACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_QTY") && key.getDEFECT_QTY() != null) {
					msgKey.setKeyValue("DEFECT_QTY", key.getDEFECT_QTY());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_CAUSE_CD") && key.getDEFECT_CAUSE_CD() != null) {
					msgKey.setKeyValue("DEFECT_CAUSE_CD", key.getDEFECT_CAUSE_CD());
				}
				if(msgKeyType.containsKeyColumn("OPR_DATE") && key.getOPR_DATE() != null) {
					msgKey.setKeyValue("OPR_DATE", key.getOPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("OUTPUT_RSLT_PERSON") && key.getOUTPUT_RSLT_PERSON() != null) {
					msgKey.setKeyValue("OUTPUT_RSLT_PERSON", key.getOUTPUT_RSLT_PERSON());
				}
				if(msgKeyType.containsKeyColumn("OUTPUT_RSLT_COMMENT") && key.getOUTPUT_RSLT_COMMENT() != null) {
					msgKey.setKeyValue("OUTPUT_RSLT_COMMENT", key.getOUTPUT_RSLT_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("OPR_TIME_UNIT_TYP") && key.getOPR_TIME_UNIT_TYP() != null) {
					msgKey.setKeyValue("OPR_TIME_UNIT_TYP", key.getOPR_TIME_UNIT_TYP());
				}
				if(msgKeyType.containsKeyColumn("PRE_ARRANGEMENT_TIME") && key.getPRE_ARRANGEMENT_TIME() != null) {
					msgKey.setKeyValue("PRE_ARRANGEMENT_TIME", key.getPRE_ARRANGEMENT_TIME());
				}
				if(msgKeyType.containsKeyColumn("POST_ARRANGEMENT_TIME") && key.getPOST_ARRANGEMENT_TIME() != null) {
					msgKey.setKeyValue("POST_ARRANGEMENT_TIME", key.getPOST_ARRANGEMENT_TIME());
				}
				if(msgKeyType.containsKeyColumn("OPR_TIME") && key.getOPR_TIME() != null) {
					msgKey.setKeyValue("OPR_TIME", key.getOPR_TIME());
				}
				if(msgKeyType.containsKeyColumn("CESSATION_TIME") && key.getCESSATION_TIME() != null) {
					msgKey.setKeyValue("CESSATION_TIME", key.getCESSATION_TIME());
				}
				if(msgKeyType.containsKeyColumn("CESSATION_CAUSE") && key.getCESSATION_CAUSE() != null) {
					msgKey.setKeyValue("CESSATION_CAUSE", key.getCESSATION_CAUSE());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO") && key.getLOT_NO() != null) {
					msgKey.setKeyValue("LOT_NO", key.getLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("VEND_LOT_NO") && key.getVEND_LOT_NO() != null) {
					msgKey.setKeyValue("VEND_LOT_NO", key.getVEND_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_COMMENT") && key.getDEFECT_COMMENT() != null) {
					msgKey.setKeyValue("DEFECT_COMMENT", key.getDEFECT_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD") && key.getOPR_INST_CD() != null) {
					msgKey.setKeyValue("OPR_INST_CD", key.getOPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("PARTIAL_PRD_NO") && key.getPARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("PARTIAL_PRD_NO", key.getPARTIAL_PRD_NO());
				}
				if(msgKeyType.containsKeyColumn("OPR_CRCT_NO") && key.getOPR_CRCT_NO() != null) {
					msgKey.setKeyValue("OPR_CRCT_NO", key.getOPR_CRCT_NO());
				}
				if(msgKeyType.containsKeyColumn("dateOPR_DATE") && key.getdateOPR_DATE() != null) {
					msgKey.setKeyValue("dateOPR_DATE", key.getdateOPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_CD") && key.getWORK_ODR_CD() != null) {
					msgKey.setKeyValue("WORK_ODR_CD", key.getWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("vc2ITEM_CD") && key.getvc2ITEM_CD() != null) {
					msgKey.setKeyValue("vc2ITEM_CD", key.getvc2ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG") && key.getLOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("LOT_CTRL_FLG", key.getLOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("LOT_NUMBERING_TYP") && key.getLOT_NUMBERING_TYP() != null) {
					msgKey.setKeyValue("LOT_NUMBERING_TYP", key.getLOT_NUMBERING_TYP());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("COUNT") && key.getCOUNT() != null) {
					msgKey.setKeyValue("COUNT", key.getCOUNT());
				}
				if(msgKeyType.containsKeyColumn("vc2PLANT_CD") && key.getvc2PLANT_CD() != null) {
					msgKey.setKeyValue("vc2PLANT_CD", key.getvc2PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("vc2LOT_NO") && key.getvc2LOT_NO() != null) {
					msgKey.setKeyValue("vc2LOT_NO", key.getvc2LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("vc2WORK_ODR_CD") && key.getvc2WORK_ODR_CD() != null) {
					msgKey.setKeyValue("vc2WORK_ODR_CD", key.getvc2WORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_QTY") && key.getOPR_INST_QTY() != null) {
					msgKey.setKeyValue("OPR_INST_QTY", key.getOPR_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("WORK_STS_TYP") && key.getWORK_STS_TYP() != null) {
					msgKey.setKeyValue("WORK_STS_TYP", key.getWORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT_BY_ITEM") && key.getMODIFY_COUNT_BY_ITEM() != null) {
					msgKey.setKeyValue("MODIFY_COUNT_BY_ITEM", key.getMODIFY_COUNT_BY_ITEM());
				}
				if(msgKeyType.containsKeyColumn("vc2OPR_INST_CD") && key.getvc2OPR_INST_CD() != null) {
					msgKey.setKeyValue("vc2OPR_INST_CD", key.getvc2OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("VALUE") && key.getVALUE() != null) {
					msgKey.setKeyValue("VALUE", key.getVALUE());
				}
				if(msgKeyType.containsKeyColumn("USER_CD") && key.getUSER_CD() != null) {
					msgKey.setKeyValue("USER_CD", key.getUSER_CD());
				}
				if(msgKeyType.containsKeyColumn("MAX_PRD_NO") && key.getMAX_PRD_NO() != null) {
					msgKey.setKeyValue("MAX_PRD_NO", key.getMAX_PRD_NO());
				}
				if(msgKeyType.containsKeyColumn("MAX_OPR_DATE") && key.getMAX_OPR_DATE() != null) {
					msgKey.setKeyValue("MAX_OPR_DATE", key.getMAX_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD") && key.getRCV_ISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CTRL_CD", key.getRCV_ISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP") && key.getRCV_ISSUE_TYP() != null) {
					msgKey.setKeyValue("RCV_ISSUE_TYP", key.getRCV_ISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO") && key.getJOB_ODR_DETAIL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_DETAIL_NO", key.getJOB_ODR_DETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ACPT_NO") && key.getACPT_NO() != null) {
					msgKey.setKeyValue("ACPT_NO", key.getACPT_NO());
				}
				if(msgKeyType.containsKeyColumn("ACPT_RSLT_CRCT_NO") && key.getACPT_RSLT_CRCT_NO() != null) {
					msgKey.setKeyValue("ACPT_RSLT_CRCT_NO", key.getACPT_RSLT_CRCT_NO());
				}
				if(msgKeyType.containsKeyColumn("INSPEC_RSLT_CRCT_NO") && key.getINSPEC_RSLT_CRCT_NO() != null) {
					msgKey.setKeyValue("INSPEC_RSLT_CRCT_NO", key.getINSPEC_RSLT_CRCT_NO());
				}
				if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD") && key.getWORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("WORK_IN_PROC_CD", key.getWORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_CRCT_NO") && key.getOPR_RSLT_CRCT_NO() != null) {
					msgKey.setKeyValue("OPR_RSLT_CRCT_NO", key.getOPR_RSLT_CRCT_NO());
				}
				if(msgKeyType.containsKeyColumn("h_ISSUE_INST_CD") && key.geth_ISSUE_INST_CD() != null) {
					msgKey.setKeyValue("h_ISSUE_INST_CD", key.geth_ISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("SAVE_STOCK_ON_HAND_QTY") && key.getSAVE_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("SAVE_STOCK_ON_HAND_QTY", key.getSAVE_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_QTY") && key.getRCV_ISSUE_QTY() != null) {
					msgKey.setKeyValue("RCV_ISSUE_QTY", key.getRCV_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_AMOUNT") && key.getRCV_ISSUE_AMOUNT() != null) {
					msgKey.setKeyValue("RCV_ISSUE_AMOUNT", key.getRCV_ISSUE_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_DATE") && key.getRCV_ISSUE_DATE() != null) {
					msgKey.setKeyValue("RCV_ISSUE_DATE", key.getRCV_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_GNR_TYP") && key.getRCV_ISSUE_GNR_TYP() != null) {
					msgKey.setKeyValue("RCV_ISSUE_GNR_TYP", key.getRCV_ISSUE_GNR_TYP());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_ODD_QTY") && key.getRCV_ISSUE_ODD_QTY() != null) {
					msgKey.setKeyValue("RCV_ISSUE_ODD_QTY", key.getRCV_ISSUE_ODD_QTY());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UPD_TYP") && key.getSTOCK_UPD_TYP() != null) {
					msgKey.setKeyValue("STOCK_UPD_TYP", key.getSTOCK_UPD_TYP());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_FLG") && key.getRCV_ISSUE_CMPLT_FLG() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CMPLT_FLG", key.getRCV_ISSUE_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_COMMENT") && key.getRCV_ISSUE_COMMENT() != null) {
					msgKey.setKeyValue("RCV_ISSUE_COMMENT", key.getRCV_ISSUE_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("CONS_TYP") && key.getCONS_TYP() != null) {
					msgKey.setKeyValue("CONS_TYP", key.getCONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("SUM_OPR_RSLT_QTY") && key.getSUM_OPR_RSLT_QTY() != null) {
					msgKey.setKeyValue("SUM_OPR_RSLT_QTY", key.getSUM_OPR_RSLT_QTY());
				}
				if(msgKeyType.containsKeyColumn("vc2OUTPUT_RSLT_CD") && key.getvc2OUTPUT_RSLT_CD() != null) {
					msgKey.setKeyValue("vc2OUTPUT_RSLT_CD", key.getvc2OUTPUT_RSLT_CD());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_TYP") && key.getISSUE_TYP() != null) {
					msgKey.setKeyValue("ISSUE_TYP", key.getISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_UNIT_DENOMINATOR") && key.getISSUE_INST_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("ISSUE_INST_UNIT_DENOMINATOR", key.getISSUE_INST_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_UNIT_NUMERATOR") && key.getISSUE_INST_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("ISSUE_INST_UNIT_NUMERATOR", key.getISSUE_INST_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_QTY_TYP") && key.getl_UNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("l_UNIT_QTY_TYP", key.getl_UNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY") && key.getTOTAL_ISSUE_QTY() != null) {
					msgKey.setKeyValue("TOTAL_ISSUE_QTY", key.getTOTAL_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("SUPPLIED_ISSUE_QTY") && key.getSUPPLIED_ISSUE_QTY() != null) {
					msgKey.setKeyValue("SUPPLIED_ISSUE_QTY", key.getSUPPLIED_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("count_RCV_ISSUE") && key.getcount_RCV_ISSUE() != null) {
					msgKey.setKeyValue("count_RCV_ISSUE", key.getcount_RCV_ISSUE());
				}
				if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY") && key.getSTOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("STOCK_ON_HAND_QTY", key.getSTOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_QTY") && key.getISSUE_QTY() != null) {
					msgKey.setKeyValue("ISSUE_QTY", key.getISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_DATE") && key.getISSUE_DATE() != null) {
					msgKey.setKeyValue("ISSUE_DATE", key.getISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("SPENT_QTY") && key.getSPENT_QTY() != null) {
					msgKey.setKeyValue("SPENT_QTY", key.getSPENT_QTY());
				}
				if(msgKeyType.containsKeyColumn("NEXTVAL") && key.getNEXTVAL() != null) {
					msgKey.setKeyValue("NEXTVAL", key.getNEXTVAL());
				}
				if(msgKeyType.containsKeyColumn("RSLT_CTL_SEQ_NO") && key.getRSLT_CTL_SEQ_NO() != null) {
					msgKey.setKeyValue("RSLT_CTL_SEQ_NO", key.getRSLT_CTL_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("PART_SUPPLIED_COMMENT") && key.getPART_SUPPLIED_COMMENT() != null) {
					msgKey.setKeyValue("PART_SUPPLIED_COMMENT", key.getPART_SUPPLIED_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("SUPPLIED_DATE") && key.getSUPPLIED_DATE() != null) {
					msgKey.setKeyValue("SUPPLIED_DATE", key.getSUPPLIED_DATE());
				}
				if(msgKeyType.containsKeyColumn("ALCD_QTY") && key.getALCD_QTY() != null) {
					msgKey.setKeyValue("ALCD_QTY", key.getALCD_QTY());
				}
				if(msgKeyType.containsKeyColumn("PROC_EXEC_DATE") && key.getPROC_EXEC_DATE() != null) {
					msgKey.setKeyValue("PROC_EXEC_DATE", key.getPROC_EXEC_DATE());
				}
				if(msgKeyType.containsKeyColumn("FROM_PUCH_ODR_CD") && key.getFROM_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("FROM_PUCH_ODR_CD", key.getFROM_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("TO_PUCH_ODR_CD") && key.getTO_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("TO_PUCH_ODR_CD", key.getTO_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("FROM_ITEM_CD") && key.getFROM_ITEM_CD() != null) {
					msgKey.setKeyValue("FROM_ITEM_CD", key.getFROM_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("FROM_LOT_NO") && key.getFROM_LOT_NO() != null) {
					msgKey.setKeyValue("FROM_LOT_NO", key.getFROM_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("TO_ITEM_CD") && key.getTO_ITEM_CD() != null) {
					msgKey.setKeyValue("TO_ITEM_CD", key.getTO_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("TO_LOT_NO") && key.getTO_LOT_NO() != null) {
					msgKey.setKeyValue("TO_LOT_NO", key.getTO_LOT_NO());
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
					AD0110010Struct key = new AD0110010Struct();
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
					if(msgKeyType.containsKeyColumn("l_ERR_PLANT_CD")) {
						key.setl_ERR_PLANT_CD(msgKey.getKeyValue("l_ERR_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_ITEM_CD")) {
						key.setl_ERR_ITEM_CD(msgKey.getKeyValue("l_ERR_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_WS_CD")) {
						key.setl_ERR_WS_CD(msgKey.getKeyValue("l_ERR_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_OPR_DATE")) {
						key.setl_ERR_OPR_DATE(msgKey.getKeyValue("l_ERR_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_ACPT_QTY")) {
						key.setl_ERR_ACPT_QTY(msgKey.getKeyValue("l_ERR_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_DEFECT_QTY")) {
						key.setl_ERR_DEFECT_QTY(msgKey.getKeyValue("l_ERR_DEFECT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_OPR_TIME")) {
						key.setl_ERR_OPR_TIME(msgKey.getKeyValue("l_ERR_OPR_TIME"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_LOT_NO")) {
						key.setl_ERR_LOT_NO(msgKey.getKeyValue("l_ERR_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_WH_CD")) {
						key.setl_ERR_WH_CD(msgKey.getKeyValue("l_ERR_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_COLUMN_FLG")) {
						key.setw_COLUMN_FLG(msgKey.getKeyValue("w_COLUMN_FLG"));
					}
					if(msgKeyType.containsKeyColumn("TEMP_PLAN_QTY")) {
						key.setTEMP_PLAN_QTY(msgKey.getKeyValue("TEMP_PLAN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TEMP_USEOVER_QTY")) {
						key.setTEMP_USEOVER_QTY(msgKey.getKeyValue("TEMP_USEOVER_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TEMP_PLANOUT_QTY")) {
						key.setTEMP_PLANOUT_QTY(msgKey.getKeyValue("TEMP_PLANOUT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TEMP_USE_QTY")) {
						key.setTEMP_USE_QTY(msgKey.getKeyValue("TEMP_USE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_DEFECT_QTY_KEEP")) {
						key.setl_ERR_DEFECT_QTY_KEEP(msgKey.getKeyValue("l_ERR_DEFECT_QTY_KEEP"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_ACPT_QTY_KEEP")) {
						key.setl_ERR_ACPT_QTY_KEEP(msgKey.getKeyValue("l_ERR_ACPT_QTY_KEEP"));
					}
					if(msgKeyType.containsKeyColumn("l_LOT_NO_KEEP")) {
						key.setl_LOT_NO_KEEP(msgKey.getKeyValue("l_LOT_NO_KEEP"));
					}
					if(msgKeyType.containsKeyColumn("OUTPUT_RSLT_CD")) {
						key.setOUTPUT_RSLT_CD(msgKey.getKeyValue("OUTPUT_RSLT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_QTY")) {
						key.setACPT_QTY(msgKey.getKeyValue("ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_QTY")) {
						key.setDEFECT_QTY(msgKey.getKeyValue("DEFECT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_CAUSE_CD")) {
						key.setDEFECT_CAUSE_CD(msgKey.getKeyValue("DEFECT_CAUSE_CD"));
					}
					if(msgKeyType.containsKeyColumn("OPR_DATE")) {
						key.setOPR_DATE(msgKey.getKeyValue("OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("OUTPUT_RSLT_PERSON")) {
						key.setOUTPUT_RSLT_PERSON(msgKey.getKeyValue("OUTPUT_RSLT_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("OUTPUT_RSLT_COMMENT")) {
						key.setOUTPUT_RSLT_COMMENT(msgKey.getKeyValue("OUTPUT_RSLT_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TIME_UNIT_TYP")) {
						key.setOPR_TIME_UNIT_TYP(msgKey.getKeyValue("OPR_TIME_UNIT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PRE_ARRANGEMENT_TIME")) {
						key.setPRE_ARRANGEMENT_TIME(msgKey.getKeyValue("PRE_ARRANGEMENT_TIME"));
					}
					if(msgKeyType.containsKeyColumn("POST_ARRANGEMENT_TIME")) {
						key.setPOST_ARRANGEMENT_TIME(msgKey.getKeyValue("POST_ARRANGEMENT_TIME"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TIME")) {
						key.setOPR_TIME(msgKey.getKeyValue("OPR_TIME"));
					}
					if(msgKeyType.containsKeyColumn("CESSATION_TIME")) {
						key.setCESSATION_TIME(msgKey.getKeyValue("CESSATION_TIME"));
					}
					if(msgKeyType.containsKeyColumn("CESSATION_CAUSE")) {
						key.setCESSATION_CAUSE(msgKey.getKeyValue("CESSATION_CAUSE"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO")) {
						key.setLOT_NO(msgKey.getKeyValue("LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("VEND_LOT_NO")) {
						key.setVEND_LOT_NO(msgKey.getKeyValue("VEND_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_COMMENT")) {
						key.setDEFECT_COMMENT(msgKey.getKeyValue("DEFECT_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD")) {
						key.setOPR_INST_CD(msgKey.getKeyValue("OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("PARTIAL_PRD_NO")) {
						key.setPARTIAL_PRD_NO(msgKey.getKeyValue("PARTIAL_PRD_NO"));
					}
					if(msgKeyType.containsKeyColumn("OPR_CRCT_NO")) {
						key.setOPR_CRCT_NO(msgKey.getKeyValue("OPR_CRCT_NO"));
					}
					if(msgKeyType.containsKeyColumn("dateOPR_DATE")) {
						key.setdateOPR_DATE(msgKey.getKeyValue("dateOPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_CD")) {
						key.setWORK_ODR_CD(msgKey.getKeyValue("WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("vc2ITEM_CD")) {
						key.setvc2ITEM_CD(msgKey.getKeyValue("vc2ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG")) {
						key.setLOT_CTRL_FLG(msgKey.getKeyValue("LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NUMBERING_TYP")) {
						key.setLOT_NUMBERING_TYP(msgKey.getKeyValue("LOT_NUMBERING_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("COUNT")) {
						key.setCOUNT(msgKey.getKeyValue("COUNT"));
					}
					if(msgKeyType.containsKeyColumn("vc2PLANT_CD")) {
						key.setvc2PLANT_CD(msgKey.getKeyValue("vc2PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("vc2LOT_NO")) {
						key.setvc2LOT_NO(msgKey.getKeyValue("vc2LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("vc2WORK_ODR_CD")) {
						key.setvc2WORK_ODR_CD(msgKey.getKeyValue("vc2WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_QTY")) {
						key.setOPR_INST_QTY(msgKey.getKeyValue("OPR_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("WORK_STS_TYP")) {
						key.setWORK_STS_TYP(msgKey.getKeyValue("WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT_BY_ITEM")) {
						key.setMODIFY_COUNT_BY_ITEM(msgKey.getKeyValue("MODIFY_COUNT_BY_ITEM"));
					}
					if(msgKeyType.containsKeyColumn("vc2OPR_INST_CD")) {
						key.setvc2OPR_INST_CD(msgKey.getKeyValue("vc2OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("VALUE")) {
						key.setVALUE(msgKey.getKeyValue("VALUE"));
					}
					if(msgKeyType.containsKeyColumn("USER_CD")) {
						key.setUSER_CD(msgKey.getKeyValue("USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("MAX_PRD_NO")) {
						key.setMAX_PRD_NO(msgKey.getKeyValue("MAX_PRD_NO"));
					}
					if(msgKeyType.containsKeyColumn("MAX_OPR_DATE")) {
						key.setMAX_OPR_DATE(msgKey.getKeyValue("MAX_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD")) {
						key.setRCV_ISSUE_CTRL_CD(msgKey.getKeyValue("RCV_ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP")) {
						key.setRCV_ISSUE_TYP(msgKey.getKeyValue("RCV_ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO")) {
						key.setJOB_ODR_DETAIL_NO(msgKey.getKeyValue("JOB_ODR_DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_NO")) {
						key.setACPT_NO(msgKey.getKeyValue("ACPT_NO"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_RSLT_CRCT_NO")) {
						key.setACPT_RSLT_CRCT_NO(msgKey.getKeyValue("ACPT_RSLT_CRCT_NO"));
					}
					if(msgKeyType.containsKeyColumn("INSPEC_RSLT_CRCT_NO")) {
						key.setINSPEC_RSLT_CRCT_NO(msgKey.getKeyValue("INSPEC_RSLT_CRCT_NO"));
					}
					if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD")) {
						key.setWORK_IN_PROC_CD(msgKey.getKeyValue("WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_CRCT_NO")) {
						key.setOPR_RSLT_CRCT_NO(msgKey.getKeyValue("OPR_RSLT_CRCT_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_ISSUE_INST_CD")) {
						key.seth_ISSUE_INST_CD(msgKey.getKeyValue("h_ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("SAVE_STOCK_ON_HAND_QTY")) {
						key.setSAVE_STOCK_ON_HAND_QTY(msgKey.getKeyValue("SAVE_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_QTY")) {
						key.setRCV_ISSUE_QTY(msgKey.getKeyValue("RCV_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_AMOUNT")) {
						key.setRCV_ISSUE_AMOUNT(msgKey.getKeyValue("RCV_ISSUE_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_DATE")) {
						key.setRCV_ISSUE_DATE(msgKey.getKeyValue("RCV_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_GNR_TYP")) {
						key.setRCV_ISSUE_GNR_TYP(msgKey.getKeyValue("RCV_ISSUE_GNR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_ODD_QTY")) {
						key.setRCV_ISSUE_ODD_QTY(msgKey.getKeyValue("RCV_ISSUE_ODD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UPD_TYP")) {
						key.setSTOCK_UPD_TYP(msgKey.getKeyValue("STOCK_UPD_TYP"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_FLG")) {
						key.setRCV_ISSUE_CMPLT_FLG(msgKey.getKeyValue("RCV_ISSUE_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_COMMENT")) {
						key.setRCV_ISSUE_COMMENT(msgKey.getKeyValue("RCV_ISSUE_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("CONS_TYP")) {
						key.setCONS_TYP(msgKey.getKeyValue("CONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("SUM_OPR_RSLT_QTY")) {
						key.setSUM_OPR_RSLT_QTY(msgKey.getKeyValue("SUM_OPR_RSLT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("vc2OUTPUT_RSLT_CD")) {
						key.setvc2OUTPUT_RSLT_CD(msgKey.getKeyValue("vc2OUTPUT_RSLT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_TYP")) {
						key.setISSUE_TYP(msgKey.getKeyValue("ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_UNIT_DENOMINATOR")) {
						key.setISSUE_INST_UNIT_DENOMINATOR(msgKey.getKeyValue("ISSUE_INST_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_UNIT_NUMERATOR")) {
						key.setISSUE_INST_UNIT_NUMERATOR(msgKey.getKeyValue("ISSUE_INST_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_QTY_TYP")) {
						key.setl_UNIT_QTY_TYP(msgKey.getKeyValue("l_UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY")) {
						key.setTOTAL_ISSUE_QTY(msgKey.getKeyValue("TOTAL_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SUPPLIED_ISSUE_QTY")) {
						key.setSUPPLIED_ISSUE_QTY(msgKey.getKeyValue("SUPPLIED_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("count_RCV_ISSUE")) {
						key.setcount_RCV_ISSUE(msgKey.getKeyValue("count_RCV_ISSUE"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY")) {
						key.setSTOCK_ON_HAND_QTY(msgKey.getKeyValue("STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_QTY")) {
						key.setISSUE_QTY(msgKey.getKeyValue("ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_DATE")) {
						key.setISSUE_DATE(msgKey.getKeyValue("ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SPENT_QTY")) {
						key.setSPENT_QTY(msgKey.getKeyValue("SPENT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("NEXTVAL")) {
						key.setNEXTVAL(msgKey.getKeyValue("NEXTVAL"));
					}
					if(msgKeyType.containsKeyColumn("RSLT_CTL_SEQ_NO")) {
						key.setRSLT_CTL_SEQ_NO(msgKey.getKeyValue("RSLT_CTL_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("PART_SUPPLIED_COMMENT")) {
						key.setPART_SUPPLIED_COMMENT(msgKey.getKeyValue("PART_SUPPLIED_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("SUPPLIED_DATE")) {
						key.setSUPPLIED_DATE(msgKey.getKeyValue("SUPPLIED_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ALCD_QTY")) {
						key.setALCD_QTY(msgKey.getKeyValue("ALCD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PROC_EXEC_DATE")) {
						key.setPROC_EXEC_DATE(msgKey.getKeyValue("PROC_EXEC_DATE"));
					}
					if(msgKeyType.containsKeyColumn("FROM_PUCH_ODR_CD")) {
						key.setFROM_PUCH_ODR_CD(msgKey.getKeyValue("FROM_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("TO_PUCH_ODR_CD")) {
						key.setTO_PUCH_ODR_CD(msgKey.getKeyValue("TO_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("FROM_ITEM_CD")) {
						key.setFROM_ITEM_CD(msgKey.getKeyValue("FROM_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("FROM_LOT_NO")) {
						key.setFROM_LOT_NO(msgKey.getKeyValue("FROM_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("TO_ITEM_CD")) {
						key.setTO_ITEM_CD(msgKey.getKeyValue("TO_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("TO_LOT_NO")) {
						key.setTO_LOT_NO(msgKey.getKeyValue("TO_LOT_NO"));
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
