/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0100/src/com/nec/jp/orteus/metamorBase/AE0100/AE0100010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0100;

import com.nec.jp.orteus.metamorBase.AE0100.*;
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
import com.nec.jp.orteus.expj.pr.rcvissue.process.ValidateWh;
import com.nec.jp.orteus.expj.pr.rcvissue.util.StringUtil;
import com.nec.jp.orteus.expj.lot.*;

import com.nec.jp.orteus.expj.pr.rcvissue.mst.ConsUnitCost;
import java.math.BigDecimal;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AE0100010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: zhou-kehong $
 * @version $Revision: 1.13 $ $Date: 2014/12/03 07:52:58 $
 *
 */
//}}user_implement_code_header

public class AE0100010Control
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
	protected List list;											// ���ʃ��X�g�̃C���X�^���X
	public List getList() { return this.list; }						// ���X�g��Ԃ��܂��B
	public void setList(List listname) { this.list = listname; }	// ���X�g���Z�b�g���܂��B
	public int getListsize() {										// ���X�g�^�̃T�C�Y��Ԃ��܂��B
		int nret = 0;
		if( this.list != null ) {nret = this.list.size();}
		return nret;
	}
//	public Object getListvalue(int x) { return this.list.get(x); }	// ���X�g�̒l��Ԃ��܂��B
	public AE0100010Struct getListvalue(int x) { return (AE0100010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AE0100010Struct getStruct() { return this.struct; }	// Struct�̒l��Ԃ��܂��B
	public AE0100010Struct createStruct() { return new AE0100010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AE0100010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
	
	/** [����]��� */
	private MyCompanyStruct _myCompanyStruct = new MyCompanyStruct();
	
	/** [�R���{�{�b�N�X�f�[�^]���i�P���敪�j */
	private ComboStruct _unitCostTypStruct = new ComboStruct();
	
	private String _rcvIssueCtrlCd = null;
	
    public AE0100010Struct struct_MODIFY_COUNT = new AE0100010Struct();
    public String str_LOT_CTRL_FLG="";
	/** �V�X�e�������t���O*/
	private boolean _lotCtrlFlg;
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
	 * �Ɩ����W�b�N�̃��[�j���O���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * @param code ���b�Z�[�W�R�[�h
	 */
	private void setWarningMessage(String code, String msg1, String msg2) {
		ExpjMessage emsg = new ExpjMessage(code, msg1, msg2);
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
	private void setStructSystemData(AE0100010Struct s) {
		s.setsOraganization_CD(struct.getsOrganization_CD());
		s.setsSysdate(struct.getsSysdate());
		s.setsUser_ID(struct.getsUser_ID());
	}
	
	/**
	 * ��ʂ̑S���ڂ����������܂��B
	 */
	private void initializeAll() 
			throws SQLException, DataNotFoundException, FoundationException {
		
		struct.setONEROUS_CONS_NO(null);
		struct.seth_ONEROUS_CONS_NO(null);
		
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
		struct.setISSUE_QTY("0");
		struct.setSTOCK_UNIT(null);
		DateCtrlStruct dcs = DateCtrlControl.getData(conn, sysPLANT_CD);
		struct.setISSUE_DATE(dcs.getBUSINESS_OPR_DATE());
		struct.setRETURNED_WH_CD(null);
		struct.setWH_NAME(null);
		struct.setRETURNED_CAUSE_CD(null);
		struct.setVEND_LOT_NO(null);
		
		struct.setUNIT_COST_TYP("1");
		struct.setUNIT_COST("0");
		struct.setPUCH_ODR_AMOUNT("0");
		struct.setROUND_TYP(Kind.FLOOR);
		struct.setMODIFY_COUNT(null);
		struct.setVEND_DECIMAL_FIG("4");
		
		struct.setr1_FILTER("true");
		struct.setPUCH_ODR_CD(null);
		struct.setISSUE_INST_CD(null);
		
    struct.setONEROUS_CONS_COMMENT(null);
    struct.setVEND_CUR_UNIT(null);
        		
		struct.setSelectUnitCostFlag("false");
		
		// ���|�Ǘ����C���X�g�[������Ă���ꍇ�A���N���x���擾
		AE0100010Struct readStruct = new AE0100010Struct();
		List installOptionsList = entity.mSYS_INSTALL_OPTIONS.read(conn, readStruct);
		if (installOptionsList.size() > 0) {
			AE0100010Struct installOptionsStruct = (AE0100010Struct)installOptionsList.get(0);
			struct.setINSTALL_FLG(installOptionsStruct.getINSTALL_FLG());
		} else {
			struct.setINSTALL_FLG("0");
		}
		
		// ���|�Ǘ����C���X�g�[������Ă���ꍇ�A���N���x���擾
		if ("1".equals(struct.getINSTALL_FLG())) {
			List debtCtrlList = entity.mSYS_DEBT_CTRL.read(conn, readStruct);
			if (debtCtrlList.size() > 0) {
				AE0100010Struct debtCtrlStruct = (AE0100010Struct)debtCtrlList.get(0);
				struct.setTHIS_MONTH(debtCtrlStruct.getTHIS_MONTH());
			} else {
				setErrorMessage("AE00145");
			}
		}
		
		// �L���x���݌ɊǗ��敪�����݂��Ȃ��ꍇ
		struct.setc_ONEROUS_CONS_INV_TYP(null);
		AE0100010Struct parameterStruct = new AE0100010Struct();
		parameterStruct.setNAME(sysPLANT_CD + "_ONEROUS_CONS_INV_TYP");
		List parameterList = entity.mSYS_PARAMETER.read(conn, parameterStruct);
		if (parameterList.isEmpty() == false) {
			parameterStruct = (AE0100010Struct)(parameterList.get(0));
			if ("TRUE".equals((parameterStruct.getVALUE()).toUpperCase())) {
				struct.setc_ONEROUS_CONS_INV_TYP("true");
			} else {
				struct.setc_ONEROUS_CONS_INV_TYP(null);
			}
		}
        struct.setLOT_NO(null);
        struct.seth_LOT_CTRL_FLG(null);
        struct.setLOT_MODIFY_COUNT(null);
        struct.seth_LOT_NO_2(null);
        struct.seth_LOT_NUMBERING_TYP(null);
        struct.setLOT_STOCK_ON_HAND_QTY(null);
        
		list = null;
		_rcvIssueCtrlCd = null;
		
		readStatus = INITIAL;
	}

	// �݌ɍX�V����
	private void updateStock(
			IDbConnection conn, 
			AE0100010Struct formStruct, 
			AE0100010Struct pastOnerousConsStruct, 
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
								"AE0100010Control",
								"controlInsert()",
								emsg.getMessage(CoreTools.getLocale(getsysUSER_CD())));
			}
		} catch(FoundationException ex) {
			// �o�^�������s�F���o�ɊǗ��ԍ��i�o�Ɂj�̍̔ԂɎ��s���܂���
			setErrorMessage("AE00152");
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(ex, emsg);
			throw ee;
		}
		
		if (mode == 1) {
			_rcvIssueCtrlCd = ctrlCd;
		}
		if (formStruct.getJOB_ODR_CD() == null || "".equals(formStruct.getJOB_ODR_CD())) {
			// �i�ڍ݌ɍX�V
			updateItemStock(conn, formStruct, pastOnerousConsStruct, ctrlCd, mode);
		} else {
			// ���ԍ݌ɍX�V
			updateJobOdrCdStock(conn, formStruct, pastOnerousConsStruct, ctrlCd, mode);
		}
	}
	
	// �����ۊǋ�݌ɍX�V����
	private void updateVendWhStock(
			IDbConnection conn, 
			AE0100010Struct formStruct, 
			AE0100010Struct pastOnerousConsStruct, 
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
								"AE0100010Control",
								"controlInsert()",
								emsg.getMessage(CoreTools.getLocale(getsysUSER_CD())));
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
			updateItemStock(conn, formStruct, pastOnerousConsStruct, ctrlCd, mode);
		} else {
			// ���ԍ݌ɍX�V
			updateJobOdrCdStock(conn, formStruct, pastOnerousConsStruct, ctrlCd, mode);
		}
	}
	
	// �i�ڍ݌ɍX�V����
	private void updateItemStock(
			IDbConnection conn, 
			AE0100010Struct formStruct, 
			AE0100010Struct pastOnerousConsStruct, 
			String ctrlCd, 
			int mode) 
			throws ParseException, DataNotFoundException, SQLException, FoundationException, 
					ExpjException {
		
		String rcvIssueBeforeQty = "0";
		String rcvIssueQty = "0";
		String rcvIssueAterQty = "0";
		String stockOnHandQty = "0";
		
		AE0100010Struct stockStruct = null;
		
		// [�ۊǋ�ʕi�ڍ݌�]�̌���
		List stockList = null;
		
		AE0100010Struct searchStruct = new AE0100010Struct();
		if (mode == 1) {
			// �o�^���[�h
			searchStruct.setITEM_CD(formStruct.getITEM_CD());
			searchStruct.setWH_CD(formStruct.getRETURNED_WH_CD());
			stockList = entity.mT_ITEM_STOCK.read(conn, searchStruct);
		} else if (mode == 11 || mode == 21 || mode == 31) {
			// �o�^���[�h �����ۊǋ�݌ɂ̍X�V
			searchStruct.setITEM_CD(formStruct.getITEM_CD());
			searchStruct.setVEND_CD(formStruct.getVEND_CD());
			searchStruct.setPLANT_CD(sysPLANT_CD);
			stockList = entity.mselectVEND_WH_ITEM_STOCK.read(conn, searchStruct);
		} else if (mode == 2) {
			// �ԕi��ۊǋ�̃}�C�i�X�X�V
			searchStruct.setITEM_CD(pastOnerousConsStruct.getITEM_CD());
			searchStruct.setWH_CD(pastOnerousConsStruct.getRETURNED_WH_CD());
			stockList = entity.mT_ITEM_STOCK.read(conn, searchStruct);
		} else {
			// �폜���[�h
			searchStruct.setITEM_CD(pastOnerousConsStruct.getITEM_CD());
			searchStruct.setWH_CD(pastOnerousConsStruct.getRETURNED_WH_CD());
			stockList = entity.mT_ITEM_STOCK.read(conn, searchStruct);
		}
		
		if (stockList.isEmpty()) {
			
			// �i�ڍ݌ɒǉ�
			rcvIssueBeforeQty = "0";
			if (mode == 1) {
				rcvIssueQty = formStruct.getISSUE_QTY();
			} else if (mode == 11) {
				// �����݌ɍX�V 
				rcvIssueQty = Calculate.multiply(formStruct.getISSUE_QTY(), "-1");
			} else if (mode == 21) {
				// �����݌ɍX�V 
				rcvIssueQty = Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1");
				stockOnHandQty = Calculate.subtract(
						Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1"), 
								formStruct.getISSUE_QTY());
			} else if (mode == 31) {
				// �����݌ɍX�V 
				rcvIssueQty = Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1");
			} else if (mode == 2) {
				// �ԕi��ۊǋ�̃}�C�i�X�X�V 
				rcvIssueQty = Calculate.multiply(
						Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1"), "-1");
			} else {
				rcvIssueQty = Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1");
			}
			rcvIssueAterQty = rcvIssueQty;
			
			AE0100010Struct insertStruct = new AE0100010Struct();
			setStructSystemData(insertStruct);
			
			if (mode == 1) {
				insertStruct.setITEM_CD(formStruct.getITEM_CD());  // �i�ڔԍ�
				insertStruct.setWH_CD(formStruct.getRETURNED_WH_CD());  // �ԕi��ۊǋ�R�[�h
				insertStruct.setPLANT_CD(sysPLANT_CD);  // �H��R�[�h
			} else if (mode == 11 || mode == 21 || mode == 31) {
				insertStruct.setITEM_CD(formStruct.getITEM_CD());  // �i�ڔԍ�
				AE0100010Struct whStruct = new AE0100010Struct();
				whStruct.setVEND_CD(formStruct.getVEND_CD());
				whStruct.setPLANT_CD(sysPLANT_CD);
				List whList = entity.mM_WH.read(conn ,whStruct);
				if (whList.isEmpty()) {
					// �G���[
				} else {
					whStruct = (AE0100010Struct)(whList.get(0));
					insertStruct.setWH_CD(whStruct.getWH_CD());  // �ۊǋ�R�[�h
				}
				insertStruct.setPLANT_CD(sysPLANT_CD);  // �H��R�[�h
			} else if (mode == 2) {
				insertStruct.setITEM_CD(pastOnerousConsStruct.getITEM_CD());  // �i�ڔԍ�
				insertStruct.setWH_CD(pastOnerousConsStruct.getRETURNED_WH_CD());  // �ԕi��ۊǋ�R�[�h
				insertStruct.setPLANT_CD(pastOnerousConsStruct.getPLANT_CD());  // �H��R�[�h
			} else {
				insertStruct.setITEM_CD(pastOnerousConsStruct.getITEM_CD());  // �i�ڔԍ�
				insertStruct.setWH_CD(pastOnerousConsStruct.getRETURNED_WH_CD());  // �ԕi��ۊǋ�R�[�h
				insertStruct.setPLANT_CD(sysPLANT_CD);  // �H��R�[�h
			}
			if (mode == 21) {
				insertStruct.setSTOCK_ON_HAND_QTY(stockOnHandQty);  // �i�ڕʎ莝�݌ɐ�
			} else {
				insertStruct.setSTOCK_ON_HAND_QTY(rcvIssueAterQty);  // �i�ڕʎ莝�݌ɐ�
			}
			
			insertStruct.setRCV_ISSUE_CTRL_CD(ctrlCd);
			
			entity.mT_ITEM_STOCK.create(conn, insertStruct);
			
		} else {
			
			// �i�ڍ݌ɍX�V
			stockStruct = (AE0100010Struct)(stockList.get(0));
			rcvIssueBeforeQty = stockStruct.getSTOCK_ON_HAND_QTY();
			
			if (mode == 1) {
				rcvIssueQty = formStruct.getISSUE_QTY();
				rcvIssueAterQty = Calculate.add(
						stockStruct.getSTOCK_ON_HAND_QTY(), formStruct.getISSUE_QTY());
			} else if (mode == 11) {
				// �����ۊǋ�̍݌ɍX�V
				rcvIssueQty = Calculate.multiply(formStruct.getISSUE_QTY(), "-1");
				rcvIssueAterQty = Calculate.subtract(
						stockStruct.getSTOCK_ON_HAND_QTY(), formStruct.getISSUE_QTY());
			} else if (mode == 21) {
				// �����ۊǋ�̍݌ɍX�V
				rcvIssueQty = Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1");
				rcvIssueAterQty = Calculate.add(
						stockStruct.getSTOCK_ON_HAND_QTY(), 
								Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1"));
				stockOnHandQty = Calculate.subtract(
						rcvIssueAterQty, formStruct.getISSUE_QTY());
			} else if (mode == 31) {
				// �����ۊǋ�̍݌ɍX�V
				rcvIssueQty = Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1");
				rcvIssueAterQty = Calculate.add(
						stockStruct.getSTOCK_ON_HAND_QTY(), 
						Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1"));
			} else if (mode == 2) {
				rcvIssueQty = Calculate.multiply(
						Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1"), "-1");
				rcvIssueAterQty = Calculate.subtract(
						stockStruct.getSTOCK_ON_HAND_QTY(), 
						Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1"));
			} else {
				rcvIssueQty = Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1");
				rcvIssueAterQty = Calculate.add(
						stockStruct.getSTOCK_ON_HAND_QTY(), 
						Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1"));
			}
			
			AE0100010Struct updateStruct = new AE0100010Struct();
			setStructSystemData(updateStruct);
			if (mode == 1) {
				updateStruct.setITEM_CD(formStruct.getITEM_CD());
				updateStruct.setWH_CD(formStruct.getRETURNED_WH_CD());
			} else if (mode == 11 || mode == 21 || mode == 31) {
				updateStruct.setITEM_CD(formStruct.getITEM_CD());
				AE0100010Struct whStruct = new AE0100010Struct();
				whStruct.setVEND_CD(formStruct.getVEND_CD());
				whStruct.setPLANT_CD(sysPLANT_CD);
				List whList = entity.mM_WH.read(conn ,whStruct);
				if (whList.isEmpty()) {
					// �G���[
				} else {
					whStruct = (AE0100010Struct)(whList.get(0));
					updateStruct.setWH_CD(whStruct.getWH_CD());  // �ۊǋ�R�[�h
				}
			} else {
				updateStruct.setITEM_CD(pastOnerousConsStruct.getITEM_CD());
				updateStruct.setWH_CD(pastOnerousConsStruct.getRETURNED_WH_CD());
			}
			
			if (mode == 21) {
				updateStruct.setSTOCK_ON_HAND_QTY(stockOnHandQty);  // �i�ڕʎ莝�݌ɐ�
			} else {
				updateStruct.setSTOCK_ON_HAND_QTY(rcvIssueAterQty);  // �i�ڕʎ莝�݌ɐ�
			}
			
			entity.mT_ITEM_STOCK.update(conn, updateStruct);
			
		}
		
		// �v�Z��̕i�ڎ莝�݌ɐ����}�C�i�X�̏ꍇ�A���[�j���O
		if (Calculate.compare(rcvIssueAterQty, "0") == -1) {
			// �}�C�i�X�X�V�̏ꍇ�A�܂��́A�v���X�X�V�Łu�ԕi���ۊǋ�R�[�h�v��
			// [�w���ԕi����]."�ԕi���ۊǋ�R�[�h"���قȂ�ꍇ
			if (mode != 2 || (mode == 2 
					&& (pastOnerousConsStruct.getRETURNED_WH_CD().equals(
							formStruct.getRETURNED_WH_CD()) == false))) {
				
				if (mode == 11 || mode == 21 || mode == 31) {
					setWarningMessage("AE00155");
				} else {
					setWarningMessage("AE00157");
				}
			}
		}
			
		// [�ۊǋ�ʓ��o��]�̒ǉ�
		addRcvIssue(conn, formStruct, pastOnerousConsStruct, 
				rcvIssueBeforeQty, rcvIssueQty, rcvIssueAterQty, ctrlCd, mode);
		
		if (mode == 21) {
			
			// ���o�ɊǗ��ԍ��̔�
			_rcvIssueCtrlCd = null;
			Numbering numbering = new Numbering(
									conn,
									Numbering.ISSUE_CD, 
									getsysUSER_CD(), 
									this.sp.getProcId(), 
									sysPLANT_CD);
			try {
				_rcvIssueCtrlCd = numbering.getNo();
				if (_rcvIssueCtrlCd == null) {
					ExpjMessage emsg = new ExpjMessage("AE00152");
					throw new FoundationException(
									"AE0100010Control",
									"controlInsert()",
									emsg.getMessage(CoreTools.getLocale(getsysUSER_CD())));
				}
			} catch(FoundationException ex) {
				// �o�^�������s�F���o�ɊǗ��ԍ��i�o�Ɂj�̍̔ԂɎ��s���܂���
				setErrorMessage("AE00152");
				ExpjMessage emsg = new ExpjMessage("ZZ01106");
				sysLog.severe(emsg, getsysUSER_CD());
				ExpjException ee = new ExpjException(ex, emsg);
				throw ee;
			}
			
			if (stockStruct == null) {
				rcvIssueBeforeQty = Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1");
			} else {
				rcvIssueBeforeQty = Calculate.add(
						stockStruct.getSTOCK_ON_HAND_QTY(), 
						Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1"));
			}
			rcvIssueQty = Calculate.multiply(formStruct.getISSUE_QTY(), "-1");
			rcvIssueAterQty = Calculate.subtract(
					rcvIssueBeforeQty, formStruct.getISSUE_QTY());
			
			addRcvIssue(conn, formStruct, pastOnerousConsStruct, 
					rcvIssueBeforeQty, rcvIssueQty, rcvIssueAterQty, _rcvIssueCtrlCd, 22);
		}
	}
	
	// ���ԍ݌ɍX�V����
	private void updateJobOdrCdStock(
			IDbConnection conn, 
			AE0100010Struct formStruct, 
			AE0100010Struct pastOnerousConsStruct, 
			String ctrlCd, 
			int mode) 
			throws ParseException, DataNotFoundException, SQLException, FoundationException, 
			ExpjException {
		
		String rcvIssueBeforeQty = "0";
		String rcvIssueQty = "0";
		String rcvIssueAterQty = "0";
		String stockOnHandQty = "0";
		
		AE0100010Struct stockStruct = null;
		
		// [�ۊǋ�ʐ��ԍ݌�]�̌���
		
		AE0100010Struct searchStruct = new AE0100010Struct();
		List stockList = null;
		if (mode == 1) {
			searchStruct.setJOB_ODR_CD(formStruct.getJOB_ODR_CD());
			searchStruct.setITEM_CD(formStruct.getITEM_CD());
			searchStruct.setWH_CD(formStruct.getRETURNED_WH_CD());
			stockList = entity.mT_JOB_ODR_CD_STOCK.read(conn, searchStruct);
		} else if (mode == 11 || mode == 21 || mode == 31) {
			searchStruct.setJOB_ODR_CD(formStruct.getJOB_ODR_CD());
			searchStruct.setITEM_CD(formStruct.getITEM_CD());
			searchStruct.setVEND_CD(formStruct.getVEND_CD());
			searchStruct.setPLANT_CD(sysPLANT_CD);
			stockList = entity.mselectVEND_WH_JOB_ODR_CD_STOCK.read(conn, searchStruct);
		} else if (mode == 2) {
			searchStruct.setJOB_ODR_CD(pastOnerousConsStruct.getJOB_ODR_CD());
			searchStruct.setJOB_ODR_DETAIL_NO(pastOnerousConsStruct.getJOB_ODR_DETAIL_NO());
			searchStruct.setITEM_CD(pastOnerousConsStruct.getITEM_CD());
			searchStruct.setWH_CD(pastOnerousConsStruct.getRETURNED_WH_CD());
			stockList = entity.mT_JOB_ODR_CD_STOCK.read(conn, searchStruct);
		} else {
			searchStruct.setJOB_ODR_CD(pastOnerousConsStruct.getJOB_ODR_CD());
			searchStruct.setITEM_CD(pastOnerousConsStruct.getITEM_CD());
			searchStruct.setWH_CD(pastOnerousConsStruct.getWH_CD());
			stockList = entity.mT_JOB_ODR_CD_STOCK.read(conn, searchStruct);
		}
		
		if (stockList.isEmpty()) {
			
			// ���ԍ݌ɒǉ�
			rcvIssueBeforeQty = "0";
			if (mode == 1) {
				rcvIssueQty = formStruct.getISSUE_QTY();
			} else if (mode == 11) {
				rcvIssueQty = Calculate.multiply(formStruct.getISSUE_QTY(), "-1");
			} else if (mode == 21) {
				// �����݌ɍX�V 
				rcvIssueQty = Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1");
				stockOnHandQty = Calculate.subtract(
						Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1"), 
						formStruct.getISSUE_QTY());
			} else if (mode == 31) {
				// �����݌ɍX�V 
				rcvIssueQty = Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1");
			} else if (mode == 2) {
				// �ԕi��ۊǋ�̃}�C�i�X�X�V 
				rcvIssueQty = Calculate.multiply(Calculate.multiply(
						pastOnerousConsStruct.getISSUE_QTY(), "-1"), "-1");
			} else {
				rcvIssueQty = Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1");
			}
			rcvIssueAterQty = rcvIssueQty;
			
			AE0100010Struct insertStruct = new AE0100010Struct();
			setStructSystemData(insertStruct);
			
			if (mode == 1) {
				insertStruct.setJOB_ODR_CD(formStruct.getJOB_ODR_CD());  // ����
				insertStruct.setITEM_CD(formStruct.getITEM_CD());  // �i�ڔԍ�
				insertStruct.setWH_CD(formStruct.getRETURNED_WH_CD());  // �ԕi���ۊǋ�R�[�h
				insertStruct.setPLANT_CD(sysPLANT_CD);  // �H��R�[�h
			} else if (mode == 2) {
				insertStruct.setJOB_ODR_CD(pastOnerousConsStruct.getJOB_ODR_CD());  // ����
				insertStruct.setITEM_CD(pastOnerousConsStruct.getITEM_CD());  // �i�ڔԍ�
				insertStruct.setWH_CD(pastOnerousConsStruct.getRETURNED_WH_CD());  // �ԕi���ۊǋ�R�[�h
				insertStruct.setPLANT_CD(pastOnerousConsStruct.getPLANT_CD());  // �H��R�[�h
			} else if (mode == 11 || mode == 21 || mode == 31) {
				insertStruct.setJOB_ODR_CD(formStruct.getJOB_ODR_CD());  // ����
				insertStruct.setITEM_CD(formStruct.getITEM_CD());  // �i�ڔԍ�
				
				AE0100010Struct whStruct = new AE0100010Struct();
				whStruct.setVEND_CD(formStruct.getVEND_CD());
				whStruct.setPLANT_CD(sysPLANT_CD);
				List whList = entity.mM_WH.read(conn ,whStruct);
				if (whList.isEmpty()) {
					// �G���[
				} else {
					whStruct = (AE0100010Struct)(whList.get(0));
					insertStruct.setWH_CD(whStruct.getWH_CD());  // �ۊǋ�R�[�h
				}
				insertStruct.setPLANT_CD(sysPLANT_CD);  // �H��R�[�h
			} else {
				insertStruct.setJOB_ODR_CD(pastOnerousConsStruct.getJOB_ODR_CD());  // ����
				insertStruct.setITEM_CD(pastOnerousConsStruct.getITEM_CD());  // �i�ڔԍ�
				insertStruct.setWH_CD(pastOnerousConsStruct.getRETURNED_WH_CD());  // �ԕi���ۊǋ�R�[�h
				insertStruct.setPLANT_CD(sysPLANT_CD);  // �H��R�[�h
			}
			if (mode == 21) {
				insertStruct.setSTOCK_ON_HAND_QTY(stockOnHandQty);  // ���ԕʎ莝�݌ɐ�
			} else {
				insertStruct.setSTOCK_ON_HAND_QTY(rcvIssueAterQty);  // ���ԕʎ莝�݌ɐ�
			}
			
			entity.mT_JOB_ODR_CD_STOCK.create(conn, insertStruct);
			
		} else {
			
			// ���ԍ݌ɍX�V
			stockStruct = (AE0100010Struct)(stockList.get(0));
			rcvIssueBeforeQty = stockStruct.getSTOCK_ON_HAND_QTY();
			if (mode == 1) {
				rcvIssueQty = formStruct.getISSUE_QTY();
				rcvIssueAterQty = Calculate.add(
						stockStruct.getSTOCK_ON_HAND_QTY(), formStruct.getISSUE_QTY());
			} else if (mode == 11) {
				rcvIssueQty = Calculate.multiply(formStruct.getISSUE_QTY(), "-1");
				rcvIssueAterQty = Calculate.subtract(
						stockStruct.getSTOCK_ON_HAND_QTY(), formStruct.getISSUE_QTY());
			} else if (mode == 21) {
				rcvIssueQty = Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1");
				rcvIssueAterQty = Calculate.add(
						stockStruct.getSTOCK_ON_HAND_QTY(), 
						Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1"));
				stockOnHandQty = Calculate.subtract(
						rcvIssueAterQty, formStruct.getISSUE_QTY());
			} else if (mode == 31) {
				rcvIssueQty = Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1");
				rcvIssueAterQty = Calculate.add(
						stockStruct.getSTOCK_ON_HAND_QTY(), 
						Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1"));
			} else if (mode == 2) {
				rcvIssueQty = Calculate.multiply(
						Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1"), "-1");
				rcvIssueAterQty = Calculate.subtract(
						stockStruct.getSTOCK_ON_HAND_QTY(), 
						Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1"));
			} else {
				rcvIssueQty = Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1");
				rcvIssueAterQty = Calculate.add(
						stockStruct.getSTOCK_ON_HAND_QTY(), 
						Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1"));
			}
			
			AE0100010Struct updateStruct = new AE0100010Struct();
			setStructSystemData(updateStruct);
			
			if (mode == 1) {
				updateStruct.setJOB_ODR_CD(formStruct.getJOB_ODR_CD());  // ����
				updateStruct.setITEM_CD(formStruct.getITEM_CD());  // �i�ڔԍ�
				updateStruct.setWH_CD(formStruct.getRETURNED_WH_CD());  // �ԕi���ۊǋ�R�[�h
			} else if (mode == 11 || mode == 21 || mode == 31) {
				updateStruct.setJOB_ODR_CD(formStruct.getJOB_ODR_CD());  // ����
				updateStruct.setITEM_CD(formStruct.getITEM_CD());  // �i�ڔԍ�
				AE0100010Struct whStruct = new AE0100010Struct();
				whStruct.setVEND_CD(formStruct.getVEND_CD());
				whStruct.setPLANT_CD(sysPLANT_CD);
				List whList = entity.mM_WH.read(conn ,whStruct);
				if (whList.isEmpty()) {
					// �G���[
				} else {
					whStruct = (AE0100010Struct)(whList.get(0));
					updateStruct.setWH_CD(whStruct.getWH_CD());  // �ԕi���ۊǋ�R�[�h
				}
			} else if (mode == 2) {
				updateStruct.setJOB_ODR_CD(pastOnerousConsStruct.getJOB_ODR_CD());  // ����
				updateStruct.setJOB_ODR_DETAIL_NO(
						pastOnerousConsStruct.getJOB_ODR_DETAIL_NO());  // ���Ԏ}��
				updateStruct.setITEM_CD(pastOnerousConsStruct.getITEM_CD());  // �i�ڔԍ�
				updateStruct.setWH_CD(pastOnerousConsStruct.getRETURNED_WH_CD());  // �ԕi���ۊǋ�R�[�h
			} else {
				updateStruct.setJOB_ODR_CD(pastOnerousConsStruct.getJOB_ODR_CD());  // ����
				updateStruct.setJOB_ODR_DETAIL_NO(
						pastOnerousConsStruct.getJOB_ODR_DETAIL_NO());  // ���Ԏ}��
				updateStruct.setITEM_CD(pastOnerousConsStruct.getITEM_CD());  // �i�ڔԍ�
				updateStruct.setWH_CD(pastOnerousConsStruct.getRETURNED_WH_CD());  // �ԕi���ۊǋ�R�[�h
			}
			
			if (mode == 21) {
				updateStruct.setSTOCK_ON_HAND_QTY(stockOnHandQty);  // ���ԕʎ莝�݌ɐ�
			} else {
				updateStruct.setSTOCK_ON_HAND_QTY(rcvIssueAterQty);  // ���ԕʎ莝�݌ɐ�
			}
			
			entity.mT_JOB_ODR_CD_STOCK.update(conn, updateStruct);
		}
		
		// �v�Z��̕i�ڎ莝�݌ɐ����}�C�i�X�̏ꍇ�A���[�j���O
		if (Calculate.compare(rcvIssueAterQty, "0") == -1) {
			// �}�C�i�X�X�V�̏ꍇ�A�܂��́A�v���X�X�V�Łu�ԕi���ۊǋ�R�[�h�v��
			// [�w���ԕi����]."�ԕi���ۊǋ�R�[�h"���قȂ�ꍇ
			if (mode != 2 || (mode == 2 && (pastOnerousConsStruct.getRETURNED_WH_CD().equals(
					formStruct.getRETURNED_WH_CD()) == false))) {
				
				if (mode == 11 || mode == 21 || mode == 31) {
					setWarningMessage("AE00155");
				} else {
					setWarningMessage("AE00157");
				}
			}
		}
		
		// [�ۊǋ�ʓ��o��]�̒ǉ�
		addRcvIssue(conn, formStruct, pastOnerousConsStruct, 
				rcvIssueBeforeQty, rcvIssueQty, rcvIssueAterQty, ctrlCd, mode);
				
		if (mode == 21) {
			
			// ���o�ɊǗ��ԍ��̔�
			_rcvIssueCtrlCd = null;
			Numbering numbering = new Numbering(
									conn,
									Numbering.ISSUE_CD, 
									getsysUSER_CD(), 
									this.sp.getProcId(), 
									sysPLANT_CD);
			try {
				_rcvIssueCtrlCd = numbering.getNo();
				if (_rcvIssueCtrlCd == null) {
					ExpjMessage emsg = new ExpjMessage("AE00152");
					throw new FoundationException(
									"AE0100010Control",
									"controlInsert()",
									emsg.getMessage(CoreTools.getLocale(getsysUSER_CD())));
				}
			} catch(FoundationException ex) {
				// �o�^�������s�F���o�ɊǗ��ԍ��i�o�Ɂj�̍̔ԂɎ��s���܂���
				setErrorMessage("AE00152");
				ExpjMessage emsg = new ExpjMessage("ZZ01106");
				sysLog.severe(emsg, getsysUSER_CD());
				ExpjException ee = new ExpjException(ex, emsg);
				throw ee;
			}
			
			if (stockStruct == null) {
				rcvIssueBeforeQty = Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1");
			} else {
				rcvIssueBeforeQty = Calculate.add(
						stockStruct.getSTOCK_ON_HAND_QTY(), 
						Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1"));
			}
			rcvIssueQty = Calculate.multiply(formStruct.getISSUE_QTY(), "-1");
			rcvIssueAterQty = Calculate.subtract(
					rcvIssueBeforeQty, formStruct.getISSUE_QTY());
			
			addRcvIssue(conn, formStruct, pastOnerousConsStruct, 
					rcvIssueBeforeQty, rcvIssueQty, rcvIssueAterQty, _rcvIssueCtrlCd, 22);
		}
	}
	
	// �ۊǋ�ʓ��o�ɒǉ�
	private void addRcvIssue(
			IDbConnection conn, 
			AE0100010Struct formStruct, 
			AE0100010Struct pastOnerousConsStruct, 
			String rcvIssueBeforeQty, 
			String rcvIssueQty, 
			String rcvIssueAterQty, 
			String ctrlCd, 
			int mode) 
			throws ParseException, DataNotFoundException, SQLException, FoundationException {
		
		// [�ۊǋ�ʓ��o��]�̒ǉ�
		AE0100010Struct insertStruct = new AE0100010Struct();
		setStructSystemData(insertStruct);
		
		// �ǉ����e�ݒ�
		insertStruct.setRCV_ISSUE_CTRL_CD(ctrlCd);  // ���o�ɊǗ��ԍ�
		if (mode == 1) {
			insertStruct.setRCV_ISSUE_TYP("2");  // ���o�ɋ敪
			insertStruct.setITEM_CD(formStruct.getITEM_CD());  // �i�ڔԍ�
			insertStruct.setPLANT_CD(sysPLANT_CD);  // �H��R�[�h
			insertStruct.setWH_CD(formStruct.getRETURNED_WH_CD());  // �ۊǋ�R�[�h
			insertStruct.setJOB_ODR_CD(formStruct.getJOB_ODR_CD());  // ����
			insertStruct.setJOB_ODR_DETAIL_NO("0");  // ���Ԏ}��
			insertStruct.setVEND_LOT_NO(formStruct.getVEND_LOT_NO());  // ���[�J���b�g�ԍ�
			insertStruct.setRCV_ISSUE_DATE(formStruct.getISSUE_DATE());  // ���o�ɔN����
			if (Calculate.compare(formStruct.getISSUE_QTY(), "0") < 0) {
				insertStruct.setRCV_ISSUE_GNR_TYP("21");  // ���o�ɔ����敪
			} else {
				insertStruct.setRCV_ISSUE_GNR_TYP("29");  // ���o�ɔ����敪
			}
			insertStruct.setCOMPANY_CD(_myCompanyStruct.getCOMPANY_CD());  // ��ЃR�[�h
			insertStruct.setVEND_CD(formStruct.getVEND_CD());  // �����R�[�h
            insertStruct.setLOT_NO(formStruct.getLOT_NO());   //�݌Ƀ��b�g�ԍ�
		} else if (mode == 11) {
			insertStruct.setRCV_ISSUE_TYP("1");  // ���o�ɋ敪
			insertStruct.setITEM_CD(formStruct.getITEM_CD());  // �i�ڔԍ�
			insertStruct.setPLANT_CD(sysPLANT_CD);  // �H��R�[�h
			AE0100010Struct whStruct = new AE0100010Struct();
			whStruct.setVEND_CD(formStruct.getVEND_CD());
			whStruct.setPLANT_CD(sysPLANT_CD);
			List whList = entity.mM_WH.read(conn, whStruct);
			if (whList.isEmpty()) {
				// �G���[
			} else {
				whStruct = (AE0100010Struct)(whList.get(0));
				insertStruct.setWH_CD(whStruct.getWH_CD());  // �ۊǋ�R�[�h
			}
			
			insertStruct.setJOB_ODR_CD(formStruct.getJOB_ODR_CD());  // ����
			insertStruct.setJOB_ODR_DETAIL_NO("0");  // ���Ԏ}��
			if (Calculate.compare(formStruct.getISSUE_QTY(), "0") < 0) {
				insertStruct.setRCV_ISSUE_GNR_TYP("81");  // ���o�ɔ����敪
			} else {
				insertStruct.setRCV_ISSUE_GNR_TYP("89");  // ���o�ɔ����敪
			}
			insertStruct.setRCV_ISSUE_DATE(formStruct.getISSUE_DATE());  // ���o�ɔN����
			insertStruct.setVEND_LOT_NO(formStruct.getVEND_LOT_NO());  // ���[�J���b�g�ԍ�
			insertStruct.setCOMPANY_CD(_myCompanyStruct.getCOMPANY_CD());  // ��ЃR�[�h
			insertStruct.setVEND_CD(formStruct.getVEND_CD());  // �����R�[�h
            insertStruct.setLOT_NO(formStruct.getLOT_NO());   //�݌Ƀ��b�g�ԍ�
		} else if (mode == 21) {
			insertStruct.setRCV_ISSUE_TYP("1");  // ���o�ɋ敪
			insertStruct.setITEM_CD(formStruct.getITEM_CD());  // �i�ڔԍ�
			insertStruct.setPLANT_CD(sysPLANT_CD);  // �H��R�[�h
			AE0100010Struct whStruct = new AE0100010Struct();
			whStruct.setVEND_CD(formStruct.getVEND_CD());
			whStruct.setPLANT_CD(sysPLANT_CD);
			List whList = entity.mM_WH.read(conn, whStruct);
			if (whList.isEmpty()) {
				// �G���[
			} else {
				whStruct = (AE0100010Struct)(whList.get(0));
				insertStruct.setWH_CD(whStruct.getWH_CD());  // �ۊǋ�R�[�h
			}
			insertStruct.setJOB_ODR_CD(formStruct.getJOB_ODR_CD());  // ����
			insertStruct.setJOB_ODR_DETAIL_NO("0");  // ���Ԏ}��
			if (Calculate.compare(pastOnerousConsStruct.getISSUE_QTY(), "0") < 0) {
				insertStruct.setRCV_ISSUE_GNR_TYP("81");  // ���o�ɔ����敪
			} else {
				insertStruct.setRCV_ISSUE_GNR_TYP("89");  // ���o�ɔ����敪
			}
			insertStruct.setRCV_ISSUE_DATE(formStruct.getISSUE_DATE());  // ���o�ɔN����
			insertStruct.setVEND_LOT_NO(formStruct.getVEND_LOT_NO());  // ���[�J���b�g�ԍ�
			insertStruct.setCOMPANY_CD(_myCompanyStruct.getCOMPANY_CD());  // ��ЃR�[�h
			insertStruct.setVEND_CD(formStruct.getVEND_CD());  // �����R�[�h
            insertStruct.setLOT_NO(pastOnerousConsStruct.getLOT_NO());   //�݌Ƀ��b�g�ԍ�
		} else if (mode == 22) {
			insertStruct.setRCV_ISSUE_TYP("1");  // ���o�ɋ敪
			insertStruct.setITEM_CD(formStruct.getITEM_CD());  // �i�ڔԍ�
			insertStruct.setPLANT_CD(sysPLANT_CD);  // �H��R�[�h
			AE0100010Struct whStruct = new AE0100010Struct();
			whStruct.setVEND_CD(formStruct.getVEND_CD());
			whStruct.setPLANT_CD(sysPLANT_CD);
			List whList = entity.mM_WH.read(conn, whStruct);
			if (whList.isEmpty()) {
				// �G���[
			} else {
				whStruct = (AE0100010Struct)(whList.get(0));
				insertStruct.setWH_CD(whStruct.getWH_CD());  // �ۊǋ�R�[�h
			}
			insertStruct.setJOB_ODR_CD(formStruct.getJOB_ODR_CD());  // ����
			insertStruct.setJOB_ODR_DETAIL_NO("0");  // ���Ԏ}��
			if (Calculate.compare(formStruct.getISSUE_QTY(), "0") < 0) {
				insertStruct.setRCV_ISSUE_GNR_TYP("81");  // ���o�ɔ����敪
			} else {
				insertStruct.setRCV_ISSUE_GNR_TYP("89");  // ���o�ɔ����敪
			}
			insertStruct.setRCV_ISSUE_DATE(formStruct.getISSUE_DATE());  // ���o�ɔN����
			insertStruct.setVEND_LOT_NO(formStruct.getVEND_LOT_NO());  // ���[�J���b�g�ԍ�
			insertStruct.setCOMPANY_CD(_myCompanyStruct.getCOMPANY_CD());  // ��ЃR�[�h
			insertStruct.setVEND_CD(formStruct.getVEND_CD());  // �����R�[�h
            insertStruct.setLOT_NO(formStruct.getLOT_NO());   //�݌Ƀ��b�g�ԍ�
		} else if (mode == 31) {
			insertStruct.setRCV_ISSUE_TYP("1");  // ���o�ɋ敪
			insertStruct.setITEM_CD(formStruct.getITEM_CD());  // �i�ڔԍ�
			insertStruct.setPLANT_CD(sysPLANT_CD);  // �H��R�[�h
			AE0100010Struct whStruct = new AE0100010Struct();
			whStruct.setVEND_CD(formStruct.getVEND_CD());
			whStruct.setPLANT_CD(sysPLANT_CD);
			List whList = entity.mM_WH.read(conn, whStruct);
			if (whList.isEmpty()) {
				// �G���[
			} else {
				whStruct = (AE0100010Struct)(whList.get(0));
				insertStruct.setWH_CD(whStruct.getWH_CD());  // �ۊǋ�R�[�h
			}
			insertStruct.setJOB_ODR_CD(formStruct.getJOB_ODR_CD());  // ����
			insertStruct.setJOB_ODR_DETAIL_NO("0");  // ���Ԏ}��
			if (Calculate.compare(pastOnerousConsStruct.getISSUE_QTY(), "0") < 0) {
				insertStruct.setRCV_ISSUE_GNR_TYP("81");  // ���o�ɔ����敪
			} else {
				insertStruct.setRCV_ISSUE_GNR_TYP("89");  // ���o�ɔ����敪
			}
			DateCtrlStruct dcs = DateCtrlControl.getData(conn, sysPLANT_CD);
			insertStruct.setRCV_ISSUE_DATE(dcs.getBUSINESS_OPR_DATE());  // ���o�ɔN����
			insertStruct.setVEND_LOT_NO(formStruct.getVEND_LOT_NO());  // ���[�J���b�g�ԍ�
			insertStruct.setCOMPANY_CD(_myCompanyStruct.getCOMPANY_CD());  // ��ЃR�[�h
			insertStruct.setVEND_CD(formStruct.getVEND_CD());  // �����R�[�h
            insertStruct.setLOT_NO(pastOnerousConsStruct.getLOT_NO());   //�݌Ƀ��b�g�ԍ�
		} else if (mode == 2) {
			insertStruct.setRCV_ISSUE_TYP("2");  // ���o�ɋ敪
			insertStruct.setITEM_CD(pastOnerousConsStruct.getITEM_CD());  // �i�ڔԍ�
			insertStruct.setPLANT_CD(pastOnerousConsStruct.getPLANT_CD());  // �H��R�[�h
			insertStruct.setWH_CD(pastOnerousConsStruct.getRETURNED_WH_CD());  // �ۊǋ�R�[�h
			insertStruct.setJOB_ODR_CD(pastOnerousConsStruct.getJOB_ODR_CD());  // ����
			insertStruct.setJOB_ODR_DETAIL_NO(
					pastOnerousConsStruct.getJOB_ODR_DETAIL_NO());  // ���Ԏ}��
			insertStruct.setVEND_LOT_NO(pastOnerousConsStruct.getVEND_LOT_NO());  // ���[�J���b�g�ԍ�
			insertStruct.setRCV_ISSUE_DATE(formStruct.getISSUE_DATE());  // ���o�ɔN����
			if (Calculate.compare(pastOnerousConsStruct.getISSUE_QTY(), "0") < 0) {
				insertStruct.setRCV_ISSUE_GNR_TYP("21");  // ���o�ɔ����敪
			} else {
				insertStruct.setRCV_ISSUE_GNR_TYP("29");  // ���o�ɔ����敪
			}
			insertStruct.setCOMPANY_CD(pastOnerousConsStruct.getCOMPANY_CD());  // ��ЃR�[�h
			insertStruct.setVEND_CD(pastOnerousConsStruct.getVEND_CD());  // �����R�[�h
            insertStruct.setLOT_NO(pastOnerousConsStruct.getLOT_NO());   //�݌Ƀ��b�g�ԍ�
		} else {
			insertStruct.setRCV_ISSUE_TYP("2");  // ���o�ɋ敪
			insertStruct.setITEM_CD(pastOnerousConsStruct.getITEM_CD());  // �i�ڔԍ�
			insertStruct.setPLANT_CD(pastOnerousConsStruct.getPLANT_CD());  // �H��R�[�h
			insertStruct.setWH_CD(pastOnerousConsStruct.getRETURNED_WH_CD());  // �ۊǋ�R�[�h
			insertStruct.setJOB_ODR_CD(pastOnerousConsStruct.getJOB_ODR_CD());  // ����
			insertStruct.setJOB_ODR_DETAIL_NO(
					pastOnerousConsStruct.getJOB_ODR_DETAIL_NO());  // ���Ԏ}��
			insertStruct.setVEND_LOT_NO(pastOnerousConsStruct.getVEND_LOT_NO());  // ���[�J���b�g�ԍ�
			insertStruct.setRCV_ISSUE_DATE(formStruct.getISSUE_DATE());  // ���o�ɔN����
			insertStruct.setRCV_ISSUE_GNR_TYP("11");  // ���o�ɔ����敪
			insertStruct.setCOMPANY_CD(pastOnerousConsStruct.getCOMPANY_CD());  // ��ЃR�[�h
			insertStruct.setVEND_CD(pastOnerousConsStruct.getVEND_CD());  // �����R�[�h
            insertStruct.setLOT_NO(pastOnerousConsStruct.getLOT_NO());   //�݌Ƀ��b�g�ԍ�
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
		insertStruct.setCONS_TYP("1");  // �x���敪  2006/06/02 �x���敪��1:�L���x���ɕύX
        //��ЃR�[�h
		if("".equals(insertStruct.getCOMPANY_CD()) || insertStruct.getCOMPANY_CD() == null){
			insertStruct.setCOMPANY_CD(SystemInformation.getSysMyCompanyCd());
		}
		entity.mT_RCV_ISSUE.create(conn, insertStruct);
        call_excUpdateLotStockFd(conn, formStruct, pastOnerousConsStruct,ctrlCd, mode);
	}

	/**
	 * �V�X�e���p�����[�^�擾
	 */
	private boolean getSysParameter() throws BusinessProcessException, FoundationException {
		boolean b = true;
		try {
			List sysParameterList = entity.mSELECT_SYS_PARAMETER.read(conn, struct);
			if(sysParameterList == null || sysParameterList.isEmpty()) return b;
			AE0100010Struct sysParameterStruct = (AE0100010Struct) sysParameterList.get(0);
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
	 * ���ی����Ǘ��p�����[�^�̑Ώ۔N�����擾
	 */
	private BigDecimal getProcExecDate() throws BusinessProcessException, FoundationException {
		BigDecimal bd = null;
		try {
			struct.setPLANT_CD(getsysPLANT_CD());
			List procExecDateList = entity.mSELECT_SYS_ACTUAL_COST_CTRL_AC.read(conn, struct);
			if(procExecDateList == null || procExecDateList.isEmpty()) return null;
			AE0100010Struct procExecDateStruct = (AE0100010Struct) procExecDateList.get(0);
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
    private String add_callgetsetLotNumberingFd(AE0100010Struct itemStruct) throws FoundationException
    {
        String result1=null;
        
        // �B �݌Ƀ��b�g�ԍ��̔ԏ���
        // [�i��]�D�h���b�g�Ǘ��t���O�h�� 1(���b�g�g���[�X�Ǘ����s���B) �A
        // [�i��]�D�h���b�g�ԍ��̔ԋ敪�h�� 1:�����̔Ԃ���B(�A�ԁj 
        // [�i��]�D�h���b�g�ԍ��̔ԋ敪�h�� 2:���P�ʍ̔� 
        // [���]�D��݌Ƀ��b�g�ԍ�� ���󔒁@�ꍇ���L�̔ԏ������s���B
        if("1".equals(itemStruct.geth_LOT_CTRL_FLG())== true
                && ("0".equals(itemStruct.geth_LOT_NUMBERING_TYP())== false)
                        && (struct.getLOT_NO()== null || "".equals(struct.getLOT_NO()))
                        && !"true".equals(struct.getc_ONEROUS_CONS_INV_TYP()))
        {
            // �݌Ƀ��b�g�ԍ��̎����̔Ԃ��s���B
            String str_ITEM_CD = struct.getITEM_CD();                       //�i�ڔԍ�
            String str_ISSUE_DATE = struct.getISSUE_DATE();                 //�ԕi��
            
            BizCommon bc = new BizCommon(conn, getsysUSER_CD(), "AE2100010", getsysPLANT_CD());
            List resultList = bc.getsetLotNumberingFd(str_ITEM_CD, str_ISSUE_DATE);
            if(bc.getResultStatus().intValue() == 1){
                if(resultList != null && resultList.size() > 0){
                    result1 = (String)resultList.get(0);
                    struct.setLOT_NO(result1);
                    }
                }else{
                    if(resultList != null && resultList.size() > 1){
                        String result2 = (String)resultList.get(1);
                        setErrorMessage(result2);
                   }
                }
        }
        return result1;
    }

    //���b�g�i�ڍ݌ɓo�^�E�X�V����
    private void call_excUpdateLotStockFd(
            IDbConnection conn, 
            AE0100010Struct formStruct, 
            AE0100010Struct pastOnerousConsStruct, 
            String ctrlCd,                                  //���o�ɊǗ��ԍ�
            int mode)
            throws ParseException, DataNotFoundException, SQLException, FoundationException{
       
        // ���b�g�i�ڍ݌ɓo�^�E�X�V�������s��
        if(mode == 2 || mode == 21 || mode==31 || mode==22)
        {
            if((str_LOT_CTRL_FLG!=null && str_LOT_CTRL_FLG.equals("1"))
                    && (pastOnerousConsStruct.getLOT_NO()!=null 
                            && !"".equals(pastOnerousConsStruct.getLOT_NO())))
            {
                //���b�g�ʕi�ڍ݌ɓo�^�E�X�V�������s���B
                BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
                List updateLotStockList = bc.excUpdateLotStockFd(ctrlCd, "");
                if(bc.getResultStatus().intValue() == 3){
                    if(updateLotStockList != null && updateLotStockList.size() > 0){
                            setErrorMessage((String)updateLotStockList.get(0));
                            return;
                    }else{   
                    }
                }
            }
        }
        else
        {
            if(str_LOT_CTRL_FLG!=null && str_LOT_CTRL_FLG.equals("1"))
            {
                //���b�g�ʕi�ڍ݌ɓo�^�E�X�V�������s���B
                BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
                List updateLotStockList = bc.excUpdateLotStockFd(ctrlCd, "");
                if(bc.getResultStatus().intValue() == 3){
                    if(updateLotStockList != null && updateLotStockList.size() > 0){
                            setErrorMessage((String)updateLotStockList.get(0));
                            return;
                    }else{
                    }
                }
            }
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0100");
		logger.entering("AE0100010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			
			// �L�[��ޔ�
			String onerousConsNo = struct.getONEROUS_CONS_NO();
			
			// �L�[�ȊO�̍��ڂ�������
			initializeDetail();
			
			struct.setCOMPANY_CD(_myCompanyStruct.getCOMPANY_CD());
			
			// [�L���x������]�ɑΏۃf�[�^�����݂��Ȃ��ꍇ�G���[
			List pastOnerousConsList = entity.mT_PAST_ONEROUS_CONS.read(conn, struct);
			if (pastOnerousConsList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setErrorParameter("T_PAST_ONEROUS_CONS", "ONEROUS_CONS_NO", struct.getONEROUS_CONS_NO());
				return;
			}
			
			AE0100010Struct pastOnerousConsStruct = (AE0100010Struct)(pastOnerousConsList.get(0));
			
			// [�L���x������]."�H��R�[�h" �� ���O�C�����[�U�̍H��R�[�h �̏ꍇ�G���[
			if (sysPLANT_CD.equals(pastOnerousConsStruct.getPLANT_CD()) == false) {
				setErrorMessage("AE00138");
				setErrorParameter("T_PAST_ONEROUS_CONS", "ONEROUS_CONS_NO", struct.getONEROUS_CONS_NO());
				setErrorParameter("T_PAST_ONEROUS_CONS", "PLANT_CD", pastOnerousConsStruct.getPLANT_CD());
				return;
			}
			
			struct.setStruct(pastOnerousConsStruct);
			struct.setPUCH_ODR_CD(onerousConsNo);
			
			// ���|�Ǘ����C���X�g�[������Ă���ꍇ�A���N���x���擾
			AE0100010Struct readStruct = new AE0100010Struct();
			List installOptionsList = entity.mSYS_INSTALL_OPTIONS.read(conn, readStruct);
			if (installOptionsList.size() > 0) {
				AE0100010Struct installOptionsStruct = (AE0100010Struct)installOptionsList.get(0);
				struct.setINSTALL_FLG(installOptionsStruct.getINSTALL_FLG());
			} else {
				struct.setINSTALL_FLG("0");
			}
			
			// ���|�Ǘ����C���X�g�[������Ă���ꍇ�A���N���x���擾
			if ("1".equals(struct.getINSTALL_FLG())) {
				List debtCtrlList = entity.mSYS_DEBT_CTRL.read(conn, readStruct);
				if (debtCtrlList.size() > 0) {
					AE0100010Struct debtCtrlStruct = (AE0100010Struct)debtCtrlList.get(0);
					struct.setTHIS_MONTH(debtCtrlStruct.getTHIS_MONTH());
				} else {
					setErrorMessage("AE00145");
					return;
				}
			}
			
			// �L���x���݌ɊǗ��敪�����݂��Ȃ��ꍇ
			AE0100010Struct parameterStruct = new AE0100010Struct();
			parameterStruct.setNAME(sysPLANT_CD + "_ONEROUS_CONS_INV_TYP");
			List parameterList = entity.mSYS_PARAMETER.read(conn, parameterStruct);
			if (parameterList.isEmpty()) {
				setErrorMessage("AE00141");
				setErrorParameter("SYS_PARAMETER", "NAME", parameterStruct.getNAME());
				return;
			}
			parameterStruct = (AE0100010Struct)(parameterList.get(0));
			if ("TRUE".equals((parameterStruct.getVALUE()).toUpperCase())) {
				struct.setc_ONEROUS_CONS_INV_TYP("true");
			} else {
				struct.setc_ONEROUS_CONS_INV_TYP(null);
			}
			
			// [�L���x������].�h �ԕi���������敪�h��2:�L���x���ԕi���т���o�^�łȂ��ꍇ 2006/06/29 up
			if (!"2".equals(pastOnerousConsStruct.getRETURNED_GNR_TYP())){
				setErrorMessage("AE00158");
				setErrorParameter("T_PAST_ONEROUS_CONS", "ONEROUS_CONS_NO", struct.getONEROUS_CONS_NO());
				setErrorParameter("T_PAST_ONEROUS_CONS", "RETURNED_GNR_TYP", struct.getRETURNED_GNR_TYP());
				return;
			}//2006/06/29 end
			
			// �u�o�Ɏw���ԍ��v�A�u�����ԍ��v�ƃ��W�I�{�^�����N���A
			struct.setr1_FILTER("true");
			struct.setISSUE_INST_CD(null);
			struct.setPUCH_ODR_CD(null);
			
			// �u�ԕi���v�~-1
			struct.setISSUE_QTY(Calculate.multiply(struct.getISSUE_QTY(), "-1"));
			
			// �ԕi���z���v�Z����
			// ��������z��̌v�Z
			String puchOdrAmount =
					AmountCalculator.calcPuchOdrAmount(
							struct.getISSUE_QTY(),
							struct.getUNIT_COST(),
							struct.getROUND_TYP(),
							struct.getVEND_DECIMAL_FIG());
			struct.setPUCH_ODR_AMOUNT(puchOdrAmount);
			
			struct.setSelectUnitCostFlag("true");
			
			if ("0".equals(struct.getAP_PROC_TYP()) == false) {
				setErrorMessage("AE00092");
				setErrorParameter("T_PAST_ONEROUS_CONS", "ONEROUS_CONS_NO", struct.getONEROUS_CONS_NO());
				setErrorParameter("T_PAST_ONEROUS_CONS", "AP_PROC_TYP", struct.getAP_PROC_TYP());
				return;
			}
			
			// �ԕi��
			struct.seth_ISSUE_DATE(struct.getISSUE_DATE());

			if (!_lotCtrlFlg ) {
				struct.setLOT_NO(null);
			}
            struct.seth_LOT_NO_2(struct.getLOT_NO());
            if((struct.getLOT_NO()!=null && !"".equals(struct.getLOT_NO()))
                    &&(struct.getITEM_CD()!=null && !"".equals(struct.getITEM_CD())))
            {
                List lot_MODIFY_COUNT_List=entity.mselectT_LOT_CTRL.read(conn,struct);
                if(!lot_MODIFY_COUNT_List.isEmpty())
                {
                    struct_MODIFY_COUNT = (AE0100010Struct)lot_MODIFY_COUNT_List.get(0);
                }
            }
			readStatus = NORMAL;
			
		} catch (FoundationException e) {
			throw new ExpjException(e);
		} catch (DataNotFoundException e) {
			throw new ExpjException(e);
		} catch (SQLException e) {
			throw new ExpjException(e);
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AE0100010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �P���Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelectUnitCost() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0100");
		logger.entering("AE0100010Control"+":USER="+struct.getsUser_ID(),"controlSelectUnitCost");
			//{{user_implement_dev:<controlSelectUnitCost>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			_rcvIssueCtrlCd = null;
			
			// �u�x���P���Ǎ��v���I������Ă���ꍇ
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
					AE0100010Struct vendStruct = (AE0100010Struct)(vendList.get(0));
				}
				
				// �i�ڑ��݃`�F�b�N
				List itemList = entity.mM_ITEM.read(conn, struct);
				if (itemList.isEmpty()) {
					// �G���[
					setErrorMessage("AE00118");
					setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
				} else {
					AE0100010Struct itemStruct = (AE0100010Struct)(itemList.get(0));
					struct.setSTOCK_UNIT(itemStruct.getSTOCK_UNIT());
					// �i��.�݌ɐ��P�ʋ敪
					if ("1".equals(itemStruct.getUNIT_QTY_TYP()) == true
							&& Calculate.isInteger(struct.getISSUE_QTY()) == false) {
						// �G���[
						setErrorMessage("AE00146");
						setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
						setErrorParameter("M_ITEM", "UNIT_QTY_TYP", itemStruct.getUNIT_QTY_TYP());
					}
				}
				
				// �G���[������ΏI��
				if (msgStruct.hasError()) {
					return;
				}
				
				PuchUnitCostStruct pucs;
				
				ConsUnitCost cuc = null;
				
				// �����A�w���P���A�ʉ݁A����ł��擾
					cuc = new ConsUnitCost(conn);
					cuc.read(
							_myCompanyStruct.getCOMPANY_CD(),
							struct.getVEND_CD(),
							sysPLANT_CD,
							struct.getITEM_CD(),
							struct.getISSUE_DATE());
					
					// �P��
					BigDecimal unitCost = cuc.getUnitCost();
					struct.setUNIT_COST(unitCost.toString());
					
					// �P���敪
					int unitCostTyp = cuc.getUnitCostTyp();
					struct.setUNIT_COST_TYP(String.valueOf(unitCostTyp));
					
					try {
						// [�ʉ�]�����擾
						CurStruct cs =
						CurControl.getData(conn, struct.getCOMPANY_CD(), struct.getVEND_CD());
						struct.setVEND_CUR_UNIT(cs.getCUR_UNIT());
						struct.setROUND_TYP(cs.getROUND_TYP());
						struct.setVEND_DECIMAL_FIG(cs.getDECIMAL_FIG());
					} catch(DataNotFoundException dnfe) {
						throw new ExpjException(dnfe);
					}
				
				// �ԕi���z���v�Z����
				// ��������z��̌v�Z
				String puchOdrAmount =
						AmountCalculator.calcPuchOdrAmount(
								struct.getISSUE_QTY(),
								struct.getUNIT_COST(),
								struct.getROUND_TYP(),
								struct.getVEND_DECIMAL_FIG());
				struct.setPUCH_ODR_AMOUNT(puchOdrAmount);
				
			} else if ("true".equals(struct.getr2_FILTER()) || "true".equals(struct.getr3_FILTER())) {
				
				// �u�o�Ɏw���ԍ����w�肷��v�A�܂��́A�u�����ԍ����w�肷��v���I������Ă���ꍇ
				
				// ���̓`�F�b�N
				
				PuchUnitCostStruct pucs;
				
				// �����A�w���P���A�ʉ݁A����ł��擾
				try {
					
					AE0100010Struct selectStruct = new AE0100010Struct();
					// ���������ݒ�
					if ("true".equals(struct.getr2_FILTER())) {
						selectStruct.setISSUE_INST_CD(struct.getISSUE_INST_CD());
						selectStruct.setPUCH_ODR_CD(null);
						selectStruct.setITEM_CD(null);
					} else if ("true".equals(struct.getr3_FILTER())) {
						selectStruct.setISSUE_INST_CD(null);
						selectStruct.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
						selectStruct.setITEM_CD(struct.getITEM_CD());
					}
					
					List unitCostList = entity.mselectT_PAST_ONEROUS_CONS.read(conn, selectStruct);
					if (unitCostList.isEmpty()) {
						// �G���[
						if ("true".equals(struct.getr2_FILTER())) {
							setErrorMessage("AE00102");
							setErrorParameter("T_PAST_ONEROUS_CONS", "ISSUE_INST_CD", 
									struct.getISSUE_INST_CD());
						} else if ("true".equals(struct.getr3_FILTER())) {
							setErrorMessage("AE00103");
							setErrorParameter("T_PAST_ONEROUS_CONS", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
							setErrorParameter("T_PAST_ONEROUS_CONS", "ITEM_CD", struct.getITEM_CD());
						}
						return;
					} else {
						AE0100010Struct unitCostStruct = (AE0100010Struct)(unitCostList.get(0));
						
						if (sysPLANT_CD.equals(unitCostStruct.getPLANT_CD()) == false) {
							if ("true".equals(struct.getr2_FILTER())) {
								setErrorMessage("AE00096");
								setErrorParameter("T_PAST_ONEROUS_CONS", 
										"ISSUE_INST_CD", struct.getISSUE_INST_CD());
								setErrorParameter("T_PAST_ONEROUS_CONS", "PLANT_CD", 
										unitCostStruct.getPLANT_CD());
							} else if ("true".equals(struct.getr3_FILTER())) {
								setErrorMessage("AE00100");
								setErrorParameter("T_PAST_ONEROUS_CONS", "PUCH_ODR_CD", 
										struct.getPUCH_ODR_CD());
								setErrorParameter("T_PAST_ONEROUS_CONS", "PLANT_CD", 
										unitCostStruct.getPLANT_CD());
							}
							return;
						}
						
						// �u�����R�[�h�v��[�L���x������]."�����R�[�h"�ƈقȂ�ꍇ
						if (struct.getVEND_CD() != null && "".equals(struct.getVEND_CD()) == false) {
							if (struct.getVEND_CD().equals(unitCostStruct.getVEND_CD()) == false) {
								if ("true".equals(struct.getr2_FILTER())) {
									setErrorMessage("AE00097");
									setErrorParameter("T_PAST_ONEROUS_CONS", "ISSUE_INST_CD", 
											struct.getISSUE_INST_CD());
									setErrorParameter("T_PAST_ONEROUS_CONS", "VEND_CD", 
											unitCostStruct.getVEND_CD());
								} else if ("true".equals(struct.getr3_FILTER())) {
									setErrorMessage("AE00113");
									setErrorParameter("T_PAST_ONEROUS_CONS", "PUCH_ODR_CD", 
											struct.getPUCH_ODR_CD());
									setErrorParameter("T_PAST_ONEROUS_CONS", "VEND_CD", 
											unitCostStruct.getVEND_CD());
								}
							}
						}
						
						// �u�i�ڔԍ��v��[�L���x������]."�i�ڔԍ�"�ƈقȂ�ꍇ
						if (struct.getITEM_CD() != null && "".equals(struct.getITEM_CD()) == false) {
							if (struct.getITEM_CD().equals(unitCostStruct.getITEM_CD()) == false) {
								if ("true".equals(struct.getr2_FILTER())) {
									setErrorMessage("AE00098");
									setErrorParameter("T_PAST_ONEROUS_CONS", "ISSUE_INST_CD", 
											struct.getISSUE_INST_CD());
									setErrorParameter("T_PAST_ONEROUS_CONS", "ITEM_CD", 
											unitCostStruct.getITEM_CD());
									return;
								}
							}
						}
						
						// �u���ԁv��[�L���x������]."����"�ƈقȂ�ꍇ
						if (struct.getJOB_ODR_CD() != null && "".equals(struct.getJOB_ODR_CD()) == false) {
							if (struct.getJOB_ODR_CD().equals(unitCostStruct.getJOB_ODR_CD()) == false) {
								if ("true".equals(struct.getr2_FILTER())) {
									setErrorMessage("AE00106");
									setErrorParameter("T_PAST_ONEROUS_CONS", "ISSUE_INST_CD", 
											struct.getISSUE_INST_CD());
									setErrorParameter("T_PAST_ONEROUS_CONS", "JOB_ODR_CD", 
											unitCostStruct.getJOB_ODR_CD());
								} else if ("true".equals(struct.getr3_FILTER())) {
									setErrorMessage("AE00109");
									setErrorParameter("T_PAST_ONEROUS_CONS", "PUCH_ODR_CD", 
											struct.getPUCH_ODR_CD());
									setErrorParameter("T_PAST_ONEROUS_CONS", "JOB_ODR_CD", 
											unitCostStruct.getJOB_ODR_CD());
								}
							}
						}
						
						// �u�i�ڔԍ��v��[�L���x������]."�i�ڔԍ�"�ƈقȂ�ꍇ
						if (struct.getITEM_CD() != null && "".equals(struct.getITEM_CD()) == false) {
							if ("1".equals(unitCostStruct.getUNIT_QTY_TYP()) == true
									&& Calculate.isInteger(struct.getISSUE_QTY()) == false) {
								setErrorMessage("AE00146");
								setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
								setErrorParameter("M_ITEM", "UNIT_QTY_TYP", unitCostStruct.getUNIT_QTY_TYP());
							}
						}
						
						// �G���[������ΏI��
						if (msgStruct.hasError()) {
							return;
						}
						struct.setUNIT_COST_TYP(unitCostStruct.getUNIT_COST_TYP());  // �P���敪
						struct.setUNIT_COST(unitCostStruct.getUNIT_COST());  // �P��
						struct.setCOMPANY_CD(unitCostStruct.getCOMPANY_CD());  // �����R�[�h
						struct.setVEND_CD(unitCostStruct.getVEND_CD());  // �����R�[�h
						struct.setITEM_CD(unitCostStruct.getITEM_CD());  // �i�ڔԍ�
						struct.setJOB_ODR_CD(unitCostStruct.getJOB_ODR_CD());  // ����
						struct.setSTOCK_UNIT(unitCostStruct.getSTOCK_UNIT());  // �v�ʒP��
						
					}
					
				} catch (SQLException e) {
					throw new ExpjException(e);
				}
					
				// �בփ��[�g�����݂��Ȃ��ꍇ�̓��[�j���O�����Ƃ��邽�ߕʂɎ擾
				try {
					// ��ʊO�̕K�v�ȃf�[�^��ݒ�
					try {
						
						// [�ʉ�]�����擾
						CurStruct cs =
								CurControl.getData(conn, struct.getCOMPANY_CD(), struct.getVEND_CD());
						struct.setVEND_CUR_UNIT(cs.getCUR_UNIT());
						struct.setROUND_TYP(cs.getROUND_TYP());
						struct.setVEND_DECIMAL_FIG(cs.getDECIMAL_FIG());
					} catch(DataNotFoundException dnfe) {
						throw new ExpjException(dnfe);
					}
					
					// ��������z��̌v�Z
					String puchOdrAmount =
							AmountCalculator.calcPuchOdrAmount(
									struct.getISSUE_QTY(),
									struct.getUNIT_COST(),
									struct.getROUND_TYP(),
									struct.getVEND_DECIMAL_FIG());
					struct.setPUCH_ODR_AMOUNT(puchOdrAmount);
					
				} catch (SQLException e) {
					throw new ExpjException(e);
				}
			}
			// �ԕi���ۊǋ�R�[�h
			String defaultWhCd = ValidateWh.getDefaultRcv(conn, sysPLANT_CD, struct.getITEM_CD());
			struct.setRETURNED_WH_CD(defaultWhCd);
			
		} catch (SQLException e) {
			throw new ExpjException(e);
		}
		struct.setSelectUnitCostFlag("true");
                //}}user_implement_dev:<controlSelectUnitCost>
		logger.exiting("AE0100010Control"+":USER="+struct.getsUser_ID(),"controlSelectUnitCost");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0100");
		logger.entering("AE0100010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			_rcvIssueCtrlCd = null;
			
			// ���Y���̉ߋ��̎��ѓ��͂̐����`�F�b�N
			if(getSysParameter() == false){
				if(chkProcExecDate("1","",struct.getISSUE_DATE()) == false){
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
				AE0100010Struct vendStruct = (AE0100010Struct)(vendList.get(0));
				struct.setVEND_ANAME(vendStruct.getVEND_ANAME());
			}
			
			// �G���[������ΏI��
			if (msgStruct.hasError()) {
				return;
			}
			
			// �i�ڑ��݃`�F�b�N
			AE0100010Struct itemStruct = null;
			List itemList = entity.mM_ITEM.read(conn, struct);
			if (itemList.isEmpty()) {
				// �G���[
				setErrorMessage("AE00118");
				setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
			} else {
				itemStruct = (AE0100010Struct)(itemList.get(0));
				struct.setITEM_NAME(itemStruct.getITEM_NAME());
				struct.setSTOCK_UNIT(itemStruct.getSTOCK_UNIT());
                // �i�ڃ}�X�^����i�ڎ�z�敪���擾�A8�[���i�ڂ̏ꍇ�G���[
				if ("8".equals(itemStruct.getMRP_ODR_TYP())) {
                    // �G���[
					setErrorMessage("AE00203");
					setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
					setErrorParameter("M_ITEM", "MRP_ODR_TYP", itemStruct.getMRP_ODR_TYP());
				}
			}
			
			// �G���[������ΏI��
			if (msgStruct.hasError()) {
				return;
			}
			
			// �x���P�����݃`�F�b�N
			struct.setPLANT_CD(sysPLANT_CD);
			List consUnitCostList = entity.mM_CONS_UNIT_COST.read(conn, struct);
			if (consUnitCostList.isEmpty()) {
				// �G���[
				setErrorMessage("AE00119");
				setErrorParameter("M_CONS_UNIT_COST", "COMPANY_CD", struct.getCOMPANY_CD());
				setErrorParameter("M_CONS_UNIT_COST", "VEND_CD", struct.getVEND_CD());
				setErrorParameter("M_CONS_UNIT_COST", "PLANT_CD", sysPLANT_CD);
				setErrorParameter("M_CONS_UNIT_COST", "ITEM_CD", struct.getITEM_CD());
			}
			
			DateCtrlStruct dcs = DateCtrlControl.getData(conn, sysPLANT_CD);
			if (DateTool.compareYMD(struct.getISSUE_DATE(), dcs.getBUSINESS_OPR_DATE()) > 0) {
				setErrorMessage("AE00117");
				setErrorParameter("SYS_DATE_CTRL", "PLANT_CD", sysPLANT_CD);
				setErrorParameter(
					"SYS_DATE_CTRL",
					"BUSINESS_OPR_DATE",
					dcs.getBUSINESS_OPR_DATE());
				setErrorParameter(
					"T_PAST_ONEROUS_CONS",
					"ISSUE_DATE",
					struct.getISSUE_DATE());
			}
			
			// ���Ԍv�摶�݃`�F�b�N
			AE0100010Struct jobOdrStruct = null;
			if (struct.getJOB_ODR_CD() != null && "".equals(struct.getJOB_ODR_CD()) == false) {
				List jobOdrList = entity.mT_JOB_ODR.read(conn, struct);
				if (jobOdrList.isEmpty()) {
					// �G���[
					setErrorMessage("AE00110");
					setErrorParameter("T_JOB_ODR", "JOB_ODR_CD", struct.getJOB_ODR_CD());
				} else {
					jobOdrStruct = (AE0100010Struct)(jobOdrList.get(0));
					
					// ���Ԍv��.�H��R�[�h�����O�C�����[�U�̍H��R�[�h�ƈقȂ�ꍇ�G���[
					if (sysPLANT_CD.equals(jobOdrStruct.getPLANT_CD()) == false) {
						// �G���[
						setErrorMessage("AE00115");
						setErrorParameter("T_JOB_ODR", "JOB_ODR_CD", struct.getJOB_ODR_CD());
						setErrorParameter("T_JOB_ODR", "PLANT_CD", jobOdrStruct.getPLANT_CD());
					}
				}
			}
			
			// �u�ԕi�ۊǋ�R�[�h�v���݃`�F�b�N
			AE0100010Struct whStruct = new AE0100010Struct();
			whStruct.setWH_CD(struct.getRETURNED_WH_CD());
			whStruct.setVEND_CD(null);
			whStruct.setPLANT_CD(null);
			List whList = entity.mM_WH.read(conn, whStruct);
			if (whList.isEmpty()) {
				// �G���[
				setErrorMessage("AE00111");
				setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
			} else {
				// �ۊǋ�.�H��R�[�h�����O�C�����[�U�̍H��R�[�h�ƈقȂ�ꍇ�G���[
				whStruct = (AE0100010Struct)(whList.get(0));
				if (sysPLANT_CD.equals(whStruct.getPLANT_CD()) == false) {
					// �G���[
					setErrorMessage("AE00116");
					setErrorParameter("T_JOB_ODR", "JOB_ODR_CD", struct.getJOB_ODR_CD());
					setErrorParameter("T_JOB_ODR", "PLANT_CD", whStruct.getPLANT_CD());
				}
			}
			
			// �G���[������ΏI��
			if (msgStruct.hasError()) {
				return;
			}
			
			// �ۊǋ�.���v�ʌv�Z�Ώۃt���O=0�F��̏ꍇ�G���[
			if ("0".equals(whStruct.getMRP_FLG())) {
				// �G���[
				setErrorMessage("AE00112");
				setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
				setErrorParameter("M_WH", "MRP_FLG", whStruct.getMRP_FLG());
			}
            // [�i��]�D�h���b�g�Ǘ��t���O�h���O�i���b�g�g���[�X�Ǘ����Ȃ��j����ʁD�u�݌Ƀ��b�g�ԍ��v���m�t�k�k�ꍇ
            if ("0".equals(itemStruct.geth_LOT_CTRL_FLG())== true
                    && struct.getLOT_NO()!= null
                    && !"".equals(struct.getLOT_NO())) {
                // �G���[
                setErrorMessage("AE20601");
            }
            
            // [�i��]�D�h���b�g�Ǘ��t���O�h���P�i���b�g�g���[�X�Ǘ�����j�`�m�c[�i��]�D�h���b�g�ԍ��̔ԋ敪�h�� 0�F����́A����ʁD[�݌Ƀ��b�g�ԍ�]���m�t�k�k�ꍇ
            if("1".equals(itemStruct.geth_LOT_CTRL_FLG())== true
                    && "0".equals(itemStruct.geth_LOT_NUMBERING_TYP())==true
                    && (struct.getLOT_NO() == null
                    || "".equals(struct.getLOT_NO()))) {
                // �G���[
                setErrorMessage("AE20600"); 
                setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
            }
           
            // �u�i�ڔԍ��v�ƈ�v����[�i��].�h�݌ɐ��P�ʋ敪�h��1:�����Ǘ��Łu�ԕi���v�������łȂ��ꍇ
			if ("1".equals(itemStruct.getUNIT_QTY_TYP()) == true
					&& Calculate.isInteger(struct.getISSUE_QTY()) == false) {
				// �G���[
				setErrorMessage("AE00146");
				setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
				setErrorParameter("M_ITEM", "UNIT_QTY_TYP", itemStruct.getUNIT_QTY_TYP());
			}
			
			// �L���x���݌ɊǗ��敪�����݂��Ȃ��ꍇ
			AE0100010Struct parameterStruct = new AE0100010Struct();
			parameterStruct.setNAME(sysPLANT_CD + "_ONEROUS_CONS_INV_TYP");
			List parameterList = entity.mSYS_PARAMETER.read(conn, parameterStruct);
			if (parameterList.isEmpty()) {
				setErrorMessage("AE00141");
				setErrorParameter("SYS_PARAMETER", "NAME", parameterStruct.getNAME());
			}
			
            
			// �G���[������ΏI��
			if (msgStruct.hasError()) {
				return;
			}
			
			// �u�����݌ɂ��X�V����v��ON�̏ꍇ
			if ("true".equals(struct.getc_ONEROUS_CONS_INV_TYP())) {
				parameterStruct = (AE0100010Struct)(parameterList.get(0));
				if ("TRUE".equals((parameterStruct.getVALUE()).toUpperCase()) == false) {
					setErrorMessage("AE00140");
					setErrorParameter("SYS_PARAMETER", "NAME", parameterStruct.getNAME());
					setErrorParameter("SYS_PARAMETER", "VALUE", parameterStruct.getVALUE());
				}
			}
			
			if ("true".equals(struct.getc_ONEROUS_CONS_INV_TYP())) {
				// �����ۊǋ�̑��݃`�F�b�N
				whStruct = new AE0100010Struct();
				whStruct.setWH_CD(null);
				whStruct.setVEND_CD(struct.getVEND_CD());
				whStruct.setPLANT_CD(sysPLANT_CD);
				whList = entity.mM_WH.read(conn, whStruct);
				if (whList.isEmpty()) {
					// �G���[
					setErrorMessage("AE00139");
					setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
				}
			}
			
			// �G���[������ΏI��
			if (msgStruct.hasError()) {
				return;
			}
			
            //�����݌ɂ��X�V���邪On�A���b�g�ԍ���Null�̏ꍇ
            if("1".equals(itemStruct.geth_LOT_CTRL_FLG())== true
                    && !"0".equals(itemStruct.geth_LOT_NUMBERING_TYP())==true
                    && (struct.getLOT_NO() == null
                    || "".equals(struct.getLOT_NO()))
                    && "true".equals(struct.getc_ONEROUS_CONS_INV_TYP())) {
                // �G���[
                setErrorMessage("AE20600"); 
                setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
            }
            
            List t_LOT_CTRL_List=entity.mselectT_LOT_CTRL.read(conn,struct);
            // [�i��]�D�h���b�g�Ǘ��t���O�h���P�i���b�g�g���[�X�Ǘ�����j����ʁD�u�݌Ƀ��b�g�ԍ�]���m�t�k�k���A��ʂœ��͂��ꂽ�u�i�ڔԍ��v�A�u�݌Ƀ��b�g�ԍ��v��[���b�g�Ǘ�]�e�[�u���ɑ��݂��Ȃ��ꍇ
            if("1".equals(itemStruct.geth_LOT_CTRL_FLG())== true
                    && struct.getLOT_NO() != null
                    && !"".equals(struct.getLOT_NO())) {
            	if(t_LOT_CTRL_List.isEmpty()){
            		if ("true".equals(struct.getc_ONEROUS_CONS_INV_TYP())) {
            			//���͂��ꂽ�݌Ƀ��b�g�ԍ��͂��̕i�ڂɊY�����܂���B���b�g�Ǘ�����o�^���Ă������B
                        setErrorMessage("AE21002");
                        setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
                        setErrorParameter("T_LOT_CTRL", "LOT_NO", struct.getLOT_NO());
            		} else {
            			String logMessage = "";
            			BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
						//�ܖ����������v�Z 
						if(StringUtil.Validate(struct.getITEM_CD()) 
								&& StringUtil.Validate(struct.getISSUE_DATE())) {
							List resList = new ArrayList();
							Integer retSts;
							String errCode = null;
							
							resList = bc.calcBestBeforeFd(struct.getITEM_CD(), struct.getISSUE_DATE());
							if(!resList.isEmpty()) {
								String bestBeforeDate = (String) resList.get(0);
								errCode = (String) resList.get(1);
								retSts = bc.getResultStatus();
								if(retSts != null && retSts.intValue() == 1) {
									if(bestBeforeDate.equals("0")) {
										bestBeforeDate = "";
										setWarningMessage("AE22010", struct.getITEM_CD(), struct.getLOT_NO());
									}
									struct.setBEST_BEFORE_DATE(bestBeforeDate);
								}
								if(retSts != null && retSts.intValue() == 3) {
									logMessage = "CalcBestBeforeFd was Failed..." ;
									setErrorMessage(errCode,logMessage);
									return ;
								}
							}
						}
						// [���b�g�Ǘ�]�ɒǉ�
						struct.setPRD_CMPLT_DATE(struct.getISSUE_DATE());
						entity.mselectT_LOT_CTRL.create(conn, struct);
					}
                } else {
                    //[���b�g�Ǘ�]�D�g�ܖ������h���Ɩ��^�p���@�ꍇ
                    String str_BEST_BEFORE_DATE=((AE0100010Struct)t_LOT_CTRL_List.get(0)).getBEST_BEFORE_DATE();
                    if(str_BEST_BEFORE_DATE != null && !"".equals(str_BEST_BEFORE_DATE))
                    {
                        if (DateTool.compareYMD(dcs.getBUSINESS_OPR_DATE(),str_BEST_BEFORE_DATE) > 0) {
                        	//���͂��ꂽ�݌Ƀ��b�g�ԍ��������؂�ƂȂ��Ă��܂��B
                            setErrorMessage("AE21003");
                            setErrorParameter("T_LOT_CTRL","ITEM_CD",struct.getITEM_CD());
                            setErrorParameter("T_LOT_CTRL","LOT_NO",struct.getLOT_NO());
                        }
                    }
                }
            }
			// �G���[������ΏI��
			if (msgStruct.hasError()) {
				return;
			}
			
            if(!itemList.isEmpty())
            {
                AE0100010Struct struct_LotNumber=(AE0100010Struct)itemList.get(0);
                str_LOT_CTRL_FLG = struct_LotNumber.geth_LOT_CTRL_FLG();
                add_callgetsetLotNumberingFd(struct_LotNumber);
            }
			// �ԕi��ۊǋ�̍݌ɍX�V
			updateStock(conn, struct, null, 1);
			
			// �����ۊǋ�̍݌ɍX�V
			// �u�����݌ɂ��X�V����v��ON�̏ꍇ
			if ("true".equals(struct.getc_ONEROUS_CONS_INV_TYP())) {
				updateStock(conn, struct, null, 11);
			}
			
			// �G���[������ΏI��
			if (msgStruct.hasError()) {
				return;
			}
			
			// �L���x������ǉ�
			// �L���x���ԍ��̔�
			String ctrlCd = null;
			Numbering numbering = new Numbering(
									conn,
									Numbering.ONERCONS_CD, 
									getsysUSER_CD(), 
									this.sp.getProcId(), 
									sysPLANT_CD);
			try {
				ctrlCd = numbering.getNo();
				if (ctrlCd == null) {
					ExpjMessage emsg = new ExpjMessage("AE00152");
					throw new FoundationException(
									"AE0100010Control",
									"controlInsert()",
									emsg.getMessage());
				}
			} catch(FoundationException ex) {
				// �o�^�������s�F���o�ɊǗ��ԍ��i�o�Ɂj�̍̔ԂɎ��s���܂���
				setErrorMessage("AE00152");
				ExpjMessage emsg = new ExpjMessage("ZZ01106");
				sysLog.severe(emsg, getsysUSER_CD());
				ExpjException ee = new ExpjException(ex, emsg);
				throw ee;
			}
			AE0100010Struct insertStruct = new AE0100010Struct();
			setStructSystemData(insertStruct);
			insertStruct.setStruct(struct);
			insertStruct.setONEROUS_CONS_NO(ctrlCd);  // �L���x���ԍ�
			insertStruct.setCOMPANY_CD(_myCompanyStruct.getCOMPANY_CD());  // ��ЃR�[�h
			insertStruct.setPLANT_CD(sysPLANT_CD);  // �H��R�[�h
			insertStruct.setJOB_ODR_DETAIL_NO("0");  // ���Ԏ}��
			
			insertStruct.setWORK_ODR_CD("");  // ��ƌv��ԍ�
			insertStruct.setWORK_IN_PROC_CD("");  // �d�|��ƃR�[�h
			insertStruct.setPUCH_ODR_CD("");  // �����ԍ�
			insertStruct.setRETURNED_GNR_TYP("2");  // �ԕi���������敪
			insertStruct.setAP_PROC_TYP("0");  // ���|�����敪
			
			insertStruct.setISSUE_QTY(Calculate.multiply(insertStruct.getISSUE_QTY(), "-1"));
			insertStruct.setRCV_ISSUE_CTRL_CD(_rcvIssueCtrlCd);  // ���o�ɊǗ��ԍ�
			insertStruct.setISSUE_INST_CD(null);    //�o�Ɏw���ԍ�

			entity.mT_PAST_ONEROUS_CONS.create(conn, insertStruct);
            //�u�i�ڔԍ��v�A[�݌Ƀ��b�g�ԍ�]�R���g���[���̒l���A[���b�g�Ǘ�]�ɑ��݂��Ȃ��ꍇ�̓G���[
            if(!itemList.isEmpty())
            {
                AE0100010Struct struct_LOT_CTRL_FLG=(AE0100010Struct)itemList.get(0);
                if((struct.getLOT_NO() != null && !"".equals(struct.getLOT_NO()))
                        && (struct_LOT_CTRL_FLG.geth_LOT_CTRL_FLG() != null 
                            && "1".equals(struct_LOT_CTRL_FLG.geth_LOT_CTRL_FLG())))
                    {
                        struct.setDEL_FLG("0");
                        entity.mselectT_LOT_CTRL.update(conn,struct);
                    }
            }
			
			// �o�^��f�[�^�ĕ\��
			struct.setONEROUS_CONS_NO(ctrlCd);
			controlSelect();
			
/*            if(struct.geth_LOT_CTRL_FLG()!=null && struct.geth_LOT_CTRL_FLG().equals("1"))
            {
                rcvIssueAter(struct,null);
            }*/
            
			conn.commit();
			
		} catch(ParseException e) {
			throw new ExpjException(e);
		} catch(DataNotFoundException e) {
			throw new ExpjException(e);
		} catch(SQLException e) {
			throw new ExpjException(e);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
                //}}user_implement_dev:<controlInsert>
		logger.exiting("AE0100010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0100");
		logger.entering("AE0100010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			_rcvIssueCtrlCd = null;
			
			
			// ���Y���̉ߋ��̎��ѓ��͂̐����`�F�b�N
			if(getSysParameter() == false){
				if(chkProcExecDate("2",struct.geth_ISSUE_DATE(),struct.getISSUE_DATE()) == false){
					setErrorMessage(ProcExecDateError);
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
					return;
				}
			}
			
			DateCtrlStruct dcs = DateCtrlControl.getData(conn, sysPLANT_CD);
			if (DateTool.compareYMD(struct.getISSUE_DATE(), dcs.getBUSINESS_OPR_DATE()) > 0) {
				setErrorMessage("AE00117");
				setErrorParameter("SYS_DATE_CTRL", "PLANT_CD", sysPLANT_CD);
				setErrorParameter(
					"SYS_DATE_CTRL",
					"BUSINESS_OPR_DATE",
					dcs.getBUSINESS_OPR_DATE());
				setErrorParameter(
					"T_PUCH_ODR_RTN_DATE",
					"ISSUE_DATE",
					struct.getISSUE_DATE());
			}
			
			// �u�ԕi��ۊǋ�R�[�h�v���݃`�F�b�N
			AE0100010Struct whStruct = new AE0100010Struct();
			whStruct.setWH_CD(struct.getRETURNED_WH_CD());
			whStruct.setVEND_CD(null);
			whStruct.setPLANT_CD(null);
			List whList = entity.mM_WH.read(conn, whStruct);
			if (whList.isEmpty()) {
				// �G���[
				setErrorMessage("AE00111");
				setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
			} else {
				// [�ۊǋ�]."�H��R�[�h"�����O�C�����[�U�̍H��R�[�h�ƈقȂ�ꍇ�G���[
				whStruct = (AE0100010Struct)(whList.get(0));
				if (sysPLANT_CD.equals(whStruct.getPLANT_CD()) == false) {
					// �G���[
					setErrorMessage("AE00116");
					setErrorParameter("T_JOB_ODR", "JOB_ODR_CD", struct.getJOB_ODR_CD());
					setErrorParameter("T_JOB_ODR", "PLANT_CD", whStruct.getPLANT_CD());
				}
			}
			
			// �G���[������ΏI��
			if (msgStruct.hasError()) {
				return;
			}
			
			// [�ۊǋ�]."���v�ʌv�Z�Ώۃt���O"=0�F��̏ꍇ�G���[
			if ("0".equals(whStruct.getMRP_FLG())) {
				// �G���[
				setErrorMessage("AE00112");
				setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
				setErrorParameter("M_WH", "MRP_FLG", whStruct.getMRP_FLG());
			}
			
			// �i�ڑ��݃`�F�b�N
			AE0100010Struct itemStruct = null;
			List itemList = entity.mM_ITEM.read(conn, struct);
			if (itemList.isEmpty()) {
				// �G���[
				setErrorMessage("AE00118");
				setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
			} else {
				itemStruct = (AE0100010Struct)(itemList.get(0));
				struct.setITEM_NAME(itemStruct.getITEM_NAME());
				if ("1".equals(itemStruct.getUNIT_QTY_TYP()) == true
						&& Calculate.isInteger(struct.getISSUE_QTY()) == false) {
					// �G���[
					setErrorMessage("AE00146");
					setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
					setErrorParameter("M_ITEM", "UNIT_QTY_TYP", itemStruct.getUNIT_QTY_TYP());
				}
			}
            // [�i��]�D�h���b�g�Ǘ��t���O�h���O�i���b�g�g���[�X�Ǘ����Ȃ��j����ʁD�u�݌Ƀ��b�g�ԍ��v���m�t�k�k�ꍇ
            if ("0".equals(struct.geth_LOT_CTRL_FLG())== true
                    && struct.getLOT_NO() != null && !"".equals(struct.getLOT_NO())) {
                // �G���[
                setErrorMessage("AE20601");
            }
            
            // [�i��]�D�h���b�g�Ǘ��t���O�h���P�i���b�g�g���[�X�Ǘ�����j�`�m�c[�i��]�D�h���b�g�ԍ��̔ԋ敪�h�� 0�F�A����ʁD[�݌Ƀ��b�g�ԍ�]���m�t�k�k�ꍇ
            if("1".equals(struct.geth_LOT_CTRL_FLG())== true
                    && "0".equals(struct.geth_LOT_NUMBERING_TYP())==true
                    && (struct.getLOT_NO()==null || "".equals(struct.getLOT_NO()))) {
                // �G���[
                setErrorMessage("AE20600"); 
                setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
            }
            
            
            List t_LOT_CTRL_List=entity.mselectT_LOT_CTRL.read(conn,struct);
            // [�i��]�D�h���b�g�Ǘ��t���O�h���P�i���b�g�g���[�X�Ǘ�����j����ʁD�u�݌Ƀ��b�g�ԍ�]���m�t�k�k���A��ʂœ��͂��ꂽ�u�i�ڔԍ��v�A�u�݌Ƀ��b�g�ԍ��v��[���b�g�Ǘ�]�e�[�u���ɑ��݂��Ȃ��ꍇ
            if("1".equals(itemStruct.geth_LOT_CTRL_FLG())== true
                    && struct.getLOT_NO() != null && !"".equals(struct.getLOT_NO())) {
                
                if(t_LOT_CTRL_List.isEmpty()){
                	if ("true".equals(struct.getc_ONEROUS_CONS_INV_TYP())) {
                        // �G���[
                        setErrorMessage("AE21002");
                        setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
                        setErrorParameter("T_LOT_CTRL", "LOT_NO", struct.getLOT_NO());
                	} else {
            			String logMessage = "";
            			BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
						//�ܖ����������v�Z 
						if(StringUtil.Validate(struct.getITEM_CD()) 
								&& StringUtil.Validate(struct.getISSUE_DATE())) {
							List resList = new ArrayList();
							Integer retSts;
							String errCode = null;
							
							resList = bc.calcBestBeforeFd(struct.getITEM_CD(), struct.getISSUE_DATE());
							if(!resList.isEmpty()) {
								String bestBeforeDate = (String) resList.get(0);
								errCode = (String) resList.get(1);
								retSts = bc.getResultStatus();
								if(retSts != null && retSts.intValue() == 1) {
									if(bestBeforeDate.equals("0")) {
										bestBeforeDate = "";
										setWarningMessage("AE22010", struct.getITEM_CD(), struct.getLOT_NO());
									}
									struct.setBEST_BEFORE_DATE(bestBeforeDate);
								}
								if(retSts != null && retSts.intValue() == 3) {
									logMessage = "CalcBestBeforeFd was Failed..." ;
									setErrorMessage(errCode,logMessage);
									return ;
								}
							}
						}
						// [���b�g�Ǘ�]�ɒǉ�
						struct.setPRD_CMPLT_DATE(struct.getISSUE_DATE());
						entity.mselectT_LOT_CTRL.create(conn, struct);
                	}
                }
            }
			// �L���x���݌ɊǗ��敪�����݂��Ȃ��ꍇ
			AE0100010Struct parameterStruct = new AE0100010Struct();
			parameterStruct.setNAME(sysPLANT_CD + "_ONEROUS_CONS_INV_TYP");
			List parameterList = entity.mSYS_PARAMETER.read(conn, parameterStruct);
			if (parameterList.isEmpty()) {
				setErrorMessage("AE00141");
				setErrorParameter("SYS_PARAMETER", "NAME", parameterStruct.getNAME());
			}
			
			// �G���[������ΏI��
			if (msgStruct.hasError()) {
				return;
			}
			
			// �u�����݌ɂ��X�V����v��ON�̏ꍇ
			if ("true".equals(struct.getc_ONEROUS_CONS_INV_TYP())) {
				parameterStruct = (AE0100010Struct)(parameterList.get(0));
				if ("TRUE".equals((parameterStruct.getVALUE()).toUpperCase()) == false) {
					setErrorMessage("AE00140");
					setErrorParameter("SYS_PARAMETER", "NAME", parameterStruct.getNAME());
					setErrorParameter("SYS_PARAMETER", "VALUE", parameterStruct.getVALUE());
				}
			}
			
			//
			if ("true".equals(struct.getc_ONEROUS_CONS_INV_TYP())) {
				// �����ۊǋ�̑��݃`�F�b�N
				whStruct = new AE0100010Struct();
				whStruct.setWH_CD(null);
				whStruct.setVEND_CD(struct.getVEND_CD());
				whStruct.setPLANT_CD(sysPLANT_CD);
				whList = entity.mM_WH.read(conn, whStruct);
				if (whList.isEmpty()) {
					// �G���[
					setErrorMessage("AE00139");
					setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
				}
			}
			
			// �G���[������ΏI��
			if (msgStruct.hasError()) {
				return;
			}
            // �B �݌Ƀ��b�g�ԍ��̔ԏ���            
            if(!itemList.isEmpty())
            {
                AE0100010Struct struct_LotNumber=(AE0100010Struct)itemList.get(0);
                str_LOT_CTRL_FLG=struct_LotNumber.geth_LOT_CTRL_FLG();
                add_callgetsetLotNumberingFd(struct_LotNumber);
            }
            
			// �݌ɍX�V����
			// ��ʓ��͒l��ޔ�
			AE0100010Struct formStruct = new AE0100010Struct();
			formStruct.setStruct(struct);
			
			List puchOdrRtnRsltList = entity.mT_PAST_ONEROUS_CONS_LOCK.read(conn, struct);
			if (puchOdrRtnRsltList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setErrorParameter("T_PAST_ONEROUS_CONS", "ONEROUS_CONS_NO", struct.getONEROUS_CONS_NO());
				return;
			}
			AE0100010Struct pastOnerousConsStruct = (AE0100010Struct)(puchOdrRtnRsltList.get(0));
			
			if ((pastOnerousConsStruct.getMODIFY_COUNT()).equals(
					formStruct.getMODIFY_COUNT()) == false) {
				setErrorMessage("ZZ01105");
				return;
			}
			
			if (Calculate.compare(formStruct.getISSUE_QTY(), 
					Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1")) != 0 
					|| formStruct.getRETURNED_WH_CD().equals(
							pastOnerousConsStruct.getRETURNED_WH_CD()) == false 
					|| formStruct.getISSUE_DATE().equals(pastOnerousConsStruct.getISSUE_DATE()) == false
					|| formStruct.getLOT_NO().equals(pastOnerousConsStruct.getLOT_NO()) == false) {
				
				// �݌Ƀ}�C�i�X�X�V
				updateStock(conn, formStruct, pastOnerousConsStruct, 2);
				
				// �݌Ƀv���X�X�V
				updateStock(conn, formStruct, null, 1);
			}
			
			if ((Calculate.compare(formStruct.getISSUE_QTY(), 
					Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1")) != 0 
					|| formStruct.getRETURNED_WH_CD().equals(
							pastOnerousConsStruct.getRETURNED_WH_CD()) == false 
					|| formStruct.getISSUE_DATE().equals(pastOnerousConsStruct.getISSUE_DATE()) == false
					|| formStruct.getLOT_NO().equals(pastOnerousConsStruct.getLOT_NO()) == false) 
					&& "true".equals(formStruct.getc_ONEROUS_CONS_INV_TYP())) {
				// �����ۊǋ�̍݌ɍX�V
				updateStock(conn, formStruct, pastOnerousConsStruct, 21);
			}

			// �L���x�������X�V
			AE0100010Struct updateStruct = new AE0100010Struct();
			setStructSystemData(updateStruct);
			updateStruct.setStruct(struct);
			updateStruct.setISSUE_QTY(Calculate.multiply(updateStruct.getISSUE_QTY(), "-1"));
			if (Calculate.compare(formStruct.getISSUE_QTY(), 
					Calculate.multiply(pastOnerousConsStruct.getISSUE_QTY(), "-1")) != 0 
					|| formStruct.getRETURNED_WH_CD().equals(
							pastOnerousConsStruct.getRETURNED_WH_CD()) == false 
					|| formStruct.getISSUE_DATE().equals(pastOnerousConsStruct.getISSUE_DATE()) == false) {
				updateStruct.setRCV_ISSUE_CTRL_CD(_rcvIssueCtrlCd);
				entity.mT_PAST_ONEROUS_CONS.update(conn, updateStruct);
			} else {
				updateStruct.setRCV_ISSUE_CTRL_CD(null);
				entity.mupdateT_PAST_ONEROUS_CONS.update(conn, updateStruct);
			}
            //�u�i�ڔԍ��v�A[�݌Ƀ��b�g�ԍ�]�R���g���[���̒l���A[���b�g�Ǘ�]�ɑ��݂��Ȃ��ꍇ�̓G���[
            if(!itemList.isEmpty())
            {
                AE0100010Struct struct_LOT_CTRL_FLG=(AE0100010Struct)itemList.get(0);
                
                List list_MODIFY_COUNT=entity.mselectT_LOT_CTRL.read(conn, struct);
                if((struct.getLOT_NO()!=null && !"".equals(struct.getLOT_NO()))
                        && (struct_LOT_CTRL_FLG.geth_LOT_CTRL_FLG()!=null 
                                && struct_LOT_CTRL_FLG.geth_LOT_CTRL_FLG().equals("1"))) {
                    if(list_MODIFY_COUNT.isEmpty()) {
                        setErrorMessage("ZZ06001");
                        setErrorParameter("T_LOT_CTRL", "ITEM_CD", struct.getITEM_CD());
                        setErrorParameter("T_LOT_CTRL", "LOT_NO", struct.getLOT_NO());
                        return;
                    } else {
                        AE0100010Struct modStruct = (AE0100010Struct)list_MODIFY_COUNT.get(0);
                        if(struct.geth_LOT_NO_2()==null || "".equals(struct.geth_LOT_NO_2())) {
                            struct.setDEL_FLG("0");
                            entity.mselectT_LOT_CTRL.update(conn,struct);
                        } else {
                            if(!modStruct.getLOT_MODIFY_COUNT().equals(struct_MODIFY_COUNT.getLOT_MODIFY_COUNT())) {
/*                                setErrorMessage("ZZ01105");
                                return;*/
                            } else {
                                struct.setDEL_FLG("0");
                                entity.mselectT_LOT_CTRL.update(conn,struct);
                            } 
                        }
                    }
                }
            }
			// �G���[������ΏI��
			if (msgStruct.hasError()) {
				return;
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
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
                //}}user_implement_dev:<controlUpdate>
		logger.exiting("AE0100010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * �폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0100");
		logger.entering("AE0100010Control"+":USER="+struct.getsUser_ID(),"controlDelete");
			//{{user_implement_dev:<controlDelete>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			_rcvIssueCtrlCd = null;
			
			// ���Y���̉ߋ��̎��ѓ��͂̐����`�F�b�N
			if(getSysParameter() == false){
				if(chkProcExecDate("3",struct.geth_ISSUE_DATE(),struct.getISSUE_DATE()) == false){
					setErrorMessage(ProcExecDateError);
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
					return;
				}
			}
			
			AE0100010Struct formStruct = new AE0100010Struct();
			formStruct.setStruct(struct);
			
			// �L���x������ԍ����L�[�ɍēǍ��ƃ��b�N
			List puchOdrRtnRsltList = entity.mT_PAST_ONEROUS_CONS_LOCK.read(conn, struct);
			if (puchOdrRtnRsltList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setErrorParameter("T_PAST_ONEROUS_CONS", "ONEROUS_CONS_NO", struct.getONEROUS_CONS_NO());
				return;
			}
			AE0100010Struct pastOnerousConsStruct = (AE0100010Struct)(puchOdrRtnRsltList.get(0));
			
			// [�L���x������]�̍X�V�����قȂ�ꍇ�G���[
			if ((pastOnerousConsStruct.getMODIFY_COUNT()).equals(
					formStruct.getMODIFY_COUNT()) == false) {
				setErrorMessage("ZZ01105");
				return;
			}
			
			// �L���x���݌ɊǗ��敪�����݂��Ȃ��ꍇ
			AE0100010Struct parameterStruct = new AE0100010Struct();
			parameterStruct.setNAME(sysPLANT_CD + "_ONEROUS_CONS_INV_TYP");
			List parameterList = entity.mSYS_PARAMETER.read(conn, parameterStruct);
			if (parameterList.isEmpty()) {
				setErrorMessage("AE00141");
				setErrorParameter("SYS_PARAMETER", "NAME", parameterStruct.getNAME());
			}
			
			// �G���[������ΏI��
			if (msgStruct.hasError()) {
				return;
			}
			// �u�����݌ɂ��X�V����v��ON�̏ꍇ
			if ("true".equals(struct.getc_ONEROUS_CONS_INV_TYP())) {
				parameterStruct = (AE0100010Struct)(parameterList.get(0));
				if ("TRUE".equals((parameterStruct.getVALUE()).toUpperCase()) == false) {
					setErrorMessage("AE00140");
					setErrorParameter("SYS_PARAMETER", "NAME", parameterStruct.getNAME());
					setErrorParameter("SYS_PARAMETER", "VALUE", parameterStruct.getVALUE());
				}
			}
			
			//
			if ("true".equals(struct.getc_ONEROUS_CONS_INV_TYP())) {
				// �����ۊǋ�̑��݃`�F�b�N
				AE0100010Struct whStruct = new AE0100010Struct();
				whStruct.setWH_CD(null);
				whStruct.setVEND_CD(struct.getVEND_CD());
				whStruct.setPLANT_CD(sysPLANT_CD);
				List whList = entity.mM_WH.read(conn, whStruct);
				if (whList.isEmpty()) {
					// �G���[
					setErrorMessage("AE00139");
					setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
				}
			}
			// �G���[������ΏI��
			if (msgStruct.hasError()) {
				return;
			}
			
			// �݌ɍX�V
			updateStock(conn, formStruct, pastOnerousConsStruct, 2);
			
			if ("true".equals(formStruct.getc_ONEROUS_CONS_INV_TYP())) {
				// �����ۊǋ�݌ɍX�V
				updateStock(conn, formStruct, pastOnerousConsStruct, 31);
			}
			
			// �L���x�������폜
			entity.mT_PAST_ONEROUS_CONS.delete(conn, struct);

			conn.commit();
			
			initializeAll();
			
		} catch(ParseException e) {
			throw new ExpjException(e);
		} catch(DataNotFoundException e) {
			throw new ExpjException(e);
		} catch(SQLException e) {
			throw new ExpjException(e);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
                //}}user_implement_dev:<controlDelete>
		logger.exiting("AE0100010Control"+":USER="+struct.getsUser_ID(),"controlDelete");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0100");
		logger.entering("AE0100010Control"+":USER="+struct.getsUser_ID(),"controlClear");
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
		logger.exiting("AE0100010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ���b�g�Ǘ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlLotCtrl() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0100");
		logger.entering("AE0100010Control"+":USER="+struct.getsUser_ID(),"controlLotCtrl");
			//{{user_implement_dev:<controlLotCtrl>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlLotCtrl>
		logger.exiting("AE0100010Control"+":USER="+struct.getsUser_ID(),"controlLotCtrl");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0100");
		logger.entering("AE0100010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AE0100010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0100");
		logger.entering("AE0100010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			
			// [����]���𕔕i���擾			
			_myCompanyStruct = MyCompanyControl.getData(conn);
			
			// �R���{�{�b�N�X�f�[�^�𕔕i���擾
			ComboBox cdac = new ComboBox(conn, sysUSER_CD);
			_unitCostTypStruct = cdac.getData("UNIT_COST_TYP");
			cdac.setConnection(null);
			
			// ��ʂ�������
			initializeAll();
			//�V�X�e�������t���O�擾
			_lotCtrlFlg = LotCtrl.checkLotCtrl(conn);
			// ��ʑJ�ڂ̌Ăяo����������AStruct�ɉ�ʑJ�ڃL�[��ݒ肵��controlselect()���Ăяo��
			if (isScreenMove() == true) {
				// �L�[�ƂȂ鍀�ڂ�struct�Ɋi�[���āA�����̃R���g���[�����\�b�h���Ăяo���܂��B
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
		logger.exiting("AE0100010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0100");
		logger.entering("AE0100010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		try {
			ComboBox cdac = new ComboBox(conn, sysUSER_CD);
			_unitCostTypStruct = cdac.getData("UNIT_COST_TYP");
			cdac.setConnection(null);
		} catch (SQLException e) {
			throw new ExpjException(e);
		} catch (ComboException e) {
			throw new ExpjException(e);
		}
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AE0100010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("LotCtrl") ) {
				controlLotCtrl();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			if (_lotCtrlFlg == true) {
				struct.seth_LOTCTRL("true");
			} else {
				struct.seth_LOTCTRL("false");
			}
//		�\�[�X���ɂ܂�AlarmMessageException���c���Ă���ꍇ�́A�ȉ��̍s�̃R�����g���O����AlarmMessageException���n������B
//		} catch(AlarmMessageException ame){
//			ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
//			throw ee;
			struct.setCOMPANY_CD(_myCompanyStruct.getCOMPANY_CD());
			struct.setList_UNIT_COST_TYP_val(_unitCostTypStruct.getValList());
			struct.setList_UNIT_COST_TYP_name(_unitCostTypStruct.getExplanList());
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// �g���b�Z�[�W�o�͈˗��쐬
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AE0100010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0100010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AE0100010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0100010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AE0100010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0100010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AE0100010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AE0100010Entity entity;
	protected AE0100010Struct struct;
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

		entity = new AE0100010Entity();
		struct = new AE0100010Struct();

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
	 * AE0100010�N���X�̕W���R���X�g���N�^
	 */
	public AE0100010Control() throws BusinessProcessException, FoundationException
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
				AE0100010Struct key = (AE0100010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_name") && key.getUNIT_COST_TYP_name() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP_name", key.getUNIT_COST_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_val") && key.getUNIT_COST_TYP_val() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP_val", key.getUNIT_COST_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("SelectUnitCostFlag") && key.getSelectUnitCostFlag() != null) {
					msgKey.setKeyValue("SelectUnitCostFlag", key.getSelectUnitCostFlag());
				}
				if(msgKeyType.containsKeyColumn("r1_FILTER") && key.getr1_FILTER() != null) {
					msgKey.setKeyValue("r1_FILTER", key.getr1_FILTER());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_AMOUNT") && key.getPUCH_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("PUCH_ODR_AMOUNT", key.getPUCH_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("r2_FILTER") && key.getr2_FILTER() != null) {
					msgKey.setKeyValue("r2_FILTER", key.getr2_FILTER());
				}
				if(msgKeyType.containsKeyColumn("r3_FILTER") && key.getr3_FILTER() != null) {
					msgKey.setKeyValue("r3_FILTER", key.getr3_FILTER());
				}
				if(msgKeyType.containsKeyColumn("c_ONEROUS_CONS_INV_TYP") && key.getc_ONEROUS_CONS_INV_TYP() != null) {
					msgKey.setKeyValue("c_ONEROUS_CONS_INV_TYP", key.getc_ONEROUS_CONS_INV_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_ONEROUS_CONS_NO") && key.geth_ONEROUS_CONS_NO() != null) {
					msgKey.setKeyValue("h_ONEROUS_CONS_NO", key.geth_ONEROUS_CONS_NO());
				}
				if(msgKeyType.containsKeyColumn("h_ISSUE_DATE") && key.geth_ISSUE_DATE() != null) {
					msgKey.setKeyValue("h_ISSUE_DATE", key.geth_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_LOT_NO_2") && key.geth_LOT_NO_2() != null) {
					msgKey.setKeyValue("h_LOT_NO_2", key.geth_LOT_NO_2());
				}
				if(msgKeyType.containsKeyColumn("h_LOTCTRL") && key.geth_LOTCTRL() != null) {
					msgKey.setKeyValue("h_LOTCTRL", key.geth_LOTCTRL());
				}
				if(msgKeyType.containsKeyColumn("ONEROUS_CONS_NO") && key.getONEROUS_CONS_NO() != null) {
					msgKey.setKeyValue("ONEROUS_CONS_NO", key.getONEROUS_CONS_NO());
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
				if(msgKeyType.containsKeyColumn("ROUND_TYP") && key.getROUND_TYP() != null) {
					msgKey.setKeyValue("ROUND_TYP", key.getROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("VEND_CUR_UNIT") && key.getVEND_CUR_UNIT() != null) {
					msgKey.setKeyValue("VEND_CUR_UNIT", key.getVEND_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("VEND_DECIMAL_FIG") && key.getVEND_DECIMAL_FIG() != null) {
					msgKey.setKeyValue("VEND_DECIMAL_FIG", key.getVEND_DECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO") && key.getJOB_ODR_DETAIL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_DETAIL_NO", key.getJOB_ODR_DETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_DATE") && key.getISSUE_DATE() != null) {
					msgKey.setKeyValue("ISSUE_DATE", key.getISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_QTY") && key.getISSUE_QTY() != null) {
					msgKey.setKeyValue("ISSUE_QTY", key.getISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST") && key.getUNIT_COST() != null) {
					msgKey.setKeyValue("UNIT_COST", key.getUNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP") && key.getUNIT_COST_TYP() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP", key.getUNIT_COST_TYP());
				}
				if(msgKeyType.containsKeyColumn("ONEROUS_CONS_COMMENT") && key.getONEROUS_CONS_COMMENT() != null) {
					msgKey.setKeyValue("ONEROUS_CONS_COMMENT", key.getONEROUS_CONS_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO") && key.getLOT_NO() != null) {
					msgKey.setKeyValue("LOT_NO", key.getLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("VEND_LOT_NO") && key.getVEND_LOT_NO() != null) {
					msgKey.setKeyValue("VEND_LOT_NO", key.getVEND_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD") && key.getRCV_ISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CTRL_CD", key.getRCV_ISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_CD") && key.getWORK_ODR_CD() != null) {
					msgKey.setKeyValue("WORK_ODR_CD", key.getWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD") && key.getWORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("WORK_IN_PROC_CD", key.getWORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_CD") && key.getISSUE_INST_CD() != null) {
					msgKey.setKeyValue("ISSUE_INST_CD", key.getISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("RETURNED_WH_CD") && key.getRETURNED_WH_CD() != null) {
					msgKey.setKeyValue("RETURNED_WH_CD", key.getRETURNED_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("RETURNED_CAUSE_CD") && key.getRETURNED_CAUSE_CD() != null) {
					msgKey.setKeyValue("RETURNED_CAUSE_CD", key.getRETURNED_CAUSE_CD());
				}
				if(msgKeyType.containsKeyColumn("RETURNED_GNR_TYP") && key.getRETURNED_GNR_TYP() != null) {
					msgKey.setKeyValue("RETURNED_GNR_TYP", key.getRETURNED_GNR_TYP());
				}
				if(msgKeyType.containsKeyColumn("AP_PROC_TYP") && key.getAP_PROC_TYP() != null) {
					msgKey.setKeyValue("AP_PROC_TYP", key.getAP_PROC_TYP());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("h_LOT_CTRL_FLG") && key.geth_LOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("h_LOT_CTRL_FLG", key.geth_LOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_LOT_NUMBERING_TYP") && key.geth_LOT_NUMBERING_TYP() != null) {
					msgKey.setKeyValue("h_LOT_NUMBERING_TYP", key.geth_LOT_NUMBERING_TYP());
				}
				if(msgKeyType.containsKeyColumn("THIS_MONTH") && key.getTHIS_MONTH() != null) {
					msgKey.setKeyValue("THIS_MONTH", key.getTHIS_MONTH());
				}
				if(msgKeyType.containsKeyColumn("INSTALL_FLG") && key.getINSTALL_FLG() != null) {
					msgKey.setKeyValue("INSTALL_FLG", key.getINSTALL_FLG());
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
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
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
				if(msgKeyType.containsKeyColumn("MRP_FLG") && key.getMRP_FLG() != null) {
					msgKey.setKeyValue("MRP_FLG", key.getMRP_FLG());
				}
				if(msgKeyType.containsKeyColumn("VALUE") && key.getVALUE() != null) {
					msgKey.setKeyValue("VALUE", key.getVALUE());
				}
				if(msgKeyType.containsKeyColumn("NAME") && key.getNAME() != null) {
					msgKey.setKeyValue("NAME", key.getNAME());
				}
				if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE") && key.getEFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("EFF_PHASE_IN_DATE", key.getEFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("ONEROUS_FLG") && key.getONEROUS_FLG() != null) {
					msgKey.setKeyValue("ONEROUS_FLG", key.getONEROUS_FLG());
				}
				if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY") && key.getSTOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("STOCK_ON_HAND_QTY", key.getSTOCK_ON_HAND_QTY());
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
				if(msgKeyType.containsKeyColumn("PAST_RESULT_ENTRY_TYP") && key.getPAST_RESULT_ENTRY_TYP() != null) {
					msgKey.setKeyValue("PAST_RESULT_ENTRY_TYP", key.getPAST_RESULT_ENTRY_TYP());
				}
				if(msgKeyType.containsKeyColumn("BEST_BEFORE_DATE") && key.getBEST_BEFORE_DATE() != null) {
					msgKey.setKeyValue("BEST_BEFORE_DATE", key.getBEST_BEFORE_DATE());
				}
				if(msgKeyType.containsKeyColumn("LOT_MODIFY_COUNT") && key.getLOT_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("LOT_MODIFY_COUNT", key.getLOT_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("DEL_FLG") && key.getDEL_FLG() != null) {
					msgKey.setKeyValue("DEL_FLG", key.getDEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("PRD_CMPLT_DATE") && key.getPRD_CMPLT_DATE() != null) {
					msgKey.setKeyValue("PRD_CMPLT_DATE", key.getPRD_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("LOT_STOCK_ON_HAND_QTY") && key.getLOT_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("LOT_STOCK_ON_HAND_QTY", key.getLOT_STOCK_ON_HAND_QTY());
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
					AE0100010Struct key = new AE0100010Struct();
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_name")) {
						key.setUNIT_COST_TYP_name(msgKey.getKeyValue("UNIT_COST_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_val")) {
						key.setUNIT_COST_TYP_val(msgKey.getKeyValue("UNIT_COST_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("SelectUnitCostFlag")) {
						key.setSelectUnitCostFlag(msgKey.getKeyValue("SelectUnitCostFlag"));
					}
					if(msgKeyType.containsKeyColumn("r1_FILTER")) {
						key.setr1_FILTER(msgKey.getKeyValue("r1_FILTER"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_AMOUNT")) {
						key.setPUCH_ODR_AMOUNT(msgKey.getKeyValue("PUCH_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("r2_FILTER")) {
						key.setr2_FILTER(msgKey.getKeyValue("r2_FILTER"));
					}
					if(msgKeyType.containsKeyColumn("r3_FILTER")) {
						key.setr3_FILTER(msgKey.getKeyValue("r3_FILTER"));
					}
					if(msgKeyType.containsKeyColumn("c_ONEROUS_CONS_INV_TYP")) {
						key.setc_ONEROUS_CONS_INV_TYP(msgKey.getKeyValue("c_ONEROUS_CONS_INV_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_ONEROUS_CONS_NO")) {
						key.seth_ONEROUS_CONS_NO(msgKey.getKeyValue("h_ONEROUS_CONS_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_ISSUE_DATE")) {
						key.seth_ISSUE_DATE(msgKey.getKeyValue("h_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_LOT_NO_2")) {
						key.seth_LOT_NO_2(msgKey.getKeyValue("h_LOT_NO_2"));
					}
					if(msgKeyType.containsKeyColumn("h_LOTCTRL")) {
						key.seth_LOTCTRL(msgKey.getKeyValue("h_LOTCTRL"));
					}
					if(msgKeyType.containsKeyColumn("ONEROUS_CONS_NO")) {
						key.setONEROUS_CONS_NO(msgKey.getKeyValue("ONEROUS_CONS_NO"));
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
					if(msgKeyType.containsKeyColumn("ROUND_TYP")) {
						key.setROUND_TYP(msgKey.getKeyValue("ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CUR_UNIT")) {
						key.setVEND_CUR_UNIT(msgKey.getKeyValue("VEND_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("VEND_DECIMAL_FIG")) {
						key.setVEND_DECIMAL_FIG(msgKey.getKeyValue("VEND_DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO")) {
						key.setJOB_ODR_DETAIL_NO(msgKey.getKeyValue("JOB_ODR_DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_DATE")) {
						key.setISSUE_DATE(msgKey.getKeyValue("ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_QTY")) {
						key.setISSUE_QTY(msgKey.getKeyValue("ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST")) {
						key.setUNIT_COST(msgKey.getKeyValue("UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP")) {
						key.setUNIT_COST_TYP(msgKey.getKeyValue("UNIT_COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ONEROUS_CONS_COMMENT")) {
						key.setONEROUS_CONS_COMMENT(msgKey.getKeyValue("ONEROUS_CONS_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO")) {
						key.setLOT_NO(msgKey.getKeyValue("LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("VEND_LOT_NO")) {
						key.setVEND_LOT_NO(msgKey.getKeyValue("VEND_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD")) {
						key.setRCV_ISSUE_CTRL_CD(msgKey.getKeyValue("RCV_ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_CD")) {
						key.setWORK_ODR_CD(msgKey.getKeyValue("WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD")) {
						key.setWORK_IN_PROC_CD(msgKey.getKeyValue("WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_CD")) {
						key.setISSUE_INST_CD(msgKey.getKeyValue("ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("RETURNED_WH_CD")) {
						key.setRETURNED_WH_CD(msgKey.getKeyValue("RETURNED_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("RETURNED_CAUSE_CD")) {
						key.setRETURNED_CAUSE_CD(msgKey.getKeyValue("RETURNED_CAUSE_CD"));
					}
					if(msgKeyType.containsKeyColumn("RETURNED_GNR_TYP")) {
						key.setRETURNED_GNR_TYP(msgKey.getKeyValue("RETURNED_GNR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("AP_PROC_TYP")) {
						key.setAP_PROC_TYP(msgKey.getKeyValue("AP_PROC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("h_LOT_CTRL_FLG")) {
						key.seth_LOT_CTRL_FLG(msgKey.getKeyValue("h_LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_LOT_NUMBERING_TYP")) {
						key.seth_LOT_NUMBERING_TYP(msgKey.getKeyValue("h_LOT_NUMBERING_TYP"));
					}
					if(msgKeyType.containsKeyColumn("THIS_MONTH")) {
						key.setTHIS_MONTH(msgKey.getKeyValue("THIS_MONTH"));
					}
					if(msgKeyType.containsKeyColumn("INSTALL_FLG")) {
						key.setINSTALL_FLG(msgKey.getKeyValue("INSTALL_FLG"));
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
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
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
					if(msgKeyType.containsKeyColumn("MRP_FLG")) {
						key.setMRP_FLG(msgKey.getKeyValue("MRP_FLG"));
					}
					if(msgKeyType.containsKeyColumn("VALUE")) {
						key.setVALUE(msgKey.getKeyValue("VALUE"));
					}
					if(msgKeyType.containsKeyColumn("NAME")) {
						key.setNAME(msgKey.getKeyValue("NAME"));
					}
					if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE")) {
						key.setEFF_PHASE_IN_DATE(msgKey.getKeyValue("EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ONEROUS_FLG")) {
						key.setONEROUS_FLG(msgKey.getKeyValue("ONEROUS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY")) {
						key.setSTOCK_ON_HAND_QTY(msgKey.getKeyValue("STOCK_ON_HAND_QTY"));
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
					if(msgKeyType.containsKeyColumn("PAST_RESULT_ENTRY_TYP")) {
						key.setPAST_RESULT_ENTRY_TYP(msgKey.getKeyValue("PAST_RESULT_ENTRY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("BEST_BEFORE_DATE")) {
						key.setBEST_BEFORE_DATE(msgKey.getKeyValue("BEST_BEFORE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("LOT_MODIFY_COUNT")) {
						key.setLOT_MODIFY_COUNT(msgKey.getKeyValue("LOT_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("DEL_FLG")) {
						key.setDEL_FLG(msgKey.getKeyValue("DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PRD_CMPLT_DATE")) {
						key.setPRD_CMPLT_DATE(msgKey.getKeyValue("PRD_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("LOT_STOCK_ON_HAND_QTY")) {
						key.setLOT_STOCK_ON_HAND_QTY(msgKey.getKeyValue("LOT_STOCK_ON_HAND_QTY"));
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