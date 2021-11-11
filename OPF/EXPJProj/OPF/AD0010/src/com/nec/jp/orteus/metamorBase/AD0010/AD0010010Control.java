/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0010/src/com/nec/jp/orteus/metamorBase/AD0010/AD0010010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0010;

import com.nec.jp.orteus.metamorBase.AD0010.*;
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
import java.text.DateFormat;
import java.text.ParseException;

import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
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

//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AD0010010Control
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

	//�ꗗ�����̌��ʃ��X�g����ʂɕ\�����邽�߂̃��X�g�C���X�^���X
	protected List list;

	// �f�t�H���g�A�N�Z�T���\�b�h
	//���X�g��Ԃ��܂��B
	public List getList() { return this.list; }
	//���X�g���Z�b�g���܂��B
	public void setList(List listname) { this.list = listname; }
	//���X�g�^�̃T�C�Y��Ԃ��܂��B
	public int getListsize() {
		int nret = 0;
		if( this.list != null ) {nret = this.list.size();}
		return nret;
	}
//	public Object getListvalue(int x) { return this.list.get(x); }	// ���X�g�̒l��Ԃ��܂��B
	//���X�g�̒l��Ԃ��܂��B
	public AD0010010Struct getListvalue(int x) {
		return (AD0010010Struct)(this.list.get(x));
	}
	//Struct��Ԃ��܂��B
	public AD0010010Struct getStruct() { return this.struct; }
	//�V����Struct������ĕԂ��܂��B
	public AD0010010Struct createStruct() { return new AD0010010Struct(); }
	//Struct���Z�b�g���܂��B
	public void setStruct(Object structname) {
		this.struct.setStruct((AD0010010Struct)structname);
	}
	//Struct�̒l�����������܂��B
	public void initializeStruct() { this.struct.initialize(); }

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

//-----------------------------------------------------------------

	/** [�R���{�{�b�N�X�f�[�^]���i���O��敪�j */
	private ComboStruct _outsideTypStruct = new ComboStruct();
	/** �V�X�e�����O���b�Z�[�W�쐬�p */
	private StringBuffer _sysLogMessage;

	/** ��ЃR�[�h */
	String _companyCd = "";

	/** ���t�����p */
	DateFormat _df = DateFormat.getDateInstance();
	/** �M�ݏ��f�[�^�N���X */
	HomeCurStruct _sysHomeCurStruct = new HomeCurStruct();

	/** ���O��敪(�O��ύX) �O��ύX������̕\����ʐ���p */
	private String _outSideTyp = null;
	/**
	 * ���O��敪(�O��ύX)�̐ݒ�
	 * @param outSideTyp ���O��敪(�O��ύX)
	 */
	public void setOutSideTyp(String outSideTyp){ 
		_outSideTyp = outSideTyp; 
	}
	/**
	 * ���O��敪(�O��ύX)�̎擾
	 * @return ���O��敪(�O��ύX)
	 */
	public String getOutSideTyp(){ 
		return _outSideTyp; 
	}

	/**
	 * Orteus�W��Struct�̒l��Ώ�Struct�ɃR�s�[���܂��B
	 * @param target �R�s�[�ΏۂƂȂ�Struct
	 */
	public void setStandardItem(AD0010010Struct target){

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

	// 20081222 ADD��
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
	
	public String DtToStrng(Date in)
	{
		SimpleDateFormat fm = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		if(in == null) return null;
		return fm.format(in);
	}
	
	public String DtGetDate(Date in)
	{
		SimpleDateFormat fm = new SimpleDateFormat("yyyy/MM/dd");
		if(in == null) return null;
		return fm.format(in);
	}

	public String DtGetTime(Date in)
	{
		SimpleDateFormat fm = new SimpleDateFormat("HHmm");
		if(in == null) return null;
		return fm.format(in);
	}

	/** �f�o�b�O�p���b�Z�[�W�쐬�p�ϐ� */
    private String _debugMsg = "";
	// 20081222 ADD��
	
	/** �����Ǘ��p�t���O */
	private String _flgTimeCtrl = null;
	
    /** EJa-ASPROVA�A�g�I�v�V���������t���O�擾�p */
	private String _SysInstallOptions_ASP = null;

	/** �N���A���� */
	public void clear() {

		struct.setITEM_CD("");
		struct.setITEM_NAME("");
		struct.setDRAW_CD("");
		struct.setSPEC("");
		struct.setSTOCK_UNIT("");
		struct.setJOB_ODR_CD("");
		struct.setMRP_ODR_TYP_DN("");
		struct.setMRP_ODR_TYP("");
		struct.setOPR_RSLT_TYP_DN("");
		struct.setOPR_RSLT_TYP("");
		struct.setWORK_ODR_DLV_DATE("");
		struct.setWORK_ODR_DLV_DATE_TIME("");
		struct.setOPR_INST_START_DATE("");
		struct.setOPR_INST_START_DATE_TIME("");
		struct.setOPR_INST_QTY("0.0");
		struct.setOPR_INST_CD("");
		struct.setWS_CD("");
		struct.setWS_NAME("");
		struct.setWORK_IN_PROC_COMMENT("");
		
		struct.seth_OPR_INST_QTY("");
		struct.seth_WORK_ODR_CD("");

		struct.setOUTSIDE_TYP("1"); //���O��敪
		_outSideTyp = "";
		
		struct.setTIME_CTRL(_flgTimeCtrl);
// 2008/09/08 ADD START �y�c
		struct.seth_MANHOUR_TYP("");
// 2008/09/08 ADD END �y�c

	}
	/** �N���A���� */
	public void clearAll() {
		clear();
		struct.setWORK_ODR_CD("");

		setReadStatus(INITIAL);
	}
	
	/** Struct��copy */
	public void copyStruct(AD0010010Struct target) {
		struct.setWORK_ODR_CD(target.getWORK_ODR_CD());
		struct.setITEM_CD(target.getITEM_CD());
		struct.setITEM_NAME(target.getITEM_NAME());
		struct.setDRAW_CD(target.getDRAW_CD());
		struct.setSPEC(target.getSPEC());
		struct.seth_UNIT_QTY_TYP(target.geth_UNIT_QTY_TYP());
		struct.setSTOCK_UNIT(target.getSTOCK_UNIT());
		struct.setWS_CD(target.getWS_CD());
		struct.setWS_NAME(target.getWS_NAME());
		struct.setOPR_INST_START_DATE(target.getOPR_INST_START_DATE());
		struct.setOPR_INST_START_DATE_TIME(target.getOPR_INST_START_DATE_TIME());
		struct.setWORK_ODR_DLV_DATE(target.getWORK_ODR_DLV_DATE());
		struct.setWORK_ODR_DLV_DATE_TIME(target.getWORK_ODR_DLV_DATE_TIME());
		struct.setOPR_INST_QTY(target.getOPR_INST_QTY());
		struct.seth_OPR_INST_QTY(target.getOPR_INST_QTY());
		struct.setWORK_IN_PROC_COMMENT(target.getWORK_IN_PROC_COMMENT());
		struct.setOPR_INST_CD(target.getOPR_INST_CD());
		struct.setMRP_ODR_TYP(target.getMRP_ODR_TYP());
		struct.setMRP_ODR_TYP_DN(target.getMRP_ODR_TYP_DN());
		struct.setOPR_RSLT_TYP(target.getOPR_RSLT_TYP());
		struct.setOPR_RSLT_TYP_DN(target.getOPR_RSLT_TYP_DN());
		struct.setJOB_ODR_CD(target.getJOB_ODR_CD());
		struct.seth_JOB_ODR_DLV_DATE(target.geth_JOB_ODR_DLV_DATE());
		struct.seth_JOB_ODR_DLV_DATE_TIME(target.geth_JOB_ODR_DLV_DATE_TIME());
		struct.seth_PARENT_OD_NO(target.geth_PARENT_OD_NO());
		struct.seth_DUE_DATE(target.geth_DUE_DATE());
		struct.seth_DUE_DATE_TIME(target.geth_DUE_DATE_TIME());
		struct.seth_BUSINESS_OPR_DATE(target.geth_BUSINESS_OPR_DATE());
		struct.seth_MODIFY_COUNT(target.geth_MODIFY_COUNT());
		struct.setODR_START_DATE(target.getODR_START_DATE());
		struct.seth_ODR_START_DATE(target.geth_ODR_START_DATE());
		struct.seth_ODR_START_DATE_TIME(target.geth_ODR_START_DATE_TIME());
		struct.setOUTSIDE_TYP(target.getOUTSIDE_TYP());
		struct.seth_SUB_FLG(target.geth_SUB_FLG());
		struct.seth_flg(target.geth_flg());
		struct.setPLANT_CD(target.getPLANT_CD());
		struct.seth_OPR_INST_QTY(target.geth_OPR_INST_QTY());
		struct.seth_WORK_ODR_CD(target.geth_WORK_ODR_CD());
		struct.setTIME_CTRL(_flgTimeCtrl);
// 2008/09/08 ADD START �y�c
		struct.seth_MANHOUR_TYP(target.geth_MANHOUR_TYP());
// 2008/09/08 ADD END �y�c
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
	
	/**
     * �ғ������Z��������t������Ŏg����悤�ɂ����Ϗ����\�b�h�ł��B
     * @param dateString ���t������
     * @return ���Z���ʂ̓��t������
     * @throws FoundationException ���ʕ��i�����Ŏ��s
     * @throws ParseException �^�ϊ��Ɏ��s
     */
    private String calcWorkDay(String dateString, String timeString, String ltString, boolean flg)
     throws FoundationException, ParseException {
     // DateFormat������
     //DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
     // �^�ϊ�
     //Date date = df.parse(dateString);

     // �n����Ă���������hh24:mi:ss�`���ɐ�����
     timeString = timeString.substring(0,2) + ":" + timeString.substring(2) + ":00";

     // �����̔N�����ƌ`���𐮂����������������A���t�^�ɕϊ�����
     Date date = Converter.strToDate(dateString + " " + timeString, "yyyy/MM/dd HH:mm:ss");
     int lt = Integer.parseInt(ltString);
   
     // �ғ������ʕ��i�𐶐����A�`�F�b�N���������s
     WorkCalendar wc =
      new WorkCalendar(conn, sysUSER_CD, sp.getProcId(), struct.getPLANT_CD(),struct.getITEM_CD(), date, lt, flg);
     Date resultDate = wc.calcDate();

     if (resultDate == null || "".equals(resultDate)){
    	 return ""; 
     }
     // �����Z�o���ꂽ���t�𕶎��^�ɕϊ����ĕێ�����
     String tidydate = Converter.dateToStr(resultDate, "yyyy/MM/dd HH:mm:ss");

     // �����Z�o���ꂽ���t��yyyy/mm/dd hh24mi�`���ɐ�����
     tidydate = tidydate.substring(0,10) + tidydate.substring(10,13) + tidydate.substring(14,16);

     //return df.format(tidydate);
     return tidydate;
    }
	

        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0010");
		logger.entering("AD0010010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>


		try {
			//��ʏ�̍��ڒl���N���A����
			clear();
			
			//�T�[�o�[���`�F�b�N
			
			//��ƌv��ԍ��`�F�b�N
			List workOdrCdList = entity.mCheckWORK_IN_PROC_BY_ITEM.read(conn, struct);
			if (workOdrCdList == null || workOdrCdList.size() <= 0) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", 
						this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
				setReadStatus(ERROR);
				return;
			}
			
			List selectList = entity.mSelect.read(conn, struct);
			if (selectList == null || selectList.size() <= 0) {
				//�f�[�^�����݂��Ȃ�
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", 
						this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
				setReadStatus(ERROR);
				return;
			}
			AD0010010Struct selectStruct = (AD0010010Struct)selectList.get(0);
			setStandardItem(selectStruct);
			
			//�i�ڕʍ�Ə�ԋ敪�`�F�b�N
			if ("1".equals(selectStruct.getWORK_STS_TYP())) {
			} else {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD",
						this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
				setReadStatus(ERROR);
				return;
			}
			
			//��ƌn��W�J�ς݃t���O�`�F�b�N
			if ("1".equals(selectStruct.getPROC_EXPLOSION_FLG())) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD",
						this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
			}
			
			if (!selectStruct.getPLANT_CD().equals(this.sysPLANT_CD)) {
				//�H��R�[�h�`�F�b�N
				setErrorMessage("AD00006");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", 
						this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
				setWarningSysLogMessage("PLANT_CD", this.sysPLANT_CD);//�H��R�[�h
			}
			
			// �G���[������ΏI��
			if (msgStruct.hasError()) {
				return;
			}
			
			
			//���ԕi�ڂ̏ꍇ
			if (selectStruct.getJOB_ODR_CD() == null 
					|| selectStruct.getJOB_ODR_CD().equals("")) {
			} else {
				//���ʕ��i
				List jobOdrList = entity.mSelectChild.read(conn, selectStruct);
				if (jobOdrList == null || jobOdrList.size() <= 0) {
					//�f�[�^�����݂��Ȃ��ꍇ�A���ʕ��i�����݂��Ȃ��u0�v
					selectStruct.seth_SUB_FLG("0");
				} else {
					selectStruct.seth_SUB_FLG("1");
				}
				//���Ԕ[���̎擾
				jobOdrList = entity.mselectJOB_ODR_DLV_DATE.read(conn, selectStruct);
				if (jobOdrList == null || jobOdrList.size() <= 0) {
					//�f�[�^�����݂��Ȃ�
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", 
							this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
					return;
				} else {
					AD0010010Struct jobOdrStruct = (AD0010010Struct)jobOdrList.get(0);
					setStandardItem(jobOdrStruct);
					selectStruct.seth_JOB_ODR_DLV_DATE(jobOdrStruct.geth_JOB_ODR_DLV_DATE());
					selectStruct.seth_JOB_ODR_DLV_DATE_TIME(jobOdrStruct.geth_JOB_ODR_DLV_DATE_TIME());
				}
			}


			//�Ɩ��^�p���̎擾
			selectStruct.setPLANT_CD(this.sysPLANT_CD);
			List oprDateList = entity.mselectBUSINESS_OPR_DATE.read(conn,selectStruct);
			if (oprDateList == null || oprDateList.size() <= 0) {
				//�f�[�^�����݂��Ȃ�
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", 
						this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
				setReadStatus(ERROR);
				return;
			}
			AD0010010Struct oprDateStruct = (AD0010010Struct)oprDateList.get(0);
			setStandardItem(oprDateStruct);
			selectStruct.seth_BUSINESS_OPR_DATE(oprDateStruct.geth_BUSINESS_OPR_DATE());
			
			selectStruct.seth_OPR_INST_QTY(selectStruct.getOPR_INST_QTY());
			selectStruct.seth_WORK_ODR_CD(selectStruct.getWORK_ODR_CD());
			//���O��敪�̕\���͓���Œ�
			selectStruct.setOUTSIDE_TYP("1");
			
			//�i�ڎ�z�敪�ƍ�Ǝ��ы敪�̐����擾�i�R���{�{�b�N�X�l�j
			selectStruct.setMRP_ODR_TYP_DN(multcombo("MRP_ODR_TYP",selectStruct.getMRP_ODR_TYP()));
			selectStruct.setOPR_RSLT_TYP_DN(multcombo("OPR_RSLT_TYP",selectStruct.getOPR_RSLT_TYP()));
			
			//�����Ǘ����Ȃ��Ƃ��͎�����\�����Ȃ�
			if(!(struct.getTIME_CTRL()).equals("true")){
				selectStruct.setWORK_ODR_DLV_DATE_TIME("");
				selectStruct.setOPR_INST_START_DATE_TIME("");
			}
							
			copyStruct(selectStruct);

			
			setReadStatus(NORMAL);

		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}


                //}}user_implement_dev:<controlSelect>
		logger.exiting("AD0010010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0010");
		logger.entering("AD0010010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>


		try {
			//�T�[�o�[���`�F�b�N	
			
			String WORK_ODR_DLV_DATE_TIME = "0000";		//�i�ڕʐ����[���p
			String OPR_INST_START_DATE_TIME = "0000";	//�i�ڕʐ���������p
			
			//���͎����̃`�F�b�N(�����Ǘ�����ꍇ�̂�)
			if((struct.getTIME_CTRL()).equals("true")){
				WORK_ODR_DLV_DATE_TIME = struct.getWORK_ODR_DLV_DATE_TIME();
				//�@�i�ڕʐ����[��(����)�̃`�F�b�N
				if((WORK_ODR_DLV_DATE_TIME).length() == 0 ){
					//Null��2359�ɐݒ�
					WORK_ODR_DLV_DATE_TIME = "2359";
				}else if((WORK_ODR_DLV_DATE_TIME).length() == 3 ){
					//�R���͓��ɂO��t����
					WORK_ODR_DLV_DATE_TIME = "0" + WORK_ODR_DLV_DATE_TIME;
				}
				
				
				//�A�i�ڕʐ��������(����)�̃`�F�b�N
				if( (struct.getOPR_INST_START_DATE()).equals("") && (struct.getOPR_INST_START_DATE_TIME()).equals("") ){	//NULL�̏ꍇ�͎����Z�o
				}else{
					OPR_INST_START_DATE_TIME = struct.getOPR_INST_START_DATE_TIME();
					if((OPR_INST_START_DATE_TIME).length() == 0 ){
						//Null��2359�ɐݒ�
						OPR_INST_START_DATE_TIME = "2359";
					}else if((OPR_INST_START_DATE_TIME).length() == 3 ){
						//�R���͓��ɂO��t����
						OPR_INST_START_DATE_TIME = "0" + OPR_INST_START_DATE_TIME;
					}
				}
			}
			
			
			//���͂��ꂽ[�i�ڔԍ�]�l��[�i��]�ɑ��݂��Ȃ��ꍇ�G���[
			List itemList = entity.mselectM_ITEM_CD.read(conn,struct);
			if (itemList == null || itemList.size() <= 0) {
				setErrorMessage("AD30825");
				setWarningSysLogMessage("M_ITEM.ITEM_CD", 
						this.struct.getITEM_CD());//�i�ڔԍ�
				return;
			}
		
			//���͂��ꂽ[�i��]�̕i�ڎ�z�敪��1,2,3,8�̏ꍇ�G���[
			AD0010010Struct itemStruct = (AD0010010Struct)itemList.get(0);
			setStandardItem(itemStruct);
			if ("1".equals(itemStruct.getMRP_ODR_TYP()) 
					|| "2".equals(itemStruct.getMRP_ODR_TYP()) 
					|| "3".equals(itemStruct.getMRP_ODR_TYP()) 
					|| "8".equals(itemStruct.getMRP_ODR_TYP())) {
				setErrorMessage("AD32217");
				setWarningSysLogMessage("M_ITEM.ITEM_CD", 
						this.struct.getITEM_CD());//�i�ڔԍ�
				setWarningSysLogMessage("M_ITEM.MRP_ODR_TYP", 
						itemStruct.getMRP_ODR_TYP());//�i�ڎ�z�敪
			}
			
			//[�i��].�g��Ǝ��ы敪�h �� 2�F��Ǝw������ �ŁA�u��Ƌ�R�[�h�v �����͂��ꂽ����ꍇ
			if("2".equals(itemStruct.getOPR_RSLT_TYP()) && !"".equals(struct.getWS_CD())){
				setErrorMessage("AD00227");
				return;
			}
			// �i�ڑΉ������J�����_�[�ԍ����݂����ꍇ�A�J�����_�[���ׂ̑��ݐ��`�F�b�N
			List calList = entity.mSelectM_CAL3.read(conn,struct);
			if(!calList.isEmpty() &&  (((AD0010010Struct)calList.get(0)).getCAL_NO()== null
					|| "".equals(((AD0010010Struct)calList.get(0)).getCAL_NO()))) {
				// �J�����_���׃f�[�^�����݂��܂���B
				setErrorMessage("ZZ06002");
				setWarningSysLogMessage("ITEM_CD", struct.getITEM_CD());
				return;
			}

			//���͂��ꂽ�����[�����x���������ꍇ�G���[
			Date dateWorkOdrDlvDate = _df.parse(this.struct.getWORK_ODR_DLV_DATE());
			String strWorkOdrDlvDate = Converter.dateToStr(dateWorkOdrDlvDate, "yyyy/MM/dd");
			this.struct.setDATE(strWorkOdrDlvDate);
			this.struct.setPLANT_CD(getsysPLANT_CD());
			//�i�ڔԍ��������L�[�Ƃ��ēǍ�
			List dateList = entity.mSelectM_CAL1.read(conn,struct);
			if (dateList == null || dateList.size() <= 0) {
				//�H��R�[�h�������L�[�Ƃ��ēǍ�
				dateList = entity.mselectM_CAL.read(conn,struct);
				if(dateList == null || dateList.size() <= 0){
					//�f�[�^�����݂��Ȃ�
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("M_PLANT.PLANT_CD", this.struct.getPLANT_CD());
					setWarningSysLogMessage("M_CAL.CAL_DATE",
						this.struct.getWORK_ODR_DLV_DATE());//�����[��
						return;
				}else{
					AD0010010Struct dateStruct = (AD0010010Struct)dateList.get(0);
					setStandardItem(dateStruct);
					if ("1".equals(dateStruct.getHOLIDAY_FLG())) {
						setErrorMessage("AD00036");
						setWarningSysLogMessage("M_PLANT.PLANT_CD", this.struct.getPLANT_CD());
						setWarningSysLogMessage("M_CAL.CAL_DATE", 
						this.struct.getWORK_ODR_DLV_DATE());//�����[��
						return;
					}
				}
			}else{
				AD0010010Struct dateStruct = (AD0010010Struct)dateList.get(0);
				setStandardItem(dateStruct);
				if ("1".equals(dateStruct.getHOLIDAY_FLG())) {
					setErrorMessage("AD00036");
					setWarningSysLogMessage("M_ITEM.ITEM_CD", this.struct.getITEM_CD());
					setWarningSysLogMessage("M_CAL.CAL_DATE",
						this.struct.getWORK_ODR_DLV_DATE());//�����[��
					return;
				}
			}

			//������̃`�F�b�N
			if (this.struct.getOPR_INST_START_DATE() == null 
					|| "".equals(this.struct.getOPR_INST_START_DATE())) {

				// 20081222 MOD��
				// EJa-ASPROVA�A�g�I�v�V���������̏ꍇ
				if("1".equals(_SysInstallOptions_ASP)){	
					String prop_lot = "1";
					List ltList = entity.mselectLT.read(conn,struct);
					if (ltList == null || ltList.size() == 0) {
						//�f�[�^�����݂��Ȃ�
						setErrorMessage("ZZ01101");
						setWarningSysLogMessage("M_PLANT.PLANT_CD", this.struct.getPLANT_CD());
						setWarningSysLogMessage("M_CAL.CAL_DATE", 
								this.struct.getOPR_INST_START_DATE());//���������
					} else {
						AD0010010Struct ltStruct = (AD0010010Struct)ltList.get(0);
						prop_lot = ltStruct.getPROP_LOT_SIZE();
					}
					
		        	 String sWkDate, sShiftMin,sWkTime ;
		        	
						 ATAspBom ab = new ATAspBom(conn, this.sysPLANT_CD, 
								this.sysUSER_CD, 
								this.getProgramId());
						 ATWorkCalendar atWC = new ATWorkCalendar(conn, 
								this.sysUSER_CD , 
								this.getProgramId(), 
								this.sysPLANT_CD) ;
					 Date odrStartDate = null;		  // ��z�����
					 Date prdStartDate = null;		  // ���������
					 Date prdDueDate = null;		  // �����[��
					 Date dueDate = null;		  	// �v���[��
	
					//�����[��������̏��
					prdDueDate = StrngToDt(this.struct.getWORK_ODR_DLV_DATE() + " " + (WORK_ODR_DLV_DATE_TIME).substring(0,2) + ":" + (WORK_ODR_DLV_DATE_TIME).substring(2,4));
					//��CHG 20081208 �v���[����LT�V�t�g(�{)-----------------------------
					sShiftMin = ab.getIssueLtMin(struct.getITEM_CD(),"U");
					dueDate = atWC.calcShiftMinute(prdDueDate, sShiftMin, ATWorkCalendar.SHIFT_END);	//Conv
					sWkDate =DtToStrng(dueDate);
					struct.seth_DUE_DATE(sWkDate);
					//-------------------------------------20081208
					//��CHG 20081208 ���������LT�V�t�g(�|)-----------------------------
					 //strOprInstQty, prop_lot
					//��Ǝw������؂�グ��������
					BigDecimal StrOprInstQty = new BigDecimal(this.struct.getOPR_INST_QTY());
					BigDecimal OprInstQty = StrOprInstQty.setScale(0, BigDecimal.ROUND_UP);
					String strOprInstQty = OprInstQty.toString();
					
					sShiftMin = ab.getProdLtMin(struct.getITEM_CD(),strOprInstQty,prop_lot,"U");
					sShiftMin = Calculate.multiply(sShiftMin,"-1"); //�ߋ���
					prdStartDate = atWC.calcShiftMinute(prdDueDate, sShiftMin, ATWorkCalendar.SHIFT_START);	//Conv
					sWkDate =DtGetDate(prdStartDate);
					sWkTime =DtGetTime(prdStartDate);
					this.struct.setOPR_INST_START_DATE(sWkDate);
					this.struct.setOPR_INST_START_DATE_TIME(sWkTime);
					OPR_INST_START_DATE_TIME = sWkTime;
					//-------------------------------------20081208
					//��CHG 20081208 ��z�����LT�V�t�g(�|)-----------------------------				
					sShiftMin = ab.getOdrLtMin(struct.getITEM_CD(),"U");
					sShiftMin = Calculate.multiply(sShiftMin,"-1"); //�ߋ���
					odrStartDate = atWC.calcShiftMinute(prdStartDate, sShiftMin, ATWorkCalendar.SHIFT_START);	//Conv
					sWkDate =DtToStrng(odrStartDate);
					struct.seth_ODR_START_DATE(sWkDate);
					//-------------------------------------20081208	
		            _debugMsg = ("(AD0010/EJa-ASP)TIME: "
		            	   + "DUE_DATE" + "[" + this.struct.geth_DUE_DATE() + "]," 
		         		   + "WORK_ODR_DLV_DATE" + "[" + this.struct.getWORK_ODR_DLV_DATE() + "],"  
		         		   + "OPR_INST_START_DATE" + "[" + this.struct.getOPR_INST_START_DATE() + "],"  
		         		   + "ODR_START_DATE" + "[" + struct.geth_ODR_START_DATE() + "] " );
			        sysLog.info("ZZ01006",struct.getsUser_ID(), _debugMsg );
			        //-------------------------------------20081208	 
	     
				}else{	
					//������̎����v�Z
					List ltList = entity.mselectLT.read(conn,struct);
					if (ltList == null || ltList.size() == 0) {
						//�f�[�^�����݂��Ȃ�
						setErrorMessage("ZZ01101");
						setWarningSysLogMessage("M_PLANT.PLANT_CD", this.struct.getPLANT_CD());
						setWarningSysLogMessage("M_CAL.CAL_DATE", 
								this.struct.getOPR_INST_START_DATE());//���������
	
					} else {
						AD0010010Struct ltStruct = (AD0010010Struct)ltList.get(0);
						setStandardItem(ltStruct);
						String fixed = ltStruct.getFIXED_LT();
						String prop = ltStruct.getPROP_LT();
						String safety = ltStruct.getSAFETY_LT();
						String prop_lot = ltStruct.getPROP_LOT_SIZE();
						//��Ǝw������؂�グ��������
						String itemLt = Calculate.divide(struct.getOPR_INST_QTY(), prop_lot, 0, Calculate._CEIL);
						//�i�ڂ̃��[�h�^�C��
						itemLt = Calculate.multiply(itemLt, prop);
						itemLt = Calculate.add(itemLt, fixed);
						itemLt = Calculate.add(itemLt, safety);
						itemLt = Calculate.multiply(itemLt, "-1");
						//������������v�Z����
						String StrOprInstStartDate = calcWorkDay(struct.getWORK_ODR_DLV_DATE(),WORK_ODR_DLV_DATE_TIME, itemLt, true);

						if(StrOprInstStartDate == null){
							// �Ɩ����t�̎擾�Ɏ��s���܂����B
							setErrorMessage("KQ00026");
							setWarningSysLogMessage("M_PLANT.PLANT_CD", this.struct.getPLANT_CD());
							setWarningSysLogMessage("M_CAL.CAL_DATE", struct.getWORK_ODR_DLV_DATE());//�����[��
							return;
						} else {
							this.struct.setOPR_INST_START_DATE(StrOprInstStartDate.substring(0,10));
							OPR_INST_START_DATE_TIME = StrOprInstStartDate.substring(11,15);
						}
					}
				     // 20081222 MOD�� 
				}	
				
				
			} else {

				//���͂��ꂽ������������x���������ꍇ�G���[
				Date dateOprInstStartDate = _df.parse(this.struct.getOPR_INST_START_DATE());
				String strOprInstStartDate =
						Converter.dateToStr(dateOprInstStartDate, "yyyy/MM/dd");
				this.struct.setDATE(strOprInstStartDate);
				this.struct.setPLANT_CD(getsysPLANT_CD());
				//�i�ڔԍ��������L�[�Ƃ��ēǍ�
				List dateList2 = entity.mSelectM_CAL1.read(conn,struct);
				if (dateList2 == null || dateList2.size() == 0) {
					//�H��R�[�h�������L�[�Ƃ��ēǍ�
					dateList2 = entity.mselectM_CAL.read(conn,struct);
					if(dateList2 == null || dateList2.size() <= 0){
						//�f�[�^�����݂��Ȃ�
						setErrorMessage("ZZ01101");
						setWarningSysLogMessage("M_PLANT.PLANT_CD", this.struct.getPLANT_CD());
						setWarningSysLogMessage("M_CAL.CAL_DATE", 
							this.struct.getOPR_INST_START_DATE());//���������
						return;
				} else {
					AD0010010Struct dateStruct2 = (AD0010010Struct)dateList2.get(0);
					setStandardItem(dateStruct2);
					if ("1".equals(dateStruct2.getHOLIDAY_FLG())) {
						setErrorMessage("AD00038");
						setWarningSysLogMessage("M_PLANT.PLANT_CD", this.struct.getPLANT_CD());
						setWarningSysLogMessage("M_CAL.CAL_DATE", 
								this.struct.getOPR_INST_START_DATE());//���������
						return;
					}
				}
				}else{
					AD0010010Struct dateStruct2 = (AD0010010Struct)dateList2.get(0);
					setStandardItem(dateStruct2);
				if ("1".equals(dateStruct2.getHOLIDAY_FLG())) {
					setErrorMessage("AD00038");
					setWarningSysLogMessage("M_ITEM.ITEM_CD", this.struct.getITEM_CD());
					setWarningSysLogMessage("M_CAL.CAL_DATE",
						this.struct.getOPR_INST_START_DATE());//���������
					return;
				}
			}
			}

			//�u��Ǝ��ы敪�v���P(�o��������)�ȊO�̏ꍇ�ŁA
			// ��Ǝw���ԍ�����͂����ꍇ�G���[
			if (!"1".equals(itemStruct.getOPR_RSLT_TYP())) {
				if (this.struct.getOPR_INST_CD() != null 
						|| "".equals(this.struct.getOPR_INST_CD()) == false) {
				 } else {
					setErrorMessage("AD00003");
					setWarningSysLogMessage("M_ITEM.ITEM_CD", 
							this.struct.getITEM_CD());//�i�ڔԍ�
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.OPR_RSLT_TYP", 
							itemStruct.getOPR_RSLT_TYP());//��Ǝ��ы敪
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.OPR_INST_CD", 
							this.struct.getOPR_INST_CD());//��Ǝw���ԍ�

				}
			}

			//�u��Ǝ��ы敪�v���P(�o��������)�ŁA��Ƌ�R�[�h��NULL�̏ꍇ�G���[
			if ("1".equals(itemStruct.getOPR_RSLT_TYP())
					&& (this.struct.getWS_CD() == null 
					|| "".equals(this.struct.getWS_CD()))) {
				setErrorMessage("AD30041");
				setWarningSysLogMessage("M_ITEM.ITEM_CD", 
						this.struct.getITEM_CD());//�i�ڔԍ�
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.OPR_RSLT_TYP", 
						itemStruct.getOPR_RSLT_TYP());//��Ǝ��ы敪
				return;
			}

			//��Ƌ悪NULL�ȊO�̏ꍇ
			if (struct.getWS_CD() != null && !"".equals(struct.getWS_CD())) {
				List wsCdList = entity.mreadWS_CD.read(conn,struct);
				if (wsCdList == null || wsCdList.size() == 0) {
					setErrorMessage("AD20029");
					setWarningSysLogMessage("M_ITEM.ITEM_CD", 
							this.struct.getITEM_CD());//�i�ڔԍ�
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.OPR_RSLT_TYP", 
							itemStruct.getOPR_RSLT_TYP());//��Ǝ��ы敪
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WS_CD", 
							this.struct.getWS_CD());//��Ƌ�R�[�h

				} else {
					//���[�U�̏�������H��R�[�h�ƁA
					//���͂�����Ƌ�R�[�h�̍H��R�[�h���قȂ�ꍇ�G���[
					AD0010010Struct wsCdStruct = (AD0010010Struct)wsCdList.get(0);
					setStandardItem(wsCdStruct);
					if (!this.sysPLANT_CD.equals(wsCdStruct.getPLANT_CD())) {
						setErrorMessage("AD00004");
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WS_CD", 
								this.struct.getWS_CD());//��Ƌ�R�[�h
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.PLANT_CD", 
								this.sysPLANT_CD);//���[�U�̏�������H��R�[�h

					}
				}
			}

			//[�i��].�݌ɐ��ʒP�ʋ敪=1�Łu��Ǝw�����v�ɏ��������͂��ꂽ�ꍇ�A
			//�؂�グ����������
			BigDecimal OprInstQty_up = new BigDecimal(this.struct.getOPR_INST_QTY());
			if ("1".equals(itemStruct.geth_UNIT_QTY_TYP())) {
				BigDecimal OprInstQty2 = new BigDecimal("0");
				OprInstQty2 = OprInstQty_up.setScale(0,BigDecimal.ROUND_UP);
				//�؂�グ�����O�ƌ�Œl���قȂ��Ă�����
				//���������͂���Ă����Ɣ��f�����[�j���O
				if ( OprInstQty_up.doubleValue() != OprInstQty2.doubleValue()) { 
					setWarningMessage("AD00043");
					setWarningSysLogMessage("M_ITEM.ITEM_CD", 
							this.struct.getITEM_CD());//�i�ڔԍ�
					setInfoSysLogMessage("T_WORK_IN_PROC_BY_ITEM.OPR_INST_QTY", 
							this.struct.getOPR_INST_QTY());//��Ǝw����
				}
				//�i�ڂ������Ǘ��i�̏ꍇ�A�؏グ���s��
				OprInstQty_up = OprInstQty_up.setScale(0, BigDecimal.ROUND_UP);
			}
			this.struct.setOPR_INST_QTY(OprInstQty_up.toString());


			// �G���[������ΏI��
			if (msgStruct.hasError()) {
				return;
			}


			//���R�[�h�o�^

			//���v�ʂ̃I�[�_���̒ǉ��A���v�ʂ̉��ʃf�}���h�̒ǉ�
			// 20081222 MOD��
			 // EJa-ASPROVA�A�g�I�v�V���������̏ꍇ
			String odNoString;
			 if("1".equals(_SysInstallOptions_ASP)){	
					ATCommonOd od = 
						new ATCommonOd(conn,
							this.sysPLANT_CD,
							this.sysUSER_CD,
							this.sp.getProcId());
					
						//�I�[�_�[�f�}���h�ԍ����Z�b�g����
						odNoString = 
						od.addOdInfo(this.struct.getITEM_CD(),
							Converter.strToDate(
								struct.getWORK_ODR_DLV_DATE() + " " + WORK_ODR_DLV_DATE_TIME, Converter.SLASH_DATE_HOUR_MINUTE),
							Converter.strToDate(
								struct.getOPR_INST_START_DATE() + " " + OPR_INST_START_DATE_TIME, Converter.SLASH_DATE_HOUR_MINUTE),
							Double.parseDouble(this.struct.getOPR_INST_QTY()),
							3,
							new Integer(this.struct.getOUTSIDE_TYP()).intValue());

			 }else{
					CommonOd od = 
						new CommonOd(conn,
							this.sysPLANT_CD,
							this.sysUSER_CD,
							this.sp.getProcId());
				//�I�[�_�[�f�}���h�ԍ����Z�b�g����
				odNoString = 
				od.addOdInfo(this.struct.getITEM_CD(),
					Converter.strToDate(
						struct.getWORK_ODR_DLV_DATE() + " " + WORK_ODR_DLV_DATE_TIME, Converter.SLASH_DATE_HOUR_MINUTE),
					Converter.strToDate(
						struct.getOPR_INST_START_DATE() + " " + OPR_INST_START_DATE_TIME, Converter.SLASH_DATE_HOUR_MINUTE),
					Double.parseDouble(this.struct.getOPR_INST_QTY()),
					3);
			 }
			// 20081222 MOD��

			this.struct.setOD_NO(odNoString);

			//��ƌv��ԍ��̍̔�
			CollectNumber ODR_CD = 
					new CollectNumber(CollectNumber.ODR_CD,
						this.sysUSER_CD, 
						this.sp.getProcId(),
						this.sysPLANT_CD);
			String strOdrCd = ODR_CD.getNo();
			if (strOdrCd == null || "".equals(strOdrCd)) {
				//�̔Ԏ��s
				setErrorMessage("ZZ01106");
				return;
			} else {
				this.struct.setWORK_ODR_CD(strOdrCd);
			}

			//��Ǝ��ы敪���P�̏ꍇ�A��Ǝw���`�[�쐬�B
			if ("1".equals(itemStruct.getOPR_RSLT_TYP())) {
				this.struct.setOPR_INST_CD(null);
				if (this.struct.getOPR_INST_CD() == null 
						|| "".equals(this.struct.getOPR_INST_CD())) {
					//��Ǝw���ԍ��̍̔�
					CollectNumber OPR_INST_CD = 
							new CollectNumber(CollectNumber.INST_CD,
								this.sysUSER_CD, 
								this.sp.getProcId(), 
								this.sysPLANT_CD);
					String strOprInstCd = OPR_INST_CD.getNo();
					if (strOprInstCd == null || "".equals(strOprInstCd)) {
						//�̔Ԏ��s
						setErrorMessage("ZZ01106");
						return;
					} else {
						this.struct.setOPR_INST_CD(strOprInstCd);
						//��Ǝw���ԍ���[��Ǝw���`�[]�ɑ��݂����ꍇ�G���[
						List oprInstCdList = entity.mreadOPR_INST_CD.read(conn,struct);
						if (oprInstCdList == null || oprInstCdList.size() <= 0) {
						} else {
							setErrorMessage("AD32213");
							setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.OPR_INST_CD", 
									this.struct.getOPR_INST_CD());//��Ǝw���ԍ�
							return;
						}

					}
				}
				this.struct.setPLANT_CD(this.sysPLANT_CD);
				entity.minsertT_OPR_INST_SLIP.create(conn, struct);
			}


			//�i�ڕʎd�|�̒ǉ����̈�Ӑ���`�F�b�N
			List workOdrCdList = entity.mCheckWORK_IN_PROC_BY_ITEM.read(conn, struct);
			if (workOdrCdList != null && workOdrCdList.size() > 0) {
				setErrorMessage("ZZ01102");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD",
						this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
				setReadStatus(ERROR);
				return;
			}

			//�i�ڕʎd�|�̒ǉ�
			this.struct.setOPR_RSLT_TYP(itemStruct.getOPR_RSLT_TYP());
			struct.setOPR_INST_START_DATE_ALL(struct.getOPR_INST_START_DATE() + " " + OPR_INST_START_DATE_TIME );
			struct.setWORK_ODR_DLV_DATE_ALL(struct.getWORK_ODR_DLV_DATE() + " " + WORK_ODR_DLV_DATE_TIME );
			int nRet = entity.minsert.create(conn, struct);

			conn.commit();

			//��ʂ̍Č���
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
			
		} catch (ParseException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
			
		} catch (ApsComException e) {
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


                //}}user_implement_dev:<controlInsert>
		logger.exiting("AD0010010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0010");
		logger.entering("AD0010010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>


		try {			
			_outSideTyp = "";
			//�T�[�o�[���`�F�b�N
			String WORK_ODR_DLV_DATE_TIME = "0000";		//�i�ڕʐ����[���p
			String OPR_INST_START_DATE_TIME = "0000";	//�i�ڕʐ���������p
			
			//���͎����̃`�F�b�N(�����Ǘ�����ꍇ�̂�)
			if((struct.getTIME_CTRL()).equals("true")){
				WORK_ODR_DLV_DATE_TIME = struct.getWORK_ODR_DLV_DATE_TIME();
				//�@�i�ڕʐ����[��(����)�̃`�F�b�N
				//(1)����
				if((WORK_ODR_DLV_DATE_TIME).length() == 0 ){
					//Null��2359�ɐݒ�
					WORK_ODR_DLV_DATE_TIME = "2359";
				}else if((WORK_ODR_DLV_DATE_TIME).length() < 3 ){
					//�P���Q���̓G���[
					setErrorMessage("AS00027", WORK_ODR_DLV_DATE_TIME);
					return;
				}else if((WORK_ODR_DLV_DATE_TIME).length() == 3 ){
					//�R���͓��ɂO��t����
					WORK_ODR_DLV_DATE_TIME = "0" + WORK_ODR_DLV_DATE_TIME;
				}
				
				
				//�A�i�ڕʐ��������(����)�̃`�F�b�N
				if( (struct.getOPR_INST_START_DATE()).equals("") && (struct.getOPR_INST_START_DATE_TIME()).equals("") ){	//NULL�̏ꍇ�͎����Z�o
				}else{
					OPR_INST_START_DATE_TIME = struct.getOPR_INST_START_DATE_TIME();
					if((OPR_INST_START_DATE_TIME).length() == 0 ){
						//Null��2359�ɐݒ�
						OPR_INST_START_DATE_TIME = "2359";
					}else if((OPR_INST_START_DATE_TIME).length() < 3 ){
						//�P���Q���̓G���[
						setErrorMessage("AS00029", OPR_INST_START_DATE_TIME);
						return;
					}else if((OPR_INST_START_DATE_TIME).length() == 3 ){
						//�R���͓��ɂO��t����
						OPR_INST_START_DATE_TIME = "0" + OPR_INST_START_DATE_TIME;
					}
				}
			}
			
			// �i�ڑΉ������J�����_�[�ԍ����݂����ꍇ�A�J�����_�[���ׂ̑��ݐ��`�F�b�N
			List calList = entity.mSelectM_CAL3.read(conn,struct);
			if(!calList.isEmpty() &&  (((AD0010010Struct)calList.get(0)).getCAL_NO()== null
					|| "".equals(((AD0010010Struct)calList.get(0)).getCAL_NO()))) {
				// �J�����_���׃f�[�^�����݂��܂���B
				setErrorMessage("ZZ06002");
				setWarningSysLogMessage("ITEM_CD", struct.getITEM_CD());
				return;
			}
			
			//���͂��ꂽ�����[�����x���������ꍇ�G���[
			Date dateWorkOdrDlvDate = _df.parse(this.struct.getWORK_ODR_DLV_DATE());
			String strWorkOdrDlvDate = Converter.dateToStr(dateWorkOdrDlvDate, "yyyy/MM/dd");
			this.struct.setDATE(strWorkOdrDlvDate);
			this.struct.setPLANT_CD(getsysPLANT_CD());
			//�i�ڔԍ��������L�[�Ƃ��ēǍ�
			List dateList = entity.mSelectM_CAL1.read(conn,struct);
			if (dateList == null || dateList.size() <= 0) {
				//�H��R�[�h�������L�[�Ƃ��ēǍ�
				dateList = entity.mselectM_CAL.read(conn,struct);
				if(dateList == null || dateList.size() <= 0){
					//�f�[�^�����݂��Ȃ�
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("M_PLANT.PLANT_CD", this.struct.getPLANT_CD());
					setWarningSysLogMessage("M_CAL.CAL_DATE",
						this.struct.getWORK_ODR_DLV_DATE());//�����[��
						return;
				}else{
					AD0010010Struct dateStruct = (AD0010010Struct)dateList.get(0);
					setStandardItem(dateStruct);
					if ("1".equals(dateStruct.getHOLIDAY_FLG())) {
						setErrorMessage("AD00036");
						setWarningSysLogMessage("M_PLANT.PLANT_CD", this.struct.getPLANT_CD());
						setWarningSysLogMessage("M_CAL.CAL_DATE", 
								this.struct.getWORK_ODR_DLV_DATE());//�����[��
						return;
					}
				}
			}else{
				AD0010010Struct dateStruct = (AD0010010Struct)dateList.get(0);
				setStandardItem(dateStruct);
				if ("1".equals(dateStruct.getHOLIDAY_FLG())) {
					setErrorMessage("AD00036");
					setWarningSysLogMessage("M_ITEM.ITEM_CD", this.struct.getITEM_CD());
					setWarningSysLogMessage("M_CAL.CAL_DATE",
					this.struct.getWORK_ODR_DLV_DATE());//�����[��
					return;
				}
			}

			//������̎����v�Z
			if (this.struct.getOPR_INST_START_DATE() == null 
					|| "".equals(this.struct.getOPR_INST_START_DATE())) {
				// 20081222 MOD��
				// EJa-ASPROVA�A�g�I�v�V���������̏ꍇ
				if("1".equals(_SysInstallOptions_ASP)){	
					String prop_lot = "1";
					List ltList = entity.mselectLT.read(conn,struct);
					if (ltList == null || ltList.size() == 0) {
						//�f�[�^�����݂��Ȃ�
						setErrorMessage("ZZ01101");
						setWarningSysLogMessage("M_PLANT.PLANT_CD", this.struct.getPLANT_CD());
						setWarningSysLogMessage("M_CAL.CAL_DATE", 
								this.struct.getOPR_INST_START_DATE());//���������
					} else {
						AD0010010Struct ltStruct = (AD0010010Struct)ltList.get(0);
						prop_lot = ltStruct.getPROP_LOT_SIZE();
					}
					
		        	 String sWkDate, sShiftMin,sWkTime ;
		        	
						 ATAspBom ab = new ATAspBom(conn, this.sysPLANT_CD, 
								this.sysUSER_CD, 
								this.getProgramId());
						 ATWorkCalendar atWC = new ATWorkCalendar(conn, 
								this.sysUSER_CD , 
								this.getProgramId(), 
								this.sysPLANT_CD) ;
					 Date odrStartDate = null;		  // ��z�����
					 Date prdStartDate = null;		  // ���������
					 Date prdDueDate = null;		  // �����[��
					 Date dueDate = null;		  	// �v���[��
	
					//�����[��������̏��
					prdDueDate = StrngToDt(this.struct.getWORK_ODR_DLV_DATE() + " " + (WORK_ODR_DLV_DATE_TIME).substring(0,2) + ":" + (WORK_ODR_DLV_DATE_TIME).substring(2,4));
					//��CHG 20081208 �v���[����LT�V�t�g(�{)-----------------------------
					sShiftMin = ab.getIssueLtMin(struct.getITEM_CD(),"U");
					dueDate = atWC.calcShiftMinute(prdDueDate, sShiftMin, ATWorkCalendar.SHIFT_END);	//Conv
					sWkDate =DtToStrng(dueDate);
					struct.seth_DUE_DATE(sWkDate);
					//-------------------------------------20081208
					//��CHG 20081208 ���������LT�V�t�g(�|)-----------------------------
					 //strOprInstQty, prop_lot
					//��Ǝw������؂�グ��������
					BigDecimal StrOprInstQty = new BigDecimal(this.struct.getOPR_INST_QTY());
					BigDecimal OprInstQty = StrOprInstQty.setScale(0, BigDecimal.ROUND_UP);
					String strOprInstQty = OprInstQty.toString();
					
					sShiftMin = ab.getProdLtMin(struct.getITEM_CD(),strOprInstQty,prop_lot,"U");
					sShiftMin = Calculate.multiply(sShiftMin,"-1"); //�ߋ���
					prdStartDate = atWC.calcShiftMinute(prdDueDate, sShiftMin, ATWorkCalendar.SHIFT_START);	//Conv
					sWkDate =DtGetDate(prdStartDate);
					sWkTime =DtGetTime(prdStartDate);
					this.struct.setOPR_INST_START_DATE(sWkDate);
					this.struct.setOPR_INST_START_DATE_TIME(sWkTime);
					OPR_INST_START_DATE_TIME = sWkTime;
					//-------------------------------------20081208
					//��CHG 20081208 ��z�����LT�V�t�g(�|)-----------------------------				
					sShiftMin = ab.getOdrLtMin(struct.getITEM_CD(),"U");
					sShiftMin = Calculate.multiply(sShiftMin,"-1"); //�ߋ���
					odrStartDate = atWC.calcShiftMinute(prdStartDate, sShiftMin, ATWorkCalendar.SHIFT_START);	//Conv
					sWkDate =DtToStrng(odrStartDate);
					struct.seth_ODR_START_DATE(sWkDate);
					//-------------------------------------20081208	
		            _debugMsg = ("(AD0010/EJa-ASP)TIME: "
		            	   + "DUE_DATE" + "[" + this.struct.geth_DUE_DATE() + "]," 
		         		   + "WORK_ODR_DLV_DATE" + "[" + this.struct.getWORK_ODR_DLV_DATE() + "],"  
		         		   + "OPR_INST_START_DATE" + "[" + this.struct.getOPR_INST_START_DATE() + "],"  
		         		   + "ODR_START_DATE" + "[" + struct.geth_ODR_START_DATE() + "] " );
			        sysLog.info("ZZ01006",struct.getsUser_ID(), _debugMsg );
			        //-------------------------------------20081208	 
				}else{			
					List ltList = entity.mselectLT.read(conn,struct);
					if (ltList == null || ltList.size() == 0) {
						//�f�[�^�����݂��Ȃ�
						setErrorMessage("ZZ01101");
						setWarningSysLogMessage("M_ITEM.ITEM_CD", 
								this.struct.getWORK_ODR_DLV_DATE());//�i�ڔԍ�
					} else {
						AD0010010Struct ltStruct = (AD0010010Struct)ltList.get(0);
						setStandardItem(ltStruct);
						String fixed = ltStruct.getFIXED_LT();
						String prop = ltStruct.getPROP_LT();
						String safety = ltStruct.getSAFETY_LT();
						String prop_lot = ltStruct.getPROP_LOT_SIZE();
	
						//��Ǝw������؂�グ��������
						String itemLt = Calculate.divide(struct.getOPR_INST_QTY(), prop_lot, 0, Calculate._CEIL);
						//�i�ڂ̃��[�h�^�C��
						itemLt = Calculate.multiply(itemLt, prop);
						itemLt = Calculate.add(itemLt, fixed);
						itemLt = Calculate.add(itemLt, safety);
						itemLt = Calculate.multiply(itemLt, "-1");
						//������������v�Z����
						String StrOprInstStartDate = calcWorkDay(struct.getWORK_ODR_DLV_DATE(),WORK_ODR_DLV_DATE_TIME, itemLt, true);

						if(StrOprInstStartDate == null){
							// �Ɩ����t�̎擾�Ɏ��s���܂����B
							setErrorMessage("KQ00026");
							setWarningSysLogMessage("M_PLANT.PLANT_CD", this.struct.getPLANT_CD());
							setWarningSysLogMessage("M_CAL.CAL_DATE", struct.getWORK_ODR_DLV_DATE());//�����[��
							return;
						} else {
							this.struct.setOPR_INST_START_DATE(StrOprInstStartDate.substring(0,10));
							OPR_INST_START_DATE_TIME = StrOprInstStartDate.substring(11,15);
						}
					}
				
				}
		        // 20081222 MOD��
				
			} else {
				//���͂��ꂽ������������x���������ꍇ�G���[
				Date dateOprInstStartDate = _df.parse(this.struct.getOPR_INST_START_DATE());
				String strOprInstStartDate =
						Converter.dateToStr(dateOprInstStartDate, "yyyy/MM/dd");
				this.struct.setDATE(strOprInstStartDate);
				this.struct.setPLANT_CD(getsysPLANT_CD());
				//�i�ڔԍ��������L�[�Ƃ��ēǍ�
				List dateList2 = entity.mSelectM_CAL1.read(conn,struct);
				if (dateList2 == null || dateList2.size() == 0) {
					//�H��R�[�h�������L�[�Ƃ��ēǍ�
					dateList2 = entity.mselectM_CAL.read(conn,struct);
					if(dateList2 == null || dateList2.size() <= 0){
						//�f�[�^�����݂��Ȃ�
						setErrorMessage("ZZ01101");
						setWarningSysLogMessage("M_PLANT.PLANT_CD", this.struct.getPLANT_CD());
						setWarningSysLogMessage("M_CAL.CAL_DATE", 
							this.struct.getOPR_INST_START_DATE());//���������
						return;
				} else {
					AD0010010Struct dateStruct2 = (AD0010010Struct)dateList2.get(0);
					setStandardItem(dateStruct2);
					if ("1".equals(dateStruct2.getHOLIDAY_FLG())) {
						setErrorMessage("AD00038");
						setWarningSysLogMessage("M_PLANT.PLANT_CD", this.struct.getPLANT_CD());
						setWarningSysLogMessage("M_CAL.CAL_DATE", 
						this.struct.getOPR_INST_START_DATE());//���������
						return;
					}
				}
				}else{
					AD0010010Struct dateStruct2 = (AD0010010Struct)dateList2.get(0);
					setStandardItem(dateStruct2);
					if ("1".equals(dateStruct2.getHOLIDAY_FLG())) {
						setErrorMessage("AD00038");
						setWarningSysLogMessage("M_ITEM.ITEM_CD", this.struct.getITEM_CD());
						setWarningSysLogMessage("M_CAL.CAL_DATE",
						this.struct.getOPR_INST_START_DATE());//���������
						return;
					}
				}
			}

			//�m��Ƌ�n�ɑ��݂��Ȃ���Ƌ�R�[�h����͂����ꍇ�G���[
			if ("1".equals(struct.getOUTSIDE_TYP())){
				if(struct.getWS_CD() != null && !"".equals(struct.getWS_CD())){
					List wsCdList = entity.mreadWS_CD.read(conn,struct);
					if (wsCdList.size() <= 0) {
						setErrorMessage("AD20029");
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", 
								this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WS_CD", 
								this.struct.getWS_CD());//��Ƌ�R�[�h
					} else {
						// ���[�U�̏�������H��R�[�h�ƁA���͂�����Ƌ�R�[�h�̍H��R�[�h��
						// �قȂ�ꍇ�G���[
						AD0010010Struct wsCdStruct = (AD0010010Struct)wsCdList.get(0);
						setStandardItem(wsCdStruct);
						if (!this.sysPLANT_CD.equals(wsCdStruct.getPLANT_CD())) {
							setErrorMessage("AD00004");
							setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", 
									this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
							setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.PLANT_CD",
									this.sysPLANT_CD);//���[�U�̏�������H��R�[�h
						}
					}
				}
			}

			//���ԕi�ڂ̏ꍇ
			if (this.struct.getJOB_ODR_CD() == null 
					|| "".equals(this.struct.getJOB_ODR_CD())) {
			} else {
				List jobOdrDlvDateList = entity.mselectJOB_ODR_DLV_DATE.read(conn, struct);
				if (jobOdrDlvDateList == null || jobOdrDlvDateList.size() <= 0) {
					//�f�[�^�����݂��Ȃ�
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", 
							this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
					setWarningSysLogMessage("T_OD.JOB_ODR_CD", struct.getJOB_ODR_CD());
					setWarningSysLogMessage("T_JOB_ODR.JOB_ODR_DLV_DATE",
							this.struct.geth_JOB_ODR_DLV_DATE());//�u���Ԍv��v���Ԕ[��
				} else {
					AD0010010Struct jobOdrDlvDateStruct =
							(AD0010010Struct)jobOdrDlvDateList.get(0);
					setStandardItem(jobOdrDlvDateStruct);
					this.struct.seth_JOB_ODR_DLV_DATE(
							jobOdrDlvDateStruct.geth_JOB_ODR_DLV_DATE());
					this.struct.seth_JOB_ODR_DLV_DATE_TIME(
							jobOdrDlvDateStruct.geth_JOB_ODR_DLV_DATE_TIME());
					Date dateJobOdrDlvDate  =
							_df.parse(this.struct.geth_JOB_ODR_DLV_DATE());

					//�u���Ԍv��v���Ԕ[���������[���̃`�F�b�N
					if (dateJobOdrDlvDate.compareTo(dateWorkOdrDlvDate) < 0 || (dateJobOdrDlvDate.compareTo(dateWorkOdrDlvDate) == 0 && (Integer.valueOf(struct.geth_JOB_ODR_DLV_DATE_TIME()).intValue() < Integer.valueOf(WORK_ODR_DLV_DATE_TIME).intValue()))) {
						if (DateTool.compareYMD(struct.geth_JOB_ODR_DLV_DATE(),struct.geth_BUSINESS_OPR_DATE()) >= 0) {
						    setErrorMessage("AD32214");
						    setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
						    setWarningSysLogMessage("T_JOB_ODR.JOB_ODR_CD", struct.getJOB_ODR_CD());
						    setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.CAL_DATE", this.struct.getWORK_ODR_DLV_DATE());//�����[��
						}else{
							setWarningMessage("AD32219");
							setInfoSysLogMessage("T_JOB_ODR.JOB_ODR_DLV_DATE", struct.geth_JOB_ODR_DLV_DATE());
							setInfoSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_DLV_DATE", struct.getWORK_ODR_DLV_DATE());
						}
					}

					// ��s��z����([���Ԍv��]."���Ԏ��"=2)�̍ŏ�ʕi�ڂ̏ꍇ�ŁA
					//�u�����[���v��min�i�����ԁE���Ԏ}�Ԃ��L�[�ɗv�����Ƃ̃f�}���h���������A
					// ����[���v��]."�v���[��"�j�ɂȂ�ꍇ
					if ("2".equals(jobOdrDlvDateStruct.getJOB_ODR_TYP())) {
						// �ŏ�ʕi��(�e�I�[�_�f�}���h�ԍ���NULL)�̏ꍇ
						if (struct.geth_PARENT_OD_NO() == null 
								|| "".equals(struct.geth_PARENT_OD_NO())) {
								
							List jobOdrAlcList = entity.mSelectJOB_ODR_ALC.read(conn, struct);
							if (jobOdrAlcList == null || jobOdrAlcList.size() == 0) {
								//�����f�[�^��������΁A�`�F�b�N���Ȃ��B
							} else {
								AD0010010Struct jobOdrAlcStruct = 
										(AD0010010Struct)jobOdrAlcList.get(0);
								setStandardItem(jobOdrAlcStruct);
								Date datealcDueDate = 
										Converter.strToDate(jobOdrAlcStruct.geth_DUE_DATE(),
											Converter.SLASH_DATE);
								
								//�u�����[���v��[���v��]."�v���[��"
								if (dateWorkOdrDlvDate.compareTo(datealcDueDate) > 0 || (dateWorkOdrDlvDate.compareTo(datealcDueDate) == 0 && (Integer.valueOf(WORK_ODR_DLV_DATE_TIME).intValue() > Integer.valueOf(jobOdrAlcStruct.geth_DUE_DATE_TIME()).intValue()))) {
									//�����[���ɖ���������܂��B
									setWarningMessage("AD00044");
									setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", 
											this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
									setWarningSysLogMessage("T_JOB_ODR.JOB_ODR_CD", 
											struct.getJOB_ODR_CD());
									setInfoSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_DLV_DATE", 
											struct.getWORK_ODR_DLV_DATE());
									setInfoSysLogMessage("T_OD.DUE_DATE", 
											jobOdrAlcStruct.geth_DUE_DATE());
								}
							}
						}
					}
				}

				BigDecimal oprInstQty = new BigDecimal(this.struct.getOPR_INST_QTY());
				BigDecimal hOprInstQty = new BigDecimal(this.struct.geth_OPR_INST_QTY());
				
				//�ŏ�ʕi�ڂ̏ꍇ�ō�Ǝw�������ύX���ꂽ�ꍇ
				if ((this.struct.geth_PARENT_OD_NO() == null 
						|| this.struct.geth_PARENT_OD_NO().equals(""))
						&& (oprInstQty.compareTo(hOprInstQty) != 0)) {
					setWarningMessage("AD00007");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", 
							this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
					setInfoSysLogMessage("T_WORK_IN_PROC_BY_ITEM.OPR_INST_QTY", 
							this.struct.getOPR_INST_QTY());//��Ǝw����
				}
			}


			//[�i��].�݌ɐ��ʒP�ʋ敪=1�Łu��Ǝw�����v�ɏ��������͂��ꂽ�ꍇ�A
			//�؂�グ����������
			BigDecimal OprInstQty_up = new BigDecimal(this.struct.getOPR_INST_QTY());
			if (this.struct.geth_UNIT_QTY_TYP().equals("1")) {
				BigDecimal OprInstQty2 = new BigDecimal("0");
				OprInstQty2 = OprInstQty_up.setScale(0,BigDecimal.ROUND_UP);

				//�؂�グ�����O�ƌ�Œl���قȂ��Ă����珬�������͂���Ă�����
				//���f�����[�j���O
				if (OprInstQty_up.doubleValue() != OprInstQty2.doubleValue()) { 
					setWarningMessage("AD00043");
					setInfoSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", 
							this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
					setInfoSysLogMessage("T_WORK_IN_PROC_BY_ITEM.OPR_INST_QTY", 
							this.struct.getOPR_INST_QTY());//��Ǝw����
				}
				//�i�ڂ������Ǘ��i�̏ꍇ�A�؏グ���s��
				OprInstQty_up = OprInstQty_up.setScale(0,BigDecimal.ROUND_UP);
			}
			this.struct.setOPR_INST_QTY(OprInstQty_up.toString());


			// �G���[������ΏI��
			if (msgStruct.hasError()) {
				return;
			}


			//MODIFY_COUNT�`�F�b�N
			List modifyCountList = entity.mselectMODIFY_COUNT.read(conn,struct);
			if (modifyCountList == null || modifyCountList.size() == 0) {
				//�f�[�^�����݂��Ȃ�
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", 
						this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
				return;
			}
			AD0010010Struct modifyCountStruct = (AD0010010Struct)modifyCountList.get(0);
			setStandardItem(modifyCountStruct);
			if (this.struct.geth_MODIFY_COUNT().equals(modifyCountStruct.geth_MODIFY_COUNT()) == false) {
				setErrorMessage("ZZ01105");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD",
						this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
				return;
			}
			this.struct.setOD_NO(modifyCountStruct.getOD_NO());


			//�i�ڕʎd�|���R�[�h�̍X�V
			struct.setOPR_INST_START_DATE_ALL(struct.getOPR_INST_START_DATE() + " " + OPR_INST_START_DATE_TIME );
			struct.setWORK_ODR_DLV_DATE_ALL(struct.getWORK_ODR_DLV_DATE() + " " + WORK_ODR_DLV_DATE_TIME );
			entity.mupdateT_WORK_IN_PROC_BY_ITEM.update(conn, struct);
			
			_outSideTyp = this.struct.getOUTSIDE_TYP();
			//�u���O��敪�v���Q(�O��)�ɕύX���ꂽ�ꍇ
			if ("2".equals(this.struct.getOUTSIDE_TYP())) {
				//�����ԍ��̍̔�
				CollectNumber PUCH_CD = 
						new CollectNumber(CollectNumber.PUCH_CD,
							this.sysUSER_CD, 
							this.sp.getProcId(),
							this.sysPLANT_CD);
				String strPuchCd = PUCH_CD.getNo();
				if (strPuchCd == null || strPuchCd.equals("")) {
					//�̔Ԏ��s
					setErrorMessage("ZZ01106");
					return;
				} else {
					this.struct.setPUCH_ODR_CD(strPuchCd);
				}

				//[����].��ЃR�[�h�̎擾
				List companyCdList = entity.mselectSYS_MY_COMPANY_CompanyCd.read(conn,struct);
				if (companyCdList == null || companyCdList.size() <= 0) {
					//�f�[�^�����݂��Ȃ�
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("SYS_MY_COMPANY.COMPANY_CD", 
							this.struct.getCOMPANY_CD());//��ЃR�[�h
					return;
				}
				AD0010010Struct companyCdStruct = (AD0010010Struct)companyCdList.get(0);
				setStandardItem(companyCdStruct);

				_companyCd = companyCdStruct.getCOMPANY_CD();
				this.struct.setCOMPANY_CD(_companyCd);
				this.struct.setPLANT_CD(this.sysPLANT_CD);
				this.struct.setITEM_CD(this.struct.getITEM_CD());

				//��\�����R�[�h�̎擾
				List unitCostList = entity.mselectM_PUCH_UNIT_COST_H.read(conn, struct);

				if (unitCostList == null || unitCostList.size() <= 0) {
					//��\�����R�[�h�����݂��Ȃ�
					this.struct.setVEND_CD("");            //��\�����R�[�h
					this.struct.setPUCH_ODR_PERSON("");    //�����S����
					this.struct.setUNIT_COST_TYP("1");     //�w���P���敪
					this.struct.setUNIT_COST("0");         //�w���P��
					this.struct.setPROCESSING_COST("0");   //�w�����H��
					this.struct.setMATERIAL_COST("0");     //�w���ޗ���
					this.struct.setOTHER_OVERHEADS("0");   //�w�����̑��o��
					this.struct.setPUCH_ODR_AMOUNT("0");   //�������z
					this.struct.setTAX_RATE_1("0");        //�ŗ�1
					this.struct.setTAX_RATE_2("0");        //�ŗ�2
					this.struct.setTAX_RATE_3("0");        //�ŗ�3
					this.struct.setTAX_CD("");             //�ŃR�[�h
					this.struct.setTAX_ROUND_TYP("1");     //�Œ[���敪
					this.struct.setNET_AMOUNT("0");        //�{�̋��z
					this.struct.setTAX_AMOUNT_1("0");      //�Ŋz1
					this.struct.setTAX_AMOUNT_2("0");      //�Ŋz2
					this.struct.setTAX_AMOUNT_3("0");      //�Ŋz3
					this.struct.setAMOUNT_INCLUDE_TAX("0");//�ō����z
					this.struct.setHOME_CUR_AMOUNT("0");   //�M�݋��z
					this.struct.setRATE_JUDGE_DATE("");    //���[�g�����
					this.struct.setEXCH_RATE("0");         //�בփ��[�g

				} else {
					AD0010010Struct unitCostStruct = (AD0010010Struct)unitCostList.get(0);
					setStandardItem(unitCostStruct);

					//��\�����R�[�h�����݂���
					this.struct.setVEND_CD(unitCostStruct.getVEND_CD());

					//�����S����
					AD0010010Struct updateStruct = new AD0010010Struct();
					setStandardItem(updateStruct);
					updateStruct.setCOMPANY_CD(_companyCd);
					updateStruct.setVEND_CD(unitCostStruct.getVEND_CD());
					
					List vendList = entity.mselectM_VEND_CTRL.read(conn,updateStruct);
					if (vendList == null || vendList.size() <= 0) {
						this.struct.setPUCH_ODR_PERSON("");
					} else {
						AD0010010Struct vendStruct = (AD0010010Struct)vendList.get(0);
						setStandardItem(vendStruct);
						this.struct.setPUCH_ODR_PERSON("");
					}

					String unitCostTyp = null;     // �P���敪
					String unitCost = null;        // �P��
					String processingCost = null;  // ���H��
					String materialCost = null;    // �ޗ���
					String otherOverheads = null;  // ���̑��o��

					// �P���擾
					AD0010010Struct searchStruct = new AD0010010Struct();
					setStandardItem(searchStruct);
					searchStruct.setCOMPANY_CD(this.struct.getCOMPANY_CD());
					searchStruct.setPLANT_CD(this.sysPLANT_CD);
					searchStruct.setITEM_CD(this.struct.getITEM_CD());
					searchStruct.setVEND_CD(this.struct.getVEND_CD());
					searchStruct.setEFF_PHASE_IN_DATE(this.struct.getWORK_ODR_DLV_DATE());
					searchStruct.setPUCH_SIZE(this.struct.getOPR_INST_QTY());
					List puchUnitCostList = entity.mM_PUCH_UNIT_COST.read(conn, searchStruct);

					if (puchUnitCostList == null || puchUnitCostList.size() <= 0) {
						// �P����񂪑��݂��Ȃ��ꍇ
						unitCostTyp = "1";
						unitCost = "0.00";
						processingCost = "0.00";
						materialCost = "0.00";
						otherOverheads = "0.00";

					} else {
						AD0010010Struct resultStruct = 
								(AD0010010Struct)puchUnitCostList.get(0);
						setStandardItem(resultStruct);
						unitCostTyp = resultStruct.getUNIT_COST_TYP();
						unitCost = resultStruct.getUNIT_COST();
						processingCost = resultStruct.getPROCESSING_COST();
						materialCost = resultStruct.getMATERIAL_COST();
						otherOverheads = resultStruct.getOTHER_OVERHEADS();
					}

					//�w���P���敪
					this.struct.setUNIT_COST_TYP(unitCostTyp);

					//�w���P��
					this.struct.setUNIT_COST(unitCost);

					//�w�����H��
					this.struct.setPROCESSING_COST(processingCost);

					//�w���ޗ���
					this.struct.setMATERIAL_COST(materialCost);

					//�w�����̑��o��
					this.struct.setOTHER_OVERHEADS(otherOverheads);

					String roundTyp = "";       // �܂�ߋ敪
					String vendDecimalFig = ""; // �����_����
					String exchRate = "0";      // �ב֎��
					try {

						// �ʉݏ����擾
						CurStruct cs =
							CurControl.getData(
								this.conn,
								this.struct.getCOMPANY_CD(),
								this.struct.getVEND_CD());

						roundTyp = cs.getROUND_TYP();
						vendDecimalFig = cs.getDECIMAL_FIG();

					} catch (DataNotFoundException e) {
						setErrorMessage("ZZ01101", e.getMessage());
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD",
								this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
						return;
					}

					if (!("2".equals(unitCostStruct.getEXCH_TYP()))
							&& !(unitCostStruct.getCUR_CD() == null 
							|| "".equals(unitCostStruct.getCUR_CD()))) {
						try{
							// �בփ��[�g�����擾
							ExchRateStruct ers =
								ExchRateControl.getData(
									this.conn,
									this.struct.getCOMPANY_CD(),
									unitCostStruct.getCUR_CD(),
									unitCostStruct.getEXCH_TYP(),
									null,
									this.struct.getWORK_ODR_DLV_DATE());
							
							exchRate = ers.getEXCH_RATE();
							this.struct.setRATE_JUDGE_DATE(this.struct.getWORK_ODR_DLV_DATE());
							this.struct.setEXCH_RATE(ers.getEXCH_RATE());

						} catch (DataNotFoundException e) {
							//���[�g�����	NULL
							this.struct.setRATE_JUDGE_DATE("");
							// �בփ��[�g	0
							this.struct.setEXCH_RATE("0");
							// �M�݋��z	0
							this.struct.setHOME_CUR_AMOUNT("0");
						}
					} else {
						//���[�g�����	NULL
						this.struct.setRATE_JUDGE_DATE("");
						// �בփ��[�g	0
						this.struct.setEXCH_RATE("0");
						// �M�݋��z	0
						this.struct.setHOME_CUR_AMOUNT("0");
					}

					try {
						// ����ŏ����擾
						TaxStruct ts =
							TaxControl.getData(
								this.conn,
								this.struct.getCOMPANY_CD(),
								this.struct.getVEND_CD(),
								this.struct.getITEM_CD(),
								this.struct.getWORK_ODR_DLV_DATE()); //�����[��

						//�ŃR�[�h:"����ŃR�[�h
						this.struct.setTAX_CD(ts.getTAX_CD());
						//�Œ[���敪:[����ŋ敪�}�X�^]�D"�[���敪"
						this.struct.setTAX_ROUND_TYP(ts.getTAX_ROUND_TYP());

						// TAX_CD�̉�1����1�ȊO�̏ꍇ�͐ŗ���0�Ƃ���B
						String lowerTaxCd =
							ts.getTAX_CD().substring(ts.getTAX_CD().length() - 1);
						if (lowerTaxCd.equals("1")) {
							this.struct.setTAX_RATE_1(ts.getTAX_RATE_1());
							this.struct.setTAX_RATE_2(ts.getTAX_RATE_2());
							this.struct.setTAX_RATE_3(ts.getTAX_RATE_3());
						} else {
							this.struct.setTAX_RATE_1("0.0");
							this.struct.setTAX_RATE_2("0.0");
							this.struct.setTAX_RATE_3("0.0");
						}
					} catch (DataNotFoundException e) {
						this.struct.setTAX_ROUND_TYP("1");
						this.struct.setTAX_RATE_1("0.0");
						this.struct.setTAX_RATE_2("0.0");
						this.struct.setTAX_RATE_3("0.0");
					}

					//�������z
					String puchOdrAmount =
						AmountCalculator.calcPuchOdrAmount(
							this.struct.getOPR_INST_QTY(),
							this.struct.getUNIT_COST(),
							roundTyp,
							vendDecimalFig);
					this.struct.setPUCH_ODR_AMOUNT(puchOdrAmount);

					// �l�����z
					String discAmount = "0.00";

					//�{�̋��z
					String netAmount =
						AmountCalculator.calcNetAmount(
							this.struct.getPUCH_ODR_AMOUNT(),
							discAmount);
					this.struct.setNET_AMOUNT(netAmount);

					//�Ŋz1
					String taxAmount1 =
						AmountCalculator.calcTaxAmount(
							this.struct.getNET_AMOUNT(),
							this.struct.getTAX_RATE_1(),
							this.struct.getTAX_ROUND_TYP(),
							vendDecimalFig);
					this.struct.setTAX_AMOUNT_1(taxAmount1);

					//�Ŋz2
					String taxAmount2 =
						AmountCalculator.calcTaxAmount(
							this.struct.getNET_AMOUNT(),
							this.struct.getTAX_RATE_2(),
							this.struct.getTAX_ROUND_TYP(),
							vendDecimalFig);
					this.struct.setTAX_AMOUNT_2(taxAmount2);

					//�Ŋz3
					String taxAmount3 =
						AmountCalculator.calcTaxAmount(
							this.struct.getNET_AMOUNT(),
							this.struct.getTAX_RATE_3(),
							this.struct.getTAX_ROUND_TYP(),
							vendDecimalFig);
					this.struct.setTAX_AMOUNT_3(taxAmount3);

					//�ō����z
					String amountIncludeTax =
						AmountCalculator.calcAmountIncludeTax(
							this.struct.getNET_AMOUNT(),
							this.struct.getTAX_AMOUNT_1(),
							this.struct.getTAX_AMOUNT_2(),
							this.struct.getTAX_AMOUNT_3());
					this.struct.setAMOUNT_INCLUDE_TAX(amountIncludeTax);

					//�ב֎�ʂ��Q�̏ꍇ
					if ("2".equals(unitCostStruct.getEXCH_TYP())) {

						//���[�g�����	NULL
						this.struct.setRATE_JUDGE_DATE("");
						// �בփ��[�g	0
						this.struct.setEXCH_RATE("0");
						// �M�݋��z	0
						this.struct.setHOME_CUR_AMOUNT("0");

					} else {
						//�M�݋��z
						String homeCurAmount =
							AmountCalculator.calcHomeCurAmount(
								this.struct.getAMOUNT_INCLUDE_TAX(),
								exchRate,
								roundTyp,
								this._sysHomeCurStruct.getDECIMAL_FIG());
						this.struct.setHOME_CUR_AMOUNT(homeCurAmount);
					}
				}

				//[�i��].�󋋕i�敪�A��������敪�̎擾
				List itemList = entity.mselectM_ITEM.read(conn, struct);
				if (itemList == null || itemList.size() <= 0) {
					//�f�[�^�����݂��Ȃ�
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("M_ITEM.ITEM_CD",
							this.struct.getITEM_CD());//�i�ڃR�[�h
					return;
				} else {
					AD0010010Struct itemStruct = (AD0010010Struct)itemList.get(0);
					setStandardItem(itemStruct);
					this.struct.setSPL_ITEM_TYP(itemStruct.getSPL_ITEM_TYP());
					this.struct.setACPT_INSPC_TYP(itemStruct.getACPT_INSPC_TYP());
				}
				
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

				this.struct.setsUser_ID(this.sysUSER_CD);

				//�����c�̓o�^���̈�Ӑ���G���[�`�F�b�N
				list = entity.mselectT_RLSD_PUCH_ODR.read(conn, struct);
				if (list != null && list.size() > 0) {
					setErrorMessage("ZZ01102");
					setWarningSysLogMessage("T_RLSD_PUCH_ODR.PUCH_ODR_CD",
							this.struct.getPUCH_ODR_CD());//�����ԍ�
					setReadStatus(ERROR);
					return;
				}


				//�����c�̓o�^
				this.struct.setOPR_INST_START_DATE_ALL(struct.getOPR_INST_START_DATE() + " " + OPR_INST_START_DATE_TIME.substring(0,2) + ":" + OPR_INST_START_DATE_TIME.substring(2,4));
				this.struct.setWORK_ODR_DLV_DATE_ALL(struct.getWORK_ODR_DLV_DATE() + " " + WORK_ODR_DLV_DATE_TIME.substring(0,2) + ":" + WORK_ODR_DLV_DATE_TIME.substring(2,4));
				
				int nRet = entity.minsertT_RLSD_PUCH_ODR.create(conn, struct);


				//�i�ڕʎd�|�̍폜���̈�Ӑ���G���[�`�F�b�N
				List workOdrCdList = entity.mCheckWORK_IN_PROC_BY_ITEM.read(conn, struct);
				if (workOdrCdList == null && workOdrCdList.size() <= 0) {
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD",
							this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
					setReadStatus(ERROR);
					return;
				}

				//�i�ڕʎd�|�̃��R�[�h�폜
				entity.mdeleteT_WORK_IN_PROC_BY_ITEM.delete(conn, struct);
				setInformationMessage("AD53282");
				setSupportMessage("T_RLSD_PUCH_ODR.PUCH_ODR_CD", strPuchCd);

			}

			//�I�[�_�f�}���h���X�V
			// 20081222 MOD��
		    // EJa-ASPROVA�A�g�I�v�V���������̏ꍇ
			if("1".equals(_SysInstallOptions_ASP)){	
				ATCommonOd od = new ATCommonOd(conn,
						this.sysPLANT_CD,
						this.sysUSER_CD,
						this.sp.getProcId());
				od.changeOdInfo(this.struct.getOD_NO(), -1,new Integer(this.struct.getOUTSIDE_TYP()).intValue());
			}else{
				
				CommonOd od = new CommonOd(conn,
							this.sysPLANT_CD,
							this.sysUSER_CD,
							this.sp.getProcId());

				od.changeOdInfo(this.struct.getOD_NO(), -1);
				
			}
			// 20081222 MOD��

			conn.commit();

			
			//�u���O��敪�v���Q(�O��)�ɕύX���ꂽ�ꍇ
			if ("2".equals(_outSideTyp)) {

				//��ʂ������[�h���̏�Ԃɂ���
				
				//��ʍ��ڂ̏����ݒ�
				clearAll();

				//�Ɩ��^�p���̎擾
				this.struct.setPLANT_CD(this.sysPLANT_CD);
				List oprDateList = entity.mselectBUSINESS_OPR_DATE.read(conn, struct);
				if (oprDateList == null || oprDateList.size() <= 0) {
					//�f�[�^�����݂��Ȃ�
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", 
							this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
					return;
				}
				AD0010010Struct oprDateStruct = (AD0010010Struct)oprDateList.get(0);
				setStandardItem(oprDateStruct);
				this.struct.seth_BUSINESS_OPR_DATE(oprDateStruct.geth_BUSINESS_OPR_DATE());
				
				_outSideTyp = "";
				
				setReadStatus(INITIAL);

			} else {
				//��ʂ̍Č���
				controlSelect();
			}

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

		} catch (ParseException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);

		} catch (ApsComException e) {
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


                //}}user_implement_dev:<controlUpdate>
		logger.exiting("AD0010010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * �폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0010");
		logger.entering("AD0010010Control"+":USER="+struct.getsUser_ID(),"controlDelete");
			//{{user_implement_dev:<controlDelete>


		try {
			//MODIFY_COUNT�`�F�b�N
			List modifyCountList = entity.mselectMODIFY_COUNT.read(conn, struct);
			if (modifyCountList == null || modifyCountList.size() <= 0) {
				//�f�[�^�����݂��Ȃ�
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", 
						this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
				return;
			}
			
			AD0010010Struct modifyCountStruct = (AD0010010Struct)modifyCountList.get(0);
			struct.setOD_NO(modifyCountStruct.getOD_NO());
			setStandardItem(modifyCountStruct);
			if (this.struct.geth_MODIFY_COUNT().equals(modifyCountStruct.geth_MODIFY_COUNT()) == false) {
				setErrorMessage("ZZ01105");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", 
						this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
				return;
			}
			
			//�i�ڕʎd�|�̃��R�[�h�폜
			entity.mdeleteT_WORK_IN_PROC_BY_ITEM.delete(conn, struct);
			//��Ǝw���`�[�̃��R�[�h�폜
			entity.mdeleteT_OPR_INST_SLIP.delete(conn, struct);
			
			//�I�[�_�f�}���h���X�V
			CommonOd od = new CommonOd(conn,
						this.sysPLANT_CD,
						this.sysUSER_CD,
						this.sp.getProcId());
								
			od.changeOdInfo(this.struct.getOD_NO(), -1);
			
			conn.commit();

			
			//��ʂ������[�h���̏�Ԃɂ���
				
			//��ʍ��ڂ̏����ݒ�
			clearAll();

			//�Ɩ��^�p���̎擾
			this.struct.setPLANT_CD(this.sysPLANT_CD);
			List oprDateList = entity.mselectBUSINESS_OPR_DATE.read(conn, struct);
			if (oprDateList == null || oprDateList.size() <= 0) {
				//�f�[�^�����݂��Ȃ�
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", 
						this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
				setReadStatus(ERROR);
				return;
			}
			AD0010010Struct oprDateStruct = (AD0010010Struct)oprDateList.get(0);
			setStandardItem(oprDateStruct);
			this.struct.seth_BUSINESS_OPR_DATE(oprDateStruct.geth_BUSINESS_OPR_DATE());
			
			setReadStatus(INITIAL);

		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} catch (ApsComException e) {
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


                //}}user_implement_dev:<controlDelete>
		logger.exiting("AD0010010Control"+":USER="+struct.getsUser_ID(),"controlDelete");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0010");
		logger.entering("AD0010010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>


		try {
			//��ʏ�̍��ڒl���N���A����
			clearAll();
			
			//�Ɩ��^�p���̎擾
			this.struct.setPLANT_CD(this.sysPLANT_CD);
			List oprDateList = entity.mselectBUSINESS_OPR_DATE.read(conn, struct);
			if (oprDateList == null || oprDateList.size() <= 0) {
				//�f�[�^�����݂��Ȃ�
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", 
						this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
				setReadStatus(ERROR);
				return;
			}
			AD0010010Struct oprDateStruct = (AD0010010Struct)oprDateList.get(0);
			setStandardItem(oprDateStruct);
			this.struct.seth_BUSINESS_OPR_DATE(oprDateStruct.geth_BUSINESS_OPR_DATE());

		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}


                //}}user_implement_dev:<controlClear>
		logger.exiting("AD0010010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0010");
		logger.entering("AD0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AD0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0010");
		logger.entering("AD0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>


		try {
			//��ʍ��ڂ̏����ݒ�
			clearAll();
			
			// �H��R�[�h���Z�b�g����B
			this.struct.setPLANT_CD(this.sysPLANT_CD);
			
			//�Ɩ��^�p���̎擾
			List oprDateList = entity.mselectBUSINESS_OPR_DATE.read(conn, struct);
			if (oprDateList == null || oprDateList.size() <= 0) {
				//�f�[�^�����݂��Ȃ�
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", 
						this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
				setReadStatus(ERROR);
				return;
			}
			AD0010010Struct oprDateStruct = (AD0010010Struct)oprDateList.get(0);
			setStandardItem(oprDateStruct);
			this.struct.seth_BUSINESS_OPR_DATE(oprDateStruct.geth_BUSINESS_OPR_DATE());
			
			// �R���{�{�b�N�X�f�[�^�𕔕i���擾
			ComboBox cdac = new ComboBox(conn, sysUSER_CD);
			_outsideTypStruct = cdac.getData("OUTSIDE_TYP");
			cdac.setConnection(null);
			
			// [�M��]���𕔕i���擾
			_sysHomeCurStruct = HomeCurControl.getData(conn);
			
			//�����Ǘ��p�����[�^�擾
			List listTimeCtrl = entity.mselectTIME_CTRL.read(conn,struct);
			if(listTimeCtrl == null || listTimeCtrl.size() <=0){
				struct.setTIME_CTRL("false");
				_flgTimeCtrl = "false";
			}else{
				struct.setTIME_CTRL(((AD0010010Struct)listTimeCtrl.get(0)).getTIME_CTRL());
				_flgTimeCtrl = struct.getTIME_CTRL();
			}
			
            try{
                // �C���X�g�[���I�v�V�����e�[�u�����EJa-ASPROVA�A�g�I�v�V���������t���O���擾
                List SysInstallOptASP = entity.mSYS_INSTALL_OPTIONS_ASP.read(conn,struct);
                if(SysInstallOptASP == null || SysInstallOptASP.size() <=0){
                	struct.setASP_INSTALL_FLG(null);
                }else{
                	struct.setASP_INSTALL_FLG(((AD0010010Struct)SysInstallOptASP.get(0)).getASP_INSTALL_FLG());
                }
                _SysInstallOptions_ASP = struct.getASP_INSTALL_FLG();
            }catch(SQLException e){
				e.printStackTrace();
				throw new ExpjException(e);
            }
		} catch (ComboException e) {
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
		}


                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AD0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0010");
		logger.entering("AD0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			// �_�E�����[�h�t�@�C�����N���A
			// PDF�ECSV�̃_�E�����[�h���s���Ƃ��́A��ʏ��OrHidden�ŁuDOWNLOAD_FILE�v���`���A���̍s�̃R�����g���O���Ă��������B
//			struct.setDOWNLOAD_FILE((String)null);
			// �R���{�{�b�N�X���i�̃f�[�^�̃Z�b�g�͂����ɋL�q���Ă��������B
			// �R���{�{�b�N�X�f�[�^�p��
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AD0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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


			//�ǉ�����l���Z�b�g����
			this.struct.setCREATED_BY(this.sysUSER_CD);
			this.struct.setCREATED_PRG_NM(this.sp.getClassName(ScreenParam.SHORT).substring(0,9));
			this.struct.setUPDATED_BY(this.sysUSER_CD);
			this.struct.setUPDATED_PRG_NM(this.sp.getClassName(ScreenParam.SHORT).substring(0,9));
			this.struct.setPLANT_CD(this.sysPLANT_CD);

			// �R���{�{�b�N�X�̃Z�b�g����
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
//			throw new FoundationException("AD0010010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0010010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AD0010010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0010010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AD0010010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0010010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AD0010010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AD0010010Entity entity;
	protected AD0010010Struct struct;
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

		entity = new AD0010010Entity();
		struct = new AD0010010Struct();

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
	 * AD0010010�N���X�̕W���R���X�g���N�^
	 */
	public AD0010010Control() throws BusinessProcessException, FoundationException
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
				AD0010010Struct key = (AD0010010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_name") && key.getOUTSIDE_TYP_name() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_name", key.getOUTSIDE_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_val") && key.getOUTSIDE_TYP_val() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_val", key.getOUTSIDE_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("h_SUB_FLG") && key.geth_SUB_FLG() != null) {
					msgKey.setKeyValue("h_SUB_FLG", key.geth_SUB_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_flg") && key.geth_flg() != null) {
					msgKey.setKeyValue("h_flg", key.geth_flg());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_DN") && key.getMRP_ODR_TYP_DN() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_DN", key.getMRP_ODR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP_DN") && key.getOPR_RSLT_TYP_DN() != null) {
					msgKey.setKeyValue("OPR_RSLT_TYP_DN", key.getOPR_RSLT_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("h_OPR_INST_QTY") && key.geth_OPR_INST_QTY() != null) {
					msgKey.setKeyValue("h_OPR_INST_QTY", key.geth_OPR_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("h_WORK_ODR_CD") && key.geth_WORK_ODR_CD() != null) {
					msgKey.setKeyValue("h_WORK_ODR_CD", key.geth_WORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_CD") && key.getWORK_ODR_CD() != null) {
					msgKey.setKeyValue("WORK_ODR_CD", key.getWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
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
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_ALL") && key.getOPR_INST_START_DATE_ALL() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATE_ALL", key.getOPR_INST_START_DATE_ALL());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE_ALL") && key.getWORK_ODR_DLV_DATE_ALL() != null) {
					msgKey.setKeyValue("WORK_ODR_DLV_DATE_ALL", key.getWORK_ODR_DLV_DATE_ALL());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_QTY") && key.getOPR_INST_QTY() != null) {
					msgKey.setKeyValue("OPR_INST_QTY", key.getOPR_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP") && key.getOPR_RSLT_TYP() != null) {
					msgKey.setKeyValue("OPR_RSLT_TYP", key.getOPR_RSLT_TYP());
				}
				if(msgKeyType.containsKeyColumn("WORK_IN_PROC_COMMENT") && key.getWORK_IN_PROC_COMMENT() != null) {
					msgKey.setKeyValue("WORK_IN_PROC_COMMENT", key.getWORK_IN_PROC_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD") && key.getOPR_INST_CD() != null) {
					msgKey.setKeyValue("OPR_INST_CD", key.getOPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("CREATED_BY") && key.getCREATED_BY() != null) {
					msgKey.setKeyValue("CREATED_BY", key.getCREATED_BY());
				}
				if(msgKeyType.containsKeyColumn("CREATED_PRG_NM") && key.getCREATED_PRG_NM() != null) {
					msgKey.setKeyValue("CREATED_PRG_NM", key.getCREATED_PRG_NM());
				}
				if(msgKeyType.containsKeyColumn("UPDATED_BY") && key.getUPDATED_BY() != null) {
					msgKey.setKeyValue("UPDATED_BY", key.getUPDATED_BY());
				}
				if(msgKeyType.containsKeyColumn("UPDATED_PRG_NM") && key.getUPDATED_PRG_NM() != null) {
					msgKey.setKeyValue("UPDATED_PRG_NM", key.getUPDATED_PRG_NM());
				}
				if(msgKeyType.containsKeyColumn("h_UNIT_QTY_TYP") && key.geth_UNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("h_UNIT_QTY_TYP", key.geth_UNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("h_JOB_ODR_DLV_DATE") && key.geth_JOB_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("h_JOB_ODR_DLV_DATE", key.geth_JOB_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_PARENT_OD_NO") && key.geth_PARENT_OD_NO() != null) {
					msgKey.setKeyValue("h_PARENT_OD_NO", key.geth_PARENT_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("h_DUE_DATE") && key.geth_DUE_DATE() != null) {
					msgKey.setKeyValue("h_DUE_DATE", key.geth_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_DATE") && key.geth_BUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("h_BUSINESS_OPR_DATE", key.geth_BUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT") && key.geth_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_MODIFY_COUNT", key.geth_MODIFY_COUNT());
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
				if(msgKeyType.containsKeyColumn("ODR_START_DATE") && key.getODR_START_DATE() != null) {
					msgKey.setKeyValue("ODR_START_DATE", key.getODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_JOB_ODR_DLV_DATE_TIME") && key.geth_JOB_ODR_DLV_DATE_TIME() != null) {
					msgKey.setKeyValue("h_JOB_ODR_DLV_DATE_TIME", key.geth_JOB_ODR_DLV_DATE_TIME());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP") && key.getJOB_ODR_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP", key.getJOB_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_PROC_NO") && key.geth_PROC_NO() != null) {
					msgKey.setKeyValue("h_PROC_NO", key.geth_PROC_NO());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE") && key.getWORK_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("WORK_ODR_DLV_DATE", key.getWORK_ODR_DLV_DATE());
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
				if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON") && key.getPUCH_ODR_PERSON() != null) {
					msgKey.setKeyValue("PUCH_ODR_PERSON", key.getPUCH_ODR_PERSON());
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
				if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP") && key.getSPL_ITEM_TYP() != null) {
					msgKey.setKeyValue("SPL_ITEM_TYP", key.getSPL_ITEM_TYP());
				}
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP") && key.getACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP", key.getACPT_INSPC_TYP());
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
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("EXCH_RATE") && key.getEXCH_RATE() != null) {
					msgKey.setKeyValue("EXCH_RATE", key.getEXCH_RATE());
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
				if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE") && key.getEFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("EFF_PHASE_IN_DATE", key.getEFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("PUCH_SIZE") && key.getPUCH_SIZE() != null) {
					msgKey.setKeyValue("PUCH_SIZE", key.getPUCH_SIZE());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE") && key.getOPR_INST_START_DATE() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATE", key.getOPR_INST_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP") && key.getTAX_APPLY_TYP() != null) {
					msgKey.setKeyValue("TAX_APPLY_TYP", key.getTAX_APPLY_TYP());
				}
				if(msgKeyType.containsKeyColumn("OWN_PERSON_NAME") && key.getOWN_PERSON_NAME() != null) {
					msgKey.setKeyValue("OWN_PERSON_NAME", key.getOWN_PERSON_NAME());
				}
				if(msgKeyType.containsKeyColumn("ROUND_TYP") && key.getROUND_TYP() != null) {
					msgKey.setKeyValue("ROUND_TYP", key.getROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("HOLIDAY_FLG") && key.getHOLIDAY_FLG() != null) {
					msgKey.setKeyValue("HOLIDAY_FLG", key.getHOLIDAY_FLG());
				}
				if(msgKeyType.containsKeyColumn("DATE") && key.getDATE() != null) {
					msgKey.setKeyValue("DATE", key.getDATE());
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
				if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE_TIME") && key.getWORK_ODR_DLV_DATE_TIME() != null) {
					msgKey.setKeyValue("WORK_ODR_DLV_DATE_TIME", key.getWORK_ODR_DLV_DATE_TIME());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_TIME") && key.getOPR_INST_START_DATE_TIME() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATE_TIME", key.getOPR_INST_START_DATE_TIME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_PLANT_CD") && key.getITEM_PLANT_CD() != null) {
					msgKey.setKeyValue("ITEM_PLANT_CD", key.getITEM_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("WS_NAME") && key.getWS_NAME() != null) {
					msgKey.setKeyValue("WS_NAME", key.getWS_NAME());
				}
				if(msgKeyType.containsKeyColumn("WORK_STS_TYP") && key.getWORK_STS_TYP() != null) {
					msgKey.setKeyValue("WORK_STS_TYP", key.getWORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("PROC_EXPLOSION_FLG") && key.getPROC_EXPLOSION_FLG() != null) {
					msgKey.setKeyValue("PROC_EXPLOSION_FLG", key.getPROC_EXPLOSION_FLG());
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
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_START_DATE") && key.geth_ODR_START_DATE() != null) {
					msgKey.setKeyValue("h_ODR_START_DATE", key.geth_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_START_DATE_TIME") && key.geth_ODR_START_DATE_TIME() != null) {
					msgKey.setKeyValue("h_ODR_START_DATE_TIME", key.geth_ODR_START_DATE_TIME());
				}
				if(msgKeyType.containsKeyColumn("h_DUE_DATE_TIME") && key.geth_DUE_DATE_TIME() != null) {
					msgKey.setKeyValue("h_DUE_DATE_TIME", key.geth_DUE_DATE_TIME());
				}
				if(msgKeyType.containsKeyColumn("h_MANHOUR_TYP") && key.geth_MANHOUR_TYP() != null) {
					msgKey.setKeyValue("h_MANHOUR_TYP", key.geth_MANHOUR_TYP());
				}
				if(msgKeyType.containsKeyColumn("countOD_NO") && key.getcountOD_NO() != null) {
					msgKey.setKeyValue("countOD_NO", key.getcountOD_NO());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_ALC_CD") && key.getJOB_ODR_ALC_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_ALC_CD", key.getJOB_ODR_ALC_CD());
				}
				if(msgKeyType.containsKeyColumn("TIME_CTRL") && key.getTIME_CTRL() != null) {
					msgKey.setKeyValue("TIME_CTRL", key.getTIME_CTRL());
				}
				if(msgKeyType.containsKeyColumn("ASP_INSTALL_FLG") && key.getASP_INSTALL_FLG() != null) {
					msgKey.setKeyValue("ASP_INSTALL_FLG", key.getASP_INSTALL_FLG());
				}
				if(msgKeyType.containsKeyColumn("CAL_NO") && key.getCAL_NO() != null) {
					msgKey.setKeyValue("CAL_NO", key.getCAL_NO());
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
					AD0010010Struct key = new AD0010010Struct();
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_name")) {
						key.setOUTSIDE_TYP_name(msgKey.getKeyValue("OUTSIDE_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_val")) {
						key.setOUTSIDE_TYP_val(msgKey.getKeyValue("OUTSIDE_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("h_SUB_FLG")) {
						key.seth_SUB_FLG(msgKey.getKeyValue("h_SUB_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_flg")) {
						key.seth_flg(msgKey.getKeyValue("h_flg"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_DN")) {
						key.setMRP_ODR_TYP_DN(msgKey.getKeyValue("MRP_ODR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP_DN")) {
						key.setOPR_RSLT_TYP_DN(msgKey.getKeyValue("OPR_RSLT_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("h_OPR_INST_QTY")) {
						key.seth_OPR_INST_QTY(msgKey.getKeyValue("h_OPR_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("h_WORK_ODR_CD")) {
						key.seth_WORK_ODR_CD(msgKey.getKeyValue("h_WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_CD")) {
						key.setWORK_ODR_CD(msgKey.getKeyValue("WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
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
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_ALL")) {
						key.setOPR_INST_START_DATE_ALL(msgKey.getKeyValue("OPR_INST_START_DATE_ALL"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE_ALL")) {
						key.setWORK_ODR_DLV_DATE_ALL(msgKey.getKeyValue("WORK_ODR_DLV_DATE_ALL"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_QTY")) {
						key.setOPR_INST_QTY(msgKey.getKeyValue("OPR_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP")) {
						key.setOPR_RSLT_TYP(msgKey.getKeyValue("OPR_RSLT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("WORK_IN_PROC_COMMENT")) {
						key.setWORK_IN_PROC_COMMENT(msgKey.getKeyValue("WORK_IN_PROC_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD")) {
						key.setOPR_INST_CD(msgKey.getKeyValue("OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("CREATED_BY")) {
						key.setCREATED_BY(msgKey.getKeyValue("CREATED_BY"));
					}
					if(msgKeyType.containsKeyColumn("CREATED_PRG_NM")) {
						key.setCREATED_PRG_NM(msgKey.getKeyValue("CREATED_PRG_NM"));
					}
					if(msgKeyType.containsKeyColumn("UPDATED_BY")) {
						key.setUPDATED_BY(msgKey.getKeyValue("UPDATED_BY"));
					}
					if(msgKeyType.containsKeyColumn("UPDATED_PRG_NM")) {
						key.setUPDATED_PRG_NM(msgKey.getKeyValue("UPDATED_PRG_NM"));
					}
					if(msgKeyType.containsKeyColumn("h_UNIT_QTY_TYP")) {
						key.seth_UNIT_QTY_TYP(msgKey.getKeyValue("h_UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_JOB_ODR_DLV_DATE")) {
						key.seth_JOB_ODR_DLV_DATE(msgKey.getKeyValue("h_JOB_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_PARENT_OD_NO")) {
						key.seth_PARENT_OD_NO(msgKey.getKeyValue("h_PARENT_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_DUE_DATE")) {
						key.seth_DUE_DATE(msgKey.getKeyValue("h_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_DATE")) {
						key.seth_BUSINESS_OPR_DATE(msgKey.getKeyValue("h_BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT")) {
						key.seth_MODIFY_COUNT(msgKey.getKeyValue("h_MODIFY_COUNT"));
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
					if(msgKeyType.containsKeyColumn("ODR_START_DATE")) {
						key.setODR_START_DATE(msgKey.getKeyValue("ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_JOB_ODR_DLV_DATE_TIME")) {
						key.seth_JOB_ODR_DLV_DATE_TIME(msgKey.getKeyValue("h_JOB_ODR_DLV_DATE_TIME"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP")) {
						key.setJOB_ODR_TYP(msgKey.getKeyValue("JOB_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_PROC_NO")) {
						key.seth_PROC_NO(msgKey.getKeyValue("h_PROC_NO"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE")) {
						key.setWORK_ODR_DLV_DATE(msgKey.getKeyValue("WORK_ODR_DLV_DATE"));
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
					if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON")) {
						key.setPUCH_ODR_PERSON(msgKey.getKeyValue("PUCH_ODR_PERSON"));
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
					if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP")) {
						key.setSPL_ITEM_TYP(msgKey.getKeyValue("SPL_ITEM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP")) {
						key.setACPT_INSPC_TYP(msgKey.getKeyValue("ACPT_INSPC_TYP"));
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
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_RATE")) {
						key.setEXCH_RATE(msgKey.getKeyValue("EXCH_RATE"));
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
					if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE")) {
						key.setEFF_PHASE_IN_DATE(msgKey.getKeyValue("EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_SIZE")) {
						key.setPUCH_SIZE(msgKey.getKeyValue("PUCH_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE")) {
						key.setOPR_INST_START_DATE(msgKey.getKeyValue("OPR_INST_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP")) {
						key.setTAX_APPLY_TYP(msgKey.getKeyValue("TAX_APPLY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OWN_PERSON_NAME")) {
						key.setOWN_PERSON_NAME(msgKey.getKeyValue("OWN_PERSON_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ROUND_TYP")) {
						key.setROUND_TYP(msgKey.getKeyValue("ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("HOLIDAY_FLG")) {
						key.setHOLIDAY_FLG(msgKey.getKeyValue("HOLIDAY_FLG"));
					}
					if(msgKeyType.containsKeyColumn("DATE")) {
						key.setDATE(msgKey.getKeyValue("DATE"));
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
					if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE_TIME")) {
						key.setWORK_ODR_DLV_DATE_TIME(msgKey.getKeyValue("WORK_ODR_DLV_DATE_TIME"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_TIME")) {
						key.setOPR_INST_START_DATE_TIME(msgKey.getKeyValue("OPR_INST_START_DATE_TIME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_PLANT_CD")) {
						key.setITEM_PLANT_CD(msgKey.getKeyValue("ITEM_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("WS_NAME")) {
						key.setWS_NAME(msgKey.getKeyValue("WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WORK_STS_TYP")) {
						key.setWORK_STS_TYP(msgKey.getKeyValue("WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PROC_EXPLOSION_FLG")) {
						key.setPROC_EXPLOSION_FLG(msgKey.getKeyValue("PROC_EXPLOSION_FLG"));
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
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(msgKey.getKeyValue("OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_START_DATE")) {
						key.seth_ODR_START_DATE(msgKey.getKeyValue("h_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_START_DATE_TIME")) {
						key.seth_ODR_START_DATE_TIME(msgKey.getKeyValue("h_ODR_START_DATE_TIME"));
					}
					if(msgKeyType.containsKeyColumn("h_DUE_DATE_TIME")) {
						key.seth_DUE_DATE_TIME(msgKey.getKeyValue("h_DUE_DATE_TIME"));
					}
					if(msgKeyType.containsKeyColumn("h_MANHOUR_TYP")) {
						key.seth_MANHOUR_TYP(msgKey.getKeyValue("h_MANHOUR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("countOD_NO")) {
						key.setcountOD_NO(msgKey.getKeyValue("countOD_NO"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_ALC_CD")) {
						key.setJOB_ODR_ALC_CD(msgKey.getKeyValue("JOB_ODR_ALC_CD"));
					}
					if(msgKeyType.containsKeyColumn("TIME_CTRL")) {
						key.setTIME_CTRL(msgKey.getKeyValue("TIME_CTRL"));
					}
					if(msgKeyType.containsKeyColumn("ASP_INSTALL_FLG")) {
						key.setASP_INSTALL_FLG(msgKey.getKeyValue("ASP_INSTALL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("CAL_NO")) {
						key.setCAL_NO(msgKey.getKeyValue("CAL_NO"));
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
