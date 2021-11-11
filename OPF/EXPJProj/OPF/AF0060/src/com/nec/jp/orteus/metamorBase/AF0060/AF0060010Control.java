/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0060/src/com/nec/jp/orteus/metamorBase/AF0060/AF0060010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AF0060;

import com.nec.jp.orteus.metamorBase.AF0060.*;
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
//-----------------------------------------------------------------------------
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.LotCtrl;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;

//import com.nec.jp.orteus.metamorBase.common01.RcvIssue.IssueProcess;
//import com.nec.jp.orteus.metamorBase.common01.RcvIssue.RcvProcess;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueProcess;
import com.nec.jp.orteus.expj.pr.rcvissue.process.RcvProcess;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;

import java.text.SimpleDateFormat;
import java.text.ParseException;

import java.math.BigDecimal;
//-----------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AF0060010Control
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
	    private String lotCtrl;
        protected List list;											// ���ʃ��X�g�̃C���X�^���X
        public List getList() { return this.list; }						// ���X�g��Ԃ��܂��B
        public void setList(List listname) { this.list = listname; }	// ���X�g���Z�b�g���܂��B
        public int getListsize() {										// ���X�g�^�̃T�C�Y��Ԃ��܂��B
         int nret = 0;
         if( this.list != null ) {nret = this.list.size();}
         return nret;
        }
       //	public Object getListvalue(int x) { return this.list.get(x); }	// ���X�g�̒l��Ԃ��܂��B
        public AF0060010Struct getListvalue(int x) { return (AF0060010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
        public AF0060010Struct getStruct() { return this.struct; }	// Struct��Ԃ��܂��B
        public AF0060010Struct createStruct() { return new AF0060010Struct(); }	// �V����Struct������ĕԂ��܂��B
        public void setStruct(Object structname) { this.struct.setStruct((AF0060010Struct)structname); }	// Struct���Z�b�g���܂��B
       //	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B
       
        // CSV�o�͗p���X�g
        private CsvWriter csvWriter = null;
        public CsvWriter getCsvWriter(){ return this.csvWriter; }
       
        private CsvReader csvReader = null;
        public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
       
       
       //------------------------------------------------------------------------
       
        /** ���[�U��`�̏������σt���O */
        private boolean _usersIntialized = false;
       
        /**
         * ���[�U��` ����������
         */
        private void usersInitialize() throws ExpjException
        {
       
         if(_usersIntialized) return;
       
         // �R���{�f�[�^�̎擾
         setComboData(struct);
       
         // ������Ԃ��u������ԁv�ɐݒ�
         setReadStatus(INITIAL);
       
         _usersIntialized = true;
         return ;
       
        }
       
       
       //---------- �R���{�{�b�N�X�f�[�^�擾�֘A�̏��� -------------------------------
       
        /** �o�Ɋ����t���O **/
        ComboStruct _TRANSPORT_CMPLT_TYP = null;
       
        /** �o�Ɋ����t���O�ݒ�
         * @param �R���{�{�b�N�X�f�[�^
        */
        public void setTRANSPORT_CMPLT_TYP(ComboStruct combo){ _TRANSPORT_CMPLT_TYP = combo; }
       
        /** �o�Ɋ����t���O�擾
         * @return �o�Ɋ����t���O�̃R���{�{�b�N�X�f�[�^
        */
        public ComboStruct getTRANSPORT_CMPLT_TYP(){ return _TRANSPORT_CMPLT_TYP; }
       
       
       //------------------------------------------------------------------------
        /**
         * �R���{�{�b�N�X�̒��g���擾���܂��B
         *
         * @param data �f�[�^�̔�
         */
         private void setComboData(AF0060010Struct data) throws ExpjException
         {
         // ���O�o�͏��i�[�p
         String logMessage = "";
         List listMessage = new ArrayList();
       
         ComboBox controller = new ComboBox(conn, sysUSER_CD);
         try{
          //�R���{�f�[�^�̎擾
          ComboStruct w_TRANSPORT_CMPLT_TYP_comb = controller.getData("TRANSPORT_CMPLT_TYP");
       
          controller.setConnection(null);
       
          //�����Ɏ擾�f�[�^�ݒ�
          setTRANSPORT_CMPLT_TYP(w_TRANSPORT_CMPLT_TYP_comb);
       
       
         }catch(SQLException e) {
          setSqlExceptionMsg(e);
       
         }catch(ComboException e){
          ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
          sysLog.severe(emsg, getsysUSER_CD());
          ExpjException ee = new ExpjException(e, emsg);
          throw ee;
         }
        }
       
       
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
       
       
       //-----------------------------------------------------------------------------
       
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
       
       //-----------------------------------------------------------------------------
       
           /** ��ʋ��ʒ�`�擾�N���X */
           ScreenParam _scParam = sp;
       
       
       //------------------------------------------------------------------------
        /**
         * SQLException�G���[���b�Z�[�W�ݒ�
         * @param SQLException
         * @param �o�̓G���[���b�Z�[�W
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
         * �G���[���b�Z�[�W�ݒ�
         * @param ���b�Z�[�W�ԍ�
         * @param �o�̓��b�Z�[�W
         * @param �u��������P
         */
        private void setErrorMessage(String messageno, String message, String value1)
        {
         ExpjMessage emsg = new ExpjMessage( messageno , value1 );
         msgStruct.addError( emsg );
         sysLog.warning(emsg, getsysUSER_CD());
        }
        
        /**
	 	* �Ɩ����W�b�N�̃G���[���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 	* @param code ���b�Z�[�W�R�[�h
	 	*/
        private void setErrorMessage(String code)
        {
        	ExpjMessage emsg = new ExpjMessage(code);
        	msgStruct.addError(emsg);
        	sysLog.warning(emsg, sysUSER_CD);
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
         * @param �o�̓��b�Z�[�W
         */
        private void setInfoMessage(String messageno, String message)
        {
         ExpjMessage emsg = new ExpjMessage( messageno );
         msgStruct.addInfo( emsg );
         sysLog.config(emsg, getsysUSER_CD());
         emsg = new ExpjMessage( "ZZ01006", message );
         msgStruct.addInfo( emsg );
         sysLog.config(emsg, getsysUSER_CD());
        }
         
        /**
         * ���O���b�Z�[�W�ݒ�
         * @param ���b�Z�[�W�ԍ�
         * @param �o�̓��b�Z�[�W
         */
        private void setSyslogConfig(String message)
        {
         ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
         sysLog.config(emsg, getsysUSER_CD());
        }
        
     /**
	 * ���ی����Ǘ��p�����[�^�̑Ώ۔N�����擾
	 */
	private BigDecimal getProcExecDate() throws BusinessProcessException, FoundationException {
		BigDecimal bd = null;
		try {
			struct.setPLANT_CD(getsysPLANT_CD());
			List procExecDateList = entity.mSELECT_SYS_ACTUAL_COST_CTRL_AC.read(conn, struct);
			if(procExecDateList == null || procExecDateList.isEmpty()) return null;
			AF0060010Struct procExecDateStruct = (AF0060010Struct) procExecDateList.get(0);
			bd = procExecDateStruct.getPROC_EXEC_DATE();
			struct.setPROC_EXEC_DATE(bd);
		}catch(Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}
		return bd;
	}
	
	// ���ی����̒��߂��������Ă�����t�ł͓��͂ł��܂���
	private String ProcExecDateError = "AE00160";
	
	/**
	 * �Ώ۔N�����Ɠ��͔N�����̔�r
	 * ���ی����̒��߂��������Ă�����t�ł̎��т̓o�^��s�Ƃ���
	 * ���ی����̒��߂��������Ă�����t���̎��я��̏C����s�Ƃ���
	 * @param  doType      �o�^�i'1'�j�܂��X�V�i'2'�j�܂��폜�i'3'�j
	 * @param  selOutDate  �X�V�O���͔N����
	 * @param  inputDate �@�X�V����͔N����
	 * @return boolean �@  �`�F�b�N�Ԃ��l
	 */
	private boolean chkProcExecDate(String doType,String selOutDate,String inputDate) throws BusinessProcessException, FoundationException {
		boolean b = true;
		
		// ���ی����Ǘ��p�����[�^�̑Ώ۔N����
		BigDecimal ProcExecDate = getProcExecDate();
		if(null == ProcExecDate) return b;
		ProcExecDateError = "AE00160";
		
		// �o�^�̏ꍇ
		if("1".equals(doType)){
			// ��ʓ��͔N����
			BigDecimal input = new BigDecimal(inputDate.substring(0,4) + inputDate.substring(5,7));
			b = compDecimal(input,ProcExecDate);
			
		}
		// �X�V�̏ꍇ
		if("2".equals(doType)){
			
			// �X�V�O���͔N����
			BigDecimal selOut = new BigDecimal(selOutDate.substring(0,4) + selOutDate.substring(5,7));
			// �X�V����͔N����
			BigDecimal input = new BigDecimal(inputDate.substring(0,4) + inputDate.substring(5,7));
			// �Ǎ��񂾎��я��̓��t�̔�r
			b = compDecimal(selOut,ProcExecDate);
			if(b == false){
				// ���ی����̒��߂��������Ă�����t���̎��я��͏C���ł��܂���
				ProcExecDateError = "AE00161";
				return b;
			}
			// ���͂̓��t�̔�r
			b = compDecimal(input,ProcExecDate);
			
		}
		// �폜�̏ꍇ
		if("3".equals(doType)){
			// �X�V�O���͔N����
			BigDecimal selOut = new BigDecimal(selOutDate.substring(0,4) + selOutDate.substring(5,7));
			// �Ǎ��񂾎��я��̓��t�̔�r
			b = compDecimal(selOut,ProcExecDate);
			// ���ی����̒��߂��������Ă�����t���̎��я��͏C���ł��܂���
			ProcExecDateError = "AE00161";
			
		}
		
		return b;
	}
	
	/**
	 * ��r
	 * @param  bd1      ���͈���1
	 * @param  bd2 �@   ���͈���2
	 * @return boolean  �`�F�b�N�Ԃ��l
	 */
	private boolean compDecimal(BigDecimal bd1,BigDecimal bd2){
		// bd1 >= bd2
		if(bd1.compareTo(bd2) >= 0) {
			return true;
		} else {
			return false;
		}
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
		param.append('.');
		param.append(columnName);
		param.append(':');
		if (value != null) {
			param.append(value);
		}

		ExpjMessage emsg = new ExpjMessage("ZZ01006", param.toString());
		msgStruct.addError(emsg);
		sysLog.warning(emsg, sysUSER_CD);
	}
       
       //-----------------------------------------------------------------------------
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0060");
		logger.entering("AF0060010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
                //-----------------------------------------------------------------------------
                // ���O�o�͏��i�[�p
                String logMessage = "";
                List listMessage = new ArrayList();
              
                // �Ǎ������`�F�b�N
                boolean checkSelect = false;		// �`�F�b�N���ʊi�[
                try {
                 boolean result = true;			// �`�F�b�N���ʊi�[
              
                 // ���X�g�N���A
                 if(list != null){
                  list.clear();
                 }
                 else {
                  list = new ArrayList(0);
                 }
              
                 // ��ʍ��ڃN���A
                 struct.setRCV_PLANT_NAME("");
                 struct.setRCV_WH_NAME("");
              
                 // �L�[���ڃ��O�\��
                 logMessage = "T_TRANSPORT_STOCK.RCV_WH_CD:" + struct.getRCV_WH_CD()
                    + ", T_TRANSPORT_STOCK.TRANSPORT_CMPLT_TYP:" + struct.getTRANSPORT_CMPLT_TYP();
                 setSyslogConfig(logMessage);
              
                 // ���ɕۊǋ���擾
                 List whList = entity.mselectRCV_WH.read(conn, struct);
                 if(whList.size() <= 0){
                  // ������Ԃ��u�Ǎ��O���v�ɐݒ�
                  setReadStatus(NOT_FOUND);
                  // �Ǎ��������s�F���ɕۊǋ�R�[�h�����݂��܂���
                  logMessage = "M_WH.WH_CD:" + struct.getRCV_WH_CD();
                  setErrorMessage("AF00034", logMessage);
                 }
                 else{
                  // �ۊǋ���ݒ�
                  AF0060010Struct whStruct = (AF0060010Struct)whList.get(0);
              
                  // �ۊǋ�̍H��R�[�h�`�F�b�N
                  if(struct.getw_PLANT_CD().equals(whStruct.getRCV_PLANT_CD()) == false){
                   // ������Ԃ��u�Ǎ��O���v�ɐݒ�
                   setReadStatus(NOT_FOUND);
                   // �Ǎ��������s�F�ۊǋ�R�[�h�͑��̍H��̃f�[�^�Ȃ̂Ŏw��ł��܂���
                   listMessage.add("M_WH.WH_CD:" + struct.getRCV_WH_CD());
                   listMessage.add("M_WH.PLANT_CD:" +  whStruct.getRCV_PLANT_CD());
                   setErrorMessage("AF00035", listMessage);
                   listMessage.clear();
                  }
              
                  struct.setRCV_PLANT_CD(whStruct.getRCV_PLANT_CD());
                  struct.setRCV_PLANT_NAME(whStruct.getRCV_PLANT_NAME());
                  struct.setRCV_WH_NAME(whStruct.getRCV_WH_NAME());
                 }
              
                 // �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
                 if(msgStruct.sizeError() <= 0)
                 {
                	 

				// �ő�\���s��
				ScreenParam sp = new ScreenParam(this.getClass());
				int maxLine = sp.getMaxLine(conn, 10);
				if (maxLine != 0)
					struct.setROW_COUNT(String.valueOf(maxLine));
				else
					struct.setROW_COUNT(null);

				list = entity.mselectCnt.read(conn, struct);
				long rowCount = Long.parseLong(((AF0060010Struct) list.get(0))
						.getl_COUNT());
                  
                  // ��������0���̏ꍇ
                  if(rowCount == 0){
                   // ������Ԃ��u�Ǎ��O���v�ɐݒ�
                   setReadStatus(NOT_FOUND);
                   // �Ǎ��������s�F�Y������ϑ��݌Ƀ��R�[�h�����݂��܂���
                   listMessage.add("T_TRANSPORT_STOCK.RCV_WH_CD:" + struct.getRCV_WH_CD());
                   listMessage.add("T_TRANSPORT_STOCK.TRANSPORT_CMPLT_TYP:" +  struct.getTRANSPORT_CMPLT_TYP());
                   setErrorMessage("ZZ06001", listMessage);
                   listMessage.clear();
                  if(list !=null &&list.size()>0){
                	  list.clear();
                  }
                   return;
                  } else {
                   // �\���ő�s����������
                   if(maxLine != 0 && rowCount ==  maxLine+1){
                    // ������Ԃ��u�ő�s���I�[�o�[�v�ɐݒ�
                    setReadStatus(TOO_MANY);
                    if(list !=null &&list.size()>0){
                  	  list.clear();
                    }
                     setErrorMessage("ZZ01115", "", ""+maxLine);
                     return;
                   }
                   else{    
                	   list = entity.mselect.read(conn, struct);
                    checkSelect = true;
                   }
                  }
                 }
              
                 // �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
                 if(msgStruct.sizeError() <= 0)
                 {
                  // �݌ɐ�������
                  for(int idx = 0; idx < this.getListsize(); idx++)
                  {
                   // �������ʂ�ێ�����struct
                   AF0060010Struct qtyStruct = new AF0060010Struct((AF0060010Struct)this.getListvalue(idx));
                   String s_num = new String("0.0");
              
                   if ("false".equals(lotCtrl)) {
                	   qtyStruct.setLOT_NO(null);
                   }
                   // �L�[���ڂ��Z�b�g
                   qtyStruct.setRCV_PLANT_CD(struct.getRCV_PLANT_CD());
                   qtyStruct.setRCV_WH_CD(struct.getRCV_WH_CD());
                   qtyStruct.setw_WH_STOCK_ON_HAND_QTY(s_num);
                   qtyStruct.setw_TOTAL_STOCK_ON_HAND_QTY(s_num);
              
                   List buffList = null;
                   AF0060010Struct buffStruct = null;
              
                   // �i�ڍ݌ɂ���o�ɂ���ꍇ
                   if(qtyStruct.getJOB_ODR_CD() == null || "".equals(qtyStruct.getJOB_ODR_CD()) == true){
                    // �ۊǋ�݌ɐ��擾
                    buffList = entity.mselectWH_ITEM_STOCK.read(conn, qtyStruct);
                    if(buffList.size() > 0)
                    {
                     buffStruct = (AF0060010Struct)buffList.get(0);
                     qtyStruct.setw_WH_STOCK_ON_HAND_QTY(buffStruct.getw_WH_STOCK_ON_HAND_QTY());
                    }
              
                    // �݌ɗ݌v���擾
                    buffList = entity.mselectTOTAL_ITEM_STOCK.read(conn, qtyStruct);
                    if(buffList.size() > 0)
                    {
                     buffStruct = (AF0060010Struct)buffList.get(0);
              
                     if(buffStruct.getw_TOTAL_STOCK_ON_HAND_QTY() != null &&
                      "".equals(buffStruct.getw_TOTAL_STOCK_ON_HAND_QTY()) == false)
                     {
                      qtyStruct.setw_TOTAL_STOCK_ON_HAND_QTY(buffStruct.getw_TOTAL_STOCK_ON_HAND_QTY());
                     }
                    }
                   }
                   // ���ԍ݌ɂ���o�ɂ���ꍇ
                   else{
                    // �ۊǋ�݌ɐ��擾
                    buffList = entity.mselectWH_JOB_ODR_CD_STOCK.read(conn, qtyStruct);
                    if(buffList.size() > 0)
                    {
                     buffStruct = (AF0060010Struct)buffList.get(0);
                     qtyStruct.setw_WH_STOCK_ON_HAND_QTY(buffStruct.getw_WH_STOCK_ON_HAND_QTY());
                    }
              
                    // �݌ɗ݌v���擾
                    buffList = entity.mselectTOTAL_JOB_ODR_CD_STOCK.read(conn, qtyStruct);
                    if(buffList.size() > 0)
                    {
                     buffStruct = (AF0060010Struct)buffList.get(0);
              
                     if(buffStruct.getw_TOTAL_STOCK_ON_HAND_QTY() != null &&
                      "".equals(buffStruct.getw_TOTAL_STOCK_ON_HAND_QTY()) == false)
                     {
                      qtyStruct.setw_TOTAL_STOCK_ON_HAND_QTY(buffStruct.getw_TOTAL_STOCK_ON_HAND_QTY());
                     }
                    }
                   }
                   // ���Ɏc�����v�Z �i�u�����v�̏ꍇ�� 0 ���Z�b�g�j
                   if(struct.getTRANSPORT_CMPLT_TYP().intValue() == 0){
                    Calculate calc = new Calculate();
                    qtyStruct.setw_LEAVE_RCV_QTY(calc.subtract(qtyStruct.getISSUE_QTY(), qtyStruct.getRCV_QTY()));
                   }else{
                    qtyStruct.setw_LEAVE_RCV_QTY(new String("0.0"));
                   }
              
                   // �������ʃ��X�g�ɒǉ�
                   list.set(idx, qtyStruct);
                  }
                 }
                 struct.sethid_TRANSPORT_CMPLT_TYP(struct.getTRANSPORT_CMPLT_TYP().toString());
              
                } catch(SQLException e) {
                 // ������Ԃ��u�Ǎ����s�v�ɐݒ�
                 setReadStatus(ERROR);
              
                 setSqlExceptionMsg(e);
              
                }finally{
                 // ���[�h�ݒ�
                 if(checkSelect == true){
                  // ������Ԃ��u�Ǎ������v�ɐݒ�
                  setReadStatus(NORMAL);
                 }
                }
                //-----------------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AF0060010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * �s�C���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlmodify() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0060");
		logger.entering("AF0060010Control"+":USER="+struct.getsUser_ID(),"controlmodify");
			//{{user_implement_dev:<controlmodify>
                //-----------------------------------------------------------------------------
                // ���O�o�͏��i�[�p
                String logMessage = "";
                List listMessage = new ArrayList();
              
                try {
                 boolean check = true;		// �`�F�b�N���ʊi�[
     			
                 // �i�ڏ��擾
     			List itemList = entity.mselectM_ITEM.read(conn, struct);
     			// �i�ڏ��ݒ�
     			AF0060010Struct itemStruct = (AF0060010Struct)itemList.get(0);
     			struct.seth_lotFlg(itemStruct.getLOT_CTRL_FLG());
     			if("true".equals(lotCtrl) && "1".equals(struct.geth_lotFlg())){
				    struct.setSTOCK_ON_HAND_QTY((String)"0.0");
				    struct.setDEFECT_QTY((String)"0.0");
				    struct.setALLOCABLE_QTY((String)"0.0");
     			}

                 // �L�[���ڂ�ێ�
                 AF0060010Struct keyStruct = new AF0060010Struct(struct);
              
                 // �L�[���ڂ��Z�b�g
                 struct.setRCV_PLANT_CD(keyStruct.getRCV_PLANT_CD());
                 struct.setRCV_PLANT_NAME(keyStruct.getRCV_PLANT_NAME());
                 struct.setRCV_WH_CD(keyStruct.getRCV_WH_CD());
                 struct.setRCV_WH_NAME(keyStruct.getRCV_WH_NAME());
              
                 // �L�[���ڃ��O�\��
                 logMessage = "T_TRANSPORT_STOCK.TRANSPORT_SLIP_CD:" + struct.getTRANSPORT_SLIP_CD()
                    + ", T_TRANSPORT_STOCK.JOB_ODR_CD:" + struct.getJOB_ODR_CD()
                    + ", T_TRANSPORT_STOCK.ITEM_CD:" + struct.getITEM_CD();
                 setSyslogConfig(logMessage);
              
                 // �݌ɐ��ʂ��Ď擾����
                 List qtyList = null;
                 AF0060010Struct qtyStruct = null;
              
                 String s_num = new String("0.0");
                 struct.setw_WH_STOCK_ON_HAND_QTY(s_num);
                 struct.setw_TOTAL_STOCK_ON_HAND_QTY(s_num);
              
                 // �i�ڍ݌ɂ���o�ɂ���ꍇ
                 if(struct.getJOB_ODR_CD() == null || "".equals(struct.getJOB_ODR_CD()) == true){
                  // �ۊǋ�݌ɐ��擾
                  qtyList = entity.mselectWH_ITEM_STOCK.read(conn, struct);
                  if(qtyList.size() > 0)
                  {
                   qtyStruct = (AF0060010Struct)qtyList.get(0);
                   struct.setw_WH_STOCK_ON_HAND_QTY(qtyStruct.getw_WH_STOCK_ON_HAND_QTY());
                  }
              
                  // �݌ɗ݌v���擾
                  qtyList = entity.mselectTOTAL_ITEM_STOCK.read(conn, struct);
                  if(qtyList.size() > 0)
                  {
                   qtyStruct = (AF0060010Struct)qtyList.get(0);
              
                   if(qtyStruct.getw_TOTAL_STOCK_ON_HAND_QTY() != null &&
                    "".equals(qtyStruct.getw_TOTAL_STOCK_ON_HAND_QTY()) == false)
                   {
                    struct.setw_TOTAL_STOCK_ON_HAND_QTY(qtyStruct.getw_TOTAL_STOCK_ON_HAND_QTY());
                   }
                  }
                 }
                 // ���ԍ݌ɂ���o�ɂ���ꍇ
                 else{
                  // �ۊǋ�݌ɐ��擾
                  qtyList = entity.mselectWH_JOB_ODR_CD_STOCK.read(conn, struct);
                  if(qtyList.size() > 0)
                  {
                   qtyStruct = (AF0060010Struct)qtyList.get(0);
                   struct.setw_WH_STOCK_ON_HAND_QTY(qtyStruct.getw_WH_STOCK_ON_HAND_QTY());
                  }
              
                  // �݌ɗ݌v���擾
                  qtyList = entity.mselectTOTAL_JOB_ODR_CD_STOCK.read(conn, struct);
                  if(qtyList.size() > 0)
                  {
                   qtyStruct = (AF0060010Struct)qtyList.get(0);
              
                   if(qtyStruct.getw_TOTAL_STOCK_ON_HAND_QTY() != null &&
                    "".equals(qtyStruct.getw_TOTAL_STOCK_ON_HAND_QTY()) == false)
                   {
                    struct.setw_TOTAL_STOCK_ON_HAND_QTY(qtyStruct.getw_TOTAL_STOCK_ON_HAND_QTY());
                   }
                  }
                 }
     			// ���b�g�ʍ݌ɂ̎擾
                if("true".equals(lotCtrl)){
                	if (struct.getLOT_NO() != null
         					&& !"".equals(struct.getLOT_NO())) {
         				List lotList = null;
         				AF0060010Struct lotStruct = new AF0060010Struct();
         				lotList = entity.mT_LOT_STOCK.read(conn, struct);
         				if (lotList.size() > 0) {
         					lotStruct = (AF0060010Struct)lotList.get(0);
         					struct.setSTOCK_ON_HAND_QTY(lotStruct.getSTOCK_ON_HAND_QTY());
         					struct.setDEFECT_QTY(lotStruct.getDEFECT_QTY());
         					struct.setALLOCABLE_QTY(lotStruct.getALLOCABLE_QTY());
         				}
         			}
               }
                 if(struct.getTRANSPORT_CMPLT_TYP().intValue() == 0){
                  // �����t���O��0:���̏ꍇ
                  // ���Ɏc�����K��l�ɐݒ�
                  struct.setRCV_ISSUE_QTY(struct.getw_LEAVE_RCV_QTY());
              
                  // �Ɩ��^�p���̎擾
                  List dateList = entity.mselectBUSINESS_OPR_DATE.read(conn, struct);
                  if(dateList.size() <= 0) {
                   // �s�C���������s�F�Ɩ��^�p�������݂��܂���
                   logMessage = "SYS_DATE_CTRL.PLANT_CD:" + struct.getRCV_PLANT_CD();
                   setErrorMessage("AF00056", logMessage);
                   check = false;
                  }
                  else{
                   AF0060010Struct dateStruct = (AF0060010Struct)dateList.get(0);
                   struct.setw_BUSINESS_OPR_DATE(dateStruct.getw_BUSINESS_OPR_DATE());
                   struct.setRCV_ISSUE_DATE(dateStruct.getw_BUSINESS_OPR_DATE());
                  }
                 }
                 else{
                  // �����t���O��1:�����̏ꍇ
                  // ���ɗ݌v�����K��l�ɐݒ�
                  struct.setRCV_ISSUE_QTY(struct.getRCV_QTY());
              
                  // ���ɓ����K��l�ɐݒ�
                  struct.setRCV_ISSUE_DATE(struct.getRCV_DATE());
                 }
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
                }
                //-----------------------------------------------------------------------------
                //}}user_implement_dev:<controlmodify>
		logger.exiting("AF0060010Control"+":USER="+struct.getsUser_ID(),"controlmodify");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0060");
		logger.entering("AF0060010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
                //------------------------------------------------------------------
                // ���X�g�N���A
                if(list != null){
                 list.clear();
                }
                else{
                 list = new ArrayList(0);
                }
              
                // ������
                struct.initialize();
              
                // ������Ԃ��u������ԁv�ɐݒ�
                setReadStatus(INITIAL);
              
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AF0060010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlinsertSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0060");
		logger.entering("AF0060010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");
			//{{user_implement_dev:<controlinsertSub1>
                //-----------------------------------------------------------------------------
                // ���O�o�͏��i�[�p
                String logMessage = "";
                List listMessage = new ArrayList();
              
                try {
                	// ���Y���̉ߋ��̎��ѓ��͂̐����`�F�b�N
                	PrivateConfig config = new PrivateConfig(conn);
                	if("false".equals(config.getString("PAST_RESULT_ENTRY_TYP"))){
                		if(chkProcExecDate("1","",struct.getRCV_ISSUE_DATE()) == false){
                			setErrorMessage(ProcExecDateError);
                			setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
                			setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
                			return;
                		}
                	}
					
                 // �Ɩ��^�p���擾
                 List dateList = entity.mselectBUSINESS_OPR_DATE.read(conn, struct);
                 AF0060010Struct dateStruct = null;
                 if(dateList.size() <= 0){
                  // �s�C���������s�F�Ɩ��^�p�������݂��܂���
                  logMessage = "SYS_DATE_CTRL.PLANT_CD:" + struct.getRCV_PLANT_CD();
                  setErrorMessage("AF00056", logMessage);
                 }
                 else{
                  dateStruct = (AF0060010Struct)dateList.get(0);
              
                  // ���ɓ��`�F�b�N
                  Date issue_Date = stringToDate(struct.getRCV_ISSUE_DATE());
                  Date business_Date = stringToDate(dateStruct.getw_BUSINESS_OPR_DATE());
                  if(issue_Date.after(business_Date)){
                   // �o�^�������s�F���ɓ��ɖ����̓��t�͎w��ł��܂���
                   logMessage = "SYS_DATE_CTRL.BUSINESS_OPR_DATE:" + dateStruct.getw_BUSINESS_OPR_DATE();
                   setErrorMessage("ZZ05103", logMessage);
                  }
                 }
              
                
                 // ���ɏ���
                 // �g�����U�N�V�����J�n
                 conn.beginTransWeb();
              
                 // �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
                 if(msgStruct.sizeError() <= 0)
                 {
                  boolean result = true;		// �c�a�X�V���ʊi�[
              
                  AF0060010Struct rcvStruct = new AF0060010Struct(struct);
              
                  // ���o�ɊǗ��ԍ��̔�
                  String rcvCtrlCd = null;
                  CollectNumber rcvCollect = new CollectNumber(
                          CollectNumber.ISSUE_CD, 
                          getsysUSER_CD(), 
                          this.sp.getProcId(), 
                          rcvStruct.getw_PLANT_CD());
                  rcvCtrlCd = rcvCollect.getNo();
                  if(rcvCtrlCd == null){
                   // �o�^�������s�F���o�ɊǗ��ԍ��̍̔ԂɎ��s���܂���
                   logMessage = "UserID:" + getsysUSER_CD()
                      + ", ProcID:" + this.sp.getProcId()
                      + ", PLANT_CD:" + struct.getw_PLANT_CD();
                   setErrorMessage("AF00057", logMessage);
              
                   // ���[���o�b�N
                   conn.rollback();
              
                   ExpjMessage emsg = new ExpjMessage("AF00057");
                   throw new FoundationException(
                        "AF0060010Control",
                        "controlinsert()",
                        emsg.getMessage(CoreTools.getLocale(this.getsysUSER_CD())) );
                  }
              
                  // ���O�o��
                  logMessage = "T_RCV_ISSUE.RCV_ISSUE_CTRL_CD:" + rcvCtrlCd;
                  setSyslogConfig(logMessage);
              
                  // ���o�ɊǗ��ԍ��ݒ�
                  rcvStruct.setw_RCV_ISSUE_CTRL_CD(rcvCtrlCd);
              
                  // ���o�ɋ敪�ݒ�
                  rcvStruct.setw_RCV_ISSUE_TYP(new Integer(1));
              
                  // ���� �o�ɂƓ��ɂ̍H��R�[�h���قȂ�ꍇ�ANULL
                  if(rcvStruct.getISSUE_PLANT_CD().equals(rcvStruct.getRCV_PLANT_CD()) == false)
                  {
                   rcvStruct.setJOB_ODR_CD((String)null);
                  }
              
                  // ���o�ɔ����敪
                  rcvStruct.setw_RCV_ISSUE_GNR_TYP(new Integer(13));
              
                  // ���ɐ� �؂�グ����
                  boolean resultCeil = false;
                  Calculate calc = new Calculate();
              
                  if(rcvStruct.getw_UNIT_QTY_TYP().intValue() == 1
                   && calc.isNumeric(rcvStruct.getRCV_ISSUE_QTY()) == true ){
                   rcvStruct.setRCV_ISSUE_QTY(calc.ceil(rcvStruct.getRCV_ISSUE_QTY(), 0));
                   resultCeil = true;
                  }
              
                  // ���ɐ����c���ȏ�ɂȂ�� �����t���O�������ɂ���
                  if(rcvStruct.getTRANSPORT_CMPLT_TYP().intValue() == 0
                   && calc.compare(rcvStruct.getRCV_ISSUE_QTY(), rcvStruct.getw_LEAVE_RCV_QTY()) >= 0)
                  {
                   rcvStruct.seth_TRANSPORT_CMPLT_TYP(new String("1"));
                  }
              
                  // �x���敪
                  rcvStruct.setw_CONS_TYP(new Integer(0));

                  // ��ЃR�[�h�擾
                  List companyList = entity.mselectSYS_MY_COMPANY.read(conn, struct);
                  if(companyList.size() > 0){
                   AF0060010Struct companyStruct = (AF0060010Struct)companyList.get(0);
                   rcvStruct.setw_COMPANY_CD(companyStruct.getw_COMPANY_CD());
                  }
                  //�������擾
                  List vendList = entity.mselectM_WH_vendcd.read(conn,rcvStruct);
                  if(vendList.size() > 0){
                	  AF0060010Struct  vendStruct = (AF0060010Struct)vendList.get(0);
                	  rcvStruct.setVEND_CD(vendStruct.getVEND_CD());
                  }
                  //���o�Ɋ����t���O
                  if("true".equalsIgnoreCase(struct.getc_TRANSPORT_CMPLT_TYP())){
                	  rcvStruct.setRCV_ISSUE_CMPLT_FLG("1");
                  }else{
                	  rcvStruct.setRCV_ISSUE_CMPLT_FLG("0");
                  }
              
                  // �ۊǋ�ʓ��o�ɓo�^
                  entity.minsertT_RCV_ISSUE.create(conn, rcvStruct);
              
                  // ���ɏ���
                  RcvProcess rcvPrc = new RcvProcess(conn, rcvCtrlCd);
                  if(rcvPrc.execProcess() == true){
                   logMessage = "Receive Process was Complated!";
                   setSyslogConfig(logMessage);
              
                   if(resultCeil == true){
                    // �o�^�������s�F�����Ǘ��i�ڂ̂��ߏ����_�ȉ��͐؂�グ���čX�V���܂���
                    logMessage = "T_TRANSPORT_STOCK.TRANSPORT_SLIP_CD:" + struct.getTRANSPORT_SLIP_CD();
                    setInfoMessage("AF60004", logMessage);
                   }
                  } else {
                   logMessage = "Receive Process was Failed...";
                   setSyslogConfig(logMessage);
                   result = false;
                  }
              
                  logMessage = "T_RCV_ISSUE.RCV_ISSUE_CTRL_CD:" + rcvStruct.getw_RCV_ISSUE_CTRL_CD();
                  for(int idx = 0; idx < rcvPrc.getErrorList().size(); idx++){
                   setErrorMessage((String)rcvPrc.getErrorList().get(idx) , logMessage);
                  }
                  for(int idx = 0; idx < rcvPrc.getInfoList().size(); idx++){
                   setInfoMessage((String)rcvPrc.getInfoList().get(idx) , logMessage);
                  }
                  for(int idx = 0; idx < rcvPrc.getWarnList().size(); idx++){
                   setWarnMessage((String)rcvPrc.getWarnList().get(idx) , logMessage);
                  }
              
                  if (result != true) {
                   // ���[���o�b�N
                   conn.rollback();
                   return;
                  }
              
                  // [�ϑ��݌�]�e�[�u���̍X�V
                  List modifyList = entity.mselectMODIFY_COUNT.read(conn, rcvStruct);
                  if(modifyList.size() > 0){
                   AF0060010Struct modifyStruct = (AF0060010Struct)modifyList.get(0);
                   if(modifyStruct.getw_MODIFY_COUNT().equals(struct.getw_MODIFY_COUNT()) == false)
                   {
                    // �o�^�������s�F���̏����ɂ��f�[�^�������������Ă��܂�
                    logMessage = "T_TRANSPORT_STOCK.TRANSPORT_SLIP_CD:" + rcvStruct.getTRANSPORT_SLIP_CD();
                    setErrorMessage("ZZ01105", logMessage);
                    result = false;
                   }
                  }
                  else{
                   // �o�^�������s�F�X�V�Ώۃf�[�^�����݂��Ȃ�
                   logMessage = "T_TRANSPORT_STOCK.TRANSPORT_SLIP_CD:" + rcvStruct.getTRANSPORT_SLIP_CD();
                   setErrorMessage("ZZ01101", logMessage);
                   result = false;
                  }
              
                  if (result != true) {
                   // ���[���o�b�N
                   getMessage().clearWarn();
                   getMessage().clearInfo();
                   conn.rollback();
                   logMessage = "rollback!! ";
                   setSyslogConfig(logMessage);
                  }
                  else{
                   entity.mupdateT_TRANSPORT_STOCK.update(conn, rcvStruct);
              
                   // �R�~�b�g
                   conn.commit();
                  }

                  // �o�ɂƓ��ɂ̍H��R�[�h���قȂ�ꍇ�A[�H��Ԉړ�����]�̓o�^���s��
                  if(rcvStruct.getISSUE_PLANT_CD().equals(rcvStruct.getRCV_PLANT_CD()) == false)
                  {

	                AF0060010Struct moveStruct = new AF0060010Struct(struct);

					// [�ϑ��݌�]�̌����i[�H��Ԉړ�����]�o�^�p�j
					List detailList1 = entity.mselectT_TRANSPORT_STOCK_update.read(conn, moveStruct);

					AF0060010Struct detailStruct1 = null;

					detailStruct1 = (AF0060010Struct)detailList1.get(0);

					// �o�ɊǗ��ԍ��ݒ�i[�H��Ԉړ�����]�o�^�p�j
					moveStruct.setMOVE_ISSUE_CTRL_CD(detailStruct1.getMOVE_ISSUE_CTRL_CD());

					// �o�ɕi�ڔԍ��ԍ��ݒ�i[�H��Ԉړ�����]�o�^�p�j
					moveStruct.setMOVE_ISSUE_ITEM_CD(detailStruct1.getMOVE_ISSUE_ITEM_CD());

					// �o�Ɍ��H��R�[�h�ݒ�i[�H��Ԉړ�����]�o�^�p�j
					moveStruct.setMOVE_ISSUE_PLANT_CD(detailStruct1.getMOVE_ISSUE_PLANT_CD());

					// �o�Ɍ��ۊǋ�R�[�h�ݒ�i[�H��Ԉړ�����]�o�^�p�j
					moveStruct.setMOVE_ISSUE_WH_CD(detailStruct1.getMOVE_ISSUE_WH_CD());

					// �o�ɐ��Ԑݒ�i[�H��Ԉړ�����]�o�^�p�j
					moveStruct.setMOVE_ISSUE_JOB_ODR_CD(detailStruct1.getMOVE_ISSUE_JOB_ODR_CD());

					// �o�ɔN�����ݒ�i[�H��Ԉړ�����]�o�^�p�j
					moveStruct.setMOVE_ISSUE_DATE(detailStruct1.getMOVE_ISSUE_DATE());

					// �o�ɐ��Ԏ}�Ԑݒ�i[�H��Ԉړ�����]�o�^�p�j
					List detailList2 = entity.mselectT_JOB_ODR_CD_STOCK_detail_no.read(conn, moveStruct);
					AF0060010Struct detailStruct2 = null;
					if(detailList2.size() <= 0){
						// ���݂��Ȃ��ꍇ�͂O��ݒ�
						moveStruct.setMOVE_ISSUE_JOB_ODR_DETAIL_NO("0");
					}else{
						detailStruct2 = (AF0060010Struct)detailList2.get(0);

						// �o�ɐ��Ԏ}�Ԑݒ�i[�H��Ԉړ�����]�o�^�p�j
						moveStruct.setMOVE_ISSUE_JOB_ODR_DETAIL_NO(detailStruct2.getMOVE_ISSUE_JOB_ODR_DETAIL_NO());
					}

					// ���ɊǗ��ԍ��ݒ�i[�H��Ԉړ�����]�o�^�p�j
					moveStruct.setMOVE_RCV_CTRL_CD(rcvCtrlCd);

					// ���ɕi�ڔԍ��ԍ��ݒ�i[�H��Ԉړ�����]�o�^�p�j
					moveStruct.setMOVE_RCV_ITEM_CD(moveStruct.getITEM_CD());

					// ���ɍH��R�[�h�ݒ�i[�H��Ԉړ�����]�o�^�p�j
					moveStruct.setMOVE_RCV_PLANT_CD(detailStruct1.getMOVE_RCV_PLANT_CD());

					// ���ɕۊǋ�R�[�h�ݒ�i[�H��Ԉړ�����]�o�^�p�j
					moveStruct.setMOVE_RCV_WH_CD(detailStruct1.getMOVE_RCV_WH_CD());

					// ���ɐ��Ԑݒ�i[�H��Ԉړ�����]�o�^�p�j
					moveStruct.setMOVE_RCV_JOB_ODR_CD(rcvStruct.getJOB_ODR_CD());

					// ���ɔN�����ݒ�i[�H��Ԉړ�����]�o�^�p�j
					moveStruct.setMOVE_RCV_DATE(moveStruct.getRCV_ISSUE_DATE());

					// �o�ɐ��Ԏ}�Ԑݒ�i[�H��Ԉړ�����]�o�^�p�j
					List detailList3 = entity.mselectT_JOB_ODR_CD_STOCK_detail_no2.read(conn, moveStruct);
					AF0060010Struct detailStruct3 = null;
					if(detailList3.size() <= 0){
						// ���݂��Ȃ��ꍇ�͂O��ݒ�
						moveStruct.setMOVE_RCV_JOB_ODR_DETAIL_NO("0");
					}else{
						detailStruct3 = (AF0060010Struct)detailList3.get(0);

						// �o�ɐ��Ԏ}�Ԑݒ�i[�H��Ԉړ�����]�o�^�p�j
						moveStruct.setMOVE_RCV_JOB_ODR_DETAIL_NO(detailStruct3.getMOVE_RCV_JOB_ODR_DETAIL_NO());
					}

					// �H��Ԉړ����ѓo�^
					entity.minsertT_PLANTMOVE.create(conn, moveStruct);
                  }

                 }
              
                }catch(ParseException e){
                 // ���[���o�b�N
                  conn.rollback();
              
                 // �ϊ����s
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(e, emsg);
                 
                 emsg = new ExpjMessage( "ZZ01006", e.toString());
                 sysLog.severe (emsg ,getsysUSER_CD());
                 throw ee;
              
              
                }catch(SQLException e){
                 // ���[���o�b�N
                 conn.rollback();
              
                 // �G���[���b�Z�[�W�쐬
                 setSqlExceptionMsg(e);
              
                }catch(Exception e){
                 // ���[���o�b�N
                 conn.rollback();
              
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006" , "ProcessId:" + this.sp.getProcId() );
                 ee.add(emsg);
                 throw ee;
                }
                //-----------------------------------------------------------------------------
                //}}user_implement_dev:<controlinsertSub1>
		logger.exiting("AF0060010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlcloseSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0060");
		logger.entering("AF0060010Control"+":USER="+struct.getsUser_ID(),"controlcloseSub1");
			//{{user_implement_dev:<controlcloseSub1>
                //-----------------------------------------------------------------------------
                // �e��ʃf�[�^�ēǍ�
                controlselect();
                //-----------------------------------------------------------------------------
                //}}user_implement_dev:<controlcloseSub1>
		logger.exiting("AF0060010Control"+":USER="+struct.getsUser_ID(),"controlcloseSub1");

		return;
	}

	/**
	 * �I�����������{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCancelCompleteChoice() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0060");
		logger.entering("AF0060010Control"+":USER="+struct.getsUser_ID(),"controlCancelCompleteChoice");
			//{{user_implement_dev:<controlCancelCompleteChoice>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			//[�ϑ��݌�]�ɑ��݂��Ȃ��ꍇ
			List mdfCntList = entity.mselectMODIFY_COUNT.read(conn, struct);
			if (mdfCntList.isEmpty()) {
				setErrorMessage("ZZ01105");
				setErrorParameter("T_TRANSPORT_STOCK","TRANSPORT_SLIP_CD",struct.getTRANSPORT_SLIP_CD());
				return;
			}
			AF0060010Struct mdfCntStruct = (AF0060010Struct)mdfCntList.get(0);
			//[�ϑ��݌�]."�X�V��" != ��X�V���(hidden�g�p)�̏ꍇ
			if (!mdfCntStruct.getw_MODIFY_COUNT().equals(struct.getw_MODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
				setErrorParameter("T_TRANSPORT_STOCK","TRANSPORT_SLIP_CD",struct.getTRANSPORT_SLIP_CD());
				return;
			}
			entity.mupdateTRANSPORT_CMPLT_TYP.update(conn, struct);
			// ��ʍĕ\��
			controlselect();

			conn.commit();
		} catch (SQLException e) {
			throw new ExpjException(e);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
                //}}user_implement_dev:<controlCancelCompleteChoice>
		logger.exiting("AF0060010Control"+":USER="+struct.getsUser_ID(),"controlCancelCompleteChoice");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0060");
		logger.entering("AF0060010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //-----------------------------------------------------------------------------
                // ���[�U��`������
                usersInitialize();
                //-----------------------------------------------------------------------------
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AF0060010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0060");
		logger.entering("AF0060010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                //-----------------------------------------------------------------------------
        		try {
        			if(LotCtrl.checkLotCtrl(conn)){
        				lotCtrl = "true";
        			}else{
        				lotCtrl = "false";
        			}
        		} catch (SQLException e) {
        			// TODO Auto-generated catch block
        			e.printStackTrace();
        		}
                // �N���A����
                controlclear();
              
                // ���[�U��`������
                usersInitialize();
                //-----------------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AF0060010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0060");
		logger.entering("AF0060010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AF0060010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("insertSub1") ) {
				controlinsertSub1();
			} else if( button.equals("closeSub1") ) {
				controlcloseSub1();
			} else if( button.equals("CancelCompleteChoice") ) {
				controlCancelCompleteChoice();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
                //------------------------------------------------------------------
                //�R���{�{�b�N�X�Ɏ擾�f�[�^�ݒ�
                struct.setList_TRANSPORT_CMPLT_TYP_val(_TRANSPORT_CMPLT_TYP.getValList());
                struct.setList_TRANSPORT_CMPLT_TYP_name(_TRANSPORT_CMPLT_TYP.getExplanList());
                struct.seth_lotCtrl(lotCtrl);
              //		�\�[�X���ɂ܂�AlarmMessageException���c���Ă���ꍇ�́A�ȉ��̍s�̃R�����g���O����AlarmMessageException���n������B
                } catch(AlarmMessageException ame){
                 ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
                 throw ee;
                //------------------------------------------------------------------
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// �g���b�Z�[�W�o�͈˗��쐬
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AF0060010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0060010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AF0060010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0060010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AF0060010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0060010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AF0060010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AF0060010Entity entity;
	protected AF0060010Struct struct;
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

		entity = new AF0060010Entity();
		struct = new AF0060010Struct();

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
	 * AF0060010�N���X�̕W���R���X�g���N�^
	 */
	public AF0060010Control() throws BusinessProcessException, FoundationException
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
				AF0060010Struct key = (AF0060010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("TRANSPORT_CMPLT_TYP_name") && key.getTRANSPORT_CMPLT_TYP_name() != null) {
					msgKey.setKeyValue("TRANSPORT_CMPLT_TYP_name", key.getTRANSPORT_CMPLT_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("TRANSPORT_CMPLT_TYP_val") && key.getTRANSPORT_CMPLT_TYP_val() != null) {
					msgKey.setKeyValue("TRANSPORT_CMPLT_TYP_val", key.getTRANSPORT_CMPLT_TYP_val().toString());
				}
				if(msgKeyType.containsKeyColumn("w_LEAVE_RCV_QTY") && key.getw_LEAVE_RCV_QTY() != null) {
					msgKey.setKeyValue("w_LEAVE_RCV_QTY", key.getw_LEAVE_RCV_QTY());
				}
				if(msgKeyType.containsKeyColumn("c_TRANSPORT_CMPLT_TYP") && key.getc_TRANSPORT_CMPLT_TYP() != null) {
					msgKey.setKeyValue("c_TRANSPORT_CMPLT_TYP", key.getc_TRANSPORT_CMPLT_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_lotCtrl") && key.geth_lotCtrl() != null) {
					msgKey.setKeyValue("h_lotCtrl", key.geth_lotCtrl());
				}
				if(msgKeyType.containsKeyColumn("h_lotFlg") && key.geth_lotFlg() != null) {
					msgKey.setKeyValue("h_lotFlg", key.geth_lotFlg());
				}
				if(msgKeyType.containsKeyColumn("hid_TRANSPORT_CMPLT_TYP") && key.gethid_TRANSPORT_CMPLT_TYP() != null) {
					msgKey.setKeyValue("hid_TRANSPORT_CMPLT_TYP", key.gethid_TRANSPORT_CMPLT_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_RCV_ISSUE_CTRL_CD") && key.getw_RCV_ISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("w_RCV_ISSUE_CTRL_CD", key.getw_RCV_ISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("w_RCV_ISSUE_TYP") && key.getw_RCV_ISSUE_TYP() != null) {
					msgKey.setKeyValue("w_RCV_ISSUE_TYP", key.getw_RCV_ISSUE_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("w_RCV_ISSUE_GNR_TYP") && key.getw_RCV_ISSUE_GNR_TYP() != null) {
					msgKey.setKeyValue("w_RCV_ISSUE_GNR_TYP", key.getw_RCV_ISSUE_GNR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_CD") && key.getw_PLANT_CD() != null) {
					msgKey.setKeyValue("w_PLANT_CD", key.getw_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("w_COMPANY_CD") && key.getw_COMPANY_CD() != null) {
					msgKey.setKeyValue("w_COMPANY_CD", key.getw_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("w_CONS_TYP") && key.getw_CONS_TYP() != null) {
					msgKey.setKeyValue("w_CONS_TYP", key.getw_CONS_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("w_MODIFY_COUNT") && key.getw_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("w_MODIFY_COUNT", key.getw_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("w_UNIT_QTY_TYP") && key.getw_UNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("w_UNIT_QTY_TYP", key.getw_UNIT_QTY_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("w_BUSINESS_OPR_DATE") && key.getw_BUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("w_BUSINESS_OPR_DATE", key.getw_BUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("r_MODIFY_CHOICE") && key.getr_MODIFY_CHOICE() != null) {
					msgKey.setKeyValue("r_MODIFY_CHOICE", key.getr_MODIFY_CHOICE().toString());
				}
				if(msgKeyType.containsKeyColumn("TRANSPORT_SLIP_CD") && key.getTRANSPORT_SLIP_CD() != null) {
					msgKey.setKeyValue("TRANSPORT_SLIP_CD", key.getTRANSPORT_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO") && key.getLOT_NO() != null) {
					msgKey.setKeyValue("LOT_NO", key.getLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("VEND_LOT_NO") && key.getVEND_LOT_NO() != null) {
					msgKey.setKeyValue("VEND_LOT_NO", key.getVEND_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_PLANT_CD") && key.getISSUE_PLANT_CD() != null) {
					msgKey.setKeyValue("ISSUE_PLANT_CD", key.getISSUE_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_PLANT_NAME") && key.getISSUE_PLANT_NAME() != null) {
					msgKey.setKeyValue("ISSUE_PLANT_NAME", key.getISSUE_PLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_WH_CD") && key.getISSUE_WH_CD() != null) {
					msgKey.setKeyValue("ISSUE_WH_CD", key.getISSUE_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_WH_NAME") && key.getISSUE_WH_NAME() != null) {
					msgKey.setKeyValue("ISSUE_WH_NAME", key.getISSUE_WH_NAME());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_DATE") && key.getISSUE_DATE() != null) {
					msgKey.setKeyValue("ISSUE_DATE", key.getISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_QTY") && key.getISSUE_QTY() != null) {
					msgKey.setKeyValue("ISSUE_QTY", key.getISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_ANAME") && key.getVEND_ANAME() != null) {
					msgKey.setKeyValue("VEND_ANAME", key.getVEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("RCV_DATE") && key.getRCV_DATE() != null) {
					msgKey.setKeyValue("RCV_DATE", key.getRCV_DATE());
				}
				if(msgKeyType.containsKeyColumn("RCV_QTY") && key.getRCV_QTY() != null) {
					msgKey.setKeyValue("RCV_QTY", key.getRCV_QTY());
				}
				if(msgKeyType.containsKeyColumn("TRANSPORT_CMPLT_TYP") && key.getTRANSPORT_CMPLT_TYP() != null) {
					msgKey.setKeyValue("TRANSPORT_CMPLT_TYP", key.getTRANSPORT_CMPLT_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("DRAW_CD") && key.getDRAW_CD() != null) {
					msgKey.setKeyValue("DRAW_CD", key.getDRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("SPEC") && key.getSPEC() != null) {
					msgKey.setKeyValue("SPEC", key.getSPEC());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_COMMENT") && key.getRCV_ISSUE_COMMENT() != null) {
					msgKey.setKeyValue("RCV_ISSUE_COMMENT", key.getRCV_ISSUE_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_COMMENT") && key.getISSUE_COMMENT() != null) {
					msgKey.setKeyValue("ISSUE_COMMENT", key.getISSUE_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("RCV_WH_CD") && key.getRCV_WH_CD() != null) {
					msgKey.setKeyValue("RCV_WH_CD", key.getRCV_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_QTY") && key.getRCV_ISSUE_QTY() != null) {
					msgKey.setKeyValue("RCV_ISSUE_QTY", key.getRCV_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_DATE") && key.getRCV_ISSUE_DATE() != null) {
					msgKey.setKeyValue("RCV_ISSUE_DATE", key.getRCV_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_FLG") && key.getRCV_ISSUE_CMPLT_FLG() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CMPLT_FLG", key.getRCV_ISSUE_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_TRANSPORT_CMPLT_TYP") && key.geth_TRANSPORT_CMPLT_TYP() != null) {
					msgKey.setKeyValue("h_TRANSPORT_CMPLT_TYP", key.geth_TRANSPORT_CMPLT_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_WH_STOCK_ON_HAND_QTY") && key.getw_WH_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("w_WH_STOCK_ON_HAND_QTY", key.getw_WH_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("RCV_PLANT_CD") && key.getRCV_PLANT_CD() != null) {
					msgKey.setKeyValue("RCV_PLANT_CD", key.getRCV_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("w_TOTAL_STOCK_ON_HAND_QTY") && key.getw_TOTAL_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("w_TOTAL_STOCK_ON_HAND_QTY", key.getw_TOTAL_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("RCV_PLANT_NAME") && key.getRCV_PLANT_NAME() != null) {
					msgKey.setKeyValue("RCV_PLANT_NAME", key.getRCV_PLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("RCV_WH_NAME") && key.getRCV_WH_NAME() != null) {
					msgKey.setKeyValue("RCV_WH_NAME", key.getRCV_WH_NAME());
				}
				if(msgKeyType.containsKeyColumn("MOVE_ISSUE_WH_CD") && key.getMOVE_ISSUE_WH_CD() != null) {
					msgKey.setKeyValue("MOVE_ISSUE_WH_CD", key.getMOVE_ISSUE_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("MOVE_ISSUE_JOB_ODR_DETAIL_NO") && key.getMOVE_ISSUE_JOB_ODR_DETAIL_NO() != null) {
					msgKey.setKeyValue("MOVE_ISSUE_JOB_ODR_DETAIL_NO", key.getMOVE_ISSUE_JOB_ODR_DETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("MOVE_ISSUE_JOB_ODR_CD") && key.getMOVE_ISSUE_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("MOVE_ISSUE_JOB_ODR_CD", key.getMOVE_ISSUE_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("MOVE_ISSUE_ITEM_CD") && key.getMOVE_ISSUE_ITEM_CD() != null) {
					msgKey.setKeyValue("MOVE_ISSUE_ITEM_CD", key.getMOVE_ISSUE_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("MOVE_ISSUE_PLANT_CD") && key.getMOVE_ISSUE_PLANT_CD() != null) {
					msgKey.setKeyValue("MOVE_ISSUE_PLANT_CD", key.getMOVE_ISSUE_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("MOVE_RCV_JOB_ODR_CD") && key.getMOVE_RCV_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("MOVE_RCV_JOB_ODR_CD", key.getMOVE_RCV_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("MOVE_RCV_JOB_ODR_DETAIL_NO") && key.getMOVE_RCV_JOB_ODR_DETAIL_NO() != null) {
					msgKey.setKeyValue("MOVE_RCV_JOB_ODR_DETAIL_NO", key.getMOVE_RCV_JOB_ODR_DETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("MOVE_RCV_ITEM_CD") && key.getMOVE_RCV_ITEM_CD() != null) {
					msgKey.setKeyValue("MOVE_RCV_ITEM_CD", key.getMOVE_RCV_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("MOVE_RCV_WH_CD") && key.getMOVE_RCV_WH_CD() != null) {
					msgKey.setKeyValue("MOVE_RCV_WH_CD", key.getMOVE_RCV_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("MOVE_RCV_PLANT_CD") && key.getMOVE_RCV_PLANT_CD() != null) {
					msgKey.setKeyValue("MOVE_RCV_PLANT_CD", key.getMOVE_RCV_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("MOVE_ISSUE_CTRL_CD") && key.getMOVE_ISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("MOVE_ISSUE_CTRL_CD", key.getMOVE_ISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("MOVE_ISSUE_DATE") && key.getMOVE_ISSUE_DATE() != null) {
					msgKey.setKeyValue("MOVE_ISSUE_DATE", key.getMOVE_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("MOVE_RCV_CTRL_CD") && key.getMOVE_RCV_CTRL_CD() != null) {
					msgKey.setKeyValue("MOVE_RCV_CTRL_CD", key.getMOVE_RCV_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("MOVE_RCV_DATE") && key.getMOVE_RCV_DATE() != null) {
					msgKey.setKeyValue("MOVE_RCV_DATE", key.getMOVE_RCV_DATE());
				}
				if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY") && key.getSTOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("STOCK_ON_HAND_QTY", key.getSTOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_QTY") && key.getDEFECT_QTY() != null) {
					msgKey.setKeyValue("DEFECT_QTY", key.getDEFECT_QTY());
				}
				if(msgKeyType.containsKeyColumn("ALLOCABLE_QTY") && key.getALLOCABLE_QTY() != null) {
					msgKey.setKeyValue("ALLOCABLE_QTY", key.getALLOCABLE_QTY());
				}
				if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG") && key.getLOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("LOT_CTRL_FLG", key.getLOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_COUNT") && key.getl_COUNT() != null) {
					msgKey.setKeyValue("l_COUNT", key.getl_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ROW_COUNT") && key.getROW_COUNT() != null) {
					msgKey.setKeyValue("ROW_COUNT", key.getROW_COUNT());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
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
					AF0060010Struct key = new AF0060010Struct();
					if(msgKeyType.containsKeyColumn("TRANSPORT_CMPLT_TYP_name")) {
						key.setTRANSPORT_CMPLT_TYP_name(msgKey.getKeyValue("TRANSPORT_CMPLT_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("TRANSPORT_CMPLT_TYP_val")) {
						key.setTRANSPORT_CMPLT_TYP_val(new Integer(msgKey.getKeyValue("TRANSPORT_CMPLT_TYP_val")));
					}
					if(msgKeyType.containsKeyColumn("w_LEAVE_RCV_QTY")) {
						key.setw_LEAVE_RCV_QTY(msgKey.getKeyValue("w_LEAVE_RCV_QTY"));
					}
					if(msgKeyType.containsKeyColumn("c_TRANSPORT_CMPLT_TYP")) {
						key.setc_TRANSPORT_CMPLT_TYP(msgKey.getKeyValue("c_TRANSPORT_CMPLT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_lotCtrl")) {
						key.seth_lotCtrl(msgKey.getKeyValue("h_lotCtrl"));
					}
					if(msgKeyType.containsKeyColumn("h_lotFlg")) {
						key.seth_lotFlg(msgKey.getKeyValue("h_lotFlg"));
					}
					if(msgKeyType.containsKeyColumn("hid_TRANSPORT_CMPLT_TYP")) {
						key.sethid_TRANSPORT_CMPLT_TYP(msgKey.getKeyValue("hid_TRANSPORT_CMPLT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_RCV_ISSUE_CTRL_CD")) {
						key.setw_RCV_ISSUE_CTRL_CD(msgKey.getKeyValue("w_RCV_ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_RCV_ISSUE_TYP")) {
						key.setw_RCV_ISSUE_TYP(new Integer(msgKey.getKeyValue("w_RCV_ISSUE_TYP")));
					}
					if(msgKeyType.containsKeyColumn("w_RCV_ISSUE_GNR_TYP")) {
						key.setw_RCV_ISSUE_GNR_TYP(new Integer(msgKey.getKeyValue("w_RCV_ISSUE_GNR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_CD")) {
						key.setw_PLANT_CD(msgKey.getKeyValue("w_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_COMPANY_CD")) {
						key.setw_COMPANY_CD(msgKey.getKeyValue("w_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_CONS_TYP")) {
						key.setw_CONS_TYP(new Integer(msgKey.getKeyValue("w_CONS_TYP")));
					}
					if(msgKeyType.containsKeyColumn("w_MODIFY_COUNT")) {
						key.setw_MODIFY_COUNT(msgKey.getKeyValue("w_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("w_UNIT_QTY_TYP")) {
						key.setw_UNIT_QTY_TYP(new Integer(msgKey.getKeyValue("w_UNIT_QTY_TYP")));
					}
					if(msgKeyType.containsKeyColumn("w_BUSINESS_OPR_DATE")) {
						key.setw_BUSINESS_OPR_DATE(msgKey.getKeyValue("w_BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("r_MODIFY_CHOICE")) {
						key.setr_MODIFY_CHOICE(new Integer(msgKey.getKeyValue("r_MODIFY_CHOICE")));
					}
					if(msgKeyType.containsKeyColumn("TRANSPORT_SLIP_CD")) {
						key.setTRANSPORT_SLIP_CD(msgKey.getKeyValue("TRANSPORT_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO")) {
						key.setLOT_NO(msgKey.getKeyValue("LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("VEND_LOT_NO")) {
						key.setVEND_LOT_NO(msgKey.getKeyValue("VEND_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_PLANT_CD")) {
						key.setISSUE_PLANT_CD(msgKey.getKeyValue("ISSUE_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_PLANT_NAME")) {
						key.setISSUE_PLANT_NAME(msgKey.getKeyValue("ISSUE_PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_WH_CD")) {
						key.setISSUE_WH_CD(msgKey.getKeyValue("ISSUE_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_WH_NAME")) {
						key.setISSUE_WH_NAME(msgKey.getKeyValue("ISSUE_WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_DATE")) {
						key.setISSUE_DATE(msgKey.getKeyValue("ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_QTY")) {
						key.setISSUE_QTY(msgKey.getKeyValue("ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_ANAME")) {
						key.setVEND_ANAME(msgKey.getKeyValue("VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("RCV_DATE")) {
						key.setRCV_DATE(msgKey.getKeyValue("RCV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("RCV_QTY")) {
						key.setRCV_QTY(msgKey.getKeyValue("RCV_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TRANSPORT_CMPLT_TYP")) {
						key.setTRANSPORT_CMPLT_TYP(new Integer(msgKey.getKeyValue("TRANSPORT_CMPLT_TYP")));
					}
					if(msgKeyType.containsKeyColumn("DRAW_CD")) {
						key.setDRAW_CD(msgKey.getKeyValue("DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("SPEC")) {
						key.setSPEC(msgKey.getKeyValue("SPEC"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_COMMENT")) {
						key.setRCV_ISSUE_COMMENT(msgKey.getKeyValue("RCV_ISSUE_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_COMMENT")) {
						key.setISSUE_COMMENT(msgKey.getKeyValue("ISSUE_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("RCV_WH_CD")) {
						key.setRCV_WH_CD(msgKey.getKeyValue("RCV_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_QTY")) {
						key.setRCV_ISSUE_QTY(msgKey.getKeyValue("RCV_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_DATE")) {
						key.setRCV_ISSUE_DATE(msgKey.getKeyValue("RCV_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_FLG")) {
						key.setRCV_ISSUE_CMPLT_FLG(msgKey.getKeyValue("RCV_ISSUE_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_TRANSPORT_CMPLT_TYP")) {
						key.seth_TRANSPORT_CMPLT_TYP(msgKey.getKeyValue("h_TRANSPORT_CMPLT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_WH_STOCK_ON_HAND_QTY")) {
						key.setw_WH_STOCK_ON_HAND_QTY(msgKey.getKeyValue("w_WH_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("RCV_PLANT_CD")) {
						key.setRCV_PLANT_CD(msgKey.getKeyValue("RCV_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_TOTAL_STOCK_ON_HAND_QTY")) {
						key.setw_TOTAL_STOCK_ON_HAND_QTY(msgKey.getKeyValue("w_TOTAL_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("RCV_PLANT_NAME")) {
						key.setRCV_PLANT_NAME(msgKey.getKeyValue("RCV_PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("RCV_WH_NAME")) {
						key.setRCV_WH_NAME(msgKey.getKeyValue("RCV_WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MOVE_ISSUE_WH_CD")) {
						key.setMOVE_ISSUE_WH_CD(msgKey.getKeyValue("MOVE_ISSUE_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("MOVE_ISSUE_JOB_ODR_DETAIL_NO")) {
						key.setMOVE_ISSUE_JOB_ODR_DETAIL_NO(msgKey.getKeyValue("MOVE_ISSUE_JOB_ODR_DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("MOVE_ISSUE_JOB_ODR_CD")) {
						key.setMOVE_ISSUE_JOB_ODR_CD(msgKey.getKeyValue("MOVE_ISSUE_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("MOVE_ISSUE_ITEM_CD")) {
						key.setMOVE_ISSUE_ITEM_CD(msgKey.getKeyValue("MOVE_ISSUE_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("MOVE_ISSUE_PLANT_CD")) {
						key.setMOVE_ISSUE_PLANT_CD(msgKey.getKeyValue("MOVE_ISSUE_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("MOVE_RCV_JOB_ODR_CD")) {
						key.setMOVE_RCV_JOB_ODR_CD(msgKey.getKeyValue("MOVE_RCV_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("MOVE_RCV_JOB_ODR_DETAIL_NO")) {
						key.setMOVE_RCV_JOB_ODR_DETAIL_NO(msgKey.getKeyValue("MOVE_RCV_JOB_ODR_DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("MOVE_RCV_ITEM_CD")) {
						key.setMOVE_RCV_ITEM_CD(msgKey.getKeyValue("MOVE_RCV_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("MOVE_RCV_WH_CD")) {
						key.setMOVE_RCV_WH_CD(msgKey.getKeyValue("MOVE_RCV_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("MOVE_RCV_PLANT_CD")) {
						key.setMOVE_RCV_PLANT_CD(msgKey.getKeyValue("MOVE_RCV_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("MOVE_ISSUE_CTRL_CD")) {
						key.setMOVE_ISSUE_CTRL_CD(msgKey.getKeyValue("MOVE_ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("MOVE_ISSUE_DATE")) {
						key.setMOVE_ISSUE_DATE(msgKey.getKeyValue("MOVE_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("MOVE_RCV_CTRL_CD")) {
						key.setMOVE_RCV_CTRL_CD(msgKey.getKeyValue("MOVE_RCV_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("MOVE_RCV_DATE")) {
						key.setMOVE_RCV_DATE(msgKey.getKeyValue("MOVE_RCV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY")) {
						key.setSTOCK_ON_HAND_QTY(msgKey.getKeyValue("STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_QTY")) {
						key.setDEFECT_QTY(msgKey.getKeyValue("DEFECT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ALLOCABLE_QTY")) {
						key.setALLOCABLE_QTY(msgKey.getKeyValue("ALLOCABLE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG")) {
						key.setLOT_CTRL_FLG(msgKey.getKeyValue("LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_COUNT")) {
						key.setl_COUNT(msgKey.getKeyValue("l_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ROW_COUNT")) {
						key.setROW_COUNT(msgKey.getKeyValue("ROW_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
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
