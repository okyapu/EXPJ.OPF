/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KR0070/src/com/nec/jp/orteus/metamorBase/KR0070/KR0070010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KR0070;

import com.nec.jp.orteus.metamorBase.KR0070.*;
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
import java.math.BigDecimal;

import com.nec.jp.orteus.expj.sa.amount.SaAmountCalculator;
import com.nec.jp.orteus.metamorBase.common04.amount.AmountCalculator;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateControl;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateStruct;
import com.nec.jp.orteus.metamorBase.common06.ExchAmount.*;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : KR0070010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: zhou-kehong $
 * @version $Revision: 1.3 $ $Date: 2015/03/24 09:32:59 $
 *
 */
//}}user_implement_code_header

public class KR0070010Control
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
	public KR0070010Struct getListvalue(int x) { return (KR0070010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public KR0070010Struct getStruct() { return this.struct; }	// Struct�̒l��Ԃ��܂��B
	public KR0070010Struct createStruct() { return new KR0070010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((KR0070010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
	
	// ���s���t���O
	protected String _explannerFlag = "";
	public void setExplannerFlag(String flag) { this._explannerFlag = flag; };
	public String getExplannerFlag() { return this._explannerFlag; };
	
	
	// �Ɩ��p�̉�ЃR�[�h 
	protected String _sysCOMPANY_CD;
	public void setsysCOMPANY_CD(String name) { this._sysCOMPANY_CD = name; };
	public String getsysCOMPANY_CD() { return this._sysCOMPANY_CD; };
	
	// �̔��p�̍H��R�[�h 
	protected String _salesPLANT_CD;
	public void setSalesPLANT_CD(String name) { this._salesPLANT_CD = name; };
	public String getSalesPLANT_CD() { return this._salesPLANT_CD; };
	
	// ���ʕ��i�N���X
	private Common common = null;
	
	/* �萔��` */
	static final int STATUS_NORMAL = 1; // ���ʃX�e�[�^�X(1:����I��)

	static final int STATUS_WARNING = 2; // ���ʃX�e�[�^�X(2:�x���I��)

	static final int STATUS_ERROR = 3; // ���ʃX�e�[�^�X(3:�ُ�I��)
	
	/** �ʉݏ������� */
	private int decimalFig = 0;
	
	private String _businessOprDate = null; // �Ɩ��^�p��
	/**
	 * �Ɩ��^�p���ݒ�
	 * 
	 * @param businessOprDate
	 *            �Ɩ��^�p��
	 */
	public void setBusinessOprDate(String businessOprDate) {
		_businessOprDate = businessOprDate;
	}

	/**
	 * �Ɩ��^�p���擾
	 * 
	 * @return String
	 */
	public String getBusinessOprDate() {
		return _businessOprDate;
	}
	
	private String _homeCurCd = null; // �M�݃R�[�h
	/**
	 * �M�݃R�[�h�ݒ�
	 * 
	 * @param homeCurCd
	 *            �M�݃R�[�h
	 */
	public void setHomeCurCd(String homeCurCd) {
		_homeCurCd = homeCurCd;
	}

	/**
	 * �M�݃R�[�h�擾
	 * 
	 * @return String
	 */
	public String getHomeCurCd() {
		return _homeCurCd;
	}
	
	/** �i�ږ��̊���l */
	private String _itemName = null; 
	/**
	 * �i�ږ��ݒ�
	 * 
	 * @param itemName
	 *            �i�ږ�
	 */
	public void setItemName(String itemName) {
		_itemName = itemName;
	}

	/**
	 * �i�ږ��擾
	 * 
	 * @return String
	 */
	public String getItemName() {
		return _itemName;
	}
	//Add NEC 2014.06.18 STR
	 // ----- �V�X�e���ݒ�l�擾 ---------------	
    private PrivateConfig privateConfig;
		
	/** �I�����F */
    	String aprSales = "";	
	//Add NEC 2014.06.18 END	
		
	/** Ai���A�g�t���O */
	private String _installFlg;
	
	/**
	 * Ai���A�g�t���O�ݒ�
	 * @param flag
	 */
	public void setInstallFlg (String flag) {
		_installFlg = flag;
	}
	
	/**
	 * Ai���A�g�t���O�擾
	 * @return
	 */
	public String getInstallFlg () {
		return _installFlg;
	}
	
	/**
	 * ���󒍔ԍ��̕\����
	 */
	private String _lbORGN_ODR_NO;
	
	/**
	 * ���󒍔ԍ��̕\�����ݒ�
	 * @param str
	 */
	public void setlbORGN_ODR_NO (String str) {
		_lbORGN_ODR_NO = str;
	}
	
	/**
	 * ���󒍔ԍ��̕\�����擾
	 * @return
	 */
	public String getlbORGN_ODR_NO () {
		return _lbORGN_ODR_NO;
	}
	
	
	/**
	 * Exception���b�Z�[�W�ݒ�
	 * @param �L�[����
	 */
	private void setExpjExceptionMsg(Exception e) throws ExpjException
	{
		// �G���[���b�Z�[�W�쐬
		ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
		sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
		ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
		throw ee;
	}
	
	
	/**
	 * �Ɩ����W�b�N�̃C���t�H���[�V�������b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * 
	 * @param code
	 *            ���b�Z�[�W�R�[�h
	 */
	private void setInformationMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addInfo(emsg);
	}

	/**
	 * �Ɩ����W�b�N�̃��[�j���O���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * 
	 * @param code
	 *            ���b�Z�[�W�R�[�h
	 */
	private void setWarningMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addWarn(emsg);
		sysLog.info(emsg, sysUSER_CD);
	}

	/**
	 * �Ɩ����W�b�N�̃��[�j���O���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * 
	 * @param code
	 *            ���b�Z�[�W�R�[�h
	 * @param value1
	 *            �u��������P
	 */
	private void setWarningMessage(String code, String value1) {
		ExpjMessage emsg = new ExpjMessage(code, value1);
		msgStruct.addWarn(emsg);
		sysLog.info(emsg, sysUSER_CD);
	}

	/**
	 * �Ɩ����W�b�N�̃G���[���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * 
	 * @param code
	 *            ���b�Z�[�W�R�[�h
	 */
	private void setErrorMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, sysUSER_CD);
	}

	/**
	 * �Ɩ����W�b�N�̃G���[���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * 
	 * @param code
	 *            ���b�Z�[�W�R�[�h
	 * @param value1
	 *            �u��������P
	 */
	private void setErrorMessage(String code, String value1) {
		ExpjMessage emsg = new ExpjMessage(code, value1);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, sysUSER_CD);
	}
	
	
	/**
	 * ��ʂ̑S���ڂ����������܂��B
	 */
	private void initializeAll() {
		// �󒍔ԍ�
		struct.setODR_NO(null);
		struct.seth_ODR_NO(null);
		// �`�[�ԍ�
		struct.setSLIP_CD(null);
		struct.seth_SLIP_CD(null);
		// �o�^
		struct.setrdoInsert("true");
		struct.seth_rdoInsert("true");
		// �X�V�E�폜
		struct.setrdoUpdateDelete("false");
		// �X�V��
		struct.setMODIFY_COUNT(null);
		struct.setH_MODIFY_COUNT(null);
		struct.setODR_MODIFY_COUNT(null);
		
		initializeDetail();
	}
	
	/**
	 * ��ʂ̏ڍ׍��ڂ����������܂��B
	 */
	private void initializeDetail() {
		// ���󒍔ԍ�
		struct.setlbORGN_ODR_NO(null);
		struct.setORGN_ODR_NO(null);
		// ���z��
		struct.seth_ADD_ODR_FLG(null);
		struct.setaddAmountOrder(null);
		// ���Ӑ撍���ԍ�
		struct.setCUST_ODR_NO(null);
		// ���Ӑ�R�[�h
		struct.setCUST_CD(null);
		// ���Ӑ於
		struct.setCUST_NAME(null);
		// Ai���|�C���^�t�F�[�X�t���O
		struct.setAI_AR_IF_FLG(null);
		// �ʉ݃R�[�h
		struct.seth_CUR_CD(null);
		// �i�ڔԍ�
		struct.setITEM_CD(null);
		// �i�ږ�
		struct.setITEM_NAME(null);
		// �w��[��
		struct.setDESINATED_DLV_DATE(null);
		// ����v���
		struct.setSALES_DATE(null);
		// ����v�㕔��
		struct.setSALES_DEPT_CD(null);
		// ����v�㕔�喼
		struct.setORG_NAME(null);
		// �c�ƒS���҃R�[�h
		struct.setCUST_CHRG_PSN_CD(null);
		// �c�ƒS���Җ�
		struct.setUSER_NAME(null);
		// ����P��
		struct.setSALES_UNIT_PRICE("0");
		struct.setCUR_UNIT_PRICE(null);
		// ������ѐ���
		struct.setSALES_QTY("0");
		struct.setSTOCK_UNIT(null);
		// ������z
		struct.setSALES_AMOUNT("0");
		struct.setCUR_UNIT_AMOUNT(null);
		// ����ŃR�[�h
		struct.setTAX_CD(null);
		struct.seth_TAX_CD(null);
		// �󒍐���
		struct.setODR_QTY("0");
		struct.setSTOCK_UNIT(null);
		// �󒍓�
		struct.setODR_ACPT_DATE(null);
		// ���l
		struct.setREMARKS(null);
		
		list = null;
		readStatus = INITIAL;
	}
	
	/**
	 * ��ʂ̏ڍ׍��ڂ����������܂��B
	 */
	private void setShowValue(KR0070010Struct beforeStruct, KR0070010Struct afterStruct) {
		// ������ъǗ��ԍ�
		beforeStruct.seth_SALES_SEQ_NO(afterStruct.geth_SALES_SEQ_NO());
		// ������ѓ`�[�ԍ�(Jf)
		beforeStruct.seth_SALES_H_NO(afterStruct.geth_SALES_H_NO());
		// ���󒍔ԍ�
		beforeStruct.setORGN_ODR_NO(afterStruct.getORGN_ODR_NO());
		// ���󒍔ԍ��̕\����
		beforeStruct.setlbORGN_ODR_NO(getlbORGN_ODR_NO());
		// ���z��
		beforeStruct.seth_ADD_ODR_FLG(afterStruct.geth_ADD_ODR_FLG());
		if ("1".equals(afterStruct.geth_ADD_ODR_FLG())) {
			beforeStruct.setaddAmountOrder("true");
		} else {
			beforeStruct.setaddAmountOrder("");
		}
		// ���Ӑ撍���ԍ�
		beforeStruct.setCUST_ODR_NO(afterStruct.getCUST_ODR_NO());
		// ���Ӑ�R�[�h
		beforeStruct.setCUST_CD(afterStruct.getCUST_CD());
		// ���Ӑ於
		beforeStruct.setCUST_NAME(afterStruct.getCUST_NAME());
		// �i�ڔԍ�
		beforeStruct.setITEM_CD(afterStruct.getITEM_CD());
		// �i�ږ�
		beforeStruct.setITEM_NAME(afterStruct.getITEM_NAME());
		// �w��[��
		beforeStruct.setDESINATED_DLV_DATE(afterStruct.getDESINATED_DLV_DATE());
		// ����v���
		beforeStruct.setSALES_DATE(afterStruct.getSALES_DATE());
		// ����v�㕔��
		beforeStruct.setSALES_DEPT_CD(afterStruct.getSALES_DEPT_CD());
		// ����v�㕔�喼
		beforeStruct.setORG_NAME(afterStruct.getORG_NAME());
		// �c�ƒS���҃R�[�h
		beforeStruct.setCUST_CHRG_PSN_CD(afterStruct.getCUST_CHRG_PSN_CD());
		// �c�ƒS���Җ�
		beforeStruct.setUSER_NAME(afterStruct.getUSER_NAME());
		// ���s�S���҃R�[�h
		beforeStruct.setODR_ACPT_PSN_CD(afterStruct.getODR_ACPT_PSN_CD());
		// ����P��
		beforeStruct.setSALES_UNIT_PRICE(afterStruct.getSALES_UNIT_PRICE());
		beforeStruct.setCUR_UNIT_PRICE(afterStruct.getCUR_UNIT_PRICE());
		// ������ѐ���
		if ("true".equals(struct.getrdoInsert())) {
			beforeStruct.setSALES_QTY(afterStruct.getODR_QTY());
			beforeStruct.setSTOCK_UNIT(afterStruct.getSTOCK_UNIT_ODR());
		} else {
			beforeStruct.setSALES_QTY(afterStruct.getSALES_QTY());
			beforeStruct.setSTOCK_UNIT(afterStruct.getSTOCK_UNIT());
		}
		// ������z
		beforeStruct.setSALES_AMOUNT(afterStruct.getSALES_AMOUNT());
		beforeStruct.setCUR_UNIT_AMOUNT(afterStruct.getCUR_UNIT_PRICE());
		// ����ŃR�[�h
		beforeStruct.setTAX_CD(afterStruct.getTAX_CD());
		beforeStruct.seth_TAX_CD(afterStruct.getTAX_CD());
		// �󒍐���
		beforeStruct.setODR_QTY(afterStruct.getODR_QTY());
		beforeStruct.setSTOCK_UNIT_ODR(afterStruct.getSTOCK_UNIT_ODR());
		// �󒍓�
		beforeStruct.setODR_ACPT_DATE(afterStruct.getODR_ACPT_DATE());
		// ���l
		beforeStruct.setREMARKS(afterStruct.getREMARKS());
		// Ai���|�C���^�t�F�[�X�t���O
		beforeStruct.setAI_AR_IF_FLG(afterStruct.getAI_AR_IF_FLG());
		
		// �X�V��
		beforeStruct.setMODIFY_COUNT(afterStruct.getMODIFY_COUNT());
		beforeStruct.setH_MODIFY_COUNT(afterStruct.getH_MODIFY_COUNT());
		// ��݌Ɏ󒍍X�V��
		beforeStruct.setODR_MODIFY_COUNT(afterStruct.getODR_MODIFY_COUNT());
		
		beforeStruct.setBUSINESS_OPR_DATE(getBusinessOprDate());
		
		beforeStruct.seth_ODR_NO(beforeStruct.getODR_NO());
		beforeStruct.seth_SLIP_CD(beforeStruct.getSLIP_CD());
		beforeStruct.seth_rdoInsert(beforeStruct.getrdoInsert());
		
	}
	
	/**
	 * ���|�������Ɣ��|���g�����w�b�_�`�F�b�N
	 * @throws BusinessProcessException
	 * @throws FoundationException
	 */
	private void checkT_AR_LEDGER_H() throws BusinessProcessException, FoundationException {
		// ��ЃR�[�h
		struct.setCOMPANY_CD(getsysCOMPANY_CD());
		try {
			boolean checkFlag = false;
			List checkList = new ArrayList();
			// Ai�A�g����
			if (!"1".equals(getInstallFlg())){
				// �T�u�V�X�e�����C���X�g�[������Ă���
				checkList = entity.mSYS_INSTALL_OPTIONS_B.read(conn, struct);
				if (!checkList.isEmpty()) {
					checkFlag = true;
				}
			} else {
				checkFlag = true;
			}
			
			
			if (checkFlag) {
				if ("Ja".equals(getExplannerFlag()) || "JaScm".equals(getExplannerFlag())) {
					if ("Ja".equals(getExplannerFlag())) {
						checkList = entity.mT_SALES_Ja.read(conn, struct);
					} else {
						checkList = entity.mT_SALES_JaScm.read(conn, struct);
					}
					if (checkList.isEmpty()) {
						return;
					}
				}
				// ���|���g�����w�b�_
				if ("Jf".equals(getExplannerFlag())) {
					checkList = entity.mT_AR_LEDGER_H_TRN_Jf.read(conn, struct);
				} else {
					struct.setSLIP_TYP("14");
					checkList = entity.mT_AR_LEDGER_H_TRN.read(conn, struct);
				}
				if (checkList.isEmpty()) {
					// ���|�������w�b�_
					if ("Jf".equals(getExplannerFlag())) {	
						checkList = entity.mT_AR_LEDGER_H_Jf.read(conn, struct);
					} else {
						checkList = entity.mT_AR_LEDGER_H.read(conn, struct);
					}
					if (checkList.isEmpty()) {
						setErrorMessage("BD00027");
					}
					
				}
			}
		} catch (Exception e) {
			setExpjExceptionMsg(e);
		}
	}
	
	
	/**
	 * �M�݊��Z�B
	 * @param amount �Ώۋ��z
	 * @param s �X�g���N�g�I�u�W�F�N�g
	 * @return �M�݋��z
	 * @throws SQLException �������s
	 * @throws ExpjException  �������s
	 */
	private String exchAmount(String amount, KR0070010Struct s) throws SQLException, ExpjException {
		ExchAmount exch = new ExchAmount(conn);
		boolean result = exch.doExchAmount(amount, s.getCOMPANY_CD(), s.geth_CUR_CD(), s.getEXCH_TYP(), s.getDETAIL_ROUND_TYP(), s.getSALES_DATE());
		if (!result) {
			setErrorMessage("KQ00038");
			return "0";
		}
		double exchAmount = exch.getD_EXCH_AMOUNT();
		BigDecimal b = new BigDecimal(exchAmount);
		return b.toString();
	}
	
	
	
	/**
	 * �ۂ߁B
	 * @param amount �Ώۋ��z
	 * @param s �X�g���N�g�I�u�W�F�N�g
	 * @return �ۂߋ��z
	 * @throws SQLException �������s
	 * @throws ExpjException �������s
	 */
	private String roundAmount(String amount, KR0070010Struct s) throws SQLException, ExpjException {
		ExchAmount exch = new ExchAmount(conn);
		boolean result = exch.doMarume(amount, s.getCOMPANY_CD(), s.geth_CUR_CD(), s.getEXCH_TYP(), s.getDETAIL_ROUND_TYP(), s.getSALES_DATE());
		if (!result) {
			throw new ExpjException("KQ00038");
		}
		return exch.getS_EXCH_AMOUNT();
	}
	
//Add NEC 20140618 Str
      /**
       * �V�X�e���p�����[�^�`�F�b�N       
       * @throws SQLException �������s
       * @throws ExpjException �������s
     * @throws FoundationException 
       */
	private void chkAprSales() throws SQLException, ExpjException, FoundationException {
		  String installFlg = "";
          List installOptionsList = entity.mSYS_INSTALL_OPTIONS_B.read(conn, struct);
          if(installOptionsList.size() > 0){
        	  installFlg = ((KR0070010Struct)installOptionsList.get(0)).getINSTALL_FLG();
        	  
          }
          if (installOptionsList.isEmpty() || "0".equals(installFlg)) {  
              // ���|�Ǘ����C���X�g�[������Ă��Ȃ��B
   	        
   	           /** �p�����[�^�u������я��F�v���擾*/
   	           privateConfig = new PrivateConfig(conn);
   	           aprSales = privateConfig.getString("APR_SALES");
   	           // �p�����[�^�u������я��F�v���擾�ł��Ȃ������ꍇ
   	          if(aprSales == null || "".equals(aprSales)){
    				String locale = CoreTools.getLocale(struct.getsUser_ID());
    				ResourceBundle messages = CoreTools.getResourceBundle("ExpjMessage", locale);
    				setErrorMessage("AZ00041", messages.getString("AZ00074"));
    				aprSales = "0";
   	            	return;
   	          }else if(!"1".equals(aprSales)){   	        	  
   				  // �P�ȊO�̏ꍇ
   	        	  aprSales = "0";
   	          }else{
   	        	  // �P�̏ꍇ
   	              aprSales = "1";
   	          }
   	          //������я��F��1�F�s���ꍇ
   	          if("1".equals(aprSales)){
   	   	          //�`�[�ԍ���[�������]���������A���F�󋵁�1:���F�҂��@�̏ꍇ
   	   	          List tSalesApprList = entity.mT_SALES_ApprFlg.read(conn,struct);
   	   	          if(tSalesApprList != null && tSalesApprList.size() > 0){
   	   	        	  setErrorMessage("KR00025");
   	   	        	  return;
   	   	          }   	        	  
   	          }   
          }
      }
 
      /**
       * �V�X�e���p�����[�^�`�F�b�N       
       * @throws SQLException �������s
       * @throws ExpjException �������s
     * @throws FoundationException 
       */
	private boolean blnchkAprSales() throws SQLException, ExpjException, FoundationException {
	
   	           /** �p�����[�^�u������я��F�v���擾*/
   	           privateConfig = new PrivateConfig(conn);
   	           aprSales = privateConfig.getString("APR_SALES");
   	           // �p�����[�^�u������я��F�v���擾�ł��Ȃ������ꍇ
   	          if(aprSales == null || "".equals(aprSales)){
    				String locale = CoreTools.getLocale(struct.getsUser_ID());
    				ResourceBundle messages = CoreTools.getResourceBundle("ExpjMessage", locale);
    				setErrorMessage("AZ00041", messages.getString("AZ00074"));
    				aprSales = "0";
   	            	return false;
   	          }else if(!"1".equals(aprSales)){   	        	  
   				  // �P�ȊO�̏ꍇ
   	        	  return false;
   	          }else{
   	        	  // �P�̏ꍇ
   	        	 return true;
   	          }     	  
      }
//Add NEC 20140618 End
		
	/**
	 * �M�݊��Z����
	 * 
	 * @param curCd
	 *            �ʉ݃R�[�h
	 * @param exchTyp
	 *            �ב֎��
	 * @param roundTyp
	 *            �ۂߋ敪
	 * @param decimalFig
	 *            ��������
	 * @param amount
	 *            �M�݊��Z�O���z
	 * @param stdDate
	 *            ���
	 * @return String �ϊ�����z
	 */
	private String getExchChangeAmount(String curCd, String exchTyp,
			String roundTyp, String decimalFig, String amount, String stdDate) {
		try {
			/* �ϐ���` */
			String exchRate; // �בփ��[�g
			String homeCurAmount; // �M�݊��Z���z

			// �בփ��[�g�擾
			ExchRateStruct ers = ExchRateControl.getData(conn, // DB�R�l�N�V����
					getsysCOMPANY_CD(), // ��ЃR�[�h
					curCd, // �ʉ݃R�[�h
					exchTyp, // �ב֎��
					null, // �ב֗\��R�[�h(���g�p)
					stdDate); // ���

			exchRate = ers.getEXCH_RATE();

			// �M�݊��Z����
			homeCurAmount = AmountCalculator.calcHomeCurAmount(amount, // �Ώۋ��z
					exchRate, // �בփ��[�g
					roundTyp, // �ۂߋ敪
					decimalFig); // ��������

			return homeCurAmount;

		} catch (Exception e) {
			return amount;
		}
	}
	

	/**
	 * [�������]�i���`�j�o�^�p�f�[�^�𐶐�
	 * @return
	 * @throws FoundationException
	 * @throws SQLException
	 * @throws ExpjException
	 */
	private KR0070010Struct createDebitRecord() throws FoundationException, SQLException, ExpjException {
		
		KR0070010Struct s = new KR0070010Struct();
		// ����敪  4:��݌ɕi����
		s.setSALES_TYP("4");
		// ���Ӑ�R�[�h
		s.setCUST_CD(struct.getCUST_CD());
		// �i�ڔԍ�
		s.setITEM_CD(struct.getITEM_CD());	
		// �i�ږ���
		s.setITEM_NAME(struct.getITEM_NAME());
		// ���Ӑ撍���ԍ�
		s.setCUST_ODR_NO(struct.getCUST_ODR_NO());
		// ����v���
		s.setSALES_DATE(struct.getSALES_DATE());
		// ����v�㕔��
		s.setSALES_DEPT_CD(struct.getSALES_DEPT_CD());
		// �����R�[�h
		s.setVEND_CD(null);
		// �����ꏊ�R�[�h
		s.setPRD_ODR_PLACE_CD(null);
		// �c�ƒS���҃R�[�h
		s.setCUST_CHRG_PSN_CD(struct.getCUST_CHRG_PSN_CD());
		// ���s�S���҃R�[�h
		s.setODR_ACPT_PSN_CD(struct.getODR_ACPT_PSN_CD());
		// ������ѐ���
		s.setSALES_QTY(struct.getSALES_QTY());
		// �P��
		s.setSALES_UNIT_PRICE(struct.getSALES_UNIT_PRICE());
		// �P��
		s.setUNIT_CD(struct.getSTOCK_UNIT());
		// ������ы��z
		s.setSALES_AMOUNT(struct.getSALES_AMOUNT());
		
		// ������ы��z(�M��)
		String salesAmountExchRates = exchAmount(struct.getSALES_AMOUNT(), struct);
		if (msgStruct.hasError()) {
		 return s;
		}
		s.setSALES_AMOUNT_EXCH_RATES(salesAmountExchRates);
		
		// ��̌�����
		s.setINSPC_ACPT_DATE(struct.getSALES_DATE());
		// ��̌�����
		s.setINSPC_ACPT_QTY(struct.getSALES_QTY());
		
		// �O�őΏۋ��z
		String externalTaxSalesAmount = SaAmountCalculator.calcExternalTaxSalesAmount( struct.getTAX_CD(), s.getSALES_AMOUNT());
		s.setEXTERNAL_TAX_SALES_AMOUNT(externalTaxSalesAmount);
		// ���őΏۋ��z
		String internalTaxSalesAmount = SaAmountCalculator.calcInternalTaxSalesAmount( struct.getTAX_CD(), s.getSALES_AMOUNT());
		s.setINTERNAL_TAX_SALES_AMOUNT(internalTaxSalesAmount);
		// ��ېőΏۋ��z
		String taxfreeSalesAmount =	SaAmountCalculator.calcTaxfreeSalesAmount(struct.getTAX_CD(), s.getSALES_AMOUNT());
		s.setTAXFREE_SALES_AMOUNT(taxfreeSalesAmount);
		
		// �Ŋz�P
		String taxAmount1 = SaAmountCalculator.calcTaxAmount( struct.getTAX_CD(),
																s.getSALES_AMOUNT(),
																struct.getTAX_RATE_1(),
																String.valueOf(decimalFig),
																struct.getTAX_ROUND_TYP());
		s.setTAX_AMOUNT_1(taxAmount1);
		
		// �Ŋz�Q
		String taxAmount2 = SaAmountCalculator.calcTaxAmount( struct.getTAX_CD(),
																s.getSALES_AMOUNT(),
																struct.getTAX_RATE_2(),
																String.valueOf(decimalFig),
																struct.getTAX_ROUND_TYP());
		s.setTAX_AMOUNT_2(taxAmount2);
		
		// �Ŋz�R
		String taxAmount3 = SaAmountCalculator.calcTaxAmount( struct.getTAX_CD(),
																s.getSALES_AMOUNT(),
																struct.getTAX_RATE_3(),
																String.valueOf(decimalFig),
																struct.getTAX_ROUND_TYP());
		s.setTAX_AMOUNT_3(taxAmount3);
		
		// ����Ŋz�i�O�Łj
		String externalTaxAmount = SaAmountCalculator.calcExternalTaxAmount( struct.getTAX_CD(),
																				s.getTAX_AMOUNT_1(),
																				s.getTAX_AMOUNT_2(),
																				s.getTAX_AMOUNT_3());
		s.setEXTERNAL_TAX_AMOUNT(externalTaxAmount);
		
		// ����Ŋz�i���Łj
		String internalTaxAmount = SaAmountCalculator.calcInternalTaxAmount( struct.getTAX_CD(),
																				s.getTAX_AMOUNT_1(),
																				s.getTAX_AMOUNT_2(),
																				s.getTAX_AMOUNT_3());
																				s.setINTERNAL_TAX_AMOUNT(internalTaxAmount);
																				
		// �Ŕ�������z
		String taxCreditSalesAmount = SaAmountCalculator.calcTaxCreditSalesAmount( s.getEXTERNAL_TAX_SALES_AMOUNT(),
																					s.getINTERNAL_TAX_SALES_AMOUNT(),
																					s.getTAXFREE_SALES_AMOUNT(),
																					s.getINTERNAL_TAX_AMOUNT());
		s.setTAX_CREDIT_SALES_AMOUNT(taxCreditSalesAmount);
		
		// �Ŕ�������z�i�M�݁j
		String taxCreditSalesAmountExchRates = exchAmount(taxCreditSalesAmount, struct);
		if (msgStruct.hasError()) {
			return s;
		}
		s.setOWN_CUR_TAXCREDIT_SALES_AMOUNT(taxCreditSalesAmountExchRates);
		
		//������ъǗ��ԍ�
		s.seth_SALES_SEQ_NO(struct.geth_SALES_SEQ_NO());
		// ���`�[�ԍ�
		s.setORG_SLIP_CD(null);
		// �ʉ݃R�[�h
		s.setCURRNCY_CD(struct.geth_CUR_CD());
		// ���l�敪
		s.setSPCL_PRICE_CO(null);
		// ���l
		s.setREMARKS(struct.getREMARKS());
		// �����敪
		s.setINSPC_ACPT_TYP(struct.getINSPC_ACPT_TYP());
		// ��ԋ敪
		s.setSTATUS("20");
		// �폜�t���O
		s.setDEL_FLG("0");
		
		//MOD NEC 2014.06.18 STR
		//EJ�̏ꍇ�A�V�X�e���p�����[�^(���F)�`�F�b�N
    	  if("J".equals(getExplannerFlag()) && blnchkAprSales() == true){
    	  	s.setAPPR_FLG("1");
    		s.setAPPR_ID(null);
    		s.setAPPR_DATE(null);
    	  }else{
    		s.setAPPR_FLG("3");
    		s.setAPPR_ID(getsysUSER_CD());
    		s.setAPPR_DATE(struct.getBUSINESS_OPR_DATE());
    	  }	 
    	  
		/*
		// ���F��
		s.setAPPR_FLG("3");
		// ���F��
		s.setAPPR_ID(getsysUSER_CD());
		// ���F���t
		s.setAPPR_DATE(getBusinessOprDate());
		*/
		
		//MOD NEC 2014.06.18 END

		// �쐬��
		s.setsSysdate(struct.getsSysdate());
		// �쐬��
		s.setsUser_ID(sysUSER_CD);
		
		return s;
	}
	
	/**
	 * [���������]�ɓo�^���鍕���R�[�h���쐬����
	 */
	private KR0070010Struct createKuroRecord() throws FoundationException, SQLException, ExpjException {
		KR0070010Struct s = new KR0070010Struct();
		//������ъǗ��ԍ�
		s.setSALES_SEQ_NO(null);
		//��ЃR�[�h
		s.setCOMPANY_CD(getsysCOMPANY_CD());
		//�o�׎w���ԍ�
		s.setSHIP_ODR_NO(null);
		//�o�׎��ъǗ��ԍ�
		s.setSHIP_SEQ_NO(null);
		//�`�[�ԍ�
		s.setSLIP_CD(null);
		// ����敪  4:��݌ɕi����
		s.setSALES_TYP("4");
		// ���Ӑ�R�[�h
		s.setCUST_CD(struct.getCUST_CD());
		// �i�ڔԍ�
		s.setITEM_CD(struct.getITEM_CD());
		// �i�ږ���
		s.setITEM_NAME(struct.getITEM_NAME());
		// ���Ӑ撍���ԍ�
		s.setCUST_ODR_NO(struct.getCUST_ODR_NO());
		// ����v���
		s.setSALES_DATE(struct.getSALES_DATE());
		// ����v�㕔��
		s.setSALES_DEPT_CD(struct.getSALES_DEPT_CD());
		//�����R�[�h
		s.setVEND_CD(null);
		//�����ꏊ�R�[�h
		s.setPRD_ODR_PLACE_CD(null);
		// �c�ƒS���҃R�[�h
		s.setCUST_CHRG_PSN_CD(struct.getCUST_CHRG_PSN_CD());
		// ���s�S���҃R�[�h
		s.setODR_ACPT_PSN_CD(struct.getODR_ACPT_PSN_CD());
		// ������ѐ���
		s.setSALES_QTY(struct.getSALES_QTY());
		// �P��
		s.setSALES_UNIT_PRICE(struct.getSALES_UNIT_PRICE());
		// �P��
		s.setUNIT_CD(struct.getSTOCK_UNIT());
		// ������ы��z
		s.setSALES_AMOUNT(struct.getSALES_AMOUNT());
		// ������ы��z�i�M�݁j
		s.setSALES_AMOUNT_EXCH_RATES(exchAmount(struct.getSALES_AMOUNT(), struct));
		// �O�őΏۋ��z
		s.setEXTERNAL_TAX_SALES_AMOUNT(SaAmountCalculator.calcExternalTaxSalesAmount(struct.getTAX_CD(), s.getSALES_AMOUNT()));
		// ���őΏۋ��z
		s.setINTERNAL_TAX_SALES_AMOUNT(SaAmountCalculator.calcInternalTaxSalesAmount(struct.getTAX_CD(), s.getSALES_AMOUNT()));
		// ��ېőΏۋ��z
		s.setTAXFREE_SALES_AMOUNT(SaAmountCalculator.calcTaxfreeSalesAmount(struct.getTAX_CD(), s.getSALES_AMOUNT()));
		// �Ŋz�P
		s.setTAX_AMOUNT_1(SaAmountCalculator.calcTaxAmount(struct.getTAX_CD(),
															s.getSALES_AMOUNT(),
															struct.getTAX_RATE_1(),
															String.valueOf(decimalFig),
															struct.getTAX_ROUND_TYP()));
		// �Ŋz�Q
		s.setTAX_AMOUNT_2(SaAmountCalculator.calcTaxAmount(struct.getTAX_CD(),
															s.getSALES_AMOUNT(),
															struct.getTAX_RATE_2(),
															String.valueOf(decimalFig),
															struct.getTAX_ROUND_TYP()));
		// �Ŋz�R
		s.setTAX_AMOUNT_3(SaAmountCalculator.calcTaxAmount(struct.getTAX_CD(),
															s.getSALES_AMOUNT(),
															struct.getTAX_RATE_3(),
															String.valueOf(decimalFig),
															struct.getTAX_ROUND_TYP()));
		// ����Ŋz�i�O�Łj
		s.setEXTERNAL_TAX_AMOUNT(SaAmountCalculator.calcExternalTaxAmount(struct.getTAX_CD(),
																			s.getTAX_AMOUNT_1(),
																			s.getTAX_AMOUNT_2(),
																			s.getTAX_AMOUNT_3()));
		// ����Ŋz�i���Łj
		s.setINTERNAL_TAX_AMOUNT(SaAmountCalculator.calcInternalTaxAmount(struct.getTAX_CD(),
																			s.getTAX_AMOUNT_1(),
																			s.getTAX_AMOUNT_2(),
																			s.getTAX_AMOUNT_3()));
		// �Ŕ�������z
		s.setTAX_CREDIT_SALES_AMOUNT(SaAmountCalculator.calcTaxCreditSalesAmount(s.getEXTERNAL_TAX_SALES_AMOUNT(),
																					s.getINTERNAL_TAX_SALES_AMOUNT(),
																					s.getTAXFREE_SALES_AMOUNT(),
																					s.getINTERNAL_TAX_AMOUNT()));

		if (msgStruct.hasError()) {
			return s;
		}
		// �Ŕ�������z�i�M�݁j
		s.setOWN_CUR_TAXCREDIT_SALES_AMOUNT(exchAmount(s.getTAX_CREDIT_SALES_AMOUNT(), struct));
		if (msgStruct.hasError()) {
			return s;
		}
		
		//���`�[�ԍ�
		s.setORG_SLIP_CD(null);
		// �ʉ݃R�[�h
		s.setCUR_CD(struct.geth_CUR_CD());
		// ���z�敪
		s.setAMOUNT_TYP("0");
		// ���l
		s.setREMARKS(struct.getREMARKS());
		// �����敪
		s.setINSPC_ACPT_TYP(struct.getINSPC_ACPT_TYP());
		//������v��敪
		s.setTEMP_SALES_TYP("1");
		//������яƍ��敪
		s.setSALES_DISAGREEMENT_TYP("1");
		//����v��t���O
		s.setSALES_FLG("0");
		//�������IF�Ώۃt���O
		s.setSALES_IF_FLG("1");
		// �폜�t���O
		s.setDEL_FLG("0");
		
		//MOD NEC 2014.06.18 STR
		//EJ�̏ꍇ�A�V�X�e���p�����[�^(���F)�`�F�b�N
    	  if("J".equals(getExplannerFlag()) && blnchkAprSales() == true){
    	  	s.setAPPR_FLG("1");
    		s.setAPPR_ID(null);
    		s.setAPPR_DATE(null);
    	  }else{
    		s.setAPPR_FLG("3");
    		s.setAPPR_ID(getsysUSER_CD());
    		s.setAPPR_DATE(struct.getBUSINESS_OPR_DATE());
    	  }	 
    	  
		/*
		// ���F��
		s.setAPPR_FLG("3");
		// ���F��
		s.setAPPR_ID(getsysUSER_CD());
		// ���F���t
		s.setAPPR_DATE(getBusinessOprDate());
		*/
		//MOD NEC 2014.06.18 END
		
		// �쐬��
		s.setsSysdate(struct.getsSysdate());
		// �쐬��
		s.setsUser_ID(sysUSER_CD);
		
		return s;
	}
	
	/**
	 * [������уw�b�_]�ɓo�^���鍕���R�[�h���쐬����
	 * @return
	 * @throws FoundationException
	 * @throws SQLException
	 * @throws ExpjException
	 */
	private KR0070010Struct createSalesH() throws FoundationException, SQLException, ExpjException {
		
		KR0070010Struct s = new KR0070010Struct();
		//������ѓ`�[�ԍ�
		s.setSALES_H_NO(null);
		s.seth_SALES_H_NO(struct.geth_SALES_H_NO());
		// ����敪  4:��݌ɕi����
		s.setSALES_TYP("4");
		// ����v���
		s.setSALES_DATE(struct.getSALES_DATE());
		// ��̌�����
		s.setINSPC_ACPT_DATE(struct.getSALES_DATE());
		// ����v�㕔��R�[�h
		s.setSALES_DEPT_CD(struct.getSALES_DEPT_CD());
		// ���Ӑ�R�[�h
		s.setCUST_CD(struct.getCUST_CD());
		// ������R�[�h
		List custCd = entity.mM_CLAIM_CUST_CTRL.read(conn, struct);
		if (!custCd.isEmpty()) {
			KR0070010Struct scustCd = (KR0070010Struct) custCd.get(0);
			s.setBILL_ADDRESSEE_CD(scustCd.getBILL_ADDRESSEE_CD());
		}
		// �c�ƒS���҃R�[�h
		s.setCUST_CHRG_PSN_CD(struct.getCUST_CHRG_PSN_CD());
		// ���s�S���҃R�[�h
		s.setODR_ACPT_PSN_CD(struct.getODR_ACPT_PSN_CD());
		// �ʉ݃R�[�h
		s.setCURRNCY_CD(struct.geth_CUR_CD());
		// �����敪
		s.setINSPC_ACPT_TYP(struct.getINSPC_ACPT_TYP());
			
		/* �u����Ōv�Z�v���s */
		List calcTaxList = calcTaxProc(struct.getTAX_CD(), // ����ŃR�[�h
										struct.getSALES_DATE().substring(0, 10), // ����v���
										String.valueOf(decimalFig), // ��������
										struct.getSALES_AMOUNT()); // �Ώۋ��z
		
		// �ېŊ֘A���z���v�Z
		if (!calcTaxList.isEmpty()) {
			s.setSALES_AMOUNT(struct.getSALES_AMOUNT()); // �ō����z
			s.setEXTERNAL_TAX_SALES_AMOUNT((String) calcTaxList.get(9)); // �O�őΏۋ��z
			s.setINTERNAL_TAX_SALES_AMOUNT((String) calcTaxList.get(10)); // ���őΏۋ��z
			s.setTAXFREE_SALES_AMOUNT((String) calcTaxList.get(11)); // ��ېőΏۋ��z
			s.setTAX_CREDIT_SALES_AMOUNT((String) calcTaxList.get(6)); // �Ŕ����z

			s.setEXTERNAL_TAX_AMOUNT((String) calcTaxList.get(12)); // ����Ŋz�i�O�Łj
			s.setINTERNAL_TAX_AMOUNT((String) calcTaxList.get(13)); // ����Ŋz�i���Łj
			s.setTAX_AMOUNT_1((String) calcTaxList.get(3)); // �Ŋz�P
			s.setTAX_AMOUNT_2((String) calcTaxList.get(4)); // �Ŋz�Q
			s.setTAX_AMOUNT_3((String) calcTaxList.get(5)); // �Ŋz�R

			// ������ы��z(�M��)���v�Z
			String salesExhangeAmount = "0";
			if (!getHomeCurCd().equals(s.getCURRNCY_CD())) {
				salesExhangeAmount = getExchChangeAmount(struct.geth_CUR_CD(), // �ʉ݃R�[�h
						struct.getEXCH_TYP(), // �ב֎��
						struct.getDETAIL_ROUND_TYP(), // �܂�ߋ敪
						String.valueOf(decimalFig), // ��������
						(String) calcTaxList.get(8), // ���z
						s.getSALES_DATE().substring(0, 10)); // �Ώۓ��t
			} else {
				salesExhangeAmount = (String) calcTaxList.get(8);
			}
			s.setSALES_AMOUNT_EXCH_RATES(salesExhangeAmount);
			
			// �Ŕ�������z�i�M�݁j���v�Z
			String salesTaxCreditAmount = "0";
			if (!getHomeCurCd().equals(s.getCURRNCY_CD())) {
				salesTaxCreditAmount = getExchChangeAmount(struct.geth_CUR_CD(), // �ʉ݃R�[�h
						struct.getEXCH_TYP(), // �ב֎��
						struct.getDETAIL_ROUND_TYP(), // �܂�ߋ敪
						String.valueOf(decimalFig), // ��������
						(String) calcTaxList.get(6), // ���z
						s.getSALES_DATE().substring(0, 10)); // �Ώۓ��t
			} else {
				salesTaxCreditAmount = (String) calcTaxList.get(6);
			}
			s.setOWN_CUR_TAXCREDIT_SALES_AMOUNT(salesTaxCreditAmount);
		}
		// �쐬��
		s.setsSysdate(struct.getsSysdate());
		// �쐬��
		s.setsUser_ID(sysUSER_CD);

		return s;
	}
	
	/**
	 * ������уe�[�u��
	 * @return
	 * @throws FoundationException
	 * @throws SQLException
	 * @throws ExpjException
	 */
	private KR0070010Struct createSales() throws FoundationException, SQLException, ExpjException {
		KR0070010Struct s = new KR0070010Struct();
		// ������ъǗ��ԍ�
		s.seth_SALES_SEQ_NO(struct.geth_SALES_SEQ_NO());
		// ����敪  4:��݌ɕi����
		s.setSALES_TYP("4");
		// ���Ӑ�R�[�h
		s.setCUST_CD(struct.getCUST_CD());
		// �i�ڔԍ�
		s.setITEM_CD(struct.getITEM_CD());
		// �i�ږ���
		s.setITEM_NAME(struct.getITEM_NAME());
		// ���Ӑ撍���ԍ�
		s.setCUST_ODR_NO(struct.getCUST_ODR_NO());
		// ����v���
		s.setSALES_DATE(struct.getSALES_DATE());
		// ����v�㕔��
		s.setSALES_DEPT_CD(struct.getSALES_DEPT_CD());
		// �c�ƒS���҃R�[�h
		s.setCUST_CHRG_PSN_CD(struct.getCUST_CHRG_PSN_CD());
		// ���s�S���҃R�[�h
		s.setODR_ACPT_PSN_CD(struct.getODR_ACPT_PSN_CD());
		// ������ѐ���
		s.setSALES_QTY(struct.getSALES_QTY());
		// ���Ӑ攄����ѐ���
		s.setCUST_SALES_QTY(struct.getSALES_QTY());
		// �P��
		s.setSALES_UNIT_PRICE(struct.getSALES_UNIT_PRICE());
		// �P��
		s.setUNIT_CD(struct.getUNIT_CD());
		// ���Ӑ攄��P��
		s.setCUST_UNIT_CD(struct.getSTOCK_UNIT());
		// ��̌�����
		s.setINSPC_ACPT_DATE(struct.getSALES_DATE());
		// ��̌�����
		s.setINSPC_ACPT_QTY(struct.getSALES_QTY());
		// ���Ӑ��̌�����
		s.setCUST_INSPC_ACPT_QTY(struct.getSALES_QTY());
		
		// �ʉ݃R�[�h
		s.setCURRNCY_CD(struct.geth_CUR_CD());
		
		// ����ŃR�[�h ���擾����

		// �����������擾����
		/* �u����Ōv�Z�v���s */
		List calcTaxList = calcTaxProc(struct.getTAX_CD(), // ����ŃR�[�h
				struct.getSALES_DATE().substring(0, 10), // �[���\�����
				String.valueOf(decimalFig), // ��������
				struct.getSALES_AMOUNT()); // �Ώۋ��z
		
		// �ېŊ֘A���z���v�Z
		if (!calcTaxList.isEmpty()) {
			s.setSALES_AMOUNT(struct.getSALES_AMOUNT()); // �ō����z
			s.setEXTERNAL_TAX_SALES_AMOUNT((String) calcTaxList.get(9)); // �O�őΏۋ��z
			s.setINTERNAL_TAX_SALES_AMOUNT((String) calcTaxList.get(10)); // ���őΏۋ��z
			s.setTAXFREE_SALES_AMOUNT((String) calcTaxList.get(11)); // ��ېőΏۋ��z
			s.setTAX_CREDIT_SALES_AMOUNT((String) calcTaxList.get(6)); // �Ŕ����z

			s.setEXTERNAL_TAX_AMOUNT((String) calcTaxList.get(12)); // ����Ŋz�i�O�Łj
			s.setINTERNAL_TAX_AMOUNT((String) calcTaxList.get(13)); // ����Ŋz�i���Łj
			s.setTAX_AMOUNT_1((String) calcTaxList.get(3)); // �Ŋz�P
			s.setTAX_AMOUNT_2((String) calcTaxList.get(4)); // �Ŋz�Q
			s.setTAX_AMOUNT_3((String) calcTaxList.get(5)); // �Ŋz�R

			// ������ы��z(�M��)���v�Z
			// �ʉ݃R�[�h�擾
			String salesExhangeAmount = "0";
			if (!getHomeCurCd().equals(s.getCURRNCY_CD())) {
				salesExhangeAmount = getExchChangeAmount(struct
						.geth_CUR_CD(), // �ʉ݃R�[�h
						struct.getEXCH_TYP(), // �ב֎��
						struct.getDETAIL_ROUND_TYP(), // �܂�ߋ敪
						String.valueOf(decimalFig), // ��������
						(String) calcTaxList.get(8), // ���z
						s.getSALES_DATE().substring(0, 10)); // �Ώۓ��t
			} else {
				salesExhangeAmount = (String) calcTaxList.get(8);
			}
			s.setSALES_AMOUNT_EXCH_RATES(salesExhangeAmount);
			// �Ŕ�������z�i�M�݁j���v�Z

			String salesTaxCreditAmount = "0";
			if (!getHomeCurCd().equals(s.getCURRNCY_CD())) {
				salesTaxCreditAmount = getExchChangeAmount(struct
						.geth_CUR_CD(), // �ʉ݃R�[�h
						struct.getEXCH_TYP(), // �ב֎��
						struct.getDETAIL_ROUND_TYP(), // �܂�ߋ敪
						String.valueOf(decimalFig), // ��������
						(String) calcTaxList.get(6), // ���z
						s.getSALES_DATE().substring(0, 10)); // �Ώۓ��t
			} else {
				salesTaxCreditAmount = (String) calcTaxList.get(6);
			}

			s.setOWN_CUR_TAXCREDIT_SALES_AMOUNT(salesTaxCreditAmount);
		}
	
		// ���l
		s.setREMARKS(struct.getREMARKS());
		// �ʉ݃R�[�h
		s.setCURRNCY_CD(struct.geth_CUR_CD());
		// �����敪
		s.setINSPC_ACPT_TYP(struct.getINSPC_ACPT_TYP());
		
		//MOD NEC 2014.06.18 STR
		//EJ�̏ꍇ�A�V�X�e���p�����[�^(���F)�`�F�b�N
    	  if("J".equals(getExplannerFlag()) && blnchkAprSales() == true){
    	  	s.setAPPR_FLG("1");
    		s.setAPPR_ID(null);
    		s.setAPPR_DATE(null);
    	  }else{
    		s.setAPPR_FLG("3");
    		s.setAPPR_ID(getsysUSER_CD());
    		s.setAPPR_DATE(struct.getBUSINESS_OPR_DATE());
    	  }	 
    	  
		/*
		// ���F��
		s.setAPPR_FLG("3");
		// ���F��
		s.setAPPR_ID(getsysUSER_CD());
		// ���F���t
		s.setAPPR_DATE(getBusinessOprDate());
		*/
		
		//MOD NEC 2014.06.18 END
		// �ۗ����R
		s.setRESERVE_CAUSE(null);
		// �쐬��
		s.setsSysdate(struct.getsSysdate());
		// �쐬��
		s.setsUser_ID(sysUSER_CD);
		return s;

	}
	
	
	
	/**
	 * ����Ōv�Z
	 * 
	 * @param taxCd
	 *            ����ŃR�[�h
	 * @param judgeDate
	 *            �V����ŗ������
	 * @param decimalFig
	 *            ��������
	 * @param amount
	 *            ���z
	 * @return List
	 */
	private List calcTaxProc(String taxCd, String judgeDate, String decimalFig,
			String amount) throws FoundationException {
	
		// �߂�l���X�g
		List retList = new ArrayList();
	
		// �u����Ōv�Z�v���i��`
		Common common = new Common(conn, sysUSER_CD, sp.getProcId(), getSalesPLANT_CD(), getsysCOMPANY_CD());
		// �u����Ōv�Z�v�Ăяo��
		List calcTaxList = common.calcTaxFd(taxCd, // ����ŃR�[�h
				judgeDate, // �V����ŗ������
				decimalFig, // ��������
				amount); // ���z
	
		// �u����Ōv�Z�v���ʃX�e�[�^�X������I���ȊO�̏ꍇ�̓G���[
		if (common.getResultStatus().intValue() != STATUS_NORMAL) {
			setErrorMessage("KQ20171");
			return retList;
		}
	
		// �u����Ōv�Z�v�擾���ʂ����X�g�ɍĔz�u
		retList.add(calcTaxList.get(0).toString()); // 0:�ŗ��P
		retList.add(calcTaxList.get(1).toString()); // 1:�ŗ��Q
		retList.add(calcTaxList.get(2).toString()); // 2:�ŗ��R
		retList.add(calcTaxList.get(3).toString()); // 3:�Ŋz�P
		retList.add(calcTaxList.get(4).toString()); // 4:�Ŋz�Q
		retList.add(calcTaxList.get(5).toString()); // 5:�Ŋz�R
		retList.add(calcTaxList.get(6).toString()); // 6:�Ŕ����z
		retList.add(calcTaxList.get(7).toString()); // 7:����ŋ��z
		retList.add(calcTaxList.get(8).toString()); // 8:�ō����z
		retList.add(calcTaxList.get(9).toString()); // 9:�O�őΏۋ��z
		retList.add(calcTaxList.get(10).toString()); // 10:���őΏۋ��z
		retList.add(calcTaxList.get(11).toString()); // 11:��ېőΏۋ��z
		retList.add(calcTaxList.get(12).toString()); // 12:����Ŋz�i�O�Łj
		retList.add(calcTaxList.get(13).toString()); // 13:����Ŋz�i���Łj
		retList.add(calcTaxList.get(14).toString()); // 14:�[���敪
		
		// �����I��
		return retList;
	}

	/**
	 * [����`�[]�i�ԓ`�j�o�^�p�f�[�^�𐶐�
	 * @return
	 * @throws ExpjException
	 * @throws FoundationException
	 * @throws SQLException
	 */
	private KR0070010Struct createCreditRecord() throws ExpjException,FoundationException, SQLException {
		List resultList = entity.mT_SALES_CreditRecord.read(conn, struct);
		KR0070010Struct s = (KR0070010Struct) resultList.get(0);

		//������ъǗ��ԍ�
		s.seth_SALES_SEQ_NO(struct.geth_SALES_SEQ_NO());
		
		//MOD NEC 2014.06.18 STR
		//EJ�̏ꍇ�A�V�X�e���p�����[�^(���F)�`�F�b�N
    	  if("J".equals(getExplannerFlag()) && blnchkAprSales() == true){
    	  	s.setAPPR_FLG("1");
    		s.setAPPR_ID(null);
    		s.setAPPR_DATE(null);
    	  }else{
    		s.setAPPR_FLG("3");
    		s.setAPPR_ID(getsysUSER_CD());
    		s.setAPPR_DATE(struct.getBUSINESS_OPR_DATE());
    	  }	 
    	  
		/*
		// ���F��
		s.setAPPR_FLG("3");
		// ���F��
		s.setAPPR_ID(getsysUSER_CD());
		// ���F���t
		s.setAPPR_DATE(getBusinessOprDate());
		*/
		
		//MOD NEC 2014.06.18 END
		// �X�V��
		s.setsSysdate(struct.getsSysdate());
		// �X�V��
		s.setsUser_ID(sysUSER_CD);
		return s;
	}

	/**
	 * [���������]�ɓo�^����ԃ��R�[�h���쐬����
	 */
	private KR0070010Struct createAkaRecord() throws FoundationException, SQLException {
		List l = new ArrayList();
		if ("Ja".equals(getExplannerFlag())) {
			l = entity.mAKA_T_SALES_TEMP_Ja.read(conn, struct);	
		} else {
			l = entity.mAKA_T_SALES_TEMP.read(conn, struct);
		}
		
		KR0070010Struct s = (KR0070010Struct) l.get(0);
		s.setsSysdate(struct.getsSysdate());
		s.setsUser_ID(sysUSER_CD);
		return s;
	}

	
	/**
	 * Explanner J�̓o�^
	 * @throws BusinessProcessException
	 * @throws FoundationException
	 */
	private void insertOfJ() throws BusinessProcessException, FoundationException {
		try {
			/* �g�����U�N�V�����J�n */
			conn.beginTransWeb();
			// [�������]�i���`�j�o�^�p�f�[�^�𐶐�
			KR0070010Struct debitRecordStruct = createDebitRecord();
			if (msgStruct.hasError()) {
				return;
			}

			// ������ъǗ��ԍ�(�A��)
			List salesSeqNoList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
			KR0070010Struct salesSeqNoStruct = (KR0070010Struct) salesSeqNoList.get(0);
			debitRecordStruct.setSALES_SEQ_NO(salesSeqNoStruct.getSALES_SEQ_NO());
			// �`�[�ԍ��������̔�
			common = new Common(conn, sysUSER_CD, sp.getProcId(), getSalesPLANT_CD(), getsysCOMPANY_CD());
			debitRecordStruct.setSLIP_CD(common.getSLIP_CD());
			// ���`�[�ԍ���null��ݒ�
			debitRecordStruct.setORG_SLIP_CD(null);
			
			// [�������]�i���`�j�̓o�^
			entity.mT_SALES.create(conn, debitRecordStruct);
			
			// ��݌Ɏ󒍂̓`�[�ԍ��ύX
			updateSlipCd(debitRecordStruct.getSLIP_CD());
	
			List installOptionsList = entity.mSYS_INSTALL_OPTIONS_B.read(conn, struct);
			 
			if (!installOptionsList.isEmpty()) {
				// ���|�Ǘ����C���X�g�[������Ă���ꍇ�A���|�Ǘ��T�^�e(���i)�̌ďo
				ArIf arIf = new ArIf(conn, "1");
				arIf.setParameter("6", struct.getsUser_ID(), null, null, debitRecordStruct.getSLIP_CD(), struct.getTAX_CD());
				String msgNo = arIf.execute();
				if (!"0".equals(msgNo)) {
					setErrorMessage(msgNo);
					conn.rollback();
					return;
				}
			}
			// ����ŃR�[�h�ύX
			updateTaxCd();
			if (msgStruct.hasError()) {
				conn.rollback();
				return;
			}
			conn.commit();
			
			// �o�^�������`�̓`�[�ԍ��ŉ�ʂ��Č���
			struct.setSLIP_CD(debitRecordStruct.getSLIP_CD());
			//�o�^
			struct.setrdoInsert("NULL");
			//�X�V�E�폜
			struct.setrdoUpdateDelete("true");
			
			controlSelect();
		} catch (Exception e) {
			setExpjExceptionMsg(e);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
	}
	
	/**
	 * Explanner Ja�AExplanner JaScm�̓o�^
	 * @throws BusinessProcessException
	 * @throws FoundationException
	 */
	public void insertOfJa() throws BusinessProcessException, FoundationException {
		try {
			/* �g�����U�N�V�����J�n */
			conn.beginTransWeb();
			// [�������]�i���`�j�o�^�p�f�[�^�𐶐�
			KR0070010Struct kuroRecordStruct = createKuroRecord();
			if (msgStruct.hasError()) {
				return;
			}
			// �����̔ԗp
			common = new Common(conn, sysUSER_CD, sp.getProcId(), getSalesPLANT_CD(), getsysCOMPANY_CD());
			if ("Ja".equals(getExplannerFlag())) {
				// ������ъǗ��ԍ�(�A��)
				List salesSeqNoList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
				kuroRecordStruct.setSALES_SEQ_NO(((KR0070010Struct) salesSeqNoList.get(0)).getSALES_SEQ_NO());
				
				// �`�[�ԍ��������̔�
				kuroRecordStruct.setSLIP_CD(common.getSLIP_CD());
			} else {
				// ������ъǗ��ԍ�(�A��)
				kuroRecordStruct.setSALES_SEQ_NO(common.getNo());
				// �`�[�ԍ��������̔�
				kuroRecordStruct.setSLIP_CD(common.getSCM_SLIP_CD());
			}
						
			// [���������]�i���`�j�̓o�^
			if ("Ja".equals(getExplannerFlag())) {
				entity.mAKA_T_SALES_TEMP_Ja.create(conn, kuroRecordStruct);
			} else {
				entity.mT_SALES_TEMP.create(conn, kuroRecordStruct);	
			}
			// ��݌Ɏ󒍂̓`�[�ԍ��ύX
			updateSlipCd(kuroRecordStruct.getSLIP_CD());
			
			// ����ŃR�[�h�ύX
			updateTaxCd();
			if (msgStruct.hasError()) {
				conn.rollback();
				return;
			}
			//�R�~�b�g
			conn.commit();
			
			// �o�^�������`�̓`�[�ԍ��ŉ�ʂ��Č���
			struct.setSLIP_CD(kuroRecordStruct.getSLIP_CD());
			//�o�^
			struct.setrdoInsert("NULL");
			//�X�V�E�폜
			struct.setrdoUpdateDelete("true");
			
			controlSelect();
		} catch (Exception e) {
			setExpjExceptionMsg(e);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
	}
	
	/**
	 * Explanner Jf�̓o�^
	 * @throws BusinessProcessException
	 * @throws FoundationException
	 */
	public void insertOfJf() throws BusinessProcessException, FoundationException {
		try {
			/* �g�����U�N�V�����J�n */
			conn.beginTransWeb();

			// [������уw�b�_]��o�^����B
			KR0070010Struct createSalesHStruct = createSalesH();
			if (msgStruct.hasError()) {
				return;
			}

			// ������ѓ`�[�ԍ�(�A��)
			List salesSeqNoList = entity.mSEQ_SALES_H_NO.read(conn, struct);
			KR0070010Struct salesSeqNoStruct = (KR0070010Struct) salesSeqNoList.get(0);
			createSalesHStruct.setSALES_H_NO(salesSeqNoStruct.getSALES_H_NO());
			
			// �o�ה[�i�E���̑�����`�[�ԍ��hSDN�h & ORACLE_SEQUENCE[SEQ_ODR]�iNEXTVAL�j
			List salesOdrList = entity.mSEQ_ODR.read(conn, struct);
			KR0070010Struct salesOdrStruct = (KR0070010Struct) salesOdrList.get(0);
			createSalesHStruct.setSHIP_DLV_H_NO(salesOdrStruct.getSHIP_DLV_H_NO());


			// [�������]��o�^����B
			KR0070010Struct createSalesStruct = createSales();
			if (msgStruct.hasError()) {
				return;
			}
			// ������ъǗ��ԍ��h SSN�h & RACLE_SEQUENCE[SEQ_SALES_SEQ_NO]�iNEXTVAL�j
			List salesseqList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
			KR0070010Struct salesseqStruct = (KR0070010Struct) salesseqList.get(0);
			createSalesStruct.setSALES_SEQ_NO(salesseqStruct.getSALES_SEQ_NO());
			// ������ѓ`�[�ԍ� [������уw�b�_].�h������ѓ`�[�ԍ��h
			createSalesStruct.setSALES_H_NO(salesSeqNoStruct.getSALES_H_NO());
			// �o�ה[�i�E���̑�����`�[�ԍ� [������уw�b�_].�h�o�ה[�i�E���̑�����`�[�ԍ��h
			createSalesStruct.setSHIP_DLV_H_NO(salesOdrStruct.getSHIP_DLV_H_NO());
						
			entity.mT_SALES_H.create(conn, createSalesHStruct);
			entity.mT_SALES_Jf.create(conn, createSalesStruct);

			// ��݌Ɏ󒍂̓`�[�ԍ��ύX
			updateSlipCd(createSalesStruct.getSHIP_DLV_H_NO());
			
			// �u���|�Ǘ��v�T�u�V�X�e�����C���X�g�[������Ă���ꍇ�A���|�Ǘ��h�^�e�i���i�j �� �Ăяo���A[���|���g����] ���X�V����B
			List installOptionsList = entity.mSYS_INSTALL_OPTIONS_B.read(conn, struct);
			if (!installOptionsList.isEmpty()) {
				List resultList =null;		
				common = new Common(conn, sysUSER_CD, sp.getProcId(), getSalesPLANT_CD(), getsysCOMPANY_CD());
				//���|IF�������s
				resultList= common.excArfIFFd(3, 1, salesOdrStruct.getSHIP_DLV_H_NO(), struct.getTAX_CD());
				
				// ����I������
				if (common.getResultStatus().intValue() != STATUS_NORMAL) {
					setErrorMessage(resultList.get(0).toString());
					return ;
				}
			}
			// ����ŃR�[�h�ύX
			updateTaxCd();
			if (msgStruct.hasError()) {
				conn.rollback();
				return;
			}
			
			/* �R�~�b�g */
			conn.commit();
			
			// �o�^�����`�[�ԍ��ŉ�ʂ��Č���
			struct.setSLIP_CD(createSalesStruct.getSHIP_DLV_H_NO());
			//�o�^
			struct.setrdoInsert("NULL");
			//�X�V�E�폜
			struct.setrdoUpdateDelete("true");
			controlSelect();
		} catch (Exception e) {
			setExpjExceptionMsg(e);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
	}
	
	/**
	 * Explanner J�̍X�V����
	 * @throws BusinessProcessException
	 * @throws FoundationException
	 */
	public void updateOfJ() throws BusinessProcessException, FoundationException {
		try {
			/* �g�����U�N�V�����J�n */
			conn.beginTransWeb();
			// ��`�[�ԍ�����A[�������]�ɑ��݂��Ȃ��ꍇ
			List modifyList = entity.mT_SALES.read(conn, struct);
			if (modifyList.isEmpty()) {
				setErrorMessage("ZZ01105");
				return;
			}
			KR0070010Struct modifyStruct = (KR0070010Struct) modifyList.get(0);
			// [�������]."�X�V��" != ��X�V���(hidden�g�p)�̏ꍇ
			if (!modifyStruct.getMODIFY_COUNT().equals(struct.getMODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
				return;
			}

			//Ai�A�g�Ή��AAi�A�g���肩���M�ς̏ꍇ��[�������]�ԍ����ׂ��쐬
			if("1".equals(getInstallFlg()) && "1".equals(struct.getAI_AR_IF_FLG())){
				// [����`�[]�i�ԓ`�j�o�^�p�f�[�^�𐶐�
				KR0070010Struct creditRecordStruct = createCreditRecord();
				// ������ъǗ��ԍ�(�A��)
				List creditSalesSeqNoList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
				KR0070010Struct creditSalesSeqNoStruct = (KR0070010Struct) creditSalesSeqNoList.get(0);
				creditRecordStruct.setSALES_SEQ_NO(creditSalesSeqNoStruct.getSALES_SEQ_NO());
				
				// �ԓ`�[�ԍ��͢�`�[�ԍ�����g�p
				creditRecordStruct.setSLIP_CD(struct.getSLIP_CD());
				// ���`�[�ԍ�
				creditRecordStruct.setORG_SLIP_CD(struct.getSLIP_CD());
				// [����`�[]�i�ԓ`�j��o�^
				entity.mT_SALES.create(conn, creditRecordStruct);
				// [����`�[]�i���`�j��_���폜
				entity.mT_SALES_Delete.update(conn, struct);
				// [����`�[]�i���`�j�o�^�p�f�[�^�𐶐�
				KR0070010Struct debitRecordStruct = createDebitRecord();
				if (msgStruct.hasError()) {
					return;
				}
				// ������ъǗ��ԍ�(�A��)
				List debitSalesSeqNoList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
				KR0070010Struct debitSalesSeqNoStruct = (KR0070010Struct) debitSalesSeqNoList.get(0);
				debitRecordStruct.setSALES_SEQ_NO(debitSalesSeqNoStruct.getSALES_SEQ_NO());
				// ���`�[�ԍ��͢�`�[�ԍ�����g�p
				debitRecordStruct.setSLIP_CD(struct.getSLIP_CD());
				// ���`�[�ԍ�
				debitRecordStruct.setORG_SLIP_CD(struct.getSLIP_CD());
				// [����`�[]�i���`�j��o�^
				entity.mT_SALES.create(conn, debitRecordStruct);
				
				// �o�^�������`�̓`�[�ԍ��ŉ�ʂ��Č���
				struct.setSLIP_CD(debitRecordStruct.getSLIP_CD());
			} else {
				//Add NEC 2014.06.18 STR
				//���|�������Ă��Ȃ��ꍇ�A�V�X�e���p�����[�^������я��F�`�F�b�N(EJ�̂�)
				if("J".equals(getExplannerFlag()) ) {
                 	chkAprSales();
                 	if (msgStruct.hasError()) {                	 
                     	return;
                	 }
				}
				//Add NEC 2014.06.18 END
				List installOptionsList = entity.mSYS_INSTALL_OPTIONS_B.read(conn, struct);
				List arLedgerHTrnList = entity.mT_AR_LEDGER_H_TRN_CHECK.read(conn, struct);
				List arLedgerHList = entity.mT_AR_LEDGER_H_CHECK.read(conn, struct);
				
				if (installOptionsList.isEmpty() || (!installOptionsList.isEmpty() && !arLedgerHTrnList.isEmpty())) {
					// ���|�Ǘ����C���X�g�[������Ă��Ȃ��ꍇ
					// �܂��́A���|�Ǘ����C���X�g�[������Ă��邩�A[���|���g�����w�b�_]."�`�[���" = 14 �̏ꍇ
					// [����`�[]�i���`�j�o�^�p�f�[�^�𐶐�
					KR0070010Struct debitRecordStruct = createDebitRecord();
					if (msgStruct.hasError()) {
						return;
					}
					// �`�[�ԍ��͢�`�[�ԍ�����g�p����
					debitRecordStruct.setSLIP_CD(struct.getSLIP_CD());
					// [�������]�i���`�j���X�V
					entity.mT_SALES.update(conn, debitRecordStruct);
					
					if (!installOptionsList.isEmpty()) {
						// ���|�Ǘ����C���X�g�[������Ă���ꍇ
						// ���|�Ǘ��h�^�e
						ArIf arIf = new ArIf(conn, "1");
						arIf.setParameter("7", struct.getsUser_ID(), struct.getSLIP_CD(), null, null, struct.getTAX_CD());
						String msgNo = arIf.execute();
						if (!"0".equals(msgNo)) {
							setErrorMessage(msgNo);
							conn.rollback();
							return;
						}
					}
					
					// �o�^�������`�̓`�[�ԍ��ŉ�ʂ��Č���
					struct.setSLIP_CD(debitRecordStruct.getSLIP_CD());
				} else if (!installOptionsList.isEmpty() && !arLedgerHList.isEmpty()) {
					// ���|�Ǘ����C���X�g�[������Ă��邩�A[���|�������w�b�_]."�`�[���" = 14 �̏ꍇ
					// [����`�[]�i�ԓ`�j�o�^�p�f�[�^�𐶐�
					KR0070010Struct creditRecordStruct = createCreditRecord();
					// ������ъǗ��ԍ�(�A��)
					List creditSalesSeqNoList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
					KR0070010Struct creditSalesSeqNoStruct = (KR0070010Struct) creditSalesSeqNoList.get(0);
					creditRecordStruct.setSALES_SEQ_NO(creditSalesSeqNoStruct.getSALES_SEQ_NO());

					// �ԓ`�[�ԍ��������̔�
					common = new Common(conn, sysUSER_CD, sp.getProcId(), getSalesPLANT_CD(), getsysCOMPANY_CD());
					creditRecordStruct.setSLIP_CD(common.getSLIP_CD());
					// ���`�[�ԍ�
					creditRecordStruct.setORG_SLIP_CD(struct.getSLIP_CD());
					// [����`�[]�i�ԓ`�j��o�^
					entity.mT_SALES.create(conn, creditRecordStruct);
					// [����`�[]�i���`�j��_���폜
					entity.mT_SALES_Delete.update(conn, struct);
					// [����`�[]�i���`�j�o�^�p�f�[�^�𐶐�
					KR0070010Struct debitRecordStruct = createDebitRecord();
					if (msgStruct.hasError()) {
						return;
					}
					// ������ъǗ��ԍ�(�A��)
					List debitSalesSeqNoList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
					KR0070010Struct debitSalesSeqNoStruct = (KR0070010Struct) debitSalesSeqNoList.get(0);
					debitRecordStruct.setSALES_SEQ_NO(debitSalesSeqNoStruct.getSALES_SEQ_NO());
					// ���`�[�ԍ��������̔�
					common = new Common(conn, sysUSER_CD, sp.getProcId(), getSalesPLANT_CD(), getsysCOMPANY_CD());
					debitRecordStruct.setSLIP_CD(common.getSLIP_CD());
					// ���`�[�ԍ�
					debitRecordStruct.setORG_SLIP_CD(struct.getSLIP_CD());
					// [����`�[]�i���`�j��o�^
					entity.mT_SALES.create(conn, debitRecordStruct);
					// ���|�Ǘ��h�^�e
					ArIf arIf = new ArIf(conn, "1");
					arIf.setParameter("7", struct.getsUser_ID(),
							struct.getSLIP_CD(),
							creditRecordStruct.getSLIP_CD(),
							debitRecordStruct.getSLIP_CD(),
							struct.getTAX_CD());
					String msgNo = arIf.execute();
					if (!"0".equals(msgNo)) {
						setErrorMessage(msgNo);
						conn.rollback();
						return;
					}
				
					// �o�^�������`�̓`�[�ԍ��ŉ�ʂ��Č���
					struct.setSLIP_CD(debitRecordStruct.getSLIP_CD());
					
					// ��݌Ɏ󒍂̓`�[�ԍ��ύX
					updateSlipCd(debitRecordStruct.getSLIP_CD());
				}
			}
			// ����ŃR�[�h�ύX
			updateTaxCd();
			if (msgStruct.hasError()) {
				conn.rollback();
				return;
			}
			conn.commit();
			controlSelect();
			
		} catch (Exception e) {
			setExpjExceptionMsg(e);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
		return;
	}

	/**
	 * Explanner Ja�AExplanner JaScm�̍X�V����
	 * @throws BusinessProcessException
	 * @throws FoundationException
	 */
	public void updateOfJa() throws BusinessProcessException, FoundationException {
		try {
			/* �g�����U�N�V�����J�n */
			conn.beginTransWeb();
			
			// ���|�Ǘ����C���X�g�[������Ă��邩�̃t���O
			// true �C���X�g�[������Ă���
			// false �C���X�g�[������Ă��Ȃ�
			boolean isUrikakeInstFlg = false;
			
			//�`�[�ԍ����v��ς݂��̃t���O
			//�v��ς� = true 
			//���v�� = false
			boolean checkSlip = false;
			
			//�`�[�ԍ����擾���邩�̋敪
			//���|�Ǘ����C���X�g�[������Ă��Ȃ��ꍇ = 1
			//�������тɂ̂ݓ`�[�ԍ������݂���ꍇ = 2
			//���|�g�����w�b�_�ɓ`�[�ԍ������݂���ꍇ = 3
			//���|�����w�b�_�ɓ`�[�ԍ������݂���ꍇ = 4
			int pros = 0;
			
			//���ʕ��i�N���X
			common = new Common(conn, sysUSER_CD, submitScreen, getSalesPLANT_CD(), getsysCOMPANY_CD());
			
			// ���|�Ǘ����C���X�g�[������Ă��邩�̃`�F�b�N
			List instOptList = entity.mSYS_INSTALL_OPTIONS_B.read(conn, struct);
			if (instOptList.isEmpty()) {
				// ���|�Ǘ����C���X�g�[������Ă��Ȃ��B
				isUrikakeInstFlg = false;
			} else {
				// ���|�Ǘ����C���X�g�[������Ă���B
				isUrikakeInstFlg = true;
			}
			// ��`�[�ԍ�����A[���������]�ɑ��݂��Ȃ��ꍇ
			List modifyList = entity.mT_SALES_TEMP.read(conn, struct);
			if (modifyList.isEmpty()) {
				setErrorMessage("ZZ01105");
				return;
			}
			
			// [���������]."�X�V��" != ��X�V���(hidden�g�p)�̏ꍇ
			if (!(((KR0070010Struct) modifyList.get(0)).getMODIFY_COUNT()).equals(struct.getMODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
				return;
			}
			
			//���ʕ��i�Ŕ���v��ς݂����肷��
			checkSlip = common.excSalesCheck(struct.getSLIP_CD());
			// �������IF�Ώۃt���O
			if(checkSlip) {
				struct.setSALES_IF_FLG("1");
			} else {
				struct.setSALES_IF_FLG("0");
			}
			
			// [���������]���R�[�h�ɂ̍폜�t���O�𗧂Ă�O��
			// [���������]�i�ԓ`�j�o�^�p�f�[�^�𐶐�
			KR0070010Struct akaRecordStruct = createAkaRecord();
			
			//[���������]�̃��R�[�h��_���폜����
			entity.mT_SALES_TEMP_Delete.update(conn, struct);
			
			List arLedgerHTrnList = null;
			List arLedgerHList = null;
			
			if (isUrikakeInstFlg) {
				// ���|�Ǘ����C���X�g�[������Ă���ꍇ
				arLedgerHTrnList = entity.mT_AR_LEDGER_H_TRN_CHECK.read(conn, struct);
				if (!arLedgerHTrnList.isEmpty()) {
					// [���|���g�����w�b�_]�ɓ`�[�ԍ������݂���ꍇ
					pros = 3;
				} else {
					arLedgerHList = entity.mT_AR_LEDGER_H_CHECK.read(conn, struct);
					if (!arLedgerHList.isEmpty()) {
						// [���|�������w�b�_]�ɓ`�[�ԍ������݂���ꍇ
						pros = 4;
					} else {
						// [���|���g�����w�b�_]�ɂ�[���|���g�����w�b�_]�ɂ��`�[�ԍ������݂��Ȃ�
						pros = 2;
					}
				}
			} else {
				// ���|�Ǘ����C���X�g�[������Ă��Ȃ��ꍇ
				pros = 1;
			}
			// �����̔ԗp
			common = new Common(conn,sysUSER_CD, sp.getProcId(), getSalesPLANT_CD(), getsysCOMPANY_CD());
			if ("Ja".equals(getExplannerFlag())) {
				// ������ъǗ��ԍ�(�A��)
				List salesSeqNoList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
				akaRecordStruct.setSALES_SEQ_NO(((KR0070010Struct) salesSeqNoList.get(0)).getSALES_SEQ_NO());
			} else {
				akaRecordStruct.setSALES_SEQ_NO(common.getNo());
			}
			
			//�`�[�ԍ����擾
			if (pros == 1 || pros == 2 || pros == 3) {
				akaRecordStruct.setSLIP_CD(struct.getSLIP_CD());
			} else {
				// �ԓ`�[�ԍ��������̔�
				if ("Ja".equals(getExplannerFlag())) {
					akaRecordStruct.setSLIP_CD(common.getSLIP_CD());
				} else {
					akaRecordStruct.setSLIP_CD(common.getSCM_SLIP_CD());
				}
			}
			
			// ���`�[�ԍ�
			akaRecordStruct.setORG_SLIP_CD(struct.getSLIP_CD());
			// �������IF�Ώۃt���O
			akaRecordStruct.setSALES_IF_FLG(struct.getSALES_IF_FLG());
			// [���������]�i�ԓ`�j��o�^
			if ("Ja".equals(getExplannerFlag())) {
				entity.mAKA_T_SALES_TEMP_Ja.create(conn, akaRecordStruct);
			} else {
				entity.mT_SALES_TEMP.create(conn, akaRecordStruct);
			}
			
			// [���������]�i���`�j�o�^�p�f�[�^�𐶐�
			KR0070010Struct kuroRecordStruct = createKuroRecord();
			if (msgStruct.hasError()) {
				return;
			}
			if ("Ja".equals(getExplannerFlag())) {
				// ������ъǗ��ԍ�(�A��)
				List salesSeqNoList2 = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
				kuroRecordStruct.setSALES_SEQ_NO(((KR0070010Struct) salesSeqNoList2.get(0)).getSALES_SEQ_NO());
			} else {
				kuroRecordStruct.setSALES_SEQ_NO(common.getNo());
			}
			
			// �`�[�ԍ����擾
			if (pros == 1 || pros == 2 || pros == 3) {
				kuroRecordStruct.setSLIP_CD(struct.getSLIP_CD());
			} else {
				// ���`�[�ԍ��������̔�
				if ("Ja".equals(getExplannerFlag())) {
					kuroRecordStruct.setSLIP_CD(common.getSLIP_CD());
				} else {
					kuroRecordStruct.setSLIP_CD(common.getSCM_SLIP_CD());
				}
			}
			
			// ���`�[�ԍ�
			kuroRecordStruct.setORG_SLIP_CD(struct.getSLIP_CD());
			// ������v��敪
			kuroRecordStruct.setTEMP_SALES_TYP("2");
						
			// [���������]�i���`�j��o�^
			if ("Ja".equals(getExplannerFlag())) {
				entity.mAKA_T_SALES_TEMP_Ja.create(conn, kuroRecordStruct);
			} else {
				entity.mT_SALES_TEMP.create(conn, kuroRecordStruct);
			}
			if (pros == 4) {
				// ��݌Ɏ󒍂̓`�[�ԍ��ύX
				updateSlipCd(kuroRecordStruct.getSLIP_CD());
			}
			
			// ����v��ς݂̏ꍇ�A[�������]�ɓo�^����
			if(checkSlip){
				if ("Ja".equals(getExplannerFlag())) {
					common.excSalesConf(struct.getSLIP_CD(), common.EXCSALESCONF);
				} else {
					common.excSalesConf(struct.getSLIP_CD(), common.EXCSALESCONFSCM);
				}
			}
			// ���|�Ǘ��T�^�e(�����i�p)�̌ďo
			if(isUrikakeInstFlg && checkSlip){
				ArIf arIfmp = new ArIf(conn, "2");
				arIfmp.setParameter("7", struct.getsUser_ID(), struct.getSLIP_CD(), akaRecordStruct.getSLIP_CD(), kuroRecordStruct.getSLIP_CD(), struct.getTAX_CD());
				String msgNo = arIfmp.execute();
				if (!"0".equals(msgNo)) {
					setErrorMessage(msgNo);
					conn.rollback();
					return;
				}
			}
			
			// ����ŃR�[�h�ύX
			updateTaxCd();
			if (msgStruct.hasError()) {
				conn.rollback();
				return;
			}
			
			conn.commit();
			
			// �o�^�������`�̓`�[�ԍ��ŉ�ʂ��Č���
			struct.setSLIP_CD(kuroRecordStruct.getSLIP_CD());
			controlSelect();
		} catch (Exception e) {
			setExpjExceptionMsg(e);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
		return;
	}
	
	/**
	 * Explanner Jf�̍X�V
	 * @throws BusinessProcessException
	 * @throws FoundationException
	 */
	public void updateOfJf() throws BusinessProcessException, FoundationException{
		try {
			/* �g�����U�N�V�����J�n */
			conn.beginTransWeb();
			
			List modifyList = entity.mT_SALES_MODIFY_Jf.read(conn, struct);
			if (modifyList.isEmpty()) {
				setErrorMessage("ZZ01105");
				return;
			}
			KR0070010Struct modifyStruct = (KR0070010Struct) modifyList.get(0);
			if (!modifyStruct.getH_MODIFY_COUNT().equals(struct.getH_MODIFY_COUNT()) || !modifyStruct.getMODIFY_COUNT().equals(struct.getMODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
				return;
			}
			
			
			// �ϐ��錾
			KR0070010Struct salesStruct = new KR0070010Struct();

			//  �u���|�Ǘ��v�T�u�V�X�e�����������A�܂��́u���|�Ǘ��v�T�u�V�X�e�������� ���� [���|���g�����w�b�_]�ɑ��݂���ꍇ
			List installOptionsList = entity.mSYS_INSTALL_OPTIONS_B.read(conn, struct);
			List tarhList = entity.mT_AR_LEDGER_H_TRN_Jf.read(conn, struct);// [���|���g�����w�b�_]
			List tarlList = entity.mT_AR_LEDGER_H_Jf.read(conn, struct);// [���|�������w�b�_]
			

			//Ai�A�g���肩���M�ς̏ꍇ��[�������]�ԍ����ׂ��쐬���A���|I/F�����s���Ȃ�		
			if("1".equals(getInstallFlg()) && "1".equals(struct.getAI_AR_IF_FLG())){
				//������уw�b�_][�������]�ɐԍ����X�V����B
				// [������уw�b�_][�������]��_���폜����B
				entity.mT_SALES_H_Delete.update(conn, struct);
				entity.mT_SALES_Delete.update(conn, struct);

				// [������уw�b�_]�̐ԓ`��o�^����B
				List listSalesH = entity.mT_SALES_H_Delete.read(conn, struct);
				KR0070010Struct salesHStruct = (KR0070010Struct) listSalesH.get(0);
				// ������ѓ`�[�ԍ� �����̔ԁh SHN�h &
				// RACLE_SEQUENCE[SEQ_SALES_H_NO]�iNEXTVAL�j
				List salesSeqNoList = entity.mSEQ_SALES_H_NO.read(conn, struct);
				KR0070010Struct salesSeqNoStruct = (KR0070010Struct) salesSeqNoList.get(0);
				salesHStruct.setSALES_H_NO(salesSeqNoStruct.getSALES_H_NO());
				salesHStruct.setsSysdate(struct.getsSysdate());
				salesHStruct.setsUser_ID(sysUSER_CD);
				entity.mT_SALES_H_Delete.create(conn, salesHStruct);

				// [�������]�̐ԓ`��o�^����
				List listSales = entity.mT_SALES_Delete.read(conn, struct);
				KR0070010Struct structSales = (KR0070010Struct) listSales.get(0);
				// ������ъǗ��ԍ�
				List salesseqList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
				KR0070010Struct salesseqStruct = (KR0070010Struct) salesseqList.get(0);
				structSales.setSALES_SEQ_NO(salesseqStruct.getSALES_SEQ_NO());
				structSales.setsSysdate(struct.getsSysdate());
				structSales.setsUser_ID(sysUSER_CD);
				// ���F��
				structSales.setAPPR_FLG("3");
				// ���F��
				structSales.setAPPR_ID(getsysUSER_CD());
				// ���F���t
				structSales.setAPPR_DATE(getBusinessOprDate());
				// �ۗ����R
				structSales.setRESERVE_CAUSE(null);
				entity.mT_SALES_Delete.create(conn, structSales);

				// ���͂��ꂽ������[������уw�b�_]�̍��`��o�^����B
				KR0070010Struct createSalesHStruct = createSalesH();
				// ������ѓ`�[�ԍ�(�A��)
				salesSeqNoList = entity.mSEQ_SALES_H_NO.read(conn, struct);
				salesSeqNoStruct = (KR0070010Struct) salesSeqNoList.get(0);
				createSalesHStruct.setSALES_H_NO(salesSeqNoStruct.getSALES_H_NO());
				createSalesHStruct.setSHIP_DLV_H_NO(struct.getSLIP_CD());
				entity.mT_SALES_H.create(conn, createSalesHStruct);

				// [�������]���`��o�^����
				// ������ъǗ��ԍ��h SSN�h & RACLE_SEQUENCE[SEQ_SALES_SEQ_NO]�iNEXTVAL�j
				salesStruct = createSales();
				salesseqList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
				salesseqStruct = (KR0070010Struct) salesseqList.get(0);
				salesStruct.setSALES_SEQ_NO(salesseqStruct.getSALES_SEQ_NO());
				// ������ѓ`�[�ԍ� [������уw�b�_].�h������ѓ`�[�ԍ��h
				salesStruct.setSALES_H_NO(salesSeqNoStruct.getSALES_H_NO());
				// �o�ה[�i�E���̑�����`�[�ԍ� [������уw�b�_].�h�o�ה[�i�E���̑�����`�[�ԍ��h
				salesStruct.setSHIP_DLV_H_NO(struct.getSLIP_CD());
				entity.mT_SALES_Jf.create(conn, salesStruct);
			} else {
				// �u���|�Ǘ��v�T�u�V�X�e�����������̏ꍇ
				if (installOptionsList.isEmpty()) {
					// [������уw�b�_]���X�V����
					KR0070010Struct salesHStruct = createSalesH();
					salesHStruct.setSHIP_DLV_H_NO(struct.getSLIP_CD());
					if (salesHStruct != null) {
						entity.mT_SALES_H.update(conn, salesHStruct);
					}
					// [�������]���X�V����
					salesStruct = createSales();
					salesStruct.setSHIP_DLV_H_NO(struct.getSLIP_CD());
					if (salesStruct != null) {
						entity.mT_SALES_Jf.update(conn, salesStruct);
					}
				} else if (!tarhList.isEmpty()) {
	
					// �u���|�Ǘ��v�T�u�V�X�e�������� ���� [���|���g�����w�b�_]�ɑ��݂���ꍇ
					// [������уw�b�_]���X�V����
					KR0070010Struct salesHStruct = createSalesH();
					salesHStruct.setSHIP_DLV_H_NO(struct.getSLIP_CD());
					if (salesHStruct != null) {
						entity.mT_SALES_H.update(conn, salesHStruct);
					}
					// [�������]���X�V����
					salesStruct = createSales();
					salesStruct.setSHIP_DLV_H_NO(struct.getSLIP_CD());
					if (salesStruct != null) {
						entity.mT_SALES_Jf.update(conn, salesStruct);
					}
				} else if (!tarlList.isEmpty()) {
	
					// �B �u���|�Ǘ��v�T�u�V�X�e�������� ����
					// [���|�������w�b�_]�ɑ��݂���ꍇ�A�ȉ��̏����ŁA[������уw�b�_][�������]�ɐԍ����X�V����B
					// [������уw�b�_][�������]��_���폜����B
					entity.mT_SALES_H_Delete.update(conn, struct);
					entity.mT_SALES_Delete.update(conn, struct);
	
					// [������уw�b�_]�̐ԓ`��o�^����B
					List listSalesH = entity.mT_SALES_H_Delete.read(conn, struct);
					KR0070010Struct salesHStruct = (KR0070010Struct) listSalesH.get(0);
					// ������ѓ`�[�ԍ� �����̔ԁh SHN�h &
					// RACLE_SEQUENCE[SEQ_SALES_H_NO]�iNEXTVAL�j
					List salesSeqNoList = entity.mSEQ_SALES_H_NO.read(conn, struct);
					KR0070010Struct salesSeqNoStruct = (KR0070010Struct) salesSeqNoList.get(0);
					salesHStruct.setSALES_H_NO(salesSeqNoStruct.getSALES_H_NO());
					entity.mT_SALES_H_Delete.create(conn, salesHStruct);
	
					// [�������]�̐ԓ`��o�^����
					List listSales = entity.mT_SALES_Delete.read(conn, struct);
					KR0070010Struct structSales = (KR0070010Struct) listSales.get(0);
					// ������ъǗ��ԍ�
					List salesseqList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
					KR0070010Struct salesseqStruct = (KR0070010Struct) salesseqList.get(0);
					structSales.setSALES_SEQ_NO(salesseqStruct.getSALES_SEQ_NO());
					structSales.setsSysdate(struct.getsSysdate());
					structSales.setsUser_ID(sysUSER_CD);
					// ���F��
					structSales.setAPPR_FLG("3");
					// ���F��
					structSales.setAPPR_ID(getsysUSER_CD());
					// ���F���t
					structSales.setAPPR_DATE(getBusinessOprDate());
					// �ۗ����R
					structSales.setRESERVE_CAUSE(null);
					entity.mT_SALES_Delete.create(conn, structSales);
	
					// ���͂��ꂽ������[������уw�b�_]�̍��`��o�^����B
					KR0070010Struct createSalesHStruct = createSalesH();
					// ������ѓ`�[�ԍ�(�A��)
					salesSeqNoList = entity.mSEQ_SALES_H_NO.read(conn, struct);
					salesSeqNoStruct = (KR0070010Struct) salesSeqNoList.get(0);
					createSalesHStruct.setSALES_H_NO(salesSeqNoStruct.getSALES_H_NO());
					createSalesHStruct.setSHIP_DLV_H_NO(struct.getSLIP_CD());
					entity.mT_SALES_H.create(conn, createSalesHStruct);
	
					// [�������]���`��o�^����
					// ������ъǗ��ԍ��h SSN�h & RACLE_SEQUENCE[SEQ_SALES_SEQ_NO]�iNEXTVAL�j
					salesStruct = createSales();
					salesseqList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
					salesseqStruct = (KR0070010Struct) salesseqList.get(0);
					salesStruct.setSALES_SEQ_NO(salesseqStruct.getSALES_SEQ_NO());
					// ������ѓ`�[�ԍ� [������уw�b�_].�h������ѓ`�[�ԍ��h
					salesStruct.setSALES_H_NO(salesSeqNoStruct.getSALES_H_NO());
					// �o�ה[�i�E���̑�����`�[�ԍ� [������уw�b�_].�h�o�ה[�i�E���̑�����`�[�ԍ��h
					salesStruct.setSHIP_DLV_H_NO(struct.getSLIP_CD());
					entity.mT_SALES_Jf.create(conn, salesStruct);
				}

				// �C �u���|�Ǘ��v�T�u�V�X�e�����C���X�g�[������Ă���ꍇ�A���|�Ǘ��h�^�e�i���i�j �� �Ăяo���A[���|���g����] ���X�V����B
				if (!installOptionsList.isEmpty()) {
					List resultList =null;		
					//���|IF�������s
					
					common = new Common(conn, sysUSER_CD, sp.getProcId(), getSalesPLANT_CD(), getsysCOMPANY_CD());
					
					//���|IF�������s
					resultList= common.excArfIFFd(3, 3, struct.getSLIP_CD(), struct.getTAX_CD());
					
					// ����I������
					if (common.getResultStatus().intValue() != STATUS_NORMAL) {
						setErrorMessage(resultList.get(0).toString());
						return;
						
					}
				}		
			}		
			
			// ����ŃR�[�h�ύX
			updateTaxCd();
			if (msgStruct.hasError()) {
				conn.rollback();
				return;
			}
			
			conn.commit();

			// ��ʍĕ\��
			controlSelect();

		} catch (Exception e) {
			setExpjExceptionMsg(e);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
		return;
	}
	
	/**
	 * Explanner J�̍폜
	 * @throws BusinessProcessException
	 * @throws FoundationException
	 */
	public void deleteOfJ() throws BusinessProcessException, FoundationException{
		try {
			/* �g�����U�N�V�����J�n */
			conn.beginTransWeb();
			
			// ��`�[�ԍ�����A[�������]�ɑ��݂��Ȃ��ꍇ
			List modifyList = entity.mT_SALES.read(conn, struct);
			if (modifyList.isEmpty()) {
				setErrorMessage("ZZ01105");
				return;
			}
			KR0070010Struct modifyStruct = (KR0070010Struct) modifyList.get(0);
			// [�������]."�X�V��" != ��X�V���(hidden�g�p)�̏ꍇ
			if (!modifyStruct.getMODIFY_COUNT().equals(struct.getMODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
				return;
			}
			
			//Add NEC 2014.06.18 STR
			//���|�������Ă��Ȃ��ꍇ�A�V�X�e���p�����[�^������я��F�`�F�b�N (EJ�̂�)
			if("J".equals(getExplannerFlag()) ) {
            	chkAprSales();
            	if (msgStruct.hasError()) {                	 
            	    return;
            	}
			}
			//Add NEC 2014.06.18 END
			
			List installOptionsList = entity.mSYS_INSTALL_OPTIONS_B.read(conn, struct);
			List arLedgerHTrnList = entity.mT_AR_LEDGER_H_TRN_CHECK.read(conn, struct);
			List arLedgerHList = entity.mT_AR_LEDGER_H_CHECK.read(conn, struct);
			
		
			if (installOptionsList.isEmpty()
					|| (!installOptionsList.isEmpty() && !arLedgerHTrnList.isEmpty())) {
				// ���|�Ǘ����C���X�g�[������Ă��Ȃ��ꍇ
				// �܂��́A���|�Ǘ����C���X�g�[������Ă��邩�A[���|���g�����w�b�_]."�`�[���" = 14 �̏ꍇ
				
				// [����`�[]�i�ԓ`�j�o�^�p�f�[�^�𐶐�
				KR0070010Struct creditRecordStruct = createCreditRecord();
				// ������ъǗ��ԍ�(�A��)
				List salesSeqNoList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
				KR0070010Struct salesSeqNoStruct = (KR0070010Struct) salesSeqNoList.get(0);
				creditRecordStruct.setSALES_SEQ_NO(salesSeqNoStruct.getSALES_SEQ_NO());
				// �`�[�ԍ��͢�`�[�ԍ�����g�p
				creditRecordStruct.setSLIP_CD(struct.getSLIP_CD());
				// ���`�[�ԍ�
				creditRecordStruct.setORG_SLIP_CD(struct.getSLIP_CD());
				// [����`�[]�i�ԓ`�j��o�^
				entity.mT_SALES.create(conn, creditRecordStruct);
				
				// [����`�[]�i���`�j��_���폜
				entity.mT_SALES_Delete.update(conn, struct);
				
				// ��݌Ɏ󒍂̓`�[�ԍ��ύX
				updateSlipCd(null);
				
				//Ai�A�g����܂��͔��|�Ǘ����C���X�g�[������Ă��Ȃ��ꍇ�͔��|I/F�����s���Ȃ�	
				if (!"1".equals(getInstallFlg()) && 
						!installOptionsList.isEmpty()) {
					ArIf arIf = new ArIf(conn, "1");
					arIf.setParameter("8", struct.getsUser_ID(), struct.getSLIP_CD(),
							creditRecordStruct.getSLIP_CD(), null, struct.getTAX_CD());
					String msgNo = arIf.execute();
					if (!"0".equals(msgNo)) {
						setErrorMessage(msgNo);
						conn.rollback();
						return;
					}
				}
				// ��ʂ��N���A
				initializeAll();
			} else if (!installOptionsList.isEmpty() && !arLedgerHList.isEmpty()) {
				// ���|�Ǘ����C���X�g�[������Ă��邩�A[���|�������w�b�_]."�`�[���" = 14 �̏ꍇ
				
				// [����`�[]�i�ԓ`�j�o�^�p�f�[�^�𐶐�
				KR0070010Struct creditRecordStruct = createCreditRecord();
				// ������ъǗ��ԍ�(�A��)
				List salesSeqNoList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
				KR0070010Struct salesSeqNoStruct = (KR0070010Struct) salesSeqNoList.get(0);
				creditRecordStruct.setSALES_SEQ_NO(salesSeqNoStruct.getSALES_SEQ_NO());
				// �`�[�ԍ��������̔�
				Common slipCdNum =
						new Common(conn, sysUSER_CD, sp.getProcId(), getSalesPLANT_CD(), getsysCOMPANY_CD());
				creditRecordStruct.setSLIP_CD(slipCdNum.getSLIP_CD());
				// ���`�[�ԍ�
				creditRecordStruct.setORG_SLIP_CD(struct.getSLIP_CD());
				// [����`�[]�i�ԓ`�j��o�^
				entity.mT_SALES.create(conn, creditRecordStruct);
				
				// [����`�[]�i���`�j��_���폜
				entity.mT_SALES_Delete.update(conn, struct);
				
				// ��݌Ɏ󒍂̓`�[�ԍ��ύX
				updateSlipCd(null);
				
				//Ai�A�g����̏ꍇ�͔��|I/F�����s���Ȃ�	
				if (!"1".equals(getInstallFlg())) {
					ArIf arIf = new ArIf(conn, "2");
					arIf.setParameter("8", struct.getsUser_ID(), struct.getSLIP_CD(),
							creditRecordStruct.getSLIP_CD(), null, struct.getTAX_CD());
					String msgNo = arIf.execute();
					if (!"0".equals(msgNo)) {
						setErrorMessage(msgNo);
						conn.rollback();
						return;
					}
				}
				// ��ʂ��N���A
				initializeAll();
			}
			conn.commit();
		} catch (Exception e) {
			setExpjExceptionMsg(e);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
	}
	
	
	/**
	 * �폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	/**
	 * Explanner Ja�AExplanner JaScm�̍폜
	 * @throws BusinessProcessException
	 * @throws FoundationException
	 */
	public void deleteOfJa() throws BusinessProcessException, FoundationException {
		try {
			/* �g�����U�N�V�����J�n */
			conn.beginTransWeb();
			// ���|�Ǘ����C���X�g�[������Ă��邩�̃t���O
			// true �C���X�g�[������Ă���
			// false �C���X�g�[������Ă��Ȃ�
			boolean isUrikakeInstFlg = false;
			
			//�`�[�ԍ����v��ς݂��̃t���O
			//�v��ς� = true 
			//���v�� = false
			boolean checkSlip = false;
			
			//�`�[�ԍ����擾���邩�̋敪
			//���|�Ǘ����C���X�g�[������Ă��Ȃ��ꍇ = 1
			//�������тɂ̂ݓ`�[�ԍ������݂���ꍇ = 2
			//���|�g�����w�b�_�ɓ`�[�ԍ������݂���ꍇ = 3
			//���|�����w�b�_�ɓ`�[�ԍ������݂���ꍇ = 4
			int pros = 0;
			
			//���ʕ��i�N���X
			common = new Common(conn, sysUSER_CD, sp.getProcId(), getSalesPLANT_CD(), getsysCOMPANY_CD());
			
			// ���|�Ǘ����C���X�g�[������Ă��邩�̃`�F�b�N
			List instOptList = entity.mSYS_INSTALL_OPTIONS_B.read(conn, struct);
			if (instOptList.isEmpty()) {
				// ���|�Ǘ����C���X�g�[������Ă��Ȃ��B
				isUrikakeInstFlg = false;
			} else {
				// ���|�Ǘ����C���X�g�[������Ă���B
				isUrikakeInstFlg = true;
			}
						
			// ��`�[�ԍ�����A[���������]�ɑ��݂��Ȃ��ꍇ
			List modifyList = entity.mT_SALES_TEMP.read(conn, struct);
			if (modifyList.isEmpty()) {
				setErrorMessage("ZZ01105");
				return;
			}
			
			// [���������]."�X�V��" != ��X�V���(hidden�g�p)�̏ꍇ
			if (!(((KR0070010Struct) modifyList.get(0)).getMODIFY_COUNT()).equals(struct.getMODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
				return;
			}
			
			//���ʕ��i�Ŕ���v��ς݂����肷��
			checkSlip = common.excSalesCheck(struct.getSLIP_CD());
			
			if(checkSlip) {
				struct.setSALES_IF_FLG("1");
			} else {
				struct.setSALES_IF_FLG("0");
			}
			
			// [���������]���R�[�h�ɂ̍폜�t���O�𗧂Ă�O��
			// [���������]�i�ԓ`�j�o�^�p�f�[�^�𐶐�
			KR0070010Struct akaRecordStruct = createAkaRecord();
			
			//[���������]�̃��R�[�h��_���폜����
			entity.mT_SALES_TEMP_Delete.update(conn, struct);
			
			// ��݌Ɏ󒍂̓`�[�ԍ��ύX
			updateSlipCd(null);

			List arLedgerHTrnList = null;
			List arLedgerHList = null;
			
			if (isUrikakeInstFlg ) {
				// ���|�Ǘ����C���X�g�[������Ă���ꍇ
				arLedgerHTrnList = entity.mT_AR_LEDGER_H_TRN_CHECK.read(conn, struct);
				if (!arLedgerHTrnList.isEmpty()) {
					// [���|���g�����w�b�_]�ɓ`�[�ԍ������݂���ꍇ
					pros = 3;
				} else {
					arLedgerHList = entity.mT_AR_LEDGER_H_CHECK.read(conn, struct);
					if (!arLedgerHList.isEmpty()) {
						// [���|�������w�b�_]�ɓ`�[�ԍ������݂���ꍇ
						pros = 4;
					} else {
						// [���|���g�����w�b�_]�ɂ�[���|���g�����w�b�_]�ɂ��`�[�ԍ������݂��Ȃ�
						pros = 2;
					}
				}
			} else {
				// ���|�Ǘ����C���X�g�[������Ă��Ȃ��ꍇ
				pros = 1;
			}
			
			// ������ъǗ��ԍ�(�A��)
			List salesSeqNoList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
			akaRecordStruct.setSALES_SEQ_NO(((KR0070010Struct) salesSeqNoList.get(0)).getSALES_SEQ_NO());
			
			//�`�[�ԍ����擾
			if (pros == 1 || pros == 2 || pros == 3) {
				akaRecordStruct.setSLIP_CD(struct.getSLIP_CD());
			} else {
				// �ԓ`�[�ԍ��������̔�
				if ("Ja".equals(getExplannerFlag())) {
					akaRecordStruct.setSLIP_CD(common.getSLIP_CD());
				} else {
					akaRecordStruct.setSLIP_CD(common.getSCM_SLIP_CD());
				}
			}
			
			// ���`�[�ԍ�
			akaRecordStruct.setORG_SLIP_CD(struct.getSLIP_CD());
			
			if(checkSlip) {
				akaRecordStruct.setSALES_IF_FLG("1");
			} else {
				akaRecordStruct.setSALES_IF_FLG("0");
			}
			
			// [���������]�i�ԓ`�j��o�^
			if ("Ja".equals(getExplannerFlag())) {
				entity.mAKA_T_SALES_TEMP_Ja.create(conn, akaRecordStruct);
			} else {
				entity.mT_SALES_TEMP.create(conn, akaRecordStruct);
			}
			
			// ����v��ς݂̏ꍇ�A[�������]�ɓo�^����
			if(checkSlip){
				if ("Ja".equals(getExplannerFlag())) {
					common.excSalesConf(struct.getSLIP_CD(), common.EXCSALESCONF);
				} else {
					common.excSalesConf(struct.getSLIP_CD(), common.EXCSALESCONFSCM);
				}
			}
			//------------------------------------------------------------------------------------------------------
			// ���|�Ǘ��T�^�e(�����i�p)�̌ďo
			if(isUrikakeInstFlg && checkSlip){
				ArIf arIfmp = new ArIf(conn, "2");
				arIfmp.setParameter("8", struct.getsUser_ID(), struct.getSLIP_CD(), akaRecordStruct.getSLIP_CD(), null, struct.getTAX_CD());
				String msgNo = arIfmp.execute();
				if (!"0".equals(msgNo)) {
					setErrorMessage(msgNo);
					conn.rollback();
					return;
				}
			}
			// ��ʂ��N���A
			initializeAll();
			conn.commit();
		} catch (Exception e) {
			setExpjExceptionMsg(e);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
	}
	
	/**
	 * Explanner Jf�̍폜
	 * @throws BusinessProcessException
	 * @throws FoundationException
	 */
	public void deleteOfJf() throws BusinessProcessException, FoundationException{
		try {
			/* �g�����U�N�V�����J�n */
			conn.beginTransWeb();
			
			List modifyList = entity.mT_SALES_MODIFY_Jf.read(conn, struct);
			if (modifyList.isEmpty()) {
				setErrorMessage("ZZ01105");
				return;
			}
			KR0070010Struct modifyStruct = (KR0070010Struct) modifyList.get(0);
			if (!modifyStruct.getH_MODIFY_COUNT().equals(struct.getH_MODIFY_COUNT()) || !modifyStruct.getMODIFY_COUNT().equals(struct.getMODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
				return;
			}
			

			// �@ [�������]���X�V����B
			entity.mT_SALES_Delete.update(conn, struct);
			entity.mT_SALES_H_Delete.update(conn, struct);
			
			// ��݌Ɏ󒍂̓`�[�ԍ��ύX
			updateSlipCd(null);

			// �A [������уw�b�_]�̐ԓ`��o�^����B
			List listSalesH = entity.mT_SALES_H_Delete.read(conn, struct);
			if (!listSalesH.isEmpty()) {
				KR0070010Struct structSalesH = (KR0070010Struct) listSalesH.get(0);
				// ������ѓ`�[�ԍ� �����̔ԁh SHN�h & ORACLE_SEQUENCE[SEQ_SALES_H_NO]�iNEXTVAL�j
				List salesSeqNoList = entity.mSEQ_SALES_H_NO.read(conn, struct);
				KR0070010Struct salesSeqNoStruct = (KR0070010Struct) salesSeqNoList.get(0);
				structSalesH.setSALES_H_NO(salesSeqNoStruct.getSALES_H_NO());
				structSalesH.setsSysdate(struct.getsSysdate());
				structSalesH.setsUser_ID(sysUSER_CD);
				entity.mT_SALES_H_Delete.create(conn, structSalesH);

				// �B [�������]�̐ԓ`��o�^����
				List listSales = entity.mT_SALES_Delete.read(conn, struct);
				if (!listSales.isEmpty()) {
					KR0070010Struct structSales = (KR0070010Struct) listSales.get(0);
					// ������ъǗ��ԍ�
					List salesseqList = entity.mSEQ_SALES_SEQ_NO.read(conn,struct);
					KR0070010Struct salesseqStruct = (KR0070010Struct) salesseqList.get(0);
					structSales.setSALES_SEQ_NO(salesseqStruct.getSALES_SEQ_NO());
					// ������ѓ`�[�ԍ�
					structSales.setSALES_H_NO(structSalesH.getSALES_H_NO());
					structSales.setsSysdate(struct.getsSysdate());
					structSales.setsUser_ID(sysUSER_CD);
					// ���F��
					structSales.setAPPR_FLG("3");
					// ���F��
					structSales.setAPPR_ID(getsysUSER_CD());
					// ���F���t
					structSales.setAPPR_DATE(getBusinessOprDate());
					// �ۗ����R
					structSales.setRESERVE_CAUSE(null);
					entity.mT_SALES_Delete.create(conn, structSales);
				}
			}

			//Ai�A�g����̏ꍇ�͔��|I/F�����s���Ȃ�	
			if (!"1".equals(getInstallFlg())) {		
				// �C �u���|�Ǘ��v�T�u�V�X�e�����C���X�g�[������Ă���ꍇ�A���|�Ǘ��h�^�e�i���i�j �� �Ăяo���A[���|���g����] ����
				// [���|������] ���X�V����B
				List installOptionsList = entity.mSYS_INSTALL_OPTIONS_B.read(conn, struct);
				if (!installOptionsList.isEmpty()) {
					List resultList =null;
					//���|IF�������s
					Common arfIFFd = new Common(conn, sysUSER_CD, sp.getProcId(), getSalesPLANT_CD(), getsysCOMPANY_CD());
					
					//���|IF�������s
					resultList= arfIFFd.excArfIFFd(3, 2, struct.getSLIP_CD(), struct.getTAX_CD());
					// ����I������
					if (arfIFFd.getResultStatus().intValue() != STATUS_NORMAL) {
						setErrorMessage(resultList.get(0).toString());
						return ;
					}
				}			
			}
			conn.commit();
			initializeAll();
		} catch (Exception e) {
			setExpjExceptionMsg(e);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
	}
	
	/**
	 * ��݌Ɏ󒍂̏���ŃR�[�h�ύX
	 * @throws FoundationException
	 * @throws SQLException
	 */
	private void updateTaxCd() throws FoundationException, SQLException {
		if (!struct.getTAX_CD().equals(struct.geth_TAX_CD())) {
			List modifyList = entity.mT_ODR_UNSTOCK.read(conn, struct);
			if (modifyList.isEmpty()) {
				setErrorMessage("ZZ01105");
				return;
			}
			KR0070010Struct modifyStruct = (KR0070010Struct) modifyList.get(0);
			if (!modifyStruct.getMODIFY_COUNT().equals(struct.getODR_MODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
				return;
			}
			// �쐬��
			struct.setsUser_ID(sysUSER_CD);
			entity.mT_ODR_UNSTOCK.update(conn, struct);
		}
	}
	
	/**
	 * ��݌Ɏ󒍂̓`�[�ԍ��ύX
	 * @throws FoundationException
	 * @throws SQLException
	 */
	private void updateSlipCd(String slipCd) throws FoundationException, SQLException {
			List modifyList = entity.mT_ODR_UNSTOCK.read(conn, struct);
			if (modifyList.isEmpty()) {
				setErrorMessage("ZZ01105");
				return;
			}
			KR0070010Struct modifyStruct = (KR0070010Struct) modifyList.get(0);
			if (!modifyStruct.getMODIFY_COUNT().equals(struct.getODR_MODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
				return;
			}
			KR0070010Struct updateStruct = new KR0070010Struct();
			// �쐬��
			updateStruct.setsUser_ID(sysUSER_CD);
			// �쐬��
			updateStruct.setsSysdate(struct.getsSysdate());
			updateStruct.setSLIP_CD(slipCd);
			updateStruct.setODR_NO(struct.getODR_NO());
			
			entity.mT_ODR_UNSTOCK_UPDATE_SLIP.update(conn, updateStruct);
			
			modifyList = entity.mT_ODR_UNSTOCK.read(conn, struct);
			if (modifyList.isEmpty()) {
				setErrorMessage("ZZ01105");
				return;
			}
			modifyStruct = (KR0070010Struct) modifyList.get(0);
			struct.setODR_MODIFY_COUNT(modifyStruct.getMODIFY_COUNT());
	}
	
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0070");
		logger.entering("KR0070010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
		try {
			// �󒍔ԍ��̃`�F�b�N
			List tempList = entity.mT_ODR_UNSTOCK.read(conn, struct);
			if (tempList.isEmpty()) {
				// "�󒍔ԍ�"��[��݌Ɏ�]."�󒍔ԍ�"�ɑ��݂��Ȃ��ꍇ
				setErrorMessage("KR00034");
				setReadStatus(NOT_FOUND);
				return;
			}
			//Add NEC Start 20140618
			if ("J".equals(getExplannerFlag())) {
				List pjOdrAlcList = entity.mselectT_PJ_ODR_ALC.read(conn, struct);
				if(!pjOdrAlcList.isEmpty()){	
					setErrorMessage("KQ00353");
					return;
				}
			}
			//Add NEC End   20140618
			List resultList = new ArrayList();
			// ��ЃR�[�h
			struct.setCOMPANY_CD(getsysCOMPANY_CD());
			
			if ("true".equals(struct.getrdoInsert())) {
				// �o�^�I���ꍇ
				resultList = entity.mselectOfInsert.read(conn, struct);
				
				if (!resultList.isEmpty()) {
					KR0070010Struct slipCdStruct = (KR0070010Struct) resultList.get(0);
					// ��݌Ɏ󒍂̓`�[�ԍ������ݏꍇ
					if (slipCdStruct.getSLIP_CD() != null && !"".equals(slipCdStruct.getSLIP_CD())) {
						List checkList = new ArrayList();
						if ("J".equals(getExplannerFlag())) {
							checkList = entity.mT_SALES.read(conn, slipCdStruct);
						} else if ("Ja".equals(getExplannerFlag()) || "JaScm".equals(getExplannerFlag())) {
							slipCdStruct.setCOMPANY_CD(getsysCOMPANY_CD());
							checkList = entity.mT_SALES_TEMP.read(conn, slipCdStruct);
						} else if ("Jf".equals(getExplannerFlag())) {
							checkList = entity.mcheckSHIP_DLV_H_NO.read(conn, slipCdStruct);
						}
						if (!checkList.isEmpty()) {
							// ������т����ɑ��݂���̂œo�^�ł��܂���B
							setErrorMessage("KQ00350");
							setReadStatus(NOT_FOUND);
							return;
						}
						
					}
				}
			} else {
				// �X�V�E�폜�I���ꍇ
				if ("J".equals(getExplannerFlag())) {
					resultList = entity.mselectOfUpdateDeleteJ.read(conn, struct);
				} else if ("Ja".equals(getExplannerFlag()) || "JaScm".equals(getExplannerFlag())) {
					resultList = entity.mselectOfUpdateDeleteJa.read(conn, struct);
				} else if ("Jf".equals(getExplannerFlag())) {
					resultList = entity.mselectOfUpdateDeleteJf.read(conn, struct);
				}
			}
			
			if (resultList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setReadStatus(NOT_FOUND);
				return;
			}
			
			KR0070010Struct tempStruct = (KR0070010Struct) resultList.get(0);
			
			// ���z�󒍂̏ꍇ
			if ("1".equals(tempStruct.geth_ADD_ODR_FLG())) {
				if ("J".equals(getExplannerFlag())) {
					tempList = entity.mCHECK_ODR.read(conn, tempStruct);
				} else if ("Jf".equals(getExplannerFlag())) {
					tempList = entity.mCHECK_ODR_Jf.read(conn, tempStruct);
				} else {
					tempList = entity.mCHECK_ODR_Ja.read(conn, tempStruct);
				}
				if (tempList.isEmpty()) {
					setErrorMessage("KR00035");
					return;
				}
			}
			
			tempList = entity.mSYS_INSTALL_OPTIONS_B.read(conn, struct);
			if (tempList.isEmpty()) {
				if ("Ja".equals(getExplannerFlag()) || "JaScm".equals(getExplannerFlag())) {
					List checkList = new ArrayList();
					if ("Ja".equals(getExplannerFlag())) {
						checkList = entity.mT_SALES_Ja.read(conn, struct);
					} else {
						checkList = entity.mT_SALES_JaScm.read(conn, struct);
					}
					if (!checkList.isEmpty()) {
						tempStruct.setSTATUS(((KR0070010Struct)checkList.get(0)).getSTATUS());
					}
				}
				if (tempStruct.getSTATUS()!= null && !"".equals(tempStruct.getSTATUS())) {
					if (tempStruct.getSTATUS().compareTo("40") >= 0) {
						setErrorMessage("BD00027");
						setReadStatus(ERROR);
						return;
					}
				}
			}
			
			if ("true".equals(struct.getrdoUpdateDelete())) {
				checkT_AR_LEDGER_H();
				// �G���[���������ꍇ�͏����𒆒f
				if (msgStruct.hasError()) {
					setReadStatus(ERROR);
					return;
				}
			}

			// ��ʕ\��
			setShowValue(struct, tempStruct);
			setReadStatus(NORMAL);
			
		} catch (Exception e) {
			setExpjExceptionMsg(e);
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("KR0070010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �Čv�Z�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRecalc() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0070");
		logger.entering("KR0070010Control"+":USER="+struct.getsUser_ID(),"controlRecalc");
			//{{user_implement_dev:<controlRecalc>
		// ��ЃR�[�h
		struct.setCOMPANY_CD(getsysCOMPANY_CD());
		try {
			// ����v�㕔�喼
			struct.setORG_NAME(null);
			
			// ����v�㕔��R�[�h
			List checkList = entity.mM_ORG.read(conn, struct);
			if (checkList.isEmpty()) {
				setErrorMessage("KA00058");
				return;
			} else {
				// ����v�㕔�喼
				struct.setORG_NAME(((KR0070010Struct)checkList.get(0)).getORG_NAME());
			}
			// �c�ƒS���Җ�
			struct.setUSER_NAME(null);
			// �c�ƒS���҃R�[�h
			if (struct.getCUST_CHRG_PSN_CD() != null && !"".equals(struct.getCUST_CHRG_PSN_CD())) {
				if ("JaScm".equals(getExplannerFlag())){
					checkList = entity.mUSER_MST_SCM.read(conn, struct);
				} else {
					checkList = entity.mUSER_MST.read(conn, struct);
				}
				if (checkList.isEmpty()) {
					setErrorMessage("KQ20006");
					return;
				} else {
					// �c�ƒS���Җ�
					struct.setUSER_NAME(((KR0070010Struct)checkList.get(0)).getUSER_NAME());
				}
			}
			
			// �i��
			if (struct.getITEM_CD() != null && !"".equals(struct.getITEM_CD()) ) {
				checkList = entity.mM_ITEM.read(conn, struct);
				if (!checkList.isEmpty()) {
					KR0070010Struct itemStruct = (KR0070010Struct) checkList.get(0);
					// �i�ږ�
					if (struct.getITEM_NAME() == null || "".equals(struct.getITEM_NAME())) {
						struct.setITEM_NAME(itemStruct.getITEM_NAME());
					}
					// �v�ʒP��
					struct.setSTOCK_UNIT(itemStruct.getSTOCK_UNIT());
					// �݌ɐ��P�ʋ敪
					struct.setUNIT_QTY_TYP(itemStruct.getUNIT_QTY_TYP());
				} else {
					// �i�ږ�
					if (struct.getITEM_NAME() == null || "".equals(struct.getITEM_NAME())) {
						struct.setITEM_NAME(getItemName());
					}
					// �v�ʒP��
					struct.setSTOCK_UNIT(null);
					// �݌ɐ��P�ʋ敪
					struct.setUNIT_QTY_TYP(null);
				}
			} else {
				// �i�ږ�
				if (struct.getITEM_NAME() == null || "".equals(struct.getITEM_NAME())) {
					struct.setITEM_NAME(getItemName());
				}
				// �v�ʒP��
				struct.setSTOCK_UNIT(null);
				// �݌ɐ��P�ʋ敪
				struct.setUNIT_QTY_TYP(null);
			}
			
			// ���Ӑ�R�[�h
			List custList = entity.mM_CUST.read(conn, struct);
			if (!custList.isEmpty()) {
				KR0070010Struct custStruct = (KR0070010Struct) custList.get(0);
				// ���Ӑ於
				struct.setCUST_NAME(custStruct.getCUST_NAME());
				// �ʉ݃R�[�h
				struct.seth_CUR_CD(custStruct.geth_CUR_CD());
				// �ב֎��
				struct.setEXCH_TYP(custStruct.getEXCH_TYP());
				// �����敪
				struct.setINSPC_ACPT_TYP(custStruct.getINSPC_ACPT_TYP());
				// ���׌v�Z�܂�ߋ敪
				struct.setDETAIL_ROUND_TYP(custStruct.getDETAIL_ROUND_TYP());
			} else {
				setErrorMessage("KA00032");
				return;
			}
			
			// �ʉ݃R�[�h
			checkList = entity.mM_CUR.read(conn, struct);
			if (checkList.isEmpty()) {
				setErrorMessage("KQ00073");
				return;
			} else {
				KR0070010Struct curStruct = (KR0070010Struct)checkList.get(0);
				struct.setCUR_UNIT_PRICE(curStruct.getCUR_UNIT());
				struct.setCUR_UNIT_AMOUNT(curStruct.getCUR_UNIT());
				// �ʉݏ�������
				decimalFig = Integer.parseInt(curStruct.getDECIMAL_FIG());
				struct.setDECIMAL_FIG(curStruct.getDECIMAL_FIG());
				if (NumberTool.getRealScale(struct.getSALES_AMOUNT())
							> decimalFig) {
						setErrorMessage("KU01003");
						return;
					}				
			}
			
			// ����ŃR�[�h
			checkList = entity.mM_TAX.read(conn, struct);
			if (checkList.isEmpty()) {
				setErrorMessage("AA01001");
				return;
			} else {
				KR0070010Struct taxStruct = (KR0070010Struct) checkList.get(0);
				// ���ŗ�1
				struct.setTAX_RATE_1(taxStruct.getTAX_RATE_1());
				// ���ŗ�2
				struct.setTAX_RATE_2(taxStruct.getTAX_RATE_2());
				// ���ŗ�3
				struct.setTAX_RATE_3(taxStruct.getTAX_RATE_3());
				// �[���敪
				struct.setTAX_ROUND_TYP(taxStruct.getTAX_ROUND_TYP());
			}
			
			// �����Ǘ��`�F�b�N
			if ("1".equals(struct.getUNIT_QTY_TYP())) {
				// �����Ǘ�
				if (struct.getSALES_QTY().indexOf(".") >= 0) {
					// �������͂̏ꍇ�F�؏グ
					String tempString = struct.getSALES_QTY();
					double tempDouble1 = Double.parseDouble(tempString);
					struct.setSALES_QTY(Calculate.ceil(struct.getSALES_QTY(), 0));
					double tempDouble2 = Double.parseDouble(struct.getSALES_QTY());
					if (tempDouble1 != tempDouble2) {
						// ".0"���͏��O
						setWarningMessage("KQ20004");
					}
				}
			}
			
			// ����or�P�������͂���Ă����ꍇ�͋��z���v�Z
			if (Calculate.compare(struct.getSALES_QTY(), "0") > 0
					|| Calculate.compare(struct.getSALES_UNIT_PRICE(), "0") > 0) {
				String work =
						Calculate.multiply(struct.getSALES_QTY(), struct.getSALES_UNIT_PRICE());
				work = roundAmount(work, struct);
				struct.setSALES_AMOUNT(work);
				// �v�Z���ʂ�DB�̐��x�𒴂��Ă����ꍇ�̓G���[
				if (Calculate.compare(work, "99999999999999.9999") > 0) {
					setErrorMessage("KR20024");
					return;
				}
			}
			
			setReadStatus(NORMAL);
		
		} catch (Exception e) {
			setExpjExceptionMsg(e);
		}
                //}}user_implement_dev:<controlRecalc>
		logger.exiting("KR0070010Control"+":USER="+struct.getsUser_ID(),"controlRecalc");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0070");
		logger.entering("KR0070010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
		// �Čv�Z���W�b�N���Ăяo���āA�G���[�`�F�b�N�y�уf�[�^�Z�b�g���s���B
		controlRecalc();
		// �G���[���������ꍇ�͏����𒆒f
		if (msgStruct.hasError()) {
			return;
		}
		if ("J".equals(getExplannerFlag())) {
			// Explanner J�ꍇ
			insertOfJ();
		} else if ("Ja".equals(getExplannerFlag()) || "JaScm".equals(getExplannerFlag())) {
			// Explanner Ja�AExplanner JaScm �ꍇ
			insertOfJa();
		} else {
			// Explanner Jf �ꍇ
			insertOfJf();
		}
		
                //}}user_implement_dev:<controlInsert>
		logger.exiting("KR0070010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0070");
		logger.entering("KR0070010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
			
		// �Čv�Z���W�b�N���Ăяo���āA�G���[�`�F�b�N�y�уf�[�^�Z�b�g���s���B
		controlRecalc();
		// �G���[���������ꍇ�͏����𒆒f
		if (msgStruct.hasError()) {
			return;
		}
		
		checkT_AR_LEDGER_H();
		// �G���[���������ꍇ�͏����𒆒f
		if (msgStruct.hasError()) {
			return;
		}

		if ("J".equals(getExplannerFlag())) {
			// Explanner J�ꍇ
			updateOfJ();
		} else if ("Ja".equals(getExplannerFlag()) || "JaScm".equals(getExplannerFlag())) {
			// Explanner Ja�AExplanner JaScm �ꍇ
			updateOfJa();
		} else {
			// Explanner Jf �ꍇ
			updateOfJf();
		}
                //}}user_implement_dev:<controlUpdate>
		logger.exiting("KR0070010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * �폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0070");
		logger.entering("KR0070010Control"+":USER="+struct.getsUser_ID(),"controlDelete");
			//{{user_implement_dev:<controlDelete>
		checkT_AR_LEDGER_H();
		// �G���[���������ꍇ�͏����𒆒f
		if (msgStruct.hasError()) {
			return;
		}
		if ("J".equals(getExplannerFlag())) {
			// Explanner J�ꍇ
			deleteOfJ();
		} else if ("Ja".equals(getExplannerFlag()) || "JaScm".equals(getExplannerFlag())) {
			// Explanner Ja�AExplanner JaScm �ꍇ
			deleteOfJa();
		} else {
			// Explanner Jf �ꍇ
			deleteOfJf();
		}
                //}}user_implement_dev:<controlDelete>
		logger.exiting("KR0070010Control"+":USER="+struct.getsUser_ID(),"controlDelete");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0070");
		logger.entering("KR0070010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
		controlRELOAD();
                //}}user_implement_dev:<controlClear>
		logger.exiting("KR0070010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0070");
		logger.entering("KR0070010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("KR0070010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0070");
		logger.entering("KR0070010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KR0070010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0070");
		logger.entering("KR0070010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		try {
			//��ʃN���A
			initializeAll();
			
			// �����ꍀ�ڎ擾�Ή�
			String locale = CoreTools.getLocale(sysUSER_CD);
			String property = "OrteusUserDic";
			ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
			
			
			// ���s���m�F
			// Explanner/J
			setExplannerFlag("J");
			// ���󒍔ԍ�
			struct.setlbORGN_ODR_NO(CoreTools.getRBString("Expj.ORGN_ODR_NO", resource));
			
			KR0070010Struct tempStruct = new KR0070010Struct();
			// �V�X�e���I�v�V�������ʎq
			tempStruct.setOPTION_ID("SCM*");
			// �V�X�e�������t���O
			tempStruct.setINSTALL_FLG("1");
			
			List tempList = entity.mSYS_INSTALL_OPTIONS.read(conn, tempStruct);
			if (!tempList.isEmpty()) {
				setExplannerFlag("JaScm");
				// ���󒍊Ǘ��ԍ�
				struct.setlbORGN_ODR_NO(CoreTools.getRBString("Expj.ORGN_ODR_NO_1", resource));
			} else {
				// �V�X�e���I�v�V�������ʎq
				tempStruct.setOPTION_ID("JF*");
				tempList = entity.mSYS_INSTALL_OPTIONS.read(conn, tempStruct);
				if (!tempList.isEmpty()) {
					setExplannerFlag("Jf");
					// ���󒍓`�[�ԍ�
					struct.setlbORGN_ODR_NO(CoreTools.getRBString("Expj.ORGN_ODR_NO_2", resource));
				} else {
					// �V�X�e���I�v�V�������ʎq
					tempStruct.setOPTION_ID("JA*");
					tempList = entity.mSYS_INSTALL_OPTIONS.read(conn, tempStruct);
					if (!tempList.isEmpty()) {
						setExplannerFlag("Ja");
						// ���󒍊Ǘ��ԍ�
						struct.setlbORGN_ODR_NO(CoreTools.getRBString("Expj.ORGN_ODR_NO_1", resource));
					}
				}
			}
			
			// ���󒍔ԍ��̕\����
			setlbORGN_ODR_NO(struct.getlbORGN_ODR_NO());
			
			// Explanner/Jf�̏ꍇ
			if ("Jf".equals(getExplannerFlag())) {
				Common cm = new Common(conn, sysUSER_CD, sp.getProcId(), sysPLANT_CD, getsysCOMPANY_CD());
				tempList = cm.InitSalesProcFd();
				
				// �u�̔��Ǘ��p���������v���ʃX�e�[�^�X�̔���
				if(cm.getResultStatus().intValue() == STATUS_ERROR) {
					// ���ʃX�e�[�^�X���ُ�̏ꍇ�́A�G���[���b�Z�[�W��\�����ď����I��
					setErrorMessage(tempList.get(8).toString());
					throw new ExpjException(tempList.get(8).toString());
				} else if(cm.getResultStatus().intValue() == STATUS_WARNING) {
					// ���ʃX�e�[�^�X���x���̏ꍇ�́A�G���[���b�Z�[�W��\�����ď����p��
					setWarningMessage(tempList.get(8).toString());
				}

				/* �u�̔��Ǘ��p���������v�Ŏ擾�����l����ʂɔ��f */
				
				// ��ЃR�[�h
				setsysCOMPANY_CD(tempList.get(1).toString());
				
				// ���t�v�Z�p�H��R�[�h�ݒ�
				setSalesPLANT_CD(tempList.get(2).toString());
				
				// �Ɩ��^�p��		
				setBusinessOprDate(tempList.get(6).toString());
				
				// �M�݃R�[�h�ݒ�
				setHomeCurCd(tempList.get(7).toString());
			} else {
				// Explanner/JaScm�̏ꍇ
				if ("JaScm".equals(getExplannerFlag())) {
					// ���O�C�����[�U�̏�����ЃR�[�h
					Common cm = new Common(conn, sysUSER_CD, sp.getProcId(), sysPLANT_CD, getsysCOMPANY_CD());
					setsysCOMPANY_CD(cm.getScmCompanyCd(sysPLANT_CD));
					if (getsysCOMPANY_CD() == null || "".equals(getsysCOMPANY_CD())) {
						setErrorMessage("BZ00179");
						throw new ExpjException("BZ00179");
					}
				} else {
					// ���ЃR�[�h
					List companyList = entity.mSYS_MY_COMPANY.read(conn, struct);
					if (!companyList.isEmpty()) {
						setsysCOMPANY_CD(((KR0070010Struct)companyList.get(0)).getCOMPANY_CD());
					} else {
						setErrorMessage("KA00060");
						throw new ExpjException("KA00060");
					}
				}
				
				// �V�X�e������
				tempStruct.setSYS_CLASS("MP_SALES");
				if ("J".equals(getExplannerFlag())) {
					tempStruct.setSYS_CLASS("SALES");
				}
				// �̔��p�H��R�[�h�擾
				tempList = entity.mSYS_CLASS_CODE.read(conn, tempStruct);
				if (!tempList.isEmpty()) {
					setSalesPLANT_CD( ((KR0070010Struct)tempList.get(0)).getPLANT_CD());
				} else {
					setErrorMessage("KA20037");
					throw new ExpjException("KA20037");
				}
				
				// �Ɩ��^�p���擾
				struct.setPLANT_CD(getSalesPLANT_CD());
				tempList = entity.mSYS_DATE_CTRL.read(conn, struct);
				if (!tempList.isEmpty()) {
					setBusinessOprDate(((KR0070010Struct)tempList.get(0)).getBUSINESS_OPR_DATE());
				} else {
					setErrorMessage("KA20038");
					throw new ExpjException("KA20038");
				}	
			}
			
			// ��ЃR�[�h
			struct.setCOMPANY_CD(getsysCOMPANY_CD());
			// �̔��p�H��R�[�h
			struct.setPLANT_CD(getSalesPLANT_CD());
			// �Ɩ��^�p��
			struct.setBUSINESS_OPR_DATE(getBusinessOprDate());

			//  �C���X�g�[���I�v�V�����̎擾
			tempList = entity.mSYS_INSTALL_OPTIONS_AI.read(conn, struct);
			if (tempList.isEmpty()) {
				setInstallFlg(null);
			} else {
				setInstallFlg(((KR0070010Struct) tempList.get(0)).getINSTALL_FLG());
			}
			
			// �i�ږ��̊���l�擾
			tempStruct.setNAME("UNSTOCK_ITEM_NAME");
			tempList = entity.mSYS_PARAMETER.read(conn, tempStruct);
			if (!tempList.isEmpty()) {
				setItemName(((KR0070010Struct)tempList.get(0)).getVALUE());
				if (getItemName() == null || "".equals(getItemName())) {
					setErrorMessage("KQ00340");
					throw new ExpjException("KQ00340");
				}
			} else {
				setErrorMessage("KQ00340");
				throw new ExpjException("KQ00340");
			}
			
		} catch (SQLException e) {
			setExpjExceptionMsg(e);
		}
		
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KR0070010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0070");
		logger.entering("KR0070010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("KR0070010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Recalc") ) {
				controlRecalc();
			} else if( button.equals("Insert") ) {
				controlInsert();
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
			// ���󒍔ԍ��̕\����
			struct.setlbORGN_ODR_NO(getlbORGN_ODR_NO());
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
//			throw new FoundationException("KR0070010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KR0070010-E999","CSV�̏o�͏���"));
			throw new FoundationException("KR0070010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KR0070010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("KR0070010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KR0070010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("KR0070010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected KR0070010Entity entity;
	protected KR0070010Struct struct;
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

		entity = new KR0070010Entity();
		struct = new KR0070010Struct();

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
	 * KR0070010�N���X�̕W���R���X�g���N�^
	 */
	public KR0070010Control() throws BusinessProcessException, FoundationException
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
				KR0070010Struct key = (KR0070010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("rdoInsert") && key.getrdoInsert() != null) {
					msgKey.setKeyValue("rdoInsert", key.getrdoInsert());
				}
				if(msgKeyType.containsKeyColumn("rdoUpdateDelete") && key.getrdoUpdateDelete() != null) {
					msgKey.setKeyValue("rdoUpdateDelete", key.getrdoUpdateDelete());
				}
				if(msgKeyType.containsKeyColumn("addAmountOrder") && key.getaddAmountOrder() != null) {
					msgKey.setKeyValue("addAmountOrder", key.getaddAmountOrder());
				}
				if(msgKeyType.containsKeyColumn("CUR_UNIT_AMOUNT") && key.getCUR_UNIT_AMOUNT() != null) {
					msgKey.setKeyValue("CUR_UNIT_AMOUNT", key.getCUR_UNIT_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("lbORGN_ODR_NO") && key.getlbORGN_ODR_NO() != null) {
					msgKey.setKeyValue("lbORGN_ODR_NO", key.getlbORGN_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("h_SLIP_CD") && key.geth_SLIP_CD() != null) {
					msgKey.setKeyValue("h_SLIP_CD", key.geth_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("h_TAX_CD") && key.geth_TAX_CD() != null) {
					msgKey.setKeyValue("h_TAX_CD", key.geth_TAX_CD());
				}
				if(msgKeyType.containsKeyColumn("h_rdoInsert") && key.geth_rdoInsert() != null) {
					msgKey.setKeyValue("h_rdoInsert", key.geth_rdoInsert());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_NO") && key.geth_ODR_NO() != null) {
					msgKey.setKeyValue("h_ODR_NO", key.geth_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("OPTION_ID") && key.getOPTION_ID() != null) {
					msgKey.setKeyValue("OPTION_ID", key.getOPTION_ID());
				}
				if(msgKeyType.containsKeyColumn("INSTALL_FLG") && key.getINSTALL_FLG() != null) {
					msgKey.setKeyValue("INSTALL_FLG", key.getINSTALL_FLG());
				}
				if(msgKeyType.containsKeyColumn("ORGN_ODR_NO") && key.getORGN_ODR_NO() != null) {
					msgKey.setKeyValue("ORGN_ODR_NO", key.getORGN_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("h_ADD_ODR_FLG") && key.geth_ADD_ODR_FLG() != null) {
					msgKey.setKeyValue("h_ADD_ODR_FLG", key.geth_ADD_ODR_FLG());
				}
				if(msgKeyType.containsKeyColumn("CUST_ODR_NO") && key.getCUST_ODR_NO() != null) {
					msgKey.setKeyValue("CUST_ODR_NO", key.getCUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_NAME") && key.getCUST_NAME() != null) {
					msgKey.setKeyValue("CUST_NAME", key.getCUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("ODR_QTY") && key.getODR_QTY() != null) {
					msgKey.setKeyValue("ODR_QTY", key.getODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("ODR_ACPT_DATE") && key.getODR_ACPT_DATE() != null) {
					msgKey.setKeyValue("ODR_ACPT_DATE", key.getODR_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD") && key.getTAX_CD() != null) {
					msgKey.setKeyValue("TAX_CD", key.getTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("ODR_MODIFY_COUNT") && key.getODR_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("ODR_MODIFY_COUNT", key.getODR_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ODR_ACPT_PSN_CD") && key.getODR_ACPT_PSN_CD() != null) {
					msgKey.setKeyValue("ODR_ACPT_PSN_CD", key.getODR_ACPT_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_ODR") && key.getSTOCK_UNIT_ODR() != null) {
					msgKey.setKeyValue("STOCK_UNIT_ODR", key.getSTOCK_UNIT_ODR());
				}
				if(msgKeyType.containsKeyColumn("CUR_UNIT_PRICE") && key.getCUR_UNIT_PRICE() != null) {
					msgKey.setKeyValue("CUR_UNIT_PRICE", key.getCUR_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("SALES_UNIT_PRICE") && key.getSALES_UNIT_PRICE() != null) {
					msgKey.setKeyValue("SALES_UNIT_PRICE", key.getSALES_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("SALES_AMOUNT") && key.getSALES_AMOUNT() != null) {
					msgKey.setKeyValue("SALES_AMOUNT", key.getSALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE") && key.getDESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("DESINATED_DLV_DATE", key.getDESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("SLIP_CD") && key.getSLIP_CD() != null) {
					msgKey.setKeyValue("SLIP_CD", key.getSLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("ODR_NO") && key.getODR_NO() != null) {
					msgKey.setKeyValue("ODR_NO", key.getODR_NO());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("SALES_DATE") && key.getSALES_DATE() != null) {
					msgKey.setKeyValue("SALES_DATE", key.getSALES_DATE());
				}
				if(msgKeyType.containsKeyColumn("SALES_DEPT_CD") && key.getSALES_DEPT_CD() != null) {
					msgKey.setKeyValue("SALES_DEPT_CD", key.getSALES_DEPT_CD());
				}
				if(msgKeyType.containsKeyColumn("ORG_NAME") && key.getORG_NAME() != null) {
					msgKey.setKeyValue("ORG_NAME", key.getORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_CD") && key.getCUST_CHRG_PSN_CD() != null) {
					msgKey.setKeyValue("CUST_CHRG_PSN_CD", key.getCUST_CHRG_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("USER_NAME") && key.getUSER_NAME() != null) {
					msgKey.setKeyValue("USER_NAME", key.getUSER_NAME());
				}
				if(msgKeyType.containsKeyColumn("SALES_QTY") && key.getSALES_QTY() != null) {
					msgKey.setKeyValue("SALES_QTY", key.getSALES_QTY());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("REMARKS") && key.getREMARKS() != null) {
					msgKey.setKeyValue("REMARKS", key.getREMARKS());
				}
				if(msgKeyType.containsKeyColumn("STATUS") && key.getSTATUS() != null) {
					msgKey.setKeyValue("STATUS", key.getSTATUS());
				}
				if(msgKeyType.containsKeyColumn("h_SALES_SEQ_NO") && key.geth_SALES_SEQ_NO() != null) {
					msgKey.setKeyValue("h_SALES_SEQ_NO", key.geth_SALES_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("AI_AR_IF_FLG") && key.getAI_AR_IF_FLG() != null) {
					msgKey.setKeyValue("AI_AR_IF_FLG", key.getAI_AR_IF_FLG());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("H_MODIFY_COUNT") && key.getH_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("H_MODIFY_COUNT", key.getH_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("h_SALES_H_NO") && key.geth_SALES_H_NO() != null) {
					msgKey.setKeyValue("h_SALES_H_NO", key.geth_SALES_H_NO());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
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
				if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP") && key.getTAX_ROUND_TYP() != null) {
					msgKey.setKeyValue("TAX_ROUND_TYP", key.getTAX_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("haveFlag") && key.gethaveFlag() != null) {
					msgKey.setKeyValue("haveFlag", key.gethaveFlag());
				}
				if(msgKeyType.containsKeyColumn("SLIP_TYP") && key.getSLIP_TYP() != null) {
					msgKey.setKeyValue("SLIP_TYP", key.getSLIP_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_CUR_CD") && key.geth_CUR_CD() != null) {
					msgKey.setKeyValue("h_CUR_CD", key.geth_CUR_CD());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP") && key.getEXCH_TYP() != null) {
					msgKey.setKeyValue("EXCH_TYP", key.getEXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_TYP") && key.getINSPC_ACPT_TYP() != null) {
					msgKey.setKeyValue("INSPC_ACPT_TYP", key.getINSPC_ACPT_TYP());
				}
				if(msgKeyType.containsKeyColumn("DETAIL_ROUND_TYP") && key.getDETAIL_ROUND_TYP() != null) {
					msgKey.setKeyValue("DETAIL_ROUND_TYP", key.getDETAIL_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("SALES_SEQ_NO") && key.getSALES_SEQ_NO() != null) {
					msgKey.setKeyValue("SALES_SEQ_NO", key.getSALES_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("SALES_TYP") && key.getSALES_TYP() != null) {
					msgKey.setKeyValue("SALES_TYP", key.getSALES_TYP());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("PRD_ODR_PLACE_CD") && key.getPRD_ODR_PLACE_CD() != null) {
					msgKey.setKeyValue("PRD_ODR_PLACE_CD", key.getPRD_ODR_PLACE_CD());
				}
				if(msgKeyType.containsKeyColumn("UNIT_CD") && key.getUNIT_CD() != null) {
					msgKey.setKeyValue("UNIT_CD", key.getUNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("SALES_AMOUNT_EXCH_RATES") && key.getSALES_AMOUNT_EXCH_RATES() != null) {
					msgKey.setKeyValue("SALES_AMOUNT_EXCH_RATES", key.getSALES_AMOUNT_EXCH_RATES());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_DATE") && key.getINSPC_ACPT_DATE() != null) {
					msgKey.setKeyValue("INSPC_ACPT_DATE", key.getINSPC_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_QTY") && key.getINSPC_ACPT_QTY() != null) {
					msgKey.setKeyValue("INSPC_ACPT_QTY", key.getINSPC_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("EXTERNAL_TAX_SALES_AMOUNT") && key.getEXTERNAL_TAX_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("EXTERNAL_TAX_SALES_AMOUNT", key.getEXTERNAL_TAX_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("INTERNAL_TAX_SALES_AMOUNT") && key.getINTERNAL_TAX_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("INTERNAL_TAX_SALES_AMOUNT", key.getINTERNAL_TAX_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("TAXFREE_SALES_AMOUNT") && key.getTAXFREE_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("TAXFREE_SALES_AMOUNT", key.getTAXFREE_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("TAX_CREDIT_SALES_AMOUNT") && key.getTAX_CREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("TAX_CREDIT_SALES_AMOUNT", key.getTAX_CREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("EXTERNAL_TAX_AMOUNT") && key.getEXTERNAL_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("EXTERNAL_TAX_AMOUNT", key.getEXTERNAL_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("INTERNAL_TAX_AMOUNT") && key.getINTERNAL_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("INTERNAL_TAX_AMOUNT", key.getINTERNAL_TAX_AMOUNT());
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
				if(msgKeyType.containsKeyColumn("OWN_CUR_TAXCREDIT_SALES_AMOUNT") && key.getOWN_CUR_TAXCREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("OWN_CUR_TAXCREDIT_SALES_AMOUNT", key.getOWN_CUR_TAXCREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("ORG_SLIP_CD") && key.getORG_SLIP_CD() != null) {
					msgKey.setKeyValue("ORG_SLIP_CD", key.getORG_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("CURRNCY_CD") && key.getCURRNCY_CD() != null) {
					msgKey.setKeyValue("CURRNCY_CD", key.getCURRNCY_CD());
				}
				if(msgKeyType.containsKeyColumn("SPCL_PRICE_CO") && key.getSPCL_PRICE_CO() != null) {
					msgKey.setKeyValue("SPCL_PRICE_CO", key.getSPCL_PRICE_CO());
				}
				if(msgKeyType.containsKeyColumn("DEL_FLG") && key.getDEL_FLG() != null) {
					msgKey.setKeyValue("DEL_FLG", key.getDEL_FLG());
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
				if(msgKeyType.containsKeyColumn("VALUE") && key.getVALUE() != null) {
					msgKey.setKeyValue("VALUE", key.getVALUE());
				}
				if(msgKeyType.containsKeyColumn("NAME") && key.getNAME() != null) {
					msgKey.setKeyValue("NAME", key.getNAME());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("SYS_CLASS") && key.getSYS_CLASS() != null) {
					msgKey.setKeyValue("SYS_CLASS", key.getSYS_CLASS());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("DECIMAL_FIG") && key.getDECIMAL_FIG() != null) {
					msgKey.setKeyValue("DECIMAL_FIG", key.getDECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("CUR_UNIT") && key.getCUR_UNIT() != null) {
					msgKey.setKeyValue("CUR_UNIT", key.getCUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("SHIP_ODR_NO") && key.getSHIP_ODR_NO() != null) {
					msgKey.setKeyValue("SHIP_ODR_NO", key.getSHIP_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("SHIP_SEQ_NO") && key.getSHIP_SEQ_NO() != null) {
					msgKey.setKeyValue("SHIP_SEQ_NO", key.getSHIP_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("CUR_CD") && key.getCUR_CD() != null) {
					msgKey.setKeyValue("CUR_CD", key.getCUR_CD());
				}
				if(msgKeyType.containsKeyColumn("AMOUNT_TYP") && key.getAMOUNT_TYP() != null) {
					msgKey.setKeyValue("AMOUNT_TYP", key.getAMOUNT_TYP());
				}
				if(msgKeyType.containsKeyColumn("TEMP_SALES_TYP") && key.getTEMP_SALES_TYP() != null) {
					msgKey.setKeyValue("TEMP_SALES_TYP", key.getTEMP_SALES_TYP());
				}
				if(msgKeyType.containsKeyColumn("SALES_DISAGREEMENT_TYP") && key.getSALES_DISAGREEMENT_TYP() != null) {
					msgKey.setKeyValue("SALES_DISAGREEMENT_TYP", key.getSALES_DISAGREEMENT_TYP());
				}
				if(msgKeyType.containsKeyColumn("SALES_FLG") && key.getSALES_FLG() != null) {
					msgKey.setKeyValue("SALES_FLG", key.getSALES_FLG());
				}
				if(msgKeyType.containsKeyColumn("SALES_IF_FLG") && key.getSALES_IF_FLG() != null) {
					msgKey.setKeyValue("SALES_IF_FLG", key.getSALES_IF_FLG());
				}
				if(msgKeyType.containsKeyColumn("CONS_TYP") && key.getCONS_TYP() != null) {
					msgKey.setKeyValue("CONS_TYP", key.getCONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("BILL_ADDRESSEE_CD") && key.getBILL_ADDRESSEE_CD() != null) {
					msgKey.setKeyValue("BILL_ADDRESSEE_CD", key.getBILL_ADDRESSEE_CD());
				}
				if(msgKeyType.containsKeyColumn("STL_COND_CD") && key.getSTL_COND_CD() != null) {
					msgKey.setKeyValue("STL_COND_CD", key.getSTL_COND_CD());
				}
				if(msgKeyType.containsKeyColumn("SALES_H_NO") && key.getSALES_H_NO() != null) {
					msgKey.setKeyValue("SALES_H_NO", key.getSALES_H_NO());
				}
				if(msgKeyType.containsKeyColumn("SHIP_DLV_H_NO") && key.getSHIP_DLV_H_NO() != null) {
					msgKey.setKeyValue("SHIP_DLV_H_NO", key.getSHIP_DLV_H_NO());
				}
				if(msgKeyType.containsKeyColumn("CUST_SALES_QTY") && key.getCUST_SALES_QTY() != null) {
					msgKey.setKeyValue("CUST_SALES_QTY", key.getCUST_SALES_QTY());
				}
				if(msgKeyType.containsKeyColumn("CUST_UNIT_CD") && key.getCUST_UNIT_CD() != null) {
					msgKey.setKeyValue("CUST_UNIT_CD", key.getCUST_UNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_INSPC_ACPT_QTY") && key.getCUST_INSPC_ACPT_QTY() != null) {
					msgKey.setKeyValue("CUST_INSPC_ACPT_QTY", key.getCUST_INSPC_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("RESERVE_CAUSE") && key.getRESERVE_CAUSE() != null) {
					msgKey.setKeyValue("RESERVE_CAUSE", key.getRESERVE_CAUSE());
				}
				if(msgKeyType.containsKeyColumn("SHIP_CTRL_NO") && key.getSHIP_CTRL_NO() != null) {
					msgKey.setKeyValue("SHIP_CTRL_NO", key.getSHIP_CTRL_NO());
				}
				if(msgKeyType.containsKeyColumn("SHIP_DLV_D_NO") && key.getSHIP_DLV_D_NO() != null) {
					msgKey.setKeyValue("SHIP_DLV_D_NO", key.getSHIP_DLV_D_NO());
				}
				if(msgKeyType.containsKeyColumn("FLAG") && key.getFLAG() != null) {
					msgKey.setKeyValue("FLAG", key.getFLAG());
				}
				if(msgKeyType.containsKeyColumn("w_APR_FLG") && key.getw_APR_FLG() != null) {
					msgKey.setKeyValue("w_APR_FLG", key.getw_APR_FLG());
				}
				if(msgKeyType.containsKeyColumn("Cnt_Tpj") && key.getCnt_Tpj() != null) {
					msgKey.setKeyValue("Cnt_Tpj", key.getCnt_Tpj());
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
					KR0070010Struct key = new KR0070010Struct();
					if(msgKeyType.containsKeyColumn("rdoInsert")) {
						key.setrdoInsert(msgKey.getKeyValue("rdoInsert"));
					}
					if(msgKeyType.containsKeyColumn("rdoUpdateDelete")) {
						key.setrdoUpdateDelete(msgKey.getKeyValue("rdoUpdateDelete"));
					}
					if(msgKeyType.containsKeyColumn("addAmountOrder")) {
						key.setaddAmountOrder(msgKey.getKeyValue("addAmountOrder"));
					}
					if(msgKeyType.containsKeyColumn("CUR_UNIT_AMOUNT")) {
						key.setCUR_UNIT_AMOUNT(msgKey.getKeyValue("CUR_UNIT_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("lbORGN_ODR_NO")) {
						key.setlbORGN_ODR_NO(msgKey.getKeyValue("lbORGN_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_SLIP_CD")) {
						key.seth_SLIP_CD(msgKey.getKeyValue("h_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_TAX_CD")) {
						key.seth_TAX_CD(msgKey.getKeyValue("h_TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_rdoInsert")) {
						key.seth_rdoInsert(msgKey.getKeyValue("h_rdoInsert"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_NO")) {
						key.seth_ODR_NO(msgKey.getKeyValue("h_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("OPTION_ID")) {
						key.setOPTION_ID(msgKey.getKeyValue("OPTION_ID"));
					}
					if(msgKeyType.containsKeyColumn("INSTALL_FLG")) {
						key.setINSTALL_FLG(msgKey.getKeyValue("INSTALL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ORGN_ODR_NO")) {
						key.setORGN_ODR_NO(msgKey.getKeyValue("ORGN_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_ADD_ODR_FLG")) {
						key.seth_ADD_ODR_FLG(msgKey.getKeyValue("h_ADD_ODR_FLG"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ODR_NO")) {
						key.setCUST_ODR_NO(msgKey.getKeyValue("CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_NAME")) {
						key.setCUST_NAME(msgKey.getKeyValue("CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ODR_QTY")) {
						key.setODR_QTY(msgKey.getKeyValue("ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ODR_ACPT_DATE")) {
						key.setODR_ACPT_DATE(msgKey.getKeyValue("ODR_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD")) {
						key.setTAX_CD(msgKey.getKeyValue("TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("ODR_MODIFY_COUNT")) {
						key.setODR_MODIFY_COUNT(msgKey.getKeyValue("ODR_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ODR_ACPT_PSN_CD")) {
						key.setODR_ACPT_PSN_CD(msgKey.getKeyValue("ODR_ACPT_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_ODR")) {
						key.setSTOCK_UNIT_ODR(msgKey.getKeyValue("STOCK_UNIT_ODR"));
					}
					if(msgKeyType.containsKeyColumn("CUR_UNIT_PRICE")) {
						key.setCUR_UNIT_PRICE(msgKey.getKeyValue("CUR_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("SALES_UNIT_PRICE")) {
						key.setSALES_UNIT_PRICE(msgKey.getKeyValue("SALES_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("SALES_AMOUNT")) {
						key.setSALES_AMOUNT(msgKey.getKeyValue("SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE")) {
						key.setDESINATED_DLV_DATE(msgKey.getKeyValue("DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_CD")) {
						key.setSLIP_CD(msgKey.getKeyValue("SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("ODR_NO")) {
						key.setODR_NO(msgKey.getKeyValue("ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("SALES_DATE")) {
						key.setSALES_DATE(msgKey.getKeyValue("SALES_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SALES_DEPT_CD")) {
						key.setSALES_DEPT_CD(msgKey.getKeyValue("SALES_DEPT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ORG_NAME")) {
						key.setORG_NAME(msgKey.getKeyValue("ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_CD")) {
						key.setCUST_CHRG_PSN_CD(msgKey.getKeyValue("CUST_CHRG_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("USER_NAME")) {
						key.setUSER_NAME(msgKey.getKeyValue("USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("SALES_QTY")) {
						key.setSALES_QTY(msgKey.getKeyValue("SALES_QTY"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS")) {
						key.setREMARKS(msgKey.getKeyValue("REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("STATUS")) {
						key.setSTATUS(msgKey.getKeyValue("STATUS"));
					}
					if(msgKeyType.containsKeyColumn("h_SALES_SEQ_NO")) {
						key.seth_SALES_SEQ_NO(msgKey.getKeyValue("h_SALES_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("AI_AR_IF_FLG")) {
						key.setAI_AR_IF_FLG(msgKey.getKeyValue("AI_AR_IF_FLG"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("H_MODIFY_COUNT")) {
						key.setH_MODIFY_COUNT(msgKey.getKeyValue("H_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("h_SALES_H_NO")) {
						key.seth_SALES_H_NO(msgKey.getKeyValue("h_SALES_H_NO"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
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
					if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP")) {
						key.setTAX_ROUND_TYP(msgKey.getKeyValue("TAX_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("haveFlag")) {
						key.sethaveFlag(msgKey.getKeyValue("haveFlag"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_TYP")) {
						key.setSLIP_TYP(msgKey.getKeyValue("SLIP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_CUR_CD")) {
						key.seth_CUR_CD(msgKey.getKeyValue("h_CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP")) {
						key.setEXCH_TYP(msgKey.getKeyValue("EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_TYP")) {
						key.setINSPC_ACPT_TYP(msgKey.getKeyValue("INSPC_ACPT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DETAIL_ROUND_TYP")) {
						key.setDETAIL_ROUND_TYP(msgKey.getKeyValue("DETAIL_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SALES_SEQ_NO")) {
						key.setSALES_SEQ_NO(msgKey.getKeyValue("SALES_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("SALES_TYP")) {
						key.setSALES_TYP(msgKey.getKeyValue("SALES_TYP"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("PRD_ODR_PLACE_CD")) {
						key.setPRD_ODR_PLACE_CD(msgKey.getKeyValue("PRD_ODR_PLACE_CD"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_CD")) {
						key.setUNIT_CD(msgKey.getKeyValue("UNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("SALES_AMOUNT_EXCH_RATES")) {
						key.setSALES_AMOUNT_EXCH_RATES(msgKey.getKeyValue("SALES_AMOUNT_EXCH_RATES"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_DATE")) {
						key.setINSPC_ACPT_DATE(msgKey.getKeyValue("INSPC_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_QTY")) {
						key.setINSPC_ACPT_QTY(msgKey.getKeyValue("INSPC_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("EXTERNAL_TAX_SALES_AMOUNT")) {
						key.setEXTERNAL_TAX_SALES_AMOUNT(msgKey.getKeyValue("EXTERNAL_TAX_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("INTERNAL_TAX_SALES_AMOUNT")) {
						key.setINTERNAL_TAX_SALES_AMOUNT(msgKey.getKeyValue("INTERNAL_TAX_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("TAXFREE_SALES_AMOUNT")) {
						key.setTAXFREE_SALES_AMOUNT(msgKey.getKeyValue("TAXFREE_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CREDIT_SALES_AMOUNT")) {
						key.setTAX_CREDIT_SALES_AMOUNT(msgKey.getKeyValue("TAX_CREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("EXTERNAL_TAX_AMOUNT")) {
						key.setEXTERNAL_TAX_AMOUNT(msgKey.getKeyValue("EXTERNAL_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("INTERNAL_TAX_AMOUNT")) {
						key.setINTERNAL_TAX_AMOUNT(msgKey.getKeyValue("INTERNAL_TAX_AMOUNT"));
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
					if(msgKeyType.containsKeyColumn("OWN_CUR_TAXCREDIT_SALES_AMOUNT")) {
						key.setOWN_CUR_TAXCREDIT_SALES_AMOUNT(msgKey.getKeyValue("OWN_CUR_TAXCREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("ORG_SLIP_CD")) {
						key.setORG_SLIP_CD(msgKey.getKeyValue("ORG_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("CURRNCY_CD")) {
						key.setCURRNCY_CD(msgKey.getKeyValue("CURRNCY_CD"));
					}
					if(msgKeyType.containsKeyColumn("SPCL_PRICE_CO")) {
						key.setSPCL_PRICE_CO(msgKey.getKeyValue("SPCL_PRICE_CO"));
					}
					if(msgKeyType.containsKeyColumn("DEL_FLG")) {
						key.setDEL_FLG(msgKey.getKeyValue("DEL_FLG"));
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
					if(msgKeyType.containsKeyColumn("VALUE")) {
						key.setVALUE(msgKey.getKeyValue("VALUE"));
					}
					if(msgKeyType.containsKeyColumn("NAME")) {
						key.setNAME(msgKey.getKeyValue("NAME"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("SYS_CLASS")) {
						key.setSYS_CLASS(msgKey.getKeyValue("SYS_CLASS"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("DECIMAL_FIG")) {
						key.setDECIMAL_FIG(msgKey.getKeyValue("DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("CUR_UNIT")) {
						key.setCUR_UNIT(msgKey.getKeyValue("CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_ODR_NO")) {
						key.setSHIP_ODR_NO(msgKey.getKeyValue("SHIP_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_SEQ_NO")) {
						key.setSHIP_SEQ_NO(msgKey.getKeyValue("SHIP_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("CUR_CD")) {
						key.setCUR_CD(msgKey.getKeyValue("CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("AMOUNT_TYP")) {
						key.setAMOUNT_TYP(msgKey.getKeyValue("AMOUNT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TEMP_SALES_TYP")) {
						key.setTEMP_SALES_TYP(msgKey.getKeyValue("TEMP_SALES_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SALES_DISAGREEMENT_TYP")) {
						key.setSALES_DISAGREEMENT_TYP(msgKey.getKeyValue("SALES_DISAGREEMENT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SALES_FLG")) {
						key.setSALES_FLG(msgKey.getKeyValue("SALES_FLG"));
					}
					if(msgKeyType.containsKeyColumn("SALES_IF_FLG")) {
						key.setSALES_IF_FLG(msgKey.getKeyValue("SALES_IF_FLG"));
					}
					if(msgKeyType.containsKeyColumn("CONS_TYP")) {
						key.setCONS_TYP(msgKey.getKeyValue("CONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("BILL_ADDRESSEE_CD")) {
						key.setBILL_ADDRESSEE_CD(msgKey.getKeyValue("BILL_ADDRESSEE_CD"));
					}
					if(msgKeyType.containsKeyColumn("STL_COND_CD")) {
						key.setSTL_COND_CD(msgKey.getKeyValue("STL_COND_CD"));
					}
					if(msgKeyType.containsKeyColumn("SALES_H_NO")) {
						key.setSALES_H_NO(msgKey.getKeyValue("SALES_H_NO"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_DLV_H_NO")) {
						key.setSHIP_DLV_H_NO(msgKey.getKeyValue("SHIP_DLV_H_NO"));
					}
					if(msgKeyType.containsKeyColumn("CUST_SALES_QTY")) {
						key.setCUST_SALES_QTY(msgKey.getKeyValue("CUST_SALES_QTY"));
					}
					if(msgKeyType.containsKeyColumn("CUST_UNIT_CD")) {
						key.setCUST_UNIT_CD(msgKey.getKeyValue("CUST_UNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_INSPC_ACPT_QTY")) {
						key.setCUST_INSPC_ACPT_QTY(msgKey.getKeyValue("CUST_INSPC_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("RESERVE_CAUSE")) {
						key.setRESERVE_CAUSE(msgKey.getKeyValue("RESERVE_CAUSE"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_CTRL_NO")) {
						key.setSHIP_CTRL_NO(msgKey.getKeyValue("SHIP_CTRL_NO"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_DLV_D_NO")) {
						key.setSHIP_DLV_D_NO(msgKey.getKeyValue("SHIP_DLV_D_NO"));
					}
					if(msgKeyType.containsKeyColumn("FLAG")) {
						key.setFLAG(msgKey.getKeyValue("FLAG"));
					}
					if(msgKeyType.containsKeyColumn("w_APR_FLG")) {
						key.setw_APR_FLG(msgKey.getKeyValue("w_APR_FLG"));
					}
					if(msgKeyType.containsKeyColumn("Cnt_Tpj")) {
						key.setCnt_Tpj(msgKey.getKeyValue("Cnt_Tpj"));
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
