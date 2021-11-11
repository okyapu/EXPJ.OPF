/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AH0050/src/com/nec/jp/orteus/metamorBase/AH0050/AH0050010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AH0050;

import com.nec.jp.orteus.metamorBase.AH0050.*;
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
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.metamorBase.common01.util.DateConverter;
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.LotCtrl;
import com.nec.jp.orteus.expj.lot.BizCommon;
import java.math.BigDecimal;
//------------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AH0050010Control
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
       //	public Object getListvalue(int x) { return this.list.get(x); }	// ���X�g�̒l��Ԃ��܂��B
        public AH0050010Struct getListvalue(int x) { return (AH0050010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
        public AH0050010Struct getStruct() { return this.struct; }	// Struct��Ԃ��܂��B
        public AH0050010Struct createStruct() { return new AH0050010Struct(); }	// �V����Struct������ĕԂ��܂��B
        public void setStruct(Object structname) { this.struct.setStruct((AH0050010Struct)structname); }	// Struct���Z�b�g���܂��B
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
       
        //------------------------------------------------------------------
       
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
    	 * �Ɩ����W�b�N�̃��[�j���O���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
    	 * @param code ���b�Z�[�W�R�[�h
    	 */
    	private void setWarningMessage(String code, String msg1, String msg2) {
    		ExpjMessage emsg = new ExpjMessage(code, msg1, msg2);
    		msgStruct.addWarn(emsg);
    		sysLog.info(emsg, sysUSER_CD);
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
        
    	/**
    	 * �Ɩ����W�b�N�̃G���[���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
    	 * @param code ���b�Z�[�W�R�[�h
    	 */
    	private void setErrorMessage(String code) {
    		ExpjMessage emsg = new ExpjMessage(code);
    		msgStruct.addError(emsg);
    		sysLog.warning(emsg, sysUSER_CD);
    	}
       
        //------------------------------------------------------------------
       
        /**
         * �\���ő�s����������
         *
         * @param key �A�N�Z�X�L�[
         * @param size �Ώۍs��
         * @return �ُ�Ȃ� true �G���[ false
         */
        private boolean checkMaxDispLine(int key, long rowCount) throws FoundationException, SQLException
        {
         ScreenParam sp = new ScreenParam(this.getClass());
         int maxLine = sp.getMaxLine(conn,key);
         if(maxLine != 0 && rowCount == maxLine + 1)
         {
          ExpjMessage emsg = new ExpjMessage( "ZZ01115", ""+maxLine );
          msgStruct.addError( emsg );
          sysLog.warning(emsg, getsysUSER_CD());
          return false;
         }
         return true;
        }
       
        //------------------------------------------------------------------
        //------------------------------------------------------------------
       
        /** �I�����擾�p�N���X�I�u�W�F�N�g�p�� */
        InvAccessor _invAccessor = null;
       
        /** �e��ʃp�����[�^�i�ő�\���s���j�擾�A�N�Z�X�L�[ */
        private final static int _DISPLAY_CD_PARENT = 10;
       
        /** �e���struct���ꎞ�ޔ�p */
        private AH0050010Struct _save_struct = new AH0050010Struct();
        
    	/** ���b�g�Ǘ��t���O�p */
    	private String _LOT_CTRL_FLG = null;
    	
    	/** ���b�g�Ǘ������σ`�F�b�N */
    	String lotCtrl = null;
    	
        /** ���I���p */
        private String _ACTUAL_STOCK_QTY = null; 
        
        // ----- �V�X�^���ݒ�l�擾 ---------------	
    	private PrivateConfig privateConfig;
    	private int _MaxCsvTake = 10000;
        // ----- �V�X�^���ݒ�l�擾 ---------------		
    	
    	/** �I�����F */
    	String aprInvCtrl = "";	

    	/** �I�����F�敪 */
    	String aprFlg = "";	
       
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
         setJOB_ODR_CD_STOCK_flg(struct.geth_JOB_ODR_CD_STOCK_flg());
        }
       
        /** �q���struct���R�s�[�p */
        private AH0050010Struct _copy_sub_struct = new AH0050010Struct();
       
        /** ���ԍ݌Ɏw��t���O */
        String _strJOB_ODR_CD_STOCK_flg = null;
       
        /**
         * ���ԍ݌Ɏw��t���O�擾
         * @return ���ԍ݌Ɏw��t���O
         */
        private String getJOB_ODR_CD_STOCK_flg()
        {
         return _strJOB_ODR_CD_STOCK_flg;
        }
       
        /**
         * ���ԍ݌Ɏw��t���O�ݒ�
         * @param ���ԍ݌Ɏw��t���O
         */
        private void setJOB_ODR_CD_STOCK_flg(String flg)
        {
         _strJOB_ODR_CD_STOCK_flg = flg;
        }
       
        /**
         * �I�����Ԓ��f�[�^�Ǎ�����
         *
         * @return �ُ�Ȃ� �ŐV�̓Ǎ���� �G���[ null
         */
        private AH0050010Struct readT_INV_CTRL_INV_STS_TYP1() throws FoundationException, SQLException
        {
         // ���O�o�͏��i�[�p
         List listMessage = new ArrayList();
       
         // �����Ɋ֘A����p�����[�^��ݒ�
         AH0050010Struct targetStruct = new AH0050010Struct();
         targetStruct.setPLANT_CD(getsysPLANT_CD());
       
         // �Ǎ����s
         List read_list = new ArrayList();
         read_list = entity.mT_INV_CTRL_INV_STS_TYP1.read(conn, targetStruct);
       
         // ���R�[�h�����`�F�b�N
         if(read_list.size() <= 0)
         {
          // ���R�[�h�������O(�[��)���̏ꍇ
          listMessage.add("T_INV_CTRL.PLANT_CD:" + targetStruct.getPLANT_CD());
          setErrorMessage("AH00022", listMessage);
          listMessage.clear();
          return null;
         }
       
         // �Ǎ����擾
         AH0050010Struct readStruct = new AH0050010Struct();
         readStruct = (AH0050010Struct)read_list.get(0);
         
         /*//�I�����F�敪���擾
         targetStruct.setINV_DATE(readStruct.getINV_DATE());
         List apprList = entity.mselectApprFlg.read(conn,targetStruct);
         if(apprList.size() > 0){        	 
        	 readStruct.seth_APRR_FLG(((AH0050010Struct)apprList.get(0)).geth_APRR_FLG());
         }*/
       
         // �I���󋵕�����擾�ݒ菈��
         String strInvStatus = _invAccessor.getInvStatus(
          conn,
          readStruct.getREGULAR_INV_FLG(),
          readStruct.getCYCLE_INV_FLG(),
          readStruct.getTEMP_INV_FLG(),
          readStruct.getINV_STS_TYP(),
          CoreTools.getLocale(struct.getsUser_ID()));
         readStruct.setw_INV_status(strInvStatus);
         return readStruct;
        }
        
       
        /**
         * �I������f�[�^�Ǎ�����
         *
         * @param targetStruct �Ώۃf�[�^���
         * @return �ُ�Ȃ� �ŐV�̓Ǎ���� �G���[ null
         */
        private AH0050010Struct readT_INV_CTRL(AH0050010Struct targetStruct) throws BusinessProcessException, FoundationException, SQLException
        {
         // ���O�o�͏��i�[�p
         List listMessage = new ArrayList();
       
         // �Ǎ����s
         List read_list = new ArrayList(0);
         read_list = entity.mT_INV_CTRL.read(conn, targetStruct);
       
         // ���R�[�h�����`�F�b�N
         if(read_list.size() <= 0)
         {
          // ���R�[�h�������O(�[��)���̏ꍇ
          listMessage.add("T_INV_CTRL.INV_DATE:" + targetStruct.getINV_DATE());
          listMessage.add("T_INV_CTRL.PLANT_CD:" + targetStruct.getPLANT_CD());
          setErrorMessage("AH00021", listMessage);
          listMessage.clear();
          return null;
         }
       
         // �Ǎ����擾
         AH0050010Struct readStruct = new AH0050010Struct();
         readStruct = (AH0050010Struct)read_list.get(0);
       
         // �I���󋵕�����擾�ݒ菈��
         String strInvStatus = _invAccessor.getInvStatus(
          conn,
          readStruct.getREGULAR_INV_FLG(),
          readStruct.getCYCLE_INV_FLG(),
          readStruct.getTEMP_INV_FLG(),
          readStruct.getINV_STS_TYP(),
          CoreTools.getLocale(struct.getsUser_ID()));
         readStruct.setw_INV_status(strInvStatus);
         return readStruct;
        }
       
        /**
         * �ۊǋ�Ǎ�����
         *
         * @param targetStruct �Ώۃf�[�^���
         * @return �ُ�Ȃ� �ŐV�̓Ǎ���� �G���[ null
         */
        private AH0050010Struct readWH(AH0050010Struct targetStruct) throws BusinessProcessException, FoundationException, SQLException
        {
         // ���O�o�͏��i�[�p
         List listMessage = new ArrayList();
       
         // �Ǎ����s
         List read_list = new ArrayList(0);
         read_list = entity.mM_WH.read(conn, targetStruct);
       
         // �ۊǋ摶�݃`�F�b�N
         if(read_list.size() <= 0)
         {
          listMessage.add("M_WH.WH_CD:" + targetStruct.getWH_CD());
          setErrorMessage("AH00019", listMessage);
          listMessage.clear();
          return null;
         }
       
         // �Ǎ����擾
         AH0050010Struct readStruct = new AH0050010Struct();
         readStruct = (AH0050010Struct)read_list.get(0);
         return readStruct;
        }
       
        /**
         * �ۊǋ�`�F�b�N����
         *
         * @param targetStruct �Ώۃf�[�^���
         * @return �ُ�Ȃ� true �G���[ false
         */
        private boolean checkWH(AH0050010Struct targetStruct) throws BusinessProcessException
        {
         // ���O�o�͏��i�[�p
         List listMessage = new ArrayList();
       
         // �ۊǋ�.�H��R�[�h�����O�C�����[�U�̍H��R�[�h�Ɠ������ǂ����̃`�F�b�N
         if(getsysPLANT_CD().equals(targetStruct.getPLANT_CD()) != true)
         {
          listMessage.add("M_WH.WH_CD:" + targetStruct.getWH_CD());
          listMessage.add("M_WH.PLANT_CD:" + targetStruct.getPLANT_CD());
          setErrorMessage("AH00020", listMessage);
          listMessage.clear();
          return false;
         }
       
         return true;
        }
       
        /**
         * �i�ړǍ�����
         *
         * @param targetStruct �Ώۃf�[�^���
         * @return �ُ�Ȃ� �ŐV�̓Ǎ���� �G���[ null
         */
        private AH0050010Struct readITEM(AH0050010Struct targetStruct) throws BusinessProcessException, FoundationException, SQLException
        {
         // ���O�o�͏��i�[�p
         List listMessage = new ArrayList();
       
         // �Ǎ����s
         List read_list = new ArrayList(0);
         read_list = entity.mM_ITEM.read(conn, targetStruct);
       
         // �i�ڑ��݃`�F�b�N
         if(read_list.size() <= 0)
         {
          listMessage.add("M_ITEM.ITEM_CD:" + targetStruct.getITEM_CD());
          setErrorMessage("AH00002", listMessage);
          listMessage.clear();
          return null;
         }
       
         // �Ǎ����擾
         AH0050010Struct readStruct = new AH0050010Struct();
         readStruct = (AH0050010Struct)read_list.get(0);
       
         return readStruct;
        }
       
        //------------------------------------------------------------------
        //------------------------------------------------------------------
       
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
         AH0050010Struct structTemp = new AH0050010Struct();
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
        private final int CSV_COLNO_WH_CD = 0;
        private final int CSV_COLNO_ITEM_CD = 1;
        private final int CSV_COLNO_JOB_ODR_CD = 2;
        private final int CSV_COLNO_LOT_NO = 3;
        private final int CSV_COLNO_ACTUAL_STOCK_QTY = 4;
        /** �b�r�u�捞�f�[�^�K�v���ڐ� */
        private final int CSV_NECESSARY_COLUMN = (CSV_COLNO_ACTUAL_STOCK_QTY+1);
       
       
        /**
         * �b�r�u�f�[�^�擾�ƃ��X�g�f�[�^��
         *
         * @return	CSV�f�[�^���X�g
         */
        private List readCsvData() throws ExpjException
        {
         // ���O�o�͏��i�[�p
         List listMessage = new ArrayList();
       
         String [] strsCsvData = null;
         List listCsv = null;
         try {
       
          // �b�r�u�f�[�^�̃A�b�v���[�h
          strsCsvData = (String []) csvReader.lineRead();
          if(null != strsCsvData)
          {
           setSyslogConfig("strsCsvData.length:" + strsCsvData.length);
       
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
            AH0050010Struct structCsv = new AH0050010Struct();
            Vector v = csvReader.importCSVLine(strsCsvData[i]);
            if(null != v)
            {
             // ���ڐ��`�F�b�N
             int intColNum = v.size();
             if(CSV_NECESSARY_COLUMN <= intColNum)
             {
              // �b�r�u�̍��ڂ����X�g�f�[�^��
              structCsv.setWH_CD((String) v.get(CSV_COLNO_WH_CD));
              structCsv.setITEM_CD((String) v.get(CSV_COLNO_ITEM_CD));
              structCsv.setJOB_ODR_CD((String) v.get(CSV_COLNO_JOB_ODR_CD));
              structCsv.setACTUAL_STOCK_QTY((String) v.get(CSV_COLNO_ACTUAL_STOCK_QTY));
              structCsv.setLOT_NO((String) v.get(CSV_COLNO_LOT_NO));
              structCsv.setw_COLUMN_FLG((String)null);
              // �����Ɋ֘A����p�����[�^��ݒ�
              structCsv.setPLANT_CD(getsysPLANT_CD());
              structCsv.setINV_DATE(_save_struct.getINV_DATE());
              structCsv.setREGULAR_INV_FLG(_save_struct.getREGULAR_INV_FLG());
              structCsv.setCYCLE_INV_FLG(_save_struct.getCYCLE_INV_FLG());
              structCsv.setTEMP_INV_FLG(_save_struct.getTEMP_INV_FLG());
              structCsv.setINV_STS_TYP(_save_struct.getINV_STS_TYP());
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
             setSyslogConfig("csvReader.Vector was Failed... line:" + strsCsvData[i]);
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
 		 // �����ꍀ�ڎ擾�Ή�
 		 String locale = CoreTools.getLocale(sysUSER_CD);
         boolean bSuccess = true;	// ���������t���O������
         int intSuccessCount = 0;	// �`�F�b�N���탌�R�[�h����
         int intCsvDataCount = 0;	// �Ώۃf�[�^����
         List listRead;				// ��Ɨp
         try {
          ExpjMessage emsg = null;
          AH0050010Struct structCsv;
          AH0050010Struct tempStruct;
          intCsvDataCount = listCsv.size();
          for(int i = 0; i < intCsvDataCount; i++)
          {
           // CSV���擾
           structCsv = (AH0050010Struct)listCsv.get(i);
       
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
           boolean bItemError = false;		// �i�ڕۊǋ�G���[�t���O������
       
           // �ۊǋ�`�F�b�N
           if(structCsv.getWH_CD() == null || ("").equals(structCsv.getWH_CD()) == true)
           {
            // �ۊǋ悪null
            emsg = new ExpjMessage( "AH00014" );
            csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_WH_CD);
            sysLog.warning(emsg, getsysUSER_CD());
            logMessage = "CSV.WH_CD:" + structCsv.getWH_CD();
            emsg = new ExpjMessage( "ZZ01006", logMessage );
            sysLog.warning(emsg, getsysUSER_CD());
            bError = true;
            bItemError = true;
           }
           else
           {
            // �ۊǋ�Ǎ���
            listRead = entity.mM_WH.read(conn, structCsv);
            if(listRead.size() <= 0)
            {
             // �ۊǋ悪���݂��Ȃ�
             emsg = new ExpjMessage( "AH00019" );
             csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_WH_CD);
             sysLog.warning(emsg, getsysUSER_CD());
             logMessage = "M_WH.WH_CD:" + structCsv.getWH_CD();
             emsg = new ExpjMessage( "ZZ01006", logMessage );
             sysLog.warning(emsg, getsysUSER_CD());
             bError = true;
             bItemError = true;
            }
            else
            {
             AH0050010Struct readStructWh = new AH0050010Struct();
             readStructWh = (AH0050010Struct)listRead.get(0);
             if(getsysPLANT_CD().equals(readStructWh.getPLANT_CD()) != true)
             {
              // �ۊǋ�̍H��R�[�h�����O�C�����[�U�̍H��łȂ�
              emsg = new ExpjMessage( "AH00020" );
              csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_WH_CD);
              sysLog.warning(emsg, getsysUSER_CD());
              logMessage = "M_WH.WH_CD:" + readStructWh.getWH_CD()
                + "M_WH.PLANT_CD:" + readStructWh.getPLANT_CD();
              emsg = new ExpjMessage( "ZZ01006", logMessage );
              sysLog.warning(emsg, getsysUSER_CD());
              bError = true;
              bItemError = true;
             }
            }
           }
       
           // �i�ڔԍ��`�F�b�N
           if(structCsv.getITEM_CD() == null || ("").equals(structCsv.getITEM_CD()) == true)
           {
            // �i�ڔԍ���null
            emsg = new ExpjMessage( "AH00001" );
            csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ITEM_CD);
            sysLog.warning(emsg, getsysUSER_CD());
            logMessage = "CSV.ITEM_CD:" + structCsv.getITEM_CD();
            emsg = new ExpjMessage( "ZZ01006", logMessage );
            sysLog.warning(emsg, getsysUSER_CD());
            bError = true;
            bItemError = true;
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
             logMessage = "M_ITEM.ITEM_CD:" + structCsv.getITEM_CD();
             emsg = new ExpjMessage( "ZZ01006", logMessage );
             sysLog.warning(emsg, getsysUSER_CD());
             bError = true;
             bItemError = true;
            }
            else
            {
             AH0050010Struct readStructItem = new AH0050010Struct();
             readStructItem = (AH0050010Struct)listRead.get(0);
             _LOT_CTRL_FLG = readStructItem.getLOT_CTRL_FLG();
             structCsv.setUNIT_QTY_TYP(readStructItem.getUNIT_QTY_TYP());
             if("8".equals(readStructItem.getMRP_ODR_TYP()) == true)
             {
              // �w�肳�ꂽ�i�ڂ��[���i��
              emsg = new ExpjMessage( "AH00028" );
              csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ITEM_CD);
              sysLog.warning(emsg, getsysUSER_CD());
              logMessage = "M_ITEM.ITEM_CD:" + structCsv.getITEM_CD();
              emsg = new ExpjMessage( "ZZ01006", logMessage );
              sysLog.warning(emsg, getsysUSER_CD());
              bError = true;
              bItemError = true;
             }
             // �i�ڂ̒I���敪��9�i�I�����Ȃ��j���ǂ����̃`�F�b�N
             if("9".equals(readStructItem.getABC_TYP()) == true)
             {
              // �w�肳�ꂽ�i�ڂ̒I���敪��9�I�����Ȃ��j
              emsg = new ExpjMessage( "AH00016" );
              csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ITEM_CD);
              sysLog.warning(emsg, getsysUSER_CD());
              logMessage = "M_ITEM.ITEM_CD:" + structCsv.getITEM_CD();
              emsg = new ExpjMessage( "ZZ01006", logMessage );
              sysLog.warning(emsg, getsysUSER_CD());
              bError = true;
              bItemError = true;
             }
       
             // ���Ԃ�null�łȂ��ꍇ�̃`�F�b�N
             if(structCsv.getJOB_ODR_CD() != null && ("").equals(structCsv.getJOB_ODR_CD()) != true)
             {
              // MRP�n�i�ڂ��ǂ����̃`�F�b�N
              if(Calculate.compare(readStructItem.getMRP_ODR_TYP(), "3") == 1)
              {
               // �w�肳�ꂽ�i�ڂ�MRP�n�i��
               emsg = new ExpjMessage( "AH00027" );
               csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_JOB_ODR_CD);
               sysLog.warning(emsg, getsysUSER_CD());
               logMessage = "CSV.JOB_ODR_CD:" + structCsv.getJOB_ODR_CD()
                 + ", M_ITEM.ITEM_CD:" + structCsv.getITEM_CD()
                 + ", M_ITEM.MRP_ODR_TYP:" + readStructItem.getMRP_ODR_TYP();
               emsg = new ExpjMessage( "ZZ01006", logMessage );
               sysLog.warning(emsg, getsysUSER_CD());
               bError = true;
              }
       
              // ���v�ʂɑ��݂��邩�ǂ����̃`�F�b�N
              listRead = entity.mT_OD.read(conn, structCsv);
              if(listRead.size() <= 0)
              {
               // ���v�ʂɑ��݂��Ȃ�
               emsg = new ExpjMessage( "AH00039" );
               csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_JOB_ODR_CD);
               sysLog.warning(emsg, getsysUSER_CD());
               logMessage = "T_OD.JOB_ODR_CD:" + structCsv.getJOB_ODR_CD()
                 + ", T_OD.ITEM_CD:" + structCsv.getITEM_CD()
                 + ", T_OD.PLANT_CD:" + structCsv.getPLANT_CD();
               emsg = new ExpjMessage( "ZZ01006", logMessage );
               sysLog.warning(emsg, getsysUSER_CD());
               bError = true;
              }
             } else {
            	 if(_LOT_CTRL_FLG.equals("1")){
            		 if(readStructItem.getLOT_NUMBERING_TYP()!=null 
            				 && readStructItem.getLOT_NUMBERING_TYP().equals("0")){
                		 if(structCsv.getLOT_NO()==null || ("").equals(structCsv.getLOT_NO()) == true){
                			 emsg = new ExpjMessage( "AH60007" );
                	         csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ITEM_CD);
                	         sysLog.warning(emsg, getsysUSER_CD());
                	         logMessage = "CSV.ITEM_CD:" + structCsv.getITEM_CD();
                	         emsg = new ExpjMessage( "ZZ01006", logMessage );
                	         sysLog.warning(emsg, getsysUSER_CD());
                	         bError = true;
                	         bItemError = true;
                		 }
            		 } else if(readStructItem.getLOT_NUMBERING_TYP()!=null 
            				 && !readStructItem.getLOT_NUMBERING_TYP().equals("0")) {
            			 if(structCsv.getLOT_NO()!=null && !("").equals(structCsv.getLOT_NO())){
                			 struct.setINV_DATE(struct.getINV_DATE());
                			 struct.setWH_CD(structCsv.getWH_CD());
                			 struct.setPLANT_CD(sysPLANT_CD);
                			 struct.setITEM_CD(structCsv.getITEM_CD());
                			 struct.setLOT_NO(structCsv.getLOT_NO());
                			 List listCtrl = entity.mselect_T_LOT_CTRL_2.read(conn, struct);
            				 if(listCtrl.size() <= 0){
            					 emsg = new ExpjMessage( "AE00165" );
                    	         csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_LOT_NO);
                    	         sysLog.warning(emsg, getsysUSER_CD());
                    	         logMessage = "CSV.T_LOT_CTRL:" + structCsv.getLOT_NO();
                    	         emsg = new ExpjMessage( "ZZ01006", logMessage );
                    	         sysLog.warning(emsg, getsysUSER_CD());
                    	         bError = true;
                    	         bItemError = true;
            				 } else {
            					 if(Calculate.compare(
        								 ((AH0050010Struct)listCtrl.get(0)).getLOT_DEL_FLG(),
        								 "0")!=0){
                					 emsg = new ExpjMessage( "AE00165" );
                        	         csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_LOT_NO);
                        	         sysLog.warning(emsg, getsysUSER_CD());
                        	         logMessage = "CSV.T_LOT_CTRL:" + structCsv.getLOT_NO();
                        	         emsg = new ExpjMessage( "ZZ01006", logMessage );
                        	         sysLog.warning(emsg, getsysUSER_CD());
                        	         bError = true;
                        	         bItemError = true;
        						 }
            				 }
            			 }
            		 }
            	 }else{
            		 if(structCsv.getLOT_NO()!=null && ("").equals(structCsv.getLOT_NO()) != true){
            			 emsg = new ExpjMessage( "AH60006" );
            	         csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ITEM_CD);
            	         sysLog.warning(emsg, getsysUSER_CD());
            	         logMessage = "CSV.ITEM_CD:" + structCsv.getITEM_CD();
            	         emsg = new ExpjMessage( "ZZ01006", logMessage );
            	         sysLog.warning(emsg, getsysUSER_CD());
            	         bError = true;
            	         bItemError = true;
            		 }
            	 }
             }
            }
           }
       
           // �ۊǋ�A�i�ڔԍ��ɃG���[���Ȃ��ꍇ
           if(bItemError != true)
           {
            // �z�I����ON�̏ꍇ�̃`�F�b�N
            if("1".equals(structCsv.getCYCLE_INV_FLG()) == true)
            {
             // �i�ڕʒI���T�C�N������i�ځA�H�ꂪ�������f�[�^������
             listRead = entity.mT_INV_CYCLE.read(conn, structCsv);
             if(listRead.size() <= 0)
             {
              // �i�ڕʒI���T�C�N���ɕi�ځA�H�ꂪ�������f�[�^�����݂��Ȃ�
              emsg = new ExpjMessage( "AH00040" );
              csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ITEM_CD);
              sysLog.warning(emsg, getsysUSER_CD());
              logMessage = "T_INV_CYCLE.ITEM_CD:" + structCsv.getITEM_CD()
                + ", T_INV_CYCLE.PLANT_CD:" + structCsv.getPLANT_CD();
              emsg = new ExpjMessage( "ZZ01006", logMessage );
              sysLog.warning(emsg, getsysUSER_CD());
              bError = true;
             }
             else
             {
              // �i�ڕʒI���T�C�N������ǂݍ��񂾃f�[�^�̎擾
              AH0050010Struct readStructInvCycle = (AH0050010Struct)listRead.get(0);
       
              // �I���T�C�N���̎��{�t���O�����X�g�f�[�^��
              List listInvFlg = new ArrayList(0);
              listInvFlg.add(readStructInvCycle.getINV_FLG_JAN());// �P��
              listInvFlg.add(readStructInvCycle.getINV_FLG_FEB());// �Q��
              listInvFlg.add(readStructInvCycle.getINV_FLG_MAR());// �R��
              listInvFlg.add(readStructInvCycle.getINV_FLG_APR());// �S��
              listInvFlg.add(readStructInvCycle.getINV_FLG_MAY());// �T��
              listInvFlg.add(readStructInvCycle.getINV_FLG_JUN());// �U��
              listInvFlg.add(readStructInvCycle.getINV_FLG_JUL());// �V��
              listInvFlg.add(readStructInvCycle.getINV_FLG_AUG());// �W��
              listInvFlg.add(readStructInvCycle.getINV_FLG_SEP());// �X��
              listInvFlg.add(readStructInvCycle.getINV_FLG_OCT());// �P�O��
              listInvFlg.add(readStructInvCycle.getINV_FLG_NOV());// �P�P��
              listInvFlg.add(readStructInvCycle.getINV_FLG_DEC());// �P�Q��
       
              // �I�����t�̌����擾
              DateConverter dateConv = new DateConverter();
              Date dateWork = dateConv.str2date(structCsv.getINV_DATE());
              Calendar cal = new GregorianCalendar();
              cal.setTime(dateWork);
              int intMonth = cal.get(Calendar.MONTH);
       
              // �I�������̒I�����{�t���O�̃`�F�b�N
              if("1".equals((String)listInvFlg.get(intMonth)) != true)
              {
               // �I�����̌��̒I�����{�t���O��ON�łȂ�
               emsg = new ExpjMessage( "AH00040" );
               csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ITEM_CD);
               sysLog.warning(emsg, getsysUSER_CD());
               logMessage = "T_INV_CYCLE.ITEM_CD:" + structCsv.getITEM_CD()
                 + ", T_INV_CYCLE.PLANT_CD:" + structCsv.getPLANT_CD();
               emsg = new ExpjMessage( "ZZ01006", logMessage );
               sysLog.warning(emsg, getsysUSER_CD());
               bError = true;
              }
             }
            }
       
            // �Վ��I����ON�̏ꍇ�̃`�F�b�N
            if("1".equals(structCsv.getTEMP_INV_FLG()) == true)
            {
             // �I�������i�ڎw�肩��I�����A�H��A�i�ڂ��������f�[�^������
             List listInvTargetItem = entity.mT_INV_TARGET_ITEM.read(conn, structCsv);
             // �I�������ۊǋ�w�肩��I�����A�H��A�ۊǋ悪�������f�[�^������
             List listInvTargetWh = entity.mT_INV_TARGET_WH.read(conn, structCsv);
             if( (listInvTargetItem.size() <= 0) && (listInvTargetWh.size() <= 0) )
             {
              // �I�������i�ڎw��ɒI�����A�H��A�i�ڂ��������f�[�^�����݂��Ȃ�
              // ����ɁA�I�������ۊǋ�w��ɒI�����A�H��A�ۊǋ悪�������f�[�^�����݂��Ȃ�
              emsg = new ExpjMessage( "AH00040" );
              csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ITEM_CD);
              sysLog.warning(emsg, getsysUSER_CD());
              logMessage = "T_INV_TARGET_ITEM.ITEM_CD:" + structCsv.getITEM_CD()
                + ", T_INV_TARGET_WH.WH_CD:" + structCsv.getWH_CD()
                + ", INV_DATE:" + structCsv.getINV_DATE()
                + ", PLANT_CD:" + structCsv.getPLANT_CD();
              emsg = new ExpjMessage( "ZZ01006", logMessage );
              sysLog.warning(emsg, getsysUSER_CD());
              bError = true;
             }
            }
           }
       
           // ���I���`�F�b�N
           if(structCsv.getACTUAL_STOCK_QTY() == null || ("").equals(structCsv.getACTUAL_STOCK_QTY()) == true)
           {
            // ���I����null
            emsg = new ExpjMessage( "AH00017" );
            csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ACTUAL_STOCK_QTY);
            sysLog.warning(emsg, getsysUSER_CD());
            logMessage = "CSV.ACTUAL_STOCK_QTY:" + structCsv.getACTUAL_STOCK_QTY();
            emsg = new ExpjMessage( "ZZ01006", logMessage );
            sysLog.warning(emsg, getsysUSER_CD());
            bError = true;
           }
           else
           {
            if((Calculate.isInteger(structCsv.getACTUAL_STOCK_QTY()) == false)
            && (Calculate.isNumeric(structCsv.getACTUAL_STOCK_QTY()) == false))
            {
             // ���I�������l�^�łȂ�
             emsg = new ExpjMessage( "AH00017" );
             csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ACTUAL_STOCK_QTY);
             sysLog.warning(emsg, getsysUSER_CD());
             logMessage = "CSV.ACTUAL_STOCK_QTY:" + structCsv.getACTUAL_STOCK_QTY();
             emsg = new ExpjMessage( "ZZ01006", logMessage );
             sysLog.warning(emsg, getsysUSER_CD());
             bError = true;
            }
            else
            {
            	double ACTUAL_STOCK_QTY = Double.parseDouble(Calculate.floor(structCsv.getACTUAL_STOCK_QTY(), 4));
            	double ACTUAL_STOCK_QTY1 = Double.parseDouble(structCsv.getACTUAL_STOCK_QTY());
            	if(ACTUAL_STOCK_QTY !=ACTUAL_STOCK_QTY1){
            		// ���I���������� 4�� �𒴂��Ă����ꍇ
                    emsg = new ExpjMessage( "AH00017" );
                    csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ACTUAL_STOCK_QTY);
                    sysLog.warning(emsg, getsysUSER_CD());
                    logMessage = "CSV.ACTUAL_STOCK_QTY:" + structCsv.getACTUAL_STOCK_QTY();
                    emsg = new ExpjMessage( "ZZ01006", logMessage );
                    sysLog.warning(emsg, getsysUSER_CD());
                    bError = true;
            	}else{
            		if(ACTUAL_STOCK_QTY1 >= 100000000000000d){
            			// ���I���������� 14�� �𒴂��Ă����ꍇ
                        emsg = new ExpjMessage( "AH00017" );
                        csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ACTUAL_STOCK_QTY);
                        sysLog.warning(emsg, getsysUSER_CD());
                        logMessage = "CSV.ACTUAL_STOCK_QTY:" + structCsv.getACTUAL_STOCK_QTY();
                        emsg = new ExpjMessage( "ZZ01006", logMessage );
                        sysLog.warning(emsg, getsysUSER_CD());
                        bError = true;
            		}            		         	
            	}
             if(Calculate.compare(structCsv.getACTUAL_STOCK_QTY(), "0") < 0)
             {
              // ���I�������̒l
              emsg = new ExpjMessage( "AH00017" );
              csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ACTUAL_STOCK_QTY);
              sysLog.warning(emsg, getsysUSER_CD());
              logMessage = "CSV.ACTUAL_STOCK_QTY:" + structCsv.getACTUAL_STOCK_QTY();
              emsg = new ExpjMessage( "ZZ01006", logMessage );
              sysLog.warning(emsg, getsysUSER_CD());
              bError = true;
             }
       
             // �����Ǘ��i�ڂŏ������w�肳�ꂽ��G���[
             if(("1".equals(structCsv.getUNIT_QTY_TYP()) == true)
             && (Calculate.isNumeric(structCsv.getACTUAL_STOCK_QTY()) == true) )
             {
              // �����Ǘ��i�ڂɏ����͎w��ł��Ȃ�
              emsg = new ExpjMessage( "AH00029" );
              csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ACTUAL_STOCK_QTY);
              sysLog.warning(emsg, getsysUSER_CD());
              logMessage = "M_ITEM.ITEM_CD:" + structCsv.getITEM_CD()
                + ", CSV.ACTUAL_STOCK_QTY:" + structCsv.getACTUAL_STOCK_QTY();
              emsg = new ExpjMessage( "ZZ01006", logMessage );
              sysLog.warning(emsg, getsysUSER_CD());
              bError = true;
             }
            }
           }
           
           // �I�����A�i�ڔԍ��A�ۊǋ�R�[�h�A���b�g�ԍ��̏d���`�F�b�N
           for (int j = i + 1; j < intCsvDataCount; j++) {
				tempStruct = (AH0050010Struct) listCsv.get(j);
				if(structCsv.getITEM_CD().equals(tempStruct.getITEM_CD())
						&& structCsv.getWH_CD().equals(tempStruct.getWH_CD())
						&& structCsv.getLOT_NO()!= null && !"".equals(structCsv.getLOT_NO()) && structCsv.getLOT_NO().equals(tempStruct.getLOT_NO())) {
		              // �d���ꍇ
		              emsg = new ExpjMessage( "AD20405" );
		              csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_LOT_NO);
		              sysLog.warning(emsg, getsysUSER_CD());
		              logMessage = "CSV.LOT_NO:" + structCsv.getLOT_NO();
		              emsg = new ExpjMessage( "ZZ01006", logMessage );
		              sysLog.warning(emsg, getsysUSER_CD());
		              bError = true;
		              break;
				}
				// �i�ڔԍ��A�ۊǋ�R�[�h�A���Ԃ̏d���`�F�b�N
				if(structCsv.getITEM_CD().equals(tempStruct.getITEM_CD())
						&& structCsv.getWH_CD().equals(tempStruct.getWH_CD())
						&& structCsv.getJOB_ODR_CD()!= null && !"".equals(structCsv.getJOB_ODR_CD()) && structCsv.getJOB_ODR_CD().equals(tempStruct.getJOB_ODR_CD())) {
		              // �d���ꍇ
		              emsg = new ExpjMessage( "AD20405" );
		              csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_JOB_ODR_CD);
		              sysLog.warning(emsg, getsysUSER_CD());
		              logMessage = "CSV.JOB_ODR_CD:" + structCsv.getJOB_ODR_CD();
		              emsg = new ExpjMessage( "ZZ01006", logMessage );
		              sysLog.warning(emsg, getsysUSER_CD());
		              bError = true;
		              break;
				}
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
           emsg = new ExpjMessage( "AH00041",""+intSuccessCount,""+(intCsvDataCount - intSuccessCount));
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
         String keyMessage = "";
         int length = 0;
         String itemCd[] = new String[_MaxCsvTake];
         String whCd[] = new String[_MaxCsvTake];
         boolean bSuccess = false;	// ���������t���O������
         boolean bDBUpdate = false;	// DB�X�V���t���O������
         int intCsvDataCount = 0;	// �Ώۃf�[�^����
         List listRead;				// ��Ɨp
       
         // �������O��struct����ޔ�
         AH0050010Struct structCopy = new AH0050010Struct();
         structCopy.copy(struct);
         try
         {
          // �g�����U�N�V�����J�n
          conn.beginTransWeb();
       
          // DB�X�V���t���OON
          bDBUpdate = true;
       
          // �f�[�^�������������J��Ԃ�
          intCsvDataCount = listCsv.size();
          for(int i = 0; i < intCsvDataCount; i++)
          {
           // CSV���擾
           struct.copy((AH0050010Struct)listCsv.get(i));
       
           if(struct.getJOB_ODR_CD() == null || ("").equals(struct.getJOB_ODR_CD()) == true)
           {
				List listLotCtrlFlg = entity.mM_ITEM.read(conn, struct);
				_LOT_CTRL_FLG = ((AH0050010Struct) listLotCtrlFlg.get(0)).getLOT_CTRL_FLG();
				String str_LOT_NUMBERING_TYP = ((AH0050010Struct) listLotCtrlFlg.get(0)).getLOT_NUMBERING_TYP();
				if (_LOT_CTRL_FLG.equals("1")) {

					List listLotNo = entity.mT_LOT_INV4Update.read(conn,struct);
					if (listLotNo == null || listLotNo.size() <=0) {

						// [�i��]�D�h���b�g�ԍ��̔ԋ敪�h�� 1:�����̔Ԃ���B(�A�ԁj or 2:���P�ʍ̔� ����
						// [CSV�f�[�^]�h�݌Ƀ��b�g�ԍ��h =NULL �����́A[CSV�f�[�^]�h�݌Ƀ��b�g�ԍ��h�A
						// [CSV�f�[�^]�h�i�ڔԍ��h ��[���b�g�Ǘ�]���������i[���b�g�Ǘ�]�g�폜�t���O�h=0
						// ���폜�j�A
						// [���b�g�Ǘ�]�ɑ��݂��Ȃ��ꍇ �̏ꍇ���L�̔ԏ������s���B
						boolean b_Lot_Flg = false;
						boolean b_create_Lot = true;
						if (str_LOT_NUMBERING_TYP != null && !"0".equals(str_LOT_NUMBERING_TYP)) {
							if (struct.getLOT_NO() == null) {
								// �݌Ƀ��b�g�ԍ��̎����̔Ԃ��s���B
								String itemCdStr = struct.getITEM_CD();
								String acptDateStr = structCopy.getINV_DATE();
								BizCommon bc = new BizCommon(conn,getsysUSER_CD(), sp.getProcId(),getsysPLANT_CD());			
								List resultList = bc.getsetLotNumberingFd(itemCdStr, acptDateStr);										
								if (bc.getResultStatus().intValue() == 1) {
									if (resultList != null && resultList.size() > 0) {
										String result1 = (String) resultList.get(0);
										struct.setLOT_NO(result1);
										entity.mupdate_T_LOT_CTRL.update(conn, struct);
									}
								} else {
									if (resultList != null && resultList.size() > 1) {
										String result2 = (String) resultList.get(1);			
										setErrorMessage(result2);
										conn.rollback();
										return false;
									}
								}
							} else {
								List lot_list = entity.mselect_T_LOT_CTRL_2.read(conn, struct);
								if (lot_list.isEmpty()) {
									b_Lot_Flg = true;
								} else {
									String str_DEL_FLG = ((AH0050010Struct) lot_list.get(0)).getLOT_DEL_FLG();
									if (str_DEL_FLG != null && (!"0".equals(str_DEL_FLG))) {
										b_Lot_Flg = true;
									}
								}
							}

							if (b_Lot_Flg) {
								// �݌Ƀ��b�g�ԍ��̎����̔Ԃ��s���B
								String itemCdStr = struct.getITEM_CD();
								String acptDateStr = structCopy.getINV_DATE();
								BizCommon bc = new BizCommon(conn,getsysUSER_CD(), sp.getProcId(),getsysPLANT_CD());
								List resultList = bc.getsetLotNumberingFd(itemCdStr, acptDateStr);
										
								if (bc.getResultStatus().intValue() == 1) {
									if (resultList != null && resultList.size() > 0) {
										String result1 = (String) resultList.get(0);
										if (result1.equals(struct.getLOT_NO())) {
											b_create_Lot = true;
											struct.setLOT_DEL_FLG("0");
											entity.mselect_T_LOT_CTRL.update(conn, struct);
										} else {
											struct.setLOT_NO(result1);
											entity.mupdate_T_LOT_CTRL.update(conn, struct);
											List list_LotNo = entity.mT_LOT_INV4Update.read(conn, struct);
											if (!list_LotNo.isEmpty()) {
												b_create_Lot = false;
											} else {
												b_create_Lot = true;
											}
										}
									}
								} else {
									if (resultList != null && resultList.size() > 1) {
										String result2 = (String) resultList.get(1);
										setErrorMessage(result2);
										conn.rollback();
										return false;
									}
								}
							}

							if (!b_create_Lot) {
								setSyslogConfig("T_LOT_INV.update");
								// �X�V�Ώۃf�[�^�����݂����ꍇ�X�V���s
								struct.setACTUAL_STOCK_QTY_1(struct.getACTUAL_STOCK_QTY());
								entity.mupdateT_LOT_INV.update(conn, struct);
										
							} else {
								setSyslogConfig("T_LOT_INV.create");
								// �X�V�Ώۃf�[�^�����݂��Ȃ������ꍇ�o�^���s
								struct.setACTUAL_STOCK_QTY_1(struct.getACTUAL_STOCK_QTY());
								entity.mcreate_T_LOT_INV.create(conn,struct);
										
							}

						} else {
							if (struct.getLOT_NO() != null) {
								struct.setACTUAL_STOCK_QTY_1(struct.getACTUAL_STOCK_QTY());
								List lot_list = entity.mselect_T_LOT_CTRL_2.read(conn, struct);
								if (lot_list != null && lot_list.size()>0){
									entity.mupdate_T_LOT_CTRL.update(conn,struct);
								} else {
									// �X�V�Ώۃf�[�^�����݂����ꍇ�X�V���s
									struct.setBEST_BEFORE_DATE(get_Str_BEST_BEFORE_DATE(struct));
									entity.mselect_T_LOT_CTRL.create(conn, struct);
									keyMessage = "T_LOT_CTRL.ITEM_CD:" + struct.getITEM_CD()
										+ "T_LOT_CTRL.LOT_NO:" + struct.getLOT_NO();
	                      			//�݌Ƀ��b�g�ԍ������݂��Ȃ������̂ŁA�V�K�̔Ԃ��܂���
	                      			setInfoMessage("AH00049","");
	                      			setInfoMessage("ZZ01006",keyMessage);
								}
								
								if (listLotNo!= null && listLotNo.size()>0) {
									setSyslogConfig("T_LOT_INV.update");
									// �X�V�Ώۃf�[�^�����݂����ꍇ�X�V���s
									entity.mupdateT_LOT_INV.update(conn, struct);
								} else {
									setSyslogConfig("T_LOT_INV.create");
									// �X�V�Ώۃf�[�^�����݂����ꍇ�X�V���s
									entity.mcreate_T_LOT_INV.create(conn, struct);
								}
							}
						}
					} else {
						struct.setACTUAL_STOCK_QTY_1(struct.getACTUAL_STOCK_QTY());
						List lot_list = entity.mselect_T_LOT_CTRL_2.read(conn, struct);
						if (lot_list != null && lot_list.size()>0){
							entity.mupdate_T_LOT_CTRL.update(conn,struct);
						} else {
							// �X�V�Ώۃf�[�^�����݂����ꍇ�X�V���s
							struct.setBEST_BEFORE_DATE(get_Str_BEST_BEFORE_DATE(struct));
							entity.mselect_T_LOT_CTRL.create(conn, struct);
						}
						setSyslogConfig("T_LOT_INV.update");
						// �X�V�Ώۃf�[�^�����݂����ꍇ�X�V���s
						struct.setACTUAL_STOCK_QTY_1(struct.getACTUAL_STOCK_QTY());
						entity.mupdateT_LOT_INV.update(conn, struct);
					}

					if (length == 0) {
						length = length + 1;
						itemCd[length] = struct.getITEM_CD();
						whCd[length] = struct.getWH_CD();					
					} else {
						int flg = 1;
						for (int j = 1; j <= length; j++) {							
							flg = 1;
							if (struct.getITEM_CD().equals(itemCd[j])&& struct.getWH_CD().equals(whCd[j])) {
								flg = 0;
								break;
							}
						}
						if (flg == 1) {
							length = length + 1;
							itemCd[length] = struct.getITEM_CD();
							whCd[length] = struct.getWH_CD();
						}
					}

				} else {
					// �i�ڒI���f�[�^���݃`�F�b�N
					listRead = entity.mT_ITEM_INV4Update.read(conn, struct);

					if (listRead.size() <= 0) {
						setSyslogConfig("T_ITEM_INV.create");
						// �X�V�Ώۃf�[�^�����݂��Ȃ������ꍇ�o�^���s
						entity.mT_ITEM_INV.create(conn, struct);
					} else {
						setSyslogConfig("T_ITEM_INV.update");
						// �X�V�Ώۃf�[�^�����݂����ꍇ�X�V���s
						entity.mT_ITEM_INV.update(conn, struct);
					}
				}
			}
           else
           {
            // ���ԃf�[�^���݃`�F�b�N
            listRead = entity.mT_JOB_ODR_CD_INV4Update.read(conn, struct);
            if(listRead.size() <= 0)
            {
             setSyslogConfig("T_JOB_ODR_CD_INV.create");
             // �X�V�Ώۃf�[�^�����݂��Ȃ������ꍇ�o�^���s
             entity.mT_JOB_ODR_CD_INV.create(conn, struct);
            }
            else
            {
             setSyslogConfig("T_JOB_ODR_CD_INV.update");
             // �X�V�Ώۃf�[�^�����݂����ꍇ�X�V���s
             entity.mT_JOB_ODR_CD_INV.update(conn, struct);
            }
           }
          } // for()
		  for (int i = 1; i <= length; i++) {
			  struct.setITEM_CD(itemCd[i]);
			  struct.setWH_CD(whCd[i]);
			  List actaualList = entity.mselectActualStockQty1.read(conn,struct);

			  AH0050010Struct newStruct = new AH0050010Struct();
			  if (!actaualList.isEmpty()) {
				  newStruct = (AH0050010Struct) actaualList.get(0);
				  struct.setACTUAL_STOCK_QTY(newStruct.getACTUAL_STOCK_QTY_2());
						  
				  // �i�ڒI���f�[�^���݃`�F�b�N
				  listRead = entity.mT_ITEM_INV4Update.read(conn, struct);
				  if (listRead.size() <= 0) {
					  setSyslogConfig("T_ITEM_INV.create");
					  // �X�V�Ώۃf�[�^�����݂��Ȃ������ꍇ�o�^���s
					  entity.mT_ITEM_INV.create(conn, struct);
				  } else {
					  setSyslogConfig("T_ITEM_INV.update");
					  // �X�V�Ώۃf�[�^�����݂����ꍇ�X�V���s
					  entity.mT_ITEM_INV.update(conn, struct);
				  }
			  }
		  }
          // �R�~�b�g
          conn.commit();
       
          // DB�X�V���t���OOFF
          bDBUpdate = false;
       
          // ���������t���O�ݒ�
          bSuccess = true;
       
         } catch(SQLException e) {
          if(struct.getJOB_ODR_CD() == null || ("").equals(struct.getJOB_ODR_CD()) == true)
          {
           // �i�ڒI���f�[�^�i���O���j
           keyMessage = "T_ITEM_INV.INV_DATE:" +  struct.getINV_DATE()
             + ", T_ITEM_INV.WH_CD:" +  struct.getWH_CD()
             + ", T_ITEM_INV.ITEM_CD:" +  struct.getITEM_CD()
             + ", T_ITEM_INV.PLANT_CD:" +  struct.getPLANT_CD()
             + ", T_ITEM_INV.ACTUAL_STOCK_QTY:" +  struct.getACTUAL_STOCK_QTY();
          }else{
           // ���ԒI���f�[�^�i���O���j
           keyMessage = "T_JOB_ODR_CD_INV.INV_DATE:" +  struct.getINV_DATE()
             + ", T_JOB_ODR_CD_INV.WH_CD:" +  struct.getWH_CD()
             + ", T_JOB_ODR_CD_INV.ITEM_CD:" +  struct.getITEM_CD()
             + ", T_JOB_ODR_CD_INV.JOB_ODR_CD:" +  struct.getJOB_ODR_CD()
             + ", T_JOB_ODR_CD_INV.PLANT_CD:" +  struct.getPLANT_CD()
             + ", T_JOB_ODR_CD_INV.ACTUAL_STOCK_QTY:" +  struct.getACTUAL_STOCK_QTY();
          }
          ExpjMessage emsg = new ExpjMessage( "ZZ01006", keyMessage );
          sysLog.severe(emsg, getsysUSER_CD());
          setSqlExceptionMsg(e);
       
         } finally {
          // DB�X�V�������ɉ��炩�̃G���[�����������ꍇ��roolback�������Ȃ�
          if(bDBUpdate == true)
          {
           // ���[���o�b�N
           conn.rollback();
           setSyslogConfig("Control�FcsvData2Db - rollback!! ");
       
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
       
       
       
	/**
	 * �V�X�e���p�����[�^�擾
	 */
	private boolean getSysParameter() throws BusinessProcessException, FoundationException {
		boolean b = true;
		try {
			List sysParameterList = entity.mSELECT_SYS_PARAMETER.read(conn, struct);
			if(sysParameterList == null || sysParameterList.isEmpty()) return b;
			AH0050010Struct sysParameterStruct = (AH0050010Struct) sysParameterList.get(0);
			if(null != sysParameterStruct.getPAST_RESULT_ENTRY_TYP() && !"".equals(sysParameterStruct.getPAST_RESULT_ENTRY_TYP())){
				if("false".equals(sysParameterStruct.getPAST_RESULT_ENTRY_TYP())){
					b = false;
				}
			}
		}catch(Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}
		return b;
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
			AH0050010Struct procExecDateStruct = (AH0050010Struct) procExecDateList.get(0);
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
	 * �Ɩ����W�b�N�̃G���[���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * @param code ���b�Z�[�W�R�[�h
	 */
	private void setErrorMessage2(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, sysUSER_CD);
	}
	
	/**
	 * �Ɩ��G���[�������̃p�����[�^�ݒ菈����؂�o���Ċ֐���
	 * @param tableName �e�[�u����
	 * @param columnName �J������
	 * @param value �l
	 */
	private void setErrorParameter2(String tableName, String columnName, String value) {
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
    private String create_Lot(AH0050010Struct structCopy) throws FoundationException, SQLException{
   	   // �݌Ƀ��b�g�ԍ��̎����̔Ԃ��s���B
   	   String result1 = null;
       String itemCdStr = structCopy.getITEM_CD();
       String acptDateStr = structCopy.getINV_DATE();
       structCopy.setPLANT_CD(this.sysPLANT_CD);
       
       if (struct.getLOT_NO()!=null && !"".equals(struct.getLOT_NO())){
    	   structCopy.setLOT_DEL_FLG("0");
       	   entity.mupdate_T_LOT_CTRL.update(conn, structCopy); 
       } else {
    	   BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
    	   List resultList = bc.getsetLotNumberingFd(itemCdStr, acptDateStr);
    	   if(bc.getResultStatus().intValue() == 1){
    		   if(resultList != null && resultList.size() > 0){
    			   result1 = (String)resultList.get(0);
      	           struct.setLOT_NO(result1);
       	           structCopy.setLOT_NO(result1);      	        	       	        
       	           entity.mupdate_T_LOT_CTRL.update(conn, structCopy);
    		   }
    	   }else{
               if(resultList != null && resultList.size() > 1){
          	        String result2 = (String)resultList.get(1);
          	        setErrorMessage(result2);
          	        conn.rollback();
          	        return null;
               }
           }     
       }         
       return result1;
   }
    /**
     * �ܖ����������v�Z
     * @param workstruct
     * @return
     * @throws FoundationException
     * @throws SQLException
     */
     private String get_Str_BEST_BEFORE_DATE(AH0050010Struct workstruct) throws FoundationException, SQLException{
     	String bestBeforeDate = null;
//     	 �Ɩ��^�p��
   	  List temlist = entity.mSelect_SYS_DATE_CTRL.read(conn, workstruct);
   	  if(!temlist.isEmpty()){
   		workstruct.setBUSINESS_OPR_DATE(
   				  ((AH0050010Struct)temlist.get(0)).getBUSINESS_OPR_DATE());
   	  }
   	  
			BizCommon bc = new BizCommon(conn, sysUSER_CD, sp.getProcId(), sysPLANT_CD);
			List resList = new ArrayList();
			Integer retSts;

			String errCode = null;
			
			resList = bc.calcBestBeforeFd(struct.getITEM_CD(), workstruct.getBUSINESS_OPR_DATE());

			if(!resList.isEmpty()) {
				bestBeforeDate = (String) resList.get(0);
				errCode = (String) resList.get(1);
				retSts = bc.getResultStatus();

				if(retSts != null && retSts.intValue() == 1) {
					if(bestBeforeDate.equals("0")) {
						bestBeforeDate = "";
						setWarningMessage("AE22010", struct.getITEM_CD(), struct.getLOT_NO());
					}
					workstruct.setBEST_BEFORE_DATE(bestBeforeDate);
					return bestBeforeDate;
				}
				if(retSts != null && retSts.intValue() == 3) {
					setErrorMessage(errCode);
				}
			}
			return bestBeforeDate;
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0050");
		logger.entering("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
                //---------------------------------------------------------------------
		// ���O�o�͏��i�[�p
		List listMessage = new ArrayList();

		// �Ǎ����������t���O������
		boolean bSuccess = false;

		// �ŐV�I��������Ǎ��p
		AH0050010Struct readStructInvCtrl = new AH0050010Struct();
		// �ŐV���Ԓ��I��������Ǎ��p
		AH0050010Struct readStructInvCtrl4StsTyp1 = new AH0050010Struct();
		// �ŐV�ۊǋ���Ǎ��p
		AH0050010Struct readStructWh = new AH0050010Struct();

		// ������Ԃ�������
		setReadStatus(INITIAL);
		try {
			// �G���[�t���O������
			boolean bError = false;

			// ���X�g�N���A
			list.clear();

			// �ꗗ���I���ύX�t���O���Z�b�g
			struct.resetChangeFlag();

			// �����Ɋ֘A����p�����[�^��ݒ�
			struct.setPLANT_CD(getsysPLANT_CD());
			struct.setITEM_CD(struct.getw_ITEM_CD());
			setJOB_ODR_CD_STOCK_flg(struct.geth_JOB_ODR_CD_STOCK_flg());
			struct.setLOT_NO(struct.getLOT_NO_form());
			struct.setLOT_NO_form(struct.getLOT_NO_form());

			// �I������f�[�^�̑��݃`�F�b�N
			readStructInvCtrl = readT_INV_CTRL(struct);
			if (readStructInvCtrl == null) {
				// �I������f�[�^�����݂��Ȃ�
				bError = true;
			} else {
				// �I�����Ԓ��f�[�^�̑��݃`�F�b�N
				readStructInvCtrl4StsTyp1 = readT_INV_CTRL_INV_STS_TYP1();
				if (readStructInvCtrl4StsTyp1 == null) {
					// �I�����Ԓ��f�[�^�����݂��Ȃ�
					bError = true;
				} else {
					// �ŐV�̊��Ԓ��I������ݒ�
					struct.setINV_DATE(readStructInvCtrl4StsTyp1.getINV_DATE());
				}
			}

			// �ۊǋ�Ǎ����`�F�b�N
			readStructWh = readWH(struct);
			if (readStructWh == null) {
				// �ۊǋ悪���݂��Ȃ�
				bError = true;
			} else {
				// �ۊǋ�`�F�b�N
				if (!checkWH(readStructWh)) {
					// �ۊǋ�̍H��R�[�h�����O�C�����[�U�̍H��łȂ�
					bError = true;
				}
			}

			// �\���p���X�g����
			List disp_list = new ArrayList(0);

			// �G���[���Ȃ��ꍇ
			if (bError != true) {
                // �\���ő�s����������
				ScreenParam sp = new ScreenParam(this.getClass());
		         int maxLine = sp.getMaxLine(conn,_DISPLAY_CD_PARENT);
		         if (maxLine != 0)
						struct.setROW_COUNT(String.valueOf(maxLine));
					else
						struct.setROW_COUNT(null);
				// �u���ԍ݌Ɏw��v�̃`�F�b�N�L���ɂ�鏈��
				if ("1".equals(getJOB_ODR_CD_STOCK_flg())) {
					// ���ԁi���ԍ݌Ɏw��t���O��ON�j
					listMessage.add("T_JOB_ODR_CD_INV.INV_DATE:" + struct.getINV_DATE());
					listMessage.add("T_JOB_ODR_CD_INV.WH_CD:" + struct.getWH_CD());
					listMessage.add("T_JOB_ODR_CD_INV.ITEM_CD:" + struct.getITEM_CD());
					listMessage.add("T_JOB_ODR_CD_INV.JOB_ODR_CD:" + struct.getJOB_ODR_CD());
					disp_list = entity.mT_JOB_ODR_CD_INVCnt.read(conn, struct);
					long rowCount = Long.parseLong(((AH0050010Struct) disp_list.get(0)).getl_COUNT());
                    // �\�����X�g�T�C�Y�̃`�F�b�N
					if (rowCount == 0) {
						// ���R�[�h�������O(�[��)���̏ꍇ
						bError = true;
						setErrorMessage("ZZ06001", listMessage);
						listMessage.clear();

						// ������Ԃ��u�O���Ǎ��v�ɐݒ�
						setReadStatus(NOT_FOUND);
						if(list != null && list.size() > 0){
							list.clear();
						}
						return;
					}

					// �\���ő�s����������
					if (!checkMaxDispLine(_DISPLAY_CD_PARENT, rowCount)) {
						// �\���ꗗ�������ő�\���s���ȏ�̏ꍇ
						bError = true;

						// ������Ԃ��u�ő�s���I�[�o�[�v�ɐݒ�
						setReadStatus(TOO_MANY);
						if(list != null && list.size() > 0){
							list.clear();
						}
						return;
					}
					disp_list = entity.mT_JOB_ODR_CD_INV.read(conn, struct);
				} else {
					// �i�ځi���ԍ݌Ɏw��t���O��OFF�j
					listMessage.add("T_ITEM_INV.INV_DATE:" + struct.getINV_DATE());
					listMessage.add("T_ITEM_INV.WH_CD:" + struct.getWH_CD());
					listMessage.add("T_ITEM_INV.ITEM_CD:" + struct.getITEM_CD());
					if (struct.getLOT_NO_form() != null
							&& !"".equals(struct.getLOT_NO_form())) {
						disp_list = entity.mselectT_LOT_INVLotNoCnt.read(conn, struct);
						long rowCount = Long.parseLong(((AH0050010Struct) disp_list.get(0)).getl_COUNT());
                        //�\�����X�g�T�C�Y�̃`�F�b�N
						if (rowCount == 0) {
							// ���R�[�h�������O(�[��)���̏ꍇ
							bError = true;
							setErrorMessage("ZZ06001", listMessage);
							listMessage.clear();

							// ������Ԃ��u�O���Ǎ��v�ɐݒ�
							setReadStatus(NOT_FOUND);
							if(list != null && list.size() > 0){
								list.clear();
							}
							return;
						}

						// �\���ő�s����������
						if (!checkMaxDispLine(_DISPLAY_CD_PARENT, rowCount)) {
							// �\���ꗗ�������ő�\���s���ȏ�̏ꍇ
							bError = true;

							// ������Ԃ��u�ő�s���I�[�o�[�v�ɐݒ�
							setReadStatus(TOO_MANY);
							if(list != null && list.size() > 0){
								list.clear();
							}
							return;
						}
						disp_list = entity.mselectT_LOT_INVLotNo.read(conn, struct);

					} else {
						disp_list = entity.mselectActualStockQty2Cnt.read(conn, struct);
						long rowCount = Long.parseLong(((AH0050010Struct) disp_list.get(0)).getl_COUNT());
                        //�\�����X�g�T�C�Y�̃`�F�b�N
						if (rowCount == 0) {
							// ���R�[�h�������O(�[��)���̏ꍇ
							bError = true;
							setErrorMessage("ZZ06001", listMessage);
							listMessage.clear();

							// ������Ԃ��u�O���Ǎ��v�ɐݒ�
							setReadStatus(NOT_FOUND);
							if(list != null && list.size() > 0){
								list.clear();
							}
							return;
						}

						// �\���ő�s����������
						if (!checkMaxDispLine(_DISPLAY_CD_PARENT, rowCount)) {
							// �\���ꗗ�������ő�\���s���ȏ�̏ꍇ
							bError = true;

							// ������Ԃ��u�ő�s���I�[�o�[�v�ɐݒ�
							setReadStatus(TOO_MANY);
							if(list != null && list.size() > 0){
								list.clear();
							}
							return;
						}
						disp_list = entity.mselectActualStockQty2.read(conn, struct);
					}
				}
			}

			// �G���[���Ȃ��ꍇ
			if (!bError) {
				// �\���p���X�g���X�V
				setList(disp_list);

				// �Ǎ����������t���O�ݒ�
				bSuccess = true;

				// ������Ԃ��u�Ǎ������v�ɐݒ�
				setReadStatus(NORMAL);
			}

		} catch (SQLException e) {
			setSqlExceptionMsg(e);

		} finally {
			// �ŐV���ݒ�
			// ��ʕ\�����N���A
			struct.setw_INV_status("");
			struct.setSTOCK_SAVE_DATE("");
			struct.setWH_NAME("");

			// �ŐV�I�������񔽉f
			if (readStructInvCtrl4StsTyp1 != null) {
				struct.setw_INV_status(readStructInvCtrl4StsTyp1.getw_INV_status());
				struct.setSTOCK_SAVE_DATE(readStructInvCtrl4StsTyp1.getSTOCK_SAVE_DATE());
			} else if (readStructInvCtrl != null) {
				struct.setw_INV_status(readStructInvCtrl.getw_INV_status());
				struct.setSTOCK_SAVE_DATE(readStructInvCtrl.getSTOCK_SAVE_DATE());
			}

			// �ŐV�ۊǋ��񔽉f
			if (readStructWh != null) {
				struct.setWH_NAME(readStructWh.getWH_NAME());
			}

		}
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * �s�ǉ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlappend() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0050");
		logger.entering("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlappend");
			//{{user_implement_dev:<controlappend>
                //---------------------------------------------------------------------
                // ���O�o�͏��i�[�p
                String logMessage = "";
              
                // �e��ʂ�struct��ޔ�
                saveParentStruct();
              
                try {
              
                 // �T�u��ʕ\���l�ݒ�
                 // ������
                 struct.initializeSub1();
              
                 // �e��ʂ̕\���l���R�s�[
                 struct.setINV_DATE(_save_struct.getINV_DATE());
                 struct.setw_INV_status(_save_struct.getw_INV_status());
                 struct.setWH_CD(_save_struct.getWH_CD());
                 struct.setWH_NAME(_save_struct.getWH_NAME());
                 struct.setITEM_CD(_save_struct.getw_ITEM_CD());
                 struct.setJOB_ODR_CD(_save_struct.getJOB_ODR_CD());
                 struct.seth_JOB_ODR_CD_STOCK_flg(_save_struct.geth_JOB_ODR_CD_STOCK_flg());
                 setJOB_ODR_CD_STOCK_flg(_save_struct.geth_JOB_ODR_CD_STOCK_flg());
              
                 // �i�ړǍ��i���݂��Ȃ��ꍇ��null�j
                 logMessage = "M_ITEM.ITEM_CD:" +  struct.getITEM_CD();
                 List read_list = new ArrayList(0);
                 read_list = entity.mM_ITEM.read(conn, struct);
                 if(read_list.size() > 0){                
                    AH0050010Struct readStruct = (AH0050010Struct)read_list.get(0);
                    struct.setITEM_NAME(readStruct.getITEM_NAME());
                 }
              
                } catch(SQLException e) {
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", logMessage );
                 sysLog.severe(emsg, getsysUSER_CD());
                 setSqlExceptionMsg(e);
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlappend>
		logger.exiting("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlappend");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0050");
		logger.entering("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
                //---------------------------------------------------------------------
                
		// ���O�o�͏��i�[�p
		String keyMessage = "";
		int length = 0;
		int lengthMod = 0;
		int lengthError = 0;
		String itemCd[] = new String[_MaxCsvTake];
		String whCd[] = new String[_MaxCsvTake];
		String itemCdMod[] = new String[_MaxCsvTake];
		String whCdMod[] = new String[_MaxCsvTake];
		String itemCdError[] = new String[_MaxCsvTake];
		String whCdError[] = new String[_MaxCsvTake];
		String AataulQty[] = new String[_MaxCsvTake];
		List keylistMessage = new ArrayList();
		List listQty = new ArrayList();

		// �X�V���������t���O������
		boolean bSuccess = false;
		_LOT_CTRL_FLG = null;
		// �������O��struct����ޔ�
		AH0050010Struct structCopy = new AH0050010Struct();
		structCopy.copy(struct);

		try {
			// �X�V�s�f�[�^���J�E���^������
			int intNotUpdateCount = 0;

			// DB�X�V���t���O������
			boolean bDBUpdate = false;

			// �G���[�t���O������
			boolean bError = false;

			// ���Y���̉ߋ��̎��ѓ��͂̐����`�F�b�N
			if (getSysParameter() == false) {
				if (!chkProcExecDate("2", struct.getINV_DATE(), struct
						.getINV_DATE())) {
					setErrorMessage2(ProcExecDateError);
					setErrorParameter2("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD",struct.getPLANT_CD());
					setErrorParameter2("SYS_ACTUAL_COST_CTRL_AC","PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
					return;
				}
			}

			// �I������f�[�^�̑��݃`�F�b�N
			AH0050010Struct readStructInvCtrl = new AH0050010Struct();
			readStructInvCtrl = readT_INV_CTRL(struct);
			if (readStructInvCtrl == null) {
				// �I������f�[�^�����݂��Ȃ�
				bError = true;
			} else {
				// �I�����Ԓ��f�[�^�̑��݃`�F�b�N
				readStructInvCtrl = readT_INV_CTRL_INV_STS_TYP1();
				if (readStructInvCtrl == null) {
					// �I�����Ԓ��f�[�^�����݂��Ȃ�
					bError = true;
				}
			}

			// �ۊǋ�Ǎ����`�F�b�N
			AH0050010Struct readStructWh = new AH0050010Struct();
			readStructWh = readWH(struct);
			if (readStructWh == null) {
				// �ۊǋ悪���݂��Ȃ�
				bError = true;
			} else {
				// �ۊǋ�`�F�b�N
				if (checkWH(readStructWh) != true) {
					// �ۊǋ�̍H��R�[�h�����O�C�����[�U�̍H��łȂ�
					bError = true;
				}
			}

			// �G���[���Ȃ��ꍇ
			if (bError != true) {
				// �ꗗ�ɕ\������Ă���f�[�^�����������J��Ԃ�
				AH0050010Struct targetStruct = new AH0050010Struct();
				for (int i = 0; i < getListsize(); i++) {
					// �f�[�^�擾
					targetStruct = (AH0050010Struct) getListvalue(i);
					struct.copy(targetStruct);

					// �X�V�ɕK�v�ȋ��ʃp�����[�^�ݒ�
					struct.setINV_DATE(structCopy.getINV_DATE());
					struct.setPLANT_CD(structCopy.getPLANT_CD());
					struct.setWH_CD(structCopy.getWH_CD());
					struct.setLOT_NO_form(structCopy.getLOT_NO_form());
					// ���ԃR�[�h��SQL�̏����Ώۂł��郁���o�ϐ�(JOB_ODR_CD)�ɓ���Ȃ���
					struct.setJOB_ODR_CD(struct.getw_JOB_ODR_CD());

					// ���O���L�[�̐ݒ�
					if ("1".equals(getJOB_ODR_CD_STOCK_flg()) == true) {
						// ���ԁi���ԍ݌Ɏw��t���O��ON�j
						keyMessage = "T_JOB_ODR_CD_INV.INV_DATE:"
								+ struct.getINV_DATE()
								+ ", T_JOB_ODR_CD_INV.WH_CD:"
								+ struct.getWH_CD()
								+ ", T_JOB_ODR_CD_INV.ITEM_CD:"
								+ struct.getITEM_CD()
								+ ", T_JOB_ODR_CD_INV.JOB_ODR_CD:"
								+ struct.getJOB_ODR_CD()
								+ ", T_JOB_ODR_CD_INV.PLANT_CD:"
								+ struct.getPLANT_CD()
								+ ", T_JOB_ODR_CD_INV.ACTUAL_STOCK_QTY:"
								+ struct.getACTUAL_STOCK_QTY();
						keylistMessage.clear();
						keylistMessage.add("T_JOB_ODR_CD_INV.INV_DATE:" + struct.getINV_DATE());
						keylistMessage.add("T_JOB_ODR_CD_INV.WH_CD:" + struct.getWH_CD());
						keylistMessage.add("T_JOB_ODR_CD_INV.ITEM_CD:" + struct.getITEM_CD());
						keylistMessage.add("T_JOB_ODR_CD_INV.JOB_ODR_CD:" + struct.getJOB_ODR_CD());
						keylistMessage.add("T_JOB_ODR_CD_INV.ACTUAL_STOCK_QTY:" + struct.getACTUAL_STOCK_QTY());
					} else {
						// �i�ځi���ԍ݌Ɏw��t���O��OFF�j
						keyMessage = "T_ITEM_INV.INV_DATE:"
								+ struct.getINV_DATE() + ", T_ITEM_INV.WH_CD:"
								+ struct.getWH_CD() + ", T_ITEM_INV.ITEM_CD:"
								+ struct.getITEM_CD() + ", T_ITEM_INV.PLANT_CD:"
								+ struct.getPLANT_CD() + ", T_ITEM_INV.ACTUAL_STOCK_QTY:"
								+ struct.getACTUAL_STOCK_QTY();
						keylistMessage.clear();
						keylistMessage.add("T_ITEM_INV.INV_DATE:" + struct.getINV_DATE());
						keylistMessage.add("T_ITEM_INV.WH_CD:" + struct.getWH_CD());
						keylistMessage.add("T_ITEM_INV.ITEM_CD:" + struct.getITEM_CD());
						keylistMessage.add("T_ITEM_INV.ACTUAL_STOCK_QTY:" + struct.getACTUAL_STOCK_QTY());
					}

					// �G���[�t���O������
					bError = false;

					try {
						// �g�����U�N�V�����J�n
						conn.beginTransWeb();

						// DB�X�V���t���OON
						bDBUpdate = true;

						// �f�[�^���݃`�F�b�N
						List read_list = new ArrayList(0);
						if ("1".equals(getJOB_ODR_CD_STOCK_flg())) {
							// ���ԁi���ԍ݌Ɏw��t���O��ON�j
							setSyslogConfig(keyMessage);
							read_list = entity.mT_JOB_ODR_CD_INV4Update.read(conn, struct);									
						} else {
							// �i�ځi���ԍ݌Ɏw��t���O��OFF�j
							setSyslogConfig(keyMessage);
							List listItem = entity.mM_ITEM.read(conn, struct);
							_LOT_CTRL_FLG = ((AH0050010Struct) listItem.get(0)).getLOT_CTRL_FLG();
							if (_LOT_CTRL_FLG.equals("1")) {
								if (struct.getLOT_NO() != null && !"".equals(struct.getLOT_NO())) {
									// ���b�g�ʕi�ڒI���X�V��
									read_list = entity.mT_LOT_INV4Update.read(conn, struct);
								} else {
									// �ۊǋ�ʕi�ڒI���X�V��
									read_list = entity.mT_ITEM_INV4Update.read(conn, struct);
								}
							} else {
								read_list = entity.mT_ITEM_INV4Update.read(conn, struct);
							}
						}
						if (read_list.size() <= 0) {
							// �X�V�Ώۃf�[�^�����݂��Ȃ������ꍇ
							setErrorMessage("ZZ01101", keylistMessage);

							// �X�V�Ώۃf�[�^�����݂��Ȃ�
							bError = true;
						} else {
							// ���R�[�h���X�V����Ă��Ȃ����`�F�b�N
							AH0050010Struct newStruct = (AH0050010Struct) read_list.get(0);

							if (lengthMod == 0) {
								if (!newStruct.getMODIFY_COUNT().equals(struct.getMODIFY_COUNT())) {
									setErrorMessage("ZZ01105", keylistMessage);
									itemCdError[lengthError] = struct.getITEM_CD();
									whCdError[lengthError] = struct.getWH_CD();
									lengthError = lengthError + 1;
									// ���R�[�h���X�V����Ă���
									bError = true;
								}
								itemCdMod[lengthMod] = struct.getITEM_CD();
								whCdMod[lengthMod] = struct.getWH_CD();
								lengthMod = lengthMod + 1;
							} else {
								int flg = 0;
								for (int j = 0; j < lengthMod; j++) {
									if (struct.getITEM_CD().equals(itemCdMod[j])&& struct.getWH_CD().equals(whCdMod[j])) {
										flg = 1;
										break;
									}
								}

								if (flg != 1) {
									if (struct.getLOT_NO() != null && !struct.getLOT_NO().equals("")) {
										if (!newStruct.getMODIFY_COUNT_1().equals(struct.getMODIFY_COUNT_1())) {
											setErrorMessage("ZZ01105", keylistMessage);
											itemCdError[lengthError] = struct.getITEM_CD();
											whCdError[lengthError] = struct.getWH_CD();
											lengthError = lengthError + 1;
											// ���R�[�h���X�V����Ă���
											bError = true;
										}
									} else {
										if (!newStruct.getMODIFY_COUNT().equals(struct.getMODIFY_COUNT())) {
											setErrorMessage("ZZ01105",keylistMessage);
											itemCdError[lengthError] = struct.getITEM_CD();
											whCdError[lengthError] = struct.getWH_CD();
											lengthError = lengthError + 1;
											// ���R�[�h���X�V����Ă���
											bError = true;
										}
									}

									itemCdMod[lengthMod] = struct.getITEM_CD();
									whCdMod[lengthMod] = struct.getWH_CD();
									lengthMod = lengthMod + 1;
								}
							}
							if (bError != true) {
								if (!newStruct.getMODIFY_COUNT().equals(struct.getMODIFY_COUNT())) {
									// ���R�[�h���X�V����Ă���ꍇ
									if ("1".equals(getJOB_ODR_CD_STOCK_flg())) {
										// ���ԁi���ԍ݌Ɏw��t���O��ON�j
										setErrorMessage("ZZ01105",keylistMessage);												
										// ���R�[�h���X�V����Ă���
										bError = true;
									} else {
										// �i�ځi���ԍ݌Ɏw��t���O��OFF�j
										if ("1".equals(_LOT_CTRL_FLG)) {
											if (struct.getLOT_NO() != null && !struct.getLOT_NO().equals("")) {
												setErrorMessage("ZZ01105",keylistMessage);
												itemCdError[lengthError] = struct.getITEM_CD();
												whCdError[lengthError] = struct.getWH_CD();
												lengthError = lengthError + 1;
												// ���R�[�h���X�V����Ă���
												bError = true;
											}
										} else {
											setErrorMessage("ZZ01105",keylistMessage);
											// ���R�[�h���X�V����Ă���
											bError = true;
										}
									}
								}
							}
						}

						// �G���[���Ȃ��ꍇ
						if (bError != true) {
							// �X�V���s
							// �u���ԍ݌Ɏw��v�̃`�F�b�N�L���ɂ�鏈��
							if ("1".equals(getJOB_ODR_CD_STOCK_flg()) == true) {
								// ���ԁi���ԍ݌Ɏw��t���O��ON�j
								entity.mT_JOB_ODR_CD_INV.update(conn, struct);
							} else {
								int flgError = 0;
								for (int errorCount = 0; errorCount < lengthError; errorCount++) {
									if (struct.getITEM_CD().equals(itemCdError[errorCount])&& struct.getWH_CD().equals(whCdError[errorCount])) {
										flgError = 1;
										break;
									}
								}
								if (flgError != 1) {
									listQty = entity.mselectActualStockQty.read(conn, struct);
									int floorInt = 4;
									if ("1".equals(struct.getUNIT_QTY_TYP())) {
										floorInt = 0;
									}
									if ("1".equals(_LOT_CTRL_FLG)) {
										List ACTUALSTOCKQTYList = entity.mselectT_LOT_INVLotNo.read(conn, struct);
										String ACTUALSTOCKQTY = Calculate.floor(((AH0050010Struct) ACTUALSTOCKQTYList.get(0)).getACTUAL_STOCK_QTY(),floorInt);
										if (struct.getLOT_NO() != null && !"".equals(struct.getLOT_NO())) {
											struct.setACTUAL_STOCK_QTY_1(struct.getACTUAL_STOCK_QTY());
											entity.mupdateT_LOT_INV.update(conn, struct);
										}
										// �i�ځi���ԍ݌Ɏw��t���O��OFF�j
										if (length == 0) {
											if (struct.getLOT_NO() != null && !"".equals(struct.getLOT_NO())) {
												AataulQty[length] = Calculate.floor(((AH0050010Struct) listQty.get(0)).getACTUAL_STOCK_QTY(),floorInt);
												if (struct.getLOT_NO_form() != null && !"".equals(struct.getLOT_NO_form())) {
													String sumQty = Calculate.floor(((AH0050010Struct) listQty.get(0)).getTItemInvACTUALSTOCKQTY(),
																	floorInt);
													String sract = Calculate.subtract(ACTUALSTOCKQTY,Calculate.floor(struct.getACTUAL_STOCK_QTY(),floorInt));
													sumQty = Calculate.subtract(sumQty,sract);
													struct.setACTUAL_STOCK_QTY(sumQty);
												} else {
													if (!AataulQty[length].equals("0")) {
														struct.setACTUAL_STOCK_QTY(Calculate.floor(Calculate.add(AataulQty[length],struct.getACTUAL_STOCK_QTY()),floorInt));
													}
												}
											} else {
												AataulQty[length] = Calculate.floor(((AH0050010Struct) listQty.get(0)).getACTUAL_STOCK_QTY(),floorInt);
												String sumQty = Calculate.floor(((AH0050010Struct) listQty.get(0)).getACTUAL_STOCK_QTY(),floorInt);
												sumQty = Calculate.add(Calculate.subtract(sumQty,AataulQty[length]),Calculate.floor(struct.getACTUAL_STOCK_QTY(),floorInt));
												struct.setACTUAL_STOCK_QTY(sumQty);																	
											}
											itemCd[length] = struct.getITEM_CD();												
											whCd[length] = struct.getWH_CD();
											length = length + 1;
											entity.mT_ITEM_INV.update(conn,struct);												
										} else {
											int flg = 0;
											for (int j = 0; j < length; j++) {
												if (struct.getITEM_CD().equals(itemCd[j]) && struct.getWH_CD().equals(whCd[j])) {																
													if (struct.getLOT_NO() != null && !struct.getLOT_NO().equals("")) {
														String sumQty = Calculate.floor(((AH0050010Struct) listQty.get(0)).getTItemInvACTUALSTOCKQTY(),floorInt);			
														sumQty = Calculate.floor(Calculate.add(sumQty,struct.getACTUAL_STOCK_QTY()),floorInt);
														struct.setACTUAL_STOCK_QTY(sumQty);			
													} else {
														String sumQty = Calculate.floor(((AH0050010Struct) listQty.get(0)).getTItemInvACTUALSTOCKQTY(),floorInt);			
														String sract = AataulQty[j];
														sract = Calculate.floor(Calculate.subtract(sract,struct.getACTUAL_STOCK_QTY()),floorInt);			
														sumQty = Calculate.subtract(sumQty,sract);
														struct.setACTUAL_STOCK_QTY(sumQty);					
													}
													entity.mT_ITEM_INV.update(conn, struct);															
													flg = 1;
													break;
												}
											}
											if (flg != 1) {
												if (struct.getLOT_NO() != null && !struct.getLOT_NO().equals("")) {
													AataulQty[length] = Calculate.floor(((AH0050010Struct) listQty.get(0)).getACTUAL_STOCK_QTY(),floorInt);					
													if (struct.getLOT_NO_form() != null && !struct.getLOT_NO_form().equals("")) {
														String sumQty = Calculate.floor(((AH0050010Struct) listQty.get(0)).getACTUAL_STOCK_QTY(),floorInt);				
														String sract = Calculate.subtract(ACTUALSTOCKQTY,Calculate.floor(struct.getACTUAL_STOCK_QTY(),floorInt));							
														sumQty = Calculate.subtract(sumQty,sract);
														struct.setACTUAL_STOCK_QTY(sumQty);					
													} else {
														if (!AataulQty[length].equals("0")) {
															struct.setACTUAL_STOCK_QTY(Calculate.floor(Calculate.add(AataulQty[length],struct.getACTUAL_STOCK_QTY()),floorInt));
														}
													}
												} else {
													AataulQty[length] = Calculate.floor(((AH0050010Struct) listQty.get(0)).getACTUAL_STOCK_QTY(),floorInt);					
													String sumQty = Calculate.floor(((AH0050010Struct) listQty.get(0)).getACTUAL_STOCK_QTY(),floorInt);				
													sumQty = Calculate.subtract(sumQty,Calculate.subtract(AataulQty[length],Calculate.floor(struct.getACTUAL_STOCK_QTY(),floorInt)));												
													struct.setACTUAL_STOCK_QTY(sumQty);
												}
												itemCd[length] = struct.getITEM_CD();
												whCd[length] = struct.getWH_CD();
												length = length + 1;
												entity.mT_ITEM_INV.update(conn,struct);
											}
										}
									} else {
										entity.mT_ITEM_INV.update(conn, struct);
									}
								}
							}
							// �R�~�b�g
							conn.commit();

							// DB�X�V���t���OOFF
							bDBUpdate = false;
						}

					} catch (SQLException e) {
						setErrorMessage("ZZ01106", keylistMessage);

						// �G���[�t���O�ݒ�
						bError = true;

					} finally {
						// DB�X�V�������ɉ��炩�̃G���[�����������ꍇ��roolback�������Ȃ�
						if (bDBUpdate == true) {
							// ���[���o�b�N
							conn.rollback();
							setSyslogConfig("Control�Fcontrolupdate - rollback!! ");
						}

						// �G���[������ꍇ
						if (bError == true) {
							// �X�V�s�f�[�^���J�E���g
							intNotUpdateCount++;
						}
					}

				} // for()

				// �X�V�ł��Ȃ������f�[�^�����݂����ꍇ
				if (intNotUpdateCount > 0) {
					setInfoMessage("AH60001", "");
				}

				// �e��ʏ��i�L�[���j���A
				struct.copy(structCopy);

				// �ēǍ�����
				controlselect();

				// �X�V���������t���O�ݒ�
				bSuccess = true;

			} // if(bError != true)

		} catch (SQLException e) {
			setSqlExceptionMsg(e);

		} finally {
			// �X�V�����Ŏ��s�����ꍇ
			if (!bSuccess) {
				// �e��ʏ��i�L�[���j���A
				struct.copy(structCopy);
			}
		}
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlupdate>
		logger.exiting("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0050");
		logger.entering("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
                //------------------------------------------------------------------
                try {
                 // struct�N���A
                 struct.clear();
              
                 // �����l�ݒ�
                 AH0050010Struct readStruct = new AH0050010Struct();
                 readStruct = readT_INV_CTRL_INV_STS_TYP1();
                 if(readStruct != null)
                 {
                  // �Ǎ����ݒ�
                  struct.copy(readStruct);
                 }
                 struct.initializeParent();
              
                 // �\�����X�g���N���A
                 list.clear();
              
                 // ������Ԃ��u������ԁv�ɐݒ�
                 setReadStatus(INITIAL);
     	        
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
                     // ������Ԃ��u���s�v�ɐݒ�
                     setReadStatus(ERROR);
     	        	return;
     	        }else if("1".equals(aprInvCtrl)){
     				// �P�̏ꍇ
     	        	aprInvCtrl = "1";
     	        }else{
     				// �P�ȊO�̏ꍇ
     	        	aprInvCtrl = "0";
     	        }
             	struct.seth_APR_INV_CTRL(aprInvCtrl);
             	/** �p�����[�^�uCsv�捞�ő匏���v���擾*/
             	_MaxCsvTake = Integer.parseInt(privateConfig.getString("MAX_CSV_TAKE"));
             	if (_MaxCsvTake==0) {
             		String locale = CoreTools.getLocale(struct.getsUser_ID());
      				ResourceBundle messages = CoreTools.getResourceBundle("ExpjMessage", locale);
      	    		ExpjMessage emsg = new ExpjMessage("AZ00041", messages.getString("AZ00077"));
      	    		msgStruct.addError(emsg);
      	    		sysLog.warning(emsg, sysUSER_CD);
     	        	_MaxCsvTake = 10000;
                     // ������Ԃ��u���s�v�ɐݒ�
                     setReadStatus(ERROR);
     	        	return;
             	}
                 
                 //�I�����F�敪���擾
         		struct.setPLANT_CD(this.getsysPLANT_CD());
                List apprList = entity.mselectApprFlg.read(conn,struct);
                if(apprList.size() > 0){ 
                 	aprFlg = ((AH0050010Struct)apprList.get(0)).geth_APRR_FLG();
                 	struct.seth_APRR_FLG(aprFlg);
                 }
         		if("1".equals(struct.geth_APR_INV_CTRL()) && "2".equals(struct.geth_APRR_FLG())){
         			setErrorMessage("AH00048");
         			return;
         		}
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlinsert_sub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0050");
		logger.entering("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlinsert_sub1");
			//{{user_implement_dev:<controlinsert_sub1>
                //---------------------------------------------------------------------
                
		// ���Y���̉ߋ��̎��ѓ��͂̐����`�F�b�N
		if (getSysParameter() == false) {
			if (chkProcExecDate("2", struct.getINV_DATE(), struct.getINV_DATE()) == false) {
				setErrorMessage2(ProcExecDateError);
				setErrorParameter2("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD",struct.getPLANT_CD());						
				setErrorParameter2("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE",struct.getPROC_EXEC_DATE().toString());						
				return;
			}
		}

		// ���O���L�[�̐ݒ�
		String keyMessage = "";
		List keylistMessage = new ArrayList();
		if ("1".equals(getJOB_ODR_CD_STOCK_flg())) {
			// ���ԁi���ԍ݌Ɏw��t���O��ON�j
			keyMessage = "T_JOB_ODR_CD_INV.INV_DATE:" + struct.getINV_DATE()
					+ ", T_JOB_ODR_CD_INV.WH_CD:" + struct.getWH_CD()
					+ ", T_JOB_ODR_CD_INV.ITEM_CD:" + struct.getITEM_CD()
					+ ", T_JOB_ODR_CD_INV.JOB_ODR_CD:" + struct.getJOB_ODR_CD()
					+ ", T_JOB_ODR_CD_INV.PLANT_CD:" + struct.getPLANT_CD()
					+ ", T_JOB_ODR_CD_INV.ACTUAL_STOCK_QTY:"
					+ struct.getACTUAL_STOCK_QTY();
			keylistMessage.add("T_JOB_ODR_CD_INV.INV_DATE:" + struct.getINV_DATE());
			keylistMessage.add("T_JOB_ODR_CD_INV.WH_CD:" + struct.getWH_CD());
			keylistMessage.add("T_JOB_ODR_CD_INV.ITEM_CD:" + struct.getITEM_CD());
			keylistMessage.add("T_JOB_ODR_CD_INV.JOB_ODR_CD:" + struct.getJOB_ODR_CD());
			keylistMessage.add("T_JOB_ODR_CD_INV.ACTUAL_STOCK_QTY:" + struct.getACTUAL_STOCK_QTY());
		} else {
			// �i�ځi���ԍ݌Ɏw��t���O��OFF�j
			keyMessage = "T_ITEM_INV.INV_DATE:" + struct.getINV_DATE()
					+ ", T_ITEM_INV.WH_CD:" + struct.getWH_CD()
					+ ", T_ITEM_INV.ITEM_CD:" + struct.getITEM_CD()
					+ ", T_ITEM_INV.PLANT_CD:" + struct.getPLANT_CD()
					+ ", T_ITEM_INV.ACTUAL_STOCK_QTY:" + struct.getACTUAL_STOCK_QTY();
			keylistMessage.add("T_ITEM_INV.INV_DATE:" + struct.getINV_DATE());
			keylistMessage.add("T_ITEM_INV.WH_CD:" + struct.getWH_CD());
			keylistMessage.add("T_ITEM_INV.ITEM_CD:" + struct.getITEM_CD());
			keylistMessage.add("T_ITEM_INV.ACTUAL_STOCK_QTY:" + struct.getACTUAL_STOCK_QTY());
		}

		// ���O�o�͏��i�[�p
		List listMessage = new ArrayList();

		// �o�^���������t���O������
		boolean bSuccess = false;

		// ���I���؎̂Ď��{�t���O������
		boolean bResultFloor = false;

		// DB�X�V���t���O������
		boolean bDBUpdate = false;

		// �������O��struct����ޔ�
		AH0050010Struct structCopy = new AH0050010Struct();
		structCopy.copy(struct);

		// �ŐV�I��������Ǎ��p
		AH0050010Struct readStructInvCtrl = new AH0050010Struct();
		// �ŐV�ۊǋ���Ǎ��p
		AH0050010Struct readStructWh = new AH0050010Struct();
		// �ŐV�i�ڏ��Ǎ��p
		AH0050010Struct readStructItem = new AH0050010Struct();
		// ���Ԓ��I������f�[�^���݃t���O������
		boolean bIsNotINV_CTRL = false;

		try {
			// �G���[�t���O������
			boolean bError = false;
			List read_list = null;
			// ���I��
			_ACTUAL_STOCK_QTY = null;
			String create_Lot = "";
			// �o�^�ɕK�v�ȋ��ʃp�����[�^�ݒ�
			struct.setPLANT_CD(getsysPLANT_CD());
			setJOB_ODR_CD_STOCK_flg(struct.geth_JOB_ODR_CD_STOCK_flg());

			// �I������f�[�^�̑��݃`�F�b�N
			readStructInvCtrl = readT_INV_CTRL(struct);
			if (readStructInvCtrl == null) {
				// �I������f�[�^�����݂��Ȃ�
				bError = true;
			} else {
				// �I�����Ԓ��f�[�^�̑��݃`�F�b�N
				readStructInvCtrl = readT_INV_CTRL_INV_STS_TYP1();
				if (readStructInvCtrl == null) {
					// �I�����Ԓ��f�[�^�����݂��Ȃ�
					bError = true;

					// ���Ԓ��I������f�[�^���݂Ȃ��t���OON
					bIsNotINV_CTRL = true;
				}
			}

			// �ۊǋ�Ǎ����`�F�b�N
			readStructWh = readWH(struct);
			if (readStructWh == null) {
				// �ۊǋ悪���݂��Ȃ�
				bError = true;
			} else {
				// �ۊǋ�`�F�b�N
				if (checkWH(readStructWh) != true) {
					// �ۊǋ�̍H��R�[�h�����O�C�����[�U�̍H��łȂ�
					bError = true;
				}
			}

			// �i�ڃ`�F�b�N
			readStructItem = readITEM(struct);
			if (readStructItem == null) {
				// �i�ڂ����݂��Ȃ�
				bError = true;
			} else {
				_LOT_CTRL_FLG = readStructItem.getLOT_CTRL_FLG();
				if(!"1".equals(getJOB_ODR_CD_STOCK_flg())){
					if("1".equals(_LOT_CTRL_FLG)){
						if(struct.getLOT_NO() == null || "".equals(struct.getLOT_NO())){
							 if(readStructItem.getLOT_NUMBERING_TYP()!=null 
            						 && "0".equals(readStructItem.getLOT_NUMBERING_TYP())){
                				 bError = true;                	              
                                 listMessage.add("M_ITEM.ITEM_CD:" + struct.getITEM_CD());
                                 // �݌Ƀ��b�g�ԍ������͂���Ă��܂���B
                                 setErrorMessage("AH60007", listMessage);
                                 listMessage.clear();
            				 }
						}
					} else {
	           			 if(struct.getLOT_NO()!=null && !"".equals(struct.getLOT_NO())){
	        				 bError = true;                	              
	                         listMessage.add("M_ITEM.ITEM_CD:" + struct.getITEM_CD());
	                         // �w�肵���i�ڂ͔񃍃b�g�Ǘ��i�ڂł��B
	                         setErrorMessage("AH60006", listMessage);
	                         listMessage.clear();
	        			 }
					}
				}
				// �i�ڂ��[���i�ڂ��ǂ����̃`�F�b�N
				if ("8".equals(readStructItem.getMRP_ODR_TYP())) {
					// �w�肳�ꂽ�i�ڂ��[���i��
					bError = true;

					listMessage.add("M_ITEM.ITEM_CD:" + struct.getITEM_CD());
					setErrorMessage("AH00028", listMessage);
					listMessage.clear();
				}
				// �i�ڂ̒I���敪��9�i�I�����Ȃ��j���ǂ����̃`�F�b�N
				if ("9".equals(readStructItem.getABC_TYP()) == true) {
					// �w�肳�ꂽ�i�ڂ̒I���敪��9�I�����Ȃ��j
					bError = true;

					listMessage.add("M_ITEM.ITEM_CD:" + struct.getITEM_CD());
					setErrorMessage("AH00016", listMessage);
					listMessage.clear();
				}

				// ���ԁi���ԍ݌Ɏw��t���O��ON�j
				if ("1".equals(getJOB_ODR_CD_STOCK_flg()) == true) {
					// MRP�n�i�ڂ��ǂ����̃`�F�b�N
					if (Calculate.compare(readStructItem.getMRP_ODR_TYP(), "3") == 1) {
						// �w�肳�ꂽ�i�ڂ�MRP�n�i��
						bError = true;

						listMessage.add("M_ITEM.ITEM_CD:" + struct.getITEM_CD());
						listMessage.add("M_ITEM.MRP_ODR_TYP:" + readStructItem.getMRP_ODR_TYP());
						setErrorMessage("AH00027", listMessage);
						listMessage.clear();

					}

					// ���v�ʂɑ��݂��邩�ǂ����̃`�F�b�N
					read_list = entity.mT_OD.read(conn, struct);
					if (read_list.size() <= 0) {
						listMessage.add("T_OD.JOB_ODR_CD:"+ struct.getJOB_ODR_CD());
						listMessage.add("T_OD.ITEM_CD:" + struct.getITEM_CD());
						listMessage.add("T_OD.PLANT_CD:" + struct.getPLANT_CD());
						setErrorMessage("AH00039", listMessage);
						listMessage.clear();

						// ���v�ʂɑ��݂��Ȃ�
						bError = true;
					}
				}

				// �i�ڏ��ݒ�
				struct.setITEM_NAME(readStructItem.getITEM_NAME());
				struct.setMRP_ODR_TYP(readStructItem.getMRP_ODR_TYP());
				struct.setUNIT_QTY_TYP(readStructItem.getUNIT_QTY_TYP());
				struct.setSTOCK_UNIT(readStructItem.getSTOCK_UNIT());
			}

			// �G���[���Ȃ��ꍇ
			if (bError != true) {
				// �f�[�^���݃`�F�b�N
				if ("1".equals(getJOB_ODR_CD_STOCK_flg())) {
					// ���ԁi���ԍ݌Ɏw��t���O��ON�j
					read_list = entity.mT_JOB_ODR_CD_INV.read(conn, struct);
				} else {
					// �i�ځi���ԍ݌Ɏw��t���O��OFF�j
					// �u�i�ڔԍ��v ��[�i��]�D���b�g�Ǘ��t���O���P
              	  	if("1".equals(_LOT_CTRL_FLG)){
              		  read_list = entity.mselect_T_LOT_NO.read(conn, struct);
            		  if(read_list.size() <= 0){
            			  List ACTUAL_STOCK_QTYlist = entity.mT_ITEM_INV.read(conn, struct);
            			  if(ACTUAL_STOCK_QTYlist.size() > 0){
            				  _ACTUAL_STOCK_QTY = ((AH0050010Struct)ACTUAL_STOCK_QTYlist.get(0)).getACTUAL_STOCK_QTY();
            			  }
            		  }
              	  	} else {
              	  		read_list = entity.mT_ITEM_INV.read(conn, struct);
              	  	} 
					
				}
				if (read_list.size() > 0) {
					// ���Ƀf�[�^�����݂��Ă����ꍇ
					bError = true;

					if ("1".equals(getJOB_ODR_CD_STOCK_flg())) {
						// ���ԁi���ԍ݌Ɏw��t���O��ON�j
						setErrorMessage("ZZ01102", keylistMessage);
					} else {
	            	    if("1".equals(_LOT_CTRL_FLG)){
	            		   keylistMessage.clear();
	                       keyMessage = "T_LOT_INV.INV_DATE:" +  struct.getINV_DATE()
	                       + ", T_LOT_INV.WH_CD:" +  struct.getWH_CD()
	                       + ", T_LOT_INV.ITEM_CD:" +  struct.getITEM_CD()
	                       + ", T_LOT_INV.PLANT_CD:" +  struct.getPLANT_CD()
	                       + ", T_LOT_INV.ACTUAL_STOCK_QTY:" +  struct.getACTUAL_STOCK_QTY();
	                       keylistMessage.add("T_LOT_INV.INV_DATE:" + struct.getINV_DATE());
	                       keylistMessage.add("T_LOT_INV.WH_CD:" + struct.getWH_CD());
	                       keylistMessage.add("T_LOT_INV.ITEM_CD:" + struct.getITEM_CD());
	                       keylistMessage.add("T_LOT_INV.ACTUAL_STOCK_QTY:" + struct.getACTUAL_STOCK_QTY());
	                     
	                       // �i�ځi���ԍ݌Ɏw��t���O��OFF�j
	                       setErrorMessage("ZZ01102", keylistMessage);
	            	    }else{
	                        // �i�ځi���ԍ݌Ɏw��t���O��OFF�j
	                        setErrorMessage("ZZ01102", keylistMessage);
	            	    }
					}
				} else {
                  // ���ԍ݌Ɏw��t���O��OFF
              	  if(!"1".equals(getJOB_ODR_CD_STOCK_flg())){
              		  if("1".equals(_LOT_CTRL_FLG)){
              			  if(structCopy.getLOT_NO()!=null && !"".equals(structCopy.getLOT_NO())){            				  
              				  List listCtrl = entity.mselect_T_LOT_CTRL_2.read(conn, struct);
                				 if(listCtrl!=null && listCtrl.size() >0){
             						if(Calculate.compare(((AH0050010Struct)listCtrl.get(0)).getLOT_DEL_FLG(), "1")==0){
                        				 if(readStructItem.getLOT_NUMBERING_TYP()!=null 
                     						 && !"0".equals(readStructItem.getLOT_NUMBERING_TYP())){
                         					 bError = true;   
                         					 create_Lot = "";
                         					 // ���b�g�Ǘ��ɓo�^����Ă��܂���i�����̔ԃ��b�g�Ǘ��i�ڂł��A�V�K���b�g�o�^����ꍇ�A�݌Ƀ��b�g�ԍ����󔒂ɂ��Ă��������B
                         					 setErrorMessage("AE00165");
                        				 }
             						}

	             					  // �Ɩ��^�p��
	                            	List temlist = entity.mSelect_SYS_DATE_CTRL.read(conn, struct);
	                            	if(!temlist.isEmpty()){
	                            		structCopy.setBUSINESS_OPR_DATE(((AH0050010Struct)temlist.get(0)).getBUSINESS_OPR_DATE());
	                            	}
                	                // [���b�g�Ǘ�]�D�g�ܖ������h���Ɩ��^�p���@�ꍇ
            						String str_before_date = ((AH0050010Struct)listCtrl.get(0)).getBEST_BEFORE_DATE();
        							if(str_before_date!=null){
        								if(str_before_date.compareTo(structCopy.getBUSINESS_OPR_DATE())<0){
            								//<�x��> AH60011 �y���͂��ꂽ�݌Ƀ��b�g�ԍ��͏ܖ������؂�ƂȂ��Ă��܂��B�z
            								setWarnMessage("AH60015","ITEM_CD :"+structCopy.getITEM_CD());
            								bError = true; 
            							}
        							}
        						    if(readStructItem.getLOT_NUMBERING_TYP()!=null && "0".equals(readStructItem.getLOT_NUMBERING_TYP())){
        						    	create_Lot = "update";
        						    }
                				 } else {
                					if(readStructItem.getLOT_NUMBERING_TYP()!=null && !"0".equals(readStructItem.getLOT_NUMBERING_TYP())){
                    					bError = true;   
                    					create_Lot = "";
                                        //  ���b�g�Ǘ��ɓo�^����Ă��܂���i�����̔ԃ��b�g�Ǘ��i�ڂł��A�V�K���b�g�o�^����ꍇ�A�݌Ƀ��b�g�ԍ����󔒂ɂ��Ă��������B
                    					setErrorMessage("AE00165");
                       				 } else if(readStructItem.getLOT_NUMBERING_TYP()!=null && "0".equals(readStructItem.getLOT_NUMBERING_TYP())){
                       					create_Lot = "create";
                       				 }
                				 }
              			  }     
          				 
               			 if(struct.getACTUAL_STOCK_QTY().equals("0.0")){              				 
               				 bError = true;   
               				 // ���b�g�Ǘ��i�ڂ̏ꍇ�A���I���ɂ�0�ȏ�̐��l����͂��ĉ������B
                             listMessage.add("M_ITEM.ITEM_CD:" + struct.getITEM_CD());
                             setErrorMessage("AH60010", listMessage);
                             listMessage.clear();
               			 }
              		  }
              	  }               
				}
			}

			if (bError != true) {
				// �I�����䑶�݁A�i�ڑ��݁A�ۊǋ悪���݂���ꍇ�̃`�F�b�N

				// �z�I����ON�̏ꍇ�̃`�F�b�N
				if ("1".equals(readStructInvCtrl.getCYCLE_INV_FLG())) {
					// �i�ڕʒI���T�C�N������i�ځA�H�ꂪ�������f�[�^������
					read_list = entity.mT_INV_CYCLE.read(conn, struct);
					if (read_list.size() <= 0) {
						// �i�ڕʒI���T�C�N���ɕi�ځA�H�ꂪ�������f�[�^�����݂��Ȃ�
						bError = true;

						listMessage.add("T_INV_CYCLE.ITEM_CD:" + struct.getITEM_CD());
						listMessage.add("T_INV_CYCLE.PLANT_CD:" + struct.getPLANT_CD());
						// ����I���Ώۃf�[�^�ł͂���܂���B
						setErrorMessage("AH00040", listMessage);
						listMessage.clear();
					} else {
						// �i�ڕʒI���T�C�N������ǂݍ��񂾃f�[�^�̎擾
						AH0050010Struct readStructInvCycle = (AH0050010Struct) read_list.get(0);

						// �I���T�C�N���̎��{�t���O�����X�g�f�[�^��
						List listInvFlg = new ArrayList(0);
						listInvFlg.add(readStructInvCycle.getINV_FLG_JAN());// �P��
						listInvFlg.add(readStructInvCycle.getINV_FLG_FEB());// �Q��
						listInvFlg.add(readStructInvCycle.getINV_FLG_MAR());// �R��
						listInvFlg.add(readStructInvCycle.getINV_FLG_APR());// �S��
						listInvFlg.add(readStructInvCycle.getINV_FLG_MAY());// �T��
						listInvFlg.add(readStructInvCycle.getINV_FLG_JUN());// �U��
						listInvFlg.add(readStructInvCycle.getINV_FLG_JUL());// �V��
						listInvFlg.add(readStructInvCycle.getINV_FLG_AUG());// �W��
						listInvFlg.add(readStructInvCycle.getINV_FLG_SEP());// �X��
						listInvFlg.add(readStructInvCycle.getINV_FLG_OCT());// �P�O��
						listInvFlg.add(readStructInvCycle.getINV_FLG_NOV());// �P�P��
						listInvFlg.add(readStructInvCycle.getINV_FLG_DEC());// �P�Q��

						// �I�����t�̌����擾
						DateConverter dateConv = new DateConverter();
						Date dateWork = dateConv.str2date(struct.getINV_DATE());
						Calendar cal = new GregorianCalendar();
						cal.setTime(dateWork);
						int intMonth = cal.get(Calendar.MONTH);

						// �I�������̒I�����{�t���O�̃`�F�b�N
						if (!"1".equals((String) listInvFlg.get(intMonth))) {
							// �I�����̌��̒I�����{�t���O��ON�łȂ�
							bError = true;

							listMessage.add("T_INV_CYCLE.ITEM_CD:" + struct.getITEM_CD());
							listMessage.add("T_INV_CYCLE.PLANT_CD:" + struct.getPLANT_CD());
							// ����I���Ώۃf�[�^�ł͂���܂���B
							setErrorMessage("AH00040", listMessage);
							listMessage.clear();
						}
					}
				}

				// �Վ��I����ON�̏ꍇ�̃`�F�b�N
				if ("1".equals(readStructInvCtrl.getTEMP_INV_FLG())) {
					// �I�������i�ڎw�肩��I�����A�H��A�i�ڂ��������f�[�^������
					List listInvTargetItem = entity.mT_INV_TARGET_ITEM.read(conn, struct);
					// �I�������ۊǋ�w�肩��I�����A�H��A�i�ڂ��������f�[�^������
					List listInvTargetWh = entity.mT_INV_TARGET_WH.read(conn, struct);
					if ((listInvTargetItem.size() <= 0) && (listInvTargetWh.size() <= 0)) {
						// �I�������i�ڎw��ɒI�����A�H��A�i�ڂ��������f�[�^�����݂��Ȃ�
						// ����ɁA�I�������ۊǋ�w��ɒI�����A�H��A�ۊǋ悪�������f�[�^�����݂��Ȃ�
						bError = true;

						listMessage.add("T_INV_TARGET_ITEM.ITEM_CD:" + struct.getITEM_CD());
						listMessage.add("T_INV_TARGET_WH.WH_CD:" + struct.getWH_CD());
						listMessage.add("INV_DATE:" + struct.getINV_DATE());
						listMessage.add("PLANT_CD:" + struct.getPLANT_CD());
						setErrorMessage("AH00040", listMessage);
						listMessage.clear();
					}
				}

			}

			// ���I���`�F�b�N
			if ("1".equals(struct.getUNIT_QTY_TYP())&& Calculate.isNumeric(struct.getACTUAL_STOCK_QTY())) {
				bError = true;
				listMessage.add("M_ITEM.ITEM_CD:" + struct.getITEM_CD());
				setErrorMessage("AH00029", listMessage);
				listMessage.clear();
			}

			// �G���[���Ȃ��ꍇ
			if (bError != true) {
				// �g�����U�N�V�����J�n
				conn.beginTransWeb();

				// DB�X�V���t���OON
				bDBUpdate = true;

				// �o�^���s
				// �u���ԍ݌Ɏw��v�̃`�F�b�N�L���ɂ�鏈��
				if ("1".equals(getJOB_ODR_CD_STOCK_flg())) {
					// ���ԁi���ԍ݌Ɏw��t���O��ON�j
					entity.mT_JOB_ODR_CD_INV.create(conn, struct);
				} else {
					// �i�ځi���ԍ݌Ɏw��t���O��OFF�j
	                if("1".equals(_LOT_CTRL_FLG)){            	
	                	if(readStructItem.getLOT_NUMBERING_TYP()!=null 
            					  && !"0".equals(readStructItem.getLOT_NUMBERING_TYP())){
            				  String lot = create_Lot(structCopy);
            				  if(lot==null){
            					  return;
            				  }
            			 }else{
            				  if(create_Lot.equals("create")){
            					  // [���b�g�Ǘ�]�̒ǉ����s��
                      			  struct.setBEST_BEFORE_DATE(get_Str_BEST_BEFORE_DATE(struct));
                      			  entity.mselect_T_LOT_CTRL.create(conn, struct);
                      			  keyMessage = "T_LOT_CTRL.ITEM_CD:" + struct.getITEM_CD()
                      			  			+ "T_LOT_CTRL.LOT_NO:" + struct.getLOT_NO();
                      			  //�݌Ƀ��b�g�ԍ������݂��Ȃ������̂ŁA�V�K�̔Ԃ��܂���
                      			  setInfoMessage("AH00049","");
                      			  setInfoMessage("ZZ01006",keyMessage);
            				  }else 
            					  // [���b�g�Ǘ�]�̍X�V���s��
            					  if(create_Lot.equals("update")){
                      				  entity.mupdate_T_LOT_CTRL.update(conn, struct);
            					  }
            			 }
	                	
                		 struct.setACTUAL_STOCK_QTY_1(Calculate.floor(struct.getACTUAL_STOCK_QTY(), 0));

						// ���b�g�ʕi�ڒI���̒ǉ����s��
						entity.mcreate_T_LOT_INV.create(conn, struct);
	                		 
                     	 if(_ACTUAL_STOCK_QTY != null){
                     		 // �ۊǋ�ʕi�ڒI���̍X�V���s��
                     		 String actualStockQty = Calculate.add(struct.getACTUAL_STOCK_QTY(),_ACTUAL_STOCK_QTY);
                     		 struct.setACTUAL_STOCK_QTY(actualStockQty);
                     		 entity.mT_ITEM_INV.update(conn, struct);
                     	 }else{
                     		// �ۊǋ�ʕi�ڒI���̒ǉ����s��
                     		entity.mT_ITEM_INV.create(conn, struct);
                     	 }
	                }else{
	                	// �ۊǋ�ʕi�ڒI���̒ǉ����s��
	                	entity.mT_ITEM_INV.create(conn, struct);
	                }      
	                  
				}

				// �R�~�b�g
				conn.commit();

				// DB�X�V���t���OOFF
				bDBUpdate = false;

				// �e��ʂ�struct�𕜋A
				loadParentStruct();

				// �o�^���������t���O�ݒ�
				bSuccess = true;
			}

		} catch (SQLException e) {
			setSqlExceptionMsg(e);

		} finally {
			String LotNo = struct.getLOT_NO();
			// DB�X�V�������ɉ��炩�̃G���[�����������ꍇ��roolback�������Ȃ�
			if (bDBUpdate == true) {
				// ���[���o�b�N
				conn.rollback();
				setSyslogConfig("Control�Fcontrolinsert_sub1 - rollback!! ");
			}

			if (bSuccess == true) {
                // [���b�g�Ǘ�]�D�g�ܖ������h���Ɩ��^�p���@�ꍇ
                try {
                  // �Ɩ��^�p��
              	  List temlist = entity.mSelect_SYS_DATE_CTRL.read(conn, struct);
              	  if(!temlist.isEmpty()){
              		  structCopy.setBUSINESS_OPR_DATE(((AH0050010Struct)temlist.get(0)).getBUSINESS_OPR_DATE());             				  
              	  }
				  List worklist = entity.mselect_T_LOT_CTRL_2.read(conn, structCopy);
					if(!worklist.isEmpty()){
						String str_before_date = ((AH0050010Struct)worklist.get(0)).getBEST_BEFORE_DATE();
						if(str_before_date!=null){
							if(str_before_date.compareTo(structCopy.getBUSINESS_OPR_DATE())<0){
								//<�x��> AH60011 �y���͂��ꂽ�݌Ƀ��b�g�ԍ��͏ܖ������؂�ƂȂ��Ă��܂��B�z
								setWarnMessage("AH60015","ITEM_CD :"+structCopy.getITEM_CD());
							}
						}
					}
				} catch (SQLException e) {
					setSqlExceptionMsg(e);
				}
			} else {
				// ��ʕ\�����ݒ�

				// ��ʕ\�����N���A
				struct.setw_INV_status("");
				struct.setSTOCK_SAVE_DATE("");
				struct.setWH_NAME("");
				struct.setITEM_NAME("");
				struct.setLOT_NO("");

				// ���Ԓ��I������f�[�^�����݂��Ȃ��ꍇ�A�I�����N���A
				if (bIsNotINV_CTRL == true) {
					struct.setINV_DATE("");
				}
				// �ŐV�I�������񔽉f
				if (readStructInvCtrl != null) {
					struct.setINV_DATE(readStructInvCtrl.getINV_DATE());
					struct.setw_INV_status(readStructInvCtrl.getw_INV_status());
					struct.setSTOCK_SAVE_DATE(readStructInvCtrl.getSTOCK_SAVE_DATE());							
				}
				// �ŐV�ۊǋ��񔽉f
				if (readStructWh != null) {
					struct.setWH_NAME(readStructWh.getWH_NAME());
				}
				// �ŐV�i�ڏ�񔽉f
				if (readStructItem != null) {
					struct.setITEM_NAME(readStructItem.getITEM_NAME());
				}
                if(LotNo!=null){
              	  struct.setLOT_NO(LotNo);
                }
			}
		}
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlinsert_sub1>
		logger.exiting("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlinsert_sub1");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlreturn_sub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0050");
		logger.entering("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub1");
			//{{user_implement_dev:<controlreturn_sub1>
                //---------------------------------------------------------------------
                // �q��ʂɑJ�ڂ���O�̐e��ʂ�struct�𕜋A
                loadParentStruct();
              
                // �ēǍ�����
                controlselect();
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlreturn_sub1>
		logger.exiting("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub1");

		return;
	}

	/**
	 * CSV�捞�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCsvImport() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0050");
		logger.entering("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlCsvImport");
			//{{user_implement_dev:<controlCsvImport>
                //---------------------------------------------------------------------
		// �ŐV�I��������Ǎ��p
		AH0050010Struct readStructInvCtrl = new AH0050010Struct();
		// �ŐV���Ԓ��I��������Ǎ��p
		AH0050010Struct readStructInvCtrl4StsTyp1 = new AH0050010Struct();

		try {
			// �G���[�t���O������
			boolean bError = false;

			// ���X�g�N���A
			list.clear();

			// �����Ɋ֘A����p�����[�^��ݒ�
			struct.setPLANT_CD(getsysPLANT_CD());

			// �I������f�[�^�̑��݃`�F�b�N
			readStructInvCtrl = readT_INV_CTRL(struct);
			if (readStructInvCtrl == null) {
				// �I������f�[�^�����݂��Ȃ�
				bError = true;
			} else {
				// �I�����Ԓ��f�[�^�̑��݃`�F�b�N
				readStructInvCtrl4StsTyp1 = readT_INV_CTRL_INV_STS_TYP1();
				if (readStructInvCtrl4StsTyp1 == null) {
					// �I�����Ԓ��f�[�^�����݂��Ȃ�
					bError = true;
				} else {
					// �ŐV�̊��Ԓ��I������ݒ�
					struct.setINV_DATE(readStructInvCtrl4StsTyp1.getINV_DATE());
				}
			}

			// �G���[���Ȃ��ꍇ
			if (bError != true) {
				// �e��ʂ�struct��ޔ�
				saveParentStruct();

				// �T�u2��ʏ�����
				struct.clear();

				// �e��ʂ̕\���l���R�s�[
				struct.setINV_DATE(_save_struct.getINV_DATE());

				// �T�u2��ʃG���[���X�g�N���A
				csvResultListClear();

				// �T�u��ʏ�����ԏ����R�s�[
				_copy_sub_struct.copy(struct);
			}

		} catch (SQLException e) {
			setSqlExceptionMsg(e);

		} finally {
			// ��ʕ\�����N���A
			struct.setw_INV_status("");
			struct.setSTOCK_SAVE_DATE("");

			// �ŐV�I�������񔽉f
			if (readStructInvCtrl4StsTyp1 != null) {
				struct.setw_INV_status(readStructInvCtrl4StsTyp1.getw_INV_status());
				struct.setSTOCK_SAVE_DATE(readStructInvCtrl4StsTyp1.getSTOCK_SAVE_DATE());
				struct.setREGULAR_INV_FLG(readStructInvCtrl4StsTyp1.getREGULAR_INV_FLG());
				struct.setCYCLE_INV_FLG(readStructInvCtrl4StsTyp1.getCYCLE_INV_FLG());
				struct.setTEMP_INV_FLG(readStructInvCtrl4StsTyp1.getTEMP_INV_FLG());
				struct.setINV_STS_TYP(readStructInvCtrl4StsTyp1.getINV_STS_TYP());
			} else if (readStructInvCtrl != null) {
				struct.setw_INV_status(readStructInvCtrl.getw_INV_status());
				struct.setSTOCK_SAVE_DATE(readStructInvCtrl.getSTOCK_SAVE_DATE());
				struct.setREGULAR_INV_FLG(readStructInvCtrl.getREGULAR_INV_FLG());
				struct.setCYCLE_INV_FLG(readStructInvCtrl.getCYCLE_INV_FLG());
				struct.setTEMP_INV_FLG(readStructInvCtrl.getTEMP_INV_FLG());
				struct.setINV_STS_TYP(readStructInvCtrl.getINV_STS_TYP());
			}
		}
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlCsvImport>
		logger.exiting("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlCsvImport");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlreturn_sub2() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0050");
		logger.entering("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub2");
			//{{user_implement_dev:<controlreturn_sub2>
                //---------------------------------------------------------------------
                // �q��ʂɑJ�ڂ���O�̐e��ʂ�struct�𕜋A
                loadParentStruct();
              
                // �N���A����
                controlclear();
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlreturn_sub2>
		logger.exiting("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub2");

		return;
	}

	/**
	 * �Q�ƃ{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlBrowse() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0050");
		logger.entering("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");
			//{{user_implement_dev:<controlBrowse>
                //}}user_implement_dev:<controlBrowse>
		logger.exiting("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");

		return;
	}

	/**
	 * �捞�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCsvIn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0050");
		logger.entering("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");
			//{{user_implement_dev:<controlCsvIn>
                //---------------------------------------------------------------------
        // ��ʏ�̓���̏�񂵂��T�u�~�b�g�ł��Ȃ����߁A�����ŉ�ʏ����\�����̒l���Đݒ�
        struct.setINV_DATE(_copy_sub_struct.getINV_DATE());
              
		// ���Y���̉ߋ��̎��ѓ��͂̐����`�F�b�N
		if(getSysParameter() == false){
			if(chkProcExecDate("2",struct.getINV_DATE(),struct.getINV_DATE()) == false){
				setErrorMessage2(ProcExecDateError);
				setErrorParameter2("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
				setErrorParameter2("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
				return;
			}
		}
								
        // �G���[�t���O������
	    boolean bError = false;	    
        _LOT_CTRL_FLG = null;
        _ACTUAL_STOCK_QTY = null;
	    // ��ʕ\���p�G���[���X�g�N���A
	    csvResultListClear();
	  
	    // �b�r�u�f�[�^�擾
	    List listCsv = readCsvData();
	    if(listCsv == null)
	    {
	     bError = true;
	    }
	    if(listCsv.size()>_MaxCsvTake){
	     this.setErrorMessage("AH00061");
	     bError = true;
	     return;
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
	     // ���������̏ꍇ�͑O��ʂ֖߂邽�߁A�߂鏈���������Ȃ�
	     controlreturn_sub2();
	    }
	    else {
	     // ���X�g�ɃG���[���e�Z�b�g
	     setList(_listResultMessageCsv);
	    }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlCsvIn>
		logger.exiting("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0050");
		logger.entering("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0050");
		logger.entering("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                      //------------------------------------------------------------------
		try {
			// ���b�g�Ǘ������σ`�F�b�N
			if (LotCtrl.checkLotCtrl(conn)) {
				lotCtrl = "true";
			} else {
				lotCtrl = "false";
			}
	        
	        /** �p�����[�^�u�I�����F�v���擾*//*
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
        	struct.seth_APR_INV_CTRL(aprInvCtrl);*/
		} catch (SQLException e) {
			ExpjMessage emsg = new ExpjMessage("ZZ01006", "(SBM1266)���b�g�Ǘ��������s���܂����B");
			msgStruct.addWarn(emsg);
			sysLog.info(emsg, getsysUSER_CD());
		}
		// �I���A�N�Z�b�T�N���X����
		_invAccessor = new InvAccessor(getsysPLANT_CD());

		// �N���A����
		controlclear();
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0050");
		logger.entering("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("update") ) {
				controlupdate();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("insert_sub1") ) {
				controlinsert_sub1();
			} else if( button.equals("return_sub1") ) {
				controlreturn_sub1();
			} else if( button.equals("CsvImport") ) {
				controlCsvImport();
			} else if( button.equals("return_sub2") ) {
				controlreturn_sub2();
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
			struct.seth_lotCtrl(lotCtrl);
        	struct.seth_APR_INV_CTRL(aprInvCtrl);
        	struct.seth_APRR_FLG(aprFlg);
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// �g���b�Z�[�W�o�͈˗��쐬
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AH0050010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0050010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AH0050010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0050010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AH0050010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0050010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AH0050010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AH0050010Entity entity;
	protected AH0050010Struct struct;
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

		entity = new AH0050010Entity();
		struct = new AH0050010Struct();

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
	 * AH0050010�N���X�̕W���R���X�g���N�^
	 */
	public AH0050010Control() throws BusinessProcessException, FoundationException
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
				AH0050010Struct key = (AH0050010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("w_INV_status") && key.getw_INV_status() != null) {
					msgKey.setKeyValue("w_INV_status", key.getw_INV_status());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_CD") && key.getw_ITEM_CD() != null) {
					msgKey.setKeyValue("w_ITEM_CD", key.getw_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("h_JOB_ODR_CD_STOCK_flg") && key.geth_JOB_ODR_CD_STOCK_flg() != null) {
					msgKey.setKeyValue("h_JOB_ODR_CD_STOCK_flg", key.geth_JOB_ODR_CD_STOCK_flg());
				}
				if(msgKeyType.containsKeyColumn("ERR_MSG") && key.getERR_MSG() != null) {
					msgKey.setKeyValue("ERR_MSG", key.getERR_MSG());
				}
				if(msgKeyType.containsKeyColumn("ERR_ADR") && key.getERR_ADR() != null) {
					msgKey.setKeyValue("ERR_ADR", key.getERR_ADR());
				}
				if(msgKeyType.containsKeyColumn("c_JOB_ODR_CD_STOCK_flg") && key.getc_JOB_ODR_CD_STOCK_flg() != null) {
					msgKey.setKeyValue("c_JOB_ODR_CD_STOCK_flg", key.getc_JOB_ODR_CD_STOCK_flg());
				}
				if(msgKeyType.containsKeyColumn("h_change_flg") && key.geth_change_flg() != null) {
					msgKey.setKeyValue("h_change_flg", key.geth_change_flg());
				}
				if(msgKeyType.containsKeyColumn("FileName") && key.getFileName() != null) {
					msgKey.setKeyValue("FileName", key.getFileName());
				}
				if(msgKeyType.containsKeyColumn("h_lotCtrl") && key.geth_lotCtrl() != null) {
					msgKey.setKeyValue("h_lotCtrl", key.geth_lotCtrl());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO_form") && key.getLOT_NO_form() != null) {
					msgKey.setKeyValue("LOT_NO_form", key.getLOT_NO_form());
				}
				if(msgKeyType.containsKeyColumn("h_APR_INV_CTRL") && key.geth_APR_INV_CTRL() != null) {
					msgKey.setKeyValue("h_APR_INV_CTRL", key.geth_APR_INV_CTRL());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("w_COLUMN_FLG") && key.getw_COLUMN_FLG() != null) {
					msgKey.setKeyValue("w_COLUMN_FLG", key.getw_COLUMN_FLG());
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
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("FINAL_BOOK_STOCK_QTY") && key.getFINAL_BOOK_STOCK_QTY() != null) {
					msgKey.setKeyValue("FINAL_BOOK_STOCK_QTY", key.getFINAL_BOOK_STOCK_QTY());
				}
				if(msgKeyType.containsKeyColumn("ACTUAL_STOCK_QTY") && key.getACTUAL_STOCK_QTY() != null) {
					msgKey.setKeyValue("ACTUAL_STOCK_QTY", key.getACTUAL_STOCK_QTY());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_JOB_ODR_CD") && key.getw_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("w_JOB_ODR_CD", key.getw_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("ABC_TYP") && key.getABC_TYP() != null) {
					msgKey.setKeyValue("ABC_TYP", key.getABC_TYP());
				}
				if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG") && key.getLOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("LOT_CTRL_FLG", key.getLOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("LOT_NUMBERING_TYP") && key.getLOT_NUMBERING_TYP() != null) {
					msgKey.setKeyValue("LOT_NUMBERING_TYP", key.getLOT_NUMBERING_TYP());
				}
				if(msgKeyType.containsKeyColumn("INV_FLG_JAN") && key.getINV_FLG_JAN() != null) {
					msgKey.setKeyValue("INV_FLG_JAN", key.getINV_FLG_JAN());
				}
				if(msgKeyType.containsKeyColumn("INV_FLG_FEB") && key.getINV_FLG_FEB() != null) {
					msgKey.setKeyValue("INV_FLG_FEB", key.getINV_FLG_FEB());
				}
				if(msgKeyType.containsKeyColumn("INV_FLG_MAR") && key.getINV_FLG_MAR() != null) {
					msgKey.setKeyValue("INV_FLG_MAR", key.getINV_FLG_MAR());
				}
				if(msgKeyType.containsKeyColumn("INV_FLG_APR") && key.getINV_FLG_APR() != null) {
					msgKey.setKeyValue("INV_FLG_APR", key.getINV_FLG_APR());
				}
				if(msgKeyType.containsKeyColumn("INV_FLG_MAY") && key.getINV_FLG_MAY() != null) {
					msgKey.setKeyValue("INV_FLG_MAY", key.getINV_FLG_MAY());
				}
				if(msgKeyType.containsKeyColumn("INV_FLG_JUN") && key.getINV_FLG_JUN() != null) {
					msgKey.setKeyValue("INV_FLG_JUN", key.getINV_FLG_JUN());
				}
				if(msgKeyType.containsKeyColumn("INV_FLG_JUL") && key.getINV_FLG_JUL() != null) {
					msgKey.setKeyValue("INV_FLG_JUL", key.getINV_FLG_JUL());
				}
				if(msgKeyType.containsKeyColumn("INV_FLG_AUG") && key.getINV_FLG_AUG() != null) {
					msgKey.setKeyValue("INV_FLG_AUG", key.getINV_FLG_AUG());
				}
				if(msgKeyType.containsKeyColumn("INV_FLG_SEP") && key.getINV_FLG_SEP() != null) {
					msgKey.setKeyValue("INV_FLG_SEP", key.getINV_FLG_SEP());
				}
				if(msgKeyType.containsKeyColumn("INV_FLG_OCT") && key.getINV_FLG_OCT() != null) {
					msgKey.setKeyValue("INV_FLG_OCT", key.getINV_FLG_OCT());
				}
				if(msgKeyType.containsKeyColumn("INV_FLG_NOV") && key.getINV_FLG_NOV() != null) {
					msgKey.setKeyValue("INV_FLG_NOV", key.getINV_FLG_NOV());
				}
				if(msgKeyType.containsKeyColumn("INV_FLG_DEC") && key.getINV_FLG_DEC() != null) {
					msgKey.setKeyValue("INV_FLG_DEC", key.getINV_FLG_DEC());
				}
				if(msgKeyType.containsKeyColumn("PAST_RESULT_ENTRY_TYP") && key.getPAST_RESULT_ENTRY_TYP() != null) {
					msgKey.setKeyValue("PAST_RESULT_ENTRY_TYP", key.getPAST_RESULT_ENTRY_TYP());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO") && key.getLOT_NO() != null) {
					msgKey.setKeyValue("LOT_NO", key.getLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT_1") && key.getMODIFY_COUNT_1() != null) {
					msgKey.setKeyValue("MODIFY_COUNT_1", key.getMODIFY_COUNT_1());
				}
				if(msgKeyType.containsKeyColumn("TItemInvACTUALSTOCKQTY") && key.getTItemInvACTUALSTOCKQTY() != null) {
					msgKey.setKeyValue("TItemInvACTUALSTOCKQTY", key.getTItemInvACTUALSTOCKQTY());
				}
				if(msgKeyType.containsKeyColumn("ACTUAL_STOCK_QTY_1") && key.getACTUAL_STOCK_QTY_1() != null) {
					msgKey.setKeyValue("ACTUAL_STOCK_QTY_1", key.getACTUAL_STOCK_QTY_1());
				}
				if(msgKeyType.containsKeyColumn("lotNoitemcd") && key.getlotNoitemcd() != null) {
					msgKey.setKeyValue("lotNoitemcd", key.getlotNoitemcd());
				}
				if(msgKeyType.containsKeyColumn("lotNoitemname") && key.getlotNoitemname() != null) {
					msgKey.setKeyValue("lotNoitemname", key.getlotNoitemname());
				}
				if(msgKeyType.containsKeyColumn("lotNowhcd") && key.getlotNowhcd() != null) {
					msgKey.setKeyValue("lotNowhcd", key.getlotNowhcd());
				}
				if(msgKeyType.containsKeyColumn("lotNoqty") && key.getlotNoqty() != null) {
					msgKey.setKeyValue("lotNoqty", key.getlotNoqty());
				}
				if(msgKeyType.containsKeyColumn("lotNoactual") && key.getlotNoactual() != null) {
					msgKey.setKeyValue("lotNoactual", key.getlotNoactual());
				}
				if(msgKeyType.containsKeyColumn("lotNostockunit") && key.getlotNostockunit() != null) {
					msgKey.setKeyValue("lotNostockunit", key.getlotNostockunit());
				}
				if(msgKeyType.containsKeyColumn("lotNounitqty") && key.getlotNounitqty() != null) {
					msgKey.setKeyValue("lotNounitqty", key.getlotNounitqty());
				}
				if(msgKeyType.containsKeyColumn("lotNomodify") && key.getlotNomodify() != null) {
					msgKey.setKeyValue("lotNomodify", key.getlotNomodify());
				}
				if(msgKeyType.containsKeyColumn("lotNolotno") && key.getlotNolotno() != null) {
					msgKey.setKeyValue("lotNolotno", key.getlotNolotno());
				}
				if(msgKeyType.containsKeyColumn("BEST_BEFORE_DATE") && key.getBEST_BEFORE_DATE() != null) {
					msgKey.setKeyValue("BEST_BEFORE_DATE", key.getBEST_BEFORE_DATE());
				}
				if(msgKeyType.containsKeyColumn("LOT_DEL_FLG") && key.getLOT_DEL_FLG() != null) {
					msgKey.setKeyValue("LOT_DEL_FLG", key.getLOT_DEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("ACTUAL_STOCK_QTY_2") && key.getACTUAL_STOCK_QTY_2() != null) {
					msgKey.setKeyValue("ACTUAL_STOCK_QTY_2", key.getACTUAL_STOCK_QTY_2());
				}
				if(msgKeyType.containsKeyColumn("h_APRR_FLG") && key.geth_APRR_FLG() != null) {
					msgKey.setKeyValue("h_APRR_FLG", key.geth_APRR_FLG());
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
					AH0050010Struct key = new AH0050010Struct();
					if(msgKeyType.containsKeyColumn("w_INV_status")) {
						key.setw_INV_status(msgKey.getKeyValue("w_INV_status"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_CD")) {
						key.setw_ITEM_CD(msgKey.getKeyValue("w_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_JOB_ODR_CD_STOCK_flg")) {
						key.seth_JOB_ODR_CD_STOCK_flg(msgKey.getKeyValue("h_JOB_ODR_CD_STOCK_flg"));
					}
					if(msgKeyType.containsKeyColumn("ERR_MSG")) {
						key.setERR_MSG(msgKey.getKeyValue("ERR_MSG"));
					}
					if(msgKeyType.containsKeyColumn("ERR_ADR")) {
						key.setERR_ADR(msgKey.getKeyValue("ERR_ADR"));
					}
					if(msgKeyType.containsKeyColumn("c_JOB_ODR_CD_STOCK_flg")) {
						key.setc_JOB_ODR_CD_STOCK_flg(msgKey.getKeyValue("c_JOB_ODR_CD_STOCK_flg"));
					}
					if(msgKeyType.containsKeyColumn("h_change_flg")) {
						key.seth_change_flg(msgKey.getKeyValue("h_change_flg"));
					}
					if(msgKeyType.containsKeyColumn("FileName")) {
						key.setFileName(msgKey.getKeyValue("FileName"));
					}
					if(msgKeyType.containsKeyColumn("h_lotCtrl")) {
						key.seth_lotCtrl(msgKey.getKeyValue("h_lotCtrl"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO_form")) {
						key.setLOT_NO_form(msgKey.getKeyValue("LOT_NO_form"));
					}
					if(msgKeyType.containsKeyColumn("h_APR_INV_CTRL")) {
						key.seth_APR_INV_CTRL(msgKey.getKeyValue("h_APR_INV_CTRL"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("w_COLUMN_FLG")) {
						key.setw_COLUMN_FLG(msgKey.getKeyValue("w_COLUMN_FLG"));
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
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("FINAL_BOOK_STOCK_QTY")) {
						key.setFINAL_BOOK_STOCK_QTY(msgKey.getKeyValue("FINAL_BOOK_STOCK_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ACTUAL_STOCK_QTY")) {
						key.setACTUAL_STOCK_QTY(msgKey.getKeyValue("ACTUAL_STOCK_QTY"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_JOB_ODR_CD")) {
						key.setw_JOB_ODR_CD(msgKey.getKeyValue("w_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ABC_TYP")) {
						key.setABC_TYP(msgKey.getKeyValue("ABC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG")) {
						key.setLOT_CTRL_FLG(msgKey.getKeyValue("LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NUMBERING_TYP")) {
						key.setLOT_NUMBERING_TYP(msgKey.getKeyValue("LOT_NUMBERING_TYP"));
					}
					if(msgKeyType.containsKeyColumn("INV_FLG_JAN")) {
						key.setINV_FLG_JAN(msgKey.getKeyValue("INV_FLG_JAN"));
					}
					if(msgKeyType.containsKeyColumn("INV_FLG_FEB")) {
						key.setINV_FLG_FEB(msgKey.getKeyValue("INV_FLG_FEB"));
					}
					if(msgKeyType.containsKeyColumn("INV_FLG_MAR")) {
						key.setINV_FLG_MAR(msgKey.getKeyValue("INV_FLG_MAR"));
					}
					if(msgKeyType.containsKeyColumn("INV_FLG_APR")) {
						key.setINV_FLG_APR(msgKey.getKeyValue("INV_FLG_APR"));
					}
					if(msgKeyType.containsKeyColumn("INV_FLG_MAY")) {
						key.setINV_FLG_MAY(msgKey.getKeyValue("INV_FLG_MAY"));
					}
					if(msgKeyType.containsKeyColumn("INV_FLG_JUN")) {
						key.setINV_FLG_JUN(msgKey.getKeyValue("INV_FLG_JUN"));
					}
					if(msgKeyType.containsKeyColumn("INV_FLG_JUL")) {
						key.setINV_FLG_JUL(msgKey.getKeyValue("INV_FLG_JUL"));
					}
					if(msgKeyType.containsKeyColumn("INV_FLG_AUG")) {
						key.setINV_FLG_AUG(msgKey.getKeyValue("INV_FLG_AUG"));
					}
					if(msgKeyType.containsKeyColumn("INV_FLG_SEP")) {
						key.setINV_FLG_SEP(msgKey.getKeyValue("INV_FLG_SEP"));
					}
					if(msgKeyType.containsKeyColumn("INV_FLG_OCT")) {
						key.setINV_FLG_OCT(msgKey.getKeyValue("INV_FLG_OCT"));
					}
					if(msgKeyType.containsKeyColumn("INV_FLG_NOV")) {
						key.setINV_FLG_NOV(msgKey.getKeyValue("INV_FLG_NOV"));
					}
					if(msgKeyType.containsKeyColumn("INV_FLG_DEC")) {
						key.setINV_FLG_DEC(msgKey.getKeyValue("INV_FLG_DEC"));
					}
					if(msgKeyType.containsKeyColumn("PAST_RESULT_ENTRY_TYP")) {
						key.setPAST_RESULT_ENTRY_TYP(msgKey.getKeyValue("PAST_RESULT_ENTRY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO")) {
						key.setLOT_NO(msgKey.getKeyValue("LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT_1")) {
						key.setMODIFY_COUNT_1(msgKey.getKeyValue("MODIFY_COUNT_1"));
					}
					if(msgKeyType.containsKeyColumn("TItemInvACTUALSTOCKQTY")) {
						key.setTItemInvACTUALSTOCKQTY(msgKey.getKeyValue("TItemInvACTUALSTOCKQTY"));
					}
					if(msgKeyType.containsKeyColumn("ACTUAL_STOCK_QTY_1")) {
						key.setACTUAL_STOCK_QTY_1(msgKey.getKeyValue("ACTUAL_STOCK_QTY_1"));
					}
					if(msgKeyType.containsKeyColumn("lotNoitemcd")) {
						key.setlotNoitemcd(msgKey.getKeyValue("lotNoitemcd"));
					}
					if(msgKeyType.containsKeyColumn("lotNoitemname")) {
						key.setlotNoitemname(msgKey.getKeyValue("lotNoitemname"));
					}
					if(msgKeyType.containsKeyColumn("lotNowhcd")) {
						key.setlotNowhcd(msgKey.getKeyValue("lotNowhcd"));
					}
					if(msgKeyType.containsKeyColumn("lotNoqty")) {
						key.setlotNoqty(msgKey.getKeyValue("lotNoqty"));
					}
					if(msgKeyType.containsKeyColumn("lotNoactual")) {
						key.setlotNoactual(msgKey.getKeyValue("lotNoactual"));
					}
					if(msgKeyType.containsKeyColumn("lotNostockunit")) {
						key.setlotNostockunit(msgKey.getKeyValue("lotNostockunit"));
					}
					if(msgKeyType.containsKeyColumn("lotNounitqty")) {
						key.setlotNounitqty(msgKey.getKeyValue("lotNounitqty"));
					}
					if(msgKeyType.containsKeyColumn("lotNomodify")) {
						key.setlotNomodify(msgKey.getKeyValue("lotNomodify"));
					}
					if(msgKeyType.containsKeyColumn("lotNolotno")) {
						key.setlotNolotno(msgKey.getKeyValue("lotNolotno"));
					}
					if(msgKeyType.containsKeyColumn("BEST_BEFORE_DATE")) {
						key.setBEST_BEFORE_DATE(msgKey.getKeyValue("BEST_BEFORE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("LOT_DEL_FLG")) {
						key.setLOT_DEL_FLG(msgKey.getKeyValue("LOT_DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ACTUAL_STOCK_QTY_2")) {
						key.setACTUAL_STOCK_QTY_2(msgKey.getKeyValue("ACTUAL_STOCK_QTY_2"));
					}
					if(msgKeyType.containsKeyColumn("h_APRR_FLG")) {
						key.seth_APRR_FLG(msgKey.getKeyValue("h_APRR_FLG"));
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
