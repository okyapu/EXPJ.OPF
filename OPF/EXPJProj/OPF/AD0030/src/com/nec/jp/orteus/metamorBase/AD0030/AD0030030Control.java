/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0030/src/com/nec/jp/orteus/metamorBase/AD0030/AD0030030Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0030;

import com.nec.jp.orteus.metamorBase.AD0030.*;
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

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.math.BigDecimal;

import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.metamorBase.common04.amount.AmountCalculator;
import com.nec.jp.orteus.metamorBase.common04.amount.CurControl;
import com.nec.jp.orteus.metamorBase.common04.amount.CurStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateControl;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxControl;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxStruct;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurStruct;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import com.nec.jp.orteus.expj.pr.rcvissue.process.ValidateWh;

//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AD0030030Control
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
	public AD0030030Struct getListvalue(int x) { return (AD0030030Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AD0030030Struct getStruct() { return this.struct; }	// Struct��Ԃ��܂��B
	public AD0030030Struct createStruct() { return new AD0030030Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AD0030030Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

//------------------------------------------------------------------------------
	/** �V�X�e�����O���b�Z�[�W�쐬�p */
	private StringBuffer _sysLogMessage = null;

	/** �o�Ɏw�������̏������� */
	private int _debugParentCount = 0;
	/** �o�Ɏw�������̏������� */
	private int _debugAllCount = 0;

	/** ���t�����p */
	DateFormat df = DateFormat.getDateInstance();
	/** �M�ݏ��f�[�^�N���X */
	HomeCurStruct sysHomeCurStruct = new HomeCurStruct();

	/** �����ԍ� */
	String puchCd = null;

	/** �w�I���X�V�x�{�^���������́A�u�Ώۃf�[�^������܂���v�\������p */
	private int _messageSetFlg = 0;


	/**
	 * Orteus�W��Struct�̒l��Ώ�Struct�ɃR�s�[���܂��B
	 * @param target �R�s�[�ΏۂƂȂ�Struct
	 */
	private void setStandardItem(AD0030030Struct target){

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
		msgStruct.addError(emsg);
	}
	/**
	 * �Ɩ����W�b�N�̃G���[���b�Z�[�W�⏕���ڐݒ菈����؂�o���Ċ֐���
	 * @param db1 �f�[�^�x�[�X���ڂP
	 * @param value1 �u��������P
	 * @param db2 �f�[�^�x�[�X���ڂQ
	 * @param value2 �u��������Q
	 */
	private void setSupportMessage(String db1, String value1, String db2, String value2) {
		_sysLogMessage = new StringBuffer();
		_sysLogMessage.append(db1);
		_sysLogMessage.append(":");
		_sysLogMessage.append(value1);
		_sysLogMessage.append(",");
		_sysLogMessage.append(db2);
		_sysLogMessage.append(":");
		_sysLogMessage.append(value2);
		ExpjMessage emsg = new ExpjMessage("ZZ01006", _sysLogMessage.toString());
		msgStruct.addError(emsg);
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
	 * ��ʂ̑S���ڂ�������
	 */
	public void initializeAll() {
		
		this.struct.setOPR_INST_START_DATE(null); //�����
		this.struct.setOPR_INST_START_TIME(null); //���������
		this.struct.setWORK_ODR_DLV_DATE(null);   //�[��
		this.struct.setWORK_ODR_DLV_TIME(null);   //�[������
		this.struct.setJOB_ODR_CD(null);          //����
		this.struct.setITEM_CD(null);             //�i�ڔԍ�
		this.struct.setWS_CD(null);               //��Ƌ�R�[�h
		this.struct.setVEND_CD(null);             //�����R�[�h
		this.struct.setITEM_NAME(null);
		this.struct.setWS_NAME(null);
		this.struct.setVEND_ANAME(null);

		this.struct.setr1_FILTER1("true");
		this.struct.setr2_FILTER1(null);
		this.struct.setc_OUTPUT_RSLT("true");
		this.struct.setc_OUTSIDE_TYP_IN("true");
		this.struct.setc_OUTSIDE_TYP_OUT("true");
	}

	/**
	 * �S���X�g��������
	 */
	public void listClear() {
		if(this.list != null && this.list.size() > 0){
			this.list.clear();
		}
	}

	/**
	 * �I���X�V�{�^���������̑I���s�̍X�V�������s���܂��B�i�I���s���Ƃ�Commit�����j
	 * @param selectedStruct �I���X�V�̑Ώۍs�̃f�[�^
	 * @throws ExpjException
	 * @throws FoundationException
	 * @throws SQLException
	 * @throws ParseException
	 */
	private void UpdateAssort(AD0030030Struct selectedStruct) 
			throws ExpjException, FoundationException, SQLException, ParseException {
		
		try {
			//�i�ڕʎd�|�e�[�u�����X�V����(�w���ς݂łȂ��ꍇ)
			List byItemList = new ArrayList();
			byItemList = entity.mSelectChkWorkItem.read(conn, struct);
						
			if (byItemList.isEmpty()) {
				//�f�[�^�����݂��Ȃ�
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
				setWarningSysLogMessage("V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
				return;
			}
			AD0030030Struct byItemStruct = new AD0030030Struct();
			byItemStruct = (AD0030030Struct)byItemList.get(0);
			setStandardItem(byItemStruct);
			byItemStruct.setWORK_ODR_CD(struct.getWORK_ODR_CD());
			byItemStruct.setOPR_INST_DATE(struct.getBUSINESS_OPR_DATE());
						
			if (byItemStruct.getWORK_STS_TYP() != null 
					&& !("2".equals(byItemStruct.getWORK_STS_TYP()))) {
				//�i�ڎd�|�̍X�V(�w���ςݍX�V)
				entity.mupdateWORK_IN_PROC_BY_ITEM.update(conn, byItemStruct);
			}
						
			//��Ǝw���̏ꍇ�A��ƌn��d�|���X�V����
			if ("2".equals(selectedStruct.getl_OPR_RSLT_TYP())) {
			
				//��Ǝd�|���݃`�F�b�N
				List modifyCountList = new ArrayList();
				modifyCountList = entity.mSelectChkWorkProc.read(conn,struct);
				if (modifyCountList.isEmpty()) {
					//�w��L�[�̃f�[�^�����݂��܂���B
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
					setWarningSysLogMessage("V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
					return;
				}
						
				//��Ǝd�|ModifyCount�`�F�b�N
				AD0030030Struct modifyCountStruct = new AD0030030Struct();
				modifyCountStruct = (AD0030030Struct)modifyCountList.get(0);
				setStandardItem(modifyCountStruct);
				if(modifyCountStruct.getCHECK_MODIFY_COUNT() != null 
						&& !selectedStruct.geth_MODIFY_COUNT().equals(
						modifyCountStruct.getCHECK_MODIFY_COUNT())){
					//���̏����ɂ��f�[�^�������������Ă��܂��B���j���[�ɖ߂��Ă�蒼���ĉ������B
					setErrorMessage("ZZ01105");
					setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
					setWarningSysLogMessage("V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
					return;
				}
				
				AD0030030Struct byProcStruct = new AD0030030Struct(); 
				setStandardItem(byProcStruct);
				byProcStruct.setWORK_ODR_CD(struct.getWORK_ODR_CD());
				byProcStruct.setWORK_IN_PROC_CD(struct.getWORK_IN_PROC_CD());
				byProcStruct.setOPR_INST_DATE(struct.getBUSINESS_OPR_DATE());
				
				//��ƌn��ʎd�|���X�V����
				entity.mupdateT_WORK_IN_PROC_BY_PROC.update(conn, byProcStruct);
						
			}
			
			
			//�����ԍ�
			puchCd = null;
						
			//��Ǝw���ł��O��̏ꍇ�A�����c����
			if ("2".equals(selectedStruct.getl_OPR_RSLT_TYP()) 
					&& "2".equals(selectedStruct.getOUTSIDE_TYP())) {
			
				//�����c�̓o�^
				if( !insertPuch(selectedStruct) ){
					return;
				}
			}
									
						
			AD0030030Struct minProcNoStruct = new AD0030030Struct();
			//��ƌn��ʎd�|�̌n��ԍ��ŏ��̃��R�[�h���擾����B
			if ("2".equals(selectedStruct.getl_OPR_RSLT_TYP())) {
				List minProcNoList = new ArrayList();
				minProcNoList = entity.mSelectMinPROC.read(conn, struct);
				if (minProcNoList.isEmpty()) {
					setErrorMessage("ZZ06001");
					setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
					setWarningSysLogMessage("V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
					return;
				}
				minProcNoStruct = (AD0030030Struct)minProcNoList.get(0);
				setStandardItem(minProcNoStruct);
			}
						
			//�o�����������͍�Ǝw�������H���̂ݏo�Ɏw���������s��
			if ("1".equals(selectedStruct.getl_OPR_RSLT_TYP())
					|| ("2".equals(selectedStruct.getl_OPR_RSLT_TYP())
					&& minProcNoStruct.getPROC_NO() != null
					&& Integer.parseInt(minProcNoStruct.getPROC_NO())
					== Integer.parseInt(selectedStruct.getPROC_NO()))) {
							
				//�o�Ɏw������
				insertIssue(selectedStruct);
			}
						
			conn.commit();

		} finally {
			try {
				if (conn != null) {
					conn.rollback();
				}
			} catch(Exception e) {
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				throw new ExpjException(e, emsg);
			}
		}
	}

	/**
	 * �����c�̓o�^���s���܂��B
	 * @param selectedStruct �I���X�V�̑Ώۍs�̃f�[�^
	 * @throws FoundationException
	 * @return true/false �G���[�����������ꍇ false
	 * @throws SQLException
	 */
	private boolean insertPuch(AD0030030Struct selectedStruct) 
			throws FoundationException, SQLException {

		//�܂�ߋ敪
		String roundTyp = "";
		
		//��ƌn��ʎd�|��蔭���c�ɓo�^����f�[�^���擾���A�ݒ肷��
		List byProcList = new ArrayList();
		byProcList = entity.mselectT_WORK_IN_PROC_BY_PROC.read(conn, struct);
		if (byProcList.isEmpty()) {
			//�f�[�^�����݂��Ȃ�
			setErrorMessage("ZZ01101");
			setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
			setWarningSysLogMessage("V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
			setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
			return false;
		}
		AD0030030Struct puchStruct = new AD0030030Struct();
		puchStruct = (AD0030030Struct)byProcList.get(0);
		setStandardItem(puchStruct);

		puchStruct.setOPR_INST_DATE(struct.getBUSINESS_OPR_DATE());
		puchStruct.setWORK_ODR_CD(struct.getWORK_ODR_CD());
		puchStruct.setWORK_IN_PROC_CD(struct.getWORK_IN_PROC_CD());
		puchStruct.setPLANT_CD(getsysPLANT_CD());

		//���������:�m��ƌn��ʎd�|�n."��ƌn��ʒ����"
		puchStruct.setPUCH_ODR_START_DATE(puchStruct.getOPR_INST_START_DATE());
		//�����[��:�m��ƌn��ʎd�|�n."��ƌn��ʐ����[��"
		puchStruct.setPUCH_ODR_DLV_DATE(puchStruct.getWORK_ODR_DLV_DATE());
		//������:�m��ƌn��ʎd�|�n."��Ǝw����"
		puchStruct.setPUCH_ODR_QTY(puchStruct.getOPR_INST_QTY());
		selectedStruct.setOPR_INST_QTY(puchStruct.getOPR_INST_QTY());
		//�����w����:�m��ƌn��ʎd�|�n."��ƌn��ʍ�Ǝw����"
		puchStruct.setPUCH_ODR_INST_DATE(puchStruct.getOPR_INST_DATE());
		//�������l:�m��ƌn��ʎd�|�n."��ƌn��ʎd�|���l"
		puchStruct.setPUCH_ODR_COMMENT(puchStruct.getWORK_IN_PROC_COMMENT());
		//���[�g�����:�m��ƌn��ʎd�|�n."��ƌn��ʐ����[��"
		puchStruct.setRATE_JUDGE_DATE(puchStruct.getWORK_ODR_DLV_DATE());
	
	
		//�����ԍ��̍̔�
		CollectNumber PUCH_CD = 
				new CollectNumber(CollectNumber.PUCH_CD,
					this.sysUSER_CD,
					this.sp.getProcId(),
					this.sysPLANT_CD);
		puchCd = PUCH_CD.getNo();
		puchStruct.setPUCH_ODR_CD(puchCd);
		struct.setPUCH_ODR_CD(puchCd);
	
		//�i�ڂ�蔭���c�ɓo�^����f�[�^���擾���A�ݒ肷��
		List insertList = new ArrayList();
		insertList = entity.mselectM_ITEM.read(conn, puchStruct);
		if (insertList.isEmpty()) {
			//�f�[�^�����݂��Ȃ�
			setErrorMessage("ZZ01101");
			setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
			setWarningSysLogMessage("V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
			setWarningSysLogMessage("M_ITEM.ITEM_CD", puchStruct.getl_ITEM_CD());//�i�ڃR�[�h
			return false;
		}
		AD0030030Struct insertStruct = new AD0030030Struct();
		insertStruct = (AD0030030Struct)insertList.get(0);
		setStandardItem(insertStruct);
	
		//�󋋕i�敪:�m�i�ځn."�󋋕i�敪"
		puchStruct.setSPL_ITEM_TYP(insertStruct.getSPL_ITEM_TYP());
				
		this.struct.setPLANT_CD(getsysPLANT_CD());
		// �󂯓���ۊǋ�̊���l�擾
		String strWhCd = ValidateWh.getDefaultRcv(conn, struct.getPLANT_CD(), puchStruct.getl_ITEM_CD());
		if("".equals(strWhCd)){
			//�f�[�^�����݂��Ȃ�
			setErrorMessage("AD10001");
			setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
			setWarningSysLogMessage("V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
			setWarningSysLogMessage("M_PLANT.PLANT_CD", struct.getPLANT_CD());
			setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.ITEM_CD", puchStruct.getl_ITEM_CD());
			return false;
		} else {
			puchStruct.setWH_CD(strWhCd);
		}
	
		//�����}�X�^��蔭���c�ɓo�^����f�[�^���擾���A�ݒ肷��
		insertList = new ArrayList();
		insertList = entity.mselectM_VEND_CTRL.read(conn, puchStruct);
		if (insertList.isEmpty()) {
			//�f�[�^�����݂��Ȃ�
			setErrorMessage("ZZ01101");
			setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
			setWarningSysLogMessage("V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
			setWarningSysLogMessage("M_VEND_CTRL.VEND_CD", puchStruct.getVEND_CD());//�����R�[�h
			return false;
		}
	
		insertStruct = new AD0030030Struct();
		insertStruct = (AD0030030Struct)insertList.get(0);
		setStandardItem(insertStruct);
	
		//�����S����
		puchStruct.setPUCH_ODR_PERSON("");
		//�בփ��[�g
		puchStruct.setEXCH_TYP(insertStruct.getEXCH_TYP());
		//�ʉ݃R�[�h
		puchStruct.setCUR_CD(insertStruct.getCUR_CD());
	
	
		try {
			// ����ŏ����擾
			TaxStruct ts =
				TaxControl.getData(
					this.conn,
					puchStruct.getCOMPANY_CD(),
					puchStruct.getVEND_CD(),
					puchStruct.getITEM_CD(),
					puchStruct.getPUCH_ODR_DLV_DATE()); //�����[��
	
			//�ŃR�[�h:"����ŃR�[�h
			puchStruct.setTAX_CD(ts.getTAX_CD());
			//�Œ[���敪:[�����]�D"���z�܂�ߋ敪
			puchStruct.setTAX_ROUND_TYP(ts.getTAX_ROUND_TYP());
	
			// TAX_CD�̉�1����1�ȊO�̏ꍇ�͐ŗ���0�Ƃ���B
			String lowerTaxCd =
				ts.getTAX_CD().substring(ts.getTAX_CD().length() - 1);
			if ("1".equals(lowerTaxCd)) {
				puchStruct.setTAX_RATE_1(ts.getTAX_RATE_1());
				puchStruct.setTAX_RATE_2(ts.getTAX_RATE_2());
				puchStruct.setTAX_RATE_3(ts.getTAX_RATE_3());
			} else {
				puchStruct.setTAX_RATE_1("0.0");
				puchStruct.setTAX_RATE_2("0.0");
				puchStruct.setTAX_RATE_3("0.0");
			}
		} catch (DataNotFoundException e) {
			//�Œ[���敪
			puchStruct.setTAX_ROUND_TYP("1");
			puchStruct.setTAX_RATE_1("0.0");
			puchStruct.setTAX_RATE_2("0.0");
			puchStruct.setTAX_RATE_3("0.0");
		}
	
	
		try {
			roundTyp = "";
			// �ʉݏ����擾
			CurStruct cs =
				CurControl.getData(
					this.conn,
					puchStruct.getCOMPANY_CD(),
					puchStruct.getVEND_CD());
	
			roundTyp = cs.getROUND_TYP();
			puchStruct.setVEND_DECIMAL_FIG(cs.getDECIMAL_FIG());
	
	
		} catch (DataNotFoundException e) {
			setErrorMessage("ZZ01101");
			setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
			setWarningSysLogMessage("V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
			setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
			return false;
		}
	
		if (!("2".equals(puchStruct.getEXCH_TYP()))) {
			try{
				// �בփ��[�g�����擾
				ExchRateStruct ers =
					ExchRateControl.getData(
						this.conn,
						puchStruct.getCOMPANY_CD(),
						puchStruct.getCUR_CD(),
						puchStruct.getEXCH_TYP(),
						null,
						puchStruct.getPUCH_ODR_DLV_DATE());
	
				puchStruct.setEXCH_RATE(ers.getEXCH_RATE());
	
			} catch (DataNotFoundException e) {
				//���[�g�����	NULL
				puchStruct.setRATE_JUDGE_DATE("");
				// �בփ��[�g	0
				puchStruct.setEXCH_RATE("0");
				// �M�݋��z	0
				puchStruct.setHOME_CUR_AMOUNT("0");
			}
		} else {
			//���[�g�����	NULL
			puchStruct.setRATE_JUDGE_DATE("");
			// �בփ��[�g	0
			puchStruct.setEXCH_RATE("0");
			// �M�݋��z	0
			puchStruct.setHOME_CUR_AMOUNT("0");
		}
	
	
		// �{�̋��z�̌v�Z
		String netAmount =
				AmountCalculator.calcNetAmount(
					puchStruct.getPUCH_ODR_AMOUNT(),
					puchStruct.getDISC_AMOUNT());
		puchStruct.setNET_AMOUNT(netAmount);
		// �Ŋz�P�̌v�Z
		String taxAmount1 =
				AmountCalculator.calcTaxAmount(
					puchStruct.getNET_AMOUNT(),
					puchStruct.getTAX_RATE_1(),
					puchStruct.getTAX_ROUND_TYP(),
					puchStruct.getVEND_DECIMAL_FIG());
		puchStruct.setTAX_AMOUNT_1(taxAmount1);
		// �Ŋz�Q�̌v�Z
		String taxAmount2 =
				AmountCalculator.calcTaxAmount(
					puchStruct.getNET_AMOUNT(),
					puchStruct.getTAX_RATE_2(),
					puchStruct.getTAX_ROUND_TYP(),
					puchStruct.getVEND_DECIMAL_FIG());
		puchStruct.setTAX_AMOUNT_2(taxAmount2);
		// �Ŋz�R�̌v�Z
		String taxAmount3 =
				AmountCalculator.calcTaxAmount(
					puchStruct.getNET_AMOUNT(),
					puchStruct.getTAX_RATE_3(),
					puchStruct.getTAX_ROUND_TYP(),
					puchStruct.getVEND_DECIMAL_FIG());
		puchStruct.setTAX_AMOUNT_3(taxAmount3);
		// �ō����z�̌v�Z
		String amountIncludeTax =
				AmountCalculator.calcAmountIncludeTax(
					puchStruct.getNET_AMOUNT(),
					puchStruct.getTAX_AMOUNT_1(),
					puchStruct.getTAX_AMOUNT_2(),
					puchStruct.getTAX_AMOUNT_3());
		puchStruct.setAMOUNT_INCLUDE_TAX(amountIncludeTax);
	
	
		//�ב֎�ʂ��Q�̏ꍇ�A���[�j���O
		if ("2".equals(puchStruct.getEXCH_TYP())) {
	
			//���[�g�����	NULL
			puchStruct.setRATE_JUDGE_DATE("");
			// �בփ��[�g	0
			puchStruct.setEXCH_RATE("0");
			// �M�݋��z	0
			puchStruct.setHOME_CUR_AMOUNT("0");
			setWarningMessage("AD00098");
			setWarningMessage("AD00099", puchStruct.getPUCH_ODR_CD(), puchStruct.getVEND_CD());
			setInfoSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
			setInfoSysLogMessage("V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
		
		} else {
			//�M�݋��z
			String homeCurAmount =
					AmountCalculator.calcHomeCurAmount(
						puchStruct.getAMOUNT_INCLUDE_TAX(),
						puchStruct.getEXCH_RATE(),
						roundTyp,
						this.sysHomeCurStruct.getDECIMAL_FIG());
			puchStruct.setHOME_CUR_AMOUNT(homeCurAmount);
		}
	
		//�����c�ɓo�^����B
		entity.minsertT_RLSD_PUCH_ODR.create(conn, puchStruct);

		return true;
	}

	/**
	 * �o�Ɏw���������s���܂��B
	 * @param selectedStruct �I���X�V�̑Ώۍs�̃f�[�^
	 * @throws FoundationException
	 * @throws SQLException
	 * @throws ParseException
	 */
	private void insertIssue(AD0030030Struct selectedStruct) 
			throws FoundationException, SQLException, ParseException { 
			
		//�o�Ɏw�������i����j
		_debugParentCount += 1;
		List issueList = new ArrayList();
		AD0030030Struct issueStruct = new AD0030030Struct();
		//�V�X�e���p�����[�^�d�������擾
		List sysList = entity.mselectSYS_SPOIL_FLG.read(conn, struct);
		AD0030030Struct spoilStruct = (AD0030030Struct)sysList.get(0);
		String SPOIL_FLG = spoilStruct.getSPOIL_FLG();
					
		//���v�ʃf�[�^�̓Ǎ�
		List tOdList = new ArrayList();
		tOdList = entity.mreadT_OD.read(conn,struct);
		AD0030030Struct tOdStruct = new AD0030030Struct();
		List tOdList2 = new ArrayList();
		AD0030030Struct tOdStruct2 = new AD0030030Struct();

		//���v�ʂ̃f�[�^�����݂��Ȃ��ꍇ�A�o�Ɏw�������͍s��Ȃ��B
		if (tOdList != null || tOdList.size() > 0) {
			int childCount = 0;
			for (int j = 0; tOdList != null && tOdList.size() > j; j++) {
				issueStruct = new AD0030030Struct();
				setStandardItem(issueStruct);
									
				tOdStruct = (AD0030030Struct)tOdList.get(j);
				setStandardItem(tOdStruct);
								
				//�[���i�ڂ̏ꍇ
				if ("8".equals(tOdStruct.getMRP_ODR_TYP())) {
					//�I�[�_�f�}���h�ԍ�
					issueStruct.setOD_NO(tOdStruct.getOD_NO());
					// �i�ڔԍ�
					issueStruct.setITEM_CD(tOdStruct.getITEM_CD());
					// ���i�\���Ő�
					issueStruct.setPS_EDITION(tOdStruct.getPS_EDITION());
					// ���i�\���P�ʐ�
					issueStruct.setPS_UNIT_QTY(tOdStruct.getPS_UNIT_QTY());
					// ���i�\���P�ʐ�����
					issueStruct.setPS_UNIT_DENOMINATOR(tOdStruct.getPS_UNIT_DENOMINATOR());
					// ���i�\���P�ʐ����q
					issueStruct.setPS_UNIT_NUMERATOR(tOdStruct.getPS_UNIT_NUMERATOR());
					//�\���d����
					issueStruct.setPS_SPOIL(tOdStruct.getPS_SPOIL());
					// �o�Ɏw���敪(�i�ڎ�z�敪)
					issueStruct.setMRP_ODR_TYP("9");
					// �[���i�ړW�J�t���O(0:OFF,1:ON)
					issueStruct.setODINFO_DISGUISE("0");
					// �e�I�[�_�f�}���h�ԍ�
					issueStruct.setPARENT_OD_NO(tOdStruct.getPARENT_OD_NO());
					// ���v�ʏo�ɋ敪
					issueStruct.setISSUE_TYP(tOdStruct.getISSUE_TYP());
					// ���v�ʍH��R�[�h
					issueStruct.setPLANT_CD(tOdStruct.getPLANT_CD());
					// �o�ɗ\���
					issueStruct.setSCDL_ISSUE_DATE(tOdStruct.getDUE_DATE());
					
					issueList.add(issueStruct);
					_debugAllCount += 1;
					
					//���v�ʃf�[�^�̓Ǎ�
					tOdList2 = entity.mSelectT_ODChild.read(conn, tOdStruct);
					for (int k = 0; tOdList2.size() > k; k++) {
						tOdStruct2 = (AD0030030Struct)tOdList2.get(k);
						setStandardItem(tOdStruct2);
					
						issueStruct = new AD0030030Struct();
						setStandardItem(issueStruct);
										
						//�I�[�_�f�}���h�ԍ�
						issueStruct.setOD_NO(tOdStruct2.getOD_NO());
						// �i�ڔԍ�
						issueStruct.setITEM_CD(tOdStruct2.getITEM_CD());
						// ���i�\���Ő�
						issueStruct.setPS_EDITION(tOdStruct2.getPS_EDITION());
						// ���i�\���P�ʐ�
						issueStruct.setPS_UNIT_QTY(tOdStruct2.getPS_UNIT_QTY());
						// ���i�\���P�ʐ�����
						issueStruct.setPS_UNIT_DENOMINATOR(tOdStruct2.getPS_UNIT_DENOMINATOR());
						// ���i�\���P�ʐ����q
						issueStruct.setPS_UNIT_NUMERATOR(tOdStruct2.getPS_UNIT_NUMERATOR());
						//�\���d����
						issueStruct.setPS_SPOIL(tOdStruct2.getPS_SPOIL());
						// �o�Ɏw���敪(�i�ڎ�z�敪)
						issueStruct.setMRP_ODR_TYP("1");
						// �[���i�ړW�J�t���O(0:OFF,1:ON)
						issueStruct.setODINFO_DISGUISE("1");
						// �e�I�[�_�f�}���h�ԍ�
						issueStruct.setPARENT_OD_NO(tOdStruct2.getPARENT_OD_NO());
						// ���v�ʏo�ɋ敪
						issueStruct.setISSUE_TYP(tOdStruct2.getISSUE_TYP());
						// ���v�ʍH��R�[�h
						issueStruct.setPLANT_CD(tOdStruct2.getPLANT_CD());
						// �o�ɗ\���
						issueStruct.setSCDL_ISSUE_DATE(tOdStruct2.getDUE_DATE());
					
						issueList.add(issueStruct);
						_debugAllCount += 1;
						childCount++;
					}
									
				//�[���i�ڈȊO	
				} else {
					//�I�[�_�f�}���h�ԍ�
					issueStruct.setOD_NO(tOdStruct.getOD_NO());
					// �i�ڔԍ�
					issueStruct.setITEM_CD(tOdStruct.getITEM_CD());
					// ���i�\���Ő�
					issueStruct.setPS_EDITION(tOdStruct.getPS_EDITION());
					// ���i�\���P�ʐ�
					issueStruct.setPS_UNIT_QTY(tOdStruct.getPS_UNIT_QTY());
					// ���i�\���P�ʐ�����
					issueStruct.setPS_UNIT_DENOMINATOR(tOdStruct.getPS_UNIT_DENOMINATOR());
					// ���i�\���P�ʐ����q
					issueStruct.setPS_UNIT_NUMERATOR(tOdStruct.getPS_UNIT_NUMERATOR());
					//�\���d����
					issueStruct.setPS_SPOIL(tOdStruct.getPS_SPOIL());
					// �o�Ɏw���敪(�i�ڎ�z�敪)
					issueStruct.setMRP_ODR_TYP("1");
					// �[���i�ړW�J�t���O(0:OFF,1:ON)
					issueStruct.setODINFO_DISGUISE("0");
					// �e�I�[�_�f�}���h�ԍ�
					issueStruct.setPARENT_OD_NO(tOdStruct.getPARENT_OD_NO());
					// ���v�ʏo�ɋ敪
					issueStruct.setISSUE_TYP(tOdStruct.getISSUE_TYP());
					// ���v�ʍH��R�[�h
					issueStruct.setPLANT_CD(tOdStruct.getPLANT_CD());
					// �o�ɗ\���
					issueStruct.setSCDL_ISSUE_DATE(tOdStruct.getDUE_DATE());
					
					issueList.add(issueStruct);
					_debugAllCount += 1;
					childCount++;
				}
			}
					
			int LNumCntCurr = 0;
			String LNumPARENT_OD_NoTemp = "";
			int LNumCntCurr_ISSUE_INST = 0;
					
			while (issueList.size() > LNumCntCurr) {
				AD0030030Struct insertStruct = new AD0030030Struct();
				setStandardItem(insertStruct);
				issueStruct = (AD0030030Struct)issueList.get(LNumCntCurr);
				setStandardItem(issueStruct);
								
				//��ƌv��ʏo�Ɍv��f�[�^�̏o�Ɏw���敪�F�P(�ʏ�o�Ɍv��)�̏ꍇ�ΏۊO
				if (!("1".equals(issueStruct.getMRP_ODR_TYP()))) {
					LNumCntCurr++;
					_debugAllCount--;
					continue;
				}
					
				//�ǉ��f�[�^�̃Z�b�g
				// �H��R�[�h
				insertStruct.setPLANT_CD(getsysPLANT_CD());
				// �I�[�_�f�}���h�ԍ�
				insertStruct.setOD_NO(issueStruct.getOD_NO());
				// �i�ڔԍ�
				insertStruct.setl_ITEM_CD(issueStruct.getITEM_CD());
				// ���i�\���Ő�
				insertStruct.setPS_EDITION(issueStruct.getPS_EDITION());
				// �����ԍ�
				insertStruct.setPUCH_ODR_CD(null);
				// ��ƌv��ԍ�
				insertStruct.setWORK_ODR_CD(this.struct.getWORK_ODR_CD());
				insertStruct.setWORK_IN_PROC_CD(null);  
					
				//�[���i�ړW�J�t���O�F�P�i�n�m�j
				if ("1".equals(issueStruct.getODINFO_DISGUISE())) {
					LNumPARENT_OD_NoTemp = issueStruct.getPARENT_OD_NO();
					LNumCntCurr_ISSUE_INST = 0;
					
					AD0030030Struct issueChildStruct = new AD0030030Struct();
					do {
						issueChildStruct = new AD0030030Struct();
						issueChildStruct = 
								(AD0030030Struct)issueList.get(LNumCntCurr_ISSUE_INST);
						setStandardItem(issueChildStruct);
										
						BigDecimal PsUnitQtyLNCC = 
								new BigDecimal(issueStruct.getPS_UNIT_QTY());
						BigDecimal PsUnitQtyLNCCII = 
								new BigDecimal(issueChildStruct.getPS_UNIT_QTY());
						BigDecimal PsUnitDenominatorLNCC = 
								new BigDecimal(issueStruct.getPS_UNIT_DENOMINATOR());
						BigDecimal PsUnitDenominatorLNCCII = 
								new BigDecimal(issueChildStruct.getPS_UNIT_DENOMINATOR());
						BigDecimal PsUnitNumeratorLNCC = 
								new BigDecimal(issueStruct.getPS_UNIT_NUMERATOR());
						BigDecimal PsUnitNumeratorLNCCII = 
								new BigDecimal(issueChildStruct.getPS_UNIT_NUMERATOR());
						BigDecimal OprInstQty = 
								new BigDecimal(selectedStruct.getOPR_INST_QTY());
						BigDecimal PsSpoil  =
						    new BigDecimal(issueStruct.getPS_SPOIL());
					
						if (LNumPARENT_OD_NoTemp.equals(issueChildStruct.getOD_NO())) {
							//�e�i�ڂ̍݌ɐ��P�ʋ敪���擾
							AD0030030Struct tempStruct = new AD0030030Struct();
							tempStruct.setl_ITEM_CD(issueChildStruct.getITEM_CD());
							List issueChildList = entity.mPuchOdrInst_UNIT_QTY_TYP.read(conn, tempStruct);
							String CHILD_UNIT_QTY_TYP = ((AD0030030Struct)issueChildList.get(0)).getUNIT_QTY_TYP();
							
							//�q�i�ڂ̍݌ɐ��P�ʋ敪���擾
							List unitList = new ArrayList();
							unitList = 
									entity.mPuchOdrInst_UNIT_QTY_TYP.read(conn, insertStruct);
									
							AD0030030Struct unitStruct = new AD0030030Struct();
							unitStruct = (AD0030030Struct)unitList.get(0);
							setStandardItem(unitStruct);
					
							//�o�ɒP�ʐ� = �e�f�[�^.�o�ɒP�ʐ� * �q�f�[�^�o�ɒP�ʐ�
							//������T�ʐ؏グ
							BigDecimal issue_inst_unit_qty = 
									(PsUnitQtyLNCC.multiply(PsUnitQtyLNCCII));
					
							issue_inst_unit_qty = 
									issue_inst_unit_qty.setScale(4, BigDecimal.ROUND_UP);
							insertStruct.setISSUE_INST_UNIT_QTY(
									issue_inst_unit_qty.toString());
					
							//�o�ɒP�ʐ����� = �e�f�[�^.�o�ɒP�ʐ�����
							//                 * �q�f�[�^�o�ɒP�ʐ�����
							//������T�ʐ؏グ
					
							BigDecimal issue_inst_unit_denominator = 
									(PsUnitDenominatorLNCC.multiply(PsUnitDenominatorLNCCII));
							issue_inst_unit_denominator
									= issue_inst_unit_denominator.setScale(4, BigDecimal.ROUND_UP);
							insertStruct.setISSUE_INST_UNIT_DENOMINATOR(
									issue_inst_unit_denominator.toString());
					
							//�o�ɒP�ʐ����q = �e�f�[�^.�o�ɒP�ʐ����q 
							//                 * �q�f�[�^�o�ɒP�ʐ�����
							//������T�ʐ؏グ
					
							BigDecimal issue_inst_unit_numerator = 
									(PsUnitNumeratorLNCC.multiply(PsUnitNumeratorLNCCII));
							issue_inst_unit_numerator = 
									issue_inst_unit_numerator.setScale(4, BigDecimal.ROUND_UP);
							insertStruct.setISSUE_INST_UNIT_NUMERATOR(
									issue_inst_unit_numerator.toString());
					
							BigDecimal issue_inst_qty = new BigDecimal("0");
							
							if("1".equals(CHILD_UNIT_QTY_TYP)){
								//�e�i�ڏo�Ɏw����
								issue_inst_qty =(((OprInstQty.multiply(
											PsUnitNumeratorLNCCII)).divide(PsUnitDenominatorLNCCII,10, BigDecimal.ROUND_UP))).setScale(0,BigDecimal.ROUND_UP);
							}else{
								//�e�i�ڏo�Ɏw����
								issue_inst_qty =(((OprInstQty.multiply(
											PsUnitNumeratorLNCCII)).divide(PsUnitDenominatorLNCCII,10, BigDecimal.ROUND_UP))).setScale(4,BigDecimal.ROUND_UP);
							}
							
							//�݌ɐ��ʒP�ʐ��敪�@�P�F�����Ǘ�
							if ("1".equals(unitStruct.getUNIT_QTY_TYP())) {					
								if ("1".equals(SPOIL_FLG)){
									//�q�i�ڏo�Ɏw����
									issue_inst_qty =(((issue_inst_qty.multiply((PsSpoil.divide(
												new BigDecimal(100), 10,BigDecimal.ROUND_UP)).add(new BigDecimal(1))).multiply(
												PsUnitNumeratorLNCC)).divide(PsUnitDenominatorLNCC,10, BigDecimal.ROUND_UP))).setScale(0,BigDecimal.ROUND_UP);
								}else{
									//�q�i�ڏo�Ɏw����
									issue_inst_qty =(((issue_inst_qty.multiply(
												PsUnitNumeratorLNCC)).divide(PsUnitDenominatorLNCC,10, BigDecimal.ROUND_UP))).setScale(0,BigDecimal.ROUND_UP);
								}
								//�����؏グ
								insertStruct.setISSUE_INST_QTY(issue_inst_qty.toString());
					
							//�݌ɐ��ʒP�ʐ��敪�@�Q�F�����Ǘ�
							} else {			
								if ("1".equals(SPOIL_FLG)){
									//�q�i�ڏo�Ɏw����
									issue_inst_qty =(((issue_inst_qty.multiply((PsSpoil.divide(
												new BigDecimal(100), 10,BigDecimal.ROUND_UP)).add(new BigDecimal(1))).multiply(
												PsUnitNumeratorLNCC)).divide(PsUnitDenominatorLNCC,10, BigDecimal.ROUND_UP))).setScale(4,BigDecimal.ROUND_UP);
								}else{
									//�q�i�ڏo�Ɏw����
									issue_inst_qty =(((issue_inst_qty.multiply(
												PsUnitNumeratorLNCC)).divide(PsUnitDenominatorLNCC,10, BigDecimal.ROUND_UP))).setScale(4,BigDecimal.ROUND_UP);
								}
								////������T�ʐ؏グ�؏グ
								insertStruct.setISSUE_INST_QTY(issue_inst_qty.toString());
							}
						}
						LNumCntCurr_ISSUE_INST++;
	
					} while (LNumPARENT_OD_NoTemp.equals(issueChildStruct.getOD_NO())
							|| LNumCntCurr_ISSUE_INST < issueList.size());
					
					LNumCntCurr_ISSUE_INST=0;
					
				//�[���i�ړW�J�t���O�F�O�i�n�e�e�j
				} else {
					
					BigDecimal issue_inst_unit_qty = 
							new BigDecimal(issueStruct.getPS_UNIT_QTY());
					BigDecimal issue_inst_unit_numerator   = 
							new BigDecimal(issueStruct.getPS_UNIT_NUMERATOR());
					BigDecimal issue_inst_unit_denominator = 
							new BigDecimal(issueStruct.getPS_UNIT_DENOMINATOR());
				    BigDecimal PsSpoil  =
				            new BigDecimal(issueStruct.getPS_SPOIL());
					BigDecimal OprInstQty                  = 
							new BigDecimal(selectedStruct.getOPR_INST_QTY());
					
					//�o�Ɏw���P�ʐ�
					insertStruct.setISSUE_INST_UNIT_QTY(issue_inst_unit_qty.toString());
					
					//�o�ɒP�ʐ�����
					insertStruct.setISSUE_INST_UNIT_DENOMINATOR(
							issue_inst_unit_denominator.toString());
					
					//�o�ɒP�ʐ����q
					insertStruct.setISSUE_INST_UNIT_NUMERATOR(
							issue_inst_unit_numerator.toString());
					
					List unitList = new ArrayList();
					unitList = entity.mPuchOdrInst_UNIT_QTY_TYP.read(conn,insertStruct);
					AD0030030Struct unitStruct = new AD0030030Struct();
					unitStruct = (AD0030030Struct)unitList.get(0);
					setStandardItem(unitStruct);
					
					if ("1".equals(SPOIL_FLG)){
						
                        /*���v�ʍ\���d����*/
						OprInstQty =OprInstQty.multiply((PsSpoil.divide(
								new BigDecimal(100), 10, BigDecimal.ROUND_UP)).add(new BigDecimal(1)));
					} 
					//�o�Ɏw���� =   �����w���� * �o�ɒP�ʐ����q / �o�ɒP�ʐ�����
					BigDecimal issue_inst_qty = 
							(OprInstQty.multiply
							(issue_inst_unit_numerator)).divide
							(issue_inst_unit_denominator, 10, BigDecimal.ROUND_UP);
					
					//�݌ɐ��ʒP�ʋ敪�@�P�F�����Ǘ�
					if ("1".equals(unitStruct.getUNIT_QTY_TYP())) {
						insertStruct.setISSUE_INST_QTY(
								issue_inst_qty.setScale(0,BigDecimal.ROUND_UP).toString());
					
					//�݌ɐ��ʒP�ʋ敪�@�Q�F�����Ǘ�
					} else {
						//������T�ʐ؏グ
						insertStruct.setISSUE_INST_QTY(
								issue_inst_qty.setScale(4,BigDecimal.ROUND_UP).toString());
					}
				}

				insertStruct.setWORK_ODR_CD(this.struct.getWORK_ODR_CD());
				insertStruct.setWORK_IN_PROC_CD(this.struct.getWORK_IN_PROC_CD());
				insertStruct.setl_OPR_RSLT_TYP(selectedStruct.getl_OPR_RSLT_TYP());
				insertStruct.setl_WS_CD(selectedStruct.getl_WS_CD());
				insertStruct.setOUTSIDE_TYP(selectedStruct.getOUTSIDE_TYP());
				insertStruct.setVEND_CD(selectedStruct.getVEND_CD());
				insertStruct.setPLANT_CD(selectedStruct.getPLANT_CD());
				insertStruct.setPROC_NO(selectedStruct.getPROC_NO());			
				if ("2".equals(insertStruct.getl_OPR_RSLT_TYP())) {
					insertStruct.setPUCH_ODR_CD(puchCd);
					insertStruct.setWORK_IN_PROC_CD(this.struct.getWORK_IN_PROC_CD());
				}
				// �o�ɗ݌v��
				insertStruct.setTOTAL_ISSUE_QTY("0");
				// �o�ɗ\���
				insertStruct.setSCDL_ISSUE_DATE(issueStruct.getSCDL_ISSUE_DATE());
				// �o�Ɋ�����
				insertStruct.setISSUE_CMPLT_DATE("");
				// ���v�ʏo�ɋ敪
				insertStruct.setISSUE_TYP(issueStruct.getISSUE_TYP());
				// �o�Ɋ����t���O
				insertStruct.setISSUE_CMPLT_FLG("0");
				// �o�Ɏw�������s�ς݃t���O
				insertStruct.setISSUE_INST_ISS_FLG("0"); 
				// �o�Ɏw�������s��
				insertStruct.setISSUE_INST_ISS_DATE("");
				// �o�Ɏw�����l
				insertStruct.setISSUE_INST_COMMENT("");  

					
				//�ǉ����擾
				//(��Ƌ�A��ЃR�[�h�A�����R�[�h�A�ۊǏꏊ�R�[�h�A�x���敪)
				AD0030030Struct keyStruct = new AD0030030Struct();
				setStandardItem(keyStruct);
	
				keyStruct.setWORK_ODR_CD(this.struct.getWORK_ODR_CD());
				keyStruct.setWORK_IN_PROC_CD(this.struct.getWORK_IN_PROC_CD());
				keyStruct.setITEM_CD(issueStruct.getITEM_CD());
	
				List addList = new ArrayList();
				if ("1".equals(selectedStruct.getl_OPR_RSLT_TYP())) {
					//�o�������т̏ꍇ�A�i�ڕʎd�|�̌���
					addList = entity.mSelectBeforeWorkItem.read(conn,keyStruct);
					if (addList.isEmpty()) {
					
						insertStruct.setWS_CD("");//��Ƌ�R�[�h
						insertStruct.setWH_CD("");//�ۊǋ�R�[�h
						insertStruct.setCONS_TYP("0");//�x���敪
					} else {
						AD0030030Struct addStruct = new AD0030030Struct();
						addStruct = (AD0030030Struct)addList.get(0);
						setStandardItem(addStruct);
	
						insertStruct.setWS_CD(addStruct.getWS_CD());//��Ƌ�R�[�h
						insertStruct.setWH_CD(addStruct.getWH_CD());//�ۊǋ�R�[�h
						insertStruct.setCONS_TYP("0");//�x���敪
					}
					
				} else {
					//��Ǝw���̏ꍇ�A��ƌn��ʎd�|�̌���
					addList = new ArrayList();
					addList = entity.mSelectBeforeWorkProc.read(conn, keyStruct);
					
					if ("1".equals(selectedStruct.getOUTSIDE_TYP())) {
						//����
						if (addList != null && addList.size() != 0) {
							AD0030030Struct addStruct = (AD0030030Struct)addList.get(0);
							setStandardItem(addStruct);
							insertStruct.setWS_CD(addStruct.getWS_CD());//��Ƌ�R�[�h
							insertStruct.setWH_CD(addStruct.getWH_CD());//�ۊǋ�R�[�h
							insertStruct.setCONS_TYP("0");
						}
					} else {
						//�O��
						AD0030030Struct addStruct = new AD0030030Struct();
						if(addList != null && addList.size() != 0){
							addStruct = (AD0030030Struct)addList.get(0);
							setStandardItem(addStruct);
							//��ЃR�[�h
							insertStruct.setCOMPANY_CD(addStruct.getCOMPANY_CD());
							//�����R�[�h
							insertStruct.setVEND_CD(addStruct.getVEND_CD());
						}
						//�d�|��ƃR�[�h�A�ۊǋ�R�[�h�A�x���敪�̎擾
						keyStruct.setCOMPANY_CD(addStruct.getCOMPANY_CD());
						keyStruct.setVEND_CD(addStruct.getVEND_CD());
										
						addList = new ArrayList();
						addList = entity.mSelectBeforeWorkProcSec.read(conn, keyStruct);
						if (addList != null && addList.size() != 0) {
							addStruct = new AD0030030Struct();
							addStruct = (AD0030030Struct)addList.get(0);
							setStandardItem(addStruct);
	
							insertStruct.setWORK_IN_PROC_CD(addStruct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
							insertStruct.setWH_CD(addStruct.getWH_CD());//�ۊǋ�R�[�h
					
						}
						
						// �H��R�[�h
						keyStruct.setPLANT_CD(addStruct.getPLANT_CD());
						// �o�ɗ\���
						keyStruct.setEFF_PHASE_IN_DATE(insertStruct.getSCDL_ISSUE_DATE());
					
						insertStruct.setCONS_TYP("0");//�x���敪
					}
				}

// ���� 2008/08/11 ADD START -TSUCHIDA����
				List manhourTypList = new ArrayList();
				manhourTypList = entity.mselectMANHOUR_TYP.read(conn, insertStruct);
				// �H���Ǘ��i�ڋ敪���P�ȊO�̏ꍇ�A�o�Ɏw���ǉ�����
				if (manhourTypList != null && manhourTypList.size() != 0) {
				
// ���� 2008/08/11 ADD END -TSUCHIDA����
				//�o�Ɏw���ԍ��̔�
				CollectNumber ISS_INST_CD = 
						new CollectNumber(
						CollectNumber.ISS_INST_CD,
						this.sysUSER_CD,
						this.sp.getProcId(),
						this.sysPLANT_CD);
				String issueInstCd = ISS_INST_CD.getNo();
				insertStruct.setISSUE_INST_CD(issueInstCd);
					
				//�o�Ɏw���ǉ�
				entity.minsertT_ISSUE_INST.create(conn, insertStruct);
// ���� 2008/08/11 ADD START -TSUCHIDA����
				}
// ���� 2008/08/11 ADD END -TSUCHIDA����
				LNumCntCurr++;
			}
		}
	}
    /** �R���{�{�b�N�X�f�[�^�擾�p�萔�@��Ǝ��ы敪 */
    private final static String OPR_RSLT_TYP_PARAMETER_NAME= "OPR_RSLT_TYP"; 
    
    /** �R���{�{�b�N�X�f�[�^�擾�p�萔�@�n����O��敪 */
    private final static String OUTSIDE_TYP_PARAMETER_NAME= "OUTSIDE_TYP"; 
   
    /** �R���{�{�b�N�X�f�[�^�擾�p�@��Ǝ��ы敪 */
    private ComboStruct OPR_RSLT_TYP = null;

    /** �R���{�{�b�N�X�f�[�^�擾�p�@�n����O��敪 */
    private ComboStruct OUTSIDE_TYP = null;
    
    private void othercomboTyp(AD0030030Struct aStruct) {

	 aStruct.setOPR_RSLT_TYP_DN(getDisplayName(OPR_RSLT_TYP, aStruct.getl_OPR_RSLT_TYP().toString()));
	 aStruct.setOUTSIDE_TYP_DN(getDisplayName(OUTSIDE_TYP, aStruct.getOUTSIDE_TYP().toString()));
  
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

	/**
	* ���������̂��߁A�������̐���
	* @param ���� 1:":"�t��
	* @param ����
	*/
	private String formatHMW(String inTime ,String inFlag){
			
			if(null == inTime || "".equals(inTime)){
				if("1".equals(inFlag)){
					return " 23:59" ;
				}else{
					return inTime;
				}
			}
			
			if(inTime.length() < 3 || inTime.length() > 4){
				if("1".equals(inFlag)){
					return " 23:59" ;
				}else{
					return inTime;
				}
			}
			
			if(inTime.length() ==  3 ){
				if("1".equals(inFlag)){
					return " 0" + inTime.substring(0,1) + ":" + inTime.substring(1);
				}else{
					return "0" + inTime;
				}
			}
			if("1".equals(inFlag)){
				return " " + inTime.substring(0,2) + ":" + inTime.substring(2);
			}
			return inTime;
	}	
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030030Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>


		try {
			struct.setHIDDEN_OPR_RSLT_TYP("");
			struct.setHIDDEN_OPR_RSLT_TYP2("");
			struct.setHIDDEN_OPR_RSLT_TYP3("");
			struct.setHIDDEN_OUTSIDE_TYP("");
			struct.setHIDDEN_OUTSIDE_TYP2("");
			struct.seth1_WS_CD(struct.getWS_CD());
			struct.seth2_WS_CD(struct.getWS_CD());
			struct.seth_VEND_CD(struct.getVEND_CD());


			//���o�����̍��ږ��̃Z�b�g
			AD0030030Struct tempStruct = new AD0030030Struct();
			List tempList = new ArrayList();
			
			if (this.struct.getITEM_CD() == null || this.struct.getITEM_CD().length() == 0) {
				this.struct.setITEM_NAME(null);
			} else {
				tempList = entity.mM_ITEM.read(conn, this.struct);
				if (tempList.isEmpty()) {
					this.struct.setITEM_NAME(null);
				} else {
					tempStruct = (AD0030030Struct)tempList.get(0);
					this.struct.setITEM_NAME(tempStruct.getITEM_NAME());
				}
			}
			if (this.struct.getWS_CD() == null || this.struct.getWS_CD().length() == 0) {
				this.struct.setWS_NAME(null);
			} else {
				tempList = entity.mM_WS.read(conn, this.struct);
				if (tempList.isEmpty()) {
					this.struct.setWS_NAME(null);
				} else {
					tempStruct = (AD0030030Struct)tempList.get(0);
					this.struct.setWS_NAME(tempStruct.getWS_NAME());
				}
			}
			if (this.struct.getVEND_CD() == null || this.struct.getVEND_CD().length() == 0) {
				this.struct.setVEND_ANAME(null);
			} else {
				tempList = entity.mM_VEND_CTRL.read(conn, this.struct);
				if (tempList.isEmpty()) {
					this.struct.setVEND_ANAME(null);
				} else {
					tempStruct = (AD0030030Struct)tempList.get(0);
					this.struct.setVEND_ANAME(tempStruct.getVEND_ANAME());
				}
			}


			//�T�[�o�`�F�b�N

			//�o�������э�ƌv�悪�I�����ꂽ�ꍇ�A���������ɓ����
			if ("true".equals(struct.getc_OUTPUT_RSLT())) {
				struct.setHIDDEN_OPR_RSLT_TYP("1");
			} else {
				struct.setHIDDEN_OPR_RSLT_TYP(null);
				struct.seth1_WS_CD(null);
			}
			//��Ǝw���v��i����j���I�����ꂽ�ꍇ�A���������ɓ����
			if ("true".equals(struct.getc_OUTSIDE_TYP_IN())) {
				struct.setHIDDEN_OUTSIDE_TYP("1");
				struct.setHIDDEN_OPR_RSLT_TYP2("2");			  	
			} else {
				struct.setHIDDEN_OUTSIDE_TYP(null);
				struct.seth2_WS_CD(null);
			}
			//��Ǝw���v��i�O��j���I�����ꂽ�ꍇ�A���������ɓ����
			if ("true".equals(struct.getc_OUTSIDE_TYP_OUT())) {
				struct.setHIDDEN_OUTSIDE_TYP2("2");
				struct.setHIDDEN_OPR_RSLT_TYP3("2");
				//�����R�[�h
				if (struct.getVEND_CD() == null || "".equals(struct.getVEND_CD())) {
					struct.setVEND_CD(null);
				} else {
					struct.setVEND_CD(struct.getVEND_CD());
				}				
			} else {
				struct.setHIDDEN_OUTSIDE_TYP2(null);
				struct.seth_VEND_CD(null);
			}

			//�S�Ă��`�F�b�N����Ă��Ȃ��ꍇ
			if (!("true".equals(struct.getc_OUTPUT_RSLT()))
					&& !("true".equals(struct.getc_OUTSIDE_TYP_IN()))
					&& !("true".equals(struct.getc_OUTSIDE_TYP_OUT()))) {
				struct.setHIDDEN_OPR_RSLT_TYP("-1"); //�����擾���Ȃ�
			}
		
			//�H��R�[�h��ݒ肷��
			this.struct.setPLANT_CD(this.sysPLANT_CD);
			if (this.struct.getr1_FILTER1() != null 
					&& "true".equals(this.struct.getr1_FILTER1())) {
				Date dtOprInstStartDate = 
						df.parse(this.struct.getOPR_INST_START_DATE());
				String strOprInstStartDate = 
						Converter.dateToStr(dtOprInstStartDate, "yyyy/MM/dd");
				String strOprInstStartDateTime = formatHMW(this.struct.getOPR_INST_START_TIME() ,"1");
				this.struct.setOPR_INST_START_DATE_01(strOprInstStartDate + strOprInstStartDateTime);
				this.struct.setWORK_ODR_DLV_DATE_01(null);
				this.struct.setOPR_INST_START_TIME(formatHMW(this.struct.getOPR_INST_START_TIME() ,"0"));
			} else {
				Date dtWorkOorDlvDate = 
						df.parse(this.struct.getWORK_ODR_DLV_DATE());
				String strWorkOorDlvDate = 
						Converter.dateToStr(dtWorkOorDlvDate, "yyyy/MM/dd");
				String strWorkOorDlvDateTime = formatHMW(this.struct.getWORK_ODR_DLV_TIME() ,"1");
				this.struct.setOPR_INST_START_DATE_01(null);
				this.struct.setWORK_ODR_DLV_DATE_01(strWorkOorDlvDate + strWorkOorDlvDateTime);
				this.struct.setWORK_ODR_DLV_TIME(formatHMW(this.struct.getWORK_ODR_DLV_TIME() ,"0"));
			}
		


            // �ő�\���s��
            int maxLine = sp.getMaxLine(conn, 10);
			if(maxLine != 0) {
				struct.setROW_COUNT(String.valueOf(maxLine));
			} else {
				struct.setROW_COUNT(null);
			}
			list = new ArrayList();
			this.list = entity.mselectV_WORK_ODR_LSTCnt.read(conn, struct);
			long rowCount = Long.parseLong(((AD0030030Struct)list.get(0)).getl_COUNT()); 
			if (rowCount==0) {
				if (_messageSetFlg == 0) {
					//�f�[�^�����݂��Ȃ�
					setErrorMessage("ZZ06001");
					setWarningSysLogMessage("OPR_INST_START_DATE", this.struct.getOPR_INST_START_DATE());
					setWarningSysLogMessage("WORK_ODR_DLV_DATE", this.struct.getWORK_ODR_DLV_DATE());
					setWarningSysLogMessage("JOB_ODR_CD", this.struct.getJOB_ODR_CD());
					setWarningSysLogMessage("ITEM_CD", this.struct.getITEM_CD());
					setWarningSysLogMessage("WS_CD", this.struct.getWS_CD());
					setWarningSysLogMessage("VEND_CD", this.struct.getVEND_CD());
					setReadStatus(NOT_FOUND);
				} else {
					//�t���O��clear
					_messageSetFlg = 0;
				}
					if(list != null && list.size() > 0){
					list.clear();
				 }
					return;	
			}
			if (maxLine != 0 && rowCount == maxLine + 1) {
				setErrorMessage("ZZ01115", ""+maxLine);
				setWarningSysLogMessage("OPR_INST_START_DATE", this.struct.getOPR_INST_START_DATE());
				setWarningSysLogMessage("WORK_ODR_DLV_DATE", this.struct.getWORK_ODR_DLV_DATE());
				setWarningSysLogMessage("JOB_ODR_CD", this.struct.getJOB_ODR_CD());
				setWarningSysLogMessage("ITEM_CD", this.struct.getITEM_CD());
				setWarningSysLogMessage("WS_CD", this.struct.getWS_CD());
				setWarningSysLogMessage("VEND_CD", this.struct.getVEND_CD());
				setReadStatus(TOO_MANY);
				if(list != null && list.size() > 0){
					listClear();
				}	
				return;
				
			}	
			list = entity.mselectV_WORK_ODR_LST.read(conn, this.struct);
             AD0030030Struct TempStruct;
             for (int i = 0; i < list.size(); i++) {
		     TempStruct = (AD0030030Struct)list.get(i);
				
		     //�R���{�{�b�N�X�̎擾
		     othercomboTyp(TempStruct);
		    }		
			setReadStatus(NORMAL);
				
		} catch (ParseException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}		


                //}}user_implement_dev:<controlSelect>
		logger.exiting("AD0030030Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030030Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>


		//��ʂ̏�����
		initializeAll();
		//���X�g�̏�����
		listClear();
		try{
			// �V�X�e���p�����[�^�iTIME_CTRL�j�擾
			AD0030030Struct TIME_CTRLStruct = new AD0030030Struct();
			List TIME_CTRLList = entity.mreadTIME_CTRL.read(conn, TIME_CTRLStruct);
			if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
				TIME_CTRLStruct = (AD0030030Struct)TIME_CTRLList.get(0);
				struct.setTIME_CTRL(TIME_CTRLStruct.getTIME_CTRL());
			}else{
				struct.setTIME_CTRL("false");
			}

		} catch(SQLException e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			// 
		}

                //}}user_implement_dev:<controlClear>
		logger.exiting("AD0030030Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * �ꊇ�X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlUpdateAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030030Control"+":USER="+struct.getsUser_ID(),"controlUpdateAll");
			//{{user_implement_dev:<controlUpdateAll>


		try {
			//�o�b�`�Ɉ����n���l�̒�`
			String OprInstStartDate = null; //�����
			String WorkOdrDlvDate = null;   //�[��
			String JobOdrCd = null;         //����
			String ItemCd = null;           //�i�ڔԍ�
			String WsCd = null;             //��Ƌ�R�[�h
			String OprRsltTyp = null;       //��Ǝ��ы敪
			String OutSideTyp = null;       //��Ǝw���v��i����j
			String OutSideTyp2 = null;      //��Ǝw���v��i�O��j
			String VendCd = null;           //�����R�[�h
			//�o�b�`�����敪�F 1: ��ԃo�b�`�i�����^�]�j 2: �}�j���A���i�����^�]�Ȃ��j
			String batchProcessingTyp = "2";

			String strOprInstStartDateTime = formatHMW(this.struct.getOPR_INST_START_TIME() ,"1");
			String strWorkOorDlvDateTime = formatHMW(this.struct.getWORK_ODR_DLV_TIME() ,"1");
			// �����
			if (this.struct.getOPR_INST_START_DATE() == null
					|| "".equals(this.struct.getOPR_INST_START_DATE())) {
				OprInstStartDate = null;
			} else {
				OprInstStartDate = this.struct.getOPR_INST_START_DATE() + strOprInstStartDateTime.trim();
			}
			 
			// �[��
			if (this.struct.getWORK_ODR_DLV_DATE() == null
					|| "".equals(this.struct.getWORK_ODR_DLV_DATE())) {
				WorkOdrDlvDate = null;
			} else {
				WorkOdrDlvDate = this.struct.getWORK_ODR_DLV_DATE() + strWorkOorDlvDateTime.trim();
			}
			 
			// ����
			if (this.struct.getJOB_ODR_CD() == null
					|| "".equals(this.struct.getJOB_ODR_CD())) {
				JobOdrCd = null;
			} else {
				JobOdrCd = this.struct.getJOB_ODR_CD();
			}
		
			// �i�ڔԍ�
			if (this.struct.getITEM_CD() == null
					|| "".equals(this.struct.getITEM_CD())) {
				ItemCd = null;
			} else {
				ItemCd = this.struct.getITEM_CD();
			}
					
			// ��Ƌ�R�[�h
			if (this.struct.getWS_CD() == null
					|| "".equals(this.struct.getWS_CD())) {
				WsCd = null;
			} else {
				WsCd = this.struct.getWS_CD();
			}
			
			// ��Ǝ��ы敪
			if ("true".equals(struct.getc_OUTPUT_RSLT())) {
				OprRsltTyp = struct.getc_OUTPUT_RSLT();
			} else {
				OprRsltTyp = null;
			}

			// ��Ǝw���v��i����j
			if ("true".equals(struct.getc_OUTSIDE_TYP_IN())) {
				OutSideTyp = struct.getc_OUTSIDE_TYP_IN();
			} else {
				OutSideTyp = null;
			}
			
			// ��Ǝw���v��i�O��j
			if ("true".equals(struct.getc_OUTSIDE_TYP_OUT())) {
				OutSideTyp2 = struct.getc_OUTSIDE_TYP_OUT();
				//�����R�[�h
				if (struct.getVEND_CD() == null
						|| "".equals(struct.getVEND_CD())) {
					VendCd = null;
				} else {
					VendCd = this.struct.getVEND_CD();
				}
			} else {
				OutSideTyp2 = null;
				VendCd = null;
			}
			
			
			// �o�b�`���������s���� -------------------------------------------
			
			ResourceBundle bundle = SystemConfig.getBundle();
			String javaPath = SystemConfig.getProperty("JAVA_PATH", bundle);
			if (javaPath == null) {
				setErrorMessage("ZZ09010");
			}
			String ClassPath = SystemConfig.getProperty("CLASS_PATH", bundle);
			if (ClassPath == null) {
				setErrorMessage("ZZ09012");
			}
			String batchPath = SystemConfig.getProperty("BATCH_PATH", bundle);
			if (batchPath == null) {
				setErrorMessage("ZZ09011");
			}

			// �G���[������ΏI��
			if (msgStruct.hasError()) {
				setErrorMessage("ZZ09014");
				setReadStatus(ERROR);
				return;
			}

			try {
				StringBuffer cmd = new StringBuffer();
				cmd.append(javaPath);           // �i�u�l
				cmd.append(" -cp ");
				cmd.append(ClassPath);          //Java ClassPath
				cmd.append(" -Dcom.nec.jp.orteus.util.logging.config.file=");
				cmd.append(batchPath);          // �N���ݒ�
				cmd.append(" ");                // �Ăяo����N���X
				cmd.append("com.nec.jp.orteus.metamorBase.AD0030.AD0030B002.mainAD0030B002");
				cmd.append(" \"");
				cmd.append(batchProcessingTyp); // �o�b�`�����敪
				cmd.append('\"');
				cmd.append(" \"");
				cmd.append(this.sysUSER_CD);   // ���[�U�h�c
				cmd.append('\"');
				cmd.append(" \"");
				cmd.append(this.sysPLANT_CD);  // �H��R�[�h
				cmd.append('\"');
				cmd.append(" \"");
				cmd.append(OprInstStartDate);   // �����
				cmd.append('\"');
				cmd.append(",");
				cmd.append("\"");
				cmd.append(WorkOdrDlvDate);     // �[��
				cmd.append('\"');
				cmd.append(",");
				cmd.append("\"");
				cmd.append(JobOdrCd);           // ����
				cmd.append('\"');
				cmd.append(",");
				cmd.append("\"");
				cmd.append(ItemCd);             // �i�ڔԍ�
				cmd.append('\"');
				cmd.append(",");
				cmd.append("\"");
				cmd.append(WsCd);               // ��Ƌ�R�[�h
				cmd.append('\"');
			    cmd.append(",");
				cmd.append("\"");
				cmd.append(OprRsltTyp);         // ��Ǝ��ы敪
				cmd.append('\"');
				cmd.append(",");
				cmd.append("\"");
				cmd.append(OutSideTyp);         // ��Ǝw���v��i����j
				cmd.append('\"');
				cmd.append(",");
				cmd.append("\"");
				cmd.append(OutSideTyp2);        // ��Ǝw���v��i�O��j
				cmd.append('\"');
				cmd.append(",");
				cmd.append("\"");
				cmd.append(VendCd);             // �����R�[�h
				cmd.append('\"');
				setInfoSysLogMessage("BatchCommand : ", cmd.toString());
			
//				// �o�b�`�R�}���h�����s
//				Runtime runtime = Runtime.getRuntime();
//				Process p = runtime.exec(cmd.toString());
			
				List buffer = new ArrayList();
				buffer.add(javaPath);            // �i�u�l
				buffer.add("-cp");
				buffer.add(ClassPath);           // Java ClassPath
				buffer.add("-Dcom.nec.jp.orteus.util.logging.config.file="+batchPath); // �N���ݒ�
				buffer.add("com.nec.jp.orteus.metamorBase.AD0030.AD0030B002.mainAD0030B002"); // �Ăяo����N���X
				buffer.add(batchProcessingTyp);                      // �o�b�`�����敪
				buffer.add(this.sysUSER_CD);                         // ���[�UID
				buffer.add(this.sysPLANT_CD);                        // �H��R�[�h
				buffer.add(OprInstStartDate + "," + WorkOdrDlvDate + "," + JobOdrCd + "," + ItemCd + "," + WsCd + "," + OprRsltTyp + "," + OutSideTyp + "," + OutSideTyp2 + "," + VendCd);

				// �o�b�`�������s
				Runtime runtime = Runtime.getRuntime();
				runtime.exec((String[])buffer.toArray(new String[buffer.size()]));
			} catch (IOException e) {
				// �o�b�`�Ăяo�����s�̏ꍇ�A��ʃ��b�Z�[�W��\������B
				setErrorMessage("ZZ09014");
				setReadStatus(ERROR);
				throw e;
			}

			if(this.list != null && this.list.size() > 0){
				//���X�g�̃N���A
				this.list.clear();
			}
			
			// �o�b�`�Ăяo�������̏ꍇ�A��ʃ��b�Z�[�W��\������B
			setInformationMessage("ZZ09013");
			setReadStatus(NORMAL);

		} catch (MissingResourceException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} catch (IOException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}


                //}}user_implement_dev:<controlUpdateAll>
		logger.exiting("AD0030030Control"+":USER="+struct.getsUser_ID(),"controlUpdateAll");

		return;
	}

	/**
	 * �I���X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlUpdateAssort() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030030Control"+":USER="+struct.getsUser_ID(),"controlUpdateAssort");
			//{{user_implement_dev:<controlUpdateAssort>


		try {	
			//��������(List)���擾
			if (this.list.isEmpty()) {
				//�Ǎ��ݑO�������ꍇ�G���[
				setErrorMessage("ZZ01114");
				setReadStatus(ERROR);
				return;
			}
			//�Ɩ��^�p�����擾����
			List oprDateList = new ArrayList();
			struct.setPLANT_CD(getsysPLANT_CD());
			oprDateList  = entity.mselectBUSINESS_OPR_DATE.read(conn, struct);
			if (oprDateList.isEmpty()) {
				//�f�[�^�����݂��Ȃ�
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("SYS_DATE_CTRL.PLANT_CD", getsysPLANT_CD());//�H��R�[�h
				return;
			}
			AD0030030Struct oprDateStruct = new AD0030030Struct();
			oprDateStruct = (AD0030030Struct)oprDateList.get(0);
			setStandardItem(oprDateStruct);
			struct.setBUSINESS_OPR_DATE(oprDateStruct.getBUSINESS_OPR_DATE());
			

			_debugParentCount = 0;
			_debugAllCount = 0;


			// [�M��]���𕔕i���擾
			this.sysHomeCurStruct = HomeCurControl.getData(this.conn);

			// �I���̎擾
			List workOdrCdList = struct.getList_WORK_ODR_CD();

			//�X�V���s��
			for (int i = 0; i < workOdrCdList.size(); i++) {
				
				conn.beginTransWeb();

 				// �I�����ꂽ�s�̍�ƌv��ԍ��E�d�|��ƃR�[�h��ݒ�
				struct.setWORK_ODR_CD((String) workOdrCdList.get(i));
				struct.setWORK_IN_PROC_CD((String) struct.getList_WORK_IN_PROC_CD().get(i));				

				// �I���s�̍Č���
				List selectdeList = new ArrayList();
				selectdeList = entity.mV_WORK_ODR_LST.read(conn, struct);
				if (selectdeList.isEmpty()) {
					setErrorMessage("ZZ01105");
					setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
					setWarningSysLogMessage("V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
					continue;
				} 
				// �X�V���̃`�F�b�N
				AD0030030Struct selectedStruct = new AD0030030Struct();
				selectedStruct = (AD0030030Struct)selectdeList.get(0);
				setStandardItem(selectedStruct);
				if (!selectedStruct.geth_MODIFY_COUNT().equals(struct.getList_h_MODIFY_COUNT().get(i))) {
					setErrorMessage("ZZ01105");
					setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
					setWarningSysLogMessage("V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
					setWarningSysLogMessage("V_WORK_ODR_LST.MODIFY_COUNT", selectedStruct.geth_MODIFY_COUNT());
					continue;
				}
				
				//�`�F�b�N�P
				//�o�������т̌v��ŁA��Ƌ�R�[�h��"Null"
				if ("1".equals(selectedStruct.getl_OPR_RSLT_TYP())
						&& (selectedStruct.getl_WS_CD() == null 
						|| "".equals(selectedStruct.getl_WS_CD()))) {
					setErrorMessage("AD30041");
					setSupportMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());
					setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
					continue;
				}
				
				//�`�F�b�N�Q
				//��Ǝw�����сi����j�̌v��ŁA��Ƌ�R�[�h"Null"
				if ("2".equals(selectedStruct.getl_OPR_RSLT_TYP())
						&& "1".equals(selectedStruct.getOUTSIDE_TYP())
						&& (selectedStruct.getl_WS_CD() == null 
						|| "".equals(selectedStruct.getl_WS_CD()))) {
					setErrorMessage("AD30041");
					setSupportMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD(), "V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());
					setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
					setWarningSysLogMessage("V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
					continue;
				}
				
				//�`�F�b�N�R
				//��Ǝw�����сi�O��j�̌v��ŁA�����R�[�h��"Null"
				if ("2".equals(selectedStruct.getl_OPR_RSLT_TYP())
						&& "2".equals(selectedStruct.getOUTSIDE_TYP())
						&& (selectedStruct.getl_VEND_CD() == null 
						|| "".equals(selectedStruct.getl_VEND_CD()))) {
					setErrorMessage("AD30037");
					setSupportMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD(), "V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());
					setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
					setWarningSysLogMessage("V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
					continue;
				}
				
				//[�d�|�ꗗVIEW].�g��Ǝ��ы敪�h�@=�@�P�i�o�������сj�̏ꍇ
				if ("1".equals(selectedStruct.getl_OPR_RSLT_TYP())) {
				
					//�`�F�b�N�S
					//�ݒ肳��Ă����Ƌ�R�[�h���A[��Ƌ�]�ɑ��݂��Ȃ�
					List wsCdList = new ArrayList();
					wsCdList = entity.mselectWS_CD.read(conn,selectedStruct);
					if (wsCdList.isEmpty()) {
						setErrorMessage("AD00011");
						setSupportMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());
						setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
						setWarningSysLogMessage("V_WORK_ODR_LST.WS_CD", selectedStruct.getl_WS_CD());//��Ƌ�R�[�h
						continue;
					}

					//�`�F�b�N�T
					//�ݒ肳��Ă����Ƌ�R�[�h�ɑΉ�����[��Ƌ�]�̍H��R�[�h�ƈ�v���Ȃ�
					AD0030030Struct wsStruct = new AD0030030Struct();
					wsStruct = (AD0030030Struct)wsCdList.get(0);
					setStandardItem(wsStruct);
					if (wsStruct.getPLANT_CD() == null 
							|| !selectedStruct.getPLANT_CD().equals(wsStruct.getPLANT_CD())) {
						setErrorMessage("AD00012");
						setSupportMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());
						setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
						setWarningSysLogMessage("V_WORK_ODR_LST.PLANT_CD", selectedStruct.getPLANT_CD());//�H��R�[�h
						setWarningSysLogMessage("M_WS.PLANT_CD", wsStruct.getPLANT_CD());//�H��R�[�h
						continue;
					}

					//�`�F�b�N�U
					//�ݒ肳��Ă����Ƌ�R�[�h�ɑΉ�����[��Ƌ�]��[�ۊǋ�R�[�h]���ݒ肳��Ă��Ȃ�
					if (wsStruct.getWH_CD() == null) {
						setErrorMessage("AD00013");
						setSupportMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());
						setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
						setWarningSysLogMessage("M_WH.WH_CD", wsStruct.getWH_CD());//�H��R�[�h
						continue;
					}
				
					//�`�F�b�N�V
					//�ݒ肳��Ă����Ƌ�R�[�h�ɑΉ�����[��Ƌ�]�Ɂu�ۊǋ�R�[�h�v���ݒ肳��Ă��āA
					//���̕ۊǋ悪�A[�ۊǋ�]�ɑ��݂��Ȃ��ꍇ
					List whList = new ArrayList();
					whList = entity.mselectM_WH.read(conn, wsStruct);
					if (whList.isEmpty()) {
						//�ۊǋ�R�[�h���ۊǋ�ɑ��݂��Ȃ�
						setErrorMessage("AD00018");
						setSupportMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());
						setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
						setWarningSysLogMessage("M_WH.WH_CD", wsStruct.getWH_CD());//�ۊǋ�R�[�h
						continue;
					}

					//�`�F�b�N�W
					//�ݒ肳��Ă����Ƌ�R�[�h�ɑΉ�����[��Ƌ�]��[�ۊǋ�R�[�h]���ݒ肳��Ă��āA
					//���̕ۊǋ�̍H��R�[�h���A��Ƌ�̍H��R�[�h�ƈ�v���Ȃ�
					AD0030030Struct whStruct = new AD0030030Struct();
					whStruct = (AD0030030Struct)whList.get(0);
					setStandardItem(whStruct);
					if (!wsStruct.getPLANT_CD().equals(whStruct.getPLANT_CD())) {
						setErrorMessage("AD00014");
						setSupportMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());
						setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
						setWarningSysLogMessage("M_WS.PLANT_CD", wsStruct.getPLANT_CD());//�H��R�[�h
						setWarningSysLogMessage("M_WH.PLANT_CD", whStruct.getPLANT_CD());//�H��R�[�h
						continue;
					}

				//��Ǝ��ы敪=2�i��Ǝw�����сj�̏ꍇ
				} else {
				
					//�d�|��ƌn��ԍ����ŏ��̃f�[�^���擾
					List minProcNoList = new ArrayList();
					minProcNoList = entity.mselectMIN_PROC_NO.read(conn, struct);
					if (minProcNoList.isEmpty()) {
						setErrorMessage("ZZ06001");
						setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
						setWarningSysLogMessage("V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
						continue;
					}
					AD0030030Struct minProcNoStruct = new AD0030030Struct();
					minProcNoStruct = (AD0030030Struct)minProcNoList.get(0);
					setStandardItem(minProcNoStruct);
					if (minProcNoStruct.getMIN_PROC_NO() != null
							&& minProcNoStruct.getMIN_PROC_NO().equals(selectedStruct.getPROC_NO())) {
						//�����ƌv��ԍ����ōŏ��̓���H��
						//��Ƌ�R�[�h���݃`�F�b�N�p�i��Ƌ�R�[�h�A�H��R�[�h�擾�j
						List wsList = new ArrayList();
						wsList = entity.mselectWS_CD.read(conn, selectedStruct);
				
						//�`�F�b�N�X
						//�ݒ肳��Ă����Ƌ�R�[�h���A[��Ƌ�]�ɑ��݂��Ȃ�
						if (wsList.isEmpty()) {
							//�f�[�^�����݂��Ȃ�
							setErrorMessage("AD00011");
							setSupportMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD(), "V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());
							setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
							setWarningSysLogMessage("V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
							setWarningSysLogMessage("M_WS.WS_CD", selectedStruct.getWS_CD());//��Ƌ�R�[�h
							continue;
						}
						
						//�`�F�b�N�P�O
						//�ݒ肳��Ă����Ƌ�R�[�h�ɑΉ�����[��Ƌ�]��
						//�H��R�[�h�ƈ�v���Ȃ��ꍇ
						AD0030030Struct wsStruct = new AD0030030Struct();
						wsStruct = (AD0030030Struct)wsList.get(0);
						setStandardItem(wsStruct);
						if (!selectedStruct.getPLANT_CD().equals(wsStruct.getPLANT_CD())) {
							//�f�[�^�����݂��Ȃ�
							setErrorMessage("AD00012");
							setSupportMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD(), "V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());
							setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
							setWarningSysLogMessage("V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
							setWarningSysLogMessage("M_WS.PLANT_CD", wsStruct.getPLANT_CD());//�H��R�[�h
							setWarningSysLogMessage("M_WS.WS_CD", selectedStruct.getWS_CD());//��Ƌ�R�[�h
							continue;
						}
				
						//�`�F�b�N�P�P
						//�ݒ肳��Ă����Ƌ�R�[�h�ɑΉ�����[��Ƌ�]��
						//�u�ۊǋ�R�[�h�v���ݒ肳��Ă��Ȃ�
						if (wsStruct.getWH_CD() == null) {
							setErrorMessage("AD00013");
							setSupportMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD(), "V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());
							setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
							setWarningSysLogMessage("V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
							setWarningSysLogMessage("M_WS.WS_CD", this.struct.getWS_CD());//��Ƌ�R�[�h
							continue;
						}
				
						//�`�F�b�N�P�Q
						//�ݒ肳��Ă����Ƌ�R�[�h�ɑΉ�����[��Ƌ�]�̂Ɂu�ۊǋ�R�[�h�v��
						//�ݒ肳��Ă��āA���̕ۊǋ悪�A[�ۊǋ�]�ɑ��݂��Ȃ�
						List whList = new ArrayList();
						whList = entity.mselectM_WH.read(conn, wsStruct);	
						if (whList.isEmpty()) {
							//�f�[�^�����݂��Ȃ�
							setErrorMessage("AD00018");
							setSupportMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD(), "V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());
							setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
							setWarningSysLogMessage("V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
							setWarningSysLogMessage("M_WS.WH_CD", wsStruct.getWH_CD());//�ۊǋ�R�[�h
							continue;
						}
				
						//�`�F�b�N�P�R
						//�ݒ肳��Ă����Ƌ�R�[�h�ɑΉ�����[��Ƌ�]�Ɂu�ۊǋ�R�[�h�v���ݒ肳��
						//�Ă��āA���̕ۊǋ�̍H��R�[�h���A��Ƌ�R�[�h�̍H��R�[�h�ƈ�v���Ȃ�
						AD0030030Struct whStruct = new AD0030030Struct();
						whStruct = (AD0030030Struct)whList.get(0);
						setStandardItem(whStruct);
						if (!wsStruct.getPLANT_CD().equals(whStruct.getPLANT_CD())) {
							setErrorMessage("AD00014");
							setSupportMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD(), "V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());
							setWarningSysLogMessage("V_WORK_ODR_LST.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
							setWarningSysLogMessage("V_WORK_ODR_LST.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
							setWarningSysLogMessage("M_WS.WH_CD", wsStruct.getWH_CD());//�ۊǋ�R�[�h
							continue;
						}
					}
				}
				
				//�X�V����(�P�s����commit)
				UpdateAssort(selectedStruct);
		
			}
			
			//�t���O��set
			_messageSetFlg = 1;
			//�Č���
			controlSelect();
			
		} catch (NumberFormatException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} catch (DataNotFoundException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} catch (ParseException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} finally {
			try {
				if (conn != null) {
					conn.rollback();
				}
			} catch(Exception e) {
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				throw new ExpjException(e, emsg);
			}
		}


                //}}user_implement_dev:<controlUpdateAssort>
		logger.exiting("AD0030030Control"+":USER="+struct.getsUser_ID(),"controlUpdateAssort");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030030Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AD0030030Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030030Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>


		//��ʂ̏�����
		initializeAll();
		//���X�g�̏�����
		listClear();
		try{
			// �V�X�e���p�����[�^�iTIME_CTRL�j�擾
			AD0030030Struct TIME_CTRLStruct = new AD0030030Struct();
			List TIME_CTRLList = entity.mreadTIME_CTRL.read(conn, TIME_CTRLStruct);
			if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
				TIME_CTRLStruct = (AD0030030Struct)TIME_CTRLList.get(0);
				struct.setTIME_CTRL(TIME_CTRLStruct.getTIME_CTRL());
			}else{
				struct.setTIME_CTRL("false");
			}

		} catch(SQLException e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			// 
		}
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AD0030030Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030030Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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


		setReadStatus(INITIAL);


			// �_�E�����[�h�t�@�C�����N���A
			// PDF�ECSV�̃_�E�����[�h���s���Ƃ��́A��ʏ��OrHidden�ŁuDOWNLOAD_FILE�v���`���A���̍s�̃R�����g���O���Ă��������B
//			struct.setDOWNLOAD_FILE((String)null);
			// �R���{�{�b�N�X���i�̃f�[�^�̃Z�b�g�͂����ɋL�q���Ă��������B
			// �R���{�{�b�N�X�f�[�^�p��
			try {
                 ComboBox comboController = new ComboBox(conn, sysUSER_CD);	
                 OPR_RSLT_TYP = comboController.getData(OPR_RSLT_TYP_PARAMETER_NAME);
                 OUTSIDE_TYP = comboController.getData(OUTSIDE_TYP_PARAMETER_NAME);
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } catch (ComboException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AD0030030Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("UpdateAll") ) {
				controlUpdateAll();
			} else if( button.equals("UpdateAssort") ) {
				controlUpdateAssort();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>


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
//			throw new FoundationException("AD0030030Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0030030-E999","CSV�̏o�͏���"));
			throw new FoundationException("AD0030030Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0030030-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AD0030030Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0030030-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AD0030030Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AD0030030Entity entity;
	protected AD0030030Struct struct;
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

		entity = new AD0030030Entity();
		struct = new AD0030030Struct();

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
	 * AD0030030�N���X�̕W���R���X�g���N�^
	 */
	public AD0030030Control() throws BusinessProcessException, FoundationException
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
				AD0030030Struct key = (AD0030030Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP_DN") && key.getOPR_RSLT_TYP_DN() != null) {
					msgKey.setKeyValue("OPR_RSLT_TYP_DN", key.getOPR_RSLT_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("r1_FILTER1") && key.getr1_FILTER1() != null) {
					msgKey.setKeyValue("r1_FILTER1", key.getr1_FILTER1());
				}
				if(msgKeyType.containsKeyColumn("c_OUTPUT_RSLT") && key.getc_OUTPUT_RSLT() != null) {
					msgKey.setKeyValue("c_OUTPUT_RSLT", key.getc_OUTPUT_RSLT());
				}
				if(msgKeyType.containsKeyColumn("r2_FILTER1") && key.getr2_FILTER1() != null) {
					msgKey.setKeyValue("r2_FILTER1", key.getr2_FILTER1());
				}
				if(msgKeyType.containsKeyColumn("c_OUTSIDE_TYP_IN") && key.getc_OUTSIDE_TYP_IN() != null) {
					msgKey.setKeyValue("c_OUTSIDE_TYP_IN", key.getc_OUTSIDE_TYP_IN());
				}
				if(msgKeyType.containsKeyColumn("c_OUTSIDE_TYP_OUT") && key.getc_OUTSIDE_TYP_OUT() != null) {
					msgKey.setKeyValue("c_OUTSIDE_TYP_OUT", key.getc_OUTSIDE_TYP_OUT());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_DN") && key.getOUTSIDE_TYP_DN() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_DN", key.getOUTSIDE_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_TIME") && key.getOPR_INST_START_TIME() != null) {
					msgKey.setKeyValue("OPR_INST_START_TIME", key.getOPR_INST_START_TIME());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_TIME") && key.getWORK_ODR_DLV_TIME() != null) {
					msgKey.setKeyValue("WORK_ODR_DLV_TIME", key.getWORK_ODR_DLV_TIME());
				}
				if(msgKeyType.containsKeyColumn("ODINFO_DISGUISE") && key.getODINFO_DISGUISE() != null) {
					msgKey.setKeyValue("ODINFO_DISGUISE", key.getODINFO_DISGUISE());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE_01") && key.getWORK_ODR_DLV_DATE_01() != null) {
					msgKey.setKeyValue("WORK_ODR_DLV_DATE_01", key.getWORK_ODR_DLV_DATE_01());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_01") && key.getOPR_INST_START_DATE_01() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATE_01", key.getOPR_INST_START_DATE_01());
				}
				if(msgKeyType.containsKeyColumn("TIME_CTRL") && key.getTIME_CTRL() != null) {
					msgKey.setKeyValue("TIME_CTRL", key.getTIME_CTRL());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD") && key.getOPR_INST_CD() != null) {
					msgKey.setKeyValue("OPR_INST_CD", key.getOPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_CD") && key.getWORK_ODR_CD() != null) {
					msgKey.setKeyValue("WORK_ODR_CD", key.getWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD") && key.getWORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("WORK_IN_PROC_CD", key.getWORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("PROC_NAME") && key.getPROC_NAME() != null) {
					msgKey.setKeyValue("PROC_NAME", key.getPROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_NO") && key.getPROC_NO() != null) {
					msgKey.setKeyValue("PROC_NO", key.getPROC_NO());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD") && key.getl_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CD", key.getl_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_CD") && key.getl_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ITEM_CD", key.getl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_WS_CD") && key.getl_WS_CD() != null) {
					msgKey.setKeyValue("l_WS_CD", key.getl_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("WS_NAME") && key.getWS_NAME() != null) {
					msgKey.setKeyValue("WS_NAME", key.getWS_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_VEND_CD") && key.getl_VEND_CD() != null) {
					msgKey.setKeyValue("l_VEND_CD", key.getl_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("l_VEND_ANAME") && key.getl_VEND_ANAME() != null) {
					msgKey.setKeyValue("l_VEND_ANAME", key.getl_VEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("l_WORK_ODR_DLV_DATE") && key.getl_WORK_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("l_WORK_ODR_DLV_DATE", key.getl_WORK_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_INST_START_DATE") && key.getl_OPR_INST_START_DATE() != null) {
					msgKey.setKeyValue("l_OPR_INST_START_DATE", key.getl_OPR_INST_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_QTY") && key.getOPR_INST_QTY() != null) {
					msgKey.setKeyValue("OPR_INST_QTY", key.getOPR_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("WORK_IN_PROC_COMMENT") && key.getWORK_IN_PROC_COMMENT() != null) {
					msgKey.setKeyValue("WORK_IN_PROC_COMMENT", key.getWORK_IN_PROC_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_RSLT_TYP") && key.getl_OPR_RSLT_TYP() != null) {
					msgKey.setKeyValue("l_OPR_RSLT_TYP", key.getl_OPR_RSLT_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT") && key.geth_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_MODIFY_COUNT", key.geth_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("HIDDEN_OPR_RSLT_TYP") && key.getHIDDEN_OPR_RSLT_TYP() != null) {
					msgKey.setKeyValue("HIDDEN_OPR_RSLT_TYP", key.getHIDDEN_OPR_RSLT_TYP());
				}
				if(msgKeyType.containsKeyColumn("h1_WS_CD") && key.geth1_WS_CD() != null) {
					msgKey.setKeyValue("h1_WS_CD", key.geth1_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("HIDDEN_OUTSIDE_TYP") && key.getHIDDEN_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("HIDDEN_OUTSIDE_TYP", key.getHIDDEN_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("HIDDEN_OPR_RSLT_TYP2") && key.getHIDDEN_OPR_RSLT_TYP2() != null) {
					msgKey.setKeyValue("HIDDEN_OPR_RSLT_TYP2", key.getHIDDEN_OPR_RSLT_TYP2());
				}
				if(msgKeyType.containsKeyColumn("h2_WS_CD") && key.geth2_WS_CD() != null) {
					msgKey.setKeyValue("h2_WS_CD", key.geth2_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("HIDDEN_OUTSIDE_TYP2") && key.getHIDDEN_OUTSIDE_TYP2() != null) {
					msgKey.setKeyValue("HIDDEN_OUTSIDE_TYP2", key.getHIDDEN_OUTSIDE_TYP2());
				}
				if(msgKeyType.containsKeyColumn("HIDDEN_OPR_RSLT_TYP3") && key.getHIDDEN_OPR_RSLT_TYP3() != null) {
					msgKey.setKeyValue("HIDDEN_OPR_RSLT_TYP3", key.getHIDDEN_OPR_RSLT_TYP3());
				}
				if(msgKeyType.containsKeyColumn("h_VEND_CD") && key.geth_VEND_CD() != null) {
					msgKey.setKeyValue("h_VEND_CD", key.geth_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_DATE") && key.getOPR_INST_DATE() != null) {
					msgKey.setKeyValue("OPR_INST_DATE", key.getOPR_INST_DATE());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("PS_EDITION") && key.getPS_EDITION() != null) {
					msgKey.setKeyValue("PS_EDITION", key.getPS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("PS_UNIT_QTY") && key.getPS_UNIT_QTY() != null) {
					msgKey.setKeyValue("PS_UNIT_QTY", key.getPS_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("PARENT_OD_NO") && key.getPARENT_OD_NO() != null) {
					msgKey.setKeyValue("PARENT_OD_NO", key.getPARENT_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_TYP") && key.getISSUE_TYP() != null) {
					msgKey.setKeyValue("ISSUE_TYP", key.getISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("DUE_DATE") && key.getDUE_DATE() != null) {
					msgKey.setKeyValue("DUE_DATE", key.getDUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("PS_UNIT_DENOMINATOR") && key.getPS_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("PS_UNIT_DENOMINATOR", key.getPS_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("PS_UNIT_NUMERATOR") && key.getPS_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("PS_UNIT_NUMERATOR", key.getPS_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("PS_SPOIL") && key.getPS_SPOIL() != null) {
					msgKey.setKeyValue("PS_SPOIL", key.getPS_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_CD") && key.getISSUE_INST_CD() != null) {
					msgKey.setKeyValue("ISSUE_INST_CD", key.getISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_UNIT_QTY") && key.getISSUE_INST_UNIT_QTY() != null) {
					msgKey.setKeyValue("ISSUE_INST_UNIT_QTY", key.getISSUE_INST_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_UNIT_DENOMINATOR") && key.getISSUE_INST_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("ISSUE_INST_UNIT_DENOMINATOR", key.getISSUE_INST_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_UNIT_NUMERATOR") && key.getISSUE_INST_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("ISSUE_INST_UNIT_NUMERATOR", key.getISSUE_INST_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_QTY") && key.getISSUE_INST_QTY() != null) {
					msgKey.setKeyValue("ISSUE_INST_QTY", key.getISSUE_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY") && key.getTOTAL_ISSUE_QTY() != null) {
					msgKey.setKeyValue("TOTAL_ISSUE_QTY", key.getTOTAL_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("SCDL_ISSUE_DATE") && key.getSCDL_ISSUE_DATE() != null) {
					msgKey.setKeyValue("SCDL_ISSUE_DATE", key.getSCDL_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_DATE") && key.getISSUE_CMPLT_DATE() != null) {
					msgKey.setKeyValue("ISSUE_CMPLT_DATE", key.getISSUE_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_FLG") && key.getISSUE_CMPLT_FLG() != null) {
					msgKey.setKeyValue("ISSUE_CMPLT_FLG", key.getISSUE_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_ISS_FLG") && key.getISSUE_INST_ISS_FLG() != null) {
					msgKey.setKeyValue("ISSUE_INST_ISS_FLG", key.getISSUE_INST_ISS_FLG());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_ISS_DATE") && key.getISSUE_INST_ISS_DATE() != null) {
					msgKey.setKeyValue("ISSUE_INST_ISS_DATE", key.getISSUE_INST_ISS_DATE());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_COMMENT") && key.getISSUE_INST_COMMENT() != null) {
					msgKey.setKeyValue("ISSUE_INST_COMMENT", key.getISSUE_INST_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("CONS_TYP") && key.getCONS_TYP() != null) {
					msgKey.setKeyValue("CONS_TYP", key.getCONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
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
				if(msgKeyType.containsKeyColumn("PUCH_ODR_INST_DATE") && key.getPUCH_ODR_INST_DATE() != null) {
					msgKey.setKeyValue("PUCH_ODR_INST_DATE", key.getPUCH_ODR_INST_DATE());
				}
				if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP") && key.getSPL_ITEM_TYP() != null) {
					msgKey.setKeyValue("SPL_ITEM_TYP", key.getSPL_ITEM_TYP());
				}
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP") && key.getACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP", key.getACPT_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_COMMENT") && key.getPUCH_ODR_COMMENT() != null) {
					msgKey.setKeyValue("PUCH_ODR_COMMENT", key.getPUCH_ODR_COMMENT());
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
				if(msgKeyType.containsKeyColumn("EXCH_RATE") && key.getEXCH_RATE() != null) {
					msgKey.setKeyValue("EXCH_RATE", key.getEXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE") && key.getOPR_INST_START_DATE() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATE", key.getOPR_INST_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE") && key.getWORK_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("WORK_ODR_DLV_DATE", key.getWORK_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("OWN_PERSON_NAME") && key.getOWN_PERSON_NAME() != null) {
					msgKey.setKeyValue("OWN_PERSON_NAME", key.getOWN_PERSON_NAME());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP") && key.getEXCH_TYP() != null) {
					msgKey.setKeyValue("EXCH_TYP", key.getEXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("CUR_CD") && key.getCUR_CD() != null) {
					msgKey.setKeyValue("CUR_CD", key.getCUR_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_DECIMAL_FIG") && key.getVEND_DECIMAL_FIG() != null) {
					msgKey.setKeyValue("VEND_DECIMAL_FIG", key.getVEND_DECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("MIN_PROC_NO") && key.getMIN_PROC_NO() != null) {
					msgKey.setKeyValue("MIN_PROC_NO", key.getMIN_PROC_NO());
				}
				if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE") && key.getEFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("EFF_PHASE_IN_DATE", key.getEFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("WORK_STS_TYP") && key.getWORK_STS_TYP() != null) {
					msgKey.setKeyValue("WORK_STS_TYP", key.getWORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("CHECK_MODIFY_COUNT") && key.getCHECK_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("CHECK_MODIFY_COUNT", key.getCHECK_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("VEND_ANAME") && key.getVEND_ANAME() != null) {
					msgKey.setKeyValue("VEND_ANAME", key.getVEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("MANHOUR_TYP") && key.getMANHOUR_TYP() != null) {
					msgKey.setKeyValue("MANHOUR_TYP", key.getMANHOUR_TYP());
				}
				if(msgKeyType.containsKeyColumn("SPOIL_FLG") && key.getSPOIL_FLG() != null) {
					msgKey.setKeyValue("SPOIL_FLG", key.getSPOIL_FLG());
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
					AD0030030Struct key = new AD0030030Struct();
					if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP_DN")) {
						key.setOPR_RSLT_TYP_DN(msgKey.getKeyValue("OPR_RSLT_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("r1_FILTER1")) {
						key.setr1_FILTER1(msgKey.getKeyValue("r1_FILTER1"));
					}
					if(msgKeyType.containsKeyColumn("c_OUTPUT_RSLT")) {
						key.setc_OUTPUT_RSLT(msgKey.getKeyValue("c_OUTPUT_RSLT"));
					}
					if(msgKeyType.containsKeyColumn("r2_FILTER1")) {
						key.setr2_FILTER1(msgKey.getKeyValue("r2_FILTER1"));
					}
					if(msgKeyType.containsKeyColumn("c_OUTSIDE_TYP_IN")) {
						key.setc_OUTSIDE_TYP_IN(msgKey.getKeyValue("c_OUTSIDE_TYP_IN"));
					}
					if(msgKeyType.containsKeyColumn("c_OUTSIDE_TYP_OUT")) {
						key.setc_OUTSIDE_TYP_OUT(msgKey.getKeyValue("c_OUTSIDE_TYP_OUT"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_DN")) {
						key.setOUTSIDE_TYP_DN(msgKey.getKeyValue("OUTSIDE_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_TIME")) {
						key.setOPR_INST_START_TIME(msgKey.getKeyValue("OPR_INST_START_TIME"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_TIME")) {
						key.setWORK_ODR_DLV_TIME(msgKey.getKeyValue("WORK_ODR_DLV_TIME"));
					}
					if(msgKeyType.containsKeyColumn("ODINFO_DISGUISE")) {
						key.setODINFO_DISGUISE(msgKey.getKeyValue("ODINFO_DISGUISE"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE_01")) {
						key.setWORK_ODR_DLV_DATE_01(msgKey.getKeyValue("WORK_ODR_DLV_DATE_01"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_01")) {
						key.setOPR_INST_START_DATE_01(msgKey.getKeyValue("OPR_INST_START_DATE_01"));
					}
					if(msgKeyType.containsKeyColumn("TIME_CTRL")) {
						key.setTIME_CTRL(msgKey.getKeyValue("TIME_CTRL"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD")) {
						key.setOPR_INST_CD(msgKey.getKeyValue("OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_CD")) {
						key.setWORK_ODR_CD(msgKey.getKeyValue("WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD")) {
						key.setWORK_IN_PROC_CD(msgKey.getKeyValue("WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROC_NAME")) {
						key.setPROC_NAME(msgKey.getKeyValue("PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_NO")) {
						key.setPROC_NO(msgKey.getKeyValue("PROC_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD")) {
						key.setl_JOB_ODR_CD(msgKey.getKeyValue("l_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_CD")) {
						key.setl_ITEM_CD(msgKey.getKeyValue("l_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_WS_CD")) {
						key.setl_WS_CD(msgKey.getKeyValue("l_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("WS_NAME")) {
						key.setWS_NAME(msgKey.getKeyValue("WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_VEND_CD")) {
						key.setl_VEND_CD(msgKey.getKeyValue("l_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_VEND_ANAME")) {
						key.setl_VEND_ANAME(msgKey.getKeyValue("l_VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("l_WORK_ODR_DLV_DATE")) {
						key.setl_WORK_ODR_DLV_DATE(msgKey.getKeyValue("l_WORK_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_INST_START_DATE")) {
						key.setl_OPR_INST_START_DATE(msgKey.getKeyValue("l_OPR_INST_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_QTY")) {
						key.setOPR_INST_QTY(msgKey.getKeyValue("OPR_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("WORK_IN_PROC_COMMENT")) {
						key.setWORK_IN_PROC_COMMENT(msgKey.getKeyValue("WORK_IN_PROC_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(msgKey.getKeyValue("OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_RSLT_TYP")) {
						key.setl_OPR_RSLT_TYP(msgKey.getKeyValue("l_OPR_RSLT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT")) {
						key.seth_MODIFY_COUNT(msgKey.getKeyValue("h_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("HIDDEN_OPR_RSLT_TYP")) {
						key.setHIDDEN_OPR_RSLT_TYP(msgKey.getKeyValue("HIDDEN_OPR_RSLT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h1_WS_CD")) {
						key.seth1_WS_CD(msgKey.getKeyValue("h1_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("HIDDEN_OUTSIDE_TYP")) {
						key.setHIDDEN_OUTSIDE_TYP(msgKey.getKeyValue("HIDDEN_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("HIDDEN_OPR_RSLT_TYP2")) {
						key.setHIDDEN_OPR_RSLT_TYP2(msgKey.getKeyValue("HIDDEN_OPR_RSLT_TYP2"));
					}
					if(msgKeyType.containsKeyColumn("h2_WS_CD")) {
						key.seth2_WS_CD(msgKey.getKeyValue("h2_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("HIDDEN_OUTSIDE_TYP2")) {
						key.setHIDDEN_OUTSIDE_TYP2(msgKey.getKeyValue("HIDDEN_OUTSIDE_TYP2"));
					}
					if(msgKeyType.containsKeyColumn("HIDDEN_OPR_RSLT_TYP3")) {
						key.setHIDDEN_OPR_RSLT_TYP3(msgKey.getKeyValue("HIDDEN_OPR_RSLT_TYP3"));
					}
					if(msgKeyType.containsKeyColumn("h_VEND_CD")) {
						key.seth_VEND_CD(msgKey.getKeyValue("h_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_DATE")) {
						key.setOPR_INST_DATE(msgKey.getKeyValue("OPR_INST_DATE"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("PS_EDITION")) {
						key.setPS_EDITION(msgKey.getKeyValue("PS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("PS_UNIT_QTY")) {
						key.setPS_UNIT_QTY(msgKey.getKeyValue("PS_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_OD_NO")) {
						key.setPARENT_OD_NO(msgKey.getKeyValue("PARENT_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_TYP")) {
						key.setISSUE_TYP(msgKey.getKeyValue("ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DUE_DATE")) {
						key.setDUE_DATE(msgKey.getKeyValue("DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PS_UNIT_DENOMINATOR")) {
						key.setPS_UNIT_DENOMINATOR(msgKey.getKeyValue("PS_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("PS_UNIT_NUMERATOR")) {
						key.setPS_UNIT_NUMERATOR(msgKey.getKeyValue("PS_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("PS_SPOIL")) {
						key.setPS_SPOIL(msgKey.getKeyValue("PS_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_CD")) {
						key.setISSUE_INST_CD(msgKey.getKeyValue("ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_UNIT_QTY")) {
						key.setISSUE_INST_UNIT_QTY(msgKey.getKeyValue("ISSUE_INST_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_UNIT_DENOMINATOR")) {
						key.setISSUE_INST_UNIT_DENOMINATOR(msgKey.getKeyValue("ISSUE_INST_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_UNIT_NUMERATOR")) {
						key.setISSUE_INST_UNIT_NUMERATOR(msgKey.getKeyValue("ISSUE_INST_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_QTY")) {
						key.setISSUE_INST_QTY(msgKey.getKeyValue("ISSUE_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY")) {
						key.setTOTAL_ISSUE_QTY(msgKey.getKeyValue("TOTAL_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SCDL_ISSUE_DATE")) {
						key.setSCDL_ISSUE_DATE(msgKey.getKeyValue("SCDL_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_DATE")) {
						key.setISSUE_CMPLT_DATE(msgKey.getKeyValue("ISSUE_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_FLG")) {
						key.setISSUE_CMPLT_FLG(msgKey.getKeyValue("ISSUE_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_ISS_FLG")) {
						key.setISSUE_INST_ISS_FLG(msgKey.getKeyValue("ISSUE_INST_ISS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_ISS_DATE")) {
						key.setISSUE_INST_ISS_DATE(msgKey.getKeyValue("ISSUE_INST_ISS_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_COMMENT")) {
						key.setISSUE_INST_COMMENT(msgKey.getKeyValue("ISSUE_INST_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("CONS_TYP")) {
						key.setCONS_TYP(msgKey.getKeyValue("CONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
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
					if(msgKeyType.containsKeyColumn("PUCH_ODR_INST_DATE")) {
						key.setPUCH_ODR_INST_DATE(msgKey.getKeyValue("PUCH_ODR_INST_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP")) {
						key.setSPL_ITEM_TYP(msgKey.getKeyValue("SPL_ITEM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP")) {
						key.setACPT_INSPC_TYP(msgKey.getKeyValue("ACPT_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_COMMENT")) {
						key.setPUCH_ODR_COMMENT(msgKey.getKeyValue("PUCH_ODR_COMMENT"));
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
					if(msgKeyType.containsKeyColumn("EXCH_RATE")) {
						key.setEXCH_RATE(msgKey.getKeyValue("EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE")) {
						key.setOPR_INST_START_DATE(msgKey.getKeyValue("OPR_INST_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE")) {
						key.setWORK_ODR_DLV_DATE(msgKey.getKeyValue("WORK_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("OWN_PERSON_NAME")) {
						key.setOWN_PERSON_NAME(msgKey.getKeyValue("OWN_PERSON_NAME"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP")) {
						key.setEXCH_TYP(msgKey.getKeyValue("EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CUR_CD")) {
						key.setCUR_CD(msgKey.getKeyValue("CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_DECIMAL_FIG")) {
						key.setVEND_DECIMAL_FIG(msgKey.getKeyValue("VEND_DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("MIN_PROC_NO")) {
						key.setMIN_PROC_NO(msgKey.getKeyValue("MIN_PROC_NO"));
					}
					if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE")) {
						key.setEFF_PHASE_IN_DATE(msgKey.getKeyValue("EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WORK_STS_TYP")) {
						key.setWORK_STS_TYP(msgKey.getKeyValue("WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CHECK_MODIFY_COUNT")) {
						key.setCHECK_MODIFY_COUNT(msgKey.getKeyValue("CHECK_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("VEND_ANAME")) {
						key.setVEND_ANAME(msgKey.getKeyValue("VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("MANHOUR_TYP")) {
						key.setMANHOUR_TYP(msgKey.getKeyValue("MANHOUR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SPOIL_FLG")) {
						key.setSPOIL_FLG(msgKey.getKeyValue("SPOIL_FLG"));
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
