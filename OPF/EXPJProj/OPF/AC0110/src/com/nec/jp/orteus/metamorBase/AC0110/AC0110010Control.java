/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0110/src/com/nec/jp/orteus/metamorBase/AC0110/AC0110010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0110;

import com.nec.jp.orteus.metamorBase.AC0110.*;
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
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AC0110010Control
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
	public AC0110010Struct getListvalue(int x) { return (AC0110010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AC0110010Struct getStruct() { return this.struct; }	// Struct��Ԃ��܂��B
	public AC0110010Struct createStruct() { return new AC0110010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AC0110010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

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
	 * �Ɩ����[�j���O�������̃p�����[�^�ݒ菈����؂�o���Ċ֐���
	 * @param tableName �e�[�u����
	 * @param columnName �J������
	 * @param value �l
	 */
	private void setWarningParameter(String tableName, String columnName, String value) {
		StringBuffer param = new StringBuffer();
		param.append(tableName);
		param.append('.');
		param.append(columnName);
		param.append(':');
		if (value != null) {
			param.append(value);
		}

		ExpjMessage emsg = new ExpjMessage("ZZ01006", param.toString());
		msgStruct.addWarn(emsg);
		sysLog.info(emsg, sysUSER_CD);
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
	 * ��ʂ̑S���ڂ����������܂��B
	 */
	private void initializeAll() {
		try{
			struct.setr1_VIEW_TYP("true");			// �s���ꗗ�\��(�\���Ώ�)
			struct.setr2_VIEW_TYP(null);			// �ߏ�ꗗ�\��(�\���Ώ�)
			struct.setITEM_CD(null);				// �i�ڔԍ�
			struct.setITEM_NAME(null);				// �i�ږ�
			struct.setDUE_DATE_FROM(null);			// �v���[��(from)
			struct.setDUE_DATE_TO(null);			// �v���[��(to)
			struct.setJOB_ODR_CD(null);				// ����
			struct.setJOB_ODR_CANCEL_NO(null);		// ���Ԏ�������ԍ�
			struct.setALC_GRP_CD(null);				// �����O���[�v�R�[�h
			struct.setc1_DM_STS_TYP(null);			// �v��(�f�}���h��ԋ敪)
			struct.setc2_DM_STS_TYP("true");		// �m��(�f�}���h��ԋ敪)
			struct.setc3_DM_STS_TYP(null);			// ����(�f�}���h��ԋ敪)
			struct.setl_DUE_DATE_FROM(null);
		  struct.setl_DUE_DATE_TO(null);
			struct.setDUE_TIME_FROM(null);
		  struct.setDUE_TIME_TO(null);
			struct.setl_DUE_DATE_FROM_ZERO(null);
	
			// �ꗗ�\�����e���N���A
			setList(null);
			// �Ǎ��X�e�[�^�X�ݒ�
			setReadStatus(INITIAL);
		
			// �V�X�e���p�����[�^�iTIME_CTRL�j�擾
			AC0110010Struct TIME_CTRLStruct = new AC0110010Struct();
			List TIME_CTRLList = entity.mSELECT_TIME_CTRL.read(conn, TIME_CTRLStruct);
			if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
				TIME_CTRLStruct = (AC0110010Struct)TIME_CTRLList.get(0);
				struct.setTIME_CTRL(TIME_CTRLStruct.getTIME_CTRL());
			}else{
				struct.setTIME_CTRL(null);
			}
		} catch(Exception e) {
			e.printStackTrace(); 
		}
	}

	/** CSV�f�[�^���X�g */
	private List _csvList = null;
	
		//�R���{�{�b�N�X�̐����擾�i������j
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
			throw new ExpjException(e, emsg);
		}
	}
	
	
	/**
	 * ���������̐ݒ�
	 */
	private void setSearchCondition() {
		
		// �f�[�^�����N���A
		struct.setl_DUE_DATE_FROM(null);
	  struct.setl_DUE_DATE_TO(null);
		struct.setl_DUE_DATE_FROM_ZERO(null);
		
		// ���o�����i���t�̐ݒ�j
		if(null != struct.getTIME_CTRL() && "true".equals(struct.getTIME_CTRL())){
			// �v���[���iFrom�j
			if(null == struct.getDUE_DATE_FROM() || "".equals(struct.getDUE_DATE_FROM())){
			  struct.setl_DUE_DATE_FROM(null);
		  }else{
				// �����ݒ�
				if(null == struct.getDUE_TIME_FROM() || "".equals(struct.getDUE_TIME_FROM())){
				  struct.setl_DUE_DATE_FROM(struct.getDUE_DATE_FROM() + " 00:00");
				}else{
				  struct.setDUE_TIME_FROM(AppendZero(struct.getDUE_TIME_FROM(),4));
				  struct.setl_DUE_DATE_FROM(struct.getDUE_DATE_FROM() + " " + 
				                            struct.getDUE_TIME_FROM().substring(0,2) + ":" + 
				                            struct.getDUE_TIME_FROM().substring(2));
				}
		  
		  }
		  // �v���[���iTo�j
		  if(null == struct.getDUE_DATE_TO() || "".equals(struct.getDUE_DATE_TO())){
		    struct.setl_DUE_DATE_TO(null);
			}else{
				// �����ݒ�
				if(null == struct.getDUE_TIME_TO() || "".equals(struct.getDUE_TIME_TO())){
			    struct.setl_DUE_DATE_TO(struct.getDUE_DATE_TO() + " 23:59");
				}else{
				  struct.setDUE_TIME_TO(AppendZero(struct.getDUE_TIME_TO(),4));
			    struct.setl_DUE_DATE_TO(struct.getDUE_DATE_TO() + " " + 
			                                struct.getDUE_TIME_TO().substring(0,2) + ":" + 
			                                struct.getDUE_TIME_TO().substring(2));
				}
		  }
		}else{
			struct.setl_DUE_DATE_FROM(struct.getDUE_DATE_FROM());
			if(null == struct.getDUE_DATE_TO() || "".equals(struct.getDUE_DATE_TO())){
		  	struct.setl_DUE_DATE_TO(null);
			}else{
		  	struct.setl_DUE_DATE_TO(struct.getDUE_DATE_TO() + " 23:59");
			}
		}
	}
	/**
	 * �����̐ݒ�
	 * @param  input    ����String
	 * @param  cnt      ����
	 * @return String   ���Ƀ[���𖄂߂�
	 */
	private String AppendZero(String input,int cnt){
	  int nCount = cnt - input.length() ;
	  for(int i = 1; i <= nCount;i++)
	  {
	  	input = "0" + input;
	  }
	  return input;
	}
		
	// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0110");
		logger.entering("AC0110010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {

			// �ꗗ�\�����e���N���A
			setList(null);

			// �Ǎ��X�e�[�^�X�ݒ�
			setReadStatus(INITIAL);

			// CSV�_�E�����[�h�t�@�C���̃N���A
			struct.setDOWNLOAD_FILE(null);

			// ���.��i�ڔԍ����NULL�łȂ��ꍇ
			if (struct.getITEM_CD() != null && !struct.getITEM_CD().equals(""))
			{
				// DB���[�i��]."�i�ڔԍ�"���������A���݂��Ȃ��ꍇ�̓G���[
				List itemList = entity.mreadM_ITEM.read(conn, struct);
				if (itemList.isEmpty()) {
					// ZZ05101:�i�ڂ����݂��܂���B
					setErrorMessage("ZZ11002");
					setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
					return;
				} else {
					// �����ł����ꍇ�́u�i�ږ��v��ݒ肷��B
					AC0110010Struct itemStruct = (AC0110010Struct) itemList.get(0);
					struct.setITEM_NAME(itemStruct.getITEM_NAME());
				}
			}

			// ���.����ԣ��NULL�łȂ��ꍇ
			if (struct.getJOB_ODR_CD() != null && !struct.getJOB_ODR_CD().equals("")) 
			{
				// DB���[���Ԍv��]."����"�A"���Ԏ�������ԍ�"���������A���݂��Ȃ��ꍇ�̓G���[
				List jobList = entity.mreadT_JOB_ODR.read(conn, struct);
				if (jobList.isEmpty()) 
				{
					// AC00204:���ԁA���Ԏ�������ԍ������Ԍv��ɑ��݂��܂���B
					setErrorMessage("AC00204");
					setErrorParameter("T_JOB_ODR", "JOB_ODR_CD", struct.getJOB_ODR_CD());
					setErrorParameter("T_JOB_ODR", "JOB_ODR_CANCEL_NO", struct.getJOB_ODR_CANCEL_NO());
					return;
				}

				// DB���[���Ԍv��]."�H��"�ƃ��O�C���̍H��R�[�h�ƈ�v���Ȃ��ꍇ�̓G���[
				struct.setsetPLANT_CD(sysPLANT_CD);
				List jobPlantList = entity.mreadT_JOB_ODR_PLANT.read(conn, struct);
				if (!jobPlantList.isEmpty())
				{
					// AC00207:�H��R�[�h�Ɛ��Ԃ̍H��R�[�h����v���܂���B
					setErrorMessage("AC00207");
					setErrorParameter("T_JOB_ODR", "PLANT_CD", sysPLANT_CD);
					return;
				}
			}

			// ���.������O���[�v�R�[�h��E�u���ԁv��NULL�łȂ��ꍇ
			if ((struct.getALC_GRP_CD() != null && !struct.getALC_GRP_CD().equals("")) &&
				(struct.getJOB_ODR_CD() != null && !struct.getJOB_ODR_CD().equals("")))
			{
				// DB���[���Ԍv��]."�����O���[�v"���������A��v���Ȃ��ꍇ�̓G���[
				List jobAlcList = entity.mreadT_JOB_ODR_ALC.read(conn, struct);
				if (jobAlcList.isEmpty()) 
				{
					// AC00208:���Ԃƈ����O���[�v�R�[�h����v���܂���B
					setErrorMessage("AC00208");
					setErrorParameter("T_JOB_ODR", "ALC_GRP_CD", struct.getALC_GRP_CD());
					return;
				}
			}

			// ������
			struct.setsetDM_STS_TYP_1(null);
			struct.setsetDM_STS_TYP_2(null);
			struct.setsetDM_STS_TYP_3(null);

			// �f�}���h��ԋ敪
			if(struct.getc1_DM_STS_TYP().equals("true"))
			{
				// �v��(�����s)��ݒ�
				struct.setsetDM_STS_TYP_1("1");
			}

			if(struct.getc2_DM_STS_TYP().equals("true"))
			{
				//�m��(���s)��ݒ�
				struct.setsetDM_STS_TYP_2("2");
			}

			if(struct.getc3_DM_STS_TYP().equals("true"))
			{
				// ������ݒ�
				struct.setsetDM_STS_TYP_3("9");
			} 

			// ���������̐ݒ�
			setSearchCondition();
			
			List tempList = null;

			// ���X�g�Z�b�g����
			// ��ʏ��̎擾
			if (struct.getr1_VIEW_TYP().equals("true")) 
			{
				// �s���ꗗ�\��opt�I��
				struct.setsetSYSPLANT_CD_1(sysPLANT_CD);		// ���O�C�����[�U�̍H��R�[�h���Z�b�g
				struct.setsetSYSPLANT_CD_2(sysPLANT_CD);		// ���O�C�����[�U�̍H��R�[�h���Z�b�g

				// ���.������O���[�v�R�[�h���<>NULL�̏ꍇ�B
				if (struct.getALC_GRP_CD() != null && !struct.getALC_GRP_CD().equals(""))
				{
					// �ő�\���s��
					int maxLine = sp.getMaxLine(conn, 10);
					if (maxLine != 0) {
						struct.setROW_COUNT(String.valueOf(maxLine));
					} else
						struct.setROW_COUNT(null);
					// ���X�g�f�[�^�̌���
					List tempList1 = entity.mViewRCnt.read(conn, struct);
					long rowCount = Long.parseLong(((AC0110010Struct) tempList1
							.get(0)).getl_COUNT());
					// ���X�g��NULL�̏ꍇ
					if (rowCount ==0) {
						if(list !=null && list.size()>0)
						{
							list.clear();
						}
						setErrorMessage("ZZ06001");
						setReadStatus(NOT_FOUND);
					return;
					}
					// �\���ő�s����������
					if ((maxLine != 0) && (rowCount == maxLine + 1)) {
						// �Ǎ��X�e�[�^�X�ݒ�
						setReadStatus(TOO_MANY);
						setErrorMessage("ZZ01119", "" + maxLine);
						// �\���p���X�g�ɃZ�b�g
						if(list !=null && list.size()>0)
						{
							list.clear();
						}
						return;
					}
					// ���X�g�f�[�^�̌���
					tempList = entity.mViewR.read(conn, struct);
				} else {

					// �ő�\���s��
					int maxLine = sp.getMaxLine(conn, 10);
					if (maxLine != 0) {
						struct.setROW_COUNT(String.valueOf(maxLine));
					} else
						struct.setROW_COUNT(null);
					// ���X�g�f�[�^�̌���
					List tempList1 = entity.mViewR_ALCCnt.read(conn, struct);
					long rowCount = Long.parseLong(((AC0110010Struct) tempList1
							.get(0)).getl_COUNT());
					// ���X�g��NULL�̏ꍇ
					if (rowCount ==0) {
						if(list !=null && list.size()>0)
						{
							list.clear();
						}
						setErrorMessage("ZZ06001");
						setReadStatus(NOT_FOUND);
						return;
					}

					// �\���ő�s����������
					if ((maxLine != 0) && (rowCount == maxLine + 1)) {
						// �Ǎ��X�e�[�^�X�ݒ�
						setReadStatus(TOO_MANY);
						setErrorMessage("ZZ01119", "" + maxLine);
						// �\���p���X�g�ɃZ�b�g
						if(list !=null && list.size()>0)
						{
							list.clear();
						}
						return;
					}

					// ���.������O���[�v�R�[�h���NULL�̏ꍇ�B
					tempList = entity.mViewR_ALC.read(conn, struct);
				}
			} else if (struct.getr2_VIEW_TYP().equals("true")) {
				// �ߏ�ꗗ�\��opt�I��
				struct.setsetSYSPLANT_CD_1(sysPLANT_CD); // ���O�C�����[�U�̍H��R�[�h���Z�b�g
				struct.setsetSYSPLANT_CD_2(sysPLANT_CD); // ���O�C�����[�U�̍H��R�[�h���Z�b�g

				// ���.������O���[�v�R�[�h���<>NULL�̏ꍇ�B
				if (struct.getALC_GRP_CD() != null
						&& !struct.getALC_GRP_CD().equals("")) {
					// �ő�\���s��
					int maxLine = sp.getMaxLine(conn, 10);
					if (maxLine != 0) {
						struct.setROW_COUNT(String.valueOf(maxLine));
					} else
						struct.setROW_COUNT(null);
					// ���X�g�f�[�^�̌���
					List tempList1 = entity.mViewECnt.read(conn, struct);
					long rowCount = Long.parseLong(((AC0110010Struct) tempList1
							.get(0)).getl_COUNT());
					// ���X�g��NULL�̏ꍇ
					if (rowCount ==0) {
						if(list !=null && list.size()>0)
						{
							list.clear();
						}
						setErrorMessage("ZZ06001");
						setReadStatus(NOT_FOUND);
						return;
						
					}

					// �\���ő�s����������
					if ((maxLine != 0) && (rowCount == maxLine + 1)) {
						// �Ǎ��X�e�[�^�X�ݒ�
						setReadStatus(TOO_MANY);
						setErrorMessage("ZZ01119", "" + maxLine);
						// �\���p���X�g�ɃZ�b�g
						if(list !=null && list.size()>0)
						{
							list.clear();
						}
						return;
					}

					tempList = entity.mViewE.read(conn, struct);
				} else {
					// �ő�\���s��
					int maxLine = sp.getMaxLine(conn, 10);
					if (maxLine != 0) {
						struct.setROW_COUNT(String.valueOf(maxLine));
					} else
						struct.setROW_COUNT(null);
					// ���X�g�f�[�^�̌���
					List tempList1 = entity.mViewE_ALCCnt.read(conn, struct);
					long rowCount = Long.parseLong(((AC0110010Struct) tempList1
							.get(0)).getl_COUNT());
					// ���X�g��NULL�̏ꍇ
					if (rowCount ==0) {
						if(list !=null && list.size()>0)
						{
							list.clear();
						}
						setErrorMessage("ZZ06001");
						setReadStatus(NOT_FOUND);
						return;
					}
					// �\���ő�s����������
					if ((maxLine != 0) && (rowCount == maxLine + 1)) {
						// �Ǎ��X�e�[�^�X�ݒ�
						setReadStatus(TOO_MANY);
						setErrorMessage("ZZ01119", "" + maxLine);
						// �\���p���X�g�ɃZ�b�g
						if(list !=null && list.size()>0)
						{
							list.clear();
						}
						return;
					}
					tempList = entity.mViewE_ALC.read(conn, struct);
				}
			}
			// �Ǎ��X�e�[�^�X�ݒ�
			setReadStatus(NORMAL);
			// �\���p���X�g�ɃZ�b�g
			setList(tempList);
			// CSV�o�͗p�ɑҔ�
			_csvList = tempList;

				AC0110010Struct TempStruct;
	             for (int i = 0; i < list.size(); i++) {
			     TempStruct = (AC0110010Struct)list.get(i);
			     
			     TempStruct.setl_DM_STS_TYP(multcombo("DM_STS_TYP",TempStruct.getl_DM_STS_TYP()));
			     TempStruct.setl_OD_TYP(multcombo("OD_TYP",TempStruct.getl_OD_TYP()));
			     TempStruct.setl_MRP_ODR_TYP(multcombo("MRP_ODR_TYP",TempStruct.getl_MRP_ODR_TYP()));
	             	
	             //�R���{�{�b�N�X�̎擾
			    // othercomboTyp(TempStruct);
			    }

		} catch(SQLException e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AC0110010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * CSV�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCsvOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0110");
		logger.entering("AC0110010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");
			//{{user_implement_dev:<controlCsvOut>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		// CSV���̍쐬
		List csvList = new ArrayList();
		String[] title = {
							"Expj.JOB_ODR_CD" ,
							"Expj.JOB_ODR_CANCEL_NO" ,
							"Expj.ALC_GRP_CD" ,
							"Expj.ITEM_CD" ,
							"Expj.ITEM_NAME" ,
							"Expj.DM_QTY_1" ,
							"Expj.ALC_ALCD_QTY" ,
							"Expj.Cmt0358" ,
							"Expj.TOTAL_ISSUE_QTY" ,
							"Expj.PUCH_ODR_UNIT" ,
							"Expj.DUE_DATE" ,
							"Expj.DM_STS_TYP" ,
							"Expj.OD_TYP" ,
							"Expj.MRP_ODR_TYP" ,
							"Expj.OD_NO" 
		};
		csvList.add(title);
		for (Iterator i = _csvList.iterator(); i.hasNext();) 
		{
			AC0110010Struct csvStruct = (AC0110010Struct) i.next();
			String[] csvStr = new String[title.length];
			csvStr[0] = csvStruct.getl_JOB_ODR_CD();
			csvStr[1] = csvStruct.getl_JOB_ODR_CANCEL_NO();
			csvStr[2] = csvStruct.getl_ALC_GRP_CD();
			csvStr[3] = csvStruct.getl_ITEM_CD();
			csvStr[4] = csvStruct.getl_ITEM_NAME();
			csvStr[5] = csvStruct.getl_DM_QTY();
			csvStr[6] = csvStruct.getl_ALC_ALCD_QTY();
			csvStr[7] = csvStruct.getl_ALCDLE_QTY();
			csvStr[8] = csvStruct.getl_TOTAL_ISSUE_QTY();
			csvStr[9] = csvStruct.getl_STOCK_UNIT();
			csvStr[10] = csvStruct.getl_DUE_DATE();
			csvStr[11] =csvStruct.getl_DM_STS_TYP();
			csvStr[12] =csvStruct.getl_OD_TYP();
			csvStr[13] =csvStruct.getl_MRP_ODR_TYP();
			csvStr[14] =csvStruct.getl_OD_NO();
			csvList.add(csvStr);
		}
		if (csvList != null && !csvList.isEmpty()) {
			// CsvWriter�𐶐�
			csvWriter = new CsvWriter(CsvWriter.getFileName(sysUSER_CD));
			csvWriter.write(csvList, CoreTools.getLocale(struct.getsUser_ID()),true);
			struct.setDOWNLOAD_FILE(csvWriter.getFilePath());
		}
			
                //}}user_implement_dev:<controlCsvOut>
		logger.exiting("AC0110010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0110");
		logger.entering("AC0110010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������

			// ��ʂ�������
			initializeAll();

                //}}user_implement_dev:<controlClear>
		logger.exiting("AC0110010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ���Ԉ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlJobOdrAlc() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0110");
		logger.entering("AC0110010Control"+":USER="+struct.getsUser_ID(),"controlJobOdrAlc");
			//{{user_implement_dev:<controlJobOdrAlc>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlJobOdrAlc>
		logger.exiting("AC0110010Control"+":USER="+struct.getsUser_ID(),"controlJobOdrAlc");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0110");
		logger.entering("AC0110010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AC0110010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0110");
		logger.entering("AC0110010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			// ��ʂ�������
			initializeAll();
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AC0110010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0110");
		logger.entering("AC0110010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AC0110010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("CsvOut") ) {
				controlCsvOut();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("JobOdrAlc") ) {
				controlJobOdrAlc();
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
//			throw new FoundationException("AC0110010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0110010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AC0110010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0110010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AC0110010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0110010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AC0110010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AC0110010Entity entity;
	protected AC0110010Struct struct;
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

		entity = new AC0110010Entity();
		struct = new AC0110010Struct();

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
	 * AC0110010�N���X�̕W���R���X�g���N�^
	 */
	public AC0110010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
			// TODO: �����ɏ����������L�q���Ă�������
		try {
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
				AC0110010Struct key = (AC0110010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("r1_VIEW_TYP") && key.getr1_VIEW_TYP() != null) {
					msgKey.setKeyValue("r1_VIEW_TYP", key.getr1_VIEW_TYP());
				}
				if(msgKeyType.containsKeyColumn("r2_VIEW_TYP") && key.getr2_VIEW_TYP() != null) {
					msgKey.setKeyValue("r2_VIEW_TYP", key.getr2_VIEW_TYP());
				}
				if(msgKeyType.containsKeyColumn("DUE_DATE_FROM") && key.getDUE_DATE_FROM() != null) {
					msgKey.setKeyValue("DUE_DATE_FROM", key.getDUE_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("DUE_DATE_TO") && key.getDUE_DATE_TO() != null) {
					msgKey.setKeyValue("DUE_DATE_TO", key.getDUE_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("c1_DM_STS_TYP") && key.getc1_DM_STS_TYP() != null) {
					msgKey.setKeyValue("c1_DM_STS_TYP", key.getc1_DM_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("c2_DM_STS_TYP") && key.getc2_DM_STS_TYP() != null) {
					msgKey.setKeyValue("c2_DM_STS_TYP", key.getc2_DM_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("c3_DM_STS_TYP") && key.getc3_DM_STS_TYP() != null) {
					msgKey.setKeyValue("c3_DM_STS_TYP", key.getc3_DM_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("DUE_TIME_FROM") && key.getDUE_TIME_FROM() != null) {
					msgKey.setKeyValue("DUE_TIME_FROM", key.getDUE_TIME_FROM());
				}
				if(msgKeyType.containsKeyColumn("DUE_TIME_TO") && key.getDUE_TIME_TO() != null) {
					msgKey.setKeyValue("DUE_TIME_TO", key.getDUE_TIME_TO());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readJOB_ODR_CD") && key.getreadJOB_ODR_CD() != null) {
					msgKey.setKeyValue("readJOB_ODR_CD", key.getreadJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO") && key.getJOB_ODR_CANCEL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_CANCEL_NO", key.getJOB_ODR_CANCEL_NO());
				}
				if(msgKeyType.containsKeyColumn("setPLANT_CD") && key.getsetPLANT_CD() != null) {
					msgKey.setKeyValue("setPLANT_CD", key.getsetPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("ALC_GRP_CD") && key.getALC_GRP_CD() != null) {
					msgKey.setKeyValue("ALC_GRP_CD", key.getALC_GRP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD") && key.getl_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CD", key.getl_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CANCEL_NO") && key.getl_JOB_ODR_CANCEL_NO() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CANCEL_NO", key.getl_JOB_ODR_CANCEL_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ALC_GRP_CD") && key.getl_ALC_GRP_CD() != null) {
					msgKey.setKeyValue("l_ALC_GRP_CD", key.getl_ALC_GRP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_CD") && key.getl_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ITEM_CD", key.getl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_NAME") && key.getl_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ITEM_NAME", key.getl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_DM_QTY") && key.getl_DM_QTY() != null) {
					msgKey.setKeyValue("l_DM_QTY", key.getl_DM_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ALC_ALCD_QTY") && key.getl_ALC_ALCD_QTY() != null) {
					msgKey.setKeyValue("l_ALC_ALCD_QTY", key.getl_ALC_ALCD_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ALCDLE_QTY") && key.getl_ALCDLE_QTY() != null) {
					msgKey.setKeyValue("l_ALCDLE_QTY", key.getl_ALCDLE_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_TOTAL_ISSUE_QTY") && key.getl_TOTAL_ISSUE_QTY() != null) {
					msgKey.setKeyValue("l_TOTAL_ISSUE_QTY", key.getl_TOTAL_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_STOCK_UNIT") && key.getl_STOCK_UNIT() != null) {
					msgKey.setKeyValue("l_STOCK_UNIT", key.getl_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("l_DUE_DATE") && key.getl_DUE_DATE() != null) {
					msgKey.setKeyValue("l_DUE_DATE", key.getl_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_DM_STS_TYP") && key.getl_DM_STS_TYP() != null) {
					msgKey.setKeyValue("l_DM_STS_TYP", key.getl_DM_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_OD_TYP") && key.getl_OD_TYP() != null) {
					msgKey.setKeyValue("l_OD_TYP", key.getl_OD_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_MRP_ODR_TYP") && key.getl_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("l_MRP_ODR_TYP", key.getl_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_OD_NO") && key.getl_OD_NO() != null) {
					msgKey.setKeyValue("l_OD_NO", key.getl_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("setSYSPLANT_CD_1") && key.getsetSYSPLANT_CD_1() != null) {
					msgKey.setKeyValue("setSYSPLANT_CD_1", key.getsetSYSPLANT_CD_1());
				}
				if(msgKeyType.containsKeyColumn("setSYSPLANT_CD_2") && key.getsetSYSPLANT_CD_2() != null) {
					msgKey.setKeyValue("setSYSPLANT_CD_2", key.getsetSYSPLANT_CD_2());
				}
				if(msgKeyType.containsKeyColumn("l_DUE_DATE_FROM") && key.getl_DUE_DATE_FROM() != null) {
					msgKey.setKeyValue("l_DUE_DATE_FROM", key.getl_DUE_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("l_DUE_DATE_TO") && key.getl_DUE_DATE_TO() != null) {
					msgKey.setKeyValue("l_DUE_DATE_TO", key.getl_DUE_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("l_DUE_DATE_FROM_ZERO") && key.getl_DUE_DATE_FROM_ZERO() != null) {
					msgKey.setKeyValue("l_DUE_DATE_FROM_ZERO", key.getl_DUE_DATE_FROM_ZERO());
				}
				if(msgKeyType.containsKeyColumn("setDM_STS_TYP_1") && key.getsetDM_STS_TYP_1() != null) {
					msgKey.setKeyValue("setDM_STS_TYP_1", key.getsetDM_STS_TYP_1());
				}
				if(msgKeyType.containsKeyColumn("setDM_STS_TYP_2") && key.getsetDM_STS_TYP_2() != null) {
					msgKey.setKeyValue("setDM_STS_TYP_2", key.getsetDM_STS_TYP_2());
				}
				if(msgKeyType.containsKeyColumn("setDM_STS_TYP_3") && key.getsetDM_STS_TYP_3() != null) {
					msgKey.setKeyValue("setDM_STS_TYP_3", key.getsetDM_STS_TYP_3());
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
					AC0110010Struct key = new AC0110010Struct();
					if(msgKeyType.containsKeyColumn("r1_VIEW_TYP")) {
						key.setr1_VIEW_TYP(msgKey.getKeyValue("r1_VIEW_TYP"));
					}
					if(msgKeyType.containsKeyColumn("r2_VIEW_TYP")) {
						key.setr2_VIEW_TYP(msgKey.getKeyValue("r2_VIEW_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DUE_DATE_FROM")) {
						key.setDUE_DATE_FROM(msgKey.getKeyValue("DUE_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("DUE_DATE_TO")) {
						key.setDUE_DATE_TO(msgKey.getKeyValue("DUE_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("c1_DM_STS_TYP")) {
						key.setc1_DM_STS_TYP(msgKey.getKeyValue("c1_DM_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("c2_DM_STS_TYP")) {
						key.setc2_DM_STS_TYP(msgKey.getKeyValue("c2_DM_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("c3_DM_STS_TYP")) {
						key.setc3_DM_STS_TYP(msgKey.getKeyValue("c3_DM_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DUE_TIME_FROM")) {
						key.setDUE_TIME_FROM(msgKey.getKeyValue("DUE_TIME_FROM"));
					}
					if(msgKeyType.containsKeyColumn("DUE_TIME_TO")) {
						key.setDUE_TIME_TO(msgKey.getKeyValue("DUE_TIME_TO"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readJOB_ODR_CD")) {
						key.setreadJOB_ODR_CD(msgKey.getKeyValue("readJOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO")) {
						key.setJOB_ODR_CANCEL_NO(msgKey.getKeyValue("JOB_ODR_CANCEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("setPLANT_CD")) {
						key.setsetPLANT_CD(msgKey.getKeyValue("setPLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ALC_GRP_CD")) {
						key.setALC_GRP_CD(msgKey.getKeyValue("ALC_GRP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD")) {
						key.setl_JOB_ODR_CD(msgKey.getKeyValue("l_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CANCEL_NO")) {
						key.setl_JOB_ODR_CANCEL_NO(msgKey.getKeyValue("l_JOB_ODR_CANCEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ALC_GRP_CD")) {
						key.setl_ALC_GRP_CD(msgKey.getKeyValue("l_ALC_GRP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_CD")) {
						key.setl_ITEM_CD(msgKey.getKeyValue("l_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_NAME")) {
						key.setl_ITEM_NAME(msgKey.getKeyValue("l_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_DM_QTY")) {
						key.setl_DM_QTY(msgKey.getKeyValue("l_DM_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ALC_ALCD_QTY")) {
						key.setl_ALC_ALCD_QTY(msgKey.getKeyValue("l_ALC_ALCD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ALCDLE_QTY")) {
						key.setl_ALCDLE_QTY(msgKey.getKeyValue("l_ALCDLE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_TOTAL_ISSUE_QTY")) {
						key.setl_TOTAL_ISSUE_QTY(msgKey.getKeyValue("l_TOTAL_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_STOCK_UNIT")) {
						key.setl_STOCK_UNIT(msgKey.getKeyValue("l_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("l_DUE_DATE")) {
						key.setl_DUE_DATE(msgKey.getKeyValue("l_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_DM_STS_TYP")) {
						key.setl_DM_STS_TYP(msgKey.getKeyValue("l_DM_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_OD_TYP")) {
						key.setl_OD_TYP(msgKey.getKeyValue("l_OD_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_MRP_ODR_TYP")) {
						key.setl_MRP_ODR_TYP(msgKey.getKeyValue("l_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_OD_NO")) {
						key.setl_OD_NO(msgKey.getKeyValue("l_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("setSYSPLANT_CD_1")) {
						key.setsetSYSPLANT_CD_1(msgKey.getKeyValue("setSYSPLANT_CD_1"));
					}
					if(msgKeyType.containsKeyColumn("setSYSPLANT_CD_2")) {
						key.setsetSYSPLANT_CD_2(msgKey.getKeyValue("setSYSPLANT_CD_2"));
					}
					if(msgKeyType.containsKeyColumn("l_DUE_DATE_FROM")) {
						key.setl_DUE_DATE_FROM(msgKey.getKeyValue("l_DUE_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("l_DUE_DATE_TO")) {
						key.setl_DUE_DATE_TO(msgKey.getKeyValue("l_DUE_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("l_DUE_DATE_FROM_ZERO")) {
						key.setl_DUE_DATE_FROM_ZERO(msgKey.getKeyValue("l_DUE_DATE_FROM_ZERO"));
					}
					if(msgKeyType.containsKeyColumn("setDM_STS_TYP_1")) {
						key.setsetDM_STS_TYP_1(msgKey.getKeyValue("setDM_STS_TYP_1"));
					}
					if(msgKeyType.containsKeyColumn("setDM_STS_TYP_2")) {
						key.setsetDM_STS_TYP_2(msgKey.getKeyValue("setDM_STS_TYP_2"));
					}
					if(msgKeyType.containsKeyColumn("setDM_STS_TYP_3")) {
						key.setsetDM_STS_TYP_3(msgKey.getKeyValue("setDM_STS_TYP_3"));
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