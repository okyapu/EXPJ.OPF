/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0180/src/com/nec/jp/orteus/metamorBase/AE0180/AE0180010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0180;

import com.nec.jp.orteus.metamorBase.AE0180.*;
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
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.text.ParseException;

import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.metamorBase.common04.amount.AmountCalculator;
import com.nec.jp.orteus.metamorBase.common04.amount.CurControl;
import com.nec.jp.orteus.metamorBase.common04.amount.CurStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateControl;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.PuchUnitCostControl;
import com.nec.jp.orteus.metamorBase.common04.amount.PuchUnitCostStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxControl;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxStruct;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlStruct;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurStruct;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AE0180010Control �N���X
 * �����v��CSV�捞
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.6 $ $Date: 2016/05/23 08:15:42 $
 *
 *�C������
 *(2015/08/06),EJaSCM�^EJa�@�\�����Ή�
 */
//}}user_implement_code_header

public class AE0180010Control
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
	public AE0180010Struct getListvalue(int x) { return (AE0180010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AE0180010Struct getStruct() { return this.struct; }	// Struct�̒l��Ԃ��܂��B
	public AE0180010Struct createStruct() { return new AE0180010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AE0180010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	
	// csv�f�[�^
	public List listCsvTemp = null;;
	
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
	
	/** ���͕i�ڑ��݊m�F�t���O */
	private boolean _Itemflg = true;
	
	/** �b�r�u���ڔԍ���` */
	// �i�ڔԍ�
	private final int CSV_ITEM_CD = 0;
	// �����[��
	private final int CSV_PRD_DUE_DATE = 1;
	// �����\���
	private final int CSV_PUCH_ODR_DLV_DATE = 2;
	// ������
	private final int CSV_PUCH_ODR_QTY = 3;
	// �����R�[�h
	private final int CSV_VEND_CD = 4;
	// ����
	private final int CSV_JOB_ODR_CD = 5;
	// �����񓚔[��
	private final int CSV_CONFIRM_DLV_DATE = 6;
	// ����ꏊ
	private final int CSV_WH_CD = 7;
	// ���l
	private final int CSV_WORK_IN_PROC_COMMENT = 8;
	// ���i�����t���O
	private final int CSV_NON_NO_ITEM_FLG = 9;
	// ���i�����i�ږ�
	private final int CSV_NON_NO_ITEM_NAME = 10;
	// ���i�������i�敪
	private final int CSV_NON_NO_ITEM_TYP = 11;
	// ���i�����P��
	private final int CSV_NON_NO_ITEM_PUCH_ODR_UNIT = 12;
	// �P���敪
	private final int CSV_UNIT_COST_TYP = 13;
	// �P��
	private final int CSV_ACTUAL_UNIT_PRICE = 14;
	// ���H��
	private final int CSV_PROCESSING_COST = 15;
	// �ޗ���
	private final int CSV_MATERIAL_COST = 16;
	// ���̑��o��
	private final int CSV_OTHER_OVERHEADS = 17;
	// �{�̋��z
	private final int CSV_NET_AMOUNT = 18;
	// �בփ��[�g
	private final int CSV_EXCH_RATE = 19;
//20150806 ADD START BY SYSCOM
	//�ȖڃR�[�h
	private final int CSV_ACCT_CD = 20;
	//���S����R�[�h
	private final int CSV_DEPT_CD = 21;
	//�v���W�F�N�g�R�[�h
	private final int CSV_PJ_CD = 22;
	//�Z�O�����g1
	private final int CSV_SEG_CONTENTS1 = 23;
	//�Z�O�����g2
	private final int CSV_SEG_CONTENTS2 = 24;
	//�Z�O�����g3
	private final int CSV_SEG_CONTENTS3 = 25;
	//�Z�O�����g4
	private final int CSV_SEG_CONTENTS4 = 26;
//20150806 ADD END BY SYSCOM

	// �b�r�u�捞�f�[�^�K�v���ڐ�(���v)
//20150806 MOD START BY SYSCOM
//	private final int CSV_NECESSARY_COLUMN = 20;
	private final int CSV_NECESSARY_COLUMN = 27;
//20150806 MOD END BY SYSCOM
	// �G���[���b�Z�[�W
	private ExpjMessage _emsg = null;
	
	/** EJa-ASPROVA�A�g�I�v�V���������t���O�擾�p */
	private String _SysInstallOptions_ASP = null;
	
	/** �Ɩ��^�p��*/
	private String _btmBusinessOprDate;
	
	// �����ꍀ�ڎ擾�Ή�
    ResourceBundle resource = CoreTools.getResourceBundle( "OrteusUserDic", CoreTools.getLocale(sysUSER_CD));
	
	// �R���{�{�b�N�X��`
	// �G���[��ԋ敪
	private ComboStruct _COM_ERR_TYP = null;
	
	// ���i�����t���O
	private ComboStruct _NON_NO_ITEM_FLG = null;
	
	// ���i�������i�敪
	private ComboStruct _PRODUCT_TYP = null;
	
	// �P���敪
	private ComboStruct _UNIT_COST_TYP = null;
	
	/*��ЃR�[�h*/
	public String _company_cd = null;
	
	/*���p�X�x�[�X*/
	private String _space = " ";
	
	/** [�M��]��� */
    private HomeCurStruct _homeCurStruct = new HomeCurStruct();
		
	// �����ꍀ�ڎ擾�Ή�
	private String _locale = CoreTools.getLocale(sysUSER_CD);
	ResourceBundle _resource = CoreTools.getResourceBundle("OrteusUserDic", _locale);

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
	 * �֑������`�F�b�N(�u_�v �u%�v�u\�v)
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
     * �ғ����`�F�b�N��������t������Ŏg����悤�ɂ����Ϗ����\�b�h�ł��B
     * @param dateString ���t������
     * @return �ғ����̏ꍇ�� true�A ��ғ����̏ꍇ��false��Ԃ��܂��B
     * @throws FoundationException  ���ʕ��i�����Ŏ��s
     * @throws ParseException �^�ϊ��Ɏ��s
     */
    private boolean isWorkDay(String dateString) throws FoundationException, ParseException {
    	
     Date date = Converter.strToDate(dateString, "yyyy/MM/dd");
   
     // �ғ������ʕ��i�𐶐����A�`�F�b�N���������s
     WorkCalendar wc;
     if(!_Itemflg){
     	wc = new WorkCalendar(conn, sysUSER_CD, sp.getProcId(), this.sysPLANT_CD,struct.getITEM_CD(), date);
     }else{
     	wc = new WorkCalendar(conn, sysUSER_CD, sp.getProcId(), this.sysPLANT_CD, date);
     }
     boolean reslt = wc.isWorkDate();
     return reslt;
    }
	
    /**
     * �ғ������Z��������t������Ŏg����悤�ɂ����Ϗ����\�b�h�ł��B
     * @param dateString ���t������
     * @return ���Z���ʂ̓��t������
     * @throws FoundationException ���ʕ��i�����Ŏ��s
     * @throws ParseException �^�ϊ��Ɏ��s
     */
    private String calcWorkDay(String dateString, String timeString, String ltString, boolean flg)
     throws FoundationException, ParseException {

     // �n����Ă���������hh24:mi:ss�`���ɐ�����
     timeString = timeString.substring(0,2) + ":" + timeString.substring(2) + ":00";

     // �����̔N�����ƌ`���𐮂����������������A���t�^�ɕϊ�����
     Date date = Converter.strToDate(dateString + " " + timeString, "yyyy/MM/dd HH:mm:ss");
     int lt = Integer.parseInt(ltString);
   
     // �ғ������ʕ��i�𐶐����A�`�F�b�N���������s
     WorkCalendar wc =
      new WorkCalendar(conn, sysUSER_CD, sp.getProcId(), this.sysPLANT_CD,struct.getITEM_CD(), date, lt, flg);
     Date resultDate = wc.calcDate();

     if (resultDate == null || "".equals(resultDate)){
    	 return ""; 
     }
     // �����Z�o���ꂽ���t�𕶎��^�ɕϊ����ĕێ�����
     String tidydate = Converter.dateToStr(resultDate, "yyyy/MM/dd HH:mm:ss");

     // �����Z�o���ꂽ���t��yyyy/mm/dd hh24mi�`���ɐ�����
     tidydate = tidydate.substring(0,10) + tidydate.substring(11,13) + tidydate.substring(14,16);

     //return df.format(tidydate);
     return tidydate;
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
	
	//---------- ���t�ϊ� -------------------------------------------
	public Date StrngToDt(String in){
		Date out = null;
		SimpleDateFormat fm = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		if(in == null) return out;
		try{
			if((out = fm.parse(in)) != null) return out;
		}catch(ParseException e){}
		return out;
	}
	
	public String DtGetDate(Date in)
	{
		SimpleDateFormat fm = new SimpleDateFormat("yyyy/MM/dd");
		if(in == null) return null;
		return fm.format(in);
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
	*			�G���[���ږ�
	* @param errItemCd1
	*			�G���[���ږ�
	* @param errItemCd2
	*			�G���[���ږ�
	* @return �ُ�Ȃ� true �G���[ false
	*/  
	
	private boolean csvExport(AE0180010Struct targetStruct, String errTyp, int errlineNo, String errItem, String errMsg, String errItemCd,String errItemCd1,String errItemCd2) {
		AE0180010Struct errStruct = new AE0180010Struct();
		AE0180010Struct infoStruct = new AE0180010Struct();
		// �G���[�ӏ�
		ExpjMessage emsg = new ExpjMessage("AA01520", String.valueOf(errlineNo));
		errStruct.setl_ERROR_IN(emsg.getMessage(_locale));
		
		String strErrItem = null;
		if(!isNull(errItemCd2)){
			strErrItem = CoreTools.getRBString(errItem, _resource) + "," +CoreTools.getRBString(errItemCd, _resource)+ "," 
		                 +CoreTools.getRBString(errItemCd1, _resource)+ "," +CoreTools.getRBString(errItemCd2, _resource);
		}else if(!isNull(errItemCd1)){
			strErrItem = CoreTools.getRBString(errItem, _resource) + "," +CoreTools.getRBString(errItemCd, _resource)+ "," 
	                 +CoreTools.getRBString(errItemCd1, _resource);
		}else if(!isNull(errItemCd)) {
			strErrItem = CoreTools.getRBString(errItem, _resource) + "," +CoreTools.getRBString(errItemCd, _resource);
		}else{
			strErrItem = CoreTools.getRBString(errItem, _resource);
		}

		int errline = errlineNo-1;
		infoStruct =(AE0180010Struct)listCsvTemp.get(errline);
		// �G���[�敪
		errStruct.setl_ERR_TYP(getDisplayName(_COM_ERR_TYP, errTyp));
		// �G���[���e
		errStruct.setl_ERR_INFO(errMsg);
		// �G���[���ږ�
		errStruct.setl_ERR_CTR_NM(strErrItem);
		// �i�ڔԍ�
		errStruct.setl_ERR_ITEM_CD(replaceSlashAdd(infoStruct.getITEM_CD()));	
		// �����[��
		errStruct.setl_ERR_PRD_DUE_DATE(replaceSlashAdd(infoStruct.getPUCH_ODR_DLV_DATE()));
		// �����\���
		errStruct.setl_ERR_PUCH_ODR_DLV_DATE(replaceSlashAdd(infoStruct.getL_PUCH_ODR_START_DATE()));
		// ������
		errStruct.setl_ERR_PUCH_ODR_QTY(replaceSlashAdd(infoStruct.getL_PUCH_ODR_QTY()));
		// �����R�[�h
		errStruct.setl_ERR_VEND_CD(replaceSlashAdd(infoStruct.getVEND_CD()));
		// ����
		errStruct.setl_ERR_JOB_ODR_CD(replaceSlashAdd(infoStruct.getL_JOB_ODR_CD()));
		// �����񓚔[��
		errStruct.setl_ERR_CONFIRM_DLV_DATE(replaceSlashAdd(infoStruct.getCONFIRM_DLV_DATE()));
		// ����ꏊ
		errStruct.setl_ERR_WH_CD(replaceSlashAdd(infoStruct.getWH_CD()));
		// ���l
		errStruct.setl_ERR_WORK_IN_PROC_COMMENT(replaceSlashAdd(infoStruct.getPUCH_ODR_COMMENT()));
		// ���i�����t���O
		errStruct.setl_ERR_NON_NO_ITEM_FLG(replaceSlashAdd(infoStruct.getNON_NO_ITEM_FLG()));
		// ���i�����i�ږ�
		errStruct.setl_ERR_NON_NO_ITEM_NAME(replaceSlashAdd(infoStruct.getNON_NO_ITEM_NAME()));
		// ���i�������i�敪
		errStruct.setl_ERR_NON_NO_ITEM_TYP(replaceSlashAdd(infoStruct.getNON_NO_ITEM_TYP()));
		// ���i�����P��
		errStruct.setl_ERR_NON_NO_ITEM_PUCH_ODR_UNIT(replaceSlashAdd(infoStruct.getNON_NO_ITEM_PUCH_ODR_UNIT()));
		// �P���敪
		errStruct.setl_ERR_UNIT_COST_TYP(replaceSlashAdd(infoStruct.getL_UNIT_COST_TYP()));
		// �P��
		errStruct.setl_ERR_ACTUAL_UNIT_PRICE(replaceSlashAdd(infoStruct.getL_UNIT_COST()));
		// ���H��
		errStruct.setl_ERR_PROCESSING_COST(replaceSlashAdd(infoStruct.getL_PROCESSING_COST()));
		// �ޗ���
		errStruct.setl_ERR_MATERIAL_COST(replaceSlashAdd(infoStruct.getL_MATERIAL_COST()));
		// ���̑��o��
		errStruct.setl_ERR_OTHER_OVERHEADS(replaceSlashAdd(infoStruct.getL_OTHER_OVERHEADS()));
		// �{�̋��z
		errStruct.setl_ERR_NET_AMOUNT(replaceSlashAdd(infoStruct.getL_NET_AMOUNT()));
		// �בփ��[�g
		errStruct.setl_ERR_EXCH_RATE(replaceSlashAdd(infoStruct.getL_EXCH_RATE()));
//20150806 ADD START BY SYSCOM
		//�ȖڃR�[�h
		errStruct.setl_ERR_EXPENSE_CLASS_CD(replaceSlashAdd(infoStruct.getACCT_CD()));
		//���S����R�[�h
		errStruct.setl_ERR_DEPT_CD(replaceSlashAdd(infoStruct.getDEPT_CD()));
		//�v���W�F�N�g�R�[�h
		errStruct.setl_ERR_PJ_CD(replaceSlashAdd(infoStruct.getPJ_CD()));
		//�Z�O�����g1
		errStruct.setl_ERR_SEG_CONTENTS1(replaceSlashAdd(infoStruct.getSEG_CONTENTS1()));
		//�Z�O�����g2
		errStruct.setl_ERR_SEG_CONTENTS2(replaceSlashAdd(infoStruct.getSEG_CONTENTS2()));
		//�Z�O�����g3
		errStruct.setl_ERR_SEG_CONTENTS3(replaceSlashAdd(infoStruct.getSEG_CONTENTS3()));
		//�Z�O�����g4
		errStruct.setl_ERR_SEG_CONTENTS4(replaceSlashAdd(infoStruct.getSEG_CONTENTS4()));
//20150806 ADD END BY SYSCOM
		
		// list��ǉ�
		list.add(errStruct);
		return true;
	}
	
	/**
	 * �b�r�u�f�[�^�`�F�b�N
	 * @param csvList
	 * @return
	 * @throws BusinessProcessException
	 * @throws FoundationException
	 */
	private boolean checkCsvData(List csvList) throws BusinessProcessException, FoundationException {

		// �S�����R�[�h��
		_intTotalCount = csvList.size();
		AE0180010Struct csvStruct = new AE0180010Struct();
		boolean itemCheckFlg = false;
		// �����[�����t
		String strDlvYmd = null;
		// �����\������t
		String strStartYmd = null;
		// �����񓚔[��*/
		String strConfirmYmd = null;
		
		try {

			for (int i = 0; i < csvList.size(); i++)	{
	             //�t���O��������
		        _Itemflg = true;
		        itemCheckFlg = false;
				csvStruct =(AE0180010Struct)csvList.get(i);
				warningFlg = false;
				AE0180010Struct itemStruct = new AE0180010Struct();
				AE0180010Struct jobOdrStruct = new AE0180010Struct();
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
							, null
							, null); 
					_intErrorCount++;
					continue;
				}
				// �ȉ��i�ڔԍ��̃`�F�b�N
				// ���i�ȊO�A����NULL�̏ꍇ
				if("0".equals(csvStruct.getNON_NO_ITEM_FLG()) && isNull(csvStruct.getITEM_CD())){
					csvExport(csvStruct						// �Ώۃf�[�^���
							, "1"							// �G���[�敪
							, i + 1							// �G���[�����s
							, "Expj.ITEM_CD"				// �G���[���ږ�
							, new ExpjMessage("AB00002").getMessage(_locale)		// �G���[���b�Z�[�W
							, null
							, null
							, null); 
					_intErrorCount++;
					continue;
				// ���i�A���i�ڔԍ��Ɣ��i�����i�ږ���NULL�̏ꍇ
				}else if("1".equals(csvStruct.getNON_NO_ITEM_FLG()) && isNull(csvStruct.getNON_NO_ITEM_NAME())
						&& isNull(csvStruct.getITEM_CD())){
					csvExport(csvStruct						// �Ώۃf�[�^���
							, "1"							// �G���[�敪
							, i + 1							// �G���[�����s
							, "Expj.ITEM_CD"				// �G���[���ږ�
							, new ExpjMessage("AB00002").getMessage(_locale)		// �G���[���b�Z�[�W
							, null
							, null
							, null); 
					_intErrorCount++;
					continue;
				// �i�ڔԍ���NULL�ȊO�̏ꍇ
				}else if(!isNull(csvStruct.getITEM_CD())){
					// ����26���ȏ�̏ꍇ
					if (strLengthChk(csvStruct.getITEM_CD()) >= 26) {
						csvExport(csvStruct						// �Ώۃf�[�^���
								, "1"							// �G���[�敪
								, i + 1							// �G���[�����s
								, "Expj.ITEM_CD"				// �G���[���ږ�
								, new ExpjMessage("AA01501").getMessage(_locale)		// �G���[���b�Z�[�W
								, null
								, null
								, null); 
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
								, null
								, null); 
						_intErrorCount++;
						continue;
					}
					struct.setITEM_CD(csvStruct.getITEM_CD());
				}
				// �ȉ������[���̃`�F�b�N
				// NULL�̏ꍇ
				if(isNull(csvStruct.getPUCH_ODR_DLV_DATE())){
					csvExport(csvStruct						// �Ώۃf�[�^���
							, "1"							// �G���[�敪
							, i + 1							// �G���[�����s
							, "Expj.PRD_DUE_DATE_1"			// �G���[���ږ�
							, new ExpjMessage("AE00014").getMessage(_locale)		// �G���[���b�Z�[�W
							, null
							, null
							, null); 
					_intErrorCount++;
					continue;
				}else{
					String strDate = csvStruct.getPUCH_ODR_DLV_DATE();
					int dateIdx = strDate.indexOf(_space);
					if (dateIdx < 0) {
						strDlvYmd = csvStruct.getPUCH_ODR_DLV_DATE();
						// ���t�^�łȂ��ꍇ
						if (!checkDate(csvStruct.getPUCH_ODR_DLV_DATE())) {
							csvExport(csvStruct                         // �Ώۃf�[�^���
									 , "1"								// �G���[�敪
									 , i + 1							// �G���[�s�ԍ�
									 , "Expj.PRD_DUE_DATE_1"			// �G���[���ږ�
									 , new ExpjMessage("AA01606").getMessage(_locale)// �G���[���b�Z�[�W
									 , null
									 , null
									 , null);	
							_intErrorCount++;
							continue;
						}
					} else {
						strDlvYmd = strDate.substring(0, dateIdx);
						String strTime = strDate.substring(dateIdx+1);
						if ("false".equals(struct.getTIME_CTRL())) {
							strTime = "0000";
							csvStruct.setPUCH_ODR_DLV_DATE(strDlvYmd+_space+strTime);
						}
						if (!checkDate(strDlvYmd) || !checkTime(strTime)) {
							csvExport(csvStruct                         // �Ώۃf�[�^���
									 , "1"								// �G���[�敪
									 , i + 1							// �G���[�s�ԍ�
									 , "Expj.PRD_DUE_DATE_1"			// �G���[���ږ�
									 , new ExpjMessage("AA01606").getMessage(_locale)// �G���[���b�Z�[�W
									 , null
									 , null
									 , null);	
							_intErrorCount++;
							continue;
						}
					}
				}
				// �ȉ������\����̃`�F�b�N
				// �����\�����NULL�ȊO�ꍇ
				if(!isNull(csvStruct.getPUCH_ODR_START_DATE())){
					String strDate = csvStruct.getPUCH_ODR_START_DATE();
					int dateIdx = strDate.indexOf(_space);
					if (dateIdx < 0) {
						strStartYmd = csvStruct.getPUCH_ODR_START_DATE();
						// ���t�^�łȂ��ꍇ
						if (!checkDate(csvStruct.getPUCH_ODR_START_DATE())) {
							csvExport(csvStruct                         // �Ώۃf�[�^���
									, "1"								// �G���[�敪
									, i + 1							// �G���[�s�ԍ�
									, "Expj.PUCH_ODR_DLV_DATE_1"		// �G���[���ږ�
									, new ExpjMessage("AA01606").getMessage(_locale)// �G���[���b�Z�[�W
									, null
									, null
									, null);	
							_intErrorCount++;
							continue;
						}
					} else {
						strStartYmd = strDate.substring(0, dateIdx);
						String strTime = strDate.substring(dateIdx+1);
						if ("false".equals(struct.getTIME_CTRL())) {
							strTime = "0000";
							csvStruct.setPUCH_ODR_START_DATE(strStartYmd+_space+strTime);
						}
						if (!checkDate(strStartYmd) || !checkTime(strTime)) {
							csvExport(csvStruct                         // �Ώۃf�[�^���
									, "1"								// �G���[�敪
									, i + 1							// �G���[�s�ԍ�
									, "Expj.PUCH_ODR_DLV_DATE_1"		// �G���[���ږ�
									, new ExpjMessage("AA01606").getMessage(_locale)// �G���[���b�Z�[�W
									, null
									, null
									, null);	
							_intErrorCount++;
							continue;
						}
					}
				}
				// �ȉ��������̃`�F�b�N
				// NULL�̏ꍇ
				if (isNull(csvStruct.getPUCH_ODR_QTY())){
					csvExport(csvStruct						// �Ώۃf�[�^���
							, "1"							// �G���[�敪
							, i + 1							// �G���[�����s
							, "Expj.PUCH_ODR_QTY"			// �G���[���ږ�
							, new ExpjMessage("AE32609").getMessage(_locale)		// �G���[���b�Z�[�W
							, null
							, null
							, null); 
					_intErrorCount++;
					continue;
				}else{
					// ���l�ȊO�̏ꍇ
					if (!isNumChk(csvStruct.getPUCH_ODR_QTY())) {
						csvExport(csvStruct                         // �Ώۃf�[�^���
								 , "1"								// �G���[�敪
								 , i + 1							// �G���[�s�ԍ�
								 , "Expj.PUCH_ODR_QTY"				// �G���[���ږ�
								 , new ExpjMessage("AA01503").getMessage(_locale)// �G���[���b�Z�[�W
								 , null 
								 , null
								 , null);	
						_intErrorCount++;
						continue;
					}
					// �}�C�i�X�̏ꍇ
					if (Calculate.compare(csvStruct.getPUCH_ODR_QTY(), "0") == -1) {
						csvExport(csvStruct                         // �Ώۃf�[�^���
								 , "1"								// �G���[�敪
								 , i + 1							// �G���[�s�ԍ�
								 , "Expj.PUCH_ODR_QTY"				// �G���[���ږ�
								 , new ExpjMessage("AD34026").getMessage(_locale)// �G���[���b�Z�[�W
								 , null
								 , null
								 , null);	
						_intErrorCount++;
						continue;
					}
					// �L������(������14��:������4��)�𒴉ߏꍇ
					if (!isNotInNumRange(csvStruct.getPUCH_ODR_QTY(), 14, 4)) {
						// �����ꍀ�ڎ擾�Z�b�g
	                    String ErrInfo = CoreTools.getRBString("Expj.PUCH_ODR_QTY", resource);
						csvExport(csvStruct                         // �Ώۃf�[�^���
								 , "1"								// �G���[�敪
								 , i + 1							// �G���[�s�ԍ�
								 , "Expj.PUCH_ODR_QTY"				// �G���[���ږ�
								 , new ExpjMessage("AA00215",ErrInfo).getMessage(_locale)	// �G���[���b�Z�[�W
								 , null
								 , null
								 , null);
						_intErrorCount++;
						continue;
					}
				}
				// �ȉ������R�[�h�̃`�F�b�N
				// NULL�̏ꍇ
				if (isNull(csvStruct.getVEND_CD())){
					csvExport(csvStruct						// �Ώۃf�[�^���
							, "1"							// �G���[�敪
							, i + 1							// �G���[�����s
							, "Expj.VEND_CD"				// �G���[���ږ�
							, new ExpjMessage("AA02004").getMessage(_locale)		// �G���[���b�Z�[�W
							, null
							, null
							, null); 
					_intErrorCount++;
					continue;
				}else{
					// ����26���ȏ�̏ꍇ
					if (strLengthChk(csvStruct.getVEND_CD()) >= 26) {
						csvExport(csvStruct						// �Ώۃf�[�^���
								, "1"							// �G���[�敪
								, i + 1							// �G���[�����s
								, "Expj.VEND_CD"				// �G���[���ږ�
								, new ExpjMessage("AA01501").getMessage(_locale)		// �G���[���b�Z�[�W
								, null
								, null
								, null); 
						_intErrorCount++;
						continue;
					}
					// �֑����������͂���Ă����ꍇ
					if (chkHankaku(csvStruct.getVEND_CD())) {
						csvExport(csvStruct						// �Ώۃf�[�^���
								, "1"							// �G���[�敪
								, i + 1							// �G���[�����s
								, "Expj.VEND_CD"				// �G���[���ږ�
								, new ExpjMessage("AA01524").getMessage(_locale)		// �G���[���b�Z�[�W
								, null
								, null
								, null); 
						_intErrorCount++;
						continue;
					}
				}
				// �ȉ����Ԃ̃`�F�b�N
				// ���Ԃ�NULL�ȊO�̏ꍇ
				if(!isNull(csvStruct.getJOB_ODR_CD())){
					// ����26���ȏ�̏ꍇ
					if (strLengthChk(csvStruct.getJOB_ODR_CD()) >= 26) {
						csvExport(csvStruct						// �Ώۃf�[�^���
								, "1"							// �G���[�敪
								, i + 1							// �G���[�����s
								, "Expj.JOB_ODR_CD"				// �G���[���ږ�
								, new ExpjMessage("AA01501").getMessage(_locale)		// �G���[���b�Z�[�W
								, null
								, null
								, null); 
						_intErrorCount++;
						continue;
					}
					// �֑����������͂���Ă����ꍇ
					if (chkHankaku(csvStruct.getJOB_ODR_CD())) {
						csvExport(csvStruct						// �Ώۃf�[�^���
								, "1"							// �G���[�敪
								, i + 1							// �G���[�����s
								, "Expj.JOB_ODR_CD"				// �G���[���ږ�
								, new ExpjMessage("AA01524").getMessage(_locale)		// �G���[���b�Z�[�W
								, null
								, null
								, null); 
						_intErrorCount++;
						continue;
					}
				}
				// �ȉ������񓚔[���̃`�F�b�N
				// �����񓚔[����NULL�ȊO�̏ꍇ
				if(!isNull(csvStruct.getCONFIRM_DLV_DATE())){
					String strDate = csvStruct.getCONFIRM_DLV_DATE();
					int dateIdx = strDate.indexOf(_space);
					if (dateIdx < 0) {
						// ���t�^�łȂ��ꍇ
						strConfirmYmd = csvStruct.getCONFIRM_DLV_DATE();
						if (!checkDate(csvStruct.getCONFIRM_DLV_DATE())) {
							csvExport(csvStruct                         // �Ώۃf�[�^���
									, "1"								// �G���[�敪
									, i + 1							// �G���[�s�ԍ�
									, "Expj.CONFIRM_DLV_DATE_1"		// �G���[���ږ�
									, new ExpjMessage("AA01606").getMessage(_locale)// �G���[���b�Z�[�W
									, null
									, null
									, null);	
							_intErrorCount++;
							continue;
						}
					} else {
						strConfirmYmd = strDate.substring(0, dateIdx);
						String strTime = strDate.substring(dateIdx+1);
						if ("false".equals(struct.getTIME_CTRL())) {
							strTime = "0000";
							csvStruct.setCONFIRM_DLV_DATE(strConfirmYmd+_space+strTime);
						}
						if (!checkDate(strConfirmYmd) || !checkTime(strTime)) {
							// ���t�^�łȂ��ꍇ
							if (!checkDate(csvStruct.getCONFIRM_DLV_DATE())) {
								csvExport(csvStruct                         // �Ώۃf�[�^���
										, "1"								// �G���[�敪
										, i + 1							// �G���[�s�ԍ�
										, "Expj.CONFIRM_DLV_DATE_1"		// �G���[���ږ�
										, new ExpjMessage("AA01606").getMessage(_locale)// �G���[���b�Z�[�W
										, null
										, null
										, null);	
								_intErrorCount++;
								continue;
							}
						}
					}
				}
				// �ȉ�����ꏊ�̃`�F�b�N
				// NULL�̏ꍇ
				if (isNull(csvStruct.getWH_CD())){
					csvExport(csvStruct						// �Ώۃf�[�^���
							, "1"							// �G���[�敪
							, i + 1							// �G���[�����s
							, "Expj.WH_CD_2"				// �G���[���ږ�
							, new ExpjMessage("AE00013").getMessage(_locale)		// �G���[���b�Z�[�W
							, null
							, null
							, null); 
					_intErrorCount++;
					continue;
				}else{
					// ����26���ȏ�̏ꍇ
					if (strLengthChk(csvStruct.getWH_CD()) >= 26) {
						csvExport(csvStruct						// �Ώۃf�[�^���
								, "1"							// �G���[�敪
								, i + 1							// �G���[�����s
								, "Expj.WH_CD_2"				// �G���[���ږ�
								, new ExpjMessage("AA01501").getMessage(_locale)		// �G���[���b�Z�[�W
								, null
								, null
								, null); 
						_intErrorCount++;
						continue;
					}
					// �֑����������͂���Ă����ꍇ
					if (chkHankaku(csvStruct.getWH_CD())) {
						csvExport(csvStruct						// �Ώۃf�[�^���
								, "1"							// �G���[�敪
								, i + 1							// �G���[�����s
								, "Expj.WH_CD_2"				// �G���[���ږ�
								, new ExpjMessage("AA01524").getMessage(_locale)		// �G���[���b�Z�[�W
								, null
								, null
								, null); 
						_intErrorCount++;
						continue;
					}
				}
				// �ȉ����l�̃`�F�b�N
				// ���l��NULL�ȊO�̏ꍇ
				if(!isNull(csvStruct.getPUCH_ODR_COMMENT())){
				    // ����81���ȏ�̏ꍇ
				    if (strLengthChk(csvStruct.getPUCH_ODR_COMMENT()) >= 81) {
					    csvExport(csvStruct						// �Ώۃf�[�^���
   						   	     , "1"							// �G���[�敪
							     , i + 1						// �G���[�����s
							     , "Expj.WORK_IN_PROC_COMMENT_3"// �G���[���ږ�
							     , new ExpjMessage("AA01501").getMessage(_locale)		// �G���[���b�Z�[�W
							     , null
							     , null
								 , null); 
					    _intErrorCount++;
					    continue;
				    }
				    // �֑����������͂���Ă����ꍇ
					if (chkHankaku(csvStruct.getPUCH_ODR_COMMENT())) {
						csvExport(csvStruct						// �Ώۃf�[�^���
								, "1"							// �G���[�敪
								, i + 1							// �G���[�����s
								, "Expj.WORK_IN_PROC_COMMENT_3"	// �G���[���ږ�
								, new ExpjMessage("AA01524").getMessage(_locale)		// �G���[���b�Z�[�W
								, null
								, null
								, null); 
						_intErrorCount++;
						continue;
					}
				}
				// �ȉ����i�����t���O�̃`�F�b�N
				// NULL�̏ꍇ
				if (isNull(csvStruct.getNON_NO_ITEM_FLG())){
					csvExport(csvStruct						// �Ώۃf�[�^���
							, "1"							// �G���[�敪
							, i + 1							// �G���[�����s
							, "Expj.NON_NO_ITEM_FLG"		// �G���[���ږ�
							, new ExpjMessage("AE05069").getMessage(_locale)		// �G���[���b�Z�[�W
							, null
							, null
							, null); 
					_intErrorCount++;
					continue;
				}else{
				    // ���l�ȊO�̏ꍇ
					if (!isNumChk(csvStruct.getNON_NO_ITEM_FLG())) {
						csvExport(csvStruct                         // �Ώۃf�[�^���
								 , "1"								// �G���[�敪
								 , i + 1							// �G���[�s�ԍ�
								 , "Expj.NON_NO_ITEM_FLG"			// �G���[���ږ�
								 , new ExpjMessage("AA01503").getMessage(_locale)// �G���[���b�Z�[�W
								 , null 
								 , null
								 , null);	
						_intErrorCount++;
						continue;
					}
					// (0,1)�ȊO�̏ꍇ
					boolean comFlag1 = checkCombValue(_NON_NO_ITEM_FLG, csvStruct.getNON_NO_ITEM_FLG());
					if (comFlag1 == false) {
						csvExport(csvStruct                                 // �Ώۃf�[�^���
								, "1"										// �G���[�敪
								, i + 1										// �G���[�s�ԍ�
								, "Expj.NON_NO_ITEM_FLG"					// �G���[���ږ�
								, new ExpjMessage("AE05070").getMessage(_locale)// �G���[���b�Z�[�W
								, null
								, null
								, null);	
						_intErrorCount++;
						continue;
					}
				}
				// �ȉ����i�����i�ږ��̃`�F�b�N
				// ���i�A���i�ڔԍ��Ɣ��i�����i�ږ���NULL�̏ꍇ
		        if("1".equals(csvStruct.getNON_NO_ITEM_FLG()) && isNull(csvStruct.getITEM_CD())
					&& isNull(csvStruct.getNON_NO_ITEM_NAME())){
		        	csvExport(csvStruct						// �Ώۃf�[�^���
							, "1"							// �G���[�敪
							, i + 1							// �G���[�����s
							, "Expj.NON_NO_ITEM_NAME"		// �G���[���ږ�
							, new ExpjMessage("AE05071").getMessage(_locale)		// �G���[���b�Z�[�W
							, null
							, null
							, null); 
					_intErrorCount++;
					continue;
		        }else{
		        	// ���i�����i�ږ���NULL�ȊO�ꍇ
		        	if(!isNull(csvStruct.getNON_NO_ITEM_NAME())){
		        		// �������S�P���ȏ�̏ꍇ
			        	if (strLengthChk(csvStruct.getNON_NO_ITEM_NAME()) >= 41) {
						    csvExport(csvStruct						// �Ώۃf�[�^���
	   						   	     , "1"							// �G���[�敪
								     , i + 1						// �G���[�����s
								     , "Expj.NON_NO_ITEM_NAME"		// �G���[���ږ�
								     , new ExpjMessage("AA01501").getMessage(_locale)		// �G���[���b�Z�[�W
								     , null
								     , null
									 , null); 
						    _intErrorCount++;
						    continue;
					    }
					    // �֑����������͂���Ă����ꍇ
						if (chkHankaku(csvStruct.getNON_NO_ITEM_NAME())) {
							csvExport(csvStruct						// �Ώۃf�[�^���
									, "1"							// �G���[�敪
									, i + 1							// �G���[�����s
									, "Expj.NON_NO_ITEM_NAME"		// �G���[���ږ�
									, new ExpjMessage("AA01524").getMessage(_locale)		// �G���[���b�Z�[�W
									, null
									, null
									, null); 
							_intErrorCount++;
							continue;
						}
		        	}
		        }
		        // �ȉ����i�������i�敪�̃`�F�b�N
		        // ���i����NULL�̏ꍇ
		        if("1".equals(csvStruct.getNON_NO_ITEM_FLG())  && isNull(csvStruct.getNON_NO_ITEM_TYP())){
			        	csvExport(csvStruct						// �Ώۃf�[�^���
								, "1"							// �G���[�敪
								, i + 1							// �G���[�����s
								, "Expj.NON_NO_ITEM_TYP"		// �G���[���ږ�
								, new ExpjMessage("AE05072").getMessage(_locale)		// �G���[���b�Z�[�W
								, null
								, null
								, null); 
						_intErrorCount++;
						continue;
		        }else{
		        	// NULL�ȊO�̏ꍇ
		        	if (!isNull(csvStruct.getNON_NO_ITEM_TYP())){
		        		// ���l�ȊO�̏ꍇ
						if (!isNumChk(csvStruct.getNON_NO_ITEM_TYP())) {
							csvExport(csvStruct                         // �Ώۃf�[�^���
									 , "1"								// �G���[�敪
									 , i + 1							// �G���[�s�ԍ�
									 , "Expj.NON_NO_ITEM_TYP"			// �G���[���ږ�
									 , new ExpjMessage("AA01503").getMessage(_locale)// �G���[���b�Z�[�W
									 , null 
									 , null
									 , null);	
							_intErrorCount++;
							continue;
						}
						
						// (1,2,3,4,5)�ȊO�̏ꍇ
						boolean comFlag1 = checkCombValue(_PRODUCT_TYP, csvStruct.getNON_NO_ITEM_TYP());
						if ("1".equals(csvStruct.getNON_NO_ITEM_FLG()) && comFlag1 == false) {
							csvExport(csvStruct                                 // �Ώۃf�[�^���
									, "1"										// �G���[�敪
									, i + 1										// �G���[�s�ԍ�
									, "Expj.NON_NO_ITEM_TYP"					// �G���[���ږ�
									, new ExpjMessage("AE05070").getMessage(_locale)// �G���[���b�Z�[�W
									, null
									, null
									, null);	
							_intErrorCount++;
							continue;
						}
			        }
		        }
		        // �ȉ����i�����P�ʂ̃`�F�b�N
		        // ���i�����P�ʂ�NULL�ȊO�̏ꍇ
		        if(!isNull(csvStruct.getNON_NO_ITEM_PUCH_ODR_UNIT())){
		        	// ������13���ȏ�̏ꍇ
		        	if (strLengthChk(csvStruct.getNON_NO_ITEM_PUCH_ODR_UNIT()) >= 13) {
					    csvExport(csvStruct						    // �Ώۃf�[�^���
   						   	     , "1"							    // �G���[�敪
							     , i + 1							// �G���[�����s
							     , "Expj.NON_NO_ITEM_PUCH_ODR_UNIT"	// �G���[���ږ�
							     , new ExpjMessage("AA01501").getMessage(_locale)		// �G���[���b�Z�[�W
							     , null
							     , null
								 , null); 
					    _intErrorCount++;
					    continue;
				    }
				    // �֑����������͂���Ă����ꍇ
					if (chkHankaku(csvStruct.getNON_NO_ITEM_PUCH_ODR_UNIT())) {
						csvExport(csvStruct						     // �Ώۃf�[�^���
								, "1"							     // �G���[�敪
								, i + 1							     // �G���[�����s
								, "Expj.NON_NO_ITEM_PUCH_ODR_UNIT"	 // �G���[���ږ�
								, new ExpjMessage("AA01524").getMessage(_locale)		// �G���[���b�Z�[�W
								, null
								, null
								, null); 
						_intErrorCount++;
						continue;
					}
		        }
		        // �ȉ��P���敪�̃`�F�b�N
		        // �P���敪��NULL�ȊO�̏ꍇ
		        if(!isNull(csvStruct.getUNIT_COST_TYP())){
		        	// ���l�ȊO�̏ꍇ
					if (!isNumChk(csvStruct.getUNIT_COST_TYP())) {
						csvExport(csvStruct                         // �Ώۃf�[�^���
								 , "1"								// �G���[�敪
								 , i + 1							// �G���[�s�ԍ�
								 , "Expj.UNIT_COST_TYP"				// �G���[���ږ�
								 , new ExpjMessage("AA01503").getMessage(_locale)// �G���[���b�Z�[�W
								 , null 
								 , null
								 , null);	
						_intErrorCount++;
						continue;
					}
					
					// (1,2)�ȊO�̏ꍇ
					boolean comFlag1 = checkCombValue(_UNIT_COST_TYP, csvStruct.getUNIT_COST_TYP());
					if (comFlag1 == false) {
						csvExport(csvStruct                                 // �Ώۃf�[�^���
								, "1"										// �G���[�敪
								, i + 1										// �G���[�s�ԍ�
								, "Expj.UNIT_COST_TYP"					    // �G���[���ږ�
								, new ExpjMessage("AE05070").getMessage(_locale)// �G���[���b�Z�[�W
								, null
								, null
								, null);	
						_intErrorCount++;
						continue;
					}
		        }
		        // �ȉ��P���̃`�F�b�N
		        // �P����NULL�ȊO�̏ꍇ
		        if(!isNull(csvStruct.getUNIT_COST())){
		        	// ���l�ȊO�̏ꍇ
					if (!isNumChk(csvStruct.getUNIT_COST())) {
						csvExport(csvStruct                         // �Ώۃf�[�^���
								 , "1"								// �G���[�敪
								 , i + 1							// �G���[�s�ԍ�
								 , "Expj.ACTUAL_UNIT_PRICE"			// �G���[���ږ�
								 , new ExpjMessage("AA01503").getMessage(_locale)// �G���[���b�Z�[�W
								 , null 
								 , null
								 , null);	
						_intErrorCount++;
						continue;
					}
					// �}�C�i�X�̏ꍇ
					if (Calculate.compare(csvStruct.getUNIT_COST(), "0") == -1) {
						csvExport(csvStruct                         // �Ώۃf�[�^���
								 , "1"								// �G���[�敪
								 , i + 1							// �G���[�s�ԍ�
								 , "Expj.ACTUAL_UNIT_PRICE"			// �G���[���ږ�
								 , new ExpjMessage("AD34026").getMessage(_locale)// �G���[���b�Z�[�W
								 , null
								 , null
								 , null);	
						_intErrorCount++;
						continue;
					}
					// �L������(������14��:������4��)�𒴉ߏꍇ
					if (!isNotInNumRange(csvStruct.getUNIT_COST(), 14, 4)) {
						// �����ꍀ�ڎ擾�Z�b�g
	                    String ErrInfo = CoreTools.getRBString("Expj.ACTUAL_UNIT_PRICE", resource);
						csvExport(csvStruct                         // �Ώۃf�[�^���
								 , "1"								// �G���[�敪
								 , i + 1							// �G���[�s�ԍ�
								 , "Expj.ACTUAL_UNIT_PRICE"			// �G���[���ږ�
								 , new ExpjMessage("AA00215",ErrInfo).getMessage(_locale)	// �G���[���b�Z�[�W
								 , null
								 , null
								 , null);
						_intErrorCount++;
						continue;
					}
		        }
		        // �ȉ��P���敪�̃`�F�b�N
		        // [CSV���]�D�h�P���h��NULL�ȊO���ANULL�ꍇ
		        if(!isNull(csvStruct.getUNIT_COST()) && isNull(csvStruct.getUNIT_COST_TYP())){
		        	csvExport(csvStruct                         // �Ώۃf�[�^���
							 , "1"								// �G���[�敪
							 , i + 1							// �G���[�s�ԍ�
							 , "Expj.UNIT_COST_TYP"				// �G���[���ږ�
							 , new ExpjMessage("AD20033").getMessage(_locale)// �G���[���b�Z�[�W
							 , null 
							 , null
							 , null);	
					_intErrorCount++;
					continue;
		        }
		        // �ȉ����H��̃`�F�b�N
		        // [CSV���]�D�h�P���h��NULL�ȊO���ANULL�ꍇ
		        if(!isNull(csvStruct.getUNIT_COST()) && isNull(csvStruct.getPROCESSING_COST())){
		        	csvExport(csvStruct                         // �Ώۃf�[�^���
							 , "1"								// �G���[�敪
							 , i + 1							// �G���[�s�ԍ�
							 , "Expj.PROCESSING_COST"			// �G���[���ږ�
							 , new ExpjMessage("AE00040").getMessage(_locale)// �G���[���b�Z�[�W
							 , null 
							 , null
							 , null);	
					_intErrorCount++;
					continue;
		        }
		        // ���H�NULL�ȊO�̏ꍇ
		        if(!isNull(csvStruct.getPROCESSING_COST())){
		        	// ���l�ȊO�̏ꍇ
					if (!isNumChk(csvStruct.getPROCESSING_COST())) {
						csvExport(csvStruct                         // �Ώۃf�[�^���
								 , "1"								// �G���[�敪
								 , i + 1							// �G���[�s�ԍ�
								 , "Expj.PROCESSING_COST"			// �G���[���ږ�
								 , new ExpjMessage("AA01503").getMessage(_locale)// �G���[���b�Z�[�W
								 , null 
								 , null
								 , null);	
						_intErrorCount++;
						continue;
					}
					// �}�C�i�X�̏ꍇ
					if (Calculate.compare(csvStruct.getPROCESSING_COST(), "0") == -1) {
						csvExport(csvStruct                         // �Ώۃf�[�^���
								 , "1"								// �G���[�敪
								 , i + 1							// �G���[�s�ԍ�
								 , "Expj.PROCESSING_COST"			// �G���[���ږ�
								 , new ExpjMessage("AD34026").getMessage(_locale)// �G���[���b�Z�[�W
								 , null
								 , null
								 , null);	
						_intErrorCount++;
						continue;
					}
					// �L������(������14��:������4��)�𒴉ߏꍇ
					if (!isNotInNumRange(csvStruct.getPROCESSING_COST(), 14, 4)) {
						// �����ꍀ�ڎ擾�Z�b�g
	                    String ErrInfo = CoreTools.getRBString("Expj.PROCESSING_COST", resource);
						csvExport(csvStruct                         // �Ώۃf�[�^���
								 , "1"								// �G���[�敪
								 , i + 1							// �G���[�s�ԍ�
								 , "Expj.PROCESSING_COST"			// �G���[���ږ�
								 , new ExpjMessage("AA00215",ErrInfo).getMessage(_locale)	// �G���[���b�Z�[�W
								 , null
								 , null
								 , null);
						_intErrorCount++;
						continue;
					}
		        }
		        // �ȉ��ޗ���̃`�F�b�N
		        // [CSV���]�D�h�P���h��NULL�ȊO���ANULL�ꍇ
		        if(!isNull(csvStruct.getUNIT_COST()) && isNull(csvStruct.getMATERIAL_COST())){
		        	csvExport(csvStruct                         // �Ώۃf�[�^���
							 , "1"								// �G���[�敪
							 , i + 1							// �G���[�s�ԍ�
							 , "Expj.MATERIAL_COST"				// �G���[���ږ�
							 , new ExpjMessage("AE00041").getMessage(_locale)// �G���[���b�Z�[�W
							 , null 
							 , null
							 , null);	
					_intErrorCount++;
					continue;
		        }
		        // �ޗ��NULL�ȊO�̏ꍇ
		        if(!isNull(csvStruct.getMATERIAL_COST())){
		        	// ���l�ȊO�̏ꍇ
					if (!isNumChk(csvStruct.getMATERIAL_COST())) {
						csvExport(csvStruct                         // �Ώۃf�[�^���
								 , "1"								// �G���[�敪
								 , i + 1							// �G���[�s�ԍ�
								 , "Expj.MATERIAL_COST"				// �G���[���ږ�
								 , new ExpjMessage("AA01503").getMessage(_locale)// �G���[���b�Z�[�W
								 , null 
								 , null
								 , null);	
						_intErrorCount++;
						continue;
					}
					// �}�C�i�X�̏ꍇ
					if (Calculate.compare(csvStruct.getMATERIAL_COST(), "0") == -1) {
						csvExport(csvStruct                         // �Ώۃf�[�^���
								 , "1"								// �G���[�敪
								 , i + 1							// �G���[�s�ԍ�
								 , "Expj.MATERIAL_COST"				// �G���[���ږ�
								 , new ExpjMessage("AD34026").getMessage(_locale)// �G���[���b�Z�[�W
								 , null
								 , null
								 , null);	
						_intErrorCount++;
						continue;
					}
					// �L������(������14��:������4��)�𒴉ߏꍇ
					if (!isNotInNumRange(csvStruct.getMATERIAL_COST(), 14, 4)) {
						// �����ꍀ�ڎ擾�Z�b�g
	                    String ErrInfo = CoreTools.getRBString("Expj.MATERIAL_COST", resource);
						csvExport(csvStruct                         // �Ώۃf�[�^���
								 , "1"								// �G���[�敪
								 , i + 1							// �G���[�s�ԍ�
								 , "Expj.MATERIAL_COST"				// �G���[���ږ�
								 , new ExpjMessage("AA00215",ErrInfo).getMessage(_locale)	// �G���[���b�Z�[�W
								 , null
								 , null
								 , null);
						_intErrorCount++;
						continue;
					}
		        }
		        // �ȉ����̑��o��̃`�F�b�N
		        // [CSV���]�D�h�P���h��NULL�ȊO���ANULL�ꍇ
		        if(!isNull(csvStruct.getUNIT_COST()) && isNull(csvStruct.getOTHER_OVERHEADS())){
		        	csvExport(csvStruct                         // �Ώۃf�[�^���
							 , "1"								// �G���[�敪
							 , i + 1							// �G���[�s�ԍ�
							 , "Expj.OTHER_OVERHEADS"			// �G���[���ږ�
							 , new ExpjMessage("AE00042").getMessage(_locale)// �G���[���b�Z�[�W
							 , null 
							 , null
							 , null);	
					_intErrorCount++;
					continue;
		        }
		        // ���̑��o�NULL�ȊO�̏ꍇ
		        if(!isNull(csvStruct.getOTHER_OVERHEADS())){
		        	// ���l�ȊO�̏ꍇ
					if (!isNumChk(csvStruct.getOTHER_OVERHEADS())) {
						csvExport(csvStruct                         // �Ώۃf�[�^���
								 , "1"								// �G���[�敪
								 , i + 1							// �G���[�s�ԍ�
								 , "Expj.OTHER_OVERHEADS"			// �G���[���ږ�
								 , new ExpjMessage("AA01503").getMessage(_locale)// �G���[���b�Z�[�W
								 , null 
								 , null
								 , null);	
						_intErrorCount++;
						continue;
					}
					// �}�C�i�X�̏ꍇ
					if (Calculate.compare(csvStruct.getOTHER_OVERHEADS(), "0") == -1) {
						csvExport(csvStruct                         // �Ώۃf�[�^���
								 , "1"								// �G���[�敪
								 , i + 1							// �G���[�s�ԍ�
								 , "Expj.OTHER_OVERHEADS"			// �G���[���ږ�
								 , new ExpjMessage("AD34026").getMessage(_locale)// �G���[���b�Z�[�W
								 , null
								 , null
								 , null);	
						_intErrorCount++;
						continue;
					}
					// �L������(������14��:������4��)�𒴉ߏꍇ
					if (!isNotInNumRange(csvStruct.getOTHER_OVERHEADS(), 14, 4)) {
						// �����ꍀ�ڎ擾�Z�b�g
	                    String ErrInfo = CoreTools.getRBString("Expj.OTHER_OVERHEADS", resource);
						csvExport(csvStruct                         // �Ώۃf�[�^���
								 , "1"								// �G���[�敪
								 , i + 1							// �G���[�s�ԍ�
								 , "Expj.OTHER_OVERHEADS"			// �G���[���ږ�
								 , new ExpjMessage("AA00215",ErrInfo).getMessage(_locale)	// �G���[���b�Z�[�W
								 , null
								 , null
								 , null);
						_intErrorCount++;
						continue;
					}
		        }
		        // �ȉ��{�̋��z�̃`�F�b�N
		        // �{�̋��z��NULL�ȊO�̏ꍇ
		        if(!isNull(csvStruct.getNET_AMOUNT())){
		        	// ���l�ȊO�̏ꍇ
					if (!isNumChk(csvStruct.getNET_AMOUNT())) {
						csvExport(csvStruct                         // �Ώۃf�[�^���
								 , "1"								// �G���[�敪
								 , i + 1							// �G���[�s�ԍ�
								 , "Expj.NET_AMOUNT"				// �G���[���ږ�
								 , new ExpjMessage("AA01503").getMessage(_locale)// �G���[���b�Z�[�W
								 , null 
								 , null
								 , null);	
						_intErrorCount++;
						continue;
					}
					// �}�C�i�X�̏ꍇ
					if (Calculate.compare(csvStruct.getNET_AMOUNT(), "0") == -1) {
						csvExport(csvStruct                         // �Ώۃf�[�^���
								 , "1"								// �G���[�敪
								 , i + 1							// �G���[�s�ԍ�
								 , "Expj.NET_AMOUNT"				// �G���[���ږ�
								 , new ExpjMessage("AD34026").getMessage(_locale)// �G���[���b�Z�[�W
								 , null
								 , null
								 , null);	
						_intErrorCount++;
						continue;
					}
					// �L������(������14��:������4��)�𒴉ߏꍇ
					if (!isNotInNumRange(csvStruct.getNET_AMOUNT(), 14, 4)) {
						// �����ꍀ�ڎ擾�Z�b�g
	                    String ErrInfo = CoreTools.getRBString("Expj.NET_AMOUNT", resource);
						csvExport(csvStruct                         // �Ώۃf�[�^���
								 , "1"								// �G���[�敪
								 , i + 1							// �G���[�s�ԍ�
								 , "Expj.NET_AMOUNT"				// �G���[���ږ�
								 , new ExpjMessage("AA00215",ErrInfo).getMessage(_locale)	// �G���[���b�Z�[�W
								 , null
								 , null
								 , null);
						_intErrorCount++;
						continue;
					}
		        }
		        // �ȉ��בփ��[�g�̃`�F�b�N
		        // �בփ��[�g��NULL�ȊO�̏ꍇ
		        if(!isNull(csvStruct.getEXCH_RATE())){
		        	// ���l�ȊO�̏ꍇ
					if (!isNumChk(csvStruct.getEXCH_RATE())) {
						csvExport(csvStruct                         // �Ώۃf�[�^���
								 , "1"								// �G���[�敪
								 , i + 1							// �G���[�s�ԍ�
								 , "Expj.EXCH_RATE"					// �G���[���ږ�
								 , new ExpjMessage("AA01503").getMessage(_locale)// �G���[���b�Z�[�W
								 , null 
								 , null
								 , null);	
						_intErrorCount++;
						continue;
					}
					// �}�C�i�X�̏ꍇ
					if (Calculate.compare(csvStruct.getEXCH_RATE(), "0") == -1) {
						csvExport(csvStruct                         // �Ώۃf�[�^���
								 , "1"								// �G���[�敪
								 , i + 1							// �G���[�s�ԍ�
								 , "Expj.EXCH_RATE"				    // �G���[���ږ�
								 , new ExpjMessage("AD34026").getMessage(_locale)// �G���[���b�Z�[�W
								 , null
								 , null
								 , null);	
						_intErrorCount++;
						continue;
					}
					// �L������(������14��:������4��)�𒴉ߏꍇ
					if (!isNotInNumRange(csvStruct.getEXCH_RATE(), 14, 6)) {
						// �����ꍀ�ڎ擾�Z�b�g
	                    String ErrInfo = CoreTools.getRBString("Expj.EXCH_RATE", resource);
						csvExport(csvStruct                         // �Ώۃf�[�^���
								 , "1"								// �G���[�敪
								 , i + 1							// �G���[�s�ԍ�
								 , "Expj.EXCH_RATE"				    // �G���[���ږ�
								 , new ExpjMessage("AE05073",ErrInfo).getMessage(_locale)	// �G���[���b�Z�[�W
								 , null
								 , null
								 , null);
						_intErrorCount++;
						continue;
					}
		        }

//20150806 ADD START BY SYSCOM
				//�ȖڃR�[�h�̃`�F�b�N
				//[CSV���]�D�h�ȖڃR�[�h�h�����͂���Ă���ꍇ
				if (!isNull(csvStruct.getACCT_CD())){
					//���i�����t���O���u0:���i�ȊO�i�ʏ�d���i�j�v�̏ꍇ
					if ("0".equals(csvStruct.getNON_NO_ITEM_FLG())){
						String ErrInfo = CoreTools.getRBString("Expj.EXPENSE_CLASS_CD", resource);
						csvExport(csvStruct						// �Ώۃf�[�^���
							, "1"							// �G���[�敪
							, i + 1							// �G���[�����s
							, "Expj.EXPENSE_CLASS_CD"		// �G���[���ږ�
							, new ExpjMessage("AE25027",ErrInfo).getMessage(_locale)		// �G���[���b�Z�[�W
							, null
							, null
							, null); 
						_intErrorCount++;
						continue;
					}
					//����11���ȏ�̏ꍇ
					if (strLengthChk(csvStruct.getACCT_CD()) >= 11) {
						csvExport(csvStruct						    // �Ώۃf�[�^���
							, "1"							    	// �G���[�敪
							, i + 1									// �G���[�����s
							, "Expj.EXPENSE_CLASS_CD"				// �G���[���ږ�
							, new ExpjMessage("AA01501").getMessage(_locale)		// �G���[���b�Z�[�W
							, null
							, null
							, null); 
						_intErrorCount++;
						continue;
					}
					//�֑����������͂���Ă����ꍇ
					if (chkHankaku(csvStruct.getACCT_CD())) {
						csvExport(csvStruct						// �Ώۃf�[�^���
							, "1"								// �G���[�敪
							, i + 1								// �G���[�����s
							, "Expj.EXPENSE_CLASS_CD"			// �G���[���ږ�
							, new ExpjMessage("AA01524").getMessage(_locale)		// �G���[���b�Z�[�W
							, null
							, null
							, null); 
						_intErrorCount++;
						continue;
					}
				}

				//�ȉ����S����R�[�h�̃`�F�b�N
				//[CSV���]�D�h���S����R�[�h�h�����͂���Ă���ꍇ
				if (!isNull(csvStruct.getDEPT_CD())){
					//���i�����t���O���u0:���i�ȊO�i�ʏ�d���i�j�v�̏ꍇ
					if ("0".equals(csvStruct.getNON_NO_ITEM_FLG())){
						String ErrInfo = CoreTools.getRBString("Expj.DEPT_CD", resource);
						csvExport(csvStruct						// �Ώۃf�[�^���
							, "1"								// �G���[�敪
							, i + 1								// �G���[�����s
							, "Expj.DEPT_CD"					// �G���[���ږ�
							, new ExpjMessage("AE25027",ErrInfo).getMessage(_locale)		// �G���[���b�Z�[�W
							, null
							, null
							, null); 
						_intErrorCount++;
						continue;
					}
					//����26���ȏ�̏ꍇ
					if (strLengthChk(csvStruct.getDEPT_CD()) >= 26) {
						csvExport(csvStruct						    // �Ώۃf�[�^���
   							, "1"							    // �G���[�敪
							, i + 1							// �G���[�����s
							, "Expj.DEPT_CD"	// �G���[���ږ�
							, new ExpjMessage("AA01501").getMessage(_locale)		// �G���[���b�Z�[�W
							, null
							, null
							, null);
						_intErrorCount++;
						continue;
					}
					//�֑����������͂���Ă����ꍇ
					if (chkHankaku(csvStruct.getDEPT_CD())) {
						csvExport(csvStruct						// �Ώۃf�[�^���
							, "1"								// �G���[�敪
							, i + 1								// �G���[�����s
							, "Expj.DEPT_CD"					// �G���[���ږ�
							, new ExpjMessage("AA01524").getMessage(_locale)		// �G���[���b�Z�[�W
							, null
							, null
							, null); 
						_intErrorCount++;
						continue;
					}
				}
				
				//�ȉ��v���W�F�N�g�R�[�h�̃`�F�b�N
				//[CSV���]�D�h�v���W�F�N�g�R�[�h�h�����͂���Ă���ꍇ
				if (!isNull(csvStruct.getPJ_CD())){
					//���i�����t���O���u0:���i�ȊO�i�ʏ�d���i�j�v�̏ꍇ
					if ("0".equals(csvStruct.getNON_NO_ITEM_FLG())){
						String ErrInfo = CoreTools.getRBString("Expj.PJ_CD", resource);
						csvExport(csvStruct						// �Ώۃf�[�^���
							, "1"							// �G���[�敪
							, i + 1							// �G���[�����s
							, "Expj.PJ_CD"				// �G���[���ږ�
							, new ExpjMessage("AE25027",ErrInfo).getMessage(_locale)		// �G���[���b�Z�[�W
							, null
							, null
							, null);
						_intErrorCount++;
						continue;
					}
					//����16���ȏ�̏ꍇ
					if (strLengthChk(csvStruct.getPJ_CD()) >= 16) {
						csvExport(csvStruct						    // �Ώۃf�[�^���
   							, "1"							    // �G���[�敪
							, i + 1							// �G���[�����s
							, "Expj.PJ_CD"	// �G���[���ږ�
							, new ExpjMessage("AA01501").getMessage(_locale)		// �G���[���b�Z�[�W
							, null
							, null
							, null); 
						_intErrorCount++;
						continue;
					}
					//�֑����������͂���Ă����ꍇ
					if (chkHankaku(csvStruct.getPJ_CD())) {
						csvExport(csvStruct						// �Ώۃf�[�^���
							, "1"							// �G���[�敪
							, i + 1							// �G���[�����s
							, "Expj.PJ_CD"		// �G���[���ږ�
							, new ExpjMessage("AA01524").getMessage(_locale)		// �G���[���b�Z�[�W
							, null
							, null
							, null); 
						_intErrorCount++;
						continue;
					}
				}
				
				//�ȉ��Z�O�����g1�̃`�F�b�N
				//[CSV���]�D�h�Z�O�����g1�h�����͂���Ă���ꍇ
				if (!isNull(csvStruct.getSEG_CONTENTS1())){
					//���i�����t���O���u0:���i�ȊO�i�ʏ�d���i�j�v�̏ꍇ
					if ("0".equals(csvStruct.getNON_NO_ITEM_FLG())){
						String ErrInfo = CoreTools.getRBString("Expj.SEG_CONTENTS1", resource);
						csvExport(csvStruct						// �Ώۃf�[�^���
							, "1"							// �G���[�敪
							, i + 1							// �G���[�����s
							, "Expj.SEG_CONTENTS1"				// �G���[���ږ�
							, new ExpjMessage("AE25027",ErrInfo).getMessage(_locale)		// �G���[���b�Z�[�W
							, null
							, null
							, null);
						_intErrorCount++;
						continue;
					}
					//����51���ȏ�̏ꍇ
					if (strLengthChk(csvStruct.getSEG_CONTENTS1()) >= 51) {
						csvExport(csvStruct						    // �Ώۃf�[�^���
   							, "1"							    // �G���[�敪
							, i + 1							// �G���[�����s
							, "Expj.SEG_CONTENTS1"	// �G���[���ږ�
							, new ExpjMessage("AA01501").getMessage(_locale)		// �G���[���b�Z�[�W
							, null
							, null
							, null); 
						_intErrorCount++;
						continue;
					}
					//�֑����������͂���Ă����ꍇ
					if (chkHankaku(csvStruct.getSEG_CONTENTS1())) {
						csvExport(csvStruct						// �Ώۃf�[�^���
							, "1"							// �G���[�敪
							, i + 1							// �G���[�����s
							, "Expj.SEG_CONTENTS1"		// �G���[���ږ�
							, new ExpjMessage("AA01524").getMessage(_locale)		// �G���[���b�Z�[�W
							, null
							, null
							, null); 
						_intErrorCount++;
						continue;
					}
				}
				//�ȉ��Z�O�����g2�̃`�F�b�N
				//[CSV���]�D�h�Z�O�����g2�h�����͂���Ă���ꍇ
				if (!isNull(csvStruct.getSEG_CONTENTS2())){
					//���i�����t���O���u0:���i�ȊO�i�ʏ�d���i�j�v�̏ꍇ
					if ("0".equals(csvStruct.getNON_NO_ITEM_FLG())){
						String ErrInfo = CoreTools.getRBString("Expj.SEG_CONTENTS2", resource);
						csvExport(csvStruct						// �Ώۃf�[�^���
								, "1"							// �G���[�敪
								, i + 1							// �G���[�����s
								, "Expj.SEG_CONTENTS2"				// �G���[���ږ�
								, new ExpjMessage("AE25027",ErrInfo).getMessage(_locale)		// �G���[���b�Z�[�W
								, null
								, null
								, null);
						_intErrorCount++;
						continue;
					}
					//����51���ȏ�̏ꍇ
			        if (strLengthChk(csvStruct.getSEG_CONTENTS2()) >= 51) {
						csvExport(csvStruct						    // �Ώۃf�[�^���
	   							, "1"							    // �G���[�敪
								, i + 1							// �G���[�����s
								, "Expj.SEG_CONTENTS2"	// �G���[���ږ�
								, new ExpjMessage("AA01501").getMessage(_locale)		// �G���[���b�Z�[�W
								, null
								, null
								, null); 
						_intErrorCount++;
						continue;
					}
					//�֑����������͂���Ă����ꍇ
					if (chkHankaku(csvStruct.getSEG_CONTENTS2())) {
						csvExport(csvStruct						// �Ώۃf�[�^���
								, "1"							// �G���[�敪
								, i + 1							// �G���[�����s
								, "Expj.SEG_CONTENTS2"		// �G���[���ږ�
								, new ExpjMessage("AA01524").getMessage(_locale)		// �G���[���b�Z�[�W
								, null
								, null
								, null); 
						_intErrorCount++;
						continue;
					}
				}
				
				//�ȉ��Z�O�����g3�̃`�F�b�N
				//[CSV���]�D�h�Z�O�����g3�h�����͂���Ă���ꍇ
				if (!isNull(csvStruct.getSEG_CONTENTS3())){
					//���i�����t���O���u0:���i�ȊO�i�ʏ�d���i�j�v�̏ꍇ
					if ("0".equals(csvStruct.getNON_NO_ITEM_FLG())){
						String ErrInfo = CoreTools.getRBString("Expj.SEG_CONTENTS3", resource);
						csvExport(csvStruct						// �Ώۃf�[�^���
								, "1"							// �G���[�敪
								, i + 1							// �G���[�����s
								, "Expj.SEG_CONTENTS3"				// �G���[���ږ�
								, new ExpjMessage("AE25027",ErrInfo).getMessage(_locale)		// �G���[���b�Z�[�W
								, null
								, null
								, null);
						_intErrorCount++;
						continue;
					}
					//����51���ȏ�̏ꍇ
			        if (strLengthChk(csvStruct.getSEG_CONTENTS3()) >= 51) {
						csvExport(csvStruct						    // �Ώۃf�[�^���
	   							, "1"							    // �G���[�敪
								, i + 1							// �G���[�����s
								, "Expj.SEG_CONTENTS3"	// �G���[���ږ�
								, new ExpjMessage("AA01501").getMessage(_locale)		// �G���[���b�Z�[�W
								, null
								, null
								, null); 
						_intErrorCount++;
						continue;
					}
					//�֑����������͂���Ă����ꍇ
					if (chkHankaku(csvStruct.getSEG_CONTENTS3())) {
						csvExport(csvStruct						// �Ώۃf�[�^���
								, "1"							// �G���[�敪
								, i + 1							// �G���[�����s
								, "Expj.SEG_CONTENTS3"		// �G���[���ږ�
								, new ExpjMessage("AA01524").getMessage(_locale)		// �G���[���b�Z�[�W
								, null
								, null
								, null); 
						_intErrorCount++;
						continue;
					}
				}
				
				//�ȉ��Z�O�����g4�̃`�F�b�N
				//[CSV���]�D�h�Z�O�����g4�h�����͂���Ă���ꍇ
				if (!isNull(csvStruct.getSEG_CONTENTS4())){
					//���i�����t���O���u0:���i�ȊO�i�ʏ�d���i�j�v�̏ꍇ
					if ("0".equals(csvStruct.getNON_NO_ITEM_FLG())){
						String ErrInfo = CoreTools.getRBString("Expj.SEG_CONTENTS4", resource);
						csvExport(csvStruct						// �Ώۃf�[�^���
								, "1"							// �G���[�敪
								, i + 1							// �G���[�����s
								, "Expj.SEG_CONTENTS4"				// �G���[���ږ�
								, new ExpjMessage("AE25027",ErrInfo).getMessage(_locale)		// �G���[���b�Z�[�W
								, null
								, null
								, null);
						_intErrorCount++;
						continue;
					}
					//����51���ȏ�̏ꍇ
			        if (strLengthChk(csvStruct.getSEG_CONTENTS4()) >= 51) {
						csvExport(csvStruct						    // �Ώۃf�[�^���
	   							, "1"							    // �G���[�敪
								, i + 1							// �G���[�����s
								, "Expj.SEG_CONTENTS4"	// �G���[���ږ�
								, new ExpjMessage("AA01501").getMessage(_locale)		// �G���[���b�Z�[�W
								, null
								, null
								, null); 
						_intErrorCount++;
						 continue;
					}
					//�֑����������͂���Ă����ꍇ
					if (chkHankaku(csvStruct.getSEG_CONTENTS4())) {
						csvExport(csvStruct						// �Ώۃf�[�^���
								, "1"							// �G���[�敪
								, i + 1							// �G���[�����s
								, "Expj.SEG_CONTENTS4"		// �G���[���ږ�
								, new ExpjMessage("AA01524").getMessage(_locale)		// �G���[���b�Z�[�W
								, null
								, null
								, null); 
						_intErrorCount++;
						continue;
					}
				}
//20150806 ADD END BY SYSCOM

		        // �}�X�^�������`�F�b�N
		        // [CSV���]�D�h�i�ڔԍ��h��[�i��] ���������A���݂��Ȃ������ꍇ
		        if(!isNull(csvStruct.getITEM_CD())){
		        	List itemList = entity.mselectM_ITEM.read(conn, csvStruct);
			        if (itemList.isEmpty()) {
						csvExport(csvStruct                         // �Ώۃf�[�^���
								, "1"								// �G���[�敪
								, i + 1								// �G���[�s�ԍ�
								, "Expj.ITEM_CD"					// �G���[���ږ�
								, new ExpjMessage("AE50509").getMessage(_locale)        // �G���[���b�Z�[�W
								, null
								, null
								, null);		
						_intErrorCount++;
						continue;
					}else{
						_Itemflg = false;
						// [�i��]."�i�ڎ�z�敪"��8�̏ꍇ
						itemStruct = (AE0180010Struct) itemList.get(0);
						if (("8".equals(itemStruct.getMRP_ODR_TYP()))) {
							csvExport(csvStruct                         // �Ώۃf�[�^���
									, "1"								// �G���[�敪
									, i + 1								// �G���[�s�ԍ�
									, "Expj.ITEM_CD"					// �G���[���ږ�
									, new ExpjMessage("AE32601").getMessage(_locale)        // �G���[���b�Z�[�W
									, null
									, null
									, null);		
							_intErrorCount++;
							continue;
		    			}
					}
		        }

		        // [CSV���]�D�h�����[���h�ɋx�������͂��ꂽ�ꍇ
		        if (!isWorkDay(strDlvYmd)) {
		        	csvExport(csvStruct                         // �Ώۃf�[�^���
							, "1"								// �G���[�敪
							, i + 1								// �G���[�s�ԍ�
							, "Expj.PRD_DUE_DATE_1"				// �G���[���ږ�
							, new ExpjMessage("AE00028").getMessage(_locale)        // �G���[���b�Z�[�W
							, null
							, null
							, null);		
					_intErrorCount++;
					continue;
		        }
		        // [�Ɩ����t]���𕔕i���擾
				DateCtrlStruct dcs = DateCtrlControl.getData(conn, this.sysPLANT_CD);
				
				// ASPROVA�A�g�I�v�V�����������̏ꍇ(�����ς̏ꍇ�A�ߋ����t�̓o�^��)
                if(!"1".equals(_SysInstallOptions_ASP)){
                	// [CSV���]�D�h�����[���h<[���t����]."�Ɩ��^�p��"�̏ꍇ
    				if(DateTool.compareYMD(strDlvYmd, dcs.getBUSINESS_OPR_DATE())<0){
    					csvExport(csvStruct                         // �Ώۃf�[�^���
    							, "1"								// �G���[�敪
    							, i + 1								// �G���[�s�ԍ�
    							, "Expj.PRD_DUE_DATE_1"				// �G���[���ږ�
    							, new ExpjMessage("AE00030").getMessage(_locale)        // �G���[���b�Z�[�W
    							, null
    							, null
    							, null);		
    					_intErrorCount++;
    					continue;
    				}
                }
		        // [CSV���]�D�h�����\����h�ɋx�������͂��ꂽ�ꍇ
		        if ((!isNull(csvStruct.getPUCH_ODR_START_DATE()))) {
		        	if((!isWorkDay(strStartYmd))){
			        	csvExport(csvStruct                         // �Ώۃf�[�^���
								, "1"								// �G���[�敪
								, i + 1								// �G���[�s�ԍ�
								, "Expj.PUCH_ODR_DLV_DATE_1"		// �G���[���ږ�
								, new ExpjMessage("AE00029").getMessage(_locale)        // �G���[���b�Z�[�W
								, null
								, null
								, null);		
						_intErrorCount++;
						continue;
		        	}
		        	
		        	// ASPROVA�A�g�I�v�V�����������̏ꍇ(�����ς̏ꍇ�A�ߋ����t�̓o�^��)
	                if(!"1".equals(_SysInstallOptions_ASP)){
	                	 // [CSV���]�D�h�����\����h�� [���t����]."�Ɩ��^�p��"�̏ꍇ
						if(DateTool.compareYMD(strStartYmd, dcs.getBUSINESS_OPR_DATE())<0){
							csvExport(csvStruct                         // �Ώۃf�[�^���
									, "1"								// �G���[�敪
									, i + 1								// �G���[�s�ԍ�
									, "Expj.PUCH_ODR_DLV_DATE_1"				// �G���[���ږ�
									, new ExpjMessage("AE00031").getMessage(_locale)        // �G���[���b�Z�[�W
									, null
									, null
									, null);		
							_intErrorCount++;
							continue;
						}
	                }
		        }
		        
		        // [CSV���]�D�h�����\����h�@�� Null ���A[CSV���]�D�h�����[���h �� [CSV���]�D�h�����\����h�̏ꍇ
	        	if(!isNull(csvStruct.getPUCH_ODR_START_DATE()) && 
	        			(DateTool.compareYMD(strDlvYmd, strStartYmd)< 0)){
	        		csvExport(csvStruct                         // �Ώۃf�[�^���
							, "1"								// �G���[�敪
							, i + 1								// �G���[�s�ԍ�
							, "Expj.PUCH_ODR_DLV_DATE"			// �G���[���ږ�
							, new ExpjMessage("AE32608").getMessage(_locale)        // �G���[���b�Z�[�W
							, "Expj.PUCH_ODR_DLV_DATE_1"
							, null
							, null);		
					_intErrorCount++;
					continue;
	        	}
		        // ���[�g������̐ݒ�
		        csvStruct.setRATE_JUDGE_DATE(strDlvYmd);
		        // �����\����̐ݒ�
				String PUCH_ODR_DLV_TIME = null;
				// ���͎����̃`�F�b�N(�����Ǘ�����ꍇ�̂�)
				if (csvStruct.getPUCH_ODR_DLV_DATE().length()>10) {
					String strOdrDlvDate = csvStruct.getPUCH_ODR_DLV_DATE();
					int dlvIdx = strOdrDlvDate.indexOf(_space);
					PUCH_ODR_DLV_TIME = strOdrDlvDate.substring(dlvIdx+1);
				} else {
					if ("true".equals(struct.getTIME_CTRL())) {
						PUCH_ODR_DLV_TIME = "2359";
					} else {
						// �����Ǘ����Ȃ��ꍇ��0000�ɐݒ�
						PUCH_ODR_DLV_TIME = "0000";
					}
				}
				
				// [CSV���]�D�h�����\����h��null�̏ꍇ
				if(isNull(csvStruct.getPUCH_ODR_START_DATE())){
                    //���i�����łȂ��ꍇ
		        	if ("0".equals(csvStruct.getNON_NO_ITEM_FLG())){
		        		// [CSV���]�D�h�����[���h�����ɔ����\������Z�o�����̌��ʂ𔭒��\����Ƃ���B
		        		String resultDate = null;
		        		// ASPROVA�A�g�I�v�V�����������̏ꍇ�F���P�ʂ̃��[�h�^�C���v�Z���s���B
						if (!"1".equals(_SysInstallOptions_ASP)) {
							String fixedLt = itemStruct.getFIXED_LT();
							String propLt = itemStruct.getPROP_LT();
							String safetyLt = itemStruct.getSAFETY_LT();
							String propLotSize = itemStruct.getPROP_LOT_SIZE();

							String itemLt = Calculate.divide(csvStruct.getPUCH_ODR_QTY(), propLotSize, 0, Calculate._CEIL);
							itemLt = Calculate.multiply(itemLt, propLt);
							itemLt = Calculate.add(itemLt, fixedLt);
							itemLt = Calculate.add(itemLt, safetyLt);
							itemLt = Calculate.multiply(itemLt, "-1");

							resultDate = calcWorkDay(strDlvYmd,PUCH_ODR_DLV_TIME, itemLt, true);
							if ("".equals(resultDate)) {
								csvExport(csvStruct                         // �Ώۃf�[�^���
										, "1"								// �G���[�敪
										, i + 1								// �G���[�s�ԍ�
										, "Expj.PUCH_ODR_DLV_DATE_1"		// �G���[���ږ�
										, new ExpjMessage("AE00198").getMessage(_locale)        // �G���[���b�Z�[�W
										, null
										, null
										, null);		
								_intErrorCount++;
								continue;
							}
							// �Z�o���������\��� <[���t����]."�Ɩ��^�p��"�̏ꍇ��[���t����]."�Ɩ��^�p��"�𢔭���\�����Ƃ���B
							if (DateTool.compareYMD(resultDate.substring(0, 10), dcs.getBUSINESS_OPR_DATE()) < 0) {
								csvStruct.setPUCH_ODR_START_DATE(dcs.getBUSINESS_OPR_DATE());
							} else {
								// �����v�Z�������ʂ𔭒��\����Ƃ���
								csvStruct.setPUCH_ODR_START_DATE(resultDate.substring(0, 10));
							}
							// ASPROVA�A�g�I�v�V���������ς̏ꍇ�F���ԒP�ʂ̃��[�h�^�C���v�Z���s���B
		        	    }else{
		        	    	String propLotSize = itemStruct.getPROP_LOT_SIZE();
		        	    	String sWkDate, sShiftMin, sWkTime;
		        	    	ATAspBom ab = new ATAspBom(conn, this.sysPLANT_CD,this.sysUSER_CD, this.getProgramId());
		        	    	ATWorkCalendar atWC = new ATWorkCalendar(conn, this.sysUSER_CD, "AE0180010",
									this.sysPLANT_CD);
		        	    	Date puchOdrStartDate = null; // �����\���
							Date puchOdrDlvDate = null; // �����[��
							
							// �����[��������̏��
							puchOdrDlvDate = StrngToDt(strDlvYmd
									+ " " + (PUCH_ODR_DLV_TIME).substring(0, 2)
									+ ":" + (PUCH_ODR_DLV_TIME).substring(2, 4));
							// �����\���LT�V�t�g(�|)
							sShiftMin = ab.getProdLtMin(csvStruct.getITEM_CD(), csvStruct.getPUCH_ODR_QTY(), propLotSize, "U");
							sShiftMin = Calculate.multiply(sShiftMin, "-1"); // �ߋ���
							puchOdrStartDate = atWC.calcShiftMinute(puchOdrDlvDate, sShiftMin, ATWorkCalendar.SHIFT_START); // Conv
							sWkDate = DtGetDate(puchOdrStartDate);
							csvStruct.setPUCH_ODR_START_DATE(sWkDate);
		        	    }
					// ���i�w���̏ꍇ
		        	}else{
		        		// [�Ɩ����t]."�Ɩ��^�p��"�𔭒��\����Ƃ���B
		        		csvStruct.setPUCH_ODR_START_DATE(dcs.getBUSINESS_OPR_DATE());
						if(!isWorkDay(csvStruct.getPUCH_ODR_START_DATE())){
							csvExport(csvStruct                         // �Ώۃf�[�^���
									, "1"								// �G���[�敪
									, i + 1								// �G���[�s�ԍ�
									, "Expj.PUCH_ODR_DLV_DATE_1"		// �G���[���ږ�
									, new ExpjMessage("AE00198").getMessage(_locale)        // �G���[���b�Z�[�W
									, null
									, null
									, null);		
							_intErrorCount++;
							continue;
						}
		        	}
		        	strStartYmd = csvStruct.getPUCH_ODR_START_DATE();
		        	if (strStartYmd.length()<=10) {
		        		csvStruct.setPUCH_ODR_START_DATE(strStartYmd+_space+PUCH_ODR_DLV_TIME);
		        	}
				}
	        	
	        	// [CSV���]�D�h�������h��0�ȉ��̏ꍇ
	        	if(Calculate.compare(csvStruct.getPUCH_ODR_QTY(),"0") == 0){
	        		csvExport(csvStruct                         // �Ώۃf�[�^���
							, "1"								// �G���[�敪
							, i + 1								// �G���[�s�ԍ�
							, "Expj.PUCH_ODR_QTY"				// �G���[���ږ�
							, new ExpjMessage("AE00038").getMessage(_locale)        // �G���[���b�Z�[�W
							, null
							, null
							, null);		
					_intErrorCount++;
					continue;
	        	}
	        	// ������R�[�h����A[�����]�ɑ��݂��Ȃ��ꍇ
                List vendCtrlList = entity.mselectM_VEND_CTRL.read(conn, csvStruct);
                AE0180010Struct vendCtrlStruct = null;
                if (vendCtrlList.isEmpty()) {
                 csvExport(csvStruct                         // �Ώۃf�[�^���
							, "1"							 // �G���[�敪
							, i + 1							 // �G���[�s�ԍ�
							, "Expj.VEND_CD"				 // �G���[���ږ�
							, new ExpjMessage("AE20030").getMessage(_locale)        // �G���[���b�Z�[�W
							, null
							, null
							, null);		
					_intErrorCount++;
					continue;
                }else {
                    // ������."�����ԃt���O" = 1:�����~�̏ꍇ
                    vendCtrlStruct = (AE0180010Struct) vendCtrlList.get(0);
                    if ("1".equals(vendCtrlStruct.getDEAL_STS_FLG())) {
                    	csvExport(csvStruct                         // �Ώۃf�[�^���
    							, "1"								// �G���[�敪
    							, i + 1								// �G���[�s�ԍ�
    							, "Expj.VEND_CD"					// �G���[���ږ�
    							, new ExpjMessage("AE00002").getMessage(_locale)        // �G���[���b�Z�[�W
    							, null
    							, null
    							, null);		
    					_intErrorCount++;
    					continue;
                    }
                }
                // [CSV���]�D�h�i�ڔԍ��h��[�i��] ���������A[�i��].�g�i�ڎ�z�敪�h ��1�F���� �܂�2�F�݌Ɉ����^����
                if (("1".equals(itemStruct.getMRP_ODR_TYP())) || ("2".equals(itemStruct.getMRP_ODR_TYP()))){
                	// ���Ԃ�NULL�̏ꍇ
                	if(isNull(csvStruct.getJOB_ODR_CD())){
                		csvExport(csvStruct                         // �Ώۃf�[�^���
    							, "1"								// �G���[�敪
    							, i + 1								// �G���[�s�ԍ�
    							, "Expj.JOB_ODR_CD"					// �G���[���ږ�
    							, new ExpjMessage("AB00017").getMessage(_locale)        // �G���[���b�Z�[�W
    							, null
    							, null
    							, null);		
    					_intErrorCount++;
    					continue;
                	}
                	// ���O�C�����[�U�̏����̍H��R�[�h
                    csvStruct.setPLANT_CD(sysPLANT_CD);
                	// ���ԕi�̏ꍇ�A���O�C�����[�U�̏����̍H��R�[�h�A [CSV���]�D�h���ԁh �A�u���Ԏ}�ԁv�Ɓu���Ԏ�������ԍ��v �� [���Ԍv��] �ɑ��݂��Ȃ��ꍇ
                    // �i�u���Ԏ}�ԁv�@�� 0�A�u���Ԏ�������ԍ��v�@�� 0�j
                    List jobordcdList = entity.mselectT_JOB_ODR.read(conn, csvStruct);
                    if (jobordcdList.isEmpty()) {
    					csvExport(csvStruct                         // �Ώۃf�[�^���
    							, "1"								// �G���[�敪
    							, i + 1								// �G���[�s�ԍ�
    							, "Expj.JOB_ODR_CD"					// �G���[���ږ�
    							, new ExpjMessage("AB00043").getMessage(_locale)        // �G���[���b�Z�[�W
    							, null
    							, null
    							, null);		
    					_intErrorCount++;
    					continue;
                    }
                    // [���Ԍv��]. �g���ԏ�ԋ敪�h�� 1�F���v�ʌv�Z���Ώ� or 2�F���v�ʌv�Z�Ώ� or 9�F���� �̏ꍇ
                    AE0180010Struct jobordcdStruct = new AE0180010Struct();
                    jobordcdStruct = (AE0180010Struct)jobordcdList.get(0);
                    if(("1".equals(jobordcdStruct.getJOB_ODR_STS_TYP())) 
                    		|| ("2".equals(jobordcdStruct.getJOB_ODR_STS_TYP())) 
                    		|| ("9".equals(jobordcdStruct.getJOB_ODR_STS_TYP()))){
                    	csvExport(csvStruct                         // �Ώۃf�[�^���
    							, "1"								// �G���[�敪
    							, i + 1								// �G���[�s�ԍ�
    							, "Expj.JOB_ODR_CD"					// �G���[���ږ�
    							, new ExpjMessage("AE01001").getMessage(_locale)        // �G���[���b�Z�[�W
    							, null
    							, null
    							, null);		
    					_intErrorCount++;
    					continue;
                    }
                    // [���v��]��񂪑��݂��Ă��Ȃ��ꍇ
                    List jobOdrList = entity.mselectT_OD_JOB_ODR.read(conn, csvStruct);
                    if(jobOdrList.isEmpty()){
                    	csvExport(csvStruct                         // �Ώۃf�[�^���
    							, "1"								// �G���[�敪
    							, i + 1								// �G���[�s�ԍ�
    							, "Expj.JOB_ODR_CD"					// �G���[���ږ�
    							, new ExpjMessage("AH00039").getMessage(_locale)        // �G���[���b�Z�[�W
    							, "Expj.ITEM_CD"
    							, null
    							, null);		
    					_intErrorCount++;
    					continue;
                    }
                    // [���v��].�g���ԁh�� [���Ԍv��] ���������A[���Ԍv��].�g�[���h �� [CSV���]�D�h�����[���h����[���Ԍv��].�g�[���h���Ɩ��^�p���ȍ~�̏ꍇ
    				jobOdrStruct = (AE0180010Struct) jobOdrList.get(0);
    				// �I�[�_�f�}���h�ԍ�
    				csvStruct.setOD_NO(jobOdrStruct.getOD_NO());
    				if(DateTool.compareYMD(csvStruct.getPUCH_ODR_DLV_DATE(),jobOdrStruct.getJOB_ODR_DLV_DATE())> 0){
    					if(DateTool.compareYMD(jobOdrStruct.getJOB_ODR_DLV_DATE(),dcs.getBUSINESS_OPR_DATE()) >= 0){
    						csvExport(csvStruct                         // �Ώۃf�[�^���
        							, "1"								// �G���[�敪
        							, i + 1								// �G���[�s�ԍ�
        							, "Expj.JOB_ODR_CD"					// �G���[���ږ�
        							, new ExpjMessage("AE32604").getMessage(_locale)        // �G���[���b�Z�[�W
        							, null
        							, null
        							, null);		
        					_intErrorCount++;
        					continue;
    					}
    				}
                } else {
                	csvStruct.setJOB_ODR_CD("");
                }
                // [CSV���]�D�h����ꏊ�h�Łm�ۊǋ�n���������A���݂��Ȃ������ꍇ
                List wh_cdList = entity.mselectM_WH.read(conn, csvStruct);
                if(wh_cdList.isEmpty()){
            		csvExport(csvStruct                         // �Ώۃf�[�^���
							, "1"								// �G���[�敪
							, i + 1								// �G���[�s�ԍ�
							, "Expj.WH_CD_2"					// �G���[���ږ�
							, new ExpjMessage("AE00018").getMessage(_locale)        // �G���[���b�Z�[�W
							, null
							, null
							, null);		
					_intErrorCount++;
					continue;
            	}else{
            		AE0180010Struct wh_cdStruct = (AE0180010Struct) wh_cdList.get(0);
            		// ���O�C�����[�U�̏����̍H��R�[�h �� [�ۊǋ�].�g�H��R�[�h�h �̏ꍇ
            		if (!this.sysPLANT_CD.equals(wh_cdStruct.getPLANT_CD())) {
                        csvExport(csvStruct                         // �Ώۃf�[�^���
    							, "1"								// �G���[�敪
    							, i + 1								// �G���[�s�ԍ�
    							, "Expj.WH_CD_2"					// �G���[���ږ�
    							, new ExpjMessage("AE00032").getMessage(_locale)        // �G���[���b�Z�[�W
    							, null
    							, null
    							, null);		
    					_intErrorCount++;
    					continue;
            		}    
            	}
                
                // ���i�����ł��A��i�ڔԍ����Null�̏ꍇ�͈ȉ��̏������s��Ȃ�
                if(!(("1".equals(csvStruct.getNON_NO_ITEM_FLG())) && (struct.getITEM_CD() == null || struct.getITEM_CD().length() <= 0))){
               	 // [�i��] . �g�݌ɐ��P�ʋ敪�h �� 1�F�����Ǘ� ���A[CSV���]�D�h�������h�ɏ������܂ޏꍇ
               	 if (("1".equals(itemStruct.getUNIT_QTY_TYP()))) {
                   	 String ceilPuchOdrQty = Calculate.ceil(csvStruct.getPUCH_ODR_QTY(), 0);
                   	 if (Calculate.compare(ceilPuchOdrQty, csvStruct.getPUCH_ODR_QTY()) != 0) {
                   		 csvStruct.setPUCH_ODR_QTY(ceilPuchOdrQty);
                   		itemCheckFlg = true;
                   	 }
                    }
                }
                
                TaxStruct ts = new TaxStruct();
                CurStruct cs = new CurStruct();
                try {
                	// ����ŃR�[�h���擾
                	ts =
                    TaxControl.getData(
                    conn,
                    _company_cd,
                    csvStruct.getVEND_CD(),
                    csvStruct.getITEM_CD(),
                    strDlvYmd);
                 } catch (DataNotFoundException e) {
                	 csvExport(csvStruct                         // �Ώۃf�[�^���
 							, "1"								 // �G���[�敪
 							, i + 1							     // �G���[�s�ԍ�
 							, null								 // �G���[���ږ�
 							, new ExpjMessage("AE00017").getMessage(_locale)        // �G���[���b�Z�[�W
 							, null
 							, null
							, null);		
 					_intErrorCount++;
 					continue;       	 
                }
                 csvStruct.setTAX_CD(ts.getTAX_CD());
                 csvStruct.setTAX_RATE_1(ts.getTAX_RATE_1());
                 csvStruct.setTAX_RATE_2(ts.getTAX_RATE_2());
                 csvStruct.setTAX_RATE_3(ts.getTAX_RATE_3());
                 csvStruct.setTAX_ROUND_TYP(ts.getTAX_ROUND_TYP());            
                // [�ʉ�]�����擾
                try {
                 cs =
                  CurControl.getData(conn, _company_cd, csvStruct.getVEND_CD());
                } catch (DataNotFoundException e) {
                	csvExport(csvStruct                         // �Ώۃf�[�^���
 							, "1"								// �G���[�敪
 							, i + 1								// �G���[�s�ԍ�
 							, null								// �G���[���ږ�
 							, new ExpjMessage("AE05075").getMessage(_locale)        // �G���[���b�Z�[�W
 							, null
 							, null
							, null);		
 					_intErrorCount++;
 					continue;  
                }
                csvStruct.setVEND_DECIMAL_FIG(cs.getDECIMAL_FIG());
                
                PuchUnitCostStruct pucs = new PuchUnitCostStruct();
                
                //  [CSV���]�D�h�P���h��NULL�ꍇ
                if(isNull(csvStruct.getUNIT_COST())){
                	// [�w���P��]�����擾
                	pucs =
                    PuchUnitCostControl.getData(
                    conn,
                    _company_cd,
                    csvStruct.getVEND_CD(),
                    this.sysPLANT_CD,
                    csvStruct.getITEM_CD(),
                    strStartYmd,
                    strDlvYmd,
                    csvStruct.getPUCH_ODR_QTY());
                	// [�w���P��].�h �w���P���敪�h�Ƃ���B
                	csvStruct.setUNIT_COST_TYP(pucs.getUNIT_COST_TYP());
                	// [�w���P��].�h �w���P���h�Ƃ���B
                	csvStruct.setUNIT_COST(pucs.getUNIT_COST());
                	// [�w���P��].�h �w�����H��h�Ƃ���B
                	csvStruct.setPROCESSING_COST(pucs.getPROCESSING_COST());
                	// [�w���P��].�h �w���ޗ���h�Ƃ���B
                	csvStruct.setMATERIAL_COST(pucs.getMATERIAL_COST());
                	// [�w���P��].�h �w�����̑��o��h�Ƃ���B
                	csvStruct.setOTHER_OVERHEADS(pucs.getOTHER_OVERHEADS());
                }
                //�������z���܂�ߏ���
				String tempOdrAmount =
				AmountCalculator.calcPuchOdrAmount(
					csvStruct.getPUCH_ODR_QTY(),
					csvStruct.getUNIT_COST(),
					cs.getROUND_TYP(),
					cs.getDECIMAL_FIG());
                 if(!isNotInNumRange(tempOdrAmount, 14, 4)){
                	// �����ꍀ�ڎ擾�Z�b�g
	                String ErrInfo = CoreTools.getRBString("Expj.PUCH_ODR_AMOUNT_2", resource);
                	csvExport(csvStruct                         // �Ώۃf�[�^���
 							, "1"								// �G���[�敪
 							, i + 1								// �G���[�s�ԍ�
 							, null								// �G���[���ږ�
 							, new ExpjMessage("AA00215",ErrInfo).getMessage(_locale)// �G���[���b�Z�[�W
 							, null
 							, null
							, null);		
 					_intErrorCount++;
 					continue;
                 }
                 // �������z
                 csvStruct.setPUCH_ODR_AMOUNT(tempOdrAmount);
                 // �{�̋��z
                 if(isNull(csvStruct.getNET_AMOUNT()) || "0".equals(csvStruct.getNET_AMOUNT())){
                	 csvStruct.setNET_AMOUNT(tempOdrAmount);
                 }
                 // [CSV���]�D�h�בփ��[�g�h��NULL�ȊO�̏ꍇ
                 if(!isNull(csvStruct.getEXCH_RATE())){
                	 // �בփ��[�g��0�ȉ��̏ꍇ
                     if(Calculate.compare(csvStruct.getEXCH_RATE(),"0") == 0){
                    	 csvExport(csvStruct                         // �Ώۃf�[�^���
       							, "1"								 // �G���[�敪
       							, i + 1								 // �G���[�s�ԍ�
       							, "Expj.EXCH_RATE"					 // �G���[���ږ�
       							, new ExpjMessage("AE00059").getMessage(_locale)        // �G���[���b�Z�[�W
       							, null
       							, null
    							, null);		
       					_intErrorCount++;
       					continue;
                     }
                 }
                 // [CSV���]�D�h�בփ��[�g�h��NULL�̏ꍇ
                 if(isNull(csvStruct.getEXCH_RATE())){
                	 // �בփ��[�g���擾
                	 try {
                		 ExchRateStruct ers =
                                 ExchRateControl.getData(
                                 conn,
                                 _company_cd,
                                 cs.getCUR_CD(),
                                 cs.getEXCH_TYP(),
                                 null,
                                 strDlvYmd);
                                 // ��בփ��[�g���ݒ�
                         csvStruct.setEXCH_RATE(ers.getEXCH_RATE());
                     }catch (DataNotFoundException e) {
                    	 csvExport(csvStruct                         // �Ώۃf�[�^���
      							, "1"								 // �G���[�敪
      							, i + 1								 // �G���[�s�ԍ�
      							, null					 // �G���[���ږ�
      							, new ExpjMessage("AE05076").getMessage(_locale)        // �G���[���b�Z�[�W
      							, null
      							, null
    							, null);		
      					_intErrorCount++;
      					continue;
                     }
                     // �בփ��[�g��0�ȉ��̏ꍇ
                     if(Calculate.compare(csvStruct.getEXCH_RATE(),"0") == 0){
                    	 csvExport(csvStruct                         // �Ώۃf�[�^���
       							, "1"								 // �G���[�敪
       							, i + 1								 // �G���[�s�ԍ�
       							, null					 // �G���[���ږ�
       							, new ExpjMessage("AE00059").getMessage(_locale)        // �G���[���b�Z�[�W
       							, null
       							, null
    							, null);		
       					_intErrorCount++;
       					continue;
                     }
                 }
                 
                 //���ł̏ꍇ�ɐŊz���v�Z����
                 String lowerTaxCd =
                		 ts.getTAX_CD().substring(ts.getTAX_CD().length() - 1);                
              	 if (!lowerTaxCd.equals("1")) {
              		//�o�b�`�p�����[�^�ďo
          			List batList = entity.mselectSYS_BAT_PARM.read(conn, csvStruct);
          			if(!batList.isEmpty()){
          				//�Ōv�Z���i���R�[��
          				AE0180010Struct batStruct = (AE0180010Struct)batList.get(0);
          				csvStruct.setPVC2LOGMODE(batStruct.getPVC2LOGMODE());
          				csvStruct.setPVC2OUTPUTMODE(batStruct.getPVC2OUTPUTMODE());
          				csvStruct.setPVC2OUTPUTPATH(batStruct.getPVC2OUTPUTPATH());
          				csvStruct.setPVC2OUTPUTNAME(batStruct.getPVC2OUTPUTNAME());
          				csvStruct.setPVC2USERID(this.sysUSER_CD);
          				csvStruct.setPVC2BUSINESSNAME(batStruct.getPVC2BUSINESSNAME());
          				csvStruct.setPVC2PLANTCD(this.sysPLANT_CD);
          				csvStruct.setPVC2TAXID("5");
          				batList = entity.mcallSQLCALCTAXCALCAMT.call(conn, csvStruct);
          				batStruct = (AE0180010Struct)batList.get(0);
          				if(!"1".equals(batStruct.getPNUMSTATUS())){
          					csvExport(csvStruct                         // �Ώۃf�[�^���
            							, "1"							// �G���[�敪
            							, i + 1							// �G���[�s�ԍ�
            							, null							// �G���[���ږ�
            							, new ExpjMessage(batStruct.getPVC2ERRCD()).getMessage(_locale)// �G���[���b�Z�[�W
            							, null
            							, null
            							, null);		
            					_intErrorCount++;
            					continue;
          				}
          				csvStruct.setTAX_AMOUNT_1(batStruct.getTAX_AMOUNT_1());
          				csvStruct.setTAX_AMOUNT_2(batStruct.getTAX_AMOUNT_2());
          				csvStruct.setTAX_AMOUNT_3(batStruct.getTAX_AMOUNT_3());
          				csvStruct.setAMOUNT_INCLUDE_TAX(batStruct.getAMOUNT_INCLUDE_TAX());  				
             		}else{
             			csvExport(csvStruct                         // �Ώۃf�[�^���
       							, "1"								// �G���[�敪
       							, i + 1								// �G���[�s�ԍ�
       							, null								// �G���[���ږ�
       							, new ExpjMessage("ZZ09007").getMessage(_locale)// �G���[���b�Z�[�W
       							, null
       							, null
    							, null);		
       					_intErrorCount++;
       					continue;
         			}	
                 }else{
                	// ��Ŋz1��̌v�Z
  	                String taxAmount1 =
  	                 AmountCalculator.calcTaxAmount(
  	                  csvStruct.getNET_AMOUNT(),
  	                  ts.getTAX_RATE_1(),
  	                  ts.getTAX_ROUND_TYP(),
  	                  cs.getDECIMAL_FIG());
  	                 csvStruct.setTAX_AMOUNT_1(taxAmount1);
  	                 // ��Ŋz2��̌v�Z
  	                 String taxAmount2 =
  	                  AmountCalculator.calcTaxAmount(
  	                   csvStruct.getNET_AMOUNT(),
  	                   ts.getTAX_RATE_2(),
  	                   ts.getTAX_ROUND_TYP(),
  	                   cs.getDECIMAL_FIG());
  	                 csvStruct.setTAX_AMOUNT_2(taxAmount2);
  	                 // ��Ŋz3��̌v�Z
  	                 String taxAmount3 =
  	                  AmountCalculator.calcTaxAmount(
  	                   csvStruct.getNET_AMOUNT(),
  	                   ts.getTAX_RATE_3(),
  	                   ts.getTAX_ROUND_TYP(),
  	                   cs.getDECIMAL_FIG());
  	                 csvStruct.setTAX_AMOUNT_3(taxAmount3);
  	                 // ��ō����z��̌v�Z
  	                 String amountIncludeTax =
  	                  AmountCalculator.calcAmountIncludeTax(
  	                   csvStruct.getNET_AMOUNT(),
  	                   csvStruct.getTAX_AMOUNT_1(),
  	                   csvStruct.getTAX_AMOUNT_2(),
  	                   csvStruct.getTAX_AMOUNT_3());
  	                 csvStruct.setAMOUNT_INCLUDE_TAX(amountIncludeTax);
  	                 if(!isNotInNumRange(amountIncludeTax, 14, 4)){
  	                    // �����ꍀ�ڎ擾�Z�b�g
  		                String ErrInfo = CoreTools.getRBString("Expj.AMOUNT_INCLUDE_TAX", resource);
  	                	csvExport(csvStruct                         // �Ώۃf�[�^���
        							, "1"							// �G���[�敪
        							, i + 1							// �G���[�s�ԍ�
        							, null							// �G���[���ږ�
        							, new ExpjMessage("AA00215",ErrInfo).getMessage(_locale)// �G���[���b�Z�[�W
        							, null
        							, null
        							, null);		
        					_intErrorCount++;
        					continue;
  	                 }
                 }
                 // ��M�݋��z��̌v�Z
                 String homeCurAmount =
                  AmountCalculator.calcHomeCurAmount(
                   csvStruct.getAMOUNT_INCLUDE_TAX(),
                   csvStruct.getEXCH_RATE(),
                   cs.getROUND_TYP(),
                   _homeCurStruct.getDECIMAL_FIG());
                 csvStruct.setHOME_CUR_AMOUNT(homeCurAmount);
                 if(!isNotInNumRange(homeCurAmount, 14, 4)){
                	// �����ꍀ�ڎ擾�Z�b�g
		            String ErrInfo = CoreTools.getRBString("Expj.HOME_CUR_AMOUNT", resource);
                 	csvExport(csvStruct                         // �Ώۃf�[�^���
    							, "1"							// �G���[�敪
    							, i + 1							// �G���[�s�ԍ�
    							, null							// �G���[���ږ�
    							, new ExpjMessage("AA00215",ErrInfo).getMessage(_locale)// �G���[���b�Z�[�W
    							, null
    							, null
    							, null);		
    					_intErrorCount++;
    					continue;
                 }
                 // ���i�����ł��A��i�ڔԍ����Null�̏ꍇ�͈ȉ��̏������s��Ȃ�
                 if(itemCheckFlg){
                    csvExport(csvStruct                         // �Ώۃf�[�^���
     								, "2"								 // �G���[�敪
     								, i + 1								 // �G���[�s�ԍ�
     								, "Expj.PUCH_ODR_QTY"				 // �G���[���ږ�
     								, new ExpjMessage("AE00034").getMessage(_locale)// �G���[���b�Z�[�W
     								, null
     								, null
     								, null);		
                    if(!warningFlg){
     					_intWarningCount++;
     					warningFlg = true;
                    }
                 }
                 // [CSV���]�D�h�i�ڔԍ��h��[�i��] ���������A[�i��].�g�i�ڎ�z�敪�h ��1�F���� �܂�2�F�݌Ɉ����^����
                 if (("1".equals(itemStruct.getMRP_ODR_TYP())) || ("2".equals(itemStruct.getMRP_ODR_TYP()))){
                	 // [���Ԍv��].�g�[���h �� [CSV���]�D�h�����[���h����[���Ԍv��].�g�[���h���Ɩ��^�p�����ߋ��̏ꍇ
                	 if(DateTool.compareYMD(csvStruct.getPUCH_ODR_DLV_DATE(),jobOdrStruct.getJOB_ODR_DLV_DATE())> 0){
                		 if(DateTool.compareYMD(jobOdrStruct.getJOB_ODR_DLV_DATE(),dcs.getBUSINESS_OPR_DATE()) < 0){
                			 csvExport(csvStruct                         // �Ώۃf�[�^���
            							, "2"							 // �G���[�敪
            							, i + 1							 // �G���[�s�ԍ�
            							, "Expj.JOB_ODR_CD"				 // �G���[���ږ�
            							, new ExpjMessage("AE32605").getMessage(_locale)// �G���[���b�Z�[�W
            							, null
            							, null
            							, null);		
        					 if(!warningFlg){
        						 _intWarningCount++;
        						 warningFlg = true;
        				     }	
       					 }
      				 }
                 }
                 if(isNull(csvStruct.getUNIT_COST())){
                	 csvStruct.setUNIT_COST("0");
                 }
                 if(isNull(csvStruct.getPROCESSING_COST())){
                	 csvStruct.setPROCESSING_COST("0");
                 }
                 if(isNull(csvStruct.getMATERIAL_COST())){
                	 csvStruct.setMATERIAL_COST("0");
                 }
                 if(isNull(csvStruct.getOTHER_OVERHEADS())){
                	 csvStruct.setOTHER_OVERHEADS("0");
                 }
                 // �u�P���v �� �i�u���H��v �{ �u�ޗ���v �{ �u���̑��o��v�j�̏ꍇ
                 if(Calculate.compare(csvStruct.getUNIT_COST(),
                		 Calculate.add(csvStruct.getPROCESSING_COST(), 
                				 Calculate.add(csvStruct.getMATERIAL_COST(),csvStruct.getOTHER_OVERHEADS()))) == -1){
                	 csvExport(csvStruct                         // �Ώۃf�[�^���
 							, "2"								 // �G���[�敪
 							, i + 1								 // �G���[�s�ԍ�
 							, "Expj.ACTUAL_UNIT_PRICE"			 // �G���[���ږ�
 							, new ExpjMessage("AE05074").getMessage(_locale)// �G���[���b�Z�[�W
 							, "Expj.PROCESSING_COST"
 							, "Expj.MATERIAL_COST"
							, "Expj.OTHER_OVERHEADS");		
					 if(!warningFlg){
						 _intWarningCount++;
						 warningFlg = true;
				     }	
                 }
                 
                 // [CSV���]�D�h�����\����h��null�̏ꍇ
 				if(isNull(csvStruct.getL_PUCH_ODR_START_DATE())){
 					csvExport(csvStruct                         // �Ώۃf�[�^���
 							, "2"								 // �G���[�敪
 							, i + 1								 // �G���[�s�ԍ�
 							, "Expj.PUCH_ODR_DLV_DATE_1"		 // �G���[���ږ�
 							, new ExpjMessage("AD34041").getMessage(_locale)// �G���[���b�Z�[�W
 							, null
 							, null
							, null);
					 if(!warningFlg){
						 _intWarningCount++;
						 warningFlg = true;
				     }	
 				}
//20150806 ADD START BY SYSCOM
				//�ȖڃR�[�h�����͂���Ă���ꍇ
				//[CSV���]�D�h���i�����t���O�h��1:���i�����̏ꍇ���A[CSV���]�D�h�ȖڃR�[�h�h�����͂���Ă���ꍇ
				if("1".equals(csvStruct.getNON_NO_ITEM_FLG()) && !isNull(csvStruct.getACCT_CD())){
					//�ȖڃR�[�h������
					List acct_cdList = entity.mselectV_ACCT_CD.read(conn, csvStruct);
					// ���݂��Ȃ��ꍇ
         			if (acct_cdList.isEmpty()) {
                       	 csvExport(csvStruct                         // �Ώۃf�[�^���
        						, "1"								 // �G���[�敪
        						, i + 1								 // �G���[�s�ԍ�
        						, "Expj.EXPENSE_CLASS_CD"					 // �G���[���ږ�
        						, new ExpjMessage("AE25026").getMessage(_locale)        // �G���[���b�Z�[�W
        						, null
        						, null
     							, null);		
        					_intErrorCount++;
        					continue;
         			}
				}
				//���S����R�[�h������Ă���ꍇ
				//[CSV���]�D�h���i�����t���O�h��1:���i�����̏ꍇ���A[CSV���]�D�h���S����R�[�h�h�����͂���Ă���ꍇ�A
				if("1".equals(csvStruct.getNON_NO_ITEM_FLG()) && !isNull(csvStruct.getDEPT_CD())){
					//���S����R�[�h������
         			List dept_cdList = entity.mselectV_DEPT_CD.read(conn, csvStruct);
					// ���݂��Ȃ��ꍇ
         			if (dept_cdList.isEmpty()) {
                       	 csvExport(csvStruct                         // �Ώۃf�[�^���
        						, "1"								 // �G���[�敪
        						, i + 1								 // �G���[�s�ԍ�
        						, "Expj.DEPT_CD"					 // �G���[���ږ�
        						, new ExpjMessage("AA23603").getMessage(_locale)        // �G���[���b�Z�[�W
        						, null
        						, null
     							, null);		
        					_intErrorCount++;
        					continue;
         			}
				}
				
				//�v���W�F�N�g�R�[�h�����͂���Ă���ꍇ
				//[CSV���]�D�h���i�����t���O�h��1:���i�����̏ꍇ���A[CSV���]�D�h�v���W�F�N�g�R�[�h�h�����͂���Ă���ꍇ
				if("1".equals(csvStruct.getNON_NO_ITEM_FLG()) && !isNull(csvStruct.getPJ_CD())){
					//�v���W�F�N�g�R�[�h������
         			List pj_cdList = entity.mselectV_PJ_CD.read(conn, csvStruct);
					// ���݂��Ȃ��ꍇ
         			if (pj_cdList.isEmpty()) {
                       	 csvExport(csvStruct                         // �Ώۃf�[�^���
        						, "1"								 // �G���[�敪
        						, i + 1								 // �G���[�s�ԍ�
        						, "Expj.PJ_CD"					 // �G���[���ږ�
        						, new ExpjMessage("AA23608").getMessage(_locale)        // �G���[���b�Z�[�W
        						, null
        						, null
     							, null);		
        					_intErrorCount++;
        					continue;
         			}
				}
				
				//�Z�O�����g1�����͂���Ă���ꍇ
				//[CSV���]�D�h���i�����t���O�h��1:���i�����̏ꍇ���A[CSV���]�D�h�Z�O�����g1�h�����͂���Ă���ꍇ
				if("1".equals(csvStruct.getNON_NO_ITEM_FLG()) && !isNull(csvStruct.getSEG_CONTENTS1())){
					//�Z�O�����g1������
					List seg_1List = entity.mselectV_SEG_CONTENTS_1.read(conn, csvStruct);
					// ���݂��Ȃ��ꍇ
         			if (seg_1List.isEmpty()) {
                       	 csvExport(csvStruct                         // �Ώۃf�[�^���
        						, "1"								 // �G���[�敪
        						, i + 1								 // �G���[�s�ԍ�
        						, "Expj.SEG_CONTENTS1"					 // �G���[���ږ�
        						, new ExpjMessage("AA23604").getMessage(_locale)        // �G���[���b�Z�[�W
        						, null
        						, null
     							, null);		
        					_intErrorCount++;
        					continue;
         			}
				}
				
				//�Z�O�����g2�����͂���Ă���ꍇ
				//[CSV���]�D�h���i�����t���O�h��1:���i�����̏ꍇ���A[CSV���]�D�h�Z�O�����g2�h�����͂���Ă���ꍇ
				if("1".equals(csvStruct.getNON_NO_ITEM_FLG()) && !isNull(csvStruct.getSEG_CONTENTS2())){
					//�Z�O�����g2������
					List seg_2List = entity.mselectV_SEG_CONTENTS_2.read(conn, csvStruct);
					// ���݂��Ȃ��ꍇ
         			if (seg_2List.isEmpty()) {
                       	 csvExport(csvStruct                         // �Ώۃf�[�^���
        						, "1"								 // �G���[�敪
        						, i + 1								 // �G���[�s�ԍ�
        						, "Expj.SEG_CONTENTS2"					 // �G���[���ږ�
        						, new ExpjMessage("AA23605").getMessage(_locale)        // �G���[���b�Z�[�W
        						, null
        						, null
     							, null);		
        					_intErrorCount++;
        					continue;
         			}
				}
				
				//�Z�O�����g3�����͂���Ă���ꍇ
				//[CSV���]�D�h���i�����t���O�h��1:���i�����̏ꍇ���A[CSV���]�D�h�Z�O�����g3�h�����͂���Ă���ꍇ
				if("1".equals(csvStruct.getNON_NO_ITEM_FLG()) && !isNull(csvStruct.getSEG_CONTENTS3())){
					//�Z�O�����g3������
					List seg_3List = entity.mselectV_SEG_CONTENTS_3.read(conn, csvStruct);
					// ���݂��Ȃ��ꍇ
         			if (seg_3List.isEmpty()) {
                       	 csvExport(csvStruct                         // �Ώۃf�[�^���
        						, "1"								 // �G���[�敪
        						, i + 1								 // �G���[�s�ԍ�
        						, "Expj.SEG_CONTENTS3"					 // �G���[���ږ�
        						, new ExpjMessage("AA23606").getMessage(_locale)        // �G���[���b�Z�[�W
        						, null
        						, null
     							, null);		
        					_intErrorCount++;
        					continue;
         			}
				}
				
				//�Z�O�����g4�����͂���Ă���ꍇ
				//[CSV���]�D�h���i�����t���O�h��1:���i�����̏ꍇ���A[CSV���]�D�h�Z�O�����g4�h�����͂���Ă���ꍇ
				if("1".equals(csvStruct.getNON_NO_ITEM_FLG()) && !isNull(csvStruct.getSEG_CONTENTS4())){
					//�Z�O�����g4������
					List seg_4List = entity.mselectV_SEG_CONTENTS_4.read(conn, csvStruct);
					
					// ���݂��Ȃ��ꍇ
         			if (seg_4List.isEmpty()) {
                       	 csvExport(csvStruct                         // �Ώۃf�[�^���
        						, "1"								 // �G���[�敪
        						, i + 1								 // �G���[�s�ԍ�
        						, "Expj.SEG_CONTENTS4"					 // �G���[���ږ�
        						, new ExpjMessage("AA23607").getMessage(_locale)        // �G���[���b�Z�[�W
        						, null
        						, null
     							, null);		
        					_intErrorCount++;
        					continue;
         			}
				}
//20150806 ADD END BY SYSCOM

                 csvStruct.setTAX_CD(ts.getTAX_CD());                   // ����ŃR�[�h
                 csvStruct.setTAX_RATE_1(ts.getTAX_RATE_1());           // �ŗ�1
                 csvStruct.setTAX_RATE_2(ts.getTAX_RATE_2());           // �ŗ�2
                 csvStruct.setTAX_RATE_3(ts.getTAX_RATE_3());           // �ŗ�3
                 csvStruct.setTAX_ROUND_TYP(ts.getTAX_ROUND_TYP());     // �Œ[���敪
                 // ��������������敪
                 // ���i�ȊO�A�܂��͔��i�ŕi�ڂ���̏ꍇ
                 if("0".equals(csvStruct.getNON_NO_ITEM_FLG()) ||("1".equals(csvStruct.getNON_NO_ITEM_FLG()) && !isNull(csvStruct.getITEM_CD()))){
                	 // �m�i�ځn�D�h��������敪�h��ݒ�
                	 csvStruct.setACPT_INSPC_TYP(itemStruct.getACPT_INSPC_TYP());
                 }else{
                	 // �P�F����݂̂�ݒ�
                	 csvStruct.setACPT_INSPC_TYP("1");
                 }
                 // ��ЃR�[�h
                 csvStruct.setCOMPANY_CD(_company_cd);
                 // �H��R�[�h
                 csvStruct.setPLANT_CD(this.sysPLANT_CD);
                 // �����S����
                 csvStruct.setPUCH_ODR_PERSON(this.sysUSER_CD);
                 // �l�����z
                 String discAmount =
                  AmountCalculator.calcDiscAmount(
                		  csvStruct.getPUCH_ODR_AMOUNT(),
                          csvStruct.getNET_AMOUNT());
                 csvStruct.setDISC_AMOUNT(discAmount);
                 
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
	 * CSV�f�[�^�捞
	 * @param 
	 * @return�@csvList
	 * @throws Exception
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
				AE0180010Struct structCsv = null;
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
						structCsv = new AE0180010Struct();
						if (CSV_NECESSARY_COLUMN == v.size()) {
							// �i�ڔԍ��@
							structCsv.setITEM_CD((String)v.get(CSV_ITEM_CD)); 
							// �����[��
							structCsv.setPUCH_ODR_DLV_DATE((String)v.get(CSV_PRD_DUE_DATE));
							// �����\���
							structCsv.setPUCH_ODR_START_DATE((String)v.get(CSV_PUCH_ODR_DLV_DATE)); 
							structCsv.setL_PUCH_ODR_START_DATE((String)v.get(CSV_PUCH_ODR_DLV_DATE)); 
							// ������
							structCsv.setPUCH_ODR_QTY((String)v.get(CSV_PUCH_ODR_QTY));
							structCsv.setL_PUCH_ODR_QTY((String)v.get(CSV_PUCH_ODR_QTY));
							// �����R�[�h
							structCsv.setVEND_CD((String)v.get(CSV_VEND_CD)); 
							// ����
							structCsv.setJOB_ODR_CD((String)v.get(CSV_JOB_ODR_CD)); 	
							structCsv.setL_JOB_ODR_CD((String)v.get(CSV_JOB_ODR_CD)); 
							// �����񓚔[��
							structCsv.setCONFIRM_DLV_DATE((String)v.get(CSV_CONFIRM_DLV_DATE)); 
							// ����ꏊ
							structCsv.setWH_CD((String)v.get(CSV_WH_CD)); 
							// ���l
							structCsv.setPUCH_ODR_COMMENT((String)v.get(CSV_WORK_IN_PROC_COMMENT));
							// ���i�����t���O
							structCsv.setNON_NO_ITEM_FLG((String)v.get(CSV_NON_NO_ITEM_FLG)); 
							// ���i�����i�ږ�
							structCsv.setNON_NO_ITEM_NAME((String)v.get(CSV_NON_NO_ITEM_NAME)); 
							// ���i�������i�敪
							structCsv.setNON_NO_ITEM_TYP((String)v.get(CSV_NON_NO_ITEM_TYP)); 
							// ���i�����P��
							structCsv.setNON_NO_ITEM_PUCH_ODR_UNIT((String)v.get(CSV_NON_NO_ITEM_PUCH_ODR_UNIT)); 
							// �P���敪
							structCsv.setUNIT_COST_TYP((String)v.get(CSV_UNIT_COST_TYP)); 
							structCsv.setL_UNIT_COST_TYP((String)v.get(CSV_UNIT_COST_TYP)); 
							// �P��
							structCsv.setUNIT_COST((String)v.get(CSV_ACTUAL_UNIT_PRICE)); 
							structCsv.setL_UNIT_COST((String)v.get(CSV_ACTUAL_UNIT_PRICE)); 
							// ���H��
							structCsv.setPROCESSING_COST((String)v.get(CSV_PROCESSING_COST)); 
							structCsv.setL_PROCESSING_COST((String)v.get(CSV_PROCESSING_COST)); 
							// �ޗ���
							structCsv.setMATERIAL_COST((String)v.get(CSV_MATERIAL_COST)); 
							structCsv.setL_MATERIAL_COST((String)v.get(CSV_MATERIAL_COST)); 
							// ���̑��o��
							structCsv.setOTHER_OVERHEADS((String)v.get(CSV_OTHER_OVERHEADS)); 
							structCsv.setL_OTHER_OVERHEADS((String)v.get(CSV_OTHER_OVERHEADS)); 
							// �{�̋��z
							structCsv.setNET_AMOUNT((String)v.get(CSV_NET_AMOUNT)); 
							structCsv.setL_NET_AMOUNT((String)v.get(CSV_NET_AMOUNT)); 
							// �בփ��[�g
							structCsv.setEXCH_RATE((String)v.get(CSV_EXCH_RATE)); 
							structCsv.setL_EXCH_RATE((String)v.get(CSV_EXCH_RATE)); 
//20150806 ADD START BY SYSCOM
							//�ȖڃR�[�h
							structCsv.setACCT_CD((String)v.get(CSV_ACCT_CD)); 
							//���S����R�[�h
							structCsv.setDEPT_CD((String)v.get(CSV_DEPT_CD)); 
							//�v���W�F�N�g�R�[�h
							structCsv.setPJ_CD((String)v.get(CSV_PJ_CD)); 
							//�Z�O�����g1
							structCsv.setSEG_CONTENTS1((String)v.get(CSV_SEG_CONTENTS1)); 
							//�Z�O�����g2
							structCsv.setSEG_CONTENTS2((String)v.get(CSV_SEG_CONTENTS2)); 
							//�Z�O�����g3
							structCsv.setSEG_CONTENTS3((String)v.get(CSV_SEG_CONTENTS3)); 
							//�Z�O�����g4
							structCsv.setSEG_CONTENTS4((String)v.get(CSV_SEG_CONTENTS4)); 
//20150806 ADD END BY SYSCOM
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
			
		}catch (Exception e) {
			setErrorMessage("AH00042", "0", "0");
			setReadStatus(ERROR);
			throw new ExpjException(e);
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
				warningFlg = false;
				AE0180010Struct cvsStruct = (AE0180010Struct)csvList.get(i);
				// ���Ԃ��Ȃ��ꍇ
				if(isNull(cvsStruct.getJOB_ODR_CD())){
					// CSV�t�F�C�����e�́A�����c�o�^����
					rtnFlg = insertRlsdPuchOdr (cvsStruct,i);
					if(!rtnFlg) {
						conn.rollback();
						return false;
					}
				// ���ԏꍇ
				}else{
					// CSV�t�F�C�����e�́A�����c�o�^����
					rtnFlg = insertRlsdPuchOdrJob (cvsStruct,i);
					if(!rtnFlg) {
						conn.rollback();
						return false;
					}
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
	 * ���Ԃ��Ȃ��ꍇ�ACSV�t�F�C�����e�́A�����c�o�^����
	 * @param csvList
	 * @return
	 * @throws FoundationException 
	 */
	private boolean insertRlsdPuchOdr (AE0180010Struct adstruct ,int j) throws ExpjException {
		try {
			String PUCH_ODR_DLV_TIME = null;
			String PUCH_ODR_START_TIME = null;
			String CONFIRM_DLV_TIME = null;
			adstruct.setsUser_ID(sysUSER_CD);
			// ���͎����̃`�F�b�N(�����Ǘ�����ꍇ�̂�)
			if ("true".equals(struct.getTIME_CTRL())) {
				PUCH_ODR_DLV_TIME = "2359";
				PUCH_ODR_START_TIME = "2359";
				CONFIRM_DLV_TIME = "2359";
			} else {
				// �����Ǘ����Ȃ��ꍇ��0000�ɐݒ�
				PUCH_ODR_DLV_TIME = "0000";
				PUCH_ODR_START_TIME = "0000";
				CONFIRM_DLV_TIME = "0000";
			}
			/** �����\����i�����܂ށj*/
			if (adstruct.getPUCH_ODR_START_DATE().length()<=10) {
				adstruct.setPUCH_ODR_START_DATE(adstruct.getPUCH_ODR_START_DATE() + " " + PUCH_ODR_START_TIME);
			}
			 /** �����[���i�����܂ށj*/
			if (adstruct.getPUCH_ODR_DLV_DATE().length()<=10) {
				adstruct.setPUCH_ODR_DLV_DATE(adstruct.getPUCH_ODR_DLV_DATE() + " " + PUCH_ODR_DLV_TIME);
			}
			 /** �����񓚔[���i�����܂ށj*/
            if(adstruct.getCONFIRM_DLV_DATE() != null && !("".equals(adstruct.getCONFIRM_DLV_DATE()))){
            	if (adstruct.getCONFIRM_DLV_DATE().length()<=10) {
            		adstruct.setCONFIRM_DLV_DATE(adstruct.getCONFIRM_DLV_DATE() + " " + CONFIRM_DLV_TIME);
            	}
            }
			// �I�[�_�[�f�}���h�ԍ��������̔�
            // [���v��]�̍X�V
            if ("0".equals(adstruct.getNON_NO_ITEM_FLG())) {
           	    String odNoString = null;
                // ASPROVA�A�g�I�v�V�����������̏ꍇ�F���P�ʂ̃��[�h�^�C���v�Z���s���B
          	    if(!"1".equals(_SysInstallOptions_ASP)){
          	    	CommonOd od = new CommonOd(conn, getsysPLANT_CD(), sysUSER_CD, sp.getProcId());
          	  		odNoString =
          	  			od.addOdInfo(
          	  				adstruct.getITEM_CD(),
          	  					Converter.strToDate(
          	  						adstruct.getPUCH_ODR_DLV_DATE(), Converter.SLASH_DATE_HOUR_MINUTE),
          	  							Converter.strToDate(
          	  								adstruct.getPUCH_ODR_START_DATE(), Converter.SLASH_DATE_HOUR_MINUTE),
          	  									Double.parseDouble(adstruct.getPUCH_ODR_QTY()),
          	  									2);
          	  	// ASPROVA�A�g�I�v�V���������ς̏ꍇ�F���ԒP�ʂł̃��[�h�^�C���v�Z���s���B
          	  	}else{
	          	  	ATCommonOd od = new ATCommonOd(conn, getsysPLANT_CD(), sysUSER_CD, sp.getProcId());
	       	  		odNoString =
	       	  			od.addOdInfo(
	       	  				adstruct.getITEM_CD(),
	       	  					Converter.strToDate(
	       	  						adstruct.getPUCH_ODR_DLV_DATE(), Converter.SLASH_DATE_HOUR_MINUTE),
	       	  							Converter.strToDate(
	       	  								adstruct.getPUCH_ODR_START_DATE(), Converter.SLASH_DATE_HOUR_MINUTE),
				
	       	  									Double.parseDouble(adstruct.getPUCH_ODR_QTY()),
	       	  									2,
	       	  									new Integer("2").intValue());
          	  	}
          	  	// �I�[�_�[�f�}���h�ԍ��ݒ�
          	    adstruct.setOD_NO(odNoString);
          	    // ���i�����i�ږ�
          	    adstruct.setNON_NO_ITEM_NAME(null);
          	    // ���i�������i�敪
          	    adstruct.setNON_NO_ITEM_TYP("0");
          	    // ���i�����P��
          	    adstruct.setNON_NO_ITEM_PUCH_ODR_UNIT(null);
          	    // �݌ɊǗ��t���O
          	    adstruct.setINV_CTRL_FLG("1");
          	} else {
           	    // �I�[�_�[�f�}���h�ԍ��ݒ�
            	adstruct.setOD_NO(null);
          	    // �݌ɊǗ��t���O
          	    adstruct.setINV_CTRL_FLG("0");
          	    // ���H��
          	    adstruct.setPROCESSING_COST("0");
          	    // �ޗ���
          	    adstruct.setMATERIAL_COST("0");
          	    // ���̑��o��
          	    adstruct.setOTHER_OVERHEADS("0");
          	}
            // �����ԍ��������̔�
            Numbering puchCdNumbering =
             new Numbering(
              conn,
              Numbering.PUCH_CD,
              sysUSER_CD,
              sp.getProcId(),
              getsysPLANT_CD());
            adstruct.setPUCH_ODR_CD(puchCdNumbering.getNo());
            if (isNull(adstruct.getPUCH_ODR_CD())) {
				//�̔Ԍ��ʂ��Ȃ�
				csvExport(adstruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, j + 1						// �G���[�����s
						,null                       // �G���[���ږ�
						,new ExpjMessage("ZZ01106").getMessage(_locale)// �G���[���b�Z�[�W
						,null
						, null
						, null);	
				_intErrorCount++;
				setReadStatus(ERROR);
				return false;
			}
            // [�����c]��o�^
            entity.minsertT_RLSD_PUCH_ODR.create(conn, adstruct);
            return true;
		}catch(Exception e) {
			throw new ExpjException(e);
		}
	}
	
	/**
	 * ���ԏꍇ�ACSV�t�F�C�����e�́A�����c�o�^����
	 * @param csvList
	 * @return
	 * @throws FoundationException 
	 */
	private boolean insertRlsdPuchOdrJob (AE0180010Struct adstruct ,int j) throws ExpjException {
		try {
			String PUCH_ODR_DLV_TIME = null;
			String PUCH_ODR_START_TIME = null;
			String CONFIRM_DLV_TIME = null;
			adstruct.setsUser_ID(sysUSER_CD);
			
			// ���͎����̃`�F�b�N(�����Ǘ�����ꍇ�̂�)
			if ("true".equals(struct.getTIME_CTRL())) {
				PUCH_ODR_DLV_TIME = "2359";
				PUCH_ODR_START_TIME = "2359";
				CONFIRM_DLV_TIME = "2359";
			} else {
				// �����Ǘ����Ȃ��ꍇ��0000�ɐݒ�
				PUCH_ODR_DLV_TIME = "0000";
				PUCH_ODR_START_TIME = "0000";
				CONFIRM_DLV_TIME = "0000";
			}
			/** �����\����i�����܂ށj*/
			if (adstruct.getPUCH_ODR_START_DATE().length()<=10) {
				adstruct.setPUCH_ODR_START_DATE(adstruct.getPUCH_ODR_START_DATE() + " " + PUCH_ODR_START_TIME);
			}
			 /** �����[���i�����܂ށj*/
			if (adstruct.getPUCH_ODR_DLV_DATE().length()<=10) {
				adstruct.setPUCH_ODR_DLV_DATE(adstruct.getPUCH_ODR_DLV_DATE() + " " + PUCH_ODR_DLV_TIME);
			}
			 /** �����񓚔[���i�����܂ށj*/
            if(adstruct.getCONFIRM_DLV_DATE() != null && !("".equals(adstruct.getCONFIRM_DLV_DATE()))){
            	if (adstruct.getCONFIRM_DLV_DATE().length()<=10) {
            		adstruct.setCONFIRM_DLV_DATE(adstruct.getCONFIRM_DLV_DATE() + " " + CONFIRM_DLV_TIME);
            	}
            }
            // ���i�����i�ږ�
      	    adstruct.setNON_NO_ITEM_NAME(null);
      	    // ���i�������i�敪
      	    adstruct.setNON_NO_ITEM_TYP("0");
      	    // ���i�����P��
      	    adstruct.setNON_NO_ITEM_PUCH_ODR_UNIT(null);
      	    // �݌ɊǗ��t���O
      	    adstruct.setINV_CTRL_FLG("1");
      	    // ���i�����t���O
      	    adstruct.setNON_NO_ITEM_FLG("0");
			// ������ԍ���������̔�
			Numbering puchCdNumbering =
					new Numbering(
							conn,
							Numbering.PUCH_CD,
							sysUSER_CD,
							sp.getProcId(),
							getsysPLANT_CD());
			adstruct.setPUCH_ODR_CD(puchCdNumbering.getNo());
			if (isNull(adstruct.getPUCH_ODR_CD())) {
				//�̔Ԍ��ʂ��Ȃ�
				csvExport(adstruct					// �Ώۃf�[�^���
						, "1"						// �G���[�敪
						, j + 1						// �G���[�����s
						,null                       // �G���[���ږ�
						,new ExpjMessage("ZZ01106").getMessage(_locale)// �G���[���b�Z�[�W
						,null
						, null
						, null);	
				_intErrorCount++;
				setReadStatus(ERROR);
				return false;
			}
			// [�����c]��o�^
			int nRet = entity.minsertT_RLSD_PUCH_ODR.create(conn, adstruct);

			// [���v��]�̃I�[�_���̍X�V
			CommonOd od = new CommonOd(conn, getsysPLANT_CD(), sysUSER_CD, sp.getProcId());
			od.changeOdInfo(adstruct.getOD_NO(), -1);
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0180");
		logger.entering("AE0180010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");
			//{{user_implement_dev:<controlBrowse>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlBrowse>
		logger.exiting("AE0180010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");

		return;
	}

	/**
	 * CSV�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCSVOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0180");
		logger.entering("AE0180010Control"+":USER="+struct.getsUser_ID(),"controlCSVOut");
			//{{user_implement_dev:<controlCSVOut>
		// CSV�o�͕��i��ݒ�
		csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));
		AE0180010Struct errorStruct = null;
		List csv = new ArrayList();	// CSV���
		// CSV�w�b�_�s��CSV���ɒǉ�
		String[] title = {
				 "Expj.Cmt3094"							// �G���[�ӏ�
				,"Expj.Cmt3095"							// �G���[�敪
				,"Expj.Cmt3098"							// �G���[���e
				,"Expj.Cmt6220"							// �G���[����
				,"Expj.ITEM_CD"							// �i�ڔԍ�
				,"Expj.PRD_DUE_DATE_1"					// �����[��
				,"Expj.PUCH_ODR_DLV_DATE_1"				// �����\���
				,"Expj.PUCH_ODR_QTY"					// ������
				,"Expj.VEND_CD"						    // �����R�[�h
				,"Expj.JOB_ODR_CD"						// ����
				,"Expj.CONFIRM_DLV_DATE_1"				// �����񓚔[��
				,"Expj.WH_CD_2"					        // ����ꏊ
				,"Expj.WORK_IN_PROC_COMMENT_3"			// ���l
				,"Expj.NON_NO_ITEM_FLG"					// ���i�����t���O
				,"Expj.NON_NO_ITEM_NAME"				// ���i�����i�ږ�
				,"Expj.NON_NO_ITEM_TYP"					// ���i�������i�敪
				,"Expj.NON_NO_ITEM_PUCH_ODR_UNIT"		// ���i�����P��
				,"Expj.UNIT_COST_TYP"					// �P���敪
				,"Expj.ACTUAL_UNIT_PRICE"				// �P��
				,"Expj.PROCESSING_COST"					// ���H��
				,"Expj.MATERIAL_COST"					// �ޗ���
				,"Expj.OTHER_OVERHEADS"					// ���̑��o��
				,"Expj.NET_AMOUNT"					    // �{�̋��z
				,"Expj.EXCH_RATE"					    // �בփ��[�g
//20150806 ADD START BY SYSCOM
				,"Expj.EXPENSE_CLASS_CD"				//�ȖڃR�[�h
				,"Expj.DEPT_CD"							//���S����R�[�h
				,"Expj.PJ_CD"							//�v���W�F�N�g�R�[�h
				,"Expj.SEG_CONTENTS1"					//�Z�O�����g1
				,"Expj.SEG_CONTENTS2"					//�Z�O�����g2
				,"Expj.SEG_CONTENTS3"					//�Z�O�����g3
				,"Expj.SEG_CONTENTS4"					//�Z�O�����g4
//20150806 ADD END BY SYSCOM
		};
		csv.add(title);
		// [���].�ꗗ���̃G���[����CSV���ɒǉ�
		for (int i = 0; i < list.size(); i++) {
			errorStruct = (AE0180010Struct)list.get(i);
			String[] date = {
					 errorStruct.getl_ERROR_IN()
					,errorStruct.getl_ERR_TYP()
					,errorStruct.getl_ERR_INFO()
					,errorStruct.getl_ERR_CTR_NM()
					,replaceSlashSub(errorStruct.getl_ERR_ITEM_CD())
					,replaceSlashSub(errorStruct.getl_ERR_PRD_DUE_DATE())
					,replaceSlashSub(errorStruct.getl_ERR_PUCH_ODR_DLV_DATE())
					,replaceSlashSub(errorStruct.getl_ERR_PUCH_ODR_QTY())
					,replaceSlashSub(errorStruct.getl_ERR_VEND_CD())
					,replaceSlashSub(errorStruct.getl_ERR_JOB_ODR_CD())
					,replaceSlashSub(errorStruct.getl_ERR_CONFIRM_DLV_DATE())
					,replaceSlashSub(errorStruct.getl_ERR_WH_CD())
					,replaceSlashSub(errorStruct.getl_ERR_WORK_IN_PROC_COMMENT())
					,replaceSlashSub(errorStruct.getl_ERR_NON_NO_ITEM_FLG())
					,replaceSlashSub(errorStruct.getl_ERR_NON_NO_ITEM_NAME())
					,replaceSlashSub(errorStruct.getl_ERR_NON_NO_ITEM_TYP())
					,replaceSlashSub(errorStruct.getl_ERR_NON_NO_ITEM_PUCH_ODR_UNIT())
					,replaceSlashSub(errorStruct.getl_ERR_UNIT_COST_TYP())
					,replaceSlashSub(errorStruct.getl_ERR_ACTUAL_UNIT_PRICE())
					,replaceSlashSub(errorStruct.getl_ERR_PROCESSING_COST())
					,replaceSlashSub(errorStruct.getl_ERR_MATERIAL_COST())
					,replaceSlashSub(errorStruct.getl_ERR_OTHER_OVERHEADS())
					,replaceSlashSub(errorStruct.getl_ERR_NET_AMOUNT())
					,replaceSlashSub(errorStruct.getl_ERR_EXCH_RATE())
//20150806 ADD START BY SYSCOM
					,replaceSlashSub(errorStruct.getl_ERR_EXPENSE_CLASS_CD())
					,replaceSlashSub(errorStruct.getl_ERR_DEPT_CD())
					,replaceSlashSub(errorStruct.getl_ERR_PJ_CD())
					,replaceSlashSub(errorStruct.getl_ERR_SEG_CONTENTS1())
					,replaceSlashSub(errorStruct.getl_ERR_SEG_CONTENTS2())
					,replaceSlashSub(errorStruct.getl_ERR_SEG_CONTENTS3())
					,replaceSlashSub(errorStruct.getl_ERR_SEG_CONTENTS4())
//20150806 ADD END BY SYSCOM
			};
			csv.add(date);
		}
		
		// CSV�t�@�C�����쐬
		csvWriter.write(csv, CoreTools.getLocale(struct.getsUser_ID()), true);
		// CSV�t�@�C�����N���C�A���g�ɏo��
		struct.setDOWNLOAD_FILE(getCsvWriter().getFilePath());
                //}}user_implement_dev:<controlCSVOut>
		logger.exiting("AE0180010Control"+":USER="+struct.getsUser_ID(),"controlCSVOut");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0180");
		logger.entering("AE0180010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
		setList(null);
		// ������Ԃ��u������ԁv�ɐݒ�
		setReadStatus(INITIAL);
                //}}user_implement_dev:<controlClear>
		logger.exiting("AE0180010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0180");
		logger.entering("AE0180010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("AE0180010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * �捞�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCsvIn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0180");
		logger.entering("AE0180010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");
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
				listCsvTemp = listCsv;

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
		logger.exiting("AE0180010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");

		return;
	}

	/**
	 * ���s�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlExecute() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0180");
		logger.entering("AE0180010Control"+":USER="+struct.getsUser_ID(),"controlExecute");
			//{{user_implement_dev:<controlExecute>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try{
	    	setReadStatus(INITIAL); 
	        // �o�b�`�����N���X��main����
	        String strBatchClassName = null;		// �Ăяo����N���X��
	        String strBatchProcessingTyp = null;	// �o�b�`�����敪
	        String strProgramId = null;			    // �Ɩ����iAE0180B001�j
	        String strUserId = null;				// ���[�UID
	        String strPlantCd = null;				// �H��R�[�h
	        String strCsvTakeTyp =null;             // CSV�捞����
	        // �����Z�b�g
	        strBatchClassName = "com.nec.jp.orteus.metamorBase.AE0180.AE0180B001.mainAE0180B001";
	        strBatchProcessingTyp = "2";					  // 2: �����^�]���Ȃ��i��ԃo�b�`�Ȃ��j
	        strProgramId = "AE0180B001";					  // �Ɩ����iAE0180B001�j
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
		logger.exiting("AE0180010Control"+":USER="+struct.getsUser_ID(),"controlExecute");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0180");
		logger.entering("AE0180010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AE0180010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0180");
		logger.entering("AE0180010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		try{
            // [�M��]���𕔕i���擾			
            _homeCurStruct = HomeCurControl.getData(conn);
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
         
			 // �V�X�e���p�����[�^�iTIME_CTRL�j�擾
			 AE0180010Struct TIME_CTRLStruct = new AE0180010Struct();
			 List TIME_CTRLList = entity.mselectTIME_CTRL.read(conn, TIME_CTRLStruct);
			 if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
		 		TIME_CTRLStruct = (AE0180010Struct)TIME_CTRLList.get(0);
				struct.setTIME_CTRL(TIME_CTRLStruct.getTIME_CTRL());
			 }else{
				struct.setTIME_CTRL("false");
			 }

			// �R���{�{�b�N�X�f�[�^�p��
	 		ComboBox combBox = new ComboBox(conn, sysUSER_CD);
			// �R���{�{�b�N�X�̃f�[�^���擾
			_COM_ERR_TYP = combBox.getData("ERR_TYP");
			// ���i�����t���O
			_NON_NO_ITEM_FLG = combBox.getData("NON_NO_ITEM_FLG");
			
			// ���i�������i�敪
			_PRODUCT_TYP = combBox.getData("PRODUCT_TYP");
			
			// �P���敪
			_UNIT_COST_TYP = combBox.getData("UNIT_COST_TYP");

			// ��ЃR�[�h�擾
			_company_cd = SystemInformation.getSysMyCompanyCd();
			
			// ASPROVA�A�g�I�v�V�����C���X�g�[���t���O�̎擾
			 List InstallOptionList_ASP = entity.mselectSYS_INSTALL_OPTIONS_ASP.read(conn, struct);
			 if (InstallOptionList_ASP.isEmpty()) {
			  	 struct.setASP_INSTALL_FLG(null);			
			 }else{
				 struct.setASP_INSTALL_FLG(((AE0180010Struct)InstallOptionList_ASP.get(0)).getASP_INSTALL_FLG());
			 }
			 
			 _SysInstallOptions_ASP = struct.getASP_INSTALL_FLG();
			
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
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AE0180010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0180");
		logger.entering("AE0180010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
		logger.exiting("AE0180010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("CSVOut") ) {
				controlCSVOut();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("CsvIn") ) {
				controlCsvIn();
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
//			throw new FoundationException("AE0180010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0180010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AE0180010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0180010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AE0180010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0180010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AE0180010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AE0180010Entity entity;
	protected AE0180010Struct struct;
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

		entity = new AE0180010Entity();
		struct = new AE0180010Struct();

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
	 * AE0180010�N���X�̕W���R���X�g���N�^
	 */
	public AE0180010Control() throws BusinessProcessException, FoundationException
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
				AE0180010Struct key = (AE0180010Struct)keyList.get(j);
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
				if(msgKeyType.containsKeyColumn("l_ERR_PUCH_ODR_DLV_DATE") && key.getl_ERR_PUCH_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("l_ERR_PUCH_ODR_DLV_DATE", key.getl_ERR_PUCH_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_PUCH_ODR_QTY") && key.getl_ERR_PUCH_ODR_QTY() != null) {
					msgKey.setKeyValue("l_ERR_PUCH_ODR_QTY", key.getl_ERR_PUCH_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_VEND_CD") && key.getl_ERR_VEND_CD() != null) {
					msgKey.setKeyValue("l_ERR_VEND_CD", key.getl_ERR_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_JOB_ODR_CD") && key.getl_ERR_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_ERR_JOB_ODR_CD", key.getl_ERR_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_CONFIRM_DLV_DATE") && key.getl_ERR_CONFIRM_DLV_DATE() != null) {
					msgKey.setKeyValue("l_ERR_CONFIRM_DLV_DATE", key.getl_ERR_CONFIRM_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_WH_CD") && key.getl_ERR_WH_CD() != null) {
					msgKey.setKeyValue("l_ERR_WH_CD", key.getl_ERR_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_WORK_IN_PROC_COMMENT") && key.getl_ERR_WORK_IN_PROC_COMMENT() != null) {
					msgKey.setKeyValue("l_ERR_WORK_IN_PROC_COMMENT", key.getl_ERR_WORK_IN_PROC_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_NON_NO_ITEM_FLG") && key.getl_ERR_NON_NO_ITEM_FLG() != null) {
					msgKey.setKeyValue("l_ERR_NON_NO_ITEM_FLG", key.getl_ERR_NON_NO_ITEM_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_NON_NO_ITEM_NAME") && key.getl_ERR_NON_NO_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ERR_NON_NO_ITEM_NAME", key.getl_ERR_NON_NO_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_NON_NO_ITEM_TYP") && key.getl_ERR_NON_NO_ITEM_TYP() != null) {
					msgKey.setKeyValue("l_ERR_NON_NO_ITEM_TYP", key.getl_ERR_NON_NO_ITEM_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_NON_NO_ITEM_PUCH_ODR_UNIT") && key.getl_ERR_NON_NO_ITEM_PUCH_ODR_UNIT() != null) {
					msgKey.setKeyValue("l_ERR_NON_NO_ITEM_PUCH_ODR_UNIT", key.getl_ERR_NON_NO_ITEM_PUCH_ODR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_UNIT_COST_TYP") && key.getl_ERR_UNIT_COST_TYP() != null) {
					msgKey.setKeyValue("l_ERR_UNIT_COST_TYP", key.getl_ERR_UNIT_COST_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_ACTUAL_UNIT_PRICE") && key.getl_ERR_ACTUAL_UNIT_PRICE() != null) {
					msgKey.setKeyValue("l_ERR_ACTUAL_UNIT_PRICE", key.getl_ERR_ACTUAL_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_PROCESSING_COST") && key.getl_ERR_PROCESSING_COST() != null) {
					msgKey.setKeyValue("l_ERR_PROCESSING_COST", key.getl_ERR_PROCESSING_COST());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_MATERIAL_COST") && key.getl_ERR_MATERIAL_COST() != null) {
					msgKey.setKeyValue("l_ERR_MATERIAL_COST", key.getl_ERR_MATERIAL_COST());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_OTHER_OVERHEADS") && key.getl_ERR_OTHER_OVERHEADS() != null) {
					msgKey.setKeyValue("l_ERR_OTHER_OVERHEADS", key.getl_ERR_OTHER_OVERHEADS());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_NET_AMOUNT") && key.getl_ERR_NET_AMOUNT() != null) {
					msgKey.setKeyValue("l_ERR_NET_AMOUNT", key.getl_ERR_NET_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_EXCH_RATE") && key.getl_ERR_EXCH_RATE() != null) {
					msgKey.setKeyValue("l_ERR_EXCH_RATE", key.getl_ERR_EXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("h_INSTALL_FLG") && key.geth_INSTALL_FLG() != null) {
					msgKey.setKeyValue("h_INSTALL_FLG", key.geth_INSTALL_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_EXPENSE_CLASS_CD") && key.getl_ERR_EXPENSE_CLASS_CD() != null) {
					msgKey.setKeyValue("l_ERR_EXPENSE_CLASS_CD", key.getl_ERR_EXPENSE_CLASS_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_DEPT_CD") && key.getl_ERR_DEPT_CD() != null) {
					msgKey.setKeyValue("l_ERR_DEPT_CD", key.getl_ERR_DEPT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_PJ_CD") && key.getl_ERR_PJ_CD() != null) {
					msgKey.setKeyValue("l_ERR_PJ_CD", key.getl_ERR_PJ_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_SEG_CONTENTS1") && key.getl_ERR_SEG_CONTENTS1() != null) {
					msgKey.setKeyValue("l_ERR_SEG_CONTENTS1", key.getl_ERR_SEG_CONTENTS1());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_SEG_CONTENTS2") && key.getl_ERR_SEG_CONTENTS2() != null) {
					msgKey.setKeyValue("l_ERR_SEG_CONTENTS2", key.getl_ERR_SEG_CONTENTS2());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_SEG_CONTENTS3") && key.getl_ERR_SEG_CONTENTS3() != null) {
					msgKey.setKeyValue("l_ERR_SEG_CONTENTS3", key.getl_ERR_SEG_CONTENTS3());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_SEG_CONTENTS4") && key.getl_ERR_SEG_CONTENTS4() != null) {
					msgKey.setKeyValue("l_ERR_SEG_CONTENTS4", key.getl_ERR_SEG_CONTENTS4());
				}
				if(msgKeyType.containsKeyColumn("w_COLUMN_FLG") && key.getw_COLUMN_FLG() != null) {
					msgKey.setKeyValue("w_COLUMN_FLG", key.getw_COLUMN_FLG());
				}
				if(msgKeyType.containsKeyColumn("L_PUCH_ODR_START_DATE") && key.getL_PUCH_ODR_START_DATE() != null) {
					msgKey.setKeyValue("L_PUCH_ODR_START_DATE", key.getL_PUCH_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("L_JOB_ODR_CD") && key.getL_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("L_JOB_ODR_CD", key.getL_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("L_UNIT_COST_TYP") && key.getL_UNIT_COST_TYP() != null) {
					msgKey.setKeyValue("L_UNIT_COST_TYP", key.getL_UNIT_COST_TYP());
				}
				if(msgKeyType.containsKeyColumn("L_UNIT_COST") && key.getL_UNIT_COST() != null) {
					msgKey.setKeyValue("L_UNIT_COST", key.getL_UNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("L_PROCESSING_COST") && key.getL_PROCESSING_COST() != null) {
					msgKey.setKeyValue("L_PROCESSING_COST", key.getL_PROCESSING_COST());
				}
				if(msgKeyType.containsKeyColumn("L_MATERIAL_COST") && key.getL_MATERIAL_COST() != null) {
					msgKey.setKeyValue("L_MATERIAL_COST", key.getL_MATERIAL_COST());
				}
				if(msgKeyType.containsKeyColumn("L_OTHER_OVERHEADS") && key.getL_OTHER_OVERHEADS() != null) {
					msgKey.setKeyValue("L_OTHER_OVERHEADS", key.getL_OTHER_OVERHEADS());
				}
				if(msgKeyType.containsKeyColumn("L_NET_AMOUNT") && key.getL_NET_AMOUNT() != null) {
					msgKey.setKeyValue("L_NET_AMOUNT", key.getL_NET_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("L_EXCH_RATE") && key.getL_EXCH_RATE() != null) {
					msgKey.setKeyValue("L_EXCH_RATE", key.getL_EXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("L_PUCH_ODR_QTY") && key.getL_PUCH_ODR_QTY() != null) {
					msgKey.setKeyValue("L_PUCH_ODR_QTY", key.getL_PUCH_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP") && key.getACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP", key.getACPT_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
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
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("DEAL_STS_FLG") && key.getDEAL_STS_FLG() != null) {
					msgKey.setKeyValue("DEAL_STS_FLG", key.getDEAL_STS_FLG());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP") && key.getJOB_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_STS_TYP", key.getJOB_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE") && key.getJOB_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("JOB_ODR_DLV_DATE", key.getJOB_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("VALUE") && key.getVALUE() != null) {
					msgKey.setKeyValue("VALUE", key.getVALUE());
				}
				if(msgKeyType.containsKeyColumn("NAME") && key.getNAME() != null) {
					msgKey.setKeyValue("NAME", key.getNAME());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("NON_NO_ITEM_NAME") && key.getNON_NO_ITEM_NAME() != null) {
					msgKey.setKeyValue("NON_NO_ITEM_NAME", key.getNON_NO_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("NON_NO_ITEM_TYP") && key.getNON_NO_ITEM_TYP() != null) {
					msgKey.setKeyValue("NON_NO_ITEM_TYP", key.getNON_NO_ITEM_TYP());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON") && key.getPUCH_ODR_PERSON() != null) {
					msgKey.setKeyValue("PUCH_ODR_PERSON", key.getPUCH_ODR_PERSON());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE") && key.getPUCH_ODR_START_DATE() != null) {
					msgKey.setKeyValue("PUCH_ODR_START_DATE", key.getPUCH_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE") && key.getPUCH_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("PUCH_ODR_DLV_DATE", key.getPUCH_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_QTY") && key.getPUCH_ODR_QTY() != null) {
					msgKey.setKeyValue("PUCH_ODR_QTY", key.getPUCH_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("NON_NO_ITEM_PUCH_ODR_UNIT") && key.getNON_NO_ITEM_PUCH_ODR_UNIT() != null) {
					msgKey.setKeyValue("NON_NO_ITEM_PUCH_ODR_UNIT", key.getNON_NO_ITEM_PUCH_ODR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP") && key.getUNIT_COST_TYP() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP", key.getUNIT_COST_TYP());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST") && key.getUNIT_COST() != null) {
					msgKey.setKeyValue("UNIT_COST", key.getUNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("PROCESSING_COST") && key.getPROCESSING_COST() != null) {
					msgKey.setKeyValue("PROCESSING_COST", key.getPROCESSING_COST());
				}
				if(msgKeyType.containsKeyColumn("MATERIAL_COST") && key.getMATERIAL_COST() != null) {
					msgKey.setKeyValue("MATERIAL_COST", key.getMATERIAL_COST());
				}
				if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS") && key.getOTHER_OVERHEADS() != null) {
					msgKey.setKeyValue("OTHER_OVERHEADS", key.getOTHER_OVERHEADS());
				}
				if(msgKeyType.containsKeyColumn("DISC_AMOUNT") && key.getDISC_AMOUNT() != null) {
					msgKey.setKeyValue("DISC_AMOUNT", key.getDISC_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_AMOUNT") && key.getPUCH_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("PUCH_ODR_AMOUNT", key.getPUCH_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("CONFIRM_DLV_DATE") && key.getCONFIRM_DLV_DATE() != null) {
					msgKey.setKeyValue("CONFIRM_DLV_DATE", key.getCONFIRM_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("INV_CTRL_FLG") && key.getINV_CTRL_FLG() != null) {
					msgKey.setKeyValue("INV_CTRL_FLG", key.getINV_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_COMMENT") && key.getPUCH_ODR_COMMENT() != null) {
					msgKey.setKeyValue("PUCH_ODR_COMMENT", key.getPUCH_ODR_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("RATE_JUDGE_DATE") && key.getRATE_JUDGE_DATE() != null) {
					msgKey.setKeyValue("RATE_JUDGE_DATE", key.getRATE_JUDGE_DATE());
				}
				if(msgKeyType.containsKeyColumn("EXCH_RATE") && key.getEXCH_RATE() != null) {
					msgKey.setKeyValue("EXCH_RATE", key.getEXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("TAX_RATE_1") && key.getTAX_RATE_1() != null) {
					msgKey.setKeyValue("TAX_RATE_1", key.getTAX_RATE_1());
				}
				if(msgKeyType.containsKeyColumn("TAX_RATE_2") && key.getTAX_RATE_2() != null) {
					msgKey.setKeyValue("TAX_RATE_2", key.getTAX_RATE_2());
				}
				if(msgKeyType.containsKeyColumn("TAX_RATE_3") && key.getTAX_RATE_3() != null) {
					msgKey.setKeyValue("TAX_RATE_3", key.getTAX_RATE_3());
				}
				if(msgKeyType.containsKeyColumn("NET_AMOUNT") && key.getNET_AMOUNT() != null) {
					msgKey.setKeyValue("NET_AMOUNT", key.getNET_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT_1") && key.getTAX_AMOUNT_1() != null) {
					msgKey.setKeyValue("TAX_AMOUNT_1", key.getTAX_AMOUNT_1());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT_2") && key.getTAX_AMOUNT_2() != null) {
					msgKey.setKeyValue("TAX_AMOUNT_2", key.getTAX_AMOUNT_2());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT_3") && key.getTAX_AMOUNT_3() != null) {
					msgKey.setKeyValue("TAX_AMOUNT_3", key.getTAX_AMOUNT_3());
				}
				if(msgKeyType.containsKeyColumn("AMOUNT_INCLUDE_TAX") && key.getAMOUNT_INCLUDE_TAX() != null) {
					msgKey.setKeyValue("AMOUNT_INCLUDE_TAX", key.getAMOUNT_INCLUDE_TAX());
				}
				if(msgKeyType.containsKeyColumn("HOME_CUR_AMOUNT") && key.getHOME_CUR_AMOUNT() != null) {
					msgKey.setKeyValue("HOME_CUR_AMOUNT", key.getHOME_CUR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD") && key.getTAX_CD() != null) {
					msgKey.setKeyValue("TAX_CD", key.getTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP") && key.getTAX_ROUND_TYP() != null) {
					msgKey.setKeyValue("TAX_ROUND_TYP", key.getTAX_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("NON_NO_ITEM_FLG") && key.getNON_NO_ITEM_FLG() != null) {
					msgKey.setKeyValue("NON_NO_ITEM_FLG", key.getNON_NO_ITEM_FLG());
				}
				if(msgKeyType.containsKeyColumn("ACCT_CD") && key.getACCT_CD() != null) {
					msgKey.setKeyValue("ACCT_CD", key.getACCT_CD());
				}
				if(msgKeyType.containsKeyColumn("DEPT_CD") && key.getDEPT_CD() != null) {
					msgKey.setKeyValue("DEPT_CD", key.getDEPT_CD());
				}
				if(msgKeyType.containsKeyColumn("PJ_CD") && key.getPJ_CD() != null) {
					msgKey.setKeyValue("PJ_CD", key.getPJ_CD());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS1") && key.getSEG_CONTENTS1() != null) {
					msgKey.setKeyValue("SEG_CONTENTS1", key.getSEG_CONTENTS1());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS2") && key.getSEG_CONTENTS2() != null) {
					msgKey.setKeyValue("SEG_CONTENTS2", key.getSEG_CONTENTS2());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS3") && key.getSEG_CONTENTS3() != null) {
					msgKey.setKeyValue("SEG_CONTENTS3", key.getSEG_CONTENTS3());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS4") && key.getSEG_CONTENTS4() != null) {
					msgKey.setKeyValue("SEG_CONTENTS4", key.getSEG_CONTENTS4());
				}
				if(msgKeyType.containsKeyColumn("ASP_INSTALL_FLG") && key.getASP_INSTALL_FLG() != null) {
					msgKey.setKeyValue("ASP_INSTALL_FLG", key.getASP_INSTALL_FLG());
				}
				if(msgKeyType.containsKeyColumn("TIME_CTRL") && key.getTIME_CTRL() != null) {
					msgKey.setKeyValue("TIME_CTRL", key.getTIME_CTRL());
				}
				if(msgKeyType.containsKeyColumn("PVC2BUSINESSNAME") && key.getPVC2BUSINESSNAME() != null) {
					msgKey.setKeyValue("PVC2BUSINESSNAME", key.getPVC2BUSINESSNAME());
				}
				if(msgKeyType.containsKeyColumn("PVC2OUTPUTPATH") && key.getPVC2OUTPUTPATH() != null) {
					msgKey.setKeyValue("PVC2OUTPUTPATH", key.getPVC2OUTPUTPATH());
				}
				if(msgKeyType.containsKeyColumn("PVC2OUTPUTNAME") && key.getPVC2OUTPUTNAME() != null) {
					msgKey.setKeyValue("PVC2OUTPUTNAME", key.getPVC2OUTPUTNAME());
				}
				if(msgKeyType.containsKeyColumn("PVC2LOGMODE") && key.getPVC2LOGMODE() != null) {
					msgKey.setKeyValue("PVC2LOGMODE", key.getPVC2LOGMODE());
				}
				if(msgKeyType.containsKeyColumn("PVC2OUTPUTMODE") && key.getPVC2OUTPUTMODE() != null) {
					msgKey.setKeyValue("PVC2OUTPUTMODE", key.getPVC2OUTPUTMODE());
				}
				if(msgKeyType.containsKeyColumn("PVC2USERID") && key.getPVC2USERID() != null) {
					msgKey.setKeyValue("PVC2USERID", key.getPVC2USERID());
				}
				if(msgKeyType.containsKeyColumn("PVC2PLANTCD") && key.getPVC2PLANTCD() != null) {
					msgKey.setKeyValue("PVC2PLANTCD", key.getPVC2PLANTCD());
				}
				if(msgKeyType.containsKeyColumn("PVC2TAXID") && key.getPVC2TAXID() != null) {
					msgKey.setKeyValue("PVC2TAXID", key.getPVC2TAXID());
				}
				if(msgKeyType.containsKeyColumn("VEND_DECIMAL_FIG") && key.getVEND_DECIMAL_FIG() != null) {
					msgKey.setKeyValue("VEND_DECIMAL_FIG", key.getVEND_DECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("PNUMTAXOUTAMOUNT") && key.getPNUMTAXOUTAMOUNT() != null) {
					msgKey.setKeyValue("PNUMTAXOUTAMOUNT", key.getPNUMTAXOUTAMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PNUMTAXAMOUNT") && key.getPNUMTAXAMOUNT() != null) {
					msgKey.setKeyValue("PNUMTAXAMOUNT", key.getPNUMTAXAMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PNUMEXTERNALTAXSALESAMOUNT") && key.getPNUMEXTERNALTAXSALESAMOUNT() != null) {
					msgKey.setKeyValue("PNUMEXTERNALTAXSALESAMOUNT", key.getPNUMEXTERNALTAXSALESAMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PNUMINTERNALTAXSALESAMOUNT") && key.getPNUMINTERNALTAXSALESAMOUNT() != null) {
					msgKey.setKeyValue("PNUMINTERNALTAXSALESAMOUNT", key.getPNUMINTERNALTAXSALESAMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PNUMTAXFREESALESAMOUNT") && key.getPNUMTAXFREESALESAMOUNT() != null) {
					msgKey.setKeyValue("PNUMTAXFREESALESAMOUNT", key.getPNUMTAXFREESALESAMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PNUMEXTERNALTAXAMOUNT") && key.getPNUMEXTERNALTAXAMOUNT() != null) {
					msgKey.setKeyValue("PNUMEXTERNALTAXAMOUNT", key.getPNUMEXTERNALTAXAMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PNUMINTERNALTAXAMOUNT") && key.getPNUMINTERNALTAXAMOUNT() != null) {
					msgKey.setKeyValue("PNUMINTERNALTAXAMOUNT", key.getPNUMINTERNALTAXAMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PVC2ERRCD") && key.getPVC2ERRCD() != null) {
					msgKey.setKeyValue("PVC2ERRCD", key.getPVC2ERRCD());
				}
				if(msgKeyType.containsKeyColumn("PNUMSTATUS") && key.getPNUMSTATUS() != null) {
					msgKey.setKeyValue("PNUMSTATUS", key.getPNUMSTATUS());
				}
				if(msgKeyType.containsKeyColumn("DEPT_NAME") && key.getDEPT_NAME() != null) {
					msgKey.setKeyValue("DEPT_NAME", key.getDEPT_NAME());
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
					AE0180010Struct key = new AE0180010Struct();
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
					if(msgKeyType.containsKeyColumn("l_ERR_PUCH_ODR_DLV_DATE")) {
						key.setl_ERR_PUCH_ODR_DLV_DATE(msgKey.getKeyValue("l_ERR_PUCH_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_PUCH_ODR_QTY")) {
						key.setl_ERR_PUCH_ODR_QTY(msgKey.getKeyValue("l_ERR_PUCH_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_VEND_CD")) {
						key.setl_ERR_VEND_CD(msgKey.getKeyValue("l_ERR_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_JOB_ODR_CD")) {
						key.setl_ERR_JOB_ODR_CD(msgKey.getKeyValue("l_ERR_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_CONFIRM_DLV_DATE")) {
						key.setl_ERR_CONFIRM_DLV_DATE(msgKey.getKeyValue("l_ERR_CONFIRM_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_WH_CD")) {
						key.setl_ERR_WH_CD(msgKey.getKeyValue("l_ERR_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_WORK_IN_PROC_COMMENT")) {
						key.setl_ERR_WORK_IN_PROC_COMMENT(msgKey.getKeyValue("l_ERR_WORK_IN_PROC_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_NON_NO_ITEM_FLG")) {
						key.setl_ERR_NON_NO_ITEM_FLG(msgKey.getKeyValue("l_ERR_NON_NO_ITEM_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_NON_NO_ITEM_NAME")) {
						key.setl_ERR_NON_NO_ITEM_NAME(msgKey.getKeyValue("l_ERR_NON_NO_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_NON_NO_ITEM_TYP")) {
						key.setl_ERR_NON_NO_ITEM_TYP(msgKey.getKeyValue("l_ERR_NON_NO_ITEM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_NON_NO_ITEM_PUCH_ODR_UNIT")) {
						key.setl_ERR_NON_NO_ITEM_PUCH_ODR_UNIT(msgKey.getKeyValue("l_ERR_NON_NO_ITEM_PUCH_ODR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_UNIT_COST_TYP")) {
						key.setl_ERR_UNIT_COST_TYP(msgKey.getKeyValue("l_ERR_UNIT_COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_ACTUAL_UNIT_PRICE")) {
						key.setl_ERR_ACTUAL_UNIT_PRICE(msgKey.getKeyValue("l_ERR_ACTUAL_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_PROCESSING_COST")) {
						key.setl_ERR_PROCESSING_COST(msgKey.getKeyValue("l_ERR_PROCESSING_COST"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_MATERIAL_COST")) {
						key.setl_ERR_MATERIAL_COST(msgKey.getKeyValue("l_ERR_MATERIAL_COST"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_OTHER_OVERHEADS")) {
						key.setl_ERR_OTHER_OVERHEADS(msgKey.getKeyValue("l_ERR_OTHER_OVERHEADS"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_NET_AMOUNT")) {
						key.setl_ERR_NET_AMOUNT(msgKey.getKeyValue("l_ERR_NET_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_EXCH_RATE")) {
						key.setl_ERR_EXCH_RATE(msgKey.getKeyValue("l_ERR_EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("h_INSTALL_FLG")) {
						key.seth_INSTALL_FLG(msgKey.getKeyValue("h_INSTALL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_EXPENSE_CLASS_CD")) {
						key.setl_ERR_EXPENSE_CLASS_CD(msgKey.getKeyValue("l_ERR_EXPENSE_CLASS_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_DEPT_CD")) {
						key.setl_ERR_DEPT_CD(msgKey.getKeyValue("l_ERR_DEPT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_PJ_CD")) {
						key.setl_ERR_PJ_CD(msgKey.getKeyValue("l_ERR_PJ_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_SEG_CONTENTS1")) {
						key.setl_ERR_SEG_CONTENTS1(msgKey.getKeyValue("l_ERR_SEG_CONTENTS1"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_SEG_CONTENTS2")) {
						key.setl_ERR_SEG_CONTENTS2(msgKey.getKeyValue("l_ERR_SEG_CONTENTS2"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_SEG_CONTENTS3")) {
						key.setl_ERR_SEG_CONTENTS3(msgKey.getKeyValue("l_ERR_SEG_CONTENTS3"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_SEG_CONTENTS4")) {
						key.setl_ERR_SEG_CONTENTS4(msgKey.getKeyValue("l_ERR_SEG_CONTENTS4"));
					}
					if(msgKeyType.containsKeyColumn("w_COLUMN_FLG")) {
						key.setw_COLUMN_FLG(msgKey.getKeyValue("w_COLUMN_FLG"));
					}
					if(msgKeyType.containsKeyColumn("L_PUCH_ODR_START_DATE")) {
						key.setL_PUCH_ODR_START_DATE(msgKey.getKeyValue("L_PUCH_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("L_JOB_ODR_CD")) {
						key.setL_JOB_ODR_CD(msgKey.getKeyValue("L_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("L_UNIT_COST_TYP")) {
						key.setL_UNIT_COST_TYP(msgKey.getKeyValue("L_UNIT_COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("L_UNIT_COST")) {
						key.setL_UNIT_COST(msgKey.getKeyValue("L_UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("L_PROCESSING_COST")) {
						key.setL_PROCESSING_COST(msgKey.getKeyValue("L_PROCESSING_COST"));
					}
					if(msgKeyType.containsKeyColumn("L_MATERIAL_COST")) {
						key.setL_MATERIAL_COST(msgKey.getKeyValue("L_MATERIAL_COST"));
					}
					if(msgKeyType.containsKeyColumn("L_OTHER_OVERHEADS")) {
						key.setL_OTHER_OVERHEADS(msgKey.getKeyValue("L_OTHER_OVERHEADS"));
					}
					if(msgKeyType.containsKeyColumn("L_NET_AMOUNT")) {
						key.setL_NET_AMOUNT(msgKey.getKeyValue("L_NET_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("L_EXCH_RATE")) {
						key.setL_EXCH_RATE(msgKey.getKeyValue("L_EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("L_PUCH_ODR_QTY")) {
						key.setL_PUCH_ODR_QTY(msgKey.getKeyValue("L_PUCH_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP")) {
						key.setACPT_INSPC_TYP(msgKey.getKeyValue("ACPT_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
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
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("DEAL_STS_FLG")) {
						key.setDEAL_STS_FLG(msgKey.getKeyValue("DEAL_STS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP")) {
						key.setJOB_ODR_STS_TYP(msgKey.getKeyValue("JOB_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE")) {
						key.setJOB_ODR_DLV_DATE(msgKey.getKeyValue("JOB_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("VALUE")) {
						key.setVALUE(msgKey.getKeyValue("VALUE"));
					}
					if(msgKeyType.containsKeyColumn("NAME")) {
						key.setNAME(msgKey.getKeyValue("NAME"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("NON_NO_ITEM_NAME")) {
						key.setNON_NO_ITEM_NAME(msgKey.getKeyValue("NON_NO_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("NON_NO_ITEM_TYP")) {
						key.setNON_NO_ITEM_TYP(msgKey.getKeyValue("NON_NO_ITEM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON")) {
						key.setPUCH_ODR_PERSON(msgKey.getKeyValue("PUCH_ODR_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE")) {
						key.setPUCH_ODR_START_DATE(msgKey.getKeyValue("PUCH_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE")) {
						key.setPUCH_ODR_DLV_DATE(msgKey.getKeyValue("PUCH_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_QTY")) {
						key.setPUCH_ODR_QTY(msgKey.getKeyValue("PUCH_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("NON_NO_ITEM_PUCH_ODR_UNIT")) {
						key.setNON_NO_ITEM_PUCH_ODR_UNIT(msgKey.getKeyValue("NON_NO_ITEM_PUCH_ODR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP")) {
						key.setUNIT_COST_TYP(msgKey.getKeyValue("UNIT_COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST")) {
						key.setUNIT_COST(msgKey.getKeyValue("UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("PROCESSING_COST")) {
						key.setPROCESSING_COST(msgKey.getKeyValue("PROCESSING_COST"));
					}
					if(msgKeyType.containsKeyColumn("MATERIAL_COST")) {
						key.setMATERIAL_COST(msgKey.getKeyValue("MATERIAL_COST"));
					}
					if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS")) {
						key.setOTHER_OVERHEADS(msgKey.getKeyValue("OTHER_OVERHEADS"));
					}
					if(msgKeyType.containsKeyColumn("DISC_AMOUNT")) {
						key.setDISC_AMOUNT(msgKey.getKeyValue("DISC_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_AMOUNT")) {
						key.setPUCH_ODR_AMOUNT(msgKey.getKeyValue("PUCH_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("CONFIRM_DLV_DATE")) {
						key.setCONFIRM_DLV_DATE(msgKey.getKeyValue("CONFIRM_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("INV_CTRL_FLG")) {
						key.setINV_CTRL_FLG(msgKey.getKeyValue("INV_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_COMMENT")) {
						key.setPUCH_ODR_COMMENT(msgKey.getKeyValue("PUCH_ODR_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("RATE_JUDGE_DATE")) {
						key.setRATE_JUDGE_DATE(msgKey.getKeyValue("RATE_JUDGE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_RATE")) {
						key.setEXCH_RATE(msgKey.getKeyValue("EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("TAX_RATE_1")) {
						key.setTAX_RATE_1(msgKey.getKeyValue("TAX_RATE_1"));
					}
					if(msgKeyType.containsKeyColumn("TAX_RATE_2")) {
						key.setTAX_RATE_2(msgKey.getKeyValue("TAX_RATE_2"));
					}
					if(msgKeyType.containsKeyColumn("TAX_RATE_3")) {
						key.setTAX_RATE_3(msgKey.getKeyValue("TAX_RATE_3"));
					}
					if(msgKeyType.containsKeyColumn("NET_AMOUNT")) {
						key.setNET_AMOUNT(msgKey.getKeyValue("NET_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT_1")) {
						key.setTAX_AMOUNT_1(msgKey.getKeyValue("TAX_AMOUNT_1"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT_2")) {
						key.setTAX_AMOUNT_2(msgKey.getKeyValue("TAX_AMOUNT_2"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT_3")) {
						key.setTAX_AMOUNT_3(msgKey.getKeyValue("TAX_AMOUNT_3"));
					}
					if(msgKeyType.containsKeyColumn("AMOUNT_INCLUDE_TAX")) {
						key.setAMOUNT_INCLUDE_TAX(msgKey.getKeyValue("AMOUNT_INCLUDE_TAX"));
					}
					if(msgKeyType.containsKeyColumn("HOME_CUR_AMOUNT")) {
						key.setHOME_CUR_AMOUNT(msgKey.getKeyValue("HOME_CUR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD")) {
						key.setTAX_CD(msgKey.getKeyValue("TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP")) {
						key.setTAX_ROUND_TYP(msgKey.getKeyValue("TAX_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("NON_NO_ITEM_FLG")) {
						key.setNON_NO_ITEM_FLG(msgKey.getKeyValue("NON_NO_ITEM_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ACCT_CD")) {
						key.setACCT_CD(msgKey.getKeyValue("ACCT_CD"));
					}
					if(msgKeyType.containsKeyColumn("DEPT_CD")) {
						key.setDEPT_CD(msgKey.getKeyValue("DEPT_CD"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CD")) {
						key.setPJ_CD(msgKey.getKeyValue("PJ_CD"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS1")) {
						key.setSEG_CONTENTS1(msgKey.getKeyValue("SEG_CONTENTS1"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS2")) {
						key.setSEG_CONTENTS2(msgKey.getKeyValue("SEG_CONTENTS2"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS3")) {
						key.setSEG_CONTENTS3(msgKey.getKeyValue("SEG_CONTENTS3"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS4")) {
						key.setSEG_CONTENTS4(msgKey.getKeyValue("SEG_CONTENTS4"));
					}
					if(msgKeyType.containsKeyColumn("ASP_INSTALL_FLG")) {
						key.setASP_INSTALL_FLG(msgKey.getKeyValue("ASP_INSTALL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("TIME_CTRL")) {
						key.setTIME_CTRL(msgKey.getKeyValue("TIME_CTRL"));
					}
					if(msgKeyType.containsKeyColumn("PVC2BUSINESSNAME")) {
						key.setPVC2BUSINESSNAME(msgKey.getKeyValue("PVC2BUSINESSNAME"));
					}
					if(msgKeyType.containsKeyColumn("PVC2OUTPUTPATH")) {
						key.setPVC2OUTPUTPATH(msgKey.getKeyValue("PVC2OUTPUTPATH"));
					}
					if(msgKeyType.containsKeyColumn("PVC2OUTPUTNAME")) {
						key.setPVC2OUTPUTNAME(msgKey.getKeyValue("PVC2OUTPUTNAME"));
					}
					if(msgKeyType.containsKeyColumn("PVC2LOGMODE")) {
						key.setPVC2LOGMODE(msgKey.getKeyValue("PVC2LOGMODE"));
					}
					if(msgKeyType.containsKeyColumn("PVC2OUTPUTMODE")) {
						key.setPVC2OUTPUTMODE(msgKey.getKeyValue("PVC2OUTPUTMODE"));
					}
					if(msgKeyType.containsKeyColumn("PVC2USERID")) {
						key.setPVC2USERID(msgKey.getKeyValue("PVC2USERID"));
					}
					if(msgKeyType.containsKeyColumn("PVC2PLANTCD")) {
						key.setPVC2PLANTCD(msgKey.getKeyValue("PVC2PLANTCD"));
					}
					if(msgKeyType.containsKeyColumn("PVC2TAXID")) {
						key.setPVC2TAXID(msgKey.getKeyValue("PVC2TAXID"));
					}
					if(msgKeyType.containsKeyColumn("VEND_DECIMAL_FIG")) {
						key.setVEND_DECIMAL_FIG(msgKey.getKeyValue("VEND_DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("PNUMTAXOUTAMOUNT")) {
						key.setPNUMTAXOUTAMOUNT(msgKey.getKeyValue("PNUMTAXOUTAMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PNUMTAXAMOUNT")) {
						key.setPNUMTAXAMOUNT(msgKey.getKeyValue("PNUMTAXAMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PNUMEXTERNALTAXSALESAMOUNT")) {
						key.setPNUMEXTERNALTAXSALESAMOUNT(msgKey.getKeyValue("PNUMEXTERNALTAXSALESAMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PNUMINTERNALTAXSALESAMOUNT")) {
						key.setPNUMINTERNALTAXSALESAMOUNT(msgKey.getKeyValue("PNUMINTERNALTAXSALESAMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PNUMTAXFREESALESAMOUNT")) {
						key.setPNUMTAXFREESALESAMOUNT(msgKey.getKeyValue("PNUMTAXFREESALESAMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PNUMEXTERNALTAXAMOUNT")) {
						key.setPNUMEXTERNALTAXAMOUNT(msgKey.getKeyValue("PNUMEXTERNALTAXAMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PNUMINTERNALTAXAMOUNT")) {
						key.setPNUMINTERNALTAXAMOUNT(msgKey.getKeyValue("PNUMINTERNALTAXAMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PVC2ERRCD")) {
						key.setPVC2ERRCD(msgKey.getKeyValue("PVC2ERRCD"));
					}
					if(msgKeyType.containsKeyColumn("PNUMSTATUS")) {
						key.setPNUMSTATUS(msgKey.getKeyValue("PNUMSTATUS"));
					}
					if(msgKeyType.containsKeyColumn("DEPT_NAME")) {
						key.setDEPT_NAME(msgKey.getKeyValue("DEPT_NAME"));
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
