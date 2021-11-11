/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0020/src/com/nec/jp/orteus/metamorBase/AD0020/AD0020011Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0020;

import com.nec.jp.orteus.metamorBase.AD0020.*;
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

import java.math.BigDecimal;
import java.text.ParseException;

import com.nec.jp.orteus.expj.flash.Kind;

import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateControl;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.CurControl;
import com.nec.jp.orteus.metamorBase.common04.amount.CurStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxControl;
import com.nec.jp.orteus.metamorBase.common04.amount.AmountCalculator;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurStruct;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurControl;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import com.nec.jp.orteus.expj.pr.rcvissue.process.ValidateWh;

import com.nec.jp.orteus.expj.util.*;

//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AD0020011Control
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
	public AD0020011Struct getListvalue(int x) { return (AD0020011Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AD0020011Struct getStruct() { return this.struct; }	// Struct��Ԃ��܂��B
	public AD0020011Struct createStruct() { return new AD0020011Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AD0020011Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

//	------------------------------------------------------------------------------

	/** [�R���{�{�b�N�X�f�[�^]���i���O��敪�j */
	private ComboStruct _outsideTypStruct = new ComboStruct();

	/** �V�X�e�����O���b�Z�[�W�쐬�p */
	private StringBuffer _sysLogMessage;
	
	/** �ꗗ�\�̍ő�\�������I�[�o�[���̂d�q�q�\���t���O */
	private int _screenMoveFlg = 0;
	
	/** �Ɩ����t */
	private String _oprDate = null;

	/** �M�ݏ��f�[�^�N���X */
	HomeCurStruct sysHomeCurStruct = new HomeCurStruct();

	/** ��ʑJ�ڃL�[(�I�[�_�f�}���h�ԍ�) */
	private String _odNo;

	/** �L�[�ۑ��p�I�[�_�f�}���h�ԍ� */
	private String _keepOdNo;

	/**
	 * ��ʑJ�ڃL�[(�I�[�_�f�}���h�ԍ�)�擾
	 * @return �I�[�_�f�}���h�ԍ�
	 */
	public String getOdNo() {
		return _odNo;
	}
	/**
	 * ��ʑJ�ڃL�[(�I�[�_�f�}���h�ԍ�)�ݒ�
	 * @param cd �I�[�_�f�}���h�ԍ�
	 */
	public void setOdNo(String cd) {
		_odNo = cd;
	}

	/**
	 * �ꗗ�\�̍ő�\�������I�[�o�[���̂d�q�q�\���t���O�̎擾
	 * @return 0:ERR�Ȃ�  1:ERR����
	 */
	public int getScreenMoveFlg() {
		return _screenMoveFlg;
	}

	/**
	 * �ꗗ�\�̍ő�\�������I�[�o�[���̂d�q�q�\���t���O�̐ݒ�
	 * @param cd �ꗗ�\�̍ő�\�������I�[�o�[���̂d�q�q�\���t���O
	 */
	public void setScreenMoveFlg(int cd) {
		_screenMoveFlg = cd;
	}

	/**
	 * Orteus�W��Struct�̒l��Ώ�Struct�ɃR�s�[���܂��B
	 * @param target �R�s�[�ΏۂƂȂ�Struct
	 */
	public void setStandardItem(AD0020011Struct target){

		target.setsUser_ID(struct.getsUser_ID());
		target.setsSysdate(struct.getsSysdate());
		target.setsOraganization_CD(struct.getsOrganization_CD());
	}

	/**
	 * �Ɩ����W�b�N�̃C���t�H���[�V�������b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * @param code ���b�Z�[�W�R�[�h
	 */
	private void setInformationMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addInfo(emsg);
	}
	/**
	 * �Ɩ����W�b�N�̃G���[���b�Z�[�W�⏕���ڐݒ菈����؂�o���Ċ֐���
	 * @param db1 �f�[�^�x�[�X���ڂP
	 * @param value1 �u��������P
	 */
	private void setSupportMessage(String db1, String value1) {
		_sysLogMessage = new StringBuffer();
		_sysLogMessage.append(db1);
		_sysLogMessage.append(":");
		_sysLogMessage.append(value1);
		ExpjMessage emsg = new ExpjMessage("ZZ01006", _sysLogMessage.toString());
		msgStruct.addInfo(emsg);
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
	 * @param value1 �u��������P
	 * @param value2 �u��������Q
	 */
	private void setWarningMessage(String code, String value1, String value2) {
		ExpjMessage emsg = new ExpjMessage(code, value1, value2);
		msgStruct.addWarn(emsg);
		sysLog.info(emsg, getsysUSER_CD());
	}
	/**
	 * �Ɩ����W�b�N�̃G���[���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * @param code ���b�Z�[�W�R�[�h
	 */
	private void setErrorMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, getsysUSER_CD());
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
	 * �Ɩ����W�b�N�̃V�X�e�����O�i���[�j���O�j�ݒ菈����؂�o���Ċ֐���
	 * @param db1 �f�[�^�x�[�X���ڂP
	 * @param value1 �u��������P
	 */
	private void setInfoSysLogMessage(String db1, String value1) {
		_sysLogMessage = new StringBuffer();
		_sysLogMessage.append(db1);
		_sysLogMessage.append(":");
		_sysLogMessage.append(value1);
		ExpjMessage emsg 
				= new ExpjMessage("ZZ01006",_sysLogMessage.toString());
		sysLog.info(emsg, getsysUSER_CD());
	}

	/** 
	 * ���X�g�̃N���A
	 */
	private void listClear() {
		if (this.list != null) {
			this.list.clear();
		}
	}
	/**
	 * ��ʍ��ڂ̃N���A
	 */
	private void formClear() {
		struct.setJOB_ODR_CD(null);
		struct.setJOB_ODR_CANCEL_NO("0");
		struct.setITEM_CD(null);
		struct.setITEM_NAME(null);
		struct.setDRAW_CD(null);
		struct.setSPEC(null);
		struct.setSTOCK_UNIT(null);
		struct.setMRP_ODR_TYP_DN(null);
		struct.setMRP_ODR_TYP(null);
		struct.setOUTSIDE_TYP_DN(null);
		struct.setOUTSIDE_TYP(null);
		struct.setJOB_ODR_DLV_DATE(null);
		struct.setDUE_DATE(null);
		struct.setDM_QTY(null);
		struct.setALCD_QTY(null);
		struct.setWORK_ODR_DLV_DATE(null);
		struct.setOPR_INST_START_DATE(null);
		struct.setPRD_DUE_DATE(null);
		struct.setPRD_START_DATE(null);
		struct.setODR_QTY(null);
		struct.setOPR_INST_QTY(null);
		struct.setPUCH_ODR_QTY(null);
		
		struct.seth_UNIT_QTY_TYP(Kind.NUMBER);//�v�ʒP��
		struct.setl_UNIT_QTY_TYP(Kind.NUMBER);//�v�ʒP��
	}
	
	/**
	 * �Ɩ����t�擾����
	 * @return ����I���̏ꍇtrue�A�����łȂ��ꍇfalse
	 * @exception FoundationException , ExpjException
	 */
	public boolean isOprDate() throws FoundationException, ExpjException {
		_oprDate = null;
		try {
			struct.setPLANT_CD(getsysPLANT_CD());
			List oprDateList = entity.mselectDateCtrl.read(conn, struct);
						
			if (oprDateList == null || oprDateList.size() == 0) {
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("SYS_DATE_CTRL.PLANT_CD", getsysPLANT_CD());
				setWarningSysLogMessage("SYS_DATE_CTRL.BUSINESS_OPR_DATE", _oprDate);
				return false;
			}
			AD0020011Struct oprDateStruct = (AD0020011Struct)oprDateList.get(0);
			setStandardItem(oprDateStruct);

			_oprDate = oprDateStruct.geth_BUSINESS_OPR_DATE();
			
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}
		return true;
	}

	/**
	 * �w�b�_�Ɩ��ׂ̌������s��
	 * @return ����I���̏ꍇtrue�A�����łȂ��ꍇfalse
	 * @exception FoundationException �����Ɏ��s�����ꍇ
	 */
	private boolean selectMain() throws FoundationException, ExpjException {
		try {
			formClear();
			listClear();
			
			struct.setOD_NO(_keepOdNo);

			List selectList = entity.mSelect.read(conn, struct);
			if (selectList == null || selectList.size() == 0) {
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_OD.OD_NO", struct.getOD_NO());
				setReadStatus(NOT_FOUND);
				setScreenMoveFlg(1);
				return false;
			}
			AD0020011Struct headerStruct = (AD0020011Struct)selectList.get(0);
			try{
				headerStruct.setOUTSIDE_TYP_DN(multcombo("OUTSIDE_TYP",headerStruct.getOUTSIDE_TYP()));
				headerStruct.setMRP_ODR_TYP_DN(multcombo("MRP_ODR_TYP",headerStruct.getMRP_ODR_TYP()));
			}catch(Exception e){
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				ExpjException ee = new ExpjException(e, emsg);
				throw ee;
			}
			
			//���t�Ǝ����̐ݒ�
			DateTimeFormat dtf = new DateTimeFormat(conn);
			headerStruct.setJOB_ODR_DLV_DATE(dtf.getDatePart(headerStruct.getJOB_ODR_DLV_DATE_ALL()));
			headerStruct.setJOB_ODR_DLV_DATE_TIME(dtf.getCoronTimePart(headerStruct.getJOB_ODR_DLV_DATE_ALL()));
			headerStruct.setDUE_DATE(dtf.getDatePart(headerStruct.getDUE_DATE_ALL()));
			headerStruct.setDUE_DATE_TIME(dtf.getCoronTimePart(headerStruct.getDUE_DATE_ALL()));
			headerStruct.setPRD_DUE_DATE(dtf.getDatePart(headerStruct.getPRD_DUE_DATE_ALL()));
			headerStruct.setPRD_DUE_DATE_TIME(dtf.getCoronTimePart(headerStruct.getPRD_DUE_DATE_ALL()));
			headerStruct.setPRD_START_DATE(dtf.getDatePart(headerStruct.getPRD_START_DATE_ALL()));
			headerStruct.setPRD_START_DATE_TIME(dtf.getCoronTimePart(headerStruct.getPRD_START_DATE_ALL()));
			headerStruct.setODR_START_DATE(dtf.getDatePart(headerStruct.getODR_START_DATE_ALL()));
			headerStruct.setODR_START_DATE_TIME(dtf.getCoronTimePart(headerStruct.getODR_START_DATE_ALL()));
			
			setStandardItem(headerStruct);
			headerStruct.setOD_NO(_keepOdNo);
			struct.setStructM(headerStruct);
			


			// �\���ő�s��
			int maxLine = sp.getMaxLine(conn,10);		
			if (maxLine != 0)
				struct.setROW_COUNT(String.valueOf(maxLine));
			else
				struct.setROW_COUNT(null);

			this.list = entity.mSelectGridCnt.read(conn, struct);
			long rowCount = Long.parseLong(((AD0020011Struct) list.get(0))
					.getl_COUNT());
			if(rowCount==0){
				setErrorMessage("ZZ06001");
				readStatus = NOT_FOUND;
				if(list !=null &&list.size()>0){
					list.clear();
				}
				return false;
			}
			
			if (maxLine != 0 && rowCount == maxLine+1) {
				
				struct.setl_UNIT_QTY_TYP(Kind.NUMBER);
				//�\���������K��l(%0)�𒴂��Ă��܂��B
				setErrorMessage("AD00077", ""+maxLine);
				setWarningSysLogMessage("T_OD.OD_NO", struct.getOD_NO());
				setReadStatus(TOO_MANY);
				setScreenMoveFlg(1);
				if(list !=null &&list.size()>0){
					list.clear();
				}
				return false;
			}
			this.list = entity.mSelectGrid.read(conn, struct);
             AD0020011Struct TempStruct;
             for (int i = 0; i < list.size(); i++) {
		     TempStruct = (AD0020011Struct)list.get(i);

		     //�R���{�{�b�N�X�̎擾
		     othercomboTyp(TempStruct);
		    }
   
			setReadStatus(NORMAL);

		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}
		return true;
	}
        /** �R���{�{�b�N�X�f�[�^�擾�p�萔�@�W�J�ς݃t���O */
        private final static String PROC_EXPLOSION_FLG_PARAMETER_NAME= "PROC_EXPLOSION_FLG"; 
       
        /** �R���{�{�b�N�X�f�[�^�擾�p�@�W�J�ς݃t���O */
        private ComboStruct PROC_EXPLOSION_FLG = null;
        
        private void othercomboTyp(AD0020011Struct aStruct) {
        	
		 aStruct.setPROC_EXPLOSION_FLG_DN(getDisplayName(PROC_EXPLOSION_FLG, aStruct.geth_PROC_EXPLOSION_FLG().toString()));
	  
		}
		/**
		 * �R���{�{�b�N�X�f�[�^����\���������擾����
		 * @param combo �R���{�{�b�N�X�f�[�^
		 * @param value �R���{�{�b�N�X�f�[�^�̒l
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

	public void getparaTimeCtrl(AD0020011Struct s) throws FoundationException, ExpjException {
		try{
			List listTimeCtrl = entity.mTIME_CTRL.read(conn,s);
			if(listTimeCtrl == null || listTimeCtrl.size() <=0){
				s.setTIME_CTRL("false");
			}else{
				s.setTIME_CTRL(((AD0020011Struct)listTimeCtrl.get(0)).getTIME_CTRL());
			}
		}catch(SQLException e){
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}
	}
	
	//�������������p
	String WORK_ODR_DLV_DATE_TIME;		//�i�ڕʐ����[��
	String OPR_INST_START_DATE_TIME;	//�i�ڕʐ��������
	
	public boolean chkTime(AD0020011Struct s){
		
		//���͎����̃`�F�b�N(�����Ǘ�����ꍇ�̂�)
			if((s.getTIME_CTRL()).equals("true")){
				
				//�@�i�ڕʐ����[��(����)�̃`�F�b�N
				WORK_ODR_DLV_DATE_TIME = s.getWORK_ODR_DLV_DATE_TIME();
				//����
				if((WORK_ODR_DLV_DATE_TIME).length() == 0 ){
					//Null��0000�ɐݒ�
					WORK_ODR_DLV_DATE_TIME = "2359";
				}else if((WORK_ODR_DLV_DATE_TIME).length() == 3 ){
					//�R���͓��ɂO��t����
					WORK_ODR_DLV_DATE_TIME = "0" + WORK_ODR_DLV_DATE_TIME;
				}
				
				//�A�i�ڕʐ��������(����)�̃`�F�b�N
				OPR_INST_START_DATE_TIME = s.getOPR_INST_START_DATE_TIME();
				if( (s.getOPR_INST_START_DATE()).equals("") && (OPR_INST_START_DATE_TIME).equals("") ){	//NULL�̏ꍇ�͎����Z�o
				}else{
					if((OPR_INST_START_DATE_TIME).length() == 0 ){
						//Null��0000�ɐݒ�
						OPR_INST_START_DATE_TIME = "2359";
					}else if((OPR_INST_START_DATE_TIME).length() == 3 ){
						//�R���͓��ɂO��t����
						OPR_INST_START_DATE_TIME = "0" + OPR_INST_START_DATE_TIME;
					}
				}
			}
			
			return true;
		
	}
	
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlReturn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0020");
		logger.entering("AD0020011Control"+":USER="+struct.getsUser_ID(),"controlReturn");
			//{{user_implement_dev:<controlReturn>


		try {
			//�w�b�_�ƃ��X�g�̌������s��
			if (!selectMain()) {
				return;
			}

		} catch (ExpjException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}


                //}}user_implement_dev:<controlReturn>
		logger.exiting("AD0020011Control"+":USER="+struct.getsUser_ID(),"controlReturn");

		return;
	}

	/**
	 * �s�ǉ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlLineInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0020");
		logger.entering("AD0020011Control"+":USER="+struct.getsUser_ID(),"controlLineInsert");
			//{{user_implement_dev:<controlLineInsert>


		try {
			struct.setOD_NO(_keepOdNo);

			//�\�����ڂƃN���C�A���g�`�F�b�N���ڂ̎擾
			List formList = entity.mFormSub1Insert.read(conn, struct);
			if (formList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("T_OD.OD_NO", struct.getPLANT_CD());
				return;
			}
			AD0020011Struct formStruct = (AD0020011Struct) formList.get(0);
			formStruct.setOPR_RSLT_TYP_DN(multcombo("OPR_RSLT_TYP",formStruct.getOPR_RSLT_TYP()));
			formStruct.setMRP_ODR_TYP_DN(multcombo("MRP_ODR_TYP",formStruct.getMRP_ODR_TYP()));
			setStandardItem(formStruct);
			
			DateTimeFormat dtf = new DateTimeFormat(conn);
			formStruct.setWORK_ODR_DLV_DATE(dtf.getDatePart(formStruct.getPRD_DUE_DATE_ALL()));
			formStruct.setWORK_ODR_DLV_DATE_TIME(dtf.getTimePart(formStruct.getPRD_DUE_DATE_ALL()));
			formStruct.setOPR_INST_START_DATE(dtf.getDatePart(formStruct.getPRD_START_DATE_ALL()));
			formStruct.setOPR_INST_START_DATE_TIME(dtf.getTimePart(formStruct.getPRD_START_DATE_ALL()));
			formStruct.seth_ODR_START_DATE(dtf.getDatePart(formStruct.geth_ODR_START_DATE_ALL()));
			formStruct.seth_ODR_START_DATE_TIME(dtf.getTimePart(formStruct.geth_ODR_START_DATE_ALL()));
			formStruct.seth_DUE_DATE(dtf.getDatePart(formStruct.geth_DUE_DATE_ALL()));
			formStruct.seth_DUE_DATE_TIME(dtf.getTimePart(formStruct.geth_DUE_DATE_ALL()));
			
			
			getparaTimeCtrl(formStruct);
			
			// ��ƌv��ԍ��̍̔�
			CollectNumber number = 
					new CollectNumber(CollectNumber.ODR_CD, 
						getsysUSER_CD(), 
						this.sp.getProcId(), 
						getsysPLANT_CD());
			String no = number.getNo();
			if (no == null || no.length() == 0) {
				//�̔Ԏ��s
				setErrorMessage("ZZ01106");
				setWarningSysLogMessage("SYS_WORK_ODR_CD_CTRL.WORK_ODR_CD", no);
				setWarningSysLogMessage("T_OD.OD_NO", struct.getOD_NO());
				return;
			}
			formStruct.setWORK_ODR_CD(no);
			
			//�Ɩ��^�p���̃Z�b�g
			if (!isOprDate()) {
				return;
			} else {
				formStruct.seth_BUSINESS_OPR_DATE(_oprDate);
			}
			
			//���ʕ��i�̑��݃`�F�b�N
			List tempList = entity.mCheckChild.read(conn, struct);
			if (tempList == null || tempList.size() == 0) {
				formStruct.seth_CHILD("0");//���Ȃ�
			} else {
				formStruct.seth_CHILD("1");//����
			}
	
			// �G���[������ΏI��
			if (msgStruct.hasError()) {
				return;
			}
		
			formStruct.setOPR_INST_QTY("0.0");
			struct.setStructM(formStruct);
			
			setReadStatus(NORMAL);

		} catch (ExpjException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}


                //}}user_implement_dev:<controlLineInsert>
		logger.exiting("AD0020011Control"+":USER="+struct.getsUser_ID(),"controlLineInsert");

		return;
	}

	/**
	 * �s�C���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlLineUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0020");
		logger.entering("AD0020011Control"+":USER="+struct.getsUser_ID(),"controlLineUpdate");
			//{{user_implement_dev:<controlLineUpdate>


		try {
			struct.setOD_NO(_keepOdNo);

			//�\�����ڂƃN���C�A���g�`�F�b�N���ڂ̎擾
			List formList = entity.mFormSub1Update.read(conn, struct);
			if (formList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("T_OD.OD_NO", struct.getPLANT_CD());
				return;
			}
			AD0020011Struct formStruct = (AD0020011Struct) formList.get(0);
			formStruct.setOPR_RSLT_TYP_DN(multcombo("OPR_RSLT_TYP",formStruct.getOPR_RSLT_TYP()));
			formStruct.setMRP_ODR_TYP_DN(multcombo("MRP_ODR_TYP",formStruct.getMRP_ODR_TYP()));
			
			DateTimeFormat dtf = new DateTimeFormat(conn);
			formStruct.setWORK_ODR_DLV_DATE(dtf.getDatePart(formStruct.getWORK_ODR_DLV_DATE_ALL()));
			formStruct.setWORK_ODR_DLV_DATE_TIME(dtf.getTimePart(formStruct.getWORK_ODR_DLV_DATE_ALL()));
			formStruct.setOPR_INST_START_DATE(dtf.getDatePart(formStruct.getOPR_INST_START_DATE_ALL()));
			formStruct.setOPR_INST_START_DATE_TIME(dtf.getTimePart(formStruct.getOPR_INST_START_DATE_ALL()));
			formStruct.seth_ODR_START_DATE(dtf.getDatePart(formStruct.geth_ODR_START_DATE_ALL()));
			formStruct.seth_ODR_START_DATE_TIME(dtf.getTimePart(formStruct.geth_ODR_START_DATE_ALL()));
			formStruct.seth_DUE_DATE(dtf.getDatePart(formStruct.geth_DUE_DATE_ALL()));
			formStruct.seth_DUE_DATE_TIME(dtf.getTimePart(formStruct.geth_DUE_DATE_ALL()));
			
			
			setStandardItem(formStruct);
			
			getparaTimeCtrl(formStruct);
			
			//�Ɩ��^�p���̃Z�b�g
			if (!isOprDate()) {
				return;
			} else {
				formStruct.seth_BUSINESS_OPR_DATE(_oprDate);
			}
			
			//���ʕ��i�̑��݃`�F�b�N
			List tempList = entity.mCheckChild.read(conn, struct);
			if (tempList == null || tempList.size() == 0) {
				formStruct.seth_CHILD("0");//���Ȃ�
			} else {
				formStruct.seth_CHILD("1");//����
			}

			// �G���[������ΏI��
			if (msgStruct.hasError()) {
				return;
			}

			formStruct.setWORK_ODR_CD(struct.getWORK_ODR_CD());
			formStruct.seth_ITEM_MODIFY_COUNT(struct.geth_ITEM_MODIFY_COUNT());
			//���O��敪�̕\���͓���Œ�
			formStruct.setOUTSIDE_TYP("1");
			struct.setStructM(formStruct);
			
			setReadStatus(NORMAL);

		} catch (ExpjException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}


                //}}user_implement_dev:<controlLineUpdate>
		logger.exiting("AD0020011Control"+":USER="+struct.getsUser_ID(),"controlLineUpdate");

		return;
	}

	/**
	 * �s���ʃ{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlLineCopy() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0020");
		logger.entering("AD0020011Control"+":USER="+struct.getsUser_ID(),"controlLineCopy");
			//{{user_implement_dev:<controlLineCopy>


		try {
			struct.setOD_NO(_keepOdNo);

			//�\�����ڂƃN���C�A���g�`�F�b�N���ڂ̎擾
			List formList = entity.mFormSub1Update.read(conn, struct);
			if (formList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("T_OD.OD_NO", struct.getPLANT_CD());
				return;
			}
			AD0020011Struct formStruct = (AD0020011Struct) formList.get(0);
			
			DateTimeFormat dtf = new DateTimeFormat(conn);
			formStruct.setWORK_ODR_DLV_DATE(dtf.getDatePart(formStruct.getWORK_ODR_DLV_DATE_ALL()));
			formStruct.setWORK_ODR_DLV_DATE_TIME(dtf.getTimePart(formStruct.getWORK_ODR_DLV_DATE_ALL()));
			formStruct.setOPR_INST_START_DATE(dtf.getDatePart(formStruct.getOPR_INST_START_DATE_ALL()));
			formStruct.setOPR_INST_START_DATE_TIME(dtf.getTimePart(formStruct.getOPR_INST_START_DATE_ALL()));
			formStruct.seth_ODR_START_DATE(dtf.getDatePart(formStruct.geth_ODR_START_DATE_ALL()));
			formStruct.seth_ODR_START_DATE_TIME(dtf.getTimePart(formStruct.geth_ODR_START_DATE_ALL()));
			formStruct.seth_DUE_DATE(dtf.getDatePart(formStruct.geth_DUE_DATE_ALL()));
			formStruct.seth_DUE_DATE_TIME(dtf.getTimePart(formStruct.geth_DUE_DATE_ALL()));
			
			setStandardItem(formStruct);
			
			getparaTimeCtrl(formStruct);
			
			// ��ƌv��ԍ��̍̔�
			CollectNumber number = 
					new CollectNumber(CollectNumber.ODR_CD, 
						getsysUSER_CD(), 
						this.sp.getProcId(), 
						getsysPLANT_CD());
			String no = number.getNo();
			if (no == null || no.length() == 0) {
				//�̔Ԏ��s
				setErrorMessage("ZZ01106");
				setWarningSysLogMessage("SYS_WORK_ODR_CD_CTRL.WORK_ODR_CD", no);
				setWarningSysLogMessage("T_OD.OD_NO", struct.getOD_NO());
				return;
			}
			formStruct.setWORK_ODR_CD(no);
			
			//�Ɩ��^�p���̃Z�b�g
			if (!isOprDate()) {
				return;
			} else {
				formStruct.seth_BUSINESS_OPR_DATE(_oprDate);
			}
			
			//���ʕ��i�̑��݃`�F�b�N
			List childList = entity.mCheckChild.read(conn, struct);
			if (childList == null || childList.size() == 0) {
				formStruct.seth_CHILD("0");//�����i���Ȃ�
			} else {
				formStruct.seth_CHILD("1");//�����i������
			}

			// �G���[������ΏI��
			if (msgStruct.hasError()) {
				return;
			}

			//���O��敪�̕\���͓���Œ�
			formStruct.setOUTSIDE_TYP("1");
			struct.setStructM(formStruct);
			
			setReadStatus(NORMAL);

		} catch (ExpjException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}


                //}}user_implement_dev:<controlLineCopy>
		logger.exiting("AD0020011Control"+":USER="+struct.getsUser_ID(),"controlLineCopy");

		return;
	}

	/**
	 * �s�폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlLineDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0020");
		logger.entering("AD0020011Control"+":USER="+struct.getsUser_ID(),"controlLineDelete");
			//{{user_implement_dev:<controlLineDelete>


		try {
			struct.setOD_NO(_keepOdNo);

			//�i�ڎd�|�O���݃`�F�b�N
			List checkList = entity.mSelectChkWorkItem.read(conn, struct);
			if (checkList == null || checkList.size() == 0) {
				setErrorMessage("ZZ01105");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", struct.getWORK_ODR_CD());
				return;
			}
					
			//�i�ڎd�|�OModifyCount�`�F�b�N
			AD0020011Struct checkStruct = (AD0020011Struct)checkList.get(0);
			setStandardItem(checkStruct);
			if (checkStruct.geth_ITEM_MODIFY_COUNT() != null 
					&& !checkStruct.geth_ITEM_MODIFY_COUNT().equals(
					struct.geth_ITEM_MODIFY_COUNT())) {
				//���̏����ɂ��f�[�^�������������Ă��܂��B���j���[�ɖ߂��Ă�蒼���ĉ������B
				setErrorMessage("ZZ01105");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", struct.getWORK_ODR_CD());
				setReadStatus(ERROR);
				return;
			}
			
			//�i�ڕʎd�|�̍폜
			entity.mdeleteChild.delete(conn, struct);
			
			//���v�I�[�_�f�}���h�X�V
			CommonOd od = 
					new CommonOd(conn,
						getsysPLANT_CD(), 
						getsysUSER_CD(), 
						this.sp.getProcId());
			od.changeOdInfo(struct.getOD_NO(), -1);
			
			conn.commit();
			
			//�Č���
			//�w�b�_�ƃ��X�g�̌������s��
			if (!selectMain()) {
				return;
			}
			
			setReadStatus(NORMAL);

		} catch (NumberFormatException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		} catch (ApsComException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		} finally {
			try {
				if (conn != null) {
					conn.rollback();
				}
			} catch(Exception e) {
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				ExpjException ee = new ExpjException(e, emsg);
				throw ee;
			}
		}


                //}}user_implement_dev:<controlLineDelete>
		logger.exiting("AD0020011Control"+":USER="+struct.getsUser_ID(),"controlLineDelete");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0020");
		logger.entering("AD0020011Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>

		
		try {
			setScreenMoveFlg(0);
			
			//�T�[�o�`�F�b�N			
			struct.setOD_NO(_keepOdNo);
			
			//�������̃`�F�b�N
			WORK_ODR_DLV_DATE_TIME = "0000";
			OPR_INST_START_DATE_TIME = "0000";
			boolean booChkTime = chkTime(struct);
			if (booChkTime == false){
				return;
			}

			//�u�����[���v�ɋx�������͂��ꂽ�ꍇ
			struct.setPLANT_CD(getsysPLANT_CD());
			struct.setCAL_DATE(struct.getWORK_ODR_DLV_DATE());
			//�i�ڔԍ��������L�[�Ƃ��ēǍ�
			List calendarList1 = entity.mselectCal1.read(conn, struct);
			if (calendarList1 == null || calendarList1.size() == 0) {
				//�H��R�[�h�������L�[�Ƃ��ēǍ�
				calendarList1 = entity.mselectCal.read(conn, struct);
				if (calendarList1 == null || calendarList1.size() == 0) {
					//�w��L�[�̃f�[�^�����݂��܂���B
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("M_CAL.CAL_DATE", struct.getWORK_ODR_DLV_DATE());
					setWarningSysLogMessage("M_PLANT.PLANT_CD", getsysPLANT_CD());
				} else {
					AD0020011Struct calendarStruct1 = (AD0020011Struct)calendarList1.get(0);
					setStandardItem(calendarStruct1);
					if ("1".equals(calendarStruct1.getHOLIDAY_FLG())) { 
						//�x���̏ꍇ
						setErrorMessage("AD00036");
					}
				}
			}else{
				AD0020011Struct calendarStruct1 = (AD0020011Struct)calendarList1.get(0);
				setStandardItem(calendarStruct1);
				if ("1".equals(calendarStruct1.getHOLIDAY_FLG())) { 
					//�x���̏ꍇ
					setErrorMessage("AD00036");
				}
			}
				
			// �u����������v��NULL�̏ꍇ
			if (struct.getOPR_INST_START_DATE() == null 
					|| "".equals(struct.getOPR_INST_START_DATE())) {
				//������̎����v�Z
				List listStructdate = entity.mselectLT.read(conn, struct);
				if (listStructdate == null || listStructdate.size() == 0) {
					//�w��L�[�̃f�[�^�����݂��܂���B
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("M_ITEM.ITEM_CD", struct.getITEM_CD());
				} else {
					AD0020011Struct insert_struct = (AD0020011Struct)listStructdate.get(0);
					setStandardItem(insert_struct);
					int fixed = new Integer(insert_struct.getFIXED_LT()).intValue();
					int prop = new Integer(insert_struct.getPROP_LT()).intValue();
					int safety = new Integer(insert_struct.getSAFETY_LT()).intValue();
					int prop_lot = new Integer(insert_struct.getPROP_LOT_SIZE()).intValue();
			
					//��Ǝw������؂�グ��������
					BigDecimal StrOprInstQty = new BigDecimal(struct.getOPR_INST_QTY());
					BigDecimal OprInstQty = StrOprInstQty.setScale(0, BigDecimal.ROUND_UP);
					String strOprInstQty = OprInstQty.toString();
			
					//�i�ڂ̃��[�h�^�C��
					int lt = 
							0 - (fixed + (Integer.parseInt(strOprInstQty)/prop_lot) * prop + safety);
					Date WorkOdrDlvDate = 
							Converter.strToDate(struct.getWORK_ODR_DLV_DATE() + " " + WORK_ODR_DLV_DATE_TIME,
								"yyyy/MM/dd HHmm");
			
					//������������v�Z����
					WorkDay OprInstStartDate = 
							new WorkDay(getsysUSER_CD(), 
								this.sp.getProcId(), 
								getsysPLANT_CD(), 
								this.struct.getITEM_CD(),
								WorkOdrDlvDate,
								lt,
								true);
					String StrOprInstStartDate 
							= Converter.dateToStr(OprInstStartDate.calcDate(), "yyyy/MM/dd HHmm");
					struct.setOPR_INST_START_DATE(StrOprInstStartDate.substring(0,10));
					OPR_INST_START_DATE_TIME = StrOprInstStartDate.substring(11,15);
				}
			
			} else {
				//�u����������v�ɋx�������͂��ꂽ�ꍇ
				struct.setPLANT_CD(getsysPLANT_CD());
				struct.setCAL_DATE(struct.getOPR_INST_START_DATE());
				//�i�ڔԍ��������L�[�Ƃ��ēǍ�
				List calendarList2 = entity.mselectCal1.read(conn, struct);
				if (calendarList2 == null || calendarList2.size() == 0) {
					//�H��R�[�h�������L�[�Ƃ��ēǍ�
					calendarList2 = entity.mselectCal.read(conn, struct);
					if (calendarList2 == null || calendarList2.size() == 0) {
						//�w��L�[�̃f�[�^�����݂��܂���B
						setErrorMessage("ZZ01101");
						setWarningSysLogMessage("M_CAL.CAL_DATE", struct.getOPR_INST_START_DATE());
						setWarningSysLogMessage("M_PLANT.PLANT_CD", getsysPLANT_CD());
					} else {
						AD0020011Struct calendarStruct2 = (AD0020011Struct)calendarList2.get(0);
						setStandardItem(calendarStruct2);
						if ("1".equals(calendarStruct2.getHOLIDAY_FLG())) { 
							//�x���̏ꍇ
							setErrorMessage("AD00038");
					}
				}
				}else{
					AD0020011Struct calendarStruct2 = (AD0020011Struct)calendarList2.get(0);
					setStandardItem(calendarStruct2);
					if ("1".equals(calendarStruct2.getHOLIDAY_FLG())) { 
						//�x���̏ꍇ
						setErrorMessage("AD00038");
					}
				}
			}
			List jobOdrList = entity.mSelectJOB_ODR.read(conn, struct);
			if (jobOdrList == null || jobOdrList.size() == 0) {
				//�w��L�[�̃f�[�^�����݂��܂���B
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_OD.OD_NO", struct.getOD_NO());
				setWarningSysLogMessage("T_JOB_ODR.JOB_ODR_CD", "");
			} else {

				AD0020011Struct jobOdrStruct = (AD0020011Struct)jobOdrList.get(0);
				setStandardItem(jobOdrStruct);
				
				//[���Ԍv��].���Ԕ[���������[���̏ꍇ
				Date dateJobOdrlvDate = 
						Converter.strToDate(jobOdrStruct.getJOB_ODR_DLV_DATE(),
							Converter.SLASH_DATE);
				Date dateWorkOdrDlvDate = 
						Converter.strToDate(struct.getWORK_ODR_DLV_DATE(),
							Converter.SLASH_DATE);
				if (dateJobOdrlvDate.compareTo(dateWorkOdrDlvDate) < 0 || (dateJobOdrlvDate.compareTo(dateWorkOdrDlvDate) == 0 && Integer.valueOf(WORK_ODR_DLV_DATE_TIME).intValue() > Integer.valueOf(jobOdrStruct.getJOB_ODR_DLV_DATE_TIME()).intValue() )) {
					if (DateTool.compareYMD(jobOdrStruct.getJOB_ODR_DLV_DATE(),_oprDate) >= 0) {
					    setErrorMessage("AD32214");
					    setWarningSysLogMessage("T_JOB_ODR.JOB_ODR_DLV_DATE", jobOdrStruct.getJOB_ODR_DLV_DATE());
					    setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_DLV_DATE", struct.getWORK_ODR_DLV_DATE());
					}else{
						setWarningMessage("AD32219");
						setInfoSysLogMessage("T_JOB_ODR.JOB_ODR_DLV_DATE", jobOdrStruct.getJOB_ODR_DLV_DATE());
						setInfoSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_DLV_DATE", struct.getWORK_ODR_DLV_DATE());
					}
				}
	
				// ��s��z����([���Ԍv��]."���Ԏ��"=2)�̍ŏ�ʕi�ڂ̏ꍇ�ŁA
				//�u�����[���v��min�i�����ԁE���Ԏ}�Ԃ��L�[�ɗv�����Ƃ̃f�}���h���������A
				// ����[���v��]."�v���[��"�j�ɂȂ�ꍇ
				if ("2".equals(jobOdrStruct.getJOB_ODR_TYP())) {
					// �ŏ�ʕi��(�e�I�[�_�f�}���h�ԍ���NULL)�̏ꍇ
					if (struct.geth_PARENT_OD_NO() == null 
							|| "".equals(struct.geth_PARENT_OD_NO())) {
								
						List jobOdrAlcList = entity.mselectJobOdrAlc.read(conn,jobOdrStruct);
						if (jobOdrAlcList == null || jobOdrAlcList.size() == 0) {
							//�����f�[�^��������΁A�`�F�b�N���Ȃ��B	
						} else {
							AD0020011Struct jobOdrAlcStruct = 
									(AD0020011Struct)jobOdrAlcList.get(0);
							setStandardItem(jobOdrAlcStruct);
							Date datealcDueDate = 
									Converter.strToDate(jobOdrAlcStruct.getDUE_DATE_BY_ALC(),
										Converter.SLASH_DATE);
								
							//�u�����[���v��[���v��]."�v���[��"
							if (dateWorkOdrDlvDate.compareTo(datealcDueDate) > 0 || (dateWorkOdrDlvDate.compareTo(datealcDueDate) == 0 && Integer.valueOf(WORK_ODR_DLV_DATE_TIME).intValue() > Integer.valueOf(jobOdrAlcStruct.getDUE_DATE_BY_ALC_TIME()).intValue() )) {
								//�����[���ɖ���������܂��B
								setWarningMessage("AD00044");
								setInfoSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_DLV_DATE", struct.getWORK_ODR_DLV_DATE());
								setInfoSysLogMessage("T_OD.DUE_DATE", jobOdrAlcStruct.getDUE_DATE_BY_ALC());
							}
						}
					}
				}
			}

			// �G���[������ΏI��
			if (msgStruct.hasError()) {
				return;
			}


			// �����{�^������
			if (struct.getOUTSIDE_TYP() == null 
					|| "1".equals(struct.getOUTSIDE_TYP())) {
				//����
				if ("LineInsert".equals(getButton()) || "LineCopy".equals(getButton())
						|| "Insert".equals(getButton())) {
					// �s�ǉ��E�s����
					try{
						struct.setWORK_ODR_DLV_DATE_ALL(struct.getWORK_ODR_DLV_DATE() + " " + WORK_ODR_DLV_DATE_TIME);
						struct.setOPR_INST_START_DATE_ALL(struct.getOPR_INST_START_DATE() + " " + OPR_INST_START_DATE_TIME);
						entity.minsertChild.create(conn, struct);
			
					} catch (SQLException se) {
						String err = se.toString();
						if (err.indexOf("ORA-00001") != -1) {//��Ӑ���G���[
							setErrorMessage("ZZ01102");
							setWarningSysLogMessage("SQLException", err);
							setReadStatus(ERROR);
							return;
						}
						ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
						sysLog.severe(emsg, getsysUSER_CD());
						ExpjException ee = new ExpjException(se, emsg);
						throw se;
					}
				} else if ("LineUpdate".equals(getButton()) || "Update".equals(getButton())) {
					// �s�C��
			
					//�i�ڎd�|�O���݃`�F�b�N
					List checkItemList = entity.mSelectChkWorkItem.read(conn, struct);
					if (checkItemList == null || checkItemList.size() == 0) {
						//�w��L�[�̃f�[�^�����݂��܂���B
						setErrorMessage("ZZ01101");
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", struct.getWORK_ODR_CD());
						return;
					}
						
					//�i�ڎd�|�OModifyCount�`�F�b�N
					AD0020011Struct checkItemStruct = (AD0020011Struct)checkItemList.get(0);
					setStandardItem(checkItemStruct);
					if (checkItemStruct.geth_ITEM_MODIFY_COUNT() != null 
							&& !checkItemStruct.geth_ITEM_MODIFY_COUNT().equals(
							struct.geth_ITEM_MODIFY_COUNT())) {
						setErrorMessage("ZZ01105");
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", struct.getWORK_ODR_CD());
						setReadStatus(ERROR);
						return;
					}
					struct.setWORK_ODR_DLV_DATE_ALL(struct.getWORK_ODR_DLV_DATE() + " " + WORK_ODR_DLV_DATE_TIME);
					struct.setOPR_INST_START_DATE_ALL(struct.getOPR_INST_START_DATE() + " " + OPR_INST_START_DATE_TIME);
					entity.mupdateChild.update(conn, struct);
			
				}
			} else {
				//�O��
				//�����c����
				//�����ԍ��̍̔�
				CollectNumber PUCH_CD = 
						new CollectNumber(CollectNumber.PUCH_CD, 
							getsysUSER_CD(), 
							this.sp.getProcId(), 
							getsysPLANT_CD());
				String strPuchCd = PUCH_CD.getNo();
				if (strPuchCd == null || "".equals(strPuchCd)) {
					//�̔Ԏ��s
					//�T�[�o�ŃG���[���������܂����B
					setErrorMessage("ZZ01106");
					setWarningSysLogMessage("SYS_PUCH_ODR_CD_CTRL.PUCH_ODR_CD", strPuchCd);
					return;
				} else {
					struct.setPUCH_ODR_CD(strPuchCd);
				}
			
				//[����].��ЃR�[�h�̎擾
				List companyList = entity.mselectSYS_MY_COMPANY_CompanyCd.read(conn,struct);
				if(companyList == null || companyList.size() <= 0){
					//�f�[�^�����݂��Ȃ�
					//�w��L�[�̃f�[�^�����݂��܂���B
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("SYS_MY_COMPANY.CTRL_CD", "SYSTEM");
					return;
				}
				AD0020011Struct companyStruct = (AD0020011Struct)companyList.get(0);
				setStandardItem(companyStruct);
			
				struct.setCOMPANY_CD(companyStruct.getCOMPANY_CD());
				struct.setPLANT_CD(getsysPLANT_CD());
			
				//��\�����R�[�h�̎擾
				List puchList = entity.mselectM_PUCH_UNIT_COST_H.read(conn, struct);
			
				if (puchList == null || puchList.size() <= 0) {
					//��\�����R�[�h�����݂��Ȃ�
					struct.setVEND_CD("");            //��\�����R�[�h
					struct.setPUCH_ODR_PERSON("");    //�����S����
					struct.setUNIT_COST_TYP("1");     //�w���P���敪 ���P��
					struct.setUNIT_COST("0");         //�w���P��
					struct.setPROCESSING_COST("0");   //�w�����H��
					struct.setMATERIAL_COST("0");     //�w���ޗ���
					struct.setOTHER_OVERHEADS("0");   //�w�����̑��o��
					struct.setPUCH_ODR_AMOUNT("0");   //�������z
					struct.setTAX_RATE_1("0");        //�ŗ�1
					struct.setTAX_RATE_2("0");        //�ŗ�2
					struct.setTAX_RATE_3("0");        //�ŗ�3
					struct.setTAX_CD("");             //�ŃR�[�h
					struct.setTAX_ROUND_TYP("1");     //�Œ[���敪
					struct.setNET_AMOUNT("0");        //�{�̋��z
					struct.setTAX_AMOUNT_1("0");      //�Ŋz1
					struct.setTAX_AMOUNT_2("0");      //�Ŋz2
					struct.setTAX_AMOUNT_3("0");      //�Ŋz3
					struct.setAMOUNT_INCLUDE_TAX("0");//�ō����z
					struct.setHOME_CUR_AMOUNT("0");   //�M�݋��z
					struct.setRATE_JUDGE_DATE("");    //���[�g�����
					struct.setEXCH_RATE("0");         //�בփ��[�g
			
				} else {
					AD0020011Struct puchStruct = (AD0020011Struct)puchList.get(0);
					setStandardItem(puchStruct);
					//��\�����R�[�h�����݂���
					struct.setVEND_CD(puchStruct.getVEND_CD());
					
					//�����S����
					struct.setPUCH_ODR_PERSON("");
						
					String unitCostTyp = null;     // �P���敪
					String unitCost = null;        // �P��
					String processingCost = null;  // ���H��
					String materialCost = null;    // �ޗ���
					String otherOverheads = null;  // ���̑��o��
						
					// �P���擾
					AD0020011Struct searchStruct = new AD0020011Struct();
					setStandardItem(searchStruct);
					searchStruct.setCOMPANY_CD(struct.getCOMPANY_CD());
					searchStruct.setPLANT_CD(getsysPLANT_CD());
					searchStruct.setITEM_CD(struct.getITEM_CD());
					searchStruct.setVEND_CD(struct.getVEND_CD());
					searchStruct.setEFF_PHASE_IN_DATE(struct.getWORK_ODR_DLV_DATE());
					searchStruct.setPUCH_SIZE(struct.getOPR_INST_QTY());
					List unitCostList = entity.mM_PUCH_UNIT_COST.read(conn, searchStruct);
						
					if (unitCostList == null || unitCostList.size() <= 0) {
						// �P����񂪑��݂��Ȃ��ꍇ
						unitCostTyp = "1";
						unitCost = "0.00";
						processingCost = "0.00";
						materialCost = "0.00";
						otherOverheads = "0.00";
							
					} else {
						AD0020011Struct unitCostStruct = (AD0020011Struct)unitCostList.get(0);
						setStandardItem(unitCostStruct);
						unitCostTyp = unitCostStruct.getUNIT_COST_TYP();
						unitCost = unitCostStruct.getUNIT_COST();
						processingCost = unitCostStruct.getPROCESSING_COST();
						materialCost = unitCostStruct.getMATERIAL_COST();
						otherOverheads = unitCostStruct.getOTHER_OVERHEADS();
					}
						
					//�w���P���敪
					struct.setUNIT_COST_TYP(unitCostTyp);
			
					//�w���P��
					struct.setUNIT_COST(unitCost);
						
					//�w�����H��
					struct.setPROCESSING_COST(processingCost);
						
					//�w���ޗ���
					struct.setMATERIAL_COST(materialCost);
						
					//�w�����̑��o��
					struct.setOTHER_OVERHEADS(otherOverheads);


					String roundTyp = "";       // �܂�ߋ敪
					String vendDecimalFig = ""; // �����_����
					String exchRate = "0";      // �ב֎��
			
					try {					
						// �ʉݏ����擾
						CurStruct cs =
							CurControl.getData(
								conn,
								struct.getCOMPANY_CD(),
								struct.getVEND_CD());
							
						roundTyp = cs.getROUND_TYP();
						vendDecimalFig = cs.getDECIMAL_FIG();
							
					} catch (DataNotFoundException e) {
						setErrorMessage("ZZ01101");
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", struct.getWORK_ODR_CD());
						return;
					}
						
					if (!"2".equals(puchStruct.getEXCH_TYP())
							&& !(puchStruct.getCUR_CD() == null 
							|| "".equals(puchStruct.getCUR_CD()))) {
						try{
							// �בփ��[�g�����擾
							ExchRateStruct ers =
								ExchRateControl.getData(
									conn,
									struct.getCOMPANY_CD(),
									puchStruct.getCUR_CD(),
									puchStruct.getEXCH_TYP(),
									null,
									struct.getWORK_ODR_DLV_DATE());
								
							exchRate = ers.getEXCH_RATE();
							struct.setRATE_JUDGE_DATE(struct.getWORK_ODR_DLV_DATE());
							struct.setEXCH_RATE(ers.getEXCH_RATE());
								
						} catch (DataNotFoundException e) {
							//���[�g�����	NULL
							struct.setRATE_JUDGE_DATE("");
							// �בփ��[�g	0
							struct.setEXCH_RATE("0");
							// �M�݋��z	0
							struct.setHOME_CUR_AMOUNT("0");
						}
					} else {
						//���[�g�����	NULL
						struct.setRATE_JUDGE_DATE("");
						// �בփ��[�g	0
						struct.setEXCH_RATE("0");
						// �M�݋��z	0
						struct.setHOME_CUR_AMOUNT("0");
					}
						
					try {
						// ����ŏ����擾
						TaxStruct ts =
							TaxControl.getData(
								conn,
								struct.getCOMPANY_CD(),
								struct.getVEND_CD(),
								struct.getITEM_CD(),
								struct.getWORK_ODR_DLV_DATE()); //�����[��
							
						//�ŃR�[�h:"����ŃR�[�h
						struct.setTAX_CD(ts.getTAX_CD());
						//�Œ[���敪:[����ŋ敪�}�X�^]�D"�[���敪"
						struct.setTAX_ROUND_TYP(ts.getTAX_ROUND_TYP());
							
						// TAX_CD�̉�1����1�ȊO�̏ꍇ�͐ŗ���0�Ƃ���B
						String lowerTaxCd =
							ts.getTAX_CD().substring(ts.getTAX_CD().length() - 1);
						if (lowerTaxCd.equals("1")) {
							struct.setTAX_RATE_1(ts.getTAX_RATE_1());
							struct.setTAX_RATE_2(ts.getTAX_RATE_2());
							struct.setTAX_RATE_3(ts.getTAX_RATE_3());
						} else {
							struct.setTAX_RATE_1("0.0");
							struct.setTAX_RATE_2("0.0");
							struct.setTAX_RATE_3("0.0");
						}
					} catch (DataNotFoundException e) {
						struct.setTAX_ROUND_TYP("1");
						struct.setTAX_RATE_1("0.0");
						struct.setTAX_RATE_2("0.0");
						struct.setTAX_RATE_3("0.0");
					}
						
					//�������z
					String puchOdrAmount =
						AmountCalculator.calcPuchOdrAmount(
							struct.getOPR_INST_QTY(),
							struct.getUNIT_COST(),
							roundTyp,
							vendDecimalFig);
					struct.setPUCH_ODR_AMOUNT(puchOdrAmount);
						
					// �l�����z
					String discAmount = "0.00";
						
					//�{�̋��z
					String netAmount =
						AmountCalculator.calcNetAmount(
							struct.getPUCH_ODR_AMOUNT(),
							discAmount);
					this.struct.setNET_AMOUNT(netAmount);
						
					//�Ŋz1
					String taxAmount1 =
						AmountCalculator.calcTaxAmount(
							struct.getNET_AMOUNT(),
							struct.getTAX_RATE_1(),
							struct.getTAX_ROUND_TYP(),
							vendDecimalFig);
					struct.setTAX_AMOUNT_1(taxAmount1);
						
					//�Ŋz2
					String taxAmount2 =
						AmountCalculator.calcTaxAmount(
							struct.getNET_AMOUNT(),
							struct.getTAX_RATE_2(),
							struct.getTAX_ROUND_TYP(),
							vendDecimalFig);
					struct.setTAX_AMOUNT_2(taxAmount2);
						
					//�Ŋz3
					String taxAmount3 =
						AmountCalculator.calcTaxAmount(
							struct.getNET_AMOUNT(),
							struct.getTAX_RATE_3(),
							struct.getTAX_ROUND_TYP(),
							vendDecimalFig);
					struct.setTAX_AMOUNT_3(taxAmount3);
						
					//�ō����z
					String amountIncludeTax =
						AmountCalculator.calcAmountIncludeTax(
							struct.getNET_AMOUNT(),
							struct.getTAX_AMOUNT_1(),
							struct.getTAX_AMOUNT_2(),
							struct.getTAX_AMOUNT_3());
					struct.setAMOUNT_INCLUDE_TAX(amountIncludeTax);
						
					//�ב֎�ʂ��Q�̏ꍇ
					if ("2".equals(puchStruct.getEXCH_TYP())) {
			
						//���[�g�����	NULL
						struct.setRATE_JUDGE_DATE("");
						// �בփ��[�g	0
						struct.setEXCH_RATE("0");
						// �M�݋��z	0
						struct.setHOME_CUR_AMOUNT("0");
			
					} else {
						//�M�݋��z
						String homeCurAmount =
							AmountCalculator.calcHomeCurAmount(
								struct.getAMOUNT_INCLUDE_TAX(),
								exchRate,
								roundTyp,
								sysHomeCurStruct.getDECIMAL_FIG());
						struct.setHOME_CUR_AMOUNT(homeCurAmount);
					}
				}
					
				//�I�[�_�f�}���h�ԍ�
				struct.setOD_NO(_keepOdNo);
			
				//[�i��].�󋋕i�敪�A��������敪�̎擾
				List itemList = entity.mselectM_ITEM.read(conn, struct);
				if (itemList == null || itemList.size() <= 0) {
					//�f�[�^�����݂��Ȃ�
					//�w��L�[�̃f�[�^�����݂��܂���B
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("M_ITEM.ITEM_CD", struct.getITEM_CD());
					return;
				} else {
					AD0020011Struct itemStruct = (AD0020011Struct)itemList.get(0);
					setStandardItem(itemStruct);
					struct.setSPL_ITEM_TYP(itemStruct.getSPL_ITEM_TYP());
					struct.setACPT_INSPC_TYP(itemStruct.getACPT_INSPC_TYP());
				}
				
				struct.setPLANT_CD(getsysPLANT_CD());
				// �󂯓���ۊǋ�̊���l�擾
				String strWhCd = ValidateWh.getDefaultRcv(conn, struct.getPLANT_CD(), struct.getITEM_CD());
				if("".equals(strWhCd)){
					//�f�[�^�����݂��Ȃ�
					setErrorMessage("AD10001");
					setWarningSysLogMessage("M_PLANT.PLANT_CD", struct.getPLANT_CD());
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.ITEM_CD", struct.getITEM_CD());
					return;
				} else {
					this.struct.setWH_CD(strWhCd);
				}
			
				//�����c�̓o�^���̈�Ӑ���G���[�`�F�b�N
				List puchOdrList = entity.mselectT_RLSD_PUCH_ODR.read(conn, struct);
				if (puchOdrList != null && puchOdrList.size() > 0) {
					setErrorMessage("ZZ01102");
					setWarningSysLogMessage("T_RLSD_PUCH_ODR.PUCH_ODR_CD", struct.getPUCH_ODR_CD());
					setReadStatus(ERROR);
					return;
				}
				
				struct.setWORK_ODR_DLV_DATE_ALL(struct.getWORK_ODR_DLV_DATE() + " " + WORK_ODR_DLV_DATE_TIME);
				struct.setOPR_INST_START_DATE_ALL(struct.getOPR_INST_START_DATE() + " " + OPR_INST_START_DATE_TIME);

				
				//�����c�̓o�^
				int nRet = entity.minsertT_RLSD_PUCH_ODR.create(conn, struct);

				if ("LineInsert".equals(getButton()) || "LineCopy".equals(getButton())
						|| "Insert".equals(getButton())) {
					//�s�ǉ��E�s����
					setInformationMessage("AD00105");
					setSupportMessage("T_RLSD_PUCH_ODR.PUCH_ODR_CD", strPuchCd);
				} else {
					//�s�C��
					setInformationMessage("AD53282");
					setSupportMessage("T_RLSD_PUCH_ODR.PUCH_ODR_CD", strPuchCd);
				}
				
			
				if ("LineUpdate".equals(getButton()) || "Update".equals(getButton())) {
					// �s�C��
					//�i�ڎd�|�O���݃`�F�b�N
					List tempItemList = entity.mSelectChkWorkItem.read(conn, struct);
					if (tempItemList == null || tempItemList.size() == 0) {
						//�w��L�[�̃f�[�^�����݂��܂���B
						setErrorMessage("ZZ01101");
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", struct.getWORK_ODR_CD());
						return;
					}
						
					//�i�ڎd�|�OModifyCount�`�F�b�N
					AD0020011Struct tempItemStruct = (AD0020011Struct)tempItemList.get(0);
					setStandardItem(tempItemStruct);
					if (tempItemStruct.geth_ITEM_MODIFY_COUNT() != null 
							&& !tempItemStruct.geth_ITEM_MODIFY_COUNT().equals(
							struct.geth_ITEM_MODIFY_COUNT())) {
						setErrorMessage("ZZ01105");
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", struct.getWORK_ODR_CD());
						setReadStatus(ERROR);
						return;
					}
						
					// �i�ڕʎd�|�̍폜
					entity.mdeleteChild.delete(conn, struct);
				}
			}
			
			//���v�I�[�_�f�}���h�X�V
			CommonOd od = new CommonOd(conn, getsysPLANT_CD(), getsysUSER_CD(), this.sp.getProcId());
			od.changeOdInfo(struct.getOD_NO(), -1);
			
			conn.commit();
			
			//�w�b�_�ƃ��X�g�̌������s��
			if (!selectMain()) {
				return;
			}
			
			setReadStatus(NORMAL);
			
		} catch (NumberFormatException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		} catch (ExpjException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		} catch (ParseException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		} catch (ApsComException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		} finally {
			try {
				if (conn != null) {
					conn.rollback();
				}
			} catch(Exception e) {
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				ExpjException ee = new ExpjException(e, emsg);
				throw ee;
			}
		}


                //}}user_implement_dev:<controlInsert>
		logger.exiting("AD0020011Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0020");
		logger.entering("AD0020011Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
		

		controlInsert();


                //}}user_implement_dev:<controlUpdate>
		logger.exiting("AD0020011Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0020");
		logger.entering("AD0020011Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AD0020011Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0020");
		logger.entering("AD0020011Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>


		try {
			formClear();
			listClear();
			setReadStatus(INITIAL);

			// [�M��]���𕔕i���擾
			this.sysHomeCurStruct = HomeCurControl.getData(conn);
			
			// �R���{�{�b�N�X�f�[�^�𕔕i���擾
			ComboBox cdac = new ComboBox(conn, sysUSER_CD);
			_outsideTypStruct = cdac.getData("OUTSIDE_TYP");
			cdac.setConnection(null);
			
			// ��ʑJ�ڂ̌Ăяo���̏ꍇ
			if (isScreenMove() == true) {
				struct.setOD_NO(_odNo);
				_keepOdNo = _odNo;
				//�w�b�_�ƃ��X�g�̌������s��
				if (!selectMain()) {
					return;
				}
			}
			
		} catch (ComboException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		} catch (DataNotFoundException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}


                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AD0020011Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0020");
		logger.entering("AD0020011Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		// �R���{�{�b�N�X���i�̃f�[�^�̃Z�b�g�͂����ɋL�q���Ă��������B		
		try{
			ComboBox comboController = new ComboBox(conn, sysUSER_CD);
			PROC_EXPLOSION_FLG = comboController.getData(PROC_EXPLOSION_FLG_PARAMETER_NAME);
		}catch (Exception e){
			e.printStackTrace();
		}
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AD0020011Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("Return") ) {
				controlReturn();
			} else if( button.equals("LineInsert") ) {
				controlLineInsert();
			} else if( button.equals("LineUpdate") ) {
				controlLineUpdate();
			} else if( button.equals("LineCopy") ) {
				controlLineCopy();
			} else if( button.equals("LineDelete") ) {
				controlLineDelete();
			} else if( button.equals("Insert") ) {
				controlInsert();
			} else if( button.equals("Update") ) {
				controlUpdate();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>


			// �R���{�{�b�N�X�f�[�^�ݒ�
			struct.setList_OUTSIDE_TYP_val(_outsideTypStruct.getValList());
			struct.setList_OUTSIDE_TYP_name(_outsideTypStruct.getExplanList());


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
//			throw new FoundationException("AD0020011Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0020011-E999","CSV�̏o�͏���"));
			throw new FoundationException("AD0020011Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0020011-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AD0020011Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0020011-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AD0020011Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AD0020011Entity entity;
	protected AD0020011Struct struct;
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

		entity = new AD0020011Entity();
		struct = new AD0020011Struct();

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
	 * AD0020011�N���X�̕W���R���X�g���N�^
	 */
	public AD0020011Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
			// TODO: �����ɏ����������L�q���Ă�������
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
				AD0020011Struct key = (AD0020011Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_name") && key.getOUTSIDE_TYP_name() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_name", key.getOUTSIDE_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_val") && key.getOUTSIDE_TYP_val() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_val", key.getOUTSIDE_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("h_DUE_DATE") && key.geth_DUE_DATE() != null) {
					msgKey.setKeyValue("h_DUE_DATE", key.geth_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_START_DATE") && key.geth_ODR_START_DATE() != null) {
					msgKey.setKeyValue("h_ODR_START_DATE", key.geth_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("DUE_DATE_TIME") && key.getDUE_DATE_TIME() != null) {
					msgKey.setKeyValue("DUE_DATE_TIME", key.getDUE_DATE_TIME());
				}
				if(msgKeyType.containsKeyColumn("PRD_DUE_DATE_TIME") && key.getPRD_DUE_DATE_TIME() != null) {
					msgKey.setKeyValue("PRD_DUE_DATE_TIME", key.getPRD_DUE_DATE_TIME());
				}
				if(msgKeyType.containsKeyColumn("PRD_START_DATE_TIME") && key.getPRD_START_DATE_TIME() != null) {
					msgKey.setKeyValue("PRD_START_DATE_TIME", key.getPRD_START_DATE_TIME());
				}
				if(msgKeyType.containsKeyColumn("ODR_START_DATE_TIME") && key.getODR_START_DATE_TIME() != null) {
					msgKey.setKeyValue("ODR_START_DATE_TIME", key.getODR_START_DATE_TIME());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE_TIME") && key.getWORK_ODR_DLV_DATE_TIME() != null) {
					msgKey.setKeyValue("WORK_ODR_DLV_DATE_TIME", key.getWORK_ODR_DLV_DATE_TIME());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_TIME") && key.getOPR_INST_START_DATE_TIME() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATE_TIME", key.getOPR_INST_START_DATE_TIME());
				}
				if(msgKeyType.containsKeyColumn("h_DUE_DATE_TIME") && key.geth_DUE_DATE_TIME() != null) {
					msgKey.setKeyValue("h_DUE_DATE_TIME", key.geth_DUE_DATE_TIME());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_START_DATE_TIME") && key.geth_ODR_START_DATE_TIME() != null) {
					msgKey.setKeyValue("h_ODR_START_DATE_TIME", key.geth_ODR_START_DATE_TIME());
				}
				if(msgKeyType.containsKeyColumn("AMOUNT_INCLUDE_TAX") && key.getAMOUNT_INCLUDE_TAX() != null) {
					msgKey.setKeyValue("AMOUNT_INCLUDE_TAX", key.getAMOUNT_INCLUDE_TAX());
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
				if(msgKeyType.containsKeyColumn("h_UNIT_QTY_TYP") && key.geth_UNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("h_UNIT_QTY_TYP", key.geth_UNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_DN") && key.getOUTSIDE_TYP_DN() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_DN", key.getOUTSIDE_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_DN") && key.getMRP_ODR_TYP_DN() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_DN", key.getMRP_ODR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE") && key.getJOB_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("JOB_ODR_DLV_DATE", key.getJOB_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("DUE_DATE") && key.getDUE_DATE() != null) {
					msgKey.setKeyValue("DUE_DATE", key.getDUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("DM_QTY") && key.getDM_QTY() != null) {
					msgKey.setKeyValue("DM_QTY", key.getDM_QTY());
				}
				if(msgKeyType.containsKeyColumn("ALCD_QTY") && key.getALCD_QTY() != null) {
					msgKey.setKeyValue("ALCD_QTY", key.getALCD_QTY());
				}
				if(msgKeyType.containsKeyColumn("PRD_DUE_DATE") && key.getPRD_DUE_DATE() != null) {
					msgKey.setKeyValue("PRD_DUE_DATE", key.getPRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("PRD_START_DATE") && key.getPRD_START_DATE() != null) {
					msgKey.setKeyValue("PRD_START_DATE", key.getPRD_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("ODR_START_DATE") && key.getODR_START_DATE() != null) {
					msgKey.setKeyValue("ODR_START_DATE", key.getODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("ODR_QTY") && key.getODR_QTY() != null) {
					msgKey.setKeyValue("ODR_QTY", key.getODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_QTY") && key.getOPR_INST_QTY() != null) {
					msgKey.setKeyValue("OPR_INST_QTY", key.getOPR_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_QTY") && key.getPUCH_ODR_QTY() != null) {
					msgKey.setKeyValue("PUCH_ODR_QTY", key.getPUCH_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP") && key.getOPR_RSLT_TYP() != null) {
					msgKey.setKeyValue("OPR_RSLT_TYP", key.getOPR_RSLT_TYP());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP_DN") && key.getOPR_RSLT_TYP_DN() != null) {
					msgKey.setKeyValue("OPR_RSLT_TYP_DN", key.getOPR_RSLT_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("h_PARENT_OD_NO") && key.geth_PARENT_OD_NO() != null) {
					msgKey.setKeyValue("h_PARENT_OD_NO", key.geth_PARENT_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO") && key.getJOB_ODR_CANCEL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_CANCEL_NO", key.getJOB_ODR_CANCEL_NO());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("h_PROC_EXPLOSION_FLG") && key.geth_PROC_EXPLOSION_FLG() != null) {
					msgKey.setKeyValue("h_PROC_EXPLOSION_FLG", key.geth_PROC_EXPLOSION_FLG());
				}
				if(msgKeyType.containsKeyColumn("PROC_EXPLOSION_FLG_DN") && key.getPROC_EXPLOSION_FLG_DN() != null) {
					msgKey.setKeyValue("PROC_EXPLOSION_FLG_DN", key.getPROC_EXPLOSION_FLG_DN());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_CD") && key.getWORK_ODR_CD() != null) {
					msgKey.setKeyValue("WORK_ODR_CD", key.getWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE") && key.getWORK_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("WORK_ODR_DLV_DATE", key.getWORK_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE") && key.getOPR_INST_START_DATE() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATE", key.getOPR_INST_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("WORK_IN_PROC_COMMENT") && key.getWORK_IN_PROC_COMMENT() != null) {
					msgKey.setKeyValue("WORK_IN_PROC_COMMENT", key.getWORK_IN_PROC_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_MODIFY_COUNT") && key.geth_ITEM_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_ITEM_MODIFY_COUNT", key.geth_ITEM_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_ALL") && key.getOPR_INST_START_DATE_ALL() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATE_ALL", key.getOPR_INST_START_DATE_ALL());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE_ALL") && key.getWORK_ODR_DLV_DATE_ALL() != null) {
					msgKey.setKeyValue("WORK_ODR_DLV_DATE_ALL", key.getWORK_ODR_DLV_DATE_ALL());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("HOLIDAY_FLG") && key.getHOLIDAY_FLG() != null) {
					msgKey.setKeyValue("HOLIDAY_FLG", key.getHOLIDAY_FLG());
				}
				if(msgKeyType.containsKeyColumn("CAL_DATE") && key.getCAL_DATE() != null) {
					msgKey.setKeyValue("CAL_DATE", key.getCAL_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_DATE") && key.geth_BUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("h_BUSINESS_OPR_DATE", key.geth_BUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_CHILD") && key.geth_CHILD() != null) {
					msgKey.setKeyValue("h_CHILD", key.geth_CHILD());
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
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP") && key.getEXCH_TYP() != null) {
					msgKey.setKeyValue("EXCH_TYP", key.getEXCH_TYP());
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
				if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON") && key.getPUCH_ODR_PERSON() != null) {
					msgKey.setKeyValue("PUCH_ODR_PERSON", key.getPUCH_ODR_PERSON());
				}
				if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP") && key.getSPL_ITEM_TYP() != null) {
					msgKey.setKeyValue("SPL_ITEM_TYP", key.getSPL_ITEM_TYP());
				}
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP") && key.getACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP", key.getACPT_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
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
				if(msgKeyType.containsKeyColumn("RATE_JUDGE_DATE") && key.getRATE_JUDGE_DATE() != null) {
					msgKey.setKeyValue("RATE_JUDGE_DATE", key.getRATE_JUDGE_DATE());
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
				if(msgKeyType.containsKeyColumn("HOME_CUR_AMOUNT") && key.getHOME_CUR_AMOUNT() != null) {
					msgKey.setKeyValue("HOME_CUR_AMOUNT", key.getHOME_CUR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD") && key.getTAX_CD() != null) {
					msgKey.setKeyValue("TAX_CD", key.getTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP") && key.getTAX_ROUND_TYP() != null) {
					msgKey.setKeyValue("TAX_ROUND_TYP", key.getTAX_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("EXCH_RATE") && key.getEXCH_RATE() != null) {
					msgKey.setKeyValue("EXCH_RATE", key.getEXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("LOG_CD") && key.getLOG_CD() != null) {
					msgKey.setKeyValue("LOG_CD", key.getLOG_CD());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_NAME") && key.getBUSINESS_NAME() != null) {
					msgKey.setKeyValue("BUSINESS_NAME", key.getBUSINESS_NAME());
				}
				if(msgKeyType.containsKeyColumn("MSG_CD") && key.getMSG_CD() != null) {
					msgKey.setKeyValue("MSG_CD", key.getMSG_CD());
				}
				if(msgKeyType.containsKeyColumn("MSG") && key.getMSG() != null) {
					msgKey.setKeyValue("MSG", key.getMSG());
				}
				if(msgKeyType.containsKeyColumn("DATA_STRING") && key.getDATA_STRING() != null) {
					msgKey.setKeyValue("DATA_STRING", key.getDATA_STRING());
				}
				if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE") && key.getEFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("EFF_PHASE_IN_DATE", key.getEFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("PUCH_SIZE") && key.getPUCH_SIZE() != null) {
					msgKey.setKeyValue("PUCH_SIZE", key.getPUCH_SIZE());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("PRD_DUE_DATE_ALL") && key.getPRD_DUE_DATE_ALL() != null) {
					msgKey.setKeyValue("PRD_DUE_DATE_ALL", key.getPRD_DUE_DATE_ALL());
				}
				if(msgKeyType.containsKeyColumn("PRD_START_DATE_ALL") && key.getPRD_START_DATE_ALL() != null) {
					msgKey.setKeyValue("PRD_START_DATE_ALL", key.getPRD_START_DATE_ALL());
				}
				if(msgKeyType.containsKeyColumn("h_DUE_DATE_ALL") && key.geth_DUE_DATE_ALL() != null) {
					msgKey.setKeyValue("h_DUE_DATE_ALL", key.geth_DUE_DATE_ALL());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_START_DATE_ALL") && key.geth_ODR_START_DATE_ALL() != null) {
					msgKey.setKeyValue("h_ODR_START_DATE_ALL", key.geth_ODR_START_DATE_ALL());
				}
				if(msgKeyType.containsKeyColumn("h_MANHOUR_TYP") && key.geth_MANHOUR_TYP() != null) {
					msgKey.setKeyValue("h_MANHOUR_TYP", key.geth_MANHOUR_TYP());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE_ALL") && key.getJOB_ODR_DLV_DATE_ALL() != null) {
					msgKey.setKeyValue("JOB_ODR_DLV_DATE_ALL", key.getJOB_ODR_DLV_DATE_ALL());
				}
				if(msgKeyType.containsKeyColumn("DUE_DATE_ALL") && key.getDUE_DATE_ALL() != null) {
					msgKey.setKeyValue("DUE_DATE_ALL", key.getDUE_DATE_ALL());
				}
				if(msgKeyType.containsKeyColumn("ODR_START_DATE_ALL") && key.getODR_START_DATE_ALL() != null) {
					msgKey.setKeyValue("ODR_START_DATE_ALL", key.getODR_START_DATE_ALL());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_QTY_TYP") && key.getl_UNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("l_UNIT_QTY_TYP", key.getl_UNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO") && key.getJOB_ODR_DETAIL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_DETAIL_NO", key.getJOB_ODR_DETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP") && key.getJOB_ODR_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP", key.getJOB_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE_TIME") && key.getJOB_ODR_DLV_DATE_TIME() != null) {
					msgKey.setKeyValue("JOB_ODR_DLV_DATE_TIME", key.getJOB_ODR_DLV_DATE_TIME());
				}
				if(msgKeyType.containsKeyColumn("count_OD_NO") && key.getcount_OD_NO() != null) {
					msgKey.setKeyValue("count_OD_NO", key.getcount_OD_NO());
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
					AD0020011Struct key = new AD0020011Struct();
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_name")) {
						key.setOUTSIDE_TYP_name(msgKey.getKeyValue("OUTSIDE_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_val")) {
						key.setOUTSIDE_TYP_val(msgKey.getKeyValue("OUTSIDE_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("h_DUE_DATE")) {
						key.seth_DUE_DATE(msgKey.getKeyValue("h_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_START_DATE")) {
						key.seth_ODR_START_DATE(msgKey.getKeyValue("h_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("DUE_DATE_TIME")) {
						key.setDUE_DATE_TIME(msgKey.getKeyValue("DUE_DATE_TIME"));
					}
					if(msgKeyType.containsKeyColumn("PRD_DUE_DATE_TIME")) {
						key.setPRD_DUE_DATE_TIME(msgKey.getKeyValue("PRD_DUE_DATE_TIME"));
					}
					if(msgKeyType.containsKeyColumn("PRD_START_DATE_TIME")) {
						key.setPRD_START_DATE_TIME(msgKey.getKeyValue("PRD_START_DATE_TIME"));
					}
					if(msgKeyType.containsKeyColumn("ODR_START_DATE_TIME")) {
						key.setODR_START_DATE_TIME(msgKey.getKeyValue("ODR_START_DATE_TIME"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE_TIME")) {
						key.setWORK_ODR_DLV_DATE_TIME(msgKey.getKeyValue("WORK_ODR_DLV_DATE_TIME"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_TIME")) {
						key.setOPR_INST_START_DATE_TIME(msgKey.getKeyValue("OPR_INST_START_DATE_TIME"));
					}
					if(msgKeyType.containsKeyColumn("h_DUE_DATE_TIME")) {
						key.seth_DUE_DATE_TIME(msgKey.getKeyValue("h_DUE_DATE_TIME"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_START_DATE_TIME")) {
						key.seth_ODR_START_DATE_TIME(msgKey.getKeyValue("h_ODR_START_DATE_TIME"));
					}
					if(msgKeyType.containsKeyColumn("AMOUNT_INCLUDE_TAX")) {
						key.setAMOUNT_INCLUDE_TAX(msgKey.getKeyValue("AMOUNT_INCLUDE_TAX"));
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
					if(msgKeyType.containsKeyColumn("h_UNIT_QTY_TYP")) {
						key.seth_UNIT_QTY_TYP(msgKey.getKeyValue("h_UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_DN")) {
						key.setOUTSIDE_TYP_DN(msgKey.getKeyValue("OUTSIDE_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_DN")) {
						key.setMRP_ODR_TYP_DN(msgKey.getKeyValue("MRP_ODR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE")) {
						key.setJOB_ODR_DLV_DATE(msgKey.getKeyValue("JOB_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("DUE_DATE")) {
						key.setDUE_DATE(msgKey.getKeyValue("DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("DM_QTY")) {
						key.setDM_QTY(msgKey.getKeyValue("DM_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ALCD_QTY")) {
						key.setALCD_QTY(msgKey.getKeyValue("ALCD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PRD_DUE_DATE")) {
						key.setPRD_DUE_DATE(msgKey.getKeyValue("PRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PRD_START_DATE")) {
						key.setPRD_START_DATE(msgKey.getKeyValue("PRD_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_START_DATE")) {
						key.setODR_START_DATE(msgKey.getKeyValue("ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_QTY")) {
						key.setODR_QTY(msgKey.getKeyValue("ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_QTY")) {
						key.setOPR_INST_QTY(msgKey.getKeyValue("OPR_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_QTY")) {
						key.setPUCH_ODR_QTY(msgKey.getKeyValue("PUCH_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP")) {
						key.setOPR_RSLT_TYP(msgKey.getKeyValue("OPR_RSLT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP_DN")) {
						key.setOPR_RSLT_TYP_DN(msgKey.getKeyValue("OPR_RSLT_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("h_PARENT_OD_NO")) {
						key.seth_PARENT_OD_NO(msgKey.getKeyValue("h_PARENT_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO")) {
						key.setJOB_ODR_CANCEL_NO(msgKey.getKeyValue("JOB_ODR_CANCEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_PROC_EXPLOSION_FLG")) {
						key.seth_PROC_EXPLOSION_FLG(msgKey.getKeyValue("h_PROC_EXPLOSION_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PROC_EXPLOSION_FLG_DN")) {
						key.setPROC_EXPLOSION_FLG_DN(msgKey.getKeyValue("PROC_EXPLOSION_FLG_DN"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_CD")) {
						key.setWORK_ODR_CD(msgKey.getKeyValue("WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE")) {
						key.setWORK_ODR_DLV_DATE(msgKey.getKeyValue("WORK_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE")) {
						key.setOPR_INST_START_DATE(msgKey.getKeyValue("OPR_INST_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WORK_IN_PROC_COMMENT")) {
						key.setWORK_IN_PROC_COMMENT(msgKey.getKeyValue("WORK_IN_PROC_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_MODIFY_COUNT")) {
						key.seth_ITEM_MODIFY_COUNT(msgKey.getKeyValue("h_ITEM_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_ALL")) {
						key.setOPR_INST_START_DATE_ALL(msgKey.getKeyValue("OPR_INST_START_DATE_ALL"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE_ALL")) {
						key.setWORK_ODR_DLV_DATE_ALL(msgKey.getKeyValue("WORK_ODR_DLV_DATE_ALL"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("HOLIDAY_FLG")) {
						key.setHOLIDAY_FLG(msgKey.getKeyValue("HOLIDAY_FLG"));
					}
					if(msgKeyType.containsKeyColumn("CAL_DATE")) {
						key.setCAL_DATE(msgKey.getKeyValue("CAL_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_DATE")) {
						key.seth_BUSINESS_OPR_DATE(msgKey.getKeyValue("h_BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_CHILD")) {
						key.seth_CHILD(msgKey.getKeyValue("h_CHILD"));
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
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP")) {
						key.setEXCH_TYP(msgKey.getKeyValue("EXCH_TYP"));
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
					if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON")) {
						key.setPUCH_ODR_PERSON(msgKey.getKeyValue("PUCH_ODR_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP")) {
						key.setSPL_ITEM_TYP(msgKey.getKeyValue("SPL_ITEM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP")) {
						key.setACPT_INSPC_TYP(msgKey.getKeyValue("ACPT_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
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
					if(msgKeyType.containsKeyColumn("RATE_JUDGE_DATE")) {
						key.setRATE_JUDGE_DATE(msgKey.getKeyValue("RATE_JUDGE_DATE"));
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
					if(msgKeyType.containsKeyColumn("HOME_CUR_AMOUNT")) {
						key.setHOME_CUR_AMOUNT(msgKey.getKeyValue("HOME_CUR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD")) {
						key.setTAX_CD(msgKey.getKeyValue("TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP")) {
						key.setTAX_ROUND_TYP(msgKey.getKeyValue("TAX_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_RATE")) {
						key.setEXCH_RATE(msgKey.getKeyValue("EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("LOG_CD")) {
						key.setLOG_CD(msgKey.getKeyValue("LOG_CD"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_NAME")) {
						key.setBUSINESS_NAME(msgKey.getKeyValue("BUSINESS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MSG_CD")) {
						key.setMSG_CD(msgKey.getKeyValue("MSG_CD"));
					}
					if(msgKeyType.containsKeyColumn("MSG")) {
						key.setMSG(msgKey.getKeyValue("MSG"));
					}
					if(msgKeyType.containsKeyColumn("DATA_STRING")) {
						key.setDATA_STRING(msgKey.getKeyValue("DATA_STRING"));
					}
					if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE")) {
						key.setEFF_PHASE_IN_DATE(msgKey.getKeyValue("EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_SIZE")) {
						key.setPUCH_SIZE(msgKey.getKeyValue("PUCH_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PRD_DUE_DATE_ALL")) {
						key.setPRD_DUE_DATE_ALL(msgKey.getKeyValue("PRD_DUE_DATE_ALL"));
					}
					if(msgKeyType.containsKeyColumn("PRD_START_DATE_ALL")) {
						key.setPRD_START_DATE_ALL(msgKey.getKeyValue("PRD_START_DATE_ALL"));
					}
					if(msgKeyType.containsKeyColumn("h_DUE_DATE_ALL")) {
						key.seth_DUE_DATE_ALL(msgKey.getKeyValue("h_DUE_DATE_ALL"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_START_DATE_ALL")) {
						key.seth_ODR_START_DATE_ALL(msgKey.getKeyValue("h_ODR_START_DATE_ALL"));
					}
					if(msgKeyType.containsKeyColumn("h_MANHOUR_TYP")) {
						key.seth_MANHOUR_TYP(msgKey.getKeyValue("h_MANHOUR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(msgKey.getKeyValue("OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE_ALL")) {
						key.setJOB_ODR_DLV_DATE_ALL(msgKey.getKeyValue("JOB_ODR_DLV_DATE_ALL"));
					}
					if(msgKeyType.containsKeyColumn("DUE_DATE_ALL")) {
						key.setDUE_DATE_ALL(msgKey.getKeyValue("DUE_DATE_ALL"));
					}
					if(msgKeyType.containsKeyColumn("ODR_START_DATE_ALL")) {
						key.setODR_START_DATE_ALL(msgKey.getKeyValue("ODR_START_DATE_ALL"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_QTY_TYP")) {
						key.setl_UNIT_QTY_TYP(msgKey.getKeyValue("l_UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO")) {
						key.setJOB_ODR_DETAIL_NO(msgKey.getKeyValue("JOB_ODR_DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP")) {
						key.setJOB_ODR_TYP(msgKey.getKeyValue("JOB_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE_TIME")) {
						key.setJOB_ODR_DLV_DATE_TIME(msgKey.getKeyValue("JOB_ODR_DLV_DATE_TIME"));
					}
					if(msgKeyType.containsKeyColumn("count_OD_NO")) {
						key.setcount_OD_NO(msgKey.getKeyValue("count_OD_NO"));
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
