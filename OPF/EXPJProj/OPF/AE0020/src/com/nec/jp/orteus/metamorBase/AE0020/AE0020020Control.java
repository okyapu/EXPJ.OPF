/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0020/src/com/nec/jp/orteus/metamorBase/AE0020/AE0020020Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0020;

import com.nec.jp.orteus.metamorBase.AE0020.*;
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
import java.text.ParseException;

import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
//import com.nec.jp.orteus.metamorBase.common02.CommonOd.ApsComException;
//import com.nec.jp.orteus.metamorBase.common02.CommonOd.CommonOd;
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

import com.nec.jp.orteus.expj.util.*;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AE0020020Control
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
	private String ODR_STATE_TYP = null;
	public void setODR_STATE_TYP(String input){
		ODR_STATE_TYP = input;
	}
	public String getODR_STATE_TYP(){
		return ODR_STATE_TYP;
	}
	protected List list; // �ꗗ�����̌��ʃ��X�g����ʂɕ\�����邽�߂̃��X�g�C���X�^���X

	// �f�t�H���g�A�N�Z�T���\�b�h
	public List getList() {
		return this.list;
	} // ���X�g��Ԃ��܂��B
	public void setList(List listname) {
		this.list = listname;
	} // ���X�g���Z�b�g���܂��B
	public int getListsize() { // ���X�g�^�̃T�C�Y��Ԃ��܂��B
		int nret = 0;
		if (this.list != null) {
			nret = this.list.size();
		}
		return nret;
	}
	//	public Object getListvalue(int x) { return this.list.get(x); }	// ���X�g�̒l��Ԃ��܂��B
	public AE0020020Struct getListvalue(int x) {
		return (AE0020020Struct) (this.list.get(x));
	} // ���X�g�̒l��Ԃ��܂��B
	public AE0020020Struct getStruct() {
		return this.struct;
	} // Struct��Ԃ��܂��B
	public AE0020020Struct createStruct() {
		return new AE0020020Struct();
	} // �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) {
		this.struct.setStruct((AE0020020Struct) structname);
	} // Struct���Z�b�g���܂��B
	public void initializeStruct() {
		this.struct.initialize();
	} // Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter() {
		return this.csvWriter;
	}

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr) {
		this.csvReader = cr;
	}

	// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
	/** ���ɑJ�ڂ����ʂ�URL */
	private String _nextUrl = null;

	/** [����]��� */
	private MyCompanyStruct _myCompanyStruct = new MyCompanyStruct();
	/** [�Ŗ�]��� */
	private TaxNameStruct _taxNameStruct = new TaxNameStruct();
	/** [�M��]��� */
	private HomeCurStruct _homeCurStruct = new HomeCurStruct();
	/** [�R���{�{�b�N�X�f�[�^]���i���O��敪�j */
	private ComboStruct _outsideTypStruct = new ComboStruct();
	/** [�R���{�{�b�N�X�f�[�^]���i�j */
	private ComboStruct _splItemTypStruct = new ComboStruct();
	/** [�R���{�{�b�N�X�f�[�^]���i�P���敪�j */
	private ComboStruct _unitCostTypStruct = new ComboStruct();
    // �����ꍀ�ڎ擾�Ή�
    ResourceBundle resource = CoreTools.getResourceBundle( "OrteusUserDic", CoreTools.getLocale(sysUSER_CD));

	/** ��ʑJ�ڃL�[(�I�[�_�f�}���h�ԍ�) */
	private String _odNo;

	//Add Start 20131230 song-yy
	/** �P���Ǎ����A����ŃR�[�h*/
	private String _taxCd = "";
	//Add  End 20131230 song-yy
	
	/** �q��ʂōs������ */
	private String operationMode = null;
	/** �q��ʂ̑��삪�o�^�ł��邱�Ƃ�\���萔 */
	static final private String INSERT = "INSERT";
	/** �q��ʂ̑��삪�X�V�ł��邱�Ƃ�\���萔 */
	static final private String UPDATE = "UPDATE";

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
	 * ���ɑJ�ڂ����ʂ�URL���擾���܂��B
	 */
	public String getNextUrl() {
		return _nextUrl;
	}
	/**
	 * ���ɑJ�ڂ����ʂ�URL��ݒ肵�܂��B
	 */
	public void setNextUrl(String url) {
		_nextUrl = url;
	}

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
	 * �q��ʂōs����ƃ��[�h��Ԃ��܂��B
	 * @return ��ƃ��[�h�iINSERT/UPDATE�j
	 */
	public String getOperationMode() {
		return operationMode;
	}

	/**
	 * �ғ����`�F�b�N��������t������Ŏg����悤�ɂ����Ϗ����\�b�h�ł��B
	 * @param dateString ���t������
	 * @return �ғ����̏ꍇ�� true�A ��ғ����̏ꍇ��false��Ԃ��܂��B
	 * @throws FoundationException  ���ʕ��i�����Ŏ��s
	 * @throws ParseException �^�ϊ��Ɏ��s
	 */
	private boolean isWorkDay(String dateString) throws FoundationException, ParseException {
		// DateFormat������
	//	DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		// �^�ϊ�
		Date date = Converter.strToDate(dateString,"yyyy/MM/dd");

		// �ғ������ʕ��i�𐶐����A�`�F�b�N���������s
		WorkCalendar wc =
			new WorkCalendar(conn, sysUSER_CD, sp.getProcId(), struct.getPLANT_CD(),struct.getITEM_CD(), date);
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

     // �����Z�o���ꂽ���t�𕶎��^�ɕϊ����ĕێ�����
     String tidydate = Converter.dateToStr(resultDate, "yyyy/MM/dd HH:mm:ss");

     // �����Z�o���ꂽ���t��yyyy/mm/dd hh24mi�`���ɐ�����
     tidydate = tidydate.substring(0,10) + tidydate.substring(11,13) + tidydate.substring(14,16);
     //return df.format(tidydate);
     return tidydate;
    }

	/**
	 * Struct�̒l���Z�b�g���܂��B
	 * @param s ���������f�[�^
	 */
	private void setStruct(AE0020020Struct s) {
		struct.setPLANT_CD(s.getPLANT_CD());
		struct.setPLANT_NAME(s.getPLANT_NAME());
		struct.setJOB_ODR_CD(s.getJOB_ODR_CD());
		struct.setJOB_ODR_CANCEL_NO(s.getJOB_ODR_CANCEL_NO());
		struct.setJOB_ODR_TYP(s.getJOB_ODR_TYP());
		struct.setJOB_ODR_TYP_DN(s.getJOB_ODR_TYP_DN());
		struct.setALC_GRP_CD(s.getALC_GRP_CD());
		struct.setITEM_CD(s.getITEM_CD());
		struct.setITEM_NAME(s.getITEM_NAME());
		struct.setDRAW_CD(s.getDRAW_CD());
		struct.setSPEC(s.getSPEC());
		struct.setOUTSIDE_TYP(s.getOUTSIDE_TYP());
		struct.setOUTSIDE_TYP_DN(s.getOUTSIDE_TYP_DN());
		struct.setMRP_ODR_TYP(s.getMRP_ODR_TYP());
		struct.setMRP_ODR_TYP_DN(s.getMRP_ODR_TYP_DN());
		struct.setITEM_SPOIL(s.getITEM_SPOIL());
		struct.setUNIT_QTY_TYP(s.getUNIT_QTY_TYP());
		struct.setUNIT_QTY_TYP_DN(s.getUNIT_QTY_TYP_DN());
		struct.setSUM_PUCH_ODR_QTY(s.getSUM_PUCH_ODR_QTY());
		struct.setSUM_OPR_INST_QTY(s.getSUM_OPR_INST_QTY());
		struct.setODR_QTY(s.getODR_QTY());
		struct.setDM_QTY(s.getDM_QTY());
		struct.setSUM_ALCD_QTY(s.getSUM_ALCD_QTY());
		struct.setODR_STS_TYP(s.getODR_STS_TYP());
		struct.setODR_STS_TYP_DN(s.getODR_STS_TYP_DN());
		struct.setDM_STS_TYP(s.getDM_STS_TYP());
		struct.setDM_STS_TYP_DN(s.getDM_STS_TYP_DN());
		struct.setSTOCK_UNIT(s.getSTOCK_UNIT());

		struct.setJOB_ODR_DLV_DATE(s.getJOB_ODR_DLV_DATE());
		struct.setDUE_DATE(s.getDUE_DATE());
		struct.setPRD_DUE_DATE(s.getPRD_DUE_DATE());
		struct.setPRD_START_DATE(s.getPRD_START_DATE());
		struct.setODR_START_DATE(s.getODR_START_DATE());
	}

	/**
	 * Struct�̒l���Z�b�g���܂��B
	 * @param s ���������f�[�^
	 */
	private void setStructSub1(AE0020020Struct s) {
		struct.setNON_NO_ITEM_FLG(s.getNON_NO_ITEM_FLG());
		struct.setDRAW_CD(s.getDRAW_CD());
		struct.setSPEC(s.getSPEC());
		struct.setMRP_ODR_TYP_DN(s.getMRP_ODR_TYP_DN());
		struct.setMRP_ODR_TYP(s.getMRP_ODR_TYP());
		struct.setPUCH_ODR_START_DATE(s.getPUCH_ODR_START_DATE());
		struct.setCONFIRM_DLV_DATE(s.getCONFIRM_DLV_DATE());
		struct.setPUCH_ODR_DLV_DATE(s.getPUCH_ODR_DLV_DATE());
		struct.setPUCH_ODR_QTY(s.getPUCH_ODR_QTY());
		struct.setSTOCK_UNIT(s.getSTOCK_UNIT());
		struct.setOUTSIDE_TYP(s.getOUTSIDE_TYP());
		struct.setVEND_CD(s.getVEND_CD());
		struct.setVEND_NAME(s.getVEND_NAME());
		struct.setWH_CD(s.getWH_CD());
		struct.setWH_NAME(s.getWH_NAME());
		struct.setPUCH_ODR_PERSON(s.getPUCH_ODR_PERSON());
		struct.setUSER_NAME(s.getUSER_NAME());
		struct.setSPL_ITEM_TYP(s.getSPL_ITEM_TYP());
		struct.setPRODUCT_TYP_DN(s.getPRODUCT_TYP_DN());
		struct.setPRODUCT_TYP(s.getPRODUCT_TYP());
		struct.setUNIT_COST_TYP(s.getUNIT_COST_TYP());
		struct.setUNIT_COST(s.getUNIT_COST());
		struct.setPUCH_ODR_AMOUNT(s.getPUCH_ODR_AMOUNT());
		struct.setAMOUNT_INCLUDE_TAX(s.getAMOUNT_INCLUDE_TAX());
		struct.setNET_AMOUNT(s.getNET_AMOUNT());
		struct.setDISC_AMOUNT(s.getDISC_AMOUNT());
		struct.setTAX_RATE_1(s.getTAX_RATE_1());
		struct.setTAX_RATE_2(s.getTAX_RATE_2());
		struct.setTAX_RATE_3(s.getTAX_RATE_3());
		struct.setTAX_AMOUNT_1(s.getTAX_AMOUNT_1());
		struct.setTAX_AMOUNT_2(s.getTAX_AMOUNT_2());
		struct.setTAX_AMOUNT_3(s.getTAX_AMOUNT_3());
		struct.setPROCESSING_COST(s.getPROCESSING_COST());
		struct.setMATERIAL_COST(s.getMATERIAL_COST());
		struct.setOTHER_OVERHEADS(s.getOTHER_OVERHEADS());
		struct.setHOME_CUR_AMOUNT(s.getHOME_CUR_AMOUNT());
		struct.setEXCH_RATE(s.getEXCH_RATE());
		struct.setPUCH_ODR_COMMENT(s.getPUCH_ODR_COMMENT());
		struct.setPUCH_ODR_STS_TYP(s.getPUCH_ODR_STS_TYP());
		struct.setINV_CTRL_FLG(s.getINV_CTRL_FLG());
		struct.setTAX_CD(s.getTAX_CD());
		struct.setTAX_ROUND_TYP(s.getTAX_ROUND_TYP());
		struct.setROUND_TYP(s.getROUND_TYP());
		struct.setMODIFY_COUNT(s.getMODIFY_COUNT());
		struct.setCUR_CD(s.getCUR_CD());
		struct.setCUR_NAME(s.getCUR_NAME());
		struct.setVEND_CUR_UNIT(s.getVEND_CUR_UNIT());
		struct.setVEND_DECIMAL_FIG(s.getVEND_DECIMAL_FIG());

		struct.seth_PUCH_ODR_QTY(s.getPUCH_ODR_QTY());
		struct.seth_SPL_ITEM_TYP(s.getSPL_ITEM_TYP());
		struct.setCONFIRM_DLV_DATE_COMMENT(s.getCONFIRM_DLV_DATE_COMMENT());

		struct.setPUCH_ODR_START_TIME(s.getPUCH_ODR_START_TIME());
		struct.setCONFIRM_DLV_TIME(s.getCONFIRM_DLV_TIME());
		struct.setPUCH_ODR_DLV_TIME(s.getPUCH_ODR_DLV_TIME());
	}

	/**
	 * ��ʂ̑S���ڂ����������܂��B
	 */
	private void initializeAll() {
		struct.setPLANT_CD(sysPLANT_CD);
		struct.setPLANT_NAME(null);
		struct.setJOB_ODR_CD(null);
		struct.setJOB_ODR_CANCEL_NO("0");
		struct.setITEM_CD(null);
		struct.setITEM_NAME(null);

		initializeDetail();
	}

	/**
	 * ��ʂ̏ڍ׍��ڂ����������܂��B
	 */
	private void initializeDetail() {
		struct.setDRAW_CD(null);
		struct.setSPEC(null);
		struct.setMRP_ODR_TYP_DN(null);
		struct.setMRP_ODR_TYP(null);
		struct.setOUTSIDE_TYP_DN(null);
		struct.setOUTSIDE_TYP(null);
		struct.setJOB_ODR_DLV_DATE(null);
		struct.setDUE_DATE(null);
		struct.setDM_QTY(null);
		struct.setSUM_ALCD_QTY(null);
		struct.setPRD_DUE_DATE(null);
		struct.setPRD_START_DATE(null);
		struct.setODR_START_DATE(null);
		struct.setODR_QTY(null);
		struct.setSUM_OPR_INST_QTY(null);
		struct.setSUM_PUCH_ODR_QTY(null);
		struct.setODR_STS_TYP_DN(null);
		struct.setODR_STS_TYP(null);
		struct.setDM_STS_TYP_DN(null);
		struct.setDM_STS_TYP(null);

		list = null;
  		//Add Start 20131227 song-yy
	    //����ŃR�[�h
	   _taxCd = "";
	   //Add  End 20131227 song-yy
		
		readStatus = INITIAL;
		ODR_STATE_TYP = null;
	}

	/**
	 * Struct�̒l���Z�b�g���܂��B
	 * @param s ���������f�[�^
	 */
	private void initializeDetailSub1() {
		struct.setDRAW_CD(null);
		struct.setSPEC(null);
		struct.setMRP_ODR_TYP_DN(null);
		struct.setMRP_ODR_TYP("5");
		struct.setPUCH_ODR_START_DATE(null);
		struct.setCONFIRM_DLV_DATE(null);
		struct.setPUCH_ODR_DLV_DATE(null);
		struct.setPUCH_ODR_QTY("0");
		struct.setSTOCK_UNIT(null);
		struct.setOUTSIDE_TYP("2");
		struct.setVEND_CD(null);
		struct.setVEND_NAME(null);
		struct.setWH_CD(null);
		struct.setWH_NAME(null);
		struct.setPUCH_ODR_PERSON(null);
		struct.setUSER_NAME(null);
		struct.setSPL_ITEM_TYP("0");
		struct.setPRODUCT_TYP_DN(null);
		struct.setPRODUCT_TYP(null);
		struct.setUNIT_COST_TYP("1");
		struct.setUNIT_COST("0");
		struct.setPUCH_ODR_AMOUNT("0");
		struct.setAMOUNT_INCLUDE_TAX("0");
		struct.setNET_AMOUNT("0");
		struct.setDISC_AMOUNT("0");
		struct.setTAX_RATE_1("0");
		struct.setTAX_RATE_2("0");
		struct.setTAX_RATE_3("0");
		struct.setTAX_AMOUNT_1("0");
		struct.setTAX_AMOUNT_2("0");
		struct.setTAX_AMOUNT_3("0");
		struct.setPROCESSING_COST("0");
		struct.setMATERIAL_COST("0");
		struct.setOTHER_OVERHEADS("0");
		struct.setHOME_CUR_AMOUNT("0");
		struct.setEXCH_RATE("1");
		struct.setPUCH_ODR_COMMENT(null);
		struct.setPUCH_ODR_STS_TYP(null);
		struct.setINV_CTRL_FLG(null);
		struct.setTAX_CD(null);
		struct.setTAX_ROUND_TYP("3");
		struct.setROUND_TYP("3");
		struct.setMODIFY_COUNT(null);
		struct.setCUR_CD(null);
		struct.setCUR_NAME(null);
		struct.setVEND_CUR_UNIT(null);
		struct.setVEND_DECIMAL_FIG("4");
		struct.setNON_NO_ITEM_FLG(null);

		struct.seth_PUCH_ODR_QTY(null);
		struct.seth_SPL_ITEM_TYP(null);

		struct.setPUCH_ODR_START_TIME(null);
		struct.setCONFIRM_DLV_TIME(null);
		struct.setPUCH_ODR_DLV_TIME(null);

		struct.setPUCH_ODR_START_DATE_ALL(null);
		struct.setCONFIRM_DLV_DATE_ALL(null);
		struct.setPUCH_ODR_DLV_DATE_ALL(null);
  		//Add Start 20131227 song-yy
	    //����ŃR�[�h
	    _taxCd = "";
	   //Add  End 20131227 song-yy

	}

	/**
	 * ��ʑJ�ڎ��̃f�[�^�Ǎ�����
	 * @throws BusinessProcessException �H
	 * @throws FoundationException �H
	 */
	private void controlSelect() throws BusinessProcessException, FoundationException {
		try {
			// ��ʃN���A
			initializeDetail();
			// �擾�����L�[������DB��茟��
			List formList = entity.mForm.read(conn, struct);
			// �������Č��ʂ�0���������ꍇ
			if (formList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setErrorParameter("T_RLSD_PUCH_ODR", "PLANT_CD", struct.getPLANT_CD());
				setErrorParameter("T_OD", "JOB_ODR_CD", struct.getJOB_ODR_CD());
				setErrorParameter("T_OD", "JOB_ODR_CANCEL_NO", struct.getJOB_ODR_CANCEL_NO());
				setErrorParameter("T_RLSD_PUCH_ODR", "ITEM_CD", struct.getITEM_CD());
				return;
			}

			// �X�g���N�g�ɓǂݍ��񂾃f�[�^��ݒ�
			AE0020020Struct formStruct = (AE0020020Struct) formList.get(0);
			formStruct.setJOB_ODR_TYP_DN(multcombo("JOB_ODR_TYP",formStruct.getJOB_ODR_TYP()));
			formStruct.setOUTSIDE_TYP_DN(multcombo("OUTSIDE_TYP",formStruct.getOUTSIDE_TYP()));
			formStruct.setMRP_ODR_TYP_DN(multcombo("MRP_ODR_TYP",formStruct.getMRP_ODR_TYP()));
			formStruct.setUNIT_QTY_TYP_DN(multcombo("UNIT_QTY_TYP",formStruct.getUNIT_QTY_TYP()));
			formStruct.setODR_STS_TYP_DN(multcombo("ODR_STS_TYP",formStruct.getODR_STS_TYP()));
			formStruct.setDM_STS_TYP_DN(multcombo("DM_STS_TYP",formStruct.getDM_STS_TYP()));
			setStruct(formStruct);
            
			//2012/8/14
			// �ꗗ�f�[�^���ő�\���s���𒴂��Ă����ꍇ
			int maxLine = sp.getMaxLine(conn, 10);
			if(maxLine != 0) {
				struct.setROW_COUNT(String.valueOf(maxLine));
			} else {
				struct.setROW_COUNT(null);
			}
			List viewList = entity.mViewCnt.read(conn, struct);
			long rowCount = Long.parseLong(((AE0020020Struct)viewList.get(0)).getl_COUNT());
			 // �ꗗ�f�[�^��0���̏ꍇ
			if (rowCount==0) {
				setErrorMessage("ZZ06001");
				readStatus = NOT_FOUND;
				if(list != null && list.size() > 0){
					list.clear();
				}
				return;
			}
			if ((maxLine != 0) && rowCount== maxLine+1) {
				 if(list != null && list.size() > 0){
					 list.clear();
				 }
				setErrorMessage("ZZ01115", String.valueOf(maxLine));
				setErrorParameter("T_OD", "PLANT_CD", struct.getPLANT_CD());
				setErrorParameter("T_OD", "JOB_ODR_CD", struct.getJOB_ODR_CD());
				setErrorParameter("T_OD", "JOB_ODR_CANCEL_NO", struct.getJOB_ODR_CANCEL_NO());
				setErrorParameter("T_OD", "ITEM_CD", struct.getITEM_CD());
				readStatus = TOO_MANY;
				return;
			}
			// �ꗗ�f�[�^������
			  viewList = entity.mView.read(conn, struct);
           
			AE0020020Struct TempStruct;
            for (int i = 0; i < viewList.size(); i++) {
		    	TempStruct = (AE0020020Struct)viewList.get(i);
		     //�R���{�{�b�N�X�̎擾			
				TempStruct.setl_UNIT_COST_TYP_DN(multcombo("UNIT_COST_TYP",TempStruct.getl_UNIT_COST_TYP_DN()));

		    }
            //2012/8/14
			// �ꗗ�f�[�^�����퐔�̏ꍇ
			setList(viewList);
			readStatus = NORMAL;
		} catch (SQLException e) {
			throw new ExpjException(e);
		}
	}
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �s�ǉ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlLineInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0020");
		logger.entering("AE0020020Control"+":USER="+struct.getsUser_ID(),"controlLineInsert");
			//{{user_implement_dev:<controlLineInsert>
		try {
			struct.setSelectUnitCostFlag("false");
			
			// �T�u��ʖ��׍��ڂ��N���A
			initializeDetailSub1();
			
			// �f�[�^���擾
			List formList = entity.mFormSub1Insert.read(conn, struct);
			if (formList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setErrorParameter("T_RLSD_PUCH_ODR", "PLANT_CD", struct.getPLANT_CD());
				setErrorParameter("T_OD", "JOB_ODR_CD", struct.getJOB_ODR_CD());
				setErrorParameter("T_OD", "JOB_ODR_CANCEL_NO", struct.getJOB_ODR_CANCEL_NO());
				setErrorParameter("T_RLSD_PUCH_ODR", "ITEM_CD", struct.getITEM_CD());

				readStatus = ERROR;
				return;
			}

			// ��ʃf�[�^���Z�b�g
			AE0020020Struct formStruct = (AE0020020Struct) formList.get(0);
			formStruct.setPRODUCT_TYP_DN(multcombo("PRODUCT_TYP",formStruct.getPRODUCT_TYP()));
			formStruct.setMRP_ODR_TYP_DN(multcombo("MRP_ODR_TYP",formStruct.getMRP_ODR_TYP()));

			// �V�X�e���p�����[�^�iTIME_CTRL�j�擾
			AE0020020Struct TIME_CTRLStruct = new AE0020020Struct();
			List TIME_CTRLList = entity.mSELECT_TIME_CTRL.read(conn, TIME_CTRLStruct);
			if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
				TIME_CTRLStruct = (AE0020020Struct)TIME_CTRLList.get(0);
				struct.setTIME_CTRL(TIME_CTRLStruct.getTIME_CTRL());
			}else{
				struct.setTIME_CTRL("false");
			}

			setStructSub1(formStruct);
			struct.setPUCH_ODR_PERSON(sysUSER_CD);
			struct.setSelectUnitCostFlag("false");

			operationMode = INSERT;
		} catch (SQLException e) {
			throw new ExpjException(e);
		}
                //}}user_implement_dev:<controlLineInsert>
		logger.exiting("AE0020020Control"+":USER="+struct.getsUser_ID(),"controlLineInsert");

		return;
	}

	/**
	 * �s�C���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlLineUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0020");
		logger.entering("AE0020020Control"+":USER="+struct.getsUser_ID(),"controlLineUpdate");
			//{{user_implement_dev:<controlLineUpdate>
		try {
			struct.setSelectUnitCostFlag("false");

			// �T�u��ʖ��׍��ڂ��N���A
			initializeDetailSub1();

			// �f�[�^���擾
			struct.setPUCH_ODR_CD(struct.getl_PUCH_ODR_CD());
			List formList = entity.mFormSub1Update.read(conn, struct);
			if (formList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setErrorParameter("T_RLSD_PUCH_ODR", "PLANT_CD", struct.getPLANT_CD());
				setErrorParameter("T_OD", "JOB_ODR_CD", struct.getJOB_ODR_CD());
				setErrorParameter("T_OD", "JOB_ODR_CANCEL_NO", struct.getJOB_ODR_CANCEL_NO());
				setErrorParameter("T_RLSD_PUCH_ODR", "ITEM_CD", struct.getITEM_CD());
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getl_PUCH_ODR_CD());

				readStatus = ERROR;
				return;
			}

			// ��ʃf�[�^���Z�b�g
			AE0020020Struct formStruct = (AE0020020Struct) formList.get(0);
			
			// [�����c]."�݌ɊǗ��t���O" = 0:�݌ɊǗ����Ȃ��̏ꍇ
			if ("0".equals(formStruct.getINV_CTRL_FLG())) {
				setWarningMessage("AE32612");
				setWarningParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
			}
			
			// ������ԋ敪
			setODR_STATE_TYP(formStruct.getPUCH_ODR_STS_TYP());
			
			formStruct.setPRODUCT_TYP_DN(multcombo("PRODUCT_TYP",formStruct.getPRODUCT_TYP()));
			formStruct.setMRP_ODR_TYP_DN(multcombo("MRP_ODR_TYP",formStruct.getMRP_ODR_TYP()));


			// �V�X�e���p�����[�^�iTIME_CTRL�j�擾
			AE0020020Struct TIME_CTRLStruct = new AE0020020Struct();
			List TIME_CTRLList = entity.mSELECT_TIME_CTRL.read(conn, TIME_CTRLStruct);
			if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
				TIME_CTRLStruct = (AE0020020Struct)TIME_CTRLList.get(0);
				struct.setTIME_CTRL(TIME_CTRLStruct.getTIME_CTRL());
			}else{
				struct.setTIME_CTRL("false");
			}
			DateTimeFormat dtf = new DateTimeFormat(conn);
			
			formStruct.setPUCH_ODR_DLV_DATE(dtf.getDatePart(formStruct.getPUCH_ODR_DLV_DATE_ALL()));
			formStruct.setPUCH_ODR_DLV_TIME(dtf.getTimePart(formStruct.getPUCH_ODR_DLV_DATE_ALL()));
			formStruct.setCONFIRM_DLV_DATE(dtf.getDatePart(formStruct.getCONFIRM_DLV_DATE_ALL()));
			formStruct.setCONFIRM_DLV_TIME(dtf.getTimePart(formStruct.getCONFIRM_DLV_DATE_ALL()));
			formStruct.setPUCH_ODR_START_DATE(dtf.getDatePart(formStruct.getPUCH_ODR_START_DATE_ALL()));
			formStruct.setPUCH_ODR_START_TIME(dtf.getTimePart(formStruct.getPUCH_ODR_START_DATE_ALL()));

			setStructSub1(formStruct);
			struct.setSelectUnitCostFlag("true");

			operationMode = UPDATE;
     		//Add Start 20131230 song-yy
     		/** �Ǎ����A����ŃR�[�h��ݒ�*/
             _taxCd = formStruct.getTAX_CD();
     		//Add  End 20131230 song-yy
		} catch (SQLException e) {
			throw new ExpjException(e);
		}
                //}}user_implement_dev:<controlLineUpdate>
		logger.exiting("AE0020020Control"+":USER="+struct.getsUser_ID(),"controlLineUpdate");

		return;
	}

	/**
	 * �s���ʃ{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlLineCopy() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0020");
		logger.entering("AE0020020Control"+":USER="+struct.getsUser_ID(),"controlLineCopy");
			//{{user_implement_dev:<controlLineCopy>
		try {
			struct.setSelectUnitCostFlag("false");

			// �T�u��ʖ��׍��ڂ��N���A
			initializeDetailSub1();

			// �f�[�^���擾
			struct.setPUCH_ODR_CD(struct.getl_PUCH_ODR_CD());
			List formList = entity.mFormSub1Update.read(conn, struct);
			if (formList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setErrorParameter("T_RLSD_PUCH_ODR", "PLANT_CD", struct.getPLANT_CD());
				setErrorParameter("T_OD", "JOB_ODR_CD", struct.getJOB_ODR_CD());
				setErrorParameter("T_OD", "JOB_ODR_CANCEL_NO", struct.getJOB_ODR_CANCEL_NO());
				setErrorParameter("T_RLSD_PUCH_ODR", "ITEM_CD", struct.getITEM_CD());
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getl_PUCH_ODR_CD());

				readStatus = ERROR;
				return;
			}

			// ��ʃf�[�^���Z�b�g
			AE0020020Struct formStruct = (AE0020020Struct) formList.get(0);
			formStruct.setPRODUCT_TYP_DN(multcombo("PRODUCT_TYP",formStruct.getPRODUCT_TYP()));
			formStruct.setMRP_ODR_TYP_DN(multcombo("MRP_ODR_TYP",formStruct.getMRP_ODR_TYP()));

			// �V�X�e���p�����[�^�iTIME_CTRL�j�擾
			AE0020020Struct TIME_CTRLStruct = new AE0020020Struct();
			List TIME_CTRLList = entity.mSELECT_TIME_CTRL.read(conn, TIME_CTRLStruct);
			if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
				TIME_CTRLStruct = (AE0020020Struct)TIME_CTRLList.get(0);
				struct.setTIME_CTRL(TIME_CTRLStruct.getTIME_CTRL());
			}else{
				struct.setTIME_CTRL("false");
			}
			DateTimeFormat dtf = new DateTimeFormat(conn);
			
			formStruct.setPUCH_ODR_DLV_DATE(dtf.getDatePart(formStruct.getPUCH_ODR_DLV_DATE_ALL()));
			formStruct.setPUCH_ODR_DLV_TIME(dtf.getTimePart(formStruct.getPUCH_ODR_DLV_DATE_ALL()));
			formStruct.setCONFIRM_DLV_DATE(dtf.getDatePart(formStruct.getCONFIRM_DLV_DATE_ALL()));
			formStruct.setCONFIRM_DLV_TIME(dtf.getTimePart(formStruct.getCONFIRM_DLV_DATE_ALL()));
			formStruct.setPUCH_ODR_START_DATE(dtf.getDatePart(formStruct.getPUCH_ODR_START_DATE_ALL()));
			formStruct.setPUCH_ODR_START_TIME(dtf.getTimePart(formStruct.getPUCH_ODR_START_DATE_ALL()));

			setStructSub1(formStruct);
			struct.setPUCH_ODR_CD(null);
			struct.setSelectUnitCostFlag("false");

			operationMode = INSERT;
		} catch (SQLException e) {
			throw new ExpjException(e);
		}
                //}}user_implement_dev:<controlLineCopy>
		logger.exiting("AE0020020Control"+":USER="+struct.getsUser_ID(),"controlLineCopy");

		return;
	}

	/**
	 * �s�폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlLineDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0020");
		logger.entering("AE0020020Control"+":USER="+struct.getsUser_ID(),"controlLineDelete");
			//{{user_implement_dev:<controlLineDelete>
		try {

			struct.setPUCH_ODR_CD(struct.getl_PUCH_ODR_CD());
			// ��H��R�[�h� + ������ԍ�����A[�����c]�ɑ��݂��Ȃ��ꍇ
			List lockedList = entity.mT_RLSD_PUCH_ODR_Lock.read(conn, struct);
			if (lockedList.isEmpty()) {
				setErrorMessage("ZZ01105");
				return;
			}
			AE0020020Struct lockedStruct = (AE0020020Struct) lockedList.get(0);
			// [�����c]."�X�V��" != ��X�V���(hidden�g�p)�̏ꍇ
			if (!lockedStruct.getMODIFY_COUNT().equals(struct.getl_MODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
				return;
			}


			struct.setPUCH_ODR_CD(struct.getl_PUCH_ODR_CD());
			// [�����c]�̍폜
			entity.mT_RLSD_PUCH_ODR.delete(conn, struct);
			// [���v��]�̍X�V
			CommonOd od = new CommonOd(conn, struct.getPLANT_CD(), sysUSER_CD, sp.getProcId());
			od.changeOdInfo(struct.getOD_NO(), -1);

			// ��ʍĕ\��
			controlSelect();
		} catch (SQLException e) {
			throw new ExpjException(e);
		} catch (ApsComException e) {
			throw new ExpjException(e);
		}
                //}}user_implement_dev:<controlLineDelete>
		logger.exiting("AE0020020Control"+":USER="+struct.getsUser_ID(),"controlLineDelete");

		return;
	}

	/**
	 * �P���Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelectUnitCost() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0020");
		logger.entering("AE0020020Control"+":USER="+struct.getsUser_ID(),"controlSelectUnitCost");
			//{{user_implement_dev:<controlSelectUnitCost>
		PuchUnitCostStruct pucs;

		// �����A�w���P���A�ʉ݁A����ł��擾
		try {
			// ������\������Null�̏ꍇ�A������\�������Z�o����B
			if (struct.getPUCH_ODR_START_DATE() == null
				|| "".equals(struct.getPUCH_ODR_START_DATE())) {
				
				// [���v��]."����" != Null �̏ꍇ�̂݁A�ȉ��̃`�F�b�N�������s���B
				List odList = entity.mT_OD.read(conn, struct);
				AE0020020Struct odStruct = (AE0020020Struct) odList.get(0);
				
				// �ʏ�i�̏ꍇ�͢�����[��������ɔ����\������Z�o�����̌��ʂ𔭒��\����Ƃ���B
				String fixedLt = odStruct.getFIXED_LT();
				String propLt = odStruct.getPROP_LT();
				String safetyLt = odStruct.getSAFETY_LT();
				String propLotSize = odStruct.getPROP_LOT_SIZE();

				String itemLt =
					Calculate.divide(struct.getPUCH_ODR_QTY(), propLotSize, 0, Calculate._CEIL);
				itemLt = Calculate.multiply(itemLt, propLt);
				itemLt = Calculate.add(itemLt, fixedLt);
				itemLt = Calculate.add(itemLt, safetyLt);
				itemLt = Calculate.multiply(itemLt, "-1");
				
				// �����\���(����)
				String puchOdrDlvTime = struct.getPUCH_ODR_DLV_TIME();
				//TIME_CTRL=true�̏ꍇ
				if("true".equals(struct.getTIME_CTRL())) {
					if(puchOdrDlvTime.length() == 3) {
						puchOdrDlvTime = "0" + puchOdrDlvTime;
					} else {
						puchOdrDlvTime = "0000";
					}					
				} else {
					puchOdrDlvTime = "0000";
				}
				// �����\������v�Z
                String resultDate = calcWorkDay(struct.getPUCH_ODR_DLV_DATE(), puchOdrDlvTime, itemLt, true);
    			// [�Ɩ����t]���𕔕i���擾
    			DateCtrlStruct dcs = DateCtrlControl.getData(conn, struct.getPLANT_CD());

				// �Z�o���������\��� < [���t����]."�Ɩ��^�p��"�̏ꍇ��[���t����]."�Ɩ��^�p��"�𢔭���\�����Ƃ���B
				if (DateTool.compareYMD(resultDate.substring(0,10), dcs.getBUSINESS_OPR_DATE()) < 0) {
					struct.setPUCH_ODR_START_DATE(dcs.getBUSINESS_OPR_DATE());
				} else {
                    struct.setPUCH_ODR_START_DATE(resultDate.substring(0,10));
                    
				}
			}
			try {
				pucs =
						//Mod Start 20131226 song-yy
//					PuchUnitCostControl.getData(
//						conn,
//						_myCompanyStruct.getCOMPANY_CD(),
//						struct.getVEND_CD(),
//						struct.getPLANT_CD(),
//						struct.getITEM_CD(),
//						struct.getPUCH_ODR_START_DATE(),
//						struct.getPUCH_ODR_DLV_DATE(),
//						struct.getPUCH_ODR_QTY());	
				PuchUnitCostControl.getDataTax(
						conn,
						_myCompanyStruct.getCOMPANY_CD(),
						struct.getVEND_CD(),
						struct.getPLANT_CD(),
						struct.getITEM_CD(),
						struct.getPUCH_ODR_START_DATE(),
						struct.getPUCH_ODR_DLV_DATE(),
						struct.getPUCH_ODR_QTY(),
						_taxCd);
                //Mod  End 20131226 song-yy	
				
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
				struct.setTAX_ROUND_TYP(pucs.getTAX_ROUND_TYP());
				struct.setROUND_TYP(pucs.getROUND_TYP());
				struct.setCUR_CD(pucs.getCUR_CD());
				struct.setCUR_NAME(pucs.getCUR_NAME());
				struct.setVEND_CUR_UNIT(pucs.getCUR_UNIT());
				struct.setVEND_DECIMAL_FIG(pucs.getDECIMAL_FIG());
				
                //20090427 ADD START
                //���ł̏ꍇ�ɐŊz���v�Z����
        		String lowerTaxCd =
        			struct.getTAX_CD().substring(struct.getTAX_CD().length() - 1);
        		if (!lowerTaxCd.equals("1")) {
	       			//�o�b�`�p�����[�^�ďo
	       			List batList = entity.mSYS_BAT_PARM.read(conn, struct);
	       			if(!batList.isEmpty()){
	       				//�Ōv�Z���i���R�[��
	       				AE0020020Struct batStruct = (AE0020020Struct)batList.get(0);
	       				struct.setPVC2LOGMODE(batStruct.getPVC2LOGMODE());
	       				struct.setPVC2OUTPUTMODE(batStruct.getPVC2OUTPUTMODE());
	       				struct.setPVC2OUTPUTPATH(batStruct.getPVC2OUTPUTPATH());
	       				struct.setPVC2OUTPUTNAME(batStruct.getPVC2OUTPUTNAME());
	       				struct.setPVC2USERID(this.sysUSER_CD);
	       				struct.setPVC2BUSINESSNAME(batStruct.getPVC2BUSINESSNAME());
	       				struct.setPVC2PLANTCD(this.sysPLANT_CD);
	       				struct.setPVC2TAXID("5");
	       				batList = entity.mcallSQLCALCTAXCALCAMT.call(conn, struct);
	       				batStruct = (AE0020020Struct)batList.get(0);
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
        		//20090427 ADD END
			} catch (DataNotFoundException e) {
				setErrorMessage("AE00060", e.getMessage());
				setErrorParameter("T_RLSD_PUCH_ODR", "VEND_CD", struct.getVEND_CD());
				setErrorParameter("T_RLSD_PUCH_ODR", "PLANT_CD", struct.getPLANT_CD());
				setErrorParameter("T_RLSD_PUCH_ODR", "ITEM_CD", struct.getITEM_CD());
				setErrorParameter(
					"T_RLSD_PUCH_ODR",
					"PUCH_ODR_START_DATE",
					struct.getPUCH_ODR_START_DATE());
				setErrorParameter(
					"T_RLSD_PUCH_ODR",
					"PUCH_ODR_DLV_DATE",
					struct.getPUCH_ODR_DLV_DATE());
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_QTY", struct.getPUCH_ODR_QTY());
				return;
			}

			// �בփ��[�g�����݂��Ȃ��ꍇ�̓��[�j���O�����Ƃ��邽�ߕʂɎ擾
			try {
				ExchRateStruct ers =
					ExchRateControl.getData(
						conn,
						_myCompanyStruct.getCOMPANY_CD(),
						pucs.getCUR_CD(),
						pucs.getEXCH_TYP(),
						null,
						struct.getPUCH_ODR_DLV_DATE());
				// ��בփ��[�g���ݒ�
				struct.setEXCH_RATE(ers.getEXCH_RATE());
				// ��M�݋��z��̌v�Z
				String homeCurAmount =
					AmountCalculator.calcHomeCurAmount(
						pucs.getAMOUNT_INCLUDE_TAX(),
						ers.getEXCH_RATE(),
						pucs.getROUND_TYP(),
						_homeCurStruct.getDECIMAL_FIG());

				struct.setHOME_CUR_AMOUNT(homeCurAmount);

			} catch (DataNotFoundException e) {

				struct.setHOME_CUR_AMOUNT("0");
				struct.setEXCH_RATE("0");
				setWarningMessage("AE00061");
				setWarningParameter("T_RLSD_PUCH_ODR", "VEND_CD", struct.getVEND_CD());
				setWarningParameter("T_RLSD_PUCH_ODR", "PLANT_CD", struct.getPLANT_CD());
				setWarningParameter("T_RLSD_PUCH_ODR", "ITEM_CD", struct.getITEM_CD());
				setWarningParameter(
					"T_RLSD_PUCH_ODR",
					"PUCH_ODR_START_DATE",
					struct.getPUCH_ODR_START_DATE());
				setWarningParameter(
					"T_RLSD_PUCH_ODR",
					"PUCH_ODR_DLV_DATE",
					struct.getPUCH_ODR_DLV_DATE());
				setWarningParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_QTY", struct.getPUCH_ODR_QTY());
			}
			struct.setSelectUnitCostFlag("true");
		} catch (SQLException e) {
			throw new ExpjException(e);
		} catch (Exception e) {
			throw new ExpjException(e);
		}
                //}}user_implement_dev:<controlSelectUnitCost>
		logger.exiting("AE0020020Control"+":USER="+struct.getsUser_ID(),"controlSelectUnitCost");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0020");
		logger.entering("AE0020020Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
		try {

			AE0020020Struct itemStruct = null;
			String tempNetAmount = null;

			if((struct.getPUCH_ODR_DLV_TIME()).length() == 3){
				struct.setPUCH_ODR_DLV_TIME("0" + struct.getPUCH_ODR_DLV_TIME());
			}
			if((struct.getCONFIRM_DLV_TIME()).length() == 3){
				struct.setCONFIRM_DLV_TIME("0" + struct.getCONFIRM_DLV_TIME());
			}
			if((struct.getPUCH_ODR_START_TIME()).length() == 3){
				struct.setPUCH_ODR_START_TIME("0" + struct.getPUCH_ODR_START_TIME());
			}
			
			String PuchOdrDlvTime = struct.getPUCH_ODR_DLV_TIME();
			String ConfirmDlvTime = struct.getCONFIRM_DLV_TIME();
			String PuchOdrStartTime = struct.getPUCH_ODR_START_TIME();
			//TIME_CTRL=false�̏ꍇ
			if(struct.getPUCH_ODR_DLV_TIME() == null || "".equals(struct.getPUCH_ODR_DLV_TIME())){
				PuchOdrDlvTime = "0000";
			}
			if(struct.getCONFIRM_DLV_TIME() == null || "".equals(struct.getCONFIRM_DLV_TIME())){
				ConfirmDlvTime = "0000";
			}
			if(struct.getPUCH_ODR_START_TIME() == null || "".equals(struct.getPUCH_ODR_START_TIME())){
				PuchOdrStartTime = "0000";
			}
			
			List itemList = entity.mM_ITEM.read(conn, struct);
			// ��i�ڔԍ���ŁA[�i��]���������A���݂��Ȃ������ꍇ
			if (itemList.isEmpty()) {
				setErrorMessage("AE50509");
				setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
			} else {
				// [�i��]."�i�ڎ�z�敪" != 8:�[���i�ڂ̏ꍇ
				itemStruct = (AE0020020Struct) itemList.get(0);
				if (("8".equals(itemStruct.getMRP_ODR_TYP()))) {
					setErrorMessage("AE32601");
					setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
				}
			}

			// [�Ɩ����t]���𕔕i���擾
			DateCtrlStruct dcs = DateCtrlControl.getData(conn, struct.getPLANT_CD());

			// ������[�������ғ����̏ꍇ
			if (!isWorkDay(struct.getPUCH_ODR_DLV_DATE())) {
				setErrorMessage("AE00028");
				setErrorParameter(
					"T_RLSD_PUCH_ODR",
					"PUCH_ODR_DLV_DATE",
					struct.getPUCH_ODR_DLV_DATE());
			}
			// ������[��� < [���t����]."�Ɩ��^�p��"�̏ꍇ
			if (DateTool.compareYMD(struct.getPUCH_ODR_DLV_DATE(), dcs.getBUSINESS_OPR_DATE())
				< 0) {
				setErrorMessage("AE00030");
				setErrorParameter("SYS_DATE_CTRL", "PLANT_CD", struct.getPLANT_CD());
				setErrorParameter("SYS_DATE_CTRL", "BUSINESS_OPR_DATE", dcs.getBUSINESS_OPR_DATE());
				setErrorParameter(
					"T_RLSD_PUCH_ODR",
					"PUCH_ODR_DLV_DATE",
					struct.getPUCH_ODR_DLV_DATE());
			}

			
			// ������\������ != Null�̏ꍇ�A�ȉ��̃`�F�b�N���s���B
			if (struct.getPUCH_ODR_START_DATE() != null
				&& !"".equals(struct.getPUCH_ODR_START_DATE())) {
				// ������\��������ғ����̏ꍇ
				if (!isWorkDay(struct.getPUCH_ODR_START_DATE())) {
					setErrorMessage("AE00029");
					setErrorParameter(
						"T_RLSD_PUCH_ODR",
						"PUCH_ODR_START_DATE",
						struct.getPUCH_ODR_START_DATE());
				}
				// ������\���� < [���t����]."�Ɩ��^�p��"�̏ꍇ
				if (DateTool
					.compareYMD(struct.getPUCH_ODR_START_DATE(), dcs.getBUSINESS_OPR_DATE())
					< 0) {
					setErrorMessage("AE00031");
					setErrorParameter("SYS_DATE_CTRL", "PLANT_CD", struct.getPLANT_CD());
					setErrorParameter(
						"SYS_DATE_CTRL",
						"BUSINESS_OPR_DATE",
						dcs.getBUSINESS_OPR_DATE());
					setErrorParameter(
						"T_RLSD_PUCH_ODR",
						"PUCH_ODR_START_DATE",
						struct.getPUCH_ODR_START_DATE());
				}
			}

			// ������R�[�h����A[�����]�ɑ��݂��Ȃ��ꍇ
			List vendCtrlList = entity.mM_VEND_CTRL.read(conn, struct);
			AE0020020Struct vendCtrlStruct = null;
			if (vendCtrlList.isEmpty()) {
				setErrorMessage("AE20030");
				setErrorParameter("M_VEND_CTRL", "VEND_CD", struct.getVEND_CD());
			} else {
				vendCtrlStruct = (AE0020020Struct) vendCtrlList.get(0);
				// ������."�����ԃt���O" = 1:�����~�̏ꍇ
				if ("1".equals(vendCtrlStruct.getDEAL_STS_FLG())) {
					setErrorMessage("AE00002");
					setErrorParameter("M_VEND_CTRL", "VEND_CD", struct.getVEND_CD());
				}
			}

			// �����ꏊ��ŁA[�ۊǋ�]���������A���݂��Ȃ��ꍇ�A
			List whList = entity.mM_WH.read(conn, struct);
			if (whList.isEmpty()) {
				setErrorMessage("AE00018");
				setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
			} else {
				// [�ۊǋ�]."�H��R�[�h"!=��H��R�[�h��̏ꍇ
				AE0020020Struct whStruct = (AE0020020Struct) whList.get(0);
				if (!struct.getPLANT_CD().equals(whStruct.getPLANT_CD())) {
					setErrorMessage("AE00032");
					setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
					setErrorParameter("M_WH", "PLANT_CD", whStruct.getPLANT_CD());
					setErrorParameter("T_RLSD_PUCH_ODR", "PLANT_CD", struct.getPLANT_CD());
				}
			}
			// ������S���ң != Null�ŁA����[���[�U�}�X�^]�ɑ��݂��Ȃ��ꍇ
			if ((struct.getPUCH_ODR_PERSON() != null)
				&& (struct.getPUCH_ODR_PERSON().length() > 0)) {
				List userList = entity.mUSER_MST.read(conn, struct);
				if (userList.isEmpty()) {
					setErrorMessage("AE00005");
					setErrorParameter("USER_MST", "USER_CD", struct.getPUCH_ODR_PERSON());
				}
			}

			// [���v��]."����" != Null �̏ꍇ�̂݁A�ȉ��̃`�F�b�N�������s���B
			AE0020020Struct odStruct = null;
			List odList = entity.mT_OD.read(conn, struct);
			odStruct = (AE0020020Struct) odList.get(0);
			if (odStruct.getJOB_ODR_CD() != null) {
				//[���Ԍv��]."�[��" < ������[��� ���@���Ԕ[�����Ɩ��^�p���ȍ~�̏ꍇ�A�G���[
				//[���Ԍv��]."�[��" < ������[��� ���@���Ԕ[�����Ɩ��^�p�����O�̏ꍇ�A���[�j���O
				List jobOdrList = entity.mT_JOB_ODR.read(conn, struct);
				AE0020020Struct jobOdrStruct = (AE0020020Struct) jobOdrList.get(0);
				if(DateTool.compareYMD(struct.getPUCH_ODR_DLV_DATE(),jobOdrStruct.getJOB_ODR_DLV_DATE())> 0){
					if(DateTool.compareYMD(jobOdrStruct.getJOB_ODR_DLV_DATE(),dcs.getBUSINESS_OPR_DATE()) >= 0){
						setErrorMessage("AE32604");
						setErrorParameter("T_OD", "OD_NO", struct.getOD_NO());
						setErrorParameter("T_OD", "JOB_ODR_CD", odStruct.getJOB_ODR_CD());
						setErrorParameter("T_JOB_ODR","JOB_ODR_DLV_DATE",jobOdrStruct.getJOB_ODR_DLV_DATE());
						setErrorParameter("T_RLSD_PUCH_ODR","PUCH_ODR_DLV_DATE",struct.getPUCH_ODR_DLV_DATE());
					}else{
						setWarningMessage("AE32605");
						setWarningParameter("T_OD", "OD_NO", struct.getOD_NO());
						setWarningParameter("T_OD", "JOB_ODR_CD", odStruct.getJOB_ODR_CD());
						setWarningParameter("T_JOB_ODR","JOB_ODR_DLV_DATE",jobOdrStruct.getJOB_ODR_DLV_DATE());
						setWarningParameter("T_RLSD_PUCH_ODR","PUCH_ODR_DLV_DATE",struct.getPUCH_ODR_DLV_DATE());
					}
				}
			}
			
			// �G���[������ΏI��
			if (msgStruct.hasError()) {
				_nextUrl = "/AE0020021.jsp";
				return;
			}

			// ����ŏ����擾
			try {
				TaxStruct ts =
				// [����ŋ敪]�����擾
					TaxControl.getData(
						conn,
						struct.getCOMPANY_CD(),
						struct.getVEND_CD(),
						struct.getITEM_CD(),
						struct.getPUCH_ODR_DLV_DATE());
				// [�ʉ�]�����擾
				CurStruct cs =
					CurControl.getData(conn, struct.getCOMPANY_CD(), struct.getVEND_CD());

						//�������z���܂�ߏ���
						String tempOdrAmount =
						AmountCalculator.calcPuchOdrAmount(
							struct.getPUCH_ODR_QTY(),
							struct.getUNIT_COST(),
							cs.getROUND_TYP(),
							cs.getDECIMAL_FIG());
		                 if(!com.nec.jp.orteus.expj.util.Calculate.isNotInNumRange(tempOdrAmount)){
		                     // �����ꍀ�ڎ擾�Z�b�g
		                    String ErrInfo = CoreTools.getRBString("Expj.PUCH_ODR_AMOUNT_2", resource);
		                	setErrorMessage("AA00215",ErrInfo);
							_nextUrl = "/AE0020021.jsp";
		                	 return;
		                 }
						tempNetAmount = Calculate.subtract(tempOdrAmount, struct.getDISC_AMOUNT());

						
				struct.setTAX_CD(ts.getTAX_CD());
				String lowerTaxCd = ts.getTAX_CD().substring(ts.getTAX_CD().length() - 1);
                //20090428 MOD START
                //  String lowerTaxCd = ts.getTAX_CD().substring(ts.getTAX_CD().length() - 1);
                //if (lowerTaxCd.equals("1")) {
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
                //20090428 MOD END
				struct.setTAX_ROUND_TYP(ts.getTAX_ROUND_TYP());

				struct.setROUND_TYP(cs.getROUND_TYP());
				struct.setVEND_DECIMAL_FIG(cs.getDECIMAL_FIG());
			} catch (DataNotFoundException e) {
				setErrorMessage(e.getCode());
				setErrorParameter("T_RLSD_PUCH_ODR", "COMPANY_CD", struct.getCOMPANY_CD());
				setErrorParameter("T_RLSD_PUCH_ODR", "VEND_CD", struct.getVEND_CD());
				setErrorParameter("T_RLSD_PUCH_ODR", "ITEM_CD", struct.getITEM_CD());
				setErrorParameter(
					"T_RLSD_PUCH_ODR",
					"PUCH_ODR_DLV_DATE",
					struct.getPUCH_ODR_DLV_DATE());
				return;
			}

			// ������\������Null�̏ꍇ�A������\�������Z�o����B
			if (struct.getPUCH_ODR_START_DATE() == null
				|| "".equals(struct.getPUCH_ODR_START_DATE())) {
				// �ʏ�i�̏ꍇ�͢�����[��������ɔ����\������Z�o�����̌��ʂ𔭒��\����Ƃ���B
				String fixedLt = odStruct.getFIXED_LT();
				String propLt = odStruct.getPROP_LT();
				String safetyLt = odStruct.getSAFETY_LT();
				String propLotSize = odStruct.getPROP_LOT_SIZE();

				String itemLt =
					Calculate.divide(struct.getPUCH_ODR_QTY(), propLotSize, 0, Calculate._CEIL);
				itemLt = Calculate.multiply(itemLt, propLt);
				itemLt = Calculate.add(itemLt, fixedLt);
				itemLt = Calculate.add(itemLt, safetyLt);
				itemLt = Calculate.multiply(itemLt, "-1");

                String resultDate = calcWorkDay(struct.getPUCH_ODR_DLV_DATE(), PuchOdrDlvTime, itemLt, true);


				// �Z�o���������\��� < [���t����]."�Ɩ��^�p��"�̏ꍇ��[���t����]."�Ɩ��^�p��"�𢔭���\�����Ƃ���B
				if (DateTool.compareYMD(resultDate.substring(0,10), dcs.getBUSINESS_OPR_DATE()) < 0) {
					struct.setPUCH_ODR_START_DATE(dcs.getBUSINESS_OPR_DATE());
                    PuchOdrStartTime = "0000";

				} else {
                    struct.setPUCH_ODR_START_DATE(resultDate.substring(0,10));
                    if("false".equals(struct.getTIME_CTRL())){
                    	PuchOdrStartTime = "0000";
                    }else{
                    	PuchOdrStartTime = resultDate.substring(10);
                    }

				}
			}
            if(Calculate.compare(struct.getNET_AMOUNT(), tempNetAmount) != 0){
             	//�w���P����Ǎ��݁A���݂���ΒP���Ǎ��𑣂��G���[�A���݂��Ȃ�(�������͉��P�����P��0)�̏ꍇ�́A
            	//���[�j���O�Ƃ��Ċۂߌ�̋��z��{�̋��z�Ƃ��A�������s         
                		PuchUnitCostStruct pucs;
	                 	pucs =
	                         PuchUnitCostControl.getData(
	                          conn,
	                          _myCompanyStruct.getCOMPANY_CD(),
	                          struct.getVEND_CD(),
	                          struct.getPLANT_CD(),
	                          struct.getITEM_CD(),
	                          struct.getPUCH_ODR_START_DATE(),
	                          struct.getPUCH_ODR_DLV_DATE(),
	                          struct.getPUCH_ODR_QTY());
	                 	
	                 	if("1".equals(pucs.getUNIT_COST_TYP()) &&
	                 			"0.00".equals(pucs.getUNIT_COST()) &&
	                 			"0.00".equals(pucs.getPROCESSING_COST()) &&
	                 			"0.00".equals(pucs.getMATERIAL_COST()) &&
	                 			"0.00".equals(pucs.getOTHER_OVERHEADS())){
	                 			struct.setNET_AMOUNT(tempNetAmount);
							    setWarningMessage("AE00200");  
	                 	}else{
						    setErrorMessage("AE00147");
						    _nextUrl = "/AE0020021.jsp";
							return;  
	                 	}
			}

			// �����Ǘ��i�ڂ̏ꍇ�A��������؂�グ�ă��[�j���O���b�Z�[�W��\��
			if ("1".equals(itemStruct.getUNIT_QTY_TYP())) {
				String ceilPuchOdrQty = Calculate.ceil(struct.getPUCH_ODR_QTY(), 0);
				if (Calculate.compare(ceilPuchOdrQty, struct.getPUCH_ODR_QTY()) != 0) {
					struct.setPUCH_ODR_QTY(ceilPuchOdrQty);
					setWarningMessage("AE00034");
					setWarningParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
				}
			}

			// ��������z��̌v�Z
			String puchOdrAmount =
				AmountCalculator.calcPuchOdrAmount(
					struct.getPUCH_ODR_QTY(),
					struct.getUNIT_COST(),
					struct.getROUND_TYP(),
					struct.getVEND_DECIMAL_FIG());
			struct.setPUCH_ODR_AMOUNT(puchOdrAmount);
            if(!com.nec.jp.orteus.expj.util.Calculate.isNotInNumRange(puchOdrAmount)){
                // �����ꍀ�ڎ擾�Z�b�g
               String ErrInfo = CoreTools.getRBString("Expj.PUCH_ODR_AMOUNT_2", resource);
           	setErrorMessage("AA00215",ErrInfo);
			_nextUrl = "/AE0020021.jsp";
           	 return;
            }
			// ��l�����z��̌v�Z
			String discAmount =
				AmountCalculator.calcDiscAmount(
					struct.getPUCH_ODR_AMOUNT(),
					struct.getNET_AMOUNT());
			struct.setDISC_AMOUNT(discAmount);
			
            //20090427 ADD START
            //���ł̏ꍇ�ɐŊz���v�Z����
     		String lowerTaxCd =
     			struct.getTAX_CD().substring(struct.getTAX_CD().length() - 1);                
     		if (!lowerTaxCd.equals("1")) {
    			//�o�b�`�p�����[�^�ďo
    			List batList = entity.mSYS_BAT_PARM.read(conn, struct);
    			if(!batList.isEmpty()){
    				//�Ōv�Z���i���R�[��
    				AE0020020Struct batStruct = (AE0020020Struct)batList.get(0);
    				struct.setPVC2LOGMODE(batStruct.getPVC2LOGMODE());
    				struct.setPVC2OUTPUTMODE(batStruct.getPVC2OUTPUTMODE());
    				struct.setPVC2OUTPUTPATH(batStruct.getPVC2OUTPUTPATH());
    				struct.setPVC2OUTPUTNAME(batStruct.getPVC2OUTPUTNAME());
    				struct.setPVC2USERID(this.sysUSER_CD);
    				struct.setPVC2BUSINESSNAME(batStruct.getPVC2BUSINESSNAME());
    				struct.setPVC2PLANTCD(this.sysPLANT_CD);
    				struct.setPVC2TAXID("5");
    				batList = entity.mcallSQLCALCTAXCALCAMT.call(conn, struct);
    				batStruct = (AE0020020Struct)batList.get(0);
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
                if(!com.nec.jp.orteus.expj.util.Calculate.isNotInNumRange(amountIncludeTax)){
                    // �����ꍀ�ڎ擾�Z�b�g
                   String ErrInfo = CoreTools.getRBString("Expj.AMOUNT_INCLUDE_TAX", resource);
               	setErrorMessage("AA00215",ErrInfo);
				_nextUrl = "/AE0020021.jsp";
               	 return;
                }
         	}
     		//20090427 ADD END
     		
			// ��M�݋��z��̌v�Z
			String homeCurAmount =
				AmountCalculator.calcHomeCurAmount(
					struct.getAMOUNT_INCLUDE_TAX(),
					struct.getEXCH_RATE(),
					struct.getROUND_TYP(),
					_homeCurStruct.getDECIMAL_FIG());
			struct.setHOME_CUR_AMOUNT(homeCurAmount);
            if(!com.nec.jp.orteus.expj.util.Calculate.isNotInNumRange(homeCurAmount)){
                // �����ꍀ�ڎ擾�Z�b�g
               String ErrInfo = CoreTools.getRBString("Expj.HOME_CUR_AMOUNT", resource);
          	 setErrorMessage("AA00215",ErrInfo);
			 _nextUrl = "/AE0020021.jsp";
          	 return;
           }

			// ��ʊO�̕K�v�ȃf�[�^��ݒ�
			struct.setNON_NO_ITEM_FLG("0");
			struct.setITEM_NAME(null);
			struct.setPRODUCT_TYP("0");
			struct.setSTOCK_UNIT(null);
			struct.setINV_CTRL_FLG("1");
			struct.setACPT_INSPC_TYP(itemStruct.getACPT_INSPC_TYP());

			/** �����\����i�����܂ށj*/
			struct.setPUCH_ODR_START_DATE_ALL(struct.getPUCH_ODR_START_DATE() + " " + PuchOdrStartTime);
			/** �����[���i�����܂ށj*/
			struct.setPUCH_ODR_DLV_DATE_ALL(struct.getPUCH_ODR_DLV_DATE() + " " + PuchOdrDlvTime);
			/** �����񓚔[���i�����܂ށj*/
			struct.setCONFIRM_DLV_DATE_ALL(struct.getCONFIRM_DLV_DATE() + " " + ConfirmDlvTime);
			if((struct.getCONFIRM_DLV_DATE_ALL()).equals(" 0000")){
				struct.setCONFIRM_DLV_DATE_ALL("");
			}

			// ������ԍ���������̔�
			Numbering puchCdNumbering =
				new Numbering(
					conn,
					Numbering.PUCH_CD,
					sysUSER_CD,
					sp.getProcId(),
					struct.getPLANT_CD());
			struct.setPUCH_ODR_CD(puchCdNumbering.getNo());

			// [�����c]��o�^
			int nRet = entity.mT_RLSD_PUCH_ODR.create(conn, struct);

			// [���v��]�̃I�[�_���̍X�V
			CommonOd od = new CommonOd(conn, struct.getPLANT_CD(), sysUSER_CD, sp.getProcId());
			od.changeOdInfo(struct.getOD_NO(), -1);

			// ��ʍĕ\��
			controlSelect();

			conn.commit();
		} catch (SQLException e) {
			throw new ExpjException(e);
		} catch (DataNotFoundException e) {
			throw new ExpjException(e);
		} catch (ParseException e) {
			throw new ExpjException(e);
		} catch (ApsComException e) {
			throw new ExpjException(e);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
                //}}user_implement_dev:<controlInsert>
		logger.exiting("AE0020020Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0020");
		logger.entering("AE0020020Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
		try {
	         String tempNetAmount = null;   
			if((struct.getPUCH_ODR_DLV_TIME()).length() == 3){
				struct.setPUCH_ODR_DLV_TIME("0" + struct.getPUCH_ODR_DLV_TIME());
			}
			if((struct.getCONFIRM_DLV_TIME()).length() == 3){
				struct.setCONFIRM_DLV_TIME("0" + struct.getCONFIRM_DLV_TIME());
			}
			if((struct.getPUCH_ODR_START_TIME()).length() == 3){
				struct.setPUCH_ODR_START_TIME("0" + struct.getPUCH_ODR_START_TIME());
			}
			
			String PuchOdrDlvTime = struct.getPUCH_ODR_DLV_TIME();
			String ConfirmDlvTime = struct.getCONFIRM_DLV_TIME();
			String PuchOdrStartTime = struct.getPUCH_ODR_START_TIME();
			//TIME_CTRL=false�̏ꍇ
			if(struct.getPUCH_ODR_DLV_TIME() == null || "".equals(struct.getPUCH_ODR_DLV_TIME())){
				PuchOdrDlvTime = "0000";
			}
			if(struct.getCONFIRM_DLV_TIME() == null || "".equals(struct.getCONFIRM_DLV_TIME())){
				ConfirmDlvTime = "0000";
			}
			if(struct.getPUCH_ODR_START_TIME() == null || "".equals(struct.getPUCH_ODR_START_TIME())){
				PuchOdrStartTime = "0000";
			}
			
			// ��H��R�[�h� + ������ԍ�����A[�����c]�ɑ��݂��Ȃ��ꍇ
			List lockedList = entity.mT_RLSD_PUCH_ODR_Lock.read(conn, struct);
			if (lockedList.isEmpty()) {
				setErrorMessage("ZZ01105");
			}
			AE0020020Struct lockedStruct = (AE0020020Struct) lockedList.get(0);
			// [�����c]."�X�V��" != ��X�V���(hidden�g�p)�̏ꍇ
			if (!lockedStruct.getMODIFY_COUNT().equals(struct.getMODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
			}
			
			// �f�[�^���擾
			List formList = entity.mFormSub1Update.read(conn, struct);
			if (formList.isEmpty()) {
				setErrorMessage("ZZ01105");
			}

			// ��ʃf�[�^���Z�b�g
			AE0020020Struct formStruct = (AE0020020Struct) formList.get(0);
			// ������ԋ敪=�w���ς݂̃t���O
			boolean bOdrSts = true;
			if ("2".equals(formStruct.getPUCH_ODR_STS_TYP())) {
				bOdrSts = false;
			}

			// �G���[���������ꍇ�͏����𒆒f
			if (msgStruct.hasError()) {
				_nextUrl = "/AE0020021.jsp";
				return;
			}
			
			
			
			AE0020020Struct itemStruct = null;
			List itemList = entity.mM_ITEM.read(conn, struct);
			// ��i�ڔԍ���ŁA[�i��]���������A���݂��Ȃ������ꍇ
			if (itemList.isEmpty()) {
				setErrorMessage("AE50509");
				setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
			} else {
				// [�i��]."�i�ڎ�z�敪" = 8:�[���i�ڂ̏ꍇ
				itemStruct = (AE0020020Struct) itemList.get(0);
				if (("8".equals(itemStruct.getMRP_ODR_TYP()))) {
					setErrorMessage("AE32601");
					setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
				}
			}

			//DateFormat df = new SimpleDateFormat("yyyy/MM/dd");

			// [�Ɩ����t]���𕔕i���擾
			DateCtrlStruct dcs = DateCtrlControl.getData(conn, struct.getPLANT_CD());

			if(bOdrSts){
			// ������[�������ғ����̏ꍇ
			if (!isWorkDay(struct.getPUCH_ODR_DLV_DATE())) {
				setErrorMessage("AE00028");
				setErrorParameter(
					"T_RLSD_PUCH_ODR",
					"PUCH_ODR_DLV_DATE",
					struct.getPUCH_ODR_DLV_DATE());
			}
			// ������[��� < [���t����]."�Ɩ��^�p��"�̏ꍇ
			if (DateTool.compareYMD(struct.getPUCH_ODR_DLV_DATE(), dcs.getBUSINESS_OPR_DATE())
				< 0) {
				setErrorMessage("AE00030");
				setErrorParameter("SYS_DATE_CTRL", "PLANT_CD", struct.getPLANT_CD());
				setErrorParameter("SYS_DATE_CTRL", "BUSINESS_OPR_DATE", dcs.getBUSINESS_OPR_DATE());
				setErrorParameter(
					"T_RLSD_PUCH_ODR",
					"PUCH_ODR_DLV_DATE",
					struct.getPUCH_ODR_DLV_DATE());
			}

			// ������\���� != Null�̏ꍇ�A�ȉ��̃`�F�b�N���s���B
			if (struct.getPUCH_ODR_START_DATE() != null
				&& !"".equals(struct.getPUCH_ODR_START_DATE())) {
				// ������\��������ғ����̏ꍇ
				if (!isWorkDay(struct.getPUCH_ODR_START_DATE())) {
					setErrorMessage("AE00029");
					setErrorParameter(
						"T_RLSD_PUCH_ODR",
						"PUCH_ODR_START_DATE",
						struct.getPUCH_ODR_START_DATE());
				}
				// ������\���� < [���t����]."�Ɩ��^�p��"�̏ꍇ
				if (DateTool
					.compareYMD(struct.getPUCH_ODR_START_DATE(), dcs.getBUSINESS_OPR_DATE())
					< 0) {
					setErrorMessage("AE00031");
					setErrorParameter("SYS_DATE_CTRL", "PLANT_CD", struct.getPLANT_CD());
					setErrorParameter(
						"SYS_DATE_CTRL",
						"BUSINESS_OPR_DATE",
						dcs.getBUSINESS_OPR_DATE());
					setErrorParameter(
						"T_RLSD_PUCH_ODR",
						"PUCH_ODR_START_DATE",
						struct.getPUCH_ODR_START_DATE());
				}
			}
		}

			// ����̏ꍇ�̓`�F�b�N���Ȃ�
			if (!"1".equals(struct.getOUTSIDE_TYP())) {
				List vendCtrlList = entity.mM_VEND_CTRL.read(conn, struct);
				// ������R�[�h����A[�����]�ɑ��݂��Ȃ��ꍇ
				if (vendCtrlList.isEmpty()) {
					setErrorMessage("AE20030");
					setErrorParameter("M_VEND_CTRL", "VEND_CD", struct.getVEND_CD());
				} else {
					// ������."�����ԃt���O" = 1:�����~�̏ꍇ
					AE0020020Struct vendCtrlStruct = (AE0020020Struct) vendCtrlList.get(0);
					if (vendCtrlStruct.getDEAL_STS_FLG().equals("1")) {
						setErrorMessage("AE00002");
						setErrorParameter("M_VEND_CTRL", "VEND_CD", struct.getVEND_CD());
					}
				}
				// �����ꏊ����A[�ۊǋ�]�ɑ��݂��Ȃ��ꍇ
				List whList = entity.mM_WH.read(conn, struct);
				if (whList.isEmpty()) {
					setErrorMessage("AE00018");
					setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
				} else {
					// [�ۊǋ�]."�H��R�[�h" != ��H��R�[�h��̏ꍇ
					AE0020020Struct whStruct = (AE0020020Struct) whList.get(0);
					if (!struct.getPLANT_CD().equals(whStruct.getPLANT_CD())) {
						setErrorMessage("AE00032");
						setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
						setErrorParameter("M_WH", "PLANT_CD", whStruct.getPLANT_CD());
						setErrorParameter("T_RLSD_PUCH_ODR", "PLANT_CD", struct.getPLANT_CD());
					}
				}
				// ������S���ң != Null�ŁA����[���[�U�}�X�^]�ɑ��݂��Ȃ��ꍇ
				if ((struct.getPUCH_ODR_PERSON() != null)
					&& (struct.getPUCH_ODR_PERSON().length() > 0)) {
					List userList = entity.mUSER_MST.read(conn, struct);
					if (userList.isEmpty()) {
						setErrorMessage("AE00005");
						setErrorParameter("USER_MST", "USER_CD", struct.getPUCH_ODR_PERSON());
					}
				}
			}
			// <<���Ԃ̔����v��ύX�̏ꍇ>>
			// ������c�."�I�[�_�f�}���h�ԍ�"�ŁA[���v��]�������B
			// [���v��]."����" != Null �̏ꍇ�̂݁A�ȉ��̃`�F�b�N�������s���B
			AE0020020Struct odStruct = null;
			List odList = entity.mT_OD.read(conn, struct);
			odStruct = (AE0020020Struct) odList.get(0);
			if (odStruct.getJOB_ODR_CD() != null) {
				//[���Ԍv��]."�[��" < ������[��� ���@���Ԕ[�����Ɩ��^�p���ȍ~�̏ꍇ�A�G���[
				//[���Ԍv��]."�[��" < ������[��� ���@���Ԕ[�����Ɩ��^�p�����O�̏ꍇ�A���[�j���O
				List jobOdrList = entity.mT_JOB_ODR.read(conn, struct);
				AE0020020Struct jobOdrStruct = (AE0020020Struct) jobOdrList.get(0);
				if(DateTool.compareYMD(struct.getPUCH_ODR_DLV_DATE(),jobOdrStruct.getJOB_ODR_DLV_DATE())> 0){
					if(DateTool.compareYMD(jobOdrStruct.getJOB_ODR_DLV_DATE(),dcs.getBUSINESS_OPR_DATE()) >= 0){
						setErrorMessage("AE32604");
						setErrorParameter("T_OD", "OD_NO", struct.getOD_NO());
						setErrorParameter("T_OD", "JOB_ODR_CD", odStruct.getJOB_ODR_CD());
						setErrorParameter("T_JOB_ODR","JOB_ODR_DLV_DATE",jobOdrStruct.getJOB_ODR_DLV_DATE());
						setErrorParameter("T_RLSD_PUCH_ODR","PUCH_ODR_DLV_DATE",struct.getPUCH_ODR_DLV_DATE());
					}else{
						setWarningMessage("AE32605");
						setWarningParameter("T_OD", "OD_NO", struct.getOD_NO());
						setWarningParameter("T_OD", "JOB_ODR_CD", odStruct.getJOB_ODR_CD());
						setWarningParameter("T_JOB_ODR","JOB_ODR_DLV_DATE",jobOdrStruct.getJOB_ODR_DLV_DATE());
						setWarningParameter("T_RLSD_PUCH_ODR","PUCH_ODR_DLV_DATE",struct.getPUCH_ODR_DLV_DATE());
					}
				}
			}

			// �G���[���������ꍇ�͏����𒆒f
			if (msgStruct.hasError()) {
				_nextUrl = "/AE0020021.jsp";
				return;
			}
			
			// [�ʉ�]�����擾
         CurStruct cs =
         CurControl.getData(conn, struct.getCOMPANY_CD(), struct.getVEND_CD());
        
			//�������z���܂�ߏ���
			String tempOdrAmount =
			AmountCalculator.calcPuchOdrAmount(
				struct.getPUCH_ODR_QTY(),
				struct.getUNIT_COST(),
				cs.getROUND_TYP(),
				cs.getDECIMAL_FIG());
            if(!com.nec.jp.orteus.expj.util.Calculate.isNotInNumRange(tempOdrAmount)){
                // �����ꍀ�ڎ擾�Z�b�g
               String ErrInfo = CoreTools.getRBString("Expj.PUCH_ODR_AMOUNT_2", resource);
           	setErrorMessage("AA00215",ErrInfo);
			_nextUrl = "/AE0020021.jsp";
           	 return;
            }
			tempNetAmount = Calculate.subtract(tempOdrAmount, struct.getDISC_AMOUNT());
					
			// �G���[���������ꍇ�͏����𒆒f
			if (msgStruct.hasError()) {
				_nextUrl = "/AE0020021.jsp";
				return;
			}

			// ������\������Null�̏ꍇ�A������\�������Z�o����B
			if (struct.getPUCH_ODR_START_DATE() == null
				|| "".equals(struct.getPUCH_ODR_START_DATE())) {

				// �ʏ�i�̏ꍇ�͢�����[��������ɔ����\������Z�o�����̌��ʂ𔭒��\����Ƃ���B
				String fixedLt = odStruct.getFIXED_LT();
				String propLt = odStruct.getPROP_LT();
				String safetyLt = odStruct.getSAFETY_LT();
				String propLotSize = odStruct.getPROP_LOT_SIZE();

				String itemLt =
					Calculate.divide(struct.getPUCH_ODR_QTY(), propLotSize, 0, Calculate._CEIL);
				itemLt = Calculate.multiply(itemLt, propLt);
				itemLt = Calculate.add(itemLt, fixedLt);
				itemLt = Calculate.add(itemLt, safetyLt);
				itemLt = Calculate.multiply(itemLt, "-1");

                String resultDate = calcWorkDay(struct.getPUCH_ODR_DLV_DATE(), PuchOdrDlvTime, itemLt, true);
                
				// �Z�o���������\��� < [���t����]."�Ɩ��^�p��"�̏ꍇ��[���t����]."�Ɩ��^�p��"�𢔭���\�����Ƃ���B
				if (DateTool.compareYMD(resultDate.substring(0,10), dcs.getBUSINESS_OPR_DATE()) < 0) {
                    struct.setPUCH_ODR_START_DATE(dcs.getBUSINESS_OPR_DATE());
                    PuchOdrStartTime = "0000";
				} else {
                    struct.setPUCH_ODR_START_DATE(resultDate.substring(0,10));
                    if("false".equals(struct.getTIME_CTRL())){
                    	PuchOdrStartTime = "0000";
                    }else{
                    	PuchOdrStartTime = resultDate.substring(10);
                    }
				}
			}

			/** �����\����i�����܂ށj*/
			struct.setPUCH_ODR_START_DATE_ALL(struct.getPUCH_ODR_START_DATE() + " " + PuchOdrStartTime);
			/** �����[���i�����܂ށj*/
			struct.setPUCH_ODR_DLV_DATE_ALL(struct.getPUCH_ODR_DLV_DATE() + " " + PuchOdrDlvTime);
			/** �����񓚔[���i�����܂ށj*/
			struct.setCONFIRM_DLV_DATE_ALL(struct.getCONFIRM_DLV_DATE() + " " + ConfirmDlvTime);
			if((struct.getCONFIRM_DLV_DATE_ALL()).equals(" 0000")){
				struct.setCONFIRM_DLV_DATE_ALL("");
			}
			//�O��̏ꍇ�`�F�b�N
			if (!"1".equals(struct.getOUTSIDE_TYP())) {
	            if(Calculate.compare(struct.getNET_AMOUNT(), tempNetAmount) != 0){
	             	//�w���P����Ǎ��݁A���݂���ΒP���Ǎ��𑣂��G���[�A���݂��Ȃ�(�������͉��P�����P��0)�̏ꍇ�́A
	            	//���[�j���O�Ƃ��Ċۂߌ�̋��z��{�̋��z�Ƃ��A�������s         
	                		PuchUnitCostStruct pucs;
		                 	pucs =
		                 		//Mod  Start 20131226 song-yy
//		                         PuchUnitCostControl.getData(
//		                          conn,
//		                          _myCompanyStruct.getCOMPANY_CD(),
//		                          struct.getVEND_CD(),
//		                          struct.getPLANT_CD(),
//		                          struct.getITEM_CD(),
//		                          struct.getPUCH_ODR_START_DATE(),
//		                          struct.getPUCH_ODR_DLV_DATE(),
//		                          struct.getPUCH_ODR_QTY());
		                 	PuchUnitCostControl.getDataTax(
			                          conn,
			                          _myCompanyStruct.getCOMPANY_CD(),
			                          struct.getVEND_CD(),
			                          struct.getPLANT_CD(),
			                          struct.getITEM_CD(),
			                          struct.getPUCH_ODR_START_DATE(),
			                          struct.getPUCH_ODR_DLV_DATE(),
			                          struct.getPUCH_ODR_QTY(),
			                          _taxCd);
		                 	//Mod  Start 20131226 song-yy
		                 	if("1".equals(pucs.getUNIT_COST_TYP()) &&
		                 			"0.00".equals(pucs.getUNIT_COST()) &&
		                 			"0.00".equals(pucs.getPROCESSING_COST()) &&
		                 			"0.00".equals(pucs.getMATERIAL_COST()) &&
		                 			"0.00".equals(pucs.getOTHER_OVERHEADS())){
		                 			struct.setNET_AMOUNT(tempNetAmount);
								    setWarningMessage("AE00200");  
		                 	}else{
							    setErrorMessage("AE00147");
							    _nextUrl = "/AE0020021.jsp";
								return;  
		                 	}
				}
			}
			
			// ������\���� < [���v��]."��z�����"�̏ꍇ
			if (DateTool.compareYMD(struct.getPUCH_ODR_START_DATE(), odStruct.getODR_START_DATE())
				< 0) {
				setWarningMessage("AE00016");
				setWarningParameter("T_OD", "OD_NO", struct.getOD_NO());
				setWarningParameter("T_OD", "ODR_START_DATE", odStruct.getODR_START_DATE());
				setWarningParameter(
					"T_RLSD_PUCH_ODR",
					"PUCH_ODR_START_DATE",
					struct.getPUCH_ODR_START_DATE());
			}

            // ������\���� = [���v��]."��z�����"�̏ꍇ
            if (DateTool.compareYMD(struct.getPUCH_ODR_START_DATE(), odStruct.getODR_START_DATE()) == 0)
            {
                //�u�����\����v�̎��� < [���v��]."��z�����"�̏ꍇ
                if (Double.parseDouble(PuchOdrStartTime) < Double.parseDouble(odStruct.getODR_START_TIME()))
                {
                     setWarningMessage("AE00016");
                     setWarningParameter("T_OD", "OD_NO", struct.getOD_NO());
                     setWarningParameter("T_OD", "ODR_START_DATE", odStruct.getODR_START_DATE() + " " + odStruct.getODR_START_TIME());
                     setWarningParameter("T_RLSD_PUCH_ODR","PUCH_ODR_START_DATE",struct.getPUCH_ODR_START_DATE() + " " + PuchOdrStartTime);
                }
            }

			// �����Ǘ��i�ڂ̏ꍇ�A��������؂�グ�ă��[�j���O���b�Z�[�W��\��
			if ("1".equals(itemStruct.getUNIT_QTY_TYP())) {
				String ceilPuchOdrQty = Calculate.ceil(struct.getPUCH_ODR_QTY(), 0);
				if (Calculate.compare(ceilPuchOdrQty, struct.getPUCH_ODR_QTY()) != 0) {
					struct.setPUCH_ODR_QTY(ceilPuchOdrQty);
					setWarningMessage("AE00034");
					setWarningParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
				}
			}

			// DB�X�V����
			if ("1".equals(struct.getOUTSIDE_TYP())) {
				// <<����O��敪����A1:����̏ꍇ>>

				// ���O�f�[�^�̐ݒ�
				// ��Ǝ��ы敪�̎擾���Z�b�g
				struct.setOPR_RSLT_TYP(itemStruct.getOPR_RSLT_TYP());
				// [�i��]."��Ǝ��ы敪"�� ��P�F�o������̏ꍇ�́A
				// �P�j��Ƌ�R�[�h���擾���Z�b�g����B
				// �Q�j��Ǝw���ԍ��������̔Ԃ��A[��Ǝw���`�[]���쐬����B
				if ("1".equals(struct.getOPR_RSLT_TYP())) {
					// ��Ƌ�R�[�h���擾���Z�b�g
					List procGrpList = entity.mM_PROC_GRP.read(conn, struct);
					if (!procGrpList.isEmpty()) {
						AE0020020Struct procGrpStruct = (AE0020020Struct) procGrpList.get(0);
						struct.setWS_CD(procGrpStruct.getWS_CD());
					} else {
						struct.setWS_CD(null);
					}
					// �����ٔԁ��Z�b�g
					Numbering oprInstCdNum =
						new Numbering(
							conn,
							Numbering.INST_CD,
							sysUSER_CD,
							sp.getProcId(),
							struct.getPLANT_CD());
					struct.setOPR_INST_CD(oprInstCdNum.getNo());
					// [��Ǝw���`�[]�̓o�^
					entity.mT_OPR_INST_SLIP.create(conn, struct);
				} else {
					struct.setWS_CD(null);
					struct.setOPR_INST_CD(null);
				}
				// [�i�ڕʎd�|]�Ƀf�[�^���쐬���A[�����c]���폜����B
				// �����ٔԁ��Z�b�g
				Numbering workOdrCdNum =
					new Numbering(
						conn,
						Numbering.ODR_CD,
						sysUSER_CD,
						sp.getProcId(),
						struct.getPLANT_CD());
				struct.setWORK_ODR_CD(workOdrCdNum.getNo());
				// [�i�ڕʎd�|]�̓o�^
				entity.mT_WORK_IN_PROC_BY_ITEM.create(conn, struct);
				// [�����c]�̍폜
				entity.mT_RLSD_PUCH_ODR.delete(conn, struct);

				// [���v��]�̍X�V
				CommonOd od = new CommonOd(conn, struct.getPLANT_CD(), sysUSER_CD, sp.getProcId());
				od.changeOdInfo(struct.getOD_NO(), -1);

				// ����ύX�͓��ꏈ���̂��߁A�C���t�H���[�V�������b�Z�[�W��\��
				setInformationMessage("AE00067");
				setInformationParameter(
					"T_WORK_IN_PROC_BY_ITEM",
					"WORK_ODR_CD",
					struct.getWORK_ODR_CD());

			} else {
				// <<����O��敪����A2:�O��̏ꍇ>>

				// ��������z��̌v�Z
				String puchOdrAmount =
					AmountCalculator.calcPuchOdrAmount(
						struct.getPUCH_ODR_QTY(),
						struct.getUNIT_COST(),
						struct.getROUND_TYP(),
						struct.getVEND_DECIMAL_FIG());
				struct.setPUCH_ODR_AMOUNT(puchOdrAmount);
                if(!com.nec.jp.orteus.expj.util.Calculate.isNotInNumRange(puchOdrAmount)){
                    // �����ꍀ�ڎ擾�Z�b�g
                   String ErrInfo = CoreTools.getRBString("Expj.PUCH_ODR_AMOUNT_2", resource);
               	setErrorMessage("AA00215",ErrInfo);
				_nextUrl = "/AE0020021.jsp";
               	 return;
                }
				// ��l�����z��̌v�Z
				String discAmount =
					AmountCalculator.calcDiscAmount(
						struct.getPUCH_ODR_AMOUNT(),
						struct.getNET_AMOUNT());
				struct.setDISC_AMOUNT(discAmount);

	            //20090427 ADD START
	            //���ł̏ꍇ�ɐŊz���v�Z����
				
				// [����ŋ敪]�����擾
				TaxStruct ts =
					//Mod Start 20131226 song-yy
//					TaxControl.getData(
//						conn,
//						struct.getCOMPANY_CD(),
//						struct.getVEND_CD(),
//						struct.getITEM_CD(),
//						struct.getPUCH_ODR_DLV_DATE());
						TaxControl.getDataTax(
								conn,
								struct.getCOMPANY_CD(),
								struct.getVEND_CD(),
								struct.getITEM_CD(),
								struct.getPUCH_ODR_DLV_DATE(),
								_taxCd);
				//Mod End 20131226 song-yy
				
				struct.setTAX_CD(ts.getTAX_CD());
				
				String lowerTaxCd = ts.getTAX_CD().substring(ts.getTAX_CD().length() - 1);             
	     		if (!lowerTaxCd.equals("1")) {
	     			
	                 struct.setTAX_RATE_1(ts.getTAX_RATE_1());
	                 struct.setTAX_RATE_2(ts.getTAX_RATE_2());
	                 struct.setTAX_RATE_3(ts.getTAX_RATE_3());
	                 
	    			//�o�b�`�p�����[�^�ďo
	    			List batList = entity.mSYS_BAT_PARM.read(conn, struct);
	    			if(!batList.isEmpty()){
	    				//�Ōv�Z���i���R�[��
	    				AE0020020Struct batStruct = (AE0020020Struct)batList.get(0);
	    				struct.setPVC2LOGMODE(batStruct.getPVC2LOGMODE());
	    				struct.setPVC2OUTPUTMODE(batStruct.getPVC2OUTPUTMODE());
	    				struct.setPVC2OUTPUTPATH(batStruct.getPVC2OUTPUTPATH());
	    				struct.setPVC2OUTPUTNAME(batStruct.getPVC2OUTPUTNAME());
	    				struct.setPVC2USERID(this.sysUSER_CD);
	    				struct.setPVC2BUSINESSNAME(batStruct.getPVC2BUSINESSNAME());
	    				struct.setPVC2PLANTCD(this.sysPLANT_CD);
	    				struct.setPVC2TAXID("5");
	    				batList = entity.mcallSQLCALCTAXCALCAMT.call(conn, struct);
	    				batStruct = (AE0020020Struct)batList.get(0);
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
	                if(!com.nec.jp.orteus.expj.util.Calculate.isNotInNumRange(amountIncludeTax)){
	                      // �����ꍀ�ڎ擾�Z�b�g
	                     String ErrInfo = CoreTools.getRBString("Expj.AMOUNT_INCLUDE_TAX", resource);
	                	 setErrorMessage("AA00215",ErrInfo);
						 _nextUrl = "/AE0020021.jsp";
	                	 return;
	                }
	         	}
				// ��M�݋��z��̌v�Z
				String homeCurAmount =
					AmountCalculator.calcHomeCurAmount(
						struct.getAMOUNT_INCLUDE_TAX(),
						struct.getEXCH_RATE(),
						struct.getROUND_TYP(),
						_homeCurStruct.getDECIMAL_FIG());
				struct.setHOME_CUR_AMOUNT(homeCurAmount);
                if(!com.nec.jp.orteus.expj.util.Calculate.isNotInNumRange(homeCurAmount)){
                    // �����ꍀ�ڎ擾�Z�b�g
                   String ErrInfo = CoreTools.getRBString("Expj.HOME_CUR_AMOUNT", resource);
              	 setErrorMessage("AA00215",ErrInfo);
				 _nextUrl = "/AE0020021.jsp";
              	 return;
                }
				// ��ʊO�̕K�v�ȃf�[�^��ݒ�
				struct.setNON_NO_ITEM_FLG("0");
				struct.setITEM_NAME(null);
				struct.setPRODUCT_TYP("0");
				struct.setSTOCK_UNIT(null);
				struct.setINV_CTRL_FLG("1");
				struct.setACPT_INSPC_TYP(itemStruct.getACPT_INSPC_TYP());

				// �f�[�^�X�V����
				int nRet = entity.mT_RLSD_PUCH_ODR.update(conn, struct);

				// [���v��]�̍X�V
				CommonOd od = new CommonOd(conn, struct.getPLANT_CD(), sysUSER_CD, sp.getProcId());
				od.changeOdInfo(struct.getOD_NO(), -1);
			}

			// ��ʍĕ\��
			controlSelect();

			conn.commit();
		} catch (SQLException e) {
			throw new ExpjException(e);
		} catch (DataNotFoundException e) {
			throw new ExpjException(e);
		} catch (ParseException e) {
			throw new ExpjException(e);
		} catch (ApsComException e) {
			throw new ExpjException(e);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
                //}}user_implement_dev:<controlUpdate>
		logger.exiting("AE0020020Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlReturn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0020");
		logger.entering("AE0020020Control"+":USER="+struct.getsUser_ID(),"controlReturn");
			//{{user_implement_dev:<controlReturn>
		controlSelect();
                //}}user_implement_dev:<controlReturn>
		logger.exiting("AE0020020Control"+":USER="+struct.getsUser_ID(),"controlReturn");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0020");
		logger.entering("AE0020020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
		// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AE0020020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0020");
		logger.entering("AE0020020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		try {
			// [����]���𕔕i���擾			
			_myCompanyStruct = MyCompanyControl.getData(conn);
			// [�Ŗ�]���𕔕i���擾			
			_taxNameStruct = TaxNameControl.getData(conn);
			// [�M��]���𕔕i���擾			
			_homeCurStruct = HomeCurControl.getData(conn);
			// �R���{�{�b�N�X�f�[�^�𕔕i���擾
			ComboBox cdac = new ComboBox(conn, sysUSER_CD);
			_outsideTypStruct = cdac.getData("OUTSIDE_TYP");
			_splItemTypStruct = cdac.getData("SPL_ITEM_TYP");
			_unitCostTypStruct = cdac.getData("UNIT_COST_TYP");
			cdac.setConnection(null);

			// ��ʂ�������
			initializeAll();

			// �����v��i���ԕi�ڑI�����n���ꂽ�L�[���Z�b�g�j
			struct.setOD_NO(_odNo);

			// ��ʃf�[�^�Ǎ�
			controlSelect();

		} catch (SQLException e) {
			throw new ExpjException(e);
		} catch (DataNotFoundException e) {
			throw new ExpjException(e);
		} catch (ComboException e) {
			throw new ExpjException(e);
		}
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AE0020020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0020");
		logger.entering("AE0020020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		// �_�E�����[�h�t�@�C�����N���A
		// PDF�ECSV�̃_�E�����[�h���s���Ƃ��́A��ʏ��OrHidden�ŢDOWNLOAD_FILE����`���A���̍s�̃R�����g���O���Ă��������B
		//			struct.setDOWNLOAD_FILE((String)null);
		// �R���{�{�b�N�X���i�̃f�[�^�̃Z�b�g�͂����ɋL�q���Ă��������B
		// �R���{�{�b�N�X�f�[�^�p��
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AE0020020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("LineInsert") ) {
				controlLineInsert();
			} else if( button.equals("LineUpdate") ) {
				controlLineUpdate();
			} else if( button.equals("LineCopy") ) {
				controlLineCopy();
			} else if( button.equals("LineDelete") ) {
				controlLineDelete();
			} else if( button.equals("SelectUnitCost") ) {
				controlSelectUnitCost();
			} else if( button.equals("Insert") ) {
				controlInsert();
			} else if( button.equals("Update") ) {
				controlUpdate();
			} else if( button.equals("Return") ) {
				controlReturn();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			struct.setCOMPANY_CD(_myCompanyStruct.getCOMPANY_CD());

			struct.setHOME_CUR_UNIT(_homeCurStruct.getCUR_UNIT());
			struct.setHOME_DECIMAL_FIG(_homeCurStruct.getDECIMAL_FIG());

			struct.setList_OUTSIDE_TYP_val(_outsideTypStruct.getValList());
			struct.setList_OUTSIDE_TYP_name(_outsideTypStruct.getExplanList());
			struct.setList_SPL_ITEM_TYP_val(_splItemTypStruct.getValList());
			struct.setList_SPL_ITEM_TYP_name(_splItemTypStruct.getExplanList());
			struct.setList_UNIT_COST_TYP_val(_unitCostTypStruct.getValList());
			struct.setList_UNIT_COST_TYP_name(_unitCostTypStruct.getExplanList());
			// �_�E�����[�h�t�@�C�����N���A
			// PDF�ECSV�̃_�E�����[�h���s���Ƃ��́A��ʏ��OrHidden�ŢDOWNLOAD_FILE����`���A���̍s�̃R�����g���O���Ă��������B
			//			struct.setDOWNLOAD_FILE((String)null);
			//		�\�[�X���ɂ܂�AlarmMessageException���c���Ă���ꍇ�́A�ȉ��̍s�̃R�����g���O����AlarmMessageException���n������B
			//		} catch(AlarmMessageException ame){
			//			ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
			//			throw ee;
			//		
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// �g���b�Z�[�W�o�͈˗��쐬
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AE0020020Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0020020-E999","CSV�̏o�͏���"));
			throw new FoundationException("AE0020020Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0020020-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AE0020020Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0020020-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AE0020020Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AE0020020Entity entity;
	protected AE0020020Struct struct;
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

		entity = new AE0020020Entity();
		struct = new AE0020020Struct();

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
	 * AE0020020�N���X�̕W���R���X�g���N�^
	 */
	public AE0020020Control() throws BusinessProcessException, FoundationException
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
				AE0020020Struct key = (AE0020020Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_DN") && key.getMRP_ODR_TYP_DN() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_DN", key.getMRP_ODR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_DN") && key.getOUTSIDE_TYP_DN() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_DN", key.getOUTSIDE_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("ODR_STS_TYP_DN") && key.getODR_STS_TYP_DN() != null) {
					msgKey.setKeyValue("ODR_STS_TYP_DN", key.getODR_STS_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("DM_STS_TYP_DN") && key.getDM_STS_TYP_DN() != null) {
					msgKey.setKeyValue("DM_STS_TYP_DN", key.getDM_STS_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_name") && key.getOUTSIDE_TYP_name() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_name", key.getOUTSIDE_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_val") && key.getOUTSIDE_TYP_val() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_val", key.getOUTSIDE_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("h_OUTSIDE_TYP") && key.geth_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("h_OUTSIDE_TYP", key.geth_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP_name") && key.getSPL_ITEM_TYP_name() != null) {
					msgKey.setKeyValue("SPL_ITEM_TYP_name", key.getSPL_ITEM_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP_val") && key.getSPL_ITEM_TYP_val() != null) {
					msgKey.setKeyValue("SPL_ITEM_TYP_val", key.getSPL_ITEM_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("h_SPL_ITEM_TYP") && key.geth_SPL_ITEM_TYP() != null) {
					msgKey.setKeyValue("h_SPL_ITEM_TYP", key.geth_SPL_ITEM_TYP());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_name") && key.getUNIT_COST_TYP_name() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP_name", key.getUNIT_COST_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_val") && key.getUNIT_COST_TYP_val() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP_val", key.getUNIT_COST_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("HOME_CUR_UNIT") && key.getHOME_CUR_UNIT() != null) {
					msgKey.setKeyValue("HOME_CUR_UNIT", key.getHOME_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP_DN") && key.getJOB_ODR_TYP_DN() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP_DN", key.getJOB_ODR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP_DN") && key.getUNIT_QTY_TYP_DN() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP_DN", key.getUNIT_QTY_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("SelectUnitCostFlag") && key.getSelectUnitCostFlag() != null) {
					msgKey.setKeyValue("SelectUnitCostFlag", key.getSelectUnitCostFlag());
				}
				if(msgKeyType.containsKeyColumn("PRODUCT_TYP_DN") && key.getPRODUCT_TYP_DN() != null) {
					msgKey.setKeyValue("PRODUCT_TYP_DN", key.getPRODUCT_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("h_PUCH_ODR_QTY") && key.geth_PUCH_ODR_QTY() != null) {
					msgKey.setKeyValue("h_PUCH_ODR_QTY", key.geth_PUCH_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("HOME_DECIMAL_FIG") && key.getHOME_DECIMAL_FIG() != null) {
					msgKey.setKeyValue("HOME_DECIMAL_FIG", key.getHOME_DECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_START_DATE") && key.getl_PUCH_ODR_START_DATE() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_START_DATE", key.getl_PUCH_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_DLV_DATE") && key.getl_PUCH_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_DLV_DATE", key.getl_PUCH_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_QTY") && key.getl_PUCH_ODR_QTY() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_QTY", key.getl_PUCH_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_STOCK_UNIT") && key.getl_STOCK_UNIT() != null) {
					msgKey.setKeyValue("l_STOCK_UNIT", key.getl_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_COST") && key.getl_UNIT_COST() != null) {
					msgKey.setKeyValue("l_UNIT_COST", key.getl_UNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_COST_TYP_DN") && key.getl_UNIT_COST_TYP_DN() != null) {
					msgKey.setKeyValue("l_UNIT_COST_TYP_DN", key.getl_UNIT_COST_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_AMOUNT") && key.getl_PUCH_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_AMOUNT", key.getl_PUCH_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_CUR_UNIT") && key.getl_CUR_UNIT() != null) {
					msgKey.setKeyValue("l_CUR_UNIT", key.getl_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("l_VEND_CD") && key.getl_VEND_CD() != null) {
					msgKey.setKeyValue("l_VEND_CD", key.getl_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("l_VEND_ANAME") && key.getl_VEND_ANAME() != null) {
					msgKey.setKeyValue("l_VEND_ANAME", key.getl_VEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("l_WH_CD") && key.getl_WH_CD() != null) {
					msgKey.setKeyValue("l_WH_CD", key.getl_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("l_WH_NAME") && key.getl_WH_NAME() != null) {
					msgKey.setKeyValue("l_WH_NAME", key.getl_WH_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_CD") && key.getl_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_CD", key.getl_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT") && key.getl_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("l_MODIFY_COUNT", key.getl_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_STS_TYP") && key.getl_PUCH_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_STS_TYP", key.getl_PUCH_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO") && key.getJOB_ODR_CANCEL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_CANCEL_NO", key.getJOB_ODR_CANCEL_NO());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP") && key.getJOB_ODR_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP", key.getJOB_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("ALC_GRP_CD") && key.getALC_GRP_CD() != null) {
					msgKey.setKeyValue("ALC_GRP_CD", key.getALC_GRP_CD());
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
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("ITEM_SPOIL") && key.getITEM_SPOIL() != null) {
					msgKey.setKeyValue("ITEM_SPOIL", key.getITEM_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE") && key.getJOB_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("JOB_ODR_DLV_DATE", key.getJOB_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("DUE_DATE") && key.getDUE_DATE() != null) {
					msgKey.setKeyValue("DUE_DATE", key.getDUE_DATE());
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
				if(msgKeyType.containsKeyColumn("SUM_PUCH_ODR_QTY") && key.getSUM_PUCH_ODR_QTY() != null) {
					msgKey.setKeyValue("SUM_PUCH_ODR_QTY", key.getSUM_PUCH_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("SUM_OPR_INST_QTY") && key.getSUM_OPR_INST_QTY() != null) {
					msgKey.setKeyValue("SUM_OPR_INST_QTY", key.getSUM_OPR_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("ODR_QTY") && key.getODR_QTY() != null) {
					msgKey.setKeyValue("ODR_QTY", key.getODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("DM_QTY") && key.getDM_QTY() != null) {
					msgKey.setKeyValue("DM_QTY", key.getDM_QTY());
				}
				if(msgKeyType.containsKeyColumn("SUM_ALCD_QTY") && key.getSUM_ALCD_QTY() != null) {
					msgKey.setKeyValue("SUM_ALCD_QTY", key.getSUM_ALCD_QTY());
				}
				if(msgKeyType.containsKeyColumn("ODR_STS_TYP") && key.getODR_STS_TYP() != null) {
					msgKey.setKeyValue("ODR_STS_TYP", key.getODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("DM_STS_TYP") && key.getDM_STS_TYP() != null) {
					msgKey.setKeyValue("DM_STS_TYP", key.getDM_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("NON_NO_ITEM_FLG") && key.getNON_NO_ITEM_FLG() != null) {
					msgKey.setKeyValue("NON_NO_ITEM_FLG", key.getNON_NO_ITEM_FLG());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE") && key.getPUCH_ODR_START_DATE() != null) {
					msgKey.setKeyValue("PUCH_ODR_START_DATE", key.getPUCH_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("CONFIRM_DLV_DATE") && key.getCONFIRM_DLV_DATE() != null) {
					msgKey.setKeyValue("CONFIRM_DLV_DATE", key.getCONFIRM_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE") && key.getPUCH_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("PUCH_ODR_DLV_DATE", key.getPUCH_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_START_TIME") && key.getPUCH_ODR_START_TIME() != null) {
					msgKey.setKeyValue("PUCH_ODR_START_TIME", key.getPUCH_ODR_START_TIME());
				}
				if(msgKeyType.containsKeyColumn("CONFIRM_DLV_TIME") && key.getCONFIRM_DLV_TIME() != null) {
					msgKey.setKeyValue("CONFIRM_DLV_TIME", key.getCONFIRM_DLV_TIME());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_TIME") && key.getPUCH_ODR_DLV_TIME() != null) {
					msgKey.setKeyValue("PUCH_ODR_DLV_TIME", key.getPUCH_ODR_DLV_TIME());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_QTY") && key.getPUCH_ODR_QTY() != null) {
					msgKey.setKeyValue("PUCH_ODR_QTY", key.getPUCH_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_NAME") && key.getVEND_NAME() != null) {
					msgKey.setKeyValue("VEND_NAME", key.getVEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON") && key.getPUCH_ODR_PERSON() != null) {
					msgKey.setKeyValue("PUCH_ODR_PERSON", key.getPUCH_ODR_PERSON());
				}
				if(msgKeyType.containsKeyColumn("USER_NAME") && key.getUSER_NAME() != null) {
					msgKey.setKeyValue("USER_NAME", key.getUSER_NAME());
				}
				if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP") && key.getSPL_ITEM_TYP() != null) {
					msgKey.setKeyValue("SPL_ITEM_TYP", key.getSPL_ITEM_TYP());
				}
				if(msgKeyType.containsKeyColumn("PRODUCT_TYP") && key.getPRODUCT_TYP() != null) {
					msgKey.setKeyValue("PRODUCT_TYP", key.getPRODUCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP") && key.getUNIT_COST_TYP() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP", key.getUNIT_COST_TYP());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST") && key.getUNIT_COST() != null) {
					msgKey.setKeyValue("UNIT_COST", key.getUNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_AMOUNT") && key.getPUCH_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("PUCH_ODR_AMOUNT", key.getPUCH_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("AMOUNT_INCLUDE_TAX") && key.getAMOUNT_INCLUDE_TAX() != null) {
					msgKey.setKeyValue("AMOUNT_INCLUDE_TAX", key.getAMOUNT_INCLUDE_TAX());
				}
				if(msgKeyType.containsKeyColumn("NET_AMOUNT") && key.getNET_AMOUNT() != null) {
					msgKey.setKeyValue("NET_AMOUNT", key.getNET_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("DISC_AMOUNT") && key.getDISC_AMOUNT() != null) {
					msgKey.setKeyValue("DISC_AMOUNT", key.getDISC_AMOUNT());
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
				if(msgKeyType.containsKeyColumn("PROCESSING_COST") && key.getPROCESSING_COST() != null) {
					msgKey.setKeyValue("PROCESSING_COST", key.getPROCESSING_COST());
				}
				if(msgKeyType.containsKeyColumn("MATERIAL_COST") && key.getMATERIAL_COST() != null) {
					msgKey.setKeyValue("MATERIAL_COST", key.getMATERIAL_COST());
				}
				if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS") && key.getOTHER_OVERHEADS() != null) {
					msgKey.setKeyValue("OTHER_OVERHEADS", key.getOTHER_OVERHEADS());
				}
				if(msgKeyType.containsKeyColumn("HOME_CUR_AMOUNT") && key.getHOME_CUR_AMOUNT() != null) {
					msgKey.setKeyValue("HOME_CUR_AMOUNT", key.getHOME_CUR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("EXCH_RATE") && key.getEXCH_RATE() != null) {
					msgKey.setKeyValue("EXCH_RATE", key.getEXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_COMMENT") && key.getPUCH_ODR_COMMENT() != null) {
					msgKey.setKeyValue("PUCH_ODR_COMMENT", key.getPUCH_ODR_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_STS_TYP") && key.getPUCH_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("PUCH_ODR_STS_TYP", key.getPUCH_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("INV_CTRL_FLG") && key.getINV_CTRL_FLG() != null) {
					msgKey.setKeyValue("INV_CTRL_FLG", key.getINV_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD") && key.getTAX_CD() != null) {
					msgKey.setKeyValue("TAX_CD", key.getTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP") && key.getTAX_ROUND_TYP() != null) {
					msgKey.setKeyValue("TAX_ROUND_TYP", key.getTAX_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("ROUND_TYP") && key.getROUND_TYP() != null) {
					msgKey.setKeyValue("ROUND_TYP", key.getROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
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
				if(msgKeyType.containsKeyColumn("CONFIRM_DLV_DATE_COMMENT") && key.getCONFIRM_DLV_DATE_COMMENT() != null) {
					msgKey.setKeyValue("CONFIRM_DLV_DATE_COMMENT", key.getCONFIRM_DLV_DATE_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE_ALL") && key.getPUCH_ODR_START_DATE_ALL() != null) {
					msgKey.setKeyValue("PUCH_ODR_START_DATE_ALL", key.getPUCH_ODR_START_DATE_ALL());
				}
				if(msgKeyType.containsKeyColumn("CONFIRM_DLV_DATE_ALL") && key.getCONFIRM_DLV_DATE_ALL() != null) {
					msgKey.setKeyValue("CONFIRM_DLV_DATE_ALL", key.getCONFIRM_DLV_DATE_ALL());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE_ALL") && key.getPUCH_ODR_DLV_DATE_ALL() != null) {
					msgKey.setKeyValue("PUCH_ODR_DLV_DATE_ALL", key.getPUCH_ODR_DLV_DATE_ALL());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP") && key.getACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP", key.getACPT_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP") && key.getOPR_RSLT_TYP() != null) {
					msgKey.setKeyValue("OPR_RSLT_TYP", key.getOPR_RSLT_TYP());
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
				if(msgKeyType.containsKeyColumn("DEAL_STS_FLG") && key.getDEAL_STS_FLG() != null) {
					msgKey.setKeyValue("DEAL_STS_FLG", key.getDEAL_STS_FLG());
				}
				if(msgKeyType.containsKeyColumn("ODR_START_TIME") && key.getODR_START_TIME() != null) {
					msgKey.setKeyValue("ODR_START_TIME", key.getODR_START_TIME());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD") && key.getOPR_INST_CD() != null) {
					msgKey.setKeyValue("OPR_INST_CD", key.getOPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_CD") && key.getWORK_ODR_CD() != null) {
					msgKey.setKeyValue("WORK_ODR_CD", key.getWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("TIME_CTRL") && key.getTIME_CTRL() != null) {
					msgKey.setKeyValue("TIME_CTRL", key.getTIME_CTRL());
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
					AE0020020Struct key = new AE0020020Struct();
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_DN")) {
						key.setMRP_ODR_TYP_DN(msgKey.getKeyValue("MRP_ODR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_DN")) {
						key.setOUTSIDE_TYP_DN(msgKey.getKeyValue("OUTSIDE_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("ODR_STS_TYP_DN")) {
						key.setODR_STS_TYP_DN(msgKey.getKeyValue("ODR_STS_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("DM_STS_TYP_DN")) {
						key.setDM_STS_TYP_DN(msgKey.getKeyValue("DM_STS_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_name")) {
						key.setOUTSIDE_TYP_name(msgKey.getKeyValue("OUTSIDE_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_val")) {
						key.setOUTSIDE_TYP_val(msgKey.getKeyValue("OUTSIDE_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("h_OUTSIDE_TYP")) {
						key.seth_OUTSIDE_TYP(msgKey.getKeyValue("h_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP_name")) {
						key.setSPL_ITEM_TYP_name(msgKey.getKeyValue("SPL_ITEM_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP_val")) {
						key.setSPL_ITEM_TYP_val(msgKey.getKeyValue("SPL_ITEM_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("h_SPL_ITEM_TYP")) {
						key.seth_SPL_ITEM_TYP(msgKey.getKeyValue("h_SPL_ITEM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_name")) {
						key.setUNIT_COST_TYP_name(msgKey.getKeyValue("UNIT_COST_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_val")) {
						key.setUNIT_COST_TYP_val(msgKey.getKeyValue("UNIT_COST_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("HOME_CUR_UNIT")) {
						key.setHOME_CUR_UNIT(msgKey.getKeyValue("HOME_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP_DN")) {
						key.setJOB_ODR_TYP_DN(msgKey.getKeyValue("JOB_ODR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP_DN")) {
						key.setUNIT_QTY_TYP_DN(msgKey.getKeyValue("UNIT_QTY_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("SelectUnitCostFlag")) {
						key.setSelectUnitCostFlag(msgKey.getKeyValue("SelectUnitCostFlag"));
					}
					if(msgKeyType.containsKeyColumn("PRODUCT_TYP_DN")) {
						key.setPRODUCT_TYP_DN(msgKey.getKeyValue("PRODUCT_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("h_PUCH_ODR_QTY")) {
						key.seth_PUCH_ODR_QTY(msgKey.getKeyValue("h_PUCH_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("HOME_DECIMAL_FIG")) {
						key.setHOME_DECIMAL_FIG(msgKey.getKeyValue("HOME_DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_START_DATE")) {
						key.setl_PUCH_ODR_START_DATE(msgKey.getKeyValue("l_PUCH_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_DLV_DATE")) {
						key.setl_PUCH_ODR_DLV_DATE(msgKey.getKeyValue("l_PUCH_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_QTY")) {
						key.setl_PUCH_ODR_QTY(msgKey.getKeyValue("l_PUCH_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_STOCK_UNIT")) {
						key.setl_STOCK_UNIT(msgKey.getKeyValue("l_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_COST")) {
						key.setl_UNIT_COST(msgKey.getKeyValue("l_UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_COST_TYP_DN")) {
						key.setl_UNIT_COST_TYP_DN(msgKey.getKeyValue("l_UNIT_COST_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_AMOUNT")) {
						key.setl_PUCH_ODR_AMOUNT(msgKey.getKeyValue("l_PUCH_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_CUR_UNIT")) {
						key.setl_CUR_UNIT(msgKey.getKeyValue("l_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("l_VEND_CD")) {
						key.setl_VEND_CD(msgKey.getKeyValue("l_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_VEND_ANAME")) {
						key.setl_VEND_ANAME(msgKey.getKeyValue("l_VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("l_WH_CD")) {
						key.setl_WH_CD(msgKey.getKeyValue("l_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_WH_NAME")) {
						key.setl_WH_NAME(msgKey.getKeyValue("l_WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_CD")) {
						key.setl_PUCH_ODR_CD(msgKey.getKeyValue("l_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT")) {
						key.setl_MODIFY_COUNT(msgKey.getKeyValue("l_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_STS_TYP")) {
						key.setl_PUCH_ODR_STS_TYP(msgKey.getKeyValue("l_PUCH_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO")) {
						key.setJOB_ODR_CANCEL_NO(msgKey.getKeyValue("JOB_ODR_CANCEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP")) {
						key.setJOB_ODR_TYP(msgKey.getKeyValue("JOB_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ALC_GRP_CD")) {
						key.setALC_GRP_CD(msgKey.getKeyValue("ALC_GRP_CD"));
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
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(msgKey.getKeyValue("OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_SPOIL")) {
						key.setITEM_SPOIL(msgKey.getKeyValue("ITEM_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE")) {
						key.setJOB_ODR_DLV_DATE(msgKey.getKeyValue("JOB_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("DUE_DATE")) {
						key.setDUE_DATE(msgKey.getKeyValue("DUE_DATE"));
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
					if(msgKeyType.containsKeyColumn("SUM_PUCH_ODR_QTY")) {
						key.setSUM_PUCH_ODR_QTY(msgKey.getKeyValue("SUM_PUCH_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SUM_OPR_INST_QTY")) {
						key.setSUM_OPR_INST_QTY(msgKey.getKeyValue("SUM_OPR_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ODR_QTY")) {
						key.setODR_QTY(msgKey.getKeyValue("ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("DM_QTY")) {
						key.setDM_QTY(msgKey.getKeyValue("DM_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SUM_ALCD_QTY")) {
						key.setSUM_ALCD_QTY(msgKey.getKeyValue("SUM_ALCD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ODR_STS_TYP")) {
						key.setODR_STS_TYP(msgKey.getKeyValue("ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DM_STS_TYP")) {
						key.setDM_STS_TYP(msgKey.getKeyValue("DM_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("NON_NO_ITEM_FLG")) {
						key.setNON_NO_ITEM_FLG(msgKey.getKeyValue("NON_NO_ITEM_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE")) {
						key.setPUCH_ODR_START_DATE(msgKey.getKeyValue("PUCH_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CONFIRM_DLV_DATE")) {
						key.setCONFIRM_DLV_DATE(msgKey.getKeyValue("CONFIRM_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE")) {
						key.setPUCH_ODR_DLV_DATE(msgKey.getKeyValue("PUCH_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_START_TIME")) {
						key.setPUCH_ODR_START_TIME(msgKey.getKeyValue("PUCH_ODR_START_TIME"));
					}
					if(msgKeyType.containsKeyColumn("CONFIRM_DLV_TIME")) {
						key.setCONFIRM_DLV_TIME(msgKey.getKeyValue("CONFIRM_DLV_TIME"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_TIME")) {
						key.setPUCH_ODR_DLV_TIME(msgKey.getKeyValue("PUCH_ODR_DLV_TIME"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_QTY")) {
						key.setPUCH_ODR_QTY(msgKey.getKeyValue("PUCH_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_NAME")) {
						key.setVEND_NAME(msgKey.getKeyValue("VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON")) {
						key.setPUCH_ODR_PERSON(msgKey.getKeyValue("PUCH_ODR_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("USER_NAME")) {
						key.setUSER_NAME(msgKey.getKeyValue("USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP")) {
						key.setSPL_ITEM_TYP(msgKey.getKeyValue("SPL_ITEM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PRODUCT_TYP")) {
						key.setPRODUCT_TYP(msgKey.getKeyValue("PRODUCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP")) {
						key.setUNIT_COST_TYP(msgKey.getKeyValue("UNIT_COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST")) {
						key.setUNIT_COST(msgKey.getKeyValue("UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_AMOUNT")) {
						key.setPUCH_ODR_AMOUNT(msgKey.getKeyValue("PUCH_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("AMOUNT_INCLUDE_TAX")) {
						key.setAMOUNT_INCLUDE_TAX(msgKey.getKeyValue("AMOUNT_INCLUDE_TAX"));
					}
					if(msgKeyType.containsKeyColumn("NET_AMOUNT")) {
						key.setNET_AMOUNT(msgKey.getKeyValue("NET_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("DISC_AMOUNT")) {
						key.setDISC_AMOUNT(msgKey.getKeyValue("DISC_AMOUNT"));
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
					if(msgKeyType.containsKeyColumn("PROCESSING_COST")) {
						key.setPROCESSING_COST(msgKey.getKeyValue("PROCESSING_COST"));
					}
					if(msgKeyType.containsKeyColumn("MATERIAL_COST")) {
						key.setMATERIAL_COST(msgKey.getKeyValue("MATERIAL_COST"));
					}
					if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS")) {
						key.setOTHER_OVERHEADS(msgKey.getKeyValue("OTHER_OVERHEADS"));
					}
					if(msgKeyType.containsKeyColumn("HOME_CUR_AMOUNT")) {
						key.setHOME_CUR_AMOUNT(msgKey.getKeyValue("HOME_CUR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_RATE")) {
						key.setEXCH_RATE(msgKey.getKeyValue("EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_COMMENT")) {
						key.setPUCH_ODR_COMMENT(msgKey.getKeyValue("PUCH_ODR_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_STS_TYP")) {
						key.setPUCH_ODR_STS_TYP(msgKey.getKeyValue("PUCH_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("INV_CTRL_FLG")) {
						key.setINV_CTRL_FLG(msgKey.getKeyValue("INV_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD")) {
						key.setTAX_CD(msgKey.getKeyValue("TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP")) {
						key.setTAX_ROUND_TYP(msgKey.getKeyValue("TAX_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ROUND_TYP")) {
						key.setROUND_TYP(msgKey.getKeyValue("ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
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
					if(msgKeyType.containsKeyColumn("CONFIRM_DLV_DATE_COMMENT")) {
						key.setCONFIRM_DLV_DATE_COMMENT(msgKey.getKeyValue("CONFIRM_DLV_DATE_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE_ALL")) {
						key.setPUCH_ODR_START_DATE_ALL(msgKey.getKeyValue("PUCH_ODR_START_DATE_ALL"));
					}
					if(msgKeyType.containsKeyColumn("CONFIRM_DLV_DATE_ALL")) {
						key.setCONFIRM_DLV_DATE_ALL(msgKey.getKeyValue("CONFIRM_DLV_DATE_ALL"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE_ALL")) {
						key.setPUCH_ODR_DLV_DATE_ALL(msgKey.getKeyValue("PUCH_ODR_DLV_DATE_ALL"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP")) {
						key.setACPT_INSPC_TYP(msgKey.getKeyValue("ACPT_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP")) {
						key.setOPR_RSLT_TYP(msgKey.getKeyValue("OPR_RSLT_TYP"));
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
					if(msgKeyType.containsKeyColumn("DEAL_STS_FLG")) {
						key.setDEAL_STS_FLG(msgKey.getKeyValue("DEAL_STS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ODR_START_TIME")) {
						key.setODR_START_TIME(msgKey.getKeyValue("ODR_START_TIME"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD")) {
						key.setOPR_INST_CD(msgKey.getKeyValue("OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_CD")) {
						key.setWORK_ODR_CD(msgKey.getKeyValue("WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("TIME_CTRL")) {
						key.setTIME_CTRL(msgKey.getKeyValue("TIME_CTRL"));
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
