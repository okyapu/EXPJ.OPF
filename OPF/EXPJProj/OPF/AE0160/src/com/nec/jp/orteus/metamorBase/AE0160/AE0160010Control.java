/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0160/src/com/nec/jp/orteus/metamorBase/AE0160/AE0160010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0160;

import com.nec.jp.orteus.metamorBase.AE0160.*;
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
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AE0160010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.13 $ $Date: 2017/01/09 08:43:57 $
 *
 */
//}}user_implement_code_header

public class AE0160010Control
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
	public AE0160010Struct getListvalue(int x) { return (AE0160010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AE0160010Struct getStruct() { return this.struct; }	// Struct�̒l��Ԃ��܂��B
	public AE0160010Struct createStruct() { return new AE0160010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AE0160010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	//������ѓ��̓e�[�^CSV�t�@�C���̗�C���f�b�N�X
	private final int PuchOdrCdNo           = 0;			//�����ԍ�No
	private final int ItemCdNo              = 1;			//�i�ڔԍ�No
	private final int WhCdNo                = 2;			//����ꏊNo
	private final int AcptDateNo            = 3;			//�����No
	private final int AcptQtyNo             = 4;			//�����No
	private final int UnitCostTypNo         = 5;			//�P���敪No
	private final int UnitCostNo            = 6;			//�P��No
	private final int ProcessingCostNo      = 7;			//���H��No
	private final int MaterialCostNo        = 8;			//�ޗ���No
	private final int OtherOverheadsNo      = 9;			//���̑��o��No
	private final int DiscAmountNo          = 10;			//�l�����zNo
	private final int ExchRateNo            = 11;			//�בփ��[�gNo
	private final int LotNoNo               = 12;			//�݌Ƀ��b�g�ԍ�No
	private final int VendLotNoNo           = 13;			//���[�J���b�g�ԍ�No
	private final int DlvCdNo               = 14;			//�[�i���ԍ�No
	private final int AcptRsltCommentNo	    = 15;			//������є��l    
	private final int AcptRsltCompNo        = 16;			//��������t���O        
	//CSV�t�@�C���̍��ڐ�
    private final int ColSize = 17;
	//�G���[�ꗗ���X�g
	private ArrayList _errList = new ArrayList();
	//�Ɩ��^�p��
	String BusinessOprDate;
     
    /**
     * ��񃁃b�Z�[�W�ݒ�
     * @param ���b�Z�[�W�ԍ�
     * @param �o�̓��b�Z�[�W
     */
    private void setInfoMessage(String messageno)
    {
     ExpjMessage emsg = new ExpjMessage( messageno );
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
	 * @param value1 �u��������2
	 */
	private void setErrorMessage(String code, String value1, String value2) {
		ExpjMessage emsg = new ExpjMessage(code, value1,value2);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, sysUSER_CD);
	}

    
    /**
     * ��񃁃b�Z�[�W�ݒ�
     * @param ���b�Z�[�W�ԍ�
     * @param �o�̓��b�Z�[�W
     */
    private void setInfoMessage(String messageno, String message)
    {
     ExpjMessage emsg = new ExpjMessage( messageno,message );
     msgStruct.addInfo( emsg );
     sysLog.info(emsg, getsysUSER_CD());
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
    	String locale = CoreTools.getLocale(sysUSER_CD);
    	AE0160010Struct s = new AE0160010Struct();
    	ExpjMessage exmsgline = new ExpjMessage( "AH00045" , ""+indexRow , ""+(indexCol+1) );
    	
    	s.setl_ERRLINE_NO(exmsgline.getMessage(locale));
    	s.setl_ERR_MSG( exmsg.getMessage(locale) );
    	
    	_errList.add( s );
    }
    /**
     * �G���[�ꗗ���X�g�ɒǉ�����
     * 
     * @param exmsg �G���[���b�Z�[�W�ԍ�
     * @param indexRow �G���[���ڍs
     */
    private void addErrorList( int indexRow , ExpjMessage exmsg ){   
        String locale = CoreTools.getLocale(sysUSER_CD);
    	AE0160010Struct s = new AE0160010Struct();
    	ExpjMessage exmsgline = new ExpjMessage( "AA01520" , ""+indexRow  );
    	
    	s.setl_ERRLINE_NO(exmsgline.getMessage(locale));
    	s.setl_ERR_MSG( exmsg.getMessage(locale) );
    	
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
     * �e���ڂɑ΂��ă`�F�b�N���s��
     * 
     * @param csvVector
     * @param i 
     * @return �G���[����@false�@�G���[�Ȃ��@true
     */
    private boolean  checkItem( Vector csvVector, int i ){
    	double tempDouble;
    	SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd");
    	sf.setLenient(false);

		formatCheck fc = new formatCheck();
		//�����ԍ��`�F�b�N
		if(csvVector.get(PuchOdrCdNo) == null || "".equals((String)csvVector.get(PuchOdrCdNo))){
			addErrorList( i,PuchOdrCdNo, "AE00099");
			return false;
		}
		if(((String)csvVector.get(PuchOdrCdNo)).getBytes().length  >= 26){
			addErrorList( i,PuchOdrCdNo, "AA01501");
			return false;
		}
		if(errorWord((String)csvVector.get(PuchOdrCdNo))){
			addErrorList( i,PuchOdrCdNo, "AA01524");
			return false;
		}
		//�i�ڔԍ��`�F�b�N
		if(((String)csvVector.get(ItemCdNo)).getBytes().length  >= 26){
			addErrorList( i,ItemCdNo, "AA01501");
			return false;
		}
		if(errorWord((String)csvVector.get(ItemCdNo))){
			addErrorList( i,ItemCdNo, "AA01524");
			return false;
		}
		//����ꏊ�`�F�b�N
		if(((String)csvVector.get(WhCdNo)).getBytes().length  >= 26){
			addErrorList( i,WhCdNo, "AA01501");
			return false;
		}
		if(errorWord((String)csvVector.get(WhCdNo))){
			addErrorList( i,WhCdNo, "AA01524");
			return false;
		}
		//������`�F�b�N
		if(csvVector.get(AcptDateNo) != null && !"".equals((String)csvVector.get(AcptDateNo))){
			try {
				Date date =sf.parse((String)csvVector.get(AcptDateNo));
			    Calendar calendar = Calendar.getInstance();
			    calendar.setTime(date);
			    if(calendar.get(Calendar.YEAR) > 9999){
			    	addErrorList( i,AcptDateNo, "AA01606");
			    	return false;
			    }
			} catch (Exception e) {
				addErrorList( i,AcptDateNo, "AA01606");
				return false;	
			}		
			if(((String)csvVector.get(AcptDateNo)).getBytes().length  > 10 || ((String)csvVector.get(AcptDateNo)).indexOf(" ") >= 0){
				addErrorList( i,AcptDateNo, "AA01606");
				return false;	
			}
		}

		//������`�F�b�N	
		if(csvVector.get(AcptQtyNo) != null && !"".equals((String)csvVector.get(AcptQtyNo))){
			try {
				tempDouble = Double.parseDouble((String)csvVector.get(AcptQtyNo));
			} catch (NumberFormatException e) {
				addErrorList( i,AcptQtyNo, "AA01503");
				return false;
			}
			if(!fc.isNumberFormat((String)csvVector.get(AcptQtyNo),14,4)){
				addErrorList( i,AcptQtyNo, "AA01501");
				return false;
			}
			if(Calculate.compare((String)csvVector.get(AcptQtyNo), "0")==0 &&
					(csvVector.get(AcptRsltCompNo) == null || "".equals((String)csvVector.get(AcptRsltCompNo)))) {
				addErrorList( i,AcptQtyNo, "AE05012");
				return false;
			}
			if(tempDouble < 0){
				addErrorList( i,AcptQtyNo, "AA01501");
				return false;	
			}
		}
		//�P���敪�`�F�b�N	
		if(csvVector.get(UnitCostTypNo) != null &&  !"".equals((String)csvVector.get(UnitCostTypNo))){
			if(!"1".equals((String)csvVector.get(UnitCostTypNo)) &&  !"2".equals((String)csvVector.get(UnitCostTypNo))){
				addErrorList( i,UnitCostTypNo, "CF00012");
				return false;
			}
		}
		//�P���`�F�b�N	
		if(csvVector.get(UnitCostNo) != null && !"".equals((String)csvVector.get(UnitCostNo))){
			try {
				tempDouble = Double.parseDouble((String)csvVector.get(UnitCostNo));
			} catch (NumberFormatException e) {
				addErrorList( i,UnitCostNo, "AA01503");
				return false;
			}
			if(!fc.isNumberFormat((String)csvVector.get(UnitCostNo),14,4)){
				addErrorList( i,UnitCostNo, "AA01501");
				return false;
			}
			if(tempDouble < 0){
				addErrorList( i,UnitCostNo, "AA01501");
				return false;
			}
		}
		//���H��`�F�b�N	
		if(csvVector.get(ProcessingCostNo) != null && !"".equals((String)csvVector.get(ProcessingCostNo))){
			try {
				tempDouble = Double.parseDouble((String)csvVector.get(ProcessingCostNo));
			} catch (NumberFormatException e) {
				addErrorList( i,ProcessingCostNo, "AA01503");
				return false;
			}
			if(!fc.isNumberFormat((String)csvVector.get(ProcessingCostNo),14,4)){
				addErrorList( i,ProcessingCostNo, "AA01501");
				return false;
				}
			if(tempDouble < 0){
				addErrorList( i,ProcessingCostNo, "AA01501");
				return false;
			}
		}
		//�ޗ���`�F�b�N	
		if(csvVector.get(MaterialCostNo) != null && !"".equals((String)csvVector.get(MaterialCostNo))){
			try {
				tempDouble = Double.parseDouble((String)csvVector.get(MaterialCostNo));
			} catch (NumberFormatException e) {
				addErrorList( i,MaterialCostNo, "AA01503");
				return false;
			}
			if(!fc.isNumberFormat((String)csvVector.get(MaterialCostNo),14,4)){
				addErrorList( i,MaterialCostNo, "AA01501");
				return false;
				}
			if(tempDouble < 0){
				addErrorList( i,MaterialCostNo, "AA01501");
				return false;
			}
		}
		//���̑��o��`�F�b�N	
		if(csvVector.get(OtherOverheadsNo) != null && !"".equals((String)csvVector.get(OtherOverheadsNo))){
			try {
				tempDouble = Double.parseDouble((String)csvVector.get(OtherOverheadsNo));
			} catch (NumberFormatException e) {
				addErrorList( i,OtherOverheadsNo, "AA01503");
				return false;
			}
			if(!fc.isNumberFormat((String)csvVector.get(OtherOverheadsNo),14,4)){
				addErrorList( i,OtherOverheadsNo, "AA01501");
				return false;
				}
			if(tempDouble < 0){
				addErrorList( i,OtherOverheadsNo, "AA01501");
				return false;
				}
		}
		//�l�����z�`�F�b�N	
		if(csvVector.get(DiscAmountNo) != null && !"".equals((String)csvVector.get(DiscAmountNo))){
			try {
				tempDouble = Double.parseDouble((String)csvVector.get(DiscAmountNo));
			} catch (NumberFormatException e) {
				addErrorList( i,DiscAmountNo, "AA01503");
				return false;
			}
			if(!fc.isNumberFormat((String)csvVector.get(DiscAmountNo),14,4)){
				addErrorList( i,DiscAmountNo, "AA01501");
				return false;
			}
			if(tempDouble < 0){
				addErrorList( i,DiscAmountNo, "AA01501");
				return false;
			}
		}
		//�בփ��[�g�`�F�b�N	
		if(csvVector.get(ExchRateNo) != null && !"".equals((String)csvVector.get(ExchRateNo))){
			try {
				tempDouble = Double.parseDouble((String)csvVector.get(ExchRateNo));
			} catch (NumberFormatException e) {
				addErrorList( i,ExchRateNo, "AE00058");
				return false;
			}
			if(!fc.isNumberFormat((String)csvVector.get(ExchRateNo),14,6)){
				addErrorList( i,ExchRateNo, "AA01501");
				return false;
			}
			if(tempDouble < 0){
				addErrorList( i,ExchRateNo, "AA01501");
				return false;
			}
			if(Calculate.compare("0",(String)csvVector.get(ExchRateNo)) == 0){
				addErrorList( i,ExchRateNo, "AE00059");
				return false;
			}
		}
		//�݌Ƀ��b�g�ԍ��`�F�b�N
		if("".equals((String)csvVector.get(AcptQtyNo)) || Calculate.compare("0" , (String)csvVector.get(AcptQtyNo)) == 0 ){
			if((String)csvVector.get(LotNoNo) != null && !"".equals((String)csvVector.get(LotNoNo))){
				addErrorList( i,LotNoNo, "AE20617");
				return false;
			}
		}
		if(((String)csvVector.get(LotNoNo)).getBytes().length  >= 26){
			addErrorList( i,LotNoNo, "AA01501");
			return false;
		}
		if(errorWord((String)csvVector.get(LotNoNo))){
			addErrorList( i,LotNoNo, "AA01524");
			return false;
		}
		//���[�J���b�g�ԍ��`�F�b�N
		if(((String)csvVector.get(VendLotNoNo)).getBytes().length  >= 26){
			addErrorList( i,VendLotNoNo, "AA01501");
			return false;
		}
		if(errorWord((String)csvVector.get(VendLotNoNo))){
			addErrorList( i,VendLotNoNo, "AA01524");
			return false;
		}			
	
		//�[�i���ԍ��`�F�b�N
		if(((String)csvVector.get(DlvCdNo)).getBytes().length  >= 26){
			addErrorList( i,DlvCdNo, "AA01501");
			return false;
		}				
		if(errorWord((String)csvVector.get(DlvCdNo))){
			addErrorList( i,DlvCdNo, "AA01524");
			return false;
		}
		//������є��l�`�F�b�N
		if(((String)csvVector.get(AcptRsltCommentNo)).getBytes().length  >= 81){
			addErrorList( i,AcptRsltCommentNo, "AA01501");
			return false;
		}
		if(errorWord((String)csvVector.get(AcptRsltCommentNo))){
			addErrorList( i,AcptRsltCommentNo, "AA01524");
			return false;
		}
	
		//��������t���O�`�F�b�N
		if(csvVector.get(AcptRsltCompNo) != null && !"".equals((String)csvVector.get(AcptRsltCompNo))){
			if(!"0".equals((String)csvVector.get(AcptRsltCompNo)) && !"1".equals((String)csvVector.get(AcptRsltCompNo))
					&& !"2".equals((String)csvVector.get(AcptRsltCompNo))){
				addErrorList( i,AcptRsltCompNo, "AE00191");
				return false;				
			}
			if("0".equals((String)csvVector.get(AcptRsltCompNo)) || "1".equals((String)csvVector.get(AcptRsltCompNo))){
				if("".equals((String)csvVector.get(AcptQtyNo)) || Calculate.compare("0",(String)csvVector.get(AcptQtyNo)) == 0){
					addErrorList( i,AcptRsltCompNo, "AE05012");
					return false;		
				}
			}
			if("2".equals((String)csvVector.get(AcptRsltCompNo))){
				if("".equals((String)csvVector.get(AcptQtyNo))){
					csvVector.set(AcptQtyNo,"0");
				}
				if(Calculate.compare("0",(String)csvVector.get(AcptQtyNo)) != 0){
					addErrorList( i,AcptRsltCompNo, "AE00196");
					return false;				
				}				
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0160");
		logger.entering("AE0160010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");
			//{{user_implement_dev:<controlBrowse>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlBrowse>
		logger.exiting("AE0160010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");

		return;
	}

	/**
	 * �捞�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCsvIn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0160");
		logger.entering("AE0160010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");
			//{{user_implement_dev:<controlCsvIn>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			// �������ݒ�
			setReadStatus(INITIAL);
			setList(null);
			int totalOkData = 0;
			int totalErrorData = 0;
			int totalData = 0;
			Vector csvVector;    //csv�f�[�^
			String acptCtrNo;    //������ю捞�Ǘ��ԍ�
			// ������_ERRLIST
			_errList = new ArrayList();
			// �捞�f�[�^�擾
			String[] csvDateStr = ( String[] )csvReader.lineRead();
			// �f�[�^���݃`�F�b�N
			if(csvDateStr.length  < 2 || csvDateStr[0].length() == 0 ||csvDateStr[1].length() == 0){
				setErrorMessage("AH00042","0","0");
				return;
			}
		      	
			for(int i = 1 ; i < csvDateStr.length ; i++){
				
				if(csvDateStr[i].length() == 0 ){
					break;
				}
				totalData++;
				csvVector = csvReader.importCSVLine(csvDateStr[i]);
				// ���ڐ� �� 17���� �����̏ꍇ
				if(csvVector != null && csvVector.size() < ColSize){
			    	ExpjMessage exmsg = new ExpjMessage( "AH00044", ""+ColSize);
					addErrorList( i, exmsg);
					continue;
				}
				// ���ڐ� �� 17���ڑ������̏ꍇ
				if(csvVector != null && csvVector.size() > ColSize){
			    	ExpjMessage exmsg = new ExpjMessage( "AA01519", ""+csvVector.size());
				 	addErrorList( i, exmsg);
					continue;
				}
				//�e���ڂɑ΂��ă`�F�b�N
				if(!checkItem(csvVector,i)){
					continue;
				}
				totalOkData++;
				//������ю捞�Ǘ��ԍ����擾
				List tempList = entity.mgetACPT_RSLT_TEMP_CTL_NO.read(conn,struct);
				acptCtrNo = ((AE0160010Struct)tempList.get(0)).getACPT_RSLT_TEMP_CTL_NO();
				acptCtrNo = "ART"+acptCtrNo;
				//�m������шꎞ�e�[�u���n�ɒǉ�
				struct.setACPT_RSLT_TEMP_CTL_NO(acptCtrNo);
				struct.setPUCH_ODR_CD((String)csvVector.get(PuchOdrCdNo));
				struct.setITEM_CD((String)csvVector.get(ItemCdNo));
				struct.setWH_CD((String)csvVector.get(WhCdNo));
				struct.setACPT_DATE((String)csvVector.get(AcptDateNo));
				struct.setACPT_QTY((String)csvVector.get(AcptQtyNo));
				struct.setUNIT_COST_TYP((String)csvVector.get(UnitCostTypNo));
				struct.setUNIT_COST((String)csvVector.get(UnitCostNo));
				struct.setPROCESSING_COST((String)csvVector.get(ProcessingCostNo));
				struct.setMATERIAL_COST((String)csvVector.get(MaterialCostNo));
				struct.setOTHER_OVERHEADS((String)csvVector.get(OtherOverheadsNo));
				struct.setDISC_AMOUNT((String)csvVector.get(DiscAmountNo));
				struct.setEXCH_RATE((String)csvVector.get(ExchRateNo));
				struct.setLOT_NO((String)csvVector.get(LotNoNo));
				struct.setVEND_LOT_NO((String)csvVector.get(VendLotNoNo));
				struct.setDLV_CD((String)csvVector.get(DlvCdNo));
				struct.setACPT_RSLT_COMMENT((String)csvVector.get(AcptRsltCommentNo));
				struct.setACPT_RSLT_COMP((String)csvVector.get(AcptRsltCompNo));
				struct.setTAKE_DATE(BusinessOprDate);
				entity.mT_ACPT_RSLT_TEMP.create(conn,struct);
			}
			//�G���[�����擾
			totalErrorData = totalData - totalOkData ;
			setList(_errList);
			// �I�����b�Z�[�W�o��
			if(totalErrorData == 0){
				setInfoMessage("AA01514",String.valueOf(totalOkData));
			}else{
				setErrorMessage("AA01607",String.valueOf(totalOkData),String.valueOf(totalErrorData));
			}
			if(list != null && list.size() > 0){
				setReadStatus(TOO_MANY);
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
		logger.exiting("AE0160010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0160");
		logger.entering("AE0160010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("AE0160010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * CSV�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCsvOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0160");
		logger.entering("AE0160010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");
			//{{user_implement_dev:<controlCsvOut>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {		
			struct.setDOWNLOAD_FILE("");	
			csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));

			List csvList = new ArrayList();
			// CSV���̍쐬
			// �^�C�g�����ݒ�
			String csvTitle[] = { 
					"Expj.Cmt3094", // �G���[�ӏ�
					"Expj.Cmt3098" // �G���[���e
			};
			// CSV���X�g�ɓ����
			csvList.add(csvTitle);

			AE0160010Struct workStruct;
			// ���ד��e�ݒ�
			for (int i = 0; i < getListsize(); i++) {
				workStruct = getListvalue(i);
				String csvStr[] = new String[csvTitle.length];
				csvStr[0] = workStruct.getl_ERRLINE_NO();// �G���[�ӏ�
				csvStr[1] = workStruct.getl_ERR_MSG();// �G���[���e
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
			ExpjMessage emsg = new ExpjMessage( "ZZ01107" );
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			throw ee;
		} 
                //}}user_implement_dev:<controlCsvOut>
		logger.exiting("AE0160010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");

		return;
	}

	/**
	 * �S�폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlDeleteAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0160");
		logger.entering("AE0160010Control"+":USER="+struct.getsUser_ID(),"controlDeleteAll");
			//{{user_implement_dev:<controlDeleteAll>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			
			struct.setUSER_CD(getsysUSER_CD());
			entity.mdeleteT_ACPT_RSLT_TEMP.delete(conn, struct);
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
		logger.exiting("AE0160010Control"+":USER="+struct.getsUser_ID(),"controlDeleteAll");

		return;
	}

	/**
	 * ���s�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlExecute() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0160");
		logger.entering("AE0160010Control"+":USER="+struct.getsUser_ID(),"controlExecute");
			//{{user_implement_dev:<controlExecute>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try{
	    	setReadStatus(INITIAL); 
	        // �o�b�`�����N���X��main����
	        String strBatchClassName = null;		// �Ăяo����N���X��
	        String strBatchProcessingTyp = null;	// �o�b�`�����敪
	        String strProgramId = null;			    // �Ɩ����iAE0160B002�j
	        String strUserId = null;				// ���[�UID
	        String strPlantCd = null;				// �H��R�[�h
	        String strCsvTakeTyp =null;             // CSV�捞����
	        // �����Z�b�g
	        strBatchClassName = "com.nec.jp.orteus.metamorBase.AE0160.AE0160B002.mainAE0160B002";
	        strBatchProcessingTyp = "2";					  // 2: �����^�]���Ȃ��i��ԃo�b�`�Ȃ��j
	        strProgramId = "AE0160B002";					  // �Ɩ����iAE0180B001�j
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
		logger.exiting("AE0160010Control"+":USER="+struct.getsUser_ID(),"controlExecute");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0160");
		logger.entering("AE0160010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AE0160010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0160");
		logger.entering("AE0160010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			// �f�[�^�x�[�X�ւ̃A�N�Z�X���s���ꍇ�́A����try catch���̃R�����g���O���Ă��������B
		try{
			BusinessOprDate = DateCtrl.getBusinessOprDate(conn,this.getsysPLANT_CD());
			if(BusinessOprDate == null ){
				setErrorMessage("KR00017");
				setReadStatus(ERROR);
			}
		} catch(SQLException e) {
			e.printStackTrace();
			// ������Ԃ��u�Ǎ����s�v�ɐݒ�
			setReadStatus(ERROR);
			// �G���[���b�Z�[�W�쐬
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AE0160010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0160");
		logger.entering("AE0160010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
		logger.exiting("AE0160010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("CsvOut") ) {
				controlCsvOut();
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
//			throw new FoundationException("AE0160010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0160010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AE0160010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0160010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AE0160010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0160010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AE0160010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AE0160010Entity entity;
	protected AE0160010Struct struct;
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

		entity = new AE0160010Entity();
		struct = new AE0160010Struct();

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
	 * AE0160010�N���X�̕W���R���X�g���N�^
	 */
	public AE0160010Control() throws BusinessProcessException, FoundationException
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
				AE0160010Struct key = (AE0160010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("FileName") && key.getFileName() != null) {
					msgKey.setKeyValue("FileName", key.getFileName());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("l_ERRLINE_NO") && key.getl_ERRLINE_NO() != null) {
					msgKey.setKeyValue("l_ERRLINE_NO", key.getl_ERRLINE_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_MSG") && key.getl_ERR_MSG() != null) {
					msgKey.setKeyValue("l_ERR_MSG", key.getl_ERR_MSG());
				}
				if(msgKeyType.containsKeyColumn("ACPT_RSLT_TEMP_CTL_NO") && key.getACPT_RSLT_TEMP_CTL_NO() != null) {
					msgKey.setKeyValue("ACPT_RSLT_TEMP_CTL_NO", key.getACPT_RSLT_TEMP_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("ACPT_DATE") && key.getACPT_DATE() != null) {
					msgKey.setKeyValue("ACPT_DATE", key.getACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("ACPT_QTY") && key.getACPT_QTY() != null) {
					msgKey.setKeyValue("ACPT_QTY", key.getACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP") && key.getUNIT_COST_TYP() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP", key.getUNIT_COST_TYP());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST") && key.getUNIT_COST() != null) {
					msgKey.setKeyValue("UNIT_COST", key.getUNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("PROCESSING_COST") && key.getPROCESSING_COST() != null) {
					msgKey.setKeyValue("PROCESSING_COST", key.getPROCESSING_COST());
				}
				if(msgKeyType.containsKeyColumn("MATERIAL_COST") && key.getMATERIAL_COST() != null) {
					msgKey.setKeyValue("MATERIAL_COST", key.getMATERIAL_COST());
				}
				if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS") && key.getOTHER_OVERHEADS() != null) {
					msgKey.setKeyValue("OTHER_OVERHEADS", key.getOTHER_OVERHEADS());
				}
				if(msgKeyType.containsKeyColumn("DISC_AMOUNT") && key.getDISC_AMOUNT() != null) {
					msgKey.setKeyValue("DISC_AMOUNT", key.getDISC_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("EXCH_RATE") && key.getEXCH_RATE() != null) {
					msgKey.setKeyValue("EXCH_RATE", key.getEXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO") && key.getLOT_NO() != null) {
					msgKey.setKeyValue("LOT_NO", key.getLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("VEND_LOT_NO") && key.getVEND_LOT_NO() != null) {
					msgKey.setKeyValue("VEND_LOT_NO", key.getVEND_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("DLV_CD") && key.getDLV_CD() != null) {
					msgKey.setKeyValue("DLV_CD", key.getDLV_CD());
				}
				if(msgKeyType.containsKeyColumn("ACPT_RSLT_COMMENT") && key.getACPT_RSLT_COMMENT() != null) {
					msgKey.setKeyValue("ACPT_RSLT_COMMENT", key.getACPT_RSLT_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("ACPT_RSLT_COMP") && key.getACPT_RSLT_COMP() != null) {
					msgKey.setKeyValue("ACPT_RSLT_COMP", key.getACPT_RSLT_COMP());
				}
				if(msgKeyType.containsKeyColumn("TAKE_DATE") && key.getTAKE_DATE() != null) {
					msgKey.setKeyValue("TAKE_DATE", key.getTAKE_DATE());
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
					AE0160010Struct key = new AE0160010Struct();
					if(msgKeyType.containsKeyColumn("FileName")) {
						key.setFileName(msgKey.getKeyValue("FileName"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("l_ERRLINE_NO")) {
						key.setl_ERRLINE_NO(msgKey.getKeyValue("l_ERRLINE_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_MSG")) {
						key.setl_ERR_MSG(msgKey.getKeyValue("l_ERR_MSG"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_RSLT_TEMP_CTL_NO")) {
						key.setACPT_RSLT_TEMP_CTL_NO(msgKey.getKeyValue("ACPT_RSLT_TEMP_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_DATE")) {
						key.setACPT_DATE(msgKey.getKeyValue("ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_QTY")) {
						key.setACPT_QTY(msgKey.getKeyValue("ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP")) {
						key.setUNIT_COST_TYP(msgKey.getKeyValue("UNIT_COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST")) {
						key.setUNIT_COST(msgKey.getKeyValue("UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("PROCESSING_COST")) {
						key.setPROCESSING_COST(msgKey.getKeyValue("PROCESSING_COST"));
					}
					if(msgKeyType.containsKeyColumn("MATERIAL_COST")) {
						key.setMATERIAL_COST(msgKey.getKeyValue("MATERIAL_COST"));
					}
					if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS")) {
						key.setOTHER_OVERHEADS(msgKey.getKeyValue("OTHER_OVERHEADS"));
					}
					if(msgKeyType.containsKeyColumn("DISC_AMOUNT")) {
						key.setDISC_AMOUNT(msgKey.getKeyValue("DISC_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_RATE")) {
						key.setEXCH_RATE(msgKey.getKeyValue("EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO")) {
						key.setLOT_NO(msgKey.getKeyValue("LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("VEND_LOT_NO")) {
						key.setVEND_LOT_NO(msgKey.getKeyValue("VEND_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("DLV_CD")) {
						key.setDLV_CD(msgKey.getKeyValue("DLV_CD"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_RSLT_COMMENT")) {
						key.setACPT_RSLT_COMMENT(msgKey.getKeyValue("ACPT_RSLT_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_RSLT_COMP")) {
						key.setACPT_RSLT_COMP(msgKey.getKeyValue("ACPT_RSLT_COMP"));
					}
					if(msgKeyType.containsKeyColumn("TAKE_DATE")) {
						key.setTAKE_DATE(msgKey.getKeyValue("TAKE_DATE"));
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
