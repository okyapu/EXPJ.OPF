/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0210/src/com/nec/jp/orteus/metamorBase/AA0210/AA0210010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0210;

import com.nec.jp.orteus.metamorBase.AA0210.*;
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
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AA0210010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.1 $ $Date: 2015/10/22 07:15:52 $
 *
 */
//}}user_implement_code_header

public class AA0210010Control
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
	public AA0210010Struct getListvalue(int x) { return (AA0210010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AA0210010Struct getStruct() { return this.struct; }	// Struct�̒l��Ԃ��܂��B
	public AA0210010Struct createStruct() { return new AA0210010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AA0210010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter _csvWriter = null;
	public CsvWriter getCsvWriter(){ return this._csvWriter; }

	private CsvReader _csvReader = null;
	public void setCsvReader(CsvReader cr){ this._csvReader = cr; }

	// �g���q
    private final String EXTENSION_CSV = "csv";

	// �b�r�u���ڔԍ���`
    private final int CSV_COLNO_VEND_CD = 0;
    private final int CSV_COLNO_VEND_NAME = 1;
    private final int CSV_COLNO_VEND_ANAME = 2;
    private final int CSV_COLNO_VEND_KNAME = 3;
    private final int CSV_COLNO_ZIP_CD = 4;
    private final int CSV_COLNO_ADDRESS_1 = 5;
    private final int CSV_COLNO_ADDRESS_2 = 6;
    private final int CSV_COLNO_ADDRESS_K_1 = 7;
    private final int CSV_COLNO_ADDRESS_K_2 = 8;
    private final int CSV_COLNO_TEL = 9;
    private final int CSV_COLNO_FAX = 10;
    private final int CSV_COLNO_EMAIL = 11;
    private final int CSV_COLNO_VEND_ORG = 12;
    private final int CSV_COLNO_VEND_PERSON = 13;
    private final int CSV_COLNO_OWN_ORG_CD = 14;
    private final int CSV_COLNO_OWN_ORG_NAME = 15;
    private final int CSV_COLNO_OWN_PERSON_CD = 16;
    private final int CSV_COLNO_ROUND_TYP = 17;
    private final int CSV_COLNO_TAX_CD = 18;
    private final int CSV_COLNO_TAX_APPLY_TYP = 19;
    private final int CSV_COLNO_TAX_CALC_TYP = 20;
    private final int CSV_COLNO_INSPC_ACPT_APP_TYP = 21;
    private final int CSV_COLNO_ODR_FORM_FLG = 22;
    private final int CSV_COLNO_ODR_EDI_FLG = 23;
    private final int CSV_COLNO_VEND_REM = 24;
    private final int CSV_COLNO_CUR_CD = 25;
    private final int CSV_COLNO_EXCH_TYP = 26;
    private final int CSV_COLNO_IMPORT_TRN_TYP = 27;
    private final int CSV_COLNO_UNIT_COST_RET_FLG = 28;
    // �b�r�u�捞�f�[�^�K�v���ڐ�
    private final int CSV_NECESSARY_COLUMN = 29;
    private final String CSV_COLNO_99 = "99";
    
    /**�S�����R�[�h����**/
	private int _intTotalCount = 0; 
	/**�G���[���R�[�h����**/
	private int _intErrorCount = 0;  
	/**���탌�R�[�h����**/
	private int _intSuccessCount = 0;
	/**���[�j���O����**/
	private int _intWarningCount = 0;
	private String _strSysdate = "";
	// �e��ʂ�struct��ޔ�
	private String _strRdoInsert = "";
	private String _strRdoUpdate = "";
	private String _strRdoDelete = "";
	private String _strDoChk = "";
	
    // ��ЃR�[�h
	private String _COMPANY_CD = null;
	// �G���[��ԋ敪�̃R���{�{�b�N�X�f�[�^
    private ComboStruct _COM_ERR_TYP = null;
    
	// �������z�܂�ߋ敪�̃R���{�{�b�N�X�f�[�^
    private ComboStruct _COM_ROUND_TYP = null;
	// ����œK�p�敪�̃R���{�{�b�N�X�f�[�^
	private ComboStruct _COM_TAX_APPLY_TYP = null;
	// ����Ōv�Z�敪�̃R���{�{�b�N�X�f�[�^
	private ComboStruct _COM_TAX_CALC_TYP = null;
	// �����v��敪�̃R���{�{�b�N�X�f�[�^
	private ComboStruct _COM_INSPC_ACPT_APP_TYP = null;
	// �ב֎�ʂ̃R���{�{�b�N�X�f�[�^
	private ComboStruct _COM_EXCH_TYP = null;
	// �A������敪�̃R���{�{�b�N�X�f�[�^
	private ComboStruct _COM_IMPORT_TRN_TYP = null;
	// �̔��P���k�y�t���O�̃R���{�{�b�N�X�f�[�^
	private ComboStruct _COM_UNIT_COST_RET_FLG = null;
    
	private AA0210010Struct tempStruct = null;
	
	/**
	 * �G���[��ԋ敪���Q�b�g
	 * @return
	*/
	public ComboStruct getComErrTyp() {
		return _COM_ERR_TYP;
	}
	/**
	 * �G���[��ԋ敪���Z�b�g
	 * @param cs
	*/
	public void setComErrTyp(ComboStruct cs){
		_COM_ERR_TYP = cs;
	}
	
	/**
	 * �������z�܂�ߋ敪���Q�b�g
	 * @return
	*/
	public ComboStruct getComRoundTyp() {
		return _COM_ROUND_TYP;
	}
	/**
	 * �������z�܂�ߋ敪���Z�b�g
	 * @param cs
	*/
	public void setComRoundTyp(ComboStruct cs){
		_COM_ROUND_TYP = cs;
	}
	
	/**
	 * ����œK�p�敪���Q�b�g
	 * @return
	*/
	public ComboStruct getComTaxApplyTyp() {
		return _COM_TAX_APPLY_TYP;
	}
	/**
	 * ����œK�p�敪���Z�b�g
	 * @param cs
	*/
	public void setComTaxApplyTyp(ComboStruct cs){
		_COM_TAX_APPLY_TYP = cs;
	}
	
	/**
	 * ����Ōv�Z�敪���Q�b�g
	 * @return
	*/
	public ComboStruct getComTaxCalcTyp() {
		return _COM_TAX_CALC_TYP;
	}
	/**
	 * ����Ōv�Z�敪���Z�b�g
	 * @param cs
	*/
	public void setComTaxCalcTyp(ComboStruct cs){
		_COM_TAX_CALC_TYP = cs;
	}
	
	/**
	 * �����v��敪���Q�b�g
	 * @return
	*/
	public ComboStruct getComInspcAcptAppTyp() {
		return _COM_INSPC_ACPT_APP_TYP;
	}
	/**
	 * �����v��敪���Z�b�g
	 * @param cs
	*/
	public void setComInspcAcptAppTyp(ComboStruct cs){
		_COM_INSPC_ACPT_APP_TYP = cs;
	}
	
	/**
	 * �ב֎�ʂ��Q�b�g
	 * @return
	*/
	public ComboStruct getComExchTyp() {
		return _COM_EXCH_TYP;
	}
	/**
	 * �ב֎�ʂ��Z�b�g
	 * @param cs
	*/
	public void setComExchTyp(ComboStruct cs){
		_COM_EXCH_TYP = cs;
	}
	
	/**
	 * �A������敪���Q�b�g
	 * @return
	*/
	public ComboStruct getComImportTrnTyp() {
		return _COM_IMPORT_TRN_TYP;
	}
	/**
	 * �A������敪���Z�b�g
	 * @param cs
	*/
	public void setComImportTrnTyp(ComboStruct cs){
		_COM_IMPORT_TRN_TYP = cs;
	}
	
	/**
	 * �̔��P���k�y�t���O���Q�b�g
	 * @return
	*/
	public ComboStruct getComUnitCostRetFlg() {
		return _COM_UNIT_COST_RET_FLG;
	}
	/**
	 * �̔��P���k�y�t���O���Z�b�g
	 * @param cs
	*/
	public void setComUnitCostRetFlg(ComboStruct cs){
		_COM_UNIT_COST_RET_FLG = cs;
	}

    /**
     * ���O���b�Z�[�W�ݒ�
     * @param �o�̓��b�Z�[�W
     */
	private void setSyslogConfig(String message) {
		ExpjMessage emsg = new ExpjMessage("ZZ01006", message);
		sysLog.config(emsg, getsysUSER_CD());
	}
	
	/**
     * ���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
     * @param code ���b�Z�[�W�R�[�h
     * @param value1   �u��������P
     */
	private void setInfoMessage(String code, String value1) {
		ExpjMessage emsg = new ExpjMessage(code, value1);
		msgStruct.addInfo(emsg);
		sysLog.info(emsg, sysUSER_CD);
	}

	/**
	 * �Ɩ����W�b�N�̃C���t�H���[�V�����ݒ菈����؂�o���Ċ֐���
	 * @param code
	 * @param value1
	 */
	private void setInfoMessage(String code, String value1, String value2, String value3) {
		ExpjMessage emsg = new ExpjMessage(code, value1, value2, value3);
		msgStruct.addInfo(emsg);
		sysLog.info(emsg, sysUSER_CD);
	}

	/**
	 * �Ɩ����W�b�N�̃G���[���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * 
	 * @param code   ���b�Z�[�W�R�[�h
	 * @param value1   �u��������P
	 * @param value2   �u��������Q
	 */
	private void setErrorMessage(String code, String value1, String value2) {
		ExpjMessage emsg = new ExpjMessage(code, value1, value2);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, sysUSER_CD);
	}
	
	/**
	 * �Ɩ����W�b�N�̃G���[���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * @param code ���b�Z�[�W�R�[�h
	 * @param value1 �u��������P
	 * @param value2 �u��������2
	 * @param value3 �u��������3
	 */
	private void setErrorMessage(String code, String value1, String value2, String value3) {
		ExpjMessage emsg = new ExpjMessage(code, value1, value2, value3);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, sysUSER_CD);
	}
	
	/**
	 * �Ɩ����W�b�N�̃��[�j���O���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * @param code ���b�Z�[�W�R�[�h
	 * @param msg1
	 * @param msg2
	 */
	private void setWarningMessage(String code, String msg1, String msg2) {
		ExpjMessage emsg = new ExpjMessage(code, msg1, msg2);
		msgStruct.addWarn(emsg);
		sysLog.info(emsg, sysUSER_CD);
	}
	
	/**
     * SQLException�G���[���b�Z�[�W�ݒ�
     * @param SQLException
     */
    private void setSqlExceptionMsg(SQLException e) throws ExpjException
    {
        ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
        sysLog.severe(emsg, getsysUSER_CD());
        ExpjException ee = new ExpjException(e, emsg);
        throw ee;
    }
    
	/**
     * CSV�捞���ʏ��ǉ�
     *
     * @return	�Ȃ�
     */
	private void csvExport(String errlineNo, String errItemNo,
			String errTyp, AA0210010Struct target_struct, String fieldName,	String strMessage) {
		// ���b�Z�[�W���i�[�p
		AA0210010Struct structTemp = new AA0210010Struct();
		// �����ꍀ�ڎ擾�Ή�
		String locale = CoreTools.getLocale(sysUSER_CD);
		ExpjMessage emsg = null;
		// ������L�[�Z�b�g
		if (errItemNo != CSV_COLNO_99) {
			// {0}���ڂ� {1}����
			emsg = new ExpjMessage("AH00045", errlineNo, errItemNo);
		} else {
			// {0}����
			emsg = new ExpjMessage("AA01520", errlineNo);
		}
		// �G���[�ӏ�
		structTemp.setl_ERR_ADR(emsg.getMessage(locale));		
		// �G���[�敪
		structTemp.setl_ERR_TYP(errTyp);
		// �����R�[�h
		structTemp.setl_VEND_CD(target_struct.getl_VEND_CD());
		structTemp.setOUT_VEND_CD(target_struct.getOUT_VEND_CD());
		// �G���[���ږ�
		structTemp.setl_ERROR_FIELD_NAME(fieldName);
		// �G���[���e
		structTemp.setl_ERR_TEXT(strMessage);

		// ���X�g�֏��ǉ�
		list.add(structTemp);
		return;
    }
    
    /**
     * �b�r�u�f�[�^�擾�ƃ��X�g�f�[�^��
     *
     * @return	CSV�f�[�^���X�g
     */
	private List readCsvData() throws ExpjException {

		String[] strsCsvData = null;
		List listCsv = null;
		List tempList = null;
		try {
			// �b�r�u�f�[�^�̃A�b�v���[�h
			strsCsvData = (String[]) _csvReader.lineRead();
			if (null != strsCsvData) {
				setSyslogConfig("strsCsvData.length:" + strsCsvData.length);

				// �f�[�^�����Ƃ���strsCsvData.length�͎g���Ȃ��B���ۂ̍s���{�T�s���炢�炵��
				listCsv = new ArrayList(0);
				AA0210010Struct structCsv = null;
				Vector v = null;
				int intColNum = 0;
				int intColNumForCheck = 0;

				for (int i = 0; i < strsCsvData.length; i++) {
					// ���s�݂̂̃��R�[�h��EOF�Ɣ��f���܂�
					if (strsCsvData[i].length() == 0) {
						break;
					}

					// ���R�[�h�����ږ��ɂ΂炷
					structCsv = new AA0210010Struct();
					v = _csvReader.importCSVLine(strsCsvData[i]);
					if (null != v) {
						// ���ڐ��`�F�b�N
						intColNum = v.size();
						if (CSV_NECESSARY_COLUMN == intColNum) {
							// �b�r�u�̍��ڂ����X�g�f�[�^��
							structCsv.setw_COLUMN_FLG((String) null);
							// ��ЃR�[�h
							structCsv.setl_COMPANY_CD(_COMPANY_CD);
							// �����R�[�h
							structCsv.setOUT_VEND_CD((String)v.get(CSV_COLNO_VEND_CD));
                            // \�̏ꍇ�A\\�Œu������
                            structCsv.setl_VEND_CD(CsvInCheck.replaceSlash(structCsv.getOUT_VEND_CD()));
							// ����於��
							structCsv.setl_VEND_NAME((String)v.get(CSV_COLNO_VEND_NAME));
							// ����旪��
							structCsv.setl_VEND_ANAME((String)v.get(CSV_COLNO_VEND_ANAME));
							// �����J�i����
							structCsv.setl_VEND_KNAME((String)v.get(CSV_COLNO_VEND_KNAME));
							// �X�֔ԍ�
							structCsv.setl_ZIP_CD((String)v.get(CSV_COLNO_ZIP_CD));
							// �Z��1
							structCsv.setl_ADDRESS_1((String)v.get(CSV_COLNO_ADDRESS_1));
							// �Z��2
							structCsv.setl_ADDRESS_2((String)v.get(CSV_COLNO_ADDRESS_2));
							// �Z��(�J�i)1
							structCsv.setl_ADDRESS_K_1((String)v.get(CSV_COLNO_ADDRESS_K_1));
							// �Z��(�J�i)2
							structCsv.setl_ADDRESS_K_2((String)v.get(CSV_COLNO_ADDRESS_K_2));
							// �d�b�ԍ�
							structCsv.setl_TEL((String)v.get(CSV_COLNO_TEL));
							// FAX�ԍ�
							structCsv.setl_FAX((String)v.get(CSV_COLNO_FAX));
							// ���[���A�h���X
							structCsv.setl_EMAIL((String)v.get(CSV_COLNO_EMAIL));
							// �����S������
							structCsv.setl_VEND_ORG((String)v.get(CSV_COLNO_VEND_ORG));
							// �����S����
							structCsv.setl_VEND_PERSON((String)v.get(CSV_COLNO_VEND_PERSON));
							// ���ВS������R�[�h
							structCsv.setl_OWN_ORG_CD((String)v.get(CSV_COLNO_OWN_ORG_CD));
							// ���ВS�����喼
							structCsv.setl_OWN_ORG_NAME((String)v.get(CSV_COLNO_OWN_ORG_NAME));
							// ���ВS���҃R�[�h
							if (CsvInCheck.isNull((String)v.get(CSV_COLNO_OWN_PERSON_CD))) {
                            	structCsv.setl_OWN_PERSON_CD(sysUSER_CD);
                            }else{
                            	structCsv.setl_OWN_PERSON_CD((String)v.get(CSV_COLNO_OWN_PERSON_CD));
                            }
							// �u���ВS���҃R�[�h�v �����͂���̏ꍇ�ŁA�u���O�C�����[�U�̏�����ЃR�[�h�v�u���ВS���҃R�[�h�v�� [���[�U�}�X�^]���������A���݂��Ȃ��ꍇ
							if (!CsvInCheck.isNull(structCsv.getl_OWN_PERSON_CD())) {
								tempList = entity.mselectOWN_PERSON_CD.read(conn, structCsv);
								if (tempList.size() > 0) {
									structCsv.setl_OWN_PERSON_NAME(((AA0210010Struct)tempList.get(0)).getl_OWN_PERSON_NAME());
								}
							}
							// �������z�܂�ߋ敪
							if (CsvInCheck.isNull((String)v.get(CSV_COLNO_ROUND_TYP))) {
                            	structCsv.setl_ROUND_TYP("1");
                            }else{
                            	structCsv.setl_ROUND_TYP((String)v.get(CSV_COLNO_ROUND_TYP));
                            }
							// ����ŃR�[�h
							structCsv.setl_TAX_CD((String)v.get(CSV_COLNO_TAX_CD));
							// ����œK�p�敪
							if (CsvInCheck.isNull((String)v.get(CSV_COLNO_TAX_APPLY_TYP))) {
                            	structCsv.setl_TAX_APPLY_TYP("2");
                            }else{
                            	structCsv.setl_TAX_APPLY_TYP((String)v.get(CSV_COLNO_TAX_APPLY_TYP));
                            }							
							// ����Ōv�Z�敪
							if (CsvInCheck.isNull((String)v.get(CSV_COLNO_TAX_CALC_TYP))) {
                            	structCsv.setl_TAX_CALC_TYP("1");
                            }else{
                            	structCsv.setl_TAX_CALC_TYP((String)v.get(CSV_COLNO_TAX_CALC_TYP));
                            }
							// �����v��敪
							if (CsvInCheck.isNull((String)v.get(CSV_COLNO_INSPC_ACPT_APP_TYP))) {
                            	structCsv.setl_INSPC_ACPT_APP_TYP("1");
                            }else{
                            	structCsv.setl_INSPC_ACPT_APP_TYP((String)v.get(CSV_COLNO_INSPC_ACPT_APP_TYP));
                            }					
							// �����������t���O
							if(CsvInCheck.isNull((String)v.get(CSV_COLNO_ODR_FORM_FLG))){
								structCsv.setl_ODR_FORM_FLG("0");
							}else{
								structCsv.setl_ODR_FORM_FLG((String)v.get(CSV_COLNO_ODR_FORM_FLG));
							}
							// EDI�����t���O
							if(CsvInCheck.isNull((String)v.get(CSV_COLNO_ODR_EDI_FLG))){
								structCsv.setl_ODR_EDI_FLG("0");
							}else{
								structCsv.setl_ODR_EDI_FLG((String)v.get(CSV_COLNO_ODR_EDI_FLG));
							}
							// ���l
							structCsv.setl_VEND_REM((String)v.get(CSV_COLNO_VEND_REM));
							// ����ʉ݃R�[�h(�ȗ����̐ݒ�l���Ō�Ɏ�������)
							structCsv.setl_CUR_CD((String)v.get(CSV_COLNO_CUR_CD));
							// �ב֎��
							if (CsvInCheck.isNull((String)v.get(CSV_COLNO_EXCH_TYP))) {
                            	structCsv.setl_EXCH_TYP("1");
                            }else{
                            	structCsv.setl_EXCH_TYP((String)v.get(CSV_COLNO_EXCH_TYP));
                            }
							// �A������敪
							if (CsvInCheck.isNull((String)v.get(CSV_COLNO_IMPORT_TRN_TYP))) {
                            	structCsv.setl_IMPORT_TRN_TYP("1");
                            }else{
                            	structCsv.setl_IMPORT_TRN_TYP((String)v.get(CSV_COLNO_IMPORT_TRN_TYP));
                            }
							// �̔��P���k�y�t���O
							if (CsvInCheck.isNull((String)v.get(CSV_COLNO_UNIT_COST_RET_FLG))) {
                            	structCsv.setl_UNIT_COST_RETROACTION_FLG("0");
                            }else{
                            	structCsv.setl_UNIT_COST_RETROACTION_FLG((String)v.get(CSV_COLNO_UNIT_COST_RET_FLG));
                            }
							// ����ʉ݃R�[�h(�ȗ���)
		    				if(CsvInCheck.isNull(structCsv.getl_CUR_CD())){
		    					tempStruct = new AA0210010Struct();
		    					tempStruct.setl_COMPANY_CD(_COMPANY_CD);
		    					tempList = entity.mselectCurCd.read(conn, tempStruct);
		    					if (tempList.size() > 0) {
		    						tempStruct = (AA0210010Struct) tempList.get(0);
		    						structCsv.setl_CUR_CD(tempStruct.getl_HOME_CUR_CD());
		    					}
		    				}
						} else {
							// ��ЃR�[�h
							structCsv.setl_COMPANY_CD(_COMPANY_CD);
							// �����R�[�h
							structCsv.setOUT_VEND_CD((String)v.get(CSV_COLNO_VEND_CD));
                            // \�̏ꍇ�A\\�Œu������
                            structCsv.setl_VEND_CD(CsvInCheck.replaceSlash(structCsv.getOUT_VEND_CD()));
							// ���ڐ����K�v���ڐ���薢���A���ڐ����K�v���ڐ���葽�����̏ꍇ
							structCsv.setw_COLUMN_FLG(String.valueOf(intColNum));
						}
						intColNumForCheck ++;
						structCsv.setw_COLUMN(String.valueOf(intColNumForCheck));
						// ���X�g�ǉ�
						listCsv.add(structCsv);
					} else {
						// �x�N�^�[�������s�G���[
						setSyslogConfig("csvReader.Vector was Failed... line:" + strsCsvData[i]);
						listCsv = null;
						break;
					}
				}
				// �b�r�u�f�[�^�����i�^�C�g���s�͏Ȃ��j
				if ((listCsv == null) || (listCsv.size() <= 0)) {
					// �捞���s�܂��̓f�[�^�Ȃ�
					setErrorMessage("AH00042", "0", "0");
					listCsv = null;
				} else {
					// �b�r�u�Ǎ��݌������O�\��
					ExpjMessage emsg = new ExpjMessage("AH00043", "" + listCsv.size());
					sysLog.config(emsg, getsysUSER_CD());
				}
			}
		} catch(Exception e){
            ExpjMessage emsg = new ExpjMessage( "AH00042", "0", "0");
            sysLog.severe(emsg, getsysUSER_CD());
            ExpjException ee = new ExpjException(e, emsg);
            throw ee;
        }
		return listCsv;
	}
	
	/**
     * �t�@�C���l�[�~���O
     *
     * @return  ����:true / �G���[:false
     */
	private boolean chkOutputFilePath() throws BusinessProcessException,
			FoundationException {
		String filePath = null;
		try {
			// �o�̓t�@�C���l�[�~���O
			PrivateConfig pc = new PrivateConfig(conn);
			// �������O�t�@�C�����擾(�V�X�e���p�����[�^���擾)
			String CsvCancelFileName = pc.getString("J_VEND_CTRL_CANCEL");
			if (null == CsvCancelFileName || "".equals(CsvCancelFileName)) {
				msgStruct.clear();
				// �G���[���b�Z�[�W�\��
				ExpjMessage emsg = new ExpjMessage("AA01521");
				msgStruct.addError(emsg);
				sysLog.severe(emsg, getsysUSER_CD());
				return false;
			}
			// �t�@�C���l�[�~���O
			FileNaming fnm = new FileNaming();
			// ���[�U
			fnm.setUser(getsysUSER_CD());
			// �g���q
			fnm.setExtension(EXTENSION_CSV);
			// �f�B���N�g��
			fnm.setDirectory(CsvCancelFileName);
			filePath = fnm.naming();
			if (null == filePath || "".equals(filePath)) {
				msgStruct.clear();
				// �G���[���b�Z�[�W�\��
				ExpjMessage emsg = new ExpjMessage("AA01522");
				msgStruct.addError(emsg);
				sysLog.severe(emsg, getsysUSER_CD());
				return false;
			}
		} catch (Exception e) {
			ExpjMessage emsg = new ExpjMessage( "AH00042", "0", "0");
            sysLog.severe(emsg, getsysUSER_CD());
            ExpjException ee = new ExpjException(e, emsg);
            throw ee;
		}
		struct.setCANCEL_FILE(filePath);
		return true;
	}
	
	/**
     * �b�r�u�f�[�^���e�`�F�b�N����
     *
     * @param	listCsv	CSV�f�[�^���X�g
     * @param	listCsvUpdate�@�X�V�pCSV�f�[�^���X�g
     */
	private boolean checkCsvData(List listCsv) throws BusinessProcessException, FoundationException
	{
		// �����ꍀ�ڎ擾�Ή�
		String locale = CoreTools.getLocale(sysUSER_CD);
		String property = "OrteusUserDic";
		ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
		List tempList = null;
		boolean checkFlag = true;
		
		// ���ډߕs��
		String strCsvColCom = CoreTools.getRBString("Expj.Cmt3099", resource);
		// �����R�[�h
		String strVendCd = CoreTools.getRBString("Expj.VEND_CD", resource);
		// ����於��
		String strVendName = CoreTools.getRBString("Expj.Cmt1064", resource);
		// ����旪��
		String strVendAname = CoreTools.getRBString("Expj.VEND_ANAME", resource);
		// �����J�i����
		String strVendKname = CoreTools.getRBString("Expj.VEND_KNAME", resource);
		// �X�֔ԍ�
		String strZipCd = CoreTools.getRBString("Expj.ZIP_CD", resource);
		// �Z��1
		String strAddress1 = CoreTools.getRBString("Expj.ADDRESS_1", resource);
		// �Z��2
		String strAddress2 = CoreTools.getRBString("Expj.ADDRESS_2", resource);
		// �Z��(�J�i)1
		String strAddressK1 = CoreTools.getRBString("Expj.ADDRESS_K_1", resource);
		// �Z��(�J�i)2
		String strAddressK2 = CoreTools.getRBString("Expj.ADDRESS_K_2", resource);
		// �d�b�ԍ�
		String strTel = CoreTools.getRBString("Expj.TEL", resource);
		// FAX�ԍ�
		String strFax = CoreTools.getRBString("Expj.FAX", resource);
		// ���[���A�h���X
		String strEmail = CoreTools.getRBString("Expj.ADDRESS", resource);
		// �����S������
		String strVendOrg = CoreTools.getRBString("Expj.VEND_ORG", resource);
		// �����S����
		String strVendPerson = CoreTools.getRBString("Expj.VEND_PERSON", resource);
		// ���ВS������R�[�h
		String strOwnOrgCd = CoreTools.getRBString("Expj.OWN_ORG_CD", resource);
		// ���ВS�����喼
		String strOwnOrgName = CoreTools.getRBString("Expj.OWN_ORG_NAME", resource);
		// ���ВS���҃R�[�h
		String strOwnPersonCd = CoreTools.getRBString("Expj.OWN_PERSON_CD", resource);
		// �������z�܂�ߋ敪
		String strRoundTyp = CoreTools.getRBString("Expj.Cmt5311", resource);
		// ����ŃR�[�h
		String strTaxCd = CoreTools.getRBString("Expj.TAX_CD_1", resource);
		// ����œK�p�敪
		String strTaxApplyTyp = CoreTools.getRBString("Expj.TAX_APPLY_TYP", resource);
		// ����Ōv�Z�敪
		String strTaxCalcTyp = CoreTools.getRBString("Expj.TAX_CALC_TYP", resource);
		// �����v��敪
		String strInspcAcptAppTyp = CoreTools.getRBString("Expj.INSPC_ACPT_APP_TYP", resource);
		// �����������t���O
		String strOdrFormFlg = CoreTools.getRBString("Expj.ODR_FORM_FLG", resource);
		// EDI�����t���O
		String strOdrEdiFlg = CoreTools.getRBString("Expj.ODR_EDI_FLG", resource);
		// ���l
		String strVendRem = CoreTools.getRBString("Expj.VEND_REM", resource);
		// ����ʉ݃R�[�h
		String strCurCd = CoreTools.getRBString("Expj.CUR_CD_1", resource);
		// �ב֎��
		String strExchTyp = CoreTools.getRBString("Expj.EXCH_TYP", resource);
		// �A������敪
		String strImportTrnTyp = CoreTools.getRBString("Expj.IMPORT_TRN_TYP", resource);
		// �̔��P���k�y�t���O
		String strUnitCostRetFlg = CoreTools.getRBString("Expj.UNIT_COST_RETROACTION_FLG", resource);

		try {
			ExpjMessage emsg = null;
			AA0210010Struct structCsv = null;

			for (int i = 0; i < listCsv.size(); i++) {
				// ��������
				_intTotalCount++;

				// CSV���擾
				structCsv = (AA0210010Struct) listCsv.get(i);

				// ���b�r�u���ڃ`�F�b�N
				// ���ڐ��`�F�b�N
				if (structCsv.getw_COLUMN_FLG() != null
						&& !("").equals(structCsv.getw_COLUMN_FLG()) && !"true".equals(_strRdoDelete)) {
					// ���ڂɕs��������ꍇ
					if (Calculate.compare(String.valueOf(CSV_NECESSARY_COLUMN),
							structCsv.getw_COLUMN_FLG().toString()) > 0) {
						emsg = new ExpjMessage("AA01500", "" + structCsv.getw_COLUMN_FLG());
						csvExport(
								structCsv.getw_COLUMN(),
								CSV_COLNO_99,
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								structCsv,
								strCsvColCom,
								emsg.getMessage(locale));
						_intErrorCount++;
						continue;
					}
					// ���ڂ��K�v���ȏ�̏ꍇ
					else if (Calculate.compare(String.valueOf(CSV_NECESSARY_COLUMN),
							structCsv.getw_COLUMN_FLG().toString()) < 0) {
						emsg = new ExpjMessage("AA01519", "" + structCsv.getw_COLUMN_FLG());
						csvExport(
								structCsv.getw_COLUMN(),
								CSV_COLNO_99,
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								structCsv,
								strCsvColCom,
								emsg.getMessage(locale));
						_intErrorCount++;
						continue;
					}
				}

				// 1.�����R�[�h
				// NULL�̏ꍇ
				if (CsvInCheck.isNull(structCsv.getOUT_VEND_CD())) {
					emsg = new ExpjMessage("AA01530", strVendCd);
					csvExport(structCsv.getw_COLUMN(),
							String.valueOf(CSV_COLNO_VEND_CD + 1),
							String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
							structCsv,
							strVendCd,
							emsg.getMessage(locale));
					_intErrorCount++;
					continue;
				} 
				// ����26���ȏ�̏ꍇ
				if (CsvInCheck.strLengthChk(structCsv.getOUT_VEND_CD()) > 25) {
					emsg = new ExpjMessage("AA01501");
					csvExport(structCsv.getw_COLUMN(),
							String.valueOf(CSV_COLNO_VEND_CD + 1),
							String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
							structCsv,
							strVendCd,
							emsg.getMessage(locale));
					_intErrorCount++;
					continue;
				}
				// �֑����������͂���Ă����ꍇ
				if (CsvInCheck.chkHankaku(structCsv.getOUT_VEND_CD())) {
					emsg = new ExpjMessage("AA01524");
					csvExport(structCsv.getw_COLUMN(),
							String.valueOf(CSV_COLNO_VEND_CD + 1),
							String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
							structCsv,
							strVendCd,
							emsg.getMessage(locale));
					_intErrorCount++;
					continue;
				}
				
                // ���o�^OR�X�V���W�I�{�^�����I�����ꂽ�Ƃ��̂݃`�F�b�N���s���B(���o�^OR�X�V��)��
                if (("true").equals(_strRdoInsert) == true || ("true").equals(_strRdoUpdate) == true )
                {
                	// 2.����於��
    				// NULL�̏ꍇ
    				if (CsvInCheck.isNull(structCsv.getl_VEND_NAME())) {
    					emsg = new ExpjMessage("AA01530", strVendName);
    					csvExport(structCsv.getw_COLUMN(),
    							String.valueOf(CSV_COLNO_VEND_NAME + 1),
    							String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    							structCsv,
    							strVendName,
    							emsg.getMessage(locale));
    					_intErrorCount++;
    					continue;
    				} 
    				// ����81���ȏ�̏ꍇ
    				if (CsvInCheck.strLengthChk(structCsv.getl_VEND_NAME()) > 80) {
    					emsg = new ExpjMessage("AA01501");
    					csvExport(structCsv.getw_COLUMN(),
    							String.valueOf(CSV_COLNO_VEND_NAME + 1),
    							String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    							structCsv,
    							strVendName,
    							emsg.getMessage(locale));
    					_intErrorCount++;
    					continue;
    				}
    				// �֑����������͂���Ă����ꍇ
    				if (CsvInCheck.chkHankaku(structCsv.getl_VEND_NAME())) {
    					emsg = new ExpjMessage("AA01524");
    					csvExport(structCsv.getw_COLUMN(),
    							String.valueOf(CSV_COLNO_VEND_NAME + 1),
    							String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    							structCsv, strVendName,
    							emsg.getMessage(locale));
    					_intErrorCount++;
    					continue;
    				}
    				
    				// 3.����旪��
    				// NULL�̏ꍇ
    				if (CsvInCheck.isNull(structCsv.getl_VEND_ANAME())) {
    					emsg = new ExpjMessage("AA01530", strVendAname);
    					csvExport(structCsv.getw_COLUMN(),
    							String.valueOf(CSV_COLNO_VEND_ANAME + 1),
    							String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    							structCsv,
    							strVendAname,
    							emsg.getMessage(locale));
    					_intErrorCount++;
    					continue;
    				} 
    				// ����41���ȏ�̏ꍇ
    				if (CsvInCheck.strLengthChk(structCsv.getl_VEND_ANAME()) > 40) {
    					emsg = new ExpjMessage("AA01501");
    					csvExport(structCsv.getw_COLUMN(),
    							String.valueOf(CSV_COLNO_VEND_ANAME + 1),
    							String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    							structCsv,
    							strVendAname,
    							emsg.getMessage(locale));
    					_intErrorCount++;
    					continue;
    				}
    				// �֑����������͂���Ă����ꍇ
    				if (CsvInCheck.chkHankaku(structCsv.getl_VEND_ANAME())) {
    					emsg = new ExpjMessage("AA01524");
    					csvExport(structCsv.getw_COLUMN(),
    							String.valueOf(CSV_COLNO_VEND_ANAME + 1),
    							String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    							structCsv,
    							strVendAname,
    							emsg.getMessage(locale));
    					_intErrorCount++;
    					continue;
    				}
    				
    				// 4.�����J�i����
    				if(!CsvInCheck.isNull(structCsv.getl_VEND_KNAME())){
    					// ����41���ȏ�̏ꍇ
    					if (CsvInCheck.strLengthChk(structCsv.getl_VEND_KNAME()) > 40) {
    						emsg = new ExpjMessage("AA01501");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_VEND_KNAME + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strVendKname,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    					// �֑����������͂���Ă����ꍇ
    					if (CsvInCheck.chkHankaku(structCsv.getl_VEND_KNAME())) {
    						emsg = new ExpjMessage("AA01524");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_VEND_KNAME + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strVendKname,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 5.�X�֔ԍ�
    				if(!CsvInCheck.isNull(structCsv.getl_ZIP_CD())){
    					// ����26���ȏ�̏ꍇ
    					if (CsvInCheck.strLengthChk(structCsv.getl_ZIP_CD()) > 25) {
    						emsg = new ExpjMessage("AA01501");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_ZIP_CD + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strZipCd,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    					// �֑����������͂���Ă����ꍇ
    					if (CsvInCheck.chkHankaku(structCsv.getl_ZIP_CD())) {
    						emsg = new ExpjMessage("AA01524");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_ZIP_CD + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strZipCd,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 6.�Z��1
    				// NULL�̏ꍇ
    				if (CsvInCheck.isNull(structCsv.getl_ADDRESS_1())) {
    					emsg = new ExpjMessage("AA01530", strAddress1);
    					csvExport(structCsv.getw_COLUMN(),
    							String.valueOf(CSV_COLNO_ADDRESS_1 + 1),
    							String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    							structCsv,
    							strAddress1,
    							emsg.getMessage(locale));
    					_intErrorCount++;
    					continue;
    				} 
    				// ����81���ȏ�̏ꍇ
    				if (CsvInCheck.strLengthChk(structCsv.getl_ADDRESS_1()) > 80) {
    					emsg = new ExpjMessage("AA01501");
    					csvExport(structCsv.getw_COLUMN(),
    							String.valueOf(CSV_COLNO_ADDRESS_1 + 1),
    							String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    							structCsv,
    							strAddress1,
    							emsg.getMessage(locale));
    					_intErrorCount++;
    					continue;
    				}
    				// �֑����������͂���Ă����ꍇ
    				if (CsvInCheck.chkHankaku(structCsv.getl_ADDRESS_1())) {
    					emsg = new ExpjMessage("AA01524");
    					csvExport(structCsv.getw_COLUMN(),
    							String.valueOf(CSV_COLNO_ADDRESS_1 + 1),
    							String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    							structCsv,
    							strAddress1,
    							emsg.getMessage(locale));
    					_intErrorCount++;
    					continue;
    				}
    				
    				// 7.�Z��2
    				if(!CsvInCheck.isNull(structCsv.getl_ADDRESS_2())){
    					// ����81���ȏ�̏ꍇ
    					if (CsvInCheck.strLengthChk(structCsv.getl_ADDRESS_2()) > 80) {
    						emsg = new ExpjMessage("AA01501");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_ADDRESS_2 + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strAddress2,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    					// �֑����������͂���Ă����ꍇ
    					if (CsvInCheck.chkHankaku(structCsv.getl_ADDRESS_2())) {
    						emsg = new ExpjMessage("AA01524");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_ADDRESS_2 + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strAddress2,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 8.�Z��(�J�i)1
    				if(!CsvInCheck.isNull(structCsv.getl_ADDRESS_K_1())){
    					// ����81���ȏ�̏ꍇ
    					if (CsvInCheck.strLengthChk(structCsv.getl_ADDRESS_K_1()) > 80) {
    						emsg = new ExpjMessage("AA01501");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_ADDRESS_K_1 + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strAddressK1,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    					// �֑����������͂���Ă����ꍇ
    					if (CsvInCheck.chkHankaku(structCsv.getl_ADDRESS_K_1())) {
    						emsg = new ExpjMessage("AA01524");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_ADDRESS_K_1 + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strAddressK1,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 9.�Z��(�J�i)2
    				if(!CsvInCheck.isNull(structCsv.getl_ADDRESS_K_2())){
    					// ����81���ȏ�̏ꍇ
    					if (CsvInCheck.strLengthChk(structCsv.getl_ADDRESS_K_2()) > 80) {
    						emsg = new ExpjMessage("AA01501");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_ADDRESS_K_2 + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strAddressK2,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    					// �֑����������͂���Ă����ꍇ
    					if (CsvInCheck.chkHankaku(structCsv.getl_ADDRESS_K_2())) {
    						emsg = new ExpjMessage("AA01524");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_ADDRESS_K_2 + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strAddressK2,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 10.�d�b�ԍ�
    				if(!CsvInCheck.isNull(structCsv.getl_TEL())){
    					// ����21���ȏ�̏ꍇ
    					if (CsvInCheck.strLengthChk(structCsv.getl_TEL()) > 20) {
    						emsg = new ExpjMessage("AA01501");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_TEL + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strTel,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    					// ���l�A�n�C�t���ȊO����͂����ꍇ
    					if (!CsvInCheck.chkTelOrFax(structCsv.getl_TEL())) {
    						emsg = new ExpjMessage("AA00107");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_TEL + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strTel,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 11.FAX�ԍ�
    				if(!CsvInCheck.isNull(structCsv.getl_FAX())){
    					// ����21���ȏ�̏ꍇ
    					if (CsvInCheck.strLengthChk(structCsv.getl_FAX()) > 20) {
    						emsg = new ExpjMessage("AA01501");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_FAX + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strFax,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    					// ���l�A�n�C�t���ȊO����͂����ꍇ
    					if (!CsvInCheck.chkTelOrFax(structCsv.getl_FAX())) {
    						emsg = new ExpjMessage("AA00108");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_FAX + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strFax,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 12.���[���A�h���X
    				if(!CsvInCheck.isNull(structCsv.getl_EMAIL())){
    					// ����41���ȏ�̏ꍇ
    					if (CsvInCheck.strLengthChk(structCsv.getl_EMAIL()) > 40) {
    						emsg = new ExpjMessage("AA01501");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_EMAIL + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strEmail,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    					// �֑������u\�v�����͂���Ă����ꍇ
    					if (CsvInCheck.chkEmail(structCsv.getl_EMAIL())) {
    						emsg = new ExpjMessage("AA00109");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_EMAIL + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strEmail,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 13.�����S������
    				if(!CsvInCheck.isNull(structCsv.getl_VEND_ORG())){
    					// ����81���ȏ�̏ꍇ
    					if (CsvInCheck.strLengthChk(structCsv.getl_VEND_ORG()) > 80) {
    						emsg = new ExpjMessage("AA01501");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_VEND_ORG + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strVendOrg,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    					// �֑����������͂���Ă����ꍇ
    					if (CsvInCheck.chkHankaku(structCsv.getl_VEND_ORG())) {
    						emsg = new ExpjMessage("AA01524");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_VEND_ORG + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strVendOrg,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 14.�����S����
    				if(!CsvInCheck.isNull(structCsv.getl_VEND_PERSON())){
    					// ����41���ȏ�̏ꍇ
    					if (CsvInCheck.strLengthChk(structCsv.getl_VEND_PERSON()) > 40) {
    						emsg = new ExpjMessage("AA01501");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_VEND_PERSON + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strVendPerson,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    					// �֑����������͂���Ă����ꍇ
    					if (CsvInCheck.chkHankaku(structCsv.getl_VEND_PERSON())) {
    						emsg = new ExpjMessage("AA01524");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_VEND_PERSON + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strVendPerson,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 15.���ВS������R�[�h
    				if(!CsvInCheck.isNull(structCsv.getl_OWN_ORG_CD())){
    					// ����26���ȏ�̏ꍇ
    					if (CsvInCheck.strLengthChk(structCsv.getl_OWN_ORG_CD()) > 25) {
    						emsg = new ExpjMessage("AA01501");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_OWN_ORG_CD + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strOwnOrgCd,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    					// �֑����������͂���Ă����ꍇ
    					if (CsvInCheck.chkHankaku(structCsv.getl_OWN_ORG_CD())) {
    						emsg = new ExpjMessage("AA01524");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_OWN_ORG_CD + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strOwnOrgCd,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 16.���ВS�����喼
    				if(!CsvInCheck.isNull(structCsv.getl_OWN_ORG_NAME())){
    					// ����81���ȏ�̏ꍇ
    					if (CsvInCheck.strLengthChk(structCsv.getl_OWN_ORG_NAME()) > 80) {
    						emsg = new ExpjMessage("AA01501");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_OWN_ORG_NAME + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strOwnOrgName,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    					// �֑����������͂���Ă����ꍇ
    					if (CsvInCheck.chkHankaku(structCsv.getl_OWN_ORG_NAME())) {
    						emsg = new ExpjMessage("AA01524");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_OWN_ORG_NAME + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strOwnOrgName,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 17.���ВS���҃R�[�h
    				if(!CsvInCheck.isNull(structCsv.getl_OWN_PERSON_CD())){
    					// ����26���ȏ�̏ꍇ
    					if (CsvInCheck.strLengthChk(structCsv.getl_OWN_PERSON_CD()) > 25) {
    						emsg = new ExpjMessage("AA01501");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_OWN_PERSON_CD + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strOwnPersonCd,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    					// �֑����������͂���Ă����ꍇ
    					if (CsvInCheck.chkHankaku(structCsv.getl_OWN_PERSON_CD())) {
    						emsg = new ExpjMessage("AA01524");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_OWN_PERSON_CD + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strOwnPersonCd,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 18.�������z�܂�ߋ敪
    				if(!CsvInCheck.isNull(structCsv.getl_ROUND_TYP())){
    					// �����ȊO�̏ꍇ
    					if (!CsvInCheck.isIntegerChk(structCsv.getl_ROUND_TYP())) {
    						emsg = new ExpjMessage("AA01502");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_ROUND_TYP + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strRoundTyp,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 19.����ŃR�[�h
    				// ����œK�p�敪���Q�F�����}�X�^�A������ŃR�[�h��NULL�̏ꍇ
    				if(!CsvInCheck.isNull(structCsv.getl_TAX_APPLY_TYP()) && "2".equals(structCsv.getl_TAX_APPLY_TYP())
    						&& CsvInCheck.isNull(structCsv.getl_TAX_CD())){
    					emsg = new ExpjMessage("AA01530", strTaxCd);
    					csvExport(structCsv.getw_COLUMN(),
    							String.valueOf(CSV_COLNO_TAX_CD + 1),
    							String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    							structCsv,
    							strTaxCd,
    							emsg.getMessage(locale));
    					_intErrorCount++;
    					continue;
    				}
    				if(!CsvInCheck.isNull(structCsv.getl_TAX_CD())){
    					// ����26���ȏ�̏ꍇ
    					if (CsvInCheck.strLengthChk(structCsv.getl_TAX_CD()) > 25) {
    						emsg = new ExpjMessage("AA01501");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_TAX_CD + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strTaxCd,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    					// �֑����������͂���Ă����ꍇ
    					if (CsvInCheck.chkHankaku(structCsv.getl_TAX_CD())) {
    						emsg = new ExpjMessage("AA01524");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_TAX_CD + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strTaxCd,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 20.����œK�p�敪
    				if(!CsvInCheck.isNull(structCsv.getl_TAX_APPLY_TYP())){
    					// �����ȊO�̏ꍇ
    					if (!CsvInCheck.isIntegerChk(structCsv.getl_TAX_APPLY_TYP())) {
    						emsg = new ExpjMessage("AA01502");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_TAX_APPLY_TYP + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strTaxApplyTyp,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 21.����Ōv�Z�敪
    				if(!CsvInCheck.isNull(structCsv.getl_TAX_CALC_TYP())){
    					// �����ȊO�̏ꍇ
    					if (!CsvInCheck.isIntegerChk(structCsv.getl_TAX_CALC_TYP())) {
    						emsg = new ExpjMessage("AA01502");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_TAX_CALC_TYP + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strTaxCalcTyp,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 22.�����v��敪
    				if(!CsvInCheck.isNull(structCsv.getl_INSPC_ACPT_APP_TYP())){
    					// �����ȊO�̏ꍇ
    					if (!CsvInCheck.isIntegerChk(structCsv.getl_INSPC_ACPT_APP_TYP())) {
    						emsg = new ExpjMessage("AA01502");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_INSPC_ACPT_APP_TYP + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strInspcAcptAppTyp,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 23.�����������t���O
    				if(!CsvInCheck.isNull(structCsv.getl_ODR_FORM_FLG())){
    					// �����ȊO�̏ꍇ
    					if (!CsvInCheck.isIntegerChk(structCsv.getl_ODR_FORM_FLG())) {
    						emsg = new ExpjMessage("AA01502");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_ODR_FORM_FLG + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strOdrFormFlg,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    					// ����2���ȏ�̏ꍇ
    					if (CsvInCheck.strLengthChk(structCsv.getl_ODR_FORM_FLG()) > 1) {
    						emsg = new ExpjMessage("AA01501");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_ODR_FORM_FLG + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strOdrFormFlg,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 24.EDI�����t���O
    				if(!CsvInCheck.isNull(structCsv.getl_ODR_EDI_FLG())){
    					// �����ȊO�̏ꍇ
    					if (!CsvInCheck.isIntegerChk(structCsv.getl_ODR_EDI_FLG())) {
    						emsg = new ExpjMessage("AA01502");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_ODR_EDI_FLG + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strOdrEdiFlg,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    					// ����2���ȏ�̏ꍇ
    					if (CsvInCheck.strLengthChk(structCsv.getl_ODR_EDI_FLG()) > 1) {
    						emsg = new ExpjMessage("AA01501");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_ODR_EDI_FLG + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strOdrEdiFlg,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 25.���l
    				if(!CsvInCheck.isNull(structCsv.getl_VEND_REM())){
    					// ����81���ȏ�̏ꍇ
    					if (CsvInCheck.strLengthChk(structCsv.getl_VEND_REM()) > 80) {
    						emsg = new ExpjMessage("AA01501");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_VEND_REM + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strVendRem,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    					// �֑����������͂���Ă����ꍇ
    					if (CsvInCheck.chkHankaku(structCsv.getl_VEND_REM())) {
    						emsg = new ExpjMessage("AA01524");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_VEND_REM + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strVendRem,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 26.����ʉ݃R�[�h
    				if(!CsvInCheck.isNull(structCsv.getl_CUR_CD())){
    					// ����26���ȏ�̏ꍇ
    					if (CsvInCheck.strLengthChk(structCsv.getl_CUR_CD()) > 25) {
    						emsg = new ExpjMessage("AA01501");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_CUR_CD + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strCurCd,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    					// �֑����������͂���Ă����ꍇ
    					if (CsvInCheck.chkHankaku(structCsv.getl_CUR_CD())) {
    						emsg = new ExpjMessage("AA01524");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_CUR_CD + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strCurCd,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 27.�ב֎��
    				if(!CsvInCheck.isNull(structCsv.getl_EXCH_TYP())){
    					// �����ȊO�̏ꍇ
    					if (!CsvInCheck.isIntegerChk(structCsv.getl_EXCH_TYP())) {
    						emsg = new ExpjMessage("AA01502");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_EXCH_TYP + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strExchTyp,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 28.�A������敪
    				if(!CsvInCheck.isNull(structCsv.getl_IMPORT_TRN_TYP())){
    					// �����ȊO�̏ꍇ
    					if (!CsvInCheck.isIntegerChk(structCsv.getl_IMPORT_TRN_TYP())) {
    						emsg = new ExpjMessage("AA01502");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_IMPORT_TRN_TYP + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strImportTrnTyp,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// 29.�̔��P���k�y�t���O
    				if(!CsvInCheck.isNull(structCsv.getl_UNIT_COST_RETROACTION_FLG())){
    					// �����ȊO�̏ꍇ
    					if (!CsvInCheck.isIntegerChk(structCsv.getl_UNIT_COST_RETROACTION_FLG())) {
    						emsg = new ExpjMessage("AA01502");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_UNIT_COST_RET_FLG + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strUnitCostRetFlg,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				
    				// ���R���{�`�F�b�N
    				// 18.�������z�܂�ߋ敪
    				if(!CsvInCheck.isNull(structCsv.getl_ROUND_TYP())){
    					if(!CsvInCheck.chkValue(_COM_ROUND_TYP, structCsv.getl_ROUND_TYP())){
    						// �y�R���{�{�b�N�X�f�[�^�ɑ��݂��鐔�l���w�肵�Ă��������z
    						emsg = new ExpjMessage("AA01504");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_ROUND_TYP + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strRoundTyp,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				// 20.����œK�p�敪
    				if(!CsvInCheck.isNull(structCsv.getl_TAX_APPLY_TYP())){
    					if(!CsvInCheck.chkValue(_COM_TAX_APPLY_TYP, structCsv.getl_TAX_APPLY_TYP())){
    						// �y�R���{�{�b�N�X�f�[�^�ɑ��݂��鐔�l���w�肵�Ă��������z
    						emsg = new ExpjMessage("AA01504");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_TAX_APPLY_TYP + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strTaxApplyTyp,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				// 21.����Ōv�Z�敪
    				if(!CsvInCheck.isNull(structCsv.getl_TAX_CALC_TYP())){
    					if(!CsvInCheck.chkValue(_COM_TAX_CALC_TYP, structCsv.getl_TAX_CALC_TYP())){
    						// �y�R���{�{�b�N�X�f�[�^�ɑ��݂��鐔�l���w�肵�Ă��������z
    						emsg = new ExpjMessage("AA01504");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_TAX_CALC_TYP + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strTaxCalcTyp,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				// 22.�����v��敪
    				if(!CsvInCheck.isNull(structCsv.getl_INSPC_ACPT_APP_TYP())){
    					if(!CsvInCheck.chkValue(_COM_INSPC_ACPT_APP_TYP, structCsv.getl_INSPC_ACPT_APP_TYP())){
    						// �y�R���{�{�b�N�X�f�[�^�ɑ��݂��鐔�l���w�肵�Ă��������z
    						emsg = new ExpjMessage("AA01504");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_INSPC_ACPT_APP_TYP + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strInspcAcptAppTyp,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				// 27.�ב֎��
    				if(!CsvInCheck.isNull(structCsv.getl_EXCH_TYP())){
    					if(!CsvInCheck.chkValue(_COM_EXCH_TYP, structCsv.getl_EXCH_TYP())){
    						// �y�R���{�{�b�N�X�f�[�^�ɑ��݂��鐔�l���w�肵�Ă��������z
    						emsg = new ExpjMessage("AA01504");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_EXCH_TYP + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strExchTyp,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				// 28.�A������敪
    				if(!CsvInCheck.isNull(structCsv.getl_IMPORT_TRN_TYP())){
    					if(!CsvInCheck.chkValue(_COM_IMPORT_TRN_TYP, structCsv.getl_IMPORT_TRN_TYP())){
    						// �y�R���{�{�b�N�X�f�[�^�ɑ��݂��鐔�l���w�肵�Ă��������z
    						emsg = new ExpjMessage("AA01504");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_IMPORT_TRN_TYP + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strImportTrnTyp,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
    				// 29.�̔��P���k�y�t���O
    				if(!CsvInCheck.isNull(structCsv.getl_UNIT_COST_RETROACTION_FLG())){
    					if(!CsvInCheck.chkValue(_COM_UNIT_COST_RET_FLG, structCsv.getl_UNIT_COST_RETROACTION_FLG())){
    						// �y�R���{�{�b�N�X�f�[�^�ɑ��݂��鐔�l���w�肵�Ă��������z
    						emsg = new ExpjMessage("AA01504");
    						csvExport(structCsv.getw_COLUMN(),
    								String.valueOf(CSV_COLNO_UNIT_COST_RET_FLG + 1),
    								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
    								structCsv,
    								strUnitCostRetFlg,
    								emsg.getMessage(locale));
    						_intErrorCount++;
    						continue;
    					}
    				}
                }
                
                // �o�^�ƍ폜�̏ꍇ
                if ("true".equals(_strRdoInsert) || "true".equals(_strRdoDelete)) {
                	//����L�[��CSV���ŏd�����Ă���ꍇ�i�L�[�F�����R�[�h�j
    				checkFlag = true;
					for (int j = 0; j < listCsv.size(); j++) {
						tempStruct = (AA0210010Struct) listCsv.get(j);
						if (structCsv.getOUT_VEND_CD().equals(tempStruct.getOUT_VEND_CD())) {
							if(j!=i){
								emsg = new ExpjMessage("AA34134", String.valueOf(j+1));
								csvExport(
										structCsv.getw_COLUMN(),
										CSV_COLNO_99,
										String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
										structCsv,
										strVendCd,
										emsg.getMessage(locale));
								checkFlag = false;
							}
						}
					}
					if(!checkFlag){
						_intErrorCount++;
						continue;
					}
                }

				// ���o�^�X�V�`�F�b�N
				// �P.�o�^���W�I�{�^�����I�����ꂽ�Ƃ��̂݃`�F�b�N���s���B(���o�^���̂�)
				if ("true".equals(_strRdoInsert)) {
					// ���O�C�����[�U�̏�����ЃR�[�h�Ɓu�����R�[�h�v �Ō������A���ł� [�����] �ɑ��݂����ꍇ
					tempList = entity.mcheckVEND_CTRL.read(conn, structCsv);
					if (tempList.size() > 0) {
						// �y�w��L�[�̃f�[�^�����łɑ��݂��܂��B�z
						emsg = new ExpjMessage("ZZ01102");
						csvExport(structCsv.getw_COLUMN(),
								CSV_COLNO_99,
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								structCsv,
								strVendCd,
								emsg.getMessage(locale));
						_intErrorCount++;
						continue;
					}
				}
				// �Q.�X�V���W�I�{�^�����I�����ꂽ�Ƃ��̂݃`�F�b�N���s���B(���X�V/�폜�̂�)
				if ("true".equals(_strRdoUpdate) || "true".equals(_strRdoDelete)) {
					// ���O�C�����[�U�̏�����ЃR�[�h�Ɓu�����R�[�h�v �Ō������A[�����] �ɑ��݂��Ȃ��ꍇ
					tempList = entity.mcheckVEND_CTRL.read(conn, structCsv);
					if (tempList.size() <= 0) {
						// �y�Ώۃf�[�^�����݂��܂���B�z
						emsg = new ExpjMessage("ZZ06001");
						csvExport(structCsv.getw_COLUMN(),
								CSV_COLNO_99,
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								structCsv,
								strVendCd,
								emsg.getMessage(locale));
						_intErrorCount++;
						continue;
					}
				}
				// �R.�o�^/�X�V���W�I�{�^�����I�����ꂽ�Ƃ��̂݃`�F�b�N���s���B(���o�^/�X�V�̂�)
				if ("true".equals(_strRdoInsert) || "true".equals(_strRdoUpdate)) {
					// �u����ŃR�[�h�v �� [����ŋ敪] �ɑ��݂��Ȃ�����ŃR�[�h����͂����ꍇ
					if (!CsvInCheck.isNull(structCsv.getl_TAX_CD())) {
						tempList = entity.mselectM_TAX.read(conn, structCsv);
						if (tempList.size() <= 0) {
							// �y�w�肵������ŃR�[�h�͖��o�^�ł��B�z
							emsg = new ExpjMessage("AA01001");
							csvExport(structCsv.getw_COLUMN(),
									String.valueOf(CSV_COLNO_TAX_CD + 1),
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									structCsv,
									strTaxCd,
									emsg.getMessage(locale));
							_intErrorCount++;
							continue;
						}
					}
					
					// �u����ʉ݃R�[�h�v �� [�ʉ�] �ɑ��݂��Ȃ��ꍇ
					if (!CsvInCheck.isNull(structCsv.getl_CUR_CD())) {
						tempList = entity.mselectM_CUR.read(conn, structCsv);
						if (tempList.size() <= 0) {
							// �y�ʉ݃R�[�h���ʉ݃}�X�^�ɑ��݂��܂���B�z
							emsg = new ExpjMessage("AA10011");
							csvExport(structCsv.getw_COLUMN(),
									String.valueOf(CSV_COLNO_CUR_CD + 1),
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									structCsv,
									strCurCd,
									emsg.getMessage(locale));
							_intErrorCount++;
							continue;
						}
					}
					
					// �u���ВS���҃R�[�h�v �����͂���̏ꍇ�ŁA�u���O�C�����[�U�̏�����ЃR�[�h�v�u���ВS���҃R�[�h�v�� [���[�U�}�X�^]���������A���݂��Ȃ��ꍇ
					if (!CsvInCheck.isNull(structCsv.getl_OWN_PERSON_CD())) {
						tempList = entity.mselectOWN_PERSON_CD.read(conn, structCsv);
						if (tempList.size() <= 0) {
							// ���ВS���Җ��̃N���A
							structCsv.setl_OWN_PERSON_NAME("");
							// �y�S���҃R�[�h�����p�҃}�X�^�ɓo�^����Ă��܂���B�z
							emsg = new ExpjMessage("AA00158");
							csvExport(structCsv.getw_COLUMN(),
									String.valueOf(CSV_COLNO_OWN_PERSON_CD + 1),
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									structCsv,
									strOwnPersonCd,
									emsg.getMessage(locale));
							_intErrorCount++;
							continue;
						}
					}
				}
				
				// �S.�폜���W�I�{�^�����I�����ꂽ�Ƃ��̂݃`�F�b�N���s���B(���폜�̂�)
				if ("true".equals(_strRdoDelete)) {
					// 1.�Q�Ɛ��������؁F��ƌn��
					tempList = entity.mselectM_PROC_GRP.read(conn, structCsv);
					if (tempList.size() != 0) {
						// �G���[���b�Z�[�W�ݒ�
						emsg = new ExpjMessage("AA00094");
						csvExport(structCsv.getw_COLUMN(),
								String.valueOf(CSV_COLNO_VEND_CD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								structCsv,
								strVendCd,
								emsg.getMessage(locale));
						_intErrorCount++;
						continue;
					}

					// 2.�Q�Ɛ��������؁F�ۊǋ�
					tempList = entity.mselectM_WH.read(conn, structCsv);
					if (tempList.size() != 0) {
						// �G���[���b�Z�[�W�ݒ�
						emsg = new ExpjMessage("AA00095");
						csvExport(structCsv.getw_COLUMN(),
								String.valueOf(CSV_COLNO_VEND_CD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								structCsv,
								strVendCd,
								emsg.getMessage(locale));
						_intErrorCount++;
						continue;
					}

					// 3.�Q�Ɛ��������؁F�w���P���w�b�_
					tempList = entity.mselectM_PUCH_UNIT_COST_H.read(conn, structCsv);
					if (tempList.size() != 0) {
						// �G���[���b�Z�[�W�ݒ�
						emsg = new ExpjMessage("AA00096");
						csvExport(structCsv.getw_COLUMN(),
								String.valueOf(CSV_COLNO_VEND_CD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								structCsv,
								strVendCd,
								emsg.getMessage(locale));
						_intErrorCount++;
						continue;
					}

					// 4.�Q�Ɛ��������؁F�O���P���w�b�_
					tempList = entity.mselectM_SBCNT_UNIT_COST_H.read(conn, structCsv);
					if (tempList.size() != 0) {
						// �G���[���b�Z�[�W�ݒ�
						emsg = new ExpjMessage("AA00097");
						csvExport(structCsv.getw_COLUMN(),
								String.valueOf(CSV_COLNO_VEND_CD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								structCsv,
								strVendCd,
								emsg.getMessage(locale));
						_intErrorCount++;
						continue;
					}

					// 5.�Q�Ɛ��������؁F��ƌn��ʎd�|
					tempList = entity.mselectT_WORK_IN_PROC_BY_PROC.read(conn, structCsv);
					if (tempList.size() != 0) {
						// �G���[���b�Z�[�W�ݒ�
						emsg = new ExpjMessage("AA00098");
						csvExport(structCsv.getw_COLUMN(),
								String.valueOf(CSV_COLNO_VEND_CD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								structCsv,
								strVendCd,
								emsg.getMessage(locale));
						_intErrorCount++;
						continue;
					}

					// 6.�Q�Ɛ��������؁F�����c
					tempList = entity.mselectT_RLSD_PUSH_ODR.read(conn, structCsv);
					if (tempList.size() != 0) {
						// �G���[���b�Z�[�W�ݒ�
						emsg = new ExpjMessage("AA00099");
						csvExport(structCsv.getw_COLUMN(),
								String.valueOf(CSV_COLNO_VEND_CD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								structCsv,
								strVendCd,
								emsg.getMessage(locale));
						_intErrorCount++;
						continue;
					}

	                // 7.�Q�Ɛ��������؁F�L���x������
					tempList = entity.mselectT_PAST_ONEROUS_CONS.read(conn, structCsv);
	                if (tempList.size() != 0 ) {
						// �G���[���b�Z�[�W�ݒ�
						emsg = new ExpjMessage("AA00999");
						csvExport(structCsv.getw_COLUMN(),
								String.valueOf(CSV_COLNO_VEND_CD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								structCsv,
								strVendCd,
								emsg.getMessage(locale));
						_intErrorCount++;
						continue;
					}


	                // 8.�Q�Ɛ��������؁F�w���ԕi����
	                tempList = entity.mselectT_PUCH_ODR_RTN_RSLT.read(conn, structCsv);
	                if (tempList.size() != 0 ) {
						// �G���[���b�Z�[�W�ݒ�
						emsg = new ExpjMessage("AA01000");
						csvExport(structCsv.getw_COLUMN(),
								String.valueOf(CSV_COLNO_VEND_CD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								structCsv,
								strVendCd,
								emsg.getMessage(locale));
						_intErrorCount++;
						continue;
					}
	                
	                // 9.�Q�Ɛ��������؁F�x���P��
	                tempList = entity.mselectM_CONS_UNIT_COST.read(conn, structCsv);
	                if(tempList.size() != 0){
						// �G���[���b�Z�[�W�ݒ�
	                	emsg = new ExpjMessage("AA02011");
						csvExport(structCsv.getw_COLUMN(),
								String.valueOf(CSV_COLNO_VEND_CD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								structCsv,
								strVendCd,
								emsg.getMessage(locale));
						_intErrorCount++;
						continue;
	                }
	                
	                // 10.�Q�Ɛ��������؁F�ϑ��݌�
	                tempList = entity.mselect_T_TRANSPORT_STOCK.read(conn, structCsv);
	                if(tempList.size() != 0){
						// �G���[���b�Z�[�W�ݒ�
	                	emsg = new ExpjMessage("CA00133");
						csvExport(structCsv.getw_COLUMN(),
								String.valueOf(CSV_COLNO_VEND_CD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								structCsv,
								strVendCd,
								emsg.getMessage(locale));
						_intErrorCount++;
						continue;
	                }
	                
	                // 11.�Q�Ɛ��������؁F�o�Ɏw��
	                tempList = entity.mselect_T_ISSUE_INST.read(conn, structCsv);
	                if(tempList.size() != 0){
						// �G���[���b�Z�[�W�ݒ�
	                	emsg = new ExpjMessage("CA00134");
						csvExport(structCsv.getw_COLUMN(),
								String.valueOf(CSV_COLNO_VEND_CD + 1),
								String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
								structCsv,
								strVendCd,
								emsg.getMessage(locale));
						_intErrorCount++;
						continue;
	                }
	                
	                structCsv.setOPTION_ID("C*");
					tempList  = entity.mgetSYS_INSTALL_OPTIONS.read(conn, structCsv);
					if (tempList.size() > 0) {
						tempStruct = (AA0210010Struct) tempList.get(0);
						structCsv.setINSTALL_FLG(tempStruct.getINSTALL_FLG());
					}
					if("1".equals(structCsv.getINSTALL_FLG())){
						// �Q�Ɛ��������؁F���|���c�� 
						tempList = entity.mselect_T_DEBT_BALANCE.read(conn, structCsv);
						if (tempList.size() != 0) {
							// �G���[���b�Z�[�W�ݒ�
		                	emsg = new ExpjMessage("CA00135");
							csvExport(structCsv.getw_COLUMN(),
									String.valueOf(CSV_COLNO_VEND_CD + 1),
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									structCsv,
									strVendCd,
									emsg.getMessage(locale));
							_intErrorCount++;
							continue;
						}
						// �Q�Ɛ��������؁F���|���c������
						tempList = entity.mselect_T_DEBT_BALANCE_D.read(conn, structCsv);
						if (tempList.size() != 0) {
							// �G���[���b�Z�[�W�ݒ�
		                	emsg = new ExpjMessage("CA00136");
							csvExport(structCsv.getw_COLUMN(),
									String.valueOf(CSV_COLNO_VEND_CD + 1),
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									structCsv,
									strVendCd,
									emsg.getMessage(locale));
							_intErrorCount++;
							continue;
						}
						// �Q�Ɛ��������؁F���|�������w�b�_
						tempList = entity.mselect_T_DEBT_LEDGER_H.read(conn, structCsv);
						if (tempList.size() != 0) {
							// �G���[���b�Z�[�W�ݒ�
		                	emsg = new ExpjMessage("CA00137");
							csvExport(structCsv.getw_COLUMN(),
									String.valueOf(CSV_COLNO_VEND_CD + 1),
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									structCsv,
									strVendCd,
									emsg.getMessage(locale));
							_intErrorCount++;
							continue;
						}
						// �Q�Ɛ��������؁F���|���g�����w�b�_
						tempList = entity.mselect_T_DEBT_LEDGER_H_TRN.read(conn, structCsv);
						if (tempList.size() != 0) {
							// �G���[���b�Z�[�W�ݒ�
		                	emsg = new ExpjMessage("CA00138");
							csvExport(structCsv.getw_COLUMN(),
									String.valueOf(CSV_COLNO_VEND_CD + 1),
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									structCsv,
									strVendCd,
									emsg.getMessage(locale));
							_intErrorCount++;
							continue;
						}
						// �Q�Ɛ��������؁F�x��
						tempList = entity.mselect_T_PAYMENT.read(conn, structCsv);
						if (tempList.size() != 0) {
							// �G���[���b�Z�[�W�ݒ�
		                	emsg = new ExpjMessage("CA00139");
							csvExport(structCsv.getw_COLUMN(),
									String.valueOf(CSV_COLNO_VEND_CD + 1),
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									structCsv,
									strVendCd,
									emsg.getMessage(locale));
							_intErrorCount++;
							continue;
						}
						// �Q�Ɛ��������؁F�x���W�v
						tempList = entity.mselect_T_PAYMENT_CALC.read(conn, structCsv);
						if (tempList.size() != 0) {
							// �G���[���b�Z�[�W�ݒ�
		                	emsg = new ExpjMessage("CA00140");
							csvExport(structCsv.getw_COLUMN(),
									String.valueOf(CSV_COLNO_VEND_CD + 1),
									String.valueOf(_COM_ERR_TYP.getExplanList().get(0)),
									structCsv,
									strVendCd,
									emsg.getMessage(locale));
							_intErrorCount++;
							continue;
						}
					}
				}
			} // End for
			
			// ���탌�R�[�h����
			_intSuccessCount = _intTotalCount - _intErrorCount - _intWarningCount;
			if (_intErrorCount > 0) {
				return false;
			} else {
				return true;
			}
		} catch(Exception e){
            ExpjMessage emsg = new ExpjMessage( "AH00042", "0", "0");
            sysLog.severe(emsg, getsysUSER_CD());
            ExpjException ee = new ExpjException(e, emsg);
            throw ee;
        }
	}

    /** 
     * �b�r�u�o�̓f�[�^�ݒ菀��(�������O)
     *
     * @param target_struct �Ώۃf�[�^���
     * @param SyoriKbn      �����敪
     * @param DataKbn       �ύX�f�[�^�敪
     * @param bWrite        
     * @return �ُ�Ȃ� true �G���[ false
     */ 
    private boolean csvExportCorrection( AA0210010Struct target_struct , String SyoriKbn,
    		String DataKbn ,boolean bWrite)
    {
        // CSV�t�@�C���ҏW�p
        String csvStr = "";
        String strTmp = "";
        BufferedWriter outStream = null;
        AA0210010Struct structCsv = new AA0210010Struct();

        try {
        	// �ύX�f�[�^�敪��(1:�ύX�O�f�[�^)�������ꍇ�B
            if (DataKbn == "1" )
            {
            	// *�X�V�O�̃f�[�^�̎擾*
                List tempList = entity.mselectM_VEND_CTRL.read(conn, target_struct);
                structCsv = (AA0210010Struct) tempList.get(0);
            }else{
            	structCsv = target_struct;
            }
        	
            // ��������
            csvStr = '"' + _strSysdate + '"' + "," ;
            // �������[�U�[�h�c
            csvStr = csvStr + '"' + getsysUSER_CD() + '"' + "," ;
            // �����敪
            csvStr = csvStr + '"' + SyoriKbn + '"' + "," ;
            // �ύX�f�[�^�敪
            csvStr = csvStr + '"' + DataKbn + '"' + "," ;
            // �����R�[�h
            csvStr = csvStr + '"' + target_struct.getOUT_VEND_CD() + '"' + "," ;
            // ����於��
            csvStr = csvStr + '"' + structCsv.getl_VEND_NAME() + '"' + "," ;
			// ����旪��
            csvStr = csvStr + '"' + structCsv.getl_VEND_ANAME() + '"' + "," ;
            // �����J�i����
            if(structCsv.getl_VEND_KNAME() == null){
                csvStr = csvStr + '"' + strTmp + '"' + "," ;
            } else {
                csvStr = csvStr + '"' + structCsv.getl_VEND_KNAME() + '"' + "," ;
            }
			// �X�֔ԍ�
			if (structCsv.getl_ZIP_CD() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_ZIP_CD() + '"' + ",";
			}
			// �Z��1
            csvStr = csvStr + '"' + structCsv.getl_ADDRESS_1() + '"' + "," ;
			// �Z��2
			if (structCsv.getl_ADDRESS_2() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_ADDRESS_2() + '"' + ",";
			}
			// �Z��(�J�i)1
			if (structCsv.getl_ADDRESS_K_1() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_ADDRESS_K_1() + '"'
						+ ",";
			}
			// �Z��(�J�i)2
			if (structCsv.getl_ADDRESS_K_2() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_ADDRESS_K_2() + '"'
						+ ",";
			}
			// �d�b�ԍ�
			if (structCsv.getl_TEL() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_TEL() + '"' + ",";
			}
			// FAX�ԍ�
			if (structCsv.getl_FAX() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_FAX() + '"' + ",";
			}
			// ���[���A�h���X
			if (structCsv.getl_EMAIL() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_EMAIL() + '"' + ",";
			}
			// �����S������
			if (structCsv.getl_VEND_ORG() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_VEND_ORG() + '"' + ",";
			}
			// �����S����
			if (structCsv.getl_VEND_PERSON() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_VEND_PERSON() + '"'
						+ ",";
			}
			// ���ВS������R�[�h
			if (structCsv.getl_OWN_ORG_CD() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_OWN_ORG_CD() + '"' + ",";
			}
			// ���ВS�����喼
			if (structCsv.getl_OWN_ORG_NAME() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_OWN_ORG_NAME() + '"'
						+ ",";
			}
			// ���ВS���҃R�[�h
			if (structCsv.getl_OWN_PERSON_CD() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_OWN_PERSON_CD() + '"'
						+ ",";
			}
			// �������z�܂�ߋ敪
			if (structCsv.getl_ROUND_TYP() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_ROUND_TYP() + '"' + ",";
			}
			// ����ŃR�[�h
			if (structCsv.getl_TAX_CD() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_TAX_CD() + '"' + ",";
			}
			// ����œK�p�敪
			if (structCsv.getl_TAX_APPLY_TYP() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_TAX_APPLY_TYP() + '"'
						+ ",";
			}
			// ����Ōv�Z�敪
			if (structCsv.getl_TAX_CALC_TYP() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_TAX_CALC_TYP() + '"'
						+ ",";
			}
			// �����v��敪
			if (structCsv.getl_INSPC_ACPT_APP_TYP() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_INSPC_ACPT_APP_TYP()
						+ '"' + ",";
			}
			// �����������t���O
			if (structCsv.getl_ODR_FORM_FLG() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_ODR_FORM_FLG() + '"'
						+ ",";
			}
			// EDI�����t���O
			if (structCsv.getl_ODR_EDI_FLG() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_ODR_EDI_FLG() + '"'
						+ ",";
			}
			// ���l
			if (structCsv.getl_VEND_REM() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_VEND_REM() + '"' + ",";
			}
			// ����ʉ݃R�[�h
			if (structCsv.getl_CUR_CD() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_CUR_CD() + '"' + ",";
			}
			// �ב֎��
			if (structCsv.getl_EXCH_TYP() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_EXCH_TYP() + '"' + ",";
			}
			// �A������敪
			if (structCsv.getl_IMPORT_TRN_TYP() == null) {
				csvStr = csvStr + '"' + strTmp + '"' + ",";
			} else {
				csvStr = csvStr + '"' + structCsv.getl_IMPORT_TRN_TYP() + '"'
						+ ",";
			}
			// �̔��P���k�y�t���O
			if (structCsv.getl_UNIT_COST_RETROACTION_FLG() == null) {
				csvStr = csvStr + '"' + strTmp + '"';
			} else {
				csvStr = csvStr + '"'
						+ structCsv.getl_UNIT_COST_RETROACTION_FLG() + '"';
			}
			
			// �������O�o��(�o�̓t�@�C�����Z�b�g)
			if (bWrite) {
				outStream = new BufferedWriter(new FileWriter(struct.getCANCEL_FILE(), true));
			} else {
				outStream = new BufferedWriter(new FileWriter(struct.getCANCEL_FILE(), false));
			}
			// �t�@�C���ɏ���
			outStream.write(csvStr);
			// ���s�R�[�h�t��
			outStream.newLine();
			// BufferedWriter�N���[�Y
			outStream.close();
        	return true;
        }catch(Exception e){
            ExpjMessage emsg = new ExpjMessage( "AH00042", "0", "0" );
            sysLog.severe(emsg, getsysUSER_CD());
            return false;
        }finally{
            if (outStream != null ) {
                try {
                    outStream.close();
                } catch (Exception e ) {
                    e.printStackTrace();
                }
              outStream = null;
             }
        }
    }

	/**
	 * �b�r�u�f�[�^���f����
	 * @param csvList
	 * @return
	 * @throws FoundationException 
	 */
	private boolean csvDataToDb(List csvList) throws BusinessProcessException, FoundationException {
		
		int intCsvDataCount = 0; // �Ώۃf�[�^����
		boolean bWrite = false; // �����t�@�C��
		// ���O�o�͏��i�[�p
        String logMessage = "";
        AA0210010Struct structCsv = null;
        boolean bSuccess = false;   // ���������t���O������
        boolean bDBUpdate = false;  // DB�X�V���t���O������
		
		try {
			// �g�����U�N�V�����J�n
			conn.beginTransWeb();
			// DB�X�V���t���OON
            bDBUpdate = true;
			
			// �V�X�e�����t�擾
            beginTransaction();
			_strSysdate = struct.getsSysdate();

			intCsvDataCount = csvList.size();
			// �e��ʂ̃��W�I�{�^����1:�o�^�̏ꍇ�̏���
			if ("true".equals(_strRdoInsert)) {
				// �f�[�^�����������J��Ԃ�
				for (int i = 0; i < intCsvDataCount; i++) {
					structCsv = (AA0210010Struct) csvList.get(i);
					
					// հ��ID��ݒ肷��
					structCsv.setsUser_ID(sysUSER_CD);
					// [��z����]�̓o�^
					entity.minsertM_VEND_CTRL.create(conn, structCsv);
					
					// ����CSV�o�͏���(����:�Ώۃf�[�^�A���[�U�[ID�A�����敪�A�ύX�f�[�^�敪)
					csvExportCorrection(structCsv, "1", "2", bWrite);
					bWrite = true;
				}
			}
			
			// �e��ʂ̃��W�I�{�^����2:�ύX�̏ꍇ�̏���
			if ("true".equals(_strRdoUpdate)) {
				// �f�[�^�����������J��Ԃ�
				for (int i = 0; i < intCsvDataCount; i++) {
					structCsv = (AA0210010Struct) csvList.get(i);
					
					// ����CSV�o�͏���(����:�Ώۃf�[�^�A���[�U�[ID�A�����敪�A�ύX�f�[�^�敪)
					csvExportCorrection(structCsv, "2", "1", bWrite);
					bWrite = true;
										
					// հ��ID��ݒ肷��
					structCsv.setsUser_ID(sysUSER_CD);
					// [��z����]�̓o�^
					entity.mupdateM_VEND_CTRL.update(conn, structCsv);
					
					// ����CSV�o�͏���(����:�Ώۃf�[�^�A���[�U�[ID�A�����敪�A�ύX�f�[�^�敪)
					csvExportCorrection(structCsv, "2", "2", bWrite);
					bWrite = true;
				}
			}
			
			// �e��ʂ̃��W�I�{�^����3:�폜�̏ꍇ�̏���
			if ("true".equals(_strRdoDelete)) {
				// �f�[�^�����������J��Ԃ�
				for (int i = 0; i < intCsvDataCount; i++) {
					structCsv = (AA0210010Struct) csvList.get(i);
					
					// ����CSV�o�͏���(����:�Ώۃf�[�^�A���[�U�[ID�A�����敪�A�ύX�f�[�^�敪)
					csvExportCorrection(structCsv, "3", "1", bWrite);
					bWrite = true;
					
					// հ��ID��ݒ肷��
					structCsv.setsUser_ID(sysUSER_CD);
					// [��z����]�̓o�^
					entity.mdeleteM_VEND_CTRL.delete(conn, structCsv);
				}
			}
			conn.commit();
			
			// DB�X�V���t���OOFF
            bDBUpdate = false;

            // ���������t���O�ݒ�
            bSuccess = true;
		} catch(SQLException e) {
            logMessage = "M_VEND_CTRL.VEND_CD:" +  structCsv.getOUT_VEND_CD();
            ExpjMessage emsg = new ExpjMessage( "ZZ01006", logMessage );
            sysLog.severe(emsg, getsysUSER_CD());
            setSqlExceptionMsg(e);
        } finally {
            // DB�X�V�������ɉ��炩�̃G���[�����������ꍇ��roolback�������Ȃ�
            if(bDBUpdate == true)
            {
                // ���[���o�b�N
                conn.rollback();
                logMessage = "Control�FcsvDataToDb - rollback!! ";
                setSyslogConfig(logMessage);
                // �X�V���s�̃��b�Z�[�W�\��
                ExpjMessage emsg = new ExpjMessage( "AH00042", ""+intCsvDataCount, "0","0");
                msgStruct.addError( emsg );
                sysLog.warning(emsg, getsysUSER_CD());
            }
        }
		return bSuccess;
	}
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * CSV�捞�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCsvImport() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0210");
		logger.entering("AA0210010Control"+":USER="+struct.getsUser_ID(),"controlCsvImport");
			//{{user_implement_dev:<controlCsvImport>
		setList(null);
		// �e��ʂ�struct��ޔ�
		_strRdoInsert = struct.getrdoInsert();
		_strRdoUpdate = struct.getrdoUpdate();
		_strRdoDelete = struct.getrdoDelete();
		_strDoChk = struct.getDO_CHK();
                //}}user_implement_dev:<controlCsvImport>
		logger.exiting("AA0210010Control"+":USER="+struct.getsUser_ID(),"controlCsvImport");

		return;
	}

	/**
	 * �Q�ƃ{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlBrowse() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0210");
		logger.entering("AA0210010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");
			//{{user_implement_dev:<controlBrowse>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlBrowse>
		logger.exiting("AA0210010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");

		return;
	}

	/**
	 * �捞�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCsvIn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0210");
		logger.entering("AA0210010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");
			//{{user_implement_dev:<controlCsvIn>
		// �S�����R�[�h��
		_intTotalCount = 0;
		// �G���[���R�[�h����
		_intErrorCount = 0;
		// ���탌�R�[�h����
		_intSuccessCount = 0;
		// ���[�j���O����
		_intWarningCount = 0;

		// ��ʕ\���p���X�g�N���A
		if (null == list) {
			list = new ArrayList();
		} else {
			list.clear();
		}

		// �b�r�u�f�[�^�擾
		List listCsv = readCsvData();
		
		// �b�r�u�f�[�^�擾����
		if (listCsv != null) {
			if (!"true".equals(_strDoChk)) {
				// ��������p�t�@�C���o�̓`�F�b�N
				if (!chkOutputFilePath()) {
					return;
				}
			}
			// �b�r�u���ڂ̃`�F�b�N�Ɛ������`�F�b�N�Ɠo�^�O�`�F�b�N���s��
			boolean checkFlg = checkCsvData(listCsv);
			// �`�F�b�N�{�b�N�X(�`�F�b�N�̂ݍs��)���`�F�b�N�̏ꍇ�ADB�ւ̃f�[�^�̔��f�͍s��Ȃ��B
			if ("true".equals(_strDoChk)) {
				// �y�`�F�b�N���������s���܂����B�i���� {0}���A���[�j���O{1}���A�G���[{2}��)�j�z
				setInfoMessage("AA01517", String.valueOf(_intSuccessCount), String.valueOf(_intWarningCount), String.valueOf(_intErrorCount));
			} else {
				if(checkFlg){
					// �b�r�u�f�[�^���f����
					if (csvDataToDb(listCsv)) {
						// �G���[�E���[�j���O���Ȃ��ꍇ
						if (_intWarningCount == 0) {
							// �y����Ɏ�荞�݂܂����B�i���� {0}���j�z
							setInfoMessage("AA01514", String.valueOf(_intSuccessCount));
						}
						// ���[�j���O����������ꍇ
						else {
							// �y��荞�݂܂������A���[�j���O������܂��B�i���� {0}���A���[�j���O{1}���j�z
							setWarningMessage("AA01515", String.valueOf(_intSuccessCount), String.valueOf(_intWarningCount));
						}
					}
				}else {
					// �G���[������ꍇ
					setErrorMessage("AA01516", String.valueOf(_intSuccessCount), String.valueOf(_intWarningCount), String.valueOf(_intErrorCount));
				}
			}
		}
                //}}user_implement_dev:<controlCsvIn>
		logger.exiting("AA0210010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");

		return;
	}

	/**
	 * CSV�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCsvOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0210");
		logger.entering("AA0210010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");
			//{{user_implement_dev:<controlCsvOut>
		_csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));

		List csvList = new ArrayList();
		// CSV���̍쐬
		// �^�C�g�����ݒ�
		String csvTitle[] = { "Expj.Cmt3094", 	// �G���[�ӏ�
							  "Expj.Cmt3095", 	// �G���[�敪
							  "Expj.VEND_CD", 	// �����R�[�h
							  "Expj.Cmt3097", 	// �G���[���ږ�
							  "Expj.Cmt3098" 	// �G���[���e
		};
		// CSV���X�g�ɓ����
		csvList.add(csvTitle);

		AA0210010Struct workStruct;
		// ���ד��e�ݒ�
		for (int i = 0; i < getListsize(); i++) {
			workStruct = getListvalue(i);
			String csvStr[] = new String[csvTitle.length];
			csvStr[0] = workStruct.getl_ERR_ADR();				// �G���[�ӏ�
			csvStr[1] = workStruct.getl_ERR_TYP();				// �G���[�敪
			csvStr[2] = workStruct.getOUT_VEND_CD();			// �����R�[�h
			csvStr[3] = workStruct.getl_ERROR_FIELD_NAME();		// �G���[���ږ�
			csvStr[4] = workStruct.getl_ERR_TEXT();				// �G���[���e
			csvList.add(csvStr);// CSV���X�g�ɓ����
		}

		if (csvList != null && csvList.size() > 0) {
			try {
				// csv�t�@�C���ɏ���
				_csvWriter.write(csvList, CoreTools.getLocale(struct.getsUser_ID()), true);
				struct.setDOWNLOAD_FILE(_csvWriter.getFilePath());
			} catch (Exception e) {
				// CSV�o�͎��s
				ExpjMessage emsg = new ExpjMessage("ZZ01107");
				sysLog.severe(emsg, getsysUSER_CD());
				ExpjException ee = new ExpjException(e, emsg);
				throw ee;
			}
		}
                //}}user_implement_dev:<controlCsvOut>
		logger.exiting("AA0210010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlreturn_sub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0210");
		logger.entering("AA0210010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub1");
			//{{user_implement_dev:<controlreturn_sub1>
		controlClear();
                //}}user_implement_dev:<controlreturn_sub1>
		logger.exiting("AA0210010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub1");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0210");
		logger.entering("AA0210010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
		// �N���A����
        this.struct.clear();
        this.struct.setrdoInsert("true");
        this.struct.setrdoUpdate("false");
        this.struct.setrdoDelete("false");
        this.struct.setDO_CHK("false");

        setReadStatus(INITIAL);
                //}}user_implement_dev:<controlClear>
		logger.exiting("AA0210010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0210");
		logger.entering("AA0210010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("AA0210010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0210");
		logger.entering("AA0210010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
		// �N���A
		controlClear();
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AA0210010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0210");
		logger.entering("AA0210010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		try{
			// ��ЃR�[�h�擾
			List tempList = entity.mselectCOMPANY_CD.read(conn, struct);
			if (tempList.size() > 0) {
				_COMPANY_CD = ((AA0210010Struct)tempList.get(0)).getl_COMPANY_CD();
			}

			// �R���{�{�b�N�X�f�[�^���擾
			ComboBox cb = new ComboBox(conn, sysUSER_CD);

			// �G���[��ԋ敪���Z�b�g
			setComErrTyp(cb.getData("ERR_TYP"));
			
			// �������z�܂�ߋ敪
			setComRoundTyp(cb.getData("ROUND_TYP"));
			// ����œK�p�敪
			setComTaxApplyTyp(cb.getData("TAX_APPLY_TYP"));
			// ����Ōv�Z�敪
			setComTaxCalcTyp(cb.getData("TAX_CALC_TYP"));
			// �����v��敪
			setComInspcAcptAppTyp(cb.getData("INSPC_ACPT_APP_TYP"));
			// �ב֎��
			setComExchTyp(cb.getData("EXCH_TYP"));
			// �A������敪
			setComImportTrnTyp(cb.getData("IMPORT_TRN_TYP"));
			// �̔��P���k�y�t���O
			setComUnitCostRetFlg(cb.getData("UNIT_COST_RETROACTION_FLG"));

			// �N���A
	        controlClear();
		} catch(SQLException e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			throw ee;
		} catch(ExpjException e) {
			throw e;
		} catch(Exception e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			throw ee;
		}
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AA0210010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0210");
		logger.entering("AA0210010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
		logger.exiting("AA0210010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("CsvImport") ) {
				controlCsvImport();
			} else if( button.equals("Browse") ) {
				controlBrowse();
			} else if( button.equals("CsvIn") ) {
				controlCsvIn();
			} else if( button.equals("CsvOut") ) {
				controlCsvOut();
			} else if( button.equals("return_sub1") ) {
				controlreturn_sub1();
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
//			throw new FoundationException("AA0210010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0210010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AA0210010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0210010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AA0210010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0210010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AA0210010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AA0210010Entity entity;
	protected AA0210010Struct struct;
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

		entity = new AA0210010Entity();
		struct = new AA0210010Struct();

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
	 * AA0210010�N���X�̕W���R���X�g���N�^
	 */
	public AA0210010Control() throws BusinessProcessException, FoundationException
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
				AA0210010Struct key = (AA0210010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("rdoInsert") && key.getrdoInsert() != null) {
					msgKey.setKeyValue("rdoInsert", key.getrdoInsert());
				}
				if(msgKeyType.containsKeyColumn("rdoUpdate") && key.getrdoUpdate() != null) {
					msgKey.setKeyValue("rdoUpdate", key.getrdoUpdate());
				}
				if(msgKeyType.containsKeyColumn("rdoDelete") && key.getrdoDelete() != null) {
					msgKey.setKeyValue("rdoDelete", key.getrdoDelete());
				}
				if(msgKeyType.containsKeyColumn("DO_CHK") && key.getDO_CHK() != null) {
					msgKey.setKeyValue("DO_CHK", key.getDO_CHK());
				}
				if(msgKeyType.containsKeyColumn("FileName") && key.getFileName() != null) {
					msgKey.setKeyValue("FileName", key.getFileName());
				}
				if(msgKeyType.containsKeyColumn("CANCEL_FILE") && key.getCANCEL_FILE() != null) {
					msgKey.setKeyValue("CANCEL_FILE", key.getCANCEL_FILE());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_ADR") && key.getl_ERR_ADR() != null) {
					msgKey.setKeyValue("l_ERR_ADR", key.getl_ERR_ADR());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_TYP") && key.getl_ERR_TYP() != null) {
					msgKey.setKeyValue("l_ERR_TYP", key.getl_ERR_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_VEND_CD") && key.getl_VEND_CD() != null) {
					msgKey.setKeyValue("l_VEND_CD", key.getl_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ERROR_FIELD_NAME") && key.getl_ERROR_FIELD_NAME() != null) {
					msgKey.setKeyValue("l_ERROR_FIELD_NAME", key.getl_ERROR_FIELD_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_TEXT") && key.getl_ERR_TEXT() != null) {
					msgKey.setKeyValue("l_ERR_TEXT", key.getl_ERR_TEXT());
				}
				if(msgKeyType.containsKeyColumn("w_COLUMN_FLG") && key.getw_COLUMN_FLG() != null) {
					msgKey.setKeyValue("w_COLUMN_FLG", key.getw_COLUMN_FLG());
				}
				if(msgKeyType.containsKeyColumn("w_COLUMN") && key.getw_COLUMN() != null) {
					msgKey.setKeyValue("w_COLUMN", key.getw_COLUMN());
				}
				if(msgKeyType.containsKeyColumn("l_VEND_NAME") && key.getl_VEND_NAME() != null) {
					msgKey.setKeyValue("l_VEND_NAME", key.getl_VEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_VEND_ANAME") && key.getl_VEND_ANAME() != null) {
					msgKey.setKeyValue("l_VEND_ANAME", key.getl_VEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("l_VEND_KNAME") && key.getl_VEND_KNAME() != null) {
					msgKey.setKeyValue("l_VEND_KNAME", key.getl_VEND_KNAME());
				}
				if(msgKeyType.containsKeyColumn("l_ZIP_CD") && key.getl_ZIP_CD() != null) {
					msgKey.setKeyValue("l_ZIP_CD", key.getl_ZIP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ADDRESS_1") && key.getl_ADDRESS_1() != null) {
					msgKey.setKeyValue("l_ADDRESS_1", key.getl_ADDRESS_1());
				}
				if(msgKeyType.containsKeyColumn("l_ADDRESS_2") && key.getl_ADDRESS_2() != null) {
					msgKey.setKeyValue("l_ADDRESS_2", key.getl_ADDRESS_2());
				}
				if(msgKeyType.containsKeyColumn("l_ADDRESS_K_1") && key.getl_ADDRESS_K_1() != null) {
					msgKey.setKeyValue("l_ADDRESS_K_1", key.getl_ADDRESS_K_1());
				}
				if(msgKeyType.containsKeyColumn("l_ADDRESS_K_2") && key.getl_ADDRESS_K_2() != null) {
					msgKey.setKeyValue("l_ADDRESS_K_2", key.getl_ADDRESS_K_2());
				}
				if(msgKeyType.containsKeyColumn("l_TEL") && key.getl_TEL() != null) {
					msgKey.setKeyValue("l_TEL", key.getl_TEL());
				}
				if(msgKeyType.containsKeyColumn("l_FAX") && key.getl_FAX() != null) {
					msgKey.setKeyValue("l_FAX", key.getl_FAX());
				}
				if(msgKeyType.containsKeyColumn("l_EMAIL") && key.getl_EMAIL() != null) {
					msgKey.setKeyValue("l_EMAIL", key.getl_EMAIL());
				}
				if(msgKeyType.containsKeyColumn("l_VEND_ORG") && key.getl_VEND_ORG() != null) {
					msgKey.setKeyValue("l_VEND_ORG", key.getl_VEND_ORG());
				}
				if(msgKeyType.containsKeyColumn("l_VEND_PERSON") && key.getl_VEND_PERSON() != null) {
					msgKey.setKeyValue("l_VEND_PERSON", key.getl_VEND_PERSON());
				}
				if(msgKeyType.containsKeyColumn("l_OWN_ORG_CD") && key.getl_OWN_ORG_CD() != null) {
					msgKey.setKeyValue("l_OWN_ORG_CD", key.getl_OWN_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("l_OWN_ORG_NAME") && key.getl_OWN_ORG_NAME() != null) {
					msgKey.setKeyValue("l_OWN_ORG_NAME", key.getl_OWN_ORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_OWN_PERSON_CD") && key.getl_OWN_PERSON_CD() != null) {
					msgKey.setKeyValue("l_OWN_PERSON_CD", key.getl_OWN_PERSON_CD());
				}
				if(msgKeyType.containsKeyColumn("l_OWN_PERSON_NAME") && key.getl_OWN_PERSON_NAME() != null) {
					msgKey.setKeyValue("l_OWN_PERSON_NAME", key.getl_OWN_PERSON_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_ROUND_TYP") && key.getl_ROUND_TYP() != null) {
					msgKey.setKeyValue("l_ROUND_TYP", key.getl_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_TAX_CD") && key.getl_TAX_CD() != null) {
					msgKey.setKeyValue("l_TAX_CD", key.getl_TAX_CD());
				}
				if(msgKeyType.containsKeyColumn("l_TAX_APPLY_TYP") && key.getl_TAX_APPLY_TYP() != null) {
					msgKey.setKeyValue("l_TAX_APPLY_TYP", key.getl_TAX_APPLY_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_TAX_CALC_TYP") && key.getl_TAX_CALC_TYP() != null) {
					msgKey.setKeyValue("l_TAX_CALC_TYP", key.getl_TAX_CALC_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_INSPC_ACPT_APP_TYP") && key.getl_INSPC_ACPT_APP_TYP() != null) {
					msgKey.setKeyValue("l_INSPC_ACPT_APP_TYP", key.getl_INSPC_ACPT_APP_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_FORM_FLG") && key.getl_ODR_FORM_FLG() != null) {
					msgKey.setKeyValue("l_ODR_FORM_FLG", key.getl_ODR_FORM_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_EDI_FLG") && key.getl_ODR_EDI_FLG() != null) {
					msgKey.setKeyValue("l_ODR_EDI_FLG", key.getl_ODR_EDI_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_VEND_REM") && key.getl_VEND_REM() != null) {
					msgKey.setKeyValue("l_VEND_REM", key.getl_VEND_REM());
				}
				if(msgKeyType.containsKeyColumn("l_CUR_CD") && key.getl_CUR_CD() != null) {
					msgKey.setKeyValue("l_CUR_CD", key.getl_CUR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_EXCH_TYP") && key.getl_EXCH_TYP() != null) {
					msgKey.setKeyValue("l_EXCH_TYP", key.getl_EXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_IMPORT_TRN_TYP") && key.getl_IMPORT_TRN_TYP() != null) {
					msgKey.setKeyValue("l_IMPORT_TRN_TYP", key.getl_IMPORT_TRN_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_COST_RETROACTION_FLG") && key.getl_UNIT_COST_RETROACTION_FLG() != null) {
					msgKey.setKeyValue("l_UNIT_COST_RETROACTION_FLG", key.getl_UNIT_COST_RETROACTION_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_COMPANY_CD") && key.getl_COMPANY_CD() != null) {
					msgKey.setKeyValue("l_COMPANY_CD", key.getl_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("OUT_VEND_CD") && key.getOUT_VEND_CD() != null) {
					msgKey.setKeyValue("OUT_VEND_CD", key.getOUT_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("l_HOME_CUR_CD") && key.getl_HOME_CUR_CD() != null) {
					msgKey.setKeyValue("l_HOME_CUR_CD", key.getl_HOME_CUR_CD());
				}
				if(msgKeyType.containsKeyColumn("INSTALL_FLG") && key.getINSTALL_FLG() != null) {
					msgKey.setKeyValue("INSTALL_FLG", key.getINSTALL_FLG());
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
					AA0210010Struct key = new AA0210010Struct();
					if(msgKeyType.containsKeyColumn("rdoInsert")) {
						key.setrdoInsert(msgKey.getKeyValue("rdoInsert"));
					}
					if(msgKeyType.containsKeyColumn("rdoUpdate")) {
						key.setrdoUpdate(msgKey.getKeyValue("rdoUpdate"));
					}
					if(msgKeyType.containsKeyColumn("rdoDelete")) {
						key.setrdoDelete(msgKey.getKeyValue("rdoDelete"));
					}
					if(msgKeyType.containsKeyColumn("DO_CHK")) {
						key.setDO_CHK(msgKey.getKeyValue("DO_CHK"));
					}
					if(msgKeyType.containsKeyColumn("FileName")) {
						key.setFileName(msgKey.getKeyValue("FileName"));
					}
					if(msgKeyType.containsKeyColumn("CANCEL_FILE")) {
						key.setCANCEL_FILE(msgKey.getKeyValue("CANCEL_FILE"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_ADR")) {
						key.setl_ERR_ADR(msgKey.getKeyValue("l_ERR_ADR"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_TYP")) {
						key.setl_ERR_TYP(msgKey.getKeyValue("l_ERR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_VEND_CD")) {
						key.setl_VEND_CD(msgKey.getKeyValue("l_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ERROR_FIELD_NAME")) {
						key.setl_ERROR_FIELD_NAME(msgKey.getKeyValue("l_ERROR_FIELD_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_TEXT")) {
						key.setl_ERR_TEXT(msgKey.getKeyValue("l_ERR_TEXT"));
					}
					if(msgKeyType.containsKeyColumn("w_COLUMN_FLG")) {
						key.setw_COLUMN_FLG(msgKey.getKeyValue("w_COLUMN_FLG"));
					}
					if(msgKeyType.containsKeyColumn("w_COLUMN")) {
						key.setw_COLUMN(msgKey.getKeyValue("w_COLUMN"));
					}
					if(msgKeyType.containsKeyColumn("l_VEND_NAME")) {
						key.setl_VEND_NAME(msgKey.getKeyValue("l_VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_VEND_ANAME")) {
						key.setl_VEND_ANAME(msgKey.getKeyValue("l_VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("l_VEND_KNAME")) {
						key.setl_VEND_KNAME(msgKey.getKeyValue("l_VEND_KNAME"));
					}
					if(msgKeyType.containsKeyColumn("l_ZIP_CD")) {
						key.setl_ZIP_CD(msgKey.getKeyValue("l_ZIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ADDRESS_1")) {
						key.setl_ADDRESS_1(msgKey.getKeyValue("l_ADDRESS_1"));
					}
					if(msgKeyType.containsKeyColumn("l_ADDRESS_2")) {
						key.setl_ADDRESS_2(msgKey.getKeyValue("l_ADDRESS_2"));
					}
					if(msgKeyType.containsKeyColumn("l_ADDRESS_K_1")) {
						key.setl_ADDRESS_K_1(msgKey.getKeyValue("l_ADDRESS_K_1"));
					}
					if(msgKeyType.containsKeyColumn("l_ADDRESS_K_2")) {
						key.setl_ADDRESS_K_2(msgKey.getKeyValue("l_ADDRESS_K_2"));
					}
					if(msgKeyType.containsKeyColumn("l_TEL")) {
						key.setl_TEL(msgKey.getKeyValue("l_TEL"));
					}
					if(msgKeyType.containsKeyColumn("l_FAX")) {
						key.setl_FAX(msgKey.getKeyValue("l_FAX"));
					}
					if(msgKeyType.containsKeyColumn("l_EMAIL")) {
						key.setl_EMAIL(msgKey.getKeyValue("l_EMAIL"));
					}
					if(msgKeyType.containsKeyColumn("l_VEND_ORG")) {
						key.setl_VEND_ORG(msgKey.getKeyValue("l_VEND_ORG"));
					}
					if(msgKeyType.containsKeyColumn("l_VEND_PERSON")) {
						key.setl_VEND_PERSON(msgKey.getKeyValue("l_VEND_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("l_OWN_ORG_CD")) {
						key.setl_OWN_ORG_CD(msgKey.getKeyValue("l_OWN_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_OWN_ORG_NAME")) {
						key.setl_OWN_ORG_NAME(msgKey.getKeyValue("l_OWN_ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_OWN_PERSON_CD")) {
						key.setl_OWN_PERSON_CD(msgKey.getKeyValue("l_OWN_PERSON_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_OWN_PERSON_NAME")) {
						key.setl_OWN_PERSON_NAME(msgKey.getKeyValue("l_OWN_PERSON_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_ROUND_TYP")) {
						key.setl_ROUND_TYP(msgKey.getKeyValue("l_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_TAX_CD")) {
						key.setl_TAX_CD(msgKey.getKeyValue("l_TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_TAX_APPLY_TYP")) {
						key.setl_TAX_APPLY_TYP(msgKey.getKeyValue("l_TAX_APPLY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_TAX_CALC_TYP")) {
						key.setl_TAX_CALC_TYP(msgKey.getKeyValue("l_TAX_CALC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_INSPC_ACPT_APP_TYP")) {
						key.setl_INSPC_ACPT_APP_TYP(msgKey.getKeyValue("l_INSPC_ACPT_APP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_FORM_FLG")) {
						key.setl_ODR_FORM_FLG(msgKey.getKeyValue("l_ODR_FORM_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_EDI_FLG")) {
						key.setl_ODR_EDI_FLG(msgKey.getKeyValue("l_ODR_EDI_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_VEND_REM")) {
						key.setl_VEND_REM(msgKey.getKeyValue("l_VEND_REM"));
					}
					if(msgKeyType.containsKeyColumn("l_CUR_CD")) {
						key.setl_CUR_CD(msgKey.getKeyValue("l_CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_EXCH_TYP")) {
						key.setl_EXCH_TYP(msgKey.getKeyValue("l_EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_IMPORT_TRN_TYP")) {
						key.setl_IMPORT_TRN_TYP(msgKey.getKeyValue("l_IMPORT_TRN_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_COST_RETROACTION_FLG")) {
						key.setl_UNIT_COST_RETROACTION_FLG(msgKey.getKeyValue("l_UNIT_COST_RETROACTION_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_COMPANY_CD")) {
						key.setl_COMPANY_CD(msgKey.getKeyValue("l_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("OUT_VEND_CD")) {
						key.setOUT_VEND_CD(msgKey.getKeyValue("OUT_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_HOME_CUR_CD")) {
						key.setl_HOME_CUR_CD(msgKey.getKeyValue("l_HOME_CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("INSTALL_FLG")) {
						key.setINSTALL_FLG(msgKey.getKeyValue("INSTALL_FLG"));
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
