/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AG0020/src/com/nec/jp/orteus/metamorBase/AG0020/AG0020010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AG0020;

import com.nec.jp.orteus.metamorBase.AG0020.*;
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
//------------------------------------------------------------------------------
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
import com.nec.jp.orteus.metamorBase.common.util.ScreenParam;
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.LotCtrl;

import java.text.SimpleDateFormat;
import java.text.ParseException;
//------------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AG0020010Control
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
	public AG0020010Struct getListvalue(int x) { return (AG0020010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AG0020010Struct getStruct() { return this.struct; }	// Struct��Ԃ��܂��B
	public AG0020010Struct createStruct() { return new AG0020010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AG0020010Struct)structname); }	// Struct���Z�b�g���܂��B
//	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

//------------------------------------------------------------------------------

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


//---------- �b�r�u�o�͊֘A�̏��� ---------------------------------------------------

	private List csvList = null;
	public List getCsvList(){ return this.csvList; }

	/** �ꗗ���i�[�p���X�g */
	List _listData = new ArrayList(0);


//---------- �R���{�{�b�N�X�f�[�^�擾�֘A�̏��� -------------------------------

	/** �i�ڎ�z�敪 */
	ComboStruct _MRP_ODR_TYP = new ComboStruct();

	/** �i�ڎ�z�敪�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setMRP_ODR_TYP_comb(ComboStruct combo){ _MRP_ODR_TYP = combo; }

	/** �i�ڎ�z�敪�擾
	 * @return �i�ڎ�z�敪�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getMRP_ODR_TYP_comb(){ return _MRP_ODR_TYP; }


	/** ���o�ɋ敪 */
	ComboStruct _RCV_ISSUE_TYP = new ComboStruct();

	/** ���o�ɋ敪�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setRCV_ISSUE_TYP_comb(ComboStruct combo){ _RCV_ISSUE_TYP = combo; }

	/** ���o�ɋ敪�擾
	 * @return ���o�ɋ敪�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getRCV_ISSUE_TYP_comb(){ return _RCV_ISSUE_TYP; }


	/** ���o�ɔ����敪 */
	ComboStruct _RCV_ISSUE_GNR_TYP = new ComboStruct();

	/** ���o�ɔ����敪�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setRCV_ISSUE_GNR_TYP_comb(ComboStruct combo){ _RCV_ISSUE_GNR_TYP = combo; }

	/** ���o�ɔ����敪�擾
	 * @return ���o�ɔ����敪�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getRCV_ISSUE_GNR_TYP_comb(){ return _RCV_ISSUE_GNR_TYP; }


	/** �݌ɍX�V�敪 */
	ComboStruct _STOCK_UPD_TYP = new ComboStruct();

	/** �݌ɍX�V�敪�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setSTOCK_UPD_TYP_comb(ComboStruct combo){ _STOCK_UPD_TYP = combo; }

	/** �݌ɍX�V�敪�擾
	 * @return �݌ɍX�V�敪�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getSTOCK_UPD_TYP_comb(){ return _STOCK_UPD_TYP; }


	/** ���o�Ɋ����t���O */
	ComboStruct _RCV_ISSUE_CMPLT_FLG = new ComboStruct();

	/** ���o�Ɋ����t���O�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setRCV_ISSUE_CMPLT_FLG_comb(ComboStruct combo){ _RCV_ISSUE_CMPLT_FLG = combo; }

	/** ���o�Ɋ����t���O�擾
	 * @return ���o�Ɋ����t���O�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getRCV_ISSUE_CMPLT_FLG_comb(){ return _RCV_ISSUE_CMPLT_FLG; }


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

		_usersIntialized = true;
		return ;
	}


//------------------------------------------------------------------------
	/**
	 * �R���{�{�b�N�X�̒��g���擾���܂��B
	 *
	 * @param data �f�[�^�̔�
	 */
	 private void setComboData(AG0020010Struct data) throws ExpjException
	 {
			ComboBox controller = new ComboBox(conn, sysUSER_CD);
		try{
			//�R���{�f�[�^�̎擾
			ComboStruct MRP_ODR_TYP_comb = controller.getData("MRP_ODR_TYP");
			ComboStruct RCV_ISSUE_TYP_comb = controller.getData("RCV_ISSUE_TYP");
			ComboStruct RCV_ISSUE_GNR_TYP_comb = controller.getData("RCV_ISSUE_GNR_TYP");
			ComboStruct STOCK_UPD_TYP_comb = controller.getData("STOCK_UPD_TYP");
			ComboStruct RCV_ISSUE_CMPLT_FLG_comb = controller.getData("RCV_ISSUE_CMPLT_FLG");

			controller.setConnection(null);

			//�����Ɏ擾�f�[�^�ݒ�
			setMRP_ODR_TYP_comb(MRP_ODR_TYP_comb);
			setRCV_ISSUE_TYP_comb(RCV_ISSUE_TYP_comb);
			setRCV_ISSUE_GNR_TYP_comb(RCV_ISSUE_GNR_TYP_comb);
			setSTOCK_UPD_TYP_comb(STOCK_UPD_TYP_comb);
			setRCV_ISSUE_CMPLT_FLG_comb(RCV_ISSUE_CMPLT_FLG_comb);

		}catch(SQLException e) {
			setSqlExceptionMsg(e);

		}catch(ComboException e){
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}
	}

	//-------------------------------------------------------------------------
	/**
	 * �O���I�[�_�Q�Ƃ̃t���O�̕\����ݒ�
	 * @param s �t���O�̒l���ݒ肳��Ă�����
	 */
	private void setTypeValueAboutProcGroup(AG0020010Struct s)
	{
		s.setMRP_ODR_NAME(getTypeName(_MRP_ODR_TYP,s.getMRP_ODR_TYP()));
		s.setRCV_ISSUE_NAME(getTypeName(_RCV_ISSUE_TYP,s.getRCV_ISSUE_TYP()));
		s.setRCV_ISSUE_GNR_NAME(getTypeName(_RCV_ISSUE_GNR_TYP,s.getRCV_ISSUE_GNR_TYP()));
		s.setSTOCK_UPD_NAME(getTypeName(_STOCK_UPD_TYP,s.getSTOCK_UPD_TYP()));
		s.setRCV_ISSUE_CMPLT_NAME(getTypeName(_RCV_ISSUE_CMPLT_FLG,s.getRCV_ISSUE_CMPLT_FLG()));
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
		
	//-------------------------------------------------------------------------

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


//------------------------------------------------------------------------------
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0020");
		logger.entering("AG0020010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
		//------------------------------------------------------------------
		// ���O�o�͏��i�[�p
		String logMessage = "";
		List listMessage = new ArrayList();

		setReadStatus(INITIAL);

		try {

			// �L�[���ڃ��O�\��
			logMessage = "T_RCV_ISSUE.PLANT_CD:" + struct.getw_PLANT_CD()
						+ ", T_RCV_ISSUE.RCV_ISSUE_DATE:" + struct.getw_FROM_DATE() + " - " + struct.getw_TO_DATE()
						+ ", T_RCV_ISSUE.ITEM_CD:" + struct.getw_ITEM_CD()
						+ ", T_RCV_ISSUE.JOB_ODR_CD:" + struct.getw_JOB_ODR_CD()
						+ ", T_RCV_ISSUE.WH_CD:" + struct.getw_WH_CD()
						+ ", T_RCV_ISSUE.RCV_ISSUE_TYP:" + struct.getw_CHOICE();
			setSyslogConfig(logMessage);

			// ���X�g�N���A
			if(list != null){
				list.clear();
				_listData.clear();
			}

			// ��ʍ��ڃN���A
          struct.setw_WH_NAME("");
          
          boolean existsPlantCd = false;
          struct.setw_PLANT_NAME("");
          struct.setw_VEND_NAME("");
          
		
			// �G���[�`�F�b�N
			// �H�ꂪ�w�肳�ꂽ�ꍇ
			if ((struct.getw_PLANT_CD() == null || ("").equals(struct.getw_PLANT_CD()) == true) == false) {
				// �H��̑��݃`�F�b�N
				List plantList = entity.mreadM_PLANT.read(conn, struct);
				if (plantList.size() <= 0) {
					// �Ǎ��������s�F�H��R�[�h�����݂��܂���
					logMessage = "M_PLANT.PLANT_CD:" + struct.getw_PLANT_CD();
					setErrorMessage("AG00001", logMessage);
				} else {
					existsPlantCd = true;
					AG0020010Struct plantStruct = (AG0020010Struct)plantList.get(0);
					// �H�ꖼ��ݒ�
					struct.setw_PLANT_NAME(plantStruct.getw_PLANT_NAME());
				}
			}
			
			// �G���[�`�F�b�N
			// �ۊǋ悪�w�肳�ꂽ�ꍇ
			if((struct.getw_WH_CD() == null || ("").equals(struct.getw_WH_CD()) == true) == false){
				//�ۊǋ�̑��݃`�F�b�N
				List workList = entity.mcheckM_WH.read(conn, struct);
				if(workList.size() <= 0) {
					// �Ǎ��������s�F�ۊǋ�R�[�h�����݂��܂���
					logMessage = "M_WH.WH_CD:" + struct.getw_WH_CD();
					setErrorMessage("AG00006", logMessage);
				}
				else{
					AG0020010Struct checkStruct = (AG0020010Struct)workList.get(0);

					// �ۊǋ於��ݒ�
					struct.setw_WH_NAME(checkStruct.getw_WH_NAME());

					// �H��R�[�h���w�肳�ꂽ�ꍇ
					// �ۊǋ�.�H��R�[�h �� �w�肳�ꂽ�H��R�[�h
					if (struct.getw_PLANT_CD() != null && struct.getw_PLANT_CD().equals("") == false && existsPlantCd == true) {
						if((checkStruct.getw_WH_PLANT_CD().equals(struct.getw_PLANT_CD())) == false){
							// �Ǎ��������s�F�ۊǋ�R�[�h�͑��̍H��̃f�[�^�Ȃ̂Ŏw��ł��܂���
							listMessage.add("M_WH.WH_CD:" + struct.getw_WH_CD());
							listMessage.add("M_WH.PLANT_CD:" + checkStruct.getw_WH_PLANT_CD());
							setErrorMessage("AG00007", listMessage);
							listMessage.clear();
						}
					}
				}
			}

          //�G���[�`�F�b�N
          //����悪�w�肳�ꂽ�ꍇ
          if ((struct.getw_VEND_CD() != null)  &&  (struct.getw_VEND_CD().equals("") != true)){
            List vendList = entity.mreadM_VEND_CTRL.read(conn, struct);
            if (vendList.size() <= 0 ) {
              //�Ǎ��������s�F�����R�[�h�����݂��܂���
              logMessage = "M_VEND_CTRL.VEND_CD:" + struct.getw_VEND_CD();
              setErrorMessage("AG00009", logMessage);
              
            } else {
              AG0020010Struct vendStruct = (AG0020010Struct)vendList.get(0);
              struct.setw_VEND_NAME(vendStruct.getw_VEND_NAME());
            }
          }

		 //�G���[�`�F�b�N
		 //�i�ڔԍ����w�肳�ꂽ�ꍇ
		 if ((struct.getw_ITEM_CD() != null)  &&  ("".equals(struct.getw_ITEM_CD())!= true)){
				List itemList = entity.mreadM_ITEM.read(conn, struct);
				if (itemList.size() <= 0 ) {
				//�Ǎ��������s�F�i�ڔԍ������݂��܂���
				logMessage = "M_ITEM.ITEM_CD:" + struct.getw_ITEM_CD();
				setErrorMessage("AG00003", logMessage);

				} else {
				AG0020010Struct itemStruct = (AG0020010Struct)itemList.get(0);
				struct.setw_ITEM_NAME(itemStruct.getw_ITEM_NAME());
				}
			}

          	//���o�ɐ��[�����܂ރ`�F�b�N�{�b�N�X�̒ǉ� 2006/06/14 up
			if(struct.getl_check().equals("true")){
				struct.setw_check("0");
			}else {
				struct.setw_check("");
			}//���o�ɐ��[�����܂ރ`�F�b�N�{�b�N�X�̒ǉ� 2006/06/14 end
			
			//�f�[�^�Ǎ�
			if(msgStruct.sizeError() <= 0){
				  // �\���ő�s����������
				ScreenParam sp = new ScreenParam(this.getClass());
				int maxLine = sp.getMaxLine(conn, 10);
				if (maxLine != 0)
					struct.setROW_COUNT(String.valueOf(maxLine));
				else
					struct.setROW_COUNT(null);
				    _listData = entity.mselectCnt.read(conn, struct);
				long rowCount = Long.parseLong(((AG0020010Struct) _listData.get(0)).getl_COUNT());

				// ��������0���̏ꍇ
				if(rowCount == 0){
					// �Ǎ��������s�F�������ʂ�0���ł�
					listMessage.add("T_RCV_ISSUE.PLANT_CD:" + struct.getw_PLANT_CD());
					listMessage.add("T_RCV_ISSUE.RCV_ISSUE_DATE:" + struct.getw_FROM_DATE() + " - " + struct.getw_TO_DATE());
					listMessage.add("T_RCV_ISSUE.ITEM_CD:" + struct.getw_ITEM_CD());
					listMessage.add("T_RCV_ISSUE.JOB_ODR_CD:" + struct.getw_JOB_ODR_CD());
					listMessage.add("T_RCV_ISSUE.WH_CD:" + struct.getw_WH_CD());
					listMessage.add("T_RCV_ISSUE.RCV_ISSUE_TYP:" + struct.getw_CHOICE());
                	listMessage.add("T_RCV_ISSUE.VEND_CD:" + struct.getw_VEND_CD()); 

					setErrorMessage("ZZ06001", listMessage);
					listMessage.clear();
					if(list != null && list.size() > 0){
						list.clear();
					}
					return;
				}else{
					if(maxLine != 0 && rowCount == maxLine + 1){
					setErrorMessage("ZZ01115", "", ""+maxLine);
					setReadStatus(TOO_MANY);
					if(list != null && list.size() > 0){
						list.clear();
					}
					return;
					}

			}
				_listData = entity.mselect.read(conn, struct);
				for(int i=0; i<_listData.size(); i++){
					// �R���{�{�b�N�X�̃f�[�^�ݒ�
					setTypeValueAboutProcGroup((AG0020010Struct)(_listData.get(i)));
				    }
					// �\���p���X�g�ɃZ�b�g
					setList(_listData);
					setReadStatus(NORMAL);
				}


		}catch(SQLException e){
			setSqlExceptionMsg(e);
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AG0020010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * CSV�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlcsv() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0020");
		logger.entering("AG0020010Control"+":USER="+struct.getsUser_ID(),"controlcsv");
			//{{user_implement_dev:<controlcsv>
		//------------------------------------------------------------------
		// ���O�o�͏��i�[�p
		String logMessage = "";
		List listMessage = new ArrayList();

		// CsvWriter�𐶐�
		csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));
       	String strFilePath = null;
			
		try {
				
			csvList = new ArrayList();

			// �ꗗ���i�[�p���X�g����Ǎ��f�[�^�ݒ�
			setList(_listData);

			// 0���̏ꍇ�I��
			if(list.size() <= 0) return;

			// CSV���̍쐬
			String title[] = {
				"Expj.PLANT_CD" ,
				"Expj.RCV_ISSUE_DATE" ,
				"Expj.ITEM_CD" ,
				"Expj.ITEM_NAME" ,
				"Expj.JOB_ODR_CD" ,
				"Expj.VEND_CD" ,
				"Expj.VEND_NAME" ,
				"Expj.WH_CD" ,
				"Expj.WH_NAME" ,
				"Expj.RCV_ISSUE_BEFORE_QTY" ,
				"Expj.RCV_ISSUE_QTY" ,
				"Expj.RCV_ISSUE_AFTER_QTY" ,
				"Expj.RCV_ISSUE_TYP" ,
				"Expj.Cmt1100" ,
				"Expj.RCV_ISSUE_GNR_TYP" ,
				"Expj.Cmt1101" ,
				"Expj.WORK_ODR_CD" ,
				"Expj.WORK_IN_PROC_CD" ,
				"Expj.PARTIAL_PRD_NO" ,
				"Expj.OPR_CRCT_NO_1" ,
				"Expj.PUCH_ODR_CD" ,
				"Expj.ACPT_NO" ,
				"Expj.ACPT_RSLT_CRCT_NO" ,
				"Expj.INSPEC_RSLT_CRCT_NO" ,
				"Expj.ISSUE_INST_CD" ,
				"Expj.RCV_ISSUE_CMPLT_FLG" ,
				"Expj.Cmt1099" ,
				"Expj.MRP_ODR_TYP" ,
				"Expj.Cmt1108" ,
				"Expj.RCV_ISSUE_CTRL_CD" ,
				"Expj.STOCK_UPD_TYP" ,
				"Expj.Cmt1042" ,
				"Expj.STOCK_LOT_CD" ,
				"Expj.VEND_LOT_NO" ,
				"Expj.Cmt6856" ,
				"Expj.CREATED_DATE_1" ,
				"Expj.CREATED_BY" 
			};
			csvList.add(title);
			for(int i=0;i<this.list.size();i++){
              AG0020010Struct tempStruct = (AG0020010Struct)this.list.get(i);
              if("false".equals(struct.geth_lotCtrl())){
            	  tempStruct.setLOT_NO("");
              }
              String csvStr [] = new String[title.length];
              csvStr[0] = tempStruct.getPLANT_CD();
              csvStr[1] = tempStruct.getRCV_ISSUE_DATE();
              csvStr[2] = tempStruct.getITEM_CD();
              csvStr[3] = tempStruct.getITEM_NAME();
              csvStr[4] = tempStruct.getJOB_ODR_CD();
              csvStr[5] = tempStruct.getVEND_CD();
              csvStr[6] = tempStruct.getVEND_NAME();
              csvStr[7] = tempStruct.getWH_CD();
              csvStr[8] = tempStruct.getWH_NAME();
              csvStr[9] = TypeConverter.convert(tempStruct.getRCV_ISSUE_BEFORE_QTY());
              csvStr[10] = TypeConverter.convert(tempStruct.getRCV_ISSUE_QTY());
              csvStr[11] = TypeConverter.convert(tempStruct.getRCV_ISSUE_AFTER_QTY());
              csvStr[12] = TypeConverter.convert(tempStruct.getRCV_ISSUE_TYP());
              csvStr[13] = tempStruct.getRCV_ISSUE_NAME();
              csvStr[14] = TypeConverter.convert(tempStruct.getRCV_ISSUE_GNR_TYP());
              csvStr[15] = tempStruct.getRCV_ISSUE_GNR_NAME();

              csvStr[16] = tempStruct.getWORK_ODR_CD();
              csvStr[17] = tempStruct.getWORK_IN_PROC_CD();
              csvStr[18] = TypeConverter.convert(tempStruct.getPARTIAL_PRD_NO());
              csvStr[19] = TypeConverter.convert(tempStruct.getOPR_RSLT_CRCT_NO());
              csvStr[20] = TypeConverter.convert(tempStruct.getPUCH_ODR_CD());
              csvStr[21] = TypeConverter.convert(tempStruct.getACPT_NO());
              csvStr[22] = TypeConverter.convert(tempStruct.getACPT_RSLT_CRCT_NO());
              csvStr[23] = TypeConverter.convert(tempStruct.getINSPEC_RSLT_CRCT_NO());
              csvStr[24] = tempStruct.getISSUE_INST_CD();
              csvStr[25] = TypeConverter.convert(tempStruct.getRCV_ISSUE_CMPLT_FLG());
              csvStr[26] = tempStruct.getRCV_ISSUE_CMPLT_NAME();
              
              csvStr[27] = TypeConverter.convert(tempStruct.getMRP_ODR_TYP());
              csvStr[28] = tempStruct.getMRP_ODR_NAME();
              
              csvStr[29] = TypeConverter.convert(tempStruct.getRCV_ISSUE_CTRL_CD());
              csvStr[30] = TypeConverter.convert(tempStruct.getSTOCK_UPD_TYP());
              csvStr[31] = tempStruct.getSTOCK_UPD_NAME();
              
              csvStr[32] = tempStruct.getLOT_NO();
              csvStr[33] = tempStruct.getVEND_LOT_NO();
              csvStr[34] = tempStruct.getRCV_ISSUE_COMMENT();
              csvStr[35] = tempStruct.getCREATED_DATE();
              csvStr[36] = tempStruct.getCREATED_BY();
              csvList.add(csvStr);
			}
			
			// CSV�쐬
			csvWriter.write(csvList, CoreTools.getLocale(struct.getsUser_ID()),true);
			strFilePath = csvWriter.getFilePath();
			
			logMessage = "Generated CSV-data.";
			setSyslogConfig(logMessage);
			
			// �o�̓t�@�C���p�X�ݒ�
			struct.setDOWNLOAD_FILE(strFilePath);
			
			// �\���s���I�[�o�ł̂b�r�u�o�͂̏ꍇ�͕\���p���X�g���N���A����
			if(getReadStatus() == TOO_MANY){
				this.list.clear();
			}

        }catch(Exception e){
			ExpjMessage msg = new ExpjMessage( "ZZ01006", "CSV output failure" );
			sysLog.warning(msg, getsysUSER_CD());

			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);

			throw ee;
        }
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlcsv>
		logger.exiting("AG0020010Control"+":USER="+struct.getsUser_ID(),"controlcsv");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0020");
		logger.entering("AG0020010Control"+":USER="+struct.getsUser_ID(),"controlclear");
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

		// ���O�C�����[�U�̍H��R�[�h��ݒ�
		struct.setw_PLANT_CD(sysPLANT_CD);
		
		// ���[�h�ݒ�
		setReadStatus(INITIAL);

		//------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AG0020010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * ���b�g�g���[�X�Q�ƃ{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelectLotTraceRef() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0020");
		logger.entering("AG0020010Control"+":USER="+struct.getsUser_ID(),"controlSelectLotTraceRef");
			//{{user_implement_dev:<controlSelectLotTraceRef>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlSelectLotTraceRef>
		logger.exiting("AG0020010Control"+":USER="+struct.getsUser_ID(),"controlSelectLotTraceRef");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0020");
		logger.entering("AG0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
		//------------------------------------------------------------------
		// ���[�U��`������
		usersInitialize();
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AG0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0020");
		logger.entering("AG0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		//------------------------------------------------------------------
		// ���[�U��`������
		usersInitialize();
		
		// ���O�C�����[�U�̍H��R�[�h��ݒ�
		struct.setw_PLANT_CD(sysPLANT_CD);
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
		
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AG0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0020");
		logger.entering("AG0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
		logger.exiting("AG0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("csv") ) {
				controlcsv();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("SelectLotTraceRef") ) {
				controlSelectLotTraceRef();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
		//------------------------------------------------------------------
		//�R���{�{�b�N�X�Ɏ擾�f�[�^�ݒ�
		struct.setList_MRP_ODR_TYP_val(_MRP_ODR_TYP.getValList());
		struct.setList_MRP_ODR_TYP_name(_MRP_ODR_TYP.getExplanList());
		struct.setList_RCV_ISSUE_TYP_val(_RCV_ISSUE_TYP.getValList());
		struct.setList_RCV_ISSUE_TYP_name(_RCV_ISSUE_TYP.getExplanList());
		struct.setList_RCV_ISSUE_GNR_TYP_val(_RCV_ISSUE_GNR_TYP.getValList());
		struct.setList_RCV_ISSUE_GNR_TYP_name(_RCV_ISSUE_GNR_TYP.getExplanList());
		struct.setList_STOCK_UPD_TYP_val(_STOCK_UPD_TYP.getValList());
		struct.setList_STOCK_UPD_TYP_name(_STOCK_UPD_TYP.getExplanList());
		struct.setList_RCV_ISSUE_CMPLT_FLG_val(_RCV_ISSUE_CMPLT_FLG.getValList());
		struct.setList_RCV_ISSUE_CMPLT_FLG_name(_RCV_ISSUE_CMPLT_FLG.getExplanList());
		struct.seth_lotCtrl(lotctrl);
//		�\�[�X���ɂ܂�AlarmMessageException���c���Ă���ꍇ�́A�ȉ��̍s�̃R�����g���O����AlarmMessageException���n������B
		} catch(AlarmMessageException ame){
			ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
			throw ee;
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
//			throw new FoundationException("AG0020010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AG0020010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AG0020010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AG0020010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AG0020010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AG0020010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AG0020010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AG0020010Entity entity;
	protected AG0020010Struct struct;
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

		entity = new AG0020010Entity();
		struct = new AG0020010Struct();

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
	 * AG0020010�N���X�̕W���R���X�g���N�^
	 */
	public AG0020010Control() throws BusinessProcessException, FoundationException
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
				AG0020010Struct key = (AG0020010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("r_SELECT_CHOICE1") && key.getr_SELECT_CHOICE1() != null) {
					msgKey.setKeyValue("r_SELECT_CHOICE1", key.getr_SELECT_CHOICE1());
				}
				if(msgKeyType.containsKeyColumn("r_SELECT_CHOICE2") && key.getr_SELECT_CHOICE2() != null) {
					msgKey.setKeyValue("r_SELECT_CHOICE2", key.getr_SELECT_CHOICE2());
				}
				if(msgKeyType.containsKeyColumn("r_SELECT_CHOICE3") && key.getr_SELECT_CHOICE3() != null) {
					msgKey.setKeyValue("r_SELECT_CHOICE3", key.getr_SELECT_CHOICE3());
				}
				if(msgKeyType.containsKeyColumn("r_SELECT_CHOICE") && key.getr_SELECT_CHOICE() != null) {
					msgKey.setKeyValue("r_SELECT_CHOICE", key.getr_SELECT_CHOICE());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_NAME") && key.getRCV_ISSUE_CMPLT_NAME() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CMPLT_NAME", key.getRCV_ISSUE_CMPLT_NAME());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_GNR_NAME") && key.getRCV_ISSUE_GNR_NAME() != null) {
					msgKey.setKeyValue("RCV_ISSUE_GNR_NAME", key.getRCV_ISSUE_GNR_NAME());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UPD_NAME") && key.getSTOCK_UPD_NAME() != null) {
					msgKey.setKeyValue("STOCK_UPD_NAME", key.getSTOCK_UPD_NAME());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_NAME") && key.getMRP_ODR_NAME() != null) {
					msgKey.setKeyValue("MRP_ODR_NAME", key.getMRP_ODR_NAME());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_NAME") && key.getRCV_ISSUE_NAME() != null) {
					msgKey.setKeyValue("RCV_ISSUE_NAME", key.getRCV_ISSUE_NAME());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("l_check") && key.getl_check() != null) {
					msgKey.setKeyValue("l_check", key.getl_check());
				}
				if(msgKeyType.containsKeyColumn("h_lotCtrl") && key.geth_lotCtrl() != null) {
					msgKey.setKeyValue("h_lotCtrl", key.geth_lotCtrl());
				}
				if(msgKeyType.containsKeyColumn("w_CHOICE") && key.getw_CHOICE() != null) {
					msgKey.setKeyValue("w_CHOICE", key.getw_CHOICE());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_val") && key.getMRP_ODR_TYP_val() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_val", key.getMRP_ODR_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_name") && key.getMRP_ODR_TYP_name() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_name", key.getMRP_ODR_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP_val") && key.getRCV_ISSUE_TYP_val() != null) {
					msgKey.setKeyValue("RCV_ISSUE_TYP_val", key.getRCV_ISSUE_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP_name") && key.getRCV_ISSUE_TYP_name() != null) {
					msgKey.setKeyValue("RCV_ISSUE_TYP_name", key.getRCV_ISSUE_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_GNR_TYP_val") && key.getRCV_ISSUE_GNR_TYP_val() != null) {
					msgKey.setKeyValue("RCV_ISSUE_GNR_TYP_val", key.getRCV_ISSUE_GNR_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_GNR_TYP_name") && key.getRCV_ISSUE_GNR_TYP_name() != null) {
					msgKey.setKeyValue("RCV_ISSUE_GNR_TYP_name", key.getRCV_ISSUE_GNR_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UPD_TYP_val") && key.getSTOCK_UPD_TYP_val() != null) {
					msgKey.setKeyValue("STOCK_UPD_TYP_val", key.getSTOCK_UPD_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UPD_TYP_name") && key.getSTOCK_UPD_TYP_name() != null) {
					msgKey.setKeyValue("STOCK_UPD_TYP_name", key.getSTOCK_UPD_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_FLG_val") && key.getRCV_ISSUE_CMPLT_FLG_val() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CMPLT_FLG_val", key.getRCV_ISSUE_CMPLT_FLG_val());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_FLG_name") && key.getRCV_ISSUE_CMPLT_FLG_name() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CMPLT_FLG_name", key.getRCV_ISSUE_CMPLT_FLG_name());
				}
				if(msgKeyType.containsKeyColumn("h_PLANT_CD") && key.geth_PLANT_CD() != null) {
					msgKey.setKeyValue("h_PLANT_CD", key.geth_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD") && key.getRCV_ISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CTRL_CD", key.getRCV_ISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP") && key.getRCV_ISSUE_TYP() != null) {
					msgKey.setKeyValue("RCV_ISSUE_TYP", key.getRCV_ISSUE_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ACPT_NO") && key.getACPT_NO() != null) {
					msgKey.setKeyValue("ACPT_NO", key.getACPT_NO().toString());
				}
				if(msgKeyType.containsKeyColumn("ACPT_RSLT_CRCT_NO") && key.getACPT_RSLT_CRCT_NO() != null) {
					msgKey.setKeyValue("ACPT_RSLT_CRCT_NO", key.getACPT_RSLT_CRCT_NO().toString());
				}
				if(msgKeyType.containsKeyColumn("INSPEC_RSLT_CRCT_NO") && key.getINSPEC_RSLT_CRCT_NO() != null) {
					msgKey.setKeyValue("INSPEC_RSLT_CRCT_NO", key.getINSPEC_RSLT_CRCT_NO().toString());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_CD") && key.getWORK_ODR_CD() != null) {
					msgKey.setKeyValue("WORK_ODR_CD", key.getWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD") && key.getWORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("WORK_IN_PROC_CD", key.getWORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("PARTIAL_PRD_NO") && key.getPARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("PARTIAL_PRD_NO", key.getPARTIAL_PRD_NO().toString());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_CRCT_NO") && key.getOPR_RSLT_CRCT_NO() != null) {
					msgKey.setKeyValue("OPR_RSLT_CRCT_NO", key.getOPR_RSLT_CRCT_NO().toString());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_CD") && key.getISSUE_INST_CD() != null) {
					msgKey.setKeyValue("ISSUE_INST_CD", key.getISSUE_INST_CD());
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
				if(msgKeyType.containsKeyColumn("DEFECT_CAUSE_CD") && key.getDEFECT_CAUSE_CD() != null) {
					msgKey.setKeyValue("DEFECT_CAUSE_CD", key.getDEFECT_CAUSE_CD());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UPD_TYP") && key.getSTOCK_UPD_TYP() != null) {
					msgKey.setKeyValue("STOCK_UPD_TYP", key.getSTOCK_UPD_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_FLG") && key.getRCV_ISSUE_CMPLT_FLG() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CMPLT_FLG", key.getRCV_ISSUE_CMPLT_FLG().toString());
				}
				if(msgKeyType.containsKeyColumn("CREATED_DATE") && key.getCREATED_DATE() != null) {
					msgKey.setKeyValue("CREATED_DATE", key.getCREATED_DATE());
				}
				if(msgKeyType.containsKeyColumn("CREATED_BY") && key.getCREATED_BY() != null) {
					msgKey.setKeyValue("CREATED_BY", key.getCREATED_BY());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_BEFORE_QTY") && key.getRCV_ISSUE_BEFORE_QTY() != null) {
					msgKey.setKeyValue("RCV_ISSUE_BEFORE_QTY", key.getRCV_ISSUE_BEFORE_QTY());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_AFTER_QTY") && key.getRCV_ISSUE_AFTER_QTY() != null) {
					msgKey.setKeyValue("RCV_ISSUE_AFTER_QTY", key.getRCV_ISSUE_AFTER_QTY());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("NON_PLANNED_CAUSE_CD") && key.getNON_PLANNED_CAUSE_CD() != null) {
					msgKey.setKeyValue("NON_PLANNED_CAUSE_CD", key.getNON_PLANNED_CAUSE_CD());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_NAME") && key.getVEND_NAME() != null) {
					msgKey.setKeyValue("VEND_NAME", key.getVEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_COMMENT") && key.getRCV_ISSUE_COMMENT() != null) {
					msgKey.setKeyValue("RCV_ISSUE_COMMENT", key.getRCV_ISSUE_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO") && key.getLOT_NO() != null) {
					msgKey.setKeyValue("LOT_NO", key.getLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("VEND_LOT_NO") && key.getVEND_LOT_NO() != null) {
					msgKey.setKeyValue("VEND_LOT_NO", key.getVEND_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("l_SHIP_ITEM_CD") && key.getl_SHIP_ITEM_CD() != null) {
					msgKey.setKeyValue("l_SHIP_ITEM_CD", key.getl_SHIP_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_INV_LOT_NO") && key.getl_INV_LOT_NO() != null) {
					msgKey.setKeyValue("l_INV_LOT_NO", key.getl_INV_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_CD") && key.getw_ITEM_CD() != null) {
					msgKey.setKeyValue("w_ITEM_CD", key.getw_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("w_JOB_ODR_CD") && key.getw_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("w_JOB_ODR_CD", key.getw_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("w_WH_CD") && key.getw_WH_CD() != null) {
					msgKey.setKeyValue("w_WH_CD", key.getw_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("w_FROM_DATE") && key.getw_FROM_DATE() != null) {
					msgKey.setKeyValue("w_FROM_DATE", key.getw_FROM_DATE());
				}
				if(msgKeyType.containsKeyColumn("w_TO_DATE") && key.getw_TO_DATE() != null) {
					msgKey.setKeyValue("w_TO_DATE", key.getw_TO_DATE());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_CD") && key.getw_PLANT_CD() != null) {
					msgKey.setKeyValue("w_PLANT_CD", key.getw_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("w_VEND_CD") && key.getw_VEND_CD() != null) {
					msgKey.setKeyValue("w_VEND_CD", key.getw_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("w_LOT_NO") && key.getw_LOT_NO() != null) {
					msgKey.setKeyValue("w_LOT_NO", key.getw_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("w_check") && key.getw_check() != null) {
					msgKey.setKeyValue("w_check", key.getw_check());
				}
				if(msgKeyType.containsKeyColumn("w_WH_PLANT_CD") && key.getw_WH_PLANT_CD() != null) {
					msgKey.setKeyValue("w_WH_PLANT_CD", key.getw_WH_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("w_WH_NAME") && key.getw_WH_NAME() != null) {
					msgKey.setKeyValue("w_WH_NAME", key.getw_WH_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_NAME") && key.getw_PLANT_NAME() != null) {
					msgKey.setKeyValue("w_PLANT_NAME", key.getw_PLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_VEND_NAME") && key.getw_VEND_NAME() != null) {
					msgKey.setKeyValue("w_VEND_NAME", key.getw_VEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_NAME") && key.getw_ITEM_NAME() != null) {
					msgKey.setKeyValue("w_ITEM_NAME", key.getw_ITEM_NAME());
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
					AG0020010Struct key = new AG0020010Struct();
					if(msgKeyType.containsKeyColumn("r_SELECT_CHOICE1")) {
						key.setr_SELECT_CHOICE1(msgKey.getKeyValue("r_SELECT_CHOICE1"));
					}
					if(msgKeyType.containsKeyColumn("r_SELECT_CHOICE2")) {
						key.setr_SELECT_CHOICE2(msgKey.getKeyValue("r_SELECT_CHOICE2"));
					}
					if(msgKeyType.containsKeyColumn("r_SELECT_CHOICE3")) {
						key.setr_SELECT_CHOICE3(msgKey.getKeyValue("r_SELECT_CHOICE3"));
					}
					if(msgKeyType.containsKeyColumn("r_SELECT_CHOICE")) {
						key.setr_SELECT_CHOICE(msgKey.getKeyValue("r_SELECT_CHOICE"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_NAME")) {
						key.setRCV_ISSUE_CMPLT_NAME(msgKey.getKeyValue("RCV_ISSUE_CMPLT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_GNR_NAME")) {
						key.setRCV_ISSUE_GNR_NAME(msgKey.getKeyValue("RCV_ISSUE_GNR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UPD_NAME")) {
						key.setSTOCK_UPD_NAME(msgKey.getKeyValue("STOCK_UPD_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_NAME")) {
						key.setMRP_ODR_NAME(msgKey.getKeyValue("MRP_ODR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_NAME")) {
						key.setRCV_ISSUE_NAME(msgKey.getKeyValue("RCV_ISSUE_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("l_check")) {
						key.setl_check(msgKey.getKeyValue("l_check"));
					}
					if(msgKeyType.containsKeyColumn("h_lotCtrl")) {
						key.seth_lotCtrl(msgKey.getKeyValue("h_lotCtrl"));
					}
					if(msgKeyType.containsKeyColumn("w_CHOICE")) {
						key.setw_CHOICE(msgKey.getKeyValue("w_CHOICE"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_val")) {
						key.setMRP_ODR_TYP_val(msgKey.getKeyValue("MRP_ODR_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_name")) {
						key.setMRP_ODR_TYP_name(msgKey.getKeyValue("MRP_ODR_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP_val")) {
						key.setRCV_ISSUE_TYP_val(msgKey.getKeyValue("RCV_ISSUE_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP_name")) {
						key.setRCV_ISSUE_TYP_name(msgKey.getKeyValue("RCV_ISSUE_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_GNR_TYP_val")) {
						key.setRCV_ISSUE_GNR_TYP_val(msgKey.getKeyValue("RCV_ISSUE_GNR_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_GNR_TYP_name")) {
						key.setRCV_ISSUE_GNR_TYP_name(msgKey.getKeyValue("RCV_ISSUE_GNR_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UPD_TYP_val")) {
						key.setSTOCK_UPD_TYP_val(msgKey.getKeyValue("STOCK_UPD_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UPD_TYP_name")) {
						key.setSTOCK_UPD_TYP_name(msgKey.getKeyValue("STOCK_UPD_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_FLG_val")) {
						key.setRCV_ISSUE_CMPLT_FLG_val(msgKey.getKeyValue("RCV_ISSUE_CMPLT_FLG_val"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_FLG_name")) {
						key.setRCV_ISSUE_CMPLT_FLG_name(msgKey.getKeyValue("RCV_ISSUE_CMPLT_FLG_name"));
					}
					if(msgKeyType.containsKeyColumn("h_PLANT_CD")) {
						key.seth_PLANT_CD(msgKey.getKeyValue("h_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD")) {
						key.setRCV_ISSUE_CTRL_CD(msgKey.getKeyValue("RCV_ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP")) {
						key.setRCV_ISSUE_TYP(new Integer(msgKey.getKeyValue("RCV_ISSUE_TYP")));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_NO")) {
						key.setACPT_NO(new Integer(msgKey.getKeyValue("ACPT_NO")));
					}
					if(msgKeyType.containsKeyColumn("ACPT_RSLT_CRCT_NO")) {
						key.setACPT_RSLT_CRCT_NO(new Integer(msgKey.getKeyValue("ACPT_RSLT_CRCT_NO")));
					}
					if(msgKeyType.containsKeyColumn("INSPEC_RSLT_CRCT_NO")) {
						key.setINSPEC_RSLT_CRCT_NO(new Integer(msgKey.getKeyValue("INSPEC_RSLT_CRCT_NO")));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_CD")) {
						key.setWORK_ODR_CD(msgKey.getKeyValue("WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD")) {
						key.setWORK_IN_PROC_CD(msgKey.getKeyValue("WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("PARTIAL_PRD_NO")) {
						key.setPARTIAL_PRD_NO(new Integer(msgKey.getKeyValue("PARTIAL_PRD_NO")));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_CRCT_NO")) {
						key.setOPR_RSLT_CRCT_NO(new Integer(msgKey.getKeyValue("OPR_RSLT_CRCT_NO")));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_CD")) {
						key.setISSUE_INST_CD(msgKey.getKeyValue("ISSUE_INST_CD"));
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
					if(msgKeyType.containsKeyColumn("DEFECT_CAUSE_CD")) {
						key.setDEFECT_CAUSE_CD(msgKey.getKeyValue("DEFECT_CAUSE_CD"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UPD_TYP")) {
						key.setSTOCK_UPD_TYP(new Integer(msgKey.getKeyValue("STOCK_UPD_TYP")));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_FLG")) {
						key.setRCV_ISSUE_CMPLT_FLG(new Integer(msgKey.getKeyValue("RCV_ISSUE_CMPLT_FLG")));
					}
					if(msgKeyType.containsKeyColumn("CREATED_DATE")) {
						key.setCREATED_DATE(msgKey.getKeyValue("CREATED_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CREATED_BY")) {
						key.setCREATED_BY(msgKey.getKeyValue("CREATED_BY"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(new Integer(msgKey.getKeyValue("MRP_ODR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_BEFORE_QTY")) {
						key.setRCV_ISSUE_BEFORE_QTY(msgKey.getKeyValue("RCV_ISSUE_BEFORE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_AFTER_QTY")) {
						key.setRCV_ISSUE_AFTER_QTY(msgKey.getKeyValue("RCV_ISSUE_AFTER_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("NON_PLANNED_CAUSE_CD")) {
						key.setNON_PLANNED_CAUSE_CD(msgKey.getKeyValue("NON_PLANNED_CAUSE_CD"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_NAME")) {
						key.setVEND_NAME(msgKey.getKeyValue("VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_COMMENT")) {
						key.setRCV_ISSUE_COMMENT(msgKey.getKeyValue("RCV_ISSUE_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO")) {
						key.setLOT_NO(msgKey.getKeyValue("LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("VEND_LOT_NO")) {
						key.setVEND_LOT_NO(msgKey.getKeyValue("VEND_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_SHIP_ITEM_CD")) {
						key.setl_SHIP_ITEM_CD(msgKey.getKeyValue("l_SHIP_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_INV_LOT_NO")) {
						key.setl_INV_LOT_NO(msgKey.getKeyValue("l_INV_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_CD")) {
						key.setw_ITEM_CD(msgKey.getKeyValue("w_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_JOB_ODR_CD")) {
						key.setw_JOB_ODR_CD(msgKey.getKeyValue("w_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_WH_CD")) {
						key.setw_WH_CD(msgKey.getKeyValue("w_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_FROM_DATE")) {
						key.setw_FROM_DATE(msgKey.getKeyValue("w_FROM_DATE"));
					}
					if(msgKeyType.containsKeyColumn("w_TO_DATE")) {
						key.setw_TO_DATE(msgKey.getKeyValue("w_TO_DATE"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_CD")) {
						key.setw_PLANT_CD(msgKey.getKeyValue("w_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_VEND_CD")) {
						key.setw_VEND_CD(msgKey.getKeyValue("w_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_LOT_NO")) {
						key.setw_LOT_NO(msgKey.getKeyValue("w_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("w_check")) {
						key.setw_check(msgKey.getKeyValue("w_check"));
					}
					if(msgKeyType.containsKeyColumn("w_WH_PLANT_CD")) {
						key.setw_WH_PLANT_CD(msgKey.getKeyValue("w_WH_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_WH_NAME")) {
						key.setw_WH_NAME(msgKey.getKeyValue("w_WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_NAME")) {
						key.setw_PLANT_NAME(msgKey.getKeyValue("w_PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_VEND_NAME")) {
						key.setw_VEND_NAME(msgKey.getKeyValue("w_VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_NAME")) {
						key.setw_ITEM_NAME(msgKey.getKeyValue("w_ITEM_NAME"));
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
