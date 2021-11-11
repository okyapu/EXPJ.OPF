/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0010/src/com/nec/jp/orteus/metamorBase/KQ0010/KQ0010020Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KQ0010;

import com.nec.jp.orteus.metamorBase.KQ0010.*;
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
import java.text.NumberFormat;
import com.nec.jp.orteus.metamorBase.common06.ExchAmount.*;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class KQ0010020Control
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

	/** ��ʑJ�ڃL�[(�󒍔ԍ�) */
	private String _OdrNo;

	/**
	 * ��ʑJ�ڃL�[(�󒍔ԍ�)�擾
	 * @return �󒍔ԍ�
	 */
	public String getOdrNo() {
		return _OdrNo;
	}
	/**
	 * ��ʑJ�ڃL�[(�󒍔ԍ�)�ݒ�
	 * @param cd �󒍔ԍ�
	 */
	public void setOdrNo(String cd) {
		_OdrNo = cd;
	}

	/** �����敪�l */
	private final static String ODR_TYP_MIKOMI = "1";
	private final static String ODR_TYP_NAIJI = "2";
	private final static String ODR_TYP_KAKUTEI = "3";

	/** �a���敪�l */
	private final static String YOTAKU_NORMAL = "10";
	private final static String YOTAKU_YOTAKU = "20";
    /** �V�X�^���ݒ�l  */	
	private PrivateConfig privateConfig;
	/** �󒍏��F�t���O */
	private String _APR_ODR ;
	/**
	 * �ۂ߁B
	 * @param amount �Ώۋ��z
	 * @param s �X�g���N�g�I�u�W�F�N�g
	 * @return �ۂߋ��z
	 * @throws SQLException �������s
	 * @throws ExpjException �������s
	 */
	private String roundAmount(String amount, KQ0010020Struct s)
		throws SQLException, ExpjException {

		ExchAmount exch = new ExchAmount(conn);

		boolean result =
			exch.doMarume(
				amount,
				_companyCd,
				s.getCURRNCY_CD(),
				s.getEXCH_TYP(),
				s.getDETAIL_ROUND_TYP(),
				_businessOprDate);

		if (!result) {
			throw new ExpjException("KQ00038");
		}

		double roundAmount = exch.getD_EXCH_AMOUNT();

		return String.valueOf(roundAmount);
	}

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
	public KQ0010020Struct getListvalue(int x) { return (KQ0010020Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public KQ0010020Struct getStruct() { return this.struct; }	// Struct��Ԃ��܂��B
	public KQ0010020Struct createStruct() { return new KQ0010020Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((KQ0010020Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

	/** ExchAmount�@�O�݌v�Z�N���X�̃C���X�^���X */
	private ExchAmount exch = null;
	/** ��ЃR�[�h */
	private String _companyCd;
	// ��ЃR�[�h���Q�b�g
	public String get_companyCd() {
		return _companyCd;
	}
	// ��ЃR�[�h���Z�b�g
	public void set_companyCd(String cd) {
		_companyCd = cd;
	}
	/** �Ɩ��^�p�� */
	private String _businessOprDate;
    // �Ɩ��^�p�����Q�b�g
	public String get_businessOprDate() {
		return _businessOprDate;
	}
	// �Ɩ��^�p�����Z�b�g	
	public void set_businessOprDate(String oprDate) {
		_businessOprDate = oprDate;
	}
	/** �̔��Ǘ��p�H��R�[�h */
	private String _plantWeb;
	// �̔��Ǘ��p�H��R�[�h���Q�b�g
	public String get_plantWeb() {
		return _plantWeb;
	}
	// �̔��Ǘ��p�H��R�[�h���Z�b�g
	public void set_plantWeb(String web) {
		_plantWeb = web;
	}
	// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������

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
	 * �Ɩ����W�b�N�̃G���[���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * @param code ���b�Z�[�W�R�[�h
	 */
	public void setAppErrorMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
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
	 * �Ɩ����W�b�N�̃C���t�H���[�V�������b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * @param code ���b�Z�[�W�R�[�h
	 */
	public void setInfoMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addInfo(emsg);
	}
	
	/**
	 * �󒍖��׍X�V�^�폜�\���`�F�b�N����<BR>
	 * �P�D�󒍖��ׂ����݂��邱�Ɓi�������Ɠ��������Ŏ󒍖��הԍ��w��œǂݍ��݁j
	 * �Q�D�X�V�J�E���^���������Ɠ���ł��邱��
	 *
	 * @return boolean true:�X�V�폜�\ false:�X�V�폜�s��
	 */
	private boolean isUpdatable() throws FoundationException,SQLException,ExpjException
	{

		//�X�V�O�ɍēx��������
		list = entity.mselectT_ODR.read(conn, struct);
		if(list == null || getListsize() == 0){
			//�ǂݍ��ݎ��s�i�������ɃX�e�[�^�X���ω��������A�폜���ꂽ�ꍇ�j
			ExpjMessage emsg = new ExpjMessage( "KQ00055" );
			msgStruct.addError( emsg ); // �G���[���b�Z�[�W�Ƃ��ēo�^
			sysLog.warning("KQ00055", getsysUSER_CD()); //�G���[���e
			emsg = new ExpjMessage( "ZZ01006","ODR_NO:" + struct.getIN_ODR_NO() );
			sysLog.warning(emsg, getsysUSER_CD()); //�G���[�ڍ�
			setReadStatus(NOT_FOUND);
			return false;
		}
		KQ0010020Struct wStruct = (KQ0010020Struct) list.get(0);
		struct.setEXCH_TYP( wStruct.getEXCH_TYP() );
		struct.setDETAIL_ROUND_TYP( wStruct.getDETAIL_ROUND_TYP() );
		struct.setCANCELED_UNCONFIRM_ODR_QTY( wStruct.getCANCELED_UNCONFIRM_ODR_QTY() );
		struct.setCURRNCY_CD( wStruct.getCURRNCY_CD() );
		struct.setODR_ACPT_DATE( wStruct.getODR_ACPT_DATE() );
		struct.setDEPO_TYP( wStruct.getDEPO_TYP() );
		struct.setPUCH_ODR_QTY_TOTAL( wStruct.getPUCH_ODR_QTY_TOTAL() );
		struct.setIF_CTL_NO( wStruct.getIF_CTL_NO() );
		struct.setODR_CTL_NO( wStruct.getODR_CTL_NO() );
		struct.setUNIT_CD( wStruct.getUNIT_CD() );
		//struct.setDLV_LOC_CD( wStruct.getDLV_LOC_CD() );
		//struct.setREMARKS( wStruct.getREMARKS() );
		struct.setCUST_CHRG_PSN_CD( wStruct.getCUST_CHRG_PSN_CD() );
		struct.setODR_ACPT_PSN_CD( wStruct.getODR_ACPT_PSN_CD() );
		struct.setSTOCK_UNIT( wStruct.getSTOCK_UNIT() );
		struct.setCOMPANY_CD( wStruct.getCOMPANY_CD() );

		//�r�����b�N���s��
		try {
			list = entity.mselectMODIFY_COUNT.read(conn, struct);
			wStruct = (KQ0010020Struct) list.get(0);
			//�X�V�J�E���^�`�F�b�N
			if(!struct.geth_MODIFY_COUNT().equals(wStruct.geth_MODIFY_COUNT())){
				//�X�V�J�E���^���ω�����
				ExpjMessage emsg = new ExpjMessage( "KQ00055" );
				msgStruct.addError( emsg ); // �G���[���b�Z�[�W�Ƃ��ēo�^
				sysLog.warning("KQ00055", getsysUSER_CD()); //�G���[���e
				emsg = new ExpjMessage( "ZZ01006","ODR_NO:" + struct.getIN_ODR_NO() );
				sysLog.warning(emsg, getsysUSER_CD()); //�G���[�ڍ�
				setReadStatus(ERROR);
				return false;
			}
			list = null;
		} catch(SQLException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "AZ00007" );
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			throw ee;
		}
		return true;
	}

	/**
	 * ���z�P�ʕϊ�����
	 *
	 * @param exch_flg true:���[�g�ϊ�����
	 * @param kin �ϊ��Ώۋ��z
	 * @param inCur �ϊ��Ώۂ̒ʉ݃R�[�h
	 * @param wst KQ0010020Struct
	 * @return �ϊ���̋��z
	 */
	private Double cnvQty(boolean exch_flg, double kin, String inCur,KQ0010020Struct wst) throws SQLException,FoundationException
	{
		// =======================================
		// �בփ��[�g��ǂݍ���ŁA���z�ϊ�����
		// =======================================
		String strAmount = NumberFormat.getInstance().format(kin).replaceAll(",","");
		String strCompanyCd = wst.getCOMPANY_CD();
		String strCurrcyCd = inCur;
		String strExchTyp = wst.getEXCH_TYP();
		String strRoundTyp = wst.getDETAIL_ROUND_TYP();
		String strDate = wst.getODR_ACPT_DATE();
		double strRv ;
		if(exch_flg)
		{
			if(exch.doExchAmount(strAmount,strCompanyCd,strCurrcyCd,strExchTyp,strRoundTyp,strDate)){
				strRv = exch.getD_EXCH_AMOUNT();
			}else{
				sysLog.warning("KQ00038", getsysUSER_CD()); //�G���[���e
				sysLog.severe("AA99991", getsysUSER_CD(), "Amount", strAmount);
				sysLog.severe("AA99991", getsysUSER_CD(), "CompanyCd", strCompanyCd);
				sysLog.severe("AA99991", getsysUSER_CD(), "CurrcyCd", strCurrcyCd);
				sysLog.severe("AA99991", getsysUSER_CD(), "ExchTyp", strExchTyp);
				sysLog.severe("AA99991", getsysUSER_CD(), "RoundTyp", strRoundTyp);
				sysLog.severe("AA99991", getsysUSER_CD(), "Date", strDate);
				ExpjMessage emsg = new ExpjMessage( "KQ00038" );
				msgStruct.addError( emsg ); // �G���[���b�Z�[�W�Ƃ��ēo�^
				return null;
			}
		}
		else
		{
			if(exch.doMarume(strAmount,strCompanyCd,strCurrcyCd,strExchTyp,strRoundTyp,strDate)){
				strRv = exch.getD_EXCH_AMOUNT();
			}else{
				sysLog.warning("KQ00038", getsysUSER_CD());
				sysLog.severe("AA99991", getsysUSER_CD(), "Amount", strAmount);
				sysLog.severe("AA99991", getsysUSER_CD(), "CompanyCd", strCompanyCd);
				sysLog.severe("AA99991", getsysUSER_CD(), "CurrcyCd", strCurrcyCd);
				sysLog.severe("AA99991", getsysUSER_CD(), "ExchTyp", strExchTyp);
				sysLog.severe("AA99991", getsysUSER_CD(), "RoundTyp", strRoundTyp);
				sysLog.severe("AA99991", getsysUSER_CD(), "Date", strDate);
				ExpjMessage emsg = new ExpjMessage( "KQ00038" );
				msgStruct.addError( emsg ); // �G���[���b�Z�[�W�Ƃ��ēo�^
				return null;
			}
		}
		return new Double(strRv);
	}
	/**
	 * ������ʒǉ�����<BR>
	 * �P�D�m��󒍐��ʂ𑝉������ꍇ�ɁA����������s��
	 * �@�@����������ʂ��󒍖��ׂɑ���
	 *
	 * @param String �󒍔ԍ�
	 * @param Double ��������
	 * @return boolean true:����I�� false:�G���[����
	 */	
    private boolean kattuteiadd (String odrNo,double addqty) throws FoundationException,SQLException,ExpjException
    {
    	Double w_qty = null;
		// [�����m�蒍�����]�̓Ǎ�
		if(addqty == 0)	return true;
        //------------------------------
		// �����m���������̃f�[�^������ꍇ
		//------------------------------
		
		//�m��󒍔ԍ����L�[�ɓ����m���������̈����ςݐ��ʂO�ȊO�̃��R�[�h��ǂݍ���
		//�ǂݍ��ݎ��͎󒍖��ׂ́D�D�D���擾����B
		//�������͈������̏���

		struct.setfkgnFIXED_ODR_NO(odrNo);
		List listRireki = entity.mfkgn_T_ALLOC_FIXED_ODR_RSLT1.read(conn,struct);
		double zan = addqty;
		if(listRireki != null && listRireki.size() >0){
			for(int i=0; i < listRireki.size() && zan > 0 ; i++){
				KQ0010020Struct wkst = (KQ0010020Struct)listRireki.get(i);
				wkst.setsUser_ID(struct.getsUser_ID());

				//�󒍖��׍ēǂݍ��݁i���j�Z�����Ή��œ���߂��悪����ꍇ�ēǂݍ��݂��Ȃ��Ɛ������߂��Ȃ�����j
				wkst.setfkgnODR_NO(wkst.getfkgnALCTED_UNCONFIRM_ODR_NO());
				List wkOdr = entity.mfkgn_T_ODR.read(conn,wkst);
				wkst.setfkgnREMAIN_UNCONFIRM_ODR_QTY(((KQ0010020Struct)wkOdr.get(0)).getfkgnREMAIN_UNCONFIRM_ODR_QTY());
				wkst.setfkgnUNCONFIRM_ODR_BALANCE(((KQ0010020Struct)wkOdr.get(0)).getfkgnUNCONFIRM_ODR_BALANCE());

				double modosi = 0;	//������ɖ߂�����

				//�������ςݐ��ʂ�߂��Ɠ����c���󒍐��ʂ�葽���Ȃ��Ă��܂��ꍇ�A
				//  �󒍐��ʂ܂ł����߂��Ȃ��悤�ɂ���(���S�̂��߁j
				double hik = wkst.getfkgnALCTED_UNCONFIRM_ODR_QTY().doubleValue();
				double remainqty = wkst.getfkgnREMAIN_UNCONFIRM_ODR_QTY().doubleValue();

				if (zan > remainqty) {
					hik = remainqty+hik;
					modosi = remainqty;
				} else {
					hik = zan +hik;
					modosi = zan;
				}
				// =======================================
				// �����m���������X�V
				// =======================================
				wkst.setfkgnALCTED_UNCONFIRM_ODR_QTY(new Double(hik));
				if(hik == 0){
					wkst.setfkgnDEL_FLG("1");
				}else{
					wkst.setfkgnDEL_FLG("0");
				}
				wkst.setfkgnFIXED_ODR_NO(odrNo);
				int rv = entity.mfkgn_T_ALLOC_FIXED_ODR_RSLT.update(conn,wkst);
				if(rv != 1){
					//�X�V�������P���ȊO
					setReadStatus(ERROR);
					ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
					sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
					ExpjException ee = new ExpjException(emsg); // �G�N�Z�v�V�����𐶐�
					throw ee;
				}

				// =======================================
				// ������󒍖��׍X�V
				// =======================================
				if(ODR_TYP_NAIJI.equals(wkst.getfkgnODR_TYP())){
					wkst.setfkgnODR_NO(wkst.getfkgnALCTED_UNCONFIRM_ODR_NO());
					wkst.setfkgnREMAIN_UNCONFIRM_ODR_QTY(new Double(wkst.getfkgnREMAIN_UNCONFIRM_ODR_QTY().doubleValue() - modosi));
			
					w_qty = cnvQty(false,wkst.getfkgnREMAIN_UNCONFIRM_ODR_QTY().doubleValue() * wkst.getfkgnODR_UNIT_PRICE().doubleValue(),
									wkst.getfkgnCURRNCY_CD(),wkst);
					if(w_qty == null) continue;
					wkst.setfkgnUNCONFIRM_ODR_BALANCE(w_qty);
				}else{
					wkst.setfkgnODR_NO(wkst.getfkgnALCTED_UNCONFIRM_ODR_NO());
                    wkst.setfkgnUNCONFIRM_ODR_BALANCE(new Double(0));
                }
				rv = entity.mfkgn_T_ODR.update(conn,wkst);

				if(rv != 1){
					//�X�V�������P���ȊO
					setReadStatus(ERROR);
					ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
					sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
					ExpjException ee = new ExpjException(emsg); // �G�N�Z�v�V�����𐶐�
					throw ee;
				}
				// ����������������������A�c��̒����������߂�
				if (zan > 0) {
					zan = zan - modosi;					
				}

			}
			listRireki = null;
		}	
		
		if (zan <=   0) {
			return true;
		}
		//-----------------------------
		// �����m���������̃f�[�^���Ȃ��ꍇ
		//-----------------------------
		
		List odrUnconfirmList = entity.mT_ODR_Unconfirm.read(conn, struct);

		String odrQty = Double.toString(zan);
	    struct.setMAX_ODR_NO(odrNo);
        List maxalctedseqno = entity.mMAX_ALCTED_SEQ_CD.read(conn,struct);
        double maxseqno = 0;
        if (maxalctedseqno !=null && maxalctedseqno.size()>0) {
            maxseqno = (((KQ0010020Struct)maxalctedseqno.get(0)).getMAX_ALCTED_SEQ_CD()).doubleValue();        	
        }
		for (int j = 0; j < odrUnconfirmList.size(); j++) {
			KQ0010020Struct odrUnconfirmStruct =
				(KQ0010020Struct) odrUnconfirmList.get(j);

			// �o�^/�X�V�p�V�X�e���f�[�^��ݒ�
			odrUnconfirmStruct.setsOraganization_CD(struct.getsOrganization_CD());
			odrUnconfirmStruct.setsSysdate(struct.getsSysdate());
			odrUnconfirmStruct.setsUser_ID(struct.getsUser_ID());

			// [�����m�蒍�����]�f�[�^��ݒ�
			odrUnconfirmStruct.setfkgnFIXED_ODR_NO(odrNo);
			
			odrUnconfirmStruct.setfkgnALCTED_SEQ_CD(String.valueOf(maxseqno+j + 1));
			odrUnconfirmStruct.setfkgnALCTED_UNCONFIRM_ODR_NO(odrUnconfirmStruct.getODR_NO());
			if (Calculate
				.compare(odrQty, odrUnconfirmStruct.getREMAIN_UNCONFIRM_ODR_QTY())
				> 0) {
				odrUnconfirmStruct.setfkgnALCTED_UNCONFIRM_ODR_QTY(
					new Double (odrUnconfirmStruct.getREMAIN_UNCONFIRM_ODR_QTY()));
			} else {
				odrUnconfirmStruct.setfkgnALCTED_UNCONFIRM_ODR_QTY(new Double(odrQty));
			}

			// [�����m�蒍�����]�̓o�^
			entity.mfkgn_T_ALLOC_FIXED_ODR_RSLT.create(conn, odrUnconfirmStruct);

			// [�󒍖���]�X�V�p�f�[�^��ݒ�
			String remainUnconfirmOdrQty =
				Calculate.subtract(
					odrUnconfirmStruct.getREMAIN_UNCONFIRM_ODR_QTY(),
					odrUnconfirmStruct.getfkgnALCTED_UNCONFIRM_ODR_QTY().toString());
			odrUnconfirmStruct.setREMAIN_UNCONFIRM_ODR_QTY(remainUnconfirmOdrQty);

			String unconfirmOdrBalance =
				Calculate.multiply(
					odrUnconfirmStruct.getREMAIN_UNCONFIRM_ODR_QTY(),
					odrUnconfirmStruct.getODR_UNIT_PRICE());
			try {
				odrUnconfirmStruct.setUNCONFIRM_ODR_BALANCE(
					new Double(roundAmount(unconfirmOdrBalance, odrUnconfirmStruct)));
			} catch (ExpjException e) {
				setErrorMessage("KQ00038");
				setErrorParameter("", "AMOUNT", unconfirmOdrBalance);
				setErrorParameter("", "COMPANY_CD", _companyCd);
				setErrorParameter("", "CURRNCY_CD", struct.getCURRNCY_CD());
				setErrorParameter("", "EXCH_TYP", struct.getEXCH_TYP());
				setErrorParameter(
					"",
					"DETAIL_ROUND_TYP",
					struct.getDETAIL_ROUND_TYP());
				setErrorParameter("", "BUSINESS_OPR_DATE", _businessOprDate);
				return false;
			}

			// [�󒍖���]�̍X�V
			entity.mT_ODR_Unconfirm.update(conn, odrUnconfirmStruct);

			// ����������������������A�c��̒����������߂�
			odrQty =
				Calculate.subtract(
					odrQty,
					odrUnconfirmStruct.getfkgnALCTED_UNCONFIRM_ODR_QTY().toString());
			// �������������Ȃ����珈�����I��
			if (Calculate.compare(odrQty, "0") == 0) {
				break;
			}
		}

	
    	return true;
    }
	/**
	 * ������ʕ�������<BR>
	 * �P�D�m��󒍂��폜�A�܂��́A�m��󒍐��ʂ�ύX�����ꍇ�ɁA�����������������
	 * �@�@����������ʂ����̎󒍖��ׂɖ߂�
	 *
	 * @param String �󒍔ԍ�
	 * @param Double ��������
	 * @return boolean true:����I�� false:�G���[����
	 */
	private final static int M_UPD = 1;
	private final static int M_DEL = 2;
	private boolean kakuteiRollback(int mode,String odrNo,double suryo) throws FoundationException,SQLException,ExpjException
	{
		//���ʌ����̏ꍇ�A���A�m�蒍���̏ꍇ�A
		//�������������΁A���̗�������A�Y������󒍁i�����j�Ɍ�������߂�
		//�߂��́A����Ƌt���ōs��
		//�@�@�����̈������ʁ����������̏ꍇ
		//       ���Y�󒍂Ɉ������ʕ���߂�����A�����̍폜�t���O���P�ɍX�V
		//�@�@�����̈������ʁ��������̏ꍇ
		//       ���Y�󒍂Ɉ������ʕ���߂�����A�����̈������ʂ��X�V����
		//���ʂO�̏ꍇ�͉������Ȃ��Ő���I��
		Double w_qty = null;
		if(suryo == 0)	return true;

		//�m��󒍔ԍ����L�[�ɓ����m���������̈����ςݐ��ʂO�ȊO�̃��R�[�h��ǂݍ���
		//�ǂݍ��ݎ��͎󒍖��ׂ́D�D�D���擾����B
		//�������͈������̍~��

		struct.setfkgnFIXED_ODR_NO(odrNo);
		List listRireki = entity.mfkgn_T_ALLOC_FIXED_ODR_RSLT.read(conn,struct);
		if(listRireki == null || listRireki.size() < 1){
		}else{
			double zan = suryo;
			for(int i=0; i < listRireki.size() && zan > 0; i++){
				KQ0010020Struct wkst = (KQ0010020Struct)listRireki.get(i);
				wkst.setsUser_ID(struct.getsUser_ID());

				//�󒍖��׍ēǂݍ��݁i���j�Z�����Ή��œ���߂��悪����ꍇ�ēǂݍ��݂��Ȃ��Ɛ������߂��Ȃ�����j
				wkst.setfkgnODR_NO(wkst.getfkgnALCTED_UNCONFIRM_ODR_NO());
				List wkOdr = entity.mfkgn_T_ODR.read(conn,wkst);
				wkst.setfkgnREMAIN_UNCONFIRM_ODR_QTY(((KQ0010020Struct)wkOdr.get(0)).getfkgnREMAIN_UNCONFIRM_ODR_QTY());
				wkst.setfkgnUNCONFIRM_ODR_BALANCE(((KQ0010020Struct)wkOdr.get(0)).getfkgnUNCONFIRM_ODR_BALANCE());

				double modosi = 0;	//������ɖ߂�����

				//�������ςݐ��ʂ�߂��Ɠ����c���󒍐��ʂ�葽���Ȃ��Ă��܂��ꍇ�A
				//  �󒍐��ʂ܂ł����߂��Ȃ��悤�ɂ���(���S�̂��߁j
				double hik = wkst.getfkgnALCTED_UNCONFIRM_ODR_QTY().doubleValue();
				double qty = wkst.getfkgnODR_QTY().doubleValue();

				// =======================================
				// �߂����ʌv�Z
				// =======================================
				if(zan < hik ){
					hik = hik - zan;
					modosi = zan;
				}else{
					modosi = hik;
					hik = 0;
				}
				zan = zan - modosi;
				// =======================================
				// �����m���������X�V
				// =======================================
				wkst.setfkgnALCTED_UNCONFIRM_ODR_QTY(new Double(hik));
				if(hik == 0){
					wkst.setfkgnDEL_FLG("1");
				}else{
					wkst.setfkgnDEL_FLG("0");
				}
				wkst.setfkgnFIXED_ODR_NO(odrNo);
				int rv = entity.mfkgn_T_ALLOC_FIXED_ODR_RSLT.update(conn,wkst);
				if(rv != 1){
					//�X�V�������P���ȊO
					setReadStatus(ERROR);
					ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
					sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
					ExpjException ee = new ExpjException(emsg); // �G�N�Z�v�V�����𐶐�
					throw ee;
				}

				// =======================================
				// ������󒍖��׍X�V
				// =======================================
				if(ODR_TYP_NAIJI.equals(wkst.getfkgnODR_TYP())){
					wkst.setfkgnODR_NO(wkst.getfkgnALCTED_UNCONFIRM_ODR_NO());
					wkst.setfkgnREMAIN_UNCONFIRM_ODR_QTY(new Double(wkst.getfkgnREMAIN_UNCONFIRM_ODR_QTY().doubleValue() + modosi));
					w_qty = cnvQty(false,wkst.getfkgnREMAIN_UNCONFIRM_ODR_QTY().doubleValue() * wkst.getfkgnODR_UNIT_PRICE().doubleValue(),
									wkst.getfkgnCURRNCY_CD(),wkst);
					if(w_qty == null) continue;
					wkst.setfkgnUNCONFIRM_ODR_BALANCE(w_qty);
				}else{
					wkst.setfkgnODR_NO(wkst.getfkgnALCTED_UNCONFIRM_ODR_NO());
                    wkst.setfkgnUNCONFIRM_ODR_BALANCE(new Double(0));
                }
				rv = entity.mfkgn_T_ODR.update(conn,wkst);

				if(rv != 1){
					//�X�V�������P���ȊO
					setReadStatus(ERROR);
					ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
					sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
					ExpjException ee = new ExpjException(emsg); // �G�N�Z�v�V�����𐶐�
					throw ee;
				}
			}
			listRireki = null;
		}
		return true;
	}

        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010020Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			struct.seth_ODR_NO(struct.getIN_ODR_NO());
			struct.initialize();
			list = entity.mselectT_ODR.read(conn, struct);
			if(list == null || getListsize() == 0){
				//�f�[�^�����݂��Ȃ�
				if ( isScreenMove() == true ) {
					ExpjMessage emsg = new ExpjMessage( "KQ10316" );
					msgStruct.addError( emsg ); // �G���[���b�Z�[�W�Ƃ��ēo�^
					sysLog.warning("KQ10316", getsysUSER_CD()); //�G���[���e
					emsg = new ExpjMessage( "ZZ01006","ODR_NO:" + struct.getIN_ODR_NO() );
					sysLog.warning(emsg, getsysUSER_CD()); //�G���[�ڍ�
				} else {
					ExpjMessage emsg = new ExpjMessage( "ZZ01101" );
					msgStruct.addError( emsg ); // �G���[���b�Z�[�W�Ƃ��ēo�^
					sysLog.warning("ZZ01101", getsysUSER_CD()); //�G���[���e
					emsg = new ExpjMessage( "ZZ01006","ODR_NO:" + struct.getIN_ODR_NO() );
					sysLog.warning(emsg, getsysUSER_CD()); //�G���[�ڍ�
				}
				setReadStatus(NOT_FOUND);
				return;
			}
			
			KQ0010020Struct wStruct = (KQ0010020Struct) list.get(0);
			struct.setODR_QTY( wStruct.getODR_QTY() );
			struct.seth_ODR_QTY( wStruct.getODR_QTY() );
			struct.setDESINATED_DLV_DATE( wStruct.getDESINATED_DLV_DATE() );
			struct.seth_DESINATED_DLV_DATE( wStruct.getDESINATED_DLV_DATE() );
			struct.setSPCL_PRICE_TYP( wStruct.getSPCL_PRICE_TYP() );
			struct.seth_SPCL_PRICE_TYP( wStruct.getSPCL_PRICE_TYP() );
			struct.setODR_UNIT_PRICE( wStruct.getODR_UNIT_PRICE() );
			struct.setCUS_DLV_KEY_CD( wStruct.getCUS_DLV_KEY_CD() );
			struct.seth_CUS_DLV_KEY_CD( wStruct.getCUS_DLV_KEY_CD() );
			struct.setCUS_DLV_CD( wStruct.getCUS_DLV_CD() );
			struct.seth_CUS_DLV_CD( wStruct.getCUS_DLV_CD() );
			struct.setITEM_CD( wStruct.getITEM_CD() );
			struct.setITEM_NAME( wStruct.getITEM_NAME() );
			struct.setCUST_CD( wStruct.getCUST_CD() );
			struct.setCUST_ANAME( wStruct.getCUST_ANAME() );
			struct.setCUST_ITEM_CD( wStruct.getCUST_ITEM_CD() );
            struct.setCUST_ITEM_NAME( wStruct.getCUST_ITEM_NAME() );
			struct.setCUST_ODR_NO( wStruct.getCUST_ODR_NO() );
			struct.setODR_TYP( this.multcombo("ODR_ODR_TYP",wStruct.getODR_TYP() ));
			struct.seth_REMAIN_UNCONFIRM_ODR_QTY( wStruct.geth_REMAIN_UNCONFIRM_ODR_QTY() );
			struct.seth_SHIP_PLAN_REMAIN_QTY( wStruct.geth_SHIP_PLAN_REMAIN_QTY() );
			struct.seth_ODR_TYP( wStruct.geth_ODR_TYP() );
			struct.seth_MODIFY_COUNT( wStruct.geth_MODIFY_COUNT() );
			struct.seth_ANS_DLV_DATE_EXIST_FLG( wStruct.geth_ANS_DLV_DATE_EXIST_FLG() );
			struct.seth_T_SHIP_ODR_EXIST_FLG( wStruct.geth_T_SHIP_ODR_EXIST_FLG() );
            struct.setUNIT_CD( wStruct.getUNIT_CD() );
			struct.setUNIT_NAME( wStruct.getUNIT_NAME() );
            struct.setUNIT_QTY_TYP( wStruct.getUNIT_QTY_TYP() );
            struct.setPKG_UNIT( wStruct.getPKG_UNIT() );
            struct.setSTOCK_UNIT( wStruct.getSTOCK_UNIT() );
			struct.setREMARKS(wStruct.getREMARKS());
			struct.setDLV_LOC_CD(wStruct.getDLV_LOC_CD());
			struct.seth_DLV_LOC_CD(wStruct.getDLV_LOC_CD());
			struct.setDLV_LOC_NAME_KANJI(wStruct.getDLV_LOC_NAME_KANJI());
			// �󒍒S����
			struct.setCUST_CHRG_PSN_CD(wStruct.getCUST_CHRG_PSN_CD());
			struct.setCUST_CHRG_PSN_NAME(wStruct.getCUST_CHRG_PSN_NAME());
			// �󒍒S������
			struct.setCUST_CHRG_ORG_CD(wStruct.getCUST_CHRG_ORG_CD());
			struct.setCUST_CHRG_ORG_NAME(wStruct.getCUST_CHRG_ORG_NAME());	
			//���i�P�����擾����

			List wlist = entity.mselectSYS_DATE_CTRL.read(conn,struct);
			if(wlist == null || wlist.size() != 1){
				//�Ɩ����t��񂪖���/������
                //�f�[�^�����݂��Ȃ�
				struct.seth_BUSINESS_OPR_DATE(null);
                ExpjMessage emsg = new ExpjMessage( "KR00017" );
                msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
                sysLog.warning(emsg, getsysUSER_CD()); //�G���[���e
			}else{
				wStruct = (KQ0010020Struct) wlist.get(0);
				struct.seth_BUSINESS_OPR_DATE( wStruct.geth_BUSINESS_OPR_DATE());
			}
			wlist = null;

			wlist = entity.mselectM_UNIT_COST.read(conn, struct);
			if(wlist == null || wlist.size() == 0){
				//�f�[�^�����݂��Ȃ�
				struct.seth_ODR_UNIT_PRICE(null);
				ExpjMessage emsg = new ExpjMessage( "KQ00021" );
				msgStruct.addWarn( emsg ); // �G���[���b�Z�[�W�Ƃ��ēo�^
				sysLog.warning(emsg, getsysUSER_CD()); //�G���[�ڍ�
			} else {
				wStruct = (KQ0010020Struct) wlist.get(0);
				struct.seth_ODR_UNIT_PRICE( wStruct.geth_ODR_UNIT_PRICE() );
			}

			if (struct.getODR_UNIT_PRICE() == null) {
				//��ʒP�����ȗ�����Ă���ꍇ
				if(wlist == null || wlist.size() == 0){
					struct.setODR_UNIT_PRICE("0");
				} else {
					struct.setODR_UNIT_PRICE( wStruct.geth_ODR_UNIT_PRICE() );
				}
			}
			wlist = null;
			
			// �󒍔ԍ��̈�������
			wlist = entity.mselectT_ALLOC_FIXED_ODR_RSLT.read(conn,struct);
			if(wlist == null || wlist.size() == 0){
				struct.seth_ALCTED_UNCONFIRM_ODR_QTY("0");
			}else{
				wStruct = (KQ0010020Struct) wlist.get(0);
				struct.seth_ALCTED_UNCONFIRM_ODR_QTY(wStruct.geth_ALCTED_UNCONFIRM_ODR_QTY());
			}
			
			wlist = null;
			setReadStatus(NORMAL);
			//Mod Anken Start 20140306 lv-h
			List tempList = entity.mselectT_PJ_ODR_ALC.read(conn,struct);
			if(tempList.size() > 0){
				//���o�������O���ȊO�̏ꍇ
				ExpjMessage emsg = new ExpjMessage( "KQ00353" );
				msgStruct.addError( emsg ); // �G���[���b�Z�[�W�Ƃ��ēo�^
				emsg = new ExpjMessage( "ZZ01006","ODR_NO:" + struct.getIN_ODR_NO() );
				sysLog.warning(emsg, getsysUSER_CD()); //�G���[�ڍ�
				setReadStatus(ERROR);
			} 
			//Mod Anken End   20140306 lv-h
		} catch(SQLException e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			throw ee;
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("KQ0010020Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010020Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			//���[�g�ϊ�
			Double w_qty = null;
			exch = new ExchAmount(conn);

			// =======================================
			// �o�^�\���`�F�b�N
			// =======================================
			if(isUpdatable() == false){
				//�o�^�ł��Ȃ����
				return;
			}
			//���Ђ̃R�[�h���Z�b�g
			struct.setCOMPANY_CD(_companyCd);
			// �[�i�ꏊ���̃`�F�b�N
			struct.setDLV_LOC_NAME_KANJI("");
			List custBaseList = entity.mM_CUST_BASE.read(conn, struct);
			if (custBaseList.isEmpty()) {
				setErrorMessage("KQ00015");
				setErrorParameter("M_CUST_BASE", "COMPANY_CD", struct.getCOMPANY_CD());
				setErrorParameter("M_CUST_BASE", "CUST_CD", struct.getCUST_CD());
				setErrorParameter("M_CUST_BASE", "DLV_LOC_CD", struct.getDLV_LOC_CD());
				return;
			} else if (custBaseList.size() > 1) {
				setErrorMessage("KQ00016");
				setErrorParameter("M_CUST_BASE", "COMPANY_CD", struct.getCOMPANY_CD());
				setErrorParameter("M_CUST_BASE", "CUST_CD", struct.getCUST_CD());
				setErrorParameter("M_CUST_BASE", "DLV_LOC_CD", struct.getDLV_LOC_CD());
				return;
			}
			// �[�i�ꏊ���̃f�[�^�Z�b�g
			KQ0010020Struct custBaseStruct = (KQ0010020Struct) custBaseList.get(0);
			struct.setDLV_LOC_NAME_KANJI(custBaseStruct.getDLV_LOC_NAME());
            // �����Ǘ��`�F�b�N
            if ("1".equals(struct.getUNIT_QTY_TYP())) {
                // �����Ǘ�
                if (struct.getODR_QTY().indexOf(".") >= 0) {
                    // �������͂̏ꍇ�F�؏グ
                    String tempString = struct.getODR_QTY();
                    double tempDouble1 = Double.parseDouble(tempString);
                    struct.setODR_QTY(Calculate.ceil(struct.getODR_QTY(), 0));
                    double tempDouble2 = Double.parseDouble(struct.getODR_QTY());
                    if (tempDouble1 != tempDouble2) {
                        // ".0"���͏��O
                        setWarningMessage("KQ20004");
                        setWarningParameter("T_ODR", "ODR_QTY", tempString);
                    }
                }
            }

            /** ���F�˗�����ꍇ�A�y�󒍏��F�˗������z���Ăяo�� */
			if ("1".equals(struct.geth_APR_ODR())) {
				ApprProc.execUpdateProcess(conn, struct, this,"2");
				return;
			}	
			//�󒍋��z�i���l�j
			double qty = new Double(struct.getODR_QTY()).doubleValue();
			double price = new Double(struct.getODR_UNIT_PRICE()).doubleValue();
			w_qty = cnvQty(false,qty * price,struct.getCURRNCY_CD(),struct);
			if(w_qty == null) return;
			struct.setODR_AMOUNT(w_qty);

			//�󒍋��z�i�~�݁j
			w_qty = cnvQty(true,struct.getODR_AMOUNT().doubleValue(),struct.getCURRNCY_CD(),struct);
			if(w_qty == null) return;
			struct.setODR_AMOUNT_EXCH_RATES(w_qty);

			//�����c�Z�o�@�������Z�o
			if( ODR_TYP_NAIJI.equals(struct.geth_ODR_TYP()) ){// �����敪������
				////�󒍐��ʂ����������A�����c�����炷
				double sa = new Double(struct.geth_ODR_QTY()).doubleValue() - new Double(struct.getODR_QTY()).doubleValue();
				double remain = Double.parseDouble(struct.geth_REMAIN_UNCONFIRM_ODR_QTY()) - sa;
				struct.seth_REMAIN_UNCONFIRM_ODR_QTY(Double.toString(remain));						//�����c
				struct.setCANCELED_UNCONFIRM_ODR_QTY(new String("0"));						//������
			}else{
				struct.seth_REMAIN_UNCONFIRM_ODR_QTY(new String("0"));								//�����c
				struct.setCANCELED_UNCONFIRM_ODR_QTY(new String("0"));							//������
			}

            //�����c���z�i���l�j
			if( ODR_TYP_NAIJI.equals(struct.geth_ODR_TYP()) ){
				// �����敪������
				w_qty = cnvQty(false,new Double(struct.geth_REMAIN_UNCONFIRM_ODR_QTY()).doubleValue()
										* new Double(struct.getODR_UNIT_PRICE()).doubleValue(),
										struct.getCURRNCY_CD(),struct);
				if(w_qty == null) return;
				struct.setUNCONFIRM_ODR_BALANCE(w_qty);
			}else{
				struct.setUNCONFIRM_ODR_BALANCE(new Double(0));
			}

			//�o�׌v��c����
			//2003/11/25
			//�ʏ�����F�O
			//�ʏ�m�蒍���Ɨa�������F�o�׌v��c���ʁ|�󒍌���

			//�󒍐��ʂ����������A�o�׌v��c�����炷
			//struct.seth_SHIP_PLAN_REMAIN_QTY(new String("0"));
            double sa = new Double(struct.geth_ODR_QTY()).doubleValue() - new Double(struct.getODR_QTY()).doubleValue();
			//double sa = new Double(struct.getODR_QTY()).doubleValue() - new Double(struct.getODR_QTY()).doubleValue();

          if( (ODR_TYP_NAIJI.equals(struct.geth_ODR_TYP()) && YOTAKU_YOTAKU.equals(struct.getDEPO_TYP())) || ODR_TYP_KAKUTEI.equals(struct.geth_ODR_TYP())){
            struct.seth_SHIP_PLAN_REMAIN_QTY(
              Double.toString(new Double(new Double(struct.geth_SHIP_PLAN_REMAIN_QTY()).doubleValue()
                                         - Double.parseDouble(Double.toString(sa))).doubleValue()));
            if(new Double(struct.geth_SHIP_PLAN_REMAIN_QTY()).doubleValue() < 0){
              // =======================================
              // �o�׌v��c�����ɂȂ邱�Ƃ͂Ȃ��̂ŁA������ʂ�Ƃ��́A�o�O
              // =======================================
              setReadStatus(ERROR);
              ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
              sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
              ExpjException ee = new ExpjException(emsg); // �G�N�Z�v�V�����𐶐�
              throw ee;
            }
          }else{
            //����ȊO�͎󒍐��ʂ���
            struct.seth_SHIP_PLAN_REMAIN_QTY(struct.getODR_QTY());
          }

			//����������
			if(!(struct.getPUCH_ODR_QTY_TOTAL() == null || struct.getPUCH_ODR_QTY_TOTAL().length() == 0)){
				double qtyTotal = new Double(struct.getPUCH_ODR_QTY_TOTAL()).doubleValue() - sa;
				if(qtyTotal < 0) qtyTotal = 0;
				struct.setPUCH_ODR_QTY_TOTAL(Double.toString(qtyTotal));
				if(struct.getIF_CTL_NO() != null){
					//EDI/RN���͂̃}���`���ׂ̏ꍇ�́A����IF�Ǘ��ԍ����L�[��
					//�󒍐��ʂ̕ύX�����𑍒������ʂ��猸�Z����
					int rv = entity.mQtyTotalUpdate.update(conn,struct);
				}
			}

			struct.setSHIP_PLAN_CMPLT_FLG("0");													//�o�׌v�抮��F
			struct.setSTD_DESINATED_RCV_DATE(struct.getDESINATED_DLV_DATE());						//��w��[��
			// �󒍖��ׂ��X�V����
			int rv = entity.mtbl_T_ODR.update(conn,struct);
			if(rv != 1){
				//�X�V�������P���ȊO
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
				ExpjException ee = new ExpjException(emsg); // �G�N�Z�v�V�����𐶐�
				throw ee;
			}

			// =======================================
			// �󒍗���ԍ��̔�
			// =======================================
			List listSeqRSLT_ODR = entity.mgetSEQ_RSLT_ODR.read(conn,struct);
			if(listSeqRSLT_ODR == null || listSeqRSLT_ODR.size() == 0){
				//�󒍗���ԍ��̔ԃG���[
				ExpjMessage emsg = new ExpjMessage( "KQ00035" );
				msgStruct.addError( emsg ); // �G���[���b�Z�[�W�Ƃ��ēo�^
				sysLog.warning("KQ00035", getsysUSER_CD()); //�G���[���e
				return;
			}
			struct.setRSLT_CTL_SEQ_CD(((KQ0010020Struct)listSeqRSLT_ODR.get(0)).getRSLT_CTL_SEQ_CD());
			listSeqRSLT_ODR = null;

			// =======================================
			// �󒍗����̓o�^
			// =======================================
			rv = entity.mtbl_T_ODR_ACPT_RSLT.create(conn,struct);
			if(rv != 1){
				//�X�V�������P���ȊO
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
				ExpjException ee = new ExpjException(emsg); // �G�N�Z�v�V�����𐶐�
				throw ee;
			}

			// =======================================
			// ������ʂ̕���
			// =======================================
			//if(ODR_TYP_NAIJI.equals(st.geth_ODR_TYP()) || ODR_TYP_KAKUTEI.equals(st.geth_ODR_TYP())){	//�����E�m�蒍���̏ꍇ
			if(ODR_TYP_KAKUTEI.equals(struct.geth_ODR_TYP())){	//�m�蒍���̏ꍇ
				double henkousu = new Double(struct.geth_ODR_QTY()).doubleValue() - new Double(struct.getODR_QTY()).doubleValue();
				if (henkousu >=  0) {
					double henkousu2 = new Double(struct.geth_ALCTED_UNCONFIRM_ODR_QTY()).doubleValue() - new Double(struct.getODR_QTY()).doubleValue();
					if(henkousu2 > 0){
						if (kakuteiRollback(M_UPD, struct.geth_ODR_NO(),new Double(struct.geth_ALCTED_UNCONFIRM_ODR_QTY()).doubleValue() - new Double(struct.getODR_QTY()).doubleValue()) == false) {
							conn.rollback();
							return;
						}
					}
				} else {
					if (kattuteiadd(struct.geth_ODR_NO(),henkousu * -1) == false) {
						conn.rollback();
						return;
					}
				}
			}
			// =======================================
			// �Č���
			// =======================================
			conn.commit();

			controlSelect();
			setReadStatus(NORMAL);
			//ExpjMessage emsg = new ExpjMessage( "KQ00308" );
			//msgStruct.addInfo( emsg ); // �G���[���b�Z�[�W�Ƃ��ēo�^
			//sysLog.info(emsg, getsysUSER_CD()); //�G���[�ڍ�

            ////////// ���Ɩ����W�b�N�� //////////

		} catch(ExpjException e) {
			throw e;
		} catch(SQLException e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			throw ee;
		}
                //}}user_implement_dev:<controlUpdate>
		logger.exiting("KQ0010020Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * �폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010020Control"+":USER="+struct.getsUser_ID(),"controlDelete");
			//{{user_implement_dev:<controlDelete>
		/** ���������������������������������������������������������������������� */
		//
		//		�폜�{�^������
		//
		/** ���������������������������������������������������������������������� */
		try{
            exch = new ExchAmount(conn);
            ////////// ���Ɩ����W�b�N�� //////////
			// =======================================
			// �폜�\���`�F�b�N
			// =======================================
			if(isUpdatable() == false){
				//�폜�ł��Ȃ����
				//�G���[����
				return;
			}

            /** ���F�˗�����ꍇ�A�y�󒍏��F�˗������z���Ăяo�� */
			if ("1".equals(struct.geth_APR_ODR())) {
				ApprProc.execUpdateProcess(conn, struct, this,"3");
				return;
			}	
			// =======================================
			// �ύX�O�̒l��ێ�
			// =======================================
			//����������
			if(!(struct.getPUCH_ODR_QTY_TOTAL() == null || struct.getPUCH_ODR_QTY_TOTAL().length() == 0)){
				double qtyTotal = new Double(struct.getPUCH_ODR_QTY_TOTAL()).doubleValue() - new Double(struct.geth_ODR_QTY()).doubleValue();
				if(qtyTotal < 0) qtyTotal = 0;
				struct.setPUCH_ODR_QTY_TOTAL(new Double(qtyTotal).toString());
				if(struct.getIF_CTL_NO() != null){
					//EDI/RN���͂̃}���`���ׂ̏ꍇ�́A����IF�Ǘ��ԍ����L�[��
					//�󒍐��ʂ̕ύX�����𑍒������ʂ��猸�Z����
					int rv = entity.mQtyTotalUpdate.update(conn,struct);
				}
			}

			// =======================================
			// �󒍖��ׂ̘_���폜
			// =======================================
			int rv = entity.mdel_T_ODR.update(conn,struct);
			if(rv != 1)
            {
				//�X�V�������P���ȊO
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage( "ZZ01106");
				sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
				ExpjException ee = new ExpjException(emsg); // �G�N�Z�v�V�����𐶐�
				throw ee;
			}

			// =======================================
			// �󒍗���ԍ��̔�
			// =======================================
			List listSeqRSLT_ODR = entity.mgetSEQ_RSLT_ODR.read(conn,struct);
			if(listSeqRSLT_ODR == null || listSeqRSLT_ODR.size() == 0){
				//�󒍗���ԍ��̔ԃG���[
				ExpjMessage emsg = new ExpjMessage( "KQ00035" );
				msgStruct.addError( emsg ); // �G���[���b�Z�[�W�Ƃ��ēo�^
				sysLog.warning("KQ00035", getsysUSER_CD()); //�G���[���e
				return;
			}
			struct.setRSLT_CTL_SEQ_CD(((KQ0010020Struct)listSeqRSLT_ODR.get(0)).getRSLT_CTL_SEQ_CD());
			listSeqRSLT_ODR = null;

			// =======================================
			// �󒍗����̓o�^
			// =======================================
			rv = entity.mtbl_T_ODR_ACPT_RSLT.create(conn,struct);
			if(rv != 1){
				//�X�V�������P���ȊO
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
				ExpjException ee = new ExpjException(emsg); // �G�N�Z�v�V�����𐶐�
				throw ee;
			}


			// =======================================
			// ������ʂ̕���
			// =======================================

            // =======================================
            // �ڋq���̎擾
            // =======================================
			if(ODR_TYP_KAKUTEI.equals(struct.geth_ODR_TYP())){	//�m�蒍���̏ꍇ
                if(kakuteiRollback(M_DEL,struct.geth_ODR_NO(),new Double(struct.geth_ODR_QTY()).doubleValue()) == false){
					conn.rollback();
					return;
				}
			}
			// =======================================
			// �Č���
			// =======================================
			conn.commit();
			struct.initialize();
			struct.setIN_ODR_NO(null);
			struct.setCUST_ITEM_NAME(null);
			struct.setREMARKS(null);
			setReadStatus(NORMAL);
			//ExpjMessage emsg = new ExpjMessage( "KQ00309" );
			//msgStruct.addInfo( emsg ); // �G���[���b�Z�[�W�Ƃ��ēo�^
			//sysLog.info(emsg, getsysUSER_CD()); //�G���[�ڍ�

            ////////// ���Ɩ����W�b�N�� //////////

		}catch(SQLException e){
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			throw ee;

		} catch(ExpjException e) {
			throw e;

		}catch(Exception e){
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			throw ee;
		}
                //}}user_implement_dev:<controlDelete>
		logger.exiting("KQ0010020Control"+":USER="+struct.getsUser_ID(),"controlDelete");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010020Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
            struct.setSPCL_PRICE_TYP("0");
            struct.setDLV_LOC_NAME_KANJI("");
			list = null;
                //}}user_implement_dev:<controlClear>
		logger.exiting("KQ0010020Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010020Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("KQ0010020Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KQ0010020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>

		try{
			// ���Џ��̎擾
			List myCompanyList = entity.mSYS_MY_COMPANY.read(conn, struct);
			if (myCompanyList.isEmpty()) {
				setErrorMessage("KQ00039");
				throw new ExpjException("KQ00039");
			}
			KQ0010020Struct myCompanyStruct = (KQ0010020Struct) myCompanyList.get(0);
			_companyCd = myCompanyStruct.getCOMPANY_CD();
			// ���t�v�Z�p�̍H��R�[�h�擾
			struct.setCLASS_CODE("PLANT_WEB");
			List plantWebClassCodeList = entity.mSYS_CLASS_CODE.read(conn, struct);
			if (plantWebClassCodeList.isEmpty()) {
				setErrorMessage("KQ00026");
				throw new ExpjException("KQ00026");
			}
			KQ0010020Struct plantWebClassCodeStruct =
				(KQ0010020Struct) plantWebClassCodeList.get(0);
			_plantWeb = plantWebClassCodeStruct.getCODE();

			// �Ɩ��^�p���̎擾
			struct.setPLANT_CD(_plantWeb);
			List dateCtrlList = entity.mSYS_DATE_CTRL.read(conn, struct);
			if (dateCtrlList.isEmpty()) {
				setErrorMessage("KQ00026");
				throw new ExpjException("KQ00026");
			}
			KQ0010020Struct dateCtrlStruct = (KQ0010020Struct) dateCtrlList.get(0);
			_businessOprDate = dateCtrlStruct.getBUSINESS_OPR_DATE();
			
			// �󒍏��F���擾
            privateConfig = new PrivateConfig(conn);
			String aprCompany = privateConfig.getString("APR_ODR");
			// �p�����[�^�u�󒍏��F�v���Z�b�g
			if (aprCompany == null || "".equals(aprCompany)) {
				String locale = CoreTools.getLocale(struct.getsUser_ID());
				ResourceBundle messages = CoreTools.getResourceBundle("ExpjMessage", locale);
				ExpjMessage emsg = new ExpjMessage("AZ00041", messages.getString("AZ00072"));
				msgStruct.addError(emsg); // ���[�j���O���b�Z�[�W�Ƃ��ēo�^
				sysLog.warning(emsg, getsysUSER_CD()); // �G���[���e
				struct.seth_APR_ODR("0");
			} else if (!"1".equals(aprCompany)) {
				// �P�ȊO�̏ꍇ
				struct.seth_APR_ODR("0");
			} else {
				struct.seth_APR_ODR("1");
			}
			_APR_ODR = struct.geth_APR_ODR();
			
			// ��ʑJ�ڂ̌Ăяo����������AStruct�ɉ�ʑJ�ڃL�[��ݒ肵��controlSelect()���Ăяo��
			if (isScreenMove() == true) {
				// �����̃R���g���[�����\�b�h���Ăяo���܂��B
				struct.setIN_ODR_NO(getOdrNo());
				controlSelect();
			}

		} catch(SQLException e) {
			e.printStackTrace();
		}

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KQ0010020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			try{
				ComboBox comboController = new ComboBox(conn, sysUSER_CD);
				ComboStruct SPCL_PRICE_TYP = comboController.getData("ODR_SPCL_PRICE");
				struct.setList_SPCL_PRICE_TYP_val(SPCL_PRICE_TYP.getValList());
				struct.setList_SPCL_PRICE_TYP_name(SPCL_PRICE_TYP.getExplanList());
			} catch(SQLException e) {
				e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			}
			// �V�X�e���p�����[�^
			struct.seth_APR_ODR(_APR_ODR);
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("KQ0010020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Update") ) {
				controlUpdate();
			} else if( button.equals("Delete") ) {
				controlDelete();
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
//			throw new FoundationException("KQ0010020Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KQ0010020-E999","CSV�̏o�͏���"));
			throw new FoundationException("KQ0010020Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KQ0010020-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("KQ0010020Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KQ0010020-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("KQ0010020Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected KQ0010020Entity entity;
	protected KQ0010020Struct struct;
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

		entity = new KQ0010020Entity();
		struct = new KQ0010020Struct();

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
	 * KQ0010020�N���X�̕W���R���X�g���N�^
	 */
	public KQ0010020Control() throws BusinessProcessException, FoundationException
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
				KQ0010020Struct key = (KQ0010020Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("SPCL_PRICE_TYP_name") && key.getSPCL_PRICE_TYP_name() != null) {
					msgKey.setKeyValue("SPCL_PRICE_TYP_name", key.getSPCL_PRICE_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("SPCL_PRICE_TYP_val") && key.getSPCL_PRICE_TYP_val() != null) {
					msgKey.setKeyValue("SPCL_PRICE_TYP_val", key.getSPCL_PRICE_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_QTY") && key.geth_ODR_QTY() != null) {
					msgKey.setKeyValue("h_ODR_QTY", key.geth_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("h_DESINATED_DLV_DATE") && key.geth_DESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("h_DESINATED_DLV_DATE", key.geth_DESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_SPCL_PRICE_TYP") && key.geth_SPCL_PRICE_TYP() != null) {
					msgKey.setKeyValue("h_SPCL_PRICE_TYP", key.geth_SPCL_PRICE_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_CUS_DLV_KEY_CD") && key.geth_CUS_DLV_KEY_CD() != null) {
					msgKey.setKeyValue("h_CUS_DLV_KEY_CD", key.geth_CUS_DLV_KEY_CD());
				}
				if(msgKeyType.containsKeyColumn("h_CUS_DLV_CD") && key.geth_CUS_DLV_CD() != null) {
					msgKey.setKeyValue("h_CUS_DLV_CD", key.geth_CUS_DLV_CD());
				}
				if(msgKeyType.containsKeyColumn("h_DLV_LOC_CD") && key.geth_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("h_DLV_LOC_CD", key.geth_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("APPR_REMARKS") && key.getAPPR_REMARKS() != null) {
					msgKey.setKeyValue("APPR_REMARKS", key.getAPPR_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("h_APR_ODR") && key.geth_APR_ODR() != null) {
					msgKey.setKeyValue("h_APR_ODR", key.geth_APR_ODR());
				}
				if(msgKeyType.containsKeyColumn("ODR_UNIT_PRICE") && key.getODR_UNIT_PRICE() != null) {
					msgKey.setKeyValue("ODR_UNIT_PRICE", key.getODR_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("SPCL_PRICE_TYP") && key.getSPCL_PRICE_TYP() != null) {
					msgKey.setKeyValue("SPCL_PRICE_TYP", key.getSPCL_PRICE_TYP());
				}
				if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE") && key.getDESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("DESINATED_DLV_DATE", key.getDESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("STD_DESINATED_RCV_DATE") && key.getSTD_DESINATED_RCV_DATE() != null) {
					msgKey.setKeyValue("STD_DESINATED_RCV_DATE", key.getSTD_DESINATED_RCV_DATE());
				}
				if(msgKeyType.containsKeyColumn("ODR_QTY") && key.getODR_QTY() != null) {
					msgKey.setKeyValue("ODR_QTY", key.getODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("UNCONFIRM_ODR_BALANCE") && key.getUNCONFIRM_ODR_BALANCE() != null) {
					msgKey.setKeyValue("UNCONFIRM_ODR_BALANCE", key.getUNCONFIRM_ODR_BALANCE().toString());
				}
				if(msgKeyType.containsKeyColumn("ODR_AMOUNT") && key.getODR_AMOUNT() != null) {
					msgKey.setKeyValue("ODR_AMOUNT", key.getODR_AMOUNT().toString());
				}
				if(msgKeyType.containsKeyColumn("ODR_AMOUNT_EXCH_RATES") && key.getODR_AMOUNT_EXCH_RATES() != null) {
					msgKey.setKeyValue("ODR_AMOUNT_EXCH_RATES", key.getODR_AMOUNT_EXCH_RATES().toString());
				}
				if(msgKeyType.containsKeyColumn("CUS_DLV_CD") && key.getCUS_DLV_CD() != null) {
					msgKey.setKeyValue("CUS_DLV_CD", key.getCUS_DLV_CD());
				}
				if(msgKeyType.containsKeyColumn("CUS_DLV_KEY_CD") && key.getCUS_DLV_KEY_CD() != null) {
					msgKey.setKeyValue("CUS_DLV_KEY_CD", key.getCUS_DLV_KEY_CD());
				}
				if(msgKeyType.containsKeyColumn("h_REMAIN_UNCONFIRM_ODR_QTY") && key.geth_REMAIN_UNCONFIRM_ODR_QTY() != null) {
					msgKey.setKeyValue("h_REMAIN_UNCONFIRM_ODR_QTY", key.geth_REMAIN_UNCONFIRM_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("CANCELED_UNCONFIRM_ODR_QTY") && key.getCANCELED_UNCONFIRM_ODR_QTY() != null) {
					msgKey.setKeyValue("CANCELED_UNCONFIRM_ODR_QTY", key.getCANCELED_UNCONFIRM_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("h_SHIP_PLAN_REMAIN_QTY") && key.geth_SHIP_PLAN_REMAIN_QTY() != null) {
					msgKey.setKeyValue("h_SHIP_PLAN_REMAIN_QTY", key.geth_SHIP_PLAN_REMAIN_QTY());
				}
				if(msgKeyType.containsKeyColumn("SHIP_PLAN_CMPLT_FLG") && key.getSHIP_PLAN_CMPLT_FLG() != null) {
					msgKey.setKeyValue("SHIP_PLAN_CMPLT_FLG", key.getSHIP_PLAN_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_QTY_TOTAL") && key.getPUCH_ODR_QTY_TOTAL() != null) {
					msgKey.setKeyValue("PUCH_ODR_QTY_TOTAL", key.getPUCH_ODR_QTY_TOTAL());
				}
				if(msgKeyType.containsKeyColumn("REMARKS") && key.getREMARKS() != null) {
					msgKey.setKeyValue("REMARKS", key.getREMARKS());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_CD") && key.getDLV_LOC_CD() != null) {
					msgKey.setKeyValue("DLV_LOC_CD", key.getDLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_NAME_KANJI") && key.getDLV_LOC_NAME_KANJI() != null) {
					msgKey.setKeyValue("DLV_LOC_NAME_KANJI", key.getDLV_LOC_NAME_KANJI());
				}
				if(msgKeyType.containsKeyColumn("CUST_ODR_NO") && key.getCUST_ODR_NO() != null) {
					msgKey.setKeyValue("CUST_ODR_NO", key.getCUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_NO") && key.geth_ODR_NO() != null) {
					msgKey.setKeyValue("h_ODR_NO", key.geth_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("RSLT_CTL_SEQ_CD") && key.getRSLT_CTL_SEQ_CD() != null) {
					msgKey.setKeyValue("RSLT_CTL_SEQ_CD", key.getRSLT_CTL_SEQ_CD());
				}
				if(msgKeyType.containsKeyColumn("ODR_CTL_NO") && key.getODR_CTL_NO() != null) {
					msgKey.setKeyValue("ODR_CTL_NO", key.getODR_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_TYP") && key.geth_ODR_TYP() != null) {
					msgKey.setKeyValue("h_ODR_TYP", key.geth_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_CD") && key.getCUST_ITEM_CD() != null) {
					msgKey.setKeyValue("CUST_ITEM_CD", key.getCUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("UNIT_CD") && key.getUNIT_CD() != null) {
					msgKey.setKeyValue("UNIT_CD", key.getUNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("CURRNCY_CD") && key.getCURRNCY_CD() != null) {
					msgKey.setKeyValue("CURRNCY_CD", key.getCURRNCY_CD());
				}
				if(msgKeyType.containsKeyColumn("DEPO_TYP") && key.getDEPO_TYP() != null) {
					msgKey.setKeyValue("DEPO_TYP", key.getDEPO_TYP());
				}
				if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_CD") && key.getCUST_CHRG_PSN_CD() != null) {
					msgKey.setKeyValue("CUST_CHRG_PSN_CD", key.getCUST_CHRG_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("ODR_ACPT_PSN_CD") && key.getODR_ACPT_PSN_CD() != null) {
					msgKey.setKeyValue("ODR_ACPT_PSN_CD", key.getODR_ACPT_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("ODR_ACPT_DATE") && key.getODR_ACPT_DATE() != null) {
					msgKey.setKeyValue("ODR_ACPT_DATE", key.getODR_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("fkgnALCTED_UNCONFIRM_ODR_NO") && key.getfkgnALCTED_UNCONFIRM_ODR_NO() != null) {
					msgKey.setKeyValue("fkgnALCTED_UNCONFIRM_ODR_NO", key.getfkgnALCTED_UNCONFIRM_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("fkgnALCTED_UNCONFIRM_ODR_QTY") && key.getfkgnALCTED_UNCONFIRM_ODR_QTY() != null) {
					msgKey.setKeyValue("fkgnALCTED_UNCONFIRM_ODR_QTY", key.getfkgnALCTED_UNCONFIRM_ODR_QTY().toString());
				}
				if(msgKeyType.containsKeyColumn("fkgnALCTED_SEQ_CD") && key.getfkgnALCTED_SEQ_CD() != null) {
					msgKey.setKeyValue("fkgnALCTED_SEQ_CD", key.getfkgnALCTED_SEQ_CD());
				}
				if(msgKeyType.containsKeyColumn("fkgnREMAIN_UNCONFIRM_ODR_QTY") && key.getfkgnREMAIN_UNCONFIRM_ODR_QTY() != null) {
					msgKey.setKeyValue("fkgnREMAIN_UNCONFIRM_ODR_QTY", key.getfkgnREMAIN_UNCONFIRM_ODR_QTY().toString());
				}
				if(msgKeyType.containsKeyColumn("fkgnODR_UNIT_PRICE") && key.getfkgnODR_UNIT_PRICE() != null) {
					msgKey.setKeyValue("fkgnODR_UNIT_PRICE", key.getfkgnODR_UNIT_PRICE().toString());
				}
				if(msgKeyType.containsKeyColumn("fkgnCURRNCY_CD") && key.getfkgnCURRNCY_CD() != null) {
					msgKey.setKeyValue("fkgnCURRNCY_CD", key.getfkgnCURRNCY_CD());
				}
				if(msgKeyType.containsKeyColumn("fkgnODR_QTY") && key.getfkgnODR_QTY() != null) {
					msgKey.setKeyValue("fkgnODR_QTY", key.getfkgnODR_QTY().toString());
				}
				if(msgKeyType.containsKeyColumn("fkgnODR_TYP") && key.getfkgnODR_TYP() != null) {
					msgKey.setKeyValue("fkgnODR_TYP", key.getfkgnODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("fkgnFIXED_ODR_NO") && key.getfkgnFIXED_ODR_NO() != null) {
					msgKey.setKeyValue("fkgnFIXED_ODR_NO", key.getfkgnFIXED_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("fkgnDEL_FLG") && key.getfkgnDEL_FLG() != null) {
					msgKey.setKeyValue("fkgnDEL_FLG", key.getfkgnDEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("fkgnUNCONFIRM_ODR_BALANCE") && key.getfkgnUNCONFIRM_ODR_BALANCE() != null) {
					msgKey.setKeyValue("fkgnUNCONFIRM_ODR_BALANCE", key.getfkgnUNCONFIRM_ODR_BALANCE().toString());
				}
				if(msgKeyType.containsKeyColumn("fkgnODR_NO") && key.getfkgnODR_NO() != null) {
					msgKey.setKeyValue("fkgnODR_NO", key.getfkgnODR_NO());
				}
				if(msgKeyType.containsKeyColumn("IF_CTL_NO") && key.getIF_CTL_NO() != null) {
					msgKey.setKeyValue("IF_CTL_NO", key.getIF_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("UNIT_NAME") && key.getUNIT_NAME() != null) {
					msgKey.setKeyValue("UNIT_NAME", key.getUNIT_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("CUST_ANAME") && key.getCUST_ANAME() != null) {
					msgKey.setKeyValue("CUST_ANAME", key.getCUST_ANAME());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP") && key.getEXCH_TYP() != null) {
					msgKey.setKeyValue("EXCH_TYP", key.getEXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("DETAIL_ROUND_TYP") && key.getDETAIL_ROUND_TYP() != null) {
					msgKey.setKeyValue("DETAIL_ROUND_TYP", key.getDETAIL_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_NAME") && key.getCUST_ITEM_NAME() != null) {
					msgKey.setKeyValue("CUST_ITEM_NAME", key.getCUST_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("ODR_TYP") && key.getODR_TYP() != null) {
					msgKey.setKeyValue("ODR_TYP", key.getODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_NAME") && key.getCUST_CHRG_PSN_NAME() != null) {
					msgKey.setKeyValue("CUST_CHRG_PSN_NAME", key.getCUST_CHRG_PSN_NAME());
				}
				if(msgKeyType.containsKeyColumn("CUST_CHRG_ORG_CD") && key.getCUST_CHRG_ORG_CD() != null) {
					msgKey.setKeyValue("CUST_CHRG_ORG_CD", key.getCUST_CHRG_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CHRG_ORG_NAME") && key.getCUST_CHRG_ORG_NAME() != null) {
					msgKey.setKeyValue("CUST_CHRG_ORG_NAME", key.getCUST_CHRG_ORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT") && key.geth_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_MODIFY_COUNT", key.geth_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("h_ANS_DLV_DATE_EXIST_FLG") && key.geth_ANS_DLV_DATE_EXIST_FLG() != null) {
					msgKey.setKeyValue("h_ANS_DLV_DATE_EXIST_FLG", key.geth_ANS_DLV_DATE_EXIST_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_T_SHIP_ODR_EXIST_FLG") && key.geth_T_SHIP_ODR_EXIST_FLG() != null) {
					msgKey.setKeyValue("h_T_SHIP_ODR_EXIST_FLG", key.geth_T_SHIP_ODR_EXIST_FLG());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("PKG_UNIT") && key.getPKG_UNIT() != null) {
					msgKey.setKeyValue("PKG_UNIT", key.getPKG_UNIT());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_UNIT_PRICE") && key.geth_ODR_UNIT_PRICE() != null) {
					msgKey.setKeyValue("h_ODR_UNIT_PRICE", key.geth_ODR_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_DATE") && key.geth_BUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("h_BUSINESS_OPR_DATE", key.geth_BUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_NAME") && key.getDLV_LOC_NAME() != null) {
					msgKey.setKeyValue("DLV_LOC_NAME", key.getDLV_LOC_NAME());
				}
				if(msgKeyType.containsKeyColumn("ODR_NO") && key.getODR_NO() != null) {
					msgKey.setKeyValue("ODR_NO", key.getODR_NO());
				}
				if(msgKeyType.containsKeyColumn("REMAIN_UNCONFIRM_ODR_QTY") && key.getREMAIN_UNCONFIRM_ODR_QTY() != null) {
					msgKey.setKeyValue("REMAIN_UNCONFIRM_ODR_QTY", key.getREMAIN_UNCONFIRM_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("CODE") && key.getCODE() != null) {
					msgKey.setKeyValue("CODE", key.getCODE());
				}
				if(msgKeyType.containsKeyColumn("CLASS_CODE") && key.getCLASS_CODE() != null) {
					msgKey.setKeyValue("CLASS_CODE", key.getCLASS_CODE());
				}
				if(msgKeyType.containsKeyColumn("MAX_ALCTED_SEQ_CD") && key.getMAX_ALCTED_SEQ_CD() != null) {
					msgKey.setKeyValue("MAX_ALCTED_SEQ_CD", key.getMAX_ALCTED_SEQ_CD().toString());
				}
				if(msgKeyType.containsKeyColumn("MAX_ODR_NO") && key.getMAX_ODR_NO() != null) {
					msgKey.setKeyValue("MAX_ODR_NO", key.getMAX_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("h_ALCTED_UNCONFIRM_ODR_QTY") && key.geth_ALCTED_UNCONFIRM_ODR_QTY() != null) {
					msgKey.setKeyValue("h_ALCTED_UNCONFIRM_ODR_QTY", key.geth_ALCTED_UNCONFIRM_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("IN_ODR_NO") && key.getIN_ODR_NO() != null) {
					msgKey.setKeyValue("IN_ODR_NO", key.getIN_ODR_NO());
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
					KQ0010020Struct key = new KQ0010020Struct();
					if(msgKeyType.containsKeyColumn("SPCL_PRICE_TYP_name")) {
						key.setSPCL_PRICE_TYP_name(msgKey.getKeyValue("SPCL_PRICE_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("SPCL_PRICE_TYP_val")) {
						key.setSPCL_PRICE_TYP_val(msgKey.getKeyValue("SPCL_PRICE_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_QTY")) {
						key.seth_ODR_QTY(msgKey.getKeyValue("h_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("h_DESINATED_DLV_DATE")) {
						key.seth_DESINATED_DLV_DATE(msgKey.getKeyValue("h_DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_SPCL_PRICE_TYP")) {
						key.seth_SPCL_PRICE_TYP(msgKey.getKeyValue("h_SPCL_PRICE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_CUS_DLV_KEY_CD")) {
						key.seth_CUS_DLV_KEY_CD(msgKey.getKeyValue("h_CUS_DLV_KEY_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_CUS_DLV_CD")) {
						key.seth_CUS_DLV_CD(msgKey.getKeyValue("h_CUS_DLV_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_DLV_LOC_CD")) {
						key.seth_DLV_LOC_CD(msgKey.getKeyValue("h_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("APPR_REMARKS")) {
						key.setAPPR_REMARKS(msgKey.getKeyValue("APPR_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("h_APR_ODR")) {
						key.seth_APR_ODR(msgKey.getKeyValue("h_APR_ODR"));
					}
					if(msgKeyType.containsKeyColumn("ODR_UNIT_PRICE")) {
						key.setODR_UNIT_PRICE(msgKey.getKeyValue("ODR_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("SPCL_PRICE_TYP")) {
						key.setSPCL_PRICE_TYP(msgKey.getKeyValue("SPCL_PRICE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE")) {
						key.setDESINATED_DLV_DATE(msgKey.getKeyValue("DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("STD_DESINATED_RCV_DATE")) {
						key.setSTD_DESINATED_RCV_DATE(msgKey.getKeyValue("STD_DESINATED_RCV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_QTY")) {
						key.setODR_QTY(msgKey.getKeyValue("ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("UNCONFIRM_ODR_BALANCE")) {
						key.setUNCONFIRM_ODR_BALANCE(new Double(msgKey.getKeyValue("UNCONFIRM_ODR_BALANCE")));
					}
					if(msgKeyType.containsKeyColumn("ODR_AMOUNT")) {
						key.setODR_AMOUNT(new Double(msgKey.getKeyValue("ODR_AMOUNT")));
					}
					if(msgKeyType.containsKeyColumn("ODR_AMOUNT_EXCH_RATES")) {
						key.setODR_AMOUNT_EXCH_RATES(new Double(msgKey.getKeyValue("ODR_AMOUNT_EXCH_RATES")));
					}
					if(msgKeyType.containsKeyColumn("CUS_DLV_CD")) {
						key.setCUS_DLV_CD(msgKey.getKeyValue("CUS_DLV_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUS_DLV_KEY_CD")) {
						key.setCUS_DLV_KEY_CD(msgKey.getKeyValue("CUS_DLV_KEY_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_REMAIN_UNCONFIRM_ODR_QTY")) {
						key.seth_REMAIN_UNCONFIRM_ODR_QTY(msgKey.getKeyValue("h_REMAIN_UNCONFIRM_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("CANCELED_UNCONFIRM_ODR_QTY")) {
						key.setCANCELED_UNCONFIRM_ODR_QTY(msgKey.getKeyValue("CANCELED_UNCONFIRM_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("h_SHIP_PLAN_REMAIN_QTY")) {
						key.seth_SHIP_PLAN_REMAIN_QTY(msgKey.getKeyValue("h_SHIP_PLAN_REMAIN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_PLAN_CMPLT_FLG")) {
						key.setSHIP_PLAN_CMPLT_FLG(msgKey.getKeyValue("SHIP_PLAN_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_QTY_TOTAL")) {
						key.setPUCH_ODR_QTY_TOTAL(msgKey.getKeyValue("PUCH_ODR_QTY_TOTAL"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS")) {
						key.setREMARKS(msgKey.getKeyValue("REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_CD")) {
						key.setDLV_LOC_CD(msgKey.getKeyValue("DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_NAME_KANJI")) {
						key.setDLV_LOC_NAME_KANJI(msgKey.getKeyValue("DLV_LOC_NAME_KANJI"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ODR_NO")) {
						key.setCUST_ODR_NO(msgKey.getKeyValue("CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_NO")) {
						key.seth_ODR_NO(msgKey.getKeyValue("h_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("RSLT_CTL_SEQ_CD")) {
						key.setRSLT_CTL_SEQ_CD(msgKey.getKeyValue("RSLT_CTL_SEQ_CD"));
					}
					if(msgKeyType.containsKeyColumn("ODR_CTL_NO")) {
						key.setODR_CTL_NO(msgKey.getKeyValue("ODR_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_TYP")) {
						key.seth_ODR_TYP(msgKey.getKeyValue("h_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_CD")) {
						key.setCUST_ITEM_CD(msgKey.getKeyValue("CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_CD")) {
						key.setUNIT_CD(msgKey.getKeyValue("UNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("CURRNCY_CD")) {
						key.setCURRNCY_CD(msgKey.getKeyValue("CURRNCY_CD"));
					}
					if(msgKeyType.containsKeyColumn("DEPO_TYP")) {
						key.setDEPO_TYP(msgKey.getKeyValue("DEPO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_CD")) {
						key.setCUST_CHRG_PSN_CD(msgKey.getKeyValue("CUST_CHRG_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("ODR_ACPT_PSN_CD")) {
						key.setODR_ACPT_PSN_CD(msgKey.getKeyValue("ODR_ACPT_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("ODR_ACPT_DATE")) {
						key.setODR_ACPT_DATE(msgKey.getKeyValue("ODR_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("fkgnALCTED_UNCONFIRM_ODR_NO")) {
						key.setfkgnALCTED_UNCONFIRM_ODR_NO(msgKey.getKeyValue("fkgnALCTED_UNCONFIRM_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("fkgnALCTED_UNCONFIRM_ODR_QTY")) {
						key.setfkgnALCTED_UNCONFIRM_ODR_QTY(new Double(msgKey.getKeyValue("fkgnALCTED_UNCONFIRM_ODR_QTY")));
					}
					if(msgKeyType.containsKeyColumn("fkgnALCTED_SEQ_CD")) {
						key.setfkgnALCTED_SEQ_CD(msgKey.getKeyValue("fkgnALCTED_SEQ_CD"));
					}
					if(msgKeyType.containsKeyColumn("fkgnREMAIN_UNCONFIRM_ODR_QTY")) {
						key.setfkgnREMAIN_UNCONFIRM_ODR_QTY(new Double(msgKey.getKeyValue("fkgnREMAIN_UNCONFIRM_ODR_QTY")));
					}
					if(msgKeyType.containsKeyColumn("fkgnODR_UNIT_PRICE")) {
						key.setfkgnODR_UNIT_PRICE(new Double(msgKey.getKeyValue("fkgnODR_UNIT_PRICE")));
					}
					if(msgKeyType.containsKeyColumn("fkgnCURRNCY_CD")) {
						key.setfkgnCURRNCY_CD(msgKey.getKeyValue("fkgnCURRNCY_CD"));
					}
					if(msgKeyType.containsKeyColumn("fkgnODR_QTY")) {
						key.setfkgnODR_QTY(new Double(msgKey.getKeyValue("fkgnODR_QTY")));
					}
					if(msgKeyType.containsKeyColumn("fkgnODR_TYP")) {
						key.setfkgnODR_TYP(msgKey.getKeyValue("fkgnODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("fkgnFIXED_ODR_NO")) {
						key.setfkgnFIXED_ODR_NO(msgKey.getKeyValue("fkgnFIXED_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("fkgnDEL_FLG")) {
						key.setfkgnDEL_FLG(msgKey.getKeyValue("fkgnDEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("fkgnUNCONFIRM_ODR_BALANCE")) {
						key.setfkgnUNCONFIRM_ODR_BALANCE(new Double(msgKey.getKeyValue("fkgnUNCONFIRM_ODR_BALANCE")));
					}
					if(msgKeyType.containsKeyColumn("fkgnODR_NO")) {
						key.setfkgnODR_NO(msgKey.getKeyValue("fkgnODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("IF_CTL_NO")) {
						key.setIF_CTL_NO(msgKey.getKeyValue("IF_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_NAME")) {
						key.setUNIT_NAME(msgKey.getKeyValue("UNIT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ANAME")) {
						key.setCUST_ANAME(msgKey.getKeyValue("CUST_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP")) {
						key.setEXCH_TYP(msgKey.getKeyValue("EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DETAIL_ROUND_TYP")) {
						key.setDETAIL_ROUND_TYP(msgKey.getKeyValue("DETAIL_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_NAME")) {
						key.setCUST_ITEM_NAME(msgKey.getKeyValue("CUST_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ODR_TYP")) {
						key.setODR_TYP(msgKey.getKeyValue("ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_NAME")) {
						key.setCUST_CHRG_PSN_NAME(msgKey.getKeyValue("CUST_CHRG_PSN_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CHRG_ORG_CD")) {
						key.setCUST_CHRG_ORG_CD(msgKey.getKeyValue("CUST_CHRG_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CHRG_ORG_NAME")) {
						key.setCUST_CHRG_ORG_NAME(msgKey.getKeyValue("CUST_CHRG_ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT")) {
						key.seth_MODIFY_COUNT(msgKey.getKeyValue("h_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("h_ANS_DLV_DATE_EXIST_FLG")) {
						key.seth_ANS_DLV_DATE_EXIST_FLG(msgKey.getKeyValue("h_ANS_DLV_DATE_EXIST_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_T_SHIP_ODR_EXIST_FLG")) {
						key.seth_T_SHIP_ODR_EXIST_FLG(msgKey.getKeyValue("h_T_SHIP_ODR_EXIST_FLG"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("PKG_UNIT")) {
						key.setPKG_UNIT(msgKey.getKeyValue("PKG_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_UNIT_PRICE")) {
						key.seth_ODR_UNIT_PRICE(msgKey.getKeyValue("h_ODR_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_DATE")) {
						key.seth_BUSINESS_OPR_DATE(msgKey.getKeyValue("h_BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_NAME")) {
						key.setDLV_LOC_NAME(msgKey.getKeyValue("DLV_LOC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ODR_NO")) {
						key.setODR_NO(msgKey.getKeyValue("ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("REMAIN_UNCONFIRM_ODR_QTY")) {
						key.setREMAIN_UNCONFIRM_ODR_QTY(msgKey.getKeyValue("REMAIN_UNCONFIRM_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("CODE")) {
						key.setCODE(msgKey.getKeyValue("CODE"));
					}
					if(msgKeyType.containsKeyColumn("CLASS_CODE")) {
						key.setCLASS_CODE(msgKey.getKeyValue("CLASS_CODE"));
					}
					if(msgKeyType.containsKeyColumn("MAX_ALCTED_SEQ_CD")) {
						key.setMAX_ALCTED_SEQ_CD(new Double(msgKey.getKeyValue("MAX_ALCTED_SEQ_CD")));
					}
					if(msgKeyType.containsKeyColumn("MAX_ODR_NO")) {
						key.setMAX_ODR_NO(msgKey.getKeyValue("MAX_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_ALCTED_UNCONFIRM_ODR_QTY")) {
						key.seth_ALCTED_UNCONFIRM_ODR_QTY(msgKey.getKeyValue("h_ALCTED_UNCONFIRM_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("IN_ODR_NO")) {
						key.setIN_ODR_NO(msgKey.getKeyValue("IN_ODR_NO"));
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
