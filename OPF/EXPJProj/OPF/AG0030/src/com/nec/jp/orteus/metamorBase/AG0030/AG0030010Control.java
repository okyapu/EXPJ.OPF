/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AG0030/src/com/nec/jp/orteus/metamorBase/AG0030/AG0030010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AG0030;

import com.nec.jp.orteus.metamorBase.AG0030.*;
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
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
import com.nec.jp.orteus.metamorBase.common01.Accessor.PrivateConfig;
import com.nec.jp.orteus.metamorBase.common01.util.DateConverter;
import com.nec.jp.orteus.metamorBase.common04.DateCtrl.DateCtrl;
import com.nec.jp.orteus.metamorBase.common01.util.DefaultPeriod;

import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.lang.Double;
import java.lang.Integer;
import java.util.Calendar;
import java.util.GregorianCalendar;
//------------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AG0030010Control
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
       
        public AG0030010Struct getStruct() { return this.struct; }	// Struct�̒l�i���f�B�G�[�^�j��Ԃ��܂��B
        
        /**
         * ��ʑJ�ڃL�[(�i�ڃR�[�h�A�H��R�[�h)
         */
        private String _itemCd;
        private String _plantCd;

        /**
         * ��ʑJ�ڃL�[(�i�ڃR�[�h�A�H��R�[�h)�ݒ�
         */
        protected void setItemCd(String cd){ _itemCd = cd; };
        protected void setPlantCd(String cd){ _plantCd = cd; };
        
        /**
         * ��ʑJ�ڃL�[(�i�ڃR�[�h�A�H��R�[�h)�擾
         */
        protected String getItemCd(){ return _itemCd; };
        protected String getPlantCd(){ return _plantCd; };
        
       //---------- ���b�Z�[�W�֘A�̏���-- --------------------------------------------
       
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
       
        /**
         * SQLException���b�Z�[�W�ݒ�
         * @param SQLException
         * @param �L�[����
         */
        private void setSqlExceptionMsg(SQLException e, String key) throws ExpjException
        {
         // �G���[���b�Z�[�W�쐬
         ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
         sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
         ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
         // emsg = new ExpjMessage( "ZZ01006", key );
         // sysLog.severe(emsg ,getsysUSER_CD()); //�G���[�ڍ�
         // ee.add(emsg);
       
         // emsg = new ExpjMessage( "ZZ01006", e.toString());
         // sysLog.severe(emsg ,getsysUSER_CD()); //�G�N�Z�v�V�����̏ڍ׏��
         throw ee;
        }
       
        /**
         * �G���[���b�Z�[�W�ݒ�
         * @param ���b�Z�[�W�ԍ�
         * @param �o�̓��b�Z�[�W
         */
        private void setErrorMessage(String code, String key)
        {
         ExpjMessage emsg = new ExpjMessage(code);
         msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
         sysLog.warning(emsg, getsysUSER_CD()); //�G���[���e
         emsg = new ExpjMessage( "ZZ01006", key );
         msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
         sysLog.warning(emsg, getsysUSER_CD()); //�G���[�ڍ�
        }
       
        //------------------------------------------------------------------
        // ���P�[��(�ꗗ�̐擪�s�Ɂu�ߋ��v��\�������邽��
        private String _locale = "";
        public void setLocale(String loc) { _locale = loc; }
       
       //---------- �R���{�{�b�N�X�f�[�^�擾�֘A�̏��� -------------------------------
       
        /** �i�ڎ�z�敪 */
        ComboStruct _MRP_ODR_TYP = null;
       
        /** �i�ڎ�z�敪�ݒ�
         * @param �R���{�{�b�N�X�f�[�^
        */
        public void setMRP_ODR_TYP(ComboStruct combo){ _MRP_ODR_TYP = combo; }
       
        /** �i�ڎ�z�敪�擾
         * @return �i�ڎ�z�敪�̃R���{�{�b�N�X�f�[�^
        */
        public ComboStruct getMRP_ODR_TYP(){ return _MRP_ODR_TYP; }
       
        
        /** �i�ړ��O��敪 */
        ComboStruct _OUTSIDE_TYP = null;
       
        /** �i�ړ��O��敪�ݒ�
         * @param �R���{�{�b�N�X�f�[�^
        */
        public void setOUTSIDE_TYP(ComboStruct combo){ _OUTSIDE_TYP = combo; }
       
        /** �i�ړ��O��敪�擾
         * @return �i�ړ��O��敪�̃R���{�{�b�N�X�f�[�^
        */
        public ComboStruct getOUTSIDE_TYP(){ return _OUTSIDE_TYP; }
       
       
        /** �݌ɐ��P�ʋ敪 */
        ComboStruct _UNIT_QTY_TYP = null;
       
        /** �݌ɐ��P�ʋ敪�ݒ�
         * @param �R���{�{�b�N�X�f�[�^
        */
        public void setUNIT_QTY_TYP(ComboStruct combo){ _UNIT_QTY_TYP = combo; }
       
        /** �݌ɐ��P�ʋ敪�擾
         * @return �݌ɐ��P�ʋ敪�̃R���{�{�b�N�X�f�[�^
        */
        public ComboStruct getUNIT_QTY_TYP(){ return _UNIT_QTY_TYP; }
       
       
        /** ���b�g�܂Ƃߋ敪 */
        ComboStruct _LOT_SIZING_TYP = null;
       
        /** ���b�g�܂Ƃߋ敪�ݒ�
         * @param �R���{�{�b�N�X�f�[�^
        */
        public void setLOT_SIZING_TYP(ComboStruct combo){ _LOT_SIZING_TYP = combo; }
       
        /** ���b�g�܂Ƃߋ敪�擾
         * @return ���b�g�܂Ƃߋ敪�̃R���{�{�b�N�X�f�[�^
        */
        public ComboStruct getLOT_SIZING_TYP(){ return _LOT_SIZING_TYP; }
       //-------------------------------------------------------------------------
        /**
         * �敪���擾
         * @param comboStruct �敪��񃊃X�g
         * @param intType �敪�R�[�h
         * @return �敪���́B�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�
         */
        private String getTypeName(ComboStruct comboStruct, Integer intType)
        {
         String strTyp = TypeConverter.sanitizer(intType);
         return getTypeName(comboStruct,strTyp);
        }
        /**
         * �敪���擾
         * @param comboStruct �敪��񃊃X�g
         * @param strTyp �敪�R�[�h
         * @return �敪���́B�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�
         */
        private String getTypeName(ComboStruct comboStruct, String strTyp)
        {
         String strTypName = strTyp;
         for(int i = 0; i < comboStruct.getValList().size(); i++){
          if(strTyp.equals((String)(comboStruct.getValList().get(i)))){
           strTypName = (String)(comboStruct.getExplanList().get(i));
           break;
          }
         }
         return strTypName;
        }
        /**
         * �i�ڏ��̃t���O�̕\����ݒ�
         * @param s �t���O�̒l���ݒ肳�ꂢ����
         */
        private void setTypeValueAboutItem(AG0030010Struct s)
        {
         s.setMRP_ODR_NAME(getTypeName(_MRP_ODR_TYP,s.getMRP_ODR_TYP()));
         s.setOUTSIDE_NAME(getTypeName(_OUTSIDE_TYP,s.getOUTSIDE_TYP()));
         s.setUNIT_QTY_NAME(getTypeName(_UNIT_QTY_TYP,s.getUNIT_QTY_TYP()));
         s.setLOT_SIZING_NAME(getTypeName(_LOT_SIZING_TYP,s.getLOT_SIZING_TYP()));
        }
       
       //------------------------------------------------------------------
       
        /*
         * �f�t�H���g�l�ݒ菈��
        */
        private void setDefaultData() throws SQLException, AlarmMessageException
        {
         try{
          // ���H��R�[�h�ݒ�
          struct.setw_PLANT_CD(getsysPLANT_CD());
       
          // �f�t�H���g���Y�v����Ԏ擾�ݒ�
          setDefaultPeriodDate();
         }
         catch (SQLException e)
         {
          throw e;
         }
        }
       
        /*
         * �f�t�H���g���Y�v����ԓ��t�擾�ݒ�
         *
         * @return	�Ȃ�
         */
        private void setDefaultPeriodDate() throws SQLException, AlarmMessageException
        {
         DateCtrl dctrl = new DateCtrl(conn);
         DateConverter dc = new DateConverter();
         String streBusinessOprDate = dctrl.getBusinessOprDate(getsysPLANT_CD());
         Date dateBusinessOprDate = dc.str2date(streBusinessOprDate);
       
         // �f�t�H���g���Y�v����ԓ��t�擾
         String strDefDate[] = {"", ""};
         boolean bResult = false;
         try
         {
          DefaultPeriod dp = new DefaultPeriod();
          bResult = dp.get(conn, dateBusinessOprDate, strDefDate);
          sysLog.finest_d(""
           +"* (From)[" + strDefDate[0] + "]"
           +"* (To)[" + strDefDate[1] + "]"
           ,struct.getsUser_ID());
         }
         catch(SQLException se)
         {
          bResult = false;
          throw se;
         }
       
         if(bResult == true)
         {
          // �擾����
          struct.setw_date_from(strDefDate[0]);
          struct.setw_date_to(strDefDate[1]);
         }
        }
       
       //------------------------------------------------------------------
       
        /**
         * �H��Ǎ�����
         *
         * @param	structTarget	�Ώۃf�[�^���
         * @return	����:�Ǎ���� / �G���[:null
         */
        private AG0030010Struct readPlant(AG0030010Struct structTarget) throws FoundationException, SQLException
        {
         List listRead = entity.mM_PLANT.read(conn, structTarget);
         if(listRead.size() <= 0)
         {
          // �H�ꂪ���݂��Ȃ�
          setErrorMessage("AB01001", "M_PLANT.PLANT_CD:" + structTarget.getw_PLANT_CD());
          return null;
         }
         // �Ǎ����擾
         AG0030010Struct structRead = new AG0030010Struct();
         structRead = (AG0030010Struct)listRead.get(0);
         return structRead;
        }
       
        /**
         * �i�ړǍ�����
         *
         * @param	structTarget	�Ώۃf�[�^���
         * @return	����:�Ǎ���� / �G���[:null
         */
        private AG0030010Struct readItem(AG0030010Struct structTarget) throws FoundationException, SQLException
        {
         List listRead = entity.mM_ITEM.read(conn, structTarget);
         if(listRead.size() <= 0)
         {
          // �i�ڂ����݂��Ȃ�
          setErrorMessage("AB01002", "M_ITEM.ITEM_CD:" + structTarget.getw_ITEM_CD());
          return null;
         }
         // �Ǎ����擾
         AG0030010Struct structRead = new AG0030010Struct();
         structRead = (AG0030010Struct)listRead.get(0);
         return structRead;
        }
       
        /**
         * �莝�݌ɐ��擾����
         *
         * @param	structTarget	�Ώۃf�[�^���
         * @return	�莝�݌ɐ�
         */
        private String getStockOnHandQtySum(AG0030010Struct structTarget) throws FoundationException, SQLException
        {
         String strStockOnHandQty = new String("0.0");
         List listRead = entity.mselect_stock.read(conn, structTarget);
         if(listRead.size() <= 0)
         {
          sysLog.finest_d("NO RECORD:T_ITEM_STOCK  PLANT_CD:" + structTarget.getw_PLANT_CD() + "  ITEM_CD:" + structTarget.getw_ITEM_CD(),struct.getsUser_ID());
          return strStockOnHandQty;
         }
         AG0030010Struct structRead = (AG0030010Struct)listRead.get(0);
         String readStock = structRead.getSTOCK_ON_HAND_QTY();
         if(readStock == null || "".equals(readStock)){
          sysLog.finest_d("NO RECORD:T_ITEM_STOCK  PLANT_CD:" + structTarget.getw_PLANT_CD() + "  ITEM_CD:" + structTarget.getw_ITEM_CD(),struct.getsUser_ID());
          return strStockOnHandQty;
         }
         return readStock;
        }
       
       //------------------------------------------------------------------
       
        /** �f�o�b�O�p���b�Z�[�W�쐬�p�ϐ� */
        private String _debugMsg = "";
       
       //------------------------------------------------------------------
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0030");
		logger.entering("AG0030010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
                //------------------------------------------------------------------
                boolean bSuccess = false;	// ���������t���O������
                AG0030010Struct structPlant = new AG0030010Struct();	// �ŐV�H����Ǎ��p
                AG0030010Struct structItem = new AG0030010Struct();		// �ŐV�i�ڏ��Ǎ��p
                String strStockOnHandQty = new String("0.0");
                // �������O��struct����ޔ�
                AG0030010Struct structCopy = new AG0030010Struct();
                structCopy.copy(struct);
              
                // �ꗗ�\�����e���N���A
                list.clear();
              
                boolean result = false;		// �`�F�b�N���ʊi�[�p
                List workList = null;
                AG0030010Struct workStruct;
                String strBusinessOprDate = null;
              
                try
                {
                 _debugMsg = ("controlselect() inputvalue" + 
                  " plant-code = " + struct.getw_PLANT_CD() + 
                  " item-code = " + struct.getw_ITEM_CD() + 
                  " FROM = " + struct.getw_date_from() + 
                  " TO = " + struct.getw_date_to());
                 sysLog.finest_d(_debugMsg, struct.getsUser_ID());
              
                 // �V���ȉ�ʏ��i�[�pstruct
                 AG0030010Struct save_struct = new AG0030010Struct();
                 save_struct.copy(struct);
              
                 boolean bValidPlantCD = false;
                 boolean bValidItemCD = false;
              
                // �����͂��ꂽ�H��R�[�h�����݂��邩�ǂ����̃`�F�b�N
                // �K�v�L�[�F�H��R�[�h
                 structPlant = readPlant(struct);
                 if(structPlant != null)
                 {
                  // �H�ꑶ��
                  bValidPlantCD = true;
                 }
              
                // �����͂��ꂽ�i�ڔԍ������݂��邩�ǂ����̃`�F�b�N
                // �K�v�L�[�F�i�ڔԍ�
                 // �i�ڃ`�F�b�N
                 structItem = readItem(struct);
                 if(structItem != null)
                 {
                  // �i�ڑ���
                  bValidItemCD = true;
                 }
              
                // 
                // �i�ڔԍ����L���̏ꍇ�݂̂Ƀ`�F�b�N���鍀��
                // 
                 if(bValidItemCD == true)
                 {
                  // ���i�ڎ�z�敪�̃`�F�b�N
                  result = entity.mcheckMRP_ODR_TYP.check(conn, struct);
                  if(result == false)
                  {
                   // �Ǎ��������s�F�i�ڎ�z�敪��4�A�܂��́A5�ȊO�ɐݒ肳��Ă��܂�
                   sysLog.finest_d("read error:MRP_ODR_TYP neither 4 nor 5", struct.getsUser_ID());
                   setErrorMessage("AB00010", "M_ITEM.ITEM_CD:" + struct.getw_ITEM_CD());
                  }
                  // MPS�t���O�`�F�b�N�͍s��Ȃ�(����Y�����v��(MRP)�ƈقȂ�)
                 }
              
                // 
                // �H��R�[�h���L���̏ꍇ�݂̂Ƀ`�F�b�N���鍀��
                // 
                 DateConverter dc = new DateConverter();
                 Date dateFrom = dc.str2date(struct.getw_date_from());
                 Date dateTo = dc.str2date(struct.getw_date_to());
                 Date dateBusinessOprDate = null;
                 boolean bValidBusinessOprDate = false;
                 int Checkfg =0 ,endfg =0;
                 if(bValidPlantCD == true)
                 {
                 //====================================
                 // �J�����_�֘A�`�F�b�N
                 //====================================
                  // �J�����_���Ǎ�
                  workList = entity.mselectPLAN_SPAN_FROM_CAL1.read(conn, struct);
                  Date minDateCal;
                  Date maxDateCal;
                  String minCalDate = null;
                  String maxCalDate = null;
                  if(workList.size() > 0)
                  {
                   // �J�����_���擾(�����L�[�F�i�ڃR�[�h�j
                   workStruct = (AG0030010Struct)workList.get(0);
                   minCalDate = workStruct.gets_MIN_CAL_DATE();
                   maxCalDate = workStruct.gets_MAX_CAL_DATE();
                   _debugMsg = ("controlselect() calendar info. MIN_CAL_DATE = " + minCalDate);
                   sysLog.finest_d(_debugMsg, struct.getsUser_ID());
                   _debugMsg = ("controlselect() calendar info. MAX_CAL_DATE = " + maxCalDate);
                   sysLog.finest_d(_debugMsg, struct.getsUser_ID());
                   if(minCalDate != null && maxCalDate != null)
                   {
                    Checkfg =1;
                    endfg =1;
                   }else{
                   	workList = entity.mselectPLAN_SPAN_FROM_CAL.read(conn, struct);
                   	if(workList.size() > 0)
                   	{
                   	 // �J�����_���擾(�����L�[�F�H��R�[�h�j
                     workStruct = (AG0030010Struct)workList.get(0);
                     minCalDate = workStruct.gets_MIN_CAL_DATE();
                     maxCalDate = workStruct.gets_MAX_CAL_DATE();
                     if(minCalDate != null && maxCalDate != null)
                   	 	{
                   	 		endfg =1;
                   	 	}else{
                   	 		setErrorMessage("AB00011", "M_PLANT.PLANT_CD:" + struct.getw_PLANT_CD());
                   	 	}
                   	 }else{
                   	 	// �Ǎ��������s�F�J�����_��񃌃R�[�h�Ȃ��i�����L�[�F�H��R�[�h�j
                   		sysLog.finest_d("read error:no record for calendar info.(query-key:plat-code)", struct.getsUser_ID());
                   		setErrorMessage("AB00011", "M_PLANT.PLANT_CD:" + struct.getw_PLANT_CD());
                   	 }
                   	}
                   }else{
                  		// �Ǎ��������s�F�J�����_��񃌃R�[�h�Ȃ��i�����L�[�F�i�ڃR�[�h�j
                        sysLog.finest_d("read error:no record for calendar info.(query-key:plat-code)", struct.getsUser_ID());
                        setErrorMessage("AB00011", "M_ITEM.ITEM_CD:" + struct.getw_PLANT_CD());
                  	}
                   	if(endfg ==1){
                   		_debugMsg = ("controlselect() calendar info. MIN_CAL_DATE = " + minCalDate);
                 	    sysLog.finest_d(_debugMsg, struct.getsUser_ID());
                  	    _debugMsg = ("controlselect() calendar info. MAX_CAL_DATE = " + maxCalDate);
                 	    sysLog.finest_d(_debugMsg, struct.getsUser_ID());
                  	    minDateCal = dc.str2date(minCalDate);
                        maxDateCal = dc.str2date(maxCalDate);
                        //  ���Y�v����Ԃ��J�����_�ԍ��Œ�`�����J�����_�͈͓̔����ǂ����̃`�F�b�N
                        if( (dateFrom.getTime() < minDateCal.getTime()) || (dateTo.getTime() > maxDateCal.getTime()) )
                         {
                           // �Ǎ��������s�F�J�����_�͈͓̔��ł͂���܂���
                           sysLog.finest_d("read error:out of range of calendar", struct.getsUser_ID());
                         	if(Checkfg == 1){
                         		setErrorMessage("AB00011", "M_ITEM.ITEM_CD:" + struct.getw_ITEM_CD());
                         	}else{
                         		setErrorMessage("AB00011", "M_PLANT.PLANT_CD:" + struct.getw_PLANT_CD());
                         	}
                          }
                    	}else{
                    		// �Ǎ��������s�F�J�����_��񃌃R�[�h�Ȃ��i�����L�[�F�i�ڃR�[�h�A�H��R�[�h�j
                    		sysLog.finest_d("read error:no record for calendar info.(query-key:plat-code)", struct.getsUser_ID());
                    		setErrorMessage("AB00011", "M_PLANT.PLANT_CD:" + struct.getw_PLANT_CD());
                    	}
              
                 //====================================
                 //  �Ɩ��^�p���֘A�`�F�b�N
                 //====================================
                  workList = entity.mselectBUSINESS_OPR_DATE.read(conn, struct);
                  if(workList.size() > 0)
                  {
                   workStruct = (AG0030010Struct)workList.get(0);
                   strBusinessOprDate = workStruct.gets_BUSINESS_OPR_DATE();
                   _debugMsg = ("controlselect() date of bussiness operation = " + strBusinessOprDate);
                   sysLog.finest_d(_debugMsg, struct.getsUser_ID());
                   // �擾�����Ɩ��^�p���̃`�F�b�N
                   if(strBusinessOprDate != null)
                   {
                    dateBusinessOprDate = dc.str2date(strBusinessOprDate);
                    bValidBusinessOprDate = true;
                    if(dateFrom.getTime() < dateBusinessOprDate.getTime())
                    {
                     // �Ǎ��������s�F���͂��ꂽ���Y�v�����(FROM)���Ɩ��^�p�����ߋ��ɐݒ肳��Ă��܂�
                     sysLog.finest_d("read error:production schedule period(FROM) is older than date of bussiness operation", struct.getsUser_ID());
                     // �G���[���b�Z�[�W�o��
                     setErrorMessage("AB00012", "SYS_DATE_CTRL.PLANT_CD:" + struct.getw_PLANT_CD());
                    }
                   }
                   else
                   {
                    // �Ǎ��������s�F�擾�����Ɩ��^�p����null
                    sysLog.finest_d("read error:date of bussiness operation is null", struct.getsUser_ID());
                    // �G���[���b�Z�[�W�o��
                    setErrorMessage("AB00026", "SYS_DATE_CTRL.PLANT_CD:" + struct.getw_PLANT_CD());
                   }
              
                  }
                  else
                  {
                   // �Ǎ��������s�F�Ɩ��^�p�����R�[�h�Ȃ��i�����L�[�F�H��R�[�h�j
                   sysLog.finest_d("read error:no record for date of bussiness operation(query-key:plant-code)", struct.getsUser_ID());
                   // �G���[���b�Z�[�W�o��
                   setErrorMessage("AB00026", "SYS_DATE_CTRL.PLANT_CD:" + struct.getw_PLANT_CD());
                  }
                 }
              
                 //====================================
                 //  �ő�v����ԁi���j�`�F�b�N
                 //====================================
                 // �V�X�e���p�����[�^�̍ő�\�����ԁi���j���擾
                 List maxMonthList = entity.mselectMAX_DISPLAY_MONTH_STOCK.read(conn, struct);
                 String MAX_DISPLAY_MONTH_STOCK = null;
                 if(maxMonthList.size() > 0){
                    AG0030010Struct maxMonthStruct = (AG0030010Struct)maxMonthList.get(0);
                    if(null == maxMonthStruct.gets_MAX_DISPLAY_MONTH_STOCK()){
                      MAX_DISPLAY_MONTH_STOCK = "0";
                    }else{
                      MAX_DISPLAY_MONTH_STOCK = maxMonthStruct.gets_MAX_DISPLAY_MONTH_STOCK();
                    }
                 }
                 if(!"0".equals(MAX_DISPLAY_MONTH_STOCK)){
                   Calendar calFrom = Calendar.getInstance();
                   Calendar calTo = Calendar.getInstance();
                   calFrom.setTime(dateFrom);
                   calTo.setTime(dateTo);
                   calFrom.add(Calendar.MONTH, Integer.parseInt(MAX_DISPLAY_MONTH_STOCK));
                   long lForm = calFrom.getTimeInMillis();
                   long lTo = calTo.getTimeInMillis();
                   // �ő�\�����Ԃ𒴂���Ƃ�
                   if(lForm <= lTo){
                     // �G���[���b�Z�[�W�o��
                     ExpjMessage emsg = new ExpjMessage( "AG00013", MAX_DISPLAY_MONTH_STOCK );
                     msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
                     sysLog.warning(emsg, getsysUSER_CD()); //�G���[���e
                  }
                }
                
                 // �G���[���Ȃ��ꍇ
                 if(msgStruct.sizeError() <= 0)
                 {
                 //====================================
                 // ���C�����ݒ菈��
                 //====================================
              
                  //====================================
                  // �莝�݌ɐ��Ǎ��i�Z�o�ς݁j
                  //====================================
                  strStockOnHandQty = getStockOnHandQtySum(struct);
                  save_struct.setSTOCK_ON_HAND_QTY(strStockOnHandQty);
                  _debugMsg = ("controlselect() STOCK_ON_HAND =" + save_struct.getSTOCK_ON_HAND_QTY());
                  sysLog.finest_d(_debugMsg, struct.getsUser_ID());
              
                  //====================================
                  // �Ɩ��^�p���ݒ�
                  //====================================
                  save_struct.sets_BUSINESS_OPR_DATE(strBusinessOprDate);
              
                  //====================================
                  // ���C�����Ǎ�
                  //====================================
                  workList = entity.mselect.read(conn, struct);
                  if(workList.size() > 0)
                  {
                   // �Ǎ����擾
                   workStruct = (AG0030010Struct)workList.get(0);
              
                   // �Ǎ����ݒ�
                   save_struct.setPLANT_NAME(workStruct.getPLANT_NAME());
                   save_struct.setITEM_NAME(workStruct.getITEM_NAME());
                   save_struct.setDRAW_CD(workStruct.getDRAW_CD());
                   save_struct.setSPEC(workStruct.getSPEC());
                   save_struct.setMRP_ODR_TYP(workStruct.getMRP_ODR_TYP());
                   save_struct.setOUTSIDE_TYP(workStruct.getOUTSIDE_TYP());
                   save_struct.setITEM_SPOIL(workStruct.getITEM_SPOIL());
                   save_struct.setUNIT_QTY_TYP(workStruct.getUNIT_QTY_TYP());
                   save_struct.setLOT_SIZING_TYP(workStruct.getLOT_SIZING_TYP());
                   save_struct.setMAX_PERIOD(workStruct.getMAX_PERIOD());
                   save_struct.setMUL_ODR_QTY(workStruct.getMUL_ODR_QTY());
                   save_struct.setMAX_ODR_QTY(workStruct.getMAX_ODR_QTY());
                   save_struct.setMIN_ODR_QTY(workStruct.getMIN_ODR_QTY());
                   save_struct.setSAFETY_STOCK(workStruct.getSAFETY_STOCK());
                   save_struct.setSTOCK_UNIT(workStruct.getSTOCK_UNIT());
                   save_struct.setSTOCK_UNIT_1(workStruct.getSTOCK_UNIT());
                   save_struct.setSTOCK_UNIT_2(workStruct.getSTOCK_UNIT());
                   save_struct.setSTOCK_UNIT_3(workStruct.getSTOCK_UNIT());
                   save_struct.setSTOCK_UNIT_4(workStruct.getSTOCK_UNIT());
              
                   save_struct.sets_ODR_LT(workStruct.gets_ODR_LT());
                   save_struct.sets_FIXED_LT(workStruct.gets_FIXED_LT());
                   save_struct.sets_PROP_LT(workStruct.gets_PROP_LT());
                   save_struct.sets_SAFETY_LT(workStruct.gets_SAFETY_LT());
                   save_struct.sets_PROP_LOT_SIZE(workStruct.gets_PROP_LOT_SIZE());
                   save_struct.sets_ISSUE_TYP(workStruct.gets_ISSUE_TYP());
                   save_struct.sets_ISSUE_LT(workStruct.gets_ISSUE_LT());
              
                   //====================================
                   // Mrp�f�[�^�Z�o����
                   //====================================
                   // MRP�f�[�^�Z�o�ɕK�v�ȏ���ݒ�
                   MrpManager mrpManager = new MrpManager();
                   mrpManager.setConnection(conn);
                   mrpManager.setItemCode(struct.getw_ITEM_CD());
                   mrpManager.setPlantCode(struct.getw_PLANT_CD());
                   mrpManager.setFrom(dc.str2formal(struct.getw_date_from()));
                   mrpManager.setTo(dc.str2formal(struct.getw_date_to()));
                   mrpManager.setfg(Checkfg);
                   _debugMsg = ("controlselect()" + 
                    " (YYYY/MM/DD)FROM = " + dc.str2formal(struct.getw_date_from()) + 
                    " (YYYY/MM/DD)TO = " + dc.str2formal(struct.getw_date_to()));
                   sysLog.finest_d(_debugMsg, struct.getsUser_ID());
              
                   // MRP�f�[�^�Z�o����
                   _debugMsg = ("controlselect() stockOnHandQty = " + save_struct.getSTOCK_ON_HAND_QTY() + " itemSpoil = " + save_struct.getITEM_SPOIL());
                   sysLog.finest_d(_debugMsg, struct.getsUser_ID());
                   result = mrpManager.execute(save_struct.getSTOCK_ON_HAND_QTY(), save_struct.getITEM_SPOIL());
                   if(result == true)
                   {
                    //====================================
                    // ��ʂ֕\���������ݒ�
                    //====================================
                    struct.copy(save_struct);
                    setTypeValueAboutItem(struct);
              
                    AG0030010Struct oneDay = null;
                    oneDay = new AG0030010Struct();
                    oneDay.importPastStock(mrpManager.getPast(),_locale);
                    list.add(oneDay);
              
                    for(int n = 0; n < mrpManager.size(); n++){
                     oneDay = new AG0030010Struct();
                     oneDay.importStock(mrpManager.getData(n));
                     list.add(oneDay);
                    }
                    // ���������t���O�ݒ�
                    bSuccess = true;
                   }
                   else
                   {
                    // MRP�f�[�^�Z�o�Ɏ��s
                    sysLog.finest_d("calculate error:MRP-data", struct.getsUser_ID());
                   }
                  }
                  else
                  {
                   // ���C����񃌃R�[�h�Ȃ�
                   _debugMsg = ("controlselect() no record for main info." + workList.size());
                   sysLog.finest_d(_debugMsg, struct.getsUser_ID());
                  }
              
                 }
                }
                catch(SQLException e)
                {
                 // ������Ԃ��u�Ǎ����s�v�ɐݒ�
                 setReadStatus(ERROR);
              
                 // �G���[�������L�q���Ă��������B
                 setSqlExceptionMsg(e, "");
              
                } finally {
                 // ��ʃ��[�h�ݒ�
                 if(bSuccess == true)
                 {
                  // ������Ԃ��u�Ǎ������v�ɐݒ�
                  setReadStatus(NORMAL);
                 }
                 else
                 {
                  // ������Ԃ��u�O���Ǎ��v�ɐݒ�
                  setReadStatus(NOT_FOUND);
              
                  // �S�N���A
                  struct.clear();
              
                  // �ŐV�H���񔽉f
                  if(structPlant != null)
                  {
                   struct.setPLANT_NAME(structPlant.getPLANT_NAME());
                  }
                  // �ŐV�i�ڏ�񔽉f
                  if(structItem != null)
                  {
                   struct.setITEM_NAME(structItem.getITEM_NAME());
                   struct.setDRAW_CD(structItem.getDRAW_CD());
                   struct.setSPEC(structItem.getSPEC());
                   struct.setMRP_ODR_TYP(structItem.getMRP_ODR_TYP());
                   struct.setOUTSIDE_TYP(structItem.getOUTSIDE_TYP());
                   struct.setITEM_SPOIL(structItem.getITEM_SPOIL());
                   struct.setUNIT_QTY_TYP(structItem.getUNIT_QTY_TYP());
                   struct.setLOT_SIZING_TYP(structItem.getLOT_SIZING_TYP());
                   struct.setMAX_PERIOD(structItem.getMAX_PERIOD());
                   struct.setMUL_ODR_QTY(structItem.getMUL_ODR_QTY());
                   struct.setMAX_ODR_QTY(structItem.getMAX_ODR_QTY());
                   struct.setMIN_ODR_QTY(structItem.getMIN_ODR_QTY());
                   struct.setSAFETY_STOCK(structItem.getSAFETY_STOCK());
                   struct.setSTOCK_UNIT(structItem.getSTOCK_UNIT());
                   struct.setSTOCK_UNIT_1(structItem.getSTOCK_UNIT());
                   struct.setSTOCK_UNIT_2(structItem.getSTOCK_UNIT());
                   struct.setSTOCK_UNIT_3(structItem.getSTOCK_UNIT());
                   struct.setSTOCK_UNIT_4(structItem.getSTOCK_UNIT());
              
                   struct.sets_ODR_LT(structItem.gets_ODR_LT());
                   struct.sets_FIXED_LT(structItem.gets_FIXED_LT());
                   struct.sets_PROP_LT(structItem.gets_PROP_LT());
                   struct.sets_SAFETY_LT(structItem.gets_SAFETY_LT());
                   struct.sets_PROP_LOT_SIZE(structItem.gets_PROP_LOT_SIZE());
                   struct.sets_ISSUE_TYP(structItem.gets_ISSUE_TYP());
                   struct.sets_ISSUE_LT(structItem.gets_ISSUE_LT());
                   setTypeValueAboutItem(struct);
                  }
              
                  // �H��A�i�ڗ����Ƃ����݂���ꍇ�ɐݒ肷����
                  if(structPlant != null && structItem != null)
                  {
                   struct.setSTOCK_ON_HAND_QTY(strStockOnHandQty);
                  }
              
                  // �Ǎ��L�[���Đݒ�
                  struct.setw_PLANT_CD(structCopy.getw_PLANT_CD());
                  struct.setw_ITEM_CD(structCopy.getw_ITEM_CD());
                  struct.setw_date_from(structCopy.getw_date_from());
                  struct.setw_date_to(structCopy.getw_date_to());
                 }
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AG0030010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0030");
		logger.entering("AG0030010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
                //------------------------------------------------------------------
                try
                {
                 struct.clear();
                 list.clear();
              
                 // �f�t�H���g�l�ݒ�
                 setDefaultData();
              
                 // ������Ԃ��u������ԁv�ɐݒ�
                 setReadStatus(INITIAL);
                }
                catch(SQLException e)
                {
                 setSqlExceptionMsg(e, "");
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AG0030010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0030");
		logger.entering("AG0030010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AG0030010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0030");
		logger.entering("AG0030010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                //------------------------------------------------------------------------------
                try
                {
                 // �R���{�f�[�^�̎擾
                 ComboBox controller = new ComboBox(conn, sysUSER_CD);
                 ComboStruct MRP_ODR_TYP = controller.getData("MRP_ODR_TYP");		// �i�ڎ�z�敪
                 ComboStruct OUTSIDE_TYP = controller.getData("OUTSIDE_TYP");		// �i�ړ��O��敪
                 ComboStruct UNIT_QTY_TYP = controller.getData("UNIT_QTY_TYP");		// �݌ɐ��P�ʋ敪
                 ComboStruct LOT_SIZING_TYP = controller.getData("LOT_SIZING_TYP");	// ���b�g�܂Ƃߋ敪
                 controller.setConnection(null);
              
                 // �����Ɏ擾�f�[�^�ݒ�
                 setMRP_ODR_TYP(MRP_ODR_TYP);
                 setOUTSIDE_TYP(OUTSIDE_TYP);
                 setUNIT_QTY_TYP(UNIT_QTY_TYP);
                 setLOT_SIZING_TYP(LOT_SIZING_TYP);
                              
                 // �N���A����
                 controlclear();
              
                 if ( isScreenMove() == true ) {
                     // �����̃R���g���[�����\�b�h���Ăяo���܂��B
                     struct.setw_ITEM_CD(_itemCd);
                     struct.setw_PLANT_CD(_plantCd);
                     controlselect();
                 }
                 
                }
                catch(SQLException e)
                {
                 // �G���[���b�Z�[�W�쐬
                 setSqlExceptionMsg(e, "");
                }
                catch(ComboException e)
                {
                 // �G���[���b�Z�[�W�쐬
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
                 ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
              
                 throw ee;
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AG0030010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0030");
		logger.entering("AG0030010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AG0030010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
                } catch(AlarmMessageException ame){
                 ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
                 throw ee;
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// �g���b�Z�[�W�o�͈˗��쐬
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AG0030010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AG0030010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AG0030010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AG0030010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AG0030010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AG0030010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AG0030010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AG0030010Entity entity;
	protected AG0030010Struct struct;
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

		entity = new AG0030010Entity();
		struct = new AG0030010Struct();

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
	 * AG0030010�N���X�̕W���R���X�g���N�^
	 */
	public AG0030010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
                //------------------------------------------------------------------
                list = new ArrayList(0);
                //------------------------------------------------------------------
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
				AG0030010Struct key = (AG0030010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("w_date_from") && key.getw_date_from() != null) {
					msgKey.setKeyValue("w_date_from", key.getw_date_from());
				}
				if(msgKeyType.containsKeyColumn("w_date_to") && key.getw_date_to() != null) {
					msgKey.setKeyValue("w_date_to", key.getw_date_to());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_NAME") && key.getMRP_ODR_NAME() != null) {
					msgKey.setKeyValue("MRP_ODR_NAME", key.getMRP_ODR_NAME());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_NAME") && key.getOUTSIDE_NAME() != null) {
					msgKey.setKeyValue("OUTSIDE_NAME", key.getOUTSIDE_NAME());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_NAME") && key.getUNIT_QTY_NAME() != null) {
					msgKey.setKeyValue("UNIT_QTY_NAME", key.getUNIT_QTY_NAME());
				}
				if(msgKeyType.containsKeyColumn("LOT_SIZING_NAME") && key.getLOT_SIZING_NAME() != null) {
					msgKey.setKeyValue("LOT_SIZING_NAME", key.getLOT_SIZING_NAME());
				}
				if(msgKeyType.containsKeyColumn("PlanDate") && key.getPlanDate() != null) {
					msgKey.setKeyValue("PlanDate", key.getPlanDate());
				}
				if(msgKeyType.containsKeyColumn("FixDemand") && key.getFixDemand() != null) {
					msgKey.setKeyValue("FixDemand", key.getFixDemand());
				}
				if(msgKeyType.containsKeyColumn("PlanDemand") && key.getPlanDemand() != null) {
					msgKey.setKeyValue("PlanDemand", key.getPlanDemand());
				}
				if(msgKeyType.containsKeyColumn("FixOrder") && key.getFixOrder() != null) {
					msgKey.setKeyValue("FixOrder", key.getFixOrder());
				}
				if(msgKeyType.containsKeyColumn("OldPlanOrder") && key.getOldPlanOrder() != null) {
					msgKey.setKeyValue("OldPlanOrder", key.getOldPlanOrder());
				}
				if(msgKeyType.containsKeyColumn("ValidStock") && key.getValidStock() != null) {
					msgKey.setKeyValue("ValidStock", key.getValidStock());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_1") && key.getSTOCK_UNIT_1() != null) {
					msgKey.setKeyValue("STOCK_UNIT_1", key.getSTOCK_UNIT_1());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_2") && key.getSTOCK_UNIT_2() != null) {
					msgKey.setKeyValue("STOCK_UNIT_2", key.getSTOCK_UNIT_2());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_3") && key.getSTOCK_UNIT_3() != null) {
					msgKey.setKeyValue("STOCK_UNIT_3", key.getSTOCK_UNIT_3());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_4") && key.getSTOCK_UNIT_4() != null) {
					msgKey.setKeyValue("STOCK_UNIT_4", key.getSTOCK_UNIT_4());
				}
				if(msgKeyType.containsKeyColumn("s_BUSINESS_OPR_DATE") && key.gets_BUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("s_BUSINESS_OPR_DATE", key.gets_BUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("s_MIN_CAL_DATE") && key.gets_MIN_CAL_DATE() != null) {
					msgKey.setKeyValue("s_MIN_CAL_DATE", key.gets_MIN_CAL_DATE());
				}
				if(msgKeyType.containsKeyColumn("s_MAX_CAL_DATE") && key.gets_MAX_CAL_DATE() != null) {
					msgKey.setKeyValue("s_MAX_CAL_DATE", key.gets_MAX_CAL_DATE());
				}
				if(msgKeyType.containsKeyColumn("s_OD_NO") && key.gets_OD_NO() != null) {
					msgKey.setKeyValue("s_OD_NO", key.gets_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("s_PLAN_SPAN") && key.gets_PLAN_SPAN() != null) {
					msgKey.setKeyValue("s_PLAN_SPAN", key.gets_PLAN_SPAN());
				}
				if(msgKeyType.containsKeyColumn("s_PRD_PLAN_PERIOD_TYP") && key.gets_PRD_PLAN_PERIOD_TYP() != null) {
					msgKey.setKeyValue("s_PRD_PLAN_PERIOD_TYP", key.gets_PRD_PLAN_PERIOD_TYP());
				}
				if(msgKeyType.containsKeyColumn("s_PRD_PLAN_FINAL_DAY_TYP") && key.gets_PRD_PLAN_FINAL_DAY_TYP() != null) {
					msgKey.setKeyValue("s_PRD_PLAN_FINAL_DAY_TYP", key.gets_PRD_PLAN_FINAL_DAY_TYP());
				}
				if(msgKeyType.containsKeyColumn("s_ODR_LT") && key.gets_ODR_LT() != null) {
					msgKey.setKeyValue("s_ODR_LT", key.gets_ODR_LT());
				}
				if(msgKeyType.containsKeyColumn("s_FIXED_LT") && key.gets_FIXED_LT() != null) {
					msgKey.setKeyValue("s_FIXED_LT", key.gets_FIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("s_PROP_LT") && key.gets_PROP_LT() != null) {
					msgKey.setKeyValue("s_PROP_LT", key.gets_PROP_LT());
				}
				if(msgKeyType.containsKeyColumn("s_SAFETY_LT") && key.gets_SAFETY_LT() != null) {
					msgKey.setKeyValue("s_SAFETY_LT", key.gets_SAFETY_LT());
				}
				if(msgKeyType.containsKeyColumn("s_ISSUE_LT") && key.gets_ISSUE_LT() != null) {
					msgKey.setKeyValue("s_ISSUE_LT", key.gets_ISSUE_LT());
				}
				if(msgKeyType.containsKeyColumn("s_PROP_LOT_SIZE") && key.gets_PROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("s_PROP_LOT_SIZE", key.gets_PROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("s_DUE_DATE") && key.gets_DUE_DATE() != null) {
					msgKey.setKeyValue("s_DUE_DATE", key.gets_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("s_PRD_DUE_DATE") && key.gets_PRD_DUE_DATE() != null) {
					msgKey.setKeyValue("s_PRD_DUE_DATE", key.gets_PRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("s_PRD_START_DATE") && key.gets_PRD_START_DATE() != null) {
					msgKey.setKeyValue("s_PRD_START_DATE", key.gets_PRD_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("s_ODR_START_DATE") && key.gets_ODR_START_DATE() != null) {
					msgKey.setKeyValue("s_ODR_START_DATE", key.gets_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("s_ODR_QTY") && key.gets_ODR_QTY() != null) {
					msgKey.setKeyValue("s_ODR_QTY", key.gets_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("s_ISSUE_TYP") && key.gets_ISSUE_TYP() != null) {
					msgKey.setKeyValue("s_ISSUE_TYP", key.gets_ISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("s_MAX_DISPLAY_MONTH_STOCK") && key.gets_MAX_DISPLAY_MONTH_STOCK() != null) {
					msgKey.setKeyValue("s_MAX_DISPLAY_MONTH_STOCK", key.gets_MAX_DISPLAY_MONTH_STOCK());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("DRAW_CD") && key.getDRAW_CD() != null) {
					msgKey.setKeyValue("DRAW_CD", key.getDRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("SPEC") && key.getSPEC() != null) {
					msgKey.setKeyValue("SPEC", key.getSPEC());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("ITEM_SPOIL") && key.getITEM_SPOIL() != null) {
					msgKey.setKeyValue("ITEM_SPOIL", key.getITEM_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("LOT_SIZING_TYP") && key.getLOT_SIZING_TYP() != null) {
					msgKey.setKeyValue("LOT_SIZING_TYP", key.getLOT_SIZING_TYP());
				}
				if(msgKeyType.containsKeyColumn("MAX_PERIOD") && key.getMAX_PERIOD() != null) {
					msgKey.setKeyValue("MAX_PERIOD", key.getMAX_PERIOD());
				}
				if(msgKeyType.containsKeyColumn("MUL_ODR_QTY") && key.getMUL_ODR_QTY() != null) {
					msgKey.setKeyValue("MUL_ODR_QTY", key.getMUL_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("MAX_ODR_QTY") && key.getMAX_ODR_QTY() != null) {
					msgKey.setKeyValue("MAX_ODR_QTY", key.getMAX_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("MIN_ODR_QTY") && key.getMIN_ODR_QTY() != null) {
					msgKey.setKeyValue("MIN_ODR_QTY", key.getMIN_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("SAFETY_STOCK") && key.getSAFETY_STOCK() != null) {
					msgKey.setKeyValue("SAFETY_STOCK", key.getSAFETY_STOCK());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_CD") && key.getw_PLANT_CD() != null) {
					msgKey.setKeyValue("w_PLANT_CD", key.getw_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_CD") && key.getw_ITEM_CD() != null) {
					msgKey.setKeyValue("w_ITEM_CD", key.getw_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY") && key.getSTOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("STOCK_ON_HAND_QTY", key.getSTOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("dummy") && key.getdummy() != null) {
					msgKey.setKeyValue("dummy", key.getdummy());
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
					AG0030010Struct key = new AG0030010Struct();
					if(msgKeyType.containsKeyColumn("w_date_from")) {
						key.setw_date_from(msgKey.getKeyValue("w_date_from"));
					}
					if(msgKeyType.containsKeyColumn("w_date_to")) {
						key.setw_date_to(msgKey.getKeyValue("w_date_to"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_NAME")) {
						key.setMRP_ODR_NAME(msgKey.getKeyValue("MRP_ODR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_NAME")) {
						key.setOUTSIDE_NAME(msgKey.getKeyValue("OUTSIDE_NAME"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_NAME")) {
						key.setUNIT_QTY_NAME(msgKey.getKeyValue("UNIT_QTY_NAME"));
					}
					if(msgKeyType.containsKeyColumn("LOT_SIZING_NAME")) {
						key.setLOT_SIZING_NAME(msgKey.getKeyValue("LOT_SIZING_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PlanDate")) {
						key.setPlanDate(msgKey.getKeyValue("PlanDate"));
					}
					if(msgKeyType.containsKeyColumn("FixDemand")) {
						key.setFixDemand(msgKey.getKeyValue("FixDemand"));
					}
					if(msgKeyType.containsKeyColumn("PlanDemand")) {
						key.setPlanDemand(msgKey.getKeyValue("PlanDemand"));
					}
					if(msgKeyType.containsKeyColumn("FixOrder")) {
						key.setFixOrder(msgKey.getKeyValue("FixOrder"));
					}
					if(msgKeyType.containsKeyColumn("OldPlanOrder")) {
						key.setOldPlanOrder(msgKey.getKeyValue("OldPlanOrder"));
					}
					if(msgKeyType.containsKeyColumn("ValidStock")) {
						key.setValidStock(msgKey.getKeyValue("ValidStock"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_1")) {
						key.setSTOCK_UNIT_1(msgKey.getKeyValue("STOCK_UNIT_1"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_2")) {
						key.setSTOCK_UNIT_2(msgKey.getKeyValue("STOCK_UNIT_2"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_3")) {
						key.setSTOCK_UNIT_3(msgKey.getKeyValue("STOCK_UNIT_3"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_4")) {
						key.setSTOCK_UNIT_4(msgKey.getKeyValue("STOCK_UNIT_4"));
					}
					if(msgKeyType.containsKeyColumn("s_BUSINESS_OPR_DATE")) {
						key.sets_BUSINESS_OPR_DATE(msgKey.getKeyValue("s_BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("s_MIN_CAL_DATE")) {
						key.sets_MIN_CAL_DATE(msgKey.getKeyValue("s_MIN_CAL_DATE"));
					}
					if(msgKeyType.containsKeyColumn("s_MAX_CAL_DATE")) {
						key.sets_MAX_CAL_DATE(msgKey.getKeyValue("s_MAX_CAL_DATE"));
					}
					if(msgKeyType.containsKeyColumn("s_OD_NO")) {
						key.sets_OD_NO(msgKey.getKeyValue("s_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("s_PLAN_SPAN")) {
						key.sets_PLAN_SPAN(msgKey.getKeyValue("s_PLAN_SPAN"));
					}
					if(msgKeyType.containsKeyColumn("s_PRD_PLAN_PERIOD_TYP")) {
						key.sets_PRD_PLAN_PERIOD_TYP(msgKey.getKeyValue("s_PRD_PLAN_PERIOD_TYP"));
					}
					if(msgKeyType.containsKeyColumn("s_PRD_PLAN_FINAL_DAY_TYP")) {
						key.sets_PRD_PLAN_FINAL_DAY_TYP(msgKey.getKeyValue("s_PRD_PLAN_FINAL_DAY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("s_ODR_LT")) {
						key.sets_ODR_LT(msgKey.getKeyValue("s_ODR_LT"));
					}
					if(msgKeyType.containsKeyColumn("s_FIXED_LT")) {
						key.sets_FIXED_LT(msgKey.getKeyValue("s_FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("s_PROP_LT")) {
						key.sets_PROP_LT(msgKey.getKeyValue("s_PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("s_SAFETY_LT")) {
						key.sets_SAFETY_LT(msgKey.getKeyValue("s_SAFETY_LT"));
					}
					if(msgKeyType.containsKeyColumn("s_ISSUE_LT")) {
						key.sets_ISSUE_LT(msgKey.getKeyValue("s_ISSUE_LT"));
					}
					if(msgKeyType.containsKeyColumn("s_PROP_LOT_SIZE")) {
						key.sets_PROP_LOT_SIZE(msgKey.getKeyValue("s_PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("s_DUE_DATE")) {
						key.sets_DUE_DATE(msgKey.getKeyValue("s_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("s_PRD_DUE_DATE")) {
						key.sets_PRD_DUE_DATE(msgKey.getKeyValue("s_PRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("s_PRD_START_DATE")) {
						key.sets_PRD_START_DATE(msgKey.getKeyValue("s_PRD_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("s_ODR_START_DATE")) {
						key.sets_ODR_START_DATE(msgKey.getKeyValue("s_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("s_ODR_QTY")) {
						key.sets_ODR_QTY(msgKey.getKeyValue("s_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("s_ISSUE_TYP")) {
						key.sets_ISSUE_TYP(msgKey.getKeyValue("s_ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("s_MAX_DISPLAY_MONTH_STOCK")) {
						key.sets_MAX_DISPLAY_MONTH_STOCK(msgKey.getKeyValue("s_MAX_DISPLAY_MONTH_STOCK"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DRAW_CD")) {
						key.setDRAW_CD(msgKey.getKeyValue("DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("SPEC")) {
						key.setSPEC(msgKey.getKeyValue("SPEC"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(msgKey.getKeyValue("OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_SPOIL")) {
						key.setITEM_SPOIL(msgKey.getKeyValue("ITEM_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("LOT_SIZING_TYP")) {
						key.setLOT_SIZING_TYP(msgKey.getKeyValue("LOT_SIZING_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MAX_PERIOD")) {
						key.setMAX_PERIOD(msgKey.getKeyValue("MAX_PERIOD"));
					}
					if(msgKeyType.containsKeyColumn("MUL_ODR_QTY")) {
						key.setMUL_ODR_QTY(msgKey.getKeyValue("MUL_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("MAX_ODR_QTY")) {
						key.setMAX_ODR_QTY(msgKey.getKeyValue("MAX_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("MIN_ODR_QTY")) {
						key.setMIN_ODR_QTY(msgKey.getKeyValue("MIN_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SAFETY_STOCK")) {
						key.setSAFETY_STOCK(msgKey.getKeyValue("SAFETY_STOCK"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_CD")) {
						key.setw_PLANT_CD(msgKey.getKeyValue("w_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_CD")) {
						key.setw_ITEM_CD(msgKey.getKeyValue("w_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY")) {
						key.setSTOCK_ON_HAND_QTY(msgKey.getKeyValue("STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("dummy")) {
						key.setdummy(msgKey.getKeyValue("dummy"));
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
