/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KM0020/src/com/nec/jp/orteus/metamorBase/KM0020/KM0020010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KM0020;

import com.nec.jp.orteus.metamorBase.KM0020.*;
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
	// TODO: ������import�p�b�P�[�W���L�q���Ă�������
import com.nec.jp.orteus.metamorBase.common06.ExchAmount.ExchAmount;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : KM0020010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.4 $ $Date: 2014/11/05 07:29:13 $
 *
 */
//}}user_implement_code_header

public class KM0020010Control
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
//	public Object getListvalue(int x) { return this.list.get(x); }	// ���X�g�̒l��Ԃ��܂��B
	public KM0020010Struct getListvalue(int x) { return (KM0020010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public KM0020010Struct getStruct() { return this.struct; }	// Struct�̒l��Ԃ��܂��B
	public KM0020010Struct createStruct() { return new KM0020010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((KM0020010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
	//------------------------------------------------------------------------------
	public String Message = "";
	public int DelCnt = 0;
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
     * �G���[���b�Z�[�W�ݒ�
     * @param ���b�Z�[�W�ԍ�
     * @param �o�̓��b�Z�[�W
     */
    private void setErrorMessage(String messageno, String message)
    {
     ExpjMessage emsg = new ExpjMessage( messageno ,message);
     msgStruct.addError( emsg );
     sysLog.warning(emsg, getsysUSER_CD());
     emsg = new ExpjMessage( "ZZ01006", message );
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
     ExpjMessage emsg = new ExpjMessage( messageno ,message);
     msgStruct.addWarn( emsg );
     sysLog.info(emsg, getsysUSER_CD());
    }
    // �R���{�{�b�N�X�̐����擾�i������j
 	public String multcombo(String comname,String value) throws BusinessProcessException, FoundationException {
 		try {
 			ComboBox com = new ComboBox(conn, sysUSER_CD);
 			ComboStruct _comstruct = new ComboStruct();
 			_comstruct = com.getData(comname);
 			for (int j = 0; j < _comstruct.size(); j++) {
 				if ((_comstruct.getData(j)[0]).equals(value)) {
 					return _comstruct.getData(j)[1];
 				}
 			}
 			return null;
 		}catch(Exception e) {
 			setReadStatus(ERROR);
 			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
 			sysLog.severe(emsg, getsysUSER_CD());
 			ExpjException ee = new ExpjException(e, emsg);
 			ee.setLocale(CoreTools.getLocale(sysUSER_CD));
 			throw ee;
 		}
 	}
 	//------------------------------------------------------------------------------
    /** �q�ːe�ɉ�ʑJ�ڂ����ꍇ�̃L�[���ێ��ׂ̈�Struct */
    private KM0020010Struct _keyStruct = new KM0020010Struct();
   
    /** �L�[���Struct�̎擾 */
    public KM0020010Struct getKeyStruct(){ return _keyStruct; }
   
    /** �L�[���Struct�̐ݒ� */
    public void setKeyStruct(KM0020010Struct struct){ _keyStruct.keycopy(struct); }
    
    /** ��ʑJ�ڃL�[(�Č��ԍ�) */
	private String _ProjectCd;
	/** ��ʑJ�ڃL�[(���ϔԍ�) */
	private String _EstimateNo;
	/**
	 * ��ʑJ�ڃL�[(�Č��ԍ�)�擾
	 * @return�Č��ԍ�
	 */
	public String getProjectCd() {
		return _ProjectCd;
	}
	/**
	 * ��ʑJ�ڃL�[(���ϔԍ�)�擾
	 * @return�Č��ԍ�
	 */
	public String getEstimateNo() {
		return _EstimateNo;
	}
	/**
	 * ��ʑJ�ڃL�[(�Č��ԍ�)�ݒ�
	 * @param cd �Č��ԍ�
	 */
	public void settProjectCd(String no) {
		_ProjectCd = no;
	}
	/**
	 * ��ʑJ�ڃL�[(���ϔԍ�)�ݒ�
	 * @param cd ���ϔԍ�
	 */
	public void setEstimateNo(String no) {
		_EstimateNo = no;
	}
    /**
     * �o�c�e�o�͗p���X�g
     */
    private List pdfList;
    
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
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			// ���X�g�N���A
			if(list != null){
				list.clear();
			}
			DelCnt = 0;
			setReadStatus(INITIAL);
			struct.setPROJECT_NAME(""); //[�Č�].�g�Č����h
			struct.seth_MAX_DETAL_NO("0"); //���הԍ��ő�l(��\��)
			//�Č����݃`�F�b�N
			List listProject = entity.mSelectT_PROJECT.read(conn, struct);
			if (listProject == null || listProject.size() != 1) {
				// �Ǎ��������s�F�Č������݂��܂���B
				Message = "T_PROJECT.PROJECT_CD:" + struct.getPROJECT_CD();
				setErrorMessage("KM00001", Message);
				setReadStatus(ERROR);
				return;
			}else{
				struct.setPROJECT_NAME(((KM0020010Struct)listProject.get(0)).getPROJECT_NAME()); //[�Č�].�g�Č����h
				struct.seth_CUST_CD(((KM0020010Struct)listProject.get(0)).geth_CUST_CD()); //[���Ӑ�].�g���Ӑ�h
				struct.setMODIFY_COUNT_PJ(((KM0020010Struct)listProject.get(0)).getMODIFY_COUNT_PJ()); //[�Č�].�g�X�V���h
			}
			//���Ӑ摶�݃`�F�b�N
			List listMCust = entity.mSelectM_CUST.read(conn, struct);
			if (listMCust == null || listMCust.size() != 1) {
				// �Ǎ��������s�F���Ӑ�R�[�h�����݂��Ȃ��B
				Message = "M_CUST.CUST_CD:" + struct.geth_CUST_CD();
				setErrorMessage("KQ00014", Message);
				setReadStatus(ERROR);
				return;
			}else{
				struct.seth_CUR_CD(((KM0020010Struct)listMCust.get(0)).geth_CUR_CD()); //[�ʉ�].�g�ʉ݃R�[�h�h
			}
			//�ʉ݃R�[�h�`�F�b�N
			List listMCur = entity.mSelectM_CUR.read(conn, struct);
			if (listMCur == null || listMCur.size() != 1) {
				// �Ǎ��������s�F�ʉ݃R�[�h�����݂��Ȃ��B
				Message = "M_CUR.CUR_CD:" + struct.geth_CUR_CD();
				setErrorMessage("KQ00073", Message);
				setReadStatus(ERROR);
				return;
			}
			struct.setPROJECT_STAT(((KM0020010Struct)listProject.get(0)).getPROJECT_STAT()); //[�Č�].�g�Č��X�e�[�^�X�h
			struct.setCUST_NAME(((KM0020010Struct)listMCust.get(0)).getCUST_NAME()); //[���Ӑ�].�g���Ӑ於�h
			struct.setCUR_UNIT(((KM0020010Struct)listMCur.get(0)).getCUR_UNIT()); //[�ʉ�].�g�ʉݒP�ʁh
			//�Č��X�e�[�^�X�������̏ꍇ
			if ("1".equals(struct.getPROJECT_STAT())){
				struct.setESTIMATE_STAT(this.multcombo("ESTIMATE_STAT","0")); //�g���σX�e�[�^�X�h
				struct.setESTIMATE_DATE(struct.getBUSINESS_DATE()); //�g���ϓ��h
				struct.setES_USER_CD(((KM0020010Struct)listProject.get(0)).getES_USER_CD()); //[�Č�].�g�Č��S���҃R�[�h�h
				struct.setES_ORG_CD(((KM0020010Struct)listProject.get(0)).getES_ORG_CD()); //[�Č�].�g�Č��S������R�[�h�h
				struct.setUSER_NAME(((KM0020010Struct)listProject.get(0)).getUSER_NAME()); //[�Č�].�g�Č��S���҃R�[�h�h���A[���[�U�}�X�^].�g���[�U���h
				struct.setORG_NAME(((KM0020010Struct)listProject.get(0)).getORG_NAME()); //[�Č�].�g�Č��S������R�[�h�h���[����].�g���喼�h
				struct.setESTIMATE_NO("0"); //[����].�g���ϔԍ��h
				//�����KM00010 �y���ς����݂��܂���B�z
				Message = "T_PROJECT.PROJECT_CD:" + struct.getPROJECT_CD();
				setWarnMessage("KM00010", Message);
			}else{
				struct.seth_PROJECT_CD(struct.getPROJECT_CD());
				//�Č��X�e�[�^�X�������ȊO�̏ꍇ
				//���ϔԍ���0�̏ꍇ�A�ő匩�ϔԍ����擾
				if ("0".equals(struct.getESTIMATE_NO())){
					List listEstimate = entity.mSelectT_ESTIMATE.read(conn, struct);
					if (listEstimate.size() > 0) {
						struct.seth_ESTIMATE_NO(((KM0020010Struct)listEstimate.get(0)).geth_ESTIMATE_NO()); //[����].�g���ϔԍ��h
						struct.setESTIMATE_NO(struct.geth_ESTIMATE_NO()); //[����].�g���ϔԍ��h
					}
				}else{
					struct.seth_ESTIMATE_NO(struct.getESTIMATE_NO()); //[����].�g���ϔԍ��h
				}
				//���σw�b�_�̎擾
				List listHead = entity.mSelectHEAD.read(conn, struct);
				if (listHead.size() > 0) {
					struct.setESTIMATE_ST(((KM0020010Struct)listHead.get(0)).getESTIMATE_STAT());
					struct.setESTIMATE_STAT(this.multcombo("ESTIMATE_STAT",((KM0020010Struct)listHead.get(0)).getESTIMATE_STAT())); //[����].�g���σX�e�[�^�X�h
					struct.setESTIMATE_DATE(((KM0020010Struct)listHead.get(0)).getESTIMATE_DATE()); //[����].�g���ϓ��h
					//[����].�g������́h
					if ("1".equals(((KM0020010Struct)listHead.get(0)).getUNOFFICIAL_RECEIPT_FLG())){
						//�`�F�b�NOn
						struct.setUNOFFICIAL_RECEIPT_FLG("true");
					}else{
						struct.setUNOFFICIAL_RECEIPT_FLG("false");
					}
					struct.seth_UNOFFICIAL_RECEIPT_FLAG(((KM0020010Struct)listHead.get(0)).getUNOFFICIAL_RECEIPT_FLG());
					struct.setESTIMATE_AMOUNT(((KM0020010Struct)listHead.get(0)).getESTIMATE_AMOUNT()); //[����].�g���ϋ��z���v�h
					struct.setESTIMATE_AMOUNT_JPN(((KM0020010Struct)listHead.get(0)).getESTIMATE_AMOUNT_JPN()); //[����].�g���ϋ��z���v�i�M�݁j�h
					struct.setES_COMMET1(((KM0020010Struct)listHead.get(0)).getES_COMMET1()); //[����].�g�w��[���h
					struct.setES_COMMET2(((KM0020010Struct)listHead.get(0)).getES_COMMET2()); //[����].�g�[�i�ꏊ�h
					struct.setES_COMMET4(((KM0020010Struct)listHead.get(0)).getES_COMMET4()); //[����].�g���x�������h
					struct.setES_COMMET3(((KM0020010Struct)listHead.get(0)).getES_COMMET3()); //[����].�g�ב��^����h
					struct.setES_COMMET5(((KM0020010Struct)listHead.get(0)).getES_COMMET5()); //[����].�g���ϗL�������h
					struct.setES_USER_CD(((KM0020010Struct)listHead.get(0)).getES_USER_CD()); //[����].�g���ϒS���҃R�[�h�h
					struct.setUSER_NAME(((KM0020010Struct)listHead.get(0)).getUSER_NAME()); //[����].�g���ϒS���Җ��h
					struct.setES_ORG_CD(((KM0020010Struct)listHead.get(0)).getES_ORG_CD()); //[����].�g���ϒS������R�[�h�h
					struct.setORG_NAME(((KM0020010Struct)listHead.get(0)).getORG_NAME()); //[����].�g���喼�h
					struct.setZIP_CD(((KM0020010Struct)listHead.get(0)).getZIP_CD()); //[����].�g�X�֔ԍ��h
					struct.setADDRESS_1(((KM0020010Struct)listHead.get(0)).getADDRESS_1()); //[����].�g�Z��1�h
					struct.setADDRESS_2(((KM0020010Struct)listHead.get(0)).getADDRESS_2()); //[����].�g�Z��2�h
					struct.setTEL(((KM0020010Struct)listHead.get(0)).getTEL()); //[����].�g�d�b�ԍ��h
					struct.setESREMARK1(((KM0020010Struct)listHead.get(0)).getESREMARK1()); //[����].�g���l1�h
					struct.setESREMARK2(((KM0020010Struct)listHead.get(0)).getESREMARK2()); //[����].�g���l2�h
					struct.setESREMARK3(((KM0020010Struct)listHead.get(0)).getESREMARK3()); //[����].�g���l3�h
					struct.setMODIFY_COUNT_ES(((KM0020010Struct)listHead.get(0)).getMODIFY_COUNT_ES()); //[����].�g�X�V���h
				}else{
					Message = "T_PROJECT.PROJECT_CD:" + struct.getPROJECT_CD();
					setErrorMessage("KM00010", Message);
					return;
				}
				 // �\���ő�s����������
				if(struct.getROW_COUNT() != null){
					list = entity.mSelectDETAIL_COUNT.read(conn, struct);
				    int maxLine = Integer.parseInt(struct.getROW_COUNT());
					long rowCount = Long.parseLong(((KM0020010Struct)list.get(0)).getl_COUNT());
					if (rowCount == maxLine + 1) {
		 				this.list.clear();
		 				ExpjMessage emsg = new ExpjMessage("ZZ01119", "" + maxLine);
						msgStruct.addError(emsg); // �G���[���b�Z�[�W�Ƃ��ēo�^
						sysLog.warning(emsg, getsysUSER_CD()); // �G���[���e
		 				setReadStatus(TOO_MANY);
		 				if (list != null && list.size() > 0) {
		 					list.clear();
		 				}
		 				return;
		 			}
				}
				//���הԍ��ő�l���擾
				List listMax = entity.mSelectMAX_DETAIL_NO.read(conn, struct);
				if (listMax.size() > 0) {
					struct.seth_MAX_DETAL_NO(((KM0020010Struct)listMax.get(0)).geth_MAX_DETAL_NO()); //���הԍ��ő�l(��\��)
				}
				//���ϖ��ׂ̎擾
				list = entity.mSelectDETAIL.read(conn, struct);
				if (listHead.size() > 0) {
					KM0020010Struct TempStruct;
					for (int i = 0; i < this.list.size(); i++) {
						TempStruct = (KM0020010Struct)list.get(i);
						TempStruct.setl_CUR_UNIT(struct.getCUR_UNIT()); //[�ʉ�].�g�ʉݒP�ʁh
						TempStruct.setl_ESTIMATE_NAME(this.multcombo("ESTIMATE_TYPE",TempStruct.getl_ESTIMATE_TYP())); //[���ϖ���].�g��z�i�ڎ�h
						TempStruct.setl_SPEC_CLASS1_NAME(this.multcombo("SPEC_CLASS_01",TempStruct.getl_SPEC_CLASS1_TYP())); //[���ϖ���].�g���i�I��1�h
						TempStruct.setl_SPEC_CLASS2_NAME(this.multcombo("SPEC_CLASS_02",TempStruct.getl_SPEC_CLASS2_TYP())); //[���ϖ���].�g���i�I��2�h
						TempStruct.setl_SPEC_SELECT1_NAME(this.multcombo("SPEC_SELECT_01",TempStruct.getl_SPEC_SELECT1_TYP())); //[���ϖ���].�g�d�l�I��1�h
						TempStruct.setl_SPEC_SELECT2_NAME(this.multcombo("SPEC_SELECT_02",TempStruct.getl_SPEC_SELECT2_TYP())); //[���ϖ���].�g�d�l�I��2�h
						TempStruct.setl_SPEC_SELECT3_NAME(this.multcombo("SPEC_SELECT_03",TempStruct.getl_SPEC_SELECT3_TYP())); //[���ϖ���].�g�d�l�I��3�h
						TempStruct.setl_SPEC_SELECT4_NAME(this.multcombo("SPEC_SELECT_04",TempStruct.getl_SPEC_SELECT4_TYP())); //[���ϖ���].�g�d�l�I��4�h
						TempStruct.setl_FLAG("0"); //�o�^�X�V�t���O(��\��)
					}
				}
			}
			if (list != null){
				struct.setLIST_CNT(Integer.toString(list.size()));
			}else{
				struct.setLIST_CNT("0");
			}
			setReadStatus(NORMAL);
		} catch(SQLException e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			setReadStatus(ERROR);
			setSqlExceptionMsg(e);
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * ���׍��v�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlTotal() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlTotal");
			//{{user_implement_dev:<controlTotal>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		KM0020010Struct TempStruct;
		String SumEstimateAmount = "0.00";
		String SumEstimateAmountJpn = "0.00";
		if(list == null || list.size() == 0){
		}else{
			for (int i = 0; i < this.list.size(); i++) {
				TempStruct = (KM0020010Struct)list.get(i);
				//���ϋ��z���v��[���]�̖��׈ꗗ.�g���ϋ��z�h�����v���Đݒ�
				SumEstimateAmount = Calculate.add(SumEstimateAmount, TempStruct.getl_ESTIMATE_AMOUNT()); //���׈ꗗ.�g���ϋ��z�h	
				//���ϋ��z�i�M�݁j���v��[���]�̖��׈ꗗ.�g���ϋ��z�i�M�݁j�h�����v���Đݒ�
				SumEstimateAmountJpn = Calculate.add(SumEstimateAmountJpn, TempStruct.getl_ESTIMATE_AMOUNT_JPN()); //���׈ꗗ.�g���ϋ��z�i�M�݁j�h	
			}
			if(Calculate.compare(SumEstimateAmount,"99999999999999.00") == 1){
				struct.setESTIMATE_AMOUNT("99999999999999.00");
			}else{
				struct.setESTIMATE_AMOUNT(SumEstimateAmount);
			}
			if(Calculate.compare(SumEstimateAmountJpn,"99999999999999.00") == 1){
				struct.setESTIMATE_AMOUNT_JPN("99999999999999.00");
			}else{
				struct.setESTIMATE_AMOUNT_JPN(SumEstimateAmountJpn);
			}
		}
                //}}user_implement_dev:<controlTotal>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlTotal");

		return;
	}

	/**
	 * �s�ǉ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlappend() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlappend");
			//{{user_implement_dev:<controlappend>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			int listCnt = 0;
			 // �\���ő�s����������
			if(struct.getROW_COUNT() != null){
				int maxLine = Integer.parseInt(struct.getROW_COUNT());
				if (list != null){
					listCnt = list.size();
				}
				if (listCnt + 1 > maxLine) {
					ExpjMessage emsg = new ExpjMessage("ZZ01119", "" + maxLine);
					msgStruct.addError(emsg); // �G���[���b�Z�[�W�Ƃ��ēo�^
					sysLog.warning(emsg, getsysUSER_CD()); // �G���[���e
	 				return;
	 			}
			}
			//���הԍ� = ���C��[���].�g���הԍ��ő�l(��\��)�h+1
			struct.setl_DETAL_NO(Calculate.add(struct.geth_MAX_DETAL_NO(), "1"));
			//�ʉݒP�� = ���C��[���].�g�ʉݒP�ʁh 
			struct.setl_CUR_UNIT(struct.getCUR_UNIT());
			// �L�[��ێ�
			_keyStruct.keycopy(struct);
			struct.seth_CALLBUTTON("1");
		} catch(Exception e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			throw ee;
		}
                //}}user_implement_dev:<controlappend>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlappend");

		return;
	}

	/**
	 * �s�C���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlmodify() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlmodify");
			//{{user_implement_dev:<controlmodify>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		// �L�[��ێ�
		_keyStruct.keycopy(struct);
		struct.seth_CALLBUTTON("2");
                //}}user_implement_dev:<controlmodify>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlmodify");

		return;
	}

	/**
	 * �s�폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlerase() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlerase");
			//{{user_implement_dev:<controlerase>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			int j = 0;
			//�I���s���ꗗ�̉�ʂ���폜����B
			for(int i = 0; i < this.list.size(); i++){
				if (struct.getl_DETAL_NO().equals(((KM0020010Struct)list.get(i)).getl_DETAL_NO())){
					j = i;
				}
			}
			list.remove(j);
			//���׍폜�����J�E���g�A�b�v����
			DelCnt++;
			struct.setLIST_CNT(Integer.toString(list.size()));
		} catch(Exception e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			throw ee;
		}
                //}}user_implement_dev:<controlerase>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlerase");

		return;
	}

	/**
	 * ���[�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlprint() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlprint");
			KM0020010Struct strPdf = null;

		int ret = 0;
		String printType      = getPdfOutputType();
		String printPattern   = getPdfOutputListPattern();
		String printer        = getPdfOutputPrinter();
		SvfWrapper svf        = new SvfWrapper(printType, getsysUSER_CD(), printer);

			//{{user_implement_dev:<controlprint>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			String printId1 = "KM00200101";	// ���[ID���w�肵�Ă�������

			ret = svf.VrInit(printId1);	// PDF�쐬�J�n
			pdfFilePath = svf.getPdfFilePath();	// pdf�t���p�X�t�@�C����
			pdfFileName = svf.getPdfFileName();	// pdf�t�@�C�����iWeb�p�j
			String excuteOutput = svf.getExcuteOutput();	// �T�[�o�o�͏���            

			// �N�G���[�t�@�C���̎w�� 		
  			if (dbKIND != null && !dbKIND.equals("")) {
  				ret = svf.VrSetQuery("KIND=" + dbKIND + ";UID=" + dbUID
  						+ ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);
  			} else {
  				ret = svf.VrSetQuery("UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ="
  						+ dbDBQ);
  			}  
  			pdfList = list;
  		    //�f�[�^�̃Z�b�g
            // �N�G���[���o�����̎w��
           	ret = svf.VrCondition("[X|PROJECT_CD]=" + struct.getPROJECT_CD(), 4);
           	ret = svf.VrCondition("[X|ESTIMATE_NO]=" + struct.geth_ESTIMATE_NO(), 4);
           	ret = svf.VrCondition("[X|COMPANY_CD]=" + struct.getCOMPANY_CD(), 4);
           	// �N�G���[���s 
           	ret = svf.VrReport();
       		if (ret == -554) {
   				ExpjMessage emsg = new ExpjMessage("ZZ06001");
   				msgStruct.addError(emsg);
   				sysLog.warning(emsg, sysUSER_CD);
   				return;
   			}            
         
            ret = svf.VrQuit(); // PDF�쐬�I��
         
            if ("0".equals(printType)) { // �N���C�A���g����̏ꍇ
             struct.setDOWNLOAD_FILE(getPdfFileName());
            } else if ("1".equals(printType)) {
             try {
                 String acrobatPath = svf.getAcrobatPath();
                 String acrobatOption1 = svf.getAcrobatOption1();
                 String acrobatOption2 = svf.getAcrobatOption2();
                 String pdfPrinter = svf.getPrinter();
                 Runtime.getRuntime().exec(new String[]{acrobatPath, acrobatOption1, acrobatOption2, pdfFilePath, pdfPrinter});
              // Runtime.getRuntime().exec(excuteOutput);
             } catch (IOException e) {
              throw new ExpjException(e);
             }
            }
            conn.commit();
		}catch(Exception e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			throw ee;
		} finally {
			if (conn != null) {
                conn.rollback();
            }
		}
                //}}user_implement_dev:<controlprint>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlprint");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlinsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlinsert");
			//{{user_implement_dev:<controlinsert>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		boolean transFlg = false;
		try {
			//�`�F�b�N
			//���ϒS���҃R�[�h��null�łȂ��ꍇ
			if (struct.getES_USER_CD() != null && !"".equals(struct.getES_USER_CD())){
				List listUser = entity.mCheckUSER_MST.read(conn, struct);
				if (listUser == null || listUser.size() != 1) {
					// ���ϒS���҂����݂��Ȃ��ꍇ
					Message = "T_ESTIMATE.ES_USER_CD:" + struct.getES_USER_CD();
					setErrorMessage("KM00013", Message);
					return;
				}else{
					struct.setUSER_NAME(((KM0020010Struct)listUser.get(0)).getUSER_NAME()); //�g���ϒS���Җ��h
				}
			}
			//���ϒS������R�[�h��null�łȂ��ꍇ
			if (struct.getES_ORG_CD() != null && !"".equals(struct.getES_ORG_CD())){
				List listOrg = entity.mCheckM_ORG.read(conn, struct);
				if (listOrg == null || listOrg.size() != 1) {
					//���ϒS�� ����R�[�h�����݂��Ȃ��ꍇ
					Message = "T_ESTIMATE.ES_ORG_CD:" + struct.getES_ORG_CD();
					setErrorMessage("KM00006", Message);
					return;
				}else{
					struct.setORG_NAME(((KM0020010Struct)listOrg.get(0)).getORG_NAME()); //�g���ϒS�� ���喼�h
				}
			}
			//[���].�g���ϓ��h���Ɩ����t�̏ꍇ
			GregorianCalendar date1 = new GregorianCalendar();
			date1.setTime(Converter.strToDate(struct.getESTIMATE_DATE(), "yyyy/MM/dd"));
			GregorianCalendar date2 = new GregorianCalendar();
			date2.setTime(Converter.strToDate(struct.getBUSINESS_DATE(), "yyyy/MM/dd"));
			if(date1.getTime().compareTo(date2.getTime()) < 0){
				//<���[�j���O> KM00038�@���ϓ����ߋ����ł��B
				Message = "T_ESTIMAT.ESTIMATE_DATE:" + struct.getESTIMATE_DATE();
				setWarnMessage("KM00038", Message);
			}
			//�u���׍��v�����v���s���u���ϋ��z���v�v�u���ϋ��z���v�i�M�݁j�v���擾����B
			controlTotal();
			// �g�����U�N�V�����J�n
        	conn.beginTransWeb();
            transFlg = true;
            
            // [����] ��o�^����
            //���ϔԍ�=MAX([����].�g���ϔԍ��h)�@�{1
            struct.seth_PROJECT_CD(struct.getPROJECT_CD());
            List listEstimate = entity.mSelectT_ESTIMATE.read(conn, struct);
			if (listEstimate.size() > 0) {
				struct.setESTIMATE_NO(Calculate.add(((KM0020010Struct)listEstimate.get(0)).geth_ESTIMATE_NO(), "1")); //[����].�g���ϔԍ��h
			}else{
				struct.setESTIMATE_NO("1");
			}
			//���σX�e�[�^�X  [���].�g������́h���`�F�b�NOn�̏ꍇ 1:����
			if ("true".equals(struct.getUNOFFICIAL_RECEIPT_FLG())){
				struct.setESTIMATE_ST("1");
				struct.setUNOFFICIAL_RECEIPT_FLAG("1");
			}else{
				//[���].�g������́h���`�F�b�NOff�̏ꍇ�@0:���ϒ�
				struct.setESTIMATE_ST("0");
				struct.setUNOFFICIAL_RECEIPT_FLAG("0");
			}
			
            entity.mInsertT_ESTIMATE.create(conn, struct);
            
            //���ϖ��ׂ�o�^����
            for(int i = 0; i < this.list.size(); i++){
            	KM0020010Struct structtemp = new KM0020010Struct();
    			structtemp = (KM0020010Struct)list.get(i);
    			structtemp.setPROJECT_CD(struct.getPROJECT_CD());
    			structtemp.seth_ESTIMATE_NO(struct.getESTIMATE_NO());
    			structtemp.setUSER(this.getsysUSER_CD());
    			structtemp.setPROGRAM_NAME("KM0020010");
    			
    			//���הԍ���1����ӂ蒼���āA�ݒ肷��B
    			structtemp.setl_DETAL_NO(Integer.toString(i+1));
                entity.mInsertT_ESTIMATE_DETAL.create(conn, structtemp);
			}
            //[���].�g������́h���`�F�b�NOn�̏ꍇ�A�X�V�ΏۈȊO�̌��ς̌��σX�e�[�^�X��9:�L�����Z���ɍX�V����
            if ("true".equals(struct.getUNOFFICIAL_RECEIPT_FLG())){
            	struct.seth_ESTIMATE_NO(struct.getESTIMATE_NO());
            	struct.seth_ESTIMATE_ST("9");
            	entity.mUpdateT_ESTIMATE_ST.update(conn, struct);
			}
            //�X�V���`�F�b�N
            List listProject = entity.mSelectT_PROJECT.read(conn, struct);
			if (listProject.size() > 0) {
				if(!struct.getMODIFY_COUNT_PJ().equals(((KM0020010Struct)listProject.get(0)).getMODIFY_COUNT_PJ())){
					//[�Č�].�g�X�V���h ���Ǎ����ƈقȂ�ꍇ
					Message = "T_PROJECT.PROJECT_CD:" + struct.getPROJECT_CD();
					setErrorMessage("ZZ01105", Message);
					return;
				}
			}
			//�Č��X�e�[�^�X���X�V����B
			if("true".equals(struct.getUNOFFICIAL_RECEIPT_FLG())){
				//3:����
				struct.setPROJECT_STAT("3");
			}else{
				//2:����
				struct.setPROJECT_STAT("2");
			}
			entity.mUpdateT_PROJECT.update(conn, struct);
			conn.commit();
			// �Č���
			controlSelect();
			transFlg = false;
		} catch(SQLException e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			setSqlExceptionMsg(e);
		} catch(Exception e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			throw ee;
		} finally{
        	try {
        		if(transFlg == true){
        			conn.rollback();
        			}
        		} catch(Exception e) {
        			e.printStackTrace();
        		}
        }
                //}}user_implement_dev:<controlinsert>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlinsert");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		boolean transFlg = false;
		int isdelete = 0;
		try {
			//�`�F�b�N
			//���ϒS���҃R�[�h��null�łȂ��ꍇ
			if (struct.getES_USER_CD() != null && !"".equals(struct.getES_USER_CD())){
				List listUser = entity.mCheckUSER_MST.read(conn, struct);
				if (listUser == null || listUser.size() != 1) {
					// ���ϒS���҂����݂��Ȃ��ꍇ
					Message = "T_ESTIMATE.ES_USER_CD:" + struct.getES_USER_CD();
					setErrorMessage("KM00013", Message);
					return;
				}else{
					struct.setUSER_NAME(((KM0020010Struct)listUser.get(0)).getUSER_NAME()); //�g���ϒS���Җ��h
				}
			}
			
			//���ϒS������R�[�h��null�łȂ��ꍇ
			if (struct.getES_ORG_CD() != null && !"".equals(struct.getES_ORG_CD())){
				List listOrg = entity.mCheckM_ORG.read(conn, struct);
				if (listOrg == null || listOrg.size() != 1) {
					//���ϒS�� ����R�[�h�����݂��Ȃ��ꍇ
					Message = "T_ESTIMATE.ES_ORG_CD:" + struct.getES_ORG_CD();
					setErrorMessage("KM00006", Message);
					return;
				}else{
					struct.setORG_NAME(((KM0020010Struct)listOrg.get(0)).getORG_NAME()); //�g���ϒS�� ���喼�h
				}
			}
			//[���].�g���ϓ��h���Ɩ����t�̏ꍇ
			GregorianCalendar date1 = new GregorianCalendar();
			date1.setTime(Converter.strToDate(struct.getESTIMATE_DATE(), "yyyy/MM/dd"));
			GregorianCalendar date2 = new GregorianCalendar();
			date2.setTime(Converter.strToDate(struct.getBUSINESS_DATE(), "yyyy/MM/dd"));
			if(date1.getTime().compareTo(date2.getTime()) < 0){
				//<���[�j���O> KM00038�@���ϓ����ߋ����ł��B
				Message = "T_ESTIMAT.ESTIMATE_DATE:" + struct.getESTIMATE_DATE();
				setWarnMessage("KM00038", Message);
			}
			struct.seth_PROJECT_CD(struct.getPROJECT_CD());
			//���ϔԍ���0�̏ꍇ�A�ő匩�ϔԍ����擾
			if ("0".equals(struct.getESTIMATE_NO())){
				List listEstimate = entity.mSelectT_ESTIMATE.read(conn, struct);
				if (listEstimate.size() > 0) {
					struct.seth_ESTIMATE_NO(((KM0020010Struct)listEstimate.get(0)).geth_ESTIMATE_NO()); //[����].�g���ϔԍ��h
				}
			}else{
				struct.seth_ESTIMATE_NO(struct.getESTIMATE_NO()); //[����].�g���ϔԍ��h
			}
			//��ʂ��w�肳�ꂽ�����̃f�[�^��[����]���ēx�ǂݍ��ށB
			List listHead = entity.mSelectHEAD.read(conn, struct);
			if (listHead.size() > 0) {
				if(!struct.getMODIFY_COUNT_ES().equals(((KM0020010Struct)listHead.get(0)).getMODIFY_COUNT_ES())){
					//[����].�g�X�V���h ���Ǎ����ƈقȂ�ꍇ
					Message = "T_PROJECT.PROJECT_CD:" + struct.getPROJECT_CD();
					setErrorMessage("ZZ01105", Message);
					return;
				}
			}
			
			//�u���׍��v�����v���s���u���ϋ��z���v�v�u���ϋ��z���v�i�M�݁j�v���擾����B
			controlTotal();
			
			// �g�����U�N�V�����J�n
        	conn.beginTransWeb();
            transFlg = true;
            
            // [����] ���X�V����
            if ("true".equals(struct.getUNOFFICIAL_RECEIPT_FLG())){
				struct.setESTIMATE_ST("1");
				struct.setUNOFFICIAL_RECEIPT_FLAG("1");
			}else{
				//[���].�g������́h���`�F�b�NOff�̏ꍇ�@0:���ϒ�
				struct.setESTIMATE_ST("0");
				struct.setUNOFFICIAL_RECEIPT_FLAG("0");
			}
            //�Č��X�e�[�^�X��1:�����A2:���ρA3:�����̏ꍇ
            if("1".equals(struct.getPROJECT_STAT()) || "2".equals(struct.getPROJECT_STAT()) ||"3".equals(struct.getPROJECT_STAT()) ){
            	entity.mUpdateT_ESTIMATE.update(conn, struct);
            }
            //�u�s�ǉ��v�A�u�s�폜�v���s��ꂽ���`�F�b�N����
            if (DelCnt == 0){
            	for(int i = 0; i < this.list.size(); i++){
                	KM0020010Struct structflag = new KM0020010Struct();
                	structflag = (KM0020010Struct)list.get(i);
        			if ("1".equals(structflag.getl_FLAG())){
        				isdelete = 1;
        				break;
        			}
    			}
            }
            //���ׂ̈ꗗ�ŁA�u�s�ǉ��v�A�u�s�폜�v���s��ꂽ�ꍇ
            if (isdelete == 1 || DelCnt != 0){
            	//[���ϖ���]�f�[�^�𕨗��폜����B
            	entity.mDeleteT_ESTIMATE_DETAL.delete(conn, struct);
            	//���ϖ��ׂ�o�^����
                for(int i = 0; i < this.list.size(); i++){
                	KM0020010Struct structtemp = new KM0020010Struct();
        			structtemp = (KM0020010Struct)list.get(i);
        			structtemp.setPROJECT_CD(struct.getPROJECT_CD());
        			structtemp.seth_ESTIMATE_NO(struct.geth_ESTIMATE_NO());
        			structtemp.setUSER(this.getsysUSER_CD());
        			structtemp.setPROGRAM_NAME("KM0020010");
        			
        			//���הԍ���1����ӂ蒼���āA�ݒ肷��B
        			structtemp.setl_DETAL_NO(Integer.toString(i+1));
                    entity.mInsertT_ESTIMATE_DETAL.create(conn, structtemp);
    			}
            }else{
            	//���ׂ̈ꗗ�ŁA�u�s�ǉ��v�A�u�s�폜�v���s���Ă��Ȃ��ꍇ�A���׈ꗗ���X�V����
            	for(int i = 0; i < this.list.size(); i++){
                	KM0020010Struct structtemp = new KM0020010Struct();
        			structtemp = (KM0020010Struct)list.get(i);
        			if ("2".equals(structtemp.getl_FLAG())){
        				structtemp.setPROJECT_CD(struct.getPROJECT_CD());
        				structtemp.seth_ESTIMATE_NO(struct.geth_ESTIMATE_NO());
        				structtemp.setUSER(this.getsysUSER_CD());
        				structtemp.setPROGRAM_NAME("KM0020010");
        				entity.mUpdateT_ESTIMATE_DETAL.update(conn, structtemp);
        			}
    			}
            }
            //�X�e�[�^�X�̌�����
            //������̃t���O��ύX�����ꍇ�A�X�V�ΏۈȊO�̌��ς̌��σX�e�[�^�X���X�V����B
            if(!struct.geth_UNOFFICIAL_RECEIPT_FLAG().equals(struct.getUNOFFICIAL_RECEIPT_FLAG())){
            	//������̃t���O��1:��̂��肩��0:��̂Ȃ��ɍX�V�����ꍇ�́A�X�V�ΏۈȊO�̌��ς̌��σX�e�[�^�X��0:���ϒ��ɂ���B
            	if ("1".equals(struct.geth_UNOFFICIAL_RECEIPT_FLAG()) && "0".equals(struct.getUNOFFICIAL_RECEIPT_FLAG())){
            		struct.seth_ESTIMATE_ST("0");
            		//2:����
    				struct.setPROJECT_STAT("2");
            	}else{
            		//������̃t���O��0: ��̂Ȃ�����1:��̂���ɍX�V�����ꍇ�́A�X�V�ΏۈȊO�̌��ς̌��σX�e�[�^�X��9:�L�����Z���ɂ���B
            		struct.seth_ESTIMATE_ST("9");
            		//3:����
    				struct.setPROJECT_STAT("3");
            	}
            	entity.mUpdateT_ESTIMATE_ST.update(conn, struct);
            	//�X�V���`�F�b�N
                List listProject = entity.mSelectT_PROJECT.read(conn, struct);
    			if (listProject.size() > 0) {
    				if(!struct.getMODIFY_COUNT_PJ().equals(((KM0020010Struct)listProject.get(0)).getMODIFY_COUNT_PJ())){
    					//[�Č�].�g�X�V���h ���Ǎ����ƈقȂ�ꍇ
    					Message = "T_PROJECT.PROJECT_CD:" + struct.getPROJECT_CD();
    					setErrorMessage("ZZ01105", Message);
    					return;
    				}
    			}
    			//�Č��X�e�[�^�X���X�V����B
    			entity.mUpdateT_PROJECT.update(conn, struct);
            }
			conn.commit();
			// �Č���
			controlSelect();
			transFlg = false;
		} catch(SQLException e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			setSqlExceptionMsg(e);
		} catch(Exception e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			throw ee;
		} finally{
        	try {
        		if(transFlg == true){
        			conn.rollback();
        			}
        		} catch(Exception e) {
        			e.printStackTrace();
        		}
        }
                //}}user_implement_dev:<controlupdate>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * �폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controldelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controldelete");
			//{{user_implement_dev:<controldelete>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		boolean transFlg = false;
		try {
			struct.seth_PROJECT_CD(struct.getPROJECT_CD());
			//���ϔԍ���0�̏ꍇ�A�ő匩�ϔԍ����擾
			if ("0".equals(struct.getESTIMATE_NO())){
				List listEstimate = entity.mSelectT_ESTIMATE.read(conn, struct);
				if (listEstimate.size() > 0) {
					struct.seth_ESTIMATE_NO(((KM0020010Struct)listEstimate.get(0)).geth_ESTIMATE_NO()); //[����].�g���ϔԍ��h
				}
			}else{
				struct.seth_ESTIMATE_NO(struct.getESTIMATE_NO()); //[����].�g���ϔԍ��h
			}
			//��ʂ��w�肳�ꂽ�����̃f�[�^��[����]���ēx�ǂݍ��ށB
			List listHead = entity.mSelectHEAD.read(conn, struct);
			if (listHead.size() > 0) {
				if(!struct.getMODIFY_COUNT_ES().equals(((KM0020010Struct)listHead.get(0)).getMODIFY_COUNT_ES())){
					//[����].�g�X�V���h ���Ǎ����ƈقȂ�ꍇ
					Message = "T_PROJECT.PROJECT_CD:" + struct.getPROJECT_CD();
					setErrorMessage("ZZ01105", Message);
					return;
				}
			}
			// �g�����U�N�V�����J�n
        	conn.beginTransWeb();
            transFlg = true;
            
            //[����] �𕨗��폜����B
            entity.mDeleteT_ESTIMATE.delete(conn, struct);
            //[���ϖ���] �𕨗��폜����
            entity.mDeleteT_ESTIMATE_DETAL.delete(conn, struct);
            //��ʂ��w�肳�ꂽ�����̃f�[�^��[�Č�]���ēx�ǂݍ���
            //�X�V���`�F�b�N
            List listProject = entity.mSelectT_PROJECT.read(conn, struct);
			if (listProject.size() > 0) {
				if(!struct.getMODIFY_COUNT_PJ().equals(((KM0020010Struct)listProject.get(0)).getMODIFY_COUNT_PJ())){
					//[�Č�].�g�X�V���h ���Ǎ����ƈقȂ�ꍇ
					Message = "T_PROJECT.PROJECT_CD:" + struct.getPROJECT_CD();
					setErrorMessage("ZZ01105", Message);
					return;
				}
			}
			List listCheck = entity.mCheckT_ESTIMATE.read(conn, struct);
			if (listCheck == null || listCheck.size() == 0) {
				//�Č��X�e�[�^�X���X�V����
				struct.setPROJECT_STAT("1");
				entity.mUpdateT_PROJECT.update(conn, struct);
			}
			conn.commit();
			// �N���A����
			controlClear();
			transFlg = false;
		} catch(SQLException e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			setSqlExceptionMsg(e);
		}finally{
        	try {
        		if(transFlg == true){
        			conn.rollback();
        			}
        		} catch(Exception e) {
        			e.printStackTrace();
        		}
        }
                //}}user_implement_dev:<controldelete>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controldelete");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		//------------------------------------------------------------------
        // ������
        _keyStruct.clear();
        struct.clear();
        if(list != null){
        	list.clear();
        }
        setReadStatus(INITIAL);
        controlRELOAD();
        //------------------------------------------------------------------
                //}}user_implement_dev:<controlClear>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * �P���Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelectUnitCost() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlSelectUnitCost");
			//{{user_implement_dev:<controlSelectUnitCost>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try{
			//[���i�P��].�g�P���h���擾����B
			List listCost = entity.mSelectM_UNIT_COST.read(conn, struct);
			if (listCost == null || listCost.size() == 0) {
				// [���i�P��]���擾�ł��Ȃ������ꍇ�F�P�����}�X�^�ɑ��݂��܂���B
				Message = "M_ITEM_SPEC.CUST_ITEM_CD:" + struct.getl_CUST_ITEM_CD();
				setErrorMessage("KQ00021", Message);
			}else{
				struct.setl_UNIT_PRICE(((KM0020010Struct)listCost.get(0)).getUNIT_COST()); //[���i�P��].�g�P���h
				struct.setl_UNIT_COST(((KM0020010Struct)listCost.get(0)).getUNIT_COST()); //[���i�P��].�g�P���h
				struct.setl_ESTIMATE_UNIT_PRICE(Calculate.add(struct.getl_UNIT_PRICE(), struct.getl_DISCOUNT_PRICE())); //�g���ϒP���h
				if(Calculate.compare((Calculate.multiply(struct.getl_UNIT_PRICE(), struct.getl_ESTIMATE_QTY())),"99999999999999.00") == 1){
					struct.setl_AMOUNT("99999999999999.00");
				}else{
					struct.setl_AMOUNT(Calculate.multiply(struct.getl_UNIT_PRICE(), struct.getl_ESTIMATE_QTY())); //�g���z�h
				}
				if(Calculate.compare((Calculate.multiply(struct.getl_DISCOUNT_PRICE(), struct.getl_ESTIMATE_QTY())),"99999999999999.00") == 1){
					struct.setl_DISCOUNT_AMOUNT("99999999999999.00");
				}else{
					struct.setl_DISCOUNT_AMOUNT(Calculate.multiply(struct.getl_DISCOUNT_PRICE(), struct.getl_ESTIMATE_QTY())); //�g�l�����z�h
				}
				if(Calculate.compare((Calculate.multiply(struct.getl_ESTIMATE_UNIT_PRICE(), struct.getl_ESTIMATE_QTY())),"99999999999999.00") == 1){
					struct.setl_ESTIMATE_AMOUNT("99999999999999.00");
				}else{
					struct.setl_ESTIMATE_AMOUNT(Calculate.multiply(struct.getl_ESTIMATE_UNIT_PRICE(), struct.getl_ESTIMATE_QTY())); //�g���ϋ��z�h
				}
			}
		} catch(SQLException e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			setSqlExceptionMsg(e);
		}
                //}}user_implement_dev:<controlSelectUnitCost>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlSelectUnitCost");

		return;
	}

	/**
	 * �M�݊��Z�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlLcConversion() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlLcConversion");
			//{{user_implement_dev:<controlLcConversion>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try{
			//[���].�g���ϋ��z�h��0�̏ꍇ�A�ʉ݃R�[�h���M�݂̏ꍇ�A�����𔲂���
			if (!"0".equals(struct.getl_ESTIMATE_AMOUNT()) &&  !struct.getHOME_CUR_CD().equals(struct.geth_CUR_CD())){
				List listMCust = entity.mSelectM_CUST.read(conn, struct);
				if (listMCust.size() > 0) {
					struct.setEXCH_TYP(((KM0020010Struct)listMCust.get(0)).getEXCH_TYP()); //[���Ӑ�].�g�ב֎�ʁh
					struct.setDETAIL_ROUND_TYP(((KM0020010Struct)listMCust.get(0)).getDETAIL_ROUND_TYP()); //[���Ӑ�].�g���׌v�Z�܂�ߋ敪�h
				}
				//�M�݊��Z�̕��i���Ă�
				ExchAmount ex = new ExchAmount(conn);
				if(!ex.doExchAmount(struct.getl_ESTIMATE_AMOUNT(),struct.getCOMPANY_CD(),struct.geth_CUR_CD(),
						struct.getEXCH_TYP(),struct.getDETAIL_ROUND_TYP(),struct.getBUSINESS_DATE())){
					//�G���[�̏ꍇ�A���b�Z�[�W���o�͂���
					//�M�݊��Z�Ɏ��s�����ꍇ
					Message = "T_PROJECT.PROJECT_CD:" + struct.getPROJECT_CD();
					setErrorMessage("KM00022", Message);
					return;
				}
				if(Calculate.compare(ex.getS_EXCH_AMOUNT(),"99999999999999.00") == 1){
					struct.setl_ESTIMATE_AMOUNT_JPN("99999999999999.00");
				}else{
					struct.setl_ESTIMATE_AMOUNT_JPN(ex.getS_EXCH_AMOUNT());//���ϋ��z(�M��)
				}
				if(Calculate.compare((Calculate.subtract(struct.getl_ESTIMATE_AMOUNT_JPN(), struct.getl_ES_COST_ALL())),"99999999999999.00") == 1){
					struct.setl_ESTIMATE_GAIN("99999999999999.00");
				}else{
					struct.setl_ESTIMATE_GAIN(Calculate.subtract(struct.getl_ESTIMATE_AMOUNT_JPN(), struct.getl_ES_COST_ALL())); //���ϗ��v=���ϋ��z(�M��)�|[���].�g�\�Z���v�h
				}
			}
		} catch(SQLException e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			setSqlExceptionMsg(e);
		}
                //}}user_implement_dev:<controlLcConversion>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlLcConversion");

		return;
	}

	/**
	 * �ǉ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlinsertSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");
			//{{user_implement_dev:<controlinsertSub1>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			//�`�F�b�N
			//���Ӑ�i�ڔԍ���null�łȂ��ꍇ�A
			if (struct.getl_CUST_ITEM_CD() != null && !"".equals(struct.getl_CUST_ITEM_CD())){
				//[���i].�g��ЃR�[�h�h�����ЃR�[�h�A[���i].�g���Ӑ�R�[�h�h��[�Č�].�g���Ӑ�R�[�h�h�A[���i].�g���Ӑ�i�ڔԍ��h �� [���].�g���Ӑ�i�ڔԍ��h�̏����ɍ��v���郌�R�[�h�� [���i] �ɑ��݂��Ȃ��ꍇ
				List listSpec = entity.mCheckM_ITEM_SPEC.read(conn, struct);
				if (listSpec == null || listSpec.size() != 1) {
					// �������s�F���Ӑ�i�ڔԍ������i�}�X�^�ɑ��݂��܂���B
					Message = "M_ITEM_SPEC.CUST_ITEM_CD:" + struct.getl_CUST_ITEM_CD();
					setErrorMessage("KQ00017", Message);
					return;
				}else{
					struct.setl_CUST_ITEM_NAME(((KM0020010Struct)listSpec.get(0)).getl_CUST_ITEM_NAME()); //[���i].�g���Ӑ�i�ږ��h
				}
			}
			//[�i��].�g�݌ɐ��P�ʋ敪�h �� 1:�����Ǘ� ����[���].�g���ʁh �� �����łȂ��ꍇ
			if (!Calculate.isInteger(struct.getl_ESTIMATE_QTY())){
				List listItem = entity.mSelectM_ITEM.read(conn, struct);
				if (listItem.size() > 0) {
					struct.setUNIT_QTY_TYP(((KM0020010Struct)listItem.get(0)).getUNIT_QTY_TYP()); //[�i��].�g�݌ɐ��P�ʋ敪�h
				}
				if ("1".equals(struct.getUNIT_QTY_TYP())){
					//<���[�j���O> KQ20004�y�����Ǘ��i�ڂ̂��ߏ����_�ȉ���؂�グ�܂����B�z
					Message = "M_ITEM_SPEC.CUST_ITEM_CD:" + struct.getl_CUST_ITEM_CD();
					setWarnMessage("KQ20004", Message);
					//�����_�ȉ���؂�グ�� �ꗗ�� �g���ʁh �ɃZ�b�g����B
					struct.setl_ESTIMATE_QTY(Calculate.ceil(struct.getl_ESTIMATE_QTY(), 0));
					struct.setl_AMOUNT(Calculate.multiply(struct.getl_UNIT_PRICE(), struct.getl_ESTIMATE_QTY())); //�g���z�h
					struct.setl_DISCOUNT_AMOUNT(Calculate.multiply(struct.getl_DISCOUNT_PRICE(), struct.getl_ESTIMATE_QTY())); //�g�l�����z�h
					struct.setl_ESTIMATE_AMOUNT(Calculate.multiply(struct.getl_ESTIMATE_UNIT_PRICE(), struct.getl_ESTIMATE_QTY())); //�g���ϋ��z�h
				}
			}
			//[���].�g�w��[���h���Ɩ����t�̏ꍇ
			GregorianCalendar date1 = new GregorianCalendar();
			date1.setTime(Converter.strToDate(struct.getl_DESINATED_DLV_DATE(), "yyyy/MM/dd"));
			GregorianCalendar date2 = new GregorianCalendar();
			date2.setTime(Converter.strToDate(struct.getBUSINESS_DATE(), "yyyy/MM/dd"));
			if(date1.getTime().compareTo(date2.getTime()) < 0){
				//<���[�j���O> KM00039�@�w��[�����ߋ����ł��B
				Message = "T_ESTIMATE_DETAL.DESINATED_DLV_DATE:" + struct.getl_DESINATED_DLV_DATE();
				setWarnMessage("KM00039", Message);
			}
			struct.keycopy(_keyStruct);
			struct.setl_UNIT_COST("0");
			//���Ӑ�i�ڔԍ���null�łȂ��ꍇ�A���i�P�����擾����B
			if (struct.getl_CUST_ITEM_CD() != null && !"".equals(struct.getl_CUST_ITEM_CD())){
				//[���i�P��].�g�P���h���擾����B
				List listCost = entity.mSelectM_UNIT_COST.read(conn, struct);
				if (listCost == null || listCost.size() == 0) {
					// [���i�P��]���擾�ł��Ȃ������ꍇ
					struct.setl_UNIT_COST("0");//[���ϖ���].�g���i�P���h
				}else{
					struct.setl_UNIT_COST(((KM0020010Struct)listCost.get(0)).getUNIT_COST()); //[���i�P��].�g�P���h
				}
				//[�i��].�g�v�ʒP�ʁh���擾����
				List listUnit = entity.mSelectSTOCK_UNIT.read(conn, struct);
				if (!listUnit.isEmpty()) {
					struct.setl_UNIT_CD(((KM0020010Struct)listUnit.get(0)).getl_UNIT_CD()); //[�i��].�g�v�ʒP�ʁh
				}else{
					struct.setl_UNIT_CD(null); //[�i��].�g�v�ʒP�ʁh
				}
			}else{
				struct.setl_CUST_ITEM_NAME("");
			}
			//�M�݊��Z����
			controlLcConversion();
			//�ʉ݃R�[�h���M�݂̏ꍇ�A���ϋ��z(�M��)�Ɍ��ϋ��z��ݒ肷��B
			if (struct.getHOME_CUR_CD().equals(struct.geth_CUR_CD())){
				struct.setl_ESTIMATE_AMOUNT_JPN(struct.getl_ESTIMATE_AMOUNT());
				//���ϗ��v=���ϋ��z(�M��)�|�\�Z���v
				struct.setl_ESTIMATE_GAIN(Calculate.subtract(struct.getl_ESTIMATE_AMOUNT_JPN(), struct.getl_ES_COST_ALL()));
			}
			
			//�o�^�X�V�t���O(��\��) = 1:�o�^
			struct.setl_FLAG("1");
			//���הԍ��ő�l(��\��) = ���הԍ��ő�l(��\��)+1
			struct.seth_MAX_DETAL_NO(struct.getl_DETAL_NO());
			struct.setl_ESTIMATE_NAME(this.multcombo("ESTIMATE_TYPE",struct.getl_ESTIMATE_TYP())); //[���ϖ���].�g��z�i�ڎ�h
			struct.setl_SPEC_CLASS1_NAME(this.multcombo("SPEC_CLASS_01",struct.getl_SPEC_CLASS1_TYP())); //[���ϖ���].�g���i�I��1�h
			struct.setl_SPEC_CLASS2_NAME(this.multcombo("SPEC_CLASS_02",struct.getl_SPEC_CLASS2_TYP())); //[���ϖ���].�g���i�I��2�h
			struct.setl_SPEC_SELECT1_NAME(this.multcombo("SPEC_SELECT_01",struct.getl_SPEC_SELECT1_TYP())); //[���ϖ���].�g�d�l�I��1�h
			struct.setl_SPEC_SELECT2_NAME(this.multcombo("SPEC_SELECT_02",struct.getl_SPEC_SELECT2_TYP())); //[���ϖ���].�g�d�l�I��2�h
			struct.setl_SPEC_SELECT3_NAME(this.multcombo("SPEC_SELECT_03",struct.getl_SPEC_SELECT3_TYP())); //[���ϖ���].�g�d�l�I��3�h
			struct.setl_SPEC_SELECT4_NAME(this.multcombo("SPEC_SELECT_04",struct.getl_SPEC_SELECT4_TYP())); //[���ϖ���].�g�d�l�I��4�h
			KM0020010Struct structtemp = new KM0020010Struct();
			structtemp.copy(struct);
			if (list == null) {
    			list = new ArrayList();
    		}
			list.add(structtemp);
			struct.setLIST_CNT(Integer.toString(list.size()));
		} catch(SQLException e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			setSqlExceptionMsg(e);
		}catch(Exception e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			throw ee;
		}
                //}}user_implement_dev:<controlinsertSub1>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");

		return;
	}

	/**
	 * �C���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlupdateSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlupdateSub1");
			//{{user_implement_dev:<controlupdateSub1>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			int j = 0;
			//�`�F�b�N
			//���Ӑ�i�ڔԍ���null�łȂ��ꍇ�A
			if (struct.getl_CUST_ITEM_CD() != null && !"".equals(struct.getl_CUST_ITEM_CD())){
				//[���i].�g��ЃR�[�h�h�����ЃR�[�h�A[���i].�g���Ӑ�R�[�h�h��[�Č�].�g���Ӑ�R�[�h�h�A[���i].�g���Ӑ�i�ڔԍ��h �� [���].�g���Ӑ�i�ڔԍ��h�̏����ɍ��v���郌�R�[�h�� [���i] �ɑ��݂��Ȃ��ꍇ
				List listSpec = entity.mCheckM_ITEM_SPEC.read(conn, struct);
				if (listSpec == null || listSpec.size() != 1) {
					// �������s�F���Ӑ�i�ڔԍ������i�}�X�^�ɑ��݂��܂���B
					Message = "M_ITEM_SPEC.CUST_ITEM_CD:" + struct.getl_CUST_ITEM_CD();
					setErrorMessage("KQ00017", Message);
					return;
				}else{
					struct.setl_CUST_ITEM_NAME(((KM0020010Struct)listSpec.get(0)).getl_CUST_ITEM_NAME()); //[���i].�g���Ӑ�i�ږ��h
				}
			}
			//[�i��].�g�݌ɐ��P�ʋ敪�h �� 1:�����Ǘ� ����[���].�g���ʁh �� �����łȂ��ꍇ
			if (!Calculate.isInteger(struct.getl_ESTIMATE_QTY())){
				List listItem = entity.mSelectM_ITEM.read(conn, struct);
				if (listItem.size() > 0) {
					struct.setUNIT_QTY_TYP(((KM0020010Struct)listItem.get(0)).getUNIT_QTY_TYP()); //[�i��].�g�݌ɐ��P�ʋ敪�h
				}
				if ("1".equals(struct.getUNIT_QTY_TYP())){
					//<���[�j���O> KQ20004�y�����Ǘ��i�ڂ̂��ߏ����_�ȉ���؂�グ�܂����B�z
					Message = "M_ITEM_SPEC.CUST_ITEM_CD:" + struct.getl_CUST_ITEM_CD();
					setWarnMessage("KQ20004", Message);
					//�����_�ȉ���؂�グ�� �ꗗ�� �g���ʁh �ɃZ�b�g����B
					struct.setl_ESTIMATE_QTY(Calculate.ceil(struct.getl_ESTIMATE_QTY(), 0));
					struct.setl_AMOUNT(Calculate.multiply(struct.getl_UNIT_PRICE(), struct.getl_ESTIMATE_QTY())); //�g���z�h
					struct.setl_DISCOUNT_AMOUNT(Calculate.multiply(struct.getl_DISCOUNT_PRICE(), struct.getl_ESTIMATE_QTY())); //�g�l�����z�h
					struct.setl_ESTIMATE_AMOUNT(Calculate.multiply(struct.getl_ESTIMATE_UNIT_PRICE(), struct.getl_ESTIMATE_QTY())); //�g���ϋ��z�h
				}
			}
			//[���].�g�w��[���h���Ɩ����t�̏ꍇ
			GregorianCalendar date1 = new GregorianCalendar();
			date1.setTime(Converter.strToDate(struct.getl_DESINATED_DLV_DATE(), "yyyy/MM/dd"));
			GregorianCalendar date2 = new GregorianCalendar();
			date2.setTime(Converter.strToDate(struct.getBUSINESS_DATE(), "yyyy/MM/dd"));
			if(date1.getTime().compareTo(date2.getTime()) < 0){
				//<���[�j���O> KM00039�@�w��[�����ߋ����ł��B
				Message = "T_ESTIMATE_DETAL.DESINATED_DLV_DATE:" + struct.getl_DESINATED_DLV_DATE();
				setWarnMessage("KM00039", Message);
			}
			struct.keycopy(_keyStruct);
			struct.setl_UNIT_COST("0");
			//���Ӑ�i�ڔԍ���null�łȂ��ꍇ���i�P�����擾����B
			if (struct.getl_CUST_ITEM_CD() != null && !"".equals(struct.getl_CUST_ITEM_CD())){
				//[���i�P��].�g�P���h���擾����B
				List listCost = entity.mSelectM_UNIT_COST.read(conn, struct);
				if (listCost == null || listCost.size() == 0) {
					// [���i�P��]���擾�ł��Ȃ������ꍇ
					struct.setl_UNIT_COST("0");//[���ϖ���].�g���i�P���h
				}else{
					struct.setl_UNIT_COST(((KM0020010Struct)listCost.get(0)).getUNIT_COST()); //[���i�P��].�g�P���h
				}
				//[�i��].�g�v�ʒP�ʁh���擾����
				List listUnit = entity.mSelectSTOCK_UNIT.read(conn, struct);
				if (!listUnit.isEmpty()) {
					struct.setl_UNIT_CD(((KM0020010Struct)listUnit.get(0)).getl_UNIT_CD()); //[�i��].�g�v�ʒP�ʁh
				}else{
					struct.setl_UNIT_CD(null); //[�i��].�g�v�ʒP�ʁh
				}
			}else{
				struct.setl_CUST_ITEM_NAME("");
			}
			//�M�݊��Z����
			controlLcConversion();
			//�ʉ݃R�[�h���M�݂̏ꍇ�A���ϋ��z(�M��)�Ɍ��ϋ��z��ݒ肷��B
			if (struct.getHOME_CUR_CD().equals(struct.geth_CUR_CD())){
				struct.setl_ESTIMATE_AMOUNT_JPN(struct.getl_ESTIMATE_AMOUNT());
				//���ϗ��v=���ϋ��z(�M��)�|�\�Z���v
				struct.setl_ESTIMATE_GAIN(Calculate.subtract(struct.getl_ESTIMATE_AMOUNT_JPN(), struct.getl_ES_COST_ALL()));
			}
			
			//�o�^�X�V�t���O(��\��)��0�F�����l�̏ꍇ��2�F�X�V��ݒ肷��B
			if("0".equals(struct.getl_FLAG())){
				struct.setl_FLAG("2");
			}
			struct.setl_ESTIMATE_NAME(this.multcombo("ESTIMATE_TYPE",struct.getl_ESTIMATE_TYP())); //[���ϖ���].�g��z�i�ڎ�h
			struct.setl_SPEC_CLASS1_NAME(this.multcombo("SPEC_CLASS_01",struct.getl_SPEC_CLASS1_TYP())); //[���ϖ���].�g���i�I��1�h
			struct.setl_SPEC_CLASS2_NAME(this.multcombo("SPEC_CLASS_02",struct.getl_SPEC_CLASS2_TYP())); //[���ϖ���].�g���i�I��2�h
			struct.setl_SPEC_SELECT1_NAME(this.multcombo("SPEC_SELECT_01",struct.getl_SPEC_SELECT1_TYP())); //[���ϖ���].�g�d�l�I��1�h
			struct.setl_SPEC_SELECT2_NAME(this.multcombo("SPEC_SELECT_02",struct.getl_SPEC_SELECT2_TYP())); //[���ϖ���].�g�d�l�I��2�h
			struct.setl_SPEC_SELECT3_NAME(this.multcombo("SPEC_SELECT_03",struct.getl_SPEC_SELECT3_TYP())); //[���ϖ���].�g�d�l�I��3�h
			struct.setl_SPEC_SELECT4_NAME(this.multcombo("SPEC_SELECT_04",struct.getl_SPEC_SELECT4_TYP())); //[���ϖ���].�g�d�l�I��4�h
			for(int i = 0; i < this.list.size(); i++){
				if (struct.getl_DETAL_NO().equals(((KM0020010Struct)list.get(i)).getl_DETAL_NO())){
					j = i;
				}
			}
			KM0020010Struct structtemp = new KM0020010Struct();
			structtemp = (KM0020010Struct)list.get(j);
			structtemp.copy(struct); 
			struct.setLIST_CNT(Integer.toString(list.size()));
		} catch(SQLException e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			setSqlExceptionMsg(e);
		}catch(Exception e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			throw ee;
		}
                //}}user_implement_dev:<controlupdateSub1>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlupdateSub1");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlcancelSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlcancelSub1");
			//{{user_implement_dev:<controlcancelSub1>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			struct.keycopy(_keyStruct);
			if (list != null){
				struct.setLIST_CNT(Integer.toString(list.size()));
			}else{
				struct.setLIST_CNT("0");
			}
                //}}user_implement_dev:<controlcancelSub1>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlcancelSub1");

		return;
	}

	/**
	 * ���p�Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlQ_Select() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlQ_Select");
			//{{user_implement_dev:<controlQ_Select>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			//���p�Č��ԍ��`�F�b�N
			//�Č����݃`�F�b�N
			List listQProject = entity.mCheckQUOTE_PROJECT_CD.read(conn, struct);
			if (listQProject == null || listQProject.size() != 1) {
				// �Ǎ��������s�F�Č������݂��܂���B
				Message = "T_PROJECT.PROJECT_CD:" + struct.getQUOTE_PROJECT_CD();
				setErrorMessage("KM00001", Message);
				return;
			}else{
				struct.seth_PROJECT_STAT(((KM0020010Struct)listQProject.get(0)).getPROJECT_STAT()); //[�Č�].�g�Č��X�e�[�^�X�h
				struct.setQUOTE_CUST_CD(((KM0020010Struct)listQProject.get(0)).getQUOTE_CUST_CD()); //[�Č�].�g���Ӑ�R�[�h�h
				struct.setQUOTE_CUR_CD(((KM0020010Struct)listQProject.get(0)).getQUOTE_CUR_CD()); //[�ʉ�].�g�ʉ݃R�[�h�h
				struct.setQUOTE_CUR_UNIT(((KM0020010Struct)listQProject.get(0)).getQUOTE_CUR_UNIT()); //[�ʉ�].�g�ʉݒP�ʁh
				//�Č��X�e�[�^�X�������̏ꍇ
				if ("1".equals(struct.geth_PROJECT_STAT())){
					Message = "T_PROJECT.PROJECT_CD:" + struct.getQUOTE_PROJECT_CD();
					setErrorMessage("KM00010", Message);
					return;
				}
				//���Ӑ�R�[�h�͓��Ӑ�ɑ��݂��Ȃ��ꍇ
				if (struct.getQUOTE_CUST_CD() == null){
					Message = "T_PROJECT.PROJECT_CD:" + struct.getQUOTE_PROJECT_CD();
					setErrorMessage("KQ00014", Message);
					return;
				}
				//�ʉ݃R�[�h�͒ʉ݂ɑ��݂��Ȃ��ꍇ
				if (struct.getQUOTE_CUR_CD() == null){
					Message = "T_PROJECT.PROJECT_CD:" + struct.getQUOTE_PROJECT_CD();
					setErrorMessage("KQ00073", Message);
					return;
				}
				//�擾�����u�ʉ݃R�[�h�v��[���].�g�ʉ݃R�[�h(��\��)�h�������łȂ��ꍇ
				if (!struct.getQUOTE_CUR_CD().equals(struct.geth_CUR_CD())){
					Message = "T_PROJECT.PROJECT_CD:" + struct.getQUOTE_PROJECT_CD();
					setErrorMessage("KM00017", Message);
					return;
				}
				struct.seth_PROJECT_CD(struct.getQUOTE_PROJECT_CD());
				//���p���ϔԍ���0�̏ꍇ�A�ő匩�ϔԍ����擾
				if ("0".equals(struct.getQUOTE_ESTIMATE_NO())){
					List listEstimate = entity.mSelectT_ESTIMATE.read(conn, struct);
					if (listEstimate.size() > 0) {
						struct.seth_ESTIMATE_NO(((KM0020010Struct)listEstimate.get(0)).geth_ESTIMATE_NO()); //[����].�g���ϔԍ��h
						struct.setQUOTE_ESTIMATE_NO(struct.geth_ESTIMATE_NO());
					}
				}else{
					struct.seth_ESTIMATE_NO(struct.getQUOTE_ESTIMATE_NO()); //[����].�g���ϔԍ��h
				}
				//���σw�b�_�̎擾
				List listHead = entity.mSelectHEAD.read(conn, struct);
				if (listHead.size() > 0) {
					struct.setESTIMATE_AMOUNT(((KM0020010Struct)listHead.get(0)).getESTIMATE_AMOUNT()); //[����].�g���ϋ��z���v�h
					struct.setESTIMATE_AMOUNT_JPN(((KM0020010Struct)listHead.get(0)).getESTIMATE_AMOUNT_JPN()); //[����].�g���ϋ��z���v�i�M�݁j�h
					struct.setES_COMMET1(((KM0020010Struct)listHead.get(0)).getES_COMMET1()); //[����].�g�w��[���h
					struct.setES_COMMET2(((KM0020010Struct)listHead.get(0)).getES_COMMET2()); //[����].�g�[�i�ꏊ�h
					struct.setES_COMMET4(((KM0020010Struct)listHead.get(0)).getES_COMMET4()); //[����].�g���x�������h
					struct.setES_COMMET3(((KM0020010Struct)listHead.get(0)).getES_COMMET3()); //[����].�g�ב��^����h
					struct.setES_COMMET5(((KM0020010Struct)listHead.get(0)).getES_COMMET5()); //[����].�g���ϗL�������h
					struct.setESREMARK1(((KM0020010Struct)listHead.get(0)).getESREMARK1()); //[����].�g���l1�h
					struct.setESREMARK2(((KM0020010Struct)listHead.get(0)).getESREMARK2()); //[����].�g���l2�h
					struct.setESREMARK3(((KM0020010Struct)listHead.get(0)).getESREMARK3()); //[����].�g���l3�h
					struct.setCUR_UNIT(struct.getQUOTE_CUR_UNIT()); //[�ʉ�].�g�ʉݒP�ʁh
				}
				 // �\���ő�s����������
				if(struct.getROW_COUNT() != null){
					list = entity.mSelectDETAIL_COUNT.read(conn, struct);
				    int maxLine = Integer.parseInt(struct.getROW_COUNT());
					long rowCount = Long.parseLong(((KM0020010Struct)list.get(0)).getl_COUNT());
					if (rowCount == maxLine + 1) {
		 				this.list.clear();
		 				ExpjMessage emsg = new ExpjMessage("ZZ01119", "" + maxLine);
						msgStruct.addError(emsg); // �G���[���b�Z�[�W�Ƃ��ēo�^
						sysLog.warning(emsg, getsysUSER_CD()); // �G���[���e

		 				if (list != null && list.size() > 0) {
		 					list.clear();
		 				}
		 				return;
		 			}
				}
				//���הԍ��ő�l���擾
				List listMax = entity.mSelectMAX_DETAIL_NO.read(conn, struct);
				if (listMax.size() > 0) {
					struct.seth_MAX_DETAL_NO(((KM0020010Struct)listMax.get(0)).geth_MAX_DETAL_NO()); //���הԍ��ő�l(��\��)
				}
				//���ϖ��ׂ̎擾
				list = entity.mSelectDETAIL.read(conn, struct);
				if (listHead.size() > 0) {
					KM0020010Struct TempStruct;
					for (int i = 0; i < this.list.size(); i++) {
						TempStruct = (KM0020010Struct)list.get(i);
						TempStruct.setl_CUR_UNIT(struct.getCUR_UNIT()); //[�ʉ�].�g�ʉݒP�ʁh
						TempStruct.setl_ESTIMATE_NAME(this.multcombo("ESTIMATE_TYPE",TempStruct.getl_ESTIMATE_TYP())); //[���ϖ���].�g��z�i�ڎ�h
						TempStruct.setl_SPEC_CLASS1_NAME(this.multcombo("SPEC_CLASS_01",TempStruct.getl_SPEC_CLASS1_TYP())); //[���ϖ���].�g���i�I��1�h
						TempStruct.setl_SPEC_CLASS2_NAME(this.multcombo("SPEC_CLASS_02",TempStruct.getl_SPEC_CLASS2_TYP())); //[���ϖ���].�g���i�I��2�h
						TempStruct.setl_SPEC_SELECT1_NAME(this.multcombo("SPEC_SELECT_01",TempStruct.getl_SPEC_SELECT1_TYP())); //[���ϖ���].�g�d�l�I��1�h
						TempStruct.setl_SPEC_SELECT2_NAME(this.multcombo("SPEC_SELECT_02",TempStruct.getl_SPEC_SELECT2_TYP())); //[���ϖ���].�g�d�l�I��2�h
						TempStruct.setl_SPEC_SELECT3_NAME(this.multcombo("SPEC_SELECT_03",TempStruct.getl_SPEC_SELECT3_TYP())); //[���ϖ���].�g�d�l�I��3�h
						TempStruct.setl_SPEC_SELECT4_NAME(this.multcombo("SPEC_SELECT_04",TempStruct.getl_SPEC_SELECT4_TYP())); //[���ϖ���].�g�d�l�I��4�h
						TempStruct.setl_FLAG("0"); //�o�^�X�V�t���O(��\��)
						//[���].�g���Ӑ�R�[�h�h(��\��)�@�� [���Ӑ�].�g���Ӑ�R�[�h�h�̏ꍇ�A�g���Ӑ�i�ڔԍ��h=null�A�g���Ӑ�i�ږ��́h=null
						if (!struct.getQUOTE_CUST_CD().equals(struct.geth_CUST_CD())){
							TempStruct.setl_CUST_ITEM_CD(null);
							TempStruct.setl_CUST_ITEM_NAME(null);
						}
					}
				}
			}
			if (list != null){
				struct.setLIST_CNT(Integer.toString(list.size()));
			}else{
				struct.setLIST_CNT("0");
			}
		} catch(SQLException e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			setSqlExceptionMsg(e);
		}
                //}}user_implement_dev:<controlQ_Select>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlQ_Select");

		return;
	}

	/**
	 * �s���ʃ{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlcopy() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlcopy");
			//{{user_implement_dev:<controlcopy>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			int listCnt = 0;
			 // �\���ő�s����������
			if(struct.getROW_COUNT() != null){
				int maxLine = Integer.parseInt(struct.getROW_COUNT());
				if (list != null){
					listCnt = list.size();
				}
				if (listCnt + 1 > maxLine) {
					ExpjMessage emsg = new ExpjMessage("ZZ01119", "" + maxLine);
					msgStruct.addError(emsg); // �G���[���b�Z�[�W�Ƃ��ēo�^
					sysLog.warning(emsg, getsysUSER_CD()); // �G���[���e
	 				return;
	 			}
			}
			//���הԍ� = ���C��[���].�g���הԍ��ő�l(��\��)�h+1
			struct.setl_DETAL_NO(Calculate.add(struct.geth_MAX_DETAL_NO(), "1"));
			// �L�[��ێ�
			_keyStruct.keycopy(struct);
			struct.seth_CALLBUTTON("1");
		} catch(Exception e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			throw ee;
		}
                //}}user_implement_dev:<controlcopy>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlcopy");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			// �f�[�^�x�[�X�ւ̃A�N�Z�X���s���ꍇ�́A����try catch���̃R�����g���O���Ă��������B
		try{
			//��ʏ����������擾����
			ScreenParam sp = new ScreenParam(this.getClass());
		    int maxLine = sp.getMaxLine(conn, 10);
		    if (maxLine != 0){
				struct.setROW_COUNT(String.valueOf(maxLine));
		    }else{
				struct.setROW_COUNT(null);
		    }
		    //�Ɩ����t �� ���t�v�Z�p�H��R�[�h �̎擾
		    List listDate = entity.mSelectBUSINESS_DATE.read(conn,struct);
			if(listDate == null || listDate.size() != 1){
				//�擾�ł��Ȃ������ꍇ
				//�G���[���b�Z�[�W�o��
				ExpjMessage emsg = new ExpjMessage("KQ00026");
				msgStruct.addError(emsg);	// �G���[���b�Z�[�W�Ƃ��ēo�^
				sysLog.severe(emsg, getsysUSER_CD()); //�G���[���e
				ExpjException ee = new ExpjException(emsg);
				throw ee;
			}else{
				struct.setBUSINESS_DATE(((KM0020010Struct)listDate.get(0)).getBUSINESS_DATE());
			}
			//�M�݃R�[�h���擾����B
		    List listHomeCur = entity.mSelectCUR.read(conn,struct);
			if(listHomeCur == null || listHomeCur.size() != 1){
				//�擾�ł��Ȃ������ꍇ
				//�G���[���b�Z�[�W�o��
				ExpjMessage emsg = new ExpjMessage("KQ00041");
				msgStruct.addError(emsg);	// �G���[���b�Z�[�W�Ƃ��ēo�^
				sysLog.severe(emsg, getsysUSER_CD()); //�G���[���e
				ExpjException ee = new ExpjException(emsg);
				throw ee;
			}else{
				struct.setHOME_CUR_CD(((KM0020010Struct)listHomeCur.get(0)).getHOME_CUR_CD());
			}
			// ��ЃR�[�h�̎擾
			List listCompanyCd = entity.mSelectSYS_MY_COMPANY.read(conn,struct);
			if(listCompanyCd == null || listCompanyCd.size() != 1){
				//��Џ�񂪖���/������
				//�G���[���b�Z�[�W�o��
				ExpjMessage emsg = new ExpjMessage("KQ00039");
				msgStruct.addError(emsg);	// �G���[���b�Z�[�W�Ƃ��ēo�^
				sysLog.severe(emsg, getsysUSER_CD()); //�G���[���e
				ExpjException ee = new ExpjException(emsg);
				throw ee;
			}else{
				struct.setCOMPANY_CD(((KM0020010Struct)listCompanyCd.get(0)).getCOMPANY_CD());
			}
			//���σX�e�[�^�X   0:���ϒ�
			struct.setESTIMATE_STAT(this.multcombo("ESTIMATE_STAT","0")); 
			struct.setESTIMATE_ST("0");
			//���ϓ�   �Ɩ��^�p��
			struct.setESTIMATE_DATE(struct.getBUSINESS_DATE()); 
			//���הԍ��ő�l(��\��) 0
			struct.seth_MAX_DETAL_NO("0"); 
			struct.setLIST_CNT("0");
			struct.seth_CALLBUTTON("0");
			// ��ʑJ�ڂ̌Ăяo����������AStruct�ɉ�ʑJ�ڃL�[��ݒ肵��controlSelect()���Ăяo��
			if ( isScreenMove() == true ) {
				struct.setPROJECT_CD(getProjectCd());
				struct.setESTIMATE_NO(getEstimateNo());
				// �����̃R���g���[�����\�b�h���Ăяo���܂��B
				controlSelect();
			}

			// �f�[�^�x�[�X�ւ̃A�N�Z�X���s���ꍇ�́A����try catch���̃R�����g���O���Ă��������B
		} catch(SQLException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			setSqlExceptionMsg(e); 
		}

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			// �R���{�{�b�N�X���i�̃f�[�^�̃Z�b�g�͂����ɋL�q���Ă��������B
			try{
			    ComboBox comboController = new ComboBox(conn, sysUSER_CD);
			    ComboStruct ESTIMATE_TYPE = comboController.getData("ESTIMATE_TYPE");
			    struct.setList_l_ESTIMATE_TYP_val(ESTIMATE_TYPE.getValList());
			    struct.setList_l_ESTIMATE_TYP_name(ESTIMATE_TYPE.getExplanList());
			    
			    ComboStruct SPEC_CLASS1 = comboController.getData("SPEC_CLASS_01");
			    struct.setList_l_SPEC_CLASS1_TYP_val(SPEC_CLASS1.getValList());
			    struct.setList_l_SPEC_CLASS1_TYP_name(SPEC_CLASS1.getExplanList());
			    
			    ComboStruct SPEC_CLASS2 = comboController.getData("SPEC_CLASS_02");
			    struct.setList_l_SPEC_CLASS2_TYP_val(SPEC_CLASS2.getValList());
			    struct.setList_l_SPEC_CLASS2_TYP_name(SPEC_CLASS2.getExplanList());
			    
			    ComboStruct SPEC_SELECT1 = comboController.getData("SPEC_SELECT_01");
			    struct.setList_l_SPEC_SELECT1_TYP_val(SPEC_SELECT1.getValList());
			    struct.setList_l_SPEC_SELECT1_TYP_name(SPEC_SELECT1.getExplanList());
			    
			    ComboStruct SPEC_SELECT2 = comboController.getData("SPEC_SELECT_02");
			    struct.setList_l_SPEC_SELECT2_TYP_val(SPEC_SELECT2.getValList());
			    struct.setList_l_SPEC_SELECT2_TYP_name(SPEC_SELECT2.getExplanList());
			    
			    ComboStruct SPEC_SELECT3 = comboController.getData("SPEC_SELECT_03");
			    struct.setList_l_SPEC_SELECT3_TYP_val(SPEC_SELECT3.getValList());
			    struct.setList_l_SPEC_SELECT3_TYP_name(SPEC_SELECT3.getExplanList());
			    
			    ComboStruct SPEC_SELECT4 = comboController.getData("SPEC_SELECT_04");
			    struct.setList_l_SPEC_SELECT4_TYP_val(SPEC_SELECT4.getValList());
			    struct.setList_l_SPEC_SELECT4_TYP_name(SPEC_SELECT4.getExplanList());
			} catch(SQLException e) {
				e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			}
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("KM0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Total") ) {
				controlTotal();
			} else if( button.equals("append") ) {
				controlappend();
			} else if( button.equals("modify") ) {
				controlmodify();
			} else if( button.equals("erase") ) {
				controlerase();
			} else if( button.equals("print") ) {
				controlprint();
			} else if( button.equals("insert") ) {
				controlinsert();
			} else if( button.equals("update") ) {
				controlupdate();
			} else if( button.equals("delete") ) {
				controldelete();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("SelectUnitCost") ) {
				controlSelectUnitCost();
			} else if( button.equals("LcConversion") ) {
				controlLcConversion();
			} else if( button.equals("insertSub1") ) {
				controlinsertSub1();
			} else if( button.equals("updateSub1") ) {
				controlupdateSub1();
			} else if( button.equals("cancelSub1") ) {
				controlcancelSub1();
			} else if( button.equals("Q_Select") ) {
				controlQ_Select();
			} else if( button.equals("copy") ) {
				controlcopy();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
//		�\�[�X���ɂ܂�AlarmMessageException���c���Ă���ꍇ�́A�ȉ��̍s�̃R�����g���O����AlarmMessageException���n������B
//		} catch(AlarmMessageException ame){
//			ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
//			throw ee;
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// �g���b�Z�[�W�o�͈˗��쐬
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("KM0020010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KM0020010-E999","CSV�̏o�͏���"));
			throw new FoundationException("KM0020010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KM0020010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("KM0020010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KM0020010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("KM0020010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected KM0020010Entity entity;
	protected KM0020010Struct struct;
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

		entity = new KM0020010Entity();
		struct = new KM0020010Struct();

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
	 * KM0020010�N���X�̕W���R���X�g���N�^
	 */
	public KM0020010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
			// TODO: �����ɏ����������L�q���Ă�������
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
				KM0020010Struct key = (KM0020010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("l_CUR_UNIT") && key.getl_CUR_UNIT() != null) {
					msgKey.setKeyValue("l_CUR_UNIT", key.getl_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("l_FLAG") && key.getl_FLAG() != null) {
					msgKey.setKeyValue("l_FLAG", key.getl_FLAG());
				}
				if(msgKeyType.containsKeyColumn("QUOTE_ESTIMATE_NO") && key.getQUOTE_ESTIMATE_NO() != null) {
					msgKey.setKeyValue("QUOTE_ESTIMATE_NO", key.getQUOTE_ESTIMATE_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ESTIMATE_NAME") && key.getl_ESTIMATE_NAME() != null) {
					msgKey.setKeyValue("l_ESTIMATE_NAME", key.getl_ESTIMATE_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_CLASS1_NAME") && key.getl_SPEC_CLASS1_NAME() != null) {
					msgKey.setKeyValue("l_SPEC_CLASS1_NAME", key.getl_SPEC_CLASS1_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_CLASS2_NAME") && key.getl_SPEC_CLASS2_NAME() != null) {
					msgKey.setKeyValue("l_SPEC_CLASS2_NAME", key.getl_SPEC_CLASS2_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_SELECT1_NAME") && key.getl_SPEC_SELECT1_NAME() != null) {
					msgKey.setKeyValue("l_SPEC_SELECT1_NAME", key.getl_SPEC_SELECT1_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_SELECT2_NAME") && key.getl_SPEC_SELECT2_NAME() != null) {
					msgKey.setKeyValue("l_SPEC_SELECT2_NAME", key.getl_SPEC_SELECT2_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_SELECT3_NAME") && key.getl_SPEC_SELECT3_NAME() != null) {
					msgKey.setKeyValue("l_SPEC_SELECT3_NAME", key.getl_SPEC_SELECT3_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_SELECT4_NAME") && key.getl_SPEC_SELECT4_NAME() != null) {
					msgKey.setKeyValue("l_SPEC_SELECT4_NAME", key.getl_SPEC_SELECT4_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_ESTIMATE_TYP_name") && key.getl_ESTIMATE_TYP_name() != null) {
					msgKey.setKeyValue("l_ESTIMATE_TYP_name", key.getl_ESTIMATE_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("l_ESTIMATE_TYP_val") && key.getl_ESTIMATE_TYP_val() != null) {
					msgKey.setKeyValue("l_ESTIMATE_TYP_val", key.getl_ESTIMATE_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_CLASS1_TYP_name") && key.getl_SPEC_CLASS1_TYP_name() != null) {
					msgKey.setKeyValue("l_SPEC_CLASS1_TYP_name", key.getl_SPEC_CLASS1_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_CLASS1_TYP_val") && key.getl_SPEC_CLASS1_TYP_val() != null) {
					msgKey.setKeyValue("l_SPEC_CLASS1_TYP_val", key.getl_SPEC_CLASS1_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_CLASS2_TYP_name") && key.getl_SPEC_CLASS2_TYP_name() != null) {
					msgKey.setKeyValue("l_SPEC_CLASS2_TYP_name", key.getl_SPEC_CLASS2_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_CLASS2_TYP_val") && key.getl_SPEC_CLASS2_TYP_val() != null) {
					msgKey.setKeyValue("l_SPEC_CLASS2_TYP_val", key.getl_SPEC_CLASS2_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_SELECT1_TYP_name") && key.getl_SPEC_SELECT1_TYP_name() != null) {
					msgKey.setKeyValue("l_SPEC_SELECT1_TYP_name", key.getl_SPEC_SELECT1_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_SELECT1_TYP_val") && key.getl_SPEC_SELECT1_TYP_val() != null) {
					msgKey.setKeyValue("l_SPEC_SELECT1_TYP_val", key.getl_SPEC_SELECT1_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_SELECT2_TYP_name") && key.getl_SPEC_SELECT2_TYP_name() != null) {
					msgKey.setKeyValue("l_SPEC_SELECT2_TYP_name", key.getl_SPEC_SELECT2_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_SELECT2_TYP_val") && key.getl_SPEC_SELECT2_TYP_val() != null) {
					msgKey.setKeyValue("l_SPEC_SELECT2_TYP_val", key.getl_SPEC_SELECT2_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_SELECT3_TYP_name") && key.getl_SPEC_SELECT3_TYP_name() != null) {
					msgKey.setKeyValue("l_SPEC_SELECT3_TYP_name", key.getl_SPEC_SELECT3_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_SELECT3_TYP_val") && key.getl_SPEC_SELECT3_TYP_val() != null) {
					msgKey.setKeyValue("l_SPEC_SELECT3_TYP_val", key.getl_SPEC_SELECT3_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_SELECT4_TYP_name") && key.getl_SPEC_SELECT4_TYP_name() != null) {
					msgKey.setKeyValue("l_SPEC_SELECT4_TYP_name", key.getl_SPEC_SELECT4_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_SELECT4_TYP_val") && key.getl_SPEC_SELECT4_TYP_val() != null) {
					msgKey.setKeyValue("l_SPEC_SELECT4_TYP_val", key.getl_SPEC_SELECT4_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("LIST_CNT") && key.getLIST_CNT() != null) {
					msgKey.setKeyValue("LIST_CNT", key.getLIST_CNT());
				}
				if(msgKeyType.containsKeyColumn("h_ESTIMATE_NO") && key.geth_ESTIMATE_NO() != null) {
					msgKey.setKeyValue("h_ESTIMATE_NO", key.geth_ESTIMATE_NO());
				}
				if(msgKeyType.containsKeyColumn("h_UNOFFICIAL_RECEIPT_FLAG") && key.geth_UNOFFICIAL_RECEIPT_FLAG() != null) {
					msgKey.setKeyValue("h_UNOFFICIAL_RECEIPT_FLAG", key.geth_UNOFFICIAL_RECEIPT_FLAG());
				}
				if(msgKeyType.containsKeyColumn("h_PROJECT_STAT") && key.geth_PROJECT_STAT() != null) {
					msgKey.setKeyValue("h_PROJECT_STAT", key.geth_PROJECT_STAT());
				}
				if(msgKeyType.containsKeyColumn("h_CALLBUTTON") && key.geth_CALLBUTTON() != null) {
					msgKey.setKeyValue("h_CALLBUTTON", key.geth_CALLBUTTON());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_NAME") && key.getPROJECT_NAME() != null) {
					msgKey.setKeyValue("PROJECT_NAME", key.getPROJECT_NAME());
				}
				if(msgKeyType.containsKeyColumn("h_CUST_CD") && key.geth_CUST_CD() != null) {
					msgKey.setKeyValue("h_CUST_CD", key.geth_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("ES_ORG_CD") && key.getES_ORG_CD() != null) {
					msgKey.setKeyValue("ES_ORG_CD", key.getES_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("ES_USER_CD") && key.getES_USER_CD() != null) {
					msgKey.setKeyValue("ES_USER_CD", key.getES_USER_CD());
				}
				if(msgKeyType.containsKeyColumn("ORG_NAME") && key.getORG_NAME() != null) {
					msgKey.setKeyValue("ORG_NAME", key.getORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("USER_NAME") && key.getUSER_NAME() != null) {
					msgKey.setKeyValue("USER_NAME", key.getUSER_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_STAT") && key.getPROJECT_STAT() != null) {
					msgKey.setKeyValue("PROJECT_STAT", key.getPROJECT_STAT());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT_PJ") && key.getMODIFY_COUNT_PJ() != null) {
					msgKey.setKeyValue("MODIFY_COUNT_PJ", key.getMODIFY_COUNT_PJ());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_CD") && key.getPROJECT_CD() != null) {
					msgKey.setKeyValue("PROJECT_CD", key.getPROJECT_CD());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_NAME") && key.getCUST_NAME() != null) {
					msgKey.setKeyValue("CUST_NAME", key.getCUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("h_CUR_CD") && key.geth_CUR_CD() != null) {
					msgKey.setKeyValue("h_CUR_CD", key.geth_CUR_CD());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP") && key.getEXCH_TYP() != null) {
					msgKey.setKeyValue("EXCH_TYP", key.getEXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("DETAIL_ROUND_TYP") && key.getDETAIL_ROUND_TYP() != null) {
					msgKey.setKeyValue("DETAIL_ROUND_TYP", key.getDETAIL_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("CUR_UNIT") && key.getCUR_UNIT() != null) {
					msgKey.setKeyValue("CUR_UNIT", key.getCUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("h_PROJECT_CD") && key.geth_PROJECT_CD() != null) {
					msgKey.setKeyValue("h_PROJECT_CD", key.geth_PROJECT_CD());
				}
				if(msgKeyType.containsKeyColumn("ESTIMATE_STAT") && key.getESTIMATE_STAT() != null) {
					msgKey.setKeyValue("ESTIMATE_STAT", key.getESTIMATE_STAT());
				}
				if(msgKeyType.containsKeyColumn("UNOFFICIAL_RECEIPT_FLG") && key.getUNOFFICIAL_RECEIPT_FLG() != null) {
					msgKey.setKeyValue("UNOFFICIAL_RECEIPT_FLG", key.getUNOFFICIAL_RECEIPT_FLG());
				}
				if(msgKeyType.containsKeyColumn("ESTIMATE_DATE") && key.getESTIMATE_DATE() != null) {
					msgKey.setKeyValue("ESTIMATE_DATE", key.getESTIMATE_DATE());
				}
				if(msgKeyType.containsKeyColumn("ESTIMATE_AMOUNT") && key.getESTIMATE_AMOUNT() != null) {
					msgKey.setKeyValue("ESTIMATE_AMOUNT", key.getESTIMATE_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("ESTIMATE_AMOUNT_JPN") && key.getESTIMATE_AMOUNT_JPN() != null) {
					msgKey.setKeyValue("ESTIMATE_AMOUNT_JPN", key.getESTIMATE_AMOUNT_JPN());
				}
				if(msgKeyType.containsKeyColumn("ES_COMMET1") && key.getES_COMMET1() != null) {
					msgKey.setKeyValue("ES_COMMET1", key.getES_COMMET1());
				}
				if(msgKeyType.containsKeyColumn("ES_COMMET2") && key.getES_COMMET2() != null) {
					msgKey.setKeyValue("ES_COMMET2", key.getES_COMMET2());
				}
				if(msgKeyType.containsKeyColumn("ES_COMMET4") && key.getES_COMMET4() != null) {
					msgKey.setKeyValue("ES_COMMET4", key.getES_COMMET4());
				}
				if(msgKeyType.containsKeyColumn("ES_COMMET3") && key.getES_COMMET3() != null) {
					msgKey.setKeyValue("ES_COMMET3", key.getES_COMMET3());
				}
				if(msgKeyType.containsKeyColumn("ES_COMMET5") && key.getES_COMMET5() != null) {
					msgKey.setKeyValue("ES_COMMET5", key.getES_COMMET5());
				}
				if(msgKeyType.containsKeyColumn("ESREMARK1") && key.getESREMARK1() != null) {
					msgKey.setKeyValue("ESREMARK1", key.getESREMARK1());
				}
				if(msgKeyType.containsKeyColumn("ESREMARK2") && key.getESREMARK2() != null) {
					msgKey.setKeyValue("ESREMARK2", key.getESREMARK2());
				}
				if(msgKeyType.containsKeyColumn("ESREMARK3") && key.getESREMARK3() != null) {
					msgKey.setKeyValue("ESREMARK3", key.getESREMARK3());
				}
				if(msgKeyType.containsKeyColumn("ZIP_CD") && key.getZIP_CD() != null) {
					msgKey.setKeyValue("ZIP_CD", key.getZIP_CD());
				}
				if(msgKeyType.containsKeyColumn("ADDRESS_1") && key.getADDRESS_1() != null) {
					msgKey.setKeyValue("ADDRESS_1", key.getADDRESS_1());
				}
				if(msgKeyType.containsKeyColumn("ADDRESS_2") && key.getADDRESS_2() != null) {
					msgKey.setKeyValue("ADDRESS_2", key.getADDRESS_2());
				}
				if(msgKeyType.containsKeyColumn("TEL") && key.getTEL() != null) {
					msgKey.setKeyValue("TEL", key.getTEL());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT_ES") && key.getMODIFY_COUNT_ES() != null) {
					msgKey.setKeyValue("MODIFY_COUNT_ES", key.getMODIFY_COUNT_ES());
				}
				if(msgKeyType.containsKeyColumn("l_DETAL_NO") && key.getl_DETAL_NO() != null) {
					msgKey.setKeyValue("l_DETAL_NO", key.getl_DETAL_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ESTIMATE_TYP") && key.getl_ESTIMATE_TYP() != null) {
					msgKey.setKeyValue("l_ESTIMATE_TYP", key.getl_ESTIMATE_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_ITEM_CD") && key.getl_CUST_ITEM_CD() != null) {
					msgKey.setKeyValue("l_CUST_ITEM_CD", key.getl_CUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_NAME") && key.getl_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ITEM_NAME", key.getl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_DESINATED_DLV_DATE") && key.getl_DESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("l_DESINATED_DLV_DATE", key.getl_DESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ESTIMATE_QTY") && key.getl_ESTIMATE_QTY() != null) {
					msgKey.setKeyValue("l_ESTIMATE_QTY", key.getl_ESTIMATE_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_CD") && key.getl_UNIT_CD() != null) {
					msgKey.setKeyValue("l_UNIT_CD", key.getl_UNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_PRICE") && key.getl_UNIT_PRICE() != null) {
					msgKey.setKeyValue("l_UNIT_PRICE", key.getl_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("l_DISCOUNT_PRICE") && key.getl_DISCOUNT_PRICE() != null) {
					msgKey.setKeyValue("l_DISCOUNT_PRICE", key.getl_DISCOUNT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("l_ESTIMATE_UNIT_PRICE") && key.getl_ESTIMATE_UNIT_PRICE() != null) {
					msgKey.setKeyValue("l_ESTIMATE_UNIT_PRICE", key.getl_ESTIMATE_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("l_AMOUNT") && key.getl_AMOUNT() != null) {
					msgKey.setKeyValue("l_AMOUNT", key.getl_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_DISCOUNT_AMOUNT") && key.getl_DISCOUNT_AMOUNT() != null) {
					msgKey.setKeyValue("l_DISCOUNT_AMOUNT", key.getl_DISCOUNT_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_ESTIMATE_AMOUNT") && key.getl_ESTIMATE_AMOUNT() != null) {
					msgKey.setKeyValue("l_ESTIMATE_AMOUNT", key.getl_ESTIMATE_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_ESTIMATE_AMOUNT_JPN") && key.getl_ESTIMATE_AMOUNT_JPN() != null) {
					msgKey.setKeyValue("l_ESTIMATE_AMOUNT_JPN", key.getl_ESTIMATE_AMOUNT_JPN());
				}
				if(msgKeyType.containsKeyColumn("l_ESTIMATE_GAIN") && key.getl_ESTIMATE_GAIN() != null) {
					msgKey.setKeyValue("l_ESTIMATE_GAIN", key.getl_ESTIMATE_GAIN());
				}
				if(msgKeyType.containsKeyColumn("l_ES_COST_MATERIAL") && key.getl_ES_COST_MATERIAL() != null) {
					msgKey.setKeyValue("l_ES_COST_MATERIAL", key.getl_ES_COST_MATERIAL());
				}
				if(msgKeyType.containsKeyColumn("l_ES_COST_PROCESS") && key.getl_ES_COST_PROCESS() != null) {
					msgKey.setKeyValue("l_ES_COST_PROCESS", key.getl_ES_COST_PROCESS());
				}
				if(msgKeyType.containsKeyColumn("l_ES_COST_OUTSOUCE") && key.getl_ES_COST_OUTSOUCE() != null) {
					msgKey.setKeyValue("l_ES_COST_OUTSOUCE", key.getl_ES_COST_OUTSOUCE());
				}
				if(msgKeyType.containsKeyColumn("l_ES_COST_ETC") && key.getl_ES_COST_ETC() != null) {
					msgKey.setKeyValue("l_ES_COST_ETC", key.getl_ES_COST_ETC());
				}
				if(msgKeyType.containsKeyColumn("l_ES_COST_SERVICE") && key.getl_ES_COST_SERVICE() != null) {
					msgKey.setKeyValue("l_ES_COST_SERVICE", key.getl_ES_COST_SERVICE());
				}
				if(msgKeyType.containsKeyColumn("l_ES_COST_ALL") && key.getl_ES_COST_ALL() != null) {
					msgKey.setKeyValue("l_ES_COST_ALL", key.getl_ES_COST_ALL());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_CLASS1_TYP") && key.getl_SPEC_CLASS1_TYP() != null) {
					msgKey.setKeyValue("l_SPEC_CLASS1_TYP", key.getl_SPEC_CLASS1_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_CLASS2_TYP") && key.getl_SPEC_CLASS2_TYP() != null) {
					msgKey.setKeyValue("l_SPEC_CLASS2_TYP", key.getl_SPEC_CLASS2_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_SELECT1_TYP") && key.getl_SPEC_SELECT1_TYP() != null) {
					msgKey.setKeyValue("l_SPEC_SELECT1_TYP", key.getl_SPEC_SELECT1_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_SELECT2_TYP") && key.getl_SPEC_SELECT2_TYP() != null) {
					msgKey.setKeyValue("l_SPEC_SELECT2_TYP", key.getl_SPEC_SELECT2_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_SELECT3_TYP") && key.getl_SPEC_SELECT3_TYP() != null) {
					msgKey.setKeyValue("l_SPEC_SELECT3_TYP", key.getl_SPEC_SELECT3_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_SPEC_SELECT4_TYP") && key.getl_SPEC_SELECT4_TYP() != null) {
					msgKey.setKeyValue("l_SPEC_SELECT4_TYP", key.getl_SPEC_SELECT4_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_REMARKS") && key.getl_REMARKS() != null) {
					msgKey.setKeyValue("l_REMARKS", key.getl_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_COST") && key.getl_UNIT_COST() != null) {
					msgKey.setKeyValue("l_UNIT_COST", key.getl_UNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_ITEM_NAME") && key.getl_CUST_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_CUST_ITEM_NAME", key.getl_CUST_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("h_MAX_DETAL_NO") && key.geth_MAX_DETAL_NO() != null) {
					msgKey.setKeyValue("h_MAX_DETAL_NO", key.geth_MAX_DETAL_NO());
				}
				if(msgKeyType.containsKeyColumn("l_COUNT") && key.getl_COUNT() != null) {
					msgKey.setKeyValue("l_COUNT", key.getl_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ROW_COUNT") && key.getROW_COUNT() != null) {
					msgKey.setKeyValue("ROW_COUNT", key.getROW_COUNT());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_DATE") && key.getBUSINESS_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_DATE", key.getBUSINESS_DATE());
				}
				if(msgKeyType.containsKeyColumn("HOME_CUR_CD") && key.getHOME_CUR_CD() != null) {
					msgKey.setKeyValue("HOME_CUR_CD", key.getHOME_CUR_CD());
				}
				if(msgKeyType.containsKeyColumn("QUOTE_CUST_CD") && key.getQUOTE_CUST_CD() != null) {
					msgKey.setKeyValue("QUOTE_CUST_CD", key.getQUOTE_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("QUOTE_CUR_CD") && key.getQUOTE_CUR_CD() != null) {
					msgKey.setKeyValue("QUOTE_CUR_CD", key.getQUOTE_CUR_CD());
				}
				if(msgKeyType.containsKeyColumn("QUOTE_CUR_UNIT") && key.getQUOTE_CUR_UNIT() != null) {
					msgKey.setKeyValue("QUOTE_CUR_UNIT", key.getQUOTE_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("QUOTE_PROJECT_CD") && key.getQUOTE_PROJECT_CD() != null) {
					msgKey.setKeyValue("QUOTE_PROJECT_CD", key.getQUOTE_PROJECT_CD());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST") && key.getUNIT_COST() != null) {
					msgKey.setKeyValue("UNIT_COST", key.getUNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("ESTIMATE_NO") && key.getESTIMATE_NO() != null) {
					msgKey.setKeyValue("ESTIMATE_NO", key.getESTIMATE_NO());
				}
				if(msgKeyType.containsKeyColumn("UNOFFICIAL_RECEIPT_FLAG") && key.getUNOFFICIAL_RECEIPT_FLAG() != null) {
					msgKey.setKeyValue("UNOFFICIAL_RECEIPT_FLAG", key.getUNOFFICIAL_RECEIPT_FLAG());
				}
				if(msgKeyType.containsKeyColumn("ESTIMATE_ST") && key.getESTIMATE_ST() != null) {
					msgKey.setKeyValue("ESTIMATE_ST", key.getESTIMATE_ST());
				}
				if(msgKeyType.containsKeyColumn("USER") && key.getUSER() != null) {
					msgKey.setKeyValue("USER", key.getUSER());
				}
				if(msgKeyType.containsKeyColumn("PROGRAM_NAME") && key.getPROGRAM_NAME() != null) {
					msgKey.setKeyValue("PROGRAM_NAME", key.getPROGRAM_NAME());
				}
				if(msgKeyType.containsKeyColumn("h_ESTIMATE_ST") && key.geth_ESTIMATE_ST() != null) {
					msgKey.setKeyValue("h_ESTIMATE_ST", key.geth_ESTIMATE_ST());
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
					KM0020010Struct key = new KM0020010Struct();
					if(msgKeyType.containsKeyColumn("l_CUR_UNIT")) {
						key.setl_CUR_UNIT(msgKey.getKeyValue("l_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("l_FLAG")) {
						key.setl_FLAG(msgKey.getKeyValue("l_FLAG"));
					}
					if(msgKeyType.containsKeyColumn("QUOTE_ESTIMATE_NO")) {
						key.setQUOTE_ESTIMATE_NO(msgKey.getKeyValue("QUOTE_ESTIMATE_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ESTIMATE_NAME")) {
						key.setl_ESTIMATE_NAME(msgKey.getKeyValue("l_ESTIMATE_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_CLASS1_NAME")) {
						key.setl_SPEC_CLASS1_NAME(msgKey.getKeyValue("l_SPEC_CLASS1_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_CLASS2_NAME")) {
						key.setl_SPEC_CLASS2_NAME(msgKey.getKeyValue("l_SPEC_CLASS2_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_SELECT1_NAME")) {
						key.setl_SPEC_SELECT1_NAME(msgKey.getKeyValue("l_SPEC_SELECT1_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_SELECT2_NAME")) {
						key.setl_SPEC_SELECT2_NAME(msgKey.getKeyValue("l_SPEC_SELECT2_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_SELECT3_NAME")) {
						key.setl_SPEC_SELECT3_NAME(msgKey.getKeyValue("l_SPEC_SELECT3_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_SELECT4_NAME")) {
						key.setl_SPEC_SELECT4_NAME(msgKey.getKeyValue("l_SPEC_SELECT4_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_ESTIMATE_TYP_name")) {
						key.setl_ESTIMATE_TYP_name(msgKey.getKeyValue("l_ESTIMATE_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("l_ESTIMATE_TYP_val")) {
						key.setl_ESTIMATE_TYP_val(msgKey.getKeyValue("l_ESTIMATE_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_CLASS1_TYP_name")) {
						key.setl_SPEC_CLASS1_TYP_name(msgKey.getKeyValue("l_SPEC_CLASS1_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_CLASS1_TYP_val")) {
						key.setl_SPEC_CLASS1_TYP_val(msgKey.getKeyValue("l_SPEC_CLASS1_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_CLASS2_TYP_name")) {
						key.setl_SPEC_CLASS2_TYP_name(msgKey.getKeyValue("l_SPEC_CLASS2_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_CLASS2_TYP_val")) {
						key.setl_SPEC_CLASS2_TYP_val(msgKey.getKeyValue("l_SPEC_CLASS2_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_SELECT1_TYP_name")) {
						key.setl_SPEC_SELECT1_TYP_name(msgKey.getKeyValue("l_SPEC_SELECT1_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_SELECT1_TYP_val")) {
						key.setl_SPEC_SELECT1_TYP_val(msgKey.getKeyValue("l_SPEC_SELECT1_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_SELECT2_TYP_name")) {
						key.setl_SPEC_SELECT2_TYP_name(msgKey.getKeyValue("l_SPEC_SELECT2_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_SELECT2_TYP_val")) {
						key.setl_SPEC_SELECT2_TYP_val(msgKey.getKeyValue("l_SPEC_SELECT2_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_SELECT3_TYP_name")) {
						key.setl_SPEC_SELECT3_TYP_name(msgKey.getKeyValue("l_SPEC_SELECT3_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_SELECT3_TYP_val")) {
						key.setl_SPEC_SELECT3_TYP_val(msgKey.getKeyValue("l_SPEC_SELECT3_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_SELECT4_TYP_name")) {
						key.setl_SPEC_SELECT4_TYP_name(msgKey.getKeyValue("l_SPEC_SELECT4_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_SELECT4_TYP_val")) {
						key.setl_SPEC_SELECT4_TYP_val(msgKey.getKeyValue("l_SPEC_SELECT4_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("LIST_CNT")) {
						key.setLIST_CNT(msgKey.getKeyValue("LIST_CNT"));
					}
					if(msgKeyType.containsKeyColumn("h_ESTIMATE_NO")) {
						key.seth_ESTIMATE_NO(msgKey.getKeyValue("h_ESTIMATE_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_UNOFFICIAL_RECEIPT_FLAG")) {
						key.seth_UNOFFICIAL_RECEIPT_FLAG(msgKey.getKeyValue("h_UNOFFICIAL_RECEIPT_FLAG"));
					}
					if(msgKeyType.containsKeyColumn("h_PROJECT_STAT")) {
						key.seth_PROJECT_STAT(msgKey.getKeyValue("h_PROJECT_STAT"));
					}
					if(msgKeyType.containsKeyColumn("h_CALLBUTTON")) {
						key.seth_CALLBUTTON(msgKey.getKeyValue("h_CALLBUTTON"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_NAME")) {
						key.setPROJECT_NAME(msgKey.getKeyValue("PROJECT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("h_CUST_CD")) {
						key.seth_CUST_CD(msgKey.getKeyValue("h_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("ES_ORG_CD")) {
						key.setES_ORG_CD(msgKey.getKeyValue("ES_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("ES_USER_CD")) {
						key.setES_USER_CD(msgKey.getKeyValue("ES_USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("ORG_NAME")) {
						key.setORG_NAME(msgKey.getKeyValue("ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("USER_NAME")) {
						key.setUSER_NAME(msgKey.getKeyValue("USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_STAT")) {
						key.setPROJECT_STAT(msgKey.getKeyValue("PROJECT_STAT"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT_PJ")) {
						key.setMODIFY_COUNT_PJ(msgKey.getKeyValue("MODIFY_COUNT_PJ"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_CD")) {
						key.setPROJECT_CD(msgKey.getKeyValue("PROJECT_CD"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_NAME")) {
						key.setCUST_NAME(msgKey.getKeyValue("CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("h_CUR_CD")) {
						key.seth_CUR_CD(msgKey.getKeyValue("h_CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP")) {
						key.setEXCH_TYP(msgKey.getKeyValue("EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DETAIL_ROUND_TYP")) {
						key.setDETAIL_ROUND_TYP(msgKey.getKeyValue("DETAIL_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CUR_UNIT")) {
						key.setCUR_UNIT(msgKey.getKeyValue("CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("h_PROJECT_CD")) {
						key.seth_PROJECT_CD(msgKey.getKeyValue("h_PROJECT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ESTIMATE_STAT")) {
						key.setESTIMATE_STAT(msgKey.getKeyValue("ESTIMATE_STAT"));
					}
					if(msgKeyType.containsKeyColumn("UNOFFICIAL_RECEIPT_FLG")) {
						key.setUNOFFICIAL_RECEIPT_FLG(msgKey.getKeyValue("UNOFFICIAL_RECEIPT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ESTIMATE_DATE")) {
						key.setESTIMATE_DATE(msgKey.getKeyValue("ESTIMATE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ESTIMATE_AMOUNT")) {
						key.setESTIMATE_AMOUNT(msgKey.getKeyValue("ESTIMATE_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("ESTIMATE_AMOUNT_JPN")) {
						key.setESTIMATE_AMOUNT_JPN(msgKey.getKeyValue("ESTIMATE_AMOUNT_JPN"));
					}
					if(msgKeyType.containsKeyColumn("ES_COMMET1")) {
						key.setES_COMMET1(msgKey.getKeyValue("ES_COMMET1"));
					}
					if(msgKeyType.containsKeyColumn("ES_COMMET2")) {
						key.setES_COMMET2(msgKey.getKeyValue("ES_COMMET2"));
					}
					if(msgKeyType.containsKeyColumn("ES_COMMET4")) {
						key.setES_COMMET4(msgKey.getKeyValue("ES_COMMET4"));
					}
					if(msgKeyType.containsKeyColumn("ES_COMMET3")) {
						key.setES_COMMET3(msgKey.getKeyValue("ES_COMMET3"));
					}
					if(msgKeyType.containsKeyColumn("ES_COMMET5")) {
						key.setES_COMMET5(msgKey.getKeyValue("ES_COMMET5"));
					}
					if(msgKeyType.containsKeyColumn("ESREMARK1")) {
						key.setESREMARK1(msgKey.getKeyValue("ESREMARK1"));
					}
					if(msgKeyType.containsKeyColumn("ESREMARK2")) {
						key.setESREMARK2(msgKey.getKeyValue("ESREMARK2"));
					}
					if(msgKeyType.containsKeyColumn("ESREMARK3")) {
						key.setESREMARK3(msgKey.getKeyValue("ESREMARK3"));
					}
					if(msgKeyType.containsKeyColumn("ZIP_CD")) {
						key.setZIP_CD(msgKey.getKeyValue("ZIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("ADDRESS_1")) {
						key.setADDRESS_1(msgKey.getKeyValue("ADDRESS_1"));
					}
					if(msgKeyType.containsKeyColumn("ADDRESS_2")) {
						key.setADDRESS_2(msgKey.getKeyValue("ADDRESS_2"));
					}
					if(msgKeyType.containsKeyColumn("TEL")) {
						key.setTEL(msgKey.getKeyValue("TEL"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT_ES")) {
						key.setMODIFY_COUNT_ES(msgKey.getKeyValue("MODIFY_COUNT_ES"));
					}
					if(msgKeyType.containsKeyColumn("l_DETAL_NO")) {
						key.setl_DETAL_NO(msgKey.getKeyValue("l_DETAL_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ESTIMATE_TYP")) {
						key.setl_ESTIMATE_TYP(msgKey.getKeyValue("l_ESTIMATE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_ITEM_CD")) {
						key.setl_CUST_ITEM_CD(msgKey.getKeyValue("l_CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_NAME")) {
						key.setl_ITEM_NAME(msgKey.getKeyValue("l_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_DESINATED_DLV_DATE")) {
						key.setl_DESINATED_DLV_DATE(msgKey.getKeyValue("l_DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ESTIMATE_QTY")) {
						key.setl_ESTIMATE_QTY(msgKey.getKeyValue("l_ESTIMATE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_CD")) {
						key.setl_UNIT_CD(msgKey.getKeyValue("l_UNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_PRICE")) {
						key.setl_UNIT_PRICE(msgKey.getKeyValue("l_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("l_DISCOUNT_PRICE")) {
						key.setl_DISCOUNT_PRICE(msgKey.getKeyValue("l_DISCOUNT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("l_ESTIMATE_UNIT_PRICE")) {
						key.setl_ESTIMATE_UNIT_PRICE(msgKey.getKeyValue("l_ESTIMATE_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("l_AMOUNT")) {
						key.setl_AMOUNT(msgKey.getKeyValue("l_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_DISCOUNT_AMOUNT")) {
						key.setl_DISCOUNT_AMOUNT(msgKey.getKeyValue("l_DISCOUNT_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_ESTIMATE_AMOUNT")) {
						key.setl_ESTIMATE_AMOUNT(msgKey.getKeyValue("l_ESTIMATE_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_ESTIMATE_AMOUNT_JPN")) {
						key.setl_ESTIMATE_AMOUNT_JPN(msgKey.getKeyValue("l_ESTIMATE_AMOUNT_JPN"));
					}
					if(msgKeyType.containsKeyColumn("l_ESTIMATE_GAIN")) {
						key.setl_ESTIMATE_GAIN(msgKey.getKeyValue("l_ESTIMATE_GAIN"));
					}
					if(msgKeyType.containsKeyColumn("l_ES_COST_MATERIAL")) {
						key.setl_ES_COST_MATERIAL(msgKey.getKeyValue("l_ES_COST_MATERIAL"));
					}
					if(msgKeyType.containsKeyColumn("l_ES_COST_PROCESS")) {
						key.setl_ES_COST_PROCESS(msgKey.getKeyValue("l_ES_COST_PROCESS"));
					}
					if(msgKeyType.containsKeyColumn("l_ES_COST_OUTSOUCE")) {
						key.setl_ES_COST_OUTSOUCE(msgKey.getKeyValue("l_ES_COST_OUTSOUCE"));
					}
					if(msgKeyType.containsKeyColumn("l_ES_COST_ETC")) {
						key.setl_ES_COST_ETC(msgKey.getKeyValue("l_ES_COST_ETC"));
					}
					if(msgKeyType.containsKeyColumn("l_ES_COST_SERVICE")) {
						key.setl_ES_COST_SERVICE(msgKey.getKeyValue("l_ES_COST_SERVICE"));
					}
					if(msgKeyType.containsKeyColumn("l_ES_COST_ALL")) {
						key.setl_ES_COST_ALL(msgKey.getKeyValue("l_ES_COST_ALL"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_CLASS1_TYP")) {
						key.setl_SPEC_CLASS1_TYP(msgKey.getKeyValue("l_SPEC_CLASS1_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_CLASS2_TYP")) {
						key.setl_SPEC_CLASS2_TYP(msgKey.getKeyValue("l_SPEC_CLASS2_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_SELECT1_TYP")) {
						key.setl_SPEC_SELECT1_TYP(msgKey.getKeyValue("l_SPEC_SELECT1_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_SELECT2_TYP")) {
						key.setl_SPEC_SELECT2_TYP(msgKey.getKeyValue("l_SPEC_SELECT2_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_SELECT3_TYP")) {
						key.setl_SPEC_SELECT3_TYP(msgKey.getKeyValue("l_SPEC_SELECT3_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_SPEC_SELECT4_TYP")) {
						key.setl_SPEC_SELECT4_TYP(msgKey.getKeyValue("l_SPEC_SELECT4_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_REMARKS")) {
						key.setl_REMARKS(msgKey.getKeyValue("l_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_COST")) {
						key.setl_UNIT_COST(msgKey.getKeyValue("l_UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_ITEM_NAME")) {
						key.setl_CUST_ITEM_NAME(msgKey.getKeyValue("l_CUST_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("h_MAX_DETAL_NO")) {
						key.seth_MAX_DETAL_NO(msgKey.getKeyValue("h_MAX_DETAL_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_COUNT")) {
						key.setl_COUNT(msgKey.getKeyValue("l_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ROW_COUNT")) {
						key.setROW_COUNT(msgKey.getKeyValue("ROW_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_DATE")) {
						key.setBUSINESS_DATE(msgKey.getKeyValue("BUSINESS_DATE"));
					}
					if(msgKeyType.containsKeyColumn("HOME_CUR_CD")) {
						key.setHOME_CUR_CD(msgKey.getKeyValue("HOME_CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("QUOTE_CUST_CD")) {
						key.setQUOTE_CUST_CD(msgKey.getKeyValue("QUOTE_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("QUOTE_CUR_CD")) {
						key.setQUOTE_CUR_CD(msgKey.getKeyValue("QUOTE_CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("QUOTE_CUR_UNIT")) {
						key.setQUOTE_CUR_UNIT(msgKey.getKeyValue("QUOTE_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("QUOTE_PROJECT_CD")) {
						key.setQUOTE_PROJECT_CD(msgKey.getKeyValue("QUOTE_PROJECT_CD"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST")) {
						key.setUNIT_COST(msgKey.getKeyValue("UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("ESTIMATE_NO")) {
						key.setESTIMATE_NO(msgKey.getKeyValue("ESTIMATE_NO"));
					}
					if(msgKeyType.containsKeyColumn("UNOFFICIAL_RECEIPT_FLAG")) {
						key.setUNOFFICIAL_RECEIPT_FLAG(msgKey.getKeyValue("UNOFFICIAL_RECEIPT_FLAG"));
					}
					if(msgKeyType.containsKeyColumn("ESTIMATE_ST")) {
						key.setESTIMATE_ST(msgKey.getKeyValue("ESTIMATE_ST"));
					}
					if(msgKeyType.containsKeyColumn("USER")) {
						key.setUSER(msgKey.getKeyValue("USER"));
					}
					if(msgKeyType.containsKeyColumn("PROGRAM_NAME")) {
						key.setPROGRAM_NAME(msgKey.getKeyValue("PROGRAM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("h_ESTIMATE_ST")) {
						key.seth_ESTIMATE_ST(msgKey.getKeyValue("h_ESTIMATE_ST"));
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
