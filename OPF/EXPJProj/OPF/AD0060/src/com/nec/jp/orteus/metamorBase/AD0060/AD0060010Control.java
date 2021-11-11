/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0060/src/com/nec/jp/orteus/metamorBase/AD0060/AD0060010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0060;

import com.nec.jp.orteus.metamorBase.AD0060.*;
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
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.LotCtrl;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AD0060010Control
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
	public AD0060010Struct getListvalue(int x) { return (AD0060010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AD0060010Struct getStruct() { return this.struct; }	// Struct��Ԃ��܂��B
	public AD0060010Struct createStruct() { return new AD0060010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AD0060010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

	// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������

        /**
         * ��ʑJ�ڃL�[(���i�[�Ǘ��ԍ�)
         */
	private String _IdentCardCtlNo;

        /**
         * ��ʑJ�ڃL�[(���i�[�Ǘ��ԍ�)�ݒ�
         * @param cd ���i�[�Ǘ��ԍ�
         */
	protected void setIdentCardCtlNo(String cd){ _IdentCardCtlNo = cd; };

        /**
         * ��ʑJ�ڃL�[(���i�[�Ǘ��ԍ�)�擾
         * @return ���i�[�Ǘ��ԍ�
         */
	protected String getIdentCardCtlNo(){ return _IdentCardCtlNo; };

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

	/** ���b�g�Ǘ������σ`�F�b�N **/
	private boolean lotCtrlFlg = false;
	
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0060");
		logger.entering("AD0060010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			ResourceBundle bundle = SystemConfig.getBundle();
			dbUID = SystemConfig.getProperty("CONNECT_DBUSER", bundle);
			dbPWD = SystemConfig.getProperty("CONNECT_DBPASS", bundle);
			dbDBQ = SystemConfig.getProperty("CONNECT_DBHOST", bundle);
			dbKIND = SystemConfig.getProperty("CONNECT_KIND", bundle);
		} catch(MissingResourceException e) {
			e.printStackTrace();
		}
		try {

			_IdentCardCtlNo = struct.getIDENT_CARD_CTL_NO();//���i�[�Ǘ��ԍ�

			struct.initialize();

			// �Ǎ��X�e�[�^�X�ݒ�
			setReadStatus(INITIAL);

			AD0060010Struct IdentCardStruct = new AD0060010Struct();

			IdentCardStruct.setIDENT_CARD_CTL_NO(_IdentCardCtlNo);
			struct.setIDENT_CARD_CTL_NO(_IdentCardCtlNo);

			//���i�[�Ǎ�����
			List list_temp = entity.mselect.read(conn, IdentCardStruct);

			//�f�[�^�̑��݃`�F�b�N���s��
			if (list_temp.size()==0||list_temp.isEmpty()){
				setErrorMessage("ZZ06001");
				// ������ԁuO���Ǎ��v�ɐݒ�
				setReadStatus(NOT_FOUND);
				return;
			}

			IdentCardStruct = (AD0060010Struct) list_temp.get(0);

			//�H��R�[�h�����O�C�����[�U�̍H�ꂩ�`�F�b�N���s��
			if (!this.sysPLANT_CD.equals(IdentCardStruct.getPLANT_CD())){
				setErrorMessage("AE05002");
				return;
			}

			//�폜�t���O��1:�폜���`�F�b�N���s��
			if ("1".equals(IdentCardStruct.getDEL_FLG())){
				setErrorMessage("KZ10002");
				return;
			}

			struct.setIDENT_CARD_CTL_NO(_IdentCardCtlNo);
			struct.setT_IDENT_CARD_CTL_NO(_IdentCardCtlNo);
			struct.setOPR_INST_CD(IdentCardStruct.getOPR_INST_CD());
			struct.setPARTIAL_PRD_NO(IdentCardStruct.getPARTIAL_PRD_NO());
			struct.setITEM_CD(IdentCardStruct.getITEM_CD());
			struct.setITEM_NAME(IdentCardStruct.getITEM_NAME());
			struct.setWS_CD(IdentCardStruct.getWS_CD());
			struct.setWS_NAME(IdentCardStruct.getWS_NAME());
			struct.setOPR_DATE(IdentCardStruct.getOPR_DATE());
			struct.setFIRST_IDENT_CARD_QTY(IdentCardStruct.getFIRST_IDENT_CARD_QTY());
			struct.setIDENT_CARD_QTY(IdentCardStruct.getIDENT_CARD_QTY());
			struct.setORI_IDENT_CARD_QTY(IdentCardStruct.getIDENT_CARD_QTY());
			struct.setPKG_UNIT_QTY(IdentCardStruct.getPKG_UNIT_QTY());
			struct.setPLANT_CD(IdentCardStruct.getPLANT_CD());
			struct.setDEL_FLG(IdentCardStruct.getDEL_FLG());
			struct.setMODIFY_COUNT(IdentCardStruct.getMODIFY_COUNT());
			struct.seth_UNIT_QTY_TYP(IdentCardStruct.geth_UNIT_QTY_TYP());
			struct.setJOB_ODR_CD(IdentCardStruct.getJOB_ODR_CD());
			// ���b�g�����ꍇ
			if(lotCtrlFlg) {
				struct.setLOT_NO(IdentCardStruct.getLOT_NO());
			}
			
			String pageno = Calculate.divide(IdentCardStruct.getIDENT_CARD_QTY(), IdentCardStruct.getPKG_UNIT_QTY(), 0, Calculate.FLOOR);

			double bunshi = Double.parseDouble(IdentCardStruct.getIDENT_CARD_QTY());
			double bunbo = Double.parseDouble(IdentCardStruct.getPKG_UNIT_QTY());
			double overno;

			//���i�[���ʁ��׎p�P�ʐ��ʂ̗]������߂�
			overno = bunshi % bunbo;

			//���y�[�W���̎Z�o
			if (0 < overno){
				//�]�肪����ꍇ�A�P�����Z
				pageno = Calculate.add(pageno, "1");
			}

			struct.setPRINT_QTY(pageno);

			// �Ǎ��X�e�[�^�X�ݒ�
			setReadStatus(NORMAL);

		} catch(SQLException e) {
			// �Ǎ��X�e�[�^�X�ݒ�
			setReadStatus(ERROR);
			throw new ExpjException(e);
		}
                //}}user_implement_dev:<controlselect>
		logger.exiting("AD0060010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0060");
		logger.entering("AD0060010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try{
			struct.initialize();

			// �Ǎ��X�e�[�^�X�ݒ�
			setReadStatus(INITIAL);

		}catch(Exception e){
			throw new ExpjException(e);
		}
                //}}user_implement_dev:<controlclear>
		logger.exiting("AD0060010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0060");
		logger.entering("AD0060010Control"+":USER="+struct.getsUser_ID(),"controlclose");
			//{{user_implement_dev:<controlclose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlclose>
		logger.exiting("AD0060010Control"+":USER="+struct.getsUser_ID(),"controlclose");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlPrint() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0060");
		logger.entering("AD0060010Control"+":USER="+struct.getsUser_ID(),"controlPrint");
			AD0060010Struct strPdf = null;

		int ret = 0;
		String printType      = getPdfOutputType();
		String printPattern   = getPdfOutputListPattern();
		String printer        = getPdfOutputPrinter();
		SvfWrapper svf        = new SvfWrapper(printType, getsysUSER_CD(), printer);

			//{{user_implement_dev:<controlPrint>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			String printId1 = "AD00600101";		// TODO: ���[ID���w�肵�Ă�������

			ret = svf.VrInit(printId1);	// PDF�쐬�J�n
			pdfFilePath = svf.getPdfFilePath();	// pdf�t���p�X�t�@�C����
			pdfFileName = svf.getPdfFileName();	// pdf�t�@�C�����iWeb�p�j
			queryFileName = svf.getQueryFileName();	// query�t�@�C����

			int nRet = 0;
			long lngModifyCount = 0;

			conn.beginTransWeb();		// �g�����U�N�V�����J�n

			AD0060010Struct IdentCardStruct = new AD0060010Struct();

			IdentCardStruct.setUPD_IDENT_CARD_QTY(struct.getIDENT_CARD_QTY());
			IdentCardStruct.setUPD_PRINT_QTY(struct.getPRINT_QTY());
			IdentCardStruct.setUPD_UPDATED_BY(this.sysUSER_CD);
			IdentCardStruct.setUPD_UPDATED_PRG_NM(this.sp.getProcId());
			IdentCardStruct.setUPD_IDENT_CARD_CTL_NO(struct.getT_IDENT_CARD_CTL_NO());
			IdentCardStruct.setUPD_MODIFY_COUNT(struct.getMODIFY_COUNT());
			//�����̍ĕ\���p�ɍX�V����ۑ�
			lngModifyCount = Long.parseLong(struct.getMODIFY_COUNT());

			//���i�[�̍X�V
			nRet = entity.mUpdateIdentCard.update(conn,IdentCardStruct);
			if (nRet!=1) {
				setErrorMessage("ZZ01105");
				this.struct.setIDENT_CARD_CTL_NO(_IdentCardCtlNo);
				return;
			}

			conn.commit();

			//����O���[�v�ԍ��̐V�K�̔�
			ManagementNumber mngNumber = new ManagementNumber();
			String strPrintGrpNo = mngNumber.getSequenceNo("SEQ_ICT");
			mngNumber = null;

			AD0060010Struct InsIdentCardTempStruct = new AD0060010Struct();

			InsIdentCardTempStruct.setTMP_IDENT_CARD_CTL_NO(this.struct.getT_IDENT_CARD_CTL_NO());

			List list_temp = entity.mSelectIdentCardForPrint.read(conn, InsIdentCardTempStruct);

			AD0060010Struct IdentCardTempStruct = new AD0060010Struct();

			//���i�[�̌������ʂ̃`�F�b�N
			if (list_temp.size()==0||list_temp.isEmpty()){
				setErrorMessage("ZZ11001");
				this.struct.setIDENT_CARD_CTL_NO(_IdentCardCtlNo);
				return;
			}else{
				//���i�[�̌������ʂ��i�[����
				InsIdentCardTempStruct = (AD0060010Struct) list_temp.get(0);
				IdentCardTempStruct.setINS_PRINT_GRP_NO(strPrintGrpNo);
				IdentCardTempStruct.setINS_IDENT_CARD_CTL_NO(InsIdentCardTempStruct.getTMP_IDENT_CARD_CTL_NO());
				IdentCardTempStruct.setINS_OPR_INST_CD(InsIdentCardTempStruct.getTMP_OPR_INST_CD());
				IdentCardTempStruct.setINS_PARTIAL_PRD_NO(InsIdentCardTempStruct.getTMP_PARTIAL_PRD_NO());
				IdentCardTempStruct.setINS_RCV_ISSUE_CTRL_CD(InsIdentCardTempStruct.getTMP_RCV_ISSUE_CTRL_CD());
				IdentCardTempStruct.setINS_ITEM_CD(InsIdentCardTempStruct.getTMP_ITEM_CD());
				IdentCardTempStruct.setINS_JOB_ODR_CD(InsIdentCardTempStruct.getTMP_JOB_ODR_CD());
				IdentCardTempStruct.setINS_FIRST_IDENT_CARD_QTY(InsIdentCardTempStruct.getTMP_FIRST_IDENT_CARD_QTY());
				IdentCardTempStruct.setINS_IDENT_CARD_QTY(InsIdentCardTempStruct.getTMP_IDENT_CARD_QTY());
				IdentCardTempStruct.setINS_OPR_DATE(InsIdentCardTempStruct.getTMP_OPR_DATE());
				IdentCardTempStruct.setINS_PKG_UNIT_QTY(InsIdentCardTempStruct.getTMP_PKG_UNIT_QTY());
				IdentCardTempStruct.setINS_PLANT_CD(InsIdentCardTempStruct.getTMP_PLANT_CD());
				IdentCardTempStruct.setINS_WS_CD(InsIdentCardTempStruct.getTMP_WS_CD());
				if(lotCtrlFlg) {
					IdentCardTempStruct.setLOT_NO(InsIdentCardTempStruct.getLOT_NO());	
				}
				IdentCardTempStruct.setINS_CREATED_BY(this.sysUSER_CD);
				IdentCardTempStruct.setINS_CREATED_PRG_NM(this.sp.getProcId());
				IdentCardTempStruct.setINS_UPDATED_BY(this.sysUSER_CD);
				IdentCardTempStruct.setINS_UPDATED_PRG_NM(this.sp.getProcId());
			}

            //���i�[���ʁ��׎p�P�ʐ��ʂ̏������߂�
			String pageno = Calculate.divide(IdentCardTempStruct.getINS_IDENT_CARD_QTY(), IdentCardTempStruct.getINS_PKG_UNIT_QTY(), 0, Calculate.FLOOR);

			double bunshi = Double.parseDouble(IdentCardTempStruct.getINS_IDENT_CARD_QTY());
			double bunbo = Double.parseDouble(IdentCardTempStruct.getINS_PKG_UNIT_QTY());
			double overno;

			//���i�[���ʁ��׎p�P�ʐ��ʂ̗]������߂�
			overno = bunshi % bunbo;

			//���y�[�W���̎Z�o
			if (0 < overno){
				//�]�肪����ꍇ�A�P�����Z
				pageno = Calculate.add(pageno, "1");
			}

			//���y�[�W�������[�v����
			for(long i=1;i<=Long.parseLong(pageno) ;i++)
			{
				//�ŏI�y�[�W�ł��A�]�肪����ꍇ
				if (i == Long.parseLong(pageno) && 0 < overno){
					//�]����׎p�P�ʐ��ʂɐݒ�
					IdentCardTempStruct.setINS_PKG_UNIT_QTY(Double.toString(overno));
				}

				IdentCardTempStruct.setINS_PAGE_NO(Long.toString(i));

				// ���i�[TEMP�̓o�^
				entity.mInsertIdentCardTemp.create(conn,IdentCardTempStruct);
	    	}  

			conn.commit();

			/* �N�G���[�t�@�C���̎w�� */
			if(dbKIND != null && !dbKIND.equals("")) {
				ret = svf.VrSetQuery("KIND=" + dbKIND + ";UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);
			} else {
				ret = svf.VrSetQuery("UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);
			}
			/* �N�G���[���o�����̎w�� */

			ret = svf.VrCondition("[X|PRINT_GRP_NO]=" + Long.parseLong(strPrintGrpNo), 4);

			/* �N�G���[���o�����̎w�� */

			//ret = svf.VrCondition("[X|INS_IDENT_CARD_CTL_NO]=" + struct.getINS_IDENT_CARD_CTL_NO(), 4);

			/* �N�G���[���s */
			ret = svf.VrReport();
			if(ret == -554) {
				ExpjMessage emsg = new ExpjMessage("ZZ06001");
				msgStruct.addError(emsg);
				sysLog.warning(emsg, sysUSER_CD);
				return;
			}

			/* PDF�쐬�I�� */
			ret = svf.VrQuit();
			if ( "0".equals(printType) ) {	// �N���C�A���g����̏ꍇ
				struct.setDOWNLOAD_FILE(getPdfFileName());
			}
			else if ( "1".equals(printType) ) {
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

			//���i�[TEMP�̍폜
			entity.mDeleteIdentCardTemp.delete(conn,IdentCardTempStruct);

			conn.commit();

			//�����̍ĕ\���ׂ̈ɃZ�b�g
			this.struct.setIDENT_CARD_CTL_NO(this.struct.getT_IDENT_CARD_CTL_NO());
			this.struct.setMODIFY_COUNT(Long.toString(lngModifyCount + 1));

//			objMessage.m_writer.write(Level.INFO, "file=" + svf.VrGetSpoolFileName() + "�ɏo��");
		//}catch(SQLException e){
		//	e.printStackTrace();
		//	ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
		//	sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
		//	ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
		//	throw ee;
		//}catch(ExpjException msg) {
		//	msg.printStackTrace();
		//	throw msg;

		} catch (SQLException e) {
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} catch (Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} finally {
			try {
				if (conn != null) {
					this.struct.setIDENT_CARD_CTL_NO(_IdentCardCtlNo);
					conn.rollback();
				}
			} catch(Exception e) {
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				this.struct.setIDENT_CARD_CTL_NO(_IdentCardCtlNo);
				e.printStackTrace();
				throw new ExpjException(e, emsg);
			}
		}
/*		}catch(Exception e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			throw ee;
		} finally {
			//
		}*/
                //}}user_implement_dev:<controlPrint>
		logger.exiting("AD0060010Control"+":USER="+struct.getsUser_ID(),"controlPrint");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0060");
		logger.entering("AD0060010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AD0060010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0060");
		logger.entering("AD0060010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try{
			// �N���A����
			controlclear();

			// =======================================
			// ���Џ��̎擾
			// =======================================
			List listCompanyInfo = entity.mread_COMPANY_CD.read(conn,struct);
			if(listCompanyInfo == null || listCompanyInfo.size() != 1){
				//���Џ�񂪖���/������
				ExpjMessage emsg = new ExpjMessage("KQ00039");
                msgStruct.addError(emsg);	// �G���[���b�Z�[�W�Ƃ��ēo�^
                sysLog.severe(emsg, getsysUSER_CD()); //�G���[���e
                ExpjException ee = new ExpjException(emsg);
                throw ee;

			}
			listCompanyInfo = null;
			
			// ���b�g�Ǘ�
			lotCtrlFlg = LotCtrl.checkLotCtrl(conn);

		}catch(SQLException e){
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
		logger.exiting("AD0060010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0060");
		logger.entering("AD0060010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
		logger.exiting("AD0060010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("close") ) {
				controlclose();
			} else if( button.equals("Print") ) {
				controlPrint();
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
//			throw new FoundationException("AD0060010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0060010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AD0060010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0060010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AD0060010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0060010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AD0060010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AD0060010Entity entity;
	protected AD0060010Struct struct;
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

		entity = new AD0060010Entity();
		struct = new AD0060010Struct();

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
	 * AD0060010�N���X�̕W���R���X�g���N�^
	 */
	public AD0060010Control() throws BusinessProcessException, FoundationException
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
				AD0060010Struct key = (AD0060010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("PRINT_QTY") && key.getPRINT_QTY() != null) {
					msgKey.setKeyValue("PRINT_QTY", key.getPRINT_QTY());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("ORI_IDENT_CARD_QTY") && key.getORI_IDENT_CARD_QTY() != null) {
					msgKey.setKeyValue("ORI_IDENT_CARD_QTY", key.getORI_IDENT_CARD_QTY());
				}
				if(msgKeyType.containsKeyColumn("TEMP_IDENT_CARD_QTY") && key.getTEMP_IDENT_CARD_QTY() != null) {
					msgKey.setKeyValue("TEMP_IDENT_CARD_QTY", key.getTEMP_IDENT_CARD_QTY());
				}
				if(msgKeyType.containsKeyColumn("T_IDENT_CARD_CTL_NO") && key.getT_IDENT_CARD_CTL_NO() != null) {
					msgKey.setKeyValue("T_IDENT_CARD_CTL_NO", key.getT_IDENT_CARD_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD") && key.getOPR_INST_CD() != null) {
					msgKey.setKeyValue("OPR_INST_CD", key.getOPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("PARTIAL_PRD_NO") && key.getPARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("PARTIAL_PRD_NO", key.getPARTIAL_PRD_NO());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("WS_NAME") && key.getWS_NAME() != null) {
					msgKey.setKeyValue("WS_NAME", key.getWS_NAME());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO") && key.getLOT_NO() != null) {
					msgKey.setKeyValue("LOT_NO", key.getLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("OPR_DATE") && key.getOPR_DATE() != null) {
					msgKey.setKeyValue("OPR_DATE", key.getOPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("FIRST_IDENT_CARD_QTY") && key.getFIRST_IDENT_CARD_QTY() != null) {
					msgKey.setKeyValue("FIRST_IDENT_CARD_QTY", key.getFIRST_IDENT_CARD_QTY());
				}
				if(msgKeyType.containsKeyColumn("IDENT_CARD_QTY") && key.getIDENT_CARD_QTY() != null) {
					msgKey.setKeyValue("IDENT_CARD_QTY", key.getIDENT_CARD_QTY());
				}
				if(msgKeyType.containsKeyColumn("PKG_UNIT_QTY") && key.getPKG_UNIT_QTY() != null) {
					msgKey.setKeyValue("PKG_UNIT_QTY", key.getPKG_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("DEL_FLG") && key.getDEL_FLG() != null) {
					msgKey.setKeyValue("DEL_FLG", key.getDEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("h_UNIT_QTY_TYP") && key.geth_UNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("h_UNIT_QTY_TYP", key.geth_UNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("IDENT_CARD_CTL_NO") && key.getIDENT_CARD_CTL_NO() != null) {
					msgKey.setKeyValue("IDENT_CARD_CTL_NO", key.getIDENT_CARD_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("SYS_COMPANY_CD") && key.getSYS_COMPANY_CD() != null) {
					msgKey.setKeyValue("SYS_COMPANY_CD", key.getSYS_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("UPD_IDENT_CARD_QTY") && key.getUPD_IDENT_CARD_QTY() != null) {
					msgKey.setKeyValue("UPD_IDENT_CARD_QTY", key.getUPD_IDENT_CARD_QTY());
				}
				if(msgKeyType.containsKeyColumn("UPD_PRINT_QTY") && key.getUPD_PRINT_QTY() != null) {
					msgKey.setKeyValue("UPD_PRINT_QTY", key.getUPD_PRINT_QTY());
				}
				if(msgKeyType.containsKeyColumn("UPD_UPDATED_BY") && key.getUPD_UPDATED_BY() != null) {
					msgKey.setKeyValue("UPD_UPDATED_BY", key.getUPD_UPDATED_BY());
				}
				if(msgKeyType.containsKeyColumn("UPD_UPDATED_PRG_NM") && key.getUPD_UPDATED_PRG_NM() != null) {
					msgKey.setKeyValue("UPD_UPDATED_PRG_NM", key.getUPD_UPDATED_PRG_NM());
				}
				if(msgKeyType.containsKeyColumn("UPD_IDENT_CARD_CTL_NO") && key.getUPD_IDENT_CARD_CTL_NO() != null) {
					msgKey.setKeyValue("UPD_IDENT_CARD_CTL_NO", key.getUPD_IDENT_CARD_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("UPD_MODIFY_COUNT") && key.getUPD_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("UPD_MODIFY_COUNT", key.getUPD_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("TMP_IDENT_CARD_CTL_NO") && key.getTMP_IDENT_CARD_CTL_NO() != null) {
					msgKey.setKeyValue("TMP_IDENT_CARD_CTL_NO", key.getTMP_IDENT_CARD_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("TMP_OPR_INST_CD") && key.getTMP_OPR_INST_CD() != null) {
					msgKey.setKeyValue("TMP_OPR_INST_CD", key.getTMP_OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("TMP_PARTIAL_PRD_NO") && key.getTMP_PARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("TMP_PARTIAL_PRD_NO", key.getTMP_PARTIAL_PRD_NO());
				}
				if(msgKeyType.containsKeyColumn("TMP_RCV_ISSUE_CTRL_CD") && key.getTMP_RCV_ISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("TMP_RCV_ISSUE_CTRL_CD", key.getTMP_RCV_ISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("TMP_ITEM_CD") && key.getTMP_ITEM_CD() != null) {
					msgKey.setKeyValue("TMP_ITEM_CD", key.getTMP_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("TMP_JOB_ODR_CD") && key.getTMP_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("TMP_JOB_ODR_CD", key.getTMP_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("TMP_FIRST_IDENT_CARD_QTY") && key.getTMP_FIRST_IDENT_CARD_QTY() != null) {
					msgKey.setKeyValue("TMP_FIRST_IDENT_CARD_QTY", key.getTMP_FIRST_IDENT_CARD_QTY());
				}
				if(msgKeyType.containsKeyColumn("TMP_IDENT_CARD_QTY") && key.getTMP_IDENT_CARD_QTY() != null) {
					msgKey.setKeyValue("TMP_IDENT_CARD_QTY", key.getTMP_IDENT_CARD_QTY());
				}
				if(msgKeyType.containsKeyColumn("TMP_OPR_DATE") && key.getTMP_OPR_DATE() != null) {
					msgKey.setKeyValue("TMP_OPR_DATE", key.getTMP_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("TMP_PKG_UNIT_QTY") && key.getTMP_PKG_UNIT_QTY() != null) {
					msgKey.setKeyValue("TMP_PKG_UNIT_QTY", key.getTMP_PKG_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("TMP_PLANT_CD") && key.getTMP_PLANT_CD() != null) {
					msgKey.setKeyValue("TMP_PLANT_CD", key.getTMP_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("TMP_WS_CD") && key.getTMP_WS_CD() != null) {
					msgKey.setKeyValue("TMP_WS_CD", key.getTMP_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("INS_PRINT_GRP_NO") && key.getINS_PRINT_GRP_NO() != null) {
					msgKey.setKeyValue("INS_PRINT_GRP_NO", key.getINS_PRINT_GRP_NO());
				}
				if(msgKeyType.containsKeyColumn("INS_PAGE_NO") && key.getINS_PAGE_NO() != null) {
					msgKey.setKeyValue("INS_PAGE_NO", key.getINS_PAGE_NO());
				}
				if(msgKeyType.containsKeyColumn("INS_IDENT_CARD_CTL_NO") && key.getINS_IDENT_CARD_CTL_NO() != null) {
					msgKey.setKeyValue("INS_IDENT_CARD_CTL_NO", key.getINS_IDENT_CARD_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("INS_OPR_INST_CD") && key.getINS_OPR_INST_CD() != null) {
					msgKey.setKeyValue("INS_OPR_INST_CD", key.getINS_OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("INS_PARTIAL_PRD_NO") && key.getINS_PARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("INS_PARTIAL_PRD_NO", key.getINS_PARTIAL_PRD_NO());
				}
				if(msgKeyType.containsKeyColumn("INS_RCV_ISSUE_CTRL_CD") && key.getINS_RCV_ISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("INS_RCV_ISSUE_CTRL_CD", key.getINS_RCV_ISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("INS_ITEM_CD") && key.getINS_ITEM_CD() != null) {
					msgKey.setKeyValue("INS_ITEM_CD", key.getINS_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("INS_JOB_ODR_CD") && key.getINS_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("INS_JOB_ODR_CD", key.getINS_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("INS_FIRST_IDENT_CARD_QTY") && key.getINS_FIRST_IDENT_CARD_QTY() != null) {
					msgKey.setKeyValue("INS_FIRST_IDENT_CARD_QTY", key.getINS_FIRST_IDENT_CARD_QTY());
				}
				if(msgKeyType.containsKeyColumn("INS_IDENT_CARD_QTY") && key.getINS_IDENT_CARD_QTY() != null) {
					msgKey.setKeyValue("INS_IDENT_CARD_QTY", key.getINS_IDENT_CARD_QTY());
				}
				if(msgKeyType.containsKeyColumn("INS_OPR_DATE") && key.getINS_OPR_DATE() != null) {
					msgKey.setKeyValue("INS_OPR_DATE", key.getINS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("INS_PKG_UNIT_QTY") && key.getINS_PKG_UNIT_QTY() != null) {
					msgKey.setKeyValue("INS_PKG_UNIT_QTY", key.getINS_PKG_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("INS_PLANT_CD") && key.getINS_PLANT_CD() != null) {
					msgKey.setKeyValue("INS_PLANT_CD", key.getINS_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("INS_WS_CD") && key.getINS_WS_CD() != null) {
					msgKey.setKeyValue("INS_WS_CD", key.getINS_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("INS_CREATED_BY") && key.getINS_CREATED_BY() != null) {
					msgKey.setKeyValue("INS_CREATED_BY", key.getINS_CREATED_BY());
				}
				if(msgKeyType.containsKeyColumn("INS_CREATED_PRG_NM") && key.getINS_CREATED_PRG_NM() != null) {
					msgKey.setKeyValue("INS_CREATED_PRG_NM", key.getINS_CREATED_PRG_NM());
				}
				if(msgKeyType.containsKeyColumn("INS_UPDATED_BY") && key.getINS_UPDATED_BY() != null) {
					msgKey.setKeyValue("INS_UPDATED_BY", key.getINS_UPDATED_BY());
				}
				if(msgKeyType.containsKeyColumn("INS_UPDATED_PRG_NM") && key.getINS_UPDATED_PRG_NM() != null) {
					msgKey.setKeyValue("INS_UPDATED_PRG_NM", key.getINS_UPDATED_PRG_NM());
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
					AD0060010Struct key = new AD0060010Struct();
					if(msgKeyType.containsKeyColumn("PRINT_QTY")) {
						key.setPRINT_QTY(msgKey.getKeyValue("PRINT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("ORI_IDENT_CARD_QTY")) {
						key.setORI_IDENT_CARD_QTY(msgKey.getKeyValue("ORI_IDENT_CARD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TEMP_IDENT_CARD_QTY")) {
						key.setTEMP_IDENT_CARD_QTY(msgKey.getKeyValue("TEMP_IDENT_CARD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("T_IDENT_CARD_CTL_NO")) {
						key.setT_IDENT_CARD_CTL_NO(msgKey.getKeyValue("T_IDENT_CARD_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD")) {
						key.setOPR_INST_CD(msgKey.getKeyValue("OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("PARTIAL_PRD_NO")) {
						key.setPARTIAL_PRD_NO(msgKey.getKeyValue("PARTIAL_PRD_NO"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("WS_NAME")) {
						key.setWS_NAME(msgKey.getKeyValue("WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO")) {
						key.setLOT_NO(msgKey.getKeyValue("LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("OPR_DATE")) {
						key.setOPR_DATE(msgKey.getKeyValue("OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("FIRST_IDENT_CARD_QTY")) {
						key.setFIRST_IDENT_CARD_QTY(msgKey.getKeyValue("FIRST_IDENT_CARD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("IDENT_CARD_QTY")) {
						key.setIDENT_CARD_QTY(msgKey.getKeyValue("IDENT_CARD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PKG_UNIT_QTY")) {
						key.setPKG_UNIT_QTY(msgKey.getKeyValue("PKG_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("DEL_FLG")) {
						key.setDEL_FLG(msgKey.getKeyValue("DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("h_UNIT_QTY_TYP")) {
						key.seth_UNIT_QTY_TYP(msgKey.getKeyValue("h_UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("IDENT_CARD_CTL_NO")) {
						key.setIDENT_CARD_CTL_NO(msgKey.getKeyValue("IDENT_CARD_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("SYS_COMPANY_CD")) {
						key.setSYS_COMPANY_CD(msgKey.getKeyValue("SYS_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("UPD_IDENT_CARD_QTY")) {
						key.setUPD_IDENT_CARD_QTY(msgKey.getKeyValue("UPD_IDENT_CARD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("UPD_PRINT_QTY")) {
						key.setUPD_PRINT_QTY(msgKey.getKeyValue("UPD_PRINT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("UPD_UPDATED_BY")) {
						key.setUPD_UPDATED_BY(msgKey.getKeyValue("UPD_UPDATED_BY"));
					}
					if(msgKeyType.containsKeyColumn("UPD_UPDATED_PRG_NM")) {
						key.setUPD_UPDATED_PRG_NM(msgKey.getKeyValue("UPD_UPDATED_PRG_NM"));
					}
					if(msgKeyType.containsKeyColumn("UPD_IDENT_CARD_CTL_NO")) {
						key.setUPD_IDENT_CARD_CTL_NO(msgKey.getKeyValue("UPD_IDENT_CARD_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("UPD_MODIFY_COUNT")) {
						key.setUPD_MODIFY_COUNT(msgKey.getKeyValue("UPD_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("TMP_IDENT_CARD_CTL_NO")) {
						key.setTMP_IDENT_CARD_CTL_NO(msgKey.getKeyValue("TMP_IDENT_CARD_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("TMP_OPR_INST_CD")) {
						key.setTMP_OPR_INST_CD(msgKey.getKeyValue("TMP_OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("TMP_PARTIAL_PRD_NO")) {
						key.setTMP_PARTIAL_PRD_NO(msgKey.getKeyValue("TMP_PARTIAL_PRD_NO"));
					}
					if(msgKeyType.containsKeyColumn("TMP_RCV_ISSUE_CTRL_CD")) {
						key.setTMP_RCV_ISSUE_CTRL_CD(msgKey.getKeyValue("TMP_RCV_ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("TMP_ITEM_CD")) {
						key.setTMP_ITEM_CD(msgKey.getKeyValue("TMP_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("TMP_JOB_ODR_CD")) {
						key.setTMP_JOB_ODR_CD(msgKey.getKeyValue("TMP_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("TMP_FIRST_IDENT_CARD_QTY")) {
						key.setTMP_FIRST_IDENT_CARD_QTY(msgKey.getKeyValue("TMP_FIRST_IDENT_CARD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TMP_IDENT_CARD_QTY")) {
						key.setTMP_IDENT_CARD_QTY(msgKey.getKeyValue("TMP_IDENT_CARD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TMP_OPR_DATE")) {
						key.setTMP_OPR_DATE(msgKey.getKeyValue("TMP_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("TMP_PKG_UNIT_QTY")) {
						key.setTMP_PKG_UNIT_QTY(msgKey.getKeyValue("TMP_PKG_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TMP_PLANT_CD")) {
						key.setTMP_PLANT_CD(msgKey.getKeyValue("TMP_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("TMP_WS_CD")) {
						key.setTMP_WS_CD(msgKey.getKeyValue("TMP_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("INS_PRINT_GRP_NO")) {
						key.setINS_PRINT_GRP_NO(msgKey.getKeyValue("INS_PRINT_GRP_NO"));
					}
					if(msgKeyType.containsKeyColumn("INS_PAGE_NO")) {
						key.setINS_PAGE_NO(msgKey.getKeyValue("INS_PAGE_NO"));
					}
					if(msgKeyType.containsKeyColumn("INS_IDENT_CARD_CTL_NO")) {
						key.setINS_IDENT_CARD_CTL_NO(msgKey.getKeyValue("INS_IDENT_CARD_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("INS_OPR_INST_CD")) {
						key.setINS_OPR_INST_CD(msgKey.getKeyValue("INS_OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("INS_PARTIAL_PRD_NO")) {
						key.setINS_PARTIAL_PRD_NO(msgKey.getKeyValue("INS_PARTIAL_PRD_NO"));
					}
					if(msgKeyType.containsKeyColumn("INS_RCV_ISSUE_CTRL_CD")) {
						key.setINS_RCV_ISSUE_CTRL_CD(msgKey.getKeyValue("INS_RCV_ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("INS_ITEM_CD")) {
						key.setINS_ITEM_CD(msgKey.getKeyValue("INS_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("INS_JOB_ODR_CD")) {
						key.setINS_JOB_ODR_CD(msgKey.getKeyValue("INS_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("INS_FIRST_IDENT_CARD_QTY")) {
						key.setINS_FIRST_IDENT_CARD_QTY(msgKey.getKeyValue("INS_FIRST_IDENT_CARD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("INS_IDENT_CARD_QTY")) {
						key.setINS_IDENT_CARD_QTY(msgKey.getKeyValue("INS_IDENT_CARD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("INS_OPR_DATE")) {
						key.setINS_OPR_DATE(msgKey.getKeyValue("INS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("INS_PKG_UNIT_QTY")) {
						key.setINS_PKG_UNIT_QTY(msgKey.getKeyValue("INS_PKG_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("INS_PLANT_CD")) {
						key.setINS_PLANT_CD(msgKey.getKeyValue("INS_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("INS_WS_CD")) {
						key.setINS_WS_CD(msgKey.getKeyValue("INS_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("INS_CREATED_BY")) {
						key.setINS_CREATED_BY(msgKey.getKeyValue("INS_CREATED_BY"));
					}
					if(msgKeyType.containsKeyColumn("INS_CREATED_PRG_NM")) {
						key.setINS_CREATED_PRG_NM(msgKey.getKeyValue("INS_CREATED_PRG_NM"));
					}
					if(msgKeyType.containsKeyColumn("INS_UPDATED_BY")) {
						key.setINS_UPDATED_BY(msgKey.getKeyValue("INS_UPDATED_BY"));
					}
					if(msgKeyType.containsKeyColumn("INS_UPDATED_PRG_NM")) {
						key.setINS_UPDATED_PRG_NM(msgKey.getKeyValue("INS_UPDATED_PRG_NM"));
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
