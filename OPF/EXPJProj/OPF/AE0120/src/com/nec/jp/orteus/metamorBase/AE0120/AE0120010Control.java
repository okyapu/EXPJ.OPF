/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0120/src/com/nec/jp/orteus/metamorBase/AE0120/AE0120010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0120;

import com.nec.jp.orteus.metamorBase.AE0120.*;
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

//{{user_implement_code_import
	// TODO: ������import�p�b�P�[�W���L�q���Ă�������
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.math.BigDecimal;

import com.nec.jp.orteus.expj.flash.Kind;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.metamorBase.common02.CommonOd.ApsComException;
import com.nec.jp.orteus.metamorBase.common02.CommonOd.CommonOd;
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
import com.nec.jp.orteus.metamorBase.common04.sysdata.MyCompanyControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.MyCompanyStruct;
import com.nec.jp.orteus.metamorBase.common04.sysdata.TaxNameControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.TaxNameStruct;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.LotCtrl;
import com.nec.jp.orteus.expj.lot.BizCommon;
import com.nec.jp.orteus.expj.pr.rcvissue.process.ValidateWh;
import com.nec.jp.orteus.expj.lot.BizCommon;
import com.nec.jp.orteus.expj.arap.ArApNumbering;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AE0120010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.24 $ $Date: 2015/11/16 05:10:34 $
 *
 */
//}}user_implement_code_header

public class AE0120010Control
{

	//////////////////////////////
	// �A�N�Z�T���\�b�h�����`���܂�
	// Business�I�u�W�F�N�g�A�N�Z�T���\�b�h
	private Business business;
	public Business getBusiness() { return this.business; }
	public void setBusiness( Business obj ) { this.business = obj; }

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
	/** ���i�ďo���̕ԋp�l�i�[���X�g */
	protected List _resultList;	

	private String lotCtrl = "";
	/** ���[�j���O�i�[���X�g */
	private List _errorList = new ArrayList();
	protected List list;											// ���ʃ��X�g�̃C���X�^���X
	public List getList() { return this.list; }						// ���X�g��Ԃ��܂��B
	public void setList(List listname) { this.list = listname; }	// ���X�g���Z�b�g���܂��B
	public int getListsize() {										// ���X�g�^�̃T�C�Y��Ԃ��܂��B
		int nret = 0;
		if( this.list != null ) {nret = this.list.size();}
		return nret;
	}
//	public Object getListvalue(int x) { return this.list.get(x); }	// ���X�g�̒l��Ԃ��܂��B
	public AE0120010Struct getListvalue(int x) { return (AE0120010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AE0120010Struct getStruct() { return this.struct; }	// Struct�̒l��Ԃ��܂��B
	public AE0120010Struct createStruct() { return new AE0120010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AE0120010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������

	private String actionTyp = "1"; //�������
	private String slipTyp = "79";  //�`�[���
	/** ��ʑJ�ڃL�[(�w���ԕi�ԍ�) */
	private String _puchOdrCd;
  
	/**
	 * ��ʑJ�ڃL�[(�w���ԕi�ԍ�)�擾
	 * @return �w���ԕi�ԍ�
	 */
	public String getPuchOdrCd() {
		return _puchOdrCd;
	}

	/**
	 * ��ʑJ�ڃL�[(�w���ԕi�ԍ�)�ݒ�
	 * @param cd �w���ԕi�ԍ�
	 */
	public void setPuchOdrCd(String cd) {
		_puchOdrCd = cd;
	}

	/** [����]��� */
	private MyCompanyStruct _myCompanyStruct = new MyCompanyStruct();
	
	/** [�Ŗ�]��� */
	private TaxNameStruct _taxNameStruct = new TaxNameStruct();
	
	/** [�M��]��� */
	private HomeCurStruct _homeCurStruct = new HomeCurStruct();
    // �����ꍀ�ڎ擾�Ή�
    ResourceBundle resource = CoreTools.getResourceBundle( "OrteusUserDic", CoreTools.getLocale(sysUSER_CD));
	/** [�R���{�{�b�N�X�f�[�^]���i�P���敪�j */
	private ComboStruct _unitCostTypStruct = new ComboStruct();
	/** [�R���{�{�b�N�X�f�[�^]���i���i�敪�j */
	private ComboStruct _productTypStruct = new ComboStruct();
	
	/** ���F */
	String aprInspcif = "";	
	private PrivateConfig privateConfig;
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
	/**
	 * Struct�̒l���Z�b�g���܂��B
	 * @param s ���������f�[�^
	 */
	private void setStructSystemData(AE0120010Struct s) {
		s.setsOraganization_CD(struct.getsOrganization_CD());
		s.setsSysdate(struct.getsSysdate());
		s.setsUser_ID(struct.getsUser_ID());
	}
	/**
	 * ��ʂ̑S���ڂ����������܂��B
	 */
	private void initializeAll() 
			throws SQLException, DataNotFoundException, FoundationException {
		
		struct.setPUCH_ODR_CD(null);
		struct.seth_PUCH_ODR_CD(null);
		
		initializeDetail();
	}
	
	/**
	 * ��ʂ̏ڍ׍��ڂ����������܂��B
	 */
	private void initializeDetail() 
			throws SQLException, DataNotFoundException, FoundationException {
		
		struct.setVEND_CD(null);
		struct.setVEND_ANAME(null);
		struct.setITEM_CD(null);
		struct.setITEM_NAME(null);
		struct.setJOB_ODR_CD(null);
		struct.setJOB_ODR_DETAIL_NO("0");
		struct.setc_NON_NO_ITEM_FLG(null);
		struct.setPUCH_RTN_QTY("0");
		struct.setSTOCK_UNIT(null);
		// [�Ɩ����t]���𕔕i���擾
		DateCtrlStruct dcs = DateCtrlControl.getData(conn, sysPLANT_CD);
		struct.setPUCH_RTN_DATE(dcs.getBUSINESS_OPR_DATE());
		struct.setWH_CD(null);
		struct.setWH_NAME(null);
		struct.setPUCH_RTN_COMMENT(null);
		struct.setLOT_NO(null);
		struct.setVEND_LOT_NO(null);
		struct.setPUCH_ODR_PERSON(sysUSER_CD);
		struct.setUSER_NAME(null);
		
		//���i�敪
		struct.setPRODUCT_TYP("3");
		
		struct.setUNIT_COST_TYP("1");
		struct.setUNIT_COST("0");
		struct.setPROCESSING_COST("0");
		struct.setMATERIAL_COST("0");
		struct.setOTHER_OVERHEADS("0");
		struct.setPUCH_ODR_AMOUNT("0");
		struct.setDISC_AMOUNT("0");
		struct.setNET_AMOUNT("0");
		struct.setTAX_RATE_1("0");
		struct.setTAX_RATE_2("0");
		struct.setTAX_RATE_3("0");
		struct.setTAX_AMOUNT_1("0");
		struct.setTAX_AMOUNT_2("0");
		struct.setTAX_AMOUNT_3("0");
		struct.setHOME_CUR_AMOUNT("0");
		struct.setEXCH_RATE("1");
		struct.setAMOUNT_INCLUDE_TAX("0");
		struct.setINV_CTRL_FLG(null);
		struct.setTAX_CD(null);
		struct.setTAX_ROUND_TYP(Kind.FLOOR);
		struct.setROUND_TYP(Kind.FLOOR);
		struct.setMODIFY_COUNT(null);
		struct.setVEND_CUR_UNIT(null);
		struct.setVEND_DECIMAL_FIG("4");
		
		struct.setr1_FILTER("true");
		
		struct.setSelectUnitCostFlag("false");
		
		// ���|�Ǘ����C���X�g�[������Ă���ꍇ�A���N���x���擾
		AE0120010Struct readStruct = new AE0120010Struct();
		List installOptionsList = entity.mSYS_INSTALL_OPTIONS.read(conn, readStruct);
		if (installOptionsList.size() > 0) {
			AE0120010Struct installOptionsStruct = (AE0120010Struct)installOptionsList.get(0);
			struct.setINSTALL_FLG(installOptionsStruct.getINSTALL_FLG());
		} else {
			struct.setINSTALL_FLG("0");
		}
		
		// ���|�Ǘ����C���X�g�[������Ă���ꍇ�A���N���x���擾
		if ("1".equals(struct.getINSTALL_FLG())) {
			List debtCtrlList = entity.mSYS_DEBT_CTRL.read(conn, readStruct);
			if (debtCtrlList.size() > 0) {
				AE0120010Struct debtCtrlStruct = (AE0120010Struct)debtCtrlList.get(0);
				struct.setTHIS_MONTH(debtCtrlStruct.getTHIS_MONTH());
			} else {
				setErrorMessage("AE00145");
			}
		}
		
		list = null;
		
		readStatus = INITIAL;
	}
	
	// �ۊǋ�ʓ��o�ɒǉ�
	private void addRcvIssue(
			IDbConnection conn, 
			AE0120010Struct formStruct, 
			AE0120010Struct puchOdrRtnRsltStruct, 
			String rcvIssueBeforeQty, 
			String rcvIssueQty, 
			String rcvIssueAterQty, 
			String ctrlCd, 
			int mode) 
			throws ParseException, DataNotFoundException, SQLException, FoundationException {
		
		// [�ۊǋ�ʓ��o��]�̒ǉ�
		AE0120010Struct insertStruct = new AE0120010Struct();
		setStructSystemData(insertStruct);
		
		// �ǉ����e�ݒ�
		insertStruct.setRCV_ISSUE_CTRL_CD(ctrlCd);  // ���o�ɊǗ��ԍ�
		insertStruct.setRCV_ISSUE_TYP("1");  // ���o�ɋ敪
		if (mode == 1) {
			insertStruct.setITEM_CD(formStruct.getITEM_CD());  // �i�ڔԍ�
			insertStruct.setPLANT_CD(sysPLANT_CD);  // �H��R�[�h
			insertStruct.setWH_CD(formStruct.getWH_CD());  // �ۊǋ�R�[�h
			insertStruct.setJOB_ODR_CD(formStruct.getJOB_ODR_CD());  // ����
			insertStruct.setJOB_ODR_DETAIL_NO("0");  // ���Ԏ}��
			insertStruct.setVEND_LOT_NO(formStruct.getVEND_LOT_NO());  // ���[�J���b�g�ԍ�
			insertStruct.setLOT_NO(formStruct.getLOT_NO());  // �݌Ƀ��b�g�ԍ�
			insertStruct.setRCV_ISSUE_DATE(formStruct.getPUCH_RTN_DATE());  // ���o�ɔN����
			insertStruct.setRCV_ISSUE_GNR_TYP("19");  // ���o�ɔ����敪
			insertStruct.setCOMPANY_CD(_myCompanyStruct.getCOMPANY_CD());  // ��ЃR�[�h
			insertStruct.setVEND_CD(formStruct.getVEND_CD());  // �����R�[�h
		} else {
			insertStruct.setITEM_CD(puchOdrRtnRsltStruct.getITEM_CD());  // �i�ڔԍ�
			insertStruct.setPLANT_CD(puchOdrRtnRsltStruct.getPLANT_CD());  // �H��R�[�h
			insertStruct.setWH_CD(puchOdrRtnRsltStruct.getWH_CD());  // �ۊǋ�R�[�h
			insertStruct.setJOB_ODR_CD(puchOdrRtnRsltStruct.getJOB_ODR_CD());  // ����
			insertStruct.setJOB_ODR_DETAIL_NO(puchOdrRtnRsltStruct.getJOB_ODR_DETAIL_NO());  // ���Ԏ}��
			insertStruct.setVEND_LOT_NO(puchOdrRtnRsltStruct.getVEND_LOT_NO());  // ���[�J���b�g�ԍ�
			insertStruct.setLOT_NO(puchOdrRtnRsltStruct.getLOT_NO());  // �݌Ƀ��b�g�ԍ�
			if (mode == 2) {
				insertStruct.setRCV_ISSUE_DATE(puchOdrRtnRsltStruct.getPUCH_RTN_DATE());  // ���o�ɔN����
			} else {
				// �Ɩ��^�p���擾
				// DateCtrlStruct dcs = DateCtrlControl.getData(conn, sysPLANT_CD);
				insertStruct.setRCV_ISSUE_DATE(puchOdrRtnRsltStruct.getPUCH_RTN_DATE());  // ���o�ɔN����
			}
			insertStruct.setRCV_ISSUE_GNR_TYP("11");  // ���o�ɔ����敪
			insertStruct.setCOMPANY_CD(puchOdrRtnRsltStruct.getCOMPANY_CD());  // ��ЃR�[�h
			insertStruct.setVEND_CD(puchOdrRtnRsltStruct.getVEND_CD());  // �����R�[�h
		}
		insertStruct.setACPT_NO("0");  // �����
		insertStruct.setACPT_RSLT_CRCT_NO("0");  // ������ђ�����
		insertStruct.setINSPEC_RSLT_CRCT_NO("0");  // �������ђ�����
		insertStruct.setPARTIAL_PRD_NO("0");  // �����
		insertStruct.setOPR_RSLT_CRCT_NO("0");  // ��Ǝ��ђ�����
		insertStruct.setRCV_ISSUE_BEFORE_QTY(rcvIssueBeforeQty);  // ���o�ɑO�݌ɐ�
		insertStruct.setRCV_ISSUE_QTY(rcvIssueQty);  // ���o�ɐ�
		insertStruct.setRCV_ISSUE_AFTER_QTY(rcvIssueAterQty);  // ���o�Ɍ�݌ɐ�
		insertStruct.setRCV_ISSUE_AMOUNT("0");  // ���o�ɋ��z
		insertStruct.setRCV_ISSUE_ODD_QTY("0");  // ���o�ɒ[��
		insertStruct.setSTOCK_UPD_TYP("2");  // �݌ɍX�V�敪
		insertStruct.setRCV_ISSUE_CMPLT_FLG("0");  // ���o�Ɋ����t���O
		insertStruct.setCONS_TYP("0");  // �x���敪
        //��ЃR�[�h
		if("".equals(insertStruct.getCOMPANY_CD()) || insertStruct.getCOMPANY_CD() == null){
			insertStruct.setCOMPANY_CD(SystemInformation.getSysMyCompanyCd());
		}
		entity.mT_RCV_ISSUE.create(conn, insertStruct);		

	}

    // ���b�g�i�ڍ݌ɓo�^�E�X�V����
    private void addLotStock(
            IDbConnection conn, 
            AE0120010Struct formStruct, 
            AE0120010Struct puchOdrRtnRsltStruct, 
            String ctrlCd, 
            int mode) 
            throws ParseException, DataNotFoundException, SQLException, FoundationException {
        
        String rcvIssueBeforeQty = "0";//���b�g�ʕi�ڍ݌ɂ̕ԕi�O�莝�݌ɐ�
        String rcvIssueQty = "0";//�ԕi��
        String rcvIssueAterQty = "0";//���b�g�ʕi�ڍ݌ɂ̕ԕi��莝�݌ɐ�
        
        // [���b�g�ʕi�ڍ݌�]�̌���
        List stockList = null;
        
        if (mode == 1) {
            // �o�^���[�h
            stockList = entity.mT_LOT_STOCK.read(conn, formStruct);
        } else {
            // �폜���[�h
            stockList = entity.mT_LOT_STOCK.read(conn, puchOdrRtnRsltStruct);
        }
        
        if (stockList.isEmpty()) {
        	//���b�g�ʕi�ڍ݌ɂ̕ԕi�O�莝�݌ɐ�
            rcvIssueBeforeQty = "0";
            if (mode == 1) {
            	//�ԕi��
                rcvIssueQty = Calculate.multiply(formStruct.getPUCH_RTN_QTY(), "-1");
            } else {
            	//�ԕi��
                rcvIssueQty = puchOdrRtnRsltStruct.getPUCH_RTN_QTY();
            }
            //���b�g�ʕi�ڍ݌ɂ̕ԕi��莝�݌ɐ�
            rcvIssueAterQty = rcvIssueQty; 
        } else {	
            AE0120010Struct stockStruct = (AE0120010Struct)(stockList.get(0));
            //���b�g�ʕi�ڍ݌ɂ̕ԕi�O�莝�݌ɐ�
            rcvIssueBeforeQty = stockStruct.getSTOCK_ON_HAND_QTY();
            
            // �ǉ����[�h
            if (mode == 1) {
                rcvIssueQty = Calculate.multiply(formStruct.getPUCH_RTN_QTY(), "-1");
                //���b�g�ʕi�ڍ݌ɂ̕ԕi��莝�݌ɐ�
                rcvIssueAterQty = Calculate.subtract(
                        stockStruct.getSTOCK_ON_HAND_QTY(), formStruct.getPUCH_RTN_QTY());
            } else {
                rcvIssueQty = puchOdrRtnRsltStruct.getPUCH_RTN_QTY();
                //���b�g�ʕi�ڍ݌ɂ̕ԕi��莝�݌ɐ�
                rcvIssueAterQty = Calculate.add(
                        stockStruct.getSTOCK_ON_HAND_QTY(), puchOdrRtnRsltStruct.getPUCH_RTN_QTY());
            } 
        }
        
        // ���b�g�i�ڍ݌ɓo�^�E�X�V�������s���B
        BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());

        List updateLotStockList = bc.excUpdateLotStockFd(ctrlCd, "");

 
        if(bc.getResultStatus().intValue() == 3){
            if(updateLotStockList != null && updateLotStockList.size() > 0){
                setErrorMessage((String)updateLotStockList.get(0));
                return;
            }
        }

/*        // �v�Z��� ���b�g�ʕi�ڍ݌ɂ̎莝�݌ɐ����}�C�i�X�̏ꍇ�A�G���[���b�Z�[�W
        if (Calculate.compare(rcvIssueAterQty, "0") == -1) {
        	
            // �}�C�i�X�X�V�̏ꍇ�A�܂��́A�v���X�X�V�Łu�ԕi���ۊǋ�R�[�h�v��[�w���ԕi����]."�ԕi���ۊǋ�R�[�h"���قȂ�ꍇ
            if (mode != 2 || (mode == 2 && (puchOdrRtnRsltStruct.getWH_CD().equals(formStruct.getWH_CD()) == false))) {
            	setErrorMessage("AE00168");
            	return;
            }
        }*/
    }


	// �i�ڍ݌ɍX�V����
	private void updateItemStock(
			IDbConnection conn, 
			AE0120010Struct formStruct, 
			AE0120010Struct puchOdrRtnRsltStruct, 
			String ctrlCd, 
			int mode) 
			throws ParseException, DataNotFoundException, SQLException, FoundationException {
		
		String rcvIssueBeforeQty = "0";
		String rcvIssueQty = "0";
		String rcvIssueAterQty = "0";
		
		// [�ۊǋ�ʕi�ڍ݌�]�̌���
		List stockList = null;
		
		if (mode == 1) {
			// �o�^���[�h
			stockList = entity.mT_ITEM_STOCK.read(conn, formStruct);
		} else {
			// �폜���[�h
			stockList = entity.mT_ITEM_STOCK.read(conn, puchOdrRtnRsltStruct);
		}
		
		if (stockList.isEmpty()) {
			
			// �i�ڍ݌ɒǉ�
			rcvIssueBeforeQty = "0";
			if (mode == 1) {
				rcvIssueQty = Calculate.multiply(formStruct.getPUCH_RTN_QTY(), "-1");
			} else {
				rcvIssueQty = puchOdrRtnRsltStruct.getPUCH_RTN_QTY();
			}
			rcvIssueAterQty = rcvIssueQty;
			
			AE0120010Struct insertStruct = new AE0120010Struct();
			setStructSystemData(insertStruct);
			
			if (mode == 1) {
				insertStruct.setITEM_CD(formStruct.getITEM_CD());  // �i�ڔԍ�
				insertStruct.setWH_CD(formStruct.getWH_CD());  // �ԕi���ۊǋ�R�[�h
			} else {
				insertStruct.setITEM_CD(puchOdrRtnRsltStruct.getITEM_CD());  // �i�ڔԍ�
				insertStruct.setWH_CD(puchOdrRtnRsltStruct.getWH_CD());  // �ԕi���ۊǋ�R�[�h
			}
			insertStruct.setPLANT_CD(sysPLANT_CD);  // �H��R�[�h
			insertStruct.setSTOCK_ON_HAND_QTY(rcvIssueAterQty);  // �i�ڕʎ莝�݌ɐ�
			
			entity.mT_ITEM_STOCK.create(conn, insertStruct);
			
		} else {
			
			// �i�ڍ݌ɍX�V
			AE0120010Struct stockStruct = (AE0120010Struct)(stockList.get(0));
			rcvIssueBeforeQty = stockStruct.getSTOCK_ON_HAND_QTY();
			
			// �ǉ����[�h
			if (mode == 1) {
				rcvIssueQty = Calculate.multiply(formStruct.getPUCH_RTN_QTY(), "-1");
				rcvIssueAterQty = Calculate.subtract(
						stockStruct.getSTOCK_ON_HAND_QTY(), formStruct.getPUCH_RTN_QTY());
			} else {
				rcvIssueQty = puchOdrRtnRsltStruct.getPUCH_RTN_QTY();
				rcvIssueAterQty = Calculate.add(
						stockStruct.getSTOCK_ON_HAND_QTY(), puchOdrRtnRsltStruct.getPUCH_RTN_QTY());
			}
			
			AE0120010Struct updateStruct = new AE0120010Struct();
			setStructSystemData(updateStruct);
			if (mode == 1) {
				updateStruct.setITEM_CD(formStruct.getITEM_CD());
				updateStruct.setWH_CD(formStruct.getWH_CD());
			} else {
				updateStruct.setITEM_CD(puchOdrRtnRsltStruct.getITEM_CD());
				updateStruct.setWH_CD(puchOdrRtnRsltStruct.getWH_CD());
			}
			updateStruct.setSTOCK_ON_HAND_QTY(rcvIssueAterQty);  // �i�ڕʎ莝�݌ɐ�
			
			entity.mT_ITEM_STOCK.update(conn, updateStruct);
			
		}
		
		// �v�Z��̕i�ڎ莝�݌ɐ����}�C�i�X�̏ꍇ�A���[�j���O
		if (Calculate.compare(rcvIssueAterQty, "0") == -1) {
			// �}�C�i�X�X�V�̏ꍇ�A�܂��́A�v���X�X�V�Łu�ԕi���ۊǋ�R�[�h�v��
			// [�w���ԕi����]."�ԕi���ۊǋ�R�[�h"���قȂ�ꍇ
			if (mode != 2 || (mode == 2 
					&& (puchOdrRtnRsltStruct.getWH_CD().equals(formStruct.getWH_CD()) == false))) {
				setWarningMessage("AE00154");
			}
		}
			
		// [�ۊǋ�ʓ��o��]�̒ǉ�
		addRcvIssue(conn, formStruct, puchOdrRtnRsltStruct, 
				rcvIssueBeforeQty, rcvIssueQty, rcvIssueAterQty, ctrlCd, mode);
		
	}
	
	// ���ԍ݌ɍX�V����
	private void updateJobOdrCdStock(
			IDbConnection conn, 
			AE0120010Struct formStruct, 
			AE0120010Struct puchOdrRtnRsltStruct, 
			String ctrlCd, 
			int mode) 
			throws ParseException, DataNotFoundException, SQLException, FoundationException {
		
		String rcvIssueBeforeQty = "0";
		String rcvIssueQty = "0";
		String rcvIssueAterQty = "0";
		
		// [�ۊǋ�ʐ��ԍ݌�]�̌���
		
		List stockList = null;
		if (mode == 1) {
			stockList = entity.mT_JOB_ODR_CD_STOCK.read(conn, formStruct);
		} else {
			stockList = entity.mT_JOB_ODR_CD_STOCK.read(conn, puchOdrRtnRsltStruct);
		}
		
		if (stockList.isEmpty()) {
			// ���ԍ݌ɒǉ�
			rcvIssueBeforeQty = "0";
			if (mode == 1) {
				rcvIssueQty = Calculate.multiply(formStruct.getPUCH_RTN_QTY(), "-1");
			} else {
				rcvIssueQty = puchOdrRtnRsltStruct.getPUCH_RTN_QTY();
			}
			rcvIssueAterQty = rcvIssueQty;
			
			AE0120010Struct insertStruct = new AE0120010Struct();
			setStructSystemData(insertStruct);
			
			if (mode == 1) {
				insertStruct.setJOB_ODR_CD(formStruct.getJOB_ODR_CD());  // ����
				insertStruct.setITEM_CD(formStruct.getITEM_CD());  // �i�ڔԍ�
				insertStruct.setWH_CD(formStruct.getWH_CD());  // �ԕi���ۊǋ�R�[�h
			} else {
				insertStruct.setJOB_ODR_CD(puchOdrRtnRsltStruct.getJOB_ODR_CD());  // ����
				insertStruct.setITEM_CD(puchOdrRtnRsltStruct.getITEM_CD());  // �i�ڔԍ�
				insertStruct.setWH_CD(puchOdrRtnRsltStruct.getWH_CD());  // �ԕi���ۊǋ�R�[�h
			}
			insertStruct.setPLANT_CD(sysPLANT_CD);  // �H��R�[�h
			insertStruct.setSTOCK_ON_HAND_QTY(rcvIssueAterQty);  // ���ԕʎ莝�݌ɐ�
			
			entity.mT_JOB_ODR_CD_STOCK.create(conn, insertStruct);
			
		} else {
			
			// ���ԍ݌ɍX�V
			AE0120010Struct stockStruct = (AE0120010Struct)(stockList.get(0));
			rcvIssueBeforeQty = stockStruct.getSTOCK_ON_HAND_QTY();
			if (mode == 1) {
				rcvIssueQty = Calculate.multiply(formStruct.getPUCH_RTN_QTY(), "-1");
				rcvIssueAterQty = Calculate.subtract(
						stockStruct.getSTOCK_ON_HAND_QTY(), formStruct.getPUCH_RTN_QTY());
			} else {
				rcvIssueQty = puchOdrRtnRsltStruct.getPUCH_RTN_QTY();
				rcvIssueAterQty = Calculate.add(
						stockStruct.getSTOCK_ON_HAND_QTY(), puchOdrRtnRsltStruct.getPUCH_RTN_QTY());
			}
			
			AE0120010Struct updateStruct = new AE0120010Struct();
			setStructSystemData(updateStruct);
			
			if (mode == 1) {
				updateStruct.setJOB_ODR_CD(formStruct.getJOB_ODR_CD());  // ����
				updateStruct.setITEM_CD(formStruct.getITEM_CD());  // �i�ڔԍ�
				updateStruct.setWH_CD(formStruct.getWH_CD());  // �ԕi���ۊǋ�R�[�h
			} else {
				updateStruct.setJOB_ODR_CD(puchOdrRtnRsltStruct.getJOB_ODR_CD());  // ����
				updateStruct.setITEM_CD(puchOdrRtnRsltStruct.getITEM_CD());  // �i�ڔԍ�
				updateStruct.setWH_CD(puchOdrRtnRsltStruct.getWH_CD());  // �ԕi���ۊǋ�R�[�h
			}
			
			updateStruct.setSTOCK_ON_HAND_QTY(rcvIssueAterQty);  // ���ԕʎ莝�݌ɐ�
			
			entity.mT_JOB_ODR_CD_STOCK.update(conn, updateStruct);
		}
		
		// �v�Z��̕i�ڎ莝�݌ɐ����}�C�i�X�̏ꍇ�A���[�j���O
		if (Calculate.compare(rcvIssueAterQty, "0") == -1) {
			// �}�C�i�X�X�V�̏ꍇ�A�܂��́A�v���X�X�V�Łu�ԕi���ۊǋ�R�[�h�v��
			// [�w���ԕi����]."�ԕi���ۊǋ�R�[�h"���قȂ�ꍇ
			if (mode != 2 || (mode == 2 
					&& (puchOdrRtnRsltStruct.getWH_CD().equals(formStruct.getWH_CD()) == false))) {
				setWarningMessage("AE00154");
			}
		}
		
		// [�ۊǋ�ʓ��o��]�̒ǉ�
		addRcvIssue(conn, formStruct, puchOdrRtnRsltStruct, 
				rcvIssueBeforeQty, rcvIssueQty, rcvIssueAterQty, ctrlCd, mode);
				
	}
	
	// �݌ɍX�V����
	private void updateStock(
			IDbConnection conn, 
			AE0120010Struct formStruct, 
			AE0120010Struct puchOdrRtnRsltStruct, 
			int mode) 
			throws ParseException, DataNotFoundException, SQLException, FoundationException, 
					ExpjException {
		
		String rcvIssueBeforeQty = "0";
		String rcvIssueQty = "0";
		String rcvIssueAterQty = "0";
		
		// ���o�ɊǗ��ԍ��̔�
		String ctrlCd = null;
		Numbering numbering = new Numbering(
								conn,
								Numbering.ISSUE_CD, 
								getsysUSER_CD(), 
								this.sp.getProcId(), 
								sysPLANT_CD);
		try {
			ctrlCd = numbering.getNo();
			if (ctrlCd == null) {
				ExpjMessage emsg = new ExpjMessage("AE00152");
				throw new FoundationException(
								"AE0120010Control",
								"controlInsert()",
								emsg.getMessage(CoreTools.getLocale(this.getsysUSER_CD())));
			}
		} catch(FoundationException ex) {
			// �o�^�������s�F���o�ɊǗ��ԍ��i�o�Ɂj�̍̔ԂɎ��s���܂���
			setErrorMessage("AE00152");
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(ex, emsg);
			throw ee;
		}
		
		if (formStruct.getJOB_ODR_CD() == null || "".equals(formStruct.getJOB_ODR_CD())) {
			// �i�ڍ݌ɍX�V
			updateItemStock(conn, formStruct, puchOdrRtnRsltStruct, ctrlCd, mode);
			
			// �i�ڑ��݃`�F�b�N
			AE0120010Struct itemStruct = null;
			List itemList = entity.mM_ITEM.read(conn, struct);
			//�u�i�ڔԍ��v��Null�ł͂Ȃ��̏ꍇ
			if ("".equals(struct.getITEM_CD()) == false) {
				if (itemList.isEmpty()) {
					// �G���[
					setErrorMessage("AE00118");
					setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
				} else {
					itemStruct = (AE0120010Struct) (itemList.get(0));
				}
			}
			if("true".equals(lotCtrl) && "1".equals(itemStruct.getLOT_CTRL_FLG())){
		        //���b�g�i�ڍ݌ɓo�^�E�X�V�������s���B
		        addLotStock(conn, formStruct, puchOdrRtnRsltStruct, ctrlCd, mode);
				// �G���[������ΏI��
				if (msgStruct.hasError()) {
					return;
				}
			}
		} else {
			// ���ԍ݌ɍX�V
			updateJobOdrCdStock(conn, formStruct, puchOdrRtnRsltStruct, ctrlCd, mode);
		}

	}
	
	// [�w���ԕi����]�̍X�V
	private void updatePuchOdrRtnRslt(IDbConnection conn, AE0120010Struct s, 
			AE0120010Struct puchOdrRtnRsltStruct, 
			String puchOdrCd, int mode) 
			throws ParseException, DataNotFoundException, SQLException, FoundationException, 
					ExpjException {
		
		if (mode == 1 || mode == 2) {
			
			// [�w���ԕi����]�̒ǉ�
			// �ǉ����e�ݒ�
			AE0120010Struct updateStruct = new AE0120010Struct();
			setStructSystemData(updateStruct);
			
			updateStruct.setPUCH_ODR_CD(puchOdrCd);  // �����ԍ�
			if (mode == 1) {
				updateStruct.setCOMPANY_CD(_myCompanyStruct.getCOMPANY_CD());  // ��ЃR�[�h
				updateStruct.setVEND_CD(s.getVEND_CD());  // �����R�[�h
				updateStruct.setPLANT_CD(sysPLANT_CD);  // �H��R�[�h
				updateStruct.setITEM_CD(s.getITEM_CD());  // �i�ڔԍ�
				updateStruct.setJOB_ODR_CD(s.getJOB_ODR_CD());  // ����
				updateStruct.setJOB_ODR_DETAIL_NO("0");  // ���Ԏ}��
			} else {
				updateStruct.setCOMPANY_CD(puchOdrRtnRsltStruct.getCOMPANY_CD());  // ��ЃR�[�h
				updateStruct.setVEND_CD(puchOdrRtnRsltStruct.getVEND_CD());  // �����R�[�h
				updateStruct.setPLANT_CD(puchOdrRtnRsltStruct.getPLANT_CD());  // �H��R�[�h
				updateStruct.setITEM_CD(puchOdrRtnRsltStruct.getITEM_CD());  // �i�ڔԍ�
				updateStruct.setJOB_ODR_CD(puchOdrRtnRsltStruct.getJOB_ODR_CD());  // ����
				updateStruct.setJOB_ODR_DETAIL_NO(puchOdrRtnRsltStruct.getJOB_ODR_DETAIL_NO());  // ���Ԏ}��
				updateStruct.setINV_CTRL_FLG(puchOdrRtnRsltStruct.getINV_CTRL_FLG());  // �݌ɊǗ��t���O
			}
			if ("true".equals(s.getc_NON_NO_ITEM_FLG())) {
				updateStruct.setINV_CTRL_FLG("0");  // �݌ɊǗ��t���O
				updateStruct.setNON_NO_ITEM_NAME(s.getITEM_NAME());//���i�i�ږ�
				updateStruct.setNON_NO_ITEM_TYP(s.getPRODUCT_TYP());//���i���i�敪
				updateStruct.setNON_NO_ITEM_PUCH_ODR_UNIT(s.getSTOCK_UNIT());//���i�P��
			} else {
				updateStruct.setINV_CTRL_FLG("1");  // �݌ɊǗ��t���O
				updateStruct.setNON_NO_ITEM_NAME(null);//���i�i�ږ�
				updateStruct.setNON_NO_ITEM_TYP(null);//���i���i�敪
				updateStruct.setNON_NO_ITEM_PUCH_ODR_UNIT(null);//���i�P��
			}
			updateStruct.setPUCH_ODR_PERSON(s.getPUCH_ODR_PERSON());  // �����S���҃R�[�h
			updateStruct.setPUCH_RTN_DATE(s.getPUCH_RTN_DATE());  // �ԕi��
			updateStruct.setPUCH_RTN_QTY(s.getPUCH_RTN_QTY());  // �ԕi��
			updateStruct.setWH_CD(s.getWH_CD());  // �ԕi���ۊǋ�R�[�h
			updateStruct.setVEND_LOT_NO(s.getVEND_LOT_NO());  // ���[�J���b�g�ԍ�
			updateStruct.setLOT_NO(s.getLOT_NO());  // �݌Ƀ��b�g�ԍ�
			updateStruct.setUNIT_COST_TYP(s.getUNIT_COST_TYP());  // �P���敪
			updateStruct.setUNIT_COST(s.getUNIT_COST());  // �P��
			updateStruct.setPROCESSING_COST(s.getPROCESSING_COST());  // ���H��
			updateStruct.setMATERIAL_COST(s.getMATERIAL_COST());  // �ޗ���
			updateStruct.setOTHER_OVERHEADS(s.getOTHER_OVERHEADS());  // ���̑��o��
			updateStruct.setPUCH_RTN_COMMENT(s.getPUCH_RTN_COMMENT());  // �ԕi���R�R�[�h
			updateStruct.setRATE_JUDGE_DATE(s.getPUCH_RTN_DATE());  // ���[�g�����
			updateStruct.setEXCH_RATE(s.getEXCH_RATE());  // �בփ��[�g
			updateStruct.setRTN_DEL_FLG("0");  // �ԕi����t���O
			String lowerTaxCd = null;
			try {
				// [����ŋ敪]�����擾		
				/*TaxStruct ts =
				TaxControl.getData(
						conn,
						_myCompanyStruct.getCOMPANY_CD(),
						s.getVEND_CD(),
						s.getITEM_CD(),
						s.getPUCH_RTN_DATE());*/
				
				// [����ŋ敪]�����擾
				TaxStruct ts =
				TaxControl.getDataTax(
						conn,
						_myCompanyStruct.getCOMPANY_CD(),
						s.getVEND_CD(),
						s.getITEM_CD(),
						s.getPUCH_RTN_DATE(),
						s.getTAX_CD());
				
				// [�ʉ�]�����擾
				CurStruct cs = 
						CurControl.getData(conn, _myCompanyStruct.getCOMPANY_CD(), s.getVEND_CD());
				
				updateStruct.setTAX_CD(ts.getTAX_CD());
				lowerTaxCd = ts.getTAX_CD().substring(ts.getTAX_CD().length() - 1);
/*
				if (lowerTaxCd.equals("1")) {
*/
					updateStruct.setTAX_RATE_1(ts.getTAX_RATE_1());
					updateStruct.setTAX_RATE_2(ts.getTAX_RATE_2());
					updateStruct.setTAX_RATE_3(ts.getTAX_RATE_3());
/*
				} else {
					updateStruct.setTAX_RATE_1("0.0");
					updateStruct.setTAX_RATE_2("0.0");
					updateStruct.setTAX_RATE_3("0.0");
				}
*/
				updateStruct.setTAX_ROUND_TYP(ts.getTAX_ROUND_TYP());
				updateStruct.setROUND_TYP(cs.getROUND_TYP());
				updateStruct.setVEND_DECIMAL_FIG(cs.getDECIMAL_FIG());
			} catch (DataNotFoundException e) {
				setErrorMessage(e.getCode());
				return;
			}
			
			String netAmount = null;
			int figure = Integer.parseInt(updateStruct.getVEND_DECIMAL_FIG());
			if ("1".equals(updateStruct.getROUND_TYP())) {
				// �l�̌ܓ�
				netAmount = Calculate.round(struct.getNET_AMOUNT(), figure);
			} else if ("2".equals(updateStruct.getROUND_TYP())) {
				// �؂�グ
				netAmount = Calculate.ceil(struct.getNET_AMOUNT(), figure);
			} else if ("3".equals(updateStruct.getROUND_TYP())) {
				// �؎̂�
				netAmount = Calculate.floor(struct.getNET_AMOUNT(), figure);
			}
			updateStruct.setNET_AMOUNT(netAmount);  // �{�̋��z
			
			// ��������z��̌v�Z
			String puchOdrAmount =
					AmountCalculator.calcPuchOdrAmount(
							s.getPUCH_RTN_QTY(),
							s.getUNIT_COST(),
							updateStruct.getROUND_TYP(),
							updateStruct.getVEND_DECIMAL_FIG());
			updateStruct.setPUCH_ODR_AMOUNT(puchOdrAmount);
            if(!com.nec.jp.orteus.expj.util.Calculate.isNotInNumRange(puchOdrAmount)){
                // �����ꍀ�ڎ擾�Z�b�g
               String ErrInfo = CoreTools.getRBString("Expj.PUCH_ODR_AMOUNT_3", resource);
           	   setErrorMessage("AA00215",ErrInfo);
           	   return;
             }
			
			// ��l�����z��̌v�Z
			String discAmount =
					AmountCalculator.calcDiscAmount(
							updateStruct.getPUCH_ODR_AMOUNT(),
							updateStruct.getNET_AMOUNT());
			updateStruct.setDISC_AMOUNT(discAmount);
			
            //���ł̏ꍇ�ɐŊz���v�Z����			
     		if (!"1".equals(lowerTaxCd)) {
    			//�o�b�`�p�����[�^�ďo
    			List batList = entity.mSYS_BAT_PARM.read(conn, struct);
    			if(!batList.isEmpty()){
    				//�Ōv�Z���i���R�[��
    				AE0120010Struct batStruct = (AE0120010Struct)batList.get(0);
    				updateStruct.setPVC2LOGMODE(batStruct.getPVC2LOGMODE());
    				updateStruct.setPVC2OUTPUTMODE(batStruct.getPVC2OUTPUTMODE());
    				updateStruct.setPVC2OUTPUTPATH(batStruct.getPVC2OUTPUTPATH());
    				updateStruct.setPVC2OUTPUTNAME(batStruct.getPVC2OUTPUTNAME());
    				updateStruct.setPVC2USERID(this.sysUSER_CD);
    				updateStruct.setPVC2BUSINESSNAME(batStruct.getPVC2BUSINESSNAME());
    				updateStruct.setPVC2PLANTCD(this.sysPLANT_CD);
    				updateStruct.setPVC2TAXID("5");
    				batList = entity.mcallSQLCALCTAXCALCAMT.call(conn, updateStruct);
    				batStruct = (AE0120010Struct)batList.get(0);
    				if(!"1".equals(batStruct.getPNUMSTATUS())){
    					setErrorMessage(batStruct.getPVC2ERRCD());
    					return;      				       				
    				}
    				updateStruct.setTAX_AMOUNT_1(batStruct.getTAX_AMOUNT_1());
    				updateStruct.setTAX_AMOUNT_2(batStruct.getTAX_AMOUNT_2());
    				updateStruct.setTAX_AMOUNT_3(batStruct.getTAX_AMOUNT_3());
    				updateStruct.setAMOUNT_INCLUDE_TAX(batStruct.getAMOUNT_INCLUDE_TAX());   				
    			}else{
    				setErrorMessage("ZZ09007");   
    				return;
    			}
         	}else{
				// ��Ŋz1��̌v�Z
				String taxAmount1 =
						AmountCalculator.calcTaxAmount(
								updateStruct.getNET_AMOUNT(),
								updateStruct.getTAX_RATE_1(),
								updateStruct.getTAX_ROUND_TYP(),
								updateStruct.getVEND_DECIMAL_FIG());
				updateStruct.setTAX_AMOUNT_1(taxAmount1);
				
				// ��Ŋz2��̌v�Z
				String taxAmount2 =
						AmountCalculator.calcTaxAmount(
								updateStruct.getNET_AMOUNT(),
								updateStruct.getTAX_RATE_2(),
								updateStruct.getTAX_ROUND_TYP(),
								updateStruct.getVEND_DECIMAL_FIG());
				updateStruct.setTAX_AMOUNT_2(taxAmount2);
				
				// ��Ŋz3��̌v�Z
				String taxAmount3 =
						AmountCalculator.calcTaxAmount(
								updateStruct.getNET_AMOUNT(),
								updateStruct.getTAX_RATE_3(),
								updateStruct.getTAX_ROUND_TYP(),
								updateStruct.getVEND_DECIMAL_FIG());
				updateStruct.setTAX_AMOUNT_3(taxAmount3);
				
				// ��ō����z��̌v�Z
				String amountIncludeTax =
						AmountCalculator.calcAmountIncludeTax(
								updateStruct.getNET_AMOUNT(),
								updateStruct.getTAX_AMOUNT_1(),
								updateStruct.getTAX_AMOUNT_2(),
								updateStruct.getTAX_AMOUNT_3());
				updateStruct.setAMOUNT_INCLUDE_TAX(amountIncludeTax);
                if(!com.nec.jp.orteus.expj.util.Calculate.isNotInNumRange(amountIncludeTax)){
                    // �����ꍀ�ڎ擾�Z�b�g
                   String ErrInfo = CoreTools.getRBString("Expj.AMOUNT_INCLUDE_TAX", resource);
               	   setErrorMessage("AA00215",ErrInfo);
               	   return;
                 }
         	}
			
			// ��M�݋��z��̌v�Z
			String homeCurAmount =
					AmountCalculator.calcHomeCurAmount(
							updateStruct.getAMOUNT_INCLUDE_TAX(),
							s.getEXCH_RATE(),
							updateStruct.getROUND_TYP(),
							_homeCurStruct.getDECIMAL_FIG());
			updateStruct.setHOME_CUR_AMOUNT(homeCurAmount);
            if(!com.nec.jp.orteus.expj.util.Calculate.isNotInNumRange(homeCurAmount)){
                // �����ꍀ�ڎ擾�Z�b�g
               String ErrInfo = CoreTools.getRBString("Expj.HOME_CUR_AMOUNT", resource);
          	   setErrorMessage("AA00215",ErrInfo);
          	   return;
             }
			
			updateStruct.setRTN_DEL_DATE("");
			
			if (mode == 1) {
				entity.mT_PUCH_ODR_RTN_RSLT.create(conn, updateStruct);
			} else {
				entity.mT_PUCH_ODR_RTN_RSLT.update(conn, updateStruct);
			}
			
		} else if (mode == 3) {
			// �폜�i�_���폜�j
			AE0120010Struct updateStruct = new AE0120010Struct();
			setStructSystemData(updateStruct);
			updateStruct.setPUCH_ODR_CD(puchOdrCd);
			updateStruct.setPUCH_RTN_COMMENT(s.getPUCH_RTN_COMMENT());
			updateStruct.setRTN_DEL_FLG("1");
			
			// �Ɩ��^�p���擾
			DateCtrlStruct dcs = DateCtrlControl.getData(conn, sysPLANT_CD);
			updateStruct.setRTN_DEL_DATE(dcs.getBUSINESS_OPR_DATE());
			
			entity.mupdateT_PUCH_ODR_RTN_RSLT.update(conn, updateStruct);
		}
	}
	
	// [��������]�A[�������я��IF]�̒ǉ�
	private void updatePastInspcAcptIF(
			IDbConnection conn, 
			AE0120010Struct formStruct, 
			AE0120010Struct puchOdrRtnRsltStruct, 
			AE0120010Struct itemStruct, 
			String puchOdrCd, 
			int mode) 
			throws ParseException, DataNotFoundException, SQLException, FoundationException, 
					ExpjException {
		
		AE0120010Struct pastInspcAcptStruct = null;
		//�`�[�ԍ�
		String slipCd = null;
			
		if (mode == 1 || mode == 3) {
			
			// �o�^ ��
			
			// [��������]�̒ǉ�
			
			String inspcAcptNo = null;  // �����ԍ�
			String crctNo = null;  // ������
			if (mode == 3) {
				List pastInspcAcptList = entity.mT_PAST_INSPC_ACPT.read(conn, formStruct);
				if (pastInspcAcptList.isEmpty()) {
					// �G���[
					setErrorMessage("ZZ06001");
					setErrorParameter("T_PAST_INSPC_ACPT", "PUCH_ODR_CD", formStruct.getPUCH_ODR_CD());
					setErrorParameter("T_PAST_INSPC_ACPT", "ACPT_NO", "0");
					return;
				}
				
				pastInspcAcptStruct = (AE0120010Struct)(pastInspcAcptList.get(0));
				inspcAcptNo = Calculate.add(pastInspcAcptStruct.getINSPC_ACPT_NO(), "1");  // �����ԍ�
				crctNo = Calculate.add(pastInspcAcptStruct.getCRCT_NO(), "1");  // ������
			}
			
			// �ǉ����e�ݒ�
			pastInspcAcptStruct = new AE0120010Struct();
			setStructSystemData(pastInspcAcptStruct);
			
			pastInspcAcptStruct.setPUCH_ODR_CD(puchOdrCd);  // �����ԍ�
			pastInspcAcptStruct.setACPT_NO("0");  // �����
			if (mode == 1) {
				pastInspcAcptStruct.setINSPC_ACPT_NO("1");  // �����ԍ�
				pastInspcAcptStruct.setCRCT_NO("0");  // ������
			} else if (mode == 3) {
				pastInspcAcptStruct.setINSPC_ACPT_NO(inspcAcptNo);  // �����ԍ�
				pastInspcAcptStruct.setCRCT_NO(crctNo);  // ������
			}
			pastInspcAcptStruct.setINSPC_ACPT_GNR_TYP("3");  // ���������敪
			pastInspcAcptStruct.setCRCT_NO("0");  // ������
			pastInspcAcptStruct.setCRCT_TYP("1");  // �����敪
			pastInspcAcptStruct.setITEM_CD(formStruct.getITEM_CD());  // �i�ڔԍ�
			
			if ("true".equals(formStruct.getc_NON_NO_ITEM_FLG()) == false) {
				pastInspcAcptStruct.setITEM_NAME(itemStruct.getITEM_NAME()); // �i�ږ�
				pastInspcAcptStruct.setSTOCK_UNIT(itemStruct.getSTOCK_UNIT());  // �v�ʒP��
				pastInspcAcptStruct.setPRODUCT_TYP(itemStruct.getPRODUCT_TYP());  // ���i�敪
			} else {
				pastInspcAcptStruct.setITEM_NAME(formStruct.getITEM_NAME()); // �i�ږ�
				pastInspcAcptStruct.setSTOCK_UNIT(formStruct.getSTOCK_UNIT());  // �v�ʒP��
				pastInspcAcptStruct.setPRODUCT_TYP(formStruct.getPRODUCT_TYP());  // ���i�敪
			}
			
			pastInspcAcptStruct.setSLIP_TYP("79");  // �`�[���
			pastInspcAcptStruct.setCOMPANY_CD(_myCompanyStruct.getCOMPANY_CD());  // ��ЃR�[�h
			pastInspcAcptStruct.setVEND_CD(formStruct.getVEND_CD());  // �����R�[�h
			pastInspcAcptStruct.setPLANT_CD(sysPLANT_CD);  // �H��R�[�h
			pastInspcAcptStruct.setUNIT_COST(formStruct.getUNIT_COST());  // �P��
			pastInspcAcptStruct.setUNIT_COST_TYP(formStruct.getUNIT_COST_TYP());  // �P���敪
			pastInspcAcptStruct.setPROCESSING_COST(
					Calculate.multiply(formStruct.getPROCESSING_COST(), "-1"));  // ���H��
			pastInspcAcptStruct.setMATERIAL_COST(
					Calculate.multiply(formStruct.getMATERIAL_COST(), "-1"));  // �ޗ���
			pastInspcAcptStruct.setOTHER_OVERHEADS(
					Calculate.multiply(formStruct.getOTHER_OVERHEADS(), "-1"));  // ���̑��o��
			pastInspcAcptStruct.setACPT_QTY(
					Calculate.multiply(formStruct.getPUCH_RTN_QTY(), "-1"));  // �����
			pastInspcAcptStruct.setINSPC_ACPT_QTY(
					Calculate.multiply(formStruct.getPUCH_RTN_QTY(), "-1"));  // ������
			
			pastInspcAcptStruct.setINSPC_ACPT_AMOUNT(
					Calculate.multiply(formStruct.getPUCH_ODR_AMOUNT(), "-1"));  // �������z
			pastInspcAcptStruct.setSAVING_AMOUNT(
					Calculate.multiply(formStruct.getDISC_AMOUNT(), "-1"));  // �l�����z
			pastInspcAcptStruct.setACPT_DATE(formStruct.getPUCH_RTN_DATE());  // �����
			pastInspcAcptStruct.setINSPC_ACPT_DATE(formStruct.getPUCH_RTN_DATE());  // ������
			
			//�̔ԋ��ʕ��i
			ArApNumbering arapnumbering_common = new ArApNumbering( conn, sysUSER_CD, sp.getProcId(),sysPLANT_CD, struct.getCOMPANY_CD(),
																	actionTyp, slipTyp, formStruct.getPUCH_RTN_DATE());
			//�`�[�ԍ�
			slipCd = arapnumbering_common.getSlipCd();
			if (slipCd == null || "".equals(slipCd)) {
				// �G���[
				setErrorMessage("BZ00180");
				return;
			}
			pastInspcAcptStruct.setSLIP_CD(slipCd);  // �`�[�ԍ�
			pastInspcAcptStruct.setORGN_SLIP_CD(null);  // ���`�[�ԍ�
			pastInspcAcptStruct.setEXCH_RATE(struct.getEXCH_RATE());  // �בփ��[�g
			
			entity.mT_PAST_INSPC_ACPT.create(conn, pastInspcAcptStruct);
			
		} else if (mode == 2 || mode == 4) {
			
			// �X�V�@��
			// �폜 ���f�[�^
			// ���������A�������я��C���^�[�t�F�[�X�̒ǉ�
			List pastInspcAcptList = entity.mT_PAST_INSPC_ACPT.read(conn, formStruct);
			if (pastInspcAcptList.isEmpty()) {
				// �G���[
				setErrorMessage("ZZ06001");
				setErrorParameter("T_PAST_INSPC_ACPT", "PUCH_ODR_CD", formStruct.getPUCH_ODR_CD());
				setErrorParameter("T_PAST_INSPC_ACPT", "ACPT_NO", "0");
				return;
			}
			
			pastInspcAcptStruct = (AE0120010Struct)(pastInspcAcptList.get(0));
			setStructSystemData(pastInspcAcptStruct);
			// �ǉ����e�ݒ�
			pastInspcAcptStruct.setINSPC_ACPT_NO(
					Calculate.add(pastInspcAcptStruct.getINSPC_ACPT_NO(), "1"));  // �����ԍ�
			
			pastInspcAcptStruct.setINSPC_ACPT_GNR_TYP("3");  // ���������敪
			pastInspcAcptStruct.setCRCT_TYP("2");  // �����敪
			
			pastInspcAcptStruct.setPROCESSING_COST(
					Calculate.multiply(pastInspcAcptStruct.getPROCESSING_COST(), "-1"));  // ���H��
			pastInspcAcptStruct.setMATERIAL_COST(
					Calculate.multiply(pastInspcAcptStruct.getMATERIAL_COST(), "-1"));  // �ޗ���
			pastInspcAcptStruct.setOTHER_OVERHEADS(
					Calculate.multiply(pastInspcAcptStruct.getOTHER_OVERHEADS(), "-1"));  // ���̑��o��
			pastInspcAcptStruct.setACPT_QTY(
					Calculate.multiply(pastInspcAcptStruct.getACPT_QTY(), "-1"));  // �����
			pastInspcAcptStruct.setINSPC_ACPT_QTY(
					Calculate.multiply(pastInspcAcptStruct.getINSPC_ACPT_QTY(), "-1"));  // ������
			pastInspcAcptStruct.setINSPC_ACPT_AMOUNT(
					Calculate.multiply(pastInspcAcptStruct.getINSPC_ACPT_AMOUNT(), "-1"));  // �������z
			pastInspcAcptStruct.setSAVING_AMOUNT(
					Calculate.multiply(pastInspcAcptStruct.getSAVING_AMOUNT(), "-1"));  // �l�����z
			pastInspcAcptStruct.setACPT_DATE(pastInspcAcptStruct.getACPT_DATE());  // �����
			
			//�̔ԋ��ʕ��i
			ArApNumbering arapnumbering_common = new ArApNumbering( conn, sysUSER_CD, sp.getProcId(),sysPLANT_CD, struct.getCOMPANY_CD(),
																	actionTyp, slipTyp, pastInspcAcptStruct.getINSPC_ACPT_DATE());
			//�`�[�ԍ�
			slipCd = arapnumbering_common.getSlipCd();
			if (slipCd == null || "".equals(slipCd)) {
				// �G���[
				setErrorMessage("BZ00180");
				return;
			}
			
			pastInspcAcptStruct.setINSPC_ACPT_DATE(pastInspcAcptStruct.getINSPC_ACPT_DATE());  // ������
			
			pastInspcAcptStruct.setORGN_SLIP_CD(pastInspcAcptStruct.getSLIP_CD());  // ���`�[�ԍ�
			pastInspcAcptStruct.setSLIP_CD(slipCd);  // �`�[�ԍ�
			
			// [��������]�ǉ�
			entity.mT_PAST_INSPC_ACPT.create(conn, pastInspcAcptStruct);
			
		}
			
		// [�������я��C���^�[�t�F�[�X]�ǉ�
		addInspcAcptIF(conn, formStruct, puchOdrRtnRsltStruct, itemStruct, pastInspcAcptStruct, mode);
	}
	
	// [�������я��C���^�[�t�F�[�X]�̒ǉ�
	private void addInspcAcptIF(
			IDbConnection conn, 
			AE0120010Struct formStruct, 
			AE0120010Struct puchOdrRtnRsltStruct, 
			AE0120010Struct itemStruct, 
			AE0120010Struct pastInspcAcptStruct,
			int mode) 
			throws ParseException, DataNotFoundException, SQLException, FoundationException,
					ExpjException {
		
		pastInspcAcptStruct.setGNR_ORG_CD(sysPLANT_CD);  // ��������R�[�h
		pastInspcAcptStruct.setSBCNT_PUCH_TYP("0");  // �O���w���i�敪
		if (mode == 1 || mode == 3) {
			pastInspcAcptStruct.setJOB_ODR_CD(formStruct.getJOB_ODR_CD());  // ����
			pastInspcAcptStruct.setJOB_ODR_DETAIL_NO("0");  // ���Ԏ}��
		} else {
			pastInspcAcptStruct.setJOB_ODR_CD(puchOdrRtnRsltStruct.getJOB_ODR_CD());  // ����
			pastInspcAcptStruct.setJOB_ODR_DETAIL_NO(
					puchOdrRtnRsltStruct.getJOB_ODR_DETAIL_NO());  // ���Ԏ}��
		}
		if ("true".equals(formStruct.getc_NON_NO_ITEM_FLG())) {
			pastInspcAcptStruct.setCLASIFICATION_CD("");  // �Ǘ��R�[�h
			pastInspcAcptStruct.setINV_CTRL_FLG("0");  // �݌ɊǗ��t���O
		} else {
			pastInspcAcptStruct.setCLASIFICATION_CD(itemStruct.getCLASIFICATION_CD());  // �Ǘ��R�[�h
			pastInspcAcptStruct.setINV_CTRL_FLG("1");  // �݌ɊǗ��t���O
		}
		pastInspcAcptStruct.setPUCH_RTN_FLG("1");  // �w���ԕi�t���O
		pastInspcAcptStruct.setDISC_AMOUNT(pastInspcAcptStruct.getSAVING_AMOUNT());  // �l�����z

        //�V�X�e���p�����[�^(���F)�`�F�b�N
	  	if(blnchkInspcIf() == true){
	  		pastInspcAcptStruct.setAPPR_FLG("1");
	  		pastInspcAcptStruct.setAPPR_ID(null);
	  		pastInspcAcptStruct.setAPPR_DATE(null);
	  	}else{
			// �Ɩ��^�p���擾
			DateCtrlStruct dcs = DateCtrlControl.getData(conn, sysPLANT_CD);
	  		pastInspcAcptStruct.setAPPR_FLG("3");
	  		pastInspcAcptStruct.setAPPR_ID(getsysUSER_CD());
	  		pastInspcAcptStruct.setAPPR_DATE(dcs.getBUSINESS_OPR_DATE());
	  	}	 
		entity.mT_INSPC_ACPT_IF.create(conn, pastInspcAcptStruct);
	}
	
	/**
	 * �V�X�e���p�����[�^�擾
	 */
	private boolean getSysParameter() throws BusinessProcessException, FoundationException {
		boolean b = true;
		try {
			List sysParameterList = entity.mSELECT_SYS_PARAMETER.read(conn, struct);
			if(sysParameterList == null || sysParameterList.isEmpty()) return b;
			AE0120010Struct sysParameterStruct = (AE0120010Struct) sysParameterList.get(0);
			if(null != sysParameterStruct.getPAST_RESULT_ENTRY_TYP() && !"".equals(sysParameterStruct.getPAST_RESULT_ENTRY_TYP())){
				if("false".equals(sysParameterStruct.getPAST_RESULT_ENTRY_TYP())){
					b = false;
				}
			}
		}catch(Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}
		return b;
	}
	
    /**
     * �V�X�e���p�����[�^�`�F�b�N       
     * @throws SQLException �������s
     * @throws ExpjException �������s
   * @throws FoundationException 
     */
    private boolean blnchkInspcIf()
    throws SQLException, ExpjException, FoundationException {
  	  
 	           /** �p�����[�^�u�������F�v���擾*/
 	           privateConfig = new PrivateConfig(conn);
 	           aprInspcif = privateConfig.getString("APR_INSPC_IF");
 	           // �p�����[�^�u�������F�v���擾�ł��Ȃ������ꍇ
 	          if(aprInspcif == null || "".equals(aprInspcif)){
  				String locale = CoreTools.getLocale(struct.getsUser_ID());
  				ResourceBundle messages = CoreTools.getResourceBundle("ExpjMessage", locale);
  				setErrorMessage("AZ00041", messages.getString("AZ00072"));
  				aprInspcif = "0";
 	            	return false;
 	          }else if(!"1".equals(aprInspcif)){   	        	  
 				  // �P�ȊO�̏ꍇ
 	        	  return false;
 	          }else{
 	        	  // �P�̏ꍇ
 	        	 return true;
 	          }     	  
    }
	/**
	 * ���ی����Ǘ��p�����[�^�̑Ώ۔N�����擾
	 */
	private BigDecimal getProcExecDate() throws BusinessProcessException, FoundationException {
		BigDecimal bd = null;
		try {
			struct.setPLANT_CD(getsysPLANT_CD());
			List procExecDateList = entity.mSELECT_SYS_ACTUAL_COST_CTRL_AC.read(conn, struct);
			if(procExecDateList == null || procExecDateList.isEmpty()) return null;
			AE0120010Struct procExecDateStruct = (AE0120010Struct) procExecDateList.get(0);
			bd = procExecDateStruct.getPROC_EXEC_DATE();
			struct.setPROC_EXEC_DATE(bd);
		}catch(Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}
		return bd;
	}
	
	
  // ���ی����̒��߂��������Ă�����t�ł͓��͂ł��܂���
	private String ProcExecDateError = "AE00160";
	
	/**
	 * �Ώ۔N�����Ɠ��͔N�����̔�r
	 * ���ی����̒��߂��������Ă�����t�ł̎��т̓o�^��s�Ƃ���
	 * ���ی����̒��߂��������Ă�����t���̎��я��̏C����s�Ƃ���
	 * @param  doType      �o�^�i'1'�j�܂��X�V�i'2'�j�܂��폜�i'3'�j
	 * @param  selOutDate  �X�V�O���͔N����
	 * @param  inputDate �@�X�V����͔N����
	 * @return boolean �@  �`�F�b�N�Ԃ��l
	 */
	private boolean chkProcExecDate(String doType,String selOutDate,String inputDate) throws BusinessProcessException, FoundationException {
		boolean b = true;
		
		// ���ی����Ǘ��p�����[�^�̑Ώ۔N����
		BigDecimal ProcExecDate = getProcExecDate();
		if(null == ProcExecDate) return b;
		ProcExecDateError = "AE00160";
		
		// �o�^�̏ꍇ
		if("1".equals(doType)){
			// ��ʓ��͔N����
			BigDecimal input = new BigDecimal(inputDate.substring(0,4) + inputDate.substring(5,7));
			b = compDecimal(input,ProcExecDate);
			
		}
		// �X�V�̏ꍇ
		if("2".equals(doType)){
			
			// �X�V�O���͔N����
			BigDecimal selOut = new BigDecimal(selOutDate.substring(0,4) + selOutDate.substring(5,7));
			// �X�V����͔N����
			BigDecimal input = new BigDecimal(inputDate.substring(0,4) + inputDate.substring(5,7));
			// �Ǎ��񂾎��я��̓��t�̔�r
			b = compDecimal(selOut,ProcExecDate);
			if(b == false){
				// ���ی����̒��߂��������Ă�����t���̎��я��͏C���ł��܂���
				ProcExecDateError = "AE00161";
				return b;
			}
			// ���͂̓��t�̔�r
			b = compDecimal(input,ProcExecDate);
			
		}
		// �폜�̏ꍇ
		if("3".equals(doType)){
			// �X�V�O���͔N����
			BigDecimal selOut = new BigDecimal(selOutDate.substring(0,4) + selOutDate.substring(5,7));
			// �Ǎ��񂾎��я��̓��t�̔�r
			b = compDecimal(selOut,ProcExecDate);
			// ���ی����̒��߂��������Ă�����t���̎��я��͏C���ł��܂���
			ProcExecDateError = "AE00161";
			
		}
		
		return b;
	}
	
	/**
	 * ��r
	 * @param  bd1      ���͈���1
	 * @param  bd2 �@   ���͈���2
	 * @return boolean  �`�F�b�N�Ԃ��l
	 */
	private boolean compDecimal(BigDecimal bd1,BigDecimal bd2){
		// bd1 >= bd2
		if(bd1.compareTo(bd2) >= 0) {
			return true;
		} else {
			return false;
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0120");
		logger.entering("AE0120010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			
			// �L�[��ޔ�
			String puchOdrCd = struct.getPUCH_ODR_CD();
			
			// �L�[�ȊO�̍��ڂ�������
			initializeDetail();
			
			struct.setCOMPANY_CD(_myCompanyStruct.getCOMPANY_CD());
			
			// [�w���ԕi����]�ɑΏۃf�[�^�����݂��Ȃ��ꍇ�G���[
			List puchOdrRtnRsltList = entity.mT_PUCH_ODR_RTN_RSLT.read(conn, struct);
			if (puchOdrRtnRsltList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setErrorParameter("T_PUCH_ODR_RTN_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}
			
			AE0120010Struct puchOdrRtnRsltStruct = (AE0120010Struct)(puchOdrRtnRsltList.get(0));
			
			// [�w���ԕi����]."�H��R�[�h" �� ���O�C�����[�U�̍H��R�[�h �̏ꍇ�G���[
			if (sysPLANT_CD.equals(puchOdrRtnRsltStruct.getPLANT_CD()) == false) {
				setErrorMessage("AE00138");
				setErrorParameter("T_PUCH_ODR_RTN_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				setErrorParameter("T_PUCH_ODR_RTN_RSLT", "PLANT_CD", puchOdrRtnRsltStruct.getPLANT_CD());
				return;
			}
			
			struct.setStruct(puchOdrRtnRsltStruct);
			struct.setPUCH_ODR_CD(puchOdrCd);
			
			// ���|�Ǘ����C���X�g�[������Ă���ꍇ�A���N���x���擾
			AE0120010Struct readStruct = new AE0120010Struct();
			List installOptionsList = entity.mSYS_INSTALL_OPTIONS.read(conn, readStruct);
			if (installOptionsList.size() > 0) {
				AE0120010Struct installOptionsStruct = (AE0120010Struct)installOptionsList.get(0);
				struct.setINSTALL_FLG(installOptionsStruct.getINSTALL_FLG());
			} else {
				struct.setINSTALL_FLG("0");
			}
			
			// ���|�Ǘ����C���X�g�[������Ă���ꍇ�A���N���x���擾
			if ("1".equals(struct.getINSTALL_FLG())) {
				List debtCtrlList = entity.mSYS_DEBT_CTRL.read(conn, readStruct);
				if (debtCtrlList.size() > 0) {
					AE0120010Struct debtCtrlStruct = (AE0120010Struct)debtCtrlList.get(0);
					struct.setTHIS_MONTH(debtCtrlStruct.getTHIS_MONTH());
				} else {
					setErrorMessage("AE00145");
					return;
				}
			}
			
			if ("0".equals(struct.getINV_CTRL_FLG())) {
				struct.setc_NON_NO_ITEM_FLG("true");
			}
			//���i�敪���擾
			if ("1".equals(struct.getINV_CTRL_FLG())) {
				struct.setPRODUCT_TYP(struct.getITEM_TYP());
			} else if ("0".equals(struct.getINV_CTRL_FLG())){
				struct.setPRODUCT_TYP(struct.getNON_NO_ITEM_TYP());
			}
			//�i�ږ�
			if ("0".equals(struct.getINV_CTRL_FLG())) {
				struct.setITEM_NAME(struct.getNON_NO_ITEM_NAME());//�i�ږ�
				struct.setSTOCK_UNIT(struct.getNON_NO_ITEM_PUCH_ODR_UNIT());//�P��
			}
			
			// �u�����ԍ����w�肷��v�Ŏw�肷��u�����ԍ��v�ƃ��W�I�{�^�����N���A
			struct.setr1_FILTER("true");
			struct.setPUCH_ODR_CD_2(null);
			
			struct.setSelectUnitCostFlag("true");
			
			// [�w���ԕi����]."�ԕi����t���O" �� 1�F�ԕi��� �̏ꍇ���[�j���O
			if ("1".equals(puchOdrRtnRsltStruct.getRTN_DEL_FLG())) {
				setWarningMessage("AE00142");
				setWarningParameter("T_PUCH_ODR_RTN_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				setWarningParameter("T_PUCH_ODR_RTN_RSLT", "RTN_DEL_FLG", 
						puchOdrRtnRsltStruct.getRTN_DEL_FLG());
			}
			struct.setRTN_DEL_FLG(puchOdrRtnRsltStruct.getRTN_DEL_FLG());
			
			// �ԕi��
			struct.seth_PUCH_RTN_DATE(struct.getPUCH_RTN_DATE());
			
			readStatus = NORMAL;
			
		} catch (FoundationException e) {
			throw new ExpjException(e);
		} catch (DataNotFoundException e) {
			throw new ExpjException(e);
		} catch (SQLException e) {
			throw new ExpjException(e);
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AE0120010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �P���Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelectUnitCost() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0120");
		logger.entering("AE0120010Control"+":USER="+struct.getsUser_ID(),"controlSelectUnitCost");
			//{{user_implement_dev:<controlSelectUnitCost>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			
		try {
			
			// �u�w���P���Ǎ��v���I������Ă���ꍇ
			if ("true".equals(struct.getr1_FILTER())) {
				
				// ���̓`�F�b�N
				// �����}�X�^���݃`�F�b�N
				List vendList = entity.mM_VEND_CTRL.read(conn, struct);
				if (vendList.isEmpty()) {
					// �G���[
					setErrorMessage("AE20030");
					setErrorParameter("M_VEND_CTRL", "COMPANY_CD", struct.getCOMPANY_CD());
					setErrorParameter("M_VEND_CTRL", "VEND_CD", struct.getVEND_CD());
				} else {
					AE0120010Struct vendStruct = (AE0120010Struct)(vendList.get(0));
				}
				
				// �i�ڑ��݃`�F�b�N
				List itemList = entity.mM_ITEM.read(conn, struct);
				if (itemList.isEmpty() && "true".equals(struct.getc_NON_NO_ITEM_FLG()) == false) {
					// �G���[
					setErrorMessage("AE00118");
					setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
				} else if (!itemList.isEmpty()) {
					AE0120010Struct itemStruct = (AE0120010Struct) (itemList.get(0));

					// �i��.�݌ɐ��P�ʋ敪
					if ("1".equals(itemStruct.getUNIT_QTY_TYP()) == true 
							&& Calculate.isInteger(struct.getPUCH_RTN_QTY()) == false) {
						// �G���[
						setErrorMessage("AE00146");
						setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
						setErrorParameter("M_ITEM", "UNIT_QTY_TYP", itemStruct.getUNIT_QTY_TYP());
					}
				}

				// ����ŋ敪���݃`�F�b�N
				if(null != struct.getTAX_CD() && !"".equals(struct.getTAX_CD())){
					List taxList = entity.mM_TAX.read(conn, struct);
					if (taxList.isEmpty()) {
						// �G���[
						setErrorMessage("AA01001");
						setErrorParameter("M_TAX", "TAX_CD", struct.getTAX_CD());
					}
				}

				// �G���[������ΏI��
				if (msgStruct.hasError()) {
					return;
				}
				
				PuchUnitCostStruct pucs;
				
				// �����A�w���P���A�ʉ݁A����ł��擾
				/*try {
					pucs = PuchUnitCostControl.getData(
							conn,
							_myCompanyStruct.getCOMPANY_CD(),
							struct.getVEND_CD(),
							sysPLANT_CD,
							struct.getITEM_CD(),
							struct.getPUCH_RTN_DATE(),
							struct.getPUCH_RTN_DATE(),
							struct.getPUCH_RTN_QTY());*/

				try {
					pucs = PuchUnitCostControl.getDataTax0(
							conn,
							_myCompanyStruct.getCOMPANY_CD(),
							struct.getVEND_CD(),
							sysPLANT_CD,
							struct.getITEM_CD(),
							struct.getPUCH_RTN_DATE(),
							struct.getPUCH_RTN_DATE(),
							struct.getPUCH_RTN_QTY(),
							struct.getTAX_CD());
					
					struct.setTAX_CD(pucs.getTAX_CD());
					struct.setUNIT_COST_TYP(pucs.getUNIT_COST_TYP());
					struct.setUNIT_COST(pucs.getUNIT_COST());
					struct.setPROCESSING_COST(pucs.getPROCESSING_COST());
					struct.setMATERIAL_COST(pucs.getMATERIAL_COST());
					struct.setOTHER_OVERHEADS(pucs.getOTHER_OVERHEADS());
					struct.setPUCH_ODR_AMOUNT(pucs.getPUCH_ODR_AMOUNT());
					struct.setTAX_RATE_1(pucs.getTAX_RATE_1());
					struct.setTAX_RATE_2(pucs.getTAX_RATE_2());
					struct.setTAX_RATE_3(pucs.getTAX_RATE_3());
					struct.setNET_AMOUNT(pucs.getNET_AMOUNT());
					struct.setDISC_AMOUNT(pucs.getDISC_AMOUNT());
					struct.setAMOUNT_INCLUDE_TAX(pucs.getAMOUNT_INCLUDE_TAX());
					struct.setTAX_ROUND_TYP(pucs.getTAX_ROUND_TYP());
					struct.setROUND_TYP(pucs.getROUND_TYP());
					struct.setVEND_CUR_UNIT(pucs.getCUR_UNIT());
					struct.setVEND_DECIMAL_FIG(pucs.getDECIMAL_FIG());
					
	                //���ł̏ꍇ�ɐŊz���v�Z����
					if(null != struct.getTAX_CD() && !"".equals(struct.getTAX_CD())){
						String lowerTaxCd =
		        			struct.getTAX_CD().substring(struct.getTAX_CD().length() - 1);
			       		if (!lowerTaxCd.equals("1")) {
			       			//�o�b�`�p�����[�^�ďo
			       			List batList = entity.mSYS_BAT_PARM.read(conn, struct);
			       			if(!batList.isEmpty()){
			       				//�Ōv�Z���i���R�[��
			       				AE0120010Struct batStruct = (AE0120010Struct)batList.get(0);
			       				struct.setPVC2LOGMODE(batStruct.getPVC2LOGMODE());
			       				struct.setPVC2OUTPUTMODE(batStruct.getPVC2OUTPUTMODE());
			       				struct.setPVC2OUTPUTPATH(batStruct.getPVC2OUTPUTPATH());
			       				struct.setPVC2OUTPUTNAME(batStruct.getPVC2OUTPUTNAME());
			       				struct.setPVC2USERID(this.sysUSER_CD);
			       				struct.setPVC2BUSINESSNAME(batStruct.getPVC2BUSINESSNAME());
			       				struct.setPVC2PLANTCD(this.sysPLANT_CD);
			       				struct.setPVC2TAXID("5");
			       				batList = entity.mcallSQLCALCTAXCALCAMT.call(conn, struct);
			       				batStruct = (AE0120010Struct)batList.get(0);
			       				if(!"1".equals(batStruct.getPNUMSTATUS())){
			       					setErrorMessage(batStruct.getPVC2ERRCD());
			       					return;      				       				
			       				}
			       				struct.setTAX_AMOUNT_1(batStruct.getTAX_AMOUNT_1());
			       				struct.setTAX_AMOUNT_2(batStruct.getTAX_AMOUNT_2());
			       				struct.setTAX_AMOUNT_3(batStruct.getTAX_AMOUNT_3());
			       				struct.setAMOUNT_INCLUDE_TAX(batStruct.getAMOUNT_INCLUDE_TAX());   				
			       			}else{
			       				setErrorMessage("ZZ09007");        				
			       			}
		            	  }else{
		      				struct.setTAX_AMOUNT_1(pucs.getTAX_AMOUNT_1());
		    				struct.setTAX_AMOUNT_2(pucs.getTAX_AMOUNT_2());
		    				struct.setTAX_AMOUNT_3(pucs.getTAX_AMOUNT_3());
		    				struct.setAMOUNT_INCLUDE_TAX(pucs.getAMOUNT_INCLUDE_TAX());
		            	  }
					} else {
						struct.setTAX_AMOUNT_1(pucs.getTAX_AMOUNT_1());
	    				struct.setTAX_AMOUNT_2(pucs.getTAX_AMOUNT_2());
	    				struct.setTAX_AMOUNT_3(pucs.getTAX_AMOUNT_3());
	    				struct.setAMOUNT_INCLUDE_TAX(pucs.getAMOUNT_INCLUDE_TAX());
					}
				} catch (DataNotFoundException e) {
					setErrorMessage("AE00060", e.getMessage());
					setErrorParameter("T_PUCH_ODR_RTN_RSLT", "VEND_CD", struct.getVEND_CD());
					setErrorParameter("T_PUCH_ODR_RTN_RSLT", "PLANT_CD", struct.getPLANT_CD());
					setErrorParameter("T_PUCH_ODR_RTN_RSLT", "ITEM_CD", struct.getITEM_CD());
					setErrorParameter(
							"T_PUCH_ODR_RTN_RSLT",
							"PUCH_RTN_DATE",
							struct.getPUCH_RTN_DATE());
					setErrorParameter("T_PUCH_ODR_RTN_RSLT", "PUCH_RTN_QTY", struct.getPUCH_RTN_QTY());
					return;
				} catch (SQLException e) {
					throw new ExpjException(e);
				}
				
				// �בփ��[�g�����݂��Ȃ��ꍇ�̓��[�j���O�����Ƃ��邽�ߕʂɎ擾
				try {
					ExchRateStruct ers = ExchRateControl.getData(
							conn,
							_myCompanyStruct.getCOMPANY_CD(),
							pucs.getCUR_CD(),
							pucs.getEXCH_TYP(),
							null,
							struct.getPUCH_RTN_DATE());
							
					// ��בփ��[�g���ݒ�
					struct.setEXCH_RATE(ers.getEXCH_RATE());
					
					// ��M�݋��z��̌v�Z
					String homeCurAmount = AmountCalculator.calcHomeCurAmount(
							pucs.getAMOUNT_INCLUDE_TAX(),
							ers.getEXCH_RATE(),
							pucs.getROUND_TYP(),
							_homeCurStruct.getDECIMAL_FIG());
					struct.setHOME_CUR_AMOUNT(homeCurAmount);
					
				} catch (DataNotFoundException e) {
					struct.setHOME_CUR_AMOUNT("0");
					struct.setEXCH_RATE("0");
					setWarningMessage("AE00061");
					setWarningParameter("T_PUCH_ODR_RTN_RSLT", "VEND_CD", struct.getVEND_CD());
					setWarningParameter("T_PUCH_ODR_RTN_RSLT", "PLANT_CD", struct.getPLANT_CD());
					setWarningParameter("T_PUCH_ODR_RTN_RSLT", "ITEM_CD", struct.getITEM_CD());
					setWarningParameter(
						"T_PUCH_ODR_RTN_RSLT",
						"PUCH_RTN_DATE",
						struct.getPUCH_RTN_DATE());
					setWarningParameter("T_PUCH_ODR_RTN_RSLT", "PUCH_RTN_QTY", struct.getPUCH_RTN_QTY());
				} catch (SQLException e) {
					throw new ExpjException(e);
				}
				
				// �ԕi���ۊǋ�R�[�h
				if ((struct.getWH_CD() == null || "".equals(struct.getWH_CD())) 
				&& !"".equals(struct.getITEM_CD())) {
					String defaultWhCd = ValidateWh.getDefaultRcv(conn,
							sysPLANT_CD, struct.getITEM_CD());
					struct.setWH_CD(defaultWhCd);
				}
			} else if ("true".equals(struct.getr2_FILTER())) {
				
				// �u�����ԍ����w�肷��v���I������Ă���ꍇ
				
				// ���̓`�F�b�N
				
				// �����ԍ���[�������]�ɑ��݂��Ȃ��ꍇ�G���[
				List acptRsltList = entity.mT_ACPT_RSLT.read(conn, struct);
				if (acptRsltList.isEmpty()) {
					// �G���[
					setErrorMessage("AE00130");
					setErrorParameter("T_ACPT_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD_2());
				} else {
					// [�������]."�H��R�[�h" <> ���O�C�����[�U�̍H��R�[�h�̏ꍇ�G���[
					AE0120010Struct acptRsltStruct = (AE0120010Struct)(acptRsltList.get(0));
					if (sysPLANT_CD.equals(acptRsltStruct.getPLANT_CD()) == false) {
						// �G���[
						setErrorMessage("AE00100");
						setErrorParameter("T_ACPT_RSLT", "PLANT_CD", acptRsltStruct.getPLANT_CD());
					}
				}
				
				if ((struct.getVEND_CD() != null && "".equals(struct.getVEND_CD()) == false)
						|| (struct.getITEM_CD() != null && "".equals(struct.getITEM_CD()) == false)
						|| (struct.getJOB_ODR_CD() != null && "".equals(struct.getJOB_ODR_CD()) == false)) {
					
					// [�����c]����
					List rlsdPuchOdrList = entity.mT_RLSD_PUCH_ODR.read(conn, struct);
					if (rlsdPuchOdrList.isEmpty()) {
						
						// �G���[
						setErrorMessage("ZZ01101");
						setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD_2());
						
					} else {
						
						AE0120010Struct rlsdPuchOdrStruct = (AE0120010Struct)(rlsdPuchOdrList.get(0));
						
						if (struct.getVEND_CD() != null && "".equals(struct.getVEND_CD()) == false) {
							if ((struct.getVEND_CD()).equals(rlsdPuchOdrStruct.getVEND_CD()) == false) {
								setErrorMessage("AE00131");
								setErrorParameter("T_ACPT_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD_2());
							}
						}
						if (struct.getITEM_CD() != null && "".equals(struct.getITEM_CD()) == false) {
							if ((struct.getITEM_CD()).equals(rlsdPuchOdrStruct.getITEM_CD()) == false) {
								setErrorMessage("AE00132");
								setErrorParameter("T_ACPT_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD_2());
							} else {
								List itemList = entity.mM_ITEM.read(conn, struct);
								if (itemList.isEmpty()) {
									// �G���[
									setErrorMessage("AE00118");
									setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
								} else {
									AE0120010Struct itemStruct = (AE0120010Struct)(itemList.get(0));
									struct.setITEM_NAME(itemStruct.getITEM_NAME());
									
									if ("1".equals(itemStruct.getUNIT_QTY_TYP()) == true
											&& Calculate.isInteger(struct.getPUCH_RTN_QTY()) == false) {
										// �G���[
										setErrorMessage("AE00146");
										setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
										setErrorParameter("M_ITEM", "UNIT_QTY_TYP", itemStruct.getUNIT_QTY_TYP());
									}
								}
							}
						}
						
						// �G���[������ΏI��
						if (msgStruct.hasError()) {
							return;
						}
						
						if (struct.getJOB_ODR_CD() != null && "".equals(struct.getJOB_ODR_CD()) == false) {
							if ((struct.getJOB_ODR_CD()).equals(rlsdPuchOdrStruct.getJOB_ODR_CD()) == false) {
								setErrorMessage("AE00133");
								setErrorParameter("T_ACPT_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD_2());
							}
						}
					}
				}
				
				// �G���[������ΏI��
				if (msgStruct.hasError()) {
					return;
				}
				
				PuchUnitCostStruct pucs;
				
				// �����A�w���P���A�ʉ݁A����ł��擾
				try {
					
					List unitCostList = entity.mselectUNIT_COST.read(conn, struct);
					if (unitCostList.isEmpty()) {
						// �G���[
						setErrorMessage("AE00130");
						setErrorParameter("T_PUCH_ODR_RTN_RSLT", "VEND_CD", struct.getVEND_CD());
						setErrorParameter("T_PUCH_ODR_RTN_RSLT", "PLANT_CD", struct.getPLANT_CD());
						setErrorParameter("T_PUCH_ODR_RTN_RSLT", "ITEM_CD", struct.getITEM_CD());
						setErrorParameter(
								"T_PUCH_ODR_RTN_RSLT",
								"PUCH_RTN_DATE",
								struct.getPUCH_RTN_DATE());
						setErrorParameter("T_PUCH_ODR_RTN_RSLT", "PUCH_RTN_QTY", struct.getPUCH_RTN_QTY());
						return;
					} else {
						AE0120010Struct unitCostStruct = (AE0120010Struct)(unitCostList.get(0));
						struct.setUNIT_COST_TYP(unitCostStruct.getUNIT_COST_TYP());  // �P���敪
						struct.setUNIT_COST(unitCostStruct.getUNIT_COST());  // �P��
						struct.setVEND_CD(unitCostStruct.getVEND_CD());  // �����R�[�h
						struct.setITEM_CD(unitCostStruct.getITEM_CD());  // �i�ڔԍ�
						struct.setJOB_ODR_CD(unitCostStruct.getJOB_ODR_CD());  // ����
						if(struct.getWH_CD() == null || "".equals(struct.getWH_CD())){
							struct.setWH_CD(unitCostStruct.getWH_CD());  // �ԕi���ۊǋ�R�[�h
						}
						struct.setPROCESSING_COST(unitCostStruct.getPROCESSING_COST());  // ���H��
						struct.setMATERIAL_COST(unitCostStruct.getMATERIAL_COST());  // �ޗ���
						struct.setOTHER_OVERHEADS(unitCostStruct.getOTHER_OVERHEADS());  // ���̑��o��
						struct.setTAX_CD(unitCostStruct.getTAX_CD());  // ����ŃR�[�h
					}
				} catch (SQLException e) {
					throw new ExpjException(e);
				}
					
				// �בփ��[�g�����݂��Ȃ��ꍇ�̓��[�j���O�����Ƃ��邽�ߕʂɎ擾
				try {
					// ��ʊO�̕K�v�ȃf�[�^��ݒ�
					try {
						// [����ŋ敪]�����擾
						/*TaxStruct ts =
								TaxControl.getData(
									conn,
									struct.getCOMPANY_CD(),
									struct.getVEND_CD(),
									struct.getITEM_CD(),
									struct.getPUCH_RTN_DATE()
									);*/
						TaxStruct ts =
						TaxControl.getDataTax(
							conn,
							struct.getCOMPANY_CD(),
							struct.getVEND_CD(),
							struct.getITEM_CD(),
							struct.getPUCH_RTN_DATE(),
							struct.getTAX_CD()
							);
						// [�ʉ�]�����擾
						CurStruct cs =
						CurControl.getData(conn, struct.getCOMPANY_CD(), struct.getVEND_CD());
						struct.setVEND_CUR_UNIT(cs.getCUR_UNIT());
						
						struct.setTAX_CD(ts.getTAX_CD());
						struct.setTAX_ROUND_TYP(ts.getTAX_ROUND_TYP());
/*
						String lowerTaxCd = ts.getTAX_CD().substring(ts.getTAX_CD().length() - 1);
						if (lowerTaxCd.equals("1")) {
*/
							struct.setTAX_RATE_1(ts.getTAX_RATE_1());
							struct.setTAX_RATE_2(ts.getTAX_RATE_2());
							struct.setTAX_RATE_3(ts.getTAX_RATE_3());
/*
						} else {
							struct.setTAX_RATE_1("0.0");
							struct.setTAX_RATE_2("0.0");
							struct.setTAX_RATE_3("0.0");
						}
*/
						
						struct.setROUND_TYP(cs.getROUND_TYP());
						struct.setVEND_DECIMAL_FIG(cs.getDECIMAL_FIG());
						
						ExchRateStruct ers = ExchRateControl.getData(
								conn,
								_myCompanyStruct.getCOMPANY_CD(),
								cs.getCUR_CD(),
								cs.getEXCH_TYP(),
								null,
								struct.getPUCH_RTN_DATE());
						
						// ��בփ��[�g���ݒ�
						struct.setEXCH_RATE(ers.getEXCH_RATE());
					} catch (DataNotFoundException e) {
						setErrorMessage(e.getCode());
						return;
					}
					
					// ��������z��̌v�Z
					String puchOdrAmount =
							AmountCalculator.calcPuchOdrAmount(
									struct.getPUCH_RTN_QTY(),
									struct.getUNIT_COST(),
									struct.getROUND_TYP(),
									struct.getVEND_DECIMAL_FIG());
					struct.setPUCH_ODR_AMOUNT(puchOdrAmount);
					
					// ��l�����z��̌v�Z
					String discAmount = "0.00";
					struct.setDISC_AMOUNT(discAmount);
					
					// �{�̋��z
					String netAmount =
						AmountCalculator.calcNetAmount(
							struct.getPUCH_ODR_AMOUNT(),
							struct.getDISC_AMOUNT());
					struct.setNET_AMOUNT(netAmount);
					
		            //���ł̏ꍇ�ɐŊz���v�Z����
		     		String lowerTaxCd =
		     			struct.getTAX_CD().substring(struct.getTAX_CD().length() - 1);
		     		if (!lowerTaxCd.equals("1")) {
		    			//�o�b�`�p�����[�^�ďo
		    			List batList = entity.mSYS_BAT_PARM.read(conn, struct);
		    			if(!batList.isEmpty()){
		    				//�Ōv�Z���i���R�[��
		    				AE0120010Struct batStruct = (AE0120010Struct)batList.get(0);
		    				struct.setPVC2LOGMODE(batStruct.getPVC2LOGMODE());
		    				struct.setPVC2OUTPUTMODE(batStruct.getPVC2OUTPUTMODE());
		    				struct.setPVC2OUTPUTPATH(batStruct.getPVC2OUTPUTPATH());
		    				struct.setPVC2OUTPUTNAME(batStruct.getPVC2OUTPUTNAME());
		    				struct.setPVC2USERID(this.sysUSER_CD);
		    				struct.setPVC2BUSINESSNAME(batStruct.getPVC2BUSINESSNAME());
		    				struct.setPVC2PLANTCD(this.sysPLANT_CD);
		    				struct.setPVC2TAXID("5");
		    				batList = entity.mcallSQLCALCTAXCALCAMT.call(conn, struct);
		    				batStruct = (AE0120010Struct)batList.get(0);
		    				if(!"1".equals(batStruct.getPNUMSTATUS())){
		    					setErrorMessage(batStruct.getPVC2ERRCD());
		    					return;      				       				
		    				}
		    				struct.setTAX_AMOUNT_1(batStruct.getTAX_AMOUNT_1());
		    				struct.setTAX_AMOUNT_2(batStruct.getTAX_AMOUNT_2());
		    				struct.setTAX_AMOUNT_3(batStruct.getTAX_AMOUNT_3());
		    				struct.setAMOUNT_INCLUDE_TAX(batStruct.getAMOUNT_INCLUDE_TAX());   				
		    			}else{
		    				setErrorMessage("ZZ09007");        				
		    			}
		         	}else{
						// ��Ŋz1��̌v�Z
						String taxAmount1 =
								AmountCalculator.calcTaxAmount(
										struct.getNET_AMOUNT(),
										struct.getTAX_RATE_1(),
										struct.getTAX_ROUND_TYP(),
										struct.getVEND_DECIMAL_FIG());
						struct.setTAX_AMOUNT_1(taxAmount1);
						
						// ��Ŋz2��̌v�Z
						String taxAmount2 =
								AmountCalculator.calcTaxAmount(
										struct.getNET_AMOUNT(),
										struct.getTAX_RATE_2(),
										struct.getTAX_ROUND_TYP(),
										struct.getVEND_DECIMAL_FIG());
						struct.setTAX_AMOUNT_2(taxAmount2);
						
						// ��Ŋz3��̌v�Z
						String taxAmount3 =
								AmountCalculator.calcTaxAmount(
										struct.getNET_AMOUNT(),
										struct.getTAX_RATE_3(),
										struct.getTAX_ROUND_TYP(),
										struct.getVEND_DECIMAL_FIG());
						struct.setTAX_AMOUNT_3(taxAmount3);
						
						// ��ō����z��̌v�Z
						String amountIncludeTax =
								AmountCalculator.calcAmountIncludeTax(
										struct.getNET_AMOUNT(),
										struct.getTAX_AMOUNT_1(),
										struct.getTAX_AMOUNT_2(),
										struct.getTAX_AMOUNT_3());
						struct.setAMOUNT_INCLUDE_TAX(amountIncludeTax);
		         	}
					
					// ��M�݋��z��̌v�Z
					String homeCurAmount =
							AmountCalculator.calcHomeCurAmount(
									struct.getAMOUNT_INCLUDE_TAX(),
									struct.getEXCH_RATE(),
									struct.getROUND_TYP(),
									_homeCurStruct.getDECIMAL_FIG());
					struct.setHOME_CUR_AMOUNT(homeCurAmount);
				
				} catch (SQLException e) {
					throw new ExpjException(e);
				}
			}
			
		} catch (SQLException e) {
			throw new ExpjException(e);
		}
		struct.setSelectUnitCostFlag("true");
                //}}user_implement_dev:<controlSelectUnitCost>
		logger.exiting("AE0120010Control"+":USER="+struct.getsUser_ID(),"controlSelectUnitCost");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0120");
		logger.entering("AE0120010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {

			// ���Y���̉ߋ��̎��ѓ��͂̐����`�F�b�N
			if(getSysParameter() == false){
				if(chkProcExecDate("1","",struct.getPUCH_RTN_DATE()) == false){
					setErrorMessage(ProcExecDateError);
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
					return;
				}
			}
						
			// �����}�X�^���݃`�F�b�N
			List vendList = entity.mM_VEND_CTRL.read(conn, struct);
			if (vendList.isEmpty()) {
				// �G���[
				setErrorMessage("AE20030");
				setErrorParameter("M_VEND_CTRL", "COMPANY_CD", struct.getCOMPANY_CD());
				setErrorParameter("M_VEND_CTRL", "VEND_CD", struct.getVEND_CD());
			} else {
				AE0120010Struct vendStruct = (AE0120010Struct)(vendList.get(0));
				struct.setVEND_ANAME(vendStruct.getVEND_ANAME());
			}
			
			// �G���[������ΏI��
			if (msgStruct.hasError()) {
				return;
			}
			
			// �i�ڑ��݃`�F�b�N
			AE0120010Struct itemStruct = null;
			List itemList = entity.mM_ITEM.read(conn, struct);
			//�u�i�ڔԍ��v��Null�ł͂Ȃ��̏ꍇ
			if ("".equals(struct.getITEM_CD()) == false) {
				if (itemList.isEmpty()) {
					// �G���[
					setErrorMessage("AE00118");
					setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
				} else {
					itemStruct = (AE0120010Struct) (itemList.get(0));
					// �i�ڃ}�X�^����i�ڎ�z�敪���擾�A8�[���i�ڂ̏ꍇ�G���[
					if ("8".equals(itemStruct.getMRP_ODR_TYP())) {
	                    // �G���[
						setErrorMessage("AE00203");
						setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
						setErrorParameter("M_ITEM", "MRP_ODR_TYP", itemStruct.getMRP_ODR_TYP());
					}
					//�u���i�w���v�t���O��Off�̏ꍇ
					if ("true".equals(struct.getc_NON_NO_ITEM_FLG()) == false) {
						struct.setITEM_NAME(itemStruct.getITEM_NAME());
						struct.setSTOCK_UNIT(itemStruct.getSTOCK_UNIT());
						struct.setPRODUCT_TYP(itemStruct.getPRODUCT_TYP()); // ���i�敪
						struct.setCLASIFICATION_CD(itemStruct.getCLASIFICATION_CD()); // �Ǘ��R�[�h
					}
					if ("1".equals(itemStruct.getUNIT_QTY_TYP()) == true
							&& Calculate.isInteger(struct.getPUCH_RTN_QTY()) == false) {
						// �G���[
						setErrorMessage("AE00146");
						setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
						setErrorParameter("M_ITEM", "UNIT_QTY_TYP", itemStruct.getUNIT_QTY_TYP());
					}
					if("true".equals(lotCtrl)){
					   String lotCtrlFlg = itemStruct.getLOT_CTRL_FLG();
		                // �݌Ƀ��b�g�ԍ��͎w�肳��Ă��܂���
		                if(lotCtrlFlg != null && "0".equals(lotCtrlFlg) 
		                        && struct.getLOT_NO() != null && !"".equals(struct.getLOT_NO())){
		                    // �G���[
		                    setErrorMessage("AE21200");
		                    return;
		                }
		                
		                // �݌Ƀ��b�g�ԍ��͎w�肳��Ă��܂���
		                if(lotCtrlFlg != null && "1".equals(lotCtrlFlg) 
		                        && (struct.getLOT_NO() == null || "".equals(struct.getLOT_NO()))
		                        && !"true".equals(struct.getc_NON_NO_ITEM_FLG())){
		                    // �G���[
		                    setErrorMessage("AE21201");
		                    return;
		                }
		                
		                // ���͂��ꂽ�݌Ƀ��b�g�ԍ��͂��̕i�ڂɊY�����܂���
		                if(lotCtrlFlg != null && "1".equals(lotCtrlFlg) 
		                        && struct.getLOT_NO() != null && !"".equals(struct.getLOT_NO())){
		                    boolean lotCtrlCheck = entity.mT_LOT_CTRL.check(conn,struct);
		                    if(!lotCtrlCheck){
		                        // �G���[
		                        setErrorMessage("AE21203");
		                        setErrorParameter("T_LOT_CTRL", "ITEM_CD", struct.getITEM_CD());
		                        setErrorParameter("T_LOT_CTRL", "LOT_NO", struct.getLOT_NO());   
		                    }
		                }
					}
				}
			}
			// �G���[������ΏI��
			if (msgStruct.hasError()) {
				return;
			}
			
			struct.setPLANT_CD(sysPLANT_CD);
			
			DateCtrlStruct dcs = DateCtrlControl.getData(conn, sysPLANT_CD);
			if (DateTool.compareYMD(struct.getPUCH_RTN_DATE(), dcs.getBUSINESS_OPR_DATE()) > 0) {
				setErrorMessage("AE00117");
				setErrorParameter("SYS_DATE_CTRL", "PLANT_CD", sysPLANT_CD);
				setErrorParameter(
					"SYS_DATE_CTRL",
					"BUSINESS_OPR_DATE",
					dcs.getBUSINESS_OPR_DATE());
				setErrorParameter(
					"T_PUCH_ODR_RTN_RSLT",
					"PUCH_RTN_DATE",
					struct.getPUCH_RTN_DATE());
			}
			
			// ���Ԍv�摶�݃`�F�b�N
			if (struct.getJOB_ODR_CD() != null && "".equals(struct.getJOB_ODR_CD()) == false) {
				List jobOdrList = entity.mT_JOB_ODR.read(conn, struct);
				if (jobOdrList.isEmpty()) {
					// �G���[
					setErrorMessage("AE00110");
					setErrorParameter("T_JOB_ODR", "JOB_ODR_CD", struct.getJOB_ODR_CD());
				} else {
					// ���Ԍv��.�H��R�[�h�����O�C�����[�U�̍H��R�[�h�ƈقȂ�ꍇ�G���[
					AE0120010Struct jobOdrStruct = (AE0120010Struct)(jobOdrList.get(0));
					if (sysPLANT_CD.equals(jobOdrStruct.getPLANT_CD()) == false) {
						// �G���[
						setErrorMessage("AE00115");
						setErrorParameter("T_JOB_ODR", "JOB_ODR_CD", struct.getJOB_ODR_CD());
						setErrorParameter("T_JOB_ODR", "PLANT_CD", jobOdrStruct.getPLANT_CD());
					}
				}
			}
			
			// �G���[������ΏI��
			if (msgStruct.hasError()) {
				return;
			}
			
			// �u�ԕi�ۊǋ�R�[�h�v���݃`�F�b�N
			List whList = entity.mM_WH.read(conn, struct);
			if (whList.isEmpty()) {
				// �G���[
				setErrorMessage("AE00134");
				setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
			} else {
				// �ۊǋ�.�H��R�[�h�����O�C�����[�U�̍H��R�[�h�ƈقȂ�ꍇ�G���[
				AE0120010Struct whStruct = (AE0120010Struct)(whList.get(0));
				if (sysPLANT_CD.equals(whStruct.getPLANT_CD()) == false) {
					// �G���[
					setErrorMessage("AE00135");
					setErrorParameter("T_JOB_ODR", "JOB_ODR_CD", struct.getJOB_ODR_CD());
					setErrorParameter("T_JOB_ODR", "PLANT_CD", whStruct.getPLANT_CD());
					return;
				}
				// �ۊǋ�.���v�ʌv�Z�Ώۃt���O=0�F��̏ꍇ�G���[
				if ("0".equals(whStruct.getMRP_FLG())) {
					// �G���[
					setErrorMessage("AE00136");
					setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
					setErrorParameter("M_WH", "MRP_FLG", whStruct.getMRP_FLG());
				}
				// �ۊǋ�.�q�ɋ敪=40�F�����҂��ۊǋ�̏ꍇ�G���[
				if ("40".equals(whStruct.getWH_TYP())) {
					// �G���[
					setErrorMessage("AE00164");
					setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
					setErrorParameter("M_WH", "WH_TYP", whStruct.getWH_TYP());
				}
			}
			
			// �G���[������ΏI��
			if (msgStruct.hasError()) {
				return;
			}
			
			// �u�����S���ҁv���݃`�F�b�N
			if (struct.getPUCH_ODR_PERSON() != null 
					&& "".equals(struct.getPUCH_ODR_PERSON()) == false) {
				List userList = entity.mUSER_MST.read(conn, struct);
				if (userList.isEmpty()) {
					// �G���[
					setErrorMessage("AE00137");
					setErrorParameter("USER_MST", "USER_CD", struct.getPUCH_ODR_PERSON());
				}
			}
			
			// [�ʉ�]�����擾
			CurStruct cs = null;
			try {
				cs =
						CurControl.getData(conn, struct.getCOMPANY_CD(), struct.getVEND_CD());
			} catch(DataNotFoundException dnfe) {
				throw new ExpjException(dnfe);
			}
					
			String netAmount = "0";
			String discAmount = "0";
			String puchOdrAmount = "0";
			int figure = Integer.parseInt(cs.getDECIMAL_FIG());
			
			// �ԕi���z���Čv�Z����
			
			puchOdrAmount =
					AmountCalculator.calcPuchOdrAmount(
							struct.getPUCH_RTN_QTY(),
							struct.getUNIT_COST(),
							cs.getROUND_TYP(),
							cs.getDECIMAL_FIG());
            if(!com.nec.jp.orteus.expj.util.Calculate.isNotInNumRange(puchOdrAmount)){
                // �����ꍀ�ڎ擾�Z�b�g
               String ErrInfo = CoreTools.getRBString("Expj.PUCH_ODR_AMOUNT_3", resource);
           	   setErrorMessage("AA00215",ErrInfo);
           	   return;
             }
			// �v�Z���ʂ� �{�̋��z �� �ԕi���z �| �l�����z �łȂ��ꍇ�G���[
			String amount = Calculate.subtract(puchOdrAmount, struct.getDISC_AMOUNT());
			if (Calculate.compare(struct.getNET_AMOUNT(), amount) != 0) {
				// �G���[
				setErrorMessage("AE00147");
			}
			
			// ����ŋ敪���݃`�F�b�N
			List taxList = entity.mM_TAX.read(conn, struct);
			if (taxList.isEmpty()) {
				// �G���[
				setErrorMessage("AA01001");
				setErrorParameter("M_TAX", "TAX_CD", struct.getTAX_CD());
			}
			
			// �G���[������ΏI��
			if (msgStruct.hasError()) {
				return;
			}
			
			// �݌ɍX�V
			// �u���i�w���v��off�̏ꍇ
			if ("true".equals(struct.getc_NON_NO_ITEM_FLG()) == false) {
				
				updateStock(conn, struct, null, 1);
				// �G���[������ΏI��
				if (msgStruct.hasError()) {
					return;
				}
			}
			
			// �w���ԕi���эX�V
			// �����ԍ��̔�
			String puchOdrCd = null;
			Numbering numbering = new Numbering(
									conn,
									Numbering.PUCH_CD, 
									getsysUSER_CD(), 
									this.sp.getProcId(), 
									sysPLANT_CD);
			try {
				puchOdrCd = numbering.getNo();
				if(puchOdrCd == null){
					ExpjMessage emsg = new ExpjMessage("AE00153");
					throw new FoundationException(
									"AE0120010Control",
									"controlInsert()",
									emsg.getMessage(CoreTools.getLocale(this.getsysUSER_CD())));
				}
			} catch(FoundationException ex) {
				// �o�^�������s�F�����ԍ��̍̔ԂɎ��s���܂���
				setErrorMessage("AE00153");
				ExpjMessage emsg = new ExpjMessage("ZZ01106");
				sysLog.severe(emsg, getsysUSER_CD());
				ExpjException ee = new ExpjException(ex, emsg);
				throw ee;
			}
			
			// �w���ԕi���ђǉ�
			updatePuchOdrRtnRslt(conn, struct, null, puchOdrCd, 1);
			if (msgStruct.hasError()) {
				return;
			}
			
			if("".equals(struct.getITEM_CD()) || struct.getITEM_CD() == null){
				updatePastInspcAcptIF(conn, struct, null, null,puchOdrCd, 1);
			}else{
				// ���������A�������я��C���^�[�t�F�[�X�ǉ�
				//�󋋋敪��2:������
				if (!itemList.isEmpty()) {
					itemStruct = (AE0120010Struct) (itemList.get(0));
					if ("2".equals(itemStruct.getSPL_ITEM_TYP()) == false) {
						updatePastInspcAcptIF(conn, struct, null, itemStruct,puchOdrCd, 1);
					}
				}
			}

			// �̔Ԍ�̔����ԍ���ݒ�
			struct.setPUCH_ODR_CD(puchOdrCd);
			
			// �o�^��f�[�^�ĕ\��
			controlSelect();
			
			conn.commit();
			
		} catch(ParseException e) {
			throw new ExpjException(e);
		} catch(DataNotFoundException e) {
			throw new ExpjException(e);
		} catch(SQLException e) {
			throw new ExpjException(e);
		} catch(ResourceBusyException rbe) {
			rbe.printStackTrace();
			setErrorMessage("ZZ01105");
			setReadStatus(ERROR);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
                //}}user_implement_dev:<controlInsert>
		logger.exiting("AE0120010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0120");
		logger.entering("AE0120010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			// ���Y���̉ߋ��̎��ѓ��͂̐����`�F�b�N
			if(getSysParameter() == false){
				if(chkProcExecDate("2",struct.geth_PUCH_RTN_DATE(),struct.getPUCH_RTN_DATE()) == false){
					setErrorMessage(ProcExecDateError);
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
					return;
				}
			}
			
			// �i�ڑ��݃`�F�b�N
			AE0120010Struct itemStruct = null;
			List itemList = entity.mM_ITEM.read(conn, struct);
			if ("".equals(struct.getITEM_CD()) == false) {
				if (itemList.isEmpty()) {
					// �G���[
					setErrorMessage("AE00118");
					setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
					return;
				} else {
					itemStruct = (AE0120010Struct) (itemList.get(0));
					//�u���i�w���v��Off�̏ꍇ
					if ("true".equals(struct.getc_NON_NO_ITEM_FLG()) == false) {
						struct.setITEM_NAME(itemStruct.getITEM_NAME());
					}
					
					if ("1".equals(itemStruct.getUNIT_QTY_TYP()) == true && Calculate.isInteger(struct.getPUCH_RTN_QTY()) == false) {
						// �G���[
						setErrorMessage("AE00146");
						setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
						setErrorParameter("M_ITEM", "UNIT_QTY_TYP", itemStruct.getUNIT_QTY_TYP());
						return;
					}
				}
			}
			DateCtrlStruct dcs = DateCtrlControl.getData(conn, sysPLANT_CD);
			if (DateTool.compareYMD(struct.getPUCH_RTN_DATE(), dcs.getBUSINESS_OPR_DATE()) > 0) {
				setErrorMessage("AE00117");
				setErrorParameter("SYS_DATE_CTRL", "PLANT_CD", sysPLANT_CD);
				setErrorParameter(
					"SYS_DATE_CTRL",
					"BUSINESS_OPR_DATE",
					dcs.getBUSINESS_OPR_DATE());
				setErrorParameter(
					"T_PUCH_ODR_RTN_DATE",
					"PUCH_RTN_DATE",
					struct.getPUCH_RTN_DATE());
			}
			
			// ���Ԍv�摶�݃`�F�b�N
			if (struct.getJOB_ODR_CD() != null && "".equals(struct.getJOB_ODR_CD()) == false) {
				List jobOdrList = entity.mT_JOB_ODR.read(conn, struct);
				if (jobOdrList.isEmpty()) {
					// �G���[
					setErrorMessage("AE00110");
					setErrorParameter("T_JOB_ODR", "JOB_ODR_CD", struct.getJOB_ODR_CD());
					return;
				} else {
					// ���Ԍv��.�H��R�[�h�����O�C�����[�U�̍H��R�[�h�ƈقȂ�ꍇ�G���[
					AE0120010Struct jobOdrStruct = (AE0120010Struct)(jobOdrList.get(0));
					if (sysPLANT_CD.equals(jobOdrStruct.getPLANT_CD()) == false) {
						// �G���[
						setErrorMessage("AE00115");
						setErrorParameter("T_JOB_ODR", "JOB_ODR_CD", struct.getJOB_ODR_CD());
						setErrorParameter("T_JOB_ODR", "PLANT_CD", jobOdrStruct.getPLANT_CD());
						return;
					}
				}
			}
			
			// �u�ԕi�ۊǋ�R�[�h�v���݃`�F�b�N
			List whList = entity.mM_WH.read(conn, struct);
			if (whList.isEmpty()) {
				// �G���[
				setErrorMessage("AE00134");
				setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
				return;
			} else {
				// �ۊǋ�.�H��R�[�h�����O�C�����[�U�̍H��R�[�h�ƈقȂ�ꍇ�G���[
				AE0120010Struct whStruct = (AE0120010Struct)(whList.get(0));
				if (sysPLANT_CD.equals(whStruct.getPLANT_CD()) == false) {
					// �G���[
					setErrorMessage("AE00135");
					setErrorParameter("T_JOB_ODR", "JOB_ODR_CD", struct.getJOB_ODR_CD());
					setErrorParameter("T_JOB_ODR", "PLANT_CD", whStruct.getPLANT_CD());
					return;
				}
				// �ۊǋ�.���v�ʌv�Z�Ώۃt���O=0�F��̏ꍇ�G���[
				if ("0".equals(whStruct.getMRP_FLG())) {
					// �G���[
					setErrorMessage("AE00136");
					setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
					setErrorParameter("M_WH", "MRP_FLG", whStruct.getMRP_FLG());
				}
				// �ۊǋ�.�q�ɋ敪=40�F�����҂��ۊǋ�̏ꍇ�G���[
				if ("40".equals(whStruct.getWH_TYP())) {
					// �G���[
					setErrorMessage("AE00164");
					setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
					setErrorParameter("M_WH", "WH_TYP", whStruct.getWH_TYP());
				}
			}
			
			// �u�����S���ҁv���݃`�F�b�N
			if (struct.getPUCH_ODR_PERSON() != null 
					&& "".equals(struct.getPUCH_ODR_PERSON()) == false) {
				List userList = entity.mUSER_MST.read(conn, struct);
				if (userList.isEmpty()) {
					// �G���[
					setErrorMessage("AE00137");
					setErrorParameter("USER_MST", "USER_CD", struct.getPUCH_ODR_PERSON());
				}
			}
			
			// [�ʉ�]�����擾
			CurStruct cs = null;
			try {
				cs =
					CurControl.getData(conn, struct.getCOMPANY_CD(), struct.getVEND_CD());
			} catch(DataNotFoundException dnfe) {
				throw new ExpjException(dnfe);
			}
					
			String netAmount = "0";
			String discAmount = "0";
			String puchOdrAmount = "0";
			int figure = Integer.parseInt(cs.getDECIMAL_FIG());
			
			// �ԕi���z���Čv�Z����
			
			puchOdrAmount =
					AmountCalculator.calcPuchOdrAmount(
							struct.getPUCH_RTN_QTY(),
							struct.getUNIT_COST(),
							cs.getROUND_TYP(),
							cs.getDECIMAL_FIG());
            if(!com.nec.jp.orteus.expj.util.Calculate.isNotInNumRange(puchOdrAmount)){
                // �����ꍀ�ڎ擾�Z�b�g
               String ErrInfo = CoreTools.getRBString("Expj.PUCH_ODR_AMOUNT_3", resource);
          	   setErrorMessage("AA00215",ErrInfo);
          	   return;
            }
			// �v�Z���ʂ� �{�̋��z �� �ԕi���z �| �l�����z �łȂ��ꍇ�G���[
			String amount = Calculate.subtract(puchOdrAmount, struct.getDISC_AMOUNT());
			if (Calculate.compare(struct.getNET_AMOUNT(), amount) != 0) {
				// �G���[
				setErrorMessage("AE00147");
			}
			
			// ����ŋ敪���݃`�F�b�N
			List taxList = entity.mM_TAX.read(conn, struct);
			if (taxList.isEmpty()) {
				// �G���[
				setErrorMessage("AA01001");
				setErrorParameter("M_TAX", "TAX_CD", struct.getTAX_CD());
			}
			
			// �G���[������ΏI��
			if (msgStruct.hasError()) {
				return;
			}
			
			// �݌ɍX�V����
			// ��ʓ��͒l��ޔ�
			AE0120010Struct formStruct = new AE0120010Struct();
			formStruct.setStruct(struct);
			
			// �w���ԕi�ԍ����L�[�ɍēǍ�
			List puchOdrRtnRsltList = entity.mT_PUCH_ODR_RTN_RSLT_LOCK.read(conn, struct);
			if (puchOdrRtnRsltList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setErrorParameter("T_PUCH_ODR_RTN_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}
			AE0120010Struct puchOdrRtnRsltStruct = (AE0120010Struct)(puchOdrRtnRsltList.get(0));
			
			// [�w���ԕi����]�̍X�V�����قȂ�ꍇ�G���[
			if ((puchOdrRtnRsltStruct.getMODIFY_COUNT()).equals(
					formStruct.getMODIFY_COUNT()) == false) {
				setErrorMessage("ZZ01105");
				return;
			}
			
			if ((Calculate.compare(
					formStruct.getPUCH_RTN_QTY(), puchOdrRtnRsltStruct.getPUCH_RTN_QTY()) != 0 
					|| formStruct.getWH_CD().equals(puchOdrRtnRsltStruct.getWH_CD()) == false 
					|| formStruct.getPUCH_RTN_DATE().equals(
							puchOdrRtnRsltStruct.getPUCH_RTN_DATE()) == false) 
					&& "true".equals(formStruct.getc_NON_NO_ITEM_FLG()) == false) {
				
				// �݌Ƀv���X�X�V
				updateStock(conn, formStruct, puchOdrRtnRsltStruct, 2);
				
				// �݌Ƀ}�C�i�X�X�V
				updateStock(conn, formStruct, null, 1);
				// �G���[������ΏI��
				if (msgStruct.hasError()) {
					return;
				}
				
			}
			
			// �w���ԕi���эX�V
			updatePuchOdrRtnRslt(conn, formStruct, puchOdrRtnRsltStruct, 
					formStruct.getPUCH_ODR_CD(), 2);
			if (msgStruct.hasError()) {
				return;
			}
						
			// ��ʂ̏���ݒ�
			puchOdrRtnRsltStruct.setc_NON_NO_ITEM_FLG(formStruct.getc_NON_NO_ITEM_FLG()); // ���i�w��
			puchOdrRtnRsltStruct.setPUCH_RTN_DATE(formStruct.getPUCH_RTN_DATE()); // �ԕi��
			puchOdrRtnRsltStruct.setJOB_ODR_CD(formStruct.getJOB_ODR_CD()); // ����
			
			if("".equals(struct.getITEM_CD()) || struct.getITEM_CD() == null){
				// ���f�[�^
				updatePastInspcAcptIF(conn, formStruct,puchOdrRtnRsltStruct,
						null, struct.getPUCH_ODR_CD(), 2);
				// �ԃf�[�^
				updatePastInspcAcptIF(conn, formStruct,puchOdrRtnRsltStruct, 
						null, struct.getPUCH_ODR_CD(), 3);
			}else{
				// ���������A�������я��C���^�[�t�F�[�X�ǉ�
				if (!itemList.isEmpty()) {
					itemStruct = (AE0120010Struct) (itemList.get(0));
					if ("2".equals(itemStruct.getSPL_ITEM_TYP()) == false) {
						// �i�ڂ̏���ݒ�
						puchOdrRtnRsltStruct.setITEM_NAME(struct.getITEM_NAME()); // �i�ږ�
						puchOdrRtnRsltStruct.setSTOCK_UNIT(itemStruct.getSTOCK_UNIT()); // �v�ʒP��
						puchOdrRtnRsltStruct.setPRODUCT_TYP(itemStruct.getPRODUCT_TYP()); // ���i�敪
						puchOdrRtnRsltStruct.setCLASIFICATION_CD(itemStruct.getCLASIFICATION_CD()); // �Ǘ��R�[�h
						// ���f�[�^
						updatePastInspcAcptIF(conn, formStruct,puchOdrRtnRsltStruct,
								itemStruct, struct.getPUCH_ODR_CD(), 2);
						// �ԃf�[�^
						updatePastInspcAcptIF(conn, formStruct,puchOdrRtnRsltStruct, 
								itemStruct, struct.getPUCH_ODR_CD(), 3);
					}
				}
			}

			// �X�V��f�[�^�ĕ\��
			controlSelect();
			
			conn.commit();
			
		} catch(ParseException e) {
			throw new ExpjException(e);
		} catch(DataNotFoundException e) {
			throw new ExpjException(e);
		} catch(SQLException e) {
			throw new ExpjException(e);
		} catch(ResourceBusyException rbe) {
			rbe.printStackTrace();
			setErrorMessage("ZZ01105");
			setReadStatus(ERROR);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
                //}}user_implement_dev:<controlUpdate>
		logger.exiting("AE0120010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * �폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0120");
		logger.entering("AE0120010Control"+":USER="+struct.getsUser_ID(),"controlDelete");
			//{{user_implement_dev:<controlDelete>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			
			AE0120010Struct formStruct = new AE0120010Struct();
			formStruct.setStruct(struct);
			
			
			// ���Y���̉ߋ��̎��ѓ��͂̐����`�F�b�N
			if(getSysParameter() == false){
				if(chkProcExecDate("3",struct.geth_PUCH_RTN_DATE(),struct.getPUCH_RTN_DATE()) == false){
					setErrorMessage(ProcExecDateError);
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
					return;
				}
			}
					
			// �w���ԕi�ԍ����L�[�ɍēǍ��ƃ��b�N
			List puchOdrRtnRsltList = entity.mT_PUCH_ODR_RTN_RSLT_LOCK.read(conn, struct);
			if (puchOdrRtnRsltList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setErrorParameter("T_PUCH_ODR_RTN_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}
			AE0120010Struct puchOdrRtnRsltStruct = (AE0120010Struct)(puchOdrRtnRsltList.get(0));
			
			// [�w���ԕi����]�̍X�V�����قȂ�ꍇ�G���[
			if ((puchOdrRtnRsltStruct.getMODIFY_COUNT()).equals(formStruct.getMODIFY_COUNT()) == false) {
				setErrorMessage("ZZ01105");
				return;
			}
			if ("true".equals(struct.getc_NON_NO_ITEM_FLG()) == false) {
				// �݌ɍX�V
				updateStock(conn, formStruct, puchOdrRtnRsltStruct, 3);
				// �G���[������ΏI��
				if (msgStruct.hasError()) {
					return;
				}
			}

			// [�w���ԕi����]�̘_���폜
			updatePuchOdrRtnRslt(conn, formStruct, null, formStruct.getPUCH_ODR_CD(), 3);
			if (msgStruct.hasError()) {
				return;
			}
			
			puchOdrRtnRsltStruct.setc_NON_NO_ITEM_FLG(struct.getc_NON_NO_ITEM_FLG()); // ���i�w��
			
			if("".equals(struct.getITEM_CD()) || struct.getITEM_CD() == null){
				updatePastInspcAcptIF(conn, formStruct,puchOdrRtnRsltStruct, 
						null, struct.getPUCH_ODR_CD(), 4);
			}else{
				// ���������A�������я��C���^�[�t�F�[�X�ǉ�
				AE0120010Struct itemStruct = null;
				List itemList = entity.mM_ITEM.read(conn, struct);
				//�u�i�ڔԍ��v��Null�ł͂Ȃ��̏ꍇ
				if ("".equals(struct.getITEM_CD()) == false) {
					if (itemList.isEmpty()) {
						// �G���[
						setErrorMessage("AE00118");
						setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
						return;
					} else {
						itemStruct = (AE0120010Struct) (itemList.get(0));
						if ("2".equals(itemStruct.getSPL_ITEM_TYP()) == false) {
							// �i�ڂ̏���ݒ�
							puchOdrRtnRsltStruct.setCLASIFICATION_CD(itemStruct.getCLASIFICATION_CD()); // �Ǘ��R�[�h
							updatePastInspcAcptIF(conn, formStruct,puchOdrRtnRsltStruct, 
									itemStruct, struct.getPUCH_ODR_CD(), 4);
						}
					}
				}
			}

			conn.commit();
			
			initializeAll();
			
		} catch(ParseException e) {
			throw new ExpjException(e);
		} catch(DataNotFoundException e) {
			throw new ExpjException(e);
		} catch(SQLException e) {
			throw new ExpjException(e);
		} catch(ResourceBusyException rbe) {
			rbe.printStackTrace();
			setErrorMessage("ZZ01105");
			setReadStatus(ERROR);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
                //}}user_implement_dev:<controlDelete>
		logger.exiting("AE0120010Control"+":USER="+struct.getsUser_ID(),"controlDelete");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0120");
		logger.entering("AE0120010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			
		try {
			
			// ��ʂ�������
			initializeAll();
			
		} catch (FoundationException e) {
			throw new ExpjException(e);
		} catch (SQLException e) {
			throw new ExpjException(e);
		} catch (DataNotFoundException e) {
			throw new ExpjException(e);
		}
                //}}user_implement_dev:<controlClear>
		logger.exiting("AE0120010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0120");
		logger.entering("AE0120010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AE0120010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0120");
		logger.entering("AE0120010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			// �f�[�^�x�[�X�ւ̃A�N�Z�X���s���ꍇ�́A����try catch���̃R�����g���O���Ă��������B
		try {
			// [����]���𕔕i���擾			
			_myCompanyStruct = MyCompanyControl.getData(conn);
			
			// [�Ŗ�]���𕔕i���擾			
			_taxNameStruct = TaxNameControl.getData(conn);
			
			// [�M��]���𕔕i���擾			
			_homeCurStruct = HomeCurControl.getData(conn);
			
			// �R���{�{�b�N�X�f�[�^�𕔕i���擾
			ComboBox cdac = new ComboBox(conn, sysUSER_CD);
			_unitCostTypStruct = cdac.getData("UNIT_COST_TYP");
			_productTypStruct = cdac.getData("PRODUCT_TYP");
			cdac.setConnection(null);
			
			// ��ʂ�������
			initializeAll();
			
			if(LotCtrl.checkLotCtrl(conn)){
				lotCtrl = "true";
			    struct.seth_lotCtrl(lotCtrl);

			}else{
				lotCtrl = "false";
				struct.seth_lotCtrl(lotCtrl);

			}
			
			// ��ʑJ�ڂ̌Ăяo����������AStruct�ɉ�ʑJ�ڃL�[��ݒ肵��controlselect()���Ăяo��
			if (isScreenMove() == true) {
				// �L�[�ƂȂ鍀�ڂ�struct�Ɋi�[���āA�����̃R���g���[�����\�b�h���Ăяo���܂��B
              struct.setPUCH_ODR_CD(getPuchOdrCd());
              
              controlSelect();

			}
			
		} catch (FoundationException e) {
			throw new ExpjException(e);
		} catch (SQLException e) {
			throw new ExpjException(e);
		} catch (DataNotFoundException e) {
			throw new ExpjException(e);
		} catch (ComboException e) {
			throw new ExpjException(e);
		}
	
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AE0120010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0120");
		logger.entering("AE0120010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
                 // �R���{�{�b�N�X�f�[�^�𕔕i���擾
		try {
			ComboBox cdac = new ComboBox(conn, sysUSER_CD);
			_unitCostTypStruct = cdac.getData("UNIT_COST_TYP");
			_productTypStruct = cdac.getData("PRODUCT_TYP");
			cdac.setConnection(null);
		} catch (SQLException e) {
			throw new ExpjException(e);
		} catch (ComboException e) {
			throw new ExpjException(e);
		}
			// �R���{�{�b�N�X���i�̃f�[�^�̃Z�b�g�͂����ɋL�q���Ă��������B
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AE0120010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("SelectUnitCost") ) {
				controlSelectUnitCost();
			} else if( button.equals("Insert") ) {
				controlInsert();
			} else if( button.equals("Update") ) {
				controlUpdate();
			} else if( button.equals("Delete") ) {
				controlDelete();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			struct.seth_lotCtrl(lotCtrl);
			struct.setCOMPANY_CD(_myCompanyStruct.getCOMPANY_CD());
			struct.setHOME_CUR_UNIT(_homeCurStruct.getCUR_UNIT());
			struct.setHOME_DECIMAL_FIG(_homeCurStruct.getDECIMAL_FIG());
//		�\�[�X���ɂ܂�AlarmMessageException���c���Ă���ꍇ�́A�ȉ��̍s�̃R�����g���O����AlarmMessageException���n������B
//		} catch(AlarmMessageException ame){
//			ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
//			throw ee;
			struct.setList_UNIT_COST_TYP_val(_unitCostTypStruct.getValList());
			struct.setList_UNIT_COST_TYP_name(_unitCostTypStruct.getExplanList());
			struct.setList_PRODUCT_TYP_val(_productTypStruct.getValList());
            struct.setList_PRODUCT_TYP_name(_productTypStruct.getExplanList());
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// �g���b�Z�[�W�o�͈˗��쐬
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AE0120010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0120010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AE0120010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0120010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AE0120010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0120010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AE0120010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AE0120010Entity entity;
	protected AE0120010Struct struct;
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

		entity = new AE0120010Entity();
		struct = new AE0120010Struct();

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
	 * AE0120010�N���X�̕W���R���X�g���N�^
	 */
	public AE0120010Control() throws BusinessProcessException, FoundationException
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
				AE0120010Struct key = (AE0120010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("h_PUCH_ODR_CD") && key.geth_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("h_PUCH_ODR_CD", key.geth_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_name") && key.getUNIT_COST_TYP_name() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP_name", key.getUNIT_COST_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_val") && key.getUNIT_COST_TYP_val() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP_val", key.getUNIT_COST_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("r1_FILTER") && key.getr1_FILTER() != null) {
					msgKey.setKeyValue("r1_FILTER", key.getr1_FILTER());
				}
				if(msgKeyType.containsKeyColumn("r2_FILTER") && key.getr2_FILTER() != null) {
					msgKey.setKeyValue("r2_FILTER", key.getr2_FILTER());
				}
				if(msgKeyType.containsKeyColumn("HOME_CUR_UNIT") && key.getHOME_CUR_UNIT() != null) {
					msgKey.setKeyValue("HOME_CUR_UNIT", key.getHOME_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("c_NON_NO_ITEM_FLG") && key.getc_NON_NO_ITEM_FLG() != null) {
					msgKey.setKeyValue("c_NON_NO_ITEM_FLG", key.getc_NON_NO_ITEM_FLG());
				}
				if(msgKeyType.containsKeyColumn("SelectUnitCostFlag") && key.getSelectUnitCostFlag() != null) {
					msgKey.setKeyValue("SelectUnitCostFlag", key.getSelectUnitCostFlag());
				}
				if(msgKeyType.containsKeyColumn("h_PUCH_RTN_DATE") && key.geth_PUCH_RTN_DATE() != null) {
					msgKey.setKeyValue("h_PUCH_RTN_DATE", key.geth_PUCH_RTN_DATE());
				}
				if(msgKeyType.containsKeyColumn("PRODUCT_TYP_name") && key.getPRODUCT_TYP_name() != null) {
					msgKey.setKeyValue("PRODUCT_TYP_name", key.getPRODUCT_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("PRODUCT_TYP_val") && key.getPRODUCT_TYP_val() != null) {
					msgKey.setKeyValue("PRODUCT_TYP_val", key.getPRODUCT_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("h_lotCtrl") && key.geth_lotCtrl() != null) {
					msgKey.setKeyValue("h_lotCtrl", key.geth_lotCtrl());
				}
				if(msgKeyType.containsKeyColumn("HOME_DECIMAL_FIG") && key.getHOME_DECIMAL_FIG() != null) {
					msgKey.setKeyValue("HOME_DECIMAL_FIG", key.getHOME_DECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE") && key.getEFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("EFF_PHASE_IN_DATE", key.getEFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("PUCH_SIZE") && key.getPUCH_SIZE() != null) {
					msgKey.setKeyValue("PUCH_SIZE", key.getPUCH_SIZE());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP") && key.getEXCH_TYP() != null) {
					msgKey.setKeyValue("EXCH_TYP", key.getEXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("CUR_SYMBOL") && key.getCUR_SYMBOL() != null) {
					msgKey.setKeyValue("CUR_SYMBOL", key.getCUR_SYMBOL());
				}
				if(msgKeyType.containsKeyColumn("CUR_UNIT") && key.getCUR_UNIT() != null) {
					msgKey.setKeyValue("CUR_UNIT", key.getCUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("DECIMAL_FIG") && key.getDECIMAL_FIG() != null) {
					msgKey.setKeyValue("DECIMAL_FIG", key.getDECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP") && key.getTAX_APPLY_TYP() != null) {
					msgKey.setKeyValue("TAX_APPLY_TYP", key.getTAX_APPLY_TYP());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_ANAME") && key.getVEND_ANAME() != null) {
					msgKey.setKeyValue("VEND_ANAME", key.getVEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO") && key.getJOB_ODR_DETAIL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_DETAIL_NO", key.getJOB_ODR_DETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("INV_CTRL_FLG") && key.getINV_CTRL_FLG() != null) {
					msgKey.setKeyValue("INV_CTRL_FLG", key.getINV_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON") && key.getPUCH_ODR_PERSON() != null) {
					msgKey.setKeyValue("PUCH_ODR_PERSON", key.getPUCH_ODR_PERSON());
				}
				if(msgKeyType.containsKeyColumn("PUCH_RTN_DATE") && key.getPUCH_RTN_DATE() != null) {
					msgKey.setKeyValue("PUCH_RTN_DATE", key.getPUCH_RTN_DATE());
				}
				if(msgKeyType.containsKeyColumn("PUCH_RTN_QTY") && key.getPUCH_RTN_QTY() != null) {
					msgKey.setKeyValue("PUCH_RTN_QTY", key.getPUCH_RTN_QTY());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("VEND_LOT_NO") && key.getVEND_LOT_NO() != null) {
					msgKey.setKeyValue("VEND_LOT_NO", key.getVEND_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO") && key.getLOT_NO() != null) {
					msgKey.setKeyValue("LOT_NO", key.getLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("CUR_CD") && key.getCUR_CD() != null) {
					msgKey.setKeyValue("CUR_CD", key.getCUR_CD());
				}
				if(msgKeyType.containsKeyColumn("CUR_NAME") && key.getCUR_NAME() != null) {
					msgKey.setKeyValue("CUR_NAME", key.getCUR_NAME());
				}
				if(msgKeyType.containsKeyColumn("VEND_CUR_UNIT") && key.getVEND_CUR_UNIT() != null) {
					msgKey.setKeyValue("VEND_CUR_UNIT", key.getVEND_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("VEND_DECIMAL_FIG") && key.getVEND_DECIMAL_FIG() != null) {
					msgKey.setKeyValue("VEND_DECIMAL_FIG", key.getVEND_DECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("USER_NAME") && key.getUSER_NAME() != null) {
					msgKey.setKeyValue("USER_NAME", key.getUSER_NAME());
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
				if(msgKeyType.containsKeyColumn("PUCH_ODR_AMOUNT") && key.getPUCH_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("PUCH_ODR_AMOUNT", key.getPUCH_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("DISC_AMOUNT") && key.getDISC_AMOUNT() != null) {
					msgKey.setKeyValue("DISC_AMOUNT", key.getDISC_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("NET_AMOUNT") && key.getNET_AMOUNT() != null) {
					msgKey.setKeyValue("NET_AMOUNT", key.getNET_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PUCH_RTN_COMMENT") && key.getPUCH_RTN_COMMENT() != null) {
					msgKey.setKeyValue("PUCH_RTN_COMMENT", key.getPUCH_RTN_COMMENT());
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
				if(msgKeyType.containsKeyColumn("ROUND_TYP") && key.getROUND_TYP() != null) {
					msgKey.setKeyValue("ROUND_TYP", key.getROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD") && key.getTAX_CD() != null) {
					msgKey.setKeyValue("TAX_CD", key.getTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP") && key.getTAX_ROUND_TYP() != null) {
					msgKey.setKeyValue("TAX_ROUND_TYP", key.getTAX_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("RTN_DEL_FLG") && key.getRTN_DEL_FLG() != null) {
					msgKey.setKeyValue("RTN_DEL_FLG", key.getRTN_DEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("NON_NO_ITEM_TYP") && key.getNON_NO_ITEM_TYP() != null) {
					msgKey.setKeyValue("NON_NO_ITEM_TYP", key.getNON_NO_ITEM_TYP());
				}
				if(msgKeyType.containsKeyColumn("NON_NO_ITEM_NAME") && key.getNON_NO_ITEM_NAME() != null) {
					msgKey.setKeyValue("NON_NO_ITEM_NAME", key.getNON_NO_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("NON_NO_ITEM_PUCH_ODR_UNIT") && key.getNON_NO_ITEM_PUCH_ODR_UNIT() != null) {
					msgKey.setKeyValue("NON_NO_ITEM_PUCH_ODR_UNIT", key.getNON_NO_ITEM_PUCH_ODR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("ITEM_TYP") && key.getITEM_TYP() != null) {
					msgKey.setKeyValue("ITEM_TYP", key.getITEM_TYP());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("RTN_DEL_DATE") && key.getRTN_DEL_DATE() != null) {
					msgKey.setKeyValue("RTN_DEL_DATE", key.getRTN_DEL_DATE());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP") && key.getSPL_ITEM_TYP() != null) {
					msgKey.setKeyValue("SPL_ITEM_TYP", key.getSPL_ITEM_TYP());
				}
				if(msgKeyType.containsKeyColumn("PRODUCT_TYP") && key.getPRODUCT_TYP() != null) {
					msgKey.setKeyValue("PRODUCT_TYP", key.getPRODUCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("CLASIFICATION_CD") && key.getCLASIFICATION_CD() != null) {
					msgKey.setKeyValue("CLASIFICATION_CD", key.getCLASIFICATION_CD());
				}
				if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG") && key.getLOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("LOT_CTRL_FLG", key.getLOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD_2") && key.getPUCH_ODR_CD_2() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD_2", key.getPUCH_ODR_CD_2());
				}
				if(msgKeyType.containsKeyColumn("MRP_FLG") && key.getMRP_FLG() != null) {
					msgKey.setKeyValue("MRP_FLG", key.getMRP_FLG());
				}
				if(msgKeyType.containsKeyColumn("WH_TYP") && key.getWH_TYP() != null) {
					msgKey.setKeyValue("WH_TYP", key.getWH_TYP());
				}
				if(msgKeyType.containsKeyColumn("THIS_MONTH") && key.getTHIS_MONTH() != null) {
					msgKey.setKeyValue("THIS_MONTH", key.getTHIS_MONTH());
				}
				if(msgKeyType.containsKeyColumn("INSTALL_FLG") && key.getINSTALL_FLG() != null) {
					msgKey.setKeyValue("INSTALL_FLG", key.getINSTALL_FLG());
				}
				if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY") && key.getSTOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("STOCK_ON_HAND_QTY", key.getSTOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD") && key.getRCV_ISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CTRL_CD", key.getRCV_ISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP") && key.getRCV_ISSUE_TYP() != null) {
					msgKey.setKeyValue("RCV_ISSUE_TYP", key.getRCV_ISSUE_TYP());
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
				if(msgKeyType.containsKeyColumn("PARTIAL_PRD_NO") && key.getPARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("PARTIAL_PRD_NO", key.getPARTIAL_PRD_NO());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_CRCT_NO") && key.getOPR_RSLT_CRCT_NO() != null) {
					msgKey.setKeyValue("OPR_RSLT_CRCT_NO", key.getOPR_RSLT_CRCT_NO());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_BEFORE_QTY") && key.getRCV_ISSUE_BEFORE_QTY() != null) {
					msgKey.setKeyValue("RCV_ISSUE_BEFORE_QTY", key.getRCV_ISSUE_BEFORE_QTY());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_QTY") && key.getRCV_ISSUE_QTY() != null) {
					msgKey.setKeyValue("RCV_ISSUE_QTY", key.getRCV_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_AFTER_QTY") && key.getRCV_ISSUE_AFTER_QTY() != null) {
					msgKey.setKeyValue("RCV_ISSUE_AFTER_QTY", key.getRCV_ISSUE_AFTER_QTY());
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
				if(msgKeyType.containsKeyColumn("CONS_TYP") && key.getCONS_TYP() != null) {
					msgKey.setKeyValue("CONS_TYP", key.getCONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_NO") && key.getINSPC_ACPT_NO() != null) {
					msgKey.setKeyValue("INSPC_ACPT_NO", key.getINSPC_ACPT_NO());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_GNR_TYP") && key.getINSPC_ACPT_GNR_TYP() != null) {
					msgKey.setKeyValue("INSPC_ACPT_GNR_TYP", key.getINSPC_ACPT_GNR_TYP());
				}
				if(msgKeyType.containsKeyColumn("CRCT_NO") && key.getCRCT_NO() != null) {
					msgKey.setKeyValue("CRCT_NO", key.getCRCT_NO());
				}
				if(msgKeyType.containsKeyColumn("CRCT_TYP") && key.getCRCT_TYP() != null) {
					msgKey.setKeyValue("CRCT_TYP", key.getCRCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("SLIP_TYP") && key.getSLIP_TYP() != null) {
					msgKey.setKeyValue("SLIP_TYP", key.getSLIP_TYP());
				}
				if(msgKeyType.containsKeyColumn("ACPT_QTY") && key.getACPT_QTY() != null) {
					msgKey.setKeyValue("ACPT_QTY", key.getACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_QTY") && key.getINSPC_ACPT_QTY() != null) {
					msgKey.setKeyValue("INSPC_ACPT_QTY", key.getINSPC_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_AMOUNT") && key.getINSPC_ACPT_AMOUNT() != null) {
					msgKey.setKeyValue("INSPC_ACPT_AMOUNT", key.getINSPC_ACPT_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("SAVING_AMOUNT") && key.getSAVING_AMOUNT() != null) {
					msgKey.setKeyValue("SAVING_AMOUNT", key.getSAVING_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("ACPT_DATE") && key.getACPT_DATE() != null) {
					msgKey.setKeyValue("ACPT_DATE", key.getACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_DATE") && key.getINSPC_ACPT_DATE() != null) {
					msgKey.setKeyValue("INSPC_ACPT_DATE", key.getINSPC_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("SLIP_CD") && key.getSLIP_CD() != null) {
					msgKey.setKeyValue("SLIP_CD", key.getSLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("ORGN_SLIP_CD") && key.getORGN_SLIP_CD() != null) {
					msgKey.setKeyValue("ORGN_SLIP_CD", key.getORGN_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD") && key.getWORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("WORK_IN_PROC_CD", key.getWORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("DLV_CD") && key.getDLV_CD() != null) {
					msgKey.setKeyValue("DLV_CD", key.getDLV_CD());
				}
				if(msgKeyType.containsKeyColumn("GNR_ORG_CD") && key.getGNR_ORG_CD() != null) {
					msgKey.setKeyValue("GNR_ORG_CD", key.getGNR_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("SBCNT_PUCH_TYP") && key.getSBCNT_PUCH_TYP() != null) {
					msgKey.setKeyValue("SBCNT_PUCH_TYP", key.getSBCNT_PUCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("PUCH_RTN_FLG") && key.getPUCH_RTN_FLG() != null) {
					msgKey.setKeyValue("PUCH_RTN_FLG", key.getPUCH_RTN_FLG());
				}
				if(msgKeyType.containsKeyColumn("APPR_FLG") && key.getAPPR_FLG() != null) {
					msgKey.setKeyValue("APPR_FLG", key.getAPPR_FLG());
				}
				if(msgKeyType.containsKeyColumn("APPR_ID") && key.getAPPR_ID() != null) {
					msgKey.setKeyValue("APPR_ID", key.getAPPR_ID());
				}
				if(msgKeyType.containsKeyColumn("APPR_DATE") && key.getAPPR_DATE() != null) {
					msgKey.setKeyValue("APPR_DATE", key.getAPPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("PAST_RESULT_ENTRY_TYP") && key.getPAST_RESULT_ENTRY_TYP() != null) {
					msgKey.setKeyValue("PAST_RESULT_ENTRY_TYP", key.getPAST_RESULT_ENTRY_TYP());
				}
				if(msgKeyType.containsKeyColumn("AI_IF") && key.getAI_IF() != null) {
					msgKey.setKeyValue("AI_IF", key.getAI_IF());
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
				if(msgKeyType.containsKeyColumn("OLD_TAX_RATE_1") && key.getOLD_TAX_RATE_1() != null) {
					msgKey.setKeyValue("OLD_TAX_RATE_1", key.getOLD_TAX_RATE_1());
				}
				if(msgKeyType.containsKeyColumn("OLD_TAX_RATE_2") && key.getOLD_TAX_RATE_2() != null) {
					msgKey.setKeyValue("OLD_TAX_RATE_2", key.getOLD_TAX_RATE_2());
				}
				if(msgKeyType.containsKeyColumn("OLD_TAX_RATE_3") && key.getOLD_TAX_RATE_3() != null) {
					msgKey.setKeyValue("OLD_TAX_RATE_3", key.getOLD_TAX_RATE_3());
				}
				if(msgKeyType.containsKeyColumn("NEW_TAX_RATE_START_DATE") && key.getNEW_TAX_RATE_START_DATE() != null) {
					msgKey.setKeyValue("NEW_TAX_RATE_START_DATE", key.getNEW_TAX_RATE_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("NEW_TAX_RATE_1") && key.getNEW_TAX_RATE_1() != null) {
					msgKey.setKeyValue("NEW_TAX_RATE_1", key.getNEW_TAX_RATE_1());
				}
				if(msgKeyType.containsKeyColumn("NEW_TAX_RATE_2") && key.getNEW_TAX_RATE_2() != null) {
					msgKey.setKeyValue("NEW_TAX_RATE_2", key.getNEW_TAX_RATE_2());
				}
				if(msgKeyType.containsKeyColumn("NEW_TAX_RATE_3") && key.getNEW_TAX_RATE_3() != null) {
					msgKey.setKeyValue("NEW_TAX_RATE_3", key.getNEW_TAX_RATE_3());
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
					AE0120010Struct key = new AE0120010Struct();
					if(msgKeyType.containsKeyColumn("h_PUCH_ODR_CD")) {
						key.seth_PUCH_ODR_CD(msgKey.getKeyValue("h_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_name")) {
						key.setUNIT_COST_TYP_name(msgKey.getKeyValue("UNIT_COST_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_val")) {
						key.setUNIT_COST_TYP_val(msgKey.getKeyValue("UNIT_COST_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("r1_FILTER")) {
						key.setr1_FILTER(msgKey.getKeyValue("r1_FILTER"));
					}
					if(msgKeyType.containsKeyColumn("r2_FILTER")) {
						key.setr2_FILTER(msgKey.getKeyValue("r2_FILTER"));
					}
					if(msgKeyType.containsKeyColumn("HOME_CUR_UNIT")) {
						key.setHOME_CUR_UNIT(msgKey.getKeyValue("HOME_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("c_NON_NO_ITEM_FLG")) {
						key.setc_NON_NO_ITEM_FLG(msgKey.getKeyValue("c_NON_NO_ITEM_FLG"));
					}
					if(msgKeyType.containsKeyColumn("SelectUnitCostFlag")) {
						key.setSelectUnitCostFlag(msgKey.getKeyValue("SelectUnitCostFlag"));
					}
					if(msgKeyType.containsKeyColumn("h_PUCH_RTN_DATE")) {
						key.seth_PUCH_RTN_DATE(msgKey.getKeyValue("h_PUCH_RTN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PRODUCT_TYP_name")) {
						key.setPRODUCT_TYP_name(msgKey.getKeyValue("PRODUCT_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("PRODUCT_TYP_val")) {
						key.setPRODUCT_TYP_val(msgKey.getKeyValue("PRODUCT_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("h_lotCtrl")) {
						key.seth_lotCtrl(msgKey.getKeyValue("h_lotCtrl"));
					}
					if(msgKeyType.containsKeyColumn("HOME_DECIMAL_FIG")) {
						key.setHOME_DECIMAL_FIG(msgKey.getKeyValue("HOME_DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE")) {
						key.setEFF_PHASE_IN_DATE(msgKey.getKeyValue("EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_SIZE")) {
						key.setPUCH_SIZE(msgKey.getKeyValue("PUCH_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP")) {
						key.setEXCH_TYP(msgKey.getKeyValue("EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CUR_SYMBOL")) {
						key.setCUR_SYMBOL(msgKey.getKeyValue("CUR_SYMBOL"));
					}
					if(msgKeyType.containsKeyColumn("CUR_UNIT")) {
						key.setCUR_UNIT(msgKey.getKeyValue("CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("DECIMAL_FIG")) {
						key.setDECIMAL_FIG(msgKey.getKeyValue("DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP")) {
						key.setTAX_APPLY_TYP(msgKey.getKeyValue("TAX_APPLY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_ANAME")) {
						key.setVEND_ANAME(msgKey.getKeyValue("VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO")) {
						key.setJOB_ODR_DETAIL_NO(msgKey.getKeyValue("JOB_ODR_DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("INV_CTRL_FLG")) {
						key.setINV_CTRL_FLG(msgKey.getKeyValue("INV_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON")) {
						key.setPUCH_ODR_PERSON(msgKey.getKeyValue("PUCH_ODR_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_RTN_DATE")) {
						key.setPUCH_RTN_DATE(msgKey.getKeyValue("PUCH_RTN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_RTN_QTY")) {
						key.setPUCH_RTN_QTY(msgKey.getKeyValue("PUCH_RTN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("VEND_LOT_NO")) {
						key.setVEND_LOT_NO(msgKey.getKeyValue("VEND_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO")) {
						key.setLOT_NO(msgKey.getKeyValue("LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("CUR_CD")) {
						key.setCUR_CD(msgKey.getKeyValue("CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUR_NAME")) {
						key.setCUR_NAME(msgKey.getKeyValue("CUR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CUR_UNIT")) {
						key.setVEND_CUR_UNIT(msgKey.getKeyValue("VEND_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("VEND_DECIMAL_FIG")) {
						key.setVEND_DECIMAL_FIG(msgKey.getKeyValue("VEND_DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("USER_NAME")) {
						key.setUSER_NAME(msgKey.getKeyValue("USER_NAME"));
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
					if(msgKeyType.containsKeyColumn("PUCH_ODR_AMOUNT")) {
						key.setPUCH_ODR_AMOUNT(msgKey.getKeyValue("PUCH_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("DISC_AMOUNT")) {
						key.setDISC_AMOUNT(msgKey.getKeyValue("DISC_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("NET_AMOUNT")) {
						key.setNET_AMOUNT(msgKey.getKeyValue("NET_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_RTN_COMMENT")) {
						key.setPUCH_RTN_COMMENT(msgKey.getKeyValue("PUCH_RTN_COMMENT"));
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
					if(msgKeyType.containsKeyColumn("ROUND_TYP")) {
						key.setROUND_TYP(msgKey.getKeyValue("ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD")) {
						key.setTAX_CD(msgKey.getKeyValue("TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP")) {
						key.setTAX_ROUND_TYP(msgKey.getKeyValue("TAX_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("RTN_DEL_FLG")) {
						key.setRTN_DEL_FLG(msgKey.getKeyValue("RTN_DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("NON_NO_ITEM_TYP")) {
						key.setNON_NO_ITEM_TYP(msgKey.getKeyValue("NON_NO_ITEM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("NON_NO_ITEM_NAME")) {
						key.setNON_NO_ITEM_NAME(msgKey.getKeyValue("NON_NO_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("NON_NO_ITEM_PUCH_ODR_UNIT")) {
						key.setNON_NO_ITEM_PUCH_ODR_UNIT(msgKey.getKeyValue("NON_NO_ITEM_PUCH_ODR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_TYP")) {
						key.setITEM_TYP(msgKey.getKeyValue("ITEM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("RTN_DEL_DATE")) {
						key.setRTN_DEL_DATE(msgKey.getKeyValue("RTN_DEL_DATE"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP")) {
						key.setSPL_ITEM_TYP(msgKey.getKeyValue("SPL_ITEM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PRODUCT_TYP")) {
						key.setPRODUCT_TYP(msgKey.getKeyValue("PRODUCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CLASIFICATION_CD")) {
						key.setCLASIFICATION_CD(msgKey.getKeyValue("CLASIFICATION_CD"));
					}
					if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG")) {
						key.setLOT_CTRL_FLG(msgKey.getKeyValue("LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD_2")) {
						key.setPUCH_ODR_CD_2(msgKey.getKeyValue("PUCH_ODR_CD_2"));
					}
					if(msgKeyType.containsKeyColumn("MRP_FLG")) {
						key.setMRP_FLG(msgKey.getKeyValue("MRP_FLG"));
					}
					if(msgKeyType.containsKeyColumn("WH_TYP")) {
						key.setWH_TYP(msgKey.getKeyValue("WH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("THIS_MONTH")) {
						key.setTHIS_MONTH(msgKey.getKeyValue("THIS_MONTH"));
					}
					if(msgKeyType.containsKeyColumn("INSTALL_FLG")) {
						key.setINSTALL_FLG(msgKey.getKeyValue("INSTALL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY")) {
						key.setSTOCK_ON_HAND_QTY(msgKey.getKeyValue("STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD")) {
						key.setRCV_ISSUE_CTRL_CD(msgKey.getKeyValue("RCV_ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP")) {
						key.setRCV_ISSUE_TYP(msgKey.getKeyValue("RCV_ISSUE_TYP"));
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
					if(msgKeyType.containsKeyColumn("PARTIAL_PRD_NO")) {
						key.setPARTIAL_PRD_NO(msgKey.getKeyValue("PARTIAL_PRD_NO"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_CRCT_NO")) {
						key.setOPR_RSLT_CRCT_NO(msgKey.getKeyValue("OPR_RSLT_CRCT_NO"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_BEFORE_QTY")) {
						key.setRCV_ISSUE_BEFORE_QTY(msgKey.getKeyValue("RCV_ISSUE_BEFORE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_QTY")) {
						key.setRCV_ISSUE_QTY(msgKey.getKeyValue("RCV_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_AFTER_QTY")) {
						key.setRCV_ISSUE_AFTER_QTY(msgKey.getKeyValue("RCV_ISSUE_AFTER_QTY"));
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
					if(msgKeyType.containsKeyColumn("CONS_TYP")) {
						key.setCONS_TYP(msgKey.getKeyValue("CONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_NO")) {
						key.setINSPC_ACPT_NO(msgKey.getKeyValue("INSPC_ACPT_NO"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_GNR_TYP")) {
						key.setINSPC_ACPT_GNR_TYP(msgKey.getKeyValue("INSPC_ACPT_GNR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CRCT_NO")) {
						key.setCRCT_NO(msgKey.getKeyValue("CRCT_NO"));
					}
					if(msgKeyType.containsKeyColumn("CRCT_TYP")) {
						key.setCRCT_TYP(msgKey.getKeyValue("CRCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_TYP")) {
						key.setSLIP_TYP(msgKey.getKeyValue("SLIP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_QTY")) {
						key.setACPT_QTY(msgKey.getKeyValue("ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_QTY")) {
						key.setINSPC_ACPT_QTY(msgKey.getKeyValue("INSPC_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_AMOUNT")) {
						key.setINSPC_ACPT_AMOUNT(msgKey.getKeyValue("INSPC_ACPT_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("SAVING_AMOUNT")) {
						key.setSAVING_AMOUNT(msgKey.getKeyValue("SAVING_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_DATE")) {
						key.setACPT_DATE(msgKey.getKeyValue("ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_DATE")) {
						key.setINSPC_ACPT_DATE(msgKey.getKeyValue("INSPC_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_CD")) {
						key.setSLIP_CD(msgKey.getKeyValue("SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("ORGN_SLIP_CD")) {
						key.setORGN_SLIP_CD(msgKey.getKeyValue("ORGN_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD")) {
						key.setWORK_IN_PROC_CD(msgKey.getKeyValue("WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("DLV_CD")) {
						key.setDLV_CD(msgKey.getKeyValue("DLV_CD"));
					}
					if(msgKeyType.containsKeyColumn("GNR_ORG_CD")) {
						key.setGNR_ORG_CD(msgKey.getKeyValue("GNR_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("SBCNT_PUCH_TYP")) {
						key.setSBCNT_PUCH_TYP(msgKey.getKeyValue("SBCNT_PUCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_RTN_FLG")) {
						key.setPUCH_RTN_FLG(msgKey.getKeyValue("PUCH_RTN_FLG"));
					}
					if(msgKeyType.containsKeyColumn("APPR_FLG")) {
						key.setAPPR_FLG(msgKey.getKeyValue("APPR_FLG"));
					}
					if(msgKeyType.containsKeyColumn("APPR_ID")) {
						key.setAPPR_ID(msgKey.getKeyValue("APPR_ID"));
					}
					if(msgKeyType.containsKeyColumn("APPR_DATE")) {
						key.setAPPR_DATE(msgKey.getKeyValue("APPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PAST_RESULT_ENTRY_TYP")) {
						key.setPAST_RESULT_ENTRY_TYP(msgKey.getKeyValue("PAST_RESULT_ENTRY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("AI_IF")) {
						key.setAI_IF(msgKey.getKeyValue("AI_IF"));
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
					if(msgKeyType.containsKeyColumn("OLD_TAX_RATE_1")) {
						key.setOLD_TAX_RATE_1(msgKey.getKeyValue("OLD_TAX_RATE_1"));
					}
					if(msgKeyType.containsKeyColumn("OLD_TAX_RATE_2")) {
						key.setOLD_TAX_RATE_2(msgKey.getKeyValue("OLD_TAX_RATE_2"));
					}
					if(msgKeyType.containsKeyColumn("OLD_TAX_RATE_3")) {
						key.setOLD_TAX_RATE_3(msgKey.getKeyValue("OLD_TAX_RATE_3"));
					}
					if(msgKeyType.containsKeyColumn("NEW_TAX_RATE_START_DATE")) {
						key.setNEW_TAX_RATE_START_DATE(msgKey.getKeyValue("NEW_TAX_RATE_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("NEW_TAX_RATE_1")) {
						key.setNEW_TAX_RATE_1(msgKey.getKeyValue("NEW_TAX_RATE_1"));
					}
					if(msgKeyType.containsKeyColumn("NEW_TAX_RATE_2")) {
						key.setNEW_TAX_RATE_2(msgKey.getKeyValue("NEW_TAX_RATE_2"));
					}
					if(msgKeyType.containsKeyColumn("NEW_TAX_RATE_3")) {
						key.setNEW_TAX_RATE_3(msgKey.getKeyValue("NEW_TAX_RATE_3"));
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
