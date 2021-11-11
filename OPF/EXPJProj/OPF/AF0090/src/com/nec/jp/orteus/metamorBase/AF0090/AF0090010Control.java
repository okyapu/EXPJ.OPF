/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0090/src/com/nec/jp/orteus/metamorBase/AF0090/AF0090010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AF0090;

import com.nec.jp.orteus.metamorBase.AF0090.*;
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
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.*;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueProcess;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueRemain;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.math.BigDecimal;

import com.nec.jp.orteus.metamorBase.common01.Accessor.ProductStructureRepository;
//-----------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AF0090010Control �N���X
 * �C������
 * (2015/08/07), EJaSCM�^EJa�@�\�����Ή�
 */
//}}user_implement_code_header

public class AF0090010Control
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
	public AF0090010Struct getListvalue(int x) { return (AF0090010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AF0090010Struct getStruct() { return this.struct; }	// Struct��Ԃ��܂��B
	public AF0090010Struct createStruct() { return new AF0090010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AF0090010Struct)structname); }	// Struct���Z�b�g���܂��B
//	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

//20150807 ADD START BY SYSCOM
	//html�ɉ�ЃR�[�h�n�����߂̃��\�b�h
	public String getsysCOMPANY_CD(){ return struct.getCOMPANY_CD(); }
		
	// [�R���{�{�b�N�X�f�[�^]���(�ȖڃR�[�h)ACCT_CD
	private ComboStruct _unitAcctCdStruct = new ComboStruct();
	// [�R���{�{�b�N�X�f�[�^]���(�v���W�F�N�g�R�[�h)PJ_CD
    private ComboStruct _unitPjCdStruct = new ComboStruct();
	// [�R���{�{�b�N�X�f�[�^]���(�Z�O�����g1)SEG_CONTENTS1
	private ComboStruct _unitSegContent1Struct = new ComboStruct();
	// [�R���{�{�b�N�X�f�[�^]���(�Z�O�����g2)SEG_CONTENTS2
	private ComboStruct _unitSegContent2Struct = new ComboStruct();
	// [�R���{�{�b�N�X�f�[�^]���(�Z�O�����g3)SEG_CONTENTS3
	private ComboStruct _unitSegContent3Struct = new ComboStruct();
	// [�R���{�{�b�N�X�f�[�^]���(�Z�O�����g4)SEG_CONTENTS4
    private ComboStruct _unitSegContent4Struct = new ComboStruct();
//20150807 ADD END BY SYSCOM
		
//------------- ��� ----------------------------------------------------------

	/** ���[�h */
	private String _mode = _NORMAL;

	/** ���[�h�̎擾 
	 * @return ���[�h
	*/
	public String getMode(){ return _mode; }

	/** ���[�h�̐ݒ� 
	 * @param mode ���[�h
	*/
	public void setMode(String mode){ _mode = mode; }

	/** ��ʃ��[�h �������� */	
	private final static String _SELECT = "select";

	/** ��ʃ��[�h ����/����ȊO�̏��� */
	private final static String _NORMAL = "normal";

	/** ��ʃ��[�h ���鏈�� */
	private final static String _CLOSE = "close";

	/** ��ʃ��[�h �o�^���� */
	private final static String _INSERT = "insert";


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


//------------------------------------------------------------------------

	/** ���[�U��`�̏������σt���O */
	private boolean _usersIntialized = false;

	/**
	 * ���[�U��` ����������
	 */
	private void usersInitialize() throws ExpjException
	{
		// ���[�h�ݒ�
		_mode = _NORMAL;

		if(_usersIntialized) return;

		_usersIntialized = true;
		return ;
	}

//-----------------------------------------------------------------------------

	/** ���t�t�H�[�}�b�g */
	//private SimpleDateFormat _dateFormat = new SimpleDateFormat("yyyy/MM/dd");

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
	 */
	private void setWarnMessage(String messageno)
	{
		ExpjMessage emsg = new ExpjMessage( messageno );
		msgStruct.addWarn( emsg );
		sysLog.info(emsg, getsysUSER_CD());
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

	/**
	 * �i�ڕʁA�ۊǋ�o�ɉ\���̃Z�b�g
	 * @param mrpOdrTyp �i�ڎ�z�敪
	 */
	private void calcPosQty(Integer mrpOdrTyp) throws SQLException, FoundationException
	{
		List buffList = null;
		AF0090010Struct buffStruct = null;
		String s_num = new String("0.0");
		// �i�ڍ݌ɂ���o�ɂ���ꍇ
		if(struct.getw_JOB_ODR().intValue() == 0){
			// �ۊǋ�݌ɐ��擾
			buffList = entity.mselectT_ITEM_STOCK_stock_on_hand_qty.read(conn, struct);
			if(buffList.size() <= 0)
				struct.setw_WH_STOCK_ON_HAND_QTY(s_num);
			else{
				buffStruct = (AF0090010Struct)buffList.get(0);
				struct.setw_WH_STOCK_ON_HAND_QTY(buffStruct.getw_WH_STOCK_ON_HAND_QTY());
			}

			// �ۊǋ�s�Ǎ݌ɐ��擾
			buffList = entity.mselectT_ITEM_STOCK_defect_qty.read(conn, struct);
			if(buffList.size() <= 0)
				struct.setDEFECT_QTY(s_num);
			else{
				buffStruct = (AF0090010Struct)buffList.get(0);
				struct.setDEFECT_QTY(buffStruct.getDEFECT_QTY());
			}

			// �݌ɗ݌v���擾
			buffList = entity.mselectT_ITEM_STOCK_sum_total_stock_on_hand_qty.read(conn, struct);
			if(buffList.size() <= 0)
				struct.setw_TOTAL_STOCK_ON_HAND_QTY(s_num);
			else{
				buffStruct = (AF0090010Struct)buffList.get(0);
				struct.setw_TOTAL_STOCK_ON_HAND_QTY(buffStruct.getw_TOTAL_STOCK_ON_HAND_QTY());
			}

			// �s�Ǖi�݌ɗ݌v���擾
			buffList = entity.mselectT_ITEM_STOCK_sum_total_defect_qty.read(conn, struct);
			if(buffList.size() <= 0)
				struct.setw_TOTAL_DEFECT_QTY(s_num);
			else{
				buffStruct = (AF0090010Struct)buffList.get(0);
				struct.setw_TOTAL_DEFECT_QTY(buffStruct.getw_TOTAL_DEFECT_QTY());
			}
		}
		// ���ԍ݌ɂ���o�ɂ���ꍇ
		else{
			// �ۊǋ�݌ɐ��擾
			buffList = entity.mselectT_JOB_ODR_CD_STOCK_stock_on_hand_qty.read(conn, struct);
			if(buffList.size() <= 0)
				struct.setw_WH_STOCK_ON_HAND_QTY(s_num);
			else{
				buffStruct = (AF0090010Struct)buffList.get(0);
				struct.setw_WH_STOCK_ON_HAND_QTY(buffStruct.getw_WH_STOCK_ON_HAND_QTY());
			}

			// �݌ɗ݌v���擾
			buffList = entity.mselectT_JOB_ODR_CD_STOCK_sum_total_stock_on_hand_qty.read(conn, struct);
			if(buffList.size() <= 0)
				struct.setw_TOTAL_STOCK_ON_HAND_QTY(s_num);
			else{
				buffStruct = (AF0090010Struct)buffList.get(0);
				struct.setw_TOTAL_STOCK_ON_HAND_QTY(buffStruct.getw_TOTAL_STOCK_ON_HAND_QTY());
			}

			// �s�Ǖi�݌ɂ̃N���A
			struct.setDEFECT_QTY((String)null);
			struct.setw_TOTAL_DEFECT_QTY((String)null);
		}
		
		// �i�ڕʏo�ɉ\���A�ۊǋ�o�ɉ\���̃Z�b�g
		if(mrpOdrTyp.equals(AF0090Const._MRP_ODR_JOB_ODR_CD) ||
				mrpOdrTyp.equals(AF0090Const._MRP_ODR_STOCK_ALC_JOB_ODR_CD)){
			IssueRemain issueRemain = new IssueRemain(conn);
			// �i�ڕʏo�ɉ\���̃Z�b�g
			if("true".equals(struct.getc_JOB_ODR_CD())){
				struct.setALC_POS_QTY(issueRemain.getFreeStockQtyOfJobOdr(
						struct.getPLANT_CD(), struct.getITEM_CD(),
						struct.getJOB_ODR_CD(), AF0090Const._JOB_ODR_DETAIL_NO).toString());
			}else{
				struct.setALC_POS_QTY(issueRemain.getFreeStockQtyOfItem(
						struct.getPLANT_CD(), struct.getITEM_CD()).toString());
			}
			
			// �ۊǋ�o�ɉ\��
			if(struct.getMRP_FLG().equals(AF0090Const._MRP_TARGET)){
				if(Calculate.compare(struct.getw_WH_STOCK_ON_HAND_QTY(),
						struct.getALC_POS_QTY()) == -1){
					struct.setTHIS_TIME_POS_QTY(struct.getw_WH_STOCK_ON_HAND_QTY());
				}else{
					struct.setTHIS_TIME_POS_QTY(struct.getALC_POS_QTY());
				}
			}else{
				struct.setTHIS_TIME_POS_QTY(struct.getw_WH_STOCK_ON_HAND_QTY());
			}
		}else{
			struct.setALC_POS_QTY(struct.getw_TOTAL_STOCK_ON_HAND_QTY());
			struct.setTHIS_TIME_POS_QTY(struct.getw_WH_STOCK_ON_HAND_QTY());
		}
		// �i�ڕʁA�ۊǋ�o�ɉ\�����}�C�i�X�l�̏ꍇ��0�ɕ␳
		if(Calculate.compare(struct.getTHIS_TIME_POS_QTY(), "0") <= 0){
			struct.setTHIS_TIME_POS_QTY("0");
		}
		if(Calculate.compare(struct.getALC_POS_QTY() == null ? "0" :struct.getALC_POS_QTY() , "0") <= 0){
			struct.setALC_POS_QTY("0");
		}
		// ���b�g�݌ɂ̎擾
		if("true".equals(struct.geth_LotCtrl())){
		if ("1".equals(struct.getLOT_CTRL_FLG())) {
			// 1�F���b�g�Ǘ����s��
			buffList = null;
			buffStruct = new AF0090010Struct();
			buffList = entity.mT_LOT_STOCK.read(conn, struct);
			if (buffList.size() > 0) {
				buffStruct = (AF0090010Struct)buffList.get(0);
				struct.setLOT_STOCK_ON_HAND_QTY(buffStruct.getLOT_STOCK_ON_HAND_QTY());
				struct.setLOT_DEFECT_QTY(buffStruct.getLOT_DEFECT_QTY());
				struct.setALLOCABLE_QTY(buffStruct.getALLOCABLE_QTY());
			} else {
				struct.setLOT_STOCK_ON_HAND_QTY(new String("0.0"));
				struct.setLOT_DEFECT_QTY(new String("0.0"));
				struct.setALLOCABLE_QTY(new String("0.0"));
			}
			
		}else{
		    struct.setLOT_STOCK_ON_HAND_QTY((String)null);
		    struct.setLOT_DEFECT_QTY((String)null);
		    struct.setALLOCABLE_QTY((String)null);
		}
		}
	}

//-----------------------------------------------------------------------------

	//---------- ���[�s���O�`�F�b�N���� -------------------------------------------
	/**
	 * ���[�s���O�`�F�b�N�B�t�W�J���s�����i�ڔԍ������� �L��
	 * @param repository ���i�\�����|�W�g��
	 * @param checkItem �Ώەi�ڔԍ�
	 * @param item ��r����i�ڔԍ�
	 * @return true:�L  false:��
	 */
	private boolean checkReverseRooping(ProductStructureRepository repository, String targetItem, String item) throws SQLException {
		// �e�i�ڔԍ��ꗗ�擾
		ArrayList itemList = repository.reverseDeployment(item);
		checkItemList(itemList);
		for(int i = 0; i < itemList.size(); i++) {
			if(targetItem.equals((String)itemList.get(i)) == false) {
				// �e�i�ڔԍ��ꗗ����X�ɏ�̐e�i�ڎ擾
				boolean result = checkReverseRooping(repository, targetItem, (String)itemList.get(i));
				if(result == true) return true;
			} else {
				return true;
			}
		}
			return false;
	}

	/**
	 * ���[�s���O�`�F�b�N�B���W�J���s�����i�ڔԍ������� �L��
	 * @param repository ���i�\�����|�W�g��
	 * @param checkItem �Ώەi�ڔԍ�
	 * @param item ��r����i�ڔԍ�
	 * @return true:�L  false:��
	 */
	private boolean checkRooping(ProductStructureRepository repository, String targetItem, String item) throws SQLException {
		// �q�i�ڔԍ��ꗗ�擾
		ArrayList itemList = repository.orderDeployment(item);
		checkItemList(itemList);
		for(int i = 0; i < itemList.size(); i++){
			if(targetItem.equals((String)itemList.get(i)) == false){
				// �q�i�ڔԍ��ꗗ����X�ɉ��̎q�i�ڎ擾
				boolean result = checkRooping(repository, targetItem, (String)itemList.get(i));
				if(result == true) return true;
			} else{
				return true;
			}
		}
		return false;
	}
	//---------- ���i�\�����|�W�g���֘A�̏��� -------------------------------------------

	/** �d���`�F�b�N
	 * @param itemList �d���`�F�b�N����i�ڃ��X�g
	 */
	private void checkItemList(ArrayList itemList) {
		List workList = new ArrayList(0);
		for(int i = 0; i < itemList.size(); i++) {
			boolean result =true;
			String item_cd = (String)itemList.get(i);
			for(int t = 0; t < workList.size(); t++) {
				if(item_cd.equals((String)workList.get(t)) == true) result = false;
			}
			if(result == true) workList.add(item_cd);
		}
		itemList.clear();
		for(int i = 0; i < workList.size(); i++) itemList.add(workList.get(i));
	}

	/**
	 * �v��O�o�ɏ��o�^����
	 * @param s �o�^���e
	 */
	private void insertUnplndIssAn(AF0090010Struct s) throws FoundationException,SQLException{

		AF0090010Struct unplndStruct = new AF0090010Struct();

		// [�v��O�o�ɏ��]�o�^���e�ݒ�
		unplndStruct.setISSUE_CTRL_CD(s.getISSUE_CTRL_CD());		// ���o�ɊǗ��ԍ�
		unplndStruct.setITEM_CD(s.getITEM_CD());					// �i�ڔԍ�
		unplndStruct.setJOB_ODR_CD(s.getJOB_ODR_CD());				// ����
		unplndStruct.setWH_CD(s.getWH_CD());						// �ۊǋ�R�[�h
		unplndStruct.setRCV_ISSUE_QTY(s.getRCV_ISSUE_QTY());		// �o�ɐ�
		unplndStruct.setRCV_ISSUE_DATE(s.getRCV_ISSUE_DATE());		// �o�ɓ�
		unplndStruct.setISSUE_ITEM_CD(s.getISSUE_ITEM_CD());		// �e�i�ڔԍ�
		unplndStruct.setISSUE_JOB_ODR_CD(s.getISSUE_JOB_ODR_CD());	// �e����
		unplndStruct.setISSUE_PROC_CD(s.getISSUE_PROC_CD());		// ���o��ƍH���R�[�h
		unplndStruct.setsUser_ID(s.getsUser_ID());					// ���[�U�R�[�h
		unplndStruct.setsSysdate(s.getsSysdate());					// �V�X�e�����t

		entity.minsertT_UNPLND_ISS.create(conn,unplndStruct);

	}

//20150807 ADD START BY SYSCOM
	/**
	 * ���o�ɕʉ�v�A�g���o�^����
	 * @param s �o�^���e
	 */
	private void insertRcvIssAiIfDate(AF0090010Struct s) throws FoundationException,SQLException{

		AF0090010Struct rcvissStruct = new AF0090010Struct();

		// [���o�ɕʉ�v�A�g���]�o�^���e�ݒ�
		rcvissStruct.setISSUE_CTRL_CD(s.getISSUE_CTRL_CD());
		rcvissStruct.setACCT_CD(s.getACCT_CD());				//�ȖڃR�[�h
		rcvissStruct.setDEPT_CD(s.getDEPT_CD());				//���S����R�[�h
		rcvissStruct.setPJ_CD(s.getPJ_CD());					//�v���W�F�N�g�R�[�h
		rcvissStruct.setSEG_CONTENTS1(s.getSEG_CONTENTS1());	//�Z�O�����g1
		rcvissStruct.setSEG_CONTENTS2(s.getSEG_CONTENTS2());	//�Z�O�����g2
		rcvissStruct.setSEG_CONTENTS3(s.getSEG_CONTENTS3());	//�Z�O�����g3
		rcvissStruct.setSEG_CONTENTS4(s.getSEG_CONTENTS4());	//�Z�O�����g4
		rcvissStruct.setsUser_ID(s.getsUser_ID());				// ���[�U�R�[�h
		rcvissStruct.setsSysdate(s.getsSysdate());				// �V�X�e�����t

		entity.minsertT_RCV_ISSUE_AI_IF_DATA.create(conn,rcvissStruct);
	}
//20150807 ADD END BY SYSCOM

	/**
	 * �V�X�e���p�����[�^�擾
	 */
	private boolean getSysParameter() throws BusinessProcessException, FoundationException {
		boolean b = true;
		try {
			List sysParameterList = entity.mSELECT_SYS_PARAMETER.read(conn, struct);
			if(sysParameterList == null || sysParameterList.isEmpty()) return b;
			AF0090010Struct sysParameterStruct = (AF0090010Struct) sysParameterList.get(0);
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
			AF0090010Struct procExecDateStruct = (AF0090010Struct) procExecDateList.get(0);
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
		
//20150807 ADD START BY SYSCOM
	/**
	* View�̒l���R���{�{�b�N�X�ɕ\��
	*
	*/
	public ComboStruct createComboData(String createType) throws SQLException, ComboException,Exception {
		ComboStruct rCombo = new ComboStruct();	// �R���{�{�b�N�X�f�[�^
		PreparedStatement stmt = null;			// �X�e�[�g�����g
		try{
			List rsetList = null;
			
			AF0090010Struct struct = new AF0090010Struct();
			
			// SQL���s
			switch(Integer.parseInt(createType)){
			case 1:
				rsetList = entity.mSELECT_V_ACCT_CD.read(conn,struct);
				break;
			case 2:
				rsetList = entity.mSELECT_V_PJ_CD.read(conn,struct);
				break;
			case 3:
				rsetList = entity.mSELECT_V_SEG_CONTENTS_1.read(conn,struct);
				break;
			case 4:
				rsetList = entity.mSELECT_V_SEG_CONTENTS_2.read(conn,struct);
				break;
			case 5:
				rsetList = entity.mSELECT_V_SEG_CONTENTS_3.read(conn,struct);
				break;
			case 6:
				rsetList = entity.mSELECT_V_SEG_CONTENTS_4.read(conn,struct);
				break;
			}
			
			AF0090010Struct tempStruct;
			for(int i=0; i<rsetList.size(); i++) {
				tempStruct = (AF0090010Struct)rsetList.get(i);
				String val = tempStruct.getVALUE();
				String explan = tempStruct.getDISPLAY_NAME();
				rCombo.addData(val, explan);
			}
			
			// �擾�f�[�^��0�ȉ��̏ꍇ�A��O����
			if (rCombo.size() <= 0){
				throw new ComboException();
			}
		}catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return rCombo;
	}
//20150807 ADD END BY SYSCOM

        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0090");
		logger.entering("AF0090010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
		//---------------------------------------------------------------------
		// ���O�o�͏��i�[�p
		String logMessage = "";
		List listMessage = new ArrayList();
		Integer mrpOdrTyp = null;

		try {
			boolean result = true;			// �`�F�b�N���ʊi�[

			// �N���A
			struct.setITEM_NAME((String)null);
			struct.setDRAW_CD((String)null);
			struct.setSPEC((String)null);
			struct.setSTOCK_UNIT((String)null);
			struct.setWH_NAME((String)null);

			if(_mode != _INSERT)
			{
				// ���͍��ڂ̃N���A�i�o�^��̍ēǍ��̂Ƃ��̓N���A���Ȃ��j
				struct.setRCV_ISSUE_QTY(new String("0.0"));
				struct.setRCV_ISSUE_DATE((String)null);
				struct.setNON_PLANNED_CAUSE_CD((String)null);
				struct.setVEND_LOT_NO((String)null);
				struct.setISSUE_ITEM_CD((String)null);
				struct.setISSUE_JOB_ODR_CD((String)null);
				struct.setISSUE_PROC_CD((String)null);
			    struct.setLOT_STOCK_ON_HAND_QTY((String)null);
			    struct.setLOT_DEFECT_QTY((String)null);
			    struct.setALLOCABLE_QTY((String)null);
//20150807 ADD START BY SYSCOM
				struct.setACCT_CD((String)null);
				struct.setDEPT_CD((String)null);
				struct.setDEPT_NAME((String)null);
				struct.setPJ_CD((String)null);
				struct.setSEG_CONTENTS1((String)null);
				struct.setSEG_CONTENTS2((String)null);
				struct.setSEG_CONTENTS3((String)null);
				struct.setSEG_CONTENTS4((String)null);
//20150807 ADD END BY SYSCOM
			}

			// �i�ڏ��擾
			List itemList = entity.mselectM_ITEM.read(conn, struct);
			if(itemList.size() <= 0){
				// �Ǎ��������s�F�i�ڔԍ������݂��܂���
				logMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AF00020", logMessage);
			}
			else{
// 2008/09/02 ADD TSUCHIDA START
				if(((AF0090010Struct)itemList.get(0)).getw_MANHOUR_TYP().equals("1")) {
					// �Ǎ��������s�F�i�ڔԍ��ɁA�H���Ǘ��i�ڂ͎w��ł��܂���B
					logMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
					setErrorMessage("AA00188", logMessage);
				}
// 2008/09/02 ADD TSUCHIDA END
				// �i�ڏ��ݒ�
				AF0090010Struct itemStruct = (AF0090010Struct)itemList.get(0);
				struct.setITEM_NAME(itemStruct.getITEM_NAME());
				struct.setDRAW_CD(itemStruct.getDRAW_CD());
				struct.setSPEC(itemStruct.getSPEC());
				struct.setSTOCK_UNIT(itemStruct.getSTOCK_UNIT());
				struct.setLOT_CTRL_FLG(itemStruct.getLOT_CTRL_FLG());
				mrpOdrTyp = itemStruct.getMRP_ODR_TYP();
				struct.seth_lotFlg(itemStruct.getLOT_CTRL_FLG());

				// �L�[���ڃ��O�\��
				logMessage = "JOB_ODR_CD:" + struct.getJOB_ODR_CD()
							+ ",ITEM_CD:" + struct.getITEM_CD()
							+ ", WH_CD:" + struct.getWH_CD()
							+ ", PLANT_CD:" + struct.getPLANT_CD();
				setSyslogConfig(logMessage);
			}

			// �ۊǋ���擾
			List whList = entity.mselectM_WH.read(conn, struct);
			if(whList.size() <= 0){
				// �Ǎ��������s�F�ۊǋ�R�[�h�����݂��܂���
				logMessage = "M_WH.WH_CD:" + struct.getWH_CD();
				setErrorMessage("AF00022", logMessage);
			}
			else{
				// �ۊǋ���ݒ�
				AF0090010Struct whStruct = (AF0090010Struct)whList.get(0);
				struct.setWH_NAME(whStruct.getWH_NAME());
				struct.setMRP_FLG(whStruct.getMRP_FLG());

				// �ۊǋ�̍H��R�[�h�`�F�b�N
				result = entity.mcheckM_WH_plant_cd.check(conn, struct);
				if(result == false){
					// �Ǎ��������s�F�ۊǋ�R�[�h�͑��̍H��̃f�[�^�Ȃ̂Ŏw��ł��܂���
					listMessage.add("M_WH.WH_CD:" + struct.getWH_CD());
					setErrorMessage("AF00023", listMessage);
					listMessage.clear();
				}
			}
//20150807 ADD START BY SYSCOM
			// ���S���喼���擾
			List dept_nameList = entity.mgetDEPT_NAME.read(conn, struct);
			if(dept_nameList.size() <= 0){
				struct.setDEPT_NAME("");
			}
			else{
				// ���S���喼���ݒ�
				AF0090010Struct dept_nameStruct = (AF0090010Struct)dept_nameList.get(0);
				struct.setDEPT_NAME(dept_nameStruct.getDEPT_NAME());
			}
//20150807 ADD END BY SYSCOM
			// �݌Ƀ��b�g�`�F�b�N
			if("true".equals(struct.geth_LotCtrl())){
			if(itemList.size() > 0) {
				if ("1".equals(struct.getLOT_CTRL_FLG())) {
					// 1�F���b�g�Ǘ����s��
					if (struct.getLOT_NO() == null
							|| "".equals(struct.getLOT_NO())) {
						// �Ǎ��������s�F�݌Ƀ��b�g�ԍ��͏ȗ��ł��܂���B
						listMessage.add("M_ITEM.ITEM_CD:" + struct.getITEM_CD());
						listMessage.add("M_ITEM.LOT_CTRL_FLG:" + struct.getLOT_CTRL_FLG());
						setErrorMessage("AF20005", listMessage);
						listMessage.clear();
					}
				} else {
					// 0�F���b�g�Ǘ����s��Ȃ�
					if (struct.getLOT_NO() != null
							&& !"".equals(struct.getLOT_NO())) {
						// �Ǎ��������s�F�݌Ƀ��b�g�ԍ��͓��͂ł��܂���B
						listMessage.add("M_ITEM.ITEM_CD:" + struct.getITEM_CD());
						listMessage.add("M_ITEM.LOT_CTRL_FLG:" + struct.getLOT_CTRL_FLG());
						setErrorMessage("AF20006", listMessage);
						listMessage.clear();
					}
				}
			}
		}
			// �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
			if(msgStruct.sizeError() <= 0)
			{
				// ���b�g�Ǘ��̃`�F�b�N
				if("true".equals(struct.geth_LotCtrl())){
				if (struct.getLOT_NO() != null
						&& !"".equals(struct.getLOT_NO())) {
					result = entity.mT_LOT_CTRL.check(conn, struct);
					if(result == false){
						// �Ǎ��������s�F���b�g�Ǘ��f�[�^�͑��݂��܂���B
						listMessage.add("T_LOT_CTRL.LOT_NO:" + struct.getLOT_NO());
						listMessage.add("T_LOT_CTRL.ITEM_CD:" + struct.getITEM_CD());
						setErrorMessage("AF20002", listMessage);
						listMessage.clear();
					}
				}
				}
				if(struct.getw_JOB_ODR().intValue() == 0){
					// �i�ڍ݌ɂ���o�ɂ���ꍇ
					result = entity.mcheckT_ITEM_STOCK.check(conn, struct);
					if(result == false){
						// �Ǎ��������s�F�ۊǋ�ʕi�ڍ݌Ƀf�[�^�����݂��܂���
						listMessage.add("T_ITEM_STOCK.ITEM_CD:" + struct.getITEM_CD());
						listMessage.add("T_ITEM_STOCK.WH_CD:" + struct.getWH_CD());
						listMessage.add("T_ITEM_STOCK.PLANT_CD:" + struct.getPLANT_CD());
						setErrorMessage("AF00044", listMessage);
						listMessage.clear();
					}
				}
				else{
					// ���ԍ݌ɂ���o�ɂ���ꍇ
					result = entity.mcheckT_JOB_ODR_CD_STOCK.check(conn, struct);
					if(result == false){
						// �Ǎ��������s�F�ۊǋ�ʐ��ԍ݌Ƀf�[�^�����݂��܂���
						listMessage.add("T_JOB_ODR_CD_STOCK.JOB_ODR_CD:" + struct.getJOB_ODR_CD());
						listMessage.add("T_JOB_ODR_CD_STOCK.ITEM_CD:" + struct.getITEM_CD());
						listMessage.add("T_JOB_ODR_CD_STOCK.WH_CD:" + struct.getWH_CD());
						listMessage.add("T_JOB_ODR_CD_STOCK.PLANT_CD:" + struct.getPLANT_CD());
						setErrorMessage("AF00045", listMessage);
						listMessage.clear();
					}
				}
				
				// [���v��]�̃I�[�_�f�}���h�����`�F�b�N
				if("true".equals(struct.getc_JOB_ODR_CD()) &&
						entity.mT_OD.check(conn, struct)){
					listMessage.add("T_OD.PLANT_CD:" + struct.getPLANT_CD());
					listMessage.add("T_OD.ITEM_CD:" + struct.getITEM_CD());
					listMessage.add("T_OD.JOB_ODR_CD:" + struct.getJOB_ODR_CD());
					listMessage.add("T_OD.JOB_ODR_DETAIL_NO:0");
					listMessage.add("T_OD.PARENT_OD_NO:IS NOT NULL");
					listMessage.add("T_OD.DM_STS_TYP:<>9");
					setErrorMessage("AF00119", listMessage);
					listMessage.clear();
				}
			}

			// �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
			if(msgStruct.sizeError() <= 0)
			{
				// �i�ڕʏo�ɉ\���A�ۊǋ�o�ɉ\���̃Z�b�g
				calcPosQty(mrpOdrTyp);
			}

			if(_mode != _INSERT)
			{
				// �Ɩ��^�p���擾
				struct.setPLANT_CD(getsysPLANT_CD());
				String s_date = null;
				List dateList = entity.mselectSYS_DATE_CTRL.read(conn, struct);
				if(dateList.size() <= 0){
					// �o�^�������s�F�Ɩ��^�p�������݂��܂���
					logMessage = "SYS_DATE_CTRL.PLANT_CD:" + struct.getPLANT_CD();
					setErrorMessage("AF00056", logMessage);
				}
				else{
					AF0090010Struct dateStruct = (AF0090010Struct)dateList.get(0);
					s_date = dateStruct.getBUSINESS_OPR_DATE();
				}
				// �Ɩ��^�p���ݒ�
				struct.setRCV_ISSUE_DATE(s_date);
				struct.setBUSINESS_OPR_DATE(s_date);
			}

			// �`�F�b�N�ŃG���[���������Ă���ꍇ
			if(msgStruct.sizeError() > 0)
			{
				// ���l���ڂ̃N���A
				struct.setw_WH_STOCK_ON_HAND_QTY(new String("0.0"));
				struct.setDEFECT_QTY(new String("0.0"));
				struct.setw_TOTAL_STOCK_ON_HAND_QTY(new String("0.0"));
				struct.setw_TOTAL_DEFECT_QTY(new String("0.0"));
				
				struct.setALC_POS_QTY(new String("0.0"));
				struct.setTHIS_TIME_POS_QTY(new String("0.0"));
				
				struct.setLOT_STOCK_ON_HAND_QTY(new String("0.0"));
				struct.setLOT_DEFECT_QTY(new String("0.0"));
				struct.setALLOCABLE_QTY(new String("0.0"));
			}

		}catch(SQLException e){
			setSqlExceptionMsg(e);

		}finally{
			_mode = _SELECT;
		}
		//---------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AF0090010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlinsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0090");
		logger.entering("AF0090010Control"+":USER="+struct.getsUser_ID(),"controlinsert");
			//{{user_implement_dev:<controlinsert>
		//---------------------------------------------------------------------
		// ���O�o�͏��i�[�p
		String logMessage = "";
		List listMessage = new ArrayList();
		Integer mrpOdrTyp = null;
		Integer issueOutsideTyp = new Integer(0);
		String sumRcvIssueQty = "0";
		boolean blnRet;

		List tempList;
		AF0090010Struct tempStruct = new AF0090010Struct();

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
			
			// �g�����U�N�V�����J�n
			conn.beginTransWeb();

			boolean result = true;			// �`�F�b�N���ʊi�[

			// �N���A
			struct.setITEM_NAME((String)null);
			struct.setDRAW_CD((String)null);
			struct.setSPEC((String)null);
			struct.setSTOCK_UNIT((String)null);
			struct.setWH_NAME((String)null);

			// �i�ڏ��擾
			List itemList = entity.mselectM_ITEM.read(conn, struct);
			AF0090010Struct itemStruct = null;
			if(itemList.size() <= 0){
				// �o�^�������s�F�i�ڔԍ������݂��܂���
				logMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AF00020", logMessage);
			}
			else{
// 2008/09/02 ADD TSUCHIDA START
				if(((AF0090010Struct)itemList.get(0)).getw_MANHOUR_TYP().equals("1")) {
					// �Ǎ��������s�F�i�ڔԍ��ɁA�H���Ǘ��i�ڂ͎w��ł��܂���B
					logMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
					setErrorMessage("AA00188", logMessage);
				}
// 2008/09/02 ADD TSUCHIDA END

				// �i�ڏ��ݒ�
				itemStruct = (AF0090010Struct)itemList.get(0);
				struct.setITEM_NAME(itemStruct.getITEM_NAME());
				struct.setDRAW_CD(itemStruct.getDRAW_CD());
				struct.setSPEC(itemStruct.getSPEC());
				struct.setSTOCK_UNIT(itemStruct.getSTOCK_UNIT());
				struct.setLOT_CTRL_FLG(itemStruct.getLOT_CTRL_FLG());
				mrpOdrTyp = itemStruct.getMRP_ODR_TYP();
			}

			// �ۊǋ���擾
			List whList = entity.mselectM_WH.read(conn, struct);
			AF0090010Struct whStruct = null;
			if(whList.size() <= 0){
				// �o�^�������s�F�ۊǋ�R�[�h�����݂��܂���
				logMessage = "M_WH.WH_CD:" + struct.getWH_CD();
				setErrorMessage("AF00022", logMessage);
			}
			else{
				// �ۊǋ���ݒ�
				whStruct = (AF0090010Struct)whList.get(0);
				struct.setWH_NAME(whStruct.getWH_NAME());
				struct.setMRP_FLG(whStruct.getMRP_FLG());
				struct.setw_WH_TYP(whStruct.getw_WH_TYP());
				
				// �ۊǋ�̍H��R�[�h�`�F�b�N
				result = entity.mcheckM_WH_plant_cd.check(conn, struct);
				if(result == false){
					// �o�^�������s�F�ۊǋ�R�[�h�͑��̍H��̃f�[�^�Ȃ̂Ŏw��ł��܂���
					listMessage.add("M_WH.WH_CD:" + struct.getWH_CD());
					setErrorMessage("AF00023", listMessage);
					listMessage.clear();
				}
			}
			
			// �݌Ƀ��b�g�`�F�b�N
			if("true".equals(struct.geth_LotCtrl())){
			if(itemList.size() > 0) {
				if ("1".equals(struct.getLOT_CTRL_FLG())) {
					// 1�F���b�g�Ǘ����s��
					if (struct.getLOT_NO() == null
							|| "".equals(struct.getLOT_NO())) {
						// �Ǎ��������s�F�݌Ƀ��b�g�ԍ��͏ȗ��ł��܂���B
						listMessage.add("M_ITEM.ITEM_CD:" + struct.getITEM_CD());
						listMessage.add("M_ITEM.LOT_CTRL_FLG:" + struct.getLOT_CTRL_FLG());
						setErrorMessage("AF20005", listMessage);
						listMessage.clear();
					} else {
						// ���b�g�Ǘ��̃`�F�b�N
						result = entity.mT_LOT_CTRL.check(conn, struct);
						if(result == false){
							// �Ǎ��������s�F���b�g�Ǘ��f�[�^�͑��݂��܂���B
							listMessage.add("T_LOT_CTRL.LOT_NO:" + struct.getLOT_NO());
							listMessage.add("T_LOT_CTRL.ITEM_CD:" + struct.getITEM_CD());
							setErrorMessage("AF20002", listMessage);
							listMessage.clear();
						}
					}
				} else {
					// 0�F���b�g�Ǘ����s��Ȃ�
					if (struct.getLOT_NO() != null
							&& !"".equals(struct.getLOT_NO())) {
						// �Ǎ��������s�F�݌Ƀ��b�g�ԍ��͓��͂ł��܂���B
						listMessage.add("M_ITEM.ITEM_CD:" + struct.getITEM_CD());
						setErrorMessage("AF20006", listMessage);
						listMessage.clear();
					}
				}
			}
			}
			// �i�ڕʁA�ۊǋ�o�ɉ\��
			if(msgStruct.sizeError() <= 0){
				calcPosQty(mrpOdrTyp);
			}

			// �Ɩ��^�p���擾
			List dateList = entity.mselectSYS_DATE_CTRL.read(conn, struct);
			AF0090010Struct dateStruct = null;
			if(dateList.size() <= 0){
				// �o�^�������s�F�Ɩ��^�p�������݂��܂���
				logMessage = "SYS_DATE_CTRL.PLANT_CD:" + struct.getPLANT_CD();
				setErrorMessage("AF00056", logMessage);
			}
			else{
				dateStruct = (AF0090010Struct)dateList.get(0);

				// �o�ɓ��`�F�b�N
				Date issue_Date = stringToDate(struct.getRCV_ISSUE_DATE());
				Date business_Date = stringToDate(dateStruct.getBUSINESS_OPR_DATE());
				if(issue_Date.getTime() > business_Date.getTime()){
					// �o�^�������s�F�o�ɓ��ɖ����̓��t�͎w��ł��܂���
					logMessage = "SYS_DATE_CTRL.BUSINESS_OPR_DATE:" + dateStruct.getBUSINESS_OPR_DATE();
					setErrorMessage("ZZ05103", logMessage);
				}
			}

			// �o�ɐ�w�莞
			if("true".equals(struct.getc_ISSUE_FLG())) {

				//�u�i�ڔԍ��v���u�o�ɐ�i�ڔԍ��v�̏ꍇ�G���[
				if(struct.getITEM_CD().equals(struct.getISSUE_ITEM_CD())){
					setErrorMessage("AF00176");				
				}
				
				// �u�o�ɐ�i�ڔԍ��v���݃`�F�b�N
				tempStruct.setITEM_CD(struct.getISSUE_ITEM_CD());
				tempList = entity.mselectM_ITEM.read(conn,tempStruct);
				if(tempList.isEmpty()) {
					listMessage.add("M_ITEM.ITEM_CD:" + tempStruct.getITEM_CD());
					setErrorMessage("AF00020",listMessage);
					listMessage.clear();
				} else {
					tempStruct = (AF0090010Struct)tempList.get(0);
					issueOutsideTyp = tempStruct.getOUTSIDE_TYP();
				}

				// �G���[���������ĂȂ��ꍇ
				if(msgStruct.sizeError() <= 0) {
					// �u�o�ɐ�i�ڔԍ��v���[�s���O�`�F�b�N
					// ���i�\�����|�W�g���쐬
					ProductStructureRepository repository = new ProductStructureRepository(conn);
					// ���[�s���O�`�F�b�N true:�L  false:��
					if(checkReverseRooping(repository, struct.getITEM_CD(), struct.getISSUE_ITEM_CD())) {
						setErrorMessage("AF00147");
					}
				}

				// �u�o�ɐ搻�ԁv�����͂���Ă���ꍇ�A���Ԍv�摶�݃`�F�b�N
				if(!"".equals(struct.getISSUE_JOB_ODR_CD()) && struct.getISSUE_JOB_ODR_CD() != null) {
					tempStruct.setPLANT_CD(getsysPLANT_CD());
					tempStruct.setISSUE_JOB_ODR_CD(struct.getISSUE_JOB_ODR_CD());
					tempList = entity.mselectT_JOB_ODR_issue_job_odr.read(conn,tempStruct);
					if(tempList.isEmpty()) {
						listMessage.add("T_JOB_ODR.JOB_ODR_CD:" + tempStruct.getISSUE_JOB_ODR_CD());
						listMessage.add("T_JOB_ODR.PLANT_CD:" + tempStruct.getPLANT_CD());
						setErrorMessage("AF00148",listMessage);
						listMessage.clear();
					}
				}

				// �G���[���������Ă��Ȃ��ꍇ[���v��]����
				if(msgStruct.sizeError() <= 0) {
					tempStruct.setPLANT_CD(getsysPLANT_CD());
					tempStruct.setISSUE_ITEM_CD(struct.getISSUE_ITEM_CD());
					tempStruct.setISSUE_JOB_ODR_CD(struct.getISSUE_JOB_ODR_CD());
					tempList = entity.mselectT_OD_odr_sts_typ.read(conn,tempStruct);
					if(!tempList.isEmpty()) {
						tempStruct = (AF0090010Struct)tempList.get(0);
						if(!"2".equals(tempStruct.getw_ODR_STS_TYP()) && !"9".equals(tempStruct.getw_ODR_STS_TYP())) {
							setErrorMessage("AF00149");
						}
					}
				}

				// �u�o�ɐ��ƍH���R�[�h�v�����͂���Ă���ꍇ
				if(msgStruct.sizeError() <= 0) {
					if(!"".equals(struct.getISSUE_PROC_CD()) && struct.getISSUE_PROC_CD() != null) {
						tempStruct.setPLANT_CD(getsysPLANT_CD());
						tempStruct.setISSUE_ITEM_CD(struct.getISSUE_ITEM_CD());
						tempStruct.setISSUE_PROC_CD(struct.getISSUE_PROC_CD());
						tempList = entity.mselectM_PROC_GRP_issue.read(conn,tempStruct);
						if(tempList.isEmpty()) {
							listMessage.add("M_PROC_GRP.PLANT_CD:" + tempStruct.getPLANT_CD());
							listMessage.add("M_PROC_GRP.ITEM_CD:" + tempStruct.getISSUE_ITEM_CD());
							listMessage.add("M_PROC_GRP.PROC_CD:" + tempStruct.getISSUE_PROC_CD());
							setErrorMessage("AF00150",listMessage);
							listMessage.clear();
						}
					}
				}
				
				// [�v��O�o�ɏ��]�o�ɐ��`�F�b�N
				if(msgStruct.sizeError() <= 0) {
					if(Calculate.compare(struct.getRCV_ISSUE_QTY(),"0") < 0) {
						tempStruct.setRCV_ISSUE_DATE(struct.getRCV_ISSUE_DATE());
						tempStruct.setITEM_CD(struct.getITEM_CD());
						tempStruct.setJOB_ODR_CD(struct.getJOB_ODR_CD());
						tempStruct.setISSUE_ITEM_CD(struct.getISSUE_ITEM_CD());
						tempStruct.setISSUE_JOB_ODR_CD(struct.getISSUE_JOB_ODR_CD());
						tempStruct.setISSUE_PROC_CD(struct.getISSUE_PROC_CD());
						tempList = entity.mselectT_UNPLND_ISS.read(conn,tempStruct);

						if(tempList.isEmpty()) {
							sumRcvIssueQty = struct.getRCV_ISSUE_QTY();
						} else {
							tempStruct = (AF0090010Struct)tempList.get(0);
							sumRcvIssueQty = Calculate.add(tempStruct.getw_SUM_RCV_ISSUE_QTY(),struct.getRCV_ISSUE_QTY());
						}

						// [�v��O�o�ɏ��]�o�ɐ�+[���]�o�ɐ� < 0�̏ꍇ
						if(Calculate.compare(sumRcvIssueQty,"0") < 0) {
							setErrorMessage("AF00152");
						}
					}
				}

			}

//20150807 ADD START BY SYSCOM
				//�u���S����R�[�h�v����Null�̏ꍇ
				if(!"".equals(struct.getDEPT_CD()) && struct.getDEPT_CD() != null){
					//[���S����View]�����O�C�����[�U�̏�����ЃR�[�h�{�u���S����R�[�h�v�Ō���
					tempStruct.setCOMPANY_CD(struct.getCOMPANY_CD());
					tempStruct.setDEPT_CD(struct.getDEPT_CD());
					tempList = entity.mSELECT_V_DEPT_CD.read(conn, tempStruct);
					//���݂��Ȃ��ꍇ
					if(tempList.isEmpty()) {
						// �G���[���b�Z�[�W
						setErrorMessage("AA23603");
						setErrorParameter("T_RCV_ISSUE_AI_IF_DATA", "DEPT_CD", struct.getDEPT_CD());
					}
				}
//20150807 ADD END BY SYSCOM
			
			// �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
			if(msgStruct.sizeError() <= 0)
			{
				if(struct.getw_JOB_ODR().intValue() == 0){
					// �i�ڍ݌ɂ���o�ɂ���ꍇ
					result = entity.mcheckT_ITEM_STOCK.check(conn, struct);
					if(result == false){
						// �o�^�������s�F�ۊǋ�ʕi�ڍ݌Ƀf�[�^�����݂��܂���
						listMessage.add("T_ITEM_STOCK.ITEM_CD:" + struct.getITEM_CD());
						listMessage.add("T_ITEM_STOCK.WH_CD:" + struct.getWH_CD());
						listMessage.add("T_ITEM_STOCK.PLANT_CD:" + struct.getPLANT_CD());
						setErrorMessage("AF00044", listMessage);
						listMessage.clear();
					}
				}
				else{
					// ���ԍ݌ɂ���o�ɂ���ꍇ
					result = entity.mcheckT_JOB_ODR_CD_STOCK.check(conn, struct);
					if(result == false){
						// �o�^�������s�F�ۊǋ�ʐ��ԍ݌Ƀf�[�^�����݂��܂���
						listMessage.add("T_JOB_ODR_CD_STOCK.JOB_ODR_CD:" + struct.getJOB_ODR_CD());
						listMessage.add("T_JOB_ODR_CD_STOCK.ITEM_CD:" + struct.getITEM_CD());
						listMessage.add("T_JOB_ODR_CD_STOCK.WH_CD:" + struct.getWH_CD());
						listMessage.add("T_JOB_ODR_CD_STOCK.PLANT_CD:" + struct.getPLANT_CD());
						setErrorMessage("AF00045", listMessage);
						listMessage.clear();
					}
				}
				// �݌Ƀ��b�g�Əo�׌��ۊǋ�̃`�F�b�N 

				String tempAllocableQty = new String("0.0");
				if("true".equals(struct.geth_LotCtrl())){
				if (struct.getLOT_NO() != null
						&& !"".equals(struct.getLOT_NO())) {
					List tmpList = null;
					tmpList = entity.mT_LOT_STOCK.read(conn, struct);
					if (tmpList.size() > 0) {
						AF0090010Struct tempStruct1 = (AF0090010Struct)tmpList.get(0);
						tempAllocableQty = tempStruct1.getALLOCABLE_QTY();
						if("true".equals(struct.getc_RCV_ISSUE_QTY())
								&& Calculate.compare(
										struct.getRCV_ISSUE_QTY(),tempStruct1.getLOT_DEFECT_QTY()) > 0){
							      listMessage.add("T_LOT_STOCK.ITEM_CD:" + struct.getITEM_CD());
							      listMessage.add("T_LOT_STOCK.WH_CD:" + struct.getWH_CD());						
							      listMessage.add("T_LOT_STOCK.LOT_NO:" + struct.getLOT_NO());						
							      setErrorMessage("AF00069", listMessage);
							      listMessage.clear();
					}
				  }
				}
				}
				// �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
				if(msgStruct.sizeError() <= 0)
				{
					// ���o�ɊǗ��ԍ��̔�
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
												"AF0090010Control",
												"controlinsert()",
												emsg.getMessage(CoreTools.getLocale(this.getsysUSER_CD())) );
						}
					}
					catch(FoundationException ex){
						// �o�^�������s�F���o�ɊǗ��ԍ��̍̔ԂɎ��s���܂���
						logMessage = "UserID:" + getsysUSER_CD()
									+ ", ProcID:" + this.sp.getProcId()
									+ ", PLANT_CD:" + struct.getPLANT_CD();
						setErrorMessage("AF00057", logMessage);
						
						ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
						sysLog.severe(emsg, getsysUSER_CD());
						ExpjException ee = new ExpjException(ex, emsg);
						throw ee;
					}

					// �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
					if(msgStruct.sizeError() <= 0)
					{
						// ���O�o��
						logMessage = "T_RCV_ISSUE.RCV_ISSUE_CTRL_CD:" + ctrlCd;
						setSyslogConfig(logMessage);

						// ���o�ɊǗ��ԍ��ݒ�
						struct.setISSUE_CTRL_CD(ctrlCd);

//20150807 DEL START BY SYSCOM
//						// ��ЃR�[�h�擾
//						List companyList = entity.mselectSYS_MY_COMPANY.read(conn, struct);
//						if(companyList.size() > 0){
//							AF0090010Struct companyStruct = (AF0090010Struct)companyList.get(0);
//							struct.setCOMPANY_CD(companyStruct.getCOMPANY_CD());
//						}
//20150807 DEL END BY SYSCOM
						
						// ���o�ɋ敪�ݒ�
						if(struct.getw_INFERIOR().intValue() == 0)
							struct.setISSUE_TYP(new Integer(2));		// �o��
						else
							struct.setISSUE_TYP(new Integer(4));		// �s�Ǖi�o��

						// �����R�[�h�擾
						if(whStruct.getVEND_CD() != null && "".equals(whStruct.getVEND_CD()) == false){
							// �����R�[�h�ݒ�
							struct.setVEND_CD(whStruct.getVEND_CD());

							// �x���敪�ݒ�
							List issueList = entity.mselectM_CONS_UNIT_COST.read(conn, struct);

							if(issueList.size() > 0){
								AF0090010Struct issueStruct = (AF0090010Struct)issueList.get(0);

								// �L���t���O��"1:�L��"�̏ꍇ
								if(issueStruct.getONEROUS_FLG().intValue() == 1){
									// �x���敪��"1:�L��"
									struct.setCONS_TYP(new Integer(1));
								}else{
									// �x���敪��"2:����"
									struct.setCONS_TYP(new Integer(2));
								}
							}else{
								// �x���敪��"2:����"
								struct.setCONS_TYP(new Integer(2));
							}

						}
						else{
							// �����R�[�h�ݒ�
							struct.setVEND_CD((String)null);
							
							// �x���敪�ݒ�
							struct.setCONS_TYP(new Integer(0));
						}

						// �o�ɐ��`�F�b�N
						boolean resultCeil = false;
						Calculate calc = new Calculate();

						if(itemStruct.getUNIT_QTY_TYP().intValue() == 1
							&& calc.isNumeric(struct.getRCV_ISSUE_QTY()) == true ){
							struct.setRCV_ISSUE_QTY(calc.ceil(struct.getRCV_ISSUE_QTY(), 0));
							resultCeil = true;
						}

						// �i�ڏ���Struct�ɐݒ�
						struct.setPRODUCT_TYP(itemStruct.getPRODUCT_TYP());		// ���i�敪
						struct.setMRP_ODR_TYP(itemStruct.getMRP_ODR_TYP());		// �i�ڎ�z�敪
						struct.setOUTSIDE_TYP(itemStruct.getOUTSIDE_TYP());		// �i�ړ��O��敪
						struct.setRCV_ISSUE_GNR_TYP(new Integer(22));			// ���o�ɔ����敪
						struct.setSBCNT_PUCH_TYP(new Integer(5));				// �O���w���i�敪
						struct.setSTOCK_UPD_TYP(new Integer(1));				// �݌ɍX�V�敪

						// �ۊǋ�ʓ��o�ɓo�^
						entity.minsertT_RCV_ISSUE.create(conn, struct);

						// �v��O���R�R�[�h��NULL�łȂ��ꍇ�A�i�ڕʓ��o�ɓo�^
						if(struct.getNON_PLANNED_CAUSE_CD() != null &&
							"".equals(struct.getNON_PLANNED_CAUSE_CD()) == false){
							entity.minsertT_RCV_ISSUE_ITEM.create(conn, struct);
						}

						// �o�ɏ���
						IssueProcess issuePrc = new IssueProcess(conn, ctrlCd);
						if(issuePrc.execProcess() == true){
							logMessage = "Issue Process was Complated!";
							setSyslogConfig(logMessage);

							// �ۊǋ�o�ɉ\���Əo�ɐ��̃`�F�b�N
							if("true".equals(struct.getc_JOB_ODR_CD()) &&
									Calculate.compare(struct.getRCV_ISSUE_QTY(),
											struct.getTHIS_TIME_POS_QTY()) == 1){
								setErrorMessage("AF00124");
								conn.rollback();
							}else{
								// �u�o�ɐ���w�肷��v�`�F�b�N�{�b�N�X��on�̏ꍇ�A[�v��O�o�ɏ��]�o�^���s��
								if("true".equals(struct.getc_ISSUE_FLG())) {
									insertUnplndIssAn(struct);

									// �u�o�ɐ��ƌv��R�[�h�v�������͂̏ꍇ
									if("".equals(struct.getISSUE_PROC_CD()) || struct.getISSUE_PROC_CD() == null) {
										// [�i��]���O��敪��1(����)�̏ꍇ
										if(issueOutsideTyp.intValue() == 1) {
											setWarnMessage("AF00151");
										}
									}
								}
//20150722 ADD START BY SYSCOM
								//���o�ɕʉ�v�A�g���ɓo�^
								insertRcvIssAiIfDate(struct);
//20150722 ADD END BY SYSCOM
								// �R�~�b�g
								conn.commit();
	
								if(resultCeil == true){
									// �o�^�������s�F�����Ǘ��i�ڂ̂��ߏ����_�ȉ��͐؂�グ���čX�V���܂���
									logMessage = "T_RCV_ISSUE.RCV_ISSUE_CTRL_CD:" + struct.getISSUE_CTRL_CD();
									setInfoMessage("AF60004", logMessage);
								}
								// ���[�h�ݒ�
								_mode = _INSERT;
	
								// ����
								controlselect();
							}
						}else{

							// �ۊǋ�o�ɉ\���Əo�ɐ��̃`�F�b�N
							if("true".equals(struct.getc_JOB_ODR_CD()) &&
									Calculate.compare(struct.getRCV_ISSUE_QTY(),
											struct.getTHIS_TIME_POS_QTY()) == 1){
								setErrorMessage("AF00124");
							}
							
							logMessage = "Issue Process was Failed...";
							setSyslogConfig(logMessage);

							// ���[���o�b�N
							conn.rollback();
						}

						// �o�ɏ������Ŕ����������b�Z�[�W�擾
						logMessage = "T_RCV_ISSUE.RCV_ISSUE_CTRL_CD:" + struct.getISSUE_CTRL_CD();
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
                //}}user_implement_dev:<controlinsert>
		logger.exiting("AF0090010Control"+":USER="+struct.getsUser_ID(),"controlinsert");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0090");
		logger.entering("AF0090010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
		//---------------------------------------------------------------------
		// ���O�o�͏��i�[�p
		String logMessage = "";
		List listMessage = new ArrayList();

		try{
			String s_date = null;

			struct.setPLANT_CD(getsysPLANT_CD());

			// �Ɩ��^�p���擾
			List dateList = entity.mselectSYS_DATE_CTRL.read(conn, struct);
			if(dateList.size() <= 0){
				// �o�^�������s�F�Ɩ��^�p�������݂��܂���
				logMessage = "SYS_DATE_CTRL.PLANT_CD:" + struct.getPLANT_CD();
				setErrorMessage("AF00056", logMessage);
			}
			else{
				AF0090010Struct dateStruct = (AF0090010Struct)dateList.get(0);
				s_date = dateStruct.getBUSINESS_OPR_DATE();
			}

			// ���[�h�ݒ�
			_mode = _NORMAL;

			// ������

			struct.clear();
			struct.setw_JOB_ODR(new Integer(0));
			struct.setw_INFERIOR(new Integer(0));
			
			struct.setw_WH_STOCK_ON_HAND_QTY(new String("0.0"));
			struct.setDEFECT_QTY(new String("0.0"));
			struct.setw_TOTAL_STOCK_ON_HAND_QTY(new String("0.0"));
			struct.setw_TOTAL_DEFECT_QTY(new String("0.0"));
			struct.setRCV_ISSUE_QTY(new String("0.0"));
			
			struct.setALC_POS_QTY(new String("0.0"));
			struct.setTHIS_TIME_POS_QTY(new String("0.0"));
			
			struct.setLOT_STOCK_ON_HAND_QTY(new String("0.0"));
			struct.setLOT_DEFECT_QTY(new String("0.0"));
			struct.setALLOCABLE_QTY(new String("0.0"));
			if(LotCtrl.checkLotCtrl(conn)){
			    struct.seth_LotCtrl("true");
			}else{
				struct.seth_LotCtrl("false");
			}
			// �Ɩ��^�p���ݒ�
			struct.setRCV_ISSUE_DATE(s_date);
			struct.setBUSINESS_OPR_DATE(s_date);

		}catch(SQLException e){
			setSqlExceptionMsg(e);
		}
		//---------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AF0090010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0090");
		logger.entering("AF0090010Control"+":USER="+struct.getsUser_ID(),"controlclose");
			//{{user_implement_dev:<controlclose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlclose>
		logger.exiting("AF0090010Control"+":USER="+struct.getsUser_ID(),"controlclose");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0090");
		logger.entering("AF0090010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AF0090010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0090");
		logger.entering("AF0090010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		//---------------------------------------------------------------------

		// �N���A����
		controlclear();
		// ���[�U��`������
		usersInitialize();
//20150807 ADD START BY SYSCOM
		// �R���{�{�b�N�X�f�[�^�𕔕i���擾
		try{
			_unitAcctCdStruct = createComboData("1");
			_unitPjCdStruct = createComboData("2");
			_unitSegContent1Struct = createComboData("3");
			_unitSegContent2Struct = createComboData("4");
			_unitSegContent3Struct = createComboData("5");
			_unitSegContent4Struct = createComboData("6");
			
			// ��ЃR�[�h�擾
			List companyList = entity.mselectSYS_MY_COMPANY.read(conn, struct);
			if(companyList.size() > 0){
				AF0090010Struct companyStruct = (AF0090010Struct)companyList.get(0);
				struct.setCOMPANY_CD(companyStruct.getCOMPANY_CD());
			}
		} catch (Exception e){
			e.printStackTrace();
			throw new ExpjException(e);
		}
//20150807 ADD END BY SYSCOM
		//---------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AF0090010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0090");
		logger.entering("AF0090010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AF0090010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("insert") ) {
				controlinsert();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("close") ) {
				controlclose();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
			
//20150807 ADD START BY SYSCOM
			struct.setList_ACCT_CD_val(_unitAcctCdStruct.getValList());
			struct.setList_ACCT_CD_name(_unitAcctCdStruct.getExplanList());
			struct.setList_PJ_CD_val(_unitPjCdStruct.getValList());
			struct.setList_PJ_CD_name(_unitPjCdStruct.getExplanList());
			struct.setList_SEG_CONTENTS1_val(_unitSegContent1Struct.getValList());
			struct.setList_SEG_CONTENTS1_name(_unitSegContent1Struct.getExplanList());
			struct.setList_SEG_CONTENTS2_val(_unitSegContent2Struct.getValList());
			struct.setList_SEG_CONTENTS2_name(_unitSegContent2Struct.getExplanList());
			struct.setList_SEG_CONTENTS3_val(_unitSegContent3Struct.getValList());
			struct.setList_SEG_CONTENTS3_name(_unitSegContent3Struct.getExplanList());
			struct.setList_SEG_CONTENTS4_val(_unitSegContent4Struct.getValList());
			struct.setList_SEG_CONTENTS4_name(_unitSegContent4Struct.getExplanList());
//20150807 ADD END BY SYSCOM
			
//		�\�[�X���ɂ܂�AlarmMessageException���c���Ă���ꍇ�́A�ȉ��̍s�̃R�����g���O����AlarmMessageException���n������B
		} catch(AlarmMessageException ame){
			ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
			throw ee;
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// �g���b�Z�[�W�o�͈˗��쐬
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AF0090010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0090010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AF0090010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0090010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AF0090010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0090010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AF0090010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AF0090010Entity entity;
	protected AF0090010Struct struct;
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

		entity = new AF0090010Entity();
		struct = new AF0090010Struct();

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
	 * AF0090010�N���X�̕W���R���X�g���N�^
	 */
	public AF0090010Control() throws BusinessProcessException, FoundationException
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
				AF0090010Struct key = (AF0090010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("w_JOB_ODR") && key.getw_JOB_ODR() != null) {
					msgKey.setKeyValue("w_JOB_ODR", key.getw_JOB_ODR().toString());
				}
				if(msgKeyType.containsKeyColumn("w_INFERIOR") && key.getw_INFERIOR() != null) {
					msgKey.setKeyValue("w_INFERIOR", key.getw_INFERIOR().toString());
				}
				if(msgKeyType.containsKeyColumn("c_JOB_ODR_CD") && key.getc_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("c_JOB_ODR_CD", key.getc_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("c_RCV_ISSUE_QTY") && key.getc_RCV_ISSUE_QTY() != null) {
					msgKey.setKeyValue("c_RCV_ISSUE_QTY", key.getc_RCV_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("ALC_POS_QTY") && key.getALC_POS_QTY() != null) {
					msgKey.setKeyValue("ALC_POS_QTY", key.getALC_POS_QTY());
				}
				if(msgKeyType.containsKeyColumn("THIS_TIME_POS_QTY") && key.getTHIS_TIME_POS_QTY() != null) {
					msgKey.setKeyValue("THIS_TIME_POS_QTY", key.getTHIS_TIME_POS_QTY());
				}
				if(msgKeyType.containsKeyColumn("c_ISSUE_FLG") && key.getc_ISSUE_FLG() != null) {
					msgKey.setKeyValue("c_ISSUE_FLG", key.getc_ISSUE_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_LotCtrl") && key.geth_LotCtrl() != null) {
					msgKey.setKeyValue("h_LotCtrl", key.geth_LotCtrl());
				}
				if(msgKeyType.containsKeyColumn("h_lotFlg") && key.geth_lotFlg() != null) {
					msgKey.setKeyValue("h_lotFlg", key.geth_lotFlg());
				}
				if(msgKeyType.containsKeyColumn("ACCT_CD_name") && key.getACCT_CD_name() != null) {
					msgKey.setKeyValue("ACCT_CD_name", key.getACCT_CD_name());
				}
				if(msgKeyType.containsKeyColumn("ACCT_CD_val") && key.getACCT_CD_val() != null) {
					msgKey.setKeyValue("ACCT_CD_val", key.getACCT_CD_val());
				}
				if(msgKeyType.containsKeyColumn("PJ_CD_name") && key.getPJ_CD_name() != null) {
					msgKey.setKeyValue("PJ_CD_name", key.getPJ_CD_name());
				}
				if(msgKeyType.containsKeyColumn("PJ_CD_val") && key.getPJ_CD_val() != null) {
					msgKey.setKeyValue("PJ_CD_val", key.getPJ_CD_val());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS1_name") && key.getSEG_CONTENTS1_name() != null) {
					msgKey.setKeyValue("SEG_CONTENTS1_name", key.getSEG_CONTENTS1_name());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS1_val") && key.getSEG_CONTENTS1_val() != null) {
					msgKey.setKeyValue("SEG_CONTENTS1_val", key.getSEG_CONTENTS1_val());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS2_name") && key.getSEG_CONTENTS2_name() != null) {
					msgKey.setKeyValue("SEG_CONTENTS2_name", key.getSEG_CONTENTS2_name());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS2_val") && key.getSEG_CONTENTS2_val() != null) {
					msgKey.setKeyValue("SEG_CONTENTS2_val", key.getSEG_CONTENTS2_val());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS3_name") && key.getSEG_CONTENTS3_name() != null) {
					msgKey.setKeyValue("SEG_CONTENTS3_name", key.getSEG_CONTENTS3_name());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS3_val") && key.getSEG_CONTENTS3_val() != null) {
					msgKey.setKeyValue("SEG_CONTENTS3_val", key.getSEG_CONTENTS3_val());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS4_name") && key.getSEG_CONTENTS4_name() != null) {
					msgKey.setKeyValue("SEG_CONTENTS4_name", key.getSEG_CONTENTS4_name());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS4_val") && key.getSEG_CONTENTS4_val() != null) {
					msgKey.setKeyValue("SEG_CONTENTS4_val", key.getSEG_CONTENTS4_val());
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
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("PRODUCT_TYP") && key.getPRODUCT_TYP() != null) {
					msgKey.setKeyValue("PRODUCT_TYP", key.getPRODUCT_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP") && key.getSPL_ITEM_TYP() != null) {
					msgKey.setKeyValue("SPL_ITEM_TYP", key.getSPL_ITEM_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG") && key.getLOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("LOT_CTRL_FLG", key.getLOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("w_MANHOUR_TYP") && key.getw_MANHOUR_TYP() != null) {
					msgKey.setKeyValue("w_MANHOUR_TYP", key.getw_MANHOUR_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_TOTAL_STOCK_ON_HAND_QTY") && key.getw_TOTAL_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("w_TOTAL_STOCK_ON_HAND_QTY", key.getw_TOTAL_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("w_WH_STOCK_ON_HAND_QTY") && key.getw_WH_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("w_WH_STOCK_ON_HAND_QTY", key.getw_WH_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_QTY") && key.getDEFECT_QTY() != null) {
					msgKey.setKeyValue("DEFECT_QTY", key.getDEFECT_QTY());
				}
				if(msgKeyType.containsKeyColumn("w_TOTAL_DEFECT_QTY") && key.getw_TOTAL_DEFECT_QTY() != null) {
					msgKey.setKeyValue("w_TOTAL_DEFECT_QTY", key.getw_TOTAL_DEFECT_QTY());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("MRP_FLG") && key.getMRP_FLG() != null) {
					msgKey.setKeyValue("MRP_FLG", key.getMRP_FLG());
				}
				if(msgKeyType.containsKeyColumn("w_WH_TYP") && key.getw_WH_TYP() != null) {
					msgKey.setKeyValue("w_WH_TYP", key.getw_WH_TYP());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_CTRL_CD") && key.getISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("ISSUE_CTRL_CD", key.getISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_TYP") && key.getISSUE_TYP() != null) {
					msgKey.setKeyValue("ISSUE_TYP", key.getISSUE_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_QTY") && key.getRCV_ISSUE_QTY() != null) {
					msgKey.setKeyValue("RCV_ISSUE_QTY", key.getRCV_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_DATE") && key.getRCV_ISSUE_DATE() != null) {
					msgKey.setKeyValue("RCV_ISSUE_DATE", key.getRCV_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_GNR_TYP") && key.getRCV_ISSUE_GNR_TYP() != null) {
					msgKey.setKeyValue("RCV_ISSUE_GNR_TYP", key.getRCV_ISSUE_GNR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UPD_TYP") && key.getSTOCK_UPD_TYP() != null) {
					msgKey.setKeyValue("STOCK_UPD_TYP", key.getSTOCK_UPD_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("VEND_LOT_NO") && key.getVEND_LOT_NO() != null) {
					msgKey.setKeyValue("VEND_LOT_NO", key.getVEND_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("CONS_TYP") && key.getCONS_TYP() != null) {
					msgKey.setKeyValue("CONS_TYP", key.getCONS_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO") && key.getLOT_NO() != null) {
					msgKey.setKeyValue("LOT_NO", key.getLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("ONEROUS_FLG") && key.getONEROUS_FLG() != null) {
					msgKey.setKeyValue("ONEROUS_FLG", key.getONEROUS_FLG().toString());
				}
				if(msgKeyType.containsKeyColumn("SBCNT_PUCH_TYP") && key.getSBCNT_PUCH_TYP() != null) {
					msgKey.setKeyValue("SBCNT_PUCH_TYP", key.getSBCNT_PUCH_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("NON_PLANNED_CAUSE_CD") && key.getNON_PLANNED_CAUSE_CD() != null) {
					msgKey.setKeyValue("NON_PLANNED_CAUSE_CD", key.getNON_PLANNED_CAUSE_CD());
				}
				if(msgKeyType.containsKeyColumn("w_MODIFY_COUNT") && key.getw_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("w_MODIFY_COUNT", key.getw_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_JOB_ODR_CD") && key.getISSUE_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("ISSUE_JOB_ODR_CD", key.getISSUE_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("w_ODR_STS_TYP") && key.getw_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("w_ODR_STS_TYP", key.getw_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_ITEM_CD") && key.getISSUE_ITEM_CD() != null) {
					msgKey.setKeyValue("ISSUE_ITEM_CD", key.getISSUE_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_PROC_CD") && key.getISSUE_PROC_CD() != null) {
					msgKey.setKeyValue("ISSUE_PROC_CD", key.getISSUE_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("w_SUM_RCV_ISSUE_QTY") && key.getw_SUM_RCV_ISSUE_QTY() != null) {
					msgKey.setKeyValue("w_SUM_RCV_ISSUE_QTY", key.getw_SUM_RCV_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("PAST_RESULT_ENTRY_TYP") && key.getPAST_RESULT_ENTRY_TYP() != null) {
					msgKey.setKeyValue("PAST_RESULT_ENTRY_TYP", key.getPAST_RESULT_ENTRY_TYP());
				}
				if(msgKeyType.containsKeyColumn("LOT_STOCK_ON_HAND_QTY") && key.getLOT_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("LOT_STOCK_ON_HAND_QTY", key.getLOT_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("LOT_DEFECT_QTY") && key.getLOT_DEFECT_QTY() != null) {
					msgKey.setKeyValue("LOT_DEFECT_QTY", key.getLOT_DEFECT_QTY());
				}
				if(msgKeyType.containsKeyColumn("ALLOCABLE_QTY") && key.getALLOCABLE_QTY() != null) {
					msgKey.setKeyValue("ALLOCABLE_QTY", key.getALLOCABLE_QTY());
				}
				if(msgKeyType.containsKeyColumn("ACCT_CD") && key.getACCT_CD() != null) {
					msgKey.setKeyValue("ACCT_CD", key.getACCT_CD());
				}
				if(msgKeyType.containsKeyColumn("DEPT_CD") && key.getDEPT_CD() != null) {
					msgKey.setKeyValue("DEPT_CD", key.getDEPT_CD());
				}
				if(msgKeyType.containsKeyColumn("PJ_CD") && key.getPJ_CD() != null) {
					msgKey.setKeyValue("PJ_CD", key.getPJ_CD());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS1") && key.getSEG_CONTENTS1() != null) {
					msgKey.setKeyValue("SEG_CONTENTS1", key.getSEG_CONTENTS1());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS2") && key.getSEG_CONTENTS2() != null) {
					msgKey.setKeyValue("SEG_CONTENTS2", key.getSEG_CONTENTS2());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS3") && key.getSEG_CONTENTS3() != null) {
					msgKey.setKeyValue("SEG_CONTENTS3", key.getSEG_CONTENTS3());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS4") && key.getSEG_CONTENTS4() != null) {
					msgKey.setKeyValue("SEG_CONTENTS4", key.getSEG_CONTENTS4());
				}
				if(msgKeyType.containsKeyColumn("DEPT_NAME") && key.getDEPT_NAME() != null) {
					msgKey.setKeyValue("DEPT_NAME", key.getDEPT_NAME());
				}
				if(msgKeyType.containsKeyColumn("VALUE") && key.getVALUE() != null) {
					msgKey.setKeyValue("VALUE", key.getVALUE());
				}
				if(msgKeyType.containsKeyColumn("DISPLAY_NAME") && key.getDISPLAY_NAME() != null) {
					msgKey.setKeyValue("DISPLAY_NAME", key.getDISPLAY_NAME());
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
					AF0090010Struct key = new AF0090010Struct();
					if(msgKeyType.containsKeyColumn("w_JOB_ODR")) {
						key.setw_JOB_ODR(new Integer(msgKey.getKeyValue("w_JOB_ODR")));
					}
					if(msgKeyType.containsKeyColumn("w_INFERIOR")) {
						key.setw_INFERIOR(new Integer(msgKey.getKeyValue("w_INFERIOR")));
					}
					if(msgKeyType.containsKeyColumn("c_JOB_ODR_CD")) {
						key.setc_JOB_ODR_CD(msgKey.getKeyValue("c_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("c_RCV_ISSUE_QTY")) {
						key.setc_RCV_ISSUE_QTY(msgKey.getKeyValue("c_RCV_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ALC_POS_QTY")) {
						key.setALC_POS_QTY(msgKey.getKeyValue("ALC_POS_QTY"));
					}
					if(msgKeyType.containsKeyColumn("THIS_TIME_POS_QTY")) {
						key.setTHIS_TIME_POS_QTY(msgKey.getKeyValue("THIS_TIME_POS_QTY"));
					}
					if(msgKeyType.containsKeyColumn("c_ISSUE_FLG")) {
						key.setc_ISSUE_FLG(msgKey.getKeyValue("c_ISSUE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_LotCtrl")) {
						key.seth_LotCtrl(msgKey.getKeyValue("h_LotCtrl"));
					}
					if(msgKeyType.containsKeyColumn("h_lotFlg")) {
						key.seth_lotFlg(msgKey.getKeyValue("h_lotFlg"));
					}
					if(msgKeyType.containsKeyColumn("ACCT_CD_name")) {
						key.setACCT_CD_name(msgKey.getKeyValue("ACCT_CD_name"));
					}
					if(msgKeyType.containsKeyColumn("ACCT_CD_val")) {
						key.setACCT_CD_val(msgKey.getKeyValue("ACCT_CD_val"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CD_name")) {
						key.setPJ_CD_name(msgKey.getKeyValue("PJ_CD_name"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CD_val")) {
						key.setPJ_CD_val(msgKey.getKeyValue("PJ_CD_val"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS1_name")) {
						key.setSEG_CONTENTS1_name(msgKey.getKeyValue("SEG_CONTENTS1_name"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS1_val")) {
						key.setSEG_CONTENTS1_val(msgKey.getKeyValue("SEG_CONTENTS1_val"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS2_name")) {
						key.setSEG_CONTENTS2_name(msgKey.getKeyValue("SEG_CONTENTS2_name"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS2_val")) {
						key.setSEG_CONTENTS2_val(msgKey.getKeyValue("SEG_CONTENTS2_val"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS3_name")) {
						key.setSEG_CONTENTS3_name(msgKey.getKeyValue("SEG_CONTENTS3_name"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS3_val")) {
						key.setSEG_CONTENTS3_val(msgKey.getKeyValue("SEG_CONTENTS3_val"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS4_name")) {
						key.setSEG_CONTENTS4_name(msgKey.getKeyValue("SEG_CONTENTS4_name"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS4_val")) {
						key.setSEG_CONTENTS4_val(msgKey.getKeyValue("SEG_CONTENTS4_val"));
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
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(new Integer(msgKey.getKeyValue("MRP_ODR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(new Integer(msgKey.getKeyValue("OUTSIDE_TYP")));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(new Integer(msgKey.getKeyValue("UNIT_QTY_TYP")));
					}
					if(msgKeyType.containsKeyColumn("PRODUCT_TYP")) {
						key.setPRODUCT_TYP(new Integer(msgKey.getKeyValue("PRODUCT_TYP")));
					}
					if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP")) {
						key.setSPL_ITEM_TYP(new Integer(msgKey.getKeyValue("SPL_ITEM_TYP")));
					}
					if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG")) {
						key.setLOT_CTRL_FLG(msgKey.getKeyValue("LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("w_MANHOUR_TYP")) {
						key.setw_MANHOUR_TYP(msgKey.getKeyValue("w_MANHOUR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_TOTAL_STOCK_ON_HAND_QTY")) {
						key.setw_TOTAL_STOCK_ON_HAND_QTY(msgKey.getKeyValue("w_TOTAL_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_WH_STOCK_ON_HAND_QTY")) {
						key.setw_WH_STOCK_ON_HAND_QTY(msgKey.getKeyValue("w_WH_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_QTY")) {
						key.setDEFECT_QTY(msgKey.getKeyValue("DEFECT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("w_TOTAL_DEFECT_QTY")) {
						key.setw_TOTAL_DEFECT_QTY(msgKey.getKeyValue("w_TOTAL_DEFECT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("MRP_FLG")) {
						key.setMRP_FLG(msgKey.getKeyValue("MRP_FLG"));
					}
					if(msgKeyType.containsKeyColumn("w_WH_TYP")) {
						key.setw_WH_TYP(msgKey.getKeyValue("w_WH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_CTRL_CD")) {
						key.setISSUE_CTRL_CD(msgKey.getKeyValue("ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_TYP")) {
						key.setISSUE_TYP(new Integer(msgKey.getKeyValue("ISSUE_TYP")));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_QTY")) {
						key.setRCV_ISSUE_QTY(msgKey.getKeyValue("RCV_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_DATE")) {
						key.setRCV_ISSUE_DATE(msgKey.getKeyValue("RCV_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_GNR_TYP")) {
						key.setRCV_ISSUE_GNR_TYP(new Integer(msgKey.getKeyValue("RCV_ISSUE_GNR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UPD_TYP")) {
						key.setSTOCK_UPD_TYP(new Integer(msgKey.getKeyValue("STOCK_UPD_TYP")));
					}
					if(msgKeyType.containsKeyColumn("VEND_LOT_NO")) {
						key.setVEND_LOT_NO(msgKey.getKeyValue("VEND_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("CONS_TYP")) {
						key.setCONS_TYP(new Integer(msgKey.getKeyValue("CONS_TYP")));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO")) {
						key.setLOT_NO(msgKey.getKeyValue("LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("ONEROUS_FLG")) {
						key.setONEROUS_FLG(new Integer(msgKey.getKeyValue("ONEROUS_FLG")));
					}
					if(msgKeyType.containsKeyColumn("SBCNT_PUCH_TYP")) {
						key.setSBCNT_PUCH_TYP(new Integer(msgKey.getKeyValue("SBCNT_PUCH_TYP")));
					}
					if(msgKeyType.containsKeyColumn("NON_PLANNED_CAUSE_CD")) {
						key.setNON_PLANNED_CAUSE_CD(msgKey.getKeyValue("NON_PLANNED_CAUSE_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_MODIFY_COUNT")) {
						key.setw_MODIFY_COUNT(msgKey.getKeyValue("w_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_JOB_ODR_CD")) {
						key.setISSUE_JOB_ODR_CD(msgKey.getKeyValue("ISSUE_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_ODR_STS_TYP")) {
						key.setw_ODR_STS_TYP(msgKey.getKeyValue("w_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_ITEM_CD")) {
						key.setISSUE_ITEM_CD(msgKey.getKeyValue("ISSUE_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_PROC_CD")) {
						key.setISSUE_PROC_CD(msgKey.getKeyValue("ISSUE_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_SUM_RCV_ISSUE_QTY")) {
						key.setw_SUM_RCV_ISSUE_QTY(msgKey.getKeyValue("w_SUM_RCV_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PAST_RESULT_ENTRY_TYP")) {
						key.setPAST_RESULT_ENTRY_TYP(msgKey.getKeyValue("PAST_RESULT_ENTRY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("LOT_STOCK_ON_HAND_QTY")) {
						key.setLOT_STOCK_ON_HAND_QTY(msgKey.getKeyValue("LOT_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("LOT_DEFECT_QTY")) {
						key.setLOT_DEFECT_QTY(msgKey.getKeyValue("LOT_DEFECT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ALLOCABLE_QTY")) {
						key.setALLOCABLE_QTY(msgKey.getKeyValue("ALLOCABLE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ACCT_CD")) {
						key.setACCT_CD(msgKey.getKeyValue("ACCT_CD"));
					}
					if(msgKeyType.containsKeyColumn("DEPT_CD")) {
						key.setDEPT_CD(msgKey.getKeyValue("DEPT_CD"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CD")) {
						key.setPJ_CD(msgKey.getKeyValue("PJ_CD"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS1")) {
						key.setSEG_CONTENTS1(msgKey.getKeyValue("SEG_CONTENTS1"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS2")) {
						key.setSEG_CONTENTS2(msgKey.getKeyValue("SEG_CONTENTS2"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS3")) {
						key.setSEG_CONTENTS3(msgKey.getKeyValue("SEG_CONTENTS3"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS4")) {
						key.setSEG_CONTENTS4(msgKey.getKeyValue("SEG_CONTENTS4"));
					}
					if(msgKeyType.containsKeyColumn("DEPT_NAME")) {
						key.setDEPT_NAME(msgKey.getKeyValue("DEPT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("VALUE")) {
						key.setVALUE(msgKey.getKeyValue("VALUE"));
					}
					if(msgKeyType.containsKeyColumn("DISPLAY_NAME")) {
						key.setDISPLAY_NAME(msgKey.getKeyValue("DISPLAY_NAME"));
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
