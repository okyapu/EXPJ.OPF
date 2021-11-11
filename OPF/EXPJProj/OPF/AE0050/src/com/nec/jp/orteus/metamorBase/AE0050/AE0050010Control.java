/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0050/src/com/nec/jp/orteus/metamorBase/AE0050/AE0050010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0050;

import com.nec.jp.orteus.metamorBase.AE0050.*;
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
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.metamorBase.common04.amount.AmountCalculator;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AE0050010Control
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
	protected List list; // �ꗗ�����̌��ʃ��X�g����ʂɕ\�����邽�߂̃��X�g�C���X�^���X

	// �f�t�H���g�A�N�Z�T���\�b�h
	public List getList() {
		return list;
	} // ���X�g��Ԃ��܂��B
	public void setList(List listname) {
		list = listname;
	} // ���X�g���Z�b�g���܂��B
	public int getListsize() { // ���X�g�^�̃T�C�Y��Ԃ��܂��B
		int nret = 0;
		if (list != null) {
			nret = list.size();
		}
		return nret;
	}
	//	public Object getListvalue(int x) { return list.get(x); }	// ���X�g�̒l��Ԃ��܂��B
	public AE0050010Struct getListvalue(int x) {
		return (AE0050010Struct) (list.get(x));
	} // ���X�g�̒l��Ԃ��܂��B
	public AE0050010Struct getStruct() {
		return struct;
	} // Struct��Ԃ��܂��B
	public AE0050010Struct createStruct() {
		return new AE0050010Struct();
	} // �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) {
		struct.setStruct((AE0050010Struct) structname);
	} // Struct���Z�b�g���܂��B
	public void initializeStruct() {
		struct.initialize();
	} // Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter() {
		return csvWriter;
	}

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr) {
		csvReader = cr;
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
	 * �Ɩ��G���[�������̃p�����[�^�ݒ菈����؂�o���Ċ֐���
	 * @param tableName �e�[�u����
	 * @param columnName �J������
	 * @param value �l
	 */
	private void setErrorParameter(String tableName, String columnName, String value) {
		StringBuffer param = new StringBuffer();
		param.append(tableName);
		param.append(".");
		param.append(columnName);
		param.append(":");
		if (value != null) {
			param.append(value);
		}

		ExpjMessage emsg = new ExpjMessage("ZZ01006", param.toString());
		msgStruct.addError(emsg);
		sysLog.warning(emsg, sysUSER_CD);
	}

	/**
	 * ��ʂ̑S���ڂ����������܂��B
	 */
	private void initializeAll() {
		struct.setPLANT_CD(sysPLANT_CD);
		struct.setSCDL_ISSUE_DATE(null);
		struct.setVEND_CD(null);
		struct.setr1_CONS_TYP("true");
		struct.setr2_CONS_TYP(null);
		struct.setr3_CONS_TYP(null);

		initializeDetail();
	}

	/**
	 * ��ʂ̏ڍ׍��ڂ����������܂��B
	 */
	private void initializeDetail() {

		list = null;

		readStatus = INITIAL;
	}

	private static String calcIssueInstAmount(
		String unitCost,
		String issueInstQty,
		String roundTyp,
		String decimalFig) {

		String consAmount = Calculate.multiply(unitCost, issueInstQty);
		consAmount = AmountCalculator.roundAmount(consAmount, roundTyp, decimalFig);

		return consAmount;
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
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * CSV�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCsvOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0050");
		logger.entering("AE0050010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");
			//{{user_implement_dev:<controlCsvOut>
		try {
			// �I�����ꂽ���W�I�{�^���ɂ��x���敪���Z�b�g
			if ("true".equals(struct.getr1_CONS_TYP())) {
				struct.setCONS_TYP("1");
			} else if ("true".equals(struct.getr2_CONS_TYP())) {
				struct.setCONS_TYP("2");
			} else {
				struct.setCONS_TYP(null);
			}
            
			//���͎����̃`�F�b�N(�����Ǘ�����ꍇ�̂�)
            if((struct.getTIME_CTRL()).equals("true")){
            	//�@�����\���(����)�̃`�F�b�N
                if((struct.getSCDL_ISSUE_TIME()).length() == 3 ){
                	//�R���͓��ɂO��t����
                    struct.setSCDL_ISSUE_TIME("0" + struct.getSCDL_ISSUE_TIME());
                }
            }else{
               struct.setSCDL_ISSUE_TIME("");
            }

            // �f�[�^�����N���A
            struct.setSCDL_ISSUE_DATE_ALL(null);

            // ���o�����i���t�̐ݒ�j
            if(null != struct.getTIME_CTRL() && "true".equals(struct.getTIME_CTRL())){

                if (struct.getSCDL_ISSUE_DATE() != null && !struct.getSCDL_ISSUE_DATE().equals("")) {
                    //�����\����̎�����00:00�ȊO�̏ꍇ�˂��̂܂܌���
                    if (struct.getSCDL_ISSUE_TIME() != null && !struct.getSCDL_ISSUE_TIME().equals("")) {
                        /** �����\����i�����܂ށj*/
                        struct.setSCDL_ISSUE_DATE_ALL(struct.getSCDL_ISSUE_DATE() + " " + 
                                       struct.getSCDL_ISSUE_TIME().substring(0,2) + ":" + 
                                       struct.getSCDL_ISSUE_TIME().substring(2));
                    }else{
                    //�����\����̎����������͂̏ꍇ��23:59�Ō���
                        /** �����\����i�����܂ށj*/
                        struct.setSCDL_ISSUE_DATE_ALL(struct.getSCDL_ISSUE_DATE() + " 23:59");
                    }
                }
            }else{
                if (struct.getSCDL_ISSUE_DATE() != null && !struct.getSCDL_ISSUE_DATE().equals("")) {
                    /** �����\����i�����܂ށj*/
                    struct.setSCDL_ISSUE_DATE_ALL(struct.getSCDL_ISSUE_DATE() + " 23:59");
                }
            }

			// CSV�����擾
			List readList = entity.mCsv.read(conn, struct);

			// �Ώۃf�[�^��0���̏ꍇ
			if (readList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setErrorParameter("T_ISSUE_INST", "PLANT_CD", struct.getPLANT_CD());
				setErrorParameter("T_ISSUE_INST", "SCDL_ISSUE_DATE", struct.getSCDL_ISSUE_DATE());
				setErrorParameter("T_ISSUE_INST", "VEND_CD", struct.getVEND_CD());
				setErrorParameter("T_ISSUE_INST", "CONS_TYP", struct.getCONS_TYP());
				return;
			}

			// CSV���̍쐬
			List csvList = new ArrayList();
			String[] title =
				{
					"Expj.PLANT_CD" ,
					"Expj.PLANT_NAME" ,
					"Expj.VEND_CD" ,
					"Expj.VEND_NAME" ,
					"Expj.ITEM_CD" ,
					"Expj.ITEM_NAME" ,
					"Expj.JOB_ODR_CD" ,
					"Expj.CONS_TYP" ,
					"Expj.Cmt1046" ,
					"Expj.Cmt1050" ,
					"Expj.Cmt1049" ,
					"Expj.Cmt1047" ,
					"Expj.STOCK_UNIT" ,
					"Expj.UNIT_COST_4" ,
					"Expj.Cmt1048" ,
					"Expj.CUR_UNIT" ,
					"Expj.CREATED_DATE" ,
					"Expj.CREATED_BY" ,
					"Expj.CREATED_PRG_NM" 
					};
			csvList.add(title);
			for (int i = 0; i < readList.size(); i++) {
				AE0050010Struct csvStruct = (AE0050010Struct) readList.get(i);
				String[] csvStr = new String[title.length];

				csvStr[0] = csvStruct.getPLANT_CD();
				csvStr[1] = csvStruct.getPLANT_NAME();
				csvStr[2] = csvStruct.getVEND_CD();
				csvStr[3] = csvStruct.getVEND_NAME();
				csvStr[4] = csvStruct.getITEM_CD();
				csvStr[5] = csvStruct.getITEM_NAME();
				csvStr[6] = csvStruct.getJOB_ODR_CD();
				csvStr[7] = csvStruct.getCONS_TYP();
				csvStr[8] = multcombo("CONS_TYP",csvStruct.getCONS_TYP());
				
				
				//���͎����̃`�F�b�N(�����Ǘ�����ꍇ�̂�)
            	if((struct.getTIME_CTRL()).equals("true")){
            		//�@�����\���(����)�̃`�F�b�N
                	if((struct.getSCDL_ISSUE_TIME()).length() == 3 ){
                		//�R���͓��ɂO��t����
                    	struct.setSCDL_ISSUE_TIME("0" + struct.getSCDL_ISSUE_TIME());
                		
                	}
            		csvStr[9] = csvStruct.getSCDL_ISSUE_DATE() + " " + csvStruct.getSCDL_ISSUE_TIME();
            	}else{
           	    	struct.setSCDL_ISSUE_TIME("");
            		csvStr[9] = csvStruct.getSCDL_ISSUE_DATE();
            	}
				
				
				csvStr[10] = csvStruct.getISSUE_INST_QTY();
				csvStr[11] = csvStruct.getTOTAL_ISSUE_QTY();
				csvStr[12] = csvStruct.getSTOCK_UNIT();
				csvStr[13] = csvStruct.getUNIT_COST();
				csvStr[14] =
					calcIssueInstAmount(
						csvStruct.getUNIT_COST(),
						csvStruct.getISSUE_INST_QTY(),
						csvStruct.getROUND_TYP(),
						csvStruct.getDECIMAL_FIG());
				csvStr[15] = csvStruct.getCUR_UNIT();
				csvStr[16] = csvStruct.getBUSINESS_OPR_DATE();
				csvStr[17] = sysUSER_CD;
				csvStr[18] = sp.getProcId();
				csvList.add(csvStr);
			}

			if (csvList != null && !csvList.isEmpty()) {
				csvWriter = new CsvWriter(CsvWriter.getFileName(sysUSER_CD));
				csvWriter.write(csvList, CoreTools.getLocale(struct.getsUser_ID()),true);
				struct.setDOWNLOAD_FILE(csvWriter.getFilePath());
			}
		} catch (SQLException e) {
			throw new ExpjException(e);
		}
                //}}user_implement_dev:<controlCsvOut>
		logger.exiting("AE0050010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");

		return;
	}

	/**
	 * ���[�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlPrint() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0050");
		logger.entering("AE0050010Control"+":USER="+struct.getsUser_ID(),"controlPrint");
			AE0050010Struct strPdf = null;

		int ret = 0;
		String printType      = getPdfOutputType();
		String printPattern   = getPdfOutputListPattern();
		String printer        = getPdfOutputPrinter();
		SvfWrapper svf        = new SvfWrapper(printType, getsysUSER_CD(), printer);

			//{{user_implement_dev:<controlPrint>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			// �I�����ꂽ���W�I�{�^���ɂ��x���敪���Z�b�g
			if ("true".equals(struct.getr1_CONS_TYP())) {
				struct.setCONS_TYP("1");
			} else if ("true".equals(struct.getr2_CONS_TYP())) {
				struct.setCONS_TYP("2");
			} else {
				struct.setCONS_TYP(null);
			}
			struct.setDOWNLOAD_FILE(null);	// �_�E�����[�h�t�@�C�����N���A
			String printId1 = "AE00500101";           //���[ID���w�肵�Ă�������
			
		    ret = svf.VrInit(printId1); // PDF�쐬�J�n
			pdfFilePath = svf.getPdfFilePath(); // pdf�t���p�X�t�@�C����
			pdfFileName = svf.getPdfFileName(); // pdf�t�@�C�����iWeb�p�j
			 /*�N�G���[�t�@�C���̎w��*/
			if (dbKIND != null && !dbKIND.equals("")) {
				ret = svf.VrSetQuery("KIND=" + dbKIND + ";UID=" + dbUID
						+ ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);
			} else {
				ret = svf.VrSetQuery("UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ="
						+ dbDBQ);
			}
			
			//���͎����̃`�F�b�N(�����Ǘ�����ꍇ�̂�)
            if((struct.getTIME_CTRL()).equals("true")){
            	//�@�����\���(����)�̃`�F�b�N
               	if((struct.getSCDL_ISSUE_TIME()).length() == 3 ){
               		//�R���͓��ɂO��t����
                   	struct.setSCDL_ISSUE_TIME("0" + struct.getSCDL_ISSUE_TIME());
               	}
            }else{
           	   	struct.setSCDL_ISSUE_TIME("");
            }
			
            // �f�[�^�����N���A
            struct.setSCDL_ISSUE_DATE_ALL(null);

            // ���o�����i���t�̐ݒ�j
            if(null != struct.getTIME_CTRL() && "true".equals(struct.getTIME_CTRL())){

                if (struct.getSCDL_ISSUE_DATE() != null && !struct.getSCDL_ISSUE_DATE().equals("")) {
                    //�����\����̎�����00:00�ȊO�̏ꍇ�˂��̂܂܌���
                    if (struct.getSCDL_ISSUE_TIME() != null && !struct.getSCDL_ISSUE_TIME().equals("")) {
                        /** �����\����i�����܂ށj*/
                        struct.setSCDL_ISSUE_DATE_ALL(struct.getSCDL_ISSUE_DATE() + " " + 
                                       struct.getSCDL_ISSUE_TIME().substring(0,2) + ":" + 
                                       struct.getSCDL_ISSUE_TIME().substring(2));
                    }else{
                    //�����\����̎����������͂̏ꍇ��23:59�Ō���
                        /** �����\����i�����܂ށj*/
                        struct.setSCDL_ISSUE_DATE_ALL(struct.getSCDL_ISSUE_DATE() + " 23:59");
                    }
                }
            }else{
                if (struct.getSCDL_ISSUE_DATE() != null && !struct.getSCDL_ISSUE_DATE().equals("")) {
                    /** �����\����i�����܂ށj*/
                    struct.setSCDL_ISSUE_DATE_ALL(struct.getSCDL_ISSUE_DATE() + " 23:59");
                }
            }

			/* �u���[�o�́v�{�^�����������ꂽ�ꍇ*/

            // �H��R�[�h
		    ret = svf.VrCondition("[X|PLANT_CD]=" + struct.getPLANT_CD(), 4);
			
		    // �o�ɗ\���
		    ret = svf.VrCondition("[X|SCDL_ISSUE_DATE]=" + struct.getSCDL_ISSUE_DATE_ALL(), 4);
			
			
			// ��ԋ敪
		    if (struct.getCONS_TYP() == null|| "".equals(struct.getCONS_TYP())) {
				ret = svf.VrCondition("[X|CONS_TYP]=" + "%", 4);
			} else {
				ret = svf.VrCondition("[X|CONS_TYP]=" + struct.getCONS_TYP(), 4);
			}
			// �����R�[�h
			if (struct.getVEND_CD() == null|| "".equals(struct.getVEND_CD())) {
				ret = svf.VrCondition("[X|VEND_CD]=" + "%", 4);
			} else {
				ret = svf.VrCondition("[X|VEND_CD]=" + struct.getVEND_CD(), 4);
			}
				
			 /*�N�G���[���s*/
			ret = svf.VrReport();
			if (ret == -554) {
				ExpjMessage emsg = new ExpjMessage("ZZ06001");
				msgStruct.addError(emsg);
				sysLog.warning(emsg, sysUSER_CD);
				return;
			}

			 /*PDF�쐬�I�� */
			ret = svf.VrQuit();
			if ("0".equals(printType)) { // �N���C�A���g����̏ꍇ
				struct.setDOWNLOAD_FILE(getPdfFileName());
			} else if ("1".equals(printType)) {
				try {
					String acrobatPath = svf.getAcrobatPath();
					String acrobatOption1 = svf.getAcrobatOption1();
					String acrobatOption2 = svf.getAcrobatOption2();
					String pdfPrinter = svf.getPrinter();
					Runtime.getRuntime().exec(new String[]{acrobatPath, acrobatOption1, acrobatOption2, pdfFilePath, pdfPrinter});
					//Runtime.getRuntime().exec(svf.getExecuteOutput());
				} catch (IOException e) {
					// �T�[�o������s���̃G���[�������L�q���Ă��������B
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			setErrorMessage("ZZ01106");
		} 
                //}}user_implement_dev:<controlPrint>
		logger.exiting("AE0050010Control"+":USER="+struct.getsUser_ID(),"controlPrint");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0050");
		logger.entering("AE0050010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
				try{
					readStatus = INITIAL;
	                // ��ʂ�������
	                initializeAll();
					// �V�X�e���p�����[�^�iTIME_CTRL�j�擾
					AE0050010Struct TIME_CTRLStruct = new AE0050010Struct();
					List TIME_CTRLList = entity.mSELECT_TIME_CTRL.read(conn, TIME_CTRLStruct);
					if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
						TIME_CTRLStruct = (AE0050010Struct)TIME_CTRLList.get(0);
						struct.setTIME_CTRL(TIME_CTRLStruct.getTIME_CTRL());
					}else{
						struct.setTIME_CTRL(null);
					}
				} catch(SQLException e) {
					e.printStackTrace();
					// �G���[�������L�q���Ă��������B
					// 
				}
                //}}user_implement_dev:<controlClear>
		logger.exiting("AE0050010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0050");
		logger.entering("AE0050010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
		// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AE0050010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0050");
		logger.entering("AE0050010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			try{
				readStatus = INITIAL;
                // ��ʂ�������
                initializeAll();
				// �V�X�e���p�����[�^�iTIME_CTRL�j�擾
				AE0050010Struct TIME_CTRLStruct = new AE0050010Struct();
				List TIME_CTRLList = entity.mSELECT_TIME_CTRL.read(conn, TIME_CTRLStruct);
				if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
					TIME_CTRLStruct = (AE0050010Struct)TIME_CTRLList.get(0);
					struct.setTIME_CTRL(TIME_CTRLStruct.getTIME_CTRL());
				}else{
					struct.setTIME_CTRL(null);
				}
			} catch(SQLException e) {
				e.printStackTrace();
				// �G���[�������L�q���Ă��������B
				// 
			}
		// ��ʑJ�ڂ̌Ăяo����������AStruct�ɉ�ʑJ�ڃL�[��ݒ肵��controlselect()���Ăяo��
		if (isScreenMove() == true) {
			// �L�[�ƂȂ鍀�ڂ�struct�Ɋi�[���āA�����̃R���g���[�����\�b�h���Ăяo���܂��B
		}
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AE0050010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0050");
		logger.entering("AE0050010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
		// �_�E�����[�h�t�@�C�����N���A
		// PDF�ECSV�̃_�E�����[�h���s���Ƃ��́A��ʏ��OrHidden�ŁuDOWNLOAD_FILE�v���`���A���̍s�̃R�����g���O���Ă��������B
		//struct.setDOWNLOAD_FILE(null);
		// �R���{�{�b�N�X���i�̃f�[�^�̃Z�b�g�͂����ɋL�q���Ă��������B
		// �R���{�{�b�N�X�f�[�^�p��
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AE0050010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("CsvOut") ) {
				controlCsvOut();
			} else if( button.equals("Print") ) {
				controlPrint();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// �g���b�Z�[�W�o�͈˗��쐬
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AE0050010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0050010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AE0050010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0050010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AE0050010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0050010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AE0050010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AE0050010Entity entity;
	protected AE0050010Struct struct;
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

		entity = new AE0050010Entity();
		struct = new AE0050010Struct();

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
	 * AE0050010�N���X�̕W���R���X�g���N�^
	 */
	public AE0050010Control() throws BusinessProcessException, FoundationException
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
				AE0050010Struct key = (AE0050010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("r1_CONS_TYP") && key.getr1_CONS_TYP() != null) {
					msgKey.setKeyValue("r1_CONS_TYP", key.getr1_CONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("r2_CONS_TYP") && key.getr2_CONS_TYP() != null) {
					msgKey.setKeyValue("r2_CONS_TYP", key.getr2_CONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("r3_CONS_TYP") && key.getr3_CONS_TYP() != null) {
					msgKey.setKeyValue("r3_CONS_TYP", key.getr3_CONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_NAME") && key.getVEND_NAME() != null) {
					msgKey.setKeyValue("VEND_NAME", key.getVEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("CONS_TYP") && key.getCONS_TYP() != null) {
					msgKey.setKeyValue("CONS_TYP", key.getCONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("SCDL_ISSUE_DATE") && key.getSCDL_ISSUE_DATE() != null) {
					msgKey.setKeyValue("SCDL_ISSUE_DATE", key.getSCDL_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("SCDL_ISSUE_TIME") && key.getSCDL_ISSUE_TIME() != null) {
					msgKey.setKeyValue("SCDL_ISSUE_TIME", key.getSCDL_ISSUE_TIME());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_QTY") && key.getISSUE_INST_QTY() != null) {
					msgKey.setKeyValue("ISSUE_INST_QTY", key.getISSUE_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY") && key.getTOTAL_ISSUE_QTY() != null) {
					msgKey.setKeyValue("TOTAL_ISSUE_QTY", key.getTOTAL_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST") && key.getUNIT_COST() != null) {
					msgKey.setKeyValue("UNIT_COST", key.getUNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("CUR_UNIT") && key.getCUR_UNIT() != null) {
					msgKey.setKeyValue("CUR_UNIT", key.getCUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("DECIMAL_FIG") && key.getDECIMAL_FIG() != null) {
					msgKey.setKeyValue("DECIMAL_FIG", key.getDECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("ROUND_TYP") && key.getROUND_TYP() != null) {
					msgKey.setKeyValue("ROUND_TYP", key.getROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("SCDL_ISSUE_DATE_ALL") && key.getSCDL_ISSUE_DATE_ALL() != null) {
					msgKey.setKeyValue("SCDL_ISSUE_DATE_ALL", key.getSCDL_ISSUE_DATE_ALL());
				}
				if(msgKeyType.containsKeyColumn("T_ISSUE_INST__PLANT_CD") && key.getT_ISSUE_INST__PLANT_CD() != null) {
					msgKey.setKeyValue("T_ISSUE_INST__PLANT_CD", key.getT_ISSUE_INST__PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("M_PLANT__PLANT_NAME") && key.getM_PLANT__PLANT_NAME() != null) {
					msgKey.setKeyValue("M_PLANT__PLANT_NAME", key.getM_PLANT__PLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("T_ISSUE_INST__VEND_CD") && key.getT_ISSUE_INST__VEND_CD() != null) {
					msgKey.setKeyValue("T_ISSUE_INST__VEND_CD", key.getT_ISSUE_INST__VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("M_VEND_CTRL__VEND_NAME") && key.getM_VEND_CTRL__VEND_NAME() != null) {
					msgKey.setKeyValue("M_VEND_CTRL__VEND_NAME", key.getM_VEND_CTRL__VEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("T_ISSUE_INST__ITEM_CD") && key.getT_ISSUE_INST__ITEM_CD() != null) {
					msgKey.setKeyValue("T_ISSUE_INST__ITEM_CD", key.getT_ISSUE_INST__ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("M_ITEM__ITEM_NAME") && key.getM_ITEM__ITEM_NAME() != null) {
					msgKey.setKeyValue("M_ITEM__ITEM_NAME", key.getM_ITEM__ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("T_OD__JOB_ODR_CD") && key.getT_OD__JOB_ODR_CD() != null) {
					msgKey.setKeyValue("T_OD__JOB_ODR_CD", key.getT_OD__JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("SYS_TYPE_VALUE__DISPLAY_NAME") && key.getSYS_TYPE_VALUE__DISPLAY_NAME() != null) {
					msgKey.setKeyValue("SYS_TYPE_VALUE__DISPLAY_NAME", key.getSYS_TYPE_VALUE__DISPLAY_NAME());
				}
				if(msgKeyType.containsKeyColumn("T_ISSUE_INST__SCDL_ISSUE_DATE") && key.getT_ISSUE_INST__SCDL_ISSUE_DATE() != null) {
					msgKey.setKeyValue("T_ISSUE_INST__SCDL_ISSUE_DATE", key.getT_ISSUE_INST__SCDL_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("T_ISSUE_INST__ISSUE_INST_QTY") && key.getT_ISSUE_INST__ISSUE_INST_QTY() != null) {
					msgKey.setKeyValue("T_ISSUE_INST__ISSUE_INST_QTY", key.getT_ISSUE_INST__ISSUE_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("T_ISSUE_INST__TOTAL_ISSUE_QTY") && key.getT_ISSUE_INST__TOTAL_ISSUE_QTY() != null) {
					msgKey.setKeyValue("T_ISSUE_INST__TOTAL_ISSUE_QTY", key.getT_ISSUE_INST__TOTAL_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("M_ITEM__STOCK_UNIT") && key.getM_ITEM__STOCK_UNIT() != null) {
					msgKey.setKeyValue("M_ITEM__STOCK_UNIT", key.getM_ITEM__STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("M_CONS_UNIT_COST__UNIT_COST") && key.getM_CONS_UNIT_COST__UNIT_COST() != null) {
					msgKey.setKeyValue("M_CONS_UNIT_COST__UNIT_COST", key.getM_CONS_UNIT_COST__UNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("M_CUR__CUR_UNIT") && key.getM_CUR__CUR_UNIT() != null) {
					msgKey.setKeyValue("M_CUR__CUR_UNIT", key.getM_CUR__CUR_UNIT());
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
					AE0050010Struct key = new AE0050010Struct();
					if(msgKeyType.containsKeyColumn("r1_CONS_TYP")) {
						key.setr1_CONS_TYP(msgKey.getKeyValue("r1_CONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("r2_CONS_TYP")) {
						key.setr2_CONS_TYP(msgKey.getKeyValue("r2_CONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("r3_CONS_TYP")) {
						key.setr3_CONS_TYP(msgKey.getKeyValue("r3_CONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_NAME")) {
						key.setVEND_NAME(msgKey.getKeyValue("VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("CONS_TYP")) {
						key.setCONS_TYP(msgKey.getKeyValue("CONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SCDL_ISSUE_DATE")) {
						key.setSCDL_ISSUE_DATE(msgKey.getKeyValue("SCDL_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SCDL_ISSUE_TIME")) {
						key.setSCDL_ISSUE_TIME(msgKey.getKeyValue("SCDL_ISSUE_TIME"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_QTY")) {
						key.setISSUE_INST_QTY(msgKey.getKeyValue("ISSUE_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY")) {
						key.setTOTAL_ISSUE_QTY(msgKey.getKeyValue("TOTAL_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST")) {
						key.setUNIT_COST(msgKey.getKeyValue("UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("CUR_UNIT")) {
						key.setCUR_UNIT(msgKey.getKeyValue("CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("DECIMAL_FIG")) {
						key.setDECIMAL_FIG(msgKey.getKeyValue("DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("ROUND_TYP")) {
						key.setROUND_TYP(msgKey.getKeyValue("ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SCDL_ISSUE_DATE_ALL")) {
						key.setSCDL_ISSUE_DATE_ALL(msgKey.getKeyValue("SCDL_ISSUE_DATE_ALL"));
					}
					if(msgKeyType.containsKeyColumn("T_ISSUE_INST__PLANT_CD")) {
						key.setT_ISSUE_INST__PLANT_CD(msgKey.getKeyValue("T_ISSUE_INST__PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("M_PLANT__PLANT_NAME")) {
						key.setM_PLANT__PLANT_NAME(msgKey.getKeyValue("M_PLANT__PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("T_ISSUE_INST__VEND_CD")) {
						key.setT_ISSUE_INST__VEND_CD(msgKey.getKeyValue("T_ISSUE_INST__VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("M_VEND_CTRL__VEND_NAME")) {
						key.setM_VEND_CTRL__VEND_NAME(msgKey.getKeyValue("M_VEND_CTRL__VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("T_ISSUE_INST__ITEM_CD")) {
						key.setT_ISSUE_INST__ITEM_CD(msgKey.getKeyValue("T_ISSUE_INST__ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("M_ITEM__ITEM_NAME")) {
						key.setM_ITEM__ITEM_NAME(msgKey.getKeyValue("M_ITEM__ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("T_OD__JOB_ODR_CD")) {
						key.setT_OD__JOB_ODR_CD(msgKey.getKeyValue("T_OD__JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("SYS_TYPE_VALUE__DISPLAY_NAME")) {
						key.setSYS_TYPE_VALUE__DISPLAY_NAME(msgKey.getKeyValue("SYS_TYPE_VALUE__DISPLAY_NAME"));
					}
					if(msgKeyType.containsKeyColumn("T_ISSUE_INST__SCDL_ISSUE_DATE")) {
						key.setT_ISSUE_INST__SCDL_ISSUE_DATE(msgKey.getKeyValue("T_ISSUE_INST__SCDL_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("T_ISSUE_INST__ISSUE_INST_QTY")) {
						key.setT_ISSUE_INST__ISSUE_INST_QTY(msgKey.getKeyValue("T_ISSUE_INST__ISSUE_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("T_ISSUE_INST__TOTAL_ISSUE_QTY")) {
						key.setT_ISSUE_INST__TOTAL_ISSUE_QTY(msgKey.getKeyValue("T_ISSUE_INST__TOTAL_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("M_ITEM__STOCK_UNIT")) {
						key.setM_ITEM__STOCK_UNIT(msgKey.getKeyValue("M_ITEM__STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("M_CONS_UNIT_COST__UNIT_COST")) {
						key.setM_CONS_UNIT_COST__UNIT_COST(msgKey.getKeyValue("M_CONS_UNIT_COST__UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("M_CUR__CUR_UNIT")) {
						key.setM_CUR__CUR_UNIT(msgKey.getKeyValue("M_CUR__CUR_UNIT"));
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
