/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AL0050/src/com/nec/jp/orteus/metamorBase/AL0050/AL0050010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AL0050;

import com.nec.jp.orteus.metamorBase.AL0050.*;
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

import com.nec.jp.orteus.expj.util.Numbering;
import com.nec.jp.orteus.expj.util.WorkCalendar;
import com.nec.jp.orteus.expj.util.Converter;
import java.text.SimpleDateFormat;
import java.text.ParseException;

//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AL0050010Control
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
        public AL0050010Struct getListvalue(int x) { return (AL0050010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
        public AL0050010Struct getStruct() { return this.struct; }	// Struct��Ԃ��܂��B
        public AL0050010Struct createStruct() { return new AL0050010Struct(); }	// �V����Struct������ĕԂ��܂��B
        public void setStruct(Object structname) { this.struct.setStruct((AL0050010Struct)structname); }	// Struct���Z�b�g���܂��B
        public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B
       
        // CSV�o�͗p���X�g
        private CsvWriter csvWriter = null;
        public CsvWriter getCsvWriter(){ return this.csvWriter; }
       
        private CsvReader csvReader = null;
        public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
       
           /** �ēǍ����s��ꂽ���𔻒f����t���O */
        private boolean _reloadFlag = false;
       
        /**
         * Struct�̒l���N���A���܂��B
         */
        private void clearStruct()
        {
         // ���C����i
         struct.setJOB_ODR_CD(null);
         struct.setITEM_CD(null);
         struct.setITEM_NAME(null);
         struct.setPRD_DUE_DATE_FROM(null);
         struct.setPRD_DUE_DATE_TO(null);
         struct.seth_PLANT_CD(getsysPLANT_CD());
         // ���C�����i
         struct.setl_JOB_ODR_CD(null);
         struct.setl_ITEM_CD(null);
         struct.setl_ITEM_NAME(null);
         struct.setl_PRD_DUE_DATE(null);
         struct.setl_ODR_QTY(null);
         struct.setl_CUST_CD(null);
         struct.setl_LOAD_PLAN_COMMENT(null);
         struct.setl_h_LOAD_PLAN_CD(null);
         struct.setl_h_MODIFY_COUNT(null);
         // �T�u�P���i
         struct.setSUB1_JOB_ODR_CD(null);
         struct.setSUB1_ITEM_CD(null);
         struct.setSUB1_ITEM_NAME(null);
         struct.setSUB1_PRD_DUE_DATE(null);
         struct.setSUB1_ODR_QTY("0.0");
         struct.setSUB1_CUST_CD(null);
         struct.setSUB1_LOAD_PLAN_COMMENT(null);
         struct.setSUB1_h_LOAD_PLAN_CD(null);
         struct.setSUB1_h_PLANT_CD(null);
         struct.setSUB1_h_MODIFY_COUNT(null);
         struct.setSUB1_h_ENTRY_BY(null);
         struct.setSUB1_h_PRD_DUE_DATE(null);
         struct.setSUB1_h_PRD_START_DATE(null);
         struct.setSUB1_h_l_JOB_ODR_CD(null);
         struct.setSUB1_h_l_ITEM_CD(null);
         // �T�u�P�B��
         struct.setMAIN_h_PLANT_CD(null);
         struct.setMAIN_h_JOB_ODR_CD(null);
         struct.setMAIN_h_ITEM_CD(null);
         struct.setMAIN_h_PRD_DUE_DATE_FROM(null);
         struct.setMAIN_h_PRD_DUE_DATE_TO(null);
         // �t�B�[���h�ϐ�
         struct.setd_ITEM_LT(null);
         struct.setd_ITEM_CD(null);
       
         // ���X�g
         if (list != null) {
          list.clear();
         }
        }
       
        /**
         * �T�u�P��Struct�̒l���N���A���܂��B
         */
        private void clearSub1Struct()
        {
         struct.setSUB1_JOB_ODR_CD(null);
         struct.setSUB1_ITEM_CD(null);
         struct.setSUB1_ITEM_NAME(null);
         struct.setSUB1_PRD_DUE_DATE(null);
         struct.setSUB1_ODR_QTY("0.0");
         struct.setSUB1_CUST_CD(null);
         struct.setSUB1_LOAD_PLAN_COMMENT(null);
         struct.setSUB1_h_LOAD_PLAN_CD(null);
         struct.setSUB1_h_PLANT_CD(null);
         struct.setSUB1_h_MODIFY_COUNT(null);
       
         struct.setSUB1_h_PRD_DUE_DATE(null);
         struct.setSUB1_h_PRD_START_DATE(null);
         struct.setSUB1_h_l_JOB_ODR_CD(null);
         struct.setSUB1_h_l_ITEM_CD(null);
        }
       
        /**
         * ���C����Struct�̒l���T�u�P�̉B���t�B�[���h�ɑޔ����܂��B
         */
        private void saveMainToSub1Hidden()
        {
         struct.setMAIN_h_PLANT_CD(struct.geth_PLANT_CD());
         struct.setMAIN_h_JOB_ODR_CD(struct.getJOB_ODR_CD());
         struct.setMAIN_h_ITEM_CD(struct.getITEM_CD());
         struct.setMAIN_h_PRD_DUE_DATE_FROM(struct.getPRD_DUE_DATE_FROM());
         struct.setMAIN_h_PRD_DUE_DATE_TO(struct.getPRD_DUE_DATE_TO());
        }
       
        /**
         * ���C����Struct�̒l���T�u�P�̉B���t�B�[���h���畜�����܂��B
         */
        // �e��ʂ̌����L�[��NULL�łȂ��Ƃ��A
        // �e��ʂ̌����L�[�ƈقȂ�L�[�̃f�[�^���o�^���ꂽ�ꍇ�ɂ́A
        // �e��ʂ̓��Y�����L�[�̒l��NULL�i�t���[�j�ɂ���B
        private void restoreMainFromSub1Hidden()
        {
         struct.seth_PLANT_CD(struct.getMAIN_h_PLANT_CD());
         if (struct.getMAIN_h_JOB_ODR_CD() != null
           && struct.getMAIN_h_JOB_ODR_CD().equals("") == false
           && struct.getSUB1_JOB_ODR_CD().equals(struct.getMAIN_h_JOB_ODR_CD()) == false)
         {
          struct.setJOB_ODR_CD(null);
         } else {
          struct.setJOB_ODR_CD(struct.getMAIN_h_JOB_ODR_CD());
         }
         if (struct.getMAIN_h_ITEM_CD() != null && struct.getMAIN_h_ITEM_CD().equals("") == false
           && struct.getSUB1_ITEM_CD().equals(struct.getMAIN_h_ITEM_CD()) == false)
         {
          struct.setITEM_CD(null);
         } else {
          struct.setITEM_CD(struct.getMAIN_h_ITEM_CD());
         }
         struct.setPRD_DUE_DATE_FROM(struct.getMAIN_h_PRD_DUE_DATE_FROM());
         struct.setPRD_DUE_DATE_TO(struct.getMAIN_h_PRD_DUE_DATE_TO());
        }
       
        /**
         * �T�u�P��Struct�ɐݒ肵�܂��B
         *
         * @param fromStruct �ݒ茳Struct
         */
        private void setSub1Struct(AL0050010Struct fromStruct)
        {
         struct.setSUB1_JOB_ODR_CD(fromStruct.getSUB1_JOB_ODR_CD());
         struct.setSUB1_ITEM_CD(fromStruct.getSUB1_ITEM_CD());
         struct.setSUB1_ITEM_NAME(fromStruct.getSUB1_ITEM_NAME());
         struct.setSUB1_PRD_DUE_DATE(fromStruct.getSUB1_PRD_DUE_DATE());
         struct.setSUB1_ODR_QTY(fromStruct.getSUB1_ODR_QTY());
         struct.setSUB1_CUST_CD(fromStruct.getSUB1_CUST_CD());
         struct.setSUB1_LOAD_PLAN_COMMENT(fromStruct.getSUB1_LOAD_PLAN_COMMENT());
         struct.setSUB1_h_LOAD_PLAN_CD(fromStruct.getSUB1_h_LOAD_PLAN_CD());
         struct.setSUB1_h_PLANT_CD(fromStruct.getSUB1_h_PLANT_CD());
         struct.setSUB1_h_MODIFY_COUNT(fromStruct.getSUB1_h_MODIFY_COUNT());
        }
       
        /**
         * mSelect�̑Ώۃe�[�u���ƃL�[�̕�����𐶐����܂��B
         *
         * @return mSelect�̑Ώۃe�[�u���ƃL�[�̕�����
         */
        private String makeTableAndKeyString()
        {
         StringBuffer sbufKey = new StringBuffer("T_LOAD_PLAN.PLANT_CD");
         if (struct.getJOB_ODR_CD() == null || struct.getJOB_ODR_CD().equals("") == false) {
          sbufKey.append(",JOB_ODR_CD");
         }
         if (struct.getITEM_CD() == null || struct.getITEM_CD().equals("") == false) {
          sbufKey.append(",ITEM_CD");
         }
         if (struct.getPRD_DUE_DATE_FROM() == null
           || struct.getPRD_DUE_DATE_FROM().equals("") == false)
         {
          sbufKey.append(",PRD_DUE_DATE_FROM");
         }
         if (struct.getPRD_DUE_DATE_TO() == null
           || struct.getPRD_DUE_DATE_TO().equals("") == false)
         {
          sbufKey.append(",PRD_DUE_DATE_TO");
         }
         sbufKey.append(":");
         sbufKey.append(struct.geth_PLANT_CD());
         if (struct.getJOB_ODR_CD() == null || struct.getJOB_ODR_CD().equals("") == false) {
          sbufKey.append(",");
          sbufKey.append(struct.getJOB_ODR_CD());
         }
         if (struct.getITEM_CD() == null || struct.getITEM_CD().equals("") == false) {
          sbufKey.append(",");
          sbufKey.append(struct.getITEM_CD());
         }
         if (struct.getPRD_DUE_DATE_FROM() == null
           || struct.getPRD_DUE_DATE_FROM().equals("") == false)
         {
          sbufKey.append(",");
          sbufKey.append(struct.getPRD_DUE_DATE_FROM());
         }
         if (struct.getPRD_DUE_DATE_TO() == null
           || struct.getPRD_DUE_DATE_TO().equals("") == false)
         {
          sbufKey.append(",");
          sbufKey.append(struct.getPRD_DUE_DATE_TO());
         }
         return sbufKey.toString();
        }
       
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0050");
		logger.entering("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
              
                // �⏕���b�Z�[�W(�L�[����)
                String bufKey = null;
              
                try {
                 // �Ǎ���ԁi�����\����ԁj��ݒ�
                 setReadStatus(INITIAL);
              
                 // �L�[���c���āAStruct���N���A
                 String jobOdrCd = struct.getJOB_ODR_CD();
                 String itemCd = struct.getITEM_CD();
                 String prdDueDateFrom = struct.getPRD_DUE_DATE_FROM();
                 String prdDueDateTo = struct.getPRD_DUE_DATE_TO();
                 clearStruct();
                 struct.setJOB_ODR_CD(jobOdrCd);
                 struct.setITEM_CD(itemCd);
                 struct.setPRD_DUE_DATE_FROM(prdDueDateFrom);
                 struct.setPRD_DUE_DATE_TO(prdDueDateTo);
              
                 // ���t�̕ϊ�
                 String strSearchDayFrom = null;
                 Date dateSearchDayFrom = null;
                 String strSearchDayTo = null;
                 Date dateSearchDayTo = null;
              
                 if (struct.getPRD_DUE_DATE_FROM() != null
                   && struct.getPRD_DUE_DATE_FROM().equals("") == false)
                 {
                  dateSearchDayFrom = Converter.strToDate(struct.getPRD_DUE_DATE_FROM(),
                    Converter.SLASH_DATE);
                  strSearchDayFrom = Converter.dateToStr(dateSearchDayFrom, Converter.SLASH_DATE);
                  struct.setPRD_DUE_DATE_FROM(strSearchDayFrom);
                 }
                 if (struct.getPRD_DUE_DATE_TO() != null
                   && struct.getPRD_DUE_DATE_TO().equals("") == false) {
                  dateSearchDayTo = Converter.strToDate(struct.getPRD_DUE_DATE_TO(),
                    Converter.SLASH_DATE);
                  strSearchDayTo = Converter.dateToStr(dateSearchDayTo, Converter.SLASH_DATE);
                  struct.setPRD_DUE_DATE_TO(strSearchDayTo);
                 }
              
                 // �i�ڃ}�X�^������
                 if (struct.getITEM_CD() != null && struct.getITEM_CD().equals("") == false) {
                  struct.setd_ITEM_CD(struct.getITEM_CD());
                  bufKey = "M_ITEM.ITEM_CD:" + struct.getd_ITEM_CD();
                  List workList = entity.mSelectItemCD.read(conn, struct);
                  if (workList != null && workList.size() > 0) {
                   AL0050010Struct workStruct = (AL0050010Struct)workList.get(0);
                   struct.setITEM_NAME(workStruct.getITEM_NAME());
                  } else {
                   // �i�ڔԍ����}�X�^�ɑ��݂��܂���B
                   ExpjMessage emsg = new ExpjMessage("AL50004");
                   msgStruct.addError(emsg);
                   sysLog.warning(emsg, getsysUSER_CD());
                   emsg = new ExpjMessage("ZZ01006", bufKey);
                   msgStruct.addError(emsg);
                   sysLog.warning(emsg, getsysUSER_CD());
                  }
                 }
              
                 // ���X�g����
                 bufKey = makeTableAndKeyString();
                 list = entity.mSelect.read(conn, struct);
                 if (list == null || list.isEmpty()) {
                  // �Ǎ���ԁi0���j��ݒ�
                  setReadStatus(NOT_FOUND);
                  if (_reloadFlag == false) {
                   // �Ώۃf�[�^�����݂��܂���B
                   ExpjMessage emsg = new ExpjMessage("ZZ06001");
                   msgStruct.addError(emsg);
                   sysLog.warning(emsg, getsysUSER_CD());
                   emsg = new ExpjMessage("ZZ01006", bufKey);
                   msgStruct.addError(emsg);
                   sysLog.warning(emsg, getsysUSER_CD());
                  }
                  return;
                 }
              
                 // �\���s������
                 int maxLine = sp.getMaxLine(conn, 1);
                 if (maxLine != 0 && list.size() > maxLine) {
                  // �Ǎ���ԁi0���j��ݒ�
                  setReadStatus(TOO_MANY);
                  // ���X�g���N���A
                  list.clear();
                  // �\���������K��l({0})�𒴂��Ă��܂��B������ύX���Ă�蒼���Ă��������B
                  ExpjMessage emsg = new ExpjMessage("ZZ01115", Integer.toString(maxLine));
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", bufKey);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  return;
                 }
              
                 // �Ǎ���ԁi����ǂݍ��݁j��ݒ�
                 setReadStatus(NORMAL);
              
                } catch (SQLException se) {
                 // �Ǎ���ԁi�G���[�j��ݒ�
                 setReadStatus(ERROR);
                 // �T�[�o�ŃG���[���������܂����B
                 ExpjMessage emsg = new ExpjMessage("ZZ01106");
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(se, emsg);
                 emsg = new ExpjMessage("ZZ01006", bufKey);
                 sysLog.severe(emsg, getsysUSER_CD());
                 emsg = new ExpjMessage("ZZ01006", se.toString());
                 sysLog.severe(emsg, getsysUSER_CD());
                 throw ee;
                } catch (Exception e) {
                 ExpjException ee = null;
                 if (e instanceof ExpjException) {
                  ee = (ExpjException)e;
                  sysLog.severe(ee.getExpjMessage(), getsysUSER_CD());
                 } else {
                  // �T�[�o�ŃG���[���������܂����B
                  ExpjMessage emsg = new ExpjMessage("ZZ01106");
                  sysLog.severe(emsg, getsysUSER_CD());
                  ee = new ExpjException(e, emsg);
                  emsg = new ExpjMessage("ZZ01006", e.toString());
                  sysLog.severe(emsg, getsysUSER_CD());
                 }
                 throw ee;
                }
              
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �s���ʃ{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlLineCopy() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0050");
		logger.entering("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlLineCopy");
			//{{user_implement_dev:<controlLineCopy>
              
                // �⏕���b�Z�[�W(�L�[����)
                String bufKey = null;
              
                try {
                 List workList = null;
                 AL0050010Struct workStruct = null;
              
                 // �g�����U�N�V�����J�n
                 conn.beginTransWeb();
              
                 // ���C����ʂ̌���������ێ�
                 saveMainToSub1Hidden();
              
                 // �T�u�P��ʂ��N���A
                 clearSub1Struct();
              
                 if (struct.getl_h_LOAD_PLAN_CD() != null) {
              
                  // �X�V�����擾
                  bufKey = "T_LOAD_PLAN.LOAD_PLAN_CD:" + struct.getl_h_LOAD_PLAN_CD();
                  workList = entity.mDeleteT_LOAD_PLAN.read(conn, struct);
                  if (workList == null || workList.isEmpty()) {
                   // ���̏����ɂ��f�[�^�������������Ă��܂��B
                   // ���j���[�ɖ߂��Ă�蒼���ĉ������B
                   ExpjMessage emsg = new ExpjMessage("ZZ01105");
                   msgStruct.addError(emsg);
                   sysLog.warning(emsg, getsysUSER_CD());
                   emsg = new ExpjMessage("ZZ01006", bufKey);
                   msgStruct.addError(emsg);
                   sysLog.warning(emsg, getsysUSER_CD());
                   return;
                  }
              
                  workStruct = (AL0050010Struct)workList.get(0);
                  if (workStruct.getl_h_MODIFY_COUNT().equals(
                    struct.getl_h_MODIFY_COUNT()) == false)
                  {
                   // ���̏����ɂ��f�[�^�������������Ă��܂��B
                   // ���j���[�ɖ߂��Ă�蒼���ĉ������B
                   ExpjMessage emsg = new ExpjMessage("ZZ01105");
                   msgStruct.addError(emsg);
                   sysLog.warning(emsg, getsysUSER_CD());
                   emsg = new ExpjMessage("ZZ01006", bufKey);
                   msgStruct.addError(emsg);
                   sysLog.warning(emsg, getsysUSER_CD());
                   return;
                  }
              
                  // ���׌v����Č���
                  workList = entity.mSelectT_LOAD_PLAN.read(conn,struct);
                  if (workList == null || workList.isEmpty()) {
                   // �Ώۃf�[�^�����݂��܂���B
                   ExpjMessage emsg = new ExpjMessage("ZZ06001");
                   msgStruct.addError(emsg);
                   sysLog.warning(emsg, getsysUSER_CD());
                   emsg = new ExpjMessage("ZZ01006", bufKey);
                   msgStruct.addError(emsg);
                   sysLog.warning(emsg, getsysUSER_CD());
                   return;
                  }
              
                  // �T�u�P��ʂɒl��ݒ�
                  setSub1Struct((AL0050010Struct)workList.get(0));
                 }
              
                 // �Ɩ��^�p���擾
                 bufKey = "SYS_DATE_CTRL.PLANT_CD:" + struct.geth_PLANT_CD();
                 workList = entity.mSelectSYS_DATE_CTRL.read(conn, struct);
                 if (workList == null || workList.isEmpty()) {
                  // �Ɩ��^�p�������݂��܂���
                  ExpjMessage emsg = new ExpjMessage("AL60002");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", bufKey);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  return;
                 }
              
                 workStruct = (AL0050010Struct)workList.get(0);
                 struct.setSUB1_h_PRD_DUE_DATE(workStruct.getSUB1_h_PRD_DUE_DATE());
              
                } catch (SQLException se) {
                 // �T�[�o�ŃG���[���������܂����B
                 ExpjMessage emsg = new ExpjMessage("ZZ01106");
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(se, emsg);
                 emsg = new ExpjMessage("ZZ01006", bufKey);
                 sysLog.severe(emsg, getsysUSER_CD());
                 emsg = new ExpjMessage("ZZ01006", se.toString());
                 sysLog.severe(emsg, getsysUSER_CD());
                 throw ee;
                } catch (Exception e) {
                 ExpjException ee = null;
                 if (e instanceof ExpjException) {
                  ee = (ExpjException)e;
                  sysLog.severe(ee.getExpjMessage(), getsysUSER_CD());
                 } else {
                  // �T�[�o�ŃG���[���������܂����B
                  ExpjMessage emsg = new ExpjMessage("ZZ01106");
                  sysLog.severe(emsg, getsysUSER_CD());
                  ee = new ExpjException(e, emsg);
                  emsg = new ExpjMessage("ZZ01006", e.toString());
                  sysLog.severe(emsg, getsysUSER_CD());
                 }
                 throw ee;
                }
              
                //}}user_implement_dev:<controlLineCopy>
		logger.exiting("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlLineCopy");

		return;
	}

	/**
	 * �s�C���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlLineUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0050");
		logger.entering("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlLineUpdate");
			//{{user_implement_dev:<controlLineUpdate>
              
                // �⏕���b�Z�[�W(�L�[����)
                String bufKey = null;
              
                try {
                 List workList = null;
                 AL0050010Struct workStruct = null;
              
                 // �g�����U�N�V�����J�n
                 conn.beginTransWeb();
              
                 // �X�V�����擾
                 bufKey = "T_LOAD_PLAN.LOAD_PLAN_CD:" + struct.getl_h_LOAD_PLAN_CD();
                 workList = entity.mDeleteT_LOAD_PLAN.read(conn, struct);
                 if (workList == null || workList.isEmpty()) {
                  // ���̏����ɂ��f�[�^�������������Ă��܂��B
                  // ���j���[�ɖ߂��Ă�蒼���ĉ������B
                  ExpjMessage emsg = new ExpjMessage("ZZ01105");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", bufKey);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  return;
                 }
              
                 workStruct = (AL0050010Struct)workList.get(0);
                 if (workStruct.getl_h_MODIFY_COUNT().equals(
                   struct.getl_h_MODIFY_COUNT()) == false)
                 {
                  // ���̏����ɂ��f�[�^�������������Ă��܂��B
                  // ���j���[�ɖ߂��Ă�蒼���ĉ������B
                  ExpjMessage emsg = new ExpjMessage("ZZ01105");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", bufKey);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  return;
                 }
              
                 // ���C����ʂ̌���������ێ�
                 saveMainToSub1Hidden();
              
                 // ���׌v����Č���
                 workList = entity.mSelectT_LOAD_PLAN.read(conn, struct);
                 if (workList == null || workList.isEmpty()) {
                  // �Ώۃf�[�^�����݂��܂���B
                  ExpjMessage emsg = new ExpjMessage("ZZ06001");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", bufKey);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  return;
                 }
              
                 // �T�u�P��ʂɒl��ݒ�
                 setSub1Struct((AL0050010Struct)workList.get(0));
              
                 // �Ɩ��^�p���擾
                 bufKey = "SYS_DATE_CTRL.PLANT_CD:" + struct.geth_PLANT_CD();
                 workList = entity.mSelectSYS_DATE_CTRL.read(conn, struct);
                 if (workList == null || workList.isEmpty()) {
                  // �Ɩ��^�p�������݂��܂���
                  ExpjMessage emsg = new ExpjMessage("AL60002");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", bufKey);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  return;
                 }
              
                 workStruct = (AL0050010Struct)workList.get(0);
                 struct.setSUB1_h_PRD_DUE_DATE(workStruct.getSUB1_h_PRD_DUE_DATE());
                 struct.setSUB1_h_l_JOB_ODR_CD(struct.getl_JOB_ODR_CD());
                 struct.setSUB1_h_l_ITEM_CD(struct.getl_ITEM_CD());
              
                } catch (SQLException se) {
                 // �T�[�o�ŃG���[���������܂����B
                 ExpjMessage emsg = new ExpjMessage("ZZ01106");
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(se, emsg);
                 emsg = new ExpjMessage("ZZ01006", bufKey);
                 sysLog.severe(emsg, getsysUSER_CD());
                 emsg = new ExpjMessage("ZZ01006", se.toString());
                 sysLog.severe(emsg, getsysUSER_CD());
                 throw ee;
                } catch (Exception e) {
                 ExpjException ee = null;
                 if (e instanceof ExpjException) {
                  ee = (ExpjException)e;
                  sysLog.severe(ee.getExpjMessage(), getsysUSER_CD());
                 } else {
                  // �T�[�o�ŃG���[���������܂����B
                  ExpjMessage emsg = new ExpjMessage("ZZ01106");
                  sysLog.severe(emsg, getsysUSER_CD());
                  ee = new ExpjException(e, emsg);
                  emsg = new ExpjMessage("ZZ01006", e.toString());
                  sysLog.severe(emsg, getsysUSER_CD());
                 }
                 throw ee;
                }
              
                //}}user_implement_dev:<controlLineUpdate>
		logger.exiting("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlLineUpdate");

		return;
	}

	/**
	 * �s�폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlLineDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0050");
		logger.entering("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlLineDelete");
			//{{user_implement_dev:<controlLineDelete>
              
                // �⏕���b�Z�[�W(�L�[����)
                String bufKey = null;
              
                try {
                 int dummyRet = 0;
              
                 // �g�����U�N�V�����J�n
                 conn.beginTransWeb();
              
                 // �X�V�����擾
                 bufKey = "T_LOAD_PLAN.LOAD_PLAN_CD:" + struct.getl_h_LOAD_PLAN_CD();
                 List workList = entity.mDeleteT_LOAD_PLAN.read(conn, struct);
                 if (workList == null || workList.isEmpty()) {
                  // ���̏����ɂ��f�[�^�������������Ă��܂��B
                  // ���j���[�ɖ߂��Ă�蒼���ĉ������B
                  ExpjMessage emsg = new ExpjMessage("ZZ01105");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", bufKey);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  return;
                 }
              
                 AL0050010Struct workStruct = (AL0050010Struct)workList.get(0);
                 if (workStruct.getl_h_MODIFY_COUNT().equals(
                   struct.getl_h_MODIFY_COUNT()) == false)
                 {
                  // ���̏����ɂ��f�[�^�������������Ă��܂��B
                  // ���j���[�ɖ߂��Ă�蒼���ĉ������B
                  ExpjMessage emsg = new ExpjMessage("ZZ01105");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", bufKey);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  return;
                 }
              
                 // [���׌v��]�폜
                 bufKey = "T_LOAD_PLAN.LOAD_PLAN_CD:" + struct.getl_h_LOAD_PLAN_CD();
                 dummyRet = entity.mDeleteT_LOAD_PLAN.delete(conn, struct);
              
                 // [�V�~�����[�V�������ז���]�폜
                 bufKey = "T_SIM_LOAD_DETAIL.LOAD_PLAN_CD:" + struct.getl_h_LOAD_PLAN_CD();
                 dummyRet = entity.mDeleteT_SIM_LOAD_DETAIL.delete(conn, struct);
              
                 // �R�~�b�g
                 conn.commit();
              
                 // ��ʂ̍ĕ\��
                 _reloadFlag = true;
                 controlSelect();
                 _reloadFlag = false;
              
                } catch (SQLException se) {
                 // �T�[�o�ŃG���[���������܂����B
                 ExpjMessage emsg = new ExpjMessage("ZZ01106");
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(se, emsg);
                 emsg = new ExpjMessage("ZZ01006", bufKey);
                 sysLog.severe(emsg, getsysUSER_CD());
                 emsg = new ExpjMessage("ZZ01006", se.toString());
                 sysLog.severe(emsg, getsysUSER_CD());
                 throw ee;
                } catch (Exception e) {
                 ExpjException ee = null;
                 if (e instanceof ExpjException) {
                  ee = (ExpjException)e;
                  sysLog.severe(ee.getExpjMessage(), getsysUSER_CD());
                 } else {
                  // �T�[�o�ŃG���[���������܂����B
                  ExpjMessage emsg = new ExpjMessage("ZZ01106");
                  sysLog.severe(emsg, getsysUSER_CD());
                  ee = new ExpjException(e, emsg);
                  emsg = new ExpjMessage("ZZ01006", e.toString());
                  sysLog.severe(emsg, getsysUSER_CD());
                 }
                 throw ee;
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
              
                //}}user_implement_dev:<controlLineDelete>
		logger.exiting("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlLineDelete");

		return;
	}

	/**
	 * ���׌v�Z�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlLoadCulculate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0050");
		logger.entering("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlLoadCulculate");
			//{{user_implement_dev:<controlLoadCulculate>
              
                String bufKey= null;
                ExpjMessage emsg = null;
              
                try {
                 // �g�����U�N�V�����J�n
                 conn.beginTransWeb();
              
                 // �v���O����CD
                 struct.setPROGRAM_CD(sp.getProcId());
                 // �t�@���N�V������
                 struct.setFUNCTION_NAME("SQLLOADCALC");
                 // �o�b�`�p�����[�^�擾
                 bufKey = "SYS_BAT_PARM.PROGRAM_CD,FUNCTION_NAME:" + struct.getPROGRAM_CD() + ","
                   + struct.getFUNCTION_NAME();
                 List workList = entity.mSelectSYS_BAT_PARM.read(conn, struct);
                 if (workList == null || workList.isEmpty()) {
                  // �o�b�`�p�����[�^�̓Ǎ��Ɏ��s���܂����B
                  emsg = new ExpjMessage("ZZ09007");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", bufKey);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  return;
                 }
              
                 // �o�b�`�������J�n���܂����B
                 emsg = new ExpjMessage("ZZ09001");
                 msgStruct.addInfo(emsg);
                 sysLog.info(emsg, getsysUSER_CD());
              
                 AL0050010Struct workStruct = (AL0050010Struct)workList.get(0);
              
                 // �X�g�A�h�v���V�[�W���̃p�����[�^��ݒ�
                 struct.setpvc2LogMode(workStruct.getLOG_MODE_TYP().toString());
                 struct.setpvc2OutputMode(workStruct.getOUTPUT_MODE_TYP().toString());
                 struct.setpvc2OutputPath(workStruct.getFILE_PATH());
                 struct.setpvc2OutputName(workStruct.getFILE_NAME());
                 struct.setpvc2UserId(getsysUSER_CD());
                 struct.setpvc2BusinessName(sp.getProcId());
                 struct.setpvc2PlantCd(getsysPLANT_CD());
              
                 try {
                  // �X�g�A�h�v���V�[�W�����s
                  bufKey = "SQLLOADCALC:"
                    + struct.getpvc2LogMode() + "," + struct.getpvc2OutputMode() + ","
                    + struct.getpvc2OutputPath()  + "," + struct.getpvc2OutputName() + ","
                    + struct.getpvc2UserId() + "," + struct.getpvc2BusinessName() + ","
                    + struct.getpvc2PlantCd();
                  entity.mCallSqlLoadCalc.call(conn, struct);
              
                  if (struct.getpnumReturn().intValue() != 0) {
                   // ���׌v�Z�o�b�`���ُ�I�����܂����B
                   emsg = new ExpjMessage("AL50009");
                   msgStruct.addError(emsg);
                   sysLog.warning(emsg, getsysUSER_CD());
                   emsg = new ExpjMessage("ZZ01006", bufKey);
                   msgStruct.addError(emsg);
                   sysLog.warning(emsg, getsysUSER_CD());
                   return;
                  }
              
                  // �o�b�`�������I�����܂����B
                  emsg = new ExpjMessage("ZZ09002");
                  msgStruct.addInfo(emsg);
                  sysLog.info(emsg, getsysUSER_CD());
              
                 } catch (SQLException se) {
                  if (se.getErrorCode() == 6550) {
                   // �G���[���b�Z�[�W�쐬
                   emsg = new ExpjMessage("ZZ01006", se.getMessage().replaceAll("\n", " "));
                   msgStruct.addError(emsg);
                   sysLog.warning(emsg, getsysUSER_CD());
                   emsg = new ExpjMessage("ZZ01006", bufKey);
                   msgStruct.addError(emsg);
                   sysLog.warning(emsg, getsysUSER_CD());
                  } else {
                   throw se;
                  }
                 }
              
                 // �f�[�^���m��
                 conn.commit();
              
                } catch (SQLException se) {
                 // �T�[�o�ŃG���[���������܂����B
                 emsg = new ExpjMessage("ZZ01106");
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(se, emsg);
                 emsg = new ExpjMessage("ZZ01006", bufKey);
                 sysLog.severe(emsg, getsysUSER_CD());
                 emsg = new ExpjMessage("ZZ01006", se.toString());
                 sysLog.severe(emsg, getsysUSER_CD());
                 throw ee;
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
              
                //}}user_implement_dev:<controlLoadCulculate>
		logger.exiting("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlLoadCulculate");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0050");
		logger.entering("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
              
                // Struct���N���A
                clearStruct();
              
                // �Ǎ���ԁi�����\����ԁj��ݒ�
                setReadStatus(INITIAL);
              
                // �ēǂݍ��݃t���O�ݒ�(���Ǎ�)
                _reloadFlag = false;
              
                //}}user_implement_dev:<controlClear>
		logger.exiting("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0050");
		logger.entering("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0050");
		logger.entering("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
              
                // �⏕���b�Z�[�W(�L�[����)
                String bufKey = null;
              
                try {
                 List workList = null;
                 AL0050010Struct workStruct = null;
              
                 //�g�����U�N�V�����J�n
                 conn.beginTransWeb();
              
                 // �̔�
                 Numbering LOAD_PLAN_CD = new Numbering(conn, Numbering.LOAD_PLAN_CD, getsysUSER_CD(),
                   sp.getProcId(), getsysPLANT_CD());
                 struct.setSUB1_h_LOAD_PLAN_CD(LOAD_PLAN_CD.getNo());
              
                 // �H��R�[�h
                 struct.setSUB1_h_PLANT_CD(getsysPLANT_CD());
              
                 // �i�ڃ}�X�^������
                 struct.setd_ITEM_CD(struct.getSUB1_ITEM_CD());
                 bufKey = "M_ITEM.ITEM_CD:" + struct.getd_ITEM_CD();
                 workList = entity.mSelectItemCD.read(conn,struct);
                 if (workList == null || workList.isEmpty()) {
                  // �i�ڔԍ����}�X�^�ɑ��݂��܂���B
                  ExpjMessage emsg = new ExpjMessage("AL50004");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", bufKey);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  return;
                 }
              
                 // ��ʏ�̂̕i�ڔԍ�����LT���擾
                 bufKey = "M_ITEM.ITEM_CD:" + struct.getSUB1_ITEM_CD();
                 workList = entity.mSelectItemLT.read(conn, struct);
                 workStruct = (AL0050010Struct)workList.get(0);
                 int intItemLt = Integer.parseInt(workStruct.getd_ITEM_LT());
                 // ��ʏ�̐����[�����擾
                 Date datePrdDueDate = Converter.strToDate(struct.getSUB1_PRD_DUE_DATE(),
                   Converter.SLASH_DATE);
                 // ����������擾
                 WorkCalendar wdayPrdStartDate = new WorkCalendar(conn, getsysUSER_CD(), sp.getProcId(),
                   getsysPLANT_CD(), datePrdDueDate, -1 * intItemLt, false);
                 String strPrdStartDate = Converter.dateToStr(wdayPrdStartDate.calcDate(),
                   Converter.SLASH_DATE);
              
                 if (strPrdStartDate == null) {
                  // ������������擾�̏ꍇ�̓G���[
                  // �J�����_���׃f�[�^�����݂��܂���B
                  ExpjMessage emsg = new ExpjMessage("ZZ06002");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  return;
                 }
              
                 struct.setSUB1_h_PRD_START_DATE(strPrdStartDate);
              
                 // �v��o�^�҂��擾
                 struct.setSUB1_h_ENTRY_BY(getsysUSER_CD());
              
                 // �ǉ�
                 bufKey = "T_LOAD_PLAN.JOB_ODR_CD,ITEM_CD,PRD_DUE_DATE,PLANT_CD:"
                   + struct.getSUB1_JOB_ODR_CD() + "," + struct.getSUB1_ITEM_CD() + ","
                   + struct.getSUB1_PRD_DUE_DATE() + "," + struct.getSUB1_h_PLANT_CD();
                 int dummyRet = entity.mInsertT_LOAD_PLAN.create(conn, struct);
              
                 // �R�~�b�g
                 conn.commit();
              
                 // �Č���
                 controlReturn();
              
                } catch (SQLException se) {
                 // �T�[�o�ŃG���[���������܂����B
                 ExpjMessage emsg = new ExpjMessage("ZZ01106");
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(se, emsg);
                 emsg = new ExpjMessage("ZZ01006", bufKey);
                 sysLog.severe(emsg, getsysUSER_CD());
                 emsg = new ExpjMessage("ZZ01006", se.toString());
                 sysLog.severe(emsg, getsysUSER_CD());
                 throw ee;
                } catch (Exception e) {
                 ExpjException ee = null;
                 if (e instanceof ExpjException) {
                  ee = (ExpjException)e;
                  sysLog.severe(ee.getExpjMessage(), getsysUSER_CD());
                 } else {
                  // �T�[�o�ŃG���[���������܂����B
                  ExpjMessage emsg = new ExpjMessage("ZZ01106");
                  sysLog.severe(emsg, getsysUSER_CD());
                  ee = new ExpjException(e, emsg);
                  emsg = new ExpjMessage("ZZ01006", e.toString());
                  sysLog.severe(emsg, getsysUSER_CD());
                 }
                 throw ee;
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
              
                //}}user_implement_dev:<controlInsert>
		logger.exiting("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0050");
		logger.entering("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
              
                // �⏕���b�Z�[�W(�L�[����)
                String bufKey = null;
              
                try {
                 List workList = null;
                 AL0050010Struct workStruct = null;
                 int dummyRet = 0;
              
                 // �g�����U�N�V�����J�n
                 conn.beginTransWeb();
              
                 // �X�V�����擾
                 bufKey = "T_LOAD_PLAN.JOB_ODR_CD,ITEM_CD,PRD_DUE_DATE,PLANT_CD:"
                   + struct.getSUB1_JOB_ODR_CD() + "," + struct.getSUB1_ITEM_CD() + ","
                   + struct.getSUB1_PRD_DUE_DATE() + "," + struct.getSUB1_h_PLANT_CD();
                 workList = entity.mUpdateT_LOAD_PLAN.read(conn, struct);
                 if (workList == null || workList.isEmpty()) {
                  // ���̏����ɂ��f�[�^�������������Ă��܂��B
                  // ���j���[�ɖ߂��Ă�蒼���ĉ������B
                  ExpjMessage emsg = new ExpjMessage("ZZ01105");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", bufKey);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  return;
                 }
              
                 workStruct = (AL0050010Struct)workList.get(0);
                 if (workStruct.getSUB1_h_MODIFY_COUNT().equals(
                   struct.getSUB1_h_MODIFY_COUNT()) == false) {
                  // ���̏����ɂ��f�[�^�������������Ă��܂��B
                  // ���j���[�ɖ߂��Ă�蒼���ĉ������B
                  ExpjMessage emsg = new ExpjMessage("ZZ01105");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", bufKey);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  return;
                 }
              
                 // �i�ڃ}�X�^������
                 struct.setd_ITEM_CD(struct.getSUB1_ITEM_CD());
                 bufKey = "M_ITEM.ITEM_CD:" + struct.getd_ITEM_CD();
                 workList = entity.mSelectItemCD.read(conn,struct);
                 if (workList == null || workList.isEmpty()) {
                  // �i�ڔԍ����}�X�^�ɑ��݂��܂���B
                  ExpjMessage emsg = new ExpjMessage("AL50004");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", bufKey);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  return;
                 }
              
                 // ��ʏ�̂̕i�ڔԍ�����LT���擾
                 bufKey = "M_ITEM.ITEM_CD:" + struct.getSUB1_ITEM_CD();
                 workList = entity.mSelectItemLT.read(conn,struct);
                 workStruct = (AL0050010Struct)workList.get(0);
                 int intItemLt = Integer.parseInt(workStruct.getd_ITEM_LT());
              
                 // ��ʏ�̐����[�����擾
                 Date datePrdDueDate = Converter.strToDate(struct.getSUB1_PRD_DUE_DATE(),
                   Converter.SLASH_DATE);
              
                 // ����������擾
                 WorkCalendar wdayPrdStartDate = new WorkCalendar(conn, getsysUSER_CD(), sp.getProcId(),
                   getsysPLANT_CD(), datePrdDueDate, -1 * intItemLt, false);
                 String strPrdStartDate = Converter.dateToStr(wdayPrdStartDate.calcDate(),
                   Converter.SLASH_DATE);
              
                 if (strPrdStartDate == null) {
                  // ������������擾�̏ꍇ�̓G���[
                  // �J�����_���׃f�[�^�����݂��܂���B
                  ExpjMessage emsg = new ExpjMessage("ZZ06002");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  return;
                 }
              
                 struct.setSUB1_h_PRD_START_DATE(strPrdStartDate);
              
                 // �v��o�^�҂��擾
                 struct.setSUB1_h_ENTRY_BY(getsysUSER_CD());
              
                 // [���׌v��]�X�V
                 bufKey = "T_LOAD_PLAN.JOB_ODR_CD,ITEM_CD,PRD_DUE_DATE,PLANT_CD:"
                   + struct.getSUB1_JOB_ODR_CD() + "," + struct.getSUB1_ITEM_CD() + ","
                   + struct.getSUB1_PRD_DUE_DATE() + "," + struct.getSUB1_h_PLANT_CD();
                 dummyRet = entity.mUpdateT_LOAD_PLAN.update(conn, struct);
              
                 // [�V�~�����[�V�������ז���]�폜
                 bufKey = "T_SIM_LOAD_DETAIL.LOAD_PLAN_CD:" + struct.getl_h_LOAD_PLAN_CD();
                 dummyRet = entity.mUpdateT_SIM_LOAD_DETAIL.delete(conn,struct);
              
                 // �R�~�b�g
                 conn.commit();
              
                 // �Č���
                 controlReturn();
              
                } catch (SQLException se) {
                 // �T�[�o�ŃG���[���������܂����B
                 ExpjMessage emsg = new ExpjMessage("ZZ01106");
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(se, emsg);
                 emsg = new ExpjMessage("ZZ01006", bufKey);
                 sysLog.severe(emsg, getsysUSER_CD());
                 emsg = new ExpjMessage("ZZ01006", se.toString());
                 sysLog.severe(emsg, getsysUSER_CD());
                 throw ee;
                } catch (Exception e) {
                 ExpjException ee = null;
                 if (e instanceof ExpjException) {
                  ee = (ExpjException)e;
                  sysLog.severe(ee.getExpjMessage(), getsysUSER_CD());
                 } else {
                  // �T�[�o�ŃG���[���������܂����B
                  ExpjMessage emsg = new ExpjMessage("ZZ01106");
                  sysLog.severe(emsg, getsysUSER_CD());
                  ee = new ExpjException(e, emsg);
                  emsg = new ExpjMessage("ZZ01006", e.toString());
                  sysLog.severe(emsg, getsysUSER_CD());
                 }
                 throw ee;
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
              
                //}}user_implement_dev:<controlUpdate>
		logger.exiting("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlReturn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0050");
		logger.entering("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlReturn");
			//{{user_implement_dev:<controlReturn>
              
                // ���C����ʂ̌����������擾
                restoreMainFromSub1Hidden();
              
                if (struct.getSUB1_h_l_ITEM_CD() == null
                  || struct.getSUB1_h_l_ITEM_CD().equals("") == true)
                {
                 // �o�^�̏ꍇ
                 if (isInitialized()) {
                  // �Ǎ���Ԃ��G���[�łȂ��ꍇ
                  // ���C����ʂ̍ĕ\��
                  _reloadFlag = true;
                  controlSelect();
                  _reloadFlag = false;
                 }
                } else {
                 // �X�V�̏ꍇ
                 if (isShown()) {
                  // �Ǎ���Ԃ�����ł���ꍇ
                  // ���C����ʂ̍ĕ\��
                  _reloadFlag = true;
                  controlSelect();
                  _reloadFlag = false;
                 }
                }
              
                //}}user_implement_dev:<controlReturn>
		logger.exiting("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlReturn");

		return;
	}

	/**
	 * �s�ǉ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlLineInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0050");
		logger.entering("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlLineInsert");
			//{{user_implement_dev:<controlLineInsert>
              
                // �⏕���b�Z�[�W(�L�[����)
                String bufKey = null;
              
                try {
                 List workList = null;
                 AL0050010Struct workStruct = null;
              
                 // ���C����ʂ̌���������ێ�
                 saveMainToSub1Hidden();
              
                 // �T�u�P��ʂ��N���A
                 clearSub1Struct();
              
                 // ���C����ʂ̌����������T�u�P��ʂɐݒ�
                 struct.setSUB1_JOB_ODR_CD(struct.getJOB_ODR_CD());
                 struct.setSUB1_ITEM_CD(struct.getITEM_CD());
              
                 if (struct.getSUB1_ITEM_CD() != null && struct.getSUB1_ITEM_CD().equals("") == false) {
                  // �i�ڃ}�X�^������
                  struct.setd_ITEM_CD(struct.getSUB1_ITEM_CD());
                  bufKey = "M_ITEM.ITEM_CD:" + struct.getd_ITEM_CD();
                  workList = entity.mSelectItemCD.read(conn,struct);
                  if (workList == null || workList.isEmpty()) {
                   // �i�ڔԍ����}�X�^�ɑ��݂��܂���B
                   ExpjMessage emsg = new ExpjMessage("AL50004");
                   msgStruct.addError(emsg);
                   sysLog.warning(emsg, getsysUSER_CD());
                   emsg = new ExpjMessage("ZZ01006", bufKey);
                   msgStruct.addError(emsg);
                   sysLog.warning(emsg, getsysUSER_CD());
                   return;
                  }
                  workStruct = (AL0050010Struct)workList.get(0);
                  struct.setSUB1_ITEM_NAME(workStruct.getITEM_NAME());
                 }
              
                 // �Ɩ��^�p���擾
                 bufKey = "SYS_DATE_CTRL.PLANT_CD:" + struct.geth_PLANT_CD();
                 workList = entity.mSelectSYS_DATE_CTRL.read(conn, struct);
                 if (workList == null || workList.isEmpty()) {
                  // �Ɩ��^�p�������݂��܂���
                  ExpjMessage emsg = new ExpjMessage("AL60002");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", bufKey);
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                  return;
                 }
              
                 workStruct = (AL0050010Struct)workList.get(0);
                 struct.setSUB1_PRD_DUE_DATE(workStruct.getSUB1_h_PRD_DUE_DATE());
                 struct.setSUB1_h_PRD_DUE_DATE(workStruct.getSUB1_h_PRD_DUE_DATE());
              
                } catch (SQLException se) {
                 // �T�[�o�ŃG���[���������܂����B
                 ExpjMessage emsg = new ExpjMessage("ZZ01106");
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(se, emsg);
                 emsg = new ExpjMessage("ZZ01006", bufKey);
                 sysLog.severe(emsg, getsysUSER_CD());
                 emsg = new ExpjMessage("ZZ01006", se.toString());
                 sysLog.severe(emsg, getsysUSER_CD());
                 throw ee;
                } catch (Exception e) {
                 ExpjException ee = null;
                 if (e instanceof ExpjException) {
                  ee = (ExpjException)e;
                  sysLog.severe(ee.getExpjMessage(), getsysUSER_CD());
                 } else {
                  // �T�[�o�ŃG���[���������܂����B
                  ExpjMessage emsg = new ExpjMessage("ZZ01106");
                  sysLog.severe(emsg, getsysUSER_CD());
                  ee = new ExpjException(e, emsg);
                  emsg = new ExpjMessage("ZZ01006", e.toString());
                  sysLog.severe(emsg, getsysUSER_CD());
                 }
                 throw ee;
                }
              
                //}}user_implement_dev:<controlLineInsert>
		logger.exiting("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlLineInsert");

		return;
	}

	/**
	 * �S�폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlDeleteAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0050");
		logger.entering("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlDeleteAll");
			//{{user_implement_dev:<controlDeleteAll>
              
                // �⏕���b�Z�[�W(�L�[����)
                String bufKey = null;
              
                try {
                 AL0050010Struct workStruct = null;
                 int dummyRet = 0;
              
                 // �g�����U�N�V�����J�n
                 conn.beginTransWeb();
              
                 if (list == null || list.isEmpty()) {
                  return;
                 }
              
                 int listSize = list.size();
                 for (int i = 0; i < listSize; i++) {
                  // �����L�[��ݒ�
                  workStruct = (AL0050010Struct)list.get(i);
                  struct.setl_h_LOAD_PLAN_CD(workStruct.getl_h_LOAD_PLAN_CD());
                  struct.setl_h_MODIFY_COUNT(workStruct.getl_h_MODIFY_COUNT());
              
                  // �X�V�����擾
                  bufKey = "T_LOAD_PLAN.LOAD_PLAN_CD:" + struct.getl_h_LOAD_PLAN_CD();
                  List workList = entity.mDeleteT_LOAD_PLAN.read(conn, struct);
                  if (workList == null || workList.isEmpty()) {
                   // ���̏����ɂ��f�[�^�������������Ă��܂��B
                   // ���j���[�ɖ߂��Ă�蒼���ĉ������B
                   ExpjMessage emsg = new ExpjMessage("ZZ01105");
                   msgStruct.addError(emsg);
                   sysLog.warning("ZZ01105", getsysUSER_CD());
                   emsg = new ExpjMessage("ZZ01006", bufKey);
                   msgStruct.addError(emsg);
                   sysLog.warning(emsg, getsysUSER_CD());
                   return;
                  }
              
                  workStruct = (AL0050010Struct)workList.get(0);
                  if (workStruct.getl_h_MODIFY_COUNT().equals(
                    struct.getl_h_MODIFY_COUNT()) == false)
                  {
                   // ���̏����ɂ��f�[�^�������������Ă��܂��B
                   // ���j���[�ɖ߂��Ă�蒼���ĉ������B
                   ExpjMessage emsg = new ExpjMessage("ZZ01105");
                   msgStruct.addError(emsg);
                   sysLog.warning("ZZ01105", getsysUSER_CD());
                   emsg = new ExpjMessage("ZZ01006", bufKey);
                   msgStruct.addError(emsg);
                   sysLog.warning(emsg, getsysUSER_CD());
                   return;
                  }
              
                  // [���׌v��]�폜
                  dummyRet = entity.mDeleteT_LOAD_PLAN.delete(conn, struct);
              
                  // [�V�~�����[�V�������ז���]�폜
                  bufKey = "T_SIM_LOAD_DETAIL.LOAD_PLAN_CD:" + struct.getl_h_LOAD_PLAN_CD();
                  dummyRet = entity.mDeleteT_SIM_LOAD_DETAIL.delete(conn, struct);
                 }
              
                 // �R�~�b�g
                 conn.commit();
              
                 // ��ʂ̍ĕ\��
                 _reloadFlag = true;
                 controlSelect();
                 _reloadFlag = false;
              
                } catch (SQLException se) {
                 // �T�[�o�ŃG���[���������܂����B
                 ExpjMessage emsg = new ExpjMessage("ZZ01106");
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(se, emsg);
                 emsg = new ExpjMessage("ZZ01006", bufKey);
                 sysLog.severe(emsg, getsysUSER_CD());
                 emsg = new ExpjMessage("ZZ01006", se.toString());
                 sysLog.severe(emsg, getsysUSER_CD());
                 throw ee;
                } catch (Exception e) {
                 ExpjException ee = null;
                 if (e instanceof ExpjException) {
                  ee = (ExpjException)e;
                  sysLog.severe(ee.getExpjMessage(), getsysUSER_CD());
                 } else {
                  // �T�[�o�ŃG���[���������܂����B
                  ExpjMessage emsg = new ExpjMessage("ZZ01106");
                  sysLog.severe(emsg, getsysUSER_CD());
                  ee = new ExpjException(e, emsg);
                  emsg = new ExpjMessage("ZZ01006", e.toString());
                  sysLog.severe(emsg, getsysUSER_CD());
                 }
                 throw ee;
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
              
                //}}user_implement_dev:<controlDeleteAll>
		logger.exiting("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlDeleteAll");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0050");
		logger.entering("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0050");
		logger.entering("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
              
                // Struct���N���A
                clearStruct();
              
                // �Ǎ���ԁi�����\����ԁj��ݒ�
                setReadStatus(INITIAL);
              
                // �ēǂݍ��݃t���O�ݒ�(���Ǎ�)
                _reloadFlag = false;
              
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0050");
		logger.entering("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
              //			conn.beginTransWeb();
                 // �R���{�{�b�N�X���i�̃f�[�^�̃Z�b�g�͂����ɋL�q���Ă��������B
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AL0050010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("LineCopy") ) {
				controlLineCopy();
			} else if( button.equals("LineUpdate") ) {
				controlLineUpdate();
			} else if( button.equals("LineDelete") ) {
				controlLineDelete();
			} else if( button.equals("LoadCulculate") ) {
				controlLoadCulculate();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("Insert") ) {
				controlInsert();
			} else if( button.equals("Update") ) {
				controlUpdate();
			} else if( button.equals("Return") ) {
				controlReturn();
			} else if( button.equals("LineInsert") ) {
				controlLineInsert();
			} else if( button.equals("DeleteAll") ) {
				controlDeleteAll();
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
//			throw new FoundationException("AL0050010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AL0050010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AL0050010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AL0050010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AL0050010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AL0050010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AL0050010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AL0050010Entity entity;
	protected AL0050010Struct struct;
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

		entity = new AL0050010Entity();
		struct = new AL0050010Struct();

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
	 * AL0050010�N���X�̕W���R���X�g���N�^
	 */
	public AL0050010Control() throws BusinessProcessException, FoundationException
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
				AL0050010Struct key = (AL0050010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("l_h_LOAD_PLAN_CD") && key.getl_h_LOAD_PLAN_CD() != null) {
					msgKey.setKeyValue("l_h_LOAD_PLAN_CD", key.getl_h_LOAD_PLAN_CD());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD") && key.getl_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CD", key.getl_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_CD") && key.getl_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ITEM_CD", key.getl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_NAME") && key.getl_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ITEM_NAME", key.getl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_PRD_DUE_DATE") && key.getl_PRD_DUE_DATE() != null) {
					msgKey.setKeyValue("l_PRD_DUE_DATE", key.getl_PRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_QTY") && key.getl_ODR_QTY() != null) {
					msgKey.setKeyValue("l_ODR_QTY", key.getl_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_h_MODIFY_COUNT") && key.getl_h_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("l_h_MODIFY_COUNT", key.getl_h_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_CD") && key.getl_CUST_CD() != null) {
					msgKey.setKeyValue("l_CUST_CD", key.getl_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("l_LOAD_PLAN_COMMENT") && key.getl_LOAD_PLAN_COMMENT() != null) {
					msgKey.setKeyValue("l_LOAD_PLAN_COMMENT", key.getl_LOAD_PLAN_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("PRD_DUE_DATE_FROM") && key.getPRD_DUE_DATE_FROM() != null) {
					msgKey.setKeyValue("PRD_DUE_DATE_FROM", key.getPRD_DUE_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("PRD_DUE_DATE_TO") && key.getPRD_DUE_DATE_TO() != null) {
					msgKey.setKeyValue("PRD_DUE_DATE_TO", key.getPRD_DUE_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("h_PLANT_CD") && key.geth_PLANT_CD() != null) {
					msgKey.setKeyValue("h_PLANT_CD", key.geth_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("SUB1_JOB_ODR_CD") && key.getSUB1_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("SUB1_JOB_ODR_CD", key.getSUB1_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("SUB1_ITEM_CD") && key.getSUB1_ITEM_CD() != null) {
					msgKey.setKeyValue("SUB1_ITEM_CD", key.getSUB1_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("SUB1_PRD_DUE_DATE") && key.getSUB1_PRD_DUE_DATE() != null) {
					msgKey.setKeyValue("SUB1_PRD_DUE_DATE", key.getSUB1_PRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("SUB1_ODR_QTY") && key.getSUB1_ODR_QTY() != null) {
					msgKey.setKeyValue("SUB1_ODR_QTY", key.getSUB1_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("SUB1_CUST_CD") && key.getSUB1_CUST_CD() != null) {
					msgKey.setKeyValue("SUB1_CUST_CD", key.getSUB1_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("SUB1_LOAD_PLAN_COMMENT") && key.getSUB1_LOAD_PLAN_COMMENT() != null) {
					msgKey.setKeyValue("SUB1_LOAD_PLAN_COMMENT", key.getSUB1_LOAD_PLAN_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("SUB1_h_LOAD_PLAN_CD") && key.getSUB1_h_LOAD_PLAN_CD() != null) {
					msgKey.setKeyValue("SUB1_h_LOAD_PLAN_CD", key.getSUB1_h_LOAD_PLAN_CD());
				}
				if(msgKeyType.containsKeyColumn("SUB1_h_PLANT_CD") && key.getSUB1_h_PLANT_CD() != null) {
					msgKey.setKeyValue("SUB1_h_PLANT_CD", key.getSUB1_h_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("SUB1_h_ENTRY_BY") && key.getSUB1_h_ENTRY_BY() != null) {
					msgKey.setKeyValue("SUB1_h_ENTRY_BY", key.getSUB1_h_ENTRY_BY());
				}
				if(msgKeyType.containsKeyColumn("SUB1_h_PRD_START_DATE") && key.getSUB1_h_PRD_START_DATE() != null) {
					msgKey.setKeyValue("SUB1_h_PRD_START_DATE", key.getSUB1_h_PRD_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("SUB1_h_MODIFY_COUNT") && key.getSUB1_h_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("SUB1_h_MODIFY_COUNT", key.getSUB1_h_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("d_ITEM_LT") && key.getd_ITEM_LT() != null) {
					msgKey.setKeyValue("d_ITEM_LT", key.getd_ITEM_LT());
				}
				if(msgKeyType.containsKeyColumn("d_ITEM_CD") && key.getd_ITEM_CD() != null) {
					msgKey.setKeyValue("d_ITEM_CD", key.getd_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("pvc2LogMode") && key.getpvc2LogMode() != null) {
					msgKey.setKeyValue("pvc2LogMode", key.getpvc2LogMode());
				}
				if(msgKeyType.containsKeyColumn("pvc2OutputMode") && key.getpvc2OutputMode() != null) {
					msgKey.setKeyValue("pvc2OutputMode", key.getpvc2OutputMode());
				}
				if(msgKeyType.containsKeyColumn("pvc2OutputPath") && key.getpvc2OutputPath() != null) {
					msgKey.setKeyValue("pvc2OutputPath", key.getpvc2OutputPath());
				}
				if(msgKeyType.containsKeyColumn("pvc2OutputName") && key.getpvc2OutputName() != null) {
					msgKey.setKeyValue("pvc2OutputName", key.getpvc2OutputName());
				}
				if(msgKeyType.containsKeyColumn("pvc2UserId") && key.getpvc2UserId() != null) {
					msgKey.setKeyValue("pvc2UserId", key.getpvc2UserId());
				}
				if(msgKeyType.containsKeyColumn("pvc2BusinessName") && key.getpvc2BusinessName() != null) {
					msgKey.setKeyValue("pvc2BusinessName", key.getpvc2BusinessName());
				}
				if(msgKeyType.containsKeyColumn("pvc2PlantCd") && key.getpvc2PlantCd() != null) {
					msgKey.setKeyValue("pvc2PlantCd", key.getpvc2PlantCd());
				}
				if(msgKeyType.containsKeyColumn("pnumReturn") && key.getpnumReturn() != null) {
					msgKey.setKeyValue("pnumReturn", key.getpnumReturn().toString());
				}
				if(msgKeyType.containsKeyColumn("PROGRAM_CD") && key.getPROGRAM_CD() != null) {
					msgKey.setKeyValue("PROGRAM_CD", key.getPROGRAM_CD());
				}
				if(msgKeyType.containsKeyColumn("FUNCTION_NAME") && key.getFUNCTION_NAME() != null) {
					msgKey.setKeyValue("FUNCTION_NAME", key.getFUNCTION_NAME());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_GROUP_CD") && key.getBUSINESS_GROUP_CD() != null) {
					msgKey.setKeyValue("BUSINESS_GROUP_CD", key.getBUSINESS_GROUP_CD());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_CD") && key.getBUSINESS_CD() != null) {
					msgKey.setKeyValue("BUSINESS_CD", key.getBUSINESS_CD());
				}
				if(msgKeyType.containsKeyColumn("FILE_PATH") && key.getFILE_PATH() != null) {
					msgKey.setKeyValue("FILE_PATH", key.getFILE_PATH());
				}
				if(msgKeyType.containsKeyColumn("FILE_NAME") && key.getFILE_NAME() != null) {
					msgKey.setKeyValue("FILE_NAME", key.getFILE_NAME());
				}
				if(msgKeyType.containsKeyColumn("LOG_MODE_TYP") && key.getLOG_MODE_TYP() != null) {
					msgKey.setKeyValue("LOG_MODE_TYP", key.getLOG_MODE_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("OUTPUT_MODE_TYP") && key.getOUTPUT_MODE_TYP() != null) {
					msgKey.setKeyValue("OUTPUT_MODE_TYP", key.getOUTPUT_MODE_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("SUB1_h_PRD_DUE_DATE") && key.getSUB1_h_PRD_DUE_DATE() != null) {
					msgKey.setKeyValue("SUB1_h_PRD_DUE_DATE", key.getSUB1_h_PRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("SUB1_ITEM_NAME") && key.getSUB1_ITEM_NAME() != null) {
					msgKey.setKeyValue("SUB1_ITEM_NAME", key.getSUB1_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("MAIN_h_PLANT_CD") && key.getMAIN_h_PLANT_CD() != null) {
					msgKey.setKeyValue("MAIN_h_PLANT_CD", key.getMAIN_h_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("MAIN_h_JOB_ODR_CD") && key.getMAIN_h_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("MAIN_h_JOB_ODR_CD", key.getMAIN_h_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("MAIN_h_ITEM_CD") && key.getMAIN_h_ITEM_CD() != null) {
					msgKey.setKeyValue("MAIN_h_ITEM_CD", key.getMAIN_h_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("MAIN_h_PRD_DUE_DATE_FROM") && key.getMAIN_h_PRD_DUE_DATE_FROM() != null) {
					msgKey.setKeyValue("MAIN_h_PRD_DUE_DATE_FROM", key.getMAIN_h_PRD_DUE_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("MAIN_h_PRD_DUE_DATE_TO") && key.getMAIN_h_PRD_DUE_DATE_TO() != null) {
					msgKey.setKeyValue("MAIN_h_PRD_DUE_DATE_TO", key.getMAIN_h_PRD_DUE_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("SUB1_h_l_JOB_ODR_CD") && key.getSUB1_h_l_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("SUB1_h_l_JOB_ODR_CD", key.getSUB1_h_l_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("SUB1_h_l_ITEM_CD") && key.getSUB1_h_l_ITEM_CD() != null) {
					msgKey.setKeyValue("SUB1_h_l_ITEM_CD", key.getSUB1_h_l_ITEM_CD());
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
					AL0050010Struct key = new AL0050010Struct();
					if(msgKeyType.containsKeyColumn("l_h_LOAD_PLAN_CD")) {
						key.setl_h_LOAD_PLAN_CD(msgKey.getKeyValue("l_h_LOAD_PLAN_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD")) {
						key.setl_JOB_ODR_CD(msgKey.getKeyValue("l_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_CD")) {
						key.setl_ITEM_CD(msgKey.getKeyValue("l_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_NAME")) {
						key.setl_ITEM_NAME(msgKey.getKeyValue("l_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_PRD_DUE_DATE")) {
						key.setl_PRD_DUE_DATE(msgKey.getKeyValue("l_PRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_QTY")) {
						key.setl_ODR_QTY(msgKey.getKeyValue("l_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_h_MODIFY_COUNT")) {
						key.setl_h_MODIFY_COUNT(msgKey.getKeyValue("l_h_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_CD")) {
						key.setl_CUST_CD(msgKey.getKeyValue("l_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_LOAD_PLAN_COMMENT")) {
						key.setl_LOAD_PLAN_COMMENT(msgKey.getKeyValue("l_LOAD_PLAN_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("PRD_DUE_DATE_FROM")) {
						key.setPRD_DUE_DATE_FROM(msgKey.getKeyValue("PRD_DUE_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("PRD_DUE_DATE_TO")) {
						key.setPRD_DUE_DATE_TO(msgKey.getKeyValue("PRD_DUE_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("h_PLANT_CD")) {
						key.seth_PLANT_CD(msgKey.getKeyValue("h_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("SUB1_JOB_ODR_CD")) {
						key.setSUB1_JOB_ODR_CD(msgKey.getKeyValue("SUB1_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("SUB1_ITEM_CD")) {
						key.setSUB1_ITEM_CD(msgKey.getKeyValue("SUB1_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("SUB1_PRD_DUE_DATE")) {
						key.setSUB1_PRD_DUE_DATE(msgKey.getKeyValue("SUB1_PRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SUB1_ODR_QTY")) {
						key.setSUB1_ODR_QTY(msgKey.getKeyValue("SUB1_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SUB1_CUST_CD")) {
						key.setSUB1_CUST_CD(msgKey.getKeyValue("SUB1_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("SUB1_LOAD_PLAN_COMMENT")) {
						key.setSUB1_LOAD_PLAN_COMMENT(msgKey.getKeyValue("SUB1_LOAD_PLAN_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("SUB1_h_LOAD_PLAN_CD")) {
						key.setSUB1_h_LOAD_PLAN_CD(msgKey.getKeyValue("SUB1_h_LOAD_PLAN_CD"));
					}
					if(msgKeyType.containsKeyColumn("SUB1_h_PLANT_CD")) {
						key.setSUB1_h_PLANT_CD(msgKey.getKeyValue("SUB1_h_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("SUB1_h_ENTRY_BY")) {
						key.setSUB1_h_ENTRY_BY(msgKey.getKeyValue("SUB1_h_ENTRY_BY"));
					}
					if(msgKeyType.containsKeyColumn("SUB1_h_PRD_START_DATE")) {
						key.setSUB1_h_PRD_START_DATE(msgKey.getKeyValue("SUB1_h_PRD_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SUB1_h_MODIFY_COUNT")) {
						key.setSUB1_h_MODIFY_COUNT(msgKey.getKeyValue("SUB1_h_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("d_ITEM_LT")) {
						key.setd_ITEM_LT(msgKey.getKeyValue("d_ITEM_LT"));
					}
					if(msgKeyType.containsKeyColumn("d_ITEM_CD")) {
						key.setd_ITEM_CD(msgKey.getKeyValue("d_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("pvc2LogMode")) {
						key.setpvc2LogMode(msgKey.getKeyValue("pvc2LogMode"));
					}
					if(msgKeyType.containsKeyColumn("pvc2OutputMode")) {
						key.setpvc2OutputMode(msgKey.getKeyValue("pvc2OutputMode"));
					}
					if(msgKeyType.containsKeyColumn("pvc2OutputPath")) {
						key.setpvc2OutputPath(msgKey.getKeyValue("pvc2OutputPath"));
					}
					if(msgKeyType.containsKeyColumn("pvc2OutputName")) {
						key.setpvc2OutputName(msgKey.getKeyValue("pvc2OutputName"));
					}
					if(msgKeyType.containsKeyColumn("pvc2UserId")) {
						key.setpvc2UserId(msgKey.getKeyValue("pvc2UserId"));
					}
					if(msgKeyType.containsKeyColumn("pvc2BusinessName")) {
						key.setpvc2BusinessName(msgKey.getKeyValue("pvc2BusinessName"));
					}
					if(msgKeyType.containsKeyColumn("pvc2PlantCd")) {
						key.setpvc2PlantCd(msgKey.getKeyValue("pvc2PlantCd"));
					}
					if(msgKeyType.containsKeyColumn("pnumReturn")) {
						key.setpnumReturn(new Integer(msgKey.getKeyValue("pnumReturn")));
					}
					if(msgKeyType.containsKeyColumn("PROGRAM_CD")) {
						key.setPROGRAM_CD(msgKey.getKeyValue("PROGRAM_CD"));
					}
					if(msgKeyType.containsKeyColumn("FUNCTION_NAME")) {
						key.setFUNCTION_NAME(msgKey.getKeyValue("FUNCTION_NAME"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_GROUP_CD")) {
						key.setBUSINESS_GROUP_CD(msgKey.getKeyValue("BUSINESS_GROUP_CD"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_CD")) {
						key.setBUSINESS_CD(msgKey.getKeyValue("BUSINESS_CD"));
					}
					if(msgKeyType.containsKeyColumn("FILE_PATH")) {
						key.setFILE_PATH(msgKey.getKeyValue("FILE_PATH"));
					}
					if(msgKeyType.containsKeyColumn("FILE_NAME")) {
						key.setFILE_NAME(msgKey.getKeyValue("FILE_NAME"));
					}
					if(msgKeyType.containsKeyColumn("LOG_MODE_TYP")) {
						key.setLOG_MODE_TYP(new Double(msgKey.getKeyValue("LOG_MODE_TYP")));
					}
					if(msgKeyType.containsKeyColumn("OUTPUT_MODE_TYP")) {
						key.setOUTPUT_MODE_TYP(new Double(msgKey.getKeyValue("OUTPUT_MODE_TYP")));
					}
					if(msgKeyType.containsKeyColumn("SUB1_h_PRD_DUE_DATE")) {
						key.setSUB1_h_PRD_DUE_DATE(msgKey.getKeyValue("SUB1_h_PRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SUB1_ITEM_NAME")) {
						key.setSUB1_ITEM_NAME(msgKey.getKeyValue("SUB1_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MAIN_h_PLANT_CD")) {
						key.setMAIN_h_PLANT_CD(msgKey.getKeyValue("MAIN_h_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("MAIN_h_JOB_ODR_CD")) {
						key.setMAIN_h_JOB_ODR_CD(msgKey.getKeyValue("MAIN_h_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("MAIN_h_ITEM_CD")) {
						key.setMAIN_h_ITEM_CD(msgKey.getKeyValue("MAIN_h_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("MAIN_h_PRD_DUE_DATE_FROM")) {
						key.setMAIN_h_PRD_DUE_DATE_FROM(msgKey.getKeyValue("MAIN_h_PRD_DUE_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("MAIN_h_PRD_DUE_DATE_TO")) {
						key.setMAIN_h_PRD_DUE_DATE_TO(msgKey.getKeyValue("MAIN_h_PRD_DUE_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("SUB1_h_l_JOB_ODR_CD")) {
						key.setSUB1_h_l_JOB_ODR_CD(msgKey.getKeyValue("SUB1_h_l_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("SUB1_h_l_ITEM_CD")) {
						key.setSUB1_h_l_ITEM_CD(msgKey.getKeyValue("SUB1_h_l_ITEM_CD"));
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
