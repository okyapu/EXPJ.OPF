/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0100/src/com/nec/jp/orteus/metamorBase/KQ0100/KQ0100010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KQ0100;

import com.nec.jp.orteus.metamorBase.KQ0100.*;
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
import java.text.ParseException;
import com.nec.jp.orteus.expj.sa.*;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxControl;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxAmountStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxAmountControl;
import com.nec.jp.orteus.metamorBase.common06.ExchAmount.*;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : KQ0100010Control �N���X
 * �󒍏���ŗ��ύX
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.3 $ $Date: 2015/11/16 05:13:57 $
 *
 */
//}}user_implement_code_header

public class KQ0100010Control
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
	public KQ0100010Struct getListvalue(int x) { return (KQ0100010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public KQ0100010Struct getStruct() { return this.struct; }	// Struct�̒l��Ԃ��܂��B
	public KQ0100010Struct createStruct() { return new KQ0100010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((KQ0100010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
	// ���Џ��
	private String COMPANY_CD = null;
	
	// �X�V�t���O
	private String UPDATE_FLG = "0";
	
	// ���|�Ǘ��I�v�V����
	private String OPTION_ID_B = "0";
	
	// �`��R�A�g��
	private String OPTION_ID_AIR = "0";
	
	// �ύX�O�̏���ŃR�[�h
	private String TAX_CD = null;
	
    /** �����敪 */
    private ComboStruct _INSPC_ACPT_TYP = new ComboStruct();
   
    /**�����敪�ݒ�
     * @param �R���{�{�b�N�X�f�[�^
    */
    public void setINSPC_ACPT_TYP(ComboStruct combo){ _INSPC_ACPT_TYP = combo; }
   
    /** �����敪�擾
     * @return �����敪�̃R���{�{�b�N�X�f�[�^
    */
    public ComboStruct getINSPC_ACPT_TYP(){ return _INSPC_ACPT_TYP; }
    
    /** �X�e�[�^�X */
    private ComboStruct _STATUS_TYP = new ComboStruct();
   
    /**�X�e�[�^�X�ݒ�
     * @param �R���{�{�b�N�X�f�[�^
    */
    public void setSTATUS_TYP(ComboStruct combo){ _STATUS_TYP = combo; }
   
    /** �X�e�[�^�X�擾
     * @return �����敪�̃R���{�{�b�N�X�f�[�^
    */
    public ComboStruct getSTATUS_TYP(){ return _STATUS_TYP; }
    
    /**
	 * �敪���擾
	 * 
	 * @param comboStruct
	 *            �敪��񃊃X�g
	 * @param strTyp
	 *            �敪�R�[�h
	 * @return �敪���́B�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�
	 */
	private String getTypeName(ComboStruct comboStruct, String strTyp) {
		String strTypName = strTyp;
		for (int i = 0; i < comboStruct.getValList().size(); i++) {
			if (strTyp.equals((String) (comboStruct.getValList().get(i)))) {
				strTypName = (String) (comboStruct.getExplanList().get(i));
				break;
			}
		}
		return strTypName;
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
		sysLog.warning(emsg, sysUSER_CD);
	}
	
	 /**
     * ��ʂ̑S���ڂ����������܂��B
     */
    public void initializeAll() {
    	struct.setr_SEL_PTN1("true");
    	struct.setr_SEL_PTN2("false");
		struct.setODR_NO(null);// �󒍔ԍ�
		struct.setSLIP_CD(null);// �`�[�ԍ�
		struct.setCUST_ODR_NO(null);// ���Ӑ撍���ԍ�
		struct.setTAX_CD(null);// ����ŃR�[�h
		struct.setITEM_CD(null);// �i�ڔԍ�
		struct.setITEM_NAME(null);// �i�ږ�
		struct.setCUST_CD(null);// ���Ӑ�R�[�h
		struct.setCUST_NAME(null);// ���Ӑ於
		struct.setCUST_ITEM_CD(null);// ���Ӑ�i�ڔԍ�
		struct.setCUST_ITEM_NAME(null);// ���Ӑ�i�ږ���
		struct.setINSPC_ACPT_TYP(null);// �����敪
		struct.setODR_QTY(null);// �󒍐���
		struct.setODR_ACPT_DATE(null);// �󒍓�
		struct.setODR_UNIT_PRICE(null);// �P��
		struct.setODR_UNIT_CD(null);// �ʉݒP��_�P��
		struct.setSHIP_DLV_DATE(null);// �o�ח\���
		struct.setODR_AMOUNT(null);// �󒍋��z
		struct.setODR_AMOUNT_UNIT_CD(null);// �ʉݒP��_�󒍋��z
		struct.setDESINATED_DLV_DATE(null);// �w��[��
		struct.seth_INSPC_ACPT_TYP(null);// �����敪(HIDDEN)
		struct.seth_CURRNCY_CD(null);// �ʉ݃R�[�h(HIDDEN)
		struct.seth_EXCH_TYP(null);// �ב֎��(HIDDEN)
		struct.seth_PRICE_ROUND_TYP(null);// �P���v�Z�܂�ߋ敪(HIDDEN)
		struct.seth_TRANSPORT_LT(null);// �^������(HIDDEN)
		if (list != null){
			list.clear();
		}
    }
    /***
     * ���|���g�����X�V����
     * @param workStruct
     * @throws Exception
     */
	private void updateT_AR_LEDGER_TRN(KQ0100010Struct workStruct) throws Exception {
		String taxRate1 = null;			 // �ŗ��P
		String taxRate2 = null;			 // �ŗ��Q
		String taxRate3 = null;			 // �ŗ��R
		String taxRoundTyp = null;  	 // �Œ[���敪
		String internalTaxAmount = null; // ���őΏۋ��z
		String externalTaxAmount = null; // �O�őΏۋ��z
		String taxfreeAmount = null; 	 // ��ېőΏۋ��z
		String taxAmount1 = null; 		 // �Ŋz�P
		String taxAmount2 = null;		 // �Ŋz�Q
		String taxAmount3 = null; 		 // �Ŋz�R
		String taxCreditAmount = null;   // �Ŕ������z
		String dExchAmount = null;		 // �Ŕ�������z�i�M�݁j
		
		// ����ŃR�[�h�̂R����
	    String tempTaxCd = struct.getTAX_CD().substring(struct.getTAX_CD().length() - 1, struct.getTAX_CD().length());
	    
	    // ����ŏ����擾
		TaxStruct ts =
			TaxControl.getDataTax(
				this.conn,		 
				workStruct.getl_h_AR_TRN_INSPC_ACPT_DATE(), // ���|���g����_��̌�����(HIDDEN)
				struct.getTAX_CD());     // ����ŃR�[�h
		taxRate1 = ts.getTAX_RATE_1();   // �ŗ��P
		taxRate2 = ts.getTAX_RATE_2();   // �ŗ��Q
		taxRate3 = ts.getTAX_RATE_3();   // �ŗ��R
		taxRoundTyp = ts.getTAX_ROUND_TYP(); // �[���敪
		
		// �Ŋz�v�Z����
		TaxAmountStruct tas =
			TaxAmountControl.getData(
					this.conn, 
					workStruct.getl_h_AR_TRN_SALES_AMOUNT(),// ���|���g����_������z(HIDDEN)
					struct.getTAX_CD(), 				// ����ŃR�[�h
					taxRate1, 							// �ŗ��P
					taxRate2, 							// �ŗ��Q
					taxRate3, 							// �ŗ��R
					taxRoundTyp);						// �[���敪
		internalTaxAmount = tas.getINTERNAL_TAX_AMOUNT(); // ���őΏۋ��z
		externalTaxAmount = tas.getEXTERNAL_TAX_AMOUNT(); // �O�őΏۋ��z
		taxfreeAmount = tas.getTAXFREE_AMOUNT(); 	 	  // ��ېőΏۋ��z
		taxAmount1 = tas.getTAX_AMOUNT_1(); 		 	  // �Ŋz�P
		taxAmount2 = tas.getTAX_AMOUNT_2();		          // �Ŋz�Q
		taxAmount3 = tas.getTAX_AMOUNT_3(); 		      // �Ŋz�R
		taxCreditAmount = tas.getTAX_CREDIT_AMOUNT();     // �Ŕ������z

		// �M�݌v�Z����
		ExchAmount exch = new ExchAmount(conn);

		boolean result = exch.doExchAmount(
				taxCreditAmount,
				COMPANY_CD,
				struct.geth_CURRNCY_CD(), 
				struct.geth_EXCH_TYP(), 
				struct.geth_PRICE_ROUND_TYP(), 
				workStruct.getl_h_AR_TRN_INSPC_ACPT_DATE()); // ���|���g����_��̌�����(HIDDEN)
		
		if (!result) {
			conn.rollback();
			setErrorMessage("KQ00038");
			return;
		}
		dExchAmount = String.valueOf(exch.getD_EXCH_AMOUNT());
		
		// [���|���g��������]�̍X�V
		KQ0100010Struct updateStruct = new KQ0100010Struct();
		updateStruct.setsUser_ID(sysUSER_CD);
		updateStruct.setsSysdate(struct.getsSysdate());
		
		updateStruct.setTAX_CD_1(struct.getTAX_CD());				// ����ŃR�[�h�P
		updateStruct.setTAX_CD_2(tempTaxCd);						// ����ŃR�[�h�Q
		updateStruct.setEXTERNAL_TAX_SALES_AMOUNT(externalTaxAmount);	// �O�őΏۋ��z
		updateStruct.setINTERNAL_TAX_SALES_AMOUNT(internalTaxAmount);	// ���őΏۋ��z
		updateStruct.setTAXFREE_SALES_AMOUNT(taxfreeAmount);			// ��ېőΏۋ��z
		updateStruct.setTAX_CREDIT_SALES_AMOUNT(taxCreditAmount);			// �Ŕ�������z
		if ("1".equals(tempTaxCd)){
			updateStruct.setEXTERNAL_TAX_AMOUNT(Calculate.add(taxAmount1, Calculate.add(taxAmount2, taxAmount3)));
		} else {
			updateStruct.setEXTERNAL_TAX_AMOUNT("0");					// ����Ŋz�i�O�Łj
		}
		if ("5".equals(tempTaxCd)){
			updateStruct.setINTERNAL_TAX_AMOUNT(Calculate.add(taxAmount1, Calculate.add(taxAmount2, taxAmount3)));
		} else {
			updateStruct.setINTERNAL_TAX_AMOUNT("0");					// ����Ŋz�i���Łj
		}
		updateStruct.setTAX_AMOUNT_1(taxAmount1);
		updateStruct.setTAX_AMOUNT_2(taxAmount2);
		updateStruct.setTAX_AMOUNT_3(taxAmount3);
		updateStruct.setOWN_CUR_TAXCREDIT_SALES_AMOUNT(dExchAmount);
		updateStruct.setCOMPANY_CD(COMPANY_CD);
		updateStruct.setSLIP_CTRL_GRP(struct.geth_SLIP_CTRL_GRP());
		updateStruct.setSLIP_CD(workStruct.getl_SHIP_ODR_SLIP_CD());
		updateStruct.setSLIP_DATE(workStruct.getl_h_INSPC_ACPT_DATE());
		List selList = entity.mSELECT_T_AR_LEDGER_TRN_FOR.read(conn, updateStruct);
		entity.mupdateT_AR_LEDGER_TRN.update(conn, updateStruct);
		
		// [���|���g�����w�b�_]�̍X�V
		// [���|���g��������]����f�[�^���擾����
		List trnList = entity.mselectT_AR_LEDGER_TRN.read(conn, updateStruct);
		if (!trnList.isEmpty()){
			// [���|���g�����w�b�_]���X�V����
			KQ0100010Struct detailStruct = (KQ0100010Struct)trnList.get(0);
			detailStruct.setsUser_ID(sysUSER_CD);
			detailStruct.setsSysdate(struct.getsSysdate());
			detailStruct.setCOMPANY_CD(COMPANY_CD);
			detailStruct.setSLIP_CTRL_GRP(struct.geth_SLIP_CTRL_GRP());
			detailStruct.setSLIP_CD(workStruct.getl_SHIP_ODR_SLIP_CD());
			detailStruct.setSLIP_DATE(workStruct.getl_h_INSPC_ACPT_DATE());
			entity.mupdateT_AR_LEDGER_H_TRN.update(conn, detailStruct);
		}
	}
    /***
     * ���|�������X�V����
     * @param workStruct
     * @throws Exception
     */
	private void updateT_AR_LEDGER(KQ0100010Struct workStruct) throws Exception {
		String taxRate1 = null;			 // �ŗ��P
		String taxRate2 = null;			 // �ŗ��Q
		String taxRate3 = null;			 // �ŗ��R
		String taxRoundTyp = null;  	 // �Œ[���敪
		String internalTaxAmount = null; // ���őΏۋ��z
		String externalTaxAmount = null; // �O�őΏۋ��z
		String taxfreeAmount = null; 	 // ��ېőΏۋ��z
		String taxAmount1 = null; 		 // �Ŋz�P
		String taxAmount2 = null;		 // �Ŋz�Q
		String taxAmount3 = null; 		 // �Ŋz�R
		String taxCreditAmount = null;   // �Ŕ������z
		String dExchAmount = null;		 // �Ŕ�������z�i�M�݁j
		
		// ����ŃR�[�h�̂R����
	    String tempTaxCd = struct.getTAX_CD().substring(struct.getTAX_CD().length() - 1, struct.getTAX_CD().length());
	    
	    // ����ŏ����擾
		TaxStruct ts =
			TaxControl.getDataTax(
				this.conn,		 
				workStruct.getl_h_AR_INSPC_ACPT_DATE(), // ���|������_��̌�����(HIDDEN)
				struct.getTAX_CD());     // ����ŃR�[�h
		taxRate1 = ts.getTAX_RATE_1();   // �ŗ��P
		taxRate2 = ts.getTAX_RATE_2();   // �ŗ��Q
		taxRate3 = ts.getTAX_RATE_3();   // �ŗ��R
		taxRoundTyp = ts.getTAX_ROUND_TYP(); // �[���敪
		
		// �Ŋz�v�Z����
		TaxAmountStruct tas =
			TaxAmountControl.getData(
					this.conn, 
					workStruct.getl_h_AR_SALES_AMOUNT(),// ���|������_������z(HIDDEN)
					struct.getTAX_CD(), 				// ����ŃR�[�h
					taxRate1, 							// �ŗ��P
					taxRate2, 							// �ŗ��Q
					taxRate3, 							// �ŗ��R
					taxRoundTyp);						// �[���敪
		internalTaxAmount = tas.getINTERNAL_TAX_AMOUNT(); // ���őΏۋ��z
		externalTaxAmount = tas.getEXTERNAL_TAX_AMOUNT(); // �O�őΏۋ��z
		taxfreeAmount = tas.getTAXFREE_AMOUNT(); 	 	  // ��ېőΏۋ��z
		taxAmount1 = tas.getTAX_AMOUNT_1(); 		 	  // �Ŋz�P
		taxAmount2 = tas.getTAX_AMOUNT_2();		          // �Ŋz�Q
		taxAmount3 = tas.getTAX_AMOUNT_3(); 		      // �Ŋz�R
		taxCreditAmount = tas.getTAX_CREDIT_AMOUNT();     // �Ŕ������z

		// �M�݌v�Z����
		ExchAmount exch = new ExchAmount(conn);

		boolean result = exch.doExchAmount(
				taxCreditAmount,
				COMPANY_CD,
				struct.geth_CURRNCY_CD(), 
				struct.geth_EXCH_TYP(), 
				struct.geth_PRICE_ROUND_TYP(), 
				workStruct.getl_h_AR_INSPC_ACPT_DATE()); // ���|������_��̌�����(HIDDEN)
		
		if (!result) {
			conn.rollback();
			setErrorMessage("KQ00038");
			return;
		}
		dExchAmount = String.valueOf(exch.getD_EXCH_AMOUNT());
		
		// [���|����������]�̍X�V
		KQ0100010Struct updateStruct = new KQ0100010Struct();
		updateStruct.setsUser_ID(sysUSER_CD);
		updateStruct.setsSysdate(struct.getsSysdate());
		
		updateStruct.setTAX_CD_1(struct.getTAX_CD());				// ����ŃR�[�h�P
		updateStruct.setTAX_CD_2(tempTaxCd);						// ����ŃR�[�h�Q
		updateStruct.setEXTERNAL_TAX_SALES_AMOUNT(externalTaxAmount);	// �O�őΏۋ��z
		updateStruct.setINTERNAL_TAX_SALES_AMOUNT(internalTaxAmount);	// ���őΏۋ��z
		updateStruct.setTAXFREE_SALES_AMOUNT(taxfreeAmount);			// ��ېőΏۋ��z
		updateStruct.setTAX_CREDIT_SALES_AMOUNT(taxCreditAmount);		// �Ŕ�������z
		if ("1".equals(tempTaxCd)){
			updateStruct.setEXTERNAL_TAX_AMOUNT(Calculate.add(taxAmount1, Calculate.add(taxAmount2, taxAmount3)));
		} else {
			updateStruct.setEXTERNAL_TAX_AMOUNT("0");					// ����Ŋz�i�O�Łj
		}
		if ("5".equals(tempTaxCd)){
			updateStruct.setINTERNAL_TAX_AMOUNT(Calculate.add(taxAmount1, Calculate.add(taxAmount2, taxAmount3)));
		} else {
			updateStruct.setINTERNAL_TAX_AMOUNT("0");					// ����Ŋz�i���Łj
		}
		updateStruct.setTAX_AMOUNT_1(taxAmount1);
		updateStruct.setTAX_AMOUNT_2(taxAmount2);
		updateStruct.setTAX_AMOUNT_3(taxAmount3);
		updateStruct.setOWN_CUR_TAXCREDIT_SALES_AMOUNT(dExchAmount);
		updateStruct.setCOMPANY_CD(COMPANY_CD);
		updateStruct.setSLIP_CTRL_GRP(struct.geth_SLIP_CTRL_GRP());
		updateStruct.setSLIP_CD(workStruct.getl_SHIP_ODR_SLIP_CD());
		updateStruct.setSLIP_DATE(workStruct.getl_h_INSPC_ACPT_DATE());
		List selList = entity.mSELECT_T_AR_LEDGER_FOR.read(conn, updateStruct);
		entity.mupdateT_AR_LEDGER.update(conn, updateStruct);
		
		// [���|���g�����w�b�_]�̍X�V
		// [���|���g��������]����f�[�^���擾����
		List trnList = entity.mselectT_AR_LEDGER.read(conn, updateStruct);
		if (!trnList.isEmpty()){
			// [���|���g�����w�b�_]���X�V����
			KQ0100010Struct detailStruct = (KQ0100010Struct)trnList.get(0);
			detailStruct.setsUser_ID(sysUSER_CD);
			detailStruct.setsSysdate(struct.getsSysdate());
			detailStruct.setCOMPANY_CD(COMPANY_CD);
			detailStruct.setSLIP_CTRL_GRP(struct.geth_SLIP_CTRL_GRP());
			detailStruct.setSLIP_CD(workStruct.getl_SHIP_ODR_SLIP_CD());
			detailStruct.setSLIP_DATE(workStruct.getl_h_INSPC_ACPT_DATE());
			entity.mupdateT_AR_LEDGER_H.update(conn, detailStruct);
		}
	}
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0100");
		logger.entering("KQ0100010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			setReadStatus(INITIAL);
			list = new ArrayList();
			// �V�X�e���Ǘ����̌���
			// �u���|�Ǘ��I�v�V�����v���擾����
			struct.setOPTION_ID("B%");
			List optionList = entity.mgetOptionId.read(conn, struct);
			if (!optionList.isEmpty()){
				OPTION_ID_B = "1";
			}
			// �u�`���A�g���v���擾����
			struct.setOPTION_ID("AiR");
			optionList = entity.mgetOptionId.read(conn, struct);
			if (!optionList.isEmpty()){
				OPTION_ID_AIR = "1";
			}
			// �w�b�_�̌���
			List headList = new ArrayList();
			if ("true".equals(struct.getr_SEL_PTN1())){
				headList = entity.mselect_Head.read(conn, struct);
			} else {
				headList = entity.mselect_Head_Slip.read(conn, struct);
			}
			
			// [���Ӑ�[�i�ꏊ]."�o�בq�ɃR�[�h" �� [�ۊǋ�] ���擾���� "�H��R�[�h"
			String strPlantCd = null;
			
			if (headList.isEmpty()){
				setReadStatus(NOT_FOUND);
				ExpjMessage emsg = new ExpjMessage( "ZZ06001");
				msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
				sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e
				return;
			} else {
				KQ0100010Struct tempStruct = new KQ0100010Struct();
				tempStruct = (KQ0100010Struct)headList.get(0);
				
				// �o�׏���LT�̎擾
				String shipLt = null;
				List ltList = entity.mgetSYUKA_LT.read(conn, struct);
				if (ltList.isEmpty()){
					setErrorMessage("KQ00037");
					return;
				} else {
					shipLt =((KQ0100010Struct)ltList.get(0)).getCODE();
				}
				
				// �o�ח\����v�Z
				struct.seth_TRANSPORT_LT(tempStruct.geth_TRANSPORT_LT());          // [���Ӑ�[�i�ꏊ]."�^������"
				strPlantCd = tempStruct.getPLANT_CD();							   // [�ۊǋ�]."�H��R�[�h"
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
				Date wkDate = dateFormat.parse(tempStruct.getDESINATED_DLV_DATE());
				WorkDay wkd = new WorkDay(struct.getsUser_ID(),		//���[�U�R�[�h
						this.getBusiness().getBusinessCd(),			//�Ɩ��R�[�h
						strPlantCd,									//�H��R�[�h
						wkDate,										//�Ώۓ��t
						- Integer.parseInt(struct.geth_TRANSPORT_LT()) - Integer.parseInt(shipLt),	//���Z��
						false					//�O�|���t���O
					);
				wkDate = wkd.calcDate();		//�v�Z����
				if(wkDate == null){
					setErrorMessage("KQ00040");
					return;
				}
				struct.setSHIP_DLV_DATE(String.valueOf(Converter.dateToStr(wkDate, "yyyy/MM/dd")));
				
				struct.seth_ODR_NO(tempStruct.geth_ODR_NO());					   // [�󒍖���]."�󒍔ԍ�"
				struct.setCUST_ODR_NO(tempStruct.getCUST_ODR_NO());                // [�󒍖���]."���Ӑ撍���ԍ�"
				struct.setITEM_CD(tempStruct.getITEM_CD());                        // [�󒍊Ǘ�]."�i�ڔԍ�"
				struct.setITEM_NAME(tempStruct.getITEM_NAME());                    // [�󒍊Ǘ�]."�i�ږ���"
				struct.setCUST_CD(tempStruct.getCUST_CD());                        // [�󒍊Ǘ�]."���Ӑ�R�[�h"
				struct.setCUST_NAME(tempStruct.getCUST_NAME());                    // [���Ӑ�]."���Ӑ於"
				struct.setCUST_ITEM_CD(tempStruct.getCUST_ITEM_CD());              // [�󒍊Ǘ�]."���Ӑ�i�ڔԍ�"
				struct.setCUST_ITEM_NAME(tempStruct.getCUST_ITEM_NAME());          // [�󒍊Ǘ�]."���Ӑ�i�ږ���"
				struct.setODR_ACPT_DATE(tempStruct.getODR_ACPT_DATE());            // [�󒍖���]."�󒍓�"
				struct.setDESINATED_DLV_DATE(tempStruct.getDESINATED_DLV_DATE());  // [�󒍖���]."�w��[��"
				struct.setODR_UNIT_PRICE(tempStruct.getODR_UNIT_PRICE());          // [�󒍖���]."�󒍒P��"
				struct.setODR_UNIT_CD(tempStruct.getODR_UNIT_CD());                // [�ʉ�]."�ʉݒP��"
				struct.setODR_QTY(tempStruct.getODR_QTY());                        // [�󒍖���]."�󒍐���"
				struct.setTAX_CD(tempStruct.getTAX_CD());                          // [�󒍖���]."����ŃR�[�h"
				struct.setODR_AMOUNT(tempStruct.getODR_AMOUNT());                  // [�󒍖���]."�󒍋��z"
				struct.setODR_AMOUNT_UNIT_CD(tempStruct.getODR_AMOUNT_UNIT_CD());  // [�ʉ�]."�ʉݒP��"
				struct.seth_INSPC_ACPT_TYP(tempStruct.geth_INSPC_ACPT_TYP());      // [���Ӑ�]."�����敪"
				struct.setINSPC_ACPT_TYP(getTypeName(_INSPC_ACPT_TYP, tempStruct.geth_INSPC_ACPT_TYP()));
				struct.seth_CURRNCY_CD(tempStruct.geth_CURRNCY_CD());              // [�󒍖���]."�ʉ݃R�[�h"
				struct.seth_EXCH_TYP(tempStruct.geth_EXCH_TYP());                  // [�󒍖���]."�ב֎��"
				struct.seth_PRICE_ROUND_TYP(tempStruct.geth_PRICE_ROUND_TYP());    // [���Ӑ�]."�P���v�Z�܂�ߋ敪"		
				struct.seth_MODIFY_COUNT(tempStruct.geth_MODIFY_COUNT());
				
				
				// �`�[�Ǘ��O���[�v���擾����
				struct.setCOMPANY_CD(COMPANY_CD);
				if("1".equals(OPTION_ID_B)) {
					List slipCtrlGrp = entity.mgetSLIP_CTRL_GRP.read(conn, struct);
					if (!slipCtrlGrp.isEmpty()){
						struct.setSLIP_CTRL_GRP(((KQ0100010Struct)slipCtrlGrp.get(0)).getSLIP_CTRL_GRP());
						struct.seth_SLIP_CTRL_GRP(((KQ0100010Struct)slipCtrlGrp.get(0)).getSLIP_CTRL_GRP());
					} else {
						setErrorMessage("KI00006");
						return;
					}
					
				}
				
				// ���ׂ̌���
				// ���X�g�\���ő匏��
				int maxLine = sp.getMaxLine(conn, 10);
				if(maxLine != 0) {
					struct.setROW_COUNT(String.valueOf(maxLine));
				}else {
					struct.setROW_COUNT(null);
			    }
				List WorkList;
				if ("1".equals(OPTION_ID_B)){
					WorkList = entity.mselectCnt.read(conn, struct);
				} else {
					WorkList = entity.mselectCnt1.read(conn, struct);
				}
				if (!WorkList.isEmpty()){
					long rowCount = Long.parseLong(((KQ0100010Struct)WorkList.get(0)).getCOUNT());
					// �\���s�������l(SYS_SCREEN_PARM)�𒴂����ꍇ�G���[
		          	if ((maxLine != 0) && (rowCount== maxLine + 1)) {
		            	setErrorMessage("ZZ01115", String.valueOf(maxLine));
		            	if(list!=null && list.size()>0){
		 				   setList(null);
		 				}
		            	setReadStatus(TOO_MANY);
		            	return;
		          	}
				}
				
				List detailList;
				if ("1".equals(OPTION_ID_B)){
					detailList = entity.mselect_Detail.read(conn, struct);
				} else {
					detailList = entity.mselectDetail1.read(conn, struct);
				}
				
				if (!detailList.isEmpty()){
					for (int i = 0; i < detailList.size(); i++){
						tempStruct = (KQ0100010Struct)detailList.get(i);
						// ���[����
						tempStruct.setl_PART_DLV_SEQ_NO(tempStruct.getl_PART_DLV_SEQ_NO());
						// �`�[�ԍ�
						tempStruct.setl_SHIP_ODR_SLIP_CD(tempStruct.getl_SHIP_ODR_SLIP_CD());
						// �o�׎w���
						tempStruct.setl_DESINATED_SHIP_DATE(tempStruct.getl_DESINATED_SHIP_DATE());
						// �[�i�\����i�o�׎w���x�[�X�j
						tempStruct.setl_ODR_SCDL_DLV_DATE(tempStruct.getl_SCDL_DLV_DATE());
						// �o�׎��ѓ�
						tempStruct.setl_SHIP_DATE(tempStruct.getl_SHIP_DATE());
						// �[�i�\����i�o�׎��уx�[�X�j
						if (!isNull(tempStruct.getl_SHIP_DATE())){
							wkDate = dateFormat.parse(tempStruct.getl_SHIP_DATE());
							wkd = new WorkDay(struct.getsUser_ID(),		//���[�U�R�[�h
									this.getBusiness().getBusinessCd(),				//�Ɩ��R�[�h
									strPlantCd,										//�H��R�[�h
									wkDate,										//�Ώۓ��t
									Integer.parseInt(struct.geth_TRANSPORT_LT()),	//���Z��
									true											//�O�|���t���O
								);
							wkDate = wkd.calcDate();		//�v�Z����
							if(wkDate == null){
								setErrorMessage("KQ00040");
								return;
							}
							tempStruct.setl_SHIP_SCDL_DLV_DATE((Converter.dateToStr(wkDate, "yyyy/MM/dd")));
						}
						
						// ����v���
						tempStruct.setl_SALES_DATE(tempStruct.getl_SALES_DATE());
						// ����
						tempStruct.setl_JOB_ODR_CD(tempStruct.getl_JOB_ODR_CD());
						// �o�׎��ы��z(HIDDEN)
						tempStruct.setl_h_SHIP_ODR_AMOUNT(tempStruct.getl_SHIP_ODR_AMOUNT());
						// ������z(HIDDEN)
						tempStruct.setl_h_SALES_AMOUNT(tempStruct.getl_SALES_AMOUNT());
						// Ai���|�C���^�t�F�[�X�t���O(HIDDEN)
						tempStruct.setl_h_AI_AR_IF_FLG(tempStruct.getl_AI_AR_IF_FLG());
						// ����Ōv�Z��_�o�׎w��(HIDDEN)
						// ��ʃw�b�_.�����敪(HIDDEN) = "1" �̏ꍇ
						if ("1".equals(struct.geth_INSPC_ACPT_TYP())){
							// [�o�׎w��]."�o�׎w���"
							tempStruct.setl_h_TAX_DESINATED_SHIP_DATE(tempStruct.getl_DESINATED_SHIP_DATE());
						} else {
							// [�o�׎w��]."�[�i�\���"
							tempStruct.setl_h_TAX_DESINATED_SHIP_DATE(tempStruct.getl_SCDL_DLV_DATE());
						}
						// �o�׎w���ԍ�(HIDDEN)
						tempStruct.setl_h_SHIP_ODR_NO(tempStruct.getl_SHIP_ODR_NO());
						// ������ъǗ��ԍ�(HIDDEN)
						tempStruct.setl_h_SALES_SEQ_NO(tempStruct.getl_SALES_SEQ_NO());
						// ������ѓ`�[�ԍ�(HIDDEN)
						tempStruct.setl_h_SALES_SLIP_CD(tempStruct.getl_SALES_SLIP_CD());
						// �o�׎w�����z(HIDDEN)
						tempStruct.setl_h_SHIP_ODR_AMOUNT(tempStruct.getl_ODR_AMOUNT());
						// �o�׎��ъǗ��ԍ�(HIDDEN)
						tempStruct.setl_h_SHIP_SEQ_NO(tempStruct.getl_SHIP_SEQ_NO());
						
						// �X�e�[�^�X�ԍ����擾����
						// WHEN [�󒍖���]."�󒍔ԍ�" IS NOT NULL THEN "1"
						if (!isNull(tempStruct.getl_ODR_ODR_NO())){
							tempStruct.setl_h_STATUS_CD("1");
						}
						// WHEN [�o�׌v��]."�󒍔ԍ�" IS NOT NULL THEN "2"
						if (!isNull(tempStruct.getl_DLV_ODR_NO())){
							tempStruct.setl_h_STATUS_CD("2");
						}
						// WHEN [�o�׎w��]."�o�׎w���ԍ�" IS NOT NULL THEN "3"
						if (!isNull(tempStruct.getl_SHIP_ODR_NO())){
							tempStruct.setl_h_STATUS_CD("3");
						}
						// WHEN [�o�׎���]."�o�׎��ъǗ��ԍ�" IS NOT NULL THEN "4"
						if (!isNull(tempStruct.getl_SHIP_SEQ_NO())){
							tempStruct.setl_h_STATUS_CD("4");
						}
						// WHEN [�������]."��ԋ敪" = '20' THEN "5"
						if (!isNull(tempStruct.getl_SALES_STATUS()) && "20".equals(tempStruct.getl_SALES_STATUS())){
							tempStruct.setl_h_STATUS_CD("5");
						}
						// WHEN �u���|�Ǘ��I�v�V�����v = "1"
					    // AND [���|���g�����w�b�_]."��ԋ敪" > 20
					    // AND [���|���g�����w�b�_]."��ԋ敪" < 30 THEN "6"
						if ("1".equals(OPTION_ID_B) &&
								!isNull(tempStruct.getAR_TRN_STATUS()) &&
								Calculate.compare(tempStruct.getAR_TRN_STATUS(), "20") == 1 &&
								Calculate.compare(tempStruct.getAR_TRN_STATUS(), "30") == -1 ){
							tempStruct.setl_h_STATUS_CD("6");
						}
						// WHEN �u���|�Ǘ��I�v�V�����v = "1"
					    // AND [���|���g�����w�b�_]."��ԋ敪" >=30
					    // AND [���|���g�����w�b�_]."��ԋ敪" < 40 THEN "7"
						if ("1".equals(OPTION_ID_B) &&
								!isNull(tempStruct.getAR_STATUS()) &&
								Calculate.compare(tempStruct.getAR_STATUS(), "30") >= 0 &&
								Calculate.compare(tempStruct.getAR_STATUS(), "40") == -1 ){
							tempStruct.setl_h_STATUS_CD("7");
						}
						// WHEN    �u���|�Ǘ��I�v�V�����v = "1"
					    // AND [���|�������w�b�_]."��ԋ敪" >=40  THEN "8"
						if ("1".equals(OPTION_ID_B) &&
								!isNull(tempStruct.getAR_STATUS()) &&
								Calculate.compare(tempStruct.getAR_STATUS(), "40") >= 0){
							tempStruct.setl_h_STATUS_CD("8");
						}
						
						// �X�V�t���O
						tempStruct.setl_h_UPDATE_FLG("0");
						if ("1".equals(OPTION_ID_B) && "8".equals(tempStruct.getl_h_STATUS_CD())){
							tempStruct.setl_h_UPDATE_FLG("1");
						} 
						if ("1".equals(OPTION_ID_AIR) && 
								"5".equals(tempStruct.getl_h_STATUS_CD()) && 
								"1".equals(tempStruct.getl_AI_AR_IF_FLG())){
							tempStruct.setl_h_UPDATE_FLG("1");
						}
						// �X�e�[�^�X
						tempStruct.setl_STATUS(getTypeName(_STATUS_TYP, tempStruct.getl_h_STATUS_CD()));
						list.add(tempStruct);
					}
				}
			}
			// �`�F�b�N����
			UPDATE_FLG = "0";
			KQ0100010Struct tempStruct = new KQ0100010Struct();
			for (int i= 0; i < list.size(); i++){
				tempStruct = (KQ0100010Struct)list.get(i);
				if ("1".equals(tempStruct.getl_h_UPDATE_FLG())){
					UPDATE_FLG = "1";
					break;
				}
			}
			
			struct.seth_UPDATE_FLG(UPDATE_FLG);
			if ("1".equals(UPDATE_FLG)){
				setErrorMessage("KQ00338");
				return;
			}
			// �����f�[�^�ێ�
			TAX_CD = struct.getTAX_CD();
			struct.seth_TAX_CD(TAX_CD);
			setReadStatus(NORMAL);
		
		} catch (Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}
                //}}user_implement_dev:<controlselect>
		logger.exiting("KQ0100010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0100");
		logger.entering("KQ0100010Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try{
			this.conn.beginTransWeb();
			
			// ���̓`�F�b�N����
			List taxList = entity.mget_TAX_CD.read(conn, struct);
			if (taxList.isEmpty()){
				setErrorMessage("AA01001");
				return;
			}
			
			// 2.12.7.1	�w�b�_�X�V����
			// �@�@[�󒍖���]���X�V����
			struct.setsUser_ID(sysUSER_CD);
			List modifyCountList = entity.mSELECT_MODIFY_COUNT.read(conn, struct);
			if (!modifyCountList.isEmpty()) {
				KQ0100010Struct modifyCountStruct = (KQ0100010Struct)modifyCountList.get(0);
				if (!struct.geth_MODIFY_COUNT().equals(modifyCountStruct.getMODIFY_COUNT())) {
					setErrorMessage("ZZ01105");
					conn.rollback();
					return;
				}
			}
			entity.mT_ODR.update(conn, struct);
			
			// �A�@[�󒍗���]�̓o�^
			struct.setCREATED_BY(sysUSER_CD);
			struct.setCREATED_PRG_NM(sp.getProcId());
			entity.mT_ODR_ACPT_RSLT.create(conn, struct);

			// 2.12.7.2	���׍X�V����
			KQ0100010Struct tempStruct = new KQ0100010Struct();
			String taxRate1 = null;			 // �ŗ��P
			String taxRate2 = null;			 // �ŗ��Q
			String taxRate3 = null;			 // �ŗ��R
			String taxRoundTyp = null;  	 // �Œ[���敪
			String internalTaxAmount = null; // ���őΏۋ��z
			String externalTaxAmount = null; // �O�őΏۋ��z
			String taxfreeAmount = null; 	 // ��ېőΏۋ��z
			String taxAmount1 = null; 		 // �Ŋz�P
			String taxAmount2 = null;		 // �Ŋz�Q
			String taxAmount3 = null; 		 // �Ŋz�R
			String taxAmount = null;  		 // �ō��݋��z
			String taxCreditAmount = null;   // �Ŕ������z
			String dExchAmount = null;		 // �Ŕ�������z�i�M�݁j
			
			// ����ŃR�[�h�̂R����
		    String tempTaxCd = struct.getTAX_CD().substring(struct.getTAX_CD().length() - 1, struct.getTAX_CD().length());

			for (int i = 0; i < list.size(); i++){
				tempStruct = (KQ0100010Struct)list.get(i);
				
				// �u�X�e�[�^�X�ԍ��v�@���@3�̏ꍇ�A�ȉ��̏������s�킸�Ɏ����ׂ̏������s��
				if (Calculate.compare(tempStruct.getl_h_STATUS_CD(), "3") != -1){
					// �@ [�o�ד`�[�f�[�^]�̍X�V
					// ����ŏ����擾
					TaxStruct ts =
						TaxControl.getDataTax(
							this.conn,		 
							tempStruct.getl_h_TAX_DESINATED_SHIP_DATE(), // ����Ōv�Z��
							struct.getTAX_CD());     // ����ŃR�[�h
					taxRate1 = ts.getTAX_RATE_1();   // �ŗ��P
					taxRate2 = ts.getTAX_RATE_2();   // �ŗ��Q
					taxRate3 = ts.getTAX_RATE_3();   // �ŗ��R
					taxRoundTyp = ts.getTAX_ROUND_TYP(); // �[���敪
					
					// �Ŋz�v�Z����
					TaxAmountStruct tas =
						TaxAmountControl.getData(
								this.conn, 
								tempStruct.getl_h_SHIP_ODR_AMOUNT(),// �o�׎w�����z(HIDDEN)
								struct.getTAX_CD(), 				// ����ŃR�[�h
								taxRate1, 							// �ŗ��P
								taxRate2, 							// �ŗ��Q
								taxRate3, 							// �ŗ��R
								taxRoundTyp);						// �[���敪
					internalTaxAmount = tas.getINTERNAL_TAX_AMOUNT(); // ���őΏۋ��z
					externalTaxAmount = tas.getEXTERNAL_TAX_AMOUNT(); // �O�őΏۋ��z
					taxfreeAmount = tas.getTAXFREE_AMOUNT(); 	 	  // ��ېőΏۋ��z
					taxAmount1 = tas.getTAX_AMOUNT_1(); 		 	  // �Ŋz�P
					taxAmount2 = tas.getTAX_AMOUNT_2();		          // �Ŋz�Q
					taxAmount3 = tas.getTAX_AMOUNT_3(); 		      // �Ŋz�R
					taxAmount = tas.getTAX_AMOUNT();  		          // �ō��݋��z
					taxCreditAmount = tas.getTAX_CREDIT_AMOUNT();     // �Ŕ������z

					// �M�݌v�Z����
					ExchAmount exch = new ExchAmount(conn);

					boolean result = exch.doExchAmount(
							taxCreditAmount,
							COMPANY_CD,
							struct.geth_CURRNCY_CD(), 
							struct.geth_EXCH_TYP(), 
							struct.geth_PRICE_ROUND_TYP(), 
							tempStruct.getl_h_TAX_DESINATED_SHIP_DATE()); // ����Ōv�Z��

					if (!result) {
						conn.rollback();
						setErrorMessage("KQ00038");
						return;
					}
					dExchAmount = String.valueOf(exch.getD_EXCH_AMOUNT());
			        
					// [�o�ד`�[�f�[�^]�̍X�V
					// �o�׎w�����z
					tempStruct.setslipSHIP_ODR_AMOUNT(taxCreditAmount);
					// ����Ŋz
					tempStruct.setslipTAX_AMOUNT(Calculate.add(taxAmount1, Calculate.add(taxAmount2, taxAmount3)));
					// �o�׎w�����z(�ō���)
					tempStruct.setslipSHIP_ODR_AMOUNT_TAX(taxAmount);
					// �O�őΏۋ��z
					tempStruct.setslipEXTERNAL_TAX_SALES_AMOUNT(externalTaxAmount);
					// ���őΏۋ��z
					tempStruct.setslipINTERNAL_TAX_SALES_AMOUNT(internalTaxAmount);
					// ��ېőΏۋ��z
					tempStruct.setslipTAXFREE_SALES_AMOUNT(taxfreeAmount);
					// �Ŕ�������z
					tempStruct.setslipTAX_CREDIT_SALES_AMOUNT(taxCreditAmount);
				    if ("1".equals(tempTaxCd)){
				    	// ����Ŋz�i�O�Łj
						tempStruct.setslipEXTERNAL_TAX_AMOUNT(Calculate.add(taxAmount1, Calculate.add(taxAmount2, taxAmount3)));
				    } else {
				    	// ����Ŋz�i�O�Łj
						tempStruct.setslipEXTERNAL_TAX_AMOUNT("0");
				    }
				    if ("5".equals(tempTaxCd)){
						// ����Ŋz�i���Łj
						tempStruct.setslipINTERNAL_TAX_AMOUNT(Calculate.add(taxAmount1, Calculate.add(taxAmount2, taxAmount3)));
				    } else {
				    	// ����Ŋz�i���Łj
						tempStruct.setslipINTERNAL_TAX_AMOUNT("0");
				    }
					// �Ŋz�P
					tempStruct.setslipTAX_AMOUNT_1(taxAmount1);
					// �Ŋz�Q
					tempStruct.setslipTAX_AMOUNT_2(taxAmount2);
					// �Ŋz�R
					tempStruct.setslipTAX_AMOUNT_3(taxAmount3);
					// �Ŕ�������z�i�M�݁j
					tempStruct.setslipOWN_CUR_TAXCREDIT_SALES_AMOUNT(dExchAmount);
					
					tempStruct.setsUser_ID(sysUSER_CD);
					tempStruct.setsSysdate(struct.getsSysdate());
					entity.mT_SHIP_SLIP.update(conn, tempStruct);
				} else {
					continue;
				}
				
				// �u�X�e�[�^�X�ԍ��v�@���@5�̏ꍇ�A�ȉ��̏������s�킸�Ɏ����ׂ̏������s���B
				if (Calculate.compare(tempStruct.getl_h_STATUS_CD(), "5") != -1){
					// ����ŏ����擾
					TaxStruct ts =
						TaxControl.getDataTax(
							this.conn,		 
							tempStruct.getl_SALES_DATE(), // ����v���
							struct.getTAX_CD());     // ����ŃR�[�h
					taxRate1 = ts.getTAX_RATE_1();   // �ŗ��P
					taxRate2 = ts.getTAX_RATE_2();   // �ŗ��Q
					taxRate3 = ts.getTAX_RATE_3();   // �ŗ��R
					taxRoundTyp = ts.getTAX_ROUND_TYP(); // �[���敪
					
					// �Ŋz�v�Z����
					TaxAmountStruct tas =
						TaxAmountControl.getData(
								this.conn, 
								tempStruct.getl_h_SALES_AMOUNT(),  	// ������z(HIDDEN)
								struct.getTAX_CD(), 				// ����ŃR�[�h
								taxRate1, 							// �ŗ��P
								taxRate2, 							// �ŗ��Q
								taxRate3, 							// �ŗ��R
								taxRoundTyp);						// �[���敪
					internalTaxAmount = tas.getINTERNAL_TAX_AMOUNT(); // ���őΏۋ��z
					externalTaxAmount = tas.getEXTERNAL_TAX_AMOUNT(); // �O�őΏۋ��z
					taxfreeAmount = tas.getTAXFREE_AMOUNT(); 	 	  // ��ېőΏۋ��z
					taxAmount1 = tas.getTAX_AMOUNT_1(); 		 	  // �Ŋz�P
					taxAmount2 = tas.getTAX_AMOUNT_2();		          // �Ŋz�Q
					taxAmount3 = tas.getTAX_AMOUNT_3(); 		      // �Ŋz�R
					taxAmount = tas.getTAX_AMOUNT();  		          // �ō��݋��z
					taxCreditAmount = tas.getTAX_CREDIT_AMOUNT();     // �Ŕ������z
					
					// �M�݌v�Z����
					ExchAmount exch = new ExchAmount(conn);

					boolean result = exch.doExchAmount(
							taxCreditAmount,
							COMPANY_CD,
							struct.geth_CURRNCY_CD(), 
							struct.geth_EXCH_TYP(), 
							struct.geth_PRICE_ROUND_TYP(), 
							tempStruct.getl_SALES_DATE()); 			// ��ʖ���.�u����v����v

					if (!result) {
						conn.rollback();
						setErrorMessage("KQ00038");
						return;
					}
					dExchAmount = String.valueOf(exch.getD_EXCH_AMOUNT());
					
					// �O�őΏۋ��z
					tempStruct.setsalesEXTERNAL_TAX_SALES_AMOUNT(externalTaxAmount);
					// ���őΏۋ��z
					tempStruct.setsalesINTERNAL_TAX_SALES_AMOUNT(internalTaxAmount);
					// ��ېőΏۋ��z
					tempStruct.setsalesTAXFREE_SALES_AMOUNT(taxfreeAmount);
					// �Ŕ�������z
					tempStruct.setsalesTAX_CREDIT_SALES_AMOUNT(taxCreditAmount);
					if ("1".equals(tempTaxCd)){
						// ����Ŋz�i�O�Łj
						tempStruct.setsalesEXTERNAL_TAX_AMOUNT(Calculate.add(taxAmount1, Calculate.add(taxAmount2, taxAmount3)));
					} else {
						// ����Ŋz�i�O�Łj
						tempStruct.setsalesEXTERNAL_TAX_AMOUNT("0");
					}
					if ("5".equals(tempTaxCd)){
						// ����Ŋz�i���Łj
						tempStruct.setsalesINTERNAL_TAX_AMOUNT(Calculate.add(taxAmount1, Calculate.add(taxAmount2, taxAmount3)));
					} else {
						// ����Ŋz�i���Łj
						tempStruct.setsalesINTERNAL_TAX_AMOUNT("0");
					}
					// �Ŋz�P
					tempStruct.setsalesTAX_AMOUNT_1(taxAmount1);
					// �Ŋz�Q
					tempStruct.setsalesTAX_AMOUNT_2(taxAmount2);
					// �Ŋz�R
					tempStruct.setsalesTAX_AMOUNT_3(taxAmount3);
					// �Ŕ�������z�i�M�݁j
					tempStruct.setsalesOWN_CUR_TAXCREDIT_SALES_AMOUNT(dExchAmount);
					
					tempStruct.setsUser_ID(sysUSER_CD);
					tempStruct.setsSysdate(struct.getsSysdate());
					entity.mT_SALES.update(conn, tempStruct);
				}else {
					continue;
				}
				
				// �C	[���|���g����]�A[���|������]�̍X�V
				// �u�X�e�[�^�X�ԍ��v�@<�@6�̏ꍇ�A�ȉ��̏������s�킸�Ɏ����ׂ̏������s���B
				if (Calculate.compare(tempStruct.getl_h_STATUS_CD(), "6") != -1){
					tempStruct.setCOMPANY_CD(COMPANY_CD);
					tempStruct.setSLIP_CTRL_GRP(struct.geth_SLIP_CTRL_GRP());
					tempStruct.setSLIP_CD(tempStruct.getl_SHIP_ODR_SLIP_CD());
					List trnList = entity.mSelectT_AR_LEDGER_H_TRN.read(conn, tempStruct);
					if (trnList.isEmpty()){
						// ���|�������X�V�������s���B
						updateT_AR_LEDGER(tempStruct);
					} else {
						// ���|���g�����X�V�������s���B
						updateT_AR_LEDGER_TRN(tempStruct);
					}
				}else {
					continue;
				}
				
			}
			conn.commit();
			
			// �Č���
			controlselect();
		} catch (ResourceBusyException e) {
			// ���[���o�b�N
			conn.rollback();
			
			e.printStackTrace();
			setErrorMessage("ZZ01105");
			setReadStatus(ERROR);
		} catch (Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}
                //}}user_implement_dev:<controlupdate>
		logger.exiting("KQ0100010Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0100");
		logger.entering("KQ0100010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		initializeAll();
                //}}user_implement_dev:<controlclear>
		logger.exiting("KQ0100010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0100");
		logger.entering("KQ0100010Control"+":USER="+struct.getsUser_ID(),"controlclose");
			//{{user_implement_dev:<controlclose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlclose>
		logger.exiting("KQ0100010Control"+":USER="+struct.getsUser_ID(),"controlclose");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0100");
		logger.entering("KQ0100010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KQ0100010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0100");
		logger.entering("KQ0100010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try{
			
			// �N���A����
            controlclear();
            
			// =======================================
			// ���Џ��̎擾
			// =======================================
			List listCompanyInfo = entity.mgetCompanyInfo.read(conn,struct);
			if(listCompanyInfo.isEmpty()){
				//���Џ�񂪖���/������
				ExpjMessage emsg = new ExpjMessage("KQ00039");
	            msgStruct.addError(emsg);	// �G���[���b�Z�[�W�Ƃ��ēo�^
	            sysLog.severe(emsg, getsysUSER_CD()); //�G���[���e
	            ExpjException ee = new ExpjException(emsg);
	            throw ee;
			}else{
				COMPANY_CD = ((KQ0100010Struct)listCompanyInfo.get(0)).getCOMPANY_CD();
			}

			// �R���{�{�b�N�X�f�[�^�p��
            ComboBox controller = new ComboBox(conn, sysUSER_CD);
            _INSPC_ACPT_TYP = controller.getData("INSPC_ACPT_TYP");
            _STATUS_TYP = controller.getData("ORD_PROGRESS_STS_01");
            
		} catch (SQLException e){
			e.printStackTrace();

			// �G���[���b�Z�[�W�쐬
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			emsg = new ExpjMessage( "ZZ01006", e.toString());
			sysLog.severe(emsg ,getsysUSER_CD()); //�G�N�Z�v�V�����̏ڍ׏��
			msgStruct.addError(emsg);
			throw ee;
		}catch(ExpjException ee){
			throw ee;
		}catch(Exception e){
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106");
			sysLog.severe(emsg, struct.getsUser_ID());
			ExpjException ee = new ExpjException(e,emsg);
			emsg = new ExpjMessage( "AA99991");
			sysLog.severe(emsg, struct.getsUser_ID());
			emsg = new ExpjMessage( "ZZ01106",e.toString());
			sysLog.severe(emsg, struct.getsUser_ID());
			throw ee;
		}
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KQ0100010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0100");
		logger.entering("KQ0100010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("KQ0100010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("select") ) {
				controlselect();
			} else if( button.equals("update") ) {
				controlupdate();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("close") ) {
				controlclose();
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
//			throw new FoundationException("KQ0100010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KQ0100010-E999","CSV�̏o�͏���"));
			throw new FoundationException("KQ0100010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KQ0100010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("KQ0100010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KQ0100010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("KQ0100010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected KQ0100010Entity entity;
	protected KQ0100010Struct struct;
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

		entity = new KQ0100010Entity();
		struct = new KQ0100010Struct();

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
	 * KQ0100010�N���X�̕W���R���X�g���N�^
	 */
	public KQ0100010Control() throws BusinessProcessException, FoundationException
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
				KQ0100010Struct key = (KQ0100010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("h_UPDATE_FLG") && key.geth_UPDATE_FLG() != null) {
					msgKey.setKeyValue("h_UPDATE_FLG", key.geth_UPDATE_FLG());
				}
				if(msgKeyType.containsKeyColumn("r_SEL_PTN1") && key.getr_SEL_PTN1() != null) {
					msgKey.setKeyValue("r_SEL_PTN1", key.getr_SEL_PTN1());
				}
				if(msgKeyType.containsKeyColumn("r_SEL_PTN2") && key.getr_SEL_PTN2() != null) {
					msgKey.setKeyValue("r_SEL_PTN2", key.getr_SEL_PTN2());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_TYP") && key.getINSPC_ACPT_TYP() != null) {
					msgKey.setKeyValue("INSPC_ACPT_TYP", key.getINSPC_ACPT_TYP());
				}
				if(msgKeyType.containsKeyColumn("SHIP_DLV_DATE") && key.getSHIP_DLV_DATE() != null) {
					msgKey.setKeyValue("SHIP_DLV_DATE", key.getSHIP_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_STATUS") && key.getl_STATUS() != null) {
					msgKey.setKeyValue("l_STATUS", key.getl_STATUS());
				}
				if(msgKeyType.containsKeyColumn("l_h_STATUS_CD") && key.getl_h_STATUS_CD() != null) {
					msgKey.setKeyValue("l_h_STATUS_CD", key.getl_h_STATUS_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_SCDL_DLV_DATE") && key.getl_ODR_SCDL_DLV_DATE() != null) {
					msgKey.setKeyValue("l_ODR_SCDL_DLV_DATE", key.getl_ODR_SCDL_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_SHIP_SCDL_DLV_DATE") && key.getl_SHIP_SCDL_DLV_DATE() != null) {
					msgKey.setKeyValue("l_SHIP_SCDL_DLV_DATE", key.getl_SHIP_SCDL_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_TAX_CD") && key.geth_TAX_CD() != null) {
					msgKey.setKeyValue("h_TAX_CD", key.geth_TAX_CD());
				}
				if(msgKeyType.containsKeyColumn("l_h_SHIP_ODR_AMOUNT") && key.getl_h_SHIP_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("l_h_SHIP_ODR_AMOUNT", key.getl_h_SHIP_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_h_SALES_AMOUNT") && key.getl_h_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("l_h_SALES_AMOUNT", key.getl_h_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_h_AI_AR_IF_FLG") && key.getl_h_AI_AR_IF_FLG() != null) {
					msgKey.setKeyValue("l_h_AI_AR_IF_FLG", key.getl_h_AI_AR_IF_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_h_TAX_DESINATED_SHIP_DATE") && key.getl_h_TAX_DESINATED_SHIP_DATE() != null) {
					msgKey.setKeyValue("l_h_TAX_DESINATED_SHIP_DATE", key.getl_h_TAX_DESINATED_SHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_h_SALES_SLIP_CD") && key.getl_h_SALES_SLIP_CD() != null) {
					msgKey.setKeyValue("l_h_SALES_SLIP_CD", key.getl_h_SALES_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_h_UPDATE_FLG") && key.getl_h_UPDATE_FLG() != null) {
					msgKey.setKeyValue("l_h_UPDATE_FLG", key.getl_h_UPDATE_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_SLIP_CTRL_GRP") && key.geth_SLIP_CTRL_GRP() != null) {
					msgKey.setKeyValue("h_SLIP_CTRL_GRP", key.geth_SLIP_CTRL_GRP());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_NO") && key.geth_ODR_NO() != null) {
					msgKey.setKeyValue("h_ODR_NO", key.geth_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("CUST_ODR_NO") && key.getCUST_ODR_NO() != null) {
					msgKey.setKeyValue("CUST_ODR_NO", key.getCUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_NAME") && key.getCUST_NAME() != null) {
					msgKey.setKeyValue("CUST_NAME", key.getCUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_CD") && key.getCUST_ITEM_CD() != null) {
					msgKey.setKeyValue("CUST_ITEM_CD", key.getCUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_NAME") && key.getCUST_ITEM_NAME() != null) {
					msgKey.setKeyValue("CUST_ITEM_NAME", key.getCUST_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("ODR_ACPT_DATE") && key.getODR_ACPT_DATE() != null) {
					msgKey.setKeyValue("ODR_ACPT_DATE", key.getODR_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE") && key.getDESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("DESINATED_DLV_DATE", key.getDESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("ODR_UNIT_PRICE") && key.getODR_UNIT_PRICE() != null) {
					msgKey.setKeyValue("ODR_UNIT_PRICE", key.getODR_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("ODR_UNIT_CD") && key.getODR_UNIT_CD() != null) {
					msgKey.setKeyValue("ODR_UNIT_CD", key.getODR_UNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("ODR_QTY") && key.getODR_QTY() != null) {
					msgKey.setKeyValue("ODR_QTY", key.getODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD") && key.getTAX_CD() != null) {
					msgKey.setKeyValue("TAX_CD", key.getTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("ODR_AMOUNT") && key.getODR_AMOUNT() != null) {
					msgKey.setKeyValue("ODR_AMOUNT", key.getODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("ODR_AMOUNT_UNIT_CD") && key.getODR_AMOUNT_UNIT_CD() != null) {
					msgKey.setKeyValue("ODR_AMOUNT_UNIT_CD", key.getODR_AMOUNT_UNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("h_INSPC_ACPT_TYP") && key.geth_INSPC_ACPT_TYP() != null) {
					msgKey.setKeyValue("h_INSPC_ACPT_TYP", key.geth_INSPC_ACPT_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_CURRNCY_CD") && key.geth_CURRNCY_CD() != null) {
					msgKey.setKeyValue("h_CURRNCY_CD", key.geth_CURRNCY_CD());
				}
				if(msgKeyType.containsKeyColumn("h_EXCH_TYP") && key.geth_EXCH_TYP() != null) {
					msgKey.setKeyValue("h_EXCH_TYP", key.geth_EXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_PRICE_ROUND_TYP") && key.geth_PRICE_ROUND_TYP() != null) {
					msgKey.setKeyValue("h_PRICE_ROUND_TYP", key.geth_PRICE_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_TRANSPORT_LT") && key.geth_TRANSPORT_LT() != null) {
					msgKey.setKeyValue("h_TRANSPORT_LT", key.geth_TRANSPORT_LT());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT") && key.geth_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_MODIFY_COUNT", key.geth_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("ODR_NO") && key.getODR_NO() != null) {
					msgKey.setKeyValue("ODR_NO", key.getODR_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_ODR_NO") && key.getl_ODR_ODR_NO() != null) {
					msgKey.setKeyValue("l_ODR_ODR_NO", key.getl_ODR_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD") && key.getl_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CD", key.getl_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_PART_DLV_SEQ_NO") && key.getl_PART_DLV_SEQ_NO() != null) {
					msgKey.setKeyValue("l_PART_DLV_SEQ_NO", key.getl_PART_DLV_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("l_DLV_ODR_NO") && key.getl_DLV_ODR_NO() != null) {
					msgKey.setKeyValue("l_DLV_ODR_NO", key.getl_DLV_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("l_SHIP_ODR_SLIP_CD") && key.getl_SHIP_ODR_SLIP_CD() != null) {
					msgKey.setKeyValue("l_SHIP_ODR_SLIP_CD", key.getl_SHIP_ODR_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_DESINATED_SHIP_DATE") && key.getl_DESINATED_SHIP_DATE() != null) {
					msgKey.setKeyValue("l_DESINATED_SHIP_DATE", key.getl_DESINATED_SHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_SCDL_DLV_DATE") && key.getl_SCDL_DLV_DATE() != null) {
					msgKey.setKeyValue("l_SCDL_DLV_DATE", key.getl_SCDL_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_SHIP_ODR_NO") && key.getl_SHIP_ODR_NO() != null) {
					msgKey.setKeyValue("l_SHIP_ODR_NO", key.getl_SHIP_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_AMOUNT") && key.getl_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("l_ODR_AMOUNT", key.getl_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_SHIP_DATE") && key.getl_SHIP_DATE() != null) {
					msgKey.setKeyValue("l_SHIP_DATE", key.getl_SHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_SHIP_ODR_AMOUNT") && key.getl_SHIP_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("l_SHIP_ODR_AMOUNT", key.getl_SHIP_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_SHIP_SEQ_NO") && key.getl_SHIP_SEQ_NO() != null) {
					msgKey.setKeyValue("l_SHIP_SEQ_NO", key.getl_SHIP_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("l_SALES_DATE") && key.getl_SALES_DATE() != null) {
					msgKey.setKeyValue("l_SALES_DATE", key.getl_SALES_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_SALES_AMOUNT") && key.getl_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("l_SALES_AMOUNT", key.getl_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_AI_AR_IF_FLG") && key.getl_AI_AR_IF_FLG() != null) {
					msgKey.setKeyValue("l_AI_AR_IF_FLG", key.getl_AI_AR_IF_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_SALES_SEQ_NO") && key.getl_SALES_SEQ_NO() != null) {
					msgKey.setKeyValue("l_SALES_SEQ_NO", key.getl_SALES_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("l_SALES_SLIP_CD") && key.getl_SALES_SLIP_CD() != null) {
					msgKey.setKeyValue("l_SALES_SLIP_CD", key.getl_SALES_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_SALES_STATUS") && key.getl_SALES_STATUS() != null) {
					msgKey.setKeyValue("l_SALES_STATUS", key.getl_SALES_STATUS());
				}
				if(msgKeyType.containsKeyColumn("l_AR_SLIP_CD") && key.getl_AR_SLIP_CD() != null) {
					msgKey.setKeyValue("l_AR_SLIP_CD", key.getl_AR_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_AR_TRN_SLIP_CD") && key.getl_AR_TRN_SLIP_CD() != null) {
					msgKey.setKeyValue("l_AR_TRN_SLIP_CD", key.getl_AR_TRN_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_h_INSPC_ACPT_DATE") && key.getl_h_INSPC_ACPT_DATE() != null) {
					msgKey.setKeyValue("l_h_INSPC_ACPT_DATE", key.getl_h_INSPC_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_h_AR_INSPC_ACPT_DATE") && key.getl_h_AR_INSPC_ACPT_DATE() != null) {
					msgKey.setKeyValue("l_h_AR_INSPC_ACPT_DATE", key.getl_h_AR_INSPC_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_h_AR_SALES_AMOUNT") && key.getl_h_AR_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("l_h_AR_SALES_AMOUNT", key.getl_h_AR_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_h_AR_TRN_INSPC_ACPT_DATE") && key.getl_h_AR_TRN_INSPC_ACPT_DATE() != null) {
					msgKey.setKeyValue("l_h_AR_TRN_INSPC_ACPT_DATE", key.getl_h_AR_TRN_INSPC_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_h_AR_TRN_SALES_AMOUNT") && key.getl_h_AR_TRN_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("l_h_AR_TRN_SALES_AMOUNT", key.getl_h_AR_TRN_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("AR_STATUS") && key.getAR_STATUS() != null) {
					msgKey.setKeyValue("AR_STATUS", key.getAR_STATUS());
				}
				if(msgKeyType.containsKeyColumn("AR_TRN_STATUS") && key.getAR_TRN_STATUS() != null) {
					msgKey.setKeyValue("AR_TRN_STATUS", key.getAR_TRN_STATUS());
				}
				if(msgKeyType.containsKeyColumn("SLIP_CTRL_GRP") && key.getSLIP_CTRL_GRP() != null) {
					msgKey.setKeyValue("SLIP_CTRL_GRP", key.getSLIP_CTRL_GRP());
				}
				if(msgKeyType.containsKeyColumn("OPTION_ID") && key.getOPTION_ID() != null) {
					msgKey.setKeyValue("OPTION_ID", key.getOPTION_ID());
				}
				if(msgKeyType.containsKeyColumn("CODE") && key.getCODE() != null) {
					msgKey.setKeyValue("CODE", key.getCODE());
				}
				if(msgKeyType.containsKeyColumn("CREATED_BY") && key.getCREATED_BY() != null) {
					msgKey.setKeyValue("CREATED_BY", key.getCREATED_BY());
				}
				if(msgKeyType.containsKeyColumn("CREATED_PRG_NM") && key.getCREATED_PRG_NM() != null) {
					msgKey.setKeyValue("CREATED_PRG_NM", key.getCREATED_PRG_NM());
				}
				if(msgKeyType.containsKeyColumn("slipSHIP_ODR_AMOUNT") && key.getslipSHIP_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("slipSHIP_ODR_AMOUNT", key.getslipSHIP_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("slipTAX_AMOUNT") && key.getslipTAX_AMOUNT() != null) {
					msgKey.setKeyValue("slipTAX_AMOUNT", key.getslipTAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("slipSHIP_ODR_AMOUNT_TAX") && key.getslipSHIP_ODR_AMOUNT_TAX() != null) {
					msgKey.setKeyValue("slipSHIP_ODR_AMOUNT_TAX", key.getslipSHIP_ODR_AMOUNT_TAX());
				}
				if(msgKeyType.containsKeyColumn("slipEXTERNAL_TAX_SALES_AMOUNT") && key.getslipEXTERNAL_TAX_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("slipEXTERNAL_TAX_SALES_AMOUNT", key.getslipEXTERNAL_TAX_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("slipINTERNAL_TAX_SALES_AMOUNT") && key.getslipINTERNAL_TAX_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("slipINTERNAL_TAX_SALES_AMOUNT", key.getslipINTERNAL_TAX_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("slipTAXFREE_SALES_AMOUNT") && key.getslipTAXFREE_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("slipTAXFREE_SALES_AMOUNT", key.getslipTAXFREE_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("slipTAX_CREDIT_SALES_AMOUNT") && key.getslipTAX_CREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("slipTAX_CREDIT_SALES_AMOUNT", key.getslipTAX_CREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("slipEXTERNAL_TAX_AMOUNT") && key.getslipEXTERNAL_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("slipEXTERNAL_TAX_AMOUNT", key.getslipEXTERNAL_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("slipINTERNAL_TAX_AMOUNT") && key.getslipINTERNAL_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("slipINTERNAL_TAX_AMOUNT", key.getslipINTERNAL_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("slipTAX_AMOUNT_1") && key.getslipTAX_AMOUNT_1() != null) {
					msgKey.setKeyValue("slipTAX_AMOUNT_1", key.getslipTAX_AMOUNT_1());
				}
				if(msgKeyType.containsKeyColumn("slipTAX_AMOUNT_2") && key.getslipTAX_AMOUNT_2() != null) {
					msgKey.setKeyValue("slipTAX_AMOUNT_2", key.getslipTAX_AMOUNT_2());
				}
				if(msgKeyType.containsKeyColumn("slipTAX_AMOUNT_3") && key.getslipTAX_AMOUNT_3() != null) {
					msgKey.setKeyValue("slipTAX_AMOUNT_3", key.getslipTAX_AMOUNT_3());
				}
				if(msgKeyType.containsKeyColumn("slipOWN_CUR_TAXCREDIT_SALES_AMOUNT") && key.getslipOWN_CUR_TAXCREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("slipOWN_CUR_TAXCREDIT_SALES_AMOUNT", key.getslipOWN_CUR_TAXCREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("selectSHIP_ODR_NO") && key.getselectSHIP_ODR_NO() != null) {
					msgKey.setKeyValue("selectSHIP_ODR_NO", key.getselectSHIP_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("selectSLIP_CD") && key.getselectSLIP_CD() != null) {
					msgKey.setKeyValue("selectSLIP_CD", key.getselectSLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("selectSALES_TYP") && key.getselectSALES_TYP() != null) {
					msgKey.setKeyValue("selectSALES_TYP", key.getselectSALES_TYP());
				}
				if(msgKeyType.containsKeyColumn("selectCUST_CD") && key.getselectCUST_CD() != null) {
					msgKey.setKeyValue("selectCUST_CD", key.getselectCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("selectITEM_CD") && key.getselectITEM_CD() != null) {
					msgKey.setKeyValue("selectITEM_CD", key.getselectITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("selectITEM_NAME") && key.getselectITEM_NAME() != null) {
					msgKey.setKeyValue("selectITEM_NAME", key.getselectITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("selectCUST_ODR_NO") && key.getselectCUST_ODR_NO() != null) {
					msgKey.setKeyValue("selectCUST_ODR_NO", key.getselectCUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("selectSALES_DATE") && key.getselectSALES_DATE() != null) {
					msgKey.setKeyValue("selectSALES_DATE", key.getselectSALES_DATE());
				}
				if(msgKeyType.containsKeyColumn("selectSALES_DEPT_CD") && key.getselectSALES_DEPT_CD() != null) {
					msgKey.setKeyValue("selectSALES_DEPT_CD", key.getselectSALES_DEPT_CD());
				}
				if(msgKeyType.containsKeyColumn("selectVEND_CD") && key.getselectVEND_CD() != null) {
					msgKey.setKeyValue("selectVEND_CD", key.getselectVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("selectPRD_ODR_PLACE_CD") && key.getselectPRD_ODR_PLACE_CD() != null) {
					msgKey.setKeyValue("selectPRD_ODR_PLACE_CD", key.getselectPRD_ODR_PLACE_CD());
				}
				if(msgKeyType.containsKeyColumn("selectCUST_CHRG_PSN_CD") && key.getselectCUST_CHRG_PSN_CD() != null) {
					msgKey.setKeyValue("selectCUST_CHRG_PSN_CD", key.getselectCUST_CHRG_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("selectODR_ACPT_PSN_CD") && key.getselectODR_ACPT_PSN_CD() != null) {
					msgKey.setKeyValue("selectODR_ACPT_PSN_CD", key.getselectODR_ACPT_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("selectSALES_QTY") && key.getselectSALES_QTY() != null) {
					msgKey.setKeyValue("selectSALES_QTY", key.getselectSALES_QTY());
				}
				if(msgKeyType.containsKeyColumn("selectSALES_UNIT_PRICE") && key.getselectSALES_UNIT_PRICE() != null) {
					msgKey.setKeyValue("selectSALES_UNIT_PRICE", key.getselectSALES_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("selectUNIT_CD") && key.getselectUNIT_CD() != null) {
					msgKey.setKeyValue("selectUNIT_CD", key.getselectUNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("selectSALES_AMOUNT") && key.getselectSALES_AMOUNT() != null) {
					msgKey.setKeyValue("selectSALES_AMOUNT", key.getselectSALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("selectSALES_AMOUNT_EXCH_RATES") && key.getselectSALES_AMOUNT_EXCH_RATES() != null) {
					msgKey.setKeyValue("selectSALES_AMOUNT_EXCH_RATES", key.getselectSALES_AMOUNT_EXCH_RATES());
				}
				if(msgKeyType.containsKeyColumn("selectINSPC_ACPT_DATE") && key.getselectINSPC_ACPT_DATE() != null) {
					msgKey.setKeyValue("selectINSPC_ACPT_DATE", key.getselectINSPC_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("selectINSPC_ACPT_QTY") && key.getselectINSPC_ACPT_QTY() != null) {
					msgKey.setKeyValue("selectINSPC_ACPT_QTY", key.getselectINSPC_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("selectEXTERNAL_TAX_SALES_AMOUNT") && key.getselectEXTERNAL_TAX_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("selectEXTERNAL_TAX_SALES_AMOUNT", key.getselectEXTERNAL_TAX_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("selectINTERNAL_TAX_SALES_AMOUNT") && key.getselectINTERNAL_TAX_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("selectINTERNAL_TAX_SALES_AMOUNT", key.getselectINTERNAL_TAX_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("selectTAXFREE_SALES_AMOUNT") && key.getselectTAXFREE_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("selectTAXFREE_SALES_AMOUNT", key.getselectTAXFREE_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("selectTAX_CREDIT_SALES_AMOUNT") && key.getselectTAX_CREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("selectTAX_CREDIT_SALES_AMOUNT", key.getselectTAX_CREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("selectEXTERNAL_TAX_AMOUNT") && key.getselectEXTERNAL_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("selectEXTERNAL_TAX_AMOUNT", key.getselectEXTERNAL_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("selectINTERNAL_TAX_AMOUNT") && key.getselectINTERNAL_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("selectINTERNAL_TAX_AMOUNT", key.getselectINTERNAL_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("selectTAX_AMOUNT_1") && key.getselectTAX_AMOUNT_1() != null) {
					msgKey.setKeyValue("selectTAX_AMOUNT_1", key.getselectTAX_AMOUNT_1());
				}
				if(msgKeyType.containsKeyColumn("selectTAX_AMOUNT_2") && key.getselectTAX_AMOUNT_2() != null) {
					msgKey.setKeyValue("selectTAX_AMOUNT_2", key.getselectTAX_AMOUNT_2());
				}
				if(msgKeyType.containsKeyColumn("selectTAX_AMOUNT_3") && key.getselectTAX_AMOUNT_3() != null) {
					msgKey.setKeyValue("selectTAX_AMOUNT_3", key.getselectTAX_AMOUNT_3());
				}
				if(msgKeyType.containsKeyColumn("selectOWN_CUR_TAXCREDIT_SALES_AMOUNT") && key.getselectOWN_CUR_TAXCREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("selectOWN_CUR_TAXCREDIT_SALES_AMOUNT", key.getselectOWN_CUR_TAXCREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("selectORG_SLIP_CD") && key.getselectORG_SLIP_CD() != null) {
					msgKey.setKeyValue("selectORG_SLIP_CD", key.getselectORG_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("selectCURRNCY_CD") && key.getselectCURRNCY_CD() != null) {
					msgKey.setKeyValue("selectCURRNCY_CD", key.getselectCURRNCY_CD());
				}
				if(msgKeyType.containsKeyColumn("selectSPCL_PRICE_CO") && key.getselectSPCL_PRICE_CO() != null) {
					msgKey.setKeyValue("selectSPCL_PRICE_CO", key.getselectSPCL_PRICE_CO());
				}
				if(msgKeyType.containsKeyColumn("selectREMARKS") && key.getselectREMARKS() != null) {
					msgKey.setKeyValue("selectREMARKS", key.getselectREMARKS());
				}
				if(msgKeyType.containsKeyColumn("selectINSPC_ACPT_TYP") && key.getselectINSPC_ACPT_TYP() != null) {
					msgKey.setKeyValue("selectINSPC_ACPT_TYP", key.getselectINSPC_ACPT_TYP());
				}
				if(msgKeyType.containsKeyColumn("selectSTATUS") && key.getselectSTATUS() != null) {
					msgKey.setKeyValue("selectSTATUS", key.getselectSTATUS());
				}
				if(msgKeyType.containsKeyColumn("l_h_SALES_SEQ_NO") && key.getl_h_SALES_SEQ_NO() != null) {
					msgKey.setKeyValue("l_h_SALES_SEQ_NO", key.getl_h_SALES_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("salesEXTERNAL_TAX_SALES_AMOUNT") && key.getsalesEXTERNAL_TAX_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("salesEXTERNAL_TAX_SALES_AMOUNT", key.getsalesEXTERNAL_TAX_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("salesINTERNAL_TAX_SALES_AMOUNT") && key.getsalesINTERNAL_TAX_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("salesINTERNAL_TAX_SALES_AMOUNT", key.getsalesINTERNAL_TAX_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("salesTAXFREE_SALES_AMOUNT") && key.getsalesTAXFREE_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("salesTAXFREE_SALES_AMOUNT", key.getsalesTAXFREE_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("salesTAX_CREDIT_SALES_AMOUNT") && key.getsalesTAX_CREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("salesTAX_CREDIT_SALES_AMOUNT", key.getsalesTAX_CREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("salesEXTERNAL_TAX_AMOUNT") && key.getsalesEXTERNAL_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("salesEXTERNAL_TAX_AMOUNT", key.getsalesEXTERNAL_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("salesINTERNAL_TAX_AMOUNT") && key.getsalesINTERNAL_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("salesINTERNAL_TAX_AMOUNT", key.getsalesINTERNAL_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("salesTAX_AMOUNT_1") && key.getsalesTAX_AMOUNT_1() != null) {
					msgKey.setKeyValue("salesTAX_AMOUNT_1", key.getsalesTAX_AMOUNT_1());
				}
				if(msgKeyType.containsKeyColumn("salesTAX_AMOUNT_2") && key.getsalesTAX_AMOUNT_2() != null) {
					msgKey.setKeyValue("salesTAX_AMOUNT_2", key.getsalesTAX_AMOUNT_2());
				}
				if(msgKeyType.containsKeyColumn("salesTAX_AMOUNT_3") && key.getsalesTAX_AMOUNT_3() != null) {
					msgKey.setKeyValue("salesTAX_AMOUNT_3", key.getsalesTAX_AMOUNT_3());
				}
				if(msgKeyType.containsKeyColumn("salesOWN_CUR_TAXCREDIT_SALES_AMOUNT") && key.getsalesOWN_CUR_TAXCREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("salesOWN_CUR_TAXCREDIT_SALES_AMOUNT", key.getsalesOWN_CUR_TAXCREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("SLIP_CD") && key.getSLIP_CD() != null) {
					msgKey.setKeyValue("SLIP_CD", key.getSLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("COUNT") && key.getCOUNT() != null) {
					msgKey.setKeyValue("COUNT", key.getCOUNT());
				}
				if(msgKeyType.containsKeyColumn("ROW_COUNT") && key.getROW_COUNT() != null) {
					msgKey.setKeyValue("ROW_COUNT", key.getROW_COUNT());
				}
				if(msgKeyType.containsKeyColumn("insertSLIP_CD") && key.getinsertSLIP_CD() != null) {
					msgKey.setKeyValue("insertSLIP_CD", key.getinsertSLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_h_SHIP_ODR_NO") && key.getl_h_SHIP_ODR_NO() != null) {
					msgKey.setKeyValue("l_h_SHIP_ODR_NO", key.getl_h_SHIP_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("ORGNAL_SLIP_CD") && key.getORGNAL_SLIP_CD() != null) {
					msgKey.setKeyValue("ORGNAL_SLIP_CD", key.getORGNAL_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_h_SHIP_SEQ_NO") && key.getl_h_SHIP_SEQ_NO() != null) {
					msgKey.setKeyValue("l_h_SHIP_SEQ_NO", key.getl_h_SHIP_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD_1") && key.getTAX_CD_1() != null) {
					msgKey.setKeyValue("TAX_CD_1", key.getTAX_CD_1());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD_2") && key.getTAX_CD_2() != null) {
					msgKey.setKeyValue("TAX_CD_2", key.getTAX_CD_2());
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
				if(msgKeyType.containsKeyColumn("SLIP_DATE") && key.getSLIP_DATE() != null) {
					msgKey.setKeyValue("SLIP_DATE", key.getSLIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("SUM_EXTERNAL_TAX_SALES_AMOUNT") && key.getSUM_EXTERNAL_TAX_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("SUM_EXTERNAL_TAX_SALES_AMOUNT", key.getSUM_EXTERNAL_TAX_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("SUM_INTERNAL_TAX_SALES_AMOUNT") && key.getSUM_INTERNAL_TAX_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("SUM_INTERNAL_TAX_SALES_AMOUNT", key.getSUM_INTERNAL_TAX_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("SUM_TAXFREE_SALES_AMOUNT") && key.getSUM_TAXFREE_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("SUM_TAXFREE_SALES_AMOUNT", key.getSUM_TAXFREE_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("SUM_TAX_CREDIT_SALES_AMOUNT") && key.getSUM_TAX_CREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("SUM_TAX_CREDIT_SALES_AMOUNT", key.getSUM_TAX_CREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("SUM_EXTERNAL_TAX_AMOUNT") && key.getSUM_EXTERNAL_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("SUM_EXTERNAL_TAX_AMOUNT", key.getSUM_EXTERNAL_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("SUM_INTERNAL_TAX_AMOUNT") && key.getSUM_INTERNAL_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("SUM_INTERNAL_TAX_AMOUNT", key.getSUM_INTERNAL_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("SUM_TAX_AMOUNT_1") && key.getSUM_TAX_AMOUNT_1() != null) {
					msgKey.setKeyValue("SUM_TAX_AMOUNT_1", key.getSUM_TAX_AMOUNT_1());
				}
				if(msgKeyType.containsKeyColumn("SUM_TAX_AMOUNT_2") && key.getSUM_TAX_AMOUNT_2() != null) {
					msgKey.setKeyValue("SUM_TAX_AMOUNT_2", key.getSUM_TAX_AMOUNT_2());
				}
				if(msgKeyType.containsKeyColumn("SUM_TAX_AMOUNT_3") && key.getSUM_TAX_AMOUNT_3() != null) {
					msgKey.setKeyValue("SUM_TAX_AMOUNT_3", key.getSUM_TAX_AMOUNT_3());
				}
				if(msgKeyType.containsKeyColumn("SUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT") && key.getSUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("SUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT", key.getSUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("SEL_SLIP_CD") && key.getSEL_SLIP_CD() != null) {
					msgKey.setKeyValue("SEL_SLIP_CD", key.getSEL_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("SEL_SHIP_CD") && key.getSEL_SHIP_CD() != null) {
					msgKey.setKeyValue("SEL_SHIP_CD", key.getSEL_SHIP_CD());
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
					KQ0100010Struct key = new KQ0100010Struct();
					if(msgKeyType.containsKeyColumn("h_UPDATE_FLG")) {
						key.seth_UPDATE_FLG(msgKey.getKeyValue("h_UPDATE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("r_SEL_PTN1")) {
						key.setr_SEL_PTN1(msgKey.getKeyValue("r_SEL_PTN1"));
					}
					if(msgKeyType.containsKeyColumn("r_SEL_PTN2")) {
						key.setr_SEL_PTN2(msgKey.getKeyValue("r_SEL_PTN2"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_TYP")) {
						key.setINSPC_ACPT_TYP(msgKey.getKeyValue("INSPC_ACPT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_DLV_DATE")) {
						key.setSHIP_DLV_DATE(msgKey.getKeyValue("SHIP_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_STATUS")) {
						key.setl_STATUS(msgKey.getKeyValue("l_STATUS"));
					}
					if(msgKeyType.containsKeyColumn("l_h_STATUS_CD")) {
						key.setl_h_STATUS_CD(msgKey.getKeyValue("l_h_STATUS_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_SCDL_DLV_DATE")) {
						key.setl_ODR_SCDL_DLV_DATE(msgKey.getKeyValue("l_ODR_SCDL_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_SHIP_SCDL_DLV_DATE")) {
						key.setl_SHIP_SCDL_DLV_DATE(msgKey.getKeyValue("l_SHIP_SCDL_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_TAX_CD")) {
						key.seth_TAX_CD(msgKey.getKeyValue("h_TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_h_SHIP_ODR_AMOUNT")) {
						key.setl_h_SHIP_ODR_AMOUNT(msgKey.getKeyValue("l_h_SHIP_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_h_SALES_AMOUNT")) {
						key.setl_h_SALES_AMOUNT(msgKey.getKeyValue("l_h_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_h_AI_AR_IF_FLG")) {
						key.setl_h_AI_AR_IF_FLG(msgKey.getKeyValue("l_h_AI_AR_IF_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_h_TAX_DESINATED_SHIP_DATE")) {
						key.setl_h_TAX_DESINATED_SHIP_DATE(msgKey.getKeyValue("l_h_TAX_DESINATED_SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_h_SALES_SLIP_CD")) {
						key.setl_h_SALES_SLIP_CD(msgKey.getKeyValue("l_h_SALES_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_h_UPDATE_FLG")) {
						key.setl_h_UPDATE_FLG(msgKey.getKeyValue("l_h_UPDATE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_SLIP_CTRL_GRP")) {
						key.seth_SLIP_CTRL_GRP(msgKey.getKeyValue("h_SLIP_CTRL_GRP"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_NO")) {
						key.seth_ODR_NO(msgKey.getKeyValue("h_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ODR_NO")) {
						key.setCUST_ODR_NO(msgKey.getKeyValue("CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_NAME")) {
						key.setCUST_NAME(msgKey.getKeyValue("CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_CD")) {
						key.setCUST_ITEM_CD(msgKey.getKeyValue("CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_NAME")) {
						key.setCUST_ITEM_NAME(msgKey.getKeyValue("CUST_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ODR_ACPT_DATE")) {
						key.setODR_ACPT_DATE(msgKey.getKeyValue("ODR_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE")) {
						key.setDESINATED_DLV_DATE(msgKey.getKeyValue("DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_UNIT_PRICE")) {
						key.setODR_UNIT_PRICE(msgKey.getKeyValue("ODR_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_UNIT_CD")) {
						key.setODR_UNIT_CD(msgKey.getKeyValue("ODR_UNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ODR_QTY")) {
						key.setODR_QTY(msgKey.getKeyValue("ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD")) {
						key.setTAX_CD(msgKey.getKeyValue("TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("ODR_AMOUNT")) {
						key.setODR_AMOUNT(msgKey.getKeyValue("ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("ODR_AMOUNT_UNIT_CD")) {
						key.setODR_AMOUNT_UNIT_CD(msgKey.getKeyValue("ODR_AMOUNT_UNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_INSPC_ACPT_TYP")) {
						key.seth_INSPC_ACPT_TYP(msgKey.getKeyValue("h_INSPC_ACPT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_CURRNCY_CD")) {
						key.seth_CURRNCY_CD(msgKey.getKeyValue("h_CURRNCY_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_EXCH_TYP")) {
						key.seth_EXCH_TYP(msgKey.getKeyValue("h_EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_PRICE_ROUND_TYP")) {
						key.seth_PRICE_ROUND_TYP(msgKey.getKeyValue("h_PRICE_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_TRANSPORT_LT")) {
						key.seth_TRANSPORT_LT(msgKey.getKeyValue("h_TRANSPORT_LT"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT")) {
						key.seth_MODIFY_COUNT(msgKey.getKeyValue("h_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("ODR_NO")) {
						key.setODR_NO(msgKey.getKeyValue("ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_ODR_NO")) {
						key.setl_ODR_ODR_NO(msgKey.getKeyValue("l_ODR_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD")) {
						key.setl_JOB_ODR_CD(msgKey.getKeyValue("l_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_PART_DLV_SEQ_NO")) {
						key.setl_PART_DLV_SEQ_NO(msgKey.getKeyValue("l_PART_DLV_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_DLV_ODR_NO")) {
						key.setl_DLV_ODR_NO(msgKey.getKeyValue("l_DLV_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_SHIP_ODR_SLIP_CD")) {
						key.setl_SHIP_ODR_SLIP_CD(msgKey.getKeyValue("l_SHIP_ODR_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_DESINATED_SHIP_DATE")) {
						key.setl_DESINATED_SHIP_DATE(msgKey.getKeyValue("l_DESINATED_SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_SCDL_DLV_DATE")) {
						key.setl_SCDL_DLV_DATE(msgKey.getKeyValue("l_SCDL_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_SHIP_ODR_NO")) {
						key.setl_SHIP_ODR_NO(msgKey.getKeyValue("l_SHIP_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_AMOUNT")) {
						key.setl_ODR_AMOUNT(msgKey.getKeyValue("l_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_SHIP_DATE")) {
						key.setl_SHIP_DATE(msgKey.getKeyValue("l_SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_SHIP_ODR_AMOUNT")) {
						key.setl_SHIP_ODR_AMOUNT(msgKey.getKeyValue("l_SHIP_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_SHIP_SEQ_NO")) {
						key.setl_SHIP_SEQ_NO(msgKey.getKeyValue("l_SHIP_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_SALES_DATE")) {
						key.setl_SALES_DATE(msgKey.getKeyValue("l_SALES_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_SALES_AMOUNT")) {
						key.setl_SALES_AMOUNT(msgKey.getKeyValue("l_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_AI_AR_IF_FLG")) {
						key.setl_AI_AR_IF_FLG(msgKey.getKeyValue("l_AI_AR_IF_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_SALES_SEQ_NO")) {
						key.setl_SALES_SEQ_NO(msgKey.getKeyValue("l_SALES_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_SALES_SLIP_CD")) {
						key.setl_SALES_SLIP_CD(msgKey.getKeyValue("l_SALES_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_SALES_STATUS")) {
						key.setl_SALES_STATUS(msgKey.getKeyValue("l_SALES_STATUS"));
					}
					if(msgKeyType.containsKeyColumn("l_AR_SLIP_CD")) {
						key.setl_AR_SLIP_CD(msgKey.getKeyValue("l_AR_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_AR_TRN_SLIP_CD")) {
						key.setl_AR_TRN_SLIP_CD(msgKey.getKeyValue("l_AR_TRN_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_h_INSPC_ACPT_DATE")) {
						key.setl_h_INSPC_ACPT_DATE(msgKey.getKeyValue("l_h_INSPC_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_h_AR_INSPC_ACPT_DATE")) {
						key.setl_h_AR_INSPC_ACPT_DATE(msgKey.getKeyValue("l_h_AR_INSPC_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_h_AR_SALES_AMOUNT")) {
						key.setl_h_AR_SALES_AMOUNT(msgKey.getKeyValue("l_h_AR_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_h_AR_TRN_INSPC_ACPT_DATE")) {
						key.setl_h_AR_TRN_INSPC_ACPT_DATE(msgKey.getKeyValue("l_h_AR_TRN_INSPC_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_h_AR_TRN_SALES_AMOUNT")) {
						key.setl_h_AR_TRN_SALES_AMOUNT(msgKey.getKeyValue("l_h_AR_TRN_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("AR_STATUS")) {
						key.setAR_STATUS(msgKey.getKeyValue("AR_STATUS"));
					}
					if(msgKeyType.containsKeyColumn("AR_TRN_STATUS")) {
						key.setAR_TRN_STATUS(msgKey.getKeyValue("AR_TRN_STATUS"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_CTRL_GRP")) {
						key.setSLIP_CTRL_GRP(msgKey.getKeyValue("SLIP_CTRL_GRP"));
					}
					if(msgKeyType.containsKeyColumn("OPTION_ID")) {
						key.setOPTION_ID(msgKey.getKeyValue("OPTION_ID"));
					}
					if(msgKeyType.containsKeyColumn("CODE")) {
						key.setCODE(msgKey.getKeyValue("CODE"));
					}
					if(msgKeyType.containsKeyColumn("CREATED_BY")) {
						key.setCREATED_BY(msgKey.getKeyValue("CREATED_BY"));
					}
					if(msgKeyType.containsKeyColumn("CREATED_PRG_NM")) {
						key.setCREATED_PRG_NM(msgKey.getKeyValue("CREATED_PRG_NM"));
					}
					if(msgKeyType.containsKeyColumn("slipSHIP_ODR_AMOUNT")) {
						key.setslipSHIP_ODR_AMOUNT(msgKey.getKeyValue("slipSHIP_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("slipTAX_AMOUNT")) {
						key.setslipTAX_AMOUNT(msgKey.getKeyValue("slipTAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("slipSHIP_ODR_AMOUNT_TAX")) {
						key.setslipSHIP_ODR_AMOUNT_TAX(msgKey.getKeyValue("slipSHIP_ODR_AMOUNT_TAX"));
					}
					if(msgKeyType.containsKeyColumn("slipEXTERNAL_TAX_SALES_AMOUNT")) {
						key.setslipEXTERNAL_TAX_SALES_AMOUNT(msgKey.getKeyValue("slipEXTERNAL_TAX_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("slipINTERNAL_TAX_SALES_AMOUNT")) {
						key.setslipINTERNAL_TAX_SALES_AMOUNT(msgKey.getKeyValue("slipINTERNAL_TAX_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("slipTAXFREE_SALES_AMOUNT")) {
						key.setslipTAXFREE_SALES_AMOUNT(msgKey.getKeyValue("slipTAXFREE_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("slipTAX_CREDIT_SALES_AMOUNT")) {
						key.setslipTAX_CREDIT_SALES_AMOUNT(msgKey.getKeyValue("slipTAX_CREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("slipEXTERNAL_TAX_AMOUNT")) {
						key.setslipEXTERNAL_TAX_AMOUNT(msgKey.getKeyValue("slipEXTERNAL_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("slipINTERNAL_TAX_AMOUNT")) {
						key.setslipINTERNAL_TAX_AMOUNT(msgKey.getKeyValue("slipINTERNAL_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("slipTAX_AMOUNT_1")) {
						key.setslipTAX_AMOUNT_1(msgKey.getKeyValue("slipTAX_AMOUNT_1"));
					}
					if(msgKeyType.containsKeyColumn("slipTAX_AMOUNT_2")) {
						key.setslipTAX_AMOUNT_2(msgKey.getKeyValue("slipTAX_AMOUNT_2"));
					}
					if(msgKeyType.containsKeyColumn("slipTAX_AMOUNT_3")) {
						key.setslipTAX_AMOUNT_3(msgKey.getKeyValue("slipTAX_AMOUNT_3"));
					}
					if(msgKeyType.containsKeyColumn("slipOWN_CUR_TAXCREDIT_SALES_AMOUNT")) {
						key.setslipOWN_CUR_TAXCREDIT_SALES_AMOUNT(msgKey.getKeyValue("slipOWN_CUR_TAXCREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("selectSHIP_ODR_NO")) {
						key.setselectSHIP_ODR_NO(msgKey.getKeyValue("selectSHIP_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("selectSLIP_CD")) {
						key.setselectSLIP_CD(msgKey.getKeyValue("selectSLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("selectSALES_TYP")) {
						key.setselectSALES_TYP(msgKey.getKeyValue("selectSALES_TYP"));
					}
					if(msgKeyType.containsKeyColumn("selectCUST_CD")) {
						key.setselectCUST_CD(msgKey.getKeyValue("selectCUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("selectITEM_CD")) {
						key.setselectITEM_CD(msgKey.getKeyValue("selectITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("selectITEM_NAME")) {
						key.setselectITEM_NAME(msgKey.getKeyValue("selectITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("selectCUST_ODR_NO")) {
						key.setselectCUST_ODR_NO(msgKey.getKeyValue("selectCUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("selectSALES_DATE")) {
						key.setselectSALES_DATE(msgKey.getKeyValue("selectSALES_DATE"));
					}
					if(msgKeyType.containsKeyColumn("selectSALES_DEPT_CD")) {
						key.setselectSALES_DEPT_CD(msgKey.getKeyValue("selectSALES_DEPT_CD"));
					}
					if(msgKeyType.containsKeyColumn("selectVEND_CD")) {
						key.setselectVEND_CD(msgKey.getKeyValue("selectVEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("selectPRD_ODR_PLACE_CD")) {
						key.setselectPRD_ODR_PLACE_CD(msgKey.getKeyValue("selectPRD_ODR_PLACE_CD"));
					}
					if(msgKeyType.containsKeyColumn("selectCUST_CHRG_PSN_CD")) {
						key.setselectCUST_CHRG_PSN_CD(msgKey.getKeyValue("selectCUST_CHRG_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("selectODR_ACPT_PSN_CD")) {
						key.setselectODR_ACPT_PSN_CD(msgKey.getKeyValue("selectODR_ACPT_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("selectSALES_QTY")) {
						key.setselectSALES_QTY(msgKey.getKeyValue("selectSALES_QTY"));
					}
					if(msgKeyType.containsKeyColumn("selectSALES_UNIT_PRICE")) {
						key.setselectSALES_UNIT_PRICE(msgKey.getKeyValue("selectSALES_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("selectUNIT_CD")) {
						key.setselectUNIT_CD(msgKey.getKeyValue("selectUNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("selectSALES_AMOUNT")) {
						key.setselectSALES_AMOUNT(msgKey.getKeyValue("selectSALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("selectSALES_AMOUNT_EXCH_RATES")) {
						key.setselectSALES_AMOUNT_EXCH_RATES(msgKey.getKeyValue("selectSALES_AMOUNT_EXCH_RATES"));
					}
					if(msgKeyType.containsKeyColumn("selectINSPC_ACPT_DATE")) {
						key.setselectINSPC_ACPT_DATE(msgKey.getKeyValue("selectINSPC_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("selectINSPC_ACPT_QTY")) {
						key.setselectINSPC_ACPT_QTY(msgKey.getKeyValue("selectINSPC_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("selectEXTERNAL_TAX_SALES_AMOUNT")) {
						key.setselectEXTERNAL_TAX_SALES_AMOUNT(msgKey.getKeyValue("selectEXTERNAL_TAX_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("selectINTERNAL_TAX_SALES_AMOUNT")) {
						key.setselectINTERNAL_TAX_SALES_AMOUNT(msgKey.getKeyValue("selectINTERNAL_TAX_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("selectTAXFREE_SALES_AMOUNT")) {
						key.setselectTAXFREE_SALES_AMOUNT(msgKey.getKeyValue("selectTAXFREE_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("selectTAX_CREDIT_SALES_AMOUNT")) {
						key.setselectTAX_CREDIT_SALES_AMOUNT(msgKey.getKeyValue("selectTAX_CREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("selectEXTERNAL_TAX_AMOUNT")) {
						key.setselectEXTERNAL_TAX_AMOUNT(msgKey.getKeyValue("selectEXTERNAL_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("selectINTERNAL_TAX_AMOUNT")) {
						key.setselectINTERNAL_TAX_AMOUNT(msgKey.getKeyValue("selectINTERNAL_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("selectTAX_AMOUNT_1")) {
						key.setselectTAX_AMOUNT_1(msgKey.getKeyValue("selectTAX_AMOUNT_1"));
					}
					if(msgKeyType.containsKeyColumn("selectTAX_AMOUNT_2")) {
						key.setselectTAX_AMOUNT_2(msgKey.getKeyValue("selectTAX_AMOUNT_2"));
					}
					if(msgKeyType.containsKeyColumn("selectTAX_AMOUNT_3")) {
						key.setselectTAX_AMOUNT_3(msgKey.getKeyValue("selectTAX_AMOUNT_3"));
					}
					if(msgKeyType.containsKeyColumn("selectOWN_CUR_TAXCREDIT_SALES_AMOUNT")) {
						key.setselectOWN_CUR_TAXCREDIT_SALES_AMOUNT(msgKey.getKeyValue("selectOWN_CUR_TAXCREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("selectORG_SLIP_CD")) {
						key.setselectORG_SLIP_CD(msgKey.getKeyValue("selectORG_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("selectCURRNCY_CD")) {
						key.setselectCURRNCY_CD(msgKey.getKeyValue("selectCURRNCY_CD"));
					}
					if(msgKeyType.containsKeyColumn("selectSPCL_PRICE_CO")) {
						key.setselectSPCL_PRICE_CO(msgKey.getKeyValue("selectSPCL_PRICE_CO"));
					}
					if(msgKeyType.containsKeyColumn("selectREMARKS")) {
						key.setselectREMARKS(msgKey.getKeyValue("selectREMARKS"));
					}
					if(msgKeyType.containsKeyColumn("selectINSPC_ACPT_TYP")) {
						key.setselectINSPC_ACPT_TYP(msgKey.getKeyValue("selectINSPC_ACPT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("selectSTATUS")) {
						key.setselectSTATUS(msgKey.getKeyValue("selectSTATUS"));
					}
					if(msgKeyType.containsKeyColumn("l_h_SALES_SEQ_NO")) {
						key.setl_h_SALES_SEQ_NO(msgKey.getKeyValue("l_h_SALES_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("salesEXTERNAL_TAX_SALES_AMOUNT")) {
						key.setsalesEXTERNAL_TAX_SALES_AMOUNT(msgKey.getKeyValue("salesEXTERNAL_TAX_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("salesINTERNAL_TAX_SALES_AMOUNT")) {
						key.setsalesINTERNAL_TAX_SALES_AMOUNT(msgKey.getKeyValue("salesINTERNAL_TAX_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("salesTAXFREE_SALES_AMOUNT")) {
						key.setsalesTAXFREE_SALES_AMOUNT(msgKey.getKeyValue("salesTAXFREE_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("salesTAX_CREDIT_SALES_AMOUNT")) {
						key.setsalesTAX_CREDIT_SALES_AMOUNT(msgKey.getKeyValue("salesTAX_CREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("salesEXTERNAL_TAX_AMOUNT")) {
						key.setsalesEXTERNAL_TAX_AMOUNT(msgKey.getKeyValue("salesEXTERNAL_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("salesINTERNAL_TAX_AMOUNT")) {
						key.setsalesINTERNAL_TAX_AMOUNT(msgKey.getKeyValue("salesINTERNAL_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("salesTAX_AMOUNT_1")) {
						key.setsalesTAX_AMOUNT_1(msgKey.getKeyValue("salesTAX_AMOUNT_1"));
					}
					if(msgKeyType.containsKeyColumn("salesTAX_AMOUNT_2")) {
						key.setsalesTAX_AMOUNT_2(msgKey.getKeyValue("salesTAX_AMOUNT_2"));
					}
					if(msgKeyType.containsKeyColumn("salesTAX_AMOUNT_3")) {
						key.setsalesTAX_AMOUNT_3(msgKey.getKeyValue("salesTAX_AMOUNT_3"));
					}
					if(msgKeyType.containsKeyColumn("salesOWN_CUR_TAXCREDIT_SALES_AMOUNT")) {
						key.setsalesOWN_CUR_TAXCREDIT_SALES_AMOUNT(msgKey.getKeyValue("salesOWN_CUR_TAXCREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_CD")) {
						key.setSLIP_CD(msgKey.getKeyValue("SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("COUNT")) {
						key.setCOUNT(msgKey.getKeyValue("COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ROW_COUNT")) {
						key.setROW_COUNT(msgKey.getKeyValue("ROW_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("insertSLIP_CD")) {
						key.setinsertSLIP_CD(msgKey.getKeyValue("insertSLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_h_SHIP_ODR_NO")) {
						key.setl_h_SHIP_ODR_NO(msgKey.getKeyValue("l_h_SHIP_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("ORGNAL_SLIP_CD")) {
						key.setORGNAL_SLIP_CD(msgKey.getKeyValue("ORGNAL_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_h_SHIP_SEQ_NO")) {
						key.setl_h_SHIP_SEQ_NO(msgKey.getKeyValue("l_h_SHIP_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD_1")) {
						key.setTAX_CD_1(msgKey.getKeyValue("TAX_CD_1"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD_2")) {
						key.setTAX_CD_2(msgKey.getKeyValue("TAX_CD_2"));
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
					if(msgKeyType.containsKeyColumn("SLIP_DATE")) {
						key.setSLIP_DATE(msgKey.getKeyValue("SLIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SUM_EXTERNAL_TAX_SALES_AMOUNT")) {
						key.setSUM_EXTERNAL_TAX_SALES_AMOUNT(msgKey.getKeyValue("SUM_EXTERNAL_TAX_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("SUM_INTERNAL_TAX_SALES_AMOUNT")) {
						key.setSUM_INTERNAL_TAX_SALES_AMOUNT(msgKey.getKeyValue("SUM_INTERNAL_TAX_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("SUM_TAXFREE_SALES_AMOUNT")) {
						key.setSUM_TAXFREE_SALES_AMOUNT(msgKey.getKeyValue("SUM_TAXFREE_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("SUM_TAX_CREDIT_SALES_AMOUNT")) {
						key.setSUM_TAX_CREDIT_SALES_AMOUNT(msgKey.getKeyValue("SUM_TAX_CREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("SUM_EXTERNAL_TAX_AMOUNT")) {
						key.setSUM_EXTERNAL_TAX_AMOUNT(msgKey.getKeyValue("SUM_EXTERNAL_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("SUM_INTERNAL_TAX_AMOUNT")) {
						key.setSUM_INTERNAL_TAX_AMOUNT(msgKey.getKeyValue("SUM_INTERNAL_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("SUM_TAX_AMOUNT_1")) {
						key.setSUM_TAX_AMOUNT_1(msgKey.getKeyValue("SUM_TAX_AMOUNT_1"));
					}
					if(msgKeyType.containsKeyColumn("SUM_TAX_AMOUNT_2")) {
						key.setSUM_TAX_AMOUNT_2(msgKey.getKeyValue("SUM_TAX_AMOUNT_2"));
					}
					if(msgKeyType.containsKeyColumn("SUM_TAX_AMOUNT_3")) {
						key.setSUM_TAX_AMOUNT_3(msgKey.getKeyValue("SUM_TAX_AMOUNT_3"));
					}
					if(msgKeyType.containsKeyColumn("SUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT")) {
						key.setSUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT(msgKey.getKeyValue("SUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("SEL_SLIP_CD")) {
						key.setSEL_SLIP_CD(msgKey.getKeyValue("SEL_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("SEL_SHIP_CD")) {
						key.setSEL_SHIP_CD(msgKey.getKeyValue("SEL_SHIP_CD"));
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
