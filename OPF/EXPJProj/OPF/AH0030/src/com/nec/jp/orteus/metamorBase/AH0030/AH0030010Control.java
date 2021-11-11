/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AH0030/src/com/nec/jp/orteus/metamorBase/AH0030/AH0030010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AH0030;

import com.nec.jp.orteus.metamorBase.AH0030.*;
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
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
import com.nec.jp.orteus.metamorBase.common01.Inventry.InvAccessor;
import com.nec.jp.orteus.metamorBase.common01.Inventry.InvInformation;
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.LotCtrl;

import java.util.ArrayList;
//------------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AH0030010Control
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
       
        public AH0030010Struct getStruct() { return this.struct; }	// Struct�̒l�i���f�B�G�[�^�j��Ԃ��܂��B
       
        // CSV�o�͗p���X�g
        private CsvWriter csvWriter = null;
        public CsvWriter getCsvWriter(){ return this.csvWriter; }
       
        private CsvReader csvReader = null;
        public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
        
        /** ���b�g�Ǘ������σ`�F�b�N **/
    	private boolean lotCtrlFlg = false;
       
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
       
        /**
         * SQLException���b�Z�[�W�ݒ�
         * @param SQLException
         */
        private void setSqlExceptionMsg(SQLException e) throws ExpjException
        {
         // �G���[���b�Z�[�W�쐬
         ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
         sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
         ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
         throw ee;
        }
       
        /**
         * �G���[���b�Z�[�W�ݒ�
         * @param	code	���b�Z�[�W�ԍ�
         */
        private void setErrorMessage(String code)
        {
         ExpjMessage emsg = new ExpjMessage(code);
         msgStruct.addError(emsg);
         sysLog.warning(emsg, getsysUSER_CD());
        }
       
        /**
         * �G���[�������p�����[�^�ݒ�
         * @param	key		�p�����[�^
         */
        private void setErrorParameter(String key)
        {
         ExpjMessage emsg = new ExpjMessage("ZZ01006", key);
         msgStruct.addError(emsg);
         sysLog.warning(emsg, getsysUSER_CD());
        }
       
        /**
         * ��񃁃b�Z�[�W�ݒ�
         * @param ���b�Z�[�W�ԍ�
         * @param �o�̓��b�Z�[�W
         */
        private void setInfoMessage(String key)
        {
         ExpjMessage emsg = new ExpjMessage( "ZZ01006", key );
         msgStruct.addInfo( emsg );	// ��񃁃b�Z�[�W�Ƃ��ēo�^
         sysLog.config(emsg, getsysUSER_CD()); //���ڍ�
        }
       
        /**
         * ��񃁃b�Z�[�W�ݒ�
         * @param �o�̓��b�Z�[�W
         */
        private void setSyslogConfig(String key)
        {
         ExpjMessage emsg = new ExpjMessage( "ZZ01006", key );
         sysLog.config(emsg, getsysUSER_CD()); //���ڍ�
        }
       
        /**
         * Exception�G���[���b�Z�[�W�ݒ�
         * @param	code	���b�Z�[�W�ԍ�
         * @return	ExpjMessage
         */
        private ExpjMessage setExceptionMessage(String code)
        {
         ExpjMessage emsg = new ExpjMessage(code);
         sysLog.severe(emsg, getsysUSER_CD());
         return emsg;
        }
       
        /**
         * Exception�G���[�������p�����[�^�ݒ�
         * @param	key		�p�����[�^
         */
        private void setExceptionParameter(String key)
        {
         ExpjMessage emsg = new ExpjMessage("ZZ01006", key);
         sysLog.severe(emsg, getsysUSER_CD());
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
       
        /** �I���敪 */
        private ComboStruct _comboAbcTyp = new ComboStruct();
       
        /**
         * �I���敪���擾
         *
         * @param	typ		�敪�R�[�h
         * @return	�敪����(�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�)
         */
        private String getABC_TYP_name(String typ)
        {
         return (getTypName(_comboAbcTyp, typ));
        }
       
        //---------- �b�r�u�o�͊֘A�̏��� ---------------------------------------------------
       
        private List _csvList = new ArrayList(0);
        public List getCsvList(){ return _csvList; }
        public void setCsvList(List list){ _csvList = list; }
       
        //------------------------------------------------------------------
        //------------------------------------------------------------------
        //------------------------------------------------------------------
       
        /** �I�����擾�p�N���X�I�u�W�F�N�g�p�� */
        InvAccessor _invAccessor = null;
       
        /** 
         * �Ώۃf�[�^�����ɍX�V����Ă��邩�ǂ����̔��菈��
         * �i���Ӂjfor update nowait����������̂ŁA���̊֐����ĂԑO�Ƀg�����U�N�V�����J�n�������s���Ă����K�v����
         *
         * @param target_struct �Ώۃf�[�^���
         * @return �ُ�Ȃ� �ŐV�̓Ǎ���� �G���[ null
         */
        private AH0030010Struct checkTargetData(AH0030010Struct target_struct) throws FoundationException, SQLException
        {
         // �Ǎ����i�[�p�ϐ��錾
         AH0030010Struct new_struct = new AH0030010Struct();
       
         // �����Ώۃf�[�^�̑��݃`�F�b�N
         List temp_list = entity.mT_INV_CTRL4Update.read(conn, target_struct);
         if(temp_list.size() <= 0)
         {
          // �X�V�Ώۃf�[�^�����݂��Ȃ������ꍇ
          setErrorMessage("AH00021");
          setErrorParameter("T_INV_CTRL.INV_DATE:" + target_struct.getINV_DATE());
          setErrorParameter("T_INV_CTRL.PLANT_CD:" + target_struct.getPLANT_CD());
          return null;
         }
         else
         {
          // ���R�[�h���X�V����Ă��Ȃ����`�F�b�N
          new_struct = (AH0030010Struct)temp_list.get(0);
          if(new_struct.getMODIFY_COUNT().equals(target_struct.getMODIFY_COUNT()) != true)
          {
           // ���Ƀ��R�[�h���X�V
           setErrorMessage("ZZ01105");
           setErrorParameter("T_INV_CTRL.INV_DATE:" + target_struct.getINV_DATE());
           setErrorParameter("T_INV_CTRL.PLANT_CD:" + target_struct.getPLANT_CD());
           return null;
          }
         }
         return new_struct;
        }
       
        /**
         * �I����ԋ敪��2�i�I���X�V�ρj���ǂ����̔��菈��
         *
         * @param target_struct �Ώۃf�[�^���
         * @return �ُ�Ȃ� true �G���[ false
         */
        private boolean checkINV_STS_TYP_equal2(AH0030010Struct target_struct)
        {
         List key = new ArrayList();
       
         // ���ʃt���O������
         boolean bResult = true;
       
         // �I����ԋ敪��2�i�I���X�V�ρj���ǂ����̃`�F�b�N
         if("2".equals(target_struct.getINV_STS_TYP()) == true)
         {
          setErrorMessage("AH00030");
          setErrorParameter("T_INV_CTRL.INV_DATE:" + target_struct.getINV_DATE());
          setErrorParameter("T_INV_CTRL.PLANT_CD:" + target_struct.getPLANT_CD());
          setErrorParameter("T_INV_CTRL.INV_STS_TYP:" + target_struct.getINV_STS_TYP());
          bResult = false;
         }
         return bResult;
        }
       
        /** 
         * �I�����䃌�R�[�h�X�V����
         *
         * @param target_struct �X�V���
         * @return ���� true �G���[ false
         */
        private boolean updateT_INV_CTRL(AH0030010Struct target_struct) throws FoundationException, SQLException
        {
         // ���ʃt���O������
         boolean bResult = true;
       
         // �Ώۃ��R�[�h�`�F�b�N
         AH0030010Struct new_struct = new AH0030010Struct();
         new_struct = checkTargetData(target_struct);
         if(new_struct == null)
         {
          bResult = false;
         }
         else
         {
          // �X�V���s
          entity.mT_INV_CTRL.update(conn, target_struct);
         }
         return bResult;
        }
       
        /**
         * �����\��ގ��ʒ萔�擾
         *
         * @param	structTarget	�Ώۃf�[�^���
         * @return	�����\���ʒ萔 / �G���[:SHEET_NONE
         */
        private int getSheetKind(AH0030010Struct structTarget)
        {
         int intKind = SHEET_NONE;
         if( ("0".equals(structTarget.geth_sheet()) == true) && ("0".equals(structTarget.geth_stock()) == true) )
         {
          // �I�������\�|�i��
          intKind = SHEET_NORMAL_AND_ITEM;
         }
         else if( ("0".equals(structTarget.geth_sheet()) == true) && ("1".equals(structTarget.geth_stock()) == true) )
         {
          // �I�������\�|����
          intKind = SHEET_NORMAL_AND_JOB;
         }
         else if("1".equals(structTarget.geth_sheet()) == true)
         {
          // �s�Ǎ݌ɒ����\�|�i��
          intKind = SHEET_DEFECT_AND_ITEM;
         }
         else if( ("2".equals(structTarget.geth_sheet()) == true) && ("0".equals(structTarget.geth_stock()) == true) )
         {
          // �}�C�i�X�݌ɒ����\�|�i��
          intKind = SHEET_MINUS_AND_ITEM;
         }
         else if( ("2".equals(structTarget.geth_sheet()) == true) && ("1".equals(structTarget.geth_stock()) == true) )
         {
          // �}�C�i�X�݌ɒ����\�|����
          intKind = SHEET_MINUS_AND_JOB;
         }
         else if("3".equals(structTarget.geth_sheet()) == true)
         {
          // �ϑ��݌ɒ����\�|�ϑ�
          intKind = SHEET_TRANS_AND_TRANS;
         }
         return intKind;
        }
       
        /** 
         * �o�͈ꗗ���擾
         *
         * @param	structTarget	�Ώۃf�[�^���
         * @return	�o�͈ꗗ���擾 / �G���[:null
         */
        private List getOutList(AH0030010Struct structTarget)
        {
         List key = new ArrayList();
       
         // �ۊǋ�R�[�h
         String strWH_CD = structTarget.getWH_CD();
         if("1".equals(structTarget.geth_wh()) != true)
         {
          // �ۊǋ�w�肪�I������Ă��Ȃ��ꍇ�́A%��ݒ肷��
          strWH_CD = "%";
         }
         // ���b�g�ԍ�
         String strLOT_NO = structTarget.getLOT_NO();
         if("1".equals(structTarget.geth_lot()) != true){
           // ���b�g�ԍ��w�肪�I������Ă��Ȃ��ꍇ�́A%��ݒ肷��
           strLOT_NO = "%";
         }
         
         // �i�ڔԍ�
         String strITEM_CD = structTarget.getITEM_CD();
         if("1".equals(structTarget.geth_item()) != true){
           // �i�ڔԍ��w�肪�I������Ă��Ȃ��ꍇ�́A%��ݒ肷��
        	strITEM_CD = "%";
         }

       
         // ���擾���s
         List listTarget = _invAccessor.getStockList(
          conn, 
          structTarget.getINV_DATE(), 
          structTarget.geth_sheet(), 
          structTarget.geth_stock(), 
          strWH_CD,
          strLOT_NO,
          strITEM_CD);
       
         // �擾�f�[�^������ꍇ�̂ݏo�͗p���X�g�֎擾���X�g��ݒ肷��
         if(listTarget != null && listTarget.size() <= 0)
         {
          // �Ώۃf�[�^�����݂��Ȃ�
          String strDbName = getTableName4Log(structTarget);
          setErrorMessage("ZZ06001");
          setErrorParameter(strDbName + ".PLANT_CD:" + structTarget.getPLANT_CD());
          setErrorParameter(strDbName + ".WH_CD:" + structTarget.getWH_CD());
          
          if(struct.getr2_stock1().equals("true")){
        	  setErrorParameter("T_LOT_STOCK.LOT_NO:" + structTarget.getLOT_NO());
          }
          setErrorParameter(strDbName + ".ITEM_CD:" + structTarget.getITEM_CD());  
       
          listTarget = null;
         }
         return listTarget;
        }
       
        /**
         * �o�͈ꗗ���擾�e�[�u�����擾�i���O�o�͗p�j
         *
         * @param	structTarget	�Ώۃf�[�^���
         * @return	����:�ꗗ���擾�e�[�u���������� / ���s:�󕶎�
         */
    	private String getTableName4Log(AH0030010Struct structTarget) {
    		String strDbName = "";
    		switch (getSheetKind(structTarget)) {
    		// �I�������\�|�i��
    		case SHEET_NORMAL_AND_ITEM: 
            // �s�Ǎ݌ɒ����\�|�i��
    		case SHEET_DEFECT_AND_ITEM: 
            // �}�C�i�X�݌ɒ����\�|�i��
    		case SHEET_MINUS_AND_ITEM: 
    			strDbName = "T_ITEM_STOCK";
    			break;
            // �I�������\�|����
    		case SHEET_NORMAL_AND_JOB: 
            // �}�C�i�X�݌ɒ����\�|����
    		case SHEET_MINUS_AND_JOB: 
    			strDbName = "T_JOB_ODR_CD_STOCK";
    			break;
            // �ϑ��݌ɒ����\�|�ϑ�
    		case SHEET_TRANS_AND_TRANS: 
    			strDbName = "T_TRANSPORT_STOCK";
    			break;
            // �����\��ޕs��	
    		default:
    			break;
    		}
    		return strDbName;
    	}
       
        //---------- ���[�o�͊֘A�̏��� ---------------------------------------------------
       
        /** �t�H�[������ID�i�i�ڍ݌Ɂ|�i�ڏ��j */
        private final String FORMID_NORMAL_AND_ITEM		= "1";
        /** �t�H�[������ID�i���ԍ݌Ɂ|�i�ڏ��j */
        private final String FORMID_NORMAL_AND_JOB		= "2";
        /** �t�H�[������ID�i�i�ڍ݌Ɂ|�ۊǋ揇�j */
        private final String FORMID_DEFECT_AND_ITEM		= "3";
        /** �t�H�[������ID�i���ԍ݌Ɂ|�ۊǋ揇�j */
        private final String FORMID_MINUS_AND_ITEM		= "4";
        /** �t�H�[������ID�i�i�ڍ݌Ɂ|�ۊǋ揇�j */
        private final String FORMID_MINUS_AND_JOB		= "5";
        /** �t�H�[������ID�i���ԍ݌Ɂ|�ۊǋ揇�j */
        private final String FORMID_TRANS_AND_TRANS		= "6";
       
        /** �����\��ޒ萔�i�Y���Ȃ��j */
        private final int SHEET_NONE = 0;
        /** �����\��ޒ萔�i�I�������\�|�i�ځj */
        private final int SHEET_NORMAL_AND_ITEM = (SHEET_NONE+1);
        /** �����\��ޒ萔�i�I�������\�|���ԁj */
        private final int SHEET_NORMAL_AND_JOB = (SHEET_NORMAL_AND_ITEM+1);
        /** �����\��ޒ萔�i�s�Ǎ݌ɒ����\�|�i�ځj */
        private final int SHEET_DEFECT_AND_ITEM = (SHEET_NORMAL_AND_JOB+1);
        /** �����\��ޒ萔�i�}�C�i�X�݌ɒ����\�|�i�ځj */
        private final int SHEET_MINUS_AND_ITEM = (SHEET_DEFECT_AND_ITEM+1);
        /** �����\��ޒ萔�i�}�C�i�X�݌ɒ����\�|���ԁj */
        private final int SHEET_MINUS_AND_JOB = (SHEET_MINUS_AND_ITEM+1);
        /** �����\��ޒ萔�i�ϑ��݌ɒ����\�|�ϑ��j */
        private final int SHEET_TRANS_AND_TRANS = (SHEET_MINUS_AND_JOB+1);
       
        /**
         * �t�H�[���t�@�C�����擾
         *
         * @param	structTarget	�Ώۃf�[�^���
         * @return	�t�H�[���t�@�C����:���� / null:���s
         */
        private String getFormFileName(AH0030010Struct structTarget)
        {
         // �t�H�[������ID�ݒ�
         String strFormId = null;
         switch(getSheetKind(structTarget))
         {
         case SHEET_NORMAL_AND_ITEM:	// �I�������\�|�i��
          strFormId = FORMID_NORMAL_AND_ITEM;
          break;
         case SHEET_NORMAL_AND_JOB:	// �I�������\�|����
          strFormId = FORMID_NORMAL_AND_JOB;
          break;
         case SHEET_DEFECT_AND_ITEM:	// �s�Ǎ݌ɒ����\�|�i��
          strFormId = FORMID_DEFECT_AND_ITEM;
          break;
         case SHEET_MINUS_AND_ITEM:	// �}�C�i�X�݌ɒ����\�|�i��
          strFormId = FORMID_MINUS_AND_ITEM;
          break;
         case SHEET_MINUS_AND_JOB:		// �}�C�i�X�݌ɒ����\�|����
          strFormId = FORMID_MINUS_AND_JOB;
          break;
         case SHEET_TRANS_AND_TRANS:	// �ϑ��݌ɒ����\�|�ϑ�
          strFormId = FORMID_TRANS_AND_TRANS;
          break;
         default:// �����\��ޕs��
          setSyslogConfig("Faile form-id");
          break;
         }
       
         // �t�H�[���t�@�C�����쐬
         String strFormFileName = null;
         if(strFormId != null)
         {
          // ���[�t�H�[���t�@�C���ݒ�
          strFormFileName = sp.getProcId() + strFormId;// �� AH0030010 + ID
         }
         return strFormFileName;
        }
       
        //---------- csv�o�͊֘A�̏��� ---------------------------------------------------
       
        /** 
         * csv�o�͏���
         *
         * @param	structTarget	�Ώۃf�[�^���
         * @return	����:true / �G���[:false
         */
    	private boolean csvExport(AH0030010Struct structTarget) {
    		// �o�͑Ώۃ��X�g���擾
    		List listTarget = getOutList(structTarget);
    		if (listTarget == null) {
    			// ���X�g�擾�ŃG���[
    			return false;
    		}

    		// ���������t���O������
    		boolean bSuccess = true;

    		// �����\��ގ擾
    		int intKind = getSheetKind(structTarget);
    		switch (intKind) {
    		case SHEET_NORMAL_AND_ITEM: // �I�������\�|�i��
    			csvExport4NormalAndItem(listTarget);
    			break;
    		case SHEET_NORMAL_AND_JOB: // �I�������\�|����
    			csvExport4NormalAndJobOdr(listTarget);
    			break;
    		case SHEET_DEFECT_AND_ITEM: // �s�Ǎ݌ɒ����\�|�i��
    			csvExport4DefectAndItem(listTarget);
    			break;
    		case SHEET_MINUS_AND_ITEM: // �}�C�i�X�݌ɒ����\�|�i��
    			csvExport4MinusAndItem(listTarget);
    			break;
    		case SHEET_MINUS_AND_JOB: // �}�C�i�X�݌ɒ����\�|����
    			csvExport4MinusAndJobOdr(listTarget);
    			break;
    		case SHEET_TRANS_AND_TRANS: // �ϑ��݌ɒ����\�|�ϑ�
    			csvExport4TransportAndTransport(listTarget);
    			break;
    		default:// �����\��ޕs��
    			bSuccess = false;
    			break;
    		}
    		return bSuccess;
    	}
       
        /** 
         * csv�o�͏����i�I�������\�|�i�ځj
         *
         * @param data_list �Ώۃf�[�^���X�g
         * @return �ُ�Ȃ� true �G���[ false
         */
        private boolean csvExport4NormalAndItem(List data_list)
        {
         // CSV���̍쐬
         String title[] = {
         	"Expj.INV_DATE" ,
			"Expj.PLANT_CD" ,
			"Expj.PLANT_NAME" ,
			"Expj.WH_CD" ,
			"Expj.WH_NAME" ,
			"Expj.ITEM_CD" ,
			"Expj.ITEM_NAME" ,
			"Expj.STOCK_LOT_CD",
			"Expj.VEND_LOT_NO",
			"Expj.Cmt1118" ,
			"Expj.Cmt1119" ,
			"Expj.PUCH_ODR_UNIT" ,
			"Expj.ABC_TYP" ,
			"Expj.Cmt1044" 
         };
       
         _csvList.add(title);
         for(int i=0; i < data_list.size(); i++)
         {
          InvInformation info = (InvInformation)data_list.get(i);
       
          String csvStr [] = new String[title.length];
          int cnt = 0;
          csvStr[cnt++] = info.getINV_DATE();
          csvStr[cnt++] = info.getPLANT_CD();
          csvStr[cnt++] = info.getPLANT_NAME();
          csvStr[cnt++] = info.getWH_CD();
          csvStr[cnt++] = info.getWH_NAME();
          csvStr[cnt++] = info.getITEM_CD();
          csvStr[cnt++] = info.getITEM_NAME();
          csvStr[cnt++] = info.getLOT_NO_P();
          csvStr[cnt++] = info.getEXTERNAL_LOT_NO();
          csvStr[cnt++] = info.getSTOCK_ON_HAND_QTY();
          csvStr[cnt++] = info.getDEFECT_QTY();
          csvStr[cnt++] = info.getSTOCK_UNIT();
          csvStr[cnt++] = getABC_TYP_name(info.getABC_TYP());
          csvStr[cnt++] = info.getSYSTEM_DATETIME();
          _csvList.add(csvStr);
         }
         return true;
        }
       
        /** 
         * csv�o�͏����i�I�������\�|���ԁj
         *
         * @param data_list �Ώۃf�[�^���X�g
         * @return �ُ�Ȃ� true �G���[ false
         */
        private boolean csvExport4NormalAndJobOdr(List data_list)
        {
         // CSV���̍쐬
         String title[] = {
         	"Expj.INV_DATE" ,
			"Expj.PLANT_CD" ,
			"Expj.PLANT_NAME" ,
			"Expj.WH_CD" ,
			"Expj.WH_NAME" ,
			"Expj.ITEM_CD" ,
			"Expj.ITEM_NAME" ,
			"Expj.JOB_ODR_CD" ,
			"Expj.Cmt1118" ,
			"Expj.PUCH_ODR_UNIT" ,
			"Expj.ABC_TYP" ,
			"Expj.Cmt1044" 
         };
       
         _csvList.add(title);
         for(int i=0; i < data_list.size(); i++)
         {
          InvInformation info = (InvInformation)data_list.get(i);
       
          String csvStr [] = new String[title.length];
          int cnt = 0;
          csvStr[cnt++] = info.getINV_DATE();
          csvStr[cnt++] = info.getPLANT_CD();
          csvStr[cnt++] = info.getPLANT_NAME();
          csvStr[cnt++] = info.getWH_CD();
          csvStr[cnt++] = info.getWH_NAME();
          csvStr[cnt++] = info.getITEM_CD();
          csvStr[cnt++] = info.getITEM_NAME();
          csvStr[cnt++] = info.getJOB_ODR_CD();
          csvStr[cnt++] = info.getSTOCK_ON_HAND_QTY();
          csvStr[cnt++] = info.getSTOCK_UNIT();
          csvStr[cnt++] = getABC_TYP_name(info.getABC_TYP());
          csvStr[cnt++] = info.getSYSTEM_DATETIME();
          _csvList.add(csvStr);
         }
         return true;
        }
       
        /** 
         * csv�o�͏����i�s�Ǎ݌ɒ����\�|�i�ځj
         *
         * @param data_list �Ώۃf�[�^���X�g
         * @return �ُ�Ȃ� true �G���[ false
         */
        private boolean csvExport4DefectAndItem(List data_list)
        {
         // CSV���̍쐬
         String title[] = {
         	"Expj.INV_DATE" ,
			"Expj.PLANT_CD" ,
			"Expj.PLANT_NAME" ,
			"Expj.WH_CD" ,
			"Expj.WH_NAME" ,
			"Expj.ITEM_CD" ,
			"Expj.ITEM_NAME" ,
			"Expj.STOCK_LOT_CD",
			"Expj.VEND_LOT_NO",
			"Expj.Cmt1119" ,
			"Expj.Cmt1120" ,
			"Expj.PUCH_ODR_UNIT" ,
			"Expj.ABC_TYP" ,
			"Expj.Cmt1044" 
         };
       
         _csvList.add(title);
         for(int i=0; i < data_list.size(); i++)
         {
          InvInformation info = (InvInformation)data_list.get(i);
       
          String csvStr [] = new String[title.length];
          int cnt = 0;
          csvStr[cnt++] = info.getINV_DATE();
          csvStr[cnt++] = info.getPLANT_CD();
          csvStr[cnt++] = info.getPLANT_NAME();
          csvStr[cnt++] = info.getWH_CD();
          csvStr[cnt++] = info.getWH_NAME();
          csvStr[cnt++] = info.getITEM_CD();
          csvStr[cnt++] = info.getITEM_NAME();
          csvStr[cnt++] = info.getLOT_NO_P();
          csvStr[cnt++] = info.getEXTERNAL_LOT_NO();
          csvStr[cnt++] = info.getDEFECT_QTY();
          csvStr[cnt++] = info.getSTOCK_ON_HAND_QTY();
          csvStr[cnt++] = info.getSTOCK_UNIT();
          csvStr[cnt++] = getABC_TYP_name(info.getABC_TYP());
          csvStr[cnt++] = info.getSYSTEM_DATETIME();
          _csvList.add(csvStr);
         }
         return true;
        }
       
        /** 
         * csv�o�͏����i�}�C�i�X�݌ɒ����\�|�i�ځj
         *
         * @param data_list �Ώۃf�[�^���X�g
         * @return �ُ�Ȃ� true �G���[ false
         */
        private boolean csvExport4MinusAndItem(List data_list)
        {
         // CSV���̍쐬
         String title[] = {
         	"Expj.INV_DATE" ,
			"Expj.PLANT_CD" ,
			"Expj.PLANT_NAME" ,
			"Expj.WH_CD" ,
			"Expj.WH_NAME" ,
			"Expj.ITEM_CD" ,
			"Expj.ITEM_NAME" ,
			"Expj.STOCK_LOT_CD",
			"Expj.VEND_LOT_NO",
			"Expj.Cmt1118" ,
			"Expj.Cmt1119" ,
			"Expj.PUCH_ODR_UNIT" ,
			"Expj.ABC_TYP" ,
			"Expj.Cmt1044" 
         };
       
         _csvList.add(title);
         for(int i=0; i < data_list.size(); i++)
         {
          InvInformation info = (InvInformation)data_list.get(i);
       
          String csvStr [] = new String[title.length];
          int cnt = 0;
          csvStr[cnt++] = info.getINV_DATE();
          csvStr[cnt++] = info.getPLANT_CD();
          csvStr[cnt++] = info.getPLANT_NAME();
          csvStr[cnt++] = info.getWH_CD();
          csvStr[cnt++] = info.getWH_NAME();
          csvStr[cnt++] = info.getITEM_CD();
          csvStr[cnt++] = info.getITEM_NAME();
          csvStr[cnt++] = info.getLOT_NO_P();
          csvStr[cnt++] = info.getEXTERNAL_LOT_NO();
          csvStr[cnt++] = info.getSTOCK_ON_HAND_QTY();
          csvStr[cnt++] = info.getDEFECT_QTY();
          csvStr[cnt++] = info.getSTOCK_UNIT();
          csvStr[cnt++] = getABC_TYP_name(info.getABC_TYP());
          csvStr[cnt++] = info.getSYSTEM_DATETIME();
          _csvList.add(csvStr);
         }
         return true;
        }
       
        /** 
         * csv�o�͏����i�}�C�i�X�݌ɒ����\�|���ԁj
         *
         * @param data_list �Ώۃf�[�^���X�g
         * @return �ُ�Ȃ� true �G���[ false
         */
        private boolean csvExport4MinusAndJobOdr(List data_list)
        {
         // CSV���̍쐬
         String title[] = {
         	"Expj.INV_DATE" ,
			"Expj.PLANT_CD" ,
			"Expj.PLANT_NAME" ,
			"Expj.WH_CD" ,
			"Expj.WH_NAME" ,
			"Expj.ITEM_CD" ,
			"Expj.ITEM_NAME" ,
			"Expj.JOB_ODR_CD" ,
			"Expj.Cmt1118" ,
			"Expj.PUCH_ODR_UNIT" ,
			"Expj.ABC_TYP" ,
			"Expj.Cmt1044" 
         };
       
         _csvList.add(title);
         for(int i=0; i < data_list.size(); i++)
         {
          InvInformation info = (InvInformation)data_list.get(i);
       
          String csvStr [] = new String[title.length];
          int cnt = 0;
          csvStr[cnt++] = info.getINV_DATE();
          csvStr[cnt++] = info.getPLANT_CD();
          csvStr[cnt++] = info.getPLANT_NAME();
          csvStr[cnt++] = info.getWH_CD();
          csvStr[cnt++] = info.getWH_NAME();
          csvStr[cnt++] = info.getITEM_CD();
          csvStr[cnt++] = info.getITEM_NAME();
          csvStr[cnt++] = info.getJOB_ODR_CD();
          csvStr[cnt++] = info.getSTOCK_ON_HAND_QTY();
          csvStr[cnt++] = info.getSTOCK_UNIT();
          csvStr[cnt++] = getABC_TYP_name(info.getABC_TYP());
          csvStr[cnt++] = info.getSYSTEM_DATETIME();
          _csvList.add(csvStr);
         }
         return true;
        }
       
        /** 
         * csv�o�͏����i�ϑ��݌ɒ����\�|�ϑ��j
         *
         * @param data_list �Ώۃf�[�^���X�g
         * @return �ُ�Ȃ� true �G���[ false
         */
        private boolean csvExport4TransportAndTransport(List data_list)
        {
         // CSV���̍쐬
         String title[] = {
         	"Expj.INV_DATE" ,
			"Expj.PLANT_CD" ,
			"Expj.PLANT_NAME" ,
			"Expj.ISSUE_WH_CD" ,
			"Expj.WH_NAME_3" ,
			"Expj.ITEM_CD" ,
			"Expj.ITEM_NAME" ,
			"Expj.JOB_ODR_CD" ,
			"Expj.STOCK_LOT_CD",
			"Expj.RCV_PLANT_CD" ,
			"Expj.Cmt1097" ,
			"Expj.RCV_WH_CD" ,
			"Expj.Cmt1098" ,
			"Expj.Cmt1091" ,
			"Expj.PUCH_ODR_UNIT" ,
			"Expj.ABC_TYP" ,
			"Expj.Cmt1044" 
         };
       
         _csvList.add(title);
         for(int i=0; i < data_list.size(); i++)
         {
          InvInformation info = (InvInformation)data_list.get(i);
       
          String csvStr [] = new String[title.length];
          int cnt = 0;
          csvStr[cnt++] = info.getINV_DATE();
          csvStr[cnt++] = info.getISSUE_PLANT_CD();
          csvStr[cnt++] = info.getISSUE_PLANT_NAME();
          csvStr[cnt++] = info.getISSUE_WH_CD();
          csvStr[cnt++] = info.getISSUE_WH_NAME();
          csvStr[cnt++] = info.getITEM_CD();
          csvStr[cnt++] = info.getITEM_NAME();
          csvStr[cnt++] = info.getJOB_ODR_CD();
          csvStr[cnt++] = info.getLOT_NO_P();
          csvStr[cnt++] = info.getRCV_PLANT_CD();
          csvStr[cnt++] = info.getRCV_PLANT_NAME();
          csvStr[cnt++] = info.getRCV_WH_CD();
          csvStr[cnt++] = info.getRCV_WH_NAME();
          csvStr[cnt++] = info.getw_TRANSPORT_QTY();
          csvStr[cnt++] = info.getSTOCK_UNIT();
          csvStr[cnt++] = getABC_TYP_name(info.getABC_TYP());
          csvStr[cnt++] = info.getSYSTEM_DATETIME();
          _csvList.add(csvStr);
         }
         return true;
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0030");
		logger.entering("AH0030010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
                //------------------------------------------------------------------
                List key = new ArrayList();
              
                // �Ǎ����������t���O������
                boolean bSuccess = false;
              
                // �������O��struct����ޔ�
                AH0030010Struct copy_struct = new AH0030010Struct();
                copy_struct.copy(struct);
              
                // ������Ԃ�������
                setReadStatus(INITIAL);
                try {
                 // �G���[�t���O������
                 boolean bError = false;
              
                 // �����Ɋ֘A����p�����[�^��ݒ�
                 struct.setPLANT_CD(getsysPLANT_CD());
                 struct.setw_INV_status("");
              
                 // �Ǎ����s
                 List temp_list = new ArrayList(0);
                 temp_list = entity.mT_INV_CTRL.read(conn, struct);
              
                 // ���R�[�h�����`�F�b�N
                 if(temp_list.size() <= 0)
                 {
                  // �G���[�t���O�ݒ�
                  bError = true;
              
                  // ���R�[�h�������O(�[��)���̏ꍇ
                  setErrorMessage("AH00021");
                  setErrorParameter("T_INV_CTRL.INV_DATE:" + struct.getINV_DATE());
                  setErrorParameter("T_INV_CTRL.PLANT_CD:" + struct.getPLANT_CD());
                 }
              
                 // �G���[���Ȃ��ꍇ
                 if(bError != true)
                 {
                  // �Ǎ��f�[�^�擾
                  AH0030010Struct temp_struct = (AH0030010Struct)temp_list.get(0);
              
                  // �I����ԋ敪��2�i�I���X�V�ρj���ǂ����̃`�F�b�N
                  if(checkINV_STS_TYP_equal2(temp_struct) != true)
                  {
                   // �G���[�t���O�ݒ�
                   bError = true;
                  }
              
                  // �G���[���Ȃ��ꍇ
                  if(bError != true)
                  {
                   // �\���pstruct�֓Ǎ��f�[�^��ݒ�
                   struct.copy(temp_struct);
              
                   // �I���󋵕�����擾�ݒ菈��
                   String strInvStatus = _invAccessor.getInvStatus(
                    conn,
                    struct.getREGULAR_INV_FLG(),
                    struct.getCYCLE_INV_FLG(),
                    struct.getTEMP_INV_FLG(),
                    struct.getINV_STS_TYP(),
                    CoreTools.getLocale(struct.getsUser_ID()));
                   struct.setw_INV_status(strInvStatus);
              
                   // ��ʏ�̐ݒ�l���Đݒ�
                   struct.setINV_DATE(copy_struct.getINV_DATE());
                   struct.seth_sheet(copy_struct.geth_sheet());
                   struct.seth_stock(copy_struct.geth_stock());
                   struct.seth_wh(copy_struct.geth_wh());
                   struct.seth_item(copy_struct.geth_item());
                   struct.setITEM_CD(copy_struct.getITEM_CD());
                   struct.seth_lot(copy_struct.geth_lot());
                   struct.setWH_CD(copy_struct.getWH_CD());
                   struct.setLOT_NO(copy_struct.getLOT_NO());
              
                   // �Ǎ����������t���O�ݒ�
                   bSuccess = true;
                  }
                 }
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                } finally {
                 if(bSuccess == true)
                 {
                  // ������Ԃ��u�Ǎ������v�ɐݒ�
                  setReadStatus(NORMAL);
              
                  // �Ǎ��������̃L�[����ޔ�
                  struct.seth_saveINV_DATE(struct.getINV_DATE());
                 }
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AH0030010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * CSV�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlcsv_export() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0030");
		logger.entering("AH0030010Control"+":USER="+struct.getsUser_ID(),"controlcsv_export");
			//{{user_implement_dev:<controlcsv_export>
                //---------------------------------------------------------------------
		// CsvWriter�𐶐�
		csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));
		setSyslogConfig("csv-file name [" + CsvWriter.getFileName(getsysUSER_CD()) + "]");

		// DB�X�V���t���O������
		boolean bDBUpdate = false;

		// �X�V���������t���O������
		boolean bSuccess = false;

		// �������O��struct����ޔ�
		AH0030010Struct copy_struct = new AH0030010Struct();
		copy_struct.copy(struct);

		// �b�r�u�f�[�^�i�[�p���X�g��������
		_csvList.clear();

		try {
			// �g�����U�N�V�����J�n
			conn.beginTransWeb();

			// DB�X�V���t���OON
			bDBUpdate = true;

			// �G���[�t���O������
			boolean bError = false;

			// �����Ɋ֘A����p�����[�^��ݒ�
			struct.setPLANT_CD(getsysPLANT_CD());

			// �I������e�[�u���̊Y�����R�[�h���X�V
			if (updateT_INV_CTRL(struct) == true) {
				// �b�r�u�o�͏���
				if (csvExport(struct) == true) {
					// �R�~�b�g
					conn.commit();

					// DB�X�V���t���OOFF
					bDBUpdate = false;

					String strFilePath = null;
					try {
						// CSV�쐬
						setSyslogConfig("_csvList.size [" + _csvList.size() + "]");
						csvWriter.write(_csvList, CoreTools.getLocale(struct.getsUser_ID()), true);
						strFilePath = csvWriter.getFilePath();
						setSyslogConfig("Completion of CSV-data output.");
					} catch (Exception e) {
						// CSV�p�f�[�^�쐬���ɃG���[���������܂����B
						ExpjMessage emsg = setExceptionMessage("ZZ01107");
						ExpjException ee = new ExpjException(e, emsg);

						String strDbName = getTableName4Log(struct);
						setExceptionParameter(strDbName + ".PLANT_CD:" + struct.getPLANT_CD());								
						setExceptionParameter(strDbName + ".WH_CD:" + struct.getWH_CD());								
						throw ee;
					}
					// �ēǍ�����
					controlselect();

					// �o�̓t�@�C���p�X�ݒ�
					struct.setDOWNLOAD_FILE(strFilePath);

					// �X�V���������t���O�ݒ�
					bSuccess = true;
				}
			}

		} catch (SQLException e) {
			setSqlExceptionMsg(e);

		} finally {
			// DB�X�V�������ɉ��炩�̃G���[�����������ꍇ��roolback�������Ȃ�
			if (bDBUpdate == true) {
				// ���[���o�b�N
				conn.rollback();
			}

			// �b�r�u�o�͏����Ŏ��s�����ꍇ
			if (bSuccess != true) {
				// �������O�̏�Ԃɖ߂�����
				struct.copy(copy_struct);
			}
		}
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlcsv_export>
		logger.exiting("AH0030010Control"+":USER="+struct.getsUser_ID(),"controlcsv_export");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0030");
		logger.entering("AH0030010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
                //------------------------------------------------------------------
                // struct������
                struct.initializeParent();
              
                // ������Ԃ�������
                setReadStatus(INITIAL);
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AH0030010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * ���[�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlPrint() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0030");
		logger.entering("AH0030010Control"+":USER="+struct.getsUser_ID(),"controlPrint");
			AH0030010Struct strPdf = null;

		int ret = 0;
		String printType      = getPdfOutputType();
		String printPattern   = getPdfOutputListPattern();
		String printer        = getPdfOutputPrinter();
		SvfWrapper svf        = new SvfWrapper(printType, getsysUSER_CD(), printer);

			//{{user_implement_dev:<controlPrint>
                //---------------------------------------------------------------------
		// DB�X�V���t���O������
		boolean bDBUpdate = false;

		// �X�V���������t���O������
		boolean bSuccess = false;

		// �������O��struct����ޔ�
		AH0030010Struct copy_struct = new AH0030010Struct();
		copy_struct.copy(struct);

		try {
			// �G���[�t���O������
			boolean bError = false;

			// �g�����U�N�V�����J�n
			conn.beginTransWeb();

			// DB�X�V���t���OON
			bDBUpdate = true;

			// �����Ɋ֘A����p�����[�^��ݒ�
			struct.setPLANT_CD(getsysPLANT_CD());

			// �I������e�[�u���̊Y�����R�[�h���X�V
			if (updateT_INV_CTRL(struct)) {
				// ���[�o�͏���
				struct.setDOWNLOAD_FILE(null); // �_�E�����[�h�t�@�C�����N���A
				String printIdFrm = getFormFileName(struct); // ���[ID���w�肵�Ă�������
				String printIdVrq = getFormFileName(struct); // ���[ID���w�肵�Ă�������
				// �����^���琔�l�^�֕ϊ�
				int intRegularInvFlg = Integer.parseInt(struct.getREGULAR_INV_FLG());
				int intCycleInvFlg = Integer.parseInt(struct.getCYCLE_INV_FLG());
				int intTempInvFlg = Integer.parseInt(struct.getTEMP_INV_FLG());

				if ((intRegularInvFlg == 1) && (intCycleInvFlg == 0) && (intTempInvFlg == 0)) {						
					// ����I���݂̂̏ꍇ
					printIdVrq = printIdVrq + 1;

				} else if ((intRegularInvFlg == 0) && (intCycleInvFlg == 1) && (intTempInvFlg == 0)) {						
					// �z�I���݂̂̏ꍇ
					printIdVrq = printIdVrq + 2;

				} else if ((intRegularInvFlg == 0) && (intCycleInvFlg == 0) && (intTempInvFlg == 1)) {						
					// �Վ��I���݂̂̏ꍇ
					printIdVrq = printIdVrq + 3;
					
				} else if ((intRegularInvFlg == 0) && (intCycleInvFlg == 1) && (intTempInvFlg == 1)) {						
					// �z�A�Վ��I���̏ꍇ
					printIdVrq = printIdVrq + 4;

				}
				// PDF�쐬�J�n
				ret = svf.VrInit(printIdFrm, printIdVrq); 
				// pdf�t���p�X�t�@�C����
				pdfFilePath = svf.getPdfFilePath(); 
				// pdf�t�@�C�����iWeb�p�j
				pdfFileName = svf.getPdfFileName(); 
				
				/* �N�G���[�t�@�C���̎w�� */
				if (dbKIND != null && !dbKIND.equals("")) {
					ret = svf.VrSetQuery("KIND=" + dbKIND + ";UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);
							
				} else {
					ret = svf.VrSetQuery("UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);							
				}

				/* �N�G���[���o�����̎w�� */
				// �ۊǋ�R�[�h
				String strWH_CD = struct.getWH_CD();
				if (!"1".equals(struct.geth_wh())) {
					// �ۊǋ�w�肪�I������Ă��Ȃ��ꍇ�́A%��ݒ肷��
					strWH_CD = "%";
				}
				// �ۊǋ�R�[�h
				if (strWH_CD == null || "".equals(strWH_CD)) {
					ret = svf.VrCondition("[X|WH_CD]=" + "%", 4);
				} else {
					ret = svf.VrCondition("[X|WH_CD]=" + strWH_CD, 4);
				}
				// �i�ڔԍ�
				String strITEM_CD = struct.getITEM_CD();
				if (!"1".equals(struct.geth_item())) {
					// �i�ڔԍ��w�肪�I������Ă��Ȃ��ꍇ�́A%��ݒ肷��
					strITEM_CD = "%";
				}
				// �i�ڔԍ�
				if (strITEM_CD == null || "".equals(strITEM_CD)) {
					ret = svf.VrCondition("[X|ITEM_CD]=" + "%", 4);
				} else {
					ret = svf.VrCondition("[X|ITEM_CD]=" + strITEM_CD, 4);
				}
				// �݌Ƀ��b�g�ԍ�
				String strLOT_NO = struct.getLOT_NO();
				if (!"1".equals(struct.geth_lot())) {
					// �݌Ƀ��b�g�ԍ��w�肪�I������Ă��Ȃ��ꍇ�́A%��ݒ肷��
					strLOT_NO = "%";
				}
				// �݌Ƀ��b�g�ԍ�
				if (strLOT_NO == null || "".equals(strLOT_NO)) {
					ret = svf.VrCondition("[X|LOT_NO]=" + "%", 4);
				} else {
					ret = svf.VrCondition("[X|LOT_NO]=" + strLOT_NO, 4);
				}
				// �H��R�[�h
				if (struct.getPLANT_CD() == null || "".equals(struct.getPLANT_CD())) {						
					ret = svf.VrCondition("[X|SYS_PLANT_CD]=" + "ZZZ", 4);
					ret = svf.VrCondition("[X|PLANT_CD]=" + "ZZZ", 4);
				} else {
					ret = svf.VrCondition("[X|SYS_PLANT_CD]=" + struct.getPLANT_CD(), 4);							
					ret = svf.VrCondition("[X|PLANT_CD]=" + struct.getPLANT_CD(), 4);
							
				}
				// �H�ꖼ
				if (getsysPLANT_NAME() == null || "".equals(getsysPLANT_NAME())) {
					ret = svf.VrCondition("[X|SYS_PLANT_NAME]=" + "#", 4);
					ret = svf.VrCondition("[X|PLANT_NAME_FLG]=" + "0", 4);
				} else {
					ret = svf.VrCondition("[X|SYS_PLANT_NAME]=" + getsysPLANT_NAME(), 4);							
					ret = svf.VrCondition("[X|PLANT_NAME_FLG]=" + "1", 4);
				}

				// �I����
				ret = svf.VrCondition("[X|INV_DATE]=" + struct.getINV_DATE(), 4);
						
				/* �N�G���[���s */
				ret = svf.VrReport();
				if (ret == -554) {
					// �Ώۃf�[�^�����݂��܂���B
					ExpjMessage emsg = new ExpjMessage("ZZ06001");
					msgStruct.addError(emsg);
					sysLog.warning(emsg, sysUSER_CD);
					return;
				}
				
				/* PDF�쐬�I�� */
				ret = svf.VrQuit();
				// �N���C�A���g����̏ꍇ
				if ("0".equals(printType)) { 
					struct.setDOWNLOAD_FILE(getPdfFileName());
				} 
				// �T�[�o����̏ꍇ
				else if ("1".equals(printType)) {
					try {
						String acrobatPath = svf.getAcrobatPath();
						String acrobatOption1 = svf.getAcrobatOption1();
						String acrobatOption2 = svf.getAcrobatOption2();
						String pdfPrinter = svf.getPrinter();
						Runtime.getRuntime().exec(new String[]{acrobatPath, acrobatOption1, acrobatOption2, pdfFilePath, pdfPrinter});
						//Runtime.getRuntime().exec(svf.getExecuteOutput());
					} catch (IOException e) {
						// �T�[�o������s���̃G���[�������L�q���Ă��������B
					}
				}

				// /////////////////////////////////////////////////////////////////////////////
				setSyslogConfig("Completion of PDF-data output.");
				// /////////////////////////////////////////////////////////////////////////////

				// �R�~�b�g
				conn.commit();

				// DB�X�V���t���OOFF
				bDBUpdate = false;

				// �ēǍ�����
				controlselect();

				// �ēǍ������ŁADOWNLOAD_FILE�̓��e���N���A����Ă��܂��̂ŁA
				// �����ōēx�ݒ肵�Ă��܂�
				if ("0".equals(printType)) { // �N���C�A���g����̏ꍇ
					struct.setDOWNLOAD_FILE(getPdfFileName());
				}

				// ���������t���O�ݒ�
				bSuccess = true;

			} 

		} catch (SQLException e) {
			setSqlExceptionMsg(e);

		} finally {
			// DB�X�V�������ɉ��炩�̃G���[�����������ꍇ��roolback�������Ȃ�
			if (bDBUpdate == true) {
				// ���[���o�b�N
				conn.rollback();
			}

			// ���[�o�͏����Ŏ��s�����ꍇ
			if (bSuccess != true) {
				// �������O�̏�Ԃɖ߂�����
				struct.copy(copy_struct);
			}
		}
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlPrint>
		logger.exiting("AH0030010Control"+":USER="+struct.getsUser_ID(),"controlPrint");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0030");
		logger.entering("AH0030010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AH0030010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0030");
		logger.entering("AH0030010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                      //------------------------------------------------------------------
		
        try {
	         lotCtrlFlg = LotCtrl.checkLotCtrl(conn);
	         // �R���{�f�[�^�̎擾
	         ComboBox controller = new ComboBox(conn, sysUSER_CD);
	         _comboAbcTyp = controller.getData("ABC_TYP");		// �I���敪
	      
	         // �N���A����
	         controlclear();
	      
	         // �I���A�N�Z�b�T�N���X����
	         _invAccessor = new InvAccessor(getsysPLANT_CD(), getsysUSER_CD(), this.sp.getProcId());     
        }catch(SQLException e){        	
        	setSqlExceptionMsg(e);   
        	
        }catch(ComboException e){
	        // �G���[�������L�q���Ă��������B
	        ExpjMessage emsg = new ExpjMessage("ZZ01106");
	        sysLog.severe(emsg, getsysUSER_CD());
	        ExpjException ee = new ExpjException(e, emsg);
	        throw ee;
      
        }
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AH0030010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0030");
		logger.entering("AH0030010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
		logger.exiting("AH0030010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("csv_export") ) {
				controlcsv_export();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("Print") ) {
				controlPrint();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
			if(lotCtrlFlg){
				struct.seth_SYS_LOT_CTRL_FLG("true");
			}else{
				struct.seth_SYS_LOT_CTRL_FLG("false");
			}
                  } catch(AlarmMessageException ame){
                 //ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
                 //throw ee;
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// �g���b�Z�[�W�o�͈˗��쐬
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AH0030010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0030010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AH0030010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0030010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AH0030010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0030010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AH0030010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AH0030010Entity entity;
	protected AH0030010Struct struct;
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

		entity = new AH0030010Entity();
		struct = new AH0030010Struct();

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
	 * AH0030010�N���X�̕W���R���X�g���N�^
	 */
	public AH0030010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
		try {
			ResourceBundle bundle = SystemConfig.getBundle();
			dbUID = SystemConfig.getProperty("CONNECT_DBUSER", bundle);
			dbPWD = SystemConfig.getProperty("CONNECT_DBPASS", bundle);
			dbDBQ = SystemConfig.getProperty("CONNECT_DBHOST", bundle);
			dbKIND = SystemConfig.getProperty("CONNECT_KIND", bundle);
		} catch(MissingResourceException e) {
			e.printStackTrace();
		}
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
				AH0030010Struct key = (AH0030010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("h_sheet") && key.geth_sheet() != null) {
					msgKey.setKeyValue("h_sheet", key.geth_sheet());
				}
				if(msgKeyType.containsKeyColumn("h_stock") && key.geth_stock() != null) {
					msgKey.setKeyValue("h_stock", key.geth_stock());
				}
				if(msgKeyType.containsKeyColumn("h_wh") && key.geth_wh() != null) {
					msgKey.setKeyValue("h_wh", key.geth_wh());
				}
				if(msgKeyType.containsKeyColumn("w_INV_status") && key.getw_INV_status() != null) {
					msgKey.setKeyValue("w_INV_status", key.getw_INV_status());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("r1_sheet1") && key.getr1_sheet1() != null) {
					msgKey.setKeyValue("r1_sheet1", key.getr1_sheet1());
				}
				if(msgKeyType.containsKeyColumn("r2_stock1") && key.getr2_stock1() != null) {
					msgKey.setKeyValue("r2_stock1", key.getr2_stock1());
				}
				if(msgKeyType.containsKeyColumn("r1_sheet2") && key.getr1_sheet2() != null) {
					msgKey.setKeyValue("r1_sheet2", key.getr1_sheet2());
				}
				if(msgKeyType.containsKeyColumn("r2_stock2") && key.getr2_stock2() != null) {
					msgKey.setKeyValue("r2_stock2", key.getr2_stock2());
				}
				if(msgKeyType.containsKeyColumn("r1_sheet3") && key.getr1_sheet3() != null) {
					msgKey.setKeyValue("r1_sheet3", key.getr1_sheet3());
				}
				if(msgKeyType.containsKeyColumn("r1_sheet4") && key.getr1_sheet4() != null) {
					msgKey.setKeyValue("r1_sheet4", key.getr1_sheet4());
				}
				if(msgKeyType.containsKeyColumn("r3_wh1") && key.getr3_wh1() != null) {
					msgKey.setKeyValue("r3_wh1", key.getr3_wh1());
				}
				if(msgKeyType.containsKeyColumn("r3_wh2") && key.getr3_wh2() != null) {
					msgKey.setKeyValue("r3_wh2", key.getr3_wh2());
				}
				if(msgKeyType.containsKeyColumn("h_saveINV_DATE") && key.geth_saveINV_DATE() != null) {
					msgKey.setKeyValue("h_saveINV_DATE", key.geth_saveINV_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_lot") && key.geth_lot() != null) {
					msgKey.setKeyValue("h_lot", key.geth_lot());
				}
				if(msgKeyType.containsKeyColumn("h_item") && key.geth_item() != null) {
					msgKey.setKeyValue("h_item", key.geth_item());
				}
				if(msgKeyType.containsKeyColumn("r5_item_cd1") && key.getr5_item_cd1() != null) {
					msgKey.setKeyValue("r5_item_cd1", key.getr5_item_cd1());
				}
				if(msgKeyType.containsKeyColumn("r5_item_cd2") && key.getr5_item_cd2() != null) {
					msgKey.setKeyValue("r5_item_cd2", key.getr5_item_cd2());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("r4_lot_no1") && key.getr4_lot_no1() != null) {
					msgKey.setKeyValue("r4_lot_no1", key.getr4_lot_no1());
				}
				if(msgKeyType.containsKeyColumn("r4_lot_no2") && key.getr4_lot_no2() != null) {
					msgKey.setKeyValue("r4_lot_no2", key.getr4_lot_no2());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO") && key.getLOT_NO() != null) {
					msgKey.setKeyValue("LOT_NO", key.getLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("h_SYS_LOT_CTRL_FLG") && key.geth_SYS_LOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("h_SYS_LOT_CTRL_FLG", key.geth_SYS_LOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
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
					AH0030010Struct key = new AH0030010Struct();
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_sheet")) {
						key.seth_sheet(msgKey.getKeyValue("h_sheet"));
					}
					if(msgKeyType.containsKeyColumn("h_stock")) {
						key.seth_stock(msgKey.getKeyValue("h_stock"));
					}
					if(msgKeyType.containsKeyColumn("h_wh")) {
						key.seth_wh(msgKey.getKeyValue("h_wh"));
					}
					if(msgKeyType.containsKeyColumn("w_INV_status")) {
						key.setw_INV_status(msgKey.getKeyValue("w_INV_status"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("r1_sheet1")) {
						key.setr1_sheet1(msgKey.getKeyValue("r1_sheet1"));
					}
					if(msgKeyType.containsKeyColumn("r2_stock1")) {
						key.setr2_stock1(msgKey.getKeyValue("r2_stock1"));
					}
					if(msgKeyType.containsKeyColumn("r1_sheet2")) {
						key.setr1_sheet2(msgKey.getKeyValue("r1_sheet2"));
					}
					if(msgKeyType.containsKeyColumn("r2_stock2")) {
						key.setr2_stock2(msgKey.getKeyValue("r2_stock2"));
					}
					if(msgKeyType.containsKeyColumn("r1_sheet3")) {
						key.setr1_sheet3(msgKey.getKeyValue("r1_sheet3"));
					}
					if(msgKeyType.containsKeyColumn("r1_sheet4")) {
						key.setr1_sheet4(msgKey.getKeyValue("r1_sheet4"));
					}
					if(msgKeyType.containsKeyColumn("r3_wh1")) {
						key.setr3_wh1(msgKey.getKeyValue("r3_wh1"));
					}
					if(msgKeyType.containsKeyColumn("r3_wh2")) {
						key.setr3_wh2(msgKey.getKeyValue("r3_wh2"));
					}
					if(msgKeyType.containsKeyColumn("h_saveINV_DATE")) {
						key.seth_saveINV_DATE(msgKey.getKeyValue("h_saveINV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_lot")) {
						key.seth_lot(msgKey.getKeyValue("h_lot"));
					}
					if(msgKeyType.containsKeyColumn("h_item")) {
						key.seth_item(msgKey.getKeyValue("h_item"));
					}
					if(msgKeyType.containsKeyColumn("r5_item_cd1")) {
						key.setr5_item_cd1(msgKey.getKeyValue("r5_item_cd1"));
					}
					if(msgKeyType.containsKeyColumn("r5_item_cd2")) {
						key.setr5_item_cd2(msgKey.getKeyValue("r5_item_cd2"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("r4_lot_no1")) {
						key.setr4_lot_no1(msgKey.getKeyValue("r4_lot_no1"));
					}
					if(msgKeyType.containsKeyColumn("r4_lot_no2")) {
						key.setr4_lot_no2(msgKey.getKeyValue("r4_lot_no2"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO")) {
						key.setLOT_NO(msgKey.getKeyValue("LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_SYS_LOT_CTRL_FLG")) {
						key.seth_SYS_LOT_CTRL_FLG(msgKey.getKeyValue("h_SYS_LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
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
