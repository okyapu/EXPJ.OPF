/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0080/src/com/nec/jp/orteus/metamorBase/AF0080/AF0080010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AF0080;

import com.nec.jp.orteus.metamorBase.AF0080.*;
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
//-----------------------------------------------------------------------------
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;

import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.LotCtrl;

import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueInstStruct;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueProcess;
import com.nec.jp.orteus.expj.pr.rcvissue.process.RcvProcess;
import com.nec.jp.orteus.expj.util.Calculate;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueRemain;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.math.BigDecimal;
//-----------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AF0080010Control
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
	public AF0080010Struct getListvalue(int x) { return (AF0080010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AF0080010Struct getStruct() { return this.struct; }	// Struct��Ԃ��܂��B
	public AF0080010Struct createStruct() { return new AF0080010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AF0080010Struct)structname); }	// Struct���Z�b�g���܂��B
//	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }


//------------------------------------------------------------------------

	/** ���[�U��`�̏������σt���O */
	private boolean _usersIntialized = false;
	
	/** ���b�g�Ǘ������σ`�F�b�N */
	String lotCtrl = null;

	/**
	 * ���[�U��` ����������
	 */
	private void usersInitialize() throws ExpjException
	{
		// ������Ԃ��u������ԁv�ɐݒ�
		setReadStatus(INITIAL);

		if(_usersIntialized) return;

		// �R���{�f�[�^�̎擾
		setComboData(struct);

		_usersIntialized = true;
		return ;
	}


//---------- �R���{�{�b�N�X�f�[�^�擾�֘A�̏��� -------------------------------

	/** �o�Ɋ����t���O **/
	ComboStruct _ISSUE_CMPLT_FLG = null;

	/** �o�Ɋ����t���O�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setISSUE_CMPLT_FLG(ComboStruct combo){ _ISSUE_CMPLT_FLG = combo; }

	/** �o�Ɋ����t���O�擾
	 * @return �o�Ɋ����t���O�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getISSUE_CMPLT_FLG(){ return _ISSUE_CMPLT_FLG; }


	/** �x���敪�t���O **/
	ComboStruct _CONS_TYP = null;
	
	/**��ЃR�[�h**/
	public String _company_cd = null;

	/** �x���敪�t���O�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setCONS_TYP(ComboStruct combo){ _CONS_TYP = combo; }

	/** �x���敪�t���O�擾
	 * @return �x���敪�t���O�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getCONS_TYP(){ return _CONS_TYP; }

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
	
    // ----- �L�[���̑ޔ����� ---------------------------------------------------

	/** �L�[���ێ��ׂ̈�Struct */
	private AF0080010Struct keyStruct;

	/** �L�[���Struct�̎擾 */
	public AF0080010Struct getKeyStruct(){ return keyStruct; }
	
	/** �L�[���Struct�̐ݒ� */
	public void setKeyStruct(AF0080010Struct struct){ keyStruct = struct; }

    // ------------------------------------------------------------------------
	/**
	 * �R���{�{�b�N�X�̒��g���擾���܂��B
	 *
	 * @param data �f�[�^�̔�
	 */
	 private void setComboData(AF0080010Struct data) throws ExpjException
	 {
		ComboBox controller = new ComboBox(conn, sysUSER_CD);
		try{
			//�R���{�f�[�^�̎擾
			ComboStruct w_ISSUE_CMPLT_FLG_COMBO = controller.getData("ISSUE_CMPLT_FLG");
			ComboStruct w_CONS_TYP_COMBO = controller.getData("CONS_TYP");
			ComboStruct LOT_CTRL_FLG_comb = controller.getData("LOT_CTRL_FLG");

			controller.setConnection(null);

			//�����Ɏ擾�f�[�^�ݒ�
			setISSUE_CMPLT_FLG(w_ISSUE_CMPLT_FLG_COMBO);
			setCONS_TYP(w_CONS_TYP_COMBO);
			setLOT_CTRL_FLG_comb(LOT_CTRL_FLG_comb);


		}catch(SQLException e){
			setSqlExceptionMsg(e);

		}catch(ComboException e){
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}
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


//-----------------------------------------------------------------------------

	/**
	 * �o�Ɋ����t���O�̕\����ݒ�
	 * @param s �t���O�̒l���ݒ肳��Ă�����
	 */
	private void setIssueCmpltTypeValue(AF0080010Struct s)
	{
		s.setISSUE_CMPLT_NAME(getTypeName(_ISSUE_CMPLT_FLG,s.getISSUE_CMPLT_FLG()));
	}

	/**
	 * �x���敪�t���O�̕\����ݒ�
	 * @param s �t���O�̒l���ݒ肳��Ă�����
	 */
	private void setConsTypeValue(AF0080010Struct s)
	{
		s.setCONS_NAME(getTypeName(_CONS_TYP,s.getCONS_TYP()));
	}

	/**
	 * �敪���擾
	 * @param comboStruct �敪��񃊃X�g
	 * @param intType �敪�R�[�h
	 * @return �敪���́B�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�
	 */
	private String getTypeName(ComboStruct comboStruct, Integer intType)
	{
		if(comboStruct == null || intType == null)  return null;
		String strTyp = TypeConverter.sanitizer(intType);
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

	/**
	 * ��Ǝw���ԍ��̕\����ݒ�
	 * @param s �\�����𔻒肷����
	 */
	private void setOprInstCd(AF0080010Struct s)
	{
		if( (s.getWORK_IN_PROC_CD() == null) || (("").equals(s.getWORK_IN_PROC_CD())) ){
			s.sets_OPR_INST_CD(s.getw_OPR_INST_CD_item());
		} else {
			s.sets_OPR_INST_CD(s.getw_OPR_INST_CD_job());
		}
	}


//-----------------------------------------------------------------------------

	/** ���t�t�H�[�}�b�g */
//	private SimpleDateFormat _dateFormat = new SimpleDateFormat("yyyy/MM/dd");

	/**
	 * Date�^ �� String�^�B
	 * @return String YYYY/MM/DD�`��
	 */
	public String dateToString(Date date)
	{
//		return _dateFormat.format(date);
		return Converter.dateToStr(date, "yyyy/MM/dd");
	}

	/**
	 * String�^ �� Date�^�B
	 * @return Date 
	 */
	public Date stringToDate(String date) throws ParseException
	{
//		return _dateFormat.parse(date);
		return Converter.strToDate(date, "yyyy/MM/dd");
	}

//-----------------------------------------------------------------------------

	/** �v�Z�p�N���X*/
	Calculate calc = new Calculate();

//-----------------------------------------------------------------------------

    /** ��ʋ��ʒ�`�擾�N���X */
    ScreenParam _scParam = sp;


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
	private void setErrorMessage(String messageno)
	{
		ExpjMessage emsg = new ExpjMessage( messageno );
		msgStruct.addError( emsg );
		sysLog.warning(emsg, getsysUSER_CD());
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
	 * �����ԁA�����ԁA�i�ڍ݌ɏo�ɍϐ��̌v�Z����
	 */
	private void calcIssuedQty(AF0080010Struct wkStruct) throws SQLException
	{
		// �i�ڎ�z�敪�� 1 or 2 �łȂ������Ԃ��擾�ł����ꍇ�A�e���ʂ����߂�
		if((wkStruct.getMRP_ODR_TYP().equals(AF0080Const._MRP_ODR_JOB_ODR_CD) ||
				wkStruct.getMRP_ODR_TYP().equals(AF0080Const._MRP_ODR_STOCK_ALC_JOB_ODR_CD)) &&
			!(wkStruct.getJOB_ODR_CD() == null || wkStruct.getJOB_ODR_CD().equals("")))
		{
			IssueRemain issueRemain = new IssueRemain(conn);
			// �����ԏo�ɍϐ�(�@���Ԉ����o�ɍϐ�(�S���ԕ�)�|�A���Ԉ����o�ɍϐ�(�����ԕ�))
			// �@���Ԉ����o�ɍϐ�(�S���ԕ�)
			String calc1 = issueRemain.getIssuedQtyByAllJobOdr(
					wkStruct.getw_OD_NO()).toString();
			
			// �A���Ԉ����o�ɍϐ�(�����ԕ�)
			String calc2 = issueRemain.getIssuedQtyByJobOdr(wkStruct.getw_OD_NO(),
					wkStruct.getJOB_ODR_CD(),
					AF0080Const._JOB_ODR_DETAIL_NO).toString();
			
			// �B�ʎ�z���o�ɍϐ�
			String calc3 = issueRemain.getIssuedQtyByOd(wkStruct.getw_OD_NO()).toString();
			
			// �A�{�B(�����ԏo�Ɏc��)
			wkStruct.setOWN_ISSUED_QTY(Calculate.add(calc2, calc3));
			
			// �@�|�A
			wkStruct.setOTHER_ISSUED_QTY(Calculate.subtract(calc1, calc2));
			
			// �i�ڍ݌ɏo�ɍϐ�
			wkStruct.setITEM_ISSUED_QTY(issueRemain.getIssuedQtyByItem(
					wkStruct.getw_OD_NO()).toString());
		}else{
			// �i�ڍ݌ɏo�ɗ݌v��
			wkStruct.setITEM_ISSUED_QTY(wkStruct.getTOTAL_ISSUE_QTY());
		}
	}

	/**
	 * �V�X�e���p�����[�^�擾
	 */
	private boolean getSysParameter() throws BusinessProcessException, FoundationException {
		boolean b = true;
		try {
			// �Q���敪
			struct.seth_Param_Div("PAST_RESULT_ENTRY_TYP");
			List sysParameterList = entity.mSELECT_SYS_PARAMETER.read(conn, struct);
			if(sysParameterList == null || sysParameterList.isEmpty()) return b;
			AF0080010Struct sysParameterStruct = (AF0080010Struct) sysParameterList.get(0);
			if(null != sysParameterStruct.getPARAM_RESULT() && !"".equals(sysParameterStruct.getPARAM_RESULT())){
				if("false".equals(sysParameterStruct.getPARAM_RESULT())){
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
			AF0080010Struct procExecDateStruct = (AF0080010Struct) procExecDateList.get(0);
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

//-----------------------------------------------------------------------------
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0080");
		logger.entering("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
			//-----------------------------------------------------------------------------
			// ���O�o�͏��i�[�p
			String logMessage = "";
			List listMessage = new ArrayList();

			try {
				boolean oprInst_flg = true;			// ��Ǝw���ԍ��w��̌���

				// �L�[���ڃ��O�\��
				logMessage = "OPR_INST_CD:" + struct.getw_OPR_INST_CD()
							+ ", PUCH_ODR_CD:" + struct.getw_PUCH_ODR_CD()
							+ ", ISSUE_INST_CD:" + struct.getw_ISSUE_INST_CD()
							+ ", PLANT_CD:" + struct.getw_PLANT_CD();
				setSyslogConfig(logMessage);

				// �o�Ɏw�����̓Ǎ���
				//�ő�\���s��
	            int maxLine = sp.getMaxLine(conn, 10);
				if(maxLine != 0) {
					struct.setROW_COUNT(String.valueOf(maxLine));
				} else {
					struct.setROW_COUNT(null);
				}
				if(("0").equals(struct.getw_CHOICE())){
					listMessage.add("T_WORK_IN_PROC_BY_ITEM.OPR_INST_CD:" + struct.getw_OPR_INST_CD());
					listMessage.add("T_WORK_IN_PROC_BY_PROC .OPR_INST_CD:" + struct.getw_OPR_INST_CD());
					listMessage.add("T_ISSUE_INST.PLANT_CD:" +  struct.getw_PLANT_CD());
					list = entity.mselectOPR_INST_CDCnt.read(conn, struct);
		          }else{
					oprInst_flg = false;
					listMessage.add("T_ISSUE_INST.PUCH_ODR_CD:" + struct.getw_PUCH_ODR_CD());
					listMessage.add("T_ISSUE_INST.ISSUE_INST_CD:" + struct.getw_ISSUE_INST_CD());
					listMessage.add("T_ISSUE_INST.PLANT_CD:" +  struct.getw_PLANT_CD());
					list = entity.mselectCnt.read(conn, struct);
				 }
				long rowCount = Long.parseLong(((AF0080010Struct)list.get(0)).getl_COUNT());
				if(rowCount==0){
					// ������Ԃ��u�Ǎ��O���v�ɐݒ�
					setReadStatus(NOT_FOUND);
					// �Ǎ��������s�F�Y������o�Ɏw����񂪑��݂��܂���
					setErrorMessage("ZZ06001", listMessage);
					if(list != null && list.size() > 0){
						list.clear();
					}
					return;
				} else {
					// �\���ő�s����������
					if(maxLine != 0 && rowCount == maxLine + 1){
						// ������Ԃ��u�ő�s���I�[�o�v�ɐݒ�
						setReadStatus(TOO_MANY);
						if(list != null && list.size() > 0){
							list.clear();
						}
						setErrorMessage("ZZ01115", "", ""+maxLine);
						return;
					}
				}
				if(("0").equals(struct.getw_CHOICE())){
					list = entity.mselectOPR_INST_CD.read(conn, struct);
				}else{
					list = entity.mselect.read(conn, struct);
				}
				for(int i = 0; i < list.size(); i++){
					// �o�Ɋ����A�x���敪�ɕ\������\�����̐ݒ�
					setIssueCmpltTypeValue((AF0080010Struct)(list.get(i)));
					setConsTypeValue((AF0080010Struct)(list.get(i)));

					if(oprInst_flg){
						// ��Ǝw���ԍ��ɕ\������f�[�^�̐ݒ�
						setOprInstCd((AF0080010Struct)(list.get(i)));
					}
						
					// �i�ڎ�z�敪�� 1 or 2 �̏ꍇ�A�e���ʂ����߂�
					AF0080010Struct wkStruct = (AF0080010Struct)list.get(i);
					calcIssuedQty(wkStruct);
						
				}

				// ������Ԃ��u�Ǎ������v�ɐݒ�
				setReadStatus(NORMAL);
			} catch(SQLException e) {
				// ������Ԃ��u�Ǎ����s�v�ɐݒ�
				setReadStatus(ERROR);

				setSqlExceptionMsg(e);

			}
			//-----------------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * �s�C���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlmodify() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0080");
		logger.entering("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlmodify");
			//{{user_implement_dev:<controlmodify>
		//-----------------------------------------------------------------------------
		// ���O�o�͏��i�[�p
		String logMessage = "";
		
		// �`�F�b�N���ʊi�[
		boolean check = true;	

		try {			
			// �L�[���ڂ�ێ�
			keyStruct = new AF0080010Struct(struct);

			// �L�[���ڂ��Z�b�g
			struct.setw_ISSUE_INST_CD(keyStruct.getw_ISSUE_INST_CD());
			struct.setw_PUCH_ODR_CD(keyStruct.getw_PUCH_ODR_CD());
			struct.setw_OPR_INST_CD(keyStruct.getw_OPR_INST_CD());
			struct.setw_PLANT_CD(keyStruct.getw_PLANT_CD());
			struct.setw_CHOICE(keyStruct.getw_CHOICE());

			// �l�q�o�i�ڂ̎��A���v�ʂɃZ�b�g����Ă��鐻�Ԃ͐e�̐��ԂȂ̂Ŏg��Ȃ��inull�ƈ����j
			if(calc.compare(struct.getMRP_ODR_TYP(), "3") > 0){
				struct.setJOB_ODR_CD((String)null);
			}

			// �ۊǋ於��FROM�ɃZ�b�g
			struct.setw_WH_FROM_NAME(struct.getWH_NAME());

			// �ߓ�����������
			struct.setRCV_ISSUE_QTY(new String("0.0"));

			// �L�[���ڕ\��
			logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
			setSyslogConfig(logMessage);

			struct.setw_WH_FROM_CD(struct.getWH_CD());
			
			// �Ɩ��^�p���̎擾
			List dateList = entity.mselectBUSINESS_OPR_DATE.read(conn, struct);
			if(dateList.size() <= 0) {
				// �s�C���������s�F�Ɩ��^�p�������݂��܂���
				logMessage = "SYS_DATE_CTRL.PLANT_CD:" + struct.getw_PLANT_CD();
				setErrorMessage("AF00056", logMessage);
				check = false;
			} else {
				AF0080010Struct dateStruct = (AF0080010Struct)dateList.get(0);
				if(struct.getISSUE_CMPLT_FLG().intValue() == 0){
					// �����t���O��0:���̏ꍇ
					struct.setw_BUSINESS_OPR_DATE(dateStruct.getw_BUSINESS_OPR_DATE());
					struct.setRCV_ISSUE_DATE(dateStruct.getw_BUSINESS_OPR_DATE());
					// �ߓ���
					struct.seth_RCV_ISSUE_DATE("");
					// �x���敪�ɕ\������\�����̐ݒ�
					setConsTypeValue(dateStruct);
				} else {
					// �����t���O��1:�����̏ꍇ
					struct.setw_BUSINESS_OPR_DATE(dateStruct.getw_BUSINESS_OPR_DATE());
					struct.setRCV_ISSUE_DATE(struct.getISSUE_CMPLT_DATE());
					// �ߓ���
					struct.seth_RCV_ISSUE_DATE(struct.getRCV_ISSUE_DATE());
					// �x���敪�ɕ\������\�����̐ݒ�
					setConsTypeValue(struct);
				}
			}
			
			// ���|�Ǘ����C���X�g�[������Ă���ꍇ�A���N���x���擾
			AF0080010Struct readStruct = new AF0080010Struct();
			List installOptionsList = entity.mSYS_INSTALL_OPTIONS.read(conn, readStruct);
			if (installOptionsList.size() > 0) {
				AF0080010Struct installOptionsStruct = (AF0080010Struct)installOptionsList.get(0);
				struct.setINSTALL_FLG(installOptionsStruct.getINSTALL_FLG());
			} else {
				struct.setINSTALL_FLG("0");
			}
			
			// ���|�Ǘ����C���X�g�[������Ă���ꍇ�A���N���x���擾
			if ("1".equals(struct.getINSTALL_FLG())) {
				List debtCtrlList = entity.mSYS_DEBT_CTRL.read(conn, readStruct);
				if (debtCtrlList.size() > 0) {
					AF0080010Struct debtCtrlStruct = (AF0080010Struct)debtCtrlList.get(0);
					struct.setTHIS_MONTH(debtCtrlStruct.getTHIS_MONTH());
				} else {
					setErrorMessage("AF00142");
					check = false;
				}
			}
			// ���Ԃ̑ޔ�
			struct.setSAVE_JOB_ODR_CD(struct.getJOB_ODR_CD());

			// �ߓ����ۊǋ�R�[�h���\�����ڂɑޔ�
			struct.seth_WH_FROM_CD(struct.getw_WH_FROM_CD());
			
			// �`�F�b�N�ŃG���[���������Ă��Ȃ��A���b�g�Ǘ��t���O��1�̏ꍇ
			if ("1".equals(struct.getLOT_CTRL_FLG()) && (msgStruct.sizeError() <= 0)) {			
				if(list != null){
					list.clear();
				}
				// ���b�g�ʍ݌Ɉꗗ�̎擾
	            list = entity.mT_LOT_ISSUE_INST.read(conn, struct);
	            if (!list.isEmpty()) {
	    			// �\���ő�s����������
	    			ScreenParam sp = new ScreenParam(this.getClass());
	    			int maxLine = sp.getMaxLine(conn,20);
	    			if(maxLine != 0 && this.list.size() > maxLine){
	    				setReadStatus(TOO_MANY);
	    				this.list.clear();
	    				logMessage = "";
	    				setErrorMessage("ZZ01115", "", ""+maxLine);
	    			}
	            }
			}          
		} catch(SQLException e) {
			// ������Ԃ��u�Ǎ����s�v�ɐݒ�
			setReadStatus(ERROR);

			setSqlExceptionMsg(e);
		} finally {
			// �G���[�̎��A�e��ʃf�[�^�Đݒ�
			if(!check){
				struct.copy(keyStruct);
			}
		}
		//-----------------------------------------------------------------------------
                //}}user_implement_dev:<controlmodify>
		logger.exiting("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlmodify");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0080");
		logger.entering("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlclear");
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
		
		keyStruct = new AF0080010Struct();
		
		// ������Ԃ��u������ԁv�ɐݒ�
		setReadStatus(INITIAL);

		//------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlinsertSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0080");
		logger.entering("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");
			//{{user_implement_dev:<controlinsertSub1>
		//-----------------------------------------------------------------------------
		// ���O�o�͏��i�[�p
		String logMessage = "";
		List listMessage = new ArrayList();

		try {					
			if(null == struct.geth_RCV_ISSUE_DATE() || "".equals(struct.geth_RCV_ISSUE_DATE())){
					// ���Y���̉ߋ��̎��ѓ��͂̐����`�F�b�N
					if(getSysParameter() == false){
						if(chkProcExecDate("1","",struct.getRCV_ISSUE_DATE()) == false){
							setErrorMessage(ProcExecDateError);
							setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
							setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
							return;
						}
					}
			}else{
					// ���Y���̉ߋ��̎��ѓ��͂̐����`�F�b�N
					if(getSysParameter() == false){
						if(chkProcExecDate("2",struct.geth_RCV_ISSUE_DATE(),struct.getRCV_ISSUE_DATE()) == false){
							setErrorMessage(ProcExecDateError);
							setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
							setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
							return;
						}
					}
			}
			
			// �ۊǋ於�N���A
			struct.setw_WH_FROM_NAME((String)null);	// �ߓ���
			struct.setw_WH_TO_NAME((String)null);	// �ߓ���

			AF0080010Struct whTmpStruct = new AF0080010Struct(struct);

			if (struct.getw_WH_FROM_CD() != null && "".equals(struct.getw_WH_FROM_CD()) == false) {
			// �ߓ����ۊǋ���擾
			whTmpStruct.setw_WH_CD(struct.getw_WH_FROM_CD());

			List outWhList = entity.mselectM_WH.read(conn, whTmpStruct);
			AF0080010Struct outWhStruct = null;
			if(outWhList.size() <= 0){
				// �o�^�������s�F�ߓ����ۊǋ�R�[�h�����݂��܂���
				logMessage = "M_WH.WH_CD:" + struct.getw_WH_FROM_CD();
				setErrorMessage("AF00037", logMessage);
			}
			else{
				outWhStruct = (AF0080010Struct)outWhList.get(0);

				// �ߓ����ۊǋ於��ݒ�
				struct.setw_WH_FROM_NAME(outWhStruct.getw_WH_NAME());
				
				// �ߓ����ۊǋ�̍H��R�[�h�`�F�b�N
				if(struct.getw_PLANT_CD().equals(outWhStruct.getw_PLANT_CD_check()) == false){
					// �o�^�������s�F�ۊǋ�R�[�h�͑��̍H��̃f�[�^�Ȃ̂Ŏw��ł��܂���
					listMessage.add("M_WH.WH_CD:" + struct.getw_WH_FROM_CD());
					listMessage.add("M_WH.PLANT_CD:" +  outWhStruct.getw_PLANT_CD_check());
					setErrorMessage("AF00038", listMessage);
					listMessage.clear();
				}
				
				if(outWhStruct.getw_MRP_FLG().intValue() == 1){
					// �o�^�������s�F�ߓ����ۊǋ�R�[�h�����v�ʌv�Z�Ώۂ̕ۊǋ�ł��B
					listMessage.add("M_WH.WH_CD:" + struct.getw_WH_FROM_CD());
					listMessage.add("M_WH.MRP_FLG:" +  outWhStruct.getw_MRP_FLG());
					setErrorMessage("AF00134", listMessage);
					listMessage.clear();
				}
				
				if ((struct.getw_WH_FROM_CD() != null && "".equals(struct.getw_WH_FROM_CD()) == false)
						&& (struct.geth_WH_FROM_CD() != null && "".equals(struct.geth_WH_FROM_CD()) == false)
						&& (outWhStruct.getVEND_CD() != null && "".equals(outWhStruct.getVEND_CD()) == false)
						&& (struct.getCONS_TYP()).intValue() == 0) {
					listMessage.add("M_WH.WH_CD:" + struct.getw_WH_FROM_CD());
					setErrorMessage("AF00135", listMessage);
					listMessage.clear();
				}
				
				if ((struct.getw_WH_FROM_CD() != null && "".equals(struct.getw_WH_FROM_CD()) == false)
						&& (struct.geth_WH_FROM_CD() != null && "".equals(struct.geth_WH_FROM_CD()) == false)
						&& (struct.getCONS_TYP()).intValue() != 0) {
					
					if (struct.getVEND_CD() == null || "".equals(struct.getVEND_CD())) {
						if (outWhStruct.getVEND_CD() != null && "".equals(outWhStruct.getVEND_CD()) == false) {
							listMessage.add("M_WH.WH_CD:" + struct.getw_WH_FROM_CD());
							setErrorMessage("AF00136", listMessage);
							listMessage.clear();
						}
					} else {
						if ((struct.getVEND_CD()).equals(outWhStruct.getVEND_CD()) == false) {
							listMessage.add("M_WH.WH_CD:" + struct.getw_WH_FROM_CD());
							setErrorMessage("AF00136", listMessage);
							listMessage.clear();
						}
					}
					
				}
			}

			}

			// �ߓ���ۊǋ���擾
			whTmpStruct.setw_WH_CD(struct.getw_WH_TO_CD());

			List inWhList = entity.mselectM_WH.read(conn, whTmpStruct);
			AF0080010Struct inWhStruct = null;
			if(inWhList.size() <= 0){
				// �o�^�������s�F�ߓ���ۊǋ�R�[�h�����݂��܂���
				logMessage = "M_WH.WH_CD:" + struct.getw_WH_TO_CD();
				setErrorMessage("AF00041", logMessage);
			}
			else{
				inWhStruct = (AF0080010Struct)inWhList.get(0);

				// �ߓ���ۊǋ於��ݒ�
				struct.setw_WH_TO_NAME(inWhStruct.getw_WH_NAME());

				// �ߓ���ۊǋ�̑q�ɋ敪�`�F�b�N
				if(inWhStruct.getw_MRP_FLG().intValue() != 1){
					// �o�^�������s�F�ߓ���ۊǋ�R�[�h�����v�ʌv�Z�Ώۂł͂���܂���
					listMessage.add("M_WH.WH_CD:" + struct.getw_WH_TO_CD());
					listMessage.add("M_WH.MRP_FLG:" +  inWhStruct.getw_MRP_FLG());
					setErrorMessage("AF00097", listMessage);
					listMessage.clear();
				}

				// �ߓ���ۊǋ�̍H��R�[�h�`�F�b�N
				if(struct.getw_PLANT_CD().equals(inWhStruct.getw_PLANT_CD_check()) == false){
					// �o�^�������s�F�ߓ���ۊǋ�R�[�h�͑��̍H��̃f�[�^�Ȃ̂Ŏw��ł��܂���
					listMessage.add("M_WH.WH_CD:" + struct.getw_WH_TO_CD());
					listMessage.add("M_WH.PLANT_CD:" +  inWhStruct.getw_PLANT_CD_check());
					setErrorMessage("AF00042", listMessage);
					listMessage.clear();
				}

			}

			// �Ɩ��^�p���擾
			List dateList = entity.mselectBUSINESS_OPR_DATE.read(conn, struct);
			AF0080010Struct dateStruct = null;
			if(dateList.size() <= 0){
				// �o�^�������s�F�Ɩ��^�p�������݂��܂���
				logMessage = "SYS_DATE_CTRL.PLANT_CD:" + struct.getw_PLANT_CD();
				setErrorMessage("AF00056", logMessage);
			}
			else{
				dateStruct = (AF0080010Struct)dateList.get(0);

				// �ߓ����`�F�b�N
				Date issue_Date = stringToDate(struct.getRCV_ISSUE_DATE());
				Date business_Date = stringToDate(dateStruct.getw_BUSINESS_OPR_DATE());
				if(issue_Date.after(business_Date)){
					// �o�^�������s�F�ߓ����ɖ����̓��t�͎w��ł��܂���
					logMessage = "SYS_DATE_CTRL.BUSINESS_OPR_DATE:" + dateStruct.getw_BUSINESS_OPR_DATE();
					setErrorMessage("ZZ05103", logMessage);
				}
			}

			// �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
			if(msgStruct.sizeError() <= 0)
			{
				// �����ԁA�����ԁA�i�ڍ݌ɏo�ɍϐ��̍Čv�Z
				calcIssuedQty(struct);
				
				if (struct.getw_WH_FROM_CD() != null && "".equals(struct.getw_WH_FROM_CD()) == false) {
				// �݌ɐ��ʂ��Ď擾����
				List qtyList = null;
				AF0080010Struct qtyStruct = null;

				// �i�ڍ݌ɂ���o�ɂ���ꍇ
				if(!(struct.getMRP_ODR_TYP().equals(AF0080Const._MRP_ODR_JOB_ODR_CD) ||
						struct.getMRP_ODR_TYP().equals(AF0080Const._MRP_ODR_STOCK_ALC_JOB_ODR_CD)))
				{
					// �ۊǋ�݌ɐ��擾
					qtyList = entity.mselectT_ITEM_STOCK.read(conn, struct);
					if(qtyList.size() > 0)
					{
						qtyStruct = (AF0080010Struct)qtyList.get(0);
						if ((calc.compare(struct.getRCV_ISSUE_QTY(), qtyStruct.getw_STOCK_ON_HAND_QTY()) > 0)
								&& ("3".equals(struct.geth_ISSUE_TYP()) == false))
						{
							// �o�^�������s�F�ۊǋ�ʍ݌ɐ���葽���ߓ��ł��܂���
							listMessage.add("T_ITEM_STOCK.ITEM_CD:" + struct.getITEM_CD());
							listMessage.add("T_ITEM_STOCK.WH_CD:" + struct.getw_WH_FROM_CD());
							listMessage.add("T_ITEM_STOCK.PLANT_CD:" + struct.getw_PLANT_CD());
							listMessage.add("T_ITEM_STOCK.STOCK_ON_HAND_QTY:" + qtyStruct.getw_STOCK_ON_HAND_QTY());
							setErrorMessage("AF00088", listMessage);
							listMessage.clear();
						}

					}else{
						if(!"3".equals(struct.geth_ISSUE_TYP())){//�����o�ɂ̏ꍇ�̓`�F�b�N���s��Ȃ� 2006/07/06
							// �o�^�������s�F�ۊǋ�ʕi�ڍ݌Ƀf�[�^�����݂��܂���
							listMessage.add("T_ITEM_STOCK.ITEM_CD:" + struct.getITEM_CD());
							listMessage.add("T_ITEM_STOCK.WH_CD:" + struct.getw_WH_FROM_CD());
							listMessage.add("T_ITEM_STOCK.PLANT_CD:" + struct.getw_PLANT_CD());
							setErrorMessage("AF00044", listMessage);
							listMessage.clear();
						}
					}
				}
				// ���ԍ݌ɂ���o�ɂ���ꍇ
				else{
					// �ۊǋ�݌ɐ��擾
					qtyList = entity.mselectT_JOB_ODR_CD_STOCK.read(conn, struct);
					if(qtyList.size() > 0)
					{
						qtyStruct = (AF0080010Struct)qtyList.get(0);
						if ((calc.compare(struct.getRCV_ISSUE_QTY(), qtyStruct.getw_STOCK_ON_HAND_QTY()) > 0)
								&& ("3".equals(struct.geth_ISSUE_TYP()) == false))
						{
							// �o�^�������s�F�ۊǋ�ʍ݌ɐ���葽���ߓ��ł��܂���
							listMessage.add("T_JOB_ODR_CD_STOCK.JOB_ODR_CD:" + struct.getJOB_ODR_CD());
							listMessage.add("T_JOB_ODR_CD_STOCK.ITEM_CD:" + struct.getITEM_CD());
							listMessage.add("T_JOB_ODR_CD_STOCK.WH_CD:" + struct.getw_WH_FROM_CD());
							listMessage.add("T_JOB_ODR_CD_STOCK.PLANT_CD:" + struct.getw_PLANT_CD());
							listMessage.add("T_JOB_ODR_CD_STOCK.STOCK_ON_HAND_QTY:" + qtyStruct.getw_STOCK_ON_HAND_QTY());
							setErrorMessage("AF00088", listMessage);
							listMessage.clear();
						}

					}else{
						if(!"3".equals(struct.geth_ISSUE_TYP())){//�����o�ɂ̏ꍇ�̓`�F�b�N���s��Ȃ� 2006/07/06
							// �o�^�������s�F�ۊǋ�ʐ��ԍ݌Ƀf�[�^�����݂��܂���
							listMessage.add("T_JOB_ODR_CD_STOCK.JOB_ODR_CD:" + struct.getJOB_ODR_CD());
							listMessage.add("T_JOB_ODR_CD_STOCK.ITEM_CD:" + struct.getITEM_CD());
							listMessage.add("T_JOB_ODR_CD_STOCK.WH_CD:" + struct.getw_WH_FROM_CD());
							listMessage.add("T_JOB_ODR_CD_STOCK.PLANT_CD:" + struct.getw_PLANT_CD());
							setErrorMessage("AF00045", listMessage);
							listMessage.clear();
						}
					}
					}
					
					// �o�ɐ��Əo�ɍϐ��̃`�F�b�N
					if("true".equals(struct.getc_JOB_ODR_CD())){
						if(struct.getJOB_ODR_CD().equals(struct.getSAVE_JOB_ODR_CD())){
							// �����ԍ݌ɂ֖ߓ�����ꍇ
							if(Calculate.compare(struct.getRCV_ISSUE_QTY(),
									struct.getOWN_ISSUED_QTY()) > 0){
								setErrorMessage("AF00120");
							}
						}else{
							// �����ԍ݌ɂ֖ߓ�����ꍇ
							IssueRemain issueRemain = new IssueRemain(conn);
							// ���萻�ԏo�ɍϐ��̎擾
							String calc = issueRemain.getIssuedQtyByJobOdr(struct.getw_OD_NO(),
									struct.getJOB_ODR_CD(), AF0080Const._JOB_ODR_DETAIL_NO).toString();
							
							if(Calculate.compare(struct.getRCV_ISSUE_QTY(), calc) > 0){
								setErrorMessage("AF00121");
							}
						}
					}else{
						// �i�ڍ݌ɂ֖ߓ�����ꍇ
						if(Calculate.compare(struct.getRCV_ISSUE_QTY(),
								struct.getITEM_ISSUED_QTY()) > 0){
							setErrorMessage("AF00122");
						}
					}
				}

				// �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
				if(msgStruct.sizeError() <= 0)
				{
					// �g�����U�N�V�����J�n
					conn.beginTransWeb();

					// �ߓ��� �؂�グ����
					boolean resultCeil = false;

					// ���ɏ������ʃt���O
					boolean ret = true;

					if(struct.getw_UNIT_QTY_TYP().intValue() == 1
						&& calc.isNumeric(struct.getRCV_ISSUE_QTY()) == true ){
						struct.setRCV_ISSUE_QTY(calc.ceil(struct.getRCV_ISSUE_QTY(), 0));
						resultCeil = true;
					}

					// �i�ڏ���Struct�ɐݒ�
					struct.setw_STOCK_UPD_TYP(new Integer(1));				// �݌ɍX�V�敪

					// �R�s�[�X�g���N�g�̐���
					AF0080010Struct issueStruct = new AF0080010Struct(struct);
					AF0080010Struct rcvStruct = new AF0080010Struct(struct);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////���ɏ���///////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

					// [�o�Ɏw��]."�o�ɐ�ۊǋ�R�[�h" �� Null �łȂ��A���A
					// [�o�Ɏw��]."�o�Ɏw���o�ɋ敪" �� 3�F�����o�� �łȂ��ꍇ
					if ((struct.getw_WH_FROM_CD() != null && "".equals(struct.getw_WH_FROM_CD()) == false)
							&& ("3".equals(struct.geth_ISSUE_TYP()) == false)) {
						
						// ���o�ɊǗ��ԍ��̔�
						String rcvCtrlCd = null;
						CollectNumber rcvCollect = new CollectNumber(
														CollectNumber.ISSUE_CD, 
														getsysUSER_CD(), 
														this.sp.getProcId(), 
														rcvStruct.getw_PLANT_CD());
						rcvCtrlCd = rcvCollect.getNo();
						if(rcvCtrlCd == null){
							// �o�^�������s�F���o�ɊǗ��ԍ��̍̔ԂɎ��s���܂���
							logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
							setSyslogConfig(logMessage);
	
							// ���[���o�b�N
							conn.rollback();
	
							ExpjMessage emsg = new ExpjMessage("AF00057");
							throw new FoundationException(
												"AF0080010Control",
												"controlinsert()",
												emsg.getMessage(CoreTools.getLocale(this.getsysUSER_CD())) );
						}
	
						// ���O�o��
						logMessage = "T_RCV_ISSUE.RCV_ISSUE_CTRL_CD:" + rcvCtrlCd;
						setSyslogConfig(logMessage);
	
						// ���o�ɊǗ��ԍ��ݒ�
						rcvStruct.setw_RCV_ISSUE_CTRL_CD(rcvCtrlCd);
	
						// ���o�ɋ敪�ݒ�
						rcvStruct.setw_RCV_ISSUE_TYP(new Integer(1));				// ����
	
						// ���o�ɐ��̒���(���ɂ̏ꍇ�A������ݒ�)
						rcvStruct.setRCV_ISSUE_QTY(calc.multiply(struct.getRCV_ISSUE_QTY(), "-1"));
	
						// �o�^����ۊǋ�R�[�h���o�ɐ��
						rcvStruct.setw_WH_CD(struct.getw_WH_FROM_CD());
	
						// ���o�ɔ����敪
						if ((struct.getCONS_TYP()).intValue() == 0) {
							rcvStruct.setw_RCV_ISSUE_GNR_TYP(new Integer(69));			// �H���݌ɓ��Ɏ��
						} else {
							rcvStruct.setw_RCV_ISSUE_GNR_TYP(new Integer(89));			// �����݌ɓ��Ɏ��
						}
						
						// ����
						if(struct.getMRP_ODR_TYP().equals(AF0080Const._MRP_ODR_JOB_ODR_CD) ||
								struct.getMRP_ODR_TYP().equals(AF0080Const._MRP_ODR_STOCK_ALC_JOB_ODR_CD)){
							rcvStruct.setJOB_ODR_CD(struct.getSAVE_JOB_ODR_CD());
						}else{
							rcvStruct.setJOB_ODR_CD(null);
						}
			            //��ЃR�[�h
						if("".equals(rcvStruct.getw_COMPANY_CD()) || rcvStruct.getw_COMPANY_CD() == null){
							rcvStruct.setw_COMPANY_CD(_company_cd);
						}
						// �ۊǋ�ʓ��o�ɓo�^
						entity.minsertT_RCV_ISSUE.create(conn, rcvStruct);
	
						// ���ɏ���
						RcvProcess rcvPrc = new RcvProcess(conn, rcvCtrlCd);
						if(rcvPrc.execProcess() == true){
							logMessage = "Receive Process was Complated!";
							setSyslogConfig(logMessage);
	
							if(resultCeil == true){
								// �o�^�������s�F�����Ǘ��i�ڂ̂��ߏ����_�ȉ��͐؂�グ���čX�V���܂���
								logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
								setInfoMessage("AF60004", logMessage);
	
								// �؂�グ�t���O��������
								resultCeil = false;
							}
						} else {
							// ���ɏ���NG
							ret = false;
	
							logMessage = "Receive Process was Failed...";
							setSyslogConfig(logMessage);
	
							// ���[���o�b�N
							conn.rollback();
						}
	
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
	
						// ���ɏ������ʔ���
						if(ret == false){
							// NG�̏ꍇ�͏o�ɏ����͎��s���Ȃ�
							return;
						}
					}
					
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////�o�ɏ���///////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

					// ���o�ɊǗ��ԍ��̔�
					String issueCtrlCd = null;
					CollectNumber issueCollect = new CollectNumber(
													CollectNumber.ISSUE_CD, 
													getsysUSER_CD(), 
													this.sp.getProcId(), 
													issueStruct.getw_PLANT_CD());
					issueCtrlCd = issueCollect.getNo();
					if(issueCtrlCd == null){
						// �o�^�������s�F���o�ɊǗ��ԍ��̍̔ԂɎ��s���܂���
						logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
						setErrorMessage("AF00057", logMessage);

						// ���[���o�b�N
						conn.rollback();

						ExpjMessage emsg = new ExpjMessage("AF00057");
						throw new FoundationException(
											"AF0080010Control",
											"controlinsert()",
											emsg.getMessage(CoreTools.getLocale(this.getsysUSER_CD())) );
					}

					// ���O�o��
					logMessage = "T_RCV_ISSUE_CTRL.RCV_ISSUE_CTRL_CD:" + issueCtrlCd;
					setSyslogConfig(logMessage);

					// ���o�ɊǗ��ԍ��ݒ�
					issueStruct.setw_RCV_ISSUE_CTRL_CD(issueCtrlCd);

					// ���o�ɋ敪�ݒ�
					issueStruct.setw_RCV_ISSUE_TYP(new Integer(2));				// �o��

					// ���o�ɐ��̒���(�o�ɂ̏ꍇ�A������ݒ�)
					issueStruct.setRCV_ISSUE_QTY(struct.getRCV_ISSUE_QTY());

					// �o�^����ۊǋ�R�[�h���o�Ɍ���
					issueStruct.setw_WH_CD(struct.getw_WH_TO_CD());

					// ���o�ɔ����敪
					issueStruct.setw_RCV_ISSUE_GNR_TYP(new Integer(29));		// �o�Ɏ��
		            //��ЃR�[�h
					if("".equals(issueStruct.getw_COMPANY_CD()) || issueStruct.getw_COMPANY_CD() == null){
						issueStruct.setw_COMPANY_CD(_company_cd);
					}
					// �ۊǋ�ʓ��o�ɓo�^
					entity.minsertT_RCV_ISSUE.create(conn, issueStruct);

					// �o�ɏ���
					IssueProcess issuePrc = new IssueProcess(conn, issueCtrlCd);
					if(issuePrc.execProcess() == true){
						logMessage = "Issue Process was Complated!";
						setSyslogConfig(logMessage);

						if(resultCeil == true){
							// �o�^�������s�F�����Ǘ��i�ڂ̂��ߏ����_�ȉ��͐؂�グ���čX�V���܂���
							logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
							setInfoMessage("AF60004", logMessage);
						}
					} else {
						logMessage = "Issue Process was Failed...";
						setSyslogConfig(logMessage);

						// ���[���o�b�N
						conn.rollback();
					}

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

					// �L���x�������֒ǉ�
					// �G���[������ΏI��
					if (issuePrc.getErrorList().size() > 0 ) {
						return;
					}
					
					// [�o�Ɏw��]."�x���敪" �� 1�F�L���x�� �̏ꍇ
					if ((struct.getCONS_TYP()).intValue() == 1) {
						logMessage = "M_CONS_UNIT_COST.ITEM_CD:" +  struct.getITEM_CD()
									+ ", M_CONS_UNIT_COST.VEND_CD:" +  struct.getVEND_CD()
									+ ", M_CONS_UNIT_COST.COMPANY_CD:" +  struct.getw_COMPANY_CD()
									+ ", T_ISSUE_INST.EFF_PHASE_IN_DATE:" + struct.getRCV_ISSUE_DATE();
						setSyslogConfig(logMessage);
						//�x���P���̎擾
						List tmpList = entity.mM_CONS_UNIT_COST.read(conn, struct);
						if(tmpList.size() <= 0) {
							struct.setUNIT_COST(new String("0"));
							struct.setUNIT_COST_TYP("1");
						}
						else{
							AF0080010Struct workStruct = (AF0080010Struct)tmpList.get(0);
							logMessage = "M_CONS_UNIT_COST.ONEROUS_FLG:" +  workStruct.getONEROUS_FLG()
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
								struct.setUNIT_COST_TYP("1");
							}
						}

						// �L���x���ԍ��̔�
						String ctrlCd = null;
						CollectNumber collect = new CollectNumber(
												CollectNumber.ONERCONS_CD, 
												getsysUSER_CD(), 
												this.sp.getProcId(), 
												struct.getw_PLANT_CD());
						try{
							ctrlCd = collect.getNo();
							if(ctrlCd == null){
								ExpjMessage emsg = new ExpjMessage("AF00078");
								throw new FoundationException(
												"AF0080010Control",
												"insert_rcv_process()",
												emsg.getMessage(CoreTools.getLocale(this.getsysUSER_CD())) );
							}
						}
						catch(FoundationException ex){
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
						struct.setRCV_ISSUE_QTY(struct.getRCV_ISSUE_QTY());

						// �o�Ɏw���ԍ�
						struct.setISSUE_INST_CD(struct.getISSUE_INST_CD());
						// �ԕi��ۊǋ�R�[�h

						logMessage = "T_PAST_ONEROUS_CONS.ONEROUS_CONS_NO:" + struct.getONEROUS_CONS_NO()
									+ ",T_PAST_ONEROUS_CONS.JOB_ODR_CD:" + struct.getJOB_ODR_CD()
									+ ", T_PAST_ONEROUS_CONS.ITEM_CD:" + struct.getITEM_CD()
									+ ", T_PAST_ONEROUS_CONS.VEND_CD:" + struct.getVEND_CD()
									+ ", T_PAST_ONEROUS_CONS.ISSUE_DATE:" + struct.getRCV_ISSUE_DATE()
									+ ", T_PAST_ONEROUS_CONS.ISSUE_QTY:" + struct.getRCV_ISSUE_QTY();
						setSyslogConfig(logMessage);

					// �R�s�[�X�g���N�g�̐���
					AF0080010Struct pastOnerousConsStruct = new AF0080010Struct(struct);
					
						pastOnerousConsStruct.setONEROUS_CONS_NO(struct.getONEROUS_CONS_NO());
						pastOnerousConsStruct.setUNIT_COST(struct.getUNIT_COST());
						pastOnerousConsStruct.setUNIT_COST_TYP(struct.getUNIT_COST_TYP());
						
						// ���o�ɊǗ��ԍ�
						pastOnerousConsStruct.setRCV_ISSUE_CTRL_CD(issueCtrlCd);
						
						// ��ЃR�[�h
						pastOnerousConsStruct.setCOMPANY_CD(struct.getw_COMPANY_CD());
						
						// �H��R�[�h
						pastOnerousConsStruct.setPLANT_CD(struct.getw_PLANT_CD());
						
						// �o�ɐ�
						pastOnerousConsStruct.setRCV_ISSUE_QTY(Calculate.multiply(struct.getRCV_ISSUE_QTY(), "-1"));
						
						// �ԕi���R�R�[�h
						pastOnerousConsStruct.setRETURNED_CAUSE_CD(struct.getRCV_ISSUE_COMMENT());
						
						// �L���x������o�^
						entity.mT_PAST_ONEROUS_CONS.create(conn, pastOnerousConsStruct);
					}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
					// �R�~�b�g
					conn.commit();
					
					// �L�[�R�s�[
					struct.copy(keyStruct);	
					
				}
				
			}
			
		}catch(ParseException e){
			// ���[���o�b�N
				conn.rollback();

			// �ϊ����s
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			
			emsg = new ExpjMessage( "ZZ01006", e.toString());
			sysLog.severe (emsg ,getsysUSER_CD());
			throw ee;


		}catch(SQLException e){
			// ������Ԃ��u�Ǎ����s�v�ɐݒ�
			setReadStatus(ERROR);

			// ���[���o�b�N
			conn.rollback();

			// �G���[���b�Z�[�W�쐬
			setSqlExceptionMsg(e);

		}catch(Exception e){
			// ���[���o�b�N
			conn.rollback();

			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006" , "ProcessId:" + this.sp.getProcId() );
			ee.add(emsg);
			throw ee;
		}
		//---------------------------------------------------------------------
                //}}user_implement_dev:<controlinsertSub1>
		logger.exiting("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlcloseSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0080");
		logger.entering("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlcloseSub1");
			//{{user_implement_dev:<controlcloseSub1>
		//-----------------------------------------------------------------------------		
		// �L�[�R�s�[
		struct.copy(keyStruct);	
		
		// �e��ʃf�[�^�ēǍ�
		controlselect();
		//-----------------------------------------------------------------------------
                //}}user_implement_dev:<controlcloseSub1>
		logger.exiting("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlcloseSub1");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlinsertSub2() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0080");
		logger.entering("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub2");
			//{{user_implement_dev:<controlinsertSub2>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		// ���O�o�͏��i�[�p
		String logMessage = "";
		List listMessage = new ArrayList();

		try {
			// �ۊǋ於�N���A
			struct.setw_WH_FROM_NAME((String)null);	// �ߓ���
			struct.setw_WH_TO_NAME((String)null);	// �ߓ���
			
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
			struct.seth_Param_Div("BEST_BEFORE_DATE_CHECK_FLG");
			List sysParaList = entity.mSELECT_SYS_PARAMETER.read(conn, struct);
			if(sysParaList.size() > 0){
				AF0080010Struct sysParaStruct = (AF0080010Struct)sysParaList.get(0);
				struct.setPARAM_RESULT(sysParaStruct.getPARAM_RESULT());
			}else{
				struct.setPARAM_RESULT("1");
			}

			AF0080010Struct whTmpStruct = new AF0080010Struct(struct);

			if (struct.getw_WH_FROM_CD() != null && !"".equals(struct.getw_WH_FROM_CD())) {
				// �ߓ����ۊǋ���擾
				whTmpStruct.setw_WH_CD(struct.getw_WH_FROM_CD());
	
				List outWhList = entity.mselectM_WH.read(conn, whTmpStruct);
				AF0080010Struct outWhStruct = null;
				if(outWhList.size() <= 0){
					// �o�^�������s�F�ߓ����ۊǋ�R�[�h�����݂��܂���
					logMessage = "M_WH.WH_CD:" + struct.getw_WH_FROM_CD();
					setErrorMessage("AF00037", logMessage);
				}
				else{
					outWhStruct = (AF0080010Struct)outWhList.get(0);
	
					// �ߓ����ۊǋ於��ݒ�
					struct.setw_WH_FROM_NAME(outWhStruct.getw_WH_NAME());
					// �q�ɋ敪��ݒ�
					struct.setw_WH_TYP(outWhStruct.getw_WH_TYP());
					
					// �ߓ����ۊǋ�̍H��R�[�h�`�F�b�N
					if(!struct.getw_PLANT_CD().equals(outWhStruct.getw_PLANT_CD_check())){
						// �o�^�������s�F�ۊǋ�R�[�h�͑��̍H��̃f�[�^�Ȃ̂Ŏw��ł��܂���
						listMessage.add("M_WH.WH_CD:" + struct.getw_WH_FROM_CD());
						listMessage.add("M_WH.PLANT_CD:" +  outWhStruct.getw_PLANT_CD_check());
						setErrorMessage("AF00038", listMessage);
						listMessage.clear();
					}
					
					if(outWhStruct.getw_MRP_FLG().intValue() == 1){
						// �o�^�������s�F�ߓ����ۊǋ�R�[�h�����v�ʌv�Z�Ώۂ̕ۊǋ�ł��B
						listMessage.add("M_WH.WH_CD:" + struct.getw_WH_FROM_CD());
						listMessage.add("M_WH.MRP_FLG:" +  outWhStruct.getw_MRP_FLG());
						setErrorMessage("AF00134", listMessage);
						listMessage.clear();
					}
					
					// �ߓ����ۊǋ�R�[�h�Ɏ����ۊǋ�͎w��ł��܂���
					if ((struct.getw_WH_FROM_CD() != null && !"".equals(struct.getw_WH_FROM_CD()))
							&& (struct.geth_WH_FROM_CD() != null && !"".equals(struct.geth_WH_FROM_CD()))
							&& (outWhStruct.getVEND_CD() != null && !"".equals(outWhStruct.getVEND_CD()))
							&& (struct.getCONS_TYP()).intValue() == 0) {
						listMessage.add("M_WH.WH_CD:" + struct.getw_WH_FROM_CD());
						setErrorMessage("AF00135", listMessage);
						listMessage.clear();
					}
					// �ߓ����ۊǋ�R�[�h�͎x����ƈ�v��������ۊǋ���w��ł��܂���
					if ((struct.getw_WH_FROM_CD() != null && !"".equals(struct.getw_WH_FROM_CD()))
							&& (struct.geth_WH_FROM_CD() != null && !"".equals(struct.geth_WH_FROM_CD()))
							&& (struct.getCONS_TYP()).intValue() != 0) {
						
						if (struct.getVEND_CD() == null || "".equals(struct.getVEND_CD())) {
							if (outWhStruct.getVEND_CD() != null && !"".equals(outWhStruct.getVEND_CD())) {
								listMessage.add("M_WH.WH_CD:" + struct.getw_WH_FROM_CD());
								setErrorMessage("AF00136", listMessage);
								listMessage.clear();
							}
						} else {
							if (!struct.getVEND_CD().equals(outWhStruct.getVEND_CD())) {
								listMessage.add("M_WH.WH_CD:" + struct.getw_WH_FROM_CD());
								setErrorMessage("AF00136", listMessage);
								listMessage.clear();
							}
						}
					}
				}
			}

			// �݌Ƀ��b�g�ԍ��̑��݃`�F�b�N
			List tmpList = null;
			tmpList = entity.mT_LOT_CTRL.read(conn, struct);
			if (tmpList.size() <= 0) {
				logMessage = "T_LOT_CTRL.LOT_NO:" + struct.getw_LOT_NO();
				setErrorMessage("AF20002", logMessage);
			}
			
			// [���b�g�Ǘ�].�h�ܖ������h�� �u�o�ɓ��v�ł���
			//[�p�����[�^].�h ���O�h���f BEST_BEFORE_DATE_CHECK_FLG�f��1:�G���[�̏ꍇ�A�G���[���b�Z�[�W��\������
			
			boolean resultBbdcFlg = false;//�݌Ƀ��b�g�ԍ���NULL�łȂ��o�ɐ���0�ȊO���ܖ��������؂�Ă���ꍇ��ture
			
			List bbdList = entity.mc_BEST_BEFORE_DATE.read(conn, struct);
			if(bbdList.size() > 0){
				AF0080010Struct bbdStruct = (AF0080010Struct)bbdList.get(0);
				if(bbdStruct.getBBD_c_FLG().equals("1")){//2:�x���̏ꍇ�̂��߂Ƀt���O��"true"�ɂ���
					resultBbdcFlg = true;
				}
				if(resultBbdcFlg && struct.getPARAM_RESULT().equals("1")){
					//�ܖ��������؂�Ă��邽�ߏo�ɂł��܂���B
					logMessage = "T_LOT_CTRL.LOT_NO:" + struct.getw_LOT_NO();
					setErrorMessage("AF20009", logMessage);
				}
			}
					
			// �ߓ���ۊǋ���擾
			whTmpStruct.setw_WH_CD(struct.getw_WH_TO_CD());

			List inWhList = entity.mselectM_WH.read(conn, whTmpStruct);
			AF0080010Struct inWhStruct = null;
			if(inWhList.size() <= 0){
				// �o�^�������s�F�ߓ���ۊǋ�R�[�h�����݂��܂���
				logMessage = "M_WH.WH_CD:" + struct.getw_WH_TO_CD();
				setErrorMessage("AF00041", logMessage);
			}
			else{
				inWhStruct = (AF0080010Struct)inWhList.get(0);

				// �ߓ���ۊǋ於��ݒ�
				struct.setw_WH_TO_NAME(inWhStruct.getw_WH_NAME());

				// �ߓ���ۊǋ�̑q�ɋ敪�`�F�b�N
				if(inWhStruct.getw_MRP_FLG().intValue() != 1){
					// �o�^�������s�F�ߓ���ۊǋ�R�[�h�����v�ʌv�Z�Ώۂł͂���܂���
					listMessage.add("M_WH.WH_CD:" + struct.getw_WH_TO_CD());
					listMessage.add("M_WH.MRP_FLG:" +  inWhStruct.getw_MRP_FLG());
					setErrorMessage("AF00097", listMessage);
					listMessage.clear();
				}

				// �ߓ���ۊǋ�̍H��R�[�h�`�F�b�N
				if(!struct.getw_PLANT_CD().equals(inWhStruct.getw_PLANT_CD_check())){
					// �o�^�������s�F�ߓ���ۊǋ�R�[�h�͑��̍H��̃f�[�^�Ȃ̂Ŏw��ł��܂���
					listMessage.add("M_WH.WH_CD:" + struct.getw_WH_TO_CD());
					listMessage.add("M_WH.PLANT_CD:" +  inWhStruct.getw_PLANT_CD_check());
					setErrorMessage("AF00042", listMessage);
					listMessage.clear();
				}

			}

			// �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
			if(msgStruct.sizeError() <= 0) {
				// �o�Ɏ��ѐ���
				String issueQty = "0.0";
				// [�o�Ɏ��і���]����o�Ɏ��ѐ��ʂ��擾
				List issueList = entity.mselectISSUE_QTY.read(conn, struct);
				if(!issueList.isEmpty()) {
					issueQty = ((AF0080010Struct)issueList.get(0)).getl_TOTAL_ISSUE_QTY();
				}
				// �ߓ��� > �o�Ɏ��ѐ��ʏꍇ�A�G���[���o��
				if(Calculate.compare(struct.getRCV_ISSUE_QTY(), issueQty) > 0) {
					listMessage.add("T_LOT_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD());
					listMessage.add("T_LOT_ISSUE_INST.LOT_NO:" +  struct.getw_LOT_NO());
					setErrorMessage("AF00178", listMessage);
					listMessage.clear();
				}
			}
			
			// �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
			if(msgStruct.sizeError() <= 0)
			{
				// [���b�g�Ǘ�].�h�ܖ������h�� �u�o�ɓ��v�ł���
				//[�p�����[�^].�h ���O�h���f BEST_BEFORE_DATE_CHECK_FLG�f��2:�x���̏ꍇ�A�x�����b�Z�[�W��\������
				if(struct.getPARAM_RESULT().equals("2") && (resultBbdcFlg == true)){
					// �ܖ������؂�̏o�ɂ��s���܂����B
					logMessage = "T_LOT_CTRL.LOT_NO:" + struct.getw_LOT_NO();
					setWarnMessage("AF20010", logMessage);
				}
				
				// �i�ڍ݌ɏo�ɗ݌v��
				struct.setITEM_ISSUED_QTY(struct.getTOTAL_ISSUE_QTY());

				
				if (struct.getw_WH_FROM_CD() != null && !"".equals(struct.getw_WH_FROM_CD())) {
					// �݌ɐ��ʂ��Ď擾����
					List qtyList = null;
					AF0080010Struct qtyStruct = null;
	
					// �i�ڍ݌ɂ���o�ɂ���ꍇ
					if(!(struct.getMRP_ODR_TYP().equals(AF0080Const._MRP_ODR_JOB_ODR_CD) ||
							struct.getMRP_ODR_TYP().equals(AF0080Const._MRP_ODR_STOCK_ALC_JOB_ODR_CD)))
					{
						// �ۊǋ�݌ɐ��擾
						qtyList = entity.mselectT_ITEM_STOCK.read(conn, struct);
						if(qtyList.size() > 0)
						{
							qtyStruct = (AF0080010Struct)qtyList.get(0);
							if ((calc.compare(struct.getRCV_ISSUE_QTY(), qtyStruct.getw_STOCK_ON_HAND_QTY()) > 0)
									&& (!"3".equals(struct.geth_ISSUE_TYP())))
							{
								// �o�^�������s�F�ۊǋ�ʍ݌ɐ���葽���ߓ��ł��܂���
								listMessage.add("T_ITEM_STOCK.ITEM_CD:" + struct.getITEM_CD());
								listMessage.add("T_ITEM_STOCK.WH_CD:" + struct.getw_WH_FROM_CD());
								listMessage.add("T_ITEM_STOCK.PLANT_CD:" + struct.getw_PLANT_CD());
								listMessage.add("T_ITEM_STOCK.STOCK_ON_HAND_QTY:" + qtyStruct.getw_STOCK_ON_HAND_QTY());
								setErrorMessage("AF00088", listMessage);
								listMessage.clear();
							}
	
						}else{
							if(!"3".equals(struct.geth_ISSUE_TYP())){//�����o�ɂ̏ꍇ�̓`�F�b�N���s��Ȃ� 2006/07/06
								// �o�^�������s�F�ۊǋ�ʕi�ڍ݌Ƀf�[�^�����݂��܂���
								listMessage.add("T_ITEM_STOCK.ITEM_CD:" + struct.getITEM_CD());
								listMessage.add("T_ITEM_STOCK.WH_CD:" + struct.getw_WH_FROM_CD());
								listMessage.add("T_ITEM_STOCK.PLANT_CD:" + struct.getw_PLANT_CD());
								setErrorMessage("AF00044", listMessage);
								listMessage.clear();
							}
						}
					}
				}

				// �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
				if(msgStruct.sizeError() <= 0)
				{
					// �g�����U�N�V�����J�n
					conn.beginTransWeb();

					// �ߓ��� �؂�グ����
					boolean resultCeil = false;

					// ���ɏ������ʃt���O
					boolean ret = true;

					if(struct.getw_UNIT_QTY_TYP().intValue() == 1
						&& calc.isNumeric(struct.getRCV_ISSUE_QTY())){
						struct.setRCV_ISSUE_QTY(calc.ceil(struct.getRCV_ISSUE_QTY(), 0));
						resultCeil = true;
					}

					// �i�ڏ���Struct�ɐݒ�
					struct.setw_STOCK_UPD_TYP(new Integer(1));				// �݌ɍX�V�敪

					// �R�s�[�X�g���N�g�̐���
					AF0080010Struct issueStruct = new AF0080010Struct(struct);
					AF0080010Struct rcvStruct = new AF0080010Struct(struct);

///////////////////���ɏ���///////////////////////////////////////////////////////////////////////////////////////////////////

					// [�o�Ɏw��]."�o�ɐ�ۊǋ�R�[�h" �� Null �łȂ��A���A
					// [�o�Ɏw��]."�o�Ɏw���o�ɋ敪" �� 3�F�����o�� �łȂ��ꍇ
					if ((struct.getw_WH_FROM_CD() != null && !"".equals(struct.getw_WH_FROM_CD()))
							&& (!"3".equals(struct.geth_ISSUE_TYP()))) {
						
						// ���o�ɊǗ��ԍ��̔�
						String rcvCtrlCd = null;
						CollectNumber rcvCollect = new CollectNumber(
														CollectNumber.ISSUE_CD, 
														getsysUSER_CD(), 
														this.sp.getProcId(), 
														rcvStruct.getw_PLANT_CD());
						rcvCtrlCd = rcvCollect.getNo();
						if(rcvCtrlCd == null){
							// �o�^�������s�F���o�ɊǗ��ԍ��̍̔ԂɎ��s���܂���
							logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
							setSyslogConfig(logMessage);
	
							// ���[���o�b�N
							conn.rollback();
	
							ExpjMessage emsg = new ExpjMessage("AF00057");
							throw new FoundationException(
												"AF0080010Control",
												"controlinsert()",
												emsg.getMessage(CoreTools.getLocale(this.getsysUSER_CD())) );
						}
	
						// ���O�o��
						logMessage = "T_RCV_ISSUE.RCV_ISSUE_CTRL_CD:" + rcvCtrlCd;
						setSyslogConfig(logMessage);
	
						// ���o�ɊǗ��ԍ��ݒ�
						rcvStruct.setw_RCV_ISSUE_CTRL_CD(rcvCtrlCd);
	
						// ���o�ɋ敪�ݒ�
						rcvStruct.setw_RCV_ISSUE_TYP(new Integer(1));				// ����
	
						// ���o�ɐ��̒���(���ɂ̏ꍇ�A������ݒ�)
						rcvStruct.setRCV_ISSUE_QTY(calc.multiply(struct.getRCV_ISSUE_QTY(), "-1"));
	
						// �o�^����ۊǋ�R�[�h���o�ɐ��
						rcvStruct.setw_WH_CD(struct.getw_WH_FROM_CD());
	
						// ���o�ɔ����敪
						if ((struct.getCONS_TYP()).intValue() == 0) {
							rcvStruct.setw_RCV_ISSUE_GNR_TYP(new Integer(69));			// �H���݌ɓ��Ɏ��
						} else {
							rcvStruct.setw_RCV_ISSUE_GNR_TYP(new Integer(89));			// �����݌ɓ��Ɏ��
						}
						
						// ����
						rcvStruct.setJOB_ODR_CD(null);

						// ���[�J���b�g�ԍ�
						rcvStruct.setVEND_LOT_NO(null);
			            //��ЃR�[�h
						if("".equals(rcvStruct.getw_COMPANY_CD()) || rcvStruct.getw_COMPANY_CD() == null){
							rcvStruct.setw_COMPANY_CD(_company_cd);
						}
						// �ۊǋ�ʓ��o�ɓo�^
						entity.minsertT_RCV_ISSUE.create(conn, rcvStruct);
	
						// ���ɏ���
						RcvProcess rcvPrc = new RcvProcess(conn, rcvCtrlCd);
						if(rcvPrc.execProcess() == true){
							logMessage = "Receive Process was Complated!";
							setSyslogConfig(logMessage);
	
							if(resultCeil == true){
								// �o�^�������s�F�����Ǘ��i�ڂ̂��ߏ����_�ȉ��͐؂�グ���čX�V���܂���
								logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
								setInfoMessage("AF60004", logMessage);
	
								// �؂�グ�t���O��������
								resultCeil = false;
							}
						} else {
							// ���ɏ���NG
							ret = false;
	
							logMessage = "Receive Process was Failed...";
							setSyslogConfig(logMessage);
	
							// ���[���o�b�N
							conn.rollback();
						}
	
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
	
						// ���ɏ������ʔ���
						if(ret == false){
							// NG�̏ꍇ�͏o�ɏ����͎��s���Ȃ�
							return;
						}
					}
					
///////////////////�o�ɏ���///////////////////////////////////////////////////////////////////////////////////////////////////

					// ���o�ɊǗ��ԍ��̔�
					String issueCtrlCd = null;
					CollectNumber issueCollect = new CollectNumber(
													CollectNumber.ISSUE_CD, 
													getsysUSER_CD(), 
													this.sp.getProcId(), 
													issueStruct.getw_PLANT_CD());
					issueCtrlCd = issueCollect.getNo();
					if(issueCtrlCd == null){
						// �o�^�������s�F���o�ɊǗ��ԍ��̍̔ԂɎ��s���܂���
						logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
						setErrorMessage("AF00057", logMessage);

						// ���[���o�b�N
						conn.rollback();

						ExpjMessage emsg = new ExpjMessage("AF00057");
						throw new FoundationException(
											"AF0080010Control",
											"controlinsert()",
											emsg.getMessage(CoreTools.getLocale(this.getsysUSER_CD())) );
					}

					// ���O�o��
					logMessage = "T_RCV_ISSUE_CTRL.RCV_ISSUE_CTRL_CD:" + issueCtrlCd;
					setSyslogConfig(logMessage);

					// ���o�ɊǗ��ԍ��ݒ�
					issueStruct.setw_RCV_ISSUE_CTRL_CD(issueCtrlCd);

					// ���o�ɋ敪�ݒ�
					issueStruct.setw_RCV_ISSUE_TYP(new Integer(2));				// �o��

					// ���o�ɐ��̒���(�o�ɂ̏ꍇ�A������ݒ�)
					issueStruct.setRCV_ISSUE_QTY(struct.getRCV_ISSUE_QTY());

					// �o�^����ۊǋ�R�[�h���o�Ɍ���
					issueStruct.setw_WH_CD(struct.getw_WH_TO_CD());

					// ���o�ɔ����敪
					issueStruct.setw_RCV_ISSUE_GNR_TYP(new Integer(29));		// �o�Ɏ��

					// ����
					issueStruct.setJOB_ODR_CD(null);

					// ���[�J���b�g�ԍ�
					issueStruct.setVEND_LOT_NO(null);
		            //��ЃR�[�h
					if("".equals(issueStruct.getw_COMPANY_CD()) || issueStruct.getw_COMPANY_CD() == null){
						issueStruct.setw_COMPANY_CD(_company_cd);
					}
					// �ۊǋ�ʓ��o�ɓo�^
					entity.minsertT_RCV_ISSUE.create(conn, issueStruct);

					// �o�ɏ���
					IssueProcess issuePrc = new IssueProcess(conn, issueCtrlCd);
					if(issuePrc.execProcess() == true){
						logMessage = "Issue Process was Complated!";
						setSyslogConfig(logMessage);

						if(resultCeil == true){
							// �o�^�������s�F�����Ǘ��i�ڂ̂��ߏ����_�ȉ��͐؂�グ���čX�V���܂���
							logMessage = "T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
							setInfoMessage("AF60004", logMessage);
						}
					} else {
						logMessage = "Issue Process was Failed...";
						setSyslogConfig(logMessage);

						// ���[���o�b�N
						conn.rollback();
					}

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

					// �L���x�������֒ǉ�
					// �G���[������ΏI��
					if (issuePrc.getErrorList().size() > 0 ) {
						return;
					}
					
					// [�o�Ɏw��]."�x���敪" �� 1�F�L���x�� �̏ꍇ
					if ((struct.getCONS_TYP()).intValue() == 1) {
						logMessage = "M_CONS_UNIT_COST.ITEM_CD:" +  struct.getITEM_CD()
									+ ", M_CONS_UNIT_COST.VEND_CD:" +  struct.getVEND_CD()
									+ ", M_CONS_UNIT_COST.COMPANY_CD:" +  struct.getw_COMPANY_CD()
									+ ", T_ISSUE_INST.EFF_PHASE_IN_DATE:" + struct.getRCV_ISSUE_DATE();
						setSyslogConfig(logMessage);
						//�x���P���̎擾
						tmpList = null;
						tmpList = entity.mM_CONS_UNIT_COST.read(conn, struct);
						if(tmpList.size() <= 0) {
							struct.setUNIT_COST(new String("0"));
							struct.setUNIT_COST_TYP("1");
						}
						else{
							AF0080010Struct workStruct = (AF0080010Struct)tmpList.get(0);
							logMessage = "M_CONS_UNIT_COST.ONEROUS_FLG:" +  workStruct.getONEROUS_FLG()
										+ ", M_CONS_UNIT_COST.UNIT_COST:" +  workStruct.getUNIT_COST()
										+ ", M_CONS_UNIT_COST.UNIT_COST_TYP:" +  workStruct.getUNIT_COST_TYP();
							setSyslogConfig(logMessage);
							// �x���P���̗L���t���O��1(�L��)�̎��A�L���P���Z�b�g
							if("1".equals(workStruct.getONEROUS_FLG())){
								struct.setUNIT_COST(workStruct.getUNIT_COST());
								struct.setUNIT_COST_TYP(workStruct.getUNIT_COST_TYP());
							}
							else{
								struct.setUNIT_COST(new String("0"));
								struct.setUNIT_COST_TYP("1");
							}
						}

						// �L���x���ԍ��̔�
						String ctrlCd = null;
						CollectNumber collect = new CollectNumber(
												CollectNumber.ONERCONS_CD, 
												getsysUSER_CD(), 
												this.sp.getProcId(), 
												struct.getw_PLANT_CD());
						try{
							ctrlCd = collect.getNo();
							if(ctrlCd == null){
								ExpjMessage emsg = new ExpjMessage("AF00078");
								throw new FoundationException(
												"AF0080010Control",
												"insert_rcv_process()",
												emsg.getMessage(CoreTools.getLocale(this.getsysUSER_CD())) );
							}
						}
						catch(FoundationException ex){
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
						struct.setRCV_ISSUE_QTY(struct.getRCV_ISSUE_QTY());
						// �o�Ɏw���ԍ�
						struct.setISSUE_INST_CD(struct.getISSUE_INST_CD());
						// �ԕi��ۊǋ�R�[�h

						logMessage = "T_PAST_ONEROUS_CONS.ONEROUS_CONS_NO:" + struct.getONEROUS_CONS_NO()
									+ ",T_PAST_ONEROUS_CONS.JOB_ODR_CD:" + struct.getJOB_ODR_CD()
									+ ", T_PAST_ONEROUS_CONS.ITEM_CD:" + struct.getITEM_CD()
									+ ", T_PAST_ONEROUS_CONS.VEND_CD:" + struct.getVEND_CD()
									+ ", T_PAST_ONEROUS_CONS.ISSUE_DATE:" + struct.getRCV_ISSUE_DATE()
									+ ", T_PAST_ONEROUS_CONS.ISSUE_QTY:" + struct.getRCV_ISSUE_QTY();
						setSyslogConfig(logMessage);

						// �R�s�[�X�g���N�g�̐���
						AF0080010Struct pastOnerousConsStruct = new AF0080010Struct(struct);
						// �L���x���ԍ�
						pastOnerousConsStruct.setONEROUS_CONS_NO(struct.getONEROUS_CONS_NO());
						// �P��
						pastOnerousConsStruct.setUNIT_COST(struct.getUNIT_COST());
						// �P���敪
						pastOnerousConsStruct.setUNIT_COST_TYP(struct.getUNIT_COST_TYP());						
						// ���o�ɊǗ��ԍ�
						pastOnerousConsStruct.setRCV_ISSUE_CTRL_CD(issueCtrlCd);						
						// ��ЃR�[�h
						pastOnerousConsStruct.setCOMPANY_CD(struct.getw_COMPANY_CD());						
						// �H��R�[�h
						pastOnerousConsStruct.setPLANT_CD(struct.getw_PLANT_CD());						
						// �o�ɐ�
						pastOnerousConsStruct.setRCV_ISSUE_QTY(Calculate.multiply(struct.getRCV_ISSUE_QTY(), "-1"));						
						// �ԕi���R�R�[�h
						pastOnerousConsStruct.setRETURNED_CAUSE_CD(struct.getRCV_ISSUE_COMMENT());						
						// ����
						pastOnerousConsStruct.setJOB_ODR_CD(null);
						// ���[�J���b�g�ԍ�
						pastOnerousConsStruct.setVEND_LOT_NO(null);						
						// �L���x������o�^
						entity.mT_PAST_ONEROUS_CONS.create(conn, pastOnerousConsStruct);
					}				
					List modifyCountList = entity.mSelectT_LOT_ISSUE_INST_LOCK.read(conn,struct);
                    //�o�ɍ݌ɖ��ׂ��X�V
					if(calc.compare(struct.getRCV_ISSUE_QTY(),"0") > 0){
						entity.mT_LOT_ISSUE_INST.update(conn, struct);
					}
					// �R�~�b�g
					conn.commit();
					
					// �L�[�R�s�[
					struct.copy(keyStruct);					
				}
			}		
		}catch(ResourceBusyException e) {
			e.printStackTrace();
			setErrorMessage("ZZ01105");
			setReadStatus(ERROR);
		}catch(SQLException e){
			// ������Ԃ��u�Ǎ����s�v�ɐݒ�
			setReadStatus(ERROR);

			// ���[���o�b�N
			conn.rollback();

			// �G���[���b�Z�[�W�쐬
			setSqlExceptionMsg(e);

		}catch(Exception e){
			// ���[���o�b�N
			conn.rollback();

			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006" , "ProcessId:" + this.sp.getProcId() );
			ee.add(emsg);
			throw ee;
		}
                //}}user_implement_dev:<controlinsertSub2>
		logger.exiting("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub2");

		return;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelectSub2() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0080");
		logger.entering("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlSelectSub2");
			//{{user_implement_dev:<controlSelectSub2>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		// ���O�o�͏��i�[�p
		String logMessage = "";
		List listMessage = new ArrayList();
		
		// �`�F�b�N���ʊi�[
		boolean check = true;		

		try {

			// �ۊǋ於�N���A
			struct.setw_WH_FROM_NAME((String)null);	// �ߓ���

			AF0080010Struct whTmpStruct = new AF0080010Struct(struct);

			if (struct.getw_WH_FROM_CD() != null && !"".equals(struct.getw_WH_FROM_CD())) {
				// �ߓ����ۊǋ���擾
				whTmpStruct.setw_WH_CD(struct.getw_WH_FROM_CD());
	
				List outWhList = entity.mselectM_WH.read(conn, whTmpStruct);
				AF0080010Struct outWhStruct = null;
				if(outWhList.size() <= 0){
					// �o�^�������s�F�ߓ����ۊǋ�R�[�h�����݂��܂���
					logMessage = "M_WH.WH_CD:" + struct.getw_WH_FROM_CD();
					setErrorMessage("AF00037", logMessage);
				}
				else{
					outWhStruct = (AF0080010Struct)outWhList.get(0);
	
					// �ߓ����ۊǋ於��ݒ�
					struct.setw_WH_FROM_NAME(outWhStruct.getw_WH_NAME());
					// �q�ɋ敪��ݒ�
					struct.setw_WH_TYP(outWhStruct.getw_WH_TYP());
					
					// �ߓ����ۊǋ�̍H��R�[�h�`�F�b�N
					if(!struct.getw_PLANT_CD().equals(outWhStruct.getw_PLANT_CD_check())){
						// �o�^�������s�F�ۊǋ�R�[�h�͑��̍H��̃f�[�^�Ȃ̂Ŏw��ł��܂���
						listMessage.add("M_WH.WH_CD:" + struct.getw_WH_FROM_CD());
						listMessage.add("M_WH.PLANT_CD:" +  outWhStruct.getw_PLANT_CD_check());
						setErrorMessage("AF00038", listMessage);
						listMessage.clear();
					}
					
					if(outWhStruct.getw_MRP_FLG().intValue() == 1){
						// �o�^�������s�F�ߓ����ۊǋ�R�[�h�����v�ʌv�Z�Ώۂ̕ۊǋ�ł��B
						listMessage.add("M_WH.WH_CD:" + struct.getw_WH_FROM_CD());
						listMessage.add("M_WH.MRP_FLG:" +  outWhStruct.getw_MRP_FLG());
						setErrorMessage("AF00134", listMessage);
						listMessage.clear();
					}
				}
			}

			// �݌Ƀ��b�g�ԍ��̑��݃`�F�b�N
			List tmpList = null;
			if (struct.getw_LOT_NO() != null
					&& !"".equals(struct.getw_LOT_NO())) {
				tmpList = entity.mT_LOT_CTRL.read(conn, struct);
				if (tmpList.size() <= 0) {
					logMessage = "T_LOT_CTRL.LOT_NO:" + struct.getw_LOT_NO();
					setErrorMessage("AF20002", logMessage);
				}
			}

			//���X�g�N���A
			if (list != null) {
				list.clear();
			}
			
            // �G���[������ΏI��
            if (msgStruct.hasError()) {
             return;
            }
            int maxLine = sp.getMaxLine(conn, 20);
			if(maxLine != 0) {
				struct.setROW_COUNT(String.valueOf(maxLine));
			} else {
				struct.setROW_COUNT(null);
			}
			list = entity.mT_LOT_ISSUE_INSTCnt.read(conn, struct);
			long rowCount = Long.parseLong(((AF0080010Struct)this.list.get(0)).getl_COUNT());
			if (!(rowCount==0)){
    			// �\���ő�s����������
    			if(maxLine != 0 && rowCount== maxLine + 1){
    				setReadStatus(TOO_MANY);
    				if(list != null && list.size() > 0){
						list.clear();
					}
    				logMessage = "";
    				setErrorMessage("ZZ01115", "", ""+maxLine);
    				return;
    			}
            }else{
            	setErrorMessage("ZZ06001");
            	readStatus = NOT_FOUND;
            	if(list != null && list.size() > 0){
					list.clear();
				}
				return;
            }
			// ���b�g�ʍ݌Ɉꗗ�̎擾
            list = entity.mT_LOT_ISSUE_INST.read(conn, struct);
            

		} catch (SQLException e) {
			setSqlExceptionMsg(e);

		} finally {
			// ���[�h�ݒ�
			if (check == true) {
				setReadStatus(NORMAL);
			}
		}
                //}}user_implement_dev:<controlSelectSub2>
		logger.exiting("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlSelectSub2");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlcloseSub2() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0080");
		logger.entering("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlcloseSub2");
			//{{user_implement_dev:<controlcloseSub2>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������		
		// �L�[�R�s�[
		struct.copy(keyStruct);
		
		// �e��ʃf�[�^�ēǍ�
		controlselect();
                //}}user_implement_dev:<controlcloseSub2>
		logger.exiting("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlcloseSub2");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0080");
		logger.entering("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
		//-----------------------------------------------------------------------------
		// ���[�U��`������
		usersInitialize();
		//-----------------------------------------------------------------------------
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0080");
		logger.entering("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		//-----------------------------------------------------------------------------

		// ���[�U��`������
		usersInitialize();
		
		try {
			// ���b�g�Ǘ������σ`�F�b�N
			if (LotCtrl.checkLotCtrl(conn)) {
				lotCtrl = "true";
				// ���b�g�Ǘ��t���O��ݒ肷��
				// �Q���敪
				struct.seth_Param_Div("LOT_CTRL_FLAG");
				List sysParaLotFlgList = entity.mSELECT_SYS_PARAMETER.read(conn, struct);
				if(sysParaLotFlgList.size() > 0){
					AF0080010Struct sysParaStruct = (AF0080010Struct)sysParaLotFlgList.get(0);
					struct.setLOT_CTRL_FLG(sysParaStruct.getPARAM_RESULT());
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
		//-----------------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0080");
		logger.entering("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AF0080010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
//			throw new FoundationException("AF0080010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0080010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AF0080010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0080010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AF0080010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0080010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AF0080010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AF0080010Entity entity;
	protected AF0080010Struct struct;
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

		entity = new AF0080010Entity();
		struct = new AF0080010Struct();

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
	 * AF0080010�N���X�̕W���R���X�g���N�^
	 */
	public AF0080010Control() throws BusinessProcessException, FoundationException
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
				AF0080010Struct key = (AF0080010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("w_WH_TO_CD") && key.getw_WH_TO_CD() != null) {
					msgKey.setKeyValue("w_WH_TO_CD", key.getw_WH_TO_CD());
				}
				if(msgKeyType.containsKeyColumn("w_WH_FROM_NAME") && key.getw_WH_FROM_NAME() != null) {
					msgKey.setKeyValue("w_WH_FROM_NAME", key.getw_WH_FROM_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_WH_TO_NAME") && key.getw_WH_TO_NAME() != null) {
					msgKey.setKeyValue("w_WH_TO_NAME", key.getw_WH_TO_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_CHOICE_1") && key.getw_CHOICE_1() != null) {
					msgKey.setKeyValue("w_CHOICE_1", key.getw_CHOICE_1());
				}
				if(msgKeyType.containsKeyColumn("w_CHOICE_2") && key.getw_CHOICE_2() != null) {
					msgKey.setKeyValue("w_CHOICE_2", key.getw_CHOICE_2());
				}
				if(msgKeyType.containsKeyColumn("w_CHOICE_3") && key.getw_CHOICE_3() != null) {
					msgKey.setKeyValue("w_CHOICE_3", key.getw_CHOICE_3());
				}
				if(msgKeyType.containsKeyColumn("w_CHOICE") && key.getw_CHOICE() != null) {
					msgKey.setKeyValue("w_CHOICE", key.getw_CHOICE());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_NAME") && key.getISSUE_CMPLT_NAME() != null) {
					msgKey.setKeyValue("ISSUE_CMPLT_NAME", key.getISSUE_CMPLT_NAME());
				}
				if(msgKeyType.containsKeyColumn("CONS_NAME") && key.getCONS_NAME() != null) {
					msgKey.setKeyValue("CONS_NAME", key.getCONS_NAME());
				}
				if(msgKeyType.containsKeyColumn("s_OPR_INST_CD") && key.gets_OPR_INST_CD() != null) {
					msgKey.setKeyValue("s_OPR_INST_CD", key.gets_OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("c_JOB_ODR_CD") && key.getc_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("c_JOB_ODR_CD", key.getc_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("OWN_ISSUED_QTY") && key.getOWN_ISSUED_QTY() != null) {
					msgKey.setKeyValue("OWN_ISSUED_QTY", key.getOWN_ISSUED_QTY());
				}
				if(msgKeyType.containsKeyColumn("OTHER_ISSUED_QTY") && key.getOTHER_ISSUED_QTY() != null) {
					msgKey.setKeyValue("OTHER_ISSUED_QTY", key.getOTHER_ISSUED_QTY());
				}
				if(msgKeyType.containsKeyColumn("ITEM_ISSUED_QTY") && key.getITEM_ISSUED_QTY() != null) {
					msgKey.setKeyValue("ITEM_ISSUED_QTY", key.getITEM_ISSUED_QTY());
				}
				if(msgKeyType.containsKeyColumn("h_JOB_ODR_CD") && key.geth_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("h_JOB_ODR_CD", key.geth_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("h_WH_FROM_CD") && key.geth_WH_FROM_CD() != null) {
					msgKey.setKeyValue("h_WH_FROM_CD", key.geth_WH_FROM_CD());
				}
				if(msgKeyType.containsKeyColumn("h_RCV_ISSUE_DATE") && key.geth_RCV_ISSUE_DATE() != null) {
					msgKey.setKeyValue("h_RCV_ISSUE_DATE", key.geth_RCV_ISSUE_DATE());
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
				if(msgKeyType.containsKeyColumn("w_LOT_CTRL_FLG") && key.getw_LOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("w_LOT_CTRL_FLG", key.getw_LOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("w_OPR_INST_CD") && key.getw_OPR_INST_CD() != null) {
					msgKey.setKeyValue("w_OPR_INST_CD", key.getw_OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("w_PUCH_ODR_CD") && key.getw_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("w_PUCH_ODR_CD", key.getw_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("w_ISSUE_INST_CD") && key.getw_ISSUE_INST_CD() != null) {
					msgKey.setKeyValue("w_ISSUE_INST_CD", key.getw_ISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("w_COMPANY_CD") && key.getw_COMPANY_CD() != null) {
					msgKey.setKeyValue("w_COMPANY_CD", key.getw_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("w_PROC_NAME") && key.getw_PROC_NAME() != null) {
					msgKey.setKeyValue("w_PROC_NAME", key.getw_PROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_OD_NO") && key.getw_OD_NO() != null) {
					msgKey.setKeyValue("w_OD_NO", key.getw_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("w_WH_FROM_CD") && key.getw_WH_FROM_CD() != null) {
					msgKey.setKeyValue("w_WH_FROM_CD", key.getw_WH_FROM_CD());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_CD") && key.getw_PLANT_CD() != null) {
					msgKey.setKeyValue("w_PLANT_CD", key.getw_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("w_BUSINESS_OPR_DATE") && key.getw_BUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("w_BUSINESS_OPR_DATE", key.getw_BUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_FLG_val") && key.getISSUE_CMPLT_FLG_val() != null) {
					msgKey.setKeyValue("ISSUE_CMPLT_FLG_val", key.getISSUE_CMPLT_FLG_val().toString());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_FLG_name") && key.getISSUE_CMPLT_FLG_name() != null) {
					msgKey.setKeyValue("ISSUE_CMPLT_FLG_name", key.getISSUE_CMPLT_FLG_name());
				}
				if(msgKeyType.containsKeyColumn("CONS_TYP_val") && key.getCONS_TYP_val() != null) {
					msgKey.setKeyValue("CONS_TYP_val", key.getCONS_TYP_val().toString());
				}
				if(msgKeyType.containsKeyColumn("CONS_TYP_name") && key.getCONS_TYP_name() != null) {
					msgKey.setKeyValue("CONS_TYP_name", key.getCONS_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_CD") && key.getISSUE_INST_CD() != null) {
					msgKey.setKeyValue("ISSUE_INST_CD", key.getISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO") && key.getJOB_ODR_DETAIL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_DETAIL_NO", key.getJOB_ODR_DETAIL_NO().toString());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_QTY") && key.getISSUE_INST_QTY() != null) {
					msgKey.setKeyValue("ISSUE_INST_QTY", key.getISSUE_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY") && key.getTOTAL_ISSUE_QTY() != null) {
					msgKey.setKeyValue("TOTAL_ISSUE_QTY", key.getTOTAL_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("SCDL_ISSUE_DATE") && key.getSCDL_ISSUE_DATE() != null) {
					msgKey.setKeyValue("SCDL_ISSUE_DATE", key.getSCDL_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_DATE") && key.getISSUE_CMPLT_DATE() != null) {
					msgKey.setKeyValue("ISSUE_CMPLT_DATE", key.getISSUE_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_FLG") && key.getISSUE_CMPLT_FLG() != null) {
					msgKey.setKeyValue("ISSUE_CMPLT_FLG", key.getISSUE_CMPLT_FLG().toString());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_OPR_INST_CD_item") && key.getw_OPR_INST_CD_item() != null) {
					msgKey.setKeyValue("w_OPR_INST_CD_item", key.getw_OPR_INST_CD_item());
				}
				if(msgKeyType.containsKeyColumn("w_OPR_INST_CD_job") && key.getw_OPR_INST_CD_job() != null) {
					msgKey.setKeyValue("w_OPR_INST_CD_job", key.getw_OPR_INST_CD_job());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("WS_NAME") && key.getWS_NAME() != null) {
					msgKey.setKeyValue("WS_NAME", key.getWS_NAME());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_CD") && key.getWORK_ODR_CD() != null) {
					msgKey.setKeyValue("WORK_ODR_CD", key.getWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD") && key.getWORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("WORK_IN_PROC_CD", key.getWORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_ANAME") && key.getVEND_ANAME() != null) {
					msgKey.setKeyValue("VEND_ANAME", key.getVEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("CONS_TYP") && key.getCONS_TYP() != null) {
					msgKey.setKeyValue("CONS_TYP", key.getCONS_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("DRAW_CD") && key.getDRAW_CD() != null) {
					msgKey.setKeyValue("DRAW_CD", key.getDRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("SPEC") && key.getSPEC() != null) {
					msgKey.setKeyValue("SPEC", key.getSPEC());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("w_UNIT_QTY_TYP") && key.getw_UNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("w_UNIT_QTY_TYP", key.getw_UNIT_QTY_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_ISSUE_TYP") && key.geth_ISSUE_TYP() != null) {
					msgKey.setKeyValue("h_ISSUE_TYP", key.geth_ISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG") && key.getLOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("LOT_CTRL_FLG", key.getLOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("w_RCV_ISSUE_CTRL_CD") && key.getw_RCV_ISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("w_RCV_ISSUE_CTRL_CD", key.getw_RCV_ISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("w_RCV_ISSUE_TYP") && key.getw_RCV_ISSUE_TYP() != null) {
					msgKey.setKeyValue("w_RCV_ISSUE_TYP", key.getw_RCV_ISSUE_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("w_WH_CD") && key.getw_WH_CD() != null) {
					msgKey.setKeyValue("w_WH_CD", key.getw_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_QTY") && key.getRCV_ISSUE_QTY() != null) {
					msgKey.setKeyValue("RCV_ISSUE_QTY", key.getRCV_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_DATE") && key.getRCV_ISSUE_DATE() != null) {
					msgKey.setKeyValue("RCV_ISSUE_DATE", key.getRCV_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("w_RCV_ISSUE_GNR_TYP") && key.getw_RCV_ISSUE_GNR_TYP() != null) {
					msgKey.setKeyValue("w_RCV_ISSUE_GNR_TYP", key.getw_RCV_ISSUE_GNR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("w_STOCK_UPD_TYP") && key.getw_STOCK_UPD_TYP() != null) {
					msgKey.setKeyValue("w_STOCK_UPD_TYP", key.getw_STOCK_UPD_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("VEND_LOT_NO") && key.getVEND_LOT_NO() != null) {
					msgKey.setKeyValue("VEND_LOT_NO", key.getVEND_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_COMMENT") && key.getRCV_ISSUE_COMMENT() != null) {
					msgKey.setKeyValue("RCV_ISSUE_COMMENT", key.getRCV_ISSUE_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("w_LOT_NO") && key.getw_LOT_NO() != null) {
					msgKey.setKeyValue("w_LOT_NO", key.getw_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("w_WH_NAME") && key.getw_WH_NAME() != null) {
					msgKey.setKeyValue("w_WH_NAME", key.getw_WH_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_CD_check") && key.getw_PLANT_CD_check() != null) {
					msgKey.setKeyValue("w_PLANT_CD_check", key.getw_PLANT_CD_check());
				}
				if(msgKeyType.containsKeyColumn("w_WH_TYP") && key.getw_WH_TYP() != null) {
					msgKey.setKeyValue("w_WH_TYP", key.getw_WH_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("w_MRP_FLG") && key.getw_MRP_FLG() != null) {
					msgKey.setKeyValue("w_MRP_FLG", key.getw_MRP_FLG().toString());
				}
				if(msgKeyType.containsKeyColumn("w_STOCK_ON_HAND_QTY") && key.getw_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("w_STOCK_ON_HAND_QTY", key.getw_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("SAVE_JOB_ODR_CD") && key.getSAVE_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("SAVE_JOB_ODR_CD", key.getSAVE_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("THIS_MONTH") && key.getTHIS_MONTH() != null) {
					msgKey.setKeyValue("THIS_MONTH", key.getTHIS_MONTH());
				}
				if(msgKeyType.containsKeyColumn("INSTALL_FLG") && key.getINSTALL_FLG() != null) {
					msgKey.setKeyValue("INSTALL_FLG", key.getINSTALL_FLG());
				}
				if(msgKeyType.containsKeyColumn("ONEROUS_CONS_NO") && key.getONEROUS_CONS_NO() != null) {
					msgKey.setKeyValue("ONEROUS_CONS_NO", key.getONEROUS_CONS_NO());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST") && key.getUNIT_COST() != null) {
					msgKey.setKeyValue("UNIT_COST", key.getUNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP") && key.getUNIT_COST_TYP() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP", key.getUNIT_COST_TYP());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD") && key.getRCV_ISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CTRL_CD", key.getRCV_ISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("RETURNED_CAUSE_CD") && key.getRETURNED_CAUSE_CD() != null) {
					msgKey.setKeyValue("RETURNED_CAUSE_CD", key.getRETURNED_CAUSE_CD());
				}
				if(msgKeyType.containsKeyColumn("ONEROUS_FLG") && key.getONEROUS_FLG() != null) {
					msgKey.setKeyValue("ONEROUS_FLG", key.getONEROUS_FLG());
				}
				if(msgKeyType.containsKeyColumn("PARAM_RESULT") && key.getPARAM_RESULT() != null) {
					msgKey.setKeyValue("PARAM_RESULT", key.getPARAM_RESULT());
				}
				if(msgKeyType.containsKeyColumn("h_Param_Div") && key.geth_Param_Div() != null) {
					msgKey.setKeyValue("h_Param_Div", key.geth_Param_Div());
				}
				if(msgKeyType.containsKeyColumn("l_LOT_NO") && key.getl_LOT_NO() != null) {
					msgKey.setKeyValue("l_LOT_NO", key.getl_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("l_TOTAL_ISSUE_QTY") && key.getl_TOTAL_ISSUE_QTY() != null) {
					msgKey.setKeyValue("l_TOTAL_ISSUE_QTY", key.getl_TOTAL_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ISSUE_DATE") && key.getl_ISSUE_DATE() != null) {
					msgKey.setKeyValue("l_ISSUE_DATE", key.getl_ISSUE_DATE());
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
				if(msgKeyType.containsKeyColumn("l_STOCK_UNIT") && key.getl_STOCK_UNIT() != null) {
					msgKey.setKeyValue("l_STOCK_UNIT", key.getl_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("BBD_c_FLG") && key.getBBD_c_FLG() != null) {
					msgKey.setKeyValue("BBD_c_FLG", key.getBBD_c_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_COUNT") && key.getl_COUNT() != null) {
					msgKey.setKeyValue("l_COUNT", key.getl_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ROW_COUNT") && key.getROW_COUNT() != null) {
					msgKey.setKeyValue("ROW_COUNT", key.getROW_COUNT());
				}
				if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT") && key.getl_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("l_MODIFY_COUNT", key.getl_MODIFY_COUNT());
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
					AF0080010Struct key = new AF0080010Struct();
					if(msgKeyType.containsKeyColumn("w_WH_TO_CD")) {
						key.setw_WH_TO_CD(msgKey.getKeyValue("w_WH_TO_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_WH_FROM_NAME")) {
						key.setw_WH_FROM_NAME(msgKey.getKeyValue("w_WH_FROM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_WH_TO_NAME")) {
						key.setw_WH_TO_NAME(msgKey.getKeyValue("w_WH_TO_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_CHOICE_1")) {
						key.setw_CHOICE_1(msgKey.getKeyValue("w_CHOICE_1"));
					}
					if(msgKeyType.containsKeyColumn("w_CHOICE_2")) {
						key.setw_CHOICE_2(msgKey.getKeyValue("w_CHOICE_2"));
					}
					if(msgKeyType.containsKeyColumn("w_CHOICE_3")) {
						key.setw_CHOICE_3(msgKey.getKeyValue("w_CHOICE_3"));
					}
					if(msgKeyType.containsKeyColumn("w_CHOICE")) {
						key.setw_CHOICE(msgKey.getKeyValue("w_CHOICE"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_NAME")) {
						key.setISSUE_CMPLT_NAME(msgKey.getKeyValue("ISSUE_CMPLT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CONS_NAME")) {
						key.setCONS_NAME(msgKey.getKeyValue("CONS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("s_OPR_INST_CD")) {
						key.sets_OPR_INST_CD(msgKey.getKeyValue("s_OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("c_JOB_ODR_CD")) {
						key.setc_JOB_ODR_CD(msgKey.getKeyValue("c_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("OWN_ISSUED_QTY")) {
						key.setOWN_ISSUED_QTY(msgKey.getKeyValue("OWN_ISSUED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("OTHER_ISSUED_QTY")) {
						key.setOTHER_ISSUED_QTY(msgKey.getKeyValue("OTHER_ISSUED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_ISSUED_QTY")) {
						key.setITEM_ISSUED_QTY(msgKey.getKeyValue("ITEM_ISSUED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("h_JOB_ODR_CD")) {
						key.seth_JOB_ODR_CD(msgKey.getKeyValue("h_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_WH_FROM_CD")) {
						key.seth_WH_FROM_CD(msgKey.getKeyValue("h_WH_FROM_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_RCV_ISSUE_DATE")) {
						key.seth_RCV_ISSUE_DATE(msgKey.getKeyValue("h_RCV_ISSUE_DATE"));
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
					if(msgKeyType.containsKeyColumn("w_LOT_CTRL_FLG")) {
						key.setw_LOT_CTRL_FLG(msgKey.getKeyValue("w_LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("w_OPR_INST_CD")) {
						key.setw_OPR_INST_CD(msgKey.getKeyValue("w_OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_PUCH_ODR_CD")) {
						key.setw_PUCH_ODR_CD(msgKey.getKeyValue("w_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_ISSUE_INST_CD")) {
						key.setw_ISSUE_INST_CD(msgKey.getKeyValue("w_ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_COMPANY_CD")) {
						key.setw_COMPANY_CD(msgKey.getKeyValue("w_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_PROC_NAME")) {
						key.setw_PROC_NAME(msgKey.getKeyValue("w_PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_OD_NO")) {
						key.setw_OD_NO(msgKey.getKeyValue("w_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("w_WH_FROM_CD")) {
						key.setw_WH_FROM_CD(msgKey.getKeyValue("w_WH_FROM_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_CD")) {
						key.setw_PLANT_CD(msgKey.getKeyValue("w_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_BUSINESS_OPR_DATE")) {
						key.setw_BUSINESS_OPR_DATE(msgKey.getKeyValue("w_BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_FLG_val")) {
						key.setISSUE_CMPLT_FLG_val(new Integer(msgKey.getKeyValue("ISSUE_CMPLT_FLG_val")));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_FLG_name")) {
						key.setISSUE_CMPLT_FLG_name(msgKey.getKeyValue("ISSUE_CMPLT_FLG_name"));
					}
					if(msgKeyType.containsKeyColumn("CONS_TYP_val")) {
						key.setCONS_TYP_val(new Integer(msgKey.getKeyValue("CONS_TYP_val")));
					}
					if(msgKeyType.containsKeyColumn("CONS_TYP_name")) {
						key.setCONS_TYP_name(msgKey.getKeyValue("CONS_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_CD")) {
						key.setISSUE_INST_CD(msgKey.getKeyValue("ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO")) {
						key.setJOB_ODR_DETAIL_NO(new Integer(msgKey.getKeyValue("JOB_ODR_DETAIL_NO")));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_QTY")) {
						key.setISSUE_INST_QTY(msgKey.getKeyValue("ISSUE_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY")) {
						key.setTOTAL_ISSUE_QTY(msgKey.getKeyValue("TOTAL_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SCDL_ISSUE_DATE")) {
						key.setSCDL_ISSUE_DATE(msgKey.getKeyValue("SCDL_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_DATE")) {
						key.setISSUE_CMPLT_DATE(msgKey.getKeyValue("ISSUE_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_FLG")) {
						key.setISSUE_CMPLT_FLG(new Integer(msgKey.getKeyValue("ISSUE_CMPLT_FLG")));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_OPR_INST_CD_item")) {
						key.setw_OPR_INST_CD_item(msgKey.getKeyValue("w_OPR_INST_CD_item"));
					}
					if(msgKeyType.containsKeyColumn("w_OPR_INST_CD_job")) {
						key.setw_OPR_INST_CD_job(msgKey.getKeyValue("w_OPR_INST_CD_job"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("WS_NAME")) {
						key.setWS_NAME(msgKey.getKeyValue("WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_CD")) {
						key.setWORK_ODR_CD(msgKey.getKeyValue("WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD")) {
						key.setWORK_IN_PROC_CD(msgKey.getKeyValue("WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_ANAME")) {
						key.setVEND_ANAME(msgKey.getKeyValue("VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("CONS_TYP")) {
						key.setCONS_TYP(new Integer(msgKey.getKeyValue("CONS_TYP")));
					}
					if(msgKeyType.containsKeyColumn("DRAW_CD")) {
						key.setDRAW_CD(msgKey.getKeyValue("DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("SPEC")) {
						key.setSPEC(msgKey.getKeyValue("SPEC"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("w_UNIT_QTY_TYP")) {
						key.setw_UNIT_QTY_TYP(new Integer(msgKey.getKeyValue("w_UNIT_QTY_TYP")));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_ISSUE_TYP")) {
						key.seth_ISSUE_TYP(msgKey.getKeyValue("h_ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG")) {
						key.setLOT_CTRL_FLG(msgKey.getKeyValue("LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("w_RCV_ISSUE_CTRL_CD")) {
						key.setw_RCV_ISSUE_CTRL_CD(msgKey.getKeyValue("w_RCV_ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_RCV_ISSUE_TYP")) {
						key.setw_RCV_ISSUE_TYP(new Integer(msgKey.getKeyValue("w_RCV_ISSUE_TYP")));
					}
					if(msgKeyType.containsKeyColumn("w_WH_CD")) {
						key.setw_WH_CD(msgKey.getKeyValue("w_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_QTY")) {
						key.setRCV_ISSUE_QTY(msgKey.getKeyValue("RCV_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_DATE")) {
						key.setRCV_ISSUE_DATE(msgKey.getKeyValue("RCV_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("w_RCV_ISSUE_GNR_TYP")) {
						key.setw_RCV_ISSUE_GNR_TYP(new Integer(msgKey.getKeyValue("w_RCV_ISSUE_GNR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("w_STOCK_UPD_TYP")) {
						key.setw_STOCK_UPD_TYP(new Integer(msgKey.getKeyValue("w_STOCK_UPD_TYP")));
					}
					if(msgKeyType.containsKeyColumn("VEND_LOT_NO")) {
						key.setVEND_LOT_NO(msgKey.getKeyValue("VEND_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_COMMENT")) {
						key.setRCV_ISSUE_COMMENT(msgKey.getKeyValue("RCV_ISSUE_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("w_LOT_NO")) {
						key.setw_LOT_NO(msgKey.getKeyValue("w_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("w_WH_NAME")) {
						key.setw_WH_NAME(msgKey.getKeyValue("w_WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_CD_check")) {
						key.setw_PLANT_CD_check(msgKey.getKeyValue("w_PLANT_CD_check"));
					}
					if(msgKeyType.containsKeyColumn("w_WH_TYP")) {
						key.setw_WH_TYP(new Integer(msgKey.getKeyValue("w_WH_TYP")));
					}
					if(msgKeyType.containsKeyColumn("w_MRP_FLG")) {
						key.setw_MRP_FLG(new Integer(msgKey.getKeyValue("w_MRP_FLG")));
					}
					if(msgKeyType.containsKeyColumn("w_STOCK_ON_HAND_QTY")) {
						key.setw_STOCK_ON_HAND_QTY(msgKey.getKeyValue("w_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SAVE_JOB_ODR_CD")) {
						key.setSAVE_JOB_ODR_CD(msgKey.getKeyValue("SAVE_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("THIS_MONTH")) {
						key.setTHIS_MONTH(msgKey.getKeyValue("THIS_MONTH"));
					}
					if(msgKeyType.containsKeyColumn("INSTALL_FLG")) {
						key.setINSTALL_FLG(msgKey.getKeyValue("INSTALL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ONEROUS_CONS_NO")) {
						key.setONEROUS_CONS_NO(msgKey.getKeyValue("ONEROUS_CONS_NO"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST")) {
						key.setUNIT_COST(msgKey.getKeyValue("UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP")) {
						key.setUNIT_COST_TYP(msgKey.getKeyValue("UNIT_COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD")) {
						key.setRCV_ISSUE_CTRL_CD(msgKey.getKeyValue("RCV_ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("RETURNED_CAUSE_CD")) {
						key.setRETURNED_CAUSE_CD(msgKey.getKeyValue("RETURNED_CAUSE_CD"));
					}
					if(msgKeyType.containsKeyColumn("ONEROUS_FLG")) {
						key.setONEROUS_FLG(msgKey.getKeyValue("ONEROUS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PARAM_RESULT")) {
						key.setPARAM_RESULT(msgKey.getKeyValue("PARAM_RESULT"));
					}
					if(msgKeyType.containsKeyColumn("h_Param_Div")) {
						key.seth_Param_Div(msgKey.getKeyValue("h_Param_Div"));
					}
					if(msgKeyType.containsKeyColumn("l_LOT_NO")) {
						key.setl_LOT_NO(msgKey.getKeyValue("l_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_TOTAL_ISSUE_QTY")) {
						key.setl_TOTAL_ISSUE_QTY(msgKey.getKeyValue("l_TOTAL_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ISSUE_DATE")) {
						key.setl_ISSUE_DATE(msgKey.getKeyValue("l_ISSUE_DATE"));
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
					if(msgKeyType.containsKeyColumn("l_STOCK_UNIT")) {
						key.setl_STOCK_UNIT(msgKey.getKeyValue("l_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("BBD_c_FLG")) {
						key.setBBD_c_FLG(msgKey.getKeyValue("BBD_c_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_COUNT")) {
						key.setl_COUNT(msgKey.getKeyValue("l_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ROW_COUNT")) {
						key.setROW_COUNT(msgKey.getKeyValue("ROW_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT")) {
						key.setl_MODIFY_COUNT(msgKey.getKeyValue("l_MODIFY_COUNT"));
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
