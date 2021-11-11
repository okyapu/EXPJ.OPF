/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0040/src/com/nec/jp/orteus/metamorBase/AF0040/AF0040010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AF0040;

import com.nec.jp.orteus.metamorBase.AF0040.*;
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
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.LotCtrl;

import com.nec.jp.orteus.expj.pr.rcvissue.common.UpdateInfo;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueInstStruct;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueProcess;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueRemain;
import com.nec.jp.orteus.expj.pr.rcvissue.process.JobOdrAlc;
import com.nec.jp.orteus.expj.pr.rcvissue.process.RcvProcess;
import com.nec.jp.orteus.expj.pr.rcvissue.process.WhAutoIssueProc;
import com.nec.jp.orteus.expj.util.Calculate;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.math.BigDecimal;
//------------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AF0040010Control
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
	public AF0040010Struct getListvalue(int x) { return (AF0040010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AF0040010Struct getStruct() { return this.struct; }	// Struct��Ԃ��܂��B
	public AF0040010Struct createStruct() { return new AF0040010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AF0040010Struct)structname); }	// Struct���Z�b�g���܂��B
//	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	String lotCtrl = null;

//-------------------------------------------------------------------------
	/** ��ʋ��ʒ�`�擾�N���X */
	ScreenParam _scParam = sp;
	/*��ЃR�[�h*/
	public String _company_cd = null;

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
	private AF0040010Struct _keyStruct = new AF0040010Struct();

	/** �L�[���Struct�̎擾 */
	public AF0040010Struct getKeyStruct(){ return _keyStruct; }
	
	/** �L�[���Struct�̐ݒ� */
	public void setKeyStruct(AF0040010Struct struct){ _keyStruct.copy(struct); }


//---------- �e�q��ʊ֘A�̏��� -------------------------------------------
//
//	// �s�C�����I�����ꂽ���׍s�̍sNO�̒l
//	private Integer _ModifyCnt = null;
//	
//	/** ���W�I�{�^���̒l�̎擾
//	 * @return ���W�I�{�^���̒l
//	*/
//	public Integer getr_MODIFY_CHOICE(){ return _ModifyCnt; }
//	
//	/** ���W�I�{�^���̒l�̐ݒ�
//	 * @param ���W�I�{�^���̒l
//	*/
//	public void setr_MODIFY_CHOICE(Integer no){ _ModifyCnt = no; }
	
//	---------- �T�u�Q��ʗpLIST -------------------------------------------

	/** �o�Ɏ��і��׈ꗗ */
	private List issueList = new ArrayList();
	
	/** 
	 * �o�Ɏ��і��׈ꗗ�̎擾
	 * @return �o�Ɏ��і��׈ꗗ
	 */
	public List getIssueList() {
		return this.issueList;
	}
	
	/**
	 * �o�Ɏ��і��׈ꗗ�̃T�C�Y�̎擾
	 * @return �o�Ɏ��і��׈ꗗ�̃T�C�Y
	 */
	public int getIssueListsize() {
		int nret = 0;
		if( this.issueList != null ) {
			nret = this.issueList.size();
		}
		return nret;
	}

//---------- �R���{�{�b�N�X�f�[�^�擾�֘A�̏��� -------------------------------

	/** �o�Ɋ����t���O **/
	ComboStruct _ISSUE_CMPLT_FLG = new ComboStruct();

	/** �o�Ɋ����t���O�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setISSUE_CMPLT_FLG_comb(ComboStruct combo){ _ISSUE_CMPLT_FLG = combo; }

	/** �o�Ɋ����t���O�擾
	 * @return �o�Ɋ����t���O�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getISSUE_CMPLT_FLG_comb(){ return _ISSUE_CMPLT_FLG; }


	/** �x���敪 **/
	ComboStruct _CONS_TYP = new ComboStruct();

	/** �x���敪�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setCONS_TYP_comb(ComboStruct combo){ _CONS_TYP = combo; }

	/** �x���敪�擾
	 * @return �x���敪�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getCONS_TYP_comb(){ return _CONS_TYP; }

	/** ���b�g�Ǘ��t���O **/
	ComboStruct _LOT_CTRL_FLG = new ComboStruct();

	/** ���b�g�Ǘ��t���O�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setLOT_CTRL_FLG_comb(ComboStruct combo){ _LOT_CTRL_FLG = combo; }

	/** ���b�g�Ǘ��t���O�擾
	 * @return ���b�g�Ǘ��t���O�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getLOT_CTRL_FLG_comb(){ return _LOT_CTRL_FLG; }
//-----------------------------------------------------------------------------

	/** ���t�t�H�[�}�b�g */
//	private SimpleDateFormat _dateFormat = new SimpleDateFormat("yyyy/MM/dd");

	/**
	 * Date�^ �� String�^�B
	 * @return String YYYY/MM/DD�`��
	 */
	public String dateToString(Date date)
	{
		return Converter.dateToStr(date, "yyyy/MM/dd");
	}

	/**
	 * String�^ �� Date�^�B
	 * @return Date 
	 */
	public Date stringToDate(String date) throws ParseException
	{
		return Converter.strToDate(date, "yyyy/MM/dd");
	}

//------------------------------------------------------------------------

	/** ���[�U��`�̏������σt���O */
	private boolean _usersIntialized = false;

	/**
	 * ���[�U��` ����������
	 */
	private void usersInitialize() throws ExpjException
	{
		// �Ǎ��X�e�[�^�X�ݒ�
		setReadStatus(INITIAL);

		if(_usersIntialized) return;

		// �R���{�f�[�^�̎擾
		setComboData(struct);

		_usersIntialized = true;
		return ;
	}


//------------------------------------------------------------------------
	/**
	 * �R���{�{�b�N�X�̒��g���擾���܂��B
	 *
	 * @param data �f�[�^�̔�
	 */
	 private void setComboData(AF0040010Struct data) throws ExpjException
	 {
		ComboBox controller = new ComboBox(conn, sysUSER_CD);
		try{
			//�R���{�f�[�^�̎擾
			ComboStruct ISSUE_CMPLT_FLG_comb = controller.getData("ISSUE_CMPLT_FLG");
			ComboStruct CONS_TYP_comb = controller.getData("CONS_TYP");
			ComboStruct LOT_CTRL_FLG_comb = controller.getData("LOT_CTRL_FLG");

			controller.setConnection(null);

			//�����Ɏ擾�f�[�^�ݒ�
			setISSUE_CMPLT_FLG_comb(ISSUE_CMPLT_FLG_comb);
			setCONS_TYP_comb(CONS_TYP_comb);
			setLOT_CTRL_FLG_comb(LOT_CTRL_FLG_comb);
			


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
	 * �o�Ɋ����t���O�̕\����ݒ�
	 * @param s �t���O�̒l���ݒ肳��Ă�����
	 */
	private void setIssueCmpltTypeValue(AF0040010Struct s)
	{
		s.setw_ISSUE_CMPLT_FLG_NAME(getTypeName(_ISSUE_CMPLT_FLG,s.getISSUE_CMPLT_FLG()));
	}

	/**
	 * �x���敪�t���O�̕\����ݒ�
	 * @param s �t���O�̒l���ݒ肳��Ă�����
	 */
	private void setConsTypeValue(AF0040010Struct s)
	{
		s.setw_CONS_TYP_NAME(getTypeName(_CONS_TYP,s.getCONS_TYP()));
	}

	/**
	 * �敪���擾
	 * @param comboStruct �敪��񃊃X�g
	 * @param intType �敪�R�[�h
	 * @return �敪���́B�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�
	 */
	private String getTypeName(ComboStruct comboStruct, String prmType)
	{
		if(comboStruct == null || prmType == null)	return null;
		String strTyp = prmType;
		String strTypName = strTyp;
		for(int i = 0; i < comboStruct.getValList().size(); i++){
			if(strTyp.equals((String)(comboStruct.getValList().get(i))) == true){
				strTypName = (String)(comboStruct.getExplanList().get(i));
				break;
			}
		}
		if(strTypName == null) strTypName = strTyp;
		return strTypName;
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
	 * �Ɩ����W�b�N�̃G���[���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * @param code ���b�Z�[�W�R�[�h
	 */
	private void setErrorMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, sysUSER_CD);
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
	 * �x�����b�Z�[�W�ݒ�
	 * @param code ���b�Z�[�W�ԍ�
	 * @param value1 �u��������P
	 */
	private void setWarningMessage(String code, String value1) {
		ExpjMessage emsg = new ExpjMessage(code, value1);
		msgStruct.addWarn(emsg);
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
	
	/**
	 * ��񃁃b�Z�[�W�ݒ�
	 * @param ���b�Z�[�W�ԍ�
	 * @param �o�̓��b�Z�[�W(List)
	 */
	private void setInfoMessage(String messageno, List message)
	{
		ExpjMessage emsg = new ExpjMessage( messageno );
		msgStruct.addInfo( emsg );
		sysLog.config(emsg, getsysUSER_CD());
		
		for(int i=0; i<message.size(); i++)
		{
			emsg = new ExpjMessage( "ZZ01006", (String)message.get(i) );
			msgStruct.addInfo( emsg );
			sysLog.config(emsg, getsysUSER_CD());
		}
	}

//---------- �o�ɏ����c�a�o�^�����i�e��ʁA�q��ʂŋ��ʎg�p�ׁ̈j�j --------------------
	/**
	 * �e��ʂ̓o�^�{�^���Ǝq��ʂ̓o�^�{�^�����狤�ʂɌĂяo����鏈���ł��B
	 *
	 * @return (true:����I��  false:�ُ�I���j
	 */
	private boolean insert_issue_process() throws BusinessProcessException, FoundationException, SQLException
	{
		// ���O�o�͏��i�[�p
		String logMessage = "";
		List listMessage = new ArrayList();

		logMessage = "Control : insert_issue_process"
					+ ", T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
		setSyslogConfig(logMessage);

			//----------------------------------------------------------
			// �ۊǋ�ʓ��o�Ɂi�o�Ɂj�o�^
			//----------------------------------------------------------
			// ���o�ɊǗ��ԍ��̔ԁi�o�Ɂj
			String ctrlCd = null;
			CollectNumber collect = new CollectNumber(
									CollectNumber.ISSUE_CD, 
									getsysUSER_CD(), 
									this.sp.getProcId(), 
									struct.getPLANT_CD());
			try{
				ctrlCd = collect.getNo();
				if(ctrlCd == null){
					ExpjMessage emsg = new ExpjMessage("AF00057");
					throw new FoundationException(
									"AF0040010Control",
									"insert_issue_process()",
									emsg.getMessage(CoreTools.getLocale(this.getsysUSER_CD())) );
				}
			}
			catch(FoundationException ex){
				// �o�^�������s�F���o�ɊǗ��ԍ��i�o�Ɂj�̍̔ԂɎ��s���܂���
				logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
				setErrorMessage("AF00057", logMessage);
				
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				ExpjException ee = new ExpjException(ex, emsg);
				throw ee;
			}

			// ���o�ɊǗ��ԍ�
			struct.setRCV_ISSUE_CTRL_CD(ctrlCd);
			// �o�ɕۊǋ�
			struct.settmp_WH_CD(struct.getw_WH_CD());
			// �o�ɐ�
			struct.settmp_RCV_ISSUE_QTY(Calculate.multiply(struct.getRCV_ISSUE_QTY(), "-1"));
			// ���o�Ɋ����t���O
			struct.setRCV_ISSUE_CMPLT_FLG(struct.geth_SHIP_COMPLETE());
			// ���o�ɋ敪�i2:�o�Ɂj
			struct.setRCV_ISSUE_TYP(new String("2"));
			// ���o�ɔ����敪�i21:�ʏ�o�Ɂj
			struct.setRCV_ISSUE_GNR_TYP(new String("21"));
			// �݌ɍX�V�敪�i1:���j
			struct.setSTOCK_UPD_TYP(new String("1"));
			struct.setCOMPANY_CD(_company_cd);
			logMessage = "T_RCV_ISSUE.RCV_ISSUE_CTRL_CD:" + struct.getRCV_ISSUE_CTRL_CD()
						+ ", T_RCV_ISSUE.JOB_ODR_CD:" + struct.getw_JOB_ODR_CD()
						+ ", T_RCV_ISSUE.ITEM_CD:" + struct.getITEM_CD()
						+ ", T_RCV_ISSUE.WH_CD:" + struct.getw_WH_CD()
						+ ", T_RCV_ISSUE.RCV_ISSUE_DATE:" + struct.getRCV_ISSUE_DATE()
						+ ", T_RCV_ISSUE.RCV_ISSUE_QTY:" + struct.gettmp_RCV_ISSUE_QTY();
			setSyslogConfig(logMessage);
			// �ۊǋ�ʓ��o�Ɂi�o�Ɂj�o�^
			entity.minsertT_RCV_ISSUE.create(conn, struct);

			// [�o�ɏ���]�ďo��
			IssueProcess issuePrc = new IssueProcess(conn, ctrlCd);
			try{
				if(issuePrc.execProcess() == true){
					// �X�V�n�j
					logMessage = "Issue Process was Complated!";
					setSyslogConfig(logMessage);
				}
				else {
					// �X�V�G���[
					logMessage = "Issue Process was Failed...";
					setSyslogConfig(logMessage);
					return false;
				}
			} finally {
				// �X�V���ʃ��b�Z�[�W�\��
				logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
				for(int idx = 0; idx < issuePrc.getErrorList().size(); idx++){
					setErrorMessage((String)issuePrc.getErrorList().get(idx) , logMessage);
				}
				for(int idx = 0; idx < issuePrc.getInfoList().size(); idx++){
					setInfoMessage((String)issuePrc.getInfoList().get(idx) , logMessage);
				}
				for(int idx = 0; idx < issuePrc.getWarnList().size(); idx++){
					setWarnMessage((String)issuePrc.getWarnList().get(idx) , logMessage);
				}
			}

			return true;
	}


//---------- ���ɏ����c�a�o�^�����i�e��ʁA�q��ʂŋ��ʎg�p�ׁ̈j�j --------------------
	/**
	 * �e��ʂ̓o�^�{�^���Ǝq��ʂ̓o�^�{�^�����狤�ʂɌĂяo����鏈���ł��B
	 *
	 * @return (true:����I��  false:�ُ�I���j
	 */
	private boolean insert_rcv_process() throws BusinessProcessException, FoundationException, SQLException
	{
		// ���O�o�͏��i�[�p
		String logMessage = "";
		List listMessage = new ArrayList();

		logMessage = "Control : insert_rcv_process"
					+ ", T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
		setSyslogConfig(logMessage);

			//----------------------------------------------------------
			// �L���x���i�̏ꍇ�A�L���x������o�^
			//----------------------------------------------------------
			// �o�Ɏw���̎x���敪��1(�L���x��)�̎��A�L���x���i
			if ("1".equals(struct.getCONS_TYP())) {

				logMessage = "M_CONS_UNIT_COST.ITEM_CD:" +	struct.getITEM_CD()
							+ ", M_CONS_UNIT_COST.VEND_CD:" +  struct.getVEND_CD()
							+ ", M_CONS_UNIT_COST.COMPANY_CD:" +  struct.getCOMPANY_CD()
							+ ", T_ISSUE_INST.EFF_PHASE_IN_DATE:" + struct.getRCV_ISSUE_DATE();
				setSyslogConfig(logMessage);
				//�x���P���̎擾
				List tmpList = entity.mselectM_COST.read(conn, struct);
				if(tmpList.size() <= 0) {
					struct.setUNIT_COST(new String("0"));
					struct.setUNIT_COST_TYP(new String("1"));
				}
				else{
					AF0040010Struct workStruct = (AF0040010Struct)tmpList.get(0);
					logMessage = "M_CONS_UNIT_COST.ONEROUS_FLG:" +	workStruct.getONEROUS_FLG()
								+ ", M_CONS_UNIT_COST.UNIT_COST:" +  workStruct.getUNIT_COST()
								+ ", M_CONS_UNIT_COST.UNIT_COST_TYP:" +  workStruct.getUNIT_COST_TYP();
					setSyslogConfig(logMessage);
					// �x���P���̗L���t���O��1(�L��)�̎��A�L���P���Z�b�g
					if(("1").equals(workStruct.getONEROUS_FLG()) == true){
						struct.setUNIT_COST(workStruct.getUNIT_COST());
						struct.setUNIT_COST_TYP(workStruct.getUNIT_COST_TYP());
					}
					else{
						struct.setUNIT_COST(new String("0"));
						struct.setUNIT_COST_TYP(new String("1"));
					}
				}

				// �L���x���ԍ��̔�
				String ctrlCd = null;
				CollectNumber collect = new CollectNumber(
										CollectNumber.ONERCONS_CD, 
										getsysUSER_CD(), 
										this.sp.getProcId(), 
										struct.getPLANT_CD());
				try{
					ctrlCd = collect.getNo();
					if(ctrlCd == null){
						ExpjMessage emsg = new ExpjMessage("AF00078");
						throw new FoundationException(
										"AF0040010Control",
										"insert_rcv_process()",
										emsg.getMessage(CoreTools.getLocale(this.getsysUSER_CD())) );
					}
				}
				catch(FoundationException ex){
					ex.printStackTrace();
					// �o�^�������s�F�L���x���ԍ��̍̔ԂɎ��s���܂���
					logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
					setErrorMessage("AF00078", logMessage);
					
					ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
					sysLog.severe(emsg, getsysUSER_CD());
					ExpjException ee = new ExpjException(ex, emsg);
					throw ee;
				}

				// �L���x���ԍ�
				struct.setONEROUS_CONS_NO(ctrlCd);
				// �o�ɐ�
				struct.settmp_RCV_ISSUE_QTY(struct.getRCV_ISSUE_QTY());

				// �o�Ɏw���ԍ�
				struct.setISSUE_INST_CD(struct.getISSUE_INST_CD());
				// �ԕi��ۊǋ�R�[�h
				struct.setRETURNED_WH_CD("");

				logMessage = "T_PAST_ONEROUS_CONS.ONEROUS_CONS_NO:" + struct.getONEROUS_CONS_NO()
							+ ",T_PAST_ONEROUS_CONS.JOB_ODR_CD:" + struct.getw_JOB_ODR_CD()
							+ ", T_PAST_ONEROUS_CONS.ITEM_CD:" + struct.getITEM_CD()
							+ ", T_PAST_ONEROUS_CONS.VEND_CD:" + struct.getVEND_CD()
							+ ", T_PAST_ONEROUS_CONS.ISSUE_DATE:" + struct.getRCV_ISSUE_DATE()
							+ ", T_PAST_ONEROUS_CONS.ISSUE_QTY:" + struct.gettmp_RCV_ISSUE_QTY();
				setSyslogConfig(logMessage);
				// �L���x������o�^
				entity.minsertT_PAST_ONEROUS_CONS.create(conn, struct);
			}
			if (struct.getWH_CD() != null && "".equals(struct.getWH_CD()) == false) {
			//----------------------------------------------------------
			// �L���x���i�łȂ��ꍇ�A�ۊǋ�ʓ��o�Ɂi���Ɂj�o�^
			//----------------------------------------------------------
				if ("3".equals(struct.getISSUE_TYP()) == false) {
					// ���o�ɊǗ��ԍ��̔ԁi���Ɂj
					String ctrlCd = null;
					CollectNumber collect = new CollectNumber(
											CollectNumber.ISSUE_CD, 
											getsysUSER_CD(), 
											this.sp.getProcId(), 
											struct.getPLANT_CD());
					try{
						ctrlCd = collect.getNo();
						if(ctrlCd == null){
							ExpjMessage emsg = new ExpjMessage("AF00057");
							throw new FoundationException(
											"AF0040010Control",
											"insert_rcv_process()",
											emsg.getMessage(CoreTools.getLocale(this.getsysUSER_CD())) );
						}
					}
					catch(FoundationException ex){
						// �o�^�������s�F���o�ɊǗ��ԍ��i���Ɂj�̍̔ԂɎ��s���܂���
						logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
						setErrorMessage("AF00057", logMessage);
						
						ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
						sysLog.severe(emsg, getsysUSER_CD());
						ExpjException ee = new ExpjException(ex, emsg);
						throw ee;
					}

					// ���o�ɊǗ��ԍ�
					struct.setRCV_ISSUE_CTRL_CD(ctrlCd);
					// ���ɕۊǋ�
					struct.settmp_WH_CD(struct.getWH_CD());
					// ���ɐ�
					struct.settmp_RCV_ISSUE_QTY(struct.getRCV_ISSUE_QTY());
					// ���o�Ɋ����t���O
					struct.setRCV_ISSUE_CMPLT_FLG(struct.geth_SHIP_COMPLETE());
					// ���o�ɋ敪�i1:���Ɂj
					struct.setRCV_ISSUE_TYP(new String("1"));
					if ("0".equals(struct.getCONS_TYP())) {
						// ���o�ɔ����敪�i61:�H���݌ɓ��Ɂj
						struct.setRCV_ISSUE_GNR_TYP("61");
					} else {
						// ���o�ɔ����敪�i81:�����݌ɓ��Ɂj
						struct.setRCV_ISSUE_GNR_TYP("81");
					}
					// �݌ɍX�V�敪�i1:���j
					struct.setSTOCK_UPD_TYP(new String("1"));
					//��ЃR�[�h
					struct.setCOMPANY_CD(_company_cd);
					logMessage = "T_RCV_ISSUE.RCV_ISSUE_CTRL_CD:" + struct.getRCV_ISSUE_CTRL_CD()
								+ ", T_RCV_ISSUE.JOB_ODR_CD:" + struct.getw_JOB_ODR_CD()
								+ ", T_RCV_ISSUE.ITEM_CD:" + struct.getITEM_CD()
								+ ", T_RCV_ISSUE.WH_CD:" + struct.getWH_CD()
								+ ", T_RCV_ISSUE.RCV_ISSUE_DATE:" + struct.getRCV_ISSUE_DATE()
								+ ", T_RCV_ISSUE.RCV_ISSUE_QTY:" + struct.gettmp_RCV_ISSUE_QTY();
					setSyslogConfig(logMessage);

					// [�o�Ɏw��]."����"��o�^���邽�߂̑ޔ�
					String saveJobOdrCd = struct.getw_JOB_ODR_CD();
					struct.setw_JOB_ODR_CD(struct.getJOB_ODR_CD());
					
					// �ۊǋ�ʓ��o�Ɂi���Ɂj�o�^
					entity.minsertT_RCV_ISSUE.create(conn, struct);

					// �ޔ��������Ԃ�߂�
					struct.setw_JOB_ODR_CD(saveJobOdrCd);

					// [���ɏ���]�ďo��
					RcvProcess rcvPrc = new RcvProcess(conn, ctrlCd);
					try{
						if(rcvPrc.execProcess() == true){
							// �X�V�n�j
							logMessage = "Rcv Process was Complated!";
							setSyslogConfig(logMessage);
						}
						else {
							// �X�V�G���[
							logMessage = "Rcv Process was Failed...";
							setSyslogConfig(logMessage);
							return false;
						}
					} finally {
						// �X�V���ʃ��b�Z�[�W�\��
						logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
						for(int idx = 0; idx < rcvPrc.getErrorList().size(); idx++){
							setErrorMessage((String)rcvPrc.getErrorList().get(idx) , logMessage);
						}
						for(int idx = 0; idx < rcvPrc.getInfoList().size(); idx++){
							setInfoMessage((String)rcvPrc.getInfoList().get(idx) , logMessage);
						}
						for(int idx = 0; idx < rcvPrc.getWarnList().size(); idx++){
							setWarnMessage((String)rcvPrc.getWarnList().get(idx) , logMessage);
						}
					}
				}
			}

			return true;
	}


//------------------------------------------------------------------------------
	
	/**
	 * <pre>
	 * �ȉ��̍��ڂ̌v�Z�������s��
	 * ��i�ڍ݌ɖ���������A��ʎ�z���o�ɉ\����A
	 * ������ϖ��o�ɐ���A�����o�ɉ\���
	 * </pre>
	 */
	private void calcDisplayItem() throws BusinessProcessException, FoundationException, SQLException
	{
		IssueRemain issueRemain = new IssueRemain(conn);
		
		// �i�ڍ݌ɖ�������
		if(!struct.getc_JOB_ODR().equals("true")){
			if(struct.getMRP_ODR_TYP().equals(AF0040Const._MRP_ODR_JOB_ODR_CD) ||
					struct.getMRP_ODR_TYP().equals(AF0040Const._MRP_ODR_STOCK_ALC_JOB_ODR_CD)){
				struct.setITEM_STOCK_NON_ALC_QTY(
						issueRemain.getFreeStockQtyOfItem(getsysPLANT_CD(),struct.getITEM_CD()).toString());
			}else{
				struct.setITEM_STOCK_NON_ALC_QTY(struct.getw_TOTAL_STOCK_ON_HAND_QTY());
			}
		}
		
		// �ʎ�z���o�ɉ\��
		if((struct.getMRP_ODR_TYP().equals(AF0040Const._MRP_ODR_JOB_ODR_CD) ||
				struct.getMRP_ODR_TYP().equals(AF0040Const._MRP_ODR_STOCK_ALC_JOB_ODR_CD)) &&
				struct.getc_JOB_ODR().equals("true") &&
				struct.getw_JOB_ODR_CD().equals(struct.getJOB_ODR_CD())){
			struct.setODR_ISSUE_POSS_QTY(
					issueRemain.getRemainQtyByOd(struct.getOD_NO()).remainQty.toString());
		}
		
		// �����ϖ��o�ɐ�
		if(struct.getMRP_ODR_TYP().equals(AF0040Const._MRP_ODR_JOB_ODR_CD) ||
				struct.getMRP_ODR_TYP().equals(AF0040Const._MRP_ODR_STOCK_ALC_JOB_ODR_CD)){
			if(struct.getc_JOB_ODR().equals("true")){
				struct.setALC_NOISSUE_QTY(
						issueRemain.getRemainQtyByJobOdr(struct.getOD_NO(),
														 struct.getw_JOB_ODR_CD(),
														 AF0040Const._JOB_ODR_DETAIL_NO).toString());
			}else{
				struct.setALC_NOISSUE_QTY(
						issueRemain.getRemainQtyByItem(struct.getOD_NO()).toString());
			}
		}
		
		// ����o�ɉ\��
		if(struct.getMRP_ODR_TYP().equals(AF0040Const._MRP_ODR_JOB_ODR_CD) ||
				struct.getMRP_ODR_TYP().equals(AF0040Const._MRP_ODR_STOCK_ALC_JOB_ODR_CD)){
			if(struct.getc_JOB_ODR().equals("true")){
				struct.setTHIS_TIME_ISSUE_POSS_QTY(
						Calculate.add(struct.getODR_ISSUE_POSS_QTY(), struct.getALC_NOISSUE_QTY()));
			}else{
				struct.setTHIS_TIME_ISSUE_POSS_QTY(Calculate.add(
						struct.getALC_NOISSUE_QTY(), struct.getITEM_STOCK_NON_ALC_QTY()));
			}
		}else{
			struct.setTHIS_TIME_ISSUE_POSS_QTY(struct.getw_STOCK_ON_HAND_QTY());
		}
	}
	
	
	/**
	 * �V�X�e���p�����[�^�擾
	 */
	private boolean getSysParameter() throws BusinessProcessException, FoundationException {
		boolean b = true;
		try {
			List sysParameterList = entity.mSELECT_SYS_PARAMETER.read(conn, struct);
			if(sysParameterList == null || sysParameterList.isEmpty()) return b;
			AF0040010Struct sysParameterStruct = (AF0040010Struct) sysParameterList.get(0);
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
			AF0040010Struct procExecDateStruct = (AF0040010Struct) procExecDateList.get(0);
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
	 * �Ɩ��G���[�������̃p�����[�^�ݒ菈����؂�o���Ċ֐���
	 * @param tableName �e�[�u����
	 * @param columnName �J������
	 * @param value �l
	 */
	private void setErrorParameter(String tableName, String columnName, String value) {
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
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0040");
		logger.entering("AF0040010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
		//------------------------------------------------------------------
		// ���O�o�͏��i�[�p
		String logMessage = "";
		List listMessage = new ArrayList();

		try {
			// �L�[���ڃ��O�\��
			logMessage = "T_OPR_INST_SLIP.OPR_INST_CD:" + struct.getOPR_INST_CD()
						+ ", T_ISSUE_INST.PUCH_ODR_CD:" + struct.getPUCH_ODR_CD();
			setSyslogConfig(logMessage);

			// �Ǎ��X�e�[�^�X�ݒ�
			setReadStatus(INITIAL);

			//���X�g�N���A
			if(list != null){
				list.clear();
			}

			// ��ʃN���A
			struct.setOPR_INST_QTY(new String("0.0"));

			// �G���[�`�F�b�N
			boolean check = true;		// �`�F�b�N���ʊi�[

			AF0040010Struct workStruct = null;
			// ��Ǝw���ԍ����w�肳�ꂽ�ꍇ
			if (("0").equals(struct.getw_CHOICE()) == true) {
				// ��Ɠ`�[�̑��݃`�F�b�N
				List tmpList = entity.mselectT_OPR_INST_SLIP.read(conn, struct);
				if (tmpList.size() <= 0) {
					// �Ǎ��������s�F��Ǝw���ԍ�����Ɠ`�[�ɑ��݂��܂���
					logMessage = "T_OPR_INST_SLIP.OPR_INST_CD:"
							+ struct.getOPR_INST_CD();
					setErrorMessage("ZZ06001", logMessage);
					check = false;
				} else {
					AF0040010Struct tmpStruct = (AF0040010Struct) tmpList
							.get(0);
					// ��Ɠ`�[.�H��R�[�h �� ���O�C�����p�ҍH��R�[�h �`�F�b�N
					if ((tmpStruct.getPLANT_CD().equals(struct.getw_PLANT_CD())) == false) {
						// �Ǎ��������s�F��Ǝw���ԍ��͑��̍H��̃f�[�^�Ȃ̂Ŏw��ł��܂���
						listMessage.add("T_OPR_INST_SLIP.OPR_INST_CD:"+ struct.getOPR_INST_CD());
						listMessage.add("T_OPR_INST_SLIP.PLANT_CD:"+ tmpStruct.getPLANT_CD());
						setErrorMessage("ZZ06001", listMessage);
						listMessage.clear();
						check = false;
					} else {
						if (("1").equals(tmpStruct.getOPR_INST_CD_GNR_TYP()) == true) {
							// �i�ڕʎd�| �Ǎ�
							List workList = entity.mselectT_WORK_IN_PROC_BY_ITEM.read(conn, struct);
							if (workList.size() <= 0) {
								// �Ǎ��������s�F��Ǝw���ԍ����i�ڕʎd�|�ɑ��݂��܂���
								logMessage = "T_WORK_IN_PROC_BY_ITEM.OPR_INST_CD:"
										+ struct.getOPR_INST_CD();
								setErrorMessage("ZZ06001", logMessage);
								check = false;
							} else {
								workStruct = (AF0040010Struct) workList.get(0);
							}
						} else {
							// ��ƌn��ʎd�| �Ǎ�
							List workList = entity.mselectT_WORK_IN_PROC_BY_PROC
									.read(conn, struct);
							if (workList.size() <= 0) {
								// �Ǎ��������s�F��Ǝw���ԍ�����ƌn��ʎd�|�ɑ��݂��܂���
								logMessage = "T_WORK_IN_PROC_BY_PROC.OPR_INST_CD:"
										+ struct.getOPR_INST_CD();
								setErrorMessage("ZZ06001", logMessage);
								check = false;
							} else {
								workStruct = (AF0040010Struct) workList.get(0);
							}
						}
					}
				}
			}
			// �����ԍ����w�肳�ꂽ�ꍇ
			if(("1").equals(struct.getw_CHOICE()) == true) {
				// �����c�R�[�h�̑��݃`�F�b�N
				List tmpList = entity.mselectT_RLSD_PUCH_ODR.read(conn, struct);
				if(tmpList.size() <= 0) {
					// �Ǎ��������s�F�����ԍ��������c�ɑ��݂��܂���
					logMessage = "T_RLSD_PUCH_ODR.PUCH_ODR_CD:" + struct.getPUCH_ODR_CD();
					setErrorMessage("ZZ06001", logMessage);
					check = false;
				}
				else{
					workStruct = (AF0040010Struct)tmpList.get(0);
					//�����c.�H��R�[�h �� ���O�C�����p�ҍH��R�[�h �`�F�b�N
					if((workStruct.getPLANT_CD().equals(struct.getw_PLANT_CD())) == false){
						// �Ǎ��������s�F�����ԍ��͑��̍H��̃f�[�^�Ȃ̂Ŏw��ł��܂���
						listMessage.add("T_RLSD_PUCH_ODR.PUCH_ODR_CD:" + struct.getPUCH_ODR_CD());
						listMessage.add("T_RLSD_PUCH_ODR.PLANT_CD:" + workStruct.getPLANT_CD());
						setErrorMessage("ZZ06001", listMessage);
						listMessage.clear();
						check = false;
					}
				}
			}

			// �i�ڕʎd�|or��ƌn��ʎd�|or�����c����e��� �ݒ�
			if(check == true){
				struct.setJOB_ODR_CD(workStruct.getJOB_ODR_CD());
				struct.setWORK_ODR_CD(workStruct.getWORK_ODR_CD());
				struct.setWORK_IN_PROC_CD(workStruct.getWORK_IN_PROC_CD());
				struct.setPROC_NAME(workStruct.getPROC_NAME());
				struct.setWS_CD(workStruct.getWS_CD());
				struct.setWS_NAME(workStruct.getWS_NAME());
				struct.setVEND_CD(workStruct.getVEND_CD());
				struct.setVEND_ANAME(workStruct.getVEND_ANAME());
			    struct.setCOMPANY_CD(workStruct.getCOMPANY_CD());
				struct.setITEM_CD(workStruct.getITEM_CD());
				struct.setITEM_NAME(workStruct.getITEM_NAME());
				struct.setOPR_INST_START_DATE(workStruct.getOPR_INST_START_DATE());
				struct.setWORK_ODR_DLV_DATE(workStruct.getWORK_ODR_DLV_DATE());
				struct.setOPR_INST_QTY(workStruct.getOPR_INST_QTY());
				struct.setPLANT_CD(workStruct.getPLANT_CD());
				struct.setSTOCK_UNIT(workStruct.getSTOCK_UNIT());

				// ��Ǝw���ԍ����w�肳�ꂽ�ꍇ
				if(("0").equals(struct.getw_CHOICE()) == true) {
					// �Ǎ��L�[���ڃ��O�\��
					logMessage = "T_OPR_INST_SLIP.OPR_INST_CD:" + struct.getOPR_INST_CD()
								+ ", T_ISSUE_INST.WORK_ODR_CD:" + struct.getWORK_ODR_CD()
								+ ", T_ISSUE_INST.WORK_IN_PROC_CD:" + struct.getWORK_IN_PROC_CD()
								+ ", T_ISSUE_INST.PLANT_CD:" +	struct.getPLANT_CD();
				}
				// �����ԍ����w�肳�ꂽ�ꍇ
				if(("1").equals(struct.getw_CHOICE()) == true) {
					// �Ǎ��L�[���ڃ��O�\��
					logMessage = "T_RLSD_PUCH_ODR.PUCH_ODR_CD:" + struct.getPUCH_ODR_CD()
								+ ", T_RLSD_PUCH_ODR.PLANT_CD:" + struct.getPLANT_CD();
				}
				setSyslogConfig(logMessage);
				// �ő�\���s��
				ScreenParam sp = new ScreenParam(this.getClass());
				int maxLine = sp.getMaxLine(conn, 10);
				if (maxLine != 0)
					struct.setROW_COUNT(String.valueOf(maxLine));
				else
					struct.setROW_COUNT(null);

				// ��ƌv��ԍ��܂��͔����ԍ��ŏo�Ɏw�� �Ǎ�
				list = entity.mselectCnt.read(conn, struct);
				long rowCount = Long.parseLong(((AF0040010Struct) list.get(0))
						.getl_COUNT());

				// ��������0���̏ꍇ
				if (rowCount <= 0) {
					// ��Ǝw���ԍ��œǍ������ꍇ
					if (("0").equals(struct.getw_CHOICE()) == true) {
						// �Ǎ��������s�F��ƌv��ԍ��ɊY������o�Ɏw���f�[�^�����݂��܂���
						listMessage.add("T_OPR_INST_SLIP.OPR_INST_CD:"+ struct.getOPR_INST_CD());
						listMessage.add("T_ISSUE_INST.WORK_ODR_CD:"+ struct.getWORK_ODR_CD());
						listMessage.add("T_ISSUE_INST.WORK_IN_PROC_CD:"+ struct.getWORK_IN_PROC_CD());
						listMessage.add("T_ISSUE_INST.PLANT_CD:"+ struct.getPLANT_CD());
						setErrorMessage("ZZ06001", listMessage);
						listMessage.clear();
					}
					// �����ԍ��œǍ������ꍇ
					if (("1").equals(struct.getw_CHOICE()) == true) {
						// �Ǎ��������s�F�����ԍ��ɊY������o�Ɏw���f�[�^�����݂��܂���
						listMessage.add("T_RLSD_PUCH_ODR.PUCH_ODR_CD:"+ struct.getPUCH_ODR_CD());
						listMessage.add("T_RLSD_PUCH_ODR.PLANT_CD:"+ struct.getPLANT_CD());
						setErrorMessage("ZZ06001", listMessage);
						listMessage.clear();
					}
					// �Ǎ��X�e�[�^�X�ݒ�
					setReadStatus(NOT_FOUND);
					if(list!=null && list.size()>0){
						list.clear();
					}
					return;
				} else {
					// �\���ő�s����������
					if (maxLine != 0 && rowCount == maxLine + 1) {
						if(list!=null && list.size()>0){
							list.clear();
						}
						setErrorMessage("ZZ01115", "", "" + maxLine);
						// �Ǎ��X�e�[�^�X�ݒ�
						setReadStatus(TOO_MANY);
						return;
					} else {

						// ��ƌv��ԍ��܂��͔����ԍ��ŏo�Ɏw�� �Ǎ�
						list = entity.mselect.read(conn, struct);
						for (int i = 0; i < list.size(); i++) {
							// �o�Ɋ����t���O�A�x���敪�ɕ\������\�����̐ݒ�
							setIssueCmpltTypeValue((AF0040010Struct) (list
									.get(i)));
							setConsTypeValue((AF0040010Struct) (list.get(i)));
						}

						// �Ǎ��X�e�[�^�X�ݒ�
						setReadStatus(NORMAL);
					}
				}
			}

		}catch(SQLException e){
			// �Ǎ��X�e�[�^�X�ݒ�
			setReadStatus(ERROR);
			setSqlExceptionMsg(e);
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AF0040010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * �s�C���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlmodify() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0040");
		logger.entering("AF0040010Control"+":USER="+struct.getsUser_ID(),"controlmodify");
			//{{user_implement_dev:<controlmodify>
		//------------------------------------------------------------------
		// ���O�o�͏��i�[�p
		String logMessage = "";
		// �`�F�b�N���ʊi�[
		boolean check = true;		

		// �������O��struct����ޔ�
		AF0040010Struct structCopy = new AF0040010Struct();
		structCopy.copy(struct);
		// �l�̏�����
		struct.setITEM_STOCK_NON_ALC_QTY("0.0");
		struct.setODR_ISSUE_POSS_QTY("0.0");
		struct.setALC_NOISSUE_QTY("0.0");
		struct.setTHIS_TIME_ISSUE_POSS_QTY("0.0");
		
		try {

			// �q��ʂŕ\������x���敪�ޔ��G���A
			String w_cons_typ_name = struct.getw_CONS_TYP_NAME();

			// �L�[���ڃ��O�\��
			logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
			setSyslogConfig(logMessage);

			// �I�����ꂽ���ׂ̍ŐV�f�[�^���o�Ɏw���ԍ��w��œǍ��i�ŐV�̎��ї݌v����\�����邽�߁j
			// �i���ISQL�̂��߁A�o�Ɏw���ԍ��ȊO�̓N���A���ēǍ��ށj
			struct.setISSUE_INST_CD(struct.getISSUE_INST_CD());
			struct.setWORK_ODR_CD((String)null);
			struct.setWORK_IN_PROC_CD((String)null);
			struct.setOPR_INST_CD((String)null);
			struct.setPUCH_ODR_CD((String)null);
			struct.setw_PLANT_CD((String)null);
			// �\���f�[�^���擾����
			List tmpList = entity.mselect.read(conn, struct);
			if(tmpList.size() <= 0) {
				// �s�C���������s�F�I�����ꂽ�o�Ɏw���f�[�^�����݂��܂���
				logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
				setErrorMessage("ZZ01101", logMessage);
				check = false;
			}
			else{
				// ���b�g�Ǘ��t���O��1�ꍇ
				if ("1".equals(struct.getLOT_CTRL_FLG())) {
					// �q��ʂ̏����l���Z�b�g
					if (issueList != null) {
						issueList.clear();
					}
					 //�\���ő�s����������
	    			ScreenParam sp = new ScreenParam(this.getClass());
	    			int maxLine = sp.getMaxLine(conn,21);
	    			if(maxLine != 0) {
	    				struct.setROW_COUNT(String.valueOf(maxLine));
	    			} else {
	    				struct.setROW_COUNT(null);
	    			}
	    			issueList = entity.mT_LOT_ISSUE_INSTCnt.read(conn, struct);
	    			long rowCount = Long.parseLong(((AF0040010Struct)issueList.get(0)).getl_COUNT());
	    			if (maxLine != 0 && rowCount ==maxLine+1){
	    				setReadStatus(TOO_MANY);
	    				if(issueList!=null&&issueList.size()>0){
	    					this.issueList.clear();
	    				}
	    				logMessage = "";
	    				setErrorMessage("ZZ01115", "", ""+maxLine);
	    				return;
	    			}
					// �o�Ɏ��і��׈ꗗ�̎擾
		            issueList = entity.mT_LOT_ISSUE_INST.read(conn, struct);
				}
				
				struct.copy((AF0040010Struct)tmpList.get(0));
				// �L�[���ڂ��Z�b�g
				struct.setOPR_INST_CD(_keyStruct.getOPR_INST_CD());
				struct.setPUCH_ODR_CD(_keyStruct.getPUCH_ODR_CD());
				struct.setw_PLANT_CD(_keyStruct.getw_PLANT_CD());
				struct.setw_CHOICE(_keyStruct.getw_CHOICE());
				// ��ʃ`�F�b�N�p�ɏo�ɐ�ۊǋ�R�[�h���\�����ڂɕێ�
				struct.seth_WH_CD(struct.getWH_CD());

				// �l�q�o�i�ڂ̎��A���v�ʂɃZ�b�g����Ă��鐻�Ԃ͐e�̐��ԂȂ̂Ŏg��Ȃ��inull�ƈ����j
				if(Calculate.compare(struct.getMRP_ODR_TYP(), "3") > 0){
					struct.setJOB_ODR_CD((String)null);
					struct.setw_JOB_ODR_CD((String)null);
				}
				else{
					struct.setw_JOB_ODR_CD(struct.getJOB_ODR_CD());
				}
				// �q��ʂ̏����l���Z�b�g
				struct.setRCV_ISSUE_QTY(new String("0.0"));
				struct.setw_STOCK_ON_HAND_QTY(new String("0.0"));
				struct.setw_TOTAL_STOCK_ON_HAND_QTY(new String("0.0"));
				struct.seth_SHIP_COMPLETE(struct.getISSUE_CMPLT_FLG());
				struct.setw_CONS_TYP_NAME(w_cons_typ_name);
				struct.setLOT_NO(null);
				
				// �Ɩ��^�p���̎擾
				tmpList = entity.mselectSYS_DATE_CTRL.read(conn, struct);
				if(tmpList.size() <= 0) {
					// �s�C���������s�F�Ɩ��^�p�������݂��܂���
					logMessage = "SYS_DATE_CTRL.PLANT_CD:" + struct.getw_PLANT_CD();
					setErrorMessage("AF00056", logMessage);
					check = false;
				}
				else{
					AF0040010Struct workStruct = (AF0040010Struct)tmpList.get(0);
					struct.setBUSINESS_OPR_DATE(workStruct.getBUSINESS_OPR_DATE());
					struct.setRCV_ISSUE_DATE(workStruct.getBUSINESS_OPR_DATE());
				}
				
				// ���|�Ǘ����C���X�g�[������Ă���ꍇ�A���N���x���擾
				AF0040010Struct readStruct = new AF0040010Struct();
				List installOptionsList = entity.mSYS_INSTALL_OPTIONS.read(conn, readStruct);
				if (installOptionsList.size() > 0) {
					AF0040010Struct installOptionsStruct = (AF0040010Struct)installOptionsList.get(0);
					struct.setINSTALL_FLG(installOptionsStruct.getINSTALL_FLG());
				} else {
					struct.setINSTALL_FLG("0");
				}
					
				// ���|�Ǘ����C���X�g�[������Ă���ꍇ�A���N���x���擾
				if ("1".equals(struct.getINSTALL_FLG())) {
					List debtCtrlList = entity.mSYS_DEBT_CTRL.read(conn, readStruct);
					if (debtCtrlList.size() > 0) {
						AF0040010Struct debtCtrlStruct = (AF0040010Struct)debtCtrlList.get(0);
						struct.setTHIS_MONTH(debtCtrlStruct.getTHIS_MONTH());
					} else {
						setErrorMessage("AF00142");
						check = false;
					}
				}

				// [�o�Ɏw��]."�H���ۊǏꏊ�R�[�h"��null�łȂ��ꍇ�͖��̕\��
				if (struct.getWH_CD() == null && "".equals(struct.getWH_CD())) {
					AF0040010Struct whStruct = new AF0040010Struct();
					whStruct.settmp_WH_CD(struct.getWH_CD());
					tmpList = entity.mselectM_WH.read(conn, whStruct);
					if (tmpList.size() > 0) {
						AF0040010Struct workStruct = (AF0040010Struct)tmpList.get(0);
						struct.setWH_NAME(workStruct.getWH_NAME());
					}
				}

				// �݌ɗ݌v���̃Z�b�g�i�q�ɍ݌ɂ����W�v�j
				if(struct.getw_JOB_ODR_CD() == null || ("").equals(struct.getw_JOB_ODR_CD()) == true){
					// ���Ԃ�null�̎��A�i�ڍ݌� �Ǎ�
					tmpList = entity.mselectTOTAL_ITEM_STOCK.read(conn, struct);
				}
				else{
					// ���Ԃ�null�łȂ����A���ԍ݌� �Ǎ�
					tmpList = entity.mselectTOTAL_JOB_ODR_STOCK.read(conn, struct);
				}
				if(tmpList.size() > 0){
					AF0040010Struct tmpStruct = (AF0040010Struct)tmpList.get(0);
					struct.setw_TOTAL_STOCK_ON_HAND_QTY(tmpStruct.getw_TOTAL_STOCK_ON_HAND_QTY());
				}
			}
		} catch(SQLException e) {
			// �Ǎ��X�e�[�^�X�ݒ�
			setReadStatus(ERROR);
			setSqlExceptionMsg(e);

		} finally {
			// �G���[�̎��A�e��ʃf�[�^�Đݒ�
			if(check != true){
				struct.copy(_keyStruct);

				// �����O�̒l�𕜋A
				struct.setWORK_IN_PROC_CD(structCopy.getWORK_IN_PROC_CD());
			} else {
				// ���X�g�N���A
				if (list != null) {
					list.clear();
				} 
			}
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlmodify>
		logger.exiting("AF0040010Control"+":USER="+struct.getsUser_ID(),"controlmodify");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0040");
		logger.entering("AF0040010Control"+":USER="+struct.getsUser_ID(),"controlclear");
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
		_keyStruct = new AF0040010Struct();

		struct.setRCV_ISSUE_QTY(new String("0.0"));
		struct.setOPR_INST_QTY(new String("0.0"));

		// �Ǎ��X�e�[�^�X�ݒ�
		setReadStatus(INITIAL);

		//------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AF0040010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * �݌Ɋm�F�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlselectSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0040");
		logger.entering("AF0040010Control"+":USER="+struct.getsUser_ID(),"controlselectSub1");
			//{{user_implement_dev:<controlselectSub1>
		//------------------------------------------------------------------
		// ���O�o�͏��i�[�p
		String logMessage = "";
		List listMessage = new ArrayList();

		try {
			// �N���A
			struct.setw_WH_NAME((String)null);
			struct.setw_STOCK_ON_HAND_QTY(new String("0.0"));
			struct.setw_TOTAL_STOCK_ON_HAND_QTY(new String("0.0"));
			
			// �l�̏�����
			struct.setITEM_STOCK_NON_ALC_QTY("0.0");
			struct.setODR_ISSUE_POSS_QTY("0.0");
			struct.setALC_NOISSUE_QTY("0.0");
			struct.setTHIS_TIME_ISSUE_POSS_QTY("0.0");

			// �G���[�`�F�b�N
			boolean check = true;		// �`�F�b�N���ʊi�[

			// �ۊǋ�R�[�h�̑��݃`�F�b�N
			struct.settmp_WH_CD(struct.getw_WH_CD());
			List tmpList = entity.mselectM_WH.read(conn, struct);
			if(tmpList.size() <= 0) {
				// �Ǎ��������s�F�ۊǋ�R�[�h�����݂��܂���
				logMessage = "M_WH.WH_CD:" + struct.gettmp_WH_CD();
				setErrorMessage("AF00028", logMessage);
				check = false;
			}
			else{
				AF0040010Struct checkStruct = (AF0040010Struct)tmpList.get(0);
				struct.setw_WH_NAME(checkStruct.getWH_NAME());
				// �ۊǋ�.�H��R�[�h �� ���O�C�����p�ҍH��R�[�h �`�F�b�N
				if(checkStruct.getWH_PLANT_CD().equals(struct.getw_PLANT_CD()) == false){
					// �Ǎ��������s�F�ۊǋ�R�[�h�͑��̍H��̃f�[�^�Ȃ̂Ŏw��ł��܂���
					listMessage.add("M_WH.WH_CD:" + struct.gettmp_WH_CD());
					listMessage.add("M_WH.PLANT_CD:" +	checkStruct.getWH_PLANT_CD());
					setErrorMessage("AF00029", listMessage);
					listMessage.clear();
					check = false;
				}
				else{
					// �ۊǋ�R�[�h���q�ɂ��`�F�b�N
					if(("1").equals(checkStruct.getMRP_FLG()) == false){
						// �Ǎ��������s�F�o�Ɍ��ۊǋ悪���v�ʌv�Z�Ώۂł͂���܂���
						listMessage.add("M_WH.WH_CD:" + struct.gettmp_WH_CD());
						listMessage.add("M_WH.MRP_FLG:" +  checkStruct.getMRP_FLG());
						setErrorMessage("AF00096", listMessage);
						listMessage.clear();
						check = false;
					}
				}
			}

			// �ۊǋ�ʍ݌ɐ��̃Z�b�g
			//�u���Ԃ���o�ɂ���v��off�̏ꍇ
			if(("0").equals(struct.geth_JOB_ODR()) == true){
				//�ۊǋ�ʕi�ڍ݌ɂ̓Ǎ�
				tmpList = entity.mselectSub1_ITEM_STOCK.read(conn, struct);
				if(tmpList.size() <= 0) {
					// �Ǎ��������s�F�ۊǋ�ʕi�ڍ݌ɂ����݂��܂���
					listMessage.add("T_ITEM_STOCK.ITEM_CD:" + struct.getITEM_CD());
					listMessage.add("T_ITEM_STOCK.WH_CD:" + struct.getw_WH_CD());
					listMessage.add("T_ITEM_STOCK.PLANT_CD:" + struct.getPLANT_CD());
					setErrorMessage("AF00044", listMessage);
					listMessage.clear();
					check = false;
				}
			}
			else{
				//�ۊǋ�ʐ��ԍ݌ɂ̓Ǎ�
				tmpList = entity.mselectSub1_JOB_ODR_STOCK.read(conn, struct);
				if(tmpList.size() <= 0) {
					// �Ǎ��������s�F�ۊǋ�ʐ��ԍ݌ɂ����݂��܂���
					listMessage.add("T_JOB_ODR_CD_STOCK.JOB_ODR_CD:" + struct.getw_JOB_ODR_CD());
					listMessage.add("T_JOB_ODR_CD_STOCK.ITEM_CD:" + struct.getITEM_CD());
					listMessage.add("T_JOB_ODR_CD_STOCK.WH_CD:" + struct.getw_WH_CD());
					listMessage.add("T_JOB_ODR_CD_STOCK.PLANT_CD:" + struct.getPLANT_CD());
					setErrorMessage("AF00045", listMessage);
					listMessage.clear();
					check = false;
				}
			}
			if(tmpList.size() > 0) {
				AF0040010Struct workStruct = (AF0040010Struct)tmpList.get(0);
				struct.setw_STOCK_ON_HAND_QTY(workStruct.getw_STOCK_ON_HAND_QTY());
			}


			// �݌ɗ݌v���̃Z�b�g�i�q�ɍ݌ɂ����W�v�j
			//�u���Ԃ���o�ɂ���v��off�̏ꍇ
			if(("0").equals(struct.geth_JOB_ODR()) == true){
				//�ۊǋ�ʕi�ڍ݌ɂ̓Ǎ�
				tmpList = entity.mselectTOTAL_ITEM_STOCK.read(conn, struct);
			}
			else{
				//�ۊǋ�ʐ��ԍ݌ɂ̓Ǎ�
				tmpList = entity.mselectTOTAL_JOB_ODR_STOCK.read(conn, struct);
			}
			if(tmpList.size() > 0){
				AF0040010Struct tmpStruct = (AF0040010Struct)tmpList.get(0);
				struct.setw_TOTAL_STOCK_ON_HAND_QTY(tmpStruct.getw_TOTAL_STOCK_ON_HAND_QTY());
			}
			
			if(msgStruct.sizeError() <= 0){
				// �\�����ڌv�Z����
				calcDisplayItem();
			}

		}catch(SQLException e){
			// �Ǎ��X�e�[�^�X�ݒ�
			setReadStatus(ERROR);
			setSqlExceptionMsg(e);
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlselectSub1>
		logger.exiting("AF0040010Control"+":USER="+struct.getsUser_ID(),"controlselectSub1");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlinsertSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0040");
		logger.entering("AF0040010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");
			//{{user_implement_dev:<controlinsertSub1>
		//------------------------------------------------------------------
		// ���O�o�͏��i�[�p
		String logMessage = "";
		List listMessage = new ArrayList();

		try {
			
			// ���Y���̉ߋ��̎��ѓ��͂̐����`�F�b�N
			if(getSysParameter() == false){	
				if(chkProcExecDate("1","",struct.getRCV_ISSUE_DATE()) == false){
					setErrorMessage(ProcExecDateError);
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
					return;
				}
			}
			
			// �N���A
			struct.setw_WH_NAME((String)null);
			struct.setWH_NAME((String)null);
			struct.setw_STOCK_ON_HAND_QTY(new String("0.0"));
			struct.setw_TOTAL_STOCK_ON_HAND_QTY(new String("0.0"));
			
			// �l�̏�����
			struct.setITEM_STOCK_NON_ALC_QTY("0.0");
			struct.setODR_ISSUE_POSS_QTY("0.0");
			struct.setALC_NOISSUE_QTY("0.0");
			struct.setTHIS_TIME_ISSUE_POSS_QTY("0.0");

			// �G���[�`�F�b�N
			boolean check = true;		// �`�F�b�N���ʊi�[

			// �ۊǋ�R�[�h�̑��݃`�F�b�N
			struct.settmp_WH_CD(struct.getw_WH_CD());
			List tmpList = entity.mselectM_WH.read(conn, struct);
			if(tmpList.size() <= 0) {
				// �o�^�������s�F�ۊǋ�R�[�h�����݂��܂���
				logMessage = "M_WH.WH_CD:" + struct.gettmp_WH_CD();
				setErrorMessage("AF00028", logMessage);
				check = false;
			}
			else{
				AF0040010Struct checkStruct = (AF0040010Struct)tmpList.get(0);
				struct.setw_WH_NAME(checkStruct.getWH_NAME());
				// �ۊǋ�.�H��R�[�h �� ���O�C�����p�ҍH��R�[�h �`�F�b�N
				if(checkStruct.getWH_PLANT_CD().equals(struct.getw_PLANT_CD()) == false){
					// �o�^�������s�F�ۊǋ�R�[�h�͑��̍H��̃f�[�^�Ȃ̂Ŏw��ł��܂���
					listMessage.add("M_WH.WH_CD:" + struct.gettmp_WH_CD());
					listMessage.add("M_WH.PLANT_CD:" +	checkStruct.getWH_PLANT_CD());
					setErrorMessage("AF00029", listMessage);
					listMessage.clear();
					check = false;
				}
				else{
					// �ۊǋ�R�[�h���q�ɂ��`�F�b�N
					if(("1").equals(checkStruct.getMRP_FLG()) == false){
						// �Ǎ��������s�F�o�Ɍ��ۊǋ悪���v�ʌv�Z�Ώۂł͂���܂���
						listMessage.add("M_WH.WH_CD:" + struct.gettmp_WH_CD());
						listMessage.add("M_WH.MRP_FLG:" +  checkStruct.getMRP_FLG());
						setErrorMessage("AF00096", listMessage);
						listMessage.clear();
						check = false;
					}
				}
			}

			// �ۊǋ�ʍ݌ɐ��̃Z�b�g
			//�u���Ԃ���o�ɂ���v��off�̏ꍇ
			if(("0").equals(struct.geth_JOB_ODR()) == true){
				//�ۊǋ�ʕi�ڍ݌ɂ̓Ǎ�
				tmpList = entity.mselectSub1_ITEM_STOCK.read(conn, struct);
				if(tmpList.size() <= 0) {
					// �o�^�������s�F�ۊǋ�ʕi�ڍ݌ɂ����݂��܂���
					listMessage.add("T_ITEM_STOCK.ITEM_CD:" + struct.getITEM_CD());
					listMessage.add("T_ITEM_STOCK.WH_CD:" + struct.getw_WH_CD());
					listMessage.add("T_ITEM_STOCK.PLANT_CD:" + struct.getPLANT_CD());
					setErrorMessage("AF00044", listMessage);
					listMessage.clear();
					check = false;
				}
			}
			else{
				//�ۊǋ�ʐ��ԍ݌ɂ̓Ǎ�
				tmpList = entity.mselectSub1_JOB_ODR_STOCK.read(conn, struct);
				if(tmpList.size() <= 0) {
					// �o�^�������s�F�ۊǋ�ʐ��ԍ݌ɂ����݂��܂���
					listMessage.add("T_JOB_ODR_CD_STOCK.JOB_ODR_CD:" + struct.getw_JOB_ODR_CD());
					listMessage.add("T_JOB_ODR_CD_STOCK.ITEM_CD:" + struct.getITEM_CD());
					listMessage.add("T_JOB_ODR_CD_STOCK.WH_CD:" + struct.getw_WH_CD());
					listMessage.add("T_JOB_ODR_CD_STOCK.PLANT_CD:" + struct.getPLANT_CD());
					setErrorMessage("AF00045", listMessage);
					listMessage.clear();
					check = false;
				}
			}
			if(tmpList.size() > 0) {
				AF0040010Struct workStruct = (AF0040010Struct)tmpList.get(0);
				struct.setw_STOCK_ON_HAND_QTY(workStruct.getw_STOCK_ON_HAND_QTY());
			}


			// �݌ɗ݌v���̃Z�b�g�i�q�ɍ݌ɂ����W�v�j
			//�u���Ԃ���o�ɂ���v��off�̏ꍇ
			if(("0").equals(struct.geth_JOB_ODR()) == true){
				//�ۊǋ�ʕi�ڍ݌ɂ̓Ǎ�
				tmpList = entity.mselectTOTAL_ITEM_STOCK.read(conn, struct);
			}
			else{
				//�ۊǋ�ʐ��ԍ݌ɂ̓Ǎ�
				tmpList = entity.mselectTOTAL_JOB_ODR_STOCK.read(conn, struct);
			}
			if(tmpList.size() > 0){
				AF0040010Struct tmpStruct = (AF0040010Struct)tmpList.get(0);
				struct.setw_TOTAL_STOCK_ON_HAND_QTY(tmpStruct.getw_TOTAL_STOCK_ON_HAND_QTY());
			}

			// �����Ǘ��i�ڂŏo�ɐ��������̏ꍇ�A�����ɐ؂�グ����
			boolean resultCeil = false;

			if(("1").equals(TypeConverter.sanitizer(struct.getUNIT_QTY_TYP())) == true &&
					Calculate.isNumeric(struct.getRCV_ISSUE_QTY()) == true ){
				struct.setRCV_ISSUE_QTY(Calculate.ceil(struct.getRCV_ISSUE_QTY(), 0));
				resultCeil = true;
			}

			// �Ɩ��^�p���̎擾
			tmpList = entity.mselectSYS_DATE_CTRL.read(conn, struct);
			if(tmpList.size() <= 0) {
				// �o�^�������s�F�Ɩ��^�p�������݂��܂���
				logMessage = "SYS_DATE_CTRL.PLANT_CD:" + struct.getw_PLANT_CD();
				setErrorMessage("AF00056", logMessage);
				check = false;
			}
			else{
				AF0040010Struct workStruct = (AF0040010Struct)tmpList.get(0);
				struct.setBUSINESS_OPR_DATE(workStruct.getBUSINESS_OPR_DATE());
				// �o�ɓ��`�F�b�N
				Date issue_Date = stringToDate(struct.getRCV_ISSUE_DATE());
				Date business_Date = stringToDate(workStruct.getBUSINESS_OPR_DATE());
				if(issue_Date.getTime() > business_Date.getTime()){
					// �o�^�������s�F�o�ɓ��ɖ����̓��t�͎w��ł��܂���
					logMessage = "SYS_DATE_CTRL.BUSINESS_OPR_DATE:" + workStruct.getBUSINESS_OPR_DATE();
					setErrorMessage("ZZ05103", logMessage);
					check = false;
				}
			}

			// �o�Ɏw���ԍ����w�肵�ďo�Ɏw����Ǎ�
			AF0040010Struct checkStruct = null;
			AF0040010Struct readStruct = new AF0040010Struct();
			readStruct.setISSUE_INST_CD(struct.getISSUE_INST_CD());
			readStruct.setWORK_ODR_CD((String)null);
			readStruct.setWORK_IN_PROC_CD((String)null);
			readStruct.setOPR_INST_CD((String)null);
			readStruct.setPUCH_ODR_CD((String)null);
			readStruct.setPLANT_CD((String)null);
			tmpList = entity.mselect.read(conn, readStruct);
			if (tmpList.size() <= 0) {
				// �s�C���������s�F�I�����ꂽ�o�Ɏw���f�[�^�����݂��܂���
				logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
				setErrorMessage("ZZ01101", logMessage);
				check = false;
			} else {
				
				AF0040010Struct issueInstStruct = (AF0040010Struct)tmpList.get(0);
				
					// [�o�Ɏw��]�̍H���ۊǏꏊ�R�[�hNull
					if (issueInstStruct.getWH_CD() == null 
							|| "".equals(issueInstStruct.getWH_CD())) {
						if (struct.getWH_CD() != null && "".equals(struct.getWH_CD()) == false) {
							// �o�^�������s�F�o�ɐ�ۊǋ�R�[�h�͓��͂ł��܂���B
							setErrorMessage("AF00138");
							check = false;
						}
					} else {
						if (struct.getWH_CD() == null || "".equals(struct.getWH_CD())) {
							// �o�^�������s�F�o�ɐ�ۊǋ�R�[�h�������͂ł��B
							setErrorMessage("AF00030");
							check = false;
						} else {
							AF0040010Struct whStruct = new AF0040010Struct();
							whStruct.settmp_WH_CD(struct.getWH_CD());
							tmpList = entity.mselectM_WH.read(conn, whStruct);
							if (tmpList.size() <= 0) {
								// �o�^�������s�F�o�ɐ�ۊǋ�R�[�h�����݂��܂���
								logMessage = "M_WH.WH_CD:" + whStruct.gettmp_WH_CD();
								setErrorMessage("AF00031", logMessage);
								check = false;
							} else {
								checkStruct = (AF0040010Struct)tmpList.get(0);
								// �H���ۊǏꏊ.�H��R�[�h �� ���O�C�����p�ҍH��R�[�h �`�F�b�N
								if((checkStruct.getWH_PLANT_CD().equals(getsysPLANT_CD())) == false){
									// �o�^�������s�F�o�ɐ�ۊǋ�R�[�h�͑��̍H��̃f�[�^�Ȃ̂Ŏw��ł��܂���
									listMessage.add("M_WH.WH_CD:" + whStruct.gettmp_WH_CD());
									listMessage.add("M_WH.PLANT_CD:" +  checkStruct.getWH_PLANT_CD());
									setErrorMessage("AF00032", listMessage);
									listMessage.clear();
									check = false;
								} else {
									if ("0".equals(checkStruct.getMRP_FLG()) == false) {
										// �o�^�������s�F�o�ɐ�ۊǋ�R�[�h�ɏ��v�ʌv�Z�Ώۂ̕ۊǋ�͎w��ł��܂���B
										listMessage.add("M_WH.WH_CD:" + whStruct.gettmp_WH_CD());
										listMessage.add("M_WH.MRP_FLG:" +  checkStruct.getMRP_FLG());
										setErrorMessage("AF00139", listMessage);
										listMessage.clear();
										check = false;
									} else {
										
										if ("0".equals(struct.getCONS_TYP())) {
											// �����ۊǋ悪�ݒ肳��Ă���ꍇ�G���[
											if (checkStruct.getWH_VEND_CD() != null 
													&& "".equals(checkStruct.getWH_VEND_CD()) == false) {
												listMessage.add("M_WH.WH_CD:" + whStruct.gettmp_WH_CD());
												listMessage.add("M_WH.VEND_CD:" +  checkStruct.getWH_VEND_CD());
												setErrorMessage("AF00140", listMessage);
												listMessage.clear();
												check = false;
											}
										} else {
											if (issueInstStruct.getVEND_CD() == null 
													|| "".equals(issueInstStruct.getVEND_CD())) {
												if (checkStruct.getWH_VEND_CD() != null 
														&& "".equals(checkStruct.getWH_VEND_CD()) == false) {
													listMessage.add("M_WH.WH_CD:" + whStruct.gettmp_WH_CD());
													listMessage.add("M_WH.VEND_CD:" +  checkStruct.getWH_VEND_CD());
													setErrorMessage("AF00141", listMessage);
													listMessage.clear();
													check = false;
												}
											} else {
												if ((issueInstStruct.getVEND_CD()).equals(
														checkStruct.getWH_VEND_CD()) == false) {
													listMessage.add("M_WH.WH_CD:" + whStruct.gettmp_WH_CD());
													listMessage.add("M_WH.VEND_CD:" +  checkStruct.getWH_VEND_CD());
													setErrorMessage("AF00141", listMessage);
													listMessage.clear();
													check = false;
												}
											}
										}
										
									}
								}
							}
						}
					}
			}
			
			if(msgStruct.sizeError() <= 0){
				// �\�����ڌv�Z����
				calcDisplayItem();
			}
			
			// ���Ԃ܂��͍݌Ɉ����^���Ԃŕi�ڍ݌ɂ���̏o�ɂŢ�o�ɐ������o�ɉ\����̏ꍇ
			if((struct.getMRP_ODR_TYP().equals(AF0040Const._MRP_ODR_JOB_ODR_CD) ||
					struct.getMRP_ODR_TYP().equals(AF0040Const._MRP_ODR_STOCK_ALC_JOB_ODR_CD)) &&
					!struct.getc_JOB_ODR().equals("true")){
				
				if(Calculate.compare(struct.getRCV_ISSUE_QTY(), struct.getTHIS_TIME_ISSUE_POSS_QTY()) == 1){
					listMessage.add("T_ITEM_STOCK.ITEM_CD:" + struct.getITEM_CD());
					listMessage.add("T_ITEM_STOCK.WH_CD:" +  struct.getw_WH_CD());
					setErrorMessage("AF00115", listMessage);
					listMessage.clear();
					check = false;
				}
			}

			// ���Ԃ܂��͍݌Ɉ����^���Ԃő����ԍ݌ɂ���̏o�ɂŢ�o�ɐ������o�ɉ\����̏ꍇ
			if((struct.getMRP_ODR_TYP().equals(AF0040Const._MRP_ODR_JOB_ODR_CD) ||
					struct.getMRP_ODR_TYP().equals(AF0040Const._MRP_ODR_STOCK_ALC_JOB_ODR_CD)) &&
					struct.getc_JOB_ODR().equals("true") &&
					!struct.getw_JOB_ODR_CD().equals(struct.getJOB_ODR_CD())){
				
				if(Calculate.compare(struct.getRCV_ISSUE_QTY(), struct.getTHIS_TIME_ISSUE_POSS_QTY()) == 1){
					listMessage.add("T_JOB_ODR_CD_STOCK.JOB_ODR_CD:" + struct.getw_JOB_ODR_CD());
					listMessage.add("T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO:0");
					listMessage.add("T_JOB_ODR_CD_STOCK.ITEM_CD:" + struct.getITEM_CD());
					listMessage.add("T_JOB_ODR_CD_STOCK.WH_CD:" + struct.getw_WH_CD());
					setErrorMessage("AF00116", listMessage);
					listMessage.clear();
					check = false;
				}
			}

			// �G���[���Ȃ��ꍇ
			if(check == true){
				// �g�����U�N�V�����J�n
				conn.beginTransWeb();
				
				// ���ԕi�̕i�ڍ݌ɖ�����������o�ɂ���ꍇ
				boolean jobOdrAlcFlg = false;
				if(!struct.getc_JOB_ODR().equals("true") &&
						Calculate.compare(struct.getRCV_ISSUE_QTY(), struct.getALC_NOISSUE_QTY()) == 1 &&
						(struct.getMRP_ODR_TYP().equals(AF0040Const._MRP_ODR_JOB_ODR_CD) ||
								struct.getMRP_ODR_TYP().equals(AF0040Const._MRP_ODR_STOCK_ALC_JOB_ODR_CD))){
					// �o�Ɏw�����N���X�ɏ����Z�b�g
					IssueInstStruct issueInstStruct = new IssueInstStruct();
					issueInstStruct.m_OD_NO = struct.getOD_NO();
					issueInstStruct.m_PLANT_CD = getsysPLANT_CD();
					issueInstStruct.m_ITEM_CD = struct.getITEM_CD();
					
					// �X�V���N���X�ɏ����Z�b�g
					UpdateInfo updateInfo = new UpdateInfo(getsysUSER_CD(), this.sp.getProcId(), 0);
					
					// [���Ԉ���]�̒ǉ��E�X�V
					(new JobOdrAlc(conn)).updateAlcQty(issueInstStruct,
							new BigDecimal(struct.getRCV_ISSUE_QTY()), updateInfo);
					
					jobOdrAlcFlg = true;
				}

				// �o�ɏ����c�a�o�^����
				boolean result = insert_issue_process();
				if (result == false) {
					// ���[���o�b�N
					logMessage = "rollback!! ";
					setSyslogConfig(logMessage);
					conn.rollback();
				}
				else{
					// ���ɏ����c�a�o�^����
					result = insert_rcv_process();
					if (result == false) {
						// ���[���o�b�N
						logMessage = "rollback!! ";
						setSyslogConfig(logMessage);
						conn.rollback();
					}
					else{
						// �R�~�b�g
						conn.commit();
						
						// [���Ԉ���]���X�V�����ꍇ
						if(jobOdrAlcFlg){
							setWarningMessage("AD60002", struct.getITEM_CD());
							WhAutoIssueProc.outBusinessMessage(conn, sp.getProcId(),
									getsysUSER_CD(), getsysPLANT_CD(), "AD60003",
									"(SBM0688)�i�ڔԍ�:[" + struct.getITEM_CD() + "]");
						}

						if(resultCeil == true){
							// �o�^�������ʁF�����Ǘ��i�ڂ̂��ߏ����_�ȉ��͐؂�グ���čX�V���܂���
							logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
							setInfoMessage("AF60004", logMessage);
						}

						// �L�[�R�s�[
						struct.copy(_keyStruct);
						// �e��ʃf�[�^�ēǍ�
						controlselect();
					}
				}
			}

		}catch(ParseException e){
			// �ϊ����s
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			
			emsg = new ExpjMessage( "ZZ01006", e.toString());
			sysLog.severe (emsg ,getsysUSER_CD());
			throw ee;

		}catch(SQLException e){
			// ���[���o�b�N
			logMessage = " rollback!! controlinsertSub1(SQLException) ";
			setSyslogConfig(logMessage);
			conn.rollback();

			// �Ǎ��X�e�[�^�X�ݒ�
			setReadStatus(ERROR);
			setSqlExceptionMsg(e);

		}catch(Exception e){
			// ���[���o�b�N
			logMessage = "rollback!! controlinsertSub1(Exception) ";
			setSyslogConfig(logMessage);
			conn.rollback();

			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006" , "ProcessId:" + this.sp.getProcId() );
			ee.add(emsg);
			throw ee;
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlinsertSub1>
		logger.exiting("AF0040010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlcloseSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0040");
		logger.entering("AF0040010Control"+":USER="+struct.getsUser_ID(),"controlcloseSub1");
			//{{user_implement_dev:<controlcloseSub1>
		//------------------------------------------------------------------
		// �L�[�R�s�[
		struct.copy(_keyStruct);

		// �e��ʃf�[�^�ēǍ�
		controlselect();
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlcloseSub1>
		logger.exiting("AF0040010Control"+":USER="+struct.getsUser_ID(),"controlcloseSub1");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlinsertSub2() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0040");
		logger.entering("AF0040010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub2");
			//{{user_implement_dev:<controlinsertSub2>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		//------------------------------------------------------------------
		// ���O�o�͏��i�[�p
		String logMessage = "";
		List listMessage = new ArrayList();

		try {
			// �N���A
			struct.setw_WH_NAME((String)null);
			struct.setWH_NAME((String)null);
			struct.setw_STOCK_ON_HAND_QTY(new String("0.0"));
			struct.setw_TOTAL_STOCK_ON_HAND_QTY(new String("0.0"));
			
			// �l�̏�����
			struct.setITEM_STOCK_NON_ALC_QTY("0.0");
			struct.setODR_ISSUE_POSS_QTY("0.0");
			struct.setALC_NOISSUE_QTY("0.0");
			struct.setTHIS_TIME_ISSUE_POSS_QTY("0.0");

			// �`�F�b�N���ʊi�[
			boolean check = true;	
			
			// ���Y���̉ߋ��̎��ѓ��͂̐����`�F�b�N
			if(getSysParameter() == false){	
				if(chkProcExecDate("1","",struct.getRCV_ISSUE_DATE()) == false){
					setErrorMessage(ProcExecDateError);
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
					return;
				}
			}
			
			// �V�X�e���p�����[�^�̏ܖ������`�F�b�N�t���O���擾
			List sysParaList = entity.mSYS_PARAMETER.read(conn, struct);
			if(sysParaList.size() > 0){
				AF0040010Struct sysParaStruct = (AF0040010Struct)sysParaList.get(0);
				struct.setBEST_BEFORE_DATE_CHECK_FLG(sysParaStruct.getBEST_BEFORE_DATE_CHECK_FLG());
			}else{
				struct.setBEST_BEFORE_DATE_CHECK_FLG("1");
			}
			
			// �ۊǋ�R�[�h�̑��݃`�F�b�N
			struct.settmp_WH_CD(struct.getw_WH_CD());
			List tmpList = entity.mselectM_WH.read(conn, struct);
			if(tmpList.size() <= 0) {
				// �o�^�������s�F�ۊǋ�R�[�h�����݂��܂���
				logMessage = "M_WH.WH_CD:" + struct.gettmp_WH_CD();
				setErrorMessage("AF00028", logMessage);
				check = false;
			}
			else{
				AF0040010Struct checkStruct = (AF0040010Struct)tmpList.get(0);
				struct.setw_WH_NAME(checkStruct.getWH_NAME());
				struct.setWH_TYP(checkStruct.getWH_TYP());
				// �ۊǋ�.�H��R�[�h �� ���O�C�����p�ҍH��R�[�h �`�F�b�N
				if(checkStruct.getWH_PLANT_CD().equals(struct.getw_PLANT_CD()) == false){
					// �o�^�������s�F�ۊǋ�R�[�h�͑��̍H��̃f�[�^�Ȃ̂Ŏw��ł��܂���
					listMessage.add("M_WH.WH_CD:" + struct.gettmp_WH_CD());
					listMessage.add("M_WH.PLANT_CD:" +	checkStruct.getWH_PLANT_CD());
					setErrorMessage("AF00029", listMessage);
					listMessage.clear();
					check = false;
				}
				else{
					// �ۊǋ�R�[�h���q�ɂ��`�F�b�N
					if(("1").equals(checkStruct.getMRP_FLG()) == false){
						// �Ǎ��������s�F�o�Ɍ��ۊǋ悪���v�ʌv�Z�Ώۂł͂���܂���
						listMessage.add("M_WH.WH_CD:" + struct.gettmp_WH_CD());
						listMessage.add("M_WH.MRP_FLG:" +  checkStruct.getMRP_FLG());
						setErrorMessage("AF00096", listMessage);
						listMessage.clear();
						check = false;
					}
				}
			}

			// �݌Ƀ��b�g�ԍ��̑��݃`�F�b�N
			tmpList = null;
			tmpList = entity.mT_LOT_CTRL.read(conn, struct);
			if (tmpList.size() <= 0) {
				logMessage = "T_LOT_CTRL.LOT_NO:" + struct.getLOT_NO();
				setErrorMessage("AF20002", logMessage);
				check = false;
			}
			
			// [���b�g�Ǘ�].�h�ܖ������h�� �u�o�ɓ��v�|[�o�Ɏw��]�D�g�i�ڔԍ��h��[�i��].�h�ܖ��������[�h�^�C���h�ł���
			//[�p�����[�^].�h ���O�h���f BEST_BEFORE_DATE_CHECK_FLG�f��1:�G���[�̏ꍇ�A�G���[���b�Z�[�W��\������
			
			boolean resultBbdcFlg = false;//�݌Ƀ��b�g�ԍ���NULL�łȂ��o�ɐ���0�ȊO���ܖ��������؂�Ă���ꍇ��ture
			
			List bbdList = entity.mc_BEST_BEFORE_DATE.read(conn, struct);
			if(bbdList.size() > 0){
				AF0040010Struct bbdStruct = (AF0040010Struct)bbdList.get(0);
				if(bbdStruct.getBBD_c_FLG().equals("1")){//2:�x���̏ꍇ�̂��߂Ƀt���O��"true"�ɂ���
					resultBbdcFlg = true;
				}
				if(resultBbdcFlg && struct.getBEST_BEFORE_DATE_CHECK_FLG().equals("1")){
					//�ܖ��������؂�Ă��邽�ߏo�ɂł��܂���B
					logMessage = "T_LOT_CTRL.LOT_NO:" + struct.getLOT_NO();
					setErrorMessage("AF20009", logMessage);
					check = false;
				}
			}
			
			// �ۊǋ�ʍ݌ɐ��̃Z�b�g
			//�ۊǋ�ʕi�ڍ݌ɂ̓Ǎ�
			tmpList = entity.mselectSub1_ITEM_STOCK.read(conn, struct);
			if(tmpList.size() <= 0) {
				// �o�^�������s�F�ۊǋ�ʕi�ڍ݌ɂ����݂��܂���
				listMessage.add("T_ITEM_STOCK.ITEM_CD:" + struct.getITEM_CD());
				listMessage.add("T_ITEM_STOCK.WH_CD:" + struct.getw_WH_CD());
				listMessage.add("T_ITEM_STOCK.PLANT_CD:" + struct.getPLANT_CD());
				setErrorMessage("AF00044", listMessage);
				listMessage.clear();
				check = false;
			}
			if(tmpList.size() > 0) {
				AF0040010Struct workStruct = (AF0040010Struct)tmpList.get(0);
				struct.setw_STOCK_ON_HAND_QTY(workStruct.getw_STOCK_ON_HAND_QTY());
			}


			// �݌ɗ݌v���̃Z�b�g�i�q�ɍ݌ɂ����W�v�j
			//�ۊǋ�ʕi�ڍ݌ɂ̓Ǎ�
			tmpList = entity.mselectTOTAL_ITEM_STOCK.read(conn, struct);
			if(tmpList.size() > 0){
				AF0040010Struct tmpStruct = (AF0040010Struct)tmpList.get(0);
				struct.setw_TOTAL_STOCK_ON_HAND_QTY(tmpStruct.getw_TOTAL_STOCK_ON_HAND_QTY());
			}

			// �����Ǘ��i�ڂŏo�ɐ��������̏ꍇ�A�����ɐ؂�グ����
			boolean resultCeil = false;

			if(("1").equals(TypeConverter.sanitizer(struct.getUNIT_QTY_TYP())) == true &&
					Calculate.isNumeric(struct.getRCV_ISSUE_QTY()) == true ){
				struct.setRCV_ISSUE_QTY(Calculate.ceil(struct.getRCV_ISSUE_QTY(), 0));
				resultCeil = true;
			}



			// �o�Ɏw���ԍ����w�肵�ďo�Ɏw����Ǎ�
			AF0040010Struct checkStruct = null;
			AF0040010Struct readStruct = new AF0040010Struct();
			readStruct.setISSUE_INST_CD(struct.getISSUE_INST_CD());
			readStruct.setWORK_ODR_CD((String)null);
			readStruct.setWORK_IN_PROC_CD((String)null);
			readStruct.setOPR_INST_CD((String)null);
			readStruct.setPUCH_ODR_CD((String)null);
			readStruct.setPLANT_CD((String)null);
			readStruct.setLOT_CTRL_FLG((String)null);
			tmpList = entity.mselect.read(conn, readStruct);
			if (tmpList.size() <= 0) {
				// �s�C���������s�F�I�����ꂽ�o�Ɏw���f�[�^�����݂��܂���
				logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
				setErrorMessage("ZZ01101", logMessage);
				check = false;
			} else {
				
				AF0040010Struct issueInstStruct = (AF0040010Struct)tmpList.get(0);
				
					// [�o�Ɏw��]�̍H���ۊǏꏊ�R�[�hNull
					if (issueInstStruct.getWH_CD() == null 
							|| "".equals(issueInstStruct.getWH_CD())) {
						if (struct.getWH_CD() != null && "".equals(struct.getWH_CD()) == false) {
							// �o�^�������s�F�o�ɐ�ۊǋ�R�[�h�͓��͂ł��܂���B
							setErrorMessage("AF00138");
							check = false;
						}
					} else {
						if (struct.getWH_CD() == null || "".equals(struct.getWH_CD())) {
							// �o�^�������s�F�o�ɐ�ۊǋ�R�[�h�������͂ł��B
							setErrorMessage("AF00030");
							check = false;
						} else {
							AF0040010Struct whStruct = new AF0040010Struct();
							whStruct.settmp_WH_CD(struct.getWH_CD());
							tmpList = entity.mselectM_WH.read(conn, whStruct);
							if (tmpList.size() <= 0) {
								// �o�^�������s�F�o�ɐ�ۊǋ�R�[�h�����݂��܂���
								logMessage = "M_WH.WH_CD:" + whStruct.gettmp_WH_CD();
								setErrorMessage("AF00031", logMessage);
								check = false;
							} else {
								checkStruct = (AF0040010Struct)tmpList.get(0);
								// �H���ۊǏꏊ.�H��R�[�h �� ���O�C�����p�ҍH��R�[�h �`�F�b�N
								if((checkStruct.getWH_PLANT_CD().equals(getsysPLANT_CD())) == false){
									// �o�^�������s�F�o�ɐ�ۊǋ�R�[�h�͑��̍H��̃f�[�^�Ȃ̂Ŏw��ł��܂���
									listMessage.add("M_WH.WH_CD:" + whStruct.gettmp_WH_CD());
									listMessage.add("M_WH.PLANT_CD:" +  checkStruct.getWH_PLANT_CD());
									setErrorMessage("AF00032", listMessage);
									listMessage.clear();
									check = false;
								} else {
									if ("0".equals(checkStruct.getMRP_FLG()) == false) {
										// �o�^�������s�F�o�ɐ�ۊǋ�R�[�h�ɏ��v�ʌv�Z�Ώۂ̕ۊǋ�͎w��ł��܂���B
										listMessage.add("M_WH.WH_CD:" + whStruct.gettmp_WH_CD());
										listMessage.add("M_WH.MRP_FLG:" +  checkStruct.getMRP_FLG());
										setErrorMessage("AF00139", listMessage);
										listMessage.clear();
										check = false;
									} else {
										
										if ("0".equals(struct.getCONS_TYP())) {
											// �����ۊǋ悪�ݒ肳��Ă���ꍇ�G���[
											if (checkStruct.getWH_VEND_CD() != null 
													&& "".equals(checkStruct.getWH_VEND_CD()) == false) {
												listMessage.add("M_WH.WH_CD:" + whStruct.gettmp_WH_CD());
												listMessage.add("M_WH.VEND_CD:" +  checkStruct.getWH_VEND_CD());
												setErrorMessage("AF00140", listMessage);
												listMessage.clear();
												check = false;
											}
										} else {
											if (issueInstStruct.getVEND_CD() == null 
													|| "".equals(issueInstStruct.getVEND_CD())) {
												if (checkStruct.getWH_VEND_CD() != null 
														&& "".equals(checkStruct.getWH_VEND_CD()) == false) {
													listMessage.add("M_WH.WH_CD:" + whStruct.gettmp_WH_CD());
													listMessage.add("M_WH.VEND_CD:" +  checkStruct.getWH_VEND_CD());
													setErrorMessage("AF00141", listMessage);
													listMessage.clear();
													check = false;
												}
											} else {
												if ((issueInstStruct.getVEND_CD()).equals(
														checkStruct.getWH_VEND_CD()) == false) {
													listMessage.add("M_WH.WH_CD:" + whStruct.gettmp_WH_CD());
													listMessage.add("M_WH.VEND_CD:" +  checkStruct.getWH_VEND_CD());
													setErrorMessage("AF00141", listMessage);
													listMessage.clear();
													check = false;
												}
											}
										}
										
									}
								}
							}
						}
					}
			}
			

			// �G���[���Ȃ��ꍇ
			if(check == true){
				// �g�����U�N�V�����J�n
				conn.beginTransWeb();
				
				// ���ԁA���[�J���b�g�ԍ��̃N���A
				struct.setw_JOB_ODR_CD(null);
				struct.setVEND_LOT_NO(null);

				// �o�ɏ����c�a�o�^����
				boolean result = insert_issue_process();
				if (result == false) {
					// ���[���o�b�N
					logMessage = "rollback!! ";
					setSyslogConfig(logMessage);
					conn.rollback();
				}
				else{
					// ���ɏ����c�a�o�^����
					result = insert_rcv_process();
					if (result == false) {
						// ���[���o�b�N
						logMessage = "rollback!! ";
						setSyslogConfig(logMessage);
						conn.rollback();
					}
					else{
						// �o�Ɏ��і��ׂւ̓o�^
						// �o�ɐ����O�̏ꍇ�́A�o�^�E�X�V���s��Ȃ�
						if (struct.getRCV_ISSUE_QTY() != null 
								&& !"".equals(struct.getRCV_ISSUE_QTY())
								&& Calculate.compare(struct.getRCV_ISSUE_QTY(), "0") != 0) {
							//  �f�[�^�����݂��Ȃ��ꍇ�o�^�A���݂���ꍇ�X�V
							List lockList = entity.mT_LOT_ISSUE_INST_Lock.read(conn, struct);
							if (lockList.size() <= 0) {
								entity.mT_LOT_ISSUE_INST.create(conn, struct);

							} else {
								AF0040010Struct lockStruct = new AF0040010Struct();
								lockStruct = (AF0040010Struct)lockList.get(0);
								// �o�Ɏ��ѐ��ʂ̌v�Z
								//  [�o�Ɏ��і���]."�o�Ɏ��ѐ�" + ��ʁu�o�ɐ��v 
								String rcvIssueQty = "0";
								rcvIssueQty = Calculate.add(
										lockStruct.getISSUE_QTY(),
										struct.getRCV_ISSUE_QTY());
								struct.setISSUE_QTY(rcvIssueQty);	
								
								entity.mT_LOT_ISSUE_INST.update(conn, struct);
							}
						}
							
						// �R�~�b�g
						conn.commit();
						
						// [���b�g�Ǘ�].�h�ܖ������h�� �u�o�ɓ��v�|[�o�Ɏw��]�D�g�i�ڔԍ��h��[�i��].�h�ܖ��������[�h�^�C���h�ł���
						//[�p�����[�^].�h ���O�h���f BEST_BEFORE_DATE_CHECK_FLG�f��2:�x���̏ꍇ�A�x�����b�Z�[�W��\������
						if(struct.getBEST_BEFORE_DATE_CHECK_FLG().equals("2") && (resultBbdcFlg == true)){
							// �ܖ������؂�̏o�ɂ��s���܂����B
							logMessage = "T_LOT_CTRL.LOT_NO:" + struct.getLOT_NO();
							setWarningMessage("AF20010", logMessage);
						}
						
						if(resultCeil == true){
							// �o�^�������ʁF�����Ǘ��i�ڂ̂��ߏ����_�ȉ��͐؂�グ���čX�V���܂���
							logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
							setInfoMessage("AF60004", logMessage);
						}
																
						// �L�[�R�s�[
						struct.copy(_keyStruct);
						// �e��ʃf�[�^�ēǍ�
						controlselect();

					}
				}
			}

		}catch(SQLException e){
			// ���[���o�b�N
			logMessage = " rollback!! controlinsertSub1(SQLException) ";
			setSyslogConfig(logMessage);
			conn.rollback();

			// �Ǎ��X�e�[�^�X�ݒ�
			setReadStatus(ERROR);
			setSqlExceptionMsg(e);

		}catch(Exception e){
			// ���[���o�b�N
			logMessage = "rollback!! controlinsertSub1(Exception) ";
			setSyslogConfig(logMessage);
			conn.rollback();

			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006" , "ProcessId:" + this.sp.getProcId() );
			ee.add(emsg);
			throw ee;
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlinsertSub2>
		logger.exiting("AF0040010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub2");

		return;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelectSub2() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0040");
		logger.entering("AF0040010Control"+":USER="+struct.getsUser_ID(),"controlSelectSub2");
			//{{user_implement_dev:<controlSelectSub2>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		//------------------------------------------------------------------
		// ���O�o�͏��i�[�p
		String logMessage = "";
		List listMessage = new ArrayList();

		boolean check = true;		// �`�F�b�N���ʊi�[

		try {

			// �L�[���ڃ��O�\��
			logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
			setSyslogConfig(logMessage);

			List tmpList = null;
			
			// �o�Ɍ��ۊǋ於�̃N���A
			struct.setw_WH_NAME(null);

			// �o�Ɍ��ۊǋ�R�[�h�̑��݃`�F�b�N
			if(struct.getw_WH_CD() != null && !("").equals(struct.getw_WH_CD())){
				struct.settmp_WH_CD(struct.getw_WH_CD());
				tmpList = entity.mselectM_WH.read(conn, struct);
				if(tmpList.size() <= 0) {
					// �o�^�������s�F�ۊǋ�R�[�h�����݂��܂���
					logMessage = "M_WH.WH_CD:" + struct.gettmp_WH_CD();
					setErrorMessage("AF00028", logMessage);
					check = false;
				}
				else{
					AF0040010Struct checkStruct = (AF0040010Struct)tmpList.get(0);
					struct.setw_WH_NAME(checkStruct.getWH_NAME());
					struct.setWH_TYP(checkStruct.getWH_TYP());
					// �ۊǋ�.�H��R�[�h �� ���O�C�����p�ҍH��R�[�h �`�F�b�N
					if(checkStruct.getWH_PLANT_CD().equals(struct.getw_PLANT_CD()) == false){
						// �o�^�������s�F�ۊǋ�R�[�h�͑��̍H��̃f�[�^�Ȃ̂Ŏw��ł��܂���
						listMessage.add("M_WH.WH_CD:" + struct.gettmp_WH_CD());
						listMessage.add("M_WH.PLANT_CD:" +	checkStruct.getWH_PLANT_CD());
						setErrorMessage("AF00029", listMessage);
						listMessage.clear();
						check = false;
					}
					else{
						// �ۊǋ�R�[�h���q�ɂ��`�F�b�N
						if(("1").equals(checkStruct.getMRP_FLG()) == false){
							// �Ǎ��������s�F�o�Ɍ��ۊǋ悪���v�ʌv�Z�Ώۂł͂���܂���
							listMessage.add("M_WH.WH_CD:" + struct.gettmp_WH_CD());
							listMessage.add("M_WH.MRP_FLG:" +  checkStruct.getMRP_FLG());
							setErrorMessage("AF00096", listMessage);
							listMessage.clear();
							check = false;
						}
					}
				}
			}


			// �݌Ƀ��b�g�ԍ��̑��݃`�F�b�N
			if (struct.getLOT_NO() != null 
					&& !("").equals(struct.getLOT_NO())) {
				tmpList = null;
				tmpList = entity.mT_LOT_CTRL.read(conn, struct);
				if (tmpList.size() <= 0) {
					logMessage = "T_LOT_CTRL.LOT_NO:" + struct.getLOT_NO();
					setErrorMessage("AF20002", logMessage);
					check = false;
				}
			}
			
			//���X�g�N���A
			if (list != null) {
				list.clear();
			}
			if (issueList != null) {
				issueList.clear();
			}
			
			 // �G���[������ΏI��
            if (msgStruct.hasError()) {
             return;
            }
    			// �\���ő�s����������
    			ScreenParam sp = new ScreenParam(this.getClass());
    			// �ő�\���s��
    			int maxLine = sp.getMaxLine(conn,20);
    			if (maxLine != 0){
    				struct.setROW_COUNT(String.valueOf(maxLine));
    			}
				else{
					struct.setROW_COUNT(null);
				}
				list=entity.mT_LOT_STOCKCnt.read(conn, struct);
				long rowCount=Long.parseLong(((AF0040010Struct)list.get(0)).getl_COUNT());
				if (rowCount!=0) {
				    if(maxLine != 0 && rowCount== maxLine+1){
				    	if(list!=null&&list.size()>0){
				    		 this.list.clear();
				    	}
    				   setReadStatus(TOO_MANY);  
    				   logMessage = "";
    				   setErrorMessage("ZZ01115", "", ""+maxLine);
    			   }else{
    					//���b�g�ʍ݌Ɉꗗ�̎擾
    			        list = entity.mT_LOT_STOCK.read(conn, struct);
    			   }
				}
    			// �ő�\���s��
    			maxLine = sp.getMaxLine(conn,21);
    			if (maxLine != 0){
    				struct.setROW_COUNT(String.valueOf(maxLine));
    			}
				else{
					struct.setROW_COUNT(null);
				}
			    issueList=entity.mT_LOT_ISSUE_INSTCnt.read(conn, struct);
				rowCount=Long.parseLong(((AF0040010Struct)issueList.get(0)).getl_COUNT());
				if (rowCount!=0) {
				   if(maxLine != 0 && rowCount== maxLine+1){
					   if(issueList!=null&&issueList.size()>0){
						   this.issueList.clear();
				    	}
    				setReadStatus(TOO_MANY);
    				logMessage = "";
    				setErrorMessage("ZZ01115", "", ""+maxLine);
				   }else{
						//�o�Ɏ��і��׈ꗗ�̎擾
				        issueList = entity.mT_LOT_ISSUE_INST.read(conn, struct);	   
				   }
				}
			// �Ǎ����ɁA�ŐV�̏ڍ׃E�B���h�E�f�[�^���擾����
            AF0040010Struct detailStruct = new AF0040010Struct();
            detailStruct.setISSUE_INST_CD(struct.getISSUE_INST_CD());
            detailStruct.setWORK_ODR_CD((String)null);
            detailStruct.setWORK_IN_PROC_CD((String)null);
            detailStruct.setOPR_INST_CD((String)null);
            detailStruct.setPUCH_ODR_CD((String)null);
            detailStruct.setPLANT_CD((String)null);
            detailStruct.setLOT_CTRL_FLG((String)null);

            List detailList = new ArrayList();
            detailList = entity.mselect.read(conn, detailStruct);
			if(detailList.size() > 0) {
				detailStruct = new AF0040010Struct();
				detailStruct = (AF0040010Struct)detailList.get(0);
				
				struct.setITEM_CD(detailStruct.getITEM_CD());
				struct.setITEM_NAME(detailStruct.getITEM_NAME());
				struct.setDRAW_CD(detailStruct.getDRAW_CD());
				struct.setSPEC(detailStruct.getSPEC());
				struct.setISSUE_INST_QTY(detailStruct.getISSUE_INST_QTY());
				struct.setTOTAL_ISSUE_QTY(detailStruct.getTOTAL_ISSUE_QTY());
				struct.setw_SHIP_REMAIN_QTY(detailStruct.getw_SHIP_REMAIN_QTY());
				// �x���敪�ɕ\������\�����̐ݒ�
				setConsTypeValue(detailStruct);
				struct.setw_CONS_TYP_NAME(detailStruct.getw_CONS_TYP_NAME());
				//�����t���O�̃Z�b�g
				struct.setISSUE_CMPLT_FLG(detailStruct.getISSUE_CMPLT_FLG());
			}
		} catch (SQLException e) {
			setSqlExceptionMsg(e);

		} finally {
			// ���[�h�ݒ�
			if (check == true) {
				setReadStatus(NORMAL);
			}
		}
                //}}user_implement_dev:<controlSelectSub2>
		logger.exiting("AF0040010Control"+":USER="+struct.getsUser_ID(),"controlSelectSub2");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlcloseSub2() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0040");
		logger.entering("AF0040010Control"+":USER="+struct.getsUser_ID(),"controlcloseSub2");
			//{{user_implement_dev:<controlcloseSub2>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		//------------------------------------------------------------------
		// �L�[�R�s�[
		struct.copy(_keyStruct);

		// �e��ʃf�[�^�ēǍ�
		controlselect();
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlcloseSub2>
		logger.exiting("AF0040010Control"+":USER="+struct.getsUser_ID(),"controlcloseSub2");

		return;
	}

	/**
	 * �ڍ׃{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlDetail() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0040");
		logger.entering("AF0040010Control"+":USER="+struct.getsUser_ID(),"controlDetail");
			//{{user_implement_dev:<controlDetail>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlDetail>
		logger.exiting("AF0040010Control"+":USER="+struct.getsUser_ID(),"controlDetail");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0040");
		logger.entering("AF0040010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AF0040010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0040");
		logger.entering("AF0040010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		//------------------------------------------------------------------
		// ���[�U��`������
		usersInitialize();
		
		try {
			// ���b�g�Ǘ������σ`�F�b�N
			if (LotCtrl.checkLotCtrl(conn)) {
				lotCtrl = "true";
				// ���b�g�Ǘ��t���O��ݒ肷��
				List sysParaLotFlgList = entity.mSYS_PARAM_LOT_FLG.read(conn, struct);
				if(sysParaLotFlgList.size() > 0){
					AF0040010Struct sysParaStruct = (AF0040010Struct)sysParaLotFlgList.get(0);
					struct.setLOT_CTRL_FLG(sysParaStruct.getLOT_CTRL_FLG());
				}else{
					// �����l
					struct.setLOT_CTRL_FLG("0");
				}
			} else {
			    lotCtrl = "false";
			    struct.setLOT_CTRL_FLG("0");
			}
			// ��ЃR�[�h�擾
			_company_cd = SystemInformation.getSysMyCompanyCd();
		} catch (SQLException e) {	
			ExpjMessage emsg = new ExpjMessage( "ZZ01006" ,"(SBM0991)���b�g�Ǘ��t���O�̎擾�Ɏ��s���܂����B");
			msgStruct.addWarn( emsg );
			sysLog.info(emsg, getsysUSER_CD());
		}
		
			//------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AF0040010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0040");
		logger.entering("AF0040010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AF0040010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("modify") ) {
				controlmodify();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("selectSub1") ) {
				controlselectSub1();
			} else if( button.equals("insertSub1") ) {
				controlinsertSub1();
			} else if( button.equals("closeSub1") ) {
				controlcloseSub1();
			} else if( button.equals("insertSub2") ) {
				controlinsertSub2();
			} else if( button.equals("SelectSub2") ) {
				controlSelectSub2();
			} else if( button.equals("closeSub2") ) {
				controlcloseSub2();
			} else if( button.equals("Detail") ) {
				controlDetail();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
		//------------------------------------------------------------------
		//�R���{�{�b�N�X�Ɏ擾�f�[�^�ݒ�
		struct.setList_ISSUE_CMPLT_FLG_val(_ISSUE_CMPLT_FLG.getValList());
		struct.setList_ISSUE_CMPLT_FLG_name(_ISSUE_CMPLT_FLG.getExplanList());
		struct.setList_CONS_TYP_val(_CONS_TYP.getValList());
		struct.setList_CONS_TYP_name(_CONS_TYP.getExplanList());
		struct.setList_LOT_CTRL_FLG_val(_LOT_CTRL_FLG.getValList());
		struct.setList_LOT_CTRL_FLG_name(_LOT_CTRL_FLG.getExplanList());
		struct.seth_lotCtrl(lotCtrl);

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
//			throw new FoundationException("AF0040010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0040010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AF0040010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0040010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AF0040010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0040010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AF0040010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AF0040010Entity entity;
	protected AF0040010Struct struct;
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

		entity = new AF0040010Entity();
		struct = new AF0040010Struct();

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
	 * AF0040010�N���X�̕W���R���X�g���N�^
	 */
	public AF0040010Control() throws BusinessProcessException, FoundationException
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
				AF0040010Struct key = (AF0040010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("h_JOB_ODR") && key.geth_JOB_ODR() != null) {
					msgKey.setKeyValue("h_JOB_ODR", key.geth_JOB_ODR());
				}
				if(msgKeyType.containsKeyColumn("w_WH_NAME") && key.getw_WH_NAME() != null) {
					msgKey.setKeyValue("w_WH_NAME", key.getw_WH_NAME());
				}
				if(msgKeyType.containsKeyColumn("h_SHIP_COMPLETE") && key.geth_SHIP_COMPLETE() != null) {
					msgKey.setKeyValue("h_SHIP_COMPLETE", key.geth_SHIP_COMPLETE());
				}
				if(msgKeyType.containsKeyColumn("r_SELECT_CHOICE_0") && key.getr_SELECT_CHOICE_0() != null) {
					msgKey.setKeyValue("r_SELECT_CHOICE_0", key.getr_SELECT_CHOICE_0());
				}
				if(msgKeyType.containsKeyColumn("r_SELECT_CHOICE_1") && key.getr_SELECT_CHOICE_1() != null) {
					msgKey.setKeyValue("r_SELECT_CHOICE_1", key.getr_SELECT_CHOICE_1());
				}
				if(msgKeyType.containsKeyColumn("c_JOB_ODR") && key.getc_JOB_ODR() != null) {
					msgKey.setKeyValue("c_JOB_ODR", key.getc_JOB_ODR());
				}
				if(msgKeyType.containsKeyColumn("c_SHIP_COMPLETE") && key.getc_SHIP_COMPLETE() != null) {
					msgKey.setKeyValue("c_SHIP_COMPLETE", key.getc_SHIP_COMPLETE());
				}
				if(msgKeyType.containsKeyColumn("w_ISSUE_CMPLT_FLG_NAME") && key.getw_ISSUE_CMPLT_FLG_NAME() != null) {
					msgKey.setKeyValue("w_ISSUE_CMPLT_FLG_NAME", key.getw_ISSUE_CMPLT_FLG_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_CONS_TYP_NAME") && key.getw_CONS_TYP_NAME() != null) {
					msgKey.setKeyValue("w_CONS_TYP_NAME", key.getw_CONS_TYP_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_CHOICE") && key.getw_CHOICE() != null) {
					msgKey.setKeyValue("w_CHOICE", key.getw_CHOICE());
				}
				if(msgKeyType.containsKeyColumn("ITEM_STOCK_NON_ALC_QTY") && key.getITEM_STOCK_NON_ALC_QTY() != null) {
					msgKey.setKeyValue("ITEM_STOCK_NON_ALC_QTY", key.getITEM_STOCK_NON_ALC_QTY());
				}
				if(msgKeyType.containsKeyColumn("ODR_ISSUE_POSS_QTY") && key.getODR_ISSUE_POSS_QTY() != null) {
					msgKey.setKeyValue("ODR_ISSUE_POSS_QTY", key.getODR_ISSUE_POSS_QTY());
				}
				if(msgKeyType.containsKeyColumn("ALC_NOISSUE_QTY") && key.getALC_NOISSUE_QTY() != null) {
					msgKey.setKeyValue("ALC_NOISSUE_QTY", key.getALC_NOISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("THIS_TIME_ISSUE_POSS_QTY") && key.getTHIS_TIME_ISSUE_POSS_QTY() != null) {
					msgKey.setKeyValue("THIS_TIME_ISSUE_POSS_QTY", key.getTHIS_TIME_ISSUE_POSS_QTY());
				}
				if(msgKeyType.containsKeyColumn("WH_FLG") && key.getWH_FLG() != null) {
					msgKey.setKeyValue("WH_FLG", key.getWH_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_WH_CD") && key.geth_WH_CD() != null) {
					msgKey.setKeyValue("h_WH_CD", key.geth_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("h_lotCtrl") && key.geth_lotCtrl() != null) {
					msgKey.setKeyValue("h_lotCtrl", key.geth_lotCtrl());
				}
				if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG_name") && key.getLOT_CTRL_FLG_name() != null) {
					msgKey.setKeyValue("LOT_CTRL_FLG_name", key.getLOT_CTRL_FLG_name());
				}
				if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG_val") && key.getLOT_CTRL_FLG_val() != null) {
					msgKey.setKeyValue("LOT_CTRL_FLG_val", key.getLOT_CTRL_FLG_val());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_CD") && key.getw_PLANT_CD() != null) {
					msgKey.setKeyValue("w_PLANT_CD", key.getw_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("tmp_WH_CD") && key.gettmp_WH_CD() != null) {
					msgKey.setKeyValue("tmp_WH_CD", key.gettmp_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("tmp_RCV_ISSUE_QTY") && key.gettmp_RCV_ISSUE_QTY() != null) {
					msgKey.setKeyValue("tmp_RCV_ISSUE_QTY", key.gettmp_RCV_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_FLG_name") && key.getISSUE_CMPLT_FLG_name() != null) {
					msgKey.setKeyValue("ISSUE_CMPLT_FLG_name", key.getISSUE_CMPLT_FLG_name());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_FLG_val") && key.getISSUE_CMPLT_FLG_val() != null) {
					msgKey.setKeyValue("ISSUE_CMPLT_FLG_val", key.getISSUE_CMPLT_FLG_val().toString());
				}
				if(msgKeyType.containsKeyColumn("CONS_TYP_name") && key.getCONS_TYP_name() != null) {
					msgKey.setKeyValue("CONS_TYP_name", key.getCONS_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("CONS_TYP_val") && key.getCONS_TYP_val() != null) {
					msgKey.setKeyValue("CONS_TYP_val", key.getCONS_TYP_val().toString());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD_GNR_TYP") && key.getOPR_INST_CD_GNR_TYP() != null) {
					msgKey.setKeyValue("OPR_INST_CD_GNR_TYP", key.getOPR_INST_CD_GNR_TYP());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD") && key.getOPR_INST_CD() != null) {
					msgKey.setKeyValue("OPR_INST_CD", key.getOPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_CD") && key.getWORK_ODR_CD() != null) {
					msgKey.setKeyValue("WORK_ODR_CD", key.getWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE") && key.getOPR_INST_START_DATE() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATE", key.getOPR_INST_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE") && key.getWORK_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("WORK_ODR_DLV_DATE", key.getWORK_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_QTY") && key.getOPR_INST_QTY() != null) {
					msgKey.setKeyValue("OPR_INST_QTY", key.getOPR_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("WS_NAME") && key.getWS_NAME() != null) {
					msgKey.setKeyValue("WS_NAME", key.getWS_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD") && key.getWORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("WORK_IN_PROC_CD", key.getWORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("PROC_NAME") && key.getPROC_NAME() != null) {
					msgKey.setKeyValue("PROC_NAME", key.getPROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_ANAME") && key.getVEND_ANAME() != null) {
					msgKey.setKeyValue("VEND_ANAME", key.getVEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_CD") && key.getISSUE_INST_CD() != null) {
					msgKey.setKeyValue("ISSUE_INST_CD", key.getISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_QTY") && key.getISSUE_INST_QTY() != null) {
					msgKey.setKeyValue("ISSUE_INST_QTY", key.getISSUE_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY") && key.getTOTAL_ISSUE_QTY() != null) {
					msgKey.setKeyValue("TOTAL_ISSUE_QTY", key.getTOTAL_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("w_SHIP_REMAIN_QTY") && key.getw_SHIP_REMAIN_QTY() != null) {
					msgKey.setKeyValue("w_SHIP_REMAIN_QTY", key.getw_SHIP_REMAIN_QTY());
				}
				if(msgKeyType.containsKeyColumn("SCDL_ISSUE_DATE") && key.getSCDL_ISSUE_DATE() != null) {
					msgKey.setKeyValue("SCDL_ISSUE_DATE", key.getSCDL_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_DATE") && key.getISSUE_CMPLT_DATE() != null) {
					msgKey.setKeyValue("ISSUE_CMPLT_DATE", key.getISSUE_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_FLG") && key.getISSUE_CMPLT_FLG() != null) {
					msgKey.setKeyValue("ISSUE_CMPLT_FLG", key.getISSUE_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("CONS_TYP") && key.getCONS_TYP() != null) {
					msgKey.setKeyValue("CONS_TYP", key.getCONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("DRAW_CD") && key.getDRAW_CD() != null) {
					msgKey.setKeyValue("DRAW_CD", key.getDRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("SPEC") && key.getSPEC() != null) {
					msgKey.setKeyValue("SPEC", key.getSPEC());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_TYP") && key.getISSUE_TYP() != null) {
					msgKey.setKeyValue("ISSUE_TYP", key.getISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG") && key.getLOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("LOT_CTRL_FLG", key.getLOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("w_TOTAL_STOCK_ON_HAND_QTY") && key.getw_TOTAL_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("w_TOTAL_STOCK_ON_HAND_QTY", key.getw_TOTAL_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("w_JOB_ODR_CD") && key.getw_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("w_JOB_ODR_CD", key.getw_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("WH_PLANT_CD") && key.getWH_PLANT_CD() != null) {
					msgKey.setKeyValue("WH_PLANT_CD", key.getWH_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_VEND_CD") && key.getWH_VEND_CD() != null) {
					msgKey.setKeyValue("WH_VEND_CD", key.getWH_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_TYP") && key.getWH_TYP() != null) {
					msgKey.setKeyValue("WH_TYP", key.getWH_TYP());
				}
				if(msgKeyType.containsKeyColumn("MRP_FLG") && key.getMRP_FLG() != null) {
					msgKey.setKeyValue("MRP_FLG", key.getMRP_FLG());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD") && key.getRCV_ISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CTRL_CD", key.getRCV_ISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP") && key.getRCV_ISSUE_TYP() != null) {
					msgKey.setKeyValue("RCV_ISSUE_TYP", key.getRCV_ISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_DATE") && key.getRCV_ISSUE_DATE() != null) {
					msgKey.setKeyValue("RCV_ISSUE_DATE", key.getRCV_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_GNR_TYP") && key.getRCV_ISSUE_GNR_TYP() != null) {
					msgKey.setKeyValue("RCV_ISSUE_GNR_TYP", key.getRCV_ISSUE_GNR_TYP());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UPD_TYP") && key.getSTOCK_UPD_TYP() != null) {
					msgKey.setKeyValue("STOCK_UPD_TYP", key.getSTOCK_UPD_TYP());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_FLG") && key.getRCV_ISSUE_CMPLT_FLG() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CMPLT_FLG", key.getRCV_ISSUE_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("VEND_LOT_NO") && key.getVEND_LOT_NO() != null) {
					msgKey.setKeyValue("VEND_LOT_NO", key.getVEND_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO") && key.getLOT_NO() != null) {
					msgKey.setKeyValue("LOT_NO", key.getLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("ONEROUS_CONS_NO") && key.getONEROUS_CONS_NO() != null) {
					msgKey.setKeyValue("ONEROUS_CONS_NO", key.getONEROUS_CONS_NO());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST") && key.getUNIT_COST() != null) {
					msgKey.setKeyValue("UNIT_COST", key.getUNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP") && key.getUNIT_COST_TYP() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP", key.getUNIT_COST_TYP());
				}
				if(msgKeyType.containsKeyColumn("RETURNED_WH_CD") && key.getRETURNED_WH_CD() != null) {
					msgKey.setKeyValue("RETURNED_WH_CD", key.getRETURNED_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("w_STOCK_ON_HAND_QTY") && key.getw_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("w_STOCK_ON_HAND_QTY", key.getw_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("w_WH_CD") && key.getw_WH_CD() != null) {
					msgKey.setKeyValue("w_WH_CD", key.getw_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("ONEROUS_FLG") && key.getONEROUS_FLG() != null) {
					msgKey.setKeyValue("ONEROUS_FLG", key.getONEROUS_FLG());
				}
				if(msgKeyType.containsKeyColumn("THIS_MONTH") && key.getTHIS_MONTH() != null) {
					msgKey.setKeyValue("THIS_MONTH", key.getTHIS_MONTH());
				}
				if(msgKeyType.containsKeyColumn("INSTALL_FLG") && key.getINSTALL_FLG() != null) {
					msgKey.setKeyValue("INSTALL_FLG", key.getINSTALL_FLG());
				}
				if(msgKeyType.containsKeyColumn("PAST_RESULT_ENTRY_TYP") && key.getPAST_RESULT_ENTRY_TYP() != null) {
					msgKey.setKeyValue("PAST_RESULT_ENTRY_TYP", key.getPAST_RESULT_ENTRY_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_LOT_NO") && key.getl_LOT_NO() != null) {
					msgKey.setKeyValue("l_LOT_NO", key.getl_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ISSUE_QTY") && key.getl_ISSUE_QTY() != null) {
					msgKey.setKeyValue("l_ISSUE_QTY", key.getl_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ISSUE_DATE") && key.getl_ISSUE_DATE() != null) {
					msgKey.setKeyValue("l_ISSUE_DATE", key.getl_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_SPENT_QTY") && key.getl_SPENT_QTY() != null) {
					msgKey.setKeyValue("l_SPENT_QTY", key.getl_SPENT_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_STOCK_UNIT") && key.getl_STOCK_UNIT() != null) {
					msgKey.setKeyValue("l_STOCK_UNIT", key.getl_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_QTY") && key.getRCV_ISSUE_QTY() != null) {
					msgKey.setKeyValue("RCV_ISSUE_QTY", key.getRCV_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_QTY") && key.getISSUE_QTY() != null) {
					msgKey.setKeyValue("ISSUE_QTY", key.getISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_WH_CD") && key.getl_WH_CD() != null) {
					msgKey.setKeyValue("l_WH_CD", key.getl_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("l_STOCK_ON_HAND_QTY") && key.getl_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("l_STOCK_ON_HAND_QTY", key.getl_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_DEFECT_QTY") && key.getl_DEFECT_QTY() != null) {
					msgKey.setKeyValue("l_DEFECT_QTY", key.getl_DEFECT_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ALLOCABLE_QTY") && key.getl_ALLOCABLE_QTY() != null) {
					msgKey.setKeyValue("l_ALLOCABLE_QTY", key.getl_ALLOCABLE_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_EXTERNAL_LOT_NO") && key.getl_EXTERNAL_LOT_NO() != null) {
					msgKey.setKeyValue("l_EXTERNAL_LOT_NO", key.getl_EXTERNAL_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("l_BEST_BEFORE_DATE") && key.getl_BEST_BEFORE_DATE() != null) {
					msgKey.setKeyValue("l_BEST_BEFORE_DATE", key.getl_BEST_BEFORE_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PRD_CMPLT_DATE") && key.getl_PRD_CMPLT_DATE() != null) {
					msgKey.setKeyValue("l_PRD_CMPLT_DATE", key.getl_PRD_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_WH_NAME") && key.getl_WH_NAME() != null) {
					msgKey.setKeyValue("l_WH_NAME", key.getl_WH_NAME());
				}
				if(msgKeyType.containsKeyColumn("BBD_c_FLG") && key.getBBD_c_FLG() != null) {
					msgKey.setKeyValue("BBD_c_FLG", key.getBBD_c_FLG());
				}
				if(msgKeyType.containsKeyColumn("BEST_BEFORE_DATE_CHECK_FLG") && key.getBEST_BEFORE_DATE_CHECK_FLG() != null) {
					msgKey.setKeyValue("BEST_BEFORE_DATE_CHECK_FLG", key.getBEST_BEFORE_DATE_CHECK_FLG());
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
					AF0040010Struct key = new AF0040010Struct();
					if(msgKeyType.containsKeyColumn("h_JOB_ODR")) {
						key.seth_JOB_ODR(msgKey.getKeyValue("h_JOB_ODR"));
					}
					if(msgKeyType.containsKeyColumn("w_WH_NAME")) {
						key.setw_WH_NAME(msgKey.getKeyValue("w_WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("h_SHIP_COMPLETE")) {
						key.seth_SHIP_COMPLETE(msgKey.getKeyValue("h_SHIP_COMPLETE"));
					}
					if(msgKeyType.containsKeyColumn("r_SELECT_CHOICE_0")) {
						key.setr_SELECT_CHOICE_0(msgKey.getKeyValue("r_SELECT_CHOICE_0"));
					}
					if(msgKeyType.containsKeyColumn("r_SELECT_CHOICE_1")) {
						key.setr_SELECT_CHOICE_1(msgKey.getKeyValue("r_SELECT_CHOICE_1"));
					}
					if(msgKeyType.containsKeyColumn("c_JOB_ODR")) {
						key.setc_JOB_ODR(msgKey.getKeyValue("c_JOB_ODR"));
					}
					if(msgKeyType.containsKeyColumn("c_SHIP_COMPLETE")) {
						key.setc_SHIP_COMPLETE(msgKey.getKeyValue("c_SHIP_COMPLETE"));
					}
					if(msgKeyType.containsKeyColumn("w_ISSUE_CMPLT_FLG_NAME")) {
						key.setw_ISSUE_CMPLT_FLG_NAME(msgKey.getKeyValue("w_ISSUE_CMPLT_FLG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_CONS_TYP_NAME")) {
						key.setw_CONS_TYP_NAME(msgKey.getKeyValue("w_CONS_TYP_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_CHOICE")) {
						key.setw_CHOICE(msgKey.getKeyValue("w_CHOICE"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_STOCK_NON_ALC_QTY")) {
						key.setITEM_STOCK_NON_ALC_QTY(msgKey.getKeyValue("ITEM_STOCK_NON_ALC_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ODR_ISSUE_POSS_QTY")) {
						key.setODR_ISSUE_POSS_QTY(msgKey.getKeyValue("ODR_ISSUE_POSS_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ALC_NOISSUE_QTY")) {
						key.setALC_NOISSUE_QTY(msgKey.getKeyValue("ALC_NOISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("THIS_TIME_ISSUE_POSS_QTY")) {
						key.setTHIS_TIME_ISSUE_POSS_QTY(msgKey.getKeyValue("THIS_TIME_ISSUE_POSS_QTY"));
					}
					if(msgKeyType.containsKeyColumn("WH_FLG")) {
						key.setWH_FLG(msgKey.getKeyValue("WH_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_WH_CD")) {
						key.seth_WH_CD(msgKey.getKeyValue("h_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_lotCtrl")) {
						key.seth_lotCtrl(msgKey.getKeyValue("h_lotCtrl"));
					}
					if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG_name")) {
						key.setLOT_CTRL_FLG_name(msgKey.getKeyValue("LOT_CTRL_FLG_name"));
					}
					if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG_val")) {
						key.setLOT_CTRL_FLG_val(msgKey.getKeyValue("LOT_CTRL_FLG_val"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_CD")) {
						key.setw_PLANT_CD(msgKey.getKeyValue("w_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("tmp_WH_CD")) {
						key.settmp_WH_CD(msgKey.getKeyValue("tmp_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("tmp_RCV_ISSUE_QTY")) {
						key.settmp_RCV_ISSUE_QTY(msgKey.getKeyValue("tmp_RCV_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_FLG_name")) {
						key.setISSUE_CMPLT_FLG_name(msgKey.getKeyValue("ISSUE_CMPLT_FLG_name"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_FLG_val")) {
						key.setISSUE_CMPLT_FLG_val(new Integer(msgKey.getKeyValue("ISSUE_CMPLT_FLG_val")));
					}
					if(msgKeyType.containsKeyColumn("CONS_TYP_name")) {
						key.setCONS_TYP_name(msgKey.getKeyValue("CONS_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("CONS_TYP_val")) {
						key.setCONS_TYP_val(new Integer(msgKey.getKeyValue("CONS_TYP_val")));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD_GNR_TYP")) {
						key.setOPR_INST_CD_GNR_TYP(msgKey.getKeyValue("OPR_INST_CD_GNR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD")) {
						key.setOPR_INST_CD(msgKey.getKeyValue("OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_CD")) {
						key.setWORK_ODR_CD(msgKey.getKeyValue("WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE")) {
						key.setOPR_INST_START_DATE(msgKey.getKeyValue("OPR_INST_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE")) {
						key.setWORK_ODR_DLV_DATE(msgKey.getKeyValue("WORK_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_QTY")) {
						key.setOPR_INST_QTY(msgKey.getKeyValue("OPR_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("WS_NAME")) {
						key.setWS_NAME(msgKey.getKeyValue("WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD")) {
						key.setWORK_IN_PROC_CD(msgKey.getKeyValue("WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROC_NAME")) {
						key.setPROC_NAME(msgKey.getKeyValue("PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_ANAME")) {
						key.setVEND_ANAME(msgKey.getKeyValue("VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_CD")) {
						key.setISSUE_INST_CD(msgKey.getKeyValue("ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_QTY")) {
						key.setISSUE_INST_QTY(msgKey.getKeyValue("ISSUE_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY")) {
						key.setTOTAL_ISSUE_QTY(msgKey.getKeyValue("TOTAL_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("w_SHIP_REMAIN_QTY")) {
						key.setw_SHIP_REMAIN_QTY(msgKey.getKeyValue("w_SHIP_REMAIN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SCDL_ISSUE_DATE")) {
						key.setSCDL_ISSUE_DATE(msgKey.getKeyValue("SCDL_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_DATE")) {
						key.setISSUE_CMPLT_DATE(msgKey.getKeyValue("ISSUE_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_FLG")) {
						key.setISSUE_CMPLT_FLG(msgKey.getKeyValue("ISSUE_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("CONS_TYP")) {
						key.setCONS_TYP(msgKey.getKeyValue("CONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("DRAW_CD")) {
						key.setDRAW_CD(msgKey.getKeyValue("DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("SPEC")) {
						key.setSPEC(msgKey.getKeyValue("SPEC"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_TYP")) {
						key.setISSUE_TYP(msgKey.getKeyValue("ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG")) {
						key.setLOT_CTRL_FLG(msgKey.getKeyValue("LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("w_TOTAL_STOCK_ON_HAND_QTY")) {
						key.setw_TOTAL_STOCK_ON_HAND_QTY(msgKey.getKeyValue("w_TOTAL_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("w_JOB_ODR_CD")) {
						key.setw_JOB_ODR_CD(msgKey.getKeyValue("w_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WH_PLANT_CD")) {
						key.setWH_PLANT_CD(msgKey.getKeyValue("WH_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_VEND_CD")) {
						key.setWH_VEND_CD(msgKey.getKeyValue("WH_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_TYP")) {
						key.setWH_TYP(msgKey.getKeyValue("WH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MRP_FLG")) {
						key.setMRP_FLG(msgKey.getKeyValue("MRP_FLG"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD")) {
						key.setRCV_ISSUE_CTRL_CD(msgKey.getKeyValue("RCV_ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP")) {
						key.setRCV_ISSUE_TYP(msgKey.getKeyValue("RCV_ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_DATE")) {
						key.setRCV_ISSUE_DATE(msgKey.getKeyValue("RCV_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_GNR_TYP")) {
						key.setRCV_ISSUE_GNR_TYP(msgKey.getKeyValue("RCV_ISSUE_GNR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UPD_TYP")) {
						key.setSTOCK_UPD_TYP(msgKey.getKeyValue("STOCK_UPD_TYP"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_FLG")) {
						key.setRCV_ISSUE_CMPLT_FLG(msgKey.getKeyValue("RCV_ISSUE_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("VEND_LOT_NO")) {
						key.setVEND_LOT_NO(msgKey.getKeyValue("VEND_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO")) {
						key.setLOT_NO(msgKey.getKeyValue("LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("ONEROUS_CONS_NO")) {
						key.setONEROUS_CONS_NO(msgKey.getKeyValue("ONEROUS_CONS_NO"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST")) {
						key.setUNIT_COST(msgKey.getKeyValue("UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP")) {
						key.setUNIT_COST_TYP(msgKey.getKeyValue("UNIT_COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("RETURNED_WH_CD")) {
						key.setRETURNED_WH_CD(msgKey.getKeyValue("RETURNED_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_STOCK_ON_HAND_QTY")) {
						key.setw_STOCK_ON_HAND_QTY(msgKey.getKeyValue("w_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("w_WH_CD")) {
						key.setw_WH_CD(msgKey.getKeyValue("w_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("ONEROUS_FLG")) {
						key.setONEROUS_FLG(msgKey.getKeyValue("ONEROUS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("THIS_MONTH")) {
						key.setTHIS_MONTH(msgKey.getKeyValue("THIS_MONTH"));
					}
					if(msgKeyType.containsKeyColumn("INSTALL_FLG")) {
						key.setINSTALL_FLG(msgKey.getKeyValue("INSTALL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PAST_RESULT_ENTRY_TYP")) {
						key.setPAST_RESULT_ENTRY_TYP(msgKey.getKeyValue("PAST_RESULT_ENTRY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_LOT_NO")) {
						key.setl_LOT_NO(msgKey.getKeyValue("l_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ISSUE_QTY")) {
						key.setl_ISSUE_QTY(msgKey.getKeyValue("l_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ISSUE_DATE")) {
						key.setl_ISSUE_DATE(msgKey.getKeyValue("l_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_SPENT_QTY")) {
						key.setl_SPENT_QTY(msgKey.getKeyValue("l_SPENT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_STOCK_UNIT")) {
						key.setl_STOCK_UNIT(msgKey.getKeyValue("l_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_QTY")) {
						key.setRCV_ISSUE_QTY(msgKey.getKeyValue("RCV_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_QTY")) {
						key.setISSUE_QTY(msgKey.getKeyValue("ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_WH_CD")) {
						key.setl_WH_CD(msgKey.getKeyValue("l_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_STOCK_ON_HAND_QTY")) {
						key.setl_STOCK_ON_HAND_QTY(msgKey.getKeyValue("l_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_DEFECT_QTY")) {
						key.setl_DEFECT_QTY(msgKey.getKeyValue("l_DEFECT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ALLOCABLE_QTY")) {
						key.setl_ALLOCABLE_QTY(msgKey.getKeyValue("l_ALLOCABLE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_EXTERNAL_LOT_NO")) {
						key.setl_EXTERNAL_LOT_NO(msgKey.getKeyValue("l_EXTERNAL_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_BEST_BEFORE_DATE")) {
						key.setl_BEST_BEFORE_DATE(msgKey.getKeyValue("l_BEST_BEFORE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PRD_CMPLT_DATE")) {
						key.setl_PRD_CMPLT_DATE(msgKey.getKeyValue("l_PRD_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_WH_NAME")) {
						key.setl_WH_NAME(msgKey.getKeyValue("l_WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("BBD_c_FLG")) {
						key.setBBD_c_FLG(msgKey.getKeyValue("BBD_c_FLG"));
					}
					if(msgKeyType.containsKeyColumn("BEST_BEFORE_DATE_CHECK_FLG")) {
						key.setBEST_BEFORE_DATE_CHECK_FLG(msgKey.getKeyValue("BEST_BEFORE_DATE_CHECK_FLG"));
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