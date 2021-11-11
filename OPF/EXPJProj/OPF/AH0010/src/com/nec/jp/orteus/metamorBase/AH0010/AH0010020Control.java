/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AH0010/src/com/nec/jp/orteus/metamorBase/AH0010/AH0010020Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AH0010;

import com.nec.jp.orteus.metamorBase.AH0010.*;
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
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AH0010020Control
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
        public AH0010020Struct getListvalue(int x) { return (AH0010020Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
        public AH0010020Struct getStruct() { return this.struct; }	// Struct��Ԃ��܂��B
        public AH0010020Struct createStruct() { return new AH0010020Struct(); }	// �V����Struct������ĕԂ��܂��B
        public void setStruct(Object structname) { this.struct.setStruct((AH0010020Struct)structname); }	// Struct���Z�b�g���܂��B
       //	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B
       
        // CSV�o�͗p���X�g
        private CsvWriter csvWriter = null;
        public CsvWriter getCsvWriter(){ return this.csvWriter; }
       
        private CsvReader csvReader = null;
        public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
       
       //-------------------------------------------------------------------------
        /** ��ʋ��ʒ�`�擾�N���X */
        ScreenParam _scParam = sp;
       
       
       //---------- ���b�Z�[�W�֘A�̏���-- --------------------------------------------
       
        /**
         * ���b�Z�[�W�擾 
         * @return ���b�Z�[�W
         */
        public MessageStruct getMessage()
        {
         return msgStruct;
        }
       
        /**
         * ���b�Z�[�W�ݒ�
         * @param ���b�Z�[�W
         */
        public void setMessage(MessageStruct msg)
        {
         msgStruct = msg;
        }
       
       
       //------------ �R���{�{�b�N�X�f�[�^--------------------------------------
       
        /**
         * �敪���擾�i���ʁj
         *
         * @param	comboStruct	�敪��񃊃X�g
         * @param	strTyp		�敪�R�[�h
         * @return	�敪����(�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�)
         */
        private String getTypName(ComboStruct comboStruct, String strTyp)
        {
         String strTypName = strTyp;
         if((comboStruct != null) && (strTyp != null))
         {
          for(int i = 0; i < comboStruct.getValList().size(); i++)
          {
           if(strTyp.equals((String)(comboStruct.getValList().get(i))) == true)
           {
            strTypName = (String)(comboStruct.getExplanList().get(i));
            break;
           }
          }
         }
         return strTypName;
        }
       
        /** �i�ڎ�z�敪 */
        private ComboStruct _MRP_ODR_TYP = new ComboStruct();
       
        /**
         * �i�ڎ�z�敪���擾
         *
         * @param	String �敪�R�[�h
         * @return	String �敪����(�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�)
         */
        private String getMRP_ODR_TYP_name(String typ)
        {
         return (getTypName(_MRP_ODR_TYP, typ));
        }
       
        /** ���O��敪 */
        private ComboStruct _OUTSIDE_TYP = new ComboStruct();
       
        /**
         * ���O��敪���擾
         *
         * @param	String �敪�R�[�h
         * @return	String �敪����(�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�)
         */
        private String getOUTSIDE_TYP_name(String typ)
        {
         return (getTypName(_OUTSIDE_TYP, typ));
        }
       
        /** �I���敪 */
        private ComboStruct _ABC_TYP = new ComboStruct();
       
         /**
         * �I���敪���擾
         *
         * @param	String �敪�R�[�h
         * @return	String �敪����(�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�)
         */
        private String getABC_TYP_name(String typ)
        {
         return (getTypName(_ABC_TYP, typ));
        }
       
       
       //------------------------------------------------------------------------
       
        /** �e���struct���ꎞ�ޔ�p */
        private AH0010020Struct _save_struct = new AH0010020Struct();
       
        /**
         * �e��ʂ�struct����ޔ�
         */
        private void saveParentStruct()
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
       
       
       //------------------------------------------------------------------------
        /**
         * SQLException�G���[���b�Z�[�W�ݒ�
         * @param SQLException
         */
        private void setSqlExceptionMsg(SQLException e) throws ExpjException
        {
         ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
         sysLog.severe(emsg, getsysUSER_CD());
         ExpjException ee = new ExpjException(e, emsg);
         throw ee;
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
         emsg = new ExpjMessage( "ZZ01006", message );
         msgStruct.addWarn( emsg );
         sysLog.info(emsg, getsysUSER_CD());
        }
         
        /**
         * ��񃁃b�Z�[�W�ݒ�
         * @param ���b�Z�[�W�ԍ�
         * @param �u��������P
         */
        private void setInfoMessage(String messageno, String value1)
        {
         ExpjMessage emsg = new ExpjMessage( messageno , value1 );
         msgStruct.addInfo( emsg );
         sysLog.config(emsg, getsysUSER_CD());
        }
         
        /**
         * ���O���b�Z�[�W�ݒ�
         * @param �o�̓��b�Z�[�W
         */
        private void setSyslogConfig(String message)
        {
         ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
         sysLog.config(emsg, getsysUSER_CD());
        }
       
       
       //---------- �b�r�u�捞�֘A�̏��� ---------------------------------------------------
       
        /** CSV�捞���ʃ��b�Z�[�W���i�[�p���X�g */
        ArrayList _listResultMessageCsv = new ArrayList(0);
       
        /**
         * CSV�捞���ʏ��ǉ�
         *
         * @return	�Ȃ�
         */
        public void csvResultListAdd(String strMessage, int intRow, int intCol)
        {
         // ���b�Z�[�W���i�[�p
         AH0010020Struct structTemp = new AH0010020Struct();
 		 // �����ꍀ�ڎ擾�Ή�
 		 String locale = CoreTools.getLocale(sysUSER_CD);
         // �s�A����u{0}���ڂ�{1}���ځv
         ExpjMessage emsg = new ExpjMessage("AH00045", ""+(intRow+1), ""+(intCol+1));
         structTemp.setERR_ADR(emsg.getMessage(locale));
         sysLog.warning(emsg, getsysUSER_CD());
       
         // �ڍד��e
         structTemp.setERR_MSG(strMessage);
       
         // ���X�g�֏��ǉ�
         _listResultMessageCsv.add(structTemp);
       
         return;
        }
       
        /**
         * CSV�捞���ʏ�񃊃X�g�擾
         *
         * @return	CSV�捞���ʏ�񃊃X�g
         */
        public List getCsvResultList()
        {
         return _listResultMessageCsv;
        }
       
        /**
         * CSV�捞���ʏ�񃊃X�g�T�C�Y�擾
         *
         * @return	CSV�捞���ʏ�񃊃X�g�T�C�Y
         */
        public int getCsvResultListSize()
        {
         return _listResultMessageCsv.size();
        }
       
        /**
         *  CSV�捞���ʏ�񃊃X�g�N���A
         *
         * @return	�Ȃ�
         */
        public void csvResultListClear()
        {
         _listResultMessageCsv.clear();
        }
       
       
        /** �b�r�u���ڔԍ���` */
        private final int CSV_COLNO_ITEM_CD = 0;
        private final int CSV_COLNO_INV_FLG_JAN = 1;
        private final int CSV_COLNO_INV_FLG_FEB = 2;
        private final int CSV_COLNO_INV_FLG_MAR = 3;
        private final int CSV_COLNO_INV_FLG_APR = 4;
        private final int CSV_COLNO_INV_FLG_MAY = 5;
        private final int CSV_COLNO_INV_FLG_JUN = 6;
        private final int CSV_COLNO_INV_FLG_JUL = 7;
        private final int CSV_COLNO_INV_FLG_AUG = 8;
        private final int CSV_COLNO_INV_FLG_SEP = 9;
        private final int CSV_COLNO_INV_FLG_OCT = 10;
        private final int CSV_COLNO_INV_FLG_NOV = 11;
        private final int CSV_COLNO_INV_FLG_DEC = 12;
        /** �b�r�u�捞�f�[�^�K�v���ڐ� */
        private final int CSV_NECESSARY_COLUMN = (CSV_COLNO_INV_FLG_DEC+1);
       
       
        /**
         * �b�r�u�f�[�^�擾�ƃ��X�g�f�[�^��
         *
         * @return	CSV�f�[�^���X�g
         */
        private List readCsvData() throws ExpjException
        {
         // ���O�o�͏��i�[�p
         String logMessage = "";
         List listMessage = new ArrayList();
       
         String [] strsCsvData = null;
         List listCsv = null;
         try {
       
          // �b�r�u�f�[�^�̃A�b�v���[�h
          strsCsvData = (String []) csvReader.lineRead();
          if(null != strsCsvData)
          {
           logMessage = "strsCsvData.length:" + strsCsvData.length;
           setSyslogConfig(logMessage);
       
           // �f�[�^�����Ƃ���strsCsvData.length�͎g���Ȃ��B���ۂ̍s���{�T�s���炢�炵��
           listCsv = new ArrayList(0);
           for(int i = 0; i < strsCsvData.length; i++)
           {
            // ���s�݂̂̃��R�[�h��EOF�Ɣ��f���܂�
            if(strsCsvData[i].length() == 0)
            {
             break;
            }
            // �^�C�g���s�ǂݔ�΂�
            if(i == 0)
            {
             continue;
            }
       
            // ���R�[�h�����ږ��ɂ΂炷
            AH0010020Struct structCsv = new AH0010020Struct();
            Vector v = csvReader.importCSVLine(strsCsvData[i]);
            if(null != v)
            {
             // ���ڐ��`�F�b�N
             int intColNum = v.size();
             if(CSV_NECESSARY_COLUMN <= intColNum)
             {
              // �b�r�u�̍��ڂ����X�g�f�[�^��
              structCsv.setw_ITEM_CD((String) v.get(CSV_COLNO_ITEM_CD));
              structCsv.seth_INV_FLG_JAN((String) v.get(CSV_COLNO_INV_FLG_JAN));
              structCsv.seth_INV_FLG_FEB((String) v.get(CSV_COLNO_INV_FLG_FEB));
              structCsv.seth_INV_FLG_MAR((String) v.get(CSV_COLNO_INV_FLG_MAR));
              structCsv.seth_INV_FLG_APR((String) v.get(CSV_COLNO_INV_FLG_APR));
              structCsv.seth_INV_FLG_MAY((String) v.get(CSV_COLNO_INV_FLG_MAY));
              structCsv.seth_INV_FLG_JUN((String) v.get(CSV_COLNO_INV_FLG_JUN));
              structCsv.seth_INV_FLG_JUL((String) v.get(CSV_COLNO_INV_FLG_JUL));
              structCsv.seth_INV_FLG_AUG((String) v.get(CSV_COLNO_INV_FLG_AUG));
              structCsv.seth_INV_FLG_SEP((String) v.get(CSV_COLNO_INV_FLG_SEP));
              structCsv.seth_INV_FLG_OCT((String) v.get(CSV_COLNO_INV_FLG_OCT));
              structCsv.seth_INV_FLG_NOV((String) v.get(CSV_COLNO_INV_FLG_NOV));
              structCsv.seth_INV_FLG_DEC((String) v.get(CSV_COLNO_INV_FLG_DEC));
              structCsv.setw_COLUMN_FLG((String)null);
              // �����Ɋ֘A����p�����[�^��ݒ�
              structCsv.setPLANT_CD(getsysPLANT_CD());
             }
             else
             {
              // ���ڐ����K�v���ڐ������̂Ƃ��͍��ڐ��s���G���[
              structCsv.setw_COLUMN_FLG(String.valueOf(intColNum));
             }
             // ���X�g�ǉ�
             listCsv.add(structCsv);
            }
            else
            {
             //�x�N�^�[�������s�G���[
             logMessage = "csvReader.Vector was Failed... line:" + strsCsvData[i];
             setSyslogConfig(logMessage);
             listCsv = null;
             break;
            }
           }
           // �b�r�u�f�[�^�����i�^�C�g���s�͏Ȃ��j
           if((listCsv == null) || (listCsv.size() <= 0))
           {
            // �捞���s�܂��̓f�[�^�Ȃ�
            ExpjMessage emsg = new ExpjMessage( "AH00042", "0", "0");
            msgStruct.addError( emsg );
            sysLog.warning(emsg, getsysUSER_CD());
            listCsv = null;
           }
           else
           {
            // �b�r�u�Ǎ��݌������O�\��
            ExpjMessage emsg = new ExpjMessage( "AH00043", ""+listCsv.size());
            sysLog.config(emsg, getsysUSER_CD());
           }
          }
       
         } catch(Exception e){
          ExpjMessage emsg = new ExpjMessage( "AH00042", "0", "0" );
          sysLog.severe(emsg, getsysUSER_CD());
          ExpjException ee = new ExpjException(e, emsg);
          throw ee;
       
         }
         return listCsv;
        }
       
        /**
         * �b�r�u�f�[�^���e�`�F�b�N����
         *
         * @param	listCsv	CSV�f�[�^���X�g
         * @return	����:true / �G���[:false
         */
        private boolean checkCsvData(List listCsv) throws BusinessProcessException, FoundationException
        {
         // ���O�o�͏��i�[�p
         String logMessage = "";
         List listMessage = new ArrayList();
 		 // �����ꍀ�ڎ擾�Ή�
 		 String locale = CoreTools.getLocale(sysUSER_CD);
         boolean bSuccess = true;	// ���������t���O������
         int intSuccessCount = 0;	// �`�F�b�N���탌�R�[�h����
         int intCsvDataCount = 0;	// �Ώۃf�[�^����
         List listRead;				// ��Ɨp
         try {
       
          AH0010020Struct structCsv;
          intCsvDataCount = listCsv.size();
          for(int i = 0; i < intCsvDataCount; i++)
          {
           ExpjMessage emsg = new ExpjMessage();
       
           // CSV���擾
           structCsv = (AH0010020Struct)listCsv.get(i);
       
           // ���ڐ��s���G���[�s�̓`�F�b�N���Ȃ�
           if(structCsv.getw_COLUMN_FLG() != null && ("").equals(structCsv.getw_COLUMN_FLG()) != true)
           {
            // ���ڐ��s���G���[
            emsg = new ExpjMessage( "AH00044", ""+CSV_NECESSARY_COLUMN );
            csvResultListAdd(emsg.getMessage(locale) , i , Integer.parseInt(structCsv.getw_COLUMN_FLG()));
            sysLog.warning(emsg, getsysUSER_CD());
            continue;
           }
       
           ////////////////////////////////////////////////////////////////////////////////////
           // �ʃ`�F�b�N�����J�n
           ////////////////////////////////////////////////////////////////////////////////////
           
           boolean bError = false;			// �G���[�t���O������
       
           // �i�ڔԍ��`�F�b�N
           if(structCsv.getw_ITEM_CD() == null || ("").equals(structCsv.getw_ITEM_CD()) == true)
           {
            // �i�ڔԍ���null
            emsg = new ExpjMessage( "AH00001" );
            csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ITEM_CD);
            sysLog.warning(emsg, getsysUSER_CD());
            logMessage = "CSV.ITEM_CD:" + structCsv.getw_ITEM_CD();
            emsg = new ExpjMessage( "ZZ01006", logMessage );
            sysLog.warning(emsg, getsysUSER_CD());
            bError = true;
           }
           else
           {
            // �i�ړǍ���
            listRead = entity.mM_ITEM.read(conn, structCsv);
            if(listRead.size() <= 0)
            {
             // �i�ڂ����݂��Ȃ�
             emsg = new ExpjMessage( "AH00002" );
             csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ITEM_CD);
             sysLog.warning(emsg, getsysUSER_CD());
             logMessage = "M_ITEM.ITEM_CD:" + structCsv.getw_ITEM_CD();
             emsg = new ExpjMessage( "ZZ01006", logMessage );
             sysLog.warning(emsg, getsysUSER_CD());
             bError = true;
            }
            else
            {
             AH0010020Struct readStructItem = new AH0010020Struct();
             readStructItem = (AH0010020Struct)listRead.get(0);
             if("8".equals(readStructItem.getw_MRP_ODR_TYP()) == true)
             {
              // �w�肳�ꂽ�i�ڂ��[���i��
              emsg = new ExpjMessage( "AH00028" );
              csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ITEM_CD);
              sysLog.warning(emsg, getsysUSER_CD());
              logMessage = "M_ITEM.ITEM_CD:" + structCsv.getw_ITEM_CD();
              emsg = new ExpjMessage( "ZZ01006", logMessage );
              sysLog.warning(emsg, getsysUSER_CD());
              bError = true;
             }
             // �i�ڂ̒I���敪��9�i�I�����Ȃ��j���ǂ����̃`�F�b�N
             if("9".equals(readStructItem.getw_ABC_TYP()) == true)
             {
              // �w�肳�ꂽ�i�ڂ̒I���敪��9�I�����Ȃ��j
              emsg = new ExpjMessage( "AH00016" );
              csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ITEM_CD);
              sysLog.warning(emsg, getsysUSER_CD());
              logMessage = "M_ITEM.ITEM_CD:" + structCsv.getw_ITEM_CD();
              emsg = new ExpjMessage( "ZZ01006", logMessage );
              sysLog.warning(emsg, getsysUSER_CD());
              bError = true;
             }
            }
           }
       
           // �I�����{�t���O�̒l��0��1���̃`�F�b�N
           // �I�����{�t���O1��
           if("1".equals(structCsv.geth_INV_FLG_JAN()) != true &&
              "0".equals(structCsv.geth_INV_FLG_JAN()) != true)
           {
             emsg = new ExpjMessage( "AH00046" );
             csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_INV_FLG_JAN);
             sysLog.warning(emsg, getsysUSER_CD());
             logMessage = "CSV.INV_FLG_JAN:" + structCsv.geth_INV_FLG_JAN();
             emsg = new ExpjMessage( "ZZ01006", logMessage );
             sysLog.warning(emsg, getsysUSER_CD());
             bError = true;
           }
           // �I�����{�t���O2��
           if("1".equals(structCsv.geth_INV_FLG_FEB()) != true &&
              "0".equals(structCsv.geth_INV_FLG_FEB()) != true)
           {
             emsg = new ExpjMessage( "AH00046" );
             csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_INV_FLG_FEB);
             sysLog.warning(emsg, getsysUSER_CD());
             logMessage = "CSV.INV_FLG_FEB:" + structCsv.geth_INV_FLG_FEB();
             emsg = new ExpjMessage( "ZZ01006", logMessage );
             sysLog.warning(emsg, getsysUSER_CD());
             bError = true;
           }
           // �I�����{�t���O3��
           if("1".equals(structCsv.geth_INV_FLG_MAR()) != true &&
              "0".equals(structCsv.geth_INV_FLG_MAR()) != true)
           {
             emsg = new ExpjMessage( "AH00046" );
             csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_INV_FLG_MAR);
             sysLog.warning(emsg, getsysUSER_CD());
             logMessage = "CSV.INV_FLG_MAR:" + structCsv.geth_INV_FLG_MAR();
             emsg = new ExpjMessage( "ZZ01006", logMessage );
             sysLog.warning(emsg, getsysUSER_CD());
             bError = true;
           }
           // �I�����{�t���O4��
           if("1".equals(structCsv.geth_INV_FLG_APR()) != true &&
              "0".equals(structCsv.geth_INV_FLG_APR()) != true)
           {
             emsg = new ExpjMessage( "AH00046" );
             csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_INV_FLG_APR);
             sysLog.warning(emsg, getsysUSER_CD());
             logMessage = "CSV.INV_FLG_APR:" + structCsv.geth_INV_FLG_APR();
             emsg = new ExpjMessage( "ZZ01006", logMessage );
             sysLog.warning(emsg, getsysUSER_CD());
             bError = true;
           }
           // �I�����{�t���O5��
           if("1".equals(structCsv.geth_INV_FLG_MAY()) != true &&
              "0".equals(structCsv.geth_INV_FLG_MAY()) != true)
           {
             emsg = new ExpjMessage( "AH00046" );
             csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_INV_FLG_MAY);
             sysLog.warning(emsg, getsysUSER_CD());
             logMessage = "CSV.INV_FLG_MAY:" + structCsv.geth_INV_FLG_MAY();
             emsg = new ExpjMessage( "ZZ01006", logMessage );
             sysLog.warning(emsg, getsysUSER_CD());
             bError = true;
           }
           // �I�����{�t���O6��
           if("1".equals(structCsv.geth_INV_FLG_JUN()) != true &&
              "0".equals(structCsv.geth_INV_FLG_JUN()) != true)
           {
             emsg = new ExpjMessage( "AH00046" );
             csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_INV_FLG_JUN);
             sysLog.warning(emsg, getsysUSER_CD());
             logMessage = "CSV.INV_FLG_JUN:" + structCsv.geth_INV_FLG_JUN();
             emsg = new ExpjMessage( "ZZ01006", logMessage );
             sysLog.warning(emsg, getsysUSER_CD());
             bError = true;
           }
           // �I�����{�t���O7��
           if("1".equals(structCsv.geth_INV_FLG_JUL()) != true &&
              "0".equals(structCsv.geth_INV_FLG_JUL()) != true)
           {
             emsg = new ExpjMessage( "AH00046" );
             csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_INV_FLG_JUL);
             sysLog.warning(emsg, getsysUSER_CD());
             logMessage = "CSV.INV_FLG_JUL:" + structCsv.geth_INV_FLG_JUL();
             emsg = new ExpjMessage( "ZZ01006", logMessage );
             sysLog.warning(emsg, getsysUSER_CD());
             bError = true;
           }
           // �I�����{�t���O8��
           if("1".equals(structCsv.geth_INV_FLG_AUG()) != true &&
              "0".equals(structCsv.geth_INV_FLG_AUG()) != true)
           {
             emsg = new ExpjMessage( "AH00046" );
             csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_INV_FLG_AUG);
             sysLog.warning(emsg, getsysUSER_CD());
             logMessage = "CSV.INV_FLG_AUG:" + structCsv.geth_INV_FLG_AUG();
             emsg = new ExpjMessage( "ZZ01006", logMessage );
             sysLog.warning(emsg, getsysUSER_CD());
             bError = true;
           }
           // �I�����{�t���O9��
           if("1".equals(structCsv.geth_INV_FLG_SEP()) != true &&
              "0".equals(structCsv.geth_INV_FLG_SEP()) != true)
           {
             emsg = new ExpjMessage( "AH00046" );
             csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_INV_FLG_SEP);
             sysLog.warning(emsg, getsysUSER_CD());
             logMessage = "CSV.INV_FLG_SEP:" + structCsv.geth_INV_FLG_SEP();
             emsg = new ExpjMessage( "ZZ01006", logMessage );
             sysLog.warning(emsg, getsysUSER_CD());
             bError = true;
           }
           // �I�����{�t���O10��
           if("1".equals(structCsv.geth_INV_FLG_OCT()) != true &&
              "0".equals(structCsv.geth_INV_FLG_OCT()) != true)
           {
             emsg = new ExpjMessage( "AH00046" );
             csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_INV_FLG_OCT);
             sysLog.warning(emsg, getsysUSER_CD());
             logMessage = "CSV.INV_FLG_OCT:" + structCsv.geth_INV_FLG_OCT();
             emsg = new ExpjMessage( "ZZ01006", logMessage );
             sysLog.warning(emsg, getsysUSER_CD());
             bError = true;
           }
           // �I�����{�t���O11��
           if("1".equals(structCsv.geth_INV_FLG_NOV()) != true &&
              "0".equals(structCsv.geth_INV_FLG_NOV()) != true)
           {
             emsg = new ExpjMessage( "AH00046" );
             csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_INV_FLG_NOV);
             sysLog.warning(emsg, getsysUSER_CD());
             logMessage = "CSV.INV_FLG_NOV:" + structCsv.geth_INV_FLG_NOV();
             emsg = new ExpjMessage( "ZZ01006", logMessage );
             sysLog.warning(emsg, getsysUSER_CD());
             bError = true;
           }
           // �I�����{�t���O12��
           if("1".equals(structCsv.geth_INV_FLG_DEC()) != true &&
              "0".equals(structCsv.geth_INV_FLG_DEC()) != true)
           {
             emsg = new ExpjMessage( "AH00046" );
             csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_INV_FLG_DEC);
             sysLog.warning(emsg, getsysUSER_CD());
             logMessage = "CSV.INV_FLG_DEC:" + structCsv.geth_INV_FLG_DEC();
             emsg = new ExpjMessage( "ZZ01006", logMessage );
             sysLog.warning(emsg, getsysUSER_CD());
             bError = true;
           }
       
           // �`�F�b�N�G���[�ƂȂ��Ă��Ȃ��ꍇ�A���탌�R�[�h�Ƃ��ăJ�E���g
           if(bError != true)
           {
            intSuccessCount++;
           }
           ////////////////////////////////////////////////////////////////////////////////////
           // �ʃ`�F�b�N�����I��
           ////////////////////////////////////////////////////////////////////////////////////
       
          } // for()
       
          // �`�F�b�N���ʏ���
          if(getCsvResultListSize() > 0)
          {
           bSuccess = false;
          }
       
          if(bSuccess != true)
          {
           // �G���[�f�[�^�L��̂��ߍX�V���Ȃ������ꍇ�̃��b�Z�[�W�\��
           ExpjMessage emsg = new ExpjMessage( "AH00041",""+intSuccessCount,""+(intCsvDataCount - intSuccessCount));
           msgStruct.addError( emsg );
           sysLog.warning(emsg, getsysUSER_CD());
          }
       
         }catch(SQLException e){
          setSqlExceptionMsg(e);
         }
         return bSuccess;
        }
       
        /**
         * �b�r�u�f�[�^�c�a���f����
         *
         * @param	listCsv	CSV�f�[�^���X�g
         * @return	����:true / �G���[:false
         */
        private boolean csvData2Db(List listCsv) throws BusinessProcessException, FoundationException
        {
         // ���O�o�͏��i�[�p
         String logMessage = "";
         List listMessage = new ArrayList();
       
         boolean bSuccess = false;	// ���������t���O������
         boolean bDBUpdate = false;	// DB�X�V���t���O������
         int intCsvDataCount = 0;	// �Ώۃf�[�^����
         List listRead;				// ��Ɨp
       
         // �������O��struct����ޔ�
         AH0010020Struct structCopy = new AH0010020Struct();
         structCopy.copy(struct);
         try
         {
          // �g�����U�N�V�����J�n
          conn.beginTransWeb();
       
          // DB�X�V���t���OON
          bDBUpdate = true;
       
          // ���H��R�[�h��ݒ肷��
          struct.setPLANT_CD(getsysPLANT_CD());
       
          // �i�ڒI���T�C�N���̎��H��̃f�[�^�S�폜
          entity.mT_INV_CYCLE.delete(conn, struct);
       
          // �f�[�^�������������J��Ԃ�
          intCsvDataCount = listCsv.size();
          for(int i = 0; i < intCsvDataCount; i++)
          {
           // CSV���擾
           struct.copy((AH0010020Struct)listCsv.get(i));
       
           // �i�ڒI���T�C�N���f�[�^�̑��݃`�F�b�N
           List cycle_list = entity.mT_INV_CYCLE.read(conn, struct);
           
           if(cycle_list.size() <= 0)
           {
        	   // �i�ڒI���T�C�N���o�^
               entity.mT_INV_CYCLE.create(conn, struct);
           } else{
        	   // �i�ڒI���T�C�N���X�V
        	   entity.mT_INV_CYCLE.update(conn, struct);
           }
           
          } // for()
       
          // �R�~�b�g
          conn.commit();
       
          // DB�X�V���t���OOFF
          bDBUpdate = false;
       
          // ���������t���O�ݒ�
          bSuccess = true;
       
         } catch(SQLException e) {
          logMessage = "T_INV_CYCLE.ITEM_CD:" +  struct.getw_ITEM_CD()
             + ", T_INV_CYCLE.PLANT_CD:" +  struct.getPLANT_CD();
          ExpjMessage emsg = new ExpjMessage( "ZZ01006", logMessage );
          sysLog.severe(emsg, getsysUSER_CD());
          setSqlExceptionMsg(e);
       
         } finally {
          // DB�X�V�������ɉ��炩�̃G���[�����������ꍇ��roolback�������Ȃ�
          if(bDBUpdate == true)
          {
           // ���[���o�b�N
           conn.rollback();
           logMessage = "Control�FcsvData2Db - rollback!! ";
           setSyslogConfig(logMessage);
       
           // �������O��struct��񕜋A
           struct.copy(structCopy);
       
           // �X�V���s�̃��b�Z�[�W�\��
           ExpjMessage emsg = new ExpjMessage( "AH00042", ""+intCsvDataCount, "0");
           msgStruct.addError( emsg );
           sysLog.warning(emsg, getsysUSER_CD());
       
          }
       
          if(bSuccess == true)
          {
           // ����I���̃��b�Z�[�W�\��
           ExpjMessage emsg = new ExpjMessage( "AH60005", ""+intCsvDataCount, "0");
           msgStruct.addInfo( emsg );
           sysLog.config(emsg, getsysUSER_CD());
          }
         }
         return bSuccess;
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0010");
		logger.entering("AH0010020Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
                //------------------------------------------------------------------
                // ���O�o�͏��i�[�p
                String logMessage = "";
                List listMessage = new ArrayList();
              
                // �Ǎ����������t���O������
                boolean bSuccess = false;
              
                try {
                 // �G���[�t���O������
                 boolean bError = false;
              
                 // ��ʕ\�����N���A
                 this.struct.init();
              
                 // ���͂��ꂽ�i�ڔԍ������݂��邩�ǂ����̃`�F�b�N
                 List item_list = entity.mM_ITEM.read(conn, struct);
                 if(item_list.size() <= 0)
                 {
                  listMessage.add("M_ITEM.ITEM_CD:" + struct.getw_ITEM_CD());
                  setErrorMessage("AH00002", listMessage);
                  listMessage.clear();
                  bError = true;	// �G���[�t���O�ݒ�
                 }
                 else
                 {
                  AH0010020Struct read_struct = new AH0010020Struct();
                  
                  // �Ǎ��񂾃f�[�^���擾
                  read_struct = (AH0010020Struct)item_list.get(0);
                  
                  // �i�ږ���ݒ�
                  struct.setw_ITEM_NAME(read_struct.getw_ITEM_NAME());
                  
                  // �}�ʔԍ���ݒ�
                  struct.setw_DRAW_CD(read_struct.getw_DRAW_CD());
                  
                  // �K�i��ݒ�
                  struct.setw_SPEC(read_struct.getw_SPEC());
                  
                  // �i�ڎ�z�敪��ݒ�
                  struct.setw_MRP_ODR_TYP(getMRP_ODR_TYP_name(read_struct.getw_MRP_ODR_TYP()));
                  
                  // ���O��敪��ݒ�
                  struct.setw_OUTSIDE_TYP(getOUTSIDE_TYP_name(read_struct.getw_OUTSIDE_TYP()));
                  
                  // �I���敪��ݒ�
                  struct.setw_ABC_TYP(getABC_TYP_name(read_struct.getw_ABC_TYP()));
                  
                  // �[���i�ڂ͎w��s��
                  if(("8").equals(read_struct.getw_MRP_ODR_TYP()) == true)
                  {
                   listMessage.add("M_ITEM.ITEM_CD:" + struct.getw_ITEM_CD());
                   setErrorMessage("AH00028", listMessage);
                   listMessage.clear();
                   bError = true;	// �G���[�t���O�ݒ�
                  }
                  
                  // �I���敪=9(�I�����Ȃ�)�͎w��s��
                  if(("9").equals(read_struct.getw_ABC_TYP()) == true)
                  {
                   listMessage.add("M_ITEM.ITEM_CD:" + struct.getw_ITEM_CD());
                   setErrorMessage("AH00016", listMessage);
                   listMessage.clear();
                   bError = true;	// �G���[�t���O�ݒ�
                  }
                 }
              
                 // �G���[���Ȃ��ꍇ
                 if(bError != true)
                 {
                  // ���H��R�[�h��ݒ肷��
                  struct.setPLANT_CD(getsysPLANT_CD());
                  
                  // �i�ڕʒI���T�C�N�����f�[�^���擾
                  List cycle_list = entity.mT_INV_CYCLE.read(conn, struct);
                  
                  if(cycle_list.size() <= 0)
                  {
                   // �Ώۃf�[�^�����݂��܂���
                   listMessage.add("T_INV_CYCLE.ITEM_CD:" + struct.getw_ITEM_CD());
                   listMessage.add("T_INV_CYCLE.PLANT_CD:" + struct.getPLANT_CD());
                   setErrorMessage("AH00015", listMessage);
                   listMessage.clear();
                  }
                  else
                  {
                   AH0010020Struct read_struct = new AH0010020Struct();
                   
                   // �Ǎ��񂾃f�[�^���擾
                   read_struct = (AH0010020Struct)cycle_list.get(0);
                   
                   // �I�����{�t���O�i�P�`�P�Q���j��ݒ�
                   struct.seth_INV_FLG_JAN(read_struct.geth_INV_FLG_JAN());
                   struct.seth_INV_FLG_FEB(read_struct.geth_INV_FLG_FEB());
                   struct.seth_INV_FLG_MAR(read_struct.geth_INV_FLG_MAR());
                   struct.seth_INV_FLG_APR(read_struct.geth_INV_FLG_APR());
                   struct.seth_INV_FLG_MAY(read_struct.geth_INV_FLG_MAY());
                   struct.seth_INV_FLG_JUN(read_struct.geth_INV_FLG_JUN());
                   struct.seth_INV_FLG_JUL(read_struct.geth_INV_FLG_JUL());
                   struct.seth_INV_FLG_AUG(read_struct.geth_INV_FLG_AUG());
                   struct.seth_INV_FLG_SEP(read_struct.geth_INV_FLG_SEP());
                   struct.seth_INV_FLG_OCT(read_struct.geth_INV_FLG_OCT());
                   struct.seth_INV_FLG_NOV(read_struct.geth_INV_FLG_NOV());
                   struct.seth_INV_FLG_DEC(read_struct.geth_INV_FLG_DEC());
                   
                   // �X�V�`�F�b�N�̐ݒ�
                   struct.setMODIFY_COUNT(read_struct.getMODIFY_COUNT());
                   
                   // �Ǎ����������t���O�ݒ�
                   bSuccess = true;
                  }
                 }
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                } catch(Exception e){
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006" , "ProcessId:" + this.sp.getProcId() );
                 ee.add(emsg);
                 throw ee;
              
                } finally {
                 if(bSuccess == true)
                 {
                  setReadStatus(NORMAL);
              
                  // �Ǎ��������̃L�[����ޔ�
                  struct.seth_saveITEM_CD(struct.getw_ITEM_CD());
                 }
                 else
                 {
                  setReadStatus(INITIAL);
                 }
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AH0010020Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0010");
		logger.entering("AH0010020Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
                //------------------------------------------------------------------
                // ���O�o�͏��i�[�p
                String logMessage = "";
                List listMessage = new ArrayList();
              
                // DB�X�V���t���O������
                boolean bDBUpdate = false;
              
                try {
                 // �G���[�t���O������
                 boolean bError = false;
              
                 // ��ʕ\�����N���A
                 struct.setw_ITEM_NAME("");
                 struct.setw_DRAW_CD("");
                 struct.setw_SPEC("");
                 struct.setw_MRP_ODR_TYP("");
                 struct.setw_OUTSIDE_TYP("");
                 struct.setw_ABC_TYP("");
              
                 // ���͂��ꂽ�i�ڔԍ������݂��邩�ǂ����̃`�F�b�N
                 List item_list = entity.mM_ITEM.read(conn, struct);
                 if(item_list.size() <= 0)
                 {
                  listMessage.add("M_ITEM.ITEM_CD:" + struct.getw_ITEM_CD());
                  setErrorMessage("AH00002", listMessage);
                  listMessage.clear();
                  bError = true;	// �G���[�t���O�ݒ�
                 }
                 else
                 {
                  AH0010020Struct read_struct = new AH0010020Struct();
                  
                  // �Ǎ��񂾃f�[�^���擾
                  read_struct = (AH0010020Struct)item_list.get(0);
                  
                  // �i�ږ���ݒ�
                  struct.setw_ITEM_NAME(read_struct.getw_ITEM_NAME());
                  
                  // �}�ʔԍ���ݒ�
                  struct.setw_DRAW_CD(read_struct.getw_DRAW_CD());
                  
                  // �K�i��ݒ�
                  struct.setw_SPEC(read_struct.getw_SPEC());
                  
                  // �i�ڎ�z�敪��ݒ�
                  struct.setw_MRP_ODR_TYP(getMRP_ODR_TYP_name(read_struct.getw_MRP_ODR_TYP()));
                  
                  // ���O��敪��ݒ�
                  struct.setw_OUTSIDE_TYP(getOUTSIDE_TYP_name(read_struct.getw_OUTSIDE_TYP()));
                  
                  // �I���敪��ݒ�
                  struct.setw_ABC_TYP(getABC_TYP_name(read_struct.getw_ABC_TYP()));
                  
                  // �[���i�ڂ͎w��s��
                  if(("8").equals(read_struct.getw_MRP_ODR_TYP()) == true)
                  {
                   listMessage.add("M_ITEM.ITEM_CD:" + struct.getw_ITEM_CD());
                   setErrorMessage("AH00028", listMessage);
                   listMessage.clear();
                   bError = true;	// �G���[�t���O�ݒ�
                  }
                  
                  // �I���敪=9(�I�����Ȃ�)�͎w��s��
                  if(("9").equals(read_struct.getw_ABC_TYP()) == true)
                  {
                   listMessage.add("M_ITEM.ITEM_CD:" + struct.getw_ITEM_CD());
                   setErrorMessage("AH00016", listMessage);
                   listMessage.clear();
                   bError = true;	// �G���[�t���O�ݒ�
                  }
                 }
              
                 // �G���[���Ȃ��ꍇ
                 if(bError != true)
                 {
                  // �g�����U�N�V�����J�n
                  conn.beginTransWeb();
              
                  // DB�X�V���t���OON
                  bDBUpdate = true;
                  
                  // ���H��R�[�h��ݒ肷��
                  struct.setPLANT_CD(getsysPLANT_CD());
                  
                  // �X�V�`�F�b�N�̊m�F
                  List m_list = entity.mT_INV_CYCLE4Update.read(conn, struct);
                  if(m_list.size() <= 0){
                   // �w��L�[�̃f�[�^�����݂��܂���
                   listMessage.add("T_INV_CYCLE.ITEM_CD:" + struct.getw_ITEM_CD());
                   listMessage.add("T_INV_CYCLE.PLANT_CD:" + struct.getPLANT_CD());
                   setErrorMessage("ZZ01101", listMessage);
                   listMessage.clear();
                   bError = true;	// �G���[�t���O�ݒ�
                  }
                  else{
                   String modify = ((AH0010020Struct)m_list.get(0)).getMODIFY_COUNT();
              
                   if (struct.getMODIFY_COUNT().equals(modify) == false)
                   {
                    // �X�V�񐔂��Ǎ����ƈႤ���ߍX�V�ł��܂���
                    listMessage.add("T_INV_CYCLE.ITEM_CD:" + struct.getw_ITEM_CD());
                    listMessage.add("T_INV_CYCLE.PLANT_CD:" + struct.getPLANT_CD());
                    setErrorMessage("ZZ01105", listMessage);
                    listMessage.clear();
                    bError = true;	// �G���[�t���O�ݒ�
                   }
                  }
                 }
                 
                 // �G���[���������Ă��Ȃ��ꍇ�A�X�V�������{
                 if(bError != true)
                 {
                  // �X�V
                  entity.mT_INV_CYCLE.update(conn, struct);
                  
                  // �R�~�b�g
                  conn.commit();
              
                  // DB�X�V���t���OOFF
                  bDBUpdate = false;
                  
                  // �ēǍ�����
                  controlselect();
                 }
                 
                } catch(SQLException e) {
                 logMessage = "T_INV_CYCLE.ITEM_CD:" +  struct.getw_ITEM_CD()
                    + ", T_INV_CYCLE.PLANT_CD:" +  struct.getPLANT_CD();
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", logMessage );
                 sysLog.severe(emsg, getsysUSER_CD());
                 setSqlExceptionMsg(e);
              
                } catch(Exception e){
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006" , "ProcessId:" + this.sp.getProcId() );
                 ee.add(emsg);
                 throw ee;
              
                } finally{
                 // DB�X�V�������ɉ��炩�̃G���[�����������ꍇ��roolback�������Ȃ�
                 if(bDBUpdate == true)
                 {
                  // ���[���o�b�N
                  conn.rollback();
                  logMessage = "Control�Fcontrolupdate - rollback!! ";
                  setSyslogConfig(logMessage);
              
                  // DB�X�V���t���OOFF
                  bDBUpdate = false;
                 }
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlupdate>
		logger.exiting("AH0010020Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0010");
		logger.entering("AH0010020Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
                //------------------------------------------------------------------
                // �N���A����
                this.struct.clear();
                this.struct.init();
              
                // �\�����X�g���N���A
                list.clear();
              
                setReadStatus(INITIAL);
              
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AH0010020Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * CSV�捞�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCsvImport() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0010");
		logger.entering("AH0010020Control"+":USER="+struct.getsUser_ID(),"controlCsvImport");
			//{{user_implement_dev:<controlCsvImport>
                //---------------------------------------------------------------------
                // ���X�g�N���A
                list.clear();
              
                // �e��ʂ�struct��ޔ�
                saveParentStruct();
              
                // �T�u1��ʏ�����
                struct.clear();
              
                // �T�u1��ʃG���[���X�g�N���A
                csvResultListClear();
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlCsvImport>
		logger.exiting("AH0010020Control"+":USER="+struct.getsUser_ID(),"controlCsvImport");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlreturn_sub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0010");
		logger.entering("AH0010020Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub1");
			//{{user_implement_dev:<controlreturn_sub1>
                //---------------------------------------------------------------------
                // �q��ʂɑJ�ڂ���O�̐e��ʂ�struct�𕜋A
                loadParentStruct();
              
                // �N���A����
                controlclear();
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlreturn_sub1>
		logger.exiting("AH0010020Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub1");

		return;
	}

	/**
	 * �Q�ƃ{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlBrowse() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0010");
		logger.entering("AH0010020Control"+":USER="+struct.getsUser_ID(),"controlBrowse");
			//{{user_implement_dev:<controlBrowse>
                //}}user_implement_dev:<controlBrowse>
		logger.exiting("AH0010020Control"+":USER="+struct.getsUser_ID(),"controlBrowse");

		return;
	}

	/**
	 * �捞�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCsvIn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0010");
		logger.entering("AH0010020Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");
			//{{user_implement_dev:<controlCsvIn>
                //---------------------------------------------------------------------
                // �G���[�t���O������
                boolean bError = false;
                // ��ʕ\���p�G���[���X�g�N���A
                csvResultListClear();
              
                // �b�r�u�f�[�^�擾
                List listCsv = readCsvData();
                if(listCsv == null)
                {
                 bError = true;
                }
              
                // �b�r�u�f�[�^�擾����
                if(bError != true)
                {
                 // �b�r�u�f�[�^���e�`�F�b�N
                 if(checkCsvData(listCsv) != true)
                 {
                  bError = true;
                 }
                }
              
                // �b�r�u�f�[�^���e�Ɉُ�Ȃ�
                if(bError != true)
                {
                 // �b�r�u�f�[�^���f
                 csvData2Db(listCsv);
                }
              
                if(getMessage().sizeError() <= 0)
                {
                 // �N���A����
                 controlclear();
                }
                else {
                 // ���X�g�ɃG���[���e�Z�b�g
                 setList(_listResultMessageCsv);
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlCsvIn>
		logger.exiting("AH0010020Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0010");
		logger.entering("AH0010020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AH0010020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0010");
		logger.entering("AH0010020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                //------------------------------------------------------------------
                try{
                 // �R���{�{�b�N�X�f�[�^�p��
                 ComboBox controller = new ComboBox(conn, sysUSER_CD);
              
                 //�I���敪
                 _ABC_TYP = controller.getData("ABC_TYP");
                 //�i�ڎ�z�敪
                 _MRP_ODR_TYP  = controller.getData("MRP_ODR_TYP");
                 //���O�쐬�敪
                 _OUTSIDE_TYP = controller.getData("OUTSIDE_TYP");
              
                 // �N���A
                 controlclear();
              
                }catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                }catch(ComboException e){
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(e, emsg);
                 throw ee;
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AH0010020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0010");
		logger.entering("AH0010020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
                 // �R���{�{�b�N�X���i�̃f�[�^�̃Z�b�g�͂����ɋL�q���Ă��������B
                 // �R���{�{�b�N�X�f�[�^�p��
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AH0010020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("update") ) {
				controlupdate();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("CsvImport") ) {
				controlCsvImport();
			} else if( button.equals("return_sub1") ) {
				controlreturn_sub1();
			} else if( button.equals("Browse") ) {
				controlBrowse();
			} else if( button.equals("CsvIn") ) {
				controlCsvIn();
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
//			throw new FoundationException("AH0010020Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0010020-E999","CSV�̏o�͏���"));
			throw new FoundationException("AH0010020Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0010020-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AH0010020Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0010020-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AH0010020Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AH0010020Entity entity;
	protected AH0010020Struct struct;
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

		entity = new AH0010020Entity();
		struct = new AH0010020Struct();

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
	 * AH0010020�N���X�̕W���R���X�g���N�^
	 */
	public AH0010020Control() throws BusinessProcessException, FoundationException
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
				AH0010020Struct key = (AH0010020Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("h_INV_FLG_JAN") && key.geth_INV_FLG_JAN() != null) {
					msgKey.setKeyValue("h_INV_FLG_JAN", key.geth_INV_FLG_JAN());
				}
				if(msgKeyType.containsKeyColumn("h_INV_FLG_FEB") && key.geth_INV_FLG_FEB() != null) {
					msgKey.setKeyValue("h_INV_FLG_FEB", key.geth_INV_FLG_FEB());
				}
				if(msgKeyType.containsKeyColumn("h_INV_FLG_MAR") && key.geth_INV_FLG_MAR() != null) {
					msgKey.setKeyValue("h_INV_FLG_MAR", key.geth_INV_FLG_MAR());
				}
				if(msgKeyType.containsKeyColumn("h_INV_FLG_APR") && key.geth_INV_FLG_APR() != null) {
					msgKey.setKeyValue("h_INV_FLG_APR", key.geth_INV_FLG_APR());
				}
				if(msgKeyType.containsKeyColumn("h_INV_FLG_MAY") && key.geth_INV_FLG_MAY() != null) {
					msgKey.setKeyValue("h_INV_FLG_MAY", key.geth_INV_FLG_MAY());
				}
				if(msgKeyType.containsKeyColumn("h_INV_FLG_JUN") && key.geth_INV_FLG_JUN() != null) {
					msgKey.setKeyValue("h_INV_FLG_JUN", key.geth_INV_FLG_JUN());
				}
				if(msgKeyType.containsKeyColumn("h_INV_FLG_JUL") && key.geth_INV_FLG_JUL() != null) {
					msgKey.setKeyValue("h_INV_FLG_JUL", key.geth_INV_FLG_JUL());
				}
				if(msgKeyType.containsKeyColumn("h_INV_FLG_AUG") && key.geth_INV_FLG_AUG() != null) {
					msgKey.setKeyValue("h_INV_FLG_AUG", key.geth_INV_FLG_AUG());
				}
				if(msgKeyType.containsKeyColumn("h_INV_FLG_SEP") && key.geth_INV_FLG_SEP() != null) {
					msgKey.setKeyValue("h_INV_FLG_SEP", key.geth_INV_FLG_SEP());
				}
				if(msgKeyType.containsKeyColumn("h_INV_FLG_OCT") && key.geth_INV_FLG_OCT() != null) {
					msgKey.setKeyValue("h_INV_FLG_OCT", key.geth_INV_FLG_OCT());
				}
				if(msgKeyType.containsKeyColumn("h_INV_FLG_NOV") && key.geth_INV_FLG_NOV() != null) {
					msgKey.setKeyValue("h_INV_FLG_NOV", key.geth_INV_FLG_NOV());
				}
				if(msgKeyType.containsKeyColumn("h_INV_FLG_DEC") && key.geth_INV_FLG_DEC() != null) {
					msgKey.setKeyValue("h_INV_FLG_DEC", key.geth_INV_FLG_DEC());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_CD") && key.getw_ITEM_CD() != null) {
					msgKey.setKeyValue("w_ITEM_CD", key.getw_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
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
				if(msgKeyType.containsKeyColumn("w_ABC_TYP") && key.getw_ABC_TYP() != null) {
					msgKey.setKeyValue("w_ABC_TYP", key.getw_ABC_TYP());
				}
				if(msgKeyType.containsKeyColumn("ERR_ADR") && key.getERR_ADR() != null) {
					msgKey.setKeyValue("ERR_ADR", key.getERR_ADR());
				}
				if(msgKeyType.containsKeyColumn("ERR_MSG") && key.getERR_MSG() != null) {
					msgKey.setKeyValue("ERR_MSG", key.getERR_MSG());
				}
				if(msgKeyType.containsKeyColumn("c_INV_FLG_JAN") && key.getc_INV_FLG_JAN() != null) {
					msgKey.setKeyValue("c_INV_FLG_JAN", key.getc_INV_FLG_JAN());
				}
				if(msgKeyType.containsKeyColumn("c_INV_FLG_FEB") && key.getc_INV_FLG_FEB() != null) {
					msgKey.setKeyValue("c_INV_FLG_FEB", key.getc_INV_FLG_FEB());
				}
				if(msgKeyType.containsKeyColumn("c_INV_FLG_MAR") && key.getc_INV_FLG_MAR() != null) {
					msgKey.setKeyValue("c_INV_FLG_MAR", key.getc_INV_FLG_MAR());
				}
				if(msgKeyType.containsKeyColumn("c_INV_FLG_APR") && key.getc_INV_FLG_APR() != null) {
					msgKey.setKeyValue("c_INV_FLG_APR", key.getc_INV_FLG_APR());
				}
				if(msgKeyType.containsKeyColumn("c_INV_FLG_MAY") && key.getc_INV_FLG_MAY() != null) {
					msgKey.setKeyValue("c_INV_FLG_MAY", key.getc_INV_FLG_MAY());
				}
				if(msgKeyType.containsKeyColumn("c_INV_FLG_JUN") && key.getc_INV_FLG_JUN() != null) {
					msgKey.setKeyValue("c_INV_FLG_JUN", key.getc_INV_FLG_JUN());
				}
				if(msgKeyType.containsKeyColumn("c_INV_FLG_JUL") && key.getc_INV_FLG_JUL() != null) {
					msgKey.setKeyValue("c_INV_FLG_JUL", key.getc_INV_FLG_JUL());
				}
				if(msgKeyType.containsKeyColumn("c_INV_FLG_AUG") && key.getc_INV_FLG_AUG() != null) {
					msgKey.setKeyValue("c_INV_FLG_AUG", key.getc_INV_FLG_AUG());
				}
				if(msgKeyType.containsKeyColumn("c_INV_FLG_SEP") && key.getc_INV_FLG_SEP() != null) {
					msgKey.setKeyValue("c_INV_FLG_SEP", key.getc_INV_FLG_SEP());
				}
				if(msgKeyType.containsKeyColumn("c_INV_FLG_OCT") && key.getc_INV_FLG_OCT() != null) {
					msgKey.setKeyValue("c_INV_FLG_OCT", key.getc_INV_FLG_OCT());
				}
				if(msgKeyType.containsKeyColumn("c_INV_FLG_NOV") && key.getc_INV_FLG_NOV() != null) {
					msgKey.setKeyValue("c_INV_FLG_NOV", key.getc_INV_FLG_NOV());
				}
				if(msgKeyType.containsKeyColumn("c_INV_FLG_DEC") && key.getc_INV_FLG_DEC() != null) {
					msgKey.setKeyValue("c_INV_FLG_DEC", key.getc_INV_FLG_DEC());
				}
				if(msgKeyType.containsKeyColumn("h_saveITEM_CD") && key.geth_saveITEM_CD() != null) {
					msgKey.setKeyValue("h_saveITEM_CD", key.geth_saveITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("FileName") && key.getFileName() != null) {
					msgKey.setKeyValue("FileName", key.getFileName());
				}
				if(msgKeyType.containsKeyColumn("w_COLUMN_FLG") && key.getw_COLUMN_FLG() != null) {
					msgKey.setKeyValue("w_COLUMN_FLG", key.getw_COLUMN_FLG());
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
					AH0010020Struct key = new AH0010020Struct();
					if(msgKeyType.containsKeyColumn("h_INV_FLG_JAN")) {
						key.seth_INV_FLG_JAN(msgKey.getKeyValue("h_INV_FLG_JAN"));
					}
					if(msgKeyType.containsKeyColumn("h_INV_FLG_FEB")) {
						key.seth_INV_FLG_FEB(msgKey.getKeyValue("h_INV_FLG_FEB"));
					}
					if(msgKeyType.containsKeyColumn("h_INV_FLG_MAR")) {
						key.seth_INV_FLG_MAR(msgKey.getKeyValue("h_INV_FLG_MAR"));
					}
					if(msgKeyType.containsKeyColumn("h_INV_FLG_APR")) {
						key.seth_INV_FLG_APR(msgKey.getKeyValue("h_INV_FLG_APR"));
					}
					if(msgKeyType.containsKeyColumn("h_INV_FLG_MAY")) {
						key.seth_INV_FLG_MAY(msgKey.getKeyValue("h_INV_FLG_MAY"));
					}
					if(msgKeyType.containsKeyColumn("h_INV_FLG_JUN")) {
						key.seth_INV_FLG_JUN(msgKey.getKeyValue("h_INV_FLG_JUN"));
					}
					if(msgKeyType.containsKeyColumn("h_INV_FLG_JUL")) {
						key.seth_INV_FLG_JUL(msgKey.getKeyValue("h_INV_FLG_JUL"));
					}
					if(msgKeyType.containsKeyColumn("h_INV_FLG_AUG")) {
						key.seth_INV_FLG_AUG(msgKey.getKeyValue("h_INV_FLG_AUG"));
					}
					if(msgKeyType.containsKeyColumn("h_INV_FLG_SEP")) {
						key.seth_INV_FLG_SEP(msgKey.getKeyValue("h_INV_FLG_SEP"));
					}
					if(msgKeyType.containsKeyColumn("h_INV_FLG_OCT")) {
						key.seth_INV_FLG_OCT(msgKey.getKeyValue("h_INV_FLG_OCT"));
					}
					if(msgKeyType.containsKeyColumn("h_INV_FLG_NOV")) {
						key.seth_INV_FLG_NOV(msgKey.getKeyValue("h_INV_FLG_NOV"));
					}
					if(msgKeyType.containsKeyColumn("h_INV_FLG_DEC")) {
						key.seth_INV_FLG_DEC(msgKey.getKeyValue("h_INV_FLG_DEC"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_CD")) {
						key.setw_ITEM_CD(msgKey.getKeyValue("w_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
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
					if(msgKeyType.containsKeyColumn("w_ABC_TYP")) {
						key.setw_ABC_TYP(msgKey.getKeyValue("w_ABC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ERR_ADR")) {
						key.setERR_ADR(msgKey.getKeyValue("ERR_ADR"));
					}
					if(msgKeyType.containsKeyColumn("ERR_MSG")) {
						key.setERR_MSG(msgKey.getKeyValue("ERR_MSG"));
					}
					if(msgKeyType.containsKeyColumn("c_INV_FLG_JAN")) {
						key.setc_INV_FLG_JAN(msgKey.getKeyValue("c_INV_FLG_JAN"));
					}
					if(msgKeyType.containsKeyColumn("c_INV_FLG_FEB")) {
						key.setc_INV_FLG_FEB(msgKey.getKeyValue("c_INV_FLG_FEB"));
					}
					if(msgKeyType.containsKeyColumn("c_INV_FLG_MAR")) {
						key.setc_INV_FLG_MAR(msgKey.getKeyValue("c_INV_FLG_MAR"));
					}
					if(msgKeyType.containsKeyColumn("c_INV_FLG_APR")) {
						key.setc_INV_FLG_APR(msgKey.getKeyValue("c_INV_FLG_APR"));
					}
					if(msgKeyType.containsKeyColumn("c_INV_FLG_MAY")) {
						key.setc_INV_FLG_MAY(msgKey.getKeyValue("c_INV_FLG_MAY"));
					}
					if(msgKeyType.containsKeyColumn("c_INV_FLG_JUN")) {
						key.setc_INV_FLG_JUN(msgKey.getKeyValue("c_INV_FLG_JUN"));
					}
					if(msgKeyType.containsKeyColumn("c_INV_FLG_JUL")) {
						key.setc_INV_FLG_JUL(msgKey.getKeyValue("c_INV_FLG_JUL"));
					}
					if(msgKeyType.containsKeyColumn("c_INV_FLG_AUG")) {
						key.setc_INV_FLG_AUG(msgKey.getKeyValue("c_INV_FLG_AUG"));
					}
					if(msgKeyType.containsKeyColumn("c_INV_FLG_SEP")) {
						key.setc_INV_FLG_SEP(msgKey.getKeyValue("c_INV_FLG_SEP"));
					}
					if(msgKeyType.containsKeyColumn("c_INV_FLG_OCT")) {
						key.setc_INV_FLG_OCT(msgKey.getKeyValue("c_INV_FLG_OCT"));
					}
					if(msgKeyType.containsKeyColumn("c_INV_FLG_NOV")) {
						key.setc_INV_FLG_NOV(msgKey.getKeyValue("c_INV_FLG_NOV"));
					}
					if(msgKeyType.containsKeyColumn("c_INV_FLG_DEC")) {
						key.setc_INV_FLG_DEC(msgKey.getKeyValue("c_INV_FLG_DEC"));
					}
					if(msgKeyType.containsKeyColumn("h_saveITEM_CD")) {
						key.seth_saveITEM_CD(msgKey.getKeyValue("h_saveITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("FileName")) {
						key.setFileName(msgKey.getKeyValue("FileName"));
					}
					if(msgKeyType.containsKeyColumn("w_COLUMN_FLG")) {
						key.setw_COLUMN_FLG(msgKey.getKeyValue("w_COLUMN_FLG"));
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
