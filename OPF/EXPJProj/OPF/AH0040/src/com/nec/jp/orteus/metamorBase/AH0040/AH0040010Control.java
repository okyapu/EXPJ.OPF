/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AH0040/src/com/nec/jp/orteus/metamorBase/AH0040/AH0040010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AH0040;

import com.nec.jp.orteus.metamorBase.AH0040.*;
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
import com.nec.jp.orteus.metamorBase.common01.Inventry.InvAccessor;
import com.nec.jp.orteus.metamorBase.common01.Inventry.InvDeleteProcess;
import com.nec.jp.orteus.metamorBase.common01.Inventry.InvInformation;
import com.nec.jp.orteus.metamorBase.common01.Inventry.InvMessageControl;
import com.nec.jp.orteus.metamorBase.common01.Inventry.InvMessageInformation;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
import com.nec.jp.orteus.metamorBase.common01.util.DateConverter;
//------------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AH0040010Control
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
       
        public AH0040010Struct getStruct() { return this.struct; }	// Struct�̒l�i���f�B�G�[�^�j��Ԃ��܂��B
       
        //------------------------------------------------------------------------------
       
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
       
        //------------------------------------------------------------------
       
        /**
         * �`�F�b�N�{�b�N�X�l�ϊ��擾����
         * �w�肳�ꂽ������"1"�̏ꍇ��"true"��Ԃ��A����ȊO��""��Ԃ�
         *
         * @return �`�F�b�N����: "true" / �`�F�b�N�Ȃ�: "false"
         */
        public String convCheckBoxValue(String strValue)
        {
         String strCheckBoxValue = "";
         if( (strValue != null) && ("1".equals(strValue) == true) )
         {
          strCheckBoxValue = "true";
         }
         return strCheckBoxValue;
        }
       
        //------------------------------------------------------------------
       
        /**
         * �I���A�N�Z�b�T�ɂ�鏈�����ʃ��b�Z�[�W�o�͏���
         *
         * @param	invAccessor	�I���A�N�Z�b�T�N���X
         * @return	�Ȃ�
         */
        private void resultMessageByInvAccessor(
         InvAccessor invAccessor) throws ExpjException
        {
         InvMessageInformation invMessageInfo = null;
         InvMessageControl msg = invAccessor.getMessage();
         String strResultCode = "";
         String strResultNote = "";
         for(int i = 0; ((invMessageInfo = msg.get(i)) != null); i++)
         {
          int intMessageParenTyp = invMessageInfo.getParentType();
          int intMessageTyp = invMessageInfo.getType();
          strResultCode = invMessageInfo.getCode();
          strResultNote = invMessageInfo.getNote();
          if(intMessageParenTyp == InvMessageControl.TYP_ERROR)
          {
           
           ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
           sysLog.severe(emsg, getsysUSER_CD());
           ExpjException ee = new ExpjException(emsg);
           setErrorLogMessage(strResultNote);
           
           throw ee;
          }
          else if(intMessageParenTyp == InvMessageControl.TYP_WARN)
          {
           if(strResultCode != null && "".equals(strResultCode) != true)
           {
            setWarnMessage(strResultCode);
           }
           setWarnLogMessage(strResultNote);
          }
          else if(intMessageParenTyp == InvMessageControl.TYP_INFO)
          {
           if(strResultCode != null && "".equals(strResultCode) != true)
           {
            setInfoMessage(strResultCode);
           }
           setInfoLogMessage(strResultNote);
          }
          else
          {
           setInfoLogMessage(strResultNote);
          }
         }
         return;
        }
        //------------------------------------------------------------------
       
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
       
        /** �I����ԋ敪 */
        private ComboStruct _comboInvStsTyp = new ComboStruct();
       
        /**
         * �I����ԋ敪���擾
         *
         * @param	strTyp	�敪�R�[�h
         * @return	�敪����(�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�)
         */
        private String getInvStsTypName(String strTyp)
        {
         return (getTypName(_comboInvStsTyp, strTyp));
        }
       
       
        //------------------------------------------------------------------
       
        /**
         * �I�����Ԓ��f�[�^�Ǎ�����
         *
         * @return	�ŐV�̓Ǎ����:�ُ�Ȃ� / null:�G���[
         */
        private AH0040010Struct readInvCtrl4StsTyp1() throws FoundationException, SQLException
        {
         String Message = "";
         
         // �����Ɋ֘A����p�����[�^��ݒ�
         AH0040010Struct structTarget = new AH0040010Struct();
         structTarget.setPLANT_CD(getsysPLANT_CD());
       
         // �Ǎ����s
         List listRead = new ArrayList(0);
         listRead = entity.mT_INV_CTRL_INV_STS_TYP1.read(conn, structTarget);
       
         // �I�����Ԓ��f�[�^���݃`�F�b�N
         AH0040010Struct structRead = null;
         if(listRead.size() > 0)
         {
          // �P���ڂ̓Ǎ����擾
          structRead = new AH0040010Struct();
          structRead = (AH0040010Struct)listRead.get(0);
          Message= "readInvCtrl4StsTyp1 DATA COUNT:" + listRead.size();
          setInfoLogMessage(Message);
         }
         return structRead;
        }
       
       
        /**
         * �I�����{�O�f�[�^�Ǎ�����
         *
         * @return	�ŐV�̓Ǎ����:�ُ�Ȃ� / null:�G���[
         */
        private AH0040010Struct readInvCtrl4StsTyp0() throws FoundationException, SQLException
        {
         String Message = "";
         List listMessage = new ArrayList();
         
         // �����Ɋ֘A����p�����[�^��ݒ�
         AH0040010Struct structTarget = new AH0040010Struct();
         structTarget.setPLANT_CD(getsysPLANT_CD());
       
         // �Ǎ����s
         List listRead = new ArrayList(0);
         listRead = entity.mT_INV_CTRL_INV_STS_TYP0.read(conn, structTarget);
       
         // �I�����{�O�f�[�^���݃`�F�b�N
         AH0040010Struct structRead = null;
         if(listRead.size() <= 0)
         {
          // �I�����{�O�f�[�^�����݂��Ȃ�
          listMessage.add("T_INV_CTRL.PLANT_CD:" + getsysPLANT_CD());
          listMessage.add("T_INV_CTRL.INV_STS_TYP:0");
          setErrorMessage("AH00035", listMessage);
         }
         else
         {
          // �P���ڂ̓Ǎ����擾
          structRead = new AH0040010Struct();
          structRead = (AH0040010Struct)listRead.get(0);
          Message= "readInvCtrl4StsTyp0 DATA COUNT:" + listRead.size();
          setInfoLogMessage(Message);
         }
         return structRead;
        }
       
        /**
         * �w��I�����ȊO�̒I�����Ԓ��f�[�^�Ǎ�����
         *
         * @param	structTarget	�Ώۃf�[�^���
         * @return	�ŐV�̓Ǎ����:�ُ�Ȃ� / null:�G���[
         */
        private AH0040010Struct readInvCtrl4StsTyp1AndNotTargetInvDate(AH0040010Struct structTarget) throws FoundationException, SQLException
        {
         List listMessage = new ArrayList();
         
         // �Ǎ����s
         List listRead = new ArrayList(0);
         listRead = entity.mT_INV_CTRL_INV_STS_TYP1_AndNotTargetInvDate.read(conn, structTarget);
       
         // �w��I�����ȊO�̒I�����Ԓ��f�[�^���݃`�F�b�N
         AH0040010Struct structRead = null;
         if(listRead.size() > 0)
         {
          // �w��I�����ȊO�̒I�����Ԓ��f�[�^������
          listMessage.add("T_INV_CTRL.INV_DATE:" + structTarget.getINV_DATE());
          listMessage.add("T_INV_CTRL.PLANT_CD:" + getsysPLANT_CD());
          listMessage.add("Other period-INV_DATE:" + ((AH0040010Struct)listRead.get(0)).getINV_DATE());
          listMessage.add("T_INV_CTRL.INV_STS_TYP:1");
          setErrorMessage("AH00034", listMessage);
       
          setInfoLogMessage("readInvCtrl4StsTyp1AndNotTargetInvDate DATA COUNT:" + listRead.size());
       
          // �Ǎ����擾
          structRead = new AH0040010Struct();
          structRead = (AH0040010Struct)listRead.get(0);
         }
       
         return structRead;
        }
       
        /**
         * �I������f�[�^�Ǎ�����
         *
         * @param	structTarget	�Ώۃf�[�^���
         * @return	�ŐV�̓Ǎ����:�ُ�Ȃ� / null:�G���[
         */
        private AH0040010Struct readInvCtrl(AH0040010Struct structTarget) throws FoundationException, SQLException
        {
         List listMessage = new ArrayList();
         
         // �Ǎ����s
         List listRead = new ArrayList(0);
         listRead = entity.mT_INV_CTRL.read(conn, structTarget);
       
         // ���R�[�h�����`�F�b�N
         AH0040010Struct structRead = null;
         if(listRead.size() <= 0)
         {
          // ���R�[�h�������O(�[��)���̏ꍇ
          listMessage.add("T_INV_CTRL.INV_DATE:" + structTarget.getINV_DATE());
          listMessage.add("T_INV_CTRL.PLANT_CD:" + structTarget.getPLANT_CD());
          setErrorMessage("AH00021", listMessage);
          return null;
         }
         else
         {
          // �Ǎ����擾
          structRead = new AH0040010Struct();
          structRead = (AH0040010Struct)listRead.get(0);
         }
         return structRead;
        }
       
        /**
         * �I����ԋ敪��2�i�I���X�V�ρj���ǂ����̃`�F�b�N����
         *
         * @param	structTarget �Ώۃf�[�^���
         * @return	true:�I����ԋ敪��2�̏ꍇ / false:�I����ԋ敪��2�ȊO
         */
        private boolean checkInvStsTypNotEqual2(AH0040010Struct structTarget)
        {
         List listMessage = new ArrayList();
         
         // ���ʃt���O������
         boolean bResult = true;
       
         // �I����ԋ敪��2�i�I���X�V�ρj���ǂ����̃`�F�b�N
         if("2".equals(structTarget.getINV_STS_TYP()) == true)
         {
          // �I����ԋ敪��2�i�I���X�V�ρj
          listMessage.add("T_INV_CTRL.INV_DATE:" + structTarget.getINV_DATE());
          listMessage.add("T_INV_CTRL.PLANT_CD:" + structTarget.getPLANT_CD());
          listMessage.add("T_INV_CTRL.INV_STS_TYP:" + structTarget.getINV_STS_TYP());
          setErrorMessage("AH00030", listMessage);
          bResult = false;
         }
         return bResult;
        }
       
        /**
         * �Ɩ��^�p���擾
         *
         * @param	strPlantCd	�H��R�[�h
         * @return	���t������(YYYY/MM/DD�`��):���� / null:���s
         */
        private String getBusinessOprDate(String strPlantCd) throws FoundationException, SQLException
        {
         String Message = "";
         
         AH0040010Struct search_struct = new AH0040010Struct();
         String strBUSINESS_OPR_DATE = null;
       
         // �Ǎ������ݒ�
         search_struct.setPLANT_CD(strPlantCd);
       
         // �Ɩ��^�p���Ǎ����s
         List temp_list = entity.mSYS_DATE_CTRL.read(conn, search_struct);
         if(temp_list.size() <= 0)
         {
          // �Ɩ��^�p�����R�[�h�Ȃ�
          Message = "SYS_DATE_CTRL.PLANT_CD:" + search_struct.getPLANT_CD();
          setErrorMessage("AH00024", Message);
          return null;
         }
       
         // �擾�Ɩ��^�p���`�F�b�N
         AH0040010Struct structRead = (AH0040010Struct)temp_list.get(0);
         strBUSINESS_OPR_DATE = structRead.getBUSINESS_OPR_DATE();
         if((strBUSINESS_OPR_DATE == null) || ("".equals(strBUSINESS_OPR_DATE) == true) )
         {
          // �擾�Ɩ��^�p��null
          Message = "SYS_DATE_CTRL.PLANT_CD:" + search_struct.getPLANT_CD();
          setErrorMessage("AH00024", Message);
          return null;
         }
         return strBUSINESS_OPR_DATE;
        }
       
        /**
         * �Ɩ��^�p���擾�ɂ��I�����`�F�b�N
         *
         * @param	structTarget	�Ώۃf�[�^���
         * @return	true:�ُ�Ȃ� / false:�G���[
         */
        private boolean checkInvDateByBusinessOprDate(AH0040010Struct structTarget) throws FoundationException, SQLException
        {
         List listMessage = new ArrayList();
         
         // ���ʃt���O������
         boolean bResult = true;
         String strBUSINESS_OPR_DATE = getBusinessOprDate(structTarget.getPLANT_CD());
         if(strBUSINESS_OPR_DATE != null)
         {
          // �I�������Ɩ��^�p����薢���ɂȂ��Ă��Ȃ����ǂ����̃`�F�b�N
          DateConverter dateConv = new DateConverter();
          Date dateINV_DATE = dateConv.str2date(structTarget.getINV_DATE());
          Date dateBUSINESS_OPR_DATE = dateConv.str2date(strBUSINESS_OPR_DATE);
          if(dateINV_DATE.getTime() > dateBUSINESS_OPR_DATE.getTime())
          {
           // �I�������Ɩ��^�p����薢��
           bResult = false;
       
           listMessage.add("T_INV_CTRL.INV_DATE:" + structTarget.getINV_DATE());
           listMessage.add("SYS_DATE_CTRL.BUSINESS_OPR_DATE:" + strBUSINESS_OPR_DATE);
           listMessage.add("T_INV_CTRL.PLANT_CD:" + structTarget.getPLANT_CD());
           setErrorMessage("AH00037", listMessage);
          }
         }
         return bResult;
        }
         
        //------------------------------------------------------------------
       
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
         * @param ���O�o�̓��b�Z�[�W
         */
        private void setErrorLogMessage(String message)
        {
         ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
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
         * �x�����b�Z�[�W�ݒ�
         * @param �o�̓��b�Z�[�W
         */
        private void setWarnMessage(String message)
        {
         ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
         msgStruct.addWarn( emsg );
         sysLog.info(emsg, getsysUSER_CD());
        }
       
        /**
         * �x�����b�Z�[�W�ݒ�
         * @param ���O�o�̓��b�Z�[�W
         */
        private void setWarnLogMessage(String message)
        {
         ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
         sysLog.info(emsg, getsysUSER_CD());
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
         sysLog.config(emsg, getsysUSER_CD());
        }
       
        /**
         * ��񃁃b�Z�[�W�ݒ�
         * @param ���O�o�̓��b�Z�[�W
         */
        private void setInfoLogMessage(String message)
        {
         ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
         sysLog.config(emsg, getsysUSER_CD());
        }
    	/** ���b�Z�[�W�Ǘ��N���X */
    	private InvMessageControl _msg = null;
  
        //------------------------------------------------------------------
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0040");
		logger.entering("AH0040010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
                //------------------------------------------------------------------
              
                // �Ǎ����������t���O������
                boolean bSuccess = false;
              
                // �������O��struct����ޔ�
                AH0040010Struct structCopy = new AH0040010Struct();
                structCopy.copy(struct);
              
                // �ŐV�I��������Ǎ��p
                AH0040010Struct structReadInvCtrl = new AH0040010Struct();
              
                // ������Ԃ�������
                setReadStatus(INITIAL);
                try {
                 // �G���[�t���O������
                 boolean bError = false;
              
                 // �����Ɋ֘A����p�����[�^��ݒ�
                 struct.setPLANT_CD(getsysPLANT_CD());
              
                 // ���͒I�����ȊO�̒I�����Ԓ��f�[�^���݃`�F�b�N
                 AH0040010Struct structRead = readInvCtrl4StsTyp1AndNotTargetInvDate(struct);
                 if(structRead != null)
                 {
                  // ���͒I�����ȊO�ɒI�����Ԓ��̃f�[�^�����݂���
                  bError = true;
                 }
              
                 // �I������f�[�^���݃`�F�b�N
                 structReadInvCtrl = readInvCtrl(struct);
                 if(structReadInvCtrl == null)
                 {
                  // �I������f�[�^�����݂��Ȃ�
                  bError = true;
                 }
                 else
                 {
                  // �ŐV�̒I����ԋ敪��ݒ�
                  struct.setINV_STS_TYP(structReadInvCtrl.getINV_STS_TYP());
              
                  // �I����ԋ敪��2�i�I���X�V�ρj�łȂ����̃`�F�b�N
                  if(checkInvStsTypNotEqual2(struct) != true)
                  {
                   // �I����ԋ敪��2(�X�V�ς�)�̏ꍇ
                   bError = true;
                  }
                 }
              
                 // �I�������Ɩ��^�p����薢���ɂȂ��Ă��Ȃ����ǂ����̃`�F�b�N
                 if(checkInvDateByBusinessOprDate(struct) != true)
                 {
                  // �I�������Ɩ��^�p����薢��
                  bError = true;
                 }
              
                 // �G���[���Ȃ�
                 if(bError != true)
                 {
                  // �Ǎ����������t���O�ݒ�
                  bSuccess = true;
                 }
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                } finally {
                 // �ŐV���ݒ�
                 // ��ʕ\�����N���A
                 struct.clear();
              
                 // �ŐV�I�������񔽉f
                 if(structReadInvCtrl != null)
                 {
                  struct.copy(structReadInvCtrl);
              
                  // �I����ԋ敪���擾�ݒ�
                  struct.setw_INV_STS_TYP(getInvStsTypName(struct.getINV_STS_TYP()));
              
                  // �I���t���O�l����`�F�b�N�{�b�N�X�l��ݒ�
                  struct.setc_REGULAR_INV_FLG(convCheckBoxValue(struct.getREGULAR_INV_FLG()));
                  struct.setc_CYCLE_INV_FLG(convCheckBoxValue(struct.getCYCLE_INV_FLG()));
                  struct.setc_TEMP_INV_FLG(convCheckBoxValue(struct.getTEMP_INV_FLG()));
                 }
                 // �����O���Đݒ�
                 struct.setINV_DATE(structCopy.getINV_DATE());
              
                 // ��ʃ��[�h�ݒ�
                 if(bSuccess == true)
                 {
                  setReadStatus(NORMAL);
              
                  // �Ǎ��������̃L�[����ޔ�
                  struct.seth_saveINV_DATE(struct.getINV_DATE());
                 }
              
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AH0040010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * ���s�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlexecute() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0040");
		logger.entering("AH0040010Control"+":USER="+struct.getsUser_ID(),"controlexecute");
			//{{user_implement_dev:<controlexecute>
                //------------------------------------------------------------------
              
                // DB�X�V���t���O������
                boolean bDBUpdate = false;
              
                // ���������t���O������
                boolean bSuccess = false;
              
                // �������O��struct����ޔ�
                AH0040010Struct structCopy = new AH0040010Struct();
                structCopy.copy(struct);
              
                // �ŐV�I��������Ǎ��p
                AH0040010Struct structReadInvCtrl = new AH0040010Struct();
                try {
                 // �G���[�t���O������
                 boolean bError = false;
              
                 // �����Ɋ֘A����p�����[�^��ݒ�
                 struct.setPLANT_CD(getsysPLANT_CD());
              
                 // ���͒I�����ȊO�̒I�����Ԓ��f�[�^���݃`�F�b�N
                 AH0040010Struct structRead = readInvCtrl4StsTyp1AndNotTargetInvDate(struct);
                 if(structRead != null)
                 {
                  // ���͒I�����ȊO�ɒI�����Ԓ��̃f�[�^�����݂���
                  bError = true;
                 }
                 // �I������f�[�^���݃`�F�b�N
                 structReadInvCtrl = readInvCtrl(struct);
                 if(structReadInvCtrl == null)
                 {
                  // �I������f�[�^�����݂��Ȃ�
                  bError = true;
                 }
                 else
                 {
                  // �ŐV�̒I����ԋ敪��ݒ�
                  struct.setINV_STS_TYP(structReadInvCtrl.getINV_STS_TYP());
              
                  // �I����ԋ敪��2�i�I���X�V�ρj�łȂ����̃`�F�b�N
                  if(checkInvStsTypNotEqual2(struct) != true)
                  {
                   // �I����ԋ敪��2(�X�V�ς�)�̏ꍇ
                   bError = true;
                  }
                 }
              
                 // �I�������Ɩ��^�p����薢���ɂȂ��Ă��Ȃ����ǂ����̃`�F�b�N
                 if(checkInvDateByBusinessOprDate(struct) != true)
                 {
                  // �I�������Ɩ��^�p����薢��
                  bError = true;
                 }
              
                 
                 //2009/09/04 �ǉ�
                 // �Վ����Ǎ��p
                 AH0040010Struct structTemp = new AH0040010Struct();
                 String strTEMP_INV_FLG = "0";
                 
                 structTemp.setPLANT_CD(getsysPLANT_CD());
                 structTemp.setINV_DATE(structCopy.getINV_DATE());
                         
                 List temp_list = entity.mT_INV_CTRL.read(conn, structTemp);
                 if(temp_list.size() > 0){
                	 strTEMP_INV_FLG = ((AH0040010Struct)temp_list.get(0)).getTEMP_INV_FLG();
                 }
                 
                 if("1".equals(strTEMP_INV_FLG)){
                	 temp_list = entity.mT_INV_TARGET_WH.read(conn, structTemp);
                     if(temp_list.size() <= 0)
                     {
                    	//�I�������ۊǋ�w��
                   	  	temp_list = entity.mT_INV_TARGET_ITEM.read(conn, structTemp);
                   	  	if(temp_list.size() <= 0){
                   		     //�I�������i�ڎw��
                             String Message = "T_INV_TARGET_ITEM.PLANT_CD:" + structTemp.getPLANT_CD();
                             Message += " T_INV_TARGET_WH.PLANT_CD:" + structTemp.getPLANT_CD();
                             setErrorMessage("AH00050", Message);
                             bError = true;
                   	  }
                     }
                 }
                
                 // �G���[���Ȃ��ꍇ
                 if(bError != true)
                 {
                  // �o�b�`�J�n���b�Z�[�W�\��
                  setInfoMessage( "ZZ09001" );
              
                  // �I���A�N�Z�b�T�N���X����
                  InvAccessor invAccessor = 
                   new InvAccessor(getsysPLANT_CD(), getsysUSER_CD(), sp.getProcId());

                  
                  // ���s����
                  boolean bResult;
                  while(true)
                  {
                   //--------------------------------------
                   // �g�����U�N�V�����J�n
                   conn.beginTransWeb();
              
                   // DB�X�V���t���OON
                   bDBUpdate = true;
              
                   // �ߋ��f�[�^�폜
                   bResult = invAccessor.delete(conn, struct.getINV_DATE());
                   resultMessageByInvAccessor(invAccessor);	// �������ʃ��b�Z�[�W�o��
                   if(bResult != true)
                   {
                    bError = true;
                    break;
                   }
                   // �R�~�b�g
                   conn.commit();
              
                   // DB�X�V���t���OOFF
                   bDBUpdate = false;
              
                   //--------------------------------------
                   // �g�����U�N�V�����J�n
                   conn.beginTransWeb();
              
                   // DB�X�V���t���OON
                   bDBUpdate = true;
              
                   // �I���f�[�^�쐬
                   bResult = invAccessor.save(conn, struct.getINV_DATE());
                   resultMessageByInvAccessor(invAccessor);	// �������ʃ��b�Z�[�W�o��
                   if(bResult != true)
                   {
                    bError = true;
                    break;
                   }
                   // �R�~�b�g
                   conn.commit();
              
                   // DB�X�V���t���OOFF
                   bDBUpdate = false;
                   //--------------------------------------
              
                   break;
                  }
              
                  // �G���[���Ȃ��ꍇ
                  if(bError != true)
                  {
                   // �ēǍ�����
                   controlselect();
              
                   // �Ǎ����������t���O�ݒ�
                   bSuccess = true;
              
                   // �o�b�`�I�����b�Z�[�W�\��
                   setInfoMessage( "ZZ09002" );
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
                  setInfoLogMessage("Control�Fcontrolexecute - rollback!!");
                 }
              
                 if(bSuccess != true)
                 {
                  // ���s���������������ꍇ�A�ēǍ��ɂ��ŐV��ԂɂȂ��Ă���͂��Ȃ̂ŁA
                  // ���s���������s�����ꍇ�̂݁A�ŐV���ݒ菈���������Ȃ�
              
                  // �ŐV���ݒ�
                  // ��ʕ\�����N���A
                  struct.clear();
              
                  // �ŐV�I�������񔽉f
                  if(structReadInvCtrl != null)
                  {
                   struct.copy(structReadInvCtrl);
              
                   // �I����ԋ敪���擾�ݒ�
                   struct.setw_INV_STS_TYP(getInvStsTypName(struct.getINV_STS_TYP()));
              
                   // �I���t���O�l����`�F�b�N�{�b�N�X�l��ݒ�
                   struct.setc_REGULAR_INV_FLG(convCheckBoxValue(struct.getREGULAR_INV_FLG()));
                   struct.setc_CYCLE_INV_FLG(convCheckBoxValue(struct.getCYCLE_INV_FLG()));
                   struct.setc_TEMP_INV_FLG(convCheckBoxValue(struct.getTEMP_INV_FLG()));
                  }
                  // �����O���Đݒ�
                  struct.setINV_DATE(structCopy.getINV_DATE());
                  struct.seth_saveINV_DATE(structCopy.geth_saveINV_DATE());
                 }
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlexecute>
		logger.exiting("AH0040010Control"+":USER="+struct.getsUser_ID(),"controlexecute");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0040");
		logger.entering("AH0040010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
                //------------------------------------------------------------------
                try {
                 // struct�N���A
                 struct.clear();
              
                 // �����l�ݒ�
                 // �I�����Ԓ��f�[�^�Ǎ�
                 AH0040010Struct structRead = readInvCtrl4StsTyp1();
                 if(structRead == null)
                 {
                  // �I�����Ԓ��f�[�^�����݂��Ȃ�
                  structRead = readInvCtrl4StsTyp0();
                 }
                 if(structRead != null)
                 {
                  // �Ǎ����ݒ�
                  struct.copy(structRead);
              
                  // �I����ԋ敪���擾�ݒ�
                  struct.setw_INV_STS_TYP(getInvStsTypName(struct.getINV_STS_TYP()));
              
                  // �I���t���O�l����`�F�b�N�{�b�N�X�l��ݒ�
                  struct.setc_REGULAR_INV_FLG(convCheckBoxValue(struct.getREGULAR_INV_FLG()));
                  struct.setc_CYCLE_INV_FLG(convCheckBoxValue(struct.getCYCLE_INV_FLG()));
                  struct.setc_TEMP_INV_FLG(convCheckBoxValue(struct.getTEMP_INV_FLG()));
              
                  // �Ǎ��ςݏ�Ԃɂ��邽�߃��[�h��SELECT��ݒ�
                  setReadStatus(NORMAL);
                  // �Ǎ��������̃L�[����ޔ�
                  struct.seth_saveINV_DATE(struct.getINV_DATE());
                 }
                 else
                 {
                  // ������Ԃ�������
                  setReadStatus(INITIAL);
                 }
                 struct.initializeParent();
              
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AH0040010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0040");
		logger.entering("AH0040010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                 
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AH0040010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0040");
		logger.entering("AH0040010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                      //------------------------------------------------------------------
                try {
              
                 // �R���{�f�[�^�̎擾
                 ComboBox controller = new ComboBox(conn, sysUSER_CD);
                 _comboInvStsTyp = controller.getData("INV_STS_TYP");	// �I����ԋ敪
              
                 // �N���A����
                 controlclear();
              
                }catch(SQLException e){
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
		logger.exiting("AH0040010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0040");
		logger.entering("AH0040010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AH0040010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("execute") ) {
				controlexecute();
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
//			throw new FoundationException("AH0040010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0040010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AH0040010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0040010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AH0040010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                 
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0040010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AH0040010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AH0040010Entity entity;
	protected AH0040010Struct struct;
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

		entity = new AH0040010Entity();
		struct = new AH0040010Struct();

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
	 * AH0040010�N���X�̕W���R���X�g���N�^
	 */
	public AH0040010Control() throws BusinessProcessException, FoundationException
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
				AH0040010Struct key = (AH0040010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("w_INV_STS_TYP") && key.getw_INV_STS_TYP() != null) {
					msgKey.setKeyValue("w_INV_STS_TYP", key.getw_INV_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("c_REGULAR_INV_FLG") && key.getc_REGULAR_INV_FLG() != null) {
					msgKey.setKeyValue("c_REGULAR_INV_FLG", key.getc_REGULAR_INV_FLG());
				}
				if(msgKeyType.containsKeyColumn("c_CYCLE_INV_FLG") && key.getc_CYCLE_INV_FLG() != null) {
					msgKey.setKeyValue("c_CYCLE_INV_FLG", key.getc_CYCLE_INV_FLG());
				}
				if(msgKeyType.containsKeyColumn("c_TEMP_INV_FLG") && key.getc_TEMP_INV_FLG() != null) {
					msgKey.setKeyValue("c_TEMP_INV_FLG", key.getc_TEMP_INV_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_saveINV_DATE") && key.geth_saveINV_DATE() != null) {
					msgKey.setKeyValue("h_saveINV_DATE", key.geth_saveINV_DATE());
				}
				if(msgKeyType.containsKeyColumn("temp_WH_CD") && key.gettemp_WH_CD() != null) {
					msgKey.setKeyValue("temp_WH_CD", key.gettemp_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("temp_ITEM_CD") && key.gettemp_ITEM_CD() != null) {
					msgKey.setKeyValue("temp_ITEM_CD", key.gettemp_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("INV_DATE") && key.getINV_DATE() != null) {
					msgKey.setKeyValue("INV_DATE", key.getINV_DATE());
				}
				if(msgKeyType.containsKeyColumn("REGULAR_INV_FLG") && key.getREGULAR_INV_FLG() != null) {
					msgKey.setKeyValue("REGULAR_INV_FLG", key.getREGULAR_INV_FLG());
				}
				if(msgKeyType.containsKeyColumn("CYCLE_INV_FLG") && key.getCYCLE_INV_FLG() != null) {
					msgKey.setKeyValue("CYCLE_INV_FLG", key.getCYCLE_INV_FLG());
				}
				if(msgKeyType.containsKeyColumn("TEMP_INV_FLG") && key.getTEMP_INV_FLG() != null) {
					msgKey.setKeyValue("TEMP_INV_FLG", key.getTEMP_INV_FLG());
				}
				if(msgKeyType.containsKeyColumn("INV_STS_TYP") && key.getINV_STS_TYP() != null) {
					msgKey.setKeyValue("INV_STS_TYP", key.getINV_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("INV_START_DATE") && key.getINV_START_DATE() != null) {
					msgKey.setKeyValue("INV_START_DATE", key.getINV_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("STOCK_SAVE_DATE") && key.getSTOCK_SAVE_DATE() != null) {
					msgKey.setKeyValue("STOCK_SAVE_DATE", key.getSTOCK_SAVE_DATE());
				}
				if(msgKeyType.containsKeyColumn("INV_UPDATED_DATE") && key.getINV_UPDATED_DATE() != null) {
					msgKey.setKeyValue("INV_UPDATED_DATE", key.getINV_UPDATED_DATE());
				}
				if(msgKeyType.containsKeyColumn("INV_COMMENT") && key.getINV_COMMENT() != null) {
					msgKey.setKeyValue("INV_COMMENT", key.getINV_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
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
					AH0040010Struct key = new AH0040010Struct();
					if(msgKeyType.containsKeyColumn("w_INV_STS_TYP")) {
						key.setw_INV_STS_TYP(msgKey.getKeyValue("w_INV_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("c_REGULAR_INV_FLG")) {
						key.setc_REGULAR_INV_FLG(msgKey.getKeyValue("c_REGULAR_INV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("c_CYCLE_INV_FLG")) {
						key.setc_CYCLE_INV_FLG(msgKey.getKeyValue("c_CYCLE_INV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("c_TEMP_INV_FLG")) {
						key.setc_TEMP_INV_FLG(msgKey.getKeyValue("c_TEMP_INV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_saveINV_DATE")) {
						key.seth_saveINV_DATE(msgKey.getKeyValue("h_saveINV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("temp_WH_CD")) {
						key.settemp_WH_CD(msgKey.getKeyValue("temp_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("temp_ITEM_CD")) {
						key.settemp_ITEM_CD(msgKey.getKeyValue("temp_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("INV_DATE")) {
						key.setINV_DATE(msgKey.getKeyValue("INV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("REGULAR_INV_FLG")) {
						key.setREGULAR_INV_FLG(msgKey.getKeyValue("REGULAR_INV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("CYCLE_INV_FLG")) {
						key.setCYCLE_INV_FLG(msgKey.getKeyValue("CYCLE_INV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("TEMP_INV_FLG")) {
						key.setTEMP_INV_FLG(msgKey.getKeyValue("TEMP_INV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("INV_STS_TYP")) {
						key.setINV_STS_TYP(msgKey.getKeyValue("INV_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("INV_START_DATE")) {
						key.setINV_START_DATE(msgKey.getKeyValue("INV_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_SAVE_DATE")) {
						key.setSTOCK_SAVE_DATE(msgKey.getKeyValue("STOCK_SAVE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("INV_UPDATED_DATE")) {
						key.setINV_UPDATED_DATE(msgKey.getKeyValue("INV_UPDATED_DATE"));
					}
					if(msgKeyType.containsKeyColumn("INV_COMMENT")) {
						key.setINV_COMMENT(msgKey.getKeyValue("INV_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
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
