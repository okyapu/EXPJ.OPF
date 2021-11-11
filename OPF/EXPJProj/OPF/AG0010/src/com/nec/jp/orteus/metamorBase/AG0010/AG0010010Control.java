/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AG0010/src/com/nec/jp/orteus/metamorBase/AG0010/AG0010010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AG0010;

import com.nec.jp.orteus.metamorBase.AG0010.*;
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
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.LotCtrl;

import java.text.SimpleDateFormat;
import java.text.ParseException;
//------------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AG0010010Control
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
	private String lotctrl;
	protected List list;											// ���ʃ��X�g�̃C���X�^���X
	public List getList() { return this.list; }						// ���X�g��Ԃ��܂��B
	public void setList(List listname) { this.list = listname; }	// ���X�g���Z�b�g���܂��B
	public int getListsize() {										// ���X�g�^�̃T�C�Y��Ԃ��܂��B
		int nret = 0;
		if( this.list != null ) {nret = this.list.size();}
		return nret;
	}
//	public Object getListvalue(int x) { return this.list.get(x); }	// ���X�g�̒l��Ԃ��܂��B
	public AG0010010Struct getListvalue(int x) { return (AG0010010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AG0010010Struct getStruct() { return this.struct; }	// Struct��Ԃ��܂��B
	public AG0010010Struct createStruct() { return new AG0010010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AG0010010Struct)structname); }	// Struct���Z�b�g���܂��B
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


//---------- �L�[���̑ޔ����� ---------------------------------------------------

	/** �L�[���ێ��ׂ̈�Struct */
	private AG0010010Struct _keyStruct = new AG0010010Struct();

	/** �L�[���Struct�̎擾 */
	public AG0010010Struct getKeyStruct(){ return _keyStruct; }
	
	/** �L�[���Struct�̐ݒ� */
	public void setKeyStruct(AG0010010Struct struct){ _keyStruct.copy(struct); }


//---------- �R���{�{�b�N�X�f�[�^�擾�֘A�̏��� -------------------------------

	/** �i�ڎ�z�敪 */
	ComboStruct _MRP_ODR_TYP = new ComboStruct();

	/** ��ʑJ�ڃp�����[�^�i�H��R�[�h�j */
	private String plantCd = null;
	
	/** ��ʑJ�ڃp�����[�^�i�i�ڔԍ��j */
	private String itemCd = null;
	
	/** ��ʑJ�ڃp�����[�^�i�ۊǋ�R�[�h�j */
	private String w_WH_CD = null;
	
	/** ���ɑJ�ڂ����ʂ�URL */
	private String _nextUrl = null;
	
	/** ���ɑJ�ڂ����ʂ�URLFlg */
	private String _nextUrlFlg = null;
	
	/** ��ʑJ�ڃp�����[�^*/
	private String templot = null;
	
	/** ��ʑJ�ڃp�����[�^*/
	private String WH_NAME = null;
	
	
	/** ��ʑJ�ڃp�����[�^�i�H��R�[�h�j���擾���܂��B */
	public String getPlantCd() {
		return plantCd;
	}
	
	/** ��ʑJ�ڃp�����[�^�i�H��R�[�h�j��ݒ肵�܂��B */
	public void setPlantCd(String s) {
		plantCd = s;
	}
	
	/** ��ʑJ�ڃp�����[�^�i�i�ڔԍ��j���擾���܂��B */
	public String getItemCd() {
		return itemCd;
	}
	
	/** ��ʑJ�ڃp�����[�^�i�i�ڔԍ��j��ݒ肵�܂��B */
	public void setItemCd(String s) {
		itemCd = s;
	}
	
	/** ��ʑJ�ڃp�����[�^�i�ۊǋ�R�[�h�j���擾���܂��B */
	public String getWh_Cd() {
		return w_WH_CD;
	}
	
	/**
	 * ��ʑJ�ڃL�[(�ۊǋ�R�[�h)�ݒ�
	 * @param cd �ۊǋ�R�[�h
	 */
	public void setWh_Cd(String cd) {
		w_WH_CD = cd;
	}
	
	/** ��ʑJ�ڃp�����[�^���擾���܂��B */
	public String getWH_NAME() {
		return WH_NAME;
	}
	
	/**
	 * ��ʑJ�ڃp�����[�^�ݒ�
	 */
	public void setWH_NAME(String cd) {
		WH_NAME = cd;
	}
	
	/** ��ʑJ�ڃp�����[�^���擾���܂��B */
	public String gettemplot() {
		return templot;
	}
	
	/**
	 * ��ʑJ�ڃp�����[�^�ݒ�
	 */
	public void settemplot(String cd) {
		templot = cd;
	}
	
	/**
	 * ���ɑJ�ڂ����ʂ�URL���擾���܂��B
	 */
	public String getNextUrl() {
		return _nextUrl;
	}
	
	/**
	 * ���ɑJ�ڂ����ʂ�URL��ݒ肵�܂��B
	 */
	public void setNextUrl(String url) {
		_nextUrl = url;
	}
	
	/** �i�ڎ�z�敪�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setMRP_ODR_TYP_comb(ComboStruct combo){ _MRP_ODR_TYP = combo; }

	/** �i�ڎ�z�敪�擾
	 * @return �i�ڎ�z�敪�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getMRP_ODR_TYP_comb(){ return _MRP_ODR_TYP; }


	/** ���v�ʌv�Z�Ώۃt���O */
	ComboStruct _MRP_FLG = new ComboStruct();

	/** ���v�ʌv�Z�Ώۃt���O�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setMRP_FLG_comb(ComboStruct combo){ _MRP_FLG = combo; }

	/** ���v�ʌv�Z�Ώۃt���O�擾
	 * @return ���v�ʌv�Z�Ώۃt���O�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getMRP_FLG_comb(){ return _MRP_FLG; }
	
	/**
	 * ���ɑJ�ڂ����ʂ�URLFlg��ݒ肵�܂��B
	 */
	public String getnextUrlFlg() {
		return _nextUrlFlg;
	}
	/**
	 * ���ɑJ�ڂ����ʂ�URLFlg��ݒ肵�܂��B
	 */
	public void setnextUrlFlg(String urlFlg) {
		_nextUrlFlg = urlFlg;
	}

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
	private void setTypeValueAboutItem(AG0010010Struct s)
	{
		s.setMRP_ODR_NAME(getTypeName(_MRP_ODR_TYP,s.getMRP_ODR_TYP()));
	}
	/**
	 * �݌ɏ��̃t���O�̕\����ݒ�
	 * @param s �t���O�̒l���ݒ肳��Ă�����
	 */
	private void setTypeValueAboutStock(AG0010010Struct s)
	{
		s.setMRP_NAME(getTypeName(_MRP_FLG,s.getMRP_FLG()));
	}

//------------------------------------------------------------------------

	/** ���[�U��`�̏������σt���O */
	private boolean _usersIntialized = false;

	/**
	 * ���[�U��` ����������
	 */
	private void usersInitialize() throws ExpjException
	{
		if(_usersIntialized) return;

		// �R���{�f�[�^�̎擾
		setComboData(struct);
		// ���ɑJ�ڂ����ʂ�URLFlg
		setnextUrlFlg("1");
		_usersIntialized = true;
		return ;
	}


//------------------------------------------------------------------------
	/**
	 * �R���{�{�b�N�X�̒��g���擾���܂��B
	 *
	 * @param data �f�[�^�̔�
	 */
	 private void setComboData(AG0010010Struct data) throws ExpjException
	 {
		ComboBox comboController = new ComboBox(conn, sysUSER_CD);
		try{
			//�R���{�f�[�^�̎擾
			ComboStruct MRP_ODR_TYP_comb = comboController.getData("MRP_ODR_TYP");
			ComboStruct MRP_FLG_comb = comboController.getData("MRP_FLG");

			comboController.setConnection(null);

			//�����Ɏ擾�f�[�^�ݒ�
			setMRP_ODR_TYP_comb(MRP_ODR_TYP_comb);
			setMRP_FLG_comb(MRP_FLG_comb);

		}catch(SQLException e) {
			setSqlExceptionMsg(e);

		}catch(ComboException e){
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}
	}


//------------------------------------------------------------------------
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
	 * �G���[���b�Z�[�W�ݒ�
	 * @param ���b�Z�[�W�ԍ�
	 * @param �o�̓��b�Z�[�W
	 */
	private void setErrorMessage(String messageno, String message)
	{
		ExpjMessage emsg = new ExpjMessage( messageno );
		msgStruct.addError( emsg );
		sysLog.warning(emsg, getsysUSER_CD());
		emsg = new ExpjMessage( "ZZ01006", message );
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
	 * �G���[���b�Z�[�W�ݒ�
	 * @param ���b�Z�[�W�ԍ�
	 * @param �o�̓��b�Z�[�W
	 * @param �u��������P
	 */
	private void setErrorMessage(String messageno, String message, String value1)
	{
		ExpjMessage emsg = new ExpjMessage( messageno , value1 );
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
		ExpjMessage emsg = new ExpjMessage( messageno );
		msgStruct.addWarn( emsg );
		sysLog.info(emsg, getsysUSER_CD());
		emsg = new ExpjMessage( "ZZ01006", message );
		msgStruct.addWarn( emsg );
		sysLog.info(emsg, getsysUSER_CD());
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
		sysLog.config(emsg, getsysUSER_CD());
		emsg = new ExpjMessage( "ZZ01006", message );
		msgStruct.addInfo( emsg );
		sysLog.config(emsg, getsysUSER_CD());
	}
		
	/**
	 * ���O���b�Z�[�W�ݒ�
	 * @param ���b�Z�[�W�ԍ�
	 * @param �o�̓��b�Z�[�W
	 */
	private void setSyslogConfig(String message)
	{
		ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
		sysLog.config(emsg, getsysUSER_CD());
	}


//------------------------------------------------------------------------
	/**
	 * �q��ʂ̈ꗗ�\�̕\���ő�s�������`�F�b�N�iservlet����Ă΂��j
	 *
	 * @return �Ȃ�
	 */
	public void maxLineCheck(int max) throws BusinessProcessException, FoundationException
	{
		// �\���ő�s����������
		ScreenParam sp = new ScreenParam(this.getClass());
		int maxLine = sp.getMaxLine(conn,max);
		if(maxLine != 0 && this.list.size() > maxLine){
			this.list.clear();
			setErrorMessage("ZZ01115", "", ""+maxLine);
		}
	}

//------------------------------------------------------------------------------
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0010");
		logger.entering("AG0010010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
		//------------------------------------------------------------------
		// ���O�o�͏��i�[�p
		String logMessage = "";
		List listMessage = new ArrayList();

		try {

			// �L�[���ڃ��O�\��
			logMessage = "ITEM_CD:" + struct.getw_ITEM_CD()
					+ ", PLANT_CD:" + struct.getw_PLANT_CD();
			setSyslogConfig(logMessage);

			// ���X�g�N���A
			if(list != null){
				list.clear();
			}
			
			// �݌Ƀf�[�^���݃`�F�b�N�p
			Integer checkitem = new Integer(0);
			Integer checkjob = new Integer(0);

			// �G���[�`�F�b�N
			// �H��R�[�h���w�肳�ꂽ�ꍇ
			if(struct.getw_PLANT_CD() != null && ("").equals(struct.getw_PLANT_CD()) == false){
				// �H��R�[�h�̑��݃`�F�b�N
				List tmpList = entity.mcheckM_PLANT.read(conn, struct);
				if(tmpList.size() <= 0) {
					// �Ǎ��������s�F�H��R�[�h�����݂��܂���
					logMessage = "M_PLANT.PLANT_CD:" + struct.getw_PLANT_CD();
					setErrorMessage("AG00001", logMessage);
				}
				else{
					AG0010010Struct tmpStruct = (AG0010010Struct)tmpList.get(0);
					struct.setw_PLANT_NAME(tmpStruct.getw_PLANT_NAME());
				}
			}
			// �i�ڔԍ��̑��݃`�F�b�N
			List workList = entity.mselect.read(conn, struct);
			if(workList.size() <= 0) {
				// �Ǎ��������s�F�i�ڔԍ������݂��܂���
				logMessage = "M_ITEM.ITEM_CD:" + struct.getw_ITEM_CD();
				setErrorMessage("AG00003", logMessage);
			}

			// �f�[�^�Ǎ�
			if(msgStruct.sizeError() <= 0){
				// �i�ڃ}�X�^���
				if(workList.size() > 0) {
					AG0010010Struct workStruct = (AG0010010Struct)workList.get(0);
					struct.setw_ITEM_NAME(workStruct.getw_ITEM_NAME());
					struct.setDRAW_CD(workStruct.getDRAW_CD());
					struct.setSPEC(workStruct.getSPEC());
					struct.setMRP_ODR_TYP(workStruct.getMRP_ODR_TYP());
					setTypeValueAboutItem(struct);
					struct.setSTOCK_UNIT(workStruct.getSTOCK_UNIT());
				}
				// ���ۊǋ�ʕi�ڍ݌�
				workList = entity.mselectT_ITEM_STOCK.read(conn, struct);
				if(workList.size() > 0) {
					checkitem = new Integer(workList.size());
					AG0010010Struct workStruct = (AG0010010Struct)workList.get(0);
					struct.setw_ITEM_STOCK_QTY(workStruct.getw_ITEM_STOCK_QTY());
					struct.setw_ITEM_DEFECT_QTY(workStruct.getw_ITEM_DEFECT_QTY());
					struct.setw_ITEM_STOCK_QTY_LAST_DAY(workStruct.getw_ITEM_STOCK_QTY_LAST_DAY());
					struct.setw_ITEM_STOCK_QTY_LAST_MONTH(workStruct.getw_ITEM_STOCK_QTY_LAST_MONTH());
				}
				else{
					ExpjMessage emsg = new ExpjMessage( "AF00044" );
					sysLog.config(emsg, getsysUSER_CD());
					logMessage = "T_ITEM_STOCK.ITEM_CD:" + struct.getw_ITEM_CD()
							+ ", T_ITEM_STOCK.PLANT_CD:" + struct.getw_PLANT_CD();
					setSyslogConfig(logMessage);
				}
				// ���ۊǋ�ʐ��ԍ݌�
				workList = entity.mselectT_JOB_STOCK.read(conn, struct);
				if(workList.size() > 0) {
					checkjob = new Integer(workList.size());
					AG0010010Struct workStruct = (AG0010010Struct)workList.get(0);
					struct.setw_JOB_ODR_STOCK_QTY(workStruct.getw_JOB_ODR_STOCK_QTY());
					struct.setw_JOB_ODR_STOCK_QTY_LAST_DAY(workStruct.getw_JOB_ODR_STOCK_QTY_LAST_DAY());
					struct.setw_JOB_ODR_STOCK_QTY_LAST_MONTH(workStruct.getw_JOB_ODR_STOCK_QTY_LAST_MONTH());
				}
				else{
					ExpjMessage emsg = new ExpjMessage( "AF00045" );
					sysLog.config(emsg, getsysUSER_CD());
					logMessage = "T_JOB_ODR_CD_STOCK.ITEM_CD:" + struct.getw_ITEM_CD()
							+ ", T_JOB_ODR_CD_STOCK.PLANT_CD:" + struct.getw_PLANT_CD();
					setSyslogConfig(logMessage);
				}
				// �݌ɍ��v
				Calculate calculate = new Calculate();
				String s_QTY1 = new String(struct.getw_ITEM_STOCK_QTY());
				String s_QTY2 = new String(struct.getw_JOB_ODR_STOCK_QTY());
				struct.setw_TOTAL_STOCK_QTY(calculate.add(s_QTY1, s_QTY2));

				// �O�����݌ɍ��v
				s_QTY1 = new String(struct.getw_ITEM_STOCK_QTY_LAST_DAY());
				s_QTY2 = new String(struct.getw_JOB_ODR_STOCK_QTY_LAST_DAY());
				struct.setw_TOTAL_STOCK_QTY_LAST_DAY(calculate.add(s_QTY1, s_QTY2));

				// �S�����݌ɍ��v
				s_QTY1 = new String(struct.getw_ITEM_STOCK_QTY_LAST_MONTH());
				s_QTY2 = new String(struct.getw_JOB_ODR_STOCK_QTY_LAST_MONTH());
				struct.setw_TOTAL_STOCK_QTY_LAST_MONTH(calculate.add(s_QTY1, s_QTY2));

				// ���ۊǋ�ʕi�ڍ݌�(MRP�ΏہA�ΏۊO)
				workList = entity.mselectITEM_MRP_STOK.read(conn, struct);
				if(workList.size() > 0) {
					for(int i = 0; i < workList.size(); i++){
						AG0010010Struct workStruct = (AG0010010Struct)workList.get(i);
						if(workStruct.getMRP_FLG().intValue() == 1){
							struct.setw_ITEM_STOCK_QTY_FOR_MRP(workStruct.getw_ITEM_STOCK_QTY_FOR_MRP());
						}
						else{
							struct.setw_ITEM_STOCK_QTY_OUTSIDE_MRP(workStruct.getw_ITEM_STOCK_QTY_FOR_MRP());
						}
					}
				}
				// ���ۊǋ�ʐ��ԍ݌�(MRP�ΏہA�ΏۊO)
				workList = entity.mselectJOB_MRP_STOK.read(conn, struct);
				if(workList.size() > 0) {
					for(int i = 0; i < workList.size(); i++){
						AG0010010Struct workStruct = (AG0010010Struct)workList.get(i);
						if(workStruct.getMRP_FLG().intValue() == 1){
							struct.setw_JOB_ODR_STOCK_QTY_FOR_MRP(workStruct.getw_JOB_ODR_STOCK_QTY_FOR_MRP());
						}
						else{
							struct.setw_JOB_ODR_STOCK_QTY_OUTSIDE_MRP(workStruct.getw_JOB_ODR_STOCK_QTY_FOR_MRP());
						}
					}
				}

				// �݌Ƀf�[�^ 0���̏ꍇ
				if(checkitem.intValue() == 0 &&
				   checkjob.intValue() == 0){
					// �Ǎ������F�݌Ƀf�[�^�����݂��܂���
					listMessage.add("T_ITEM_STOCK.ITEM_CD:" + struct.getw_ITEM_CD());
					listMessage.add("T_JOB_ODR_CD_STOCK.ITEM_CD:" + struct.getw_ITEM_CD());
					setErrorMessage("ZZ06001", listMessage);
					listMessage.clear();
				}
			}


		}catch(SQLException e){
			setSqlExceptionMsg(e);
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AG0010010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * �݌ɏڍ׃{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlinventoryDetail() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0010");
		logger.entering("AG0010010Control"+":USER="+struct.getsUser_ID(),"controlinventoryDetail");
			//{{user_implement_dev:<controlinventoryDetail>
		//------------------------------------------------------------------
		// ���O�o�͏��i�[�p
		String logMessage = "";
		List listMessage = new ArrayList();
		setnextUrlFlg("1");

		try {

			// �L�[���ڃ��O�\��
			logMessage = "ITEM_CD:" + struct.getw_ITEM_CD()
					+ ", PLANT_CD:" + struct.getw_PLANT_CD();
			setSyslogConfig(logMessage);

			// ���X�g�N���A
			if(list != null){
				list.clear();
			}

			// �݌Ƀf�[�^���݃`�F�b�N�p
			Integer checkitem = new Integer(0);
			Integer checkjob = new Integer(0);

			// �G���[�`�F�b�N
			// �H��R�[�h���w�肳�ꂽ�ꍇ
			if(struct.getw_PLANT_CD() != null && ("").equals(struct.getw_PLANT_CD()) == false){
				// �H��R�[�h�̑��݃`�F�b�N
				List tmpList = entity.mcheckM_PLANT.read(conn, struct);
				if(tmpList.size() <= 0) {
					// �Ǎ��������s�F�H��R�[�h�����݂��܂���
					logMessage = "M_PLANT.PLANT_CD:" + struct.getw_PLANT_CD();
					setErrorMessage("AG00001", logMessage);
				}
			}
			// �i�ڔԍ��̑��݃`�F�b�N
			AG0010010Struct itemStruct = null;
			int maxLine = sp.getMaxLine(conn, 10);
			if(maxLine != 0) {
				struct.setROW_COUNT(String.valueOf(maxLine));
			} else {
				struct.setROW_COUNT(null);
			}
			
			List workList = entity.mselect.read(conn, struct);
			if(workList.size() <= 0) {
				// �Ǎ��������s�F�i�ڔԍ������݂��܂���
				logMessage = "M_ITEM.ITEM_CD:" + struct.getw_ITEM_CD();
				setErrorMessage("AG00003", logMessage);
			}else{
				itemStruct = (AG0010010Struct)(workList.get(0));
				struct.seth_lotFlg(itemStruct.getLOT_CTRL_FLG());
			}
			// �f�[�^�Ǎ�
			if(msgStruct.sizeError() <= 0){
				// �i�ڃ}�X�^���
				if(workList.size() > 0) {
					AG0010010Struct workStruct = (AG0010010Struct)workList.get(0);
					struct.setw_ITEM_NAME(workStruct.getw_ITEM_NAME());
					struct.setDRAW_CD(workStruct.getDRAW_CD());
					struct.setSPEC(workStruct.getSPEC());
					struct.setMRP_ODR_TYP(workStruct.getMRP_ODR_TYP());
					setTypeValueAboutItem(struct);
					struct.setSTOCK_UNIT(workStruct.getSTOCK_UNIT());
				}
				
				// �ۊǋ�ʕi�ڍ݌Ɂi���ׁj
				workList = entity.mselectSub1Cnt.read(conn, struct);
				long rowCount = Long.parseLong(((AG0010010Struct)workList.get(0)).getl_COUNT());
				if (rowCount == 0) {
					ExpjMessage emsg = new ExpjMessage( "AF00044" );
					sysLog.config(emsg, getsysUSER_CD());
					logMessage = "T_ITEM_STOCK.ITEM_CD:" + struct.getw_ITEM_CD()
							+ ", T_ITEM_STOCK.PLANT_CD:" + struct.getw_PLANT_CD();
					setSyslogConfig(logMessage);
					checkitem = new Integer(0);
				} else {
					if (maxLine != 0 && rowCount == maxLine + 1) {
						setErrorMessage("ZZ01115", "", ""+maxLine);
						setReadStatus(TOO_MANY);
						if(workList != null && workList.size() > 0){
							workList.clear(); 
							list.clear();
						}
						return;
					} else {
						workList = entity.mselectSub1.read(conn, struct);
						checkitem = new Integer(workList.size());
						for(int i = 0; i < workList.size(); i++){
							list.add((AG0010010Struct)workList.get(i));
						}
					}
					
				}
				// �ۊǋ�ʐ��ԍ݌Ɂi���ׁj
				workList = entity.mselectSub1_JOBCnt.read(conn, struct);
				long rowCount_Job = Long.parseLong(((AG0010010Struct)workList.get(0)).getl_COUNT());
				if(rowCount_Job == 0) {
					ExpjMessage emsg = new ExpjMessage( "AF00045" );
					sysLog.config(emsg, getsysUSER_CD());
					logMessage = "T_JOB_ODR_CD_STOCK.ITEM_CD:" + struct.getw_ITEM_CD()
							+ ", T_JOB_ODR_CD_STOCK.PLANT_CD:" + struct.getw_PLANT_CD();
					setSyslogConfig(logMessage);
					checkjob = new Integer(0);
				} else {
					if (maxLine != 0 && rowCount_Job + rowCount== maxLine + 1) {
						setErrorMessage("ZZ01115", "", ""+maxLine);
						setReadStatus(TOO_MANY);
						if(workList != null && workList.size() > 0){
							workList.clear();
							list.clear();
						}
						return;
					} else {
						workList = entity.mselectSub1_JOB.read(conn, struct);
						checkjob = new Integer(workList.size());
						for(int i = 0; i < workList.size(); i++){
							list.add((AG0010010Struct)workList.get(i));
						}
					}
					
				}
				// �t���O�̕\��������ݒ�
				for(int n = 0; n < list.size(); n++){
					setTypeValueAboutStock((AG0010010Struct)(list.get(n)));
				}

				// �݌Ƀf�[�^ 0���̏ꍇ
				if(checkitem.intValue() == 0 &&
				   checkjob.intValue() == 0){
					// �݌ɏڍ׏����F�݌Ƀf�[�^�Ȃ�
					setnextUrlFlg("0");
					listMessage.add("T_ITEM_STOCK.ITEM_CD:" + struct.getw_ITEM_CD());
					listMessage.add("T_JOB_ODR_CD_STOCK.ITEM_CD:" + struct.getw_ITEM_CD());
					setErrorMessage("ZZ06001", listMessage);
					listMessage.clear();
					
				}
			}

		}catch(SQLException e){
			setSqlExceptionMsg(e);
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlinventoryDetail>
		logger.exiting("AG0010010Control"+":USER="+struct.getsUser_ID(),"controlinventoryDetail");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0010");
		logger.entering("AG0010010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
		//------------------------------------------------------------------
		// ���X�g�N���A
		if(list != null){
			list.clear();
		}
		else{
			list = new ArrayList(0);
		}

		// ������
		struct.clear();
		struct.initialize();
		_keyStruct = new AG0010010Struct();

		// �H��R�[�h�ƍH�ꖼ���f�t�H���g�\��
		struct.setw_PLANT_CD(getsysPLANT_CD());

		//------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AG0010010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCloseSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0010");
		logger.entering("AG0010010Control"+":USER="+struct.getsUser_ID(),"controlCloseSub1");
			//{{user_implement_dev:<controlCloseSub1>
		//------------------------------------------------------------------
		// �e��ʃf�[�^�ēǍ�
		controlselect();
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlCloseSub1>
		logger.exiting("AG0010010Control"+":USER="+struct.getsUser_ID(),"controlCloseSub1");

		return;
	}

	/**
	 * ���b�g�ʏڍ׃{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlinventoryDetailsub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0010");
		logger.entering("AG0010010Control"+":USER="+struct.getsUser_ID(),"controlinventoryDetailsub1");
			//{{user_implement_dev:<controlinventoryDetailsub1>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		//-----------------------------------------------------------------------------------------
	    //���O�o�͏��i�[�p
	    String logMessage = "";
	    List listMessage = new ArrayList();
	    try{
	    	
	        //�L�[���ڃ��O�\��
			logMessage = "ITEM_CD:" + struct.getw_ITEM_CD()
					+ ", PLANT_CD:" + struct.getw_PLANT_CD();
			setSyslogConfig(logMessage);

			// ���X�g�N���A
			if(list != null){
				list.clear();
			}
			
            //�݌Ƀf�[�^���݃`�F�b�N�p
			Integer checkitem = new Integer(0);
		    //�ۊǋ�ʕi�ڍ݌Ɂi���ׁj						
			List workList = entity.mselectDetailsub1.read(conn,struct);
			
			if(workList.size() > 0) {
				checkitem = new Integer(workList.size());
				for(int i = 0; i < workList.size(); i++){
					list.add((AG0010010Struct)workList.get(i));
				}
			}
			else{
				ExpjMessage emsg = new ExpjMessage( "AF00044" );
				sysLog.config(emsg, getsysUSER_CD());
				logMessage = "T_LOT_STOCK.ITEM_CD:" + struct.getw_ITEM_CD() 
				             + "T_LOT_STOCK.WH_CD:" + struct.getw_WH_CD();
				setSyslogConfig(logMessage);
			}
			
			//�݌Ƀf�[�^ 0���̏ꍇ
			if(checkitem.intValue() == 0){
				controlinventoryDetail();
		        // �݌ɏڍ׏����F�݌Ƀf�[�^�Ȃ�
		        listMessage.add("T_LOT_STOCK.ITEM_CD:" + struct.getw_ITEM_CD());
			    listMessage.add("T_LOT_STOCK.WH_CD:" + struct.getw_WH_CD());
			    setErrorMessage("ZZ06001", listMessage);
			    listMessage.clear();		    
			}
	    	
	    }catch(SQLException e){
	       setSqlExceptionMsg(e);		    	
	    }		    
	//-----------------------------------------------------------------------------------------
                //}}user_implement_dev:<controlinventoryDetailsub1>
		logger.exiting("AG0010010Control"+":USER="+struct.getsUser_ID(),"controlinventoryDetailsub1");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCloseSub2() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0010");
		logger.entering("AG0010010Control"+":USER="+struct.getsUser_ID(),"controlCloseSub2");
			//{{user_implement_dev:<controlCloseSub2>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
	    //�݌ɎQ�ƃT�u1�f�[�^�ēǍ�
	    controlinventoryDetail();
                //}}user_implement_dev:<controlCloseSub2>
		logger.exiting("AG0010010Control"+":USER="+struct.getsUser_ID(),"controlCloseSub2");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0010");
		logger.entering("AG0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
		//------------------------------------------------------------------
		// ���[�U��`������
		usersInitialize();
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AG0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0010");
		logger.entering("AG0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		//------------------------------------------------------------------
		// ���[�U��`������
		usersInitialize();
		try {
			if(LotCtrl.checkLotCtrl(conn)){
			    struct.seth_lotCtrl("true");
			    lotctrl = "true";
			}else{
				struct.seth_lotCtrl("false");
				lotctrl = "false";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (isScreenMove() == true) {
			// ������
			struct.clear();
			struct.initialize();
			_keyStruct = new AG0010010Struct();
			struct.setw_PLANT_CD(plantCd);
			struct.setw_ITEM_CD(itemCd);

			if(templot.equals("0")){
			   controlselect();
			}else if(templot.equals("1")){
				struct.setw_WH_CD(w_WH_CD);
				struct.setWH_NAME(WH_NAME);
				controlselect();
				controlinventoryDetailsub1();
				struct.seth_screenflg("1");				
			}

		} else {
			// �H��R�[�h�ƍH�ꖼ���f�t�H���g�\��
			struct.setw_PLANT_CD(getsysPLANT_CD());
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AG0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0010");
		logger.entering("AG0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AG0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("inventoryDetail") ) {
				controlinventoryDetail();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("CloseSub1") ) {
				controlCloseSub1();
			} else if( button.equals("inventoryDetailsub1") ) {
				controlinventoryDetailsub1();
			} else if( button.equals("CloseSub2") ) {
				controlCloseSub2();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
		//------------------------------------------------------------------
		struct.setList_MRP_ODR_TYP_val(_MRP_ODR_TYP.getValList());
		struct.setList_MRP_ODR_TYP_name(_MRP_ODR_TYP.getExplanList());
		struct.setList_MRP_FLG_val(_MRP_FLG.getValList());
		struct.setList_MRP_FLG_name(_MRP_FLG.getExplanList());
		struct.seth_lotCtrl(lotctrl);

//		�\�[�X���ɂ܂�AlarmMessageException���c���Ă���ꍇ�́A�ȉ��̍s�̃R�����g���O����AlarmMessageException���n������B
//		} catch(AlarmMessageException ame){
//			ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
//			throw ee;
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
//			throw new FoundationException("AG0010010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AG0010010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AG0010010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AG0010010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AG0010010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AG0010010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AG0010010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AG0010010Entity entity;
	protected AG0010010Struct struct;
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

		entity = new AG0010010Entity();
		struct = new AG0010010Struct();

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
	 * AG0010010�N���X�̕W���R���X�g���N�^
	 */
	public AG0010010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
		//------------------------------------------------------------------
		list = new ArrayList(0);
        //------------------------------------------------------------------
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
				AG0010010Struct key = (AG0010010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("w_ITEM_STOCK_QTY_OUTSIDE_MRP") && key.getw_ITEM_STOCK_QTY_OUTSIDE_MRP() != null) {
					msgKey.setKeyValue("w_ITEM_STOCK_QTY_OUTSIDE_MRP", key.getw_ITEM_STOCK_QTY_OUTSIDE_MRP());
				}
				if(msgKeyType.containsKeyColumn("w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP") && key.getw_JOB_ODR_STOCK_QTY_OUTSIDE_MRP() != null) {
					msgKey.setKeyValue("w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP", key.getw_JOB_ODR_STOCK_QTY_OUTSIDE_MRP());
				}
				if(msgKeyType.containsKeyColumn("w_TOTAL_STOCK_QTY") && key.getw_TOTAL_STOCK_QTY() != null) {
					msgKey.setKeyValue("w_TOTAL_STOCK_QTY", key.getw_TOTAL_STOCK_QTY());
				}
				if(msgKeyType.containsKeyColumn("w_TOTAL_STOCK_QTY_LAST_DAY") && key.getw_TOTAL_STOCK_QTY_LAST_DAY() != null) {
					msgKey.setKeyValue("w_TOTAL_STOCK_QTY_LAST_DAY", key.getw_TOTAL_STOCK_QTY_LAST_DAY());
				}
				if(msgKeyType.containsKeyColumn("w_TOTAL_STOCK_QTY_LAST_MONTH") && key.getw_TOTAL_STOCK_QTY_LAST_MONTH() != null) {
					msgKey.setKeyValue("w_TOTAL_STOCK_QTY_LAST_MONTH", key.getw_TOTAL_STOCK_QTY_LAST_MONTH());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_NAME") && key.getMRP_ODR_NAME() != null) {
					msgKey.setKeyValue("MRP_ODR_NAME", key.getMRP_ODR_NAME());
				}
				if(msgKeyType.containsKeyColumn("MRP_NAME") && key.getMRP_NAME() != null) {
					msgKey.setKeyValue("MRP_NAME", key.getMRP_NAME());
				}
				if(msgKeyType.containsKeyColumn("h_lotCtrl") && key.geth_lotCtrl() != null) {
					msgKey.setKeyValue("h_lotCtrl", key.geth_lotCtrl());
				}
				if(msgKeyType.containsKeyColumn("h_lotFlg") && key.geth_lotFlg() != null) {
					msgKey.setKeyValue("h_lotFlg", key.geth_lotFlg());
				}
				if(msgKeyType.containsKeyColumn("h_screenflg") && key.geth_screenflg() != null) {
					msgKey.setKeyValue("h_screenflg", key.geth_screenflg());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_NAME") && key.getw_PLANT_NAME() != null) {
					msgKey.setKeyValue("w_PLANT_NAME", key.getw_PLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("s_PLANT_CD") && key.gets_PLANT_CD() != null) {
					msgKey.setKeyValue("s_PLANT_CD", key.gets_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_val") && key.getMRP_ODR_TYP_val() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_val", key.getMRP_ODR_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_name") && key.getMRP_ODR_TYP_name() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_name", key.getMRP_ODR_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("MRP_FLG_val") && key.getMRP_FLG_val() != null) {
					msgKey.setKeyValue("MRP_FLG_val", key.getMRP_FLG_val());
				}
				if(msgKeyType.containsKeyColumn("MRP_FLG_name") && key.getMRP_FLG_name() != null) {
					msgKey.setKeyValue("MRP_FLG_name", key.getMRP_FLG_name());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_NAME") && key.getw_ITEM_NAME() != null) {
					msgKey.setKeyValue("w_ITEM_NAME", key.getw_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("DRAW_CD") && key.getDRAW_CD() != null) {
					msgKey.setKeyValue("DRAW_CD", key.getDRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("SPEC") && key.getSPEC() != null) {
					msgKey.setKeyValue("SPEC", key.getSPEC());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG") && key.getLOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("LOT_CTRL_FLG", key.getLOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_CD") && key.getw_ITEM_CD() != null) {
					msgKey.setKeyValue("w_ITEM_CD", key.getw_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_CD") && key.getw_PLANT_CD() != null) {
					msgKey.setKeyValue("w_PLANT_CD", key.getw_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_STOCK_QTY") && key.getw_ITEM_STOCK_QTY() != null) {
					msgKey.setKeyValue("w_ITEM_STOCK_QTY", key.getw_ITEM_STOCK_QTY());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_DEFECT_QTY") && key.getw_ITEM_DEFECT_QTY() != null) {
					msgKey.setKeyValue("w_ITEM_DEFECT_QTY", key.getw_ITEM_DEFECT_QTY());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_STOCK_QTY_LAST_DAY") && key.getw_ITEM_STOCK_QTY_LAST_DAY() != null) {
					msgKey.setKeyValue("w_ITEM_STOCK_QTY_LAST_DAY", key.getw_ITEM_STOCK_QTY_LAST_DAY());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_STOCK_QTY_LAST_MONTH") && key.getw_ITEM_STOCK_QTY_LAST_MONTH() != null) {
					msgKey.setKeyValue("w_ITEM_STOCK_QTY_LAST_MONTH", key.getw_ITEM_STOCK_QTY_LAST_MONTH());
				}
				if(msgKeyType.containsKeyColumn("w_JOB_ODR_STOCK_QTY") && key.getw_JOB_ODR_STOCK_QTY() != null) {
					msgKey.setKeyValue("w_JOB_ODR_STOCK_QTY", key.getw_JOB_ODR_STOCK_QTY());
				}
				if(msgKeyType.containsKeyColumn("w_JOB_ODR_STOCK_QTY_LAST_DAY") && key.getw_JOB_ODR_STOCK_QTY_LAST_DAY() != null) {
					msgKey.setKeyValue("w_JOB_ODR_STOCK_QTY_LAST_DAY", key.getw_JOB_ODR_STOCK_QTY_LAST_DAY());
				}
				if(msgKeyType.containsKeyColumn("w_JOB_ODR_STOCK_QTY_LAST_MONTH") && key.getw_JOB_ODR_STOCK_QTY_LAST_MONTH() != null) {
					msgKey.setKeyValue("w_JOB_ODR_STOCK_QTY_LAST_MONTH", key.getw_JOB_ODR_STOCK_QTY_LAST_MONTH());
				}
				if(msgKeyType.containsKeyColumn("MRP_FLG") && key.getMRP_FLG() != null) {
					msgKey.setKeyValue("MRP_FLG", key.getMRP_FLG().toString());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_STOCK_QTY_FOR_MRP") && key.getw_ITEM_STOCK_QTY_FOR_MRP() != null) {
					msgKey.setKeyValue("w_ITEM_STOCK_QTY_FOR_MRP", key.getw_ITEM_STOCK_QTY_FOR_MRP());
				}
				if(msgKeyType.containsKeyColumn("w_JOB_ODR_STOCK_QTY_FOR_MRP") && key.getw_JOB_ODR_STOCK_QTY_FOR_MRP() != null) {
					msgKey.setKeyValue("w_JOB_ODR_STOCK_QTY_FOR_MRP", key.getw_JOB_ODR_STOCK_QTY_FOR_MRP());
				}
				if(msgKeyType.containsKeyColumn("w_WH_CD") && key.getw_WH_CD() != null) {
					msgKey.setKeyValue("w_WH_CD", key.getw_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("w_STOCK_ON_HAND_QTY") && key.getw_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("w_STOCK_ON_HAND_QTY", key.getw_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("w_DEFECT_QTY") && key.getw_DEFECT_QTY() != null) {
					msgKey.setKeyValue("w_DEFECT_QTY", key.getw_DEFECT_QTY());
				}
				if(msgKeyType.containsKeyColumn("w_PRVS_DAYEND_STOCK_QTY") && key.getw_PRVS_DAYEND_STOCK_QTY() != null) {
					msgKey.setKeyValue("w_PRVS_DAYEND_STOCK_QTY", key.getw_PRVS_DAYEND_STOCK_QTY());
				}
				if(msgKeyType.containsKeyColumn("w_PRVS_MONTHEND_STOCK_QTY") && key.getw_PRVS_MONTHEND_STOCK_QTY() != null) {
					msgKey.setKeyValue("w_PRVS_MONTHEND_STOCK_QTY", key.getw_PRVS_MONTHEND_STOCK_QTY());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("s2_PLANT_CD") && key.gets2_PLANT_CD() != null) {
					msgKey.setKeyValue("s2_PLANT_CD", key.gets2_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_PLANT_NAME") && key.getl_PLANT_NAME() != null) {
					msgKey.setKeyValue("l_PLANT_NAME", key.getl_PLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_LOT_NO") && key.getl_LOT_NO() != null) {
					msgKey.setKeyValue("l_LOT_NO", key.getl_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("l_STOCK_ON_HAND_QTY") && key.getl_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("l_STOCK_ON_HAND_QTY", key.getl_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ALCD_QTY") && key.getl_ALCD_QTY() != null) {
					msgKey.setKeyValue("l_ALCD_QTY", key.getl_ALCD_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_EXPIRATION_DATE") && key.getl_EXPIRATION_DATE() != null) {
					msgKey.setKeyValue("l_EXPIRATION_DATE", key.getl_EXPIRATION_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PRD_CMPLT_DATE") && key.getl_PRD_CMPLT_DATE() != null) {
					msgKey.setKeyValue("l_PRD_CMPLT_DATE", key.getl_PRD_CMPLT_DATE());
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
					AG0010010Struct key = new AG0010010Struct();
					if(msgKeyType.containsKeyColumn("w_ITEM_STOCK_QTY_OUTSIDE_MRP")) {
						key.setw_ITEM_STOCK_QTY_OUTSIDE_MRP(msgKey.getKeyValue("w_ITEM_STOCK_QTY_OUTSIDE_MRP"));
					}
					if(msgKeyType.containsKeyColumn("w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP")) {
						key.setw_JOB_ODR_STOCK_QTY_OUTSIDE_MRP(msgKey.getKeyValue("w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP"));
					}
					if(msgKeyType.containsKeyColumn("w_TOTAL_STOCK_QTY")) {
						key.setw_TOTAL_STOCK_QTY(msgKey.getKeyValue("w_TOTAL_STOCK_QTY"));
					}
					if(msgKeyType.containsKeyColumn("w_TOTAL_STOCK_QTY_LAST_DAY")) {
						key.setw_TOTAL_STOCK_QTY_LAST_DAY(msgKey.getKeyValue("w_TOTAL_STOCK_QTY_LAST_DAY"));
					}
					if(msgKeyType.containsKeyColumn("w_TOTAL_STOCK_QTY_LAST_MONTH")) {
						key.setw_TOTAL_STOCK_QTY_LAST_MONTH(msgKey.getKeyValue("w_TOTAL_STOCK_QTY_LAST_MONTH"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_NAME")) {
						key.setMRP_ODR_NAME(msgKey.getKeyValue("MRP_ODR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MRP_NAME")) {
						key.setMRP_NAME(msgKey.getKeyValue("MRP_NAME"));
					}
					if(msgKeyType.containsKeyColumn("h_lotCtrl")) {
						key.seth_lotCtrl(msgKey.getKeyValue("h_lotCtrl"));
					}
					if(msgKeyType.containsKeyColumn("h_lotFlg")) {
						key.seth_lotFlg(msgKey.getKeyValue("h_lotFlg"));
					}
					if(msgKeyType.containsKeyColumn("h_screenflg")) {
						key.seth_screenflg(msgKey.getKeyValue("h_screenflg"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_NAME")) {
						key.setw_PLANT_NAME(msgKey.getKeyValue("w_PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("s_PLANT_CD")) {
						key.sets_PLANT_CD(msgKey.getKeyValue("s_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_val")) {
						key.setMRP_ODR_TYP_val(msgKey.getKeyValue("MRP_ODR_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_name")) {
						key.setMRP_ODR_TYP_name(msgKey.getKeyValue("MRP_ODR_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("MRP_FLG_val")) {
						key.setMRP_FLG_val(msgKey.getKeyValue("MRP_FLG_val"));
					}
					if(msgKeyType.containsKeyColumn("MRP_FLG_name")) {
						key.setMRP_FLG_name(msgKey.getKeyValue("MRP_FLG_name"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_NAME")) {
						key.setw_ITEM_NAME(msgKey.getKeyValue("w_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DRAW_CD")) {
						key.setDRAW_CD(msgKey.getKeyValue("DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("SPEC")) {
						key.setSPEC(msgKey.getKeyValue("SPEC"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG")) {
						key.setLOT_CTRL_FLG(msgKey.getKeyValue("LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_CD")) {
						key.setw_ITEM_CD(msgKey.getKeyValue("w_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_CD")) {
						key.setw_PLANT_CD(msgKey.getKeyValue("w_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_STOCK_QTY")) {
						key.setw_ITEM_STOCK_QTY(msgKey.getKeyValue("w_ITEM_STOCK_QTY"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_DEFECT_QTY")) {
						key.setw_ITEM_DEFECT_QTY(msgKey.getKeyValue("w_ITEM_DEFECT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_STOCK_QTY_LAST_DAY")) {
						key.setw_ITEM_STOCK_QTY_LAST_DAY(msgKey.getKeyValue("w_ITEM_STOCK_QTY_LAST_DAY"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_STOCK_QTY_LAST_MONTH")) {
						key.setw_ITEM_STOCK_QTY_LAST_MONTH(msgKey.getKeyValue("w_ITEM_STOCK_QTY_LAST_MONTH"));
					}
					if(msgKeyType.containsKeyColumn("w_JOB_ODR_STOCK_QTY")) {
						key.setw_JOB_ODR_STOCK_QTY(msgKey.getKeyValue("w_JOB_ODR_STOCK_QTY"));
					}
					if(msgKeyType.containsKeyColumn("w_JOB_ODR_STOCK_QTY_LAST_DAY")) {
						key.setw_JOB_ODR_STOCK_QTY_LAST_DAY(msgKey.getKeyValue("w_JOB_ODR_STOCK_QTY_LAST_DAY"));
					}
					if(msgKeyType.containsKeyColumn("w_JOB_ODR_STOCK_QTY_LAST_MONTH")) {
						key.setw_JOB_ODR_STOCK_QTY_LAST_MONTH(msgKey.getKeyValue("w_JOB_ODR_STOCK_QTY_LAST_MONTH"));
					}
					if(msgKeyType.containsKeyColumn("MRP_FLG")) {
						key.setMRP_FLG(new Integer(msgKey.getKeyValue("MRP_FLG")));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_STOCK_QTY_FOR_MRP")) {
						key.setw_ITEM_STOCK_QTY_FOR_MRP(msgKey.getKeyValue("w_ITEM_STOCK_QTY_FOR_MRP"));
					}
					if(msgKeyType.containsKeyColumn("w_JOB_ODR_STOCK_QTY_FOR_MRP")) {
						key.setw_JOB_ODR_STOCK_QTY_FOR_MRP(msgKey.getKeyValue("w_JOB_ODR_STOCK_QTY_FOR_MRP"));
					}
					if(msgKeyType.containsKeyColumn("w_WH_CD")) {
						key.setw_WH_CD(msgKey.getKeyValue("w_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_STOCK_ON_HAND_QTY")) {
						key.setw_STOCK_ON_HAND_QTY(msgKey.getKeyValue("w_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("w_DEFECT_QTY")) {
						key.setw_DEFECT_QTY(msgKey.getKeyValue("w_DEFECT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("w_PRVS_DAYEND_STOCK_QTY")) {
						key.setw_PRVS_DAYEND_STOCK_QTY(msgKey.getKeyValue("w_PRVS_DAYEND_STOCK_QTY"));
					}
					if(msgKeyType.containsKeyColumn("w_PRVS_MONTHEND_STOCK_QTY")) {
						key.setw_PRVS_MONTHEND_STOCK_QTY(msgKey.getKeyValue("w_PRVS_MONTHEND_STOCK_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("s2_PLANT_CD")) {
						key.sets2_PLANT_CD(msgKey.getKeyValue("s2_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_PLANT_NAME")) {
						key.setl_PLANT_NAME(msgKey.getKeyValue("l_PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_LOT_NO")) {
						key.setl_LOT_NO(msgKey.getKeyValue("l_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_STOCK_ON_HAND_QTY")) {
						key.setl_STOCK_ON_HAND_QTY(msgKey.getKeyValue("l_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ALCD_QTY")) {
						key.setl_ALCD_QTY(msgKey.getKeyValue("l_ALCD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_EXPIRATION_DATE")) {
						key.setl_EXPIRATION_DATE(msgKey.getKeyValue("l_EXPIRATION_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PRD_CMPLT_DATE")) {
						key.setl_PRD_CMPLT_DATE(msgKey.getKeyValue("l_PRD_CMPLT_DATE"));
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
