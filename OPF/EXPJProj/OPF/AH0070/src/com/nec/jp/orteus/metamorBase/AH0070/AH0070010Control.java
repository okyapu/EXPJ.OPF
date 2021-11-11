/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AH0070/src/com/nec/jp/orteus/metamorBase/AH0070/AH0070010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AH0070;

import com.nec.jp.orteus.metamorBase.AH0070.*;
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
import java.io.IOException;
import java.text.MessageFormat;
import com.nec.jp.orteus.expj.util.DateCtrl;
//------------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AH0070010Control
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
       
        public AH0070010Struct getStruct() { return this.struct; }	// Struct�̒l�i���f�B�G�[�^�j��Ԃ��܂��B
       
        //------------------------------------------------------------------------------
       
        /** ��ʋ��ʒ�`�擾�N���X */
        ScreenParam _scParam = sp;
       
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
        

        
        // ----- �V�X�^���ݒ�l�擾 ---------------	
    	private PrivateConfig privateConfig;
        // ----- �V�X�^���ݒ�l�擾 ---------------		
    	
    	/** �I�����F */
    	String aprInvCtrl = "";	
    	/** �I�����F�敪 */
     	String apprFlg = "";
     	//���[�U�̏��F����
     	String apprPowerTyp = "";
        //------------ �o�b�`�����֘A --------------------------------------
       
        // �o�b�`�N���X���ݒ�^�擾
        protected String _batchClassName;
        public void setBatchClassName(String name){ _batchClassName = name; }
        public String getBatchClassName(){ return _batchClassName; }
       
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
        private ComboStruct _INV_STS_TYP = new ComboStruct();
       
        /** �I�����F�敪 */
        private ComboStruct _APPR_INV_STS_TYP = new ComboStruct();
       
        /**
         * �I����ԋ敪���擾
         *
         * @param	String �敪�R�[�h
         * @return	String �敪����(�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�)
         */
        private String getINV_STS_TYP_name(String typ)
        {
         return (getTypName(_INV_STS_TYP, typ));
        }

        
        /**
         * �I�����F�敪
         *
         * @param	String �敪�R�[�h
         * @return	String �敪����(�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�)
         */
        private String getAPPR_INV_STS_TYP_name(String typ)
        {
         return (getTypName(_APPR_INV_STS_TYP, typ));
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
         * �w��I�����ȊO�̒I�����Ԓ��f�[�^�Ǎ�����
         *
         * @param target_struct �Ώۃf�[�^���
         * @return �ُ�Ȃ� �ŐV�̓Ǎ���� �G���[ null
         */
        private AH0070010Struct readT_INV_CTRL_INV_STS_TYP1_AndNotTargetInvDate(AH0070010Struct target_struct) throws FoundationException, SQLException
        {
         List listMessage = new ArrayList();
         
         // �Ǎ����s
         List read_list = new ArrayList(0);
         read_list = entity.mT_INV_CTRL_INV_STS_TYP1_AndNotTargetInvDate.read(conn, target_struct);
       
         // �w��I�����ȊO�̒I�����Ԓ��f�[�^���݃`�F�b�N
         AH0070010Struct read_struct = null;
         if(read_list.size() > 0)
         {
          // �w��I�����ȊO�̒I�����Ԓ��f�[�^������
          listMessage.add("T_INV_CTRL.PLANT_CD:" + getsysPLANT_CD());
          listMessage.add("T_INV_CTRL.INV_DATE:" + ((AH0070010Struct)read_list.get(0)).getINV_DATE());
          setErrorMessage("AH00034", listMessage);
       
          // �Ǎ����擾
          read_struct = new AH0070010Struct();
          read_struct = (AH0070010Struct)read_list.get(0);
         }
       
         return read_struct;
        }
       
        /**
         * �I�����Ԓ��f�[�^�Ǎ�����
         *
         * @return �ُ�Ȃ� �ŐV�̓Ǎ���� �G���[ null
         */
        private AH0070010Struct readT_INV_CTRL_INV_STS_TYP1() throws FoundationException, SQLException
        {
         String Message = "";
         
         // �����Ɋ֘A����p�����[�^��ݒ�
         AH0070010Struct target_struct = new AH0070010Struct();
         target_struct.setPLANT_CD(getsysPLANT_CD());
       
         // �Ǎ����s
         List read_list = new ArrayList(0);
         read_list = entity.mT_INV_CTRL_INV_STS_TYP1.read(conn, target_struct);
       
         // �I�����Ԓ��f�[�^���݃`�F�b�N
         boolean bError = false;
         if(read_list.size() <= 0)
         {
          // �I�����Ԓ��f�[�^�����݂��Ȃ�
          Message = "T_INV_CTRL.PLANT_CD:" + getsysPLANT_CD();
          setErrorMessage("AH00031", Message);
          bError = true;
         }
         else
         {
          // �I�����Ԓ��f�[�^�������݃`�F�b�N
          if(read_list.size() > 1)
          {
           // �I�����Ԓ��f�[�^����������
           Message = "T_INV_CTRL.PLANT_CD:" + getsysPLANT_CD();
           setErrorMessage("AH00034", Message);
           bError = true;
          }
         }
       
         // �G���[�łȂ��ꍇ
         AH0070010Struct read_struct = null;
         if(bError != true)
         {
          // �Ǎ����擾
          read_struct = new AH0070010Struct();
          read_struct = (AH0070010Struct)read_list.get(0);
         }
         return read_struct;
        }
       
        /**
         * �I������f�[�^�Ǎ�����
         *
         * @param target_struct �Ώۃf�[�^���
         * @return �ُ�Ȃ� �ŐV�̓Ǎ���� �G���[ null
         */
        private AH0070010Struct readT_INV_CTRL(AH0070010Struct target_struct) throws FoundationException, SQLException
        {
         List listMessage = new ArrayList();
         
         // �Ǎ����s
         List read_list = new ArrayList(0);
         read_list = entity.mT_INV_CTRL.read(conn, target_struct);
       
         // ���R�[�h�����`�F�b�N
         if(read_list.size() <= 0)
         {
          // ���R�[�h�������O(�[��)���̏ꍇ
          listMessage.add("T_INV_CTRL.INV_DATE:" + target_struct.getINV_DATE());
          listMessage.add("T_INV_CTRL.PLANT_CD:" + target_struct.getPLANT_CD());
          setErrorMessage("AH00021", listMessage);
          return null;
         }
       
         // �Ǎ����擾
         AH0070010Struct read_struct = new AH0070010Struct();
         read_struct = (AH0070010Struct)read_list.get(0);
         return read_struct;
        }
       
        /**
         * �I����ԋ敪��1�i�I�����Ԓ��j�łȂ����ǂ����̔��菈��
         *
         * @param target_struct �Ώۃf�[�^���
         * @return �ُ�Ȃ� true �G���[ false
         */
        private boolean checkINV_STS_TYP_notequal1(AH0070010Struct target_struct)
        {
         List listMessage = new ArrayList();
         
         // ���ʃt���O������
         boolean bResult = true;
       
         // �I����ԋ敪��1�i�I�����Ԓ��j�łȂ����ǂ����̃`�F�b�N
         if("1".equals(target_struct.getINV_STS_TYP()) != true)
         {
          // �I����ԋ敪��1�i�I�����Ԓ��j�ȊO�̏ꍇ
          listMessage.add("T_INV_CTRL.INV_DATE:" + target_struct.getINV_DATE());
          listMessage.add("T_INV_CTRL.INV_STS_TYP:" + target_struct.getINV_STS_TYP());
          setErrorMessage("AH00021", listMessage);
          bResult = false;
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
        private void setWarnMessage(String messageno )
        {
         ExpjMessage emsg = new ExpjMessage( messageno );
         msgStruct.addWarn( emsg );
         sysLog.info(emsg, getsysUSER_CD());
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
         sysLog.info(emsg, getsysUSER_CD());
        }
		
        //------------------------------------------------------------------
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * ���s�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlexecute() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0070");
		logger.entering("AH0070010Control"+":USER="+struct.getsUser_ID(),"controlexecute");
			//{{user_implement_dev:<controlexecute>
                //------------------------------------------------------------------
              
                String Message = "";
              
                // �������O��struct����ޔ�
                AH0070010Struct copy_struct = new AH0070010Struct();
                copy_struct.copy(struct);
              
                // �ŐV�I��������Ǎ��p
                AH0070010Struct read_struct_inv_ctrl = new AH0070010Struct();
                try {
                 // �G���[�t���O������
                 boolean bError = false;
              
                 // �����Ɋ֘A����p�����[�^��ݒ�
                 struct.setPLANT_CD(getsysPLANT_CD());
              
                 // �w��I�����ȊO�̒I�����Ԓ��f�[�^���݃`�F�b�N
                 AH0070010Struct read_struct = readT_INV_CTRL_INV_STS_TYP1_AndNotTargetInvDate(struct);
                 if(read_struct != null)
                 {
                  // �w��I�����ȊO�̒I�����Ԓ��f�[�^�����݂���
                  bError = true;	// �G���[�t���O�ݒ�
                 }
              
                 // �I������f�[�^���݃`�F�b�N
                 read_struct_inv_ctrl = readT_INV_CTRL(struct);
                 if(read_struct_inv_ctrl == null)
                 {
                  // �I������f�[�^�����݂��Ȃ�
                  bError = true;	// �G���[�t���O�ݒ�
                 }
                 else
                 {
                  // �I����ԋ敪��1�i�I�����Ԓ��j�łȂ����ǂ����̃`�F�b�N
                  if(checkINV_STS_TYP_notequal1(read_struct_inv_ctrl) != true)
                  {
                   // �G���[�t���O�ݒ�
                   bError = true;
                  }
                 }
              
                 if(bError != true)
                 {
                  // ============================================================
                  // �o�b�`�����N���X��main����
                  String strBatchClassName = null;		// �Ăяo����N���X��
                  String strBatchProcessingTyp = null;	// �o�b�`�����敪
                  String strProgramId = null;			// �Ɩ����iAH0070010�j
                  String strUserId = null;				// ���[�UID
                  String strPlantCd = null;				// �H��R�[�h
                  String strInvDate = null;				// �I����
              
                  // �����Z�b�g
                  strBatchClassName = getBatchClassName();// com.nec.jp.orteus.metamorBase.AH0070.AH0070B001.mainAH0070B001
                  strBatchProcessingTyp = "2";			// 2: �����^�]���Ȃ��i��ԃo�b�`�Ȃ��j
                  strProgramId = sp.getProcId();			// �Ɩ����iAH0070010�j
                  strUserId = getsysUSER_CD();				// ���[�UID
                  strPlantCd = getsysPLANT_CD();				// �H��R�[�h
                  strInvDate = struct.getINV_DATE();		// �I����
              
                  // �o�b�`���������s���� -------------------------------------------
                  ResourceBundle bundle = SystemConfig.getBundle();
                  String javaPath = SystemConfig.getProperty("JAVA_PATH", bundle);
                  if(javaPath == null){
                   //�V�X�e������l�t�@�C������̏��擾�Ɏ��s���܂���(�i�u�l�p�X)
                   setErrorMessageNoKey("ZZ09010");
                   return;
                  }
                  String ClassPath = SystemConfig.getProperty("CLASS_PATH", bundle);
                  if(ClassPath == null){
                   //�V�X�e������l�t�@�C������̏��擾�Ɏ��s���܂���(�N���X�p�X)
                   setErrorMessageNoKey("ZZ09012");
                   return;
                  }
                  String batchPath = SystemConfig.getProperty("BATCH_PATH", bundle);
                  if(batchPath == null){
                   //�V�X�e������l�t�@�C������̏��擾�Ɏ��s���܂���(�o�b�`�N���ݒ�)
                   setErrorMessageNoKey("ZZ09011");
                   return;
                  }
              
                  String heapSize = SystemConfig.getProperty("HIGH_HEAP_SIZE",bundle); 
                  if (heapSize == null) {
                   //�V�X�e������l�t�@�C������̏��擾�Ɏ��s���܂���(�o�b�`�q�[�v�T�C�Y�ݒ�)
                   setErrorMessageNoKey("ZZ09017");
                   return;
                  }
                 
                  try {
                   StringBuffer cmd = new StringBuffer(javaPath);        // �R�}���h������
                   cmd.append(" -Xms").append(heapSize).append("m");
                   cmd.append(" -Xmx").append(heapSize).append("m");
                   cmd.append(" -cp ");
                   cmd.append(ClassPath);
                   cmd.append(" -Dcom.nec.jp.orteus.util.logging.config.file=");
                   cmd.append(batchPath);
                   cmd.append(" ").append(strBatchClassName);		// �Ăяo����N���X
                   cmd.append(" ").append(strBatchProcessingTyp);	// �o�b�`�����敪
                   cmd.append(" ").append(strProgramId);			//�Ɩ����iAH0070010�j
                   cmd.append(" ").append(strUserId);				// ���[�UID
                   cmd.append(" ").append(strPlantCd);				// �H��R�[�h
                   cmd.append(" ").append(strInvDate);				// �I����(AH0070��p����)
                   
                   sysLog.info("ZZ01006",getsysUSER_CD(),cmd.toString());
                   
                   List buffer = new ArrayList();
                   buffer.add(javaPath);            // �i�u�l
                   buffer.add("-Xms" + heapSize + "m");
                   buffer.add("-Xmx" + heapSize + "m");
                   buffer.add("-cp");
                   buffer.add(ClassPath);           // Java ClassPath
                   buffer.add("-Dcom.nec.jp.orteus.util.logging.config.file="+batchPath); // �N���ݒ�
                   buffer.add(strBatchClassName);		// �Ăяo����N���X
                   buffer.add(strBatchProcessingTyp);	// �o�b�`�����敪
                   buffer.add(strProgramId);			//�Ɩ����iAH0070010�j
                   buffer.add(strUserId);				// ���[�UID
                   buffer.add(strPlantCd);				// �H��R�[�h
                   buffer.add(strInvDate);				// �I����(AH0070��p����)
//                   // �o�b�`�L�b�N
//                   Runtime runtime = Runtime.getRuntime();
//                   Process p = runtime.exec(cmd.toString());
                   Runtime runtime = Runtime.getRuntime();
                   runtime.exec((String[])buffer.toArray(new String[buffer.size()]));
                  } catch (IOException e) {
                  // �o�b�`�Ăяo�����s�̏ꍇ�A��ʃ��b�Z�[�W��\������B
                   ExpjMessage msg = new ExpjMessage( "ZZ09014" );
                   sysLog.severe(msg, getsysUSER_CD());
                   
                   ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                   sysLog.severe(emsg, getsysUSER_CD());
                   ExpjException ee = new ExpjException(e, emsg);
                   throw ee;
                  }
              
                  // �o�b�`�Ăяo�������̏ꍇ�A��ʃ��b�Z�[�W��\������B
                  setInfoMessage("ZZ09013", "");
              
                 // �o�b�`���������s���� �I���-----------------------------------
                 }
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                } finally {
              
                 // ��ʕ\�����ݒ�
              
                 // ��ʕ\�����N���A
                 struct.clear();
              
                 // �ŐV�I�������񔽉f
                 if(read_struct_inv_ctrl != null)
                 {
                  struct.copy(read_struct_inv_ctrl);
              
                  // �I����ԋ敪���擾�ݒ�
                  struct.setw_INV_STS_TYP(getINV_STS_TYP_name(struct.getINV_STS_TYP()));              
                  // �I�����F�敪���擾�ݒ�
                  struct.setw_APPR_INV_STS_TYP(getAPPR_INV_STS_TYP_name(struct.getAPPR_FLG()));
              
                  // �I���t���O�l����`�F�b�N�{�b�N�X�l��ݒ�
                  struct.setc_REGULAR_INV_FLG(convCheckBoxValue(struct.getREGULAR_INV_FLG()));
                  struct.setc_CYCLE_INV_FLG(convCheckBoxValue(struct.getCYCLE_INV_FLG()));
                  struct.setc_TEMP_INV_FLG(convCheckBoxValue(struct.getTEMP_INV_FLG()));
                 }
                 // �����O���Đݒ�
                 struct.setINV_DATE(copy_struct.getINV_DATE());
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlexecute>
		logger.exiting("AH0070010Control"+":USER="+struct.getsUser_ID(),"controlexecute");

		return;
	}

	/**
	 * ���F�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlApprAssort() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0070");
		logger.entering("AH0070010Control"+":USER="+struct.getsUser_ID(),"controlApprAssort");
			//{{user_implement_dev:<controlApprAssort>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
	         List listMessage = new ArrayList();	         
	         AH0070010Struct tempStruct = new AH0070010Struct();
	         //�p�����[�^�ݒ�
	         tempStruct.setPLANT_CD(getsysPLANT_CD());
	         tempStruct.setINV_DATE(struct.getINV_DATE());
	         // �Ǎ����s
	         List read_list = new ArrayList(0);
	         read_list = entity.mT_INV_CTRL_INV_STS_TYP1_AndNotTargetInvDate.read(conn, tempStruct);
	       
	         // �w��I�����ȊO�̒I�����Ԓ��f�[�^���݃`�F�b�N
	         AH0070010Struct read_struct = null;
	         if(read_list.size() > 0)
	         {
	          // �w��I�����ȊO�̒I�����Ԓ��f�[�^������
	          listMessage.add("T_INV_CTRL.PLANT_CD:" + getsysPLANT_CD());
	          listMessage.add("T_INV_CTRL.INV_DATE:" + ((AH0070010Struct)read_list.get(0)).getINV_DATE());
	          setErrorMessage("AH00034", listMessage);
	          return;
	         }
	         //�Ɩ��^�p�����擾
	         String businessDate = DateCtrl.getBusinessOprDate(conn,getsysPLANT_CD());
	         struct.setBUSINESS_DATE(businessDate);
	         // �I������̍X�V���s��
	         struct.setAPPR_FLG("2");	         
	         struct.setSYS_USER_CD(this.getsysUSER_CD());
	         struct.setPLANT_CD(this.getsysPLANT_CD());
	         entity.mupdate_T_INV_CTRL_appr_flg.update(conn,struct);
	         
	         //�R�����g
	         conn.commit();
	         
	         controlRELOAD();
		} catch(SQLException e) {
			conn.rollback();
            setSqlExceptionMsg(e);
			// �G���[�������L�q���Ă��������B
		}
                //}}user_implement_dev:<controlApprAssort>
		logger.exiting("AH0070010Control"+":USER="+struct.getsUser_ID(),"controlApprAssort");

		return;
	}

	/**
	 * ���F����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlDelApprAssort() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0070");
		logger.entering("AH0070010Control"+":USER="+struct.getsUser_ID(),"controlDelApprAssort");
			//{{user_implement_dev:<controlDelApprAssort>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
	         List listMessage = new ArrayList();	         
	         AH0070010Struct tempStruct = new AH0070010Struct();
	         //�p�����[�^�ݒ�
	         tempStruct.setPLANT_CD(getsysPLANT_CD());
	         tempStruct.setINV_DATE(struct.getINV_DATE());
	         // �Ǎ����s
	         List read_list = new ArrayList(0);
	         read_list = entity.mT_INV_CTRL_INV_STS_TYP1_AndNotTargetInvDate.read(conn, tempStruct);
	       
	         // �w��I�����ȊO�̒I�����Ԓ��f�[�^���݃`�F�b�N
	         AH0070010Struct read_struct = null;
	         if(read_list.size() > 0)
	         {
	          // �w��I�����ȊO�̒I�����Ԓ��f�[�^������
	          listMessage.add("T_INV_CTRL.PLANT_CD:" + getsysPLANT_CD());
	          listMessage.add("T_INV_CTRL.INV_DATE:" + ((AH0070010Struct)read_list.get(0)).getINV_DATE());
	          setErrorMessage("AH00034", listMessage);
	          return;
	         }
	         // �I������̍X�V���s��
	         struct.setAPPR_FLG("1");	
	         struct.setPLANT_CD(this.getsysPLANT_CD());
	         entity.mupdate_T_INV_CTRL_appr_flg.update(conn,struct);
	         
	         //�R�����g
	         conn.commit();
	         
	         controlRELOAD();
	         
		} catch(SQLException e) {
			conn.rollback();
            setSqlExceptionMsg(e);
			// �G���[�������L�q���Ă��������B
		}
                //}}user_implement_dev:<controlDelApprAssort>
		logger.exiting("AH0070010Control"+":USER="+struct.getsUser_ID(),"controlDelApprAssort");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0070");
		logger.entering("AH0070010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AH0070010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0070");
		logger.entering("AH0070010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                      //------------------------------------------------------------------
              
                try {
              
                 // �R���{�f�[�^�̎擾
                 ComboBox controller = new ComboBox(conn, sysUSER_CD);
                 _INV_STS_TYP = controller.getData("INV_STS_TYP");	// �I����ԋ敪
                 _APPR_INV_STS_TYP = controller.getData("APR_INV_STS_TYP");	// �I�����F�敪
              
                 // struct������
                 struct.initializeParent();
     	        
     	        /** �p�����[�^�u�I�����F�v���擾*/
     	        privateConfig = new PrivateConfig(conn);
     	        aprInvCtrl = privateConfig.getString("APR_INV_CTRL");
     	        // �p�����[�^�u�I�����F�v���擾�ł��Ȃ������ꍇ
     	        if(aprInvCtrl == null || "".equals(aprInvCtrl)){
      				String locale = CoreTools.getLocale(struct.getsUser_ID());
      				ResourceBundle messages = CoreTools.getResourceBundle("ExpjMessage", locale);
      	    		ExpjMessage emsg = new ExpjMessage("AZ00041", messages.getString("AZ00070"));
      	    		msgStruct.addError(emsg);
      	    		sysLog.warning(emsg, sysUSER_CD);
     	        	aprInvCtrl = "0";
     	        	return;
     	        }else if("1".equals(aprInvCtrl)){
     				// �P�̏ꍇ
     	        	aprInvCtrl = "1";
     	        }else{
     				// �P�ȊO�̏ꍇ
     	        	aprInvCtrl = "0";
     	        }
             	struct.seth_APR_INV_CTRL(aprInvCtrl);
                //���O�C�����[�U�̏��F�����`�F�b�N
                struct.setSYS_USER_CD(this.getsysUSER_CD());
                List apprPowerList = entity.mselect_USER_MST_appr_power_typ.read(conn,struct);
                apprPowerTyp = ((AH0070010Struct)apprPowerList.get(0)).getAPPR_POWER_TYP();
                if("1".equals(aprInvCtrl) && "0".equals(apprPowerTyp)){
                	setWarnMessage("AZ00037");                	
                }
                struct.seth_APRR_POWER_TYP(apprPowerTyp);
              
                 // �����Ǎ�����
                 AH0070010Struct read_struct = readT_INV_CTRL_INV_STS_TYP1();
                 if(read_struct != null)
                 {
                  // �Ǎ����ݒ�
                  struct.copy(read_struct);
              
                  // �I����ԋ敪���擾�ݒ�
                  struct.setw_INV_STS_TYP(getINV_STS_TYP_name(struct.getINV_STS_TYP()));
                  // �I�����F�敪���擾�ݒ�
                  struct.setw_APPR_INV_STS_TYP(getAPPR_INV_STS_TYP_name(struct.getAPPR_FLG()));
              
                  // �I���t���O�l����`�F�b�N�{�b�N�X�l��ݒ�
                  struct.setc_REGULAR_INV_FLG(convCheckBoxValue(struct.getREGULAR_INV_FLG()));
                  struct.setc_CYCLE_INV_FLG(convCheckBoxValue(struct.getCYCLE_INV_FLG()));
                  struct.setc_TEMP_INV_FLG(convCheckBoxValue(struct.getTEMP_INV_FLG()));
                 }
                 
                 //�I�����F�敪���擾
                 struct.setPLANT_CD(this.getsysPLANT_CD());
                 List apprList = entity.mselect_T_INV_CTRL_appr_flg.read(conn,struct);
                 if(apprList.size() > 0){        	 
                 	apprFlg = ((AH0070010Struct)apprList.get(0)).getAPPR_FLG();
                 }
                 struct.seth_APRR_FLG(apprFlg);
                 //�V�X�e���p�����[�^�I�����F(APR_INV_CTRL)��1�F�s���A���I�����F�敪 �� 2�F�I�����F�ρ@�ł͂Ȃ��ꍇ
                 if("1".equals(aprInvCtrl) && !"2".equals(apprFlg)){
                 	setWarnMessage("AH00047");
                 }
              
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
		logger.exiting("AH0070010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0070");
		logger.entering("AH0070010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
                 // �R���{�{�b�N�X���i�̃f�[�^�̃Z�b�g�͂����ɋL�q���Ă��������B�@�@
			/*try{
				ComboBox controller = new ComboBox(conn);
				ComboStruct  cs = controller.getData("APR_INV_STS_TYP");
				struct.setList_APR_INV_STS_TYP_val(cs.getValList());
				struct.setList_APR_INV_STS_TYP_name(cs.getExplanList());				
			}catch(SQLException e){
				e.printStackTrace();
				
			}*/
	
                 // �R���{�{�b�N�X�f�[�^�p��
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AH0070010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("execute") ) {
				controlexecute();
			} else if( button.equals("ApprAssort") ) {
				controlApprAssort();
			} else if( button.equals("DelApprAssort") ) {
				controlDelApprAssort();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
         	struct.seth_APR_INV_CTRL(aprInvCtrl);
            struct.seth_APRR_FLG(apprFlg);
            struct.seth_APRR_POWER_TYP(apprPowerTyp);
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
//			throw new FoundationException("AH0070010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0070010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AH0070010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0070010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AH0070010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0070010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AH0070010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AH0070010Entity entity;
	protected AH0070010Struct struct;
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

		entity = new AH0070010Entity();
		struct = new AH0070010Struct();

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
	 * AH0070010�N���X�̕W���R���X�g���N�^
	 */
	public AH0070010Control() throws BusinessProcessException, FoundationException
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
				AH0070010Struct key = (AH0070010Struct)keyList.get(j);
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
				if(msgKeyType.containsKeyColumn("h_APR_INV_CTRL") && key.geth_APR_INV_CTRL() != null) {
					msgKey.setKeyValue("h_APR_INV_CTRL", key.geth_APR_INV_CTRL());
				}
				if(msgKeyType.containsKeyColumn("h_APRR_FLG") && key.geth_APRR_FLG() != null) {
					msgKey.setKeyValue("h_APRR_FLG", key.geth_APRR_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_APRR_POWER_TYP") && key.geth_APRR_POWER_TYP() != null) {
					msgKey.setKeyValue("h_APRR_POWER_TYP", key.geth_APRR_POWER_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_APPR_INV_STS_TYP") && key.getw_APPR_INV_STS_TYP() != null) {
					msgKey.setKeyValue("w_APPR_INV_STS_TYP", key.getw_APPR_INV_STS_TYP());
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
				if(msgKeyType.containsKeyColumn("APPR_FLG") && key.getAPPR_FLG() != null) {
					msgKey.setKeyValue("APPR_FLG", key.getAPPR_FLG());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("SYS_USER_CD") && key.getSYS_USER_CD() != null) {
					msgKey.setKeyValue("SYS_USER_CD", key.getSYS_USER_CD());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_DATE") && key.getBUSINESS_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_DATE", key.getBUSINESS_DATE());
				}
				if(msgKeyType.containsKeyColumn("APPR_POWER_TYP") && key.getAPPR_POWER_TYP() != null) {
					msgKey.setKeyValue("APPR_POWER_TYP", key.getAPPR_POWER_TYP());
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
					AH0070010Struct key = new AH0070010Struct();
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
					if(msgKeyType.containsKeyColumn("h_APR_INV_CTRL")) {
						key.seth_APR_INV_CTRL(msgKey.getKeyValue("h_APR_INV_CTRL"));
					}
					if(msgKeyType.containsKeyColumn("h_APRR_FLG")) {
						key.seth_APRR_FLG(msgKey.getKeyValue("h_APRR_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_APRR_POWER_TYP")) {
						key.seth_APRR_POWER_TYP(msgKey.getKeyValue("h_APRR_POWER_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_APPR_INV_STS_TYP")) {
						key.setw_APPR_INV_STS_TYP(msgKey.getKeyValue("w_APPR_INV_STS_TYP"));
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
					if(msgKeyType.containsKeyColumn("APPR_FLG")) {
						key.setAPPR_FLG(msgKey.getKeyValue("APPR_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("SYS_USER_CD")) {
						key.setSYS_USER_CD(msgKey.getKeyValue("SYS_USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_DATE")) {
						key.setBUSINESS_DATE(msgKey.getKeyValue("BUSINESS_DATE"));
					}
					if(msgKeyType.containsKeyColumn("APPR_POWER_TYP")) {
						key.setAPPR_POWER_TYP(msgKey.getKeyValue("APPR_POWER_TYP"));
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
