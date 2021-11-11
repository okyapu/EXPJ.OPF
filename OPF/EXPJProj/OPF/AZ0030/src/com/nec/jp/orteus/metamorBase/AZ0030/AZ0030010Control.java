/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AZ0030/src/com/nec/jp/orteus/metamorBase/AZ0030/AZ0030010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AZ0030;

import com.nec.jp.orteus.metamorBase.AZ0030.*;
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
//------------------------------------------------------------------------------
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
import com.nec.jp.orteus.metamorBase.common01.Accessor.PrivateConfig;
import com.nec.jp.orteus.metamorBase.common01.Accessor.ProcMaster.ProcMaster;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;
//------------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AZ0030010Control
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
        public Object getListvalue(int x) { return this.list.get(x); }	// ���X�g�̒l�i���f�B�G�[�^�j��Ԃ��܂��B
       
        public AZ0030010Struct getStruct() { return this.struct; }	// Struct�̒l�i���f�B�G�[�^�j��Ԃ��܂��B
       
       //------------------------------------------------------------------------------
       
        /** ���[�h */
        private String _mode = null;
       
        /** ���[�h�̎擾 
         * @return ���[�h
        */
        public String getMode(){ return _mode; }
       
        /** ���[�h�̐ݒ� 
         * @param mode ���[�h
        */
        public void setMode(String mode){ _mode = mode; }
       
        /** ��ʃ��[�h �������� */	
        private final static String _SELECT = "select";
       
        /** ��ʃ��[�h ����/����ȊO�̏��� */
        private final static String _NORMAL = "normal";
       
        /** ��ʃ��[�h ���鏈�� */
        private final static String _CLOSE = "close";
       
       //-------------------------------------------------------------------------
        /** ��ʋ��ʒ�`�擾�N���X */
        ScreenParam _scParam = sp;
       
       //-------------------------------------------------------------------------
       
        /**
         * ���b�Z�[�W�擾 
         * @@return ���b�Z�[�W
         */
        public MessageStruct getMessage()
        {
         return msgStruct;
        }
       
        /**
         * ���b�Z�[�W�ݒ�
         * @@param ���b�Z�[�W
         */
        public void setMessage(MessageStruct msg)
        {
         msgStruct = msg;
        }
       
       //-------------------------------------------------------------------------
       
        /** �ŏ����� */
        private final static String _MIN_DATETIME = "0001/01/01 00:00:00";
        /** �ő���� */
        private final static String _MAX_DATETIME = "9999/12/31 23:59:59";
       
        /** ���t�t�H�[�}�b�g */
        //private SimpleDateFormat _dateFormat = new SimpleDateFormat("yyyy/MM/dd");
       
        /**
         * Date�^ �� String�^�B
         * @return String YYYY/MM/DD�`��
         */
        public String dateToString(Date date)
        {
         //return _dateFormat.format(date);
         return Converter.dateToStr(date, "yyyy/MM/dd");
        }
       
        /**
         * String�^ �� Date�^�B
         * @return Date 
         */
        public Date stringToDate(String date) throws ParseException
        {
         //return _dateFormat.parse(date);
         return Converter.strToDate(date, "yyyy/MM/dd");
        }
       
       //------------------------------------------------------------------
       
        /**  �p�ɂɎg�p����Ɩ��ꗗ���ɃA�N�Z�X���邽�߂̃L�[ */
        private final static String _FREQUENT_BUSINESS_ACCESS_KEY = "FREQUENT_BUSINESS";
       
        List _FROM_TIMEValueList = new ArrayList(0);
        List _FROM_TIMENameList = new ArrayList(0);
        List _TO_TIMEValueList = new ArrayList(0);
        List _TO_TIMENameList = new ArrayList(0);
        List _frequentBusinessValueList = new ArrayList(0);
        List _frequentBusinessNameList = new ArrayList(0);
        List _businessValueList = new ArrayList(0);
        List _businessNameList = new ArrayList(0);
       
        /** �Ɩ����A�N�Z�b�T�I�u�W�F�N�g�p */
        private ProcMaster _procMaster = new ProcMaster();
       
       //-----------------------------------------------------------------------------
       
        /** �e���struct���ꎞ�ޔ�p */
        private AZ0030010Struct _save_struct = new AZ0030010Struct();
       
        /**
         * �e��ʂ�struct����ޔ�
         */
        private void saveParentStruct()
        {
         _save_struct.setFROM_DATE(struct.getFROM_DATE());
         _save_struct.sets_FROM_TIME(struct.gets_FROM_TIME());
         _save_struct.setTO_DATE(struct.getTO_DATE());
         _save_struct.sets_TO_TIME(struct.gets_TO_TIME());
         _save_struct.seth_plant_flg(struct.geth_plant_flg());
         _save_struct.seth_own_flg(struct.geth_own_flg());
         _save_struct.seth_sort_flg(struct.geth_sort_flg());
         _save_struct.seth_detail_flg(struct.geth_detail_flg());
        }
       
        /**
         * �e��ʂ�struct���𕜋A
         */
        private void loadParentStruct()
        {
         struct.setFROM_DATE(_save_struct.getFROM_DATE());
         struct.sets_FROM_TIME(_save_struct.gets_FROM_TIME());
         struct.setTO_DATE(_save_struct.getTO_DATE());
         struct.sets_TO_TIME(_save_struct.gets_TO_TIME());
         struct.seth_plant_flg(_save_struct.geth_plant_flg());
         struct.seth_own_flg(_save_struct.geth_own_flg());
         struct.seth_sort_flg(_save_struct.geth_sort_flg());
         struct.seth_detail_flg(_save_struct.geth_detail_flg());
        }
       
       //------------------------------------------------------------------
       
        /**
         * �\�������i�[�p
         * sort_flg 0: �V������ 1: �Â���
         */
        private int _sort_flg = 0;
       
        /**
         * �\�������ݒ�
         */
        public void setSortFlg(int sort_flg){ _sort_flg = sort_flg; }
       
        /**
         * �\�������擾
         */
        public int getSortFlg(){ return _sort_flg; }
       
       //------------------------------------------------------------------
       
        /** �ꗗ�ɕ\������Ă���f�[�^�̐擪���O�i�[���j�Ƃ������ݕ\���Ώۂɂ���f�[�^�ԍ��i�[�p */
        int _detailInfoDispTargetNo = 0;
       
        /** �A�N�V�����t���O �f�[�^�ݒ� */
        private final static String _DATA_SET = "data_set";
       
        /** �A�N�V�����t���O �O�f�[�^ */
        private final static String _DATA_PREV = "data_prev";
       
        /** �A�N�V�����t���O ���f�[�^ */
        private final static String _DATA_NEXT = "data_next";
       
        /**
         * �ڍו\���Ώۃf�[�^��ݒ�
         * @@param actionFlg �Ώۃf�[�^����t���O
         * @@param val       �Ώۃf�[�^�ԍ�(actionFlg��_DATA_SET���̂ݗL��)
         */
        private void setDetailInfo(String actionFlg, int val)
        {
         // �A�N�V�����t���O�ɂ�鏈��
         if(actionFlg.equals(_DATA_SET) == true)
         {
          _detailInfoDispTargetNo = val;
         }
         else if(actionFlg.equals(_DATA_PREV) == true)
         {
          // �O�f�[�^��
          _detailInfoDispTargetNo -= val;
          if(_detailInfoDispTargetNo < 0)
          {
           _detailInfoDispTargetNo = 0;
          }
         }
         if(actionFlg.equals(_DATA_NEXT) == true)
         {
          // ���f�[�^��
          _detailInfoDispTargetNo += val;
          if(_detailInfoDispTargetNo > (getListsize()-1))
          {
           _detailInfoDispTargetNo = (getListsize()-1);
          }
         }

         // �e��ʂőI������Ă���\�������l�����āA�e��ʏ�̕\���Ώۃf�[�^�ԍ��������X�g�f�[�^�ԍ��֕ϊ�
         /*int intDataNo = convListDataIndex(_detailInfoDispTargetNo);*/
        	
         // �u�Â����v��I�����ēǍ����s�����Ƃ��ɑI�������f�[�^�Əڍׂŕ\�������f�[�^���t�ɂȂ��Ă��܂�����
         //  �ꗗ�̎����X�g�f�[�^�ԍ��ƕ\���Ώۃf�[�^�ԍ��𓯂��ɂ���2006/04/20up
         int intDataNo = _detailInfoDispTargetNo;
       
         // �f�[�^�擾
         AZ0030010Struct target_struct = (AZ0030010Struct)getListvalue(intDataNo);
       
         // �\���pstruct�֏ڍו\������ݒ�
         copyDetailInfoStruct(target_struct, struct);
        }
       
        /**
         * �w�肳�ꂽ�ڍ׏��struct���R�s�[
         * @@param src_struct �R�s�[��
         * @@param dst_struct �R�s�[��
         */
        protected void copyDetailInfoStruct(AZ0030010Struct src_struct, AZ0030010Struct dst_struct)
        {
         // �ڍו\���ɕK�v�ȃf�[�^��ݒ�
         dst_struct.setCONFIRM_DATE(src_struct.getCONFIRM_DATE());
         dst_struct.setLOG_CD(src_struct.getLOG_CD());
         dst_struct.setCREATED_DATE(src_struct.getCREATED_DATE());
         dst_struct.setPLANT_CD(src_struct.getPLANT_CD());
         dst_struct.setBUSINESS_NAME(src_struct.getBUSINESS_NAME());
         dst_struct.setw_BUSINESS_NAME(src_struct.getBUSINESS_NAME()); // �Ɩ����̓R�[�h�ŕ\��
         dst_struct.setUSER_CD(src_struct.getUSER_CD());
         dst_struct.setMSG(src_struct.getMSG());
         dst_struct.setDATA_STRING(src_struct.getDATA_STRING());
         dst_struct.setPLANT_NAME(src_struct.getPLANT_NAME());
         dst_struct.setUSER_NAME(src_struct.getUSER_NAME());
        }
       
        /**
         * �\�������l�������e��ʏ�̕\���Ώۃf�[�^�ԍ��������X�g�f�[�^�ԍ��֕ϊ�
         * @@param targetNo  �Ώۃf�[�^�ԍ�
         */
        protected int convListDataIndex(int targetNo)
        {
         int intDataNo;
        
         if(getSortFlg() == 0)
         {
          // �\�������V�������̏ꍇ
          intDataNo = targetNo;
         	System.out.println("(SBM0888)�\�������V�������̏ꍇ " + getSortFlg());
         }
         else
         {
          // �\�������Â����̏ꍇ
          intDataNo = (getListsize()-1) - targetNo;
         	System.out.println("(SBM0889)�\�������Â����̏ꍇ " + getSortFlg());
         }
         return intDataNo;
        }
       
       //------------------------------------------------------------------
       
        /** �ꗗ�ڍ׏��\���擪�������A�N�Z�X�L�[ */
        private final static String _DETAIL_HEAD_LENGTH_ACCESS_KEY = "BUSINESS_MSG_DETAIL_HEAD";
       
        /** �ꗗ�ڍ׏��\�\���擪�������i�[�p */
        private Integer _dispDetailLength = new Integer(40);
       
       //------------------------------------------------------------------
       
        /**
         * SQLException�G���[���b�Z�[�W�ݒ�
         * @param SQLException
         * @param �o�̓G���[���b�Z�[�W
         */
        private void setSqlExceptionMsg(SQLException e) throws ExpjException
        {
         setReadStatus(ERROR);
         
         ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
         sysLog.severe(emsg, getsysUSER_CD());
         ExpjException ee = new ExpjException(e, emsg);
         throw ee;
        }
       
         
        /**
         * �G���[���b�Z�[�W�ݒ�
         * @param ���b�Z�[�W�ԍ�
         * @param �o�̓��b�Z�[�W
         */
        private void setErrorMessage(String messageno, String message)
        {
         ExpjMessage emsg = new ExpjMessage( messageno );
         msgStruct.addError( emsg );
         sysLog.warning(emsg, getsysUSER_CD());
         emsg = new ExpjMessage( "ZZ01006", message );
         msgStruct.addError( emsg );
         sysLog.warning(emsg, getsysUSER_CD());
        }
       
        /**
         * �G���[���b�Z�[�W�ݒ�
         * @param ���b�Z�[�W�ԍ�
         * @param �o�̓��b�Z�[�W(List)
         */
        private void setErrorMessage(String messageno, List message)
        {
         ExpjMessage emsg = new ExpjMessage( messageno );
         msgStruct.addError( emsg );
         sysLog.warning(emsg, getsysUSER_CD());
         
         for(int i=0; i<message.size(); i++)
         {
          emsg = new ExpjMessage( "ZZ01006", (String)message.get(i) );
          msgStruct.addError( emsg );
          sysLog.warning(emsg, getsysUSER_CD());
         }
        }
        
        /**
         * �x�����b�Z�[�W�ݒ�
         * @param ���b�Z�[�W�ԍ�
         * @param �o�̓��b�Z�[�W
         */
        private void setWarnMessage(String messageno, String message)
        {
         ExpjMessage emsg = new ExpjMessage( messageno );
         msgStruct.addWarn( emsg );
         sysLog.info(emsg, getsysUSER_CD());
        }
         
        /**
         * ��񃁃b�Z�[�W�ݒ�
         * @param ���b�Z�[�W�ԍ�
         * @param �o�̓��b�Z�[�W
         */
        private void setInfoMessage(String messageno, String message)
        {
         ExpjMessage emsg = new ExpjMessage( messageno );
         msgStruct.addInfo( emsg );
         sysLog.config(emsg, getsysUSER_CD());
        }
       //------------------------------------------------------------------
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
                //------------------------------------------------------------------
              
                List listMessage = new ArrayList();
              
                setReadStatus(INITIAL);
                
                try {
                 // �Ǎ���������
              
                 // �����l�ݒ�p�I�u�W�F�N�g������
                 AZ0030010Struct search_struct = new AZ0030010Struct();
                 search_struct.clear();
              
                 // ���͒l(�Ɩ�)�ݒ�
                 search_struct.setBUSINESS_NAME(struct.getBUSINESS_NAME());
              
                 // ���͒l��蔭�������̕�������쐬
                 //SimpleDateFormat formatDateTime = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                 Calendar calendar = new GregorianCalendar();
              
                 // FROM�̔��������̕�����쐬
                 String strFromDateTime = _MIN_DATETIME;
                 if( (struct.getFROM_DATE() != null) && ("".equals(struct.getFROM_DATE()) != true) )
                 {
                  calendar.setTime(stringToDate(struct.getFROM_DATE()));
                  calendar.set(Calendar.HOUR_OF_DAY, Integer.parseInt(struct.gets_FROM_TIME()));// ��
                  calendar.set(Calendar.MINUTE, 0);	// ��
                  calendar.set(Calendar.SECOND, 0);	// �b
                  //strFromDateTime = formatDateTime.format(calendar.getTime());
                  strFromDateTime = Converter.dateToStr(calendar.getTime(), "yyyy/MM/dd HH:mm:ss");
                 }
              
                 // TO�̔��������̕�����쐬
                 String strToDateTime = _MAX_DATETIME;
                 if( (struct.getTO_DATE() != null) && ("".equals(struct.getTO_DATE()) != true) )
                 {
                  calendar.setTime(stringToDate(struct.getTO_DATE()));
                  calendar.set(Calendar.HOUR_OF_DAY, Integer.parseInt(struct.gets_TO_TIME()));// ��
                  calendar.set(Calendar.MINUTE, 0);	// ��
                  calendar.set(Calendar.SECOND, 0);	// �b
                  calendar.add(Calendar.HOUR_OF_DAY, 1);
                  //strToDateTime = formatDateTime.format(calendar.getTime());
                  strToDateTime = Converter.dateToStr(calendar.getTime(), "yyyy/MM/dd HH:mm:ss");
                 }
              
                 // ���������ݒ�
                 search_struct.setw_FROM_DATE(strFromDateTime);
                 search_struct.setw_TO_DATE(strToDateTime);
              
                 // �S�H�ꂪ�I������Ă���ꍇ�́APLANT_CD��null��ݒ�
                 // ���H�ꂪ�I������Ă���ꍇ�́APLANT_CD�֎��H��R�[�h��ݒ�
                 if(struct.geth_plant_flg().intValue() == 0)
                 {
                  search_struct.setPLANT_CD(null);		// �S�H��w��
                 }
                 else
                 {
                  search_struct.setPLANT_CD(getsysPLANT_CD());	// ���H��w��
                 }
              
                 // �����[�U�\�����I������Ă���ꍇ�́AUSER_CD�֎����[�U�R�[�h��ݒ�
                 // �����[�U�\�����I������Ă��Ȃ��ꍇ�́AUSER_CD��null��ݒ�
                 if(struct.geth_own_flg().intValue() == 1)
                 {
                  search_struct.setUSER_CD(getsysUSER_CD());		// �����[�U�\���Ώ�
                 }
                 else
                 {
                  search_struct.setUSER_CD(null);			// �S���[�U�\���Ώ�
                 }
              
                 // �ǂݍ��ݎ��s
                 List temp_list = new ArrayList(0);
                 List sort_list = new ArrayList(0);
                //�\���ő�s����������
                 ScreenParam sp = new ScreenParam(this.getClass());
                 int maxLine = sp.getMaxLine(conn,10);
                 if(maxLine != 0) {
     				search_struct.setROW_COUNT(String.valueOf(maxLine));
     			} else {
     				search_struct.setROW_COUNT(null);
     			}
                 temp_list = entity.mselectCnt.read(conn, search_struct);
                 long rowCount = Long.parseLong(((AZ0030010Struct)temp_list.get(0)).getl_COUNT());
                 // ���R�[�h�����`�F�b�N
     			if (rowCount==0) {
     				 setReadStatus(NOT_FOUND);
                     // ���R�[�h�������O(�[��)���̏ꍇ
                     listMessage.add("SYS_MSG_LOG.CREATED_DATE[FROM]:" + search_struct.getw_FROM_DATE());
                     listMessage.add("SYS_MSG_LOG.CREATED_DATE[TO]:" + search_struct.getw_TO_DATE());
                     listMessage.add("SYS_MSG_LOG.PLANT_CD:" + search_struct.getPLANT_CD());
                     listMessage.add("USER_MST.USER_CD:" + search_struct.getUSER_CD());
                     setErrorMessage("AZ60001", listMessage);
                     //�ꗗ�\���N���A����
     				if(list != null && list.size() > 0){
     					list.clear();
     				}
     				return;
     			}
                 if(maxLine != 0 && rowCount == maxLine+1){
                  
                  // ���[�h�ݒ�
                  setReadStatus(TOO_MANY);
                  
                  ExpjMessage emsg = new ExpjMessage( "ZZ01115", ""+maxLine );
                  msgStruct.addError( emsg );
                  sysLog.warning(emsg, getsysUSER_CD());
                  if(list != null && list.size() > 0){
   					list.clear();
   				  }
   				  return;
                 }
                 temp_list = entity.mselect.read(conn, search_struct);
                   // �\���f�[�^���H����
                   for(int i = 0; i < temp_list.size(); i++)
                   {
                    AZ0030010Struct temp_struct = (AZ0030010Struct)temp_list.get(i);
                    // �ǂݍ��񂾃f�[�^�̋Ɩ�����\���p�ϐ��ɃR�s�[
                    temp_struct.setw_BUSINESS_NAME(temp_struct.getBUSINESS_NAME());
              
                    // �쐬�Җ��擾�s�̂Ƃ� �쐬��ID��\��
                    String createUserName = temp_struct.getUSER_NAME();
                    if(createUserName == null || "".equals(createUserName))
                     temp_struct.setUSER_NAME(temp_struct.getUSER_CD());
              
                    // �H�ꖼ�擾�s�̂Ƃ� �H��ID��\��
                    String plantName = temp_struct.getPLANT_NAME();
                    if(plantName == null || "".equals(plantName))
                     temp_struct.setPLANT_NAME(temp_struct.getPLANT_CD());
              
                    // �ڍ׏��̐擪40�����𒊏o�ݒ肷�鏈��
                    String strDataString = null;
                    if( (temp_struct.getDATA_STRING() != null && "".equals(temp_struct.getDATA_STRING()) != true)
                    &&	(temp_struct.getDATA_STRING().length() > _dispDetailLength.intValue()) )
                    {
                     strDataString = temp_struct.getDATA_STRING().substring(0,_dispDetailLength.intValue());
                    }
                    else{
                     strDataString = temp_struct.getDATA_STRING();
                    }
                    temp_struct.setw_DATA_STRING(strDataString);
                   }
                   
                   // �\�[�g�^�C�v�̔���
                   if(struct.getr_SORT_NEW().equals("true"))
                   {
                    // �\���p���X�g���X�V
                    setList(temp_list);
                   }
                   else
                   {
                    for(int i = (temp_list.size() - 1); i >= 0; i--)
                    {
                     AZ0030010Struct sort_struct = new AZ0030010Struct();
                     sort_struct = (AZ0030010Struct)temp_list.get(i);
                     
                     sort_list.add(sort_struct);
                    }
                    
                    setList(sort_list);
                   }
              
                   setReadStatus(NORMAL);
                   
                   // �ꗗ�̐擪�̏ڍ׃��W�I�{�^�����I�������悤�ɐݒ�
                   struct.seth_detail_flg(new Integer(0));
              
                   // �\���������R���g���[���ɕێ�
                   setSortFlg(struct.geth_sort_flg().intValue());
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
                 
                } catch(ParseException e) {
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(e, emsg);
                 
                 throw ee;
                } 
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
                //------------------------------------------------------------------
              
                // ���[�h�ݒ�
                setReadStatus(INITIAL);
              
                // struct������
                struct.initialize();
				
				//h_PLAN_TYP��"1"��ݒ� 2006/04/26 up
				struct.seth_PLAN_TYP("1");
           
				// �������̏����l���V�X�e�����t�ɐݒ�
				String sSysdate = "";

				if(conn == null) { CoreTools.getTransConnection(); }

				try {
					if((sSysdate = entity.mei_Sysdate.read(conn))==null) {
						throw new FoundationException("AZ0030010Control","controlclear()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
					}

					// Struct�ϐ��փf�[�^�̃Z�b�g
					struct.setFROM_DATE( sSysdate.substring(0,10) );

				} catch( SQLException e ) {
					e.printStackTrace();
					throw new FoundationException("AZ0030010Control",e.getMessage(),"controlclear���\�b�h�ŃG���[���������܂����B");
				}
				
                // list������
                if(list != null)
                {
                 list.clear();
                }
                else
                {
                 list = new ArrayList(0);
                }
              
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * �ڍ׃{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controldetail() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controldetail");
			//{{user_implement_dev:<controldetail>
                //---------------------------------------------------------------------
                 
                // �e��ʂ�struct��ޔ�
                _save_struct.copy(struct);
              
                for(int i=0; i < list.size(); i++)
                {
                 AZ0030010Struct temp_struct = (AZ0030010Struct)list.get(i);
                 if(struct.getLOG_CD().equals(temp_struct.getLOG_CD()))
                 {
                  struct.seth_detail_flg(new Integer(i));
                  break;
                 }
                }
                 
				//System.out.println(getSortFlg());
				
                // �ڍו\���Ώۂ̈ꗗ�f�[�^�ԍ����擾���Acontrol.struct�ɐݒ�
                setDetailInfo(_DATA_SET, struct.geth_detail_flg().intValue());
              
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controldetail>
		logger.exiting("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controldetail");

		return;
	}

	/**
	 * �m�F�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlconfirm() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlconfirm");
			//{{user_implement_dev:<controlconfirm>
                //---------------------------------------------------------------------
              
                // DB�X�V���t���O������
                boolean bDBUpdate = false;
                try{
                 
                 AZ0030010Struct delStruct = new AZ0030010Struct();
                 
                 // �g�����U�N�V�����J�n
                 conn.beginTransWeb();
              
                 // DB�X�V���t���OON
                 bDBUpdate = true;
              
              
                 for(int i = 0; i < struct.getList_LOG_CD().size(); i++)
                 {
                  // �I���s�̏����擾
                  delStruct.importData(struct, i);
                  struct.setw_LOG_CD((String)struct.getList_LOG_CD().get(i));
                  // �m�F���t�̍X�V
                  int nRet = entity.mupdateSYS_MSG_LOG.update(conn, struct);
                 }
             
                 // �R�~�b�g
                 conn.commit();
              
                 // DB�X�V���t���OOFF
                 bDBUpdate = false;
              
                 // �ēǍ�����
                 controlselect();
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                } finally {
                 if(msgStruct.sizeError() > 0)
                 {
                  // DB�X�V�������ɉ��炩�̃G���[�����������ꍇ��roolback�������Ȃ�
                  if(bDBUpdate == true)
                  {
                   // ���[���o�b�N
                   conn.rollback();
              
                   // DB�X�V���t���OOFF
                   bDBUpdate = false;
                  }
                 }
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlconfirm>
		logger.exiting("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlconfirm");

		return;
	}

	/**
	 * �O�փ{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlprev_sub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlprev_sub1");
			//{{user_implement_dev:<controlprev_sub1>
                //---------------------------------------------------------------------
              
                String Message = "";
              
                // ���ɐ擪�̃f�[�^���\���ΏۂɂȂ��Ă��邩�ǂ����̃`�F�b�N
                if(_detailInfoDispTargetNo <= 0)
                {
                 
                 setInfoMessage( "AZ60002", "" );
                }
              
                // �G���[�����邩�ǂ����̃`�F�b�N
                if(msgStruct.sizeError() <= 0)
                {
                 // ���݁A�ڍו\���ΏۂƂȂ��Ă���ꗗ�̃f�[�^�ԍ���-1���āA�O�̃f�[�^��\���Ώۂɂ���
                 // �ԍ����O�i�[���j�ȉ��ɂȂ����ꍇ�́A�ꗗ�̍ŏI�f�[�^���\���ΏۂƂȂ�
                 setDetailInfo(_DATA_PREV, 1);
                }
              
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlprev_sub1>
		logger.exiting("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlprev_sub1");

		return;
	}

	/**
	 * ���փ{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlnext_sub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlnext_sub1");
			//{{user_implement_dev:<controlnext_sub1>
                //---------------------------------------------------------------------
              
                // ���ɖ����̃f�[�^���\���ΏۂɂȂ��Ă��邩�ǂ����̃`�F�b�N
                if(_detailInfoDispTargetNo >= (getListsize()-1))
                {
                 
                 setInfoMessage( "AZ60003", "" );
                }
              
                // �G���[�����邩�ǂ����̃`�F�b�N
                if(msgStruct.sizeError() <= 0)
                {
                 // ���݁A�ڍו\���ΏۂƂȂ��Ă���ꗗ�̃f�[�^�ԍ���+1���āA���̃f�[�^��\���Ώۂɂ���
                 // �ԍ����ꗗ�̖����f�[�^�𒴂����ꍇ�́A�ꗗ�̐擪�f�[�^���\���ΏۂƂȂ�
                 setDetailInfo(_DATA_NEXT, 1);
                }
              
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlnext_sub1>
		logger.exiting("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlnext_sub1");

		return;
	}

	/**
	 * �m�F�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlconfirm_sub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlconfirm_sub1");
			//{{user_implement_dev:<controlconfirm_sub1>
                //---------------------------------------------------------------------
              
                // DB�X�V���t���O������
                boolean bDBUpdate = false;
                String Message = "";
              
                try{
                 // �g�����U�N�V�����J�n
                 conn.beginTransWeb();
              
                 // DB�X�V���t���OON
                 bDBUpdate = true;
              
                 // �ꗗ�̃`�F�b�N�{�b�N�X�Ƀ`�F�b�N�������Ă��郌�R�[�h�ɑ΂��Ċm�F�����������Ȃ�
                 BusinessMessageAccessor businessMessageAccessor = new BusinessMessageAccessor();
                 businessMessageAccessor.init(conn);
                 businessMessageAccessor.confirm(struct.getLOG_CD(), struct.getPLANT_CD(), struct.getUSER_CD());
              
                 // �R�~�b�g
                 conn.commit();
              
                 // DB�X�V���t���OOFF
                 bDBUpdate = false;
              
                 // �q��ʂɑJ�ڂ���O�̐e��ʂ�struct�𕜋A
                 struct.copy(_save_struct);
              
                 // �Ώۃ��R�[�h�ēǍ�����
                 List temp_list = entity.mselectRetryByLOG_CD.read(conn, struct);
                 if(temp_list.size() <= 0)
                 {
                  // �Y�����R�[�h�Ȃ�
                  Message = "SYS_MSG_LOG.JOB_ODR_CD:" + struct.getLOG_CD();
                  setErrorMessage("ZZ06001", Message);
                 }
                 else
                 {
                  // �f�[�^�擾
                  AZ0030010Struct target_struct = (AZ0030010Struct)temp_list.get(0);
              
                  // �ڍו\���p�f�[�^��\���pstruct�֍Đݒ�
                  copyDetailInfoStruct(target_struct, struct);
              
                  // �ꗗ�f�[�^�X�V
                  AZ0030010Struct list_struct = (AZ0030010Struct)getListvalue(convListDataIndex(_detailInfoDispTargetNo));
                  copyDetailInfoStruct(target_struct, list_struct);
                 }
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                } catch(AlarmMessageException msg) {
                 throw msg;
              
                } finally {
                 if(msgStruct.sizeError() > 0)
                 {
                  // DB�X�V�������ɉ��炩�̃G���[�����������ꍇ��roolback�������Ȃ�
                  if(bDBUpdate == true)
                  {
                   // ���[���o�b�N
                   conn.rollback();
              
                   // DB�X�V���t���OOFF
                   bDBUpdate = false;
                  }
                 }
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlconfirm_sub1>
		logger.exiting("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlconfirm_sub1");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlreturn_sub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub1");
			//{{user_implement_dev:<controlreturn_sub1>
                //---------------------------------------------------------------------
              
                // �q��ʂɑJ�ڂ���O�̐e��ʂ�struct�𕜋A
                struct.copy(_save_struct);
              
                // �ēǍ�����
                controlselect();
              
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlreturn_sub1>
		logger.exiting("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub1");

		return;
	}

	/**
	 * �S�I���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlselectall() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlselectall");
			//{{user_implement_dev:<controlselectall>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlselectall>
		logger.exiting("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlselectall");

		return;
	}

	/**
	 * �S�����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlcancelselectall() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlcancelselectall");
			//{{user_implement_dev:<controlcancelselectall>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlcancelselectall>
		logger.exiting("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlcancelselectall");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                      //------------------------------------------------------------------
              
                try {
                  
                 // �N���A����
                 controlclear();
              
                 // �R���{�{�b�N�X���X�g�f�[�^�쐬
                 // �e���X�g�ϐ���������
                 _FROM_TIMEValueList.clear();
                 _FROM_TIMENameList.clear();
                 _TO_TIMEValueList.clear();
                 _TO_TIMENameList.clear();
                 _frequentBusinessValueList.clear();
                 _frequentBusinessNameList.clear();
                 _businessValueList.clear();
                 _businessNameList.clear();
              
                 // ����(0�`23)�ꗗ�ݒ�
                 for(int i = 0; i <= 23; i++)
                 {
                  _FROM_TIMEValueList.add(String.valueOf(i));
                  _FROM_TIMENameList.add(String.valueOf(i));
                  _TO_TIMEValueList.add(String.valueOf(i));
                  _TO_TIMENameList.add(String.valueOf(i));
                 }
              
                 // �Ɩ����Ǎ�
                 if(_procMaster.load(conn) == false)
                 {
                  // �G���[����
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                  sysLog.severe(emsg, getsysUSER_CD());
                  ExpjException ee = new ExpjException(emsg);
                  
                  throw ee;
                 }
              
                 // �p�ɂɎg�p����Ɩ��ꗗ�f�[�^��SYS_PARAMETER�e�[�u������擾
                 PrivateConfig privateConfig = new PrivateConfig(conn);
                 _frequentBusinessValueList = privateConfig.getStrings(_FREQUENT_BUSINESS_ACCESS_KEY);
                 if(_frequentBusinessValueList == null)
                 {
                  // �G���[����
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                  sysLog.severe(emsg, getsysUSER_CD());
                  ExpjException ee = new ExpjException(emsg);
                  
                  throw ee;
                 }
              
                 // �Ɩ�ID���̋Ɩ����ꗗ���擾�ݒ�
                 for(int i = 0; i < _frequentBusinessValueList.size(); i++)
                 {
                  _frequentBusinessNameList.add(_procMaster.getName((String)_frequentBusinessValueList.get(i)));
                 }
              
                 // �S�Ɩ��ꗗ�ݒ�
                 _businessValueList = _procMaster.getIds();
                 _businessNameList = _procMaster.getNames();
              
                 // �ꗗ�ڍ׏��\���ő啶�����擾
                 Integer intMaxDataStringLength = privateConfig.getNumber(_DETAIL_HEAD_LENGTH_ACCESS_KEY);
                 if(intMaxDataStringLength == null){
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                  ExpjMessage emsg_log = new ExpjMessage( "ZZ01006", "SYS_PARAMETER.BUSINESS_MSG_DETAIL_HEAD:" + intMaxDataStringLength );
                  sysLog.severe(emsg, getsysUSER_CD());
                  sysLog.severe(emsg_log, getsysUSER_CD());
                  ExpjException ee = new ExpjException(emsg);
              
                  throw ee;
                 }
                 else if(intMaxDataStringLength.intValue() <= 0){
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                  ExpjMessage emsg_log = new ExpjMessage( "ZZ01006", "SYS_PARAMETER.BUSINESS_MSG_DETAIL_HEAD:" + intMaxDataStringLength );
                  sysLog.severe(emsg, getsysUSER_CD());
                  sysLog.severe(emsg_log, getsysUSER_CD());
                  ExpjException ee = new ExpjException(emsg);
              
                  throw ee;
                 }
                 _dispDetailLength = intMaxDataStringLength;
                } catch(SQLException e) {
                  setSqlExceptionMsg(e);
                 
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("detail") ) {
				controldetail();
			} else if( button.equals("confirm") ) {
				controlconfirm();
			} else if( button.equals("prev_sub1") ) {
				controlprev_sub1();
			} else if( button.equals("next_sub1") ) {
				controlnext_sub1();
			} else if( button.equals("confirm_sub1") ) {
				controlconfirm_sub1();
			} else if( button.equals("return_sub1") ) {
				controlreturn_sub1();
			} else if( button.equals("selectall") ) {
				controlselectall();
			} else if( button.equals("cancelselectall") ) {
				controlcancelselectall();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
                //---------------------------------------------------------------------
              
                 struct.setList_s_FROM_TIME_val(_FROM_TIMEValueList);
                 struct.setList_s_FROM_TIME_name(_FROM_TIMENameList);
                 struct.setList_s_TO_TIME_val(_TO_TIMEValueList);
                 struct.setList_s_TO_TIME_name(_TO_TIMENameList);
                 
                } catch(AlarmMessageException ame){
                 ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
                 throw ee;
                //---------------------------------------------------------------------
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// �g���b�Z�[�W�o�͈˗��쐬
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AZ0030010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
                //}}user_implement_dev:<createDefaultCSV>
		} catch( FoundationException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AZ0030010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AZ0030010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AZ0030010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AZ0030010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AZ0030010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AZ0030010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AZ0030010Entity entity;
	protected AZ0030010Struct struct;
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

		entity = new AZ0030010Entity();
		struct = new AZ0030010Struct();

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
	 * AZ0030010�N���X�̕W���R���X�g���N�^
	 */
	public AZ0030010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
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
				AZ0030010Struct key = (AZ0030010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("FROM_DATE") && key.getFROM_DATE() != null) {
					msgKey.setKeyValue("FROM_DATE", key.getFROM_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_FROM_TIME") && key.geth_FROM_TIME() != null) {
					msgKey.setKeyValue("h_FROM_TIME", key.geth_FROM_TIME());
				}
				if(msgKeyType.containsKeyColumn("s_FROM_TIME") && key.gets_FROM_TIME() != null) {
					msgKey.setKeyValue("s_FROM_TIME", key.gets_FROM_TIME());
				}
				if(msgKeyType.containsKeyColumn("s_FROM_TIME_name") && key.gets_FROM_TIME_name() != null) {
					msgKey.setKeyValue("s_FROM_TIME_name", key.gets_FROM_TIME_name());
				}
				if(msgKeyType.containsKeyColumn("s_FROM_TIME_val") && key.gets_FROM_TIME_val() != null) {
					msgKey.setKeyValue("s_FROM_TIME_val", key.gets_FROM_TIME_val());
				}
				if(msgKeyType.containsKeyColumn("TO_DATE") && key.getTO_DATE() != null) {
					msgKey.setKeyValue("TO_DATE", key.getTO_DATE());
				}
				if(msgKeyType.containsKeyColumn("s_TO_TIME") && key.gets_TO_TIME() != null) {
					msgKey.setKeyValue("s_TO_TIME", key.gets_TO_TIME());
				}
				if(msgKeyType.containsKeyColumn("s_TO_TIME_name") && key.gets_TO_TIME_name() != null) {
					msgKey.setKeyValue("s_TO_TIME_name", key.gets_TO_TIME_name());
				}
				if(msgKeyType.containsKeyColumn("s_TO_TIME_val") && key.gets_TO_TIME_val() != null) {
					msgKey.setKeyValue("s_TO_TIME_val", key.gets_TO_TIME_val());
				}
				if(msgKeyType.containsKeyColumn("h_TO_TIME") && key.geth_TO_TIME() != null) {
					msgKey.setKeyValue("h_TO_TIME", key.geth_TO_TIME());
				}
				if(msgKeyType.containsKeyColumn("h_plant_flg") && key.geth_plant_flg() != null) {
					msgKey.setKeyValue("h_plant_flg", key.geth_plant_flg().toString());
				}
				if(msgKeyType.containsKeyColumn("h_own_flg") && key.geth_own_flg() != null) {
					msgKey.setKeyValue("h_own_flg", key.geth_own_flg().toString());
				}
				if(msgKeyType.containsKeyColumn("h_sort_flg") && key.geth_sort_flg() != null) {
					msgKey.setKeyValue("h_sort_flg", key.geth_sort_flg().toString());
				}
				if(msgKeyType.containsKeyColumn("h_detail_flg") && key.geth_detail_flg() != null) {
					msgKey.setKeyValue("h_detail_flg", key.geth_detail_flg().toString());
				}
				if(msgKeyType.containsKeyColumn("w_BUSINESS_NAME") && key.getw_BUSINESS_NAME() != null) {
					msgKey.setKeyValue("w_BUSINESS_NAME", key.getw_BUSINESS_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_DATA_STRING") && key.getw_DATA_STRING() != null) {
					msgKey.setKeyValue("w_DATA_STRING", key.getw_DATA_STRING());
				}
				if(msgKeyType.containsKeyColumn("r_PLANT_ALL") && key.getr_PLANT_ALL() != null) {
					msgKey.setKeyValue("r_PLANT_ALL", key.getr_PLANT_ALL());
				}
				if(msgKeyType.containsKeyColumn("r_PLANT") && key.getr_PLANT() != null) {
					msgKey.setKeyValue("r_PLANT", key.getr_PLANT());
				}
				if(msgKeyType.containsKeyColumn("c_OWN") && key.getc_OWN() != null) {
					msgKey.setKeyValue("c_OWN", key.getc_OWN());
				}
				if(msgKeyType.containsKeyColumn("r_SORT_NEW") && key.getr_SORT_NEW() != null) {
					msgKey.setKeyValue("r_SORT_NEW", key.getr_SORT_NEW());
				}
				if(msgKeyType.containsKeyColumn("r_SORT_OLD") && key.getr_SORT_OLD() != null) {
					msgKey.setKeyValue("r_SORT_OLD", key.getr_SORT_OLD());
				}
				if(msgKeyType.containsKeyColumn("h_PLAN_TYP") && key.geth_PLAN_TYP() != null) {
					msgKey.setKeyValue("h_PLAN_TYP", key.geth_PLAN_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_confirm_flg") && key.getw_confirm_flg() != null) {
					msgKey.setKeyValue("w_confirm_flg", key.getw_confirm_flg().toString());
				}
				if(msgKeyType.containsKeyColumn("w_FROM_DATE") && key.getw_FROM_DATE() != null) {
					msgKey.setKeyValue("w_FROM_DATE", key.getw_FROM_DATE());
				}
				if(msgKeyType.containsKeyColumn("w_TO_DATE") && key.getw_TO_DATE() != null) {
					msgKey.setKeyValue("w_TO_DATE", key.getw_TO_DATE());
				}
				if(msgKeyType.containsKeyColumn("CONFIRM_DATE") && key.getCONFIRM_DATE() != null) {
					msgKey.setKeyValue("CONFIRM_DATE", key.getCONFIRM_DATE());
				}
				if(msgKeyType.containsKeyColumn("LOG_CD") && key.getLOG_CD() != null) {
					msgKey.setKeyValue("LOG_CD", key.getLOG_CD());
				}
				if(msgKeyType.containsKeyColumn("CREATED_DATE") && key.getCREATED_DATE() != null) {
					msgKey.setKeyValue("CREATED_DATE", key.getCREATED_DATE());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_NAME") && key.getBUSINESS_NAME() != null) {
					msgKey.setKeyValue("BUSINESS_NAME", key.getBUSINESS_NAME());
				}
				if(msgKeyType.containsKeyColumn("USER_CD") && key.getUSER_CD() != null) {
					msgKey.setKeyValue("USER_CD", key.getUSER_CD());
				}
				if(msgKeyType.containsKeyColumn("MSG") && key.getMSG() != null) {
					msgKey.setKeyValue("MSG", key.getMSG());
				}
				if(msgKeyType.containsKeyColumn("DATA_STRING") && key.getDATA_STRING() != null) {
					msgKey.setKeyValue("DATA_STRING", key.getDATA_STRING());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("USER_NAME") && key.getUSER_NAME() != null) {
					msgKey.setKeyValue("USER_NAME", key.getUSER_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_LOG_CD") && key.getw_LOG_CD() != null) {
					msgKey.setKeyValue("w_LOG_CD", key.getw_LOG_CD());
				}
				if(msgKeyType.containsKeyColumn("l_COUNT") && key.getl_COUNT() != null) {
					msgKey.setKeyValue("l_COUNT", key.getl_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ROW_COUNT") && key.getROW_COUNT() != null) {
					msgKey.setKeyValue("ROW_COUNT", key.getROW_COUNT());
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
					AZ0030010Struct key = new AZ0030010Struct();
					if(msgKeyType.containsKeyColumn("FROM_DATE")) {
						key.setFROM_DATE(msgKey.getKeyValue("FROM_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_FROM_TIME")) {
						key.seth_FROM_TIME(msgKey.getKeyValue("h_FROM_TIME"));
					}
					if(msgKeyType.containsKeyColumn("s_FROM_TIME")) {
						key.sets_FROM_TIME(msgKey.getKeyValue("s_FROM_TIME"));
					}
					if(msgKeyType.containsKeyColumn("s_FROM_TIME_name")) {
						key.sets_FROM_TIME_name(msgKey.getKeyValue("s_FROM_TIME_name"));
					}
					if(msgKeyType.containsKeyColumn("s_FROM_TIME_val")) {
						key.sets_FROM_TIME_val(msgKey.getKeyValue("s_FROM_TIME_val"));
					}
					if(msgKeyType.containsKeyColumn("TO_DATE")) {
						key.setTO_DATE(msgKey.getKeyValue("TO_DATE"));
					}
					if(msgKeyType.containsKeyColumn("s_TO_TIME")) {
						key.sets_TO_TIME(msgKey.getKeyValue("s_TO_TIME"));
					}
					if(msgKeyType.containsKeyColumn("s_TO_TIME_name")) {
						key.sets_TO_TIME_name(msgKey.getKeyValue("s_TO_TIME_name"));
					}
					if(msgKeyType.containsKeyColumn("s_TO_TIME_val")) {
						key.sets_TO_TIME_val(msgKey.getKeyValue("s_TO_TIME_val"));
					}
					if(msgKeyType.containsKeyColumn("h_TO_TIME")) {
						key.seth_TO_TIME(msgKey.getKeyValue("h_TO_TIME"));
					}
					if(msgKeyType.containsKeyColumn("h_plant_flg")) {
						key.seth_plant_flg(new Integer(msgKey.getKeyValue("h_plant_flg")));
					}
					if(msgKeyType.containsKeyColumn("h_own_flg")) {
						key.seth_own_flg(new Integer(msgKey.getKeyValue("h_own_flg")));
					}
					if(msgKeyType.containsKeyColumn("h_sort_flg")) {
						key.seth_sort_flg(new Integer(msgKey.getKeyValue("h_sort_flg")));
					}
					if(msgKeyType.containsKeyColumn("h_detail_flg")) {
						key.seth_detail_flg(new Integer(msgKey.getKeyValue("h_detail_flg")));
					}
					if(msgKeyType.containsKeyColumn("w_BUSINESS_NAME")) {
						key.setw_BUSINESS_NAME(msgKey.getKeyValue("w_BUSINESS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_DATA_STRING")) {
						key.setw_DATA_STRING(msgKey.getKeyValue("w_DATA_STRING"));
					}
					if(msgKeyType.containsKeyColumn("r_PLANT_ALL")) {
						key.setr_PLANT_ALL(msgKey.getKeyValue("r_PLANT_ALL"));
					}
					if(msgKeyType.containsKeyColumn("r_PLANT")) {
						key.setr_PLANT(msgKey.getKeyValue("r_PLANT"));
					}
					if(msgKeyType.containsKeyColumn("c_OWN")) {
						key.setc_OWN(msgKey.getKeyValue("c_OWN"));
					}
					if(msgKeyType.containsKeyColumn("r_SORT_NEW")) {
						key.setr_SORT_NEW(msgKey.getKeyValue("r_SORT_NEW"));
					}
					if(msgKeyType.containsKeyColumn("r_SORT_OLD")) {
						key.setr_SORT_OLD(msgKey.getKeyValue("r_SORT_OLD"));
					}
					if(msgKeyType.containsKeyColumn("h_PLAN_TYP")) {
						key.seth_PLAN_TYP(msgKey.getKeyValue("h_PLAN_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_confirm_flg")) {
						key.setw_confirm_flg(new Integer(msgKey.getKeyValue("w_confirm_flg")));
					}
					if(msgKeyType.containsKeyColumn("w_FROM_DATE")) {
						key.setw_FROM_DATE(msgKey.getKeyValue("w_FROM_DATE"));
					}
					if(msgKeyType.containsKeyColumn("w_TO_DATE")) {
						key.setw_TO_DATE(msgKey.getKeyValue("w_TO_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CONFIRM_DATE")) {
						key.setCONFIRM_DATE(msgKey.getKeyValue("CONFIRM_DATE"));
					}
					if(msgKeyType.containsKeyColumn("LOG_CD")) {
						key.setLOG_CD(msgKey.getKeyValue("LOG_CD"));
					}
					if(msgKeyType.containsKeyColumn("CREATED_DATE")) {
						key.setCREATED_DATE(msgKey.getKeyValue("CREATED_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_NAME")) {
						key.setBUSINESS_NAME(msgKey.getKeyValue("BUSINESS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("USER_CD")) {
						key.setUSER_CD(msgKey.getKeyValue("USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("MSG")) {
						key.setMSG(msgKey.getKeyValue("MSG"));
					}
					if(msgKeyType.containsKeyColumn("DATA_STRING")) {
						key.setDATA_STRING(msgKey.getKeyValue("DATA_STRING"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("USER_NAME")) {
						key.setUSER_NAME(msgKey.getKeyValue("USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_LOG_CD")) {
						key.setw_LOG_CD(msgKey.getKeyValue("w_LOG_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_COUNT")) {
						key.setl_COUNT(msgKey.getKeyValue("l_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ROW_COUNT")) {
						key.setROW_COUNT(msgKey.getKeyValue("ROW_COUNT"));
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
