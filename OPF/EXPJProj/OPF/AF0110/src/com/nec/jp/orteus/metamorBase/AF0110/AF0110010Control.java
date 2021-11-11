/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0110/src/com/nec/jp/orteus/metamorBase/AF0110/AF0110010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AF0110;

import com.nec.jp.orteus.metamorBase.AF0110.*;
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
import com.nec.jp.orteus.expj.util.Calculate;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueRemain;
import com.nec.jp.orteus.expj.pr.rcvissue.process.ValidateWh;
import com.nec.jp.orteus.expj.util.SystemInformation;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueProcess;
import com.nec.jp.orteus.expj.pr.rcvissue.process.RcvProcess;
import com.nec.jp.orteus.expj.pr.rcvissue.util.StringUtil;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AF0110010Control
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
	protected List list;											// �ꗗ�����̌��ʃ��X�g����ʂɕ\�����邽�߂̃��X�g�C���X�^���X

	// �f�t�H���g�A�N�Z�T���\�b�h
	public List getList() { return this.list; }						// ���X�g��Ԃ��܂��B
	public void setList(List listname) { this.list = listname; }	// ���X�g���Z�b�g���܂��B
	public int getListsize() {										// ���X�g�^�̃T�C�Y��Ԃ��܂��B
		int nret = 0;
		if( this.list != null ) {nret = this.list.size();}
		return nret;
	}
//	public Object getListvalue(int x) { return this.list.get(x); }	// ���X�g�̒l��Ԃ��܂��B
	public AF0110010Struct getListvalue(int x) { return (AF0110010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AF0110010Struct getStruct() { return this.struct; }	// Struct��Ԃ��܂��B
	public AF0110010Struct createStruct() { return new AF0110010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AF0110010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

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
	 * ComboException�������̃G���[�������s���B<br>
	 * �E�G���[��p��ʂɃG���[���b�Z�[�W��\������<br>
	 * �E�������e���A�V�X�e�����O[���x��:SEVERE]�ɏo�͂���B
	 * @param ComboException
	 * @throws ExpjException
	 */
	public void setComboExceptionMsg(ComboException e) throws ExpjException
	{
		// �T�[�o�G���[�������b�Z�[�W[ZZ01106]
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
	 */
	private void setInfoMessage(String messageno)
	{
		ExpjMessage emsg = new ExpjMessage( messageno );
		msgStruct.addInfo( emsg );
		sysLog.config(emsg, getsysUSER_CD());
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

	/** �q�ɋ敪 */
	ComboStruct _WH_TYP = new ComboStruct();

	/**
	 * �R���{�{�b�N�X�̒l���擾
	 */
	private void setComboData() throws ComboException, SQLException
	{
		ComboBox comboController = new ComboBox(conn, sysUSER_CD);

		// �q�ɋ敪
		_WH_TYP = comboController.getData("WH_TYP");
	}

	/**
	 * �敪���擾
	 * @param comboStruct �敪��񃊃X�g
	 * @param strTyp �敪�R�[�h
	 * @return �敪���́B�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�
	 */
	private String getTypeName(ComboStruct comboStruct, String strTyp)
	{
		if(comboStruct == null || strTyp == null)  return null;
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
	 * <pre>
	 * ���o�ɊǗ��ԍ��̍̔ԏ���
	 * </pre>
	 * @return String ���o�ɊǗ��ԍ�
	 */
	private String getRcvIssueCtrlCd() throws SQLException, FoundationException
	{
		CollectNumber issueCollect = new CollectNumber(CollectNumber.ISSUE_CD,
													   getsysUSER_CD(),
													   this.sp.getProcId(),
													   getsysPLANT_CD());
		String issueCtrlCd = issueCollect.getNo();

		// �擾�Ɏ��s�����ꍇ�͏������f
		if( issueCtrlCd==null ){
			conn.rollback();
			ExpjMessage emsg = new ExpjMessage("AF00057");
			throw new FoundationException(
								"AF0110010Control",
								"IssueProcess()",
								emsg.getMessage(CoreTools.getLocale(this.getsysUSER_CD())) );
		}

		return issueCtrlCd;
	}

	/**
	 * <pre>
	 * �Ǎ��E�ꊇ�U�֎����ʏ���
	 * (1)�G���[�`�F�b�N�ƍ݌ɏ��Ǎ�
	 * (2)�i�ږ��A�ۊǋ斈�̐U�֗\�萔�̎Z�o
	 * </pre>
	 * @return true/false �Ɩ��G���[�����������ꍇ false
	 */
	private boolean commonProcess() throws SQLException, FoundationException
	{
		List listMessage = new ArrayList();
		boolean bRet;

		if(list != null) list.clear();

		// [�ۊǋ搻�ԍ݌�]�̑��݃`�F�b�N
		List wkList = entity.mT_JOB_ODR_CD_STOCK.read(conn, struct);
		if( wkList.size() <= 0 ){
			listMessage.add("T_JOB_ODR_CD_STOCK.JOB_ODR_CD:" + struct.getJOB_ODR_CD());
			listMessage.add("T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO:0");
			listMessage.add("T_JOB_ODR_CD_STOCK.PLANT_CD:" + struct.getw_PLANT_CD());
			setErrorMessage("AF00045", listMessage);
			return false;
		}

		// [���Ԍv��]��"���ԏ�ԋ敪"�`�F�b�N
		if( !struct.getJOB_COMP_FLG().equals("true") ){
			bRet = entity.mT_JOB_ODR.check(conn, struct);
			if( bRet ){
				listMessage.add("T_JOB_ODR.JOB_ODR_CD:" + struct.getJOB_ODR_CD());
				listMessage.add("T_JOB_ODR.JOB_ODR_DETAIL_NO:0");
				listMessage.add("T_JOB_ODR.PLANT_CD:" + struct.getw_PLANT_CD());
				listMessage.add("T_JOB_ODR.JOB_ODR_STS_TYP:<>9");
				setErrorMessage("AF00114", listMessage);
				return false;
			}
		}

		list = wkList;

		// �i�ځE�ۊǋ�P�ʂ̐��ʌv�Z
		if( !calcChangeQty() ){
			return false;
		}

		return true;
	}

	/**
	 * <pre>
	 * �U���\�萔�̌v�Z
	 * @return true/false �G���[�����������ꍇfalse
	 * </pre>
	 */
	private boolean calcChangeQty() throws SQLException, FoundationException
	{
		AF0110010Struct wkStruct = null;

		// ���ԁA���Ԏ}�ԁA�H��R�[�h�����ɓo�^�i�ڃR�[�h���擾
		List wkList = entity.mT_JOB_ODR_CD_STOCK_DISTINCT.read(conn, struct);
		if( wkList.size() <= 0 ) return false;

		IssueRemain issueRemain = new IssueRemain(conn);
		for( int i=0; i<wkList.size(); i++ ){
			wkStruct = (AF0110010Struct)wkList.get(i);
			String freeStockQty = (issueRemain.getFreeStockQtyOfJobOdr(
									struct.getw_PLANT_CD(),
									wkStruct.getITEM_CD(),
									struct.getJOB_ODR_CD(),
									AF0110Const._JOB_ODR_DETAIL_ZERO)).toString();

			// �U�։\�����O�̕i�ڂ͐U�֑ΏۊO�Ƃ���
			if( Calculate.compare(freeStockQty,"0") <= 0 ) continue;

			// �U�։\�����O�̕i�ڂ͕ۊǋ斈�ɐU�։\�������߂�
			List whList = ValidateWh.getFree(conn, struct.getw_PLANT_CD(), wkStruct.getITEM_CD());
			WhLoop: for(int x=0; x<whList.size(); x++){
				String whCd = (String)whList.get(x);
				
				// ���ԕʎ莝�݌ɐ����ő�łO�ɂȂ�܂ŐU�։\�����Z�b�g
				for(int y=0; y<list.size(); y++){
					AF0110010Struct listStruct = (AF0110010Struct)list.get(y);

					// ���ԕʎ莝�݌ɐ� �� �O�łȂ��ꍇ�̓Z�b�g���Ȃ�
					if( !listStruct.getWH_CD().equals(whCd) ||
						!listStruct.getITEM_CD().equals(wkStruct.getITEM_CD()) ||
						Calculate.compare(listStruct.getSTOCK_ON_HAND_QTY(),"0") != 1 ) continue;

					// �U�։\�����O�ɂȂ��Ď��_�ŏ����I��
					String changeQty = Calculate.subtract(freeStockQty, listStruct.getSTOCK_ON_HAND_QTY());
					if( Calculate.compare(changeQty,"0") <= 0 ){
						listStruct.setCHANGE_PLAN_QTY(freeStockQty);
						break WhLoop;
					} else {
						listStruct.setCHANGE_PLAN_QTY(listStruct.getSTOCK_ON_HAND_QTY());
						freeStockQty = Calculate.subtract(freeStockQty, listStruct.getSTOCK_ON_HAND_QTY());
					}
					break;
					
				}
			}
		}
		
		return true;
	}

	/**
	 * <pre>
	 * ���o�ɏ���
	 * (1)[�ۊǋ�ʓ��o��]�ɏo�Ƀf�[�^��ǉ����ďo�ɏ������Ăяo���B
	 * (2)[�ۊǋ�ʓ��o��]�ɓ��Ƀf�[�^��ǉ����ē��ɏ������Ăяo���B
	 * @return true/false �G���[�����������ꍇfalse
	 * </pre>
	 */
	private boolean RcvIssueProcess() throws SQLException, FoundationException
	{
		String strMessage = "";
		boolean errFlg = true;

		for(int i=0; i<list.size(); i++){
			AF0110010Struct wkStruct = (AF0110010Struct)list.get(i);

			/************************************************************
			 (1)[�ۊǋ�ʓ��o��]�ɏo�Ƀf�[�^��ǉ����ďo�ɏ������Ăяo���B
			************************************************************/

			// �U�֐� �؂�グ����
			boolean resultCeil = false;
			if(wkStruct.getUNIT_QTY_TYP().intValue() == AF0110Const._UNIT_QTY_INTEGER
				&& Calculate.isNumeric(wkStruct.getCHANGE_PLAN_QTY()) ){
				wkStruct.setCHANGE_PLAN_QTY(Calculate.ceil(wkStruct.getCHANGE_PLAN_QTY(), 0));
				resultCeil = true;
			}

			// ���o�ɊǗ��ԍ��̍̔�
			wkStruct.setRCV_ISSUE_CTRL_CD(getRcvIssueCtrlCd());

			// ���o�ɋ敪�̃Z�b�g�i2:�o�Ɂj
			wkStruct.setRCV_ISSUE_TYP(AF0110Const._ISSUE_TYP);

			// ���o�ɐ��̃Z�b�g�i�Z�o�����U�֐� �~ �|�P�j
			wkStruct.setCHANGE_PLAN_QTY(Calculate.multiply(wkStruct.getCHANGE_PLAN_QTY(),"-1"));

			// ���o�ɔ����敪�̃Z�b�g�i24:�U�֏o�Ɂj
			wkStruct.setRCV_ISSUE_GNR_TYP(AF0110Const._ISSUE_GNR_TYP);

			entity.mT_RCV_ISSUE.create(conn, wkStruct);

			// �o�ɏ����Ăяo��
			IssueProcess issuePrc = new IssueProcess(conn, wkStruct.getRCV_ISSUE_CTRL_CD());
			if( issuePrc.execProcess() ){
				if(resultCeil){
					// �o�^�������s�F�����Ǘ��i�ڂ̂��ߏ����_�ȉ��͐؂�グ���čX�V���܂���
					strMessage = "T_RCV_ISSUE.RCV_ISSUE_CTRL_CD:" + wkStruct.getRCV_ISSUE_CTRL_CD();
					setInfoMessage("AF60004", strMessage);
				}
			} else {
				conn.rollback();
				return false;
			}

			/************************************************************
			 (2)[�ۊǋ�ʓ��o��]�ɓ��Ƀf�[�^��ǉ����ē��ɏ������Ăяo���B
			************************************************************/

			// ���o�ɊǗ��ԍ��̍̔�
			wkStruct.setRCV_ISSUE_CTRL_CD(getRcvIssueCtrlCd());

			// ���o�ɋ敪�̃Z�b�g�i1:���Ɂj
			wkStruct.setRCV_ISSUE_TYP(AF0110Const._RCV_TYP);

			// ���o�ɐ��̃Z�b�g�i�Z�o�����U�֐� �~ �|�P�j
			wkStruct.setCHANGE_PLAN_QTY(Calculate.multiply(wkStruct.getCHANGE_PLAN_QTY(),"-1"));

			// ���o�ɔ����敪�̃Z�b�g�i14:�U�֓��Ɂj
			wkStruct.setRCV_ISSUE_GNR_TYP(AF0110Const._RCV_GNR_TYP);
			
			// ���Ԃ̃Z�b�g�iNULL�j
			wkStruct.setJOB_ODR_CD(null);

			entity.mT_RCV_ISSUE.create(conn, wkStruct);

			// ���ɏ����Ăяo��
			RcvProcess rcvPrc = new RcvProcess(conn, wkStruct.getRCV_ISSUE_CTRL_CD());
			if( rcvPrc.execProcess() ){
				if(resultCeil){
					// �o�^�������s�F�����Ǘ��i�ڂ̂��ߏ����_�ȉ��͐؂�グ���čX�V���܂���
					strMessage = "T_RCV_ISSUE.RCV_ISSUE_CTRL_CD:" + wkStruct.getRCV_ISSUE_CTRL_CD();
					setInfoMessage("AF60004", strMessage);
				}
			} else {
				conn.rollback();
				return false;
			}
		}

		return true;
	}

        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �ꊇ�U�փ{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlPackageChange() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0110");
		logger.entering("AF0110010Control"+":USER="+struct.getsUser_ID(),"controlPackageChange");
			//{{user_implement_dev:<controlPackageChange>
		
		// �{�^�����Z�b�g
		setButton("PackageChange");

		boolean transFlg = false;
		String strMessage = "";

		try{

			// �Ǎ��A�ꊇ�U�ւ̋��ʏ���
			// �Ɩ��G���[�����������ꍇ�͏������f
			controlSelect();

			// �U�֑Ώۃf�[�^�����݂��Ȃ��ꍇ�������f
			if((list == null) || (list.size() == 0)) return;

			// �g�����U�N�V�����J�n
			conn.beginTransWeb();
			transFlg = true;

			// �Ɩ��^�p���̎擾
			String strBusinessOprDate = SystemInformation.getBusinessOprDate(getsysPLANT_CD());
			if(strBusinessOprDate == null){
				strMessage = "SYS_DATE_CTRL.PLANT_CD:" + getsysPLANT_CD();
				setErrorMessage("AF00056", strMessage);
				return;
			}

			// ��ЃR�[�h�̎擾
			String strCompanyCd = SystemInformation.getSysMyCompanyCd();

			// �Ɩ��^�p���A�����R�[�h�A��ЃR�[�h�̃Z�b�g����
			for(int i=0; i<list.size(); i++) {
				AF0110010Struct viewStruct = (AF0110010Struct)list.get(i);

				// �Ɩ��^�p���̃Z�b�g
				viewStruct.setRCV_ISSUE_DATE(strBusinessOprDate);

				// �����R�[�h�̃Z�b�g
				String strVendCd = "";
				List wkList = entity.mM_WH.read(conn, viewStruct);
				if(wkList.size() > 0){
					viewStruct.setVEND_CD(((AF0110010Struct)wkList.get(0)).getVEND_CD());
				}

				viewStruct.setCOMPANY_CD(strCompanyCd);

				// Orteus�W��Struct�̃R�s�[
				viewStruct.getDefaultData(struct);
			}

			if( !RcvIssueProcess() ){
				// ���o�ɏ����Ɏ��s�����ꍇ
				return;
			}
			
			conn.commit();
			transFlg = false;
			
			if(list!=null) list.clear();

			// �U�֏I���̃��b�Z�[�W�\��
			setInfoMessage("AF60007");

		}catch(SQLException e){
			setSqlExceptionMsg(e);
		} finally {
			try {
				if( transFlg ){
					conn.rollback();
					transFlg = false;
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

                //}}user_implement_dev:<controlPackageChange>
		logger.exiting("AF0110010Control"+":USER="+struct.getsUser_ID(),"controlPackageChange");

		return;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0110");
		logger.entering("AF0110010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
		
		List listMessage = new ArrayList();
		
		try {

			// �Ǎ��A�ꊇ�U�ւ̋��ʏ���
			// �Ɩ��G���[�����������ꍇ�͏������f
			if( !commonProcess() ){
				if(list != null) list.clear();
				return;
			}

			// �U�֗\�萔���Z�b�g����Ă��Ȃ��ꍇ�͕\�����Ȃ�
			// �Z�b�g����Ă���ꍇ�̓R���{(�q�ɋ敪)�̒l��ݒ������
			for(int i=0; i<list.size(); i++) {
				AF0110010Struct viewStruct = (AF0110010Struct)list.get(i);

				if( viewStruct.getCHANGE_PLAN_QTY() == null ){
					list.remove(i);
					i--;
					continue;
				}

				viewStruct.setWH_TYP_NAME(
						getTypeName(_WH_TYP, viewStruct.getWH_TYP()));
			}
			
			if(!"PackageChange".equals(getButton())){
				// �ő�\���s���G���[
				int maxLine = sp.getMaxLine(conn,10);
				if(maxLine != 0 && this.list.size() > maxLine){
					list.clear();
					setErrorMessage("ZZ01115", "", ""+maxLine);
					return;
				}
			}

			if(list.size() <= 0){
				listMessage.add("T_JOB_ODR_CD_STOCK.JOB_ODR_CD:" + struct.getJOB_ODR_CD());
				listMessage.add("T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO:0");
				listMessage.add("T_JOB_ODR_CD_STOCK.PLANT_CD:" + struct.getw_PLANT_CD());
				setErrorMessage("AF60006", listMessage);
				return;
			}

		} catch(SQLException e) {
			setSqlExceptionMsg(e);
		}
		
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AF0110010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0110");
		logger.entering("AF0110010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>

		if(list != null) list.clear();

                //}}user_implement_dev:<controlClear>
		logger.exiting("AF0110010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0110");
		logger.entering("AF0110010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AF0110010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0110");
		logger.entering("AF0110010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>

		try{
			// �R���{�{�b�N�X�̒l�ݒ�
			setComboData();

			// �N���A����
			controlClear();
		}catch (ComboException e){
			setComboExceptionMsg(e);
		} catch(SQLException e) {
			setSqlExceptionMsg(e);
		}

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AF0110010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0110");
		logger.entering("AF0110010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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

		// �H��R�[�h�̃Z�b�g
		struct.setw_PLANT_CD(getsysPLANT_CD());

                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AF0110010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("PackageChange") ) {
				controlPackageChange();
			} else if( button.equals("Select") ) {
				controlSelect();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
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
//			throw new FoundationException("AF0110010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0110010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AF0110010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0110010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AF0110010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0110010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AF0110010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AF0110010Entity entity;
	protected AF0110010Struct struct;
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

		entity = new AF0110010Entity();
		struct = new AF0110010Struct();

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
	 * AF0110010�N���X�̕W���R���X�g���N�^
	 */
	public AF0110010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
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
				AF0110010Struct key = (AF0110010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_CD") && key.getw_PLANT_CD() != null) {
					msgKey.setKeyValue("w_PLANT_CD", key.getw_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("WH_TYP") && key.getWH_TYP() != null) {
					msgKey.setKeyValue("WH_TYP", key.getWH_TYP());
				}
				if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY") && key.getSTOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("STOCK_ON_HAND_QTY", key.getSTOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("DRAW_CD") && key.getDRAW_CD() != null) {
					msgKey.setKeyValue("DRAW_CD", key.getDRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("SPEC") && key.getSPEC() != null) {
					msgKey.setKeyValue("SPEC", key.getSPEC());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD") && key.getRCV_ISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CTRL_CD", key.getRCV_ISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP") && key.getRCV_ISSUE_TYP() != null) {
					msgKey.setKeyValue("RCV_ISSUE_TYP", key.getRCV_ISSUE_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("CHANGE_PLAN_QTY") && key.getCHANGE_PLAN_QTY() != null) {
					msgKey.setKeyValue("CHANGE_PLAN_QTY", key.getCHANGE_PLAN_QTY());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_DATE") && key.getRCV_ISSUE_DATE() != null) {
					msgKey.setKeyValue("RCV_ISSUE_DATE", key.getRCV_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_GNR_TYP") && key.getRCV_ISSUE_GNR_TYP() != null) {
					msgKey.setKeyValue("RCV_ISSUE_GNR_TYP", key.getRCV_ISSUE_GNR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_COMP_FLG") && key.getJOB_COMP_FLG() != null) {
					msgKey.setKeyValue("JOB_COMP_FLG", key.getJOB_COMP_FLG());
				}
				if(msgKeyType.containsKeyColumn("WH_TYP_NAME") && key.getWH_TYP_NAME() != null) {
					msgKey.setKeyValue("WH_TYP_NAME", key.getWH_TYP_NAME());
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
					AF0110010Struct key = new AF0110010Struct();
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_CD")) {
						key.setw_PLANT_CD(msgKey.getKeyValue("w_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WH_TYP")) {
						key.setWH_TYP(msgKey.getKeyValue("WH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY")) {
						key.setSTOCK_ON_HAND_QTY(msgKey.getKeyValue("STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("DRAW_CD")) {
						key.setDRAW_CD(msgKey.getKeyValue("DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("SPEC")) {
						key.setSPEC(msgKey.getKeyValue("SPEC"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(new Integer(msgKey.getKeyValue("UNIT_QTY_TYP")));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD")) {
						key.setRCV_ISSUE_CTRL_CD(msgKey.getKeyValue("RCV_ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP")) {
						key.setRCV_ISSUE_TYP(new Integer(msgKey.getKeyValue("RCV_ISSUE_TYP")));
					}
					if(msgKeyType.containsKeyColumn("CHANGE_PLAN_QTY")) {
						key.setCHANGE_PLAN_QTY(msgKey.getKeyValue("CHANGE_PLAN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_DATE")) {
						key.setRCV_ISSUE_DATE(msgKey.getKeyValue("RCV_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_GNR_TYP")) {
						key.setRCV_ISSUE_GNR_TYP(new Integer(msgKey.getKeyValue("RCV_ISSUE_GNR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_COMP_FLG")) {
						key.setJOB_COMP_FLG(msgKey.getKeyValue("JOB_COMP_FLG"));
					}
					if(msgKeyType.containsKeyColumn("WH_TYP_NAME")) {
						key.setWH_TYP_NAME(msgKey.getKeyValue("WH_TYP_NAME"));
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
