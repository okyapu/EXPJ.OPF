/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KU0100/src/com/nec/jp/orteus/metamorBase/KU0100/KU0100010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KU0100;

import com.nec.jp.orteus.metamorBase.KU0100.*;
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

import java.io.*;
import jp.co.fit.vfreport.*;
//{{user_implement_code_import
	// TODO: ������import�p�b�P�[�W���L�q���Ă�������
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlControl;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class KU0100010Control
{

	//////////////////////////////
	// �A�N�Z�T���\�b�h�����`���܂�
	// Business�I�u�W�F�N�g�A�N�Z�T���\�b�h
	private Business business;
	public Business getBusiness() { return this.business; }
	public void setBusiness( Business obj ) { this.business = obj; }

	// PDF�p�A�N�Z�T���\�b�h
	private String queryFileName = null;
	public String getQueryfileName() { return this.queryFileName; }
	public void setQueryFileName(String queryFileName) { this.queryFileName = queryFileName; }
	private String frmFileName = null;
	public String getFrmfileName() { return this.frmFileName; }
	public void setFrmFileName(String frmFileName) { this.frmFileName = frmFileName; }
	private String pdfFileName = null;
	public String getPdfFileName() { return this.pdfFileName; }
	public void setPdfFileName(String pdfFileName) { this.pdfFileName = pdfFileName; }
	private String dbUID = null;
	private String dbPWD = null;
	private String dbDBQ = null;
	private String dbKIND = null;
	private String pdfFilePath = null;
	public String getPdfFilePath() { return this.pdfFilePath; }
	public void setPdfFilePath(String pdfFilePath) { this.pdfFilePath = pdfFilePath; }

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
	public KU0100010Struct getListvalue(int x) { return (KU0100010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public KU0100010Struct getStruct() { return this.struct; }	// Struct�̒l��Ԃ��܂��B
	public KU0100010Struct createStruct() { return new KU0100010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((KU0100010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }							// ���ʃ��X�g�̃C���X�^���X(������уf�[�^)
	
	/** �V�X�e���p�����[�^. ���[�ő��������i�L�[�FMAX_REPORT_PRINT_CNT�j */
	private static final String MAX_REPORT_PRINT_CNT = "MAX_REPORT_PRINT_CNT";
	
	/** �V�X�e���p�����[�^. �C���{�C�X��������i�L�[�FINVOICE_PRINT_CNT�j */
	private static final String INVOICE_PRINT_CNT = "INVOICE_PRINT_CNT";
	
	/** �V�X�e���p�����[�^. TAXID�i�L�[�FSHIP_INVOICE_TAXID�j */
	private static final String SHIP_INVOICE_TAXID = "SHIP_INVOICE_TAXID";
	
	/** �V�X�e���p�����[�^. ��Ж��i�L�[�FSELF_COMPANY_NAME�j */
	private static final String SELF_COMPANY_NAME = "SELF_COMPANY_NAME";
	
	/** �V�X�e���p�����[�^. ��ЏZ���i�L�[�FSELF_COMPANY_ADDRESS�j */
	private static final String SELF_COMPANY_ADDRESS = "SELF_COMPANY_ADDRESS";
	
	/** �V�X�e���p�����[�^. �d�b�ԍ��AFAX�ԍ��i�L�[�FSELF_COMPANY_TEL_FAX�j */
	private static final String SELF_COMPANY_TEL_FAX = "SELF_COMPANY_TEL_FAX";
	
	/** �V�X�e���p�����[�^. �C���{�C�X�[�t�b�^�[�i�L�[�FSHIP_INVOICE_FOOTER�j */
	private static final String SHIP_INVOICE_FOOTER = "SHIP_INVOICE_FOOTER";
	
	/** Explanner/J*/
	private static final String EXPLANNER_J = "J*";
	
	/** Explanner/Ja*/
	private static final String EXPLANNER_JA = "JA*";
	
	/** �V�X�e���p�����[�^. �C���{�C�X������� */
	private String _strInvoicePrintCnt = "0";
	
	/** �V�X�e���p�����[�^. TAXID */
	private String _strShipInvoiceTaxID;
	
	/** �V�X�e���p�����[�^. ��Ж� */
	private String _strSelfCompanyName;
	
	/** �V�X�e���p�����[�^. ��ЏZ�� */
	private String _strSelfCompanyAddress;
	
	/** �V�X�e���p�����[�^. �d�b�ԍ��AFAX�ԍ� */
	private String _strSelfCompanyTelFax;
	
	/** �V�X�e���p�����[�^. �C���{�C�X�[�t�b�^�[ */
	private String _strShipInvoiceFooter;
	
	/** ��ʑJ�ڃL�[(�o�׃C���{�C�X�Ǘ��ԍ�) */
	private String _ShipInvoiceCtlNo;
	/**
	 * ��ʑJ�ڃL�[(�o�׃C���{�C�X�Ǘ��ԍ�)�擾
	 * @return �o�׃C���{�C�X�Ǘ��ԍ�
	 */
	public String getShipInvoiceCtlNo() {
		return _ShipInvoiceCtlNo;
	}
	public void setShipInvoiceCtlNo(String no) {
		_ShipInvoiceCtlNo = no;
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
	 * null�Ȃ�΋󔒕����A����ȊO�͂��̂܂܂ɂ��܂��B
	 *
	 * @param String str
	 * @return String �ϊ��㕶����
	 */
	private String replaceNull(String str){
		if (str == null || "null".equals(str.toLowerCase())) {
			return "";
		}
		return str;
	}
	
	/**
	 * null�܂��͋󔒕����Ȃ��0�A����ȊO�͂��̂܂܂ɂ��܂��B
	 *
	 * @param String str
	 * @return String �ϊ��㕶����
	 */
	private String convertNull(String str){
		if (str == null || str.equals("") || "null".equals(str.toLowerCase())) {
			return "0";
		}
		return str;
	}
	
	/**
	 * PDF���[���쐬���܂��B
	 *
	 * @param lstManyPdf �o�̓f�[�^
	 * @param copies �o�͕���
	 */
	private void createPdf(List lstManyPdf, int copies){

		int ret = 0;
		String printType      = getPdfOutputType();
		String printer        = getPdfOutputPrinter();
		SvfWrapper svf        = new SvfWrapper(printType, getsysUSER_CD(), printer);
		StringBuffer sbPdfFileName = new StringBuffer();	// pdf�t�@�C�����iWeb�p�j
		String printId1 = "KU01000101";	// ���[ID���w�肵�Ă�������
		
		boolean isRePrint = false;
		if ("true".equals(struct.getRE_OUT_PUT())) {
			isRePrint = true;
		}
        // �����ꍀ�ڎ擾�Ή�
        String locale = CoreTools.getLocale(sysUSER_CD);
        String property = "OrteusUserDic";
        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);

		KU0100010Struct strPdf = null;
		List lstOnePage = null;
		List lstOnePdf = null;
		for (int i = 0; i < lstManyPdf.size(); i++) {
			lstOnePdf = (List)lstManyPdf.get(i);
			ret = svf.VrInit(printId1);	// PDF�쐬�J�n
			pdfFilePath = svf.getPdfFilePath();	// pdf�t���p�X�t�@�C����
			if (sbPdfFileName.length() > 0) {
				sbPdfFileName.append("|");
			}
			sbPdfFileName.append(svf.getPdfFileName());
			for (int cnt = 0; cnt < copies; cnt++) {
				for (int j = 0; j < lstOnePdf.size(); j++) {
					lstOnePage = (List)lstOnePdf.get(j);
					for (int k = 0; k < lstOnePage.size(); k++) {
						strPdf = (KU0100010Struct)lstOnePage.get(k);
						if (k == 0) {
							if ("true".equals(struct.getr_CopyPrint())) {
								ret = svf.VrsOut("COPY", CoreTools.getRBString("Expj.Cmt6685",resource));
							} else {
								ret = svf.VrsOut("COPY", "");
							}
							if (isRePrint) {
								ret = svf.VrsOut("RE_OUT_PUT", CoreTools.getRBString("Expj.Cmt0044",resource));
							} else {
								ret = svf.VrsOut("RE_OUT_PUT", "");
							}
							ret = svf.VrsOut("CNT", "" + cnt);
							ret = svf.VrsOut("SHIP_INVOICE_CTL_NO", strPdf.getSHIP_INVOICE_CTL_NO());
							ret = svf.VrsOut("SHIP_INVOICE_NO", strPdf.getw_SHIP_INVOICE_NO());
							ret = svf.VrsOut("CUST_CD", strPdf.getw_CUST_CD());
							ret = svf.VrsOut("TAXID", replaceNull(_strShipInvoiceTaxID));
							ret = svf.VrsOut("COMPANY_CD", replaceNull(_strSelfCompanyName));
							ret = svf.VrsOut("COMPANY_ADRESS", replaceNull(_strSelfCompanyAddress));
							ret = svf.VrsOut("TEL_FAX_NO", replaceNull(_strSelfCompanyTelFax));
							ret = svf.VrsOut("CUST_NAME", strPdf.getw_CUST_NAME());
							ret = svf.VrsOut("SHIP_PLAN_DATE", strPdf.getw_SHIP_PLAN_DATE());
							ret = svf.VrsOut("SHIP_NO", strPdf.getw_SHIP_NO());
							ret = svf.VrsOut("DLV_LOC_CD", strPdf.getw_DLV_LOC_CD());
							// �o�`���A�o�`��
							StringBuffer strDPD = new StringBuffer();
							strDPD.append(replaceNull(strPdf.getw_DEPARTURE_PLACE()));
							strDPD.append(" ");
							strDPD.append(replaceNull(strPdf.getw_DEPARTURE_DATE()));	
							ret = svf.VrsOut("DEPARTURE_PLACE_DATE", strDPD.toString());
							// �����n�A���`��
							StringBuffer strAPD = new StringBuffer();
							strAPD.append(replaceNull(strPdf.getw_ARRIVAL_PLACE()));
							strAPD.append(" ");
							strAPD.append(replaceNull(strPdf.getw_ARRIVAL_DATE()));
							ret = svf.VrsOut("ARRIVAL_PLACE_DATE", strAPD.toString());
							
							ret = svf.VrsOut("REMARKS_1", strPdf.getw_REMARKS_1());
							ret = svf.VrsOut("REMARKS_2", strPdf.getw_REMARKS_2());
							ret = svf.VrsOut("TAX_INCLUDE_AMOUNT", strPdf.getw_TAX_INCLUDE_AMOUNT());
							ret = svf.VrsOut("INVOICE_TAX_AMOUNT", strPdf.getw_INVOICE_TAX_AMOUNT());
							ret = svf.VrsOut("TAX_CREDIT_AMOUNT", strPdf.getw_TAX_CREDIT_AMOUNT());
							ret = svf.VrsOut("COMMENTS_1", replaceNull(_strShipInvoiceFooter));
						}
						ret = svf.VrsOut("ITEM_CD", strPdf.getw_ITEM_CD());
						ret = svf.VrsOut("ITEM_NAME", strPdf.getw_ITEM_NAME());
						ret = svf.VrsOut("ODR_NO", strPdf.getw_ODR_NO());
						ret = svf.VrsOut("SHIP_QTY", strPdf.getw_SHIP_QTY());
						ret = svf.VrsOut("UNIT_PRICE", strPdf.getw_UNIT_PRICE());
						ret = svf.VrsOut("SHIP_ODR_AMOUNT", strPdf.getw_SHIP_ODR_AMOUNT());
						ret = svf.VrEndRecord();
						if (k == lstOnePage.size() -1 ) {
							ret = svf.VrEndPage();
						}
					}
					if ((cnt == copies-1) && (j == lstOnePdf.size() -1 )) {
						ret = svf.VrPrint();
					}			    
				}
			}
			if ( "1".equals(printType) ) {
				try {
					String acrobatPath = svf.getAcrobatPath();
					String acrobatOption1 = svf.getAcrobatOption1();
					String acrobatOption2 = svf.getAcrobatOption2();
					String pdfPrinter = svf.getPrinter();
					Runtime.getRuntime().exec(new String[]{acrobatPath, acrobatOption1, acrobatOption2, pdfFilePath, pdfPrinter});
					//Runtime.getRuntime().exec(svf.getExecuteOutput());
				}catch(IOException e){
					// �T�[�o������s���̃G���[�������L�q���Ă��������B
				}
			}
			ret = svf.VrQuit();			// PDF�쐬�I��
		}

		if ( "0".equals(printType) ) {	// �N���C�A���g����̏ꍇ
			if (sbPdfFileName != null) {
				struct.setDOWNLOAD_FILE(sbPdfFileName.toString());
			}
		}
	}
    
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * ���[�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlPrint() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0100");
		logger.entering("KU0100010Control"+":USER="+struct.getsUser_ID(),"controlPrint");
			KU0100010Struct strPdf = null;

		int ret = 0;
		String printType      = getPdfOutputType();
		String printPattern   = getPdfOutputListPattern();
		String printer        = getPdfOutputPrinter();
		SvfWrapper svf        = new SvfWrapper(printType, getsysUSER_CD(), printer);

			//{{user_implement_dev:<controlPrint>
		try {
			// ���Ӑ�R�[�h���}�X�^�ɑ��݂��Ȃ��ꍇ
			if (struct.getCUST_CD() != null && !"".equals(struct.getCUST_CD()) && !entity.mM_CUST.check(conn, struct)) {
				setErrorMessage("KA00032");
				readStatus = ERROR;
				return;
			}
			// �[�i�ꏊ�R�[�h���}�X�^�ɑ��݂��Ȃ��ꍇ
			if (struct.getDLV_LOC_CD() != null && !"".equals(struct.getDLV_LOC_CD())) {
				List check2List = entity.mSelect_DLV_LOC_CD.read(conn, struct);
				if(check2List.isEmpty()){
					setErrorMessage("KQ00015");
					readStatus = ERROR;
					return;
				}
			}
				
			// �o�׃C���{�C�X�Ǘ��ԍ����}�X�^�ɑ��݂��Ȃ��ꍇ
			if (struct.getSHIP_INVOICE_CTL_NO() != null && !"".equals(struct.getSHIP_INVOICE_CTL_NO())) {
				List check3List = entity.mSelect_SHIP_INVOICE_CTL_NO.read(conn, struct);
				if(check3List.isEmpty()){
					setErrorMessage("KU00116");
					readStatus = ERROR;
					return;
				}
			}
			
			// ���͂���R�s�[������������P�A�����V�X�e���p�����[�^.���[�ő�������
			// �i�L�[�FMAX_REPORT_PRINT_CNT�j�ł͂Ȃ��ꍇ
			if("true".equals(struct.getr_CopyPrint())){
				KU0100010Struct st = new KU0100010Struct();
				st.setNAME(MAX_REPORT_PRINT_CNT);
				List check4List = entity.mSYS_PARAMETER.read(conn, st);
				if (check4List != null && check4List.size() > 0) {
					KU0100010Struct valueStruct = (KU0100010Struct)check4List.get(0);
					String count = convertNull(struct.getCOUNT());
					String value = convertNull(valueStruct.getVALUE());
					if(Integer.parseInt(count) < 1 || Integer.parseInt(count) > Integer.parseInt(value)){
						setErrorMessage("KU00117",value);
						readStatus = ERROR;
						return;
					}
				} else {
					setErrorMessage("KV03005");
					StringBuffer sbMsg = new StringBuffer("SYS_PARAMETER.NAME:");
					sbMsg.append(MAX_REPORT_PRINT_CNT);
					setErrorMessage("ZZ01006", sbMsg.toString());
					readStatus = ERROR;
					return;
				}
			}
			// �o�׃C���{�C�X�쐬���̐ݒ�
			if (struct.getSHIP_INVOICE_DATE_FROM() != null) {
				struct.setw_SHIP_INVOICE_DATE_FROM(struct.getSHIP_INVOICE_DATE_FROM());
			}
			if (struct.getSHIP_INVOICE_DATE_TO() != null) {
				struct.setw_SHIP_INVOICE_DATE_TO(struct.getSHIP_INVOICE_DATE_TO());
			}
        	// ���������̏o�ח\������Ɏ�����t������
			StringBuffer sbShipPlanDateFrom = null;
			StringBuffer sbShipPlanDateTo = null;
	        if (EXPLANNER_J.equals(struct.getOPTION_ID())) {
	        	// �J�n�����̐ݒ�
	        	if (struct.getSCDL_SHIP_DATE_FROM() != null && !"".equals(struct.getSCDL_SHIP_DATE_FROM())) {
	        		sbShipPlanDateFrom = new StringBuffer(struct.getSCDL_SHIP_DATE_FROM());
	        		sbShipPlanDateFrom.append(" 00:00");
	        		struct.setw_SCDL_SHIP_DATE_FROM(sbShipPlanDateFrom.toString());
	        	}
	        	// �I�������̐ݒ�
	        	if (struct.getSCDL_SHIP_DATE_TO() != null && !"".equals(struct.getSCDL_SHIP_DATE_TO())) {
	        		sbShipPlanDateTo = new StringBuffer(struct.getSCDL_SHIP_DATE_TO());
	        		sbShipPlanDateTo.append(" 59:59");
	        		struct.setw_SCDL_SHIP_DATE_TO(sbShipPlanDateTo.toString());
	        	}
	        } else {
	        	// �J�n�����̐ݒ�
	        	if (struct.getSCDL_SHIP_DATE_FROM() != null && !"".equals(struct.getSCDL_SHIP_DATE_FROM())) {
	        		sbShipPlanDateFrom = new StringBuffer(struct.getSCDL_SHIP_DATE_FROM());
	        		if (struct.getSHIP_PLAN_DATE_TIME_FROM() != null && !"".equals(struct.getSHIP_PLAN_DATE_TIME_FROM())) {
		        		sbShipPlanDateFrom.append(" ");
		        		String strTime = struct.getSHIP_PLAN_DATE_TIME_FROM();
		        		if (strTime.length() == 3) {
		        			strTime = "0" + strTime;
			        		struct.setSHIP_PLAN_DATE_TIME_FROM(strTime);
		        		}
		        		sbShipPlanDateFrom.append(strTime.subSequence(0, 2));
	        			sbShipPlanDateFrom.append(":");
		        		sbShipPlanDateFrom.append(strTime.subSequence(2, 4));
	        		} else {
		        		sbShipPlanDateFrom.append(" 00:00");
	        		}
	        		struct.setw_SCDL_SHIP_DATE_FROM(sbShipPlanDateFrom.toString());
	        	}
	        	// �I�������̐ݒ�
	        	if (struct.getSCDL_SHIP_DATE_TO() != null && !"".equals(struct.getSCDL_SHIP_DATE_TO())) {
	        		sbShipPlanDateTo = new StringBuffer(struct.getSCDL_SHIP_DATE_TO());
	        		if (struct.getSHIP_PLAN_DATE_TIME_TO() != null && !"".equals(struct.getSHIP_PLAN_DATE_TIME_TO())) {
		        		sbShipPlanDateTo.append(" ");
		        		String strTime = struct.getSHIP_PLAN_DATE_TIME_TO();
		        		if (strTime.length() == 3) {
		        			strTime = "0" + strTime;
			        		struct.setSHIP_PLAN_DATE_TIME_TO(strTime);
		        		}
		        		sbShipPlanDateTo.append(strTime.subSequence(0, 2));
		        		sbShipPlanDateTo.append(":");
		        		sbShipPlanDateTo.append(strTime.subSequence(2, 4));
	        		} else {
		        		sbShipPlanDateTo.append(" 59:59");
	        		}
	        		struct.setw_SCDL_SHIP_DATE_TO(sbShipPlanDateTo.toString());
	        	}
	        }

			if("true".equals(struct.getRE_OUT_PUT())){
				struct.setw_PRINT_FLG("1");
			}else{
				struct.setw_PRINT_FLG("0");
			}

			List pdfList = null;
	        if (EXPLANNER_J.equals(struct.getOPTION_ID())) {
	        	pdfList = entity.mSelect.read(conn, struct);
	        } else {
	        	pdfList = entity.mSelect2.read(conn, struct);
	        }
	        
			// �Ώۃf�[�^�� 0 ���ł���ꍇ
			if(pdfList == null || pdfList.size() == 0){
				setErrorMessage("ZZ06001");
				readStatus = NOT_FOUND;
				if (list !=null) {
					list.clear();
				}
				return;
			}

			int loopMax = 0;

			if(pdfList != null){
				loopMax = pdfList.size();
			}
			
			int count = 1;
			if("true".equals(struct.getr_CopyPrint())){
				count = Integer.parseInt(struct.getCOUNT());
			}
			String strPreShipCtrlNo = ""; // �o�׃C���{�C�X�Ǘ��ԍ�
			String strCustCd = ""; // ���Ӑ�R�[�h
			List lstOnePage = null;
			List lstOnePdf = new ArrayList();
			List lstManyPdf = new ArrayList();
			int maxDetail = 19;
			KU0100010Struct strPdf2 = new KU0100010Struct();
			for(int i=0; i<loopMax; i++) {				// �f�[�^�o�� 
				
				strPdf = (KU0100010Struct)pdfList.get(i);
				strPdf.setsUser_ID(this.getsysUSER_CD()); // ���[�U�R�[�h

				// �O��̓��Ӑ�R�[�h�ƈႢ�̏ꍇ�A�V�y�[�W�Ƃ��ďo�͂���
				if (strCustCd == null || "".equals(strCustCd) || !strCustCd.equals(strPdf.getw_CUST_CD())) {
					if (strCustCd != null && !"".equals(strCustCd)) {
						if(lstOnePage != null){
							int lstSize = lstOnePage.size();
							if (lstSize % maxDetail > 0){
								strPdf2.setw_CUST_CD(strCustCd);
								strPdf2.setw_SHIP_INVOICE_CTL_NO(strPreShipCtrlNo);
								for(int k=0; k<maxDetail - lstSize % maxDetail; k++){
									lstOnePage.add(strPdf2);
								}
							}
						}
					}
					lstOnePage = new ArrayList();
					lstOnePdf.add(lstOnePage);
					strPreShipCtrlNo = "";
				} else 
				
				// �O��̏o�׃C���{�C�X�Ǘ��ԍ��ƈႢ�̏ꍇ�A�V�y�[�W�Ƃ��ďo�͂���
				if (!strPreShipCtrlNo.equals(strPdf.getSHIP_INVOICE_CTL_NO())) {
					if (strPreShipCtrlNo != null && !"".equals(strPreShipCtrlNo)) {
						if(lstOnePage != null){
							int lstSize = lstOnePage.size();
							if (lstSize % maxDetail > 0){
								strPdf2.setw_CUST_CD(strCustCd);
								strPdf2.setw_SHIP_INVOICE_CTL_NO(strPreShipCtrlNo);
								for(int k=0; k<maxDetail - lstSize % maxDetail; k++){
									lstOnePage.add(strPdf2);
								}
							}
							lstOnePage = new ArrayList();
							lstOnePdf.add(lstOnePage);
						}
					}
				}
				lstOnePage.add(strPdf);

				if(i == loopMax - 1){
					if(lstOnePage != null){
						int lstSize = lstOnePage.size();
						if (lstSize % maxDetail > 0){
							strPdf2.setw_CUST_CD(strPdf.getw_CUST_CD());
							strPdf2.setw_SHIP_INVOICE_CTL_NO(strPdf.getSHIP_INVOICE_CTL_NO());
							for(int k=0; k<maxDetail - lstSize % maxDetail; k++){
								lstOnePage.add(strPdf2);							}
						}
					}
				}
				// �o�׃C���{�C�X�w�b�_�̍X�V�������s��
				entity.mUpdate_M_SHIP_INVOICE_HEAD.update(conn, strPdf);
				
				strPreShipCtrlNo = strPdf.getSHIP_INVOICE_CTL_NO(); // �o�׃C���{�C�X�Ǘ��ԍ���ޔ�����
				strCustCd = strPdf.getw_CUST_CD(); // ���Ӑ�R�[�h��ޔ�����
			}
			
			lstManyPdf.add(lstOnePdf);
			// PDF���쐬����
			createPdf(lstManyPdf, count);

			conn.commit();

		} catch(Exception e) {
			conn.rollback();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			throw ee;
		}
                //}}user_implement_dev:<controlPrint>
		logger.exiting("KU0100010Control"+":USER="+struct.getsUser_ID(),"controlPrint");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0100");
		logger.entering("KU0100010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			controlRELOAD();
			struct.setDOWNLOAD_FILE(null);
                //}}user_implement_dev:<controlClear>
		logger.exiting("KU0100010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0100");
		logger.entering("KU0100010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("KU0100010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0100");
		logger.entering("KU0100010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KU0100010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0100");
		logger.entering("KU0100010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		// ��ʑJ�ڂ̌Ăяo����������AStruct�ɉ�ʑJ�ڃL�[��ݒ肵��controlSelect()���Ăяo��
		if ( isScreenMove() == true ) {
			struct.setSHIP_INVOICE_CTL_NO(getShipInvoiceCtlNo());
		}
		try {
			KU0100010Struct st = new KU0100010Struct();
			
			// =======================================
			// �C���X�g�[���I�v�V�����̎擾
			// =======================================
			struct.setOPTION_ID(EXPLANNER_JA);
			if (!entity.mcheck_SYS_INSTALL_OPTIONS.check(conn, struct)) {
				struct.setOPTION_ID(EXPLANNER_J);
			}

			// =======================================
			// ��ЃR�[�h�̎擾
			// =======================================
			// ��ЃR�[�h�̎擾���s��
			String strCompanyCd = SystemInformation.getSysMyCompanyCd();
			if (strCompanyCd == null || strCompanyCd.equals("")) {
				throw new ExpjException("KQ00039"); // �G�N�Z�v�V�����𐶐�
			} else {
				struct.setCOMPANY_CD(strCompanyCd); // ��ЃR�[�h
			}

			// =======================================
			// �V�X�e���p�����[�^�̎擾
			// =======================================
			// �V�X�e���p�����[�^. �C���{�C�X�������
			st.setNAME(INVOICE_PRINT_CNT);
			List lstSysParams = entity.mSYS_PARAMETER.read(conn, st);
			if (lstSysParams != null && lstSysParams.size() > 0) {
				_strInvoicePrintCnt = ((KU0100010Struct) lstSysParams.get(0)).getVALUE();
				struct.setCOUNT(_strInvoicePrintCnt); // �������
			} else {
				_strInvoicePrintCnt = "0";
			}
			
			// �V�X�e���p�����[�^. TAXID
			st.setNAME(SHIP_INVOICE_TAXID);
			lstSysParams = entity.mSYS_PARAMETER.read(conn, st);
			if (lstSysParams != null && lstSysParams.size() > 0) {
				_strShipInvoiceTaxID = ((KU0100010Struct) lstSysParams.get(0)).getVALUE();
			} else {
				throw new ExpjException("KU00119"); // �G�N�Z�v�V�����𐶐�
			}
			
			// �V�X�e���p�����[�^. ��Ж�
			st.setNAME(SELF_COMPANY_NAME);
			lstSysParams = entity.mSYS_PARAMETER.read(conn, st);
			if (lstSysParams != null && lstSysParams.size() > 0) {
				_strSelfCompanyName = ((KU0100010Struct) lstSysParams.get(0)).getVALUE();
			} else {
				_strSelfCompanyName = "";
			}
			
			// �V�X�e���p�����[�^. ��ЏZ��
			st.setNAME(SELF_COMPANY_ADDRESS);
			lstSysParams = entity.mSYS_PARAMETER.read(conn, st);
			if (lstSysParams != null && lstSysParams.size() > 0) {
				_strSelfCompanyAddress = ((KU0100010Struct) lstSysParams.get(0)).getVALUE();
			} else {
				_strSelfCompanyAddress = "";
			}
			
			// �V�X�e���p�����[�^. �d�b�ԍ��AFAX�ԍ�
			st.setNAME(SELF_COMPANY_TEL_FAX);
			lstSysParams = entity.mSYS_PARAMETER.read(conn, st);
			if (lstSysParams != null && lstSysParams.size() > 0) {
				_strSelfCompanyTelFax = ((KU0100010Struct) lstSysParams.get(0)).getVALUE();
			} else {
				_strSelfCompanyTelFax = "";
			}
			
			// �V�X�e���p�����[�^. �C���{�C�X�[�t�b�^�[
			st.setNAME(SHIP_INVOICE_FOOTER);
			lstSysParams = entity.mSYS_PARAMETER.read(conn, st);
			if (lstSysParams != null && lstSysParams.size() > 0) {
				_strShipInvoiceFooter = ((KU0100010Struct) lstSysParams.get(0)).getVALUE();
			} else {
				_strShipInvoiceFooter = "";
			}
			
			if (struct.getSHIP_INVOICE_CTL_NO() != null && !"".equals(struct.getSHIP_INVOICE_CTL_NO())) {
				List printFlagList = entity.mSelect_PRINT_FLG.read(conn, struct);
				KU0100010Struct printFlagStruct = (KU0100010Struct)printFlagList.get(0);
				if("1".equals(printFlagStruct.getPRINT_FLG().toString())){
					struct.setRE_OUT_PUT("true");
				}else{
					struct.setRE_OUT_PUT("false");
				}
			}
		} catch (ExpjException e) {
			throw e;
		} catch (Exception e) {
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());// �v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			throw ee;
		}
		
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KU0100010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0100");
		logger.entering("KU0100010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
		struct.setDOWNLOAD_FILE((String)null);	// �_�E�����[�h�t�@�C�����N���A

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
		logger.exiting("KU0100010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("Print") ) {
				controlPrint();
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
//			throw new FoundationException("KU0100010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KU0100010-E999","CSV�̏o�͏���"));
			throw new FoundationException("KU0100010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KU0100010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("KU0100010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KU0100010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("KU0100010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected KU0100010Entity entity;
	protected KU0100010Struct struct;
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

		entity = new KU0100010Entity();
		struct = new KU0100010Struct();

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
	 * KU0100010�N���X�̕W���R���X�g���N�^
	 */
	public KU0100010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
			// TODO: �����ɏ����������L�q���Ă�������
		try {
			ResourceBundle bundle = SystemConfig.getBundle();
			dbUID = SystemConfig.getProperty("CONNECT_DBUSER", bundle);
			dbPWD = SystemConfig.getProperty("CONNECT_DBPASS", bundle);
			dbDBQ = SystemConfig.getProperty("CONNECT_DBHOST", bundle);
			dbKIND = SystemConfig.getProperty("CONNECT_KIND", bundle);
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
				KU0100010Struct key = (KU0100010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("COPY") && key.getCOPY() != null) {
					msgKey.setKeyValue("COPY", key.getCOPY());
				}
				if(msgKeyType.containsKeyColumn("RE_OUT_PUT") && key.getRE_OUT_PUT() != null) {
					msgKey.setKeyValue("RE_OUT_PUT", key.getRE_OUT_PUT());
				}
				if(msgKeyType.containsKeyColumn("SHIP_INVOICE_DATE_FROM") && key.getSHIP_INVOICE_DATE_FROM() != null) {
					msgKey.setKeyValue("SHIP_INVOICE_DATE_FROM", key.getSHIP_INVOICE_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("SHIP_INVOICE_DATE_TO") && key.getSHIP_INVOICE_DATE_TO() != null) {
					msgKey.setKeyValue("SHIP_INVOICE_DATE_TO", key.getSHIP_INVOICE_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("SCDL_SHIP_DATE_FROM") && key.getSCDL_SHIP_DATE_FROM() != null) {
					msgKey.setKeyValue("SCDL_SHIP_DATE_FROM", key.getSCDL_SHIP_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("SCDL_SHIP_DATE_TO") && key.getSCDL_SHIP_DATE_TO() != null) {
					msgKey.setKeyValue("SCDL_SHIP_DATE_TO", key.getSCDL_SHIP_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("r_MasterPrint") && key.getr_MasterPrint() != null) {
					msgKey.setKeyValue("r_MasterPrint", key.getr_MasterPrint());
				}
				if(msgKeyType.containsKeyColumn("r_CopyPrint") && key.getr_CopyPrint() != null) {
					msgKey.setKeyValue("r_CopyPrint", key.getr_CopyPrint());
				}
				if(msgKeyType.containsKeyColumn("COUNT") && key.getCOUNT() != null) {
					msgKey.setKeyValue("COUNT", key.getCOUNT());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("c_RE_OUT_PUT") && key.getc_RE_OUT_PUT() != null) {
					msgKey.setKeyValue("c_RE_OUT_PUT", key.getc_RE_OUT_PUT());
				}
				if(msgKeyType.containsKeyColumn("SHIP_PLAN_DATE_TIME_FROM") && key.getSHIP_PLAN_DATE_TIME_FROM() != null) {
					msgKey.setKeyValue("SHIP_PLAN_DATE_TIME_FROM", key.getSHIP_PLAN_DATE_TIME_FROM());
				}
				if(msgKeyType.containsKeyColumn("SHIP_PLAN_DATE_TIME_TO") && key.getSHIP_PLAN_DATE_TIME_TO() != null) {
					msgKey.setKeyValue("SHIP_PLAN_DATE_TIME_TO", key.getSHIP_PLAN_DATE_TIME_TO());
				}
				if(msgKeyType.containsKeyColumn("SHIP_INVOICE_CTL_NO") && key.getSHIP_INVOICE_CTL_NO() != null) {
					msgKey.setKeyValue("SHIP_INVOICE_CTL_NO", key.getSHIP_INVOICE_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("w_SHIP_INVOICE_NO") && key.getw_SHIP_INVOICE_NO() != null) {
					msgKey.setKeyValue("w_SHIP_INVOICE_NO", key.getw_SHIP_INVOICE_NO());
				}
				if(msgKeyType.containsKeyColumn("w_CUST_CD") && key.getw_CUST_CD() != null) {
					msgKey.setKeyValue("w_CUST_CD", key.getw_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("w_CUST_NAME") && key.getw_CUST_NAME() != null) {
					msgKey.setKeyValue("w_CUST_NAME", key.getw_CUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_SHIP_PLAN_DATE") && key.getw_SHIP_PLAN_DATE() != null) {
					msgKey.setKeyValue("w_SHIP_PLAN_DATE", key.getw_SHIP_PLAN_DATE());
				}
				if(msgKeyType.containsKeyColumn("w_SHIP_NO") && key.getw_SHIP_NO() != null) {
					msgKey.setKeyValue("w_SHIP_NO", key.getw_SHIP_NO());
				}
				if(msgKeyType.containsKeyColumn("w_DLV_LOC_CD") && key.getw_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("w_DLV_LOC_CD", key.getw_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("w_DEPARTURE_PLACE") && key.getw_DEPARTURE_PLACE() != null) {
					msgKey.setKeyValue("w_DEPARTURE_PLACE", key.getw_DEPARTURE_PLACE());
				}
				if(msgKeyType.containsKeyColumn("w_DEPARTURE_DATE") && key.getw_DEPARTURE_DATE() != null) {
					msgKey.setKeyValue("w_DEPARTURE_DATE", key.getw_DEPARTURE_DATE());
				}
				if(msgKeyType.containsKeyColumn("w_ARRIVAL_PLACE") && key.getw_ARRIVAL_PLACE() != null) {
					msgKey.setKeyValue("w_ARRIVAL_PLACE", key.getw_ARRIVAL_PLACE());
				}
				if(msgKeyType.containsKeyColumn("w_ARRIVAL_DATE") && key.getw_ARRIVAL_DATE() != null) {
					msgKey.setKeyValue("w_ARRIVAL_DATE", key.getw_ARRIVAL_DATE());
				}
				if(msgKeyType.containsKeyColumn("w_REMARKS_1") && key.getw_REMARKS_1() != null) {
					msgKey.setKeyValue("w_REMARKS_1", key.getw_REMARKS_1());
				}
				if(msgKeyType.containsKeyColumn("w_REMARKS_2") && key.getw_REMARKS_2() != null) {
					msgKey.setKeyValue("w_REMARKS_2", key.getw_REMARKS_2());
				}
				if(msgKeyType.containsKeyColumn("w_TAX_INCLUDE_AMOUNT") && key.getw_TAX_INCLUDE_AMOUNT() != null) {
					msgKey.setKeyValue("w_TAX_INCLUDE_AMOUNT", key.getw_TAX_INCLUDE_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("w_INVOICE_TAX_AMOUNT") && key.getw_INVOICE_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("w_INVOICE_TAX_AMOUNT", key.getw_INVOICE_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("w_TAX_CREDIT_AMOUNT") && key.getw_TAX_CREDIT_AMOUNT() != null) {
					msgKey.setKeyValue("w_TAX_CREDIT_AMOUNT", key.getw_TAX_CREDIT_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_CD") && key.getw_ITEM_CD() != null) {
					msgKey.setKeyValue("w_ITEM_CD", key.getw_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_NAME") && key.getw_ITEM_NAME() != null) {
					msgKey.setKeyValue("w_ITEM_NAME", key.getw_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_ODR_NO") && key.getw_ODR_NO() != null) {
					msgKey.setKeyValue("w_ODR_NO", key.getw_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("w_SHIP_QTY") && key.getw_SHIP_QTY() != null) {
					msgKey.setKeyValue("w_SHIP_QTY", key.getw_SHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("w_UNIT_PRICE") && key.getw_UNIT_PRICE() != null) {
					msgKey.setKeyValue("w_UNIT_PRICE", key.getw_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("w_SHIP_ODR_AMOUNT") && key.getw_SHIP_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("w_SHIP_ODR_AMOUNT", key.getw_SHIP_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_CD") && key.getDLV_LOC_CD() != null) {
					msgKey.setKeyValue("DLV_LOC_CD", key.getDLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("w_SHIP_INVOICE_DATE_FROM") && key.getw_SHIP_INVOICE_DATE_FROM() != null) {
					msgKey.setKeyValue("w_SHIP_INVOICE_DATE_FROM", key.getw_SHIP_INVOICE_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("w_SHIP_INVOICE_DATE_TO") && key.getw_SHIP_INVOICE_DATE_TO() != null) {
					msgKey.setKeyValue("w_SHIP_INVOICE_DATE_TO", key.getw_SHIP_INVOICE_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("w_SCDL_SHIP_DATE_FROM") && key.getw_SCDL_SHIP_DATE_FROM() != null) {
					msgKey.setKeyValue("w_SCDL_SHIP_DATE_FROM", key.getw_SCDL_SHIP_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("w_SCDL_SHIP_DATE_TO") && key.getw_SCDL_SHIP_DATE_TO() != null) {
					msgKey.setKeyValue("w_SCDL_SHIP_DATE_TO", key.getw_SCDL_SHIP_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("w_PRINT_FLG") && key.getw_PRINT_FLG() != null) {
					msgKey.setKeyValue("w_PRINT_FLG", key.getw_PRINT_FLG());
				}
				if(msgKeyType.containsKeyColumn("w_SHIP_INVOICE_CTL_NO") && key.getw_SHIP_INVOICE_CTL_NO() != null) {
					msgKey.setKeyValue("w_SHIP_INVOICE_CTL_NO", key.getw_SHIP_INVOICE_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("ROW_COUNT") && key.getROW_COUNT() != null) {
					msgKey.setKeyValue("ROW_COUNT", key.getROW_COUNT());
				}
				if(msgKeyType.containsKeyColumn("PRINT_FLG") && key.getPRINT_FLG() != null) {
					msgKey.setKeyValue("PRINT_FLG", key.getPRINT_FLG());
				}
				if(msgKeyType.containsKeyColumn("VALUE") && key.getVALUE() != null) {
					msgKey.setKeyValue("VALUE", key.getVALUE());
				}
				if(msgKeyType.containsKeyColumn("NAME") && key.getNAME() != null) {
					msgKey.setKeyValue("NAME", key.getNAME());
				}
				if(msgKeyType.containsKeyColumn("OPTION_ID") && key.getOPTION_ID() != null) {
					msgKey.setKeyValue("OPTION_ID", key.getOPTION_ID());
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
					KU0100010Struct key = new KU0100010Struct();
					if(msgKeyType.containsKeyColumn("COPY")) {
						key.setCOPY(msgKey.getKeyValue("COPY"));
					}
					if(msgKeyType.containsKeyColumn("RE_OUT_PUT")) {
						key.setRE_OUT_PUT(msgKey.getKeyValue("RE_OUT_PUT"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_INVOICE_DATE_FROM")) {
						key.setSHIP_INVOICE_DATE_FROM(msgKey.getKeyValue("SHIP_INVOICE_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_INVOICE_DATE_TO")) {
						key.setSHIP_INVOICE_DATE_TO(msgKey.getKeyValue("SHIP_INVOICE_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("SCDL_SHIP_DATE_FROM")) {
						key.setSCDL_SHIP_DATE_FROM(msgKey.getKeyValue("SCDL_SHIP_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("SCDL_SHIP_DATE_TO")) {
						key.setSCDL_SHIP_DATE_TO(msgKey.getKeyValue("SCDL_SHIP_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("r_MasterPrint")) {
						key.setr_MasterPrint(msgKey.getKeyValue("r_MasterPrint"));
					}
					if(msgKeyType.containsKeyColumn("r_CopyPrint")) {
						key.setr_CopyPrint(msgKey.getKeyValue("r_CopyPrint"));
					}
					if(msgKeyType.containsKeyColumn("COUNT")) {
						key.setCOUNT(msgKey.getKeyValue("COUNT"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("c_RE_OUT_PUT")) {
						key.setc_RE_OUT_PUT(msgKey.getKeyValue("c_RE_OUT_PUT"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_PLAN_DATE_TIME_FROM")) {
						key.setSHIP_PLAN_DATE_TIME_FROM(msgKey.getKeyValue("SHIP_PLAN_DATE_TIME_FROM"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_PLAN_DATE_TIME_TO")) {
						key.setSHIP_PLAN_DATE_TIME_TO(msgKey.getKeyValue("SHIP_PLAN_DATE_TIME_TO"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_INVOICE_CTL_NO")) {
						key.setSHIP_INVOICE_CTL_NO(msgKey.getKeyValue("SHIP_INVOICE_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("w_SHIP_INVOICE_NO")) {
						key.setw_SHIP_INVOICE_NO(msgKey.getKeyValue("w_SHIP_INVOICE_NO"));
					}
					if(msgKeyType.containsKeyColumn("w_CUST_CD")) {
						key.setw_CUST_CD(msgKey.getKeyValue("w_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_CUST_NAME")) {
						key.setw_CUST_NAME(msgKey.getKeyValue("w_CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_SHIP_PLAN_DATE")) {
						key.setw_SHIP_PLAN_DATE(msgKey.getKeyValue("w_SHIP_PLAN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("w_SHIP_NO")) {
						key.setw_SHIP_NO(msgKey.getKeyValue("w_SHIP_NO"));
					}
					if(msgKeyType.containsKeyColumn("w_DLV_LOC_CD")) {
						key.setw_DLV_LOC_CD(msgKey.getKeyValue("w_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_DEPARTURE_PLACE")) {
						key.setw_DEPARTURE_PLACE(msgKey.getKeyValue("w_DEPARTURE_PLACE"));
					}
					if(msgKeyType.containsKeyColumn("w_DEPARTURE_DATE")) {
						key.setw_DEPARTURE_DATE(msgKey.getKeyValue("w_DEPARTURE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("w_ARRIVAL_PLACE")) {
						key.setw_ARRIVAL_PLACE(msgKey.getKeyValue("w_ARRIVAL_PLACE"));
					}
					if(msgKeyType.containsKeyColumn("w_ARRIVAL_DATE")) {
						key.setw_ARRIVAL_DATE(msgKey.getKeyValue("w_ARRIVAL_DATE"));
					}
					if(msgKeyType.containsKeyColumn("w_REMARKS_1")) {
						key.setw_REMARKS_1(msgKey.getKeyValue("w_REMARKS_1"));
					}
					if(msgKeyType.containsKeyColumn("w_REMARKS_2")) {
						key.setw_REMARKS_2(msgKey.getKeyValue("w_REMARKS_2"));
					}
					if(msgKeyType.containsKeyColumn("w_TAX_INCLUDE_AMOUNT")) {
						key.setw_TAX_INCLUDE_AMOUNT(msgKey.getKeyValue("w_TAX_INCLUDE_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("w_INVOICE_TAX_AMOUNT")) {
						key.setw_INVOICE_TAX_AMOUNT(msgKey.getKeyValue("w_INVOICE_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("w_TAX_CREDIT_AMOUNT")) {
						key.setw_TAX_CREDIT_AMOUNT(msgKey.getKeyValue("w_TAX_CREDIT_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_CD")) {
						key.setw_ITEM_CD(msgKey.getKeyValue("w_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_NAME")) {
						key.setw_ITEM_NAME(msgKey.getKeyValue("w_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_ODR_NO")) {
						key.setw_ODR_NO(msgKey.getKeyValue("w_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("w_SHIP_QTY")) {
						key.setw_SHIP_QTY(msgKey.getKeyValue("w_SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("w_UNIT_PRICE")) {
						key.setw_UNIT_PRICE(msgKey.getKeyValue("w_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("w_SHIP_ODR_AMOUNT")) {
						key.setw_SHIP_ODR_AMOUNT(msgKey.getKeyValue("w_SHIP_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_CD")) {
						key.setDLV_LOC_CD(msgKey.getKeyValue("DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_SHIP_INVOICE_DATE_FROM")) {
						key.setw_SHIP_INVOICE_DATE_FROM(msgKey.getKeyValue("w_SHIP_INVOICE_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("w_SHIP_INVOICE_DATE_TO")) {
						key.setw_SHIP_INVOICE_DATE_TO(msgKey.getKeyValue("w_SHIP_INVOICE_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("w_SCDL_SHIP_DATE_FROM")) {
						key.setw_SCDL_SHIP_DATE_FROM(msgKey.getKeyValue("w_SCDL_SHIP_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("w_SCDL_SHIP_DATE_TO")) {
						key.setw_SCDL_SHIP_DATE_TO(msgKey.getKeyValue("w_SCDL_SHIP_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("w_PRINT_FLG")) {
						key.setw_PRINT_FLG(msgKey.getKeyValue("w_PRINT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("w_SHIP_INVOICE_CTL_NO")) {
						key.setw_SHIP_INVOICE_CTL_NO(msgKey.getKeyValue("w_SHIP_INVOICE_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("ROW_COUNT")) {
						key.setROW_COUNT(msgKey.getKeyValue("ROW_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("PRINT_FLG")) {
						key.setPRINT_FLG(msgKey.getKeyValue("PRINT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("VALUE")) {
						key.setVALUE(msgKey.getKeyValue("VALUE"));
					}
					if(msgKeyType.containsKeyColumn("NAME")) {
						key.setNAME(msgKey.getKeyValue("NAME"));
					}
					if(msgKeyType.containsKeyColumn("OPTION_ID")) {
						key.setOPTION_ID(msgKey.getKeyValue("OPTION_ID"));
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
