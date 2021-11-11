/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0080/src/com/nec/jp/orteus/metamorBase/AD0080/AD0080010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0080;

import com.nec.jp.orteus.metamorBase.AD0080.*;
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
import com.nec.jp.orteus.metamorBase.common06.util.formatCheck;
import com.nec.jp.orteus.metamorBase.common06.util.stringUtil;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AD0080010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: geng-jia $
 * @version $Revision: 1.15 $ $Date: 2015/12/22 09:52:44 $
 *
 */
//}}user_implement_code_header

public class AD0080010Control
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
	public AD0080010Struct getListvalue(int x) { return (AD0080010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AD0080010Struct getStruct() { return this.struct; }	// Struct�̒l��Ԃ��܂��B
	public AD0080010Struct createStruct() { return new AD0080010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AD0080010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
    //������ѓ��̓e�[�^CSV�t�@�C���̗�C���f�b�N�X
	private final int OprInstCdNo           = 0;			//��Ǝw���ԍ�No
	private final int ItemCdNo              = 1;			//�i�ڔԍ�No
	private final int AcptQtyNo             = 2;			//�Ǖi��No
	private final int DefectQtyNo           = 3;			//�s�ǐ�No
	private final int OprDateNo             = 4;			//��Ɠ�No
	private final int WhCdNo                = 5;			//�ۊǋ�R�[�hNo
	private final int WsCdNo                = 6;			//��Ƌ�R�[�hNo
	private final int OprRsltPersonNo       = 7;			//��ƒS����No
	private final int OprRsltCommentNo      = 8;			//���lNo
	private final int OprTimeImeUnitTypNo   = 9;			//��Ǝ��ԒP�ʋ敪No
	private final int PreArrangementTimeNo  = 10;			//�O�i�掞��No
	private final int PostArrangementTimeNo = 11;			//��i�掞��No
	private final int OprTimeNo             = 12;			//��Ǝ���No
	private final int CessationTimeNo       = 13;			//��~����No
	private final int CessationCauseNo      = 14;			//��~���RNo
	private final int LotNoNo               = 15;			//�݌Ƀ��b�g�ԍ�    
	private final int VendLotNoNo           = 16;			//���[�J���b�g�ԍ�
	private final int DefectCauseCd1No      = 17;			//�s�Ǘ��R�R�[�h1No
	private final int DefectQty1No          = 18;			//�s�ǐ�1No
	private final int DefectComment1No      = 19;			//�s�ǔ��l1No
	private final int DefectCauseCd2No      = 20;			//�s�Ǘ��R�R�[�h2No
	private final int DefectQty2No          = 21;			//�s�ǐ�2No
	private final int DefectComment2No      = 22;			//�s�ǔ��l2No
	private final int DefectCauseCd3No      = 23;			//�s�Ǘ��R�R�[�h3No
	private final int DefectQty3No          = 24;			//�s�ǐ�3No
	private final int DefectComment3No      = 25;			//�s�ǔ��l3No
	private final int DefectCauseCd4No      = 26;			//�s�Ǘ��R�R�[�h4No
	private final int DefectQty4No          = 27;			//�s�ǐ�4No
	private final int DefectComment4No      = 28;			//�s�ǔ��l4No
	private final int DefectCauseCd5No      = 29;			//�s�Ǘ��R�R�[�h5No
	private final int DefectQty5No          = 30;			//�s�ǐ�5No
	private final int DefectComment5No      = 31;			//�s�ǔ��l5No
	private final int OprCmpltFlgNo         = 32;			//��Ɗ����t���O
	private final int ChildRsltUpdateFlgNo  = 33;			//�q�i�ڈꊇ�X�V�t���O
	
    String locale = null;
    //	CSV�t�@�C���̍��ڐ�
    private final int ColSize = 34;
	//�G���[�ꗗ���X�g
	private ArrayList _errList = new ArrayList(0);
	// �Ɩ��^�p��
	private String businessDate = null;
    /**
     * ��񃁃b�Z�[�W�ݒ�
     * @param ���b�Z�[�W�ԍ�
     * @param �o�̓��b�Z�[�W
     */
    private void setInfoMessage(String messageno)
    {
     ExpjMessage emsg = new ExpjMessage( messageno);
     msgStruct.addInfo( emsg );
     sysLog.info(emsg, getsysUSER_CD());
    }
    
    /**
     * ��񃁃b�Z�[�W�ݒ�
     * @param ���b�Z�[�W�ԍ�
	 * @param value1 �u��������P
     * @param �o�̓��b�Z�[�W
     */
    private void setInfoMessage(String messageno, String value1)
    {
     ExpjMessage emsg = new ExpjMessage( messageno , value1);
     msgStruct.addInfo( emsg );
     sysLog.info(emsg, getsysUSER_CD());
    }
	
	/**
	 * �Ɩ����W�b�N�̃C���t�H���[�V�����ݒ菈����؂�o���Ċ֐���
	 * @param code
	 */
	private void setInfoMessage2(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addInfo(emsg);
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
	 * �Ɩ����W�b�N�̃G���[���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * @param code ���b�Z�[�W�R�[�h
	 * @param value1 �u��������P
	 * @param value1 �u��������2
	 */
	private void setErrorMessage(String code, String value1, String value2) {
		ExpjMessage emsg = new ExpjMessage(code, value1,value2);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, sysUSER_CD);
	}
    
    /**
     * �x�����b�Z�[�W�ݒ�
     * @param ���b�Z�[�W�ԍ�
	 * @param value1 �u��������P
     * @param �o�̓��b�Z�[�W
     */
    private void setWarnMessage(String messageno, String value1)
    {
     ExpjMessage emsg = new ExpjMessage( messageno , value1);
     msgStruct.addWarn( emsg );
     sysLog.warning(emsg, getsysUSER_CD());
    }
    /**
     * �G���[�ꗗ���X�g�ɒǉ�����
     * 
     * @param msgno �G���[���b�Z�[�W�ԍ�
     * @param indexRow �G���[���ڍs
     * @param indexCol�@�G���[����Col
     */
    private void addErrorList( int indexRow,int  indexCol , String msgno ){
    	ExpjMessage exmsg = new ExpjMessage( msgno );
    	addErrorList( indexRow ,indexCol , exmsg);
    }
    /**
     * �G���[�ꗗ���X�g�ɒǉ�����
     * 
     * @param exmsg �G���[���b�Z�[�W
     * @param indexRow �G���[���ڍs
     * @param indexCol�@�G���[����Col
     */
    private void addErrorList( int indexRow ,int indexCol , ExpjMessage exmsg ){    	
    	AD0080010Struct s = new AD0080010Struct();
    	ExpjMessage exmsgline = new ExpjMessage( "AH00045" , ""+indexRow , ""+(indexCol+1) );
    	
    	s.setl_ERROR_IN(exmsgline.getMessage(locale));
    	s.setl_ERR_INFO( exmsg.getMessage(locale) );
    	
    	_errList.add( s );
    }
    /**
     * �G���[�ꗗ���X�g�ɒǉ�����
     * 
     * @param exmsg �G���[���b�Z�[�W
     * @param indexRow �G���[���ڍs
     */
    private void addErrorList( int indexRow , ExpjMessage exmsg ){    	
    	AD0080010Struct s = new AD0080010Struct();
    	ExpjMessage exmsgline = new ExpjMessage( "AA01520" , ""+indexRow  );
    	
    	s.setl_ERROR_IN(exmsgline.getMessage(locale));
    	s.setl_ERR_INFO( exmsg.getMessage(locale) );
    	
    	_errList.add( s );
    }
    /**
     * �֑�����
     * 
     * @param str�@�`�F�b�N�̕���
     * @return �֑���������@ture�@�֑������Ȃ��@false
     */
    private boolean  errorWord( String str ){    
    	if(str.indexOf("%") >= 0){
    		return true;
    	}  
    	if(str.indexOf("_") >= 0){
    		return true;
    	} 
    	if(str.indexOf("\\") >= 0){
    		return true;
    	} 
    	return false;
    }
    
    /**
	 * ���t�`���`�F�b�N("YYYY/MM/DD"����"YYYY/MM/DD HH24MI"�`��)
	 * @param ���t�i�����^�j
	 * @return ���t�`�������������true,����Ă����false
	 */
    static public boolean chkDate(String dateString) {
    	Calendar calendar = Calendar.getInstance();
    	Date date;
    	if(dateString==null){
    		return false;
    	}
    	if ( stringUtil.getByteLength(dateString) > 10 ){
    		try {     
        		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HHmm");
        		dateFormat.setLenient(false);
        		date = dateFormat.parse(dateString);
        		calendar.setTime(date);
			    if(calendar.get(Calendar.YEAR) > 9999){
			    	return false;
			    }
        		return true;
        	} catch (Exception e) {}
        		return false;    
    	}
    	else{
    		try {     
        		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        		dateFormat.setLenient(false);
        		date = dateFormat.parse(dateString);
        		calendar.setTime(date);
			    if(calendar.get(Calendar.YEAR) > 9999){
			    	return false;
			    }
        		return true;
        	} catch (Exception e) {}
        		return false;     
    	}
	}
   
    /**
     * �e���ڂɑ΂��ă`�F�b�N���s��
     * 
     * @param csvVector
     * @param i 
     * @return �G���[����@false�@�G���[�Ȃ��@true
     */
    private boolean  checkItem( Vector csvVector, int i ){

    	double tempDouble;
		//��Ǝw���ԍ��`�F�b�N
		if(csvVector.get(OprInstCdNo) == null || "".equals((String)csvVector.get(OprInstCdNo))){
			addErrorList( i,OprInstCdNo, "AD30022");
			return false;
		}
		if(((String)csvVector.get(OprInstCdNo)).getBytes().length >= 26){
			addErrorList( i,OprInstCdNo, "AA01501");
			return false;
		}
		if(errorWord((String)csvVector.get(OprInstCdNo))){
			addErrorList( i,OprInstCdNo, "AA01524");
			return false;
		}
		//�i�ڔԍ��`�F�b�N
		if(csvVector.get(ItemCdNo) != null && !"".equals((String)csvVector.get(ItemCdNo))) {
			if(((String)csvVector.get(ItemCdNo)).getBytes().length >= 26){
				addErrorList( i,ItemCdNo, "AA01501");
				return false;
			}
			if(errorWord((String)csvVector.get(ItemCdNo))){
				addErrorList( i,ItemCdNo, "AA01524");
				return false;
			}
		}

        //�Ǖi���`�F�b�N
		if(csvVector.get(AcptQtyNo) != null && !"".equals((String)csvVector.get(AcptQtyNo))) {
			try {
				tempDouble = Double.parseDouble((String)csvVector.get(AcptQtyNo));
			} catch (NumberFormatException e) {
				addErrorList( i,AcptQtyNo, "AA01503");
				return false;
			}
			if(!formatCheck.isNumberFormat((String)csvVector.get(AcptQtyNo),14,4)){
				addErrorList( i,AcptQtyNo, "AA01501");
				return false;
			}
			if(tempDouble < 0){
				addErrorList( i,AcptQtyNo, "AA01501");
				return false;	
			}
		}

        //�s�ǐ��`�F�b�N	
		if(csvVector.get(DefectQtyNo) != null && !"".equals((String)csvVector.get(DefectQtyNo))){
			try {
				tempDouble = Double.parseDouble((String)csvVector.get(DefectQtyNo));
			} catch (NumberFormatException e) {
				addErrorList( i,DefectQtyNo, "AA01503");
				return false;
			}
			if(!formatCheck.isNumberFormat((String)csvVector.get(DefectQtyNo),14,4)){
				addErrorList( i,DefectQtyNo, "AA01501");
				return false;
			}
			if(tempDouble < 0){
				addErrorList( i,DefectQtyNo, "AA01501");
				return false;	
			}
		}

        //��Ɠ��`�F�b�N
		if(csvVector.get(OprDateNo) != null && !"".equals((String)csvVector.get(OprDateNo))){
			if(!chkDate((String)csvVector.get(OprDateNo))){
				addErrorList( i,OprDateNo, "AA01606");
				return false;	
			}
		}

		//�ۊǋ�R�[�h�`�F�b�N
		if(csvVector.get(WhCdNo) != null && !"".equals((String)csvVector.get(WhCdNo))){
			if(((String)csvVector.get(WhCdNo)).getBytes().length >= 26){
				addErrorList( i,WhCdNo, "AA01501");
				return false;
			}
			if(errorWord((String)csvVector.get(WhCdNo))){
				addErrorList( i,WhCdNo, "AA01524");
				return false;
			}
		}
		
        //��Ƌ�R�[�h�`�F�b�N
		if(csvVector.get(WsCdNo) != null && !"".equals((String)csvVector.get(WsCdNo))){
			if(((String)csvVector.get(WsCdNo)).getBytes().length >= 26){
				addErrorList( i,WsCdNo, "AA01501");
				return false;
			}
			if(errorWord((String)csvVector.get(WsCdNo))){
				addErrorList( i,WsCdNo, "AA01524");
				return false;
			}
		}
		
		//��ƒS���҃`�F�b�N
		if(csvVector.get(OprRsltPersonNo) != null && !"".equals((String)csvVector.get(OprRsltPersonNo))){
			if(((String)csvVector.get(OprRsltPersonNo)).getBytes().length >= 41){
				addErrorList( i,OprRsltPersonNo, "AA01501");
				return false;
			}
			if(errorWord((String)csvVector.get(OprRsltPersonNo))){
				addErrorList( i,OprRsltPersonNo, "AA01524");
				return false;
			}
		}
		
		//���l�`�F�b�N
		if(csvVector.get(OprRsltCommentNo) != null && !"".equals((String)csvVector.get(OprRsltCommentNo))){
			if(((String)csvVector.get(OprRsltCommentNo)).getBytes().length >= 81){
				addErrorList( i,OprRsltCommentNo, "AA01501");
				return false;
			}
			if(errorWord((String)csvVector.get(OprRsltCommentNo))){
				addErrorList( i,OprRsltCommentNo, "AA01524");
				return false;
			}
		}
		
		//��Ǝ��ԒP�ʋ敪�`�F�b�N	
		if(csvVector.get(OprTimeImeUnitTypNo) != null && !"".equals((String)csvVector.get(OprTimeImeUnitTypNo))){
			try {
				Double.parseDouble((String)csvVector.get(OprTimeImeUnitTypNo));
			} catch (NumberFormatException e) {
				addErrorList( i,OprTimeImeUnitTypNo, "AA01503");
				return false;
			}
			if(!"1".equals((String)csvVector.get(OprTimeImeUnitTypNo)) &&  !"2".equals((String)csvVector.get(OprTimeImeUnitTypNo))){
				addErrorList( i,OprTimeImeUnitTypNo, "CF00012");
				return false;
			}
		}
		
        //�O�i�掞�ԃ`�F�b�N	
		if(csvVector.get(PreArrangementTimeNo) != null && !"".equals((String)csvVector.get(PreArrangementTimeNo))){
			try {
				tempDouble = Double.parseDouble((String)csvVector.get(PreArrangementTimeNo));
			} catch (NumberFormatException e) {
				addErrorList( i,PreArrangementTimeNo, "AA01503");
				return false;
			}
			if(!formatCheck.isNumberFormat((String)csvVector.get(PreArrangementTimeNo),14,4)){
				addErrorList( i,PreArrangementTimeNo, "AA01501");
				return false;
			}
			if(tempDouble < 0){
				addErrorList( i,PreArrangementTimeNo, "AA01501");
				return false;	
			}
		}
		
        //��i�掞�ԃ`�F�b�N	
		if(csvVector.get(PostArrangementTimeNo) != null && !"".equals((String)csvVector.get(PostArrangementTimeNo))){
			try {
				tempDouble = Double.parseDouble((String)csvVector.get(PostArrangementTimeNo));
			} catch (NumberFormatException e) {
				addErrorList( i,PostArrangementTimeNo, "AA01503");
				return false;
			}
			if(!formatCheck.isNumberFormat((String)csvVector.get(PostArrangementTimeNo),14,4)){
				addErrorList( i,PostArrangementTimeNo, "AA01501");
				return false;
			}
			if(tempDouble < 0){
				addErrorList( i,PostArrangementTimeNo, "AA01501");
				return false;	
			}
		}
		
        //��Ǝ��ԃ`�F�b�N	
		if(csvVector.get(OprTimeNo) != null && !"".equals((String)csvVector.get(OprTimeNo))){
			try {
				tempDouble = Double.parseDouble((String)csvVector.get(OprTimeNo));
			} catch (NumberFormatException e) {
				addErrorList( i,OprTimeNo, "AA01503");
				return false;
			}
			if(!formatCheck.isNumberFormat((String)csvVector.get(OprTimeNo),14,4)){
				addErrorList( i,OprTimeNo, "AA01501");
				return false;
			}
			if(tempDouble < 0){
				addErrorList( i,OprTimeNo, "AA01501");
				return false;	
			}
		}
		
        //��~���ԃ`�F�b�N	
		if(csvVector.get(CessationTimeNo) != null && !"".equals((String)csvVector.get(CessationTimeNo))){
			try {
				tempDouble = Double.parseDouble((String)csvVector.get(CessationTimeNo));
			} catch (NumberFormatException e) {
				addErrorList( i,CessationTimeNo, "AA01503");
				return false;
			}
			if(!formatCheck.isNumberFormat((String)csvVector.get(CessationTimeNo),14,4)){
				addErrorList( i,CessationTimeNo, "AA01501");
				return false;
			}
			if(tempDouble < 0){
				addErrorList( i,CessationTimeNo, "AA01501");
				return false;	
			}
		}
		
		//��~���R�`�F�b�N
		if(csvVector.get(CessationCauseNo) != null && !"".equals((String)csvVector.get(CessationCauseNo))){
			if(((String)csvVector.get(CessationCauseNo)).getBytes().length >= 81){
				addErrorList( i,CessationCauseNo, "AA01501");
				return false;
			}
			if(errorWord((String)csvVector.get(CessationCauseNo))){
				addErrorList( i,CessationCauseNo, "AA01524");
				return false;
			}
		}
		
		//�݌Ƀ��b�g�ԍ��`�F�b�N
		if(csvVector.get(LotNoNo) != null && !"".equals((String)csvVector.get(LotNoNo))){
			if(((String)csvVector.get(LotNoNo)).getBytes().length >= 26){
				addErrorList( i,LotNoNo, "AA01501");
				return false;
			}
			if(errorWord((String)csvVector.get(LotNoNo))){
				addErrorList( i,LotNoNo, "AA01524");
				return false;
			}
			if(((String)csvVector.get(AcptQtyNo) != null && !"".equals((String)csvVector.get(AcptQtyNo)) && 
					Calculate.compare((String)csvVector.get(AcptQtyNo), "0") == 0)  
					|| (String)csvVector.get(AcptQtyNo) == null ||
					"".equals((String)csvVector.get(AcptQtyNo))) {
				addErrorList( i,LotNoNo, "AD20139");
				return false;
			}
		}
		
		//���[�J���b�g�ԍ��`�F�b�N
		if(csvVector.get(VendLotNoNo) != null && !"".equals((String)csvVector.get(VendLotNoNo))){
			if(((String)csvVector.get(VendLotNoNo)).getBytes().length >= 26){
				addErrorList( i,VendLotNoNo, "AA01501");
				return false;
			}
			if(errorWord((String)csvVector.get(VendLotNoNo))){
				addErrorList( i,VendLotNoNo, "AA01524");
				return false;
			}
		}
		
		//�s�Ǘ��R�R�[�h1�`�F�b�N
		if(csvVector.get(DefectCauseCd1No) != null && !"".equals((String)csvVector.get(DefectCauseCd1No))){
			if(((String)csvVector.get(DefectCauseCd1No)).getBytes().length >= 26){
				addErrorList( i,DefectCauseCd1No, "AA01501");
				return false;
			}
			if(errorWord((String)csvVector.get(DefectCauseCd1No))){
				addErrorList( i,DefectCauseCd1No, "AA01524");
				return false;
			}
			// �O�̏ꍇ
			if("0".equals((String)csvVector.get(DefectCauseCd1No))) {
				addErrorList( i,DefectCauseCd1No, "AD00221");
				return false;
			}
		}
		//�s�Ǘ��R�R�[�h2�`�F�b�N
		if(csvVector.get(DefectCauseCd2No) != null && !"".equals((String)csvVector.get(DefectCauseCd2No))){
			if(((String)csvVector.get(DefectCauseCd2No)).getBytes().length >= 26){
				addErrorList( i,DefectCauseCd2No, "AA01501");
				return false;
			}
			if(errorWord((String)csvVector.get(DefectCauseCd2No))){
				addErrorList( i,DefectCauseCd2No, "AA01524");
				return false;
			}
			// �O�̏ꍇ
			if("0".equals((String)csvVector.get(DefectCauseCd2No))) {
				addErrorList( i,DefectCauseCd2No, "AD00221");
				return false;
			}
		}
		//�s�Ǘ��R�R�[�h3�`�F�b�N
		if(csvVector.get(DefectCauseCd3No) != null && !"".equals((String)csvVector.get(DefectCauseCd3No))){
			if(((String)csvVector.get(DefectCauseCd3No)).getBytes().length >= 26){
				addErrorList( i,DefectCauseCd3No, "AA01501");
				return false;
			}
			if(errorWord((String)csvVector.get(DefectCauseCd3No))){
				addErrorList( i,DefectCauseCd3No, "AA01524");
				return false;
			}
			// �O�̏ꍇ
			if("0".equals((String)csvVector.get(DefectCauseCd3No))) {
				addErrorList( i,DefectCauseCd3No, "AD00221");
				return false;
			}
		}
		//�s�Ǘ��R�R�[�h4�`�F�b�N
		if(csvVector.get(DefectCauseCd4No) != null && !"".equals((String)csvVector.get(DefectCauseCd4No))){
			if(((String)csvVector.get(DefectCauseCd4No)).getBytes().length >= 26){
				addErrorList( i,DefectCauseCd4No, "AA01501");
				return false;
			}
			if(errorWord((String)csvVector.get(DefectCauseCd4No))){
				addErrorList( i,DefectCauseCd4No, "AA01524");
				return false;
			}
			// �O�̏ꍇ
			if("0".equals((String)csvVector.get(DefectCauseCd4No))) {
				addErrorList( i,DefectCauseCd4No, "AD00221");
				return false;
			}
		}
		//�s�Ǘ��R�R�[�h5�`�F�b�N
		if(csvVector.get(DefectCauseCd5No) != null && !"".equals((String)csvVector.get(DefectCauseCd5No))){
			if(((String)csvVector.get(DefectCauseCd5No)).getBytes().length >= 26){
				addErrorList( i,DefectCauseCd5No, "AA01501");
				return false;
			}
			if(errorWord((String)csvVector.get(DefectCauseCd5No))){
				addErrorList( i,DefectCauseCd5No, "AA01524");
				return false;
			}
			// �O�̏ꍇ
			if("0".equals((String)csvVector.get(DefectCauseCd5No))) {
				addErrorList( i,DefectCauseCd5No, "AD00221");
				return false;
			}
		}
		
		//�s�ǐ�1�`�F�b�N
		if(csvVector.get(DefectQty1No) != null && !"".equals((String)csvVector.get(DefectQty1No))){
			try {
				tempDouble = Double.parseDouble((String)csvVector.get(DefectQty1No));
			} catch (NumberFormatException e) {
				addErrorList( i,DefectQty1No, "AA01503");
				return false;
			}
			if(!formatCheck.isNumberFormat((String)csvVector.get(DefectQty1No),14,4)){
				addErrorList( i,DefectQty1No, "AA01501");
				return false;
			}
			if(tempDouble < 0){
				addErrorList( i,DefectQty1No, "AA01501");
				return false;	
			}
		}
		//�s�ǐ�2�`�F�b�N
		if(csvVector.get(DefectQty2No) != null && !"".equals((String)csvVector.get(DefectQty2No))){
			try {
				tempDouble = Double.parseDouble((String)csvVector.get(DefectQty2No));
			} catch (NumberFormatException e) {
				addErrorList( i,DefectQty2No, "AA01503");
				return false;
			}
			if(!formatCheck.isNumberFormat((String)csvVector.get(DefectQty2No),14,4)){
				addErrorList( i,DefectQty2No, "AA01501");
				return false;
			}
			if(tempDouble < 0){
				addErrorList( i,DefectQty2No, "AA01501");
				return false;	
			}
		}
		//�s�ǐ�3�`�F�b�N
		if(csvVector.get(DefectQty3No) != null && !"".equals((String)csvVector.get(DefectQty3No))){
			try {
				tempDouble = Double.parseDouble((String)csvVector.get(DefectQty3No));
			} catch (NumberFormatException e) {
				addErrorList( i,DefectQty3No, "AA01503");
				return false;
			}
			if(!formatCheck.isNumberFormat((String)csvVector.get(DefectQty3No),14,4)){
				addErrorList( i,DefectQty3No, "AA01501");
				return false;
			}
			if(tempDouble < 0){
				addErrorList( i,DefectQty3No, "AA01501");
				return false;	
			}
		}
		//�s�ǐ�4�`�F�b�N
		if(csvVector.get(DefectQty4No) != null && !"".equals((String)csvVector.get(DefectQty4No))){
			try {
				tempDouble = Double.parseDouble((String)csvVector.get(DefectQty4No));
			} catch (NumberFormatException e) {
				addErrorList( i,DefectQty4No, "AA01503");
				return false;
			}
			if(!formatCheck.isNumberFormat((String)csvVector.get(DefectQty4No),14,4)){
				addErrorList( i,DefectQty4No, "AA01501");
				return false;
			}
			if(tempDouble < 0){
				addErrorList( i,DefectQty4No, "AA01501");
				return false;	
			}
		}
		//�s�ǐ�5�`�F�b�N
		if(csvVector.get(DefectQty5No) != null && !"".equals((String)csvVector.get(DefectQty5No))){
			try {
				tempDouble = Double.parseDouble((String)csvVector.get(DefectQty5No));
			} catch (NumberFormatException e) {
				addErrorList( i,DefectQty5No, "AA01503");
				return false;
			}
			if(!formatCheck.isNumberFormat((String)csvVector.get(DefectQty5No),14,4)){
				addErrorList( i,DefectQty5No, "AA01501");
				return false;
			}
			if(tempDouble < 0){
				addErrorList( i,DefectQty5No, "AA01501");
				return false;	
			}
		}

        //�s�ǔ��l1�`�F�b�N
		if(csvVector.get(DefectComment1No) != null && !"".equals((String)csvVector.get(DefectComment1No))){
			if(((String)csvVector.get(DefectComment1No)).getBytes().length >= 81){
				addErrorList( i,DefectComment1No, "AA01501");
				return false;
			}
			if(errorWord((String)csvVector.get(DefectComment1No))){
				addErrorList( i,DefectComment1No, "AA01524");
				return false;
			}
		}
        //�s�ǔ��l2�`�F�b�N
		if(csvVector.get(DefectComment2No) != null && !"".equals((String)csvVector.get(DefectComment2No))){
			if(((String)csvVector.get(DefectComment2No)).getBytes().length >= 81){
				addErrorList( i,DefectComment2No, "AA01501");
				return false;
			}
			if(errorWord((String)csvVector.get(DefectComment2No))){
				addErrorList( i,DefectComment2No, "AA01524");
				return false;
			}
		}
        //�s�ǔ��l3�`�F�b�N
		if(csvVector.get(DefectComment3No) != null && !"".equals((String)csvVector.get(DefectComment3No))){
			if(((String)csvVector.get(DefectComment3No)).getBytes().length >= 81){
				addErrorList( i,DefectComment3No, "AA01501");
				return false;
			}
			if(errorWord((String)csvVector.get(DefectComment3No))){
				addErrorList( i,DefectComment3No, "AA01524");
				return false;
			}
		}
        //�s�ǔ��l4�`�F�b�N
		if(csvVector.get(DefectComment4No) != null && !"".equals((String)csvVector.get(DefectComment4No))){
			if(((String)csvVector.get(DefectComment4No)).getBytes().length >= 81){
				addErrorList( i,DefectComment4No, "AA01501");
				return false;
			}
			if(errorWord((String)csvVector.get(DefectComment4No))){
				addErrorList( i,DefectComment4No, "AA01524");
				return false;
			}
		}
        //�s�ǔ��l5�`�F�b�N
		if(csvVector.get(DefectComment5No) != null && !"".equals((String)csvVector.get(DefectComment5No))){
			if(((String)csvVector.get(DefectComment5No)).getBytes().length >= 81){
				addErrorList( i,DefectComment5No, "AA01501");
				return false;
			}
			if(errorWord((String)csvVector.get(DefectComment5No))){
				addErrorList( i,DefectComment5No, "AA01524");
				return false;
			}
		}
		//��Ɗ����t���O�`�F�b�N
		if((String)csvVector.get(OprCmpltFlgNo) != null && !"".equals((String)csvVector.get(OprCmpltFlgNo))){
			if(!"0".equals((String)csvVector.get(OprCmpltFlgNo)) && !"1".equals((String)csvVector.get(OprCmpltFlgNo))
					&& !"2".equals((String)csvVector.get(OprCmpltFlgNo))){
				addErrorList( i,OprCmpltFlgNo, "AD00119");
				return false;				
			}
			if("2".equals((String)csvVector.get(OprCmpltFlgNo))){
				if("".equals((String)csvVector.get(AcptQtyNo))){
					csvVector.set(AcptQtyNo,"0");
				}
				if("".equals((String)csvVector.get(DefectQtyNo))){
					csvVector.set(DefectQtyNo,"0");
				}
				if("".equals((String)csvVector.get(PreArrangementTimeNo))){
					csvVector.set(PreArrangementTimeNo,"0");
				}
				if("".equals((String)csvVector.get(PostArrangementTimeNo))){
					csvVector.set(PostArrangementTimeNo,"0");
				}
				if("".equals((String)csvVector.get(OprTimeNo))){
					csvVector.set(OprTimeNo,"0");
				}
				if("".equals((String)csvVector.get(CessationTimeNo))){
					csvVector.set(CessationTimeNo,"0");
				}
				if(Calculate.compare(
						Calculate.add(Calculate.add(Calculate.add(Calculate.add(Calculate.add((String)csvVector.get(AcptQtyNo)
								,(String)csvVector.get(DefectQtyNo))
								,(String)csvVector.get(PreArrangementTimeNo))
								,(String)csvVector.get(PostArrangementTimeNo))
								,(String)csvVector.get(OprTimeNo))
								,(String)csvVector.get(CessationTimeNo)), "0") != 0){
					addErrorList( i,OprCmpltFlgNo, "AE00201");
					return false;	
				}
			}
		}
		//�q�i�ڈꊇ�X�V�t���O
		if((String)csvVector.get(ChildRsltUpdateFlgNo) != null && !"".equals((String)csvVector.get(ChildRsltUpdateFlgNo))){
			if(!"0".equals((String)csvVector.get(ChildRsltUpdateFlgNo)) && !"1".equals((String)csvVector.get(ChildRsltUpdateFlgNo))){
				addErrorList( i,ChildRsltUpdateFlgNo, "AD00122");
				return false;
			}
		}
		return true;
	}
	// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Q�ƃ{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlBrowse() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0080");
		logger.entering("AD0080010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");
			//{{user_implement_dev:<controlBrowse>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlBrowse>
		logger.exiting("AD0080010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");

		return;
	}

	/**
	 * �捞�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCsvIn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0080");
		logger.entering("AD0080010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");
			//{{user_implement_dev:<controlCsvIn>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {			
		    // �������ݒ�
			setReadStatus(INITIAL);
			setList(null);
			int totalOkData = 0;
			int totalErrorData = 0;
			int totalData = 0;
			Vector csvVector;
			// ������_ERRLIST
			_errList = new ArrayList(0);
			// �捞�f�[�^�擾
			String[] csvDateStr = ( String[] )csvReader.lineRead();
			// �f�[�^���݃`�F�b�N
			if(csvDateStr.length  < 2 || csvDateStr[0].length() == 0 ||csvDateStr[1].length() == 0){
				setErrorMessage("AH00042", "0", "0");
				return;
			}
		      	
			for(int i = 1 ; i < csvDateStr.length ; i++){
				if(csvDateStr[i].length() == 0 ){
					break;
				}
				totalData++;
				csvVector = csvReader.importCSVLine(csvDateStr[i]);
				// ���ڐ� �� 34���� �����̏ꍇ
				if(csvVector != null && csvVector.size() < ColSize){
			    	ExpjMessage exmsg = new ExpjMessage( "AH00044", ""+ColSize);
					addErrorList( i, exmsg);
					continue;
				}
				// ���ڐ� �� 34���ڑ������̏ꍇ
				if(csvVector != null && csvVector.size() > ColSize){
			    	ExpjMessage exmsg = new ExpjMessage( "AA01519", ""+csvVector.size());
				 	addErrorList( i, exmsg);
					continue;
				}
				if(!checkItem(csvVector,i)){
					continue;
				}
				totalOkData++;
				
				// ��Ǝ��ю捞�Ǘ��ԍ��̔�
				List seqList = entity.mSEQ_OPR.read(conn, struct);
				if (!seqList.isEmpty()) {
					struct.setOPR_RSLT_TEMP_CTL_NO("ORT" + ((AD0080010Struct)seqList.get(0)).getOPR_RSLT_TEMP_CTL_NO());
				} else {
					break;
				}

                //�m��Ǝ��шꎞ�e�[�u���n�ɒǉ�
				struct.setOPR_INST_CD((String)csvVector.get(OprInstCdNo));
				struct.setITEM_CD((String)csvVector.get(ItemCdNo));
				struct.setACPT_QTY((String)csvVector.get(AcptQtyNo));
				struct.setDEFECT_QTY((String)csvVector.get(DefectQtyNo));
				struct.setOPR_DATE((String)csvVector.get(OprDateNo));
				struct.setWH_CD((String)csvVector.get(WhCdNo));
				struct.setWS_CD((String)csvVector.get(WsCdNo));
				
				struct.setOPR_RSLT_PERSON((String)csvVector.get(OprRsltPersonNo));
				struct.setOPR_RSLT_COMMENT((String)csvVector.get(OprRsltCommentNo));
				struct.setOPR_TIME_UNIT_TYP((String)csvVector.get(OprTimeImeUnitTypNo));
				struct.setPRE_ARRANGEMENT_TIME((String)csvVector.get(PreArrangementTimeNo));
				struct.setPOST_ARRANGEMENT_TIME((String)csvVector.get(PostArrangementTimeNo));
				struct.setOPR_TIME((String)csvVector.get(OprTimeNo));
				struct.setCESSATION_TIME((String)csvVector.get(CessationTimeNo));
				struct.setCESSATION_CAUSE((String)csvVector.get(CessationCauseNo));
				
				struct.setLOT_NO((String)csvVector.get(LotNoNo));
				struct.setVEND_LOT_NO((String)csvVector.get(VendLotNoNo));
				struct.setDEFECT_CAUSE_CD1((String)csvVector.get(DefectCauseCd1No));
				struct.setDEFECT_QTY1((String)csvVector.get(DefectQty1No));
				struct.setDEFECT_COMMENT1((String)csvVector.get(DefectComment1No));
				struct.setDEFECT_CAUSE_CD2((String)csvVector.get(DefectCauseCd2No));
				struct.setDEFECT_QTY2((String)csvVector.get(DefectQty2No));
				struct.setDEFECT_COMMENT2((String)csvVector.get(DefectComment2No));
				struct.setDEFECT_CAUSE_CD3((String)csvVector.get(DefectCauseCd3No));
				struct.setDEFECT_QTY3((String)csvVector.get(DefectQty3No));
				struct.setDEFECT_COMMENT3((String)csvVector.get(DefectComment3No));
				struct.setDEFECT_CAUSE_CD4((String)csvVector.get(DefectCauseCd4No));
				struct.setDEFECT_QTY4((String)csvVector.get(DefectQty4No));
				struct.setDEFECT_COMMENT4((String)csvVector.get(DefectComment4No));
				struct.setDEFECT_CAUSE_CD5((String)csvVector.get(DefectCauseCd5No));
				struct.setDEFECT_QTY5((String)csvVector.get(DefectQty5No));
				struct.setDEFECT_COMMENT5((String)csvVector.get(DefectComment5No));
				struct.setOPR_CMPLT_FLG((String)csvVector.get(OprCmpltFlgNo));
				struct.setTAKE_DATE(businessDate);
				struct.setCHILD_RSLTUPDATE_FLG((String)csvVector.get(ChildRsltUpdateFlgNo));
				entity.mT_OPR_RSLT_TEMP.create(conn,struct);
			}
			//�G���[���ʂ��擾
			totalErrorData = totalData - totalOkData ;
			setList(_errList);
			// �I�����b�Z�[�W�o��
			if(totalErrorData == 0){
				setInfoMessage("AA01514",String.valueOf(totalOkData));
			}else{
				setErrorMessage("AA01607",String.valueOf(totalOkData),String.valueOf(totalErrorData));
			}
			if(list != null && list.size() > 0){
				setReadStatus(NORMAL);
				return;
			}
			//�G���[�Ȃ��ꍇ�A�R�����g
			if(totalErrorData == 0){
				conn.commit();
			}
			setReadStatus(NORMAL);
			
		} catch(Exception e) {
			setErrorMessage("ZZ01106");
			e.printStackTrace();
		}finally{
			if(conn != null ){
				conn.rollback();
			}
		}
                //}}user_implement_dev:<controlCsvIn>
		logger.exiting("AD0080010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");

		return;
	}

	/**
	 * CSV�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCsvOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0080");
		logger.entering("AD0080010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");
			//{{user_implement_dev:<controlCsvOut>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
            struct.setDOWNLOAD_FILE("");
			csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));

			List csvList = new ArrayList();
			// CSV���̍쐬
			// �^�C�g�����ݒ�
			String csvTitle[] = { "Expj.Cmt3094", // �G���[�ӏ�
								  "Expj.Cmt3098"  // �G���[���e
			};
			// CSV���X�g�ɓ����
			csvList.add(csvTitle);

			AD0080010Struct workStruct;
			// ���ד��e�ݒ�
			for (int i = 0; i < getListsize(); i++) {
				workStruct = getListvalue(i);
				String csvStr[] = new String[csvTitle.length];
				csvStr[0] = workStruct.getl_ERROR_IN();// �G���[�ӏ�
				csvStr[1] = workStruct.getl_ERR_INFO();// �G���[���e
				csvList.add(csvStr);// CSV���X�g�ɓ����
			}

			if (csvList != null && csvList.size() > 0) {
				// csv�t�@�C���ɏ���
				csvWriter.write(csvList, CoreTools.getLocale(struct
						.getsUser_ID()), true);
				struct.setDOWNLOAD_FILE(csvWriter.getFilePath());
			}
		}catch(Exception e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());// �v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			throw ee;
		} 
                //}}user_implement_dev:<controlCsvOut>
		logger.exiting("AD0080010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0080");
		logger.entering("AD0080010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("AD0080010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * �S�폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlDeleteAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0080");
		logger.entering("AD0080010Control"+":USER="+struct.getsUser_ID(),"controlDeleteAll");
			//{{user_implement_dev:<controlDeleteAll>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			
			struct.setUSER_CD(getsysUSER_CD());
			entity.mdeleteT_OPR_RSLT_TEMP.delete(conn, struct);
			// �R�~�b�g
			conn.commit();
			if(list != null && list.size()>0) {
				list.clear();
			}
			setReadStatus(INITIAL);
		} catch(SQLException e) {		
			setErrorMessage("ZZ01106");
			e.printStackTrace();
		}
                //}}user_implement_dev:<controlDeleteAll>
		logger.exiting("AD0080010Control"+":USER="+struct.getsUser_ID(),"controlDeleteAll");

		return;
	}

	/**
	 * ���s�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlExecute() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0080");
		logger.entering("AD0080010Control"+":USER="+struct.getsUser_ID(),"controlExecute");
			//{{user_implement_dev:<controlExecute>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try{
	    	setReadStatus(INITIAL); 
	        // �o�b�`�����N���X��main����
	        String strBatchClassName = null;		// �Ăяo����N���X��
	        String strBatchProcessingTyp = null;	// �o�b�`�����敪
	        String strProgramId = null;			    // �Ɩ����iAD0080B002�j
	        String strUserId = null;				// ���[�UID
	        String strPlantCd = null;				// �H��R�[�h
	        String strCsvTakeTyp =null;             // CSV�捞����
	        // �����Z�b�g
	        strBatchClassName = "com.nec.jp.orteus.metamorBase.AD0080.AD0080B002.mainAD0080B002";
	        strBatchProcessingTyp = "2";					  // 2: �����^�]���Ȃ��i��ԃo�b�`�Ȃ��j
	        strProgramId = "AD0080B002";					  // �Ɩ����iAE0180B001�j
	        strUserId = getsysUSER_CD();					  // ���[�UID
	        strPlantCd = getsysPLANT_CD();					  // �H��R�[�h
	        strCsvTakeTyp ="1";                               // CSV�捞���� = 1:�Œ�t�@�C���捞
	        // �o�b�`���������s���� -------------------------------------------
	        ResourceBundle bundle = SystemConfig.getBundle();
	        String javaPath = SystemConfig.getProperty("JAVA_PATH", bundle);
	        if(javaPath == null){
	            //�V�X�e������l�t�@�C������̏��擾�Ɏ��s���܂���(�i�u�l�p�X)
	            setErrorMessage("ZZ09010");
	            return;
	           }
	        String ClassPath = SystemConfig.getProperty("CLASS_PATH", bundle);
	        if(ClassPath == null){
	        	//�V�X�e������l�t�@�C������̏��擾�Ɏ��s���܂���(�N���X�p�X)
	        	setErrorMessage("ZZ09012");
	            return;
	        }
	        String batchPath = SystemConfig.getProperty("BATCH_PATH", bundle);
	        if(batchPath == null){        	
	            //�V�X�e������l�t�@�C������̏��擾�Ɏ��s���܂���(�o�b�`�N���ݒ�)        	
	        	setErrorMessage("ZZ09011");
	            return;
	        }
	    
	        String heapSize = SystemConfig.getProperty("HIGH_HEAP_SIZE",bundle); 
	        if (heapSize == null) {
	            //�V�X�e������l�t�@�C������̏��擾�Ɏ��s���܂���(�o�b�`�q�[�v�T�C�Y�ݒ�)
	        	setErrorMessage("ZZ09017");
	            return;
	           }
	        List buffer = new ArrayList();
			buffer.add(javaPath);            // �i�u�l
			buffer.add("-cp");
			buffer.add(ClassPath);           // Java ClassPath
			buffer.add("-Dcom.nec.jp.orteus.util.logging.config.file="+batchPath); // �N���ݒ�
			buffer.add(strBatchClassName);                       // �Ăяo����N���X
			buffer.add(strBatchProcessingTyp);                   // �o�b�`�����敪
			buffer.add(strUserId);                               // ���[�UID
			buffer.add(strProgramId);                            // �Ɩ�ID
			buffer.add(strPlantCd);                              // �H��R�[�h
			buffer.add(strCsvTakeTyp);                           // CSV�捞����		
			try {
				// �o�b�`�������s
				Runtime runtime = Runtime.getRuntime();
				runtime.exec((String[])buffer.toArray(new String[buffer.size()]));
			} catch (IOException e) {	        	
		        // �o�b�`�Ăяo�����s�̏ꍇ�A��ʃ��b�Z�[�W��\������B
				setErrorMessage("ZZ09014");
				return;
	        }	    
	        // �o�b�`�Ăяo�������̏ꍇ�A��ʃ��b�Z�[�W��\������B
			setInfoMessage2("ZZ09013");
	    }catch(Exception e){			
			e.printStackTrace();
			setErrorMessage("ZZ01106");
		
		}
		
                //}}user_implement_dev:<controlExecute>
		logger.exiting("AD0080010Control"+":USER="+struct.getsUser_ID(),"controlExecute");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0080");
		logger.entering("AD0080010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AD0080010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0080");
		logger.entering("AD0080010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try{
			locale = CoreTools.getLocale(getsysUSER_CD());
			// �Ɩ��^�p�����擾
			String busOprDate = DateCtrl.getBusinessOprDate(conn, getsysPLANT_CD());
			if(busOprDate == null || "".equals(busOprDate)) {
				// �Ɩ����t�̎擾�Ɏ��s���܂����B
				setErrorMessage("KR00017");
				setReadStatus(ERROR);
				return;
			}
			businessDate = busOprDate;
		} catch(SQLException e) {
			// ��O�ُ�I��
			e.printStackTrace();
			throw new ExpjException(e);
		}

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AD0080010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0080");
		logger.entering("AD0080010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
		logger.exiting("AD0080010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("Browse") ) {
				controlBrowse();
			} else if( button.equals("CsvIn") ) {
				controlCsvIn();
			} else if( button.equals("CsvOut") ) {
				controlCsvOut();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("DeleteAll") ) {
				controlDeleteAll();
			} else if( button.equals("Execute") ) {
				controlExecute();
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
//			throw new FoundationException("AD0080010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0080010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AD0080010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0080010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AD0080010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0080010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AD0080010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AD0080010Entity entity;
	protected AD0080010Struct struct;
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

		entity = new AD0080010Entity();
		struct = new AD0080010Struct();

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
	 * AD0080010�N���X�̕W���R���X�g���N�^
	 */
	public AD0080010Control() throws BusinessProcessException, FoundationException
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
				AD0080010Struct key = (AD0080010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("FileName") && key.getFileName() != null) {
					msgKey.setKeyValue("FileName", key.getFileName());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("l_ERROR_IN") && key.getl_ERROR_IN() != null) {
					msgKey.setKeyValue("l_ERROR_IN", key.getl_ERROR_IN());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_INFO") && key.getl_ERR_INFO() != null) {
					msgKey.setKeyValue("l_ERR_INFO", key.getl_ERR_INFO());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_TEMP_CTL_NO") && key.getOPR_RSLT_TEMP_CTL_NO() != null) {
					msgKey.setKeyValue("OPR_RSLT_TEMP_CTL_NO", key.getOPR_RSLT_TEMP_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD") && key.getOPR_INST_CD() != null) {
					msgKey.setKeyValue("OPR_INST_CD", key.getOPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ACPT_QTY") && key.getACPT_QTY() != null) {
					msgKey.setKeyValue("ACPT_QTY", key.getACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_QTY") && key.getDEFECT_QTY() != null) {
					msgKey.setKeyValue("DEFECT_QTY", key.getDEFECT_QTY());
				}
				if(msgKeyType.containsKeyColumn("OPR_DATE") && key.getOPR_DATE() != null) {
					msgKey.setKeyValue("OPR_DATE", key.getOPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_PERSON") && key.getOPR_RSLT_PERSON() != null) {
					msgKey.setKeyValue("OPR_RSLT_PERSON", key.getOPR_RSLT_PERSON());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_COMMENT") && key.getOPR_RSLT_COMMENT() != null) {
					msgKey.setKeyValue("OPR_RSLT_COMMENT", key.getOPR_RSLT_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("OPR_TIME_UNIT_TYP") && key.getOPR_TIME_UNIT_TYP() != null) {
					msgKey.setKeyValue("OPR_TIME_UNIT_TYP", key.getOPR_TIME_UNIT_TYP());
				}
				if(msgKeyType.containsKeyColumn("PRE_ARRANGEMENT_TIME") && key.getPRE_ARRANGEMENT_TIME() != null) {
					msgKey.setKeyValue("PRE_ARRANGEMENT_TIME", key.getPRE_ARRANGEMENT_TIME());
				}
				if(msgKeyType.containsKeyColumn("POST_ARRANGEMENT_TIME") && key.getPOST_ARRANGEMENT_TIME() != null) {
					msgKey.setKeyValue("POST_ARRANGEMENT_TIME", key.getPOST_ARRANGEMENT_TIME());
				}
				if(msgKeyType.containsKeyColumn("OPR_TIME") && key.getOPR_TIME() != null) {
					msgKey.setKeyValue("OPR_TIME", key.getOPR_TIME());
				}
				if(msgKeyType.containsKeyColumn("CESSATION_TIME") && key.getCESSATION_TIME() != null) {
					msgKey.setKeyValue("CESSATION_TIME", key.getCESSATION_TIME());
				}
				if(msgKeyType.containsKeyColumn("CESSATION_CAUSE") && key.getCESSATION_CAUSE() != null) {
					msgKey.setKeyValue("CESSATION_CAUSE", key.getCESSATION_CAUSE());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO") && key.getLOT_NO() != null) {
					msgKey.setKeyValue("LOT_NO", key.getLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("VEND_LOT_NO") && key.getVEND_LOT_NO() != null) {
					msgKey.setKeyValue("VEND_LOT_NO", key.getVEND_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_CAUSE_CD1") && key.getDEFECT_CAUSE_CD1() != null) {
					msgKey.setKeyValue("DEFECT_CAUSE_CD1", key.getDEFECT_CAUSE_CD1());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_QTY1") && key.getDEFECT_QTY1() != null) {
					msgKey.setKeyValue("DEFECT_QTY1", key.getDEFECT_QTY1());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_COMMENT1") && key.getDEFECT_COMMENT1() != null) {
					msgKey.setKeyValue("DEFECT_COMMENT1", key.getDEFECT_COMMENT1());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_CAUSE_CD2") && key.getDEFECT_CAUSE_CD2() != null) {
					msgKey.setKeyValue("DEFECT_CAUSE_CD2", key.getDEFECT_CAUSE_CD2());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_QTY2") && key.getDEFECT_QTY2() != null) {
					msgKey.setKeyValue("DEFECT_QTY2", key.getDEFECT_QTY2());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_COMMENT2") && key.getDEFECT_COMMENT2() != null) {
					msgKey.setKeyValue("DEFECT_COMMENT2", key.getDEFECT_COMMENT2());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_CAUSE_CD3") && key.getDEFECT_CAUSE_CD3() != null) {
					msgKey.setKeyValue("DEFECT_CAUSE_CD3", key.getDEFECT_CAUSE_CD3());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_QTY3") && key.getDEFECT_QTY3() != null) {
					msgKey.setKeyValue("DEFECT_QTY3", key.getDEFECT_QTY3());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_COMMENT3") && key.getDEFECT_COMMENT3() != null) {
					msgKey.setKeyValue("DEFECT_COMMENT3", key.getDEFECT_COMMENT3());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_CAUSE_CD4") && key.getDEFECT_CAUSE_CD4() != null) {
					msgKey.setKeyValue("DEFECT_CAUSE_CD4", key.getDEFECT_CAUSE_CD4());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_QTY4") && key.getDEFECT_QTY4() != null) {
					msgKey.setKeyValue("DEFECT_QTY4", key.getDEFECT_QTY4());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_COMMENT4") && key.getDEFECT_COMMENT4() != null) {
					msgKey.setKeyValue("DEFECT_COMMENT4", key.getDEFECT_COMMENT4());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_CAUSE_CD5") && key.getDEFECT_CAUSE_CD5() != null) {
					msgKey.setKeyValue("DEFECT_CAUSE_CD5", key.getDEFECT_CAUSE_CD5());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_QTY5") && key.getDEFECT_QTY5() != null) {
					msgKey.setKeyValue("DEFECT_QTY5", key.getDEFECT_QTY5());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_COMMENT5") && key.getDEFECT_COMMENT5() != null) {
					msgKey.setKeyValue("DEFECT_COMMENT5", key.getDEFECT_COMMENT5());
				}
				if(msgKeyType.containsKeyColumn("OPR_CMPLT_FLG") && key.getOPR_CMPLT_FLG() != null) {
					msgKey.setKeyValue("OPR_CMPLT_FLG", key.getOPR_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("TAKE_DATE") && key.getTAKE_DATE() != null) {
					msgKey.setKeyValue("TAKE_DATE", key.getTAKE_DATE());
				}
				if(msgKeyType.containsKeyColumn("CHILD_RSLTUPDATE_FLG") && key.getCHILD_RSLTUPDATE_FLG() != null) {
					msgKey.setKeyValue("CHILD_RSLTUPDATE_FLG", key.getCHILD_RSLTUPDATE_FLG());
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
					AD0080010Struct key = new AD0080010Struct();
					if(msgKeyType.containsKeyColumn("FileName")) {
						key.setFileName(msgKey.getKeyValue("FileName"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("l_ERROR_IN")) {
						key.setl_ERROR_IN(msgKey.getKeyValue("l_ERROR_IN"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_INFO")) {
						key.setl_ERR_INFO(msgKey.getKeyValue("l_ERR_INFO"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_TEMP_CTL_NO")) {
						key.setOPR_RSLT_TEMP_CTL_NO(msgKey.getKeyValue("OPR_RSLT_TEMP_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD")) {
						key.setOPR_INST_CD(msgKey.getKeyValue("OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_QTY")) {
						key.setACPT_QTY(msgKey.getKeyValue("ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_QTY")) {
						key.setDEFECT_QTY(msgKey.getKeyValue("DEFECT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("OPR_DATE")) {
						key.setOPR_DATE(msgKey.getKeyValue("OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_PERSON")) {
						key.setOPR_RSLT_PERSON(msgKey.getKeyValue("OPR_RSLT_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_COMMENT")) {
						key.setOPR_RSLT_COMMENT(msgKey.getKeyValue("OPR_RSLT_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TIME_UNIT_TYP")) {
						key.setOPR_TIME_UNIT_TYP(msgKey.getKeyValue("OPR_TIME_UNIT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PRE_ARRANGEMENT_TIME")) {
						key.setPRE_ARRANGEMENT_TIME(msgKey.getKeyValue("PRE_ARRANGEMENT_TIME"));
					}
					if(msgKeyType.containsKeyColumn("POST_ARRANGEMENT_TIME")) {
						key.setPOST_ARRANGEMENT_TIME(msgKey.getKeyValue("POST_ARRANGEMENT_TIME"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TIME")) {
						key.setOPR_TIME(msgKey.getKeyValue("OPR_TIME"));
					}
					if(msgKeyType.containsKeyColumn("CESSATION_TIME")) {
						key.setCESSATION_TIME(msgKey.getKeyValue("CESSATION_TIME"));
					}
					if(msgKeyType.containsKeyColumn("CESSATION_CAUSE")) {
						key.setCESSATION_CAUSE(msgKey.getKeyValue("CESSATION_CAUSE"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO")) {
						key.setLOT_NO(msgKey.getKeyValue("LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("VEND_LOT_NO")) {
						key.setVEND_LOT_NO(msgKey.getKeyValue("VEND_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_CAUSE_CD1")) {
						key.setDEFECT_CAUSE_CD1(msgKey.getKeyValue("DEFECT_CAUSE_CD1"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_QTY1")) {
						key.setDEFECT_QTY1(msgKey.getKeyValue("DEFECT_QTY1"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_COMMENT1")) {
						key.setDEFECT_COMMENT1(msgKey.getKeyValue("DEFECT_COMMENT1"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_CAUSE_CD2")) {
						key.setDEFECT_CAUSE_CD2(msgKey.getKeyValue("DEFECT_CAUSE_CD2"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_QTY2")) {
						key.setDEFECT_QTY2(msgKey.getKeyValue("DEFECT_QTY2"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_COMMENT2")) {
						key.setDEFECT_COMMENT2(msgKey.getKeyValue("DEFECT_COMMENT2"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_CAUSE_CD3")) {
						key.setDEFECT_CAUSE_CD3(msgKey.getKeyValue("DEFECT_CAUSE_CD3"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_QTY3")) {
						key.setDEFECT_QTY3(msgKey.getKeyValue("DEFECT_QTY3"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_COMMENT3")) {
						key.setDEFECT_COMMENT3(msgKey.getKeyValue("DEFECT_COMMENT3"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_CAUSE_CD4")) {
						key.setDEFECT_CAUSE_CD4(msgKey.getKeyValue("DEFECT_CAUSE_CD4"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_QTY4")) {
						key.setDEFECT_QTY4(msgKey.getKeyValue("DEFECT_QTY4"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_COMMENT4")) {
						key.setDEFECT_COMMENT4(msgKey.getKeyValue("DEFECT_COMMENT4"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_CAUSE_CD5")) {
						key.setDEFECT_CAUSE_CD5(msgKey.getKeyValue("DEFECT_CAUSE_CD5"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_QTY5")) {
						key.setDEFECT_QTY5(msgKey.getKeyValue("DEFECT_QTY5"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_COMMENT5")) {
						key.setDEFECT_COMMENT5(msgKey.getKeyValue("DEFECT_COMMENT5"));
					}
					if(msgKeyType.containsKeyColumn("OPR_CMPLT_FLG")) {
						key.setOPR_CMPLT_FLG(msgKey.getKeyValue("OPR_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("TAKE_DATE")) {
						key.setTAKE_DATE(msgKey.getKeyValue("TAKE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CHILD_RSLTUPDATE_FLG")) {
						key.setCHILD_RSLTUPDATE_FLG(msgKey.getKeyValue("CHILD_RSLTUPDATE_FLG"));
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
