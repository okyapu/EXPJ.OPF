/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0030/src/com/nec/jp/orteus/metamorBase/AD0030/AD0030040Control.java,v $
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

import java.io.*;
import jp.co.fit.vfreport.*;
import java.io.*;
import jp.co.fit.vfreport.*;
//{{user_implement_code_import
import java.text.ParseException;
import java.text.DateFormat;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AD0030040Control
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
	public AD0030040Struct getListvalue(int x) { return (AD0030040Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AD0030040Struct getStruct() { return this.struct; }	// Struct��Ԃ��܂��B
	public AD0030040Struct createStruct() { return new AD0030040Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AD0030040Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

//-----------------------------------------------------------------------------
	/**
	 * �������ʃ��X�g
	 */
	private List viewList = null;
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
	 * �Ɩ����W�b�N�̃��[�j���O���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * @param code ���b�Z�[�W�R�[�h
	 */
	private void setWarningMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addWarn(emsg);
		sysLog.info(emsg, getsysUSER_CD());
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
    
    /** �R���{�{�b�N�X�f�[�^�擾�p�萔�@��Ǝw���`�[���s�ς݃t���O */
    private final static String OPR_INST_SLIP_ISS_FLG_PARAMETER_NAME= "OPR_INST_SLIP_ISS_FLG"; 

    /** �R���{�{�b�N�X�f�[�^�擾�p�@��Ǝw���`�[���s�ς݃t���O */
    private ComboStruct OPR_INST_SLIP_ISS_FLG = null;
    
    private void othercomboTyp(AD0030040Struct aStruct) {

	 aStruct.setl_OPR_INST_SLIP_ISS_FLG_DN(getDisplayName(OPR_INST_SLIP_ISS_FLG, aStruct.getl_OPR_INST_SLIP_ISS_FLG().toString()));
  
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

	private String sTimeCtrl = "";
	
	/**
	* ���������̂��߁A�������̐���
	* @param ���� 1:":"�t��
	* @param ����
	*/
	private String formatHMW(String inTime ,String inFlag){
			
			if(null == inTime || "".equals(inTime)){
				if("1".equals(inFlag)){
					return " 23:59" ;
				}else{
					return inTime;
				}
			}
			
			if(inTime.length() < 3 || inTime.length() > 4){
				if("1".equals(inFlag)){
					return " 23:59" ;
				}else{
					return inTime;
				}
			}
			
			if(inTime.length() ==  3 ){
				if("1".equals(inFlag)){
					return " 0" + inTime.substring(0,1) + ":" + inTime.substring(1);
				}else{
					return "0" + inTime;
				}
			}
			if("1".equals(inFlag)){
				return " " + inTime.substring(0,2) + ":" + inTime.substring(2);
			}
			return inTime;
	}	
	
	
	/**
	 * ���i�[�̓o�^
	 * @param insertStruct
	 */
	private void insertIdentCard (AD0030040Struct insertStruct) {
		try {
			// ���i�[�Ǘ��ԍ�
			List identCardCtlNoList = entity.mSelectIDENT_CARD_CTL_NO.read(conn, insertStruct);
			if (!identCardCtlNoList.isEmpty()) {
				insertStruct.setIDENT_CARD_CTL_NO(((AD0030040Struct) identCardCtlNoList.get(0)).getIDENT_CARD_CTL_NO());
			}
			// �쐬��
			insertStruct.setsSysdate(struct.getsSysdate());
			// �쐬��
			insertStruct.setsUser_ID(getsysUSER_CD());
			entity.minsertT_IDENT_CARD.create(conn, insertStruct);
		} catch (Exception e) {
			e.printStackTrace();
			setErrorMessage("ZZ01106");
		}
	}
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030040Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>


		try {
			readStatus = INITIAL;
			
			//������
			this.msgStruct.clearAll();
			DateFormat df = DateFormat.getDateInstance();
			AD0030040Struct selectStruct = new AD0030040Struct();
			this.list = null;
			viewList = null;
			struct.setINST_PRINTED("");
			
			// ���������̐ݒ�
			if(this.struct.getr1_MODE() != null && this.struct.getr1_MODE().equals("true")){
				Date dtOprInstStartDate = null;
				try {
				dtOprInstStartDate = df.parse(this.struct.getOPR_INST_START_DATE());
				} catch (ParseException pe) {
					pe.printStackTrace();
					ExpjMessage emsg = new ExpjMessage("ZZ01106");
					sysLog.severe(emsg, getsysUSER_CD());
					throw new ExpjException(pe, emsg);
				}
				String strOprInstStartDate = Converter.dateToStr(dtOprInstStartDate,"yyyy/MM/dd");
				String strOprInstStartDateTime = formatHMW(this.struct.getOPR_INST_START_TIME() ,"1");
				if((this.struct.getOPR_INST_START_TIME()).length() == 3){
					this.struct.setOPR_INST_START_TIME("0" + this.struct.getOPR_INST_START_TIME());
				}
				selectStruct.setOPR_INST_START_DATE(strOprInstStartDate + strOprInstStartDateTime);
				selectStruct.setWORK_ODR_DLV_DATE(null);
			} else {
				Date dtWorkOorDlvDate = null;
				try {
				dtWorkOorDlvDate = df.parse(this.struct.getWORK_ODR_DLV_DATE());
				} catch (ParseException pe) {
					pe.printStackTrace();
					ExpjMessage emsg = new ExpjMessage("ZZ01106");
					sysLog.severe(emsg, getsysUSER_CD());
					throw new ExpjException(pe, emsg);
				}
				String strWorkOorDlvDate = Converter.dateToStr(dtWorkOorDlvDate,"yyyy/MM/dd");
				String strWorkOorDlvDateTime = formatHMW(this.struct.getWORK_ODR_DLV_TIME() ,"1");
				if((this.struct.getWORK_ODR_DLV_TIME()).length() == 3){
					this.struct.setWORK_ODR_DLV_TIME("0" + this.struct.getWORK_ODR_DLV_TIME());
				}

				selectStruct.setOPR_INST_START_DATE(null);
				selectStruct.setWORK_ODR_DLV_DATE(strWorkOorDlvDate + strWorkOorDlvDateTime);
			}
			selectStruct.setJOB_ODR_CD(this.struct.getJOB_ODR_CD());
			selectStruct.setITEM_CD(this.struct.getITEM_CD());
			selectStruct.setWS_CD(this.struct.getWS_CD());
			selectStruct.setPLANT_CD(this.sysPLANT_CD);
			if (this.struct.getc_RE_PRINT() != null 
					&& this.struct.getc_RE_PRINT().equals("true")) {
				selectStruct.setOPR_INST_SLIP_ISS_FLG("1");
			} else {
				selectStruct.setOPR_INST_SLIP_ISS_FLG("0");
			}
            // �ő�\���s��
            int maxLine = sp.getMaxLine(conn, 10);
			if(maxLine != 0) {
				selectStruct.setROW_COUNT(String.valueOf(maxLine));
			} else {
				selectStruct.setROW_COUNT(null);
			}
			viewList = entity.mV_OPR_INST_SLIPCnt.read(conn, selectStruct);
			long rowCount = Long.parseLong(((AD0030040Struct)viewList.get(0)).getl_COUNT());  
			
			// �Ώی���=0���̏ꍇ�G���[
			if (rowCount==0) {
				setErrorMessage("ZZ06001");
				readStatus = NOT_FOUND;
				if(list != null && list.size() > 0){
				list.clear();
			}
				return;
		}
			if ((maxLine != 0) && (rowCount == maxLine + 1)) {
				setErrorMessage("ZZ01115", String.valueOf(maxLine));
				readStatus = TOO_MANY;
				if(list != null && list.size() > 0){
					list.clear();
				}
				return;
			}
			 viewList = entity.mV_OPR_INST_SLIP.read(conn, selectStruct);
			// ���X�g�f�[�^��ݒ�
			setList(viewList);
			AD0030040Struct TempStruct;
             for (int i = 0; i < list.size(); i++) {
		     TempStruct = (AD0030040Struct)list.get(i);
				
		     //�R���{�{�b�N�X�̎擾
		     othercomboTyp(TempStruct);
		    }
			readStatus = NORMAL;
			
		} catch(SQLException e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}


                //}}user_implement_dev:<controlSelect>
		logger.exiting("AD0030040Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * ��Ǝw���[�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlPrint() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030040Control"+":USER="+struct.getsUser_ID(),"controlPrint");
			AD0030040Struct strPdf = null;

		int ret = 0;
		String printType      = getPdfOutputType();
		String printPattern   = getPdfOutputListPattern();
		String printer        = getPdfOutputPrinter();
		SvfWrapper svf        = new SvfWrapper(printType, getsysUSER_CD(), printer);

			//{{user_implement_dev:<controlPrint>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			//�Ɩ��^�p�����擾����
			AD0030040Struct updateStruct = new AD0030040Struct();
			updateStruct.setPLANT_CD(this.sysPLANT_CD);
			List updatelist = entity.mSYS_DATE_CTRL.read(conn, updateStruct);
			if (updatelist == null || updatelist.size() <= 0) {
				//�f�[�^�����݂��Ȃ�
				setErrorMessage("ZZ01101");
				setErrorParameter("SYS_DATE_CTRL", "PLANT_CD", this.sysPLANT_CD);
				return;
			}
			updateStruct = (AD0030040Struct)updatelist.get(0);
			String businessOprDate = updateStruct.getBUSINESS_OPR_DATE();
			
			// �ő�\�������𒴂��Ă����ԂŒ��[�o�̓{�^�����������ꂽ�ꍇ
			if (list == null && viewList != null) {
				// ���X�g�ɁA���[�o�͗p�ɑޔ������������ʂ�ݒ肷��
				list = viewList;
			}
			
			if ( "1".equals(printPattern) ) {	// �Č������Ĉ���̏ꍇ
				// �Č����������L�q���Ă��������B
				controlSelect();
			}

			int loopMax = 0;
			String[] printLine = getPdfOutputListLine();
			if ( "3".equals(printPattern) ) {	// �I���s�݈̂���̏ꍇ
				if ( printLine != null ) {
					loopMax = printLine.length;
				}
			}
			else {	// �S�s����̏ꍇ
				if ( list != null ) {
					loopMax = list.size();
				}
			}

			//��������̊J�n
			String printId1 = null;	// ���[ID�̏�����
			if(struct.getc_RE_PRINT() != null && "true".equals(struct.getc_RE_PRINT())){
				printId1 = "AD00300402";   //�Ĕ��s�p���[ID���w�肵�Ă�������
			}else{
				printId1 = "AD00300401";   //�ʏ픭�s�p���[ID���w�肵�Ă�������
			}
			ret = svf.VrInit(printId1);	// PDF�쐬�J�n
			pdfFilePath = svf.getPdfFilePath();	// pdf�t���p�X�t�@�C����
			pdfFileName = svf.getPdfFileName();	// pdf�t�@�C�����iWeb�p�j
			String excuteOutput = svf.getExcuteOutput();	// �T�[�o�o�͏���
			
 			// �N�G���[�t�@�C���̎w�� 		
			if (dbKIND != null && !dbKIND.equals("")) {
				ret = svf.VrSetQuery("KIND=" + dbKIND + ";UID=" + dbUID
						+ ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);
			} else {
				ret = svf.VrSetQuery("UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ="
						+ dbDBQ);
			} 
			
			//�w�b�_�[���̃Z�b�g

			//�f�[�^�̃Z�b�g
			for(int i=0; i<loopMax; i++) {				// �f�[�^�o�� 
				if ( "3".equals(printPattern) ) {	// �I���s�݈̂���̏ꍇ
					strPdf = (AD0030040Struct)list.get( Integer.parseInt(printLine[i]) );
				}
				else {	// �S�s����̏ꍇ
					strPdf = (AD0030040Struct)list.get(i);
				}

				// ��Ǝw���`�[���b�N���X�V�񐔎擾
				AD0030040Struct searchStruct = new AD0030040Struct();
				searchStruct.setl_OPR_INST_CD(strPdf.getl_OPR_INST_CD());
				List lockedList = entity.mT_OPR_INST_SLIP_LOCK.read(conn, searchStruct);
				// PDF�o�͂���L�[�����݂��Ȃ��ꍇ�̓G���[�B
				if (lockedList.isEmpty()) {
					setErrorMessage("ZZ01105");
					return;
				} 

				// �ǂݍ��ݎ���"�X�V��"�ƈقȂ�ꍇ�̓G���[
				AD0030040Struct lockedStruct = (AD0030040Struct) lockedList.get(0);
				if (!lockedStruct.getl_MODIFY_COUNT().equals(strPdf.getl_MODIFY_COUNT())) {
					setErrorMessage("ZZ01105");
					return;
				}
				
     			// �N�G���[���o�����̎w��      		
     			ret = svf.VrCondition("[X|WORK_ODR_CD]=" + strPdf.getl_WORK_ODR_CD(), 4);
     			ret = svf.VrCondition("[X|WORK_IN_PROC_CD]=" + strPdf.getl_WORK_IN_PROC_CD(), 4);
     			ret = svf.VrCondition("[X|PLANT_CD]=" + sysPLANT_CD, 4);     			
     			// �N�G���[���s 
     			ret = svf.VrReport();
     			if (ret == -554) {
    				ExpjMessage emsg = new ExpjMessage("ZZ06001");
    				msgStruct.addError(emsg);
    				sysLog.warning(emsg, sysUSER_CD);
    				return;
    			}
     			
				if (strPdf.getl_OPR_INST_SLIP_ISS_FLG() == null 
						|| strPdf.getl_OPR_INST_SLIP_ISS_FLG().equals("0")) {
					//�X�V����l���Z�b�g����
					updateStruct = new AD0030040Struct();
					updateStruct.setl_OPR_INST_SLIP_ISS_DATE(businessOprDate);
					updateStruct.setl_OPR_INST_SLIP_ISS_FLG("1");
					updateStruct.setl_OPR_INST_CD(strPdf.getl_OPR_INST_CD());
					updateStruct.setsUser_ID(this.sysUSER_CD);
					//[��Ǝw���`�[]���X�V����
					entity.mT_OPR_INST_SLIP.update(conn, updateStruct);
				}
			}
			
			ret = svf.VrQuit();								// PDF�쐬�I��

			if ( "0".equals(printType) ) {	// �N���C�A���g����̏ꍇ
				struct.setDOWNLOAD_FILE(getPdfFileName());
			}
			else if ( "1".equals(printType) ) {	// �T�[�o����̏ꍇ
				try {
					String acrobatPath = svf.getAcrobatPath();
					String acrobatOption1 = svf.getAcrobatOption1();
					String acrobatOption2 = svf.getAcrobatOption2();
					String pdfPrinter = svf.getPrinter();
					Runtime.getRuntime().exec(new String[]{acrobatPath, acrobatOption1, acrobatOption2, pdfFilePath, pdfPrinter});
					//Runtime.getRuntime().exec(excuteOutput);
				}catch(IOException e){
					// �T�[�o������s���̃G���[�������L�q���Ă��������B
					ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
					sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
					ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
					throw ee;
				}
			}

//			objMessage.m_writer.write(Level.INFO, "file=" + svf.VrGetSpoolFileName() + "�ɏo��");

			conn.commit();
			
			if ("true".equals(struct.getc_CARD_PRINT())) {
				// ���i�[���o�͂̏ꍇ
				struct.setINST_PRINTED("true");
			} else {
				// �ēǍ�
				controlSelect();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			throw ee;
		}catch(Exception e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			throw ee;
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}

                //}}user_implement_dev:<controlPrint>
		logger.exiting("AD0030040Control"+":USER="+struct.getsUser_ID(),"controlPrint");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030040Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>

			
			readStatus = INITIAL;
			
			this.msgStruct.clearAll();
			this.struct.clear();
			
			if (list != null) {
				list.clear();
			}
			
			if (viewList != null) {
				viewList.clear();
			}
			
			this.struct.setr1_MODE("true");
			try{
				// �V�X�e���p�����[�^�iTIME_CTRL�j�擾
				List TIME_CTRLList = entity.mTIME_CTRL.read(conn, struct);
				if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
					this.struct.setTIME_CTRL(((AD0030040Struct)TIME_CTRLList.get(0)).getTIME_CTRL());
				}else{
					this.struct.setTIME_CTRL("false");
				}
				sTimeCtrl = this.struct.getTIME_CTRL();		
				// �f�[�^�x�[�X�ւ̃A�N�Z�X���s���ꍇ�́A����try catch���̃R�����g���O���Ă��������B
			} catch(SQLException e) {
	//			e.printStackTrace();
				// �G���[�������L�q���Ă��������B
				// 
			}
			

                //}}user_implement_dev:<controlClear>
		logger.exiting("AD0030040Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ���i�[�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCardPrint() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030040Control"+":USER="+struct.getsUser_ID(),"controlCardPrint");
			//{{user_implement_dev:<controlCardPrint>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		AD0030040Struct strPdf = null;
		int ret = 0;
		String printType      = getPdfOutputType();
		String printPattern   = getPdfOutputListPattern();
		String printer        = getPdfOutputPrinter();
		SvfWrapper svf        = new SvfWrapper(printType, getsysUSER_CD(), printer);

		
		try {
			// ���i�[�o�̓^�C�~���O�̎擾
			List checkList = entity.mSYS_PARAMETER.read(conn, struct);
			if (checkList.isEmpty()) {
				setErrorMessage("AD34030");
				return;
			} else {
				String flag = ((AD0030040Struct)checkList.get(0)).getIDENT_CARD();
				// [�p�����[�^].�h�ݒ�l�h���u1:����v�ꍇ
				if ("1".equals(flag)) {
					setErrorMessage("AD34030");
					return;
				}
			}

			// ������X�g
			List printList = new ArrayList();
			// ��ƌv��ԍ����X�g
			List WorkOdrCdList = struct.getList_l_WORK_ODR_CD();
			// ���i�[�o�͍ς݃t���O
			List cardPrintList = struct.getList_l_CARD_PRINTED_FLG();
			List printDataList = null;
			AD0030040Struct printStruct = new AD0030040Struct();
			
			String workOdrCd = "";	// ��ƌv��ԍ�
			String tempCardQty = "0"; // ���i�[�c��
			AD0030040Struct insertStruct = new AD0030040Struct();
			AD0030040Struct selectStruct = new AD0030040Struct();
			conn.beginTransWeb();

			// ���[�o��
			for (int i = 0; i < WorkOdrCdList.size(); i++) {
				// ���i�[���ɏo�͍ς݁A�����́A�O��Ɠ����̍�ƌv��ԍ��̏ꍇ�A�����R�[�h�𑱍s����
				if ("1".equals(String.valueOf(cardPrintList.get(i))) || workOdrCd.equals(String.valueOf(WorkOdrCdList.get(i)))) {
					continue;
				}
				// ���o������ݒ�
				// ��ƌv��ԍ�
				selectStruct.setl_WORK_ODR_CD(String.valueOf(WorkOdrCdList.get(i)));
				
				// ������X�g���擾����B
				printDataList = entity.mSelectIDENT_CARD_DATA.read(conn, selectStruct);
				
				for (int j = 0; j < printDataList.size(); j++) {
					printStruct = (AD0030040Struct)printDataList.get(j);
					// ���i�[�c��
					tempCardQty = Calculate.subtract(printStruct.getOPR_INST_QTY(),printStruct.getIDENT_CARD_QTY());
					if (Calculate.compare(tempCardQty, "0") == 0) {
						// ���̏����ɂ�茻�i�[���o�͂���܂���
						continue;
					}
					
					insertStruct = new AD0030040Struct();
					
					// ��Ǝw���ԍ�
					insertStruct.setOPR_INST_CD(printStruct.getOPR_INST_CD());
					
					// �i�ڔԍ�
					insertStruct.setITEM_CD(printStruct.getITEM_CD());
					
					// ����
					insertStruct.setJOB_ODR_CD(printStruct.getJOB_ODR_CD());
					
					// �������i�[����
					insertStruct.setFIRST_IDENT_CARD_QTY(Calculate.subtract(printStruct.getOPR_INST_QTY(),printStruct.getIDENT_CARD_QTY()));
					
					// ���i�[����
					insertStruct.setIDENT_CARD_QTY(Calculate.subtract(printStruct.getOPR_INST_QTY(),printStruct.getIDENT_CARD_QTY()));
					
					// �׎p�P�ʐ�
					insertStruct.setPKG_UNIT_QTY(printStruct.getPKG_UNIT_QTY());
					
					// �H��R�[�h
					insertStruct.setPLANT_CD(getsysPLANT_CD());
					
					// ��Ƌ�R�[�h
					insertStruct.setWS_CD(printStruct.getWS_CD());
					
					// �o�͖���
					insertStruct.setPRINT_QTY(Calculate.divide(insertStruct.getIDENT_CARD_QTY(), insertStruct.getPKG_UNIT_QTY(),Calculate.CEIL));
					
					// �i�ږ���
					insertStruct.setITEM_NAME(printStruct.getITEM_NAME());
					
					// �P��
					insertStruct.setSTOCK_UNIT(printStruct.getSTOCK_UNIT());
					
					// [���i�[]��o�^����
					insertIdentCard(insertStruct);
					printList.add(insertStruct);
				}

				// ��ƌv��ԍ���ݒ�
				workOdrCd = String.valueOf(WorkOdrCdList.get(i));
			}

			if (printList.size() == 0) {
				// ���̏����ɂ�茻�i�[�����ׂďo�͂���܂���
				setWarningMessage("AD00249");
				return;
			}

			String printId1 = "AD01200101"; // ���[ID���w�肵�Ă�������
			ret = svf.VrInit(printId1); // PDF�쐬�J�n
			pdfFilePath = svf.getPdfFilePath(); // pdf�t���p�X�t�@�C����
			pdfFileName = svf.getPdfFileName(); // pdf�t�@�C�����iWeb�p�j
			int no = 0;

			for (int i = 0; i < printList.size(); i++) {
				strPdf = (AD0030040Struct) printList.get(i);
				if (strPdf.getIDENT_CARD_CTL_NO() != null && !"".equals(strPdf.getIDENT_CARD_CTL_NO())) {
					double bunshi = Double.parseDouble(strPdf.getIDENT_CARD_QTY());
					double bunbo = Double.parseDouble(strPdf.getPKG_UNIT_QTY());
					double maxPrintQty;
					double overno;
					// �ő�o�͖���
					maxPrintQty = Double.parseDouble(Calculate.divide(String.valueOf(bunshi), String.valueOf(bunbo), 0, Calculate.CEIL));
					// ���i�[���ʁ��׎p�P�ʐ��ʂ̗]������߂�
					overno = bunshi % bunbo;

					for (int j = 1; j <= Double.parseDouble(strPdf.getPRINT_QTY()); j++) {
						// �i�ڔԍ�
						ret = svf.VrsOut("ITEM_CD", strPdf.getITEM_CD());
						// �i�ږ���
						ret = svf.VrsOut("ITEM_NAME", strPdf.getITEM_NAME());
						
						if (j >= maxPrintQty) {
							// �ŏI�y�[�W�ł��A�]�肪����ꍇ
							if (j == maxPrintQty) {
								// �]����׎p�P�ʐ��ʂɐݒ�
								if (overno != 0){
									ret = svf.VrsOut("PKG_UNIT_QTY", Calculate.floor(Double.toString(overno), 4));
								} else {
									ret = svf.VrsOut("PKG_UNIT_QTY", strPdf.getPKG_UNIT_QTY());
								}
							} else {
								// ���͂����o�͖����͍ő�o�͖����𒴂���ꍇ
								ret = svf.VrsOut("PKG_UNIT_QTY", "0");
							}
						} else {
							// �׎p�P�ʐ���
							ret = svf.VrsOut("PKG_UNIT_QTY", strPdf.getPKG_UNIT_QTY());
						}
						// �P��
						ret = svf.VrsOut("STOCK_UNIT", strPdf.getSTOCK_UNIT());
						// ���i�[�Ǘ��ԍ�
						ret = svf.VrsOut("IDENT_CARD_CTL_NO", strPdf.getIDENT_CARD_CTL_NO());
						// �݌Ƀ��b�g�ԍ�
						ret = svf.VrsOut("LOT_NO", strPdf.getLOT_NO());
						// ����
						ret = svf.VrsOut("JOB_ODR_CD", strPdf.getJOB_ODR_CD());
						// ���ѐ���
						ret = svf.VrsOut("IDENT_CARD_QTY", strPdf.getIDENT_CARD_QTY());
						// ��Ǝw���ԍ�
						ret = svf.VrsOut("OPR_INST_CD", strPdf.getOPR_INST_CD());
						// �����
						ret = svf.VrsOut("PARTIAL_PRD_NO", strPdf.getPARTIAL_PRD_NO());
						// ��Ɠ�
						ret = svf.VrsOut("OPR_DATE", strPdf.getOPR_DATE());
						ret = svf.VrsOut("PAGE_NO", j + "");
						ret = svf.VrsOut("PRINT_QTY", strPdf.getPRINT_QTY());
						// �\�[�g �y�[�W�p
						ret = svf.VrsOut("NO", Integer.toString(no++));
						ret = svf.VrEndRecord();
						ret = svf.VrEndPage(); // ���y�[�W���s
					}
					// ���i�[�X�V
					entity.minsertT_IDENT_CARD.update(conn, strPdf);
				}
			}
			
			ret = svf.VrPrint(); // PDF�쐬�I��
			ret = svf.VrQuit(); // PDF�쐬�I��
			if ("0".equals(printType)) { // �N���C�A���g����̏ꍇ
				struct.setDOWNLOAD_FILE(getPdfFileName());
			} else if ("1".equals(printType)) {
				try {
					String acrobatPath = svf.getAcrobatPath();
					String acrobatOption1 = svf.getAcrobatOption1();
					String acrobatOption2 = svf.getAcrobatOption2();
					String pdfPrinter = svf.getPrinter();
					Runtime.getRuntime().exec(new String[]{acrobatPath, acrobatOption1, acrobatOption2, pdfFilePath, pdfPrinter});
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			controlSelect();
			// �R�~�b�g
			conn.commit();
		} catch(Exception e) {
			e.printStackTrace();
			setErrorMessage("ZZ01106");
			setReadStatus(ERROR);
		} finally {
			try {
				conn.rollback();
			} catch (Exception e) {
				e.printStackTrace();
				setErrorMessage("ZZ01106");
			}
		}
                //}}user_implement_dev:<controlCardPrint>
		logger.exiting("AD0030040Control"+":USER="+struct.getsUser_ID(),"controlCardPrint");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030040Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AD0030040Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030040Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>


			// ��ʑJ�ڂ̌Ăяo����������AStruct�ɉ�ʑJ�ڃL�[��ݒ肵��controlSelect()���Ăяo��
			if ( isScreenMove() == true ) {
				// �����̃R���g���[�����\�b�h���Ăяo���܂��B
				//controlSelect();
			}

			readStatus = INITIAL;
			this.msgStruct.clearAll();
			this.struct.clear();
			
			if (list != null) {
				list.clear();
			}
			
			if (viewList != null) {
				viewList.clear();
			}
			
			this.struct.setr1_MODE("true");
			
			try{
				// �V�X�e���p�����[�^�iTIME_CTRL�j�擾
				List TIME_CTRLList = entity.mTIME_CTRL.read(conn, struct);
				if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
					this.struct.setTIME_CTRL(((AD0030040Struct)TIME_CTRLList.get(0)).getTIME_CTRL());
				}else{
					this.struct.setTIME_CTRL("false");
				}
				sTimeCtrl = this.struct.getTIME_CTRL();		
				// �f�[�^�x�[�X�ւ̃A�N�Z�X���s���ꍇ�́A����try catch���̃R�����g���O���Ă��������B
			} catch(SQLException e) {
	//			e.printStackTrace();
				// �G���[�������L�q���Ă��������B
				// 
			}			

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AD0030040Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

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
		logger.entering("AD0030040Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
		struct.setDOWNLOAD_FILE((String)null);	// �_�E�����[�h�t�@�C�����N���A
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
		try {
                 ComboBox comboController = new ComboBox(conn, sysUSER_CD);	
                 OPR_INST_SLIP_ISS_FLG = comboController.getData(OPR_INST_SLIP_ISS_FLG_PARAMETER_NAME);

                } catch (SQLException e) {
                 throw new ExpjException(e);
                } catch (ComboException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AD0030040Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Print") ) {
				controlPrint();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("CardPrint") ) {
				controlCardPrint();
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
//			throw new FoundationException("AD0030040Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0030040-E999","CSV�̏o�͏���"));
			throw new FoundationException("AD0030040Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0030040-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AD0030040Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0030040-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AD0030040Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AD0030040Entity entity;
	protected AD0030040Struct struct;
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

		entity = new AD0030040Entity();
		struct = new AD0030040Struct();

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
	 * AD0030040�N���X�̕W���R���X�g���N�^
	 */
	public AD0030040Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
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
				AD0030040Struct key = (AD0030040Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("r1_MODE") && key.getr1_MODE() != null) {
					msgKey.setKeyValue("r1_MODE", key.getr1_MODE());
				}
				if(msgKeyType.containsKeyColumn("c_RE_PRINT") && key.getc_RE_PRINT() != null) {
					msgKey.setKeyValue("c_RE_PRINT", key.getc_RE_PRINT());
				}
				if(msgKeyType.containsKeyColumn("r2_MODE") && key.getr2_MODE() != null) {
					msgKey.setKeyValue("r2_MODE", key.getr2_MODE());
				}
				if(msgKeyType.containsKeyColumn("PRINT_PATTERN") && key.getPRINT_PATTERN() != null) {
					msgKey.setKeyValue("PRINT_PATTERN", key.getPRINT_PATTERN());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_INST_SLIP_ISS_FLG_DN") && key.getl_OPR_INST_SLIP_ISS_FLG_DN() != null) {
					msgKey.setKeyValue("l_OPR_INST_SLIP_ISS_FLG_DN", key.getl_OPR_INST_SLIP_ISS_FLG_DN());
				}
				if(msgKeyType.containsKeyColumn("DATE") && key.getDATE() != null) {
					msgKey.setKeyValue("DATE", key.getDATE());
				}
				if(msgKeyType.containsKeyColumn("TIME") && key.getTIME() != null) {
					msgKey.setKeyValue("TIME", key.getTIME());
				}
				if(msgKeyType.containsKeyColumn("PAGE") && key.getPAGE() != null) {
					msgKey.setKeyValue("PAGE", key.getPAGE());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_PAGE") && key.getTOTAL_PAGE() != null) {
					msgKey.setKeyValue("TOTAL_PAGE", key.getTOTAL_PAGE());
				}
				if(msgKeyType.containsKeyColumn("BARCODE1") && key.getBARCODE1() != null) {
					msgKey.setKeyValue("BARCODE1", key.getBARCODE1());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_TIME") && key.getOPR_INST_START_TIME() != null) {
					msgKey.setKeyValue("OPR_INST_START_TIME", key.getOPR_INST_START_TIME());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_TIME") && key.getWORK_ODR_DLV_TIME() != null) {
					msgKey.setKeyValue("WORK_ODR_DLV_TIME", key.getWORK_ODR_DLV_TIME());
				}
				if(msgKeyType.containsKeyColumn("c_CARD_PRINT") && key.getc_CARD_PRINT() != null) {
					msgKey.setKeyValue("c_CARD_PRINT", key.getc_CARD_PRINT());
				}
				if(msgKeyType.containsKeyColumn("INST_PRINTED") && key.getINST_PRINTED() != null) {
					msgKey.setKeyValue("INST_PRINTED", key.getINST_PRINTED());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO") && key.getLOT_NO() != null) {
					msgKey.setKeyValue("LOT_NO", key.getLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("PARTIAL_PRD_NO") && key.getPARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("PARTIAL_PRD_NO", key.getPARTIAL_PRD_NO());
				}
				if(msgKeyType.containsKeyColumn("OPR_DATE") && key.getOPR_DATE() != null) {
					msgKey.setKeyValue("OPR_DATE", key.getOPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_WORK_ODR_CD") && key.getl_WORK_ODR_CD() != null) {
					msgKey.setKeyValue("l_WORK_ODR_CD", key.getl_WORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_WORK_IN_PROC_CD") && key.getl_WORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("l_WORK_IN_PROC_CD", key.getl_WORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("l_PROC_NAME") && key.getl_PROC_NAME() != null) {
					msgKey.setKeyValue("l_PROC_NAME", key.getl_PROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_PROC_NO") && key.getl_PROC_NO() != null) {
					msgKey.setKeyValue("l_PROC_NO", key.getl_PROC_NO());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_INST_CD") && key.getl_OPR_INST_CD() != null) {
					msgKey.setKeyValue("l_OPR_INST_CD", key.getl_OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_CD") && key.getl_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ITEM_CD", key.getl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_NAME") && key.getl_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ITEM_NAME", key.getl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_WS_CD") && key.getl_WS_CD() != null) {
					msgKey.setKeyValue("l_WS_CD", key.getl_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("l_WS_NAME") && key.getl_WS_NAME() != null) {
					msgKey.setKeyValue("l_WS_NAME", key.getl_WS_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD") && key.getl_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CD", key.getl_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_INST_START_DATE") && key.getl_OPR_INST_START_DATE() != null) {
					msgKey.setKeyValue("l_OPR_INST_START_DATE", key.getl_OPR_INST_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_WORK_ODR_DLV_DATE") && key.getl_WORK_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("l_WORK_ODR_DLV_DATE", key.getl_WORK_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_INST_QTY") && key.getl_OPR_INST_QTY() != null) {
					msgKey.setKeyValue("l_OPR_INST_QTY", key.getl_OPR_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_WORK_IN_PROC_COMMENT") && key.getl_WORK_IN_PROC_COMMENT() != null) {
					msgKey.setKeyValue("l_WORK_IN_PROC_COMMENT", key.getl_WORK_IN_PROC_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_INST_SLIP_ISS_DATE") && key.getl_OPR_INST_SLIP_ISS_DATE() != null) {
					msgKey.setKeyValue("l_OPR_INST_SLIP_ISS_DATE", key.getl_OPR_INST_SLIP_ISS_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_INST_SLIP_ISS_FLG") && key.getl_OPR_INST_SLIP_ISS_FLG() != null) {
					msgKey.setKeyValue("l_OPR_INST_SLIP_ISS_FLG", key.getl_OPR_INST_SLIP_ISS_FLG());
				}
				if(msgKeyType.containsKeyColumn("DRAW_CD") && key.getDRAW_CD() != null) {
					msgKey.setKeyValue("DRAW_CD", key.getDRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("SPEC") && key.getSPEC() != null) {
					msgKey.setKeyValue("SPEC", key.getSPEC());
				}
				if(msgKeyType.containsKeyColumn("l_STOCK_UNIT") && key.getl_STOCK_UNIT() != null) {
					msgKey.setKeyValue("l_STOCK_UNIT", key.getl_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT") && key.getl_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("l_MODIFY_COUNT", key.getl_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("l_CARD_PRINTED_FLG") && key.getl_CARD_PRINTED_FLG() != null) {
					msgKey.setKeyValue("l_CARD_PRINTED_FLG", key.getl_CARD_PRINTED_FLG());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE") && key.getOPR_INST_START_DATE() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATE", key.getOPR_INST_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE") && key.getWORK_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("WORK_ODR_DLV_DATE", key.getWORK_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_SLIP_ISS_FLG") && key.getOPR_INST_SLIP_ISS_FLG() != null) {
					msgKey.setKeyValue("OPR_INST_SLIP_ISS_FLG", key.getOPR_INST_SLIP_ISS_FLG());
				}
				if(msgKeyType.containsKeyColumn("DISPLAY_NAME") && key.getDISPLAY_NAME() != null) {
					msgKey.setKeyValue("DISPLAY_NAME", key.getDISPLAY_NAME());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
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
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_QTY") && key.getOPR_INST_QTY() != null) {
					msgKey.setKeyValue("OPR_INST_QTY", key.getOPR_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("IDENT_CARD_QTY") && key.getIDENT_CARD_QTY() != null) {
					msgKey.setKeyValue("IDENT_CARD_QTY", key.getIDENT_CARD_QTY());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD") && key.getOPR_INST_CD() != null) {
					msgKey.setKeyValue("OPR_INST_CD", key.getOPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("PKG_UNIT_QTY") && key.getPKG_UNIT_QTY() != null) {
					msgKey.setKeyValue("PKG_UNIT_QTY", key.getPKG_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("IDENT_CARD_CTL_NO") && key.getIDENT_CARD_CTL_NO() != null) {
					msgKey.setKeyValue("IDENT_CARD_CTL_NO", key.getIDENT_CARD_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("FIRST_IDENT_CARD_QTY") && key.getFIRST_IDENT_CARD_QTY() != null) {
					msgKey.setKeyValue("FIRST_IDENT_CARD_QTY", key.getFIRST_IDENT_CARD_QTY());
				}
				if(msgKeyType.containsKeyColumn("PRINT_QTY") && key.getPRINT_QTY() != null) {
					msgKey.setKeyValue("PRINT_QTY", key.getPRINT_QTY());
				}
				if(msgKeyType.containsKeyColumn("IDENT_CARD") && key.getIDENT_CARD() != null) {
					msgKey.setKeyValue("IDENT_CARD", key.getIDENT_CARD());
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
					AD0030040Struct key = new AD0030040Struct();
					if(msgKeyType.containsKeyColumn("r1_MODE")) {
						key.setr1_MODE(msgKey.getKeyValue("r1_MODE"));
					}
					if(msgKeyType.containsKeyColumn("c_RE_PRINT")) {
						key.setc_RE_PRINT(msgKey.getKeyValue("c_RE_PRINT"));
					}
					if(msgKeyType.containsKeyColumn("r2_MODE")) {
						key.setr2_MODE(msgKey.getKeyValue("r2_MODE"));
					}
					if(msgKeyType.containsKeyColumn("PRINT_PATTERN")) {
						key.setPRINT_PATTERN(msgKey.getKeyValue("PRINT_PATTERN"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_INST_SLIP_ISS_FLG_DN")) {
						key.setl_OPR_INST_SLIP_ISS_FLG_DN(msgKey.getKeyValue("l_OPR_INST_SLIP_ISS_FLG_DN"));
					}
					if(msgKeyType.containsKeyColumn("DATE")) {
						key.setDATE(msgKey.getKeyValue("DATE"));
					}
					if(msgKeyType.containsKeyColumn("TIME")) {
						key.setTIME(msgKey.getKeyValue("TIME"));
					}
					if(msgKeyType.containsKeyColumn("PAGE")) {
						key.setPAGE(msgKey.getKeyValue("PAGE"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_PAGE")) {
						key.setTOTAL_PAGE(msgKey.getKeyValue("TOTAL_PAGE"));
					}
					if(msgKeyType.containsKeyColumn("BARCODE1")) {
						key.setBARCODE1(msgKey.getKeyValue("BARCODE1"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_TIME")) {
						key.setOPR_INST_START_TIME(msgKey.getKeyValue("OPR_INST_START_TIME"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_TIME")) {
						key.setWORK_ODR_DLV_TIME(msgKey.getKeyValue("WORK_ODR_DLV_TIME"));
					}
					if(msgKeyType.containsKeyColumn("c_CARD_PRINT")) {
						key.setc_CARD_PRINT(msgKey.getKeyValue("c_CARD_PRINT"));
					}
					if(msgKeyType.containsKeyColumn("INST_PRINTED")) {
						key.setINST_PRINTED(msgKey.getKeyValue("INST_PRINTED"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO")) {
						key.setLOT_NO(msgKey.getKeyValue("LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("PARTIAL_PRD_NO")) {
						key.setPARTIAL_PRD_NO(msgKey.getKeyValue("PARTIAL_PRD_NO"));
					}
					if(msgKeyType.containsKeyColumn("OPR_DATE")) {
						key.setOPR_DATE(msgKey.getKeyValue("OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_WORK_ODR_CD")) {
						key.setl_WORK_ODR_CD(msgKey.getKeyValue("l_WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_WORK_IN_PROC_CD")) {
						key.setl_WORK_IN_PROC_CD(msgKey.getKeyValue("l_WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_PROC_NAME")) {
						key.setl_PROC_NAME(msgKey.getKeyValue("l_PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_PROC_NO")) {
						key.setl_PROC_NO(msgKey.getKeyValue("l_PROC_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_INST_CD")) {
						key.setl_OPR_INST_CD(msgKey.getKeyValue("l_OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_CD")) {
						key.setl_ITEM_CD(msgKey.getKeyValue("l_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_NAME")) {
						key.setl_ITEM_NAME(msgKey.getKeyValue("l_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_WS_CD")) {
						key.setl_WS_CD(msgKey.getKeyValue("l_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_WS_NAME")) {
						key.setl_WS_NAME(msgKey.getKeyValue("l_WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD")) {
						key.setl_JOB_ODR_CD(msgKey.getKeyValue("l_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_INST_START_DATE")) {
						key.setl_OPR_INST_START_DATE(msgKey.getKeyValue("l_OPR_INST_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_WORK_ODR_DLV_DATE")) {
						key.setl_WORK_ODR_DLV_DATE(msgKey.getKeyValue("l_WORK_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_INST_QTY")) {
						key.setl_OPR_INST_QTY(msgKey.getKeyValue("l_OPR_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_WORK_IN_PROC_COMMENT")) {
						key.setl_WORK_IN_PROC_COMMENT(msgKey.getKeyValue("l_WORK_IN_PROC_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_INST_SLIP_ISS_DATE")) {
						key.setl_OPR_INST_SLIP_ISS_DATE(msgKey.getKeyValue("l_OPR_INST_SLIP_ISS_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_INST_SLIP_ISS_FLG")) {
						key.setl_OPR_INST_SLIP_ISS_FLG(msgKey.getKeyValue("l_OPR_INST_SLIP_ISS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("DRAW_CD")) {
						key.setDRAW_CD(msgKey.getKeyValue("DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("SPEC")) {
						key.setSPEC(msgKey.getKeyValue("SPEC"));
					}
					if(msgKeyType.containsKeyColumn("l_STOCK_UNIT")) {
						key.setl_STOCK_UNIT(msgKey.getKeyValue("l_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT")) {
						key.setl_MODIFY_COUNT(msgKey.getKeyValue("l_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_CARD_PRINTED_FLG")) {
						key.setl_CARD_PRINTED_FLG(msgKey.getKeyValue("l_CARD_PRINTED_FLG"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE")) {
						key.setOPR_INST_START_DATE(msgKey.getKeyValue("OPR_INST_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE")) {
						key.setWORK_ODR_DLV_DATE(msgKey.getKeyValue("WORK_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_SLIP_ISS_FLG")) {
						key.setOPR_INST_SLIP_ISS_FLG(msgKey.getKeyValue("OPR_INST_SLIP_ISS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("DISPLAY_NAME")) {
						key.setDISPLAY_NAME(msgKey.getKeyValue("DISPLAY_NAME"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(msgKey.getKeyValue("OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
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
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_QTY")) {
						key.setOPR_INST_QTY(msgKey.getKeyValue("OPR_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("IDENT_CARD_QTY")) {
						key.setIDENT_CARD_QTY(msgKey.getKeyValue("IDENT_CARD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD")) {
						key.setOPR_INST_CD(msgKey.getKeyValue("OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("PKG_UNIT_QTY")) {
						key.setPKG_UNIT_QTY(msgKey.getKeyValue("PKG_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("IDENT_CARD_CTL_NO")) {
						key.setIDENT_CARD_CTL_NO(msgKey.getKeyValue("IDENT_CARD_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("FIRST_IDENT_CARD_QTY")) {
						key.setFIRST_IDENT_CARD_QTY(msgKey.getKeyValue("FIRST_IDENT_CARD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PRINT_QTY")) {
						key.setPRINT_QTY(msgKey.getKeyValue("PRINT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("IDENT_CARD")) {
						key.setIDENT_CARD(msgKey.getKeyValue("IDENT_CARD"));
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
