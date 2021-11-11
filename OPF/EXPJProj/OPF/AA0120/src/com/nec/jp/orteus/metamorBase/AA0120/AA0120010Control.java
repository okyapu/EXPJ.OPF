/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0120/src/com/nec/jp/orteus/metamorBase/AA0120/AA0120010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0120;

import com.nec.jp.orteus.metamorBase.AA0120.*;
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
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlStruct;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import com.nec.jp.orteus.expj.mstappr.MstAppr;
import com.nec.jp.orteus.expj.mstappr.MstApprDetailStruct;
import com.nec.jp.orteus.expj.mstappr.MstApprKeyStruct;
import com.nec.jp.orteus.expj.mstappr.MstApprStruct;
import com.nec.jp.orteus.expj.mstappr.MstColumns;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AA0120010Control
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
        public AA0120010Struct getListvalue(int x) { return (AA0120010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
        public AA0120010Struct getStruct() { return this.struct; }	// Struct��Ԃ��܂��B
        public AA0120010Struct createStruct() { return new AA0120010Struct(); }	// �V����Struct������ĕԂ��܂��B
        public void setStruct(Object structname) { this.struct.setStruct((AA0120010Struct)structname); }	// Struct���Z�b�g���܂��B
        public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B
       
        // CSV�o�͗p���X�g
        private CsvWriter csvWriter = null;
        public CsvWriter getCsvWriter(){ return this.csvWriter; }
       
        private CsvReader csvReader = null;
        public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
        /** �u���E�U�ɕ\������JSP��URL */
        public String _nextUrl = null;
       
        private String businessOprDate;
        // �V�X�^���ݒ�l�擾 ---------------	
    	private PrivateConfig privateConfig;
    	public AA0120010Struct _keyStruct = new AA0120010Struct();
    	// �בփ��[�g���F�t���O
    	private String _APR_EXCH_RATE = null;
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
         * �u���E�U�ɕ\������JSP��URL��ݒ肵�܂��B
         * @param url �����JSP��URL
         */
        public void setNextUrl(String url) {
         _nextUrl = url;
        }
        /**
         * �u���E�U�ɕ\������JSP��URL���擾���܂��B
         */
        public String getNextUrl() {
         return _nextUrl;
        }
       
        /**
         * ���C����ʕ\���ɕK�v��Struct����ݒ肵�܂��B
         * @param s ��ʏ�������Struct
         */
        public void setStruct(AA0120010Struct s) {
         struct.setCUR_CD(s.getCUR_CD());
         struct.setCUR_NAME(s.getCUR_NAME());
       
         struct.setCUR_UNIT(s.getCUR_UNIT());
         struct.setCUR_SYMBOL(s.getCUR_SYMBOL());
         struct.setDECIMAL_FIG(s.getDECIMAL_FIG());
        }
       
        /**
         * �T�u��ʕ\���ɕK�v��Struct����ݒ肵�܂��B
         * @param s ��ʏ�������Struct
         */
        public void setStructForSub1(AA0120010Struct s) {
         // URL�̐ݒ�
         _nextUrl = "/AA0120011.jsp";
       
         struct.setCUR_NAME(s.getCUR_NAME());
         struct.setEXCH_TYP(s.getEXCH_TYP());
         struct.setEXCH_RESERVE_CD(s.getEXCH_RESERVE_CD());
         struct.setEXCH_START_DATE(s.getEXCH_START_DATE());
         struct.setEXCH_RATE(s.getEXCH_RATE());
         struct.setMODIFY_COUNT(s.getMODIFY_COUNT());
        }
       
        /**
         * �T�u��ʕ\���ɕK�v�ȏ�����Struct����ݒ肵�܂��B
         * @param s ��ʏ�������Struct
         */
        public void setDefaultStructForSub1(AA0120010Struct s) {
         // URL�̐ݒ�
         _nextUrl = "/AA0120011.jsp";
       
         struct.setCUR_NAME(s.getCUR_NAME());
         struct.setEXCH_TYP("1");
         struct.setEXCH_RESERVE_CD(null);
         struct.setEXCH_START_DATE(businessOprDate);
         struct.setEXCH_RATE("0.00");
         struct.setMODIFY_COUNT(null);
        }
       
        /**
         * ��ʂ̑S���ڂ����������܂��B
         */
        public void initializeAll() {
         struct.setCUR_CD(null);
         struct.setEXCH_RESERVE_CD_K(null);
         struct.setEXCH_START_DATE_K(null);
         struct.setEXCH_END_DATE_K(null);

         initializeDetail();
        }
       
        /**
         * ��ʂ̏ڍ׍��ڂ����������܂��B
         */
        public void initializeDetail() {
         struct.setCUR_NAME(null);
         struct.setCUR_UNIT(null);
         struct.setCUR_SYMBOL(null);
         struct.setDECIMAL_FIG("0");
         
         struct.setl_EXCH_TYP_DN(null);
         struct.setl_EXCH_TYP(null);
         struct.setl_EXCH_RESERVE_CD(null);
         struct.setl_EXCH_START_DATE(null);
         struct.setl_EXCH_RATE(null);
         list = null;
       
         readStatus = INITIAL;
        }
       
        /**
         * �N���C�A���g��̃}�X�N���ڂ̒l���N���A���܂��B
         */
        private void clearDisabledField() {
         if (!struct.getEXCH_TYP().equals("2")) {
          struct.setEXCH_RESERVE_CD(null);
         }
         
        }
        /** �R���{�{�b�N�X�f�[�^�擾�p�萔�@�ב֎�� */
        private final static String EXCH_TYP_PARAMETER_NAME= "EXCH_TYP"; 
       
        /** �R���{�{�b�N�X�f�[�^�擾�p�@�ב֎�� */
        private ComboStruct EXCH_TYP = null;
        
        private void othercomboTyp(AA0120010Struct aStruct) {
  
		 aStruct.setl_EXCH_TYP_DN(getDisplayName(EXCH_TYP, aStruct.getl_EXCH_TYP().toString()));
	  
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
		/**
		 * �}�X�^�L�[�̏W��
		 */
		private HashMap keyvalueMap = new HashMap();
		
		/**
		 * @return Returns the keyvalueMap.
		 */
		public HashMap getKeyvalueMap() {
			return keyvalueMap;
		}
		/**
		 * @param keyvalueMap The keyvalueMap to set.
		 */
		public void setKeyvalueMap(HashMap keyvalueMap) {
			this.keyvalueMap = keyvalueMap;
		}
		
    	/**
    	 * ��ʑJ�ڎ��A�L�[�̎擾
    	 *
    	 */
    	private void getKey(){	
    		struct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());	
    		struct.setCUR_CD(keyvalueMap.get("CUR_CD").toString());
    		struct.setEXCH_TYP(keyvalueMap.get("EXCH_TYP").toString());
    		if (keyvalueMap.get("EXCH_RESERVE_CD") != null) {
    			struct.setEXCH_RESERVE_CD(keyvalueMap.get("EXCH_RESERVE_CD").toString());
    		}
    		struct.setEXCH_START_DATE(keyvalueMap.get("EXCH_START_DATE").toString());
    	}  
    	//���ʂ̓��͒l�̍Đݒ�
        private void setMain(){
           struct.setEXCH_TYP_K(_keyStruct.getEXCH_TYP_K());
           struct.setEXCH_RESERVE_CD_K(_keyStruct.getEXCH_RESERVE_CD_K());
           struct.setEXCH_START_DATE_K(_keyStruct.getEXCH_START_DATE_K());
           struct.setEXCH_END_DATE_K(_keyStruct.getEXCH_END_DATE_K());
        }
		/**
		 * ��񃁃b�Z�[�W�ݒ�
		 * @param ���b�Z�[�W�ԍ�
		 * @param �o�̓��b�Z�[�W
		 */
		private void setInfoMessage(String messageno)
		{
			ExpjMessage emsg = new ExpjMessage( messageno );
			msgStruct.addInfo( emsg );
			sysLog.info(emsg, getsysUSER_CD());
		}
		/**
		 * ���F����o�^
		 * @param button
		 * @throws SQLException
		 */
	    private boolean insertAppr(String button) throws SQLException{   	
	    	/** ���F�˗����݃`�F�b�N */
			ArrayList keyValueList = new ArrayList();
			
			// �ϐ��ݒ�(��ЃR�[�h)
			MstColumns key1 = new MstColumns();
			key1.setColumnname("COMPANY_CD");
			key1.setColumnvalue(struct.getCOMPANY_CD());
			keyValueList.add(key1);			
			// �ϐ��ݒ�(�ʉ݃R�[�h)
			MstColumns key2 = new MstColumns();
			key2.setColumnname("CUR_CD");
			key2.setColumnvalue(struct.getCUR_CD());
			keyValueList.add(key2);
			// �ϐ��ݒ�(�ב֎��)
			MstColumns key3 = new MstColumns();
			key3.setColumnname("EXCH_TYP");
			key3.setColumnvalue(struct.getEXCH_TYP());
			keyValueList.add(key3);
            //�@�ϐ��ݒ�(�ב֗\��R�[�h)
			if (struct.getEXCH_RESERVE_CD() != null && !"".equals(struct.getEXCH_RESERVE_CD())) {
				MstColumns key4 = new MstColumns();
				key4.setColumnname("EXCH_RESERVE_CD");
				key4.setColumnvalue(struct.getEXCH_RESERVE_CD());
				keyValueList.add(key4);			
			}
            //�@�ϐ��ݒ�(�ב֊J�n���t)						
			MstColumns key5 = new MstColumns();
			key5.setColumnname("EXCH_START_DATE");
			key5.setColumnvalue(struct.getEXCH_START_DATE());
			keyValueList.add(key5);
			
			MstAppr mstappr = new MstAppr(this.conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"AA0120010","AA0120010Servlet");
			// ���F�˗����݃`�F�b�N
			boolean rtnFlg = mstappr.checkMST_APPR("M_EXCH_RATE", keyValueList);
			if(rtnFlg) {
				// �L�[�����݂��Ă���
				ExpjMessage emsg = new ExpjMessage("KA00125");
				msgStruct.addError(emsg); // ���[�j���O���b�Z�[�W�Ƃ��ēo�^
				sysLog.warning(emsg, getsysUSER_CD()); // �G���[���e
				setStructForSub1(struct);
				return false;
			}
			
	    	/** ���F�˗��\�֓o�^�@*/
	    	MstApprStruct mstApprStruct = new MstApprStruct();
	    	// ���URL
	    	mstApprStruct.setSCREEN_URL("AA0120010Servlet");
	    	// �H��R�[�h
	    	mstApprStruct.setPLANT_CD(getsysPLANT_CD());
	    	// �����敪
	    	mstApprStruct.setPROC_TYP(button);
	    	// ���F���l
	    	mstApprStruct.setAPPR_REMARKS(struct.getAPPR_REMARKS());   	
	    	// ���F���(���F�҂�)
	    	mstApprStruct.setSTATUS("1");
	    	// �˗���
	    	mstApprStruct.setREQUEST_BY(struct.getsUser_ID());
	    	// �F�˗��\�Ƀf�[�^��ǉ�
	    	String appr_ID = mstappr.insertMST_APPR(mstApprStruct);
	    	
	    	
	    	/** ���F�L�[�֓o�^ */
	    	MstApprKeyStruct keyStruct = new MstApprKeyStruct();
	    	// ���FID
	    	keyStruct.setAPPR_ID(appr_ID);
	    	// �e�[�u����
	    	keyStruct.setTABLE_NAME("M_EXCH_RATE");
	    	// �L�[��(��ЃR�[�h)
	    	keyStruct.setKEY_NAME("COMPANY_CD");
	    	// �L�[�l(��ЃR�[�h)
	    	keyStruct.setKEY_VALUE(struct.getCOMPANY_CD());
	    	// ���F�L�[�Ή��\�Ƀ}�X�^�̃L�[(��ЃR�[�h)��ǉ�����
	    	mstappr.insertMST_APPR_KEY(keyStruct);
	    	
	    	// �L�[��(�ʉ݃R�[�h)
	    	keyStruct.setKEY_NAME("CUR_CD");
	    	// �L�[�l(�ʉ݃R�[�h)
	    	keyStruct.setKEY_VALUE(struct.getCUR_CD());
	    	// ���F�L�[�Ή��\�Ƀ}�X�^�̃L�[(EXCH_RATE)��ǉ�����
	    	mstappr.insertMST_APPR_KEY(keyStruct);
	    	
	    	// �L�[��(�ב֎��)
	    	keyStruct.setKEY_NAME("EXCH_TYP");
	    	// �L�[�l(�ב֎��)
	    	keyStruct.setKEY_VALUE(struct.getEXCH_TYP());
	    	// ���F�L�[�Ή��\�Ƀ}�X�^�̃L�[(�ב֎��)��ǉ�����
	    	mstappr.insertMST_APPR_KEY(keyStruct);
	    	if (struct.getEXCH_RESERVE_CD() != null && !"".equals(struct.getEXCH_RESERVE_CD())) {
		    	// �L�[��(�ב֗\��R�[�h)
		    	keyStruct.setKEY_NAME("EXCH_RESERVE_CD");
		    	// �L�[�l(�ב֗\��R�[�h)
		    	keyStruct.setKEY_VALUE(struct.getEXCH_RESERVE_CD());
		    	// ���F�L�[�Ή��\�Ƀ}�X�^�̃L�[(�ב֗\��R�[�h)��ǉ�����
		    	mstappr.insertMST_APPR_KEY(keyStruct);		
			}

	    	
	    	// �L�[��(�ב֊J�n���t)
	    	keyStruct.setKEY_NAME("EXCH_START_DATE");
	    	// �L�[�l(�ב֊J�n���t)
	    	keyStruct.setKEY_VALUE(struct.getEXCH_START_DATE());
	    	// ���F�L�[�Ή��\�Ƀ}�X�^�̃L�[(�ב֊J�n���t)��ǉ�����
	    	mstappr.insertMST_APPR_KEY(keyStruct);
	    	
	    	/** ���F���ו\�֓o�^ */
			// ��ЃR�[�h
	    	String columnID = mstappr.getColumnID( "M_EXCH_RATE", "COMPANY_CD");
			mstappr.setDetailByColumnID(struct.getCOMPANY_CD(),columnID);	
			
			// �ʉ݃R�[�h
	    	columnID = mstappr.getColumnID( "M_EXCH_RATE", "CUR_CD");
			mstappr.setDetailByColumnID(struct.getCUR_CD(),columnID);	
			
			// �ב֎��
	    	columnID = mstappr.getColumnID( "M_EXCH_RATE", "EXCH_TYP");
			mstappr.setDetailByColumnID(struct.getEXCH_TYP(),columnID);	
			
			// �ב֗\��R�[�h
	    	columnID = mstappr.getColumnID( "M_EXCH_RATE", "EXCH_RESERVE_CD");
			mstappr.setDetailByColumnID(struct.getEXCH_RESERVE_CD(),columnID);	
			
			// �ב֊J�n���t
	    	columnID = mstappr.getColumnID( "M_EXCH_RATE", "EXCH_START_DATE");
			mstappr.setDetailByColumnID(struct.getEXCH_START_DATE(),columnID);	
			
			// �ב֏I�����t
	    	columnID = mstappr.getColumnID( "M_EXCH_RATE", "EXCH_END_DATE");
			mstappr.setDetailByColumnID(null,columnID);	
			
			// �בփ��[�g
	    	columnID = mstappr.getColumnID( "M_EXCH_RATE", "EXCH_RATE");
			mstappr.setDetailByColumnID(struct.getEXCH_RATE(),columnID);	
			
			// �쐬��
			columnID = mstappr.getColumnID("M_EXCH_RATE","CREATED_DATE");
			mstappr.setDetailByColumnID(mstappr.readSystemDateTime(),columnID);
			// �쐬��
			columnID = mstappr.getColumnID("M_EXCH_RATE","CREATED_BY");
			mstappr.setDetailByColumnID(this.getsysUSER_CD(),columnID);
			// �쐬�v���O������
			columnID = mstappr.getColumnID("M_EXCH_RATE","CREATED_PRG_NM");
			mstappr.setDetailByColumnID(this.getScreenId(),columnID);
			// �X�V��
			columnID = mstappr.getColumnID("M_EXCH_RATE","UPDATED_DATE");
			mstappr.setDetailByColumnID(mstappr.readSystemDateTime(),columnID);
			// �X�V��
			columnID = mstappr.getColumnID("M_EXCH_RATE","UPDATED_BY");
			mstappr.setDetailByColumnID(this.getsysUSER_CD(),columnID);
			// �X�V�v���O������
			columnID = mstappr.getColumnID("M_EXCH_RATE","UPDATED_PRG_NM");
			mstappr.setDetailByColumnID(this.getScreenId(),columnID);
			// �X�V��
			columnID = mstappr.getColumnID("M_EXCH_RATE","MODIFY_COUNT");
			mstappr.setDetailByColumnID("0",columnID);   	
			
			// ���F���ׂɃf�[�^��ǉ�����B
			mstappr.insertMST_APPR_DETAIL("M_EXCH_RATE",appr_ID);
	    	
			// ���F���˗����܂����B
			setInfoMessage("AZ00042");
			
			return true;
			
	    }			
		
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0120");
		logger.entering("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
	                try {
	                 initializeDetail();
	                 //��ʃL�[��ۑ�
	                 _keyStruct.setEXCH_TYP_K(struct.getEXCH_TYP_K());
	                 _keyStruct.setEXCH_RESERVE_CD_K(struct.getEXCH_RESERVE_CD_K());
	                 _keyStruct.setEXCH_START_DATE_K(struct.getEXCH_START_DATE_K());
	                 _keyStruct.setEXCH_END_DATE_K(struct.getEXCH_END_DATE_K());
	                 // �t�H�[����񌟍�
	                 List formList = entity.mForm.read(conn, struct);
	                 if (formList.isEmpty()) {
	                  setErrorMessage("AA10011");
	                  setErrorParameter("M_CUR", "CUR_CD", struct.getCUR_CD());
	                  return;
	                 }
	                 // �t�H�[�����ݒ� 
	                 setStruct((AA0120010Struct) formList.get(0));
	              
	                 // ���X�g�f�[�^����
	     			MstAppr mstappr = new MstAppr(this.conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"AA0120010","AA0120010Servlet");
	    			// ���F��ʂ́u���F��v�{�^������J�ڂ��鎞
	     		    List viewList = new ArrayList();
	     		    int maxLine = sp.getMaxLine(conn, 10);
	    			if("1".equals(struct.geth_APR_EXCH_RATE()) && "1".equals(struct.geth_SCREENMOVE_TYP())&& isScreenMove()){				
	    				viewList = mstappr.selectMST_APPR_DETAIL(struct.geth_APPR_ID());
	    				// �Ώی�����0�̏ꍇ
	                    if (viewList.isEmpty()) {
	                     readStatus = NOT_FOUND;
	                     return;
	                    }
	                    // �\���s�������l(SYS_SCREEN_PARM)�𒴂����ꍇ�G���[
	                    if ((maxLine != 0) && (viewList.size() > maxLine)) {
	                     setErrorMessage("ZZ01115", String.valueOf(maxLine));
	                     readStatus = TOO_MANY;
	                     return;
	                    }
	    			} else {
	    				//�ő�\���s��
		     			if(maxLine != 0) {
		     				struct.setROW_COUNT(String.valueOf(maxLine));
		     			} else {
		     				struct.setROW_COUNT(null);
		     			}
		     			viewList=entity.mViewCnt.read(conn, struct);
		     		    long rowCount = Long.parseLong(((AA0120010Struct)viewList.get(0)).getl_COUNT());
		     		   // �Ώی�����0�̏ꍇ
		    			if (rowCount==0) {
		    				//�ꗗ�\���N���A����
		    				if(list != null && list.size() > 0){
	                            list.clear();
	                        }
		    				setErrorMessage("ZZ06001");
		    				readStatus = NOT_FOUND;
		    				return;
		    			}
		    			// �\���s�������l(SYS_SCREEN_PARM)�𒴂����ꍇ�G���[
		    			if ((maxLine != 0)  && rowCount == maxLine+1) {
		    				setErrorMessage("ZZ01115", String.valueOf(maxLine));
		    				readStatus = TOO_MANY;
		    				if(list != null && list.size() > 0){
		    					list.clear();
		    				}
		    				return;
		    			}
	    			}
	    			if("1".equals(struct.geth_APR_EXCH_RATE()) && "1".equals(struct.geth_SCREENMOVE_TYP())&& isScreenMove()){				
	    				viewList = mstappr.selectMST_APPR_DETAIL(struct.geth_APPR_ID());   		
	    			}else{
	                   // ����̓Ǎ��Ə��F��ʂ́u���F�O�v�{�^������J�ڂ��鎞�A
	    				viewList = entity.mView.read(conn, struct);
	    			}
	                 // ���F��ʂ́u���F��v�{�^������J�ڂ��鎞
	 				if("1".equals(struct.geth_APR_EXCH_RATE()) && "1".equals(struct.geth_SCREENMOVE_TYP())&& isScreenMove()){
						MstApprDetailStruct tempStruct = (MstApprDetailStruct) viewList.get(0);
						String columnID;
						// �ʉ݃R�[�h
						columnID = mstappr.getColumnID( "M_EXCH_RATE", "CUR_CD");
						struct.setCUR_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
						// �ʉݖ�
						List curList = entity.mForm.read(conn,struct);
						if (!curList.isEmpty()) {
							struct.setCUR_NAME(((AA0120010Struct)curList.get(0)).getCUR_NAME());
						}
						// �ב֎��
						columnID = mstappr.getColumnID( "M_EXCH_RATE", "EXCH_TYP");
						struct.setEXCH_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));
						// �ב֗\��R�[�h
						columnID = mstappr.getColumnID( "M_EXCH_RATE", "EXCH_RESERVE_CD");
						struct.setEXCH_RESERVE_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
						// �ב֊J�n���t
						columnID = mstappr.getColumnID( "M_EXCH_RATE", "EXCH_START_DATE");
						struct.setEXCH_START_DATE(mstappr.getDetailByColumnID(tempStruct,columnID));		
						// �בփ��[�g
						columnID = mstappr.getColumnID( "M_EXCH_RATE", "EXCH_RATE");
						struct.setEXCH_RATE(mstappr.getDetailByColumnID(tempStruct,columnID));					
					} else {
						// ���F�O�̃f�[�^���擾
						if ("0".equals(struct.geth_SCREENMOVE_TYP())) {
							List rateList = entity.mM_EXCH_RATE.read(conn,struct);
							String exchRate = ((AA0120010Struct)rateList.get(0)).getEXCH_RATE();
							struct.setEXCH_RATE(exchRate);
						}  else {
							//�@���X�g�f�[�^�ݒ�
							setList(viewList);
							
							AA0120010Struct TempStruct;
							for (int i = 0; i < list.size(); i++) {
								TempStruct = (AA0120010Struct)list.get(i);
								//�R���{�{�b�N�X�̎擾
								othercomboTyp(TempStruct);
							}
							
						}
					}
	                 
	              
	                 readStatus = NORMAL;
	                 
	                } catch (SQLException e) {
	                 throw new ExpjException(e);
	                }
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �s�ǉ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlLineInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0120");
		logger.entering("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlLineInsert");
			//{{user_implement_dev:<controlLineInsert>
                try {
                 // �t�H�[����񌟍�
                 List formList = entity.mForm.read(conn, struct);
                 // �t�H�[����񂪑��݂��Ȃ��ꍇ�͊O���X�V�G���[
                 if (formList.isEmpty()) {
                  setErrorMessage("ZZ01105");
                  readStatus = ERROR;
                  return;
                 }
                 // �t�H�[�����ݒ� 
                 setStruct((AA0120010Struct) formList.get(0));
                 // �T�u�t�H�[�����ݒ�
                 setDefaultStructForSub1(struct);
              
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlLineInsert>
		logger.exiting("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlLineInsert");

		return;
	}

	/**
	 * �s�C���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlLineUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0120");
		logger.entering("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlLineUpdate");
			//{{user_implement_dev:<controlLineUpdate>
              
                try {
                // �T�u�t�H�[����񌟍�
                 List subformList = entity.mFormSub1.read(conn, struct);
                 // �T�u�t�H�[����񂪑��݂��Ȃ��ꍇ�̓G���[
                 if (subformList.isEmpty()) {
                  setErrorMessage("ZZ06001");
                  setDefaultStructForSub1(struct);
                  readStatus = ERROR;
                  return;
                 }
                
                 // �T�u�t�H�[�����ݒ�
                 setStructForSub1((AA0120010Struct) subformList.get(0));
              
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                
                //}}user_implement_dev:<controlLineUpdate>
		logger.exiting("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlLineUpdate");

		return;
	}

	/**
	 * �s���ʃ{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlLineCopy() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0120");
		logger.entering("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlLineCopy");
			//{{user_implement_dev:<controlLineCopy>
              
                try {
                 // �T�u�t�H�[����񌟍�
                 List subformList = entity.mFormSub1.read(conn, struct);
                 // �T�u�t�H�[����񂪑��݂��Ȃ��ꍇ�̓G���[
                 if (subformList.isEmpty()) {
                  setErrorMessage("ZZ06001");
                  setDefaultStructForSub1(struct);
                  readStatus = ERROR;
                  return;
                 }
                 // �T�u�t�H�[�����ݒ�
                 setStructForSub1((AA0120010Struct) subformList.get(0));
              
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                
                //}}user_implement_dev:<controlLineCopy>
		logger.exiting("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlLineCopy");

		return;
	}

	/**
	 * �s�폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlLineDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0120");
		logger.entering("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlLineDelete");
			//{{user_implement_dev:<controlLineDelete>
              
                try {
                 struct.setEXCH_TYP(struct.getl_EXCH_TYP());
                 struct.setEXCH_RESERVE_CD(struct.getl_EXCH_RESERVE_CD());
                 struct.setEXCH_START_DATE(struct.getl_EXCH_START_DATE());
              
                 // �}�X�^��񌟍�
                 List lockedList = entity.mM_EXCH_RATE_Lock.read(conn, struct);
                 // �폜����L�[�����݂��Ȃ��ꍇ�̓G���[�B
                 if (lockedList.isEmpty()) {
                  setErrorMessage("ZZ01105");
                  return;
                 } 
                 // �ǂݍ��ݎ���[�בփ��[�g]."�X�V��"�ƈقȂ�ꍇ�̓G���[
                 AA0120010Struct lockedStruct = (AA0120010Struct) lockedList.get(0);
                 if (!lockedStruct.getMODIFY_COUNT().equals(struct.getl_MODIFY_COUNT())) {
                  setErrorMessage("ZZ01105");
                  return;
                 }
       			
                 if("1".equals(struct.geth_APR_EXCH_RATE())){				
    				// ���F���̓o�^
    				boolean rtn = insertAppr("3");
    				if(!rtn) return;
    			} else {
    				// �}�X�^�폜
    				entity.mM_EXCH_RATE.delete(conn, struct);
    			}
              
                 // �ēǍ����s��
     			controlSelect();     				
              
                 conn.commit();
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
              
                //}}user_implement_dev:<controlLineDelete>
		logger.exiting("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlLineDelete");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0120");
		logger.entering("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
                
                // ��ʂ�������
                initializeAll();
              
                //}}user_implement_dev:<controlClear>
		logger.exiting("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0120");
		logger.entering("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
                try {
                 // �}�X�N���ڂ̒l���N���A����
                 clearDisabledField();
              
                 // [�ʉ�]�ɑ��݂��Ȃ��ꍇ�̓G���[
                 List formList = entity.mForm.read(conn, struct);
                 if (formList.isEmpty()) {
                  setErrorMessage("ZZ01105");
                  setErrorParameter("M_CUR", "CUR_CD", struct.getCUR_CD());
                  setStructForSub1(struct);
                  readStatus = ERROR;
                  return;
                 }
                 // [�בփ��[�g]�ɂ��łɑ��݂���ꍇ�̓G���[
                 if (entity.mM_EXCH_RATE.check(conn, struct)) {
                  setErrorMessage("ZZ01102");
                  setErrorParameter("M_EXCH_RATE", "COMPANY_CD", struct.getCOMPANY_CD());
                  setErrorParameter("M_EXCH_RATE", "CUR_CD", struct.getCUR_CD());
                  setErrorParameter("M_EXCH_RATE", "EXCH_TYP", struct.getEXCH_TYP());
                  setErrorParameter("M_EXCH_RATE", "EXCH_RESERVE_CD", struct.getEXCH_RESERVE_CD());
                  setErrorParameter("M_EXCH_RATE", "EXCH_START_DATE", struct.getEXCH_START_DATE());
                  setStructForSub1(struct);
                  return;							
                 }
     			if("1".equals(struct.geth_APR_EXCH_RATE())){				
    				// ���F���̓o�^
    				boolean rtn = insertAppr("1");
    				if(!rtn) return;

                    // �t�H�[����񌟍�
                    formList = entity.mForm.read(conn, struct);
                    if(formList != null && formList.size() > 0){
                        // �t�H�[�����ݒ� 
                        setStruct((AA0120010Struct) formList.get(0));
                    }
    			} else {
    				// �}�X�^�o�^
    				entity.mM_EXCH_RATE.create(conn, struct);
    			}
              
                 // �ēǍ����s��
     			if(!"1".equals(struct.geth_APR_EXCH_RATE())){
     				setMain();
     				controlSelect();     				
     			}
                               
                 conn.commit();
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
                //}}user_implement_dev:<controlInsert>
		logger.exiting("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0120");
		logger.entering("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
                
                try {
                 // �}�X�N���ڂ̒l���N���A����
                 clearDisabledField();
              
                 // �}�X�^��񌟍�
                 List lockedList = entity.mM_EXCH_RATE_Lock.read(conn, struct);
                 // �X�V����L�[�����݂��Ȃ��ꍇ�̓G���[�B
                 if (lockedList.isEmpty()) {
                  setErrorMessage("ZZ01105");
                  setStructForSub1(struct);
                  readStatus = ERROR;
                  return;
                 } 
                 // �ǂݍ��ݎ���[�בփ��[�g]."�X�V��"�ƈقȂ�ꍇ�̓G���[
                 AA0120010Struct lockedStruct = (AA0120010Struct) lockedList.get(0);
                 if (!lockedStruct.getMODIFY_COUNT().equals(struct.getMODIFY_COUNT())) {
                  setErrorMessage("ZZ01105");
                  setStructForSub1(struct);
                  readStatus = ERROR;
                  return;
                 }
              
      			if("1".equals(struct.geth_APR_EXCH_RATE())){				
    				// ���F���̓o�^
    				boolean rtn = insertAppr("2");
    				if(!rtn) return;

                    // �t�H�[����񌟍�
                    List formList = entity.mForm.read(conn, struct);
                    if(formList != null && formList.size() > 0){
                        // �t�H�[�����ݒ� 
                        setStruct((AA0120010Struct) formList.get(0));
                    }
    			} else {
    				// �}�X�^�X�V����
    				entity.mM_EXCH_RATE.update(conn, struct);
    			}
              
                 // �ēǍ����s��
     			if(!"1".equals(struct.geth_APR_EXCH_RATE())){
     				setMain();
     				controlSelect();     				
     			}
              
                 conn.commit();
              
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
                
                //}}user_implement_dev:<controlUpdate>
		logger.exiting("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlReturn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0120");
		logger.entering("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlReturn");
			//{{user_implement_dev:<controlReturn>
		
		       setMain();
               // �ēǍ����s��
               controlSelect();
              
                //}}user_implement_dev:<controlReturn>
		logger.exiting("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlReturn");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0120");
		logger.entering("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0120");
		logger.entering("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
              
                try {
                 // DB���[����]."��ЃR�[�h"���������A���݂��Ȃ��ꍇ�̓G���[
                 List companyList = entity.mSYS_MY_COMPANY.read(conn, struct);
                 if (companyList.isEmpty()) {
                  throw new ExpjException("ZZ06001");
                 } else {
                  AA0120010Struct compStruct = (AA0120010Struct) companyList.get(0);
                  struct.setCOMPANY_CD(compStruct.getCOMPANY_CD());
                 }
                 DateCtrlStruct dcs = DateCtrlControl.getData(conn, sysPLANT_CD);
                 businessOprDate = dcs.getBUSINESS_OPR_DATE();
				
                 privateConfig = new PrivateConfig(conn);
				// �בփ��[�g���F���擾
				String aprExchRate = privateConfig.getString("APR_EXCH_RATE");
				// �p�����[�^�u�בփ��[�g���F�v���Z�b�g
				if (aprExchRate == null || "".equals(aprExchRate)) {
					String locale = CoreTools.getLocale(struct.getsUser_ID());
					ResourceBundle messages = CoreTools.getResourceBundle("ExpjMessage", locale);
					ExpjMessage emsg = new ExpjMessage("AZ00041", messages.getString("AZ00048"));
					msgStruct.addError(emsg); // ���[�j���O���b�Z�[�W�Ƃ��ēo�^
					sysLog.warning(emsg, getsysUSER_CD()); // �G���[���e
					struct.seth_APR_EXCH_RATE("0");
				} else if (!"1".equals(aprExchRate)) {
					// �P�ȊO�̏ꍇ
					struct.seth_APR_EXCH_RATE("0");
				} else {
					struct.seth_APR_EXCH_RATE("1");
				}
				_APR_EXCH_RATE = struct.geth_APR_EXCH_RATE();
                // ��ʂ�������
                initializeAll();
				// �L�[���擾
    			if("1".equals(struct.geth_APR_EXCH_RATE()) && this.isScreenMove() && null != struct.geth_SCREENMOVE_TYP()){
    				getKey();
    			}

                } catch (SQLException e) {
                 throw new ExpjException(e);
                } catch (DataNotFoundException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0120");
		logger.entering("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
                
                ComboBox controller = new ComboBox(conn, sysUSER_CD);
                try {
			        ComboBox comboController = new ComboBox(conn, sysUSER_CD);
					ComboStruct combo = controller.getData("EXCH_TYP");
					struct.setList_EXCH_TYP_val(combo.getValList());
					struct.setList_EXCH_TYP_name(combo.getExplanList());
					struct.setList_EXCH_TYP_K_val(combo.getValList());
					struct.setList_EXCH_TYP_K_name(combo.getExplanList());
					EXCH_TYP = comboController.getData(EXCH_TYP_PARAMETER_NAME);	
					// �V�X�e���p�����[�^�@
					struct.seth_APR_EXCH_RATE(_APR_EXCH_RATE);
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } catch (ComboException e) {
                 throw new ExpjException(e);
                }
                controller.setConnection(null);
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AA0120010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("LineInsert") ) {
				controlLineInsert();
			} else if( button.equals("LineUpdate") ) {
				controlLineUpdate();
			} else if( button.equals("LineCopy") ) {
				controlLineCopy();
			} else if( button.equals("LineDelete") ) {
				controlLineDelete();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Insert") ) {
				controlInsert();
			} else if( button.equals("Update") ) {
				controlUpdate();
			} else if( button.equals("Return") ) {
				controlReturn();
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
//			throw new FoundationException("AA0120010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0120010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AA0120010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0120010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AA0120010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0120010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AA0120010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AA0120010Entity entity;
	protected AA0120010Struct struct;
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

		entity = new AA0120010Entity();
		struct = new AA0120010Struct();

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
	 * AA0120010�N���X�̕W���R���X�g���N�^
	 */
	public AA0120010Control() throws BusinessProcessException, FoundationException
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
				AA0120010Struct key = (AA0120010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("l_EXCH_TYP_DN") && key.getl_EXCH_TYP_DN() != null) {
					msgKey.setKeyValue("l_EXCH_TYP_DN", key.getl_EXCH_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP_name") && key.getEXCH_TYP_name() != null) {
					msgKey.setKeyValue("EXCH_TYP_name", key.getEXCH_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP_val") && key.getEXCH_TYP_val() != null) {
					msgKey.setKeyValue("EXCH_TYP_val", key.getEXCH_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("h_APPR_ID") && key.geth_APPR_ID() != null) {
					msgKey.setKeyValue("h_APPR_ID", key.geth_APPR_ID());
				}
				if(msgKeyType.containsKeyColumn("h_SCREENMOVE_TYP") && key.geth_SCREENMOVE_TYP() != null) {
					msgKey.setKeyValue("h_SCREENMOVE_TYP", key.geth_SCREENMOVE_TYP());
				}
				if(msgKeyType.containsKeyColumn("APPR_REMARKS") && key.getAPPR_REMARKS() != null) {
					msgKey.setKeyValue("APPR_REMARKS", key.getAPPR_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("h_APR_EXCH_RATE") && key.geth_APR_EXCH_RATE() != null) {
					msgKey.setKeyValue("h_APR_EXCH_RATE", key.geth_APR_EXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP_K_name") && key.getEXCH_TYP_K_name() != null) {
					msgKey.setKeyValue("EXCH_TYP_K_name", key.getEXCH_TYP_K_name());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP_K_val") && key.getEXCH_TYP_K_val() != null) {
					msgKey.setKeyValue("EXCH_TYP_K_val", key.getEXCH_TYP_K_val());
				}
				if(msgKeyType.containsKeyColumn("l_EXCH_TYP") && key.getl_EXCH_TYP() != null) {
					msgKey.setKeyValue("l_EXCH_TYP", key.getl_EXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_EXCH_RESERVE_CD") && key.getl_EXCH_RESERVE_CD() != null) {
					msgKey.setKeyValue("l_EXCH_RESERVE_CD", key.getl_EXCH_RESERVE_CD());
				}
				if(msgKeyType.containsKeyColumn("l_EXCH_START_DATE") && key.getl_EXCH_START_DATE() != null) {
					msgKey.setKeyValue("l_EXCH_START_DATE", key.getl_EXCH_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_EXCH_RATE") && key.getl_EXCH_RATE() != null) {
					msgKey.setKeyValue("l_EXCH_RATE", key.getl_EXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT") && key.getl_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("l_MODIFY_COUNT", key.getl_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("CUR_CD") && key.getCUR_CD() != null) {
					msgKey.setKeyValue("CUR_CD", key.getCUR_CD());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP_K") && key.getEXCH_TYP_K() != null) {
					msgKey.setKeyValue("EXCH_TYP_K", key.getEXCH_TYP_K());
				}
				if(msgKeyType.containsKeyColumn("EXCH_RESERVE_CD_K") && key.getEXCH_RESERVE_CD_K() != null) {
					msgKey.setKeyValue("EXCH_RESERVE_CD_K", key.getEXCH_RESERVE_CD_K());
				}
				if(msgKeyType.containsKeyColumn("EXCH_START_DATE_K") && key.getEXCH_START_DATE_K() != null) {
					msgKey.setKeyValue("EXCH_START_DATE_K", key.getEXCH_START_DATE_K());
				}
				if(msgKeyType.containsKeyColumn("EXCH_END_DATE_K") && key.getEXCH_END_DATE_K() != null) {
					msgKey.setKeyValue("EXCH_END_DATE_K", key.getEXCH_END_DATE_K());
				}
				if(msgKeyType.containsKeyColumn("CUR_NAME") && key.getCUR_NAME() != null) {
					msgKey.setKeyValue("CUR_NAME", key.getCUR_NAME());
				}
				if(msgKeyType.containsKeyColumn("CUR_UNIT") && key.getCUR_UNIT() != null) {
					msgKey.setKeyValue("CUR_UNIT", key.getCUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("CUR_SYMBOL") && key.getCUR_SYMBOL() != null) {
					msgKey.setKeyValue("CUR_SYMBOL", key.getCUR_SYMBOL());
				}
				if(msgKeyType.containsKeyColumn("DECIMAL_FIG") && key.getDECIMAL_FIG() != null) {
					msgKey.setKeyValue("DECIMAL_FIG", key.getDECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP") && key.getEXCH_TYP() != null) {
					msgKey.setKeyValue("EXCH_TYP", key.getEXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("EXCH_RESERVE_CD") && key.getEXCH_RESERVE_CD() != null) {
					msgKey.setKeyValue("EXCH_RESERVE_CD", key.getEXCH_RESERVE_CD());
				}
				if(msgKeyType.containsKeyColumn("EXCH_START_DATE") && key.getEXCH_START_DATE() != null) {
					msgKey.setKeyValue("EXCH_START_DATE", key.getEXCH_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("EXCH_RATE") && key.getEXCH_RATE() != null) {
					msgKey.setKeyValue("EXCH_RATE", key.getEXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
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
					AA0120010Struct key = new AA0120010Struct();
					if(msgKeyType.containsKeyColumn("l_EXCH_TYP_DN")) {
						key.setl_EXCH_TYP_DN(msgKey.getKeyValue("l_EXCH_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP_name")) {
						key.setEXCH_TYP_name(msgKey.getKeyValue("EXCH_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP_val")) {
						key.setEXCH_TYP_val(msgKey.getKeyValue("EXCH_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("h_APPR_ID")) {
						key.seth_APPR_ID(msgKey.getKeyValue("h_APPR_ID"));
					}
					if(msgKeyType.containsKeyColumn("h_SCREENMOVE_TYP")) {
						key.seth_SCREENMOVE_TYP(msgKey.getKeyValue("h_SCREENMOVE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("APPR_REMARKS")) {
						key.setAPPR_REMARKS(msgKey.getKeyValue("APPR_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("h_APR_EXCH_RATE")) {
						key.seth_APR_EXCH_RATE(msgKey.getKeyValue("h_APR_EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP_K_name")) {
						key.setEXCH_TYP_K_name(msgKey.getKeyValue("EXCH_TYP_K_name"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP_K_val")) {
						key.setEXCH_TYP_K_val(msgKey.getKeyValue("EXCH_TYP_K_val"));
					}
					if(msgKeyType.containsKeyColumn("l_EXCH_TYP")) {
						key.setl_EXCH_TYP(msgKey.getKeyValue("l_EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_EXCH_RESERVE_CD")) {
						key.setl_EXCH_RESERVE_CD(msgKey.getKeyValue("l_EXCH_RESERVE_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_EXCH_START_DATE")) {
						key.setl_EXCH_START_DATE(msgKey.getKeyValue("l_EXCH_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_EXCH_RATE")) {
						key.setl_EXCH_RATE(msgKey.getKeyValue("l_EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT")) {
						key.setl_MODIFY_COUNT(msgKey.getKeyValue("l_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("CUR_CD")) {
						key.setCUR_CD(msgKey.getKeyValue("CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP_K")) {
						key.setEXCH_TYP_K(msgKey.getKeyValue("EXCH_TYP_K"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_RESERVE_CD_K")) {
						key.setEXCH_RESERVE_CD_K(msgKey.getKeyValue("EXCH_RESERVE_CD_K"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_START_DATE_K")) {
						key.setEXCH_START_DATE_K(msgKey.getKeyValue("EXCH_START_DATE_K"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_END_DATE_K")) {
						key.setEXCH_END_DATE_K(msgKey.getKeyValue("EXCH_END_DATE_K"));
					}
					if(msgKeyType.containsKeyColumn("CUR_NAME")) {
						key.setCUR_NAME(msgKey.getKeyValue("CUR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CUR_UNIT")) {
						key.setCUR_UNIT(msgKey.getKeyValue("CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("CUR_SYMBOL")) {
						key.setCUR_SYMBOL(msgKey.getKeyValue("CUR_SYMBOL"));
					}
					if(msgKeyType.containsKeyColumn("DECIMAL_FIG")) {
						key.setDECIMAL_FIG(msgKey.getKeyValue("DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP")) {
						key.setEXCH_TYP(msgKey.getKeyValue("EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_RESERVE_CD")) {
						key.setEXCH_RESERVE_CD(msgKey.getKeyValue("EXCH_RESERVE_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_START_DATE")) {
						key.setEXCH_START_DATE(msgKey.getKeyValue("EXCH_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_RATE")) {
						key.setEXCH_RATE(msgKey.getKeyValue("EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
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
