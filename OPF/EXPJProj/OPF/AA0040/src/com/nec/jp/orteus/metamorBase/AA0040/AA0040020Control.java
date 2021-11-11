/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0040/src/com/nec/jp/orteus/metamorBase/AA0040/AA0040020Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0040;

import com.nec.jp.orteus.metamorBase.AA0040.*;
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
import java.text.ParseException;
import com.nec.jp.orteus.expj.mstappr.MstAppr;
import com.nec.jp.orteus.expj.mstappr.MstApprDetailStruct;
import com.nec.jp.orteus.expj.mstappr.MstApprKeyStruct;
import com.nec.jp.orteus.expj.mstappr.MstApprStruct;
import com.nec.jp.orteus.expj.mstappr.MstColumns;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AA0040020Control
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
	protected List list;										    // ���ʃ��X�g�̃C���X�^���X
	public List getList() { return this.list; }				     // ���X�g��Ԃ��܂��B
	public void setList(List listname) { this.list = listname; }    // ���X�g���Z�b�g���܂��B
	public int getListsize() {									      // ���X�g�^�̃T�C�Y��Ԃ��܂��B
		int nret = 0;
		if( this.list != null ) {nret = this.list.size();}
		return nret;
	}
	public Object getListvalue(int x) { return this.list.get(x); }  // ���X�g�̒l�i���f�B�G�[�^�j��Ԃ��܂��B

	public AA0040020Struct getStruct() { return this.struct; }      // Struct�̒l�i���f�B�G�[�^�j��Ԃ��܂��B


//--------- �R���{�{�b�N�X�֘A ------------------------------------------------------

	/** �P���敪 */
	private ComboStruct _CONS_UNIT_COST = new ComboStruct();

	/** �P���敪�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setCONS_UNIT_COST(ComboStruct combo){ _CONS_UNIT_COST = combo; }

	/** �P���敪�擾
	 * @return �P���敪�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getCONS_UNIT_COST(){ return _CONS_UNIT_COST; }

	/** �i�ڎ�z�敪 */
	private ComboStruct _MRP_ODR_TYP = new ComboStruct();

	/** �i�ڎ�z�敪�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setMRP_ODR_TYP(ComboStruct combo){ _MRP_ODR_TYP = combo; }

	/** �i�ڎ�z�敪�擾
	 * @return �i�ڎ�z�敪�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getMRP_ODR_TYP(){ return _MRP_ODR_TYP; }

	/** ���O�쐬�敪 */
	private ComboStruct _OUTSIDE_TYP = new ComboStruct();

	/** ���O�쐬�敪�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setOUTSIDE_TYP(ComboStruct combo){ _OUTSIDE_TYP = combo; }

	/** ���O�쐬�敪�擾
	 * @return ���O�쐬�敪�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getOUTSIDE_TYP(){ return _OUTSIDE_TYP; }

//-------------------------------------------------------------------------
	/**
	 * �敪���擾
	 * @param comboStruct �敪��񃊃X�g
	 * @param intType �敪�R�[�h
	 * @return �敪���́B�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�
	 */
	private String getTypeName(ComboStruct comboStruct, Integer intType)
	{
		String strTyp = TypeConverter.sanitizer(intType);
		return getTypeName(comboStruct,strTyp);
	}
	/**
	 * �敪���擾
	 * @param comboStruct �敪��񃊃X�g
	 * @param strTyp �敪�R�[�h
	 * @return �敪���́B�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�
	 */
	private String getTypeName(ComboStruct comboStruct, String strTyp)
	{
		String strTypName = strTyp;
		for(int i = 0; i < comboStruct.getValList().size(); i++){
			if(strTyp.equals((String)(comboStruct.getValList().get(i)))){
				strTypName = (String)(comboStruct.getExplanList().get(i));
				break;
			}
		}
		return strTypName;
	}
	/**
	 * �i�ڏ��̃t���O�̕\����ݒ�
	 * @param s �t���O�̒l���ݒ肳��Ă�����
	 */
	private void setTypeValueAboutItem(AA0040020Struct s)
	{
		s.setw_MRP_ODR_NAME(getTypeName(_MRP_ODR_TYP,s.getw_MRP_ODR_TYP()));
		s.setw_OUTSIDE_NAME(getTypeName(_OUTSIDE_TYP,s.getw_OUTSIDE_TYP()));
	}
	/**
	 * �O���P�����̃t���O�̕\����ݒ�
	 * @param s �t���O�̒l���ݒ肳��Ă�����
	 */
	private void setTypeValueAboutUnitCost(AA0040020Struct s)
	{
		s.setp_UNIT_COST_NAME(getTypeName(_CONS_UNIT_COST,s.getp_UNIT_COST_TYP()));
	}

//------------------------------------------------------------------------------
	/** �q�ːe�ɉ�ʑJ�ڂ����ꍇ�̃L�[���ێ��ׂ̈�Struct */
	private AA0040020Struct _keyStruct = new AA0040020Struct();

	/** �L�[���Struct�̎擾 */
	public AA0040020Struct getKeyStruct(){ return _keyStruct; }

	/** �L�[���Struct�̐ݒ� */
	public void setKeyStruct(AA0040020Struct struct){ _keyStruct.keycopy(struct); }
//------------------------------------------------------------------------------

	/** �P����񃊃X�g */
	private ArrayList _deployList = new ArrayList(0);

	/** �P����񃊃X�g�擾  
	 * @return ���i�\�����X�g
	*/
	public ArrayList getDeployList(){ return _deployList; }

//------------------------------------------------------------------------------

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
	

//-----------------------------------------------------------------------------
	// ��ЃR�[�h�ۑ��p
	private String _COMPANY_CD = null;

//-----------------------------------------------------------------------------
	/** ��ʋ��ʒ�`�擾�N���X */
	ScreenParam _scParam = sp;
//	------------------------------------------------------------------------------
	 /**
	 * �}�X�^�L�[�̏W��
	 */
	private HashMap keyvalueMap = new HashMap();
	
	/**�}�X�^�L�[�̏W���̎擾
	 * @return �}�X�^�L�[�̏W��
	 */
	public HashMap getKeyvalueMap() {
		return keyvalueMap;
	}
	/**�}�X�^�L�[�̏W���̐ݒ�
	 * @param �}�X�^�L�[�̏��
	 */
	public void setKeyvalueMap(HashMap keyvalueMap) {
		this.keyvalueMap = keyvalueMap;
	}
//-----------------------------------------------------------------------------
	/**
	 * �J�ڗތ^�@
	 * 0:�@�}�X�^���
	 * 1:�@���F���
	 */
	private String screen_move_typ = null;
	
	/**�J�ڗތ^�̎擾
	 * @return �J�ڗތ^
	 */
	public String getScreen_move_typ() {
		return screen_move_typ;
	}
	/**�J�ڗތ^�̐ݒ�
	 * @param �J�ڗތ^
	 */
	public void setScreen_move_typ(String screen_move_typ) {
		this.screen_move_typ = screen_move_typ;
	}
//-----------------------------------------------------------------------------
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
     * ��񃁃b�Z�[�W�ݒ�
     * @param ���b�Z�[�W�ԍ�
     * @param �o�̓��b�Z�[�W
     */
    private void setInfoMessage(String messageno)
    {
     ExpjMessage emsg = new ExpjMessage( messageno );
     msgStruct.addInfo( emsg );
     sysLog.config(emsg, getsysUSER_CD());
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
		sysLog.severe(emsg, getsysUSER_CD());
		emsg = new ExpjMessage( "ZZ01006", message );
		msgStruct.addError( emsg );
		sysLog.severe(emsg, getsysUSER_CD());
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
		sysLog.severe(emsg, getsysUSER_CD());
		
		for(int i=0; i<message.size(); i++)
		{
			emsg = new ExpjMessage( "ZZ01006", (String)message.get(i) );
			msgStruct.addError( emsg );
			sysLog.severe(emsg, getsysUSER_CD());
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
		sysLog.warning(emsg, getsysUSER_CD());
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
	/**
     * �G���[���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
     * @param code ���b�Z�[�W�R�[�h
     */
    private void setErrorMessage(String code) {
     ExpjMessage emsg = new ExpjMessage(code);
     msgStruct.addError(emsg);
     sysLog.warning(emsg, sysUSER_CD);
    }
    /** ��ʑJ�ڃL�[(�H��R�[�h) */
    private String _w_PLANT_CD;
    
    /**
     * ��ʑJ�ڃL�[(�H��R�[�h)�擾
     * @return �H��R�[�h
     */
    public String getw_PLANT_CD() {
     return _w_PLANT_CD;
    }
    /**
     * ��ʑJ�ڃL�[(�H��R�[�h)�ݒ�
     * @param cd �H��R�[�h
     */
    public void setw_PLANT_CD(String cd) {
     _w_PLANT_CD = cd;
    }
    
    /**�e�[�u���� */
    private String _table_name = null;
    
  /**
	 * @return Returns the _table_name.
	 */
	public String get_table_name() {
		return _table_name;
	}
	/**
	 * @param _table_name The _table_name to set.
	 */
	public void set_table_name(String _table_name) {
		this._table_name = _table_name;
	}
	/**�O���P�����F */
	private String _APR_SBCNT_UNIT_COST = null;
/**
   * Date�^ �� String�^�B
   * @return String YYYY/MM/DD�`��
   */
  public String dateToString(Date date)
  {
   //return _dateFormat.format(date);
   return Converter.dateToStr(date, "yyyy/MM/dd");
  }
 
  /**
   * String�^ �� Date�^�B
   * @return Date 
   */
  public Date stringToDate(String date) throws ParseException
  {
   //return _dateFormat.parse(date);
   return Converter.strToDate(date, "yyyy/MM/dd");
  }
  /**    
   * check ���t�`���Fyyyy/MM/dd
   * @param sourceDate    
   * @return    
   */     
   public static boolean checkDate(String sourceDate){     
   if(sourceDate==null){     
   return false;     
   }     
   try {     
   SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");     
   dateFormat.setLenient(false);     
   dateFormat.parse(sourceDate);     
   return true;     
   } catch (Exception e) {     
   }     
   return false;     
   }
  //---------- �L���J�n���t��ݒ� -------------------------------------
  /**
   * �T�u�P�L���J�n���t�����������܂��B
   */
  private void initialDate() throws BusinessProcessException, FoundationException
  {
     try{
  	   //[�p�����[�^]�D"���O"��ݒ肵�܂�
  	   struct.setp_NAME("UC_EFF_PHASE_IN_DATE");
  	   Date t;
  	   String para;
  	   //[�p�����[�^]�D"�ݒ�l"���擾
  	   List dateInList = entity.mselectSYS_PARAMETER.read(conn, struct);
  	   if (dateInList.isEmpty()){
  		   return;
  	   }
  	   AA0040020Struct dateInStruct = (AA0040020Struct) dateInList.get(0);
  	   if ( dateInStruct.getp_VALUE() != null && !dateInStruct.getp_VALUE().equals("")
  			   && !(dateInStruct.getp_VALUE().toLowerCase()).equals("null")){
  		   if(dateInStruct.getp_VALUE().equals("*"))
  		   {
  			  //�V�X�e�����[�U���擾
  			  struct.setp_USER_CD(struct.getsUser_ID());
  			  List userList = entity.mselectUSER_MST.read(conn,struct);
  			  if (userList.isEmpty()){
  				  ExpjMessage emsg = new ExpjMessage("ZZ09026");
                    msgStruct.addError(emsg);
                    sysLog.warning(emsg, sysUSER_CD);
                    return;
  			  }
  			  AA0040020Struct userStruct = (AA0040020Struct) userList.get(0);
  			  
  			  //�Ɩ��^�p�����擾
  			  List sysDateCtrlList = entity.mselectSYS_DATE_CTRL.read(conn, userStruct);
                if (sysDateCtrlList.isEmpty()){
                    ExpjMessage emsg = new ExpjMessage("KR00017");
                    msgStruct.addError(emsg);
                    sysLog.warning(emsg, sysUSER_CD);
                    return;
                }
                AA0040020Struct sysDateStruct = (AA0040020Struct) sysDateCtrlList.get(0);
                struct.setp_EFF_PHASE_IN_DATE(sysDateStruct.getp_BUSINESS_DATE());
  		   }else{
  			   if (checkDate(dateInStruct.getp_VALUE()) == true){
  	      		   try{
  	      			   //���t�`���𔻕�
  	      			   t = stringToDate(dateInStruct.getp_VALUE());
  	      			   para = dateToString(t);
  	      			   //[�p�����[�^]�D"�ݒ�l"!=null�̏ꍇ�A�L���J�n���t�@= [�p�����[�^]�D"�ݒ�l"
  	      			   struct.setp_EFF_PHASE_IN_DATE(para);  
      	      		}catch(ParseException   e){
           			   //"�L���J�n���̃p�����[�^���s���ł��B"
           			   ExpjMessage emsg = new ExpjMessage("ZZ13001");
                        msgStruct.addError(emsg);
                        sysLog.warning(emsg, getsysUSER_CD());
                        return;
           		   }
  			   }else{
  				   //"�L���J�n���̃p�����[�^���s���ł��B"
      			   ExpjMessage emsg = new ExpjMessage("ZZ13001");
                   msgStruct.addError(emsg);
                   sysLog.warning(emsg, getsysUSER_CD());
  			   }
  		   }
  	   }else{
  		   struct.setp_EFF_PHASE_IN_DATE("");
  	   }
     }catch(FoundationException e){
  	   e.printStackTrace();
     }
     catch(SQLException ee){
        ee.printStackTrace();            	   
     }            	   
  }
//------------------------------------------------------------------------------
  /**
   * �p�����[�^�u�O���P�����F�v���擾����
 * @throws FoundationException 
 * @throws ExpjException 
   */
  private void initalparameter() throws FoundationException, ExpjException{
  	struct.setp_NAME("APR_SBCNT_UNIT_COST");
  	try {
			List tempList = entity.mselectSYS_PARAMETER.read(conn,struct);
			if(tempList.isEmpty()){
				// �p�����[�^�u�O���P�����F�v���擾�ł��Ȃ������ꍇ
				String locale = CoreTools.getLocale(struct.getsUser_ID());
 				ResourceBundle messages = CoreTools.getResourceBundle("ExpjMessage", locale);
 				ExpjMessage emsg = new ExpjMessage("AZ00041", messages.getString("AZ00049"));
 				msgStruct.addError(emsg);
 			    sysLog.warning(emsg, sysUSER_CD);
				struct.seth_APR_SBCNT_UNIT_COST("0");
				_APR_SBCNT_UNIT_COST = struct.geth_APR_SBCNT_UNIT_COST();
				return ;
			}
			AA0040020Struct tempStruct = (AA0040020Struct) tempList.get(0);
			if(!"1".equals(tempStruct.getp_VALUE())){
				tempStruct.setp_VALUE("0");
			}
			struct.seth_APR_SBCNT_UNIT_COST(tempStruct.getp_VALUE());
			_APR_SBCNT_UNIT_COST = struct.geth_APR_SBCNT_UNIT_COST();
		} catch (SQLException e) {
			setSqlExceptionMsg(e);
		}
  }

//------------------------------------------------------------------------------
  /**
	 * ��ʑJ�ڎ��A�L�[�̎擾
	 *
	 */
	private void getKey(){
		if(keyvalueMap.containsKey("COMPANY_CD")){
			struct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());
		}
		if(keyvalueMap.containsKey("VEND_CD")){
			struct.setVEND_CD(keyvalueMap.get("VEND_CD").toString());
		}
		if(keyvalueMap.containsKey("COMPANY_CD")){
			struct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());
		}
		if(keyvalueMap.containsKey("ITEM_CD")){
			struct.setITEM_CD(keyvalueMap.get("ITEM_CD").toString());
		}
		if(keyvalueMap.containsKey("PROC_CD")){
			struct.setPROC_CD(keyvalueMap.get("PROC_CD").toString());
		}
		if(keyvalueMap.containsKey("EFF_PHASE_IN_DATE")){
			struct.setEFF_PHASE_IN_DATE(keyvalueMap.get("EFF_PHASE_IN_DATE").toString());
		}
		if(keyvalueMap.containsKey("PLANT_CD")){
			struct.setw_PLANT_CD(keyvalueMap.get("PLANT_CD").toString());
		}
	}
//------------------------------------------------------------------------------
	
	
	/**
  	 * �w�b�_�폜���F��񑶍݃`�F�b�N
  	 * @param 
	 * @throws ExpjException 
  	 */
	private boolean checkApprDel() throws ExpjException {
		boolean ret = false;
		//�}�X�^���F���i
  		MstAppr mstappr = new MstAppr(conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"AA0040020","AA0040020Servlet");
  		// 	���F�˗����݃`�F�b�N
  		ArrayList keyvalueList = new ArrayList();
  		// ��ЃR�[�h
  		MstColumns keyvalue1 = new MstColumns();
  		keyvalue1.setColumnname("COMPANY_CD");
  		keyvalue1.setColumnvalue(struct.getCOMPANY_CD());
  		keyvalueList.add(keyvalue1);
  		// �����R�[�h
  		MstColumns keyvalue2 = new MstColumns();
  		keyvalue2.setColumnname("VEND_CD");
  		keyvalue2.setColumnvalue(struct.getVEND_CD());
  		keyvalueList.add(keyvalue2);
  		// �H��R�[�h
  		MstColumns keyvalue3 = new MstColumns();
  		keyvalue3.setColumnname("PLANT_CD");
  		keyvalue3.setColumnvalue(struct.getw_PLANT_CD());
  		keyvalueList.add(keyvalue3);
  		// �i�ڔԍ�
  		MstColumns keyvalue4 = new MstColumns();
  		keyvalue4.setColumnname("ITEM_CD");
  		keyvalue4.setColumnvalue(struct.getITEM_CD());
  		keyvalueList.add(keyvalue4);
  		// �i�ڕʍ�ƃR�[�h
  		MstColumns keyvalue5 = new MstColumns();
  		keyvalue5.setColumnname("PROC_CD");
  		keyvalue5.setColumnvalue(struct.getPROC_CD());
  		keyvalueList.add(keyvalue5);
  		
  		try {
			if(mstappr.checkMST_APPRDel("M_SBCNT_UNIT_COST_H",keyvalueList)){
				setErrorMessage("KA00129");
				ret =  true;
			}
		} catch(SQLException e) {
			setSqlExceptionMsg(e);
		}		
		return ret;
				
	}
		
	
	/**
  	 * �w�b�_���F����o�^
  	 * @param button
  	 * @throws SQLException
  	 */
  	private void insertAppr_Head(String button) throws SQLException{
  		// �}�X�^���F���i
  		MstAppr mstappr = new MstAppr(conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"AA0040020","AA0040020Servlet");
  		String appr_ID = null;                             // ���FID��ۑ��p�̗Վ��ϐ� 
  		MstApprStruct mstApprStruct = new MstApprStruct(); // 
  		String columnID = null;                            //
  		MstApprKeyStruct keyStruct = new MstApprKeyStruct();
  		// 	���F�˗����݃`�F�b�N
  		ArrayList keyvalueList = new ArrayList();
  		// ��ЃR�[�h
  		MstColumns keyvalue1 = new MstColumns();
  		keyvalue1.setColumnname("COMPANY_CD");
  		keyvalue1.setColumnvalue(struct.getCOMPANY_CD());
  		keyvalueList.add(keyvalue1);
  		// �����R�[�h
  		MstColumns keyvalue2 = new MstColumns();
  		keyvalue2.setColumnname("VEND_CD");
  		keyvalue2.setColumnvalue(struct.getVEND_CD());
  		keyvalueList.add(keyvalue2);
  		// �H��R�[�h
  		MstColumns keyvalue3 = new MstColumns();
  		keyvalue3.setColumnname("PLANT_CD");
  		keyvalue3.setColumnvalue(struct.getw_PLANT_CD());
  		keyvalueList.add(keyvalue3);
  		// �i�ڔԍ�
  		MstColumns keyvalue4 = new MstColumns();
  		keyvalue4.setColumnname("ITEM_CD");
  		keyvalue4.setColumnvalue(struct.getITEM_CD());
  		keyvalueList.add(keyvalue4);
  		// �i�ڕʍ�ƃR�[�h
  		MstColumns keyvalue5 = new MstColumns();
  		keyvalue5.setColumnname("PROC_CD");
  		keyvalue5.setColumnvalue(struct.getPROC_CD());
  		keyvalueList.add(keyvalue5);
  		
  		if(mstappr.checkMST_APPR("M_SBCNT_UNIT_COST_H",keyvalueList)){
  			setErrorMessage("KA00125");
  			return;
  		}
  		
  		// 	���F�˗��\�Ƀf�[�^��ǉ�	
  		mstApprStruct.setSCREEN_URL("AA0040020Servlet");          // ���URL
  		mstApprStruct.setPLANT_CD(this.getsysPLANT_CD());         // �H��̎��ʃR�[�h�B
  		if("insert".equals(button)){
  			mstApprStruct.setPROC_TYP("1");                       // �o�^
  		}
  		if("update".equals(button)){
  			mstApprStruct.setPROC_TYP("2");                       // �X�V
  		}
  		if("delete".equals(button)){
  			mstApprStruct.setPROC_TYP("3");                       // �폜
  		}
  		mstApprStruct.setAPPR_REMARKS(struct.getAPPR_REMARKS());   // ���F���l
  		mstApprStruct.setSTATUS("1");                              // ��ԋ敪
  		mstApprStruct.setREQUEST_BY(struct.getsUser_ID());         // �˗���
  		appr_ID = mstappr.insertMST_APPR(mstApprStruct);
  		
  		// ���F�L�[�Ή��\�o�^
  		keyStruct.setAPPR_ID(appr_ID);
  		// ��ЃR�[�h
  		keyStruct.setTABLE_NAME("M_SBCNT_UNIT_COST_H");
  		keyStruct.setKEY_NAME("COMPANY_CD");
  		keyStruct.setKEY_VALUE(struct.getCOMPANY_CD());
  		mstappr.insertMST_APPR_KEY(keyStruct);
  		// �����R�[�h
  		keyStruct.setTABLE_NAME("M_SBCNT_UNIT_COST_H");
  		keyStruct.setKEY_NAME("VEND_CD");
  		keyStruct.setKEY_VALUE(struct.getVEND_CD());
  		mstappr.insertMST_APPR_KEY(keyStruct);
  		// �H��R�[�h
  		keyStruct.setTABLE_NAME("M_SBCNT_UNIT_COST_H");
  		keyStruct.setKEY_NAME("PLANT_CD");
  		keyStruct.setKEY_VALUE(struct.getw_PLANT_CD());
  		mstappr.insertMST_APPR_KEY(keyStruct);
  		// �i�ڔԍ�
  		keyStruct.setTABLE_NAME("M_SBCNT_UNIT_COST_H");
  		keyStruct.setKEY_NAME("ITEM_CD");
  		keyStruct.setKEY_VALUE(struct.getITEM_CD());
  		mstappr.insertMST_APPR_KEY(keyStruct);
  		// �i�ڕʍ�ƃR�[�h
  		keyStruct.setTABLE_NAME("M_SBCNT_UNIT_COST_H");
  		keyStruct.setKEY_NAME("PROC_CD");
  		keyStruct.setKEY_VALUE(struct.getPROC_CD());
  		mstappr.insertMST_APPR_KEY(keyStruct);
  		
  		// ���F���ו\�Ƀ}�X�^����ǉ�
  		String nowdate = mstappr.readSystemDateTime();
  		// �O���P���𐮗�	
  		// ��ЃR�[�h
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST_H","COMPANY_CD");
  		mstappr.setDetailByColumnID(struct.getCOMPANY_CD(),columnID);
  		// �����R�[�h
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST_H","VEND_CD");
  		mstappr.setDetailByColumnID(struct.getVEND_CD(),columnID);
  		// �H��R�[�h
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST_H","PLANT_CD");
  		mstappr.setDetailByColumnID(struct.getw_PLANT_CD(),columnID);
  		// �i�ڔԍ�
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST_H","ITEM_CD");
  		mstappr.setDetailByColumnID(struct.getITEM_CD(),columnID);
  		// �i�ڕʍ�ƃR�[�h
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST_H","PROC_CD");
  		mstappr.setDetailByColumnID(struct.getPROC_CD(),columnID);
  		// �����i�ڔԍ�
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST_H","VEND_ITEM_CD");
  		mstappr.setDetailByColumnID(struct.getVEND_ITEM_CD(),columnID);
  		// �쐬��
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST_H","CREATED_DATE");
  		mstappr.setDetailByColumnID(nowdate,columnID);
  		// �쐬��
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST_H","CREATED_BY");
  		mstappr.setDetailByColumnID(this.getsysUSER_CD(),columnID);
  		// �쐬�v���O������
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST_H","CREATED_PRG_NM");
  		mstappr.setDetailByColumnID("AA0040020",columnID);
  		// �X�V��
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST_H","UPDATED_DATE");
  		mstappr.setDetailByColumnID(nowdate,columnID);
  		// �X�V��
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST_H","UPDATED_BY");
  		mstappr.setDetailByColumnID(this.getsysUSER_CD(),columnID);
  		// �X�V�v���O������
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST_H","UPDATED_PRG_NM");
  		mstappr.setDetailByColumnID("AA0040020",columnID);
  		// �X�V��
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST_H","MODIFY_COUNT");
  		mstappr.setDetailByColumnID("0",columnID);
  		
  		// ���F���ׂɃf�[�^��ǉ�����B
  		mstappr.insertMST_APPR_DETAIL("M_SBCNT_UNIT_COST_H",appr_ID);
  		
  	}
  	
  	/**
  	 * ���ו��o�^���F��񑶍݃`�F�b�N
  	 * @param 
	 * @throws ExpjException 
  	 */
	private boolean checkApprAdd() throws ExpjException {
		boolean ret = false;
		//�}�X�^���F���i
  		MstAppr mstappr = new MstAppr(conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"AA0040020","AA0040020Servlet");
  		// 	���F�˗����݃`�F�b�N
  		ArrayList keyvalueList = new ArrayList();
  		//��ЃR�[�h
  		MstColumns keyvalue1 = new MstColumns();
  		keyvalue1.setColumnname("COMPANY_CD");
  		keyvalue1.setColumnvalue(struct.getCOMPANY_CD());
  		keyvalueList.add(keyvalue1);
  		// �����R�[�h
  		MstColumns keyvalue2 = new MstColumns();
  		keyvalue2.setColumnname("VEND_CD");
  		keyvalue2.setColumnvalue(struct.getVEND_CD());
  		keyvalueList.add(keyvalue2);
  		// �H��R�[�h
  		MstColumns keyvalue3 = new MstColumns();
  		keyvalue3.setColumnname("PLANT_CD");
  		keyvalue3.setColumnvalue(struct.getw_PLANT_CD());
  		keyvalueList.add(keyvalue3);
  		// �i�ڔԍ�
  		MstColumns keyvalue4 = new MstColumns();
  		keyvalue4.setColumnname("ITEM_CD");
  		keyvalue4.setColumnvalue(struct.getITEM_CD());
  		keyvalueList.add(keyvalue4);
  		// �i�ڕʍ�ƃR�[�h
  		MstColumns keyvalue5 = new MstColumns();
  		keyvalue5.setColumnname("PROC_CD");
  		keyvalue5.setColumnvalue(struct.getPROC_CD());
  		keyvalueList.add(keyvalue5);
  		
  		try {
			if(mstappr.checkMST_APPRAdd("M_SBCNT_UNIT_COST",keyvalueList)){
				setErrorMessage("KA00130");
				ret =  true;
			}
		} catch(SQLException e) {
			setSqlExceptionMsg(e);
		}		
		return ret;
				
	}
	
	/**
  	 * ���ו����F��񑶍݃`�F�b�N
  	 * @param 
	 * @throws ExpjException 
  	 */
	private boolean checkAppr() throws ExpjException {
		boolean ret = false;
		//�}�X�^���F���i
  		MstAppr mstappr = new MstAppr(conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"AA0040020","AA0040020Servlet");
  		// 	���F�˗����݃`�F�b�N
  		ArrayList keyvalueList = new ArrayList();
  		//��ЃR�[�h
  		MstColumns keyvalue1 = new MstColumns();
  		keyvalue1.setColumnname("COMPANY_CD");
  		keyvalue1.setColumnvalue(struct.getCOMPANY_CD());
  		keyvalueList.add(keyvalue1);
  		// �����R�[�h
  		MstColumns keyvalue2 = new MstColumns();
  		keyvalue2.setColumnname("VEND_CD");
  		keyvalue2.setColumnvalue(struct.getVEND_CD());
  		keyvalueList.add(keyvalue2);
  		// �H��R�[�h
  		MstColumns keyvalue3 = new MstColumns();
  		keyvalue3.setColumnname("PLANT_CD");
  		keyvalue3.setColumnvalue(struct.getw_PLANT_CD());
  		keyvalueList.add(keyvalue3);
  		// �i�ڔԍ�
  		MstColumns keyvalue4 = new MstColumns();
  		keyvalue4.setColumnname("ITEM_CD");
  		keyvalue4.setColumnvalue(struct.getITEM_CD());
  		keyvalueList.add(keyvalue4);
  		// �i�ڕʍ�ƃR�[�h
  		MstColumns keyvalue5 = new MstColumns();
  		keyvalue5.setColumnname("PROC_CD");
  		keyvalue5.setColumnvalue(struct.getPROC_CD());
  		keyvalueList.add(keyvalue5);
  		// �O���P���L���J�n��
  		MstColumns keyvalue6 = new MstColumns();
  		keyvalue6.setColumnname("EFF_PHASE_IN_DATE");
  		keyvalue6.setColumnvalue(struct.getp_EFF_PHASE_IN_DATE());
  		keyvalueList.add(keyvalue6);
  		// �T�C�Y
  		MstColumns keyvalue7 = new MstColumns();
  		keyvalue7.setColumnname("SBCNT_SIZE");
  		keyvalue7.setColumnvalue("0");
  		keyvalueList.add(keyvalue7);
  		
  		try {
  	  		if(mstappr.checkMST_APPR("M_SBCNT_UNIT_COST",keyvalueList)){
  	  			setErrorMessage("KA00125");	  		
				ret =  true;
			}
		} catch(SQLException e) {
			setSqlExceptionMsg(e);
		}		
		return ret;
				
	}
  	
	/**
  	 * �}�X�^���F����o�^
  	 * @param button
  	 * @throws SQLException
	 * @throws ExpjException 
  	 */
  	private void insertAppr(String button) throws SQLException, ExpjException{
  		// �}�X�^���F���i
  		MstAppr mstappr = new MstAppr(conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"AA0040020","AA0040020Servlet");
  		String appr_ID = null;                             // ���FID��ۑ��p�̗Վ��ϐ� 
  		MstApprStruct mstApprStruct = new MstApprStruct(); // 
  		String columnID = null;                            //
  		MstApprKeyStruct keyStruct = new MstApprKeyStruct();
  		
  		if (checkAppr()) {
  			return;
  		}
  		
  		// 	���F�˗��\�Ƀf�[�^��ǉ�	
  		mstApprStruct.setSCREEN_URL("AA0040020Servlet");          // ���URL
  		mstApprStruct.setPLANT_CD(this.getsysPLANT_CD());         // �H��̎��ʃR�[�h�B
  		if("insert".equals(button)){
  			mstApprStruct.setPROC_TYP("1");                       // �o�^
  		}
  		if("update".equals(button)){
  			mstApprStruct.setPROC_TYP("2");                       // �X�V
  		}
  		if("delete".equals(button)){
  			mstApprStruct.setPROC_TYP("3");                       // �폜
  		}
  		mstApprStruct.setAPPR_REMARKS(struct.getp_APPR_REMARKS());   // ���F���l
  		mstApprStruct.setSTATUS("1");                              // ��ԋ敪
  		mstApprStruct.setREQUEST_BY(struct.getsUser_ID());         // �˗���
  		appr_ID = mstappr.insertMST_APPR(mstApprStruct);
  		
  		// ���F�L�[�Ή��\�o�^
  		keyStruct.setAPPR_ID(appr_ID);
  		// ��ЃR�[�h
  		keyStruct.setTABLE_NAME("M_SBCNT_UNIT_COST");
  		keyStruct.setKEY_NAME("COMPANY_CD");
  		keyStruct.setKEY_VALUE(struct.getCOMPANY_CD());
  		mstappr.insertMST_APPR_KEY(keyStruct);
  		// �����R�[�h
  		keyStruct.setTABLE_NAME("M_SBCNT_UNIT_COST");
  		keyStruct.setKEY_NAME("VEND_CD");
  		keyStruct.setKEY_VALUE(struct.getVEND_CD());
  		mstappr.insertMST_APPR_KEY(keyStruct);
  		// �H��R�[�h
  		keyStruct.setTABLE_NAME("M_SBCNT_UNIT_COST");
  		keyStruct.setKEY_NAME("PLANT_CD");
  		keyStruct.setKEY_VALUE(struct.getw_PLANT_CD());
  		mstappr.insertMST_APPR_KEY(keyStruct);
  		// �i�ڔԍ�
  		keyStruct.setTABLE_NAME("M_SBCNT_UNIT_COST");
  		keyStruct.setKEY_NAME("ITEM_CD");
  		keyStruct.setKEY_VALUE(struct.getITEM_CD());
  		mstappr.insertMST_APPR_KEY(keyStruct);
  		// �i�ڕʍ�ƃR�[�h
  		keyStruct.setTABLE_NAME("M_SBCNT_UNIT_COST");
  		keyStruct.setKEY_NAME("PROC_CD");
  		keyStruct.setKEY_VALUE(struct.getPROC_CD());
  		mstappr.insertMST_APPR_KEY(keyStruct);
  		// �O���P���L���J�n��
  		keyStruct.setTABLE_NAME("M_SBCNT_UNIT_COST");
  		keyStruct.setKEY_NAME("EFF_PHASE_IN_DATE");
  		keyStruct.setKEY_VALUE(struct.getp_EFF_PHASE_IN_DATE());
  		mstappr.insertMST_APPR_KEY(keyStruct);
  		// �T�C�Y
  		keyStruct.setTABLE_NAME("M_SBCNT_UNIT_COST");
  		keyStruct.setKEY_NAME("SBCNT_SIZE");
  		keyStruct.setKEY_VALUE("0");
  		mstappr.insertMST_APPR_KEY(keyStruct);
  		
  		// ���F���ו\�Ƀ}�X�^����ǉ�
  		String nowdate = mstappr.readSystemDateTime();
  		// �O���P���𐮗�	
  		// ��ЃR�[�h
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST","COMPANY_CD");
  		mstappr.setDetailByColumnID(struct.getCOMPANY_CD(),columnID);
  		// �����R�[�h
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST","VEND_CD");
  		mstappr.setDetailByColumnID(struct.getVEND_CD(),columnID);
  		// �H��R�[�h
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST","PLANT_CD");
  		mstappr.setDetailByColumnID(struct.getw_PLANT_CD(),columnID);
  		// �i�ڔԍ�
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST","ITEM_CD");
  		mstappr.setDetailByColumnID(struct.getITEM_CD(),columnID);
  		// �i�ڕʍ�ƃR�[�h
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST","PROC_CD");
  		mstappr.setDetailByColumnID(struct.getPROC_CD(),columnID);
  		// �O���P���L���J�n��
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST","EFF_PHASE_IN_DATE");
  		mstappr.setDetailByColumnID(struct.getp_EFF_PHASE_IN_DATE(),columnID);
  		// �T�C�Y
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST","SBCNT_SIZE");
  		mstappr.setDetailByColumnID("0",columnID);
  		// �P��
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST","UNIT_COST");
  		mstappr.setDetailByColumnID(struct.getp_UNIT_COST(),columnID);
  		// �P���敪
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST","UNIT_COST_TYP");
  		mstappr.setDetailByColumnID(struct.getp_UNIT_COST_TYP().toString(),columnID);
  		// �O�����H��
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST","PROCESSING_COST");
  		mstappr.setDetailByColumnID(struct.getp_PROCESSING_COST().toString(),columnID);
  		// �O���ޗ���
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST","MATERIAL_COST");
  		mstappr.setDetailByColumnID(struct.getp_MATERIAL_COST().toString(),columnID);
  		// �O�����̑��o��
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST","OTHER_OVERHEADS");
  		mstappr.setDetailByColumnID(struct.getp_OTHER_OVERHEADS().toString(),columnID);
  		// �쐬��
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST","CREATED_DATE");
  		mstappr.setDetailByColumnID(nowdate,columnID);
  		// �쐬��
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST","CREATED_BY");
  		mstappr.setDetailByColumnID("AA0040020",columnID);
  		// �쐬�v���O������
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST","CREATED_PRG_NM");
  		mstappr.setDetailByColumnID(this.getScreenId(),columnID);
  		// �X�V��
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST","UPDATED_DATE");
  		mstappr.setDetailByColumnID(nowdate,columnID);
  		// �X�V��
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST","UPDATED_BY");
  		mstappr.setDetailByColumnID(this.getsysUSER_CD(),columnID);
  		// �X�V�v���O������
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST","UPDATED_PRG_NM");
  		mstappr.setDetailByColumnID("AA0040020",columnID);
  		// �X�V��
  		columnID = mstappr.getColumnID("M_SBCNT_UNIT_COST","MODIFY_COUNT");
  		mstappr.setDetailByColumnID("0",columnID);
  		
  		// ���F���ׂɃf�[�^��ǉ�����B
  		mstappr.insertMST_APPR_DETAIL("M_SBCNT_UNIT_COST",appr_ID);
  		
  	}
//---------------------------------------------------------------------------------
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0040");
		logger.entering("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
		//------------------------------------------------------------------
		String Message = "";
		MstAppr mstappr = new MstAppr(this.conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"AA0040020","AA0040020Servlet");
		try {
			
			//�L�[���ڂ�ێ�
			_keyStruct.keycopy(struct);
			//��ʒl��������
			struct.initialize();
			//�ꗗ���X�g�N���A
			_deployList.clear();
			//�ێ����Ă����l���ăZ�b�g(�L�[�l�ȊO������������)
			struct.keycopy(_keyStruct);
			

			// �O���P���w�b�_���݃`�F�b�N
			List listSbH = null;
			//	����
			List listSb = null;
			// �J�ڂ��鎞
			if("1".equals(struct.geth_APR_SBCNT_UNIT_COST()) && this.isScreenMove() && !"".equals(struct.geth_SCREENMOVE_TYP())){
				
				boolean result;

				// �i�ڔԍ����݃`�F�b�N
				result = entity.mcheckM_ITEM.check(conn, struct);
				if(result == true){
					List listItem = entity.mselectM_ITEM.read(conn, struct);
					struct.copy((AA0040020Struct)listItem.get(0));
					
					// �i�ڂ̃t���O�\��������ݒ�
					setTypeValueAboutItem(struct);
				}

				//��ƌn�񑶍݃`�F�b�N
				result = entity.mcheckM_PROC_GRP.check(conn, struct);
				if(result == true){
					//��Ɩ��擾
					List listProc = entity.mselectM_PROC_GRP.read(conn, struct);
					struct.setPROC_NAME(((AA0040020Struct)listProc.get(0)).getPROC_NAME());
				}
				// �����ԍ����݃`�F�b�N
				result = entity.mcheckM_VEND_CTRL.check(conn, struct);
				if(result == true){
					List listVend = entity.mselectM_VEND_CTRL.read(conn, struct);
					AA0040020Struct vendInfo = (AA0040020Struct)listVend.get(0);
					struct.setVEND_ANAME(vendInfo.getVEND_ANAME());
					struct.setCUR_CD(vendInfo.getCUR_CD());
					struct.setCUR_NAME(vendInfo.getCUR_NAME());
					struct.setROUND_TYP(vendInfo.getROUND_TYP());
					struct.setDECIMAL_FIG(vendInfo.getDECIMAL_FIG());
				}
				// �O���P���w�b�_����I���̏ꍇ
				if("M_SBCNT_UNIT_COST_H".equals(this.get_table_name())){
					// ���F��ʂ́u�ύX��v�{�^������J�ڂ��鎞
					if("1".equals(struct.geth_SCREENMOVE_TYP())){
						listSbH = mstappr.selectMST_APPR_DETAIL(struct.geth_APPR_ID());
						MstApprDetailStruct tempStruct = (MstApprDetailStruct) listSbH.get(0);
						String columnID = null;

						// �����i�ڔԍ�
						columnID = mstappr.getColumnID( "M_SBCNT_UNIT_COST_H", "VEND_ITEM_CD");
						struct.setVEND_ITEM_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
					}else{ 
						// ���F��ʂ́u�ύX�O�v�{�^������J�ڂ��鎞�A
						listSbH = entity.mselectM_SBCNT_UNIT_COST_H.read(conn, struct);
						struct.setVEND_ITEM_CD(((AA0040020Struct)listSbH.get(0)).getVEND_ITEM_CD());
					}
					if(listSbH.size() > 0){

						// �ꗗ���X�g�擾
						listSb = entity.mselectM_SBCNT_UNIT_COST.read(conn, struct);
						if(listSb.size() > 0){
							//�ꗗ���X�g�擾
							_deployList =(ArrayList)listSb;
							// �t���O�̕\��������ݒ�
							for(int n = 0; n < _deployList.size(); n++){
								setTypeValueAboutUnitCost((AA0040020Struct)(_deployList.get(n)));
							}

							setReadStatus(NORMAL);
						} else {
							setReadStatus(NOT_FOUND);
						}
					} else {
						setReadStatus(NOT_FOUND);
					}
				//�O���P�����ׂ�I���̏ꍇ
				}else{
					//	 ���F��ʂ́u�ύX��v�{�^������J�ڂ��鎞
					if("1".equals(struct.geth_SCREENMOVE_TYP())){
						listSb = mstappr.selectMST_APPR_DETAIL(struct.geth_APPR_ID());
						MstApprDetailStruct tempStruct = (MstApprDetailStruct) listSb.get(0);
						String columnID = null;
						 //�O���P���L���J�n���t
					    columnID = mstappr.getColumnID( "M_SBCNT_UNIT_COST", "EFF_PHASE_IN_DATE");
						struct.setp_EFF_PHASE_IN_DATE(mstappr.getDetailByColumnID(tempStruct,columnID));
						
						// �O���P��
						columnID = mstappr.getColumnID( "M_SBCNT_UNIT_COST", "UNIT_COST");
						struct.setp_UNIT_COST(mstappr.getDetailByColumnID(tempStruct,columnID));

						// �P���敪
						columnID = mstappr.getColumnID( "M_SBCNT_UNIT_COST", "UNIT_COST_TYP");
						struct.setp_UNIT_COST_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));

						// �O�����H��
						columnID = mstappr.getColumnID( "M_SBCNT_UNIT_COST", "PROCESSING_COST");
						struct.setp_PROCESSING_COST(mstappr.getDetailByColumnID(tempStruct,columnID));

						// �O���ޗ���
						columnID = mstappr.getColumnID( "M_SBCNT_UNIT_COST", "MATERIAL_COST");
						struct.setp_MATERIAL_COST(mstappr.getDetailByColumnID(tempStruct,columnID));

						// �O�����̑��o��
						columnID = mstappr.getColumnID( "M_SBCNT_UNIT_COST", "OTHER_OVERHEADS");
						struct.setp_OTHER_OVERHEADS(mstappr.getDetailByColumnID(tempStruct,columnID));

					}else{ 
						// ���F��ʂ́u�ύX�O�v�{�^������J�ڂ��鎞�A	
						listSb = entity.mselectM_SBCNT_UNIT_COST_detail.read(conn, struct);
						AA0040020Struct tempStruct = (AA0040020Struct)listSb.get(0);
						struct.setp_EFF_PHASE_IN_DATE(tempStruct.getp_EFF_PHASE_IN_DATE());
						struct.setp_UNIT_COST(tempStruct.getp_UNIT_COST());
						struct.setp_UNIT_COST_TYP(tempStruct.getp_UNIT_COST_TYP());
						struct.setp_PROCESSING_COST(tempStruct.getp_PROCESSING_COST());
						struct.setp_MATERIAL_COST(tempStruct.getp_MATERIAL_COST());
						struct.setp_OTHER_OVERHEADS(tempStruct.getp_OTHER_OVERHEADS());
					}
				}
			// ����̓Ǎ����A
			}else{ 
				// ��ЃR�[�h�擾
				List listCompany = entity.mselectSYS_MY_COMPANY.read(conn, struct);
				
				if( listCompany.size() > 0 ){
					_COMPANY_CD = new String(((AA0040020Struct)listCompany.get(0)).getCOMPANY_CD());
					struct.setCOMPANY_CD(_COMPANY_CD);
				}else{
					// �Ǎ��������s�F���������Ɉ�v����f�[�^�͑��݂��܂���ł����B[��ЃR�[�h]
					setReadStatus(INITIAL);

					Message = "SYS_MY_COMPANY.COMPANY_CD:" + struct.getCOMPANY_CD();
					
					setErrorMessage("ZZ06001", Message);
				}

				boolean result;

				// �i�ڔԍ����݃`�F�b�N
				result = entity.mcheckM_ITEM.check(conn, struct);
				if(result == true){
					List listItem = entity.mselectM_ITEM.read(conn, struct);
					struct.copy((AA0040020Struct)listItem.get(0));
					
					// �i�ڂ̃t���O�\��������ݒ�
					setTypeValueAboutItem(struct);
				}else{
					// �Ǎ��������s�F�i�ڔԍ����i�ڂɑ��݂��܂���
					setReadStatus(INITIAL);

					Message = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
					
					setErrorMessage("AA01002", Message);
				}

				//��ƌn�񑶍݃`�F�b�N
				result = entity.mcheckM_PROC_GRP.check(conn, struct);
				if(result == true){
					//��Ɩ��擾
					List listProc = entity.mselectM_PROC_GRP.read(conn, struct);
					struct.setPROC_NAME(((AA0040020Struct)listProc.get(0)).getPROC_NAME());
				}else{
					// �Ǎ��������s�F��ƃR�[�h�������ɑ��݂��܂���B
					setReadStatus(INITIAL);

					Message = "M_PROC_GRP.PROC_CD:" + struct.getPROC_CD();
					
					setErrorMessage("AA01006", Message);
				}

				// �����ԍ����݃`�F�b�N
				result = entity.mcheckM_VEND_CTRL.check(conn, struct);
				if(result == true){
					List listVend = entity.mselectM_VEND_CTRL.read(conn, struct);
					AA0040020Struct vendInfo = (AA0040020Struct)listVend.get(0);
					struct.setVEND_ANAME(vendInfo.getVEND_ANAME());
					struct.setCUR_CD(vendInfo.getCUR_CD());
					struct.setCUR_NAME(vendInfo.getCUR_NAME());
					struct.setROUND_TYP(vendInfo.getROUND_TYP());
					struct.setDECIMAL_FIG(vendInfo.getDECIMAL_FIG());
				}
				else{
					// �Ǎ��������s�F�����R�[�h�������ɑ��݂��܂���B
					setReadStatus(INITIAL);

					Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
					setErrorMessage("AA01004", Message);
				}

				//�G���[���Ȃ����
				if(msgStruct.sizeError() <= 0) {
					// �O���P���w�b�_���݃`�F�b�N
					listSbH = entity.mselectM_SBCNT_UNIT_COST_H.read(conn, struct);
					if(listSbH.size() > 0){
	
						// �ꗗ���X�g�擾
						//�����i�ڔԍ�
						struct.setVEND_ITEM_CD(((AA0040020Struct)listSbH.get(0)).getVEND_ITEM_CD());
						struct.seth_VEND_ITEM_CD_1(((AA0040020Struct)listSbH.get(0)).getVEND_ITEM_CD());
	
						//�X�V�J�E���g�擾
						struct.setw_MODIFY_COUNT_H(((AA0040020Struct)listSbH.get(0)).getw_MODIFY_COUNT_H());
						
						listSb = entity.mselectM_SBCNT_UNIT_COST.read(conn, struct);
						if(listSb.size() > 0){
							//�ꗗ���X�g�擾
							_deployList =(ArrayList)listSb;
							// �t���O�̕\��������ݒ�
							for(int n = 0; n < _deployList.size(); n++){
								setTypeValueAboutUnitCost((AA0040020Struct)(_deployList.get(n)));
							}
	
							setReadStatus(NORMAL);
						} else {
							setReadStatus(NOT_FOUND);
						}
					} else {
						setReadStatus(NOT_FOUND);
					}
				}
			}

			//�������ʂ�ێ��i�ꗗ�ȊO�j
			_keyStruct.copy(struct);

			// �\���p�ɐݒ�
			list = _deployList;

		}catch(SQLException e){
			setReadStatus(ERROR);
			setSqlExceptionMsg(e);
		}

		//------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * �s�ǉ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlappend() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0040");
		logger.entering("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlappend");
			//{{user_implement_dev:<controlappend>
		//------------------------------------------------------------------
		// �w�b�_�[���̍폜�˗������`�F�b�N
		if(checkApprDel()) {
			return;
		}
		struct.copy(_keyStruct);
		//struct.setp_EFF_PHASE_IN_DATE("");
		//�T�u�P�L���J�n���t�����������܂��B
		initialDate();
		struct.setp_UNIT_COST("0");
		struct.setp_PROCESSING_COST("0");
		struct.setp_MATERIAL_COST("0");
		struct.setp_OTHER_OVERHEADS("0");
		struct.setp_UNIT_COST_TYP("");
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlappend>
		logger.exiting("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlappend");

		return;
	}

	/**
	 * �s�C���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlmodify() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0040");
		logger.entering("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlmodify");
			//{{user_implement_dev:<controlmodify>
		//------------------------------------------------------------------
		//------------------------------------------------------------------
//		try {
//			if("1".equals(struct.getM_SBCNT_UNIT_COST_APPR())){
//				List tempList = entity.mselectM_SBCNT_UNIT_COST_APPR.read(conn,struct);
//				AA0040020Struct tempStruct = new AA0040020Struct();
//				if(tempList != null && tempList.size()>0){
//					tempStruct = (AA0040020Struct) tempList.get(0);
//					struct.setl_APPR_REMARKS(tempStruct.getl_APPR_REMARKS());
//					struct.setl_STATUS_NAME(getTypeName(_STATUS,tempStruct.getl_STATUS()));
//					struct.setl_APPR_BY(tempStruct.getl_APPR_BY());
//					struct.setl_APPR_BY_NAME(tempStruct.getl_APPR_BY_NAME());
//				}
//			}
//		} catch (FoundationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}		
		//�@�˗����݃`�F�b�N
		if(checkAppr()){
			return;
		}
		_keyStruct.keycopy(struct);
                //}}user_implement_dev:<controlmodify>
		logger.exiting("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlmodify");

		return;
	}

	/**
	 * �s���ʃ{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlcopy() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0040");
		logger.entering("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlcopy");
			//{{user_implement_dev:<controlcopy>
		//------------------------------------------------------------------
		//struct.setp_EFF_PHASE_IN_DATE("");
		//�T�u�P�L���J�n���t�����������܂��B
		//�@�w�b�_�[���̍폜�˗������`�F�b�N
		if (checkApprDel()) {
			return;
		}
		initialDate();
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlcopy>
		logger.exiting("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlcopy");

		return;
	}

	/**
	 * �s�폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlerase() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0040");
		logger.entering("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlerase");
			//{{user_implement_dev:<controlerase>
		//------------------------------------------------------------------
			List listMessage = new ArrayList();
			boolean transFlg = false;

			try {
				// �g�����U�N�V�����J�n
				conn.beginTransWeb();
				transFlg = true;

				 // �ꗗ���X�g�̍X�V�J�E���g���擾
	            String modifydeployList = new String(struct.getw_MODIFY_COUNT());
				// ���R�[�h���b�N
	            List modifyList = null;
         
				// ���R�[�h���b�N
				modifyList = entity.mselectM_SBCNT_UNIT_COST_modify.read(conn,struct);
				if (modifyList.size() > 0) {
					// ���݂̍X�V�J�E���g�擾
					String modifySelect = new String(((AA0040020Struct) modifyList.get(0)).getw_MODIFY_COUNT());
					// �X�V�J�E���g�̃`�F�b�N
					if (modifydeployList.equals(modifySelect) == false) {
						// �s�폜�������s�F���Ƀ��R�[�h���X�V����Ă��܂�
						listMessage.add("M_SBCNT_UNIT_COST.ITEM_CD:" + struct.getITEM_CD());
						listMessage.add("M_SBCNT_UNIT_COST.VEND_CD:" + struct.getVEND_CD());
						listMessage.add("M_SBCNT_UNIT_COST.PROC_CD:" + struct.getPROC_CD());
						setErrorMessage("ZZ01105", listMessage);
						return;
					}
				} else {
					// �s�X�V�������s�F���������Ɉ�v����f�[�^�͑��݂��܂���ł����B
					listMessage.add("M_SBCNT_UNIT_COST.ITEM_CD:" + struct.getITEM_CD());
					listMessage.add("M_SBCNT_UNIT_COST.VEND_CD:" + struct.getVEND_CD());
					listMessage.add("M_SBCNT_UNIT_COST.PROC_CD:" + struct.getPROC_CD());
					listMessage.add("M_SBCNT_UNIT_COST.getp_EFF_PHASE_IN_DATE:" + struct.getp_EFF_PHASE_IN_DATE());

					setErrorMessage("ZZ06001", listMessage);
					return;
				}

				// �G���[��������Ύ��s
	            // �p�����[�^�u�O���P�����F�v��0�̂Ƃ�
				if ("0".equals(struct.geth_APR_SBCNT_UNIT_COST())) {
					entity.mdeleteM_SBCNT_UNIT_COST.delete(conn, struct);
					// �Č���
					controlselect();

					// �ꗗ�f�[�^���O���Ȃ�w�b�_�����폜���鏈���������Ȃ�
					if(getDeployList().size() <= 0)
					{
						entity.mdeleteM_SBCNT_UNIT_COST_H.delete(conn,struct);
					}
			         // �R�~�b�g
			         conn.commit();
			         transFlg = false;
			         // �Č���
			         controlselect();
				}
	            // �p�����[�^�u�O���P�����F�v��1�̂Ƃ�
				if ("1".equals(struct.geth_APR_SBCNT_UNIT_COST())) {
					// ���F���̓o�^
					insertAppr("delete");
					if(!msgStruct.hasError()){
						struct.keycopy(_keyStruct);
						// �R�~�b�g
						conn.commit();
						transFlg = false;
						setInfoMessage("AZ00042");
					}
				}
			} catch(SQLException e) {
				setSqlExceptionMsg(e);
			}finally{
				try {
					if(transFlg == true){
						// ���[���o�b�N
						conn.rollback();
					}
				} catch(Exception e) {
					e.printStackTrace();
				}
			}

		//------------------------------------------------------------------
                //}}user_implement_dev:<controlerase>
		logger.exiting("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlerase");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0040");
		logger.entering("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
		//------------------------------------------------------------------
			List listMessage = new ArrayList();
			boolean transFlg = false;

			try {
				// �g�����U�N�V�����J�n
				conn.beginTransWeb();
				transFlg = true;

				boolean result = false;	 // �`�F�b�N���ʊi�[�p

				//�O���P���w�b�_�X�V�J�E���g�^���b�N
				List modifyList = entity.mselectM_SBCNT_UNIT_COST_H_modify.read(conn,struct);

				if(modifyList.size() > 0 ){
					//�X�V

					//���݂̍X�V�J�E���g�擾
					String modifySelect = new String (((AA0040020Struct)modifyList.get(0)).getw_MODIFY_COUNT_H());

					String modifydeployList = new String(struct.getw_MODIFY_COUNT_H());

					//�X�V�J�E���g�̃`�F�b�N
					if(modifydeployList.equals(modifySelect) == true){
			            // �p�����[�^�u�O���P�����F�v��0�̂Ƃ�
						if ("0".equals(struct.geth_APR_SBCNT_UNIT_COST())) {
							entity.mupdateM_SBCNT_UNIT_COST_H.update(conn, struct);
						}else{
							if(!struct.getVEND_ITEM_CD().equals(struct.geth_VEND_ITEM_CD_1())){
								insertAppr_Head("update");
								if(!msgStruct.hasError()){
									setInfoMessage("AZ00042");
								}
							}
						}
					}else{
						// �s�X�V�������s�F���Ƀ��R�[�h���X�V����Ă��܂�
						listMessage.add("M_SBCNT_UNIT_COST_H.ITEM_CD:" + _COMPANY_CD);
						listMessage.add("M_SBCNT_UNIT_COST_H.VEND_CD:" + struct.getVEND_CD());
						listMessage.add("M_SBCNT_UNIT_COST_H.PLANT_CD:" + struct.getw_PLANT_CD());
						listMessage.add("M_SBCNT_UNIT_COST_H.ITEM_CD:" + struct.getITEM_CD());
						listMessage.add("M_SBCNT_UNIT_COST_H.PROC_CD:" + struct.getPROC_CD());

						setErrorMessage("ZZ01105", listMessage);
					}
				}else{
					//�쐬
		            // �p�����[�^�u�O���P�����F�v��0�̎�
					if ("0".equals(struct.geth_APR_SBCNT_UNIT_COST())) {
						entity.minsertM_SBCNT_UNIT_COST_H.create(conn,struct);
			        // �p�����[�^�u�O���P�����F�v��1�̎�
					}else{
						insertAppr_Head("insert");
						if(!msgStruct.hasError()){
							setInfoMessage("AZ00042");
						}
					}
				}
				if(!msgStruct.hasError()){
					// �R�~�b�g
					conn.commit();
					transFlg = false;
					if("0".equals(struct.geth_APR_SBCNT_UNIT_COST())){
						//�Č���
						controlselect();
					}
				}
			} catch(SQLException e) {
				setSqlExceptionMsg(e);

			}finally{
				try {
					if(transFlg == true){
						// ���[���o�b�N
						conn.rollback();
					}

				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlupdate>
		logger.exiting("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * �S�폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controldelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0040");
		logger.entering("AA0040020Control"+":USER="+struct.getsUser_ID(),"controldelete");
			//{{user_implement_dev:<controldelete>
		//------------------------------------------------------------------
			List listMessage = new ArrayList();
			String Message = "";
			boolean transFlg = false;

			try {

				// �g�����U�N�V�����J�n
				conn.beginTransWeb();
				transFlg = true;
				//�@���ו��̓o�^�˗����݃`�F�b�N
				if (checkApprAdd()){
					return;
				}
				boolean result = false;	 // �`�F�b�N���ʊi�[�p
				// �p�����[�^�u�O���P�����F�v���O
				if ("0".equals(struct.geth_APR_SBCNT_UNIT_COST())) {
				//������ɑS�폜�����f����
				if( !("NORMAL".equals(getReadStatusString())) ){

					// ��ЃR�[�h�擾
					List listCompany = entity.mselectSYS_MY_COMPANY.read(conn, struct);
					
					if( listCompany.size() > 0 ){
						_COMPANY_CD = new String(((AA0040020Struct)listCompany.get(0)).getCOMPANY_CD());
						struct.setCOMPANY_CD(_COMPANY_CD);
					}else{
						// �Ǎ��������s(������)�F���������Ɉ�v����f�[�^�͑��݂��܂���ł���
						Message = "SYS_MY_COMPANY.COMPANY_CD:" + struct.getCOMPANY_CD();
						
						setErrorMessage("ZZ06001", Message);
					}

					// �i�ڔԍ����݃`�F�b�N
					result = entity.mcheckM_ITEM.check(conn, struct);
					if(result == false){
						Message = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
						
						setErrorMessage("AA01002", Message);
					}

					//��ƌn�񑶍݃`�F�b�N
					result = entity.mcheckM_PROC_GRP.check(conn, struct);
					if(result == false){
						// �Ǎ��������s�F��ƃR�[�h�������ɑ��݂��܂���
						Message = "M_PROC_GRP.PROC_CD:" + struct.getPROC_CD();
						
						setErrorMessage("AA01006", Message);
					}

					// �����ԍ����݃`�F�b�N
					result = entity.mcheckM_VEND_CTRL.check(conn, struct);
					if(result == false){
						// �Ǎ��������s�F�����R�[�h�������ɑ��݂��܂���
						Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
						
						setErrorMessage("AA01004", Message);
					}

					//�G���[���������
					if(msgStruct.sizeError() <= 0) {

						//�O���P���w�b�_���b�N
						List modifyheadList = entity.mselectM_SBCNT_UNIT_COST_H_modify.read(conn,struct);

						if(modifyheadList.size() <= 0 ){
							// �S�폜���s(������)�F���������Ɉ�v����f�[�^�͑��݂��܂���ł����B[�P���w�b�_]
							listMessage.add("M_SBCNT_UNIT_COST_H.COMPANY_CD:" + _COMPANY_CD);
							listMessage.add("M_SBCNT_UNIT_COST_H.VEND_CD:" + struct.getVEND_CD());
							listMessage.add("M_SBCNT_UNIT_COST_H.PLANT_CD:" + struct.getw_PLANT_CD());
							listMessage.add("M_SBCNT_UNIT_COST_H.ITEM_CD:" + struct.getITEM_CD());
							listMessage.add("M_SBCNT_UNIT_COST_H.PROC_CD:" + struct.getPROC_CD());

							setErrorMessage("AA01006", listMessage);
						}
					}

					//�G���[���������
					if(msgStruct.sizeError() <= 0) {

						//�O���P�����׃��b�N
						List modifyList = entity.mselectM_SBCNT_UNIT_COST_lock.read(conn,struct);

						if(modifyList.size() <= 0 ){
							// �S�폜���s(������)�F���������Ɉ�v����f�[�^�͑��݂��܂���ł����B[�P������]
							listMessage.add("M_SBCNT_UNIT_COST.COMPANY_CD:" + _COMPANY_CD);
							listMessage.add("M_SBCNT_UNIT_COST.VEND_CD:" + struct.getVEND_CD());
							listMessage.add("M_SBCNT_UNIT_COST.PLANT_CD:" + struct.getw_PLANT_CD());
							listMessage.add("M_SBCNT_UNIT_COST.ITEM_CD:" + struct.getITEM_CD());
							listMessage.add("M_SBCNT_UNIT_COST.PROC_CD:" + struct.getPROC_CD());

							setErrorMessage("AA01006", listMessage);
						}
					}

				}else{
					//�O���P���w�b�_�X�V�J�E���g�^���b�N
					List modifyheadList = entity.mselectM_SBCNT_UNIT_COST_H_modify.read(conn,struct);

					if(modifyheadList.size() > 0 ){
						// �O���P���w�b�_:���݂̍X�V�J�E���g�擾
						String modifySelect = ((AA0040020Struct)modifyheadList.get(0)).getw_MODIFY_COUNT_H();

						// �O���P���w�b�_:�������̍X�V�J�E���g�擾
						String modifydeployList = struct.getw_MODIFY_COUNT_H();

						if(!(modifySelect.equals(modifydeployList))){
							// �S�폜���s�F���Ƀ��R�[�h���X�V����Ă��܂��B[�P���w�b�_]
							listMessage.add("M_SBCNT_UNIT_COST_H.COMPANY_CD:" + _COMPANY_CD);
							listMessage.add("M_SBCNT_UNIT_COST_H.VEND_CD:" + struct.getVEND_CD());
							listMessage.add("M_SBCNT_UNIT_COST_H.PLANT_CD:" + struct.getw_PLANT_CD());
							listMessage.add("M_SBCNT_UNIT_COST_H.ITEM_CD:" + struct.getITEM_CD());
							listMessage.add("M_SBCNT_UNIT_COST_H.PROC_CD:" + struct.getPROC_CD());

							setErrorMessage("ZZ01105", listMessage);
						}
					}else{
						// �S�폜���s�F���������Ɉ�v����f�[�^�͑��݂��܂���ł���
						listMessage.add("M_SBCNT_UNIT_COST_H.COMPANY_CD:" + _COMPANY_CD);
						listMessage.add("M_SBCNT_UNIT_COST_H.VEND_CD:" + struct.getVEND_CD());
						listMessage.add("M_SBCNT_UNIT_COST_H.PLANT_CD:" + struct.getw_PLANT_CD());
						listMessage.add("M_SBCNT_UNIT_COST_H.ITEM_CD:" + struct.getITEM_CD());
						listMessage.add("M_SBCNT_UNIT_COST_H.PROC_CD:" + struct.getPROC_CD());

						setErrorMessage("ZZ06001", listMessage);
					}
				
					if(msgStruct.sizeError() <= 0) {

						boolean bRet = true;

						//�o�^�ς݌����擾
						List recCountList = entity.mselectM_SBCNT_UNIT_COST_record_count.read(conn, struct);
						Integer iRecCount = new Integer((((AA0040020Struct)recCountList.get(0)).getw_MODIFY_COUNT()));

						ArrayList aCheckArraylist = new ArrayList(_deployList);

						//�o�^�ς݌����ƕ\�������������������H
						if(iRecCount.intValue() == aCheckArraylist.size()){
							for(int cnt = 0; cnt < aCheckArraylist.size(); cnt++){

								// �O���P��:�������̍X�V�J�E���g�擾
								String sCheckModify = new String(((AA0040020Struct)aCheckArraylist.get(cnt)).getw_MODIFY_COUNT());

								// ���X�g�̓��t�L�[�Z�b�g
								struct.setp_EFF_PHASE_IN_DATE(((AA0040020Struct)aCheckArraylist.get(cnt)).getp_EFF_PHASE_IN_DATE());

								//���R�[�h���b�N
								List modifyList = entity.mselectM_SBCNT_UNIT_COST_modify.read(conn, struct);

								// �O���P��:���݂̍X�V�J�E���g�擾
								String selectModify = new String(((AA0040020Struct)modifyList.get(0)).getw_MODIFY_COUNT());

								if( ! (selectModify.equals(sCheckModify) ) ){
									bRet = false;
									break;
								}
							}
						}else{
							bRet = false;
						}

						if(bRet == false){
							// �S�폜���s�F���Ƀ��R�[�h���X�V����Ă��܂��B[�P������]
							listMessage.add("M_SBCNT_UNIT_COST.VEND_CD:" + struct.getVEND_CD());
							listMessage.add("M_SBCNT_UNIT_COST.PLANT_CD:" + struct.getw_PLANT_CD());
							listMessage.add("M_SBCNT_UNIT_COST.ITEM_CD:" + struct.getITEM_CD());
							listMessage.add("M_SBCNT_UNIT_COST.PROC_CD:" + struct.getPROC_CD());
							listMessage.add("M_SBCNT_UNIT_COST.EFF_PHASE_IN_DATE:" + struct.getp_EFF_PHASE_IN_DATE());

							setErrorMessage("ZZ01105", listMessage);
						}
					}
				}

				//�G���[��������΍폜
				if(msgStruct.sizeError() <= 0) {
					entity.mdeleteM_SBCNT_UNIT_COST_H.delete(conn, struct);
					entity.mdeleteM_SBCNT_UNIT_COST_deleteAll.delete(conn, struct);

					//�Č���
					struct.keycopy(_keyStruct);
					controlselect();
				}
				}

	            // �p�����[�^�u�O���P�����F�v��1�̂Ƃ�
				if ("1".equals(struct.geth_APR_SBCNT_UNIT_COST())) {
					List tempList = entity.mselectM_SBCNT_UNIT_COST.read(conn,struct);
					AA0040020Struct tempStruct = new AA0040020Struct();
					for(int i =0 ;i<tempList.size();i++){
						tempStruct = (AA0040020Struct)tempList.get(i);
						struct.copy(tempStruct);
						insertAppr("delete");
						if(msgStruct.hasError()){
							return ;
						}
					}
					struct.keycopy(_keyStruct);
					insertAppr_Head("delete");
				}
				if(!msgStruct.hasError()){
					// �R�~�b�g
					conn.commit();
					if("1".equals(struct.geth_APR_SBCNT_UNIT_COST())){
						setInfoMessage("AZ00042");
					}
					transFlg = false;
				}
			}catch(SQLException e){
				setSqlExceptionMsg(e);

			}finally{
				try {
					if(transFlg == true){
						// ���[���o�b�N
						conn.rollback();
					}
				} catch(Exception e) {
					e.printStackTrace();
				}
			}

		//------------------------------------------------------------------
                //}}user_implement_dev:<controldelete>
		logger.exiting("AA0040020Control"+":USER="+struct.getsUser_ID(),"controldelete");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0040");
		logger.entering("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
		//------------------------------------------------------------------
		// ������
		_deployList.clear();
		_keyStruct.clear();
		struct.clear();

		// �p�����[�^�u�O���P�����F�v���擾����
        struct.seth_APR_SBCNT_UNIT_COST(_APR_SBCNT_UNIT_COST);

		// ���[�h�ݒ�
		setReadStatus(INITIAL);
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlcancelSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0040");
		logger.entering("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlcancelSub1");
			//{{user_implement_dev:<controlcancelSub1>
		//------------------------------------------------------------------
		struct.copy(_keyStruct);

		//�Č���
		controlselect();
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlcancelSub1>
		logger.exiting("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlcancelSub1");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub1Insert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0040");
		logger.entering("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlsub1Insert");
			//{{user_implement_dev:<controlsub1Insert>
		//------------------------------------------------------------------
			List listMessage = new ArrayList();
			boolean transFlg = false;

			try{
				// �g�����U�N�V�����J�n
				conn.beginTransWeb();
				transFlg = true;
				// �w�b�_�[���̍폜�˗������`�F�b�N
				if(checkApprDel()) {
					return;
				}
				boolean result = false;	 // �`�F�b�N���ʊi�[�p					
				
				// �O���P���}�X�^�̑��݃`�F�b�N
				result = entity.mcheckM_SBCNT_UNIT_COST.check(conn, struct);
				if(result == true){
					//�O���P�������ɓo�^�ς�
					listMessage.add("M_SBCNT_UNIT_COST.COMPANY_CD:" + _COMPANY_CD);
					listMessage.add("M_SBCNT_UNIT_COST.VEND_CD:" + struct.getVEND_CD());
					listMessage.add("M_SBCNT_UNIT_COST.PLANT_CD:" + struct.getw_PLANT_CD());
					listMessage.add("M_SBCNT_UNIT_COST.ITEM_CD:" + struct.getITEM_CD());
					listMessage.add("M_SBCNT_UNIT_COST.PROC_CD:" + struct.getPROC_CD());
					listMessage.add("M_SBCNT_UNIT_COST.EFF_PHASE_IN_DATE:" + struct.getp_EFF_PHASE_IN_DATE());
					
					setErrorMessage("ZZ01102", listMessage);
					return ;

				}
				
				// �O���P���w�b�_�̑��݃`�F�b�N
				result = entity.mcheckM_SBCNT_UNIT_COST_H.check(conn,struct);
				if(result == false){
					//�p�����[�^�u�O���P�����F�v��0�̎�
					if("0".equals(struct.geth_APR_SBCNT_UNIT_COST())){
						entity.minsertM_SBCNT_UNIT_COST_H.create(conn,struct);
					}else{
						insertAppr_Head("insert");
						if(msgStruct.hasError()){
							msgStruct.clearError();
						}
					}
				}
				
				//�p�����[�^�u�O���P�����F�v��0�̎�
				if("0".equals(struct.geth_APR_SBCNT_UNIT_COST())){
					entity.minsertM_SBCNT_UNIT_COST.create(conn, struct);
					struct.keycopy(_keyStruct);
					
				}
				// �p�����[�^�u�O���P�����F�v���P�̎�
				if("1".equals(struct.geth_APR_SBCNT_UNIT_COST())){
					// ���F���̓o�^
					insertAppr("insert");
				}
				if(!msgStruct.hasError()){
					conn.commit();
					if("1".equals(struct.geth_APR_SBCNT_UNIT_COST())){
						setInfoMessage("AZ00042");
					}
					// �Č���
					controlselect();
					transFlg = false;
				}
			} catch(SQLException e) {
				setSqlExceptionMsg(e);
			}finally{
				try {
					if(transFlg == true){
						// ���[���o�b�N
						conn.rollback();
					}

				} catch(Exception e) {
					e.printStackTrace();
				}
			}

		//------------------------------------------------------------------
                //}}user_implement_dev:<controlsub1Insert>
		logger.exiting("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlsub1Insert");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub1Update() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0040");
		logger.entering("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlsub1Update");
			//{{user_implement_dev:<controlsub1Update>
		//------------------------------------------------------------------
			List listMessage = new ArrayList();
			boolean transFlg = false;

			try{

				// �g�����U�N�V�����J�n
				conn.beginTransWeb();
				transFlg = true;

				//���H������擾
				String prosessingCost = new String();
				prosessingCost = struct.getp_PROCESSING_COST();

				if(prosessingCost.length() == 0){
					struct.setp_PROCESSING_COST("0");
				}

				//�ޗ���
				String materialCost = new String();
				materialCost = struct.getp_MATERIAL_COST();

				if(materialCost.length() == 0){
					struct.setp_MATERIAL_COST("0");
				}

				//���̑��o��
				String otherOverheads = new String();
				otherOverheads = struct.getp_OTHER_OVERHEADS();

				if(otherOverheads.length() == 0){
					struct.setp_OTHER_OVERHEADS("0");
				}
				
				boolean result = false;
				// ���X�g��ModifyCount���擾
				String modifyCount = new String(struct.getw_MODIFY_COUNT());
				List modifyList = null;
				
				//���݂̃��R�[�h�X�V�J�E���g�`�F�b�N
				modifyList = entity.mselectM_SBCNT_UNIT_COST_modify.read(conn, struct);
				if (modifyList.size() > 0) {
					// ���݂̍X�V�J�E���g�擾
					String modifySelect = new String(((AA0040020Struct) modifyList.get(0)).getw_MODIFY_COUNT());
					// �X�V�J�E���g�̃`�F�b�N
					if (modifyCount.equals(modifySelect) == false) {
						// �s�X�V�������s�F���Ƀ��R�[�h���X�V����Ă��܂�
						listMessage.add("M_SBCNT_UNIT_COST.VEND_CD:" + struct.getVEND_CD());
						listMessage.add("M_SBCNT_UNIT_COST.PLANT_CD:" + struct.getw_PLANT_CD());
						listMessage.add("M_SBCNT_UNIT_COST.ITEM_CD:" + struct.getITEM_CD());
						listMessage.add("M_SBCNT_UNIT_COST.PROC_CD:" + struct.getPROC_CD());
						listMessage.add("M_SBCNT_UNIT_COST.EFF_PHASE_IN_DATE:" + struct.getp_EFF_PHASE_IN_DATE());
						
						setErrorMessage("ZZ01105", listMessage);
						return ;
					}
				} else {
					// �s�X�V�������s�F���������Ɉ�v����f�[�^�͑��݂��܂���ł���
					listMessage.add("M_SBCNT_UNIT_COST.VEND_CD:" + struct.getVEND_CD());
					listMessage.add("M_SBCNT_UNIT_COST.PLANT_CD:" + struct.getw_PLANT_CD());
					listMessage.add("M_SBCNT_UNIT_COST.ITEM_CD:" + struct.getITEM_CD());
					listMessage.add("M_SBCNT_UNIT_COST.PROC_CD:" + struct.getPROC_CD());
					listMessage.add("M_SBCNT_UNIT_COST.EFF_PHASE_IN_DATE:" + struct.getp_EFF_PHASE_IN_DATE());

					setErrorMessage("ZZ06001", listMessage);
					return ;
				}
				// �G���[��������Ύ��s
				// �p�����[�^�u�O���P�����F�v���O
				if ("0".equals(struct.geth_APR_SBCNT_UNIT_COST())) {
		            // �p�����[�^�u�O���P�����F�v��0�̂Ƃ�
					entity.mupdateM_SBCNT_UNIT_COST.update(conn, struct);
					struct.keycopy(_keyStruct);
				}
	            // �p�����[�^�u�O���P�����F�v��1�̂Ƃ�
				if ("1".equals(struct.geth_APR_SBCNT_UNIT_COST())) {
					insertAppr("update");
					struct.keycopy(_keyStruct);
				}
				if(!msgStruct.hasError()){
					conn.commit();
					if("1".equals(struct.geth_APR_SBCNT_UNIT_COST())){
						setInfoMessage("AZ00042");
					}
					// �Č���
					controlselect();
					transFlg = false;
				}
			}catch(SQLException e){
				setSqlExceptionMsg(e);

			}finally{
				try {
					if(transFlg == true){
						// ���[���o�b�N
						conn.rollback();
					}

				} catch(Exception e) {
					e.printStackTrace();
				}
			}

		//------------------------------------------------------------------
                //}}user_implement_dev:<controlsub1Update>
		logger.exiting("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlsub1Update");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0040");
		logger.entering("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>

		// �p�����[�^�u�O���P�����F�v���擾����
        initalparameter();
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0040");
		logger.entering("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		//------------------------------------------------------------------

			try{

				// �R���{�{�b�N�X�f�[�^�p��
				ComboBox comboController = new ComboBox(conn, sysUSER_CD);

				//�P���敪
				_CONS_UNIT_COST = comboController.getData("UNIT_COST_TYP");
				//�i�ڎ�z�敪
				_MRP_ODR_TYP  = comboController.getData("MRP_ODR_TYP");
				//���O�쐬�敪
				_OUTSIDE_TYP = comboController.getData("OUTSIDE_TYP");

				// �p�����[�^�u�O���P�����F�v���擾����
		        initalparameter();

				// �L�[���擾
		        if("1".equals(struct.geth_APR_SBCNT_UNIT_COST()) && this.isScreenMove() && null != struct.geth_SCREENMOVE_TYP()){
					getKey();
				}
		        //�O���P�������e����̑J�ڂ̏ꍇ
		        if(this.isScreenMove() && "AA0140020".equals(this.getScreenId())){
		        	struct.setw_PLANT_CD(_w_PLANT_CD);
		        }

			}catch(SQLException e){
				setSqlExceptionMsg(e);
			}catch(ComboException e){
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				ExpjException ee = new ExpjException(e, emsg);
				
				throw ee;

			}

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0040");
		logger.entering("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
//		      struct.setDOWNLOAD_FILE((String)null);
			// �R���{�{�b�N�X���i�̃f�[�^�̃Z�b�g�͂����ɋL�q���Ă��������B
			// �R���{�{�b�N�X�f�[�^�p��

                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AA0040020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("modify") ) {
				controlmodify();
			} else if( button.equals("copy") ) {
				controlcopy();
			} else if( button.equals("erase") ) {
				controlerase();
			} else if( button.equals("update") ) {
				controlupdate();
			} else if( button.equals("delete") ) {
				controldelete();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("cancelSub1") ) {
				controlcancelSub1();
			} else if( button.equals("sub1Insert") ) {
				controlsub1Insert();
			} else if( button.equals("sub1Update") ) {
				controlsub1Update();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
			//------------------------------------------------------------------
			// 2003/09/03 Y.Mitsui
			//------------------------------------------------------------------
			struct.setList_p_UNIT_COST_TYP_val(_CONS_UNIT_COST.getValList());
			struct.setList_p_UNIT_COST_TYP_name(_CONS_UNIT_COST.getExplanList());

                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// �g���b�Z�[�W�o�͈˗��쐬
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AA0040020Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0040020-E999","CSV�̏o�͏���"));
			throw new FoundationException("AA0040020Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0040020-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AA0040020Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0040020-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AA0040020Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AA0040020Entity entity;
	protected AA0040020Struct struct;
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

		entity = new AA0040020Entity();
		struct = new AA0040020Struct();

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
	 * AA0040020�N���X�̕W���R���X�g���N�^
	 */
	public AA0040020Control() throws BusinessProcessException, FoundationException
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
				AA0040020Struct key = (AA0040020Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("p_UNIT_COST_TYP_name") && key.getp_UNIT_COST_TYP_name() != null) {
					msgKey.setKeyValue("p_UNIT_COST_TYP_name", key.getp_UNIT_COST_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("p_UNIT_COST_TYP_val") && key.getp_UNIT_COST_TYP_val() != null) {
					msgKey.setKeyValue("p_UNIT_COST_TYP_val", key.getp_UNIT_COST_TYP_val().toString());
				}
				if(msgKeyType.containsKeyColumn("p_UNIT_COST_NAME") && key.getp_UNIT_COST_NAME() != null) {
					msgKey.setKeyValue("p_UNIT_COST_NAME", key.getp_UNIT_COST_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_MRP_ODR_NAME") && key.getw_MRP_ODR_NAME() != null) {
					msgKey.setKeyValue("w_MRP_ODR_NAME", key.getw_MRP_ODR_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_OUTSIDE_NAME") && key.getw_OUTSIDE_NAME() != null) {
					msgKey.setKeyValue("w_OUTSIDE_NAME", key.getw_OUTSIDE_NAME());
				}
				if(msgKeyType.containsKeyColumn("h_SCREENMOVE_TYP") && key.geth_SCREENMOVE_TYP() != null) {
					msgKey.setKeyValue("h_SCREENMOVE_TYP", key.geth_SCREENMOVE_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_APPR_ID") && key.geth_APPR_ID() != null) {
					msgKey.setKeyValue("h_APPR_ID", key.geth_APPR_ID());
				}
				if(msgKeyType.containsKeyColumn("APPR_REMARKS") && key.getAPPR_REMARKS() != null) {
					msgKey.setKeyValue("APPR_REMARKS", key.getAPPR_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("p_APPR_REMARKS") && key.getp_APPR_REMARKS() != null) {
					msgKey.setKeyValue("p_APPR_REMARKS", key.getp_APPR_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("h_APR_SBCNT_UNIT_COST") && key.geth_APR_SBCNT_UNIT_COST() != null) {
					msgKey.setKeyValue("h_APR_SBCNT_UNIT_COST", key.geth_APR_SBCNT_UNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("h_VEND_ITEM_CD_1") && key.geth_VEND_ITEM_CD_1() != null) {
					msgKey.setKeyValue("h_VEND_ITEM_CD_1", key.geth_VEND_ITEM_CD_1());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_CD") && key.getw_PLANT_CD() != null) {
					msgKey.setKeyValue("w_PLANT_CD", key.getw_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("w_RECORD_COUNT") && key.getw_RECORD_COUNT() != null) {
					msgKey.setKeyValue("w_RECORD_COUNT", key.getw_RECORD_COUNT().toString());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("DRAW_CD") && key.getDRAW_CD() != null) {
					msgKey.setKeyValue("DRAW_CD", key.getDRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("SPEC") && key.getSPEC() != null) {
					msgKey.setKeyValue("SPEC", key.getSPEC());
				}
				if(msgKeyType.containsKeyColumn("w_MRP_ODR_TYP") && key.getw_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("w_MRP_ODR_TYP", key.getw_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_OUTSIDE_TYP") && key.getw_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("w_OUTSIDE_TYP", key.getw_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("PROC_CD") && key.getPROC_CD() != null) {
					msgKey.setKeyValue("PROC_CD", key.getPROC_CD());
				}
				if(msgKeyType.containsKeyColumn("PROC_NAME") && key.getPROC_NAME() != null) {
					msgKey.setKeyValue("PROC_NAME", key.getPROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_ANAME") && key.getVEND_ANAME() != null) {
					msgKey.setKeyValue("VEND_ANAME", key.getVEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("CUR_CD") && key.getCUR_CD() != null) {
					msgKey.setKeyValue("CUR_CD", key.getCUR_CD());
				}
				if(msgKeyType.containsKeyColumn("ROUND_TYP") && key.getROUND_TYP() != null) {
					msgKey.setKeyValue("ROUND_TYP", key.getROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("CUR_NAME") && key.getCUR_NAME() != null) {
					msgKey.setKeyValue("CUR_NAME", key.getCUR_NAME());
				}
				if(msgKeyType.containsKeyColumn("DECIMAL_FIG") && key.getDECIMAL_FIG() != null) {
					msgKey.setKeyValue("DECIMAL_FIG", key.getDECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("VEND_ITEM_CD") && key.getVEND_ITEM_CD() != null) {
					msgKey.setKeyValue("VEND_ITEM_CD", key.getVEND_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("w_MODIFY_COUNT_H") && key.getw_MODIFY_COUNT_H() != null) {
					msgKey.setKeyValue("w_MODIFY_COUNT_H", key.getw_MODIFY_COUNT_H());
				}
				if(msgKeyType.containsKeyColumn("p_EFF_PHASE_IN_DATE") && key.getp_EFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("p_EFF_PHASE_IN_DATE", key.getp_EFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("p_UNIT_COST") && key.getp_UNIT_COST() != null) {
					msgKey.setKeyValue("p_UNIT_COST", key.getp_UNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("p_UNIT_COST_TYP") && key.getp_UNIT_COST_TYP() != null) {
					msgKey.setKeyValue("p_UNIT_COST_TYP", key.getp_UNIT_COST_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("p_PROCESSING_COST") && key.getp_PROCESSING_COST() != null) {
					msgKey.setKeyValue("p_PROCESSING_COST", key.getp_PROCESSING_COST());
				}
				if(msgKeyType.containsKeyColumn("p_MATERIAL_COST") && key.getp_MATERIAL_COST() != null) {
					msgKey.setKeyValue("p_MATERIAL_COST", key.getp_MATERIAL_COST());
				}
				if(msgKeyType.containsKeyColumn("p_OTHER_OVERHEADS") && key.getp_OTHER_OVERHEADS() != null) {
					msgKey.setKeyValue("p_OTHER_OVERHEADS", key.getp_OTHER_OVERHEADS());
				}
				if(msgKeyType.containsKeyColumn("w_MODIFY_COUNT") && key.getw_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("w_MODIFY_COUNT", key.getw_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("p_PLANT_CD") && key.getp_PLANT_CD() != null) {
					msgKey.setKeyValue("p_PLANT_CD", key.getp_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("p_USER_CD") && key.getp_USER_CD() != null) {
					msgKey.setKeyValue("p_USER_CD", key.getp_USER_CD());
				}
				if(msgKeyType.containsKeyColumn("p_BUSINESS_DATE") && key.getp_BUSINESS_DATE() != null) {
					msgKey.setKeyValue("p_BUSINESS_DATE", key.getp_BUSINESS_DATE());
				}
				if(msgKeyType.containsKeyColumn("p_VALUE") && key.getp_VALUE() != null) {
					msgKey.setKeyValue("p_VALUE", key.getp_VALUE());
				}
				if(msgKeyType.containsKeyColumn("p_NAME") && key.getp_NAME() != null) {
					msgKey.setKeyValue("p_NAME", key.getp_NAME());
				}
				if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE") && key.getEFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("EFF_PHASE_IN_DATE", key.getEFF_PHASE_IN_DATE());
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
					AA0040020Struct key = new AA0040020Struct();
					if(msgKeyType.containsKeyColumn("p_UNIT_COST_TYP_name")) {
						key.setp_UNIT_COST_TYP_name(msgKey.getKeyValue("p_UNIT_COST_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("p_UNIT_COST_TYP_val")) {
						key.setp_UNIT_COST_TYP_val(new Integer(msgKey.getKeyValue("p_UNIT_COST_TYP_val")));
					}
					if(msgKeyType.containsKeyColumn("p_UNIT_COST_NAME")) {
						key.setp_UNIT_COST_NAME(msgKey.getKeyValue("p_UNIT_COST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_MRP_ODR_NAME")) {
						key.setw_MRP_ODR_NAME(msgKey.getKeyValue("w_MRP_ODR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_OUTSIDE_NAME")) {
						key.setw_OUTSIDE_NAME(msgKey.getKeyValue("w_OUTSIDE_NAME"));
					}
					if(msgKeyType.containsKeyColumn("h_SCREENMOVE_TYP")) {
						key.seth_SCREENMOVE_TYP(msgKey.getKeyValue("h_SCREENMOVE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_APPR_ID")) {
						key.seth_APPR_ID(msgKey.getKeyValue("h_APPR_ID"));
					}
					if(msgKeyType.containsKeyColumn("APPR_REMARKS")) {
						key.setAPPR_REMARKS(msgKey.getKeyValue("APPR_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("p_APPR_REMARKS")) {
						key.setp_APPR_REMARKS(msgKey.getKeyValue("p_APPR_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("h_APR_SBCNT_UNIT_COST")) {
						key.seth_APR_SBCNT_UNIT_COST(msgKey.getKeyValue("h_APR_SBCNT_UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("h_VEND_ITEM_CD_1")) {
						key.seth_VEND_ITEM_CD_1(msgKey.getKeyValue("h_VEND_ITEM_CD_1"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_CD")) {
						key.setw_PLANT_CD(msgKey.getKeyValue("w_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_RECORD_COUNT")) {
						key.setw_RECORD_COUNT(new Integer(msgKey.getKeyValue("w_RECORD_COUNT")));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DRAW_CD")) {
						key.setDRAW_CD(msgKey.getKeyValue("DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("SPEC")) {
						key.setSPEC(msgKey.getKeyValue("SPEC"));
					}
					if(msgKeyType.containsKeyColumn("w_MRP_ODR_TYP")) {
						key.setw_MRP_ODR_TYP(msgKey.getKeyValue("w_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_OUTSIDE_TYP")) {
						key.setw_OUTSIDE_TYP(msgKey.getKeyValue("w_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROC_CD")) {
						key.setPROC_CD(msgKey.getKeyValue("PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROC_NAME")) {
						key.setPROC_NAME(msgKey.getKeyValue("PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_ANAME")) {
						key.setVEND_ANAME(msgKey.getKeyValue("VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("CUR_CD")) {
						key.setCUR_CD(msgKey.getKeyValue("CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ROUND_TYP")) {
						key.setROUND_TYP(msgKey.getKeyValue("ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CUR_NAME")) {
						key.setCUR_NAME(msgKey.getKeyValue("CUR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DECIMAL_FIG")) {
						key.setDECIMAL_FIG(msgKey.getKeyValue("DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("VEND_ITEM_CD")) {
						key.setVEND_ITEM_CD(msgKey.getKeyValue("VEND_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_MODIFY_COUNT_H")) {
						key.setw_MODIFY_COUNT_H(msgKey.getKeyValue("w_MODIFY_COUNT_H"));
					}
					if(msgKeyType.containsKeyColumn("p_EFF_PHASE_IN_DATE")) {
						key.setp_EFF_PHASE_IN_DATE(msgKey.getKeyValue("p_EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("p_UNIT_COST")) {
						key.setp_UNIT_COST(msgKey.getKeyValue("p_UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("p_UNIT_COST_TYP")) {
						key.setp_UNIT_COST_TYP(new Integer(msgKey.getKeyValue("p_UNIT_COST_TYP")));
					}
					if(msgKeyType.containsKeyColumn("p_PROCESSING_COST")) {
						key.setp_PROCESSING_COST(msgKey.getKeyValue("p_PROCESSING_COST"));
					}
					if(msgKeyType.containsKeyColumn("p_MATERIAL_COST")) {
						key.setp_MATERIAL_COST(msgKey.getKeyValue("p_MATERIAL_COST"));
					}
					if(msgKeyType.containsKeyColumn("p_OTHER_OVERHEADS")) {
						key.setp_OTHER_OVERHEADS(msgKey.getKeyValue("p_OTHER_OVERHEADS"));
					}
					if(msgKeyType.containsKeyColumn("w_MODIFY_COUNT")) {
						key.setw_MODIFY_COUNT(msgKey.getKeyValue("w_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("p_PLANT_CD")) {
						key.setp_PLANT_CD(msgKey.getKeyValue("p_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("p_USER_CD")) {
						key.setp_USER_CD(msgKey.getKeyValue("p_USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("p_BUSINESS_DATE")) {
						key.setp_BUSINESS_DATE(msgKey.getKeyValue("p_BUSINESS_DATE"));
					}
					if(msgKeyType.containsKeyColumn("p_VALUE")) {
						key.setp_VALUE(msgKey.getKeyValue("p_VALUE"));
					}
					if(msgKeyType.containsKeyColumn("p_NAME")) {
						key.setp_NAME(msgKey.getKeyValue("p_NAME"));
					}
					if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE")) {
						key.setEFF_PHASE_IN_DATE(msgKey.getKeyValue("EFF_PHASE_IN_DATE"));
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
