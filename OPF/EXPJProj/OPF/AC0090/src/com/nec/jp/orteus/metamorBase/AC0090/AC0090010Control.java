/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0090/src/com/nec/jp/orteus/metamorBase/AC0090/AC0090010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0090;

import com.nec.jp.orteus.metamorBase.AC0090.*;
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
import com.nec.jp.orteus.metamorBase.common01.util.DateConverter;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.metamorBase.common01.util.DefaultPeriod;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AC0090010Control
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
       
        public AC0090010Struct getStruct() { return this.struct; }	// Struct�̒l�i���f�B�G�[�^�j��Ԃ��܂��B
       
           //------------------------------------------------------------------------------
       
        /** �i�ڎ�z�敪 */
        private ComboStruct _MRP_ODR_TYP = new ComboStruct();
       
        /** �i�ڎ�z�敪�ݒ�
         * @param �R���{�{�b�N�X�f�[�^
        */
        public void setMRP_ODR_TYP(ComboStruct combo){ _MRP_ODR_TYP = combo; }
       
        /** �i�ڎ�z�敪�擾
         * @return �i�ڎ�z�敪�̃R���{�{�b�N�X�f�[�^
        */
        public ComboStruct getMRP_ODR_TYP(){ return _MRP_ODR_TYP; }
       
        /** ���O�쐬�敪 */
        private ComboStruct _OUTSIDE_TYP = new ComboStruct();
       
        /** ���O�쐬�敪�ݒ�
         * @param �R���{�{�b�N�X�f�[�^
        */
        public void setOUTSIDE_TYP(ComboStruct combo){ _OUTSIDE_TYP = combo; }
       
        /** ���O�쐬�敪�擾
         * @return ���O�쐬�敪�̃R���{�{�b�N�X�f�[�^
        */
        public ComboStruct getOUTSIDE_TYP(){ return _OUTSIDE_TYP; }
         
        /** �݌ɐ��ʒP�ʋ敪 */
        private ComboStruct _UNIT_QTY_TYP = new ComboStruct();
       
        /** �݌ɐ��ʒP�ʋ敪
         * @param �R���{�{�b�N�X�f�[�^
        */
        public void setUNIT_QTY_TYP(ComboStruct combo){ _UNIT_QTY_TYP = combo; }
       
        /** �݌ɐ��ʒP�ʋ敪
         * @return �݌ɐ��ʒP�ʋ敪�̃R���{�{�b�N�X�f�[�^
        */
        public ComboStruct getUNIT_QTY_TYP(){ return _UNIT_QTY_TYP; }
       
        /** ���b�g�܂Ƃߋ敪 */
        private ComboStruct _LOT_SIZING_TYP = new ComboStruct();
       
        /** ���b�g�܂Ƃߋ敪
         * @param �R���{�{�b�N�X�f�[�^
        */
        public void setLOT_SIZING_TYP(ComboStruct combo){ _LOT_SIZING_TYP = combo; }
       
        /** ���b�g�܂Ƃߋ敪
         * @return ���b�g�܂Ƃߋ敪�̃R���{�{�b�N�X�f�[�^
        */
        public ComboStruct getLOT_SIZING_TYP(){ return _LOT_SIZING_TYP; }
         
        //-------------------------------------------------------------------------
         
           /** ��ʋ��ʒ�`�擾�N���X */
           ScreenParam _scParam = sp;
       
           //------------------------------------------------------------------------
       
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
       
           //------------------------------------------------------------------------
       
           /** �Ɩ��^�p�J�n���i�[�p */
           private Date _sysDate = new Date();
       
           //------------------------------------------------------------------------
       
           // ���׍s�S���̃`�F�b�N�{�b�N�X�̒l
           private List _EntryList = null;
           public List getEntryList() { return _EntryList; }
           public void setEntryList(List listname) { _EntryList = listname; }
       
          /** ��ʃp�����[�^�i�ő�\���s���j�擾�A�N�Z�X�L�[ */
           private final static int _DISPLAY_CD_PARENT = 10;
           private final static int _DISPLAY_CD_PARENT_SUB = 20;
       
           /**
            * �\���ő�s����������
            *
            * @param key �A�N�Z�X�L�[
            * @param size �Ώۍs��
            * @return �ُ�Ȃ� true �G���[ false
            */
           private boolean checkMaxDispLine(int key, long rowCount) throws FoundationException, SQLException
           {
               ScreenParam sp = new ScreenParam(this.getClass());
               int maxLine = sp.getMaxLine(conn,key);
               if(maxLine != 0 && rowCount == maxLine + 1)
               {
          ExpjMessage emsg = new ExpjMessage( "ZZ01115", ""+maxLine );
          msgStruct.addError( emsg );
          sysLog.warning(emsg, getsysUSER_CD());
          emsg = new ExpjMessage( "ZZ01006", "T_EXTERNAL_PLAN.EXTERNAL_PLAN_CD:" + struct.getw_PLANT_CD() );
          msgStruct.addError( emsg );
          sysLog.warning(emsg, getsysUSER_CD());
                   return false;
               }
               return true;
           }
         
           /**
            * �Ɩ��^�p���̎擾����
            *
            * @return �ُ�Ȃ� true �G���[ false
            */
           private boolean getSystemDate() throws SQLException, FoundationException
           {
            String Message = "";
            
               // �Ɩ��^�p���̎擾
               List dateList = entity.mSYS_DATE_CTRL.read(conn, struct);
               if(dateList.size() > 0) {
                   AC0090010Struct dateStruct = (AC0090010Struct)dateList.get(0);
                   DateConverter dc = new DateConverter();
                   _sysDate = dc.str2date(dateStruct.gets_BUSINESS_DATE());
               } else{
          Message = "SYS_DATE_CTRL.PLANT_CD:" + struct.getw_PLANT_CD();
          setErrorMessage("ZZ06001", Message);
                   return false;
               }
       
               return true;
           }
       
           /**
            * �i�ڏ��̐ݒ�
            *
            * @param itemList �i�ڏ��
            * @return �Ȃ�
            */
        private void setItemInfo(List itemList)
        {
         AC0090010Struct itemStruct = (AC0090010Struct)itemList.get(0);
         
         // �i�ږ�
         struct.setw_ITEM_NAME(itemStruct.getw_ITEM_NAME());
         // �}�ʔԍ�
         struct.setw_DRAW_CD(itemStruct.getw_DRAW_CD());
         // �K�i
         struct.setw_SPEC(itemStruct.getw_SPEC());
         // �i�ڎ�z�敪
         struct.setw_MRP_ODR_TYP(getComboItem(this.getMRP_ODR_TYP(), itemStruct.getw_MRP_ODR_TYP()));
         // �i�ړ��O��敪
         struct.setw_OUTSIDE_TYP(getComboItem(this.getOUTSIDE_TYP(), itemStruct.getw_OUTSIDE_TYP()));
         // �i�ڎd����
         struct.setw_ITEM_SPOIL(itemStruct.getw_ITEM_SPOIL());
         // �݌ɐ��P�ʋ敪
         struct.setw_UNIT_QTY_TYP(getComboItem(this.getUNIT_QTY_TYP(), itemStruct.getw_UNIT_QTY_TYP()));
         // ���b�g�܂Ƃߋ敪
         struct.setw_LOT_SIZING_TYP(getComboItem(this.getLOT_SIZING_TYP(), itemStruct.getw_LOT_SIZING_TYP()));
         // �ő�܂Ƃߊ���
         struct.setw_MAX_PERIOD(itemStruct.getw_MAX_PERIOD());
         // �܂�ߒP��
         struct.setw_MUL_ODR_QTY(itemStruct.getw_MUL_ODR_QTY());
         // ���S�݌�
         struct.setw_SAFETY_STOCK(itemStruct.getw_SAFETY_STOCK());
         // �ő��z����
         struct.setw_MAX_ODR_QTY(itemStruct.getw_MAX_ODR_QTY());
         // �ŏ���z����
         struct.setw_MIN_ODR_QTY(itemStruct.getw_MIN_ODR_QTY());
         // �v�ʒP��
         struct.setSTOCK_UNIT(itemStruct.getSTOCK_UNIT());
        }
       
         
           /**
            * �i�ڏ��̃N���A
            *
            * @return �Ȃ�
            */
        private void setItemClear()
        {
         struct.setw_ITEM_NAME("");
         struct.setw_DRAW_CD("");
         struct.setw_SPEC("");
         struct.setw_MRP_ODR_TYP("");
         struct.setw_OUTSIDE_TYP("");
         struct.setw_ITEM_SPOIL("");
         struct.setw_UNIT_QTY_TYP("");
         struct.setw_LOT_SIZING_TYP("");
         struct.setw_MAX_PERIOD("");
         struct.setw_MUL_ODR_QTY("");
         struct.setw_SAFETY_STOCK("");
         struct.setw_MAX_ODR_QTY("");
         struct.setw_MIN_ODR_QTY("");
         struct.setSTOCK_UNIT("");
        }
       
           /**
            * �T�u��ʏ��̐ݒ�
            *
            * @param temp_struct AC0090010Struct temp_struct
            * @return �Ȃ�
            */
        private void setSubParamInfo(AC0090010Struct temp_struct)
        {
         // �[��
         struct.setw_subDUE_DATE(temp_struct.getDUE_DATE().substring(0,10));
         // �[���i�����j
        
         if(null != struct.getTIME_CTRL() && "true".equals(struct.getTIME_CTRL())){
	         struct.setw_subDUE_TIME(temp_struct.getDUE_DATE().substring(11,16));
         }else{
             struct.setw_subDUE_TIME("");
         }
                        	
         // �O���f�}���h��
         struct.setw_subDM_QTY(temp_struct.getDM_QTY());
         // �i�ڔԍ�
         struct.setw_subITEM_CD(struct.getw_ITEM_CD());
         // �i�ږ�
         struct.setw_subITEM_NAME(struct.getw_ITEM_NAME());
         // �O���v��ԍ�
         struct.setw_subEXTERNAL_PLAN_CD(temp_struct.getEXTERNAL_PLAN_CD());
         // �H��R�[�h
         struct.setw_subPLANT_CD(struct.getw_PLANT_CD());
         // �H�ꖼ
         struct.setw_subPLANT_NAME(struct.getw_PLANT_NAME());
         // �I�[�_�f�}���h�ԍ�
         struct.setOD_NO(temp_struct.getOD_NO());
         // �X�V��
         struct.setMODIFY_COUNT(temp_struct.getMODIFY_COUNT());
        }
       
           /**
            * �X�V�f�[�^�̐ݒ�
            *
            * @param temp_struct ���i�\������擾�������
            * @return �Ȃ�
            */
        private void setUpdateData(AC0090010Struct temp_struct)
        {
         // ���v�ʕi�ڍ\���Ő�
         struct.setPS_EDITION(temp_struct.getPS_EDITION());
         // ���i�\�����[�h�^�C���g�p�t���O
         struct.setPS_LT_FLG(temp_struct.getPS_LT_FLG());
         // ���i�\���Œ蕪���[�h�^�C��
         struct.setPS_FIXED_LT(temp_struct.getPS_FIXED_LT());
         // ���i�\����ᕪ���[�h�^�C��
         struct.setPS_PROP_LT(temp_struct.getPS_PROP_LT());
         // ���i�\����ᕪ���b�g�T�C�Y
         struct.setPS_PROP_LOT_SIZE(temp_struct.getPS_PROP_LOT_SIZE());
         // ���i�\���P�ʐ�
         struct.setPS_UNIT_QTY(Calculate.divide(temp_struct.getPS_UNIT_NUMERATOR(),
                temp_struct.getPS_UNIT_DENOMINATOR(),
                4,
                Calculate._ROUND));
         // ���i�\���P�ʐ�����
         struct.setPS_UNIT_DENOMINATOR(temp_struct.getPS_UNIT_DENOMINATOR());
         // ���i�\���P�ʐ����q
         struct.setPS_UNIT_NUMERATOR(temp_struct.getPS_UNIT_NUMERATOR());
         // ���v�ʍ\���d����
         struct.setPS_SPOIL(temp_struct.getPS_SPOIL());
         // �\���x���敪
         struct.setCONS_TYP(temp_struct.getCONS_TYP());
         // ���v�ʗL���J�n��
         struct.setEFF_PHASE_IN_DATE(temp_struct.getEFF_PHASE_IN_DATE());
         // ���v�ʗL���I����
         struct.setEFF_PHASE_OUT_DATE(temp_struct.getEFF_PHASE_OUT_DATE());
        }
         
           /**
            * �T�u��ʂ̐��Y�v����Ԃ̐ݒ�
            *
            * @param fromDUE_DATE �[��
            * @return �Ȃ�
            */
        private void setSubDateInfo(String fromDUE_DATE)
        {
         // ���Y�v�����(FROM)�֒l��ݒ�
         // ���Y�v�����(TO)(����)�֒l��e��ʂ̓��͓��t(TO)(����)��ݒ�
         if (fromDUE_DATE.length() > 10){
             struct.setw_subDATE_FROM(fromDUE_DATE.substring(0,10));
             struct.setw_subTIME_FROM(fromDUE_DATE.substring(11,13) + fromDUE_DATE.substring(14,16));
         }else{
             struct.setw_subDATE_FROM(fromDUE_DATE);
             struct.setw_subTIME_FROM("");
         }
       
         // ���Y�v�����(TO)�֒l��e��ʂ̓��͓��t(TO)��ݒ�
         struct.setw_subDATE_TO(struct.getw_DATE_TO());

         // ���Y�v�����(TO)(����)�֒l��e��ʂ̓��͓��t(TO)(����)��ݒ�
         struct.setw_subTIME_TO(struct.getw_TIME_TO());

        }
         
           /**
            * ���Y�v����Ԃ͈̔̓`�F�b�N
            *
         * @param strFrom ���Y�v�����(FROM)
         * @param strTo   ���Y�v�����(TO)
            * @return true/false
            */
        private boolean DateRangeCheck(String strFrom, String strTo) throws FoundationException, SQLException
        {
        	
         String minDateCal = null;
         String maxDateCal = null;
         // �������ʃt���O������
         boolean result = true;
         String Message = "";
         AC0090010Struct dateStruct;
         int endfg = 0;
         int Checkfg =0;
         // �v����ԃ`�F�b�N�p�ɐ��Y�v����Ԃ�ύX
         DateConverter dc = new DateConverter();
         Date fromDate = dc.str2date(strFrom);
         Date toDate = dc.str2date(strTo);
         
         // �J�����_�f�[�^�擾
         List dateList = entity.mM_CAL1.read(conn, struct);
         if(dateList.size() > 0){
         	dateStruct = (AC0090010Struct)dateList.get(0);
         	minDateCal = dateStruct.gets_MIN_CAL_DATE();
         	maxDateCal = dateStruct.gets_MAX_CAL_DATE();
          // �J�����_�͈͂̃`�F�b�N
          if(minDateCal != null && maxDateCal != null) {
              endfg = 1;
          	  Checkfg =1;
             }else{
             	dateList = entity.mM_CAL.read(conn, struct);
             	if(dateList.size() > 0){
             		dateStruct = (AC0090010Struct)dateList.get(0);
             		minDateCal = dateStruct.gets_MIN_CAL_DATE();
             		maxDateCal = dateStruct.gets_MAX_CAL_DATE();
             		if(minDateCal != null && maxDateCal != null) {
             		   	endfg = 1;
             		   }else{
             		   	// �J�����_�擾���s
           				Message = "SYS_DATE_CTRL.PLANT_CD:" + struct.getw_PLANT_CD();
           				setErrorMessage("AC10005", Message);
           				result = false;
             		   }
             	}else{
             		// �J�����_�擾���s
           			Message = "SYS_DATE_CTRL.PLANT_CD:" + struct.getw_PLANT_CD();
           			setErrorMessage("AC10005", Message);
           			result = false;
             	}
             }
         }else{
         	// �J�����_�擾���s
            Message = "M_ITEM.ITEM_CD:" + struct.getw_ITEM_CD();
            setErrorMessage("AC10005", Message);
            result = false;
         }
         	if(endfg ==1){
         		Date minCalDate = dc.str2date(minDateCal);
              	Date maxCalDate = dc.str2date(maxDateCal);
              
              	// �J�����_�͈̓`�F�b�N�t���O
              	boolean calFlag = true;
              	if(fromDate == null && toDate != null) {
               		if(maxCalDate.getTime() < toDate.getTime()) {
                 	calFlag = false;
               	}
              	} else if(fromDate != null && toDate == null) {
               	if(minCalDate.getTime() > fromDate.getTime()) {
                	calFlag = false;
               	}
              	} else if(fromDate != null && toDate != null) {
               	if(minCalDate.getTime() > fromDate.getTime() ||
                  maxCalDate.getTime() < toDate.getTime()) {
                   calFlag = false;
               }
              }
              // �v����Ԃ��J�����_�͈̔͊O
           if(!calFlag) {
           	if(Checkfg ==1){
           		Message = "M_ITEM.ITEM_CD:" + struct.getw_ITEM_CD();
            	setErrorMessage("AC10005", Message);
            	result = false;
           	}else{
           		Message = "SYS_DATE_CTRL.PLANT_CD:" + struct.getw_PLANT_CD();
           		setErrorMessage("AC10005", Message);
           		result = false;
           	}
           }
         	}else{
         		// �J�����_�擾���s
            	Message = "SYS_DATE_CTRL.ITEM_CD:" + struct.getw_ITEM_CD();
            	setErrorMessage("AC10005", Message);
            	result = false;
         	}
         
            // ���Y�v�����(FROM)���Ɩ��^�p�����ߋ�
         if(_sysDate.getTime() > fromDate.getTime()) {
          Message = "SYS_DATE_CTRL.PLANT_CD:" + struct.getw_PLANT_CD();
          setErrorMessage("AC10006", Message);
          result = false;
         }
         return result;
        }
         
           /**
            * �R���{���X�g����擾�������L�[�l�̒l���擾
            *
         * @param comboList �R���{�{�b�N�X�̃��X�g
         * @param read_item �擾�������l�̃L�[�l
            * @return �R���{���X�g���擾�������l
            */
        private String getComboItem(ComboStruct comboList, String read_item)
        {
         String val = "";
         
         for(int i = 0; i < comboList.getValList().size(); i++)
         {
          val = (String)(comboList.getValList().get(i));
          if(val.equals(TypeConverter.sanitizer(read_item)) == true)
          {
           return (String)(comboList.getExplanList().get(i));
          }
         }
         
         return "";
        }
         
        /** �e���struct���ꎞ�ޔ�p */
        private AC0090010Struct _save_struct = new AC0090010Struct();
       
        /**
         * �e��ʂ�struct����ޔ�
         */
        private void w_subTIME_TO()
        {
         _save_struct.copy(struct);
        }
       
        /**
         * �e��ʂ�struct���𕜋A
         */
        private void loadParentStruct()
        {
         struct.copy(_save_struct);
        }
       
        // �s�C��/�R�t������/�o�^�Ώۂ̍\�����No
        private Integer _checkNo = null;
        
        /** �s�C��/�R�t������/�o�^�ΏۑΏۂ̍\�����No�擾
         * @return �\�����No
        */
        public Integer getCheckNumber(){ return _checkNo; }
       
        /** �s�C��/�R�t������/�o�^�ΏۑΏۂ̍\�����No�ݒ�
         * @param �s�C��/�R�t������/�o�^�ΏۑΏۂ̍\�����No
        */
        public void setCheckNumber(Integer no){ _checkNo = no; }
         
        /*
         * �f�t�H���g���Y�v����ԓ��t�擾�ݒ�
         *
         * @return	�Ȃ�
         */
        private void setDefaultPeriodDate() throws ExpjException
        {
               // �Ɩ��^�p���̎擾
         Date dateBusinessOprDate = null;
               try
               {
                if(getSystemDate() == true) {
                 dateBusinessOprDate = _sysDate;
                }
                
          // �f�t�H���g���Y�v����ԓ��t�擾
          String strDefDate[] = {"", ""};
          boolean bResult = false;
                
          DefaultPeriod dp = new DefaultPeriod();
          bResult = dp.get(conn, dateBusinessOprDate, strDefDate);
                
          if(bResult == true)
          {
           // �擾����
           struct.setw_DATE_FROM(strDefDate[0]);
           struct.setw_DATE_TO(strDefDate[1]);
          }
          else
          {
           // �擾���s
           ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
           sysLog.severe(emsg, getsysUSER_CD());
           ExpjException ee = new ExpjException(emsg);
           
           throw ee;
          }
         }
         catch(SQLException se)
         {
          ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
          sysLog.severe(emsg, getsysUSER_CD());
          ExpjException ee = new ExpjException(emsg);
          
          throw ee;
         }
         catch(FoundationException fe)
         {
          ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
          sysLog.severe(emsg, getsysUSER_CD());
          ExpjException ee = new ExpjException(emsg);
          
          throw ee;
         }
       
       
       
        }
         
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

        /** �����Ǘ��p�t���O */
        private String _flgTimeCtrl = null;

        /**
        * ���������̐ݒ�
        */
        private void setSearchCondition() {

                // �f�[�^�����N���A
                struct.setw_DATE_FROM_ALL(null);
                struct.setw_DATE_TO_ALL(null);

                // ���o�����i���t�̐ݒ�j
                if(null != struct.getTIME_CTRL() && "true".equals(struct.getTIME_CTRL())){

                        if (struct.getw_DATE_FROM() != null && !struct.getw_DATE_FROM().equals("")) {
                                //�����\����̎�����00:00�ȊO�̏ꍇ�˂��̂܂܌���
                                if (struct.getw_TIME_FROM() != null && !struct.getw_TIME_FROM().equals("")) {
                                        /** �����\����i�����܂ށj*/
                                        struct.setw_DATE_FROM_ALL(struct.getw_DATE_FROM() + " " + 
                                                                struct.getw_TIME_FROM().substring(0,2) + ":" + 
                                                                struct.getw_TIME_FROM().substring(2));
                                //�����\����̎����������͂̏ꍇ�˓��t�݂̂Ō���
                                }else{
                                        /** �����\��� **/
                                        struct.setw_DATE_FROM_ALL(struct.getw_DATE_FROM());
                                }
                        }
                        if (struct.getw_DATE_TO() != null && !struct.getw_DATE_TO().equals("")) {
                                //�����[���̎�����00:00�ȊO�̏ꍇ�˂��̂܂܌���
                                if (struct.getw_TIME_TO() != null && !struct.getw_TIME_TO().equals("")) {
                                        /** �����[���i�����܂ށj*/
                                        struct.setw_DATE_TO_ALL(struct.getw_DATE_TO() + " " + 
                                                                struct.getw_TIME_TO().substring(0,2) + ":" + 
                                                                struct.getw_TIME_TO().substring(2));
                                //�����[���̎����������͂̏ꍇ��23:59�Ō���
                                }else{
                                        /** �����[���i�����܂ށj*/
                                        struct.setw_DATE_TO_ALL(struct.getw_DATE_TO() + " 23:59");
                                }
                        }
                }else{
                        if (struct.getw_DATE_FROM() != null && !struct.getw_DATE_FROM().equals("")) {
                                /** �����\��� **/
                                struct.setw_DATE_FROM_ALL(struct.getw_DATE_FROM());
                        }
                        if (struct.getw_DATE_TO() != null && !struct.getw_DATE_TO().equals("")) {
                                /** �����[���i�����܂ށj*/
                                struct.setw_DATE_TO_ALL(struct.getw_DATE_TO() + " 23:59");
                        }
                }
        }

        /**
        * ���������̐ݒ�
        */
        private void setSearchCondition_sub1() {

                // �f�[�^�����N���A
                struct.setw_subDATE_FROM_ALL(null);
                struct.setw_subDATE_TO_ALL(null);

                // ���o�����i���t�̐ݒ�j
                if(null != struct.getTIME_CTRL() && "true".equals(struct.getTIME_CTRL())){

                        if (struct.getw_subDATE_FROM() != null && !struct.getw_subDATE_FROM().equals("")) {
                                //�����\����̎�����00:00�ȊO�̏ꍇ�˂��̂܂܌���
                                if (struct.getw_subTIME_FROM() != null && !struct.getw_subTIME_FROM().equals("")) {
                                        /** �����\����i�����܂ށj*/
                                        struct.setw_subDATE_FROM_ALL(struct.getw_subDATE_FROM() + " " + 
                                                                     struct.getw_subTIME_FROM().substring(0,2) + ":" + 
                                                                     struct.getw_subTIME_FROM().substring(2));
                                //�����\����̎����������͂̏ꍇ�˓��t�݂̂Ō���
                                }else{
                                        /** �����\��� **/
                                        struct.setw_subDATE_FROM_ALL(struct.getw_subDATE_FROM());
                                }
                        }
                        if (struct.getw_subDATE_TO() != null && !struct.getw_subDATE_TO().equals("")) {
                                //�����[���̎�����00:00�ȊO�̏ꍇ�˂��̂܂܌���
                                if (struct.getw_subTIME_TO() != null && !struct.getw_subTIME_TO().equals("")) {
                                        /** �����[���i�����܂ށj*/
                                        struct.setw_subDATE_TO_ALL(struct.getw_subDATE_TO() + " " + 
                                                                   struct.getw_subTIME_TO().substring(0,2) + ":" + 
                                                                   struct.getw_subTIME_TO().substring(2));
                                //�����[���̎����������͂̏ꍇ��23:59�Ō���
                                }else{
                                        /** �����[���i�����܂ށj*/
                                        struct.setw_subDATE_TO_ALL(struct.getw_subDATE_TO() + " 23:59");
                                }
                        }
                }else{
                        if (struct.getw_subDATE_FROM() != null && !struct.getw_subDATE_FROM().equals("")) {
                                /** �����\��� **/
                                struct.setw_subDATE_FROM_ALL(struct.getw_subDATE_FROM());
                        }
                        if (struct.getw_subDATE_TO() != null && !struct.getw_subDATE_TO().equals("")) {
                                /** �����[���i�����܂ށj*/
                                struct.setw_subDATE_TO_ALL(struct.getw_subDATE_TO() + " 23:59");
                        }
                }
        }
         
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
		logger.entering("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
                //---------------------------------------------------------------------
              
                // �Ǎ����������t���O������
                boolean readResult = false;
              
                // �e��ʂ�struct��ޔ�
                w_subTIME_TO();
                 
                String Message = "";
                List listMessage = new ArrayList();
                
                // �Ǎ��O�̏�Ԃ�������
                setReadStatus(INITIAL);
              
                try {
                    // �������ʃt���O������
                    boolean result = true;
                 boolean bValidPlantCD = true;
                 boolean bValidItemCD = true;
                    // �ő�\�����������ʃt���O������
                    
                	
                 // �\������Ă��郊�X�g���N���A����
                 list.clear();
              
                 // �G���[�`�F�b�N
                 // �i�ڃR�[�h�̃`�F�b�N
                 List itemList = entity.mM_ITEM.read(conn, struct);
                 if(itemList.size() <= 0) {
                           // �Ǎ��������s�F�i�ڃR�[�h�����݂��܂���
                  Message = "M_ITEM.ITEM_CD:" + struct.getw_ITEM_CD();
                  setErrorMessage("AC10002", Message);
                  // �i�ڏ��̃N���A
                  setItemClear();
                  bValidItemCD = false;
                 } else {
                  // �i�ڏ���struct�֑������
                  setItemInfo(itemList);
                 }
                     
                       // �H��R�[�h�̑��݃`�F�b�N
                    List plantList = entity.mM_PLANT.read(conn, struct);
                       if(plantList.size() <= 0) {
                           // �Ǎ��������s�F�H��R�[�h�����݂��܂���
                           struct.setw_PLANT_NAME("");
                  Message = "M_PLANT.PLANT_CD:" + struct.getw_PLANT_CD();
                  setErrorMessage("AC10001", Message);
                           bValidPlantCD = false;
                       } else {
                           AC0090010Struct plantStruct = (AC0090010Struct)plantList.get(0);
                           struct.setw_PLANT_NAME(plantStruct.getw_PLANT_NAME());
              
                        // ���Y�v����Ԃ͈̔̓`�F�b�N
                        result = DateRangeCheck(struct.getw_DATE_FROM(), struct.getw_DATE_TO());
                 }
              
                 // �G���[���Ȃ��ꍇ
                 if(bValidItemCD && bValidPlantCD && result) {

                  //���͎����̃`�F�b�N(�����Ǘ�����ꍇ�̂�)
                  if((struct.getTIME_CTRL()).equals("true")){
                          //�@�����\���(����)�̃`�F�b�N
                          if((struct.getw_TIME_FROM()).length() == 3 ){
                              //�R���͓��ɂO��t����
                              struct.setw_TIME_FROM("0" + struct.getw_TIME_FROM());
                          }
                          //�A�����[��(����)�̃`�F�b�N
                          if((struct.getw_TIME_TO()).length() == 3 ){
                              //�R���͓��ɂO��t����
                              struct.setw_TIME_TO("0" + struct.getw_TIME_TO());
                          }
                  }else{
                      struct.setw_TIME_FROM("");
                      struct.setw_TIME_TO("");
                  }

                  // ���������̐ݒ�
                  setSearchCondition();
                  // �Ǎ����s
                  List read_list = new ArrayList(0);
                  int maxLine = sp.getMaxLine(conn, _DISPLAY_CD_PARENT);
      			  if(maxLine != 0) {
      				struct.setROW_COUNT(String.valueOf(maxLine));
      			  } else {
      				struct.setROW_COUNT(null);
      			  }
      			 read_list = entity.mT_OD_DEMANDOCnt.read(conn, struct);
      			 long rowCount = Long.parseLong(((AC0090010Struct)read_list.get(0)).getl_COUNT());
      			 // �������ʂ��O���̏ꍇ
      			 if(rowCount==0) {
      				 setReadStatus(NOT_FOUND);
                     listMessage.add("T_OD.PLANT_CD:" + struct.getw_PLANT_CD());
                     listMessage.add("T_OD.ITEM_CD:" + struct.getw_ITEM_CD());
                     listMessage.add("T_OD.DUE_DATE[FROM]:" + struct.getw_DATE_FROM());
                     listMessage.add("T_OD.DUE_DATE[TO]:" + struct.getw_DATE_TO());
                     setErrorMessage("ZZ06001", listMessage);
      			 }else {
                       // �\���ő�s����������
                       if(checkMaxDispLine(_DISPLAY_CD_PARENT, rowCount)) {
                           read_list = entity.mT_OD_DEMANDO.read(conn, struct);
                           setReadStatus(NORMAL);
                           for(int i=0; i < read_list.size(); i++) {
                           AC0090010Struct viewStruct = (AC0090010Struct)read_list.get(i);
                           }
                       // �\���p���X�g���X�V
                       setList(read_list);
                       // �Ǎ����������t���O�ݒ�
                      readResult = true;
                      }else{
                	      // ��Ԃɍő�\���s���ȏ��ݒ�
                           setReadStatus(TOO_MANY);
                      }
      			 }
               }
              }catch(SQLException e) {
                    setSqlExceptionMsg(e);
              
                } finally {
                    if(readResult) {
                     setReadStatus(NORMAL);
                     
                    } else {
                         setReadStatus(INITIAL);
                         // �G���[�̏ꍇ�A�\�����X�g���N���A
                        if(list!=null && list.size()>0){   
                           list.clear();
                        }
                    }
                }

                //}}user_implement_dev:<controlselect>
		logger.exiting("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * �s�C���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlmodify() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
		logger.entering("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlmodify");
			//{{user_implement_dev:<controlmodify>
                //---------------------------------------------------------------------
              
                // �T�u��ʂ̐��Y�v����Ԃ̐ݒ�
                setSubDateInfo(struct.getDUE_DATE());
              
                // �T�u��ʂ̏���ݒ�
                setSubParamInfo(struct);

                // �T�u��ʂ̓Ǎ��ݏ���
                controlselect_sub1();
              
                //}}user_implement_dev:<controlmodify>
		logger.exiting("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlmodify");

		return;
	}

	/**
	 * �R�t�������{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
		logger.entering("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
                //------------------------------------------------------------------
                
                // DB�X�V���t���O������
                boolean bDBUpdate = false;
                 
                // �X�V���������t���O������
                boolean bSuccess = false;
                 
                // �������O��struct����ޔ�
                AC0090010Struct copy_struct = new AC0090010Struct();
                copy_struct.copy(struct);
                 
                String Message = "";
				
                try {
                 // �g�����U�N�V�����J�n
                 conn.beginTransWeb();
              
                 // DB�X�V���t���OON
                 bDBUpdate = true;
                 
                 // �X�V�`�F�b�N�̊m�F
                 List m_list = entity.mT_OD_DEMANDO4Update.read(conn, struct);
                 if(m_list.size() <= 0){
                  Message = "T_OD.OD_NO:" + struct.getOD_NO();
                  setErrorMessage("ZZ06001", Message);
                 }
                 else{
                  String modify = ((AC0090010Struct)m_list.get(0)).getMODIFY_COUNT();
              
                  if (struct.getMODIFY_COUNT().equals(modify) == false)
                  {
                   Message = "T_OD.OD_NO:" + struct.getOD_NO();
                   setErrorMessage("ZZ01105", Message);
                  }
                 }
                 
                 // �G���[���������Ă��Ȃ��ꍇ�A�X�V�������{
                 if(msgStruct.sizeError() <= 0)
                 {
                  // �X�V
                  entity.mT_OD_DEMANDO.update(conn, struct);
                  
                  // �R�~�b�g
                  conn.commit();
              
                  // DB�X�V���t���OOFF
                  bDBUpdate = false;
                  
                  // �X�V���������t���O�ݒ�
                  bSuccess = true;
                  
                  // �ޔ�����struct���Đݒ�
                  struct.copy(copy_struct);
                  
                  try {
                   //�����Ǘ��p�����[�^�擾
                   List listTimeCtrl = entity.mSYS_PARAMETER.read(conn,struct);
                   if(listTimeCtrl == null || listTimeCtrl.size() <=0){
                       struct.setTIME_CTRL("false");
                       _flgTimeCtrl = "false";
                   }else{
                       struct.setTIME_CTRL(((AC0090010Struct)listTimeCtrl.get(0)).getTIME_CTRL());
                       _flgTimeCtrl = struct.getTIME_CTRL();
                   }
                  } catch (SQLException e) {
                   throw new ExpjException(e);
                  }
                  
                  // ����
                  controlselect();
              
                 }			
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                } finally {
                 // DB�X�V�������ɉ��炩�̃G���[�����������ꍇ��roolback�������Ȃ�
                 if(bDBUpdate == true)
                 {
                  // ���[���o�b�N
                  conn.rollback();
              
                  // DB�X�V���t���OOFF
                  bDBUpdate = false;
                 }
                 
                 // �X�V�����Ŏ��s�����ꍇ
                 if(bSuccess != true)
                 {
                  // �������O�̏�Ԃɖ߂�����
                  struct.copy(copy_struct);
                 }
              
                }
                //}}user_implement_dev:<controlupdate>
		logger.exiting("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
		logger.entering("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
                      //------------------------------------------------------------------
              
                   // �N���A����
                this.struct.clear();
              
                      // ���H��R�[�h�ݒ�
                      struct.setw_PLANT_CD(getsysPLANT_CD());
              
                      // �f�t�H���g���Y�v����Ԏ擾�ݒ�
                      setDefaultPeriodDate();
              
                      // �\�����X�g���N���A
                      list.clear();
              
              
                try {
                 //�����Ǘ��p�����[�^�擾
                 List listTimeCtrl = entity.mSYS_PARAMETER.read(conn,struct);
                 if(listTimeCtrl == null || listTimeCtrl.size() <=0){
                     struct.setTIME_CTRL("false");
                     _flgTimeCtrl = "false";
                 }else{
                     struct.setTIME_CTRL(((AC0090010Struct)listTimeCtrl.get(0)).getTIME_CTRL());
                     _flgTimeCtrl = struct.getTIME_CTRL();
                 }
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }

                      // ���[�h�ݒ�
                setReadStatus(INITIAL);

                //}}user_implement_dev:<controlclear>
		logger.exiting("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlselect_sub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
		logger.entering("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlselect_sub1");
			//{{user_implement_dev:<controlselect_sub1>
                //---------------------------------------------------------------------
              
                // �Ǎ����������t���O������
                boolean readResult = false;
                 
                // �q��ʂ̏�Ԃ�������
                setReadStatus(INITIAL);
                 
                List listMessage = new ArrayList();
                 
                try {
                    // �������ʃt���O������
                    boolean result = true;
                    // �ő�\�����������ʃt���O������
                    
                 // �\������Ă��郊�X�g���N���A����
                 list.clear();
              
                 // �e��ʂ̍H��R�[�h��ݒ�
                 struct.setw_PLANT_CD(_save_struct.getw_PLANT_CD());
                	
                 // �e��ʂ̕i�ڔԍ���ݒ�
                 struct.setw_ITEM_CD(_save_struct.getw_ITEM_CD());
              
                 // ���Y�v����Ԃ͈̔̓`�F�b�N
                 result = DateRangeCheck(struct.getw_subDATE_FROM(), struct.getw_subDATE_TO());
                 
                 // �G���[���Ȃ��ꍇ
                 if(result) {

                  //���͎����̃`�F�b�N(�����Ǘ�����ꍇ�̂�)
                  if((struct.getTIME_CTRL()).equals("true")){
                  	  if(struct.getw_subTIME_FROM() == null){
                          struct.setw_subTIME_FROM("");
                              //�@�����\���(����)�̃`�F�b�N
                              if((struct.getw_subTIME_FROM()).length() == 3 ){
                                  //�R���͓��ɂO��t����
                                  struct.setw_subTIME_FROM("0" + struct.getw_subTIME_FROM());
                              }
                      }
                      if(struct.getw_subTIME_TO() == null){
                          struct.setw_subTIME_TO("");
                              //�A�����[��(����)�̃`�F�b�N
                              if((struct.getw_subTIME_TO()).length() == 3 ){
                                  //�R���͓��ɂO��t����
                                  struct.setw_subTIME_TO("0" + struct.getw_subTIME_TO());
                              }
                      }
                  }else{
                      struct.setw_subTIME_FROM("");
                      struct.setw_subTIME_TO("");
                  }

                  // ���������̐ݒ�
                  setSearchCondition_sub1();
                  // �Ǎ����s
                  List read_list = new ArrayList(0);
                  int maxLine = sp.getMaxLine(conn, _DISPLAY_CD_PARENT_SUB);
        			if(maxLine != 0) {
        				struct.setROW_COUNT(String.valueOf(maxLine));
        			} else {
        				struct.setROW_COUNT(null);
        			}
        		  read_list = entity.mT_OD_ORDERCnt.read(conn, struct);
        		  long rowCount = Long.parseLong(((AC0090010Struct)read_list.get(0)).getl_COUNT());
        		  // �������ʂ��O���̏ꍇ
        		  if(rowCount==0) {
                        result = false;
                        setReadStatus(NOT_FOUND);
                        listMessage.add("T_OD.ODR_START_DATE[FROM]:" + struct.getw_subDATE_FROM());
                        listMessage.add("T_OD.ODR_START_DATE[TO]:" + struct.getw_subDATE_TO());
                        listMessage.add("T_OD.ITEM_CD:" + struct.getw_subITEM_CD());
                        listMessage.add("T_OD.DUE_DATE:" + struct.getw_subDUE_DATE());
                        listMessage.add("T_OD.PLANT_CD:" + struct.getw_subPLANT_CD());
                        setErrorMessage("ZZ06001", listMessage);
                        if(list!=null && list.size()>0){
                        	list.clear();
                        }
                        return;
                  } 
        		  // �\���ő�s����������
                  if(checkMaxDispLine(_DISPLAY_CD_PARENT_SUB, rowCount)) {
                    read_list = entity.mT_OD_ORDER.read(conn, struct);
                    for(int i=0; i<read_list.size(); i++) {
                    AC0090010Struct read_struct = (AC0090010Struct)read_list.get(i);
              
                    // �q��ʂőI�������i�ڔԍ��̐ݒ�
                    struct.setsubITEM_CD(read_struct.getsubITEM_CD());
                    
                    // �I�[�_�f�}���h�ԍ���ݒ肷��
                    struct.setsubOD_NO(read_struct.getsubOD_NO());
                    
                    // �]���f�}���h���ʂ̌v�Z
                    List sumList = new ArrayList(0);
                    sumList = entity.mT_OD_ORDER_SUM.read(conn, struct);
                    AC0090010Struct sum_struct = (AC0090010Struct)sumList.get(0);
              
                    // �]���f�}���h���̐ݒ�
                    if(sum_struct.getsubDM_QTY() == null) {
                     sum_struct.setsubDM_QTY("0");
                    }
                    read_struct.setsubSU_DM_QTY(sum_struct.getsubDM_QTY());
                    
                    // ���i�\���P�ʐ��̌v�Z
                    String divide = Calculate.divide(read_struct.getsubPS_UNIT_NUMERATOR(),
                             read_struct.getsubPS_UNIT_DENOMINATOR(),
                             4,
                             Calculate._ROUND);
              
                    // �R�t���\�f�}���h���̐ݒ�
                    String sODR_QTY = Calculate.subtract(Calculate.multiply(read_struct.getsubODR_QTY(), divide), sum_struct.getsubDM_QTY());
                    if(Calculate.compare(sODR_QTY, "0") == -1) {
                     sODR_QTY = "0.0";
                    }
                    read_struct.setsubRE_ODR_QTY(sODR_QTY);
                    
                    // �\���P�ʐ��̐ݒ�
                    String sCP_UNIT = read_struct.getsubPS_UNIT_NUMERATOR() + "/" + read_struct.getsubPS_UNIT_DENOMINATOR();
                    read_struct.setCP_UNIT(sCP_UNIT);
                   }
                   
                    // �\���p���X�g���X�V
                    setList(read_list);
                    
                    // �Ǎ����������t���O�ݒ�
                    readResult = true;
                  
                  }else{
               	      setReadStatus(TOO_MANY);
                  }
                 }
                } catch(SQLException e) {
                    setSqlExceptionMsg(e);
              
                } finally {
                    if(readResult) {
                     setReadStatus(NORMAL);
                    } else {
                           setReadStatus(INITIAL);
              
                            // �G���[�̏ꍇ�A�\�����X�g���N���A
                           if(list!=null && list.size()>=0){
                             list.clear();
                           }
                    }
                }
              
                //}}user_implement_dev:<controlselect_sub1>
		logger.exiting("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlselect_sub1");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlreturn_sub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
		logger.entering("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub1");
			//{{user_implement_dev:<controlreturn_sub1>
                //---------------------------------------------------------------------
              
                // �q��ʂɑJ�ڂ���O�̐e��ʂ�struct�𕜋A
                loadParentStruct();
              
                try {
                 //�����Ǘ��p�����[�^�擾
                 List listTimeCtrl = entity.mSYS_PARAMETER.read(conn,struct);
                 if(listTimeCtrl == null || listTimeCtrl.size() <=0){
                     struct.setTIME_CTRL("false");
                     _flgTimeCtrl = "false";
                 }else{
                     struct.setTIME_CTRL(((AC0090010Struct)listTimeCtrl.get(0)).getTIME_CTRL());
                     _flgTimeCtrl = struct.getTIME_CTRL();
                 }
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }

                // �ēǍ�����
                controlselect();
              
                //}}user_implement_dev:<controlreturn_sub1>
		logger.exiting("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub1");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlupdate_sub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
		logger.entering("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlupdate_sub1");
			//{{user_implement_dev:<controlupdate_sub1>
                //------------------------------------------------------------------
                
                // DB�X�V���t���O������
                boolean bDBUpdate = false;
                 
                // �X�V���������t���O������
                boolean bSuccess = false;
                 
                // �������O��struct����ޔ�
                AC0090010Struct copy_struct = new AC0090010Struct();
                copy_struct.copy(struct);
                 
                String Message = "";
                List listMessage = new ArrayList();
              
                try {
                 // �g�����U�N�V�����J�n
                 conn.beginTransWeb();
              
                 // DB�X�V���t���OON
                 bDBUpdate = true;
                 
                 // �e��ʂ̃I�[�_�f�}���h�ԍ���ݒ�
                 struct.setOD_NO(copy_struct.getOD_NO());
              
                 // �f�}���h�̔[����ݒ�
                 struct.setw_subDUE_DATE(copy_struct.getw_subDUE_DATE());
              
                 // �e��ʂ̍X�V����ݒ�
                 struct.setMODIFY_COUNT(copy_struct.getMODIFY_COUNT());
              
                 // �X�V�`�F�b�N�̊m�F[�f�}���h]
                 List demando_list = entity.mT_OD_DEMANDO4Update.read(conn, struct);
                 
                 // �X�V�`�F�b�N�̊m�F[�I�[�_]
                 List order_list = entity.mT_OD_ORDER4Update.read(conn, struct);
                 
                 if(demando_list.size() <= 0){
                  Message = "T_OD.OD_NO[DEMANDO]:" + struct.getOD_NO();
                  setErrorMessage("ZZ06001", Message);
                  
                 } else if(order_list.size() <= 0){
                  Message = "T_OD.OD_NO[ORDER]:" + struct.getsubOD_NO();
                  setErrorMessage("ZZ06001", Message);
                  
                 } else{
                  String modify = ((AC0090010Struct)demando_list.get(0)).getMODIFY_COUNT();
                  String sub_modify = ((AC0090010Struct)order_list.get(0)).getsubMODIFY_COUNT();
              
                  if (struct.getMODIFY_COUNT().equals(modify) == false)
                  {
                   Message = "T_OD.OD_NO[DEMANDO]:" + struct.getOD_NO();
                   setErrorMessage("ZZ01105", Message);
                  }
              
                  if (struct.getsubMODIFY_COUNT().equals(sub_modify) == false)
                  {
                   Message = "T_OD.OD_NO[ORDER]:" + struct.getsubOD_NO();
                   setErrorMessage("ZZ01105", Message);
                  }
                 }
              
                 // �G���[���������Ă��Ȃ��ꍇ�A�X�V�������{
                 if(msgStruct.sizeError() <= 0)
                 {
                  // �e��ʂ̕i�ڔԍ���ݒ肷��
                  struct.setw_subITEM_CD(copy_struct.getw_subITEM_CD());
              
                  // �\���i�ڂ���f�[�^���擾����
                  List read_list = new ArrayList(0);
                  read_list = entity.mT_OD_DEMANDO_SUB.read(conn, struct);
              
                  // �������ʂ��O���̏ꍇ
                  if(read_list.size() < 1) {
                    listMessage.add("M_PS.PARENT_ITEM_CD:" + struct.getsubITEM_CD());
                    listMessage.add("M_PS.COMP_ITEM_CD:" + struct.getw_subITEM_CD());
                    listMessage.add("M_PS.EFF_PHASE_IN_DATE:" + struct.getw_subDUE_DATE());
                    setErrorMessage("AC10033", listMessage);
                  } else {
                   // 
                   AC0090010Struct ps_struct = new AC0090010Struct();
                   ps_struct = (AC0090010Struct)read_list.get(0);
              
                   // �X�V�f�[�^�̐ݒ�
                   setUpdateData(ps_struct);
                   
                   // �Y���f�}���h�̏��v�ʃe�[�u�����X�V
                   entity.mT_OD_DEMANDO_SUB.update(conn, struct);
                   
                   // ��ʃI�[�_�̏��v�ʃe�[�u�����X�V
                   entity.mT_OD_ORDER.update(conn, struct);
                   
                   // �R�~�b�g
                   conn.commit();
              
                   // DB�X�V���t���OOFF
                   bDBUpdate = false;
                   
                   // �X�V���������t���O�ݒ�
                   bSuccess = true;
                   
                   // �q��ʂɑJ�ڂ���O�̐e��ʂ�struct�𕜋A
                   loadParentStruct();
                   
                   // ����
                   controlselect();
                  }
                 }
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                } finally {
                 // DB�X�V�������ɉ��炩�̃G���[�����������ꍇ��roolback�������Ȃ�
                 if(bDBUpdate == true)
                 {
                  // ���[���o�b�N
                  conn.rollback();
              
                  // DB�X�V���t���OOFF
                  bDBUpdate = false;
                 }
                 
                 // �X�V�����Ŏ��s�����ꍇ
                 if(bSuccess != true)
                 {
                  // �������O�̏�Ԃɖ߂�����
                  struct.copy(copy_struct);
                 }
              
                }
                //}}user_implement_dev:<controlupdate_sub1>
		logger.exiting("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlupdate_sub1");

		return;
	}

	/**
	 * �ڍ׃{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlDetail() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
		logger.entering("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlDetail");
			//{{user_implement_dev:<controlDetail>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlDetail>
		logger.exiting("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlDetail");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
		logger.entering("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                 
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
		logger.entering("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                      //------------------------------------------------------------------
              
                      try {
              
                 // �R���{�{�b�N�X�f�[�^�p��
                 ComboBox controller = new ComboBox(conn, sysUSER_CD);
              
                 //�i�ڎ�z�敪
                 _MRP_ODR_TYP  = controller.getData("MRP_ODR_TYP");
                 //���O�쐬�敪
                 _OUTSIDE_TYP = controller.getData("OUTSIDE_TYP");
                    // �݌ɐ��ʒP�ʋ敪
                    _UNIT_QTY_TYP = controller.getData("UNIT_QTY_TYP");
                    //���b�g�܂Ƃߋ敪
                    _LOT_SIZING_TYP = controller.getData("LOT_SIZING_TYP");
                       
                          // �N���A����
                          controlclear();
              
                }catch(SQLException e) {
                 setSqlExceptionMsg(e);
                }catch(ComboException e){
                 // �G���[���b�Z�[�W�쐬
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(e, emsg);
                 
                 throw ee;
                }
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
		logger.entering("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
                 // �_�E�����[�h�t�@�C�����N���A
                 // PDF�ECSV�̃_�E�����[�h���s���Ƃ��́A��ʏ��OrHidden�ŁuDOWNLOAD_FILE�v���`���A���̍s�̃R�����g���O���Ă��������B
              //			struct.setDOWNLOAD_FILE((String)null);
                 // �R���{�{�b�N�X���i�̃f�[�^�̃Z�b�g�͂����ɋL�q���Ă��������B
                 // �R���{�{�b�N�X�f�[�^�p��
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("modify") ) {
				controlmodify();
			} else if( button.equals("update") ) {
				controlupdate();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("select_sub1") ) {
				controlselect_sub1();
			} else if( button.equals("return_sub1") ) {
				controlreturn_sub1();
			} else if( button.equals("update_sub1") ) {
				controlupdate_sub1();
			} else if( button.equals("Detail") ) {
				controlDetail();
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
//			throw new FoundationException("AC0090010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0090010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AC0090010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0090010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AC0090010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                 
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0090010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AC0090010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AC0090010Entity entity;
	protected AC0090010Struct struct;
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

		entity = new AC0090010Entity();
		struct = new AC0090010Struct();

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
	 * AC0090010�N���X�̕W���R���X�g���N�^
	 */
	public AC0090010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
                //---------------------------------------------------------------------
                list = new ArrayList(0);
                //---------------------------------------------------------------------
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
				AC0090010Struct key = (AC0090010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("w_DATE_FROM") && key.getw_DATE_FROM() != null) {
					msgKey.setKeyValue("w_DATE_FROM", key.getw_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("w_DATE_TO") && key.getw_DATE_TO() != null) {
					msgKey.setKeyValue("w_DATE_TO", key.getw_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("w_subDM_QTY") && key.getw_subDM_QTY() != null) {
					msgKey.setKeyValue("w_subDM_QTY", key.getw_subDM_QTY());
				}
				if(msgKeyType.containsKeyColumn("w_subITEM_NAME") && key.getw_subITEM_NAME() != null) {
					msgKey.setKeyValue("w_subITEM_NAME", key.getw_subITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_subEXTERNAL_PLAN_CD") && key.getw_subEXTERNAL_PLAN_CD() != null) {
					msgKey.setKeyValue("w_subEXTERNAL_PLAN_CD", key.getw_subEXTERNAL_PLAN_CD());
				}
				if(msgKeyType.containsKeyColumn("w_subPLANT_CD") && key.getw_subPLANT_CD() != null) {
					msgKey.setKeyValue("w_subPLANT_CD", key.getw_subPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("w_subPLANT_NAME") && key.getw_subPLANT_NAME() != null) {
					msgKey.setKeyValue("w_subPLANT_NAME", key.getw_subPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_subDATE_FROM") && key.getw_subDATE_FROM() != null) {
					msgKey.setKeyValue("w_subDATE_FROM", key.getw_subDATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("w_subDATE_TO") && key.getw_subDATE_TO() != null) {
					msgKey.setKeyValue("w_subDATE_TO", key.getw_subDATE_TO());
				}
				if(msgKeyType.containsKeyColumn("subSU_DM_QTY") && key.getsubSU_DM_QTY() != null) {
					msgKey.setKeyValue("subSU_DM_QTY", key.getsubSU_DM_QTY());
				}
				if(msgKeyType.containsKeyColumn("subRE_ODR_QTY") && key.getsubRE_ODR_QTY() != null) {
					msgKey.setKeyValue("subRE_ODR_QTY", key.getsubRE_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("CP_UNIT") && key.getCP_UNIT() != null) {
					msgKey.setKeyValue("CP_UNIT", key.getCP_UNIT());
				}
				if(msgKeyType.containsKeyColumn("w_TIME_FROM") && key.getw_TIME_FROM() != null) {
					msgKey.setKeyValue("w_TIME_FROM", key.getw_TIME_FROM());
				}
				if(msgKeyType.containsKeyColumn("w_TIME_TO") && key.getw_TIME_TO() != null) {
					msgKey.setKeyValue("w_TIME_TO", key.getw_TIME_TO());
				}
				if(msgKeyType.containsKeyColumn("w_subTIME_FROM") && key.getw_subTIME_FROM() != null) {
					msgKey.setKeyValue("w_subTIME_FROM", key.getw_subTIME_FROM());
				}
				if(msgKeyType.containsKeyColumn("w_subTIME_TO") && key.getw_subTIME_TO() != null) {
					msgKey.setKeyValue("w_subTIME_TO", key.getw_subTIME_TO());
				}
				if(msgKeyType.containsKeyColumn("w_subDUE_TIME") && key.getw_subDUE_TIME() != null) {
					msgKey.setKeyValue("w_subDUE_TIME", key.getw_subDUE_TIME());
				}
				if(msgKeyType.containsKeyColumn("s_MIN_CAL_DATE") && key.gets_MIN_CAL_DATE() != null) {
					msgKey.setKeyValue("s_MIN_CAL_DATE", key.gets_MIN_CAL_DATE());
				}
				if(msgKeyType.containsKeyColumn("s_MAX_CAL_DATE") && key.gets_MAX_CAL_DATE() != null) {
					msgKey.setKeyValue("s_MAX_CAL_DATE", key.gets_MAX_CAL_DATE());
				}
				if(msgKeyType.containsKeyColumn("s_BUSINESS_DATE") && key.gets_BUSINESS_DATE() != null) {
					msgKey.setKeyValue("s_BUSINESS_DATE", key.gets_BUSINESS_DATE());
				}
				if(msgKeyType.containsKeyColumn("s_PLANT_NAME") && key.gets_PLANT_NAME() != null) {
					msgKey.setKeyValue("s_PLANT_NAME", key.gets_PLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_CD") && key.getw_PLANT_CD() != null) {
					msgKey.setKeyValue("w_PLANT_CD", key.getw_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_NAME") && key.getw_PLANT_NAME() != null) {
					msgKey.setKeyValue("w_PLANT_NAME", key.getw_PLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_CD") && key.getw_ITEM_CD() != null) {
					msgKey.setKeyValue("w_ITEM_CD", key.getw_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_NAME") && key.getw_ITEM_NAME() != null) {
					msgKey.setKeyValue("w_ITEM_NAME", key.getw_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_DRAW_CD") && key.getw_DRAW_CD() != null) {
					msgKey.setKeyValue("w_DRAW_CD", key.getw_DRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("w_SPEC") && key.getw_SPEC() != null) {
					msgKey.setKeyValue("w_SPEC", key.getw_SPEC());
				}
				if(msgKeyType.containsKeyColumn("w_MRP_ODR_TYP") && key.getw_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("w_MRP_ODR_TYP", key.getw_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_OUTSIDE_TYP") && key.getw_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("w_OUTSIDE_TYP", key.getw_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_SPOIL") && key.getw_ITEM_SPOIL() != null) {
					msgKey.setKeyValue("w_ITEM_SPOIL", key.getw_ITEM_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("w_UNIT_QTY_TYP") && key.getw_UNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("w_UNIT_QTY_TYP", key.getw_UNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_LOT_SIZING_TYP") && key.getw_LOT_SIZING_TYP() != null) {
					msgKey.setKeyValue("w_LOT_SIZING_TYP", key.getw_LOT_SIZING_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_MAX_PERIOD") && key.getw_MAX_PERIOD() != null) {
					msgKey.setKeyValue("w_MAX_PERIOD", key.getw_MAX_PERIOD());
				}
				if(msgKeyType.containsKeyColumn("w_MUL_ODR_QTY") && key.getw_MUL_ODR_QTY() != null) {
					msgKey.setKeyValue("w_MUL_ODR_QTY", key.getw_MUL_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("w_SAFETY_STOCK") && key.getw_SAFETY_STOCK() != null) {
					msgKey.setKeyValue("w_SAFETY_STOCK", key.getw_SAFETY_STOCK());
				}
				if(msgKeyType.containsKeyColumn("w_MAX_ODR_QTY") && key.getw_MAX_ODR_QTY() != null) {
					msgKey.setKeyValue("w_MAX_ODR_QTY", key.getw_MAX_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("w_MIN_ODR_QTY") && key.getw_MIN_ODR_QTY() != null) {
					msgKey.setKeyValue("w_MIN_ODR_QTY", key.getw_MIN_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("EXTERNAL_PLAN_CD") && key.getEXTERNAL_PLAN_CD() != null) {
					msgKey.setKeyValue("EXTERNAL_PLAN_CD", key.getEXTERNAL_PLAN_CD());
				}
				if(msgKeyType.containsKeyColumn("DUE_DATE") && key.getDUE_DATE() != null) {
					msgKey.setKeyValue("DUE_DATE", key.getDUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("DM_QTY") && key.getDM_QTY() != null) {
					msgKey.setKeyValue("DM_QTY", key.getDM_QTY());
				}
				if(msgKeyType.containsKeyColumn("ODR_START_DATE") && key.getODR_START_DATE() != null) {
					msgKey.setKeyValue("ODR_START_DATE", key.getODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("w_DATE_FROM_ALL") && key.getw_DATE_FROM_ALL() != null) {
					msgKey.setKeyValue("w_DATE_FROM_ALL", key.getw_DATE_FROM_ALL());
				}
				if(msgKeyType.containsKeyColumn("w_DATE_TO_ALL") && key.getw_DATE_TO_ALL() != null) {
					msgKey.setKeyValue("w_DATE_TO_ALL", key.getw_DATE_TO_ALL());
				}
				if(msgKeyType.containsKeyColumn("subJOB_ODR_CD") && key.getsubJOB_ODR_CD() != null) {
					msgKey.setKeyValue("subJOB_ODR_CD", key.getsubJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("subITEM_CD") && key.getsubITEM_CD() != null) {
					msgKey.setKeyValue("subITEM_CD", key.getsubITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("subITEM_NAME") && key.getsubITEM_NAME() != null) {
					msgKey.setKeyValue("subITEM_NAME", key.getsubITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("subODR_START_DATE") && key.getsubODR_START_DATE() != null) {
					msgKey.setKeyValue("subODR_START_DATE", key.getsubODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("subPRD_START_DATE") && key.getsubPRD_START_DATE() != null) {
					msgKey.setKeyValue("subPRD_START_DATE", key.getsubPRD_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("subPRD_DUE_DATE") && key.getsubPRD_DUE_DATE() != null) {
					msgKey.setKeyValue("subPRD_DUE_DATE", key.getsubPRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("subODR_QTY") && key.getsubODR_QTY() != null) {
					msgKey.setKeyValue("subODR_QTY", key.getsubODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("subPS_UNIT_DENOMINATOR") && key.getsubPS_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("subPS_UNIT_DENOMINATOR", key.getsubPS_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("subPS_UNIT_NUMERATOR") && key.getsubPS_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("subPS_UNIT_NUMERATOR", key.getsubPS_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("subOD_NO") && key.getsubOD_NO() != null) {
					msgKey.setKeyValue("subOD_NO", key.getsubOD_NO());
				}
				if(msgKeyType.containsKeyColumn("subMODIFY_COUNT") && key.getsubMODIFY_COUNT() != null) {
					msgKey.setKeyValue("subMODIFY_COUNT", key.getsubMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("w_subITEM_CD") && key.getw_subITEM_CD() != null) {
					msgKey.setKeyValue("w_subITEM_CD", key.getw_subITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("w_subDATE_FROM_ALL") && key.getw_subDATE_FROM_ALL() != null) {
					msgKey.setKeyValue("w_subDATE_FROM_ALL", key.getw_subDATE_FROM_ALL());
				}
				if(msgKeyType.containsKeyColumn("w_subDATE_TO_ALL") && key.getw_subDATE_TO_ALL() != null) {
					msgKey.setKeyValue("w_subDATE_TO_ALL", key.getw_subDATE_TO_ALL());
				}
				if(msgKeyType.containsKeyColumn("w_subDUE_DATE") && key.getw_subDUE_DATE() != null) {
					msgKey.setKeyValue("w_subDUE_DATE", key.getw_subDUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("subDM_QTY") && key.getsubDM_QTY() != null) {
					msgKey.setKeyValue("subDM_QTY", key.getsubDM_QTY());
				}
				if(msgKeyType.containsKeyColumn("PS_EDITION") && key.getPS_EDITION() != null) {
					msgKey.setKeyValue("PS_EDITION", key.getPS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("PS_LT_FLG") && key.getPS_LT_FLG() != null) {
					msgKey.setKeyValue("PS_LT_FLG", key.getPS_LT_FLG());
				}
				if(msgKeyType.containsKeyColumn("PS_FIXED_LT") && key.getPS_FIXED_LT() != null) {
					msgKey.setKeyValue("PS_FIXED_LT", key.getPS_FIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("PS_PROP_LT") && key.getPS_PROP_LT() != null) {
					msgKey.setKeyValue("PS_PROP_LT", key.getPS_PROP_LT());
				}
				if(msgKeyType.containsKeyColumn("PS_PROP_LOT_SIZE") && key.getPS_PROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("PS_PROP_LOT_SIZE", key.getPS_PROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("PS_UNIT_DENOMINATOR") && key.getPS_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("PS_UNIT_DENOMINATOR", key.getPS_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("PS_UNIT_NUMERATOR") && key.getPS_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("PS_UNIT_NUMERATOR", key.getPS_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("PS_SPOIL") && key.getPS_SPOIL() != null) {
					msgKey.setKeyValue("PS_SPOIL", key.getPS_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("CONS_TYP") && key.getCONS_TYP() != null) {
					msgKey.setKeyValue("CONS_TYP", key.getCONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE") && key.getEFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("EFF_PHASE_IN_DATE", key.getEFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("EFF_PHASE_OUT_DATE") && key.getEFF_PHASE_OUT_DATE() != null) {
					msgKey.setKeyValue("EFF_PHASE_OUT_DATE", key.getEFF_PHASE_OUT_DATE());
				}
				if(msgKeyType.containsKeyColumn("PS_UNIT_QTY") && key.getPS_UNIT_QTY() != null) {
					msgKey.setKeyValue("PS_UNIT_QTY", key.getPS_UNIT_QTY());
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
					AC0090010Struct key = new AC0090010Struct();
					if(msgKeyType.containsKeyColumn("w_DATE_FROM")) {
						key.setw_DATE_FROM(msgKey.getKeyValue("w_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("w_DATE_TO")) {
						key.setw_DATE_TO(msgKey.getKeyValue("w_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("w_subDM_QTY")) {
						key.setw_subDM_QTY(msgKey.getKeyValue("w_subDM_QTY"));
					}
					if(msgKeyType.containsKeyColumn("w_subITEM_NAME")) {
						key.setw_subITEM_NAME(msgKey.getKeyValue("w_subITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_subEXTERNAL_PLAN_CD")) {
						key.setw_subEXTERNAL_PLAN_CD(msgKey.getKeyValue("w_subEXTERNAL_PLAN_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_subPLANT_CD")) {
						key.setw_subPLANT_CD(msgKey.getKeyValue("w_subPLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_subPLANT_NAME")) {
						key.setw_subPLANT_NAME(msgKey.getKeyValue("w_subPLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_subDATE_FROM")) {
						key.setw_subDATE_FROM(msgKey.getKeyValue("w_subDATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("w_subDATE_TO")) {
						key.setw_subDATE_TO(msgKey.getKeyValue("w_subDATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("subSU_DM_QTY")) {
						key.setsubSU_DM_QTY(msgKey.getKeyValue("subSU_DM_QTY"));
					}
					if(msgKeyType.containsKeyColumn("subRE_ODR_QTY")) {
						key.setsubRE_ODR_QTY(msgKey.getKeyValue("subRE_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("CP_UNIT")) {
						key.setCP_UNIT(msgKey.getKeyValue("CP_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("w_TIME_FROM")) {
						key.setw_TIME_FROM(msgKey.getKeyValue("w_TIME_FROM"));
					}
					if(msgKeyType.containsKeyColumn("w_TIME_TO")) {
						key.setw_TIME_TO(msgKey.getKeyValue("w_TIME_TO"));
					}
					if(msgKeyType.containsKeyColumn("w_subTIME_FROM")) {
						key.setw_subTIME_FROM(msgKey.getKeyValue("w_subTIME_FROM"));
					}
					if(msgKeyType.containsKeyColumn("w_subTIME_TO")) {
						key.setw_subTIME_TO(msgKey.getKeyValue("w_subTIME_TO"));
					}
					if(msgKeyType.containsKeyColumn("w_subDUE_TIME")) {
						key.setw_subDUE_TIME(msgKey.getKeyValue("w_subDUE_TIME"));
					}
					if(msgKeyType.containsKeyColumn("s_MIN_CAL_DATE")) {
						key.sets_MIN_CAL_DATE(msgKey.getKeyValue("s_MIN_CAL_DATE"));
					}
					if(msgKeyType.containsKeyColumn("s_MAX_CAL_DATE")) {
						key.sets_MAX_CAL_DATE(msgKey.getKeyValue("s_MAX_CAL_DATE"));
					}
					if(msgKeyType.containsKeyColumn("s_BUSINESS_DATE")) {
						key.sets_BUSINESS_DATE(msgKey.getKeyValue("s_BUSINESS_DATE"));
					}
					if(msgKeyType.containsKeyColumn("s_PLANT_NAME")) {
						key.sets_PLANT_NAME(msgKey.getKeyValue("s_PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_CD")) {
						key.setw_PLANT_CD(msgKey.getKeyValue("w_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_NAME")) {
						key.setw_PLANT_NAME(msgKey.getKeyValue("w_PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_CD")) {
						key.setw_ITEM_CD(msgKey.getKeyValue("w_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_NAME")) {
						key.setw_ITEM_NAME(msgKey.getKeyValue("w_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_DRAW_CD")) {
						key.setw_DRAW_CD(msgKey.getKeyValue("w_DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_SPEC")) {
						key.setw_SPEC(msgKey.getKeyValue("w_SPEC"));
					}
					if(msgKeyType.containsKeyColumn("w_MRP_ODR_TYP")) {
						key.setw_MRP_ODR_TYP(msgKey.getKeyValue("w_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_OUTSIDE_TYP")) {
						key.setw_OUTSIDE_TYP(msgKey.getKeyValue("w_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_SPOIL")) {
						key.setw_ITEM_SPOIL(msgKey.getKeyValue("w_ITEM_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("w_UNIT_QTY_TYP")) {
						key.setw_UNIT_QTY_TYP(msgKey.getKeyValue("w_UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_LOT_SIZING_TYP")) {
						key.setw_LOT_SIZING_TYP(msgKey.getKeyValue("w_LOT_SIZING_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_MAX_PERIOD")) {
						key.setw_MAX_PERIOD(msgKey.getKeyValue("w_MAX_PERIOD"));
					}
					if(msgKeyType.containsKeyColumn("w_MUL_ODR_QTY")) {
						key.setw_MUL_ODR_QTY(msgKey.getKeyValue("w_MUL_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("w_SAFETY_STOCK")) {
						key.setw_SAFETY_STOCK(msgKey.getKeyValue("w_SAFETY_STOCK"));
					}
					if(msgKeyType.containsKeyColumn("w_MAX_ODR_QTY")) {
						key.setw_MAX_ODR_QTY(msgKey.getKeyValue("w_MAX_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("w_MIN_ODR_QTY")) {
						key.setw_MIN_ODR_QTY(msgKey.getKeyValue("w_MIN_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("EXTERNAL_PLAN_CD")) {
						key.setEXTERNAL_PLAN_CD(msgKey.getKeyValue("EXTERNAL_PLAN_CD"));
					}
					if(msgKeyType.containsKeyColumn("DUE_DATE")) {
						key.setDUE_DATE(msgKey.getKeyValue("DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("DM_QTY")) {
						key.setDM_QTY(msgKey.getKeyValue("DM_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ODR_START_DATE")) {
						key.setODR_START_DATE(msgKey.getKeyValue("ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("w_DATE_FROM_ALL")) {
						key.setw_DATE_FROM_ALL(msgKey.getKeyValue("w_DATE_FROM_ALL"));
					}
					if(msgKeyType.containsKeyColumn("w_DATE_TO_ALL")) {
						key.setw_DATE_TO_ALL(msgKey.getKeyValue("w_DATE_TO_ALL"));
					}
					if(msgKeyType.containsKeyColumn("subJOB_ODR_CD")) {
						key.setsubJOB_ODR_CD(msgKey.getKeyValue("subJOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("subITEM_CD")) {
						key.setsubITEM_CD(msgKey.getKeyValue("subITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("subITEM_NAME")) {
						key.setsubITEM_NAME(msgKey.getKeyValue("subITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("subODR_START_DATE")) {
						key.setsubODR_START_DATE(msgKey.getKeyValue("subODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("subPRD_START_DATE")) {
						key.setsubPRD_START_DATE(msgKey.getKeyValue("subPRD_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("subPRD_DUE_DATE")) {
						key.setsubPRD_DUE_DATE(msgKey.getKeyValue("subPRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("subODR_QTY")) {
						key.setsubODR_QTY(msgKey.getKeyValue("subODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("subPS_UNIT_DENOMINATOR")) {
						key.setsubPS_UNIT_DENOMINATOR(msgKey.getKeyValue("subPS_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("subPS_UNIT_NUMERATOR")) {
						key.setsubPS_UNIT_NUMERATOR(msgKey.getKeyValue("subPS_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("subOD_NO")) {
						key.setsubOD_NO(msgKey.getKeyValue("subOD_NO"));
					}
					if(msgKeyType.containsKeyColumn("subMODIFY_COUNT")) {
						key.setsubMODIFY_COUNT(msgKey.getKeyValue("subMODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("w_subITEM_CD")) {
						key.setw_subITEM_CD(msgKey.getKeyValue("w_subITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_subDATE_FROM_ALL")) {
						key.setw_subDATE_FROM_ALL(msgKey.getKeyValue("w_subDATE_FROM_ALL"));
					}
					if(msgKeyType.containsKeyColumn("w_subDATE_TO_ALL")) {
						key.setw_subDATE_TO_ALL(msgKey.getKeyValue("w_subDATE_TO_ALL"));
					}
					if(msgKeyType.containsKeyColumn("w_subDUE_DATE")) {
						key.setw_subDUE_DATE(msgKey.getKeyValue("w_subDUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("subDM_QTY")) {
						key.setsubDM_QTY(msgKey.getKeyValue("subDM_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PS_EDITION")) {
						key.setPS_EDITION(msgKey.getKeyValue("PS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("PS_LT_FLG")) {
						key.setPS_LT_FLG(msgKey.getKeyValue("PS_LT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PS_FIXED_LT")) {
						key.setPS_FIXED_LT(msgKey.getKeyValue("PS_FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("PS_PROP_LT")) {
						key.setPS_PROP_LT(msgKey.getKeyValue("PS_PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("PS_PROP_LOT_SIZE")) {
						key.setPS_PROP_LOT_SIZE(msgKey.getKeyValue("PS_PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("PS_UNIT_DENOMINATOR")) {
						key.setPS_UNIT_DENOMINATOR(msgKey.getKeyValue("PS_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("PS_UNIT_NUMERATOR")) {
						key.setPS_UNIT_NUMERATOR(msgKey.getKeyValue("PS_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("PS_SPOIL")) {
						key.setPS_SPOIL(msgKey.getKeyValue("PS_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("CONS_TYP")) {
						key.setCONS_TYP(msgKey.getKeyValue("CONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE")) {
						key.setEFF_PHASE_IN_DATE(msgKey.getKeyValue("EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("EFF_PHASE_OUT_DATE")) {
						key.setEFF_PHASE_OUT_DATE(msgKey.getKeyValue("EFF_PHASE_OUT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PS_UNIT_QTY")) {
						key.setPS_UNIT_QTY(msgKey.getKeyValue("PS_UNIT_QTY"));
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
