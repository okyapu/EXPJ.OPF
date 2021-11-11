/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KU0010/src/com/nec/jp/orteus/metamorBase/KU0010/KU0010010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KU0010;

import com.nec.jp.orteus.metamorBase.KU0010.*;
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
//-----------------------------------------------------------------------------
//import com.nec.jp.orteus.metamorBase.util.Combo.ComboStruct;
//import com.nec.jp.orteus.metamorBase.util.Combo.ComboDataAccessController;
//import com.nec.jp.orteus.metamorBase.util.Combo.ComboException;
//import com.nec.jp.orteus.metamorBase.util.SystemLog.SystemLog;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;

//import com.nec.jp.orteus.metamorBase.common01.Accessor.ProductStructureRepository;
//import com.nec.jp.orteus.metamorBase.common01.db.DBErrorMessage;
//import com.nec.jp.orteus.metamorBase.common01.Msg.MessageConfig;
//import com.nec.jp.orteus.metamorBase.common01.Msg.MessageStruct;

//import com.nec.jp.orteus.metamorBase.common.util.ScreenParam;
//import com.nec.jp.orteus.metamorBase.util.BusinessLock.BusinessLock;
import com.nec.jp.orteus.metamorBase.common06.util.numberUtil;

//import com.nec.jp.orteus.metamorBase.common.WorkDay.WorkDay;
import java.util.GregorianCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.text.MessageFormat;
import com.nec.jp.orteus.metamorBase.common06.ExchAmount.*;
//-----------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class KU0010010Control
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
	public List getList() { return this.list; }			// ���X�g��Ԃ��܂��B
	public void setList(List listname) { this.list = listname; }	// ���X�g���Z�b�g���܂��B
	public int getListsize() {										// ���X�g�^�̃T�C�Y��Ԃ��܂��B
		int nret = 0;
		if( this.list != null ) {nret = this.list.size();}
		return nret;
	}
	public Object getListvalue(int x) { return this.list.get(x); }	// ���X�g�̒l�i���f�B�G�[�^�j��Ԃ��܂��B


	public KU0010010Struct getStruct() { return this.struct; }	// Struct�̒l�i���f�B�G�[�^�j��Ԃ��܂��B

	// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
//------------------------------------------------------------------------------
	/* �q�ɃR���{ */
//	private List _WH_CD_val = new ArrayList();
//	private List _WH_CD_name = new ArrayList();


	/* �A���`�� */
	//private ComboStruct _TRANSPORT_TYP = new ComboStruct();
	//public void setTRANSPORT_TYP(ComboStruct combo){ _TRANSPORT_TYP = combo; }
	//public ComboStruct getTRANSPORT_TYP(){ return _TRANSPORT_TYP; }
//------------------------------------------------------------------------------

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

	/** �V�X�e������ */
	//private final static String m_kSYS_CLASS = "SALES";
        private final static String m_kSYS_CLASS = "SYSTEM";

	/** ��ʃ��[�h �������� */
	private final static String _SELECT = "select";

	/** ��ʃ��[�h ����/����ȊO�̏��� */
	private final static String _NORMAL = "normal";

	/** ��ʃ��[�h ���鏈�� */
	private final static String _CLOSE = "close";

	/** TAX KBN */
	private String TAX_KBN = "";

	/** ��ʕ\������ */
	private int hyouji_kensu = 1;

	/** �ʏ�̗a���q�ɋ敪 */
	private final static String m_kNORMAL_DEPOTYP = "10";

	/** �a���̗a���q�ɋ敪 */
	private final static String m_kYOTO_DEPOTYP = "20";

    /** �����Ǘ��敪 */
    private String unitQtyType = "";
//------------------------------------------------------------------------------

	/** ���b�Z�[�W��`�t�@�C�� */
	private MessageConfig _msgConfig = null;

	/** ���b�Z�[�W */
//	private MessageStruct _msgStruct = msgStruct;//new MessageStruct();

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
	 * �s�ԍ��t�����b�Z�[�W�ݒ�
	 * @param ���b�Z�[�W
	 */
//	public void addLineErrorMessage(String key,MessageStruct mg,int idx)
//	{
//		Object[] objs = {String.valueOf(idx)};
//		mg.addError(MessageFormat.format(_msgConfig.getMessage(key),objs));
//		objs = null;
//	}
//	public void addLineWarnMessage(String key,MessageStruct mg,int idx)
//	{
//		Object[] objs = {String.valueOf(idx)};
//		mg.addWarn(MessageFormat.format(_msgConfig.getMessage(key),objs));
//		objs = null;
//	}

//------------------------------------------------------------------------------

	/** �V�X�e�����O */
	SystemLog _sysLog = sysLog;

//------------------------------------------------------------------------------

//-------------------------------------------------------------------------
	/** ��ʋ��ʒ�`�擾�N���X */
	ScreenParam _scParam = sp;

	//------------------------------------------------------------------------
	// �H��R�[�h/���[�U�R�[�h
	protected String _plantCd; // �H��R�[�h
	public void setPlantCd(String cd){ _plantCd = cd; };
	public String getPlantCd(){ return sysPLANT_CD; };

	protected String _userCd; // ���[�U�R�[�h
	public void setUserCd(String cd){ _userCd = cd; };
	public String getUserCd() { return sysUSER_CD; };

	/** ��ʑJ�ڃL�[(�󒍔ԍ��j */
  private String _odrNo;
  /** ��ʑJ�ڃL�[(���[����) */
  private String _partDlvSeqNo;
	/** ��ʑJ�ڃL�[(�`�[�ԍ��j */
  private String _slipCd;
  /** ��ʑJ�ڃL�[(�o�׌v�悩��o�׎w���o�^���W�I�{�^��) */
  private String _r1ShipOdr;
  /** ��ʑJ�ڃL�[(�o�׎w���폜���W�I�{�^��) */
  private String _r2ShipOdr;


	//------------------------------------------------------------------------
//TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT
	/** �Ɩ����b�N �����L�[ */
//	private int _descriptor = -1;

	/**
	 * ���b�N���{
	 */
/*
	protected void lock()
	{
		unLock();	// ��������
		try{
			BusinessLock lock = new BusinessLock(conn, _userCd, _plantCd);
			_descriptor = lock.doLock(_scParam.getProcId());
			if(_descriptor == -1) throw new Exception();

		}catch(Exception e){
			_sysLog.severe("ZZ01001", _userCd);
			_sysLog.severe("AA99991", _userCd, "�Ɩ���", _scParam.getProcId());

			AlarmMessageException msg = new AlarmMessageException();
			msg.add("ZZ01001");
			msg.add("ZZ01006", "�Ɩ����F" + _scParam.getProcId());
			msg.add("ZZ01006", "���[�U�R�[�h�F" + _userCd);

			throw msg;
		}
	}
*/
	/**
	 * ���b�N����
	 */
/*
	protected void unLock()
	{
		try{
			if(_descriptor != -1){
				BusinessLock lock = new BusinessLock(conn, _userCd, _plantCd);
				boolean result = lock.doUnLock(_scParam.getProcId(), _descriptor);
				if(result == false) throw new Exception();
			}

		}catch(Exception e){
			_sysLog.severe("ZZ01004", _userCd);
			_sysLog.severe("AA99991", _userCd, "�Ɩ���", _scParam.getProcId());

			AlarmMessageException msg = new AlarmMessageException();
			msg.add("ZZ01004");
			msg.add("ZZ01006", "�Ɩ����F" + _scParam.getProcId());
			msg.add("ZZ01006", "���[�U�R�[�h�F" + _userCd);

			throw msg;
		}
		finally{
			_descriptor = -1;
		}
	}
/*
//LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL

	/**
	 * ���N�G�X�g���ꂽ����`�F�b�N�{�b�N�X��Vector�Ɋi�[
	 *
	 * @param str �J���}��؂蕶����
	 * @param delm ��؂�L��
	 * @return Vector �`�F�b�N�{�b�N�X�o�����[
	 *
	 */
        private Vector getToken(String str ,String delim){
		Vector _DIRECT_DLV_FLG = new Vector();
		StringTokenizer st = new StringTokenizer(str,delim);
		while (st.hasMoreTokens()) {
                  _DIRECT_DLV_FLG.addElement(st.nextToken());
                }
		return _DIRECT_DLV_FLG;
	}

	/**
	 * ���N�G�X�g�p�����[�^�`�F�b�N����
	 *
	 * @param idx �s�C���f�b�N�X
	 * @param wst KQ0010010Struct
	 * @return true:����@false:�ُ�
	 */
	private boolean chkRequestParameter(int idx,KU0010010Struct wst) throws ParseException
	{
		// =======================================
		//�o�׎w�����t���ߋ����łȂ����Ƃ��`�F�b�N����
		// =======================================
	//	SimpleDateFormat sdi = new SimpleDateFormat("yyyy/MM/dd");
	//	SimpleDateFormat sdc = new SimpleDateFormat("yyyyMMdd");

		//�o�׎w����
		GregorianCalendar inpDate = new GregorianCalendar();
	//	inpDate.setTime(sdi.parse(wst.getg_DESINATED_SHIP_DATE()));
		inpDate.setTime(Converter.strToDate(wst.getg_DESINATED_SHIP_DATE(), "yyyy/MM/dd"));

		//�Ɩ����t
		GregorianCalendar gyoDate = new GregorianCalendar();
	//	gyoDate.setTime(sdi.parse(struct.getstrBUSINESS_OPR_DATE()));
		gyoDate.setTime(Converter.strToDate(struct.getstrBUSINESS_OPR_DATE(), "yyyy/MM/dd"));

		//�w����t���Ɩ����t
		if(inpDate.getTime().compareTo(gyoDate.getTime()) < 0){
			//�Ɩ����t���ߋ����̓G���[
			//_sysLog.warning("KU00023", struct.getsUser_ID());
			//_sysLog.warning("AA99991", struct.getsUser_ID(), "�o�׎w����", wst.getg_DESINATED_SHIP_DATE());
			//_sysLog.warning("AA99991", struct.getsUser_ID(), "�Ɩ����t", struct.getstrBUSINESS_OPR_DATE());
			//addLineErrorMessage("KU00023",msgStruct,idx+1);

			ExpjMessage emsg = new ExpjMessage("KU00023");
			msgStruct.addError(emsg);

			return false;
		}

		return true;
	}

	/**
	 * �[���\���
	 *
	 * @param KU0010010Struct Struct
	 * @return �Z�o��̔[���\���
	 */
	private String getScdlDlvDate(KU0010010Struct wst, String strDesinatedShipDate,String strTransportLt) throws ParseException,FoundationException
	{
		String rv = null;
	//	SimpleDateFormat sdi = new SimpleDateFormat("yyyy/MM/dd");

		//�o�׎w���
		GregorianCalendar inpDate = new GregorianCalendar();
	//	inpDate.setTime(sdi.parse(strDesinatedShipDate));
		inpDate.setTime(Converter.strToDate(strDesinatedShipDate, "yyyy/MM/dd"));

		//�o�׎w������v�Z����ɂ���
		Date wkDate = inpDate.getTime();

		int addValue = Integer.parseInt(strTransportLt);

		//�Ɩ����t�v�Z
		//�w��[������^�������A�o�׏���L/T������
		WorkDay wkd = new WorkDay(struct.getsUser_ID(),	//���[�U�R�[�h
				this.getBusiness().getBusinessCd(),		//�Ɩ��R�[�h
				struct.getstrPLANT_CD(),					//�H��R�[�h
				wkDate,										//�Ώۓ��t
				addValue,			                		//���Z��
				(addValue < 0 ? true : false)		        //�O�|���t���O
				);
		wkDate = wkd.calcDate();							//�v�Z����
		if(wkDate == null){
			//�G���[
			_sysLog.severe("KQ00040", struct.getsUser_ID());
			AlarmMessageException msg = new AlarmMessageException();
			msg.add("KQ00040");
			throw msg;

		}
	//	rv = new String(sdi.format(wkDate));
		rv = new String(Converter.dateToStr(wkDate, "yyyy/MM/dd"));
		return rv;
	}

	/**
	 * ����ŋ��z�v�Z
	 * @param  String strCustCd �ڋq�R�[�h
     * @param  String strItemCd �i��
     * @param  String strAmount �o�׎w�����z
     * @param  String strCurrncyCd �ʉ݃R�[�h
	 * @return String rv ����ŋ��z
	 *
	 * */
	private String[] doCalcuTaxAmount(KU0010010Struct wst, String strCustCd,
	                                  String strCompanyCd,String strItemCd,
                                      String strAmount, String strCurrncyCd)
                                      throws ParseException, FoundationException, SQLException{

		String rv[] = new String[3];

		//����Ń}�X�^����擾
		wst.setstrTaxIN_COMPANYCD(strCompanyCd);
		wst.setstrTaxIN_CUSTCD(strCustCd);
		//wst.setstrTaxIN_ITEMCD(strItemCd);
		
		String strTaxKbn = "";	//�ō��敪
		String strStartDate ="";	//�V����ŃR�[�h�J�n��
	   	String strTaxRate[] = new String[3];	//�ŗ�
		String strRoundTyp = "";
		//Add Start 20131217 zhang-jq
		//���.�󒍔ԍ��Ŏ擾�����A�@[�󒍖���]."����ŃR�[�h
		String strTAX_CD = "";//����ŃR�[�h
		wst.setg_ODR_NO(this.struct.getg_ODR_NO());
		String strINSPC_ACPT_TYP = "";//�����敪
		strINSPC_ACPT_TYP = wst.getmCust_INSPC_ACPT_TYP();
		
		List ListOdr =  entity.mtbl_T_ODR.read(conn, wst);
		if(ListOdr == null || ListOdr.size() != 1){
		}else{
			strTAX_CD = ((KU0010010Struct)ListOdr.get(0)).gettOdr_TAX_CD().toString();
			wst.setstrTAX_CD(strTAX_CD);
		}
		//Add End 20131217 zhang-jq
		
		List listTax;
	    //Mod Start 20131217 zhang-jq
		//listTax = entity.mgetTax.read(conn, wst);
		listTax = entity.mgetTaxByTaxCd.read(conn, wst);
		//Mod End 20131217 zhang-jq
		
        wst.settCUR_CD(strCurrncyCd);
        List listCur = entity.mtblM_CUR.read(conn, wst);
        int decimalFig = 0;

		if(listTax == null || listTax.size() != 1){
		}else{
			this.TAX_KBN = ((KU0010010Struct)listTax.get(0)).getstrTaxTAX_KBN();
			strStartDate = ((KU0010010Struct)listTax.get(0)).getstrTaxSTART_DATE();
			strRoundTyp = ((KU0010010Struct)listTax.get(0)).getstrTaxROUND_TYP();
			//Mod Start 20131217 zhang-jq
			//�ŗ��ݒ�(�V����ŊJ�n��<=�o�׎w����̏ꍇ�A�V�ŗ�)
			/*if(this.isNewTax(wst, strStartDate)){
				strTaxRate[0] = this.plZero(((KU0010010Struct)listTax.get(0)).getstrTaxNEW_TAX_1());
				strTaxRate[1] = this.plZero(((KU0010010Struct)listTax.get(0)).getstrTaxNEW_TAX_2());
				strTaxRate[2] = this.plZero(((KU0010010Struct)listTax.get(0)).getstrTaxNEW_TAX_3());
			} else {
				strTaxRate[0] = this.plZero(((KU0010010Struct)listTax.get(0)).getstrTaxOLD_TAX_1());
				strTaxRate[1] = this.plZero(((KU0010010Struct)listTax.get(0)).getstrTaxOLD_TAX_2());
				strTaxRate[2] = this.plZero(((KU0010010Struct)listTax.get(0)).getstrTaxOLD_TAX_3());
			}*/
			if ("1".equals(strINSPC_ACPT_TYP)){
				//�u���Ӑ�v. �g�����敪�h�@�� 1�̏ꍇ�i�o�׊�j
				if(this.isNewTax("1",wst, strStartDate)){
					strTaxRate[0] = this.plZero(((KU0010010Struct)listTax.get(0)).getstrTaxNEW_TAX_1());
					strTaxRate[1] = this.plZero(((KU0010010Struct)listTax.get(0)).getstrTaxNEW_TAX_2());
					strTaxRate[2] = this.plZero(((KU0010010Struct)listTax.get(0)).getstrTaxNEW_TAX_3());
				} else {
					strTaxRate[0] = this.plZero(((KU0010010Struct)listTax.get(0)).getstrTaxOLD_TAX_1());
					strTaxRate[1] = this.plZero(((KU0010010Struct)listTax.get(0)).getstrTaxOLD_TAX_2());
					strTaxRate[2] = this.plZero(((KU0010010Struct)listTax.get(0)).getstrTaxOLD_TAX_3());
				}
				
			}else {
				//�u���Ӑ�v. �g�����敪�h�@�� 1�ȊO�̏ꍇ�i��̔����j
				if(this.isNewTax("2",wst, strStartDate)){
					strTaxRate[0] = this.plZero(((KU0010010Struct)listTax.get(0)).getstrTaxNEW_TAX_1());
					strTaxRate[1] = this.plZero(((KU0010010Struct)listTax.get(0)).getstrTaxNEW_TAX_2());
					strTaxRate[2] = this.plZero(((KU0010010Struct)listTax.get(0)).getstrTaxNEW_TAX_3());
				} else {
					strTaxRate[0] = this.plZero(((KU0010010Struct)listTax.get(0)).getstrTaxOLD_TAX_1());
					strTaxRate[1] = this.plZero(((KU0010010Struct)listTax.get(0)).getstrTaxOLD_TAX_2());
					strTaxRate[2] = this.plZero(((KU0010010Struct)listTax.get(0)).getstrTaxOLD_TAX_3());
				}
			}
			//Mod End 20131217 zhang-jq
			
			//�[���敪��ROUND���s��
			ExchAmount ex = new ExchAmount(conn);

            //System.out.println("strTaxRate[0]:" + strTaxRate[0]);
            //System.out.println("strTaxRate[1]:" + strTaxRate[1]);
            //System.out.println("strTaxRate[2]:" + strTaxRate[2]);
            //System.out.println("strAmount:" + strAmount);
            //System.out.println("TAX_KBN:" + this.TAX_KBN);

            if (!listCur.isEmpty()) {
                decimalFig = Integer.parseInt(((KU0010010Struct)listCur.get(0)).gettDECIMAL_FIG());
            }

            //System.out.println("strCurrncyCd:" + strCurrncyCd);
            //System.out.println("strRoundTyp:" + strRoundTyp);
            //System.out.println("decimalFig:" + decimalFig);

			for (int i = 0; i < 3; i ++) {
				String strIn = ex.doMul(strAmount,strTaxRate[i]);
                //System.out.println("�v�Z�OstrIn==" + strIn);
				if ("0".equals(this.TAX_KBN)){
					strIn = "0";
				} else if ("1".equals(this.TAX_KBN)){
					strIn = String.valueOf(Double.parseDouble(strIn) / Double.parseDouble("100"));
				} else {
					strIn = String.valueOf(Double.parseDouble(strIn) / (Double.parseDouble("100")+Double.parseDouble(strTaxRate[i])));
				}
                //System.out.println("�v�Z��strIn==" + strIn);

                //rv[i] = this.doRound(strIn, strRoundTyp);
                if ("2".equals(strRoundTyp)) {
                    // �؂�グ
                    rv[i] = Calculate.ceil(strIn, decimalFig);
                }
                else if ("3".equals(strRoundTyp)) {
                    // �؂�̂�
                    rv[i] = Calculate.floor(strIn, decimalFig);
                }
                else {
                    // �l�̌ܓ�
                    rv[i] = Calculate.round(strIn, decimalFig);
                }
                //System.out.println("rv[" + i + "]:" + rv[i]);

			}
		}

		return rv;
	}

	
	/**
	 * �V����ŃR�[�h�J�n���Ɣ�r
	 *
	 */
	private boolean isNewTax(KU0010010Struct wst, String strStartDate) throws ParseException
	{
		boolean rv = false;

	//	SimpleDateFormat sdi = new SimpleDateFormat("yyyy/MM/dd");

		//�V����ŃR�[�h�J�n��
		GregorianCalendar date1 = new GregorianCalendar();
	//	date1.setTime(sdi.parse(strStartDate));
		date1.setTime(Converter.strToDate(strStartDate, "yyyy/MM/dd"));

		//�o�׎w���
		GregorianCalendar date2 = new GregorianCalendar();
	//	date2.setTime(sdi.parse(wst.getg_DESINATED_SHIP_DATE()));
		date2.setTime(Converter.strToDate(wst.getg_DESINATED_SHIP_DATE(), "yyyy/MM/dd"));


		//�V����ŃR�[�h�J�n�� <= �o�׎w����̏ꍇ�A�V�ŗ�
		if(date1.getTime().compareTo(date2.getTime()) <= 0){
			rv = true;
		}
		return rv;
	}
	//Add Start 20131217 zhang-jq
	/**
	 * �V����ŃR�[�h�J�n���Ɣ�r
	 *
	 */
	private boolean isNewTax(String flag,KU0010010Struct wst, String strStartDate) throws ParseException
	{
		boolean rv = false;
		//�V����ŃR�[�h�J�n��
		GregorianCalendar date1 = new GregorianCalendar();
		
		date1.setTime(Converter.strToDate(strStartDate, "yyyy/MM/dd"));
		//�o�׎w���
		GregorianCalendar date2 = new GregorianCalendar();
		date2.setTime(Converter.strToDate(wst.getg_DESINATED_SHIP_DATE(), "yyyy/MM/dd"));
		//�[�i�\���
		GregorianCalendar date3 = new GregorianCalendar();
		date3.setTime(Converter.strToDate(wst.getin_tShipSlip_SCDL_DLV_DATE(), "yyyy/MM/dd"));
		
		if ("1".equals(flag)){
			//�V����ŃR�[�h�J�n�� <= [�o�׎w��].�o�׎w����̏ꍇ�A�V�ŗ�
			if(date1.getTime().compareTo(date2.getTime()) <= 0){
				rv = true;
			}
		}else{
			//�V����ŃR�[�h�J�n�� <= [�o�׎w��].�[�i�\����̏ꍇ�A�V�ŗ�
			if(date1.getTime().compareTo(date3.getTime()) <= 0){
				rv = true;
			}
		}


		return rv;
	}
//Add End 20131217 zhang-jq
	private String doRound(String strIn, String strRoundTyp){

		String rv = strIn;

		int iPt;
		int i1 = 0;
		double d2,d3;

		iPt = rv.indexOf(".");

		if(iPt != -1){
			String str1 = rv.substring(0, iPt);
			if(!"".equals(str1)){
				i1 = Integer.parseInt(str1);
			}
			d2 = Double.parseDouble(rv.substring(iPt+1));
			d3 = Double.parseDouble(rv.substring(iPt+1,iPt+2));
			if("2".equals(strRoundTyp)){
				if(d2 > 0){
					i1 += 1;
				}
			}else if("1".equals(strRoundTyp)){
				if(d3 > 4){
					i1 += 1;
				}
			}
			rv = i1 + "";
		}
		return rv;
	}

	private String plZero(String strIn){
		String rv = strIn;
		int ipt = rv.indexOf(".");

		if(ipt==0){
			rv="0"+rv;
		}
		return rv;
	}
//--20040108����Ŋ֘AMETHOD------------------------------------------------------------END

	private String replaceNull(String strIn){

		String rv="";

		if(strIn != null){
			rv = strIn;
		}

		return rv;
	}


	private String calMultiply(IDbConnection conn, String strIn1, String strIn2) throws SQLException{

		String rv = "";

		if(!"".equals(strIn1) && !"".equals(strIn2)){
			ExchAmount ex = new ExchAmount(conn);
			rv = ex.doMul(strIn1, strIn2);
		}

		return rv;

	}

	private String calCaseQty(String strShipQty, String strPkgUnitQty){

		String rv = "";

		if(!"".equals(strShipQty) && !"".equals(strPkgUnitQty)){

			rv = Double.parseDouble(strShipQty)/Double.parseDouble(strPkgUnitQty)+ "";
		}

		return rv;

	}

	private String calRestQty(String strShipQty, String strPkgUnitQty){

		String rv = "";

		if(!"".equals(strShipQty) && !"".equals(strPkgUnitQty)){

			rv = Double.parseDouble(strShipQty)%Double.parseDouble(strPkgUnitQty)+ "";

		}

		return rv;

	}

	private String doTruncate(String strIn){

		String rv = "";

		int iPt = strIn.indexOf(".");

		if(iPt != -1){
			rv= strIn.substring(0,iPt);
		}else{
			rv= strIn;
		}

		return rv;

	}

	/**
	 *�@LPAD����
	 *
	 * @return ����
	 */
	private String doLpad(String strIn, int iLen, String strBlank){
		String rv = "";

		int istrInLen = strIn.length();

		if(istrInLen < iLen){
			for(int i=0; i<iLen-istrInLen; i++){
				rv += strBlank;
			}
		}
		rv += strIn;

		return rv;
	}

	/**
		* ��ʑJ�ڃL�[(�󒍔ԍ�)�擾
		* @return �󒍔ԍ�
		*/
	public String getOdrNo() {
		return _odrNo;
	}

	/**
		* ��ʑJ�ڃL�[(�󒍔ԍ�)�ݒ�
		* @param no �󒍔ԍ�
		*/
	public void setOdrNo(String no) {
		_odrNo = no;
	}

	/**
		* ��ʑJ�ڃL�[(���[����)�擾
		* @return ���[����
		*/
	public String getPartDlvSeqNo() {
		return _partDlvSeqNo;
	}

	/**
		* ��ʑJ�ڃL�[(���[����)�ݒ�
		* @param no ���[����
		*/
	public void setPartDlvSeqNo(String no) {
		_partDlvSeqNo = no;
	}

	/**
		* ��ʑJ�ڃL�[(�`�[�ԍ�)�擾
		* @return �`�[�ԍ�
		*/
	public String getSlipCd() {
		return _slipCd;
	}

	/**
		* ��ʑJ�ڃL�[(�`�[�ԍ�)�ݒ�
		* @param cd �`�[�ԍ�
		*/
	public void setSlipCd(String cd) {
		_slipCd = cd;
	}

	/**
		* ��ʑJ�ڃL�[(�o�׌v�悩��o�׎w���o�^���W�I�{�^��)�擾
		* @return �o�׌v�悩��o�׎w���o�^���W�I�{�^��
		*/
	public String getr1ShipOdr() {
		return _r1ShipOdr;
	}

	/**
		* ��ʑJ�ڃL�[(�o�׌v�悩��o�׎w���o�^���W�I�{�^��)�ݒ�
		* @param r �o�׌v�悩��o�׎w���o�^���W�I�{�^��
		*/
	public void setr1ShipOdr(String r) {
		_r1ShipOdr = r;
	}

	/**
		* ��ʑJ�ڃL�[(�o�׎w���폜���W�I�{�^��)�擾
		* @return �o�׎w���폜���W�I�{�^��
		*/
	public String getr2ShipOdr() {
		return _r2ShipOdr;
	}

	/**
		* ��ʑJ�ڃL�[(�o�׎w���폜���W�I�{�^��)�ݒ�
		* @param r �o�׎w���폜���W�I�{�^��
		*/
	public void setr2ShipOdr(String r) {
		_r2ShipOdr = r;
	}

	/**
	 * �o�׎w���s�폜
	 * @param �󒍔ԍ��A���[����
	 * @throws FoundationException
	 **/
	private void deleteUnShipList(String odrNo, String seqNo) throws FoundationException, SQLException {
		List rList = null;
		KU0010010Struct u = new KU0010010Struct();
		
		u.settUnShipList_ACPT_ODR_CD(odrNo);
		u.settUnShipList_PART_DLV_SEQ_NO(seqNo);
		
		entity.mtbl_T_UN_SHIP_LIST.delete(conn, u);
	}

//------------------------------------------------------------------------------
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsearch() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0010");
		logger.entering("KU0010010Control"+":USER="+struct.getsUser_ID(),"controlsearch");
			//{{user_implement_dev:<controlsearch>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
//------------------------------------------------------------------------------------------
		try{

		//	SimpleDateFormat sdi = new SimpleDateFormat("yyyy/MM/dd");

			numberUtil num = new numberUtil();

                        this.conn.beginTransWeb();

                        ////////// ���Ɩ����W�b�N�� //////////
			boolean ok_flg = true;
			// �������ʁi�o�^�E��������ہj�t���O��NG�ɐݒ�
			struct.seth_RESULT("NG");

			//��ʃ��[�h�擾
			String strKMode="";
			String strSelPtn="ORDER";
			strKMode = (String)struct.getk_MODE();
			//strSelPtn = (String)struct.getr_SEL_PTN();
			if (struct.getr_SEL_PTN2().equals("true")) {
				strSelPtn = "CANCEL";
			}

			//�����t���O
			//Vector v_DDF = getToken(struct.geth_DIRECT_DLV_FLG(),",");
			Vector v_DDF = new Vector();
			if (struct.getg_DIRECT_DLV_FLG() == null
				|| struct.getg_DIRECT_DLV_FLG().equals("NULL")) {
				v_DDF.addElement("0");
			}else{
				v_DDF.addElement("1");
			}

			if(strSelPtn.equals("ORDER")){
				// =======================================
				// ��ʕ\���s�����J��Ԃ�
				// =======================================
				for(int i=0;i<hyouji_kensu;i++){

					KU0010010Struct st = struct;//(KU0010010Struct)list.get(i);

					// =======================================
					// ���N�G�X�g��Struct�Ɋi�[
					// =======================================
					//sww�ǉ�2004/07/20
					st.setg_ODR_NO("");									// �󒍔ԍ�
					st.setg_PART_DLV_SEQ_NO("");				// ���[����
					st.setg_SLIP_CD(""); 								// �`�[�ԍ�
					st.setg_DESINATED_SHIP_DATE("");		// �o�׎w���
					st.seth_REST_SHIP_ODR_QTY("");
					st.setg_REST_SHIP_ODR_QTY("");			// �o�׎w��c����
					st.setg_REST_SHIP_ODR_QTY2("");			// �o�׎w�萔��
					st.setg_WH_CD("");									// �ۊǋ�R�[�h
					st.setg_CUST_ANAME("");							// ���Ӑ旪��
					st.seth_CUST_ANAME("");
					st.setg_CUST_ITEM_CD("");						// ���Ӑ�i�ڔԍ�
					st.seth_CUST_ITEM_CD("");
					st.setg_ITEM_CD("");								// �i�ڔԍ�
					st.seth_ITEM_CD("");
					st.setg_DIRECT_DLV_FLG("");					// �݌Ƀ`�F�b�N�Ȃ��t���O
					st.seth_MODIFY_CNT("");

                    st.setg_WH_CD("");				// �ۊǋ�R�[�h
                    st.setg_STOCK_UNIT("");		// �v�ʒP��
                    st.setg_STOCK_UNIT2("");
                    st.setg_WH_NAME("");			// �ۊǋ於
                    st.setg_CUST_CD("");			// ���Ӑ�R�[�h
                    st.setg_CUST_ITEM_NAME("");//���Ӑ�i�ږ�
                    st.setg_ITEM_NAME("");		// �i�ږ�
                    st.setg_CUST_ODR_NO("");	// ���Ӑ撍���ԍ�
					st.seth_MRP_ODR_TYP("");
					st.setg_JOB_ODR_CD("");
					st.setg_ODR_NO((String)struct.getList_g_ODR_NO().get(i));
					st.setg_PART_DLV_SEQ_NO((String)struct.getList_g_PART_DLV_SEQ_NO().get(i));
					//st.setg_DESINATED_SHIP_DATE(this.replaceNull((String)struct.getList_g_DESINATED_SHIP_DATE().get(i)));
					//st.seth_REST_SHIP_ODR_QTY(this.replaceNull(numberUtil.decodeNumberFormat((String)struct.getList_h_REST_SHIP_ODR_QTY().get(i))));
					//st.setg_REST_SHIP_ODR_QTY(this.replaceNull(numberUtil.decodeNumberFormat((String)struct.getList_h_REST_SHIP_ODR_QTY().get(i))));
					//st.setg_REST_SHIP_ODR_QTY2(this.replaceNull(numberUtil.decodeNumberFormat((String)struct.getList_g_REST_SHIP_ODR_QTY2().get(i))));
					//st.setg_WH_CD(this.replaceNull((String)struct.getList_g_WH_CD().get(i)));
					//st.setg_ITEM_CD(this.replaceNull((String)struct.getList_h_ITEM_CD().get(i)));
					//st.setg_DIRECT_DLV_FLG((String)v_DDF.get(i));
					//st.seth_MODIFY_CNT(this.replaceNull((String)struct.getList_h_MODIFY_CNT().get(i)));

                    st.seth_REST_SHIP_ODR_QTY("0");
                    st.setg_REST_SHIP_ODR_QTY("0");
                    st.setg_REST_SHIP_ODR_QTY2("0");

					// =======================================
					// �m��󒍔ԍ��Ƃ����[���Ԃ��ȗ����͎��̍s����������
					// =======================================
					if(st.getg_ODR_NO().equals("") || st.getg_PART_DLV_SEQ_NO().equals("")){
						continue;
					}
					/*if(!strKMode.equals("SEARCH")){
						// =======================================
						// ���͒l�`�F�b�N(�w����t���Ɩ����t�̃`�F�b�N)
						// =======================================
						if(chkRequestParameter(i,st) == false){
							// ���̓G���[������ꍇ�́A���̍s����������
							ok_flg = false;
							continue;
						}
					}
					*/
					// =======================================
					// �o�׌v����̎擾
					// =======================================
					//�L�[�F�󒍔ԍ��A���[����
					st.settAnsDlvDate_IN_ODRNO(st.getg_ODR_NO());
					st.settAnsDlvDate_IN_PARTDLVSEQNO(st.getg_PART_DLV_SEQ_NO());
					st.setsysMyCompany_IN_COMPANYCD(m_kSYS_CLASS);

					List listT_ANS_DLV_DATE = entity.mtbl_T_ANS_DLV_DATE.read(conn, st);

                    // �o�׌v��̑��݃`�F�b�N
					if(listT_ANS_DLV_DATE == null || listT_ANS_DLV_DATE.size() != 1){
						//���݂��Ȃ��Ƃ���������ꍇ�G���[���b�Z�[�W�̏o��
						ok_flg = false;
						//_sysLog.warning("KU00025", struct.getsUser_ID());
						//_sysLog.warning("AA99991", struct.getsUser_ID(), "�󒍔ԍ�", st.getg_ODR_NO());
						//_sysLog.warning("AA99991", struct.getsUser_ID(), "���[����",st.getg_PART_DLV_SEQ_NO());
						//addLineErrorMessage("KU00025", msgStruct,i+1);

						ExpjMessage emsg = new ExpjMessage("ZZ06001");
						msgStruct.addError(emsg);
						continue;
					}else{
                                                // ���݂���ꍇ
						st.setg_ODR_NO(((KU0010010Struct)listT_ANS_DLV_DATE.get(0)).gettAnsDlvDate_ODR_NO());
						st.setg_PART_DLV_SEQ_NO(((KU0010010Struct)listT_ANS_DLV_DATE.get(0)).gettAnsDlvDate_PART_DLV_SEQ_NO());
						if(st.getg_DESINATED_SHIP_DATE().equals("")){
							st.setg_DESINATED_SHIP_DATE(((KU0010010Struct)listT_ANS_DLV_DATE.get(0)).gettAnsDlvDate_DESINATED_SHIP_DATE());
						}else{
							st.setg_DESINATED_SHIP_DATE(st.getg_DESINATED_SHIP_DATE());
						}

						st.setg_REST_SHIP_ODR_QTY(numberUtil.encodeNumberFormat((((KU0010010Struct)listT_ANS_DLV_DATE.get(0)).gettAnsDlvDate_REST_SHIP_ODR_QTY())));

						st.seth_REST_SHIP_ODR_QTY(((KU0010010Struct)listT_ANS_DLV_DATE.get(0)).gettAnsDlvDate_REST_SHIP_ODR_QTY());
						if(st.getg_REST_SHIP_ODR_QTY2().equals("")
								|| Double.parseDouble(st.getg_REST_SHIP_ODR_QTY2()) == 0){
							st.setg_REST_SHIP_ODR_QTY2(((KU0010010Struct)listT_ANS_DLV_DATE.get(0)).gettAnsDlvDate_REST_SHIP_ODR_QTY());
						}else{
							st.setg_REST_SHIP_ODR_QTY2(st.getg_REST_SHIP_ODR_QTY2());
						}

						//TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT
						//if(st.getg_TRANSPORT_TYP().equals("")){
						//	st.setg_TRANSPORT_TYP(((KU0010010Struct)listT_ANS_DLV_DATE.get(0)).gettOdr_TRANSPORT_TYP());
						//}else{
						//	st.setg_TRANSPORT_TYP(st.getg_TRANSPORT_TYP());
						//}
						//LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL

						st.setg_WH_CD(st.getg_WH_CD());
						st.setg_CUST_ANAME(((KU0010010Struct)listT_ANS_DLV_DATE.get(0)).getmCust_CUST_ANAME());
						st.seth_CUST_ANAME(((KU0010010Struct)listT_ANS_DLV_DATE.get(0)).getmCust_CUST_ANAME());
						st.setg_CUST_ITEM_CD(((KU0010010Struct)listT_ANS_DLV_DATE.get(0)).gettOdrCtl_CUST_ITEM_CD());
						st.seth_CUST_ITEM_CD(((KU0010010Struct)listT_ANS_DLV_DATE.get(0)).gettOdrCtl_CUST_ITEM_CD());
						st.setg_ITEM_CD(((KU0010010Struct)listT_ANS_DLV_DATE.get(0)).gettOdrCtl_ITEM_CD());
						st.seth_ITEM_CD(((KU0010010Struct)listT_ANS_DLV_DATE.get(0)).gettOdrCtl_ITEM_CD());

                        st.setg_WH_CD(((KU0010010Struct)listT_ANS_DLV_DATE.get(0)).gettSHIP_WH_CD());
                        st.setg_STOCK_UNIT(((KU0010010Struct)listT_ANS_DLV_DATE.get(0)).gettSTOCK_UNIT());
                        st.setg_STOCK_UNIT2(((KU0010010Struct)listT_ANS_DLV_DATE.get(0)).gettSTOCK_UNIT());
                        st.setg_WH_NAME(((KU0010010Struct)listT_ANS_DLV_DATE.get(0)).gettWH_NAME());
                        st.setg_CUST_CD(((KU0010010Struct)listT_ANS_DLV_DATE.get(0)).gettCUST_CD());
                        st.setg_CUST_ITEM_NAME(((KU0010010Struct)listT_ANS_DLV_DATE.get(0)).gettCUST_ITEM_NAME());
                        st.setg_ITEM_NAME(((KU0010010Struct)listT_ANS_DLV_DATE.get(0)).gettITEM_NAME());
                        st.setg_CUST_ODR_NO(((KU0010010Struct)listT_ANS_DLV_DATE.get(0)).gettCUST_ODR_NO());
                        // ����
                        st.setg_JOB_ODR_CD(((KU0010010Struct)listT_ANS_DLV_DATE.get(0)).getg_JOB_ODR_CD());
                        if(st.getg_JOB_ODR_CD() != null && !st.getg_JOB_ODR_CD().equals("")) {
							st.setc_JOB_ODR_CD("true");
						} else {
							st.setc_JOB_ODR_CD("false");
						}
                        st.seth_JOB_ODR_CD(((KU0010010Struct)listT_ANS_DLV_DATE.get(0)).getg_JOB_ODR_CD());  // ����
                        // �����Ǘ��敪
                        unitQtyType = ((KU0010010Struct)listT_ANS_DLV_DATE.get(0)).gettUNIT_QTY_TYP();

                        if (strKMode.equals("SEARCH")) {
                          st.seth_MODIFY_CNT(((KU0010010Struct)listT_ANS_DLV_DATE.get(0)).gettAnsDlvDate_MODIFY_COUNT());
                          st.seth_PARTIAL_SHIP_INST_FLG(((KU0010010Struct)listT_ANS_DLV_DATE.get(0)).gettOdr_PARTIAL_SHIP_INST_FLG());
                        }

						st.seth_MRP_ODR_TYP(((KU0010010Struct)listT_ANS_DLV_DATE.get(0)).gettMRP_ODR_TYP());
            
						/*
						if(!strKMode.equals("SEARCH")){
							// =======================================
							//�@���[�o�׎w���s�`�F�b�N
							// =======================================
							String strPartialShipInstFlg =this.replaceNull(((KU0010010Struct)listT_ANS_DLV_DATE.get(0)).gettOdr_PARTIAL_SHIP_INST_FLG());

							if("0".equals(strPartialShipInstFlg)){	//���[�o�׎w���s��
								if(!st.geth_REST_SHIP_ODR_QTY().equals(st.getg_REST_SHIP_ODR_QTY2())){
									ok_flg = false;
									//_sysLog.warning("KU00087", struct.getsUser_ID());
									//_sysLog.warning("AA99991", struct.getsUser_ID(), "�󒍔ԍ�", st.getg_ODR_NO());
									//_sysLog.warning("AA99991", struct.getsUser_ID(), "���[����",st.getg_PART_DLV_SEQ_NO());
									//addLineErrorMessage("KU00087", msgStruct,i+1);

									ExpjMessage emsg = new ExpjMessage("KU00087");
									msgStruct.addWarn(emsg);
									continue;
								}

							}

							if(!"1".equals(st.getg_DIRECT_DLV_FLG())){
							//�����ȊO�̏ꍇ

								// =======================================
								//��ʂ�����͂����q�ɂ̃}�X�^���݃`�F�b�N
								// =======================================

								st.setchkisWhCd_IN_WHCD(st.getg_WH_CD());
								st.setchkisWhCd_IN_ITEMCD(st.getg_ITEM_CD());

								List listchkWhCd = entity.mchkIsWhCd.read(conn, st);

								if(listchkWhCd == null || listchkWhCd.size() != 1){
									//���݂��Ȃ��Ƃ���������ꍇ�G���[���b�Z�[�W�̏o��
									listchkWhCd.clear();
									ok_flg = false;
									//_sysLog.warning("KU00086", struct.getsUser_ID());
									//_sysLog.warning("AA99991", struct.getsUser_ID(), "�ۊǋ�R�[�h", st.getg_WH_CD());
									//addLineErrorMessage("KU00086", msgStruct,i+1);

									ExpjMessage emsg = new ExpjMessage("KA00116");
									msgStruct.addWarn(emsg);
									continue;
								}else{
									//�L���݌ɐ��ʂ��擾���ďo�׎w�����Ɣ�r�`�F�b�N
									//�o�׎w����>�L���݌ɐ���(�����ȊO�̏ꍇ�̂�)
									//int intPblShipQty = Integer.parseInt(((KU0010010Struct)listchkWhCd.get(0)).getchkisWhCd_PBL_SHIP_QTY());
									double intPblShipQty = Double.parseDouble(((KU0010010Struct)listchkWhCd.get(0)).getchkisWhCd_PBL_SHIP_QTY());


										//if(intPblShipQty < Integer.parseInt(st.getg_REST_SHIP_ODR_QTY2())){
										if(intPblShipQty < Double.parseDouble(st.getg_REST_SHIP_ODR_QTY2())){
											ok_flg = false;
											//_sysLog.warning("KU00032", struct.getsUser_ID());
											//_sysLog.warning("AA99991", struct.getsUser_ID(), "�ۊǋ�R�[�h", st.getg_WH_CD());
											//addLineErrorMessage("KU00032", msgStruct,i+1);

											ExpjMessage emsg = new ExpjMessage("KU00032");
											msgStruct.addWarn(emsg);
											continue;
										}
								}

                              listchkWhCd.clear();

							} else {
							//�����̏ꍇ
								// =======================================
								//��ʂ�����͂����q�ɂ̃}�X�^���݃`�F�b�N
								// =======================================

								st.setchkis_IN_WHCD(st.getg_WH_CD());

								List listchkisinWhCd = entity.mchkIsInWhCd.read(conn, st);

								if(listchkisinWhCd == null || listchkisinWhCd.size() != 1){
									//���݂��Ȃ��Ƃ���������ꍇ�G���[���b�Z�[�W�̏o��
									listchkisinWhCd.clear();
									ok_flg = false;
									//_sysLog.warning("KU00086", struct.getsUser_ID());
									//_sysLog.warning("AA99991", struct.getsUser_ID(), "�ۊǋ�R�[�h", st.getg_WH_CD());
									//addLineErrorMessage("KA00116", msgStruct,i+1);

									ExpjMessage emsg = new ExpjMessage("KA00116");
									msgStruct.addWarn(emsg);
									continue;
								}

								listchkisinWhCd.clear();
                            }

						}
						*/
					}
					listT_ANS_DLV_DATE = null;
				}//for��END
			}else{
				// =======================================
				// ��ʕ\���s�����J��Ԃ�
				// =======================================

				for(int i=0;i<hyouji_kensu;i++){

					KU0010010Struct st = struct;//(KU0010010Struct)list.get(i);

					// =======================================
					// ���N�G�X�g��Struct�Ɋi�[
					// =======================================
					//sww�ǉ�2004/07/20
					st.setg_ODR_NO("");
					st.setg_PART_DLV_SEQ_NO("");
					st.setg_SLIP_CD("");
					st.setg_DESINATED_SHIP_DATE("");
					st.seth_REST_SHIP_ODR_QTY("");
					st.setg_REST_SHIP_ODR_QTY("");
					st.setg_REST_SHIP_ODR_QTY2("");
					st.setg_WH_CD("");
					st.setg_CUST_ANAME("");
					st.seth_CUST_ANAME("");
					st.setg_CUST_ITEM_CD("");
					st.seth_CUST_ITEM_CD("");
					st.setg_ITEM_CD("");
					st.seth_ITEM_CD("");
					st.setg_DIRECT_DLV_FLG("");
					st.seth_MODIFY_CNT("");

                    st.setg_STOCK_UNIT("");
                    st.setg_STOCK_UNIT2("");
                    st.setg_WH_NAME("");
                    st.setg_CUST_CD("");
                    st.setg_CUST_ITEM_NAME("");
                    st.setg_ITEM_NAME("");
                    st.setg_CUST_ODR_NO("");
					st.setg_JOB_ODR_CD("");



					st.setg_SLIP_CD((String)struct.getList_g_SLIP_CD().get(i)); 	//�`�[�ԍ�
					// =======================================
					// �`�[�ԍ����ȗ����͎��̍s����������
					// =======================================
					if(st.getg_SLIP_CD().equals("")){
						continue;
					}

					// =======================================
					// �o�׎w�����̎擾
					// =======================================
					//�L�[�F�`�[�ԍ�
					st.settShipOdr_IN_SLIPCD(st.getg_SLIP_CD());
                    st.setsysMyCompany_IN_COMPANYCD(m_kSYS_CLASS);

					List listT_SHIP_ODR = entity.mtbl_T_SHIP_ODR.read(conn, st);

					if(listT_SHIP_ODR == null || listT_SHIP_ODR.size() != 1){
						//���݂��Ȃ��Ƃ���������ꍇ�G���[���b�Z�[�W�̏o��
						ok_flg = false;
						//_sysLog.warning("KU00026", struct.getsUser_ID());
						//_sysLog.warning("AA99991", struct.getsUser_ID(), "�`�[�ԍ�", st.getg_SLIP_CD());
						//addLineErrorMessage("KU00026", msgStruct,i+1);
						ExpjMessage emsg = new ExpjMessage("ZZ06001");
						msgStruct.addError(emsg);
						continue;
					}else{
						st.setg_ODR_NO(((KU0010010Struct)listT_SHIP_ODR.get(0)).gettShipOdr_ODR_NO());
						st.setg_PART_DLV_SEQ_NO(((KU0010010Struct)listT_SHIP_ODR.get(0)).gettShipOdr_PART_DLV_SEQ_NO());
						st.setg_SLIP_CD(((KU0010010Struct)listT_SHIP_ODR.get(0)).gettShipOdr_SLIP_CD());
						st.setg_DESINATED_SHIP_DATE(((KU0010010Struct)listT_SHIP_ODR.get(0)).gettShipOdr_DESINATED_SHIP_DATE());
						st.seth_REST_SHIP_ODR_QTY(((KU0010010Struct)listT_SHIP_ODR.get(0)).gettShipOdrAnsDlvDate_REST_SHIP_ODR_QTY());
						st.setg_REST_SHIP_ODR_QTY(numberUtil.encodeNumberFormat(((KU0010010Struct)listT_SHIP_ODR.get(0)).gettShipOdrAnsDlvDate_REST_SHIP_ODR_QTY()));
						st.setg_REST_SHIP_ODR_QTY2(((KU0010010Struct)listT_SHIP_ODR.get(0)).gettShipOdr_SHIP_QTY());
						st.setg_WH_CD(((KU0010010Struct)listT_SHIP_ODR.get(0)).gettShipOdr_ALLCT_WH_CD());
						st.setg_CUST_ANAME(((KU0010010Struct)listT_SHIP_ODR.get(0)).gettShipOdr_CUST_NAME());
						st.seth_CUST_ANAME(((KU0010010Struct)listT_SHIP_ODR.get(0)).gettShipOdr_CUST_NAME());
						st.setg_CUST_ITEM_CD(((KU0010010Struct)listT_SHIP_ODR.get(0)).gettShipOdr_CUST_ITEM_CD());
						st.seth_CUST_ITEM_CD(((KU0010010Struct)listT_SHIP_ODR.get(0)).gettShipOdr_CUST_ITEM_CD());
						st.setg_ITEM_CD(((KU0010010Struct)listT_SHIP_ODR.get(0)).gettShipOdr_ITEM_CD());
						st.seth_ITEM_CD(((KU0010010Struct)listT_SHIP_ODR.get(0)).gettShipOdr_ITEM_CD());
						st.setg_DIRECT_DLV_FLG(((KU0010010Struct)listT_SHIP_ODR.get(0)).gettShipOdr_DIRECT_DLV_FLG());
						st.seth_MODIFY_CNT(((KU0010010Struct)listT_SHIP_ODR.get(0)).gettShipOdr_MODIFY_COUNT());

                        st.setg_STOCK_UNIT(((KU0010010Struct)listT_SHIP_ODR.get(0)).gettSTOCK_UNIT());
                        st.setg_STOCK_UNIT2(((KU0010010Struct)listT_SHIP_ODR.get(0)).gettSTOCK_UNIT());
                        st.setg_WH_NAME(((KU0010010Struct)listT_SHIP_ODR.get(0)).gettWH_NAME());
                        st.setg_CUST_CD(((KU0010010Struct)listT_SHIP_ODR.get(0)).gettCUST_CD());
                        st.setg_CUST_ITEM_NAME(((KU0010010Struct)listT_SHIP_ODR.get(0)).gettCUST_ITEM_NAME());
                        st.setg_ITEM_NAME(((KU0010010Struct)listT_SHIP_ODR.get(0)).gettITEM_NAME());
                        st.setg_CUST_ODR_NO(((KU0010010Struct)listT_SHIP_ODR.get(0)).gettCUST_ODR_NO());
                        st.settAnsDlvDate_MODIFY_COUNT(((KU0010010Struct)listT_SHIP_ODR.get(0)).gettAnsDlvDate_MODIFY_COUNT());

						st.setg_JOB_ODR_CD(((KU0010010Struct)listT_SHIP_ODR.get(0)).gettShipOdr_JOB_ODR_CD());

                        // �����Ǘ��敪
                        unitQtyType = ((KU0010010Struct)listT_SHIP_ODR.get(0)).gettUNIT_QTY_TYP();

                        // �a���o�ׂ̏ꍇ
                        if ( "1".equals(((KU0010010Struct)listT_SHIP_ODR.get(0)).gettDEPO_TRANSFER_PROC_FLG()) ){
				ExpjMessage emsg = new ExpjMessage("KU02012");
				msgStruct.addError(emsg);
                        }

					}
					listT_SHIP_ODR = null;
				}//for��END
			}
			//�x���ȊO�̃G���[�������Ȃ��ꍇOK�ɂ���
			if(ok_flg == true){
				struct.seth_RESULT("OK");
			}else{
				//System.out.println("�`�F�b�N�G���[����");
			}

			// FLASH���Ή�
			if (struct.getg_DIRECT_DLV_FLG().equals("1")){
				struct.setg_DIRECT_DLV_FLG("true");
			}

            ////////// ���Ɩ����W�b�N�� //////////
            this.conn.commit();

		}catch(SQLException e){
			e.printStackTrace();
			// �G���[���b�Z�[�W�쐬
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�


			emsg = new ExpjMessage( "ZZ01006", e.toString());
			sysLog.severe(emsg ,getsysUSER_CD()); //�G�N�Z�v�V�����̏ڍ׏��
			throw ee;
			//sww�C��20040723�J�n
		}catch(Exception e){
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106");
			sysLog.severe(emsg, struct.getsUser_ID());
			ExpjException ee = new ExpjException(e,emsg);
			emsg = new ExpjMessage( "ZZ01106",e.toString());
			sysLog.severe(emsg, struct.getsUser_ID());
			throw ee;
        } finally {

			if(msgStruct.sizeError() <= 0)

				_mode = _SELECT;
			else
				_mode = _NORMAL;

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (FoundationException fe) {

					ExpjMessage emsg = new ExpjMessage( "ZZ01106");
					sysLog.severe(emsg, struct.getsUser_ID());
				   	ExpjException ee = new ExpjException(fe,emsg);
				   	emsg = new ExpjMessage( "AA99991");
				   	sysLog.severe(emsg, struct.getsUser_ID());
				   	emsg = new ExpjMessage( "ZZ01106",fe.toString());
				   	sysLog.severe(emsg, struct.getsUser_ID());
					throw ee;
                	//sww�C��20040723�I��
                }
            }
        }
//------------------------------------------------------------------------------------------
                //}}user_implement_dev:<controlsearch>
		logger.exiting("KU0010010Control"+":USER="+struct.getsUser_ID(),"controlsearch");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlinsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0010");
		logger.entering("KU0010010Control"+":USER="+struct.getsUser_ID(),"controlinsert");
			//{{user_implement_dev:<controlinsert>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		//---------------------------------------------------------------------
		Numbering SHIP_ODR_NO = null;		//�o�׎w���ԍ��̔Ԃ̏���
		Numbering SLIP_CD = null;			//�`�[�ԍ��̔Ԃ̏���

		try {
            this.conn.beginTransWeb();

            ////////// ���Ɩ����W�b�N�� //////////

			boolean ok_flg = true;

			// �������ʁi�o�^�E��������ہj�t���O��NG�ɐݒ�
			//struct.seth_RESULT("NG");

			boolean meisai_update ;

			
			// �ۊǋ於��
			String strWH_NAME = null;
			
			
			//Vector mass = getToken(struct.geth_DIRECT_DLV_FLG(),",");
			Vector mass = new Vector();
			if (struct.getg_DIRECT_DLV_FLG() == null
				|| !struct.getg_DIRECT_DLV_FLG().equals("true")) {
				mass.addElement("0");
			}else{
				mass.addElement("1");
			}
			// =======================================
			// ��ʕ\���s�����J��Ԃ�
			// =======================================
			// i:�s��
			for(int i=0;i<hyouji_kensu;i++){

				KU0010010Struct st = struct;//(KU0010010Struct)list.get(i);

				// =======================================
				// ���N�G�X�g��Struct�Ɋi�[
				// =======================================

				st.setg_ODR_NO((String)struct.getList_g_ODR_NO().get(i)); //�󒍔ԍ�
				st.setg_PART_DLV_SEQ_NO((String)struct.getList_g_PART_DLV_SEQ_NO().get(i)); //���[����
				st.setg_DESINATED_SHIP_DATE((String)struct.getList_g_DESINATED_SHIP_DATE().get(i));//�o�׎w����
				st.setg_REST_SHIP_ODR_QTY2((String)struct.getList_g_REST_SHIP_ODR_QTY2().get(i));//�o�׎w����
				st.setg_WH_CD((String)struct.getList_g_WH_CD().get(i));	//�q��(�ۊǋ�)
				st.setg_DIRECT_DLV_FLG((String)mass.get(i));	//�����t���O
				st.setg_ITEM_CD((String)struct.getList_h_ITEM_CD().get(i));	//�i��
				st.setg_CUST_ANAME((String)struct.getList_h_CUST_ANAME().get(i));	//�ڋq����
				st.setg_CUST_ITEM_CD((String)struct.getList_h_CUST_ITEM_CD().get(i));	//�ڋq�i��
				//st.seth_MODIFY_CNT((String)struct.getList_h_MODIFY_CNT().get(i));	//MODIFYCNT

				// =======================================
				// �󒍔ԍ��A���[���ԏȗ����͎��̍s����������
				// =======================================

				if(st.getg_ODR_NO().equals("") || st.getg_PART_DLV_SEQ_NO().equals("")){
					continue;
				}

				// =======================================
				// �o�׌v����̎擾
				// =======================================
				//�L�[�F�󒍔ԍ��A���[����
				st.settAnsDlvDate_IN_ODRNO(st.getg_ODR_NO());
				st.settAnsDlvDate_IN_PARTDLVSEQNO(st.getg_PART_DLV_SEQ_NO());
				st.setsysMyCompany_IN_COMPANYCD(m_kSYS_CLASS);

				List listT_ANS_DLV_DATE = entity.mtbl_T_ANS_DLV_DATE.read(conn, st);

				if(listT_ANS_DLV_DATE == null || listT_ANS_DLV_DATE.size() != 1){
					//���݂��Ȃ��Ƃ���������ꍇ�G���[���b�Z�[�W�̏o��
					ok_flg = false;
					//_sysLog.warning("KU00025", struct.getsUser_ID());
					//_sysLog.warning("AA99991", struct.getsUser_ID(), "�󒍔ԍ�", st.getg_ODR_NO());
					//_sysLog.warning("AA99991", struct.getsUser_ID(), "���[����",st.getg_PART_DLV_SEQ_NO());
					//addLineErrorMessage("KU00025", msgStruct,i+1);

					ExpjMessage emsg = new ExpjMessage("ZZ06001");
					msgStruct.addError(emsg);

					continue;
				}else{
					//MODIFYCNT�`�F�b�N
					String strModCnt = ((KU0010010Struct)listT_ANS_DLV_DATE.get(0)).gettAnsDlvDate_MODIFY_COUNT();

					if(!strModCnt.equals(st.geth_MODIFY_CNT())){

						ok_flg = false;
						//_sysLog.warning("KU00088", struct.getsUser_ID());
						//_sysLog.warning("AA99991", struct.getsUser_ID(), "�󒍔ԍ�", st.getg_ODR_NO());
						//_sysLog.warning("AA99991", struct.getsUser_ID(), "���[����",st.getg_PART_DLV_SEQ_NO());
						//addLineErrorMessage("KU00088", msgStruct,i+1);

						ExpjMessage emsg = new ExpjMessage("KU00088");
						msgStruct.addError(emsg);

						continue;
					}

					//�o�׎w���c����<�o�׎w�����̏ꍇ
					//int intRestShipOdrQty =Integer.parseInt((((KU0010010Struct)listT_ANS_DLV_DATE.get(0)).gettAnsDlvDate_REST_SHIP_ODR_QTY()));
					//if(intRestShipOdrQty < Integer.parseInt(st.getg_REST_SHIP_ODR_QTY2())){
					double intRestShipOdrQty = Double.parseDouble((((KU0010010Struct)listT_ANS_DLV_DATE.get(0)).gettAnsDlvDate_REST_SHIP_ODR_QTY()));
					if(intRestShipOdrQty < Double.parseDouble(st.getg_REST_SHIP_ODR_QTY2())){

						ok_flg = false;
						//_sysLog.warning("KU00024", struct.getsUser_ID());
						//_sysLog.warning("AA99991", struct.getsUser_ID(), "�󒍔ԍ�", st.getg_ODR_NO());
						//_sysLog.warning("AA99991", struct.getsUser_ID(), "���[����",st.getg_PART_DLV_SEQ_NO());
						//addLineErrorMessage("KU00024", msgStruct,i+1);

						ExpjMessage emsg = new ExpjMessage("KU00024");
						msgStruct.addError(emsg);

						continue;
					}
					else if (Double.parseDouble(st.getg_REST_SHIP_ODR_QTY2()) == 0.00) {
						ok_flg = false;

						ExpjMessage emsg = new ExpjMessage("KU00028");
						msgStruct.addError(emsg);

						continue;
					}

					// =======================================
					// ���͒l�`�F�b�N(�w����t���Ɩ����t�̃`�F�b�N)
					// =======================================
					if(chkRequestParameter(i,st) == false){
						// ���̓G���[������ꍇ�́A���̍s����������
						ok_flg = false;
						continue;
					}

					st.seth_REST_SHIP_ODR_QTY(st.getg_REST_SHIP_ODR_QTY());
/* �N���C�A���g�Ƀ��[�j���O�o���āA�����p���ۂ̓N���C�A���g�ɉʂ������
					// =======================================
					//�@���[�o�׎w���s�`�F�b�N
					// =======================================
					String strPartialShipInstFlg =this.replaceNull(((KU0010010Struct)listT_ANS_DLV_DATE.get(0)).gettOdr_PARTIAL_SHIP_INST_FLG());
//System.out.println("�w�����ʁF"+st.getg_REST_SHIP_ODR_QTY2());
//System.out.println("�c���ʁF"+st.geth_REST_SHIP_ODR_QTY());
					if("0".equals(strPartialShipInstFlg)){	//���[�o�׎w���s��
						if(!st.geth_REST_SHIP_ODR_QTY().equals(st.getg_REST_SHIP_ODR_QTY2())){
							ok_flg = false;
							//_sysLog.warning("KU00087", struct.getsUser_ID());
							//_sysLog.warning("AA99991", struct.getsUser_ID(), "�󒍔ԍ�", st.getg_ODR_NO());
							//_sysLog.warning("AA99991", struct.getsUser_ID(), "���[����",st.getg_PART_DLV_SEQ_NO());
							//addLineErrorMessage("KU00087", msgStruct,i+1);

							ExpjMessage emsg = new ExpjMessage("KU00087");
							msgStruct.addError(emsg);

							continue;
						}
					}
*/
				}

				//�ۊǋ摶�݉�
				// =======================================
				//��ʂ�����͂����q�ɂ̃}�X�^���݃`�F�b�N
				// =======================================
				st.setchkis_IN_WHCD(st.getg_WH_CD());
				List listchkisinWhCd = entity.mchkIsInWhCd.read(conn, st);

				if (listchkisinWhCd == null || listchkisinWhCd.size() != 1) {
					//���݂��Ȃ��Ƃ���������ꍇ�G���[���b�Z�[�W�̏o��
					listchkisinWhCd.clear();
					ok_flg = false;
					//_sysLog.warning("KU00086", struct.getsUser_ID());
					//_sysLog.warning("AA99991", struct.getsUser_ID(), "�ۊǋ�R�[�h", st.getg_WH_CD());
					//addLineErrorMessage("KU00086", msgStruct,i+1);
					ExpjMessage emsg = new ExpjMessage("KA00116");
					msgStruct.addError(emsg);
					continue;
				}else{
						// �ۊǋ於�̎擾
						strWH_NAME = ((KU0010010Struct)listchkisinWhCd.get(0)).getchkisinWhCd_WH_NAME();
				}
				listchkisinWhCd.clear();


				// =======================================
				// ���Ԃ̑��݃`�F�b�N
				// =======================================

				if(!st.getg_JOB_ODR_CD().equals("")) {


					st.setserTJobOdr_JOB_ODR_CD(st.getg_JOB_ODR_CD());		//����
					st.setserTJobOdr_ITEM_CD(st.getg_ITEM_CD()); // �i�ڔԍ�


					List listT_JOB_ODR = entity.mtbl_T_JOB_ODR.read(conn, st);


					if(listT_JOB_ODR == null || listT_JOB_ODR.size() != 1) {
						ok_flg = false;
						ExpjMessage emsg = new ExpjMessage( "KU02014");
						msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
						sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e
						listT_JOB_ODR = null;
						return;
					}
				}


				if (!"1".equals(st.getg_DIRECT_DLV_FLG())) {
					//�����ȊO�̏ꍇ
					st.setchkisWhCd_IN_WHCD(st.getg_WH_CD());
					st.setchkisWhCd_IN_ITEMCD(st.getg_ITEM_CD());
					st.setchkisWhCd_IN_JOBODRCD(st.getg_JOB_ODR_CD());

					List listchkWhCd = null;

					if (st.getchkisWhCd_IN_JOBODRCD() == null || st.getchkisWhCd_IN_JOBODRCD().equals("")){
					// ���Ԃ��Ȃ��Ƃ�
					// �i�ڍ݌Ƀ`�F�b�N
						listchkWhCd = entity.mchkIsWhCd.read(conn, st);
					} else {
					// ���Ԃ�����Ƃ�
					// ���ԍ݌Ƀ`�F�b�N
					listchkWhCd = entity.mchkJocsWhCd.read(conn, st);
					}
					if (listchkWhCd == null || listchkWhCd.size() != 1) {
						listchkWhCd.clear();
						ok_flg = false;
						//_sysLog.warning("KU00086", struct.getsUser_ID());
						//_sysLog.warning("AA99991", struct.getsUser_ID(), "�ۊǋ�R�[�h", st.getg_WH_CD());
						//addLineErrorMessage("KU00086", msgStruct,i+1);

						ExpjMessage emsg = new ExpjMessage("KU00032");
						msgStruct.addError(emsg);

						continue;
					} else {
						//�L���݌ɐ��ʂ��擾���ďo�׎w�����Ɣ�r�`�F�b�N
						//�o�׎w�������L���݌ɐ���(�����ȊO�̏ꍇ�̂�)
						//int intPblShipQty = Integer.parseInt(((KU0010010Struct)listchkWhCd.get(0)).getchkisWhCd_PBL_SHIP_QTY());
						//if(intPblShipQty < Integer.parseInt(st.getg_REST_SHIP_ODR_QTY2())){
						double intPblShipQty = Double.parseDouble(((KU0010010Struct)listchkWhCd.get(0)).getchkisWhCd_PBL_SHIP_QTY());
						if (intPblShipQty < Double.parseDouble(st.getg_REST_SHIP_ODR_QTY2())) {


							ok_flg = false;
							//_sysLog.warning("KU00032", struct.getsUser_ID());
							//_sysLog.warning("AA99991", struct.getsUser_ID(), "�ۊǋ�R�[�h", st.getg_WH_CD());
							//addLineErrorMessage("KU00032", msgStruct,i+1);

							ExpjMessage emsg = new ExpjMessage("KU00032");
							msgStruct.addError(emsg);

							continue;
						}
					}
					listchkWhCd.clear();
				}
		
                // =======================================
                // �x���`�F�b�N
                // =======================================
                st.settWH_CD(st.getg_WH_CD());
                st.settCAL_DATE(st.getg_DESINATED_SHIP_DATE());

                List listM_CAL = entity.mtblM_CAL.read(conn, st);

                if(!listM_CAL.isEmpty()){
                    if ("1".equals( ( (KU0010010Struct) listM_CAL.get(0)).
                                    gettHOLIDAY_FLG())) {
                       ok_flg = false;
                       ExpjMessage emsg = new ExpjMessage("KU02005");
                       msgStruct.addError(emsg);

                       continue;
                   }
                }
                listM_CAL.clear();

                // �����Ǘ��`�F�b�N
                if ("1".equals(unitQtyType)) {
                    // �����Ǘ�
                    if (st.getg_REST_SHIP_ODR_QTY2().indexOf(".") >= 0) {
                        // �������͂̏ꍇ�F�؏グ
                        String tempString = st.getg_REST_SHIP_ODR_QTY2();
                        double tempDouble1 = Double.parseDouble(tempString);
                        st.setg_REST_SHIP_ODR_QTY2(Calculate.ceil(st.getg_REST_SHIP_ODR_QTY2(), 0));
                        double tempDouble2 = Double.parseDouble(st.getg_REST_SHIP_ODR_QTY2());
                        if (tempDouble1 != tempDouble2) {
                            // ".0"���͏��O
                            ExpjMessage emsg = new ExpjMessage("KQ20004");
                            msgStruct.addWarn(emsg);
                        }
                    }
                }

					//System.out.println("Numbering.SHIP_ODR_NO:"+Numbering.SHIP_ODR_NO);
					//System.out.println("st.getsUser_ID():"+st.getsUser_ID());
					//System.out.println("st.getstrPLANT_CD():"+st.getstrPLANT_CD());

				// =======================================
				// �o�׎w���s�a�k�̍쐬
				// =======================================
				//�o�׎w���ԍ��A�`�[�ԍ��������̔Ԃ���
				SHIP_ODR_NO = new Numbering(conn,Numbering.SHIP_ODR_NO,st.getsUser_ID(),"KU0010010",st.getstrPLANT_CD());
				SLIP_CD = new Numbering(conn,Numbering.SLIP_CD,st.getsUser_ID(),"KU0010010",st.getstrPLANT_CD());
				String strSHIP_ODR_NO = SHIP_ODR_NO.getNo();
				String strSLIP_CD = SLIP_CD.getNo();
/*
				String strSLIP_CD = "";
				List listSLIP_CD = entity.mgetSEQ_SHIP_SLIP_CD.read(conn,st);
				if(listSLIP_CD == null || listSLIP_CD.size()==0){
					//�G���[����
				}
				strSLIP_CD =((KU0010010Struct)listSLIP_CD.get(0)).getseqShipSlipCd();
				listSLIP_CD.clear();
*/
				//�󒍖��׃e�[�u��������擾
				st.settOdr_IN_ODRNO(st.getg_ODR_NO());
				List listT_ODR = entity.mtbl_T_ODR.read(conn, st);
				if(listT_ODR == null || listT_ODR.size()==0){
					//�G���[����
				}
				String strOdrCtl = this.replaceNull(((KU0010010Struct)listT_ODR.get(0)).gettOdr_ODR_CTL_NO());//�󒍊Ǘ��ԍ�
				String strCustOdrNo = this.replaceNull(((KU0010010Struct)listT_ODR.get(0)).gettOdr_CUST_ODR_NO());//�ڋq�����ԍ�
				String strDlvLocCd = this.replaceNull(((KU0010010Struct)listT_ODR.get(0)).gettOdr_DLV_LOC_CD());//�[�i�ꏊ�R�[�h
				String strUnitPrice = this.replaceNull(((KU0010010Struct)listT_ODR.get(0)).gettOdr_ODR_UNIT_PRICE());//�P��
				// Mod Start 20140217 liu-chy
				//String strCurrncyCd = this.replaceNull(((KU0010010Struct)listT_ODR.get(0)).gettOdr_CURRNCY_CD());//�ʉ݃R�[�h
				String strCurrncyCd = this.replaceNull(((KU0010010Struct)listT_ODR.get(0)).gettOdr_CUR_CD());//�ʉ݃R�[�h
				// Mod End 20140217 liu-chy
				String strRemarks = this.replaceNull(((KU0010010Struct)listT_ODR.get(0)).gettOdr_REMARKS());//���l
				String strDepoTyp = this.replaceNull(((KU0010010Struct)listT_ODR.get(0)).gettOdr_DEPO_TYP());//�a���q�ɋ敪
				String strTransportCd = this.replaceNull(((KU0010010Struct)listT_ODR.get(0)).gettOdr_TRANSPORT_CD());//�^���փR�[�h
				//String strTryMassPrdTyp = this.replaceNull(((KU0010010Struct)listT_ODR.get(0)).gettOdr_TRY_MASS_PRD_TYP());//����_�ʎY�敪
				String strCustChrgPsnCd = this.replaceNull(((KU0010010Struct)listT_ODR.get(0)).gettOdr_CUST_CHRG_PSN_CD());//�c�ƒS���҃R�[�h
				String strUnitCd = this.replaceNull(((KU0010010Struct)listT_ODR.get(0)).gettOdr_UNIT_CD());	//�P��
				// Mod Start 20140217 liu-chy
                //String strEXCH_TYP = this.replaceNull(((KU0010010Struct)listT_ODR.get(0)).gettOdr_EXCH_TYP()); //�ב֎��
				String strEXCH_TYP = this.replaceNull(((KU0010010Struct)listT_ODR.get(0)).gettOdr_EXCH_TYP_R()); //�ב֎��
                // Mod End 20140217 liu-chy

				//�o�ד`�[�p
				String strPartName = this.replaceNull(((KU0010010Struct)listT_ODR.get(0)).gettOdr_PART_NAME());//�i��
				String strDlvLocNameKanji = this.replaceNull(((KU0010010Struct)listT_ODR.get(0)).gettOdr_DLV_LOC_NAME_KANJI());//�[�i�ꏊ��(����)
				String strBuyerName = this.replaceNull(((KU0010010Struct)listT_ODR.get(0)).gettOdr_BUYER_NAME());//�w���S��
				String strCusDlvCd = this.replaceNull(((KU0010010Struct)listT_ODR.get(0)).gettOdr_CUS_DLV_CD());//�[��NO
				String strCusDlvKeyCd = this.replaceNull(((KU0010010Struct)listT_ODR.get(0)).gettOdr_CUS_DLV_KEY_CD());//�[�i�L�[�ԍ�
				String strDesinatedDlvDate = this.replaceNull(((KU0010010Struct)listT_ODR.get(0)).gettOdr_DESINATED_DLV_DATE());//�w��[��
				String strPuchOdrQtyTotal =this.replaceNull(((KU0010010Struct)listT_ODR.get(0)).gettOdr_PUCH_ODR_QTY_TOTAL());//����������
				String strDlvOdrQty =this.replaceNull(((KU0010010Struct)listT_ODR.get(0)).gettOdr_ODR_QTY());//�[���w����
				String strUnitCdOrg =this.replaceNull(((KU0010010Struct)listT_ODR.get(0)).gettOdr_UNIT_CD_ORG());//�P��(20040107�ϊ��O�P�ʂ���擾�Ɏd�l�ύX)->�o�ד`�[�A���x���p

				String strSlipPricdPringTyp = this.replaceNull(((KU0010010Struct)listT_ODR.get(0)).gettOdr_SLIP_PRICE_PRINT_TYP());//�[�i�����i�\���敪
				String strInspcTyp = this.replaceNull(((KU0010010Struct)listT_ODR.get(0)).gettOdr_INSPC_TYP());//�����敪
				String strClientRemark = this.replaceNull(((KU0010010Struct)listT_ODR.get(0)).gettOdr_CLIENT_REMARK());	//�����Ҕ��l
				String strClientRemarkKanji = this.replaceNull(((KU0010010Struct)listT_ODR.get(0)).gettOdr_CLIENT_REMARK_KANJI());	//�����Ҕ��l(����)
				String strClientBarcodeInf = this.replaceNull(((KU0010010Struct)listT_ODR.get(0)).gettOdr_CLIENT_BARCODE_INF());	//�����҃o�[�R�[�h���

				//�[�i�L�[�擾20040204
				String strIfCtlNo = this.replaceNull(((KU0010010Struct)listT_ODR.get(0)).gettOdr_BUYER_NAME());//IF�Ǘ��ԍ�
				String strShipCnt = this.replaceNull(((KU0010010Struct)listT_ODR.get(0)).gettOdr_SHIP_CNT());//�o�׉�

				//�ݒ�p�[�i�L�[�ԍ�
				String strDlvKeyNo = "";
				if("".equals(strCusDlvKeyCd) || strCusDlvKeyCd ==null){
					//�[�i�L�[�ԍ��̒l�������ꍇ
					//��ڋq�����ԍ��+�+�+��o�׉�+1(3��)�
//mod 04.08.27 g-matsumoto		strDlvKeyNo = strCustOdrNo+"+"+this.doLpad(Integer.parseInt(strShipCnt)+1+"",3,"0");
					strDlvKeyNo = strSHIP_ODR_NO;
				}else{
					//��[�i�L�[�ԍ��+�+�+��o�׉�+1(3��)�
//mod 04.08.27 g-matsumoto		strDlvKeyNo = strCusDlvKeyCd+"+"+this.doLpad(Integer.parseInt(strShipCnt)+1+"",3,"0");
					strDlvKeyNo = strCusDlvKeyCd;
				}

				listT_ODR.clear();

				//�󒍊Ǘ��e�[�u��������擾

				st.settOdrCtl_IN_ODRCTLNO(strOdrCtl);
				List listT_ODR_CTL = entity.mtbl_T_ODR_CTL.read(conn, st);
				if(listT_ODR_CTL == null || listT_ODR_CTL.size()==0){
					//�G���[����
				}
				String strCustCd = this.replaceNull(((KU0010010Struct)listT_ODR_CTL.get(0)).gettOdrCtl_CUST_CD());//�ڋq�R�[�h

				listT_ODR_CTL.clear();


				//�i�ڃ}�X�^������擾
				st.setmItem_IN_ITEMCD(st.getg_ITEM_CD());
				List listM_ITEM = entity.mtbl_M_ITEM.read(conn, st);
				if(listM_ITEM == null || listM_ITEM.size()==0){
					//�G���[����
				}
				String strPkgUnitQty = this.replaceNull(((KU0010010Struct)listM_ITEM.get(0)).getmItem_PKG_UNIT_QTY());//�׎p�P�ʐ�
				String strUnitWeight = this.replaceNull(((KU0010010Struct)listM_ITEM.get(0)).getmItem_UNIT_WEIGHT());//�P�ʏd��

				//System.out.println("�i�ڃ}�X�^�e�[�u��������擾-END");
				listM_ITEM.clear();

				//��ЃR�[�h�̎擾
				String strCompanyCd = "";

				List listCompanyInfo = entity.mgetCompanyInfo.read(conn,st);
				if(listCompanyInfo == null || listCompanyInfo.size() != 1){
					//�G���[����
				}else{
					strCompanyCd =	this.replaceNull(((KU0010010Struct)listCompanyInfo.get(0)).getstrCOMPANY_CD());
				}
				listCompanyInfo = null;

				//�ڋq�[�i�ꏊ����^�������̎擾
				//�L�[:��ЃR�[�h�A�ڋq�R�[�h�A�[�i�ꏊ�R�[�h

				String strTransportLt = "0";
				st.setmCustBase_IN_COMPANYCD(strCompanyCd);
				st.setmCustBase_IN_CUSTCD(strCustCd);
				st.setmCustBase_IN_DLVLOCCD(strDlvLocCd);

				List listMCustBase = entity.mtbl_M_CUST_BASE.read(conn,st);
				if(listMCustBase == null || listMCustBase.size() != 1){
					//�G���[����
				}else{
					strTransportLt = this.replaceNull(((KU0010010Struct)listMCustBase.get(0)).getmCustBase_TRANSPORT_LT());
				}

				//�o�׏���LT�̎擾
				String strSyuKaLt = "0";

				List listShipCd = new ArrayList();
				listShipCd = entity.mgetSYUKA_LT.read(conn,st);
				if(listShipCd == null || listShipCd.size() != 1){
					//�o�׏���LT������/������
					//�G���[���b�Z�[�W�o��
					//_sysLog.warning("ZZ06001", struct.getsUser_ID());
                    ok_flg = false;
					ExpjMessage emsg = new ExpjMessage("KQ00037");
					msgStruct.addError(emsg);
					continue;
					//_sysLog.severe("AA99991", struct.getsUser_ID(), "�R�[�h", struct.getsUser_ID());

					//AlarmMessageException msg = new AlarmMessageException();
					//msg.add("KQ00037");
					//throw msg;

				}else{
					strSyuKaLt = this.replaceNull(((KU0010010Struct)listShipCd.get(0)).getstrSYUKA_LT());
				}

				//�ڋq�}�X�^�̓`�[�敪=1�̏ꍇ�̂�
				//�o�ד`�[�A�o�׃��x���s�a�k���쐬
				//�ڋq�}�X�^���烉�x�����s�敪�̎擾
				//�L�[:��ЃR�[�h�A�ڋq�R�[�h

				String strTaxApplyTyp = "";
				String strCustTaxCd = "";
				String strCust_Aname = ""; //�ڋq����
                String strCust_DETAIL_ROUND_TYP = "";
                //Add Start 20131220 zhang-jq
                String strINSPC_ACPT_TYP = "";//�����敪
                //Add End 20131220 zhang-jq


				st.setmCust_IN_COMPANYCD(strCompanyCd);
				st.setmCust_IN_CUSTCD(strCustCd);
				List listMCust = entity.mtbl_M_CUST.read(conn,st);
				if(listMCust == null || listMCust.size() != 1){
					//�G���[����
				}else{
					strCust_Aname = this.replaceNull(((KU0010010Struct)listMCust.get(0)).getmCust_CUST_ANAME());
                    strCust_DETAIL_ROUND_TYP = this.replaceNull(((KU0010010Struct)listMCust.get(0)).getmCust_DETAIL_ROUND_TYP().toString());
                    //Add Start 20131220 zhang-jq
                    strINSPC_ACPT_TYP = this.replaceNull(((KU0010010Struct)listMCust.get(0)).getmCust_INSPC_ACPT_TYP());
                    st.setmCust_INSPC_ACPT_TYP(strINSPC_ACPT_TYP);
                    //Add End 20131220 zhang-jq
                }

				//�o�׎w���e�[�u���ݒ�
				st.setin_tShipOdr_SHIP_ODR_NO(strSHIP_ODR_NO);			//�o�׎w���ԍ�
				st.setin_tShipOdr_ODR_NO(st.getg_ODR_NO());			//�󒍔ԍ�
				st.setin_tShipOdr_PART_DLV_SEQ_NO(st.getg_PART_DLV_SEQ_NO());	//���[����
				st.setin_tShipOdr_SLIP_CD(strSLIP_CD);				//�`�[�ԍ�
				st.setin_tShipOdr_ITEM_CD(st.getg_ITEM_CD());			//�i��
				st.setin_tShipOdr_CUST_ITEM_CD(st.getg_CUST_ITEM_CD());		//�ڋq�i��
				st.setin_tShipOdr_CUST_ODR_NO(strCustOdrNo);			//�ڋq�����ԍ�
				st.setin_tShipOdr_CUST_CD(strCustCd);				//�ڋq�R�[�h
				st.setin_tShipOdr_CUST_NAME(strCust_Aname);			//�ڋq����
				st.setin_tShipOdr_CUST_CHRG_PSN_CD(strCustChrgPsnCd);		//�c�ƒS���҃R�[�h
				st.setin_tShipOdr_SHIP_ODR_ISS_PSN_CD(struct.getstrUSER_CD());	//���s�S���҃R�[�h(1212-LOGIN���[�U��CD)
				st.setin_tShipOdr_DLV_LOC_CD(strDlvLocCd);			//�[�i�ꏊ�R�[�h
				st.setin_tShipOdr_DEPO_TYP(strDepoTyp);				//�a���q�ɋ敪
				st.setin_tShipOdr_DESINATED_SHIP_DATE(st.getg_DESINATED_SHIP_DATE());	//�o�׎w���
				st.setin_tShipOdr_SHIP_QTY(st.getg_REST_SHIP_ODR_QTY2());		//�o�׎w������
				st.setin_tShipOdr_UNIT_CD(strUnitCd);				//�P��
				st.setin_tShipOdr_UNIT_PRICE(strUnitPrice);			//�P��
				String strAmount = this.calMultiply(conn,st.getg_REST_SHIP_ODR_QTY2(), strUnitPrice);
				st.setin_tShipOdr_JOB_ODR_CD(st.getg_JOB_ODR_CD());			//����

                String strShipOdrAmount = "";
                String strShipOdrAmountExchRates = "";

                ExchAmount ex = new ExchAmount(conn);
//System.out.println("strAmount ===" + strAmount);
//System.out.println("st.getstrCOMPANY_CD() ===" + st.getstrCOMPANY_CD());
//System.out.println("strCurrncyCd ===" + strCurrncyCd);
//System.out.println("strEXCH_TYP ===" + strEXCH_TYP);
//System.out.println("strCust_DETAIL_ROUND_TYP ===" + strCust_DETAIL_ROUND_TYP);
//System.out.println("struct.getstrBUSINESS_OPR_DATE() ===" + struct.getstrBUSINESS_OPR_DATE());
                if(ex.doMarume(strAmount, st.getstrCOMPANY_CD(), strCurrncyCd, strEXCH_TYP, strCust_DETAIL_ROUND_TYP, struct.getstrBUSINESS_OPR_DATE())){
                    strShipOdrAmount = ex.getS_EXCH_AMOUNT();
                }else{
                    ok_flg = false;
                    //_sysLog.warning("KQ00038", struct.getsUser_ID());
                    //_sysLog.severe("AA99991", struct.getsUser_ID(), "��ЃR�[�h", struct.getstrCOMPANY_CD());
                    //_sysLog.severe("AA99991", struct.getsUser_ID(), "�ʉ݃R�[�h", strCurrncyCd);
                    //_sysLog.severe("AA99991", struct.getsUser_ID(), "�בփ^�C�v", strEXCH_TYP);
                    //_sysLog.severe("AA99991", struct.getsUser_ID(), "���t", struct.getstrBUSINESS_OPR_DATE());
                    //addLineErrorMessage("KQ00038", msgStruct,i+1);

					ExpjMessage emsg = new ExpjMessage("KQ00038");
					msgStruct.addError(emsg);

                    continue;
                }
                if(ex.doExchAmount(strShipOdrAmount, st.getstrCOMPANY_CD(), strCurrncyCd, strEXCH_TYP, strCust_DETAIL_ROUND_TYP, struct.getstrBUSINESS_OPR_DATE())){
                    strShipOdrAmountExchRates = ex.getS_EXCH_AMOUNT();
					//System.out.println("�idoExchAmount�j�M�݂Ɋ��Z�����A���Z��l ===" + strShipOdrAmountExchRates);
                }else{
                    ok_flg = false;
                    //_sysLog.warning("KQ00038", struct.getsUser_ID());
                    //_sysLog.severe("AA99991", struct.getsUser_ID(), "��ЃR�[�h", struct.getstrCOMPANY_CD());
                    //_sysLog.severe("AA99991", struct.getsUser_ID(), "�ʉ݃R�[�h", strCurrncyCd);
                    //_sysLog.severe("AA99991", struct.getsUser_ID(), "�בփ^�C�v", strEXCH_TYP);
                    //_sysLog.severe("AA99991", struct.getsUser_ID(), "���t", struct.getstrBUSINESS_OPR_DATE());
                    //addLineErrorMessage("KQ00038", msgStruct,i+1);

					ExpjMessage emsg = new ExpjMessage("KQ00038");
					msgStruct.addError(emsg);

                    continue;
                }

                st.setin_tShipOdr_SHIP_ODR_AMOUNT(new Double(strShipOdrAmount));			//�o�׎w�����z(�o�׎w�����ʁ��P��)
				st.setin_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES(new Double(strShipOdrAmountExchRates));

                st.setin_tShipOdr_CURRNCY_CD(strCurrncyCd);			//�ʉ݃R�[�h

				//�����A�����A�[���A�����̌v�Z
				st.setin_tShipOdr_PKG_UNIT_QTY(strPkgUnitQty);			//����
/*
				String strCaseQty = "";
				String strRestQty = "";
				String strTotalCaseQty = "";

				strCaseQty = this.doTruncate(this.calCaseQty(st.getg_REST_SHIP_ODR_QTY2(), strPkgUnitQty));
				strRestQty = this.doTruncate(this.calRestQty(st.getg_REST_SHIP_ODR_QTY2(), strPkgUnitQty));

				st.setin_tShipOdr_CASE_QTY(strCaseQty);				//����
				st.setin_tShipOdr_REST_QTY(strRestQty);				//�[��

				if(Double.parseDouble(strRestQty) > 0){
					strTotalCaseQty = this.doTruncate(Double.parseDouble(strCaseQty)+ 1 + "");
				}else{
					strTotalCaseQty = this.doTruncate(strCaseQty);
				}

				st.setin_tShipOdr_TOTAL_CASE_QTY(strTotalCaseQty);		//����
*/
				st.setin_tShipOdr_REMARKS(strRemarks);				//���l
				st.setin_tShipOdr_TRANSPORT_CD(strTransportCd);			//�^���փR�[�h
				st.setin_tShipOdr_ALLCT_WH_CD(st.getg_WH_CD());			//�����ۊǋ�(�o�בq��)
				st.setin_tShipOdr_ENTRY_TYP("2");				//�f�[�^���͋敪(���:2)
				st.setin_tShipOdr_PRINT_FLG("0");				//���[�o��F
				st.setin_tShipOdr_SHP_CMPLT_FLG("0");				//���я���F
				st.setin_tShipOdr_DEL_FLG("0");				//�폜�e
				st.setin_tShipOdr_DIRECT_DLV_FLG((String)mass.get(i));		//����F

				//�[���\���(�o�ח\����{�^�������{�o�׏���LT)
				int iAddDays = Integer.parseInt(strTransportLt) +  Integer.parseInt(strSyuKaLt) ;
				String strAddDays = String.valueOf(iAddDays);

				String strScdlDlvDate = this.replaceNull(this.getScdlDlvDate(st,st.getg_DESINATED_SHIP_DATE(),strAddDays));
				st.setin_tShipOdr_SCDL_DLV_DATE(strScdlDlvDate);

				//�U�֐�ۊǋ�(�a���q��)
				// [�󒍖���]."�a���q�ɋ敪"���P�O�i�ʏ�j�FNull
				// [�󒍖���]."�a���q�ɋ敪"���Q�O�i�a���j�F[���Ӑ�[�i�ꏊ]."���o�a���ۊǋ�"
				//if(!m_kNORMAL_DEPOTYP.equals(strDepoTyp)){
				if(!m_kNORMAL_DEPOTYP.equals(strDepoTyp)
						&& m_kYOTO_DEPOTYP.equals(strDepoTyp)){
					st.setstrYotaku_IN_WH_TYP(strDepoTyp);
					//List listYOWHCD = entity.mgetYotakuWhCd.read(conn, st);
					//String strYoWhCd = "";
					//if(listYOWHCD == null || listYOWHCD.size() == 0){
					//	//�G���[����
					//}else{
					//	strYoWhCd = ((KU0010010Struct)listYOWHCD.get(0)).getstrYotaku_WH_CD();
					//	listYOWHCD.clear();
					//	st.setin_tShipOdr_TRANSFER_WH_CD(strYoWhCd);
					//}

					String strYoWhCd = this.replaceNull(((KU0010010Struct)listMCustBase.get(0)).getmCustBase_DEPO_WH_CD());
					st.setin_tShipOdr_TRANSFER_WH_CD(strYoWhCd);
				}
				//�[�i�L�[�ԍ�
				st.setin_tShipOdr_DLV_KEY_NO(strDlvKeyNo);

				//�o�׎w�����R�[�h�쐬
				int rv = entity.mtbl_T_SHIP_ODR.create(conn, st);

				// �o�׎w���s�폜
				if (rv == 1) {
					deleteUnShipList(st.getin_tShipOdr_ODR_NO(), st.getin_tShipOdr_PART_DLV_SEQ_NO());
				}
					
				// =======================================
				// �󒍖���TBL�̍X�V(20040701�ǉ�)
				// =======================================
				//�󒍔ԍ��P�ʂŏo�׉񐔂��X�V����B(�o�׉�+1)
				st.setuptOdr_IN_ODRNO(st.getg_ODR_NO());
				st.setuptOdr_SHIP_CNT(Integer.parseInt(strShipCnt)+1+"");
				st.setuptOdr_PART_DLV_COUNT(1+"");
				rv = entity.mupdateT_ODR.update(conn,st);

				// =======================================
				// �o�ד`�[�s�a�k�̍쐬
				// =======================================

				st.setin_tShipSlip_SLIP_CD(strSLIP_CD);					//�`�[�ԍ�							//�`�[�ԍ�
				st.setin_tShipSlip_ITEM_CD(st.getg_ITEM_CD());				//�i��
				st.setin_tShipSlip_CUST_ITEM_CD(st.getg_CUST_ITEM_CD());			//�ڋq�i��
				st.setin_tShipSlip_PART_NAME(strPartName);				//�i��
				st.setin_tShipSlip_CUST_ODR_NO(strCustOdrNo);				//�ڋq�����ԍ�
				st.setin_tShipSlip_CUST_CD(strCustCd);					//�ڋq�R�[�h
				st.setin_tShipSlip_CUST_NAME(strCust_Aname);				//�ڋq����(�ڋq���̂�ݒ�)
				st.setin_tShipSlip_DLV_LOC_CD(strDlvLocCd);				//�[�i�ꏊ�R�[�h
				st.setin_tShipSlip_DLV_LOC_NAME_KANJI(strDlvLocNameKanji);			//�[�i�ꏊ��(����)
				st.setin_tShipSlip_BUYER_NAME(strBuyerName);				//�w���S��
				st.setin_tShipSlip_CUS_DLV_KEY_CD(strDlvKeyNo);				//�[�i�L�[�ԍ�(20040204�d�l�ύX)
				st.setin_tShipSlip_DESINATED_SHIP_DATE(st.getg_DESINATED_SHIP_DATE());	//�o�׎w���
				st.setin_tShipSlip_DESINATED_DLV_DATE(strDesinatedDlvDate);			//�w��[��
				st.setin_tShipSlip_SCDL_DLV_DATE(strScdlDlvDate);				//�[���\���
				st.setin_tShipSlip_PUCH_ODR_QTY_TOTAL(strPuchOdrQtyTotal);			//����������
				st.setin_tShipSlip_DLV_ODR_QTY(strDlvOdrQty);				//�[���w������
				st.setin_tShipSlip_SHIP_ODR_QTY(st.getg_REST_SHIP_ODR_QTY2());		//�o�׎w������
				st.setin_tShipSlip_UNIT_CD(strUnitCdOrg);					//�P��(�ݒ�l�ύX)
				st.setin_tShipSlip_UNIT_PRICE(strUnitPrice);				//�P��

				st.setin_tShipSlip_INSPC_TYP(strInspcTyp);					//�����敪
				st.setin_tShipSlip_CLIENT_REMARK_KANJI(strClientRemark);			//�����Ҕ��l
				st.setin_tShipSlip_CLIENT_BARCODE_INF(strClientBarcodeInf);			//�����҃o�[�R�[�h���
				st.setin_tShipSlip_PRINT_FLG("0");					//���[�o��F
				st.setin_tShipSlip_DEL_FLG("0");					//�폜F

				//����ŋ��z�v�Z
                String taxAmount[] = this.doCalcuTaxAmount(st, strCustCd, strCompanyCd, st.getg_ITEM_CD(), strShipOdrAmount, strCurrncyCd);

				st.setin_tShipSlip_TAX_AMOUNT_1(taxAmount[0]);		// �Ŋz�P
				st.setin_tShipSlip_TAX_AMOUNT_2(taxAmount[1]);		// �Ŋz�Q
				st.setin_tShipSlip_TAX_AMOUNT_3(taxAmount[2]);		// �Ŋz�R

				st.setin_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT("0");	// �O�őΏۋ��z
				st.setin_tShipSlip_INTERNAL_TAX_SALES_AMOUNT("0");	// ���őΏۋ��z
				st.setin_tShipSlip_TAXFREE_SALES_AMOUNT("0");		// ��ېőΏۋ��z
				st.setin_tShipSlip_EXTERNAL_TAX_AMOUNT("0");		// ����Ŋz�i�O�Łj
				st.setin_tShipSlip_INTERNAL_TAX_AMOUNT("0");		// ����Ŋz�i���Łj

                String sTmpTax = Calculate.add(taxAmount[0], taxAmount[1]);
                sTmpTax = Calculate.add(sTmpTax, taxAmount[2]);
                double tmpTax = Double.parseDouble(sTmpTax);
				//double tmpTax = Double.parseDouble(taxAmount[0])
				//			+Double.parseDouble(taxAmount[1])
				//			+Double.parseDouble(taxAmount[2]);
				if ("1".equals(this.TAX_KBN)){
					st.setin_tShipSlip_EXTERNAL_TAX_AMOUNT(String.valueOf(tmpTax));
					st.setin_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT(strShipOdrAmount);
				} else
				if ("5".equals(this.TAX_KBN) || "9".equals(this.TAX_KBN)){
					st.setin_tShipSlip_INTERNAL_TAX_AMOUNT(String.valueOf(tmpTax));
					st.setin_tShipSlip_INTERNAL_TAX_SALES_AMOUNT(strShipOdrAmount);
				} else
				if ("0".equals(this.TAX_KBN)){
					st.setin_tShipSlip_TAXFREE_SALES_AMOUNT(strShipOdrAmount);
				}

				tmpTax = Double.parseDouble(st.getin_tShipSlip_EXTERNAL_TAX_AMOUNT())
						+Double.parseDouble(st.getin_tShipSlip_INTERNAL_TAX_AMOUNT());
				st.setin_tShipSlip_TAX_AMOUNT(String.valueOf(tmpTax));			//����ŋ��z(�~��)-�ݒ薳��

				tmpTax = Double.parseDouble(st.getin_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT())
						+Double.parseDouble(st.getin_tShipSlip_INTERNAL_TAX_SALES_AMOUNT())
						+Double.parseDouble(st.getin_tShipSlip_TAXFREE_SALES_AMOUNT())
						-Double.parseDouble(st.getin_tShipSlip_INTERNAL_TAX_AMOUNT());

				st.setin_tShipSlip_TAX_CREDIT_SALES_AMOUNT(String.valueOf(tmpTax));	// �Ŕ�������z

                String tmpTaxExchRates = "0";
                if(ex.doExchAmount(String.valueOf(tmpTax), st.getstrCOMPANY_CD(), strCurrncyCd, strEXCH_TYP, strCust_DETAIL_ROUND_TYP, struct.getstrBUSINESS_OPR_DATE())){
                    tmpTaxExchRates = ex.getS_EXCH_AMOUNT();
                    //System.out.println("�i�Ŕ�������z�j�M�݂Ɋ��Z�����A���Z�O�l ===" + tmpTax);
                    //System.out.println("�i�Ŕ�������z�j�M�݂Ɋ��Z�����A���Z��l ===" + tmpTaxExchRates);
                }
				st.setin_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT(tmpTaxExchRates);	// �Ŕ�������z�i�M�݁j

				st.setin_tShipSlip_SHIP_ODR_AMOUNT(String.valueOf(tmpTax));	//�o�׎w�����z//sww�C��20040729
				tmpTax = tmpTax + Double.parseDouble(st.getin_tShipSlip_TAX_AMOUNT());
				st.setin_tShipSlip_SHIP_ODR_AMOUNT_TAX(String.valueOf(tmpTax));					//�o�׎w�����z(�ō�)

				//�o�ד`�[���R�[�h�쐬
				rv = entity.mtbl_T_SHIP_SLIP.create(conn, st);

				// =======================================
				// �o�׌v��s�a�k�̍X�V
				// =======================================

				st.setup_tAnsDlvDate_DESINATED_SHIP_DATE(st.getg_DESINATED_SHIP_DATE());//�o�׎w����
				st.setup_tAnsDlvDate_REST_SHIP_ODR_QTY(st.getg_REST_SHIP_ODR_QTY2());//�o�׎w���c����(�I���N���Őݒ�)
				st.setup_tAnsDlvDate_SHIP_ODR_CMPLT_FLG(st.getg_REST_SHIP_ODR_QTY2());//�o�׎w�������e(�I���N���Őݒ�)

				st.setup_tAnsDlvDate_IN_ODRNO(st.getg_ODR_NO());					//�󒍔ԍ�
				st.setup_tAnsDlvDate_IN_PARTDLVSEQNO(st.getg_PART_DLV_SEQ_NO());	//���[����

				//�o�׌v�惌�R�[�h�X�V
				rv = entity.mtbl_T_ANS_DLV_DATE.update(conn, st);

                struct.setg_SLIP_CD(strSLIP_CD); // ��ʓ`�[�ԍ�
			}//�S�̂e�n�q���d�m�c
			mass.clear();

			if(ok_flg == true){
				//����o�^������ɏI������ꍇ
				//_sysLog.warning("KU00099", struct.getsUser_ID());
				//_sysLog.warning("AA99991", struct.getsUser_ID());
				//_msgConfig.addMessage("KU00099", msgStruct.getInfo());

				// �������ʁi�o�^�E��������ہj�t���O��NG�ɐݒ�
				struct.seth_RESULT("NG");

				ExpjMessage emsg = new ExpjMessage("KU00099");
				msgStruct.addInfo(emsg);

			  //�ۊǋ於�̐ݒ�
			  struct.setg_WH_NAME(strWH_NAME);
			
	  	        ////////// ���Ɩ����W�b�N�� //////////
		        this.conn.commit();
			}else{
				this.conn.rollback();
				//System.out.println("�`�F�b�N�G���[����");
			}

			// FLASH���Ή�
			if (struct.getg_DIRECT_DLV_FLG().equals("1")){
				struct.setg_DIRECT_DLV_FLG("true");
			}

            ////////// ���Ɩ����W�b�N�� //////////
            this.conn.commit();

		}catch(SQLException e){
			// �G���[���b�Z�[�W�쐬
			//String error = DBErrorMessage.getMessage(e);
			//_sysLog.warning("AA99999", struct.getsUser_ID(), error);
			//msgStruct.getError().add(error);

			//ExpjMessage emsg = new ExpjMessage("ZZ01006", struct.getsUser_ID(), e.getMessage());
			//msgStruct.addError(emsg);
			e.printStackTrace();
			// �G���[���b�Z�[�W�쐬
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�


			emsg = new ExpjMessage( "ZZ01006", e.toString());
			sysLog.severe(emsg ,getsysUSER_CD()); //�G�N�Z�v�V�����̏ڍ׏��
			throw ee;

		//}catch(AlarmMessageException msg){
		//	throw msg;
			//sww�C��20040723�J�n
		}catch(Exception e){
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106");
			sysLog.severe(emsg, struct.getsUser_ID());
			ExpjException ee = new ExpjException(e,emsg);
			emsg = new ExpjMessage( "ZZ01106",e.toString());
			sysLog.severe(emsg, struct.getsUser_ID());
			throw ee;
        } finally {

			if(msgStruct.sizeError() <= 0)

				_mode = _SELECT;
			else
				_mode = _NORMAL;

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (FoundationException fe) {

					ExpjMessage emsg = new ExpjMessage( "ZZ01106");
					sysLog.severe(emsg, struct.getsUser_ID());
				   	ExpjException ee = new ExpjException(fe,emsg);
				   	emsg = new ExpjMessage( "AA99991");
				   	sysLog.severe(emsg, struct.getsUser_ID());
				   	emsg = new ExpjMessage( "ZZ01106",fe.toString());
				   	sysLog.severe(emsg, struct.getsUser_ID());
					throw ee;
                	//sww�C��20040723�I��
                }
            }
        }
		//---------------------------------------------------------------------
                //}}user_implement_dev:<controlinsert>
		logger.exiting("KU0010010Control"+":USER="+struct.getsUser_ID(),"controlinsert");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0010");
		logger.entering("KU0010010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		//---------------------------------------------------------------------
		try{
			struct.setr_SEL_PTN1("true");
			struct.setr_SEL_PTN2(null);

			struct.seth_RESULT("NG");
			struct.setg_PART_DLV_SEQ_NO("1");

			// ���[�h�ݒ�
			_mode = _NORMAL;

			//���W�I�{�^�����[�h�ݒ�
			//System.out.println("KMODE:"+struct.getk_MODE());
			struct.setk_MODE(struct.getk_MODE());

			//�A���`�ԃ��X�g�{�b�N�X�N���A
		//	struct.setg_TRANSPORT_TYP("");

		}catch(Exception e){
			//sww�C��0040723�J�n
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106");
			sysLog.severe(emsg, struct.getsUser_ID());
			ExpjException ee = new ExpjException(e,emsg);
			emsg = new ExpjMessage( "ZZ01106",e.toString());
			sysLog.severe(emsg, struct.getsUser_ID());
			throw ee;
			//sww�C��0040723�I��
		}
		//---------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("KU0010010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * �폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controltorikeshi() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0010");
		logger.entering("KU0010010Control"+":USER="+struct.getsUser_ID(),"controltorikeshi");
			//{{user_implement_dev:<controltorikeshi>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try{
            this.conn.beginTransWeb();

            ////////// ���Ɩ����W�b�N�� //////////
			boolean ok_flg = true;

			// �������ʁi�o�^�E��������ہj�t���O��NG�ɐݒ�
			//struct.seth_RESULT("NG");

			boolean meisai_update ;

			//Vector mass = getToken(struct.geth_DIRECT_DLV_FLG(),",");
			Vector mass = new Vector();
			if (struct.getg_DIRECT_DLV_FLG() == null
				|| struct.getg_DIRECT_DLV_FLG().equals("NULL")) {
				mass.addElement("0");
			}else{
				mass.addElement("1");
			}
			// =======================================
			// ��ʕ\���s�����J��Ԃ�
			// =======================================
			// i:�s��
			for(int i=0;i<hyouji_kensu;i++){
				KU0010010Struct st = struct;//(KU0010010Struct)list.get(i);
				// =======================================
				// ���N�G�X�g��Struct�Ɋi�[
				// =======================================

				st.setg_SLIP_CD((String)struct.getList_g_SLIP_CD().get(i));			//�`�[�ԍ�
				st.setg_ODR_NO((String)struct.getList_g_ODR_NO().get(i)); 			//�󒍔ԍ�
				st.setg_PART_DLV_SEQ_NO((String)struct.getList_g_PART_DLV_SEQ_NO().get(i)); 	//���[����
				st.setg_DESINATED_SHIP_DATE((String)struct.getList_g_DESINATED_SHIP_DATE().get(i));//�o�׎w����
				st.setg_REST_SHIP_ODR_QTY((String)struct.getList_h_REST_SHIP_ODR_QTY().get(i));	//�o�׎w���c����
				st.setg_REST_SHIP_ODR_QTY2((String)struct.getList_g_REST_SHIP_ODR_QTY2().get(i));//�o�׎w����
				st.setg_WH_CD((String)struct.getList_g_WH_CD().get(i));			//�q��(�ۊǋ�)
				st.setg_DIRECT_DLV_FLG((String)mass.get(i));				//�����t���O
				st.setg_ITEM_CD((String)struct.getList_h_ITEM_CD().get(i));			//�i��
				st.setg_CUST_ANAME((String)struct.getList_h_CUST_ANAME().get(i));		//�ڋq����
				st.setg_CUST_ITEM_CD((String)struct.getList_h_CUST_ITEM_CD().get(i));		//�ڋq�i��
				st.seth_MODIFY_CNT((String)struct.getList_h_MODIFY_CNT().get(i));		//MODIFYCNT

				// =======================================
				// �`�[�ԍ��ȗ����͎��̍s����������
				// =======================================
				if(st.getg_SLIP_CD().equals("")){
					continue;

				}

				// =======================================
				// �G���[�`�F�b�N(�������O�폜���ꂽ�ꍇ�`�F�b�N)
				// =======================================
				//�L�[�F�`�[�ԍ�
				st.settShipOdr_IN_SLIPCD(st.getg_SLIP_CD());

				List listT_SHIP_ODR = entity.mtbl_T_SHIP_ODR.read(conn, st);

				if(listT_SHIP_ODR == null || listT_SHIP_ODR.size() != 1){
					//���݂��Ȃ��Ƃ���������ꍇ�G���[���b�Z�[�W�̏o��
					ok_flg = false;
					//_sysLog.warning("KU00026", struct.getsUser_ID());
					//_sysLog.warning("AA99991", struct.getsUser_ID(), "�`�[�ԍ�", st.getg_SLIP_CD());
					//addLineErrorMessage("KU00026", msgStruct,i+1);

					ExpjMessage emsg = new ExpjMessage("ZZ06001");
					msgStruct.addError(emsg);

					continue;
				}else{
					String strModCnt =((KU0010010Struct)listT_SHIP_ODR.get(0)).gettShipOdr_MODIFY_COUNT();

					//�󒍖��ׂ���o�׉񐔂��擾
					String strOdrPartDlvCnt = "";
					st.settOdr_IN_ODRNO(st.getg_ODR_NO());
					List listT_ODR = entity.mtbl_T_ODR.read(conn, st);
					if(listT_ODR == null || listT_ODR.size()==0){
						//�G���[����
					}else{
						strOdrPartDlvCnt = this.replaceNull(((KU0010010Struct)listT_ODR.get(0)).gettOdr_PART_DLV_COUNT());//���[��
					}

					// =======================================
					// �o�׌v��s�a�k�̍X�V
					// =======================================
					st.settori_tAnsDlvDate_IN_ODRNO(st.getg_ODR_NO());
					st.settori_tAnsDlvDate_IN_PARTDLVSEQNO(st.getg_PART_DLV_SEQ_NO());
					st.settori_tAnsDlvDate_REST_SHIP_ODR_QTY(st.getg_REST_SHIP_ODR_QTY2());
					st.settori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG("0");
					// �r������
					List modifyCountList = entity.mselectModify_Count.read(conn, st);
					if (modifyCountList.isEmpty()) {
						ExpjMessage emsg = new ExpjMessage("ZZ01105");
						msgStruct.addError(emsg);
						conn.rollback();
						return;
					}else{
						KU0010010Struct modifyCountStruct = (KU0010010Struct)modifyCountList.get(0);
						if (st.gettAnsDlvDate_MODIFY_COUNT() != null && !"".equals(st.gettAnsDlvDate_MODIFY_COUNT()) &&!st.gettAnsDlvDate_MODIFY_COUNT().equals(modifyCountStruct.getselMODIFY_COUNT())) {
							ExpjMessage emsg = new ExpjMessage("ZZ01105");
							msgStruct.addError(emsg);
							conn.rollback();
							return;
						}
					}
					int rv = entity.mtoriTbl_T_ANS_DLV_DATE.update(conn,st);

					// =======================================
					// �o�׎w���s�a�k�̎��(�����폜)
					// =======================================
					st.setdel_tShipOdr_IN_SLIPCD(st.getg_SLIP_CD());
					rv = entity.mtbl_T_SHIP_ODR.delete(conn,st);

					// =======================================
					// �󒍖���TBL�̍X�V(20040204�ǉ�)
					// =======================================
					st.setuptOdr_IN_ODRNO(st.getg_ODR_NO());
					st.setuptOdr_PART_DLV_COUNT(Integer.parseInt(strOdrPartDlvCnt)-1+"");
					rv = entity.mtbl_T_ODR.update(conn,st);

					// =======================================
					// �o�ד`�[�s�a�k�̎��(�����폜)
					// =======================================
					st.setdel_tShipSlip_IN_SLIPCD(st.getg_SLIP_CD());
					rv = entity.mtbl_T_SHIP_SLIP.delete(conn,st);

				}
			}//�S�̂e�n�q���d�m�c
			mass.clear();

			if(ok_flg == true){

				//_sysLog.warning("KU00100", struct.getsUser_ID());
				//_sysLog.warning("AA99991", struct.getsUser_ID());
				//_msgConfig.addMessage("KU00100", msgStruct.getInfo());
				// �������ʁi�o�^�E��������ہj�t���O��NG�ɐݒ�
				struct.seth_RESULT("NG");

				ExpjMessage emsg = new ExpjMessage("KU00100");
				msgStruct.addInfo(emsg);

	  	        ////////// ���Ɩ����W�b�N�� //////////
		        this.conn.commit();
			}else{
				this.conn.rollback();
				//System.out.println("�`�F�b�N�G���[����");
			}

			// FLASH���Ή�
			if (struct.getg_DIRECT_DLV_FLG().equals("1")){
				struct.setg_DIRECT_DLV_FLG("true");
			}

		}catch(SQLException e){
			e.printStackTrace();
			// �G���[���b�Z�[�W�쐬
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�


			emsg = new ExpjMessage( "ZZ01006", e.toString());
			sysLog.severe(emsg ,getsysUSER_CD()); //�G�N�Z�v�V�����̏ڍ׏��
			throw ee;

		//sww�C��20040723�J�n
		}catch(Exception e){
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106");
			sysLog.severe(emsg, struct.getsUser_ID());
			ExpjException ee = new ExpjException(e,emsg);
			emsg = new ExpjMessage( "ZZ01106",e.toString());
			sysLog.severe(emsg, struct.getsUser_ID());
			throw ee;
        } finally {

			if(msgStruct.sizeError() <= 0)

				_mode = _SELECT;
			else
				_mode = _NORMAL;

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (FoundationException fe) {

					ExpjMessage emsg = new ExpjMessage( "ZZ01106");
					sysLog.severe(emsg, struct.getsUser_ID());
				   	ExpjException ee = new ExpjException(fe,emsg);
				   	emsg = new ExpjMessage( "AA99991");
				   	sysLog.severe(emsg, struct.getsUser_ID());
				   	emsg = new ExpjMessage( "ZZ01106",fe.toString());
				   	sysLog.severe(emsg, struct.getsUser_ID());
					throw ee;
                	//sww�C��20040723�I��
                }
            }
        }
		//---------------------------------------------------------------------
                //}}user_implement_dev:<controltorikeshi>
		logger.exiting("KU0010010Control"+":USER="+struct.getsUser_ID(),"controltorikeshi");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0010");
		logger.entering("KU0010010Control"+":USER="+struct.getsUser_ID(),"controlclose");
			//{{user_implement_dev:<controlclose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlclose>
		logger.exiting("KU0010010Control"+":USER="+struct.getsUser_ID(),"controlclose");

		return;
	}

	/**
	 * �{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controldummy() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0010");
		logger.entering("KU0010010Control"+":USER="+struct.getsUser_ID(),"controldummy");
			//{{user_implement_dev:<controldummy>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			list = entity.mgetCompanyInfo.read(conn, struct);
			list = entity.mgetUserInfo.read(conn, struct);
			list = entity.mgetGyomuDate.read(conn, struct);
			list = entity.mgetViewLines.read(conn, struct);
			list = entity.mtbl_T_ANS_DLV_DATE.read(conn, struct);
			list = entity.mtbl_T_SHIP_ODR.read(conn, struct);
			list = entity.mtbl_T_ODR.read(conn, struct);
			list = entity.mtbl_M_ITEM.read(conn, struct);
			list = entity.mtbl_T_ODR_CTL.read(conn, struct);
			list = entity.mtbl_M_CUST_BASE.read(conn, struct);
			list = entity.mtbl_M_CUST.read(conn, struct);
			list = entity.mchkIsWhCd.read(conn, struct);
			list = entity.mtblM_UNIT_COST.read(conn, struct);
			list = entity.mtblM_WH.read(conn, struct);
			list = entity.mgetTax.read(conn, struct);
			list = entity.mgetYotakuWhCd.read(conn, struct);
			list = entity.mgetSYUKA_LT.read(conn, struct);
			list = entity.mchkIsInWhCd.read(conn, struct);
			list = entity.mtblM_CAL.read(conn, struct);
			list = entity.mtblM_CUR.read(conn, struct);
		} catch(SQLException e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
		}
                //}}user_implement_dev:<controldummy>
		logger.exiting("KU0010010Control"+":USER="+struct.getsUser_ID(),"controldummy");

		return;
	}

	/**
	 * �{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlPeekerJobOdrCd() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0010");
		logger.entering("KU0010010Control"+":USER="+struct.getsUser_ID(),"controlPeekerJobOdrCd");
			//{{user_implement_dev:<controlPeekerJobOdrCd>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			list = entity.mgetCompanyInfo.read(conn, struct);
			list = entity.mgetUserInfo.read(conn, struct);
			list = entity.mgetGyomuDate.read(conn, struct);
			list = entity.mgetViewLines.read(conn, struct);
			list = entity.mtbl_T_ANS_DLV_DATE.read(conn, struct);
			list = entity.mtbl_T_SHIP_ODR.read(conn, struct);
			list = entity.mtbl_T_ODR.read(conn, struct);
			list = entity.mtbl_M_ITEM.read(conn, struct);
			list = entity.mtbl_T_ODR_CTL.read(conn, struct);
			list = entity.mtbl_M_CUST_BASE.read(conn, struct);
			list = entity.mtbl_M_CUST.read(conn, struct);
			list = entity.mchkIsWhCd.read(conn, struct);
			list = entity.mtblM_UNIT_COST.read(conn, struct);
			list = entity.mtblM_WH.read(conn, struct);
			list = entity.mgetTax.read(conn, struct);
			list = entity.mgetYotakuWhCd.read(conn, struct);
			list = entity.mgetSYUKA_LT.read(conn, struct);
			list = entity.mchkIsInWhCd.read(conn, struct);
			list = entity.mtblM_CAL.read(conn, struct);
			list = entity.mtblM_CUR.read(conn, struct);
			list = entity.mchkJocsWhCd.read(conn, struct);
		} catch(SQLException e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
		}
                //}}user_implement_dev:<controlPeekerJobOdrCd>
		logger.exiting("KU0010010Control"+":USER="+struct.getsUser_ID(),"controlPeekerJobOdrCd");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0010");
		logger.entering("KU0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KU0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0010");
		logger.entering("KU0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		//---------------------------------------------------------------------
		try{
			struct.seth_RESULT("NG");
			struct.setg_PART_DLV_SEQ_NO("1");
			//struct.init();

			// ���[�h�ݒ�
			_mode = _NORMAL;

			// ���b�Z�[�W��`�p��
//			_msgConfig = MessageConfig.getInstance();
//			if(_msgConfig.init() == false){
//				// �G���[����
//				_sysLog.severe("ZZ01106", struct.getsUser_ID());
//				_sysLog.severe("AA99991", struct.getsUser_ID(), "���R", "���b�Z�[�W��`�t�@�C���̏������Ɏ��s���܂����B");

//				AlarmMessageException msg = new AlarmMessageException();
//				msg.add("ZZ01106");		// ���b�Z�[�W����ʏo�͂����
//				throw msg;
//			}

			// =======================================
			// ���Џ��̎擾
			// =======================================
			List listCompanyInfo = entity.mgetCompanyInfo.read(conn,struct);
			if(listCompanyInfo == null || listCompanyInfo.size() != 1){

				//���Џ�񂪖���/������sww�C��0720
				ExpjMessage emsg = new ExpjMessage("KQ00039");
                msgStruct.addError(emsg);	// �G���[���b�Z�[�W�Ƃ��ēo�^
                sysLog.severe(emsg, getsysUSER_CD()); //�G���[���e
                ExpjException ee = new ExpjException(emsg);
                throw ee;

				//���Џ�񂪖���/������
				//_sysLog.severe("KQ00039", struct.getsUser_ID());
				//AlarmMessageException msg = new AlarmMessageException();
				//msg.add("KQ00039");		// ���b�Z�[�W����ʏo�͂����
				//throw msg;

				/*ExpjMessage emsg = new ExpjMessage("KQ00039",  "�Ɩ����F" + _scParam.getProcId());
				ExpjException ee = new ExpjException("KQ00039");
				ee.add(emsg);
				throw ee;*/

			}else{
				struct.setstrCOMPANY_CD(((KU0010010Struct)listCompanyInfo.get(0)).getstrCOMPANY_CD());
			}
			listCompanyInfo = null;

			// =======================================
			// �Ɩ����t�̎擾
			// =======================================
			List listGyomuDate = entity.mgetGyomuDate.read(conn,struct);
			if(listGyomuDate == null || listGyomuDate.size() != 1){
				//�Ɩ����t��񂪖���/������sww�C��0720
				ExpjMessage emsg = new ExpjMessage("KR00017");
				msgStruct.addError(emsg);	// �G���[���b�Z�[�W�Ƃ��ēo�^
				sysLog.warning(emsg, getsysUSER_CD()); //�G���[���e
				ExpjException ee = new ExpjException(emsg);
				throw ee;

				//�Ɩ����t��񂪖���/������
				//_sysLog.warning("KQ00026", struct.getsUser_ID());
				//_sysLog.severe("AA99991", struct.getsUser_ID(), "�H��R�[�h", struct.getstrPLANT_CD());
				//AlarmMessageException msg = new AlarmMessageException();
				//msg.add("KQ00026");		// ���b�Z�[�W����ʏo�͂����
				//throw msg;

				/*ExpjMessage emsg = new ExpjMessage("KR00017",  "�Ɩ����F" + _scParam.getProcId());
				ExpjException ee = new ExpjException("KR00017");
				ee.add(emsg);
				throw ee;*/
			}else{
				struct.setstrBUSINESS_OPR_DATE(((KU0010010Struct)listGyomuDate.get(0)).getstrBUSINESS_OPR_DATE());
				struct.setstrPLANT_CD(((KU0010010Struct)listGyomuDate.get(0)).getstrPLANT_CD());
			}
			listGyomuDate = null;

			// =======================================
			// ���p�ҏ��̎擾
			// =======================================
			struct.setstrUSER_CD(struct.getsUser_ID());
			List listUserInfo = entity.mgetUserInfo.read(conn,struct);
			if(listUserInfo == null || listUserInfo.size() != 1){
				//���[�U��񂪖���/������sww�C��0720
				ExpjMessage emsg = new ExpjMessage("KQ00025");
				msgStruct.addError(emsg);	// �G���[���b�Z�[�W�Ƃ��ēo�^
				sysLog.warning(emsg, getsysUSER_CD()); //�G���[���e
				ExpjException ee = new ExpjException(emsg);
				throw ee;

				//���[�U��񂪖���/������
				//_sysLog.severe("KQ00025", struct.getsUser_ID());
				//_sysLog.severe("AA99991", struct.getsUser_ID(), "���[�U�R�[�h", struct.getsUser_ID());
				//AlarmMessageException msg = new AlarmMessageException();
				//msg.add("KQ00025");		// ���b�Z�[�W����ʏo�͂����
				//throw msg;

				/*ExpjMessage emsg = new ExpjMessage("KQ00025",  "�Ɩ����F" + _scParam.getProcId());
				ExpjException ee = new ExpjException("KQ00025");
				ee.add(emsg);
				throw ee;*/
			}else{
				struct.setstrUSER_NAME(((KU0010010Struct)listUserInfo.get(0)).getstrUSER_NAME());
				struct.setstrSECTION_CD(((KU0010010Struct)listUserInfo.get(0)).getstrSECTION_CD());
				//struct.setstrORG_CD(((KU0010010Struct)listUserInfo.get(0)).getstrORG_CD());
				//struct.setstrORG_NAME(((KU0010010Struct)listUserInfo.get(0)).getstrORG_NAME());
				//struct.setstrORG_ANAME(((KU0010010Struct)listUserInfo.get(0)).getstrORG_ANAME());
				struct.setstrPLANT_NAME(((KU0010010Struct)listUserInfo.get(0)).getstrPLANT_NAME());
				struct.setstrPLANT_ANAME(((KU0010010Struct)listUserInfo.get(0)).getstrPLANT_ANAME());
				struct.setstrCAL_NO(((KU0010010Struct)listUserInfo.get(0)).getstrCAL_NO());

			}
			listUserInfo = null;

			// ��ʑJ�ڂ̌Ăяo����������AStruct�ɉ�ʑJ�ڃL�[��ݒ肵��controlselect()���Ăяo��
			if (isScreenMove() == true) {
	      // �L�[�ƂȂ鍀�ڂ�struct�Ɋi�[���āA�����̃R���g���[�����\�b�h���Ăяo���܂��B



				struct.setr_SEL_PTN1(_r1ShipOdr);
				struct.setr_SEL_PTN2(_r2ShipOdr);

				struct.add2L_g_ODR_NO(_odrNo);
				struct.add2L_g_PART_DLV_SEQ_NO(_partDlvSeqNo);
				struct.add2L_g_SLIP_CD(_slipCd);

				struct.setk_MODE("SEARCH");
				struct.seth_RESULT("NG");

				controlsearch();
			}

		}catch(SQLException e){
			e.printStackTrace();

			// �G���[���b�Z�[�W�쐬
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�

			emsg = new ExpjMessage( "ZZ01006", e.toString());
			sysLog.severe(emsg ,getsysUSER_CD()); //�G�N�Z�v�V�����̏ڍ׏��
			msgStruct.addError(emsg);
			throw ee;
		}catch(ExpjException ee){
        	    throw ee;
		}catch(Exception e){
			//e.printStackTrace();
			//
			//_sysLog.severe("ZZ01106", struct.getsUser_ID());
			//_sysLog.severe("AA99991", struct.getsUser_ID(), "���R", e.getMessage());
			//
			//AlarmMessageException msg = new AlarmMessageException();
			//msg.add("ZZ01106");
			//msg.add("ZZ01006", "�Ɩ����F" + _scParam.getProcId());
			//msg.add("ZZ01006", "�������F�����[�h");
			//msg.add("ZZ01006", "���R�F" + e.getMessage());
			//throw msg;
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106");
			sysLog.severe(emsg, struct.getsUser_ID());
			ExpjException ee = new ExpjException(e,emsg);
			emsg = new ExpjMessage( "ZZ01106",e.toString());
			sysLog.severe(emsg, struct.getsUser_ID());
			throw ee;

			/*ExpjMessage emsg = new ExpjMessage("ZZ01106",  "�Ɩ����F" + _scParam.getProcId());
			ExpjException ee = new ExpjException(e,"ZZ01106");
			ee.add(emsg);
			throw ee;*/
		}
		//---------------------------------------------------------------------

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KU0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0010");
		logger.entering("KU0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			// �_�E�����[�h�t�@�C�����N���A
			// PDF�ECSV�̃_�E�����[�h���s���Ƃ��́A��ʏ��OrHidden�ŁuDOWNLOAD_FILE�v���`���A���̍s�̃R�����g���O���Ă��������B
//			struct.setDOWNLOAD_FILE((String)null);
			// �R���{�{�b�N�X���i�̃f�[�^�̃Z�b�g�͂����ɋL�q���Ă��������B
			// �R���{�{�b�N�X�f�[�^�p��
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("KU0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("search") ) {
				controlsearch();
			} else if( button.equals("insert") ) {
				controlinsert();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("torikeshi") ) {
				controltorikeshi();
			} else if( button.equals("close") ) {
				controlclose();
			} else if( button.equals("dummy") ) {
				controldummy();
			} else if( button.equals("PeekerJobOdrCd") ) {
				controlPeekerJobOdrCd();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
//------------------------------------------------------------------------------
		//------------------------------------------------------------------------------
			// �ʉ݃R���{�{�b�N�X�f�[�^�ݒ�
			//struct.setList_g_WH_CD_val(_WH_CD_val);
			//struct.setList_g_WH_CD_name(_WH_CD_name);
			//struct.copy(struct);

		//------------------------------------------------------------------------------
			// �A���`�ԃR���{�{�b�N�X�f�[�^�ݒ�
			//struct.setList_g_TRANSPORT_TYP_val(_TRANSPORT_TYP.getValList());
			//struct.setList_g_TRANSPORT_TYP_name(_TRANSPORT_TYP.getExplanList());
//------------------------------------------------------------------------------
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// �g���b�Z�[�W�o�͈˗��쐬
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("KU0010010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KU0010010-E999","CSV�̏o�͏���"));
			throw new FoundationException("KU0010010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KU0010010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("KU0010010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KU0010010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("KU0010010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected KU0010010Entity entity;
	protected KU0010010Struct struct;
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

		entity = new KU0010010Entity();
		struct = new KU0010010Struct();

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
	 * KU0010010�N���X�̕W���R���X�g���N�^
	 */
	public KU0010010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
			// TODO: �����ɏ����������L�q���Ă�������
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
				KU0010010Struct key = (KU0010010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("g_PART_DLV_SEQ_NO") && key.getg_PART_DLV_SEQ_NO() != null) {
					msgKey.setKeyValue("g_PART_DLV_SEQ_NO", key.getg_PART_DLV_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("g_DIRECT_DLV_FLG") && key.getg_DIRECT_DLV_FLG() != null) {
					msgKey.setKeyValue("g_DIRECT_DLV_FLG", key.getg_DIRECT_DLV_FLG());
				}
				if(msgKeyType.containsKeyColumn("g_REST_SHIP_ODR_QTY") && key.getg_REST_SHIP_ODR_QTY() != null) {
					msgKey.setKeyValue("g_REST_SHIP_ODR_QTY", key.getg_REST_SHIP_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("g_CUST_ANAME") && key.getg_CUST_ANAME() != null) {
					msgKey.setKeyValue("g_CUST_ANAME", key.getg_CUST_ANAME());
				}
				if(msgKeyType.containsKeyColumn("g_ITEM_CD") && key.getg_ITEM_CD() != null) {
					msgKey.setKeyValue("g_ITEM_CD", key.getg_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("k_MODE") && key.getk_MODE() != null) {
					msgKey.setKeyValue("k_MODE", key.getk_MODE());
				}
				if(msgKeyType.containsKeyColumn("h_RESULT") && key.geth_RESULT() != null) {
					msgKey.setKeyValue("h_RESULT", key.geth_RESULT());
				}
				if(msgKeyType.containsKeyColumn("h_REST_SHIP_ODR_QTY") && key.geth_REST_SHIP_ODR_QTY() != null) {
					msgKey.setKeyValue("h_REST_SHIP_ODR_QTY", key.geth_REST_SHIP_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("h_CUST_ANAME") && key.geth_CUST_ANAME() != null) {
					msgKey.setKeyValue("h_CUST_ANAME", key.geth_CUST_ANAME());
				}
				if(msgKeyType.containsKeyColumn("h_CUST_ITEM_CD") && key.geth_CUST_ITEM_CD() != null) {
					msgKey.setKeyValue("h_CUST_ITEM_CD", key.geth_CUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_CD") && key.geth_ITEM_CD() != null) {
					msgKey.setKeyValue("h_ITEM_CD", key.geth_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("h_AP_SECRTY_TYP") && key.geth_AP_SECRTY_TYP() != null) {
					msgKey.setKeyValue("h_AP_SECRTY_TYP", key.geth_AP_SECRTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_MODIFY_CNT") && key.geth_MODIFY_CNT() != null) {
					msgKey.setKeyValue("h_MODIFY_CNT", key.geth_MODIFY_CNT());
				}
				if(msgKeyType.containsKeyColumn("r_SEL_PTN1") && key.getr_SEL_PTN1() != null) {
					msgKey.setKeyValue("r_SEL_PTN1", key.getr_SEL_PTN1());
				}
				if(msgKeyType.containsKeyColumn("r_SEL_PTN2") && key.getr_SEL_PTN2() != null) {
					msgKey.setKeyValue("r_SEL_PTN2", key.getr_SEL_PTN2());
				}
				if(msgKeyType.containsKeyColumn("g_ODR_NO") && key.getg_ODR_NO() != null) {
					msgKey.setKeyValue("g_ODR_NO", key.getg_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("g_SLIP_CD") && key.getg_SLIP_CD() != null) {
					msgKey.setKeyValue("g_SLIP_CD", key.getg_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("g_DESINATED_SHIP_DATE") && key.getg_DESINATED_SHIP_DATE() != null) {
					msgKey.setKeyValue("g_DESINATED_SHIP_DATE", key.getg_DESINATED_SHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("g_REST_SHIP_ODR_QTY2") && key.getg_REST_SHIP_ODR_QTY2() != null) {
					msgKey.setKeyValue("g_REST_SHIP_ODR_QTY2", key.getg_REST_SHIP_ODR_QTY2());
				}
				if(msgKeyType.containsKeyColumn("g_WH_CD") && key.getg_WH_CD() != null) {
					msgKey.setKeyValue("g_WH_CD", key.getg_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("h_PARTIAL_SHIP_INST_FLG") && key.geth_PARTIAL_SHIP_INST_FLG() != null) {
					msgKey.setKeyValue("h_PARTIAL_SHIP_INST_FLG", key.geth_PARTIAL_SHIP_INST_FLG());
				}
				if(msgKeyType.containsKeyColumn("g_STOCK_UNIT") && key.getg_STOCK_UNIT() != null) {
					msgKey.setKeyValue("g_STOCK_UNIT", key.getg_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("g_STOCK_UNIT2") && key.getg_STOCK_UNIT2() != null) {
					msgKey.setKeyValue("g_STOCK_UNIT2", key.getg_STOCK_UNIT2());
				}
				if(msgKeyType.containsKeyColumn("g_WH_NAME") && key.getg_WH_NAME() != null) {
					msgKey.setKeyValue("g_WH_NAME", key.getg_WH_NAME());
				}
				if(msgKeyType.containsKeyColumn("g_CUST_CD") && key.getg_CUST_CD() != null) {
					msgKey.setKeyValue("g_CUST_CD", key.getg_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("g_CUST_ITEM_NAME") && key.getg_CUST_ITEM_NAME() != null) {
					msgKey.setKeyValue("g_CUST_ITEM_NAME", key.getg_CUST_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("g_ITEM_NAME") && key.getg_ITEM_NAME() != null) {
					msgKey.setKeyValue("g_ITEM_NAME", key.getg_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("g_CUST_ODR_NO") && key.getg_CUST_ODR_NO() != null) {
					msgKey.setKeyValue("g_CUST_ODR_NO", key.getg_CUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("c_JOB_ODR_CD") && key.getc_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("c_JOB_ODR_CD", key.getc_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("h_MRP_ODR_TYP") && key.geth_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("h_MRP_ODR_TYP", key.geth_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_JOB_ODR_CD") && key.geth_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("h_JOB_ODR_CD", key.geth_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("tMRP_ODR_TYP") && key.gettMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("tMRP_ODR_TYP", key.gettMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("chkisWhCd_IN_JOBODRCD") && key.getchkisWhCd_IN_JOBODRCD() != null) {
					msgKey.setKeyValue("chkisWhCd_IN_JOBODRCD", key.getchkisWhCd_IN_JOBODRCD());
				}
				if(msgKeyType.containsKeyColumn("strCOMPANY_CD") && key.getstrCOMPANY_CD() != null) {
					msgKey.setKeyValue("strCOMPANY_CD", key.getstrCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("strUSER_NAME") && key.getstrUSER_NAME() != null) {
					msgKey.setKeyValue("strUSER_NAME", key.getstrUSER_NAME());
				}
				if(msgKeyType.containsKeyColumn("strPLANT_CD") && key.getstrPLANT_CD() != null) {
					msgKey.setKeyValue("strPLANT_CD", key.getstrPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("strSECTION_CD") && key.getstrSECTION_CD() != null) {
					msgKey.setKeyValue("strSECTION_CD", key.getstrSECTION_CD());
				}
				if(msgKeyType.containsKeyColumn("strPLANT_NAME") && key.getstrPLANT_NAME() != null) {
					msgKey.setKeyValue("strPLANT_NAME", key.getstrPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("strPLANT_ANAME") && key.getstrPLANT_ANAME() != null) {
					msgKey.setKeyValue("strPLANT_ANAME", key.getstrPLANT_ANAME());
				}
				if(msgKeyType.containsKeyColumn("strCAL_NO") && key.getstrCAL_NO() != null) {
					msgKey.setKeyValue("strCAL_NO", key.getstrCAL_NO().toString());
				}
				if(msgKeyType.containsKeyColumn("strUSER_CD") && key.getstrUSER_CD() != null) {
					msgKey.setKeyValue("strUSER_CD", key.getstrUSER_CD());
				}
				if(msgKeyType.containsKeyColumn("strBUSINESS_OPR_DATE") && key.getstrBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("strBUSINESS_OPR_DATE", key.getstrBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("strMAX_DISPLAY_ROWNUM") && key.getstrMAX_DISPLAY_ROWNUM() != null) {
					msgKey.setKeyValue("strMAX_DISPLAY_ROWNUM", key.getstrMAX_DISPLAY_ROWNUM().toString());
				}
				if(msgKeyType.containsKeyColumn("tAnsDlvDate_ODR_NO") && key.gettAnsDlvDate_ODR_NO() != null) {
					msgKey.setKeyValue("tAnsDlvDate_ODR_NO", key.gettAnsDlvDate_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("tAnsDlvDate_PART_DLV_SEQ_NO") && key.gettAnsDlvDate_PART_DLV_SEQ_NO() != null) {
					msgKey.setKeyValue("tAnsDlvDate_PART_DLV_SEQ_NO", key.gettAnsDlvDate_PART_DLV_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("tAnsDlvDate_DESINATED_SHIP_DATE") && key.gettAnsDlvDate_DESINATED_SHIP_DATE() != null) {
					msgKey.setKeyValue("tAnsDlvDate_DESINATED_SHIP_DATE", key.gettAnsDlvDate_DESINATED_SHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("tOdrODR_CTL_NO") && key.gettOdrODR_CTL_NO() != null) {
					msgKey.setKeyValue("tOdrODR_CTL_NO", key.gettOdrODR_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("tOdrCtl_CUST_ITEM_CD") && key.gettOdrCtl_CUST_ITEM_CD() != null) {
					msgKey.setKeyValue("tOdrCtl_CUST_ITEM_CD", key.gettOdrCtl_CUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("tOdrCtl_ITEM_CD") && key.gettOdrCtl_ITEM_CD() != null) {
					msgKey.setKeyValue("tOdrCtl_ITEM_CD", key.gettOdrCtl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("mCust_CUST_ANAME") && key.getmCust_CUST_ANAME() != null) {
					msgKey.setKeyValue("mCust_CUST_ANAME", key.getmCust_CUST_ANAME());
				}
				if(msgKeyType.containsKeyColumn("tAnsDlvDate_REST_SHIP_ODR_QTY") && key.gettAnsDlvDate_REST_SHIP_ODR_QTY() != null) {
					msgKey.setKeyValue("tAnsDlvDate_REST_SHIP_ODR_QTY", key.gettAnsDlvDate_REST_SHIP_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("tOdr_TRANSPORT_TYP") && key.gettOdr_TRANSPORT_TYP() != null) {
					msgKey.setKeyValue("tOdr_TRANSPORT_TYP", key.gettOdr_TRANSPORT_TYP());
				}
				if(msgKeyType.containsKeyColumn("tOdr_ODR_UNIT_PRICE") && key.gettOdr_ODR_UNIT_PRICE() != null) {
					msgKey.setKeyValue("tOdr_ODR_UNIT_PRICE", key.gettOdr_ODR_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("tOdr_SPCL_PRICE_TYP") && key.gettOdr_SPCL_PRICE_TYP() != null) {
					msgKey.setKeyValue("tOdr_SPCL_PRICE_TYP", key.gettOdr_SPCL_PRICE_TYP());
				}
				if(msgKeyType.containsKeyColumn("tOdrCtl_CUST_CD") && key.gettOdrCtl_CUST_CD() != null) {
					msgKey.setKeyValue("tOdrCtl_CUST_CD", key.gettOdrCtl_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("tOdr_PARTIAL_SHIP_INST_FLG") && key.gettOdr_PARTIAL_SHIP_INST_FLG() != null) {
					msgKey.setKeyValue("tOdr_PARTIAL_SHIP_INST_FLG", key.gettOdr_PARTIAL_SHIP_INST_FLG());
				}
				if(msgKeyType.containsKeyColumn("tAnsDlvDate_MODIFY_COUNT") && key.gettAnsDlvDate_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("tAnsDlvDate_MODIFY_COUNT", key.gettAnsDlvDate_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("tITEM_NAME") && key.gettITEM_NAME() != null) {
					msgKey.setKeyValue("tITEM_NAME", key.gettITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("tSTOCK_UNIT") && key.gettSTOCK_UNIT() != null) {
					msgKey.setKeyValue("tSTOCK_UNIT", key.gettSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("tUNIT_QTY_TYP") && key.gettUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("tUNIT_QTY_TYP", key.gettUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("tWH_NAME") && key.gettWH_NAME() != null) {
					msgKey.setKeyValue("tWH_NAME", key.gettWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("tSHIP_WH_CD") && key.gettSHIP_WH_CD() != null) {
					msgKey.setKeyValue("tSHIP_WH_CD", key.gettSHIP_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("tCUST_CD") && key.gettCUST_CD() != null) {
					msgKey.setKeyValue("tCUST_CD", key.gettCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("tCUST_ITEM_NAME") && key.gettCUST_ITEM_NAME() != null) {
					msgKey.setKeyValue("tCUST_ITEM_NAME", key.gettCUST_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("tCUST_ODR_NO") && key.gettCUST_ODR_NO() != null) {
					msgKey.setKeyValue("tCUST_ODR_NO", key.gettCUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("g_JOB_ODR_CD") && key.getg_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("g_JOB_ODR_CD", key.getg_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("sysMyCompany_IN_COMPANYCD") && key.getsysMyCompany_IN_COMPANYCD() != null) {
					msgKey.setKeyValue("sysMyCompany_IN_COMPANYCD", key.getsysMyCompany_IN_COMPANYCD());
				}
				if(msgKeyType.containsKeyColumn("tAnsDlvDate_IN_ODRNO") && key.gettAnsDlvDate_IN_ODRNO() != null) {
					msgKey.setKeyValue("tAnsDlvDate_IN_ODRNO", key.gettAnsDlvDate_IN_ODRNO());
				}
				if(msgKeyType.containsKeyColumn("tAnsDlvDate_IN_PARTDLVSEQNO") && key.gettAnsDlvDate_IN_PARTDLVSEQNO() != null) {
					msgKey.setKeyValue("tAnsDlvDate_IN_PARTDLVSEQNO", key.gettAnsDlvDate_IN_PARTDLVSEQNO());
				}
				if(msgKeyType.containsKeyColumn("up_tAnsDlvDate_DESINATED_SHIP_DATE") && key.getup_tAnsDlvDate_DESINATED_SHIP_DATE() != null) {
					msgKey.setKeyValue("up_tAnsDlvDate_DESINATED_SHIP_DATE", key.getup_tAnsDlvDate_DESINATED_SHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("up_tAnsDlvDate_REST_SHIP_ODR_QTY") && key.getup_tAnsDlvDate_REST_SHIP_ODR_QTY() != null) {
					msgKey.setKeyValue("up_tAnsDlvDate_REST_SHIP_ODR_QTY", key.getup_tAnsDlvDate_REST_SHIP_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG") && key.getup_tAnsDlvDate_SHIP_ODR_CMPLT_FLG() != null) {
					msgKey.setKeyValue("up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG", key.getup_tAnsDlvDate_SHIP_ODR_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("up_tAnsDlvDate_IN_ODRNO") && key.getup_tAnsDlvDate_IN_ODRNO() != null) {
					msgKey.setKeyValue("up_tAnsDlvDate_IN_ODRNO", key.getup_tAnsDlvDate_IN_ODRNO());
				}
				if(msgKeyType.containsKeyColumn("up_tAnsDlvDate_IN_PARTDLVSEQNO") && key.getup_tAnsDlvDate_IN_PARTDLVSEQNO() != null) {
					msgKey.setKeyValue("up_tAnsDlvDate_IN_PARTDLVSEQNO", key.getup_tAnsDlvDate_IN_PARTDLVSEQNO());
				}
				if(msgKeyType.containsKeyColumn("tShipOdr_ODR_NO") && key.gettShipOdr_ODR_NO() != null) {
					msgKey.setKeyValue("tShipOdr_ODR_NO", key.gettShipOdr_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("tShipOdr_PART_DLV_SEQ_NO") && key.gettShipOdr_PART_DLV_SEQ_NO() != null) {
					msgKey.setKeyValue("tShipOdr_PART_DLV_SEQ_NO", key.gettShipOdr_PART_DLV_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("tShipOdr_SLIP_CD") && key.gettShipOdr_SLIP_CD() != null) {
					msgKey.setKeyValue("tShipOdr_SLIP_CD", key.gettShipOdr_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("tShipOdr_DESINATED_SHIP_DATE") && key.gettShipOdr_DESINATED_SHIP_DATE() != null) {
					msgKey.setKeyValue("tShipOdr_DESINATED_SHIP_DATE", key.gettShipOdr_DESINATED_SHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("tShipOdr_SHIP_QTY") && key.gettShipOdr_SHIP_QTY() != null) {
					msgKey.setKeyValue("tShipOdr_SHIP_QTY", key.gettShipOdr_SHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("tShipOdr_ALLCT_WH_CD") && key.gettShipOdr_ALLCT_WH_CD() != null) {
					msgKey.setKeyValue("tShipOdr_ALLCT_WH_CD", key.gettShipOdr_ALLCT_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("tShipOdr_CUST_NAME") && key.gettShipOdr_CUST_NAME() != null) {
					msgKey.setKeyValue("tShipOdr_CUST_NAME", key.gettShipOdr_CUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("tShipOdr_CUST_ITEM_CD") && key.gettShipOdr_CUST_ITEM_CD() != null) {
					msgKey.setKeyValue("tShipOdr_CUST_ITEM_CD", key.gettShipOdr_CUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("tShipOdr_ITEM_CD") && key.gettShipOdr_ITEM_CD() != null) {
					msgKey.setKeyValue("tShipOdr_ITEM_CD", key.gettShipOdr_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("tShipOdr_JOB_ODR_CD") && key.gettShipOdr_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("tShipOdr_JOB_ODR_CD", key.gettShipOdr_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("tShipOdrAnsDlvDate_REST_SHIP_ODR_QTY") && key.gettShipOdrAnsDlvDate_REST_SHIP_ODR_QTY() != null) {
					msgKey.setKeyValue("tShipOdrAnsDlvDate_REST_SHIP_ODR_QTY", key.gettShipOdrAnsDlvDate_REST_SHIP_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("tShipOdr_DEL_FLG") && key.gettShipOdr_DEL_FLG() != null) {
					msgKey.setKeyValue("tShipOdr_DEL_FLG", key.gettShipOdr_DEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("tShipOdr_DIRECT_DLV_FLG") && key.gettShipOdr_DIRECT_DLV_FLG() != null) {
					msgKey.setKeyValue("tShipOdr_DIRECT_DLV_FLG", key.gettShipOdr_DIRECT_DLV_FLG());
				}
				if(msgKeyType.containsKeyColumn("tShipOdr_TRANSPORT_TYP") && key.gettShipOdr_TRANSPORT_TYP() != null) {
					msgKey.setKeyValue("tShipOdr_TRANSPORT_TYP", key.gettShipOdr_TRANSPORT_TYP());
				}
				if(msgKeyType.containsKeyColumn("tShipOdr_MODIFY_COUNT") && key.gettShipOdr_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("tShipOdr_MODIFY_COUNT", key.gettShipOdr_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("tDEPO_TRANSFER_PROC_FLG") && key.gettDEPO_TRANSFER_PROC_FLG() != null) {
					msgKey.setKeyValue("tDEPO_TRANSFER_PROC_FLG", key.gettDEPO_TRANSFER_PROC_FLG());
				}
				if(msgKeyType.containsKeyColumn("tShipOdr_IN_SLIPCD") && key.gettShipOdr_IN_SLIPCD() != null) {
					msgKey.setKeyValue("tShipOdr_IN_SLIPCD", key.gettShipOdr_IN_SLIPCD());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_ODR_NO") && key.getin_tShipOdr_ODR_NO() != null) {
					msgKey.setKeyValue("in_tShipOdr_ODR_NO", key.getin_tShipOdr_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_PART_DLV_SEQ_NO") && key.getin_tShipOdr_PART_DLV_SEQ_NO() != null) {
					msgKey.setKeyValue("in_tShipOdr_PART_DLV_SEQ_NO", key.getin_tShipOdr_PART_DLV_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_SLIP_CD") && key.getin_tShipOdr_SLIP_CD() != null) {
					msgKey.setKeyValue("in_tShipOdr_SLIP_CD", key.getin_tShipOdr_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_ITEM_CD") && key.getin_tShipOdr_ITEM_CD() != null) {
					msgKey.setKeyValue("in_tShipOdr_ITEM_CD", key.getin_tShipOdr_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_CUST_ITEM_CD") && key.getin_tShipOdr_CUST_ITEM_CD() != null) {
					msgKey.setKeyValue("in_tShipOdr_CUST_ITEM_CD", key.getin_tShipOdr_CUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_CUST_ODR_NO") && key.getin_tShipOdr_CUST_ODR_NO() != null) {
					msgKey.setKeyValue("in_tShipOdr_CUST_ODR_NO", key.getin_tShipOdr_CUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_CUST_CD") && key.getin_tShipOdr_CUST_CD() != null) {
					msgKey.setKeyValue("in_tShipOdr_CUST_CD", key.getin_tShipOdr_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_CUST_NAME") && key.getin_tShipOdr_CUST_NAME() != null) {
					msgKey.setKeyValue("in_tShipOdr_CUST_NAME", key.getin_tShipOdr_CUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_SHIP_ODR_ISS_PSN_CD") && key.getin_tShipOdr_SHIP_ODR_ISS_PSN_CD() != null) {
					msgKey.setKeyValue("in_tShipOdr_SHIP_ODR_ISS_PSN_CD", key.getin_tShipOdr_SHIP_ODR_ISS_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_DLV_LOC_CD") && key.getin_tShipOdr_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("in_tShipOdr_DLV_LOC_CD", key.getin_tShipOdr_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_DESINATED_SHIP_DATE") && key.getin_tShipOdr_DESINATED_SHIP_DATE() != null) {
					msgKey.setKeyValue("in_tShipOdr_DESINATED_SHIP_DATE", key.getin_tShipOdr_DESINATED_SHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_SHIP_QTY") && key.getin_tShipOdr_SHIP_QTY() != null) {
					msgKey.setKeyValue("in_tShipOdr_SHIP_QTY", key.getin_tShipOdr_SHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_UNIT_PRICE") && key.getin_tShipOdr_UNIT_PRICE() != null) {
					msgKey.setKeyValue("in_tShipOdr_UNIT_PRICE", key.getin_tShipOdr_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_SHIP_ODR_AMOUNT") && key.getin_tShipOdr_SHIP_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("in_tShipOdr_SHIP_ODR_AMOUNT", key.getin_tShipOdr_SHIP_ODR_AMOUNT().toString());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_CURRNCY_CD") && key.getin_tShipOdr_CURRNCY_CD() != null) {
					msgKey.setKeyValue("in_tShipOdr_CURRNCY_CD", key.getin_tShipOdr_CURRNCY_CD());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_PKG_UNIT_QTY") && key.getin_tShipOdr_PKG_UNIT_QTY() != null) {
					msgKey.setKeyValue("in_tShipOdr_PKG_UNIT_QTY", key.getin_tShipOdr_PKG_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_REMARKS") && key.getin_tShipOdr_REMARKS() != null) {
					msgKey.setKeyValue("in_tShipOdr_REMARKS", key.getin_tShipOdr_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_ALLCT_WH_CD") && key.getin_tShipOdr_ALLCT_WH_CD() != null) {
					msgKey.setKeyValue("in_tShipOdr_ALLCT_WH_CD", key.getin_tShipOdr_ALLCT_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_DEPO_TYP") && key.getin_tShipOdr_DEPO_TYP() != null) {
					msgKey.setKeyValue("in_tShipOdr_DEPO_TYP", key.getin_tShipOdr_DEPO_TYP());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_ENTRY_TYP") && key.getin_tShipOdr_ENTRY_TYP() != null) {
					msgKey.setKeyValue("in_tShipOdr_ENTRY_TYP", key.getin_tShipOdr_ENTRY_TYP());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_PRINT_FLG") && key.getin_tShipOdr_PRINT_FLG() != null) {
					msgKey.setKeyValue("in_tShipOdr_PRINT_FLG", key.getin_tShipOdr_PRINT_FLG());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_SHP_CMPLT_FLG") && key.getin_tShipOdr_SHP_CMPLT_FLG() != null) {
					msgKey.setKeyValue("in_tShipOdr_SHP_CMPLT_FLG", key.getin_tShipOdr_SHP_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_DEL_FLG") && key.getin_tShipOdr_DEL_FLG() != null) {
					msgKey.setKeyValue("in_tShipOdr_DEL_FLG", key.getin_tShipOdr_DEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_TRANSPORT_CD") && key.getin_tShipOdr_TRANSPORT_CD() != null) {
					msgKey.setKeyValue("in_tShipOdr_TRANSPORT_CD", key.getin_tShipOdr_TRANSPORT_CD());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_DIRECT_DLV_FLG") && key.getin_tShipOdr_DIRECT_DLV_FLG() != null) {
					msgKey.setKeyValue("in_tShipOdr_DIRECT_DLV_FLG", key.getin_tShipOdr_DIRECT_DLV_FLG());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_CUST_CHRG_PSN_CD") && key.getin_tShipOdr_CUST_CHRG_PSN_CD() != null) {
					msgKey.setKeyValue("in_tShipOdr_CUST_CHRG_PSN_CD", key.getin_tShipOdr_CUST_CHRG_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_UNIT_CD") && key.getin_tShipOdr_UNIT_CD() != null) {
					msgKey.setKeyValue("in_tShipOdr_UNIT_CD", key.getin_tShipOdr_UNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_SCDL_DLV_DATE") && key.getin_tShipOdr_SCDL_DLV_DATE() != null) {
					msgKey.setKeyValue("in_tShipOdr_SCDL_DLV_DATE", key.getin_tShipOdr_SCDL_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_TRANSFER_WH_CD") && key.getin_tShipOdr_TRANSFER_WH_CD() != null) {
					msgKey.setKeyValue("in_tShipOdr_TRANSFER_WH_CD", key.getin_tShipOdr_TRANSFER_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_DLV_KEY_NO") && key.getin_tShipOdr_DLV_KEY_NO() != null) {
					msgKey.setKeyValue("in_tShipOdr_DLV_KEY_NO", key.getin_tShipOdr_DLV_KEY_NO());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES") && key.getin_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES() != null) {
					msgKey.setKeyValue("in_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES", key.getin_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES().toString());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_SHIP_ODR_NO") && key.getin_tShipOdr_SHIP_ODR_NO() != null) {
					msgKey.setKeyValue("in_tShipOdr_SHIP_ODR_NO", key.getin_tShipOdr_SHIP_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_JOB_ODR_CD") && key.getin_tShipOdr_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("in_tShipOdr_JOB_ODR_CD", key.getin_tShipOdr_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("del_tShipOdr_IN_SLIPCD") && key.getdel_tShipOdr_IN_SLIPCD() != null) {
					msgKey.setKeyValue("del_tShipOdr_IN_SLIPCD", key.getdel_tShipOdr_IN_SLIPCD());
				}
				if(msgKeyType.containsKeyColumn("tOdr_ODR_NO") && key.gettOdr_ODR_NO() != null) {
					msgKey.setKeyValue("tOdr_ODR_NO", key.gettOdr_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("tOdr_ODR_TYP") && key.gettOdr_ODR_TYP() != null) {
					msgKey.setKeyValue("tOdr_ODR_TYP", key.gettOdr_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("tOdr_ODR_CTL_NO") && key.gettOdr_ODR_CTL_NO() != null) {
					msgKey.setKeyValue("tOdr_ODR_CTL_NO", key.gettOdr_ODR_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("tOdr_CUST_ODR_NO") && key.gettOdr_CUST_ODR_NO() != null) {
					msgKey.setKeyValue("tOdr_CUST_ODR_NO", key.gettOdr_CUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("tOdr_CUST_CHRG_ORG_CD") && key.gettOdr_CUST_CHRG_ORG_CD() != null) {
					msgKey.setKeyValue("tOdr_CUST_CHRG_ORG_CD", key.gettOdr_CUST_CHRG_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("tOdr_CUST_CHRG_PSN_CD") && key.gettOdr_CUST_CHRG_PSN_CD() != null) {
					msgKey.setKeyValue("tOdr_CUST_CHRG_PSN_CD", key.gettOdr_CUST_CHRG_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("tOdr_ODR_ACPT_ORG_CD") && key.gettOdr_ODR_ACPT_ORG_CD() != null) {
					msgKey.setKeyValue("tOdr_ODR_ACPT_ORG_CD", key.gettOdr_ODR_ACPT_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("tOdr_ODR_ACPT_PSN_CD") && key.gettOdr_ODR_ACPT_PSN_CD() != null) {
					msgKey.setKeyValue("tOdr_ODR_ACPT_PSN_CD", key.gettOdr_ODR_ACPT_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("tOdr_CURRNCY_CD") && key.gettOdr_CURRNCY_CD() != null) {
					msgKey.setKeyValue("tOdr_CURRNCY_CD", key.gettOdr_CURRNCY_CD());
				}
				if(msgKeyType.containsKeyColumn("tOdr_EXCH_TYP") && key.gettOdr_EXCH_TYP() != null) {
					msgKey.setKeyValue("tOdr_EXCH_TYP", key.gettOdr_EXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("tOdr_DLV_LOC_CD") && key.gettOdr_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("tOdr_DLV_LOC_CD", key.gettOdr_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("tOdr_DLV_LOC_CD_EIAJ") && key.gettOdr_DLV_LOC_CD_EIAJ() != null) {
					msgKey.setKeyValue("tOdr_DLV_LOC_CD_EIAJ", key.gettOdr_DLV_LOC_CD_EIAJ());
				}
				if(msgKeyType.containsKeyColumn("tOdr_DLV_LOC_NAME") && key.gettOdr_DLV_LOC_NAME() != null) {
					msgKey.setKeyValue("tOdr_DLV_LOC_NAME", key.gettOdr_DLV_LOC_NAME());
				}
				if(msgKeyType.containsKeyColumn("tOdr_DLV_LOC_NAME_KANJI") && key.gettOdr_DLV_LOC_NAME_KANJI() != null) {
					msgKey.setKeyValue("tOdr_DLV_LOC_NAME_KANJI", key.gettOdr_DLV_LOC_NAME_KANJI());
				}
				if(msgKeyType.containsKeyColumn("tOdr_PRD_ODR_PLACE_CD") && key.gettOdr_PRD_ODR_PLACE_CD() != null) {
					msgKey.setKeyValue("tOdr_PRD_ODR_PLACE_CD", key.gettOdr_PRD_ODR_PLACE_CD());
				}
				if(msgKeyType.containsKeyColumn("tOdr_PART_DLV_COUNT") && key.gettOdr_PART_DLV_COUNT() != null) {
					msgKey.setKeyValue("tOdr_PART_DLV_COUNT", key.gettOdr_PART_DLV_COUNT());
				}
				if(msgKeyType.containsKeyColumn("tOdr_DEPO_TYP") && key.gettOdr_DEPO_TYP() != null) {
					msgKey.setKeyValue("tOdr_DEPO_TYP", key.gettOdr_DEPO_TYP());
				}
				if(msgKeyType.containsKeyColumn("tOdr_DESINATED_DLV_DATE") && key.gettOdr_DESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("tOdr_DESINATED_DLV_DATE", key.gettOdr_DESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("tOdr_STD_DESINATED_RCV_DATE") && key.gettOdr_STD_DESINATED_RCV_DATE() != null) {
					msgKey.setKeyValue("tOdr_STD_DESINATED_RCV_DATE", key.gettOdr_STD_DESINATED_RCV_DATE());
				}
				if(msgKeyType.containsKeyColumn("tOdr_ODR_QTY") && key.gettOdr_ODR_QTY() != null) {
					msgKey.setKeyValue("tOdr_ODR_QTY", key.gettOdr_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("tOdr_REMAIN_UNCONFIRM_ODR_QTY") && key.gettOdr_REMAIN_UNCONFIRM_ODR_QTY() != null) {
					msgKey.setKeyValue("tOdr_REMAIN_UNCONFIRM_ODR_QTY", key.gettOdr_REMAIN_UNCONFIRM_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("tOdr_CANCELED_UNCONFIRM_ODR_QTY") && key.gettOdr_CANCELED_UNCONFIRM_ODR_QTY() != null) {
					msgKey.setKeyValue("tOdr_CANCELED_UNCONFIRM_ODR_QTY", key.gettOdr_CANCELED_UNCONFIRM_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("tOdr_UNIT_CD") && key.gettOdr_UNIT_CD() != null) {
					msgKey.setKeyValue("tOdr_UNIT_CD", key.gettOdr_UNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("tOdr_UNCONFIRM_ODR_BALANCE") && key.gettOdr_UNCONFIRM_ODR_BALANCE() != null) {
					msgKey.setKeyValue("tOdr_UNCONFIRM_ODR_BALANCE", key.gettOdr_UNCONFIRM_ODR_BALANCE());
				}
				if(msgKeyType.containsKeyColumn("tOdr_ODR_AMOUNT") && key.gettOdr_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("tOdr_ODR_AMOUNT", key.gettOdr_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("tOdr_ODR_AMOUNT_EXCH_RATES") && key.gettOdr_ODR_AMOUNT_EXCH_RATES() != null) {
					msgKey.setKeyValue("tOdr_ODR_AMOUNT_EXCH_RATES", key.gettOdr_ODR_AMOUNT_EXCH_RATES());
				}
				if(msgKeyType.containsKeyColumn("tOdr_TOTAL_SHIP_QTY") && key.gettOdr_TOTAL_SHIP_QTY() != null) {
					msgKey.setKeyValue("tOdr_TOTAL_SHIP_QTY", key.gettOdr_TOTAL_SHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("tOdr_SHIP_AMOUNT") && key.gettOdr_SHIP_AMOUNT() != null) {
					msgKey.setKeyValue("tOdr_SHIP_AMOUNT", key.gettOdr_SHIP_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("tOdr_SHIP_AMOUNT_EXCH_RATES") && key.gettOdr_SHIP_AMOUNT_EXCH_RATES() != null) {
					msgKey.setKeyValue("tOdr_SHIP_AMOUNT_EXCH_RATES", key.gettOdr_SHIP_AMOUNT_EXCH_RATES());
				}
				if(msgKeyType.containsKeyColumn("tOdr_RETURN_PRICE") && key.gettOdr_RETURN_PRICE() != null) {
					msgKey.setKeyValue("tOdr_RETURN_PRICE", key.gettOdr_RETURN_PRICE());
				}
				if(msgKeyType.containsKeyColumn("tOdr_RETURN_QTY") && key.gettOdr_RETURN_QTY() != null) {
					msgKey.setKeyValue("tOdr_RETURN_QTY", key.gettOdr_RETURN_QTY());
				}
				if(msgKeyType.containsKeyColumn("tOdr_RETURN_AMOUNT") && key.gettOdr_RETURN_AMOUNT() != null) {
					msgKey.setKeyValue("tOdr_RETURN_AMOUNT", key.gettOdr_RETURN_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("tOdr_RETURN_AMOUNT_EXCH_RATES") && key.gettOdr_RETURN_AMOUNT_EXCH_RATES() != null) {
					msgKey.setKeyValue("tOdr_RETURN_AMOUNT_EXCH_RATES", key.gettOdr_RETURN_AMOUNT_EXCH_RATES());
				}
				if(msgKeyType.containsKeyColumn("tOdr_ODR_CMPLT_FLG") && key.gettOdr_ODR_CMPLT_FLG() != null) {
					msgKey.setKeyValue("tOdr_ODR_CMPLT_FLG", key.gettOdr_ODR_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("tOdr_ODR_CMPLT_DATE") && key.gettOdr_ODR_CMPLT_DATE() != null) {
					msgKey.setKeyValue("tOdr_ODR_CMPLT_DATE", key.gettOdr_ODR_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("tOdr_CUS_DLV_CD") && key.gettOdr_CUS_DLV_CD() != null) {
					msgKey.setKeyValue("tOdr_CUS_DLV_CD", key.gettOdr_CUS_DLV_CD());
				}
				if(msgKeyType.containsKeyColumn("tOdr_CUS_DLV_KEY_CD") && key.gettOdr_CUS_DLV_KEY_CD() != null) {
					msgKey.setKeyValue("tOdr_CUS_DLV_KEY_CD", key.gettOdr_CUS_DLV_KEY_CD());
				}
				if(msgKeyType.containsKeyColumn("tOdr_PART_NAME") && key.gettOdr_PART_NAME() != null) {
					msgKey.setKeyValue("tOdr_PART_NAME", key.gettOdr_PART_NAME());
				}
				if(msgKeyType.containsKeyColumn("tOdr_PKG_UNIT") && key.gettOdr_PKG_UNIT() != null) {
					msgKey.setKeyValue("tOdr_PKG_UNIT", key.gettOdr_PKG_UNIT());
				}
				if(msgKeyType.containsKeyColumn("tOdr_SLIP_PRICE_PRINT_TYP") && key.gettOdr_SLIP_PRICE_PRINT_TYP() != null) {
					msgKey.setKeyValue("tOdr_SLIP_PRICE_PRINT_TYP", key.gettOdr_SLIP_PRICE_PRINT_TYP());
				}
				if(msgKeyType.containsKeyColumn("tOdr_INSPC_TYP") && key.gettOdr_INSPC_TYP() != null) {
					msgKey.setKeyValue("tOdr_INSPC_TYP", key.gettOdr_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("tOdr_CLIENT_REMARK") && key.gettOdr_CLIENT_REMARK() != null) {
					msgKey.setKeyValue("tOdr_CLIENT_REMARK", key.gettOdr_CLIENT_REMARK());
				}
				if(msgKeyType.containsKeyColumn("tOdr_CLIENT_REMARK_KANJI") && key.gettOdr_CLIENT_REMARK_KANJI() != null) {
					msgKey.setKeyValue("tOdr_CLIENT_REMARK_KANJI", key.gettOdr_CLIENT_REMARK_KANJI());
				}
				if(msgKeyType.containsKeyColumn("tOdr_CLIENT_BARCODE_INF") && key.gettOdr_CLIENT_BARCODE_INF() != null) {
					msgKey.setKeyValue("tOdr_CLIENT_BARCODE_INF", key.gettOdr_CLIENT_BARCODE_INF());
				}
				if(msgKeyType.containsKeyColumn("tOdr_TRANSPORT_CD") && key.gettOdr_TRANSPORT_CD() != null) {
					msgKey.setKeyValue("tOdr_TRANSPORT_CD", key.gettOdr_TRANSPORT_CD());
				}
				if(msgKeyType.containsKeyColumn("tOdr_TAX_APPLY_TYP") && key.gettOdr_TAX_APPLY_TYP() != null) {
					msgKey.setKeyValue("tOdr_TAX_APPLY_TYP", key.gettOdr_TAX_APPLY_TYP());
				}
				if(msgKeyType.containsKeyColumn("tOdr_TAX_CD") && key.gettOdr_TAX_CD() != null) {
					msgKey.setKeyValue("tOdr_TAX_CD", key.gettOdr_TAX_CD());
				}
				if(msgKeyType.containsKeyColumn("tOdr_TAX_CALC_TYP") && key.gettOdr_TAX_CALC_TYP() != null) {
					msgKey.setKeyValue("tOdr_TAX_CALC_TYP", key.gettOdr_TAX_CALC_TYP());
				}
				if(msgKeyType.containsKeyColumn("tOdr_REMARKS") && key.gettOdr_REMARKS() != null) {
					msgKey.setKeyValue("tOdr_REMARKS", key.gettOdr_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("tOdr_ODR_ACPT_DATE") && key.gettOdr_ODR_ACPT_DATE() != null) {
					msgKey.setKeyValue("tOdr_ODR_ACPT_DATE", key.gettOdr_ODR_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("tOdr_SHIP_PLAN_REMAIN_QTY") && key.gettOdr_SHIP_PLAN_REMAIN_QTY() != null) {
					msgKey.setKeyValue("tOdr_SHIP_PLAN_REMAIN_QTY", key.gettOdr_SHIP_PLAN_REMAIN_QTY());
				}
				if(msgKeyType.containsKeyColumn("tOdr_SHIP_PLAN_CMPLT_FLG") && key.gettOdr_SHIP_PLAN_CMPLT_FLG() != null) {
					msgKey.setKeyValue("tOdr_SHIP_PLAN_CMPLT_FLG", key.gettOdr_SHIP_PLAN_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG") && key.gettOdr_UNCONFIRMED_ODR_EFF_OVR_FLG() != null) {
					msgKey.setKeyValue("tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG", key.gettOdr_UNCONFIRMED_ODR_EFF_OVR_FLG());
				}
				if(msgKeyType.containsKeyColumn("tOdr_IF_CTL_NO") && key.gettOdr_IF_CTL_NO() != null) {
					msgKey.setKeyValue("tOdr_IF_CTL_NO", key.gettOdr_IF_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("tOdr_ENTRY_TYP") && key.gettOdr_ENTRY_TYP() != null) {
					msgKey.setKeyValue("tOdr_ENTRY_TYP", key.gettOdr_ENTRY_TYP());
				}
				if(msgKeyType.containsKeyColumn("tOdr_BUYER_NAME") && key.gettOdr_BUYER_NAME() != null) {
					msgKey.setKeyValue("tOdr_BUYER_NAME", key.gettOdr_BUYER_NAME());
				}
				if(msgKeyType.containsKeyColumn("tOdr_PUCH_ODR_QTY_TOTAL") && key.gettOdr_PUCH_ODR_QTY_TOTAL() != null) {
					msgKey.setKeyValue("tOdr_PUCH_ODR_QTY_TOTAL", key.gettOdr_PUCH_ODR_QTY_TOTAL());
				}
				if(msgKeyType.containsKeyColumn("tOdr_UNIT_CD_ORG") && key.gettOdr_UNIT_CD_ORG() != null) {
					msgKey.setKeyValue("tOdr_UNIT_CD_ORG", key.gettOdr_UNIT_CD_ORG());
				}
				if(msgKeyType.containsKeyColumn("tOdr_SHIP_CNT") && key.gettOdr_SHIP_CNT() != null) {
					msgKey.setKeyValue("tOdr_SHIP_CNT", key.gettOdr_SHIP_CNT());
				}
				if(msgKeyType.containsKeyColumn("tOdr_CUR_CD") && key.gettOdr_CUR_CD() != null) {
					msgKey.setKeyValue("tOdr_CUR_CD", key.gettOdr_CUR_CD());
				}
				if(msgKeyType.containsKeyColumn("tOdr_EXCH_TYP_R") && key.gettOdr_EXCH_TYP_R() != null) {
					msgKey.setKeyValue("tOdr_EXCH_TYP_R", key.gettOdr_EXCH_TYP_R());
				}
				if(msgKeyType.containsKeyColumn("tOdr_IN_ODRNO") && key.gettOdr_IN_ODRNO() != null) {
					msgKey.setKeyValue("tOdr_IN_ODRNO", key.gettOdr_IN_ODRNO());
				}
				if(msgKeyType.containsKeyColumn("uptOdr_PART_DLV_COUNT") && key.getuptOdr_PART_DLV_COUNT() != null) {
					msgKey.setKeyValue("uptOdr_PART_DLV_COUNT", key.getuptOdr_PART_DLV_COUNT());
				}
				if(msgKeyType.containsKeyColumn("uptOdr_IN_ODRNO") && key.getuptOdr_IN_ODRNO() != null) {
					msgKey.setKeyValue("uptOdr_IN_ODRNO", key.getuptOdr_IN_ODRNO());
				}
				if(msgKeyType.containsKeyColumn("mItem_ITEM_CD") && key.getmItem_ITEM_CD() != null) {
					msgKey.setKeyValue("mItem_ITEM_CD", key.getmItem_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("mItem_ITEM_NAME") && key.getmItem_ITEM_NAME() != null) {
					msgKey.setKeyValue("mItem_ITEM_NAME", key.getmItem_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("mItem_PRODUCT_TYP") && key.getmItem_PRODUCT_TYP() != null) {
					msgKey.setKeyValue("mItem_PRODUCT_TYP", key.getmItem_PRODUCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("mItem_MRP_ODR_TYP") && key.getmItem_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("mItem_MRP_ODR_TYP", key.getmItem_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("mItem_DRAW_CD") && key.getmItem_DRAW_CD() != null) {
					msgKey.setKeyValue("mItem_DRAW_CD", key.getmItem_DRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("mItem_SPEC") && key.getmItem_SPEC() != null) {
					msgKey.setKeyValue("mItem_SPEC", key.getmItem_SPEC());
				}
				if(msgKeyType.containsKeyColumn("mItem_HIGH_LEVEL_NO") && key.getmItem_HIGH_LEVEL_NO() != null) {
					msgKey.setKeyValue("mItem_HIGH_LEVEL_NO", key.getmItem_HIGH_LEVEL_NO());
				}
				if(msgKeyType.containsKeyColumn("mItem_OUTSIDE_TYP") && key.getmItem_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("mItem_OUTSIDE_TYP", key.getmItem_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("mItem_STOCK_UNIT_FLG") && key.getmItem_STOCK_UNIT_FLG() != null) {
					msgKey.setKeyValue("mItem_STOCK_UNIT_FLG", key.getmItem_STOCK_UNIT_FLG());
				}
				if(msgKeyType.containsKeyColumn("mItem_STOCK_UNIT") && key.getmItem_STOCK_UNIT() != null) {
					msgKey.setKeyValue("mItem_STOCK_UNIT", key.getmItem_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("mItem_PKG_UNIT") && key.getmItem_PKG_UNIT() != null) {
					msgKey.setKeyValue("mItem_PKG_UNIT", key.getmItem_PKG_UNIT());
				}
				if(msgKeyType.containsKeyColumn("mItem_PKG_UNIT_QTY") && key.getmItem_PKG_UNIT_QTY() != null) {
					msgKey.setKeyValue("mItem_PKG_UNIT_QTY", key.getmItem_PKG_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("mItem_UNIT_QTY_TYP") && key.getmItem_UNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("mItem_UNIT_QTY_TYP", key.getmItem_UNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("mItem_ODR_LT") && key.getmItem_ODR_LT() != null) {
					msgKey.setKeyValue("mItem_ODR_LT", key.getmItem_ODR_LT());
				}
				if(msgKeyType.containsKeyColumn("mItem_FIXED_LT") && key.getmItem_FIXED_LT() != null) {
					msgKey.setKeyValue("mItem_FIXED_LT", key.getmItem_FIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("mItem_PROP_LT") && key.getmItem_PROP_LT() != null) {
					msgKey.setKeyValue("mItem_PROP_LT", key.getmItem_PROP_LT());
				}
				if(msgKeyType.containsKeyColumn("mItem_SAFETY_LT") && key.getmItem_SAFETY_LT() != null) {
					msgKey.setKeyValue("mItem_SAFETY_LT", key.getmItem_SAFETY_LT());
				}
				if(msgKeyType.containsKeyColumn("mItem_ISSUE_LT") && key.getmItem_ISSUE_LT() != null) {
					msgKey.setKeyValue("mItem_ISSUE_LT", key.getmItem_ISSUE_LT());
				}
				if(msgKeyType.containsKeyColumn("mItem_PROP_LOT_SIZE") && key.getmItem_PROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("mItem_PROP_LOT_SIZE", key.getmItem_PROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("mItem_ITEM_SPOIL") && key.getmItem_ITEM_SPOIL() != null) {
					msgKey.setKeyValue("mItem_ITEM_SPOIL", key.getmItem_ITEM_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("mItem_SAFETY_STOCK") && key.getmItem_SAFETY_STOCK() != null) {
					msgKey.setKeyValue("mItem_SAFETY_STOCK", key.getmItem_SAFETY_STOCK());
				}
				if(msgKeyType.containsKeyColumn("mItem_LOT_SIZING_TYP") && key.getmItem_LOT_SIZING_TYP() != null) {
					msgKey.setKeyValue("mItem_LOT_SIZING_TYP", key.getmItem_LOT_SIZING_TYP());
				}
				if(msgKeyType.containsKeyColumn("mItem_MAX_PERIOD") && key.getmItem_MAX_PERIOD() != null) {
					msgKey.setKeyValue("mItem_MAX_PERIOD", key.getmItem_MAX_PERIOD());
				}
				if(msgKeyType.containsKeyColumn("mItem_MAX_ODR_QTY") && key.getmItem_MAX_ODR_QTY() != null) {
					msgKey.setKeyValue("mItem_MAX_ODR_QTY", key.getmItem_MAX_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("mItem_ODR_POINT") && key.getmItem_ODR_POINT() != null) {
					msgKey.setKeyValue("mItem_ODR_POINT", key.getmItem_ODR_POINT());
				}
				if(msgKeyType.containsKeyColumn("mItem_FIXED_ODR_QTY") && key.getmItem_FIXED_ODR_QTY() != null) {
					msgKey.setKeyValue("mItem_FIXED_ODR_QTY", key.getmItem_FIXED_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("mItem_MIN_ODR_QTY") && key.getmItem_MIN_ODR_QTY() != null) {
					msgKey.setKeyValue("mItem_MIN_ODR_QTY", key.getmItem_MIN_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("mItem_MUL_ODR_QTY") && key.getmItem_MUL_ODR_QTY() != null) {
					msgKey.setKeyValue("mItem_MUL_ODR_QTY", key.getmItem_MUL_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("mItem_ISSUE_TYP") && key.getmItem_ISSUE_TYP() != null) {
					msgKey.setKeyValue("mItem_ISSUE_TYP", key.getmItem_ISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("mItem_MPS_FLG") && key.getmItem_MPS_FLG() != null) {
					msgKey.setKeyValue("mItem_MPS_FLG", key.getmItem_MPS_FLG());
				}
				if(msgKeyType.containsKeyColumn("mItem_ACPT_INSPC_TYP") && key.getmItem_ACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("mItem_ACPT_INSPC_TYP", key.getmItem_ACPT_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("mItem_CLASIFICATION_CD") && key.getmItem_CLASIFICATION_CD() != null) {
					msgKey.setKeyValue("mItem_CLASIFICATION_CD", key.getmItem_CLASIFICATION_CD());
				}
				if(msgKeyType.containsKeyColumn("mItem_UNIT_WEIGHT") && key.getmItem_UNIT_WEIGHT() != null) {
					msgKey.setKeyValue("mItem_UNIT_WEIGHT", key.getmItem_UNIT_WEIGHT());
				}
				if(msgKeyType.containsKeyColumn("mItem_ABC_TYP") && key.getmItem_ABC_TYP() != null) {
					msgKey.setKeyValue("mItem_ABC_TYP", key.getmItem_ABC_TYP());
				}
				if(msgKeyType.containsKeyColumn("mItem_OPR_RSLT_TYP") && key.getmItem_OPR_RSLT_TYP() != null) {
					msgKey.setKeyValue("mItem_OPR_RSLT_TYP", key.getmItem_OPR_RSLT_TYP());
				}
				if(msgKeyType.containsKeyColumn("mItem_SPL_ITEM_TYP") && key.getmItem_SPL_ITEM_TYP() != null) {
					msgKey.setKeyValue("mItem_SPL_ITEM_TYP", key.getmItem_SPL_ITEM_TYP());
				}
				if(msgKeyType.containsKeyColumn("mItem_TAX_CD") && key.getmItem_TAX_CD() != null) {
					msgKey.setKeyValue("mItem_TAX_CD", key.getmItem_TAX_CD());
				}
				if(msgKeyType.containsKeyColumn("mItem_IN_ITEMCD") && key.getmItem_IN_ITEMCD() != null) {
					msgKey.setKeyValue("mItem_IN_ITEMCD", key.getmItem_IN_ITEMCD());
				}
				if(msgKeyType.containsKeyColumn("tOdrCtl_ODR_CTL_NO") && key.gettOdrCtl_ODR_CTL_NO() != null) {
					msgKey.setKeyValue("tOdrCtl_ODR_CTL_NO", key.gettOdrCtl_ODR_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("tOdrCtl_CUST_ITEM_NAME") && key.gettOdrCtl_CUST_ITEM_NAME() != null) {
					msgKey.setKeyValue("tOdrCtl_CUST_ITEM_NAME", key.gettOdrCtl_CUST_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("tOdrCtl_ITEM_NAME") && key.gettOdrCtl_ITEM_NAME() != null) {
					msgKey.setKeyValue("tOdrCtl_ITEM_NAME", key.gettOdrCtl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("tOdrCtl_IN_ODRCTLNO") && key.gettOdrCtl_IN_ODRCTLNO() != null) {
					msgKey.setKeyValue("tOdrCtl_IN_ODRCTLNO", key.gettOdrCtl_IN_ODRCTLNO());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_SLIP_CD") && key.getin_tShipSlip_SLIP_CD() != null) {
					msgKey.setKeyValue("in_tShipSlip_SLIP_CD", key.getin_tShipSlip_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_ITEM_CD") && key.getin_tShipSlip_ITEM_CD() != null) {
					msgKey.setKeyValue("in_tShipSlip_ITEM_CD", key.getin_tShipSlip_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_CUST_ITEM_CD") && key.getin_tShipSlip_CUST_ITEM_CD() != null) {
					msgKey.setKeyValue("in_tShipSlip_CUST_ITEM_CD", key.getin_tShipSlip_CUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_PART_NAME") && key.getin_tShipSlip_PART_NAME() != null) {
					msgKey.setKeyValue("in_tShipSlip_PART_NAME", key.getin_tShipSlip_PART_NAME());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_CUST_ODR_NO") && key.getin_tShipSlip_CUST_ODR_NO() != null) {
					msgKey.setKeyValue("in_tShipSlip_CUST_ODR_NO", key.getin_tShipSlip_CUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_CUST_CD") && key.getin_tShipSlip_CUST_CD() != null) {
					msgKey.setKeyValue("in_tShipSlip_CUST_CD", key.getin_tShipSlip_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_CUST_NAME") && key.getin_tShipSlip_CUST_NAME() != null) {
					msgKey.setKeyValue("in_tShipSlip_CUST_NAME", key.getin_tShipSlip_CUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_DLV_LOC_CD") && key.getin_tShipSlip_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("in_tShipSlip_DLV_LOC_CD", key.getin_tShipSlip_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_DLV_LOC_NAME_KANJI") && key.getin_tShipSlip_DLV_LOC_NAME_KANJI() != null) {
					msgKey.setKeyValue("in_tShipSlip_DLV_LOC_NAME_KANJI", key.getin_tShipSlip_DLV_LOC_NAME_KANJI());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_CUS_DLV_KEY_CD") && key.getin_tShipSlip_CUS_DLV_KEY_CD() != null) {
					msgKey.setKeyValue("in_tShipSlip_CUS_DLV_KEY_CD", key.getin_tShipSlip_CUS_DLV_KEY_CD());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_DESINATED_SHIP_DATE") && key.getin_tShipSlip_DESINATED_SHIP_DATE() != null) {
					msgKey.setKeyValue("in_tShipSlip_DESINATED_SHIP_DATE", key.getin_tShipSlip_DESINATED_SHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_DESINATED_DLV_DATE") && key.getin_tShipSlip_DESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("in_tShipSlip_DESINATED_DLV_DATE", key.getin_tShipSlip_DESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_SCDL_DLV_DATE") && key.getin_tShipSlip_SCDL_DLV_DATE() != null) {
					msgKey.setKeyValue("in_tShipSlip_SCDL_DLV_DATE", key.getin_tShipSlip_SCDL_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_SHIP_ODR_QTY") && key.getin_tShipSlip_SHIP_ODR_QTY() != null) {
					msgKey.setKeyValue("in_tShipSlip_SHIP_ODR_QTY", key.getin_tShipSlip_SHIP_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_UNIT_CD") && key.getin_tShipSlip_UNIT_CD() != null) {
					msgKey.setKeyValue("in_tShipSlip_UNIT_CD", key.getin_tShipSlip_UNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_UNIT_PRICE") && key.getin_tShipSlip_UNIT_PRICE() != null) {
					msgKey.setKeyValue("in_tShipSlip_UNIT_PRICE", key.getin_tShipSlip_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_SHIP_ODR_AMOUNT") && key.getin_tShipSlip_SHIP_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("in_tShipSlip_SHIP_ODR_AMOUNT", key.getin_tShipSlip_SHIP_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_TAX_AMOUNT") && key.getin_tShipSlip_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("in_tShipSlip_TAX_AMOUNT", key.getin_tShipSlip_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_INSPC_TYP") && key.getin_tShipSlip_INSPC_TYP() != null) {
					msgKey.setKeyValue("in_tShipSlip_INSPC_TYP", key.getin_tShipSlip_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_CLIENT_REMARK_KANJI") && key.getin_tShipSlip_CLIENT_REMARK_KANJI() != null) {
					msgKey.setKeyValue("in_tShipSlip_CLIENT_REMARK_KANJI", key.getin_tShipSlip_CLIENT_REMARK_KANJI());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_CLIENT_BARCODE_INF") && key.getin_tShipSlip_CLIENT_BARCODE_INF() != null) {
					msgKey.setKeyValue("in_tShipSlip_CLIENT_BARCODE_INF", key.getin_tShipSlip_CLIENT_BARCODE_INF());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_PRINT_FLG") && key.getin_tShipSlip_PRINT_FLG() != null) {
					msgKey.setKeyValue("in_tShipSlip_PRINT_FLG", key.getin_tShipSlip_PRINT_FLG());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_DEL_FLG") && key.getin_tShipSlip_DEL_FLG() != null) {
					msgKey.setKeyValue("in_tShipSlip_DEL_FLG", key.getin_tShipSlip_DEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_BUYER_NAME") && key.getin_tShipSlip_BUYER_NAME() != null) {
					msgKey.setKeyValue("in_tShipSlip_BUYER_NAME", key.getin_tShipSlip_BUYER_NAME());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_PUCH_ODR_QTY_TOTAL") && key.getin_tShipSlip_PUCH_ODR_QTY_TOTAL() != null) {
					msgKey.setKeyValue("in_tShipSlip_PUCH_ODR_QTY_TOTAL", key.getin_tShipSlip_PUCH_ODR_QTY_TOTAL());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_DLV_ODR_QTY") && key.getin_tShipSlip_DLV_ODR_QTY() != null) {
					msgKey.setKeyValue("in_tShipSlip_DLV_ODR_QTY", key.getin_tShipSlip_DLV_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_SHIP_ODR_AMOUNT_TAX") && key.getin_tShipSlip_SHIP_ODR_AMOUNT_TAX() != null) {
					msgKey.setKeyValue("in_tShipSlip_SHIP_ODR_AMOUNT_TAX", key.getin_tShipSlip_SHIP_ODR_AMOUNT_TAX());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT") && key.getin_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT", key.getin_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT") && key.getin_tShipSlip_INTERNAL_TAX_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT", key.getin_tShipSlip_INTERNAL_TAX_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_TAXFREE_SALES_AMOUNT") && key.getin_tShipSlip_TAXFREE_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("in_tShipSlip_TAXFREE_SALES_AMOUNT", key.getin_tShipSlip_TAXFREE_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_TAX_CREDIT_SALES_AMOUNT") && key.getin_tShipSlip_TAX_CREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("in_tShipSlip_TAX_CREDIT_SALES_AMOUNT", key.getin_tShipSlip_TAX_CREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_EXTERNAL_TAX_AMOUNT") && key.getin_tShipSlip_EXTERNAL_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("in_tShipSlip_EXTERNAL_TAX_AMOUNT", key.getin_tShipSlip_EXTERNAL_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_INTERNAL_TAX_AMOUNT") && key.getin_tShipSlip_INTERNAL_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("in_tShipSlip_INTERNAL_TAX_AMOUNT", key.getin_tShipSlip_INTERNAL_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_TAX_AMOUNT_1") && key.getin_tShipSlip_TAX_AMOUNT_1() != null) {
					msgKey.setKeyValue("in_tShipSlip_TAX_AMOUNT_1", key.getin_tShipSlip_TAX_AMOUNT_1());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_TAX_AMOUNT_2") && key.getin_tShipSlip_TAX_AMOUNT_2() != null) {
					msgKey.setKeyValue("in_tShipSlip_TAX_AMOUNT_2", key.getin_tShipSlip_TAX_AMOUNT_2());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_TAX_AMOUNT_3") && key.getin_tShipSlip_TAX_AMOUNT_3() != null) {
					msgKey.setKeyValue("in_tShipSlip_TAX_AMOUNT_3", key.getin_tShipSlip_TAX_AMOUNT_3());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT") && key.getin_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT", key.getin_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("del_tShipSlip_IN_SLIPCD") && key.getdel_tShipSlip_IN_SLIPCD() != null) {
					msgKey.setKeyValue("del_tShipSlip_IN_SLIPCD", key.getdel_tShipSlip_IN_SLIPCD());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_COMPANY_CD") && key.getmCustBase_COMPANY_CD() != null) {
					msgKey.setKeyValue("mCustBase_COMPANY_CD", key.getmCustBase_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_CUST_CD") && key.getmCustBase_CUST_CD() != null) {
					msgKey.setKeyValue("mCustBase_CUST_CD", key.getmCustBase_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_DLV_LOC_CD") && key.getmCustBase_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("mCustBase_DLV_LOC_CD", key.getmCustBase_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_DLV_LOC_NAME") && key.getmCustBase_DLV_LOC_NAME() != null) {
					msgKey.setKeyValue("mCustBase_DLV_LOC_NAME", key.getmCustBase_DLV_LOC_NAME());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_DLV_LOC_KNAME") && key.getmCustBase_DLV_LOC_KNAME() != null) {
					msgKey.setKeyValue("mCustBase_DLV_LOC_KNAME", key.getmCustBase_DLV_LOC_KNAME());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_DLV_LOC_ENAME") && key.getmCustBase_DLV_LOC_ENAME() != null) {
					msgKey.setKeyValue("mCustBase_DLV_LOC_ENAME", key.getmCustBase_DLV_LOC_ENAME());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_ZIP_CD") && key.getmCustBase_ZIP_CD() != null) {
					msgKey.setKeyValue("mCustBase_ZIP_CD", key.getmCustBase_ZIP_CD());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_ADDRESS_1") && key.getmCustBase_ADDRESS_1() != null) {
					msgKey.setKeyValue("mCustBase_ADDRESS_1", key.getmCustBase_ADDRESS_1());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_ADDRESS_2") && key.getmCustBase_ADDRESS_2() != null) {
					msgKey.setKeyValue("mCustBase_ADDRESS_2", key.getmCustBase_ADDRESS_2());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_ADDRESS_K_1") && key.getmCustBase_ADDRESS_K_1() != null) {
					msgKey.setKeyValue("mCustBase_ADDRESS_K_1", key.getmCustBase_ADDRESS_K_1());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_ADDRESS_K_2") && key.getmCustBase_ADDRESS_K_2() != null) {
					msgKey.setKeyValue("mCustBase_ADDRESS_K_2", key.getmCustBase_ADDRESS_K_2());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_TEL") && key.getmCustBase_TEL() != null) {
					msgKey.setKeyValue("mCustBase_TEL", key.getmCustBase_TEL());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_FAX") && key.getmCustBase_FAX() != null) {
					msgKey.setKeyValue("mCustBase_FAX", key.getmCustBase_FAX());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_SHIP_WH_CD") && key.getmCustBase_SHIP_WH_CD() != null) {
					msgKey.setKeyValue("mCustBase_SHIP_WH_CD", key.getmCustBase_SHIP_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_TRANSPORT_CD") && key.getmCustBase_TRANSPORT_CD() != null) {
					msgKey.setKeyValue("mCustBase_TRANSPORT_CD", key.getmCustBase_TRANSPORT_CD());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_TRANSPORT_NAME") && key.getmCustBase_TRANSPORT_NAME() != null) {
					msgKey.setKeyValue("mCustBase_TRANSPORT_NAME", key.getmCustBase_TRANSPORT_NAME());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_TRANSPORT_LT") && key.getmCustBase_TRANSPORT_LT() != null) {
					msgKey.setKeyValue("mCustBase_TRANSPORT_LT", key.getmCustBase_TRANSPORT_LT());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_CAL_NO") && key.getmCustBase_CAL_NO() != null) {
					msgKey.setKeyValue("mCustBase_CAL_NO", key.getmCustBase_CAL_NO());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_TRANSPORT_TYP") && key.getmCustBase_TRANSPORT_TYP() != null) {
					msgKey.setKeyValue("mCustBase_TRANSPORT_TYP", key.getmCustBase_TRANSPORT_TYP());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_DLV_START_TIME") && key.getmCustBase_DLV_START_TIME() != null) {
					msgKey.setKeyValue("mCustBase_DLV_START_TIME", key.getmCustBase_DLV_START_TIME());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_DLV_END_TIME") && key.getmCustBase_DLV_END_TIME() != null) {
					msgKey.setKeyValue("mCustBase_DLV_END_TIME", key.getmCustBase_DLV_END_TIME());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_AREA_CLASS_TYP1") && key.getmCustBase_AREA_CLASS_TYP1() != null) {
					msgKey.setKeyValue("mCustBase_AREA_CLASS_TYP1", key.getmCustBase_AREA_CLASS_TYP1());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_AREA_CLASS_1") && key.getmCustBase_AREA_CLASS_1() != null) {
					msgKey.setKeyValue("mCustBase_AREA_CLASS_1", key.getmCustBase_AREA_CLASS_1());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_AREA_CLASS_TYP2") && key.getmCustBase_AREA_CLASS_TYP2() != null) {
					msgKey.setKeyValue("mCustBase_AREA_CLASS_TYP2", key.getmCustBase_AREA_CLASS_TYP2());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_AREA_CLASS_2") && key.getmCustBase_AREA_CLASS_2() != null) {
					msgKey.setKeyValue("mCustBase_AREA_CLASS_2", key.getmCustBase_AREA_CLASS_2());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_AREA_CLASS_TYP3") && key.getmCustBase_AREA_CLASS_TYP3() != null) {
					msgKey.setKeyValue("mCustBase_AREA_CLASS_TYP3", key.getmCustBase_AREA_CLASS_TYP3());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_AREA_CLASS_3") && key.getmCustBase_AREA_CLASS_3() != null) {
					msgKey.setKeyValue("mCustBase_AREA_CLASS_3", key.getmCustBase_AREA_CLASS_3());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_REMARKS_1") && key.getmCustBase_REMARKS_1() != null) {
					msgKey.setKeyValue("mCustBase_REMARKS_1", key.getmCustBase_REMARKS_1());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_REMARKS_2") && key.getmCustBase_REMARKS_2() != null) {
					msgKey.setKeyValue("mCustBase_REMARKS_2", key.getmCustBase_REMARKS_2());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_REMARKS_3") && key.getmCustBase_REMARKS_3() != null) {
					msgKey.setKeyValue("mCustBase_REMARKS_3", key.getmCustBase_REMARKS_3());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_DEPO_WH_CD") && key.getmCustBase_DEPO_WH_CD() != null) {
					msgKey.setKeyValue("mCustBase_DEPO_WH_CD", key.getmCustBase_DEPO_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_IN_COMPANYCD") && key.getmCustBase_IN_COMPANYCD() != null) {
					msgKey.setKeyValue("mCustBase_IN_COMPANYCD", key.getmCustBase_IN_COMPANYCD());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_IN_CUSTCD") && key.getmCustBase_IN_CUSTCD() != null) {
					msgKey.setKeyValue("mCustBase_IN_CUSTCD", key.getmCustBase_IN_CUSTCD());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_IN_DLVLOCCD") && key.getmCustBase_IN_DLVLOCCD() != null) {
					msgKey.setKeyValue("mCustBase_IN_DLVLOCCD", key.getmCustBase_IN_DLVLOCCD());
				}
				if(msgKeyType.containsKeyColumn("mCust_COMPANY_CD") && key.getmCust_COMPANY_CD() != null) {
					msgKey.setKeyValue("mCust_COMPANY_CD", key.getmCust_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("mCust_CUST_CD") && key.getmCust_CUST_CD() != null) {
					msgKey.setKeyValue("mCust_CUST_CD", key.getmCust_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("mCust_CUST_NAME") && key.getmCust_CUST_NAME() != null) {
					msgKey.setKeyValue("mCust_CUST_NAME", key.getmCust_CUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("mCust_CUST_KNAME") && key.getmCust_CUST_KNAME() != null) {
					msgKey.setKeyValue("mCust_CUST_KNAME", key.getmCust_CUST_KNAME());
				}
				if(msgKeyType.containsKeyColumn("mCust_OWN_ORG_CD") && key.getmCust_OWN_ORG_CD() != null) {
					msgKey.setKeyValue("mCust_OWN_ORG_CD", key.getmCust_OWN_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("mCust_OWN_PERSON_CD") && key.getmCust_OWN_PERSON_CD() != null) {
					msgKey.setKeyValue("mCust_OWN_PERSON_CD", key.getmCust_OWN_PERSON_CD());
				}
				if(msgKeyType.containsKeyColumn("mCust_CUR_CD") && key.getmCust_CUR_CD() != null) {
					msgKey.setKeyValue("mCust_CUR_CD", key.getmCust_CUR_CD());
				}
				if(msgKeyType.containsKeyColumn("mCust_EXCH_TYP") && key.getmCust_EXCH_TYP() != null) {
					msgKey.setKeyValue("mCust_EXCH_TYP", key.getmCust_EXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("mCust_TAX_APPLY_TYP") && key.getmCust_TAX_APPLY_TYP() != null) {
					msgKey.setKeyValue("mCust_TAX_APPLY_TYP", key.getmCust_TAX_APPLY_TYP());
				}
				if(msgKeyType.containsKeyColumn("mCust_TAX_CD") && key.getmCust_TAX_CD() != null) {
					msgKey.setKeyValue("mCust_TAX_CD", key.getmCust_TAX_CD());
				}
				if(msgKeyType.containsKeyColumn("mCust_TAX_CALC_TYP") && key.getmCust_TAX_CALC_TYP() != null) {
					msgKey.setKeyValue("mCust_TAX_CALC_TYP", key.getmCust_TAX_CALC_TYP());
				}
				if(msgKeyType.containsKeyColumn("mCust_PRICE_ROUND_TYP") && key.getmCust_PRICE_ROUND_TYP() != null) {
					msgKey.setKeyValue("mCust_PRICE_ROUND_TYP", key.getmCust_PRICE_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("mCust_DETAIL_ROUND_TYP") && key.getmCust_DETAIL_ROUND_TYP() != null) {
					msgKey.setKeyValue("mCust_DETAIL_ROUND_TYP", key.getmCust_DETAIL_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("mCust_UNCONFIRM_ODR_EFF_PRIOD") && key.getmCust_UNCONFIRM_ODR_EFF_PRIOD() != null) {
					msgKey.setKeyValue("mCust_UNCONFIRM_ODR_EFF_PRIOD", key.getmCust_UNCONFIRM_ODR_EFF_PRIOD());
				}
				if(msgKeyType.containsKeyColumn("mCust_UNCONFIRM_ODR_EFF_TERM_FLG") && key.getmCust_UNCONFIRM_ODR_EFF_TERM_FLG() != null) {
					msgKey.setKeyValue("mCust_UNCONFIRM_ODR_EFF_TERM_FLG", key.getmCust_UNCONFIRM_ODR_EFF_TERM_FLG());
				}
				if(msgKeyType.containsKeyColumn("mCust_EDI_CUST_VEND_CD") && key.getmCust_EDI_CUST_VEND_CD() != null) {
					msgKey.setKeyValue("mCust_EDI_CUST_VEND_CD", key.getmCust_EDI_CUST_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("mCust_PARTIAL_SHIP_INST_FLG") && key.getmCust_PARTIAL_SHIP_INST_FLG() != null) {
					msgKey.setKeyValue("mCust_PARTIAL_SHIP_INST_FLG", key.getmCust_PARTIAL_SHIP_INST_FLG());
				}
				if(msgKeyType.containsKeyColumn("mCust_DEPO_TYP") && key.getmCust_DEPO_TYP() != null) {
					msgKey.setKeyValue("mCust_DEPO_TYP", key.getmCust_DEPO_TYP());
				}
				if(msgKeyType.containsKeyColumn("mCust_INSPC_ACPT_TYP") && key.getmCust_INSPC_ACPT_TYP() != null) {
					msgKey.setKeyValue("mCust_INSPC_ACPT_TYP", key.getmCust_INSPC_ACPT_TYP());
				}
				if(msgKeyType.containsKeyColumn("mCust_IN_COMPANYCD") && key.getmCust_IN_COMPANYCD() != null) {
					msgKey.setKeyValue("mCust_IN_COMPANYCD", key.getmCust_IN_COMPANYCD());
				}
				if(msgKeyType.containsKeyColumn("mCust_IN_CUSTCD") && key.getmCust_IN_CUSTCD() != null) {
					msgKey.setKeyValue("mCust_IN_CUSTCD", key.getmCust_IN_CUSTCD());
				}
				if(msgKeyType.containsKeyColumn("tori_tAnsDlvDate_REST_SHIP_ODR_QTY") && key.gettori_tAnsDlvDate_REST_SHIP_ODR_QTY() != null) {
					msgKey.setKeyValue("tori_tAnsDlvDate_REST_SHIP_ODR_QTY", key.gettori_tAnsDlvDate_REST_SHIP_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG") && key.gettori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG() != null) {
					msgKey.setKeyValue("tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG", key.gettori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("tori_tAnsDlvDate_IN_ODRNO") && key.gettori_tAnsDlvDate_IN_ODRNO() != null) {
					msgKey.setKeyValue("tori_tAnsDlvDate_IN_ODRNO", key.gettori_tAnsDlvDate_IN_ODRNO());
				}
				if(msgKeyType.containsKeyColumn("tori_tAnsDlvDate_IN_PARTDLVSEQNO") && key.gettori_tAnsDlvDate_IN_PARTDLVSEQNO() != null) {
					msgKey.setKeyValue("tori_tAnsDlvDate_IN_PARTDLVSEQNO", key.gettori_tAnsDlvDate_IN_PARTDLVSEQNO());
				}
				if(msgKeyType.containsKeyColumn("chkisWhCd_WH_CD") && key.getchkisWhCd_WH_CD() != null) {
					msgKey.setKeyValue("chkisWhCd_WH_CD", key.getchkisWhCd_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("chkisWhCd_WH_TYP") && key.getchkisWhCd_WH_TYP() != null) {
					msgKey.setKeyValue("chkisWhCd_WH_TYP", key.getchkisWhCd_WH_TYP());
				}
				if(msgKeyType.containsKeyColumn("chkisWhCd_ITEM_CD") && key.getchkisWhCd_ITEM_CD() != null) {
					msgKey.setKeyValue("chkisWhCd_ITEM_CD", key.getchkisWhCd_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("chkisWhCd_PBL_SHIP_QTY") && key.getchkisWhCd_PBL_SHIP_QTY() != null) {
					msgKey.setKeyValue("chkisWhCd_PBL_SHIP_QTY", key.getchkisWhCd_PBL_SHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("chkisWhCd_IN_ITEMCD") && key.getchkisWhCd_IN_ITEMCD() != null) {
					msgKey.setKeyValue("chkisWhCd_IN_ITEMCD", key.getchkisWhCd_IN_ITEMCD());
				}
				if(msgKeyType.containsKeyColumn("chkisWhCd_IN_WHCD") && key.getchkisWhCd_IN_WHCD() != null) {
					msgKey.setKeyValue("chkisWhCd_IN_WHCD", key.getchkisWhCd_IN_WHCD());
				}
				if(msgKeyType.containsKeyColumn("mUnitCost_UNIT_COST") && key.getmUnitCost_UNIT_COST() != null) {
					msgKey.setKeyValue("mUnitCost_UNIT_COST", key.getmUnitCost_UNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("mUnitCost_EFF_PHASE_IN_DATE") && key.getmUnitCost_EFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("mUnitCost_EFF_PHASE_IN_DATE", key.getmUnitCost_EFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("mUnitCost_IN_COMPANYCD") && key.getmUnitCost_IN_COMPANYCD() != null) {
					msgKey.setKeyValue("mUnitCost_IN_COMPANYCD", key.getmUnitCost_IN_COMPANYCD());
				}
				if(msgKeyType.containsKeyColumn("mUnitCost_IN_CUSTCD") && key.getmUnitCost_IN_CUSTCD() != null) {
					msgKey.setKeyValue("mUnitCost_IN_CUSTCD", key.getmUnitCost_IN_CUSTCD());
				}
				if(msgKeyType.containsKeyColumn("mUnitCost_IN_ITEMCD") && key.getmUnitCost_IN_ITEMCD() != null) {
					msgKey.setKeyValue("mUnitCost_IN_ITEMCD", key.getmUnitCost_IN_ITEMCD());
				}
				if(msgKeyType.containsKeyColumn("mUnitCost_IN_EFFPHASEINDATE") && key.getmUnitCost_IN_EFFPHASEINDATE() != null) {
					msgKey.setKeyValue("mUnitCost_IN_EFFPHASEINDATE", key.getmUnitCost_IN_EFFPHASEINDATE());
				}
				if(msgKeyType.containsKeyColumn("mWhWH_CD") && key.getmWhWH_CD() != null) {
					msgKey.setKeyValue("mWhWH_CD", key.getmWhWH_CD());
				}
				if(msgKeyType.containsKeyColumn("mWhWH_NAME") && key.getmWhWH_NAME() != null) {
					msgKey.setKeyValue("mWhWH_NAME", key.getmWhWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("strTaxTAX_KBN") && key.getstrTaxTAX_KBN() != null) {
					msgKey.setKeyValue("strTaxTAX_KBN", key.getstrTaxTAX_KBN());
				}
				if(msgKeyType.containsKeyColumn("strTaxOLD_TAX_1") && key.getstrTaxOLD_TAX_1() != null) {
					msgKey.setKeyValue("strTaxOLD_TAX_1", key.getstrTaxOLD_TAX_1());
				}
				if(msgKeyType.containsKeyColumn("strTaxOLD_TAX_2") && key.getstrTaxOLD_TAX_2() != null) {
					msgKey.setKeyValue("strTaxOLD_TAX_2", key.getstrTaxOLD_TAX_2());
				}
				if(msgKeyType.containsKeyColumn("strTaxOLD_TAX_3") && key.getstrTaxOLD_TAX_3() != null) {
					msgKey.setKeyValue("strTaxOLD_TAX_3", key.getstrTaxOLD_TAX_3());
				}
				if(msgKeyType.containsKeyColumn("strTaxNEW_TAX_1") && key.getstrTaxNEW_TAX_1() != null) {
					msgKey.setKeyValue("strTaxNEW_TAX_1", key.getstrTaxNEW_TAX_1());
				}
				if(msgKeyType.containsKeyColumn("strTaxNEW_TAX_2") && key.getstrTaxNEW_TAX_2() != null) {
					msgKey.setKeyValue("strTaxNEW_TAX_2", key.getstrTaxNEW_TAX_2());
				}
				if(msgKeyType.containsKeyColumn("strTaxNEW_TAX_3") && key.getstrTaxNEW_TAX_3() != null) {
					msgKey.setKeyValue("strTaxNEW_TAX_3", key.getstrTaxNEW_TAX_3());
				}
				if(msgKeyType.containsKeyColumn("strTaxSTART_DATE") && key.getstrTaxSTART_DATE() != null) {
					msgKey.setKeyValue("strTaxSTART_DATE", key.getstrTaxSTART_DATE());
				}
				if(msgKeyType.containsKeyColumn("strTaxROUND_TYP") && key.getstrTaxROUND_TYP() != null) {
					msgKey.setKeyValue("strTaxROUND_TYP", key.getstrTaxROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("strTaxIN_COMPANYCD") && key.getstrTaxIN_COMPANYCD() != null) {
					msgKey.setKeyValue("strTaxIN_COMPANYCD", key.getstrTaxIN_COMPANYCD());
				}
				if(msgKeyType.containsKeyColumn("strTaxIN_CUSTCD") && key.getstrTaxIN_CUSTCD() != null) {
					msgKey.setKeyValue("strTaxIN_CUSTCD", key.getstrTaxIN_CUSTCD());
				}
				if(msgKeyType.containsKeyColumn("g_CUST_ITEM_CD") && key.getg_CUST_ITEM_CD() != null) {
					msgKey.setKeyValue("g_CUST_ITEM_CD", key.getg_CUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("strYotaku_WH_CD") && key.getstrYotaku_WH_CD() != null) {
					msgKey.setKeyValue("strYotaku_WH_CD", key.getstrYotaku_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("strYotaku_IN_WH_TYP") && key.getstrYotaku_IN_WH_TYP() != null) {
					msgKey.setKeyValue("strYotaku_IN_WH_TYP", key.getstrYotaku_IN_WH_TYP());
				}
				if(msgKeyType.containsKeyColumn("strSYUKA_LT") && key.getstrSYUKA_LT() != null) {
					msgKey.setKeyValue("strSYUKA_LT", key.getstrSYUKA_LT());
				}
				if(msgKeyType.containsKeyColumn("chkisinWhCd_WH_CD") && key.getchkisinWhCd_WH_CD() != null) {
					msgKey.setKeyValue("chkisinWhCd_WH_CD", key.getchkisinWhCd_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("chkisinWhCd_WH_TYP") && key.getchkisinWhCd_WH_TYP() != null) {
					msgKey.setKeyValue("chkisinWhCd_WH_TYP", key.getchkisinWhCd_WH_TYP());
				}
				if(msgKeyType.containsKeyColumn("chkisinWhCd_WH_NAME") && key.getchkisinWhCd_WH_NAME() != null) {
					msgKey.setKeyValue("chkisinWhCd_WH_NAME", key.getchkisinWhCd_WH_NAME());
				}
				if(msgKeyType.containsKeyColumn("chkis_IN_WHCD") && key.getchkis_IN_WHCD() != null) {
					msgKey.setKeyValue("chkis_IN_WHCD", key.getchkis_IN_WHCD());
				}
				if(msgKeyType.containsKeyColumn("uptOdr_SHIP_CNT") && key.getuptOdr_SHIP_CNT() != null) {
					msgKey.setKeyValue("uptOdr_SHIP_CNT", key.getuptOdr_SHIP_CNT());
				}
				if(msgKeyType.containsKeyColumn("tHOLIDAY_FLG") && key.gettHOLIDAY_FLG() != null) {
					msgKey.setKeyValue("tHOLIDAY_FLG", key.gettHOLIDAY_FLG());
				}
				if(msgKeyType.containsKeyColumn("tWH_CD") && key.gettWH_CD() != null) {
					msgKey.setKeyValue("tWH_CD", key.gettWH_CD());
				}
				if(msgKeyType.containsKeyColumn("tCAL_DATE") && key.gettCAL_DATE() != null) {
					msgKey.setKeyValue("tCAL_DATE", key.gettCAL_DATE());
				}
				if(msgKeyType.containsKeyColumn("tDECIMAL_FIG") && key.gettDECIMAL_FIG() != null) {
					msgKey.setKeyValue("tDECIMAL_FIG", key.gettDECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("tCUR_CD") && key.gettCUR_CD() != null) {
					msgKey.setKeyValue("tCUR_CD", key.gettCUR_CD());
				}
				if(msgKeyType.containsKeyColumn("chkisWhCd_JOB_ODR_CD") && key.getchkisWhCd_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("chkisWhCd_JOB_ODR_CD", key.getchkisWhCd_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("serTJobOdr_JOB_ODR_CD") && key.getserTJobOdr_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("serTJobOdr_JOB_ODR_CD", key.getserTJobOdr_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("serTJobOdr_ITEM_CD") && key.getserTJobOdr_ITEM_CD() != null) {
					msgKey.setKeyValue("serTJobOdr_ITEM_CD", key.getserTJobOdr_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("tUnShipList_ACPT_ODR_CD") && key.gettUnShipList_ACPT_ODR_CD() != null) {
					msgKey.setKeyValue("tUnShipList_ACPT_ODR_CD", key.gettUnShipList_ACPT_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("tUnShipList_PART_DLV_SEQ_NO") && key.gettUnShipList_PART_DLV_SEQ_NO() != null) {
					msgKey.setKeyValue("tUnShipList_PART_DLV_SEQ_NO", key.gettUnShipList_PART_DLV_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("strTAX_CD") && key.getstrTAX_CD() != null) {
					msgKey.setKeyValue("strTAX_CD", key.getstrTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("selMODIFY_COUNT") && key.getselMODIFY_COUNT() != null) {
					msgKey.setKeyValue("selMODIFY_COUNT", key.getselMODIFY_COUNT());
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
					KU0010010Struct key = new KU0010010Struct();
					if(msgKeyType.containsKeyColumn("g_PART_DLV_SEQ_NO")) {
						key.setg_PART_DLV_SEQ_NO(msgKey.getKeyValue("g_PART_DLV_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("g_DIRECT_DLV_FLG")) {
						key.setg_DIRECT_DLV_FLG(msgKey.getKeyValue("g_DIRECT_DLV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("g_REST_SHIP_ODR_QTY")) {
						key.setg_REST_SHIP_ODR_QTY(msgKey.getKeyValue("g_REST_SHIP_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("g_CUST_ANAME")) {
						key.setg_CUST_ANAME(msgKey.getKeyValue("g_CUST_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("g_ITEM_CD")) {
						key.setg_ITEM_CD(msgKey.getKeyValue("g_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("k_MODE")) {
						key.setk_MODE(msgKey.getKeyValue("k_MODE"));
					}
					if(msgKeyType.containsKeyColumn("h_RESULT")) {
						key.seth_RESULT(msgKey.getKeyValue("h_RESULT"));
					}
					if(msgKeyType.containsKeyColumn("h_REST_SHIP_ODR_QTY")) {
						key.seth_REST_SHIP_ODR_QTY(msgKey.getKeyValue("h_REST_SHIP_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("h_CUST_ANAME")) {
						key.seth_CUST_ANAME(msgKey.getKeyValue("h_CUST_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("h_CUST_ITEM_CD")) {
						key.seth_CUST_ITEM_CD(msgKey.getKeyValue("h_CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_CD")) {
						key.seth_ITEM_CD(msgKey.getKeyValue("h_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_AP_SECRTY_TYP")) {
						key.seth_AP_SECRTY_TYP(msgKey.getKeyValue("h_AP_SECRTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_MODIFY_CNT")) {
						key.seth_MODIFY_CNT(msgKey.getKeyValue("h_MODIFY_CNT"));
					}
					if(msgKeyType.containsKeyColumn("r_SEL_PTN1")) {
						key.setr_SEL_PTN1(msgKey.getKeyValue("r_SEL_PTN1"));
					}
					if(msgKeyType.containsKeyColumn("r_SEL_PTN2")) {
						key.setr_SEL_PTN2(msgKey.getKeyValue("r_SEL_PTN2"));
					}
					if(msgKeyType.containsKeyColumn("g_ODR_NO")) {
						key.setg_ODR_NO(msgKey.getKeyValue("g_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("g_SLIP_CD")) {
						key.setg_SLIP_CD(msgKey.getKeyValue("g_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("g_DESINATED_SHIP_DATE")) {
						key.setg_DESINATED_SHIP_DATE(msgKey.getKeyValue("g_DESINATED_SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("g_REST_SHIP_ODR_QTY2")) {
						key.setg_REST_SHIP_ODR_QTY2(msgKey.getKeyValue("g_REST_SHIP_ODR_QTY2"));
					}
					if(msgKeyType.containsKeyColumn("g_WH_CD")) {
						key.setg_WH_CD(msgKey.getKeyValue("g_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_PARTIAL_SHIP_INST_FLG")) {
						key.seth_PARTIAL_SHIP_INST_FLG(msgKey.getKeyValue("h_PARTIAL_SHIP_INST_FLG"));
					}
					if(msgKeyType.containsKeyColumn("g_STOCK_UNIT")) {
						key.setg_STOCK_UNIT(msgKey.getKeyValue("g_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("g_STOCK_UNIT2")) {
						key.setg_STOCK_UNIT2(msgKey.getKeyValue("g_STOCK_UNIT2"));
					}
					if(msgKeyType.containsKeyColumn("g_WH_NAME")) {
						key.setg_WH_NAME(msgKey.getKeyValue("g_WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("g_CUST_CD")) {
						key.setg_CUST_CD(msgKey.getKeyValue("g_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("g_CUST_ITEM_NAME")) {
						key.setg_CUST_ITEM_NAME(msgKey.getKeyValue("g_CUST_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("g_ITEM_NAME")) {
						key.setg_ITEM_NAME(msgKey.getKeyValue("g_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("g_CUST_ODR_NO")) {
						key.setg_CUST_ODR_NO(msgKey.getKeyValue("g_CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("c_JOB_ODR_CD")) {
						key.setc_JOB_ODR_CD(msgKey.getKeyValue("c_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_MRP_ODR_TYP")) {
						key.seth_MRP_ODR_TYP(msgKey.getKeyValue("h_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_JOB_ODR_CD")) {
						key.seth_JOB_ODR_CD(msgKey.getKeyValue("h_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("tMRP_ODR_TYP")) {
						key.settMRP_ODR_TYP(msgKey.getKeyValue("tMRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("chkisWhCd_IN_JOBODRCD")) {
						key.setchkisWhCd_IN_JOBODRCD(msgKey.getKeyValue("chkisWhCd_IN_JOBODRCD"));
					}
					if(msgKeyType.containsKeyColumn("strCOMPANY_CD")) {
						key.setstrCOMPANY_CD(msgKey.getKeyValue("strCOMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("strUSER_NAME")) {
						key.setstrUSER_NAME(msgKey.getKeyValue("strUSER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("strPLANT_CD")) {
						key.setstrPLANT_CD(msgKey.getKeyValue("strPLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("strSECTION_CD")) {
						key.setstrSECTION_CD(msgKey.getKeyValue("strSECTION_CD"));
					}
					if(msgKeyType.containsKeyColumn("strPLANT_NAME")) {
						key.setstrPLANT_NAME(msgKey.getKeyValue("strPLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("strPLANT_ANAME")) {
						key.setstrPLANT_ANAME(msgKey.getKeyValue("strPLANT_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("strCAL_NO")) {
						key.setstrCAL_NO(new Double(msgKey.getKeyValue("strCAL_NO")));
					}
					if(msgKeyType.containsKeyColumn("strUSER_CD")) {
						key.setstrUSER_CD(msgKey.getKeyValue("strUSER_CD"));
					}
					if(msgKeyType.containsKeyColumn("strBUSINESS_OPR_DATE")) {
						key.setstrBUSINESS_OPR_DATE(msgKey.getKeyValue("strBUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("strMAX_DISPLAY_ROWNUM")) {
						key.setstrMAX_DISPLAY_ROWNUM(new Double(msgKey.getKeyValue("strMAX_DISPLAY_ROWNUM")));
					}
					if(msgKeyType.containsKeyColumn("tAnsDlvDate_ODR_NO")) {
						key.settAnsDlvDate_ODR_NO(msgKey.getKeyValue("tAnsDlvDate_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("tAnsDlvDate_PART_DLV_SEQ_NO")) {
						key.settAnsDlvDate_PART_DLV_SEQ_NO(msgKey.getKeyValue("tAnsDlvDate_PART_DLV_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("tAnsDlvDate_DESINATED_SHIP_DATE")) {
						key.settAnsDlvDate_DESINATED_SHIP_DATE(msgKey.getKeyValue("tAnsDlvDate_DESINATED_SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("tOdrODR_CTL_NO")) {
						key.settOdrODR_CTL_NO(msgKey.getKeyValue("tOdrODR_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("tOdrCtl_CUST_ITEM_CD")) {
						key.settOdrCtl_CUST_ITEM_CD(msgKey.getKeyValue("tOdrCtl_CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("tOdrCtl_ITEM_CD")) {
						key.settOdrCtl_ITEM_CD(msgKey.getKeyValue("tOdrCtl_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("mCust_CUST_ANAME")) {
						key.setmCust_CUST_ANAME(msgKey.getKeyValue("mCust_CUST_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("tAnsDlvDate_REST_SHIP_ODR_QTY")) {
						key.settAnsDlvDate_REST_SHIP_ODR_QTY(msgKey.getKeyValue("tAnsDlvDate_REST_SHIP_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_TRANSPORT_TYP")) {
						key.settOdr_TRANSPORT_TYP(msgKey.getKeyValue("tOdr_TRANSPORT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_ODR_UNIT_PRICE")) {
						key.settOdr_ODR_UNIT_PRICE(msgKey.getKeyValue("tOdr_ODR_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_SPCL_PRICE_TYP")) {
						key.settOdr_SPCL_PRICE_TYP(msgKey.getKeyValue("tOdr_SPCL_PRICE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("tOdrCtl_CUST_CD")) {
						key.settOdrCtl_CUST_CD(msgKey.getKeyValue("tOdrCtl_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_PARTIAL_SHIP_INST_FLG")) {
						key.settOdr_PARTIAL_SHIP_INST_FLG(msgKey.getKeyValue("tOdr_PARTIAL_SHIP_INST_FLG"));
					}
					if(msgKeyType.containsKeyColumn("tAnsDlvDate_MODIFY_COUNT")) {
						key.settAnsDlvDate_MODIFY_COUNT(msgKey.getKeyValue("tAnsDlvDate_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("tITEM_NAME")) {
						key.settITEM_NAME(msgKey.getKeyValue("tITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("tSTOCK_UNIT")) {
						key.settSTOCK_UNIT(msgKey.getKeyValue("tSTOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("tUNIT_QTY_TYP")) {
						key.settUNIT_QTY_TYP(msgKey.getKeyValue("tUNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("tWH_NAME")) {
						key.settWH_NAME(msgKey.getKeyValue("tWH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("tSHIP_WH_CD")) {
						key.settSHIP_WH_CD(msgKey.getKeyValue("tSHIP_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("tCUST_CD")) {
						key.settCUST_CD(msgKey.getKeyValue("tCUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("tCUST_ITEM_NAME")) {
						key.settCUST_ITEM_NAME(msgKey.getKeyValue("tCUST_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("tCUST_ODR_NO")) {
						key.settCUST_ODR_NO(msgKey.getKeyValue("tCUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("g_JOB_ODR_CD")) {
						key.setg_JOB_ODR_CD(msgKey.getKeyValue("g_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("sysMyCompany_IN_COMPANYCD")) {
						key.setsysMyCompany_IN_COMPANYCD(msgKey.getKeyValue("sysMyCompany_IN_COMPANYCD"));
					}
					if(msgKeyType.containsKeyColumn("tAnsDlvDate_IN_ODRNO")) {
						key.settAnsDlvDate_IN_ODRNO(msgKey.getKeyValue("tAnsDlvDate_IN_ODRNO"));
					}
					if(msgKeyType.containsKeyColumn("tAnsDlvDate_IN_PARTDLVSEQNO")) {
						key.settAnsDlvDate_IN_PARTDLVSEQNO(msgKey.getKeyValue("tAnsDlvDate_IN_PARTDLVSEQNO"));
					}
					if(msgKeyType.containsKeyColumn("up_tAnsDlvDate_DESINATED_SHIP_DATE")) {
						key.setup_tAnsDlvDate_DESINATED_SHIP_DATE(msgKey.getKeyValue("up_tAnsDlvDate_DESINATED_SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("up_tAnsDlvDate_REST_SHIP_ODR_QTY")) {
						key.setup_tAnsDlvDate_REST_SHIP_ODR_QTY(msgKey.getKeyValue("up_tAnsDlvDate_REST_SHIP_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG")) {
						key.setup_tAnsDlvDate_SHIP_ODR_CMPLT_FLG(msgKey.getKeyValue("up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("up_tAnsDlvDate_IN_ODRNO")) {
						key.setup_tAnsDlvDate_IN_ODRNO(msgKey.getKeyValue("up_tAnsDlvDate_IN_ODRNO"));
					}
					if(msgKeyType.containsKeyColumn("up_tAnsDlvDate_IN_PARTDLVSEQNO")) {
						key.setup_tAnsDlvDate_IN_PARTDLVSEQNO(msgKey.getKeyValue("up_tAnsDlvDate_IN_PARTDLVSEQNO"));
					}
					if(msgKeyType.containsKeyColumn("tShipOdr_ODR_NO")) {
						key.settShipOdr_ODR_NO(msgKey.getKeyValue("tShipOdr_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("tShipOdr_PART_DLV_SEQ_NO")) {
						key.settShipOdr_PART_DLV_SEQ_NO(msgKey.getKeyValue("tShipOdr_PART_DLV_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("tShipOdr_SLIP_CD")) {
						key.settShipOdr_SLIP_CD(msgKey.getKeyValue("tShipOdr_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("tShipOdr_DESINATED_SHIP_DATE")) {
						key.settShipOdr_DESINATED_SHIP_DATE(msgKey.getKeyValue("tShipOdr_DESINATED_SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("tShipOdr_SHIP_QTY")) {
						key.settShipOdr_SHIP_QTY(msgKey.getKeyValue("tShipOdr_SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("tShipOdr_ALLCT_WH_CD")) {
						key.settShipOdr_ALLCT_WH_CD(msgKey.getKeyValue("tShipOdr_ALLCT_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("tShipOdr_CUST_NAME")) {
						key.settShipOdr_CUST_NAME(msgKey.getKeyValue("tShipOdr_CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("tShipOdr_CUST_ITEM_CD")) {
						key.settShipOdr_CUST_ITEM_CD(msgKey.getKeyValue("tShipOdr_CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("tShipOdr_ITEM_CD")) {
						key.settShipOdr_ITEM_CD(msgKey.getKeyValue("tShipOdr_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("tShipOdr_JOB_ODR_CD")) {
						key.settShipOdr_JOB_ODR_CD(msgKey.getKeyValue("tShipOdr_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("tShipOdrAnsDlvDate_REST_SHIP_ODR_QTY")) {
						key.settShipOdrAnsDlvDate_REST_SHIP_ODR_QTY(msgKey.getKeyValue("tShipOdrAnsDlvDate_REST_SHIP_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("tShipOdr_DEL_FLG")) {
						key.settShipOdr_DEL_FLG(msgKey.getKeyValue("tShipOdr_DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("tShipOdr_DIRECT_DLV_FLG")) {
						key.settShipOdr_DIRECT_DLV_FLG(msgKey.getKeyValue("tShipOdr_DIRECT_DLV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("tShipOdr_TRANSPORT_TYP")) {
						key.settShipOdr_TRANSPORT_TYP(msgKey.getKeyValue("tShipOdr_TRANSPORT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("tShipOdr_MODIFY_COUNT")) {
						key.settShipOdr_MODIFY_COUNT(msgKey.getKeyValue("tShipOdr_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("tDEPO_TRANSFER_PROC_FLG")) {
						key.settDEPO_TRANSFER_PROC_FLG(msgKey.getKeyValue("tDEPO_TRANSFER_PROC_FLG"));
					}
					if(msgKeyType.containsKeyColumn("tShipOdr_IN_SLIPCD")) {
						key.settShipOdr_IN_SLIPCD(msgKey.getKeyValue("tShipOdr_IN_SLIPCD"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_ODR_NO")) {
						key.setin_tShipOdr_ODR_NO(msgKey.getKeyValue("in_tShipOdr_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_PART_DLV_SEQ_NO")) {
						key.setin_tShipOdr_PART_DLV_SEQ_NO(msgKey.getKeyValue("in_tShipOdr_PART_DLV_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_SLIP_CD")) {
						key.setin_tShipOdr_SLIP_CD(msgKey.getKeyValue("in_tShipOdr_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_ITEM_CD")) {
						key.setin_tShipOdr_ITEM_CD(msgKey.getKeyValue("in_tShipOdr_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_CUST_ITEM_CD")) {
						key.setin_tShipOdr_CUST_ITEM_CD(msgKey.getKeyValue("in_tShipOdr_CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_CUST_ODR_NO")) {
						key.setin_tShipOdr_CUST_ODR_NO(msgKey.getKeyValue("in_tShipOdr_CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_CUST_CD")) {
						key.setin_tShipOdr_CUST_CD(msgKey.getKeyValue("in_tShipOdr_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_CUST_NAME")) {
						key.setin_tShipOdr_CUST_NAME(msgKey.getKeyValue("in_tShipOdr_CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_SHIP_ODR_ISS_PSN_CD")) {
						key.setin_tShipOdr_SHIP_ODR_ISS_PSN_CD(msgKey.getKeyValue("in_tShipOdr_SHIP_ODR_ISS_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_DLV_LOC_CD")) {
						key.setin_tShipOdr_DLV_LOC_CD(msgKey.getKeyValue("in_tShipOdr_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_DESINATED_SHIP_DATE")) {
						key.setin_tShipOdr_DESINATED_SHIP_DATE(msgKey.getKeyValue("in_tShipOdr_DESINATED_SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_SHIP_QTY")) {
						key.setin_tShipOdr_SHIP_QTY(msgKey.getKeyValue("in_tShipOdr_SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_UNIT_PRICE")) {
						key.setin_tShipOdr_UNIT_PRICE(msgKey.getKeyValue("in_tShipOdr_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_SHIP_ODR_AMOUNT")) {
						key.setin_tShipOdr_SHIP_ODR_AMOUNT(new Double(msgKey.getKeyValue("in_tShipOdr_SHIP_ODR_AMOUNT")));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_CURRNCY_CD")) {
						key.setin_tShipOdr_CURRNCY_CD(msgKey.getKeyValue("in_tShipOdr_CURRNCY_CD"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_PKG_UNIT_QTY")) {
						key.setin_tShipOdr_PKG_UNIT_QTY(msgKey.getKeyValue("in_tShipOdr_PKG_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_REMARKS")) {
						key.setin_tShipOdr_REMARKS(msgKey.getKeyValue("in_tShipOdr_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_ALLCT_WH_CD")) {
						key.setin_tShipOdr_ALLCT_WH_CD(msgKey.getKeyValue("in_tShipOdr_ALLCT_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_DEPO_TYP")) {
						key.setin_tShipOdr_DEPO_TYP(msgKey.getKeyValue("in_tShipOdr_DEPO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_ENTRY_TYP")) {
						key.setin_tShipOdr_ENTRY_TYP(msgKey.getKeyValue("in_tShipOdr_ENTRY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_PRINT_FLG")) {
						key.setin_tShipOdr_PRINT_FLG(msgKey.getKeyValue("in_tShipOdr_PRINT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_SHP_CMPLT_FLG")) {
						key.setin_tShipOdr_SHP_CMPLT_FLG(msgKey.getKeyValue("in_tShipOdr_SHP_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_DEL_FLG")) {
						key.setin_tShipOdr_DEL_FLG(msgKey.getKeyValue("in_tShipOdr_DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_TRANSPORT_CD")) {
						key.setin_tShipOdr_TRANSPORT_CD(msgKey.getKeyValue("in_tShipOdr_TRANSPORT_CD"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_DIRECT_DLV_FLG")) {
						key.setin_tShipOdr_DIRECT_DLV_FLG(msgKey.getKeyValue("in_tShipOdr_DIRECT_DLV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_CUST_CHRG_PSN_CD")) {
						key.setin_tShipOdr_CUST_CHRG_PSN_CD(msgKey.getKeyValue("in_tShipOdr_CUST_CHRG_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_UNIT_CD")) {
						key.setin_tShipOdr_UNIT_CD(msgKey.getKeyValue("in_tShipOdr_UNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_SCDL_DLV_DATE")) {
						key.setin_tShipOdr_SCDL_DLV_DATE(msgKey.getKeyValue("in_tShipOdr_SCDL_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_TRANSFER_WH_CD")) {
						key.setin_tShipOdr_TRANSFER_WH_CD(msgKey.getKeyValue("in_tShipOdr_TRANSFER_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_DLV_KEY_NO")) {
						key.setin_tShipOdr_DLV_KEY_NO(msgKey.getKeyValue("in_tShipOdr_DLV_KEY_NO"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES")) {
						key.setin_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES(new Double(msgKey.getKeyValue("in_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES")));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_SHIP_ODR_NO")) {
						key.setin_tShipOdr_SHIP_ODR_NO(msgKey.getKeyValue("in_tShipOdr_SHIP_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_JOB_ODR_CD")) {
						key.setin_tShipOdr_JOB_ODR_CD(msgKey.getKeyValue("in_tShipOdr_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("del_tShipOdr_IN_SLIPCD")) {
						key.setdel_tShipOdr_IN_SLIPCD(msgKey.getKeyValue("del_tShipOdr_IN_SLIPCD"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_ODR_NO")) {
						key.settOdr_ODR_NO(msgKey.getKeyValue("tOdr_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_ODR_TYP")) {
						key.settOdr_ODR_TYP(msgKey.getKeyValue("tOdr_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_ODR_CTL_NO")) {
						key.settOdr_ODR_CTL_NO(msgKey.getKeyValue("tOdr_ODR_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_CUST_ODR_NO")) {
						key.settOdr_CUST_ODR_NO(msgKey.getKeyValue("tOdr_CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_CUST_CHRG_ORG_CD")) {
						key.settOdr_CUST_CHRG_ORG_CD(msgKey.getKeyValue("tOdr_CUST_CHRG_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_CUST_CHRG_PSN_CD")) {
						key.settOdr_CUST_CHRG_PSN_CD(msgKey.getKeyValue("tOdr_CUST_CHRG_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_ODR_ACPT_ORG_CD")) {
						key.settOdr_ODR_ACPT_ORG_CD(msgKey.getKeyValue("tOdr_ODR_ACPT_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_ODR_ACPT_PSN_CD")) {
						key.settOdr_ODR_ACPT_PSN_CD(msgKey.getKeyValue("tOdr_ODR_ACPT_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_CURRNCY_CD")) {
						key.settOdr_CURRNCY_CD(msgKey.getKeyValue("tOdr_CURRNCY_CD"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_EXCH_TYP")) {
						key.settOdr_EXCH_TYP(msgKey.getKeyValue("tOdr_EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_DLV_LOC_CD")) {
						key.settOdr_DLV_LOC_CD(msgKey.getKeyValue("tOdr_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_DLV_LOC_CD_EIAJ")) {
						key.settOdr_DLV_LOC_CD_EIAJ(msgKey.getKeyValue("tOdr_DLV_LOC_CD_EIAJ"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_DLV_LOC_NAME")) {
						key.settOdr_DLV_LOC_NAME(msgKey.getKeyValue("tOdr_DLV_LOC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_DLV_LOC_NAME_KANJI")) {
						key.settOdr_DLV_LOC_NAME_KANJI(msgKey.getKeyValue("tOdr_DLV_LOC_NAME_KANJI"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_PRD_ODR_PLACE_CD")) {
						key.settOdr_PRD_ODR_PLACE_CD(msgKey.getKeyValue("tOdr_PRD_ODR_PLACE_CD"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_PART_DLV_COUNT")) {
						key.settOdr_PART_DLV_COUNT(msgKey.getKeyValue("tOdr_PART_DLV_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_DEPO_TYP")) {
						key.settOdr_DEPO_TYP(msgKey.getKeyValue("tOdr_DEPO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_DESINATED_DLV_DATE")) {
						key.settOdr_DESINATED_DLV_DATE(msgKey.getKeyValue("tOdr_DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_STD_DESINATED_RCV_DATE")) {
						key.settOdr_STD_DESINATED_RCV_DATE(msgKey.getKeyValue("tOdr_STD_DESINATED_RCV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_ODR_QTY")) {
						key.settOdr_ODR_QTY(msgKey.getKeyValue("tOdr_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_REMAIN_UNCONFIRM_ODR_QTY")) {
						key.settOdr_REMAIN_UNCONFIRM_ODR_QTY(msgKey.getKeyValue("tOdr_REMAIN_UNCONFIRM_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_CANCELED_UNCONFIRM_ODR_QTY")) {
						key.settOdr_CANCELED_UNCONFIRM_ODR_QTY(msgKey.getKeyValue("tOdr_CANCELED_UNCONFIRM_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_UNIT_CD")) {
						key.settOdr_UNIT_CD(msgKey.getKeyValue("tOdr_UNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_UNCONFIRM_ODR_BALANCE")) {
						key.settOdr_UNCONFIRM_ODR_BALANCE(msgKey.getKeyValue("tOdr_UNCONFIRM_ODR_BALANCE"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_ODR_AMOUNT")) {
						key.settOdr_ODR_AMOUNT(msgKey.getKeyValue("tOdr_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_ODR_AMOUNT_EXCH_RATES")) {
						key.settOdr_ODR_AMOUNT_EXCH_RATES(msgKey.getKeyValue("tOdr_ODR_AMOUNT_EXCH_RATES"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_TOTAL_SHIP_QTY")) {
						key.settOdr_TOTAL_SHIP_QTY(msgKey.getKeyValue("tOdr_TOTAL_SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_SHIP_AMOUNT")) {
						key.settOdr_SHIP_AMOUNT(msgKey.getKeyValue("tOdr_SHIP_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_SHIP_AMOUNT_EXCH_RATES")) {
						key.settOdr_SHIP_AMOUNT_EXCH_RATES(msgKey.getKeyValue("tOdr_SHIP_AMOUNT_EXCH_RATES"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_RETURN_PRICE")) {
						key.settOdr_RETURN_PRICE(msgKey.getKeyValue("tOdr_RETURN_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_RETURN_QTY")) {
						key.settOdr_RETURN_QTY(msgKey.getKeyValue("tOdr_RETURN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_RETURN_AMOUNT")) {
						key.settOdr_RETURN_AMOUNT(msgKey.getKeyValue("tOdr_RETURN_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_RETURN_AMOUNT_EXCH_RATES")) {
						key.settOdr_RETURN_AMOUNT_EXCH_RATES(msgKey.getKeyValue("tOdr_RETURN_AMOUNT_EXCH_RATES"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_ODR_CMPLT_FLG")) {
						key.settOdr_ODR_CMPLT_FLG(msgKey.getKeyValue("tOdr_ODR_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_ODR_CMPLT_DATE")) {
						key.settOdr_ODR_CMPLT_DATE(msgKey.getKeyValue("tOdr_ODR_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_CUS_DLV_CD")) {
						key.settOdr_CUS_DLV_CD(msgKey.getKeyValue("tOdr_CUS_DLV_CD"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_CUS_DLV_KEY_CD")) {
						key.settOdr_CUS_DLV_KEY_CD(msgKey.getKeyValue("tOdr_CUS_DLV_KEY_CD"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_PART_NAME")) {
						key.settOdr_PART_NAME(msgKey.getKeyValue("tOdr_PART_NAME"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_PKG_UNIT")) {
						key.settOdr_PKG_UNIT(msgKey.getKeyValue("tOdr_PKG_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_SLIP_PRICE_PRINT_TYP")) {
						key.settOdr_SLIP_PRICE_PRINT_TYP(msgKey.getKeyValue("tOdr_SLIP_PRICE_PRINT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_INSPC_TYP")) {
						key.settOdr_INSPC_TYP(msgKey.getKeyValue("tOdr_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_CLIENT_REMARK")) {
						key.settOdr_CLIENT_REMARK(msgKey.getKeyValue("tOdr_CLIENT_REMARK"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_CLIENT_REMARK_KANJI")) {
						key.settOdr_CLIENT_REMARK_KANJI(msgKey.getKeyValue("tOdr_CLIENT_REMARK_KANJI"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_CLIENT_BARCODE_INF")) {
						key.settOdr_CLIENT_BARCODE_INF(msgKey.getKeyValue("tOdr_CLIENT_BARCODE_INF"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_TRANSPORT_CD")) {
						key.settOdr_TRANSPORT_CD(msgKey.getKeyValue("tOdr_TRANSPORT_CD"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_TAX_APPLY_TYP")) {
						key.settOdr_TAX_APPLY_TYP(msgKey.getKeyValue("tOdr_TAX_APPLY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_TAX_CD")) {
						key.settOdr_TAX_CD(msgKey.getKeyValue("tOdr_TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_TAX_CALC_TYP")) {
						key.settOdr_TAX_CALC_TYP(msgKey.getKeyValue("tOdr_TAX_CALC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_REMARKS")) {
						key.settOdr_REMARKS(msgKey.getKeyValue("tOdr_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_ODR_ACPT_DATE")) {
						key.settOdr_ODR_ACPT_DATE(msgKey.getKeyValue("tOdr_ODR_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_SHIP_PLAN_REMAIN_QTY")) {
						key.settOdr_SHIP_PLAN_REMAIN_QTY(msgKey.getKeyValue("tOdr_SHIP_PLAN_REMAIN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_SHIP_PLAN_CMPLT_FLG")) {
						key.settOdr_SHIP_PLAN_CMPLT_FLG(msgKey.getKeyValue("tOdr_SHIP_PLAN_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG")) {
						key.settOdr_UNCONFIRMED_ODR_EFF_OVR_FLG(msgKey.getKeyValue("tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_IF_CTL_NO")) {
						key.settOdr_IF_CTL_NO(msgKey.getKeyValue("tOdr_IF_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_ENTRY_TYP")) {
						key.settOdr_ENTRY_TYP(msgKey.getKeyValue("tOdr_ENTRY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_BUYER_NAME")) {
						key.settOdr_BUYER_NAME(msgKey.getKeyValue("tOdr_BUYER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_PUCH_ODR_QTY_TOTAL")) {
						key.settOdr_PUCH_ODR_QTY_TOTAL(msgKey.getKeyValue("tOdr_PUCH_ODR_QTY_TOTAL"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_UNIT_CD_ORG")) {
						key.settOdr_UNIT_CD_ORG(msgKey.getKeyValue("tOdr_UNIT_CD_ORG"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_SHIP_CNT")) {
						key.settOdr_SHIP_CNT(msgKey.getKeyValue("tOdr_SHIP_CNT"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_CUR_CD")) {
						key.settOdr_CUR_CD(msgKey.getKeyValue("tOdr_CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_EXCH_TYP_R")) {
						key.settOdr_EXCH_TYP_R(msgKey.getKeyValue("tOdr_EXCH_TYP_R"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_IN_ODRNO")) {
						key.settOdr_IN_ODRNO(msgKey.getKeyValue("tOdr_IN_ODRNO"));
					}
					if(msgKeyType.containsKeyColumn("uptOdr_PART_DLV_COUNT")) {
						key.setuptOdr_PART_DLV_COUNT(msgKey.getKeyValue("uptOdr_PART_DLV_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("uptOdr_IN_ODRNO")) {
						key.setuptOdr_IN_ODRNO(msgKey.getKeyValue("uptOdr_IN_ODRNO"));
					}
					if(msgKeyType.containsKeyColumn("mItem_ITEM_CD")) {
						key.setmItem_ITEM_CD(msgKey.getKeyValue("mItem_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("mItem_ITEM_NAME")) {
						key.setmItem_ITEM_NAME(msgKey.getKeyValue("mItem_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("mItem_PRODUCT_TYP")) {
						key.setmItem_PRODUCT_TYP(msgKey.getKeyValue("mItem_PRODUCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("mItem_MRP_ODR_TYP")) {
						key.setmItem_MRP_ODR_TYP(msgKey.getKeyValue("mItem_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("mItem_DRAW_CD")) {
						key.setmItem_DRAW_CD(msgKey.getKeyValue("mItem_DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("mItem_SPEC")) {
						key.setmItem_SPEC(msgKey.getKeyValue("mItem_SPEC"));
					}
					if(msgKeyType.containsKeyColumn("mItem_HIGH_LEVEL_NO")) {
						key.setmItem_HIGH_LEVEL_NO(msgKey.getKeyValue("mItem_HIGH_LEVEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("mItem_OUTSIDE_TYP")) {
						key.setmItem_OUTSIDE_TYP(msgKey.getKeyValue("mItem_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("mItem_STOCK_UNIT_FLG")) {
						key.setmItem_STOCK_UNIT_FLG(msgKey.getKeyValue("mItem_STOCK_UNIT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("mItem_STOCK_UNIT")) {
						key.setmItem_STOCK_UNIT(msgKey.getKeyValue("mItem_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("mItem_PKG_UNIT")) {
						key.setmItem_PKG_UNIT(msgKey.getKeyValue("mItem_PKG_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("mItem_PKG_UNIT_QTY")) {
						key.setmItem_PKG_UNIT_QTY(msgKey.getKeyValue("mItem_PKG_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("mItem_UNIT_QTY_TYP")) {
						key.setmItem_UNIT_QTY_TYP(msgKey.getKeyValue("mItem_UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("mItem_ODR_LT")) {
						key.setmItem_ODR_LT(msgKey.getKeyValue("mItem_ODR_LT"));
					}
					if(msgKeyType.containsKeyColumn("mItem_FIXED_LT")) {
						key.setmItem_FIXED_LT(msgKey.getKeyValue("mItem_FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("mItem_PROP_LT")) {
						key.setmItem_PROP_LT(msgKey.getKeyValue("mItem_PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("mItem_SAFETY_LT")) {
						key.setmItem_SAFETY_LT(msgKey.getKeyValue("mItem_SAFETY_LT"));
					}
					if(msgKeyType.containsKeyColumn("mItem_ISSUE_LT")) {
						key.setmItem_ISSUE_LT(msgKey.getKeyValue("mItem_ISSUE_LT"));
					}
					if(msgKeyType.containsKeyColumn("mItem_PROP_LOT_SIZE")) {
						key.setmItem_PROP_LOT_SIZE(msgKey.getKeyValue("mItem_PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("mItem_ITEM_SPOIL")) {
						key.setmItem_ITEM_SPOIL(msgKey.getKeyValue("mItem_ITEM_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("mItem_SAFETY_STOCK")) {
						key.setmItem_SAFETY_STOCK(msgKey.getKeyValue("mItem_SAFETY_STOCK"));
					}
					if(msgKeyType.containsKeyColumn("mItem_LOT_SIZING_TYP")) {
						key.setmItem_LOT_SIZING_TYP(msgKey.getKeyValue("mItem_LOT_SIZING_TYP"));
					}
					if(msgKeyType.containsKeyColumn("mItem_MAX_PERIOD")) {
						key.setmItem_MAX_PERIOD(msgKey.getKeyValue("mItem_MAX_PERIOD"));
					}
					if(msgKeyType.containsKeyColumn("mItem_MAX_ODR_QTY")) {
						key.setmItem_MAX_ODR_QTY(msgKey.getKeyValue("mItem_MAX_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("mItem_ODR_POINT")) {
						key.setmItem_ODR_POINT(msgKey.getKeyValue("mItem_ODR_POINT"));
					}
					if(msgKeyType.containsKeyColumn("mItem_FIXED_ODR_QTY")) {
						key.setmItem_FIXED_ODR_QTY(msgKey.getKeyValue("mItem_FIXED_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("mItem_MIN_ODR_QTY")) {
						key.setmItem_MIN_ODR_QTY(msgKey.getKeyValue("mItem_MIN_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("mItem_MUL_ODR_QTY")) {
						key.setmItem_MUL_ODR_QTY(msgKey.getKeyValue("mItem_MUL_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("mItem_ISSUE_TYP")) {
						key.setmItem_ISSUE_TYP(msgKey.getKeyValue("mItem_ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("mItem_MPS_FLG")) {
						key.setmItem_MPS_FLG(msgKey.getKeyValue("mItem_MPS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("mItem_ACPT_INSPC_TYP")) {
						key.setmItem_ACPT_INSPC_TYP(msgKey.getKeyValue("mItem_ACPT_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("mItem_CLASIFICATION_CD")) {
						key.setmItem_CLASIFICATION_CD(msgKey.getKeyValue("mItem_CLASIFICATION_CD"));
					}
					if(msgKeyType.containsKeyColumn("mItem_UNIT_WEIGHT")) {
						key.setmItem_UNIT_WEIGHT(msgKey.getKeyValue("mItem_UNIT_WEIGHT"));
					}
					if(msgKeyType.containsKeyColumn("mItem_ABC_TYP")) {
						key.setmItem_ABC_TYP(msgKey.getKeyValue("mItem_ABC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("mItem_OPR_RSLT_TYP")) {
						key.setmItem_OPR_RSLT_TYP(msgKey.getKeyValue("mItem_OPR_RSLT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("mItem_SPL_ITEM_TYP")) {
						key.setmItem_SPL_ITEM_TYP(msgKey.getKeyValue("mItem_SPL_ITEM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("mItem_TAX_CD")) {
						key.setmItem_TAX_CD(msgKey.getKeyValue("mItem_TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("mItem_IN_ITEMCD")) {
						key.setmItem_IN_ITEMCD(msgKey.getKeyValue("mItem_IN_ITEMCD"));
					}
					if(msgKeyType.containsKeyColumn("tOdrCtl_ODR_CTL_NO")) {
						key.settOdrCtl_ODR_CTL_NO(msgKey.getKeyValue("tOdrCtl_ODR_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("tOdrCtl_CUST_ITEM_NAME")) {
						key.settOdrCtl_CUST_ITEM_NAME(msgKey.getKeyValue("tOdrCtl_CUST_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("tOdrCtl_ITEM_NAME")) {
						key.settOdrCtl_ITEM_NAME(msgKey.getKeyValue("tOdrCtl_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("tOdrCtl_IN_ODRCTLNO")) {
						key.settOdrCtl_IN_ODRCTLNO(msgKey.getKeyValue("tOdrCtl_IN_ODRCTLNO"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_SLIP_CD")) {
						key.setin_tShipSlip_SLIP_CD(msgKey.getKeyValue("in_tShipSlip_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_ITEM_CD")) {
						key.setin_tShipSlip_ITEM_CD(msgKey.getKeyValue("in_tShipSlip_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_CUST_ITEM_CD")) {
						key.setin_tShipSlip_CUST_ITEM_CD(msgKey.getKeyValue("in_tShipSlip_CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_PART_NAME")) {
						key.setin_tShipSlip_PART_NAME(msgKey.getKeyValue("in_tShipSlip_PART_NAME"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_CUST_ODR_NO")) {
						key.setin_tShipSlip_CUST_ODR_NO(msgKey.getKeyValue("in_tShipSlip_CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_CUST_CD")) {
						key.setin_tShipSlip_CUST_CD(msgKey.getKeyValue("in_tShipSlip_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_CUST_NAME")) {
						key.setin_tShipSlip_CUST_NAME(msgKey.getKeyValue("in_tShipSlip_CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_DLV_LOC_CD")) {
						key.setin_tShipSlip_DLV_LOC_CD(msgKey.getKeyValue("in_tShipSlip_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_DLV_LOC_NAME_KANJI")) {
						key.setin_tShipSlip_DLV_LOC_NAME_KANJI(msgKey.getKeyValue("in_tShipSlip_DLV_LOC_NAME_KANJI"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_CUS_DLV_KEY_CD")) {
						key.setin_tShipSlip_CUS_DLV_KEY_CD(msgKey.getKeyValue("in_tShipSlip_CUS_DLV_KEY_CD"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_DESINATED_SHIP_DATE")) {
						key.setin_tShipSlip_DESINATED_SHIP_DATE(msgKey.getKeyValue("in_tShipSlip_DESINATED_SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_DESINATED_DLV_DATE")) {
						key.setin_tShipSlip_DESINATED_DLV_DATE(msgKey.getKeyValue("in_tShipSlip_DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_SCDL_DLV_DATE")) {
						key.setin_tShipSlip_SCDL_DLV_DATE(msgKey.getKeyValue("in_tShipSlip_SCDL_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_SHIP_ODR_QTY")) {
						key.setin_tShipSlip_SHIP_ODR_QTY(msgKey.getKeyValue("in_tShipSlip_SHIP_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_UNIT_CD")) {
						key.setin_tShipSlip_UNIT_CD(msgKey.getKeyValue("in_tShipSlip_UNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_UNIT_PRICE")) {
						key.setin_tShipSlip_UNIT_PRICE(msgKey.getKeyValue("in_tShipSlip_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_SHIP_ODR_AMOUNT")) {
						key.setin_tShipSlip_SHIP_ODR_AMOUNT(msgKey.getKeyValue("in_tShipSlip_SHIP_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_TAX_AMOUNT")) {
						key.setin_tShipSlip_TAX_AMOUNT(msgKey.getKeyValue("in_tShipSlip_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_INSPC_TYP")) {
						key.setin_tShipSlip_INSPC_TYP(msgKey.getKeyValue("in_tShipSlip_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_CLIENT_REMARK_KANJI")) {
						key.setin_tShipSlip_CLIENT_REMARK_KANJI(msgKey.getKeyValue("in_tShipSlip_CLIENT_REMARK_KANJI"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_CLIENT_BARCODE_INF")) {
						key.setin_tShipSlip_CLIENT_BARCODE_INF(msgKey.getKeyValue("in_tShipSlip_CLIENT_BARCODE_INF"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_PRINT_FLG")) {
						key.setin_tShipSlip_PRINT_FLG(msgKey.getKeyValue("in_tShipSlip_PRINT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_DEL_FLG")) {
						key.setin_tShipSlip_DEL_FLG(msgKey.getKeyValue("in_tShipSlip_DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_BUYER_NAME")) {
						key.setin_tShipSlip_BUYER_NAME(msgKey.getKeyValue("in_tShipSlip_BUYER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_PUCH_ODR_QTY_TOTAL")) {
						key.setin_tShipSlip_PUCH_ODR_QTY_TOTAL(msgKey.getKeyValue("in_tShipSlip_PUCH_ODR_QTY_TOTAL"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_DLV_ODR_QTY")) {
						key.setin_tShipSlip_DLV_ODR_QTY(msgKey.getKeyValue("in_tShipSlip_DLV_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_SHIP_ODR_AMOUNT_TAX")) {
						key.setin_tShipSlip_SHIP_ODR_AMOUNT_TAX(msgKey.getKeyValue("in_tShipSlip_SHIP_ODR_AMOUNT_TAX"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT")) {
						key.setin_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT(msgKey.getKeyValue("in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT")) {
						key.setin_tShipSlip_INTERNAL_TAX_SALES_AMOUNT(msgKey.getKeyValue("in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_TAXFREE_SALES_AMOUNT")) {
						key.setin_tShipSlip_TAXFREE_SALES_AMOUNT(msgKey.getKeyValue("in_tShipSlip_TAXFREE_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_TAX_CREDIT_SALES_AMOUNT")) {
						key.setin_tShipSlip_TAX_CREDIT_SALES_AMOUNT(msgKey.getKeyValue("in_tShipSlip_TAX_CREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_EXTERNAL_TAX_AMOUNT")) {
						key.setin_tShipSlip_EXTERNAL_TAX_AMOUNT(msgKey.getKeyValue("in_tShipSlip_EXTERNAL_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_INTERNAL_TAX_AMOUNT")) {
						key.setin_tShipSlip_INTERNAL_TAX_AMOUNT(msgKey.getKeyValue("in_tShipSlip_INTERNAL_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_TAX_AMOUNT_1")) {
						key.setin_tShipSlip_TAX_AMOUNT_1(msgKey.getKeyValue("in_tShipSlip_TAX_AMOUNT_1"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_TAX_AMOUNT_2")) {
						key.setin_tShipSlip_TAX_AMOUNT_2(msgKey.getKeyValue("in_tShipSlip_TAX_AMOUNT_2"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_TAX_AMOUNT_3")) {
						key.setin_tShipSlip_TAX_AMOUNT_3(msgKey.getKeyValue("in_tShipSlip_TAX_AMOUNT_3"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT")) {
						key.setin_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT(msgKey.getKeyValue("in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("del_tShipSlip_IN_SLIPCD")) {
						key.setdel_tShipSlip_IN_SLIPCD(msgKey.getKeyValue("del_tShipSlip_IN_SLIPCD"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_COMPANY_CD")) {
						key.setmCustBase_COMPANY_CD(msgKey.getKeyValue("mCustBase_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_CUST_CD")) {
						key.setmCustBase_CUST_CD(msgKey.getKeyValue("mCustBase_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_DLV_LOC_CD")) {
						key.setmCustBase_DLV_LOC_CD(msgKey.getKeyValue("mCustBase_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_DLV_LOC_NAME")) {
						key.setmCustBase_DLV_LOC_NAME(msgKey.getKeyValue("mCustBase_DLV_LOC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_DLV_LOC_KNAME")) {
						key.setmCustBase_DLV_LOC_KNAME(msgKey.getKeyValue("mCustBase_DLV_LOC_KNAME"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_DLV_LOC_ENAME")) {
						key.setmCustBase_DLV_LOC_ENAME(msgKey.getKeyValue("mCustBase_DLV_LOC_ENAME"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_ZIP_CD")) {
						key.setmCustBase_ZIP_CD(msgKey.getKeyValue("mCustBase_ZIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_ADDRESS_1")) {
						key.setmCustBase_ADDRESS_1(msgKey.getKeyValue("mCustBase_ADDRESS_1"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_ADDRESS_2")) {
						key.setmCustBase_ADDRESS_2(msgKey.getKeyValue("mCustBase_ADDRESS_2"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_ADDRESS_K_1")) {
						key.setmCustBase_ADDRESS_K_1(msgKey.getKeyValue("mCustBase_ADDRESS_K_1"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_ADDRESS_K_2")) {
						key.setmCustBase_ADDRESS_K_2(msgKey.getKeyValue("mCustBase_ADDRESS_K_2"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_TEL")) {
						key.setmCustBase_TEL(msgKey.getKeyValue("mCustBase_TEL"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_FAX")) {
						key.setmCustBase_FAX(msgKey.getKeyValue("mCustBase_FAX"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_SHIP_WH_CD")) {
						key.setmCustBase_SHIP_WH_CD(msgKey.getKeyValue("mCustBase_SHIP_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_TRANSPORT_CD")) {
						key.setmCustBase_TRANSPORT_CD(msgKey.getKeyValue("mCustBase_TRANSPORT_CD"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_TRANSPORT_NAME")) {
						key.setmCustBase_TRANSPORT_NAME(msgKey.getKeyValue("mCustBase_TRANSPORT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_TRANSPORT_LT")) {
						key.setmCustBase_TRANSPORT_LT(msgKey.getKeyValue("mCustBase_TRANSPORT_LT"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_CAL_NO")) {
						key.setmCustBase_CAL_NO(msgKey.getKeyValue("mCustBase_CAL_NO"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_TRANSPORT_TYP")) {
						key.setmCustBase_TRANSPORT_TYP(msgKey.getKeyValue("mCustBase_TRANSPORT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_DLV_START_TIME")) {
						key.setmCustBase_DLV_START_TIME(msgKey.getKeyValue("mCustBase_DLV_START_TIME"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_DLV_END_TIME")) {
						key.setmCustBase_DLV_END_TIME(msgKey.getKeyValue("mCustBase_DLV_END_TIME"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_AREA_CLASS_TYP1")) {
						key.setmCustBase_AREA_CLASS_TYP1(msgKey.getKeyValue("mCustBase_AREA_CLASS_TYP1"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_AREA_CLASS_1")) {
						key.setmCustBase_AREA_CLASS_1(msgKey.getKeyValue("mCustBase_AREA_CLASS_1"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_AREA_CLASS_TYP2")) {
						key.setmCustBase_AREA_CLASS_TYP2(msgKey.getKeyValue("mCustBase_AREA_CLASS_TYP2"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_AREA_CLASS_2")) {
						key.setmCustBase_AREA_CLASS_2(msgKey.getKeyValue("mCustBase_AREA_CLASS_2"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_AREA_CLASS_TYP3")) {
						key.setmCustBase_AREA_CLASS_TYP3(msgKey.getKeyValue("mCustBase_AREA_CLASS_TYP3"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_AREA_CLASS_3")) {
						key.setmCustBase_AREA_CLASS_3(msgKey.getKeyValue("mCustBase_AREA_CLASS_3"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_REMARKS_1")) {
						key.setmCustBase_REMARKS_1(msgKey.getKeyValue("mCustBase_REMARKS_1"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_REMARKS_2")) {
						key.setmCustBase_REMARKS_2(msgKey.getKeyValue("mCustBase_REMARKS_2"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_REMARKS_3")) {
						key.setmCustBase_REMARKS_3(msgKey.getKeyValue("mCustBase_REMARKS_3"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_DEPO_WH_CD")) {
						key.setmCustBase_DEPO_WH_CD(msgKey.getKeyValue("mCustBase_DEPO_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_IN_COMPANYCD")) {
						key.setmCustBase_IN_COMPANYCD(msgKey.getKeyValue("mCustBase_IN_COMPANYCD"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_IN_CUSTCD")) {
						key.setmCustBase_IN_CUSTCD(msgKey.getKeyValue("mCustBase_IN_CUSTCD"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_IN_DLVLOCCD")) {
						key.setmCustBase_IN_DLVLOCCD(msgKey.getKeyValue("mCustBase_IN_DLVLOCCD"));
					}
					if(msgKeyType.containsKeyColumn("mCust_COMPANY_CD")) {
						key.setmCust_COMPANY_CD(msgKey.getKeyValue("mCust_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("mCust_CUST_CD")) {
						key.setmCust_CUST_CD(msgKey.getKeyValue("mCust_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("mCust_CUST_NAME")) {
						key.setmCust_CUST_NAME(msgKey.getKeyValue("mCust_CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("mCust_CUST_KNAME")) {
						key.setmCust_CUST_KNAME(msgKey.getKeyValue("mCust_CUST_KNAME"));
					}
					if(msgKeyType.containsKeyColumn("mCust_OWN_ORG_CD")) {
						key.setmCust_OWN_ORG_CD(msgKey.getKeyValue("mCust_OWN_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("mCust_OWN_PERSON_CD")) {
						key.setmCust_OWN_PERSON_CD(msgKey.getKeyValue("mCust_OWN_PERSON_CD"));
					}
					if(msgKeyType.containsKeyColumn("mCust_CUR_CD")) {
						key.setmCust_CUR_CD(msgKey.getKeyValue("mCust_CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("mCust_EXCH_TYP")) {
						key.setmCust_EXCH_TYP(msgKey.getKeyValue("mCust_EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("mCust_TAX_APPLY_TYP")) {
						key.setmCust_TAX_APPLY_TYP(msgKey.getKeyValue("mCust_TAX_APPLY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("mCust_TAX_CD")) {
						key.setmCust_TAX_CD(msgKey.getKeyValue("mCust_TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("mCust_TAX_CALC_TYP")) {
						key.setmCust_TAX_CALC_TYP(msgKey.getKeyValue("mCust_TAX_CALC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("mCust_PRICE_ROUND_TYP")) {
						key.setmCust_PRICE_ROUND_TYP(msgKey.getKeyValue("mCust_PRICE_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("mCust_DETAIL_ROUND_TYP")) {
						key.setmCust_DETAIL_ROUND_TYP(msgKey.getKeyValue("mCust_DETAIL_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("mCust_UNCONFIRM_ODR_EFF_PRIOD")) {
						key.setmCust_UNCONFIRM_ODR_EFF_PRIOD(msgKey.getKeyValue("mCust_UNCONFIRM_ODR_EFF_PRIOD"));
					}
					if(msgKeyType.containsKeyColumn("mCust_UNCONFIRM_ODR_EFF_TERM_FLG")) {
						key.setmCust_UNCONFIRM_ODR_EFF_TERM_FLG(msgKey.getKeyValue("mCust_UNCONFIRM_ODR_EFF_TERM_FLG"));
					}
					if(msgKeyType.containsKeyColumn("mCust_EDI_CUST_VEND_CD")) {
						key.setmCust_EDI_CUST_VEND_CD(msgKey.getKeyValue("mCust_EDI_CUST_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("mCust_PARTIAL_SHIP_INST_FLG")) {
						key.setmCust_PARTIAL_SHIP_INST_FLG(msgKey.getKeyValue("mCust_PARTIAL_SHIP_INST_FLG"));
					}
					if(msgKeyType.containsKeyColumn("mCust_DEPO_TYP")) {
						key.setmCust_DEPO_TYP(msgKey.getKeyValue("mCust_DEPO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("mCust_INSPC_ACPT_TYP")) {
						key.setmCust_INSPC_ACPT_TYP(msgKey.getKeyValue("mCust_INSPC_ACPT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("mCust_IN_COMPANYCD")) {
						key.setmCust_IN_COMPANYCD(msgKey.getKeyValue("mCust_IN_COMPANYCD"));
					}
					if(msgKeyType.containsKeyColumn("mCust_IN_CUSTCD")) {
						key.setmCust_IN_CUSTCD(msgKey.getKeyValue("mCust_IN_CUSTCD"));
					}
					if(msgKeyType.containsKeyColumn("tori_tAnsDlvDate_REST_SHIP_ODR_QTY")) {
						key.settori_tAnsDlvDate_REST_SHIP_ODR_QTY(msgKey.getKeyValue("tori_tAnsDlvDate_REST_SHIP_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG")) {
						key.settori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG(msgKey.getKeyValue("tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("tori_tAnsDlvDate_IN_ODRNO")) {
						key.settori_tAnsDlvDate_IN_ODRNO(msgKey.getKeyValue("tori_tAnsDlvDate_IN_ODRNO"));
					}
					if(msgKeyType.containsKeyColumn("tori_tAnsDlvDate_IN_PARTDLVSEQNO")) {
						key.settori_tAnsDlvDate_IN_PARTDLVSEQNO(msgKey.getKeyValue("tori_tAnsDlvDate_IN_PARTDLVSEQNO"));
					}
					if(msgKeyType.containsKeyColumn("chkisWhCd_WH_CD")) {
						key.setchkisWhCd_WH_CD(msgKey.getKeyValue("chkisWhCd_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("chkisWhCd_WH_TYP")) {
						key.setchkisWhCd_WH_TYP(msgKey.getKeyValue("chkisWhCd_WH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("chkisWhCd_ITEM_CD")) {
						key.setchkisWhCd_ITEM_CD(msgKey.getKeyValue("chkisWhCd_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("chkisWhCd_PBL_SHIP_QTY")) {
						key.setchkisWhCd_PBL_SHIP_QTY(msgKey.getKeyValue("chkisWhCd_PBL_SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("chkisWhCd_IN_ITEMCD")) {
						key.setchkisWhCd_IN_ITEMCD(msgKey.getKeyValue("chkisWhCd_IN_ITEMCD"));
					}
					if(msgKeyType.containsKeyColumn("chkisWhCd_IN_WHCD")) {
						key.setchkisWhCd_IN_WHCD(msgKey.getKeyValue("chkisWhCd_IN_WHCD"));
					}
					if(msgKeyType.containsKeyColumn("mUnitCost_UNIT_COST")) {
						key.setmUnitCost_UNIT_COST(msgKey.getKeyValue("mUnitCost_UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("mUnitCost_EFF_PHASE_IN_DATE")) {
						key.setmUnitCost_EFF_PHASE_IN_DATE(msgKey.getKeyValue("mUnitCost_EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("mUnitCost_IN_COMPANYCD")) {
						key.setmUnitCost_IN_COMPANYCD(msgKey.getKeyValue("mUnitCost_IN_COMPANYCD"));
					}
					if(msgKeyType.containsKeyColumn("mUnitCost_IN_CUSTCD")) {
						key.setmUnitCost_IN_CUSTCD(msgKey.getKeyValue("mUnitCost_IN_CUSTCD"));
					}
					if(msgKeyType.containsKeyColumn("mUnitCost_IN_ITEMCD")) {
						key.setmUnitCost_IN_ITEMCD(msgKey.getKeyValue("mUnitCost_IN_ITEMCD"));
					}
					if(msgKeyType.containsKeyColumn("mUnitCost_IN_EFFPHASEINDATE")) {
						key.setmUnitCost_IN_EFFPHASEINDATE(msgKey.getKeyValue("mUnitCost_IN_EFFPHASEINDATE"));
					}
					if(msgKeyType.containsKeyColumn("mWhWH_CD")) {
						key.setmWhWH_CD(msgKey.getKeyValue("mWhWH_CD"));
					}
					if(msgKeyType.containsKeyColumn("mWhWH_NAME")) {
						key.setmWhWH_NAME(msgKey.getKeyValue("mWhWH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("strTaxTAX_KBN")) {
						key.setstrTaxTAX_KBN(msgKey.getKeyValue("strTaxTAX_KBN"));
					}
					if(msgKeyType.containsKeyColumn("strTaxOLD_TAX_1")) {
						key.setstrTaxOLD_TAX_1(msgKey.getKeyValue("strTaxOLD_TAX_1"));
					}
					if(msgKeyType.containsKeyColumn("strTaxOLD_TAX_2")) {
						key.setstrTaxOLD_TAX_2(msgKey.getKeyValue("strTaxOLD_TAX_2"));
					}
					if(msgKeyType.containsKeyColumn("strTaxOLD_TAX_3")) {
						key.setstrTaxOLD_TAX_3(msgKey.getKeyValue("strTaxOLD_TAX_3"));
					}
					if(msgKeyType.containsKeyColumn("strTaxNEW_TAX_1")) {
						key.setstrTaxNEW_TAX_1(msgKey.getKeyValue("strTaxNEW_TAX_1"));
					}
					if(msgKeyType.containsKeyColumn("strTaxNEW_TAX_2")) {
						key.setstrTaxNEW_TAX_2(msgKey.getKeyValue("strTaxNEW_TAX_2"));
					}
					if(msgKeyType.containsKeyColumn("strTaxNEW_TAX_3")) {
						key.setstrTaxNEW_TAX_3(msgKey.getKeyValue("strTaxNEW_TAX_3"));
					}
					if(msgKeyType.containsKeyColumn("strTaxSTART_DATE")) {
						key.setstrTaxSTART_DATE(msgKey.getKeyValue("strTaxSTART_DATE"));
					}
					if(msgKeyType.containsKeyColumn("strTaxROUND_TYP")) {
						key.setstrTaxROUND_TYP(msgKey.getKeyValue("strTaxROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("strTaxIN_COMPANYCD")) {
						key.setstrTaxIN_COMPANYCD(msgKey.getKeyValue("strTaxIN_COMPANYCD"));
					}
					if(msgKeyType.containsKeyColumn("strTaxIN_CUSTCD")) {
						key.setstrTaxIN_CUSTCD(msgKey.getKeyValue("strTaxIN_CUSTCD"));
					}
					if(msgKeyType.containsKeyColumn("g_CUST_ITEM_CD")) {
						key.setg_CUST_ITEM_CD(msgKey.getKeyValue("g_CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("strYotaku_WH_CD")) {
						key.setstrYotaku_WH_CD(msgKey.getKeyValue("strYotaku_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("strYotaku_IN_WH_TYP")) {
						key.setstrYotaku_IN_WH_TYP(msgKey.getKeyValue("strYotaku_IN_WH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("strSYUKA_LT")) {
						key.setstrSYUKA_LT(msgKey.getKeyValue("strSYUKA_LT"));
					}
					if(msgKeyType.containsKeyColumn("chkisinWhCd_WH_CD")) {
						key.setchkisinWhCd_WH_CD(msgKey.getKeyValue("chkisinWhCd_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("chkisinWhCd_WH_TYP")) {
						key.setchkisinWhCd_WH_TYP(msgKey.getKeyValue("chkisinWhCd_WH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("chkisinWhCd_WH_NAME")) {
						key.setchkisinWhCd_WH_NAME(msgKey.getKeyValue("chkisinWhCd_WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("chkis_IN_WHCD")) {
						key.setchkis_IN_WHCD(msgKey.getKeyValue("chkis_IN_WHCD"));
					}
					if(msgKeyType.containsKeyColumn("uptOdr_SHIP_CNT")) {
						key.setuptOdr_SHIP_CNT(msgKey.getKeyValue("uptOdr_SHIP_CNT"));
					}
					if(msgKeyType.containsKeyColumn("tHOLIDAY_FLG")) {
						key.settHOLIDAY_FLG(msgKey.getKeyValue("tHOLIDAY_FLG"));
					}
					if(msgKeyType.containsKeyColumn("tWH_CD")) {
						key.settWH_CD(msgKey.getKeyValue("tWH_CD"));
					}
					if(msgKeyType.containsKeyColumn("tCAL_DATE")) {
						key.settCAL_DATE(msgKey.getKeyValue("tCAL_DATE"));
					}
					if(msgKeyType.containsKeyColumn("tDECIMAL_FIG")) {
						key.settDECIMAL_FIG(msgKey.getKeyValue("tDECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("tCUR_CD")) {
						key.settCUR_CD(msgKey.getKeyValue("tCUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("chkisWhCd_JOB_ODR_CD")) {
						key.setchkisWhCd_JOB_ODR_CD(msgKey.getKeyValue("chkisWhCd_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("serTJobOdr_JOB_ODR_CD")) {
						key.setserTJobOdr_JOB_ODR_CD(msgKey.getKeyValue("serTJobOdr_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("serTJobOdr_ITEM_CD")) {
						key.setserTJobOdr_ITEM_CD(msgKey.getKeyValue("serTJobOdr_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("tUnShipList_ACPT_ODR_CD")) {
						key.settUnShipList_ACPT_ODR_CD(msgKey.getKeyValue("tUnShipList_ACPT_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("tUnShipList_PART_DLV_SEQ_NO")) {
						key.settUnShipList_PART_DLV_SEQ_NO(msgKey.getKeyValue("tUnShipList_PART_DLV_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("strTAX_CD")) {
						key.setstrTAX_CD(msgKey.getKeyValue("strTAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("selMODIFY_COUNT")) {
						key.setselMODIFY_COUNT(msgKey.getKeyValue("selMODIFY_COUNT"));
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
