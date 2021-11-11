/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0100/src/com/nec/jp/orteus/metamorBase/AD0100/AD0100010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0100;

import com.nec.jp.orteus.metamorBase.AD0100.*;
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
import com.nec.jp.orteus.expj.pr.rcvissue.process.ValidateWh;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common02.CommonOd.ApsComException;
import com.nec.jp.orteus.expj.util.CommonOd; 
import java.text.DateFormat;
import java.math.BigDecimal;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AD0100010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.1 $ $Date: 2013/12/02 09:25:17 $
 *
 */
//}}user_implement_code_header

public class AD0100010Control
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
	public AD0100010Struct getListvalue(int x) { return (AD0100010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AD0100010Struct getStruct() { return this.struct; }	// Struct�̒l��Ԃ��܂��B
	public AD0100010Struct createStruct() { return new AD0100010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AD0100010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	
	// �Ɩ��^�p��
	private String _businessOprDate = null;
	
	/**
     * ��ʂ̏ڍ׍��ڂ����������܂��B
     */
    public void initializeDetail() {
    	struct.setITEM_NAME(null);
    	struct.setWS_NAME(null);
    	struct.setITEM_CD(null);
    	struct.setWS_CD(null);
    	struct.setPRD_START_DATE_FROM(null);
    	struct.setPRD_START_DATE_FROM_TIME(null);
    	struct.setPRD_START_DATE_TO(null);
    	struct.setPRD_START_DATE_TO_TIME(null);
    	struct.setPRD_DUE_DATE_FROM(null);
    	struct.setPRD_DUE_DATE_FROM_TIME(null);
    	struct.setPRD_DUE_DATE_TO(null);
    	struct.setPRD_DUE_DATE_TO_TIME(null);
    	
    	setReadStatus(INITIAL);
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
	 * �Ɩ����W�b�N�̃V�X�e�����O(�G���[)�ݒ菈����؂�o���Ċ֐���
	 * @param db1 �f�[�^�x�[�X���ڂP
	 * @param value1 �u��������P
	 */
	private void setWarningSysLogMessage(String db1, String value1) {
		StringBuffer sysLogMessage = new StringBuffer();
		sysLogMessage.append(db1);
		sysLogMessage.append(":");
		sysLogMessage.append(value1);
		ExpjMessage emsg 
				= new ExpjMessage("ZZ01006",sysLogMessage.toString());
		msgStruct.addError(emsg);
		sysLog.warning(emsg, getsysUSER_CD());
	}
	/**
	 * �����̐ݒ�
	 * @param  input    ����String
	 * @param  cnt      ����
	 * @return String   ���Ƀ[���𖄂߂�
	 */
	private String AppendZero(String input,int cnt){
		int nCount = cnt - input.length() ;
		for(int i = 1; i <= nCount;i++)
		{
			input = "0" + input;
		}
		return input;
	}
	
	/**
	 * ���������̐ݒ�
	 */
	private void setSearchCondition() {
		// �f�[�^�����N���A
		struct.setL_PRD_START_DATE_TO(null);
		struct.setL_PRD_START_DATE_FROM(null);
		struct.setL_PRD_DUE_DATE_TO(null);
		struct.setL_PRD_DUE_DATE_FROM(null);
		
		// ���o�����i���t�̐ݒ�j
		if (null != struct.getTIME_CTRL() && "true".equals(struct.getTIME_CTRL())){
			
			// ���������(From)
			if (null == struct.getPRD_START_DATE_FROM() || "".equals(struct.getPRD_START_DATE_FROM())){
				struct.setL_PRD_START_DATE_FROM(null);
			} else {
				// �����ݒ�
				if (null == struct.getPRD_START_DATE_FROM_TIME() || "".equals(struct.getPRD_START_DATE_FROM_TIME())){
					struct.setL_PRD_START_DATE_FROM(struct.getPRD_START_DATE_FROM() + " 00:00");
				} else {
					struct.setPRD_START_DATE_FROM_TIME(AppendZero(struct.getPRD_START_DATE_FROM_TIME(),4));
					struct.setL_PRD_START_DATE_FROM(struct.getPRD_START_DATE_FROM() + " " + 
					                                struct.getPRD_START_DATE_FROM_TIME().substring(0,2) + ":" + 
					                                struct.getPRD_START_DATE_FROM_TIME().substring(2));
				}
			}
			// ���������(To)
			if (null == struct.getPRD_START_DATE_TO() || "".equals(struct.getPRD_START_DATE_TO())){
				struct.setL_PRD_START_DATE_TO(null);
			} else {
				// �����ݒ�
				if (null == struct.getPRD_START_DATE_TO_TIME() || "".equals(struct.getPRD_START_DATE_TO_TIME())){
					struct.setL_PRD_START_DATE_TO(struct.getPRD_START_DATE_TO() + " 23:59");
				} else {
					struct.setPRD_START_DATE_TO_TIME(AppendZero(struct.getPRD_START_DATE_TO_TIME(),4));
					struct.setL_PRD_START_DATE_TO(struct.getPRD_START_DATE_TO() + " " + 
					                                struct.getPRD_START_DATE_TO_TIME().substring(0,2) + ":" + 
					                                struct.getPRD_START_DATE_TO_TIME().substring(2));
				}
			}
		  
			// �����[���iFrom�j
			if (null == struct.getPRD_DUE_DATE_FROM() || "".equals(struct.getPRD_DUE_DATE_FROM())){
				struct.setL_PRD_DUE_DATE_FROM(null);
			} else {
				// �����ݒ�
				if(null == struct.getPRD_DUE_DATE_FROM_TIME() || "".equals(struct.getPRD_DUE_DATE_FROM_TIME())){
					struct.setL_PRD_DUE_DATE_FROM(struct.getPRD_DUE_DATE_FROM() + " 00:00");
				} else {
					struct.setPRD_DUE_DATE_FROM_TIME(AppendZero(struct.getPRD_DUE_DATE_FROM_TIME(),4));
					struct.setL_PRD_DUE_DATE_FROM(struct.getPRD_DUE_DATE_FROM() + " " + 
												  struct.getPRD_DUE_DATE_FROM_TIME().substring(0,2) + ":" + 
												  struct.getPRD_DUE_DATE_FROM_TIME().substring(2));
				}
			}
			// �����[���iTo�j
			if (null == struct.getPRD_DUE_DATE_TO() || "".equals(struct.getPRD_DUE_DATE_TO())){
				struct.setL_PRD_DUE_DATE_TO(null);
			} else {
				// �����ݒ�
				if(null == struct.getPRD_DUE_DATE_TO_TIME() || "".equals(struct.getPRD_DUE_DATE_TO_TIME())){
					struct.setL_PRD_DUE_DATE_TO(struct.getPRD_DUE_DATE_TO() + " 23:59");
				} else {
					struct.setPRD_DUE_DATE_TO_TIME(AppendZero(struct.getPRD_DUE_DATE_TO_TIME(),4));
					struct.setL_PRD_DUE_DATE_TO(struct.getPRD_DUE_DATE_TO() + " " + 
												struct.getPRD_DUE_DATE_TO_TIME().substring(0,2) + ":" + 
												struct.getPRD_DUE_DATE_TO_TIME().substring(2));
				}
			}
		} else {
			struct.setL_PRD_START_DATE_FROM(struct.getPRD_START_DATE_FROM());
			if (null == struct.getPRD_START_DATE_TO() || "".equals(struct.getPRD_START_DATE_TO())){
				struct.setL_PRD_START_DATE_TO(null);
			} else {
				struct.setL_PRD_START_DATE_TO(struct.getPRD_START_DATE_TO() + " 23:59");
			}
			struct.setL_PRD_DUE_DATE_FROM(struct.getPRD_DUE_DATE_FROM());
			if (null == struct.getPRD_DUE_DATE_TO() || "".equals(struct.getPRD_DUE_DATE_TO())){
				struct.setL_PRD_DUE_DATE_TO(null);
			} else {
				struct.setL_PRD_DUE_DATE_TO(struct.getPRD_DUE_DATE_TO() + " 23:59");
			}
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0100");
		logger.entering("AD0100010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			if (list == null) {
				list = new ArrayList();
			} else {
				list.clear();
			}
			
			// �i�ږ�
			struct.setITEM_NAME(null);
			// ��Ƌ於
			struct.setWS_NAME(null);
			
			// ���͂����u�i�ڔԍ��v�́@[�i��]�ɑ��݂��Ȃ��ꍇ
			if(struct.getITEM_CD() != null && !"".equals(struct.getITEM_CD())){
				List checkItemList =  entity.mSelect_M_ITEM.read(conn, struct);
				if(checkItemList.isEmpty()){
					setErrorMessage("AE00118");
					setReadStatus(ERROR);
					return;
				} else {
					AD0100010Struct checkItemStruct = (AD0100010Struct)checkItemList.get(0);
					// �i�ږ�
					struct.setITEM_NAME(checkItemStruct.getITEM_NAME());
				}
			}
			// ���͂����u��Ƌ�R�[�h�v�́@[��Ƌ�]�ɑ��݂��Ȃ��ꍇ
			if(struct.getWS_CD() != null && !"".equals(struct.getWS_CD())){
				// �H��R�[�h
				struct.setPLANT_CD(getsysPLANT_CD());
				List checkWsList = entity.mSelect_M_WS.read(conn, struct);
				if(checkWsList.isEmpty()){
					setErrorMessage("AF00002");
					setReadStatus(ERROR);
					return;
				} else {
					AD0100010Struct checkWsStruct = (AD0100010Struct)checkWsList.get(0);
					// ��Ƌ於
					struct.setWS_NAME(checkWsStruct.getWS_NAME());
				}
			}
			
			// ����������Ɛ����[��
			setSearchCondition();

			// �\���Ώۂ̃f�[�^���ő�\������
			int maxLine = sp.getMaxLine(conn,10);
			if (maxLine != 0) {
				struct.setMAX_LINE(maxLine + "");
			} else {
				struct.setMAX_LINE(null);
			}
			
			struct.setPLANT_CD(getsysPLANT_CD());
			
			list = entity.mSelect.read(conn, struct);
			
			if(list == null || list.size()<= 0 ){
				setErrorMessage("ZZ06001");
				setReadStatus(NOT_FOUND);
				return;
			} else {
				// �\���Ώۂ̃f�[�^���ő�\�������𒴂����ꍇ�B
				if(maxLine != 0 && list.size() == maxLine + 1){
					setErrorMessage("ZZ01119", String.valueOf(maxLine));
					// ������Ԃ��u�ő�s���I�[�o�[�v�ɐݒ�
					setReadStatus(TOO_MANY);
					setList(null);
					return;
				} else {
					// ������Ԃ��u�Ǎ������v�ɐݒ�
					setReadStatus(NORMAL);
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
			setErrorMessage("ZZ01106");
			setReadStatus(ERROR);
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AD0100010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �I�����������{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlChoice_Compulsion_Completion() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0100");
		logger.entering("AD0100010Control"+":USER="+struct.getsUser_ID(),"controlChoice_Compulsion_Completion");
			//{{user_implement_dev:<controlChoice_Compulsion_Completion>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			// ���ی����̒��߂��������Ă�����t�`�F�b�N
			List pastResultEntryTypList = entity.mSelect_PAST_RESULT_ENTRY_TYP.read(conn, struct);
			if (!pastResultEntryTypList.isEmpty()) {
				AD0100010Struct pastResultEntryTypStruct = (AD0100010Struct) pastResultEntryTypList.get(0);
				if ("false".equals(pastResultEntryTypStruct.getVALUE())) {
					// �H��R�[�h
					struct.setPLANT_CD(getsysPLANT_CD());
					// ���ی����Ǘ��p�����[�^�̑Ώ۔N���擾
					List procExecDateList = entity.mSelect_SYS_ACTUAL_COST_CTRL_AC.read(conn, struct);
					if (!procExecDateList.isEmpty()) {
						AD0100010Struct procExecDateStruct = (AD0100010Struct) procExecDateList.get(0);
						BigDecimal procExecDate = new BigDecimal(procExecDateStruct.getPROC_EXEC_DATE());
						// �`�F�b�N�p�Ɩ��^�p��
						BigDecimal checkBusinessOprDate = new BigDecimal(_businessOprDate.substring(0,4) + _businessOprDate.substring(5,7));
						if (checkBusinessOprDate.compareTo(procExecDate) < 0) {
							// �Ɩ��^�p���̔N�����Ώ۔N�����ߋ��ꍇ
							setErrorMessage("AE00161");
							return;
						}
					}
				}
			}
			
			// �o�������ѓo�^�p
			AD0100010Struct insertOutputRsltStruct = new AD0100010Struct();
			
			for( int i = 0; i < struct.getList_l_ITEM_CD().size(); i++){
				
				// �i�ڕʎd�|�X�V���̃`�F�b�N
				AD0100010Struct modifyStruct = new AD0100010Struct();
				// ��ƌv��ԍ�
				modifyStruct.setWORK_ODR_CD((String)struct.getList_l_WORK_ODR_CD().get(i));
				modifyStruct.setMODIFY_COUNT((String)struct.getList_h_l_MODIFY_COUNT().get(i));
				List modifyList = entity.mSelect_MODIFY_T_WORK_IN_PROC_BY_ITEM.read(conn, modifyStruct);
				if (modifyList.isEmpty()) {
					setErrorMessage("AC00017");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", modifyStruct.getWORK_ODR_CD());
					continue;
				}
				
				// [�o��������] �̒ǉ�
				// �o�������єԍ��̎����̔�
				CollectNumber collectNum = new CollectNumber(CollectNumber.OUT_RSLT_CD,
																		this.sysUSER_CD,
																		this.sp.getProcId(),
																		this.sysPLANT_CD);
				String no = collectNum.getNo();
				if (no == null || no.length() == 0) {
					//�̔Ԍ��ʂ��Ȃ�
					setErrorMessage("ZZ01106");
					setReadStatus(ERROR);
					return;
				}
	            // �o�������єԍ�
				insertOutputRsltStruct.setOUTPUT_RSLT_CD(no);
	            // �i�ڔԍ�
				insertOutputRsltStruct.setITEM_CD((String)struct.getList_l_ITEM_CD().get(i));
	            // ��Ƌ�R�[�h
				insertOutputRsltStruct.setWS_CD((String)struct.getList_l_WS_CD().get(i));
	            // �H��R�[�h
				insertOutputRsltStruct.setPLANT_CD(getsysPLANT_CD());
	            // �o�������э�ƒS����
				insertOutputRsltStruct.setLOGIN_USER(getsysUSER_CD());
				// �ۊǋ�R�[�h
				String wh_CD = ValidateWh.getDefaultOprWh(conn, getsysPLANT_CD(), (String)struct.getList_l_ITEM_CD().get(i));
				insertOutputRsltStruct.setWH_CD(wh_CD);
				// �Ɩ��^�p��
				insertOutputRsltStruct.setBUSINESS_OPR_DATE(_businessOprDate);
				// �쐬��
				insertOutputRsltStruct.setsUser_ID(getsysUSER_CD());
				// �쐬��
				insertOutputRsltStruct.setsSysdate(struct.getsSysdate());
				entity.mInsert_T_OUTPUT_RSLT.create(conn, insertOutputRsltStruct);
				
				// [��Ǝ���] �̒ǉ�
				AD0100010Struct insertOprRsltStruct = new AD0100010Struct();
				// ��Ǝw���ԍ�
				insertOprRsltStruct.setOPR_INST_CD((String)struct.getList_h_l_OPR_INST_CD().get(i));
				
				List ppnList = entity.mSelect_Max_PARTIAL_PRD_NO.read(conn, insertOprRsltStruct);
				AD0100010Struct ppnStruct = new AD0100010Struct();
				if (!ppnList.isEmpty()) {
					ppnStruct = (AD0100010Struct)ppnList.get(0);
				}
				// �����
				insertOprRsltStruct.setPARTIAL_PRD_NO(ppnStruct.getPARTIAL_PRD_NO());
				// �i�ڔԍ�
				insertOprRsltStruct.setITEM_CD((String)struct.getList_l_ITEM_CD().get(i));
				// ��Ƌ�R�[�h
				insertOprRsltStruct.setWS_CD((String)struct.getList_l_WS_CD().get(i));
				// �ۊǋ�R�[�h
				insertOprRsltStruct.setWH_CD(wh_CD);
				// ��Ǝ�
				insertOprRsltStruct.setLOGIN_USER(getsysUSER_CD());
				// �o�������єԍ�
				insertOprRsltStruct.setOUTPUT_RSLT_CD(no);
				// �H��R�[�h
				insertOprRsltStruct.setPLANT_CD(getsysPLANT_CD());
				
				// �Ɩ��^�p��
				insertOprRsltStruct.setBUSINESS_OPR_DATE(_businessOprDate);
				// �쐬��
				insertOprRsltStruct.setsUser_ID(getsysUSER_CD());
				// �쐬��
				insertOprRsltStruct.setsSysdate(struct.getsSysdate());
				
				entity.mInsert_T_OPR_RSLT.create(conn, insertOprRsltStruct);
				
				// [�i�ڕʎd�|]�̍X�V
				AD0100010Struct updateWorkProcStruct = new AD0100010Struct();
				// ��ƌv��ԍ�
				updateWorkProcStruct.setWORK_ODR_CD((String)struct.getList_l_WORK_ODR_CD().get(i));
				// �Ɩ��^�p��
				updateWorkProcStruct.setBUSINESS_OPR_DATE(_businessOprDate);
				// �X�V��
				updateWorkProcStruct.setsUser_ID(getsysUSER_CD());
				// �X�V��
				updateWorkProcStruct.setsSysdate(struct.getsSysdate());
			
				entity.mUpdate_T_WORK_IN_PROC_BY_ITEM.update(conn, updateWorkProcStruct);
				
				CommonOd co =
					new CommonOd(this.conn, getsysPLANT_CD(), sysUSER_CD, sp.getProcId());
				// ���v�ʍX�V
				co.changeOrderForComplete((String)struct.getList_h_l_ODR_NO().get(i), -1);
				// �q���i���i�o�Ɏw���^���v�ʁj�̍X�V����
				co.changeDemandForComplete((String)struct.getList_l_WORK_ODR_CD().get(i), null, 
						Converter.strToDate(_businessOprDate+ " 00:00", Converter.SLASH_DATE_HOUR_COLON_MINUTE));
				conn.commit();
			}
			controlSelect();
			
		} catch (Exception e) {
			conn.rollback();
			e.printStackTrace();
			setErrorMessage("ZZ01106");
			setReadStatus(ERROR);
		}
                //}}user_implement_dev:<controlChoice_Compulsion_Completion>
		logger.exiting("AD0100010Control"+":USER="+struct.getsUser_ID(),"controlChoice_Compulsion_Completion");

		return;
	}

	/**
	 * �S�I���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCheckAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0100");
		logger.entering("AD0100010Control"+":USER="+struct.getsUser_ID(),"controlCheckAll");
			//{{user_implement_dev:<controlCheckAll>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlCheckAll>
		logger.exiting("AD0100010Control"+":USER="+struct.getsUser_ID(),"controlCheckAll");

		return;
	}

	/**
	 * �S�����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCheckClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0100");
		logger.entering("AD0100010Control"+":USER="+struct.getsUser_ID(),"controlCheckClear");
			//{{user_implement_dev:<controlCheckClear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		list.clear();
                //}}user_implement_dev:<controlCheckClear>
		logger.exiting("AD0100010Control"+":USER="+struct.getsUser_ID(),"controlCheckClear");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0100");
		logger.entering("AD0100010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		if (list == null) {
			list = new ArrayList();
		} else {
			list.clear();
		}
		controlRELOAD();
                //}}user_implement_dev:<controlClear>
		logger.exiting("AD0100010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0100");
		logger.entering("AD0100010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("AD0100010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0100");
		logger.entering("AD0100010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AD0100010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0100");
		logger.entering("AD0100010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		try {
			
			// �Ɩ��^�p�����擾����
			_businessOprDate = DateCtrl.getBusinessOprDate(conn, getsysPLANT_CD());
			
			if (_businessOprDate == null || "".equals(_businessOprDate)){
				ExpjMessage emsg = new ExpjMessage("AC34080");
				msgStruct.addError(emsg);				// �G���[���b�Z�[�W�Ƃ��ēo�^
				sysLog.severe(emsg, getsysUSER_CD());	// �G���[���e
				ExpjException ee = new ExpjException(emsg);
				throw ee;
			}
			
			// ��ʂ̍��ڏ������B
			initializeDetail();
			// TIME_CTRL�̎擾
			List timeCtrlList = entity.mSelect_SYS_PARAMETER.read(conn, struct);
			if(!timeCtrlList.isEmpty()){
				AD0100010Struct timeCtrlStruct = new AD0100010Struct();
				timeCtrlStruct = (AD0100010Struct)timeCtrlList.get(0);
				struct.setTIME_CTRL(timeCtrlStruct.getVALUE());
			}else{
				struct.setTIME_CTRL(null);
			}
			
		} catch (ExpjException ee){
        	throw ee;
        } catch (Exception e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());// �v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			throw ee;
		}
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AD0100010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0100");
		logger.entering("AD0100010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AD0100010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Choice_Compulsion_Completion") ) {
				controlChoice_Compulsion_Completion();
			} else if( button.equals("CheckAll") ) {
				controlCheckAll();
			} else if( button.equals("CheckClear") ) {
				controlCheckClear();
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
//			throw new FoundationException("AD0100010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0100010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AD0100010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0100010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AD0100010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0100010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AD0100010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AD0100010Entity entity;
	protected AD0100010Struct struct;
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

		entity = new AD0100010Entity();
		struct = new AD0100010Struct();

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
	 * AD0100010�N���X�̕W���R���X�g���N�^
	 */
	public AD0100010Control() throws BusinessProcessException, FoundationException
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
				AD0100010Struct key = (AD0100010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("TIME_CTRL") && key.getTIME_CTRL() != null) {
					msgKey.setKeyValue("TIME_CTRL", key.getTIME_CTRL());
				}
				if(msgKeyType.containsKeyColumn("PRD_START_DATE_FROM") && key.getPRD_START_DATE_FROM() != null) {
					msgKey.setKeyValue("PRD_START_DATE_FROM", key.getPRD_START_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("PRD_START_DATE_FROM_TIME") && key.getPRD_START_DATE_FROM_TIME() != null) {
					msgKey.setKeyValue("PRD_START_DATE_FROM_TIME", key.getPRD_START_DATE_FROM_TIME());
				}
				if(msgKeyType.containsKeyColumn("PRD_START_DATE_TO") && key.getPRD_START_DATE_TO() != null) {
					msgKey.setKeyValue("PRD_START_DATE_TO", key.getPRD_START_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("PRD_START_DATE_TO_TIME") && key.getPRD_START_DATE_TO_TIME() != null) {
					msgKey.setKeyValue("PRD_START_DATE_TO_TIME", key.getPRD_START_DATE_TO_TIME());
				}
				if(msgKeyType.containsKeyColumn("PRD_DUE_DATE_FROM") && key.getPRD_DUE_DATE_FROM() != null) {
					msgKey.setKeyValue("PRD_DUE_DATE_FROM", key.getPRD_DUE_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("PRD_DUE_DATE_FROM_TIME") && key.getPRD_DUE_DATE_FROM_TIME() != null) {
					msgKey.setKeyValue("PRD_DUE_DATE_FROM_TIME", key.getPRD_DUE_DATE_FROM_TIME());
				}
				if(msgKeyType.containsKeyColumn("PRD_DUE_DATE_TO") && key.getPRD_DUE_DATE_TO() != null) {
					msgKey.setKeyValue("PRD_DUE_DATE_TO", key.getPRD_DUE_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("PRD_DUE_DATE_TO_TIME") && key.getPRD_DUE_DATE_TO_TIME() != null) {
					msgKey.setKeyValue("PRD_DUE_DATE_TO_TIME", key.getPRD_DUE_DATE_TO_TIME());
				}
				if(msgKeyType.containsKeyColumn("OUTPUT_RSLT_CD") && key.getOUTPUT_RSLT_CD() != null) {
					msgKey.setKeyValue("OUTPUT_RSLT_CD", key.getOUTPUT_RSLT_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("LOGIN_USER") && key.getLOGIN_USER() != null) {
					msgKey.setKeyValue("LOGIN_USER", key.getLOGIN_USER());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD") && key.getOPR_INST_CD() != null) {
					msgKey.setKeyValue("OPR_INST_CD", key.getOPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("PARTIAL_PRD_NO") && key.getPARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("PARTIAL_PRD_NO", key.getPARTIAL_PRD_NO());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_CD") && key.getWORK_ODR_CD() != null) {
					msgKey.setKeyValue("WORK_ODR_CD", key.getWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("VALUE") && key.getVALUE() != null) {
					msgKey.setKeyValue("VALUE", key.getVALUE());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("WS_NAME") && key.getWS_NAME() != null) {
					msgKey.setKeyValue("WS_NAME", key.getWS_NAME());
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
				if(msgKeyType.containsKeyColumn("l_OPR_INST_START_DATE") && key.getl_OPR_INST_START_DATE() != null) {
					msgKey.setKeyValue("l_OPR_INST_START_DATE", key.getl_OPR_INST_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PRD_DUE_DATE") && key.getl_PRD_DUE_DATE() != null) {
					msgKey.setKeyValue("l_PRD_DUE_DATE", key.getl_PRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_INST_QTY") && key.getl_OPR_INST_QTY() != null) {
					msgKey.setKeyValue("l_OPR_INST_QTY", key.getl_OPR_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_RCV_QTY_1") && key.getl_RCV_QTY_1() != null) {
					msgKey.setKeyValue("l_RCV_QTY_1", key.getl_RCV_QTY_1());
				}
				if(msgKeyType.containsKeyColumn("l_WORK_ODR_CD") && key.getl_WORK_ODR_CD() != null) {
					msgKey.setKeyValue("l_WORK_ODR_CD", key.getl_WORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("h_l_ODR_NO") && key.geth_l_ODR_NO() != null) {
					msgKey.setKeyValue("h_l_ODR_NO", key.geth_l_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("h_l_MODIFY_COUNT") && key.geth_l_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_l_MODIFY_COUNT", key.geth_l_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("h_l_OPR_INST_CD") && key.geth_l_OPR_INST_CD() != null) {
					msgKey.setKeyValue("h_l_OPR_INST_CD", key.geth_l_OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("L_PRD_START_DATE_TO") && key.getL_PRD_START_DATE_TO() != null) {
					msgKey.setKeyValue("L_PRD_START_DATE_TO", key.getL_PRD_START_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("L_PRD_START_DATE_FROM") && key.getL_PRD_START_DATE_FROM() != null) {
					msgKey.setKeyValue("L_PRD_START_DATE_FROM", key.getL_PRD_START_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("L_PRD_DUE_DATE_TO") && key.getL_PRD_DUE_DATE_TO() != null) {
					msgKey.setKeyValue("L_PRD_DUE_DATE_TO", key.getL_PRD_DUE_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("L_PRD_DUE_DATE_FROM") && key.getL_PRD_DUE_DATE_FROM() != null) {
					msgKey.setKeyValue("L_PRD_DUE_DATE_FROM", key.getL_PRD_DUE_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("MAX_LINE") && key.getMAX_LINE() != null) {
					msgKey.setKeyValue("MAX_LINE", key.getMAX_LINE());
				}
				if(msgKeyType.containsKeyColumn("PROC_EXEC_DATE") && key.getPROC_EXEC_DATE() != null) {
					msgKey.setKeyValue("PROC_EXEC_DATE", key.getPROC_EXEC_DATE());
				}
				if(msgKeyType.containsKeyColumn("COUNT") && key.getCOUNT() != null) {
					msgKey.setKeyValue("COUNT", key.getCOUNT());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
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
					AD0100010Struct key = new AD0100010Struct();
					if(msgKeyType.containsKeyColumn("TIME_CTRL")) {
						key.setTIME_CTRL(msgKey.getKeyValue("TIME_CTRL"));
					}
					if(msgKeyType.containsKeyColumn("PRD_START_DATE_FROM")) {
						key.setPRD_START_DATE_FROM(msgKey.getKeyValue("PRD_START_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("PRD_START_DATE_FROM_TIME")) {
						key.setPRD_START_DATE_FROM_TIME(msgKey.getKeyValue("PRD_START_DATE_FROM_TIME"));
					}
					if(msgKeyType.containsKeyColumn("PRD_START_DATE_TO")) {
						key.setPRD_START_DATE_TO(msgKey.getKeyValue("PRD_START_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("PRD_START_DATE_TO_TIME")) {
						key.setPRD_START_DATE_TO_TIME(msgKey.getKeyValue("PRD_START_DATE_TO_TIME"));
					}
					if(msgKeyType.containsKeyColumn("PRD_DUE_DATE_FROM")) {
						key.setPRD_DUE_DATE_FROM(msgKey.getKeyValue("PRD_DUE_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("PRD_DUE_DATE_FROM_TIME")) {
						key.setPRD_DUE_DATE_FROM_TIME(msgKey.getKeyValue("PRD_DUE_DATE_FROM_TIME"));
					}
					if(msgKeyType.containsKeyColumn("PRD_DUE_DATE_TO")) {
						key.setPRD_DUE_DATE_TO(msgKey.getKeyValue("PRD_DUE_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("PRD_DUE_DATE_TO_TIME")) {
						key.setPRD_DUE_DATE_TO_TIME(msgKey.getKeyValue("PRD_DUE_DATE_TO_TIME"));
					}
					if(msgKeyType.containsKeyColumn("OUTPUT_RSLT_CD")) {
						key.setOUTPUT_RSLT_CD(msgKey.getKeyValue("OUTPUT_RSLT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("LOGIN_USER")) {
						key.setLOGIN_USER(msgKey.getKeyValue("LOGIN_USER"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD")) {
						key.setOPR_INST_CD(msgKey.getKeyValue("OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("PARTIAL_PRD_NO")) {
						key.setPARTIAL_PRD_NO(msgKey.getKeyValue("PARTIAL_PRD_NO"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_CD")) {
						key.setWORK_ODR_CD(msgKey.getKeyValue("WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("VALUE")) {
						key.setVALUE(msgKey.getKeyValue("VALUE"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WS_NAME")) {
						key.setWS_NAME(msgKey.getKeyValue("WS_NAME"));
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
					if(msgKeyType.containsKeyColumn("l_OPR_INST_START_DATE")) {
						key.setl_OPR_INST_START_DATE(msgKey.getKeyValue("l_OPR_INST_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PRD_DUE_DATE")) {
						key.setl_PRD_DUE_DATE(msgKey.getKeyValue("l_PRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_INST_QTY")) {
						key.setl_OPR_INST_QTY(msgKey.getKeyValue("l_OPR_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_RCV_QTY_1")) {
						key.setl_RCV_QTY_1(msgKey.getKeyValue("l_RCV_QTY_1"));
					}
					if(msgKeyType.containsKeyColumn("l_WORK_ODR_CD")) {
						key.setl_WORK_ODR_CD(msgKey.getKeyValue("l_WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_l_ODR_NO")) {
						key.seth_l_ODR_NO(msgKey.getKeyValue("h_l_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_l_MODIFY_COUNT")) {
						key.seth_l_MODIFY_COUNT(msgKey.getKeyValue("h_l_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("h_l_OPR_INST_CD")) {
						key.seth_l_OPR_INST_CD(msgKey.getKeyValue("h_l_OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("L_PRD_START_DATE_TO")) {
						key.setL_PRD_START_DATE_TO(msgKey.getKeyValue("L_PRD_START_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("L_PRD_START_DATE_FROM")) {
						key.setL_PRD_START_DATE_FROM(msgKey.getKeyValue("L_PRD_START_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("L_PRD_DUE_DATE_TO")) {
						key.setL_PRD_DUE_DATE_TO(msgKey.getKeyValue("L_PRD_DUE_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("L_PRD_DUE_DATE_FROM")) {
						key.setL_PRD_DUE_DATE_FROM(msgKey.getKeyValue("L_PRD_DUE_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("MAX_LINE")) {
						key.setMAX_LINE(msgKey.getKeyValue("MAX_LINE"));
					}
					if(msgKeyType.containsKeyColumn("PROC_EXEC_DATE")) {
						key.setPROC_EXEC_DATE(msgKey.getKeyValue("PROC_EXEC_DATE"));
					}
					if(msgKeyType.containsKeyColumn("COUNT")) {
						key.setCOUNT(msgKey.getKeyValue("COUNT"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
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
