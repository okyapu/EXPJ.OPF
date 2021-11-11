/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0030/src/com/nec/jp/orteus/metamorBase/AD0030/AD0030020Control.java,v $
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

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;

import com.nec.jp.orteus.expj.flash.Kind;

import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common04.amount.CurStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.CurControl;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxControl;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateControl;
import com.nec.jp.orteus.metamorBase.common04.amount.AmountCalculator;
import com.nec.jp.orteus.metamorBase.common04.amount.SbcntUnitCostStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.SbcntUnitCostControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurStruct;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.TaxNameControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.TaxNameStruct;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;

import com.nec.jp.orteus.expj.util.*;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AD0030020Control
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
	public AD0030020Struct getListvalue(int x) { return (AD0030020Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AD0030020Struct getStruct() { return this.struct; }	// Struct��Ԃ��܂��B
	public AD0030020Struct createStruct() { return new AD0030020Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AD0030020Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

//--------------------------------------------------------------------

	// �P���ǂݍ��݂̍ۂ̒l�̃Z�b�g�p
	/** �s�ǉ��{�^�����������ꂽ����\���萔 */
	public static final int FUNC_INS = 0;	
	/** �s�C���{�^�����������ꂽ����\���萔 */
	public static final int FUNC_UPD = 1;
	/** �s���ʃ{�^�����������ꂽ����\���萔 */
	public static final int FUNC_CPY = 2;


	/** [�R���{�{�b�N�X�f�[�^]���i���O��敪�j */
	private ComboStruct _outsideTypStruct = new ComboStruct();
	/** [�R���{�{�b�N�X�f�[�^]���i�P���敪�j */
	private ComboStruct _unitCostTypStruct = new ComboStruct();
	/** [�R���{�{�b�N�X�f�[�^]���i��������敪�j */
	private ComboStruct _acptInspcTypStruct = new ComboStruct();

	/** �V�X�e�����O���b�Z�[�W�쐬�p */
	private StringBuffer _sysLogMessage = null;

	/** �ꗗ�\�̍ő�\�������I�[�o�[���̂d�q�q�\���t���O */
	private int _screenMoveFlg = 0;	

	/** �M�ݏ��f�[�^�N���X */
	private HomeCurStruct _sysHomeCurStruct = new HomeCurStruct();
	/** �Ŗ����f�[�^�N���X */
	private TaxNameStruct _taxNameStruct = new TaxNameStruct();

	/** ��ЃR�[�h */
	private String _myCompanyCd = "";


	/** ���n�� */
	private int _firstProcNo ;
	/** ���n��i�X�V��j */
	private int _firstProcNo_new ;
	/** �ŏI�n�� */
	private int _lastProcNo ;
	/** �ŏI�n��i�X�V��j */
	private int _lastProcNo_new ;

	/** �X�V�㏉�n��̎d�|��ƃR�[�h��ݒ� */
	private String _firstWorkInProcCd_new = "" ;
	/** �X�V��ŏI�n��̎d�|��ƃR�[�h��ݒ� */
	private String _lastWorkInProcCd_new = "" ;
	/** �X�V�㒅�����ݒ� */
	private String _firstStartDate_new = "" ;
	/** �X�V�㒅���(����)��ݒ� */
	private String _firstStartDateTime_new = "" ;
	/** �X�V��ŏI�n��̔[����ݒ� */
	private String _lastDlvDate_new = "" ;	
	/** �X�V��ŏI�n��̔[��(����)��ݒ� */
	private String _lastDlvDateTime_new = "" ;
	/** �X�V��ŏI�n��̍�Ǝw������ݒ� */
	private String _lastOprInstQty_new = "";

	/** �o�^�O���_���n��̎d�|��ƃR�[�h��ݒ� */
	private String _firstWorkInProcCd = "" ;
	/** �X�V�O�ŏI�n��̎d�|��ƃR�[�h��ݒ� */
	private String _lastWorkInProcCd = "" ;
	/** �X�V�O�ŏI�n��̔[����ݒ� */
	private String _lastDlvDate = "" ;
	/** �X�V�O�ŏI�n��̔[��(����)��ݒ� */
	private String _lastDlvDateTime = "" ;

	/** �X�V�O�̓��O��敪�Z�[�u�p */
	private String _outsideTypBefore = "";

	/** �T�u��ʂ̓��͍��ڑޔ�pStruct */
	private AD0030020Struct formStruct = new AD0030020Struct();	

	/**
	 * �i�ڕʎd�|�̍X�V���s�������ۂ��𔻒f����X�e�[�^�X��ێ�����B<br>
	 * ���P�ƍH���Œ�����Ɣ[���������ɕύX���ꂽ�ꍇ�A<br>
	 * �Q�x�X�V�����׍X�V�����V�X�e�����ڂ̍X�V�𐧌䂷��B<br>
	 * 0:�i�ڕʎd�|���X�V 1:�i�ڕʎd�|�X�V�ς�<br>
	 */
	private int _procByItemUpdateStatus = 0;
	/**
	 * �폜���A��ƌn��ʎd�|�����ׂč폜���ꂽ�ꍇ�̃X�e�[�^�X��ێ�����B<br>
	 * ���i�ڕʎd�|.��ƓW�J�ς݃t���O���n�e�e�ɂ��邽�߁A�Y���f�[�^��������ԂƂȂ�B<br>
	 * 0:�폜���̃��b�Z�[�W���� 1:�폜���̃��b�Z�[�W�L��
	 */
	private int _deleteMessageStatus = 0;

	/** ���݂ǂ̏������s�����̂���ێ����� */
	private int screenStatus = -1;
	/** 
	 * ���݂ǂ̏������s�����̂����擾����
	 * @return �������[�h��\���萔
	 */
	public int getScreenStatus() {
		return this.screenStatus;
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
	public void setStandardItem(AD0030020Struct target){

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
	public void clearList() {
		if (this.list != null) {
			this.list.clear();
		}
	}

	/**
	 * Struct�̒l���N���A���܂��B
	 */
	public void clearStruct() {
		
		//key(WORK_ODR_CD)�ȊO�̉�ʍ��ڂ��N���A����B
		struct.setITEM_CD(null);
		struct.setWORK_ODR_DLV_DATE_BY_ITEM(null);
		struct.setOPR_INST_START_DATE_BY_ITEM(null);
		struct.setPLANT_CD(null);
		struct.setWORK_STS_TYP(null);
		struct.seth_WORK_STS_TYP(null);
		struct.setPROC_EXPLOSION_FLG(null);
		struct.seth_MODIFY_COUNT_BY_ITEM(null);
		struct.setITEM_NAME(null);
		struct.setDRAW_CD(null);
		struct.setSPEC(null);
		struct.setMRP_ODR_TYP(null);
		struct.setJOB_ODR_CD(null);
		struct.seth_JOB_ODR_CD(null);
		struct.seth_JOB_ODR_CANCEL_NO(null);
		struct.setMRP_ODR_TYP_DN(null);
		struct.setITEM_NAME(null);
		struct.seth_UNIT_QTY_TYP(null);
		struct.setSTOCK_UNIT(null);
		struct.seth_ODR_START_DATE(null);
		struct.setWORK_IN_PROC_CD(null);
		struct.setPROC_NAME(null);
		struct.setPROC_NO(null);
		struct.setWORK_ODR_DLV_DATE_BY_PROC(null);
		struct.setOPR_INST_START_DATE_BY_PROC(null);
		struct.setOPR_INST_QTY(null);
		struct.setOUTSIDE_TYP(null);
		struct.setWS_CD(null);
		struct.setWS_NAME(null);
		struct.setVEND_CD(null);
		struct.setVEND_ANAME(null);
		struct.setACPT_INSPC_TYP(null);
		struct.setCUR_CD(null);
		struct.setCUR_NAME(null);
		struct.setUNIT_COST_TYP(null);
		struct.setUNIT_COST(null);
		struct.setVEND_CUR_UNIT(null);
		struct.setPROCESSING_COST(null);
		struct.setMATERIAL_COST(null);
		struct.setOTHER_OVERHEADS(null);
		struct.setPUCH_ODR_AMOUNT(null);
		struct.setDISC_AMOUNT(null);
		struct.setAFTER_DISC_AMOUNT(null);
		struct.setTAX_AMOUNT_1(null);
		struct.setTAX_AMOUNT_2(null);
		struct.setTAX_AMOUNT_3(null);
		struct.setAMOUNT_INCLUDE_TAX(null);
		struct.setPROVISIONAL_HOME_CUR_AMOUNT(null);
		struct.setEXCH_RATE(null);
		struct.setWORK_IN_PROC_COMMENT(null);
		struct.setOPR_INST_CD(null);
		struct.setTAX_NAME_1(null);
		struct.setTAX_NAME_2(null);
		struct.setTAX_NAME_3(null);
		struct.seth_BUSINESS_OPR_DATE(null);
		struct.seth_OD_NO(null);
		struct.setWORK_ODR_DLV_DATE_BY_PROC_TIME(null);
		struct.setOPR_INST_START_DATE_BY_PROC_TIME(null);
		struct.setTIME_CTRL(_flgTimeCtrl);
		struct.setWORK_ODR_DLV_DATE_BY_ITEM_TIME(null);
		struct.setOPR_INST_START_DATE_BY_ITEM_TIME(null);

// ���� 2008/08/28 ADD START -TSUCHIDA����
		struct.seth_MANHOUR_TYP(null);
// ���� 2008/08/28 ADD START -TSUCHIDA����

	}

	/**
	 * �T�u��ʍ��ڂ̏����l���Z�b�g����
	 */
	public void formInitialize() {

		formStruct.setWORK_IN_PROC_CD(null);
		formStruct.setPROC_NAME(null);
		formStruct.setPROC_NO("0");
		formStruct.setWORK_ODR_DLV_DATE_BY_PROC(null);	
		formStruct.setWORK_ODR_DLV_DATE_BY_PROC_TIME(null);
		formStruct.setOPR_INST_START_DATE_BY_PROC(null);
		formStruct.setOPR_INST_START_DATE_BY_PROC_TIME(null);
		formStruct.seth_WORK_ODR_DLV_DATE_BY_PROC(null);
		formStruct.seth_WORK_ODR_DLV_DATE_BY_PROC_TIME(null);
		formStruct.seth_OPR_INST_START_DATE_BY_PROC(null);
		formStruct.seth_OPR_INST_START_DATE_BY_PROC_TIME(null);
		formStruct.setOPR_INST_QTY("0.0");
		formStruct.seth_OPR_INST_QTY("0.0");
		formStruct.setOUTSIDE_TYP("1");
		formStruct.setWS_CD(null);
		formStruct.setWS_NAME(null);
		formStruct.setVEND_CD(null);
		formStruct.setVEND_ANAME(null);
		formStruct.setACPT_INSPC_TYP("1");
		formStruct.setCUR_CD(null);
		formStruct.setCUR_NAME(null);
		formStruct.setUNIT_COST_TYP("1");
		formStruct.setUNIT_COST("0.00");
		formStruct.setVEND_CUR_UNIT(null);
		formStruct.setPROCESSING_COST("0.00");
		formStruct.setMATERIAL_COST("0.00");
		formStruct.setOTHER_OVERHEADS("0.00");
		formStruct.setPUCH_ODR_AMOUNT("0.00");
		formStruct.setDISC_AMOUNT("0.00");
		formStruct.setAFTER_DISC_AMOUNT("0.00");
		formStruct.setTAX_AMOUNT_1("0.00");
		formStruct.setTAX_AMOUNT_2("0.00");
		formStruct.setTAX_AMOUNT_3("0.00");
		formStruct.setAMOUNT_INCLUDE_TAX("0.00");
		formStruct.setPROVISIONAL_HOME_CUR_AMOUNT("0.00");
		formStruct.setEXCH_RATE("0.00");
		formStruct.setWORK_IN_PROC_COMMENT(null);
		formStruct.setROUND_TYP(Kind.FLOOR);
		formStruct.setHOME_CUR_UNIT(null);
		formStruct.setEXCH_RATE("0.00");
		formStruct.seth_VEND_DECIMAL_FIG("4");
		formStruct.seth_TAX_RATE_1(null);
		formStruct.seth_TAX_RATE_2(null);
		formStruct.seth_TAX_RATE_3(null);
		formStruct.setTIME_CTRL(_flgTimeCtrl);
		//�P���Ǎ�����t���O�̃Z�b�g
		formStruct.setSelectUnitCostFlag("false");
	}

	/** 
	 * ���C����ʍ��ڂ̃R�s�[
	 * @param target �R�s�[����Struct
	 */
	public void copySelectStruct(AD0030020Struct target) {

		struct.setWORK_ODR_CD(target.getWORK_ODR_CD());
		struct.setITEM_CD(target.getITEM_CD());
		struct.setWORK_ODR_DLV_DATE_BY_ITEM(target.getWORK_ODR_DLV_DATE_BY_ITEM());
		struct.setWORK_ODR_DLV_DATE_BY_ITEM_TIME(target.getWORK_ODR_DLV_DATE_BY_ITEM_TIME());
		struct.setOPR_INST_START_DATE_BY_ITEM(target.getOPR_INST_START_DATE_BY_ITEM());
		struct.setOPR_INST_START_DATE_BY_ITEM_TIME(target.getOPR_INST_START_DATE_BY_ITEM_TIME());
		struct.setPLANT_CD(target.getPLANT_CD());
		struct.setWORK_STS_TYP(target.getWORK_STS_TYP());
		struct.seth_WORK_STS_TYP(target.geth_WORK_STS_TYP());
		struct.setPROC_EXPLOSION_FLG(target.getPROC_EXPLOSION_FLG());
		struct.seth_MODIFY_COUNT_BY_ITEM(target.geth_MODIFY_COUNT_BY_ITEM());
		struct.setITEM_NAME(target.getITEM_NAME());
		struct.setDRAW_CD(target.getDRAW_CD());
		struct.setSPEC(target.getSPEC());
		struct.setMRP_ODR_TYP(target.getMRP_ODR_TYP());
		struct.setJOB_ODR_CD(target.getJOB_ODR_CD());
		struct.setMRP_ODR_TYP_DN(target.getMRP_ODR_TYP_DN());
		struct.setTIME_CTRL(_flgTimeCtrl);
// ���� 2008/08/28 ADD START -TSUCHIDA����
		struct.seth_MANHOUR_TYP(target.geth_MANHOUR_TYP());
// ���� 2008/08/28 ADD START -TSUCHIDA����

	}
	/** 
	 * �T�u��ʍ��ڂ̃R�s�[
	 * @param target �R�s�[����Struct
	 */
	public void copyFormStruct(AD0030020Struct target) {
		
		struct.setWORK_ODR_CD(target.getWORK_ODR_CD());
		struct.setITEM_CD(target.getITEM_CD());
		struct.setITEM_NAME(target.getITEM_NAME());
		struct.seth_UNIT_QTY_TYP(target.geth_UNIT_QTY_TYP());
		struct.setSTOCK_UNIT(target.getSTOCK_UNIT());
		struct.seth_ODR_START_DATE(target.geth_ODR_START_DATE());
		struct.setWORK_STS_TYP(target.getWORK_STS_TYP());
		struct.seth_WORK_STS_TYP(target.geth_WORK_STS_TYP());
		struct.setWORK_IN_PROC_CD(target.getWORK_IN_PROC_CD());
		struct.setPROC_NAME(target.getPROC_NAME());
		struct.setPROC_NO(target.getPROC_NO());
		struct.setWORK_ODR_DLV_DATE_BY_PROC(target.getWORK_ODR_DLV_DATE_BY_PROC());
		struct.setWORK_ODR_DLV_DATE_BY_PROC_TIME(target.getWORK_ODR_DLV_DATE_BY_PROC_TIME());
		struct.seth_WORK_ODR_DLV_DATE_BY_PROC(target.geth_WORK_ODR_DLV_DATE_BY_PROC());
		struct.seth_WORK_ODR_DLV_DATE_BY_PROC_TIME(target.geth_WORK_ODR_DLV_DATE_BY_PROC_TIME());
		struct.setOPR_INST_START_DATE_BY_PROC(target.getOPR_INST_START_DATE_BY_PROC());
		struct.setOPR_INST_START_DATE_BY_PROC_TIME(target.getOPR_INST_START_DATE_BY_PROC_TIME());
		struct.seth_OPR_INST_START_DATE_BY_PROC(target.geth_OPR_INST_START_DATE_BY_PROC());
		struct.seth_OPR_INST_START_DATE_BY_PROC_TIME(target.geth_OPR_INST_START_DATE_BY_PROC_TIME());
		struct.setOPR_INST_QTY(target.getOPR_INST_QTY());
		struct.seth_OPR_INST_QTY(target.geth_OPR_INST_QTY());
		struct.seth_JOB_ODR_CD(target.geth_JOB_ODR_CD());
		struct.seth_JOB_ODR_CANCEL_NO(target.geth_JOB_ODR_CANCEL_NO());
		struct.seth_PARENT_OD_NO(target.geth_PARENT_OD_NO());
		struct.setOUTSIDE_TYP(target.getOUTSIDE_TYP());
		struct.setWS_CD(target.getWS_CD());
		struct.setWS_NAME(target.getWS_NAME());
		struct.setVEND_CD(target.getVEND_CD());
		struct.setVEND_ANAME(target.getVEND_ANAME());
		struct.setACPT_INSPC_TYP(target.getACPT_INSPC_TYP());
		struct.setCUR_CD(target.getCUR_CD());
		struct.setCUR_NAME(target.getCUR_NAME());
		struct.setUNIT_COST_TYP(target.getUNIT_COST_TYP());
		struct.setUNIT_COST(target.getUNIT_COST());
		struct.setVEND_CUR_UNIT(target.getVEND_CUR_UNIT());
		struct.setPROCESSING_COST(target.getPROCESSING_COST());
		struct.setMATERIAL_COST(target.getMATERIAL_COST());
		struct.setOTHER_OVERHEADS(target.getOTHER_OVERHEADS());
		struct.setPUCH_ODR_AMOUNT(target.getPUCH_ODR_AMOUNT());
		struct.setDISC_AMOUNT(target.getDISC_AMOUNT());
		struct.setAFTER_DISC_AMOUNT(target.getAFTER_DISC_AMOUNT());
		struct.setTAX_AMOUNT_1(target.getTAX_AMOUNT_1());
		struct.setTAX_AMOUNT_2(target.getTAX_AMOUNT_2());
		struct.setTAX_AMOUNT_3(target.getTAX_AMOUNT_3());
		struct.setAMOUNT_INCLUDE_TAX(target.getAMOUNT_INCLUDE_TAX());
		struct.setPROVISIONAL_HOME_CUR_AMOUNT(target.getPROVISIONAL_HOME_CUR_AMOUNT());
		struct.setEXCH_RATE(target.getEXCH_RATE());
		struct.setWORK_IN_PROC_COMMENT(target.getWORK_IN_PROC_COMMENT());
		struct.setOPR_INST_CD(target.getOPR_INST_CD());
		struct.seth_BUSINESS_OPR_DATE(target.geth_BUSINESS_OPR_DATE());
		struct.seth_OD_NO(target.geth_OD_NO());
		struct.seth_MODIFY_COUNT_BY_ITEM(target.geth_MODIFY_COUNT_BY_ITEM());
		struct.seth_MODIFY_COUNT_BY_PROC(target.geth_MODIFY_COUNT_BY_PROC());
		struct.seth_MODIFY_COUNT_OPR_INST(target.geth_MODIFY_COUNT_OPR_INST());
		struct.setROUND_TYP(target.getROUND_TYP());
		struct.setEXCH_TYP(target.getEXCH_TYP());
		struct.seth_VEND_DECIMAL_FIG(target.geth_VEND_DECIMAL_FIG());
		struct.seth_TAX_RATE_1(target.geth_TAX_RATE_1());
		struct.seth_TAX_RATE_2(target.geth_TAX_RATE_2());
		struct.seth_TAX_RATE_3(target.geth_TAX_RATE_3());
		struct.setHOME_CUR_UNIT(target.getHOME_CUR_UNIT());
		struct.setTIME_CTRL(_flgTimeCtrl);
		//�P���Ǎ�����p�t���O
		struct.setSelectUnitCostFlag(target.getSelectUnitCostFlag());

// ���� 2008/08/28 ADD START -TSUCHIDA����
		struct.seth_MANHOUR_TYP(target.geth_MANHOUR_TYP());
// ���� 2008/08/28 ADD START -TSUCHIDA����

	}
	/**
	 * �P�����ڂ̃R�s�[
	 * @param target �R�s�[����Struct
	 */
	public void copyUnitCostStruct(AD0030020Struct target) {
	
		struct.setAFTER_DISC_AMOUNT(target.getAFTER_DISC_AMOUNT());
		struct.setAMOUNT_INCLUDE_TAX(target.getAMOUNT_INCLUDE_TAX());
		struct.setCUR_CD(target.getCUR_CD());
		struct.setCUR_NAME(target.getCUR_NAME());
		struct.setDISC_AMOUNT(target.getDISC_AMOUNT());
		struct.setEXCH_RATE(target.getEXCH_RATE());
		struct.seth_TAX_RATE_1(target.geth_TAX_RATE_1());
		struct.seth_TAX_RATE_2(target.geth_TAX_RATE_2());
		struct.seth_TAX_RATE_3(target.geth_TAX_RATE_3());
		struct.seth_VEND_DECIMAL_FIG(target.geth_VEND_DECIMAL_FIG());
		struct.setHOME_CUR_UNIT(target.getHOME_CUR_UNIT());
		struct.setMATERIAL_COST(target.getMATERIAL_COST());
		struct.setOTHER_OVERHEADS(target.getOTHER_OVERHEADS());
		struct.setPLANT_CD(target.getPLANT_CD());
		struct.setPROCESSING_COST(target.getPROCESSING_COST());
		struct.setPROVISIONAL_HOME_CUR_AMOUNT(target.getPROVISIONAL_HOME_CUR_AMOUNT());
		struct.setPUCH_ODR_AMOUNT(target.getPUCH_ODR_AMOUNT());
		struct.setROUND_TYP(target.getROUND_TYP());
		struct.setTAX_AMOUNT_1(target.getTAX_AMOUNT_1());
		struct.setTAX_AMOUNT_2(target.getTAX_AMOUNT_2());
		struct.setTAX_AMOUNT_3(target.getTAX_AMOUNT_3());
		struct.setUNIT_COST(target.getUNIT_COST());
		struct.setUNIT_COST_TYP(target.getUNIT_COST_TYP());
		struct.setVEND_ANAME(target.getVEND_ANAME());
		struct.setVEND_CUR_UNIT(target.getVEND_CUR_UNIT());
		//�P���Ǎ�����p�t���O
		struct.setSelectUnitCostFlag(target.getSelectUnitCostFlag());
	}
	
	/*
	 * �o�^�E�X�V���ڂ̃R�s�[
	 * @param toStruct �R�s�[���Struct
	 * @param fromStruct �R�s�[����Struct
	 */
	public void copyUpdateStruct(AD0030020Struct toStruct, AD0030020Struct fromStruct) {

		toStruct.setPROC_NAME(fromStruct.getPROC_NAME());
		toStruct.setPROC_NO(fromStruct.getPROC_NO());
		toStruct.setWORK_ODR_DLV_DATE_BY_PROC(fromStruct.getWORK_ODR_DLV_DATE_BY_PROC());
		toStruct.setWORK_ODR_DLV_DATE_BY_PROC_TIME(fromStruct.getWORK_ODR_DLV_DATE_BY_PROC_TIME());
		toStruct.setOPR_INST_START_DATE_BY_PROC(fromStruct.getOPR_INST_START_DATE_BY_PROC());
		toStruct.setOPR_INST_START_DATE_BY_PROC_TIME(fromStruct.getOPR_INST_START_DATE_BY_PROC_TIME());
		toStruct.setOPR_INST_QTY(fromStruct.getOPR_INST_QTY());
		toStruct.setOUTSIDE_TYP(fromStruct.getOUTSIDE_TYP());
		toStruct.setWS_CD(fromStruct.getWS_CD());
		toStruct.setVEND_CD(fromStruct.getVEND_CD());
		toStruct.setACPT_INSPC_TYP(fromStruct.getACPT_INSPC_TYP());
		toStruct.setUNIT_COST_TYP(fromStruct.getUNIT_COST_TYP());
		toStruct.setUNIT_COST(fromStruct.getUNIT_COST());
		toStruct.setPROCESSING_COST(fromStruct.getPROCESSING_COST());
		toStruct.setMATERIAL_COST(fromStruct.getMATERIAL_COST());
		toStruct.setOTHER_OVERHEADS(fromStruct.getOTHER_OVERHEADS());
		toStruct.setPUCH_ODR_AMOUNT(fromStruct.getPUCH_ODR_AMOUNT());
		toStruct.setDISC_AMOUNT(fromStruct.getDISC_AMOUNT());
		toStruct.setOPR_INST_CD(fromStruct.getOPR_INST_CD());
		toStruct.setWORK_IN_PROC_COMMENT(fromStruct.getWORK_IN_PROC_COMMENT());
		toStruct.seth_COMPANY_CD(fromStruct.geth_COMPANY_CD());
		toStruct.setFINAL_PROC_FLG(fromStruct.getFINAL_PROC_FLG());
		toStruct.setWORK_ODR_CD(fromStruct.getWORK_ODR_CD());
		toStruct.setWORK_IN_PROC_CD(fromStruct.getWORK_IN_PROC_CD());
		toStruct.setOPR_INST_CD(fromStruct.getOPR_INST_CD());

		toStruct.seth_OD_NO(fromStruct.geth_OD_NO());
		toStruct.setITEM_CD(fromStruct.getITEM_CD());
		toStruct.seth_WORK_STS_TYP(fromStruct.geth_WORK_STS_TYP());
		toStruct.setPLANT_CD(fromStruct.getPLANT_CD());

	}
	
	/*
	 * �������z�̐ݒ�
	 * @exception ExpjException, FoundationException
	 */
	public void setPuchOdrAmount() 
			throws ExpjException, FoundationException {


		try {			
			String taxRate1 = null;
			String taxRate2 = null;
			String taxRate3 = null;
			String taxRoundTyp = null;
			
			// [�M��]���𕔕i���擾
			this._sysHomeCurStruct = HomeCurControl.getData(this.conn);
			formStruct.setHOME_CUR_UNIT(this._sysHomeCurStruct.getCUR_UNIT());
			
			//��ЃR�[�h�̎擾
			List companyList = entity.mSelect_SYS_MY_COMPANY.read(conn, formStruct);
			if (companyList.isEmpty()) { 
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("SYS_MY_COMPANY.CTRL_CD", "SYSTEM");
				return;
			}
			AD0030020Struct companyStruct = new AD0030020Struct();
			companyStruct = (AD0030020Struct)companyList.get(0);
			setStandardItem(companyStruct);
			_myCompanyCd = companyStruct.getCOMPANY_CD();
			this.struct.seth_COMPANY_CD(_myCompanyCd);
			
			// �ʉݒP��
			//this.struct.setVEND_CUR_UNIT(listStruct.getVEND_CUR_UNIT());

			//�����R�[�h���݃`�F�b�N
			if (formStruct.getVEND_CD() == null || "".equals(formStruct.getVEND_CD())) {

				// ���ڃN���A
				formStruct.setVEND_ANAME(null);
				formStruct.setUNIT_COST_TYP("0.00");
				formStruct.setUNIT_COST("0.00");
				formStruct.setPROCESSING_COST("0.00");
				formStruct.setMATERIAL_COST("0.00");
				formStruct.setOTHER_OVERHEADS("0.00");
				formStruct.setPUCH_ODR_AMOUNT("0.00");
				formStruct.setDISC_AMOUNT("0.00");
				formStruct.setAFTER_DISC_AMOUNT("0.00");
				formStruct.setPROVISIONAL_HOME_CUR_AMOUNT("0.00");
				formStruct.setROUND_TYP(Kind.FLOOR);
				formStruct.setCUR_CD(null);
				formStruct.setCUR_NAME(null);
				formStruct.setVEND_CUR_UNIT(null);
				formStruct.seth_VEND_DECIMAL_FIG("4");
				formStruct.setEXCH_RATE("0.00");
				formStruct.seth_TAX_RATE_1("0.00");
				formStruct.seth_TAX_RATE_2("0.00");
				formStruct.seth_TAX_RATE_3("0.00");
				formStruct.setTAX_AMOUNT_1("0.00");
				formStruct.setTAX_AMOUNT_2("0.00");
				formStruct.setTAX_AMOUNT_3("0.00");
			
			} else {
				try {
					// �ʉݏ����擾
					CurStruct cs =
						CurControl.getData(
							this.conn,
							_myCompanyCd,
							formStruct.getVEND_CD());
			
					formStruct.setROUND_TYP(cs.getROUND_TYP());
					formStruct.seth_VEND_DECIMAL_FIG(cs.getDECIMAL_FIG());
					formStruct.setVEND_CUR_UNIT(cs.getCUR_UNIT());
					formStruct.setCUR_CD(cs.getCUR_CD());
					formStruct.setCUR_NAME(cs.getCUR_NAME());
			
				} catch (DataNotFoundException e) {
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", 
							this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
					return;
				}
			
				try {
					// ����ŏ����擾
					TaxStruct ts =
						TaxControl.getData(
							this.conn,
							_myCompanyCd,
							formStruct.getVEND_CD(),
							formStruct.getITEM_CD(),
							formStruct.getWORK_ODR_DLV_DATE_BY_PROC());
			
					//�Œ[���敪:[�����]�D"���z�܂�ߋ敪
					taxRoundTyp = ts.getTAX_ROUND_TYP();
			
					// TAX_CD�̉�1����1�ȊO�̏ꍇ�͐ŗ���0�Ƃ���B
					String lowerTaxCd =
						ts.getTAX_CD().substring(ts.getTAX_CD().length() - 1);
					if (lowerTaxCd.equals("1")) {
						taxRate1 = ts.getTAX_RATE_1();
						taxRate2 = ts.getTAX_RATE_2();
						taxRate3 = ts.getTAX_RATE_3();
					} else {
						taxRate1 = "0.00";
						taxRate2 = "0.00";
						taxRate3 = "0.00";
					}
				} catch (DataNotFoundException e) {
					taxRoundTyp = "1";
					taxRate1 = "0.00";
					taxRate2 = "0.00";
					taxRate3 = "0.00";
				}
			
				if (!("2".equals(formStruct.getEXCH_TYP())) 
						&& !(formStruct.getCUR_CD() == null 
						|| "".equals(formStruct.getCUR_CD()))){
					try{
						// �בփ��[�g�����擾
						ExchRateStruct ers =
							ExchRateControl.getData(
								this.conn,
								_myCompanyCd,
								formStruct.getCUR_CD(),
								formStruct.getEXCH_TYP(),
								null,
								formStruct.getWORK_ODR_DLV_DATE_BY_PROC());
			
						formStruct.setEXCH_RATE(ers.getEXCH_RATE());
			
					} catch (DataNotFoundException e) {
						// �בփ��[�g
						formStruct.setEXCH_RATE("0.00");
						// �M�݋��z
						formStruct.setPROVISIONAL_HOME_CUR_AMOUNT("0.00");
					}
				} else {
					// �בփ��[�g
					formStruct.setEXCH_RATE("0.00");
					// �M�݋��z
					formStruct.setPROVISIONAL_HOME_CUR_AMOUNT("0.00");
				}
				
				formStruct.seth_TAX_RATE_1(taxRate1); // �ŗ�1
				formStruct.seth_TAX_RATE_2(taxRate2); // �ŗ�2
				formStruct.seth_TAX_RATE_3(taxRate3); // �ŗ�3
				
				// �l��������z
				String afterDiscAmount =
						AmountCalculator.calcNetAmount(
							formStruct.getPUCH_ODR_AMOUNT(),
							formStruct.getDISC_AMOUNT());
				formStruct.setAFTER_DISC_AMOUNT(afterDiscAmount);
				
				//�Ŋz1
				String taxAmount1 =
						AmountCalculator.calcTaxAmount(
							formStruct.getAFTER_DISC_AMOUNT(),
							taxRate1,
							taxRoundTyp,
							formStruct.geth_VEND_DECIMAL_FIG());
				formStruct.setTAX_AMOUNT_1(taxAmount1);
				
				//�Ŋz2
				String taxAmount2 =
						AmountCalculator.calcTaxAmount(
							formStruct.getAFTER_DISC_AMOUNT(),
							taxRate2,
							taxRoundTyp,
							formStruct.geth_VEND_DECIMAL_FIG());
				formStruct.setTAX_AMOUNT_2(taxAmount2);
				
				//�Ŋz3
				String taxAmount3 =
						AmountCalculator.calcTaxAmount(
							formStruct.getAFTER_DISC_AMOUNT(),
							taxRate3,
							taxRoundTyp,
							formStruct.geth_VEND_DECIMAL_FIG());
				formStruct.setTAX_AMOUNT_3(taxAmount3);
				
				//�ō����z
				String amountIncludeTax =
						AmountCalculator.calcAmountIncludeTax(
							formStruct.getAFTER_DISC_AMOUNT(),
							formStruct.getTAX_AMOUNT_1(),
							formStruct.getTAX_AMOUNT_2(),
							formStruct.getTAX_AMOUNT_3());
				formStruct.setAMOUNT_INCLUDE_TAX(amountIncludeTax);
				
				//�ב֎�ʂ��Q�̏ꍇ
				if ("2".equals(formStruct.getEXCH_TYP())) {
			
					// �בփ��[�g
					formStruct.setEXCH_RATE("0.00");
					// �M�݋��z
					formStruct.setPROVISIONAL_HOME_CUR_AMOUNT("0.00");
			
				} else {
					
					// �M�݋��z�̌v�Z
					String homeCurAmount =
							AmountCalculator.calcHomeCurAmount(
								formStruct.getAMOUNT_INCLUDE_TAX(),
								formStruct.getEXCH_RATE(),
								formStruct.getROUND_TYP(),
								this._sysHomeCurStruct.getDECIMAL_FIG());
					formStruct.setPROVISIONAL_HOME_CUR_AMOUNT(homeCurAmount);
				}
			}

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

	}
        /** �R���{�{�b�N�X�f�[�^�擾�p�萔�@�W�J�ς݃t���O */
        private final static String OUTSIDE_TYP_PARAMETER_NAME= "OUTSIDE_TYP"; 
       
        /** �R���{�{�b�N�X�f�[�^�擾�p�@�W�J�ς݃t���O */
        private ComboStruct OUTSIDE_TYP = null;
        
        private void othercomboTyp(AD0030020Struct aStruct) {
        	
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

	/** �����Ǘ��p�t���O */
	private String _flgTimeCtrl = null;

        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>


		try {
			clearStruct();
			clearList();
			
			//��ƌv��ԍ����i�ڕʎd�|�ɑ��݂��Ȃ��ꍇ�G���[
			List workOdrCdList = entity.mCheck_WORK_ODR_CD_BY_ITEM.read(conn, struct);
			if (workOdrCdList.isEmpty()) {
				if (_deleteMessageStatus == 0){
					setErrorMessage("ZZ06001");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", struct.getWORK_ODR_CD());
				} else {
					_deleteMessageStatus = 0;
				}
				setReadStatus(NOT_FOUND);
				setScreenMoveFlg(1);
				return;
			}

			//�i�ڕʎd�|���R�[�h���擾
			List selectHeaderList = entity.mSelectHeader.read(conn, struct);
			if (selectHeaderList.isEmpty()) {
				if (_deleteMessageStatus == 0){
					setErrorMessage("ZZ06001");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
				} else {
					_deleteMessageStatus = 0;
				}
				setReadStatus(NOT_FOUND);
				setScreenMoveFlg(1);
				return;
			}
			AD0030020Struct selectHeaderStruct = new AD0030020Struct();
			selectHeaderStruct = (AD0030020Struct)selectHeaderList.get(0);
			selectHeaderStruct.setMRP_ODR_TYP_DN(multcombo("MRP_ODR_TYP",selectHeaderStruct.getMRP_ODR_TYP()));
			
			//���t�Ǝ������킯��
			DateTimeFormat dtf = new DateTimeFormat(conn);
			selectHeaderStruct.setWORK_ODR_DLV_DATE_BY_ITEM(dtf.getDatePart(selectHeaderStruct.getWORK_ODR_DLV_DATE_BY_ITEM_ALL()));
			selectHeaderStruct.setWORK_ODR_DLV_DATE_BY_ITEM_TIME(dtf.getCoronTimePart(selectHeaderStruct.getWORK_ODR_DLV_DATE_BY_ITEM_ALL()));
			selectHeaderStruct.setOPR_INST_START_DATE_BY_ITEM(dtf.getDatePart(selectHeaderStruct.getOPR_INST_START_DATE_BY_ITEM_ALL()));
			selectHeaderStruct.setOPR_INST_START_DATE_BY_ITEM_TIME(dtf.getCoronTimePart(selectHeaderStruct.getOPR_INST_START_DATE_BY_ITEM_ALL()));
			
			setStandardItem(selectHeaderStruct);



			//���O�C�����[�U�̍H��R�[�h�ƕi�ڕʎd�|�̍H��R�[�h����v���Ȃ��ꍇ�G���[
			if (!getsysPLANT_CD().equals(selectHeaderStruct.getPLANT_CD())) { 
				setErrorMessage("AD00006");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
				setScreenMoveFlg(1);
				setReadStatus(ERROR);
				return;
			}

			//�i�ڕʍ�Ə�ԋ敪���P�i���w���j�ȊO�̏ꍇ�G���[
			if (!("1".equals(selectHeaderStruct.geth_WORK_STS_TYP()) 
					|| "2".equals(selectHeaderStruct.geth_WORK_STS_TYP()))) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
				setScreenMoveFlg(1);
				setReadStatus(ERROR);
				return;
			}

			//��ƌn��W�J�ς݃t���O���O�i���W�J�j�̏ꍇ�G���[
			if ("0".equals(selectHeaderStruct.getPROC_EXPLOSION_FLG())) {
				if (_deleteMessageStatus == 0){
					setErrorMessage("ZZ06001");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
				} else {
					_deleteMessageStatus = 0;
				}
				setScreenMoveFlg(1);
				setReadStatus(ERROR);
				return;
			}

            //�ő�\���s��
            int maxLine = sp.getMaxLine(conn, 10);
			if(maxLine != 0) {
				struct.setROW_COUNT(String.valueOf(maxLine));
			} else {
				struct.setROW_COUNT(null);
			}
			list = entity.mSelectGridCnt.read(conn, struct);
			long rowCount = Long.parseLong(((AD0030020Struct)list.get(0)).getl_COUNT()); 

		    if (maxLine != 0 && rowCount == maxLine + 1 && rowCount!= 0) {
				setErrorMessage("ZZ01115", String.valueOf(maxLine));
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
				setScreenMoveFlg(1);
				setReadStatus(TOO_MANY);
				if(list != null && list.size() > 0){
					clearList();
			    }
				return;
			}
			list = entity.mSelectGrid.read(conn, struct);
			AD0030020Struct TempStruct;
	             for (int i = 0; i < list.size(); i++) {
			     TempStruct = (AD0030020Struct)list.get(i);
	
			     //�R���{�{�b�N�X�̎擾
			     othercomboTyp(TempStruct);
			    }

			//��ʍ��ڂɒl���Z�b�g
			copySelectStruct(selectHeaderStruct);
			
			setReadStatus(NORMAL);

		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}


                //}}user_implement_dev:<controlSelect>
		logger.exiting("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>


		// ������
		struct.clear();
		// ���X�g�N���A
		clearList();
		
		setReadStatus(INITIAL);


                //}}user_implement_dev:<controlClear>
		logger.exiting("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlReturn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlReturn");
			//{{user_implement_dev:<controlReturn>


		//�L�[�l�̊m��
		String workOdrCd = struct.getWORK_ODR_CD();

		// ������
		struct.clear();
		// ���X�g�N���A
		clearList();
		
		//�L�[�l�̃Z�b�g
		struct.setWORK_ODR_CD(workOdrCd);
		//�e��ʂɖ߂�����c�a�Č������s���B
		controlSelect();


                //}}user_implement_dev:<controlReturn>
		logger.exiting("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlReturn");

		return;
	}

	/**
	 * �s�ǉ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlLineInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlLineInsert");
			//{{user_implement_dev:<controlLineInsert>


		try {
			//�����Ǘ��p�����[�^�擾
			List listTimeCtrl = entity.mTIME_CTRL.read(conn,struct);
			if(listTimeCtrl == null || listTimeCtrl.size() <=0){
				struct.setTIME_CTRL("false");
				_flgTimeCtrl = "false";
			}else{
				struct.setTIME_CTRL(((AD0030020Struct)listTimeCtrl.get(0)).getTIME_CTRL());
				_flgTimeCtrl = struct.getTIME_CTRL();
			}
			
			//�\�����ڂƃN���C�A���g�`�F�b�N���ڂ̎擾
			List formList = entity.mFormSub1Insert.read(conn, struct);
			if (formList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
				return;
			}
			formStruct = new AD0030020Struct();
			formStruct = (AD0030020Struct) formList.get(0);
			//���t�Ǝ������킯��
			DateTimeFormat dtf = new DateTimeFormat(conn);
			formStruct.seth_ODR_START_DATE(dtf.getDatePart(formStruct.geth_ODR_START_DATE_ALL()));
			formStruct.seth_ODR_START_DATE_TIME(dtf.getTimePart(formStruct.geth_ODR_START_DATE_ALL()));
			setStandardItem(formStruct);
			
			// �����l���Z�b�g����
			formInitialize();
			//�ύX�O�̓��O��敪�̃Z�[�u
			_outsideTypBefore = "1";

			// ��Ǝw���ԍ����̔Ԃ���
			CollectNumber OPR_INST_CD = 
					new CollectNumber(CollectNumber.INST_CD, 
						getsysUSER_CD(), 
						this.sp.getProcId(),
						getsysPLANT_CD());
			
			formStruct.setOPR_INST_CD(OPR_INST_CD.getNo());
			
			// �Ɩ��^�p���̃Z�b�g
			this.struct.setPLANT_CD(getsysPLANT_CD());
			List oprDateList = entity.mSelect_BUSINESS_OPR_DATE.read(conn, struct);
			if (oprDateList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("SYS_DATE_CTRL.PLANT_CD", getsysPLANT_CD());
				return;
			}
			AD0030020Struct oprDateStruct = new AD0030020Struct();
			oprDateStruct = (AD0030020Struct)oprDateList.get(0);
			setStandardItem(oprDateStruct);
			formStruct.seth_BUSINESS_OPR_DATE(oprDateStruct.geth_BUSINESS_OPR_DATE());
			
			
			// ���������������烂�[�h���Z�b�g����悤�ɕύX
			//�ǂ̃C�x���g���Ă΂ꂽ�̂����Z�b�g
			this.screenStatus = AD0030020Control.FUNC_INS;


			formStruct.seth_WORK_ODR_DLV_DATE_BY_PROC(formStruct.getWORK_ODR_DLV_DATE_BY_PROC());
			formStruct.seth_WORK_ODR_DLV_DATE_BY_PROC_TIME(formStruct.getWORK_ODR_DLV_DATE_BY_PROC_TIME());
			formStruct.seth_OPR_INST_START_DATE_BY_PROC(formStruct.getOPR_INST_START_DATE_BY_PROC());
			formStruct.seth_OPR_INST_START_DATE_BY_PROC_TIME(formStruct.getOPR_INST_START_DATE_BY_PROC_TIME());
			formStruct.seth_OPR_INST_QTY(formStruct.getOPR_INST_QTY());	
			//��ʍ��ڂɒl���Z�b�g
			copyFormStruct(formStruct);
			
			setReadStatus(NORMAL);

		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}

                //}}user_implement_dev:<controlLineInsert>
		logger.exiting("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlLineInsert");

		return;
	}

	/**
	 * �s�C���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlLineUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlLineUpdate");
			//{{user_implement_dev:<controlLineUpdate>


		try {
			//�����Ǘ��p�����[�^�擾
			List listTimeCtrl = entity.mTIME_CTRL.read(conn,struct);
			if(listTimeCtrl == null || listTimeCtrl.size() <=0){
				struct.setTIME_CTRL("false");
				_flgTimeCtrl = "false";
			}else{
				struct.setTIME_CTRL(((AD0030020Struct)listTimeCtrl.get(0)).getTIME_CTRL());
				_flgTimeCtrl = struct.getTIME_CTRL();
			}
			
			formStruct = new AD0030020Struct();
			// �����l���Z�b�g����
			formInitialize();
			
			//�\�����ڂƃN���C�A���g�`�F�b�N���ڂ̎擾
			List formList = entity.mFormSub1Update.read(conn, struct);
			if (formList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
				return;
			}
			formStruct = (AD0030020Struct) formList.get(0);
			setStandardItem(formStruct);
			formStruct.setSelectUnitCostFlag("false");			
			
			//���t�Ǝ������킯��
			DateTimeFormat dtf = new DateTimeFormat(conn);
			formStruct.setWORK_ODR_DLV_DATE_BY_PROC(dtf.getDatePart(formStruct.getWORK_ODR_DLV_DATE_BY_PROC_ALL()));
			formStruct.setWORK_ODR_DLV_DATE_BY_PROC_TIME(dtf.getTimePart(formStruct.getWORK_ODR_DLV_DATE_BY_PROC_ALL()));
			formStruct.setOPR_INST_START_DATE_BY_PROC(dtf.getDatePart(formStruct.getOPR_INST_START_DATE_BY_PROC_ALL()));
			formStruct.setOPR_INST_START_DATE_BY_PROC_TIME(dtf.getTimePart(formStruct.getOPR_INST_START_DATE_BY_PROC_ALL()));
			formStruct.seth_ODR_START_DATE(dtf.getDatePart(formStruct.geth_ODR_START_DATE_ALL()));
			formStruct.seth_ODR_START_DATE_TIME(dtf.getTimePart(formStruct.geth_ODR_START_DATE_ALL()));
			
			//�X�V�O�̍�Ǝw�������n��ʔ[�����n��ʒ�������Z�[�u
			formStruct.seth_WORK_ODR_DLV_DATE_BY_PROC(formStruct.getWORK_ODR_DLV_DATE_BY_PROC());
			formStruct.seth_WORK_ODR_DLV_DATE_BY_PROC_TIME(formStruct.getWORK_ODR_DLV_DATE_BY_PROC_TIME());
			formStruct.seth_OPR_INST_START_DATE_BY_PROC(formStruct.getOPR_INST_START_DATE_BY_PROC());
			formStruct.seth_OPR_INST_START_DATE_BY_PROC_TIME(formStruct.getOPR_INST_START_DATE_BY_PROC_TIME());
			formStruct.seth_OPR_INST_QTY(formStruct.getOPR_INST_QTY());
			//�ύX�O�̓��O��敪�̃Z�[�u
			_outsideTypBefore = formStruct.getOUTSIDE_TYP();
			
			//�O��̏ꍇ�́A�P�����̃Z�b�g���s��
			if ("2".equals(formStruct.getOUTSIDE_TYP())) {
				setPuchOdrAmount();
			} else {
				formStruct.setROUND_TYP(Kind.FLOOR);
				formStruct.seth_VEND_DECIMAL_FIG("4");
				formStruct.seth_VEND_DECIMAL_FIG("4");
				formStruct.setVEND_CUR_UNIT("");
				formStruct.setHOME_CUR_UNIT("");
			}
			
			
			// �Ɩ��^�p���̃Z�b�g
			this.struct.setPLANT_CD(getsysPLANT_CD());
			List oprDateList = entity.mSelect_BUSINESS_OPR_DATE.read(conn, struct);
			if (oprDateList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("SYS_DATE_CTRL.PLANT_CD", getsysPLANT_CD());
				return;
			}
			AD0030020Struct oprDateStruct = new AD0030020Struct();
			oprDateStruct = (AD0030020Struct)oprDateList.get(0);
			setStandardItem(oprDateStruct);
			formStruct.seth_BUSINESS_OPR_DATE(oprDateStruct.geth_BUSINESS_OPR_DATE());
			
			
			//���������������烂�[�h��ݒ肷��
			// �ǂ̃C�x���g���Ă΂ꂽ�̂����Z�b�g
			this.screenStatus = AD0030020Control.FUNC_UPD;
			
			//�P���Ǎ�����t���O�̃Z�b�g
			if ("2".equals(formStruct.getOUTSIDE_TYP())) {
				formStruct.setSelectUnitCostFlag("true");
			}


			//��ʍ��ڂɒl���Z�b�g
			copyFormStruct(formStruct);
			
			setReadStatus(NORMAL);

		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}
		

                //}}user_implement_dev:<controlLineUpdate>
		logger.exiting("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlLineUpdate");

		return;
	}

	/**
	 * �s���ʃ{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlLineCopy() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlLineCopy");
			//{{user_implement_dev:<controlLineCopy>


		try {
			//�����Ǘ��p�����[�^�擾
			List listTimeCtrl = entity.mTIME_CTRL.read(conn,struct);
			if(listTimeCtrl == null || listTimeCtrl.size() <=0){
				struct.setTIME_CTRL("false");
				_flgTimeCtrl = "false";
			}else{
				struct.setTIME_CTRL(((AD0030020Struct)listTimeCtrl.get(0)).getTIME_CTRL());
				_flgTimeCtrl = struct.getTIME_CTRL();
			}
			
			formStruct = new AD0030020Struct();
			// �����l���Z�b�g����
			formInitialize();

			//�\�����ڂƃN���C�A���g�`�F�b�N���ڂ̎擾
			List formList = entity.mFormSub1Update.read(conn, struct);
			if (formList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
				return;
			}
			formStruct = new AD0030020Struct();
			formStruct = (AD0030020Struct) formList.get(0);
			setStandardItem(formStruct);
			formStruct.setSelectUnitCostFlag("false");			
			
			//���t�Ǝ������킯��
			DateTimeFormat dtf = new DateTimeFormat(conn);
			formStruct.setWORK_ODR_DLV_DATE_BY_PROC(dtf.getDatePart(formStruct.getWORK_ODR_DLV_DATE_BY_PROC_ALL()));
			formStruct.setWORK_ODR_DLV_DATE_BY_PROC_TIME(dtf.getTimePart(formStruct.getWORK_ODR_DLV_DATE_BY_PROC_ALL()));
			formStruct.setOPR_INST_START_DATE_BY_PROC(dtf.getDatePart(formStruct.getOPR_INST_START_DATE_BY_PROC_ALL()));
			formStruct.setOPR_INST_START_DATE_BY_PROC_TIME(dtf.getTimePart(formStruct.getOPR_INST_START_DATE_BY_PROC_ALL()));
			formStruct.seth_ODR_START_DATE(dtf.getDatePart(formStruct.geth_ODR_START_DATE_ALL()));
			formStruct.seth_ODR_START_DATE_TIME(dtf.getTimePart(formStruct.geth_ODR_START_DATE_ALL()));
			
			//�X�V�O�̍�Ǝw�������n��ʔ[�����n��ʒ�������Z�[�u
			formStruct.seth_WORK_ODR_DLV_DATE_BY_PROC(formStruct.getWORK_ODR_DLV_DATE_BY_PROC());
			formStruct.seth_WORK_ODR_DLV_DATE_BY_PROC_TIME(formStruct.getWORK_ODR_DLV_DATE_BY_PROC_TIME());
			formStruct.seth_OPR_INST_START_DATE_BY_PROC(formStruct.getOPR_INST_START_DATE_BY_PROC());
			formStruct.seth_OPR_INST_START_DATE_BY_PROC_TIME(formStruct.getOPR_INST_START_DATE_BY_PROC_TIME());
			formStruct.seth_OPR_INST_QTY(formStruct.getOPR_INST_QTY());
			//�ύX�O�̓��O��敪�̃Z�[�u
			_outsideTypBefore = formStruct.getOUTSIDE_TYP();
						
			//�O��̏ꍇ�́A�P�����̃Z�b�g���s��
			if ("2".equals(formStruct.getOUTSIDE_TYP())) {
				setPuchOdrAmount();
			} else {
				formStruct.setROUND_TYP(Kind.FLOOR);
				formStruct.seth_VEND_DECIMAL_FIG("4");
				formStruct.setVEND_CUR_UNIT("");
				formStruct.setHOME_CUR_UNIT("");
			}

			// ��ƃR�[�h�ɂ�NULL��ݒ�
			formStruct.setWORK_IN_PROC_CD(null);
						
			// ��Ǝw���ԍ����̔Ԃ���
			CollectNumber OPR_INST_CD = 
					new CollectNumber(CollectNumber.INST_CD, 
						getsysUSER_CD(), 
						this.sp.getProcId(),
						getsysPLANT_CD());
						
			formStruct.setOPR_INST_CD(OPR_INST_CD.getNo());
						
						
			// �Ɩ��^�p���̃Z�b�g
			this.struct.setPLANT_CD(getsysPLANT_CD());
			List oprDateList = entity.mSelect_BUSINESS_OPR_DATE.read(conn, struct);
			if (oprDateList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("SYS_DATE_CTRL.PLANT_CD", getsysPLANT_CD());
				return;
			}
			AD0030020Struct oprDateStruct = new AD0030020Struct();
			oprDateStruct = (AD0030020Struct)oprDateList.get(0);
			setStandardItem(oprDateStruct);
			formStruct.seth_BUSINESS_OPR_DATE(oprDateStruct.geth_BUSINESS_OPR_DATE());
						
						
			//���������������烂�[�h��ݒ肷��
			// �ǂ̃C�x���g���Ă΂ꂽ�̂����Z�b�g
			this.screenStatus = AD0030020Control.FUNC_CPY;
										
			//��ʍ��ڂɒl���Z�b�g
			copyFormStruct(formStruct);
						
			setReadStatus(NORMAL);

		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}


                //}}user_implement_dev:<controlLineCopy>
		logger.exiting("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlLineCopy");

		return;
	}

	/**
	 * �s�폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlLineDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlLineDelete");
			//{{user_implement_dev:<controlLineDelete>


		try {
			AD0030020Struct deleteStruct = new AD0030020Struct();
			setStandardItem(deleteStruct);
			deleteStruct.setWORK_ODR_CD(struct.getWORK_ODR_CD());
			deleteStruct.setWORK_IN_PROC_CD(struct.getWORK_IN_PROC_CD());
			
			//�폜�O�̓���v��ԍ����̍ŏI�n��̌n��ԍ����擾����
			List lastProcList = entity.mSelect_T_WORK_IN_PROC_BY_PROC_LAST.read(conn, struct);
			if (lastProcList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
				return;
			}
			AD0030020Struct lastProcStruct = new AD0030020Struct();
			lastProcStruct = (AD0030020Struct)lastProcList.get(0);
			setStandardItem(lastProcStruct);

			//�폜�f�[�^�̌n��ԍ���ݒ�
			int delete_proc_no = Integer.parseInt(struct.getPROC_NO());

			// �폜�Ώۂ��ŏI�n��̏ꍇ�݈̂ȉ��̃`�F�b�N���s��
			if (lastProcStruct.getWORK_IN_PROC_CD().equals(struct.getWORK_IN_PROC_CD())) {
								
				//���ԕi�ڂ̏ꍇ
				if (!(struct.getJOB_ODR_CD() == null || "".equals(struct.getJOB_ODR_CD()))) {
						
					List parentList = entity.mSelect_PARENT_OD_NO.read(conn, struct);
					if (parentList.isEmpty()) {
						setErrorMessage("ZZ06001");
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
						return;
					}
					AD0030020Struct parentStruct = new AD0030020Struct();
					parentStruct = (AD0030020Struct)parentList.get(0);
					setStandardItem(parentStruct);
							
					//�ŏ�ʕi�ڂ̏ꍇ
					if (parentStruct.geth_PARENT_OD_NO() == null) {
						//���[�j���O�o��
						setWarningMessage("AD00007");
						setInfoSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
						setInfoSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
					}

					// ���ԕi�ڂł��A��Ǝw�����̒l���قȂ�ꍇ���폜�Ȃ̂ŏ�ɈقȂ�
					if (parentStruct.geth_PARENT_OD_NO() != null) {
						//���[�j���O�o��
						setWarningMessage("AD00045");
						setInfoSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
						setInfoSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
					}

					// ���ʕ��i�����݂���ꍇ���ŏI�n�񂪑O��̃`�F�b�N�̂���
					// ���ʕ��i�����݂���Ζ������Ƀ��[�j���O
					AD0030020Struct childStruct = new AD0030020Struct();
					childStruct.seth_PARENT_OD_NO(struct.geth_OD_NO());
					setStandardItem(childStruct);
					List childList = entity.mSelect_T_OD.read(conn, childStruct);  
					if (childList.size() > 0) {
						setWarningMessage("AD00047");
						setInfoSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
						setInfoSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
					}
				}
			}


			//�n��ʎd�|�X�V���`�F�b�N
			List procModifyList = entity.mSelect_CHECK_MODIFY_COUNT.read(conn, struct);
			//�X�V�Ώۃ��R�[�h�����݂��Ȃ������ꍇ�̓G���[
			if (procModifyList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
				return;
			}
			AD0030020Struct procModifyStruct = new AD0030020Struct();
			procModifyStruct = (AD0030020Struct)procModifyList.get(0);
			setStandardItem(procModifyStruct);
			if (struct.geth_MODIFY_COUNT_BY_PROC().equals(
					procModifyStruct.getMODIFY_COUNT_BY_PROC()) == false) {
				setErrorMessage("ZZ01105");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
				return;
			}

			//��ƌn��ʎd�|�̍폜
			entity.mDelete_T_WORK_IN_PROC_BY_PROC.delete(conn, struct);

		
			//���O��敪���P�i����j�̏ꍇ�A��Ǝw���`�[�̍폜
			if ("1".equals(struct.getOUTSIDE_TYP())) {
		
				//��Ǝw���`�[�X�V�����擾����
				List oprInstModifyList = entity.mSelect_T_OPR_INST_SLIP.read(conn, struct);
				//�X�V�Ώۃ��R�[�h�����݂��Ȃ������ꍇ�̓G���[
				if (oprInstModifyList.isEmpty()) {
					setErrorMessage("ZZ06001");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
					return;
				}
				AD0030020Struct oprInstModifyStruct = new AD0030020Struct();
				oprInstModifyStruct = (AD0030020Struct)oprInstModifyList.get(0);
				setStandardItem(oprInstModifyStruct);
		
				//��Ǝw���`�[�F���̃��[�U���X�V���Ă��Ȃ����X�V���`�F�b�N
				if (struct.geth_MODIFY_COUNT_OPR_INST().equals(
						oprInstModifyStruct.getMODIFY_COUNT_OPR_INST()) == false) {
					setErrorMessage("ZZ01105");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", this.struct.getOPR_INST_CD());//��Ǝw���ԍ�
					return;
				}
		
				//��Ǝw���`�[�̍폜
				entity.mDelete_T_OPR_INST_SLIP.delete(conn, struct);
		
			}
		
			//�i�ڕʎd�|�̍X�V���`�F�b�N
			List itemModifyList = entity.mSelect_CHECK_MODIFY_COUNT_BY_ITEM.read(conn, struct);
			//�X�V�Ώۃ��R�[�h�����݂��Ȃ������ꍇ�̓G���[
			if (itemModifyList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
				return;
			}
			AD0030020Struct itemModifyStruct = new AD0030020Struct();
			itemModifyStruct = (AD0030020Struct)itemModifyList.get(0);
			setStandardItem(itemModifyStruct);
			if (struct.geth_MODIFY_COUNT_BY_ITEM().equals(
					itemModifyStruct.getMODIFY_COUNT_BY_ITEM()) == false) {
				setErrorMessage("ZZ01105");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
				return;
			}

			//�����_�ł̍�ƌn��ʎd�|�̓����ƌv��ԍ��̃��R�[�h�����`�F�b�N���A
			//�P�����Ȃ���Εi�ڕʎd�|�̍�ƌn��W�J�ς݃t���O���n�e�e�ɂ���
			List countList = entity.mCount_T_WORK_IN_PROC_BY_PROC.read(conn, struct);
			if (countList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
				return;
			}
			AD0030020Struct countStruct = new AD0030020Struct();
			countStruct = (AD0030020Struct)countList.get(0);
			setStandardItem(countStruct);
			if ("0".equals(countStruct.getWORK_IN_PROC_CD())) {
				deleteStruct.setPROC_EXPLOSION_FLG("0");
				entity.mUpdate_T_WORK_IN_PROC_BY_ITEM_EXP_FLG.update(conn, deleteStruct);
				_deleteMessageStatus = 1;
			} else {
		
				//�폜��̓���v��ԍ����̏��n��̌n��ԍ����擾����
				List firstProcList = entity.mSelect_T_WORK_IN_PROC_BY_PROC_FIRST.read(conn, struct);
				if (firstProcList.isEmpty()) { 
					setErrorMessage("ZZ06001");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
					return;
				}
				AD0030020Struct firstProcStruct = new AD0030020Struct();
				firstProcStruct = (AD0030020Struct)firstProcList.get(0);
				setStandardItem(firstProcStruct);
				//�X�V�㏉�n��̎d�|��ƃR�[�h��ݒ�
				_firstWorkInProcCd_new = firstProcStruct.getWORK_IN_PROC_CD();
				//�X�V�㏉�n��ԍ���ݒ�
				_firstProcNo_new = Integer.parseInt(firstProcStruct.getPROC_NO());
				//�X�V�㒅�����ݒ�
				_firstStartDate_new = firstProcStruct.getOPR_INST_START_DATE_BY_PROC();
				//�X�V�㒅���(����)��ݒ�
				_firstStartDateTime_new = firstProcStruct.getOPR_INST_START_DATE_BY_PROC_TIME();

		
				//�폜��̓���v��ԍ����̍ŏI�n��̌n��ԍ����擾����
				List delLastProcList = entity.mSelect_T_WORK_IN_PROC_BY_PROC_LAST.read(conn, struct);
				if (delLastProcList.isEmpty()) { 
					setErrorMessage("ZZ06001");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
					return;
				} else {
					AD0030020Struct delLastProcStruct = new AD0030020Struct();
					delLastProcStruct = (AD0030020Struct)delLastProcList.get(0);
					setStandardItem(delLastProcStruct);
					//�X�V��ŏI�n��̎d�|��ƃR�[�h��ݒ�
					_lastWorkInProcCd_new = delLastProcStruct.getWORK_IN_PROC_CD();
					//�X�V��ŏI�n��̌n��ԍ���ݒ�
					_lastProcNo_new = Integer.parseInt(delLastProcStruct.getPROC_NO());
					//�X�V��ŏI�n��̔[����ݒ�
					_lastDlvDate_new = delLastProcStruct.getWORK_ODR_DLV_DATE_BY_PROC();
					//�X�V��ŏI�n��̔[��(����)��ݒ�
					_lastDlvDateTime_new = delLastProcStruct.getWORK_ODR_DLV_DATE_BY_PROC_TIME();
					//�X�V��ŏI�n��̍�Ǝw������ݒ�
					_lastOprInstQty_new = delLastProcStruct.getOPR_INST_QTY();
				}
		
				//�폜���ꂽ���R�[�h�����n�񂾂����ꍇ
				if ( delete_proc_no < _firstProcNo_new) {
		
					//�V���ɏ��n��ƂȂ����n��ʎd�|�̒������
					//�i�ڕʎd�|�̍X�V���s���i���n��F�n��ʒ�����j
					//�����L�[�ł���d�|��ƃR�[�h��ݒ�
					deleteStruct.setWORK_IN_PROC_CD(_firstWorkInProcCd_new);
					//�i�ڕʎd�|�̒�����ɐݒ�
					deleteStruct.setOPR_INST_START_DATE_BY_ITEM_ALL(_firstStartDate_new+_firstStartDateTime_new);
					entity.mUpdate_T_WORK_IN_PROC_BY_ITEM_START_DATE.update(conn, deleteStruct);
					
					//���v�ʂ̃I�[�_��񁕉��ʃf�}���h�̍X�V�i���ʏ����j
					CommonOd od = new CommonOd(conn,
										this.sysPLANT_CD,
										this.sysUSER_CD,
										this.sp.getProcId());
					od.changeOdInfo(struct.geth_OD_NO(), -1);
				}
		
				//�폜���ꂽ���R�[�h���ŏI�n�񂾂����ꍇ
				if ( delete_proc_no > _lastProcNo_new) {
					
					//�V���ɍŏI�n��ƂȂ����n��ʎd�|�̍ŏI�n��t���O��ON�ɂ���
					deleteStruct.setWORK_IN_PROC_CD(_lastWorkInProcCd_new);
					deleteStruct.setFINAL_PROC_FLG("1");
					entity.mUpdate_T_WORK_IN_PROC_BY_PROC_FINAL_PROC_FLG.update(conn, deleteStruct);
						
					//�i�ڕʎd�|�̍X�V�i�ŏI�n��F�n��ʔ[������Ǝw�����j
					//�i�ڕʎd�|�̔[���ɐݒ�
					deleteStruct.setWORK_ODR_DLV_DATE_BY_ITEM_ALL(_lastDlvDate_new+_lastDlvDateTime_new); 
					//�i�ڕʎd�|�̍�Ǝw�����ɐݒ�
					deleteStruct.setOPR_INST_QTY(_lastOprInstQty_new);
					entity.mUpdate_T_WORK_IN_PROC_BY_ITEM_DLV_DATE.update(conn, deleteStruct);
						
					//���v�ʂ̃I�[�_��񁕉��ʃf�}���h�̍X�V�i���ʏ����j
					CommonOd od = new CommonOd(conn,
										this.sysPLANT_CD,
										this.sysUSER_CD,
										this.sp.getProcId());
					od.changeOdInfo(struct.geth_OD_NO(), -1);
				}
			}

			conn.commit();

			//�W�J�t���O��OFF�Ƃ����ۂɁA���[�j���O��\�������Ȃ��B
			if (_deleteMessageStatus != 0){
				this.msgStruct.clearAll();
			}
			
			//��ʂ̍Č���
			controlSelect();

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
		logger.exiting("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlLineDelete");

		return;
	}

	/**
	 * �P���Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelectUnitCost() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlSelectUnitCost");
			//{{user_implement_dev:<controlSelectUnitCost>


		try {
			AD0030020Struct unitCostStruct = new AD0030020Struct();
			setStandardItem(unitCostStruct);
			//�P���Ǎ�����t���O�̃Z�b�g
			unitCostStruct.setSelectUnitCostFlag(struct.getSelectUnitCostFlag());

			unitCostStruct.setTAX_AMOUNT_1("0.00");
			unitCostStruct.setTAX_AMOUNT_2("0.00");
			unitCostStruct.setTAX_AMOUNT_3("0.00");
			unitCostStruct.setAMOUNT_INCLUDE_TAX("0.00");
			unitCostStruct.setEXCH_RATE("0.00");
			unitCostStruct.setPROVISIONAL_HOME_CUR_AMOUNT("0.00");
			unitCostStruct.setCUR_CD(null);
			unitCostStruct.setCUR_NAME(null);
			unitCostStruct.setPLANT_CD(sysPLANT_CD);

			// [�M��]���𕔕i���擾
			this._sysHomeCurStruct = HomeCurControl.getData(this.conn);
			unitCostStruct.setHOME_CUR_UNIT(this._sysHomeCurStruct.getCUR_UNIT());

			//��ЃR�[�h�̎擾
			List companyList = entity.mSelect_SYS_MY_COMPANY.read(conn,struct);
			if (companyList.isEmpty()) { 
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("SYS_MY_COMPANY.CTRL_CD", "SYSTEM");
				return;
			}
			AD0030020Struct companyStruct = new AD0030020Struct();
			companyStruct = (AD0030020Struct)companyList.get(0);
			setStandardItem(companyStruct);
			_myCompanyCd = companyStruct.getCOMPANY_CD();
			this.struct.seth_COMPANY_CD(_myCompanyCd);
			
			// ����於�̎擾
			AD0030020Struct venderStruct = new AD0030020Struct();
			setStandardItem(venderStruct);
			venderStruct.setCOMPANY_CD(_myCompanyCd);
			venderStruct.setVEND_CD(this.struct.getVEND_CD());
				
			//�����R�[�h���݃`�F�b�N �����݂��Ȃ���΃G���[
			List vendList = entity.mSelect_M_VEND_CTRL.read(conn, venderStruct);
			if (vendList.size() > 0) {
				unitCostStruct.setVEND_ANAME(((AD0030020Struct)vendList.get(0)).getVEND_ANAME());
			} else {

				unitCostStruct.setROUND_TYP(Kind.FLOOR);
				unitCostStruct.seth_VEND_DECIMAL_FIG(this.struct.geth_VEND_DECIMAL_FIG());
				
				setErrorMessage("AD20030");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
				//��ʍ��ڂ֒ǋL
				copyUnitCostStruct(unitCostStruct);
				return;
			}
				
			try {
				// �O���P���Ǎ����i���O���P�������擾
				SbcntUnitCostStruct sucs =
					SbcntUnitCostControl.getData(
						this.conn,
						_myCompanyCd,
						this.struct.getVEND_CD(),
						this.sysPLANT_CD,
						this.struct.getITEM_CD(),
						this.struct.getWORK_IN_PROC_CD(),
						this.struct.getOPR_INST_START_DATE_BY_PROC(),
						this.struct.getWORK_ODR_DLV_DATE_BY_PROC(),
						this.struct.getOPR_INST_QTY(),
						null);
							
				// �擾�����f�[�^��struct�ɐݒ�
				unitCostStruct.setUNIT_COST_TYP(sucs.getUNIT_COST_TYP());
				unitCostStruct.setUNIT_COST(sucs.getUNIT_COST());
				unitCostStruct.setPROCESSING_COST(sucs.getPROCESSING_COST());
				unitCostStruct.setMATERIAL_COST(sucs.getMATERIAL_COST());
				unitCostStruct.setOTHER_OVERHEADS(sucs.getOTHER_OVERHEADS());
				unitCostStruct.setPUCH_ODR_AMOUNT(sucs.getPUCH_ODR_AMOUNT());
				unitCostStruct.setDISC_AMOUNT(sucs.getDISC_AMOUNT());
				unitCostStruct.setAFTER_DISC_AMOUNT(sucs.getAFTER_DISC_AMOUNT());
				unitCostStruct.setPROVISIONAL_HOME_CUR_AMOUNT(
						sucs.getPROVISIONAL_HOME_CUR_AMOUNT());
				unitCostStruct.setROUND_TYP(sucs.getROUND_TYP());
				unitCostStruct.setCUR_CD(sucs.getCUR_CD());
				unitCostStruct.setCUR_NAME(sucs.getCUR_NAME());
				unitCostStruct.setVEND_CUR_UNIT(sucs.getCUR_UNIT());
				unitCostStruct.seth_VEND_DECIMAL_FIG(sucs.getDECIMAL_FIG());
				unitCostStruct.setEXCH_RATE(sucs.getEXCH_RATE());
					
				String taxRate1 = null;    // �ŗ�1
				String taxRate2 = null;    // �ŗ�2
				String taxRate3 = null;    // �ŗ�3
				String taxRoundTyp = null; // �Œ[���敪
				try {
					// ����ŏ����擾
					TaxStruct ts =
						TaxControl.getData(
							this.conn,
							_myCompanyCd,
							this.struct.getVEND_CD(),
							this.struct.getITEM_CD(),
							this.struct.getWORK_ODR_DLV_DATE_BY_PROC());
						
					// �Œ[���敪:[�����]�D"���z�܂�ߋ敪
					taxRoundTyp = ts.getTAX_ROUND_TYP();
						
					// TAX_CD�̉�1����1�ȊO�̏ꍇ�͐ŗ���0�Ƃ���B
					String lowerTaxCd =
						ts.getTAX_CD().substring(ts.getTAX_CD().length() - 1);
					if ("1".equals(lowerTaxCd)) {
						taxRate1 = ts.getTAX_RATE_1();
						taxRate2 = ts.getTAX_RATE_2();
						taxRate3 = ts.getTAX_RATE_3();
					} else {
						taxRate1 = "0";
						taxRate2 = "0";
						taxRate3 = "0";
					}
				} catch (DataNotFoundException e) {
					//�Œ[���敪:[�����]�D"���z�܂�ߋ敪
					taxRoundTyp = "1";
					taxRate1 = "0";
					taxRate2 = "0";
					taxRate3 = "0";
				}
					
				unitCostStruct.seth_TAX_RATE_1(taxRate1); // �ŗ�1
				unitCostStruct.seth_TAX_RATE_2(taxRate2); // �ŗ�2
				unitCostStruct.seth_TAX_RATE_3(taxRate3); // �ŗ�3
					
				//�Ŋz1
				String taxAmount1 =
					AmountCalculator.calcTaxAmount(
						unitCostStruct.getAFTER_DISC_AMOUNT(),
						taxRate1,
						taxRoundTyp,
						unitCostStruct.geth_VEND_DECIMAL_FIG());
				unitCostStruct.setTAX_AMOUNT_1(taxAmount1);
					
				//�Ŋz2
				String taxAmount2 =
					AmountCalculator.calcTaxAmount(
						unitCostStruct.getAFTER_DISC_AMOUNT(),
						taxRate2,
						taxRoundTyp,
						unitCostStruct.geth_VEND_DECIMAL_FIG());
				unitCostStruct.setTAX_AMOUNT_2(taxAmount2);
					
				//�Ŋz3
				String taxAmount3 =
					AmountCalculator.calcTaxAmount(
						unitCostStruct.getAFTER_DISC_AMOUNT(),
						taxRate3,
						taxRoundTyp,
						unitCostStruct.geth_VEND_DECIMAL_FIG());
				unitCostStruct.setTAX_AMOUNT_3(taxAmount3);
					
				//�ō����z
				String amountIncludeTax =
						AmountCalculator.calcAmountIncludeTax(
							unitCostStruct.getAFTER_DISC_AMOUNT(),
							unitCostStruct.getTAX_AMOUNT_1(),
							unitCostStruct.getTAX_AMOUNT_2(),
							unitCostStruct.getTAX_AMOUNT_3());
				unitCostStruct.setAMOUNT_INCLUDE_TAX(amountIncludeTax);
			
				//�ב֎�ʂ��Q�̏ꍇ
				if ("2".equals(sucs.getEXCH_TYP())) {
			
					// �בփ��[�g
					unitCostStruct.setEXCH_RATE("0.00");
						
					// �M�݋��z
					unitCostStruct.setPROVISIONAL_HOME_CUR_AMOUNT("0.00");
			
				} else {
						
					// �M�݋��z�̌v�Z
					String homeCurAmount =
							AmountCalculator.calcHomeCurAmount(
								unitCostStruct.getAMOUNT_INCLUDE_TAX(),
								unitCostStruct.getEXCH_RATE(),
								unitCostStruct.getROUND_TYP(),
							this._sysHomeCurStruct.getDECIMAL_FIG());
					unitCostStruct.setPROVISIONAL_HOME_CUR_AMOUNT(homeCurAmount);
						
				}
									
			} catch (DataNotFoundException e) {
				// �N���A
				unitCostStruct.setUNIT_COST_TYP("0.00");
				unitCostStruct.setUNIT_COST("0.00");
				unitCostStruct.setPROCESSING_COST("0.00");
				unitCostStruct.setMATERIAL_COST("0.00");
				unitCostStruct.setOTHER_OVERHEADS("0.00");
				unitCostStruct.setPUCH_ODR_AMOUNT("0.00");
				unitCostStruct.setDISC_AMOUNT("0.00");
				unitCostStruct.setAFTER_DISC_AMOUNT("0.00");
				unitCostStruct.setPROVISIONAL_HOME_CUR_AMOUNT("0.00");
				unitCostStruct.setCUR_CD(null);
				unitCostStruct.setCUR_NAME(null);
				unitCostStruct.setVEND_CUR_UNIT(null);
				unitCostStruct.setROUND_TYP(Kind.FLOOR);
				unitCostStruct.seth_VEND_DECIMAL_FIG("4");
				unitCostStruct.setEXCH_RATE("0.00");
				unitCostStruct.seth_TAX_RATE_1("0.00");
				unitCostStruct.seth_TAX_RATE_2("0.00");
				unitCostStruct.seth_TAX_RATE_3("0.00");
				unitCostStruct.setTAX_AMOUNT_1("0.00");
				unitCostStruct.setTAX_AMOUNT_2("0.00");
				unitCostStruct.setTAX_AMOUNT_3("0.00");
				//��ʍ��ڂ֒ǋL
				copyUnitCostStruct(unitCostStruct);
				return;
			}

			//�P���Ǎ�����t���O�̃Z�b�g
			unitCostStruct.setSelectUnitCostFlag("true");
			
			//��ʍ��ڂ֒ǋL
			copyUnitCostStruct(unitCostStruct);
			
			setReadStatus(NORMAL);

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


                //}}user_implement_dev:<controlSelectUnitCost>
		logger.exiting("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlSelectUnitCost");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
		try {
			setScreenMoveFlg(0);
			
			this.struct.setPLANT_CD(getsysPLANT_CD());
			//�i�ڃJ�����_�ԍ��̎擾
			List CalList = entity.mSelect_M_ITEM.read(conn,struct);
			
			if (CalList.isEmpty()) { 
				//�H��J�����_�ԍ��̎擾
				CalList = entity.mSelect_M_PLANT.read(conn,struct);
				if (CalList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("M_PLANT.PLANT_CD", getsysPLANT_CD());
				return;
				}
			}
			
			AD0030020Struct CalStruct = new AD0030020Struct();
			CalStruct = (AD0030020Struct)CalList.get(0);
			setStandardItem(CalStruct);
			
			//��ЃR�[�h�̎擾
			List companyList = entity.mSelect_SYS_MY_COMPANY.read(conn,struct);
			if (companyList.isEmpty()) { 
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("SYS_MY_COMPANY.CTRL_CD", "SYSTEM");
				return;
			}
			AD0030020Struct companyStruct = new AD0030020Struct();
			companyStruct = (AD0030020Struct)companyList.get(0);
			setStandardItem(companyStruct);
			_myCompanyCd = companyStruct.getCOMPANY_CD();
			this.struct.seth_COMPANY_CD(_myCompanyCd);
			
			
			//�n��ʔ[���̋x���`�F�b�N
			Date checkDate_d = Converter.strToDate(this.struct.getWORK_ODR_DLV_DATE_BY_PROC(),Converter.SLASH_DATE);
			this.struct.setCHECK_DATE(Converter.dateToStr(checkDate_d, Converter.SLASH_DATE));
			this.struct.setCAL_NO(CalStruct.getCAL_NO()) ;
			
			List calList1 = entity.mSelect_M_CAL.read(conn, struct);
			//�J�����_�ғ����ɑ��݂��Ȃ��ꍇ�G���[
			if (calList1.isEmpty()) {
				setErrorMessage("AD00036");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
			}
			
			//�n��ʒ�����̋x���`�F�b�N
			Date checkDate_s = Converter.strToDate(this.struct.getOPR_INST_START_DATE_BY_PROC(),Converter.SLASH_DATE);
			this.struct.setCHECK_DATE(Converter.dateToStr(checkDate_s, Converter.SLASH_DATE));
			
			List calList2 = entity.mSelect_M_CAL.read(conn, struct);
			//�J�����_�ғ����ɑ��݂��Ȃ��ꍇ�G���[
			if (calList2.isEmpty()) {
				setErrorMessage("AD00038");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
			}
			
			//���O��敪���P�i����j�̏ꍇ
			if ("1".equals(this.struct.getOUTSIDE_TYP())) {
				//��Ƌ�R�[�h���݃`�F�b�N
				List wsCdList = entity.mSelect_M_WS.read(conn, struct);
				//���݂��Ȃ��ꍇ�G���[
				if (wsCdList.isEmpty()) {
					this.struct.setWS_NAME(null);  //��Ƌ於����ʃN���A����
					setErrorMessage("AD20029");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
					setWarningSysLogMessage("M_WS.WS_CD", this.struct.getWS_CD());//��Ƌ�R�[�h
				} else {
					AD0030020Struct wsCdStruct = new AD0030020Struct();
					wsCdStruct = (AD0030020Struct)wsCdList.get(0);
					setStandardItem(wsCdStruct);
					//��Ƌ�D�H��R�[�h��v�`�F�b�N ���s��v�̓G���[
					if (!getsysPLANT_CD().equals(wsCdStruct.getWS_PLANT_CD())) {
						this.struct.setWS_NAME(null);  //��Ƌ於����ʃN���A����
						setErrorMessage("AD00004");
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
						setWarningSysLogMessage("M_WS.WS_CD", this.struct.getWS_CD());//��Ƌ�R�[�h
					}
				}
			}
			
			//���O��敪���Q�i�O��j�̏ꍇ
			if ("2".equals(this.struct.getOUTSIDE_TYP())) {
				//�����R�[�h���݃`�F�b�N �����݂��Ȃ���΃G���[
				this.struct.setCOMPANY_CD(_myCompanyCd);
				List vendList = entity.mSelect_M_VEND_CTRL.read(conn, struct);
				if (vendList.isEmpty()) {
					this.struct.setVEND_ANAME(null);  //����於���N���A����
					setErrorMessage("AD20030");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
				} else {
					//���݂��Ă���Δ������z�܂�ߋ敪���擾����
					AD0030020Struct vendStruct = new AD0030020Struct();
					vendStruct = (AD0030020Struct)vendList.get(0);
					setStandardItem(vendStruct);
					this.struct.setROUND_TYP(vendStruct.getROUND_TYP());
					this.struct.seth_VEND_DECIMAL_FIG(vendStruct.geth_VEND_DECIMAL_FIG());
				}
			}

			//�o�^�����̂Ƃ��̂ݍs��
			if (this.screenStatus == 0 || this.screenStatus == 2) {
				
				//�d�|��ƃR�[�h�d���`�F�b�N ���o�^�Ȃ̂Ŋ��ɑ��݂��Ă���΃G���[
				List workInProcCdList = entity.mSelect_CHECK_MODIFY_COUNT.read(conn, struct);
				if (workInProcCdList.size() > 0) {
					setErrorMessage("AD32366");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
				}
				
				//�n��ԍ��d���`�F�b�N
				List procNoList = entity.mSelect_CHECK_PROC_NO.read(conn, struct);
				if (procNoList.size() > 0) {
					setErrorMessage("AD00075");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.PROC_NO", this.struct.getPROC_NO());//�n��ԍ�
				}
				
				//��Ǝw���ԍ��d���`�F�b�N�i�w���`�[���݃`�F�b�N�j
				//���O��敪���P�i����j�̏ꍇ
				if ("1".equals(this.struct.getOUTSIDE_TYP())) {
					
					List oprInstSlipList = entity.mSelect_T_OPR_INST_SLIP.read(conn, struct);
					if (oprInstSlipList.size() > 0) {
						setErrorMessage("AD32303");
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", this.struct.getOPR_INST_CD());//��Ǝw���ԍ�
					}
				}
			}

			//�X�V�����̂Ƃ��̂ݍs��
			if (this.screenStatus == 1) {
				//�n��ԍ��d���`�F�b�N ���d�|��ƃR�[�h�Ⴂ�ő��݂��Ă���΃G���[
				//�i�����R�[�h�̍X�V�͂n�j�Ƃ��邽�߁j
				List procNoList = entity.mSelect_CHECK_PROC_NO.read(conn, struct);
				if (procNoList.size() > 0) {
					AD0030020Struct procNoStruct = new AD0030020Struct();
					procNoStruct = (AD0030020Struct)procNoList.get(0);
					setStandardItem(procNoStruct);
					if (!this.struct.getWORK_IN_PROC_CD().equals(procNoStruct.getWORK_IN_PROC_CD())) {
						setErrorMessage("AD00075");
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
					}
				}
				//���̃��[�U���X�V���Ă��Ȃ����X�V���`�F�b�N
				List modifyList = entity.mSelect_CHECK_MODIFY_COUNT.read(conn, struct);
			
				//�X�V�Ώۃ��R�[�h�����݂��Ȃ������ꍇ�̓G���[
				if (modifyList.isEmpty()) {
					setErrorMessage("ZZ06001");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
				} else {
					AD0030020Struct modifyStruct = new AD0030020Struct();
					modifyStruct = (AD0030020Struct)modifyList.get(0);
					setStandardItem(modifyStruct);
			
					if (struct.geth_MODIFY_COUNT_BY_PROC().equals(
							modifyStruct.getMODIFY_COUNT_BY_PROC()) == false) {
						setErrorMessage("ZZ01105");
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
					}
				}			
			}


			// �G���[������ΏI��
			if (msgStruct.hasError()) {
				return;
			}

			//�R���̏ꍇ�S���ɕύX
			if((struct.getWORK_ODR_DLV_DATE_BY_PROC_TIME()).length() == 3){
				struct.setWORK_ODR_DLV_DATE_BY_PROC_TIME("0" + struct.getWORK_ODR_DLV_DATE_BY_PROC_TIME() );
			}
			if((struct.getOPR_INST_START_DATE_BY_PROC_TIME()).length() == 3){
				struct.setOPR_INST_START_DATE_BY_PROC_TIME("0" + struct.getOPR_INST_START_DATE_BY_PROC_TIME() );
			}
			
			//������NULL�̏ꍇ�ATIME_CTRL=true�̏ꍇ2359��ݒ�Afalse�̏ꍇ0000��ݒ�
			String WorkOdrDlvDateByProcTime = struct.getWORK_ODR_DLV_DATE_BY_PROC_TIME();
			String OprInstStartDateByProcTime = struct.getOPR_INST_START_DATE_BY_PROC_TIME();
			
			if((WorkOdrDlvDateByProcTime).length() == 0){
				if("true".equals(struct.getTIME_CTRL())){
					WorkOdrDlvDateByProcTime = "2359";
				}else{
					WorkOdrDlvDateByProcTime = "0000";
				}
			}
			if((OprInstStartDateByProcTime).length() == 0){
				if("true".equals(struct.getTIME_CTRL())){
					OprInstStartDateByProcTime = "2359";
				}else{
					OprInstStartDateByProcTime = "0000";
				}
			}
			
			//�o�^�O���_�ł̓���v��ԍ����̏��n��̌n��ԍ����擾����
			List firstProcList = entity.mSelect_T_WORK_IN_PROC_BY_PROC_FIRST.read(conn, struct);
			if (firstProcList.isEmpty()) { 
				setErrorMessage("AD00027");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
				return;
			} else {
				AD0030020Struct firstProcStruct = new AD0030020Struct();
				firstProcStruct = (AD0030020Struct)firstProcList.get(0);
				setStandardItem(firstProcStruct);
				//�o�^�O���_���n��̎d�|��ƃR�[�h��ݒ�
				_firstWorkInProcCd = firstProcStruct.getWORK_IN_PROC_CD();
				//�o�^�O���_���n��ԍ���ݒ�
				_firstProcNo = Integer.parseInt(firstProcStruct.getPROC_NO());
			}
			
			//�o�^�O���_�ł̓���v��ԍ����̍ŏI�n��̌n��ԍ����擾����
			List lastProcList = entity.mSelect_T_WORK_IN_PROC_BY_PROC_LAST.read(conn, struct);
			if (lastProcList.isEmpty()) { 
				setErrorMessage("AD00027");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
				return;
			} else {
				AD0030020Struct lastProcStruct = new AD0030020Struct();
				lastProcStruct = (AD0030020Struct)lastProcList.get(0);
				setStandardItem(lastProcStruct);
				//�o�^�O���_�ŏI�n��̎d�|��ƃR�[�h��ݒ�
				_lastWorkInProcCd = lastProcStruct.getWORK_IN_PROC_CD();
				//�o�^�O���_�ŏI�n��̍ŏI�n��ԍ���ݒ�
				_lastProcNo = Integer.parseInt(lastProcStruct.getPROC_NO());
				_lastDlvDate = lastProcStruct.getWORK_ODR_DLV_DATE_BY_PROC(); 
				_lastDlvDateTime = lastProcStruct.getWORK_ODR_DLV_DATE_BY_PROC_TIME(); 
			}
			
			//�o�^�Ώۂ̌n��ԍ����Z�b�g
			int insert_proc_no = Integer.parseInt(struct.getPROC_NO()); 
			
			//�o�^�Ώۂ����n��ɂȂ�ꍇ�ȊO�͑O�H�������擾����
			if (insert_proc_no > _firstProcNo) {

				List bProcList = entity.mSelect_B_PROC.read(conn, struct);
				if (bProcList.size() > 0) {
					AD0030020Struct bProcStruct = new AD0030020Struct();
					bProcStruct = (AD0030020Struct)bProcList.get(0);
					setStandardItem(bProcStruct);
					//�O�H���̍�Ǝw������ݒ�
					BigDecimal b_inst_qty = new BigDecimal(bProcStruct.getOPR_INST_QTY());
					//���H���̍�Ǝw������ݒ�
					BigDecimal this_inst_qty = new BigDecimal(this.struct.getOPR_INST_QTY());
					DateFormat df = DateFormat.getDateInstance();
					//�O�H���̔[����ݒ�
					Date b_dlv_date = df.parse(bProcStruct.getWORK_ODR_DLV_DATE_BY_PROC());
					//�O�H���̒������ݒ�
					Date b_start_date = df.parse(bProcStruct.getOPR_INST_START_DATE_BY_PROC());
					//�O�H���̔[��(����)��ݒ�
					String b_dlv_date_time = bProcStruct.getWORK_ODR_DLV_DATE_BY_PROC_TIME();
					//�O�H���̒����(����)��ݒ�
					String b_start_date_time = bProcStruct.getOPR_INST_START_DATE_BY_PROC_TIME();
					//���H���̔[����ݒ�
					Date this_dlv_date = df.parse(this.struct.getWORK_ODR_DLV_DATE_BY_PROC());
					//���H���̒������ݒ�
					Date this_start_date = df.parse(this.struct.getOPR_INST_START_DATE_BY_PROC());
					//���H���̔[��(����)��ݒ�
					String this_dlv_date_time = WorkOdrDlvDateByProcTime;
					//���H���̒����(����)��ݒ�
					String this_start_date_time = OprInstStartDateByProcTime;
					
						
					//���H���̌n��ʔ[�����O�H���̌n��ʔ[�����H�܂���
					//���H���̌n��ʒ�������O�H���̌n��ʒ�������H
					if ((this_dlv_date.compareTo(b_dlv_date) < 0 ) 
							|| (this_start_date.compareTo(b_start_date) < 0)
							|| (this_dlv_date.compareTo(b_dlv_date) == 0 && this_dlv_date_time.compareTo(b_dlv_date_time) < 0) 
							|| (this_start_date.compareTo(b_start_date) == 0 && this_start_date_time.compareTo(b_start_date_time) < 0)	) {
						setErrorMessage("AD32362");
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
						return;
					}
					//���H���̍�Ǝw�������O�H���̍�Ǝw�������H
					//���[�j���O����
					if (this_inst_qty.compareTo(b_inst_qty) > 0) {
						//���[�j���O�o��
						setWarningMessage("AD25035");
						setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
						setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
					}
				} else {
					//�擾�ł��Ȃ��ꍇ�̓G���[�Ƃ���
					setErrorMessage("AD00027");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
					return;
				}
			}
			
			//�Ώۂ��ŏI�n��ɂȂ�ꍇ�ȊO�͌�H�������擾����
			if (insert_proc_no < _lastProcNo) {

				List aProcList = entity.mSelect_A_PROC.read(conn, struct);
				if (aProcList.size() > 0) {
					AD0030020Struct aProcStruct = new AD0030020Struct();
					aProcStruct = (AD0030020Struct)aProcList.get(0);
					setStandardItem(aProcStruct);
					//��H���̍�Ǝw������ݒ�
					BigDecimal a_inst_qty = new BigDecimal(aProcStruct.getOPR_INST_QTY());
					DateFormat df = DateFormat.getDateInstance();
					//��H���̔[����ݒ�
					Date a_dlv_date = df.parse(aProcStruct.getWORK_ODR_DLV_DATE_BY_PROC());
					//��H���̒������ݒ�
					Date a_start_date = df.parse(aProcStruct.getOPR_INST_START_DATE_BY_PROC());
					//��H���̔[��(����)��ݒ�
					String a_dlv_date_time = aProcStruct.getWORK_ODR_DLV_DATE_BY_PROC_TIME();
					//��H���̒����(����)��ݒ�
					String a_start_date_time = aProcStruct.getOPR_INST_START_DATE_BY_PROC_TIME();
					//���H���̔[����ݒ�
					Date this_dlv_date = df.parse(this.struct.getWORK_ODR_DLV_DATE_BY_PROC());
					//���H���̒������ݒ�
					Date this_start_date = df.parse(this.struct.getOPR_INST_START_DATE_BY_PROC());
					//���H���̔[��(����)��ݒ�
					String this_dlv_date_time = WorkOdrDlvDateByProcTime;
					//���H���̒����(����)��ݒ�
					String this_start_date_time = OprInstStartDateByProcTime;
					//���H���̍�Ǝw������ݒ�
					BigDecimal this_inst_qty = new BigDecimal(this.struct.getOPR_INST_QTY());
			
					//���H���̌n��ʔ[������H���̌n��ʔ[�����H�܂���
					//���H���̌n��ʒ��������H���̌n��ʒ�������H
					if ((this_dlv_date.compareTo(a_dlv_date) > 0)
							|| (this_start_date.compareTo(a_start_date) > 0)
							|| (this_dlv_date.compareTo(a_dlv_date) == 0 && this_dlv_date_time.compareTo(a_dlv_date_time) > 0)
							|| (this_start_date.compareTo(a_start_date) == 0 && this_start_date_time.compareTo(a_start_date_time) > 0)	) {
						setErrorMessage("AD32362");
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
						return;
					}
					//���H���̍�Ǝw��������H���̍�Ǝw�������H
					//���[�j���O����
					if (this_inst_qty.compareTo(a_inst_qty) < 0) {
						//���[�j���O�o��
						setWarningMessage("AD25035");
						setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
						setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
					}
				} else {
					//�擾�ł��Ȃ��ꍇ�̓G���[�Ƃ���
					setErrorMessage("AD00027");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
					return;
				}
			}
			
			// ���ԕi�ڂ̏ꍇ
			if (!(struct.geth_JOB_ODR_CD() == null || "".equals(struct.geth_JOB_ODR_CD()))) {
					
				// �ŏ�ʕi�ڂł��A��Ǝw�������ύX���ꂽ�ꍇ���[�j���O
				if ((struct.geth_PARENT_OD_NO() == null) 
						|| ("".equals(struct.geth_PARENT_OD_NO()))) {
					//�X�V�O�̍�Ǝw������ݒ�
					BigDecimal old_inst_qty = new BigDecimal(this.struct.geth_OPR_INST_QTY());
					//�X�V��̍�Ǝw������ݒ�
					BigDecimal this_inst_qty = new BigDecimal(this.struct.getOPR_INST_QTY());
					if  (this_inst_qty.compareTo(old_inst_qty) != 0) {
						//���[�j���O�o��
						setWarningMessage("AD00007");
						setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
						setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
					}
				}
			
				// ���Ԍv��D���Ԕ[�����ŏI�n��̌n��ʔ[���ɂȂ�ꍇ�G���[
				List jobOdrList = entity.mSelect_T_JOB_ODR.read(conn, struct);
				if (jobOdrList.size() > 0) {
					AD0030020Struct jobOdrStruct = new AD0030020Struct();
					jobOdrStruct = (AD0030020Struct)jobOdrList.get(0);
					setStandardItem(jobOdrStruct);
					DateFormat df = DateFormat.getDateInstance();
					//���Ԕ[����ݒ�
					Date job_dlv_date = df.parse(jobOdrStruct.getJOB_ODR_DLV_DATE());
					//���Ԕ[����ݒ�
					String compare_job_dlv_date = jobOdrStruct.getJOB_ODR_DLV_DATE();
					String job_dlv_date_time = jobOdrStruct.getJOB_ODR_DLV_DATE_TIME();
					//���H���̔[����ݒ�
					Date this_dlv_date = df.parse(this.struct.getWORK_ODR_DLV_DATE_BY_PROC());
					String this_dlv_date_time = WorkOdrDlvDateByProcTime;
					Date last_dlv_date_d = df.parse(_lastDlvDate); 
					String last_dlv_date_d_time = _lastDlvDateTime; 

					if (((this.screenStatus == 0 || this.screenStatus == 2) 
							&& (insert_proc_no > _lastProcNo))
							|| (this.screenStatus == 1 
							&& (insert_proc_no >= _lastProcNo))) { //���H�����ŏI�H���ƂȂ�ꍇ

						if ((job_dlv_date.compareTo(this_dlv_date) < 0 || ((job_dlv_date.compareTo(this_dlv_date)) == 0 && (job_dlv_date_time.compareTo(this_dlv_date_time)) < 0))) {
							if (DateTool.compareYMD(compare_job_dlv_date,this.struct.geth_BUSINESS_OPR_DATE()) >= 0) {
								setErrorMessage("AD32214");
								setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
								setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
							}else {
								setWarningMessage("AD32218");
								setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
								setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
							}
						}
					} else {
						if ((job_dlv_date.compareTo(last_dlv_date_d) < 0 || ((job_dlv_date.compareTo(last_dlv_date_d)) == 0 && (job_dlv_date_time.compareTo(last_dlv_date_d_time)) < 0))) {
							if (DateTool.compareYMD(compare_job_dlv_date,this.struct.geth_BUSINESS_OPR_DATE()) >= 0) {
								setErrorMessage("AD32214");
								setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
								setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
							}else {
								setWarningMessage("AD32218");
								setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
								setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
							}
						}
					}
					// ��s��z���Ԃ̍ŏ�ʕi�ڂ̏ꍇ�ŁA
					//�ŏI�H���̌n��ʔ[����min���v��.�v���[���ɂȂ�ꍇ���[�j���O
					if ("2".equals(jobOdrStruct.getJOB_ODR_TYP())) {
						if ((struct.geth_PARENT_OD_NO() == null) 
								|| ("".equals(struct.geth_PARENT_OD_NO()))) {

							if (((this.screenStatus == 0 || this.screenStatus == 2) 
									&& (insert_proc_no > _lastProcNo))
									|| (this.screenStatus == 1 
									&& (insert_proc_no >= _lastProcNo))) { //���H�����ŏI�H���ƂȂ�ꍇ
								List minDueDateList = entity.mSelect_MIN_DUE_DATE.read(conn, struct);
								if (minDueDateList.size() > 0) {
									AD0030020Struct minDueDateStruct = new AD0030020Struct();
									minDueDateStruct = (AD0030020Struct)minDueDateList.get(0);
									setStandardItem(minDueDateStruct);
		
									//�������ʂ��K���Ԃ��Ă���̂Ŕ[����Null�̏ꍇ��
									//�`�F�b�N���s��Ȃ�
									if (minDueDateStruct.getDUE_DATE() != null) {
										//���Ԕ[����ݒ�
										Date min_due_date = df.parse((minDueDateStruct.getDUE_DATE()).substring(0,10));
										String min_due_date_time = (minDueDateStruct.getDUE_DATE()).substring(10,14);
										if ((this_dlv_date.compareTo(min_due_date)) > 0
											|| ((this_dlv_date.compareTo(min_due_date)) == 0 && (this_dlv_date_time.compareTo(min_due_date_time)) > 0 )) {
											//���[�j���O�o��
											setWarningMessage("AD00044");
											setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
											setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
										}
									} 
								}
							}
						}
					}
				}
				//���ԕi�ڂ̏ꍇ
				if (!(struct.geth_PARENT_OD_NO() == null 
						|| "".equals(struct.geth_PARENT_OD_NO()))) {
					//���ԕi�ڂł��A��Ǝw�����̒l���قȂ�ꍇ���[�j���O
					//�X�V�O�̍�Ǝw������ݒ�
					BigDecimal old_inst_qty = new BigDecimal(this.struct.geth_OPR_INST_QTY());
					//�X�V��̍�Ǝw������ݒ�
					BigDecimal this_inst_qty = new BigDecimal(this.struct.getOPR_INST_QTY());
					if  (this_inst_qty.compareTo(old_inst_qty) != 0) {
						//���[�j���O�o��
						setWarningMessage("AD00045");
						setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
						setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
					}
			
					// ���ԕi�ڂł��A���v�ʁD�v���[�����ŏI�H���̌n��ʔ[���ɂȂ�ꍇ���[�j���O
					List dueDateList = entity.mSelect_DUE_DATE.read(conn, struct);
					if (dueDateList.isEmpty()) { 
						setErrorMessage("AD00027");
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
					} else {
						AD0030020Struct dueDateStruct = new AD0030020Struct();
						dueDateStruct = (AD0030020Struct)dueDateList.get(0);
						setStandardItem(dueDateStruct);
						//�v���[����Null�̏ꍇ�͈ȉ��̃`�F�b�N���s��Ȃ�
						if (dueDateStruct.getDUE_DATE() != null) {
							DateFormat df = DateFormat.getDateInstance();
							Date due_date = df.parse(dueDateStruct.getDUE_DATE());  //�v���[��
							String due_date_time = dueDateStruct.getDUE_DATE_TIME();  //�v���[��(����)
							//���H���[��
							Date this_dlv_date = df.parse(this.struct.getWORK_ODR_DLV_DATE_BY_PROC());
							String this_dlv_date_time = WorkOdrDlvDateByProcTime;
							Date last_dlv_date_d = df.parse(_lastDlvDate);
							String last_dlv_date_d_time = _lastDlvDateTime;
							
							//���H�����ŏI�H���ƂȂ�ꍇ��Ƀ��[�j���O
							if (((this.screenStatus == 0 || this.screenStatus == 2) 
									&& (insert_proc_no > _lastProcNo))
									|| (this.screenStatus == 1 
									&& (insert_proc_no >= _lastProcNo))) {
								if ((due_date.compareTo(this_dlv_date)) < 0 || ((due_date.compareTo(this_dlv_date)) == 0 && (due_date_time.compareTo(this_dlv_date_time)) < 0) ) {
									//���[�j���O�o��
									setWarningMessage("AD00046");
									setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
									setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
								}
							} else {
								if ((due_date.compareTo(last_dlv_date_d)) < 0 || ((due_date.compareTo(last_dlv_date_d)) == 0 && (due_date_time.compareTo(last_dlv_date_d_time)) < 0) ) {
									//���[�j���O�o��
									setWarningMessage("AD00046");
									setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
									setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
								}
							}
						} 
					}
			
				}
				// ���ʕ��i�����݂���ꍇ�ŁA�ŏI�H���̍�Ǝw�����A�n��ʔ[�����ύX���ꂽ�ꍇ
				// �܂��͏��H���̌n��ʒ�������ύX���ꂽ�ꍇ
				AD0030020Struct childStruct = new AD0030020Struct();
				childStruct.seth_PARENT_OD_NO(struct.geth_OD_NO());
				setStandardItem(childStruct);
				List childList = entity.mSelect_T_OD.read(conn, childStruct);
				if (childList.size() > 0) {
					// ���o�^�͏��H���������͍ŏI�H���Ȃ�Ώ�Ƀ��[�j���O
					if (this.screenStatus == 0 || this.screenStatus == 2) {
						//�o�^�Ώۂ����H���������͍ŏI�H�����H
						if (( insert_proc_no < _firstProcNo ) 
								|| ( insert_proc_no > _lastProcNo )) {

							//���[�j���O�o��
							setWarningMessage("AD00047");
							setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
							setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
						}
					} else {
						//�X�V�Ώۂ��ŏI�H�����H
						if ( insert_proc_no >= _lastProcNo ) {
							//�X�V�O�̍�Ǝw������ݒ�
							BigDecimal old_inst_qty = new BigDecimal(this.struct.geth_OPR_INST_QTY());
							//�X�V��̍�Ǝw������ݒ�
							BigDecimal this_inst_qty = new BigDecimal(this.struct.getOPR_INST_QTY());
							DateFormat df = DateFormat.getDateInstance();
							//�X�V�O�[����ݒ�
							Date old_dlv_date = df.parse(this.struct.geth_WORK_ODR_DLV_DATE_BY_PROC());
							//�X�V�O�[��(����)��ݒ�
							String old_dlv_date_time = this.struct.geth_WORK_ODR_DLV_DATE_BY_PROC_TIME();

							//�X�V��[����ݒ�
							Date this_dlv_date 
									= df.parse(this.struct.getWORK_ODR_DLV_DATE_BY_PROC());
							//�X�V��[��(����)��ݒ�
							String this_dlv_date_time 
									= WorkOdrDlvDateByProcTime;
									
							if  ((this_inst_qty.compareTo(old_inst_qty) != 0)
									||  (( this_dlv_date.compareTo(old_dlv_date)) != 0)
									||  (( this_dlv_date_time.compareTo(old_dlv_date_time)) != 0)) {
								//���[�j���O�o��
								setWarningMessage("AD00047");
								setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
								setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
							}
						}
						//�X�V�Ώۂ����H�����H
						if ( insert_proc_no <= _firstProcNo ) {
							DateFormat df = DateFormat.getDateInstance();
							//�X�V�O�������ݒ�
							Date old_start_date = df.parse(this.struct.geth_OPR_INST_START_DATE_BY_PROC());
							//�X�V�㒅�����ݒ�
							Date this_start_date 
									= df.parse(this.struct.getOPR_INST_START_DATE_BY_PROC());
							//�X�V�O�����(����)��ݒ�
							String old_start_date_time = this.struct.geth_OPR_INST_START_DATE_BY_PROC_TIME();
							//�X�V�㒅���(����)��ݒ�
							String this_start_date_time 
									= OprInstStartDateByProcTime;
							if (this_start_date.compareTo(old_start_date) != 0 || this_start_date_time.compareTo(old_start_date_time) != 0) {
								//���[�j���O�o��
								setWarningMessage("AD00047");
								setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
								setInfoSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
			
							}
						}
					}
				}
			}

			// �G���[������ΏI��
			if (msgStruct.hasError()) {
				return;
			}

			
			//�����_�̍ŏI�n��ԍ����擾���ēo�^�f�[�^�Ɣ�r����
			//�Ώۃ��R�[�h���ŏI�n��ɂȂ邩�H
			if (((this.screenStatus == 0 || this.screenStatus == 2) 
					&& (insert_proc_no > _lastProcNo))
					|| (this.screenStatus == 1 
					&& (insert_proc_no >= _lastProcNo))) {
				//�ŏI�n��t���O:�ŏI�n��ł����1
				this.struct.setFINAL_PROC_FLG("1");
			} else {
				//�ŏI�n��łȂ��ꍇ
				//�ŏI�n��t���O:�ŏI�n��łȂ����0
				this.struct.setFINAL_PROC_FLG("0");
			}
			
			
			
			//�o�^����
			if (this.screenStatus == 0 || this.screenStatus == 2) {
				
				AD0030020Struct insertStruct = new AD0030020Struct();
				copyUpdateStruct(insertStruct, this.struct);
				setStandardItem(insertStruct);
				
				//���O��敪���P�i����j�̏ꍇ
				if ("1".equals(this.struct.getOUTSIDE_TYP())) {
					//�O�삩�����ɕς�����ꍇ�̂݁A��Ǝw���ԍ����̔Ԃ��č�Ǝw���`�[��ǉ�����
					//��Ǝw���ԍ���null�̏ꍇ�A��Ǝw���ԍ����̔Ԃ���
					if ((this.struct.getOPR_INST_CD() == null) 
							|| ("".equals(this.struct.getOPR_INST_CD()))) {
						//��Ǝw���ԍ����̔Ԃ���
						CollectNumber OPR_INST_CD = 
								new CollectNumber(CollectNumber.INST_CD,
									getsysUSER_CD(), 
									this.sp.getProcId(),
									getsysPLANT_CD());
						insertStruct.setOPR_INST_CD(OPR_INST_CD.getNo());
					} else {
						insertStruct.setOPR_INST_CD(this.struct.getOPR_INST_CD());
					}
			
					//��Ǝw���ԍ������敪="2"
					insertStruct.setOPR_INST_CD_GNR_TYP("2");
					insertStruct.setPLANT_CD(getsysPLANT_CD());
			
					//��Ǝw���`�[�̒ǉ�
					entity.mInsert_T_OPR_INST_SLIP.create(conn, insertStruct);
			
				} else {
			
					//�������z
					String puchOdrAmount =
						AmountCalculator.calcPuchOdrAmount(
							this.struct.getOPR_INST_QTY(),
							this.struct.getUNIT_COST(),
							this.struct.getROUND_TYP(),
							this.struct.geth_VEND_DECIMAL_FIG());
					insertStruct.setPUCH_ODR_AMOUNT(puchOdrAmount);
			
				}
				
				//��ƌn��ʎd�|�̒ǉ��ɕs�K�v�ȏ�������������
				if ("1".equals(this.struct.getOUTSIDE_TYP())) {
					insertStruct.seth_COMPANY_CD(null);
					insertStruct.setVEND_CD(null);
					insertStruct.setUNIT_COST_TYP("1");
					insertStruct.setUNIT_COST("0");
					insertStruct.setPROCESSING_COST("0");
					insertStruct.setMATERIAL_COST("0");
					insertStruct.setOTHER_OVERHEADS("0");
					insertStruct.setPUCH_ODR_AMOUNT("0");
					insertStruct.setDISC_AMOUNT("0");
					insertStruct.setACPT_INSPC_TYP("1");
				} else {
					insertStruct.setWS_CD(null);
					insertStruct.setOPR_INST_CD(null);
				}
				insertStruct.seth_WORK_STS_TYP("1");
				
				//���t�{����
				insertStruct.setWORK_ODR_DLV_DATE_BY_PROC_ALL(insertStruct.getWORK_ODR_DLV_DATE_BY_PROC()+insertStruct.getWORK_ODR_DLV_DATE_BY_PROC_TIME());
				insertStruct.setOPR_INST_START_DATE_BY_PROC_ALL(insertStruct.getOPR_INST_START_DATE_BY_PROC()+insertStruct.getOPR_INST_START_DATE_BY_PROC_TIME());
				
				//��ƌn��ʎd�|�̒ǉ�
				entity.mInsert_T_WORK_IN_PROC_BY_PROC.create(conn, insertStruct);
			
			
				//�i�ڕʎd�|�F���̃��[�U���X�V���Ă��Ȃ����X�V���`�F�b�N
				List itemModfyList = entity.mSelect_CHECK_MODIFY_COUNT_BY_ITEM.read(conn,struct);
				//�X�V�Ώۃ��R�[�h�����݂��Ȃ������ꍇ�̓G���[
				if (itemModfyList.isEmpty()) {
					setErrorMessage("ZZ06001");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
					return;
				}
				AD0030020Struct itemModfyStruct = new AD0030020Struct();
				itemModfyStruct = (AD0030020Struct)itemModfyList.get(0);
				setStandardItem(itemModfyStruct);
			
				if (struct.geth_MODIFY_COUNT_BY_ITEM().equals(
						itemModfyStruct.getMODIFY_COUNT_BY_ITEM()) == false) {
					setErrorMessage("ZZ01105");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
					return;
				}
			
				//�o�^�Ώۂ����n��̏ꍇ
				if (((this.screenStatus == 0 || this.screenStatus == 2) 
						&& (insert_proc_no < _firstProcNo))
						|| (this.screenStatus == 1 
						&& (insert_proc_no <= _firstProcNo))) {

					//�i�ڕʎd�|�̍X�V�i���n��F�n��ʒ�����j
					//�i�ڕʎd�|�̒�����ɐݒ�
					insertStruct.setOPR_INST_START_DATE_BY_ITEM_ALL(struct.getOPR_INST_START_DATE_BY_PROC()+OprInstStartDateByProcTime);
					insertStruct.setWORK_ODR_CD(struct.getWORK_ODR_CD());
					entity.mUpdate_T_WORK_IN_PROC_BY_ITEM_START_DATE.update(conn, insertStruct);
					
					//���v�ʂ̃I�[�_��񁕉��ʃf�}���h�̍X�V�i���ʏ����j
					CommonOd od = new CommonOd(conn,
										this.sysPLANT_CD,
										this.sysUSER_CD,
										this.sp.getProcId());
					od.changeOdInfo(this.struct.geth_OD_NO(), -1);
				}
			
				//�o�^�Ώۂ��ŏI�n��̏ꍇ���P�ƍH���͏��n�񂩂ŏI�n��Ȃ̂ŏ�ɔ��f
				if (((this.screenStatus == 0 || this.screenStatus == 2) 
						&& (insert_proc_no > _lastProcNo))
						|| (this.screenStatus == 1 
						&& (insert_proc_no >= _lastProcNo))) {
					
					AD0030020Struct procStruct = new AD0030020Struct();
					setStandardItem(procStruct);
					//�o�^�O�܂ōŏI�n�񂾂����n��ʎd�|�̍ŏI�n��t���O��OFF�ɂ���
					procStruct.setWORK_ODR_CD(this.struct.getWORK_ODR_CD());
					procStruct.setWORK_IN_PROC_CD(_lastWorkInProcCd);
					procStruct.setFINAL_PROC_FLG("0");
					entity.mUpdate_T_WORK_IN_PROC_BY_PROC_FINAL_PROC_FLG.update(conn, procStruct);
						
					//�i�ڕʎd�|�̍X�V�i�ŏI�n��F�n��ʔ[������Ǝw�����j
					//�i�ڕʎd�|�̔[���ɐݒ�
					procStruct.setWORK_ODR_DLV_DATE_BY_ITEM_ALL(this.struct.getWORK_ODR_DLV_DATE_BY_PROC()+WorkOdrDlvDateByProcTime);
					//�i�ڕʎd�|�̍�Ǝw�����ɐݒ�
					procStruct.setOPR_INST_QTY(this.struct.getOPR_INST_QTY());
					entity.mUpdate_T_WORK_IN_PROC_BY_ITEM_DLV_DATE.update(conn, procStruct);
						
					//���v�ʂ̃I�[�_��񁕉��ʃf�}���h�̍X�V�i���ʏ����j
					CommonOd od = new CommonOd(conn,
										this.sysPLANT_CD,
										this.sysUSER_CD,
										this.sp.getProcId());
					od.changeOdInfo(this.struct.geth_OD_NO(), -1);
				}
			
			
			//�X�V����
			} else {
				AD0030020Struct updateStruct = new AD0030020Struct();
				copyUpdateStruct(updateStruct, this.struct);
				setStandardItem(updateStruct);

				if ("1".equals(this.struct.getOUTSIDE_TYP())) {
					//��Ǝw���ԍ���null�̏ꍇ�A��Ǝw���ԍ����̔Ԃ���
					if ((this.struct.getOPR_INST_CD() == null) 
							|| ("".equals(this.struct.getOPR_INST_CD()))) {
						//��Ǝw���ԍ����̔Ԃ���
						CollectNumber OPR_INST_CD = 
								new CollectNumber(CollectNumber.INST_CD, 
									getsysUSER_CD(), 
									this.sp.getProcId(),
									getsysPLANT_CD());
						updateStruct.setOPR_INST_CD(OPR_INST_CD.getNo());
						//��Ǝw���ԍ������敪="2"
						updateStruct.setOPR_INST_CD_GNR_TYP("2");
						updateStruct.setPLANT_CD(getsysPLANT_CD());
						//��Ǝw���`�[�̓o�^
						entity.mInsert_T_OPR_INST_SLIP.create(conn, updateStruct);
					} else {
						updateStruct.setOPR_INST_CD(this.struct.getOPR_INST_CD());
					}
					//��ƌn��ʎd�|�̍X�V
					updateStruct.seth_COMPANY_CD(null);
					updateStruct.setVEND_CD(null);
					updateStruct.setUNIT_COST_TYP("1");
					updateStruct.setUNIT_COST("0");
					updateStruct.setPROCESSING_COST("0");
					updateStruct.setMATERIAL_COST("0");
					updateStruct.setOTHER_OVERHEADS("0");
					updateStruct.setPUCH_ODR_AMOUNT("0");
					updateStruct.setDISC_AMOUNT("0");
					updateStruct.setACPT_INSPC_TYP("1");
					
					updateStruct.setWORK_ODR_DLV_DATE_BY_PROC_ALL(updateStruct.getWORK_ODR_DLV_DATE_BY_PROC()+updateStruct.getWORK_ODR_DLV_DATE_BY_PROC_TIME());
					updateStruct.setOPR_INST_START_DATE_BY_PROC_ALL(updateStruct.getOPR_INST_START_DATE_BY_PROC()+updateStruct.getOPR_INST_START_DATE_BY_PROC_TIME());
					
					entity.mUpdate_T_WORK_IN_PROC_BY_PROC.update(conn, updateStruct);
			
				} else {
			
					//�������z
					String puchOdrAmount =
						AmountCalculator.calcPuchOdrAmount(
							this.struct.getOPR_INST_QTY(),
							this.struct.getUNIT_COST(),
							this.struct.getROUND_TYP(),
							this.struct.geth_VEND_DECIMAL_FIG());
					updateStruct.setPUCH_ODR_AMOUNT(puchOdrAmount);

					//��ƌn��ʎd�|�̍X�V
					updateStruct.setWS_CD(null);
					updateStruct.setOPR_INST_CD(null);

					updateStruct.setWORK_ODR_DLV_DATE_BY_PROC_ALL(updateStruct.getWORK_ODR_DLV_DATE_BY_PROC()+updateStruct.getWORK_ODR_DLV_DATE_BY_PROC_TIME());
					updateStruct.setOPR_INST_START_DATE_BY_PROC_ALL(updateStruct.getOPR_INST_START_DATE_BY_PROC()+updateStruct.getOPR_INST_START_DATE_BY_PROC_TIME());
					
					entity.mUpdate_T_WORK_IN_PROC_BY_PROC.update(conn, updateStruct);
			
					//���삩��O��ɕς�����ꍇ�̂݁A��Ǝw���`�[���폜����
					if ("1".equals(_outsideTypBefore)) {
			
						//��Ǝw���`�[�F���̃��[�U���X�V���Ă��Ȃ����X�V���`�F�b�N
						List instSlipModifyList = entity.mSelect_T_OPR_INST_SLIP_FOR_UPDATE.read(conn, this.struct);
			
						//�X�V�Ώۃ��R�[�h�����݂��Ȃ������ꍇ�̓G���[
						if (instSlipModifyList.isEmpty()) {
							setErrorMessage("ZZ06001");
							setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", this.struct.getOPR_INST_CD());//��Ǝw���ԍ�
							return;
						}
						AD0030020Struct instSlipModifyStruct = new AD0030020Struct();
						instSlipModifyStruct = (AD0030020Struct)instSlipModifyList.get(0);
						setStandardItem(instSlipModifyStruct);
						if (struct.geth_MODIFY_COUNT_OPR_INST().equals(
								instSlipModifyStruct.getMODIFY_COUNT_OPR_INST()) == false) {
							setErrorMessage("ZZ01105");
							setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", this.struct.getOPR_INST_CD());//��Ǝw���ԍ�
							return;
						}
			
						//��Ǝw���`�[�̍폜
						entity.mDelete_T_OPR_INST_SLIP.delete(conn, this.struct);
					}
			
				}
			
				//�i�ڕʎd�|�F���̃��[�U���X�V���Ă��Ȃ����X�V���`�F�b�N
				List itemModfyList = entity.mSelect_CHECK_MODIFY_COUNT_BY_ITEM.read(conn, struct);
			
				//�X�V�Ώۃ��R�[�h�����݂��Ȃ������ꍇ�̓G���[
				if (itemModfyList.isEmpty()) {
					setErrorMessage("ZZ06001");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
					return;
				}
				AD0030020Struct itemModfyStruct = new AD0030020Struct();
				itemModfyStruct = (AD0030020Struct)itemModfyList.get(0);
				setStandardItem(itemModfyStruct);
				if (struct.geth_MODIFY_COUNT_BY_ITEM().equals(
						itemModfyStruct.getMODIFY_COUNT_BY_ITEM()) == false) {
					setErrorMessage("ZZ01105");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
					return;
				}
			
				//�X�V�Ώۂ����n��̏ꍇ
				if ( insert_proc_no <= _firstProcNo) {
			
					//�i�ڕʎd�|�̍X�V�i���n��F�n��ʒ�����j
					//�i�ڕʎd�|�̒�����ɐݒ�
					updateStruct.setOPR_INST_START_DATE_BY_ITEM_ALL(struct.getOPR_INST_START_DATE_BY_PROC()+OprInstStartDateByProcTime);
					updateStruct.setWORK_ODR_CD(struct.getWORK_ODR_CD());
					entity.mUpdate_T_WORK_IN_PROC_BY_ITEM_START_DATE.update(conn, updateStruct);
					_procByItemUpdateStatus = 1;    //�i�ڕʎd�|�X�V�ς݃t���OON
			
					//���v�ʂ̃I�[�_��񁕉��ʃf�}���h�̍X�V�i���ʏ����j
					CommonOd od = new CommonOd(conn,
										this.sysPLANT_CD,
										this.sysUSER_CD,
										this.sp.getProcId());
					od.changeOdInfo(this.struct.geth_OD_NO(), -1);
						
				} else {
						
					//�X�V��̏��n����擾
					firstProcList = entity.mSelect_T_WORK_IN_PROC_BY_PROC_FIRST.read(conn, struct);
					if (firstProcList.isEmpty()) {
						setErrorMessage("AD00027");
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
						return;
					} else {
						AD0030020Struct firstProcStruct = new AD0030020Struct();
						firstProcStruct = (AD0030020Struct)firstProcList.get(0);
						setStandardItem(firstProcStruct);
						//�X�V�㏉�n��̎d�|��ƃR�[�h��ݒ�
						_firstWorkInProcCd_new = firstProcStruct.getWORK_IN_PROC_CD();
						//�X�V�㏉�n��ԍ���ݒ�
						_firstProcNo_new = Integer.parseInt(firstProcStruct.getPROC_NO());
						//�X�V�㒅�����ݒ�
						_firstStartDate_new = firstProcStruct.getOPR_INST_START_DATE_BY_PROC();
						//�X�V�㒅���(����)��ݒ�
						_firstStartDateTime_new = firstProcStruct.getOPR_INST_START_DATE_BY_PROC_TIME();
					}
			
					//���n�񂪕ς�����ꍇ
					if (_firstProcNo_new != _firstProcNo ) {
						
						//���n��̒������i�ڕʎd�|�̒�����ɔ��f
						//�i�ڕʎd�|�̒�����ɐݒ�
						updateStruct.setOPR_INST_START_DATE_BY_ITEM_ALL(_firstStartDate_new+_firstStartDateTime_new);
						updateStruct.setWORK_ODR_CD(struct.getWORK_ODR_CD());
						entity.mUpdate_T_WORK_IN_PROC_BY_ITEM_START_DATE.update(conn, updateStruct);
						_procByItemUpdateStatus = 1;    //�i�ڕʎd�|�X�V�ς݃t���OON
					}
						
				}
			
				//�X�V�Ώۂ��ŏI�n��̏ꍇ���P�ƍH���͏��n�񂩂ŏI�n��Ȃ̂ŏ�ɔ��f 
				if ( insert_proc_no >= _lastProcNo) {
			
					//�X�V�O�̍ŏI�n��ƍX�V��̍ŏI�n�񂪕ς�����ꍇ
					//�X�V��̓���v��ԍ����̍ŏI�n��̌n��ԍ����擾����
					lastProcList = entity.mSelect_T_WORK_IN_PROC_BY_PROC_LAST.read(conn, struct);
					if (lastProcList.isEmpty()) {
						setErrorMessage("AD00027");
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
						return;
					} else {
						AD0030020Struct lastProcStruct = new AD0030020Struct();
						lastProcStruct = (AD0030020Struct)lastProcList.get(0);
						setStandardItem(lastProcStruct);
						//�X�V��ŏI�n��̎d�|��ƃR�[�h��ݒ�
						_lastWorkInProcCd_new = lastProcStruct.getWORK_IN_PROC_CD();
						//�X�V��ŏI�n��̍ŏI�n��ԍ���ݒ�
						_lastProcNo_new = Integer.parseInt(lastProcStruct.getPROC_NO());
						//�X�V��ŏI�n��̔[����ݒ�
						_lastDlvDate_new = lastProcStruct.getWORK_ODR_DLV_DATE_BY_PROC();
						//�X�V��ŏI�n��̔[��(����)��ݒ�
						_lastDlvDateTime_new = lastProcStruct.getWORK_ODR_DLV_DATE_BY_PROC_TIME();
						//�X�V��ŏI�n��̍�Ǝw������ݒ�
						_lastOprInstQty_new = lastProcStruct.getOPR_INST_QTY();
					}
					//�ŏI�n�񂪕ς�����ꍇ
					if (!_lastWorkInProcCd_new.equals(_lastWorkInProcCd)) {  //�������C��
						//�X�V�O�܂ōŏI�n�񂾂����n��ʎd�|�̍ŏI�n��t���O��OFF�ɂ���
						updateStruct.setWORK_ODR_CD(this.struct.getWORK_ODR_CD());
						updateStruct.setWORK_IN_PROC_CD(_lastWorkInProcCd);
						updateStruct.setFINAL_PROC_FLG("0");
						entity.mUpdate_T_WORK_IN_PROC_BY_PROC_FINAL_PROC_FLG.update(conn, updateStruct);
					}
					//�i�ڕʎd�|�̍X�V�i�ŏI�n��F�n��ʔ[������Ǝw�����j
					//�i�ڕʎd�|�̔[���ɐݒ�
					updateStruct.setWORK_ODR_DLV_DATE_BY_ITEM_ALL(this.struct.getWORK_ODR_DLV_DATE_BY_PROC()+WorkOdrDlvDateByProcTime);
					//�i�ڕʎd�|�̍�Ǝw�����ɐݒ�
					updateStruct.setOPR_INST_QTY(struct.getOPR_INST_QTY());
					updateStruct.setWORK_ODR_CD(this.struct.getWORK_ODR_CD());
					//�i�ڕʎd�|�����X�V�ł���Βʏ��Update Sql���Ăяo��
					if ( _procByItemUpdateStatus == 0 ) {        
						entity.mUpdate_T_WORK_IN_PROC_BY_ITEM_DLV_DATE.update(conn, updateStruct);
					} else {
						entity.mUpdate_T_WORK_IN_PROC_BY_ITEM_DLV_DATE2.update(conn, updateStruct);
					}
					//���v�ʂ̃I�[�_��񁕉��ʃf�}���h�̍X�V�i���ʏ����j
					CommonOd od = new CommonOd(conn,
										this.sysPLANT_CD,
										this.sysUSER_CD,
										this.sp.getProcId());
					od.changeOdInfo(this.struct.geth_OD_NO(), -1);
			
				} else {
			
					//�X�V��̓���v��ԍ����̍ŏI�n��̌n��ԍ����擾����
					lastProcList = entity.mSelect_T_WORK_IN_PROC_BY_PROC_LAST.read(conn, struct);
					if (lastProcList.isEmpty()) {
						setErrorMessage("AD00027");
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD", this.struct.getWORK_ODR_CD());//��ƌv��ԍ�
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD", this.struct.getWORK_IN_PROC_CD());//�d�|��ƃR�[�h
						return;
					} else {
						AD0030020Struct lastProcStruct = new AD0030020Struct();
						lastProcStruct = (AD0030020Struct)lastProcList.get(0);
						setStandardItem(lastProcStruct);
						//�X�V��ŏI�n��̎d�|��ƃR�[�h��ݒ�
						_lastWorkInProcCd_new = lastProcStruct.getWORK_IN_PROC_CD();
						//�X�V��ŏI�n��̍ŏI�n��ԍ���ݒ�
						_lastProcNo_new = Integer.parseInt(lastProcStruct.getPROC_NO());
						//�X�V��ŏI�n��̔[����ݒ�
						_lastDlvDate_new = lastProcStruct.getWORK_ODR_DLV_DATE_BY_PROC();
						//�X�V��ŏI�n��̔[��(����)��ݒ�
						_lastDlvDateTime_new = lastProcStruct.getWORK_ODR_DLV_DATE_BY_PROC_TIME();
						//�X�V��ŏI�n��̍�Ǝw������ݒ�
						_lastOprInstQty_new = lastProcStruct.getOPR_INST_QTY();
					}
			
					//�ŏI�n�񂪕ς�����ꍇ
					if ((!_lastWorkInProcCd_new.equals(_lastWorkInProcCd)) || (_lastProcNo_new !=_lastProcNo)) {
						//�X�V��ŏI�n��̌n��ʎd�|�ŏI�n��t���O��ON�ɂ���
						updateStruct.setWORK_ODR_CD(this.struct.getWORK_ODR_CD());
						updateStruct.setWORK_IN_PROC_CD(_lastWorkInProcCd_new);
						updateStruct.setFINAL_PROC_FLG("1");
						entity.mUpdate_T_WORK_IN_PROC_BY_PROC_FINAL_PROC_FLG.update(conn, updateStruct);
			
						//�ŏI�n��̔[����i�ڕʎd�|�̔[������Ǝw�����ɔ��f
						//�i�ڕʎd�|�̔[���ɐݒ�
						updateStruct.setWORK_ODR_DLV_DATE_BY_ITEM_ALL(_lastDlvDate_new+_lastDlvDateTime_new);
						//�i�ڕʎd�|�̍�Ǝw�����ɐݒ�
						updateStruct.setOPR_INST_QTY(_lastOprInstQty_new);
						//�i�ڕʎd�|�����X�V�ł���Βʏ��Update Sql���Ăяo��
						if ( _procByItemUpdateStatus == 0 ) {        
							entity.mUpdate_T_WORK_IN_PROC_BY_ITEM_DLV_DATE.update(conn, updateStruct);
						} else {
							entity.mUpdate_T_WORK_IN_PROC_BY_ITEM_DLV_DATE2.update(conn, updateStruct);
						}
					}
				}
			}
			
			conn.commit();
				
			_procByItemUpdateStatus = 0;    //�i�ڕʎd�|�X�V�X�e�[�^�X������
			
			//��ʂ̍Č���
			controlSelect();

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
		logger.exiting("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
		
		
		controlInsert();


                //}}user_implement_dev:<controlUpdate>
		logger.exiting("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>


		try {
			setReadStatus(INITIAL);

			clearList();
			
			// [�M��]���𕔕i���擾
			this._sysHomeCurStruct = HomeCurControl.getData(this.conn);
			// [�Ŗ�]���𕔕i���擾			
			_taxNameStruct = TaxNameControl.getData(conn);


			//�R���{�{�b�N�X�̒��g���Z�b�g����
			// �R���{�{�b�N�X�f�[�^�𕔕i���擾
			ComboBox cdac = new ComboBox(conn, sysUSER_CD);
			_outsideTypStruct = cdac.getData("OUTSIDE_TYP");
			_unitCostTypStruct = cdac.getData("UNIT_COST_TYP");
			_acptInspcTypStruct = cdac.getData("ACPT_INSPC_TYP");
			cdac.setConnection(null);
			
			//�����Ǘ��p�����[�^�擾
			List listTimeCtrl = entity.mTIME_CTRL.read(conn,struct);
			if(listTimeCtrl == null || listTimeCtrl.size() <=0){
				struct.setTIME_CTRL("false");
				_flgTimeCtrl = "false";
			}else{
				struct.setTIME_CTRL(((AD0030020Struct)listTimeCtrl.get(0)).getTIME_CTRL());
				_flgTimeCtrl = struct.getTIME_CTRL();
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
		logger.exiting("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

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
		logger.entering("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
        try{
			ComboBox comboController = new ComboBox(conn, sysUSER_CD);
			OUTSIDE_TYP = comboController.getData(OUTSIDE_TYP_PARAMETER_NAME);
		}catch (Exception e){
			e.printStackTrace();
		}   
                
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AD0030020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Return") ) {
				controlReturn();
			} else if( button.equals("LineInsert") ) {
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
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>


		//�R���{�{�b�N�X�̃Z�b�g
		struct.setList_OUTSIDE_TYP_val(_outsideTypStruct.getValList());
		struct.setList_OUTSIDE_TYP_name(_outsideTypStruct.getExplanList());
		struct.setList_UNIT_COST_TYP_val(_unitCostTypStruct.getValList());
		struct.setList_UNIT_COST_TYP_name(_unitCostTypStruct.getExplanList());
		struct.setList_ACPT_INSPC_TYP_val(_acptInspcTypStruct.getValList());
		struct.setList_ACPT_INSPC_TYP_name(_acptInspcTypStruct.getExplanList());
		//�Ŗ��̃Z�b�g
		struct.setTAX_NAME_1(_taxNameStruct.getTAX_NAME_1());
		struct.setTAX_NAME_2(_taxNameStruct.getTAX_NAME_2());
		struct.setTAX_NAME_3(_taxNameStruct.getTAX_NAME_3());
		//�M�ݏ��̃Z�b�g
		struct.seth_HOME_DECIMAL_FIG(_sysHomeCurStruct.getDECIMAL_FIG());


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
//			throw new FoundationException("AD0030020Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0030020-E999","CSV�̏o�͏���"));
			throw new FoundationException("AD0030020Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0030020-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AD0030020Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0030020-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AD0030020Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AD0030020Entity entity;
	protected AD0030020Struct struct;
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

		entity = new AD0030020Entity();
		struct = new AD0030020Struct();

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
	 * AD0030020�N���X�̕W���R���X�g���N�^
	 */
	public AD0030020Control() throws BusinessProcessException, FoundationException
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
				AD0030020Struct key = (AD0030020Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_name") && key.getOUTSIDE_TYP_name() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_name", key.getOUTSIDE_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_val") && key.getOUTSIDE_TYP_val() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_val", key.getOUTSIDE_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP_name") && key.getACPT_INSPC_TYP_name() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP_name", key.getACPT_INSPC_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP_val") && key.getACPT_INSPC_TYP_val() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP_val", key.getACPT_INSPC_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("h_UNIT_COST_TYP") && key.geth_UNIT_COST_TYP() != null) {
					msgKey.setKeyValue("h_UNIT_COST_TYP", key.geth_UNIT_COST_TYP());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_name") && key.getUNIT_COST_TYP_name() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP_name", key.getUNIT_COST_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_val") && key.getUNIT_COST_TYP_val() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP_val", key.getUNIT_COST_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("h_PLANT_CD") && key.geth_PLANT_CD() != null) {
					msgKey.setKeyValue("h_PLANT_CD", key.geth_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("AFTER_DISC_AMOUNT") && key.getAFTER_DISC_AMOUNT() != null) {
					msgKey.setKeyValue("AFTER_DISC_AMOUNT", key.getAFTER_DISC_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PROVISIONAL_HOME_CUR_AMOUNT") && key.getPROVISIONAL_HOME_CUR_AMOUNT() != null) {
					msgKey.setKeyValue("PROVISIONAL_HOME_CUR_AMOUNT", key.getPROVISIONAL_HOME_CUR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("HOME_CUR_UNIT") && key.getHOME_CUR_UNIT() != null) {
					msgKey.setKeyValue("HOME_CUR_UNIT", key.getHOME_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("EXCH_RATE") && key.getEXCH_RATE() != null) {
					msgKey.setKeyValue("EXCH_RATE", key.getEXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT_1") && key.getTAX_AMOUNT_1() != null) {
					msgKey.setKeyValue("TAX_AMOUNT_1", key.getTAX_AMOUNT_1());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT_2") && key.getTAX_AMOUNT_2() != null) {
					msgKey.setKeyValue("TAX_AMOUNT_2", key.getTAX_AMOUNT_2());
				}
				if(msgKeyType.containsKeyColumn("AMOUNT_INCLUDE_TAX") && key.getAMOUNT_INCLUDE_TAX() != null) {
					msgKey.setKeyValue("AMOUNT_INCLUDE_TAX", key.getAMOUNT_INCLUDE_TAX());
				}
				if(msgKeyType.containsKeyColumn("h_HOME_DECIMAL_FIG") && key.geth_HOME_DECIMAL_FIG() != null) {
					msgKey.setKeyValue("h_HOME_DECIMAL_FIG", key.geth_HOME_DECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("h_TAX_RATE_1") && key.geth_TAX_RATE_1() != null) {
					msgKey.setKeyValue("h_TAX_RATE_1", key.geth_TAX_RATE_1());
				}
				if(msgKeyType.containsKeyColumn("h_TAX_RATE_2") && key.geth_TAX_RATE_2() != null) {
					msgKey.setKeyValue("h_TAX_RATE_2", key.geth_TAX_RATE_2());
				}
				if(msgKeyType.containsKeyColumn("h_TAX_RATE_3") && key.geth_TAX_RATE_3() != null) {
					msgKey.setKeyValue("h_TAX_RATE_3", key.geth_TAX_RATE_3());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT_3") && key.getTAX_AMOUNT_3() != null) {
					msgKey.setKeyValue("TAX_AMOUNT_3", key.getTAX_AMOUNT_3());
				}
				if(msgKeyType.containsKeyColumn("h_WORK_ODR_DLV_DATE_BY_PROC") && key.geth_WORK_ODR_DLV_DATE_BY_PROC() != null) {
					msgKey.setKeyValue("h_WORK_ODR_DLV_DATE_BY_PROC", key.geth_WORK_ODR_DLV_DATE_BY_PROC());
				}
				if(msgKeyType.containsKeyColumn("h_OPR_INST_START_DATE_BY_PROC") && key.geth_OPR_INST_START_DATE_BY_PROC() != null) {
					msgKey.setKeyValue("h_OPR_INST_START_DATE_BY_PROC", key.geth_OPR_INST_START_DATE_BY_PROC());
				}
				if(msgKeyType.containsKeyColumn("h_OPR_INST_QTY") && key.geth_OPR_INST_QTY() != null) {
					msgKey.setKeyValue("h_OPR_INST_QTY", key.geth_OPR_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("SelectUnitCostFlag") && key.getSelectUnitCostFlag() != null) {
					msgKey.setKeyValue("SelectUnitCostFlag", key.getSelectUnitCostFlag());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE_BY_ITEM_TIME") && key.getWORK_ODR_DLV_DATE_BY_ITEM_TIME() != null) {
					msgKey.setKeyValue("WORK_ODR_DLV_DATE_BY_ITEM_TIME", key.getWORK_ODR_DLV_DATE_BY_ITEM_TIME());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_BY_ITEM_TIME") && key.getOPR_INST_START_DATE_BY_ITEM_TIME() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATE_BY_ITEM_TIME", key.getOPR_INST_START_DATE_BY_ITEM_TIME());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_START_DATE_TIME") && key.geth_ODR_START_DATE_TIME() != null) {
					msgKey.setKeyValue("h_ODR_START_DATE_TIME", key.geth_ODR_START_DATE_TIME());
				}
				if(msgKeyType.containsKeyColumn("h_WORK_ODR_DLV_DATE_BY_PROC_TIME") && key.geth_WORK_ODR_DLV_DATE_BY_PROC_TIME() != null) {
					msgKey.setKeyValue("h_WORK_ODR_DLV_DATE_BY_PROC_TIME", key.geth_WORK_ODR_DLV_DATE_BY_PROC_TIME());
				}
				if(msgKeyType.containsKeyColumn("h_OPR_INST_START_DATE_BY_PROC_TIME") && key.geth_OPR_INST_START_DATE_BY_PROC_TIME() != null) {
					msgKey.setKeyValue("h_OPR_INST_START_DATE_BY_PROC_TIME", key.geth_OPR_INST_START_DATE_BY_PROC_TIME());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_CD") && key.getWORK_ODR_CD() != null) {
					msgKey.setKeyValue("WORK_ODR_CD", key.getWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
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
				if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE_BY_PROC") && key.getWORK_ODR_DLV_DATE_BY_PROC() != null) {
					msgKey.setKeyValue("WORK_ODR_DLV_DATE_BY_PROC", key.getWORK_ODR_DLV_DATE_BY_PROC());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_BY_ITEM") && key.getOPR_INST_START_DATE_BY_ITEM() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATE_BY_ITEM", key.getOPR_INST_START_DATE_BY_ITEM());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE_BY_ITEM") && key.getWORK_ODR_DLV_DATE_BY_ITEM() != null) {
					msgKey.setKeyValue("WORK_ODR_DLV_DATE_BY_ITEM", key.getWORK_ODR_DLV_DATE_BY_ITEM());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_BY_PROC") && key.getOPR_INST_START_DATE_BY_PROC() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATE_BY_PROC", key.getOPR_INST_START_DATE_BY_PROC());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_QTY") && key.getOPR_INST_QTY() != null) {
					msgKey.setKeyValue("OPR_INST_QTY", key.getOPR_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD") && key.getOPR_INST_CD() != null) {
					msgKey.setKeyValue("OPR_INST_CD", key.getOPR_INST_CD());
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
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT_BY_ITEM") && key.geth_MODIFY_COUNT_BY_ITEM() != null) {
					msgKey.setKeyValue("h_MODIFY_COUNT_BY_ITEM", key.geth_MODIFY_COUNT_BY_ITEM());
				}
				if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT_BY_PROC") && key.geth_MODIFY_COUNT_BY_PROC() != null) {
					msgKey.setKeyValue("h_MODIFY_COUNT_BY_PROC", key.geth_MODIFY_COUNT_BY_PROC());
				}
				if(msgKeyType.containsKeyColumn("WORK_STS_TYP") && key.getWORK_STS_TYP() != null) {
					msgKey.setKeyValue("WORK_STS_TYP", key.getWORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("PROC_EXPLOSION_FLG") && key.getPROC_EXPLOSION_FLG() != null) {
					msgKey.setKeyValue("PROC_EXPLOSION_FLG", key.getPROC_EXPLOSION_FLG());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
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
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP") && key.getACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP", key.getACPT_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("WS_NAME") && key.getWS_NAME() != null) {
					msgKey.setKeyValue("WS_NAME", key.getWS_NAME());
				}
				if(msgKeyType.containsKeyColumn("VEND_ANAME") && key.getVEND_ANAME() != null) {
					msgKey.setKeyValue("VEND_ANAME", key.getVEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("ROUND_TYP") && key.getROUND_TYP() != null) {
					msgKey.setKeyValue("ROUND_TYP", key.getROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("CUR_CD") && key.getCUR_CD() != null) {
					msgKey.setKeyValue("CUR_CD", key.getCUR_CD());
				}
				if(msgKeyType.containsKeyColumn("CUR_NAME") && key.getCUR_NAME() != null) {
					msgKey.setKeyValue("CUR_NAME", key.getCUR_NAME());
				}
				if(msgKeyType.containsKeyColumn("WORK_IN_PROC_COMMENT") && key.getWORK_IN_PROC_COMMENT() != null) {
					msgKey.setKeyValue("WORK_IN_PROC_COMMENT", key.getWORK_IN_PROC_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("h_UNIT_QTY_TYP") && key.geth_UNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("h_UNIT_QTY_TYP", key.geth_UNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_PARENT_OD_NO") && key.geth_PARENT_OD_NO() != null) {
					msgKey.setKeyValue("h_PARENT_OD_NO", key.geth_PARENT_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("h_COMPANY_CD") && key.geth_COMPANY_CD() != null) {
					msgKey.setKeyValue("h_COMPANY_CD", key.geth_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_START_DATE") && key.geth_ODR_START_DATE() != null) {
					msgKey.setKeyValue("h_ODR_START_DATE", key.geth_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO") && key.getJOB_ODR_DETAIL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_DETAIL_NO", key.getJOB_ODR_DETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("h_JOB_ODR_CANCEL_NO") && key.geth_JOB_ODR_CANCEL_NO() != null) {
					msgKey.setKeyValue("h_JOB_ODR_CANCEL_NO", key.geth_JOB_ODR_CANCEL_NO());
				}
				if(msgKeyType.containsKeyColumn("DUE_DATE") && key.getDUE_DATE() != null) {
					msgKey.setKeyValue("DUE_DATE", key.getDUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT_OPR_INST") && key.geth_MODIFY_COUNT_OPR_INST() != null) {
					msgKey.setKeyValue("h_MODIFY_COUNT_OPR_INST", key.geth_MODIFY_COUNT_OPR_INST());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_DN") && key.getOUTSIDE_TYP_DN() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_DN", key.getOUTSIDE_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_DN") && key.getMRP_ODR_TYP_DN() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_DN", key.getMRP_ODR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP") && key.getEXCH_TYP() != null) {
					msgKey.setKeyValue("EXCH_TYP", key.getEXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("VEND_CUR_UNIT") && key.getVEND_CUR_UNIT() != null) {
					msgKey.setKeyValue("VEND_CUR_UNIT", key.getVEND_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("h_VEND_DECIMAL_FIG") && key.geth_VEND_DECIMAL_FIG() != null) {
					msgKey.setKeyValue("h_VEND_DECIMAL_FIG", key.geth_VEND_DECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD_GNR_TYP") && key.getOPR_INST_CD_GNR_TYP() != null) {
					msgKey.setKeyValue("OPR_INST_CD_GNR_TYP", key.getOPR_INST_CD_GNR_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_OD_NO") && key.geth_OD_NO() != null) {
					msgKey.setKeyValue("h_OD_NO", key.geth_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE_BY_PROC_ALL") && key.getWORK_ODR_DLV_DATE_BY_PROC_ALL() != null) {
					msgKey.setKeyValue("WORK_ODR_DLV_DATE_BY_PROC_ALL", key.getWORK_ODR_DLV_DATE_BY_PROC_ALL());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_BY_PROC_ALL") && key.getOPR_INST_START_DATE_BY_PROC_ALL() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATE_BY_PROC_ALL", key.getOPR_INST_START_DATE_BY_PROC_ALL());
				}
				if(msgKeyType.containsKeyColumn("h_WORK_STS_TYP") && key.geth_WORK_STS_TYP() != null) {
					msgKey.setKeyValue("h_WORK_STS_TYP", key.geth_WORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("FINAL_PROC_FLG") && key.getFINAL_PROC_FLG() != null) {
					msgKey.setKeyValue("FINAL_PROC_FLG", key.getFINAL_PROC_FLG());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT_BY_PROC") && key.getMODIFY_COUNT_BY_PROC() != null) {
					msgKey.setKeyValue("MODIFY_COUNT_BY_PROC", key.getMODIFY_COUNT_BY_PROC());
				}
				if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_DATE") && key.geth_BUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("h_BUSINESS_OPR_DATE", key.geth_BUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("CAL_DATE") && key.getCAL_DATE() != null) {
					msgKey.setKeyValue("CAL_DATE", key.getCAL_DATE());
				}
				if(msgKeyType.containsKeyColumn("CAL_NO") && key.getCAL_NO() != null) {
					msgKey.setKeyValue("CAL_NO", key.getCAL_NO());
				}
				if(msgKeyType.containsKeyColumn("CHECK_DATE") && key.getCHECK_DATE() != null) {
					msgKey.setKeyValue("CHECK_DATE", key.getCHECK_DATE());
				}
				if(msgKeyType.containsKeyColumn("WS_PLANT_CD") && key.getWS_PLANT_CD() != null) {
					msgKey.setKeyValue("WS_PLANT_CD", key.getWS_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT_OPR_INST") && key.getMODIFY_COUNT_OPR_INST() != null) {
					msgKey.setKeyValue("MODIFY_COUNT_OPR_INST", key.getMODIFY_COUNT_OPR_INST());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_BY_PROC_TIME") && key.getOPR_INST_START_DATE_BY_PROC_TIME() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATE_BY_PROC_TIME", key.getOPR_INST_START_DATE_BY_PROC_TIME());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE_BY_PROC_TIME") && key.getWORK_ODR_DLV_DATE_BY_PROC_TIME() != null) {
					msgKey.setKeyValue("WORK_ODR_DLV_DATE_BY_PROC_TIME", key.getWORK_ODR_DLV_DATE_BY_PROC_TIME());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_BY_ITEM_ALL") && key.getOPR_INST_START_DATE_BY_ITEM_ALL() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATE_BY_ITEM_ALL", key.getOPR_INST_START_DATE_BY_ITEM_ALL());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE_BY_ITEM_ALL") && key.getWORK_ODR_DLV_DATE_BY_ITEM_ALL() != null) {
					msgKey.setKeyValue("WORK_ODR_DLV_DATE_BY_ITEM_ALL", key.getWORK_ODR_DLV_DATE_BY_ITEM_ALL());
				}
				if(msgKeyType.containsKeyColumn("LOWER_OD_NO") && key.getLOWER_OD_NO() != null) {
					msgKey.setKeyValue("LOWER_OD_NO", key.getLOWER_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP") && key.getJOB_ODR_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP", key.getJOB_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE") && key.getJOB_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("JOB_ODR_DLV_DATE", key.getJOB_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE_TIME") && key.getJOB_ODR_DLV_DATE_TIME() != null) {
					msgKey.setKeyValue("JOB_ODR_DLV_DATE_TIME", key.getJOB_ODR_DLV_DATE_TIME());
				}
				if(msgKeyType.containsKeyColumn("h_JOB_ODR_CD") && key.geth_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("h_JOB_ODR_CD", key.geth_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT_BY_ITEM") && key.getMODIFY_COUNT_BY_ITEM() != null) {
					msgKey.setKeyValue("MODIFY_COUNT_BY_ITEM", key.getMODIFY_COUNT_BY_ITEM());
				}
				if(msgKeyType.containsKeyColumn("TAX_NAME_1") && key.getTAX_NAME_1() != null) {
					msgKey.setKeyValue("TAX_NAME_1", key.getTAX_NAME_1());
				}
				if(msgKeyType.containsKeyColumn("TAX_NAME_2") && key.getTAX_NAME_2() != null) {
					msgKey.setKeyValue("TAX_NAME_2", key.getTAX_NAME_2());
				}
				if(msgKeyType.containsKeyColumn("TAX_NAME_3") && key.getTAX_NAME_3() != null) {
					msgKey.setKeyValue("TAX_NAME_3", key.getTAX_NAME_3());
				}
				if(msgKeyType.containsKeyColumn("h_MANHOUR_TYP") && key.geth_MANHOUR_TYP() != null) {
					msgKey.setKeyValue("h_MANHOUR_TYP", key.geth_MANHOUR_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_START_DATE_ALL") && key.geth_ODR_START_DATE_ALL() != null) {
					msgKey.setKeyValue("h_ODR_START_DATE_ALL", key.geth_ODR_START_DATE_ALL());
				}
				if(msgKeyType.containsKeyColumn("DUE_DATE_TIME") && key.getDUE_DATE_TIME() != null) {
					msgKey.setKeyValue("DUE_DATE_TIME", key.getDUE_DATE_TIME());
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
					AD0030020Struct key = new AD0030020Struct();
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_name")) {
						key.setOUTSIDE_TYP_name(msgKey.getKeyValue("OUTSIDE_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_val")) {
						key.setOUTSIDE_TYP_val(msgKey.getKeyValue("OUTSIDE_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP_name")) {
						key.setACPT_INSPC_TYP_name(msgKey.getKeyValue("ACPT_INSPC_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP_val")) {
						key.setACPT_INSPC_TYP_val(msgKey.getKeyValue("ACPT_INSPC_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("h_UNIT_COST_TYP")) {
						key.seth_UNIT_COST_TYP(msgKey.getKeyValue("h_UNIT_COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_name")) {
						key.setUNIT_COST_TYP_name(msgKey.getKeyValue("UNIT_COST_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_val")) {
						key.setUNIT_COST_TYP_val(msgKey.getKeyValue("UNIT_COST_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("h_PLANT_CD")) {
						key.seth_PLANT_CD(msgKey.getKeyValue("h_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("AFTER_DISC_AMOUNT")) {
						key.setAFTER_DISC_AMOUNT(msgKey.getKeyValue("AFTER_DISC_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PROVISIONAL_HOME_CUR_AMOUNT")) {
						key.setPROVISIONAL_HOME_CUR_AMOUNT(msgKey.getKeyValue("PROVISIONAL_HOME_CUR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("HOME_CUR_UNIT")) {
						key.setHOME_CUR_UNIT(msgKey.getKeyValue("HOME_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_RATE")) {
						key.setEXCH_RATE(msgKey.getKeyValue("EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT_1")) {
						key.setTAX_AMOUNT_1(msgKey.getKeyValue("TAX_AMOUNT_1"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT_2")) {
						key.setTAX_AMOUNT_2(msgKey.getKeyValue("TAX_AMOUNT_2"));
					}
					if(msgKeyType.containsKeyColumn("AMOUNT_INCLUDE_TAX")) {
						key.setAMOUNT_INCLUDE_TAX(msgKey.getKeyValue("AMOUNT_INCLUDE_TAX"));
					}
					if(msgKeyType.containsKeyColumn("h_HOME_DECIMAL_FIG")) {
						key.seth_HOME_DECIMAL_FIG(msgKey.getKeyValue("h_HOME_DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("h_TAX_RATE_1")) {
						key.seth_TAX_RATE_1(msgKey.getKeyValue("h_TAX_RATE_1"));
					}
					if(msgKeyType.containsKeyColumn("h_TAX_RATE_2")) {
						key.seth_TAX_RATE_2(msgKey.getKeyValue("h_TAX_RATE_2"));
					}
					if(msgKeyType.containsKeyColumn("h_TAX_RATE_3")) {
						key.seth_TAX_RATE_3(msgKey.getKeyValue("h_TAX_RATE_3"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT_3")) {
						key.setTAX_AMOUNT_3(msgKey.getKeyValue("TAX_AMOUNT_3"));
					}
					if(msgKeyType.containsKeyColumn("h_WORK_ODR_DLV_DATE_BY_PROC")) {
						key.seth_WORK_ODR_DLV_DATE_BY_PROC(msgKey.getKeyValue("h_WORK_ODR_DLV_DATE_BY_PROC"));
					}
					if(msgKeyType.containsKeyColumn("h_OPR_INST_START_DATE_BY_PROC")) {
						key.seth_OPR_INST_START_DATE_BY_PROC(msgKey.getKeyValue("h_OPR_INST_START_DATE_BY_PROC"));
					}
					if(msgKeyType.containsKeyColumn("h_OPR_INST_QTY")) {
						key.seth_OPR_INST_QTY(msgKey.getKeyValue("h_OPR_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SelectUnitCostFlag")) {
						key.setSelectUnitCostFlag(msgKey.getKeyValue("SelectUnitCostFlag"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE_BY_ITEM_TIME")) {
						key.setWORK_ODR_DLV_DATE_BY_ITEM_TIME(msgKey.getKeyValue("WORK_ODR_DLV_DATE_BY_ITEM_TIME"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_BY_ITEM_TIME")) {
						key.setOPR_INST_START_DATE_BY_ITEM_TIME(msgKey.getKeyValue("OPR_INST_START_DATE_BY_ITEM_TIME"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_START_DATE_TIME")) {
						key.seth_ODR_START_DATE_TIME(msgKey.getKeyValue("h_ODR_START_DATE_TIME"));
					}
					if(msgKeyType.containsKeyColumn("h_WORK_ODR_DLV_DATE_BY_PROC_TIME")) {
						key.seth_WORK_ODR_DLV_DATE_BY_PROC_TIME(msgKey.getKeyValue("h_WORK_ODR_DLV_DATE_BY_PROC_TIME"));
					}
					if(msgKeyType.containsKeyColumn("h_OPR_INST_START_DATE_BY_PROC_TIME")) {
						key.seth_OPR_INST_START_DATE_BY_PROC_TIME(msgKey.getKeyValue("h_OPR_INST_START_DATE_BY_PROC_TIME"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_CD")) {
						key.setWORK_ODR_CD(msgKey.getKeyValue("WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
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
					if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE_BY_PROC")) {
						key.setWORK_ODR_DLV_DATE_BY_PROC(msgKey.getKeyValue("WORK_ODR_DLV_DATE_BY_PROC"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_BY_ITEM")) {
						key.setOPR_INST_START_DATE_BY_ITEM(msgKey.getKeyValue("OPR_INST_START_DATE_BY_ITEM"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE_BY_ITEM")) {
						key.setWORK_ODR_DLV_DATE_BY_ITEM(msgKey.getKeyValue("WORK_ODR_DLV_DATE_BY_ITEM"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_BY_PROC")) {
						key.setOPR_INST_START_DATE_BY_PROC(msgKey.getKeyValue("OPR_INST_START_DATE_BY_PROC"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_QTY")) {
						key.setOPR_INST_QTY(msgKey.getKeyValue("OPR_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(msgKey.getKeyValue("OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD")) {
						key.setOPR_INST_CD(msgKey.getKeyValue("OPR_INST_CD"));
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
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT_BY_ITEM")) {
						key.seth_MODIFY_COUNT_BY_ITEM(msgKey.getKeyValue("h_MODIFY_COUNT_BY_ITEM"));
					}
					if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT_BY_PROC")) {
						key.seth_MODIFY_COUNT_BY_PROC(msgKey.getKeyValue("h_MODIFY_COUNT_BY_PROC"));
					}
					if(msgKeyType.containsKeyColumn("WORK_STS_TYP")) {
						key.setWORK_STS_TYP(msgKey.getKeyValue("WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PROC_EXPLOSION_FLG")) {
						key.setPROC_EXPLOSION_FLG(msgKey.getKeyValue("PROC_EXPLOSION_FLG"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
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
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP")) {
						key.setACPT_INSPC_TYP(msgKey.getKeyValue("ACPT_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("WS_NAME")) {
						key.setWS_NAME(msgKey.getKeyValue("WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("VEND_ANAME")) {
						key.setVEND_ANAME(msgKey.getKeyValue("VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("ROUND_TYP")) {
						key.setROUND_TYP(msgKey.getKeyValue("ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CUR_CD")) {
						key.setCUR_CD(msgKey.getKeyValue("CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUR_NAME")) {
						key.setCUR_NAME(msgKey.getKeyValue("CUR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WORK_IN_PROC_COMMENT")) {
						key.setWORK_IN_PROC_COMMENT(msgKey.getKeyValue("WORK_IN_PROC_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_UNIT_QTY_TYP")) {
						key.seth_UNIT_QTY_TYP(msgKey.getKeyValue("h_UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_PARENT_OD_NO")) {
						key.seth_PARENT_OD_NO(msgKey.getKeyValue("h_PARENT_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_COMPANY_CD")) {
						key.seth_COMPANY_CD(msgKey.getKeyValue("h_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_START_DATE")) {
						key.seth_ODR_START_DATE(msgKey.getKeyValue("h_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO")) {
						key.setJOB_ODR_DETAIL_NO(msgKey.getKeyValue("JOB_ODR_DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_JOB_ODR_CANCEL_NO")) {
						key.seth_JOB_ODR_CANCEL_NO(msgKey.getKeyValue("h_JOB_ODR_CANCEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("DUE_DATE")) {
						key.setDUE_DATE(msgKey.getKeyValue("DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT_OPR_INST")) {
						key.seth_MODIFY_COUNT_OPR_INST(msgKey.getKeyValue("h_MODIFY_COUNT_OPR_INST"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_DN")) {
						key.setOUTSIDE_TYP_DN(msgKey.getKeyValue("OUTSIDE_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_DN")) {
						key.setMRP_ODR_TYP_DN(msgKey.getKeyValue("MRP_ODR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP")) {
						key.setEXCH_TYP(msgKey.getKeyValue("EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CUR_UNIT")) {
						key.setVEND_CUR_UNIT(msgKey.getKeyValue("VEND_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("h_VEND_DECIMAL_FIG")) {
						key.seth_VEND_DECIMAL_FIG(msgKey.getKeyValue("h_VEND_DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD_GNR_TYP")) {
						key.setOPR_INST_CD_GNR_TYP(msgKey.getKeyValue("OPR_INST_CD_GNR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_OD_NO")) {
						key.seth_OD_NO(msgKey.getKeyValue("h_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE_BY_PROC_ALL")) {
						key.setWORK_ODR_DLV_DATE_BY_PROC_ALL(msgKey.getKeyValue("WORK_ODR_DLV_DATE_BY_PROC_ALL"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_BY_PROC_ALL")) {
						key.setOPR_INST_START_DATE_BY_PROC_ALL(msgKey.getKeyValue("OPR_INST_START_DATE_BY_PROC_ALL"));
					}
					if(msgKeyType.containsKeyColumn("h_WORK_STS_TYP")) {
						key.seth_WORK_STS_TYP(msgKey.getKeyValue("h_WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("FINAL_PROC_FLG")) {
						key.setFINAL_PROC_FLG(msgKey.getKeyValue("FINAL_PROC_FLG"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT_BY_PROC")) {
						key.setMODIFY_COUNT_BY_PROC(msgKey.getKeyValue("MODIFY_COUNT_BY_PROC"));
					}
					if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_DATE")) {
						key.seth_BUSINESS_OPR_DATE(msgKey.getKeyValue("h_BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("CAL_DATE")) {
						key.setCAL_DATE(msgKey.getKeyValue("CAL_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CAL_NO")) {
						key.setCAL_NO(msgKey.getKeyValue("CAL_NO"));
					}
					if(msgKeyType.containsKeyColumn("CHECK_DATE")) {
						key.setCHECK_DATE(msgKey.getKeyValue("CHECK_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WS_PLANT_CD")) {
						key.setWS_PLANT_CD(msgKey.getKeyValue("WS_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT_OPR_INST")) {
						key.setMODIFY_COUNT_OPR_INST(msgKey.getKeyValue("MODIFY_COUNT_OPR_INST"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_BY_PROC_TIME")) {
						key.setOPR_INST_START_DATE_BY_PROC_TIME(msgKey.getKeyValue("OPR_INST_START_DATE_BY_PROC_TIME"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE_BY_PROC_TIME")) {
						key.setWORK_ODR_DLV_DATE_BY_PROC_TIME(msgKey.getKeyValue("WORK_ODR_DLV_DATE_BY_PROC_TIME"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_BY_ITEM_ALL")) {
						key.setOPR_INST_START_DATE_BY_ITEM_ALL(msgKey.getKeyValue("OPR_INST_START_DATE_BY_ITEM_ALL"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE_BY_ITEM_ALL")) {
						key.setWORK_ODR_DLV_DATE_BY_ITEM_ALL(msgKey.getKeyValue("WORK_ODR_DLV_DATE_BY_ITEM_ALL"));
					}
					if(msgKeyType.containsKeyColumn("LOWER_OD_NO")) {
						key.setLOWER_OD_NO(msgKey.getKeyValue("LOWER_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP")) {
						key.setJOB_ODR_TYP(msgKey.getKeyValue("JOB_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE")) {
						key.setJOB_ODR_DLV_DATE(msgKey.getKeyValue("JOB_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE_TIME")) {
						key.setJOB_ODR_DLV_DATE_TIME(msgKey.getKeyValue("JOB_ODR_DLV_DATE_TIME"));
					}
					if(msgKeyType.containsKeyColumn("h_JOB_ODR_CD")) {
						key.seth_JOB_ODR_CD(msgKey.getKeyValue("h_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT_BY_ITEM")) {
						key.setMODIFY_COUNT_BY_ITEM(msgKey.getKeyValue("MODIFY_COUNT_BY_ITEM"));
					}
					if(msgKeyType.containsKeyColumn("TAX_NAME_1")) {
						key.setTAX_NAME_1(msgKey.getKeyValue("TAX_NAME_1"));
					}
					if(msgKeyType.containsKeyColumn("TAX_NAME_2")) {
						key.setTAX_NAME_2(msgKey.getKeyValue("TAX_NAME_2"));
					}
					if(msgKeyType.containsKeyColumn("TAX_NAME_3")) {
						key.setTAX_NAME_3(msgKey.getKeyValue("TAX_NAME_3"));
					}
					if(msgKeyType.containsKeyColumn("h_MANHOUR_TYP")) {
						key.seth_MANHOUR_TYP(msgKey.getKeyValue("h_MANHOUR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_START_DATE_ALL")) {
						key.seth_ODR_START_DATE_ALL(msgKey.getKeyValue("h_ODR_START_DATE_ALL"));
					}
					if(msgKeyType.containsKeyColumn("DUE_DATE_TIME")) {
						key.setDUE_DATE_TIME(msgKey.getKeyValue("DUE_DATE_TIME"));
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
