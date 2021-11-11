/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KR0060/src/com/nec/jp/orteus/metamorBase/KR0060/KR0060010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KR0060;

import com.nec.jp.orteus.metamorBase.KR0060.*;
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
	// TODO: ������import�p�b�P�[�W���L�q���Ă�������
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : KR0060010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: zhou-kehong $
 * @version $Revision: 1.9 $ $Date: 2014/12/22 06:47:20 $
 *
 */
//}}user_implement_code_header

public class KR0060010Control
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
	public KR0060010Struct getListvalue(int x) { return (KR0060010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public KR0060010Struct getStruct() { return this.struct; }	// Struct�̒l��Ԃ��܂��B
	public KR0060010Struct createStruct() { return new KR0060010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((KR0060010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

    
    // ----- �V�X�^���ݒ�l�擾 ---------------	
	private PrivateConfig privateConfig;
    // ----- �V�X�^���ݒ�l�擾 ---------------		
	
	/** ������я��F */
	String aprSales = "";	
	/** ���[�U�̏��F���� */
	String hApprPowerTyp = "";	
	boolean airFlg = false;
	/** �^�p���敪�FExplanner/J */
	private final static int EXPLANNER_J = 1;
	
	/** �^�p���敪�FExplanner/Jf */
	private final static int EXPLANNER_JF = 2;
	
	/** �R���{�{�b�N�X�f�[�^�擾�p�萔�@�����敪 */
	private final static String INSPC_ACPT_TYP_NAME = "INSPC_ACPT_TYP";
	/** �R���{�{�b�N�X�f�[�^�擾�p�萔�@�@����敪 */
	private final static String SALES_TYP_NAME = "SALES_TYP";
	/** �R���{�{�b�N�X�f�[�^�擾�p�萔�@�@���l�敪 */
	private final static String SPCL_PRICE_TYP_NAME = "SPCL_PRICE_TYP";
	/** �R���{�{�b�N�X�f�[�^�擾�p�萔�@�@����敪 */
	private final static String TRANS_TYPE = "TRANS_TYP";
	
	/** �R���{�{�b�N�X�f�[�^�擾�p�@�����敪 */
	private ComboStruct COM_INSPC_ACPT_TYP = null;
	/** �R���{�{�b�N�X�f�[�^�擾�p�@�@����敪 */
	private ComboStruct COM_SALES_TYP= null;
	/** �R���{�{�b�N�X�f�[�^�擾�p�@�@���l�敪 */
	private ComboStruct COM_SPCL_PRICE_TYP= null;
	/** �R���{�{�b�N�X�f�[�^�擾�p�@�@����敪 */
	private ComboStruct COM_TRANS_TYP= null;
	
	// �^�s��
	private int Environment = 0;
	
	private int getEnvironment() {
		return Environment;
	}
	private void setEnvironment(int environment) {
		Environment = environment;
		
	}
	  
    /**
     * ���X�g�\�[�g 
     * @param ���X�g
     */
    public void listSort(List tempList){
    	//���X�g�\�[�g
    	for(int i = 0 ; i< tempList.size(); i++){
    		int intNoi;
    		int intNoj;
    		KR0060010Struct tempStructz = new KR0060010Struct();
    		for(int j = i+1; j<tempList.size(); j++){
        		KR0060010Struct tempStructi = new KR0060010Struct();
        		tempStructi = (KR0060010Struct)tempList.get(i);
    			KR0060010Struct tempStructj = new KR0060010Struct();
    			tempStructj = (KR0060010Struct)tempList.get(j);
    			intNoi = Integer.parseInt(tempStructi.getl_ROWNO());
    			intNoj = Integer.parseInt(tempStructj.getl_ROWNO());
    			if(intNoi - intNoj > 0){
    				tempList.set(i,tempStructj);
    				tempList.set(j,tempStructi);
    			}					
    		}
    	}
    }
    
    /**
     * �R���{�{�b�N�X�f�[�^����\���������擾����
     *�@@param combo �R���{�{�b�N�X�f�[�^
     * @param�@value �R���{�{�b�N�X�f�[�^�̒l
     * @return �R���{�{�b�N�X�f�[�^�̕\������
     */
    private String getDisplayName (ComboStruct combo, String value) {
    	for (int j = 0; j < combo.size(); j++){
    		if ((combo.getData(j)[0].equals(value))){
    			return combo.getData(j)[1];
    		}
    	}
    	return null ;
    }

    
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
     * Exception�G���[���b�Z�[�W�ݒ�
     * @param SQLException
     */
    private void setExceptionMsg(Exception e) throws ExpjException
    {
     ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
     sysLog.severe(emsg, getsysUSER_CD());
     ExpjException ee = new ExpjException(e, emsg);
     throw ee;
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
     * ��񃁃b�Z�[�W�ݒ�
     * @param ���b�Z�[�W�ԍ�
     * @param �u��������P
     */
    private void setErrorMessage(String messageno, String value1)
    {
     ExpjMessage emsg = new ExpjMessage( messageno , value1 );
     msgStruct.addError( emsg );
     sysLog.warning(emsg, getsysUSER_CD());
    }


    /**
     * ��񃁃b�Z�[�W�ݒ�
     * @param ���b�Z�[�W�ԍ�
     * @param �u��������P
     * @param �u��������2
     * @param �u��������3
     */
    private void setErrorMessage(String messageno, String value1, String value2, String value3)
    {
     ExpjMessage emsg = new ExpjMessage( messageno , value1, value2, value3 );
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
    private void setWarnMessage(String messageno, List message)
    {
     ExpjMessage emsg = new ExpjMessage( messageno );
     msgStruct.addWarn( emsg );
     sysLog.info(emsg, getsysUSER_CD());
     
     for(int i=0; i<message.size(); i++)
     {
      emsg = new ExpjMessage( "ZZ01006", (String)message.get(i) );
      msgStruct.addWarn( emsg );
      sysLog.info(emsg, getsysUSER_CD());
     }
    }
     
    /**
     * �x�����b�Z�[�W�ݒ�
     * @param ���b�Z�[�W�ԍ�
     * @param �u��������P
     * @param �u��������2
     * @param �u��������3
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
	private void setWarningMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
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
//  ------------------------------------------------------------------------

	/** ���[�U��`�̏������σt���O */
	private boolean _usersIntialized = false;

	/**
	 * ���[�U��` ����������
	 */
	private void usersInitialize() throws ExpjException
	{
		if(_usersIntialized) return;

		_usersIntialized = true;
		return ;
	}

//------------------------------------------------------------------------
    //------------------------------------------------------------------
	// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0060");
		logger.entering("KR0060010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			// ������Ԃ�������
			setReadStatus(INITIAL);
			//LIST��NULL�ɐݒ�
			setList(null);
			//���Ӑ於��null�ɐݒ�
			struct.setCUST_NAME("");
			//���Ӑ摶�݃`�F�b�N
			if(struct.getCUST_CD() != null && !"".equals(struct.getCUST_CD())){
				List custList = entity.mselectM_CUST.read(conn,struct);
				if(custList == null || custList.size() == 0){
					setErrorMessage("KA10050");
					return;
				}	
				//���Ӑ於��ݒ�
				struct.setCUST_NAME(((KR0060010Struct)custList.get(0)).getCUST_NAME());
			}
			//�@�����҂����F�t���O
			if("true".equals(struct.getr_APPR_1())){
				struct.setRAPPR("1");
			}else if("true".equals(struct.getr_APPR_2())){
				struct.setRAPPR("1");
			}else if("true".equals(struct.getr_APPR_3())){
				struct.setRAPPR("3");
			}else{
				struct.setRAPPR("2");
			}
			
			//���[�U�̏��F����
			if("0".equals(struct.geth_APPR_POWER_TYP())){
				setWarningMessage("AZ00037");
			}
			//�\���s�������l�𒴂����ꍇ
			ScreenParam sp = new ScreenParam(this.getClass());
			int maxLine = sp.getMaxLine(conn,10);
			if(maxLine != 0) {
				struct.setROW_COUNT(String.valueOf(maxLine));
			} else {
				struct.setROW_COUNT(null);
			}
			long rowCount =0;
			if(this.getEnvironment() == EXPLANNER_J){
				list = entity.mselectT_SALESCnt.read(conn,struct);
			} else {
				list = entity.mselectT_SALES_JfCnt.read(conn, struct);
			}
			rowCount = Long.parseLong(((KR0060010Struct)list.get(0)).getl_COUNT());
			//�Ώی���=0���̏ꍇ�G��-
			if (rowCount==0) {
				setErrorMessage("ZZ06001");
				readStatus = NOT_FOUND;
			   //�ꗗ�\���N���A����
				if(list != null && list.size() > 0){
					list.clear();
				}
				return;
			}
			if(maxLine != 0 && rowCount ==maxLine+1){
				setErrorMessage("ZZ01115",""+maxLine );
				// �������
				setReadStatus(TOO_MANY);
				if(list != null && list.size() > 0){
					setList(null);
				}
				return;
			}
			//������т�����
			//�@�ۗ��Ə��F����̂Ƃ�
			if(this.getEnvironment() == EXPLANNER_J){
				list = entity.mselectT_SALES.read(conn,struct);
			} else {
				list = entity.mselectT_SALES_Jf.read(conn, struct);
			}	
			// �R���{�{�b�N�X�f�[�^�̐ݒ�
			KR0060010Struct tempStruct = null;
			for(int i=0; i<list.size(); i++) {
				tempStruct = (KR0060010Struct)list.get(i);
				// ����敪
				tempStruct.setl_SALES_TYP(getDisplayName(COM_SALES_TYP,tempStruct.getl_SALES_TYP_CD()));
				// ���l�敪
				tempStruct.setl_PCL_PRICE_CO(getDisplayName(COM_SPCL_PRICE_TYP,tempStruct.getl_PCL_PRICE_CO_CD()));
				// �����敪
				tempStruct.setl_INSPC_ACPT_TYP(getDisplayName(COM_INSPC_ACPT_TYP,tempStruct.getl_INSPC_ACPT_TYP_CD()));
				// ����敪
				tempStruct.setl_TRANS_TYP(getDisplayName(COM_TRANS_TYP, tempStruct.getl_TRANS_TYP()));
				// ���F����
				if("0".equals(tempStruct.getl_APPR_HISTORY_FLG())) {
					tempStruct.setl_APPR_HISTORY("����");
				} else {
					tempStruct.setl_APPR_HISTORY("�L��");
				}
			}
			// �������
			setReadStatus(NORMAL);
		} catch(SQLException e) {			
			setExceptionMsg(e);
			e.printStackTrace();
		} catch(Exception e) {
			setExceptionMsg(e);
			e.printStackTrace();
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("KR0060010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �I���X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlUpdateAssort() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0060");
		logger.entering("KR0060010Control"+":USER="+struct.getsUser_ID(),"controlUpdateAssort");
			//{{user_implement_dev:<controlUpdateAssort>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			//�G���[���b�Z�[�W���X�g
			List messList = new ArrayList(0);
			//�Ɩ��^�p���t
			String businessDate = DateCtrl.getBusinessOprDate(conn,this.getsysPLANT_CD());
			//�ꎞ���X�g
			List tempList = new ArrayList(0);
			//�I���s���ă\�[�g
			for(int i = 0;i < struct.getList_l_SALES_SEQ_NO().size(); i++){
				//�ꎞstruct
				KR0060010Struct tempStruct = new KR0060010Struct();				
				tempStruct.importData(struct, i);
				tempList.add(tempStruct);
				
			}
			//���X�g�\�[�g
			listSort(tempList);
			//�I�����ꂽ�s�ɑ΂��āA1�s���ȉ��̏������s��
			for(int i = 0;i < tempList.size(); i++){	
				KR0060010Struct tempStruct = new KR0060010Struct();
				tempStruct = (KR0060010Struct)tempList.get(i);
				
					// ���F�̂Ƃ�
					if ("true".equals(struct.getr_APPR_1())) {
						// �X�V�ϐ�
						tempStruct.setAPPR_FLG("3");
						tempStruct.setAPPR_ID(this.getsysUSER_CD());
						tempStruct.setAPPR_DATE(businessDate);
					}
					// �ۗ��̏ꍇ
					if ("true".equals(struct.getr_APPR_2())) {
						// �X�V�ϐ�
						tempStruct.setAPPR_FLG("2");
						tempStruct.setAPPR_ID(this.getsysUSER_CD());
						tempStruct.setAPPR_DATE(businessDate);
						tempStruct.setRESERVE_CAUSE(struct.getRESERVE_CAUSE());
					}
					// ���F����̏ꍇ
					if ("true".equals(struct.getr_APPR_3())) {
						if (airFlg && "1".equals(tempStruct.getl_AI_AR_IF_FLG())) {
							messList.clear();
							if(this.getEnvironment() == EXPLANNER_J){
								messList.add("SHIP_ODR_NO:" + tempStruct.getl_SHIP_ODR_NO());
								messList.add("SLIP_CD:" + tempStruct.getl_SLIP_CD());
							} else {
								messList.add("SHIP_DLV_H_NO:" + tempStruct.getl_SHIP_DLV_H_NO());
								messList.add("SHIP_DLV_D_NO:" + tempStruct.getl_SHIP_DLV_D_NO());
							}					
							setErrorMessage("KR00033", messList);
							conn.rollback();
							return;
						}

						//�X�V�ϐ�
						tempStruct.setAPPR_FLG("1");
						tempStruct.setAPPR_ID("");
						tempStruct.setAPPR_DATE("");
					}
			
				// �ۗ������̏ꍇ
				if("true".equals(struct.getr_APPR_4())){
					//�X�V�ϐ�
					tempStruct.setAPPR_FLG("1");
					tempStruct.setAPPR_ID("");
					tempStruct.setAPPR_DATE("");
					tempStruct.setRESERVE_CAUSE("");
				}
				// �f�[�^���݃`�F�b�N
				List modifyList = entity.mselectT_SALES_modify.read(conn,tempStruct);
				if(modifyList == null || modifyList.size() <= 0){
					setErrorMessage("ZZ01101");
					conn.rollback();
					return;
				}
				// �X�V�񐔃`�F�b�N
				String modify = ((KR0060010Struct)modifyList.get(0)).getMODIFY_COUNT();
				if(!modify.equals(tempStruct.getl_MODIFY_COUNT())){
					setErrorMessage("ZZ01105");
					conn.rollback();
					return;
				}
				conn.beginTransWeb();
				tempStruct.setsUser_ID(struct.getsUser_ID());
				if(this.getEnvironment() == EXPLANNER_J){			        
					entity.mupdateT_SALES.update(conn, tempStruct);
				} else {
					if("true".equals(struct.getr_APPR_1())) { // ���F�̏ꍇ
						// ����o�ה[�i�`�[�ԍ����\�����Ă���f�[�^�ȊO�X�V
						entity.mupdateAPPR_FLG.update(conn, tempStruct);
						// ����o�ה[�i�`�[�ԍ����\�����Ă���f�[�^�X�V
						entity.mupdateAPPR_MAX.update(conn, tempStruct);
					} else if("true".equals(struct.getr_APPR_2())){ // �ۗ��̏ꍇ
						// ����o�ה[�i�`�[�ԍ����\�����Ă���f�[�^�ȊO�X�V
						entity.mupdateAPPR_FLG.update(conn, tempStruct);
						// ����o�ה[�i�`�[�ԍ����\�����Ă���f�[�^�X�V
						entity.mupdateAPPR_SAVE.update(conn, tempStruct);
					} else if("true".equals(struct.getr_APPR_3()) || "true".equals(struct.getr_APPR_4())) { // ���F����̏ꍇ�܂��͕ۗ������̏ꍇ
						// ����o�ה[�i�`�[�ԍ����\�����Ă���f�[�^�X�V
						entity.mupdateAPPR_CANCEL.update(conn, tempStruct);
					}
				}
			}
			//�R�����g
			conn.commit();
			
			//�Č���
			controlSelect();
			
		}catch(SQLException e) {
			conn.rollback();
			setExceptionMsg(e);
			e.printStackTrace();
		}catch(Exception e) {
			conn.rollback();
			setExceptionMsg(e);
			e.printStackTrace();
		}
                //}}user_implement_dev:<controlUpdateAssort>
		logger.exiting("KR0060010Control"+":USER="+struct.getsUser_ID(),"controlUpdateAssort");

		return;
	}

	/**
	 * �S�I���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCheckAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0060");
		logger.entering("KR0060010Control"+":USER="+struct.getsUser_ID(),"controlCheckAll");
			//{{user_implement_dev:<controlCheckAll>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlCheckAll>
		logger.exiting("KR0060010Control"+":USER="+struct.getsUser_ID(),"controlCheckAll");

		return;
	}

	/**
	 * �S�����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCheckClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0060");
		logger.entering("KR0060010Control"+":USER="+struct.getsUser_ID(),"controlCheckClear");
			//{{user_implement_dev:<controlCheckClear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlCheckClear>
		logger.exiting("KR0060010Control"+":USER="+struct.getsUser_ID(),"controlCheckClear");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0060");
		logger.entering("KR0060010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
		setList(null);
		controlRELOAD();
			
                //}}user_implement_dev:<controlClear>
		logger.exiting("KR0060010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0060");
		logger.entering("KR0060010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("KR0060010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * ������юQ�ƃ{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlAppr_Hty_Rep() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0060");
		logger.entering("KR0060010Control"+":USER="+struct.getsUser_ID(),"controlAppr_Hty_Rep");
			//{{user_implement_dev:<controlAppr_Hty_Rep>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlAppr_Hty_Rep>
		logger.exiting("KR0060010Control"+":USER="+struct.getsUser_ID(),"controlAppr_Hty_Rep");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0060");
		logger.entering("KR0060010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
		// ���[�U��`������
		usersInitialize();
		try {
			struct.setu_OPTION_ID("JF*");
			List tempList = entity.mgetSYS_INSTALL_OPTIONS.read(conn, struct);
			KR0060010Struct tempStruct = new KR0060010Struct();
			if(tempList != null && tempList.size()>0){
				tempStruct = (KR0060010Struct)tempList.get(0);
				struct.seth_INSTALL_FLG(tempStruct.geth_INSTALL_FLG());
			}
			if("1".equals(struct.geth_INSTALL_FLG())){
				this.setEnvironment(EXPLANNER_JF);
			}else{
				this.setEnvironment(EXPLANNER_J);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e){
			e.printStackTrace();
		}
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KR0060010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0060");
		logger.entering("KR0060010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			// �f�[�^�x�[�X�ւ̃A�N�Z�X���s���ꍇ�́A����try catch���̃R�����g���O���Ă��������B
		// ���[�U��`������
		usersInitialize();
		try{			
			List tempList = entity.mgetSYS_INSTALL_OPTIONS.read(conn, struct);
			KR0060010Struct tempStruct = new KR0060010Struct();
			if(tempList != null && tempList.size()>0){
				tempStruct = (KR0060010Struct)tempList.get(0);
				struct.seth_INSTALL_FLG(tempStruct.geth_INSTALL_FLG());
			}
			if("1".equals(struct.geth_INSTALL_FLG())){
				this.setEnvironment(EXPLANNER_JF);
			}else{
				this.setEnvironment(EXPLANNER_J);
			}
			//[�C���X�g�[���I�v�V����]���uAi�A�g���v�I�v�V�����̎��ʎq���擾����
			airFlg = entity.mcheckAiR_INSTALL_FLG.check(conn, struct);
			
			//���|�����t���O
			String installFlg;
			//���|�����t���O���擾
			List optionList = entity.mSYS_INSTALL_OPTIONS.read(conn,struct);
			if(optionList != null && optionList.size() > 0){
				installFlg = ((KR0060010Struct)optionList.get(0)).getINSTALL_FLG();
				if("1".equals(installFlg)){
					setErrorMessage("KR00026");
	                // ������Ԃ��u���s�v�ɐݒ�
	                setReadStatus(ERROR);
					return;		
				}
			}else{
				installFlg = "0";
			}

 	        /** �p�����[�^�u������я��F�v���擾*/
 	        privateConfig = new PrivateConfig(conn); 	        
 	        aprSales = privateConfig.getString("APR_SALES"); 
 	        // �p�����[�^�u������я��F�v���擾�ł��Ȃ������ꍇ
 	        if(aprSales == null || "".equals(aprSales)){ 
  				String locale = CoreTools.getLocale(struct.getsUser_ID());
  				ResourceBundle messages = CoreTools.getResourceBundle("ExpjMessage", locale);
  				setErrorMessage("AZ00041", messages.getString("AZ00074"));
  				aprSales = "0";
                // ������Ԃ��u���s�v�ɐݒ�
                setReadStatus(ERROR);
 	        	return;
 	        }else if("1".equals(aprSales)){ 	        	
 				// �P�̏ꍇ
 	        	aprSales = "1";	
 	        }else{ 	        	
 				// �P�ȊO�̏ꍇ
 	        	aprSales = "0";
 	        	setErrorMessage("KR00027");
                // ������Ԃ��u���s�v�ɐݒ�
                setReadStatus(ERROR);
 	        	return; 	        	
 	        }
 	        
 	        //���O�C�����[�U�̏��F�����A����R�[�h���擾
 	        struct.setUSER_CD(this.getsysUSER_CD());
 	        List userList = entity.mselectUSER_MST.read(conn,struct);
 	        if(userList != null && userList.size() > 0){
 	        	String hPowerTyp = ((KR0060010Struct)userList.get(0)).getAPPR_POWER_TYP();
 	        	String sectionCd = ((KR0060010Struct)userList.get(0)).getSECTION_CD();
 	        	if(sectionCd == null || "".equals(sectionCd)){
 	        		setErrorMessage("KR00028");
 	                // ������Ԃ��u���s�v�ɐݒ�
 	                setReadStatus(ERROR);
 	 	        	return; 	        	
 	        	}
 	        	//���F�����A����R�[�h��ݒ�
 	        	struct.seth_APPR_POWER_TYP(hPowerTyp);
 	        	struct.setSECTION_CD(sectionCd);
 	        }
 	        
 	        //"���ЃR�[�h"�@���擾 	        
 	        String companyCd = null ;
 	        List companyList = entity.mselectSYS_MY_COMPANY.read(conn,struct);
 	        //"���ЃR�[�h"�@���擾 �ł��Ȃ��̏ꍇ
 	        if(companyList == null ||companyList.size() == 0){
 	        	setErrorMessage("KQ00039");
                // ������Ԃ��u���s�v�ɐݒ�
                setReadStatus(ERROR);
 	        	return; 	        	
 	        }
 	        if(companyList != null && companyList.size() > 0){
 	        	companyCd = ((KR0060010Struct)companyList.get(0)).getCOMPANY_CD(); 	        	
 	        }
 	        //��ЃR�[�h��ݒ�
 	        struct.setCOMPANY_CD(companyCd);
 	        
 	        
 	       if (this.getEnvironment() == EXPLANNER_J)
 	       {
 	    	   struct.setSYS_CLASS("SALES");
 	       } else {	    	   
 	    	  struct.setSYS_CLASS("FD_SALES");
 	       }
 	        //�敪�}�X�^�̃R�[�h���擾
 	        String classCode = null;
 	        List classList = entity.mselectSYS_CLASS_CODE.read(conn,struct);
 	        if(classList == null || classList.size() == 0){
 	        	setErrorMessage("KQ00026");
                // ������Ԃ��u���s�v�ɐݒ�
                setReadStatus(ERROR);
 	        	return; 	        	
 	        }
 	        if(classList != null && classList.size() > 0){
 	        	classCode = ((KR0060010Struct)classList.get(0)).getSYS_PLANT_CD();
 	        }
 	        struct.setSYS_PLANT_CD(classCode);
 	        //�Ɩ����t���擾
 	        String businessDate = DateCtrl.getBusinessOprDate(conn,classCode);
 	        if(businessDate == null || "".equals(businessDate)){
 	        	setErrorMessage("KQ00026");
                // ������Ԃ��u���s�v�ɐݒ�
                setReadStatus(ERROR);
 	        	return; 
 	        }

            // ������Ԃ��u�������v�ɐݒ�
            setReadStatus(INITIAL);

			// ��ʑJ�ڂ̌Ăяo����������AStruct�ɉ�ʑJ�ڃL�[��ݒ肵��controlSelect()���Ăяo��
			if ( isScreenMove() == true ) {
				// �����̃R���g���[�����\�b�h���Ăяo���܂��B
//				controlSelect();
			}

			// �f�[�^�x�[�X�ւ̃A�N�Z�X���s���ꍇ�́A����try catch���̃R�����g���O���Ă��������B
		}catch(SQLException e) {			
			setExceptionMsg(e);
			e.printStackTrace();
		}catch(Exception e) {
			setExceptionMsg(e);
			e.printStackTrace();
		}

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KR0060010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0060");
		logger.entering("KR0060010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			// �R���{�{�b�N�X�f�[�^�p��
			try{
				ComboBox comboController = new ComboBox(conn,sysUSER_CD);
				COM_INSPC_ACPT_TYP = comboController.getData(INSPC_ACPT_TYP_NAME);
				COM_SALES_TYP = comboController.getData(SALES_TYP_NAME);
				COM_SPCL_PRICE_TYP = comboController.getData(SPCL_PRICE_TYP_NAME);
				COM_TRANS_TYP = comboController.getData(TRANS_TYPE);
			} catch (SQLException e){
				e.printStackTrace();
				ExpjMessage emsg = new ExpjMessage ("ZZ01106");
				sysLog.severe(emsg,getsysUSER_CD());
			    ExpjException ee = new ExpjException(e,emsg);
			    throw ee;
			}
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("KR0060010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("UpdateAssort") ) {
				controlUpdateAssort();
			} else if( button.equals("CheckAll") ) {
				controlCheckAll();
			} else if( button.equals("CheckClear") ) {
				controlCheckClear();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("Appr_Hty_Rep") ) {
				controlAppr_Hty_Rep();
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
//			throw new FoundationException("KR0060010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KR0060010-E999","CSV�̏o�͏���"));
			throw new FoundationException("KR0060010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KR0060010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("KR0060010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KR0060010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("KR0060010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected KR0060010Entity entity;
	protected KR0060010Struct struct;
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

		entity = new KR0060010Entity();
		struct = new KR0060010Struct();

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
	 * KR0060010�N���X�̕W���R���X�g���N�^
	 */
	public KR0060010Control() throws BusinessProcessException, FoundationException
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
				KR0060010Struct key = (KR0060010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("r_APPR_1") && key.getr_APPR_1() != null) {
					msgKey.setKeyValue("r_APPR_1", key.getr_APPR_1());
				}
				if(msgKeyType.containsKeyColumn("r_APPR_2") && key.getr_APPR_2() != null) {
					msgKey.setKeyValue("r_APPR_2", key.getr_APPR_2());
				}
				if(msgKeyType.containsKeyColumn("r_APPR_3") && key.getr_APPR_3() != null) {
					msgKey.setKeyValue("r_APPR_3", key.getr_APPR_3());
				}
				if(msgKeyType.containsKeyColumn("r_APPR_4") && key.getr_APPR_4() != null) {
					msgKey.setKeyValue("r_APPR_4", key.getr_APPR_4());
				}
				if(msgKeyType.containsKeyColumn("h_APPR_POWER_TYP") && key.geth_APPR_POWER_TYP() != null) {
					msgKey.setKeyValue("h_APPR_POWER_TYP", key.geth_APPR_POWER_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_SALES_TYP") && key.getl_SALES_TYP() != null) {
					msgKey.setKeyValue("l_SALES_TYP", key.getl_SALES_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_PCL_PRICE_CO") && key.getl_PCL_PRICE_CO() != null) {
					msgKey.setKeyValue("l_PCL_PRICE_CO", key.getl_PCL_PRICE_CO());
				}
				if(msgKeyType.containsKeyColumn("l_INSPC_ACPT_TYP") && key.getl_INSPC_ACPT_TYP() != null) {
					msgKey.setKeyValue("l_INSPC_ACPT_TYP", key.getl_INSPC_ACPT_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_APPR_HISTORY") && key.getl_APPR_HISTORY() != null) {
					msgKey.setKeyValue("l_APPR_HISTORY", key.getl_APPR_HISTORY());
				}
				if(msgKeyType.containsKeyColumn("INSTALL_FLG") && key.getINSTALL_FLG() != null) {
					msgKey.setKeyValue("INSTALL_FLG", key.getINSTALL_FLG());
				}
				if(msgKeyType.containsKeyColumn("SECTION_CD") && key.getSECTION_CD() != null) {
					msgKey.setKeyValue("SECTION_CD", key.getSECTION_CD());
				}
				if(msgKeyType.containsKeyColumn("APPR_POWER_TYP") && key.getAPPR_POWER_TYP() != null) {
					msgKey.setKeyValue("APPR_POWER_TYP", key.getAPPR_POWER_TYP());
				}
				if(msgKeyType.containsKeyColumn("USER_CD") && key.getUSER_CD() != null) {
					msgKey.setKeyValue("USER_CD", key.getUSER_CD());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("SYS_PLANT_CD") && key.getSYS_PLANT_CD() != null) {
					msgKey.setKeyValue("SYS_PLANT_CD", key.getSYS_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("SYS_CLASS") && key.getSYS_CLASS() != null) {
					msgKey.setKeyValue("SYS_CLASS", key.getSYS_CLASS());
				}
				if(msgKeyType.containsKeyColumn("l_ROWNO") && key.getl_ROWNO() != null) {
					msgKey.setKeyValue("l_ROWNO", key.getl_ROWNO());
				}
				if(msgKeyType.containsKeyColumn("l_APPR_ID") && key.getl_APPR_ID() != null) {
					msgKey.setKeyValue("l_APPR_ID", key.getl_APPR_ID());
				}
				if(msgKeyType.containsKeyColumn("l_APPR_DATE") && key.getl_APPR_DATE() != null) {
					msgKey.setKeyValue("l_APPR_DATE", key.getl_APPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_RESERVE_CAUSE") && key.getl_RESERVE_CAUSE() != null) {
					msgKey.setKeyValue("l_RESERVE_CAUSE", key.getl_RESERVE_CAUSE());
				}
				if(msgKeyType.containsKeyColumn("l_SALES_SEQ_NO") && key.getl_SALES_SEQ_NO() != null) {
					msgKey.setKeyValue("l_SALES_SEQ_NO", key.getl_SALES_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("l_SHIP_ODR_NO") && key.getl_SHIP_ODR_NO() != null) {
					msgKey.setKeyValue("l_SHIP_ODR_NO", key.getl_SHIP_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("l_SLIP_CD") && key.getl_SLIP_CD() != null) {
					msgKey.setKeyValue("l_SLIP_CD", key.getl_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_SALES_TYP_CD") && key.getl_SALES_TYP_CD() != null) {
					msgKey.setKeyValue("l_SALES_TYP_CD", key.getl_SALES_TYP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_CD") && key.getl_CUST_CD() != null) {
					msgKey.setKeyValue("l_CUST_CD", key.getl_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_NAME") && key.getl_CUST_NAME() != null) {
					msgKey.setKeyValue("l_CUST_NAME", key.getl_CUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_SALES_DEPT_CD") && key.getl_SALES_DEPT_CD() != null) {
					msgKey.setKeyValue("l_SALES_DEPT_CD", key.getl_SALES_DEPT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ORG_NAME") && key.getl_ORG_NAME() != null) {
					msgKey.setKeyValue("l_ORG_NAME", key.getl_ORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_CD") && key.getl_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ITEM_CD", key.getl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_NAME") && key.getl_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ITEM_NAME", key.getl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_ODR_NO") && key.getl_CUST_ODR_NO() != null) {
					msgKey.setKeyValue("l_CUST_ODR_NO", key.getl_CUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("l_SALES_DATE") && key.getl_SALES_DATE() != null) {
					msgKey.setKeyValue("l_SALES_DATE", key.getl_SALES_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_CHRG_PSN_CD") && key.getl_CUST_CHRG_PSN_CD() != null) {
					msgKey.setKeyValue("l_CUST_CHRG_PSN_CD", key.getl_CUST_CHRG_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_CHRG_PSN_NAME") && key.getl_CUST_CHRG_PSN_NAME() != null) {
					msgKey.setKeyValue("l_CUST_CHRG_PSN_NAME", key.getl_CUST_CHRG_PSN_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_ACPT_PSN_CD") && key.getl_ODR_ACPT_PSN_CD() != null) {
					msgKey.setKeyValue("l_ODR_ACPT_PSN_CD", key.getl_ODR_ACPT_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_ACPT_PSN_NAME") && key.getl_ODR_ACPT_PSN_NAME() != null) {
					msgKey.setKeyValue("l_ODR_ACPT_PSN_NAME", key.getl_ODR_ACPT_PSN_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_SALES_QTY") && key.getl_SALES_QTY() != null) {
					msgKey.setKeyValue("l_SALES_QTY", key.getl_SALES_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_COST") && key.getl_UNIT_COST() != null) {
					msgKey.setKeyValue("l_UNIT_COST", key.getl_UNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_CD") && key.getl_UNIT_CD() != null) {
					msgKey.setKeyValue("l_UNIT_CD", key.getl_UNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_SALES_AMOUNT") && key.getl_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("l_SALES_AMOUNT", key.getl_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_SALES_AMOUNT_EXCH_RATES") && key.getl_SALES_AMOUNT_EXCH_RATES() != null) {
					msgKey.setKeyValue("l_SALES_AMOUNT_EXCH_RATES", key.getl_SALES_AMOUNT_EXCH_RATES());
				}
				if(msgKeyType.containsKeyColumn("l_INSPC_ACPT_DATE") && key.getl_INSPC_ACPT_DATE() != null) {
					msgKey.setKeyValue("l_INSPC_ACPT_DATE", key.getl_INSPC_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_INSPC_ACPT_QTY") && key.getl_INSPC_ACPT_QTY() != null) {
					msgKey.setKeyValue("l_INSPC_ACPT_QTY", key.getl_INSPC_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_EXTERNAL_TAX_SALES_AMOUNT") && key.getl_EXTERNAL_TAX_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("l_EXTERNAL_TAX_SALES_AMOUNT", key.getl_EXTERNAL_TAX_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_INTERNAL_TAX_SALES_AMOUNT") && key.getl_INTERNAL_TAX_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("l_INTERNAL_TAX_SALES_AMOUNT", key.getl_INTERNAL_TAX_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_TAXFREE_SALES_AMOUNT") && key.getl_TAXFREE_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("l_TAXFREE_SALES_AMOUNT", key.getl_TAXFREE_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_TAX_CREDIT_SALES_AMOUNT") && key.getl_TAX_CREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("l_TAX_CREDIT_SALES_AMOUNT", key.getl_TAX_CREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_EXTERNAL_TAX_AMOUNT") && key.getl_EXTERNAL_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("l_EXTERNAL_TAX_AMOUNT", key.getl_EXTERNAL_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_INTERNAL_TAX_AMOUNT") && key.getl_INTERNAL_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("l_INTERNAL_TAX_AMOUNT", key.getl_INTERNAL_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_TAX_AMOUNT_1") && key.getl_TAX_AMOUNT_1() != null) {
					msgKey.setKeyValue("l_TAX_AMOUNT_1", key.getl_TAX_AMOUNT_1());
				}
				if(msgKeyType.containsKeyColumn("l_TAX_AMOUNT_2") && key.getl_TAX_AMOUNT_2() != null) {
					msgKey.setKeyValue("l_TAX_AMOUNT_2", key.getl_TAX_AMOUNT_2());
				}
				if(msgKeyType.containsKeyColumn("l_TAX_AMOUNT_3") && key.getl_TAX_AMOUNT_3() != null) {
					msgKey.setKeyValue("l_TAX_AMOUNT_3", key.getl_TAX_AMOUNT_3());
				}
				if(msgKeyType.containsKeyColumn("l_OWN_CUR_TAXCREDIT_SALES_AMOUNT") && key.getl_OWN_CUR_TAXCREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("l_OWN_CUR_TAXCREDIT_SALES_AMOUNT", key.getl_OWN_CUR_TAXCREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_ORGN_SLIP_CD") && key.getl_ORGN_SLIP_CD() != null) {
					msgKey.setKeyValue("l_ORGN_SLIP_CD", key.getl_ORGN_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_CUR_CD") && key.getl_CUR_CD() != null) {
					msgKey.setKeyValue("l_CUR_CD", key.getl_CUR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_PCL_PRICE_CO_CD") && key.getl_PCL_PRICE_CO_CD() != null) {
					msgKey.setKeyValue("l_PCL_PRICE_CO_CD", key.getl_PCL_PRICE_CO_CD());
				}
				if(msgKeyType.containsKeyColumn("l_REMARKS") && key.getl_REMARKS() != null) {
					msgKey.setKeyValue("l_REMARKS", key.getl_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("l_INSPC_ACPT_TYP_CD") && key.getl_INSPC_ACPT_TYP_CD() != null) {
					msgKey.setKeyValue("l_INSPC_ACPT_TYP_CD", key.getl_INSPC_ACPT_TYP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT") && key.getl_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("l_MODIFY_COUNT", key.getl_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("l_AI_AR_IF_FLG") && key.getl_AI_AR_IF_FLG() != null) {
					msgKey.setKeyValue("l_AI_AR_IF_FLG", key.getl_AI_AR_IF_FLG());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("SALES_DATE_FROM") && key.getSALES_DATE_FROM() != null) {
					msgKey.setKeyValue("SALES_DATE_FROM", key.getSALES_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("SALES_DATE_TO") && key.getSALES_DATE_TO() != null) {
					msgKey.setKeyValue("SALES_DATE_TO", key.getSALES_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("RAPPR") && key.getRAPPR() != null) {
					msgKey.setKeyValue("RAPPR", key.getRAPPR());
				}
				if(msgKeyType.containsKeyColumn("CUST_NAME") && key.getCUST_NAME() != null) {
					msgKey.setKeyValue("CUST_NAME", key.getCUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("APPR_FLG") && key.getAPPR_FLG() != null) {
					msgKey.setKeyValue("APPR_FLG", key.getAPPR_FLG());
				}
				if(msgKeyType.containsKeyColumn("APPR_ID") && key.getAPPR_ID() != null) {
					msgKey.setKeyValue("APPR_ID", key.getAPPR_ID());
				}
				if(msgKeyType.containsKeyColumn("APPR_DATE") && key.getAPPR_DATE() != null) {
					msgKey.setKeyValue("APPR_DATE", key.getAPPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("RESERVE_CAUSE") && key.getRESERVE_CAUSE() != null) {
					msgKey.setKeyValue("RESERVE_CAUSE", key.getRESERVE_CAUSE());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("h_INSTALL_FLG") && key.geth_INSTALL_FLG() != null) {
					msgKey.setKeyValue("h_INSTALL_FLG", key.geth_INSTALL_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_ORGNAL_SHIP_DLV_H_NO") && key.getl_ORGNAL_SHIP_DLV_H_NO() != null) {
					msgKey.setKeyValue("l_ORGNAL_SHIP_DLV_H_NO", key.getl_ORGNAL_SHIP_DLV_H_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ORGNAL_SHIP_DLV_D_NO") && key.getl_ORGNAL_SHIP_DLV_D_NO() != null) {
					msgKey.setKeyValue("l_ORGNAL_SHIP_DLV_D_NO", key.getl_ORGNAL_SHIP_DLV_D_NO());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_SALES_QTY") && key.getl_CUST_SALES_QTY() != null) {
					msgKey.setKeyValue("l_CUST_SALES_QTY", key.getl_CUST_SALES_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_UNIT_CD") && key.getl_CUST_UNIT_CD() != null) {
					msgKey.setKeyValue("l_CUST_UNIT_CD", key.getl_CUST_UNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_INSPC_ACPT_QTY") && key.getl_CUST_INSPC_ACPT_QTY() != null) {
					msgKey.setKeyValue("l_CUST_INSPC_ACPT_QTY", key.getl_CUST_INSPC_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_SALES_H_NO") && key.getl_SALES_H_NO() != null) {
					msgKey.setKeyValue("l_SALES_H_NO", key.getl_SALES_H_NO());
				}
				if(msgKeyType.containsKeyColumn("l_SHIP_DLV_H_NO") && key.getl_SHIP_DLV_H_NO() != null) {
					msgKey.setKeyValue("l_SHIP_DLV_H_NO", key.getl_SHIP_DLV_H_NO());
				}
				if(msgKeyType.containsKeyColumn("l_SHIP_DLV_D_NO") && key.getl_SHIP_DLV_D_NO() != null) {
					msgKey.setKeyValue("l_SHIP_DLV_D_NO", key.getl_SHIP_DLV_D_NO());
				}
				if(msgKeyType.containsKeyColumn("l_TRANS_TYP") && key.getl_TRANS_TYP() != null) {
					msgKey.setKeyValue("l_TRANS_TYP", key.getl_TRANS_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_APPR_HISTORY_FLG") && key.getl_APPR_HISTORY_FLG() != null) {
					msgKey.setKeyValue("l_APPR_HISTORY_FLG", key.getl_APPR_HISTORY_FLG());
				}
				if(msgKeyType.containsKeyColumn("u_OPTION_ID") && key.getu_OPTION_ID() != null) {
					msgKey.setKeyValue("u_OPTION_ID", key.getu_OPTION_ID());
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
					KR0060010Struct key = new KR0060010Struct();
					if(msgKeyType.containsKeyColumn("r_APPR_1")) {
						key.setr_APPR_1(msgKey.getKeyValue("r_APPR_1"));
					}
					if(msgKeyType.containsKeyColumn("r_APPR_2")) {
						key.setr_APPR_2(msgKey.getKeyValue("r_APPR_2"));
					}
					if(msgKeyType.containsKeyColumn("r_APPR_3")) {
						key.setr_APPR_3(msgKey.getKeyValue("r_APPR_3"));
					}
					if(msgKeyType.containsKeyColumn("r_APPR_4")) {
						key.setr_APPR_4(msgKey.getKeyValue("r_APPR_4"));
					}
					if(msgKeyType.containsKeyColumn("h_APPR_POWER_TYP")) {
						key.seth_APPR_POWER_TYP(msgKey.getKeyValue("h_APPR_POWER_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_SALES_TYP")) {
						key.setl_SALES_TYP(msgKey.getKeyValue("l_SALES_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_PCL_PRICE_CO")) {
						key.setl_PCL_PRICE_CO(msgKey.getKeyValue("l_PCL_PRICE_CO"));
					}
					if(msgKeyType.containsKeyColumn("l_INSPC_ACPT_TYP")) {
						key.setl_INSPC_ACPT_TYP(msgKey.getKeyValue("l_INSPC_ACPT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_APPR_HISTORY")) {
						key.setl_APPR_HISTORY(msgKey.getKeyValue("l_APPR_HISTORY"));
					}
					if(msgKeyType.containsKeyColumn("INSTALL_FLG")) {
						key.setINSTALL_FLG(msgKey.getKeyValue("INSTALL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("SECTION_CD")) {
						key.setSECTION_CD(msgKey.getKeyValue("SECTION_CD"));
					}
					if(msgKeyType.containsKeyColumn("APPR_POWER_TYP")) {
						key.setAPPR_POWER_TYP(msgKey.getKeyValue("APPR_POWER_TYP"));
					}
					if(msgKeyType.containsKeyColumn("USER_CD")) {
						key.setUSER_CD(msgKey.getKeyValue("USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("SYS_PLANT_CD")) {
						key.setSYS_PLANT_CD(msgKey.getKeyValue("SYS_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("SYS_CLASS")) {
						key.setSYS_CLASS(msgKey.getKeyValue("SYS_CLASS"));
					}
					if(msgKeyType.containsKeyColumn("l_ROWNO")) {
						key.setl_ROWNO(msgKey.getKeyValue("l_ROWNO"));
					}
					if(msgKeyType.containsKeyColumn("l_APPR_ID")) {
						key.setl_APPR_ID(msgKey.getKeyValue("l_APPR_ID"));
					}
					if(msgKeyType.containsKeyColumn("l_APPR_DATE")) {
						key.setl_APPR_DATE(msgKey.getKeyValue("l_APPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_RESERVE_CAUSE")) {
						key.setl_RESERVE_CAUSE(msgKey.getKeyValue("l_RESERVE_CAUSE"));
					}
					if(msgKeyType.containsKeyColumn("l_SALES_SEQ_NO")) {
						key.setl_SALES_SEQ_NO(msgKey.getKeyValue("l_SALES_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_SHIP_ODR_NO")) {
						key.setl_SHIP_ODR_NO(msgKey.getKeyValue("l_SHIP_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_SLIP_CD")) {
						key.setl_SLIP_CD(msgKey.getKeyValue("l_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_SALES_TYP_CD")) {
						key.setl_SALES_TYP_CD(msgKey.getKeyValue("l_SALES_TYP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_CD")) {
						key.setl_CUST_CD(msgKey.getKeyValue("l_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_NAME")) {
						key.setl_CUST_NAME(msgKey.getKeyValue("l_CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_SALES_DEPT_CD")) {
						key.setl_SALES_DEPT_CD(msgKey.getKeyValue("l_SALES_DEPT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ORG_NAME")) {
						key.setl_ORG_NAME(msgKey.getKeyValue("l_ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_CD")) {
						key.setl_ITEM_CD(msgKey.getKeyValue("l_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_NAME")) {
						key.setl_ITEM_NAME(msgKey.getKeyValue("l_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_ODR_NO")) {
						key.setl_CUST_ODR_NO(msgKey.getKeyValue("l_CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_SALES_DATE")) {
						key.setl_SALES_DATE(msgKey.getKeyValue("l_SALES_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_CHRG_PSN_CD")) {
						key.setl_CUST_CHRG_PSN_CD(msgKey.getKeyValue("l_CUST_CHRG_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_CHRG_PSN_NAME")) {
						key.setl_CUST_CHRG_PSN_NAME(msgKey.getKeyValue("l_CUST_CHRG_PSN_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_ACPT_PSN_CD")) {
						key.setl_ODR_ACPT_PSN_CD(msgKey.getKeyValue("l_ODR_ACPT_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_ACPT_PSN_NAME")) {
						key.setl_ODR_ACPT_PSN_NAME(msgKey.getKeyValue("l_ODR_ACPT_PSN_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_SALES_QTY")) {
						key.setl_SALES_QTY(msgKey.getKeyValue("l_SALES_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_COST")) {
						key.setl_UNIT_COST(msgKey.getKeyValue("l_UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_CD")) {
						key.setl_UNIT_CD(msgKey.getKeyValue("l_UNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_SALES_AMOUNT")) {
						key.setl_SALES_AMOUNT(msgKey.getKeyValue("l_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_SALES_AMOUNT_EXCH_RATES")) {
						key.setl_SALES_AMOUNT_EXCH_RATES(msgKey.getKeyValue("l_SALES_AMOUNT_EXCH_RATES"));
					}
					if(msgKeyType.containsKeyColumn("l_INSPC_ACPT_DATE")) {
						key.setl_INSPC_ACPT_DATE(msgKey.getKeyValue("l_INSPC_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_INSPC_ACPT_QTY")) {
						key.setl_INSPC_ACPT_QTY(msgKey.getKeyValue("l_INSPC_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_EXTERNAL_TAX_SALES_AMOUNT")) {
						key.setl_EXTERNAL_TAX_SALES_AMOUNT(msgKey.getKeyValue("l_EXTERNAL_TAX_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_INTERNAL_TAX_SALES_AMOUNT")) {
						key.setl_INTERNAL_TAX_SALES_AMOUNT(msgKey.getKeyValue("l_INTERNAL_TAX_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_TAXFREE_SALES_AMOUNT")) {
						key.setl_TAXFREE_SALES_AMOUNT(msgKey.getKeyValue("l_TAXFREE_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_TAX_CREDIT_SALES_AMOUNT")) {
						key.setl_TAX_CREDIT_SALES_AMOUNT(msgKey.getKeyValue("l_TAX_CREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_EXTERNAL_TAX_AMOUNT")) {
						key.setl_EXTERNAL_TAX_AMOUNT(msgKey.getKeyValue("l_EXTERNAL_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_INTERNAL_TAX_AMOUNT")) {
						key.setl_INTERNAL_TAX_AMOUNT(msgKey.getKeyValue("l_INTERNAL_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_TAX_AMOUNT_1")) {
						key.setl_TAX_AMOUNT_1(msgKey.getKeyValue("l_TAX_AMOUNT_1"));
					}
					if(msgKeyType.containsKeyColumn("l_TAX_AMOUNT_2")) {
						key.setl_TAX_AMOUNT_2(msgKey.getKeyValue("l_TAX_AMOUNT_2"));
					}
					if(msgKeyType.containsKeyColumn("l_TAX_AMOUNT_3")) {
						key.setl_TAX_AMOUNT_3(msgKey.getKeyValue("l_TAX_AMOUNT_3"));
					}
					if(msgKeyType.containsKeyColumn("l_OWN_CUR_TAXCREDIT_SALES_AMOUNT")) {
						key.setl_OWN_CUR_TAXCREDIT_SALES_AMOUNT(msgKey.getKeyValue("l_OWN_CUR_TAXCREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_ORGN_SLIP_CD")) {
						key.setl_ORGN_SLIP_CD(msgKey.getKeyValue("l_ORGN_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_CUR_CD")) {
						key.setl_CUR_CD(msgKey.getKeyValue("l_CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_PCL_PRICE_CO_CD")) {
						key.setl_PCL_PRICE_CO_CD(msgKey.getKeyValue("l_PCL_PRICE_CO_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_REMARKS")) {
						key.setl_REMARKS(msgKey.getKeyValue("l_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("l_INSPC_ACPT_TYP_CD")) {
						key.setl_INSPC_ACPT_TYP_CD(msgKey.getKeyValue("l_INSPC_ACPT_TYP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT")) {
						key.setl_MODIFY_COUNT(msgKey.getKeyValue("l_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_AI_AR_IF_FLG")) {
						key.setl_AI_AR_IF_FLG(msgKey.getKeyValue("l_AI_AR_IF_FLG"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("SALES_DATE_FROM")) {
						key.setSALES_DATE_FROM(msgKey.getKeyValue("SALES_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("SALES_DATE_TO")) {
						key.setSALES_DATE_TO(msgKey.getKeyValue("SALES_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("RAPPR")) {
						key.setRAPPR(msgKey.getKeyValue("RAPPR"));
					}
					if(msgKeyType.containsKeyColumn("CUST_NAME")) {
						key.setCUST_NAME(msgKey.getKeyValue("CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("APPR_FLG")) {
						key.setAPPR_FLG(msgKey.getKeyValue("APPR_FLG"));
					}
					if(msgKeyType.containsKeyColumn("APPR_ID")) {
						key.setAPPR_ID(msgKey.getKeyValue("APPR_ID"));
					}
					if(msgKeyType.containsKeyColumn("APPR_DATE")) {
						key.setAPPR_DATE(msgKey.getKeyValue("APPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("RESERVE_CAUSE")) {
						key.setRESERVE_CAUSE(msgKey.getKeyValue("RESERVE_CAUSE"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("h_INSTALL_FLG")) {
						key.seth_INSTALL_FLG(msgKey.getKeyValue("h_INSTALL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_ORGNAL_SHIP_DLV_H_NO")) {
						key.setl_ORGNAL_SHIP_DLV_H_NO(msgKey.getKeyValue("l_ORGNAL_SHIP_DLV_H_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ORGNAL_SHIP_DLV_D_NO")) {
						key.setl_ORGNAL_SHIP_DLV_D_NO(msgKey.getKeyValue("l_ORGNAL_SHIP_DLV_D_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_SALES_QTY")) {
						key.setl_CUST_SALES_QTY(msgKey.getKeyValue("l_CUST_SALES_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_UNIT_CD")) {
						key.setl_CUST_UNIT_CD(msgKey.getKeyValue("l_CUST_UNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_INSPC_ACPT_QTY")) {
						key.setl_CUST_INSPC_ACPT_QTY(msgKey.getKeyValue("l_CUST_INSPC_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_SALES_H_NO")) {
						key.setl_SALES_H_NO(msgKey.getKeyValue("l_SALES_H_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_SHIP_DLV_H_NO")) {
						key.setl_SHIP_DLV_H_NO(msgKey.getKeyValue("l_SHIP_DLV_H_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_SHIP_DLV_D_NO")) {
						key.setl_SHIP_DLV_D_NO(msgKey.getKeyValue("l_SHIP_DLV_D_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_TRANS_TYP")) {
						key.setl_TRANS_TYP(msgKey.getKeyValue("l_TRANS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_APPR_HISTORY_FLG")) {
						key.setl_APPR_HISTORY_FLG(msgKey.getKeyValue("l_APPR_HISTORY_FLG"));
					}
					if(msgKeyType.containsKeyColumn("u_OPTION_ID")) {
						key.setu_OPTION_ID(msgKey.getKeyValue("u_OPTION_ID"));
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
