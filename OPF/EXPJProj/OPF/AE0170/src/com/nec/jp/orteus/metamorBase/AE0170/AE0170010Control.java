/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0170/src/com/nec/jp/orteus/metamorBase/AE0170/AE0170010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0170;

import com.nec.jp.orteus.metamorBase.AE0170.*;
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
import java.math.BigDecimal;
import java.lang.StringBuffer;
import com.nec.jp.orteus.expj.arap.AccTermDate;
import com.nec.jp.orteus.expj.arap.ArApNumbering;
import com.nec.jp.orteus.metamorBase.common01.util.DateConverter;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateControl;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateStruct;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AE0170010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.3 $ $Date: 2014/02/26 01:26:47 $
 *
 */
//}}user_implement_code_header

public class AE0170010Control
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
	public AE0170010Struct getListvalue(int x) { return (AE0170010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AE0170010Struct getStruct() { return this.struct; }	// Struct�̒l��Ԃ��܂��B
	public AE0170010Struct createStruct() { return new AE0170010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AE0170010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	
	protected List listAcptRslt = null;								// ���ʃ��X�g�̃C���X�^���X(������уf�[�^)
	
	/** Explanner/J*/
	private static final String EXPLANNER_J = "J*";
	
	/** Explanner/Ja*/
	private static final String EXPLANNER_JA = "JA*";
	
	/** Explanner/Jf*/
	private static final String EXPLANNER_JF = "JF*";
	
	/** Explanner/JaSCM*/
	private static final String EXPLANNER_JASCM = "SCM*";
	
	/** ���|�Ǘ��V�X�e��*/
	private static final String AP_SYSTEM = "C*";
	
	//�\���s�������l(SYS_SCREEN_PARM)�̎擾
	private int _maxLine = 0;
	
	/**
     * �G���[���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
     * @param code ���b�Z�[�W�R�[�h
     * @param isThrowException �ُ�X���[�t���O
	 * @throws ExpjException 
     */
    private void setErrorMessage(String code, boolean isThrowException) throws ExpjException {
    	ExpjMessage emsg = new ExpjMessage(code);
    	msgStruct.addError(emsg);
    	if (isThrowException) {
    		throw new ExpjException(code); // �G�N�Z�v�V�����𐶐�
    	}
    	sysLog.warning(emsg, sysUSER_CD);
    }
	
	/**
     * �G���[���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
     * @param code ���b�Z�[�W�R�[�h
     * @param param ���b�Z�[�W�p�����[�^
     */
    private void setErrorMessage(String code, String param) {
    	ExpjMessage emsg = new ExpjMessage(code, param);
    	msgStruct.addError(emsg);
    	sysLog.warning(emsg, sysUSER_CD);
    }
	
	/**
     * ��񃁃b�Z�[�W�ݒ�
     * @param ���b�Z�[�W�ԍ�
     * @param �o�̓��b�Z�[�W
     */
    private void setInfoMessage(String code)
    {
     ExpjMessage emsg = new ExpjMessage(code);
     msgStruct.addInfo(emsg);
     sysLog.config(emsg, getsysUSER_CD()); 
    }
	
	/**
	 * Exception���b�Z�[�W�ݒ�
	 * @param �L�[����
	 */
	private void setExceptionMsg(Exception e, String strMsgCd) throws ExpjException
	{
		// �G���[���b�Z�[�W�쐬
		ExpjMessage emsg = new ExpjMessage(strMsgCd);
		sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
		ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
		throw ee;
	}
    
    /**
	 * �敪���擾
	 * 
	 * @param comboStruct
	 *            �敪��񃊃X�g
	 * @param strTyp
	 *            �敪�R�[�h
	 * @return �敪���́B�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�
	 */
	private String getComboTypeName(ComboStruct comboStruct, String strTyp) {
		String strTypName = strTyp;
		for (int i = 0; i < comboStruct.getValList().size(); i++) {
			if (((String) (comboStruct.getValList().get(i))).equals(strTyp)) {
				strTypName = (String) (comboStruct.getExplanList().get(i));
				break;
			}
		}
		return strTypName;
	}
    
    /**
	 * �[���������s���B
	 * 
	 * @param strAmount
	 *            �[�������O�̒l
	 * @param strDecimalFlg
	 *            ��������
	 * @param strRoundTyp
	 *            �[���敪
	 * @return �[��������̒l
	 */
	private String getRound(String strAmount, String strDecimalFlg, String strRoundTyp) {
		strAmount = convertNull(strAmount);
		BigDecimal val1 = new BigDecimal(strAmount);

		// �l�̌ܓ�
		if ("1".equals(strRoundTyp)) {
			val1 = val1.setScale(Integer.parseInt(strDecimalFlg), BigDecimal.ROUND_HALF_UP);
		}
		// �؂�グ
		else if ("2".equals(strRoundTyp)) {
			val1 = val1.setScale(Integer.parseInt(strDecimalFlg), BigDecimal.ROUND_UP);
		}
		// �؂�̂�
		else {
			val1 = val1.setScale(Integer.parseInt(strDecimalFlg), BigDecimal.ROUND_DOWN);
		}
		return val1.toString();
	}
	
	/**
	 * �בփ��[�g�擾����
	 * 
	 * @param curCd
	 *            �ʉ݃R�[�h
	 * @param exchTyp
	 *            �ב֎��
	 * @param stdDate
	 *            ���
	 * @return String �בփ��[�g
	 * @throws ExpjException 
	 */
	private String getExchRate(String curCd, String exchTyp, String stdDate) throws ExpjException {
		String exchRate = null; // �בփ��[�g
		try {
			
			if (stdDate != null && stdDate.length() > 10) {
				stdDate = stdDate.substring(0, 10);
			}

			// �בփ��[�g�擾
			ExchRateStruct ers = null;

			// Explanner/JaScm�̏ꍇ
			if (EXPLANNER_JASCM.equals(struct.getOPTION_ID())) {
				Class clazz = Class.forName("com.nec.jp.orteus.metamorBase.common04.amount.ExchRateControlSCM");
				Method method = clazz.getMethod("getData", new Class[]{IDbConnection.class,
						String.class,
						String.class,
						String.class,
						String.class,
						String.class});
				Object objErs = method.invoke(null, new Object[]{conn, // DB�R�l�N�V����
						struct.getCOMPANY_CD(), // ��ЃR�[�h
						curCd, // �ʉ݃R�[�h
						exchTyp, // �ב֎��
						null, // �ב֗\��R�[�h(���g�p)
						stdDate}); // ���
				if (objErs != null) {
					ers = (ExchRateStruct) objErs;
				}
			} else {
				ers = ExchRateControl.getData(conn, // DB�R�l�N�V����
						struct.getCOMPANY_CD(), // ��ЃR�[�h
						curCd, // �ʉ݃R�[�h
						exchTyp, // �ב֎��
						null, // �ב֗\��R�[�h(���g�p)
						stdDate); // ���
			}

			if (ers != null) {
				exchRate = ers.getEXCH_RATE();
			}
			
			if (exchRate == null || "".equals(exchRate)) {
				setErrorMessage("AE34059", true);
			}


		} catch (Exception e) {
			setErrorMessage("AE34059", true);
		}
		
		return exchRate;
	}
    
    /**
	 * ����Ōv�Z���s���B
	 * 
	 * @param strAmount
	 *            �Ōv�Z�O�̒l
	 * @param strTaxRate
	 *            ����ŗ�
	 * @param strDecimalFlg
	 *            ��������
	 * @param strRoundTyp
	 *            �[���敪
	 * @return ����Ōv�Z��̒l
	 */
	private String calculateTax(String strAmount, String strTaxRate, String strDecimalFlg, String strRoundTyp) {
		strAmount = convertNull(strAmount);
		strTaxRate = convertNull(strTaxRate);
		String strTaxAmount = Calculate.multiply(strAmount, strTaxRate);
		strTaxAmount = Calculate.multiply(strTaxAmount, "0.01");
		return getRound(strTaxAmount, strDecimalFlg, strRoundTyp);
	}
	//Add Start 20140207 liang-l
	/**
	 * ����Ōv�Z(����)���s���B
	 * 
	 * @param strAmount
	 *            �Ōv�Z�O�̒l
	 * @param strTaxRate
	 *            ����ŗ�
	 * @param strDecimalFlg
	 *            ��������
	 * @param strRoundTyp
	 *            �[���敪
	 * @return ����Ōv�Z��̒l
	 */
	private String calculateTaxIn(String strAmount, String strTaxRate, String strDecimalFlg, String strRoundTyp) {
		strAmount = convertNull(strAmount);
		strTaxRate = convertNull(strTaxRate);
		String strTaxAmount = Calculate.multiply(strAmount, strTaxRate);
		strTaxAmount = String.valueOf(Double.parseDouble(strTaxAmount) / (Double.parseDouble("100")+Double.parseDouble(strTaxRate)));
		return getRound(strTaxAmount, strDecimalFlg, strRoundTyp);
	}
	//Add End   20140207 liang-l
    /**
     * �`�[�ԍ��̍̔�
     * @param struct �����f�[�^��ێ����Ă���A�擾�����f�[�^���Z�b�g����
     * @return String�F�擾�����`�[�ԍ�
     * @throws EXPJException
     */
    public String getNewSlipCd(String strSlipTyp, String strSysDateTime) throws ExpjException
    {
        String strSlipCd = null;
        try{
        	if (strSysDateTime.length() > 10) {
        		strSysDateTime = strSysDateTime.substring(0, 10);
        	}
        	
            ArApNumbering arapnumbering_common = new ArApNumbering( conn, this.getsysUSER_CD() ,
            		"AE0170010", this.getsysPLANT_CD(), struct.getCOMPANY_CD(), "1", strSlipTyp, strSysDateTime);

            strSlipCd = arapnumbering_common.getSlipCd();

            if(strSlipCd == null){
                setErrorMessage("BZ00180", true);
            }

        } catch (Exception e) {
            setErrorMessage("BZ00180", true);
        }
    
        return strSlipCd;
    }
	
	/**
	 * DB�̃V�X�e�������Ǎ�����
	 * 
	 * @return DB�̃V�X�e������:���� / null:���s
	 * @throws SQLException 
	 */
	public String readSystemDateTime() throws SQLException {
		String strDateTime = null;
		PreparedStatement stmt = null;
		ResultSet rset = null;
		String strSql ="select "
				+ "  to_char(sysdate, 'YYYY/MM/DD HH24:MI:SS') " + "from "
				+ "  dual ";
		try {
			stmt = (conn.getConn()).prepareStatement(strSql);
			rset = stmt.executeQuery();
			if (rset.next() == true) {
				strDateTime = rset.getString(1);
			}
		} finally {
			if (rset != null) {
				try {
					rset.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				rset = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				stmt = null;
			}
		}
		return strDateTime;
	}
	
	/**
	 * �����̓Ǎ��������s���B
	 * 
	 * @param strThisMonth �N��
	 * @return �擾���������
	 * @throws ExpjException 
	 */
	public String getRecordingMonthOrDate(String strThisMonth, boolean isGetDate) throws ExpjException {
		
		String strDateMonth = "";
		if (strThisMonth.length() >= 10) {
			StringBuffer sbMonth = new StringBuffer(strThisMonth.substring(0, 4));
			sbMonth.append(strThisMonth.substring(5, 7));
			strThisMonth = sbMonth.toString();
		}
		
		// //�����ԃ}�X�^�̊J�n�N�����̎擾
		try {
			AccTermDate accTermDate = new AccTermDate(conn, this.getsysUSER_CD(),
					"AE0170010", this.getsysPLANT_CD(), struct.getCOMPANY_CD(), strThisMonth);

			if (isGetDate) {
				DateConverter dc = new DateConverter();
				strDateMonth = dc.date2str(accTermDate.getMonthStartDate());
			} else {
				strDateMonth = String.valueOf(accTermDate.getYearMonth());
			}
			
		} catch (FoundationException e) {
			e.printStackTrace();
			throw new ExpjException("BZ00178");
		}
		
		return strDateMonth;
	}
	
	/**
	 * null�܂��͋󔒕����Ȃ��0�A����ȊO�͂��̂܂܂ɂ��܂��B
	 *
	 * @param String str
	 * @return String �ϊ��㕶����
	 */
	private String convertNull(String str){
		if (str == null || str.equals("")) {
			return "0";
		}
		return str;
	}

	/**
	 * �V����ŃR�[�h�J�n���Ɣ�r
	 *
	 */
	private boolean isNewTax(String strCompareDate, String strStartDate) throws ParseException
	{
		boolean rv = false;

		//�V����ŃR�[�h�J�n��
		GregorianCalendar date1 = new GregorianCalendar();
		//date1.setTime(sdi.parse(strStartDate));
		date1.setTime(Converter.strToDate(strStartDate, "yyyy/MM/dd"));

		//��r��
		GregorianCalendar date2 = new GregorianCalendar();
		date2.setTime(Converter.strToDate(strCompareDate, "yyyy/MM/dd"));

		//�V����ŃR�[�h�J�n�� <= �o�׎w����̏ꍇ�A�V�ŗ�
		if(date1.getTime().compareTo(date2.getTime()) <= 0){
			rv = true;
		}
		return rv;
	}
	
	/**
	 * ���|���c���̍X�V�������s���B
	 *
	 * @return stDebtBalanceD ���|���c������
	 * @throws SQLException 
	 * @throws FoundationException 
	 */
	private void updateT_DEBT_BALANCE(AE0170010Struct stDebtBalanceD) throws FoundationException, SQLException {

		AE0170010Struct stDebtBalance = null;
		AE0170010Struct st = new AE0170010Struct();
		// �擾������ݒ�
		st.setCOMPANY_CD(stDebtBalanceD.getCOMPANY_CD()); // ��ЃR�[�h
		st.setMONTH(stDebtBalanceD.getMONTH()); // �N���x
		st.setACCT_CD(stDebtBalanceD.getACCT_CD()); // �ȖڃR�[�h
		st.setSUB_ACCT_CD(stDebtBalanceD.getSUB_ACCT_CD()); // �⏕�敪�R�[�h
		st.setORG_CD(stDebtBalanceD.getORG_CD()); // ����R�[�h
		st.setCUR_CD(stDebtBalanceD.getCUR_CD()); // �ʉ݃R�[�h
		st.setPAYEE_CD(stDebtBalanceD.getPAYEE_CD()); // �x����R�[�h
		
		// ���|���c���̎擾���s��
		List lstDebtBalance = entity.mT_DEBT_BALANCE.read(conn, st);
		if (lstDebtBalance != null && lstDebtBalance.size() == 1) {
			stDebtBalance = (AE0170010Struct) lstDebtBalance.get(0);
		
			// �X�V���ڂ�ݒ肷��
			stDebtBalance.setsUser_ID(this.getsysUSER_CD()); // ���[�U�R�[�h
			stDebtBalance.setRECORDING_AMOUNT(Calculate.add(
					convertNull(stDebtBalance.getRECORDING_AMOUNT()),
					convertNull(stDebtBalanceD.getGROSS_AMOUNT()))); // �v��z
			stDebtBalance.setNET_AMOUNT(Calculate.add(
					convertNull(stDebtBalance.getNET_AMOUNT()),
					convertNull(stDebtBalanceD.getNET_AMOUNT()))); // �Ŕ����z
			stDebtBalance.setTAX_AMOUNT(Calculate.add(
					convertNull(stDebtBalance.getTAX_AMOUNT()),
					convertNull(stDebtBalanceD.getTAX_AMOUNT()))); // ����Ŋz
			
			if ("71".equals(stDebtBalanceD.getSLIP_TYP())) {
				stDebtBalance.setDEBT_AMOUNT(Calculate.add(
						convertNull(stDebtBalance.getDEBT_AMOUNT()),
						convertNull(stDebtBalanceD.getGROSS_AMOUNT()))); // ���|�v����z
				stDebtBalance.setDEBT_AMOUNT_YEN(Calculate.add(
						convertNull(stDebtBalance.getDEBT_AMOUNT_YEN()),
						convertNull(stDebtBalanceD.getGROSS_AMOUNT_YEN()))); // ���|�v����z�i�M�݊��Z�j
			} else if ("72".equals(stDebtBalanceD.getSLIP_TYP())) {
				stDebtBalance.setSAVING_AMOUNT(Calculate.add(
						convertNull(stDebtBalance.getSAVING_AMOUNT()),
						convertNull(stDebtBalanceD.getGROSS_AMOUNT()))); // �l�����z
				stDebtBalance.setSAVING_AMOUNT_YEN(Calculate.add(
						convertNull(stDebtBalance.getSAVING_AMOUNT_YEN()),
						convertNull(stDebtBalanceD.getGROSS_AMOUNT_YEN()))); // �l�����z�i�M�݊��Z�j
			} else if ("73".equals(stDebtBalanceD.getSLIP_TYP())) {
				stDebtBalance.setREBATE_AMOUNT(Calculate.add(
						convertNull(stDebtBalance.getREBATE_AMOUNT()),
						convertNull(stDebtBalanceD.getGROSS_AMOUNT()))); // ���x�[�g�z
				stDebtBalance.setREBATE_AMOUNT_YEN(Calculate.add(
						convertNull(stDebtBalance.getREBATE_AMOUNT_YEN()),
						convertNull(stDebtBalanceD.getGROSS_AMOUNT_YEN()))); // ���x�[�g�z�i�M�݊��Z�j
			} else if ("74".equals(stDebtBalanceD.getSLIP_TYP())) {
				stDebtBalance.setRETURNED_GOODS_AMOUNT(Calculate.add(
						convertNull(stDebtBalance.getRETURNED_GOODS_AMOUNT()),
						convertNull(stDebtBalanceD.getGROSS_AMOUNT()))); // �ԕi�z
				stDebtBalance.setRETURNED_GOODS_AMOUNT_YEN(Calculate.add(
						convertNull(stDebtBalance.getRETURNED_GOODS_AMOUNT_YEN()),
						convertNull(stDebtBalanceD.getGROSS_AMOUNT_YEN()))); // �ԕi�z�i�M�݊��Z�j
			} else {
				stDebtBalance.setINSPC_ACPT_AMOUNT(Calculate.add(
						convertNull(stDebtBalance.getINSPC_ACPT_AMOUNT()),
						convertNull(stDebtBalanceD.getGROSS_AMOUNT()))); // �������z
				stDebtBalance.setINSPC_ACPT_AMOUNT_YEN(Calculate.add(
						convertNull(stDebtBalance.getINSPC_ACPT_AMOUNT_YEN()),
						convertNull(stDebtBalanceD.getGROSS_AMOUNT_YEN()))); // �������z�i�M�݊��Z�j
			}
			
			stDebtBalance.setRECORDING_AMOUNT_YEN(Calculate.add(
					convertNull(stDebtBalance.getRECORDING_AMOUNT_YEN()),
					convertNull(stDebtBalanceD.getGROSS_AMOUNT_YEN()))); // �v��z�i�M�݊��Z�j
			stDebtBalance.setNET_AMOUNT_YEN(Calculate.add(
					convertNull(stDebtBalance.getNET_AMOUNT_YEN()),
					convertNull(stDebtBalanceD.getNET_AMOUNT_YEN()))); // �Ŕ����z�i�M�݊��Z�j
			stDebtBalance.setTAX_AMOUNT_YEN(Calculate.add(
					convertNull(stDebtBalance.getTAX_AMOUNT_YEN()),
					convertNull(stDebtBalanceD.getTAX_AMOUNT_YEN()))); // ����Ŋz�i�M�݊��Z�j
			
			// ���|���c���̍X�V���s��
			entity.mT_DEBT_BALANCE.update(conn, stDebtBalance);
		}
	}
	
	/**
	 * ���׃f�[�^�X�e�[�^�X�̎擾���s���B
	 *
	 * @param stAcptRslt ���׃f�[�^
	 * @throws SQLException 
	 * @throws FoundationException 
	 */
	private String getStatus(AE0170010Struct stAcptRslt) throws FoundationException, SQLException {
		String strStatus = "";
		
		// [�����c] .�g������ԋ敪�h ���@�u2�F�w���ς݁v�A���� [�����c] .�g��������`�[���s�t���O�h ���@�u0�F�ΏۊO�v
		if ("2".equals(struct.geth_PUCH_ODR_STS_TYP())
				&& "0".equals(struct.geth_ODR_CANCEL_SLIP_ISS_FLG())) {
			// �X�e�[�^�X�i1�F����j
			strStatus = "1";
		}
		/* [�����c] .�g������ԋ敪�h ���@�u9�F��������v�A���� 
		 * [�����c] .�g���������t���O�h ���@�u1�F�����v�A���� 
		 * [�����c] .�g��������������敪�h ���@�u1�F����̂݁v�̏ꍇ
		 *  �܂��� 
		 * [�����c] .�g������ԋ敪�h ���@�u9�F��������v�A���� 
		 * [�����c] .�g���������t���O�h ���@�u0�F���v�A���� 
		 * [�����c] .�g��������������敪�h ���@�u2�F�����Ɍ������s���v�̏ꍇ  */
		else if ("9".equals(struct.geth_PUCH_ODR_STS_TYP())
				&& "1".equals(struct.geth_INSPC_CMPLT_FLG())
				&& "1".equals(struct.geth_ACPT_INSPC_TYP())
				|| "9".equals(struct.geth_PUCH_ODR_STS_TYP())
				&& "0".equals(struct.geth_INSPC_CMPLT_FLG())
				&& "2".equals(struct.geth_ACPT_INSPC_TYP())) {
			// �X�e�[�^�X�i2�F��������j
			strStatus = "2";
		}
		/* [�����c] .�g������ԋ敪�h ���@�u9�F��������v�A���� 
		 * [�����c] .�g���������t���O�h ���@�u1�F�����v�A���� 
		 * [�����c] .�g��������������敪�h ���@�u2�F�����Ɍ������s���v�̏ꍇ  */
		else if ("9".equals(struct.geth_PUCH_ODR_STS_TYP())
				&& "1".equals(struct.geth_INSPC_CMPLT_FLG())
				&& "2".equals(struct.geth_ACPT_INSPC_TYP())) {
			// �X�e�[�^�X�i3�F���������j
			strStatus = "3";
		}
		
		AE0170010Struct st = new AE0170010Struct();
		st.setPUCH_ODR_CD(struct.getPUCH_ODR_CD()); // �����ԍ�
		st.setACPT_NO(stAcptRslt.getACPT_NO()); // �����
		
		// ���|���g�����w�b�_�̃`�F�b�N
		if (entity.mcheck_T_DEBT_LEDGER_H_TRN.check(conn, st)) {
			// �X�e�[�^�X�i4�F���|�v��O�j
			strStatus = "4";
		}
		// ���|���g�����w�b�_�̃`�F�b�N1
		if (entity.mcheck_T_DEBT_LEDGER_H1.check(conn, st)) {
			// �X�e�[�^�X�i5�F���|�v���j
			strStatus = "5";
		}
		// ���|���g�����w�b�_�̃`�F�b�N2
		if (entity.mcheck_T_DEBT_LEDGER_H2.check(conn, st)) {
			// �X�e�[�^�X�i6�F�x�����ߌ�j
			strStatus = "6";
		}
		// ���|���c�����ׂ̃`�F�b�N
		if (entity.mcheck_T_INSPC_ACPT_IF.check(conn, st)) {
			// �X�e�[�^�X�i7�F���|�C���^�t�F�[�X�ρj
			strStatus = "7";
		}
		
		return strStatus;
	}
	// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0170");
		logger.entering("AE0170010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>

		// �Ǎ��O�ɏ�Ԃ�������
        setReadStatus(INITIAL);
        if (list == null) {
        	list = new ArrayList();
        } else {
        	list.clear();
        }
        if (listAcptRslt == null) {
        	listAcptRslt = new ArrayList();
        } else {
        	listAcptRslt.clear();
        }
        
		try {
			struct.seth_UPDATE_FLG("0"); // �X�V�{�^�������ۃt���O(1�F�A0�F�s��)
			boolean isStatus6Exist = false;
			boolean isStatus7Exist = false;
			
			// =======================================
			// �����c�f�[�^�̎擾
			// =======================================
			
			// �����c���X�g
			List lstRlsdPuchOdr = null;
			AE0170010Struct stRlsdPuchOdr = null;
			
			// �����c�̎擾���s��
			lstRlsdPuchOdr = entity.mread_T_RLSD_PUCH_ODR.read(conn, struct);
			// ���o�������O���̏ꍇ
			if (lstRlsdPuchOdr == null || lstRlsdPuchOdr.size() < 1) {
				setErrorMessage("ZZ06001", false);
				StringBuffer sbMsg = new StringBuffer("T_RLSD_PUCH_ODR.PUCH_ODR_CD:");
				sbMsg.append(struct.getPUCH_ODR_CD());
				setErrorMessage("ZZ01006", sbMsg.toString());
				sbMsg = new StringBuffer("T_RLSD_PUCH_ODR.COMPANY_CD:");
				sbMsg.append(struct.getCOMPANY_CD());
				setErrorMessage("ZZ01006", sbMsg.toString());
				return;
			} else {
				stRlsdPuchOdr = (AE0170010Struct) lstRlsdPuchOdr.get(0);
			}

			// =======================================
			// ������т̎擾
			// =======================================
			
			List lstAcptRslt = entity.mread_T_ACPT_RSLT.read(conn, struct);

			// =======================================
			// ��ʍ��ڂ̕ҏW
			// =======================================
			
            // �R���{�{�b�N�X�f�[�^�p��
            ComboBox controller = new ComboBox(conn, sysUSER_CD);
            ComboStruct stUnitCostTyp = controller.getData("UNIT_COST_TYP"); // �P���敪
            ComboStruct stAcptInspcTyp = controller.getData("ACPT_INSPC_TYP"); // ��������敪
            ComboStruct stInspcAcptAppTyp = controller.getData("INSPC_ACPT_APP_TYP"); // �����v��敪
            ComboStruct stStatus = controller.getData("ACPT_RSLT_STS"); // �X�e�[�^�X
            boolean blSysTimeCtrl = entity.mSELECT_TIME_CTRL.check(conn, struct); // �V�X�e���p�����[�^�iTIME_CTRL�j
            
			// �w�b�_��
			struct.setNON_NO_ITEM_FLG(stRlsdPuchOdr.getNON_NO_ITEM_FLG()); // ���i�w��
			struct.setITEM_CD(stRlsdPuchOdr.getITEM_CD()); // �i�ڔԍ�
			struct.setITEM_NAME(stRlsdPuchOdr.getITEM_NAME()); // �i�ږ�
			struct.setVEND_CD(stRlsdPuchOdr.getVEND_CD()); // �����R�[�h
			struct.setVEND_NAME(stRlsdPuchOdr.getVEND_NAME()); // ����於
			if (stRlsdPuchOdr.getPUCH_ODR_DLV_DATE() != null && stRlsdPuchOdr.getPUCH_ODR_DLV_DATE().length() >= 16) {
				struct.setPUCH_ODR_DLV_DATE(stRlsdPuchOdr.getPUCH_ODR_DLV_DATE().substring(0, 10)); // �����[��
				if (blSysTimeCtrl) {
					struct.setPUCH_ODR_DLV_TIME(stRlsdPuchOdr.getPUCH_ODR_DLV_DATE().substring(11, 16)); // �����[���i�����j
				}
			}
			struct.setTAX_CD(stRlsdPuchOdr.getTAX_CD()); // ����ŃR�[�h
			if (stRlsdPuchOdr.getPUCH_ODR_START_DATE() != null && stRlsdPuchOdr.getPUCH_ODR_START_DATE().length() >= 16) {
				struct.setPUCH_ODR_START_DATE(stRlsdPuchOdr.getPUCH_ODR_START_DATE().substring(0, 10)); // �����\���
				if (blSysTimeCtrl) {
					struct.setPUCH_ODR_START_TIME(stRlsdPuchOdr.getPUCH_ODR_START_DATE().substring(11, 16)); // �����\����i�����j
				}
			}
			struct.setPUCH_ODR_QTY(stRlsdPuchOdr.getPUCH_ODR_QTY()); // ������
			struct.setSTOCK_UNIT(stRlsdPuchOdr.getSTOCK_UNIT()); // �P��
			struct.setUNIT_COST_TYP(getComboTypeName(stUnitCostTyp, stRlsdPuchOdr.getUNIT_COST_TYP())); // �P���敪
			struct.setJOB_ODR_CD(stRlsdPuchOdr.getJOB_ODR_CD()); // ����
			struct.setUNIT_COST(stRlsdPuchOdr.getUNIT_COST()); // �P��
			struct.setCUR_UNIT(stRlsdPuchOdr.getCUR_UNIT()); // �ʉݒP��
			struct.setACPT_INSPC_TYP(getComboTypeName(stAcptInspcTyp, stRlsdPuchOdr.getACPT_INSPC_TYP())); // ��������敪
			struct.setPUCH_ODR_AMOUNT(stRlsdPuchOdr.getPUCH_ODR_AMOUNT()); // �������z
			struct.setINSPC_ACPT_APP_TYP(getComboTypeName(stInspcAcptAppTyp, stRlsdPuchOdr.getINSPC_ACPT_APP_TYP())); // �����v��敪
			struct.seth_NET_AMOUNT(stRlsdPuchOdr.getNET_AMOUNT()); // �{�̋��z
			struct.seth_TAX_AMOUNT_1(stRlsdPuchOdr.getTAX_AMOUNT_1()); // �Ŋz1
			struct.seth_TAX_AMOUNT_2(stRlsdPuchOdr.getTAX_AMOUNT_2()); // �Ŋz2
			struct.seth_TAX_AMOUNT_3(stRlsdPuchOdr.getTAX_AMOUNT_3()); // �Ŋz3
			struct.seth_ROUND_TYP(stRlsdPuchOdr.getROUND_TYP()); // �������z�܂�ߋ敪
			struct.seth_PUCH_ODR_STS_TYP(stRlsdPuchOdr.getPUCH_ODR_STS_TYP()); // ������ԋ敪
			struct.seth_PUCH_ODR_INST_SLIP_ISS_FLG(stRlsdPuchOdr.getPUCH_ODR_INST_SLIP_ISS_FLG()); // �����`�[���s�ς݃t���O
			struct.seth_ODR_CANCEL_SLIP_ISS_FLG(stRlsdPuchOdr.getODR_CANCEL_SLIP_ISS_FLG()); // ��������`�[���s�t���O
			struct.seth_INSPC_CMPLT_FLG(stRlsdPuchOdr.getINSPC_CMPLT_FLG()); // ���������t���O
			struct.seth_ACPT_INSPC_TYP(stRlsdPuchOdr.getACPT_INSPC_TYP()); // ��������������敪
			struct.seth_MODIFY_COUNT(stRlsdPuchOdr.getMODIFY_COUNT()); // �X�V��
			struct.seth_EXCH_RATE(stRlsdPuchOdr.getEXCH_RATE()); // �בփ��[�g
			struct.seth_TAX_CD(stRlsdPuchOdr.getTAX_CD()); // ����ŃR�[�h
			struct.seth_DECIMAL_FIG(stRlsdPuchOdr.getDECIMAL_FIG()); // ��������
			struct.seth_PUCH_ODR_CD(struct.getPUCH_ODR_CD()); // �����ԍ�
			
			// ���ו�
			// ������уf�[�^�����݂���ꍇ
			if (lstAcptRslt != null || lstAcptRslt.size() > 0) {
				AE0170010Struct stAcptRslt = null;
				AE0170010Struct stNewAcptRslt = null;
				String strStatus = "";
				for (int i = 0; i < lstAcptRslt.size(); i++) {
					stAcptRslt = (AE0170010Struct) lstAcptRslt.get(i);
					stNewAcptRslt = new AE0170010Struct();
					
					strStatus = getStatus(stAcptRslt);
					stNewAcptRslt.setl_STATUS(getComboTypeName(stStatus, strStatus)); //�X�e�[�^�X
					stNewAcptRslt.setl_ACPT_NO(stAcptRslt.getACPT_NO()); // �����
					stNewAcptRslt.setl_ACPT_QTY(stAcptRslt.getACPT_QTY()); // �����
					stNewAcptRslt.setl_ACPT_DATE(stAcptRslt.getACPT_DATE()); // �����
					stNewAcptRslt.setl_UNIT_COST(stAcptRslt.getUNIT_COST()); // ����P��
					stNewAcptRslt.setl_UNIT_COST_TYP(getComboTypeName(stUnitCostTyp, stAcptRslt.getUNIT_COST_TYP())); // �P���敪
					stNewAcptRslt.setl_PUCH_ODR_AMOUNT(stAcptRslt.getPUCH_ODR_AMOUNT()); // ������z
					stNewAcptRslt.setl_INSPECTED_QTY(stAcptRslt.getINSPECTED_QTY()); // �����ϐ�
					stNewAcptRslt.setl_ACCEPTED_QTY(stAcptRslt.getACCEPTED_QTY()); // ���i��
					stNewAcptRslt.setl_INSPEC_DATE(stAcptRslt.getINSPEC_DATE()); // ������
					stNewAcptRslt.seth_NET_AMOUNT_LIST(stAcptRslt.getNET_AMOUNT()); // �{�̋��z
					stNewAcptRslt.seth_TAX_AMOUNT_1_LIST(stAcptRslt.getTAX_AMOUNT_1()); // �Ŋz1
					stNewAcptRslt.seth_TAX_AMOUNT_2_LIST(stAcptRslt.getTAX_AMOUNT_2()); // �Ŋz2
					stNewAcptRslt.seth_TAX_AMOUNT_3_LIST(stAcptRslt.getTAX_AMOUNT_3()); // �Ŋz3
					stNewAcptRslt.seth_MODIFY_COUNT_LIST(stAcptRslt.getMODIFY_COUNT()); // �X�V��
					stNewAcptRslt.seth_EXCH_RATE_LIST(stAcptRslt.getEXCH_RATE()); // �בփ��[�g
					
					listAcptRslt.add(stNewAcptRslt);
					
					// �X�e�[�^�X���u6�F�x�����ߌ�v�̖��׃f�[�^�͑��݂���ꍇ
					if (!isStatus6Exist && "6".equals(strStatus)) {
						isStatus6Exist = true;
					}
					// �X�e�[�^�X���u7�F���|�C���^�t�F�[�X�ρv�̖��׃f�[�^�͑��݂���ꍇ
					else if (!isStatus7Exist && "7".equals(strStatus)) {
						isStatus7Exist = true;
					}
				}
			}
			
			// =======================================
			// �Ǎ��������׃f�[�^�̃`�F�b�N
			// =======================================

			if (isStatus6Exist || isStatus7Exist) {
				if (isStatus6Exist) {
					setInfoMessage("AE05067"); // �x�����ߍς݂̂��ߏ���ŃR�[�h��ύX�ł��܂���B
					struct.seth_UPDATE_FLG("0");
				}
				if (isStatus7Exist) {
					setInfoMessage("AE05068"); // ���|�C���^�t�F�[�X�ς݂̂��ߏ���ŃR�[�h��ύX�ł��܂���B
					struct.seth_UPDATE_FLG("0");
				}
			} else {
				struct.seth_UPDATE_FLG("1"); // �X�V�{�^�������ۃt���O(1�F�A0�F�s��)
			}

			/*
			 * ���׍s�̕\���������ő�\�������𒴂����ꍇ
			 * �����[�j���O> ZZ01119 �y�\���������K��l({0})�𒴂��Ă��܂��B�ő�\���s���̕ύX���s���ĉ������B�z
			 */
			if(_maxLine != 0 && _maxLine < lstAcptRslt.size())
			{
				setReadStatus(TOO_MANY);
				setErrorMessage("ZZ01119", String.valueOf(_maxLine));
			} else {
				this.setList(listAcptRslt);
				setReadStatus(NORMAL);
			}
			
		} catch(SQLException e) {
			setReadStatus(ERROR);
			e.printStackTrace();
			setExceptionMsg(e, "ZZ01106");
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AE0170010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0170");
		logger.entering("AE0170010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>

		try {
			int nRet = 0;
			AE0170010Struct st = new AE0170010Struct();
		    String strTaxCdTyp = struct.getTAX_CD().substring(struct.getTAX_CD().length() - 1, struct.getTAX_CD().length()); // ����ŃR�[�h�̂R����
			struct.setPUCH_ODR_CD(struct.geth_PUCH_ODR_CD()); // �����ԍ�
			
			// =======================================
			// ����ŏ��̎擾
			// =======================================
		    
			AE0170010Struct stTax = null; // ����ŏ��
			List lstTax = entity.mget_M_TAX.read(conn, struct);
			// ����ŃR�[�h�̑��݃`�F�b�N
			if (lstTax == null || lstTax.size() < 1) {
				StringBuffer sbMsg = new StringBuffer("M_TAX.TAX_CD:");
				sbMsg.append(struct.getTAX_CD());
				setErrorMessage("BB00025", false);
				setErrorMessage("ZZ01006", sbMsg.toString());
				return;
			} else {
				stTax = (AE0170010Struct) lstTax.get(0);
			}
			
			// =======================================
			// �����c�̍X�V
			// =======================================
			
			AE0170010Struct stRlsdPuchOdr = new AE0170010Struct(); // �����c���
			// �X�V������ݒ�
			stRlsdPuchOdr.setPUCH_ODR_CD(struct.getPUCH_ODR_CD()); // �����ԍ�
			// �X�V���e��ݒ�
			if (isNewTax(struct.getPUCH_ODR_DLV_DATE(), stTax.getNEW_TAX_RATE_START_DATE())) {
				stRlsdPuchOdr.setTAX_RATE_1(stTax.getNEW_TAX_RATE_1()); // �ŗ�1
				stRlsdPuchOdr.setTAX_RATE_2(stTax.getNEW_TAX_RATE_2()); // �ŗ�2
				stRlsdPuchOdr.setTAX_RATE_3(stTax.getNEW_TAX_RATE_3()); // �ŗ�3
			} else {
				stRlsdPuchOdr.setTAX_RATE_1(stTax.getOLD_TAX_RATE_1()); // �ŗ�1
				stRlsdPuchOdr.setTAX_RATE_2(stTax.getOLD_TAX_RATE_2()); // �ŗ�2
				stRlsdPuchOdr.setTAX_RATE_3(stTax.getOLD_TAX_RATE_3()); // �ŗ�3
			}
			if ("1".equals(strTaxCdTyp)) {
				stRlsdPuchOdr.setNET_AMOUNT(convertNull(struct.geth_NET_AMOUNT())); // �{�̋��z
				stRlsdPuchOdr.setTAX_AMOUNT_1(
						calculateTax(convertNull(stRlsdPuchOdr.getNET_AMOUNT()),
								stRlsdPuchOdr.getTAX_RATE_1(), struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // �Ŋz1
				stRlsdPuchOdr.setTAX_AMOUNT_2(
						calculateTax(convertNull(stRlsdPuchOdr.getNET_AMOUNT()),
								stRlsdPuchOdr.getTAX_RATE_2(), struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // �Ŋz2
				stRlsdPuchOdr.setTAX_AMOUNT_3(
						calculateTax(convertNull(stRlsdPuchOdr.getNET_AMOUNT()),
								stRlsdPuchOdr.getTAX_RATE_3(), struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // �Ŋz3
				// �{�̋��z�{�Ŋz1�{�Ŋz2�{�Ŋz3
				String strAmountIncludeTax = stRlsdPuchOdr.getNET_AMOUNT();
				strAmountIncludeTax = Calculate.add(strAmountIncludeTax, stRlsdPuchOdr.getTAX_AMOUNT_1());
				strAmountIncludeTax = Calculate.add(strAmountIncludeTax, stRlsdPuchOdr.getTAX_AMOUNT_2());
				strAmountIncludeTax = Calculate.add(strAmountIncludeTax, stRlsdPuchOdr.getTAX_AMOUNT_3());
				stRlsdPuchOdr.setAMOUNT_INCLUDE_TAX(strAmountIncludeTax); // �ō����z
			} else if ("5".equals(strTaxCdTyp)) {
				// �ύX�O�̐Ŕ��z = �{�̋��z �|�Ŋz1 �|�Ŋz2 �|�Ŋz3
				String strOldNetAmound = convertNull(struct.geth_NET_AMOUNT());
				stRlsdPuchOdr.setTAX_AMOUNT_1(
						calculateTaxIn(strOldNetAmound,
								stRlsdPuchOdr.getTAX_RATE_1(), struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // �Ŋz1
				stRlsdPuchOdr.setTAX_AMOUNT_2(
						calculateTaxIn(strOldNetAmound,
								stRlsdPuchOdr.getTAX_RATE_2(), struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // �Ŋz2
				stRlsdPuchOdr.setTAX_AMOUNT_3(
						calculateTaxIn(strOldNetAmound,
								stRlsdPuchOdr.getTAX_RATE_3(), struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // �Ŋz3
				//Mod Start 20140207 liang-l
				// �{�̋��z�{�Ŋz1�{�Ŋz2�{�Ŋz3
				//String strNetAmound = strOldNetAmound;
				//strNetAmound = Calculate.add(strNetAmound, stRlsdPuchOdr.getTAX_AMOUNT_1());
				//strNetAmound = Calculate.add(strNetAmound, stRlsdPuchOdr.getTAX_AMOUNT_2());
				//strNetAmound = Calculate.add(strNetAmound, stRlsdPuchOdr.getTAX_AMOUNT_3());
				//stRlsdPuchOdr.setNET_AMOUNT(getRound(strNetAmound, struct.geth_DECIMAL_FIG(), struct.geth_ROUND_TYP())); // �{�̋��z
				stRlsdPuchOdr.setNET_AMOUNT(struct.geth_NET_AMOUNT()); // �{�̋��z
				//Mod End   20140207 liang-l
				stRlsdPuchOdr.setAMOUNT_INCLUDE_TAX(stRlsdPuchOdr.getNET_AMOUNT()); // �ō����z
			} else {
				stRlsdPuchOdr.setTAX_AMOUNT_1("0"); // �Ŋz1
				stRlsdPuchOdr.setTAX_AMOUNT_2("0"); // �Ŋz2
				stRlsdPuchOdr.setTAX_AMOUNT_3("0"); // �Ŋz3
				stRlsdPuchOdr.setNET_AMOUNT(struct.geth_NET_AMOUNT()); // �{�̋��z
				stRlsdPuchOdr.setAMOUNT_INCLUDE_TAX(stRlsdPuchOdr.getNET_AMOUNT()); // �ō����z
			}
			stRlsdPuchOdr.setHOME_CUR_AMOUNT(getRound(
					Calculate.multiply(stRlsdPuchOdr.getAMOUNT_INCLUDE_TAX(), struct.geth_EXCH_RATE()),
					struct.getHOME_DECIMAL_FIG(), struct.geth_ROUND_TYP())); // �M�݋��z
			stRlsdPuchOdr.setTAX_CD(struct.getTAX_CD()); // ����ŃR�[�h
			stRlsdPuchOdr.setTAX_ROUND_TYP(stTax.getROUND_TYP()); // �Œ[���敪
			stRlsdPuchOdr.setsUser_ID(this.getsysUSER_CD()); // �X�V��

			// �X�V�񐔎擾������ݒ�
			st.setPUCH_ODR_CD(struct.getPUCH_ODR_CD()); // �����ԍ�
			List lstPuchOdrModifyCount = entity.mgetModifyCount_T_RLSD_PUCH_ODR.read(conn, st);
			// �r���`�F�b�N
			if (lstPuchOdrModifyCount == null || lstPuchOdrModifyCount.size() < 1) {
				setErrorMessage("KQ00055", false);
				conn.rollback();
				return;
			} else if (!struct.geth_MODIFY_COUNT().equals(((AE0170010Struct) lstPuchOdrModifyCount.get(0)).getMODIFY_COUNT())) {
				setErrorMessage("KQ00055", false);
				conn.rollback();
				return;
			}
			
			// �����c�̍X�V
			nRet = entity.mupdate_T_RLSD_PUCH_ODR.update(conn, stRlsdPuchOdr);
			
			// =======================================
			// ������т̍X�V
			// =======================================
			
			if (listAcptRslt == null || listAcptRslt.size() < 1) {
				return;
			}

			String strSysDateTime = readSystemDateTime(); // �V�X�e������
			
			AE0170010Struct stAcptRsld = null;
			for (int i = 0; i < listAcptRslt.size(); i++) {
				stAcptRsld = (AE0170010Struct) listAcptRslt.get(i);

				// �X�V������ݒ�
				stAcptRsld.setPUCH_ODR_CD(struct.getPUCH_ODR_CD()); // �����ԍ�
				stAcptRsld.setACPT_NO(stAcptRsld.getl_ACPT_NO()); // �����
				// �X�V���e��ݒ�
				if (isNewTax(stAcptRsld.getl_ACPT_DATE(), stTax.getNEW_TAX_RATE_START_DATE())) {
					stAcptRsld.setTAX_RATE_1(stTax.getNEW_TAX_RATE_1()); // �ŗ�1
					stAcptRsld.setTAX_RATE_2(stTax.getNEW_TAX_RATE_2()); // �ŗ�2
					stAcptRsld.setTAX_RATE_3(stTax.getNEW_TAX_RATE_3()); // �ŗ�3
				} else {
					stAcptRsld.setTAX_RATE_1(stTax.getOLD_TAX_RATE_1()); // �ŗ�1
					stAcptRsld.setTAX_RATE_2(stTax.getOLD_TAX_RATE_2()); // �ŗ�2
					stAcptRsld.setTAX_RATE_3(stTax.getOLD_TAX_RATE_3()); // �ŗ�3
				}
				if ("1".equals(strTaxCdTyp)) {
					stAcptRsld.setNET_AMOUNT(stAcptRsld.geth_NET_AMOUNT_LIST()); // �{�̋��z
					stAcptRsld.setTAX_AMOUNT_1(
							calculateTax(convertNull(stAcptRsld.getNET_AMOUNT()),
									stAcptRsld.getTAX_RATE_1(), struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // �Ŋz1
					stAcptRsld.setTAX_AMOUNT_2(
							calculateTax(convertNull(stAcptRsld.getNET_AMOUNT()),
									stAcptRsld.getTAX_RATE_2(), struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // �Ŋz2
					stAcptRsld.setTAX_AMOUNT_3(
							calculateTax(convertNull(stAcptRsld.getNET_AMOUNT()),
									stAcptRsld.getTAX_RATE_3(), struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // �Ŋz3
					// �{�̋��z�{�Ŋz1�{�Ŋz2�{�Ŋz3
					String strAmountIncludeTax = stAcptRsld.getNET_AMOUNT();
					strAmountIncludeTax = Calculate.add(strAmountIncludeTax, stAcptRsld.getTAX_AMOUNT_1());
					strAmountIncludeTax = Calculate.add(strAmountIncludeTax, stAcptRsld.getTAX_AMOUNT_2());
					strAmountIncludeTax = Calculate.add(strAmountIncludeTax, stAcptRsld.getTAX_AMOUNT_3());
					stAcptRsld.setAMOUNT_INCLUDE_TAX(strAmountIncludeTax); // �ō����z
				} else if ("5".equals(strTaxCdTyp)) {
					// �ύX�O�̐Ŕ��z = �{�̋��z �|�Ŋz1 �|�Ŋz2 �|�Ŋz3
					String strOldNetAmound = convertNull(stAcptRsld.geth_NET_AMOUNT_LIST());
					stAcptRsld.setTAX_AMOUNT_1(
							calculateTaxIn(strOldNetAmound,
									stAcptRsld.getTAX_RATE_1(), struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // �Ŋz1
					stAcptRsld.setTAX_AMOUNT_2(
							calculateTaxIn(strOldNetAmound,
									stAcptRsld.getTAX_RATE_2(), struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // �Ŋz2
					stAcptRsld.setTAX_AMOUNT_3(
							calculateTaxIn(strOldNetAmound,
									stAcptRsld.getTAX_RATE_3(), struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // �Ŋz3
					//Mod Start 20140207 liang-l
					// �{�̋��z�{�Ŋz1�{�Ŋz2�{�Ŋz3
					//String strNetAmound = strOldNetAmound;
					//strNetAmound = Calculate.add(strNetAmound, stAcptRsld.getTAX_AMOUNT_1());
					//strNetAmound = Calculate.add(strNetAmound, stAcptRsld.getTAX_AMOUNT_2());
					//strNetAmound = Calculate.add(strNetAmound, stAcptRsld.getTAX_AMOUNT_3());
					//stAcptRsld.setNET_AMOUNT(getRound(strNetAmound, struct.geth_DECIMAL_FIG(), struct.geth_ROUND_TYP())); // �{�̋��z
					stAcptRsld.setNET_AMOUNT(stAcptRsld.geth_NET_AMOUNT_LIST()); // �{�̋��z
					//Mod End   20140207 liang-l
					stAcptRsld.setAMOUNT_INCLUDE_TAX(stAcptRsld.getNET_AMOUNT()); // �ō����z
				} else {
					stAcptRsld.setNET_AMOUNT(stAcptRsld.geth_NET_AMOUNT_LIST()); // �{�̋��z
					stAcptRsld.setTAX_AMOUNT_1("0"); // �Ŋz1
					stAcptRsld.setTAX_AMOUNT_2("0"); // �Ŋz2
					stAcptRsld.setTAX_AMOUNT_3("0"); // �Ŋz3
					stAcptRsld.setAMOUNT_INCLUDE_TAX(stAcptRsld.getNET_AMOUNT()); // �ō����z
				}
				stAcptRsld.setHOME_CUR_AMOUNT(getRound(
						Calculate.multiply(stAcptRsld.getAMOUNT_INCLUDE_TAX(), stAcptRsld.geth_EXCH_RATE_LIST()),
						struct.getHOME_DECIMAL_FIG(), struct.geth_ROUND_TYP())); // �M�݋��z
				stAcptRsld.setTAX_CD(struct.getTAX_CD()); // ����ŃR�[�h
				stAcptRsld.setTAX_ROUND_TYP(stTax.getROUND_TYP()); // �Œ[���敪
				stAcptRsld.setsUser_ID(this.getsysUSER_CD()); // �X�V��

				// �X�V�񐔎擾������ݒ�
				st.setACPT_NO(stAcptRsld.getl_ACPT_NO()); // �����
				List lstAcptRsldModifyCount = entity.mgetModifyCount_T_ACPT_RSLT.read(conn, st);
				// �r���`�F�b�N
				if (lstAcptRsldModifyCount == null || lstAcptRsldModifyCount.size() < 1) {
					setErrorMessage("KQ00055", false);
					conn.rollback();
					return;
				} else if (!stAcptRsld.geth_MODIFY_COUNT_LIST().equals(((AE0170010Struct) lstAcptRsldModifyCount.get(0)).getMODIFY_COUNT())) {
					setErrorMessage("KQ00055", false);
					conn.rollback();
					return;
				}
				
				// ������т̍X�V
				nRet = entity.mupdate_T_ACPT_RSLT.update(conn, stAcptRsld);
								
				// =======================================
				// �ő�̌��������̎擾
				// =======================================
				String strOldInspcAcptNo = null; // �����ԍ�(��)
				String strRedInspcAcptNo = null; // �����ԍ�(��)
				String strBlackInspcAcptNo = null; // �����ԍ�(��)
				
				AE0170010Struct stPastInspcAcpt = null; // �ő�̌�������
				// �ő�̌����������擾
				List lstMaxPastInspcAcpt = entity.mT_PAST_INSPC_ACPT.read(conn, st);
				if (lstMaxPastInspcAcpt == null || lstMaxPastInspcAcpt.size() < 1) {
					continue;
				} else {
					stPastInspcAcpt = (AE0170010Struct) lstMaxPastInspcAcpt.get(0);
					strOldInspcAcptNo = stPastInspcAcpt.getINSPC_ACPT_NO();
					// [��������].�g�����敪�h�@���@1�i�ԁj�̏ꍇ�A���̃��[�v������
					if ("1".equals(stPastInspcAcpt.getCRCT_TYP())) {
						continue;
					}
				}
				stPastInspcAcpt.setsUser_ID(this.getsysUSER_CD()); // ���[�U�R�[�h
				
				// =======================================
				// ���������n�̓o�^
				// =======================================
				
				// �ԃ��R�[�h��ҏW
				stPastInspcAcpt.setINSPC_ACPT_NO(Calculate.add(convertNull(stPastInspcAcpt.getINSPC_ACPT_NO()), "1")); // �����ԍ�
				stPastInspcAcpt.setCRCT_TYP("1"); // �����敪(1�F��)
				stPastInspcAcpt.setPROCESSING_COST(Calculate.subtract("0", convertNull(stPastInspcAcpt.getPROCESSING_COST()))); // ���H��
				stPastInspcAcpt.setMATERIAL_COST(Calculate.subtract("0", convertNull(stPastInspcAcpt.getMATERIAL_COST()))); // �ޗ���
				stPastInspcAcpt.setOTHER_OVERHEADS(Calculate.subtract("0", convertNull(stPastInspcAcpt.getOTHER_OVERHEADS()))); // ���̑��o��
				stPastInspcAcpt.setACPT_QTY(Calculate.subtract("0", convertNull(stPastInspcAcpt.getACPT_QTY()))); // �����
				stPastInspcAcpt.setINSPC_ACPT_QTY(Calculate.subtract("0", convertNull(stPastInspcAcpt.getINSPC_ACPT_QTY()))); // ������
				stPastInspcAcpt.setSAVING_AMOUNT(Calculate.subtract("0", convertNull(stPastInspcAcpt.getSAVING_AMOUNT()))); // �l�����z
				stPastInspcAcpt.setINSPC_ACPT_AMOUNT(Calculate.subtract("0", convertNull(stPastInspcAcpt.getINSPC_ACPT_AMOUNT()))); // �������z
				
				// ���������̓o�^�i�ԃ��R�[�h�j
				nRet = entity.mT_PAST_INSPC_ACPT.create(conn, stPastInspcAcpt);
				strRedInspcAcptNo = stPastInspcAcpt.getINSPC_ACPT_NO();
				
				// �����R�[�h��ҏW
				stPastInspcAcpt.setINSPC_ACPT_NO(Calculate.add(convertNull(stPastInspcAcpt.getINSPC_ACPT_NO()), "1")); // �����ԍ�
				stPastInspcAcpt.setCRCT_TYP("2"); // �����敪(2�F��)
				stPastInspcAcpt.setCRCT_NO(Calculate.add(convertNull(stPastInspcAcpt.getCRCT_NO()), "1")); // ������
				stPastInspcAcpt.setPROCESSING_COST(Calculate.subtract("0", convertNull(stPastInspcAcpt.getPROCESSING_COST()))); // ���H��
				stPastInspcAcpt.setMATERIAL_COST(Calculate.subtract("0", convertNull(stPastInspcAcpt.getMATERIAL_COST()))); // �ޗ���
				stPastInspcAcpt.setOTHER_OVERHEADS(Calculate.subtract("0", convertNull(stPastInspcAcpt.getOTHER_OVERHEADS()))); // ���̑��o��
				stPastInspcAcpt.setACPT_QTY(Calculate.subtract("0", convertNull(stPastInspcAcpt.getACPT_QTY()))); // �����
				stPastInspcAcpt.setINSPC_ACPT_QTY(Calculate.subtract("0", convertNull(stPastInspcAcpt.getINSPC_ACPT_QTY()))); // ������
				stPastInspcAcpt.setSAVING_AMOUNT(Calculate.subtract("0", convertNull(stPastInspcAcpt.getSAVING_AMOUNT()))); // �l�����z
				stPastInspcAcpt.setINSPC_ACPT_AMOUNT(Calculate.subtract("0", convertNull(stPastInspcAcpt.getINSPC_ACPT_AMOUNT()))); // �������z
				
				// ���������̓o�^�i�����R�[�h�j
				nRet = entity.mT_PAST_INSPC_ACPT.create(conn, stPastInspcAcpt);
				strBlackInspcAcptNo = stPastInspcAcpt.getINSPC_ACPT_NO();
				
				// =======================================
				// �������я��C���^�t�F�[�X�̎擾
				// =======================================

				AE0170010Struct stInspcAcptIf = null; // �������я��C���^�t�F�[�X
				// �擾������ݒ�
				st.setINSPC_ACPT_NO(strOldInspcAcptNo); // �����ԍ�
				// �������я��C���^�t�F�[�X�̎擾
				List lstInspcAcptIf = entity.mT_INSPC_ACPT_IF.read(conn, st);
				if (lstInspcAcptIf != null && lstInspcAcptIf.size() == 1) {
					stInspcAcptIf = (AE0170010Struct) lstInspcAcptIf.get(0);
					stInspcAcptIf.setsUser_ID(this.getsysUSER_CD()); // ���[�U�R�[�h
				
					// =======================================
					// �������я��C���^�t�F�[�X�̓o�^
					// =======================================
	
					// �ԃ��R�[�h��ҏW
					stInspcAcptIf.setINSPC_ACPT_NO(Calculate.add(convertNull(stInspcAcptIf.getINSPC_ACPT_NO()), "1")); // �����ԍ�
					stInspcAcptIf.setCRCT_TYP("1"); // �����敪(1�F��)
					stInspcAcptIf.setPROCESSING_COST(Calculate.subtract("0", convertNull(stInspcAcptIf.getPROCESSING_COST()))); // ���H��
					stInspcAcptIf.setMATERIAL_COST(Calculate.subtract("0", convertNull(stInspcAcptIf.getMATERIAL_COST()))); // �ޗ���
					stInspcAcptIf.setOTHER_OVERHEADS(Calculate.subtract("0", convertNull(stInspcAcptIf.getOTHER_OVERHEADS()))); // ���̑��o��
					stInspcAcptIf.setACPT_QTY(Calculate.subtract("0", convertNull(stInspcAcptIf.getACPT_QTY()))); // �����
					stInspcAcptIf.setINSPC_ACPT_QTY(Calculate.subtract("0", convertNull(stInspcAcptIf.getINSPC_ACPT_QTY()))); // ������
					stInspcAcptIf.setDISC_AMOUNT(Calculate.subtract("0", convertNull(stInspcAcptIf.getDISC_AMOUNT()))); // �l�����z
					stInspcAcptIf.setINSPC_ACPT_AMOUNT(Calculate.subtract("0", convertNull(stInspcAcptIf.getINSPC_ACPT_AMOUNT()))); // �������z

					// �������я��C���^�t�F�[�X�̓o�^�i�ԃ��R�[�h�j
					nRet = entity.mT_INSPC_ACPT_IF.create(conn, stInspcAcptIf);
	
					// �����R�[�h��ҏW
					stInspcAcptIf.setINSPC_ACPT_NO(Calculate.add(convertNull(stInspcAcptIf.getINSPC_ACPT_NO()), "1")); // �����ԍ�
					stInspcAcptIf.setCRCT_TYP("2"); // �����敪(2�F��)
					stInspcAcptIf.setPROCESSING_COST(Calculate.subtract("0", convertNull(stInspcAcptIf.getPROCESSING_COST()))); // ���H��
					stInspcAcptIf.setMATERIAL_COST(Calculate.subtract("0", convertNull(stInspcAcptIf.getMATERIAL_COST()))); // �ޗ���
					stInspcAcptIf.setOTHER_OVERHEADS(Calculate.subtract("0", convertNull(stInspcAcptIf.getOTHER_OVERHEADS()))); // ���̑��o��
					stInspcAcptIf.setACPT_QTY(Calculate.subtract("0", convertNull(stInspcAcptIf.getACPT_QTY()))); // �����
					stInspcAcptIf.setINSPC_ACPT_QTY(Calculate.subtract("0", convertNull(stInspcAcptIf.getINSPC_ACPT_QTY()))); // ������
					stInspcAcptIf.setDISC_AMOUNT(Calculate.subtract("0", convertNull(stInspcAcptIf.getDISC_AMOUNT()))); // �l�����z
					stInspcAcptIf.setINSPC_ACPT_AMOUNT(Calculate.subtract("0", convertNull(stInspcAcptIf.getINSPC_ACPT_AMOUNT()))); // �������z

					// �������я��C���^�t�F�[�X�̓o�^�i�����R�[�h�j
					nRet = entity.mT_INSPC_ACPT_IF.create(conn, stInspcAcptIf);
				}

				// =======================================
				// �u���|�V�X�e�������ς݂�(C*)�v�̔��f
				// =======================================
				
				st.setOPTION_ID(AP_SYSTEM); // �C���X�g�[���I�v�V����
				if (!entity.mcheck_SYS_INSTALL_OPTIONS.check(conn, st)) {
					continue;
				}
				
				String strOwnCurCd = ""; // �M�݃R�[�h
				String strThisMonth = ""; // ���݂̌v��N���x
				String strThisRecordingDate = ""; // ���݂̌v��J�n�N����
				String strMonth = ""; // �N���x
				String strRecordingDate = ""; // �v���
				// [���|�V�X�e���Ǘ�].�g�M�݃R�[�h�h���擾
				List lstSysDebtCtrl = entity.mget_SYS_DEBT_CTRL.read(conn, struct);
				if (lstSysDebtCtrl == null || lstSysDebtCtrl.size() < 1) {
					setErrorMessage("CZ00027", false);
					conn.rollback();
					return;
				}
				strOwnCurCd = ((AE0170010Struct) lstSysDebtCtrl.get(0)).getOWN_CUR_CD(); // �M�݃R�[�h
				strThisMonth = ((AE0170010Struct) lstSysDebtCtrl.get(0)).getTHIS_MONTH(); // ���݂̌v��N���x
				strThisRecordingDate = getRecordingMonthOrDate(strThisMonth, true); // ���݂̌v��J�n�N����
				strMonth = strThisMonth; // �N���x
				strRecordingDate = strThisRecordingDate; // �v���
				
				// =======================================
				// ���|���g�������ׂ̎擾
				// =======================================
				
				// ���|���g�������ׂ̎擾
				List lstDebtLedgerTrn = entity.mT_DEBT_LEDGER_TRN.read(conn, st); //  ���|���g��������
				if (lstDebtLedgerTrn != null && lstDebtLedgerTrn.size() > 0) {
					
					// =======================================
					// ���|���g�������ׂ̍X�V
					// =======================================
					
					AE0170010Struct stDebtLedgerTrn = null; // ���|���g��������
					for (int j = 0; j < lstDebtLedgerTrn.size(); j++) {
						stDebtLedgerTrn = (AE0170010Struct) lstDebtLedgerTrn.get(j);
						
						stDebtLedgerTrn.setTAX_CD(struct.getTAX_CD()); // ����ŃR�[�h
						stDebtLedgerTrn.setTAX_TYP(strTaxCdTyp); // ����ŋ敪
						
						//Mod Start 20140207 liang-l
						//����ŃR�[�h�R���ڂ�1�i�O�Łj�̏ꍇc
						if ("1".equals(strTaxCdTyp)){
							// [���|���g��������].�g�`�[���t�h�@>=�@[����ŋ敪].�g�V����ŃR�[�h�J�n���h�@�̏ꍇ
							if (isNewTax(stDebtLedgerTrn.getSLIP_DATE(), stTax.getNEW_TAX_RATE_START_DATE())) {
								//stDebtLedgerTrn.setTAX_AMOUNT(
								//		calculateTax(stDebtLedgerTrn.getNET_AMOUNT(), stTax.getNEW_TAX_RATE_1(),
								//				struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // ����Ŋz
								stDebtLedgerTrn.setTAX_AMOUNT(
										calculateTax(stDebtLedgerTrn.getAMOUNT(), stTax.getNEW_TAX_RATE_1(),
												struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // ����Ŋz
							} else {
								//stDebtLedgerTrn.setTAX_AMOUNT(
								//		calculateTax(stDebtLedgerTrn.getNET_AMOUNT(), stTax.getOLD_TAX_RATE_1(),
								//				struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // ����Ŋz
								stDebtLedgerTrn.setTAX_AMOUNT(
										calculateTax(stDebtLedgerTrn.getAMOUNT(), stTax.getOLD_TAX_RATE_1(),
												struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // ����Ŋz
							}
							//�Ŕ����z =[���|���g��������].�������z
							stDebtLedgerTrn.setNET_AMOUNT(stDebtLedgerTrn.getAMOUNT());
						}
						//����ŃR�[�h�R���ڂ��T�i���Łj�̏ꍇ�A[���|���g��������].�������z/(1+(�ŗ��P)/100)�~�ŗ��P/100
						else if("5".equals(strTaxCdTyp)){
							// [���|���g��������].�g�`�[���t�h�@>=�@[����ŋ敪].�g�V����ŃR�[�h�J�n���h�@�̏ꍇ
							if (isNewTax(stDebtLedgerTrn.getSLIP_DATE(), stTax.getNEW_TAX_RATE_START_DATE())) {
								stDebtLedgerTrn.setTAX_AMOUNT(
										calculateTaxIn(stDebtLedgerTrn.getAMOUNT(), stTax.getNEW_TAX_RATE_1(),
												struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // ����Ŋz
							} else {
								stDebtLedgerTrn.setTAX_AMOUNT(
										calculateTaxIn(stDebtLedgerTrn.getAMOUNT(), stTax.getOLD_TAX_RATE_1(),
												struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // ����Ŋz
							}
							//�Ŕ����z =[���|���g��������].�������z�|����Ŋz
							stDebtLedgerTrn.setNET_AMOUNT(Calculate.subtract(convertNull(stDebtLedgerTrn.getAMOUNT()), stDebtLedgerTrn.getTAX_AMOUNT()));
						}
						//����ŃR�[�h�R���ڂ���L�ȊO�̏ꍇ�A0
						else{
							stDebtLedgerTrn.setTAX_AMOUNT("0"); // ����Ŋz
							stDebtLedgerTrn.setNET_AMOUNT(stDebtLedgerTrn.getAMOUNT()); //�Ŕ����z =[���|���g��������].�������z
						}
						//Mod End   20140207 liang-l
						
						// ([���|���g��������].�g�Ŕ����z�h�{����Ŋz)
						stDebtLedgerTrn.setGROSS_AMOUNT(
								Calculate.add(convertNull(stDebtLedgerTrn.getNET_AMOUNT()), stDebtLedgerTrn.getTAX_AMOUNT())); // �ō����z
						
						// �M�݂̏ꍇ
						if (strOwnCurCd.equals(stDebtLedgerTrn.getCUR_CD())) {
							stDebtLedgerTrn.setTAX_AMOUNT_YEN(stDebtLedgerTrn.getTAX_AMOUNT()); // ����Ŋz�i�M�݊��Z�j
							stDebtLedgerTrn.setGROSS_AMOUNT_YEN(stDebtLedgerTrn.getGROSS_AMOUNT()); // �ō����z�i�M�݊��Z�j
							//Add Start 20140207 liang-l
							stDebtLedgerTrn.setNET_AMOUNT_YEN(stDebtLedgerTrn.getNET_AMOUNT());//c�i�M�݊��Z�j=�Ŕ����z
							//Add End   20140207 liang-l
						} else {
							// ����Ŋz�i�M�݊��Z�j = ����Ŋz�~��L�Ŏ擾����[���|���g�����w�b�_].�g�בփ��[�g�h
							stDebtLedgerTrn.setTAX_AMOUNT_YEN(
									getRound(Calculate.multiply(stDebtLedgerTrn.getTAX_AMOUNT(),
											getExchRate(stDebtLedgerTrn.getCUR_CD(), stDebtLedgerTrn.getEXCH_TYP(), stDebtLedgerTrn.getINSPC_ACPT_DATE())),
											struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // ����Ŋz�i�M�݊��Z�j
							//Add Start 20140207 liang-l
							stDebtLedgerTrn.setNET_AMOUNT_YEN(
									getRound(Calculate.multiply(stDebtLedgerTrn.getNET_AMOUNT(),
											getExchRate(stDebtLedgerTrn.getCUR_CD(), stDebtLedgerTrn.getEXCH_TYP(), stDebtLedgerTrn.getINSPC_ACPT_DATE())),
											struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // �Ŕ����z�i�M�݊��Z�j=�Ŕ����z�~�בփ��[�g
							//Add End   20140207 liang-l
							stDebtLedgerTrn.setGROSS_AMOUNT_YEN(
									Calculate.add(convertNull(stDebtLedgerTrn.getNET_AMOUNT_YEN()), stDebtLedgerTrn.getTAX_AMOUNT_YEN())); // �ō����z�i�M�݊��Z�j
						}
						stDebtLedgerTrn.setsUser_ID(this.getsysUSER_CD()); // ���[�U�R�[�h
						
						// ���|���g�������ׂ̍X�V���s��
						nRet = entity.mT_DEBT_LEDGER_TRN.update(conn, stDebtLedgerTrn);
					}
					
					// =======================================
					// ���|���g�����w�b�_�̎擾
					// =======================================
					
					List lstDebtLegerHTrn = entity.mT_DEBT_LEDGER_H_TRN.read(conn, st);
					if (lstDebtLegerHTrn != null && lstDebtLegerHTrn.size() > 0) {
						
						// =======================================
						// ���|���g�����w�b�_�̍X�V
						// =======================================

						AE0170010Struct stDebtLegerHTrn = null; // ���|���g�����w�b�_
						for (int j = 0; j < lstDebtLegerHTrn.size(); j++) {
							stDebtLegerHTrn = (AE0170010Struct) lstDebtLegerHTrn.get(j);
							
							stDebtLegerHTrn.setINSPC_ACPT_NO(strBlackInspcAcptNo); // �����ԍ�
							stDebtLegerHTrn.setTAX_CD(struct.getTAX_CD()); // ����ŃR�[�h
							stDebtLegerHTrn.setTAX_TOTAL(stDebtLegerHTrn.getSUM_TAX_AMOUNT()); // ����Ŋz���v
							stDebtLegerHTrn.setGROSS_TOTAL(stDebtLegerHTrn.getSUM_GROSS_AMOUNT()); // �ō����z���v
							stDebtLegerHTrn.setsUser_ID(this.getsysUSER_CD()); // ���[�U�R�[�h
							//Add End   20140207 liang-l
							stDebtLegerHTrn.setNET_TOTAL(stDebtLegerHTrn.getSUM_NET_AMOUNT()); // �Ŕ����z���v
							//Add End   20140207 liang-l
							// ���|���g�����w�b�_�̍X�V���s��
							nRet = entity.mT_DEBT_LEDGER_H_TRN.update(conn, stDebtLegerHTrn);
						}
					}
					
					// =======================================
					// �������я��C���^�t�F�[�X�̍폜
					// =======================================
					
					// �ԃf�[�^�̍폜
					st.setINSPC_ACPT_NO(strRedInspcAcptNo); // �ԃf�[�^�̌����ԍ�
					nRet = entity.mT_INSPC_ACPT_IF.delete(conn, st);
					// ���f�[�^�̍폜
					st.setINSPC_ACPT_NO(strBlackInspcAcptNo); // ���f�[�^�̌����ԍ�
					nRet = entity.mT_INSPC_ACPT_IF.delete(conn, st);
					
				} else {
					
					// =======================================
					// ���|���������ׂ̑��݃`�F�b�N
					// =======================================
					
					// �擾������ݒ�
					st.setINSPC_ACPT_NO(strOldInspcAcptNo); // �����ԍ�
					// ���|���������ׂ̎擾���s��
					List lstDebtLegerKey = entity.mread_T_DEBT_LEDGER.read(conn, st);
					if (lstDebtLegerKey == null || lstDebtLegerKey.size() == 0) {
						continue;
					}

					String strRedSlipCd = ""; // �`�[�ԍ�(��)
					String strBlackSlipCd = ""; // �`�[�ԍ�(��)
					boolean isCreateDebtBalance = false; // ���|���c���o�^�t���O
					String strTaxAmountTotal = "0"; // ����Ŋz���v
					String strGrossAmountTotal = "0"; // �ō����z���v
					//Add Start 20140207 liang-l
					String strNetTotal = "0"; // �Ŕ����z���v
					//Add End   20140207 liang-l

					AE0170010Struct stDebtLegerKey = null; // ���|�������L�[
					AE0170010Struct stDebtLeger = null; // ���|����������
					AE0170010Struct stDebtLegerH = null; // ���|�������w�b�_
					// ���|�������w�b�_���X�g
					List lstDebtLegerH = null;
					// ���|���������׃��X�g
					List lstDebtLeger = null;
					for (int j = 0; j < lstDebtLegerKey.size(); j++) {
						stDebtLegerKey = (AE0170010Struct) lstDebtLegerKey.get(j);
						
						// =======================================
						// ���|�������w�b�_�̎擾
						// =======================================

						// �`�[�ԍ����̔Ԃ���
						strRedSlipCd = getNewSlipCd(stDebtLegerKey.getSLIP_TYP(), strSysDateTime); // �`�[�ԍ�(��)
						strBlackSlipCd = getNewSlipCd(stDebtLegerKey.getSLIP_TYP(), strSysDateTime); // �`�[�ԍ�(��)
						// �擾������ݒ�
						st.setCOMPANY_CD(stDebtLegerKey.getCOMPANY_CD()); // ��ЃR�[�h
						st.setSLIP_TYP(stDebtLegerKey.getSLIP_TYP()); // �`�[���
						st.setSLIP_CTRL_GRP(stDebtLegerKey.getSLIP_CTRL_GRP()); // �`�[�Ǘ��O���[�v
						st.setSLIP_DATE(stDebtLegerKey.getSLIP_DATE()); // �`�[���t
						st.setSLIP_CD(stDebtLegerKey.getSLIP_CD()); // �`�[�ԍ�
						// ���|�������w�b�_�̎擾���s��
						lstDebtLegerH = entity.mT_DEBT_LEDGER_H.read(conn, st);
						if (lstDebtLegerH != null && lstDebtLegerH.size() == 1) {
							stDebtLegerH = (AE0170010Struct) lstDebtLegerH.get(0);
							stDebtLegerH.setsUser_ID(this.getsysUSER_CD()); // ���[�U�R�[�h
						}
						
						// =======================================
						// ���|���������ׂ̎擾
						// =======================================
						
						// ���|���������ׂ̎擾���s��
						lstDebtLeger = entity.mT_DEBT_LEDGER.read(conn, st);
						
						// =======================================
						// ���|�������w�b�_�̓o�^(�ԃf�[�^)
						// =======================================
						
						if (stDebtLegerH != null) {
							
							// �ԃf�[�^�̕ҏW
							stDebtLegerH.setSLIP_CD(strRedSlipCd); // �`�[�ԍ�
							stDebtLegerH.setINSPC_ACPT_CRCT_TYP("1"); // �����敪(��)
							stDebtLegerH.setINSPC_ACPT_NO(strRedInspcAcptNo); // �����ԍ�
							stDebtLegerH.setNET_TOTAL(Calculate.subtract("0", convertNull(stDebtLegerH.getNET_TOTAL()))); // �Ŕ����z���v
							stDebtLegerH.setTAX_TOTAL(Calculate.subtract("0", convertNull(stDebtLegerH.getTAX_TOTAL()))); // ����Ŋz���v
							stDebtLegerH.setGROSS_TOTAL(Calculate.subtract("0", convertNull(stDebtLegerH.getGROSS_TOTAL()))); // �ō����z���v
							//Add Start 20140207 liang-l
							stDebtLegerH.setRECORDING_PROC_CD(this.getsysUSER_CD());//�v�㏈�����s�҃R�[�h
							//Add End   20140207 liang-l
							
							// ���|�������w�b�_�̓o�^�i�ԃf�[�^�j
							nRet = entity.mT_DEBT_LEDGER_H.create(conn, stDebtLegerH);
						}
					
						// =======================================
						// �c���Ǘ��t���O�̃`�F�b�N
						// =======================================
						
						st.setVEND_CD(stDebtLegerH.getPAYEE_CD()); // �����R�[�h
						
						// �c���Ǘ��t���O�̃`�F�b�N
						if (entity.mcheck_T_DEBT_BALANCE.check(conn, st)) {
							isCreateDebtBalance = true;
						} else {
							isCreateDebtBalance = false;
						}
					
						// =======================================
						// ���|���������ׂ̓o�^(�ԃf�[�^)
						// =======================================
						
						if (lstDebtLeger != null && lstDebtLeger.size() > 0) {
							for (int k = 0; k < lstDebtLeger.size(); k++) {
								stDebtLeger = (AE0170010Struct) lstDebtLeger.get(k);
								stDebtLeger.setsUser_ID(this.getsysUSER_CD()); // ���[�U�R�[�h
								
								// �ԃf�[�^�̕ҏW
								stDebtLeger.setSLIP_CD(strRedSlipCd); // �`�[�ԍ�
								stDebtLeger.setPROCESSING_COST(Calculate.subtract("0", convertNull(stDebtLeger.getPROCESSING_COST()))); // ���H��
								stDebtLeger.setMATERIAL_COST(Calculate.subtract("0", convertNull(stDebtLeger.getMATERIAL_COST()))); // �ޗ���
								stDebtLeger.setOTHER_OVERHEADS(Calculate.subtract("0", convertNull(stDebtLeger.getOTHER_OVERHEADS()))); // ���̑��o��
								stDebtLeger.setACPT_QTY(Calculate.subtract("0", convertNull(stDebtLeger.getACPT_QTY()))); // �����
								stDebtLeger.setINSPC_ACPT_QTY(Calculate.subtract("0", convertNull(stDebtLeger.getINSPC_ACPT_QTY()))); // ������
								stDebtLeger.setAMOUNT(Calculate.subtract("0", convertNull(stDebtLeger.getAMOUNT()))); // �������z
								stDebtLeger.setNET_AMOUNT(Calculate.subtract("0", convertNull(stDebtLeger.getNET_AMOUNT()))); // �Ŕ����z
								stDebtLeger.setTAX_AMOUNT(Calculate.subtract("0", convertNull(stDebtLeger.getTAX_AMOUNT()))); // ����Ŋz
								stDebtLeger.setGROSS_AMOUNT(Calculate.subtract("0", convertNull(stDebtLeger.getGROSS_AMOUNT()))); // �ō����z
								stDebtLeger.setPROCESSING_COST_YEN(Calculate.subtract("0", convertNull(stDebtLeger.getPROCESSING_COST_YEN()))); // ���H��(�M�݊��Z)
								stDebtLeger.setMATERIAL_COST_YEN(Calculate.subtract("0", convertNull(stDebtLeger.getMATERIAL_COST_YEN()))); // �ޗ���(�M�݊��Z)
								stDebtLeger.setOTHER_OVERHEADS_YEN(Calculate.subtract("0", convertNull(stDebtLeger.getOTHER_OVERHEADS_YEN()))); // ���̑��o��(�M�݊��Z)
								stDebtLeger.setNET_AMOUNT_YEN(Calculate.subtract("0", convertNull(stDebtLeger.getNET_AMOUNT_YEN()))); // �Ŕ����z(�M�݊��Z)
								stDebtLeger.setTAX_AMOUNT_YEN(Calculate.subtract("0", convertNull(stDebtLeger.getTAX_AMOUNT_YEN()))); // ����Ŋz�i�M�݊��Z�j
								stDebtLeger.setGROSS_AMOUNT_YEN(Calculate.subtract("0", convertNull(stDebtLeger.getGROSS_AMOUNT_YEN()))); // �ō����z�i�M�݊��Z�j
								
								// ���|���������ׂ̓o�^�i�ԃf�[�^�j
								nRet = entity.mT_DEBT_LEDGER.create(conn, stDebtLeger);

								// =======================================
								// ���|���c�����ׂ̓o�^(�ԃf�[�^)
								// =======================================
								
								// �v��N���x�Z�o
								String strInspcAcptDate = stDebtLegerH.getINSPC_ACPT_DATE();
								if (strInspcAcptDate != null && strInspcAcptDate.length() > 10) {
									strInspcAcptDate = strInspcAcptDate.substring(0, 10);
								}
								if (DateTool.compareYMD(strInspcAcptDate, strThisRecordingDate) < 0) {
									strRecordingDate = strThisRecordingDate; // �v���
									strMonth = strThisMonth; // �N���x
								} else {
									strRecordingDate = strInspcAcptDate; // �v���
									strMonth = getRecordingMonthOrDate(strInspcAcptDate, false); // �N���x
								}
								
								// ���|���c�����דo�^�p�f�[�^�̐ݒ�
								stDebtLeger.setCOMPANY_CD(stDebtLegerH.getCOMPANY_CD()); // ��ЃR�[�h
								stDebtLeger.setINSPC_ACPT_CRCT_TYP(stDebtLegerH.getINSPC_ACPT_CRCT_TYP()); // �����敪
								stDebtLeger.setORGN_SLIP_CTRL_GRP(stDebtLegerH.getORGN_SLIP_CTRL_GRP()); // ���`�[�Ǘ��O���[�v
								stDebtLeger.setORGN_SLIP_CD(stDebtLegerH.getORGN_SLIP_CD()); // ���`�[�ԍ�
								stDebtLeger.setORGN_SLIP_DATE(stDebtLegerH.getORGN_SLIP_DATE()); // ���`�[���t
								stDebtLeger.setSLIP_TRN_CD(stDebtLegerH.getSLIP_TRN_CD()); // �`�[�敪
								stDebtLeger.setBALANCE_CLASS_CD(stDebtLegerH.getBALANCE_CLASS_CD()); // �c�����ރR�[�h
								stDebtLeger.setINSPC_ACPT_DATE(stDebtLegerH.getINSPC_ACPT_DATE()); // ������
								stDebtLeger.setRECORDING_DATE(strRecordingDate); // �v���
								stDebtLeger.setMONTH(strMonth); // �N���x
								stDebtLeger.setCUR_CD(stDebtLegerH.getCUR_CD()); // �ʉ݃R�[�h
								stDebtLeger.setPAYEE_CD(stDebtLegerH.getPAYEE_CD()); // �x����R�[�h
								stDebtLeger.setDATA_TYP("10"); // �f�[�^��� �g10�h�i�v��j
								stDebtLeger.setVEND_CD(stDebtLegerH.getVEND_CD()); // �����R�[�h
								stDebtLeger.setEXPL_TYP(stDebtLegerH.getEXPL_TYP()); // �E�v�敪
								stDebtLeger.setEXPL_CD(stDebtLegerH.getEXPL_CD()); // �E�v�R�[�h
								stDebtLeger.setEXPL_NAME(stDebtLegerH.getEXPL_NAME()); // �E�v��
								stDebtLeger.setPAY_CYCLE_TYP(stDebtLegerH.getPAY_CYCLE_TYP()); // �x���T�C�N��
								stDebtLeger.setDEADLINE_DATE(stDebtLegerH.getDEADLINE_DATE()); // �x������
								stDebtLeger.setPAY_SCH_DATE(stDebtLegerH.getPAY_SCH_DATE()); // �x���\���
								stDebtLeger.setEXCH_TYP(stDebtLegerH.getEXCH_TYP()); // �ב֎��
								stDebtLeger.setEXCH_RSRV_CD(stDebtLegerH.getEXCH_RSRV_CD()); // �ב֗\��R�[�h
								stDebtLeger.setEXCH_DATE(stDebtLegerH.getEXCH_DATE()); // �ב֓��t
								stDebtLeger.setEXCH_RATE(stDebtLegerH.getEXCH_RATE()); // �בփ��[�g
								stDebtLeger.setSTATUS(stDebtLegerH.getSTATUS()); // ��ԋ敪
								stDebtLeger.setGL_IF_OUT_FLG("0"); // ��ʉ�v�h�^�e���o�t���O �g0�h�i�����o�j
								stDebtLeger.setBALANCE_UPD_FLG("1"); // �c���X�V�t���O �g�P�h�i�X�V�ρj
								stDebtLeger.setBALANCE_UPD_DATE(strSysDateTime); // �c���X�V����(�V�X�e������)
								
								stDebtLeger.setACCT_CD(stDebtLeger.getCR_ACCT_CD()); // �ȖڃR�[�h
								stDebtLeger.setSUB_ACCT_CD(stDebtLeger.getCR_SUB_ACCT_CD()); // �⏕�敪�R�[�h
								stDebtLeger.setORG_CD(stDebtLeger.getCR_ORG_CD()); // ����R�[�h
								
								// ���|���c�����ׂ̓o�^�i�ԃf�[�^�j
								nRet = entity.mT_DEBT_BALANCE_D.create(conn, stDebtLeger);

								// =======================================
								// ���|���c���̍X�V(�ԃf�[�^)
								// =======================================
								
								if (isCreateDebtBalance) {
									// ���|���c���̍X�V���s��(�ԃf�[�^)
									updateT_DEBT_BALANCE(stDebtLeger);
								}
								
								// =======================================
								// ���|���������ׂ̕ҏW(���f�[�^)
								// =======================================
								
								// ���f�[�^�̕ҏW
								stDebtLeger.setSLIP_CD(strBlackSlipCd); // �`�[�ԍ�
								stDebtLeger.setTAX_CD(struct.getTAX_CD()); // ����ŃR�[�h
								stDebtLeger.setTAX_TYP(strTaxCdTyp); // ����ŋ敪
								stDebtLeger.setPROCESSING_COST(Calculate.subtract("0", convertNull(stDebtLeger.getPROCESSING_COST()))); // ���H��
								stDebtLeger.setMATERIAL_COST(Calculate.subtract("0", convertNull(stDebtLeger.getMATERIAL_COST()))); // �ޗ���
								stDebtLeger.setOTHER_OVERHEADS(Calculate.subtract("0", convertNull(stDebtLeger.getOTHER_OVERHEADS()))); // ���̑��o��
								stDebtLeger.setACPT_QTY(Calculate.subtract("0", convertNull(stDebtLeger.getACPT_QTY()))); // �����
								stDebtLeger.setINSPC_ACPT_QTY(Calculate.subtract("0", convertNull(stDebtLeger.getINSPC_ACPT_QTY()))); // ������
								stDebtLeger.setAMOUNT(Calculate.subtract("0", convertNull(stDebtLeger.getAMOUNT()))); // �������z
								//Mod Start 20140207 liang-l
								//����ŃR�[�h�R���ڂ��T�i���Łj�̏ꍇ
								if ("5".equals(strTaxCdTyp)){
									// [���|����������].�g�`�[���t�h�@���@[����ŋ敪].�g�V����ŃR�[�h�J�n���h�@�̏ꍇ
									if (isNewTax(stDebtLeger.getSLIP_DATE(), stTax.getNEW_TAX_RATE_START_DATE())) {
										stDebtLeger.setTAX_AMOUNT(
												calculateTaxIn(stDebtLeger.getAMOUNT(), stTax.getNEW_TAX_RATE_1(),
														struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // ����Ŋz
									} else {
										stDebtLeger.setTAX_AMOUNT(
												calculateTaxIn(stDebtLeger.getAMOUNT(),
														stTax.getOLD_TAX_RATE_1(),
														struct.geth_DECIMAL_FIG(),
														stTax.getROUND_TYP())); // ����Ŋz
									}
									stDebtLeger.setNET_AMOUNT(Calculate.subtract(stDebtLeger.getAMOUNT(), convertNull(stDebtLeger.getTAX_AMOUNT()))); // �Ŕ����z=[���|����������] .�g�������z�h �̒l - ����Ŋz
								}
								//����ŃR�[�h�R���ڂ�1�i�O�Łj�̏ꍇ
								else if("1".equals(strTaxCdTyp)){
									// [���|����������].�g�`�[���t�h�@���@[����ŋ敪].�g�V����ŃR�[�h�J�n���h�@�̏ꍇ
									if (isNewTax(stDebtLeger.getSLIP_DATE(), stTax.getNEW_TAX_RATE_START_DATE())) {
										//stDebtLeger.setTAX_AMOUNT(
										//		calculateTax(stDebtLeger.getNET_AMOUNT(),
										//				stTax.getNEW_TAX_RATE_1(),
										//				struct.geth_DECIMAL_FIG(),
										//				stTax.getROUND_TYP())); // ����Ŋz
										stDebtLeger.setTAX_AMOUNT(
												calculateTax(stDebtLeger.getAMOUNT(),
														stTax.getNEW_TAX_RATE_1(),
														struct.geth_DECIMAL_FIG(),
														stTax.getROUND_TYP())); // ����Ŋz
									} else {
										//stDebtLeger.setTAX_AMOUNT(
										//		calculateTax(stDebtLeger.getNET_AMOUNT(),
										//				stTax.getOLD_TAX_RATE_1(),
										//				struct.geth_DECIMAL_FIG(),
										//				stTax.getROUND_TYP())); // ����Ŋz
										stDebtLeger.setTAX_AMOUNT(
												calculateTax(stDebtLeger.getAMOUNT(),
														stTax.getOLD_TAX_RATE_1(),
														struct.geth_DECIMAL_FIG(),
														stTax.getROUND_TYP())); // ����Ŋz
									}
									stDebtLeger.setNET_AMOUNT(stDebtLeger.getAMOUNT()); // �Ŕ����z=[���|����������] .�g�������z�h �̒l
								}
								else{
									stDebtLeger.setTAX_AMOUNT("0"); // ����Ŋz
									stDebtLeger.setNET_AMOUNT(stDebtLeger.getAMOUNT()); // �Ŕ����z=[���|����������] .�g�������z�h �̒l
								}
								//Mod End   20140207 liang-l
								
								stDebtLeger.setGROSS_AMOUNT(Calculate.add(stDebtLeger.getNET_AMOUNT(), stDebtLeger.getTAX_AMOUNT())); // �ō����z
								stDebtLeger.setPROCESSING_COST_YEN(Calculate.subtract("0", convertNull(stDebtLeger.getPROCESSING_COST_YEN()))); // ���H��(�M�݊��Z)
								stDebtLeger.setMATERIAL_COST_YEN(Calculate.subtract("0", convertNull(stDebtLeger.getMATERIAL_COST_YEN()))); // �ޗ���(�M�݊��Z)
								stDebtLeger.setOTHER_OVERHEADS_YEN(Calculate.subtract("0", convertNull(stDebtLeger.getOTHER_OVERHEADS_YEN()))); // ���̑��o��(�M�݊��Z)
								//Del Start 20140207 liang-l
								//stDebtLeger.setNET_AMOUNT_YEN(Calculate.subtract("0", convertNull(stDebtLeger.getNET_AMOUNT_YEN()))); // �Ŕ����z(�M�݊��Z)
								//Del End   20140207 liang-l
								// �M�݂̏ꍇ
								if (strOwnCurCd.equals(stDebtLeger.getCUR_CD())) {
									stDebtLeger.setTAX_AMOUNT_YEN(stDebtLeger.getTAX_AMOUNT()); // ����Ŋz�i�M�݊��Z�j
									stDebtLeger.setGROSS_AMOUNT_YEN(stDebtLeger.getGROSS_AMOUNT()); // �ō����z�i�M�݊��Z�j
									//Add Start 20140207 liang-l
									stDebtLeger.setNET_AMOUNT_YEN(convertNull(stDebtLeger.getNET_AMOUNT())); // �Ŕ����z(�M�݊��Z)=�Ŕ����z
									//Add End   20140207 liang-l
								} else {
									stDebtLeger.setTAX_AMOUNT_YEN(
											getRound(Calculate.multiply(stDebtLeger.getTAX_AMOUNT(),
													getExchRate(stDebtLegerH.getCUR_CD(), stDebtLegerH.getEXCH_TYP(), stDebtLegerH.getINSPC_ACPT_DATE())),
													struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // ����Ŋz�i�M�݊��Z�j
									//Add Start 20140207 liang-l
									stDebtLeger.setNET_AMOUNT_YEN(
											getRound(Calculate.multiply(stDebtLeger.getNET_AMOUNT(),
											getExchRate(stDebtLegerH.getCUR_CD(), stDebtLegerH.getEXCH_TYP(), stDebtLegerH.getINSPC_ACPT_DATE())),
											struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // �Ŕ����z(�M�݊��Z)=�Ŕ����z�~��L�Ŏ擾����[���|�������w�b�_].�g�בփ��[�g�h
									//Add End   20140207 liang-l
									stDebtLeger.setGROSS_AMOUNT_YEN(
											Calculate.add(convertNull(stDebtLeger.getNET_AMOUNT_YEN()),
													stDebtLeger.getTAX_AMOUNT_YEN())); // �ō����z�i�M�݊��Z�j
								}
								
								// =======================================
								// ���|�������w�b�_�p�f�[�^�̏W�v(���f�[�^)
								// =======================================

								// ���|���������ׂ̏���Ŋz�A�ō����z���W�v����
								strTaxAmountTotal = Calculate.add(strTaxAmountTotal, stDebtLeger.getTAX_AMOUNT()); // ����Ŋz���v
								strGrossAmountTotal = Calculate.add(strGrossAmountTotal, stDebtLeger.getGROSS_AMOUNT()); // �ō����z���v
								//Add Start 20140207 liang-l
								strNetTotal = Calculate.add(strNetTotal, stDebtLeger.getNET_AMOUNT()); // �Ŕ����z���v
								//Add End   20140207 liang-l
							}
						}
						
						// =======================================
						// ���|�������w�b�_�̓o�^(���f�[�^)
						// =======================================
						
						if (stDebtLegerH != null) {
							
							// ���f�[�^�̕ҏW
							stDebtLegerH.setSLIP_CD(strBlackSlipCd); // �`�[�ԍ�
							stDebtLegerH.setINSPC_ACPT_CRCT_TYP("2"); // �����敪(��)
							stDebtLegerH.setINSPC_ACPT_NO(strBlackInspcAcptNo); // �����ԍ�
							stDebtLegerH.setTAX_CD(struct.getTAX_CD()); // ����ŃR�[�h
							//Mod Start 20140207 liang-l
							//stDebtLegerH.setNET_TOTAL(Calculate.subtract("0", convertNull(stDebtLegerH.getNET_TOTAL()))); // �Ŕ����z���v
							stDebtLegerH.setNET_TOTAL(strNetTotal); // �Ŕ����z���v
							stDebtLegerH.setRECORDING_PROC_CD(this.getsysUSER_CD());//�v�㏈�����s�҃R�[�h
							//Mod End   20140207 liang-l
							stDebtLegerH.setTAX_TOTAL(strTaxAmountTotal); // ����Ŋz���v
							stDebtLegerH.setGROSS_TOTAL(strGrossAmountTotal); // �ō����z���v
							
							// ���|�������w�b�_�̓o�^�i���f�[�^�j
							nRet = entity.mT_DEBT_LEDGER_H.create(conn, stDebtLegerH);
							
							strTaxAmountTotal = "0"; // ����Ŋz���v
							strGrossAmountTotal = "0"; // �ō����z���v
							//Add Start 20140207 liang-l
							strNetTotal = "0"; // �Ŕ����z���v
							//Add End   20140207 liang-l
						}
						
						// =======================================
						// ���|���������ׂ̓o�^(���f�[�^)
						// =======================================
						
						if (lstDebtLeger != null && lstDebtLeger.size() > 0) {
							for (int k = 0; k < lstDebtLeger.size(); k++) {
								stDebtLeger = (AE0170010Struct) lstDebtLeger.get(k);
						
								// ���|���������ׂ̓o�^���s���i���f�[�^�j
								nRet = entity.mT_DEBT_LEDGER.create(conn, stDebtLeger);
		
								// =======================================
								// ���|���c�����ׂ̓o�^(���f�[�^)
								// =======================================
								
								if (stDebtLegerH != null) {
									// ���|���c�����ׂ̓o�^���s���i���f�[�^�j
									nRet = entity.mT_DEBT_BALANCE_D.create(conn, stDebtLeger);
								}
		
								// =======================================
								// ���|���c���̍X�V(���f�[�^)
								// =======================================
								
								if (isCreateDebtBalance) {
									// ���|���c���̍X�V���s��(���f�[�^)
									updateT_DEBT_BALANCE(stDebtLeger);
								}
							}
						}
					}
				}
			}
			
			controlSelect();
			
		} catch(SQLException e) {
			e.printStackTrace();
			setExceptionMsg(e, "ZZ01106");
		} catch(ParseException e) {
			setExceptionMsg(e, "ZZ01106");
		}
                //}}user_implement_dev:<controlUpdate>
		logger.exiting("AE0170010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0170");
		logger.entering("AE0170010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
		struct.initialize();
		if(list != null)
		{
			list.clear();
		}
		controlRELOAD();
		setReadStatus(INITIAL);
                //}}user_implement_dev:<controlClear>
		logger.exiting("AE0170010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0170");
		logger.entering("AE0170010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("AE0170010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0170");
		logger.entering("AE0170010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
		struct.initialize();
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AE0170010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0170");
		logger.entering("AE0170010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		try{
			AE0170010Struct st = new AE0170010Struct();
			
			// =======================================
			// �C���X�g�[���I�v�V�����̎擾
			// =======================================
			
			struct.setOPTION_ID(EXPLANNER_JASCM);
			if (!entity.mcheck_SYS_INSTALL_OPTIONS.check(conn, struct)) {
				struct.setOPTION_ID(EXPLANNER_JA);
				if (!entity.mcheck_SYS_INSTALL_OPTIONS.check(conn, struct)) {
					struct.setOPTION_ID(EXPLANNER_JF);
					if (!entity.mcheck_SYS_INSTALL_OPTIONS.check(conn, struct)) {
						struct.setOPTION_ID(EXPLANNER_J);
					}
				}
			}

			// =======================================
			// �H��R�[�h�̎擾
			// =======================================
			
			struct.setPLANT_CD(this.getsysPLANT_CD());

			// =======================================
			// ��ЃR�[�h�̎擾
			// =======================================

			try{
				// Explanner/JaScm�̏ꍇ
				if (EXPLANNER_JASCM.equals(struct.getOPTION_ID())) {
					st.setPLANT_CD(this.getsysPLANT_CD());
					List lstCompanyCd = entity.mget_M_PLANT_SCM.read(conn, st);
					if (lstCompanyCd == null || lstCompanyCd.size() < 1) {
						setErrorMessage("KQ00039", true);
					}
					struct.setCOMPANY_CD(((AE0170010Struct) lstCompanyCd.get(0)).getCOMPANY_CD()); // ��ЃR�[�h
				} else {
					String strCompanyCd = SystemInformation.getSysMyCompanyCd();
					if (strCompanyCd == null || strCompanyCd.equals("")) {
						setErrorMessage("KQ00039", true);
					} else {
						struct.setCOMPANY_CD(strCompanyCd); // ��ЃR�[�h
					}
				}
			} catch (FoundationException e) {
				setErrorMessage("KQ00039", true);
			}

			// =======================================
			// �M�݂̏��������̎擾
			// =======================================
			
			List lstHomeMCur = entity.mget_SYS_HOME_CUR.read(conn, st);
			if (lstHomeMCur == null || lstHomeMCur.size() < 1) {
				setErrorMessage("KA20039", true);
			}
			
			st.setCUR_CD(((AE0170010Struct) lstHomeMCur.get(0)).getHOME_CUR_CD()); // �M�݃R�[�h
			List lstMCur = entity.mget_HOME_DECIMAL_FIG.read(conn, st);
			if (lstMCur == null || lstMCur.size() < 1) {
				setErrorMessage("BZ00184", true);
			}
			struct.setHOME_DECIMAL_FIG(((AE0170010Struct) lstMCur.get(0)).getHOME_DECIMAL_FIG()); // �M�݂̏�������

			// =======================================
			// �\���s�������l�̎擾
			// =======================================
			
			_maxLine = 0;
			_maxLine = sp.getMaxLine(conn, 10);

		} catch(SQLException e) {
			e.printStackTrace();
			setExceptionMsg(e, "ZZ01106");
		}
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AE0170010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0170");
		logger.entering("AE0170010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AE0170010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
//			throw new FoundationException("AE0170010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0170010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AE0170010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0170010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AE0170010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0170010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AE0170010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AE0170010Entity entity;
	protected AE0170010Struct struct;
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

		entity = new AE0170010Entity();
		struct = new AE0170010Struct();

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
	 * AE0170010�N���X�̕W���R���X�g���N�^
	 */
	public AE0170010Control() throws BusinessProcessException, FoundationException
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
				AE0170010Struct key = (AE0170010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("c_NON_NO_ITEM_FLG") && key.getc_NON_NO_ITEM_FLG() != null) {
					msgKey.setKeyValue("c_NON_NO_ITEM_FLG", key.getc_NON_NO_ITEM_FLG());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_TIME") && key.getPUCH_ODR_DLV_TIME() != null) {
					msgKey.setKeyValue("PUCH_ODR_DLV_TIME", key.getPUCH_ODR_DLV_TIME());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_START_TIME") && key.getPUCH_ODR_START_TIME() != null) {
					msgKey.setKeyValue("PUCH_ODR_START_TIME", key.getPUCH_ODR_START_TIME());
				}
				if(msgKeyType.containsKeyColumn("l_STATUS") && key.getl_STATUS() != null) {
					msgKey.setKeyValue("l_STATUS", key.getl_STATUS());
				}
				if(msgKeyType.containsKeyColumn("l_ACPT_NO") && key.getl_ACPT_NO() != null) {
					msgKey.setKeyValue("l_ACPT_NO", key.getl_ACPT_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ACPT_QTY") && key.getl_ACPT_QTY() != null) {
					msgKey.setKeyValue("l_ACPT_QTY", key.getl_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ACPT_DATE") && key.getl_ACPT_DATE() != null) {
					msgKey.setKeyValue("l_ACPT_DATE", key.getl_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_COST") && key.getl_UNIT_COST() != null) {
					msgKey.setKeyValue("l_UNIT_COST", key.getl_UNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_COST_TYP") && key.getl_UNIT_COST_TYP() != null) {
					msgKey.setKeyValue("l_UNIT_COST_TYP", key.getl_UNIT_COST_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_AMOUNT") && key.getl_PUCH_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_AMOUNT", key.getl_PUCH_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_INSPECTED_QTY") && key.getl_INSPECTED_QTY() != null) {
					msgKey.setKeyValue("l_INSPECTED_QTY", key.getl_INSPECTED_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ACCEPTED_QTY") && key.getl_ACCEPTED_QTY() != null) {
					msgKey.setKeyValue("l_ACCEPTED_QTY", key.getl_ACCEPTED_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_INSPEC_DATE") && key.getl_INSPEC_DATE() != null) {
					msgKey.setKeyValue("l_INSPEC_DATE", key.getl_INSPEC_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_NET_AMOUNT") && key.geth_NET_AMOUNT() != null) {
					msgKey.setKeyValue("h_NET_AMOUNT", key.geth_NET_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("h_TAX_AMOUNT_1") && key.geth_TAX_AMOUNT_1() != null) {
					msgKey.setKeyValue("h_TAX_AMOUNT_1", key.geth_TAX_AMOUNT_1());
				}
				if(msgKeyType.containsKeyColumn("h_TAX_AMOUNT_2") && key.geth_TAX_AMOUNT_2() != null) {
					msgKey.setKeyValue("h_TAX_AMOUNT_2", key.geth_TAX_AMOUNT_2());
				}
				if(msgKeyType.containsKeyColumn("h_TAX_AMOUNT_3") && key.geth_TAX_AMOUNT_3() != null) {
					msgKey.setKeyValue("h_TAX_AMOUNT_3", key.geth_TAX_AMOUNT_3());
				}
				if(msgKeyType.containsKeyColumn("h_DECIMAL_FIG") && key.geth_DECIMAL_FIG() != null) {
					msgKey.setKeyValue("h_DECIMAL_FIG", key.geth_DECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("h_ROUND_TYP") && key.geth_ROUND_TYP() != null) {
					msgKey.setKeyValue("h_ROUND_TYP", key.geth_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_PUCH_ODR_STS_TYP") && key.geth_PUCH_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("h_PUCH_ODR_STS_TYP", key.geth_PUCH_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_PUCH_ODR_INST_SLIP_ISS_FLG") && key.geth_PUCH_ODR_INST_SLIP_ISS_FLG() != null) {
					msgKey.setKeyValue("h_PUCH_ODR_INST_SLIP_ISS_FLG", key.geth_PUCH_ODR_INST_SLIP_ISS_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_CANCEL_SLIP_ISS_FLG") && key.geth_ODR_CANCEL_SLIP_ISS_FLG() != null) {
					msgKey.setKeyValue("h_ODR_CANCEL_SLIP_ISS_FLG", key.geth_ODR_CANCEL_SLIP_ISS_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_INSPC_CMPLT_FLG") && key.geth_INSPC_CMPLT_FLG() != null) {
					msgKey.setKeyValue("h_INSPC_CMPLT_FLG", key.geth_INSPC_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_ACPT_INSPC_TYP") && key.geth_ACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("h_ACPT_INSPC_TYP", key.geth_ACPT_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_NET_AMOUNT_LIST") && key.geth_NET_AMOUNT_LIST() != null) {
					msgKey.setKeyValue("h_NET_AMOUNT_LIST", key.geth_NET_AMOUNT_LIST());
				}
				if(msgKeyType.containsKeyColumn("h_TAX_AMOUNT_1_LIST") && key.geth_TAX_AMOUNT_1_LIST() != null) {
					msgKey.setKeyValue("h_TAX_AMOUNT_1_LIST", key.geth_TAX_AMOUNT_1_LIST());
				}
				if(msgKeyType.containsKeyColumn("h_TAX_AMOUNT_2_LIST") && key.geth_TAX_AMOUNT_2_LIST() != null) {
					msgKey.setKeyValue("h_TAX_AMOUNT_2_LIST", key.geth_TAX_AMOUNT_2_LIST());
				}
				if(msgKeyType.containsKeyColumn("h_TAX_AMOUNT_3_LIST") && key.geth_TAX_AMOUNT_3_LIST() != null) {
					msgKey.setKeyValue("h_TAX_AMOUNT_3_LIST", key.geth_TAX_AMOUNT_3_LIST());
				}
				if(msgKeyType.containsKeyColumn("h_UPDATE_FLG") && key.geth_UPDATE_FLG() != null) {
					msgKey.setKeyValue("h_UPDATE_FLG", key.geth_UPDATE_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT") && key.geth_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_MODIFY_COUNT", key.geth_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT_LIST") && key.geth_MODIFY_COUNT_LIST() != null) {
					msgKey.setKeyValue("h_MODIFY_COUNT_LIST", key.geth_MODIFY_COUNT_LIST());
				}
				if(msgKeyType.containsKeyColumn("h_EXCH_RATE") && key.geth_EXCH_RATE() != null) {
					msgKey.setKeyValue("h_EXCH_RATE", key.geth_EXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("h_EXCH_RATE_LIST") && key.geth_EXCH_RATE_LIST() != null) {
					msgKey.setKeyValue("h_EXCH_RATE_LIST", key.geth_EXCH_RATE_LIST());
				}
				if(msgKeyType.containsKeyColumn("h_TAX_CD") && key.geth_TAX_CD() != null) {
					msgKey.setKeyValue("h_TAX_CD", key.geth_TAX_CD());
				}
				if(msgKeyType.containsKeyColumn("h_PUCH_ODR_CD") && key.geth_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("h_PUCH_ODR_CD", key.geth_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("NON_NO_ITEM_FLG") && key.getNON_NO_ITEM_FLG() != null) {
					msgKey.setKeyValue("NON_NO_ITEM_FLG", key.getNON_NO_ITEM_FLG());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE") && key.getPUCH_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("PUCH_ODR_DLV_DATE", key.getPUCH_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD") && key.getTAX_CD() != null) {
					msgKey.setKeyValue("TAX_CD", key.getTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE") && key.getPUCH_ODR_START_DATE() != null) {
					msgKey.setKeyValue("PUCH_ODR_START_DATE", key.getPUCH_ODR_START_DATE());
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
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP") && key.getACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP", key.getACPT_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_AMOUNT") && key.getPUCH_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("PUCH_ODR_AMOUNT", key.getPUCH_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("RATE_JUDGE_DATE") && key.getRATE_JUDGE_DATE() != null) {
					msgKey.setKeyValue("RATE_JUDGE_DATE", key.getRATE_JUDGE_DATE());
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
				if(msgKeyType.containsKeyColumn("PUCH_ODR_STS_TYP") && key.getPUCH_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("PUCH_ODR_STS_TYP", key.getPUCH_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_INST_SLIP_ISS_FLG") && key.getPUCH_ODR_INST_SLIP_ISS_FLG() != null) {
					msgKey.setKeyValue("PUCH_ODR_INST_SLIP_ISS_FLG", key.getPUCH_ODR_INST_SLIP_ISS_FLG());
				}
				if(msgKeyType.containsKeyColumn("ODR_CANCEL_SLIP_ISS_FLG") && key.getODR_CANCEL_SLIP_ISS_FLG() != null) {
					msgKey.setKeyValue("ODR_CANCEL_SLIP_ISS_FLG", key.getODR_CANCEL_SLIP_ISS_FLG());
				}
				if(msgKeyType.containsKeyColumn("INSPC_CMPLT_FLG") && key.getINSPC_CMPLT_FLG() != null) {
					msgKey.setKeyValue("INSPC_CMPLT_FLG", key.getINSPC_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("EXCH_RATE") && key.getEXCH_RATE() != null) {
					msgKey.setKeyValue("EXCH_RATE", key.getEXCH_RATE());
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
				if(msgKeyType.containsKeyColumn("VEND_NAME") && key.getVEND_NAME() != null) {
					msgKey.setKeyValue("VEND_NAME", key.getVEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_APP_TYP") && key.getINSPC_ACPT_APP_TYP() != null) {
					msgKey.setKeyValue("INSPC_ACPT_APP_TYP", key.getINSPC_ACPT_APP_TYP());
				}
				if(msgKeyType.containsKeyColumn("CUR_CD") && key.getCUR_CD() != null) {
					msgKey.setKeyValue("CUR_CD", key.getCUR_CD());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP") && key.getEXCH_TYP() != null) {
					msgKey.setKeyValue("EXCH_TYP", key.getEXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("ROUND_TYP") && key.getROUND_TYP() != null) {
					msgKey.setKeyValue("ROUND_TYP", key.getROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("CUR_NAME") && key.getCUR_NAME() != null) {
					msgKey.setKeyValue("CUR_NAME", key.getCUR_NAME());
				}
				if(msgKeyType.containsKeyColumn("CUR_UNIT") && key.getCUR_UNIT() != null) {
					msgKey.setKeyValue("CUR_UNIT", key.getCUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("DECIMAL_FIG") && key.getDECIMAL_FIG() != null) {
					msgKey.setKeyValue("DECIMAL_FIG", key.getDECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("ACPT_NO") && key.getACPT_NO() != null) {
					msgKey.setKeyValue("ACPT_NO", key.getACPT_NO());
				}
				if(msgKeyType.containsKeyColumn("ACPT_QTY") && key.getACPT_QTY() != null) {
					msgKey.setKeyValue("ACPT_QTY", key.getACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("ACPT_DATE") && key.getACPT_DATE() != null) {
					msgKey.setKeyValue("ACPT_DATE", key.getACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("INSPECTED_QTY") && key.getINSPECTED_QTY() != null) {
					msgKey.setKeyValue("INSPECTED_QTY", key.getINSPECTED_QTY());
				}
				if(msgKeyType.containsKeyColumn("ACCEPTED_QTY") && key.getACCEPTED_QTY() != null) {
					msgKey.setKeyValue("ACCEPTED_QTY", key.getACCEPTED_QTY());
				}
				if(msgKeyType.containsKeyColumn("INSPEC_DATE") && key.getINSPEC_DATE() != null) {
					msgKey.setKeyValue("INSPEC_DATE", key.getINSPEC_DATE());
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
				if(msgKeyType.containsKeyColumn("TAX_RATE_1") && key.getTAX_RATE_1() != null) {
					msgKey.setKeyValue("TAX_RATE_1", key.getTAX_RATE_1());
				}
				if(msgKeyType.containsKeyColumn("TAX_RATE_2") && key.getTAX_RATE_2() != null) {
					msgKey.setKeyValue("TAX_RATE_2", key.getTAX_RATE_2());
				}
				if(msgKeyType.containsKeyColumn("TAX_RATE_3") && key.getTAX_RATE_3() != null) {
					msgKey.setKeyValue("TAX_RATE_3", key.getTAX_RATE_3());
				}
				if(msgKeyType.containsKeyColumn("AMOUNT_INCLUDE_TAX") && key.getAMOUNT_INCLUDE_TAX() != null) {
					msgKey.setKeyValue("AMOUNT_INCLUDE_TAX", key.getAMOUNT_INCLUDE_TAX());
				}
				if(msgKeyType.containsKeyColumn("HOME_CUR_AMOUNT") && key.getHOME_CUR_AMOUNT() != null) {
					msgKey.setKeyValue("HOME_CUR_AMOUNT", key.getHOME_CUR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP") && key.getTAX_ROUND_TYP() != null) {
					msgKey.setKeyValue("TAX_ROUND_TYP", key.getTAX_ROUND_TYP());
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
				if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD") && key.getWORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("WORK_IN_PROC_CD", key.getWORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
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
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_QTY") && key.getINSPC_ACPT_QTY() != null) {
					msgKey.setKeyValue("INSPC_ACPT_QTY", key.getINSPC_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_AMOUNT") && key.getINSPC_ACPT_AMOUNT() != null) {
					msgKey.setKeyValue("INSPC_ACPT_AMOUNT", key.getINSPC_ACPT_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("SAVING_AMOUNT") && key.getSAVING_AMOUNT() != null) {
					msgKey.setKeyValue("SAVING_AMOUNT", key.getSAVING_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_DATE") && key.getINSPC_ACPT_DATE() != null) {
					msgKey.setKeyValue("INSPC_ACPT_DATE", key.getINSPC_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("PRODUCT_TYP") && key.getPRODUCT_TYP() != null) {
					msgKey.setKeyValue("PRODUCT_TYP", key.getPRODUCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("DLV_CD") && key.getDLV_CD() != null) {
					msgKey.setKeyValue("DLV_CD", key.getDLV_CD());
				}
				if(msgKeyType.containsKeyColumn("DISC_AMOUNT") && key.getDISC_AMOUNT() != null) {
					msgKey.setKeyValue("DISC_AMOUNT", key.getDISC_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("GNR_ORG_CD") && key.getGNR_ORG_CD() != null) {
					msgKey.setKeyValue("GNR_ORG_CD", key.getGNR_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("SBCNT_PUCH_TYP") && key.getSBCNT_PUCH_TYP() != null) {
					msgKey.setKeyValue("SBCNT_PUCH_TYP", key.getSBCNT_PUCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO") && key.getJOB_ODR_DETAIL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_DETAIL_NO", key.getJOB_ODR_DETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("CLASIFICATION_CD") && key.getCLASIFICATION_CD() != null) {
					msgKey.setKeyValue("CLASIFICATION_CD", key.getCLASIFICATION_CD());
				}
				if(msgKeyType.containsKeyColumn("INV_CTRL_FLG") && key.getINV_CTRL_FLG() != null) {
					msgKey.setKeyValue("INV_CTRL_FLG", key.getINV_CTRL_FLG());
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
				if(msgKeyType.containsKeyColumn("RESERVE_CAUSE") && key.getRESERVE_CAUSE() != null) {
					msgKey.setKeyValue("RESERVE_CAUSE", key.getRESERVE_CAUSE());
				}
				if(msgKeyType.containsKeyColumn("SLIP_CTRL_GRP") && key.getSLIP_CTRL_GRP() != null) {
					msgKey.setKeyValue("SLIP_CTRL_GRP", key.getSLIP_CTRL_GRP());
				}
				if(msgKeyType.containsKeyColumn("SLIP_DATE") && key.getSLIP_DATE() != null) {
					msgKey.setKeyValue("SLIP_DATE", key.getSLIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("SLIP_CD") && key.getSLIP_CD() != null) {
					msgKey.setKeyValue("SLIP_CD", key.getSLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("SEQ_NO") && key.getSEQ_NO() != null) {
					msgKey.setKeyValue("SEQ_NO", key.getSEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("NET_AMOUNT_YEN") && key.getNET_AMOUNT_YEN() != null) {
					msgKey.setKeyValue("NET_AMOUNT_YEN", key.getNET_AMOUNT_YEN());
				}
				if(msgKeyType.containsKeyColumn("AMOUNT") && key.getAMOUNT() != null) {
					msgKey.setKeyValue("AMOUNT", key.getAMOUNT());
				}
				if(msgKeyType.containsKeyColumn("TAX_TYP") && key.getTAX_TYP() != null) {
					msgKey.setKeyValue("TAX_TYP", key.getTAX_TYP());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT") && key.getTAX_AMOUNT() != null) {
					msgKey.setKeyValue("TAX_AMOUNT", key.getTAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("GROSS_AMOUNT") && key.getGROSS_AMOUNT() != null) {
					msgKey.setKeyValue("GROSS_AMOUNT", key.getGROSS_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT_YEN") && key.getTAX_AMOUNT_YEN() != null) {
					msgKey.setKeyValue("TAX_AMOUNT_YEN", key.getTAX_AMOUNT_YEN());
				}
				if(msgKeyType.containsKeyColumn("GROSS_AMOUNT_YEN") && key.getGROSS_AMOUNT_YEN() != null) {
					msgKey.setKeyValue("GROSS_AMOUNT_YEN", key.getGROSS_AMOUNT_YEN());
				}
				if(msgKeyType.containsKeyColumn("SUM_TAX_AMOUNT") && key.getSUM_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("SUM_TAX_AMOUNT", key.getSUM_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("SUM_GROSS_AMOUNT") && key.getSUM_GROSS_AMOUNT() != null) {
					msgKey.setKeyValue("SUM_GROSS_AMOUNT", key.getSUM_GROSS_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("SUM_NET_AMOUNT") && key.getSUM_NET_AMOUNT() != null) {
					msgKey.setKeyValue("SUM_NET_AMOUNT", key.getSUM_NET_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("TAX_TOTAL") && key.getTAX_TOTAL() != null) {
					msgKey.setKeyValue("TAX_TOTAL", key.getTAX_TOTAL());
				}
				if(msgKeyType.containsKeyColumn("GROSS_TOTAL") && key.getGROSS_TOTAL() != null) {
					msgKey.setKeyValue("GROSS_TOTAL", key.getGROSS_TOTAL());
				}
				if(msgKeyType.containsKeyColumn("NET_TOTAL") && key.getNET_TOTAL() != null) {
					msgKey.setKeyValue("NET_TOTAL", key.getNET_TOTAL());
				}
				if(msgKeyType.containsKeyColumn("LINE_NO") && key.getLINE_NO() != null) {
					msgKey.setKeyValue("LINE_NO", key.getLINE_NO());
				}
				if(msgKeyType.containsKeyColumn("LINE_TYP") && key.getLINE_TYP() != null) {
					msgKey.setKeyValue("LINE_TYP", key.getLINE_TYP());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT_CTRL_FLG") && key.getTAX_AMOUNT_CTRL_FLG() != null) {
					msgKey.setKeyValue("TAX_AMOUNT_CTRL_FLG", key.getTAX_AMOUNT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_YEN") && key.getUNIT_COST_YEN() != null) {
					msgKey.setKeyValue("UNIT_COST_YEN", key.getUNIT_COST_YEN());
				}
				if(msgKeyType.containsKeyColumn("PROCESSING_COST_YEN") && key.getPROCESSING_COST_YEN() != null) {
					msgKey.setKeyValue("PROCESSING_COST_YEN", key.getPROCESSING_COST_YEN());
				}
				if(msgKeyType.containsKeyColumn("MATERIAL_COST_YEN") && key.getMATERIAL_COST_YEN() != null) {
					msgKey.setKeyValue("MATERIAL_COST_YEN", key.getMATERIAL_COST_YEN());
				}
				if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS_YEN") && key.getOTHER_OVERHEADS_YEN() != null) {
					msgKey.setKeyValue("OTHER_OVERHEADS_YEN", key.getOTHER_OVERHEADS_YEN());
				}
				if(msgKeyType.containsKeyColumn("DR_ACCT_CD") && key.getDR_ACCT_CD() != null) {
					msgKey.setKeyValue("DR_ACCT_CD", key.getDR_ACCT_CD());
				}
				if(msgKeyType.containsKeyColumn("DR_SUB_ACCT_CD") && key.getDR_SUB_ACCT_CD() != null) {
					msgKey.setKeyValue("DR_SUB_ACCT_CD", key.getDR_SUB_ACCT_CD());
				}
				if(msgKeyType.containsKeyColumn("DR_ORG_CD") && key.getDR_ORG_CD() != null) {
					msgKey.setKeyValue("DR_ORG_CD", key.getDR_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("CR_ACCT_CD") && key.getCR_ACCT_CD() != null) {
					msgKey.setKeyValue("CR_ACCT_CD", key.getCR_ACCT_CD());
				}
				if(msgKeyType.containsKeyColumn("CR_SUB_ACCT_CD") && key.getCR_SUB_ACCT_CD() != null) {
					msgKey.setKeyValue("CR_SUB_ACCT_CD", key.getCR_SUB_ACCT_CD());
				}
				if(msgKeyType.containsKeyColumn("CR_ORG_CD") && key.getCR_ORG_CD() != null) {
					msgKey.setKeyValue("CR_ORG_CD", key.getCR_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("FIXED_ASSETS_CD") && key.getFIXED_ASSETS_CD() != null) {
					msgKey.setKeyValue("FIXED_ASSETS_CD", key.getFIXED_ASSETS_CD());
				}
				if(msgKeyType.containsKeyColumn("SUB_FIXED_ASSETS_CD") && key.getSUB_FIXED_ASSETS_CD() != null) {
					msgKey.setKeyValue("SUB_FIXED_ASSETS_CD", key.getSUB_FIXED_ASSETS_CD());
				}
				if(msgKeyType.containsKeyColumn("DETAIL_NO") && key.getDETAIL_NO() != null) {
					msgKey.setKeyValue("DETAIL_NO", key.getDETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("COMM_PUCH_ODR_LINE_NO") && key.getCOMM_PUCH_ODR_LINE_NO() != null) {
					msgKey.setKeyValue("COMM_PUCH_ODR_LINE_NO", key.getCOMM_PUCH_ODR_LINE_NO());
				}
				if(msgKeyType.containsKeyColumn("ARV_RSLT_LINE_NO") && key.getARV_RSLT_LINE_NO() != null) {
					msgKey.setKeyValue("ARV_RSLT_LINE_NO", key.getARV_RSLT_LINE_NO());
				}
				if(msgKeyType.containsKeyColumn("STOCK_CTRL_FLG") && key.getSTOCK_CTRL_FLG() != null) {
					msgKey.setKeyValue("STOCK_CTRL_FLG", key.getSTOCK_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("REMARKS") && key.getREMARKS() != null) {
					msgKey.setKeyValue("REMARKS", key.getREMARKS());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_CRCT_TYP") && key.getINSPC_ACPT_CRCT_TYP() != null) {
					msgKey.setKeyValue("INSPC_ACPT_CRCT_TYP", key.getINSPC_ACPT_CRCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("ORGN_SLIP_CTRL_GRP") && key.getORGN_SLIP_CTRL_GRP() != null) {
					msgKey.setKeyValue("ORGN_SLIP_CTRL_GRP", key.getORGN_SLIP_CTRL_GRP());
				}
				if(msgKeyType.containsKeyColumn("ORGN_SLIP_CD") && key.getORGN_SLIP_CD() != null) {
					msgKey.setKeyValue("ORGN_SLIP_CD", key.getORGN_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("ORGN_SLIP_DATE") && key.getORGN_SLIP_DATE() != null) {
					msgKey.setKeyValue("ORGN_SLIP_DATE", key.getORGN_SLIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("SLIP_TRN_CD") && key.getSLIP_TRN_CD() != null) {
					msgKey.setKeyValue("SLIP_TRN_CD", key.getSLIP_TRN_CD());
				}
				if(msgKeyType.containsKeyColumn("STOCK_CLASS_CD") && key.getSTOCK_CLASS_CD() != null) {
					msgKey.setKeyValue("STOCK_CLASS_CD", key.getSTOCK_CLASS_CD());
				}
				if(msgKeyType.containsKeyColumn("BALANCE_CLASS_CD") && key.getBALANCE_CLASS_CD() != null) {
					msgKey.setKeyValue("BALANCE_CLASS_CD", key.getBALANCE_CLASS_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_ORG_CD") && key.getPUCH_ODR_ORG_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_ORG_CD", key.getPUCH_ODR_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON_CD") && key.getPUCH_ODR_PERSON_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_PERSON_CD", key.getPUCH_ODR_PERSON_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("SHIP_WH_CD") && key.getSHIP_WH_CD() != null) {
					msgKey.setKeyValue("SHIP_WH_CD", key.getSHIP_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("PAYEE_CD") && key.getPAYEE_CD() != null) {
					msgKey.setKeyValue("PAYEE_CD", key.getPAYEE_CD());
				}
				if(msgKeyType.containsKeyColumn("SLIP_CTRL_ORG_CD") && key.getSLIP_CTRL_ORG_CD() != null) {
					msgKey.setKeyValue("SLIP_CTRL_ORG_CD", key.getSLIP_CTRL_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("CLOSING_CTRL_ORG_CD") && key.getCLOSING_CTRL_ORG_CD() != null) {
					msgKey.setKeyValue("CLOSING_CTRL_ORG_CD", key.getCLOSING_CTRL_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("PAY_CALC_CTRL_ORG_CD") && key.getPAY_CALC_CTRL_ORG_CD() != null) {
					msgKey.setKeyValue("PAY_CALC_CTRL_ORG_CD", key.getPAY_CALC_CTRL_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("PAY_FIX_CTRL_ORG_CD") && key.getPAY_FIX_CTRL_ORG_CD() != null) {
					msgKey.setKeyValue("PAY_FIX_CTRL_ORG_CD", key.getPAY_FIX_CTRL_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("EXPL_TYP") && key.getEXPL_TYP() != null) {
					msgKey.setKeyValue("EXPL_TYP", key.getEXPL_TYP());
				}
				if(msgKeyType.containsKeyColumn("EXPL_CD") && key.getEXPL_CD() != null) {
					msgKey.setKeyValue("EXPL_CD", key.getEXPL_CD());
				}
				if(msgKeyType.containsKeyColumn("EXPL_NAME") && key.getEXPL_NAME() != null) {
					msgKey.setKeyValue("EXPL_NAME", key.getEXPL_NAME());
				}
				if(msgKeyType.containsKeyColumn("ODR_CD") && key.getODR_CD() != null) {
					msgKey.setKeyValue("ODR_CD", key.getODR_CD());
				}
				if(msgKeyType.containsKeyColumn("COMM_PUCH_ODR_SLIP_TYP") && key.getCOMM_PUCH_ODR_SLIP_TYP() != null) {
					msgKey.setKeyValue("COMM_PUCH_ODR_SLIP_TYP", key.getCOMM_PUCH_ODR_SLIP_TYP());
				}
				if(msgKeyType.containsKeyColumn("COMM_PUCH_ODR_SLIP_CTRL_GRP") && key.getCOMM_PUCH_ODR_SLIP_CTRL_GRP() != null) {
					msgKey.setKeyValue("COMM_PUCH_ODR_SLIP_CTRL_GRP", key.getCOMM_PUCH_ODR_SLIP_CTRL_GRP());
				}
				if(msgKeyType.containsKeyColumn("COMM_PUCH_ODR_SLIP_CD") && key.getCOMM_PUCH_ODR_SLIP_CD() != null) {
					msgKey.setKeyValue("COMM_PUCH_ODR_SLIP_CD", key.getCOMM_PUCH_ODR_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("COMM_PUCH_ODR_SLIP_DATE") && key.getCOMM_PUCH_ODR_SLIP_DATE() != null) {
					msgKey.setKeyValue("COMM_PUCH_ODR_SLIP_DATE", key.getCOMM_PUCH_ODR_SLIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("ARV_RSLT_SLIP_TYP") && key.getARV_RSLT_SLIP_TYP() != null) {
					msgKey.setKeyValue("ARV_RSLT_SLIP_TYP", key.getARV_RSLT_SLIP_TYP());
				}
				if(msgKeyType.containsKeyColumn("ARV_RSLT_SLIP_CTRL_GRP") && key.getARV_RSLT_SLIP_CTRL_GRP() != null) {
					msgKey.setKeyValue("ARV_RSLT_SLIP_CTRL_GRP", key.getARV_RSLT_SLIP_CTRL_GRP());
				}
				if(msgKeyType.containsKeyColumn("ARV_RSLT_SLIP_CD") && key.getARV_RSLT_SLIP_CD() != null) {
					msgKey.setKeyValue("ARV_RSLT_SLIP_CD", key.getARV_RSLT_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("ARV_RSLT_SLIP_DATE") && key.getARV_RSLT_SLIP_DATE() != null) {
					msgKey.setKeyValue("ARV_RSLT_SLIP_DATE", key.getARV_RSLT_SLIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("PUCH_RSLT_SLIP_ID") && key.getPUCH_RSLT_SLIP_ID() != null) {
					msgKey.setKeyValue("PUCH_RSLT_SLIP_ID", key.getPUCH_RSLT_SLIP_ID());
				}
				if(msgKeyType.containsKeyColumn("TAX_CALC_TYP") && key.getTAX_CALC_TYP() != null) {
					msgKey.setKeyValue("TAX_CALC_TYP", key.getTAX_CALC_TYP());
				}
				if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP") && key.getTAX_APPLY_TYP() != null) {
					msgKey.setKeyValue("TAX_APPLY_TYP", key.getTAX_APPLY_TYP());
				}
				if(msgKeyType.containsKeyColumn("TEMP_UNIT_COST_PUCH_RSLT_FLG") && key.getTEMP_UNIT_COST_PUCH_RSLT_FLG() != null) {
					msgKey.setKeyValue("TEMP_UNIT_COST_PUCH_RSLT_FLG", key.getTEMP_UNIT_COST_PUCH_RSLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_ZERO_INSPC_ACPT_FLG") && key.getUNIT_COST_ZERO_INSPC_ACPT_FLG() != null) {
					msgKey.setKeyValue("UNIT_COST_ZERO_INSPC_ACPT_FLG", key.getUNIT_COST_ZERO_INSPC_ACPT_FLG());
				}
				if(msgKeyType.containsKeyColumn("IMPORT_TRN_TYP") && key.getIMPORT_TRN_TYP() != null) {
					msgKey.setKeyValue("IMPORT_TRN_TYP", key.getIMPORT_TRN_TYP());
				}
				if(msgKeyType.containsKeyColumn("PAY_CYCLE_TYP") && key.getPAY_CYCLE_TYP() != null) {
					msgKey.setKeyValue("PAY_CYCLE_TYP", key.getPAY_CYCLE_TYP());
				}
				if(msgKeyType.containsKeyColumn("DEADLINE_DATE") && key.getDEADLINE_DATE() != null) {
					msgKey.setKeyValue("DEADLINE_DATE", key.getDEADLINE_DATE());
				}
				if(msgKeyType.containsKeyColumn("PAY_SCH_DATE") && key.getPAY_SCH_DATE() != null) {
					msgKey.setKeyValue("PAY_SCH_DATE", key.getPAY_SCH_DATE());
				}
				if(msgKeyType.containsKeyColumn("PAY_PATTERN_CD") && key.getPAY_PATTERN_CD() != null) {
					msgKey.setKeyValue("PAY_PATTERN_CD", key.getPAY_PATTERN_CD());
				}
				if(msgKeyType.containsKeyColumn("EXCH_RSRV_CD") && key.getEXCH_RSRV_CD() != null) {
					msgKey.setKeyValue("EXCH_RSRV_CD", key.getEXCH_RSRV_CD());
				}
				if(msgKeyType.containsKeyColumn("EXCH_DATE") && key.getEXCH_DATE() != null) {
					msgKey.setKeyValue("EXCH_DATE", key.getEXCH_DATE());
				}
				if(msgKeyType.containsKeyColumn("PUR_RSLT_SLIP_ISSUE_FLG") && key.getPUR_RSLT_SLIP_ISSUE_FLG() != null) {
					msgKey.setKeyValue("PUR_RSLT_SLIP_ISSUE_FLG", key.getPUR_RSLT_SLIP_ISSUE_FLG());
				}
				if(msgKeyType.containsKeyColumn("PUR_RSLT_REP_ISSUE_FLG") && key.getPUR_RSLT_REP_ISSUE_FLG() != null) {
					msgKey.setKeyValue("PUR_RSLT_REP_ISSUE_FLG", key.getPUR_RSLT_REP_ISSUE_FLG());
				}
				if(msgKeyType.containsKeyColumn("ACPT_ARV_MODIFICATION_FLG") && key.getACPT_ARV_MODIFICATION_FLG() != null) {
					msgKey.setKeyValue("ACPT_ARV_MODIFICATION_FLG", key.getACPT_ARV_MODIFICATION_FLG());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_MODIFICATION_FLG") && key.getINSPC_ACPT_MODIFICATION_FLG() != null) {
					msgKey.setKeyValue("INSPC_ACPT_MODIFICATION_FLG", key.getINSPC_ACPT_MODIFICATION_FLG());
				}
				if(msgKeyType.containsKeyColumn("STATUS") && key.getSTATUS() != null) {
					msgKey.setKeyValue("STATUS", key.getSTATUS());
				}
				if(msgKeyType.containsKeyColumn("CRCT_FLG") && key.getCRCT_FLG() != null) {
					msgKey.setKeyValue("CRCT_FLG", key.getCRCT_FLG());
				}
				if(msgKeyType.containsKeyColumn("APPROVAL_DATE") && key.getAPPROVAL_DATE() != null) {
					msgKey.setKeyValue("APPROVAL_DATE", key.getAPPROVAL_DATE());
				}
				if(msgKeyType.containsKeyColumn("APPROVAL_CD") && key.getAPPROVAL_CD() != null) {
					msgKey.setKeyValue("APPROVAL_CD", key.getAPPROVAL_CD());
				}
				if(msgKeyType.containsKeyColumn("APPROVAL_RSRV_DATE") && key.getAPPROVAL_RSRV_DATE() != null) {
					msgKey.setKeyValue("APPROVAL_RSRV_DATE", key.getAPPROVAL_RSRV_DATE());
				}
				if(msgKeyType.containsKeyColumn("APPROVAL_RSRV_CD") && key.getAPPROVAL_RSRV_CD() != null) {
					msgKey.setKeyValue("APPROVAL_RSRV_CD", key.getAPPROVAL_RSRV_CD());
				}
				if(msgKeyType.containsKeyColumn("RSN_CD") && key.getRSN_CD() != null) {
					msgKey.setKeyValue("RSN_CD", key.getRSN_CD());
				}
				if(msgKeyType.containsKeyColumn("RECORDING_DATE") && key.getRECORDING_DATE() != null) {
					msgKey.setKeyValue("RECORDING_DATE", key.getRECORDING_DATE());
				}
				if(msgKeyType.containsKeyColumn("RECORDING_MONTH") && key.getRECORDING_MONTH() != null) {
					msgKey.setKeyValue("RECORDING_MONTH", key.getRECORDING_MONTH());
				}
				if(msgKeyType.containsKeyColumn("ORGN_RECORDING_DATE") && key.getORGN_RECORDING_DATE() != null) {
					msgKey.setKeyValue("ORGN_RECORDING_DATE", key.getORGN_RECORDING_DATE());
				}
				if(msgKeyType.containsKeyColumn("ORGN_RECORDING_MONTH") && key.getORGN_RECORDING_MONTH() != null) {
					msgKey.setKeyValue("ORGN_RECORDING_MONTH", key.getORGN_RECORDING_MONTH());
				}
				if(msgKeyType.containsKeyColumn("RECORDING_PROC_DATE") && key.getRECORDING_PROC_DATE() != null) {
					msgKey.setKeyValue("RECORDING_PROC_DATE", key.getRECORDING_PROC_DATE());
				}
				if(msgKeyType.containsKeyColumn("RECORDING_PROC_CD") && key.getRECORDING_PROC_CD() != null) {
					msgKey.setKeyValue("RECORDING_PROC_CD", key.getRECORDING_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("CLOSING_RSRV_DATE") && key.getCLOSING_RSRV_DATE() != null) {
					msgKey.setKeyValue("CLOSING_RSRV_DATE", key.getCLOSING_RSRV_DATE());
				}
				if(msgKeyType.containsKeyColumn("CLOSING_RSRV_CD") && key.getCLOSING_RSRV_CD() != null) {
					msgKey.setKeyValue("CLOSING_RSRV_CD", key.getCLOSING_RSRV_CD());
				}
				if(msgKeyType.containsKeyColumn("CLOSING_DATE") && key.getCLOSING_DATE() != null) {
					msgKey.setKeyValue("CLOSING_DATE", key.getCLOSING_DATE());
				}
				if(msgKeyType.containsKeyColumn("CLOSING_CD") && key.getCLOSING_CD() != null) {
					msgKey.setKeyValue("CLOSING_CD", key.getCLOSING_CD());
				}
				if(msgKeyType.containsKeyColumn("PAY_FIX_DATE") && key.getPAY_FIX_DATE() != null) {
					msgKey.setKeyValue("PAY_FIX_DATE", key.getPAY_FIX_DATE());
				}
				if(msgKeyType.containsKeyColumn("PAY_FIX_CD") && key.getPAY_FIX_CD() != null) {
					msgKey.setKeyValue("PAY_FIX_CD", key.getPAY_FIX_CD());
				}
				if(msgKeyType.containsKeyColumn("DEBT_BALANCE_OUT_FLG") && key.getDEBT_BALANCE_OUT_FLG() != null) {
					msgKey.setKeyValue("DEBT_BALANCE_OUT_FLG", key.getDEBT_BALANCE_OUT_FLG());
				}
				if(msgKeyType.containsKeyColumn("DEBT_BALANCE_OUT_DATE") && key.getDEBT_BALANCE_OUT_DATE() != null) {
					msgKey.setKeyValue("DEBT_BALANCE_OUT_DATE", key.getDEBT_BALANCE_OUT_DATE());
				}
				if(msgKeyType.containsKeyColumn("MONTH") && key.getMONTH() != null) {
					msgKey.setKeyValue("MONTH", key.getMONTH());
				}
				if(msgKeyType.containsKeyColumn("ACCT_CD") && key.getACCT_CD() != null) {
					msgKey.setKeyValue("ACCT_CD", key.getACCT_CD());
				}
				if(msgKeyType.containsKeyColumn("SUB_ACCT_CD") && key.getSUB_ACCT_CD() != null) {
					msgKey.setKeyValue("SUB_ACCT_CD", key.getSUB_ACCT_CD());
				}
				if(msgKeyType.containsKeyColumn("ORG_CD") && key.getORG_CD() != null) {
					msgKey.setKeyValue("ORG_CD", key.getORG_CD());
				}
				if(msgKeyType.containsKeyColumn("DATA_TYP") && key.getDATA_TYP() != null) {
					msgKey.setKeyValue("DATA_TYP", key.getDATA_TYP());
				}
				if(msgKeyType.containsKeyColumn("GL_IF_OUT_FLG") && key.getGL_IF_OUT_FLG() != null) {
					msgKey.setKeyValue("GL_IF_OUT_FLG", key.getGL_IF_OUT_FLG());
				}
				if(msgKeyType.containsKeyColumn("BALANCE_UPD_FLG") && key.getBALANCE_UPD_FLG() != null) {
					msgKey.setKeyValue("BALANCE_UPD_FLG", key.getBALANCE_UPD_FLG());
				}
				if(msgKeyType.containsKeyColumn("BALANCE_UPD_DATE") && key.getBALANCE_UPD_DATE() != null) {
					msgKey.setKeyValue("BALANCE_UPD_DATE", key.getBALANCE_UPD_DATE());
				}
				if(msgKeyType.containsKeyColumn("RECORDING_AMOUNT") && key.getRECORDING_AMOUNT() != null) {
					msgKey.setKeyValue("RECORDING_AMOUNT", key.getRECORDING_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("DEBT_AMOUNT") && key.getDEBT_AMOUNT() != null) {
					msgKey.setKeyValue("DEBT_AMOUNT", key.getDEBT_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("REBATE_AMOUNT") && key.getREBATE_AMOUNT() != null) {
					msgKey.setKeyValue("REBATE_AMOUNT", key.getREBATE_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("RETURNED_GOODS_AMOUNT") && key.getRETURNED_GOODS_AMOUNT() != null) {
					msgKey.setKeyValue("RETURNED_GOODS_AMOUNT", key.getRETURNED_GOODS_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("RECORDING_AMOUNT_YEN") && key.getRECORDING_AMOUNT_YEN() != null) {
					msgKey.setKeyValue("RECORDING_AMOUNT_YEN", key.getRECORDING_AMOUNT_YEN());
				}
				if(msgKeyType.containsKeyColumn("DEBT_AMOUNT_YEN") && key.getDEBT_AMOUNT_YEN() != null) {
					msgKey.setKeyValue("DEBT_AMOUNT_YEN", key.getDEBT_AMOUNT_YEN());
				}
				if(msgKeyType.containsKeyColumn("SAVING_AMOUNT_YEN") && key.getSAVING_AMOUNT_YEN() != null) {
					msgKey.setKeyValue("SAVING_AMOUNT_YEN", key.getSAVING_AMOUNT_YEN());
				}
				if(msgKeyType.containsKeyColumn("REBATE_AMOUNT_YEN") && key.getREBATE_AMOUNT_YEN() != null) {
					msgKey.setKeyValue("REBATE_AMOUNT_YEN", key.getREBATE_AMOUNT_YEN());
				}
				if(msgKeyType.containsKeyColumn("RETURNED_GOODS_AMOUNT_YEN") && key.getRETURNED_GOODS_AMOUNT_YEN() != null) {
					msgKey.setKeyValue("RETURNED_GOODS_AMOUNT_YEN", key.getRETURNED_GOODS_AMOUNT_YEN());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_AMOUNT_YEN") && key.getINSPC_ACPT_AMOUNT_YEN() != null) {
					msgKey.setKeyValue("INSPC_ACPT_AMOUNT_YEN", key.getINSPC_ACPT_AMOUNT_YEN());
				}
				if(msgKeyType.containsKeyColumn("EXCH_DIFF_AMOUNT_YEN") && key.getEXCH_DIFF_AMOUNT_YEN() != null) {
					msgKey.setKeyValue("EXCH_DIFF_AMOUNT_YEN", key.getEXCH_DIFF_AMOUNT_YEN());
				}
				if(msgKeyType.containsKeyColumn("OPTION_ID") && key.getOPTION_ID() != null) {
					msgKey.setKeyValue("OPTION_ID", key.getOPTION_ID());
				}
				if(msgKeyType.containsKeyColumn("OWN_CUR_CD") && key.getOWN_CUR_CD() != null) {
					msgKey.setKeyValue("OWN_CUR_CD", key.getOWN_CUR_CD());
				}
				if(msgKeyType.containsKeyColumn("THIS_MONTH") && key.getTHIS_MONTH() != null) {
					msgKey.setKeyValue("THIS_MONTH", key.getTHIS_MONTH());
				}
				if(msgKeyType.containsKeyColumn("HOME_DECIMAL_FIG") && key.getHOME_DECIMAL_FIG() != null) {
					msgKey.setKeyValue("HOME_DECIMAL_FIG", key.getHOME_DECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("HOME_CUR_CD") && key.getHOME_CUR_CD() != null) {
					msgKey.setKeyValue("HOME_CUR_CD", key.getHOME_CUR_CD());
				}
				if(msgKeyType.containsKeyColumn("TIME_CTRL") && key.getTIME_CTRL() != null) {
					msgKey.setKeyValue("TIME_CTRL", key.getTIME_CTRL());
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
					AE0170010Struct key = new AE0170010Struct();
					if(msgKeyType.containsKeyColumn("c_NON_NO_ITEM_FLG")) {
						key.setc_NON_NO_ITEM_FLG(msgKey.getKeyValue("c_NON_NO_ITEM_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_TIME")) {
						key.setPUCH_ODR_DLV_TIME(msgKey.getKeyValue("PUCH_ODR_DLV_TIME"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_START_TIME")) {
						key.setPUCH_ODR_START_TIME(msgKey.getKeyValue("PUCH_ODR_START_TIME"));
					}
					if(msgKeyType.containsKeyColumn("l_STATUS")) {
						key.setl_STATUS(msgKey.getKeyValue("l_STATUS"));
					}
					if(msgKeyType.containsKeyColumn("l_ACPT_NO")) {
						key.setl_ACPT_NO(msgKey.getKeyValue("l_ACPT_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ACPT_QTY")) {
						key.setl_ACPT_QTY(msgKey.getKeyValue("l_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ACPT_DATE")) {
						key.setl_ACPT_DATE(msgKey.getKeyValue("l_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_COST")) {
						key.setl_UNIT_COST(msgKey.getKeyValue("l_UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_COST_TYP")) {
						key.setl_UNIT_COST_TYP(msgKey.getKeyValue("l_UNIT_COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_AMOUNT")) {
						key.setl_PUCH_ODR_AMOUNT(msgKey.getKeyValue("l_PUCH_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_INSPECTED_QTY")) {
						key.setl_INSPECTED_QTY(msgKey.getKeyValue("l_INSPECTED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ACCEPTED_QTY")) {
						key.setl_ACCEPTED_QTY(msgKey.getKeyValue("l_ACCEPTED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_INSPEC_DATE")) {
						key.setl_INSPEC_DATE(msgKey.getKeyValue("l_INSPEC_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_NET_AMOUNT")) {
						key.seth_NET_AMOUNT(msgKey.getKeyValue("h_NET_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("h_TAX_AMOUNT_1")) {
						key.seth_TAX_AMOUNT_1(msgKey.getKeyValue("h_TAX_AMOUNT_1"));
					}
					if(msgKeyType.containsKeyColumn("h_TAX_AMOUNT_2")) {
						key.seth_TAX_AMOUNT_2(msgKey.getKeyValue("h_TAX_AMOUNT_2"));
					}
					if(msgKeyType.containsKeyColumn("h_TAX_AMOUNT_3")) {
						key.seth_TAX_AMOUNT_3(msgKey.getKeyValue("h_TAX_AMOUNT_3"));
					}
					if(msgKeyType.containsKeyColumn("h_DECIMAL_FIG")) {
						key.seth_DECIMAL_FIG(msgKey.getKeyValue("h_DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("h_ROUND_TYP")) {
						key.seth_ROUND_TYP(msgKey.getKeyValue("h_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_PUCH_ODR_STS_TYP")) {
						key.seth_PUCH_ODR_STS_TYP(msgKey.getKeyValue("h_PUCH_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_PUCH_ODR_INST_SLIP_ISS_FLG")) {
						key.seth_PUCH_ODR_INST_SLIP_ISS_FLG(msgKey.getKeyValue("h_PUCH_ODR_INST_SLIP_ISS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_CANCEL_SLIP_ISS_FLG")) {
						key.seth_ODR_CANCEL_SLIP_ISS_FLG(msgKey.getKeyValue("h_ODR_CANCEL_SLIP_ISS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_INSPC_CMPLT_FLG")) {
						key.seth_INSPC_CMPLT_FLG(msgKey.getKeyValue("h_INSPC_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_ACPT_INSPC_TYP")) {
						key.seth_ACPT_INSPC_TYP(msgKey.getKeyValue("h_ACPT_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_NET_AMOUNT_LIST")) {
						key.seth_NET_AMOUNT_LIST(msgKey.getKeyValue("h_NET_AMOUNT_LIST"));
					}
					if(msgKeyType.containsKeyColumn("h_TAX_AMOUNT_1_LIST")) {
						key.seth_TAX_AMOUNT_1_LIST(msgKey.getKeyValue("h_TAX_AMOUNT_1_LIST"));
					}
					if(msgKeyType.containsKeyColumn("h_TAX_AMOUNT_2_LIST")) {
						key.seth_TAX_AMOUNT_2_LIST(msgKey.getKeyValue("h_TAX_AMOUNT_2_LIST"));
					}
					if(msgKeyType.containsKeyColumn("h_TAX_AMOUNT_3_LIST")) {
						key.seth_TAX_AMOUNT_3_LIST(msgKey.getKeyValue("h_TAX_AMOUNT_3_LIST"));
					}
					if(msgKeyType.containsKeyColumn("h_UPDATE_FLG")) {
						key.seth_UPDATE_FLG(msgKey.getKeyValue("h_UPDATE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT")) {
						key.seth_MODIFY_COUNT(msgKey.getKeyValue("h_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT_LIST")) {
						key.seth_MODIFY_COUNT_LIST(msgKey.getKeyValue("h_MODIFY_COUNT_LIST"));
					}
					if(msgKeyType.containsKeyColumn("h_EXCH_RATE")) {
						key.seth_EXCH_RATE(msgKey.getKeyValue("h_EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("h_EXCH_RATE_LIST")) {
						key.seth_EXCH_RATE_LIST(msgKey.getKeyValue("h_EXCH_RATE_LIST"));
					}
					if(msgKeyType.containsKeyColumn("h_TAX_CD")) {
						key.seth_TAX_CD(msgKey.getKeyValue("h_TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_PUCH_ODR_CD")) {
						key.seth_PUCH_ODR_CD(msgKey.getKeyValue("h_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("NON_NO_ITEM_FLG")) {
						key.setNON_NO_ITEM_FLG(msgKey.getKeyValue("NON_NO_ITEM_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE")) {
						key.setPUCH_ODR_DLV_DATE(msgKey.getKeyValue("PUCH_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD")) {
						key.setTAX_CD(msgKey.getKeyValue("TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE")) {
						key.setPUCH_ODR_START_DATE(msgKey.getKeyValue("PUCH_ODR_START_DATE"));
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
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP")) {
						key.setACPT_INSPC_TYP(msgKey.getKeyValue("ACPT_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_AMOUNT")) {
						key.setPUCH_ODR_AMOUNT(msgKey.getKeyValue("PUCH_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("RATE_JUDGE_DATE")) {
						key.setRATE_JUDGE_DATE(msgKey.getKeyValue("RATE_JUDGE_DATE"));
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
					if(msgKeyType.containsKeyColumn("PUCH_ODR_STS_TYP")) {
						key.setPUCH_ODR_STS_TYP(msgKey.getKeyValue("PUCH_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_INST_SLIP_ISS_FLG")) {
						key.setPUCH_ODR_INST_SLIP_ISS_FLG(msgKey.getKeyValue("PUCH_ODR_INST_SLIP_ISS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ODR_CANCEL_SLIP_ISS_FLG")) {
						key.setODR_CANCEL_SLIP_ISS_FLG(msgKey.getKeyValue("ODR_CANCEL_SLIP_ISS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_CMPLT_FLG")) {
						key.setINSPC_CMPLT_FLG(msgKey.getKeyValue("INSPC_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_RATE")) {
						key.setEXCH_RATE(msgKey.getKeyValue("EXCH_RATE"));
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
					if(msgKeyType.containsKeyColumn("VEND_NAME")) {
						key.setVEND_NAME(msgKey.getKeyValue("VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_APP_TYP")) {
						key.setINSPC_ACPT_APP_TYP(msgKey.getKeyValue("INSPC_ACPT_APP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CUR_CD")) {
						key.setCUR_CD(msgKey.getKeyValue("CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP")) {
						key.setEXCH_TYP(msgKey.getKeyValue("EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ROUND_TYP")) {
						key.setROUND_TYP(msgKey.getKeyValue("ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CUR_NAME")) {
						key.setCUR_NAME(msgKey.getKeyValue("CUR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CUR_UNIT")) {
						key.setCUR_UNIT(msgKey.getKeyValue("CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("DECIMAL_FIG")) {
						key.setDECIMAL_FIG(msgKey.getKeyValue("DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_NO")) {
						key.setACPT_NO(msgKey.getKeyValue("ACPT_NO"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_QTY")) {
						key.setACPT_QTY(msgKey.getKeyValue("ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_DATE")) {
						key.setACPT_DATE(msgKey.getKeyValue("ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("INSPECTED_QTY")) {
						key.setINSPECTED_QTY(msgKey.getKeyValue("INSPECTED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ACCEPTED_QTY")) {
						key.setACCEPTED_QTY(msgKey.getKeyValue("ACCEPTED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("INSPEC_DATE")) {
						key.setINSPEC_DATE(msgKey.getKeyValue("INSPEC_DATE"));
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
					if(msgKeyType.containsKeyColumn("TAX_RATE_1")) {
						key.setTAX_RATE_1(msgKey.getKeyValue("TAX_RATE_1"));
					}
					if(msgKeyType.containsKeyColumn("TAX_RATE_2")) {
						key.setTAX_RATE_2(msgKey.getKeyValue("TAX_RATE_2"));
					}
					if(msgKeyType.containsKeyColumn("TAX_RATE_3")) {
						key.setTAX_RATE_3(msgKey.getKeyValue("TAX_RATE_3"));
					}
					if(msgKeyType.containsKeyColumn("AMOUNT_INCLUDE_TAX")) {
						key.setAMOUNT_INCLUDE_TAX(msgKey.getKeyValue("AMOUNT_INCLUDE_TAX"));
					}
					if(msgKeyType.containsKeyColumn("HOME_CUR_AMOUNT")) {
						key.setHOME_CUR_AMOUNT(msgKey.getKeyValue("HOME_CUR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP")) {
						key.setTAX_ROUND_TYP(msgKey.getKeyValue("TAX_ROUND_TYP"));
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
					if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD")) {
						key.setWORK_IN_PROC_CD(msgKey.getKeyValue("WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
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
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_QTY")) {
						key.setINSPC_ACPT_QTY(msgKey.getKeyValue("INSPC_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_AMOUNT")) {
						key.setINSPC_ACPT_AMOUNT(msgKey.getKeyValue("INSPC_ACPT_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("SAVING_AMOUNT")) {
						key.setSAVING_AMOUNT(msgKey.getKeyValue("SAVING_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_DATE")) {
						key.setINSPC_ACPT_DATE(msgKey.getKeyValue("INSPC_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PRODUCT_TYP")) {
						key.setPRODUCT_TYP(msgKey.getKeyValue("PRODUCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DLV_CD")) {
						key.setDLV_CD(msgKey.getKeyValue("DLV_CD"));
					}
					if(msgKeyType.containsKeyColumn("DISC_AMOUNT")) {
						key.setDISC_AMOUNT(msgKey.getKeyValue("DISC_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("GNR_ORG_CD")) {
						key.setGNR_ORG_CD(msgKey.getKeyValue("GNR_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("SBCNT_PUCH_TYP")) {
						key.setSBCNT_PUCH_TYP(msgKey.getKeyValue("SBCNT_PUCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO")) {
						key.setJOB_ODR_DETAIL_NO(msgKey.getKeyValue("JOB_ODR_DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("CLASIFICATION_CD")) {
						key.setCLASIFICATION_CD(msgKey.getKeyValue("CLASIFICATION_CD"));
					}
					if(msgKeyType.containsKeyColumn("INV_CTRL_FLG")) {
						key.setINV_CTRL_FLG(msgKey.getKeyValue("INV_CTRL_FLG"));
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
					if(msgKeyType.containsKeyColumn("RESERVE_CAUSE")) {
						key.setRESERVE_CAUSE(msgKey.getKeyValue("RESERVE_CAUSE"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_CTRL_GRP")) {
						key.setSLIP_CTRL_GRP(msgKey.getKeyValue("SLIP_CTRL_GRP"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_DATE")) {
						key.setSLIP_DATE(msgKey.getKeyValue("SLIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_CD")) {
						key.setSLIP_CD(msgKey.getKeyValue("SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("SEQ_NO")) {
						key.setSEQ_NO(msgKey.getKeyValue("SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("NET_AMOUNT_YEN")) {
						key.setNET_AMOUNT_YEN(msgKey.getKeyValue("NET_AMOUNT_YEN"));
					}
					if(msgKeyType.containsKeyColumn("AMOUNT")) {
						key.setAMOUNT(msgKey.getKeyValue("AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("TAX_TYP")) {
						key.setTAX_TYP(msgKey.getKeyValue("TAX_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT")) {
						key.setTAX_AMOUNT(msgKey.getKeyValue("TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("GROSS_AMOUNT")) {
						key.setGROSS_AMOUNT(msgKey.getKeyValue("GROSS_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT_YEN")) {
						key.setTAX_AMOUNT_YEN(msgKey.getKeyValue("TAX_AMOUNT_YEN"));
					}
					if(msgKeyType.containsKeyColumn("GROSS_AMOUNT_YEN")) {
						key.setGROSS_AMOUNT_YEN(msgKey.getKeyValue("GROSS_AMOUNT_YEN"));
					}
					if(msgKeyType.containsKeyColumn("SUM_TAX_AMOUNT")) {
						key.setSUM_TAX_AMOUNT(msgKey.getKeyValue("SUM_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("SUM_GROSS_AMOUNT")) {
						key.setSUM_GROSS_AMOUNT(msgKey.getKeyValue("SUM_GROSS_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("SUM_NET_AMOUNT")) {
						key.setSUM_NET_AMOUNT(msgKey.getKeyValue("SUM_NET_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("TAX_TOTAL")) {
						key.setTAX_TOTAL(msgKey.getKeyValue("TAX_TOTAL"));
					}
					if(msgKeyType.containsKeyColumn("GROSS_TOTAL")) {
						key.setGROSS_TOTAL(msgKey.getKeyValue("GROSS_TOTAL"));
					}
					if(msgKeyType.containsKeyColumn("NET_TOTAL")) {
						key.setNET_TOTAL(msgKey.getKeyValue("NET_TOTAL"));
					}
					if(msgKeyType.containsKeyColumn("LINE_NO")) {
						key.setLINE_NO(msgKey.getKeyValue("LINE_NO"));
					}
					if(msgKeyType.containsKeyColumn("LINE_TYP")) {
						key.setLINE_TYP(msgKey.getKeyValue("LINE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT_CTRL_FLG")) {
						key.setTAX_AMOUNT_CTRL_FLG(msgKey.getKeyValue("TAX_AMOUNT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_YEN")) {
						key.setUNIT_COST_YEN(msgKey.getKeyValue("UNIT_COST_YEN"));
					}
					if(msgKeyType.containsKeyColumn("PROCESSING_COST_YEN")) {
						key.setPROCESSING_COST_YEN(msgKey.getKeyValue("PROCESSING_COST_YEN"));
					}
					if(msgKeyType.containsKeyColumn("MATERIAL_COST_YEN")) {
						key.setMATERIAL_COST_YEN(msgKey.getKeyValue("MATERIAL_COST_YEN"));
					}
					if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS_YEN")) {
						key.setOTHER_OVERHEADS_YEN(msgKey.getKeyValue("OTHER_OVERHEADS_YEN"));
					}
					if(msgKeyType.containsKeyColumn("DR_ACCT_CD")) {
						key.setDR_ACCT_CD(msgKey.getKeyValue("DR_ACCT_CD"));
					}
					if(msgKeyType.containsKeyColumn("DR_SUB_ACCT_CD")) {
						key.setDR_SUB_ACCT_CD(msgKey.getKeyValue("DR_SUB_ACCT_CD"));
					}
					if(msgKeyType.containsKeyColumn("DR_ORG_CD")) {
						key.setDR_ORG_CD(msgKey.getKeyValue("DR_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("CR_ACCT_CD")) {
						key.setCR_ACCT_CD(msgKey.getKeyValue("CR_ACCT_CD"));
					}
					if(msgKeyType.containsKeyColumn("CR_SUB_ACCT_CD")) {
						key.setCR_SUB_ACCT_CD(msgKey.getKeyValue("CR_SUB_ACCT_CD"));
					}
					if(msgKeyType.containsKeyColumn("CR_ORG_CD")) {
						key.setCR_ORG_CD(msgKey.getKeyValue("CR_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("FIXED_ASSETS_CD")) {
						key.setFIXED_ASSETS_CD(msgKey.getKeyValue("FIXED_ASSETS_CD"));
					}
					if(msgKeyType.containsKeyColumn("SUB_FIXED_ASSETS_CD")) {
						key.setSUB_FIXED_ASSETS_CD(msgKey.getKeyValue("SUB_FIXED_ASSETS_CD"));
					}
					if(msgKeyType.containsKeyColumn("DETAIL_NO")) {
						key.setDETAIL_NO(msgKey.getKeyValue("DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("COMM_PUCH_ODR_LINE_NO")) {
						key.setCOMM_PUCH_ODR_LINE_NO(msgKey.getKeyValue("COMM_PUCH_ODR_LINE_NO"));
					}
					if(msgKeyType.containsKeyColumn("ARV_RSLT_LINE_NO")) {
						key.setARV_RSLT_LINE_NO(msgKey.getKeyValue("ARV_RSLT_LINE_NO"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_CTRL_FLG")) {
						key.setSTOCK_CTRL_FLG(msgKey.getKeyValue("STOCK_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS")) {
						key.setREMARKS(msgKey.getKeyValue("REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_CRCT_TYP")) {
						key.setINSPC_ACPT_CRCT_TYP(msgKey.getKeyValue("INSPC_ACPT_CRCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ORGN_SLIP_CTRL_GRP")) {
						key.setORGN_SLIP_CTRL_GRP(msgKey.getKeyValue("ORGN_SLIP_CTRL_GRP"));
					}
					if(msgKeyType.containsKeyColumn("ORGN_SLIP_CD")) {
						key.setORGN_SLIP_CD(msgKey.getKeyValue("ORGN_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("ORGN_SLIP_DATE")) {
						key.setORGN_SLIP_DATE(msgKey.getKeyValue("ORGN_SLIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_TRN_CD")) {
						key.setSLIP_TRN_CD(msgKey.getKeyValue("SLIP_TRN_CD"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_CLASS_CD")) {
						key.setSTOCK_CLASS_CD(msgKey.getKeyValue("STOCK_CLASS_CD"));
					}
					if(msgKeyType.containsKeyColumn("BALANCE_CLASS_CD")) {
						key.setBALANCE_CLASS_CD(msgKey.getKeyValue("BALANCE_CLASS_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_ORG_CD")) {
						key.setPUCH_ODR_ORG_CD(msgKey.getKeyValue("PUCH_ODR_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON_CD")) {
						key.setPUCH_ODR_PERSON_CD(msgKey.getKeyValue("PUCH_ODR_PERSON_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_WH_CD")) {
						key.setSHIP_WH_CD(msgKey.getKeyValue("SHIP_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("PAYEE_CD")) {
						key.setPAYEE_CD(msgKey.getKeyValue("PAYEE_CD"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_CTRL_ORG_CD")) {
						key.setSLIP_CTRL_ORG_CD(msgKey.getKeyValue("SLIP_CTRL_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("CLOSING_CTRL_ORG_CD")) {
						key.setCLOSING_CTRL_ORG_CD(msgKey.getKeyValue("CLOSING_CTRL_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("PAY_CALC_CTRL_ORG_CD")) {
						key.setPAY_CALC_CTRL_ORG_CD(msgKey.getKeyValue("PAY_CALC_CTRL_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("PAY_FIX_CTRL_ORG_CD")) {
						key.setPAY_FIX_CTRL_ORG_CD(msgKey.getKeyValue("PAY_FIX_CTRL_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXPL_TYP")) {
						key.setEXPL_TYP(msgKey.getKeyValue("EXPL_TYP"));
					}
					if(msgKeyType.containsKeyColumn("EXPL_CD")) {
						key.setEXPL_CD(msgKey.getKeyValue("EXPL_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXPL_NAME")) {
						key.setEXPL_NAME(msgKey.getKeyValue("EXPL_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ODR_CD")) {
						key.setODR_CD(msgKey.getKeyValue("ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("COMM_PUCH_ODR_SLIP_TYP")) {
						key.setCOMM_PUCH_ODR_SLIP_TYP(msgKey.getKeyValue("COMM_PUCH_ODR_SLIP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("COMM_PUCH_ODR_SLIP_CTRL_GRP")) {
						key.setCOMM_PUCH_ODR_SLIP_CTRL_GRP(msgKey.getKeyValue("COMM_PUCH_ODR_SLIP_CTRL_GRP"));
					}
					if(msgKeyType.containsKeyColumn("COMM_PUCH_ODR_SLIP_CD")) {
						key.setCOMM_PUCH_ODR_SLIP_CD(msgKey.getKeyValue("COMM_PUCH_ODR_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("COMM_PUCH_ODR_SLIP_DATE")) {
						key.setCOMM_PUCH_ODR_SLIP_DATE(msgKey.getKeyValue("COMM_PUCH_ODR_SLIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ARV_RSLT_SLIP_TYP")) {
						key.setARV_RSLT_SLIP_TYP(msgKey.getKeyValue("ARV_RSLT_SLIP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ARV_RSLT_SLIP_CTRL_GRP")) {
						key.setARV_RSLT_SLIP_CTRL_GRP(msgKey.getKeyValue("ARV_RSLT_SLIP_CTRL_GRP"));
					}
					if(msgKeyType.containsKeyColumn("ARV_RSLT_SLIP_CD")) {
						key.setARV_RSLT_SLIP_CD(msgKey.getKeyValue("ARV_RSLT_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("ARV_RSLT_SLIP_DATE")) {
						key.setARV_RSLT_SLIP_DATE(msgKey.getKeyValue("ARV_RSLT_SLIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_RSLT_SLIP_ID")) {
						key.setPUCH_RSLT_SLIP_ID(msgKey.getKeyValue("PUCH_RSLT_SLIP_ID"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CALC_TYP")) {
						key.setTAX_CALC_TYP(msgKey.getKeyValue("TAX_CALC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP")) {
						key.setTAX_APPLY_TYP(msgKey.getKeyValue("TAX_APPLY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TEMP_UNIT_COST_PUCH_RSLT_FLG")) {
						key.setTEMP_UNIT_COST_PUCH_RSLT_FLG(msgKey.getKeyValue("TEMP_UNIT_COST_PUCH_RSLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_ZERO_INSPC_ACPT_FLG")) {
						key.setUNIT_COST_ZERO_INSPC_ACPT_FLG(msgKey.getKeyValue("UNIT_COST_ZERO_INSPC_ACPT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("IMPORT_TRN_TYP")) {
						key.setIMPORT_TRN_TYP(msgKey.getKeyValue("IMPORT_TRN_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PAY_CYCLE_TYP")) {
						key.setPAY_CYCLE_TYP(msgKey.getKeyValue("PAY_CYCLE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DEADLINE_DATE")) {
						key.setDEADLINE_DATE(msgKey.getKeyValue("DEADLINE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PAY_SCH_DATE")) {
						key.setPAY_SCH_DATE(msgKey.getKeyValue("PAY_SCH_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PAY_PATTERN_CD")) {
						key.setPAY_PATTERN_CD(msgKey.getKeyValue("PAY_PATTERN_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_RSRV_CD")) {
						key.setEXCH_RSRV_CD(msgKey.getKeyValue("EXCH_RSRV_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_DATE")) {
						key.setEXCH_DATE(msgKey.getKeyValue("EXCH_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PUR_RSLT_SLIP_ISSUE_FLG")) {
						key.setPUR_RSLT_SLIP_ISSUE_FLG(msgKey.getKeyValue("PUR_RSLT_SLIP_ISSUE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PUR_RSLT_REP_ISSUE_FLG")) {
						key.setPUR_RSLT_REP_ISSUE_FLG(msgKey.getKeyValue("PUR_RSLT_REP_ISSUE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_ARV_MODIFICATION_FLG")) {
						key.setACPT_ARV_MODIFICATION_FLG(msgKey.getKeyValue("ACPT_ARV_MODIFICATION_FLG"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_MODIFICATION_FLG")) {
						key.setINSPC_ACPT_MODIFICATION_FLG(msgKey.getKeyValue("INSPC_ACPT_MODIFICATION_FLG"));
					}
					if(msgKeyType.containsKeyColumn("STATUS")) {
						key.setSTATUS(msgKey.getKeyValue("STATUS"));
					}
					if(msgKeyType.containsKeyColumn("CRCT_FLG")) {
						key.setCRCT_FLG(msgKey.getKeyValue("CRCT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("APPROVAL_DATE")) {
						key.setAPPROVAL_DATE(msgKey.getKeyValue("APPROVAL_DATE"));
					}
					if(msgKeyType.containsKeyColumn("APPROVAL_CD")) {
						key.setAPPROVAL_CD(msgKey.getKeyValue("APPROVAL_CD"));
					}
					if(msgKeyType.containsKeyColumn("APPROVAL_RSRV_DATE")) {
						key.setAPPROVAL_RSRV_DATE(msgKey.getKeyValue("APPROVAL_RSRV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("APPROVAL_RSRV_CD")) {
						key.setAPPROVAL_RSRV_CD(msgKey.getKeyValue("APPROVAL_RSRV_CD"));
					}
					if(msgKeyType.containsKeyColumn("RSN_CD")) {
						key.setRSN_CD(msgKey.getKeyValue("RSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("RECORDING_DATE")) {
						key.setRECORDING_DATE(msgKey.getKeyValue("RECORDING_DATE"));
					}
					if(msgKeyType.containsKeyColumn("RECORDING_MONTH")) {
						key.setRECORDING_MONTH(msgKey.getKeyValue("RECORDING_MONTH"));
					}
					if(msgKeyType.containsKeyColumn("ORGN_RECORDING_DATE")) {
						key.setORGN_RECORDING_DATE(msgKey.getKeyValue("ORGN_RECORDING_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ORGN_RECORDING_MONTH")) {
						key.setORGN_RECORDING_MONTH(msgKey.getKeyValue("ORGN_RECORDING_MONTH"));
					}
					if(msgKeyType.containsKeyColumn("RECORDING_PROC_DATE")) {
						key.setRECORDING_PROC_DATE(msgKey.getKeyValue("RECORDING_PROC_DATE"));
					}
					if(msgKeyType.containsKeyColumn("RECORDING_PROC_CD")) {
						key.setRECORDING_PROC_CD(msgKey.getKeyValue("RECORDING_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("CLOSING_RSRV_DATE")) {
						key.setCLOSING_RSRV_DATE(msgKey.getKeyValue("CLOSING_RSRV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CLOSING_RSRV_CD")) {
						key.setCLOSING_RSRV_CD(msgKey.getKeyValue("CLOSING_RSRV_CD"));
					}
					if(msgKeyType.containsKeyColumn("CLOSING_DATE")) {
						key.setCLOSING_DATE(msgKey.getKeyValue("CLOSING_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CLOSING_CD")) {
						key.setCLOSING_CD(msgKey.getKeyValue("CLOSING_CD"));
					}
					if(msgKeyType.containsKeyColumn("PAY_FIX_DATE")) {
						key.setPAY_FIX_DATE(msgKey.getKeyValue("PAY_FIX_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PAY_FIX_CD")) {
						key.setPAY_FIX_CD(msgKey.getKeyValue("PAY_FIX_CD"));
					}
					if(msgKeyType.containsKeyColumn("DEBT_BALANCE_OUT_FLG")) {
						key.setDEBT_BALANCE_OUT_FLG(msgKey.getKeyValue("DEBT_BALANCE_OUT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("DEBT_BALANCE_OUT_DATE")) {
						key.setDEBT_BALANCE_OUT_DATE(msgKey.getKeyValue("DEBT_BALANCE_OUT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("MONTH")) {
						key.setMONTH(msgKey.getKeyValue("MONTH"));
					}
					if(msgKeyType.containsKeyColumn("ACCT_CD")) {
						key.setACCT_CD(msgKey.getKeyValue("ACCT_CD"));
					}
					if(msgKeyType.containsKeyColumn("SUB_ACCT_CD")) {
						key.setSUB_ACCT_CD(msgKey.getKeyValue("SUB_ACCT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ORG_CD")) {
						key.setORG_CD(msgKey.getKeyValue("ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("DATA_TYP")) {
						key.setDATA_TYP(msgKey.getKeyValue("DATA_TYP"));
					}
					if(msgKeyType.containsKeyColumn("GL_IF_OUT_FLG")) {
						key.setGL_IF_OUT_FLG(msgKey.getKeyValue("GL_IF_OUT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("BALANCE_UPD_FLG")) {
						key.setBALANCE_UPD_FLG(msgKey.getKeyValue("BALANCE_UPD_FLG"));
					}
					if(msgKeyType.containsKeyColumn("BALANCE_UPD_DATE")) {
						key.setBALANCE_UPD_DATE(msgKey.getKeyValue("BALANCE_UPD_DATE"));
					}
					if(msgKeyType.containsKeyColumn("RECORDING_AMOUNT")) {
						key.setRECORDING_AMOUNT(msgKey.getKeyValue("RECORDING_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("DEBT_AMOUNT")) {
						key.setDEBT_AMOUNT(msgKey.getKeyValue("DEBT_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("REBATE_AMOUNT")) {
						key.setREBATE_AMOUNT(msgKey.getKeyValue("REBATE_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("RETURNED_GOODS_AMOUNT")) {
						key.setRETURNED_GOODS_AMOUNT(msgKey.getKeyValue("RETURNED_GOODS_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("RECORDING_AMOUNT_YEN")) {
						key.setRECORDING_AMOUNT_YEN(msgKey.getKeyValue("RECORDING_AMOUNT_YEN"));
					}
					if(msgKeyType.containsKeyColumn("DEBT_AMOUNT_YEN")) {
						key.setDEBT_AMOUNT_YEN(msgKey.getKeyValue("DEBT_AMOUNT_YEN"));
					}
					if(msgKeyType.containsKeyColumn("SAVING_AMOUNT_YEN")) {
						key.setSAVING_AMOUNT_YEN(msgKey.getKeyValue("SAVING_AMOUNT_YEN"));
					}
					if(msgKeyType.containsKeyColumn("REBATE_AMOUNT_YEN")) {
						key.setREBATE_AMOUNT_YEN(msgKey.getKeyValue("REBATE_AMOUNT_YEN"));
					}
					if(msgKeyType.containsKeyColumn("RETURNED_GOODS_AMOUNT_YEN")) {
						key.setRETURNED_GOODS_AMOUNT_YEN(msgKey.getKeyValue("RETURNED_GOODS_AMOUNT_YEN"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_AMOUNT_YEN")) {
						key.setINSPC_ACPT_AMOUNT_YEN(msgKey.getKeyValue("INSPC_ACPT_AMOUNT_YEN"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_DIFF_AMOUNT_YEN")) {
						key.setEXCH_DIFF_AMOUNT_YEN(msgKey.getKeyValue("EXCH_DIFF_AMOUNT_YEN"));
					}
					if(msgKeyType.containsKeyColumn("OPTION_ID")) {
						key.setOPTION_ID(msgKey.getKeyValue("OPTION_ID"));
					}
					if(msgKeyType.containsKeyColumn("OWN_CUR_CD")) {
						key.setOWN_CUR_CD(msgKey.getKeyValue("OWN_CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("THIS_MONTH")) {
						key.setTHIS_MONTH(msgKey.getKeyValue("THIS_MONTH"));
					}
					if(msgKeyType.containsKeyColumn("HOME_DECIMAL_FIG")) {
						key.setHOME_DECIMAL_FIG(msgKey.getKeyValue("HOME_DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("HOME_CUR_CD")) {
						key.setHOME_CUR_CD(msgKey.getKeyValue("HOME_CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("TIME_CTRL")) {
						key.setTIME_CTRL(msgKey.getKeyValue("TIME_CTRL"));
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
