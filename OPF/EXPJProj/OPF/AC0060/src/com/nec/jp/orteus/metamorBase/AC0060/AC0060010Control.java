/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0060/src/com/nec/jp/orteus/metamorBase/AC0060/AC0060010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0060;

import com.nec.jp.orteus.metamorBase.AC0060.*;
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
import com.nec.jp.orteus.metamorBase.common01.Accessor.PrivateConfig;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.metamorBase.common01.util.DateConverter;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
import com.nec.jp.orteus.metamorBase.common04.DateCtrl.DateCtrl;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common01.util.DefaultPeriod;
// ���t�ϊ�
import com.nec.jp.orteus.expj.util.Converter;
import java.text.ParseException;

import com.nec.jp.orteus.expj.util.*;
//------------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AC0060010Control
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
       
        public AC0060010Struct getStruct() { return this.struct; }	// Struct�̒l�i���f�B�G�[�^�j��Ԃ��܂��B
       
       //------------------------------------------------------------------------------
       
        /** ��ʋ��ʒ�`�擾�N���X */
        ScreenParam _scParam = sp;
       
        //-------------------------------------------------------------------------
       
        /**
         * ���b�Z�[�W�擾 
         * @return ���b�Z�[�W
         */
        public MessageStruct getMessage(){return msgStruct;}
        /**
         * ���b�Z�[�W�ݒ�
         * @param msg ���b�Z�[�W
         */
        public void setMessage(MessageStruct msg){msgStruct = msg;}
       
        //------------------------------------------------------------------
        // ���P�[��(������������擾���邽��)
        private String _locale = "";
        public void setLocale(String loc) { _locale = loc; }
       
        //------------------------------------------------------------------------------
        // SYS_TYPE_VALUE
       
        /** �i�ڎ�z�敪 */
        private ComboStruct _MRP_ODR_TYP = new ComboStruct();
        /** ���O��敪 */
        private ComboStruct _OUTSIDE_TYP = new ComboStruct();
        /** �݌ɐ��P�ʋ敪 */
        private ComboStruct _UNIT_QTY_TYP = new ComboStruct();
        /** ���b�g�܂Ƃߋ敪 */
        private ComboStruct _LOT_SIZING_TYP = new ComboStruct();
       
        /**
         * �敪���擾
         * @param comboStruct �敪��񃊃X�g
         * @param strTyp �敪�R�[�h
         * @return �敪���́B�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�
         */
        private String getTypeName(ComboStruct comboStruct, String strTyp)
        {
         if(comboStruct == null || strTyp == null)  return null;
         String strTypName = strTyp;
         for(int i = 0; i < comboStruct.getValList().size(); i++){
          if(strTyp.equals((String)(comboStruct.getValList().get(i))) == true){
           strTypName = (String)(comboStruct.getExplanList().get(i));
           break;
          }
         }
         if(strTypName == null) strTypName = strTyp;
         return strTypName;
        }
        /**
         * �i�ڏ��̃t���O�̕\����ݒ�
         * @param s �t���O�̒l���ݒ肳��Ă�����
         */
        private void setTypeValueAboutItem(AC0060010Struct s)
        {
         s.setMRP_ODR_NAME(getTypeName(_MRP_ODR_TYP,s.getMRP_ODR_TYP()));
         s.setOUTSIDE_NAME(getTypeName(_OUTSIDE_TYP,s.getOUTSIDE_TYP()));
         s.setUNIT_QTY_NAME(getTypeName(_UNIT_QTY_TYP,s.getUNIT_QTY_TYP()));
         s.setLOT_SIZING_NAME(getTypeName(_LOT_SIZING_TYP,s.getLOT_SIZING_TYP()));
        }
        //------------------------------------------------------------------------------
        /**
         * ���C����ʗp �f�t�H���g�l�ݒ�
         * �ݒ��̏����N���A������ �f�t�H���g�l��ݒ肷��
         * @param s �ݒ��
         */
        private void setDefault4Main(AC0060010Struct s) throws ExpjException
        {
         s.setPLANT_CD(getsysPLANT_CD());
       
         // �f�t�H���g���Y�v����Ԏ擾�ݒ�
         setDefaultPeriodDate(s);
        }
        /**
         * �T�u1��ʗp �f�t�H���g�l�ݒ�
         * �ݒ��̏����N���A���� �f�t�H���g�l��ݒ肷��
         * @param s �ݒ��
         */
        private void setDefault4Sub1(AC0060010Struct s)
        {
         s.setOD_TYP(AC0060Const.C_KIND_ODER);
         s.setEXTERNAL_DM_FLG(AC0060Const.C_EXT_DM_YES);
        }
       
        //------------------------------------------------------------------------------
        // SYS_PARAMETER����擾������e
       
        /** �����v�ʓW�J�œW�J���� */
        private String _expectAllMrp = null;
        /** �I�[�_�E�f�}���h���폜���� */
        private String _expectDelete = null;
        /** EJa-ASPROVA�A�g�I�v�V���������t���O�擾�p */
    	private String _SysInstallOptions_ASP = null;
        /**
         * SYS_PARAMETER����l�擾
         */
        private void readParameter() throws SQLException, ExpjException
        {
         PrivateConfig pconfig = new PrivateConfig(conn);
         if((_expectAllMrp = pconfig.getString("EXTERN_EXPECT_ALL_MRP")) == null){
          ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
          ExpjMessage emsg_log = new ExpjMessage( "ZZ01006", "SYS_PARAMETER.EXTERN_EXPECT_ALL_MRP:" + _expectAllMrp );
          sysLog.severe(emsg, getsysUSER_CD());
          sysLog.severe(emsg_log, getsysUSER_CD());
          ExpjException ee = new ExpjException(emsg);
       
          throw ee;
         }
         if((_expectDelete = pconfig.getString("EXTERN_EXPECT_DELETE")) == null){
          ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
          ExpjMessage emsg_log = new ExpjMessage( "ZZ01006", "SYS_PARAMETER.EXTERN_EXPECT_DELETE:" + _expectDelete );
          sysLog.severe(emsg, getsysUSER_CD());
          sysLog.severe(emsg_log, getsysUSER_CD());
          ExpjException ee = new ExpjException(emsg);
       
          throw ee;
         }
        }
       
        //------------------------------------------------------------------------------
        /** �Ǎ��݃L�[�Ƃ��̃}�X�^���ێ��p */
        private AC0060010Struct _baseInfomation = new AC0060010Struct();
       
        /** �ҏW���̊O���v��ԍ�(�s�C�����X�V�Ŏg�p */
        private String _editingExtNo = null;
        /** �ҏW���̃I�[�_�ԍ�(�s�C�����X�V�Ŏg�p */
        private String _editingOdNo = null;
       
        //------------------------------------------------------------------------------
        // �Ǎ�������
       
        /**
         * �ǂݍ��ݎ��̃}�X�^�n���(�i��/�H��/�݌�)�擾���`�F�b�N
         * @param s ���o�͏��
         */
        //�Ǎ����`�F�b�N�t���O�̒�`
        int Checkfg = 0;
        private boolean readMaster(AC0060010Struct s) throws SQLException, FoundationException
        {
         boolean existPlant = true, otherResult = true;
         boolean result = true;
         List wkList = null;
         Checkfg = 1;
       
         List listMessage = new ArrayList();
         String Message = "";
         
         // �H��ǂݍ���
         wkList = entity.mM_PLANT.read(conn,struct);
         if(wkList.size() == 0){
          struct.clearAboutPlant();
          Message = "M_PLANT.PLANT_CD:" + struct.getPLANT_CD();
          setErrorMessage("AC10001", Message);
          existPlant = false;
         }
         else{
          struct.importPlant((AC0060010Struct)(wkList.get(0)));
         }
       
         // �i�ړǂݍ��݁��i�ڎ�z�敪�`�F�b�N
         wkList = entity.mM_ITEM.read(conn,struct);
         if(wkList.size() == 0){
          struct.clearAboutItem();
          Message = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
          setErrorMessage("AC10002", Message);
          otherResult = false;
         }
         else{
          struct.importItem((AC0060010Struct)(wkList.get(0)));
       
          // �i�ڏ��̃t���O�̕\��������ݒ�
          setTypeValueAboutItem(struct);
       
          // �i�ڎ�z�敪�̃`�F�b�N
          String odrTyp = struct.getMRP_ODR_TYP();
          if(AC0060Const.C_ODR_MANUAL.equals(odrTyp) == false
          && AC0060Const.C_ODR_LOT.equals(odrTyp) == false){
           Message = "M_ITEM.MRP_ODR_TYP:" + odrTyp;
           setErrorMessage("AC10025", Message);
           otherResult = false;
          }
         }
       
         // �ۊǋ�ʕi�ڍ݌ɓǂݍ���
         wkList = entity.mT_ITEM_STOCKbyPLANT.read(conn,struct);
         if(wkList.size() == 0){
          struct.clearAboutItemStockByPlant();
         }
         else{
          struct.importItemStockByPlant((AC0060010Struct)(wkList.get(0)));
         }
       
         DateConverter dc = new DateConverter();
         AC0060010Struct forDate = new AC0060010Struct();
         forDate.setPLANT_CD(struct.getPLANT_CD());
         forDate.setITEM_CD(struct.getITEM_CD());
         forDate.setw_DATE_FROM(dc.str2formal(struct.getw_DATE_FROM()));
         forDate.setw_DATE_TO(dc.str2formal(struct.getw_DATE_TO()));

         //---------DEL 20081208       
//         // �Ɩ��^�p�������v�����(from)��?
//         if(existPlant){
//          DateCtrl dctrl = new DateCtrl(conn);
//          String oprDate = dctrl.getBusinessOprDate(struct.getPLANT_CD());
//          if(oprDate == null){
//           Message = "SYS_DATE_CTRL.PLANT_CD:" + struct.getPLANT_CD();
//           setErrorMessage("AC10006", Message);
//           return false;
//          }
//          if(forDate.getw_DATE_FROM().compareTo(oprDate) < 0){
//           Message = "SYS_DATE_CTRL.PLANT_CD:" + struct.getPLANT_CD();
//           setErrorMessage("AC10006", Message);
//           otherResult = false;
//          }
//         }

         // �J�����_�ǂݍ��݁��v�����(from)�A�v�����(to)�Ƃ̑Ó����`�F�b�N

         if(otherResult){
          wkList = entity.mM_CALRange1.read(conn,forDate);
          if(((AC0060010Struct)(wkList.get(0))).getMIN_CAL_DATE() != null &&
          	 ((AC0060010Struct)(wkList.get(0))).getMAX_CAL_DATE() != null){
          	 	if(((AC0060010Struct)(wkList.get(0))).getMIN_CAL_DATE().compareTo(forDate.getw_DATE_FROM()) > 0
          		|| ((AC0060010Struct)(wkList.get(0))).getMAX_CAL_DATE().compareTo(forDate.getw_DATE_TO()) < 0){
          			listMessage.add("M_ITEM.ITEM_CD:" + forDate.getITEM_CD());
          			listMessage.add("M_ITEM.CAL_DATE:" +  forDate.getw_DATE_FROM() + " - " + forDate.getw_DATE_TO());
          			setErrorMessage("AC10005", listMessage);
          			return false;
          		}
          	 }else{
          	 	Checkfg = 0;
          	 }
         }
        	
        if(Checkfg ==0){
        	if(existPlant){
        		wkList = entity.mM_CALRange.read(conn,forDate);
        		if(wkList.size() == 0){
        			Message = "M_PLANT.PLANT_CD:" + forDate.getPLANT_CD();
        			setErrorMessage("AC10005", Message);
        			return false;
        		}
        		if(((AC0060010Struct)(wkList.get(0))).getMIN_CAL_DATE().compareTo(forDate.getw_DATE_FROM()) > 0
        		|| ((AC0060010Struct)(wkList.get(0))).getMAX_CAL_DATE().compareTo(forDate.getw_DATE_TO()) < 0){
        	   listMessage.add("M_PLANT.PLANT_CD:" + forDate.getPLANT_CD());
        	   listMessage.add("M_PLANT.CAL_DATE:" +  forDate.getw_DATE_FROM() + " - " + forDate.getw_DATE_TO());
        	   setErrorMessage("AC10005", listMessage);
        	   return false;
        		}
        	}
        }
         return otherResult && existPlant;
        }
        /**
         * ���v��/�L���݌ɂ̓ǂݍ���
         * @param s �ǂݍ��݂̂��߂̏��
         * @param targets �ݒ肷�郊�X�g(AC0060010Struct�̃��X�g)
         */
        private boolean readTransaction(AC0060010Struct s, List targets) throws FoundationException, SQLException, ExpjException
        {
         //------------------------------------------------------------------
         // �L���݌Ɍv�Z
         // MRP�f�[�^�Z�o�ɕK�v�ȏ���ݒ�
         String Message = "";
         DateConverter dc = new DateConverter();
         
         //20090617 MOD START
	      MrpManager mrpManager = new MrpManager();      
          ATMrpManager atmrpManager = new ATMrpManager();		
		 // EJa-ASPROVA�A�g�I�v�V���������̏ꍇ
		 if("1".equals(_SysInstallOptions_ASP)){	
			 atmrpManager.setConnection(conn);
			 atmrpManager.setItemCode(s.getITEM_CD());
			 atmrpManager.setPlantCode(s.getPLANT_CD());
	         atmrpManager.setFrom(dc.str2formal(s.getw_DATE_FROM()));
	         atmrpManager.setTo(dc.str2formal(s.getw_DATE_TO()));
	         atmrpManager.setfg(Checkfg);
	         if(atmrpManager.execute(s.getSTOCK_ON_HAND_QTY(),s.getITEM_SPOIL(),s.getw_DATE_FROM()) == false){ //CHG 20081208
	          sysLog.finest_d("* Calculation of effective stock went wrong", struct.getsUser_ID());
	          ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
	          sysLog.severe(emsg, getsysUSER_CD());
	          ExpjException ee = new ExpjException(emsg);          
	          throw ee;
	         }	
		 }else{
	         mrpManager.setConnection(conn);
	         mrpManager.setItemCode(s.getITEM_CD());
	         mrpManager.setPlantCode(s.getPLANT_CD());
	         mrpManager.setFrom(dc.str2formal(s.getw_DATE_FROM()));
	         mrpManager.setTo(dc.str2formal(s.getw_DATE_TO()));
	         mrpManager.setfg(Checkfg);
	         if(mrpManager.execute(s.getSTOCK_ON_HAND_QTY(),s.getITEM_SPOIL(),s.getw_DATE_FROM()) == false){ //CHG 20081208
	          sysLog.finest_d("* Calculation of effective stock went wrong", struct.getsUser_ID());
	          ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
	          sysLog.severe(emsg, getsysUSER_CD());
	          ExpjException ee = new ExpjException(emsg);
	          
	          throw ee;
	         }
		 }
         //20090617 MOD END
	      
         //------------------------------------------------------------------
         // ���v�ʓǂݍ���
         AC0060010Struct wkStruct = new AC0060010Struct();
         wkStruct.copy(s);
         wkStruct.setw_DATE_FROM(dc.str2formal(s.getw_DATE_FROM()));
         wkStruct.setw_DATE_TO(dc.str2formal(s.getw_DATE_TO()));
       
         // ���v�ʓǂݍ���:�O���f�}���h
         List dmdList = null;
         wkStruct.setODR_STS_TYP(null);
         wkStruct.setDM_STS_TYP(AC0060Const.C_DM_STS_PLAN);
         wkStruct.setOD_TYP(AC0060Const.C_KIND_DMD);
         dmdList = entity.mT_OD.read(conn,wkStruct);
         if(dmdList == null){
          sysLog.finest_d("* External order reading failure", struct.getsUser_ID());
          ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
          sysLog.severe(emsg, getsysUSER_CD());
          ExpjException ee = new ExpjException(emsg);
          
          throw ee;
         }
         for(int n = 0; n < dmdList.size(); n++){
          AC0060010Struct current = (AC0060010Struct)(dmdList.get(n));
          prepareOd(current);
         }
       
         // ���v�ʓǂݍ���:�O���I�[�_
         List odList = null;
         wkStruct.setODR_STS_TYP(AC0060Const.C_ODR_STS_PLAN);
         wkStruct.setDM_STS_TYP(null);
         wkStruct.setOD_TYP(AC0060Const.C_KIND_ODER);
         odList = entity.mT_OD.read(conn,wkStruct);
         if(odList == null){
          sysLog.finest_d("* External order reading failure", struct.getsUser_ID());
          ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
          sysLog.severe(emsg, getsysUSER_CD());
          ExpjException ee = new ExpjException(emsg);
          
          throw ee;
         }
         for(int n = 0; n < odList.size(); n++){
          AC0060010Struct current = (AC0060010Struct)(odList.get(n));
          prepareOd(current);
         }
       
         // ��ʕ\���Ɏg�p����f�[�^�ݒ�
         int n, m = 0, i = 0;
         boolean existExtern;
         AC0060010Struct dataByDay = null, dmd = null, od = null;

         //20090617 MOD START
		 // EJa-ASPROVA�A�g�I�v�V���������̏ꍇ
		 if("1".equals(_SysInstallOptions_ASP)){		 
	         // �ߋ�
	         dataByDay = new AC0060010Struct();
	         dataByDay.importPastStock(atmrpManager.getPast(),_locale);
	         targets.add(dataByDay);
	       
			//���t�����p
			DateTimeFormat dtf = new DateTimeFormat(conn);
			
	         // �e���{�O���I�[�_�E�f�}���h��
	         for(n = 0; n < atmrpManager.size(); n++){
	          existExtern = false;
	          dataByDay = new AC0060010Struct();
	          dataByDay.importMrpData(atmrpManager.getData(n));
	          String nowDay = dtf.getDatePart(dataByDay.getPlanDate());
	          Integer nowHOLIDAY_FLG = dataByDay.getHOLIDAY_FLG();
	          for(; m < dmdList.size(); m++){
	           dmd = (AC0060010Struct)(dmdList.get(m));
	           if(dtf.getDatePart(dataByDay.getPlanDate()).compareTo(dtf.getDatePart(dmd.getPlanDate())) < 0)  break;
	           sysLog.finest_d("* DEMAND(" + m + ") " + dmd.toString(),struct.getsUser_ID());
	           dataByDay.importExternData(dmd);
	           targets.add(dataByDay);
	           dataByDay = new AC0060010Struct();
	           dataByDay.setPlanDate(nowDay);
	           dataByDay.setHOLIDAY_FLG(nowHOLIDAY_FLG);
	           existExtern = true;
	          }
	          for(; i < odList.size() ; i++){
	           od = (AC0060010Struct)(odList.get(i));
	           if(dtf.getDatePart(dataByDay.getPlanDate()).compareTo(dtf.getDatePart(od.getPlanDate())) < 0)  break;
	           sysLog.finest_d("* ORDER  (" + i + ") " + od.toString(),struct.getsUser_ID());
	           dataByDay.importExternData(od);
	           targets.add(dataByDay);
	           dataByDay = new AC0060010Struct();
	           dataByDay.setPlanDate(nowDay);
	           dataByDay.setHOLIDAY_FLG(nowHOLIDAY_FLG);
	           existExtern = true;
	          }
	          if(existExtern == false)  targets.add(dataByDay);
	         }
	     // ASPROVA�A�g�I�v�V���������Ȃ��̏ꍇ
		 }else{
	         // �ߋ�
	         dataByDay = new AC0060010Struct();
	         dataByDay.importPastStock(mrpManager.getPast(),_locale);
	         targets.add(dataByDay);
	       
			//���t�����p
			DateTimeFormat dtf = new DateTimeFormat(conn);
			
	         // �e���{�O���I�[�_�E�f�}���h��
	         for(n = 0; n < mrpManager.size(); n++){
	          existExtern = false;
	          dataByDay = new AC0060010Struct();
	          dataByDay.importMrpData(mrpManager.getData(n));
	          String nowDay = dtf.getDatePart(dataByDay.getPlanDate());
	          Integer nowHOLIDAY_FLG = dataByDay.getHOLIDAY_FLG();
	          for(; m < dmdList.size(); m++){
	           dmd = (AC0060010Struct)(dmdList.get(m));
	           if(dtf.getDatePart(dataByDay.getPlanDate()).compareTo(dtf.getDatePart(dmd.getPlanDate())) < 0)  break;
	           sysLog.finest_d("* DEMAND(" + m + ") " + dmd.toString(),struct.getsUser_ID());
	           dataByDay.importExternData(dmd);
	           targets.add(dataByDay);
	           dataByDay = new AC0060010Struct();
	           dataByDay.setPlanDate(nowDay);
	           dataByDay.setHOLIDAY_FLG(nowHOLIDAY_FLG);
	           existExtern = true;
	          }
	          for(; i < odList.size() ; i++){
	           od = (AC0060010Struct)(odList.get(i));
	           if(dtf.getDatePart(dataByDay.getPlanDate()).compareTo(dtf.getDatePart(od.getPlanDate())) < 0)  break;
	           sysLog.finest_d("* ORDER  (" + i + ") " + od.toString(),struct.getsUser_ID());
	           dataByDay.importExternData(od);
	           targets.add(dataByDay);
	           dataByDay = new AC0060010Struct();
	           dataByDay.setPlanDate(nowDay);
	           dataByDay.setHOLIDAY_FLG(nowHOLIDAY_FLG);
	           existExtern = true;
	          }
	          if(existExtern == false)  targets.add(dataByDay);
	         }			 
		 }
		//20090617 MOD END        
         
         // ��ʕ\���p�t�B�[���h�Ƀf�[�^�ݒ�
         for(n = 0; n < targets.size(); n++){
          AC0060010Struct record = (AC0060010Struct)((targets.get(n)));
          String currentOdType = record.getOD_TYP();
          // �f�}���h�̂Ƃ� �\���p�f�}���h���ʂɐݒ�
          if(AC0060Const.C_KIND_DMD.equals(currentOdType)){
           record.setdispDM_QTY(record.getDM_QTY());
          }
          // �I�[�_�̂Ƃ� �\���p�I�[�_���ʂɐݒ�
          if(AC0060Const.C_KIND_ODER.equals(currentOdType)){
           record.setdispODR_QTY(record.getODR_QTY());
          }
         }
         return true;
        }
        /** ����O���v��̏��v�ʂŃI�[�_�����ς݂��Ȃ����m�F */
        private AC0060OdRelease _checkOd = new AC0060OdRelease();
       
        /**
         * ���v��/�O���v��̏�Ԃɂ���ʕ\���p����ݒ�
         * _checkOd�̏��������ς�ł��邱�ƁB
         */
        private void prepareOd(AC0060010Struct s) throws SQLException
        {
         // �ҏW��/�s����
         if(s.getOD_TYP() == null){
          s.setIsReleased(AC0060Const.C_RELEASE_YET); // �^�C�v���ݒ莞�͕ҏW�s��
         }else{
          // �I�[�_�̂Ƃ� ����O���v��ԍ��̏��v�ʂɃI�[�_�����ς݂�����ΕҏW�s��
          if(AC0060Const.C_KIND_ODER.equals(s.getOD_TYP())){
           if(_checkOd.isReleased(s.getEXTERNAL_PLAN_CD()) == false){
            s.setIsReleased(AC0060Const.C_RELEASE_YET);
           }else{
            s.setIsReleased(AC0060Const.C_RELEASE_DONE);
           }
          }
          // �f�}���h�̂Ƃ� �e�I�[�_�ԍ��ݒ�ς݂Ȃ�ҏW�s��
          else{
           if(s.getPARENT_OD_NO() == null || s.getPARENT_OD_NO().equals("")){
            s.setIsReleased(AC0060Const.C_RELEASE_YET);
           }else{
            s.setIsReleased(AC0060Const.C_RELEASE_DONE);
           }
          }
         }
         // �\�蕶����ݒ�
         s.setExpect(null);
         s.setLowerDeploy(AC0060Const.C_CHECK_NO);
         if(s.getOD_TYP() != null && AC0060Const.C_KIND_ODER.equals(s.getOD_TYP())){ // �I�[�_�̂Ƃ�
          // �O���v�揈���敪=2(�ύX)&&�O���v��폜�t���O=1(�폜)�̏ꍇ
          if((s.getEXTERNAL_PLAN_EXP_TYP() != null && AC0060Const.C_EXT_EXP_CHANGE.equals(s.getEXTERNAL_PLAN_EXP_TYP()))
          && (s.getEXTERNAL_PLAN_DEL_FLG() != null && AC0060Const.C_EXT_DEL_YES.equals(s.getEXTERNAL_PLAN_DEL_FLG()))){
           s.setLowerDeploy(AC0060Const.C_CHECK_NO);
           if(s.getExpect() != null){
            s.setExpect(new String(s.getExpect() + " " + _expectDelete));
           }else{
            s.setExpect(_expectDelete);
           }
          }
          // �O���f�}���h�t���O=1(�O��)&&���v�ʏ����敪=9(�ς�)�̏ꍇ
          else if((s.getEXTERNAL_DM_FLG() != null && AC0060Const.C_EXT_DM_YES.equals(s.getEXTERNAL_DM_FLG()))
          && (s.getMRP_TYP() != null && AC0060Const.C_MRP_DONE.equals(s.getMRP_TYP()))){
           s.setLowerDeploy(AC0060Const.C_CHECK_YES);
           if(s.getExpect() != null){
            s.setExpect(new String(s.getExpect() + " " + _expectAllMrp));
           }else{
            s.setExpect(_expectAllMrp);
           }
          }
         }
        }
        //------------------------------------------------------------------------------
       
        /**
         * ���X�g������Y���I�[�_�ԍ��̏����R�s�[
         * @param infos �����Ƃ̃I�[�_�f�}���h���
         * @param extNo �T���O���v��ԍ�
         * @param out �X���I�[�_�̏���ݒ肷��̈�
         * @return true:�Y���I�[�_�̏�񂪂����� / false:�Y���I�[�_�̏��Ȃ�
         */
        private boolean list2struct(List infos, String extNo, String odNo, AC0060010Struct out)
        {
         int n;
         for(n = 0; n < infos.size(); n++){
          AC0060010Struct current = (AC0060010Struct)(infos.get(n));
          String currentExtNo = current.getEXTERNAL_PLAN_CD();
          String currentOdNo = current.getOD_NO();
          if(currentExtNo != null && currentOdNo != null
          && currentExtNo.equals(extNo) && currentOdNo.equals(odNo)){
           out.setStructM(current);
           return true;
          }
         }
       
         return false;
        }
       
        //------------------------------------------------------------------------------
        // �o�^/�X�V�����ʏ���
       
        /**
         * �o�^/�X�V�� ��ʂ̏��E��������� ���v��/�O���v��ɓo�^or�X�V�������ݒ�
         * �L�[(�I�[�_�f�}���h�ԍ�, �O���v��ԍ�)�̐ݒ�͍s��Ȃ�
         * @param in ��ʂ̏��
         * @param target ���̐ݒ��
         * @return true:���� / false:���炩�̏����Ɏ��s(���b�Z�[�W�ݒ�ς�)
         */
        private boolean setOdExternInfomation(AC0060010Struct in, AC0060010Struct target) throws ExpjException, ParseException
        {
         // ���ʐݒ� ----------
         // �H��/�i��/���[�U/����
         target.setPLANT_CD(_baseInfomation.getPLANT_CD());
         target.importItem(_baseInfomation);
         target.copySystemData(struct);
         target.setPlanDate(in.getPlanDate()); // ���t�v�Z�p
       
         // �����[��
         DateConverter dc = new DateConverter();
         Date dueDate = dc.str2date(in.getPlanDate());
         if(dueDate == null){
          ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
          sysLog.severe(emsg, getsysUSER_CD());
          ExpjException ee = new ExpjException(emsg);
          
          throw ee;
         }
       
         // �ғ�������
         if(isWorkDate(in,dueDate) == false) return false;
       
         // �����[����ݒ�
         target.setPRD_DUE_DATE(dueDate);
       
         // �I�[�_�f�}���h�敪
         target.setOD_TYP(in.getOD_TYP());
       
         // �I�[�_�̂Ƃ� ------
         if(AC0060Const.C_KIND_ODER.equals(in.getOD_TYP())){
          target.setODR_QTY(in.getODR_QTY()); // �I�[�_����
       
          Date wkDate = null;
          // ���������
          if((wkDate = calcPrdStartDate(target)) == null)  return false;
          target.setPRD_START_DATE(wkDate);

          // �����Z�o���ꂽ���t�𕶎��^�ɕϊ����ĕێ�����
          String tempPrdStartDate = Converter.dateToStr(target.getPRD_START_DATE(), "yyyy/MM/dd");
       
          // ��z�����
          if((wkDate = calcOdrStartDate(target)) == null)  return false;
          target.setODR_START_DATE(wkDate);
       
          // �����Z�o���ꂽ���t�𕶎��^�ɕϊ����ĕێ�����
          String tempOdrStartDate = Converter.dateToStr(target.getODR_START_DATE(), "yyyy/MM/dd");
       
          target.setODR_STS_TYP(AC0060Const.C_ODR_STS_PLAN);
          target.setDM_STS_TYP(AC0060Const.C_DM_STS_NONE);
          target.setDM_QTY("0");
          // ���ʕ��i��W�J����
          if(in.getLowerDeploy() == null || AC0060Const.C_CHECK_NO.equals(in.getLowerDeploy())){
           target.setMRP_TYP(AC0060Const.C_MRP_ADD);
           target.setEXTERNAL_DM_FLG(AC0060Const.C_EXT_DM_NO);
          }else{ // ���Ȃ�
           target.setMRP_TYP(AC0060Const.C_MRP_DONE);
           target.setEXTERNAL_DM_FLG(AC0060Const.C_EXT_DM_YES);
          }

          // �����[�����Đݒ�
          if((in.getPlanTime()).length() == 3 ){
              //�R���͓��ɂO��t����
              in.setPlanTime("0" + in.getPlanTime());
          }
          if(null != in.getPlanDate() || !(in.getPlanDate()).equals("")){
	          if(null != in.getPlanTime() || !(in.getPlanTime()).equals("")){
                  target.setPRD_DUE_DATE_ALL(in.getPlanDate() + " " + in.getPlanTime());
                  target.setPRD_START_DATE_ALL(tempPrdStartDate + " " + in.getPlanTime());
                  target.setODR_START_DATE_ALL(tempOdrStartDate + " " + in.getPlanTime());
              }else{
                  target.setPRD_DUE_DATE_ALL(in.getPlanDate());
                  target.setPRD_START_DATE_ALL(tempPrdStartDate);
                  target.setODR_START_DATE_ALL(tempOdrStartDate);
              }
          }else{
              target.setPRD_DUE_DATE_ALL("");
              target.setPRD_START_DATE_ALL("");
              target.setODR_START_DATE_ALL("");
          }

         }
         // �f�}���h�̂Ƃ� ----
         else{
          target.setODR_STS_TYP(AC0060Const.C_ODR_STS_NONE);
          target.setDM_STS_TYP(AC0060Const.C_DM_STS_PLAN);

          // �����[�����Đݒ�
          if((in.getPlanTime()).length() == 3 ){
              //�R���͓��ɂO��t����
              in.setPlanTime("0" + in.getPlanTime());
          }
          if(null != in.getPlanDate() || !(in.getPlanDate()).equals("")){
	          if(null != in.getPlanTime() || !(in.getPlanTime()).equals("")){
                  target.setPRD_DUE_DATE_ALL(in.getPlanDate() + " " + in.getPlanTime());
              }else{
                  target.setPRD_DUE_DATE_ALL(in.getPlanDate());
              }
          }else{
              target.setPRD_DUE_DATE_ALL("");
          }

          // �����[�����Đݒ�
          if((in.getPlanTime()).length() == 3 ){
              //�R���͓��ɂO��t����
              in.setPlanTime("0" + in.getPlanTime());
          }
          if(null != in.getPlanDate() || !(in.getPlanDate()).equals("")){
	          if(null != in.getPlanTime() || !(in.getPlanTime()).equals("")){
                  target.setDUE_DATE_ALL(in.getPlanDate() + " " + in.getPlanTime());
              }else{
                  target.setDUE_DATE_ALL(in.getPlanDate());
              }
          }else{
              target.setDUE_DATE_ALL("");
          }

          target.setDM_QTY(in.getDM_QTY()); // �f�}���h����
          target.setODR_QTY("0");
          target.setMRP_TYP(AC0060Const.C_MRP_ADD);
          target.setEXTERNAL_DM_FLG(AC0060Const.C_EXT_DM_YES);

         }
         return true;
        }
        /**
         * ����������v�Z<br>
         * �[��-(�i�ڌŒ�LT+�؂�グ(�I�[�_��/��Ⴭ�b�g�T�C�Y)*�i�ڔ��LT+���S����)
         * �i�ڏ��� _baseInformation���g�p���ĎZ�o
         * @param info �[���E�I�[�_���ʂ��ݒ肳��Ă�����
         * @return ��������� / �Z�o���s�� null
         */
        private Date calcPrdStartDate(AC0060010Struct info)
        {
         String Message = "";
         
         try {
          WorkDay workday;
          workday = new WorkDay(struct.getsUser_ID(),sp.getProcId(),struct.getPLANT_CD(),struct.getITEM_CD(),null);
          DateConverter dc = new DateConverter();
        
          String lotSize = _baseInfomation.getPROP_LOT_SIZE();
          String fixedLt = _baseInfomation.getFIXED_LT();
          String propLt = _baseInfomation.getPROP_LT();
          String strNewPlanOrder = info.getODR_QTY();
          String safetyLt = _baseInfomation.getSAFETY_LT();
        
          String lots = Calculate.divide(info.getODR_QTY(),lotSize,0,Calculate._CEIL); // ���b�g��
          String propLtByLot = Calculate.multiply(lots,propLt); // ��჊�[�h�^�C���~���b�g��
          String productLt = Calculate.add(Calculate.add(fixedLt,propLtByLot),safetyLt); // �Œ胊�[�h�^�C���{��ᕪ�̃��[�h�^�C���{���S����
       
          sysLog.finest_d("* ODR_QTY: " + info.getODR_QTY() + " / " + lotSize + " = " + lots, struct.getsUser_ID());
          sysLog.finest_d("* PROP_LT:" + propLt + " * " + lots + " = " + propLtByLot, struct.getsUser_ID());
          sysLog.finest_d("* FIXED_LT:" + fixedLt, struct.getsUser_ID());
          sysLog.finest_d("* SAFETY_LT:" + safetyLt, struct.getsUser_ID());
          sysLog.finest_d("* ODR_START_DATE:" + info.getPlanDate() + " - " + productLt, struct.getsUser_ID());
       
          Date prdStartDate = workday.calcDate(dc.str2date(info.getPlanDate()),- Integer.parseInt(productLt) ,false);
          if(prdStartDate == null){
           Message = "TIME FOR DELIVERY:" + info.getPlanDate() + "-" + productLt;
           setErrorMessageNoKey("AC10030", Message);
           return null;
          }
          sysLog.finest_d("* �� " + prdStartDate, struct.getsUser_ID());
          return new Date(prdStartDate.getTime());
         }
         catch (FoundationException e) {
          e.printStackTrace();
          ExpjMessage emsg = new ExpjMessage( "AC10030" );
          msgStruct.addError( emsg );
          sysLog.warning(emsg, getsysUSER_CD());
          return null;
         }
        }
        /**
         * ��z������̌v�Z<br>
         * ���������-�i�ڎ�zLT
         * �i�ڏ��� _baseInformation���g�p���ĎZ�o
         * @param oprDate �Ɩ��^�p��
         * @param info �i�ڏ��Ɛ�����������ݒ肳��Ă�����
         * @return ��z����� / �Z�o���s�� null
         */
        private Date calcOdrStartDate(AC0060010Struct info)
        {
         String Message = "";
         
         try{
          WorkDay workday = new WorkDay(struct.getsUser_ID(), sp.getProcId(), struct.getPLANT_CD(),struct.getITEM_CD(), null);
          Date prdStartDate = info.getPRD_START_DATE();
       
          Date odrStartDate = workday.calcDate(prdStartDate,- Integer.parseInt(_baseInfomation.getODR_LT()),false);
          if(odrStartDate == null){
           Message = "ARRANGEMENTS START DAY:" + prdStartDate + "-" + _baseInfomation.getODR_LT();
           setErrorMessageNoKey("AC10030", Message);
           return null;
          }
       
          return new Date(odrStartDate.getTime());
         }
         catch (FoundationException e) {
          e.printStackTrace();
          ExpjMessage emsg = new ExpjMessage( "AC10030" );
          msgStruct.addError( emsg );
          sysLog.warning(emsg, getsysUSER_CD());
          return null;
         }
        }
        /**
         * ��ғ����̔���<br>
         * @param info �[���E�H��R�[�h���ݒ肳��Ă�����
         * @param dueDate �ғ������肷����t
         * @return true:�ғ��� / false:��ғ����A�������͉��炩�̏����Ɏ��s
         */
        private boolean isWorkDate(AC0060010Struct info, Date dueDate)
        {
         String Message = "";
         
         try
         {
       
          boolean bWorkDay = false;	// true:�ғ��� / false:��ғ���
          WorkDay wd = new WorkDay(struct.getsUser_ID(), sp.getProcId(), info.getPLANT_CD(),struct.getITEM_CD(), null);
          bWorkDay = wd.isWorkDate(dueDate);
          if(bWorkDay != true)
          {
           // ��ғ����̏ꍇ
           Message = "TIME FOR DELIVERY:" + info.getPlanDate();
           setErrorMessageNoKey("AC10036", Message);
           return false;
          }
          return true;
         }
         catch(FoundationException fe)
         {
          fe.printStackTrace();
          // �ғ�������ŃG���[
          ExpjMessage emsg = new ExpjMessage( "AC10036" );
          msgStruct.addError( emsg );
          sysLog.warning(emsg, getsysUSER_CD());
          return false;
         }
        }
       
        /*
         * �f�t�H���g���Y�v����ԓ��t�擾�ݒ�
         *
         * @return	�Ȃ�
         */
        private void setDefaultPeriodDate(AC0060010Struct s) throws ExpjException
        {
               // �Ɩ��^�p���̎擾
         Date dateBusinessOprDate = null;
               try
               {
          DateConverter dc = new DateConverter();
          DateCtrl dctrl = new DateCtrl(conn);
          String streBusinessOprDate = dctrl.getBusinessOprDate(getsysPLANT_CD());
          dateBusinessOprDate = dc.str2date(streBusinessOprDate);
                
          // �f�t�H���g���Y�v����ԓ��t�擾
          String strDefDate[] = {"", ""};
          boolean bResult = false;
                
          DefaultPeriod dp = new DefaultPeriod();
          bResult = dp.get(conn, dateBusinessOprDate, strDefDate);
                
          if(bResult == true)
          {
           // �擾����
           s.setw_DATE_FROM(strDefDate[0]);
           s.setw_DATE_TO(strDefDate[1]);
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
          setSqlExceptionMsg(se);
         }
       
       
        }
       
       //-------------------------------------------------------------------------
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
         * �G���[���b�Z�[�W�ݒ�(�L�[�o�͂Ȃ�)
         * @param ���b�Z�[�W�ԍ�
         * @param �o�̓��b�Z�[�W
         */
        private void setErrorMessageNoKey(String messageno, String message)
        {
         ExpjMessage emsg = new ExpjMessage( messageno );
         msgStruct.addError( emsg );
         sysLog.warning(emsg, getsysUSER_CD());
         emsg = new ExpjMessage( "ZZ01006", message );
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
       
       //-------------------------------------------------------------------------
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0060");
		logger.entering("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
                try {
                 setReadStatus(INITIAL);
                 _baseInfomation.clear();
                 if(list == null){
                  list = new ArrayList(0);
                 }else{
                  list.clear();
                 }
                 // �}�X�^���ǂݍ���
                 if(readMaster(struct) == false)  return;
              
                 // ���v�ʓǂݍ���
                 _checkOd.initialize(conn.getConn());
                 if(readTransaction(struct,list) == false)  return;
              
                 _baseInfomation.copy(struct); // ���̑ޔ�
                 setReadStatus(NORMAL);
              
                }
                catch(SQLException e) {
                    setSqlExceptionMsg(e);
              
                }
                finally{
                 _checkOd.finalize();
                }
                //}}user_implement_dev:<controlselect>
		logger.exiting("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * �s�ǉ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlappend() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0060");
		logger.entering("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlappend");
			//{{user_implement_dev:<controlappend>
              
			try {
                struct.importItem(_baseInfomation);
                setDefault4Sub1(struct);
              
				// �V�X�e���p�����[�^�iTIME_CTRL�j�擾
				AC0060010Struct TIME_CTRLStruct = new AC0060010Struct();
				List TIME_CTRLList = entity.mSELECT_TIME_CTRL.read(conn, TIME_CTRLStruct);
				if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
					TIME_CTRLStruct = (AC0060010Struct)TIME_CTRLList.get(0);
					struct.setTIME_CTRL(TIME_CTRLStruct.getTIME_CTRL());
				}else{
					struct.setTIME_CTRL("false");
				}

			} catch (SQLException e) {
				throw new ExpjException(e);
			}
                //}}user_implement_dev:<controlappend>
		logger.exiting("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlappend");

		return;
	}

	/**
	 * �s�C���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlmodify() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0060");
		logger.entering("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlmodify");
			//{{user_implement_dev:<controlmodify>
                 
			try {
                struct.importItem(_baseInfomation);
                _editingOdNo = new String(struct.getOD_NO());
                _editingExtNo = new String(struct.getEXTERNAL_PLAN_CD());
              
				// �V�X�e���p�����[�^�iTIME_CTRL�j�擾
				AC0060010Struct TIME_CTRLStruct = new AC0060010Struct();
				List TIME_CTRLList = entity.mSELECT_TIME_CTRL.read(conn, TIME_CTRLStruct);
				if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
					TIME_CTRLStruct = (AC0060010Struct)TIME_CTRLList.get(0);
					struct.setTIME_CTRL(TIME_CTRLStruct.getTIME_CTRL());
				}else{
					struct.setTIME_CTRL("false");
				}
              
				// �����[���i�����j�擾
				AC0060010Struct GET_TIME_Struct = new AC0060010Struct();
				GET_TIME_Struct.setTIME_GET_OD_NO(_editingOdNo);
				List TIME_GET_List = entity.mSELECT_T_OD_TIME_GET.read(conn, GET_TIME_Struct);
				if(null != TIME_GET_List && TIME_GET_List.size()>0){
					GET_TIME_Struct = (AC0060010Struct)TIME_GET_List.get(0);
					struct.setPlanTime(GET_TIME_Struct.getPRD_DUE_TIME());
				}else{
					struct.setPlanTime(null);
				}
              
	            //�����Ǘ����Ȃ��Ƃ��͎�����\�����Ȃ�
	            if((struct.getTIME_CTRL()).equals("false")){
	                struct.setPlanTime("");
	            }

			} catch (SQLException e) {
				throw new ExpjException(e);
			}
                //}}user_implement_dev:<controlmodify>
		logger.exiting("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlmodify");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0060");
		logger.entering("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
              
                struct.initialize();
                setReadStatus(INITIAL);
                if(list != null)  list.clear();
                setDefault4Main(struct);
                _editingOdNo = null;
                _editingExtNo = null;
                try{
	                // �C���X�g�[���I�v�V�����e�[�u�����EJa-ASPROVA�A�g�I�v�V���������t���O���擾
	                List SysInstallOptASP = entity.mSYS_INSTALL_OPTIONS_ASP.read(conn,struct);
	                if(SysInstallOptASP == null || SysInstallOptASP.size() <=0){
	                	struct.setASP_INSTALL_FLG(null);
	                }else{
	                	struct.setASP_INSTALL_FLG(((AC0060010Struct)SysInstallOptASP.get(0)).getASP_INSTALL_FLG());
	                }
	                _SysInstallOptions_ASP = struct.getASP_INSTALL_FLG();
                }catch(SQLException e){
					e.printStackTrace();
					throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlclear>
		logger.exiting("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlinsertSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0060");
		logger.entering("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");
			//{{user_implement_dev:<controlinsertSub1>
                 
                String Message = "";
                 
                try{
                 AC0060010Struct target = new AC0060010Struct();
              
              if((struct.getPlanTime()).length() == 0 && (struct.getTIME_CTRL()).equals("true") ){
				struct.setPlanTime("2359");
			}
              
                 // ��ʏ��E��������Ƃɏ��ݒ�
                 if(setOdExternInfomation(struct,target) == false)  return;
              
                 // �I�[�_�f�}���h�ԍ��̔�
                 CollectNumber collect = new CollectNumber(CollectNumber.ODNO, struct.getsUser_ID(), sp.getProcId(), struct.getPLANT_CD());
                 String odNo = collect.getNo();
                 if(odNo == null){
                  Message = "T_OD.OD_NO:" + odNo;
                  setErrorMessage("AC10027", Message);
                  return;
                 }
                 target.setOD_NO(odNo);
              
                 // �O���v��ԍ��̔�
                 collect = new CollectNumber(CollectNumber.EXTERNAL_PLAN_CD, struct.getsUser_ID(), sp.getProcId(), struct.getPLANT_CD());
                 String extNo = collect.getNo();
                 if(extNo == null){
                  Message = "T_EXTERNAL_PLAN.EXTERNAL_PLAN_CD:" + odNo;
                  setErrorMessage("AC10028", Message);
                  return;
                 }
                 target.setEXTERNAL_PLAN_CD(extNo);
              
                 conn.beginTransWeb();

                 entity.mT_OD.create(conn,target); 
                 entity.mT_EXTERNAL_PLAN.create(conn,target);
                 if(entity.mSYS_OD_CALC_CTRL.update(conn,struct) == 0){
                  Message = "SYS_OD_CALC_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  setErrorMessage("AC00035", Message);
                  conn.rollback();
                  return;
                 }
              
                 conn.commit();
              
                 controlselect();
                }
                catch(Exception e){
//                 setSqlExceptionMsg(e);
					e.printStackTrace();
					throw new ExpjException(e);
              
                }
                finally{
                 conn.rollback();
                }
                //}}user_implement_dev:<controlinsertSub1>
		logger.exiting("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlupdateSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0060");
		logger.entering("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlupdateSub1");
			//{{user_implement_dev:<controlupdateSub1>
                 
                List listMessage = new ArrayList();
                String Message = "";
              
                try{
                 // ���̃��R�[�h���X�V����Ă��Ȃ���?
                 AC0060010Struct target = new AC0060010Struct();
                 if(list2struct(list,_editingExtNo,_editingOdNo,target) == false){
                  sysLog.finest_d("* The contents of a list, and mismatching", struct.getsUser_ID());
                  
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                  sysLog.severe(emsg, getsysUSER_CD());
                  ExpjException ee = new ExpjException(emsg);
                  
                  throw ee;
                 }
                 target.copySystemData(struct);
              
                 AC0060010Struct work = new AC0060010Struct();
                 work.setOD_NO(_editingOdNo);
                 work.setEXTERNAL_PLAN_CD(_editingExtNo);
              
                 conn.beginTransWeb();
              
                 List wkOds = entity.mT_OD4Update.read(conn,work);
                 if(wkOds.size() == 0){
                  listMessage.add("T_OD.OD_NO:" + _editingOdNo);
                  listMessage.add("T_EXTERNAL_PLAN.EXTERNAL_PLAN_CD:" + _editingExtNo);
                  setErrorMessage("ZZ01105", listMessage);
                  return;
                 }
                 AC0060010Struct forCount = (AC0060010Struct)(wkOds.get(0));
                 if(target.getOD_MODIFY_COUNT().equals(forCount.getOD_MODIFY_COUNT()) == false
                 || target.getEXT_MODIFY_COUNT().equals(forCount.getEXT_MODIFY_COUNT()) == false){
                  listMessage.add("T_OD.OD_NO:" + _editingOdNo);
                  listMessage.add("T_EXTERNAL_PLAN.EXTERNAL_PLAN_CD:" + _editingExtNo);
                  setErrorMessage("ZZ01105", listMessage);
                  return;
                 }
              
                 if(entity.mSYS_OD_CALC_CTRL.update(conn,struct) == 0){
                  Message = "SYS_OD_CALC_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  setErrorMessage("AC00035", Message);
                  conn.rollback();
                  return;
                 }
              
                 // �폜���� �̂Ƃ�
                 if(AC0060Const.C_EXT_DEL_YES.equals(struct.getEXTERNAL_PLAN_DEL_FLG())){
              
                  // �O��o�^���� �����v�ʓW�J�œW�J���� �ȊO����T_OD���폜����
                  if((AC0060Const.C_KIND_ODER.equals(struct.getOD_TYP()) &&
                     AC0060Const.C_EXT_DM_YES.equals(struct.getEXTERNAL_DM_FLG())) == false){
                   entity.mT_OD.delete(conn,target);
                  }
              
                  target.setEXTERNAL_PLAN_EXP_TYP(AC0060Const.C_EXT_EXP_CHANGE);
                  target.setEXTERNAL_PLAN_DEL_FLG(AC0060Const.C_EXT_DEL_YES);
                  entity.mT_EXTERNAL_PLAN.update(conn,target);
                  conn.commit();
                  controlselect();
                  return;
                 }
                 // ��������� �X�V������
              
                 // ���ʐݒ�
                 target.setEXTERNAL_PLAN_DEL_FLG(struct.getEXTERNAL_PLAN_DEL_FLG());
              
                 // �l�ݒ�
                 if(setOdExternInfomation(struct,target) == false)  return;
              
                 entity.mT_OD.update(conn,target);
                 entity.mT_EXTERNAL_PLAN.update(conn,target);
                 conn.commit();
              
                 controlselect();
                }
                catch(Exception e){
//                 setSqlExceptionMsg(e);
					e.printStackTrace();
					throw new ExpjException(e);
                }
                finally{
                 conn.rollback();
                }
                //}}user_implement_dev:<controlupdateSub1>
		logger.exiting("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlupdateSub1");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlcancelSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0060");
		logger.entering("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlcancelSub1");
			//{{user_implement_dev:<controlcancelSub1>
                controlselect();
                //}}user_implement_dev:<controlcancelSub1>
		logger.exiting("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlcancelSub1");

		return;
	}

	/**
	 * �ڍ׃{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlDetail() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0060");
		logger.entering("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlDetail");
			//{{user_implement_dev:<controlDetail>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlDetail>
		logger.exiting("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlDetail");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0060");
		logger.entering("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0060");
		logger.entering("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                try {
              
                 // �R���{�{�b�N�X�f�[�^�p��
                 ComboBox controller = new ComboBox(conn, sysUSER_CD);
                 _MRP_ODR_TYP = controller.getData("MRP_ODR_TYP");
                 _OUTSIDE_TYP = controller.getData("OUTSIDE_TYP");
                 _UNIT_QTY_TYP = controller.getData("UNIT_QTY_TYP");
                 _LOT_SIZING_TYP = controller.getData("LOT_SIZING_TYP");
              
                 // SYS_PARAMETER����̒l�擾
                 readParameter();
              
                 controlclear();
                }
                catch(SQLException e) {
                 setSqlExceptionMsg(e);
                }
                catch(ComboException e){
                  // �G���[���b�Z�[�W�쐬
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                  sysLog.severe(emsg, getsysUSER_CD());
                  ExpjException ee = new ExpjException(e, emsg);
                  
                  throw ee;
                }
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0060");
		logger.entering("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("append") ) {
				controlappend();
			} else if( button.equals("modify") ) {
				controlmodify();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("insertSub1") ) {
				controlinsertSub1();
			} else if( button.equals("updateSub1") ) {
				controlupdateSub1();
			} else if( button.equals("cancelSub1") ) {
				controlcancelSub1();
			} else if( button.equals("Detail") ) {
				controlDetail();
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
//			throw new FoundationException("AC0060010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0060010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AC0060010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0060010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AC0060010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0060010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AC0060010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AC0060010Entity entity;
	protected AC0060010Struct struct;
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

		entity = new AC0060010Entity();
		struct = new AC0060010Struct();

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
	 * AC0060010�N���X�̕W���R���X�g���N�^
	 */
	public AC0060010Control() throws BusinessProcessException, FoundationException
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
				AC0060010Struct key = (AC0060010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
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
				if(msgKeyType.containsKeyColumn("PlanDemand") && key.getPlanDemand() != null) {
					msgKey.setKeyValue("PlanDemand", key.getPlanDemand());
				}
				if(msgKeyType.containsKeyColumn("FixedDemand") && key.getFixedDemand() != null) {
					msgKey.setKeyValue("FixedDemand", key.getFixedDemand());
				}
				if(msgKeyType.containsKeyColumn("PlanOrder") && key.getPlanOrder() != null) {
					msgKey.setKeyValue("PlanOrder", key.getPlanOrder());
				}
				if(msgKeyType.containsKeyColumn("FixedOrder") && key.getFixedOrder() != null) {
					msgKey.setKeyValue("FixedOrder", key.getFixedOrder());
				}
				if(msgKeyType.containsKeyColumn("ValidStock") && key.getValidStock() != null) {
					msgKey.setKeyValue("ValidStock", key.getValidStock());
				}
				if(msgKeyType.containsKeyColumn("LowerDeploy") && key.getLowerDeploy() != null) {
					msgKey.setKeyValue("LowerDeploy", key.getLowerDeploy());
				}
				if(msgKeyType.containsKeyColumn("Expect") && key.getExpect() != null) {
					msgKey.setKeyValue("Expect", key.getExpect());
				}
				if(msgKeyType.containsKeyColumn("r_ODR_CHOICE") && key.getr_ODR_CHOICE() != null) {
					msgKey.setKeyValue("r_ODR_CHOICE", key.getr_ODR_CHOICE());
				}
				if(msgKeyType.containsKeyColumn("r_DM_CHOICE") && key.getr_DM_CHOICE() != null) {
					msgKey.setKeyValue("r_DM_CHOICE", key.getr_DM_CHOICE());
				}
				if(msgKeyType.containsKeyColumn("c_DELETE_FLG") && key.getc_DELETE_FLG() != null) {
					msgKey.setKeyValue("c_DELETE_FLG", key.getc_DELETE_FLG());
				}
				if(msgKeyType.containsKeyColumn("c_LowerDeploy") && key.getc_LowerDeploy() != null) {
					msgKey.setKeyValue("c_LowerDeploy", key.getc_LowerDeploy());
				}
				if(msgKeyType.containsKeyColumn("dispDM_QTY") && key.getdispDM_QTY() != null) {
					msgKey.setKeyValue("dispDM_QTY", key.getdispDM_QTY());
				}
				if(msgKeyType.containsKeyColumn("dispODR_QTY") && key.getdispODR_QTY() != null) {
					msgKey.setKeyValue("dispODR_QTY", key.getdispODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("PlanTime") && key.getPlanTime() != null) {
					msgKey.setKeyValue("PlanTime", key.getPlanTime());
				}
				if(msgKeyType.containsKeyColumn("saveDM_QTY") && key.getsaveDM_QTY() != null) {
					msgKey.setKeyValue("saveDM_QTY", key.getsaveDM_QTY());
				}
				if(msgKeyType.containsKeyColumn("IsReleased") && key.getIsReleased() != null) {
					msgKey.setKeyValue("IsReleased", key.getIsReleased());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_TYP") && key.getISSUE_TYP() != null) {
					msgKey.setKeyValue("ISSUE_TYP", key.getISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("PROP_LOT_SIZE") && key.getPROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("PROP_LOT_SIZE", key.getPROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("ODR_LT") && key.getODR_LT() != null) {
					msgKey.setKeyValue("ODR_LT", key.getODR_LT());
				}
				if(msgKeyType.containsKeyColumn("FIXED_LT") && key.getFIXED_LT() != null) {
					msgKey.setKeyValue("FIXED_LT", key.getFIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("PROP_LT") && key.getPROP_LT() != null) {
					msgKey.setKeyValue("PROP_LT", key.getPROP_LT());
				}
				if(msgKeyType.containsKeyColumn("SAFETY_LT") && key.getSAFETY_LT() != null) {
					msgKey.setKeyValue("SAFETY_LT", key.getSAFETY_LT());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_LT") && key.getISSUE_LT() != null) {
					msgKey.setKeyValue("ISSUE_LT", key.getISSUE_LT());
				}
				if(msgKeyType.containsKeyColumn("ODR_STS_TYP") && key.getODR_STS_TYP() != null) {
					msgKey.setKeyValue("ODR_STS_TYP", key.getODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("DM_STS_TYP") && key.getDM_STS_TYP() != null) {
					msgKey.setKeyValue("DM_STS_TYP", key.getDM_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("OD_TYP") && key.getOD_TYP() != null) {
					msgKey.setKeyValue("OD_TYP", key.getOD_TYP());
				}
				if(msgKeyType.containsKeyColumn("DUE_DATE") && key.getDUE_DATE() != null) {
					msgKey.setKeyValue("DUE_DATE", sdf.format(key.getDUE_DATE()));
				}
				if(msgKeyType.containsKeyColumn("ODR_START_DATE") && key.getODR_START_DATE() != null) {
					msgKey.setKeyValue("ODR_START_DATE", sdf.format(key.getODR_START_DATE()));
				}
				if(msgKeyType.containsKeyColumn("PRD_DUE_DATE") && key.getPRD_DUE_DATE() != null) {
					msgKey.setKeyValue("PRD_DUE_DATE", sdf.format(key.getPRD_DUE_DATE()));
				}
				if(msgKeyType.containsKeyColumn("PRD_START_DATE") && key.getPRD_START_DATE() != null) {
					msgKey.setKeyValue("PRD_START_DATE", sdf.format(key.getPRD_START_DATE()));
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("LOT_SIZING_TYP") && key.getLOT_SIZING_TYP() != null) {
					msgKey.setKeyValue("LOT_SIZING_TYP", key.getLOT_SIZING_TYP());
				}
				if(msgKeyType.containsKeyColumn("EXTERNAL_PLAN_CD") && key.getEXTERNAL_PLAN_CD() != null) {
					msgKey.setKeyValue("EXTERNAL_PLAN_CD", key.getEXTERNAL_PLAN_CD());
				}
				if(msgKeyType.containsKeyColumn("EXTERNAL_PLAN_EXP_TYP") && key.getEXTERNAL_PLAN_EXP_TYP() != null) {
					msgKey.setKeyValue("EXTERNAL_PLAN_EXP_TYP", key.getEXTERNAL_PLAN_EXP_TYP());
				}
				if(msgKeyType.containsKeyColumn("EXTERNAL_PLAN_DEL_FLG") && key.getEXTERNAL_PLAN_DEL_FLG() != null) {
					msgKey.setKeyValue("EXTERNAL_PLAN_DEL_FLG", key.getEXTERNAL_PLAN_DEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("MIN_CAL_DATE") && key.getMIN_CAL_DATE() != null) {
					msgKey.setKeyValue("MIN_CAL_DATE", key.getMIN_CAL_DATE());
				}
				if(msgKeyType.containsKeyColumn("MAX_CAL_DATE") && key.getMAX_CAL_DATE() != null) {
					msgKey.setKeyValue("MAX_CAL_DATE", key.getMAX_CAL_DATE());
				}
				if(msgKeyType.containsKeyColumn("HOLIDAY_FLG") && key.getHOLIDAY_FLG() != null) {
					msgKey.setKeyValue("HOLIDAY_FLG", key.getHOLIDAY_FLG().toString());
				}
				if(msgKeyType.containsKeyColumn("OD_MODIFY_COUNT") && key.getOD_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("OD_MODIFY_COUNT", key.getOD_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("EXT_MODIFY_COUNT") && key.getEXT_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("EXT_MODIFY_COUNT", key.getEXT_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ODR_RELEASE_FLG") && key.getODR_RELEASE_FLG() != null) {
					msgKey.setKeyValue("ODR_RELEASE_FLG", key.getODR_RELEASE_FLG());
				}
				if(msgKeyType.containsKeyColumn("MRP_TYP") && key.getMRP_TYP() != null) {
					msgKey.setKeyValue("MRP_TYP", key.getMRP_TYP());
				}
				if(msgKeyType.containsKeyColumn("PARENT_OD_NO") && key.getPARENT_OD_NO() != null) {
					msgKey.setKeyValue("PARENT_OD_NO", key.getPARENT_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("EXTERNAL_DM_FLG") && key.getEXTERNAL_DM_FLG() != null) {
					msgKey.setKeyValue("EXTERNAL_DM_FLG", key.getEXTERNAL_DM_FLG());
				}
				if(msgKeyType.containsKeyColumn("saveMUL_ODR_QTY") && key.getsaveMUL_ODR_QTY() != null) {
					msgKey.setKeyValue("saveMUL_ODR_QTY", key.getsaveMUL_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
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
				if(msgKeyType.containsKeyColumn("ITEM_SPOIL") && key.getITEM_SPOIL() != null) {
					msgKey.setKeyValue("ITEM_SPOIL", key.getITEM_SPOIL());
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
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("SAFETY_STOCK") && key.getSAFETY_STOCK() != null) {
					msgKey.setKeyValue("SAFETY_STOCK", key.getSAFETY_STOCK());
				}
				if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY") && key.getSTOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("STOCK_ON_HAND_QTY", key.getSTOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("PlanDate") && key.getPlanDate() != null) {
					msgKey.setKeyValue("PlanDate", key.getPlanDate());
				}
				if(msgKeyType.containsKeyColumn("DM_QTY") && key.getDM_QTY() != null) {
					msgKey.setKeyValue("DM_QTY", key.getDM_QTY());
				}
				if(msgKeyType.containsKeyColumn("ODR_QTY") && key.getODR_QTY() != null) {
					msgKey.setKeyValue("ODR_QTY", key.getODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("w_DATE_FROM") && key.getw_DATE_FROM() != null) {
					msgKey.setKeyValue("w_DATE_FROM", key.getw_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("w_DATE_TO") && key.getw_DATE_TO() != null) {
					msgKey.setKeyValue("w_DATE_TO", key.getw_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("DUE_DATE_ALL") && key.getDUE_DATE_ALL() != null) {
					msgKey.setKeyValue("DUE_DATE_ALL", key.getDUE_DATE_ALL());
				}
				if(msgKeyType.containsKeyColumn("ODR_START_DATE_ALL") && key.getODR_START_DATE_ALL() != null) {
					msgKey.setKeyValue("ODR_START_DATE_ALL", key.getODR_START_DATE_ALL());
				}
				if(msgKeyType.containsKeyColumn("PRD_DUE_DATE_ALL") && key.getPRD_DUE_DATE_ALL() != null) {
					msgKey.setKeyValue("PRD_DUE_DATE_ALL", key.getPRD_DUE_DATE_ALL());
				}
				if(msgKeyType.containsKeyColumn("PRD_START_DATE_ALL") && key.getPRD_START_DATE_ALL() != null) {
					msgKey.setKeyValue("PRD_START_DATE_ALL", key.getPRD_START_DATE_ALL());
				}
				if(msgKeyType.containsKeyColumn("TIME_CTRL") && key.getTIME_CTRL() != null) {
					msgKey.setKeyValue("TIME_CTRL", key.getTIME_CTRL());
				}
				if(msgKeyType.containsKeyColumn("PRD_DUE_TIME") && key.getPRD_DUE_TIME() != null) {
					msgKey.setKeyValue("PRD_DUE_TIME", key.getPRD_DUE_TIME());
				}
				if(msgKeyType.containsKeyColumn("TIME_GET_OD_NO") && key.getTIME_GET_OD_NO() != null) {
					msgKey.setKeyValue("TIME_GET_OD_NO", key.getTIME_GET_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("ASP_INSTALL_FLG") && key.getASP_INSTALL_FLG() != null) {
					msgKey.setKeyValue("ASP_INSTALL_FLG", key.getASP_INSTALL_FLG());
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
					AC0060010Struct key = new AC0060010Struct();
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
					if(msgKeyType.containsKeyColumn("PlanDemand")) {
						key.setPlanDemand(msgKey.getKeyValue("PlanDemand"));
					}
					if(msgKeyType.containsKeyColumn("FixedDemand")) {
						key.setFixedDemand(msgKey.getKeyValue("FixedDemand"));
					}
					if(msgKeyType.containsKeyColumn("PlanOrder")) {
						key.setPlanOrder(msgKey.getKeyValue("PlanOrder"));
					}
					if(msgKeyType.containsKeyColumn("FixedOrder")) {
						key.setFixedOrder(msgKey.getKeyValue("FixedOrder"));
					}
					if(msgKeyType.containsKeyColumn("ValidStock")) {
						key.setValidStock(msgKey.getKeyValue("ValidStock"));
					}
					if(msgKeyType.containsKeyColumn("LowerDeploy")) {
						key.setLowerDeploy(msgKey.getKeyValue("LowerDeploy"));
					}
					if(msgKeyType.containsKeyColumn("Expect")) {
						key.setExpect(msgKey.getKeyValue("Expect"));
					}
					if(msgKeyType.containsKeyColumn("r_ODR_CHOICE")) {
						key.setr_ODR_CHOICE(msgKey.getKeyValue("r_ODR_CHOICE"));
					}
					if(msgKeyType.containsKeyColumn("r_DM_CHOICE")) {
						key.setr_DM_CHOICE(msgKey.getKeyValue("r_DM_CHOICE"));
					}
					if(msgKeyType.containsKeyColumn("c_DELETE_FLG")) {
						key.setc_DELETE_FLG(msgKey.getKeyValue("c_DELETE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("c_LowerDeploy")) {
						key.setc_LowerDeploy(msgKey.getKeyValue("c_LowerDeploy"));
					}
					if(msgKeyType.containsKeyColumn("dispDM_QTY")) {
						key.setdispDM_QTY(msgKey.getKeyValue("dispDM_QTY"));
					}
					if(msgKeyType.containsKeyColumn("dispODR_QTY")) {
						key.setdispODR_QTY(msgKey.getKeyValue("dispODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PlanTime")) {
						key.setPlanTime(msgKey.getKeyValue("PlanTime"));
					}
					if(msgKeyType.containsKeyColumn("saveDM_QTY")) {
						key.setsaveDM_QTY(msgKey.getKeyValue("saveDM_QTY"));
					}
					if(msgKeyType.containsKeyColumn("IsReleased")) {
						key.setIsReleased(msgKey.getKeyValue("IsReleased"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(msgKey.getKeyValue("OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_TYP")) {
						key.setISSUE_TYP(msgKey.getKeyValue("ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PROP_LOT_SIZE")) {
						key.setPROP_LOT_SIZE(msgKey.getKeyValue("PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_LT")) {
						key.setODR_LT(msgKey.getKeyValue("ODR_LT"));
					}
					if(msgKeyType.containsKeyColumn("FIXED_LT")) {
						key.setFIXED_LT(msgKey.getKeyValue("FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("PROP_LT")) {
						key.setPROP_LT(msgKey.getKeyValue("PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("SAFETY_LT")) {
						key.setSAFETY_LT(msgKey.getKeyValue("SAFETY_LT"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_LT")) {
						key.setISSUE_LT(msgKey.getKeyValue("ISSUE_LT"));
					}
					if(msgKeyType.containsKeyColumn("ODR_STS_TYP")) {
						key.setODR_STS_TYP(msgKey.getKeyValue("ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DM_STS_TYP")) {
						key.setDM_STS_TYP(msgKey.getKeyValue("DM_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OD_TYP")) {
						key.setOD_TYP(msgKey.getKeyValue("OD_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DUE_DATE")) {
						key.setDUE_DATE(sdf.parse(msgKey.getKeyValue("DUE_DATE")));
					}
					if(msgKeyType.containsKeyColumn("ODR_START_DATE")) {
						key.setODR_START_DATE(sdf.parse(msgKey.getKeyValue("ODR_START_DATE")));
					}
					if(msgKeyType.containsKeyColumn("PRD_DUE_DATE")) {
						key.setPRD_DUE_DATE(sdf.parse(msgKey.getKeyValue("PRD_DUE_DATE")));
					}
					if(msgKeyType.containsKeyColumn("PRD_START_DATE")) {
						key.setPRD_START_DATE(sdf.parse(msgKey.getKeyValue("PRD_START_DATE")));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("LOT_SIZING_TYP")) {
						key.setLOT_SIZING_TYP(msgKey.getKeyValue("LOT_SIZING_TYP"));
					}
					if(msgKeyType.containsKeyColumn("EXTERNAL_PLAN_CD")) {
						key.setEXTERNAL_PLAN_CD(msgKey.getKeyValue("EXTERNAL_PLAN_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXTERNAL_PLAN_EXP_TYP")) {
						key.setEXTERNAL_PLAN_EXP_TYP(msgKey.getKeyValue("EXTERNAL_PLAN_EXP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("EXTERNAL_PLAN_DEL_FLG")) {
						key.setEXTERNAL_PLAN_DEL_FLG(msgKey.getKeyValue("EXTERNAL_PLAN_DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("MIN_CAL_DATE")) {
						key.setMIN_CAL_DATE(msgKey.getKeyValue("MIN_CAL_DATE"));
					}
					if(msgKeyType.containsKeyColumn("MAX_CAL_DATE")) {
						key.setMAX_CAL_DATE(msgKey.getKeyValue("MAX_CAL_DATE"));
					}
					if(msgKeyType.containsKeyColumn("HOLIDAY_FLG")) {
						key.setHOLIDAY_FLG(new Integer(msgKey.getKeyValue("HOLIDAY_FLG")));
					}
					if(msgKeyType.containsKeyColumn("OD_MODIFY_COUNT")) {
						key.setOD_MODIFY_COUNT(msgKey.getKeyValue("OD_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("EXT_MODIFY_COUNT")) {
						key.setEXT_MODIFY_COUNT(msgKey.getKeyValue("EXT_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ODR_RELEASE_FLG")) {
						key.setODR_RELEASE_FLG(msgKey.getKeyValue("ODR_RELEASE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("MRP_TYP")) {
						key.setMRP_TYP(msgKey.getKeyValue("MRP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_OD_NO")) {
						key.setPARENT_OD_NO(msgKey.getKeyValue("PARENT_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("EXTERNAL_DM_FLG")) {
						key.setEXTERNAL_DM_FLG(msgKey.getKeyValue("EXTERNAL_DM_FLG"));
					}
					if(msgKeyType.containsKeyColumn("saveMUL_ODR_QTY")) {
						key.setsaveMUL_ODR_QTY(msgKey.getKeyValue("saveMUL_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
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
					if(msgKeyType.containsKeyColumn("ITEM_SPOIL")) {
						key.setITEM_SPOIL(msgKey.getKeyValue("ITEM_SPOIL"));
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
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("SAFETY_STOCK")) {
						key.setSAFETY_STOCK(msgKey.getKeyValue("SAFETY_STOCK"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY")) {
						key.setSTOCK_ON_HAND_QTY(msgKey.getKeyValue("STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PlanDate")) {
						key.setPlanDate(msgKey.getKeyValue("PlanDate"));
					}
					if(msgKeyType.containsKeyColumn("DM_QTY")) {
						key.setDM_QTY(msgKey.getKeyValue("DM_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ODR_QTY")) {
						key.setODR_QTY(msgKey.getKeyValue("ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("w_DATE_FROM")) {
						key.setw_DATE_FROM(msgKey.getKeyValue("w_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("w_DATE_TO")) {
						key.setw_DATE_TO(msgKey.getKeyValue("w_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("DUE_DATE_ALL")) {
						key.setDUE_DATE_ALL(msgKey.getKeyValue("DUE_DATE_ALL"));
					}
					if(msgKeyType.containsKeyColumn("ODR_START_DATE_ALL")) {
						key.setODR_START_DATE_ALL(msgKey.getKeyValue("ODR_START_DATE_ALL"));
					}
					if(msgKeyType.containsKeyColumn("PRD_DUE_DATE_ALL")) {
						key.setPRD_DUE_DATE_ALL(msgKey.getKeyValue("PRD_DUE_DATE_ALL"));
					}
					if(msgKeyType.containsKeyColumn("PRD_START_DATE_ALL")) {
						key.setPRD_START_DATE_ALL(msgKey.getKeyValue("PRD_START_DATE_ALL"));
					}
					if(msgKeyType.containsKeyColumn("TIME_CTRL")) {
						key.setTIME_CTRL(msgKey.getKeyValue("TIME_CTRL"));
					}
					if(msgKeyType.containsKeyColumn("PRD_DUE_TIME")) {
						key.setPRD_DUE_TIME(msgKey.getKeyValue("PRD_DUE_TIME"));
					}
					if(msgKeyType.containsKeyColumn("TIME_GET_OD_NO")) {
						key.setTIME_GET_OD_NO(msgKey.getKeyValue("TIME_GET_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("ASP_INSTALL_FLG")) {
						key.setASP_INSTALL_FLG(msgKey.getKeyValue("ASP_INSTALL_FLG"));
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
