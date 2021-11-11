/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0020/src/com/nec/jp/orteus/metamorBase/AA0020/AA0020030Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0020;

import com.nec.jp.orteus.metamorBase.AA0020.*;
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
import com.nec.jp.orteus.metamorBase.common01.Accessor.PrivateConfig;
import com.nec.jp.orteus.metamorBase.common01.util.IntegerConverter;
import com.nec.jp.orteus.metamorBase.common01.util.DateConverter;
//------------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AA0020030Control
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
       
        public AA0020030Struct getStruct() { return this.struct; }	// Struct�̒l�i���f�B�G�[�^�j��Ԃ��܂��B
       
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
         * @param �L�[����
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
         sysLog.warning(emsg, sysUSER_CD);
        }
       
        /**
         * �G���[�������p�����[�^�ݒ�
         * @param	key		�p�����[�^
         */
        private void setErrorParameter(String key)
        {
         ExpjMessage emsg = new ExpjMessage("ZZ01006", key);
         msgStruct.addError(emsg);
         sysLog.warning(emsg, sysUSER_CD);
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
       
        //---------- �R���{�{�b�N�X�f�[�^�擾�֘A�̏��� -------------------------------
        /** �W�J�敪 */
        ComboStruct _comboDevelopTyp = new ComboStruct();
       
        /** �x���敪 */
        ComboStruct _comboConsTyp = new ComboStruct();
       
        /** �����ςݏグ�L�� */
        ComboStruct _comboCostUpTyp = new ComboStruct();
       
        /** MRP�W�J�L�� */
        ComboStruct _comboMrpExpTyp = new ComboStruct();
       
        /** ���i�\��L/T�̎g�p�L�� */
        ComboStruct _comboPsLtFlg = new ComboStruct();
       
        /** �i�ڎ�z�敪 */
        ComboStruct _comboMrpOdrTyp = new ComboStruct();
        /** �i�ړ��O��敪 */
        ComboStruct _comboOutsideTyp = new ComboStruct();
       
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
       
        //---------- ���i�\���擾�֘A�̏��� -------------------------------------------
        /** �ő僌�x���擾�A�N�Z�X�L�[ */
        private final String _MAX_DISPLAY_PS_LEVEL = "MAX_DISPLAY_PS_LEVEL";
         
        /** �������x���擾�A�N�Z�X�L�[ */
        private final String _INIT_DISPLAY_PS_LEVEL = "INIT_DISPLAY_PS_LEVEL";
       
        /** �ő�W�J���x�� */
        String _level = null;
       
        /** �����W�J���x�� */
        String _initlevel = null;
       
        /** ���i�\�����X�g */
        private ArrayList _deployList = new ArrayList(0);
       
        /**
         * ���i�\�����X�g�擾 
         * @return	���i�\�����X�g
        */
        public ArrayList getDeployList(){ return _deployList; }
       
        //---------- ���[�o�͊֘A�̏��� ---------------------------------------------------
       
        /** �t�H�[������ID */
        private final String FORMID		= "1";
       
        /** ���x���ԍ��̍ő�\�������i���[�o�͗p�j */
        private final int LEVEL_MAXFIGURE4PRINT	= 16;
       
        /**
         * ���x���ԍ���������H����
         *
         * @param	objLevel		�Ώۃ��x���ԍ�
         * @return	true:���� / false:���s
         */
        private String convLevel(Integer objLevel)
        {
         String strNewNo = "";
         if(objLevel != null)
         {
          int intNo = objLevel.intValue();
       
          // intNo��16�����i1�`15�j ���p�X�y�[�X�~(16-���l����) + ���l�̕�����ɉ��H
          // intNo��16�ȏ� ���p�X�y�[�X�~(intNo-1) + ���l�̕�����ɉ��H
          int intHelfSpaceCount;
          if(intNo < LEVEL_MAXFIGURE4PRINT)
          {
           intHelfSpaceCount = (intNo - 1);
          }
          else
          {
           intHelfSpaceCount = (LEVEL_MAXFIGURE4PRINT - (objLevel.toString()).length());
          }
       
          for(int i = 0; i < intHelfSpaceCount; i++)
          {
           strNewNo += " ";
          }
          strNewNo += "" + intNo;
         }
         return strNewNo;
        }
       
        /**
         * pdf�o�͏���
         *
         * @param	svf				���[���C�u�����ݒ���
         * @param	structTarget	�Ώۃf�[�^���
         * @param	listTarget		�Ώۃf�[�^���X�g
         * @return	true:���� / false:���s
         */
        private boolean pdfExport(
         SvfWrapper svf,
         AA0020030Struct structTarget, 
         List listTarget)
        {
         boolean bSuccess = true;	// ���������t���O
       
         int ret;					// ���C�u�����������ʗp
//       �w�b�_���e�ݒ�i���ʁj
         DateConverter dc = new DateConverter();
         ret = svf.VrCondition("[X|in_DEVELOP_TYP]=" + (structTarget.gets_DEVELOP_TYP() != null ? getTypName(_comboDevelopTyp, (structTarget.gets_DEVELOP_TYP()).toString()) : "#"),4);
         ret = svf.VrCondition("[X|in_DEVELOP_TYP_flg]=" + (structTarget.gets_DEVELOP_TYP() != null ? "1" : "0"),4);
         ret = svf.VrCondition("[X|in_ITEM_CD]=" + (structTarget.getw_TARGET_ITEM_CD() != null ? structTarget.getw_TARGET_ITEM_CD() : "#"),4);
         ret = svf.VrCondition("[X|in_ITEM_CD_flg]=" + (structTarget.getw_TARGET_ITEM_CD() != null ? "1" : "0"),4);
         String strTargetDate = dc.date2str(dc.str2date(structTarget.getw_TARGET_DATE()));// ���͂����Ώۓ��t���Ayyyy/mm/dd�̌`���֕ϊ�
         ret = svf.VrCondition("[X|in_TARGET_DATE]=" + (strTargetDate != null ? strTargetDate : "#"),4);
         ret = svf.VrCondition("[X|in_TARGET_DATE_flg]=" + (strTargetDate != null ? "1" : "0"),4);
         
         ret = svf.VrCondition("[X|in_LEVEL]=" + (structTarget.getw_LEVEL() != null ? structTarget.getw_LEVEL() : "#"),4);
         ret = svf.VrCondition("[X|in_LEVEL_flg]=" + (structTarget.getw_LEVEL() != null ? "1" : "0"),4);
       
         AA0020030Struct structTemp = (AA0020030Struct)listTarget.get(0);
         ret = svf.VrCondition("[X|in_ITEM_NAME]=" + (structTemp.getPARENT_ITEM_NAME() != null ? structTemp.getPARENT_ITEM_NAME() : "#"),4);
         ret = svf.VrCondition("[X|in_ITEM_NAME_flg]=" + (structTemp.getPARENT_ITEM_NAME() != null ? "1" : "0"),4);
         //��������
         ret = svf.VrCondition("[X|PRINT_USER]=" + struct.getsysUser(),4);
         ret = svf.VrCondition("[X|SYS_DATETIME]=" + struct.getsysDateTime(),4);
         return bSuccess;
        }
       
        //---------- ���W�J --------------------------------------------------------
       
        /** ���W�J
         * @param item �e�i��
         * @param deployLevel �W�J���x��
         * @param tagetDate �Ώۓ��t
         * @param no �K�w���x��
        */
        public void getDeploy(
             String item, Integer deployLevel, Date targetDate, Integer no)
         throws SQLException, FoundationException
        {
         // �q�i�ڂ̍\�����擾
         DateConverter dc = new DateConverter();
         AA0020030Struct workStruct = new AA0020030Struct();
         workStruct.setPARENT_ITEM_CD(item);
         if(targetDate != null)
         {
          workStruct.setEFF_PHASE_IN_DATE(dc.date2str(targetDate));
          workStruct.setEFF_PHASE_OUT_DATE(dc.date2str(targetDate));
         }
         else
         {
          workStruct.setEFF_PHASE_IN_DATE(null);
          workStruct.setEFF_PHASE_OUT_DATE(null);
         }
         List deployList = entity.mS_BOM.read(conn, workStruct);
       
         // �W�J���x���`�F�b�N
         if(deployLevel.intValue() <= 1){
          for(int i = 0; i < deployList.size(); i++){
           AA0020030Struct noStruct = (AA0020030Struct)deployList.get(i);
           noStruct.setNO(no);
           noStruct.setsysUser(struct.getsysUser());
           noStruct.setsysDateTime(struct.getsysDateTime());
           noStruct.setPRINT_SQL_NO(struct.getPRINT_SQL_NO());
           struct.setPRINT_SQL_NO(new Integer(struct.getPRINT_SQL_NO().intValue()+1));
           noStruct.setstrNO(noStruct.getNO() != null ? convLevel(noStruct.getNO()) : "");
           noStruct.setPARENT_MRP_ODR_TYP(noStruct.getPARENT_MRP_ODR_TYP() != null ? getTypName(_comboMrpOdrTyp, (noStruct.getPARENT_MRP_ODR_TYP()).toString()) : "");
           noStruct.setPARENT_OUTSIDE_TYP(noStruct.getPARENT_OUTSIDE_TYP() != null ? getTypName(_comboOutsideTyp, (noStruct.getPARENT_OUTSIDE_TYP()).toString()) : "");
           noStruct.setMRP_ODR_TYP(noStruct.getMRP_ODR_TYP() != null ? getTypName(_comboMrpOdrTyp, (noStruct.getMRP_ODR_TYP()).toString()) : "");
           noStruct.setOUTSIDE_TYP(noStruct.getOUTSIDE_TYP() != null ? getTypName(_comboOutsideTyp, (noStruct.getOUTSIDE_TYP()).toString()) : "");
           noStruct.setstr_PS_LT_FLG(noStruct.getPS_LT_FLG() != null ? getTypName(_comboPsLtFlg, (noStruct.getPS_LT_FLG()).toString()) : "");
           noStruct.setstr_CONS_TYP(noStruct.gets_CONS_TYP() != null ? getTypName(_comboConsTyp, (noStruct.gets_CONS_TYP()).toString()) : "");
           noStruct.setstr_COST_UP_TYP(noStruct.gets_COST_UP_TYP() != null ? getTypName(_comboCostUpTyp, (noStruct.gets_COST_UP_TYP()).toString()) : "");
           noStruct.setstr_MRP_EXP_TYP(noStruct.gets_MRP_EXP_TYP() != null ? getTypName(_comboMrpExpTyp, (noStruct.gets_MRP_EXP_TYP()).toString()) : "");
           noStruct.setsUser_ID(struct.getsUser_ID());
           entity.mINSERT_M_PS_LIST_T.create(conn,noStruct);
           _deployList.add(deployList.get(i));
          }
         }
         else{
          // �\����񂩂�X�ɉ��̎q�i�ڎ擾
          for(int i = 0; i < deployList.size(); i++){
           AA0020030Struct noStruct = (AA0020030Struct)deployList.get(i);
           noStruct.setNO(no);
           noStruct.setsysUser(struct.getsysUser());
           noStruct.setsysDateTime(struct.getsysDateTime());
           noStruct.setPRINT_SQL_NO(struct.getPRINT_SQL_NO());           
           struct.setPRINT_SQL_NO(new Integer(struct.getPRINT_SQL_NO().intValue()+1));
           noStruct.setstrNO(noStruct.getNO() != null ? convLevel(noStruct.getNO()) : "");
           noStruct.setPARENT_MRP_ODR_TYP(noStruct.getPARENT_MRP_ODR_TYP() != null ? getTypName(_comboMrpOdrTyp, (noStruct.getPARENT_MRP_ODR_TYP()).toString()) : "");
           noStruct.setPARENT_OUTSIDE_TYP(noStruct.getPARENT_OUTSIDE_TYP() != null ? getTypName(_comboOutsideTyp, (noStruct.getPARENT_OUTSIDE_TYP()).toString()) : "");
           noStruct.setMRP_ODR_TYP(noStruct.getMRP_ODR_TYP() != null ? getTypName(_comboMrpOdrTyp, (noStruct.getMRP_ODR_TYP()).toString()) : "");
           noStruct.setOUTSIDE_TYP(noStruct.getOUTSIDE_TYP() != null ? getTypName(_comboOutsideTyp, (noStruct.getOUTSIDE_TYP()).toString()) : "");
           noStruct.setstr_PS_LT_FLG(noStruct.getPS_LT_FLG() != null ? getTypName(_comboPsLtFlg, (noStruct.getPS_LT_FLG()).toString()) : "");
           noStruct.setstr_CONS_TYP(noStruct.gets_CONS_TYP() != null ? getTypName(_comboConsTyp, (noStruct.gets_CONS_TYP()).toString()) : "");
           noStruct.setstr_COST_UP_TYP(noStruct.gets_COST_UP_TYP() != null ? getTypName(_comboCostUpTyp, (noStruct.gets_COST_UP_TYP()).toString()) : "");
           noStruct.setstr_MRP_EXP_TYP(noStruct.gets_MRP_EXP_TYP() != null ? getTypName(_comboMrpExpTyp, (noStruct.gets_MRP_EXP_TYP()).toString()) : "");
           noStruct.setsUser_ID(struct.getsUser_ID());
           entity.mINSERT_M_PS_LIST_T.create(conn,noStruct);
           _deployList.add(deployList.get(i));
           getDeploy(
               ((AA0020030Struct)deployList.get(i)).getCOMP_ITEM_CD(),
               new Integer(deployLevel.intValue() - 1),
               targetDate,
               new Integer(no.intValue() + 1));
          }
         }
        }
       
        //---------- �t�W�J --------------------------------------------------------
       
        /** �t�W�J
         * @param item �q�i��
         * @param deployLevel �W�J���x��
         * @param tagetDate �Ώۓ��t
         * @param no �K�w���x��
        */
        public void getReverseDeploy(
            String item, Integer deployLevel, Date targetDate, Integer no)
         throws SQLException, FoundationException
        {
         // �q�i�ڂ̍\�����擾
         DateConverter dc = new DateConverter();
         AA0020030Struct workStruct = new AA0020030Struct();
         workStruct.setCOMP_ITEM_CD(item);
         if(targetDate != null)
         {
          workStruct.setEFF_PHASE_IN_DATE(dc.date2str(targetDate));
          workStruct.setEFF_PHASE_OUT_DATE(dc.date2str(targetDate));
         }
         else
         {
          workStruct.setEFF_PHASE_IN_DATE(null);
          workStruct.setEFF_PHASE_OUT_DATE(null);
         }
         List deployList = entity.mR_BOM.read(conn, workStruct);
       
         // �W�J���x���`�F�b�N
         if(deployLevel.intValue() <= 1){
          // �ő�W�J���x��
          for(int i = 0; i < deployList.size(); i++){
           AA0020030Struct noStruct = (AA0020030Struct)deployList.get(i);
           noStruct.setNO(no);
           noStruct.setsysUser(struct.getsysUser());
           noStruct.setsysDateTime(struct.getsysDateTime());
           noStruct.setPRINT_SQL_NO(struct.getPRINT_SQL_NO());
           struct.setPRINT_SQL_NO(new Integer(struct.getPRINT_SQL_NO().intValue()+1));
           noStruct.setstrNO(noStruct.getNO() != null ? convLevel(noStruct.getNO()) : "");
           noStruct.setPARENT_MRP_ODR_TYP(noStruct.getPARENT_MRP_ODR_TYP() != null ? getTypName(_comboMrpOdrTyp, (noStruct.getPARENT_MRP_ODR_TYP()).toString()) : "");
           noStruct.setPARENT_OUTSIDE_TYP(noStruct.getPARENT_OUTSIDE_TYP() != null ? getTypName(_comboOutsideTyp, (noStruct.getPARENT_OUTSIDE_TYP()).toString()) : "");
           noStruct.setMRP_ODR_TYP(noStruct.getMRP_ODR_TYP() != null ? getTypName(_comboMrpOdrTyp, (noStruct.getMRP_ODR_TYP()).toString()) : "");
           noStruct.setOUTSIDE_TYP(noStruct.getOUTSIDE_TYP() != null ? getTypName(_comboOutsideTyp, (noStruct.getOUTSIDE_TYP()).toString()) : "");
           noStruct.setstr_PS_LT_FLG(noStruct.getPS_LT_FLG() != null ? getTypName(_comboPsLtFlg, (noStruct.getPS_LT_FLG()).toString()) : "");
           noStruct.setstr_CONS_TYP(noStruct.gets_CONS_TYP() != null ? getTypName(_comboConsTyp, (noStruct.gets_CONS_TYP()).toString()) : "");
           noStruct.setstr_COST_UP_TYP(noStruct.gets_COST_UP_TYP() != null ? getTypName(_comboCostUpTyp, (noStruct.gets_COST_UP_TYP()).toString()) : "");
           noStruct.setstr_MRP_EXP_TYP(noStruct.gets_MRP_EXP_TYP() != null ? getTypName(_comboMrpExpTyp, (noStruct.gets_MRP_EXP_TYP()).toString()) : "");
           noStruct.setsUser_ID(struct.getsUser_ID());
           entity.mINSERT_M_PS_LIST_T.create(conn,noStruct);
           _deployList.add(deployList.get(i));
          }
         }
         else{
          // �\����񂩂�X�ɏ�̐e�i�ڎ擾
          for(int i = 0; i < deployList.size(); i++){
           AA0020030Struct noStruct = (AA0020030Struct)deployList.get(i);
           noStruct.setNO(no);
           noStruct.setsysUser(struct.getsysUser());
           noStruct.setsysDateTime(struct.getsysDateTime());
           noStruct.setPRINT_SQL_NO(struct.getPRINT_SQL_NO());
           struct.setPRINT_SQL_NO(new Integer(struct.getPRINT_SQL_NO().intValue()+1));
           noStruct.setstrNO(noStruct.getNO() != null ? convLevel(noStruct.getNO()) : "");
           noStruct.setPARENT_MRP_ODR_TYP(noStruct.getPARENT_MRP_ODR_TYP() != null ? getTypName(_comboMrpOdrTyp, (noStruct.getPARENT_MRP_ODR_TYP()).toString()) : "");
           noStruct.setPARENT_OUTSIDE_TYP(noStruct.getPARENT_OUTSIDE_TYP() != null ? getTypName(_comboOutsideTyp, (noStruct.getPARENT_OUTSIDE_TYP()).toString()) : "");
           noStruct.setMRP_ODR_TYP(noStruct.getMRP_ODR_TYP() != null ? getTypName(_comboMrpOdrTyp, (noStruct.getMRP_ODR_TYP()).toString()) : "");
           noStruct.setOUTSIDE_TYP(noStruct.getOUTSIDE_TYP() != null ? getTypName(_comboOutsideTyp, (noStruct.getOUTSIDE_TYP()).toString()) : "");
           noStruct.setstr_PS_LT_FLG(noStruct.getPS_LT_FLG() != null ? getTypName(_comboPsLtFlg, (noStruct.getPS_LT_FLG()).toString()) : "");
           noStruct.setstr_CONS_TYP(noStruct.gets_CONS_TYP() != null ? getTypName(_comboConsTyp, (noStruct.gets_CONS_TYP()).toString()) : "");
           noStruct.setstr_COST_UP_TYP(noStruct.gets_COST_UP_TYP() != null ? getTypName(_comboCostUpTyp, (noStruct.gets_COST_UP_TYP()).toString()) : "");
           noStruct.setstr_MRP_EXP_TYP(noStruct.gets_MRP_EXP_TYP() != null ? getTypName(_comboMrpExpTyp, (noStruct.gets_MRP_EXP_TYP()).toString()) : "");
           noStruct.setsUser_ID(struct.getsUser_ID());
           entity.mINSERT_M_PS_LIST_T.create(conn,noStruct);
           _deployList.add(deployList.get(i));
           getReverseDeploy(
               ((AA0020030Struct)deployList.get(i)).getPARENT_ITEM_CD(),
               new Integer(deployLevel.intValue() - 1),
               targetDate,
               new Integer(no.intValue() + 1));
          }
         }
        }
       
        //------------------------------------------------------------------------------
        /**
         * �o�͈ꗗ���擾
         *
         * @return	�o�͈ꗗ���擾 / �G���[:null
         * @throws	BusinessProcessException, FoundationException
         */
        private List getOutList() throws BusinessProcessException, FoundationException
        {
         List listTarget = null;
         boolean bSuccess = false;
       
         try
         {
           // �Ώەi�ڏ��i�[
          List workList = null;
       
          // �\����񃊃X�g�N���A
          _deployList.clear();
       
          // �W�J���x���̃`�F�b�N
          Integer level = Integer.valueOf(_level);
       
          // ���͂����W�J���x����Integer�^�ɕϊ����Ď擾����
          IntegerConverter conv = new IntegerConverter();
          Integer inLevel = conv.Convert(struct.getw_LEVEL());
          if(level.intValue() < inLevel.intValue()){
           ExpjMessage emsg = new ExpjMessage( "AA00146", ""+_level );
           msgStruct.addError( emsg );
           sysLog.warning(emsg, getsysUSER_CD());
          }
       
          // �Ώەi�ڏ��擾
          workList = entity.mselectM_ITEM.read(conn, struct);
          if(workList.size() <= 0){	// �Ώەi�ڂ̎擾���s
           setErrorMessage("ZZ06001");
           setErrorParameter("M_ITEM.ITEM_CD:" + struct.getw_TARGET_ITEM_CD());
          }
       
          // �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
          if(msgStruct.sizeError() <= 0)
          {
           AA0020030Struct targetStruct = new AA0020030Struct();
           targetStruct.clear();
           AA0020030Struct workStruct = (AA0020030Struct)workList.get(0);
           targetStruct.setPARENT_ITEM_CD(workStruct.getPARENT_ITEM_CD());
           targetStruct.setPARENT_ITEM_NAME(workStruct.getPARENT_ITEM_NAME());
           targetStruct.setSTOCK_UNIT(workStruct.getSTOCK_UNIT());
           targetStruct.setNO(new Integer(1));
           _deployList.add(targetStruct);
       
           // �W�J���x��'0'�łȂ��ꍇ�A�W�J�������{
           if(inLevel.intValue() != 0){
       
            // ���W�J?�t�W�J?
            DateConverter dc = new DateConverter();
            if(struct.gets_DEVELOP_TYP().intValue() == 1){
             // ���W�J
             if(struct.getw_TARGET_DATE() == null ||
               "".equals(struct.getw_TARGET_DATE()) == true){
              // �Ώۓ��t��
              getDeploy(struct.getw_TARGET_ITEM_CD(), 
                   inLevel, null, new Integer(2));
             }
             else{
              // �Ώۓ��t�L
              Date targetDate = dc.str2date(struct.getw_TARGET_DATE());
              getDeploy(struct.getw_TARGET_ITEM_CD(), 
                   inLevel, targetDate, new Integer(2));
             }
            }
            else{
             // �t�W�J
             if(struct.getw_TARGET_DATE() == null ||
               "".equals(struct.getw_TARGET_DATE()) == true){
              // �Ώۓ��t��
              getReverseDeploy(struct.getw_TARGET_ITEM_CD(), 
                    inLevel, null, new Integer(2));
             }
             else{
              // �Ώۓ��t�L
              Date targetDate = dc.str2date(struct.getw_TARGET_DATE());
              getReverseDeploy(struct.getw_TARGET_ITEM_CD(), 
                    inLevel, targetDate, new Integer(2));
             }
            }
           }
       
           // �擾�f�[�^������ꍇ�̂ݏo�͗p���X�g�֎擾���X�g��ݒ肷��
           if(_deployList.size() <= 1)
           {
            // �Ώۃf�[�^�����݂��Ȃ�
            if(struct.gets_DEVELOP_TYP().intValue() == 1)
            {
             // ���W�J
             setErrorMessage("AA00144");
             setErrorParameter("M_PS.PARENT_ITEM_CD:" + struct.getw_TARGET_ITEM_CD());
             setErrorParameter("M_PS.EFF_PHASE_IN_DATE:" + struct.getw_TARGET_DATE());
             setErrorParameter("M_PS.EFF_PHASE_OUT_DATE:" + struct.getw_TARGET_DATE());
            }
            else
            {
             // �t�W�J
             setErrorMessage("AA00144");
             setErrorParameter("M_PS.COMP_ITEM_CD:" + struct.getw_TARGET_ITEM_CD());
             setErrorParameter("M_PS.EFF_PHASE_IN_DATE:" + struct.getw_TARGET_DATE());
             setErrorParameter("M_PS.EFF_PHASE_OUT_DATE:" + struct.getw_TARGET_DATE());
            }
           }
           else
           {
            // ��������
            bSuccess = true;
           }
          }
         } catch(SQLException e) {
          setSqlExceptionMsg(e);
         }finally{
          if(bSuccess == true)
          {
           listTarget = _deployList;
           conn.commit();
          }
          conn.rollback();
         }
         return listTarget;
        }
        
    	/**
    	 * �V�X�e���̓��t�擾
    	 */
    	public String getDateTime(){
    		Date datetime = new Date();
    		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmssSSS");
    		return sdf.format(datetime);
    	}       
        //------------------------------------------------------------------------------
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0020");
		logger.entering("AA0020030Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
                //----------------------------------------------------------------------
                // ������
                struct.initializeParent();
              
                // ���x���ݒ�
                struct.setw_LEVEL(_initlevel);
                //----------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AA0020030Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * ���[�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlPrint() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0020");
		logger.entering("AA0020030Control"+":USER="+struct.getsUser_ID(),"controlPrint");
			AA0020030Struct strPdf = null;

		int ret = 0;
		String printType      = getPdfOutputType();
		String printPattern   = getPdfOutputListPattern();
		String printer        = getPdfOutputPrinter();
		SvfWrapper svf        = new SvfWrapper(printType, getsysUSER_CD(), printer);

			//{{user_implement_dev:<controlPrint>
                //---------------------------------------------------------------------
                ///////////////////////////////////////////////////////////////////////////////
                //sysdatetime�擾
		        struct.setsysDateTime(this.getDateTime());
		        struct.setsysUser(this.sysUSER_CD);
		        struct.setPRINT_SQL_NO(new Integer(1));
                // �o�̓f�[�^�擾
                List listTarget = getOutList();
              
                // �o�͑Ώۃf�[�^���Ȃ��ꍇ�͉������Ȃ�
                if(listTarget == null || listTarget.size() <= 0)
                {
                 return;
                }
                ///////////////////////////////////////////////////////////////////////////////
                try {
                 ///////////////////////////////////////////////////////////////////////////////
                 String printId1 = sp.getProcId() + FORMID;	// ���[ID���w�肵�Ă�������
                 ///////////////////////////////////////////////////////////////////////////////
                 ret = svf.VrInit(printId1);	// PDF�쐬�J�n
                 ret = svf.VrSetDocName2("��Ǝw���[");	// �X�v�[���\���̕������̎w��
                 pdfFilePath = svf.getPdfFilePath();	// pdf�t���p�X�t�@�C����
                 pdfFileName = svf.getPdfFileName();	// pdf�t�@�C�����iWeb�p�j
                 //Add start jijinxu
                 queryFileName = svf.getQueryFileName();	// query�t�@�C����
                 //Add end jijinxu
                 String excuteOutput = svf.getExcuteOutput();	// �T�[�o�o�͏���
                 frmFileName = new String(printId1 + ".frm");	// frm�t�@�C����

              
                 
              
                 ///////////////////////////////////////////////////////////////////////////////
                 setSyslogConfig("printType [" + printType + "]");
                 setSyslogConfig("printPattern [" + printPattern + "]");
                 setSyslogConfig("pdfFilePath [" + pdfFilePath + "]");
                 setSyslogConfig("pdfFileName [" + pdfFileName + "]");
                 setSyslogConfig("frmFileName [" + frmFileName + "]");
                 setSyslogConfig("excuteOutput [" + excuteOutput + "]");
                 ///////////////////////////////////////////////////////////////////////////////
                 if ( "1".equals(printPattern) ) {	// �Č������Ĉ���̏ꍇ
                  // �Č����������L�q���Ă��������B
                  //controlSelect();
                 }
              
                 ///////////////////////////////////////////////////////////////////////////////
                 if(ret != 0)
                 {
                  setSyslogConfig("Form-file not found.("+ ret +") [" + frmFileName + "]");
                 }
				/* �N�G���[�t�@�C���̎w�� */
				 if(dbKIND != null && !dbKIND.equals("")) {
				    ret = svf.VrSetQuery("KIND=" + dbKIND + ";UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);
				 } else {
				    ret = svf.VrSetQuery("UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);
				 }
                 // PDF�o�̓f�[�^�ݒ�
                 pdfExport(svf, struct, listTarget);
                 ///////////////////////////////////////////////////////////////////////////////
     			/* �N�G���[���s */
     			ret = svf.VrReport();
     			if(ret == -554) {
     				ExpjMessage emsg = new ExpjMessage("ZZ06001");
     				msgStruct.addError(emsg);
     				sysLog.warning(emsg, sysUSER_CD);
     				return;
     			}		
                if(ret == 0) {
                		try{
                			entity.mDELETE_M_PS_LIST_T.delete(conn,struct);
                		}catch(Exception e){
                			e.printStackTrace();
                			conn.rollback();
                		}				
     				conn.commit();
     			}
                
                //PDF�쐬�I��
                 ret = svf.VrQuit();								// PDF�쐬�I��
                 ///////////////////////////////////////////////////////////////////////////////
                 if(ret < 0)
                 {
                  setSyslogConfig("Error : VrQuit (" + ret + ")");
                 }
                 ///////////////////////////////////////////////////////////////////////////////
              
                 if ( "0".equals(printType) ) {	// �N���C�A���g����̏ꍇ
                  struct.setDOWNLOAD_FILE(getPdfFileName());
                 }
                 else if ( "1".equals(printType) ) {
                  try {
  					String acrobatPath = svf.getAcrobatPath();
  					String acrobatOption1 = svf.getAcrobatOption1();
  					String acrobatOption2 = svf.getAcrobatOption2();
  					String pdfPrinter = svf.getPrinter();
  					Runtime.getRuntime().exec(new String[]{acrobatPath, acrobatOption1, acrobatOption2, pdfFilePath, pdfPrinter});
                   //Runtime.getRuntime().exec(excuteOutput);
                  }catch(IOException e){
                   // �T�[�o������s���̃G���[�������L�q���Ă��������B
                  }
                 }
              
              //			objMessage.m_writer.write(Level.INFO, "file=" + svf.VrGetSpoolFileName() + "�ɏo��");
                 ///////////////////////////////////////////////////////////////////////////////
                 setSyslogConfig("Completion of PDF-data output.");
                 ///////////////////////////////////////////////////////////////////////////////
                } finally {
                 //
                }
                //}}user_implement_dev:<controlPrint>
		logger.exiting("AA0020030Control"+":USER="+struct.getsUser_ID(),"controlPrint");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0020");
		logger.entering("AA0020030Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AA0020030Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0020");
		logger.entering("AA0020030Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                      //------------------------------------------------------------------
                try{
                 
                 PrivateConfig c = new PrivateConfig(conn);
                 // �����W�J���x���擾
                 Integer initlevel = c.getNumber(_INIT_DISPLAY_PS_LEVEL);
                 if(initlevel == null){
                  // �����W�J���x������`����Ă��܂���
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                  ExpjMessage emsg_log = new ExpjMessage( "ZZ01006", "SYS_PARAMETER.INIT_DISPLAY_PS_LEVEL:" + initlevel );
                  sysLog.severe(emsg, getsysUSER_CD());
                  sysLog.severe(emsg_log, getsysUSER_CD());
                  ExpjException ee = new ExpjException(emsg);
              
                  throw ee;
                 }
                 else if(initlevel.intValue() < 0){
                  // �����W�J���x���̒l������������܂���
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                  ExpjMessage emsg_log = new ExpjMessage( "ZZ01006", "SYS_PARAMETER.INIT_DISPLAY_PS_LEVEL:" + initlevel );
                  sysLog.severe(emsg, getsysUSER_CD());
                  sysLog.severe(emsg_log, getsysUSER_CD());
                  ExpjException ee = new ExpjException(emsg);
              
                  throw ee;
                 }
                 // �ő�W�J���x���擾
                 Integer level = c.getNumber(_MAX_DISPLAY_PS_LEVEL);
                 if(level == null){
                  // �ő�W�J���x������`����Ă��܂���
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                  ExpjMessage emsg_log = new ExpjMessage( "ZZ01006", "SYS_PARAMETER.MAX_DISPLAY_PS_LEVEL:" + level );
                  sysLog.severe(emsg, getsysUSER_CD());
                  sysLog.severe(emsg_log, getsysUSER_CD());
                  ExpjException ee = new ExpjException(emsg);
              
                  throw ee;
                 }
                 else if(level.intValue() < 0){
                  // �ő�W�J���x���̒l������������܂���
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                  ExpjMessage emsg_log = new ExpjMessage( "ZZ01006", "SYS_PARAMETER.MAX_DISPLAY_PS_LEVEL:" + level );
                  sysLog.severe(emsg, getsysUSER_CD());
                  sysLog.severe(emsg_log, getsysUSER_CD());
                  ExpjException ee = new ExpjException(emsg);
              
                  throw ee;
                 }
              
                 _level = level.toString();
                 _initlevel = initlevel.toString();
              
                 // �R���{�{�b�N�X�f�[�^�p��
                 ComboBox controller
                       = new ComboBox(conn, sysUSER_CD);
              
                 _comboDevelopTyp = controller.getData("DEVELOP_TYP");
                 _comboConsTyp = controller.getData("CONS_TYP");
                 _comboCostUpTyp = controller.getData("COST_UP_TYP");
                 _comboMrpExpTyp = controller.getData("MRP_EXP_TYP");
                 _comboPsLtFlg = controller.getData("PS_LT_FLG");
                 _comboMrpOdrTyp = controller.getData("MRP_ODR_TYP");
                 _comboOutsideTyp = controller.getData("OUTSIDE_TYP");
                 controller.setConnection(null);
              
                 // �N���A����
                 controlclear();
              
                }
                catch(SQLException e)
                {
                 setSqlExceptionMsg(e);
                }
                catch(ComboException e)
                {
                 // �G���[�������L�q���Ă��������B
                 ExpjMessage emsg = new ExpjMessage("ZZ01106");
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(e, emsg);
                 throw ee;
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AA0020030Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0020");
		logger.entering("AA0020030Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
		logger.exiting("AA0020030Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("Print") ) {
				controlPrint();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
                      //------------------------------------------------------------------
                struct.setList_s_DEVELOP_TYP_val(_comboDevelopTyp.getValList());
                struct.setList_s_DEVELOP_TYP_name(_comboDevelopTyp.getExplanList());
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
//			throw new FoundationException("AA0020030Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0020030-E999","CSV�̏o�͏���"));
			throw new FoundationException("AA0020030Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0020030-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AA0020030Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0020030-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AA0020030Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AA0020030Entity entity;
	protected AA0020030Struct struct;
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

		entity = new AA0020030Entity();
		struct = new AA0020030Struct();

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
	 * AA0020030�N���X�̕W���R���X�g���N�^
	 */
	public AA0020030Control() throws BusinessProcessException, FoundationException
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
				AA0020030Struct key = (AA0020030Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("w_TARGET_DATE") && key.getw_TARGET_DATE() != null) {
					msgKey.setKeyValue("w_TARGET_DATE", key.getw_TARGET_DATE());
				}
				if(msgKeyType.containsKeyColumn("s_DEVELOP_TYP") && key.gets_DEVELOP_TYP() != null) {
					msgKey.setKeyValue("s_DEVELOP_TYP", key.gets_DEVELOP_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("s_DEVELOP_TYP_name") && key.gets_DEVELOP_TYP_name() != null) {
					msgKey.setKeyValue("s_DEVELOP_TYP_name", key.gets_DEVELOP_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("s_DEVELOP_TYP_val") && key.gets_DEVELOP_TYP_val() != null) {
					msgKey.setKeyValue("s_DEVELOP_TYP_val", key.gets_DEVELOP_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("w_LEVEL") && key.getw_LEVEL() != null) {
					msgKey.setKeyValue("w_LEVEL", key.getw_LEVEL());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("in_DEVELOP_TYP") && key.getin_DEVELOP_TYP() != null) {
					msgKey.setKeyValue("in_DEVELOP_TYP", key.getin_DEVELOP_TYP());
				}
				if(msgKeyType.containsKeyColumn("in_ITEM_CD") && key.getin_ITEM_CD() != null) {
					msgKey.setKeyValue("in_ITEM_CD", key.getin_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("PRINT_DATE") && key.getPRINT_DATE() != null) {
					msgKey.setKeyValue("PRINT_DATE", key.getPRINT_DATE());
				}
				if(msgKeyType.containsKeyColumn("PRINT_TIME") && key.getPRINT_TIME() != null) {
					msgKey.setKeyValue("PRINT_TIME", key.getPRINT_TIME());
				}
				if(msgKeyType.containsKeyColumn("in_ITEM_NAME") && key.getin_ITEM_NAME() != null) {
					msgKey.setKeyValue("in_ITEM_NAME", key.getin_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("in_TARGET_DATE") && key.getin_TARGET_DATE() != null) {
					msgKey.setKeyValue("in_TARGET_DATE", key.getin_TARGET_DATE());
				}
				if(msgKeyType.containsKeyColumn("in_LEVEL") && key.getin_LEVEL() != null) {
					msgKey.setKeyValue("in_LEVEL", key.getin_LEVEL());
				}
				if(msgKeyType.containsKeyColumn("CURRENT_PAGE") && key.getCURRENT_PAGE() != null) {
					msgKey.setKeyValue("CURRENT_PAGE", key.getCURRENT_PAGE());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_PAGE") && key.getTOTAL_PAGE() != null) {
					msgKey.setKeyValue("TOTAL_PAGE", key.getTOTAL_PAGE());
				}
				if(msgKeyType.containsKeyColumn("LEVEL") && key.getLEVEL() != null) {
					msgKey.setKeyValue("LEVEL", key.getLEVEL());
				}
				if(msgKeyType.containsKeyColumn("COST_UP_TYP") && key.getCOST_UP_TYP() != null) {
					msgKey.setKeyValue("COST_UP_TYP", key.getCOST_UP_TYP());
				}
				if(msgKeyType.containsKeyColumn("MRP_EXP_TYP") && key.getMRP_EXP_TYP() != null) {
					msgKey.setKeyValue("MRP_EXP_TYP", key.getMRP_EXP_TYP());
				}
				if(msgKeyType.containsKeyColumn("CONS_TYP") && key.getCONS_TYP() != null) {
					msgKey.setKeyValue("CONS_TYP", key.getCONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("in_DEVELOP_TYP_flg") && key.getin_DEVELOP_TYP_flg() != null) {
					msgKey.setKeyValue("in_DEVELOP_TYP_flg", key.getin_DEVELOP_TYP_flg());
				}
				if(msgKeyType.containsKeyColumn("in_ITEM_CD_flg") && key.getin_ITEM_CD_flg() != null) {
					msgKey.setKeyValue("in_ITEM_CD_flg", key.getin_ITEM_CD_flg());
				}
				if(msgKeyType.containsKeyColumn("in_ITEM_NAME_flg") && key.getin_ITEM_NAME_flg() != null) {
					msgKey.setKeyValue("in_ITEM_NAME_flg", key.getin_ITEM_NAME_flg());
				}
				if(msgKeyType.containsKeyColumn("in_TARGET_DATE_flg") && key.getin_TARGET_DATE_flg() != null) {
					msgKey.setKeyValue("in_TARGET_DATE_flg", key.getin_TARGET_DATE_flg());
				}
				if(msgKeyType.containsKeyColumn("in_LEVEL_flg") && key.getin_LEVEL_flg() != null) {
					msgKey.setKeyValue("in_LEVEL_flg", key.getin_LEVEL_flg());
				}
				if(msgKeyType.containsKeyColumn("PARENT_MRP_ODR_TYP") && key.getPARENT_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("PARENT_MRP_ODR_TYP", key.getPARENT_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("PARENT_OUTSIDE_TYP") && key.getPARENT_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("PARENT_OUTSIDE_TYP", key.getPARENT_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("NO") && key.getNO() != null) {
					msgKey.setKeyValue("NO", key.getNO().toString());
				}
				if(msgKeyType.containsKeyColumn("sysUser") && key.getsysUser() != null) {
					msgKey.setKeyValue("sysUser", key.getsysUser());
				}
				if(msgKeyType.containsKeyColumn("sysDateTime") && key.getsysDateTime() != null) {
					msgKey.setKeyValue("sysDateTime", key.getsysDateTime());
				}
				if(msgKeyType.containsKeyColumn("PRINT_SQL_NO") && key.getPRINT_SQL_NO() != null) {
					msgKey.setKeyValue("PRINT_SQL_NO", key.getPRINT_SQL_NO().toString());
				}
				if(msgKeyType.containsKeyColumn("str_CONS_TYP") && key.getstr_CONS_TYP() != null) {
					msgKey.setKeyValue("str_CONS_TYP", key.getstr_CONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("str_PS_LT_FLG") && key.getstr_PS_LT_FLG() != null) {
					msgKey.setKeyValue("str_PS_LT_FLG", key.getstr_PS_LT_FLG());
				}
				if(msgKeyType.containsKeyColumn("str_COST_UP_TYP") && key.getstr_COST_UP_TYP() != null) {
					msgKey.setKeyValue("str_COST_UP_TYP", key.getstr_COST_UP_TYP());
				}
				if(msgKeyType.containsKeyColumn("str_MRP_EXP_TYP") && key.getstr_MRP_EXP_TYP() != null) {
					msgKey.setKeyValue("str_MRP_EXP_TYP", key.getstr_MRP_EXP_TYP());
				}
				if(msgKeyType.containsKeyColumn("strNO") && key.getstrNO() != null) {
					msgKey.setKeyValue("strNO", key.getstrNO());
				}
				if(msgKeyType.containsKeyColumn("PARENT_ITEM_CD") && key.getPARENT_ITEM_CD() != null) {
					msgKey.setKeyValue("PARENT_ITEM_CD", key.getPARENT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("PARENT_ITEM_NAME") && key.getPARENT_ITEM_NAME() != null) {
					msgKey.setKeyValue("PARENT_ITEM_NAME", key.getPARENT_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("w_TARGET_ITEM_CD") && key.getw_TARGET_ITEM_CD() != null) {
					msgKey.setKeyValue("w_TARGET_ITEM_CD", key.getw_TARGET_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("COMP_ITEM_CD") && key.getCOMP_ITEM_CD() != null) {
					msgKey.setKeyValue("COMP_ITEM_CD", key.getCOMP_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("PS_EDITION") && key.getPS_EDITION() != null) {
					msgKey.setKeyValue("PS_EDITION", key.getPS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("PS_UNIT_DENOMINATOR") && key.getPS_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("PS_UNIT_DENOMINATOR", key.getPS_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("PS_UNIT_NUMERATOR") && key.getPS_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("PS_UNIT_NUMERATOR", key.getPS_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE") && key.getEFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("EFF_PHASE_IN_DATE", key.getEFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("EFF_PHASE_OUT_DATE") && key.getEFF_PHASE_OUT_DATE() != null) {
					msgKey.setKeyValue("EFF_PHASE_OUT_DATE", key.getEFF_PHASE_OUT_DATE());
				}
				if(msgKeyType.containsKeyColumn("PS_SPOIL") && key.getPS_SPOIL() != null) {
					msgKey.setKeyValue("PS_SPOIL", key.getPS_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("s_CONS_TYP") && key.gets_CONS_TYP() != null) {
					msgKey.setKeyValue("s_CONS_TYP", key.gets_CONS_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("PS_LT_FLG") && key.getPS_LT_FLG() != null) {
					msgKey.setKeyValue("PS_LT_FLG", key.getPS_LT_FLG().toString());
				}
				if(msgKeyType.containsKeyColumn("PS_FIXED_LT") && key.getPS_FIXED_LT() != null) {
					msgKey.setKeyValue("PS_FIXED_LT", key.getPS_FIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("PS_PROP_LT") && key.getPS_PROP_LT() != null) {
					msgKey.setKeyValue("PS_PROP_LT", key.getPS_PROP_LT());
				}
				if(msgKeyType.containsKeyColumn("PS_PROP_LOT_SIZE") && key.getPS_PROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("PS_PROP_LOT_SIZE", key.getPS_PROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("PS_REF_NO") && key.getPS_REF_NO() != null) {
					msgKey.setKeyValue("PS_REF_NO", key.getPS_REF_NO());
				}
				if(msgKeyType.containsKeyColumn("s_COST_UP_TYP") && key.gets_COST_UP_TYP() != null) {
					msgKey.setKeyValue("s_COST_UP_TYP", key.gets_COST_UP_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("s_MRP_EXP_TYP") && key.gets_MRP_EXP_TYP() != null) {
					msgKey.setKeyValue("s_MRP_EXP_TYP", key.gets_MRP_EXP_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("COMP_ITEM_NAME") && key.getCOMP_ITEM_NAME() != null) {
					msgKey.setKeyValue("COMP_ITEM_NAME", key.getCOMP_ITEM_NAME());
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
					AA0020030Struct key = new AA0020030Struct();
					if(msgKeyType.containsKeyColumn("w_TARGET_DATE")) {
						key.setw_TARGET_DATE(msgKey.getKeyValue("w_TARGET_DATE"));
					}
					if(msgKeyType.containsKeyColumn("s_DEVELOP_TYP")) {
						key.sets_DEVELOP_TYP(new Integer(msgKey.getKeyValue("s_DEVELOP_TYP")));
					}
					if(msgKeyType.containsKeyColumn("s_DEVELOP_TYP_name")) {
						key.sets_DEVELOP_TYP_name(msgKey.getKeyValue("s_DEVELOP_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("s_DEVELOP_TYP_val")) {
						key.sets_DEVELOP_TYP_val(msgKey.getKeyValue("s_DEVELOP_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("w_LEVEL")) {
						key.setw_LEVEL(msgKey.getKeyValue("w_LEVEL"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("in_DEVELOP_TYP")) {
						key.setin_DEVELOP_TYP(msgKey.getKeyValue("in_DEVELOP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("in_ITEM_CD")) {
						key.setin_ITEM_CD(msgKey.getKeyValue("in_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("PRINT_DATE")) {
						key.setPRINT_DATE(msgKey.getKeyValue("PRINT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PRINT_TIME")) {
						key.setPRINT_TIME(msgKey.getKeyValue("PRINT_TIME"));
					}
					if(msgKeyType.containsKeyColumn("in_ITEM_NAME")) {
						key.setin_ITEM_NAME(msgKey.getKeyValue("in_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("in_TARGET_DATE")) {
						key.setin_TARGET_DATE(msgKey.getKeyValue("in_TARGET_DATE"));
					}
					if(msgKeyType.containsKeyColumn("in_LEVEL")) {
						key.setin_LEVEL(msgKey.getKeyValue("in_LEVEL"));
					}
					if(msgKeyType.containsKeyColumn("CURRENT_PAGE")) {
						key.setCURRENT_PAGE(msgKey.getKeyValue("CURRENT_PAGE"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_PAGE")) {
						key.setTOTAL_PAGE(msgKey.getKeyValue("TOTAL_PAGE"));
					}
					if(msgKeyType.containsKeyColumn("LEVEL")) {
						key.setLEVEL(msgKey.getKeyValue("LEVEL"));
					}
					if(msgKeyType.containsKeyColumn("COST_UP_TYP")) {
						key.setCOST_UP_TYP(msgKey.getKeyValue("COST_UP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MRP_EXP_TYP")) {
						key.setMRP_EXP_TYP(msgKey.getKeyValue("MRP_EXP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CONS_TYP")) {
						key.setCONS_TYP(msgKey.getKeyValue("CONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("in_DEVELOP_TYP_flg")) {
						key.setin_DEVELOP_TYP_flg(msgKey.getKeyValue("in_DEVELOP_TYP_flg"));
					}
					if(msgKeyType.containsKeyColumn("in_ITEM_CD_flg")) {
						key.setin_ITEM_CD_flg(msgKey.getKeyValue("in_ITEM_CD_flg"));
					}
					if(msgKeyType.containsKeyColumn("in_ITEM_NAME_flg")) {
						key.setin_ITEM_NAME_flg(msgKey.getKeyValue("in_ITEM_NAME_flg"));
					}
					if(msgKeyType.containsKeyColumn("in_TARGET_DATE_flg")) {
						key.setin_TARGET_DATE_flg(msgKey.getKeyValue("in_TARGET_DATE_flg"));
					}
					if(msgKeyType.containsKeyColumn("in_LEVEL_flg")) {
						key.setin_LEVEL_flg(msgKey.getKeyValue("in_LEVEL_flg"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_MRP_ODR_TYP")) {
						key.setPARENT_MRP_ODR_TYP(msgKey.getKeyValue("PARENT_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_OUTSIDE_TYP")) {
						key.setPARENT_OUTSIDE_TYP(msgKey.getKeyValue("PARENT_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(msgKey.getKeyValue("OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("NO")) {
						key.setNO(new Integer(msgKey.getKeyValue("NO")));
					}
					if(msgKeyType.containsKeyColumn("sysUser")) {
						key.setsysUser(msgKey.getKeyValue("sysUser"));
					}
					if(msgKeyType.containsKeyColumn("sysDateTime")) {
						key.setsysDateTime(msgKey.getKeyValue("sysDateTime"));
					}
					if(msgKeyType.containsKeyColumn("PRINT_SQL_NO")) {
						key.setPRINT_SQL_NO(new Integer(msgKey.getKeyValue("PRINT_SQL_NO")));
					}
					if(msgKeyType.containsKeyColumn("str_CONS_TYP")) {
						key.setstr_CONS_TYP(msgKey.getKeyValue("str_CONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("str_PS_LT_FLG")) {
						key.setstr_PS_LT_FLG(msgKey.getKeyValue("str_PS_LT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("str_COST_UP_TYP")) {
						key.setstr_COST_UP_TYP(msgKey.getKeyValue("str_COST_UP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("str_MRP_EXP_TYP")) {
						key.setstr_MRP_EXP_TYP(msgKey.getKeyValue("str_MRP_EXP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("strNO")) {
						key.setstrNO(msgKey.getKeyValue("strNO"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_ITEM_CD")) {
						key.setPARENT_ITEM_CD(msgKey.getKeyValue("PARENT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_ITEM_NAME")) {
						key.setPARENT_ITEM_NAME(msgKey.getKeyValue("PARENT_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("w_TARGET_ITEM_CD")) {
						key.setw_TARGET_ITEM_CD(msgKey.getKeyValue("w_TARGET_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("COMP_ITEM_CD")) {
						key.setCOMP_ITEM_CD(msgKey.getKeyValue("COMP_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("PS_EDITION")) {
						key.setPS_EDITION(msgKey.getKeyValue("PS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("PS_UNIT_DENOMINATOR")) {
						key.setPS_UNIT_DENOMINATOR(msgKey.getKeyValue("PS_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("PS_UNIT_NUMERATOR")) {
						key.setPS_UNIT_NUMERATOR(msgKey.getKeyValue("PS_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE")) {
						key.setEFF_PHASE_IN_DATE(msgKey.getKeyValue("EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("EFF_PHASE_OUT_DATE")) {
						key.setEFF_PHASE_OUT_DATE(msgKey.getKeyValue("EFF_PHASE_OUT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PS_SPOIL")) {
						key.setPS_SPOIL(msgKey.getKeyValue("PS_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("s_CONS_TYP")) {
						key.sets_CONS_TYP(new Integer(msgKey.getKeyValue("s_CONS_TYP")));
					}
					if(msgKeyType.containsKeyColumn("PS_LT_FLG")) {
						key.setPS_LT_FLG(new Integer(msgKey.getKeyValue("PS_LT_FLG")));
					}
					if(msgKeyType.containsKeyColumn("PS_FIXED_LT")) {
						key.setPS_FIXED_LT(msgKey.getKeyValue("PS_FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("PS_PROP_LT")) {
						key.setPS_PROP_LT(msgKey.getKeyValue("PS_PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("PS_PROP_LOT_SIZE")) {
						key.setPS_PROP_LOT_SIZE(msgKey.getKeyValue("PS_PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("PS_REF_NO")) {
						key.setPS_REF_NO(msgKey.getKeyValue("PS_REF_NO"));
					}
					if(msgKeyType.containsKeyColumn("s_COST_UP_TYP")) {
						key.sets_COST_UP_TYP(new Integer(msgKey.getKeyValue("s_COST_UP_TYP")));
					}
					if(msgKeyType.containsKeyColumn("s_MRP_EXP_TYP")) {
						key.sets_MRP_EXP_TYP(new Integer(msgKey.getKeyValue("s_MRP_EXP_TYP")));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("COMP_ITEM_NAME")) {
						key.setCOMP_ITEM_NAME(msgKey.getKeyValue("COMP_ITEM_NAME"));
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
