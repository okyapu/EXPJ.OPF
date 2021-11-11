/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AZ0020/src/com/nec/jp/orteus/metamorBase/AZ0020/AZ0020010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AZ0020;

import com.nec.jp.orteus.metamorBase.AZ0020.*;
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
import java.util.ArrayList;
//import com.nec.jp.orteus.metamorBase.util.BusinessLock.BusinessLock;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
//------------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AZ0020010Control
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
              
               public AZ0020010Struct getStruct() { return this.struct; }	// Struct�̒l�i���f�B�G�[�^�j��Ԃ��܂��B
              
               
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
              
               //------------------------------------------------------------------------
              
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
              
               //------------------------------------------------------------------------
               /** ��ʋ��ʒ�`�擾�N���X */
               ScreenParam _scParam = sp;
              
               //------------------------------------------------------------------------
              
               /** 
                * �擾�����f�[�^���ꎞ�ޔ�p���X�g�ɃZ�b�g
                *
                * @param read_struct �e�[�u�����Ǎ��񂾃f�[�^
                * @param temp_struct �ꎞ�ޔ�p���X�g
                */
               private void set_struct(AZ0020010Struct read_struct, AZ0020010Struct temp_struct)
               {
                // �L�����Z���R�[�h
                temp_struct.setCANCEL_CD(read_struct.getCANCEL_CD());
              
                // ���b�N���s����
                temp_struct.setCREATE_DATE(read_struct.getCREATE_DATE());
              
                // ���b�N���s���[�U
                temp_struct.setUSER_NAME(read_struct.getUSER_NAME());
              
                // �Ɩ����b�N��
                temp_struct.setMODE_FORM_FROM_NAME(read_struct.getMODE_FORM_FROM_NAME());
              
                // ���b�N�H���
                temp_struct.l_PLANT_CD.add(read_struct.getPLANT_CD());
                temp_struct.l_LIST_PLANT_NAME.add(read_struct.getPLANT_NAME());
              
                // �Ɩ����b�N��
                temp_struct.l_LIST_TO_BUSINESS_NAME.add(read_struct.getMODE_FORM_TO_NAME());
               }
               
               /** 
                * �Ǎ��f�[�^�o�^����
                *
                * @param temp_struct �ꎞ�ޔ�p���X�g
                */
               private void regist_struct(AZ0020010Struct temp_struct) {
                AZ0020010Struct add_struct = new AZ0020010Struct();
              
                add_struct.copy(temp_struct);
              
                _disp.add(add_struct);
               }
               
               //--------------------------------------------------------------------------
               // ��ʂ̈ꗗ�����\���p���X�g
               private List _disp  = new ArrayList();
               
               /** �ꗗ�\�����X�g�擾 
               * @return �ꗗ�\�����X�g
               */
               public List getDispList(){ return _disp; }
               
               //------------------------------------------------------------------------
                
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
                ee.setLocale(CoreTools.getLocale(getsysUSER_CD()));
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
                * �G���[���b�Z�[�W�ݒ�(�L�[�o�͂Ȃ�)
                * @param ���b�Z�[�W�ԍ�
                * @param �o�̓��b�Z�[�W
                */
               private void setErrorMessageNoKey(String messageno)
               {
                ExpjMessage emsg = new ExpjMessage( messageno );
                msgStruct.addError( emsg );
                sysLog.warning(emsg, getsysUSER_CD());
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0020");
		logger.entering("AZ0020010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
                             //------------------------------------------------------------------
                             
                             String Message = "";
                             setReadStatus(INITIAL);
                           
                             try {
                              // �`�F�b�N�{�b�N�X�I���`�F�b�N
                              if(struct.geth_USER_CD().equals("0")) {
                               struct.setUSER_CD(null);
                              }
                           
                              // �ǂݍ��ݏ���
                              list = entity.mselect.read(conn, struct);
                           
                              // �\���p���X�g�̏�����
                              _disp.clear();
                           
                              // ��������0���̏ꍇ
                              if(list.size() <= 0){
                               // ���O�o�͏���
                               setInfoMessage("ZZ06001", "");
                               
                              } else {
                               AZ0020010Struct read_struct = new AZ0020010Struct();
                               AZ0020010Struct temp_struct = new AZ0020010Struct();
                           
                               for(int cnt=0; cnt < list.size(); cnt++){
                                read_struct = (AZ0020010Struct)list.get(cnt);
                           
                                if(cnt == 0) {
                                 set_struct(read_struct, temp_struct);
                                 if(list.size() == 1) {
                                  // ���X�g�ǉ�����
                                  _disp.add(temp_struct);
                                 }
                                } else {
                                 // �L�����Z���R�[�h�������ꍇ
                                 if(temp_struct.getCANCEL_CD().equals(read_struct.getCANCEL_CD())) {
                                  // ���b�N�H���
                                  temp_struct.l_PLANT_CD.add(read_struct.getPLANT_CD());
                                  temp_struct.l_LIST_PLANT_NAME.add(read_struct.getPLANT_NAME());
                           
                                  // �Ɩ����b�N��
                                  temp_struct.l_LIST_TO_BUSINESS_NAME.add(read_struct.getMODE_FORM_TO_NAME());
                           
                                  if(cnt == (list.size()-1)) {
                                   regist_struct(temp_struct);	
                                  }
                                 } else {
                                  regist_struct(temp_struct);
                           
                                  temp_struct.l_LIST_PLANT_NAME.clear();
                                  temp_struct.l_LIST_TO_BUSINESS_NAME.clear();
                                  
                                  set_struct(read_struct, temp_struct);
                                  
                                  if(cnt == (list.size()-1)) {
                                   regist_struct(temp_struct);
                                  }
                                 }
                                }
                               }
                              }
                           
                              // ���[�h�ݒ�
                              _mode = _SELECT;
                           
                             } catch(SQLException e) {
                              setSqlExceptionMsg(e);
                             }
                           
                //}}user_implement_dev:<controlselect>
		logger.exiting("AZ0020010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * �I�������{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0020");
		logger.entering("AZ0020010Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
                             //------------------------------------------------------------------
                              
                             try {
                           
                              IDbConnection con = null;
                              con = CoreTools.getTransConnection();
                              
                              // ���������[�v
                              for(int i=0; i<getDispList().size(); i++){
                               
                               // _disp���X�g��1���ڂ��擾
                               AZ0020010Struct temp_struct = (AZ0020010Struct)getDispList().get(i);
                           
                               // DELETE�t���O�`�F�b�N
                               if(temp_struct.getDELETE_FLG().equals("1")){
                                BusinessLock lock = new BusinessLock(con, getsysUSER_CD(), getsysPLANT_CD());
                                boolean result = lock.doUnLock(temp_struct.getMODE_FORM_FROM_NAME(), Integer.parseInt(temp_struct.getCANCEL_CD()));
                           
                                // �G���[�̏ꍇ
                                if(result == false){
                                 setErrorMessageNoKey("AZ00007");
                                 
                                 break;
                                }
                               }
                              }
                           
                              // �G���[���Ȃ��ꍇ�A�폜����
                              if(msgStruct.sizeError() <= 0){
                               // �ŐV�̏�Ԃ�Ǎ���
                               controlselect();
                              }
                              
                              if(con != null) {
                               CoreTools.closeTransConnection(con);
                              }
                           
                             } catch(Exception e){
                              ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                              sysLog.severe(emsg, getsysUSER_CD());
                              ExpjException ee = new ExpjException(e, emsg);
                              ee.setLocale(CoreTools.getLocale(getsysUSER_CD()));
                              throw ee;
                             }
                             
                //}}user_implement_dev:<controlupdate>
		logger.exiting("AZ0020010Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0020");
		logger.entering("AZ0020010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
                             //------------------------------------------------------------------
                           
                             _disp.clear();
                           
                             this.struct.clear();
                             this.struct.init();
                           
                             // ���[�h�ݒ�
                             _mode = _NORMAL;
                             setReadStatus(INITIAL);
                           
                              //------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AZ0020010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0020");
		logger.entering("AZ0020010Control"+":USER="+struct.getsUser_ID(),"controlclose");
			//{{user_implement_dev:<controlclose>
                             //------------------------------------------------------------------
                             this.controlclear();
                              
                             // ���[�h�ݒ�
                             _mode = _CLOSE;
                           
                //}}user_implement_dev:<controlclose>
		logger.exiting("AZ0020010Control"+":USER="+struct.getsUser_ID(),"controlclose");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0020");
		logger.entering("AZ0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AZ0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0020");
		logger.entering("AZ0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                              //------------------------------------------------------------------
                              this.controlclear();
                              //------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AZ0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0020");
		logger.entering("AZ0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
                               // �_�E�����[�h�t�@�C�����N���A
                               // PDF�ECSV�̃_�E�����[�h���s���Ƃ��́A��ʏ��OrHidden�ŁuDOWNLOAD_FILE�v���`���A���̍s�̃R�����g���O���Ă��������B
                            //			struct.setDOWNLOAD_FILE((String)null);
                               // �R���{�{�b�N�X���i�̃f�[�^�̃Z�b�g�͂����ɋL�q���Ă��������B
                               // �R���{�{�b�N�X�f�[�^�p��
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AZ0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("close") ) {
				controlclose();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
                              } catch(AlarmMessageException ame){
                               ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
                               ee.setLocale(CoreTools.getLocale(getsysUSER_CD()));
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
//			throw new FoundationException("AZ0020010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AZ0020010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AZ0020010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AZ0020010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AZ0020010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AZ0020010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AZ0020010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AZ0020010Entity entity;
	protected AZ0020010Struct struct;
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

		entity = new AZ0020010Entity();
		struct = new AZ0020010Struct();

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
	 * AZ0020010�N���X�̕W���R���X�g���N�^
	 */
	public AZ0020010Control() throws BusinessProcessException, FoundationException
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
				AZ0020010Struct key = (AZ0020010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("h_USER_CD") && key.geth_USER_CD() != null) {
					msgKey.setKeyValue("h_USER_CD", key.geth_USER_CD());
				}
				if(msgKeyType.containsKeyColumn("FROM_BUSINESS_NAME") && key.getFROM_BUSINESS_NAME() != null) {
					msgKey.setKeyValue("FROM_BUSINESS_NAME", key.getFROM_BUSINESS_NAME());
				}
				if(msgKeyType.containsKeyColumn("TO_BUSINESS_NAME") && key.getTO_BUSINESS_NAME() != null) {
					msgKey.setKeyValue("TO_BUSINESS_NAME", key.getTO_BUSINESS_NAME());
				}
				if(msgKeyType.containsKeyColumn("LIST_PLANT_NAME") && key.getLIST_PLANT_NAME() != null) {
					msgKey.setKeyValue("LIST_PLANT_NAME", key.getLIST_PLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("LIST_TO_BUSINESS_NAME") && key.getLIST_TO_BUSINESS_NAME() != null) {
					msgKey.setKeyValue("LIST_TO_BUSINESS_NAME", key.getLIST_TO_BUSINESS_NAME());
				}
				if(msgKeyType.containsKeyColumn("DELETE_FLG") && key.getDELETE_FLG() != null) {
					msgKey.setKeyValue("DELETE_FLG", key.getDELETE_FLG());
				}
				if(msgKeyType.containsKeyColumn("MODE_FORM_FROM_NAME") && key.getMODE_FORM_FROM_NAME() != null) {
					msgKey.setKeyValue("MODE_FORM_FROM_NAME", key.getMODE_FORM_FROM_NAME());
				}
				if(msgKeyType.containsKeyColumn("MODE_FORM_TO_NAME") && key.getMODE_FORM_TO_NAME() != null) {
					msgKey.setKeyValue("MODE_FORM_TO_NAME", key.getMODE_FORM_TO_NAME());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("CANCEL_CD") && key.getCANCEL_CD() != null) {
					msgKey.setKeyValue("CANCEL_CD", key.getCANCEL_CD());
				}
				if(msgKeyType.containsKeyColumn("CREATE_DATE") && key.getCREATE_DATE() != null) {
					msgKey.setKeyValue("CREATE_DATE", key.getCREATE_DATE());
				}
				if(msgKeyType.containsKeyColumn("USER_NAME") && key.getUSER_NAME() != null) {
					msgKey.setKeyValue("USER_NAME", key.getUSER_NAME());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("USER_CD") && key.getUSER_CD() != null) {
					msgKey.setKeyValue("USER_CD", key.getUSER_CD());
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
					AZ0020010Struct key = new AZ0020010Struct();
					if(msgKeyType.containsKeyColumn("h_USER_CD")) {
						key.seth_USER_CD(msgKey.getKeyValue("h_USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("FROM_BUSINESS_NAME")) {
						key.setFROM_BUSINESS_NAME(msgKey.getKeyValue("FROM_BUSINESS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("TO_BUSINESS_NAME")) {
						key.setTO_BUSINESS_NAME(msgKey.getKeyValue("TO_BUSINESS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("LIST_PLANT_NAME")) {
						key.setLIST_PLANT_NAME(msgKey.getKeyValue("LIST_PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("LIST_TO_BUSINESS_NAME")) {
						key.setLIST_TO_BUSINESS_NAME(msgKey.getKeyValue("LIST_TO_BUSINESS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DELETE_FLG")) {
						key.setDELETE_FLG(msgKey.getKeyValue("DELETE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("MODE_FORM_FROM_NAME")) {
						key.setMODE_FORM_FROM_NAME(msgKey.getKeyValue("MODE_FORM_FROM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MODE_FORM_TO_NAME")) {
						key.setMODE_FORM_TO_NAME(msgKey.getKeyValue("MODE_FORM_TO_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("CANCEL_CD")) {
						key.setCANCEL_CD(msgKey.getKeyValue("CANCEL_CD"));
					}
					if(msgKeyType.containsKeyColumn("CREATE_DATE")) {
						key.setCREATE_DATE(msgKey.getKeyValue("CREATE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("USER_NAME")) {
						key.setUSER_NAME(msgKey.getKeyValue("USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("USER_CD")) {
						key.setUSER_CD(msgKey.getKeyValue("USER_CD"));
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
