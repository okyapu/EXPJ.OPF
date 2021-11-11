/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0080/src/com/nec/jp/orteus/metamorBase/AC0080/AC0080010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0080;

import com.nec.jp.orteus.metamorBase.AC0080.*;
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
//------------------------------------------------------------------------------
//import com.nec.jp.orteus.metamorBase.common01.Accessor.PrivateConfig;
import com.nec.jp.orteus.metamorBase.common01.util.DateConverter;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
import com.nec.jp.orteus.metamorBase.common01.util.DefaultPeriod;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AC0080010Control
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
       
           public AC0080010Struct getStruct() { return this.struct; }	// Struct�̒l�i���f�B�G�[�^�j��Ԃ��܂��B
       
        // CSV�o�͗p���X�g
        private CsvWriter csvWriter = null;
        public CsvWriter getCsvWriter(){ return this.csvWriter; }
       
        private CsvReader csvReader = null;
        public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
         
           //------------------------------------------------------------------------------
       
           /** ��ʋ��ʒ�`�擾�N���X */
           ScreenParam _scParam = sp;
       
           //------------------------------------------------------------------------------
       
           /** �ۑ��p�Ǎ����X�g */
           List _readList = new ArrayList();
       
           //------------------------------------------------------------------------------
           /**
            * �敪���擾�i���ʁj
            *
            * @param	comboStruct	�敪��񃊃X�g
            * @param	strTyp		�敪�R�[�h
            * @return	�敪����(�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�)
            */
           private String getTypName(ComboStruct comboStruct, String strTyp)
           {
               if(comboStruct != null && strTyp != null) {
                   for(int i = 0; i < comboStruct.getValList().size(); i++) {
                       if(strTyp.equals((String)(comboStruct.getValList().get(i)))) {
                           strTyp = (String)(comboStruct.getExplanList().get(i));
                           break;
                       }
                   }
               }
               return strTyp;
           }
       
           /** �I�[�_�f�}���h�敪(�����w��) */
           private ComboStruct _ODR_DMD_TYP = new ComboStruct();
       
           /** �I�[�_�f�}���h�敪 */
           private ComboStruct _OD_COMBO_TYP = new ComboStruct();
       
           /** ���O��敪 */
           private ComboStruct _OUTSIDE_COMBO_TYP = new ComboStruct();
       
           /** �I�[�_��ԋ敪 */
           private ComboStruct _ODR_STS_TYP = new ComboStruct();
       
           /** �f�}���h��ԋ敪 */
           private ComboStruct _DM_STS_TYP = new ComboStruct();
       
       
           /** �I�[�_�f�}���h�敪�ݒ�(�����w��)
            * @param �R���{�{�b�N�X�f�[�^
           */
           public void setODR_DMD_TYP(ComboStruct combo){ _ODR_DMD_TYP = combo; }
       
           /** �I�[�_�f�}���h�敪�ݒ�
            * @param �R���{�{�b�N�X�f�[�^
           */
           public void setOD_COMBO_TYP(ComboStruct combo){ _OD_COMBO_TYP = combo; }
       
           /** ���O��敪�ݒ�
            * @param �R���{�{�b�N�X�f�[�^
           */
           public void setOUTSIDE_COMBO_TYP(ComboStruct combo){ _OUTSIDE_COMBO_TYP = combo; }
       
           /** �I�[�_��ԋ敪�ݒ�
            * @param �R���{�{�b�N�X�f�[�^
           */
           public void setODR_STS_TYP(ComboStruct combo){ _ODR_STS_TYP = combo; }
       
           /** �f�}���h��ԋ敪�ݒ�
            * @param �R���{�{�b�N�X�f�[�^
           */
           public void setDM_STS_TYP(ComboStruct combo){ _DM_STS_TYP = combo; }
       
       
           /** �I�[�_�f�}���h�敪�擾(�����w��)
            * @return �I�[�_�f�}���h�敪�̃R���{�{�b�N�X�f�[�^
           */
           public ComboStruct getODR_DMD_TYP(){ return _ODR_DMD_TYP; }
       
           /** �I�[�_�f�}���h�敪�擾
            * @return �I�[�_�f�}���h�敪�̃R���{�{�b�N�X�f�[�^
           */
           public ComboStruct getOD_COMBO_TYP(){ return _OD_COMBO_TYP; }
       
           /** ���O��敪�擾
            * @return ���O��敪�̃R���{�{�b�N�X�f�[�^
           */
           public ComboStruct getOUTSIDE_COMBO_TYP(){ return _OUTSIDE_COMBO_TYP; }
       
           /** �I�[�_��ԋ敪�擾
            * @return �I�[�_��ԋ敪�̃R���{�{�b�N�X�f�[�^
           */
           public ComboStruct getODR_STS_TYP(){ return _ODR_STS_TYP; }
       
           /** �f�}���h��ԋ敪�擾
            * @return �f�}���h��ԋ敪�̃R���{�{�b�N�X�f�[�^
           */
           public ComboStruct getDM_STS_TYP(){ return _DM_STS_TYP; }
       
           //------------------------------------------------------------------------------
       
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
       
           //------------------------------------------------------------------------------
       
           /** �Ɩ��^�p�J�n���i�[�p */
           private Date _sysDate = new Date();
       
          //------------------------------------------------------------------------------
       
           private List csvList = null;
           public List getCsvList(){ return this.csvList; }
           //------------------------------------------------------------------------------
       
           // ���׍s�S���̃`�F�b�N�{�b�N�X�̒l
           private List _EntryList = null;
           public List getEntryList() { return _EntryList; }
           public void setEntryList(List listname) { _EntryList = listname; }
       
          /** ��ʃp�����[�^�i�ő�\���s���j�擾�A�N�Z�X�L�[ */
           private final static int _DISPLAY_CD_PARENT = 10;
       
           /**
            * �\���ő�s����������
            *
            * @param key �A�N�Z�X�L�[
            * @param size �Ώۍs��
            * @return �ُ�Ȃ� true �G���[ false
            */
           private boolean checkMaxDispLine(int key, long rowCount) throws FoundationException
           {
               ScreenParam sp = new ScreenParam(this.getClass());
               int maxLine = sp.getMaxLine(conn,key);
               if(maxLine != 0 && rowCount==maxLine +1)
               {
          ExpjMessage emsg = new ExpjMessage( "ZZ01115", ""+maxLine );
          msgStruct.addError( emsg );
          sysLog.warning(emsg, getsysUSER_CD());
          emsg = new ExpjMessage( "ZZ01006", "T_EXTERNAL_PLAN.EXTERNAL_PLAN_CD:" + getsysPLANT_CD() );
          msgStruct.addError( emsg );
          sysLog.warning(emsg, getsysUSER_CD());
                   return false;
               }
               return true;
           }
           //------------------------------------------------------------------------------
       
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
                   AC0080010Struct dateStruct = (AC0080010Struct)dateList.get(0);
                   DateConverter dc = new DateConverter();
                   _sysDate = dc.str2date(dateStruct.gets_BUSINESS_DATE());
               } else{
          Message = "SYS_DATE_CTRL.PLANT_CD:" + struct.getw_PLANT_CD();
          setErrorMessage("AC10026", Message);
                   return false;
               }
       
               return true;
       
           }
       
        /*
         * �f�t�H���g���Y�v����ԓ��t�擾�ݒ�
         *
         * @return	�Ȃ�
         */
        private void setDefaultPeriodDate() throws ExpjException
        {
               // �Ɩ��^�p���̎擾
         Date dateBusinessOprDate = null;
         boolean bResult = false;
         
               try
               {
          if(getSystemDate() == true) {
           dateBusinessOprDate = _sysDate;
          }
                
          // �f�t�H���g���Y�v����ԓ��t�擾
          String strDefDate[] = {"", ""};
       
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
          AlarmMessageException msg = new AlarmMessageException();
          throw msg;
         }
         catch(FoundationException fe)
         {
          AlarmMessageException msg = new AlarmMessageException();
          throw msg;
         }
         catch(ExpjException ex){
          throw ex;
         }
         catch(Exception e){
          AlarmMessageException msg = new AlarmMessageException();
          throw msg;
       
         }
        }
           //------------------------------------------------------------------------------
         
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
        private void setInfoMessage(String message)
        {
         ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
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

        //------------------------------------------------------------------------------
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0080");
		logger.entering("AC0080010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
                      //---------------------------------------------------------------------
              
              
                      // �������O��struct����ޔ�
                      AC0080010Struct copy_struct = new AC0080010Struct();
                      copy_struct.copy(struct);
                
                // �Ǎ��O�ɏ�Ԃ�������
                setReadStatus(INITIAL);
                
                List listMessage = new ArrayList();
                String Message = "";
              
                      // �������ʃt���O������
                      boolean result = true;
              
                      // �\������Ă��郊�X�g���N���A����
                      list.clear();
                      _readList.clear();
                 
                      try {
              
                          // �v����ԃ`�F�b�N�p�ɐ��Y�v����Ԃ�ύX
                          DateConverter dc = new DateConverter();
                          Date fromDate = dc.str2date(struct.getw_DATE_FROM());
                          Date toDate = dc.str2date(struct.getw_DATE_TO());
              
                          // �G���[�`�F�b�N
                          // �H��R�[�h���w�肳�ꂽ�ꍇ
                          if(!(struct.getw_PLANT_CD()).equals("")) {
                          	// �H��R�[�h�̑��݃`�F�b�N
                              List plantList = entity.mM_PLANT.read(conn, struct);
                              if(plantList.size() <= 0) {
                                  // �Ǎ��������s�F�H��R�[�h�����݂��܂���
                                  struct.setPLANT_NAME("");
                   Message = "M_PLANT.PLANT_CD:" + struct.getw_PLANT_CD();
                   setErrorMessage("AC10001", Message);
                                  result = false;
                               setReadStatus(INITIAL);
                              } else {
                                  AC0080010Struct plantStruct = (AC0080010Struct)plantList.get(0);
                                  struct.setPLANT_NAME(plantStruct.getPLANT_NAME());
              
                                  // �J�����_�f�[�^�擾
                                  List dateList = entity.mM_CAL.read(conn, struct);
                                  if(dateList.size() > 0) {
                                      AC0080010Struct dateStruct = (AC0080010Struct)dateList.get(0);
              
                                      // �J�����_�͈͂̃`�F�b�N
                                      if(dateStruct.gets_MIN_CAL_DATE() != null &&
                                         dateStruct.gets_MAX_CAL_DATE() != null) {
              
                                          Date minCalDate = dc.str2date(dateStruct.gets_MIN_CAL_DATE());
                                          Date maxCalDate = dc.str2date(dateStruct.gets_MAX_CAL_DATE());
              
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
                      Message = "SYS_DATE_CTRL.PLANT_CD:" + struct.getw_PLANT_CD();
                      setErrorMessage("AC10005", Message);
                                           setReadStatus(INITIAL);
                                              result = false;
                                          }
                                      } else {
                                          // �J�����_�擾���s
                     Message = "SYS_DATE_CTRL.PLANT_CD:" + struct.getw_PLANT_CD();
                     setErrorMessage("AC10005", Message);
                                       setReadStatus(INITIAL);
                                          result = false;
                                      }
              
                                  } else {
                                      // �J�����_�擾���s
                    Message = "SYS_DATE_CTRL.PLANT_CD:" + struct.getw_PLANT_CD();
                    setErrorMessage("AC10005", Message);
                                   setReadStatus(INITIAL);
                                      result = false;
                                  }
              
                              }
                          }
                          // �G���[���Ȃ��ꍇ
                          if(result) {
                              // �I�[�_�f�}���h�敪�ݒ�(���R�t���t���O��ON�̎�"�f�}���h"�̂݌���)
                              // ���R�t���t���O�ݒ�(ON�̎�" ",OFF�̎�null)
                              if(struct.geth_DEMAND_FLG().equals("1")) {
                                  struct.sets_ODR_DMD_TYP1("3");
                                  struct.sets_ODR_DMD_TYP2("3");
                                  struct.sets_UN_CONNECT_DEMAND(" ");
                              } else if(struct.geth_DEMAND_FLG().equals("0") &&
                                        struct.geth_ODR_DMD_TYP().equals("1")) {
                                  struct.sets_ODR_DMD_TYP1("2");
                                  struct.sets_ODR_DMD_TYP2("3");
                                  struct.sets_UN_CONNECT_DEMAND(null);
                              } else if(struct.geth_DEMAND_FLG().equals("0") &&
                                        struct.geth_ODR_DMD_TYP().equals("2")) {
                                  struct.sets_ODR_DMD_TYP1("2");
                                  struct.sets_ODR_DMD_TYP2("2");
                                  struct.sets_UN_CONNECT_DEMAND(null);
                              } else if(struct.geth_DEMAND_FLG().equals("0") &&
                                        struct.geth_ODR_DMD_TYP().equals("3")) {
                                  struct.sets_ODR_DMD_TYP1("3");
                                  struct.sets_ODR_DMD_TYP2("3");
                                  struct.sets_UN_CONNECT_DEMAND(null);
                              }

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
                              
                            int maxLine = sp.getMaxLine(conn, 10);
                  			if(maxLine != 0) {
                  				struct.setROW_COUNT(String.valueOf(maxLine));
                  			} else {
                  				struct.setROW_COUNT(null);
                  			}
                  			_readList = entity.mT_EXTERNAL_PLANCnt.read(conn, struct);
                  			long rowCount = Long.parseLong(((AC0080010Struct)_readList.get(0)).getl_COUNT());
                  			// �������ʂ��O���̏ꍇ
                  			if(rowCount==0) {
                                // ��ԂɑΏۃf�[�^�Ȃ���ݒ�
                                setReadStatus(NOT_FOUND);
                                listMessage.add("T_OD.PLANT_CD:" + struct.getw_PLANT_CD());
                                listMessage.add("T_OD.ITEM_CD:" + struct.getw_ITEM_CD());
                                listMessage.add("T_OD.PRD_DUE_DATE[FROM]:" + struct.getw_DATE_FROM());
                                listMessage.add("T_OD.PRD_DUE_DATE[TO]:" + struct.getw_DATE_TO());
                                listMessage.add("T_OD.OD_TYP:" + struct.geth_ODR_DMD_TYP());
                                setErrorMessage("ZZ06001", listMessage);
                                if(list!=null && list.size()>0){
                                	list.clear();
                                }
                            // �������ʂ��P���ȏ゠��ꍇ
                            } else {
                                // �\���ő�s����������
                                if(!checkMaxDispLine(_DISPLAY_CD_PARENT, rowCount)) {
                                	if(list!=null && list.size()>0){
                                    	list.clear();
                                    }
                                   // ��Ԃɍő�\���s���ȏ��ݒ�
                                   setReadStatus(TOO_MANY);
                                 return;
                                }
                  			// �������ʎ擾
                              _readList = entity.mT_EXTERNAL_PLAN.read(conn, struct);
                              setReadStatus(NORMAL);
                                  for(int i=0; i < _readList.size(); i++) {
                                      AC0080010Struct viewStruct = (AC0080010Struct)_readList.get(i);
                                      String stOdTyp = viewStruct.gets_OD_TYP();
                                      // ��z���A��ԋ敪�̐ݒ�
                                      // 2:�I�[�_�̏ꍇ
                                      if(("2").equals(stOdTyp)) {
                                        // �I�[�_���̐ݒ�
                                        viewStruct.setODR_DM_QTY(viewStruct.getODR_QTY());
                                        // �I�[�_��ԋ敪�̐ݒ�
                                        viewStruct.setw_STS_TYP(
                                            getTypName(_ODR_STS_TYP, viewStruct.getw_ODR_STS_TYP())
                                        );
                                      // 3:�f�}���h�̏ꍇ
                                      } else if(("3").equals(stOdTyp)) {
                                        // �f�}���h���̐ݒ�
                                        viewStruct.setODR_DM_QTY(viewStruct.getDM_QTY());
                                        // �f�}���h��ԋ敪�̐ݒ�
                                        viewStruct.setw_STS_TYP(
                                            getTypName(_DM_STS_TYP, viewStruct.getw_DM_STS_TYP())
                                        );
                                      } else {
                                        viewStruct.setODR_DM_QTY("");
                                      }
              
                                      // �R���{�{�b�N�X���
                                      // �I�[�_�f�}���h�敪�A���O��敪�ݒ�
                                      viewStruct.setOD_TYP(getTypName(_OD_COMBO_TYP, stOdTyp));
                                      viewStruct.setOUTSIDE_TYP(
                                          getTypName(_OUTSIDE_COMBO_TYP, viewStruct.gets_OUTSIDE_TYP())
                                      );
                                  }
                                  }
                              }
                          
              
                          // �G���[���Ȃ��ꍇ
                          if(readStatus == NORMAL) {
                  setList(_readList);
                          }
              
                      } catch(SQLException e) {
                          setSqlExceptionMsg(e);
                      }
              
                      //---------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AC0080010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * �b�r�u�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlcsv() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0080");
		logger.entering("AC0080010Control"+":USER="+struct.getsUser_ID(),"controlcsv");
			//{{user_implement_dev:<controlcsv>
                      //---------------------------------------------------------------------
              
                // CsvWriter�𐶐�
                csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));
                      String strFilePath = null;
              
                      try {
                          csvList = new ArrayList();
              
                          // 0���̏ꍇ�I��
                          if(_readList.size() <= 0) return;
              
                          // CSV���̍쐬
                          String title[] = {
								"Expj.EXTERNAL_PLAN_CD_1" ,
								"Expj.ITEM_CD" ,
								"Expj.ITEM_NAME" ,
								"Expj.LIMIT" ,
								"Expj.JOB_ODR_QTY_1" ,
								"Expj.OD_TYP" ,
								"Expj.Cmt0446" ,
								"Expj.OUTSIDE_TYP" 
                          };
                          csvList.add(title);
                          for(int i=0; i<_readList.size(); i++) {
                              AC0080010Struct csvStruct = (AC0080010Struct)_readList.get(i);
              
                              String csvStr [] = new String[title.length];
                              csvStr[0] = csvStruct.getEXTERNAL_PLAN_CD();
                              csvStr[1] = csvStruct.getITEM_CD();
                              csvStr[2] = csvStruct.getITEM_NAME();
    	                      csvStr[3] = csvStruct.getPRD_DUE_DATE();
                              csvStr[4] = csvStruct.getODR_DM_QTY();
                              csvStr[5] = csvStruct.getOD_TYP();
                              csvStr[6] = csvStruct.getw_STS_TYP();
                              csvStr[7] = csvStruct.getOUTSIDE_TYP();
                              csvList.add(csvStr);
                          }
              
                 // CSV�쐬
                 csvWriter.write(csvList, CoreTools.getLocale(struct.getsUser_ID()),true);
                 strFilePath = csvWriter.getFilePath();
                 setInfoMessage("Completion of CSV-data output.");
                 
                 // �o�̓t�@�C���p�X�ݒ�
                 struct.setDOWNLOAD_FILE(strFilePath);
              
              
                       
                      }catch(Exception e){
                 ExpjMessage msg = new ExpjMessage( "ZZ01006", "CSV output failure" );
                 sysLog.warning(msg, getsysUSER_CD());
              
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(e, emsg);
              
                 throw ee;
                      }
                      //---------------------------------------------------------------------
              
                //}}user_implement_dev:<controlcsv>
		logger.exiting("AC0080010Control"+":USER="+struct.getsUser_ID(),"controlcsv");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0080");
		logger.entering("AC0080010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
                      //------------------------------------------------------------------
              
                      try {
                          // struct������
                          struct.init();
              
                          // ���H��R�[�h�ݒ�
                          struct.setw_PLANT_CD(getsysPLANT_CD());
              
                          // �f�t�H���g���Y�v����Ԏ擾�ݒ�
                          setDefaultPeriodDate();
              
                          // �\�����X�g���N���A
                          list.clear();
              
                          // ���[�h�ݒ�
                          setReadStatus(INITIAL);

                          //�����Ǘ��p�����[�^�擾
                          List listTimeCtrl = entity.mSYS_PARAMETER.read(conn,struct);
                          if(listTimeCtrl == null || listTimeCtrl.size() <=0){
                              struct.setTIME_CTRL("false");
                              _flgTimeCtrl = "false";
                          }else{
                              struct.setTIME_CTRL(((AC0080010Struct)listTimeCtrl.get(0)).getTIME_CTRL());
                              _flgTimeCtrl = struct.getTIME_CTRL();
                          }

                      }catch(AlarmMessageException msg) {
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(msg, emsg);
                 
                 throw ee;
                      } catch (SQLException e) {
                       throw new ExpjException(e);
                      }
                      //------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AC0080010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * �I���폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controldelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0080");
		logger.entering("AC0080010Control"+":USER="+struct.getsUser_ID(),"controldelete");
			//{{user_implement_dev:<controldelete>
              
                      // �g�����U�N�V�������ʃt���O
                      boolean result = true;
              
                String Message = "";
                 
                      try{
                          // �g�����U�N�V�����J�n
                          conn.beginTransWeb();
              
                       AC0080010Struct delStruct = new AC0080010Struct();
                       
                          // �`�F�b�N�{�b�N�X��on�̖��ׂ݂̂c�a�X�V����
                          for(int i = 0; i < struct.getList_ITEM_CD().size(); i++) {
              
                              // �I���s�̏����擾
                           delStruct.importData(struct, i);
                           
                              // User_ID���폜Struct�ɐݒ�
                              delStruct.setsUser_ID(struct.getsUser_ID());
              
                           // �X�V�`�F�b�N�̊m�F
                  List e_list = entity.mT_EXTERNAL_PLAN4Update.read(conn, delStruct);
                  if(e_list.size() <= 0){
                   Message = "T_EXTERNAL_PLAN.OD_NO:" + delStruct.geth_OD_NO();
                   setErrorMessage("ZZ06001", Message);
                   result = false;
                                  break;
                  }
                           String ex_modify = ((AC0080010Struct)e_list.get(0)).getMODIFY_COUNT();
                           if (delStruct.getEX_MODIFY_COUNT().equals(ex_modify) == false)
                  {
                   Message = "T_EXTERNAL_PLAN.OD_NO:" + delStruct.geth_OD_NO();
                   setErrorMessage("ZZ01105", Message);
                   result = false;
                                  break;
                  }
                           
                              // �O���v�揈���敪(2:�ύX)�ƊO���v��폜(1:�폜�Ώ�)�t���O�̍X�V
                              int cnt1 = entity.mT_EXTERNAL_PLAN.update(conn, delStruct);
              
                              // �X�V���������������ꍇ�A�폜����
                              if(0 < cnt1) {
                               
                            // �X�V�`�F�b�N�̊m�F
                   List o_list = entity.mT_OD4Update.read(conn, delStruct);
                   if(o_list.size() <= 0){
                    Message = "T_OD.OD_NO:" + delStruct.geth_OD_NO();
                    setErrorMessage("ZZ06001", Message);
                    result = false;
                                   break;
                   }
                            String od_modify = ((AC0080010Struct)o_list.get(0)).getMODIFY_COUNT();
                            if (delStruct.getOD_MODIFY_COUNT().equals(od_modify) == false)
                   {
                    Message = "T_OD.OD_NO:" + delStruct.geth_OD_NO();
                    setErrorMessage("ZZ01105", Message);
                    result = false;
                                   break;
                   }
                               
                                  // �O���v��ԍ����L�[�Ƃ����v�ʃ��R�[�h���폜
                                  int cnt2 = entity.mT_OD.delete(conn, delStruct);
              
                                  // �폜�Ώۂ��Ȃ������ꍇ
                                  if(cnt2 < 1) {
                                      // �폜�������s�F�Ώۃf�[�^�����݂��܂���
                    Message = "T_OD.OD_NO:" + delStruct.geth_OD_NO();
                    setErrorMessage("ZZ06001", Message);
                                      result = false;
                                      break;
                                  }
                              } else {
                                  // �X�V�������s�F�Ώۃf�[�^�����݂��܂���
                   Message = "T_EXTERNAL_PLAN.OD_NO:" + delStruct.geth_OD_NO();
                   setErrorMessage("ZZ06001", Message);
                                  result = false;
                                  break;
                              }
                          }
              
                     } catch(SQLException e) {
                         setSqlExceptionMsg(e);
              
                      } finally {
                          try {
                              if(result) {
                                  // �R�~�b�g
                                  conn.commit();
              
                                  // �폜��̍Č���
                                  controlselect();
                              } else {
                                  // ���[���o�b�N
                                  getMessage().clearWarn();
                                  getMessage().clearInfo();
                                  conn.rollback();
                              }
                          } catch(Exception e) {
                              e.printStackTrace();
                          }
                       
                      }
              
                //}}user_implement_dev:<controldelete>
		logger.exiting("AC0080010Control"+":USER="+struct.getsUser_ID(),"controldelete");

		return;
	}

	/**
	 * �S�I���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlchoiceAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0080");
		logger.entering("AC0080010Control"+":USER="+struct.getsUser_ID(),"controlchoiceAll");
			//{{user_implement_dev:<controlchoiceAll>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlchoiceAll>
		logger.exiting("AC0080010Control"+":USER="+struct.getsUser_ID(),"controlchoiceAll");

		return;
	}

	/**
	 * �S�����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlcancelAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0080");
		logger.entering("AC0080010Control"+":USER="+struct.getsUser_ID(),"controlcancelAll");
			//{{user_implement_dev:<controlcancelAll>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlcancelAll>
		logger.exiting("AC0080010Control"+":USER="+struct.getsUser_ID(),"controlcancelAll");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0080");
		logger.entering("AC0080010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                          
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AC0080010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0080");
		logger.entering("AC0080010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                      //------------------------------------------------------------------
              
                try {
              
                          // �R���{�{�b�N�X�f�[�^�p��
                          ComboBox controller = new ComboBox(conn, sysUSER_CD);
                          // OD_COMBO_TYP�̕�����Œ�`���ꂽ�f�[�^��ComboStruct�^�ɐݒ�
                          _ODR_DMD_TYP = controller.getData("ODR_DMD_TYP");            // �I�[�_�f�}���h�敪(�����w��)
                          _OD_COMBO_TYP = controller.getData("OD_TYP");                // �I�[�_�f�}���h�敪
                          _OUTSIDE_COMBO_TYP = controller.getData("OUTSIDE_TYP");      // ���O��敪
                          _ODR_STS_TYP = controller.getData("ODR_STS_TYP");            // �I�[�_��ԋ敪
                          _DM_STS_TYP = controller.getData("DM_STS_TYP");              // �f�}���h��ԋ敪
              
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
                      //------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AC0080010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0080");
		logger.entering("AC0080010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
                 // �_�E�����[�h�t�@�C�����N���A
                 // PDF�ECSV�̃_�E�����[�h���s���Ƃ��́A��ʏ��OrHidden�ŁuDOWNLOAD_FILE�v���`���A���̍s�̃R�����g���O���Ă��������B
                 struct.setDOWNLOAD_FILE((String)null);
                 // �R���{�{�b�N�X���i�̃f�[�^�̃Z�b�g�͂����ɋL�q���Ă��������B
                 // �R���{�{�b�N�X�f�[�^�p��
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AC0080010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("csv") ) {
				controlcsv();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("delete") ) {
				controldelete();
			} else if( button.equals("choiceAll") ) {
				controlchoiceAll();
			} else if( button.equals("cancelAll") ) {
				controlcancelAll();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
                      //------------------------------------------------------------------
                          // �R���{�{�b�N�X�f�[�^�ݒ�
                          struct.setList_w_OD_TYP_val(_ODR_DMD_TYP.getValList());
                          struct.setList_w_OD_TYP_name(_ODR_DMD_TYP.getExplanList());
                          struct.setList_OD_TYP_val(_OD_COMBO_TYP.getValList());
						  struct.setList_OD_TYP_name(_OD_COMBO_TYP.getExplanList());
                          struct.setList_OUTSIDE_TYP_val(_OUTSIDE_COMBO_TYP.getValList());
                          struct.setList_OUTSIDE_TYP_name(_OUTSIDE_COMBO_TYP.getExplanList());
                          struct.setList_ODR_STS_TYP_val(_ODR_STS_TYP.getValList());
                          struct.setList_ODR_STS_TYP_name(_ODR_STS_TYP.getExplanList());
                          struct.setList_DM_STS_TYP_val(_DM_STS_TYP.getValList());
                          struct.setList_DM_STS_TYP_name(_DM_STS_TYP.getExplanList());
              
                } catch(AlarmMessageException ame){
                 ExpjException ee = new ExpjException(ame, (ExpjMessageList)(ame.getMessages()));
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
//			throw new FoundationException("AC0080010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0080010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AC0080010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0080010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AC0080010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                          
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0080010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AC0080010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AC0080010Entity entity;
	protected AC0080010Struct struct;
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

		entity = new AC0080010Entity();
		struct = new AC0080010Struct();

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
	 * AC0080010�N���X�̕W���R���X�g���N�^
	 */
	public AC0080010Control() throws BusinessProcessException, FoundationException
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
				AC0080010Struct key = (AC0080010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("w_DATE_FROM") && key.getw_DATE_FROM() != null) {
					msgKey.setKeyValue("w_DATE_FROM", key.getw_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("w_DATE_TO") && key.getw_DATE_TO() != null) {
					msgKey.setKeyValue("w_DATE_TO", key.getw_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("w_OD_TYP") && key.getw_OD_TYP() != null) {
					msgKey.setKeyValue("w_OD_TYP", key.getw_OD_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_OD_TYP_name") && key.getw_OD_TYP_name() != null) {
					msgKey.setKeyValue("w_OD_TYP_name", key.getw_OD_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("w_OD_TYP_val") && key.getw_OD_TYP_val() != null) {
					msgKey.setKeyValue("w_OD_TYP_val", key.getw_OD_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("OD_TYP") && key.getOD_TYP() != null) {
					msgKey.setKeyValue("OD_TYP", key.getOD_TYP());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_DEMAND_FLG") && key.geth_DEMAND_FLG() != null) {
					msgKey.setKeyValue("h_DEMAND_FLG", key.geth_DEMAND_FLG());
				}
				if(msgKeyType.containsKeyColumn("ODR_DM_QTY") && key.getODR_DM_QTY() != null) {
					msgKey.setKeyValue("ODR_DM_QTY", key.getODR_DM_QTY());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_DMD_TYP") && key.geth_ODR_DMD_TYP() != null) {
					msgKey.setKeyValue("h_ODR_DMD_TYP", key.geth_ODR_DMD_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_STS_TYP") && key.getw_STS_TYP() != null) {
					msgKey.setKeyValue("w_STS_TYP", key.getw_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("c_UN_CONNECT_DEMAND") && key.getc_UN_CONNECT_DEMAND() != null) {
					msgKey.setKeyValue("c_UN_CONNECT_DEMAND", key.getc_UN_CONNECT_DEMAND());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("w_TIME_FROM") && key.getw_TIME_FROM() != null) {
					msgKey.setKeyValue("w_TIME_FROM", key.getw_TIME_FROM());
				}
				if(msgKeyType.containsKeyColumn("w_TIME_TO") && key.getw_TIME_TO() != null) {
					msgKey.setKeyValue("w_TIME_TO", key.getw_TIME_TO());
				}
				if(msgKeyType.containsKeyColumn("s_MIN_CAL_DATE") && key.gets_MIN_CAL_DATE() != null) {
					msgKey.setKeyValue("s_MIN_CAL_DATE", key.gets_MIN_CAL_DATE());
				}
				if(msgKeyType.containsKeyColumn("s_MAX_CAL_DATE") && key.gets_MAX_CAL_DATE() != null) {
					msgKey.setKeyValue("s_MAX_CAL_DATE", key.gets_MAX_CAL_DATE());
				}
				if(msgKeyType.containsKeyColumn("s_PLANT_CD") && key.gets_PLANT_CD() != null) {
					msgKey.setKeyValue("s_PLANT_CD", key.gets_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("s_OD_TYP") && key.gets_OD_TYP() != null) {
					msgKey.setKeyValue("s_OD_TYP", key.gets_OD_TYP());
				}
				if(msgKeyType.containsKeyColumn("OD_TYP_name") && key.getOD_TYP_name() != null) {
					msgKey.setKeyValue("OD_TYP_name", key.getOD_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("OD_TYP_val") && key.getOD_TYP_val() != null) {
					msgKey.setKeyValue("OD_TYP_val", key.getOD_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("s_OUTSIDE_TYP") && key.gets_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("s_OUTSIDE_TYP", key.gets_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_name") && key.getOUTSIDE_TYP_name() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_name", key.getOUTSIDE_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_val") && key.getOUTSIDE_TYP_val() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_val", key.getOUTSIDE_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("s_BUSINESS_DATE") && key.gets_BUSINESS_DATE() != null) {
					msgKey.setKeyValue("s_BUSINESS_DATE", key.gets_BUSINESS_DATE());
				}
				if(msgKeyType.containsKeyColumn("s_UN_CONNECT_DEMAND") && key.gets_UN_CONNECT_DEMAND() != null) {
					msgKey.setKeyValue("s_UN_CONNECT_DEMAND", key.gets_UN_CONNECT_DEMAND());
				}
				if(msgKeyType.containsKeyColumn("s_ODR_DMD_TYP1") && key.gets_ODR_DMD_TYP1() != null) {
					msgKey.setKeyValue("s_ODR_DMD_TYP1", key.gets_ODR_DMD_TYP1());
				}
				if(msgKeyType.containsKeyColumn("s_ODR_DMD_TYP2") && key.gets_ODR_DMD_TYP2() != null) {
					msgKey.setKeyValue("s_ODR_DMD_TYP2", key.gets_ODR_DMD_TYP2());
				}
				if(msgKeyType.containsKeyColumn("w_ODR_STS_TYP") && key.getw_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("w_ODR_STS_TYP", key.getw_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_DM_STS_TYP") && key.getw_DM_STS_TYP() != null) {
					msgKey.setKeyValue("w_DM_STS_TYP", key.getw_DM_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("ODR_STS_TYP_name") && key.getODR_STS_TYP_name() != null) {
					msgKey.setKeyValue("ODR_STS_TYP_name", key.getODR_STS_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("ODR_STS_TYP_val") && key.getODR_STS_TYP_val() != null) {
					msgKey.setKeyValue("ODR_STS_TYP_val", key.getODR_STS_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("DM_STS_TYP_name") && key.getDM_STS_TYP_name() != null) {
					msgKey.setKeyValue("DM_STS_TYP_name", key.getDM_STS_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("DM_STS_TYP_val") && key.getDM_STS_TYP_val() != null) {
					msgKey.setKeyValue("DM_STS_TYP_val", key.getDM_STS_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("h_OD_NO") && key.geth_OD_NO() != null) {
					msgKey.setKeyValue("h_OD_NO", key.geth_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("h_PARENT_OD_NO") && key.geth_PARENT_OD_NO() != null) {
					msgKey.setKeyValue("h_PARENT_OD_NO", key.geth_PARENT_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("PRD_DUE_DATE") && key.getPRD_DUE_DATE() != null) {
					msgKey.setKeyValue("PRD_DUE_DATE", key.getPRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("ODR_QTY") && key.getODR_QTY() != null) {
					msgKey.setKeyValue("ODR_QTY", key.getODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("DM_QTY") && key.getDM_QTY() != null) {
					msgKey.setKeyValue("DM_QTY", key.getDM_QTY());
				}
				if(msgKeyType.containsKeyColumn("EXTERNAL_PLAN_CD") && key.getEXTERNAL_PLAN_CD() != null) {
					msgKey.setKeyValue("EXTERNAL_PLAN_CD", key.getEXTERNAL_PLAN_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("EX_MODIFY_COUNT") && key.getEX_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("EX_MODIFY_COUNT", key.getEX_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("OD_MODIFY_COUNT") && key.getOD_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("OD_MODIFY_COUNT", key.getOD_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_CD") && key.getw_ITEM_CD() != null) {
					msgKey.setKeyValue("w_ITEM_CD", key.getw_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_CD") && key.getw_PLANT_CD() != null) {
					msgKey.setKeyValue("w_PLANT_CD", key.getw_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("w_DATE_FROM_ALL") && key.getw_DATE_FROM_ALL() != null) {
					msgKey.setKeyValue("w_DATE_FROM_ALL", key.getw_DATE_FROM_ALL());
				}
				if(msgKeyType.containsKeyColumn("w_DATE_TO_ALL") && key.getw_DATE_TO_ALL() != null) {
					msgKey.setKeyValue("w_DATE_TO_ALL", key.getw_DATE_TO_ALL());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
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
					AC0080010Struct key = new AC0080010Struct();
					if(msgKeyType.containsKeyColumn("w_DATE_FROM")) {
						key.setw_DATE_FROM(msgKey.getKeyValue("w_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("w_DATE_TO")) {
						key.setw_DATE_TO(msgKey.getKeyValue("w_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("w_OD_TYP")) {
						key.setw_OD_TYP(msgKey.getKeyValue("w_OD_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_OD_TYP_name")) {
						key.setw_OD_TYP_name(msgKey.getKeyValue("w_OD_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("w_OD_TYP_val")) {
						key.setw_OD_TYP_val(msgKey.getKeyValue("w_OD_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("OD_TYP")) {
						key.setOD_TYP(msgKey.getKeyValue("OD_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(msgKey.getKeyValue("OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_DEMAND_FLG")) {
						key.seth_DEMAND_FLG(msgKey.getKeyValue("h_DEMAND_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ODR_DM_QTY")) {
						key.setODR_DM_QTY(msgKey.getKeyValue("ODR_DM_QTY"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_DMD_TYP")) {
						key.seth_ODR_DMD_TYP(msgKey.getKeyValue("h_ODR_DMD_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_STS_TYP")) {
						key.setw_STS_TYP(msgKey.getKeyValue("w_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("c_UN_CONNECT_DEMAND")) {
						key.setc_UN_CONNECT_DEMAND(msgKey.getKeyValue("c_UN_CONNECT_DEMAND"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("w_TIME_FROM")) {
						key.setw_TIME_FROM(msgKey.getKeyValue("w_TIME_FROM"));
					}
					if(msgKeyType.containsKeyColumn("w_TIME_TO")) {
						key.setw_TIME_TO(msgKey.getKeyValue("w_TIME_TO"));
					}
					if(msgKeyType.containsKeyColumn("s_MIN_CAL_DATE")) {
						key.sets_MIN_CAL_DATE(msgKey.getKeyValue("s_MIN_CAL_DATE"));
					}
					if(msgKeyType.containsKeyColumn("s_MAX_CAL_DATE")) {
						key.sets_MAX_CAL_DATE(msgKey.getKeyValue("s_MAX_CAL_DATE"));
					}
					if(msgKeyType.containsKeyColumn("s_PLANT_CD")) {
						key.sets_PLANT_CD(msgKey.getKeyValue("s_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("s_OD_TYP")) {
						key.sets_OD_TYP(msgKey.getKeyValue("s_OD_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OD_TYP_name")) {
						key.setOD_TYP_name(msgKey.getKeyValue("OD_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("OD_TYP_val")) {
						key.setOD_TYP_val(msgKey.getKeyValue("OD_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("s_OUTSIDE_TYP")) {
						key.sets_OUTSIDE_TYP(msgKey.getKeyValue("s_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_name")) {
						key.setOUTSIDE_TYP_name(msgKey.getKeyValue("OUTSIDE_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_val")) {
						key.setOUTSIDE_TYP_val(msgKey.getKeyValue("OUTSIDE_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("s_BUSINESS_DATE")) {
						key.sets_BUSINESS_DATE(msgKey.getKeyValue("s_BUSINESS_DATE"));
					}
					if(msgKeyType.containsKeyColumn("s_UN_CONNECT_DEMAND")) {
						key.sets_UN_CONNECT_DEMAND(msgKey.getKeyValue("s_UN_CONNECT_DEMAND"));
					}
					if(msgKeyType.containsKeyColumn("s_ODR_DMD_TYP1")) {
						key.sets_ODR_DMD_TYP1(msgKey.getKeyValue("s_ODR_DMD_TYP1"));
					}
					if(msgKeyType.containsKeyColumn("s_ODR_DMD_TYP2")) {
						key.sets_ODR_DMD_TYP2(msgKey.getKeyValue("s_ODR_DMD_TYP2"));
					}
					if(msgKeyType.containsKeyColumn("w_ODR_STS_TYP")) {
						key.setw_ODR_STS_TYP(msgKey.getKeyValue("w_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_DM_STS_TYP")) {
						key.setw_DM_STS_TYP(msgKey.getKeyValue("w_DM_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ODR_STS_TYP_name")) {
						key.setODR_STS_TYP_name(msgKey.getKeyValue("ODR_STS_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("ODR_STS_TYP_val")) {
						key.setODR_STS_TYP_val(msgKey.getKeyValue("ODR_STS_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("DM_STS_TYP_name")) {
						key.setDM_STS_TYP_name(msgKey.getKeyValue("DM_STS_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("DM_STS_TYP_val")) {
						key.setDM_STS_TYP_val(msgKey.getKeyValue("DM_STS_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("h_OD_NO")) {
						key.seth_OD_NO(msgKey.getKeyValue("h_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_PARENT_OD_NO")) {
						key.seth_PARENT_OD_NO(msgKey.getKeyValue("h_PARENT_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("PRD_DUE_DATE")) {
						key.setPRD_DUE_DATE(msgKey.getKeyValue("PRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_QTY")) {
						key.setODR_QTY(msgKey.getKeyValue("ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("DM_QTY")) {
						key.setDM_QTY(msgKey.getKeyValue("DM_QTY"));
					}
					if(msgKeyType.containsKeyColumn("EXTERNAL_PLAN_CD")) {
						key.setEXTERNAL_PLAN_CD(msgKey.getKeyValue("EXTERNAL_PLAN_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("EX_MODIFY_COUNT")) {
						key.setEX_MODIFY_COUNT(msgKey.getKeyValue("EX_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("OD_MODIFY_COUNT")) {
						key.setOD_MODIFY_COUNT(msgKey.getKeyValue("OD_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_CD")) {
						key.setw_ITEM_CD(msgKey.getKeyValue("w_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_CD")) {
						key.setw_PLANT_CD(msgKey.getKeyValue("w_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_DATE_FROM_ALL")) {
						key.setw_DATE_FROM_ALL(msgKey.getKeyValue("w_DATE_FROM_ALL"));
					}
					if(msgKeyType.containsKeyColumn("w_DATE_TO_ALL")) {
						key.setw_DATE_TO_ALL(msgKey.getKeyValue("w_DATE_TO_ALL"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
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
