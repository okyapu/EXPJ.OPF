/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0150/src/com/nec/jp/orteus/metamorBase/AE0150/AE0150010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0150;

import com.nec.jp.orteus.metamorBase.AE0150.*;
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
 * CLASS     : AE0150010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: tai-yanhong $
 * @version $Revision: 1.6 $ $Date: 2012/11/29 06:18:11 $
 *
 */
//}}user_implement_code_header

public class AE0150010Control
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
	public AE0150010Struct getListvalue(int x) { return (AE0150010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AE0150010Struct getStruct() { return this.struct; }	// Struct�̒l��Ԃ��܂��B
	public AE0150010Struct createStruct() { return new AE0150010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AE0150010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

	/** �R���{�{�b�N�X�f�[�^�擾�p�萔�@�����敪 */
	private final static String INSPC_ACPT_CRCT_TYP_NAME = "INSPC_ACPT_CRCT_TYP";
	/** �R���{�{�b�N�X�f�[�^�擾�p�萔�@�@���i�敪 */
	private final static String PRODUCT_TYP_NAME = "PRODUCT_TYP";
	/** �R���{�{�b�N�X�f�[�^�擾�p�萔�@�@�P���敪 */
	private final static String UNIT_COST_TYP_NAME = "UNIT_COST_TYP";
	/** �R���{�{�b�N�X�f�[�^�擾�p�萔�@�O���w���i�敪 */
	private final static String SBCNT_PUCH_TYP_NAME = "SBCNT_PUCH_TYP";
	/** �R���{�{�b�N�X�f�[�^�擾�p�萔�@�@�݌ɊǗ��t���O */
	private final static String INV_CTRL_FLG_NAME = "INV_CTRL_FLG";
	/** �R���{�{�b�N�X�f�[�^�擾�p�萔�@�@�`�[��� */
	private final static String SLIP_TYP_AP_NAME = "SLIP_TYP_AP";
	/** �R���{�{�b�N�X�f�[�^�擾�p�萔�@�@�w���ԕi�t���O */
	private final static String PUCH_RTN_FLG_NAME = "PUCH_RTN_FLG";
	
	
	
	/** �R���{�{�b�N�X�f�[�^�擾�p�@�����敪 */
	private ComboStruct COM_INSPC_ACPT_CRCT_TYP = null;
	/** �R���{�{�b�N�X�f�[�^�擾�p�@�@���i�敪 */
	private ComboStruct COM_PRODUCT_TYP = null;
	/** �R���{�{�b�N�X�f�[�^�擾�p�@�@�P���敪 */
	private ComboStruct COM_UNIT_COST_TYP = null;
	/** �R���{�{�b�N�X�f�[�^�擾�p�@�O���w���i�敪 */
	private ComboStruct COM_SBCNT_PUCH_TYP = null;
	/** �R���{�{�b�N�X�f�[�^�擾�p�@�@�݌ɊǗ��t���O */
	private ComboStruct COM_INV_CTRL_FLG = null;
	/** �R���{�{�b�N�X�f�[�^�擾�p�@�@�`�[��� */
	private ComboStruct COM_SLIP_TYP_AP= null;
	/** �R���{�{�b�N�X�f�[�^�擾�p�@�@�w���ԕi�t���O */
	private ComboStruct COM_PUCH_RTN_FLG = null;
	
    // ----- �V�X�^���ݒ�l�擾 ---------------	
	private PrivateConfig privateConfig;
    // ----- �V�X�^���ݒ�l�擾 ---------------		
	
	/** �I�����F */
	String aprInspcIf = "";	
	/** ���[�U�̏��F���� */
	String hApprPowerTyp = "";	
	boolean checkFlg = false;
	  
    /**
     * ���X�g�\�[�g 
     * @param ���X�g
     */
    public void listSort(List tempList){
    	//���X�g�\�[�g
    	for(int i = 0 ; i< tempList.size(); i++){
    		int intNoi;
    		int intNoj;
    		AE0150010Struct tempStructz = new AE0150010Struct();
    		for(int j = i+1; j<tempList.size(); j++){
        		AE0150010Struct tempStructi = new AE0150010Struct();
        		tempStructi = (AE0150010Struct)tempList.get(i);
    			AE0150010Struct tempStructj = new AE0150010Struct();
    			tempStructj = (AE0150010Struct)tempList.get(j);
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0150");
		logger.entering("AE0150010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			// ������Ԃ�������
			setReadStatus(INITIAL);
			//LIST��NULL�ɐݒ�
			setList(null);
			//�������null�ɐݒ�
			struct.setVEND_NAME("");
			//���[�U�����擾
			struct.setUSER_CD(this.getsysUSER_CD());
			List userList = entity.mselectUSER_MST.read(conn,struct);
			if(userList.size() > 0){
				struct.setAPPR_POWER_TYP(((AE0150010Struct)userList.get(0)).getAPPR_POWER_TYP());
				struct.setCOMPANY_CD(((AE0150010Struct)userList.get(0)).getCOMPANY_CD());
				struct.setPLANT_CD(((AE0150010Struct)userList.get(0)).getPLANT_CD());
			}
			//���[�U�̏��F����
			if(!"1".equals(struct.getAPPR_POWER_TYP())){
				setWarningMessage("AZ00037");
			}
			
			//�����`�F�b�N
			if(struct.getVEND_CD() != null && !"".equals(struct.getVEND_CD())){				
				List vendList = entity.mselectM_VEND_CTRL.read(conn,struct);
				if(vendList == null || vendList.size() <= 0){
					setErrorMessage("AE20030");
					return;
				}else{
					//��������擾
					String vendname = ((AE0150010Struct)vendList.get(0)).getVEND_NAME();
					struct.setVEND_NAME(vendname);
				}
				
			}
			//���W�I�{�^���m�F
			if("true".equals(struct.getr_APPR_1())){
				struct.setRAPPR("1");
			}else if("true".equals(struct.getr_APPR_2())){
				struct.setRAPPR("2");
			}else if("true".equals(struct.getr_APPR_3())){
				struct.setRAPPR("3");
			}else{
				struct.setRAPPR("4");
			}
			//����
            // �ő�\���s��
	          int maxLine = sp.getMaxLine(conn, 10);
				if(maxLine != 0) {
					struct.setROW_COUNT(String.valueOf(maxLine));
				} else {
					struct.setROW_COUNT(null);
				}
			//�@�ۗ��Ə��F����̂Ƃ�
			if("2".equals(struct.getRAPPR()) || "3".equals(struct.getRAPPR())){
				list = entity.mselectT_INSPC_ACPT_IF_rtnCnt.read(conn, struct);
			}else{
				//���̑��̏�	
				list = entity.mselectT_INSPC_ACPT_IFCnt.read(conn, struct);
			}
			
			int rowCount= Integer.parseInt(((AE0150010Struct)list.get(0)).getl_COUNT());
			
			if(rowCount== 0){
				setErrorMessage("ZZ06001");
				// �������
				setReadStatus(NOT_FOUND);
				return;
			}else{
				if(maxLine != 0 && rowCount == maxLine+1){
					setErrorMessage("ZZ01115",""+maxLine );
					// �������
					setReadStatus(TOO_MANY);
					setList(null);
					return;
				}
			}
			//����
			//�@�ۗ��Ə��F����̂Ƃ�
			if("2".equals(struct.getRAPPR()) || "3".equals(struct.getRAPPR())){
				list = entity.mselectT_INSPC_ACPT_IF_rtn.read(conn,struct);
			}else{
				//���̑��̏�				
				list = entity.mselectT_INSPC_ACPT_IF.read(conn, struct);				
			}
			
			// �R���{�{�b�N�X�f�[�^�̐ݒ�
			AE0150010Struct tempStruct = null;
			for(int i=0; i<list.size(); i++) {
				tempStruct = (AE0150010Struct)list.get(i);
				// �����敪
				tempStruct.setl_CRCT_TYP(getDisplayName(COM_INSPC_ACPT_CRCT_TYP,tempStruct.getl_CRCT_TYP_CD()));
				// ���i�敪
				tempStruct.setl_PRODUCT_TYP(getDisplayName(COM_PRODUCT_TYP,tempStruct.getl_PRODUCT_TYP_CD()));
				// �P���敪
				tempStruct.setl_UNIT_COST_TYP(getDisplayName(COM_UNIT_COST_TYP,tempStruct.getl_UNIT_COST_TYP_CD()));
				// �O���w���i�敪
				tempStruct.setl_SBCNT_PUCH_TYP(getDisplayName(COM_SBCNT_PUCH_TYP,tempStruct.getl_SBCNT_PUCH_TYP_CD()));
				// �݌ɊǗ��t���O
				tempStruct.setl_INV_CTRL_FLG(getDisplayName(COM_INV_CTRL_FLG,tempStruct.getl_INV_CTRL_FLG_CD()));
				// �`�[���
				tempStruct.setl_SLIP_TYP(getDisplayName(COM_SLIP_TYP_AP,tempStruct.getl_SLIP_TYP_CD()));
				// �w���ԕi�t���O
				tempStruct.setl_PUCH_RTN_FLG(getDisplayName(COM_PUCH_RTN_FLG,tempStruct.getl_PUCH_RTN_FLG_CD()));
			}
			// �������
			setReadStatus(NORMAL);			
			
		}catch(SQLException e) {			
			setExceptionMsg(e);
			e.printStackTrace();
		}catch(Exception e) {
			setExceptionMsg(e);
			e.printStackTrace();
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AE0150010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �I���X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlUpdateAssort() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0150");
		logger.entering("AE0150010Control"+":USER="+struct.getsUser_ID(),"controlUpdateAssort");
			//{{user_implement_dev:<controlUpdateAssort>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			//�G���[���b�Z�[�W���X�g
			List messList = new ArrayList(0);
			//�Ɩ��^�p���t
			String businessDate = DateCtrl.getBusinessOprDate(conn,this.getsysPLANT_CD());
			//�ꎞ���X�g
			List tempList = new ArrayList(0);
			//�ꎞstruct
			//AE0150010Struct tempStruct = new AE0150010Struct();
			//�I���s���ă\�[�g
			for(int i = 0;i < struct.getList_l_PUCH_ODR_CD().size(); i++){
				//�ꎞstruct
				AE0150010Struct tempStruct = new AE0150010Struct();				
				tempStruct.importData(struct, i);
				tempList.add(tempStruct);
				
			}
			//���X�g�\�[�g
			listSort(tempList);
			//�I�����ꂽ�s�ɑ΂��āA1�s���ȉ��̏������s��
			for(int i = 0;i < tempList.size(); i++){
				AE0150010Struct tempStruct = new AE0150010Struct();
				//tempStruct.importData(struct, i);
				tempStruct = (AE0150010Struct)tempList.get(i);
				//���F�̏ꍇ
				if("true".equals(struct.getr_APPR_1())){
					//�X�V�ϐ�
					tempStruct.setAPPR_FLG("3");
					tempStruct.setAPPR_ID(this.getsysUSER_CD());
					tempStruct.setAPPR_DATE(businessDate);
				}
				//�ۗ��̏ꍇ
				if("true".equals(struct.getr_APPR_2())){
					//�X�V�ϐ�
					tempStruct.setAPPR_FLG("2");
					tempStruct.setAPPR_ID(this.getsysUSER_CD());
					tempStruct.setAPPR_DATE(businessDate);
					tempStruct.setRESERVE_CAUSE(struct.getRESERVE_CAUSE());
				}
				//���F����̏ꍇ
				if("true".equals(struct.getr_APPR_3())){
					if ( checkFlg && "1".equals(struct.getl_AI_AP_IF_FLG())) {
						messList.clear();
						messList.add("PUCH_ODR_CD:"+tempStruct.getl_PUCH_ODR_CD());
						messList.add("ACPT_NO:"+tempStruct.getl_ACPT_NO());
						messList.add("INSPC_ACPT_NO:"+tempStruct.getl_INSPC_ACPT_NO());
						setErrorMessage("KR00033", messList);
						conn.rollback();
						return;
					}

					//�X�V�ϐ�
					tempStruct.setAPPR_FLG("1");
					tempStruct.setAPPR_ID("");
					tempStruct.setAPPR_DATE("");
				}
				//�ۗ������̏ꍇ
				if("true".equals(struct.getr_APPR_4())){
					//�X�V�ϐ�
					tempStruct.setAPPR_FLG("1");
					tempStruct.setAPPR_ID("");
					tempStruct.setAPPR_DATE("");
					tempStruct.setRESERVE_CAUSE("");
				}
				//�f�[�^���݃`�F�b�N
				List modifyList = entity.mselectT_INSPC_ACPT_IF_modify.read(conn,tempStruct);
				if(modifyList == null || modifyList.size() <= 0){
					setErrorMessage("ZZ01101");
					continue;
				}
				//�X�V�񐔃`�F�b�N
				String modify = ((AE0150010Struct)modifyList.get(0)).getMODIFY_COUNT();
				if(!modify.equals(tempStruct.getl_MODIFY_COUNT())){
					setErrorMessage("ZZ01105");
					conn.rollback();
					return;
				}
				tempStruct.setsUser_ID(struct.getsUser_ID());
				entity.mupdateT_INSPC_ACPT_IF.update(conn, tempStruct);
			}
			//�R�����g
			conn.commit();
			
			//�Č���
			controlSelect();
			
		} catch(SQLException e) {
			conn.rollback();
			setExceptionMsg(e);
			e.printStackTrace();
		}catch(Exception e) {
			conn.rollback();
			setExceptionMsg(e);
			e.printStackTrace();
		}
                //}}user_implement_dev:<controlUpdateAssort>
		logger.exiting("AE0150010Control"+":USER="+struct.getsUser_ID(),"controlUpdateAssort");

		return;
	}

	/**
	 * �S�I���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCheckAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0150");
		logger.entering("AE0150010Control"+":USER="+struct.getsUser_ID(),"controlCheckAll");
			//{{user_implement_dev:<controlCheckAll>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlCheckAll>
		logger.exiting("AE0150010Control"+":USER="+struct.getsUser_ID(),"controlCheckAll");

		return;
	}

	/**
	 * �S�����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCheckClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0150");
		logger.entering("AE0150010Control"+":USER="+struct.getsUser_ID(),"controlCheckClear");
			//{{user_implement_dev:<controlCheckClear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlCheckClear>
		logger.exiting("AE0150010Control"+":USER="+struct.getsUser_ID(),"controlCheckClear");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0150");
		logger.entering("AE0150010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
		//���X�g��null�ɐݒ�
		setList(null);
		controlRELOAD();
                //}}user_implement_dev:<controlClear>
		logger.exiting("AE0150010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0150");
		logger.entering("AE0150010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("AE0150010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0150");
		logger.entering("AE0150010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AE0150010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0150");
		logger.entering("AE0150010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			// �f�[�^�x�[�X�ւ̃A�N�Z�X���s���ꍇ�́A����try catch���̃R�����g���O���Ă��������B
		try{
			//[�C���X�g�[���I�v�V����]���uAi�A�g���v�I�v�V�����̎��ʎq���擾����
			 checkFlg = entity.mcheckSYS_OPTIONS_AIP.check(conn, struct);
			 //�E	�擾�ł���ꍇ�AEXPLANNER/Jf�A���̑��̏ꍇ�AEXPLANNER/J�Ƃ��ď������s���B
			 if(entity.mcheckSYS_OPTIONS_JF.check(conn, struct)){
				 struct.setDIRECT_FLG("0");
			 }else{
				 struct.setDIRECT_FLG("");
			 }
			//���|�����t���O
			String installFlg;
			//���|�����t���O���擾
			List installFlgList = entity.mSYS_INSTALL_OPTIONS.read(conn,struct);
			if(installFlgList != null && installFlgList.size() > 0){
				installFlg = ((AE0150010Struct)installFlgList.get(0)).getINSTALL_FLG();
				if("1".equals(installFlg)){
					setErrorMessage("KR00020");
	                // ������Ԃ��u���s�v�ɐݒ�
	                setReadStatus(ERROR);
					return;
				}
			}else{
				installFlg = "0";
			}
 	        
 	        /** �p�����[�^�u�������F�v���擾*/
 	        privateConfig = new PrivateConfig(conn);
 	        aprInspcIf = privateConfig.getString("APR_INSPC_IF");
 	        // �p�����[�^�u�������F�v���擾�ł��Ȃ������ꍇ
 	        if(aprInspcIf == null || "".equals(aprInspcIf)){
  				String locale = CoreTools.getLocale(struct.getsUser_ID());
  				ResourceBundle messages = CoreTools.getResourceBundle("ExpjMessage", locale);
  				setErrorMessage("AZ00041", messages.getString("AZ00071"));
 	        	aprInspcIf = "0";
                // ������Ԃ��u���s�v�ɐݒ�
                setReadStatus(ERROR);
 	        	return;
 	        }else if(!"1".equals(aprInspcIf)){
 				// �P�ȊO�̏ꍇ
 	        	aprInspcIf = "0";
 	        	setErrorMessage("KR00021");
                // ������Ԃ��u���s�v�ɐݒ�
                setReadStatus(ERROR);
 	        	return;
 	        }else{
 				// �P�̏ꍇ
 	        	aprInspcIf = "1";
 	        }
 	        //���O�C�����[�U�̏��F����
 	        struct.setUSER_CD(this.getsysUSER_CD());
 	        List userList = entity.mselectUSER_MST.read(conn,struct);
 	        if(userList != null && userList.size() > 0){
 	        	//hAPPR_POWER_TYP
 	        	hApprPowerTyp = ((AE0150010Struct)userList.get(0)).getAPPR_POWER_TYP();
 	        	struct.seth_APPR_POWER_TYP(hApprPowerTyp);
 	        }
			// ������Ԃ�������
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
		logger.exiting("AE0150010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0150");
		logger.entering("AE0150010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
				ComboBox comboController = new ComboBox(conn,sysUSER_CD);
				COM_INSPC_ACPT_CRCT_TYP = comboController.getData(INSPC_ACPT_CRCT_TYP_NAME);
				COM_PRODUCT_TYP = comboController.getData(PRODUCT_TYP_NAME);
				COM_UNIT_COST_TYP = comboController.getData(UNIT_COST_TYP_NAME);		
				COM_SBCNT_PUCH_TYP = comboController.getData(SBCNT_PUCH_TYP_NAME);
				COM_INV_CTRL_FLG = comboController.getData(INV_CTRL_FLG_NAME);
				COM_SLIP_TYP_AP = comboController.getData(SLIP_TYP_AP_NAME);
				COM_PUCH_RTN_FLG = comboController.getData(PUCH_RTN_FLG_NAME);
			} catch (SQLException e){
				e.printStackTrace();
				ExpjMessage emsg = new ExpjMessage ("ZZ01106");
				sysLog.severe(emsg,getsysUSER_CD());
			    ExpjException ee = new ExpjException(e,emsg);
			    throw ee;
			}
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AE0150010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
			struct.seth_APPR_POWER_TYP(hApprPowerTyp);
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
//			throw new FoundationException("AE0150010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0150010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AE0150010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0150010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AE0150010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0150010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AE0150010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AE0150010Entity entity;
	protected AE0150010Struct struct;
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

		entity = new AE0150010Entity();
		struct = new AE0150010Struct();

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
	 * AE0150010�N���X�̕W���R���X�g���N�^
	 */
	public AE0150010Control() throws BusinessProcessException, FoundationException
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
				AE0150010Struct key = (AE0150010Struct)keyList.get(j);
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
				if(msgKeyType.containsKeyColumn("l_CRCT_TYP") && key.getl_CRCT_TYP() != null) {
					msgKey.setKeyValue("l_CRCT_TYP", key.getl_CRCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_PRODUCT_TYP") && key.getl_PRODUCT_TYP() != null) {
					msgKey.setKeyValue("l_PRODUCT_TYP", key.getl_PRODUCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_COST_TYP") && key.getl_UNIT_COST_TYP() != null) {
					msgKey.setKeyValue("l_UNIT_COST_TYP", key.getl_UNIT_COST_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_SBCNT_PUCH_TYP") && key.getl_SBCNT_PUCH_TYP() != null) {
					msgKey.setKeyValue("l_SBCNT_PUCH_TYP", key.getl_SBCNT_PUCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_INV_CTRL_FLG") && key.getl_INV_CTRL_FLG() != null) {
					msgKey.setKeyValue("l_INV_CTRL_FLG", key.getl_INV_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_SLIP_TYP") && key.getl_SLIP_TYP() != null) {
					msgKey.setKeyValue("l_SLIP_TYP", key.getl_SLIP_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_RTN_FLG") && key.getl_PUCH_RTN_FLG() != null) {
					msgKey.setKeyValue("l_PUCH_RTN_FLG", key.getl_PUCH_RTN_FLG());
				}
				if(msgKeyType.containsKeyColumn("INSTALL_FLG") && key.getINSTALL_FLG() != null) {
					msgKey.setKeyValue("INSTALL_FLG", key.getINSTALL_FLG());
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
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_CD") && key.getl_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_CD", key.getl_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ACPT_NO") && key.getl_ACPT_NO() != null) {
					msgKey.setKeyValue("l_ACPT_NO", key.getl_ACPT_NO());
				}
				if(msgKeyType.containsKeyColumn("l_INSPC_ACPT_NO") && key.getl_INSPC_ACPT_NO() != null) {
					msgKey.setKeyValue("l_INSPC_ACPT_NO", key.getl_INSPC_ACPT_NO());
				}
				if(msgKeyType.containsKeyColumn("l_CRCT_TYP_CD") && key.getl_CRCT_TYP_CD() != null) {
					msgKey.setKeyValue("l_CRCT_TYP_CD", key.getl_CRCT_TYP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_INSPC_ACPT_DATE") && key.getl_INSPC_ACPT_DATE() != null) {
					msgKey.setKeyValue("l_INSPC_ACPT_DATE", key.getl_INSPC_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ACPT_DATE") && key.getl_ACPT_DATE() != null) {
					msgKey.setKeyValue("l_ACPT_DATE", key.getl_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_VEND_CD") && key.getl_VEND_CD() != null) {
					msgKey.setKeyValue("l_VEND_CD", key.getl_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("l_VEND_NAME") && key.getl_VEND_NAME() != null) {
					msgKey.setKeyValue("l_VEND_NAME", key.getl_VEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_PLANT_CD") && key.getl_PLANT_CD() != null) {
					msgKey.setKeyValue("l_PLANT_CD", key.getl_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_PLANT_NAME") && key.getl_PLANT_NAME() != null) {
					msgKey.setKeyValue("l_PLANT_NAME", key.getl_PLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_GNR_ORG_CD") && key.getl_GNR_ORG_CD() != null) {
					msgKey.setKeyValue("l_GNR_ORG_CD", key.getl_GNR_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("l_GNR_ORG_NAME") && key.getl_GNR_ORG_NAME() != null) {
					msgKey.setKeyValue("l_GNR_ORG_NAME", key.getl_GNR_ORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_DLV_CD") && key.getl_DLV_CD() != null) {
					msgKey.setKeyValue("l_DLV_CD", key.getl_DLV_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_CD") && key.getl_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ITEM_CD", key.getl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_NAME") && key.getl_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ITEM_NAME", key.getl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_PRODUCT_TYP_CD") && key.getl_PRODUCT_TYP_CD() != null) {
					msgKey.setKeyValue("l_PRODUCT_TYP_CD", key.getl_PRODUCT_TYP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_WORK_IN_PROC_CD") && key.getl_WORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("l_WORK_IN_PROC_CD", key.getl_WORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_COST") && key.getl_UNIT_COST() != null) {
					msgKey.setKeyValue("l_UNIT_COST", key.getl_UNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_COST_TYP_CD") && key.getl_UNIT_COST_TYP_CD() != null) {
					msgKey.setKeyValue("l_UNIT_COST_TYP_CD", key.getl_UNIT_COST_TYP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_PROCESSING_COST") && key.getl_PROCESSING_COST() != null) {
					msgKey.setKeyValue("l_PROCESSING_COST", key.getl_PROCESSING_COST());
				}
				if(msgKeyType.containsKeyColumn("l_MATERIAL_COST") && key.getl_MATERIAL_COST() != null) {
					msgKey.setKeyValue("l_MATERIAL_COST", key.getl_MATERIAL_COST());
				}
				if(msgKeyType.containsKeyColumn("l_OTHER_OVERHEADS") && key.getl_OTHER_OVERHEADS() != null) {
					msgKey.setKeyValue("l_OTHER_OVERHEADS", key.getl_OTHER_OVERHEADS());
				}
				if(msgKeyType.containsKeyColumn("l_ACPT_QTY_2") && key.getl_ACPT_QTY_2() != null) {
					msgKey.setKeyValue("l_ACPT_QTY_2", key.getl_ACPT_QTY_2());
				}
				if(msgKeyType.containsKeyColumn("l_INSPC_ACPT_QTY") && key.getl_INSPC_ACPT_QTY() != null) {
					msgKey.setKeyValue("l_INSPC_ACPT_QTY", key.getl_INSPC_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_STOCK_UNIT") && key.getl_STOCK_UNIT() != null) {
					msgKey.setKeyValue("l_STOCK_UNIT", key.getl_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("l_INSPC_ACPT_AMOUNT") && key.getl_INSPC_ACPT_AMOUNT() != null) {
					msgKey.setKeyValue("l_INSPC_ACPT_AMOUNT", key.getl_INSPC_ACPT_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_DISC_AMOUNT") && key.getl_DISC_AMOUNT() != null) {
					msgKey.setKeyValue("l_DISC_AMOUNT", key.getl_DISC_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD") && key.getl_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CD", key.getl_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_DETAIL_NO") && key.getl_JOB_ODR_DETAIL_NO() != null) {
					msgKey.setKeyValue("l_JOB_ODR_DETAIL_NO", key.getl_JOB_ODR_DETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("l_MANAGEMENT_CD") && key.getl_MANAGEMENT_CD() != null) {
					msgKey.setKeyValue("l_MANAGEMENT_CD", key.getl_MANAGEMENT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_SBCNT_PUCH_TYP_CD") && key.getl_SBCNT_PUCH_TYP_CD() != null) {
					msgKey.setKeyValue("l_SBCNT_PUCH_TYP_CD", key.getl_SBCNT_PUCH_TYP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_INV_CTRL_FLG_CD") && key.getl_INV_CTRL_FLG_CD() != null) {
					msgKey.setKeyValue("l_INV_CTRL_FLG_CD", key.getl_INV_CTRL_FLG_CD());
				}
				if(msgKeyType.containsKeyColumn("l_SLIP_TYP_CD") && key.getl_SLIP_TYP_CD() != null) {
					msgKey.setKeyValue("l_SLIP_TYP_CD", key.getl_SLIP_TYP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_RTN_FLG_CD") && key.getl_PUCH_RTN_FLG_CD() != null) {
					msgKey.setKeyValue("l_PUCH_RTN_FLG_CD", key.getl_PUCH_RTN_FLG_CD());
				}
				if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT") && key.getl_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("l_MODIFY_COUNT", key.getl_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("l_AI_AP_IF_FLG") && key.getl_AI_AP_IF_FLG() != null) {
					msgKey.setKeyValue("l_AI_AP_IF_FLG", key.getl_AI_AP_IF_FLG());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("RAPPR") && key.getRAPPR() != null) {
					msgKey.setKeyValue("RAPPR", key.getRAPPR());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("INSPC_DATE_FROM") && key.getINSPC_DATE_FROM() != null) {
					msgKey.setKeyValue("INSPC_DATE_FROM", key.getINSPC_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("INSPC_DATE_TO") && key.getINSPC_DATE_TO() != null) {
					msgKey.setKeyValue("INSPC_DATE_TO", key.getINSPC_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("DIRECT_FLG") && key.getDIRECT_FLG() != null) {
					msgKey.setKeyValue("DIRECT_FLG", key.getDIRECT_FLG());
				}
				if(msgKeyType.containsKeyColumn("VEND_NAME") && key.getVEND_NAME() != null) {
					msgKey.setKeyValue("VEND_NAME", key.getVEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
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
				if(msgKeyType.containsKeyColumn("APPR_POWER_TYP") && key.getAPPR_POWER_TYP() != null) {
					msgKey.setKeyValue("APPR_POWER_TYP", key.getAPPR_POWER_TYP());
				}
				if(msgKeyType.containsKeyColumn("USER_CD") && key.getUSER_CD() != null) {
					msgKey.setKeyValue("USER_CD", key.getUSER_CD());
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
					AE0150010Struct key = new AE0150010Struct();
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
					if(msgKeyType.containsKeyColumn("l_CRCT_TYP")) {
						key.setl_CRCT_TYP(msgKey.getKeyValue("l_CRCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_PRODUCT_TYP")) {
						key.setl_PRODUCT_TYP(msgKey.getKeyValue("l_PRODUCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_COST_TYP")) {
						key.setl_UNIT_COST_TYP(msgKey.getKeyValue("l_UNIT_COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_SBCNT_PUCH_TYP")) {
						key.setl_SBCNT_PUCH_TYP(msgKey.getKeyValue("l_SBCNT_PUCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_INV_CTRL_FLG")) {
						key.setl_INV_CTRL_FLG(msgKey.getKeyValue("l_INV_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_SLIP_TYP")) {
						key.setl_SLIP_TYP(msgKey.getKeyValue("l_SLIP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_RTN_FLG")) {
						key.setl_PUCH_RTN_FLG(msgKey.getKeyValue("l_PUCH_RTN_FLG"));
					}
					if(msgKeyType.containsKeyColumn("INSTALL_FLG")) {
						key.setINSTALL_FLG(msgKey.getKeyValue("INSTALL_FLG"));
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
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_CD")) {
						key.setl_PUCH_ODR_CD(msgKey.getKeyValue("l_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ACPT_NO")) {
						key.setl_ACPT_NO(msgKey.getKeyValue("l_ACPT_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_INSPC_ACPT_NO")) {
						key.setl_INSPC_ACPT_NO(msgKey.getKeyValue("l_INSPC_ACPT_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_CRCT_TYP_CD")) {
						key.setl_CRCT_TYP_CD(msgKey.getKeyValue("l_CRCT_TYP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_INSPC_ACPT_DATE")) {
						key.setl_INSPC_ACPT_DATE(msgKey.getKeyValue("l_INSPC_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ACPT_DATE")) {
						key.setl_ACPT_DATE(msgKey.getKeyValue("l_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_VEND_CD")) {
						key.setl_VEND_CD(msgKey.getKeyValue("l_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_VEND_NAME")) {
						key.setl_VEND_NAME(msgKey.getKeyValue("l_VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_PLANT_CD")) {
						key.setl_PLANT_CD(msgKey.getKeyValue("l_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_PLANT_NAME")) {
						key.setl_PLANT_NAME(msgKey.getKeyValue("l_PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_GNR_ORG_CD")) {
						key.setl_GNR_ORG_CD(msgKey.getKeyValue("l_GNR_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_GNR_ORG_NAME")) {
						key.setl_GNR_ORG_NAME(msgKey.getKeyValue("l_GNR_ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_DLV_CD")) {
						key.setl_DLV_CD(msgKey.getKeyValue("l_DLV_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_CD")) {
						key.setl_ITEM_CD(msgKey.getKeyValue("l_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_NAME")) {
						key.setl_ITEM_NAME(msgKey.getKeyValue("l_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_PRODUCT_TYP_CD")) {
						key.setl_PRODUCT_TYP_CD(msgKey.getKeyValue("l_PRODUCT_TYP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_WORK_IN_PROC_CD")) {
						key.setl_WORK_IN_PROC_CD(msgKey.getKeyValue("l_WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_COST")) {
						key.setl_UNIT_COST(msgKey.getKeyValue("l_UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_COST_TYP_CD")) {
						key.setl_UNIT_COST_TYP_CD(msgKey.getKeyValue("l_UNIT_COST_TYP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_PROCESSING_COST")) {
						key.setl_PROCESSING_COST(msgKey.getKeyValue("l_PROCESSING_COST"));
					}
					if(msgKeyType.containsKeyColumn("l_MATERIAL_COST")) {
						key.setl_MATERIAL_COST(msgKey.getKeyValue("l_MATERIAL_COST"));
					}
					if(msgKeyType.containsKeyColumn("l_OTHER_OVERHEADS")) {
						key.setl_OTHER_OVERHEADS(msgKey.getKeyValue("l_OTHER_OVERHEADS"));
					}
					if(msgKeyType.containsKeyColumn("l_ACPT_QTY_2")) {
						key.setl_ACPT_QTY_2(msgKey.getKeyValue("l_ACPT_QTY_2"));
					}
					if(msgKeyType.containsKeyColumn("l_INSPC_ACPT_QTY")) {
						key.setl_INSPC_ACPT_QTY(msgKey.getKeyValue("l_INSPC_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_STOCK_UNIT")) {
						key.setl_STOCK_UNIT(msgKey.getKeyValue("l_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("l_INSPC_ACPT_AMOUNT")) {
						key.setl_INSPC_ACPT_AMOUNT(msgKey.getKeyValue("l_INSPC_ACPT_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_DISC_AMOUNT")) {
						key.setl_DISC_AMOUNT(msgKey.getKeyValue("l_DISC_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD")) {
						key.setl_JOB_ODR_CD(msgKey.getKeyValue("l_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_DETAIL_NO")) {
						key.setl_JOB_ODR_DETAIL_NO(msgKey.getKeyValue("l_JOB_ODR_DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_MANAGEMENT_CD")) {
						key.setl_MANAGEMENT_CD(msgKey.getKeyValue("l_MANAGEMENT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_SBCNT_PUCH_TYP_CD")) {
						key.setl_SBCNT_PUCH_TYP_CD(msgKey.getKeyValue("l_SBCNT_PUCH_TYP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_INV_CTRL_FLG_CD")) {
						key.setl_INV_CTRL_FLG_CD(msgKey.getKeyValue("l_INV_CTRL_FLG_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_SLIP_TYP_CD")) {
						key.setl_SLIP_TYP_CD(msgKey.getKeyValue("l_SLIP_TYP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_RTN_FLG_CD")) {
						key.setl_PUCH_RTN_FLG_CD(msgKey.getKeyValue("l_PUCH_RTN_FLG_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT")) {
						key.setl_MODIFY_COUNT(msgKey.getKeyValue("l_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_AI_AP_IF_FLG")) {
						key.setl_AI_AP_IF_FLG(msgKey.getKeyValue("l_AI_AP_IF_FLG"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("RAPPR")) {
						key.setRAPPR(msgKey.getKeyValue("RAPPR"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_DATE_FROM")) {
						key.setINSPC_DATE_FROM(msgKey.getKeyValue("INSPC_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_DATE_TO")) {
						key.setINSPC_DATE_TO(msgKey.getKeyValue("INSPC_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("DIRECT_FLG")) {
						key.setDIRECT_FLG(msgKey.getKeyValue("DIRECT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("VEND_NAME")) {
						key.setVEND_NAME(msgKey.getKeyValue("VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
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
					if(msgKeyType.containsKeyColumn("APPR_POWER_TYP")) {
						key.setAPPR_POWER_TYP(msgKey.getKeyValue("APPR_POWER_TYP"));
					}
					if(msgKeyType.containsKeyColumn("USER_CD")) {
						key.setUSER_CD(msgKey.getKeyValue("USER_CD"));
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
