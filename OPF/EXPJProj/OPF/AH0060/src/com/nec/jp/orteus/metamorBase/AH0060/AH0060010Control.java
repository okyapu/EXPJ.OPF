/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AH0060/src/com/nec/jp/orteus/metamorBase/AH0060/AH0060010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AH0060;

import com.nec.jp.orteus.metamorBase.AH0060.*;
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
import java.io.*;
import jp.co.fit.vfreport.*;
//{{user_implement_code_import
	// TODO: ������import�p�b�P�[�W���L�q���Ă�������
import com.nec.jp.orteus.metamorBase.common01.Inventry.InvAccessor;
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.LotCtrl;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AH0060010Control
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
	public Object getListvalue(int x) { return this.list.get(x); }	// ���X�g�̒l�i���f�B�G�[�^�j��Ԃ��܂��B

	public AH0060010Struct getStruct() { return this.struct; }	// Struct�̒l�i���f�B�G�[�^�j��Ԃ��܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

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

	/**
	 * SQLException���b�Z�[�W�ݒ�
	 * @param SQLException
	 */
	private void setSqlExceptionMsg(SQLException e) throws ExpjException
	{
		// �G���[���b�Z�[�W�쐬
		ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
		sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
		ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
		throw ee;
	}

	/**
	 * ��񃁃b�Z�[�W�ݒ�
	 * @param ���b�Z�[�W�ԍ�
	 * @param �o�̓��b�Z�[�W
	 */
	private void setInfoMessage(String key)
	{
		ExpjMessage emsg = new ExpjMessage( "ZZ01006", key );
		msgStruct.addInfo( emsg );	// ��񃁃b�Z�[�W�Ƃ��ēo�^
		sysLog.config(emsg, getsysUSER_CD()); //���ڍ�
	}

	/**
	 * ��񃁃b�Z�[�W�ݒ�
	 * @param �o�̓��b�Z�[�W
	 */
	private void setSyslogConfig(String key)
	{
		ExpjMessage emsg = new ExpjMessage( "ZZ01006", key );
		sysLog.config(emsg, getsysUSER_CD()); //���ڍ�
	}

	/**
	 * �G���[���b�Z�[�W�ݒ�
	 * @param	code	���b�Z�[�W�ԍ�
	 */
	private void setErrorMessage(String code)
	{
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, getsysUSER_CD());
	}

	/**
	 * �G���[�������p�����[�^�ݒ�
	 * @param	key		�p�����[�^
	 */
	private void setErrorParameter(String key)
	{
		ExpjMessage emsg = new ExpjMessage("ZZ01006", key);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, getsysUSER_CD());
	}

	/**
	 * Exception�G���[���b�Z�[�W�ݒ�
	 * @param	code	���b�Z�[�W�ԍ�
	 * @return	ExpjMessage
	 */
	private ExpjMessage setExceptionMessage(String code)
	{
		ExpjMessage emsg = new ExpjMessage(code);
		sysLog.severe(emsg, getsysUSER_CD());
		return emsg;
	}

	/**
	 * Exception�G���[�������p�����[�^�ݒ�
	 * @param	key		�p�����[�^
	 */
	private void setExceptionParameter(String key)
	{
		ExpjMessage emsg = new ExpjMessage("ZZ01006", key);
		sysLog.severe(emsg, getsysUSER_CD());
	}

	//------------------------------------------------------------------

	/**
	 * �\���ő�s����������
	 *
	 * @param key �A�N�Z�X�L�[
	 * @param size �Ώۍs��
	 * @return �ُ�Ȃ� true �G���[ false
	 */
	private boolean checkMaxDispLine(int key, int size) throws FoundationException, SQLException
	{
		ScreenParam sp = new ScreenParam(this.getClass());
		int maxLine = sp.getMaxLine(conn,key);
		if(maxLine != 0 && size > maxLine)
		{
			ExpjMessage emsg = new ExpjMessage( "ZZ01115", ""+maxLine );
			msgStruct.addError( emsg );
			sysLog.warning(emsg, getsysUSER_CD());
			return false;
		}
		return true;
	}

	//---------- �b�r�u�o�͊֘A�̏��� ---------------------------------------------------

	private List _csvList = new ArrayList(0);
	public List getCsvList(){ return _csvList; }
	public void setCsvList(List list){ _csvList = list; }

	//---------- ���[�o�͊֘A�̏��� ---------------------------------------------------

	/** �t�H�[������ID�i�i�ڍ݌Ɂ|�i�ڏ��j */
	private final String FORMID_ITEMSTOCK_ITEM		= "1";
	/** �t�H�[������ID�i���ԍ݌Ɂ|�i�ڏ��j */
	private final String FORMID_JOBODRCDSTOCK_ITEM	= "2";
	/** �t�H�[������ID�i�i�ڍ݌Ɂ|�ۊǋ揇�j */
	private final String FORMID_ITEMSTOCK_WH		= "3";
	/** �t�H�[������ID�i���ԍ݌Ɂ|�ۊǋ揇�j */
	private final String FORMID_JOBODRCDSTOCK_WH	= "4";
	/** �t�H�[������ID�i���b�g�݌Ɂ|�i�ڋ揇�j */
	private final String FORMID_LOTSTOCK_ITEM		= "5";
	/** �t�H�[������ID�i���b�g�݌Ɂ|�ۊǋ揇�j */
	private final String FORMID_LOTSTOCK_WH     	= "6";

	//------------------------------------------------------------------

	/** ���I�ꗗ��p�N���X�I�u�W�F�N�g */
	AH0060Common _common = null;

	/** �I�����擾�p�N���X�I�u�W�F�N�g */
	InvAccessor _invAccessor = null;

	/** �e��ʃp�����[�^�i�ő�\���s���j�擾�A�N�Z�X�L�[ */
	private final int _DISPLAY_CD_PARENT = 10;

	/** �e���struct���ꎞ�ޔ�p */
	private AH0060010Struct _save_struct = new AH0060010Struct();

	/** ���ԍ݌Ɏw��t���O */
	String _strJOB_ODR_CD_STOCK_flg = null;

	/** �\�����t���O */
	String _strSortFlg = null;

	/** �ꗗ���i�[�p���X�g */
	List _listData = new ArrayList(0);

	/** ��ʗp�u�I���敪�v�R���{�{�b�N�X�f�[�^�i�[�p */
	private ComboStruct _comboAbcTyp = new ComboStruct();
	
	/** ���b�g�Ǘ������σ`�F�b�N�p */
	String lotCtrl;

	/**
	 * ��ʗp�u�I���敪�v�R���{�{�b�N�X���X�g�f�[�^�ݒ�
	 *
	 * @param	comboAbcTyp �I���敪�R���{���X�g�f�[�^
	 * @return	�Ȃ�
	 */
	private void makeAbcTypComboData(ComboStruct comboAbcTyp)
	{
		_comboAbcTyp = new ComboStruct();
		_comboAbcTyp.addData("", "");// �P���ڂɋ󔒃f�[�^�ݒ�
		for(int i = 0; i < comboAbcTyp.size(); i++)
		{
			String[] str = comboAbcTyp.getData(i);
			if("9".equals(str[0]) == true)
			{
				// �I���敪��9�̃f�[�^�͒ǉ����Ȃ�
				continue;
			}
			_comboAbcTyp.addData(str[0], str[1]);
		}
	}

	/**
	 * ���ԍ݌Ɏw��t���O�擾
	 * @return ���ԍ݌Ɏw��t���O
	 */
	private String getJOB_ODR_CD_STOCK_flg()
	{
		return _strJOB_ODR_CD_STOCK_flg;
	}

	/**
	 * ���ԍ݌Ɏw��t���O�ݒ�
	 * @param ���ԍ݌Ɏw��t���O
	 */
	private void setJOB_ODR_CD_STOCK_flg(String flg)
	{
		_strJOB_ODR_CD_STOCK_flg = flg;
	}

	/**
	 * �\�����t���O�擾
	 * @return �\�����t���O
	 */
	private String getSortFlg()
	{
		return _strSortFlg;
	}

	/**
	 * �\�����t���O�ݒ�
	 * @param �\�����t���O
	 */
	private void setSortFlg(String flg)
	{
		_strSortFlg = flg;
	}

	/**
	 * �敪���擾�i���ʁj
	 *
	 * @param	comboStruct	�敪��񃊃X�g
	 * @param	strTyp		�敪�R�[�h
	 * @return	�敪����(�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�)
	 */
	private String getTypName(ComboStruct comboStruct, String strTyp)
	{
		String strTypName = strTyp;
		if((comboStruct != null) && (strTyp != null))
		{
			for(int i = 0; i < comboStruct.getValList().size(); i++)
			{
				if(strTyp.equals((String)(comboStruct.getValList().get(i))) == true)
				{
					strTypName = (String)(comboStruct.getExplanList().get(i));
					break;
				}
			}
		}
		return strTypName;
	}

	/**
	 * �I������f�[�^�Ǎ�����
	 *
	 * @param target_struct �Ώۃf�[�^���
	 * @return �ُ�Ȃ� �ŐV�̓Ǎ���� �G���[ null
	 */
	private AH0060010Struct readT_INV_CTRL(AH0060010Struct target_struct) throws FoundationException, SQLException
	{
		// �Ǎ����s
		List read_list = new ArrayList(0);
		read_list = entity.mT_INV_CTRL.read(conn, target_struct);

		// ���R�[�h�����`�F�b�N
		if(read_list.size() <= 0)
		{
			// ���R�[�h�������O(�[��)���̏ꍇ
			setErrorMessage("AH00021");
			setErrorParameter("T_INV_CTRL.INV_DATE:" + target_struct.getINV_DATE());
			setErrorParameter("T_INV_CTRL.PLANT_CD:" + target_struct.getPLANT_CD());
			return null;
		}

		// �Ǎ����擾
		AH0060010Struct read_struct = new AH0060010Struct();
		read_struct = (AH0060010Struct)read_list.get(0);

		// �I���󋵕�����擾�ݒ菈��
		String strInvStatus = _invAccessor.getInvStatus(
			conn,
			read_struct.getREGULAR_INV_FLG(),
			read_struct.getCYCLE_INV_FLG(),
			read_struct.getTEMP_INV_FLG(),
			read_struct.getINV_STS_TYP(),
			CoreTools.getLocale(struct.getsUser_ID()));
		read_struct.setw_INV_status(strInvStatus);
		return read_struct;
	}

	/**
	 * �I����ԋ敪��0�i�I�����{�O�j�łȂ����̃`�F�b�N
	 *
	 * @param	target_struct �Ώۃf�[�^���
	 * @return �ُ�Ȃ� true �G���[ false
	 */
	private boolean checkINV_STS_TYP_notequal0(AH0060010Struct target_struct)
	{
		// ���ʃt���O������
		boolean bResult = true;
		if("0".equals(target_struct.getINV_STS_TYP()) == true)
		{
			// �G���[
			bResult = false;

			// �I����ԋ敪��0�i�I�����{�O�j
			setErrorMessage("AH00023");
			setErrorParameter("T_INV_CTRL.INV_DATE:" + target_struct.getINV_DATE());
			setErrorParameter("T_INV_CTRL.PLANT_CD:" + getsysPLANT_CD());
			setErrorParameter("T_INV_CTRL.INV_STS_TYP:" + target_struct.getINV_STS_TYP());
		}
		return bResult;
	}

	/** 
	 * �b�r�u�o�̓f�[�^�ݒ菀��
	 *
	 * @param target_struct �Ώۃf�[�^���
	 * @param listTarget	�Ώۃf�[�^���X�g
	 * @param strKindStock	�݌Ɏ�ށi���ԁF1 �i�ځF1�ȊO�j
	 * @return �ُ�Ȃ� true �G���[ false
	 */
	private boolean csvExport(AH0060010Struct target_struct, List listTarget, String strKindStock)
	{
		// ���������t���O������
		boolean bSuccess = false;

		// �擾�f�[�^������ꍇ�̂ݏo�͗p���X�g�֎擾���X�g��ݒ肷��
		if(listTarget != null && listTarget.size() > 0)
		{
			// �݌Ɏ�ނɂ��b�r�u�o�̓f�[�^�ݒ菀��
			if("1".equals(strKindStock) == true)
			{
				// ���I�ꗗ�\�|����
				csvExport4JobOdr(target_struct, listTarget);
			}
			else
			{
				if( struct.getr2_whlot1()!=null 
                        && (("1".equals(struct.getr2_whlot1()) == true)
                                || (struct.getr2_whlot1().equals("true")))){
					// ���I�ꗗ�\�|�i��
					csvExport4Item(target_struct, listTarget);
				}
				else if (struct.getr2_whlot2()!=null 
                        && (("1".equals(struct.getr2_whlot2()) == true)
                                || (struct.getr2_whlot2().equals("true")))){
					// ���I�ꗗ�\�|���b�g
					csvExport4Lot(target_struct, listTarget);
				}
			}

			// ��������
			bSuccess = true;
		}
		return bSuccess;
	}

	/**
	 * csv�o�͏����i�i�ځj
	 *
	 * @param	target_struct �Ώۃf�[�^���
	 * @param	listTarget �Ώۃf�[�^���X�g
	 * @return	�Ȃ�
	 */
	private void csvExport4Item(AH0060010Struct target_struct, List listTarget)
	{
		// CSV���̍쐬
		String title[] = {
			"Expj.INV_DATE" ,
			"Expj.PLANT_CD" ,
			"Expj.PLANT_NAME" ,
			"Expj.WH_CD" ,
			"Expj.WH_NAME" ,
			"Expj.ITEM_CD" ,
			"Expj.ITEM_NAME" ,
			"Expj.Cmt1118" ,
			"Expj.ACTUAL_STOCK_QTY" ,
			"Expj.STOCK_UNIT" ,
			"Expj.Cmt1040" ,
			"Expj.SAFETY_STOCK" ,
			"Expj.MRP_ODR_TYP" ,
			"Expj.ABC_TYP" ,
			"Expj.MRP_FLG" ,
			"Expj.WH_TYP" ,
			"Expj.VEND_CD" ,
			"Expj.Cmt1064" ,
			"Expj.Cmt1043" 
		};

		_csvList.add(title);
		for(int i=0; i < listTarget.size(); i++)
		{
			AH0060010Struct temp_struct = (AH0060010Struct)listTarget.get(i);

			String csvStr [] = new String[title.length];
			int cnt = 0;
			csvStr[cnt++] = temp_struct.getINV_DATE();
			csvStr[cnt++] = temp_struct.getPLANT_CD();
			csvStr[cnt++] = temp_struct.getPLANT_NAME();
			csvStr[cnt++] = temp_struct.getWH_CD();
			csvStr[cnt++] = temp_struct.getWH_NAME();
			csvStr[cnt++] = temp_struct.getITEM_CD();
			csvStr[cnt++] = temp_struct.getITEM_NAME();
			csvStr[cnt++] = temp_struct.getFINAL_BOOK_STOCK_QTY();
			csvStr[cnt++] = temp_struct.getACTUAL_STOCK_QTY();
			csvStr[cnt++] = temp_struct.getSTOCK_UNIT();
			csvStr[cnt++] = temp_struct.getdifference_rate();
			csvStr[cnt++] = temp_struct.getSAFETY_STOCK();
			csvStr[cnt++] = temp_struct.getw_MRP_ODR_TYP();
			csvStr[cnt++] = temp_struct.getw_ABC_TYP();
			csvStr[cnt++] = temp_struct.getw_MRP_FLG();
			csvStr[cnt++] = temp_struct.getw_WH_TYP();
			csvStr[cnt++] = temp_struct.getVEND_CD();
			csvStr[cnt++] = temp_struct.getVEND_ANAME();
			csvStr[cnt++] = target_struct.getSTOCK_SAVE_DATE();
			_csvList.add(csvStr);
		}
		return;
	}

	/**
	 * csv�o�͏����i���ԁj
	 *
	 * @param	target_struct �Ώۃf�[�^���
	 * @param	listTarget �Ώۃf�[�^���X�g
	 * @return	�Ȃ�
	 */
	private void csvExport4JobOdr(AH0060010Struct target_struct, List listTarget)
	{
		// CSV���̍쐬
		String title[] = {
			"Expj.INV_DATE" ,
			"Expj.PLANT_CD" ,
			"Expj.PLANT_NAME" ,
			"Expj.WH_CD" ,
			"Expj.WH_NAME" ,
			"Expj.ITEM_CD" ,
			"Expj.ITEM_NAME" ,
			"Expj.JOB_ODR_CD" ,
			"Expj.Cmt1118" ,
			"Expj.ACTUAL_STOCK_QTY" ,
			"Expj.STOCK_UNIT" ,
			"Expj.Cmt1040" ,
			"Expj.SAFETY_STOCK" ,
			"Expj.MRP_ODR_TYP" ,
			"Expj.ABC_TYP" ,
			"Expj.MRP_FLG" ,
			"Expj.WH_TYP" ,
			"Expj.VEND_CD" ,
			"Expj.Cmt1064" ,
			"Expj.Cmt1043" 
		};

		_csvList.add(title);
		for(int i=0; i < listTarget.size(); i++)
		{
			AH0060010Struct temp_struct = (AH0060010Struct)listTarget.get(i);

			String csvStr [] = new String[title.length];
			int cnt = 0;
			csvStr[cnt++] = temp_struct.getINV_DATE();
			csvStr[cnt++] = temp_struct.getPLANT_CD();
			csvStr[cnt++] = temp_struct.getPLANT_NAME();
			csvStr[cnt++] = temp_struct.getWH_CD();
			csvStr[cnt++] = temp_struct.getWH_NAME();
			csvStr[cnt++] = temp_struct.getITEM_CD();
			csvStr[cnt++] = temp_struct.getITEM_NAME();
			csvStr[cnt++] = temp_struct.getJOB_ODR_CD();
			csvStr[cnt++] = temp_struct.getFINAL_BOOK_STOCK_QTY();
			csvStr[cnt++] = temp_struct.getACTUAL_STOCK_QTY();
			csvStr[cnt++] = temp_struct.getSTOCK_UNIT();
			csvStr[cnt++] = temp_struct.getdifference_rate();
			csvStr[cnt++] = temp_struct.getSAFETY_STOCK();
			csvStr[cnt++] = temp_struct.getw_MRP_ODR_TYP();
			csvStr[cnt++] = temp_struct.getw_ABC_TYP();
			csvStr[cnt++] = temp_struct.getw_MRP_FLG();
			csvStr[cnt++] = temp_struct.getw_WH_TYP();
			csvStr[cnt++] = temp_struct.getVEND_CD();
			csvStr[cnt++] = temp_struct.getVEND_ANAME();
			csvStr[cnt++] = target_struct.getSTOCK_SAVE_DATE();
			_csvList.add(csvStr);
		}
		return;
	}
	
	/**
	 * csv�o�͏����i���b�g�j
	 *
	 * @param	target_struct �Ώۃf�[�^���
	 * @param	listTarget �Ώۃf�[�^���X�g
	 * @return	�Ȃ�
	 */
	private void csvExport4Lot(AH0060010Struct target_struct, List listTarget)
	{
		// CSV���̍쐬
		String title[] = {
			"Expj.INV_DATE" ,
			"Expj.PLANT_CD" ,
			"Expj.PLANT_NAME" ,
			"Expj.WH_CD" ,
			"Expj.WH_NAME" ,
			"Expj.ITEM_CD" ,
			"Expj.ITEM_NAME" ,
			"Expj.STOCK_LOT_CD" ,
			"Expj.Cmt1118" ,
			"Expj.ACTUAL_STOCK_QTY" ,
			"Expj.STOCK_UNIT" ,
			"Expj.Cmt1040" ,
			"Expj.SAFETY_STOCK" ,
			"Expj.MRP_ODR_TYP" ,
			"Expj.ABC_TYP" ,
			"Expj.MRP_FLG" ,
			"Expj.WH_TYP" ,
			"Expj.VEND_CD" ,
			"Expj.Cmt1064" ,
			"Expj.Cmt1043" 
		};

		_csvList.add(title);
		for(int i=0; i < listTarget.size(); i++)
		{
			AH0060010Struct temp_struct = (AH0060010Struct)listTarget.get(i);

			String csvStr [] = new String[title.length];
			int cnt = 0;
			csvStr[cnt++] = temp_struct.getINV_DATE();
			csvStr[cnt++] = temp_struct.getPLANT_CD();
			csvStr[cnt++] = temp_struct.getPLANT_NAME();
			csvStr[cnt++] = temp_struct.getWH_CD();
			csvStr[cnt++] = temp_struct.getWH_NAME();
			csvStr[cnt++] = temp_struct.getITEM_CD();
			csvStr[cnt++] = temp_struct.getITEM_NAME();
			csvStr[cnt++] = temp_struct.getl_STOCK_LOT_CD();
			csvStr[cnt++] = temp_struct.getFINAL_BOOK_STOCK_QTY();
			csvStr[cnt++] = temp_struct.getACTUAL_STOCK_QTY();
			csvStr[cnt++] = temp_struct.getSTOCK_UNIT();
			csvStr[cnt++] = temp_struct.getdifference_rate();
			csvStr[cnt++] = temp_struct.getSAFETY_STOCK();
			csvStr[cnt++] = temp_struct.getw_MRP_ODR_TYP();
			csvStr[cnt++] = temp_struct.getw_ABC_TYP();
			csvStr[cnt++] = temp_struct.getw_MRP_FLG();
			csvStr[cnt++] = temp_struct.getw_WH_TYP();
			csvStr[cnt++] = temp_struct.getVEND_CD();
			csvStr[cnt++] = temp_struct.getVEND_ANAME();
			csvStr[cnt++] = target_struct.getSTOCK_SAVE_DATE();
			_csvList.add(csvStr);
		}
		return;
	}
	
	/**
	 * pdf�o�͏���
	 *
	 * @param	svf				���[���C�u�����ݒ���
	 * @param	structTarget	�Ώۃf�[�^���
	 * @param	listTarget		�Ώۃf�[�^���X�g
	 * @param	strKindStock	�݌Ɏ�ށi���ԁF1 �i�ځF1�ȊO�j
	 * @return	true:���� / false:���s
	 */
	private boolean pdfExport(
		SvfWrapper svf,
		AH0060010Struct structTarget, 
		List listTarget,
		String strKindStock)
	{
		boolean bSuccess = true;	// ���������t���O
		int ret;					// ���C�u�����������ʗp

		// �w�b�_���e�ݒ�i���ʁj
		AH0060010Struct structTemp = (AH0060010Struct)listTarget.get(0);
		return bSuccess;
	}

	/**
	 * �t�H�[���t�@�C�����擾
	 *
	 * @param	structTarget	�Ώۃf�[�^���
	 * @return	�t�H�[���t�@�C����:���� / null:���s
	 */
	private String getFormFileName(AH0060010Struct structTarget)
	{
		// �t�H�[������ID�ݒ�
		String strFormId = null;
		if("1".equals(getSortFlg()) == true)
		{
			// �i�ڏ�
			if("1".equals(getJOB_ODR_CD_STOCK_flg()) == true)
			{
				strFormId = FORMID_JOBODRCDSTOCK_ITEM;	// ���ԍ݌Ɂ|�i�ڏ�
			}
			else {
				if(struct.getr2_whlot1()!=null 
                && (("1".equals(struct.getr2_whlot1()) == true)
                        || (struct.getr2_whlot1().equals("true")))){
					strFormId = FORMID_ITEMSTOCK_ITEM;	// �i�ڍ݌Ɂ|�i�ڏ�
				}
				else if (struct.getr2_whlot2()!=null 
		                && (("1".equals(struct.getr2_whlot2()) == true)
		                        || (struct.getr2_whlot2().equals("true")))){
					strFormId = FORMID_LOTSTOCK_ITEM;	// ���b�g�݌Ɂ|�i�ڏ�
				}
			}
		}
		else
		{
			// �ۊǋ揇			
			if("1".equals(getJOB_ODR_CD_STOCK_flg()) == true)
			{
				strFormId = FORMID_JOBODRCDSTOCK_WH;	// ���ԍ݌Ɂ|�ۊǋ揇
			}
			else {
				if(struct.getr2_whlot1()!=null 
                && (("1".equals(struct.getr2_whlot1()) == true)
                        || (struct.getr2_whlot1().equals("true")))){
					strFormId = FORMID_ITEMSTOCK_WH;	// �i�ڍ݌Ɂ|�ۊǋ揇
				}
				else if (struct.getr2_whlot2()!=null 
		                && (("1".equals(struct.getr2_whlot2()) == true)
		                        || (struct.getr2_whlot2().equals("true")))){
					strFormId = FORMID_LOTSTOCK_WH;	// ���b�g�݌Ɂ|�ۊǋ揇
				}
			}
		}

		// �t�H�[���t�@�C�����쐬
		String strFormFileName = null;
		if(strFormId != null)
		{
			// ���[�t�H�[���t�@�C���ݒ�
			strFormFileName = sp.getProcId() + strFormId;// �� AH0030010 + ID
		}
		return strFormFileName;
	}
	//------------------------------------------------------------------
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0060");
		logger.entering("AH0060010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
		//---------------------------------------------------------------------
		// �Ǎ����������t���O������
		boolean bSuccess = false;
		
		// �ŐV�I��������Ǎ��p
		AH0060010Struct read_struct_inv_ctrl = new AH0060010Struct();

		// ������Ԃ�������
		setReadStatus(INITIAL);
		try {
			// �G���[�t���O������
			boolean bError = false;
			boolean bMaxDispError = false;

			// ���X�g�N���A
			list.clear();
			_listData.clear();

			// �����Ɋ֘A����p�����[�^��ݒ�
			struct.setPLANT_CD(getsysPLANT_CD());
			struct.setWH_CD(struct.getw_WH_CD());
			struct.setITEM_CD(struct.getw_ITEM_CD());
			struct.setJOB_ODR_CD(struct.getw_JOB_ODR_CD());

			// �I������f�[�^�̑��݃`�F�b�N
			read_struct_inv_ctrl = readT_INV_CTRL(struct);
			if(read_struct_inv_ctrl == null)
			{
				// �I������f�[�^�����݂��Ȃ�
				bError = true;

				// ������Ԃ��u�O���Ǎ��v�ɐݒ�
				setReadStatus(NOT_FOUND);
			}
			else
			{
				// �I����ԋ敪��0�i�I�����{�O�j�łȂ����̃`�F�b�N
				if(checkINV_STS_TYP_notequal0(read_struct_inv_ctrl) != true)
				{
					// �I����ԋ敪��0�i�I�����{�O�j
					bError = true;

					// ������Ԃ��u�O���Ǎ��v�ɐݒ�
					setReadStatus(NOT_FOUND);
				}
			}

			// �G���[���Ȃ�
			if(bError != true)
			{
				// ���I�ꗗ���Ǎ��p�p�����[�^����
				int intKindStock = 0;	// �i�ڍ݌Ɂi�����l�j
				int intKindSort = 0;	// �ۊǋ揇�i�����l�j
				if("1".equals(struct.geth_JOB_ODR_CD_STOCK_flg()) == true)
				{
					// ���ԍ݌�
					intKindStock = 1;
				}
				else
				{
					// �i�ڍ݌�
                    if( struct.getr2_whlot1()!=null 
                            && (("1".equals(struct.getr2_whlot1()) == true)
                                    || (struct.getr2_whlot1().equals("true")))){
                        intKindStock = 0;
                    }
                    // Lot�݌�
                    if( struct.getr2_whlot2()!=null
                            && (("1".equals(struct.getr2_whlot2()) == true)
                                    || (struct.getr2_whlot2().equals("true")))){
                        intKindStock = 2;                      
                    }
				}
				if("1".equals(struct.geth_sort_flg()) == true)
				{
					// �i�ڏ�
					intKindSort = 1;
				}
				// ���I�ꗗ���Ǎ�����
				_listData = _common.getData(
								conn,
								struct.getINV_DATE(), 
								intKindStock, 
								intKindSort,
								struct.getw_ITEM_CD(), 
								struct.getw_WH_CD(), 
								struct.getw_JOB_ODR_CD(),
								struct.getw_difference_rate(),
								struct.gets_ABC_TYP(),
								struct.getw_STOCK_LOT_CD()							
				);

				// ���I�ꗗ��񌏐��`�F�b�N
				if(_listData.size() <= 0)
				{
					// �������O(�[��)��
					bError = true;

					// ������Ԃ��u�O���Ǎ��v�ɐݒ�
					setReadStatus(NOT_FOUND);

					if("1".equals(struct.geth_JOB_ODR_CD_STOCK_flg()) == true)
					{
						// ����
						setErrorMessage("ZZ06001");
						setErrorParameter("T_JOB_ODR_CD_INV.INV_DATE:" + struct.getINV_DATE());
						setErrorParameter("T_JOB_ODR_CD_INV.PLANT_CD:" + struct.getPLANT_CD());
						setErrorParameter("T_JOB_ODR_CD_INV.ITEM_CD:" + struct.getw_ITEM_CD());
						setErrorParameter("T_JOB_ODR_CD_INV.WH_CD:" + struct.getw_WH_CD());
						setErrorParameter("T_JOB_ODR_CD_INV.JOB_ODR_CD:" + struct.getw_JOB_ODR_CD());
						setErrorParameter("M_ITEM.ABC_TYP:" + struct.gets_ABC_TYP());
						setErrorParameter("DIFFERENCE_RATE:" + struct.getw_difference_rate());
					}
				   else
                    {
                        if(("1".equals(struct.getr2_whlot1()))
                                ||(struct.getr2_whlot1().equals("true")))
                    
                        {
                            // �i��
                            setErrorMessage("ZZ06001");
                            setErrorParameter("T_ITEM_INV.INV_DATE:" + struct.getINV_DATE());
                            setErrorParameter("T_ITEM_INV.PLANT_CD:" + struct.getPLANT_CD());
                            setErrorParameter("T_ITEM_INV.ITEM_CD:" + struct.getw_ITEM_CD());
                            setErrorParameter("T_ITEM_INV.WH_CD:" + struct.getw_WH_CD());
                            setErrorParameter("M_ITEM.ABC_TYP:" + struct.gets_ABC_TYP());
                            setErrorParameter("DIFFERENCE_RATE:" + struct.getw_difference_rate());
                        }
                        else 
                            if(("1".equals(struct.getr2_whlot2()))
                                    ||(struct.getr2_whlot2().equals("true"))){
                                // Lot�݌�
                                setErrorMessage("ZZ06001");
                                setErrorParameter("T_LOT_INV.INV_DATE:" + struct.getINV_DATE());
                                setErrorParameter("T_LOT_INV.PLANT_CD:" + struct.getPLANT_CD());
                                setErrorParameter("T_LOT_INV.ITEM_CD:" + struct.getw_ITEM_CD());
                                setErrorParameter("T_LOT_INV.WH_CD:" + struct.getw_WH_CD());
                                setErrorParameter("T_LOT_INV.ABC_TYP:" + struct.gets_ABC_TYP());
                                setErrorParameter("DIFFERENCE_RATE:" + struct.getw_difference_rate());
                                setErrorParameter("T_LOT_INV.LOT_NO:" + struct.getw_STOCK_LOT_CD());
                            }
                    }
				}

				// �\���ő�s����������
				if(checkMaxDispLine(_DISPLAY_CD_PARENT, _listData.size()) != true)
				{
					// ���I�ꗗ��񌏐����ő�\���s���ȏ�
					bMaxDispError = true;

					// ������Ԃ��u�ő�s���I�[�o�[�v�ɐݒ�
					setReadStatus(TOO_MANY);
				}
			}

			// �G���[���Ȃ�
			if(bError != true)
			{
				// �ő�\���s���G���[�łȂ�
				if(bMaxDispError != true)
				{
					// �\���p���X�g���X�V
					setList(_listData);

					// ������Ԃ��u�Ǎ������v�ɐݒ�
					setReadStatus(NORMAL);
				}
				// �Ǎ����������t���O�ݒ�
				bSuccess = true;

				// _listData�̓��e�𔻕ʂ��邽�߂̕\�����A�݌Ɏ�ޏ���ޔ�
				setJOB_ODR_CD_STOCK_flg(struct.geth_JOB_ODR_CD_STOCK_flg());
				setSortFlg(struct.geth_sort_flg());
			}

		} catch(SQLException e) {
			setSqlExceptionMsg(e);

		} finally {
			// ��ʃ��[�h�ݒ�
			if(bSuccess == true)
			{
				// �Ǎ��������̃L�[����ޔ�
				struct.seth_save_sort_flg(struct.geth_sort_flg());
			}

			// �ŐV���ݒ�
			// ��ʕ\�����N���A
			struct.setw_INV_status("");

			// �ŐV�\�����ݒ�
			if(read_struct_inv_ctrl != null)
			{
				struct.setw_INV_status(read_struct_inv_ctrl.getw_INV_status());
				struct.setSTOCK_SAVE_DATE(read_struct_inv_ctrl.getSTOCK_SAVE_DATE());// CSV�o�͂ŕK�v
			}
		}
		//---------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AH0060010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * CSV�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlcsv_export() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0060");
		logger.entering("AH0060010Control"+":USER="+struct.getsUser_ID(),"controlcsv_export");
			//{{user_implement_dev:<controlcsv_export>
		//---------------------------------------------------------------------
		// CsvWriter�𐶐�
		csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));
		setSyslogConfig("csv-file name [" + CsvWriter.getFileName(getsysUSER_CD()) + "]");

		// ���������t���O������
		boolean bSuccess = false;

		// �b�r�u�f�[�^�i�[�p���X�g��������
		_csvList.clear();

		// �b�r�u�o�̓f�[�^�ݒ菀��
		if(csvExport(struct, _listData, getJOB_ODR_CD_STOCK_flg()))
		{
			String strFilePath = null;
			try {
				// CSV�쐬
				setSyslogConfig("_csvList.size [" + _csvList.size() + "]");
				csvWriter.write(_csvList, CoreTools.getLocale(struct.getsUser_ID()),true);
				strFilePath = csvWriter.getFilePath();
				setSyslogConfig("Completion of CSV-data output.");

				// �o�̓t�@�C���p�X�ݒ�
				struct.setDOWNLOAD_FILE(strFilePath);
			}
			catch(Exception e)
			{
				// CSV�o�͎��s
				ExpjMessage emsg = setExceptionMessage("ZZ01107");
				ExpjException ee = new ExpjException(e, emsg);
				if("1".equals(getJOB_ODR_CD_STOCK_flg()) == true)
				{
					// ����
					setExceptionParameter("T_JOB_ODR_CD_INV.INV_DATE:" + struct.getINV_DATE());
					setExceptionParameter("T_JOB_ODR_CD_INV.PLANT_CD:" + struct.getPLANT_CD());
					setExceptionParameter("T_JOB_ODR_CD_INV.ITEM_CD:" + struct.getw_ITEM_CD());
					setExceptionParameter("T_JOB_ODR_CD_INV.WH_CD:" + struct.getw_WH_CD());
					setExceptionParameter("T_JOB_ODR_CD_INV.JOB_ODR_CD:" + struct.getw_JOB_ODR_CD());
					setExceptionParameter("M_ITEM.ABC_TYP:" + struct.gets_ABC_TYP());
					setExceptionParameter("DIFFERENCE_RATE:" + struct.getw_difference_rate());
				}
				else
				{
					if(struct.getr2_whlot1()!=null 
                            && (("1".equals(struct.getr2_whlot1()) == true)
                                    || (struct.getr2_whlot1().equals("true")))){
						// �i��
						setExceptionParameter("T_ITEM_INV.INV_DATE:" + struct.getINV_DATE());
						setExceptionParameter("T_ITEM_INV.PLANT_CD:" + struct.getPLANT_CD());
						setExceptionParameter("T_ITEM_INV.ITEM_CD:" + struct.getw_ITEM_CD());
						setExceptionParameter("T_ITEM_INV.WH_CD:" + struct.getw_WH_CD());
						setExceptionParameter("M_ITEM.ABC_TYP:" + struct.gets_ABC_TYP());
						setExceptionParameter("DIFFERENCE_RATE:" + struct.getw_difference_rate());
					}
					else if (struct.getr2_whlot2()!=null 
                            && (("1".equals(struct.getr2_whlot2()) == true)
                                    || (struct.getr2_whlot2().equals("true")))){
						// ���b�g
						setExceptionParameter("T_LOT_INV.INV_DATE:" + struct.getINV_DATE());
						setExceptionParameter("T_LOT_INV.PLANT_CD:" + struct.getPLANT_CD());
						setExceptionParameter("T_LOT_INV.ITEM_CD:" + struct.getw_ITEM_CD());
						setExceptionParameter("T_LOT_INV.WH_CD:" + struct.getw_WH_CD());
						setExceptionParameter("T_LOT_INV.LOT_NO:" + struct.getw_STOCK_LOT_CD());
						setExceptionParameter("T_LOT_INV.ABC_TYP:" + struct.gets_ABC_TYP());
						setExceptionParameter("DIFFERENCE_RATE:" + struct.getw_difference_rate());
					}

				}
				throw ee;
			}
		}
		//---------------------------------------------------------------------
                //}}user_implement_dev:<controlcsv_export>
		logger.exiting("AH0060010Control"+":USER="+struct.getsUser_ID(),"controlcsv_export");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0060");
		logger.entering("AH0060010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
		//------------------------------------------------------------------
		// struct������
		struct.initializeParent();

		// ���X�g�N���A
		list.clear();
		_listData.clear();

		// ������Ԃ��u������ԁv�ɐݒ�
		setReadStatus(INITIAL);

		//------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AH0060010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * ���[�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlPrint() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0060");
		logger.entering("AH0060010Control"+":USER="+struct.getsUser_ID(),"controlPrint");
			AH0060010Struct strPdf = null;

		int ret = 0;
		String printType      = getPdfOutputType();
		String printPattern   = getPdfOutputListPattern();
		String printer        = getPdfOutputPrinter();
		SvfWrapper svf        = new SvfWrapper(printType, getsysUSER_CD(), printer);

			//{{user_implement_dev:<controlPrint>
		//---------------------------------------------------------------------
		try {
			struct.setDOWNLOAD_FILE(null);	// �_�E�����[�h�t�@�C�����N���A
			///////////////////////////////////////////////////////////////////////////////
			String printId1 = getFormFileName(struct);	// ���[ID���w�肵�Ă�������
			///////////////////////////////////////////////////////////////////////////////
			ret = svf.VrInit(printId1);	// PDF�쐬�J�n
			ret = svf.VrSetDocName2("���i�\���䒠");	// �X�v�[���\���̕������̎w��
			pdfFilePath = svf.getPdfFilePath();	// pdf�t���p�X�t�@�C����
			pdfFileName = svf.getPdfFileName();	// pdf�t�@�C�����iWeb�p�j
			String excuteOutput = svf.getExcuteOutput();	// �T�[�o�o�͏���

			frmFileName = new String(printId1 + ".frm");	// frm�t�@�C����
		
			///////////////////////////////////////////////////////////////////////////////
			setSyslogConfig("printType [" + printType + "]");
			setSyslogConfig("printPattern [" + printPattern + "]");
			setSyslogConfig("pdfFilePath [" + pdfFilePath + "]");
			setSyslogConfig("pdfFileName [" + pdfFileName + "]");
			setSyslogConfig("frmFileName [" + frmFileName + "]");
			setSyslogConfig("excuteOutput [" + excuteOutput + "]");
			///////////////////////////////////////////////////////////////////////////////
			// �o�͑Ώۃf�[�^���Ȃ��ꍇ�͉������Ȃ�
			if(_listData == null || _listData.size() <= 0)
			{
				return;
			}
			///////////////////////////////////////////////////////////////////////////////
			if(ret != 0)
			{
				setSyslogConfig("Form-file not found.("+ ret +") [" + frmFileName + "]");
			}
			// PDF�o�̓f�[�^�ݒ�
			
			 /*�N�G���[�t�@�C���̎w��*/
			if (dbKIND != null && !dbKIND.equals("")) {
				ret = svf.VrSetQuery("KIND=" + dbKIND + ";UID=" + dbUID
						+ ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);
			} else {
				ret = svf.VrSetQuery("UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ="
						+ dbDBQ);
			}
			
			 // �V�X�e���H�ꖼ��
		    if (getsysPLANT_NAME() == null|| "".equals(getsysPLANT_NAME())) {
		    	ret = svf.VrCondition("[X|sysPLANT_NAME_flg]=" + "0" ,4);
		    	ret = svf.VrCondition("[X|sysPLANT_NAME]=" + "%", 4);
			} else {
				ret = svf.VrCondition("[X|sysPLANT_NAME_flg]=" + "1" ,4);
				ret = svf.VrCondition("[X|sysPLANT_NAME]=" + getsysPLANT_NAME(), 4);
			}
		    // �V�X�e���H��R�[�h
		    ret = svf.VrCondition("[X|sysPLANT_CD]=" + getsysPLANT_CD(), 4);
		    // �I����
		    ret = svf.VrCondition("[X|INV_DATE]=" + struct.getINV_DATE(), 4);
		    // �i�ڔԍ�
		    if (struct.getw_ITEM_CD() == null|| "".equals(struct.getw_ITEM_CD())) {
		    	ret = svf.VrCondition("[X|w_ITEM_CD_flg]=" + "0" ,4);
		    	ret = svf.VrCondition("[X|w_ITEM_CD]=" + "%", 4);
			} else {
				ret = svf.VrCondition("[X|w_ITEM_CD_flg]=" + "1" ,4);
				ret = svf.VrCondition("[X|w_ITEM_CD]=" + struct.getw_ITEM_CD(), 4);
			}
		    // �ۊǋ�ԍ�
		    if (struct.getw_WH_CD() == null|| "".equals(struct.getw_WH_CD())) {
		    	ret = svf.VrCondition("[X|w_WH_CD_flg]=" + "0" ,4);
		    	ret = svf.VrCondition("[X|w_WH_CD]=" + "%", 4);
			} else {
				ret = svf.VrCondition("[X|w_WH_CD_flg]=" + "1" ,4);
				ret = svf.VrCondition("[X|w_WH_CD]=" + struct.getw_WH_CD(), 4);
			}
		    // �I���敪 
		    if (struct.gets_ABC_TYP() == null|| "".equals(struct.gets_ABC_TYP())) {
		    	ret = svf.VrCondition("[X|s_ABC_TYP_flg]=" + "0" ,4);
		    	ret = svf.VrCondition("[X|s_ABC_TYP]=" + "%", 4);
			} else {
				ret = svf.VrCondition("[X|s_ABC_TYP_flg]=" + "1" ,4);
				ret = svf.VrCondition("[X|s_ABC_TYP]=" + struct.gets_ABC_TYP(), 4);
			}
		    // ���ٗ�
		    ret = svf.VrCondition("[X|w_DIFFERENCE_RATE]=" + struct.getw_difference_rate(), 4);
			// �ۑ�����
			if (struct.getSTOCK_SAVE_DATE() == null|| "".equals(struct.getSTOCK_SAVE_DATE())) {
				ret = svf.VrCondition("[X|STOCK_SAVE_DATE]=" + "9999/99/99", 4);
			} else {
				ret = svf.VrCondition("[X|STOCK_SAVE_DATE]=" + struct.getSTOCK_SAVE_DATE(), 4);
			}
			if("1".equals(getJOB_ODR_CD_STOCK_flg()) == true)
			{
				// ���Ԑ�p
			    if (struct.getw_JOB_ODR_CD() == null|| "".equals(struct.getw_JOB_ODR_CD())) {
			    	ret = svf.VrCondition("[X|w_JOB_ODR_CD_flg]=" + "0" ,4);
			    	ret = svf.VrCondition("[X|w_JOB_ODR_CD]=" + "%", 4);
				} else {
					ret = svf.VrCondition("[X|w_JOB_ODR_CD_flg]=" + "1" ,4);
					ret = svf.VrCondition("[X|w_JOB_ODR_CD]=" + struct.getw_JOB_ODR_CD(), 4);
				}
			}
            // Lot�݌�
            if( struct.getr2_whlot2()!=null
                    && (("1".equals(struct.getr2_whlot2()) == true)
                            || (struct.getr2_whlot2().equals("true")))){
            	if(struct.getw_STOCK_LOT_CD() == null || "".equals(struct.getw_STOCK_LOT_CD())){
            		ret = svf.VrCondition("[X|w_STOCK_LOT_CD]=" + "%", 4);	
            	} else {
            		ret = svf.VrCondition("[X|w_STOCK_LOT_CD]=" + struct.getw_STOCK_LOT_CD(), 4);
            	}           	                 
            }
			 /*�N�G���[���s*/
			ret = svf.VrReport();
			if (ret == -554) {
				ExpjMessage emsg = new ExpjMessage("ZZ06001");
				msgStruct.addError(emsg);
				sysLog.warning(emsg, sysUSER_CD);
				return;
			}
			
			ret = svf.VrQuit();								// PDF�쐬�I��
			///////////////////////////////////////////////////////////////////////////////
			if(ret < 0)
			{
				setSyslogConfig("Error : VrQuit (" + ret + ")");
			}
			///////////////////////////////////////////////////////////////////////////////

			if ( "0".equals(printType) ) {	// �N���C�A���g����̏ꍇ
				struct.setDOWNLOAD_FILE(getPdfFileName());
			}
			else if ( "1".equals(printType) ) {
				try {
					String acrobatPath = svf.getAcrobatPath();
					String acrobatOption1 = svf.getAcrobatOption1();
					String acrobatOption2 = svf.getAcrobatOption2();
					String pdfPrinter = svf.getPrinter();
					Runtime.getRuntime().exec(new String[]{acrobatPath, acrobatOption1, acrobatOption2, pdfFilePath, pdfPrinter});
					//Runtime.getRuntime().exec(excuteOutput);
				}catch(IOException e){
					// �T�[�o������s���̃G���[�������L�q���Ă��������B
				}
			}

//			objMessage.m_writer.write(Level.INFO, "file=" + svf.VrGetSpoolFileName() + "�ɏo��");
			///////////////////////////////////////////////////////////////////////////////
			setSyslogConfig("Completion of PDF-data output.");
			///////////////////////////////////////////////////////////////////////////////
			
		} catch (Exception e) {
			e.printStackTrace();
			setErrorMessage("ZZ01106");
		} 
			
                //}}user_implement_dev:<controlPrint>
		logger.exiting("AH0060010Control"+":USER="+struct.getsUser_ID(),"controlPrint");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0060");
		logger.entering("AH0060010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AH0060010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0060");
		logger.entering("AH0060010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
        //------------------------------------------------------------------
		try {
			// ���I�ꗗ��p�N���X�I�u�W�F�N�g����
			_common = new AH0060Common();
			if(_common.init(conn, getsysPLANT_CD()) != true)
			{
				// �G���[����
				ExpjMessage emsg = setExceptionMessage("ZZ01106");
				ExpjException ee = new ExpjException(emsg);
				setExceptionParameter("Initialize Error");
				throw ee;
			}

			// �R���{�f�[�^�̎擾
			ComboBox controller = new ComboBox(conn, sysUSER_CD);
			ComboStruct cmboAbcTyp	 = controller.getData("ABC_TYP");		// �I���敪
			
			// ���b�g�Ǘ������σ`�F�b�N
			if(LotCtrl.checkLotCtrl(conn)){
			    struct.seth_lotCtrl("true");
			    lotCtrl = "true";
			}else{
				struct.seth_lotCtrl("false");
				lotCtrl = "false";
			}
			
			// ��ʗp�u�I���敪�v�R���{�{�b�N�X���X�g�f�[�^�쐬
			makeAbcTypComboData(cmboAbcTyp);

			// �I���A�N�Z�b�T�N���X�I�u�W�F�N�g����
			_invAccessor = new InvAccessor(getsysPLANT_CD());

			// �N���A����
			controlclear();

		}catch(SQLException e){
			setSqlExceptionMsg(e);

		}catch(ComboException e){
			// �G���[�������L�q���Ă��������B
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;

		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AH0060010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0060");
		logger.entering("AH0060010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
		struct.setDOWNLOAD_FILE((String)null);	// �_�E�����[�h�t�@�C�����N���A
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
			// �_�E�����[�h�t�@�C�����N���A
			// PDF�ECSV�̃_�E�����[�h���s���Ƃ��́A��ʏ��OrHidden�ŁuDOWNLOAD_FILE�v���`���A���̍s�̃R�����g���O���Ă��������B
			struct.setDOWNLOAD_FILE((String)null);
			// �R���{�{�b�N�X���i�̃f�[�^�̃Z�b�g�͂����ɋL�q���Ă��������B
			// �R���{�{�b�N�X�f�[�^�p��
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AH0060010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("csv_export") ) {
				controlcsv_export();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("Print") ) {
				controlPrint();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
		//---------------------------------------------------------------------
			struct.setList_s_ABC_TYP_val(_comboAbcTyp.getValList());
			struct.setList_s_ABC_TYP_name(_comboAbcTyp.getExplanList());
			struct.seth_lotCtrl(lotCtrl);
  		} catch(AlarmMessageException ame){
			//ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
			//throw ee;
		//---------------------------------------------------------------------
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// �g���b�Z�[�W�o�͈˗��쐬
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AH0060010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0060010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AH0060010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0060010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AH0060010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0060010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AH0060010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AH0060010Entity entity;
	protected AH0060010Struct struct;
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

		entity = new AH0060010Entity();
		struct = new AH0060010Struct();

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
	 * AH0060010�N���X�̕W���R���X�g���N�^
	 */
	public AH0060010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
		//---------------------------------------------------------------------
		list = new ArrayList(0);
		try {
			ResourceBundle bundle = SystemConfig.getBundle();
			dbUID = SystemConfig.getProperty("CONNECT_DBUSER", bundle);
			dbPWD = SystemConfig.getProperty("CONNECT_DBPASS", bundle);
			dbDBQ = SystemConfig.getProperty("CONNECT_DBHOST", bundle);
			dbKIND = SystemConfig.getProperty("CONNECT_KIND", bundle);
		} catch(MissingResourceException e) {
			e.printStackTrace();
		}
		//---------------------------------------------------------------------
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
				AH0060010Struct key = (AH0060010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("w_INV_status") && key.getw_INV_status() != null) {
					msgKey.setKeyValue("w_INV_status", key.getw_INV_status());
				}
				if(msgKeyType.containsKeyColumn("w_WH_CD") && key.getw_WH_CD() != null) {
					msgKey.setKeyValue("w_WH_CD", key.getw_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_CD") && key.getw_ITEM_CD() != null) {
					msgKey.setKeyValue("w_ITEM_CD", key.getw_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("FINAL_BOOK_STOCK_QTY") && key.getFINAL_BOOK_STOCK_QTY() != null) {
					msgKey.setKeyValue("FINAL_BOOK_STOCK_QTY", key.getFINAL_BOOK_STOCK_QTY());
				}
				if(msgKeyType.containsKeyColumn("ACTUAL_STOCK_QTY") && key.getACTUAL_STOCK_QTY() != null) {
					msgKey.setKeyValue("ACTUAL_STOCK_QTY", key.getACTUAL_STOCK_QTY());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("SAFETY_STOCK") && key.getSAFETY_STOCK() != null) {
					msgKey.setKeyValue("SAFETY_STOCK", key.getSAFETY_STOCK());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_ANAME") && key.getVEND_ANAME() != null) {
					msgKey.setKeyValue("VEND_ANAME", key.getVEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("difference_rate") && key.getdifference_rate() != null) {
					msgKey.setKeyValue("difference_rate", key.getdifference_rate());
				}
				if(msgKeyType.containsKeyColumn("w_MRP_ODR_TYP") && key.getw_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("w_MRP_ODR_TYP", key.getw_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_ABC_TYP") && key.getw_ABC_TYP() != null) {
					msgKey.setKeyValue("w_ABC_TYP", key.getw_ABC_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_MRP_FLG") && key.getw_MRP_FLG() != null) {
					msgKey.setKeyValue("w_MRP_FLG", key.getw_MRP_FLG());
				}
				if(msgKeyType.containsKeyColumn("w_WH_TYP") && key.getw_WH_TYP() != null) {
					msgKey.setKeyValue("w_WH_TYP", key.getw_WH_TYP());
				}
				if(msgKeyType.containsKeyColumn("s_ABC_TYP") && key.gets_ABC_TYP() != null) {
					msgKey.setKeyValue("s_ABC_TYP", key.gets_ABC_TYP());
				}
				if(msgKeyType.containsKeyColumn("s_ABC_TYP_name") && key.gets_ABC_TYP_name() != null) {
					msgKey.setKeyValue("s_ABC_TYP_name", key.gets_ABC_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("s_ABC_TYP_val") && key.gets_ABC_TYP_val() != null) {
					msgKey.setKeyValue("s_ABC_TYP_val", key.gets_ABC_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("c_JOB_ODR_CD_STOCK_flg") && key.getc_JOB_ODR_CD_STOCK_flg() != null) {
					msgKey.setKeyValue("c_JOB_ODR_CD_STOCK_flg", key.getc_JOB_ODR_CD_STOCK_flg());
				}
				if(msgKeyType.containsKeyColumn("h_JOB_ODR_CD_STOCK_flg") && key.geth_JOB_ODR_CD_STOCK_flg() != null) {
					msgKey.setKeyValue("h_JOB_ODR_CD_STOCK_flg", key.geth_JOB_ODR_CD_STOCK_flg());
				}
				if(msgKeyType.containsKeyColumn("h_sort_flg") && key.geth_sort_flg() != null) {
					msgKey.setKeyValue("h_sort_flg", key.geth_sort_flg());
				}
				if(msgKeyType.containsKeyColumn("w_JOB_ODR_CD") && key.getw_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("w_JOB_ODR_CD", key.getw_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("w_difference_rate") && key.getw_difference_rate() != null) {
					msgKey.setKeyValue("w_difference_rate", key.getw_difference_rate());
				}
				if(msgKeyType.containsKeyColumn("r1_sort1") && key.getr1_sort1() != null) {
					msgKey.setKeyValue("r1_sort1", key.getr1_sort1());
				}
				if(msgKeyType.containsKeyColumn("r1_sort2") && key.getr1_sort2() != null) {
					msgKey.setKeyValue("r1_sort2", key.getr1_sort2());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("h_save_sort_flg") && key.geth_save_sort_flg() != null) {
					msgKey.setKeyValue("h_save_sort_flg", key.geth_save_sort_flg());
				}
				if(msgKeyType.containsKeyColumn("w_STOCK_LOT_CD") && key.getw_STOCK_LOT_CD() != null) {
					msgKey.setKeyValue("w_STOCK_LOT_CD", key.getw_STOCK_LOT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_STOCK_LOT_CD") && key.getl_STOCK_LOT_CD() != null) {
					msgKey.setKeyValue("l_STOCK_LOT_CD", key.getl_STOCK_LOT_CD());
				}
				if(msgKeyType.containsKeyColumn("h_lotCtrl") && key.geth_lotCtrl() != null) {
					msgKey.setKeyValue("h_lotCtrl", key.geth_lotCtrl());
				}
				if(msgKeyType.containsKeyColumn("r2_whlot1") && key.getr2_whlot1() != null) {
					msgKey.setKeyValue("r2_whlot1", key.getr2_whlot1());
				}
				if(msgKeyType.containsKeyColumn("r2_whlot2") && key.getr2_whlot2() != null) {
					msgKey.setKeyValue("r2_whlot2", key.getr2_whlot2());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("MRP_FLG") && key.getMRP_FLG() != null) {
					msgKey.setKeyValue("MRP_FLG", key.getMRP_FLG());
				}
				if(msgKeyType.containsKeyColumn("WH_TYP") && key.getWH_TYP() != null) {
					msgKey.setKeyValue("WH_TYP", key.getWH_TYP());
				}
				if(msgKeyType.containsKeyColumn("ABC_TYP") && key.getABC_TYP() != null) {
					msgKey.setKeyValue("ABC_TYP", key.getABC_TYP());
				}
				if(msgKeyType.containsKeyColumn("INV_DATE") && key.getINV_DATE() != null) {
					msgKey.setKeyValue("INV_DATE", key.getINV_DATE());
				}
				if(msgKeyType.containsKeyColumn("REGULAR_INV_FLG") && key.getREGULAR_INV_FLG() != null) {
					msgKey.setKeyValue("REGULAR_INV_FLG", key.getREGULAR_INV_FLG());
				}
				if(msgKeyType.containsKeyColumn("CYCLE_INV_FLG") && key.getCYCLE_INV_FLG() != null) {
					msgKey.setKeyValue("CYCLE_INV_FLG", key.getCYCLE_INV_FLG());
				}
				if(msgKeyType.containsKeyColumn("TEMP_INV_FLG") && key.getTEMP_INV_FLG() != null) {
					msgKey.setKeyValue("TEMP_INV_FLG", key.getTEMP_INV_FLG());
				}
				if(msgKeyType.containsKeyColumn("INV_STS_TYP") && key.getINV_STS_TYP() != null) {
					msgKey.setKeyValue("INV_STS_TYP", key.getINV_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("INV_START_DATE") && key.getINV_START_DATE() != null) {
					msgKey.setKeyValue("INV_START_DATE", key.getINV_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("STOCK_SAVE_DATE") && key.getSTOCK_SAVE_DATE() != null) {
					msgKey.setKeyValue("STOCK_SAVE_DATE", key.getSTOCK_SAVE_DATE());
				}
				if(msgKeyType.containsKeyColumn("INV_UPDATED_DATE") && key.getINV_UPDATED_DATE() != null) {
					msgKey.setKeyValue("INV_UPDATED_DATE", key.getINV_UPDATED_DATE());
				}
				if(msgKeyType.containsKeyColumn("INV_COMMENT") && key.getINV_COMMENT() != null) {
					msgKey.setKeyValue("INV_COMMENT", key.getINV_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
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
					AH0060010Struct key = new AH0060010Struct();
					if(msgKeyType.containsKeyColumn("w_INV_status")) {
						key.setw_INV_status(msgKey.getKeyValue("w_INV_status"));
					}
					if(msgKeyType.containsKeyColumn("w_WH_CD")) {
						key.setw_WH_CD(msgKey.getKeyValue("w_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_CD")) {
						key.setw_ITEM_CD(msgKey.getKeyValue("w_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("FINAL_BOOK_STOCK_QTY")) {
						key.setFINAL_BOOK_STOCK_QTY(msgKey.getKeyValue("FINAL_BOOK_STOCK_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ACTUAL_STOCK_QTY")) {
						key.setACTUAL_STOCK_QTY(msgKey.getKeyValue("ACTUAL_STOCK_QTY"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("SAFETY_STOCK")) {
						key.setSAFETY_STOCK(msgKey.getKeyValue("SAFETY_STOCK"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_ANAME")) {
						key.setVEND_ANAME(msgKey.getKeyValue("VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("difference_rate")) {
						key.setdifference_rate(msgKey.getKeyValue("difference_rate"));
					}
					if(msgKeyType.containsKeyColumn("w_MRP_ODR_TYP")) {
						key.setw_MRP_ODR_TYP(msgKey.getKeyValue("w_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_ABC_TYP")) {
						key.setw_ABC_TYP(msgKey.getKeyValue("w_ABC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_MRP_FLG")) {
						key.setw_MRP_FLG(msgKey.getKeyValue("w_MRP_FLG"));
					}
					if(msgKeyType.containsKeyColumn("w_WH_TYP")) {
						key.setw_WH_TYP(msgKey.getKeyValue("w_WH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("s_ABC_TYP")) {
						key.sets_ABC_TYP(msgKey.getKeyValue("s_ABC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("s_ABC_TYP_name")) {
						key.sets_ABC_TYP_name(msgKey.getKeyValue("s_ABC_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("s_ABC_TYP_val")) {
						key.sets_ABC_TYP_val(msgKey.getKeyValue("s_ABC_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("c_JOB_ODR_CD_STOCK_flg")) {
						key.setc_JOB_ODR_CD_STOCK_flg(msgKey.getKeyValue("c_JOB_ODR_CD_STOCK_flg"));
					}
					if(msgKeyType.containsKeyColumn("h_JOB_ODR_CD_STOCK_flg")) {
						key.seth_JOB_ODR_CD_STOCK_flg(msgKey.getKeyValue("h_JOB_ODR_CD_STOCK_flg"));
					}
					if(msgKeyType.containsKeyColumn("h_sort_flg")) {
						key.seth_sort_flg(msgKey.getKeyValue("h_sort_flg"));
					}
					if(msgKeyType.containsKeyColumn("w_JOB_ODR_CD")) {
						key.setw_JOB_ODR_CD(msgKey.getKeyValue("w_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_difference_rate")) {
						key.setw_difference_rate(msgKey.getKeyValue("w_difference_rate"));
					}
					if(msgKeyType.containsKeyColumn("r1_sort1")) {
						key.setr1_sort1(msgKey.getKeyValue("r1_sort1"));
					}
					if(msgKeyType.containsKeyColumn("r1_sort2")) {
						key.setr1_sort2(msgKey.getKeyValue("r1_sort2"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("h_save_sort_flg")) {
						key.seth_save_sort_flg(msgKey.getKeyValue("h_save_sort_flg"));
					}
					if(msgKeyType.containsKeyColumn("w_STOCK_LOT_CD")) {
						key.setw_STOCK_LOT_CD(msgKey.getKeyValue("w_STOCK_LOT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_STOCK_LOT_CD")) {
						key.setl_STOCK_LOT_CD(msgKey.getKeyValue("l_STOCK_LOT_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_lotCtrl")) {
						key.seth_lotCtrl(msgKey.getKeyValue("h_lotCtrl"));
					}
					if(msgKeyType.containsKeyColumn("r2_whlot1")) {
						key.setr2_whlot1(msgKey.getKeyValue("r2_whlot1"));
					}
					if(msgKeyType.containsKeyColumn("r2_whlot2")) {
						key.setr2_whlot2(msgKey.getKeyValue("r2_whlot2"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MRP_FLG")) {
						key.setMRP_FLG(msgKey.getKeyValue("MRP_FLG"));
					}
					if(msgKeyType.containsKeyColumn("WH_TYP")) {
						key.setWH_TYP(msgKey.getKeyValue("WH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ABC_TYP")) {
						key.setABC_TYP(msgKey.getKeyValue("ABC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("INV_DATE")) {
						key.setINV_DATE(msgKey.getKeyValue("INV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("REGULAR_INV_FLG")) {
						key.setREGULAR_INV_FLG(msgKey.getKeyValue("REGULAR_INV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("CYCLE_INV_FLG")) {
						key.setCYCLE_INV_FLG(msgKey.getKeyValue("CYCLE_INV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("TEMP_INV_FLG")) {
						key.setTEMP_INV_FLG(msgKey.getKeyValue("TEMP_INV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("INV_STS_TYP")) {
						key.setINV_STS_TYP(msgKey.getKeyValue("INV_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("INV_START_DATE")) {
						key.setINV_START_DATE(msgKey.getKeyValue("INV_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_SAVE_DATE")) {
						key.setSTOCK_SAVE_DATE(msgKey.getKeyValue("STOCK_SAVE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("INV_UPDATED_DATE")) {
						key.setINV_UPDATED_DATE(msgKey.getKeyValue("INV_UPDATED_DATE"));
					}
					if(msgKeyType.containsKeyColumn("INV_COMMENT")) {
						key.setINV_COMMENT(msgKey.getKeyValue("INV_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
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
