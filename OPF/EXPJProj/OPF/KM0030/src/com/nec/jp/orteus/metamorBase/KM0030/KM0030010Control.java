/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KM0030/src/com/nec/jp/orteus/metamorBase/KM0030/KM0030010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KM0030;

import com.nec.jp.orteus.metamorBase.KM0030.*;
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
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : KM0030010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: chenjunhua268 $
 * @version $Revision: 1.2 $ $Date: 2014/06/11 03:16:20 $
 *
 */
//}}user_implement_code_header

public class KM0030010Control
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
	public KM0030010Struct getListvalue(int x) { return (KM0030010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public KM0030010Struct getStruct() { return this.struct; }	// Struct�̒l��Ԃ��܂��B
	public KM0030010Struct createStruct() { return new KM0030010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((KM0030010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
    
    /** ��ʑJ�ڃL�[(�Č��ԍ�) */
	private String _ProjectCd;
	/** ��ʑJ�ڃL�[(���ϔԍ�) */
	private String _EstimateNo;
	/**
	 * ��ʑJ�ڃL�[(�Č��ԍ�)�擾
	 * @return�Č��ԍ�
	 */
	public String getProjectCd() {
		return _ProjectCd;
	}
	/**
	 * ��ʑJ�ڃL�[(���ϔԍ�)�擾
	 * @return�Č��ԍ�
	 */
	public String getEstimateNo() {
		return _EstimateNo;
	}
	/**
	 * ��ʑJ�ڃL�[(�Č��ԍ�)�ݒ�
	 * @param cd �Č��ԍ�
	 */
	public void settProjectCd(String no) {
		_ProjectCd = no;
	}
	/**
	 * ��ʑJ�ڃL�[(���ϔԍ�)�ݒ�
	 * @param cd ���ϔԍ�
	 */
	public void setEstimateNo(String no) {
		_EstimateNo = no;
	}
	
	// ���ЃR�[�h
	private String _COMPANY_CD;
	// �̔��Ǘ��p�H��R�[�h
	private String _PLANT_WEB;
	// �Ɩ����t
	private String _BUSINESS_OPR_DATE;
	// �M�݃R�[�h
	private String _HOME_CUR_CD;
	// �o�׏���L/T
	private String _SHIP_LT;
	// �Z�[���ݒ��
	private String _DLV_DATE_CDT;
	// �󒍎����ԓo�^
	private String _PRD_REQ_JOB_ODR_TYP_1;
	// �󒍓o�^���̐��ԍ̔ԕ��@
	private String _PRD_REQ_JOB_ODR_TYP_2;
	// �󒍏��F
	private String _APR_ODR;
	// ���f�t���O
	private String _HAN_TAN;
	
	// ��ЃR�[�h���Q�b�g
	public String get_companyCd() {
		return _COMPANY_CD;
	}
	// ��ЃR�[�h���Z�b�g
	public void set_companyCd(String cd) {
		_COMPANY_CD = cd;
	}
	
	// �̔��Ǘ��p�H��R�[�h���Q�b�g
	public String get_plantWeb() {
		return _PLANT_WEB;
	}
	// �̔��Ǘ��p�H��R�[�h���Z�b�g
	public void set_plantWeb(String cd) {
		_PLANT_WEB = cd;
	}
	
	// �Ɩ����t���Q�b�g
	public String get_businessOprDate() {
		return _BUSINESS_OPR_DATE;
	}
	// �Ɩ����t���Z�b�g
	public void set_businessOprDate(String cd) {
		_BUSINESS_OPR_DATE = cd;
	}
	
	// �M�݃R�[�h���Q�b�g
	public String get_homeCurCd() {
		return _HOME_CUR_CD;
	}
	// �M�݃R�[�h���Z�b�g
	public void set_homeCurCd(String cd) {
		_HOME_CUR_CD = cd;
	}
	
	// �o�׏���L/T���Q�b�g
	public String get_shipLt() {
		return _SHIP_LT;
	}
	// �o�׏���L/T���Z�b�g
	public void set_shipLt(String cd) {
		_SHIP_LT = cd;
	}
	
	// �Z�[���ݒ��
	public String get_dlvDateCdt() {
		return _DLV_DATE_CDT;
	}
	// �Z�[���ݒ��
	public void set_dlvDateCdt(String cd) {
		_DLV_DATE_CDT = cd;
	}
	
	// �󒍎����ԓo�^
	public String getPRD_REQ_JOB_ODR_TYP_1() {
		return _PRD_REQ_JOB_ODR_TYP_1;
	}
	// �󒍎����ԓo�^
	public void setPRD_REQ_JOB_ODR_TYP_1(String cd) {
		_PRD_REQ_JOB_ODR_TYP_1 = cd;
	}
	
	// �󒍓o�^���̐��ԍ̔ԕ��@
	public String getPRD_REQ_JOB_ODR_TYP_2() {
		return _PRD_REQ_JOB_ODR_TYP_2;
	}
	// �󒍓o�^���̐��ԍ̔ԕ��@
	public void setPRD_REQ_JOB_ODR_TYP_2(String cd) {
		_PRD_REQ_JOB_ODR_TYP_2 = cd;
	}

	/**
     * ��񃁃b�Z�[�W�ݒ菈����؂�o���Ċ֐���
     * @param code ���b�Z�[�W�R�[�h
     * @param param ���b�Z�[�W�p�����[�^
     */
    public void setInfoMessage(String code, String param) {
    	ExpjMessage emsg = null;
    	if (param == null) {
    		emsg = new ExpjMessage(code);
    	} else {
    		emsg = new ExpjMessage(code, param);
    	}
        msgStruct.addInfo( emsg ); // ��񃁃b�Z�[�W�Ƃ��ēo�^
        sysLog.warning(emsg, struct.getsUser_ID()); //�����e
    }

	/**
     * �G���[���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
     * @param code ���b�Z�[�W�R�[�h
     * @param param ���b�Z�[�W�p�����[�^
     */
    public void setErrorMessage(String code, String param) {
    	ExpjMessage emsg = null;
    	if (param == null) {
    		emsg = new ExpjMessage(code);
    	} else {
    		emsg = new ExpjMessage(code, param);
    	}
        msgStruct.addError( emsg ); // �G���[���b�Z�[�W�Ƃ��ēo�^
        sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e
    }

	/**
     * ���[�j���O���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
     * @param code ���b�Z�[�W�R�[�h
     * @param param ���b�Z�[�W�p�����[�^
     */
    private void setWarningMessage(String code, String param) {
    	ExpjMessage emsg = null;
    	if (param == null) {
    		emsg = new ExpjMessage(code);
    	} else {
    		emsg = new ExpjMessage(code, param);
    	}
        msgStruct.addWarn( emsg ); // ���[�j���O���b�Z�[�W�Ƃ��ēo�^
        sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e
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
	 * �����l�̃Z�b�g
	 * @throws SQLException 
	 * @throws ComboException 
	 */
	private void setDefaultValue() throws ComboException, SQLException {
		// ���ϔԍ�
		struct.setESTIMATE_NO("0");
		// �󒍓o�^
		struct.setrdoSHIP_INST("true");
		// �󒍍X�V
		struct.setrdoSHIP_UPDATE("");
		// �󒍓�
		struct.setODR_ACPT_DATE(_BUSINESS_OPR_DATE);
		// �����敪
		ComboBox controller = new ComboBox(conn, sysUSER_CD);
		ComboStruct stOdrTyp = controller.getData("ODR_ODR_TYP"); // �����敪
		struct.setODR_TYP(getComboTypeName(stOdrTyp, "3"));
		// ���הԍ�
		struct.setDETAIL_NO("0");
	}
	/**
	 * ���i�G���A�����l�̃Z�b�g
	 * @throws SQLException 
	 * @throws ComboException 
	 */
	private void setDefaultValue1() throws ComboException, SQLException {
		// ���הԍ�
		struct.setDETAIL_NO("0");
		// �󒍓�
		struct.setODR_ACPT_DATE(_BUSINESS_OPR_DATE);
		// �����敪
		ComboBox controller = new ComboBox(conn, sysUSER_CD);
		ComboStruct stOdrTyp = controller.getData("ODR_ODR_TYP"); // �����敪
		struct.setODR_TYP(getComboTypeName(stOdrTyp, "3"));
		// �󒍔ԍ�
		struct.setACPT_ODR_CD("");
		// ���Ӑ撍���ԍ�
		struct.setCUST_ODR_NO("");
		// �w��[��
		struct.setDESINATED_DLV_DATE("");
		// ��z�i�ڎ�
		struct.setESTIMATE_TYPE("");
		// ���Ӑ�i�ڔԍ�
		struct.setCUST_ITEM_CD("");
		// ����
		struct.setQTY("");
		// �󒍒P��
		struct.setODR_UNIT_PRICE("");
		// �󒍋��z
		struct.setODR_AMOUNT("");
		// ���l
		struct.setISSUE_INST_COMMENT("");
		// �󒍒S���҃R�[�h
		struct.setCUST_CHRG_PSN_CD("");
		// �i�ڔԍ�
		struct.setITEM_CD("");
		// ���Ԏ�z�𓯎��ɍs��
		struct.setc_DOODR("");
		// ��z����
		struct.setPREPARE_QTY("");
		// ���Ԕ[��
		struct.setJOB_ODR_DLV_DATE("");
		// �����O���[�v�R�[�h
		struct.setALC_GRP_CD("");
		// ���Ԃ�����͂���
		struct.setc_INPUTODRCD("");
		// ����
		struct.setJOB_ODR_CD("");
		// �󒍋��z(�M��)
		struct.setODR_AMOUNT_EXCH_RATES("");
		// �[�i�ꏊ�R�[�h
		struct.setDLV_LOC_CD("");
		// �i�ږ�
		struct.setITEM_NAME("");
		// ���Ӑ�i�ڔԍ���
		struct.setCUST_ITEM_NAME("");
		// ����
		struct.setQTY_UNIT("");
		// �󒍒P��
		struct.setODR_PRICE_UNIT("");
		// �󒍒S���҃R�[�h��
		struct.setCUST_CHRG_PSN_NAME("");
		// �󒍒S������R�[�h
		struct.setES_ORG_CD("");
		// �󒍒S������R�[�h��
		struct.setES_ORG_NAME("");
		// �i�ڔԍ���
		struct.setITEM_NAME_R("");
	}
	
    /**
	 * ��������̔��f
	 * 
	 * @param str
	 *            ���͂��镶����
	 * @return ���f����
	 */
	private boolean isEmpty(String str) {
		if (str == null || "".equals(str)) {
			return true;
		}
		return false;
	}

    /**
	 * �X�V���̃`�F�b�N���s��
	 * 
	 * @param strModicnt
	 *            �X�V���P
	 * @param lstModicnt
	 *            �X�V��2
	 * @return �X�V���`�F�b�N���� 
	 */
	private boolean checkModifyCnt(String strModicnt, List lstModicnt) {

		if (isEmpty(strModicnt) || lstModicnt == null || lstModicnt.isEmpty()) {
			return false;
		} else if (!strModicnt.equals(((KM0030010Struct)lstModicnt.get(0)).getMODIFY_COUNT())) {
			return false;
		}
		
		return true;
	}

	/**
	 * �Ɩ��^�p���v�Z���\�b�h�𕶎���Ŏ�舵�����߂̕ϊ����\�b�h
	 * @param dateValue ���t������
	 * @param margin ����������
     * @param plantCd �H��R�[�h
	 * @param moveFlg �O�|���t���O
	 * @return �v�Z���ʓ�
	 * @throws ParseException ������̓��t/���l�ϊ��Ɏ��s�����ꍇ�B
	 * @throws FoundationException ���ʕ��i�����Ŏ��s�����ꍇ
	 * @throws ExpjException �ғ����擾�Ɏ��s�����ꍇ
	 */
	private String calcWorkDate(String dateValue, String margin, String plantCd, boolean moveFlg)
		throws ParseException, FoundationException, ExpjException {

	//	SimpleDateFormat sdi = new SimpleDateFormat("yyyy/MM/dd");
		Date date = Converter.strToDate(dateValue, "yyyy/MM/dd");

		//�Ɩ����t�v�Z
		WorkCalendar wkd =
			new WorkCalendar(
				conn,
				sysUSER_CD,
				business.getBusinessCd(),
				plantCd,
				date,
				Integer.parseInt(margin),
				moveFlg);
		Date calcDate = wkd.calcDate();
		if (calcDate == null) {
			throw new ExpjException("KQ00040");
		}

		return Converter.dateToStr(calcDate, "yyyy/MM/dd");
	}

	private String calcWorkDate(String dateValue, String margin, String plantCd)
		throws ParseException, FoundationException, ExpjException {

		if (Integer.parseInt(margin) < 0) {
			return calcWorkDate(dateValue, margin, plantCd, true);
		} else {
			return calcWorkDate(dateValue, margin, plantCd, false);
		}
	}

	/**
	 * �o�׎w����v�Z
	 * @param desinatedDlvDate �w��[��
	 * @param transportLt �^������
	 * @param shipLt �o�׏���L/T
     * @param plantCd �H��R�[�h
	 * @return �o�׎w���
	 * @throws ParseException ������̓��t/���l�ϊ��Ɏ��s�����ꍇ�B
	 * @throws FoundationException ���ʕ��i�����Ŏ��s�����ꍇ
	 */
	private String calcDesinatedShipDate(
		String desinatedDlvDate,
		String transportLt,
		String shipLt,
        String plantCd)
		throws ParseException, FoundationException, ExpjException {

		// �O�|�����������߂�B
		String margin = Calculate.subtract("0", Calculate.add(transportLt, shipLt));
		// �o�׎w��������߂�B
		String desinatedShipDate = calcWorkDate(desinatedDlvDate, margin, plantCd, true);

		// �o�׎w������Ɩ��^�p���̏ꍇ�͋Ɩ��^�p����Ԃ��B
		if (DateTool.compareYMD(desinatedShipDate, _BUSINESS_OPR_DATE) < 0) {
			return _BUSINESS_OPR_DATE;
		} else {
			return desinatedShipDate;
		}
	}

    /**
	 * �M�݂����Z����
	 * 
	 * @param amount
	 *            ���Z�O���z
	 * @param beforCurCd
	 *            ���Z�O�ʉ�
	 * @return ���Z����z
     * @throws FoundationException 
     * @throws SQLException 
	 */
	private String getExchangeAmount(String amount, String beforCurCd) {
		String strExcAmount = "0";

		String strBeforRate = "0"; // �ϊ��O�בփ��[�g
		String strAfterRate = "0"; // �ϊ���בփ��[�g
		
		KM0030010Struct st = new KM0030010Struct();
		st.setCOMPANY_CD(_COMPANY_CD);
		st.setCUR_CD(_HOME_CUR_CD);
		List lstTmp;
		try {
			String decimalFig = "0";
			lstTmp = entity.mM_CUR.read(conn, st);
			if (lstTmp != null && !lstTmp.isEmpty()) {
				decimalFig = convertNull(((KM0030010Struct)lstTmp.get(0)).getDECIMAL_FIG());
			}
			lstTmp = entity.mM_EXCH_RATE.read(conn, st);
			if (lstTmp != null && !lstTmp.isEmpty()) {
				strAfterRate = convertNull(((KM0030010Struct)lstTmp.get(0)).getEXCH_RATE());
			}
			st.setCUR_CD(beforCurCd);
			lstTmp = entity.mM_EXCH_RATE.read(conn, st);
			if (lstTmp != null && !lstTmp.isEmpty()) {
				strBeforRate = convertNull(((KM0030010Struct)lstTmp.get(0)).getEXCH_RATE());
			}
			
			if (Double.parseDouble(strAfterRate) > 0) {
				strExcAmount = Calculate.divide(Calculate.multiply(amount, strBeforRate),
						strAfterRate, Integer.parseInt(decimalFig), Calculate.ROUND);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		return strExcAmount;
	}

    /**
	 * ���Ԃ��擾����
	 * 
	 * @param stDetail
	 *            ���׃f�[�^
	 * @param lstCustBase
	 *            �[�i�ꏊ���
	 * @return ����
     * @throws FoundationException 
     * @throws SQLException 
	 */
	private String getJobOdrCd(KM0030010Struct stDetail, List lstCustBase) throws FoundationException, SQLException {
		String strJobOdrCd = "";

		String strPlantCd = ""; // �H��R�[�h
		if (lstCustBase != null && !lstCustBase.isEmpty()) {
			strPlantCd = ((KM0030010Struct)lstCustBase.get(0)).getSHIP_PLANT_CD();
		}
		if ("0".equals(_PRD_REQ_JOB_ODR_TYP_2) && (null == stDetail.getl_JOB_ODR_CD() || "".equals(stDetail.getl_JOB_ODR_CD()))) {
			Numbering number = new Numbering(conn,Numbering.JOB_OD_CD, struct.getsUser_ID(),sp.getProcId(), strPlantCd);
			strJobOdrCd = number.getNo();
		} else if ("1".equals(_PRD_REQ_JOB_ODR_TYP_2) && (null == stDetail.getl_JOB_ODR_CD() || "".equals(stDetail.getl_JOB_ODR_CD()))) {
			if (!isEmpty(strPlantCd)) {
				String strOdrNo = stDetail.getl_ODR_NO(); // �󒍔ԍ�
				KM0030010Struct st = new KM0030010Struct();
				st.setPLANT_CD(strPlantCd);
				// ���Ԑړ�������������
				List lstSysJobCdCtl = entity.mSYS_JOB_ODR_CD_CTRL.read(conn, st);
				if (lstSysJobCdCtl != null && !lstSysJobCdCtl.isEmpty() && ! isEmpty(strOdrNo)) {
					if (strOdrNo.startsWith("ODR")) {
						strOdrNo = strOdrNo.substring(3);
					}
					strJobOdrCd	= ((KM0030010Struct)lstSysJobCdCtl.get(0)).getJOB_OD_CD_PREFIX() + strOdrNo;
				}
			}
		} else {
			// ��ʂɓ��͂�������
			strJobOdrCd = stDetail.getl_JOB_ODR_CD();
		}
		
		return strJobOdrCd;
	}

    /**
	 * ���Ԏ�z�𓯎��ɍs���̃`�F�b�N
	 * 
	 * @param strOdrTyp
	 *            �����敪
	 * @param strEstimateTyp
	 *            ��z�i�ڎ�
	 * @return �`�F�b�N����
	 */
	private String getc_DOODRSts(String strOdrTyp, String strEstimateTyp) {
		String strResult = "false";

		// �����敪��3�F�m��̏ꍇ
		if ("3".equals(strOdrTyp)) {
			if ("1".equals(strEstimateTyp)
					&& "true".equals(struct.getrdoSHIP_INST())
					&& ("2".equals(_PRD_REQ_JOB_ODR_TYP_1))) {
				strResult = "true";
			}
		}
		
		return strResult;
	}

    /**
	 * ���Ԏ�z������͂���̃`�F�b�N
	 * 
	 * @return �`�F�b�N����
	 */
	private String getc_INPUTODRCDSts(KM0030010Struct stDetail) {
		String strResult = "false";

		// PRD_REQ_JOB_ODR_TYP_2�f��[�p�����[�^].�g�ݒ�l�h=�f0�f�A�f�P�f�̏ꍇ
		if ("true".equals(stDetail.getl_c_DOODR())
							&& "2".equals(_PRD_REQ_JOB_ODR_TYP_2)) {
			strResult = "true";
		}
		
		return strResult;
	}

    /**
	 * �V�X�e���p�����[�^�̎擾
	 * 
	 * @param syspara
	 *            �V�X�e���p�����[�^
	 * @return �V�X�e���p�����[�^
     * @throws SQLException 
     * @throws FoundationException 
	 */
	private String getSysParameter(String syspara) throws FoundationException, SQLException {
		String strSysval = null;
		KM0030010Struct st = new KM0030010Struct();
		st.setNAME(syspara);
		List lstsys = entity.mSYS_PARAMETER.read(conn, st);
		if (!lstsys.isEmpty()) {
			strSysval = ((KM0030010Struct)lstsys.get(0)).getVALUE();
			if (isEmpty(strSysval)) {
				strSysval = "";
			}
		}
		return strSysval;
	}

    /**
	 * ���Ӑ���̎擾
	 * 
	 * @param custCd
	 *            ���Ӑ�R�[�h
	 * @return ���Ӑ���
     * @throws SQLException 
     * @throws FoundationException 
	 */
	private KM0030010Struct getCust(String custCd) throws FoundationException, SQLException {
		KM0030010Struct stCust = null;
		struct.setCUST_CD(custCd); // ���Ӑ�R�[�h
		struct.setCOMPANY_CD(_COMPANY_CD);
		// ���Ӑ�R�[�h�̑��݃`�F�b�N
		List lstCust = entity.mM_CUST.read(conn, struct);
		if (lstCust == null || lstCust.isEmpty()) {
			setErrorMessage("KQ00014", null);
		} else {
			stCust = (KM0030010Struct)lstCust.get(0);
			struct.setCUST_NAME(stCust.getCUST_NAME()); // ���Ӑ於
		}
		
		return stCust;
	}

    /**
	 * �ʉݏ��̎擾
	 * 
	 * @param curCd
	 *            �ʉ݃R�[�h
	 * @return �ʉݏ��
     * @throws SQLException 
     * @throws FoundationException 
	 */
	private KM0030010Struct getCur(String curCd) throws FoundationException, SQLException {
		KM0030010Struct stCur = null;
		struct.setCUR_CD(curCd); // �ʉ݃R�[�h
		
		// �ʉ݃R�[�h�̑��݃`�F�b�N
		List lstCur = entity.mM_CUR.read(conn, struct);
		if (lstCur == null || lstCur.isEmpty()) {
			setErrorMessage("KQ00073", null);
		} else {
			stCur = (KM0030010Struct)lstCur.get(0);
		}
		
		return stCur;
	}

    /**
	 * [���i][�i��]�̏����擾����
	 * 
	 * @param stcond
	 *            ���������i�[
	 * @param itemcd
	 *            ���Ӑ�i�ڔԍ�
	 * @param detailno
	 *            ���הԍ�
	 * @return ���i���
     * @throws SQLException 
     * @throws FoundationException 
	 */
	private KM0030010Struct getItemSpec(KM0030010Struct stcond, String itemcd, String detailno) throws FoundationException, SQLException {
		KM0030010Struct stItemSpec = null;
        if (itemcd == null) {
        	stItemSpec = new KM0030010Struct();
        } else {
        	stcond.setCUST_ITEM_CD(itemcd); // ���Ӑ�i�ڔԍ�
    		
    		List lstItemSpec = entity.mM_ITEM_SPEC.read(conn, stcond);
    		if (lstItemSpec == null || lstItemSpec.isEmpty()) {
    				setWarningMessage("KM00036", detailno);
    				stItemSpec = new KM0030010Struct();
    		} else {
    			stItemSpec = (KM0030010Struct)lstItemSpec.get(0);
    		}
        }
		return stItemSpec;
	}

    /**
	 * ���[�U�̏����擾����
	 * 
	 * @param userCd
	 *            ���[�U�R�[�h
	 * @return ���[�U��
     * @throws SQLException 
     * @throws FoundationException 
	 */
	private String getUserName(String userCd) throws FoundationException, SQLException {
		String strOrgName = "";
		KM0030010Struct st = new KM0030010Struct();
		st.setCOMPANY_CD(_COMPANY_CD);
		st.setUSER_CD(userCd);
		
		List lstItemSpec = entity.mUSER_MST.read(conn, st);
		if (lstItemSpec != null && !lstItemSpec.isEmpty()) {
			strOrgName = ((KM0030010Struct)lstItemSpec.get(0)).getUSER_NAME();
		}
		
		return strOrgName;
	}

    /**
	 * ����̏����擾����
	 * 
	 * @param orgCd
	 *            ����R�[�h
	 * @return ���喼
     * @throws SQLException 
     * @throws FoundationException 
	 */
	private String getOrgName(String orgCd) throws FoundationException, SQLException {
		String strOrgName = "";
		KM0030010Struct st = new KM0030010Struct();
		st.setCOMPANY_CD(_COMPANY_CD);
		st.setORG_CD(orgCd);
		
		List lstItemSpec = entity.mM_ORG.read(conn, st);
		if (lstItemSpec != null && !lstItemSpec.isEmpty()) {
			strOrgName = ((KM0030010Struct)lstItemSpec.get(0)).getORG_NAME();
		}
		
		return strOrgName;
	}

    /**
	 * �������ǂ����𔻒f����
	 * 
	 * @param strQty
	 *            ���͒l
	 * @return ���f����
	 */
	private boolean isDecimal(String strQty) {
		if (!isEmpty(strQty)) {
			if (strQty.indexOf(".") >= 0 && !strQty.endsWith(".")) {
				String strDecimal = strQty.substring(strQty.indexOf(".") + 1);
				if (!isEmpty(strDecimal) && Double.parseDouble(strDecimal) > 0) {
					return true;
				}
			}
		}
		return false;
	}

    /**
	 * ���Ԕ[���̌v�Z
	 * 
	 * @param strDesinatedDlvDate
	 *            �w��[��
	 * @param lstCustBase
	 *            �[�i�ꏊ���
	 * @return ���Ԕ[��
     * @throws SQLException 
     * @throws FoundationException 
     * @throws ParseException 
	 */
	private String getJobDlvDate(String strDesinatedDlvDate, List lstCustBase) throws FoundationException, SQLException {
		String strJobDlvDate = null;
		
		// �[�i�ꏊ���̎擾
		if (lstCustBase != null && !lstCustBase.isEmpty()) {
			KM0030010Struct stCustBase = (KM0030010Struct)lstCustBase.get(0);
			
			int amount = Integer.parseInt(Calculate.add(stCustBase.getTRANSPORT_LT(), _SHIP_LT));
			// �Ɩ����t�v�Z���i�̐���
			WorkCalendar wkd;
			try {
				wkd = new WorkCalendar(conn, sysUSER_CD, business.getBusinessCd(),
						stCustBase.getSHIP_PLANT_CD(), Converter.strToDate(strDesinatedDlvDate, "yyyy/MM/dd"),
						amount*(-1), true);
				Date calcDate = wkd.calcDate();
				strJobDlvDate = Converter.dateToStr(calcDate, "yyyy/MM/dd");
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		
		return strJobDlvDate;
	}
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0030");
		logger.entering("KM0030010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		
		if(list != null)
		{
			list.clear();
		} else {
			list = new ArrayList();
		}
		
		try {
			// �����l�̃Z�b�g
			// �󒍓�
			struct.setODR_ACPT_DATE(_BUSINESS_OPR_DATE);
			// �����敪
			ComboBox controller = new ComboBox(conn, sysUSER_CD);
			ComboStruct stOdrTyp = controller.getData("ODR_ODR_TYP"); // �����敪
			struct.setODR_TYP(getComboTypeName(stOdrTyp, "3"));
			// ���הԍ�
			struct.setDETAIL_NO("0");
			// �Ǎ��X�e�[�^�X�ݒ�
        	setReadStatus(INITIAL);
        	
			KM0030010Struct st = new KM0030010Struct();
			KM0030010Struct sttmp = null;
			KM0030010Struct stProject = null; // �Č�
			KM0030010Struct stCust = null; // ���Ӑ�
			KM0030010Struct stCur = null; // �ʉ�
			KM0030010Struct stEstimate = null; // ����
			KM0030010Struct stCustBase = null; // �[�i�ꏊ
			List lstDetailTarget = new ArrayList(); // �ꗗ�̕\���Ώ�

            // �R���{�{�b�N�X�f�[�^�p��
            ComboStruct stestimateTyp = controller.getData("ESTIMATE_TYPE"); // ��z�i�ڎ�
            ComboStruct DepoTyps = controller.getData("DEPO_TYP"); // �a���q�ɋ敪
            struct.seth_ODR_TYP3(getComboTypeName(stOdrTyp, "3"));

			// �Č��ԍ��̑��݃`�F�b�N
			List lstAnken = entity.mT_PROJECT.read(conn, struct);
			if (lstAnken == null || lstAnken.isEmpty()) {
				setErrorMessage("KM00001", null);
				return;
			}
			stProject = (KM0030010Struct)lstAnken.get(0);

			// ���Ӑ���̎擾
			stCust = getCust(stProject.getCUST_CD());
			if (stCust == null) {
				return;
			}
			
			struct.setPROJECT_NAME(stProject.getPROJECT_NAME()); // �Č���
			st.setCUST_CD(stProject.getCUST_CD()); // ���Ӑ�R�[�h
			st.setCOMPANY_CD(_COMPANY_CD); // ��ЃR�[�h
			st.setPROJECT_CD(stProject.getPROJECT_CD()); // �Č��ԍ�
			if (null != stProject.getDLV_LOC_CD() && !"".equals(stProject.getDLV_LOC_CD())) {
				st.setDLV_LOC_CD(stProject.getDLV_LOC_CD()); // �[�i�ꏊ�R�[�h
				// �[�i�ꏊ���̎擾
				List lstCustBase = entity.mM_CUST_BASE.read(conn, st);
				if (lstCustBase != null && !lstCustBase.isEmpty()) {
					stCustBase = (KM0030010Struct)lstCustBase.get(0);
				}
			}else{
				stCustBase = new KM0030010Struct();
			}
			
			// [���].�g�󒍓o�^�h�̃��W�I�{�^�����`�F�b�NOn�̏ꍇ
			if ("true".equals(struct.getrdoSHIP_INST())) {
				
    			// =======================================
    			// �Ǎ������i�󒍓o�^�j
    			// =======================================
				
				// �u�Č��X�e�[�^�X�v��2:���ρA3:�����A4:�m��󒍂łȂ��ꍇ
				if (!"2".equals(stProject.getPROJECT_STAT())
						&& !"3".equals(stProject.getPROJECT_STAT())
						&& !"4".equals(stProject.getPROJECT_STAT())) {
					setErrorMessage("KM00011", null);
					return;
				}
				
				// �ʉݏ��̎擾
				stCur = getCur(stCust.getCUR_CD());
				if (stCur == null) {
					return;
				}
				
				// [����]�̏����擾����
				List lstEstimate = null;
				List lstEstimateR = null;
				
				if (!"0".equals(struct.getESTIMATE_NO())) {
				   lstEstimate = entity.mT_ESTIMATE.read(conn, struct);
				}
				if ("0".equals(struct.getESTIMATE_NO())) {
				   lstEstimateR = entity.mT_ESTIMATE_R.read(conn, struct);
				}
				
				if ((lstEstimate != null && lstEstimate.size() > 0) || (lstEstimateR != null && lstEstimateR.size() > 0)) {
					if (lstEstimate != null && lstEstimate.size() > 0){
						stEstimate = (KM0030010Struct)lstEstimate.get(0);
						if ("9".equals(stEstimate.getESTIMATE_STAT())) {
							setErrorMessage("KM00050", null);
							return;
						}
					}else{
						stEstimate = (KM0030010Struct)lstEstimateR.get(0);
						if ("9".equals(stEstimate.getESTIMATE_STAT())) {
							setErrorMessage("KM00050", null);
							return;
						}
						struct.setESTIMATE_NO(stEstimate.getESTIMATE_NO());
					}
					
					// [���ϖ���]�̏����擾����
					List lstDetail = entity.mT_ESTIMATE_DETAL.read(conn, struct);
					if (!lstDetail.isEmpty()) {
						List lstPjOdrAlc = null;
						st.setESTIMATE_NO(struct.getESTIMATE_NO()); // ���ϔԍ�
						for (int i = 0; i < lstDetail.size(); i++) {
							sttmp = (KM0030010Struct)lstDetail.get(i);
							struct.setDETAL_NO(sttmp.getDETAL_NO());
							// ���F�˗��������`�F�b�N���āA���F�˗����̏ꍇ�A�ꗗ�Ώۂ��珜�O����
							List lstTranApr = entity.mselectT_TRAN_APR.read(conn, struct);
							st.setDETAL_NO(sttmp.getDETAL_NO());
							if (lstTranApr.size() != 0) {
								continue;
							} else {
								// �Č��󒍕R�t�ɑ��݂��Ȃ��ꍇ�A�ꗗ�̕\���ΏۂƂ���
								lstPjOdrAlc = entity.mT_PJ_ODR_ALC.read(conn, st);
								if (lstPjOdrAlc.size()  == 0) {
									lstDetailTarget.add(sttmp);
								}
							}
						}
					}
				} else {
					setErrorMessage("ZZ06001", null);
					return;
				}
				
				
				// �ꗗ�̕\���Ώۃf�[�^�����݂��Ȃ��ꍇ
				if (lstDetailTarget.size() == 0) {
					setErrorMessage("ZZ06001", null);
					return;
				}

				KM0030010Struct stDetail = null; // �ꗗ�̖��׃f�[�^
				KM0030010Struct stItemSpec = null; // ���i
				for (int i = 0; i < lstDetailTarget.size(); i++) {
					sttmp = (KM0030010Struct)lstDetailTarget.get(i);
					
					// [���i][�i��]�̏����擾����
					
					stItemSpec = getItemSpec(st, sttmp.getCUST_ITEM_CD(), sttmp.getDETAL_NO());
					
					stDetail = new KM0030010Struct();
					stDetail.setl_DETAL_NO(sttmp.getDETAL_NO()); // ���הԍ�
					stDetail.setl_ESTIMATE_TYPE(getComboTypeName(stestimateTyp, sttmp.getESTIMATE_TYPE())); // ��z�i�ڎ�
					stDetail.setl_h_ESTIMATE_TYPE(sttmp.getESTIMATE_TYPE()); // ��z�i�ڎ�
					stDetail.setl_ESTIMATE_ITEM_NAME(sttmp.getITEM_NAME()); // �i�ږ�
					stDetail.setl_ODR_NO(null); // �󒍔ԍ�
					stDetail.setl_ODR_TYP(null); // �����敪
					stDetail.setl_CUST_ODR_NO(null); // ���Ӑ撍���ԍ�
					stDetail.setl_CUST_ITEM_CD(sttmp.getCUST_ITEM_CD()); // ���Ӑ�i�ڔԍ�
					stDetail.setl_ITEM_CD(stItemSpec.getITEM_CD()); // �i�ڔԍ�
					stDetail.setl_DESINATED_DLV_DATE(sttmp.getDESINATED_DLV_DATE()); // �w��[��
					stDetail.setl_ODR_QTY(sttmp.getESTIMATE_QTY()); // �󒍐���
					stDetail.setl_UNIT_CD(sttmp.getUNIT_CD()); // �P��
					stDetail.setl_ESTIMATE_UNIT_PRICE(sttmp.getESTIMATE_UNIT_PRICE()); // �󒍒P��
					stDetail.setl_CUR_UNIT(stCur.getCUR_UNIT()); // �ʉݒP��
					stDetail.setl_ODR_AMOUNT(sttmp.getESTIMATE_AMOUNT()); // �󒍋��z
					stDetail.setl_ODR_AMOUNT_EXCH_RATES(getExchangeAmount(stDetail.getl_ODR_AMOUNT(),
							stCust.getCUR_CD())); // �󒍋��z(�M��)
					if ("1".equals(stDetail.getl_h_ESTIMATE_TYPE())) {
						stDetail.setl_DLV_LOC_CD(stProject.getDLV_LOC_CD()); // �[�i�ꏊ�R�[�h
						stDetail.seth_DLV_LOC_CD(stProject.getDLV_LOC_CD()); // �[�i�ꏊ�R�[�h
					}
					stDetail.setl_DLV_LOC_NAME(stCustBase.getDLV_LOC_NAME()); // �[�i�ꏊ��
					stDetail.setl_DEPO_TYP(getComboTypeName(DepoTyps, stItemSpec.getDEPO_TYP())); // �a���q�ɋ敪
					stDetail.setl_h_DEPO_TYP(stItemSpec.getDEPO_TYP()); // �a���q�ɋ敪
					stDetail.setl_CUST_ITEM_NAME(stItemSpec.getCUST_ITEM_NAME()); // ���Ӑ�i�ږ���
					stDetail.setl_ITEM_NAME(stItemSpec.getITEM_NAME()); // �i�ږ���
					stDetail.setl_ODR_ACPT_DATE(_BUSINESS_OPR_DATE); // �󒍓�
					stDetail.setl_ESTIMATE_QTY(null); // ��z����
					stDetail.setl_JOB_ODR_DLV_DATE(null); // ���Ԕ[��
					stDetail.setl_ALC_GRP_CD(null); // �����O���[�v�R�[�h
					stDetail.setl_JOB_ODR_CD(null); // ����
					stDetail.setl_REMARKS(null); // ���l
					stDetail.setl_APPR_REMARKS(null); // ���F���l
					stDetail.setl_OWN_PERSON_CD(stEstimate.getES_USER_CD()); // �󒍒S���҃R�[�h
					stDetail.setl_CUST_CHRG_PSN_NAME(getUserName(stDetail.getl_OWN_PERSON_CD())); // �󒍒S���Җ�
					stDetail.setl_OWN_ORG_CD(stEstimate.getES_ORG_CD()); // �󒍒S������R�[�h
					stDetail.setl_CUST_CHRG_ORG_NAME(getOrgName(stDetail.getl_OWN_ORG_CD())); // �󒍒S�����喼
					stDetail.setl_c_DOODR(getc_DOODRSts("3", sttmp.getESTIMATE_TYPE())); // ���Ԏ�z�𓯎��ɍs���i��\���j
					stDetail.setl_c_INPUTODRCD(getc_INPUTODRCDSts(stDetail)); // ���Ԏ�z������͂���i��\���j
					if (entity.mT_RLSD_PUCH_ODR.check(conn, st)) {
						stDetail.setl_h_PREC_ARRANGE_FLG("1"); // ��s��z�L���t���O�i��\���j
					} else {
						stDetail.setl_h_PREC_ARRANGE_FLG("0"); // ��s��z�L���t���O�i��\���j
					}
					
					stDetail.setl_h_ESTIMATE_TYPE(sttmp.getESTIMATE_TYPE());
					stDetail.setl_TEST_MODIFY_COUNT(stEstimate.getMODIFY_COUNT()); // [����]�̍X�V��
					stDetail.setl_TPJ_MODIFY_COUNT(stProject.getMODIFY_COUNT()); // [�Č�]�̍X�V��
					
					// �בփ��[�g �� �擾�G���[ �����������ꍇ
					if (Double.parseDouble(stDetail.getl_ODR_AMOUNT_EXCH_RATES()) == 0) {
						setErrorMessage("KQ00038", String.valueOf(i + 1));
						return;
					}
					
					list.add(stDetail);
				}
				
			} else {
				// [���].�g�󒍍X�V�h�̃��W�I�{�^�����`�F�b�NOn�̏ꍇ
				
    			// =======================================
    			// �Ǎ������i�󒍍X�V�j
    			// =======================================
				
				// �u�Č��X�e�[�^�X�v��4:�m��󒍂łȂ��ꍇ
				if (!"4".equals(stProject.getPROJECT_STAT())) {
					setErrorMessage("ZZ06001", null);
					return;
				}
				
				// �ʉݏ��̎擾
				stCur = getCur(stCust.getCUR_CD());
				if (stCur == null) {
					return;
				}
				
				// [����]�̏����擾����
				List lstEstimate = null;
			    List lstEstimateR = null;
			    
				if (!"0".equals(struct.getESTIMATE_NO())) {
				   lstEstimate = entity.mT_ESTIMATE2.read(conn, struct);
				}
				if ("0".equals(struct.getESTIMATE_NO())) {
				   lstEstimateR = entity.mT_ESTIMATE2_R.read(conn, struct);
				}
				if ((lstEstimate != null && lstEstimate.size() > 0) || (lstEstimateR != null && lstEstimateR.size() > 0)) {
					if (lstEstimate != null && lstEstimate.size() > 0){
						stEstimate = (KM0030010Struct)lstEstimate.get(0);
					}else{
						stEstimate = (KM0030010Struct)lstEstimateR.get(0);
						struct.setESTIMATE_NO(stEstimate.getESTIMATE_NO());
					}
					
					// [���ϖ���]�̏����擾����
					List lstDetail = entity.mT_ESTIMATE_DETAL.read(conn, struct);
					if (lstDetail != null) {
						List lstPjOdrAlc = null;
						KM0030010Struct stPjOdrAlc = null;
						if (!"0".equals(struct.getESTIMATE_NO())) {
						   st.setESTIMATE_NO(stEstimate.getESTIMATE_NO()); // ���ϔԍ�
						}
						if ("0".equals(struct.getESTIMATE_NO())) {
						   st.setESTIMATE_NO(stEstimate.getESTIMATE_NO()); // ���ϔԍ�
						}
						for (int i = 0; i < lstDetail.size(); i++) {
							sttmp = (KM0030010Struct)lstDetail.get(i);
							struct.setDETAL_NO(sttmp.getDETAL_NO());
							lstPjOdrAlc = entity.mT_PJ_ODR_ALC.read(conn, st);
							// ���F�˗��������`�F�b�N���āA���F�˗����̏ꍇ�A�ꗗ�Ώۂ��珜�O����
							List lstTranApr = entity.mselectT_TRAN_APR1.read(conn, struct);
							if (lstTranApr.size() != 0) {
								continue;
							} 

							st.setDETAL_NO(sttmp.getDETAL_NO());
							lstPjOdrAlc = entity.mT_PJ_ODR_ALC.read(conn, st);
														
							if (lstPjOdrAlc != null && !lstPjOdrAlc.isEmpty()) {
								stPjOdrAlc = (KM0030010Struct)lstPjOdrAlc.get(0);
								
								sttmp.setESTIMATE_TYPE(stPjOdrAlc.getESTIMATE_TYPE()); // ��z�i�ڎ�
								sttmp.setODR_NO(stPjOdrAlc.getODR_NO()); // �󒍔ԍ�
								
								lstDetailTarget.add(sttmp);
							}
						}
					}
				} else {
					setErrorMessage("ZZ06001", null);
					return;
				}
				
				// �ꗗ�̕\���Ώۃf�[�^�����݂��Ȃ��ꍇ
				if (lstDetailTarget.size() == 0) {
					setErrorMessage("ZZ06001", null);
					return;
				}

				KM0030010Struct stDetail = null; // �ꗗ�̖��׃f�[�^
				KM0030010Struct stItemSpec = null; // ���i
				KM0030010Struct stItemSpec1 = null; // ���Ԍv��
				KM0030010Struct stOdr = null; // �󒍖���
				List lstOdr = null;
				for (int i = 0; i < lstDetailTarget.size(); i++) {
					sttmp = (KM0030010Struct)lstDetailTarget.get(i);
					
					st.setODR_NO(sttmp.getODR_NO()); // �󒍔ԍ�
					st.setCOMPANY_CD(_COMPANY_CD); // ��ЃR�[�h
					// ��z�i�ڎ킪1:���i�̏ꍇ
					if ("1".equals(sttmp.getESTIMATE_TYPE())) {
						lstOdr = entity.mT_ODR.read(conn, st);
					} else {
						lstOdr = entity.mT_ODR_UNSTOCK.read(conn, st);
					}
					if (lstOdr == null || lstOdr.isEmpty()) {
						continue;
					}
					stOdr = (KM0030010Struct)lstOdr.get(0);
					
                    if ("1".equals(sttmp.getESTIMATE_TYPE())) {
                    	// [���i][�i��]�̏����擾����
    					stItemSpec = getItemSpec(st, stOdr.getl_CUST_ITEM_CD(), sttmp.getDETAL_NO());
                    }else{
                    	KM0030010Struct sItem = new KM0030010Struct();
                    	sItem.setITEM_CD(stOdr.getl_ITEM_CD());
                    	List lstItemSpec = entity.mselectM_ITEM.read(conn, sItem);
                		if (lstItemSpec == null || lstItemSpec.isEmpty()) {
                			stItemSpec = new KM0030010Struct();
                		} else {
                			stItemSpec = (KM0030010Struct)lstItemSpec.get(0);
                		}
                    }
					
					stDetail = new KM0030010Struct();
					stDetail.setl_DETAL_NO(sttmp.getDETAL_NO()); // ���הԍ�
					stDetail.setl_ESTIMATE_TYPE(getComboTypeName(stestimateTyp, sttmp.getESTIMATE_TYPE())); // ��z�i�ڎ�
					stDetail.setl_h_ESTIMATE_TYPE(sttmp.getESTIMATE_TYPE()); // ��z�i�ڎ�
					stDetail.setl_ESTIMATE_ITEM_NAME(sttmp.getITEM_NAME()); // �i�ږ�
					stDetail.setl_ODR_NO(stOdr.getl_ODR_NO()); // �󒍔ԍ�
					if ("1".equals(sttmp.getESTIMATE_TYPE())) {
						stDetail.setl_ODR_TYP(getComboTypeName(stOdrTyp, stOdr.getl_ODR_TYP())); // �����敪
						stDetail.setl_h_ODR_TYP(stOdr.getl_ODR_TYP());
						stDetail.setl_CUST_ITEM_CD(stOdr.getl_CUST_ITEM_CD()); // ���Ӑ�i�ڔԍ�
						stDetail.setl_DLV_LOC_CD(stOdr.getl_DLV_LOC_CD()); // �[�i�ꏊ�R�[�h
						if (null != stDetail.getl_DLV_LOC_CD() && !"".equals(stDetail.getl_DLV_LOC_CD())) {
							st.setDLV_LOC_CD(stDetail.getl_DLV_LOC_CD()); // �[�i�ꏊ�R�[�h
							// �[�i�ꏊ���̎擾
							List lstCustBase = entity.mM_CUST_BASE.read(conn, st);
							if (lstCustBase != null && !lstCustBase.isEmpty()) {
								stCustBase = (KM0030010Struct)lstCustBase.get(0);
							}
						}else{
							stCustBase = new KM0030010Struct();
						}
						stDetail.setl_DLV_LOC_NAME(stCustBase.getDLV_LOC_NAME()); // �[�i�ꏊ��
					} else {
						stDetail.setl_ODR_TYP(getComboTypeName(stOdrTyp, "3")); // �����敪
						stDetail.setl_h_ODR_TYP("3");
						stDetail.setl_CUST_ITEM_CD(null); // ���Ӑ�i�ڔԍ�
						stDetail.setl_DLV_LOC_CD(null); // �[�i�ꏊ�R�[�h
					}
					// ���ԏ��̎擾
					List lstJobOdrR = entity.mT_JOB_ODR_R.read(conn, st);
					if (lstJobOdrR == null || lstJobOdrR.isEmpty()) {
            			stItemSpec1 = new KM0030010Struct();
            		} else {
            			stItemSpec1 = (KM0030010Struct)lstJobOdrR.get(0);
            		}
					stDetail.setl_CUST_ODR_NO(stOdr.getl_CUST_ODR_NO()); // ���Ӑ撍���ԍ�
					
					stDetail.setl_ITEM_CD(stOdr.getl_ITEM_CD()); // �i�ڔԍ�
					stDetail.setl_DESINATED_DLV_DATE(stOdr.getl_DESINATED_DLV_DATE()); // �w��[��
					stDetail.setl_ODR_QTY(stOdr.getl_ODR_QTY()); // �󒍐���
					stDetail.setl_UNIT_CD(stOdr.getl_UNIT_CD()); // �P��
					stDetail.setl_ESTIMATE_UNIT_PRICE(stOdr.getl_ESTIMATE_UNIT_PRICE()); // �󒍒P��
					stDetail.setl_CUR_UNIT(stCur.getCUR_UNIT()); // �ʉݒP��
					stDetail.setl_ODR_AMOUNT(stOdr.getl_ODR_AMOUNT()); // �󒍋��z
					stDetail.setl_ODR_AMOUNT_EXCH_RATES(stOdr.getl_ODR_AMOUNT_EXCH_RATES()); // �󒍋��z(�M��)
					
					stDetail.setl_DEPO_TYP(getComboTypeName(DepoTyps, stItemSpec.getDEPO_TYP())); // �a���q�ɋ敪
					stDetail.setl_h_DEPO_TYP(stItemSpec.getDEPO_TYP()); // �a���q�ɋ敪
					stDetail.setl_CUST_ITEM_NAME(stItemSpec.getCUST_ITEM_NAME()); // ���Ӑ�i�ږ���
					stDetail.setl_ITEM_NAME(stItemSpec.getITEM_NAME()); // �i�ږ���
					stDetail.setl_ODR_ACPT_DATE(stOdr.getl_ODR_ACPT_DATE()); // �󒍓�
					stDetail.setl_ESTIMATE_QTY(stItemSpec1.getJOB_ODR_QTY()); // ��z����
					stDetail.setl_JOB_ODR_DLV_DATE(stItemSpec1.getJOB_ODR_DLV_DATE()); // ���Ԕ[��
					stDetail.setl_ALC_GRP_CD(stItemSpec1.getALC_GRP_CD()); // �����O���[�v�R�[�h
					stDetail.setl_JOB_ODR_CD(stItemSpec1.getJOB_ODR_CD()); // ����
					stDetail.setl_REMARKS(stOdr.getl_REMARKS()); // ���l
					stDetail.setl_APPR_REMARKS(null); // ���F���l
					stDetail.setl_OWN_PERSON_CD(stOdr.getl_OWN_PERSON_CD()); // �󒍒S���҃R�[�h
					stDetail.setl_CUST_CHRG_PSN_NAME(getUserName(stDetail.getl_OWN_PERSON_CD())); // �󒍒S���Җ�
					stDetail.setl_OWN_ORG_CD(stOdr.getl_OWN_ORG_CD()); // �󒍒S������R�[�h
					stDetail.setl_CUST_CHRG_ORG_NAME(getOrgName(stDetail.getl_OWN_ORG_CD())); // �󒍒S�����喼
					stDetail.setl_c_DOODR(getc_DOODRSts(stDetail.getl_h_ODR_TYP(), sttmp.getESTIMATE_TYPE())); // ���Ԏ�z�𓯎��ɍs���i��\���j
					stDetail.setl_c_INPUTODRCD(getc_INPUTODRCDSts(stDetail)); // ���Ԏ�z������͂���i��\���j
					if (entity.mT_RLSD_PUCH_ODR.check(conn, st)) {
						stDetail.setl_h_PREC_ARRANGE_FLG("1"); // ��s��z�L���t���O�i��\���j
					} else {
						stDetail.setl_h_PREC_ARRANGE_FLG("0"); // ��s��z�L���t���O�i��\���j
					}
					
					stDetail.setl_h_ESTIMATE_TYPE(sttmp.getESTIMATE_TYPE());
					stDetail.setl_TODR_MODIFY_COUNT(stOdr.getl_TODR_MODIFY_COUNT()); // [�󒍖���]�̍X�V��
					stDetail.setl_TEST_MODIFY_COUNT(stEstimate.getMODIFY_COUNT()); // [����]�̍X�V��
					stDetail.setl_TPJ_MODIFY_COUNT(stProject.getMODIFY_COUNT()); // [�Č�]�̍X�V��
					List listTemp = entity.mselectT_ANS_DLV_DATE.read(conn, stDetail);
					if(listTemp.isEmpty()){
						stDetail.setl_h_ANS_DLV_DATE_EXIST_FLG("N");
					}else{
						KM0030010Struct wStruct = (KM0030010Struct) listTemp.get(0);
						stDetail.setl_h_ANS_DLV_DATE_EXIST_FLG( wStruct.getl_h_ANS_DLV_DATE_EXIST_FLG() );
					}
					list.add(stDetail);
				}
			}
            setReadStatus(NORMAL);
            
            // �ꗗ�̕\���Ώۃf�[�^�����݂��Ȃ��ꍇ
			if (list.size() == 0) {
				setErrorMessage("ZZ06001", null);
				return;
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
            setReadStatus(ERROR);
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("KM0030010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �C���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlModify() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0030");
		logger.entering("KM0030010Control"+":USER="+struct.getsUser_ID(),"controlModify");
			//{{user_implement_dev:<controlModify>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			KM0030010Struct st = new KM0030010Struct();
			KM0030010Struct stDetail = null;
			KM0030010Struct stCustBase = null;
			KM0030010Struct sttmp = null;
			
			st.setCUST_CD(struct.getCUST_CD()); // ���Ӑ�R�[�h
			st.setCOMPANY_CD(_COMPANY_CD); // ��ЃR�[�h
			st.setDLV_LOC_CD(struct.getDLV_LOC_CD()); // �[�i�ꏊ�R�[�h
			st.setl_DLV_LOC_NAME(struct.getDLV_LOC_NAME()); // �[�i�ꏊ��
			
			// �[�i�ꏊ�R�[�h�̎擾���s��
			List lstCustBase = entity.mM_CUST_BASE.read(conn, st);
			// [���Ӑ�[�i�ꏊ] �ɑ��݂��Ȃ��ꍇ
			if (lstCustBase == null || lstCustBase.isEmpty()) {
				if ("1".equals(struct.geth_ESTIMATE_TYPE())) {
					setErrorMessage("KQ00015", null);
					return;	
				} else {
					stCustBase = new KM0030010Struct();
				}
			} else if (lstCustBase.size() > 1) {
				if ("1".equals(struct.geth_ESTIMATE_TYPE())) {
					setErrorMessage("KQ00016", null);
					return;
				} else {
					stCustBase = new KM0030010Struct();
				}
			} else {
				stCustBase = (KM0030010Struct)lstCustBase.get(0);
			}
			KM0030010Struct stCheckItemSpec = null;
			
			// [���].�g�󒍓o�^�h�̃��W�I�{�^�����`�F�b�NOn�̏ꍇ
			if ("true".equals(struct.getrdoSHIP_INST())) {
				
				st.setCUST_ITEM_CD(struct.getCUST_ITEM_CD()); // ���Ӑ�i�ڔԍ�
				List lstCheckItemSpec = entity.mCHECK_M_ITEM_SPEC.read(conn, st);
				// [���i] �ɑ��݂��Ȃ��ꍇ
				if ((lstCheckItemSpec == null || lstCheckItemSpec.isEmpty())) {
					if(!"".equals(st.getCUST_ITEM_CD())){
						setErrorMessage("KQ00017", null);
						return;
					}else{
						stCheckItemSpec = new KM0030010Struct();
					}
				} else  {
					stCheckItemSpec = (KM0030010Struct)lstCheckItemSpec.get(0);
					
					// [�i��] �ɑ��݂��Ȃ��ꍇ
					if (isEmpty(stCheckItemSpec.getITEM_CD())) {
						setErrorMessage("KQ00027", null);
						return;
					}
					st.setITEM_CD(stCheckItemSpec.getITEM_CD()); // �i�ڔԍ�
					
					// [���i].�g�a���q�ɋ敪"�@���@20:�a�� �̏ꍇ
					if ("20".equals(stCheckItemSpec.getDEPO_TYP())) {
						
						// [���Ӑ�[�i�ꏊ].�g���o�a���ۊǋ�" ���@Null�@�̏ꍇ
						if (isEmpty(stCustBase.getDEPO_WH_CD())) {
							setErrorMessage("KQ20001", null);
							return;
						}
						
						// [���].�g�����敪" ���@3:�m��@�̏ꍇ
						if ("3".equals(struct.geth_ODR_TYP())) {
							setErrorMessage("KQ00081", null);
							return;
						}
					}
				}
			} else {
				st.setITEM_CD(struct.getITEM_CD()); // �i�ڔԍ�
			}
			List lstItem = entity.mM_ITEM.read(conn, st);
			// ���i���̎擾
			List lstDetail = entity.mT_ESTIMATE_DETAL1.read(conn, struct);
			if (lstDetail != null && !lstDetail.isEmpty()) {
				sttmp = (KM0030010Struct)lstDetail.get(0);
			} else {
				sttmp = new KM0030010Struct();
			}
			
			if (lstItem != null && !lstItem.isEmpty()) {
				KM0030010Struct stItem = (KM0030010Struct)lstItem.get(0);
				// [�i��]."�݌ɐ��P�ʋ敪" �� 1:�����Ǘ� ����[���]."�󒍐���" �� �����łȂ��ꍇ
				if ("1".equals(stItem.getUNIT_QTY_TYP()) && isDecimal(struct.getQTY())) {
					setWarningMessage("KQ20004", null);
					struct.setQTY(Calculate.ceil(struct.getQTY(), 0));
					struct.setODR_AMOUNT(Calculate.multiply(struct.getQTY(), struct.getODR_UNIT_PRICE()));
					struct.setODR_AMOUNT_EXCH_RATES(getExchangeAmount(struct.getODR_AMOUNT(),
							_HOME_CUR_CD)); // �󒍋��z(�M��)
				}
			}
			
            // �R���{�{�b�N�X�f�[�^�p��
            ComboBox controller = new ComboBox(conn, sysUSER_CD);
            ComboStruct stOdrTyp = controller.getData("ODR_ODR_TYP"); // �����敪
            ComboStruct DepoTyps = controller.getData("DEPO_TYP"); // �a���q�ɋ敪
			
			for (int i = 0; i < list.size(); i++) {
				stDetail = (KM0030010Struct)list.get(i);
				if (struct.getDETAIL_NO().equals(stDetail.getl_DETAL_NO())) {
					
					stDetail.setl_CUST_ODR_NO(struct.getCUST_ODR_NO()); // ���Ӑ撍���ԍ�
					stDetail.setl_DESINATED_DLV_DATE(struct.getDESINATED_DLV_DATE()); // �w��[��
					
					stDetail.setl_DLV_LOC_NAME(stCustBase.getDLV_LOC_NAME()); // �[�i�ꏊ��
					stDetail.setl_ODR_ACPT_DATE(struct.getODR_ACPT_DATE()); // �󒍓�
					stDetail.setl_REMARKS(struct.getISSUE_INST_COMMENT()); // ���l
					stDetail.setl_APPR_REMARKS(struct.getAPPROVED_COMMENT()); // ���F���l
					stDetail.setl_OWN_PERSON_CD(struct.getCUST_CHRG_PSN_CD()); // �󒍒S���҃R�[�h
					stDetail.setl_OWN_ORG_CD(struct.getES_ORG_CD()); // �󒍒S������R�[�h
					stDetail.setl_CUST_CHRG_PSN_NAME(getUserName(stDetail.getl_OWN_PERSON_CD())); // �󒍒S���Җ�
					stDetail.setl_CUST_CHRG_ORG_NAME(getOrgName(stDetail.getl_OWN_ORG_CD())); // �󒍒S�����喼
					
					// [���].�g�󒍓o�^�h�̃��W�I�{�^�����`�F�b�NOn�̏ꍇ
					if ("true".equals(struct.getrdoSHIP_INST())) {
						stDetail.setl_ODR_TYP(getComboTypeName(stOdrTyp, struct.geth_ODR_TYP())); // �����敪
						stDetail.setl_h_ODR_TYP(struct.geth_ODR_TYP()); //�����敪
						stDetail.setl_CUST_ITEM_CD(struct.getCUST_ITEM_CD()); // ���Ӑ�i�ڔԍ�
						stDetail.setl_ITEM_CD(st.getITEM_CD()); // �i�ڔԍ�
						stDetail.setl_h_DEPO_TYP(stCheckItemSpec.getDEPO_TYP());// �a���q�ɋ敪
						stDetail.setl_DEPO_TYP(getComboTypeName(DepoTyps, stCheckItemSpec.getDEPO_TYP())); // �a���q�ɋ敪
						stDetail.setl_CUST_ITEM_NAME(stCheckItemSpec.getCUST_ITEM_NAME()); // ���Ӑ�i�ږ���
						stDetail.setl_ITEM_NAME(stCheckItemSpec.getITEM_NAME()); // �i�ږ���
						stDetail.setl_JOB_ODR_CD(struct.getJOB_ODR_CD()); // ����
						stDetail.setl_ESTIMATE_QTY(struct.getPREPARE_QTY()); // ��z����
						stDetail.setl_JOB_ODR_DLV_DATE(struct.getJOB_ODR_DLV_DATE()); // ���Ԕ[��
						stDetail.setl_UNIT_CD(sttmp.getUNIT_CD()); // �P��
						stDetail.setl_ALC_GRP_CD(struct.getALC_GRP_CD()); // �����O���[�v�R�[�h
						stDetail.setl_c_DOODR(struct.getc_DOODR()); // ���Ԏ�z�𓯎��ɍs���i��\���j
						stDetail.setl_c_INPUTODRCD(struct.getc_INPUTODRCD()); // ���Ԏ�z������͂���i��\���j
						stDetail.setl_ODR_QTY(struct.getQTY()); // �󒍐���
						stDetail.setl_ODR_AMOUNT(struct.getODR_AMOUNT()); // �󒍋��z
						stDetail.setl_ODR_AMOUNT_EXCH_RATES(struct.getODR_AMOUNT_EXCH_RATES()); // �󒍋��z(�M��)
						stDetail.setl_DLV_LOC_CD(stCustBase.getDLV_LOC_CD()); // �[�i�ꏊ�R�[�h
					} else {
						stDetail.setl_ODR_QTY(struct.getQTY()); // �󒍐���
						stDetail.setl_ODR_AMOUNT(struct.getODR_AMOUNT()); // �󒍋��z
						stDetail.setl_ODR_AMOUNT_EXCH_RATES(struct.getODR_AMOUNT_EXCH_RATES()); // �󒍋��z(�M��)
						stDetail.seth_UPDATE_FLG("1"); // �X�V�t���O(��\��)(1:�X�V)
						if ("1".equals(stDetail.getl_h_ESTIMATE_TYPE())) {
							stDetail.setl_DLV_LOC_CD(stCustBase.getDLV_LOC_CD()); // �[�i�ꏊ�R�[�h
						}
					}
					break;
				}
			}
            setReadStatus(NORMAL);
            setDefaultValue1();
			
		} catch(Exception e) {
			e.printStackTrace();
            setReadStatus(ERROR);
            throw new ExpjException(e);
		}
                //}}user_implement_dev:<controlModify>
		logger.exiting("KM0030010Control"+":USER="+struct.getsUser_ID(),"controlModify");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0030");
		logger.entering("KM0030010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
		try {
			KM0030010Struct st = new KM0030010Struct();
			KM0030010Struct stDetail = null;
			KM0030010Struct stCustBase = null;
			KM0030010Struct stItem = null;
			List lstTOdrCtl = null;
			List lstCustBase = null;
			List lstItem = null;
			String strOdr = ""; // �󒍔ԍ�
			String strCtlOdr = ""; // �󒍊Ǘ��ԍ�
			String strDlvDateCdt = DateTool.addDay(_BUSINESS_OPR_DATE, _DLV_DATE_CDT); // �Z�[��
			boolean isNearDlvDate = false;
			// �S���R�[�h�̓o�^����
			boolean appSucessFlg = false;

			beginTransaction();
			
			// =======================================
			// ���Ӑ���̎擾
			// =======================================
			st.setCUST_CD(struct.getCUST_CD()); // ���Ӑ�R�[�h
			st.setCOMPANY_CD(_COMPANY_CD); // ��ЃR�[�h
			st.setPROJECT_CD(struct.getPROJECT_CD()); // �Č��ԍ�
			st.setESTIMATE_NO(struct.getESTIMATE_NO()); // ���ϔԍ�
			st.setsUser_ID(this.getsysUSER_CD()); // ���[�U�R�[�h
			List lstCust = entity.mM_CUST.read(conn, st);
			KM0030010Struct stCust = (KM0030010Struct)lstCust.get(0);

			for (int i = 0; i < list.size(); i++) {
				stDetail = (KM0030010Struct)list.get(i);
				
				// ���Ӑ撍���ԍ���null�łȂ��s��Ώۂɓo�^�������s��
				if (isEmpty(stDetail.getl_CUST_ODR_NO())) {
					continue;
				}
					
				// ��z�i�ڎ킪���i�̏ꍇ
				if ("1".equals(stDetail.getl_h_ESTIMATE_TYPE())) {
					
					st.setDLV_LOC_CD(stDetail.getl_DLV_LOC_CD()); // �[�i�ꏊ�R�[�h
					// �[�i�ꏊ���̎擾
					lstCustBase = entity.mM_CUST_BASE.read(conn, st);
					if (lstCustBase != null && !lstCustBase.isEmpty()) {
						stCustBase = (KM0030010Struct)lstCustBase.get(0);
						st.setPLANT_CD(stCustBase.getSHIP_PLANT_CD());
					}
					// ���i���̎擾
					st.setCUST_CD(struct.getCUST_CD()); // ���Ӑ�R�[�h
					st.setCOMPANY_CD(_COMPANY_CD); // ��ЃR�[�h
					st.setCUST_ITEM_CD(stDetail.getl_CUST_ITEM_CD()); // ���Ӑ�i�ڔԍ�
					lstItem = entity.mM_ITEM_SPEC2.read(conn, st);
					if (lstItem != null && !lstItem.isEmpty()) {
						stItem = (KM0030010Struct)lstItem.get(0);
					}

					// �Z�[���󒍂̏ꍇ
					if (DateTool.compareYMD(stDetail.getl_DESINATED_DLV_DATE(), strDlvDateCdt) <= 0) {
						isNearDlvDate = true;
					}
					// �󒍓o�^���̐��ԍ̔ԕ��@
					st.setNAME("PRD_REQ_JOB_ODR_TYP_2");
					List resultList = entity.mSYS_PARAMETER.read(conn, st);
					if (!resultList.isEmpty()) {
						_PRD_REQ_JOB_ODR_TYP_2 = ((KM0030010Struct)resultList.get(0)).getVALUE();
						struct.seth_PRD_REQ_JOB_ODR_TYP_2(_PRD_REQ_JOB_ODR_TYP_2);
					}
					// ���Ԃ𓯎��ɓo�^����ꍇ
					String strJobOdrCd = null;
					if ("true".equals(stDetail.getl_c_DOODR())) {
						// ���Ԃ��̔Ԃ���
						strJobOdrCd = getJobOdrCd(stDetail, lstCustBase); // ����
						if (isEmpty(strJobOdrCd)) {
							setErrorMessage("AB00023", null);
							return;
						}
						stDetail.setl_JOB_ODR_CD(strJobOdrCd);
					}
					// �ꗗ�̖��׍s.�h���ԁh�̃R���g���[����null�łȂ��ꍇ
					if ("true".equals(stDetail.getl_c_DOODR())) {
						
						st.setJOB_ODR_CD(stDetail.getl_JOB_ODR_CD()); // ����
						// ���Ԃ�[���Ԍv��]�ɑ��݂���ꍇ
						if (entity.mCHECK_JOB_ODR_CD.check(conn, st)) {
							setErrorMessage("ZZ01102", null);
							return;
						}
						st.setITEM_CD(stDetail.getl_ITEM_CD()); // �i�ڔԍ�
						// [�i��].�g�i�ڎ�z�敪�h�@���P�F���ԁA2�F�݌Ɉ����^���ԈȊO�̏ꍇ
						if (!entity.mCHECK_M_ITEM.check(conn, st)) {
							setErrorMessage("KQ00324", null);
							return;
						}
						
						// ���Y�H��i�[�i�ꏊ�R�[�h���炻�̏o�בq�ɂ�����H��擾�j�̃J�����_���擾�ł��Ȃ��ꍇ/���Y�H��̋Ɩ��^�p�����擾�ł��Ȃ������ꍇ
						if (!entity.mCHECK_CAL.check(conn, st)) {
							setErrorMessage("KQ00325", null);
							return;
						}
						// ���Y�H��̋Ɩ��^�p�����擾�ł��Ȃ������ꍇ
						resultList = entity.mSYS_DATE_CTRL.read(conn, st);
						if (resultList.isEmpty()) {
							setErrorMessage("KQ00330", null);
							return;
						} 
						
						// ���Ԕ[����Null�ȊO�̏ꍇ
						KM0030010Struct stResult = (KM0030010Struct)resultList.get(0);;
						if (!isEmpty(stDetail.getl_JOB_ODR_DLV_DATE())) {
							// �i���Y�H��́j�Ɩ��^�p���@���@���Ԕ[���̏ꍇ
							if (DateTool.compareYMD(stResult.getBUSINESS_OPR_DATE(), stDetail.getl_JOB_ODR_DLV_DATE()) > 0) {
								setErrorMessage("KQ00331", null);
								return;
							}
							
							st.setJOB_ODR_DLV_DATE(stDetail.getl_JOB_ODR_DLV_DATE()); // ���Ԕ[��
							// ���Y�H��Ŕ�ғ����̏ꍇ
							if (entity.mCHECK_HOLIDAY.check(conn, st)) {
								setErrorMessage("KQ00326", null);
								return;
							}
						} else {
							// ���Ԕ[���Z�o�����炩�̗��R�łł��Ȃ��Ƃ�
							String strJobDlvDate = getJobDlvDate(stDetail.getl_DESINATED_DLV_DATE(), lstCustBase);
							if (isEmpty(strJobDlvDate)) {
								setErrorMessage("KQ00327", null);
								return;
							}
							
							// �i���Y�H��́j�Ɩ��^�p���@���@�v�Z���ꂽ���Ԕ[���̏ꍇ
							 
							if (DateTool.compareYMD(stResult.getBUSINESS_OPR_DATE(), strJobDlvDate) > 0) {
								setWarningMessage("KQ00332", null);
							}
							stDetail.setl_JOB_ODR_DLV_DATE(strJobDlvDate);
						}
					}
					
					// �p�����[�^�u�󒍏��F�v��1�̎�
					if ("1".equals(struct.geth_APR_ODR())) {
						
						// �󒍒S�����呶�݃`�F�b�N
						if (isEmpty(stDetail.getl_OWN_ORG_CD())) {
							setErrorMessage("KQ00335", null);
							return;
						}
						stDetail.setsUser_ID(struct.getsUser_ID());
						stDetail.setCUST_CD(struct.getCUST_CD());
						stDetail.setPROJECT_CD(struct.getPROJECT_CD());
						stDetail.setESTIMATE_NO(struct.getESTIMATE_NO());
						stDetail.setCUST_NAME(struct.getCUST_NAME());
						// �y�󒍏��F�˗������z�����s����
						ApprProc.execInsertProcess(conn, stDetail, this);
						appSucessFlg = true;
						continue;
					}

	    			// =======================================
	    			// �󒍊Ǘ��ԍ��̎擾
	    			// =======================================
					st.setCUST_ITEM_CD(stDetail.getl_CUST_ITEM_CD());
					st.setITEM_CD(stDetail.getl_ITEM_CD());
					lstTOdrCtl = entity.mT_ODR_CTL.read(conn, st);
					
					// �Y�����R�[�h�������ꍇ
					if (lstTOdrCtl == null || lstTOdrCtl.isEmpty()) {
						
		    			// =======================================
		    			// �󒍊Ǘ��̓o�^
		    			// =======================================
						
						List lstSeqOdrCtl = entity.mSEQ_ODR_CTL.read(conn, st);
						if (lstSeqOdrCtl.isEmpty()) {
							setErrorMessage("KQ00030", String.valueOf(i + 1));
							return;
						}
						strCtlOdr = ((KM0030010Struct)lstSeqOdrCtl.get(0)).getODR_CTL_NO(); // �󒍊Ǘ��ԍ�
						st.setODR_CTL_NO(strCtlOdr); // �󒍊Ǘ��ԍ�
						st.setCUST_ITEM_CD(stDetail.getl_CUST_ITEM_CD()); // ���Ӑ�i�ڔԍ�
						st.setCUST_ITEM_NAME(stDetail.getl_CUST_ITEM_NAME()); // ���Ӑ�i�ږ���
						st.setITEM_CD(stDetail.getl_ITEM_CD()); // �i�ڔԍ�
						st.setITEM_NAME(stDetail.getl_ITEM_NAME()); // �i�ږ���
						
						// �󒍊Ǘ��̓o�^���s��
						entity.mT_ODR_CTL.create(conn, st);
						
					} else if (lstTOdrCtl.size() > 1) {
						setErrorMessage("KQ00029", String.valueOf(i + 1));
						return;
					} else {
						strCtlOdr = ((KM0030010Struct)lstTOdrCtl.get(0)).getODR_CTL_NO(); // �󒍊Ǘ��ԍ�
					}
					
	    			// =======================================
	    			// �󒍖��ׂ̓o�^
	    			// =======================================
					
					List lstSeqOdr = entity.mSEQ_ODR.read(conn, st);
					if (lstSeqOdr.isEmpty()) {
						setErrorMessage("KQ00031", String.valueOf(i + 1));
						return;
					}
					String strOdrNo = ((KM0030010Struct)lstSeqOdr.get(0)).getODR_NO(); // // �󒍔ԍ�
					st.setODR_NO(strOdrNo); // �󒍔ԍ�
					st.setODR_TYP(stDetail.getl_h_ODR_TYP()); // �����敪
					st.setODR_CTL_NO(strCtlOdr); // �󒍊Ǘ��ԍ�
					st.setCUST_ODR_NO(stDetail.getl_CUST_ODR_NO()); // ���Ӑ撍���ԍ�
					st.setCUST_CHRG_ORG_CD(stDetail.getl_OWN_ORG_CD()); // �c�ƒS������R�[�h
					st.setCUST_CHRG_PSN_CD(stDetail.getl_OWN_PERSON_CD()); // �c�ƒS���҃R�[�h
					st.setODR_ACPT_PSN_CD(this.getsysUSER_CD()); // ���s�S���҃R�[�h
					st.setCURRNCY_CD(stCust.getCUR_CD()); // �ʉ݃R�[�h
					st.setEXCH_TYP(stCust.getEXCH_TYP()); // �ב֎��
					st.setDLV_LOC_CD(stDetail.getl_DLV_LOC_CD()); // �[�i�ꏊ�R�[�h
					st.setDLV_LOC_NAME_KANJI(stDetail.getl_DLV_LOC_NAME()); // �[�i�ꏊ���i�����j
					st.setODR_UNIT_PRICE(stDetail.getl_ESTIMATE_UNIT_PRICE()); // �󒍒P��
					st.setSPCL_PRICE_TYP("1"); // ���l�敪
					st.setDEPO_TYP(stDetail.getl_h_DEPO_TYP()); // �a���q�ɋ敪
					st.setDESINATED_DLV_DATE(stDetail.getl_DESINATED_DLV_DATE()); // �w��[��
					st.setSTD_DESINATED_RCV_DATE(stDetail.getl_DESINATED_DLV_DATE()); // ����Ɏw��[��
					st.setODR_QTY(stDetail.getl_ODR_QTY()); // �󒍐���
					st.setREMAIN_UNCONFIRM_ODR_QTY("0"); // �����c����
					st.setCANCELED_UNCONFIRM_ODR_QTY("0"); // ����������
					st.setUNIT_CD(stDetail.getl_UNIT_CD()); // �P��
					st.setUNCONFIRM_ODR_BALANCE("0"); // �����c���z
					st.setODR_AMOUNT(Calculate.multiply(convertNull(st.getODR_UNIT_PRICE()), convertNull(st.getODR_QTY()))); // �󒍋��z
					st.setODR_AMOUNT_EXCH_RATES(getExchangeAmount(st.getODR_AMOUNT(),
							st.getCURRNCY_CD())); // �󒍋��z�i�M�݁j
					st.setODR_CMPLT_FLG("0"); // �󒍊����t���O
					st.setPART_NAME(getSysParameter("SHIP_SLIP_PART_NAME")); // ��ʕi��
					st.setTRANSPORT_CD(stCustBase.getTRANSPORT_CD()); // �^���փR�[�h
					st.setTRANSPORT_TYP(stCustBase.getTRANSPORT_TYP()); // �A���`�ԋ敪
					st.setTAX_APPLY_TYP(stCust.getTAX_APPLY_TYP()); // ����œK�p�敪
					String strTAX_CD = stCust.getTAX_CD() ;
					if( "1".equals(stCust.getTAX_APPLY_TYP()) ) { //���i�}�X�^�̏���ŃR�[�h
						strTAX_CD = stItem.getTAX_CD();
					}
					st.setTAX_CD(strTAX_CD); // ����ŃR�[�h
					st.setTAX_CALC_TYP(stCust.getTAX_CALC_TYP()); // ����Ōv�Z�敪
					st.setREMARKS(stDetail.getl_REMARKS()); // ���l
					st.setODR_ACPT_DATE(stDetail.getl_ODR_ACPT_DATE()); // �󒍓�
					// �Z�[���󒍂̏ꍇ
					if (isNearDlvDate) {
						st.setSHIP_PLAN_REMAIN_QTY("0"); // �o�׌v��c����
					} else {
						st.setSHIP_PLAN_REMAIN_QTY(stDetail.getl_ODR_QTY()); // �o�׌v��c����
					}
					st.setSHIP_PLAN_CMPLT_FLG("0"); // �o�׌v�抮���t���O
					st.setUNCONFIRMED_ODR_EFF_OVR_FLG("0"); // �����L�����Ԓ��߃t���O
					st.setPARTIAL_SHIP_INST_FLG(stCust.getPARTIAL_SHIP_INST_FLG()); // ���[�o�׎w���t���O
					st.setIF_CTL_NO(null); // IF���Ǘ��ԍ�
					st.setODR_SEQ(null); // ��������
					st.setENTRY_TYP("2"); // �f�[�^���͋敪(�Q �i�I�����C���E�Œ�j)
					st.setDEL_FLG("0"); // �폜�t���O
					st.setJOB_ODR_SET_FLG("0"); // ���Ԑݒ�t���O
					
					// �󒍖��ׂ̓o�^�������s��
					entity.mT_ODR.create(conn, st);
					
	    			// =======================================
	    			// �󒍗����̓o�^
	    			// =======================================
					List lstSeqRsltOdr = entity.mSEQ_RSLT_ODR.read(conn, st);
					if (lstSeqRsltOdr == null && lstSeqRsltOdr.isEmpty()) {
						setErrorMessage("KQ00035", null);
						return;
					}
					
					st.setRSLT_CTL_SEQ_CD(((KM0030010Struct)lstSeqRsltOdr.get(0)).getRSLT_CTL_SEQ_CD()); // �����Ǘ��ԍ�
					st.setODR_CTL_NO(strCtlOdr); // �󒍊Ǘ��ԍ�
					st.setODR_NO(strOdrNo); // �󒍔ԍ�
					st.setCUST_ODR_NO(stDetail.getl_CUST_ODR_NO()); // ���Ӑ撍���ԍ�
					st.setODR_TYP(stDetail.getl_h_ODR_TYP()); // �����敪
					st.setCUST_CD(struct.getCUST_CD()); // ���Ӑ�R�[�h
					st.setCUST_ITEM_CD(stDetail.getl_CUST_ITEM_CD()); // ���Ӑ�i�ڔԍ�
					st.setITEM_CD(stDetail.getl_ITEM_CD()); // �i�ڔԍ�
					st.setODR_QTY(stDetail.getl_ODR_QTY()); // �󒍐���
					st.setUNIT(stDetail.getl_UNIT_CD()); // �P��
					st.setDLV_PLACE_CD(stDetail.getl_DLV_LOC_CD()); // �[�i�ꏊ�R�[�h
					st.setUNIT_PRICE(stDetail.getl_ESTIMATE_UNIT_PRICE()); // �P��
					st.setCUR_CD(stCust.getCUR_CD()); // �ʉ݃R�[�h
					st.setSPCL_PRICE_CO("1"); // ���l�敪
					st.setDEPO_TYP(stDetail.getl_h_DEPO_TYP()); // �a���q�ɋ敪
					st.setREMARKS(stDetail.getl_REMARKS()); // ���l
					st.setCUST_CHRG_PSN_CD(stDetail.getl_OWN_PERSON_CD()); // �c�ƒS���҃R�[�h
					st.setODR_ACPT_PSN_CD(this.getsysUSER_CD()); // ���s�S���҃R�[�h
					st.setIF_CTL_NO(null); // IF���Ǘ��ԍ�
					st.setODR_SEQ(null); // ��������
					st.setODR_ACPT_DATE(stDetail.getl_ODR_ACPT_DATE()); // �󒍓�
					st.setTAX_CD(strTAX_CD); // ����ŃR�[�h
					
					// �󒍗����̓o�^�������s��
					entity.mT_ODR_ACPT_RSLT.create(conn, st);
					
	    			// =======================================
	    			// �o�׌v��̓o�^
	    			// =======================================
					
					// �Z�[���󒍂̏ꍇ
					if (isNearDlvDate && "3".equals(stDetail.getl_h_ODR_TYP())) {

						String desinatedShipDate = calcDesinatedShipDate(stDetail.getl_DESINATED_DLV_DATE(),
								stCustBase.getTRANSPORT_LT(), _SHIP_LT, stCustBase.getSHIP_PLANT_CD());
						String lastAnsDlvDateRcd = calcWorkDate(desinatedShipDate, stCustBase.getTRANSPORT_LT(),
								stCustBase.getSHIP_PLANT_CD());
						
						st.setODR_NO(strOdrNo); // �󒍔ԍ�
						st.setPART_DLV_SEQ_NO("1"); // ���[����
						st.setLAST_ANS_DLV_DATE_RCD(lastAnsDlvDateRcd); // �ŐV�[���񓚓�
						st.setDESINATED_SHIP_DATE(desinatedShipDate); // �o�׎w���
						st.setDESINATED_SHIP_QTY(stDetail.getl_ODR_QTY()); // �o�׎w�萔��
						st.setREST_SHIP_ODR_QTY(stDetail.getl_ODR_QTY()); // �o�׎w���c����
						st.setSHIP_ODR_CMPLT_FLG("0"); // �o�׎w�������t���O
						st.setIF_CTL_NO("0"); // IF���Ǘ��ԍ�
						st.setDEL_FLG("0"); // �폜�t���O
						
						// �m�o�׌v��n�̓o�^�������s��
						entity.mT_ANS_DLV_DATE.create(conn, st);
					}
					
					// ���Ԃ𓯎��ɓo�^����ꍇ
					if ("true".equals(stDetail.getl_c_DOODR())) {

		    			// =======================================
		    			// �󒍖��ׂ̍X�V
		    			// =======================================
						st.setODR_NO(strOdrNo); // �󒍔ԍ�
						st.setJOB_ODR_SET_FLG("1"); // ���Ԑݒ�t���O
						
						// [�󒍖���]���X�V����
						entity.mT_ODR.update(conn, st);
						
						//�u���Ԏ�z�𓯎��ɍs���v���`�F�b�NOn�̏ꍇ�A�܂���z���ʖ����͂̏ꍇ�A�u�o�^�v�Ŏ󒍐��ʂ���
						if ("true".equals(stDetail.getl_c_DOODR()) && "0.0".equals(stDetail.getl_ESTIMATE_QTY())) {
							stDetail.setl_ESTIMATE_QTY(stDetail.getl_ODR_QTY());
						}
		    			// =======================================
		    			// ���Ԍv��̓o�^
		    			// =======================================
						st.setJOB_ODR_CD(strJobOdrCd); // ����
						st.setJOB_ODR_CANCEL_NO("0"); // ���Ԏ�����הԍ�
						st.setJOB_ODR_TYP("1"); // ���Ԏ��(�P�F�󒍐���)
						st.setITEM_CD(stDetail.getl_ITEM_CD()); // �i�ڔԍ�
						st.setPLAN_TYP("1"); // �v��^�C�v(�P�F��)
						st.setJOB_ODR_DLV_DATE(stDetail.getl_JOB_ODR_DLV_DATE()); // ���Ԕ[��
					    st.setJOB_ODR_QTY(stDetail.getl_ESTIMATE_QTY()); // ���Ԑ���
						st.setALC_GRP_CD(stDetail.getl_ALC_GRP_CD()); // �����O���[�v�R�[�h
						st.setJOB_ODR_STS_TYP("2"); // ���ԏ�ԋ敪
						st.setJOB_ODR_EXP_TYP("1"); // ���ԏ����敪
						st.setJOB_ODR_DEL_FLG("0"); // ���ԍ폜�t���O
						st.setPLANT_CD(stCustBase.getSHIP_PLANT_CD()); // �H��R�[�h
						
						// �m�o�׌v��n�̓o�^�������s��
						entity.mT_JOB_ODR.create(conn, st);
		    			// =======================================
		    			// ���v�ʌv�Z����i���ԁj�̓o�^
		    			// =======================================
						st.setPLANT_CD(stCustBase.getSHIP_PLANT_CD()); // �H��R�[�h
						st.setJOB_ODR_CD(strJobOdrCd); // ����
						st.setUSER_CD(struct.getsUser_ID());
						// [���v�ʌv�Z����i���ԁj]�֒ǉ�����
						entity.mSYS_JOB_OD_CALC_CTRL.create(conn, st);
                        
						
		    			// =======================================
		    			// ���Ԏ󒍕R�t�̓o�^
		    			// =======================================
						st.setJOB_ODR_CD(strJobOdrCd); // ����
						st.setPLANT_CD(stCustBase.getSHIP_PLANT_CD()); // �H��R�[�h
						st.setODR_NO(strOdrNo); // �󒍔ԍ�
						if (Calculate.compare(convertNull(stDetail.getl_ODR_QTY()),
								convertNull(stDetail.getl_ESTIMATE_QTY())) >= 0) {
							st.setALCD_QTY(stDetail.getl_ESTIMATE_QTY()); // �R�t�ςݐ�
						} else {
							st.setALCD_QTY(stDetail.getl_ODR_QTY()); // �R�t�ςݐ�
						}
						st.setCOMPANY_CD(_COMPANY_CD); // ��ЃR�[�h
						
						// [���Ԏ󒍕R�t]��o�^����
						entity.mT_JOB_ODR_ODR_ALC.create(conn, st);
					}

	    			// =======================================
	    			// �Č��󒍕R�t�̓o�^
	    			// =======================================
					st.setDETAL_NO(stDetail.getl_DETAL_NO()); // ���הԍ�
					st.setODR_NO(strOdrNo); // �󒍔ԍ�
					st.setESTIMATE_TYPE("1"); // ��z�i�ڎ�(1:���i)
					
					// [�Č��󒍕R�t]��o�^����
					entity.mT_PJ_ODR_ALC.create(conn, st);

	    			// =======================================
	    			// ���ϖ��ׂ̍X�V
	    			// =======================================
					st.setODR_FLG("1"); // �󒍗L���t���O(1:�L��)
					st.setl_DETAL_NO(st.getDETAL_NO()); // ���הԍ�
					// [���ϖ���]���X�V����
					entity.mT_ESTIMATE_DETAL.update(conn, st);
				} else {
					
					// �p�����[�^�u�󒍏��F�v��1�̎�
					if ("1".equals(struct.geth_APR_ODR())) {
						
						// �󒍒S�����呶�݃`�F�b�N
						if (isEmpty(stDetail.getl_OWN_ORG_CD())) {
							setErrorMessage("KQ00335", null);
							return;
						}
						stDetail.setsUser_ID(struct.getsUser_ID());
						stDetail.setCUST_CD(struct.getCUST_CD());
						stDetail.setPROJECT_CD(struct.getPROJECT_CD());
						stDetail.setESTIMATE_NO(struct.getESTIMATE_NO());
						stDetail.setCUST_NAME(struct.getCUST_NAME());
						// �y�󒍏��F�˗������z�����s����
						ApprProc.execInsertProcess(conn, stDetail, this);
						appSucessFlg = true;
						continue;
					}
					
	    			// =======================================
	    			// ��݌Ɏ󒍂̓o�^
	    			// =======================================
					List lstSeqOdr = entity.mSEQ_ODR_UNSTOCK.read(conn, st);
					strOdr = ((KM0030010Struct)lstSeqOdr.get(0)).getODR_NO(); // �󒍔ԍ�
					
					st.setODR_NO(strOdr); // �󒍔ԍ�
					st.setCOMPANY_CD(_COMPANY_CD); // ��ЃR�[�h
					st.setSLIP_CD(null); // �`�[�ԍ�
					st.setCUST_ODR_NO(stDetail.getl_CUST_ODR_NO()); // ���Ӑ撍���ԍ�
					st.setCUST_CD(struct.getCUST_CD()); // ���Ӑ�R�[�h
					st.setITEM_CD(stDetail.getl_ITEM_CD()); // �i�ڔԍ�
					st.setITEM_NAME(stDetail.getl_ESTIMATE_ITEM_NAME()); // �i�ږ���
					st.setCUST_CHRG_PSN_CD(stDetail.getl_OWN_PERSON_CD()); // �c�ƒS���҃R�[�h
					st.setODR_ACPT_PSN_CD(this.getsysUSER_CD()); // ���s�S���҃R�[�h
					st.setCURRNCY_CD(stCust.getCUR_CD()); // �ʉ݃R�[�h
					st.setEXCH_TYP(stCust.getEXCH_TYP()); // �ב֎��
					st.setDESINATED_DLV_DATE(stDetail.getl_DESINATED_DLV_DATE()); // �w��[��
					st.setODR_UNIT_PRICE(stDetail.getl_ESTIMATE_UNIT_PRICE()); // �󒍒P��
					st.setODR_QTY(stDetail.getl_ODR_QTY()); // �󒍐���
					st.setODR_AMOUNT(Calculate.multiply(convertNull(st.getODR_UNIT_PRICE()),
							convertNull(st.getODR_QTY()))); // �󒍋��z
					st.setODR_AMOUNT_EXCH_RATES(getExchangeAmount(st.getODR_AMOUNT(),
							st.getCURRNCY_CD())); // �󒍋��z�i�M�݁j
					st.setTAX_APPLY_TYP(stCust.getTAX_APPLY_TYP()); // ����œK�p�敪
					st.setTAX_CD(stCust.getTAX_CD()); // ����ŃR�[�h
					st.setTAX_CALC_TYP(stCust.getTAX_CALC_TYP()); // ����Ōv�Z�敪
					st.setREMARKS(stDetail.getl_REMARKS()); // ���l
					st.setODR_ACPT_DATE(stDetail.getl_ODR_ACPT_DATE()); // �󒍓�
					st.setORGN_ODR_NO(null); // ���󒍔ԍ�
					st.setADD_ODR_FLG(null); // ���z�󒍃t���O
					st.setODR_CMPLT_FLG("0"); // �󒍊����t���O
					st.setODR_CMPLT_DATE(null); // �󒍊�����
					st.setDEL_FLG("0"); // �폜�t���O
					st.setCUST_CHRG_ORG_CD(stDetail.getl_OWN_ORG_CD()); // �c�ƒS������R�[�h
					st.setODR_ACPT_ORG_CD(null); // ���s�S���ҕ���R�[�h
					
					// [��݌Ɏ�] �ɓo�^����
					entity.mT_ODR_UNSTOCK.create(conn, st);
					
	    			// =======================================
	    			// ��݌Ɏ󒍗����̓o�^
	    			// =======================================
					List lstSeqRsltOdr = entity.mSEQ_RSLT_ODR.read(conn, st);
					String strCtlOdrNo = ((KM0030010Struct)lstSeqRsltOdr.get(0)).getRSLT_CTL_SEQ_CD(); // �����Ǘ��ԍ�
					
					st.setCTL_SEQ_CD(strCtlOdrNo); // �����Ǘ��ԍ�
					st.setODR_NO(strOdr); // �󒍔ԍ�
					st.setNEW_OLD_FLG("1"); // �V���t���O(1:�V)
					st.setTRAN_TYPE("1"); // �����敪(1:�o�^)
					
					// [��݌Ɏ󒍗���] �ɓo�^����
					entity.mHS_T_ODR_UNSTOCK.create(conn, st);

	    			// =======================================
	    			// �Č��󒍕R�t�̓o�^
	    			// =======================================
					st.setDETAL_NO(stDetail.getl_DETAL_NO()); // ���הԍ�
					st.setODR_NO(strOdr); // �󒍔ԍ�
					st.setESTIMATE_TYPE("2"); // ��z�i�ڎ�(2:��)
					
					// [�Č��󒍕R�t]��o�^����
					entity.mT_PJ_ODR_ALC.create(conn, st);

	    			// =======================================
	    			// ���ϖ��ׂ̍X�V
	    			// =======================================
					st.setODR_FLG("1"); // �󒍗L���t���O(1:�L��)
					st.setl_DETAL_NO(st.getDETAL_NO()); // ���הԍ�
					// [���ϖ���]���X�V����
					entity.mT_ESTIMATE_DETAL.update(conn, st);
				}
			}
			if (appSucessFlg) {
				/** ���F�˗��������b�Z�W�[���o��*/
		    	setInfoMessage("AZ00042", null);
		    	conn.commit();
			} else {
			// [����] ���ēǍ�����
			List lstEst = entity.mMODIFY_CNT_T_ESTIMATE.read(conn, st);
			
			// [����].�g�X�V���h ���Ǎ����ƈقȂ�ꍇ
			if (null != stDetail.getl_TEST_MODIFY_COUNT() && !checkModifyCnt(stDetail.getl_TEST_MODIFY_COUNT(), lstEst)) {
				setErrorMessage("ZZ01105", null);
				return;
			}
			KM0030010Struct stEst = (KM0030010Struct)lstEst.get(0);

			// =======================================
			// ���ς̍X�V
			// =======================================
			
			st.setESTIMATE_STAT("2"); // ���σX�e�[�^�X(2:�m���)
			
			// ���σX�e�[�^�X���X�V����
			entity.mTBL_T_ESTIMATE.update(conn, st);
			
			// [����].�g������̃t���O�h��0�F��̂Ȃ��̏ꍇ
			if ("0".equals(stEst.getUNOFFICIAL_RECEIPT_FLAG())) {
				
				st.setESTIMATE_STAT("9"); // ���σX�e�[�^�X(9:�L�����Z��)
				
				// �X�V�ΏۈȊO�̌��ς́u���σX�e�[�^�X�v��0:���ϒ�����A9:�L�����Z���ɍX�V����
				entity.mUPD_REST_T_ESTIMATE.update(conn, st);
				
			}

			// =======================================
			// �Č��̍X�V
			// =======================================
			
			// [�Č�] ���ēǍ�����
			List lstProject = entity.mT_PROJECT.read(conn, st);
			// [�Č�].�g�X�V���h ���Ǎ����ƈقȂ�ꍇ
			if (null != stDetail.getl_TPJ_MODIFY_COUNT() && !checkModifyCnt(stDetail.getl_TPJ_MODIFY_COUNT(), lstProject)) {
				setErrorMessage("ZZ01105", null);
				return;
			}
			st.setPROJECT_STAT("4"); // �Č��X�e�[�^�X(4:�m���)
			
			// �Č��X�e�[�^�X���X�V����
			entity.mT_PROJECT.update(conn, st);
			}
			conn.commit();
			//�ēǍ�
			if (null != _HAN_TAN){
				// �y�Ǎ������z�����s����
				controlSelect();
			}
		} catch(Exception e) {
			e.printStackTrace();
			throw new ExpjException(e);
		} finally {
			if (conn != null){
			conn.rollback();
			}
		}
                //}}user_implement_dev:<controlInsert>
		logger.exiting("KM0030010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0030");
		logger.entering("KM0030010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			KM0030010Struct st = new KM0030010Struct();
			KM0030010Struct stDetail = null;
			KM0030010Struct stRslt = null;
			KM0030010Struct stTodr = null;
			KM0030010Struct stTodrCtl = null;
			KM0030010Struct stTodrUnstock = null;
			List lstTodrUnstock = null;
			// �S���R�[�h�̓o�^����
			boolean appSucessFlg = false;

			beginTransaction();
			st.setsUser_ID(this.getsysUSER_CD()); // ���[�U�R�[�h
			st.setPROJECT_CD(struct.getPROJECT_CD()); // �Č��ԍ�
			st.setESTIMATE_NO(struct.getESTIMATE_NO()); // ���ϔԍ�
			st.setsUser_ID(this.getsysUSER_CD()); // ���[�U�R�[�h

			for (int i = 0; i < list.size(); i++) {
				stDetail = (KM0030010Struct)list.get(i);
				
				// �X�V�t���O��1�F�X�V�̍s��ΏۂɍX�V�������s��
				if (!"1".equals(stDetail.geth_UPDATE_FLG())) {
					continue;
				}
				
				st.setODR_NO(stDetail.getl_ODR_NO()); // �󒍔ԍ�
				
				// �p�����[�^�u�󒍏��F�v��1�̎�
				if ("1".equals(struct.geth_APR_ODR())) {
					stDetail.setsUser_ID(struct.getsUser_ID());
					stDetail.setCUST_CD(struct.getCUST_CD());
					stDetail.setPROJECT_CD(struct.getPROJECT_CD());
					stDetail.setESTIMATE_NO(struct.getESTIMATE_NO());
					stDetail.setCUST_NAME(struct.getCUST_NAME());
					
					// �y�󒍏��F�˗������z�����s����
					ApprProc.execUpdateProcess(conn, stDetail, this,"2");
					appSucessFlg = true;
					continue;
				} else {
					
					// ��z�i�ڎ킪���i�̏ꍇ
					if ("1".equals(stDetail.getl_h_ESTIMATE_TYPE())) {
						
						List lstTodrModCnt = entity.mTBL_T_ODR.read(conn, st);
						// �X�V�� �� �Ǎ��� �ƈقȂ�ꍇ
						if (null != stDetail.getl_TODR_MODIFY_COUNT() && !checkModifyCnt(stDetail.getl_TODR_MODIFY_COUNT(), lstTodrModCnt)) {
							setErrorMessage("KQ00055", null);
							return;
						}
						if (!lstTodrModCnt.isEmpty()) {
							stRslt =  (KM0030010Struct)lstTodrModCnt.get(0);
						} else {
							stRslt = new KM0030010Struct();
						}

		    			// =======================================
		    			// �󒍖��ׂ̍X�V
		    			// =======================================
						st.setCUST_ODR_NO(stDetail.getl_CUST_ODR_NO()); // ���Ӑ撍���ԍ�
						st.setCUST_CHRG_PSN_CD(stDetail.getl_OWN_PERSON_CD()); // �c�ƒS���҃R�[�h
						st.setCUST_CHRG_ORG_CD(stDetail.getl_OWN_ORG_CD()); // �c�ƒS������R�[�h
						st.setDESINATED_DLV_DATE(stDetail.getl_DESINATED_DLV_DATE()); // �w��[��
						st.setSTD_DESINATED_RCV_DATE(stDetail.getl_DESINATED_DLV_DATE()); // ����Ɏw��[��
						st.setDLV_LOC_CD(stDetail.getl_DLV_LOC_CD()); // �[�i�ꏊ�R�[�h
						st.setDLV_LOC_NAME(stDetail.getl_DLV_LOC_NAME()); // �[�i�ꏊ��
						st.setREMARKS(stDetail.getl_REMARKS()); // ���l
						
						// [�󒍖���] �̍X�V���s��
						entity.mTBL_T_ODR.update(conn, st);

		    			// =======================================
		    			// �󒍊Ǘ��̎擾
		    			// =======================================
						stTodr = stRslt;
						st.setODR_CTL_NO(stTodr.getODR_CTL_NO()); // �󒍊Ǘ��ԍ�
						
						List lstTodrCtl = entity.mreadT_ODR_CTL.read(conn, st);
						if (lstTodrCtl == null || lstTodrCtl.size() == 0) {
							stTodrCtl = new KM0030010Struct();
						} else {
							stTodrCtl = (KM0030010Struct)lstTodrCtl.get(0);
						}

		    			// =======================================
		    			// �󒍗����̓o�^
		    			// =======================================
						List lstSeqRsltOdr = entity.mSEQ_RSLT_ODR.read(conn, st);
						if (lstSeqRsltOdr == null && lstSeqRsltOdr.isEmpty()) {
							setErrorMessage("KQ00035", null);
							return;
						}
						
						st.setRSLT_CTL_SEQ_CD(((KM0030010Struct)lstSeqRsltOdr.get(0)).getRSLT_CTL_SEQ_CD()); // �����Ǘ��ԍ�
						st.setODR_CTL_NO(stTodr.getODR_CTL_NO()); // �󒍊Ǘ��ԍ�
						st.setODR_NO(stDetail.getl_ODR_NO()); // �󒍔ԍ�
						st.setCUST_ODR_NO(stDetail.getl_CUST_ODR_NO()); // ���Ӑ撍���ԍ�
						st.setODR_TYP(stDetail.getl_h_ODR_TYP()); // �����敪
						st.setCUST_CD(stTodrCtl.getCUST_CD()); // ���Ӑ�R�[�h
						st.setCUST_ITEM_CD(stTodrCtl.getCUST_ITEM_CD()); // ���Ӑ�i�ڔԍ�
						st.setITEM_CD(stTodrCtl.getITEM_CD()); // �i�ڔԍ�
						st.setDESINATED_DLV_DATE(stDetail.getl_DESINATED_DLV_DATE()); // �w��[��
						st.setODR_QTY(stDetail.getl_ODR_QTY()); // �󒍐���
						st.setUNIT(stDetail.getl_UNIT_CD()); // �P��
						st.setDLV_PLACE_CD(stDetail.getl_DLV_LOC_CD()); // �[�i�ꏊ�R�[�h
						st.setUNIT_PRICE(stTodr.getODR_UNIT_PRICE()); // �P��
						st.setCUR_CD(stTodr.getCURRNCY_CD()); // �ʉ݃R�[�h
						st.setSPCL_PRICE_CO(stTodr.getSPCL_PRICE_TYP()); // ���l�敪
						st.setDEPO_TYP(stTodr.getDEPO_TYP()); // �a���q�ɋ敪
						st.setCUST_DLV_CD(stTodr.getCUST_DLV_CD()); // �[���ԍ�
						st.setCUST_DLV_KEY_CD(stTodr.getCUST_DLV_KEY_CD()); // �[�i�L�[�ԍ�
						st.setREMARKS(stDetail.getl_REMARKS()); // ���l
						st.setCUST_CHRG_PSN_CD(stDetail.getl_OWN_PERSON_CD()); // �c�ƒS���҃R�[�h
						st.setODR_ACPT_PSN_CD(stTodr.getODR_ACPT_PSN_CD()); // ���s�S���҃R�[�h
						st.setODR_ACPT_DATE(stTodr.getODR_ACPT_DATE()); // �󒍓�
						st.setTAX_CD(stTodr.getTAX_CD()); // ����ŃR�[�h
						entity.mT_ODR_ACPT_RSLT.create(conn, st);
						
					} else {
						
						lstTodrUnstock = entity.mTBL_T_ODR_UNSTOCK.read(conn, st);
						// �X�V�� �� �Ǎ��� �ƈقȂ�ꍇ
						if (null != stDetail.getl_TODR_MODIFY_COUNT() && !checkModifyCnt(stDetail.getl_TODR_MODIFY_COUNT(), lstTodrUnstock)) {
							setErrorMessage("KQ00055", null);
							return;
						}
						stTodrUnstock = (KM0030010Struct)lstTodrUnstock.get(0);
						
		    			// =======================================
		    			// ��݌Ɏ󒍗����̓o�^(��)
		    			// =======================================
						List lstSeqRsltOdr = entity.mSEQ_RSLT_ODR.read(conn, st);
						String strCtlOdrNo = ((KM0030010Struct)lstSeqRsltOdr.get(0)).getRSLT_CTL_SEQ_CD(); // �����Ǘ��ԍ�
						
						st.setCTL_SEQ_CD(strCtlOdrNo); // �����Ǘ��ԍ�
						st.setODR_NO(stTodrUnstock.getODR_NO()); // �󒍔ԍ�
						st.setNEW_OLD_FLG("0"); // �V���t���O(0:��)
						st.setTRAN_TYPE("2"); // �����敪(2�F�X�V)
						st.setCOMPANY_CD(stTodrUnstock.getCOMPANY_CD()); // ��ЃR�[�h
						st.setSLIP_CD(stTodrUnstock.getSLIP_CD()); // �`�[�ԍ�
						st.setCUST_ODR_NO(stTodrUnstock.getCUST_ODR_NO()); // ���Ӑ撍���ԍ�
						st.setCUST_CD(stTodrUnstock.getCUST_CD()); // ���Ӑ�R�[�h
						st.setITEM_CD(stTodrUnstock.getITEM_CD()); // �i�ڔԍ�
						st.setITEM_NAME(stTodrUnstock.getITEM_NAME()); // �i�ږ���
						st.setCUST_CHRG_PSN_CD(stTodrUnstock.getCUST_CHRG_PSN_CD()); // �c�ƒS���҃R�[�h
						st.setODR_ACPT_PSN_CD(stTodrUnstock.getODR_ACPT_PSN_CD()); // ���s�S���҃R�[�h
						st.setCURRNCY_CD(stTodrUnstock.getCURRNCY_CD()); // �ʉ݃R�[�h
						st.setEXCH_TYP(stTodrUnstock.getEXCH_TYP()); // �ב֎��
						st.setDESINATED_DLV_DATE(stTodrUnstock.getDESINATED_DLV_DATE()); // �w��[��
						st.setODR_UNIT_PRICE(stTodrUnstock.getODR_UNIT_PRICE()); // �󒍒P��
						st.setODR_QTY(stTodrUnstock.getODR_QTY()); // �󒍐���
						st.setODR_AMOUNT(stTodrUnstock.getODR_AMOUNT()); // �󒍋��z
						st.setODR_AMOUNT_EXCH_RATES(stTodrUnstock.getODR_AMOUNT_EXCH_RATES()); // �󒍋��z�i�M�݁j
						st.setTAX_APPLY_TYP(stTodrUnstock.getTAX_APPLY_TYP()); // ����œK�p�敪
						st.setTAX_CD(stTodrUnstock.getTAX_CD()); // ����ŃR�[�h
						st.setTAX_CALC_TYP(stTodrUnstock.getTAX_CALC_TYP()); // ����Ōv�Z�敪
						st.setREMARKS(stTodrUnstock.getREMARKS()); // ���l
						st.setODR_ACPT_DATE(stTodrUnstock.getODR_ACPT_DATE()); // �󒍓�
						st.setORGN_ODR_NO(stTodrUnstock.getORGN_ODR_NO()); // ���󒍔ԍ�
						st.setADD_ODR_FLG(stTodrUnstock.getADD_ODR_FLG()); // ���z�󒍃t���O
						st.setODR_CMPLT_FLG(stTodrUnstock.getODR_CMPLT_FLG()); // �󒍊����t���O
						st.setDEL_FLG(stTodrUnstock.getDEL_FLG()); // �폜�t���O
						st.setCUST_CHRG_ORG_CD(stTodrUnstock.getCUST_CHRG_ORG_CD()); // �c�ƒS������R�[�h
						st.setODR_ACPT_ORG_CD(stTodrUnstock.getODR_ACPT_ORG_CD()); // ���s�S���ҕ���R�[�h
						
						// [��݌Ɏ󒍗���] �ɓo�^����
						entity.mHS_T_ODR_UNSTOCK.create(conn, st);
						
		    			// =======================================
		    			// ��݌Ɏ󒍂̍X�V
		    			// =======================================
						
						st.setODR_NO(stTodrUnstock.getODR_NO()); // �󒍔ԍ�
						st.setCUST_ODR_NO(stDetail.getl_CUST_ODR_NO()); // ���Ӑ撍���ԍ�
						st.setCUST_CHRG_PSN_CD(stDetail.getl_OWN_PERSON_CD()); // �c�ƒS���҃R�[�h
						st.setDESINATED_DLV_DATE(stDetail.getl_DESINATED_DLV_DATE()); // �w��[��
						st.setREMARKS(stDetail.getl_REMARKS()); // ���l
						st.setCUST_CHRG_ORG_CD(stDetail.getl_OWN_ORG_CD()); // �c�ƒS���҃R�[�h
						
						// [��݌Ɏ�] ���X�V����
						entity.mT_ODR_UNSTOCK.update(conn, st);
						
		    			// =======================================
		    			// ��݌Ɏ󒍗����̓o�^(�V)
		    			// =======================================
						lstSeqRsltOdr = entity.mSEQ_RSLT_ODR.read(conn, st);
						strCtlOdrNo = ((KM0030010Struct)lstSeqRsltOdr.get(0)).getRSLT_CTL_SEQ_CD(); // �����Ǘ��ԍ�
						
						st.setCTL_SEQ_CD(strCtlOdrNo); // �����Ǘ��ԍ�
						st.setNEW_OLD_FLG("1"); // �V���t���O(1:�V)
						st.setTRAN_TYPE("2"); // �����敪(2�F�X�V)
						
						// [��݌Ɏ󒍗���] �ɓo�^����
						entity.mHS_T_ODR_UNSTOCK.create(conn, st);
					}
				}
			}
			
			
			if (appSucessFlg) {
				/** ���F�˗��������b�Z�W�[���o��*/
		    	setInfoMessage("AZ00042", null);
			} else{
				// ���b�Z�[�W��\������
				setInfoMessage("KQ00308", null);
			}
			conn.commit();
			
			if (null != _HAN_TAN){
				// �y�Ǎ������z�����s����
				controlSelect();
			}
			
		} catch(Exception e) {
			e.printStackTrace();
			throw new ExpjException(e);
		} finally {
			if (conn != null){
			conn.rollback();
			}
		}
                //}}user_implement_dev:<controlUpdate>
		logger.exiting("KM0030010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * �폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0030");
		logger.entering("KM0030010Control"+":USER="+struct.getsUser_ID(),"controlDelete");
			//{{user_implement_dev:<controlDelete>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			KM0030010Struct st = new KM0030010Struct();
			KM0030010Struct stDetail = null;
			KM0030010Struct stRslt = null;
			KM0030010Struct stTodr = null;
			KM0030010Struct stTodrCtl = null;
			KM0030010Struct stTodrUnstock = null;
			// �S���R�[�h�̓o�^����
			boolean appSucessFlg = false;

			beginTransaction();
			st.setsUser_ID(this.getsysUSER_CD()); // ���[�U�R�[�h
			st.setPROJECT_CD(struct.getPROJECT_CD()); // �Č��ԍ�
			st.setESTIMATE_NO(struct.getESTIMATE_NO()); // ���ϔԍ�
			st.setsUser_ID(this.getsysUSER_CD()); // ���[�U�R�[�h
			
			for (int i = 0; i < list.size(); i++) {
				
			  stDetail = (KM0030010Struct)list.get(i);

			  if (struct.getl_ODR_NO().equals(stDetail.getl_ODR_NO())) {
				
				st.setODR_NO(stDetail.getl_ODR_NO()); // �󒍔ԍ�
				
				// �p�����[�^�u�󒍏��F�v��1�̎�
				if ("1".equals(struct.geth_APR_ODR())) {
					stDetail.setsUser_ID(struct.getsUser_ID());
					stDetail.setCUST_CD(struct.getCUST_CD());
					stDetail.setPROJECT_CD(struct.getPROJECT_CD());
					stDetail.setESTIMATE_NO(struct.getESTIMATE_NO());
					stDetail.setCUST_NAME(struct.getCUST_NAME());
					
					// �y�󒍏��F�˗������z�����s����
					ApprProc.execUpdateProcess(conn, stDetail, this,"3");
					appSucessFlg = true;
					continue;
				}
					
				// ��z�i�ڎ킪���i�̏ꍇ
				if ("1".equals(stDetail.getl_h_ESTIMATE_TYPE())) {
					
					List lstTodrModCnt = entity.mTBL_T_ODR.read(conn, st);
					// �X�V�� �� �Ǎ��� �ƈقȂ�ꍇ
					if (null != stDetail.getl_TODR_MODIFY_COUNT() && !checkModifyCnt(stDetail.getl_TODR_MODIFY_COUNT(), lstTodrModCnt)) {
						setErrorMessage("KQ00055", null);
						return;
					}
					if (!lstTodrModCnt.isEmpty()) {
						stRslt =  (KM0030010Struct)lstTodrModCnt.get(0);
					} else {
						stRslt = new KM0030010Struct();
					}
	    			// =======================================
	    			// �󒍖��ׂ̍폜
	    			// =======================================
					
					// [�󒍖���] ��_���폜����
					entity.mDEL_T_ODR.update(conn, st);

	    			// =======================================
	    			// �󒍊Ǘ��̎擾
	    			// =======================================
					stTodr = stRslt;
					st.setODR_CTL_NO(stTodr.getODR_CTL_NO()); // �󒍊Ǘ��ԍ�
					
					List lstTodrCtl = entity.mreadT_ODR_CTL.read(conn, st);
					if (lstTodrCtl == null || lstTodrCtl.size() == 0) {
						stTodrCtl = new KM0030010Struct();
					} else {
						stTodrCtl = (KM0030010Struct)lstTodrCtl.get(0);
					}

	    			// =======================================
	    			// �󒍗����̓o�^
	    			// =======================================
					List lstSeqRsltOdr = entity.mSEQ_RSLT_ODR.read(conn, st);
					if (lstSeqRsltOdr == null && lstSeqRsltOdr.isEmpty()) {
						setErrorMessage("KQ00035", null);
						return;
					}

					st.setRSLT_CTL_SEQ_CD(((KM0030010Struct)lstSeqRsltOdr.get(0)).getRSLT_CTL_SEQ_CD()); // �����Ǘ��ԍ�
					st.setODR_CTL_NO(stTodr.getODR_CTL_NO()); // �󒍊Ǘ��ԍ�
					st.setODR_NO(stDetail.getl_ODR_NO()); // �󒍔ԍ�
					st.setCUST_ODR_NO(stDetail.getl_CUST_ODR_NO()); // ���Ӑ撍���ԍ�
					st.setODR_TYP(stDetail.getl_h_ODR_TYP()); // �����敪
					st.setCUST_CD(stTodrCtl.getCUST_CD()); // ���Ӑ�R�[�h
					st.setCUST_ITEM_CD(stTodrCtl.getCUST_ITEM_CD()); // ���Ӑ�i�ڔԍ�
					st.setITEM_CD(stTodrCtl.getITEM_CD()); // �i�ڔԍ�
					st.setDESINATED_DLV_DATE(stDetail.getl_DESINATED_DLV_DATE()); // �w��[��
					st.setODR_QTY(stDetail.getl_ODR_QTY()); // �󒍐���
					st.setUNIT(stDetail.getl_UNIT_CD()); // �P��
					st.setDLV_PLACE_CD(stDetail.getl_DLV_LOC_CD()); // �[�i�ꏊ�R�[�h
					st.setUNIT_PRICE(stTodr.getODR_UNIT_PRICE()); // �P��
					st.setCUR_CD(stTodr.getCURRNCY_CD()); // �ʉ݃R�[�h
					st.setSPCL_PRICE_CO(stTodr.getSPCL_PRICE_TYP()); // ���l�敪
					st.setDEPO_TYP(stTodr.getDEPO_TYP()); // �a���q�ɋ敪
					st.setCUST_DLV_CD(stTodr.getCUST_DLV_CD()); // �[���ԍ�
					st.setCUST_DLV_KEY_CD(stTodr.getCUST_DLV_KEY_CD()); // �[�i�L�[�ԍ�
					st.setREMARKS(stTodr.getREMARKS()); // ���l
					st.setCUST_CHRG_PSN_CD(stDetail.getl_OWN_PERSON_CD()); // �c�ƒS���҃R�[�h
					st.setODR_ACPT_PSN_CD(stTodr.getODR_ACPT_PSN_CD()); // ���s�S���҃R�[�h
					st.setODR_ACPT_DATE(stDetail.getl_ODR_ACPT_DATE()); // �󒍓�
					st.setTAX_CD(stTodr.getTAX_CD()); // ����ŃR�[�h
					
					entity.mT_ODR_ACPT_RSLT.create(conn, st);

	    			// =======================================
	    			// �Č��󒍕R�t�̍폜
	    			// =======================================
					st.setDETAL_NO(stDetail.getl_DETAL_NO()); // ���הԍ�
					
					// [�Č��󒍕R�t]�𕨗��폜����
					entity.mT_PJ_ODR_ALC.delete(conn, st);

	    			// =======================================
	    			// ���ϖ��ׂ̍X�V
	    			// =======================================
					st.setODR_FLG("0"); // �󒍗L���t���O
					st.setl_DETAL_NO(stDetail.getl_DETAL_NO()); // ���הԍ�
					
					// [���ϖ���]���X�V����
					entity.mT_ESTIMATE_DETAL.update(conn, st);
					
				} else {
					
					// [�𖱎���]�Ƀf�[�^�����݂���ꍇ
					if (entity.mT_SERVICE.check(conn, st)) {
						setErrorMessage("KM00019", null);
						return;
					}

					List lstTodrUnstock = entity.mTBL_T_ODR_UNSTOCK.read(conn, st);
					// �X�V�� �� �Ǎ��� �ƈقȂ�ꍇ
					if (null != stDetail.getl_TODR_MODIFY_COUNT() &&!checkModifyCnt(stDetail.getl_TODR_MODIFY_COUNT(), lstTodrUnstock)) {
						setErrorMessage("KQ00055", null);
						return;
					}
					stTodrUnstock = (KM0030010Struct)lstTodrUnstock.get(0);
					
	    			// =======================================
	    			// ��݌Ɏ󒍗����̓o�^(��)
	    			// =======================================
					List lstSeqRsltOdr = entity.mSEQ_RSLT_ODR.read(conn, st);
					String strCtlOdrNo = ((KM0030010Struct)lstSeqRsltOdr.get(0)).getRSLT_CTL_SEQ_CD(); // �����Ǘ��ԍ�
					
					st.setCTL_SEQ_CD(strCtlOdrNo); // �����Ǘ��ԍ�
					st.setODR_NO(stTodrUnstock.getODR_NO()); // �󒍔ԍ�
					st.setNEW_OLD_FLG("0"); // �V���t���O(0:��)
					st.setTRAN_TYPE("3"); // �����敪(3�F�폜)
					st.setCOMPANY_CD(stTodrUnstock.getCOMPANY_CD()); // ��ЃR�[�h
					st.setSLIP_CD(stTodrUnstock.getSLIP_CD()); // �`�[�ԍ�
					st.setCUST_ODR_NO(stTodrUnstock.getCUST_ODR_NO()); // ���Ӑ撍���ԍ�
					st.setCUST_CD(stTodrUnstock.getCUST_CD()); // ���Ӑ�R�[�h
					st.setITEM_CD(stTodrUnstock.getITEM_CD()); // �i�ڔԍ�
					st.setITEM_NAME(stTodrUnstock.getITEM_NAME()); // �i�ږ���
					st.setCUST_CHRG_PSN_CD(stTodrUnstock.getCUST_CHRG_PSN_CD()); // �c�ƒS���҃R�[�h
					st.setODR_ACPT_PSN_CD(stTodrUnstock.getODR_ACPT_PSN_CD()); // ���s�S���҃R�[�h
					st.setCURRNCY_CD(stTodrUnstock.getCURRNCY_CD()); // �ʉ݃R�[�h
					st.setEXCH_TYP(stTodrUnstock.getEXCH_TYP()); // �ב֎��
					st.setDESINATED_DLV_DATE(stTodrUnstock.getDESINATED_DLV_DATE()); // �w��[��
					st.setODR_UNIT_PRICE(stTodrUnstock.getODR_UNIT_PRICE()); // �󒍒P��
					st.setODR_QTY(stTodrUnstock.getODR_QTY()); // �󒍐���
					st.setODR_AMOUNT(stTodrUnstock.getODR_AMOUNT()); // �󒍋��z
					st.setODR_AMOUNT_EXCH_RATES(stTodrUnstock.getODR_AMOUNT_EXCH_RATES()); // �󒍋��z�i�M�݁j
					st.setTAX_APPLY_TYP(stTodrUnstock.getTAX_APPLY_TYP()); // ����œK�p�敪
					st.setTAX_CD(stTodrUnstock.getTAX_CD()); // ����ŃR�[�h
					st.setTAX_CALC_TYP(stTodrUnstock.getTAX_CALC_TYP()); // ����Ōv�Z�敪
					st.setREMARKS(stTodrUnstock.getREMARKS()); // ���l
					st.setODR_ACPT_DATE(stTodrUnstock.getODR_ACPT_DATE()); // �󒍓�
					st.setORGN_ODR_NO(stTodrUnstock.getORGN_ODR_NO()); // ���󒍔ԍ�
					st.setADD_ODR_FLG(stTodrUnstock.getADD_ODR_FLG()); // ���z�󒍃t���O
					st.setODR_CMPLT_FLG(stTodrUnstock.getODR_CMPLT_FLG()); // �󒍊����t���O
					st.setODR_CMPLT_DATE(stTodrUnstock.getODR_CMPLT_DATE()); // �󒍊�����
					st.setDEL_FLG(stTodrUnstock.getDEL_FLG()); // �폜�t���O
					st.setCUST_CHRG_ORG_CD(stTodrUnstock.getCUST_CHRG_ORG_CD()); // �c�ƒS������R�[�h
					st.setODR_ACPT_ORG_CD(stTodrUnstock.getODR_ACPT_ORG_CD()); // ���s�S���ҕ���R�[�h
					
					// [��݌Ɏ󒍗���] �ɓo�^����
					entity.mHS_T_ODR_UNSTOCK.create(conn, st);
					
	    			// =======================================
	    			// ��݌Ɏ󒍂̍X�V
	    			// =======================================
					
					st.setODR_NO(stTodrUnstock.getODR_NO()); // �󒍔ԍ�
					
					// [��݌Ɏ�] ���X�V����
					entity.mTBL_T_ODR_UNSTOCK.update(conn, st);

	    			// =======================================
	    			// �Č��󒍕R�t�̍폜
	    			// =======================================
					st.setDETAL_NO(stDetail.getl_DETAL_NO()); // ���הԍ�
					
					// [�Č��󒍕R�t]�𕨗��폜����
					entity.mT_PJ_ODR_ALC.delete(conn, st);

	    			// =======================================
	    			// ���ϖ��ׂ̍X�V
	    			// =======================================
					st.setODR_FLG("0"); // �󒍗L���t���O
					st.setl_DETAL_NO(stDetail.getl_DETAL_NO()); // ���הԍ�
					
					// [���ϖ���]���X�V����
					entity.mT_ESTIMATE_DETAL.update(conn, st);
				}
			  }
			}
			
			if (appSucessFlg) {
				/** ���F�˗��������b�Z�W�[���o��*/
				if(this.getMsgStruct().sizeError() > 0){
					return;
		        }
		    	setInfoMessage("AZ00042", null);
		    	conn.commit();
			} else {
				// ���ׂĂ�[���ϖ���].�g�󒍗L���t���O�h=0:�Ȃ��̏ꍇ
				if (!entity.mCHECK_STS_T_ESTIMATE_DETAL.check(conn, st)) {
					
					// [����] ���ēǍ�����
					List lstEst = entity.mMODIFY_CNT_T_ESTIMATE.read(conn, st);
					// [����].�g�X�V���h ���Ǎ����ƈقȂ�ꍇ
					if (null != stDetail.getl_TEST_MODIFY_COUNT() && !checkModifyCnt(stDetail.getl_TEST_MODIFY_COUNT(), lstEst)) {
						setErrorMessage("ZZ01105", null);
						return;
					}
					KM0030010Struct stEst = (KM0030010Struct)lstEst.get(0);
	
	    			// =======================================
	    			// ���ς̍X�V
	    			// =======================================
					
					// [����].�g������̃t���O�h��0�F��̂Ȃ��̏ꍇ
					if ("0".equals(stEst.getUNOFFICIAL_RECEIPT_FLAG())) {
						
						st.setESTIMATE_STAT("0"); // ���σX�e�[�^�X(0�F���ϒ�)
						
						// ���σX�e�[�^�X���X�V����
						entity.mTBL_T_ESTIMATE.update(conn, st);
						
						// �X�V�ΏۈȊO�̌��ς́u���σX�e�[�^�X�v��9�F�L�����Z������0:���ϒ��ɍX�V����
						entity.mUPD_REST_T_ESTIMATE.update(conn, st);
						
					} else {
						
						st.setESTIMATE_STAT("1"); // ���σX�e�[�^�X(1:����)
						// ���σX�e�[�^�X���X�V����
						entity.mTBL_T_ESTIMATE.update(conn, st);
					}
	
	    			// =======================================
	    			// �Č��̍X�V
	    			// =======================================
					
					// [�Č�] ���ēǍ�����
					List lstProject = entity.mT_PROJECT.read(conn, st);
					// [�Č�].�g�X�V���h ���Ǎ����ƈقȂ�ꍇ
					if (null != stDetail.getl_TPJ_MODIFY_COUNT() && !checkModifyCnt(stDetail.getl_TPJ_MODIFY_COUNT(), lstProject)) {
						setErrorMessage("ZZ01105", null);
						return;
					}
					// [����].�g������̃t���O�h��0�F��̂Ȃ��̏ꍇ
					if ("0".equals(stEst.getUNOFFICIAL_RECEIPT_FLAG())) {
						st.setPROJECT_STAT("2"); // �Č��X�e�[�^�X(2�F���ϒ�)
					} else {
						st.setPROJECT_STAT("3"); // �Č��X�e�[�^�X(3:����)
					}
					
					// �Č��X�e�[�^�X���X�V����
					entity.mT_PROJECT.update(conn, st);
				}
                conn.commit();
			}
			if (null != _HAN_TAN){
				// �y�Ǎ������z�����s����
				controlSelect();
			}
		} catch(Exception e) {
			e.printStackTrace();
			throw new ExpjException(e);
		} finally {
			if (conn != null){
			   conn.rollback();
			}
		}
                //}}user_implement_dev:<controlDelete>
		logger.exiting("KM0030010Control"+":USER="+struct.getsUser_ID(),"controlDelete");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0030");
		logger.entering("KM0030010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		if (list != null){
			list.clear();
		}
		struct.clear();
		setReadStatus(INITIAL);
		controlRELOAD();
                //}}user_implement_dev:<controlClear>
		logger.exiting("KM0030010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0030");
		logger.entering("KM0030010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("KM0030010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0030");
		logger.entering("KM0030010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KM0030010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0030");
		logger.entering("KM0030010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			_HAN_TAN = "1";
			struct.clear();
			List resultList = new ArrayList();
			KM0030010Struct queryStruct = new KM0030010Struct();
			// ���Џ��̎擾
			resultList = entity.mSYS_MY_COMPANY.read(conn, queryStruct);
			if (resultList.isEmpty()) {
				ExpjMessage message = new ExpjMessage("KQ00039");
				ExpjException ee = new ExpjException(message);
				throw ee;
			} else {
				_COMPANY_CD = ((KM0030010Struct)resultList.get(0)).getCOMPANY_CD();
				struct.setCOMPANY_CD(_COMPANY_CD); // ��ЃR�[�h
			}
			
			// ���t�v�Z�p�H��R�[�h
			queryStruct.setSYS_CLASS("SALES");
			queryStruct.setCLASS_CODE("PLANT_WEB");
			resultList = entity.mSYS_CLASS_CODE.read(conn, queryStruct);
			if (resultList.isEmpty()) {
				ExpjMessage message = new ExpjMessage("KP20017");
				ExpjException ee = new ExpjException(message);
				throw ee;
			} else {
				queryStruct.setPLANT_CD(((KM0030010Struct)resultList.get(0)).getCODE());
			}
			
			// �Ɩ����t
			resultList = entity.mSYS_DATE_CTRL.read(conn, queryStruct);
			if (resultList.isEmpty()) {
				ExpjMessage message = new ExpjMessage("KQ00026");
				ExpjException ee = new ExpjException(message);
				throw ee;
			} else {
				_BUSINESS_OPR_DATE = ((KM0030010Struct)resultList.get(0)).getBUSINESS_OPR_DATE();
			}
			
			// �M�݃R�[�h
			resultList = entity.mSYS_HOME_CUR.read(conn, queryStruct);
			if (resultList.isEmpty()) {
				ExpjMessage message = new ExpjMessage("KQ00041");
				ExpjException ee = new ExpjException(message);
				throw ee;
			} else {
				_HOME_CUR_CD = ((KM0030010Struct)resultList.get(0)).getHOME_CUR_CD();
			}
			
			// �o�׏���L/T
			queryStruct.setCLASS_CODE("SHIP_LT");
			resultList = entity.mSYS_CLASS_CODE.read(conn, queryStruct);
			if (resultList.isEmpty()) {
				ExpjMessage message = new ExpjMessage("KQ00037");
				ExpjException ee = new ExpjException(message);
				throw ee;
			} else {
				_SHIP_LT = ((KM0030010Struct)resultList.get(0)).getCODE();
			}
			
			// �Z�[���ݒ��
			queryStruct.setCLASS_CODE("DLV_DATE_CDT");
			resultList = entity.mSYS_CLASS_CODE.read(conn, queryStruct);
			if (resultList.isEmpty()) {
				ExpjMessage message = new ExpjMessage("KQ00043");
				ExpjException ee = new ExpjException(message);
				throw ee;
			} else {
				_DLV_DATE_CDT = ((KM0030010Struct)resultList.get(0)).getCODE();
			}
			
			// �󒍎����ԓo�^
			queryStruct.setNAME("PRD_REQ_JOB_ODR_TYP_1");
			resultList = entity.mSYS_PARAMETER.read(conn, queryStruct);
			if (resultList.isEmpty()) {
				ExpjMessage message = new ExpjMessage("KQ00319");
				ExpjException ee = new ExpjException(message);
				throw ee;
			} else {
				_PRD_REQ_JOB_ODR_TYP_1 = ((KM0030010Struct)resultList.get(0)).getVALUE();
				struct.seth_PRD_REQ_JOB_ODR_TYP_1(_PRD_REQ_JOB_ODR_TYP_1);
			}
			
			// �󒍓o�^���̐��ԍ̔ԕ��@
			queryStruct.setNAME("PRD_REQ_JOB_ODR_TYP_2");
			resultList = entity.mSYS_PARAMETER.read(conn, queryStruct);
			if (resultList.isEmpty()) {
				ExpjMessage message = new ExpjMessage("KQ00320");
				ExpjException ee = new ExpjException(message);
				throw ee;
			} else {
				_PRD_REQ_JOB_ODR_TYP_2 = ((KM0030010Struct)resultList.get(0)).getVALUE();
				struct.seth_PRD_REQ_JOB_ODR_TYP_2(_PRD_REQ_JOB_ODR_TYP_2);
			}
			
			// �󒍏��F
			queryStruct.setNAME("APR_ODR");
			resultList = entity.mSYS_PARAMETER.read(conn, queryStruct);
			if (resultList.isEmpty()) {
		        // �����ꍀ�ڎ擾�Ή�
		        String locale = CoreTools.getLocale(sysUSER_CD);
		        String property = "OrteusUserDic";
		        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
				ExpjMessage message = new ExpjMessage("AZ00041", CoreTools.getRBString("Expj.Cmt6707",resource));
				ExpjException ee = new ExpjException(message);
				throw ee;
			} else {
				_APR_ODR = ((KM0030010Struct)resultList.get(0)).getVALUE();
				if ("1".equals(_APR_ODR) ) {
					struct.seth_APR_ODR(_APR_ODR);
				} else {
					_APR_ODR = "0";
					struct.seth_APR_ODR("0");
				}
				
			}
			// �����l�̃Z�b�g
			setDefaultValue();
			if ( isScreenMove() == true ) {
				//�Č��ꗗ��ʂ����ʑJ��
				if ("KM0040010".equals(getScreenId())) {
					KM0030010Struct st = new KM0030010Struct();
					st.setPROJECT_CD(getProjectCd());
					st.setESTIMATE_NO(getEstimateNo());
					List lstPjOdrAlc = entity.mT_PJ_ODR_ALC.read(conn, st);
					if (lstPjOdrAlc.size() > 0){
						struct.setrdoSHIP_UPDATE("true");
						struct.setrdoSHIP_INST("false");
					}else{
						struct.setrdoSHIP_INST("true");
						struct.setrdoSHIP_UPDATE("false");
					}
					struct.setPROJECT_CD(getProjectCd());
					struct.setESTIMATE_NO(getEstimateNo());
					// �����̃R���g���[�����\�b�h���Ăяo���܂��B
					controlSelect();
				//�󒍖��׈ꗗ�����ʑJ��
				}else if("KQ0040010".equals(getScreenId())){
					struct.setrdoSHIP_UPDATE("true");
					struct.setrdoSHIP_INST("false");
					struct.setPROJECT_CD(getProjectCd());
					struct.setESTIMATE_NO(getEstimateNo());
					// �����̃R���g���[�����\�b�h���Ăяo���܂��B
					controlSelect();
				}
			}

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KM0030010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0030");
		logger.entering("KM0030010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("KM0030010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Modify") ) {
				controlModify();
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
//			throw new FoundationException("KM0030010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KM0030010-E999","CSV�̏o�͏���"));
			throw new FoundationException("KM0030010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KM0030010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("KM0030010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KM0030010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("KM0030010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected KM0030010Entity entity;
	protected KM0030010Struct struct;
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

		entity = new KM0030010Entity();
		struct = new KM0030010Struct();

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
	 * KM0030010�N���X�̕W���R���X�g���N�^
	 */
	public KM0030010Control() throws BusinessProcessException, FoundationException
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
				KM0030010Struct key = (KM0030010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("rdoSHIP_INST") && key.getrdoSHIP_INST() != null) {
					msgKey.setKeyValue("rdoSHIP_INST", key.getrdoSHIP_INST());
				}
				if(msgKeyType.containsKeyColumn("rdoSHIP_UPDATE") && key.getrdoSHIP_UPDATE() != null) {
					msgKey.setKeyValue("rdoSHIP_UPDATE", key.getrdoSHIP_UPDATE());
				}
				if(msgKeyType.containsKeyColumn("l_CUR_UNIT") && key.getl_CUR_UNIT() != null) {
					msgKey.setKeyValue("l_CUR_UNIT", key.getl_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("DETAIL_NO") && key.getDETAIL_NO() != null) {
					msgKey.setKeyValue("DETAIL_NO", key.getDETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("ACPT_ODR_CD") && key.getACPT_ODR_CD() != null) {
					msgKey.setKeyValue("ACPT_ODR_CD", key.getACPT_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("c_DOODR") && key.getc_DOODR() != null) {
					msgKey.setKeyValue("c_DOODR", key.getc_DOODR());
				}
				if(msgKeyType.containsKeyColumn("PREPARE_QTY") && key.getPREPARE_QTY() != null) {
					msgKey.setKeyValue("PREPARE_QTY", key.getPREPARE_QTY());
				}
				if(msgKeyType.containsKeyColumn("c_INPUTODRCD") && key.getc_INPUTODRCD() != null) {
					msgKey.setKeyValue("c_INPUTODRCD", key.getc_INPUTODRCD());
				}
				if(msgKeyType.containsKeyColumn("QTY") && key.getQTY() != null) {
					msgKey.setKeyValue("QTY", key.getQTY());
				}
				if(msgKeyType.containsKeyColumn("QTY_UNIT") && key.getQTY_UNIT() != null) {
					msgKey.setKeyValue("QTY_UNIT", key.getQTY_UNIT());
				}
				if(msgKeyType.containsKeyColumn("ODR_PRICE_UNIT") && key.getODR_PRICE_UNIT() != null) {
					msgKey.setKeyValue("ODR_PRICE_UNIT", key.getODR_PRICE_UNIT());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_COMMENT") && key.getISSUE_INST_COMMENT() != null) {
					msgKey.setKeyValue("ISSUE_INST_COMMENT", key.getISSUE_INST_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("APPROVED_COMMENT") && key.getAPPROVED_COMMENT() != null) {
					msgKey.setKeyValue("APPROVED_COMMENT", key.getAPPROVED_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_NAME") && key.getCUST_CHRG_PSN_NAME() != null) {
					msgKey.setKeyValue("CUST_CHRG_PSN_NAME", key.getCUST_CHRG_PSN_NAME());
				}
				if(msgKeyType.containsKeyColumn("ES_ORG_NAME") && key.getES_ORG_NAME() != null) {
					msgKey.setKeyValue("ES_ORG_NAME", key.getES_ORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_DLV_LOC_NAME") && key.getl_DLV_LOC_NAME() != null) {
					msgKey.setKeyValue("l_DLV_LOC_NAME", key.getl_DLV_LOC_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_ITEM_NAME") && key.getl_CUST_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_CUST_ITEM_NAME", key.getl_CUST_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_NAME") && key.getl_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ITEM_NAME", key.getl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_DLV_DATE") && key.getl_JOB_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("l_JOB_ODR_DLV_DATE", key.getl_JOB_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ALC_GRP_CD") && key.getl_ALC_GRP_CD() != null) {
					msgKey.setKeyValue("l_ALC_GRP_CD", key.getl_ALC_GRP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD") && key.getl_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CD", key.getl_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_APPR_REMARKS") && key.getl_APPR_REMARKS() != null) {
					msgKey.setKeyValue("l_APPR_REMARKS", key.getl_APPR_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("h_UPDATE_FLG") && key.geth_UPDATE_FLG() != null) {
					msgKey.setKeyValue("h_UPDATE_FLG", key.geth_UPDATE_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_TEST_MODIFY_COUNT") && key.getl_TEST_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("l_TEST_MODIFY_COUNT", key.getl_TEST_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("l_TPJ_MODIFY_COUNT") && key.getl_TPJ_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("l_TPJ_MODIFY_COUNT", key.getl_TPJ_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("l_h_ESTIMATE_TYPE") && key.getl_h_ESTIMATE_TYPE() != null) {
					msgKey.setKeyValue("l_h_ESTIMATE_TYPE", key.getl_h_ESTIMATE_TYPE());
				}
				if(msgKeyType.containsKeyColumn("h_ESTIMATE_TYPE") && key.geth_ESTIMATE_TYPE() != null) {
					msgKey.setKeyValue("h_ESTIMATE_TYPE", key.geth_ESTIMATE_TYPE());
				}
				if(msgKeyType.containsKeyColumn("l_h_PREC_ARRANGE_FLG") && key.getl_h_PREC_ARRANGE_FLG() != null) {
					msgKey.setKeyValue("l_h_PREC_ARRANGE_FLG", key.getl_h_PREC_ARRANGE_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_c_DOODR") && key.getl_c_DOODR() != null) {
					msgKey.setKeyValue("l_c_DOODR", key.getl_c_DOODR());
				}
				if(msgKeyType.containsKeyColumn("l_c_INPUTODRCD") && key.getl_c_INPUTODRCD() != null) {
					msgKey.setKeyValue("l_c_INPUTODRCD", key.getl_c_INPUTODRCD());
				}
				if(msgKeyType.containsKeyColumn("h_PREC_ARRANGE_FLG") && key.geth_PREC_ARRANGE_FLG() != null) {
					msgKey.setKeyValue("h_PREC_ARRANGE_FLG", key.geth_PREC_ARRANGE_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_h_ODR_TYP") && key.getl_h_ODR_TYP() != null) {
					msgKey.setKeyValue("l_h_ODR_TYP", key.getl_h_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_TYP") && key.geth_ODR_TYP() != null) {
					msgKey.setKeyValue("h_ODR_TYP", key.geth_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_TYP3") && key.geth_ODR_TYP3() != null) {
					msgKey.setKeyValue("h_ODR_TYP3", key.geth_ODR_TYP3());
				}
				if(msgKeyType.containsKeyColumn("h_APR_ODR") && key.geth_APR_ODR() != null) {
					msgKey.setKeyValue("h_APR_ODR", key.geth_APR_ODR());
				}
				if(msgKeyType.containsKeyColumn("h_PRD_REQ_JOB_ODR_TYP_1") && key.geth_PRD_REQ_JOB_ODR_TYP_1() != null) {
					msgKey.setKeyValue("h_PRD_REQ_JOB_ODR_TYP_1", key.geth_PRD_REQ_JOB_ODR_TYP_1());
				}
				if(msgKeyType.containsKeyColumn("h_PRD_REQ_JOB_ODR_TYP_2") && key.geth_PRD_REQ_JOB_ODR_TYP_2() != null) {
					msgKey.setKeyValue("h_PRD_REQ_JOB_ODR_TYP_2", key.geth_PRD_REQ_JOB_ODR_TYP_2());
				}
				if(msgKeyType.containsKeyColumn("h_DLV_LOC_CD") && key.geth_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("h_DLV_LOC_CD", key.geth_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ANS_DLV_DATE_EXIST_FLG") && key.geth_ANS_DLV_DATE_EXIST_FLG() != null) {
					msgKey.setKeyValue("h_ANS_DLV_DATE_EXIST_FLG", key.geth_ANS_DLV_DATE_EXIST_FLG());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME_R") && key.getITEM_NAME_R() != null) {
					msgKey.setKeyValue("ITEM_NAME_R", key.getITEM_NAME_R());
				}
				if(msgKeyType.containsKeyColumn("l_h_DEPO_TYP") && key.getl_h_DEPO_TYP() != null) {
					msgKey.setKeyValue("l_h_DEPO_TYP", key.getl_h_DEPO_TYP());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_CD") && key.getPROJECT_CD() != null) {
					msgKey.setKeyValue("PROJECT_CD", key.getPROJECT_CD());
				}
				if(msgKeyType.containsKeyColumn("ESTIMATE_NO") && key.getESTIMATE_NO() != null) {
					msgKey.setKeyValue("ESTIMATE_NO", key.getESTIMATE_NO());
				}
				if(msgKeyType.containsKeyColumn("l_DETAL_NO") && key.getl_DETAL_NO() != null) {
					msgKey.setKeyValue("l_DETAL_NO", key.getl_DETAL_NO());
				}
				if(msgKeyType.containsKeyColumn("CUST_NAME") && key.getCUST_NAME() != null) {
					msgKey.setKeyValue("CUST_NAME", key.getCUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("CODE") && key.getCODE() != null) {
					msgKey.setKeyValue("CODE", key.getCODE());
				}
				if(msgKeyType.containsKeyColumn("SYS_CLASS") && key.getSYS_CLASS() != null) {
					msgKey.setKeyValue("SYS_CLASS", key.getSYS_CLASS());
				}
				if(msgKeyType.containsKeyColumn("CLASS_CODE") && key.getCLASS_CODE() != null) {
					msgKey.setKeyValue("CLASS_CODE", key.getCLASS_CODE());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("HOME_CUR_CD") && key.getHOME_CUR_CD() != null) {
					msgKey.setKeyValue("HOME_CUR_CD", key.getHOME_CUR_CD());
				}
				if(msgKeyType.containsKeyColumn("VALUE") && key.getVALUE() != null) {
					msgKey.setKeyValue("VALUE", key.getVALUE());
				}
				if(msgKeyType.containsKeyColumn("NAME") && key.getNAME() != null) {
					msgKey.setKeyValue("NAME", key.getNAME());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_NAME") && key.getPROJECT_NAME() != null) {
					msgKey.setKeyValue("PROJECT_NAME", key.getPROJECT_NAME());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_STAT") && key.getPROJECT_STAT() != null) {
					msgKey.setKeyValue("PROJECT_STAT", key.getPROJECT_STAT());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_CD") && key.getDLV_LOC_CD() != null) {
					msgKey.setKeyValue("DLV_LOC_CD", key.getDLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("CUR_CD") && key.getCUR_CD() != null) {
					msgKey.setKeyValue("CUR_CD", key.getCUR_CD());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP") && key.getEXCH_TYP() != null) {
					msgKey.setKeyValue("EXCH_TYP", key.getEXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP") && key.getTAX_APPLY_TYP() != null) {
					msgKey.setKeyValue("TAX_APPLY_TYP", key.getTAX_APPLY_TYP());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD") && key.getTAX_CD() != null) {
					msgKey.setKeyValue("TAX_CD", key.getTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("TAX_CALC_TYP") && key.getTAX_CALC_TYP() != null) {
					msgKey.setKeyValue("TAX_CALC_TYP", key.getTAX_CALC_TYP());
				}
				if(msgKeyType.containsKeyColumn("PARTIAL_SHIP_INST_FLG") && key.getPARTIAL_SHIP_INST_FLG() != null) {
					msgKey.setKeyValue("PARTIAL_SHIP_INST_FLG", key.getPARTIAL_SHIP_INST_FLG());
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
				if(msgKeyType.containsKeyColumn("l_ES_USER_CD") && key.getl_ES_USER_CD() != null) {
					msgKey.setKeyValue("l_ES_USER_CD", key.getl_ES_USER_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ES_ORG_CD") && key.getl_ES_ORG_CD() != null) {
					msgKey.setKeyValue("l_ES_ORG_CD", key.getl_ES_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_ITEM_CD") && key.getl_CUST_ITEM_CD() != null) {
					msgKey.setKeyValue("l_CUST_ITEM_CD", key.getl_CUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ESTIMATE_QTY") && key.getl_ESTIMATE_QTY() != null) {
					msgKey.setKeyValue("l_ESTIMATE_QTY", key.getl_ESTIMATE_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_CD") && key.getl_UNIT_CD() != null) {
					msgKey.setKeyValue("l_UNIT_CD", key.getl_UNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ESTIMATE_UNIT_PRICE") && key.getl_ESTIMATE_UNIT_PRICE() != null) {
					msgKey.setKeyValue("l_ESTIMATE_UNIT_PRICE", key.getl_ESTIMATE_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("l_ESTIMATE_AMOUNT") && key.getl_ESTIMATE_AMOUNT() != null) {
					msgKey.setKeyValue("l_ESTIMATE_AMOUNT", key.getl_ESTIMATE_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_ESTIMATE_TYPE") && key.getl_ESTIMATE_TYPE() != null) {
					msgKey.setKeyValue("l_ESTIMATE_TYPE", key.getl_ESTIMATE_TYPE());
				}
				if(msgKeyType.containsKeyColumn("l_ESTIMATE_ITEM_NAME") && key.getl_ESTIMATE_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ESTIMATE_ITEM_NAME", key.getl_ESTIMATE_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_USER_NAME") && key.getl_USER_NAME() != null) {
					msgKey.setKeyValue("l_USER_NAME", key.getl_USER_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_ORG_NAME") && key.getl_ORG_NAME() != null) {
					msgKey.setKeyValue("l_ORG_NAME", key.getl_ORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_NAME") && key.getDLV_LOC_NAME() != null) {
					msgKey.setKeyValue("DLV_LOC_NAME", key.getDLV_LOC_NAME());
				}
				if(msgKeyType.containsKeyColumn("TRANSPORT_LT") && key.getTRANSPORT_LT() != null) {
					msgKey.setKeyValue("TRANSPORT_LT", key.getTRANSPORT_LT());
				}
				if(msgKeyType.containsKeyColumn("TRANSPORT_CD") && key.getTRANSPORT_CD() != null) {
					msgKey.setKeyValue("TRANSPORT_CD", key.getTRANSPORT_CD());
				}
				if(msgKeyType.containsKeyColumn("TRANSPORT_TYP") && key.getTRANSPORT_TYP() != null) {
					msgKey.setKeyValue("TRANSPORT_TYP", key.getTRANSPORT_TYP());
				}
				if(msgKeyType.containsKeyColumn("DEPO_WH_CD") && key.getDEPO_WH_CD() != null) {
					msgKey.setKeyValue("DEPO_WH_CD", key.getDEPO_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("SHIP_PLANT_CD") && key.getSHIP_PLANT_CD() != null) {
					msgKey.setKeyValue("SHIP_PLANT_CD", key.getSHIP_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("DEPO_TYP") && key.getDEPO_TYP() != null) {
					msgKey.setKeyValue("DEPO_TYP", key.getDEPO_TYP());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_NAME") && key.getCUST_ITEM_NAME() != null) {
					msgKey.setKeyValue("CUST_ITEM_NAME", key.getCUST_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_CD") && key.getCUST_ITEM_CD() != null) {
					msgKey.setKeyValue("CUST_ITEM_CD", key.getCUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ESTIMATE_TYPE") && key.getESTIMATE_TYPE() != null) {
					msgKey.setKeyValue("ESTIMATE_TYPE", key.getESTIMATE_TYPE());
				}
				if(msgKeyType.containsKeyColumn("ODR_NO") && key.getODR_NO() != null) {
					msgKey.setKeyValue("ODR_NO", key.getODR_NO());
				}
				if(msgKeyType.containsKeyColumn("DETAL_NO") && key.getDETAL_NO() != null) {
					msgKey.setKeyValue("DETAL_NO", key.getDETAL_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_NO") && key.getl_ODR_NO() != null) {
					msgKey.setKeyValue("l_ODR_NO", key.getl_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_TYP") && key.getl_ODR_TYP() != null) {
					msgKey.setKeyValue("l_ODR_TYP", key.getl_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_ODR_NO") && key.getl_CUST_ODR_NO() != null) {
					msgKey.setKeyValue("l_CUST_ODR_NO", key.getl_CUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_CD") && key.getl_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ITEM_CD", key.getl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_DESINATED_DLV_DATE") && key.getl_DESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("l_DESINATED_DLV_DATE", key.getl_DESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_QTY") && key.getl_ODR_QTY() != null) {
					msgKey.setKeyValue("l_ODR_QTY", key.getl_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_AMOUNT") && key.getl_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("l_ODR_AMOUNT", key.getl_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_AMOUNT_EXCH_RATES") && key.getl_ODR_AMOUNT_EXCH_RATES() != null) {
					msgKey.setKeyValue("l_ODR_AMOUNT_EXCH_RATES", key.getl_ODR_AMOUNT_EXCH_RATES());
				}
				if(msgKeyType.containsKeyColumn("l_DLV_LOC_CD") && key.getl_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("l_DLV_LOC_CD", key.getl_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("l_DEPO_TYP") && key.getl_DEPO_TYP() != null) {
					msgKey.setKeyValue("l_DEPO_TYP", key.getl_DEPO_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_ACPT_DATE") && key.getl_ODR_ACPT_DATE() != null) {
					msgKey.setKeyValue("l_ODR_ACPT_DATE", key.getl_ODR_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_REMARKS") && key.getl_REMARKS() != null) {
					msgKey.setKeyValue("l_REMARKS", key.getl_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("l_OWN_PERSON_CD") && key.getl_OWN_PERSON_CD() != null) {
					msgKey.setKeyValue("l_OWN_PERSON_CD", key.getl_OWN_PERSON_CD());
				}
				if(msgKeyType.containsKeyColumn("l_TODR_MODIFY_COUNT") && key.getl_TODR_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("l_TODR_MODIFY_COUNT", key.getl_TODR_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_CHRG_PSN_NAME") && key.getl_CUST_CHRG_PSN_NAME() != null) {
					msgKey.setKeyValue("l_CUST_CHRG_PSN_NAME", key.getl_CUST_CHRG_PSN_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_OWN_ORG_CD") && key.getl_OWN_ORG_CD() != null) {
					msgKey.setKeyValue("l_OWN_ORG_CD", key.getl_OWN_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_CHRG_ORG_NAME") && key.getl_CUST_CHRG_ORG_NAME() != null) {
					msgKey.setKeyValue("l_CUST_CHRG_ORG_NAME", key.getl_CUST_CHRG_ORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("ODR_TYP") && key.getODR_TYP() != null) {
					msgKey.setKeyValue("ODR_TYP", key.getODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("ODR_CTL_NO") && key.getODR_CTL_NO() != null) {
					msgKey.setKeyValue("ODR_CTL_NO", key.getODR_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("CUST_ODR_NO") && key.getCUST_ODR_NO() != null) {
					msgKey.setKeyValue("CUST_ODR_NO", key.getCUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("CUST_CHRG_ORG_CD") && key.getCUST_CHRG_ORG_CD() != null) {
					msgKey.setKeyValue("CUST_CHRG_ORG_CD", key.getCUST_CHRG_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_CD") && key.getCUST_CHRG_PSN_CD() != null) {
					msgKey.setKeyValue("CUST_CHRG_PSN_CD", key.getCUST_CHRG_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("ODR_ACPT_PSN_CD") && key.getODR_ACPT_PSN_CD() != null) {
					msgKey.setKeyValue("ODR_ACPT_PSN_CD", key.getODR_ACPT_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("CURRNCY_CD") && key.getCURRNCY_CD() != null) {
					msgKey.setKeyValue("CURRNCY_CD", key.getCURRNCY_CD());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_NAME_KANJI") && key.getDLV_LOC_NAME_KANJI() != null) {
					msgKey.setKeyValue("DLV_LOC_NAME_KANJI", key.getDLV_LOC_NAME_KANJI());
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
				if(msgKeyType.containsKeyColumn("REMAIN_UNCONFIRM_ODR_QTY") && key.getREMAIN_UNCONFIRM_ODR_QTY() != null) {
					msgKey.setKeyValue("REMAIN_UNCONFIRM_ODR_QTY", key.getREMAIN_UNCONFIRM_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("CANCELED_UNCONFIRM_ODR_QTY") && key.getCANCELED_UNCONFIRM_ODR_QTY() != null) {
					msgKey.setKeyValue("CANCELED_UNCONFIRM_ODR_QTY", key.getCANCELED_UNCONFIRM_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("UNIT_CD") && key.getUNIT_CD() != null) {
					msgKey.setKeyValue("UNIT_CD", key.getUNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("UNCONFIRM_ODR_BALANCE") && key.getUNCONFIRM_ODR_BALANCE() != null) {
					msgKey.setKeyValue("UNCONFIRM_ODR_BALANCE", key.getUNCONFIRM_ODR_BALANCE());
				}
				if(msgKeyType.containsKeyColumn("ODR_AMOUNT") && key.getODR_AMOUNT() != null) {
					msgKey.setKeyValue("ODR_AMOUNT", key.getODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("ODR_AMOUNT_EXCH_RATES") && key.getODR_AMOUNT_EXCH_RATES() != null) {
					msgKey.setKeyValue("ODR_AMOUNT_EXCH_RATES", key.getODR_AMOUNT_EXCH_RATES());
				}
				if(msgKeyType.containsKeyColumn("ODR_CMPLT_FLG") && key.getODR_CMPLT_FLG() != null) {
					msgKey.setKeyValue("ODR_CMPLT_FLG", key.getODR_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("PART_NAME") && key.getPART_NAME() != null) {
					msgKey.setKeyValue("PART_NAME", key.getPART_NAME());
				}
				if(msgKeyType.containsKeyColumn("REMARKS") && key.getREMARKS() != null) {
					msgKey.setKeyValue("REMARKS", key.getREMARKS());
				}
				if(msgKeyType.containsKeyColumn("ODR_ACPT_DATE") && key.getODR_ACPT_DATE() != null) {
					msgKey.setKeyValue("ODR_ACPT_DATE", key.getODR_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("SHIP_PLAN_REMAIN_QTY") && key.getSHIP_PLAN_REMAIN_QTY() != null) {
					msgKey.setKeyValue("SHIP_PLAN_REMAIN_QTY", key.getSHIP_PLAN_REMAIN_QTY());
				}
				if(msgKeyType.containsKeyColumn("SHIP_PLAN_CMPLT_FLG") && key.getSHIP_PLAN_CMPLT_FLG() != null) {
					msgKey.setKeyValue("SHIP_PLAN_CMPLT_FLG", key.getSHIP_PLAN_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("UNCONFIRMED_ODR_EFF_OVR_FLG") && key.getUNCONFIRMED_ODR_EFF_OVR_FLG() != null) {
					msgKey.setKeyValue("UNCONFIRMED_ODR_EFF_OVR_FLG", key.getUNCONFIRMED_ODR_EFF_OVR_FLG());
				}
				if(msgKeyType.containsKeyColumn("ENTRY_TYP") && key.getENTRY_TYP() != null) {
					msgKey.setKeyValue("ENTRY_TYP", key.getENTRY_TYP());
				}
				if(msgKeyType.containsKeyColumn("DEL_FLG") && key.getDEL_FLG() != null) {
					msgKey.setKeyValue("DEL_FLG", key.getDEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_SET_FLG") && key.getJOB_ODR_SET_FLG() != null) {
					msgKey.setKeyValue("JOB_ODR_SET_FLG", key.getJOB_ODR_SET_FLG());
				}
				if(msgKeyType.containsKeyColumn("SLIP_CD") && key.getSLIP_CD() != null) {
					msgKey.setKeyValue("SLIP_CD", key.getSLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("ORGN_ODR_NO") && key.getORGN_ODR_NO() != null) {
					msgKey.setKeyValue("ORGN_ODR_NO", key.getORGN_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("ADD_ODR_FLG") && key.getADD_ODR_FLG() != null) {
					msgKey.setKeyValue("ADD_ODR_FLG", key.getADD_ODR_FLG());
				}
				if(msgKeyType.containsKeyColumn("ODR_CMPLT_DATE") && key.getODR_CMPLT_DATE() != null) {
					msgKey.setKeyValue("ODR_CMPLT_DATE", key.getODR_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("ODR_ACPT_ORG_CD") && key.getODR_ACPT_ORG_CD() != null) {
					msgKey.setKeyValue("ODR_ACPT_ORG_CD", key.getODR_ACPT_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("ESTIMATE_STAT") && key.getESTIMATE_STAT() != null) {
					msgKey.setKeyValue("ESTIMATE_STAT", key.getESTIMATE_STAT());
				}
				if(msgKeyType.containsKeyColumn("ES_ORG_CD") && key.getES_ORG_CD() != null) {
					msgKey.setKeyValue("ES_ORG_CD", key.getES_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("ES_USER_CD") && key.getES_USER_CD() != null) {
					msgKey.setKeyValue("ES_USER_CD", key.getES_USER_CD());
				}
				if(msgKeyType.containsKeyColumn("ESTIMATE_QTY") && key.getESTIMATE_QTY() != null) {
					msgKey.setKeyValue("ESTIMATE_QTY", key.getESTIMATE_QTY());
				}
				if(msgKeyType.containsKeyColumn("ESTIMATE_UNIT_PRICE") && key.getESTIMATE_UNIT_PRICE() != null) {
					msgKey.setKeyValue("ESTIMATE_UNIT_PRICE", key.getESTIMATE_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("ESTIMATE_AMOUNT") && key.getESTIMATE_AMOUNT() != null) {
					msgKey.setKeyValue("ESTIMATE_AMOUNT", key.getESTIMATE_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("ODR_FLG") && key.getODR_FLG() != null) {
					msgKey.setKeyValue("ODR_FLG", key.getODR_FLG());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("CAL_NO") && key.getCAL_NO() != null) {
					msgKey.setKeyValue("CAL_NO", key.getCAL_NO());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE") && key.getJOB_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("JOB_ODR_DLV_DATE", key.getJOB_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("RSLT_CTL_SEQ_CD") && key.getRSLT_CTL_SEQ_CD() != null) {
					msgKey.setKeyValue("RSLT_CTL_SEQ_CD", key.getRSLT_CTL_SEQ_CD());
				}
				if(msgKeyType.containsKeyColumn("UNIT") && key.getUNIT() != null) {
					msgKey.setKeyValue("UNIT", key.getUNIT());
				}
				if(msgKeyType.containsKeyColumn("DLV_PLACE_CD") && key.getDLV_PLACE_CD() != null) {
					msgKey.setKeyValue("DLV_PLACE_CD", key.getDLV_PLACE_CD());
				}
				if(msgKeyType.containsKeyColumn("UNIT_PRICE") && key.getUNIT_PRICE() != null) {
					msgKey.setKeyValue("UNIT_PRICE", key.getUNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("SPCL_PRICE_CO") && key.getSPCL_PRICE_CO() != null) {
					msgKey.setKeyValue("SPCL_PRICE_CO", key.getSPCL_PRICE_CO());
				}
				if(msgKeyType.containsKeyColumn("CUST_DLV_CD") && key.getCUST_DLV_CD() != null) {
					msgKey.setKeyValue("CUST_DLV_CD", key.getCUST_DLV_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_DLV_KEY_CD") && key.getCUST_DLV_KEY_CD() != null) {
					msgKey.setKeyValue("CUST_DLV_KEY_CD", key.getCUST_DLV_KEY_CD());
				}
				if(msgKeyType.containsKeyColumn("IF_CTL_NO") && key.getIF_CTL_NO() != null) {
					msgKey.setKeyValue("IF_CTL_NO", key.getIF_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("ODR_SEQ") && key.getODR_SEQ() != null) {
					msgKey.setKeyValue("ODR_SEQ", key.getODR_SEQ());
				}
				if(msgKeyType.containsKeyColumn("PART_DLV_SEQ_NO") && key.getPART_DLV_SEQ_NO() != null) {
					msgKey.setKeyValue("PART_DLV_SEQ_NO", key.getPART_DLV_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("LAST_ANS_DLV_DATE_RCD") && key.getLAST_ANS_DLV_DATE_RCD() != null) {
					msgKey.setKeyValue("LAST_ANS_DLV_DATE_RCD", key.getLAST_ANS_DLV_DATE_RCD());
				}
				if(msgKeyType.containsKeyColumn("DESINATED_SHIP_DATE") && key.getDESINATED_SHIP_DATE() != null) {
					msgKey.setKeyValue("DESINATED_SHIP_DATE", key.getDESINATED_SHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("DESINATED_SHIP_QTY") && key.getDESINATED_SHIP_QTY() != null) {
					msgKey.setKeyValue("DESINATED_SHIP_QTY", key.getDESINATED_SHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("REST_SHIP_ODR_QTY") && key.getREST_SHIP_ODR_QTY() != null) {
					msgKey.setKeyValue("REST_SHIP_ODR_QTY", key.getREST_SHIP_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("SHIP_ODR_CMPLT_FLG") && key.getSHIP_ODR_CMPLT_FLG() != null) {
					msgKey.setKeyValue("SHIP_ODR_CMPLT_FLG", key.getSHIP_ODR_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO") && key.getJOB_ODR_CANCEL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_CANCEL_NO", key.getJOB_ODR_CANCEL_NO());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP") && key.getJOB_ODR_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP", key.getJOB_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("PLAN_TYP") && key.getPLAN_TYP() != null) {
					msgKey.setKeyValue("PLAN_TYP", key.getPLAN_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_QTY") && key.getJOB_ODR_QTY() != null) {
					msgKey.setKeyValue("JOB_ODR_QTY", key.getJOB_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("ALC_GRP_CD") && key.getALC_GRP_CD() != null) {
					msgKey.setKeyValue("ALC_GRP_CD", key.getALC_GRP_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP") && key.getJOB_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_STS_TYP", key.getJOB_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_EXP_TYP") && key.getJOB_ODR_EXP_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_EXP_TYP", key.getJOB_ODR_EXP_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DEL_FLG") && key.getJOB_ODR_DEL_FLG() != null) {
					msgKey.setKeyValue("JOB_ODR_DEL_FLG", key.getJOB_ODR_DEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("ALCD_QTY") && key.getALCD_QTY() != null) {
					msgKey.setKeyValue("ALCD_QTY", key.getALCD_QTY());
				}
				if(msgKeyType.containsKeyColumn("CUS_DLV_CD") && key.getCUS_DLV_CD() != null) {
					msgKey.setKeyValue("CUS_DLV_CD", key.getCUS_DLV_CD());
				}
				if(msgKeyType.containsKeyColumn("CUS_DLV_KEY_CD") && key.getCUS_DLV_KEY_CD() != null) {
					msgKey.setKeyValue("CUS_DLV_KEY_CD", key.getCUS_DLV_KEY_CD());
				}
				if(msgKeyType.containsKeyColumn("UNOFFICIAL_RECEIPT_FLAG") && key.getUNOFFICIAL_RECEIPT_FLAG() != null) {
					msgKey.setKeyValue("UNOFFICIAL_RECEIPT_FLAG", key.getUNOFFICIAL_RECEIPT_FLAG());
				}
				if(msgKeyType.containsKeyColumn("JOB_OD_CD_PREFIX") && key.getJOB_OD_CD_PREFIX() != null) {
					msgKey.setKeyValue("JOB_OD_CD_PREFIX", key.getJOB_OD_CD_PREFIX());
				}
				if(msgKeyType.containsKeyColumn("CTL_SEQ_CD") && key.getCTL_SEQ_CD() != null) {
					msgKey.setKeyValue("CTL_SEQ_CD", key.getCTL_SEQ_CD());
				}
				if(msgKeyType.containsKeyColumn("NEW_OLD_FLG") && key.getNEW_OLD_FLG() != null) {
					msgKey.setKeyValue("NEW_OLD_FLG", key.getNEW_OLD_FLG());
				}
				if(msgKeyType.containsKeyColumn("TRAN_TYPE") && key.getTRAN_TYPE() != null) {
					msgKey.setKeyValue("TRAN_TYPE", key.getTRAN_TYPE());
				}
				if(msgKeyType.containsKeyColumn("EXCH_RATE") && key.getEXCH_RATE() != null) {
					msgKey.setKeyValue("EXCH_RATE", key.getEXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("ORG_NAME") && key.getORG_NAME() != null) {
					msgKey.setKeyValue("ORG_NAME", key.getORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("ORG_CD") && key.getORG_CD() != null) {
					msgKey.setKeyValue("ORG_CD", key.getORG_CD());
				}
				if(msgKeyType.containsKeyColumn("USER_NAME") && key.getUSER_NAME() != null) {
					msgKey.setKeyValue("USER_NAME", key.getUSER_NAME());
				}
				if(msgKeyType.containsKeyColumn("USER_CD") && key.getUSER_CD() != null) {
					msgKey.setKeyValue("USER_CD", key.getUSER_CD());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_h_ANS_DLV_DATE_EXIST_FLG") && key.getl_h_ANS_DLV_DATE_EXIST_FLG() != null) {
					msgKey.setKeyValue("l_h_ANS_DLV_DATE_EXIST_FLG", key.getl_h_ANS_DLV_DATE_EXIST_FLG());
				}
				if(msgKeyType.containsKeyColumn("FIELD_VALUE") && key.getFIELD_VALUE() != null) {
					msgKey.setKeyValue("FIELD_VALUE", key.getFIELD_VALUE());
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
					KM0030010Struct key = new KM0030010Struct();
					if(msgKeyType.containsKeyColumn("rdoSHIP_INST")) {
						key.setrdoSHIP_INST(msgKey.getKeyValue("rdoSHIP_INST"));
					}
					if(msgKeyType.containsKeyColumn("rdoSHIP_UPDATE")) {
						key.setrdoSHIP_UPDATE(msgKey.getKeyValue("rdoSHIP_UPDATE"));
					}
					if(msgKeyType.containsKeyColumn("l_CUR_UNIT")) {
						key.setl_CUR_UNIT(msgKey.getKeyValue("l_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("DETAIL_NO")) {
						key.setDETAIL_NO(msgKey.getKeyValue("DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_ODR_CD")) {
						key.setACPT_ODR_CD(msgKey.getKeyValue("ACPT_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("c_DOODR")) {
						key.setc_DOODR(msgKey.getKeyValue("c_DOODR"));
					}
					if(msgKeyType.containsKeyColumn("PREPARE_QTY")) {
						key.setPREPARE_QTY(msgKey.getKeyValue("PREPARE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("c_INPUTODRCD")) {
						key.setc_INPUTODRCD(msgKey.getKeyValue("c_INPUTODRCD"));
					}
					if(msgKeyType.containsKeyColumn("QTY")) {
						key.setQTY(msgKey.getKeyValue("QTY"));
					}
					if(msgKeyType.containsKeyColumn("QTY_UNIT")) {
						key.setQTY_UNIT(msgKey.getKeyValue("QTY_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("ODR_PRICE_UNIT")) {
						key.setODR_PRICE_UNIT(msgKey.getKeyValue("ODR_PRICE_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_COMMENT")) {
						key.setISSUE_INST_COMMENT(msgKey.getKeyValue("ISSUE_INST_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("APPROVED_COMMENT")) {
						key.setAPPROVED_COMMENT(msgKey.getKeyValue("APPROVED_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_NAME")) {
						key.setCUST_CHRG_PSN_NAME(msgKey.getKeyValue("CUST_CHRG_PSN_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ES_ORG_NAME")) {
						key.setES_ORG_NAME(msgKey.getKeyValue("ES_ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_DLV_LOC_NAME")) {
						key.setl_DLV_LOC_NAME(msgKey.getKeyValue("l_DLV_LOC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_ITEM_NAME")) {
						key.setl_CUST_ITEM_NAME(msgKey.getKeyValue("l_CUST_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_NAME")) {
						key.setl_ITEM_NAME(msgKey.getKeyValue("l_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_DLV_DATE")) {
						key.setl_JOB_ODR_DLV_DATE(msgKey.getKeyValue("l_JOB_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ALC_GRP_CD")) {
						key.setl_ALC_GRP_CD(msgKey.getKeyValue("l_ALC_GRP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD")) {
						key.setl_JOB_ODR_CD(msgKey.getKeyValue("l_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_APPR_REMARKS")) {
						key.setl_APPR_REMARKS(msgKey.getKeyValue("l_APPR_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("h_UPDATE_FLG")) {
						key.seth_UPDATE_FLG(msgKey.getKeyValue("h_UPDATE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_TEST_MODIFY_COUNT")) {
						key.setl_TEST_MODIFY_COUNT(msgKey.getKeyValue("l_TEST_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_TPJ_MODIFY_COUNT")) {
						key.setl_TPJ_MODIFY_COUNT(msgKey.getKeyValue("l_TPJ_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_h_ESTIMATE_TYPE")) {
						key.setl_h_ESTIMATE_TYPE(msgKey.getKeyValue("l_h_ESTIMATE_TYPE"));
					}
					if(msgKeyType.containsKeyColumn("h_ESTIMATE_TYPE")) {
						key.seth_ESTIMATE_TYPE(msgKey.getKeyValue("h_ESTIMATE_TYPE"));
					}
					if(msgKeyType.containsKeyColumn("l_h_PREC_ARRANGE_FLG")) {
						key.setl_h_PREC_ARRANGE_FLG(msgKey.getKeyValue("l_h_PREC_ARRANGE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_c_DOODR")) {
						key.setl_c_DOODR(msgKey.getKeyValue("l_c_DOODR"));
					}
					if(msgKeyType.containsKeyColumn("l_c_INPUTODRCD")) {
						key.setl_c_INPUTODRCD(msgKey.getKeyValue("l_c_INPUTODRCD"));
					}
					if(msgKeyType.containsKeyColumn("h_PREC_ARRANGE_FLG")) {
						key.seth_PREC_ARRANGE_FLG(msgKey.getKeyValue("h_PREC_ARRANGE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_h_ODR_TYP")) {
						key.setl_h_ODR_TYP(msgKey.getKeyValue("l_h_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_TYP")) {
						key.seth_ODR_TYP(msgKey.getKeyValue("h_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_TYP3")) {
						key.seth_ODR_TYP3(msgKey.getKeyValue("h_ODR_TYP3"));
					}
					if(msgKeyType.containsKeyColumn("h_APR_ODR")) {
						key.seth_APR_ODR(msgKey.getKeyValue("h_APR_ODR"));
					}
					if(msgKeyType.containsKeyColumn("h_PRD_REQ_JOB_ODR_TYP_1")) {
						key.seth_PRD_REQ_JOB_ODR_TYP_1(msgKey.getKeyValue("h_PRD_REQ_JOB_ODR_TYP_1"));
					}
					if(msgKeyType.containsKeyColumn("h_PRD_REQ_JOB_ODR_TYP_2")) {
						key.seth_PRD_REQ_JOB_ODR_TYP_2(msgKey.getKeyValue("h_PRD_REQ_JOB_ODR_TYP_2"));
					}
					if(msgKeyType.containsKeyColumn("h_DLV_LOC_CD")) {
						key.seth_DLV_LOC_CD(msgKey.getKeyValue("h_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ANS_DLV_DATE_EXIST_FLG")) {
						key.seth_ANS_DLV_DATE_EXIST_FLG(msgKey.getKeyValue("h_ANS_DLV_DATE_EXIST_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME_R")) {
						key.setITEM_NAME_R(msgKey.getKeyValue("ITEM_NAME_R"));
					}
					if(msgKeyType.containsKeyColumn("l_h_DEPO_TYP")) {
						key.setl_h_DEPO_TYP(msgKey.getKeyValue("l_h_DEPO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_CD")) {
						key.setPROJECT_CD(msgKey.getKeyValue("PROJECT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ESTIMATE_NO")) {
						key.setESTIMATE_NO(msgKey.getKeyValue("ESTIMATE_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_DETAL_NO")) {
						key.setl_DETAL_NO(msgKey.getKeyValue("l_DETAL_NO"));
					}
					if(msgKeyType.containsKeyColumn("CUST_NAME")) {
						key.setCUST_NAME(msgKey.getKeyValue("CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("CODE")) {
						key.setCODE(msgKey.getKeyValue("CODE"));
					}
					if(msgKeyType.containsKeyColumn("SYS_CLASS")) {
						key.setSYS_CLASS(msgKey.getKeyValue("SYS_CLASS"));
					}
					if(msgKeyType.containsKeyColumn("CLASS_CODE")) {
						key.setCLASS_CODE(msgKey.getKeyValue("CLASS_CODE"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("HOME_CUR_CD")) {
						key.setHOME_CUR_CD(msgKey.getKeyValue("HOME_CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("VALUE")) {
						key.setVALUE(msgKey.getKeyValue("VALUE"));
					}
					if(msgKeyType.containsKeyColumn("NAME")) {
						key.setNAME(msgKey.getKeyValue("NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_NAME")) {
						key.setPROJECT_NAME(msgKey.getKeyValue("PROJECT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_STAT")) {
						key.setPROJECT_STAT(msgKey.getKeyValue("PROJECT_STAT"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_CD")) {
						key.setDLV_LOC_CD(msgKey.getKeyValue("DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("CUR_CD")) {
						key.setCUR_CD(msgKey.getKeyValue("CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP")) {
						key.setEXCH_TYP(msgKey.getKeyValue("EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP")) {
						key.setTAX_APPLY_TYP(msgKey.getKeyValue("TAX_APPLY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD")) {
						key.setTAX_CD(msgKey.getKeyValue("TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CALC_TYP")) {
						key.setTAX_CALC_TYP(msgKey.getKeyValue("TAX_CALC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PARTIAL_SHIP_INST_FLG")) {
						key.setPARTIAL_SHIP_INST_FLG(msgKey.getKeyValue("PARTIAL_SHIP_INST_FLG"));
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
					if(msgKeyType.containsKeyColumn("l_ES_USER_CD")) {
						key.setl_ES_USER_CD(msgKey.getKeyValue("l_ES_USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ES_ORG_CD")) {
						key.setl_ES_ORG_CD(msgKey.getKeyValue("l_ES_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_ITEM_CD")) {
						key.setl_CUST_ITEM_CD(msgKey.getKeyValue("l_CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ESTIMATE_QTY")) {
						key.setl_ESTIMATE_QTY(msgKey.getKeyValue("l_ESTIMATE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_CD")) {
						key.setl_UNIT_CD(msgKey.getKeyValue("l_UNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ESTIMATE_UNIT_PRICE")) {
						key.setl_ESTIMATE_UNIT_PRICE(msgKey.getKeyValue("l_ESTIMATE_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("l_ESTIMATE_AMOUNT")) {
						key.setl_ESTIMATE_AMOUNT(msgKey.getKeyValue("l_ESTIMATE_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_ESTIMATE_TYPE")) {
						key.setl_ESTIMATE_TYPE(msgKey.getKeyValue("l_ESTIMATE_TYPE"));
					}
					if(msgKeyType.containsKeyColumn("l_ESTIMATE_ITEM_NAME")) {
						key.setl_ESTIMATE_ITEM_NAME(msgKey.getKeyValue("l_ESTIMATE_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_USER_NAME")) {
						key.setl_USER_NAME(msgKey.getKeyValue("l_USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_ORG_NAME")) {
						key.setl_ORG_NAME(msgKey.getKeyValue("l_ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_NAME")) {
						key.setDLV_LOC_NAME(msgKey.getKeyValue("DLV_LOC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("TRANSPORT_LT")) {
						key.setTRANSPORT_LT(msgKey.getKeyValue("TRANSPORT_LT"));
					}
					if(msgKeyType.containsKeyColumn("TRANSPORT_CD")) {
						key.setTRANSPORT_CD(msgKey.getKeyValue("TRANSPORT_CD"));
					}
					if(msgKeyType.containsKeyColumn("TRANSPORT_TYP")) {
						key.setTRANSPORT_TYP(msgKey.getKeyValue("TRANSPORT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DEPO_WH_CD")) {
						key.setDEPO_WH_CD(msgKey.getKeyValue("DEPO_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_PLANT_CD")) {
						key.setSHIP_PLANT_CD(msgKey.getKeyValue("SHIP_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("DEPO_TYP")) {
						key.setDEPO_TYP(msgKey.getKeyValue("DEPO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_NAME")) {
						key.setCUST_ITEM_NAME(msgKey.getKeyValue("CUST_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_CD")) {
						key.setCUST_ITEM_CD(msgKey.getKeyValue("CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ESTIMATE_TYPE")) {
						key.setESTIMATE_TYPE(msgKey.getKeyValue("ESTIMATE_TYPE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_NO")) {
						key.setODR_NO(msgKey.getKeyValue("ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("DETAL_NO")) {
						key.setDETAL_NO(msgKey.getKeyValue("DETAL_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_NO")) {
						key.setl_ODR_NO(msgKey.getKeyValue("l_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_TYP")) {
						key.setl_ODR_TYP(msgKey.getKeyValue("l_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_ODR_NO")) {
						key.setl_CUST_ODR_NO(msgKey.getKeyValue("l_CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_CD")) {
						key.setl_ITEM_CD(msgKey.getKeyValue("l_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_DESINATED_DLV_DATE")) {
						key.setl_DESINATED_DLV_DATE(msgKey.getKeyValue("l_DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_QTY")) {
						key.setl_ODR_QTY(msgKey.getKeyValue("l_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_AMOUNT")) {
						key.setl_ODR_AMOUNT(msgKey.getKeyValue("l_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_AMOUNT_EXCH_RATES")) {
						key.setl_ODR_AMOUNT_EXCH_RATES(msgKey.getKeyValue("l_ODR_AMOUNT_EXCH_RATES"));
					}
					if(msgKeyType.containsKeyColumn("l_DLV_LOC_CD")) {
						key.setl_DLV_LOC_CD(msgKey.getKeyValue("l_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_DEPO_TYP")) {
						key.setl_DEPO_TYP(msgKey.getKeyValue("l_DEPO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_ACPT_DATE")) {
						key.setl_ODR_ACPT_DATE(msgKey.getKeyValue("l_ODR_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_REMARKS")) {
						key.setl_REMARKS(msgKey.getKeyValue("l_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("l_OWN_PERSON_CD")) {
						key.setl_OWN_PERSON_CD(msgKey.getKeyValue("l_OWN_PERSON_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_TODR_MODIFY_COUNT")) {
						key.setl_TODR_MODIFY_COUNT(msgKey.getKeyValue("l_TODR_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_CHRG_PSN_NAME")) {
						key.setl_CUST_CHRG_PSN_NAME(msgKey.getKeyValue("l_CUST_CHRG_PSN_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_OWN_ORG_CD")) {
						key.setl_OWN_ORG_CD(msgKey.getKeyValue("l_OWN_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_CHRG_ORG_NAME")) {
						key.setl_CUST_CHRG_ORG_NAME(msgKey.getKeyValue("l_CUST_CHRG_ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ODR_TYP")) {
						key.setODR_TYP(msgKey.getKeyValue("ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ODR_CTL_NO")) {
						key.setODR_CTL_NO(msgKey.getKeyValue("ODR_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ODR_NO")) {
						key.setCUST_ODR_NO(msgKey.getKeyValue("CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CHRG_ORG_CD")) {
						key.setCUST_CHRG_ORG_CD(msgKey.getKeyValue("CUST_CHRG_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_CD")) {
						key.setCUST_CHRG_PSN_CD(msgKey.getKeyValue("CUST_CHRG_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("ODR_ACPT_PSN_CD")) {
						key.setODR_ACPT_PSN_CD(msgKey.getKeyValue("ODR_ACPT_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("CURRNCY_CD")) {
						key.setCURRNCY_CD(msgKey.getKeyValue("CURRNCY_CD"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_NAME_KANJI")) {
						key.setDLV_LOC_NAME_KANJI(msgKey.getKeyValue("DLV_LOC_NAME_KANJI"));
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
					if(msgKeyType.containsKeyColumn("REMAIN_UNCONFIRM_ODR_QTY")) {
						key.setREMAIN_UNCONFIRM_ODR_QTY(msgKey.getKeyValue("REMAIN_UNCONFIRM_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("CANCELED_UNCONFIRM_ODR_QTY")) {
						key.setCANCELED_UNCONFIRM_ODR_QTY(msgKey.getKeyValue("CANCELED_UNCONFIRM_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_CD")) {
						key.setUNIT_CD(msgKey.getKeyValue("UNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("UNCONFIRM_ODR_BALANCE")) {
						key.setUNCONFIRM_ODR_BALANCE(msgKey.getKeyValue("UNCONFIRM_ODR_BALANCE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_AMOUNT")) {
						key.setODR_AMOUNT(msgKey.getKeyValue("ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("ODR_AMOUNT_EXCH_RATES")) {
						key.setODR_AMOUNT_EXCH_RATES(msgKey.getKeyValue("ODR_AMOUNT_EXCH_RATES"));
					}
					if(msgKeyType.containsKeyColumn("ODR_CMPLT_FLG")) {
						key.setODR_CMPLT_FLG(msgKey.getKeyValue("ODR_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PART_NAME")) {
						key.setPART_NAME(msgKey.getKeyValue("PART_NAME"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS")) {
						key.setREMARKS(msgKey.getKeyValue("REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("ODR_ACPT_DATE")) {
						key.setODR_ACPT_DATE(msgKey.getKeyValue("ODR_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_PLAN_REMAIN_QTY")) {
						key.setSHIP_PLAN_REMAIN_QTY(msgKey.getKeyValue("SHIP_PLAN_REMAIN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_PLAN_CMPLT_FLG")) {
						key.setSHIP_PLAN_CMPLT_FLG(msgKey.getKeyValue("SHIP_PLAN_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("UNCONFIRMED_ODR_EFF_OVR_FLG")) {
						key.setUNCONFIRMED_ODR_EFF_OVR_FLG(msgKey.getKeyValue("UNCONFIRMED_ODR_EFF_OVR_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ENTRY_TYP")) {
						key.setENTRY_TYP(msgKey.getKeyValue("ENTRY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DEL_FLG")) {
						key.setDEL_FLG(msgKey.getKeyValue("DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_SET_FLG")) {
						key.setJOB_ODR_SET_FLG(msgKey.getKeyValue("JOB_ODR_SET_FLG"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_CD")) {
						key.setSLIP_CD(msgKey.getKeyValue("SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("ORGN_ODR_NO")) {
						key.setORGN_ODR_NO(msgKey.getKeyValue("ORGN_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("ADD_ODR_FLG")) {
						key.setADD_ODR_FLG(msgKey.getKeyValue("ADD_ODR_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ODR_CMPLT_DATE")) {
						key.setODR_CMPLT_DATE(msgKey.getKeyValue("ODR_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_ACPT_ORG_CD")) {
						key.setODR_ACPT_ORG_CD(msgKey.getKeyValue("ODR_ACPT_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("ESTIMATE_STAT")) {
						key.setESTIMATE_STAT(msgKey.getKeyValue("ESTIMATE_STAT"));
					}
					if(msgKeyType.containsKeyColumn("ES_ORG_CD")) {
						key.setES_ORG_CD(msgKey.getKeyValue("ES_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("ES_USER_CD")) {
						key.setES_USER_CD(msgKey.getKeyValue("ES_USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("ESTIMATE_QTY")) {
						key.setESTIMATE_QTY(msgKey.getKeyValue("ESTIMATE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ESTIMATE_UNIT_PRICE")) {
						key.setESTIMATE_UNIT_PRICE(msgKey.getKeyValue("ESTIMATE_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("ESTIMATE_AMOUNT")) {
						key.setESTIMATE_AMOUNT(msgKey.getKeyValue("ESTIMATE_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("ODR_FLG")) {
						key.setODR_FLG(msgKey.getKeyValue("ODR_FLG"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("CAL_NO")) {
						key.setCAL_NO(msgKey.getKeyValue("CAL_NO"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE")) {
						key.setJOB_ODR_DLV_DATE(msgKey.getKeyValue("JOB_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("RSLT_CTL_SEQ_CD")) {
						key.setRSLT_CTL_SEQ_CD(msgKey.getKeyValue("RSLT_CTL_SEQ_CD"));
					}
					if(msgKeyType.containsKeyColumn("UNIT")) {
						key.setUNIT(msgKey.getKeyValue("UNIT"));
					}
					if(msgKeyType.containsKeyColumn("DLV_PLACE_CD")) {
						key.setDLV_PLACE_CD(msgKey.getKeyValue("DLV_PLACE_CD"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_PRICE")) {
						key.setUNIT_PRICE(msgKey.getKeyValue("UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("SPCL_PRICE_CO")) {
						key.setSPCL_PRICE_CO(msgKey.getKeyValue("SPCL_PRICE_CO"));
					}
					if(msgKeyType.containsKeyColumn("CUST_DLV_CD")) {
						key.setCUST_DLV_CD(msgKey.getKeyValue("CUST_DLV_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_DLV_KEY_CD")) {
						key.setCUST_DLV_KEY_CD(msgKey.getKeyValue("CUST_DLV_KEY_CD"));
					}
					if(msgKeyType.containsKeyColumn("IF_CTL_NO")) {
						key.setIF_CTL_NO(msgKey.getKeyValue("IF_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("ODR_SEQ")) {
						key.setODR_SEQ(msgKey.getKeyValue("ODR_SEQ"));
					}
					if(msgKeyType.containsKeyColumn("PART_DLV_SEQ_NO")) {
						key.setPART_DLV_SEQ_NO(msgKey.getKeyValue("PART_DLV_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("LAST_ANS_DLV_DATE_RCD")) {
						key.setLAST_ANS_DLV_DATE_RCD(msgKey.getKeyValue("LAST_ANS_DLV_DATE_RCD"));
					}
					if(msgKeyType.containsKeyColumn("DESINATED_SHIP_DATE")) {
						key.setDESINATED_SHIP_DATE(msgKey.getKeyValue("DESINATED_SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("DESINATED_SHIP_QTY")) {
						key.setDESINATED_SHIP_QTY(msgKey.getKeyValue("DESINATED_SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("REST_SHIP_ODR_QTY")) {
						key.setREST_SHIP_ODR_QTY(msgKey.getKeyValue("REST_SHIP_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_ODR_CMPLT_FLG")) {
						key.setSHIP_ODR_CMPLT_FLG(msgKey.getKeyValue("SHIP_ODR_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO")) {
						key.setJOB_ODR_CANCEL_NO(msgKey.getKeyValue("JOB_ODR_CANCEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP")) {
						key.setJOB_ODR_TYP(msgKey.getKeyValue("JOB_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PLAN_TYP")) {
						key.setPLAN_TYP(msgKey.getKeyValue("PLAN_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_QTY")) {
						key.setJOB_ODR_QTY(msgKey.getKeyValue("JOB_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ALC_GRP_CD")) {
						key.setALC_GRP_CD(msgKey.getKeyValue("ALC_GRP_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP")) {
						key.setJOB_ODR_STS_TYP(msgKey.getKeyValue("JOB_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_EXP_TYP")) {
						key.setJOB_ODR_EXP_TYP(msgKey.getKeyValue("JOB_ODR_EXP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DEL_FLG")) {
						key.setJOB_ODR_DEL_FLG(msgKey.getKeyValue("JOB_ODR_DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ALCD_QTY")) {
						key.setALCD_QTY(msgKey.getKeyValue("ALCD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("CUS_DLV_CD")) {
						key.setCUS_DLV_CD(msgKey.getKeyValue("CUS_DLV_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUS_DLV_KEY_CD")) {
						key.setCUS_DLV_KEY_CD(msgKey.getKeyValue("CUS_DLV_KEY_CD"));
					}
					if(msgKeyType.containsKeyColumn("UNOFFICIAL_RECEIPT_FLAG")) {
						key.setUNOFFICIAL_RECEIPT_FLAG(msgKey.getKeyValue("UNOFFICIAL_RECEIPT_FLAG"));
					}
					if(msgKeyType.containsKeyColumn("JOB_OD_CD_PREFIX")) {
						key.setJOB_OD_CD_PREFIX(msgKey.getKeyValue("JOB_OD_CD_PREFIX"));
					}
					if(msgKeyType.containsKeyColumn("CTL_SEQ_CD")) {
						key.setCTL_SEQ_CD(msgKey.getKeyValue("CTL_SEQ_CD"));
					}
					if(msgKeyType.containsKeyColumn("NEW_OLD_FLG")) {
						key.setNEW_OLD_FLG(msgKey.getKeyValue("NEW_OLD_FLG"));
					}
					if(msgKeyType.containsKeyColumn("TRAN_TYPE")) {
						key.setTRAN_TYPE(msgKey.getKeyValue("TRAN_TYPE"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_RATE")) {
						key.setEXCH_RATE(msgKey.getKeyValue("EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("ORG_NAME")) {
						key.setORG_NAME(msgKey.getKeyValue("ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ORG_CD")) {
						key.setORG_CD(msgKey.getKeyValue("ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("USER_NAME")) {
						key.setUSER_NAME(msgKey.getKeyValue("USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("USER_CD")) {
						key.setUSER_CD(msgKey.getKeyValue("USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_h_ANS_DLV_DATE_EXIST_FLG")) {
						key.setl_h_ANS_DLV_DATE_EXIST_FLG(msgKey.getKeyValue("l_h_ANS_DLV_DATE_EXIST_FLG"));
					}
					if(msgKeyType.containsKeyColumn("FIELD_VALUE")) {
						key.setFIELD_VALUE(msgKey.getKeyValue("FIELD_VALUE"));
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
